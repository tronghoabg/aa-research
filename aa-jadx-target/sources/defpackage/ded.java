package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ded {
    private static final defpackage.cjj a = new defpackage.cjj(0.0f, 0.0f, 10.0f, 10.0f);

    public static final boolean a(defpackage.dec decVar) {
        defpackage.cyl cylVarF = decVar.f();
        if (cylVarF != null && cylVarF.ay()) {
            return true;
        }
        defpackage.ddz ddzVar = decVar.b;
        return ddzVar.f(defpackage.def.q) || ddzVar.f(defpackage.def.p);
    }

    public static final boolean b(defpackage.dec decVar) {
        if (a(decVar)) {
            return false;
        }
        defpackage.ddz ddzVar = decVar.b;
        if (ddzVar.a) {
            return true;
        }
        defpackage.aau aauVar = ddzVar.c;
        java.lang.Object[] objArr = aauVar.b;
        java.lang.Object[] objArr2 = aauVar.c;
        long[] jArr = aauVar.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = i - length;
                    int i3 = 0;
                    while (true) {
                        int i4 = 8 - ((~i2) >>> 31);
                        if (i3 >= i4) {
                            if (i4 == 8) {
                                break;
                            }
                            return false;
                        }
                        if ((255 & j) < 128) {
                            int i5 = (i << 3) + i3;
                            java.lang.Object obj = objArr[i5];
                            java.lang.Object obj2 = objArr2[i5];
                            if (((defpackage.dej) obj).c) {
                                return true;
                            }
                        }
                        j >>= 8;
                        i3++;
                    }
                }
                if (i != length) {
                    i++;
                }
            }
        }
        return false;
    }

    public static final defpackage.zo c(defpackage.mku mkuVar, defpackage.affc affcVar) {
        defpackage.dec decVarX = mkuVar.x();
        defpackage.cxl cxlVar = decVarX.a;
        if (!cxlVar.an() || !cxlVar.am()) {
            defpackage.zo zoVar = defpackage.zp.a;
            zoVar.getClass();
            return zoVar;
        }
        defpackage.cjj cjjVarB = decVarX.b();
        defpackage.zo zoVar2 = new defpackage.zo(48);
        defpackage.sr srVar = new defpackage.sr((char[]) null);
        srVar.l(defpackage.dlv.i(cjjVarB));
        f(decVarX, zoVar2, affcVar, decVarX, new defpackage.sr((char[]) null), srVar, false);
        return zoVar2;
    }

    private static final void d(defpackage.zo zoVar, defpackage.dec decVar, defpackage.dec decVar2, boolean z) {
        defpackage.cxl cxlVar;
        defpackage.dec decVarI = decVar2.i();
        defpackage.cjj cjjVarB = (decVarI == null || (cxlVar = decVarI.a) == null || !cxlVar.an()) ? a : decVarI.b();
        int i = decVar.c;
        int i2 = decVar2.c;
        if (i2 == i) {
            i2 = -1;
        }
        zoVar.g(i2, new defpackage.hio(decVar2, defpackage.dlv.i(cjjVarB), z));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003f  */
    private static final void e(defpackage.zo zoVar, defpackage.affc affcVar, defpackage.dec decVar, defpackage.dec decVar2, defpackage.sr srVar, defpackage.sr srVar2, boolean z) {
        boolean z2;
        defpackage.cxl cxlVar = decVar2.a;
        if (!cxlVar.an() || !cxlVar.am() || srVar2.m()) {
            if (decVar2.j()) {
                d(zoVar, decVar, decVar2, z);
                return;
            }
            return;
        }
        defpackage.cjj cjjVarD = decVar2.d();
        if (cjjVarD.h()) {
            cjjVarD = decVar2.e();
        }
        defpackage.dlx dlxVarI = defpackage.dlv.i(cjjVarD);
        srVar.l(dlxVarI);
        if (z) {
            z2 = true;
        } else {
            defpackage.ddz ddzVar = decVar2.b;
            z2 = false;
            if (ddzVar.a && ddzVar.f(defpackage.def.q)) {
                z2 = true;
            }
        }
        if (srVar.s(srVar2)) {
            int i = decVar.c;
            int i2 = decVar2.c;
            if (i2 == i) {
                i2 = -1;
            }
            zoVar.g(i2, new defpackage.hio(decVar2, srVar.k(), z2));
            java.util.List listK = decVar2.k((4 & 1) != 0 ? !decVar2.e : false, true & ((4 & 2) == 0));
            for (int size = listK.size() - 1; size >= 0; size--) {
                if (!((java.lang.Boolean) affcVar.invoke(listK.get(size))).booleanValue()) {
                    e(zoVar, affcVar, decVar, (defpackage.dec) listK.get(size), srVar, srVar2, z2);
                }
            }
            if (b(decVar2)) {
                srVar2.n(dlxVarI);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005b  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:67:0x0122  */
    /* JADX WARN: Code duplicated, block: B:70:0x012c  */
    /* JADX WARN: Code duplicated, block: B:72:0x013c  */
    /* JADX WARN: Code duplicated, block: B:73:0x014d  */
    private static final void f(defpackage.dec decVar, defpackage.zo zoVar, defpackage.affc affcVar, defpackage.dec decVar2, defpackage.sr srVar, defpackage.sr srVar2, boolean z) {
        boolean z2;
        boolean z3;
        int i;
        int size;
        defpackage.dec decVar3 = decVar;
        defpackage.zo zoVar2 = zoVar;
        defpackage.affc affcVar2 = affcVar;
        defpackage.cxl cxlVar = decVar2.a;
        boolean z4 = (cxlVar.an() && cxlVar.am()) ? false : true;
        if (!srVar2.m() || decVar2.c == decVar3.c) {
            if (!z4 || decVar2.j()) {
                defpackage.dlx dlxVarI = defpackage.dlv.i(decVar2.d());
                defpackage.sr srVar3 = srVar;
                srVar3.l(dlxVarI);
                int i2 = decVar3.c;
                int i3 = decVar2.c;
                if (i3 == i2) {
                    i3 = -1;
                }
                if (z) {
                    z2 = true;
                } else {
                    defpackage.ddz ddzVar = decVar2.b;
                    if (ddzVar.a && ddzVar.f(defpackage.def.q)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
                if (!srVar.s(srVar2)) {
                    boolean z5 = z2;
                    if (decVar2.j()) {
                        d(zoVar2, decVar3, decVar2, z);
                        return;
                    } else {
                        if (i3 == -1) {
                            zoVar2.g(-1, new defpackage.hio(decVar2, srVar.k(), z5));
                            return;
                        }
                        return;
                    }
                }
                zoVar2.g(i3, new defpackage.hio(decVar2, srVar3.k(), z2));
                java.util.List listK = decVar2.k((4 & 1) != 0 ? !decVar2.e : false, true & ((4 & 2) == 0));
                if (decVar2.b.a) {
                    defpackage.dec decVarI = decVar2.i();
                    while (true) {
                        if (decVarI == null) {
                            decVarI = null;
                            break;
                        }
                        defpackage.ddz ddzVar2 = decVarI.b;
                        if (ddzVar2.f(defpackage.def.x) || ddzVar2.f(defpackage.def.w)) {
                            break;
                        } else {
                            decVarI = decVarI.i();
                        }
                    }
                    if (decVarI == null) {
                        z3 = z2;
                        i = -1;
                        size = listK.size() + i;
                        while (size >= 0) {
                            if (!((java.lang.Boolean) affcVar2.invoke(listK.get(size))).booleanValue()) {
                                f(decVar, zoVar, affcVar2, (defpackage.dec) listK.get(size), srVar3, srVar2, z3);
                            }
                            size--;
                            affcVar2 = affcVar;
                            srVar3 = srVar;
                        }
                    } else {
                        defpackage.cyl cylVarF = decVar2.f();
                        if (cylVarF == null) {
                            cylVarF = null;
                        } else {
                            if (true != cylVarF.t()) {
                                cylVarF = null;
                            }
                            if (cylVarF == null) {
                                cylVarF = null;
                            }
                        }
                        defpackage.cyl cylVarF2 = decVarI.f();
                        if (cylVarF2 == null) {
                            cylVarF2 = null;
                        } else {
                            if (true != cylVarF2.t()) {
                                cylVarF2 = null;
                            }
                            if (cylVarF2 == null) {
                                cylVarF2 = null;
                            }
                        }
                        if (cylVarF == null || cylVarF2 == null) {
                            z3 = z2;
                            i = -1;
                        } else {
                            defpackage.cjj cjjVarO = cylVarF2.o(cylVarF, false);
                            i = -1;
                            boolean zF = defpackage.afga.f(cjjVarO, cjjVarO.d(defpackage.bzo.C(0L, defpackage.dlv.f(cylVarF2.h()))));
                            z3 = z2;
                            if (!zF) {
                                defpackage.sr srVar4 = new defpackage.sr((char[]) null);
                                srVar4.l(defpackage.dlv.i(decVar2.e()));
                                int size2 = listK.size() - 1;
                                while (size2 >= 0) {
                                    if (!((java.lang.Boolean) affcVar2.invoke(listK.get(size2))).booleanValue()) {
                                        defpackage.affc affcVar3 = affcVar2;
                                        e(zoVar2, affcVar3, decVar3, (defpackage.dec) listK.get(size2), new defpackage.sr((char[]) null), srVar4, z3);
                                        affcVar2 = affcVar3;
                                    }
                                    size2--;
                                    decVar3 = decVar;
                                    zoVar2 = zoVar;
                                }
                            }
                        }
                        size = listK.size() + i;
                        while (size >= 0) {
                            if (!((java.lang.Boolean) affcVar2.invoke(listK.get(size))).booleanValue()) {
                                f(decVar, zoVar, affcVar2, (defpackage.dec) listK.get(size), srVar3, srVar2, z3);
                            }
                            size--;
                            affcVar2 = affcVar;
                            srVar3 = srVar;
                        }
                    }
                } else {
                    z3 = z2;
                    i = -1;
                    size = listK.size() + i;
                    while (size >= 0) {
                        if (!((java.lang.Boolean) affcVar2.invoke(listK.get(size))).booleanValue()) {
                            f(decVar, zoVar, affcVar2, (defpackage.dec) listK.get(size), srVar3, srVar2, z3);
                        }
                        size--;
                        affcVar2 = affcVar;
                        srVar3 = srVar;
                    }
                }
                if (b(decVar2)) {
                    srVar2.n(dlxVarI);
                }
            }
        }
    }
}
