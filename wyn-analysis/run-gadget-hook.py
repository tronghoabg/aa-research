import pathlib
import subprocess
import time

import frida


ADB = r"C:\Users\trong\AppData\Local\Android\Sdk\platform-tools\adb.exe"
DEVICE = "192.168.50.31:5555"
PACKAGE = "com.wynauto.wyn.inspect"
ACTIVITY = f"{PACKAGE}/com.wynauto.wyn.MainActivity"
ROOT = pathlib.Path(__file__).resolve().parent


subprocess.run([ADB, "-s", DEVICE, "forward", "tcp:27042", "tcp:27042"], check=True)
subprocess.run([ADB, "-s", DEVICE, "shell", "am", "force-stop", PACKAGE], check=True)
subprocess.Popen([ADB, "-s", DEVICE, "shell", "am", "start", "-n", ACTIVITY])

last_error = None
for _ in range(80):
    try:
        device = frida.get_device_manager().add_remote_device("127.0.0.1:27042")
        session = device.attach("Gadget")
        break
    except Exception as error:
        last_error = error
        time.sleep(0.1)
else:
    raise RuntimeError("Gadget did not accept a connection") from last_error


def on_message(message, data):
    print(message, flush=True)
    if data:
        print(bytes(data).hex(), flush=True)


script = session.create_script((ROOT / "hook-wyn.js").read_text(encoding="utf-8"))
script.on("message", on_message)
script.load()
print("WYN runtime hook attached", flush=True)

try:
    time.sleep(300)
finally:
    session.detach()
