package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cec extends defpackage.ced {
    public cec(long j, defpackage.ceq ceqVar) {
        super(j, ceqVar, null, new defpackage.bwy(5));
    }

    @Override // defpackage.ced
    public final defpackage.ced a(defpackage.affc affcVar, defpackage.affc affcVar2) {
        defpackage.bet betVar = new defpackage.bet(affcVar, affcVar2, 3, null);
        defpackage.affc affcVar3 = defpackage.cer.a;
        return (defpackage.ced) ((defpackage.cej) defpackage.cer.k(new defpackage.bjm(betVar, 19)));
    }

    @Override // defpackage.ced, defpackage.cej
    public final defpackage.cej b(defpackage.affc affcVar) {
        defpackage.adv advVar = new defpackage.adv(affcVar, 5);
        defpackage.affc affcVar2 = defpackage.cer.a;
        return (defpackage.ceh) ((defpackage.cej) defpackage.cer.k(new defpackage.bjm(advVar, 19)));
    }

    @Override // defpackage.ced
    public final defpackage.cen c() {
        throw new java.lang.IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }

    @Override // defpackage.ced, defpackage.cej
    public final void d() {
        synchronized (defpackage.cer.b) {
            z();
        }
    }

    @Override // defpackage.ced, defpackage.cej
    public final void e() {
        defpackage.cer.k(defpackage.cer.a);
    }

    @Override // defpackage.ced, defpackage.cej
    public final /* synthetic */ void f() {
        defpackage.bzd.n();
    }

    @Override // defpackage.ced, defpackage.cej
    public final /* synthetic */ void g() {
        defpackage.bzd.n();
    }
}
