package defpackage;

/* loaded from: classes.dex */
public final class cfa extends cdw {
    public afec l;
    public afec m;
    public final long n;
    private final cdw o;
    private final boolean p;
    private final boolean q;

    /* JADX WARN: Illegal instructions before constructor call */
    public cfa(cdw cdwVar, afec afecVar, afec afecVar2, boolean z, boolean z2) {
        afec afecVarK;
        afec afecVarI;
        afec afecVar3 = cek.a;
        super(0L, cej.a, cek.n(afecVar, (cdwVar == null || (afecVarI = cdwVar.i()) == null) ? cek.h.a : afecVarI, z), cek.o(afecVar2, (cdwVar == null || (afecVarK = cdwVar.k()) == null) ? cek.h.b : afecVarK));
        this.o = cdwVar;
        this.p = z;
        this.q = z2;
        this.l = this.a;
        this.m = this.b;
        this.n = Thread.currentThread().getId();
    }

    private final cdw F() {
        cdw cdwVar = this.o;
        return cdwVar == null ? cek.h : cdwVar;
    }

    @Override // defpackage.cec
    public final void A(cej cejVar) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.cec
    public final void B(long j) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.cdw
    public final cdw a(afec afecVar, afec afecVar2) {
        afec afecVarN = cek.n(afecVar, this.l, true);
        afec afecVarO = cek.o(afecVar2, this.m);
        return !this.p ? new cfa(F().a(null, afecVarO), afecVarN, afecVarO, false, true) : F().a(afecVarN, afecVarO);
    }

    @Override // defpackage.cdw, defpackage.cec
    public final cec b(afec afecVar) {
        afec afecVarN = cek.n(afecVar, this.l, true);
        return !this.p ? cek.a(F().b(null), afecVarN, true) : F().b(afecVarN);
    }

    @Override // defpackage.cdw
    public final ceg c() {
        return F().c();
    }

    @Override // defpackage.cdw, defpackage.cec
    public final void d() {
        cdw cdwVar;
        D();
        if (!this.q || (cdwVar = this.o) == null) {
            return;
        }
        cdwVar.d();
    }

    @Override // defpackage.cdw, defpackage.cec
    public final void e() {
        F().e();
    }

    @Override // defpackage.cdw, defpackage.cec
    public final /* synthetic */ void f() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.cdw, defpackage.cec
    public final /* synthetic */ void g() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.cdw, defpackage.cec
    public final int h() {
        return F().h();
    }

    @Override // defpackage.cdw, defpackage.cec
    public final /* synthetic */ afec i() {
        return this.l;
    }

    @Override // defpackage.cdw
    /* renamed from: j */
    public final afec i() {
        return this.l;
    }

    @Override // defpackage.cdw, defpackage.cec
    public final afec k() {
        return this.m;
    }

    @Override // defpackage.cdw, defpackage.cec
    public final void n(cev cevVar) {
        F().n(cevVar);
    }

    @Override // defpackage.cdw, defpackage.cec
    public final void q(int i) {
        F().q(i);
    }

    @Override // defpackage.cdw, defpackage.cec
    public final boolean r() {
        F().r();
        return false;
    }

    @Override // defpackage.cdw
    public final aap s() {
        return F().s();
    }

    @Override // defpackage.cdw
    public final void u(aap aapVar) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.cec
    public final long v() {
        return F().v();
    }

    @Override // defpackage.cec
    public final cej x() {
        return F().x();
    }
}
