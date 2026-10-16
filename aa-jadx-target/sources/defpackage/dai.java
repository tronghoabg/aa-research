package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class dai {
    public dai() {
    }

    public static defpackage.cge A(defpackage.cwn cwnVar, int i) {
        defpackage.cge cgeVar = cwnVar.M().u;
        if (cgeVar != null && (cgeVar.s & i) != 0) {
            while (cgeVar != null) {
                int i2 = cgeVar.r;
                if ((i2 & 2) != 0) {
                    return null;
                }
                if ((i2 & i) != 0) {
                    return cgeVar;
                }
                cgeVar = cgeVar.u;
            }
        }
        return null;
    }

    public static int B(defpackage.cgd cgdVar, defpackage.cgd cgdVar2) {
        if (defpackage.afga.f(cgdVar, cgdVar2)) {
            return 2;
        }
        return !defpackage.bzd.e(cgdVar, cgdVar2) ? 0 : 1;
    }

    public static boolean C(defpackage.cxl cxlVar) {
        if (cxlVar.j == null) {
            return false;
        }
        defpackage.cxl cxlVarL = cxlVar.l();
        return (cxlVarL != null ? cxlVarL.j : null) == null || cxlVar.w.b;
    }

    public static /* synthetic */ java.lang.String D(int i) {
        if (i == 1) {
            return "Measuring";
        }
        if (i == 2) {
            return "LookaheadMeasuring";
        }
        if (i == 3) {
            return "LayingOut";
        }
        if (i != 4) {
            return i != 5 ? "null" : "Idle";
        }
        return "LookaheadLayingOut";
    }

    public static void E(defpackage.cxe cxeVar) {
        defpackage.cjv.r(cxeVar).I();
    }

    public static void F(defpackage.cxe cxeVar, defpackage.affc affcVar) {
        defpackage.cyl cylVar;
        if (cxeVar.M().A && (cylVar = defpackage.cjv.s(cxeVar, 2).w) != null) {
            cylVar.aw(affcVar, true);
        }
    }

    public static void G(defpackage.cwu cwuVar) {
        if (cwuVar.M().A) {
            defpackage.cjv.s(cwuVar, 1).ak();
        }
    }

    public static defpackage.cgf H(defpackage.cgf cgfVar, defpackage.affh affhVar) {
        return cgfVar.a(new defpackage.ctd(affhVar));
    }

    public static java.lang.Object I(defpackage.ctx ctxVar) {
        java.lang.Object objG = ctxVar.g();
        defpackage.ctg ctgVar = objG instanceof defpackage.ctg ? (defpackage.ctg) objG : null;
        if (ctgVar != null) {
            return ctgVar.d();
        }
        return null;
    }

    public static float J(long j, long j2) {
        return java.lang.Math.min(java.lang.Float.intBitsToFloat((int) (j2 >> 32)) / java.lang.Float.intBitsToFloat((int) (j >> 32)), java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L)) / java.lang.Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    public static defpackage.cka K(defpackage.dvd dvdVar) {
        if (!dvdVar.d()) {
            return null;
        }
        java.lang.Object obj = dvdVar.b;
        return obj != null ? new defpackage.ckb((android.graphics.Shader) obj) : new defpackage.clf(((long) dvdVar.a) << 32);
    }

    public static long L(defpackage.dlo dloVar, float f, float f2) {
        float fDI = dloVar.dI(f);
        float fDI2 = dloVar.dI(f2);
        return (((long) java.lang.Float.floatToRawIntBits(fDI)) << 32) | (((long) java.lang.Float.floatToRawIntBits(fDI2)) & 4294967295L);
    }

    public static long M(long j, float f, float f2) {
        if (java.lang.Float.isNaN(f)) {
            f = java.lang.Float.intBitsToFloat((int) (j >> 32));
        }
        if (java.lang.Float.isNaN(f2)) {
            f2 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
        }
        return (((long) java.lang.Float.floatToRawIntBits(f)) << 32) | (((long) java.lang.Float.floatToRawIntBits(f2)) & 4294967295L);
    }

    public static void N(defpackage.cou couVar, java.util.Map map, defpackage.bve bveVar, int i) {
        int i2;
        defpackage.cot cotVar;
        int i3;
        int i4 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-446179233);
        int i5 = 1;
        if (i4 == 0) {
            i2 = (true != bveVarC.C(couVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.E(map) ? 16 : 32;
        }
        if (bveVarC.I((i2 & 19) != 18, i2 & 1)) {
            defpackage.cot cotVar2 = new defpackage.cot(couVar);
            while (cotVar2.hasNext()) {
                defpackage.dai daiVarA = cotVar2.next();
                if (daiVarA instanceof defpackage.coy) {
                    bveVarC.v(798472779);
                    defpackage.coy coyVar = (defpackage.coy) daiVarA;
                    java.lang.String str = coyVar.a;
                    defpackage.cos coxVar = (defpackage.cos) map.get(str);
                    if (coxVar == null) {
                        coxVar = new defpackage.cox(i5);
                    }
                    defpackage.bve bveVar2 = bveVarC;
                    cotVar = cotVar2;
                    i3 = 1;
                    defpackage.rq.f((java.util.List) coxVar.a(defpackage.cpb.a, coyVar.b), coyVar.c, str, (defpackage.cka) coxVar.a(defpackage.coz.a, coyVar.d), ((java.lang.Number) coxVar.a(defpackage.cpa.a, java.lang.Float.valueOf(coyVar.e))).floatValue(), (defpackage.cka) coxVar.a(defpackage.cph.a, coyVar.f), ((java.lang.Number) coxVar.a(defpackage.cpi.a, java.lang.Float.valueOf(coyVar.g))).floatValue(), ((java.lang.Number) coxVar.a(defpackage.cpj.a, java.lang.Float.valueOf(coyVar.h))).floatValue(), coyVar.i, coyVar.j, coyVar.k, ((java.lang.Number) coxVar.a(defpackage.cpo.a, java.lang.Float.valueOf(coyVar.l))).floatValue(), ((java.lang.Number) coxVar.a(defpackage.cpm.a, java.lang.Float.valueOf(coyVar.m))).floatValue(), ((java.lang.Number) coxVar.a(defpackage.cpn.a, java.lang.Float.valueOf(coyVar.n))).floatValue(), bveVar2, 0, 0);
                    bveVarC = bveVar2;
                    ((defpackage.bwc) bveVarC).Y(false);
                } else {
                    cotVar = cotVar2;
                    i3 = i5;
                    if (daiVarA instanceof defpackage.cou) {
                        bveVarC.v(799887340);
                        defpackage.cou couVar2 = (defpackage.cou) daiVarA;
                        java.lang.String str2 = couVar2.a;
                        defpackage.cos coxVar2 = (defpackage.cos) map.get(str2);
                        if (coxVar2 == null) {
                            coxVar2 = new defpackage.cox(0);
                        }
                        i3 = 1;
                        defpackage.rq.e(str2, ((java.lang.Number) coxVar2.a(defpackage.cpe.a, java.lang.Float.valueOf(couVar2.b))).floatValue(), ((java.lang.Number) coxVar2.a(defpackage.cpc.a, java.lang.Float.valueOf(couVar2.c))).floatValue(), ((java.lang.Number) coxVar2.a(defpackage.cpd.a, java.lang.Float.valueOf(couVar2.d))).floatValue(), ((java.lang.Number) coxVar2.a(defpackage.cpf.a, java.lang.Float.valueOf(couVar2.e))).floatValue(), ((java.lang.Number) coxVar2.a(defpackage.cpg.a, java.lang.Float.valueOf(couVar2.f))).floatValue(), ((java.lang.Number) coxVar2.a(defpackage.cpk.a, java.lang.Float.valueOf(couVar2.g))).floatValue(), ((java.lang.Number) coxVar2.a(defpackage.cpl.a, java.lang.Float.valueOf(couVar2.h))).floatValue(), (java.util.List) coxVar2.a(defpackage.cpb.a, couVar2.i), as(1450046638, true, new defpackage.bmg(daiVarA, map, 9), bveVarC), bveVarC, 805306368);
                        ((defpackage.bwc) bveVarC).Y(false);
                    } else {
                        bveVarC.v(800893507);
                        ((defpackage.bwc) bveVarC).Y(false);
                    }
                }
                i5 = i3;
                cotVar2 = cotVar;
            }
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.bru(couVar, map, i, 2);
        }
    }

    public static void O(defpackage.cnl cnlVar, defpackage.cou couVar) {
        java.util.List list = couVar.j;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            defpackage.dai daiVar = (defpackage.dai) list.get(i);
            if (daiVar instanceof defpackage.coy) {
                defpackage.cnp cnpVar = new defpackage.cnp();
                defpackage.coy coyVar = (defpackage.coy) daiVar;
                cnpVar.e(coyVar.b);
                cnpVar.f(coyVar.c);
                java.lang.String str = coyVar.a;
                cnpVar.q();
                cnpVar.a(coyVar.d);
                cnpVar.d(coyVar.e);
                cnpVar.g(coyVar.f);
                cnpVar.i(coyVar.g);
                cnpVar.m(coyVar.h);
                cnpVar.j(coyVar.i);
                cnpVar.k(coyVar.j);
                cnpVar.l(coyVar.k);
                cnpVar.p(coyVar.l);
                cnpVar.n(coyVar.m);
                cnpVar.o(coyVar.n);
                cnlVar.d(i, cnpVar);
            } else if (daiVar instanceof defpackage.cou) {
                defpackage.cnl cnlVar2 = new defpackage.cnl();
                defpackage.cou couVar2 = (defpackage.cou) daiVar;
                cnlVar2.i(couVar2.a);
                cnlVar2.l(couVar2.b);
                cnlVar2.m(couVar2.e);
                cnlVar2.n(couVar2.f);
                cnlVar2.o(couVar2.g);
                cnlVar2.p(couVar2.h);
                cnlVar2.j(couVar2.c);
                cnlVar2.k(couVar2.d);
                cnlVar2.g(couVar2.i);
                O(cnlVar2, couVar2);
                cnlVar.d(i, cnlVar2);
            }
        }
    }

    public static defpackage.cow P(defpackage.cno cnoVar, defpackage.bve bveVar) {
        defpackage.dlo dloVar = (defpackage.dlo) bveVar.f(defpackage.dbl.d);
        boolean zB = bveVar.B((((long) java.lang.Float.floatToRawIntBits(cnoVar.l)) << 32) | (((long) java.lang.Float.floatToRawIntBits(dloVar.a())) & 4294967295L));
        java.lang.Object objG = bveVar.g();
        if (zB || objG == defpackage.bvd.a) {
            defpackage.cnl cnlVar = new defpackage.cnl();
            O(cnlVar, cnoVar.h);
            long jL = L(dloVar, cnoVar.d, cnoVar.e);
            long jM = M(jL, cnoVar.f, cnoVar.g);
            defpackage.cow cowVar = new defpackage.cow(cnlVar);
            java.lang.String str = cnoVar.c;
            long j = cnoVar.i;
            defpackage.cjx cjxVar = j != 16 ? new defpackage.cjx(j, cnoVar.j) : null;
            boolean z = cnoVar.k;
            cowVar.j(jL);
            cowVar.g(z);
            cowVar.h(cjxVar);
            cowVar.k(jM);
            cowVar.i(str);
            bveVar.x(cowVar);
            objG = cowVar;
        }
        return (defpackage.cow) objG;
    }

    public static void Q(java.util.List list, defpackage.cju cjuVar) {
        defpackage.coj cojVar;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        java.util.List list2 = list;
        defpackage.cju cjuVar2 = cjuVar;
        int iA = cjuVar2.a();
        cjuVar2.l();
        cjuVar2.m(iA);
        defpackage.coj cojVar2 = list2.isEmpty() ? defpackage.cnr.a : (defpackage.coj) list2.get(0);
        int size = list2.size();
        float f15 = 0.0f;
        int i = 0;
        float f16 = 0.0f;
        float f17 = 0.0f;
        float f18 = 0.0f;
        float f19 = 0.0f;
        float f20 = 0.0f;
        float f21 = 0.0f;
        while (i < size) {
            defpackage.coj cojVar3 = (defpackage.coj) list2.get(i);
            if (cojVar3 instanceof defpackage.cnr) {
                cjuVar2.c();
                size = size;
                f15 = f15;
                i = i;
                cojVar = cojVar3;
                f16 = f20;
                f19 = f16;
                f17 = f21;
                f18 = f17;
            } else {
                if (cojVar3 instanceof defpackage.cod) {
                    defpackage.cod codVar = (defpackage.cod) cojVar3;
                    float f22 = codVar.a;
                    f18 += f22;
                    float f23 = codVar.b;
                    f19 += f23;
                    cjuVar2.a.rMoveTo(f22, f23);
                    f21 = f18;
                    f20 = f19;
                } else if (cojVar3 instanceof defpackage.cnv) {
                    defpackage.cnv cnvVar = (defpackage.cnv) cojVar3;
                    float f24 = cnvVar.a;
                    float f25 = cnvVar.b;
                    cjuVar2.f(f24, f25);
                    f19 = f25;
                    f20 = f19;
                    f18 = f24;
                    f21 = f18;
                } else {
                    if (cojVar3 instanceof defpackage.coc) {
                        defpackage.coc cocVar = (defpackage.coc) cojVar3;
                        float f26 = cocVar.a;
                        f14 = cocVar.b;
                        cjuVar2.i(f26, f14);
                        f18 += f26;
                    } else {
                        if (cojVar3 instanceof defpackage.cnu) {
                            defpackage.cnu cnuVar = (defpackage.cnu) cojVar3;
                            f3 = cnuVar.a;
                            f4 = cnuVar.b;
                            cjuVar2.e(f3, f4);
                        } else if (cojVar3 instanceof defpackage.cob) {
                            float f27 = ((defpackage.cob) cojVar3).a;
                            cjuVar2.i(f27, f15);
                            f18 += f27;
                        } else if (cojVar3 instanceof defpackage.cnt) {
                            float f28 = ((defpackage.cnt) cojVar3).a;
                            cjuVar2.e(f28, f19);
                            f18 = f28;
                        } else if (cojVar3 instanceof defpackage.coh) {
                            f14 = ((defpackage.coh) cojVar3).a;
                            cjuVar2.i(f15, f14);
                        } else if (cojVar3 instanceof defpackage.coi) {
                            float f29 = ((defpackage.coi) cojVar3).a;
                            cjuVar2.e(f18, f29);
                            f19 = f29;
                        } else {
                            if (cojVar3 instanceof defpackage.coa) {
                                defpackage.coa coaVar = (defpackage.coa) cojVar3;
                                float f30 = coaVar.a;
                                float f31 = coaVar.b;
                                f10 = coaVar.c;
                                f11 = coaVar.d;
                                f12 = coaVar.e;
                                f13 = coaVar.f;
                                cjuVar2.h(f30, f31, f10, f11, f12, f13);
                            } else {
                                if (cojVar3 instanceof defpackage.cns) {
                                    defpackage.cns cnsVar = (defpackage.cns) cojVar3;
                                    float f32 = cnsVar.a;
                                    float f33 = cnsVar.b;
                                    f17 = cnsVar.c;
                                    f5 = cnsVar.d;
                                    f6 = cnsVar.e;
                                    f7 = cnsVar.f;
                                    cjuVar.d(f32, f33, f17, f5, f6, f7);
                                } else if (cojVar3 instanceof defpackage.cof) {
                                    if (cojVar2.h) {
                                        f8 = f18 - f17;
                                        f9 = f19 - f16;
                                    } else {
                                        f8 = f15;
                                        f9 = f8;
                                    }
                                    defpackage.cof cofVar = (defpackage.cof) cojVar3;
                                    f10 = cofVar.a;
                                    f11 = cofVar.b;
                                    f12 = cofVar.c;
                                    f13 = cofVar.d;
                                    cjuVar.h(f8, f9, f10, f11, f12, f13);
                                } else if (cojVar3 instanceof defpackage.cnx) {
                                    if (cojVar2.h) {
                                        f19 = (f19 + f19) - f16;
                                        f18 = (f18 + f18) - f17;
                                    }
                                    defpackage.cnx cnxVar = (defpackage.cnx) cojVar3;
                                    f17 = cnxVar.a;
                                    f5 = cnxVar.b;
                                    f6 = cnxVar.c;
                                    f7 = cnxVar.d;
                                    cjuVar.d(f18, f19, f17, f5, f6, f7);
                                } else if (cojVar3 instanceof defpackage.coe) {
                                    defpackage.coe coeVar = (defpackage.coe) cojVar3;
                                    float f34 = coeVar.a;
                                    float f35 = coeVar.b;
                                    float f36 = coeVar.c;
                                    float f37 = coeVar.d;
                                    cjuVar.j(f34, f35, f36, f37);
                                    float f38 = f34 + f18;
                                    float f39 = f35 + f19;
                                    f18 += f36;
                                    f19 += f37;
                                    f17 = f38;
                                    f16 = f39;
                                } else if (cojVar3 instanceof defpackage.cnw) {
                                    defpackage.cnw cnwVar = (defpackage.cnw) cojVar3;
                                    float f40 = cnwVar.a;
                                    float f41 = cnwVar.b;
                                    f3 = cnwVar.c;
                                    f4 = cnwVar.d;
                                    cjuVar.g(f40, f41, f3, f4);
                                    f17 = f40;
                                    f16 = f41;
                                } else if (cojVar3 instanceof defpackage.cog) {
                                    if (cojVar2.i) {
                                        f = f19 - f16;
                                        f2 = f18 - f17;
                                    } else {
                                        f = f15;
                                        f2 = f;
                                    }
                                    defpackage.cog cogVar = (defpackage.cog) cojVar3;
                                    float f42 = cogVar.a;
                                    float f43 = cogVar.b;
                                    cjuVar.j(f2, f, f42, f43);
                                    float f44 = f2 + f18;
                                    float f45 = f + f19;
                                    f18 += f42;
                                    f19 += f43;
                                    f17 = f44;
                                    size = size;
                                    f15 = f15;
                                    i = i;
                                    cojVar = cojVar3;
                                    f16 = f45;
                                } else if (cojVar3 instanceof defpackage.cny) {
                                    if (cojVar2.i) {
                                        f19 = (f19 + f19) - f16;
                                        f18 = (f18 + f18) - f17;
                                    }
                                    defpackage.cny cnyVar = (defpackage.cny) cojVar3;
                                    float f46 = cnyVar.a;
                                    float f47 = cnyVar.b;
                                    cjuVar.g(f18, f19, f46, f47);
                                    size = size;
                                    f15 = f15;
                                    i = i;
                                    f17 = f18;
                                    cojVar = cojVar3;
                                    f18 = f46;
                                    f16 = f19;
                                    f19 = f47;
                                } else if (cojVar3 instanceof defpackage.cnz) {
                                    double d = f18;
                                    defpackage.cnz cnzVar = (defpackage.cnz) cojVar3;
                                    float f48 = cnzVar.f + f18;
                                    float f49 = cnzVar.g + f19;
                                    f15 = 0.0f;
                                    i = i;
                                    size = size;
                                    b(cjuVar, d, f19, f48, f49, cnzVar.a, cnzVar.b, cnzVar.c, cnzVar.d, cnzVar.e);
                                    f17 = f48;
                                    f18 = f17;
                                    f16 = f49;
                                    f19 = f16;
                                    cojVar = cojVar3;
                                } else {
                                    size = size;
                                    f15 = f15;
                                    i = i;
                                    if (!(cojVar3 instanceof defpackage.cnq)) {
                                        throw new defpackage.afas();
                                    }
                                    defpackage.cnq cnqVar = (defpackage.cnq) cojVar3;
                                    float f50 = cnqVar.f;
                                    float f51 = cnqVar.g;
                                    cojVar = cojVar3;
                                    b(cjuVar, f18, f19, f50, f51, cnqVar.a, cnqVar.b, cnqVar.c, cnqVar.d, cnqVar.e);
                                    f17 = f50;
                                    f18 = f17;
                                    f16 = f51;
                                    f19 = f16;
                                }
                                f16 = f5;
                                f18 = f6;
                                f19 = f7;
                            }
                            f17 = f10 + f18;
                            float f52 = f11 + f19;
                            f18 += f12;
                            f19 += f13;
                            f16 = f52;
                        }
                        f19 = f4;
                        f18 = f3;
                    }
                    f19 += f14;
                }
                cojVar = cojVar3;
            }
            i++;
            list2 = list;
            cjuVar2 = cjuVar;
            size = size;
            cojVar2 = cojVar;
            f15 = f15;
        }
    }

    public static /* synthetic */ void R(defpackage.cjs cjsVar, android.graphics.BlurMaskFilter blurMaskFilter, int i, int i2) {
        cjsVar.j(1 != (i2 & 1) ? 0L : -72057594037927936L);
        cjsVar.i((i2 & 2) != 0 ? 3 : 0);
        cjsVar.r(i & ((i2 & 8) != 0 ? 0 : 1));
        android.graphics.Paint paintP = defpackage.bzo.p(cjsVar);
        if ((i2 & 4) != 0) {
            blurMaskFilter = null;
        }
        paintP.setMaskFilter(blurMaskFilter);
    }

    /* JADX WARN: Code duplicated, block: B:70:0x019e  */
    public static void S(defpackage.cml cmlVar, defpackage.cmq cmqVar) {
        float f;
        float f2;
        defpackage.ckc ckcVarB = cmlVar.r().b();
        defpackage.cmq cmqVar2 = cmlVar.r().a;
        if (cmqVar.l) {
            return;
        }
        long j = cmqVar.f;
        android.graphics.Canvas canvas = defpackage.cjn.a;
        ckcVarB.getClass();
        defpackage.cjm cjmVar = (defpackage.cjm) ckcVarB;
        android.graphics.Canvas canvas2 = cjmVar.a;
        boolean zIsHardwareAccelerated = canvas2.isHardwareAccelerated();
        if (!zIsHardwareAccelerated) {
            long j2 = cmqVar.m;
            long j3 = j2 >> 32;
            float f3 = cmqVar.o;
            float f4 = cmqVar.p;
            long j4 = cmqVar.n;
            long j5 = j4 >> 32;
            float f5 = cmqVar.q;
            long j6 = j4 & 4294967295L;
            float f6 = cmqVar.r;
            float fA = cmqVar.a();
            defpackage.cmt cmtVar = cmqVar.a;
            int iK = cmtVar.k();
            float f7 = (int) (j2 & 4294967295L);
            float f8 = (int) j3;
            float f9 = f8 - f3;
            float f10 = f7 - f4;
            if (fA >= 1.0f && iK == 3) {
                if (cmtVar.l() != 1) {
                    canvas2.save();
                    f2 = f9;
                    f = f10;
                    canvas2 = canvas2;
                }
                canvas2.translate(f2, f);
                android.graphics.Matrix matrixO = cmtVar.o();
                matrixO.preTranslate(cmqVar.o, cmqVar.p);
                canvas2.concat(matrixO);
                cmqVar.f = defpackage.acmj.r(cmqVar.f, (((long) java.lang.Float.floatToRawIntBits(cmqVar.p)) & 4294967295L) | (((long) java.lang.Float.floatToRawIntBits(cmqVar.o)) << 32));
            }
            defpackage.cjs cjsVar = cmqVar.u;
            if (cjsVar == null) {
                cjsVar = new defpackage.cjs();
                cmqVar.u = cjsVar;
            }
            float f11 = f7 + ((int) j6) + f6;
            float f12 = f8 + ((int) j5) + f5;
            cjsVar.h(fA);
            cjsVar.i(iK);
            cjsVar.k(null);
            android.graphics.Paint paintP = defpackage.bzo.p(cjsVar);
            f = f10;
            f2 = f9;
            canvas2 = canvas2;
            canvas2.saveLayer(f2, f, f12, f11, paintP);
            canvas2.translate(f2, f);
            android.graphics.Matrix matrixO2 = cmtVar.o();
            matrixO2.preTranslate(cmqVar.o, cmqVar.p);
            canvas2.concat(matrixO2);
            cmqVar.f = defpackage.acmj.r(cmqVar.f, (((long) java.lang.Float.floatToRawIntBits(cmqVar.p)) & 4294967295L) | (((long) java.lang.Float.floatToRawIntBits(cmqVar.o)) << 32));
        }
        cmqVar.d();
        if (!cmqVar.a.N()) {
            try {
                cmqVar.g();
            } catch (java.lang.Throwable unused) {
            }
        }
        boolean z = false;
        boolean z2 = cmqVar.b() > 0.0f;
        if (z2) {
            ckcVarB.d();
        }
        if (zIsHardwareAccelerated == 0 && cmqVar.t) {
            z = true;
        }
        if (z) {
            ckcVarB.g();
            defpackage.cku ckuVarC = cmqVar.c();
            if (ckuVarC instanceof defpackage.cks) {
                ckcVarB.r(((defpackage.cks) ckuVarC).a);
            } else if (ckuVarC instanceof defpackage.ckt) {
                defpackage.cju cjuVar = cmqVar.w;
                if (cjuVar != null) {
                    cjuVar.l();
                } else {
                    cjuVar = new defpackage.cju((byte[]) null);
                    cmqVar.w = cjuVar;
                }
                cjuVar.r(((defpackage.ckt) ckuVarC).a);
                ckcVarB.q(cjuVar);
            } else {
                if (!(ckuVarC instanceof defpackage.ckr)) {
                    throw new defpackage.afas();
                }
                ckcVarB.q(((defpackage.ckr) ckuVarC).a);
            }
        }
        if (cmqVar2 != null) {
            defpackage.cmp cmpVar = cmqVar2.k;
            if (!cmpVar.c) {
                defpackage.ckn.a("Only add dependencies during a tracking");
            }
            defpackage.aaw aawVar = cmpVar.d;
            if (aawVar != null) {
                aawVar.j(cmqVar);
            } else if (cmpVar.a != null) {
                defpackage.aaw aawVar2 = defpackage.aax.a;
                defpackage.aaw aawVar3 = new defpackage.aaw(6);
                defpackage.cmq cmqVar3 = cmpVar.a;
                cmqVar3.getClass();
                aawVar3.j(cmqVar3);
                aawVar3.j(cmqVar);
                cmpVar.d = aawVar3;
                cmpVar.a = null;
            } else {
                cmpVar.a = cmqVar;
            }
            defpackage.aaw aawVar4 = cmpVar.e;
            if (aawVar4 != null) {
                if (!aawVar4.l(cmqVar)) {
                    cmqVar.j++;
                }
            } else if (cmpVar.b == cmqVar) {
                cmpVar.b = null;
            } else {
                cmqVar.j++;
            }
        }
        ckcVarB.getClass();
        if (cjmVar.a.isHardwareAccelerated()) {
            cmqVar.a.r(ckcVarB);
        } else {
            defpackage.cmt cmtVar2 = cmqVar.a;
            defpackage.cmj cmjVar = cmqVar.i;
            if (cmjVar == null) {
                cmjVar = new defpackage.cmj();
                cmqVar.i = cmjVar;
            }
            defpackage.dlo dloVar = cmqVar.b;
            defpackage.dlz dlzVar = cmqVar.c;
            long jF = defpackage.dlv.f(cmqVar.n);
            defpackage.cmi cmiVar = cmjVar.b;
            defpackage.dlo dloVarC = cmiVar.c();
            defpackage.dlz dlzVarD = cmiVar.d();
            defpackage.ckc ckcVarB2 = cmiVar.b();
            long jA = cmiVar.a();
            defpackage.cmq cmqVar4 = cmiVar.a;
            cmiVar.f(dloVar);
            cmiVar.g(dlzVar);
            cmiVar.e(ckcVarB);
            cmiVar.h(jF);
            cmiVar.a = cmqVar;
            ckcVarB.g();
            try {
                cmqVar.f(cmjVar);
                ckcVarB.e();
                defpackage.cmi cmiVar2 = cmjVar.b;
                cmiVar2.f(dloVarC);
                cmiVar2.g(dlzVarD);
                cmiVar2.e(ckcVarB2);
                cmiVar2.h(jA);
                cmiVar2.a = cmqVar4;
            } catch (java.lang.Throwable th) {
                ckcVarB.e();
                defpackage.cmi cmiVar3 = cmjVar.b;
                cmiVar3.f(dloVarC);
                cmiVar3.g(dlzVarD);
                cmiVar3.e(ckcVarB2);
                cmiVar3.h(jA);
                cmiVar3.a = cmqVar4;
                throw th;
            }
        }
        if (z) {
            ckcVarB.e();
        }
        if (z2) {
            ckcVarB.c();
        }
        if (!zIsHardwareAccelerated) {
            canvas2.restore();
        }
        cmqVar.f = j;
    }

    public static /* synthetic */ void T(defpackage.cml cmlVar, long j, long j2, long j3, long j4, float f, int i) {
        if ((i & 2) != 0) {
            j2 = 0;
        }
        if ((i & 4) != 0) {
            j3 = defpackage.acmj.r(cmlVar.o(), j2);
        }
        if ((i & 8) != 0) {
            j4 = 0;
        }
        defpackage.cmn cmnVar = (i & 16) != 0 ? defpackage.cmn.a : null;
        if ((i & 32) != 0) {
            f = 1.0f;
        }
        cmlVar.B(j, j2, j3, j4, cmnVar, f);
    }

    public static /* synthetic */ void U(defpackage.cml cmlVar, long j, long j2, long j3, float f, defpackage.cke ckeVar, int i) {
        long j4 = (i & 2) != 0 ? 0L : j2;
        cmlVar.t(j, j4, (i & 4) != 0 ? defpackage.acmj.r(cmlVar.o(), j4) : j3, (i & 8) != 0 ? 1.0f : f, (i & 16) != 0 ? defpackage.cmn.a : null, (i & 32) != 0 ? null : ckeVar, (i & 64) != 0 ? 3 : 0);
    }

    public static /* synthetic */ void V(defpackage.cml cmlVar, defpackage.cjr cjrVar, long j, long j2, long j3, float f, defpackage.cke ckeVar, int i, int i2) {
        long jB;
        if ((i2 & 4) != 0) {
            jB = (((long) cjrVar.b()) & 4294967295L) | (((long) cjrVar.c()) << 32);
        } else {
            jB = j2;
        }
        cmlVar.C(cjrVar, (i2 & 2) != 0 ? 0L : j, jB, (i2 & 16) != 0 ? jB : j3, (i2 & 32) != 0 ? 1.0f : f, (i2 & 64) != 0 ? defpackage.cmn.a : null, (i2 & 128) != 0 ? null : ckeVar, (i2 & 256) != 0 ? 3 : 0, (((i2 & 512) == 0 ? 1 : 0) ^ 1) | i);
    }

    public static /* synthetic */ void W(defpackage.cml cmlVar, defpackage.cjr cjrVar, long j, float f, defpackage.cke ckeVar, int i, int i2) {
        defpackage.cmn cmnVar = (i2 & 8) != 0 ? defpackage.cmn.a : null;
        defpackage.cke ckeVar2 = (i2 & 16) != 0 ? null : ckeVar;
        int i3 = (i2 & 32) != 0 ? 3 : i;
        int i4 = i2 & 2;
        if ((i2 & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if (i4 != 0) {
            j = 0;
        }
        defpackage.cmj cmjVar = ((defpackage.cxn) cmlVar).a;
        cmjVar.a.c.s(cjrVar, j, cmjVar.u(null, cmnVar, f2, ckeVar2, i3, 1));
    }

    public static float X(float[] fArr) {
        int length = fArr.length;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = ((((((f * f4) + (f2 * f5)) + (f3 * f6)) - (f4 * f5)) - (f2 * f3)) - (f * f6)) * 0.5f;
        return f7 < 0.0f ? -f7 : f7;
    }

    public static boolean Y(double d, defpackage.clw clwVar, defpackage.clw clwVar2) {
        return java.lang.Math.abs(clwVar.a(d) - clwVar2.a(d)) <= 0.001d;
    }

    public static double Z(double d, double d2, double d3, double d4, double d5, double d6) {
        return d >= d5 * d4 ? (java.lang.Math.pow(d, 1.0d / d6) - d3) / d2 : d / d4;
    }

    private static float a(float[] fArr, int i, float[] fArr2, int i2) {
        int i3 = i * 4;
        float f = fArr[i3] * fArr2[i2];
        float f2 = fArr[i3 + 1] * fArr2[i2 + 4];
        return f + f2 + (fArr[i3 + 2] * fArr2[i2 + 8]) + (fArr[i3 + 3] * fArr2[i2 + 12]);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void aA(defpackage.bxk bxkVar, defpackage.affg affgVar, defpackage.bve bveVar, int i) {
        defpackage.byx byxVar;
        boolean z;
        defpackage.bxl bxlVarJ;
        defpackage.bve bveVarC = bveVar.c(-149765515);
        defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
        defpackage.cdd cddVarAh = bwcVar.ah();
        bwcVar.ab(201, defpackage.bvg.c, 0, null);
        java.lang.Object objS = bwcVar.S();
        if (defpackage.afga.f(objS, defpackage.bvd.a)) {
            byxVar = null;
        } else {
            objS.getClass();
            byxVar = (defpackage.byx) objS;
        }
        defpackage.bvm bvmVar = bxkVar.a;
        defpackage.byx byxVarD = defpackage.bvm.d(bxkVar, byxVar);
        boolean zF = defpackage.afga.f(byxVarD, byxVar);
        if (!zF) {
            bwcVar.ad(byxVarD);
        }
        if (!bwcVar.t) {
            defpackage.bzl bzlVar = bwcVar.m;
            java.lang.Object objJ = bzlVar.j(bzlVar.f);
            objJ.getClass();
            defpackage.cdd cddVar = (defpackage.cdd) objJ;
            if (!(bwcVar.H() && zF) && (bxkVar.g || !cddVarAh.containsKey(bvmVar))) {
                cddVarAh = cddVarAh.g(bvmVar, byxVarD);
            } else if ((zF && !bwcVar.h) || !bwcVar.h) {
                cddVarAh = cddVar;
            }
            if (bwcVar.i || cddVar != cddVarAh) {
                z = true;
            }
            if (z && !bwcVar.t) {
                bwcVar.aj(cddVarAh);
            }
            defpackage.vuj vujVar = bwcVar.x;
            vujVar.e(bwcVar.h ? 1 : 0);
            bwcVar.h = z;
            bwcVar.v = cddVarAh;
            bwcVar.ab(202, defpackage.bvg.d, 0, cddVarAh);
            affgVar.invoke(bveVarC, java.lang.Integer.valueOf((i >> 3) & 14));
            bwcVar.Y(false);
            bwcVar.Y(false);
            bwcVar.h = vujVar.c() != 0;
            bwcVar.v = null;
            bxlVarJ = bveVarC.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new defpackage.agg(bxkVar, affgVar, i, 19);
            }
        }
        if (bxkVar.g || !cddVarAh.containsKey(bvmVar)) {
            cddVarAh = cddVarAh.g(bvmVar, byxVarD);
        }
        bwcVar.p = true;
        z = false;
        if (z) {
            bwcVar.aj(cddVarAh);
        }
        defpackage.vuj vujVar2 = bwcVar.x;
        vujVar2.e(bwcVar.h ? 1 : 0);
        bwcVar.h = z;
        bwcVar.v = cddVarAh;
        bwcVar.ab(202, defpackage.bvg.d, 0, cddVarAh);
        affgVar.invoke(bveVarC, java.lang.Integer.valueOf((i >> 3) & 14));
        bwcVar.Y(false);
        bwcVar.Y(false);
        bwcVar.h = vujVar2.c() != 0;
        bwcVar.v = null;
        bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.agg(bxkVar, affgVar, i, 19);
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x009b  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void aB(defpackage.bxk[] bxkVarArr, defpackage.affg affgVar, defpackage.bve bveVar, int i) {
        defpackage.cdd cddVarAi;
        boolean z;
        defpackage.bxl bxlVarJ;
        defpackage.bve bveVarC = bveVar.c(415205898);
        defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
        defpackage.cdd cddVarAh = bwcVar.ah();
        bwcVar.ab(201, defpackage.bvg.c, 0, null);
        if (bwcVar.t) {
            cddVarAi = bwcVar.ai(cddVarAh, ay(bxkVarArr, cddVarAh, defpackage.cdd.d));
            bwcVar.p = true;
        } else {
            java.lang.Object objK = bwcVar.m.k(0);
            objK.getClass();
            defpackage.cdd cddVar = (defpackage.cdd) objK;
            java.lang.Object objK2 = bwcVar.m.k(1);
            objK2.getClass();
            defpackage.cdd cddVar2 = (defpackage.cdd) objK2;
            defpackage.cdd cddVarAy = ay(bxkVarArr, cddVarAh, cddVar2);
            if (!bwcVar.H() || bwcVar.i || !defpackage.afga.f(cddVar2, cddVarAy)) {
                cddVarAi = bwcVar.ai(cddVarAh, cddVarAy);
                if (bwcVar.i || !defpackage.afga.f(cddVarAi, cddVar)) {
                    z = true;
                }
                if (z && !bwcVar.t) {
                    bwcVar.aj(cddVarAi);
                }
                defpackage.vuj vujVar = bwcVar.x;
                vujVar.e(bwcVar.h ? 1 : 0);
                bwcVar.h = z;
                bwcVar.v = cddVarAi;
                bwcVar.ab(202, defpackage.bvg.d, 0, cddVarAi);
                affgVar.invoke(bveVarC, java.lang.Integer.valueOf((i >> 3) & 14));
                bwcVar.Y(false);
                bwcVar.Y(false);
                bwcVar.h = vujVar.c() != 0;
                bwcVar.v = null;
                bxlVarJ = bveVarC.J();
                if (bxlVarJ != null) {
                    bxlVarJ.c = new defpackage.agg(bxkVarArr, affgVar, i, 20, null);
                }
            }
            bwcVar.aa();
            cddVarAi = cddVar;
        }
        z = false;
        if (z) {
            bwcVar.aj(cddVarAi);
        }
        defpackage.vuj vujVar2 = bwcVar.x;
        vujVar2.e(bwcVar.h ? 1 : 0);
        bwcVar.h = z;
        bwcVar.v = cddVarAi;
        bwcVar.ab(202, defpackage.bvg.d, 0, cddVarAi);
        affgVar.invoke(bveVarC, java.lang.Integer.valueOf((i >> 3) & 14));
        bwcVar.Y(false);
        bwcVar.Y(false);
        bwcVar.h = vujVar2.c() != 0;
        bwcVar.v = null;
        bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.agg(bxkVarArr, affgVar, i, 20, null);
        }
    }

    public static void aC(long j, defpackage.dgd dgdVar, defpackage.affg affgVar, defpackage.bve bveVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-684938728);
        if (i3 == 0) {
            i2 = (true != bveVarC.B(j) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.C(dgdVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != bveVarC.E(affgVar) ? 128 : 256;
        }
        if (bveVarC.I((i2 & 147) != 146, i2 & 1)) {
            defpackage.bvm bvmVar = defpackage.brv.a;
            aB(new defpackage.bxk[]{defpackage.bnq.a.b(new defpackage.ckd(j)), bvmVar.b(((defpackage.dgd) bveVarC.f(bvmVar)).k(dgdVar))}, affgVar, bveVarC, ((i2 >> 3) & 112) | 8);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.btm(j, dgdVar, affgVar, i, 0);
        }
    }

    public static /* synthetic */ void aD(defpackage.cml cmlVar, long j, float f, float f2, long j2, long j3, defpackage.dai daiVar, int i) {
        long j4 = (i & 16) != 0 ? 0L : j2;
        cmlVar.z(j, f, f2, j4, (i & 32) != 0 ? defpackage.acmj.r(cmlVar.o(), j4) : j3, daiVar);
    }

    public static /* synthetic */ void aE(defpackage.cml cmlVar, defpackage.cka ckaVar, long j, long j2, long j3, defpackage.dai daiVar, int i) {
        if ((i & 2) != 0) {
            j = 0;
        }
        if ((i & 4) != 0) {
            j2 = defpackage.acmj.r(cmlVar.o(), j);
        }
        if ((i & 8) != 0) {
            j3 = 0;
        }
        float f = (i & 16) != 0 ? 1.0f : 0.0f;
        if ((i & 32) != 0) {
            daiVar = defpackage.cmn.a;
        }
        cmlVar.A(ckaVar, j, j2, j3, f, daiVar);
    }

    public static /* synthetic */ void aF(defpackage.cml cmlVar, long j, float f, long j2, defpackage.dai daiVar, int i) {
        if ((i & 2) != 0) {
            f = defpackage.cjl.b(cmlVar.o()) / 2.0f;
        }
        float f2 = f;
        if ((i & 4) != 0) {
            j2 = cmlVar.n();
        }
        cmlVar.v(j, f2, j2, (i & 8) != 0 ? 1.0f : 0.0f, (i & 16) != 0 ? defpackage.cmn.a : daiVar, (i & 64) != 0 ? 3 : 0);
    }

    public static /* synthetic */ void aG(defpackage.cml cmlVar, defpackage.cju cjuVar, defpackage.cka ckaVar, float f, defpackage.dai daiVar, int i) {
        if ((i & 8) != 0) {
            daiVar = defpackage.cmn.a;
        }
        defpackage.dai daiVar2 = daiVar;
        int i2 = (i & 32) != 0 ? 3 : 0;
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        cmlVar.x(cjuVar, ckaVar, f, daiVar2, i2);
    }

    public static /* synthetic */ void aH(defpackage.cml cmlVar, defpackage.cju cjuVar, long j, defpackage.dai daiVar, int i) {
        if ((i & 8) != 0) {
            daiVar = defpackage.cmn.a;
        }
        cmlVar.y(cjuVar, j, (i & 4) != 0 ? 1.0f : 0.0f, daiVar, (i & 32) != 0 ? 3 : 0);
    }

    public static /* synthetic */ void aI(defpackage.cml cmlVar, defpackage.cka ckaVar, long j, long j2, defpackage.dai daiVar, int i, int i2) {
        if ((i2 & 2) != 0) {
            j = 0;
        }
        long j3 = j;
        cmlVar.w(ckaVar, j3, (i2 & 4) != 0 ? defpackage.acmj.r(cmlVar.o(), j3) : j2, (i2 & 8) != 0 ? 1.0f : 0.0f, (i2 & 16) != 0 ? defpackage.cmn.a : daiVar, (i2 & 64) != 0 ? 3 : i);
    }

    public static /* synthetic */ void aJ(defpackage.cml cmlVar, defpackage.cku ckuVar, long j, defpackage.dai daiVar, int i) {
        defpackage.dai daiVar2 = (i & 8) != 0 ? defpackage.cmn.a : daiVar;
        float f = (i & 4) != 0 ? 1.0f : 0.0f;
        if (ckuVar instanceof defpackage.cks) {
            defpackage.cjj cjjVar = ((defpackage.cks) ckuVar).a;
            float f2 = cjjVar.b;
            long jFloatToRawIntBits = java.lang.Float.floatToRawIntBits(f2);
            float f3 = cjjVar.c;
            cmlVar.t(j, (4294967295L & ((long) java.lang.Float.floatToRawIntBits(f3))) | (jFloatToRawIntBits << 32), (((long) java.lang.Float.floatToRawIntBits(cjjVar.e - f3)) & 4294967295L) | (((long) java.lang.Float.floatToRawIntBits(cjjVar.d - f2)) << 32), f, daiVar2, null, 3);
            return;
        }
        if (!(ckuVar instanceof defpackage.ckt)) {
            if (!(ckuVar instanceof defpackage.ckr)) {
                throw new defpackage.afas();
            }
            cmlVar.y(((defpackage.ckr) ckuVar).a, j, f, daiVar2, 3);
            return;
        }
        defpackage.ckt cktVar = (defpackage.ckt) ckuVar;
        defpackage.cju cjuVar = cktVar.b;
        if (cjuVar != null) {
            cmlVar.y(cjuVar, j, f, daiVar2, 3);
            return;
        }
        defpackage.cjk cjkVar = cktVar.a;
        long j2 = cjkVar.h >> 32;
        float f4 = cjkVar.a;
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) j2);
        long jFloatToRawIntBits2 = java.lang.Float.floatToRawIntBits(f4);
        long j3 = jFloatToRawIntBits2 << 32;
        cmlVar.B(j, j3 | (java.lang.Float.floatToRawIntBits(cjkVar.b) & 4294967295L), (((long) java.lang.Float.floatToRawIntBits(cjkVar.b())) << 32) | (((long) java.lang.Float.floatToRawIntBits(cjkVar.a())) & 4294967295L), (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), daiVar2, f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void aK(defpackage.dai daiVar) {
        ajba ajbaVar;
        defpackage.ccq ccqVar;
        defpackage.ccq ccqVar2;
        do {
            ajbaVar = defpackage.bxt.k;
            ccqVar = (defpackage.ccq) ajbaVar.b();
            defpackage.cca ccaVarB = ccqVar.d;
            defpackage.bil bilVar = (defpackage.bil) ccaVarB.get(daiVar);
            if (bilVar == null) {
                ccqVar2 = ccqVar;
            } else {
                defpackage.cck cckVar = ccaVarB.b;
                defpackage.cck cckVarJ = cckVar.j(daiVar != null ? daiVar.hashCode() : 0, daiVar, 0);
                if (cckVar != cckVarJ) {
                    ccaVarB = cckVarJ == null ? defpackage.cca.a : new defpackage.cca(cckVarJ, ccaVarB.a() - 1);
                }
                if (bilVar.d()) {
                    java.lang.Object obj = bilVar.a;
                    V v = ccaVarB.get(obj);
                    v.getClass();
                    ccaVarB = ccaVarB.b(obj, ((defpackage.bil) v).e(bilVar.b));
                }
                if (bilVar.c()) {
                    java.lang.Object obj2 = bilVar.b;
                    V v2 = ccaVarB.get(obj2);
                    v2.getClass();
                    ccaVarB = ccaVarB.b(obj2, new defpackage.bil(bilVar.a, ((defpackage.bil) v2).b));
                }
                ccqVar2 = new defpackage.ccq(!bilVar.d() ? bilVar.b : ccqVar.b, !bilVar.c() ? bilVar.a : ccqVar.c, ccaVarB);
            }
            if (ccqVar == ccqVar2) {
                return;
            }
        } while (!ajbaVar.e(ccqVar, ccqVar2));
    }

    public static double aa(double d, double d2, double d3, double d4, double d5, double d6) {
        return d >= d5 ? java.lang.Math.pow((d2 * d) + d3, d6) : d4 * d;
    }

    public static defpackage.clp ab(defpackage.clp clpVar, defpackage.cmf cmfVar, defpackage.cln clnVar) {
        if (clpVar.b == 12884901888L) {
            clpVar.getClass();
            defpackage.cmd cmdVar = (defpackage.cmd) clpVar;
            defpackage.cmf cmfVar2 = cmdVar.d;
            if (!ac(cmfVar2, cmfVar)) {
                return new defpackage.cmd(cmdVar.a, cmdVar.h, cmfVar, af(ad(clnVar.c, cmfVar2.a(), cmfVar.a()), cmdVar.i), cmdVar.k, cmdVar.n, cmdVar.e, cmdVar.f, cmdVar.g, -1);
            }
        }
        return clpVar;
    }

    public static boolean ac(defpackage.cmf cmfVar, defpackage.cmf cmfVar2) {
        if (cmfVar != cmfVar2) {
            return java.lang.Math.abs(cmfVar.a - cmfVar2.a) < 0.001f && java.lang.Math.abs(cmfVar.b - cmfVar2.b) < 0.001f;
        }
        return true;
    }

    public static float[] ad(float[] fArr, float[] fArr2, float[] fArr3) {
        ag(fArr, fArr2);
        ag(fArr, fArr3);
        float[] fArr4 = {fArr3[0] / fArr2[0], fArr3[1] / fArr2[1], fArr3[2] / fArr2[2]};
        float[] fArrAe = ae(fArr);
        float f = fArr4[0];
        float f2 = fArr[0] * f;
        float f3 = fArr4[1];
        float f4 = fArr[1] * f3;
        float f5 = fArr4[2];
        return af(fArrAe, new float[]{f2, f4, fArr[2] * f5, fArr[3] * f, fArr[4] * f3, fArr[5] * f5, f * fArr[6], f3 * fArr[7], f5 * fArr[8]});
    }

    public static float[] ae(float[] fArr) {
        float f = fArr[0];
        float f2 = fArr[3];
        float f3 = fArr[6];
        float f4 = fArr[1];
        float f5 = fArr[4];
        float f6 = fArr[7];
        float f7 = fArr[2];
        float f8 = fArr[5];
        float f9 = fArr[8];
        float f10 = (f5 * f9) - (f6 * f8);
        float f11 = (f6 * f7) - (f4 * f9);
        float f12 = (f4 * f8) - (f5 * f7);
        int length = fArr.length;
        float f13 = (f * f10) + (f2 * f11) + (f3 * f12);
        return new float[]{f10 / f13, f11 / f13, f12 / f13, ((f3 * f8) - (f2 * f9)) / f13, ((f9 * f) - (f3 * f7)) / f13, ((f7 * f2) - (f8 * f)) / f13, ((f2 * f6) - (f3 * f5)) / f13, ((f3 * f4) - (f6 * f)) / f13, ((f * f5) - (f2 * f4)) / f13};
    }

    public static float[] af(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        int length2 = fArr2.length;
        float f = fArr[0];
        float f2 = fArr2[0];
        float f3 = fArr[3];
        float f4 = fArr2[1];
        float f5 = fArr[6];
        float f6 = fArr2[2];
        float f7 = (f * f2) + (f3 * f4) + (f5 * f6);
        float f8 = fArr[1];
        float f9 = fArr[4];
        float f10 = fArr[7];
        float f11 = (f8 * f2) + (f9 * f4) + (f10 * f6);
        float f12 = fArr[2];
        float f13 = fArr[5];
        float f14 = fArr[8];
        float f15 = (f2 * f12) + (f4 * f13) + (f6 * f14);
        float f16 = fArr2[3];
        float f17 = fArr2[4];
        float f18 = fArr2[5];
        float f19 = (f * f16) + (f3 * f17) + (f5 * f18);
        float f20 = (f8 * f16) + (f9 * f17) + (f10 * f18);
        float f21 = (f16 * f12) + (f17 * f13) + (f18 * f14);
        float f22 = fArr2[6];
        float f23 = fArr2[7];
        float f24 = fArr2[8];
        return new float[]{f7, f11, f15, f19, f20, f21, (f * f22) + (f3 * f23) + (f5 * f24), (f8 * f22) + (f9 * f23) + (f10 * f24), (f12 * f22) + (f13 * f23) + (f14 * f24)};
    }

    public static void ag(float[] fArr, float[] fArr2) {
        float f = fArr2[0];
        float f2 = fArr2[1];
        float f3 = fArr2[2];
        fArr2[0] = (fArr[0] * f) + (fArr[3] * f2) + (fArr[6] * f3);
        fArr2[1] = (fArr[1] * f) + (fArr[4] * f2) + (fArr[7] * f3);
        fArr2[2] = (fArr[2] * f) + (fArr[5] * f2) + (fArr[8] * f3);
    }

    public static defpackage.clu ah(defpackage.clp clpVar, defpackage.clp clpVar2) {
        if (clpVar == clpVar2) {
            return new defpackage.cls(clpVar);
        }
        if (clpVar.b != 12884901888L || clpVar2.b != 12884901888L) {
            return new defpackage.clu(clpVar, clpVar2);
        }
        clpVar.getClass();
        clpVar2.getClass();
        return new defpackage.clt((defpackage.cmd) clpVar, (defpackage.cmd) clpVar2);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    public static void ai(defpackage.cju cjuVar, java.lang.String str) {
        defpackage.cok cokVar = new defpackage.cok();
        cokVar.a(str);
        ?? r2 = cokVar.a;
        if (r2 != 0) {
            Q(r2, cjuVar);
        } else {
            new defpackage.cju((byte[]) null);
        }
    }

    public static defpackage.cgf aj(defpackage.cgf cgfVar, defpackage.affc affcVar) {
        return cgfVar.a(new defpackage.chi(affcVar));
    }

    public static defpackage.cgf ak(defpackage.cgf cgfVar, defpackage.affc affcVar) {
        return cgfVar.a(new defpackage.chl(affcVar));
    }

    public static defpackage.cgf al(defpackage.cgf cgfVar, defpackage.affc affcVar) {
        return cgfVar.a(new defpackage.chm(affcVar));
    }

    public static defpackage.chf am(defpackage.affc affcVar) {
        return new defpackage.chf(new defpackage.chg(), affcVar);
    }

    public static defpackage.cgf an(defpackage.cgf cgfVar, float f) {
        return f == 1.0f ? cgfVar : defpackage.cjv.h(cgfVar, 0.0f, 0.0f, f, 0.0f, 0.0f, null, true, 0, 1044475);
    }

    public static int ao(defpackage.cgm cgmVar) {
        return cgmVar.a;
    }

    public static boolean ap(defpackage.ddz ddzVar) {
        if (defpackage.afga.f(ddzVar.g(defpackage.def.s), defpackage.cgr.a)) {
            return false;
        }
        defpackage.aau aauVar = ddzVar.c;
        return defpackage.aau.f(aauVar, defpackage.ddy.g) || defpackage.aau.f(aauVar, defpackage.ddy.h);
    }

    public static void aq(defpackage.bve bveVar, defpackage.affg affgVar) {
        defpackage.afgz.g(affgVar, 2);
        affgVar.invoke(bveVar, 1);
    }

    public static boolean ar(defpackage.bxl bxlVar, defpackage.bxl bxlVar2) {
        return bxlVar == null || !bxlVar.o() || defpackage.afga.f(bxlVar, bxlVar2) || defpackage.afga.f(bxlVar.e, bxlVar2.e);
    }

    public static defpackage.ccz as(int i, boolean z, java.lang.Object obj, defpackage.bve bveVar) {
        java.lang.Object objG = bveVar.g();
        if (objG == defpackage.bvd.a) {
            objG = new defpackage.ccz(i, z, obj);
            bveVar.x(objG);
        }
        defpackage.ccz cczVar = (defpackage.ccz) objG;
        if (!defpackage.afga.f(cczVar.b, obj)) {
            java.lang.Object obj2 = cczVar.b;
            cczVar.b = obj;
            if (obj2 != null && cczVar.a) {
                defpackage.bxl bxlVar = cczVar.d;
                if (bxlVar != null) {
                    bxlVar.a();
                    cczVar.d = null;
                }
                java.util.List list = cczVar.c;
                if (list != null) {
                    int size = list.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ((defpackage.bxl) list.get(i2)).a();
                    }
                    list.clear();
                }
            }
        }
        return cczVar;
    }

    public static java.lang.Object[] at(java.lang.Object obj) {
        java.lang.Object[] objArr = new java.lang.Object[32];
        objArr[0] = obj;
        return objArr;
    }

    public static aizj au(defpackage.afer aferVar) {
        return new aiza(new defpackage.byr(aferVar, null));
    }

    public static defpackage.bys av(aizj aizjVar, java.lang.Object obj, defpackage.afdo afdoVar, defpackage.byo byoVar, defpackage.bve bveVar, int i) {
        if ((i & 2) != 0) {
            afdoVar = defpackage.afdp.a;
        }
        if ((i & 4) != 0) {
            byoVar = defpackage.bxv.c;
        }
        boolean zE = bveVar.E(afdoVar) | bveVar.E(aizjVar);
        java.lang.Object objG = bveVar.g();
        if (zE || objG == defpackage.bvd.a) {
            objG = new defpackage.aqx(afdoVar, aizjVar, (defpackage.afdk) null, 2);
            bveVar.x(objG);
        }
        defpackage.affg affgVar = (defpackage.affg) objG;
        java.lang.Object objG2 = bveVar.g();
        java.lang.Object obj2 = defpackage.bvd.a;
        if (objG2 == obj2) {
            objG2 = new androidx.compose.runtime.ParcelableSnapshotMutableState(obj, byoVar);
            bveVar.x(objG2);
        }
        defpackage.bwx bwxVar = (defpackage.bwx) objG2;
        boolean zE2 = bveVar.E(affgVar);
        java.lang.Object objG3 = bveVar.g();
        if (zE2 || objG3 == obj2) {
            java.lang.Object amxVar = new defpackage.amx(affgVar, bwxVar, (defpackage.afdk) null, 8, (char[]) null);
            bveVar.x(amxVar);
            objG3 = amxVar;
        }
        defpackage.bvx.f(aizjVar, afdoVar, (defpackage.affg) objG3, bveVar);
        return bwxVar;
    }

    public static defpackage.bys aw(ajay ajayVar, defpackage.afdo afdoVar, defpackage.byo byoVar, defpackage.bve bveVar, int i) {
        if ((i & 1) != 0) {
            afdoVar = defpackage.afdp.a;
        }
        defpackage.afdo afdoVar2 = afdoVar;
        if ((i & 2) != 0) {
            byoVar = defpackage.bxv.c;
        }
        return av(ajayVar, ajayVar.b(), afdoVar2, byoVar, bveVar, 0);
    }

    public static defpackage.bys ax(java.lang.Object obj, java.lang.Object obj2, defpackage.affg affgVar, defpackage.bve bveVar) {
        java.lang.Object objG = bveVar.g();
        java.lang.Object obj3 = defpackage.bvd.a;
        if (objG == obj3) {
            androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState(obj, defpackage.bxv.c);
            bveVar.x(parcelableSnapshotMutableState);
            objG = parcelableSnapshotMutableState;
        }
        defpackage.bwx bwxVar = (defpackage.bwx) objG;
        boolean zE = bveVar.E(affgVar);
        java.lang.Object objG2 = bveVar.g();
        if (zE || objG2 == obj3) {
            defpackage.amx amxVar = new defpackage.amx(affgVar, bwxVar, (defpackage.afdk) null, 7, (byte[]) null);
            bveVar.x(amxVar);
            objG2 = amxVar;
        }
        defpackage.bvx.g(obj2, (defpackage.affg) objG2, bveVar);
        return bwxVar;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [byx, java.lang.Object] */
    public static defpackage.cdd ay(defpackage.bxk[] bxkVarArr, defpackage.cdd cddVar, defpackage.cdd cddVar2) {
        defpackage.cdc cdcVar = new defpackage.cdc(defpackage.cdd.d);
        for (defpackage.bxk bxkVar : bxkVarArr) {
            defpackage.bvm bvmVar = bxkVar.a;
            if (bxkVar.g || !cddVar.containsKey(bvmVar)) {
                ?? r5 = cddVar2.get(bvmVar);
                bxkVar.getClass();
                cdcVar.put(bvmVar, defpackage.bvm.d(bxkVar, r5));
            }
        }
        return cdcVar.b();
    }

    public static java.lang.Object az(defpackage.cdd cddVar, defpackage.bvm bvmVar) {
        bvmVar.getClass();
        java.lang.Object objA = cddVar.get(bvmVar);
        if (objA == null) {
            objA = bvmVar.a();
        }
        return ((defpackage.byx) objA).a(cddVar);
    }

    private static void b(defpackage.cju cjuVar, double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z, boolean z2) {
        double d8;
        double d9;
        double d10 = d5;
        double d11 = (d7 / 180.0d) * 3.141592653589793d;
        double dCos = java.lang.Math.cos(d11);
        double dSin = java.lang.Math.sin(d11);
        double d12 = (((-d) * dSin) + (d2 * dCos)) / d6;
        double d13 = (((-d3) * dSin) + (d4 * dCos)) / d6;
        double d14 = d12 - d13;
        double d15 = ((d * dCos) + (d2 * dSin)) / d10;
        double d16 = ((d3 * dCos) + (d4 * dSin)) / d10;
        double d17 = d15 - d16;
        double d18 = (d17 * d17) + (d14 * d14);
        if (d18 == 0.0d) {
            return;
        }
        double d19 = (1.0d / d18) - 0.25d;
        if (d19 < 0.0d) {
            double dSqrt = (float) (java.lang.Math.sqrt(d18) / 1.99999d);
            b(cjuVar, d, d2, d3, d4, d10 * dSqrt, d6 * dSqrt, d7, z, z2);
            return;
        }
        double dSqrt2 = java.lang.Math.sqrt(d19);
        double d20 = (d12 + d13) / 2.0d;
        double d21 = d17 * dSqrt2;
        double d22 = (d15 + d16) / 2.0d;
        double d23 = dSqrt2 * d14;
        if (z == z2) {
            d8 = d22 - d23;
            d9 = d20 + d21;
        } else {
            d8 = d22 + d23;
            d9 = d20 - d21;
        }
        double d24 = d9;
        double dAtan2 = java.lang.Math.atan2(d12 - d9, d15 - d8);
        double dAtan3 = java.lang.Math.atan2(d13 - d9, d16 - d8) - dAtan2;
        if (z2 != (dAtan3 >= 0.0d)) {
            dAtan3 += dAtan3 > 0.0d ? -6.283185307179586d : 6.283185307179586d;
        }
        double d25 = d8 * d10;
        double d26 = d24 * d6;
        double d27 = d25 * dCos;
        double d28 = d26 * dSin;
        double d29 = d25 * dSin;
        double d30 = d26 * dCos;
        int iCeil = (int) java.lang.Math.ceil(java.lang.Math.abs((dAtan3 * 4.0d) / 3.141592653589793d));
        double dCos2 = java.lang.Math.cos(d11);
        double dSin2 = java.lang.Math.sin(d11);
        double dCos3 = java.lang.Math.cos(dAtan2);
        double dSin3 = java.lang.Math.sin(dAtan2);
        double d31 = -d10;
        double d32 = d31 * dCos2;
        double d33 = d32 * dSin3;
        double d34 = d6 * dSin2;
        double d35 = d34 * dCos3;
        double d36 = d31 * dSin2;
        double d37 = d6 * dCos2;
        double d38 = (dSin3 * d36) + (dCos3 * d37);
        double d39 = d2;
        double d40 = dAtan3;
        double d41 = d33 - d35;
        int i = 0;
        double d42 = d38;
        double d43 = dAtan2;
        double d44 = d;
        while (i < iCeil) {
            int i2 = i;
            double d45 = d43 + (d40 / ((double) iCeil));
            double dSin4 = java.lang.Math.sin(d45);
            double dCos4 = java.lang.Math.cos(d45);
            double d46 = d45 - d43;
            double dTan = java.lang.Math.tan(d46 / 2.0d);
            double dSin5 = (java.lang.Math.sin(d46) * (java.lang.Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d)) / 3.0d;
            double d47 = d39 + (d42 * dSin5);
            int i3 = iCeil;
            double d48 = d29 + d30 + (d10 * dSin2 * dCos4) + (d37 * dSin4);
            double d49 = ((d27 - d28) + ((d10 * dCos2) * dCos4)) - (d34 * dSin4);
            d42 = (dSin4 * d36) + (dCos4 * d37);
            d41 = (d32 * dSin4) - (d34 * dCos4);
            cjuVar.d((float) (d44 + (d41 * dSin5)), (float) d47, (float) (d49 - (dSin5 * d41)), (float) (d48 - (dSin5 * d42)), (float) d49, (float) d48);
            i = i2 + 1;
            d43 = d45;
            d44 = d49;
            dCos2 = dCos2;
            d36 = d36;
            d39 = d48;
            iCeil = i3;
            dSin2 = dSin2;
            d10 = d5;
        }
    }

    public static void i(float[] fArr, float[] fArr2) {
        float fA = a(fArr2, 0, fArr, 0);
        float fA2 = a(fArr2, 0, fArr, 1);
        float fA3 = a(fArr2, 0, fArr, 2);
        float fA4 = a(fArr2, 0, fArr, 3);
        float fA5 = a(fArr2, 1, fArr, 0);
        float fA6 = a(fArr2, 1, fArr, 1);
        float fA7 = a(fArr2, 1, fArr, 2);
        float fA8 = a(fArr2, 1, fArr, 3);
        float fA9 = a(fArr2, 2, fArr, 0);
        float fA10 = a(fArr2, 2, fArr, 1);
        float fA11 = a(fArr2, 2, fArr, 2);
        float fA12 = a(fArr2, 2, fArr, 3);
        float fA13 = a(fArr2, 3, fArr, 0);
        float fA14 = a(fArr2, 3, fArr, 1);
        float fA15 = a(fArr2, 3, fArr, 2);
        float fA16 = a(fArr2, 3, fArr, 3);
        fArr[0] = fA;
        fArr[1] = fA2;
        fArr[2] = fA3;
        fArr[3] = fA4;
        fArr[4] = fA5;
        fArr[5] = fA6;
        fArr[6] = fA7;
        fArr[7] = fA8;
        fArr[8] = fA9;
        fArr[9] = fA10;
        fArr[10] = fA11;
        fArr[11] = fA12;
        fArr[12] = fA13;
        fArr[13] = fA14;
        fArr[14] = fA15;
        fArr[15] = fA16;
    }

    public static void j(float[] fArr, float f, float f2, float[] fArr2) {
        defpackage.ckq.c(fArr2);
        defpackage.ckq.g(fArr2, f, f2);
        i(fArr, fArr2);
    }

    public static boolean k(android.view.View view, android.view.View view2) {
        if (defpackage.afga.f(view2, view)) {
            return false;
        }
        for (android.view.ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view) {
                return true;
            }
        }
        return false;
    }

    public static boolean m() {
        try {
            if (defpackage.czz.a == null) {
                defpackage.czz.a = java.lang.Class.forName("android.os.SystemProperties");
            }
            if (defpackage.czz.b == null) {
                java.lang.Class cls = defpackage.czz.a;
                defpackage.czz.b = cls != null ? cls.getDeclaredMethod("getBoolean", java.lang.String.class, java.lang.Boolean.TYPE) : null;
            }
            java.lang.reflect.Method method = defpackage.czz.b;
            java.lang.Object objInvoke = method != null ? method.invoke(null, "debug.layout", java.lang.Boolean.FALSE) : null;
            return defpackage.afga.f(objInvoke instanceof java.lang.Boolean ? (java.lang.Boolean) objInvoke : null, java.lang.Boolean.TRUE);
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [cge] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [cge] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [bzc] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [bzc] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v7 */
    public static void n(defpackage.czh czhVar, defpackage.affc affcVar) {
        defpackage.cyg cygVar;
        if (!czhVar.M().A) {
            defpackage.csc.c("visitAncestors called on an unattached node");
        }
        defpackage.cge cgeVar = czhVar.M().t;
        defpackage.cxl cxlVarR = defpackage.cjv.r(czhVar);
        while (cxlVarR != null) {
            if ((cxlVarR.v.f.s & 262144) != 0) {
                while (cgeVar != null) {
                    if ((cgeVar.r & 262144) != 0) {
                        ?? O = cgeVar;
                        ?? bzcVar = 0;
                        while (O != 0) {
                            if (O instanceof defpackage.czh) {
                                defpackage.czh czhVar2 = (defpackage.czh) O;
                                if (defpackage.afga.f(czhVar.dx(), czhVar2.dx()) && defpackage.bzd.e(czhVar, czhVar2) && !((java.lang.Boolean) affcVar.invoke(czhVar2)).booleanValue()) {
                                    return;
                                }
                            } else if ((O.r & 262144) != 0 && (O instanceof defpackage.cwo)) {
                                defpackage.cge cgeVar2 = ((defpackage.cwo) O).C;
                                int i = 0;
                                O = O;
                                bzcVar = bzcVar;
                                while (cgeVar2 != null) {
                                    if ((cgeVar2.r & 262144) != 0) {
                                        i++;
                                        if (i == 1) {
                                            bzcVar = bzcVar;
                                            O = cgeVar2;
                                        } else {
                                            if (bzcVar == 0) {
                                                bzcVar = new defpackage.bzc(new defpackage.cge[16]);
                                            }
                                            if (O != 0) {
                                                bzcVar.n(O);
                                            }
                                            bzcVar.n(cgeVar2);
                                            O = 0;
                                        }
                                    }
                                    cgeVar2 = cgeVar2.u;
                                    O = O;
                                    bzcVar = bzcVar;
                                }
                                if (i != 1) {
                                }
                            }
                            O = defpackage.cjv.o(bzcVar);
                        }
                    }
                    cgeVar = cgeVar.t;
                }
            }
            cxlVarR = cxlVarR.l();
            cgeVar = (cxlVarR == null || (cygVar = cxlVarR.v) == null) ? null : cygVar.e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [cge] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [cge] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [bzc] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [bzc] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v6 */
    public static void o(defpackage.cwn cwnVar, java.lang.Object obj, defpackage.affc affcVar) {
        defpackage.cyg cygVar;
        if (!cwnVar.M().A) {
            defpackage.csc.c("visitAncestors called on an unattached node");
        }
        defpackage.cge cgeVar = cwnVar.M().t;
        defpackage.cxl cxlVarR = defpackage.cjv.r(cwnVar);
        while (cxlVarR != null) {
            if ((cxlVarR.v.f.s & 262144) != 0) {
                while (cgeVar != null) {
                    if ((cgeVar.r & 262144) != 0) {
                        ?? O = cgeVar;
                        ?? bzcVar = 0;
                        while (O != 0) {
                            if (O instanceof defpackage.czh) {
                                defpackage.czh czhVar = (defpackage.czh) O;
                                if (defpackage.afga.f(obj, czhVar.dx()) && !((java.lang.Boolean) affcVar.invoke(czhVar)).booleanValue()) {
                                    return;
                                }
                            } else if ((O.r & 262144) != 0 && (O instanceof defpackage.cwo)) {
                                defpackage.cge cgeVar2 = ((defpackage.cwo) O).C;
                                int i = 0;
                                O = O;
                                bzcVar = bzcVar;
                                while (cgeVar2 != null) {
                                    if ((cgeVar2.r & 262144) != 0) {
                                        i++;
                                        if (i == 1) {
                                            bzcVar = bzcVar;
                                            O = cgeVar2;
                                        } else {
                                            if (bzcVar == 0) {
                                                bzcVar = new defpackage.bzc(new defpackage.cge[16]);
                                            }
                                            if (O != 0) {
                                                bzcVar.n(O);
                                            }
                                            bzcVar.n(cgeVar2);
                                            O = 0;
                                        }
                                    }
                                    cgeVar2 = cgeVar2.u;
                                    O = O;
                                    bzcVar = bzcVar;
                                }
                                if (i != 1) {
                                }
                            }
                            O = defpackage.cjv.o(bzcVar);
                        }
                    }
                    cgeVar = cgeVar.t;
                }
            }
            cxlVarR = cxlVarR.l();
            cgeVar = (cxlVarR == null || (cygVar = cxlVarR.v) == null) ? null : cygVar.e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [cge] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [cge] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [bzc] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [bzc] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public static void p(defpackage.czh czhVar, defpackage.affc affcVar) {
        if (!czhVar.M().A) {
            defpackage.csc.c("visitSubtreeIf called on an unattached node");
        }
        defpackage.bzc bzcVar = new defpackage.bzc(new defpackage.cge[16]);
        defpackage.cge cgeVar = czhVar.M().u;
        if (cgeVar == null) {
            defpackage.cjv.x(bzcVar, czhVar.M());
        } else {
            bzcVar.n(cgeVar);
        }
        while (true) {
            int i = bzcVar.b;
            if (i == 0) {
                return;
            }
            defpackage.cge cgeVar2 = (defpackage.cge) bzcVar.c(i - 1);
            if ((cgeVar2.s & 262144) != 0) {
                defpackage.cge cgeVar3 = cgeVar2;
                while (true) {
                    if (cgeVar3 != null && cgeVar3.A) {
                        if ((cgeVar3.r & 262144) != 0) {
                            ?? O = cgeVar3;
                            ?? bzcVar2 = 0;
                            while (O != 0) {
                                if (O instanceof defpackage.czh) {
                                    defpackage.czh czhVar2 = (defpackage.czh) O;
                                    defpackage.czg czgVar = (defpackage.afga.f(czhVar.dx(), czhVar2.dx()) && defpackage.bzd.e(czhVar, czhVar2)) ? (defpackage.czg) affcVar.invoke(czhVar2) : defpackage.czg.a;
                                    if (czgVar != defpackage.czg.c) {
                                        if (czgVar == defpackage.czg.b) {
                                            break;
                                        }
                                    } else {
                                        return;
                                    }
                                } else if ((O.r & 262144) != 0 && (O instanceof defpackage.cwo)) {
                                    defpackage.cge cgeVar4 = ((defpackage.cwo) O).C;
                                    int i2 = 0;
                                    O = O;
                                    bzcVar2 = bzcVar2;
                                    while (cgeVar4 != null) {
                                        if ((cgeVar4.r & 262144) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                bzcVar2 = bzcVar2;
                                                O = cgeVar4;
                                            } else {
                                                if (bzcVar2 == 0) {
                                                    bzcVar2 = new defpackage.bzc(new defpackage.cge[16]);
                                                }
                                                if (O != 0) {
                                                    bzcVar2.n(O);
                                                }
                                                bzcVar2.n(cgeVar4);
                                                O = 0;
                                            }
                                        }
                                        cgeVar4 = cgeVar4.u;
                                        O = O;
                                        bzcVar2 = bzcVar2;
                                    }
                                    if (i2 != 1) {
                                    }
                                }
                                O = defpackage.cjv.o(bzcVar2);
                            }
                        }
                        cgeVar3 = cgeVar3.u;
                    }
                }
            }
            defpackage.cjv.x(bzcVar, cgeVar2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [cge] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [cge] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [bzc] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [bzc] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v8 */
    public static void q(defpackage.cwn cwnVar, java.lang.Object obj, defpackage.affc affcVar) {
        if (!cwnVar.M().A) {
            defpackage.csc.c("visitSubtreeIf called on an unattached node");
        }
        defpackage.bzc bzcVar = new defpackage.bzc(new defpackage.cge[16]);
        defpackage.cge cgeVar = cwnVar.M().u;
        if (cgeVar == null) {
            defpackage.cjv.x(bzcVar, cwnVar.M());
        } else {
            bzcVar.n(cgeVar);
        }
        while (true) {
            int i = bzcVar.b;
            if (i == 0) {
                return;
            }
            defpackage.cge cgeVar2 = (defpackage.cge) bzcVar.c(i - 1);
            if ((cgeVar2.s & 262144) != 0) {
                defpackage.cge cgeVar3 = cgeVar2;
                while (true) {
                    if (cgeVar3 != null && cgeVar3.A) {
                        if ((cgeVar3.r & 262144) != 0) {
                            ?? O = cgeVar3;
                            ?? bzcVar2 = 0;
                            while (O != 0) {
                                if (O instanceof defpackage.czh) {
                                    defpackage.czh czhVar = (defpackage.czh) O;
                                    defpackage.czg czgVar = defpackage.afga.f(obj, czhVar.dx()) ? (defpackage.czg) affcVar.invoke(czhVar) : defpackage.czg.a;
                                    if (czgVar != defpackage.czg.c) {
                                        if (czgVar == defpackage.czg.b) {
                                            break;
                                        }
                                    } else {
                                        return;
                                    }
                                } else if ((O.r & 262144) != 0 && (O instanceof defpackage.cwo)) {
                                    defpackage.cge cgeVar4 = ((defpackage.cwo) O).C;
                                    int i2 = 0;
                                    O = O;
                                    bzcVar2 = bzcVar2;
                                    while (cgeVar4 != null) {
                                        if ((cgeVar4.r & 262144) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                bzcVar2 = bzcVar2;
                                                O = cgeVar4;
                                            } else {
                                                if (bzcVar2 == 0) {
                                                    bzcVar2 = new defpackage.bzc(new defpackage.cge[16]);
                                                }
                                                if (O != 0) {
                                                    bzcVar2.n(O);
                                                }
                                                bzcVar2.n(cgeVar4);
                                                O = 0;
                                            }
                                        }
                                        cgeVar4 = cgeVar4.u;
                                        O = O;
                                        bzcVar2 = bzcVar2;
                                    }
                                    if (i2 != 1) {
                                    }
                                }
                                O = defpackage.cjv.o(bzcVar2);
                            }
                        }
                        cgeVar3 = cgeVar3.u;
                    }
                }
            }
            defpackage.cjv.x(bzcVar, cgeVar2);
        }
    }

    public static defpackage.cjj r(defpackage.cge cgeVar, boolean z, boolean z2) {
        if (!cgeVar.q.A) {
            return defpackage.cjj.a;
        }
        if (z) {
            return defpackage.cjv.s(cgeVar, 8).ad();
        }
        defpackage.cyl cylVarS = defpackage.cjv.s(cgeVar, 8);
        return defpackage.csc.g(cylVarS).o(cylVarS, z2);
    }

    public static boolean s(defpackage.ddz ddzVar) {
        return ddzVar.g(defpackage.ddy.b) != null;
    }

    public static defpackage.dfa t(defpackage.dfa dfaVar) {
        java.lang.Object obj = dfaVar.a;
        obj.getClass();
        return new defpackage.dfa(((defpackage.dfv) obj).a, dfaVar.b, dfaVar.c, dfaVar.d);
    }

    public static int u(java.util.List list, int i) throws java.io.IOException {
        int i2;
        int i3 = ((defpackage.dfk) defpackage.afga.aE(list)).b;
        if (i > ((defpackage.dfk) defpackage.afga.aE(list)).b) {
            defpackage.dki.c(defpackage.a.bn(i3, i, "Index ", " should be less or equal than last line's end "));
        }
        int size = list.size() - 1;
        int i4 = 0;
        while (true) {
            byte b = 1;
            if (i4 > size) {
                i2 = -(i4 + 1);
                break;
            }
            i2 = (i4 + size) >>> 1;
            defpackage.dfk dfkVar = (defpackage.dfk) list.get(i2);
            if (dfkVar.a <= i) {
                b = dfkVar.b <= i ? (byte) -1 : (byte) 0;
            }
            if (b >= 0) {
                if (b <= 0) {
                    break;
                }
                size = i2 - 1;
            } else {
                i4 = i2 + 1;
            }
        }
        if (i2 >= 0 && i2 < list.size()) {
            return i2;
        }
        defpackage.dki.c("Found paragraph index " + i2 + " should be in range [0, " + list.size() + ").\nDebug info: index=" + i + ", paragraphs=[" + defpackage.dmh.c(list, null, null, null, new defpackage.cyw(10), 31) + "]");
        return i2;
    }

    public static int v(java.util.List list, int i) {
        int size = list.size() - 1;
        int i2 = 0;
        while (true) {
            byte b = 1;
            if (i2 > size) {
                return -(i2 + 1);
            }
            int i3 = (i2 + size) >>> 1;
            defpackage.dfk dfkVar = (defpackage.dfk) list.get(i3);
            if (dfkVar.c <= i) {
                b = dfkVar.d <= i ? (byte) -1 : (byte) 0;
            }
            if (b < 0) {
                i2 = i3 + 1;
            } else {
                if (b <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
    }

    public static int w(java.util.List list, float f) {
        if (f <= 0.0f) {
            return 0;
        }
        if (f >= ((defpackage.dfk) defpackage.afga.aE(list)).f) {
            return defpackage.afga.ab(list);
        }
        int size = list.size() - 1;
        int i = 0;
        while (true) {
            byte b = 1;
            if (i > size) {
                return -(i + 1);
            }
            int i2 = (i + size) >>> 1;
            defpackage.dfk dfkVar = (defpackage.dfk) list.get(i2);
            if (dfkVar.e <= f) {
                b = dfkVar.f <= f ? (byte) -1 : (byte) 0;
            }
            if (b < 0) {
                i = i2 + 1;
            } else {
                if (b <= 0) {
                    return i2;
                }
                size = i2 - 1;
            }
        }
    }

    public static void x(java.util.List list, long j, defpackage.affc affcVar) throws java.io.IOException {
        int size = list.size();
        for (int iU = u(list, defpackage.dgc.d(j)); iU < size; iU++) {
            defpackage.dfk dfkVar = (defpackage.dfk) list.get(iU);
            int i = dfkVar.a;
            if (i >= defpackage.dgc.c(j)) {
                return;
            }
            if (i != dfkVar.b) {
                affcVar.invoke(dfkVar);
            }
        }
    }

    public static defpackage.cgf y(defpackage.cgf cgfVar, java.lang.String str) {
        return cgfVar.a(new defpackage.dci(str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void z(defpackage.cge cgeVar, defpackage.afer aferVar) {
        defpackage.cyq cyqVar = cgeVar.v;
        if (cyqVar == null) {
            cyqVar = new defpackage.cyq((defpackage.cyp) cgeVar);
            cgeVar.v = cyqVar;
        }
        defpackage.cyx cyxVar = ((defpackage.czz) defpackage.cjv.t(cgeVar)).w;
        ((defpackage.cez) cyxVar.a).b(cyqVar, defpackage.cyq.a, aferVar);
    }

    public final android.view.View l(int i, android.view.View view) throws java.lang.NoSuchMethodException {
        if (android.os.Build.VERSION.SDK_INT < 29) {
            java.lang.reflect.Method declaredMethod = defpackage.czz.f;
            if (declaredMethod == null) {
                declaredMethod = java.lang.Class.forName("android.view.View").getDeclaredMethod("getAccessibilityViewId", null);
                defpackage.czz.f = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            if (defpackage.afga.f(declaredMethod.invoke(view, null), java.lang.Integer.valueOf(i))) {
                return view;
            }
            if (view instanceof android.view.ViewGroup) {
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    android.view.View viewL = l(i, viewGroup.getChildAt(i2));
                    if (viewL != null) {
                        return viewL;
                    }
                }
            }
        }
        return null;
    }

    public dai(byte[] bArr) {
    }
}
