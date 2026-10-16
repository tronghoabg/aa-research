package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class vrb extends defpackage.vqt implements defpackage.vrf {
    private final java.util.concurrent.atomic.AtomicBoolean b = new java.util.concurrent.atomic.AtomicBoolean(false);
    private final defpackage.vqw c;
    private defpackage.vlu d;

    public vrb(defpackage.vqw vqwVar) {
        this.c = vqwVar;
    }

    @Override // defpackage.vrf
    public final void a(android.app.Activity activity) {
        this.d = null;
    }

    @Override // defpackage.vrf
    public final void c(android.app.Activity activity) {
        this.d = null;
    }

    @Override // defpackage.vrf
    public final void d(android.app.Activity activity) {
        this.d = null;
        android.content.Context applicationContext = activity.getApplicationContext();
        if (defpackage.vrn.c(applicationContext, defpackage.vrn.d(applicationContext))) {
            l(defpackage.vlu.c(null, activity.getClass()));
        } else {
            if (this.b.getAndSet(true)) {
                return;
            }
            ((defpackage.ype) ((defpackage.ype) vmf.a.h()).ai((char) 9814)).u("Activity started with background importance");
        }
    }

    @Override // defpackage.vrf
    public final void e(android.app.Activity activity) {
        defpackage.vlu vluVarC = defpackage.vlu.c(null, activity.getClass());
        this.d = vluVarC;
        android.content.Context applicationContext = activity.getApplicationContext();
        defpackage.vro vroVarD = defpackage.vrn.d(applicationContext);
        if (defpackage.vrn.c(applicationContext, vroVarD)) {
            return;
        }
        if (!vroVarD.a) {
            ((defpackage.ype) ((defpackage.ype) vmf.a.f()).ai((char) 9815)).y("Signaling app backgrounded from stopped activity (%s) without known process importance", vluVarC);
        }
        k(vluVarC);
    }

    @Override // defpackage.vrf
    public final void f(int i) {
        defpackage.vlu vluVar;
        if (i >= 20 && (vluVar = this.d) != null) {
            k(vluVar);
        }
        this.d = null;
    }

    @Override // defpackage.vqt
    public final void g(defpackage.vlu vluVar) {
        this.c.g(vluVar);
    }

    @Override // defpackage.vrf
    public final void h() {
        this.d = null;
    }

    @Override // defpackage.vqt
    public final void j(defpackage.vlu vluVar) {
        this.c.j(vluVar);
    }

    @Override // defpackage.vrf
    public final /* synthetic */ void i() {
    }

    @Override // defpackage.vrf
    public final /* synthetic */ void b(android.app.Activity activity) {
    }
}
