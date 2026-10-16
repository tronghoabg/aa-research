package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class tn {
    public static final int a(dur durVar) {
        if (durVar == null) {
            return 0;
        }
        java.lang.String str = durVar.d;
        return str != null ? str.hashCode() : j$.util.Objects.hash(new java.lang.Object[]{durVar.a, durVar.c, java.lang.Boolean.valueOf(durVar.e), java.lang.Boolean.valueOf(durVar.f)});
    }

    public static final boolean b(dur durVar, dur durVar2) {
        if (durVar == null && durVar2 == null) {
            return true;
        }
        if (durVar == null || durVar2 == null) {
            return false;
        }
        java.lang.String str = durVar.d;
        java.lang.String str2 = durVar2.d;
        if (str == null && str2 == null) {
            return defpackage.afga.f(j$.util.Objects.toString(durVar.a), j$.util.Objects.toString(durVar2.a)) && defpackage.afga.f(durVar.c, durVar2.c) && durVar.e == durVar2.e && durVar.f == durVar2.f;
        }
        return defpackage.afga.f(str, str2);
    }

    /* JADX WARN: Code duplicated, block: B:64:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:65:0x010a  */
    /* JADX WARN: Code duplicated, block: B:70:0x015a  */
    public static final void c(boolean z, defpackage.cgf cgfVar, boolean z2, bpg bpgVar, defpackage.bve bveVar, int i) {
        int i2;
        bpg bpgVar2;
        bpg bpgVar3;
        long j;
        boolean z3;
        defpackage.bys bysVarC;
        boolean zC;
        java.lang.Object objS;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(408580840);
        if (i3 == 0) {
            i2 = (true != bveVarC.D(z) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.E(null) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != bveVarC.C(cgfVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != bveVarC.D(z2) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= 8192;
        }
        int i4 = i2 | 196608;
        if (bveVarC.I((74899 & i4) != 74898, i4 & 1)) {
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            bwcVar.ab(-127, null, 0, null);
            if ((i & 1) == 0 || bveVarC.F()) {
                defpackage.bnk bnkVarN = defpackage.bxi.n(bveVarC);
                bpgVar3 = bnkVarN.ad;
                if (bpgVar3 == null) {
                    bpgVar3 = new bpg(defpackage.bnl.e(bnkVarN, 26), defpackage.bnl.e(bnkVarN, 19), defpackage.ckd.h(defpackage.bnl.e(bnkVarN, 18), 0.38f), defpackage.ckd.h(defpackage.bnl.e(bnkVarN, 18), 0.38f));
                    bnkVarN.ad = bpgVar3;
                }
            } else {
                bveVarC.s();
                bpgVar3 = bpgVar;
            }
            bveVarC.l();
            bpg bpgVar4 = bpgVar3;
            defpackage.bys bysVarA = defpackage.aef.a(z ? 6.0f : 0.0f, defpackage.rq.b(2, bveVarC), null, null, bveVarC, 0, 12);
            if (z2 && z) {
                j = bpgVar4.a;
            } else if (z2) {
                j = bpgVar4.b;
            } else {
                if (z) {
                    j = bpgVar4.c;
                } else {
                    j = bpgVar4.d;
                    z3 = false;
                }
                if (z3) {
                    bveVarC.v(1194671677);
                    bysVarC = defpackage.adj.a(j, defpackage.rq.b(4, bveVarC), bveVarC, 0, 12);
                    bveVarC = bveVarC;
                    bwcVar.Y(false);
                } else {
                    bveVarC.v(1194849338);
                    bysVarC = defpackage.bzd.c(new defpackage.ckd(j), bveVarC);
                    bwcVar.Y(false);
                }
                defpackage.cgc cgcVar = defpackage.cgf.e;
                defpackage.cgf cgfVarA = defpackage.asq.H(defpackage.awj.u(cgfVar.a(cgcVar).a(cgcVar), defpackage.cfs.e, 2), 2.0f).a(new defpackage.awi(20.0f, 20.0f, 20.0f, 20.0f, false));
                zC = bveVarC.C(bysVarC) | bveVarC.C(bysVarA);
                objS = bwcVar.S();
                if (zC || objS == defpackage.bvd.a) {
                    objS = new defpackage.bpn(bysVarC, bysVarA, 1, null);
                    bwcVar.ad(objS);
                }
                defpackage.afw.z(cgfVarA, (defpackage.affc) objS, bveVarC, 0);
                bpgVar2 = bpgVar4;
            }
            z3 = z2;
            if (z3) {
                bveVarC.v(1194671677);
                bysVarC = defpackage.adj.a(j, defpackage.rq.b(4, bveVarC), bveVarC, 0, 12);
                bveVarC = bveVarC;
                bwcVar.Y(false);
            } else {
                bveVarC.v(1194849338);
                bysVarC = defpackage.bzd.c(new defpackage.ckd(j), bveVarC);
                bwcVar.Y(false);
            }
            defpackage.cgc cgcVar2 = defpackage.cgf.e;
            defpackage.cgf cgfVarA2 = defpackage.asq.H(defpackage.awj.u(cgfVar.a(cgcVar2).a(cgcVar2), defpackage.cfs.e, 2), 2.0f).a(new defpackage.awi(20.0f, 20.0f, 20.0f, 20.0f, false));
            zC = bveVarC.C(bysVarC) | bveVarC.C(bysVarA);
            objS = bwcVar.S();
            if (zC) {
                objS = new defpackage.bpn(bysVarC, bysVarA, 1, null);
                bwcVar.ad(objS);
            } else {
                objS = new defpackage.bpn(bysVarC, bysVarA, 1, null);
                bwcVar.ad(objS);
            }
            defpackage.afw.z(cgfVarA2, (defpackage.affc) objS, bveVarC, 0);
            bpgVar2 = bpgVar4;
        } else {
            bveVarC.s();
            bpgVar2 = bpgVar;
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new bqz(z, cgfVar, z2, bpgVar2, i, 1);
        }
    }

    public static final void d(defpackage.cml cmlVar, int i, long j, float f, float f2) {
        if (defpackage.a.X(i, 1)) {
            float f3 = f / 2.0f;
            defpackage.dai.aF(cmlVar, j, f3, (((long) java.lang.Float.floatToRawIntBits((java.lang.Float.intBitsToFloat((int) (cmlVar.o() >> 32)) - f3) - f2)) << 32) | (4294967295L & ((long) java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (cmlVar.o() & 4294967295L)) / 2.0f))), null, 120);
            return;
        }
        float fIntBitsToFloat = (java.lang.Float.intBitsToFloat((int) (cmlVar.o() >> 32)) - f) - f2;
        float fIntBitsToFloat2 = (java.lang.Float.intBitsToFloat((int) (cmlVar.o() & 4294967295L)) - f) / 2.0f;
        defpackage.dai.U(cmlVar, j, (java.lang.Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L), (((long) java.lang.Float.floatToRawIntBits(f)) << 32) | (4294967295L & ((long) java.lang.Float.floatToRawIntBits(f))), 0.0f, null, 120);
    }

    public static final long e(int i) {
        return ((long) i) << 32;
    }

    public static final defpackage.cgf f(defpackage.cgf cgfVar, defpackage.cqc cqcVar, defpackage.tu tuVar) {
        return cgfVar.a(new defpackage.cqf(cqcVar, tuVar));
    }

    public static final defpackage.cgf g(defpackage.cgf cgfVar, defpackage.affc affcVar) {
        return cgfVar.a(new defpackage.cpy(affcVar, null));
    }

    public static final int h(android.view.KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? 0 : 1;
        }
        return 2;
    }

    public static final long i(android.view.KeyEvent keyEvent) {
        return e(keyEvent.getKeyCode());
    }
}
