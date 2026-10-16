package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jxh {
    public static final void a(fyb fybVar, defpackage.cgf cgfVar, defpackage.bve bveVar, int i) {
        int i2;
        int i3;
        defpackage.bve bveVar2;
        defpackage.ajl ajlVarB;
        defpackage.bve bveVarC = bveVar.c(676073172);
        if ((i & 6) == 0) {
            i2 = (true != ((i & 8) == 0 ? bveVarC.C(fybVar) : bveVarC.E(fybVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.C(cgfVar) ? 16 : 32;
        }
        if (bveVarC.I((i2 & 19) != 18, i2 & 1)) {
            if (defpackage.ca.bl(bveVarC)) {
                bveVarC.v(1794370831);
                ajlVarB = defpackage.afw.B(2.0f, defpackage.bxi.n(bveVarC).B);
                ((defpackage.bwc) bveVarC).Y(false);
            } else {
                bveVarC.v(1794462126);
                ((defpackage.bwc) bveVarC).Y(false);
                ajlVarB = null;
            }
            fxu fxuVar = new fxu(fybVar.a, fybVar.b, fybVar.d, fybVar.e, fybVar.f, ajlVarB, false, false, 448);
            defpackage.afar afarVar = defpackage.ktl.a;
            bveVar2 = bveVarC;
            i3 = 16;
            jts.a(fxuVar, defpackage.awj.d(j(gvd.d(cgfVar, fybVar), fybVar.j), jtv.b.e.h), defpackage.kgu.e(defpackage.kfp.i(bveVarC).N(), defpackage.bxi.n(bveVarC).q, 0L, 0L, 0L, 0L, 0L, bveVar2, 252), defpackage.fxj.k(), bveVar2, 8, 0);
        } else {
            i3 = 16;
            bveVar2 = bveVarC;
            bveVar2.s();
        }
        defpackage.bxl bxlVarJ = bveVar2.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new jtw(fybVar, cgfVar, i, i3);
        }
    }

    public static final void b(fyb fybVar, defpackage.cgf cgfVar, defpackage.bve bveVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(1095288268);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? bveVarC.C(fybVar) : bveVarC.E(fybVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.C(cgfVar) ? 16 : 32;
        }
        if (bveVarC.I((i2 & 19) != 18, i2 & 1)) {
            int i4 = i2 & 14;
            int i5 = fybVar.j - 1;
            if (i5 == 0) {
                bveVarC.v(305043740);
                a(fybVar, cgfVar, bveVarC, (i2 & 112) | i4 | 8);
                ((defpackage.bwc) bveVarC).Y(false);
            } else if (i5 != 1) {
                bveVarC.v(305058177);
                d(fybVar, 3, cgfVar, bveVarC, ((i2 << 3) & 896) | i4 | 56);
                ((defpackage.bwc) bveVarC).Y(false);
            } else {
                bveVarC.v(305046880);
                if (defpackage.afga.f(fybVar.a, gfe.a)) {
                    bveVarC.v(866725305);
                    d(fybVar, 2, cgfVar, bveVarC, ((i2 << 3) & 896) | i4 | 56);
                    ((defpackage.bwc) bveVarC).Y(false);
                } else {
                    bveVarC.v(866604994);
                    a(fybVar, cgfVar, bveVarC, (i2 & 112) | i4 | 8);
                    ((defpackage.bwc) bveVarC).Y(false);
                }
                ((defpackage.bwc) bveVarC).Y(false);
            }
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new jtw(fybVar, cgfVar, i, 15);
        }
    }

    public static final void c(fyb fybVar, defpackage.cgf cgfVar, defpackage.bve bveVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-676682218);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? bveVarC.C(fybVar) : bveVarC.E(fybVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.C(cgfVar) ? 16 : 32;
        }
        if (bveVarC.I((i2 & 19) != 18, i2 & 1)) {
            fww.l(fybVar.i, 0, 0, defpackage.dai.as(793354270, true, new fux(fybVar, cgfVar, 13), bveVarC), bveVarC, 3072, 6);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new jtw(fybVar, cgfVar, i, 17);
        }
    }

    public static final void d(fyb fybVar, int i, defpackage.cgf cgfVar, defpackage.bve bveVar, int i2) {
        int i3;
        defpackage.bve bveVarC = bveVar.c(-716407489);
        if ((i2 & 6) == 0) {
            i3 = (true != ((i2 & 8) == 0 ? bveVarC.C(fybVar) : bveVarC.E(fybVar)) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != bveVarC.A(i + (-1)) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != bveVarC.C(cgfVar) ? 128 : 256;
        }
        if (bveVarC.I((i3 & 147) != 146, i3 & 1)) {
            jtu.a(new fxw(fybVar.b, fybVar.d, fybVar.f, i, false, 16), j(gvd.d(cgfVar, fybVar), fybVar.j), defpackage.fxj.k(), bveVarC, 8, 0);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.fxi(fybVar, i, cgfVar, i2, 12);
        }
    }

    public static final ghk e(gfa gfaVar) {
        gfaVar.getClass();
        return gfaVar.l(ghk.class);
    }

    public static final defpackage.ktz f(defpackage.bve bveVar) {
        long jA = defpackage.kud.a(k().a, bveVar);
        long jA2 = defpackage.kud.a(k().b, bveVar);
        defpackage.kua kuaVar = k().c;
        long jA3 = defpackage.kua.a(bveVar);
        long j = k().d;
        defpackage.kuc.a(bveVar);
        long jA4 = defpackage.kud.a(k().e, bveVar);
        long jA5 = k().f.a(bveVar);
        long jA6 = k().g.a(bveVar);
        long jA7 = defpackage.kud.a(k().h, bveVar);
        long jA8 = defpackage.kud.a(k().i, bveVar);
        return new defpackage.ktz(jA, jA2, jA2, jA3, j, jA4, jA5, jA6, jA7, jA8, jA7, jA8, defpackage.kud.a(k().j, bveVar), jA6, jA8);
    }

    public static final defpackage.ktz g(long j, long j2, long j3, long j4, defpackage.bve bveVar, int i) {
        long j5;
        long jA;
        long j6;
        long j7;
        long j8;
        if ((i & 1) != 0) {
            long j9 = m().a;
            defpackage.kuc.a(bveVar);
            j5 = j9;
        } else {
            j5 = j;
        }
        long jA2 = (i & 2) != 0 ? defpackage.kud.a(m().b, bveVar) : 0L;
        long j10 = (i & 4) != 0 ? jA2 : 0L;
        if ((i & 8) != 0) {
            defpackage.kua kuaVar = m().c;
            jA = defpackage.kua.a(bveVar);
        } else {
            jA = 0;
        }
        if ((i & 16) != 0) {
            j6 = m().d;
            defpackage.kuc.a(bveVar);
        } else {
            j6 = 0;
        }
        long jA3 = (i & 32) != 0 ? defpackage.kud.a(m().e, bveVar) : 0L;
        if ((i & 64) != 0) {
            long j11 = m().f;
            defpackage.kuc.a(bveVar);
            j7 = j11;
        } else {
            j7 = 0;
        }
        long jA4 = (i & 128) != 0 ? m().g.a(bveVar) : 0L;
        if ((i & 256) != 0) {
            long j12 = m().h;
            defpackage.kuc.a(bveVar);
            j8 = j12;
        } else {
            j8 = j2;
        }
        long jA5 = (i & 512) != 0 ? defpackage.kud.a(m().i, bveVar) : j3;
        return new defpackage.ktz(j5, jA2, j10, jA, j6, jA3, j7, jA4, j8, jA5, (i & 1024) != 0 ? jA : 0L, (i & 2048) != 0 ? j6 : j4, defpackage.kud.a(m().j, bveVar), jA4, jA5);
    }

    public static final defpackage.ktz h(long j, defpackage.bve bveVar, int i) {
        long j2;
        long jA;
        long j3;
        long j4;
        long j5 = 0;
        if ((i & 1) != 0) {
            long j6 = l().a;
            defpackage.kuc.a(bveVar);
            j2 = j6;
        } else {
            j2 = 0;
        }
        long jA2 = (i & 2) != 0 ? defpackage.kud.a(l().b, bveVar) : 0L;
        long j7 = (i & 4) != 0 ? jA2 : 0L;
        if ((i & 8) != 0) {
            defpackage.kua kuaVar = l().c;
            jA = defpackage.kua.a(bveVar);
        } else {
            jA = 0;
        }
        if ((i & 16) != 0) {
            long j8 = l().d;
            defpackage.kuc.a(bveVar);
            j3 = j8;
        } else {
            j3 = 0;
        }
        long jA3 = (i & 32) != 0 ? defpackage.kud.a(l().e, bveVar) : 0L;
        if ((i & 64) != 0) {
            long j9 = l().f;
            defpackage.kuc.a(bveVar);
            j4 = j9;
        } else {
            j4 = 0;
        }
        long jA4 = (i & 128) != 0 ? l().g.a(bveVar) : 0L;
        if ((i & 256) != 0) {
            j5 = l().h;
            defpackage.kuc.a(bveVar);
        }
        long j10 = j5;
        long jA5 = (i & 512) != 0 ? defpackage.kud.a(l().i, bveVar) : j;
        long jA6 = defpackage.kud.a(defpackage.kry.o, bveVar);
        long jA7 = defpackage.kud.a(l().j, bveVar);
        return new defpackage.ktz(j2, jA2, j7, jA, j3, jA3, j4, jA4, j10, jA5, jA, jA6, jA7, jA4, jA7);
    }

    public static final defpackage.cld i(defpackage.bcr bcrVar, defpackage.bve bveVar) {
        bcrVar.getClass();
        defpackage.aga agaVar = new defpackage.aga(1.0f, 1500.0f, null);
        boolean zC = bveVar.C(agaVar);
        java.lang.Object objG = bveVar.g();
        if (zC || objG == defpackage.bvd.a) {
            objG = new defpackage.kte(bcrVar, agaVar);
            bveVar.x(objG);
        }
        defpackage.kte kteVar = (defpackage.kte) objG;
        java.lang.Object objG2 = bveVar.g();
        java.lang.Object obj = defpackage.bvd.a;
        int i = 6;
        if (objG2 == obj) {
            objG2 = defpackage.afqt.q(-1, 0, 6);
            bveVar.x(objG2);
        }
        aiyk aiykVar = (aiyk) objG2;
        boolean zE = bveVar.E(aiykVar) | bveVar.C(bcrVar);
        java.lang.Object objG3 = bveVar.g();
        if (zE || objG3 == obj) {
            objG3 = new defpackage.kla(aiykVar, bcrVar, i);
            bveVar.x(objG3);
        }
        bveVar.r((defpackage.afer) objG3);
        boolean zE2 = bveVar.E(aiykVar) | bveVar.C(kteVar);
        java.lang.Object objG4 = bveVar.g();
        if (zE2 || objG4 == obj) {
            objG4 = new defpackage.bsq(aiykVar, kteVar, null, 2);
            bveVar.x(objG4);
        }
        defpackage.bvx.f(kteVar, aiykVar, (defpackage.affg) objG4, bveVar);
        defpackage.dlo dloVar = (defpackage.dlo) bveVar.f(defpackage.dbl.d);
        dloVar.getClass();
        kteVar.c = dloVar;
        boolean zC2 = bveVar.C(dloVar) | bveVar.C(kteVar);
        java.lang.Object objG5 = bveVar.g();
        if (zC2 || objG5 == obj) {
            objG5 = new defpackage.ktd(kteVar);
            bveVar.x(objG5);
        }
        return (defpackage.ktd) objG5;
    }

    private static final defpackage.cgf j(defpackage.cgf cgfVar, int i) {
        int i2 = i - 1;
        if (i2 != 0) {
            return i2 != 1 ? defpackage.awj.n(cgfVar, jtv.c.f, Float.NaN) : defpackage.awj.n(cgfVar, jtv.b.f, Float.NaN);
        }
        return defpackage.awj.n(cgfVar, jtv.b.f, Float.NaN);
    }

    private static final ktx k() {
        return (ktx) defpackage.ktz.c.a();
    }

    private static final defpackage.kty l() {
        return (defpackage.kty) defpackage.ktz.b.a();
    }

    private static final defpackage.kty m() {
        return (defpackage.kty) defpackage.ktz.a.a();
    }
}
