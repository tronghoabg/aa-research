package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bom {
    public static final defpackage.bvm a;

    static {
        new defpackage.byu(new defpackage.bli(6));
        a = new defpackage.byu(new defpackage.bli(7));
    }

    public static final void a(defpackage.bnk bnkVar, defpackage.bpz bpzVar, defpackage.bse bseVar, defpackage.affg affgVar, defpackage.bve bveVar, int i, int i2) {
        int i3;
        defpackage.bnk bnkVar2;
        defpackage.bpz bpzVar2;
        int i4 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-449719819);
        if (i4 == 0) {
            int i5 = 2;
            if ((i2 & 1) == 0 && bveVarC.C(bnkVar)) {
                i5 = 4;
            }
            i3 = i | i5;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            int i6 = 16;
            if ((i2 & 2) == 0 && bveVarC.C(bpzVar)) {
                i6 = 32;
            }
            i3 |= i6;
        }
        if ((i & 384) == 0) {
            i3 |= true != bveVarC.C(bseVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != bveVarC.E(affgVar) ? 1024 : 2048;
        }
        if (bveVarC.I((i3 & 1171) != 1170, i3 & 1)) {
            int i7 = i2 & 2;
            int i8 = i2 & 1;
            ((defpackage.bwc) bveVarC).ab(-127, null, 0, null);
            if ((i & 1) == 0 || bveVarC.F()) {
                if (i8 != 0) {
                    i3 &= -15;
                    bnkVar = ((defpackage.bol) bveVarC.f(a)).a;
                }
                if (i7 != 0) {
                    bpzVar = ((defpackage.bol) bveVarC.f(a)).c;
                    i3 &= -113;
                }
            } else {
                bveVarC.s();
                if (i8 != 0) {
                    i3 &= -15;
                }
                if (i7 != 0) {
                    i3 &= -113;
                }
            }
            defpackage.bnk bnkVar3 = bnkVar;
            defpackage.bpz bpzVar3 = bpzVar;
            bveVarC.l();
            int i9 = i3 << 3;
            b(bnkVar3, ((defpackage.bol) bveVarC.f(a)).d, bpzVar3, bseVar, affgVar, bveVarC, (i3 & 14) | (i9 & 896) | (i9 & 7168) | (i9 & 57344));
            bnkVar2 = bnkVar3;
            bpzVar2 = bpzVar3;
        } else {
            bveVarC.s();
            bnkVar2 = bnkVar;
            bpzVar2 = bpzVar;
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new dnd(bnkVar2, bpzVar2, bseVar, affgVar, i, i2, 1);
        }
    }

    public static final void b(defpackage.bnk bnkVar, defpackage.bow bowVar, defpackage.bpz bpzVar, defpackage.bse bseVar, defpackage.affg affgVar, defpackage.bve bveVar, int i) {
        int i2;
        char c;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(904511636);
        if (i3 == 0) {
            i2 = (true != bveVarC.C(bnkVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.C(bowVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != bveVarC.C(bpzVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != bveVarC.C(bseVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != bveVarC.E(affgVar) ? 8192 : 16384;
        }
        if (bveVarC.I((i2 & 9363) != 9362, i2 & 1)) {
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            bwcVar.ab(-127, null, 0, null);
            if ((i & 1) != 0 && !bveVarC.F()) {
                bveVarC.s();
            }
            bveVarC.l();
            defpackage.bol bolVar = new defpackage.bol(bnkVar, bseVar, bpzVar, bowVar);
            defpackage.akr akrVarA = defpackage.bpk.a(false, 0.0f, 0L, null, false, 255);
            long j = bnkVar.a;
            boolean zB = bveVarC.B(j);
            java.lang.Object objS = bwcVar.S();
            if (zB) {
                c = 0;
            } else {
                c = 0;
                if (objS == defpackage.bvd.a) {
                }
                defpackage.bxk[] bxkVarArr = new defpackage.bxk[3];
                bxkVarArr[c] = a.b(bolVar);
                bxkVarArr[r9] = defpackage.akn.a.b(akrVarA);
                bxkVarArr[2] = defpackage.bma.a.b((defpackage.blz) objS);
                defpackage.dai.aB(bxkVarArr, defpackage.dai.as(-1750539308, true, new defpackage.aps(bseVar, affgVar, 11, null), bveVarC), bveVarC, 56);
            }
            float fD = defpackage.ckd.d(j);
            float fC = defpackage.ckd.c(j);
            float fB = defpackage.ckd.b(j);
            float[] fArr = defpackage.clr.a;
            objS = new defpackage.blz(j, defpackage.cjv.k(fD, fC, fB, 0.4f, defpackage.clr.y[(int) (j & 63)]));
            bwcVar.ad(objS);
            defpackage.bxk[] bxkVarArr2 = new defpackage.bxk[3];
            bxkVarArr2[c] = a.b(bolVar);
            bxkVarArr2[r9] = defpackage.akn.a.b(akrVarA);
            bxkVarArr2[2] = defpackage.bma.a.b((defpackage.blz) objS);
            defpackage.dai.aB(bxkVarArr2, defpackage.dai.as(-1750539308, true, new defpackage.aps(bseVar, affgVar, 11, null), bveVarC), bveVarC, 56);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new gbt(bnkVar, bowVar, bpzVar, bseVar, affgVar, i, 1);
        }
    }
}
