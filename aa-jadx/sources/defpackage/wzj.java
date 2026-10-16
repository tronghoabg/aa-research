package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class wzj extends defpackage.qri {
    private static final defpackage.yqm b = defpackage.yqm.c("CAR.OOM");

    private final void e() {
        if (!d()) {
            ((defpackage.yqj) b.l().ai((char) 9966)).y("low memory but app active %s", this);
            return;
        }
        defpackage.qrd qrdVarC = c();
        defpackage.yqm yqmVar = defpackage.wzg.a;
        if (qrdVarC == null || qrdVarC.ew()) {
            ((defpackage.yqj) defpackage.wzg.a.l().ai((char) 9963)).y("Skipping missing/finished activity %s", qrdVarC);
        } else {
            if (((defpackage.ror) qrdVarC.e).F != 2) {
                ((defpackage.yqj) defpackage.wzg.a.l().ai((char) 9964)).y("low memory but app active %s", qrdVarC);
                return;
            }
            ((defpackage.yqj) ((defpackage.yqj) defpackage.wzg.a.f()).ai((char) 9965)).y("finish app onLowMemory %s", qrdVarC);
            try {
                qrdVarC.ex();
            } catch (java.lang.IllegalStateException unused) {
            }
        }
    }

    protected boolean d() {
        return true;
    }

    @Override // defpackage.qri, android.app.Service, android.content.ComponentCallbacks
    public final void onLowMemory() {
        e();
        defpackage.lua.a().b(new android.content.ComponentName("com.google.android.projection.gearhead", a().getName()));
        super.onLowMemory();
    }

    @Override // android.app.Service, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        e();
        defpackage.lua.a().c(i, new android.content.ComponentName("com.google.android.projection.gearhead", a().getName()));
        super.onTrimMemory(i);
    }
}
