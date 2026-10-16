package defpackage;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class mig {
    public static final yph a = yph.c("GH.ProximityManagerImpl");
    public final SensorManager b;
    public final Sensor c;
    public final SensorEventListener d;
    public final CopyOnWriteArrayList e = new CopyOnWriteArrayList();
    public int f = 1;

    public mig(Context context) {
        this.b = (SensorManager) context.getSystemService("sensor");
        SensorManager sensorManager = (SensorManager) mom.a().b.getSystemService("sensor");
        sensorManager.getClass();
        Sensor defaultSensor = sensorManager.getDefaultSensor(8);
        this.c = defaultSensor;
        if (defaultSensor != null) {
            this.d = new mif(this, Math.min(defaultSensor.getMaximumRange(), 5.0f));
        } else {
            this.d = null;
        }
    }

    public static mig a() {
        return (mig) mki.a.i(mig.class);
    }

    public static final void d(ykd ykdVar, int i) {
        if (i == 0) {
            throw null;
        }
        int i2 = i - 1;
        if (i2 == 1) {
            int i3 = xcw.r;
        } else {
            if (i2 != 2) {
                throw new IllegalArgumentException("Can't dispatch state ".concat(i != 1 ? i != 2 ? "FAR" : "NEAR" : "UNKNOWN"));
            }
            int i4 = xcw.r;
            ((xcw) ykdVar.a).h();
        }
    }

    public final void b() {
        if (!c()) {
            throw new UnsupportedOperationException("No proximity sensor found");
        }
    }

    public final boolean c() {
        return this.c != null;
    }
}
