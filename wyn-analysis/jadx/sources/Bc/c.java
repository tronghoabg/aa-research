package bc;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.view.WindowManager;
import kotlin.jvm.internal.AbstractC3340k;
import uc.C4271h;
import uc.InterfaceC4270g;
import uc.InterfaceC4272i;

/* loaded from: classes5.dex */
public final class c implements InterfaceC4272i, SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final Context f19439a;

    /* renamed from: b, reason: collision with root package name */
    public final SensorManager f19440b;

    /* renamed from: c, reason: collision with root package name */
    public final Sensor f19441c;

    /* renamed from: d, reason: collision with root package name */
    public C4271h f19442d;

    /* renamed from: e, reason: collision with root package name */
    public double f19443e;

    public c(Context context, SensorManager sensorManager) {
        AbstractC3340k.e(context, "context");
        AbstractC3340k.e(sensorManager, "sensorManager");
        this.f19439a = context;
        this.f19440b = sensorManager;
        this.f19441c = sensorManager.getDefaultSensor(1);
        this.f19443e = -1.0d;
    }

    @Override // uc.InterfaceC4272i
    public final void onCancel(Object obj) {
        this.f19440b.unregisterListener(this);
        this.f19442d = null;
    }

    @Override // uc.InterfaceC4272i
    public final void onListen(Object obj, InterfaceC4270g interfaceC4270g) {
        this.f19442d = (C4271h) interfaceC4270g;
        this.f19440b.registerListener(this, this.f19441c, 3);
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        Object systemService = this.f19439a.getSystemService("window");
        AbstractC3340k.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        int rotation = ((WindowManager) systemService).getDefaultDisplay().getRotation();
        double d3 = 0.0d;
        if (rotation != 0) {
            if (rotation == 1) {
                d3 = 90.0d;
            } else if (rotation == 2) {
                d3 = 180.0d;
            } else if (rotation == 3) {
                d3 = -90.0d;
            }
        }
        if (d3 == this.f19443e) {
            return;
        }
        C4271h c4271h = this.f19442d;
        if (c4271h != null) {
            c4271h.a(Double.valueOf(d3));
        }
        this.f19443e = d3;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i5) {
    }
}
