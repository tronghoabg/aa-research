package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class byd extends defpackage.byf {
    public java.lang.Object a;
    public java.lang.Object b;
    public aiyx c;
    public defpackage.aaw d;
    public defpackage.aaw e;
    private final defpackage.affc g = new defpackage.bjm(this, 15);
    private final defpackage.ceg h = defpackage.bzd.i(new defpackage.amc(this, 14));

    private final void f() {
        this.b = null;
        this.e = null;
    }

    @Override // defpackage.byf
    public final defpackage.affc a(aiyx aiyxVar) {
        aiyx aiyxVar2 = this.c;
        if (aiyxVar2 != null && !defpackage.afga.f(aiyxVar2, aiyxVar)) {
            defpackage.bxi.b("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
        }
        this.c = aiyxVar;
        return this.g;
    }

    @Override // defpackage.byf
    public final void b(aiyx aiyxVar) {
        f();
    }

    @Override // defpackage.byf
    public final void c() {
        synchronized (this.f) {
            this.a = this.b;
            if (this.e == null) {
                this.d = null;
            } else {
                defpackage.aaw aawVar = this.d;
                if (aawVar == null) {
                    defpackage.aaw aawVar2 = defpackage.aax.a;
                    aawVar = new defpackage.aaw(6);
                    this.d = aawVar;
                }
                this.d = this.e;
                this.e = aawVar;
            }
        }
    }

    @Override // defpackage.byf
    public final void d() {
        this.h.a();
        f();
        synchronized (this.f) {
            this.c = null;
            this.a = null;
            this.d = null;
        }
    }

    @Override // defpackage.byf
    public final void e(aiyx aiyxVar) {
        this.c = null;
        f();
        c();
    }
}
