package defpackage;

/* loaded from: classes.dex */
public final class cuy {
    public static final cux a = new cux();
    public static final Object b = new Object();

    public static final void a(cfy cfyVar, afeg afegVar, bux buxVar, int i, int i2) {
        int i3;
        bux buxVarC = buxVar.c(-1298353104);
        if (i2 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (true != buxVarC.C(cfyVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != buxVarC.E(afegVar) ? 16 : 32;
        }
        if (buxVarC.I((i3 & 19) != 18, i3 & 1)) {
            if (i2 != 0) {
                cfyVar = cfy.e;
            }
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            if (objS == buw.a) {
                objS = new cvc(cty.a);
                bvvVar.ad(objS);
            }
            b((cvc) objS, cfyVar, afegVar, buxVarC, (i3 << 3) & 1008);
        } else {
            buxVarC.s();
        }
        cfy cfyVar2 = cfyVar;
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new fwz(cfyVar2, afegVar, i, i2, 1, null);
        }
    }

    public static final void b(cvc cvcVar, cfy cfyVar, afeg afegVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-511989831);
        if (i3 == 0) {
            i2 = (true != buxVarC.E(cvcVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i4 = 16;
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.E(afegVar) ? 128 : 256;
        }
        if (buxVarC.I((i2 & 147) != 146, i2 & 1)) {
            bvv bvvVar = (bvv) buxVarC;
            long j = bvvVar.u;
            long j2 = (j >>> 32) ^ j;
            bvb bvbVarD = buxVarC.d();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVar);
            ccx ccxVarAh = bvvVar.ah();
            afdr afdrVar = cxb.a;
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, cvcVar, cvcVar.c);
            byq.c(buxVarC, bvbVarD, cvcVar.d);
            byq.c(buxVarC, afegVar, cvcVar.e);
            byq.c(buxVarC, ccxVarAh, cwb.d);
            buxVarC.i(afak.a, new alx(cwb.g, i4));
            byq.c(buxVarC, cfyVarJ, cwb.c);
            byq.c(buxVarC, Integer.valueOf((int) j2), cwb.f);
            bvvVar.Y(true);
            if (buxVarC.H()) {
                buxVarC.v(-1259187287);
                bvvVar.Y(false);
            } else {
                buxVarC.v(-1259245908);
                boolean zE = buxVarC.E(cvcVar);
                Object objS = bvvVar.S();
                if (zE || objS == buw.a) {
                    objS = new bxh(cvcVar, 6);
                    bvvVar.ad(objS);
                }
                buxVarC.r((afdr) objS);
                bvvVar.Y(false);
            }
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new cuw((Object) cvcVar, (Object) cfyVar, (Object) afegVar, i, 0);
        }
    }
}
