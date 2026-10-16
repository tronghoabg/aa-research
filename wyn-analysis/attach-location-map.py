import pathlib
import time

import frida


root = pathlib.Path(__file__).resolve().parent
device = frida.get_device_manager().add_remote_device("127.0.0.1:27042")
session = device.attach("Gadget")
script = session.create_script((root / "hook-location-map.js").read_text(encoding="utf-8"))
script.on("message", lambda message, data: print(message, flush=True))
script.load()
print("location-map script attached", flush=True)
time.sleep(300)
