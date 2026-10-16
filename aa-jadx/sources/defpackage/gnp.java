package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class gnp implements defpackage.gnn {
    public final java.lang.String a;
    private long b;

    public gnp(java.lang.String str) {
        str.getClass();
        this.a = str;
        this.b = -1L;
    }

    @Override // defpackage.gnn
    public final void a() {
        f(false);
    }

    @Override // defpackage.gnn
    public final void b() {
        if (d()) {
            defpackage.gnb.k("CarApp.H.Per", "Timer was started while already running! %s", this.a);
            f(false);
        }
        this.b = java.lang.System.currentTimeMillis();
        g();
    }

    @Override // defpackage.gnn
    public final void c() {
        f(true);
    }

    @Override // defpackage.gnn
    public final boolean d() {
        return this.b != -1;
    }

    protected abstract void e(boolean z, long j);

    public final void f(boolean z) {
        if (!d()) {
            defpackage.gnb.e("CarApp.H.Per", "Timer was stopped while not running! %s", this.a);
            return;
        }
        long j = defpackage.aitq.a;
        e(z, defpackage.agac.f(java.lang.System.currentTimeMillis() - this.b, defpackage.aits.MILLISECONDS));
        this.b = -1L;
    }

    protected void g() {
    }
}
