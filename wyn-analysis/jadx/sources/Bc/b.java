package bc;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;
import r7.AbstractC3935e;
import uc.C4271h;
import uc.InterfaceC4270g;
import uc.InterfaceC4272i;

/* loaded from: classes5.dex */
public final class b implements InterfaceC4272i, SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19434a;

    /* renamed from: b, reason: collision with root package name */
    public final SensorManager f19435b;

    /* renamed from: c, reason: collision with root package name */
    public int f19436c;

    /* renamed from: d, reason: collision with root package name */
    public final Sensor f19437d;

    /* renamed from: e, reason: collision with root package name */
    public C4271h f19438e;

    public b(SensorManager sensorManager, int i5, int i10) {
        this.f19434a = i10;
        switch (i10) {
            case 1:
                AbstractC3340k.e(sensorManager, "sensorManager");
                this.f19435b = sensorManager;
                this.f19436c = 1;
                this.f19437d = sensorManager.getDefaultSensor(i5);
                break;
            default:
                AbstractC3340k.e(sensorManager, "sensorManager");
                this.f19435b = sensorManager;
                this.f19436c = 1;
                this.f19437d = sensorManager.getDefaultSensor(i5);
                break;
        }
    }

    public void c(int i5) {
        this.f19436c = i5;
        if (this.f19438e != null) {
            SensorManager sensorManager = this.f19435b;
            sensorManager.unregisterListener(this);
            sensorManager.registerListener(this, this.f19437d, i5);
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i5) {
        int i10 = this.f19434a;
    }

    @Override // uc.InterfaceC4272i
    public final void onCancel(Object obj) {
        switch (this.f19434a) {
            case 0:
                this.f19435b.unregisterListener(this);
                this.f19438e = null;
                break;
            default:
                this.f19435b.unregisterListener(this);
                this.f19438e = null;
                break;
        }
    }

    @Override // uc.InterfaceC4272i
    public final void onListen(Object obj, InterfaceC4270g interfaceC4270g) {
        switch (this.f19434a) {
            case 0:
                Sensor sensor = this.f19437d;
                if (sensor != null) {
                    this.f19438e = (C4271h) interfaceC4270g;
                    this.f19435b.registerListener(this, sensor, this.f19436c);
                    break;
                }
                break;
            default:
                Sensor sensor2 = this.f19437d;
                if (sensor2 != null) {
                    this.f19438e = (C4271h) interfaceC4270g;
                    this.f19435b.registerListener(this, sensor2, this.f19436c);
                    break;
                }
                break;
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        switch (this.f19434a) {
            case 0:
                float[] fArr = new float[4];
                AbstractC3340k.b(sensorEvent);
                SensorManager.getQuaternionFromVector(fArr, sensorEvent.values);
                C4271h c4271h = this.f19438e;
                if (c4271h != null) {
                    c4271h.a(AbstractC3935e.D(Float.valueOf(fArr[1]), Float.valueOf(fArr[2]), Float.valueOf(fArr[3]), Float.valueOf(fArr[0])));
                    break;
                }
                break;
            default:
                AbstractC3340k.b(sensorEvent);
                List listD = AbstractC3935e.D(Float.valueOf(sensorEvent.values[0]), Float.valueOf(sensorEvent.values[1]), Float.valueOf(sensorEvent.values[2]), Double.valueOf(sensorEvent.timestamp));
                C4271h c4271h2 = this.f19438e;
                if (c4271h2 != null) {
                    c4271h2.a(listD);
                    break;
                }
                break;
        }
    }

    private final void a(Sensor sensor, int i5) {
    }

    private final void b(Sensor sensor, int i5) {
    }
}
