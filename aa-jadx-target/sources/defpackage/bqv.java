package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bqv {
    public static final defpackage.bvm a = new defpackage.bvv(defpackage.bxv.c, new defpackage.bli(11));

    public static final defpackage.cgf a(defpackage.cgf cgfVar, defpackage.cld cldVar, long j, defpackage.ajl ajlVar, float f) {
        defpackage.cgf ajkVar;
        defpackage.cgf cgfVarA = cgfVar.a(f > 0.0f ? defpackage.cjv.h(defpackage.cgf.e, 0.0f, 0.0f, 0.0f, f, 0.0f, cldVar, false, 0, 1042399) : defpackage.cgf.e);
        if (ajlVar != null) {
            ajkVar = new defpackage.ajk(ajlVar.a, ajlVar.b, cldVar);
        } else {
            ajkVar = defpackage.cgf.e;
        }
        return defpackage.cjv.h(cgfVarA.a(ajkVar).a(new defpackage.ajc(j, cldVar)), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, cldVar, true, 0, 1042431);
    }

    public static final void b(defpackage.cgf cgfVar, defpackage.cld cldVar, long j, long j2, float f, defpackage.ajl ajlVar, final defpackage.affg affgVar, defpackage.bve bveVar, int i) {
        if ((i & 1) != 0) {
            cgfVar = defpackage.cgf.e;
        }
        final defpackage.cgf cgfVar2 = cgfVar;
        if ((i & 2) != 0) {
            cldVar = defpackage.cky.a;
        }
        final defpackage.cld cldVar2 = cldVar;
        final long j3 = (i & 4) != 0 ? ((defpackage.bol) bveVar.f(defpackage.bom.a)).a.p : j;
        long jD = (i & 8) != 0 ? defpackage.bnl.d(j3, bveVar) : j2;
        final float f2 = (i & 32) != 0 ? 0.0f : f;
        final defpackage.ajl ajlVar2 = (i & 64) != 0 ? null : ajlVar;
        defpackage.bvm bvmVar = a;
        final float f3 = 0.0f + ((defpackage.dlr) bveVar.f(bvmVar)).a;
        defpackage.dai.aB(new defpackage.bxk[]{defpackage.bnq.a.b(new defpackage.ckd(jD)), bvmVar.b(new defpackage.dlr(f3))}, defpackage.dai.as(421772006, true, new defpackage.affg() { // from class: bqs
            @Override // defpackage.affg
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                defpackage.bve bveVar2 = (defpackage.bve) obj;
                int iIntValue = ((java.lang.Integer) obj2).intValue();
                int i2 = iIntValue & 3;
                int i3 = iIntValue & 1;
                defpackage.bvm bvmVar2 = defpackage.bqv.a;
                if (bveVar2.I(i2 != 2, i3)) {
                    float f4 = f2;
                    defpackage.ajl ajlVar3 = ajlVar2;
                    float f5 = f3;
                    defpackage.cgf cgfVarA = defpackage.bqv.a(cgfVar2, cldVar2, defpackage.bnl.c(((defpackage.bol) bveVar2.f(defpackage.bom.a)).a, j3, f5, bveVar2), ajlVar3, ((defpackage.dlo) bveVar2.f(defpackage.dbl.d)).dI(f4));
                    java.lang.Object objG = bveVar2.g();
                    java.lang.Object obj3 = defpackage.bvd.a;
                    if (objG == obj3) {
                        objG = new defpackage.bmo(12);
                        bveVar2.x(objG);
                    }
                    java.util.concurrent.atomic.AtomicInteger atomicInteger = defpackage.dea.a;
                    defpackage.cgf cgfVarA2 = cgfVarA.a(new defpackage.ddo(false, (defpackage.affc) objG));
                    defpackage.afbk afbkVar = defpackage.afbk.a;
                    java.lang.Object objG2 = bveVar2.g();
                    if (objG2 == obj3) {
                        objG2 = defpackage.ghg.b;
                        bveVar2.x(objG2);
                    }
                    defpackage.cqu cquVar = defpackage.crq.a;
                    defpackage.cgf cgfVarA3 = cgfVarA2.a(new defpackage.crp(afbkVar, null, (androidx.compose.ui.input.pointer.PointerInputEventHandler) objG2));
                    defpackage.cty ctyVarB = defpackage.atp.b(defpackage.cfs.a, true);
                    long jB = bveVar2.b();
                    long j4 = jB ^ (jB >>> 32);
                    defpackage.cdd cddVarN = bveVar2.N();
                    defpackage.cgf cgfVarN = defpackage.bzo.n(bveVar2, cgfVarA3);
                    defpackage.afer aferVar = defpackage.cwl.a;
                    bveVar2.M();
                    bveVar2.w();
                    if (bveVar2.G()) {
                        bveVar2.j(aferVar);
                    } else {
                        bveVar2.y();
                    }
                    defpackage.affg affgVar2 = affgVar;
                    defpackage.byw.c(bveVar2, ctyVarB, defpackage.cwl.e);
                    defpackage.byw.c(bveVar2, cddVarN, defpackage.cwl.d);
                    defpackage.byw.c(bveVar2, java.lang.Integer.valueOf((int) j4), defpackage.cwl.f);
                    bveVar2.i(afbkVar, new defpackage.amc(defpackage.cwl.g, 16));
                    defpackage.byw.c(bveVar2, cgfVarN, defpackage.cwl.c);
                    affgVar2.invoke(bveVar2, 0);
                    bveVar2.n();
                } else {
                    bveVar2.s();
                }
                return defpackage.afbk.a;
            }
        }, bveVar), bveVar, 56);
    }

    public static final void c(final defpackage.afer aferVar, defpackage.cgf cgfVar, boolean z, defpackage.cld cldVar, long j, long j2, float f, float f2, defpackage.ajl ajlVar, defpackage.ask askVar, final defpackage.affg affgVar, defpackage.bve bveVar, int i) {
        final defpackage.ask askVar2;
        final defpackage.cgf cgfVar2 = (i & 2) != 0 ? defpackage.cgf.e : cgfVar;
        final boolean z2 = (!((i & 4) == 0)) | z;
        final defpackage.cld cldVar2 = (i & 8) != 0 ? defpackage.cky.a : cldVar;
        final long j3 = (i & 16) != 0 ? ((defpackage.bol) bveVar.f(defpackage.bom.a)).a.p : j;
        long jD = (i & 32) != 0 ? defpackage.bnl.d(j3, bveVar) : j2;
        float f3 = (i & 64) != 0 ? 0.0f : f;
        final float f4 = (i & 128) != 0 ? 0.0f : f2;
        defpackage.ajl ajlVar2 = (i & 256) != 0 ? null : ajlVar;
        if (askVar == null) {
            bveVar.v(-1701074900);
            java.lang.Object objG = bveVar.g();
            if (objG == defpackage.bvd.a) {
                objG = new defpackage.asl();
                bveVar.x(objG);
            }
            askVar2 = (defpackage.ask) objG;
            bveVar.o();
        } else {
            bveVar.v(2023335947);
            bveVar.o();
            askVar2 = askVar;
        }
        defpackage.bvm bvmVar = a;
        final float f5 = ((defpackage.dlr) bveVar.f(bvmVar)).a + f3;
        final defpackage.ajl ajlVar3 = ajlVar2;
        defpackage.dai.aB(new defpackage.bxk[]{defpackage.bnq.a.b(new defpackage.ckd(jD)), bvmVar.b(new defpackage.dlr(f5))}, defpackage.dai.as(849208527, true, new defpackage.affg() { // from class: bqt
            @Override // defpackage.affg
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                defpackage.bve bveVar2 = (defpackage.bve) obj;
                int iIntValue = ((java.lang.Integer) obj2).intValue();
                int i2 = iIntValue & 3;
                int i3 = iIntValue & 1;
                defpackage.bvm bvmVar2 = defpackage.bqv.a;
                if (bveVar2.I(i2 != 2, i3)) {
                    float f6 = f4;
                    defpackage.afer aferVar2 = aferVar;
                    boolean z3 = z2;
                    defpackage.ajl ajlVar4 = ajlVar3;
                    float f7 = f5;
                    long j4 = j3;
                    defpackage.cld cldVar3 = cldVar2;
                    defpackage.ask askVar3 = askVar2;
                    defpackage.cgf cgfVar3 = cgfVar2;
                    defpackage.csu csuVar = defpackage.bok.a;
                    defpackage.cgf cgfVarA = cgfVar3.a(defpackage.bou.a);
                    defpackage.bvm bvmVar3 = defpackage.bpk.a;
                    java.lang.Object obj3 = ((defpackage.khb) bveVar2.f(bvmVar3)).a;
                    defpackage.cgf cgfVarA2 = defpackage.bqv.a(cgfVarA.a(defpackage.cgf.e), cldVar3, defpackage.bnl.c(((defpackage.bol) bveVar2.f(defpackage.bom.a)).a, j4, f7, bveVar2), ajlVar4, ((defpackage.dlo) bveVar2.f(defpackage.dbl.d)).dI(f6));
                    java.lang.Object obj4 = ((defpackage.khb) bveVar2.f(bvmVar3)).a;
                    defpackage.cgf cgfVarA3 = defpackage.afw.w(cgfVarA2, askVar3, defpackage.bpk.a(false, 0.0f, 0L, cldVar3, true, 215), z3, null, aferVar2).a(new defpackage.bsv(new defpackage.bev(19)));
                    defpackage.cty ctyVarB = defpackage.atp.b(defpackage.cfs.a, true);
                    long jB = bveVar2.b();
                    long j5 = jB ^ (jB >>> 32);
                    defpackage.cdd cddVarN = bveVar2.N();
                    defpackage.cgf cgfVarN = defpackage.bzo.n(bveVar2, cgfVarA3);
                    defpackage.afer aferVar3 = defpackage.cwl.a;
                    bveVar2.M();
                    bveVar2.w();
                    if (bveVar2.G()) {
                        bveVar2.j(aferVar3);
                    } else {
                        bveVar2.y();
                    }
                    defpackage.affg affgVar2 = affgVar;
                    defpackage.byw.c(bveVar2, ctyVarB, defpackage.cwl.e);
                    defpackage.byw.c(bveVar2, cddVarN, defpackage.cwl.d);
                    defpackage.byw.c(bveVar2, java.lang.Integer.valueOf((int) j5), defpackage.cwl.f);
                    bveVar2.i(defpackage.afbk.a, new defpackage.amc(defpackage.cwl.g, 16));
                    defpackage.byw.c(bveVar2, cgfVarN, defpackage.cwl.c);
                    affgVar2.invoke(bveVar2, 0);
                    bveVar2.n();
                } else {
                    bveVar2.s();
                }
                return defpackage.afbk.a;
            }
        }, bveVar), bveVar, 56);
    }
}
