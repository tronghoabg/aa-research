package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class bjt implements defpackage.affh {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ java.lang.Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ bjt(java.lang.Object obj, boolean z, int i) {
        this.c = i;
        this.b = obj;
        this.a = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [afer, java.lang.Object] */
    @Override // defpackage.affh
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        if (this.c == 0) {
            defpackage.cgf cgfVar = (defpackage.cgf) obj;
            defpackage.bve bveVar = (defpackage.bve) obj2;
            ((java.lang.Integer) obj3).intValue();
            bveVar.v(-196777734);
            final long j = ((defpackage.blz) bveVar.f(defpackage.bma.a)).a;
            boolean zB = bveVar.B(j);
            final ?? r2 = this.b;
            boolean zC = zB | bveVar.C(r2);
            final boolean z = this.a;
            boolean zD = zC | bveVar.D(z);
            java.lang.Object objG = bveVar.g();
            if (zD || objG == defpackage.bvd.a) {
                objG = new defpackage.affc() { // from class: bju
                    @Override // defpackage.affc
                    public final java.lang.Object invoke(java.lang.Object obj4) {
                        defpackage.chg chgVar = (defpackage.chg) obj4;
                        return chgVar.q(new defpackage.bjv(r2, z, defpackage.axd.y(chgVar, java.lang.Float.intBitsToFloat((int) (chgVar.n() >> 32)) / 2.0f), new defpackage.cjx(j, 5), 0));
                    }
                };
                bveVar.x(objG);
            }
            defpackage.cgf cgfVarAk = defpackage.dai.ak(cgfVar, (defpackage.affc) objG);
            bveVar.o();
            return cgfVarAk;
        }
        defpackage.bve bveVar2 = (defpackage.bve) obj2;
        ((java.lang.Integer) obj3).intValue();
        bveVar2.v(-2137546592);
        java.lang.Object objF = bveVar2.f(defpackage.dbl.i);
        java.lang.Object obj4 = this.b;
        defpackage.bff bffVar = (defpackage.bff) obj4;
        boolean z2 = bffVar.c() == defpackage.apn.a || objF != defpackage.dlz.b;
        boolean zC2 = bveVar2.C(obj4);
        java.lang.Object objG2 = bveVar2.g();
        if (zC2 || objG2 == defpackage.bvd.a) {
            objG2 = new defpackage.bbs(obj4, 19);
            bveVar2.x(objG2);
        }
        defpackage.bys bysVarC = defpackage.bzd.c((defpackage.affc) objG2, bveVar2);
        java.lang.Object objG3 = bveVar2.g();
        java.lang.Object obj5 = defpackage.bvd.a;
        if (objG3 == obj5) {
            defpackage.ano anoVar = new defpackage.ano(new defpackage.act(bysVarC, 16));
            bveVar2.x(anoVar);
            objG3 = anoVar;
        }
        defpackage.aqk aqkVar = (defpackage.aqk) objG3;
        boolean zC3 = bveVar2.C(aqkVar) | bveVar2.C(obj4);
        java.lang.Object objG4 = bveVar2.g();
        if (zC3 || objG4 == obj5) {
            objG4 = new defpackage.bfe(aqkVar, bffVar);
            bveVar2.x(objG4);
        }
        defpackage.apz apzVar = new defpackage.apz((defpackage.bfe) objG4, bffVar.c(), this.a && bffVar.a() != 0.0f, z2, null);
        bveVar2.o();
        return apzVar;
    }
}
