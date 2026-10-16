package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jtx {
    public static final void a(fxz fxzVar, defpackage.cgf cgfVar, defpackage.bve bveVar, int i) {
        int i2;
        defpackage.bxl bxlVarJ;
        jtw jtwVar;
        defpackage.ckd ckdVar;
        defpackage.ckd ckdVar2;
        long jC;
        defpackage.bve bveVarC = bveVar.c(1093892726);
        if ((i & 6) == 0) {
            i2 = (true != ((i & 8) == 0 ? bveVarC.C(fxzVar) : bveVarC.E(fxzVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.C(cgfVar) ? 16 : 32;
        }
        if (bveVarC.I((i2 & 19) != 18, i2 & 1)) {
            gfq gfqVar = fxzVar.a;
            defpackage.cne cneVarA = gfqVar.a(jtl.b((fwp) bveVarC.f(fwq.a)), bveVarC, 64);
            boolean z = fxzVar.d;
            if (cneVarA == null) {
                bxlVarJ = bveVarC.J();
                if (bxlVarJ == null) {
                    return;
                } else {
                    jtwVar = new jtw(fxzVar, cgfVar, i, 1);
                }
            } else if (z) {
                bveVarC.v(-2053147144);
                if (fxzVar.h) {
                    bveVarC.v(-2053073705);
                    fwo fwoVar = fxzVar.e;
                    fwn fwnVar = fwoVar != null ? fwoVar.b : null;
                    if (fwnVar == null) {
                        bveVarC.v(-2053024447);
                        ((defpackage.bwc) bveVarC).Y(false);
                        ckdVar2 = null;
                    } else {
                        bveVarC.v(-2053024446);
                        long jG = fww.g(new hkf(defpackage.cjv.j(fwnVar.b), defpackage.cjv.j(fwnVar.a)).b(bveVarC), 0L, 0, bveVarC, 14);
                        ((defpackage.bwc) bveVarC).Y(false);
                        ckdVar2 = new defpackage.ckd(jG);
                    }
                    if (ckdVar2 == null) {
                        bveVarC.v(-1036049155);
                        jC = defpackage.gvt.e(bveVarC).C();
                        ((defpackage.bwc) bveVarC).Y(false);
                    } else {
                        bveVarC.v(-1036059509);
                        ((defpackage.bwc) bveVarC).Y(false);
                        jC = ckdVar2.a;
                    }
                    ((defpackage.bwc) bveVarC).Y(false);
                    ckdVar = new defpackage.ckd(jC);
                } else {
                    bveVarC.v(-2052731434);
                    ((defpackage.bwc) bveVarC).Y(false);
                    ckdVar = null;
                }
                defpackage.fxj.f(new gah(gfqVar, (fzw) null, (gbm) null), gvd.d(cgfVar, fxzVar), ckdVar, bveVarC, 8);
                ((defpackage.bwc) bveVarC).Y(false);
                bxlVarJ = bveVarC.J();
                if (bxlVarJ == null) {
                    return;
                } else {
                    jtwVar = new jtw(fxzVar, cgfVar, i, 0);
                }
            } else {
                bveVarC.v(-2052482132);
                ((defpackage.bwc) bveVarC).Y(false);
                gfg gfgVar = fxzVar.i;
                defpackage.afar afarVar = defpackage.ktl.a;
                jtl.d(gfgVar, gfqVar, defpackage.kgu.g(0L, 0L, 0L, 0L, bveVarC, 255), fxzVar.e, fxzVar.f, false, defpackage.dai.as(-16017686, true, new fux(fxzVar, cgfVar, 12), bveVarC), bveVarC, 1572928, 32);
                bveVarC = bveVarC;
            }
            bxlVarJ.c = jtwVar;
        }
        bveVarC.s();
        bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            jtwVar = new jtw(fxzVar, cgfVar, i, 2);
            bxlVarJ.c = jtwVar;
        }
    }

    public static final defpackage.ksb b(defpackage.hjb hjbVar) {
        hjbVar.getClass();
        defpackage.wog wogVar = hjbVar.e;
        defpackage.wog wogVar2 = hjbVar.d;
        defpackage.wog wogVar3 = hjbVar.c;
        return new defpackage.ksb(d(hjbVar.a), d(hjbVar.b), d(wogVar3), d(wogVar2), d(wogVar));
    }

    public static final void c() {
    }

    private static final defpackage.acbc d(defpackage.wog wogVar) {
        java.util.HashMap map = new java.util.HashMap();
        double d = wogVar.b;
        double d2 = wogVar.c;
        defpackage.ysr.bI(d, d2, map);
        return new defpackage.acbc(d, d2);
    }
}
