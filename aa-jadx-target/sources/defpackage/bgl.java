package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class bgl implements defpackage.affg {
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ bgl(afgs afgsVar, defpackage.aqp aqpVar, defpackage.izq izqVar, int i) {
        this.d = i;
        this.c = afgsVar;
        this.a = aqpVar;
        this.b = izqVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [cgf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [affg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v23, types: [affg, java.lang.Object] */
    @Override // defpackage.affg
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.d;
        if (i == 0) {
            defpackage.bve bveVar = (defpackage.bve) obj;
            int iIntValue = ((java.lang.Integer) obj2).intValue();
            if (bveVar.I((iIntValue & 3) != 2, iIntValue & 1)) {
                java.lang.Object objG = bveVar.g();
                if (objG == defpackage.bvd.a) {
                    defpackage.bge bgeVar = new defpackage.bge(this.b, 3);
                    bveVar.x(bgeVar);
                    objG = bgeVar;
                }
                defpackage.cgf cgfVarE = defpackage.ty.e(this.a, (defpackage.affc) objG);
                defpackage.cty ctyVarB = defpackage.atp.b(defpackage.cfs.a, true);
                int iF = defpackage.a.f(bveVar.b());
                defpackage.cdd cddVarN = bveVar.N();
                defpackage.cgf cgfVarN = defpackage.bzo.n(bveVar, cgfVarE);
                defpackage.afer aferVar = defpackage.cwl.a;
                bveVar.M();
                bveVar.w();
                if (bveVar.G()) {
                    bveVar.j(aferVar);
                } else {
                    bveVar.y();
                }
                ?? r6 = this.c;
                defpackage.byw.c(bveVar, ctyVarB, defpackage.cwl.e);
                defpackage.byw.c(bveVar, cddVarN, defpackage.cwl.d);
                defpackage.byw.c(bveVar, java.lang.Integer.valueOf(iF), defpackage.cwl.f);
                defpackage.byw.b(bveVar, defpackage.cwl.g);
                defpackage.byw.c(bveVar, cgfVarN, defpackage.cwl.c);
                r6.invoke(bveVar, 0);
                bveVar.n();
            } else {
                bveVar.s();
            }
            return defpackage.afbk.a;
        }
        if (i == 1) {
            float fFloatValue = ((java.lang.Float) obj).floatValue();
            ((java.lang.Float) obj2).floatValue();
            afgs afgsVar = (afgs) this.c;
            float f = fFloatValue - afgsVar.a;
            defpackage.aqp aqpVar = (defpackage.aqp) this.a;
            afgsVar.a += aqpVar.a(aqpVar.b(((defpackage.izq) this.b).p(aqpVar.f(aqpVar.a(f)))));
            return defpackage.afbk.a;
        }
        defpackage.bve bveVar2 = (defpackage.bve) obj;
        int iIntValue2 = ((java.lang.Integer) obj2).intValue();
        if (bveVar2.I((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
            java.lang.Object obj3 = this.a;
            boolean zE = bveVar2.E(obj3);
            java.lang.Object objG2 = bveVar2.g();
            if (zE || objG2 == defpackage.bvd.a) {
                objG2 = new defpackage.ber((defpackage.dcx) obj3, (defpackage.afdk) null, 6);
                bveVar2.x(objG2);
            }
            defpackage.dcx dcxVar = (defpackage.dcx) obj3;
            defpackage.czz czzVar = dcxVar.a;
            defpackage.bvx.g(czzVar, (defpackage.affg) objG2, bveVar2);
            boolean zE2 = bveVar2.E(obj3);
            java.lang.Object objG3 = bveVar2.g();
            if (zE2 || objG3 == defpackage.bvd.a) {
                objG3 = new defpackage.ber(dcxVar, (defpackage.afdk) null, 7, (byte[]) null);
                bveVar2.x(objG3);
            }
            ?? r8 = this.c;
            java.lang.Object obj4 = this.b;
            defpackage.bvx.g(czzVar, (defpackage.affg) objG3, bveVar2);
            ((defpackage.dbi) obj4).e(czzVar, r8, bveVar2, 0);
        } else {
            bveVar2.s();
        }
        return defpackage.afbk.a;
    }

    public /* synthetic */ bgl(java.lang.Object obj, java.lang.Object obj2, defpackage.affg affgVar, int i) {
        this.d = i;
        this.a = obj;
        this.b = obj2;
        this.c = affgVar;
    }
}
