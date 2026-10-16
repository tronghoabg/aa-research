param(
    [switch]$NoWatchdog
)

$ErrorActionPreference = 'Stop'

# Share the standard ADB daemon with Android Studio and install scripts. A
# private port caused two ADB servers to repeatedly kill/reset each other.
Remove-Item Env:ANDROID_ADB_SERVER_PORT -ErrorAction SilentlyContinue
$adb = 'C:\Users\trong\AppData\Local\Android\Sdk\platform-tools\adb.exe'
$dhu = 'C:\Users\trong\AppData\Local\Android\Sdk\extras\google\auto\desktop-head-unit.exe'
$dhuDirectory = Split-Path -Parent $dhu
$dhuPort = 5277
$adbTcpPort = 5555
$maxRestarts = 8
$serverRecovery = 'D:\AA\Fermata\restart-aa-headunit-server.ps1'
$xiaomiUsbSerial = 'c3316015'
$xiaomiWifiSerial = '192.168.50.29:5555'
$instanceMutex = New-Object System.Threading.Mutex($false, 'Global\CarWeb.AndroidAuto.DHU')
$ownsMutex = $false
try { $ownsMutex = $instanceMutex.WaitOne(0) } catch [System.Threading.AbandonedMutexException] { $ownsMutex = $true }
if (-not $ownsMutex) {
    Write-Host 'DHU watchdog da chay. Khong mo them phien thu hai.' -ForegroundColor Yellow
    exit 0
}

$script:cleanup = {
    if ($ownsMutex) { try { $instanceMutex.ReleaseMutex() } catch {} }
    $instanceMutex.Dispose()
}
Register-EngineEvent PowerShell.Exiting -Action $script:cleanup | Out-Null

function Get-OnlineDevices {
    @(& $adb devices 2>$null) |
        Select-String '^([^\s]+)\s+device$' |
        ForEach-Object { $_.Matches[0].Groups[1].Value }
}

function Test-Device([string]$Serial) {
    if (-not $Serial) { return $false }
    $state = & $adb -s $Serial get-state 2>$null
    return ($LASTEXITCODE -eq 0 -and $state -contains 'device')
}

function Get-UsbDevice {
    if (Test-Device $xiaomiUsbSerial) { return $xiaomiUsbSerial }
    return $null
}

function Get-WifiAddress([string]$UsbSerial) {
    if (-not (Test-Device $UsbSerial)) { return $null }
    $addresses = & $adb -s $UsbSerial shell "ip -o -4 addr show wlan0" 2>$null
    $match = [regex]::Match(($addresses -join ' '), '\binet\s+(\d+\.\d+\.\d+\.\d+)/')
    if ($match.Success) { return $match.Groups[1].Value }
    return $null
}

function Test-HeadUnitServer([string]$Serial) {
    if (-not (Test-Device $Serial)) { return $false }
    $listeners = & $adb -s $Serial shell "ss -ltn 2>/dev/null" 2>$null
    return (($listeners -join "`n") -match ":$dhuPort\b")
}

function Get-StableTransport {
	$usb = Get-UsbDevice
	# This is the USB launcher: use the cable transport whenever it is present.
	# It is more stable and avoids forwarding DHU through a stale Wi-Fi address.
	if ($usb) { return $usb }

	& $adb connect $xiaomiWifiSerial 2>$null | Out-Null
	if (Test-Device $xiaomiWifiSerial) { return $xiaomiWifiSerial }
	throw "Khong tim thay Xiaomi ($xiaomiUsbSerial / $xiaomiWifiSerial)."
}

function Set-DhuForward([string]$Serial) {
    # Port forwarding belongs to a specific ADB transport and disappears when it resets.
    & $adb -s $Serial forward --remove "tcp:$dhuPort" 2>$null | Out-Null
    & $adb -s $Serial forward "tcp:$dhuPort" "tcp:$dhuPort" 2>$null | Out-Null
    if ($LASTEXITCODE -ne 0) { throw "Khong tao duoc DHU forward qua $Serial." }
}

function Repair-HeadUnitServer([string]$Serial) {
    if (Test-HeadUnitServer $Serial) { return $true }
    if (-not (Test-Path -LiteralPath $serverRecovery)) { return $false }

    Write-Host 'Head Unit Server dang tat; script tu mo lai tren dien thoai...' -ForegroundColor Yellow
    try {
        & $serverRecovery -Serial $Serial
    }
    catch {
        Write-Warning "Khong tu mo duoc Head Unit Server: $($_.Exception.Message)"
        return $false
    }

    for ($attempt = 1; $attempt -le 6; $attempt++) {
        if (Test-HeadUnitServer $Serial) { return $true }
        Start-Sleep -Seconds 1
    }
    return $false
}

function Start-Dhu([string]$Serial) {
    if (-not (Repair-HeadUnitServer $Serial)) {
        throw 'Head Unit Server chua lang nghe cong 5277. Hay bat trong Android Auto developer settings.'
    }
    Set-DhuForward $Serial
    $launcher = Start-Process -FilePath $dhu -WorkingDirectory $dhuDirectory -PassThru
    Start-Sleep -Seconds 1
    $running = Get-Process -Name 'desktop-head-unit' -ErrorAction SilentlyContinue |
        Sort-Object StartTime -Descending |
        Select-Object -First 1
    if ($running) { return $running }
    return $launcher
}

if (-not (Test-Path -LiteralPath $adb)) { throw "Khong tim thay adb: $adb" }
if (-not (Test-Path -LiteralPath $dhu)) { throw "Khong tim thay DHU: $dhu" }

Get-Process -Name 'desktop-head-unit' -ErrorAction SilentlyContinue | Stop-Process -Force
Start-Sleep -Milliseconds 400

$restart = 0
while ($true) {
    try {
        $transport = Get-StableTransport
        Write-Host "DHU transport: $transport" -ForegroundColor Cyan
        $process = Start-Dhu $transport
        Write-Host "DHU da mo (PID $($process.Id)). USB van co the dung de cai APK." -ForegroundColor Green

        if ($NoWatchdog) { break }
        $process.WaitForExit()
    }
    catch {
        Write-Warning $_.Exception.Message
        if ($NoWatchdog) { throw }
    }

    $restart++
    if ($restart -gt $maxRestarts) {
        throw "DHU van mat ket noi sau $maxRestarts lan khoi dong lai."
    }

    Write-Host "DHU mat ket noi; tu phuc hoi lan $restart/$maxRestarts..." -ForegroundColor Yellow
    Start-Sleep -Seconds ([Math]::Min(2 + $restart, 8))
}
