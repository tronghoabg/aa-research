Java.perform(() => {
  const Location = Java.use('android.location.Location');
  const SystemClock = Java.use('android.os.SystemClock');
  const candidates = [
    'android.location.LocationManager$ListenerTransport',
  ];

  function inject(instance, className) {
    let step = 0;
    const timer = setInterval(() => {
      try {
        const location = Location.$new('gps');
        location.setLatitude(21.353805 + step * 0.000002);
        location.setLongitude(106.093771);
        location.setAccuracy(3.0);
        location.setBearing(180.0);
        location.setSpeed(10.0);
        location.setTime(Date.now());
        location.setElapsedRealtimeNanos(SystemClock.elapsedRealtimeNanos());
        console.log(`INJECT CALL ${className} step=${step}`);
        instance.onLocationChanged(location);
        console.log(`INJECT DONE ${className} step=${step}`);
        step++;
        if (step % 10 === 0) console.log(`INJECT ${className} step=${step}`);
        if (step >= 200) clearInterval(timer);
      } catch (error) {
        console.log(`INJECT ERROR ${className}: ${error}`);
        clearInterval(timer);
      }
    }, 1000);
  }

  let found = 0;
  candidates.forEach((name) => {
    try {
      Java.choose(name, {
        onMatch(instance) {
          found++;
          console.log(`FOUND ${name} ${instance}`);
          console.log(`MEMBERS ${instance.$className}: ${instance.$ownMembers}`);
          inject(instance, name);
        },
        onComplete() {},
      });
    } catch (error) {
      console.log(`SKIP ${name}: ${error}`);
    }
  });
  console.log(`Location transports found=${found}`);
});
