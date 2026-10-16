package defpackage;

import android.content.ComponentName;

/* loaded from: classes3.dex */
public abstract class wyn extends qqm {
    private static final yph b = yph.c("CAR.OOM");

    private final void e() {
        if (!d()) {
            ((ype) b.l().ai((char) 9938)).y("low memory but app active %s", this);
            return;
        }
        qqh qqhVarC = c();
        yph yphVar = wyk.a;
        if (qqhVarC == null || qqhVarC.fo()) {
            ((ype) wyk.a.l().ai((char) 9935)).y("Skipping missing/finished activity %s", qqhVarC);
        } else {
            if (((rnw) qqhVarC.e).F != 2) {
                ((ype) wyk.a.l().ai((char) 9936)).y("low memory but app active %s", qqhVarC);
                return;
            }
            ((ype) ((ype) wyk.a.f()).ai((char) 9937)).y("finish app onLowMemory %s", qqhVarC);
            try {
                qqhVarC.fp();
            } catch (IllegalStateException unused) {
            }
        }
    }

    protected boolean d() {
        return true;
    }

    @Override // defpackage.qqm, android.app.Service, android.content.ComponentCallbacks
    public final void onLowMemory() {
        e();
        ltu.a().b(new ComponentName("com.google.android.projection.gearhead", a().getName()));
        super.onLowMemory();
    }

    @Override // android.app.Service, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        e();
        ltu.a().c(i, new ComponentName("com.google.android.projection.gearhead", a().getName()));
        super.onTrimMemory(i);
    }
}
