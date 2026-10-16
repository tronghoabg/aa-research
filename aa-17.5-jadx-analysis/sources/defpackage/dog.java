package defpackage;

/* loaded from: classes2.dex */
final class dog extends afgk {
    final /* synthetic */ doi a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dog(doi doiVar, ncp ncpVar) {
        super(ncpVar);
        this.a = doiVar;
    }

    @Override // defpackage.afgk
    public final /* bridge */ /* synthetic */ void afterChange(afia afiaVar, Object obj, Object obj2) {
        dph dphVarP;
        ncp ncpVar = (ncp) obj2;
        String name = afiaVar.getName();
        ncpVar.getClass();
        rz rzVar = (rz) ncpVar.c;
        if (rzVar.q() && ((rz) ncpVar.a).q()) {
            dphVarP = ((rz) ncpVar.b).p();
        } else {
            dpl dplVar = new dpl(new char[0]);
            if (!rzVar.q()) {
                dplVar.r("min", rzVar.p());
            }
            rz rzVar2 = (rz) ncpVar.a;
            if (!rzVar2.q()) {
                dplVar.r("max", rzVar2.p());
            }
            dplVar.r("value", ((rz) ncpVar.b).p());
            dphVarP = dplVar;
        }
        this.a.b.r(name, dphVarP);
    }
}
