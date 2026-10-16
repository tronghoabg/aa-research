import datetime
import pathlib
import subprocess
import sys
import time
import re

import frida


SERIAL = "c3316015"
PACKAGE = "com.wynauto.wyn"
ADB = r"C:\Users\trong\AppData\Local\Android\Sdk\platform-tools\adb.exe"
ROOT = pathlib.Path(__file__).resolve().parent
LOG = ROOT / "hook-wyn.log"


def emit(line: str) -> None:
    stamp = datetime.datetime.now().isoformat(timespec="milliseconds")
    text = f"{stamp} {line}"
    print(text, flush=True)
    with LOG.open("a", encoding="utf-8") as output:
        output.write(text + "\n")


def on_message(message, data) -> None:
    emit(f"MESSAGE {message}")
    if data:
        emit(f"DATA {bytes(data).hex()}")


device = frida.get_device(SERIAL, timeout=10)
spawn = "--spawn" in sys.argv
if spawn:
    subprocess.run([ADB, "-s", SERIAL, "shell", "am", "force-stop", PACKAGE], check=True)
    pid = device.spawn(PACKAGE)
    emit(f"Spawned {PACKAGE} pid={pid}")
else:
    pid_text = subprocess.check_output(
        [ADB, "-s", SERIAL, "shell", "pidof", PACKAGE], text=True
    ).strip()
    pid_matches = re.findall(r"(?m)^\s*(\d+)\s*$", pid_text)
    if not pid_matches:
        raise RuntimeError(f"{PACKAGE} is not running")
    pid = int(pid_matches[-1])
    emit(f"Attaching to {PACKAGE} pid={pid}")
session = device.attach(pid)
script = session.create_script((ROOT / "hook-wyn.js").read_text(encoding="utf-8"))
script.on("message", on_message)
script.load()
if spawn:
    device.resume(pid)
emit("Script loaded; collecting for 300 seconds")

try:
    time.sleep(300)
except KeyboardInterrupt:
    pass
finally:
    session.detach()
    emit("Detached")
