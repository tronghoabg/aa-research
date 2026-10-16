Java.perform(() => {
  const Location = Java.use('android.location.Location');
  const getLatitude = Location.getLatitude.overload();
  const getLongitude = Location.getLongitude.overload();
  const getSpeed = Location.getSpeed.overload();
  const getBearing = Location.getBearing.overload();
  let step = 0;

  getLatitude.implementation = function () {
    return 21.365806 + Math.min(step, 500) * 0.000002;
  };
  getLongitude.implementation = function () {
    step++;
    if (step % 10 === 0) console.log(`FAKE_LOCATION step=${step}`);
    return 106.089767 + Math.min(step, 500) * 0.000006;
  };
  getSpeed.implementation = function () {
    return 10.0;
  };
  getBearing.implementation = function () {
    return 70.0;
  };
  console.log('Location getter hooks ready');
});
