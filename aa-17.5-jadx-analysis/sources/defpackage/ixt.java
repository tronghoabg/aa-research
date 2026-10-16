package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;

/* loaded from: classes.dex */
public final class ixt extends rhu {
    private static final yph a = yph.c("CAR.CAM");
    private final Context b;
    private boolean c;
    private ComponentName d;

    public ixt(Context context) {
        this.b = context;
    }

    public final synchronized void c() {
        yph yphVar = a;
        ((ype) ((ype) yphVar.f()).ai(1540)).y("makeBackground for component %s", this.d);
        if (!this.c) {
            ((ype) ((ype) yphVar.f()).ai((char) 1541)).u("Already unbound, not making background");
            return;
        }
        spi.a().b(this.b, this);
        this.c = false;
        this.d = null;
    }

    public final synchronized void d(ComponentName componentName) {
        yph yphVar = a;
        ((ype) ((ype) yphVar.f()).ai((char) 1542)).y("makeForeground for component %s", componentName);
        if (this.c) {
            ComponentName componentName2 = this.d;
            componentName2.getClass();
            if (componentName2.equals(componentName)) {
                ((ype) ((ype) yphVar.f()).ai((char) 1544)).u("Already bound, not making foreground");
                return;
            }
            c();
        }
        int i = true != spu.c() ? 64 : 4160;
        boolean zD = spi.a().d(this.b, new Intent().setComponent(componentName), this, i);
        this.c = zD;
        if (zD) {
            this.d = componentName;
        } else {
            ((ype) ((ype) yphVar.h()).ai((char) 1543)).y("makeForeground failed due to bindService failure %s", componentName);
        }
    }

    @Override // defpackage.rhu
    public final void b(ComponentName componentName) {
    }

    @Override // defpackage.rhu
    public final void a(ComponentName componentName, IBinder iBinder) {
    }
}
