package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class mim {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.ProximityManagerImpl");
    public final android.hardware.SensorManager b;
    public final android.hardware.Sensor c;
    public final android.hardware.SensorEventListener d;
    public final java.util.concurrent.CopyOnWriteArrayList e = new java.util.concurrent.CopyOnWriteArrayList();
    public int f = 1;

    public mim(android.content.Context context) {
        this.b = (android.hardware.SensorManager) context.getSystemService("sensor");
        android.hardware.SensorManager sensorManager = (android.hardware.SensorManager) defpackage.mos.a().b.getSystemService("sensor");
        sensorManager.getClass();
        android.hardware.Sensor defaultSensor = sensorManager.getDefaultSensor(8);
        this.c = defaultSensor;
        if (defaultSensor != null) {
            this.d = new mil(this, java.lang.Math.min(defaultSensor.getMaximumRange(), 5.0f));
        } else {
            this.d = null;
        }
    }

    public static defpackage.mim a() {
        return (defpackage.mim) defpackage.mkp.a.i(defpackage.mim.class);
    }

    public static final void d(defpackage.xei xeiVar, int i) {
        java.lang.String str;
        if (i == 0) {
            throw null;
        }
        int i2 = i - 1;
        if (i2 == 1) {
            int i3 = xds.r;
            return;
        }
        if (i2 == 2) {
            int i4 = xds.r;
            ((xds) xeiVar.a).h();
        } else {
            if (i != 1) {
                str = i != 2 ? "FAR" : "NEAR";
            } else {
                str = "UNKNOWN";
            }
            throw new java.lang.IllegalArgumentException("Can't dispatch state ".concat(str));
        }
    }

    public final void b() {
        if (!c()) {
            throw new java.lang.UnsupportedOperationException("No proximity sensor found");
        }
    }

    public final boolean c() {
        return this.c != null;
    }
}
