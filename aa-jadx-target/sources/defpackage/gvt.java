package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class gvt {
    public static final void a(gvr gvrVar, defpackage.cgf cgfVar, defpackage.bve bveVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(897919903);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? bveVarC.C(gvrVar) : bveVarC.E(gvrVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.C(cgfVar) ? 16 : 32;
        }
        if (bveVarC.I((i2 & 19) != 18, i2 & 1)) {
            defpackage.cty ctyVarA = defpackage.atu.a(defpackage.ati.g(defpackage.gjr.P3.k), defpackage.cfs.k, bveVarC, 48);
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            int iF = defpackage.a.f(bwcVar.u);
            defpackage.cdd cddVarAh = bwcVar.ah();
            defpackage.cgf cgfVarN = defpackage.bzo.n(bveVarC, cgfVar);
            defpackage.afer aferVar = defpackage.cwl.a;
            bveVarC.w();
            if (bwcVar.t) {
                bveVarC.j(aferVar);
            } else {
                bveVarC.y();
            }
            defpackage.byw.c(bveVarC, ctyVarA, defpackage.cwl.e);
            defpackage.byw.c(bveVarC, cddVarAh, defpackage.cwl.d);
            defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF), defpackage.cwl.f);
            defpackage.byw.b(bveVarC, defpackage.cwl.g);
            defpackage.byw.c(bveVarC, cgfVarN, defpackage.cwl.c);
            hkd hkdVar = gvrVar.b;
            if (hkdVar == null) {
                bveVarC.v(1353213447);
            } else {
                bveVarC.v(-649084614);
                gwa.f(hkdVar, defpackage.cgf.e, bveVarC, 48, 0);
            }
            bwcVar.Y(false);
            gwa.f(gvrVar.a, defpackage.cgf.e, bveVarC, 48, 0);
            bwcVar.Y(true);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new guv(gvrVar, cgfVar, i, 8, (byte[]) null);
        }
    }

    public static final wi b(wi wiVar, gfa gfaVar, gzl gzlVar) {
        if (wiVar instanceof gnd) {
            gzf gzfVarL = gfaVar.l(gzf.class);
            gzfVarL.getClass();
            gwm gwmVarB = gzfVarL.b(wiVar.getClass());
            if (gwmVarB != null) {
                gfaVar.e().b("Emitter", gwmVarB.getClass().getSimpleName());
                gwmVarB.i(gzlVar);
                gwmVarB.h((gnd) wiVar);
                return new gzj(gwmVarB, wiVar);
            }
        }
        return wiVar;
    }

    public static final long c(float f, defpackage.bve bveVar) {
        return ((defpackage.dlo) bveVar.f(defpackage.dbl.d)).dQ(f);
    }

    public static final defpackage.bse d(int i, defpackage.bve bveVar, int i2) {
        hjt hjtVar;
        defpackage.dhz dhzVar = hjr.a;
        defpackage.dgd dgdVar = new defpackage.dgd(0L, 0L, null, hjr.a, 0L, 0, 0L, 16777183);
        int i3 = 1 == i2 ? 1 : i;
        if (i3 == 0) {
            throw null;
        }
        int i4 = i3 - 1;
        if (i4 == 0) {
            hjtVar = hjt.a;
        } else if (i4 == 1) {
            hjtVar = hjt.b;
        } else {
            if (i4 != 2) {
                throw new defpackage.afas();
            }
            hjtVar = hjt.c;
        }
        defpackage.dgd dgdVarJ = j(dgdVar, hjtVar.d, bveVar);
        defpackage.dgd dgdVarJ2 = j(dgdVar, hjtVar.e, bveVar);
        defpackage.dgd dgdVarJ3 = j(dgdVar, hjtVar.f, bveVar);
        defpackage.dgd dgdVarJ4 = j(dgdVar, hjtVar.g, bveVar);
        defpackage.dgd dgdVarJ5 = j(dgdVar, hjtVar.h, bveVar);
        defpackage.dgd dgdVarJ6 = j(dgdVar, hjtVar.i, bveVar);
        defpackage.dgd dgdVarJ7 = j(dgdVar, hjtVar.j, bveVar);
        defpackage.dil dilVar = hjr.b;
        defpackage.dgd dgdVarW = defpackage.dgd.w(dgdVarJ7, 0L, 0L, dilVar, null, null, null, 0L, null, 0, 0, 0L, null, null, 16777211);
        defpackage.dgd dgdVarW2 = defpackage.dgd.w(j(dgdVar, hjtVar.k, bveVar), 0L, 0L, dilVar, null, null, null, 0L, null, 0, 0, 0L, null, null, 16777211);
        defpackage.dgd dgdVarW3 = defpackage.dgd.w(j(dgdVar, hjtVar.l, bveVar), 0L, 0L, dilVar, null, null, null, 0L, null, 0, 0, 0L, null, null, 16777211);
        defpackage.dgd dgdVarJ8 = j(dgdVar, hjtVar.m, bveVar);
        defpackage.dgd dgdVarJ9 = j(dgdVar, hjtVar.n, bveVar);
        defpackage.dgd dgdVarJ10 = j(dgdVar, hjtVar.o, bveVar);
        defpackage.dgd dgdVarW4 = defpackage.dgd.w(j(dgdVar, hjtVar.p, bveVar), 0L, 0L, dilVar, null, null, null, 0L, null, 0, 0, 0L, null, null, 16777211);
        defpackage.dgd dgdVarW5 = defpackage.dgd.w(j(dgdVar, hjtVar.q, bveVar), 0L, 0L, dilVar, null, null, null, 0L, null, 0, 0, 0L, null, null, 16777211);
        defpackage.dgd dgdVarW6 = defpackage.dgd.w(j(dgdVar, hjtVar.r, bveVar), 0L, 0L, dilVar, null, null, null, 0L, null, 0, 0, 0L, null, null, 16777211);
        return new defpackage.bse(dgdVarJ, dgdVarJ2, dgdVarJ3, dgdVarJ4, dgdVarJ5, dgdVarJ6, dgdVarW, dgdVarW2, dgdVarW3, dgdVarJ8, dgdVarJ9, dgdVarJ10, dgdVarW4, dgdVarW5, dgdVarW6, dgdVarJ, dgdVarJ2, dgdVarJ3, dgdVarJ4, dgdVarJ5, dgdVarJ6, dgdVarW, dgdVarW2, dgdVarW3, dgdVarJ8, dgdVarJ9, dgdVarJ10, dgdVarW4, dgdVarW5, dgdVarW6);
    }

    public static final defpackage.hjc e(defpackage.bve bveVar) {
        return (defpackage.hjc) bveVar.f(defpackage.hjq.b);
    }

    public static final hjf f(defpackage.bve bveVar) {
        return (hjf) bveVar.f(defpackage.hjq.d);
    }

    public static final hji g(defpackage.bve bveVar) {
        return (hji) bveVar.f(defpackage.hjq.a);
    }

    public static final hjm h(defpackage.bve bveVar) {
        return (hjm) bveVar.f(defpackage.hjq.c);
    }

    public static final hjn i(defpackage.bve bveVar) {
        return (hjn) bveVar.f(defpackage.hjq.e);
    }

    private static final defpackage.dgd j(defpackage.dgd dgdVar, hjs hjsVar, defpackage.bve bveVar) {
        return defpackage.dgd.w(dgdVar, 0L, c(hjsVar.a, bveVar), null, null, null, null, 0L, null, 0, 0, c(hjsVar.b, bveVar), null, null, 16646141);
    }
}
