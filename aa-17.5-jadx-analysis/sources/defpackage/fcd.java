package defpackage;

/* loaded from: classes2.dex */
final class fcd extends fcg {
    private final fbz a;

    public fcd(fbl fblVar, String str) {
        super(fblVar, str);
        this.a = fblVar.i(str);
    }

    @Override // defpackage.fbk
    public final int a() {
        n();
        return 0;
    }

    @Override // defpackage.fbk
    public final long b(int i) {
        n();
        dan.k(21, "no row");
        throw new aezp();
    }

    @Override // defpackage.fbk
    public final String c(int i) {
        n();
        dan.k(21, "no row");
        throw new aezp();
    }

    @Override // defpackage.fbk, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
        o();
    }

    @Override // defpackage.fbk
    public final String d(int i) {
        n();
        dan.k(21, "no row");
        throw new aezp();
    }

    @Override // defpackage.fbk
    public final void e(int i, byte[] bArr) {
        bArr.getClass();
        n();
        this.a.a(i, bArr);
    }

    @Override // defpackage.fbk
    public final void f(int i, long j) {
        n();
        this.a.c(i, j);
    }

    @Override // defpackage.fbk
    public final void g(int i) {
        n();
        this.a.d(i);
    }

    @Override // defpackage.fbk
    public final void h(int i, String str) {
        str.getClass();
        n();
        this.a.e(i, str);
    }

    @Override // defpackage.fbk
    public final void i() {
        n();
    }

    @Override // defpackage.fbk
    public final boolean j(int i) {
        n();
        dan.k(21, "no row");
        throw new aezp();
    }

    @Override // defpackage.fbk
    public final boolean k() {
        n();
        this.a.a.execute();
        return false;
    }

    @Override // defpackage.fbk
    public final byte[] l(int i) {
        n();
        dan.k(21, "no row");
        throw new aezp();
    }
}
