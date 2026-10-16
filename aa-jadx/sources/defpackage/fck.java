package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class fck extends defpackage.fcn {
    private final defpackage.fcg a;

    public fck(defpackage.fbs fbsVar, java.lang.String str) {
        super(fbsVar, str);
        this.a = fbsVar.i(str);
    }

    @Override // defpackage.fbr
    public final int a() {
        n();
        return 0;
    }

    @Override // defpackage.fbr
    public final long b(int i) {
        n();
        defpackage.csc.l(21, "no row");
        throw new defpackage.afap();
    }

    @Override // defpackage.fbr
    public final java.lang.String c(int i) {
        n();
        defpackage.csc.l(21, "no row");
        throw new defpackage.afap();
    }

    @Override // defpackage.fbr, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
        o();
    }

    @Override // defpackage.fbr
    public final java.lang.String d(int i) {
        n();
        defpackage.csc.l(21, "no row");
        throw new defpackage.afap();
    }

    @Override // defpackage.fbr
    public final void e(int i, byte[] bArr) {
        bArr.getClass();
        n();
        this.a.a(i, bArr);
    }

    @Override // defpackage.fbr
    public final void f(int i, long j) {
        n();
        this.a.c(i, j);
    }

    @Override // defpackage.fbr
    public final void g(int i) {
        n();
        this.a.d(i);
    }

    @Override // defpackage.fbr
    public final void h(int i, java.lang.String str) {
        str.getClass();
        n();
        this.a.e(i, str);
    }

    @Override // defpackage.fbr
    public final void i() {
        n();
    }

    @Override // defpackage.fbr
    public final boolean j(int i) {
        n();
        defpackage.csc.l(21, "no row");
        throw new defpackage.afap();
    }

    @Override // defpackage.fbr
    public final boolean k() {
        n();
        this.a.a.execute();
        return false;
    }

    @Override // defpackage.fbr
    public final byte[] l(int i) {
        n();
        defpackage.csc.l(21, "no row");
        throw new defpackage.afap();
    }
}
