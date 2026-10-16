function dumpPointer(name, pointer, size) {
  if (pointer.isNull()) {
    console.log(`${name}=NULL`);
    return;
  }
  try {
    console.log(`${name}=${pointer} ${hexdump(pointer, { length: size, ansi: false })}`);
  } catch (error) {
    console.log(`${name}=${pointer} unreadable: ${error}`);
  }
}

function hookLocationMap() {
  try {
    Java.perform(() => {
      try {
        const LocationMap = Java.use('Gc.b');
        const mapLocation = LocationMap.M.overload('android.location.Location');
        const DoubleValue = Java.use('java.lang.Double');
        const FloatValue = Java.use('java.lang.Float');
        const BooleanValue = Java.use('java.lang.Boolean');
        mapLocation.implementation = function (location) {
          const result = mapLocation.call(this, location);
          if (result !== null) {
            result.put('latitude', DoubleValue.valueOf(21.365806));
            result.put('longitude', DoubleValue.valueOf(106.089767));
            result.put('speed', DoubleValue.valueOf(10.0));
            result.put('heading', DoubleValue.valueOf(70.0));
            result.put('accuracy', DoubleValue.valueOf(5.0));
            result.put('speed_accuracy', FloatValue.valueOf(0.5));
            result.put('is_mocked', BooleanValue.FALSE.value);
            console.log(`Gc.b.M location overridden: ${result.toString()}`);
          }
          return result;
        };
        console.log('hook Gc.b.M ready');
      } catch (error) {
        console.log(`hook Gc.b.M failed: ${error}`);
      }
    });
  } catch (error) {
    console.log(`Java runtime not ready: ${error}`);
    setTimeout(hookLocationMap, 1000);
  }
}
setTimeout(hookLocationMap, 5000);

let installed = false;
let postHooked = false;
const targetPorts = new Set();

function decodeDartObject(pointer, depth) {
  if (pointer.isNull()) return null;
  if (depth > 8) return '<max-depth>';
  const type = pointer.readS32();
  const data = pointer.add(8);
  switch (type) {
    case 0: return null;
    case 1: return data.readS32() !== 0;
    case 2: return data.readS32();
    case 3: return data.readS64().toString();
    case 4: return data.readDouble();
    case 5: return data.readPointer().readUtf8String();
    case 6: {
      const length = Number(data.readU64());
      const values = data.add(8).readPointer();
      const result = [];
      for (let i = 0; i < Math.min(length, 500); i++) {
        result.push(decodeDartObject(values.add(i * Process.pointerSize).readPointer(), depth + 1));
      }
      return result;
    }
    case 7:
    case 8: {
      const elementType = data.readS32();
      const length = Number(data.add(8).readU64());
      const values = data.add(16).readPointer();
      return { typedData: elementType, length: length, preview: values.readByteArray(Math.min(length, 256)) };
    }
    default: return `<Dart_CObject type=${type}>`;
  }
}

function hookDartPostCObject(address) {
  if (postHooked || address.isNull()) return;
  postHooked = true;
  console.log(`hook Dart_PostCObject at ${address}`);
  Interceptor.attach(address, {
    onEnter(args) {
      if (!targetPorts.has(args[0].toString())) return;
      try {
        console.log(`DART_POST port=${args[0]} value=${JSON.stringify(decodeDartObject(args[1], 0))}`);
      } catch (error) {
        console.log(`DART_POST decode error: ${error}`);
      }
    },
  });
}

function installHooks() {
  if (installed) return true;
  const lib = Process.findModuleByName('libwynlib.so');
  if (lib === null) return false;
  installed = true;
  const storePost = lib.getExportByName('store_dart_post_cobject');
  Interceptor.attach(storePost, {
    onEnter(args) { hookDartPostCObject(args[0]); },
  });
  console.log(`hook store_dart_post_cobject at ${storePost}`);
  try {
    hookDartPostCObject(lib.base.add(0xbb9e8).readPointer());
  } catch (error) {
    console.log(`read stored Dart_PostCObject failed: ${error}`);
  }
  for (const [name, size] of [
    ['frbgen_wyn_wire__crate__api__api__wyn_database_create', 24],
    ['frbgen_wyn_wire__crate__api__api__probe_sl', 160],
    ['frbgen_wyn_wire__crate__api__api__probe_ss_list', 64],
  ]) {
    const address = lib.getExportByName(name);
    console.log(`hook ${name} at ${address}`);
    Interceptor.attach(address, {
      onEnter(args) {
        targetPorts.add(args[0].toString());
        console.log(`ENTER ${name} port=${args[0]} arg1=${args[1]} arg2=${args[2]}`);
        dumpPointer('arg1', args[1], 32);
        if (name !== 'frbgen_wyn_wire__crate__api__api__wyn_database_create') {
          dumpPointer('arg2', args[2], size);
          try {
            console.log(`PROBE lat_e6=${args[2].readS32()} lon_e6=${args[2].add(4).readS32()} bearing=${args[2].add(8).readDouble()} speed_kmh=${args[2].add(16).readDouble()}`);
            if (name.includes('probe_ss_list')) {
              const config = args[2].add(24).readPointer();
              const optional = args[2].add(32).readPointer();
              dumpPointer('street_sign_config', config, 104);
              dumpPointer('optional_value', optional, 8);
            }
			if (name.includes('probe_sl')) {
              dumpPointer('speed_limit_param', args[2], 64);
              const config = args[2].add(24).readPointer();
              const optional = args[2].add(32).readPointer();
              dumpPointer('speed_limit_config', config, 128);
              dumpPointer('speed_limit_state', optional, 64);
            }
          } catch (error) {
            console.log(`PROBE decode error: ${error}`);
          }
        }
      },
    });
  }
  console.log('WYN hooks ready');
  return true;
}

if (!installHooks()) {
  const dlopen = Module.findGlobalExportByName('android_dlopen_ext');
  Interceptor.attach(dlopen, {
    onEnter(args) {
      this.isWyn = !args[0].isNull() && args[0].readUtf8String().includes('libwynlib.so');
    },
    onLeave() {
      if (this.isWyn) installHooks();
    },
  });
  console.log(`waiting for libwynlib.so via android_dlopen_ext at ${dlopen}`);
  const poll = setInterval(() => {
    if (installHooks()) clearInterval(poll);
  }, 100);
}
