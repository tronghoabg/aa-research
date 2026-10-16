package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class mlv {
    private static defpackage.mlv a;

    public mlv() {
    }

    public static void A(android.view.ViewGroup viewGroup, fgj fgjVar) {
        fgjVar.N(com.google.android.material.tabs.TabLayout.class);
        fgo.b(viewGroup, fgjVar);
    }

    public static defpackage.yhe C(android.content.Context context, boolean z) {
        defpackage.yha yhaVar = new defpackage.yha(4);
        E(new inr(context, 11), z, yhaVar);
        E(new okd(context, 3), z, yhaVar);
        E(new okd(context, 4), z, yhaVar);
        E(new inr(context, 12), z, yhaVar);
        E(new inr(context, 13), z, yhaVar);
        E(new inr(context, 14), z, yhaVar);
        E(new inr(context, 15), z, yhaVar);
        E(new inr(context, 16), z, yhaVar);
        E(new inr(context, 17), z, yhaVar);
        E(new inr(context, 18), z, yhaVar);
        E(new inr(context, 19), z, yhaVar);
        E(new inr(context, 20), z, yhaVar);
        E(new okd(context, 1), z, yhaVar);
        D(new okd(context, 0), new defpackage.joi(9), z, yhaVar);
        D(new okd(context, 2), new defpackage.joi(10), z, yhaVar);
        return yhaVar.d(true);
    }

    public static void D(defpackage.xzi xziVar, defpackage.xzi xziVar2, boolean z, defpackage.yha yhaVar) {
        if (!z || ((java.lang.Boolean) xziVar2.fF()).booleanValue()) {
            okc okcVar = (okc) xziVar.fF();
            yhaVar.f(okcVar.c, okcVar);
        }
    }

    public static void E(defpackage.xzi xziVar, boolean z, defpackage.yha yhaVar) {
        D(xziVar, new defpackage.joi(11), z, yhaVar);
    }

    public static defpackage.mlv F() {
        defpackage.mlv mlvVar = a;
        if (mlvVar != null) {
            return mlvVar;
        }
        defpackage.mlv mlvVar2 = new defpackage.mlv();
        a = mlvVar2;
        return mlvVar2;
    }

    private static double G(double d) {
        double d2 = d / 255.0d;
        return d2 <= 0.03928d ? d2 / 12.92d : java.lang.Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
    }

    public static boolean a(defpackage.qsh qshVar, java.lang.String str, com.google.android.gms.car.CarInfo carInfo) {
        if (carInfo != null) {
            return ((java.lang.Boolean) defpackage.kgu.c(new defpackage.mmh(qshVar, carInfo, str, 1), "GH.EVSettingMgr", defpackage.zbe.SETTINGS_EV, defpackage.zbd.dZ, true, "Cannot access car", new java.lang.Object[0])).booleanValue();
        }
        throw new java.lang.RuntimeException("Missing carInfo, cannot retrieve carService setting");
    }

    public static void b(defpackage.qsh qshVar, java.lang.String str, boolean z, com.google.android.gms.car.CarInfo carInfo) {
        if (carInfo == null) {
            throw new java.lang.RuntimeException("Missing carInfo, cannot set carService setting");
        }
        defpackage.kgu.d(new mlu(qshVar, carInfo, str, z), "GH.EVSettingMgr", defpackage.zbe.SETTINGS_EV, defpackage.zbd.dZ, "Cannot access car", new java.lang.Object[0]);
    }

    public static void c() {
    }

    public static com.google.android.gms.car.CarInfo d(defpackage.qsh qshVar) {
        return (com.google.android.gms.car.CarInfo) defpackage.kgu.c(new defpackage.kjf(qshVar, 2), "GH.CarSettingsService", defpackage.zbe.SETTINGS_EV, defpackage.zbd.dZ, true, "Cannot access car", new java.lang.Object[0]);
    }

    public static void e(kqo kqoVar, mln mlnVar, android.content.Context context, boolean z) {
        java.lang.String strG;
        java.lang.String string;
        mlnVar.a(z);
        mlnVar.c = kqoVar;
        mlnVar.b = true;
        int i = kqoVar.d;
        if (i != 2) {
            strG = kqoVar.g();
        } else if (kqoVar.o() && z) {
            java.lang.String strG2 = kqoVar.g();
            strG = strG2.length() > 20 ? context.getString(2132085101, strG2.subSequence(0, 20).toString().trim()) : context.getString(2132085100, strG2);
            i = 2;
        } else {
            i = 2;
            strG = kqoVar.g();
        }
        mlnVar.d = strG;
        if (i == 1) {
            string = context.getString(2132085097);
        } else if (i == 2) {
            string = context.getString(2132085096);
        } else {
            int i2 = kqoVar.c;
            if (i2 == 2) {
                string = context.getString(2132085098);
            } else {
                string = i2 == 3 ? context.getString(2132085095) : context.getString(2132085095);
            }
        }
        mlnVar.e = string;
    }

    public static defpackage.mkk f() {
        return (defpackage.mkk) defpackage.mkp.a.i(defpackage.mkk.class);
    }

    public static java.lang.String g(defpackage.bys bysVar) {
        return (java.lang.String) bysVar.a();
    }

    public static void h(defpackage.cgf cgfVar, nes nesVar, defpackage.bve bveVar, int i) {
        int i2;
        defpackage.bve bveVarC = bveVar.c(1228191168);
        if ((i & 6) == 0) {
            i2 = (true != bveVarC.C(cgfVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= 16;
        }
        if (bveVarC.I((i2 & 19) != 18, i2 & 1)) {
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            bwcVar.ab(-127, null, 0, null);
            if ((i & 1) == 0 || bveVarC.F()) {
                defpackage.bvm bvmVar = defpackage.esn.a;
                defpackage.esa esaVarA = defpackage.esn.a(bveVarC);
                if (esaVarA == null) {
                    throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                nesVar = (nes) defpackage.ebl.l(defpackage.afgw.b(nes.class), esaVarA, null, null, defpackage.edd.f(esaVarA));
            } else {
                bveVarC.s();
            }
            bveVarC.l();
            java.util.regex.Pattern patternCompile = java.util.regex.Pattern.compile("(\\d{1,2}:)?\\d{2}:\\d{2}$");
            patternCompile.getClass();
            boolean zE = bveVarC.E(nesVar);
            java.lang.Object objS = bwcVar.S();
            if (zE || objS == defpackage.bvd.a) {
                objS = new defpackage.kyt(nesVar, 6);
                bwcVar.ad(objS);
            }
            defpackage.yqm yqmVar = nes.a;
            defpackage.kmj.a(nesVar, (defpackage.mnj) objS, bveVarC, 8, 0);
            java.lang.Object objS2 = bwcVar.S();
            java.lang.Object obj = defpackage.bvd.a;
            if (objS2 == obj) {
                objS2 = new defpackage.mus(20);
                bwcVar.ad(objS2);
            }
            defpackage.cgf cgfVarI = defpackage.edd.i(cgfVar, (defpackage.afer) objS2);
            java.lang.Object objS3 = bwcVar.S();
            if (objS3 == obj) {
                objS3 = new defpackage.asl();
                bwcVar.ad(objS3);
            }
            defpackage.ca.at(cgfVarI, null, defpackage.dai.as(-343067436, true, new nem(nesVar, patternCompile, 0), bveVarC), bveVarC, 3072, 6);
        } else {
            bveVarC.s();
        }
        nes nesVar2 = nesVar;
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.nau(cgfVar, nesVar2, i, 3, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1, types: [cgc] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [cgf] */
    public static void i(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, defpackage.cgf cgfVar, defpackage.affh affhVar, mwh mwhVar, defpackage.afer aferVar, defpackage.bve bveVar, int i) {
        int i2;
        ?? r3;
        defpackage.awe aweVar;
        defpackage.affg affgVar;
        defpackage.bwc bwcVar;
        boolean z;
        int i3;
        boolean z2;
        boolean z3;
        int i4 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-1471204726);
        if (i4 == 0) {
            i2 = (true != ((i & 8) == 0 ? bveVarC.C(charSequence) : bveVarC.E(charSequence)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? bveVarC.C(charSequence2) : bveVarC.E(charSequence2)) ? 16 : 32;
        }
        int i5 = i2 | 384;
        if ((i & 3072) == 0) {
            i5 |= true != bveVarC.E(affhVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i5 |= true != ((32768 & i) == 0 ? bveVarC.C(mwhVar) : bveVarC.E(mwhVar)) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i5 |= true != bveVarC.E(aferVar) ? 65536 : 131072;
        }
        int i6 = i5;
        if (bveVarC.I((i6 & 74899) != 74898, i6 & 1)) {
            defpackage.cgc cgcVar = defpackage.cgf.e;
            defpackage.cgf cgfVarC = defpackage.awj.c(defpackage.dai.y(cgcVar, "mini_notification_card"), 1.0f);
            if (aferVar != null) {
                cgfVarC = defpackage.afw.x(cgfVarC, true, null, null, aferVar);
            }
            defpackage.cgf cgfVarA = cgfVarC.a(new defpackage.ajc(defpackage.kfp.i(bveVarC).G(), defpackage.cky.a));
            float f = defpackage.gjr.P1.k;
            defpackage.cgf cgfVarI = defpackage.asq.I(cgfVarA, f, 0.0f);
            defpackage.cty ctyVarA = defpackage.awb.a(defpackage.ati.g, defpackage.cfs.n, bveVarC, 54);
            defpackage.bwc bwcVar2 = (defpackage.bwc) bveVarC;
            int iF = defpackage.a.f(bwcVar2.u);
            defpackage.cdd cddVarAh = bwcVar2.ah();
            defpackage.cgf cgfVarN = defpackage.bzo.n(bveVarC, cgfVarI);
            defpackage.afer aferVar2 = defpackage.cwl.a;
            bveVarC.w();
            if (bwcVar2.t) {
                bveVarC.j(aferVar2);
            } else {
                bveVarC.y();
            }
            defpackage.affg affgVar2 = defpackage.cwl.e;
            defpackage.byw.c(bveVarC, ctyVarA, affgVar2);
            defpackage.affg affgVar3 = defpackage.cwl.d;
            defpackage.byw.c(bveVarC, cddVarAh, affgVar3);
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(iF);
            defpackage.affg affgVar4 = defpackage.cwl.f;
            defpackage.byw.c(bveVarC, numValueOf, affgVar4);
            defpackage.affc affcVar = defpackage.cwl.g;
            defpackage.byw.b(bveVarC, affcVar);
            defpackage.affg affgVar5 = defpackage.cwl.c;
            defpackage.byw.c(bveVarC, cgfVarN, affgVar5);
            defpackage.awe aweVar2 = defpackage.awe.a;
            if (mwhVar != null) {
                bveVarC.v(-1944281695);
                aweVar = aweVar2;
                affgVar = affgVar3;
                bwcVar = bwcVar2;
                mwn.d(mwhVar, "mini_action_1", false, defpackage.awj.m(cgcVar, 124.0f), bveVarC, ((i6 >> 12) & 14) | 432);
                z = false;
                bwcVar.Y(false);
            } else {
                aweVar = aweVar2;
                affgVar = affgVar3;
                bwcVar = bwcVar2;
                z = false;
                bveVarC.v(-1944078924);
                bwcVar.Y(false);
            }
            defpackage.cgf cgfVarJ = defpackage.asq.J(aweVar.b(cgcVar, 1.0f, z), mwhVar != null ? f : 0.0f, 0.0f, affhVar == null ? 0.0f : f, 0.0f);
            defpackage.cty ctyVarA2 = defpackage.atu.a(defpackage.ati.e, defpackage.cfs.j, bveVarC, 6);
            int iF2 = defpackage.a.f(bwcVar.u);
            defpackage.cdd cddVarAh2 = bwcVar.ah();
            defpackage.cgf cgfVarN2 = defpackage.bzo.n(bveVarC, cgfVarJ);
            bveVarC.w();
            if (bwcVar.t) {
                bveVarC.j(aferVar2);
            } else {
                bveVarC.y();
            }
            defpackage.byw.c(bveVarC, ctyVarA2, affgVar2);
            defpackage.byw.c(bveVarC, cddVarAh2, affgVar);
            defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF2), affgVar4);
            defpackage.byw.b(bveVarC, affcVar);
            defpackage.byw.c(bveVarC, cgfVarN2, affgVar5);
            if (charSequence == null || charSequence.length() == 0) {
                i3 = 6;
                z2 = true;
                z3 = false;
                bveVarC.v(1129367230);
                bwcVar.Y(false);
            } else {
                bveVarC.v(1129139225);
                i3 = 6;
                z2 = true;
                z3 = false;
                defpackage.brv.b(charSequence.toString(), null, defpackage.kfp.i(bveVarC).s(), 0L, null, 0L, null, 0L, 2, false, 1, 0, defpackage.bxi.p(bveVarC).h, bveVarC, 0, 24960, 110586);
                bwcVar.Y(false);
            }
            if (charSequence2 == null || charSequence2.length() == 0) {
                bveVarC = bveVarC;
                bveVarC = bveVarC;
                bveVarC.v(1129658878);
                bwcVar.Y(z3);
            } else {
                bveVarC = bveVarC;
                bveVarC.v(1129422224);
                defpackage.bve bveVar2 = bveVarC;
                defpackage.brv.b(charSequence2.toString(), null, defpackage.kfp.i(bveVarC).t(), 0L, null, 0L, null, 0L, 2, false, 1, 0, defpackage.bxi.p(bveVarC).k, bveVar2, 0, 24960, 110586);
                bveVarC = bveVar2;
                bwcVar.Y(z3);
            }
            bwcVar.Y(z2);
            if (affhVar != null) {
                bveVarC.v(-1943174964);
                affhVar.invoke(defpackage.dai.y(defpackage.awj.i(cgcVar, 64.0f), "mini_icon"), bveVarC, java.lang.Integer.valueOf(i3 | ((i6 >> 6) & 112)));
                bwcVar.Y(z3);
            } else {
                bveVarC.v(-1943105772);
                bwcVar.Y(z3);
            }
            bwcVar.Y(z2);
            r3 = cgcVar;
        } else {
            bveVarC.s();
            r3 = cgfVar;
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.bpo(charSequence, charSequence2, (defpackage.cgf) r3, affhVar, mwhVar, aferVar, i, 6);
        }
    }

    public static void j(defpackage.ltm ltmVar, defpackage.ltm ltmVar2, defpackage.ltm ltmVar3, boolean z, defpackage.affg affgVar, long j, long j2, defpackage.ckd ckdVar, long j3, defpackage.cgf cgfVar, com.google.android.apps.auto.components.media.compat.AaPlaybackState aaPlaybackState, boolean z2, defpackage.bve bveVar, int i, int i2) {
        int i3;
        defpackage.ltm ltmVar4;
        defpackage.ltm ltmVar5;
        int i4;
        defpackage.bve bveVar2;
        boolean z3;
        int i5 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-938580605);
        if (i5 == 0) {
            i3 = (true != bveVarC.E(ltmVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            ltmVar4 = ltmVar2;
            i3 |= true != bveVarC.E(ltmVar4) ? 16 : 32;
        } else {
            ltmVar4 = ltmVar2;
        }
        if ((i & 384) == 0) {
            ltmVar5 = ltmVar3;
            i3 |= true != bveVarC.E(ltmVar5) ? 128 : 256;
        } else {
            ltmVar5 = ltmVar3;
        }
        if ((i & 3072) == 0) {
            i3 |= true != bveVarC.D(z) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i3 |= true != bveVarC.E(affgVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i3 |= true != bveVarC.B(j) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i3 |= true != bveVarC.B(j2) ? 524288 : 1048576;
        }
        if ((i & 12582912) == 0) {
            i3 |= true != bveVarC.C(ckdVar) ? 4194304 : 8388608;
        }
        if ((i & 100663296) == 0) {
            i3 |= true != bveVarC.B(j3) ? 33554432 : 67108864;
        }
        if ((i & 805306368) == 0) {
            i3 |= true != bveVarC.C(cgfVar) ? 268435456 : 536870912;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (true != bveVarC.E(aaPlaybackState) ? 2 : 4);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != bveVarC.D(z2) ? 16 : 32;
        }
        int i6 = i4;
        if (bveVarC.I(((306783379 & i3) == 306783378 && (i6 & 19) == 18) ? false : true, i3 & 1)) {
            defpackage.ktf ktfVarA = z2 ? defpackage.ktf.a(defpackage.ktf.b, 0.0f, 38.0f, null, 0.0f, 509) : defpackage.ktf.a(defpackage.ktf.c, 0.0f, 42.0f, null, 0.0f, 509);
            defpackage.cgf cgfVarI = defpackage.asq.I(cgfVar.a(new defpackage.ajc(j3, defpackage.cky.a)), (z2 ? defpackage.gjr.P2 : defpackage.gjr.P3).k, defpackage.gjr.P1.k);
            defpackage.cty ctyVarA = defpackage.awb.a(defpackage.ati.a, defpackage.cfs.n, bveVarC, 48);
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            int i7 = i3;
            int iF = defpackage.a.f(bwcVar.u);
            defpackage.cdd cddVarAh = bwcVar.ah();
            defpackage.cgf cgfVarN = defpackage.bzo.n(bveVarC, cgfVarI);
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
            int i8 = i7 << 3;
            int i9 = i6 << 18;
            defpackage.awe aweVar = defpackage.awe.a;
            defpackage.myx.r(aweVar, ltmVar, ltmVar4, ltmVar5, null, false, aaPlaybackState, ktfVarA, z, j, j2, ckdVar, false, false, bveVarC, (i8 & 7168) | (i8 & 112) | 221190 | (i8 & 896) | (i9 & 3670016) | (234881024 & (i7 << 15)) | (1879048192 & (i7 << 12)), (i7 >> 18) & 126, 6144);
            bveVar2 = bveVarC;
            defpackage.asq.A(aweVar.b(defpackage.cgf.e, 1.0f, true), bveVar2);
            if (affgVar == null) {
                bveVar2.v(-940307302);
                z3 = false;
            } else {
                z3 = false;
                bveVar2.v(662404167);
                affgVar.invoke(bveVar2, java.lang.Integer.valueOf((i7 >> 12) & 14));
            }
            bwcVar.Y(z3);
            bwcVar.Y(true);
        } else {
            bveVar2 = bveVarC;
            bveVar2.s();
        }
        defpackage.bxl bxlVarJ = bveVar2.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new nbq(ltmVar, ltmVar2, ltmVar3, z, affgVar, j, j2, ckdVar, j3, cgfVar, aaPlaybackState, z2, i, i2);
        }
    }

    public static boolean r(int i) {
        return i != 1;
    }

    public static boolean s(android.net.Uri uri) {
        return "android.resource".equals(uri.getScheme());
    }

    public static boolean t(android.net.Uri uri) {
        return "content".equals(uri.getScheme()) || "file".equals(uri.getScheme());
    }

    public static boolean u(android.net.Uri uri) {
        return "shortcut.icon.resource".equals(uri.getScheme());
    }

    public static boolean v(android.net.Uri uri) {
        java.lang.String scheme = uri.getScheme();
        if (scheme != null) {
            scheme = scheme.toLowerCase(java.util.Locale.US);
        }
        return "http".equals(scheme) || "https".equals(scheme);
    }

    public static double y(int i) {
        return (G(android.graphics.Color.red(i)) * 0.2126d) + (G(android.graphics.Color.green(i)) * 0.7152d) + (G(android.graphics.Color.blue(i)) * 0.0722d);
    }

    public static double z(int i, int i2) {
        double dY = y(i);
        double dY2 = y(i2);
        return (java.lang.Math.max(dY, dY2) + 0.05d) / (java.lang.Math.min(dY, dY2) + 0.05d);
    }

    public final int w(android.content.Context context, int i) {
        return x(4.5d, i, context.getResources().getColor(2131100624), context.getResources().getColor(2131100621));
    }

    public final int x(double d, int i, int... iArr) {
        for (int i2 = 0; i2 < 2; i2++) {
            int i3 = iArr[i2];
            if (z(i, i3) >= d) {
                return i3;
            }
        }
        if (z(i, -1) >= z(i, -16777216)) {
            android.util.Log.w("GH.ColorChecker", "Tint color does not meet contrast requirements. Using white.");
            return -1;
        }
        android.util.Log.w("GH.ColorChecker", "Tint color does not meet contrast requirements. Using black.");
        return -16777216;
    }

    public mlv(byte[] bArr) {
    }

    public void k() {
    }

    public void l() {
    }

    public void m() {
    }

    public void n() {
    }

    public void o() {
    }

    public void p() {
    }

    public void q() {
    }
}
