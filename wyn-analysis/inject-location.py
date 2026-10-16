import pathlib
import subprocess
import time

import frida


adb = r"C:\Users\trong\AppData\Local\Android\Sdk\platform-tools\adb.exe"
serial = "c3316015"
package = "com.tronghoabg.carweb.auto.debug"
pid = int(subprocess.check_output([adb, "-s", serial, "shell", "pidof", package], text=True).strip())
device = frida.get_device(serial, timeout=10)
session = device.attach(pid)
script = session.create_script((pathlib.Path(__file__).parent / "inject-location.js").read_text())
script.on("message", lambda message, data: print(message, flush=True))
script.load()
time.sleep(120)
