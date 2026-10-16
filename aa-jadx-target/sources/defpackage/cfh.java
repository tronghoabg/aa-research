package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cfh extends defpackage.ced {
    public defpackage.affc l;
    public defpackage.affc m;
    public final long n;
    private final defpackage.ced o;
    private final boolean p;
    private final boolean q;

    /* JADX WARN: Illegal instructions before constructor call */
    public cfh(defpackage.ced cedVar, defpackage.affc affcVar, defpackage.affc affcVar2, boolean z, boolean z2) {
        defpackage.affc affcVarK;
        defpackage.affc affcVarI;
        defpackage.affc affcVar3 = defpackage.cer.a;
        super(0L, defpackage.ceq.a, defpackage.cer.n(affcVar, (cedVar == null || (affcVarI = cedVar.i()) == null) ? defpackage.cer.h.a : affcVarI, z), defpackage.cer.o(affcVar2, (cedVar == null || (affcVarK = cedVar.k()) == null) ? defpackage.cer.h.b : affcVarK));
        this.o = cedVar;
        this.p = z;
        this.q = z2;
        this.l = this.a;
        this.m = this.b;
        this.n = java.lang.Thread.currentThread().getId();
    }

    private final defpackage.ced E() {
        defpackage.ced cedVar = this.o;
        return cedVar == null ? defpackage.cer.h : cedVar;
    }

    @Override // defpackage.cej
    public final void A(defpackage.ceq ceqVar) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // defpackage.cej
    public final void B(long j) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // defpackage.ced
    public final defpackage.ced a(defpackage.affc affcVar, defpackage.affc affcVar2) {
        defpackage.affc affcVarN = defpackage.cer.n(affcVar, this.l, true);
        defpackage.affc affcVarO = defpackage.cer.o(affcVar2, this.m);
        return !this.p ? new defpackage.cfh(E().a(null, affcVarO), affcVarN, affcVarO, false, true) : E().a(affcVarN, affcVarO);
    }

    @Override // defpackage.ced, defpackage.cej
    public final defpackage.cej b(defpackage.affc affcVar) {
        defpackage.affc affcVarN = defpackage.cer.n(affcVar, this.l, true);
        return !this.p ? defpackage.cer.a(E().b(null), affcVarN, true) : E().b(affcVarN);
    }

    @Override // defpackage.ced
    public final defpackage.cen c() {
        return E().c();
    }

    @Override // defpackage.ced, defpackage.cej
    public final void d() {
        defpackage.ced cedVar;
        D();
        if (!this.q || (cedVar = this.o) == null) {
            return;
        }
        cedVar.d();
    }

    @Override // defpackage.ced, defpackage.cej
    public final void e() {
        E().e();
    }

    @Override // defpackage.ced, defpackage.cej
    public final /* synthetic */ void f() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // defpackage.ced, defpackage.cej
    public final /* synthetic */ void g() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // defpackage.ced, defpackage.cej
    public final int h() {
        return E().h();
    }

    @Override // defpackage.ced, defpackage.cej
    public final /* synthetic */ defpackage.affc i() {
        return this.l;
    }

    @Override // defpackage.ced
    /* JADX INFO: renamed from: j */
    public final defpackage.affc i() {
        return this.l;
    }

    @Override // defpackage.ced, defpackage.cej
    public final defpackage.affc k() {
        return this.m;
    }

    @Override // defpackage.ced, defpackage.cej
    public final void n(defpackage.cfc cfcVar) {
        E().n(cfcVar);
    }

    @Override // defpackage.ced, defpackage.cej
    public final void q(int i) {
        E().q(i);
    }

    @Override // defpackage.ced, defpackage.cej
    public final boolean r() {
        E().r();
        return false;
    }

    @Override // defpackage.ced
    public final defpackage.aaw s() {
        return E().s();
    }

    @Override // defpackage.ced
    public final void u(defpackage.aaw aawVar) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // defpackage.cej
    public final long v() {
        return E().v();
    }

    @Override // defpackage.cej
    public final defpackage.ceq x() {
        return E().x();
    }
}
