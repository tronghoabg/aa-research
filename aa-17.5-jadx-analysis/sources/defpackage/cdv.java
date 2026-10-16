package defpackage;

/* loaded from: classes.dex */
public final class cdv extends cdw {
    public cdv(long j, cej cejVar) {
        super(j, cejVar, null, new bwr(5));
    }

    @Override // defpackage.cdw
    public final cdw a(afec afecVar, afec afecVar2) {
        beq beqVar = new beq(afecVar, afecVar2, 3, null);
        afec afecVar3 = cek.a;
        return (cdw) ((cec) cek.k(new bji(beqVar, 20)));
    }

    @Override // defpackage.cdw, defpackage.cec
    public final cec b(afec afecVar) {
        ado adoVar = new ado(afecVar, 5);
        afec afecVar2 = cek.a;
        return (cea) ((cec) cek.k(new bji(adoVar, 20)));
    }

    @Override // defpackage.cdw
    public final ceg c() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }

    @Override // defpackage.cdw, defpackage.cec
    public final void d() {
        synchronized (cek.b) {
            z();
        }
    }

    @Override // defpackage.cdw, defpackage.cec
    public final void e() {
        cek.k(cek.a);
    }

    @Override // defpackage.cdw, defpackage.cec
    public final /* synthetic */ void f() {
        byx.o();
    }

    @Override // defpackage.cdw, defpackage.cec
    public final /* synthetic */ void g() {
        byx.o();
    }
}
