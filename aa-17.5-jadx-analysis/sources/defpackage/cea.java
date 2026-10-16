package defpackage;

/* loaded from: classes.dex */
public final class cea extends cec {
    private final afec a;
    private int b;

    public cea(long j, cej cejVar, afec afecVar) {
        super(j, cejVar);
        this.a = afecVar;
        this.b = 1;
    }

    @Override // defpackage.cec
    public final cec b(afec afecVar) {
        cek.s(this);
        return new cdy(this.i, this.h, cek.n(afecVar, this.a, true), this);
    }

    @Override // defpackage.cec
    public final void d() {
        if (this.j) {
            return;
        }
        g();
        super.d();
    }

    @Override // defpackage.cec
    public final void f() {
        this.b++;
    }

    @Override // defpackage.cec
    public final void g() {
        int i = this.b - 1;
        this.b = i;
        if (i == 0) {
            y();
        }
    }

    @Override // defpackage.cec
    public final /* synthetic */ afec i() {
        return this.a;
    }

    @Override // defpackage.cec
    public final afec k() {
        return null;
    }

    @Override // defpackage.cec
    public final void n(cev cevVar) {
        cek.t();
        throw new aezp();
    }

    @Override // defpackage.cec
    public final boolean r() {
        return true;
    }

    @Override // defpackage.cec
    public final void e() {
    }
}
