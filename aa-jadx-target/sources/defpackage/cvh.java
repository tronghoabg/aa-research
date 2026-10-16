package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cvh {
    public static final defpackage.cvg a = new defpackage.cvg();
    public static final java.lang.Object b = new java.lang.Object();

    public static final void a(defpackage.cgf cgfVar, defpackage.affg affgVar, defpackage.bve bveVar, int i, int i2) {
        int i3;
        defpackage.bve bveVarC = bveVar.c(-1298353104);
        if (i2 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (true != bveVarC.C(cgfVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != bveVarC.E(affgVar) ? 16 : 32;
        }
        if (bveVarC.I((i3 & 19) != 18, i3 & 1)) {
            if (i2 != 0) {
                cgfVar = defpackage.cgf.e;
            }
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            java.lang.Object objS = bwcVar.S();
            if (objS == defpackage.bvd.a) {
                objS = new defpackage.cvl(defpackage.cuh.a);
                bwcVar.ad(objS);
            }
            b((defpackage.cvl) objS, cgfVar, affgVar, bveVarC, (i3 << 3) & 1008);
        } else {
            bveVarC.s();
        }
        defpackage.cgf cgfVar2 = cgfVar;
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.fxi(cgfVar2, affgVar, i, i2, 1, null);
        }
    }

    public static final void b(defpackage.cvl cvlVar, defpackage.cgf cgfVar, defpackage.affg affgVar, defpackage.bve bveVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-511989831);
        if (i3 == 0) {
            i2 = (true != bveVarC.E(cvlVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i4 = 16;
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.C(cgfVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != bveVarC.E(affgVar) ? 128 : 256;
        }
        if (bveVarC.I((i2 & 147) != 146, i2 & 1)) {
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            long j = bwcVar.u;
            long j2 = (j >>> 32) ^ j;
            defpackage.bvi bviVarD = bveVarC.d();
            defpackage.cgf cgfVarN = defpackage.bzo.n(bveVarC, cgfVar);
            defpackage.cdd cddVarAh = bwcVar.ah();
            defpackage.afer aferVar = defpackage.cxl.a;
            bveVarC.w();
            if (bwcVar.t) {
                bveVarC.j(aferVar);
            } else {
                bveVarC.y();
            }
            defpackage.byw.c(bveVarC, cvlVar, cvlVar.c);
            defpackage.byw.c(bveVarC, bviVarD, cvlVar.d);
            defpackage.byw.c(bveVarC, affgVar, cvlVar.e);
            defpackage.byw.c(bveVarC, cddVarAh, defpackage.cwl.d);
            bveVarC.i(defpackage.afbk.a, new defpackage.amc(defpackage.cwl.g, i4));
            defpackage.byw.c(bveVarC, cgfVarN, defpackage.cwl.c);
            defpackage.byw.c(bveVarC, java.lang.Integer.valueOf((int) j2), defpackage.cwl.f);
            bwcVar.Y(true);
            if (bveVarC.H()) {
                bveVarC.v(-1259187287);
                bwcVar.Y(false);
            } else {
                bveVarC.v(-1259245908);
                boolean zE = bveVarC.E(cvlVar);
                java.lang.Object objS = bwcVar.S();
                if (zE || objS == defpackage.bvd.a) {
                    objS = new defpackage.cew(cvlVar, 3);
                    bwcVar.ad(objS);
                }
                bveVarC.r((defpackage.afer) objS);
                bwcVar.Y(false);
            }
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.cvf((java.lang.Object) cvlVar, (java.lang.Object) cgfVar, (java.lang.Object) affgVar, i, 0);
        }
    }
}
