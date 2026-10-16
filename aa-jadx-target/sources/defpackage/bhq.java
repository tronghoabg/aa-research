package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class bhq implements defpackage.affg {
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ bhq(defpackage.bfk bfkVar, defpackage.dfa dfaVar, defpackage.ask askVar, defpackage.kwv kwvVar, int i) {
        this.e = i;
        this.b = bfkVar;
        this.c = dfaVar;
        this.d = askVar;
        this.a = kwvVar;
    }

    /* JADX WARN: Type inference failed for: r10v5, types: [ask, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [cgf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [affg, java.lang.Object] */
    @Override // defpackage.affg
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int i = 10;
        if (this.e != 0) {
            defpackage.bve bveVar = (defpackage.bve) obj;
            int iIntValue = ((java.lang.Integer) obj2).intValue();
            if (bveVar.I((iIntValue & 3) != 2, iIntValue & 1)) {
                java.lang.Object obj3 = this.c;
                java.lang.Object obj4 = this.b;
                defpackage.cjy cjyVar = new defpackage.cjy(new defpackage.beh(obj4, obj3, 2, null));
                java.lang.Object objG = bveVar.g();
                java.lang.Object obj5 = defpackage.bvd.a;
                if (objG == obj5) {
                    objG = new defpackage.bev(7);
                    bveVar.x(objG);
                }
                java.lang.Object obj6 = this.a;
                ?? r10 = this.d;
                java.util.concurrent.atomic.AtomicInteger atomicInteger = defpackage.dea.a;
                defpackage.cgf cgfVarH = defpackage.tq.h(cjyVar.a(new defpackage.ddo(false, (defpackage.affc) objG)).a(new defpackage.bfn(new defpackage.cdz((defpackage.bfk) obj4, (defpackage.dfa) obj3))).a(new defpackage.akg(r10)), defpackage.cqz.c);
                boolean zE = bveVar.E(obj4) | bveVar.C(obj3) | bveVar.E(obj6);
                java.lang.Object objG2 = bveVar.g();
                if (zE || objG2 == obj5) {
                    objG2 = new defpackage.ajz(obj3, obj6, i);
                    bveVar.x(objG2);
                }
                defpackage.atp.c(cgfVarH.a(new defpackage.ajq(r10, (defpackage.afer) objG2)), bveVar, 0);
            } else {
                bveVar.s();
            }
            return defpackage.afbk.a;
        }
        defpackage.bve bveVar2 = (defpackage.bve) obj;
        int iIntValue2 = ((java.lang.Integer) obj2).intValue();
        int i2 = iIntValue2 & 3;
        if (bveVar2.I(i2 != 2, iIntValue2 & 1)) {
            java.lang.Object obj7 = this.b;
            java.lang.Object objG3 = bveVar2.g();
            java.lang.Object obj8 = defpackage.bvd.a;
            if (objG3 == obj8) {
                objG3 = new defpackage.bge(obj7, 11);
                bveVar2.x(objG3);
            }
            defpackage.cgf cgfVarE = defpackage.ty.e(this.a, (defpackage.affc) objG3);
            defpackage.cty ctyVarB = defpackage.atp.b(defpackage.cfs.a, true);
            int iF = defpackage.a.f(bveVar2.b());
            defpackage.cdd cddVarN = bveVar2.N();
            defpackage.cgf cgfVarN = defpackage.bzo.n(bveVar2, cgfVarE);
            defpackage.afer aferVar = defpackage.cwl.a;
            bveVar2.M();
            bveVar2.w();
            if (bveVar2.G()) {
                bveVar2.j(aferVar);
            } else {
                bveVar2.y();
            }
            ?? r7 = this.c;
            defpackage.byw.c(bveVar2, ctyVarB, defpackage.cwl.e);
            defpackage.byw.c(bveVar2, cddVarN, defpackage.cwl.d);
            defpackage.byw.c(bveVar2, java.lang.Integer.valueOf(iF), defpackage.cwl.f);
            defpackage.byw.b(bveVar2, defpackage.cwl.g);
            defpackage.byw.c(bveVar2, cgfVarN, defpackage.cwl.c);
            r7.invoke(bveVar2, 0);
            java.lang.Object objG4 = bveVar2.g();
            if (objG4 == obj8) {
                objG4 = new defpackage.bfd(obj7, 10);
                bveVar2.x(objG4);
            }
            ((defpackage.bhp) this.d).c((defpackage.afer) objG4, bveVar2, 6);
            bveVar2.n();
        } else {
            bveVar2.s();
        }
        return defpackage.afbk.a;
    }

    public /* synthetic */ bhq(defpackage.cgf cgfVar, defpackage.bwx bwxVar, defpackage.affg affgVar, defpackage.bhp bhpVar, int i) {
        this.e = i;
        this.a = cgfVar;
        this.b = bwxVar;
        this.c = affgVar;
        this.d = bhpVar;
    }
}
