$adb = 'C:\Users\trong\AppData\Local\Android\Sdk\platform-tools\adb.exe'
$dhu = 'C:\Users\trong\AppData\Local\Android\Sdk\extras\google\auto\desktop-head-unit.exe'
$dhuDirectory = Split-Path -Parent $dhu
$instanceMutex = New-Object System.Threading.Mutex($false, 'Global\CarWeb.AndroidAuto.DHU')
$ownsMutex = $false
try { $ownsMutex = $instanceMutex.WaitOne(0) } catch [System.Threading.AbandonedMutexException] { $ownsMutex = $true }
if (-not $ownsMutex) {
    Write-Host 'DHU watchdog da chay. Khong mo them phien thu hai.' -ForegroundColor Yellow
    exit 0
}
Register-EngineEvent PowerShell.Exiting -Action {
    if ($ownsMutex) { try { $instanceMutex.ReleaseMutex() } catch {} }
    $instanceMutex.Dispose()
} | Out-Null
. (Join-Path $PSScriptRoot 'Fermata\scripts\resolve-adb-device.ps1')

function Find-WirelessVivo {
    $rows = @(& $adb devices -l)
    $vivo = $rows | Select-String '^([^\s]+:\d+)\s+device\s+.*(?:model:V2419A|device:PD2419)'
    if ($vivo) { return $vivo[0].Matches[0].Groups[1].Value }
    $wireless = $rows | Select-String '^([^\s]+:\d+)\s+device\b'
    if ($wireless) { return $wireless[0].Matches[0].Groups[1].Value }
    return $null
}

function Connect-WirelessVivo {
    $device = Find-WirelessVivo
    if ($device) { return $device }

    try { $device = Resolve-CarWebAdbDevice -Adb $adb } catch { $device = $null }
    if ($device -and $device.Contains(':')) { return $device }

    # Vivo can keep advertising the previous IP after roaming/reconnecting.
    # Restarting only the desktop ADB server clears that stale mDNS cache.
    & $adb kill-server 2>$null | Out-Null
    Start-Sleep -Milliseconds 700
    & $adb start-server 2>$null | Out-Null
    Start-Sleep -Seconds 2
    try { $device = Resolve-CarWebAdbDevice -Adb $adb } catch { $device = $null }
    if ($device -and $device.Contains(':')) { return $device }
    return $null
}

Write-Host 'Android Auto DHU auto-reconnect is running.' -ForegroundColor Cyan
Write-Host 'Keep Head Unit Server enabled on the phone. Press Ctrl+C to stop.'

while ($true) {
    $device = Connect-WirelessVivo
    if (-not $device) {
        Write-Host 'Waiting for vivo ADB...' -ForegroundColor Yellow
        Start-Sleep -Seconds 2
        continue
    }

    # Recent Vivo builds deny unprivileged `ss`, so probing port 5277 reports a
    # false negative even while Android Auto's head-unit server is listening.
    # Let adb forward and DHU perform the real connectivity check instead.
    & $adb -s $device forward --remove tcp:5277 2>$null | Out-Null
    & $adb -s $device forward tcp:5277 tcp:5277 2>$null | Out-Null
    if ($LASTEXITCODE -ne 0) {
        Start-Sleep -Seconds 2
        continue
    }

    Get-Process -Name 'desktop-head-unit' -ErrorAction SilentlyContinue | Stop-Process
    $process = Start-Process -FilePath $dhu -WorkingDirectory $dhuDirectory -PassThru
    Write-Host "DHU connected (PID $($process.Id))." -ForegroundColor Green
    $process.WaitForExit()
    Write-Host 'DHU disconnected. Waiting to reconnect...' -ForegroundColor Yellow
    Start-Sleep -Seconds 2
}
