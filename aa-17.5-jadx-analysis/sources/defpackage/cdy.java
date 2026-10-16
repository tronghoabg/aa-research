package defpackage;

/* loaded from: classes.dex */
public final class cdy extends cec {
    private final afec a;
    private final cec b;

    public cdy(long j, cej cejVar, afec afecVar, cec cecVar) {
        super(j, cejVar);
        this.a = afecVar;
        this.b = cecVar;
        cecVar.f();
    }

    @Override // defpackage.cec
    public final /* bridge */ /* synthetic */ cec b(afec afecVar) {
        return new cdy(this.i, this.h, cek.n(afecVar, this.a, true), this.b);
    }

    @Override // defpackage.cec
    public final void d() {
        if (this.j) {
            return;
        }
        long j = this.i;
        cec cecVar = this.b;
        if (j != cecVar.v()) {
            y();
        }
        cecVar.g();
        super.d();
    }

    @Override // defpackage.cec
    public final /* synthetic */ void f() {
        byx.o();
    }

    @Override // defpackage.cec
    public final /* synthetic */ void g() {
        byx.o();
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
    public final /* bridge */ /* synthetic */ void n(cev cevVar) {
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
