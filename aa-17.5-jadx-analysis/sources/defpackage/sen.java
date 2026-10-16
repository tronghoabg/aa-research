package defpackage;

/* loaded from: classes2.dex */
final class sen implements epf {
    final /* synthetic */ seq a;

    public sen(seq seqVar) {
        this.a = seqVar;
    }

    @Override // defpackage.epf
    public final void fv(eqa eqaVar) {
        yop yopVarAi = seq.a.l().ai(8831);
        seq seqVar = this.a;
        yopVarAi.y("AppInstaller registering session callback for pkg=%s", seqVar.b);
        seqVar.e.registerSessionCallback(seqVar.f);
    }

    @Override // defpackage.epf
    public final void fw(eqa eqaVar) {
        yop yopVarAi = seq.a.l().ai(8832);
        seq seqVar = this.a;
        yopVarAi.y("AppInstaller unregistering session callback for pkg=%s", seqVar.b);
        seqVar.e.unregisterSessionCallback(seqVar.f);
    }

    @Override // defpackage.epf
    public final /* synthetic */ void fM() {
    }

    @Override // defpackage.epf
    public final /* synthetic */ void fL(eqa eqaVar) {
    }

    @Override // defpackage.epf
    public final /* synthetic */ void fx(eqa eqaVar) {
    }

    @Override // defpackage.epf
    public final /* synthetic */ void fy(eqa eqaVar) {
    }
}
