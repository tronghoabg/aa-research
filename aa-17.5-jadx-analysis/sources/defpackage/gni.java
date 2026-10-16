package defpackage;

/* loaded from: classes2.dex */
public abstract class gni implements gng {
    public final String a;
    private long b;

    public gni(String str) {
        str.getClass();
        this.a = str;
        this.b = -1L;
    }

    @Override // defpackage.gng
    public final void a() {
        f(false);
    }

    @Override // defpackage.gng
    public final void b() {
        if (d()) {
            gks.k("CarApp.H.Per", "Timer was started while already running! %s", this.a);
            f(false);
        }
        this.b = System.currentTimeMillis();
        g();
    }

    @Override // defpackage.gng
    public final void c() {
        f(true);
    }

    @Override // defpackage.gng
    public final boolean d() {
        return this.b != -1;
    }

    protected abstract void e(boolean z, long j);

    public final void f(boolean z) {
        if (!d()) {
            gks.e("CarApp.H.Per", "Timer was stopped while not running! %s", this.a);
            return;
        }
        long j = aisq.a;
        e(z, afzc.d(System.currentTimeMillis() - this.b, aiss.c));
        this.b = -1L;
    }

    protected void g() {
    }
}
