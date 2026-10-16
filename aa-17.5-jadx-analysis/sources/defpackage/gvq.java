package defpackage;

/* loaded from: classes2.dex */
public final class gvq {
    public static /* synthetic */ afak a(gvr gvrVar, cfy cfyVar, bux buxVar, int i) {
        cfyVar.getClass();
        if ((i & 6) == 0) {
            i |= true != buxVar.C(cfyVar) ? 2 : 4;
        }
        if (buxVar.I((i & 19) != 18, i & 1)) {
            g(gvrVar.b, cfyVar, buxVar, ((i << 3) & 112) | 8, 0);
        } else {
            buxVar.s();
        }
        return afak.a;
    }

    public static /* synthetic */ afak b(gbg gbgVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        cfyVar.getClass();
        if ((i & 6) == 0) {
            i2 = i | (true != buxVar.C(cfyVar) ? 2 : 4);
        } else {
            i2 = i;
        }
        if (buxVar.I((i2 & 19) != 18, i2 & 1)) {
            gbf.d(gbgVar, cfyVar, cfl.c, null, null, false, false, null, null, false, buxVar, ((i2 << 3) & 112) | 384, 1016);
        } else {
            buxVar.s();
        }
        return afak.a;
    }

    public static final void c(gvr gvrVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        cfy cfyVar2;
        int i3;
        cct cctVar;
        cct cctVar2;
        int i4 = i & 6;
        bux buxVarC = buxVar.c(109779098);
        int i5 = 4;
        if (i4 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(gvrVar) : buxVarC.E(gvrVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if (!buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            cfyVar2 = cfyVar;
            i3 = i;
            buxVarC.s();
        } else {
            if (((Boolean) buxVarC.f(gfo.a)).booleanValue()) {
                buxVarC.v(1959119148);
                gur.e(gvrVar, cfyVar, buxVarC, i2 & 126);
                ((bvv) buxVarC).Y(false);
                bxf bxfVarJ = buxVarC.J();
                if (bxfVarJ != null) {
                    bxfVarJ.c = new gul(gvrVar, cfyVar, i, 12, null);
                    return;
                }
                return;
            }
            cfyVar2 = cfyVar;
            i3 = i;
            int i6 = ((i2 << 9) & 57344) | 48;
            buxVarC.v(1959176808);
            bvv bvvVar = (bvv) buxVarC;
            bvvVar.Y(false);
            hjo hjoVar = (hjo) buxVarC.f(hjp.a);
            hjn hjnVar = hjoVar.a;
            if (hjnVar == hjn.c || (hjnVar == hjn.b && hjoVar.b == hjm.a)) {
                buxVarC.v(1959428373);
                hju hjuVar = gvrVar.a;
                cct cctVarI = bxc.i(1160594601, true, new guq(gvrVar, 3), buxVarC);
                hju hjuVar2 = gvrVar.d;
                gbg gbgVar = gvrVar.c;
                if (gbgVar == null) {
                    buxVarC.v(1959636692);
                    bvvVar.Y(false);
                    cctVar = null;
                } else {
                    buxVarC.v(1959636693);
                    cct cctVarI2 = bxc.i(1619364102, true, new guq(gbgVar, i5), buxVarC);
                    bvvVar.Y(false);
                    cctVar = cctVarI2;
                }
                hbx.e(hjuVar, cctVarI, hjuVar2, cctVar, cfyVar2, buxVarC, i6);
                bvvVar.Y(false);
            } else {
                buxVarC.v(1959802295);
                hju hjuVar3 = gvrVar.a;
                cct cctVarI3 = bxc.i(-2047468924, true, new guq(gvrVar, 5), buxVarC);
                hju hjuVar4 = gvrVar.d;
                gbg gbgVar2 = gvrVar.c;
                if (gbgVar2 == null) {
                    buxVarC.v(1960008692);
                    bvvVar.Y(false);
                    cctVar2 = null;
                } else {
                    buxVarC.v(1960008693);
                    cct cctVarI4 = bxc.i(-13560479, true, new guq(gbgVar2, 6), buxVarC);
                    bvvVar.Y(false);
                    cctVar2 = cctVarI4;
                }
                hkr.d(hjuVar3, cctVarI3, hjuVar4, cctVar2, cfyVar2, buxVarC, i6);
                bvvVar.Y(false);
            }
        }
        bxf bxfVarJ2 = buxVarC.J();
        if (bxfVarJ2 != null) {
            bxfVarJ2.c = new gul(gvrVar, cfyVar2, i3, 13, null);
        }
    }

    public static final fvf d(int i) {
        int i2 = i - 1;
        if (i2 != 0) {
            return i2 != 1 ? gzl.b : gzl.a;
        }
        return null;
    }

    public static /* synthetic */ String e(int i) {
        return i != 1 ? "VERTICAL" : "HORIZONTAL";
    }

    public static final afeh f(hju hjuVar) {
        return new cct(1908663611, true, new guq(hjuVar, 20));
    }

    public static final void g(hju hjuVar, cfy cfyVar, bux buxVar, int i, int i2) {
        int i3;
        cfy cfyVar2;
        hjuVar.getClass();
        int i4 = i & 6;
        bux buxVarC = buxVar.c(1286596778);
        if (i4 == 0) {
            i3 = (true != ((i & 8) == 0 ? buxVarC.C(hjuVar) : buxVarC.E(hjuVar)) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if (i2 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if (buxVarC.I((i3 & 19) != 18, i3 & 1)) {
            cfy cfyVar3 = i2 != 0 ? cfy.e : cfyVar;
            hjs.a.a(hjuVar, gzj.e(cfyVar3, hjuVar), buxVarC, (i3 & 14) | 384, 0);
            cfyVar2 = cfyVar3;
        } else {
            buxVarC.s();
            cfyVar2 = cfyVar;
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new fwz(hjuVar, cfyVar2, i, i2, 12);
        }
    }
}
