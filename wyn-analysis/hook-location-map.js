function install() {
  Java.perform(() => {
    const LocationMap = Java.use('gc.b');
    const mapLocation = LocationMap.M.overload('android.location.Location');
    const DoubleValue = Java.use('java.lang.Double');
    const FloatValue = Java.use('java.lang.Float');
    const BooleanValue = Java.use('java.lang.Boolean');
    mapLocation.implementation = function (location) {
      const result = mapLocation.call(this, location);
      if (result !== null) {
        result.put('latitude', DoubleValue.valueOf(location.getLatitude()));
        result.put('longitude', DoubleValue.valueOf(location.getLongitude()));
        result.put('speed', DoubleValue.valueOf(10.0));
        result.put('heading', DoubleValue.valueOf(70.0));
        result.put('accuracy', DoubleValue.valueOf(5.0));
        result.put('speed_accuracy', FloatValue.valueOf(0.5));
        result.put('is_mocked', BooleanValue.FALSE.value);
        console.log(`Gc.b.M override ${result.toString()}`);
      }
      return result;
    };
    console.log('Gc.b.M hook installed');

    const Location = Java.use('android.location.Location');
    const SystemClock = Java.use('android.os.SystemClock');
    Java.choose('android.location.LocationManager$ListenerTransport', {
      onMatch(instance) {
        let step = 0;
        console.log(`location listener found ${instance}`);
        setInterval(() => {
          const location = Location.$new('gps');
          // Sweep roughly west-to-east across 2 km around the real position.
          location.setLatitude(21.365806 + step * 0.000034);
          location.setLongitude(106.079767 + step * 0.0001);
          location.setAccuracy(5.0);
          location.setBearing(70.0);
          location.setSpeed(10.0);
          location.setTime(Date.now());
          location.setElapsedRealtimeNanos(SystemClock.elapsedRealtimeNanos());
          instance.onLocationChanged(location);
          console.log(`location injected step=${step}`);
          step++;
        }, 1000);
      },
      onComplete() { console.log('location listener scan complete'); },
    });
  });
}

install();
