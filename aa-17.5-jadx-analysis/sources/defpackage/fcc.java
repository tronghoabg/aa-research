package defpackage;

/* loaded from: classes2.dex */
final class fcc extends fcg implements fbk {
    private final fcg a;

    public fcc(fbl fblVar, String str, fcg fcgVar) {
        super(fblVar, str);
        this.a = fcgVar;
    }

    @Override // defpackage.fbk
    public final int a() {
        return this.a.a();
    }

    @Override // defpackage.fbk
    public final long b(int i) {
        return this.a.b(i);
    }

    @Override // defpackage.fbk
    public final String c(int i) {
        return this.a.c(i);
    }

    @Override // defpackage.fbk, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.fbk
    public final String d(int i) {
        return this.a.d(i);
    }

    @Override // defpackage.fbk
    public final void e(int i, byte[] bArr) {
        bArr.getClass();
        this.a.e(i, bArr);
    }

    @Override // defpackage.fbk
    public final void f(int i, long j) {
        this.a.f(i, j);
    }

    @Override // defpackage.fbk
    public final void g(int i) {
        this.a.g(i);
    }

    @Override // defpackage.fbk
    public final void h(int i, String str) {
        str.getClass();
        this.a.h(i, str);
    }

    @Override // defpackage.fbk
    public final void i() {
        this.a.i();
    }

    @Override // defpackage.fbk
    public final boolean j(int i) {
        return this.a.j(i);
    }

    @Override // defpackage.fbk
    public final boolean k() {
        boolean zK = this.a.k();
        if (afyh.R(d(0), "wal")) {
            ((fbs) this.f).e.enableWriteAheadLogging();
            return zK;
        }
        ((fbs) this.f).e.disableWriteAheadLogging();
        return zK;
    }

    @Override // defpackage.fbk
    public final byte[] l(int i) {
        return this.a.l(i);
    }

    @Override // defpackage.fcg, defpackage.fbk
    public final boolean m() {
        return this.a.m();
    }
}
