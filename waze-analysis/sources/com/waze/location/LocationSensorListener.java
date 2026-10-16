package com.waze.location;

import android.content.Context;
import android.hardware.GeomagneticField;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import android.view.WindowManager;
import androidx.core.app.ActivityCompat;
import androidx.core.location.LocationCompat;
import androidx.core.location.LocationManagerCompat;
import com.waze.NativeManager;
import com.waze.dg;
import com.waze.gw.Gateway;
import com.waze.jni.protos.Position;
import com.waze.jni.protos.location.NativeLocationJNI;
import com.waze.jni.protos.location.NativeRotationVectors;
import com.waze.jni.protos.location.Quaternion;
import com.waze.jni.protos.location.Vector3;
import com.waze.mg;
import java.util.ArrayList;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public abstract class LocationSensorListener extends bd implements SensorEventListener, o {
    public static final float GEOMAGNETIC_STRENGTH_FACTOR = 1000.0f;
    private static final String LOG_TAG = "LocationSensorListener";
    protected static LocationSensorListener mInstance;
    bl rotationVectorListener;
    private final com.waze.shared_infra.i.e systemLogger = com.waze.shared_infra.i.a.b();
    private final com.waze.shared_infra.i.e logger = com.waze.shared_infra.i.a.d(LOG_TAG);
    protected final long GPS_FIX_WATCH_DOG_PERIOD = 60000;
    protected final long GPS_LOCATION_WATCH_DOG_PERIOD = 10000;
    protected final int SENSOR_MASK_GYRO = 1;
    protected final int SENSOR_MASK_ACCEL = 2;
    protected final int SENSOR_MASK_COMPASS = 4;
    protected final float SMOOTH_RATIO = 0.2f;
    protected final float SMOOTH_IGNORE = 0.5f;
    protected final double TWO_PI = 6.283185307179586d;
    protected ArrayList<Runnable> mLocListeners = new ArrayList<>();
    protected boolean mHasGpsForWatchdog = false;
    protected float[] mAccelData = {0.0f, 0.0f, 0.0f};
    protected float[] mGyroData = {0.0f, 0.0f, 0.0f};
    protected float[] mCompassData = {0.0f, 0.0f, 0.0f};
    protected boolean mbReportedMockLocation = false;
    protected boolean mbLoggedIn = false;
    protected boolean mStarted = false;
    protected Sensor mAccelerometer = null;
    protected Sensor mGyro = null;
    protected Sensor mMagneticField = null;
    protected Sensor mCompass = null;
    protected bb mFixWatchDog = null;
    protected Location mLastLocation = null;
    protected long mLastGpsFixTimeForWatchdogMs = 0;
    protected float[] aValues = new float[3];
    protected float[] mValues = new float[3];
    protected float[] R = new float[16];
    protected final float[] I = new float[16];
    protected int nCompass = 0;
    private SensorManager mSensorManager = null;
    private float mFilteredAzimuth = -1.0f;
    protected kotlinx.coroutines.b.bn<com.waze.bv.n> speedometerStateFlow = ck.b(null);
    protected LocationManager mLocationManager = (LocationManager) mg.a().getSystemService("location");

    public static bi GetNativeLocation(Location location) {
        if (location == null) {
            return null;
        }
        return new bi(location);
    }

    public static boolean canUseLocation(Context context) {
        return (permissionsMissing(context) || gpsConfigMissing(context)) ? false : true;
    }

    public static NativeLocationJNI createNativeLocationJNI(Location location, float[] fArr, float[] fArr2, float[] fArr3) {
        NativeLocationJNI.Builder builderNewBuilder = NativeLocationJNI.newBuilder();
        bi biVarGetNativeLocation = GetNativeLocation(location);
        Position.IntPosition.Builder builderNewBuilder2 = Position.IntPosition.newBuilder();
        builderNewBuilder2.setLongitude(biVarGetNativeLocation.d());
        builderNewBuilder2.setLatitude(biVarGetNativeLocation.c());
        builderNewBuilder2.setAltitude(biVarGetNativeLocation.b());
        builderNewBuilder.setGpsTimeMs(biVarGetNativeLocation.i());
        builderNewBuilder.setPosition(builderNewBuilder2);
        builderNewBuilder.setAccuracyMeters(biVarGetNativeLocation.a());
        builderNewBuilder.setSpeedAccuracyMmSec(biVarGetNativeLocation.f());
        builderNewBuilder.setProvider(location.getProvider().equals("network") ? NativeLocationJNI.Provider.NETWORK : NativeLocationJNI.Provider.GPS);
        builderNewBuilder.setGeneratedBySoftware(LocationCompat.isMock(location));
        builderNewBuilder.setGeneratedBySoftware(LocationCompat.isMock(location));
        if (biVarGetNativeLocation.k()) {
            builderNewBuilder.setSteeringDegrees(biVarGetNativeLocation.g());
        }
        if (biVarGetNativeLocation.j()) {
            builderNewBuilder.setSpeedMmSec(biVarGetNativeLocation.e());
        }
        builderNewBuilder.setSteeringAccuracyDegrees(biVarGetNativeLocation.h());
        if (fArr != null && fArr.length == 3) {
            Vector3.Builder builderNewBuilder3 = Vector3.newBuilder();
            builderNewBuilder3.setX(fArr[0]);
            builderNewBuilder3.setY(fArr[1]);
            builderNewBuilder3.setZ(fArr[2]);
            builderNewBuilder.setAccelerometer(builderNewBuilder3);
        }
        if (fArr2 != null && fArr2.length == 3) {
            Vector3.Builder builderNewBuilder4 = Vector3.newBuilder();
            builderNewBuilder4.setX(fArr2[0]);
            builderNewBuilder4.setY(fArr2[1]);
            builderNewBuilder4.setZ(fArr2[2]);
            builderNewBuilder.setGyroscope(builderNewBuilder4);
        }
        if (fArr3 != null && fArr3.length == 3) {
            Vector3.Builder builderNewBuilder5 = Vector3.newBuilder();
            builderNewBuilder5.setX(fArr3[0]);
            builderNewBuilder5.setY(fArr3[1]);
            builderNewBuilder5.setZ(fArr3[2]);
            builderNewBuilder.setCompass(builderNewBuilder5);
        }
        return builderNewBuilder.build();
    }

    public static boolean gpsConfigMissing(Context context) {
        boolean zIsLocationEnabled;
        LocationManager locationManager = (LocationManager) context.getSystemService("location");
        if (locationManager == null) {
            com.waze.shared_infra.i.h.d("LocationUtils", "Failed to get location manager");
            zIsLocationEnabled = false;
        } else {
            zIsLocationEnabled = LocationManagerCompat.isLocationEnabled(locationManager);
        }
        com.waze.shared_infra.i.a.b().a("LocationSensorListener: Location mode enabled - " + zIsLocationEnabled);
        return !zIsLocationEnabled;
    }

    private native void initNTV();

    private native boolean isGpsEnabledNTV();

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initNative$0(x xVar) {
        onLocation(xVar.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initRotationVectors$0() {
        bl blVar = new bl(new com.google.firebase.messaging.l(this), this.mSensorManager);
        this.rotationVectorListener = blVar;
        blVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initRotationVectors$1(final long j2, final long j3, final bk bkVar, final float[] fArr, final float[] fArr2, final float f2, final float f3) {
        NativeManager.getInstance().PostRunnable(new Runnable() { // from class: com.waze.location.ay
            @Override // java.lang.Runnable
            public final void run() {
                this.f25290a.lambda$initRotationVectors$2(j2, j3, bkVar, fArr, fArr2, f2, f3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initRotationVectors$2(long j2, long j3, bk bkVar, float[] fArr, float[] fArr2, float f2, float f3) {
        NativeRotationVectors.Builder builderNewBuilder = NativeRotationVectors.newBuilder();
        builderNewBuilder.setTimestampMs(j2);
        builderNewBuilder.setDeltaTns(j3);
        Quaternion.Builder builderNewBuilder2 = Quaternion.newBuilder();
        builderNewBuilder2.setX(bkVar.b());
        builderNewBuilder2.setY(bkVar.c());
        builderNewBuilder2.setZ(bkVar.d());
        builderNewBuilder2.setW(bkVar.a());
        builderNewBuilder.setRotation(builderNewBuilder2.build());
        Vector3.Builder builderNewBuilder3 = Vector3.newBuilder();
        builderNewBuilder3.setX(fArr[0]);
        builderNewBuilder3.setY(fArr[1]);
        builderNewBuilder3.setZ(fArr[2]);
        builderNewBuilder.setGravity(builderNewBuilder3.build());
        Vector3.Builder builderNewBuilder4 = Vector3.newBuilder();
        builderNewBuilder4.setX(fArr2[0]);
        builderNewBuilder4.setY(fArr2[1]);
        builderNewBuilder4.setZ(fArr2[2]);
        builderNewBuilder.setMagneticField(builderNewBuilder4.build());
        builderNewBuilder.setMaxRateOfTurn(f2);
        builderNewBuilder.setMaxAcceleration(f3);
        notifyRotationVectorsNTV(builderNewBuilder.build().toByteArray());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setLocationAfterAppServiceStart$0() {
        Location lastLocation = getLastLocation();
        if (lastLocation == null || lastLocation.getTime() + 5000 < System.currentTimeMillis()) {
            return;
        }
        com.waze.shared_infra.i.e eVar = this.logger;
        long jCurrentTimeMillis = System.currentTimeMillis();
        eVar.a(String.format("setLocationAfterAppServiceStart: Provider: %s; from %d ms to %d ms", lastLocation.getProvider(), Long.valueOf(this.mLastGpsFixTimeForWatchdogMs), Long.valueOf(jCurrentTimeMillis)));
        this.mLastGpsFixTimeForWatchdogMs = jCurrentTimeMillis;
        setLastLocation(lastLocation, jCurrentTimeMillis);
        updateNativeLayer(lastLocation);
    }

    private static native void notifyLocationNTV(byte[] bArr);

    private native void notifyRotationVectorsNTV(byte[] bArr);

    public static boolean permissionsMissing(Context context) {
        if (context == null) {
            com.waze.shared_infra.i.a.b().b("LocationSensorListener: ".concat(String.valueOf(Log.getStackTraceString(new IllegalStateException("Check location permission without valid context.")))));
            return false;
        }
        if (ActivityCompat.checkSelfPermission(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            return false;
        }
        com.waze.shared_infra.i.a.b().b("LocationSensorListener: No permissions to access location, GPS location cannot execute");
        return true;
    }

    private void sendUpdateToNativeLayer(Location location, float[] fArr, float[] fArr2, float[] fArr3) {
        if (location == null) {
            return;
        }
        setMockGpsStatusIfNeeded(location);
        notifyLocationNTV(createNativeLocationJNI(location, fArr, fArr2, fArr3).toByteArray());
    }

    private void setLocationAfterAppServiceStart() {
        NativeManager.Post(new com.google.android.material.textfield.ao(this, 14));
    }

    private void stopWD() {
        if (this.mFixWatchDog != null) {
            this.systemLogger.a("LocationSensorListener: Watchdog stopping");
            this.mFixWatchDog.cancel();
            this.mFixWatchDog = null;
        }
    }

    private void updateNativeLayer(Location location) {
        sendUpdateToNativeLayer(location, this.mAccelData, this.mGyroData, this.mCompassData);
    }

    protected native int GetLocationSensorMaskNTV();

    protected native void SetCompassNTV(int i2);

    protected boolean checkPermissions() {
        return !permissionsMissing(mg.a());
    }

    float getGeomagneticHorizontalStrengthUT(int i2, int i3) {
        return new GeomagneticField((float) bg.a(i2), (float) bg.a(i3), 0.0f, System.currentTimeMillis()).getHorizontalStrength() / 1000.0f;
    }

    @Override // com.waze.location.o
    public synchronized Location getLastLocation() {
        return this.mLastLocation;
    }

    @Override // com.waze.location.o
    public void init() {
        this.systemLogger.a("LocationSensorListener: init");
        initNative();
        this.mSensorManager = (SensorManager) mg.a().getSystemService("sensor");
        int iGetLocationSensorMaskNTV = GetLocationSensorMaskNTV();
        SensorManager sensorManager = this.mSensorManager;
        if (sensorManager != null) {
            if ((iGetLocationSensorMaskNTV & 2) != 0) {
                this.mAccelerometer = sensorManager.getDefaultSensor(1);
            }
            if ((iGetLocationSensorMaskNTV & 1) != 0) {
                this.mGyro = this.mSensorManager.getDefaultSensor(4);
            }
            if ((iGetLocationSensorMaskNTV & 4) != 0) {
                this.mCompass = this.mSensorManager.getDefaultSensor(2);
            }
        }
        NativeManager.runMainThreadTask(new Runnable() { // from class: com.waze.location.az
            @Override // java.lang.Runnable
            public final void run() {
                this.f25298a.startWD();
            }
        });
        setLocationAfterAppServiceStart();
    }

    public void initNative() {
        initNTV();
        y yVar = (y) com.waze.web.r.h(y.class);
        kotlinx.coroutines.af afVarE = kotlinx.coroutines.aj.e(NativeManager.getInstance().getNativeDispatcher());
        if (yVar.e()) {
            com.waze.shared_infra.i.h.a("LocationSensorListener: Using non-device filtering flow");
            com.waze.ae.e.b(yVar.a(), afVarE, new dg(this, 2));
        } else {
            com.waze.shared_infra.i.h.a("LocationSensorListener: Using device filtering flow");
            com.waze.ae.e.b(yVar.c(), afVarE, new dg(this, 3));
        }
    }

    void initRotationVectors() {
        this.systemLogger.a("LocationSensorListener: initRotationVectors");
        com.waze.t.l(new com.google.android.material.textfield.ao(this, 15));
    }

    @Override // com.waze.location.o
    public boolean isGpsEnabled() {
        return isGpsEnabledNTV();
    }

    boolean isLocationPermissionGranted() {
        com.waze.shared_infra.j.a aVar = (com.waze.shared_infra.j.a) com.waze.web.r.h(com.waze.shared_infra.j.a.class);
        return aVar.a("android.permission.ACCESS_COARSE_LOCATION") || aVar.a("android.permission.ACCESS_FINE_LOCATION");
    }

    @Override // com.waze.location.o
    public /* synthetic */ com.waze.shared_infra.h.c lastCoordinate() {
        Location lastLocation = getLastLocation();
        return lastLocation != null ? new com.waze.shared_infra.h.c(lastLocation.getLatitude(), lastLocation.getLongitude()) : com.waze.shared_infra.h.c.f37873a;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i2) {
    }

    public void onLocation(Location location) {
        if (location == null) {
            return;
        }
        this.logger.a(String.format("onLocationChanged: Provider: %s; Lon: %f; Lat: %f; Speed: %s; Accuracy: %s; Bearing: %s; Time: %d", location.getProvider(), Double.valueOf(location.getLongitude()), Double.valueOf(location.getLatitude()), location.hasSpeed() ? Float.valueOf(location.getSpeed()) : "N/A", location.hasAccuracy() ? Float.valueOf(location.getAccuracy()) : "N/A", location.hasBearing() ? Float.valueOf(location.getBearing()) : "N/A", Long.valueOf(location.getTime())));
        setLastLocation(location, System.currentTimeMillis());
        if (com.waze.ap.b.o.e(location.getProvider())) {
            this.mHasGpsForWatchdog = true;
        }
        updateNativeLayer(location);
    }

    @Override // com.waze.location.o
    public void onLogin() {
        this.systemLogger.a("LocationSensorListener: onLogin");
        this.mbLoggedIn = true;
        this.mbReportedMockLocation = false;
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        double d2;
        if (sensorEvent.values == null || sensorEvent.values.length < 3) {
            return;
        }
        int type = sensorEvent.sensor.getType();
        if (type == 1) {
            System.arraycopy(sensorEvent.values, 0, this.mAccelData, 0, 3);
            this.aValues = (float[]) sensorEvent.values.clone();
            return;
        }
        if (type != 2) {
            if (type != 4) {
                return;
            }
            System.arraycopy(sensorEvent.values, 0, this.mGyroData, 0, 3);
            return;
        }
        System.arraycopy(sensorEvent.values, 0, this.mCompassData, 0, 3);
        float[] fArr = (float[]) sensorEvent.values.clone();
        this.mValues = fArr;
        float[] fArr2 = this.aValues;
        if (fArr2 == null || fArr == null) {
            return;
        }
        float[] fArr3 = new float[9];
        if (SensorManager.getRotationMatrix(fArr3, new float[9], fArr2, fArr)) {
            float[] fArr4 = new float[3];
            SensorManager.getOrientation(fArr3, fArr4);
            float f2 = fArr4[0];
            float f3 = this.mFilteredAzimuth;
            if (f3 == -1.0f || Math.abs(f3 - f2) > 0.5f) {
                this.mFilteredAzimuth = f2;
            } else {
                float f4 = this.mFilteredAzimuth;
                float f5 = f2 - f4;
                double d3 = f5;
                if (d3 < -6.283185307179586d) {
                    d2 = d3 + 6.283185307179586d;
                } else {
                    if (d3 > 6.283185307179586d) {
                        d2 = d3 - 6.283185307179586d;
                    }
                    f2 = (f5 * 0.2f) + f4;
                    this.mFilteredAzimuth = f2;
                }
                f5 = (float) d2;
                f2 = (f5 * 0.2f) + f4;
                this.mFilteredAzimuth = f2;
            }
            int degrees = (int) Math.toDegrees(f2);
            int rotation = ((WindowManager) mg.a().getSystemService("window")).getDefaultDisplay().getRotation();
            if (rotation == 1) {
                degrees += 90;
            } else if (rotation == 2) {
                degrees -= 180;
            } else if (rotation == 3) {
                degrees -= 90;
            }
            if (this.nCompass != degrees) {
                this.nCompass = degrees;
                if (NativeManager.isAppStarted()) {
                    SetCompass(this.nCompass);
                }
            }
        }
    }

    @Override // com.waze.ifs.ui.y
    public /* synthetic */ void onShutdown() {
        stop();
    }

    public void registerCompass() {
        this.systemLogger.a("LocationSensorListener: RegisterCompass");
        Sensor defaultSensor = this.mAccelerometer;
        if (defaultSensor == null) {
            defaultSensor = this.mSensorManager.getDefaultSensor(1);
            this.mAccelerometer = defaultSensor;
        }
        this.mSensorManager.registerListener(this, defaultSensor, 3);
        Sensor defaultSensor2 = this.mMagneticField;
        if (defaultSensor2 == null) {
            defaultSensor2 = this.mSensorManager.getDefaultSensor(2);
            this.mMagneticField = defaultSensor2;
        }
        this.mSensorManager.registerListener(this, defaultSensor2, 2);
    }

    @Override // com.waze.location.o
    public synchronized void registerLocListener(Runnable runnable) {
        this.systemLogger.a("LocationSensorListener: registerLocListener: ");
        if (runnable == null || this.mLocListeners.contains(runnable)) {
            return;
        }
        this.mLocListeners.add(runnable);
    }

    public void registerSensors() {
        this.systemLogger.a("LocationSensorListener: registerSensors");
        Sensor sensor = this.mAccelerometer;
        if (sensor != null) {
            this.mSensorManager.registerListener(this, sensor, 3);
        }
        Sensor sensor2 = this.mGyro;
        if (sensor2 != null) {
            this.mSensorManager.registerListener(this, sensor2, 3);
        }
        Sensor sensor3 = this.mCompass;
        if (sensor3 != null) {
            this.mSensorManager.registerListener(this, sensor3, 3);
        }
    }

    @Override // com.waze.location.o
    public void setCarCompass(int i2) {
        setInnerCarCompass(i2);
    }

    protected native void setGpsFakeStatusNTV();

    protected native void setInnerCarCompassNTV(int i2);

    protected void setLastLocation(Location location, long j2) {
        if (com.waze.ap.b.o.e(location.getProvider())) {
            this.mLastGpsFixTimeForWatchdogMs = j2;
        }
        this.mLastLocation = location;
        updateListeners();
    }

    protected abstract void setMockGpsStatusIfNeeded(Location location);

    @Override // com.waze.location.o
    public ch<com.waze.bv.n> speedometerData() {
        return this.speedometerStateFlow;
    }

    public void start() {
        this.systemLogger.a("LocationSensorListener: start");
        registerSensors();
        bb bbVar = this.mFixWatchDog;
        if (bbVar == null || !bbVar.b()) {
            startWD();
        }
    }

    protected void startWD() {
        this.systemLogger.a("LocationSensorListener: Watchdog starting");
        bb bbVar = this.mFixWatchDog;
        if (bbVar != null) {
            bbVar.cancel();
        }
        this.mFixWatchDog = new bb(this);
        try {
            NativeManager.getInstance().getTimer().scheduleAtFixedRate(this.mFixWatchDog, 60000L, 10000L);
        } catch (IllegalStateException unused) {
            this.mFixWatchDog = null;
            this.systemLogger.g("LocationSensorListener: Cannot start watchdog. The timer was canceled");
        }
    }

    public void stop() {
        this.systemLogger.a("LocationSensorListener: stop");
        unregisterSensors();
        bb bbVar = this.mFixWatchDog;
        if (bbVar == null || bbVar.b()) {
            return;
        }
        stopWD();
    }

    public void unregisterCompass() {
        this.systemLogger.a("LocationSensorListener: unRegisterCompass");
        Sensor sensor = this.mAccelerometer;
        if (sensor != null) {
            this.mSensorManager.unregisterListener(this, sensor);
        }
        Sensor sensor2 = this.mMagneticField;
        if (sensor2 != null) {
            this.mSensorManager.unregisterListener(this, sensor2);
        }
    }

    @Override // com.waze.location.o
    public synchronized void unregisterLocListener(Runnable runnable) {
        this.systemLogger.a("LocationSensorListener: unregisterLocListener");
        this.mLocListeners.remove(runnable);
    }

    public void unregisterSensors() {
        this.systemLogger.a("LocationSensorListener: unregisterSensors");
        SensorManager sensorManager = this.mSensorManager;
        if (sensorManager != null) {
            Sensor sensor = this.mAccelerometer;
            if (sensor != null) {
                sensorManager.unregisterListener(this, sensor);
            }
            Sensor sensor2 = this.mGyro;
            if (sensor2 != null) {
                this.mSensorManager.unregisterListener(this, sensor2);
            }
            Sensor sensor3 = this.mCompass;
            if (sensor3 != null) {
                this.mSensorManager.unregisterListener(this, sensor3);
            }
            this.mSensorManager.unregisterListener(this);
        }
    }

    protected synchronized void updateListeners() {
        for (int i2 = 0; i2 < this.mLocListeners.size(); i2++) {
            this.mLocListeners.get(i2).run();
        }
    }

    void updateSpeedometer(int i2, String str, int i3, double d2) {
        int iCapLimit = Gateway.capLimit(i3);
        this.speedometerStateFlow.e(new com.waze.bv.n(Gateway.onSpeedoAndAdjust(i2, str, iCapLimit, d2), str, iCapLimit, d2));
    }
}
