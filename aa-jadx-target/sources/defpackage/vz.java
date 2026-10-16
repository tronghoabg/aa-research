package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public /* synthetic */ class vz {
    public static defpackage.bmz a(defpackage.bnk bnkVar) {
        defpackage.bmz bmzVar = bnkVar.Y;
        if (bmzVar != null) {
            return bmzVar;
        }
        defpackage.bmz bmzVar2 = new defpackage.bmz(defpackage.bnl.e(bnkVar, 39), defpackage.bnl.a(bnkVar, defpackage.bnl.e(bnkVar, 39)), defpackage.cjv.m(defpackage.ckd.h(defpackage.bnl.e(bnkVar, 44), 0.38f), defpackage.bnl.e(bnkVar, 39)), defpackage.ckd.h(defpackage.bnl.a(bnkVar, defpackage.bnl.e(bnkVar, 39)), 0.38f));
        bnkVar.Y = bmzVar2;
        return bmzVar2;
    }

    public static defpackage.cld b(defpackage.bve bveVar) {
        return defpackage.bqa.b(13, bveVar);
    }

    public static defpackage.bmz c(defpackage.bve bveVar) {
        return a(defpackage.bxi.n(bveVar));
    }

    public static defpackage.bmz d(long j, long j2, defpackage.bve bveVar, int i) {
        defpackage.bve bveVar2;
        long jD;
        long jC = (i & 1) != 0 ? defpackage.cjv.c() : j;
        if ((i & 2) != 0) {
            bveVar2 = bveVar;
            jD = defpackage.bnl.d(jC, bveVar2);
        } else {
            bveVar2 = bveVar;
            jD = j2;
        }
        long jC2 = defpackage.cjv.c();
        long jH = defpackage.ckd.h(jD, 0.38f);
        defpackage.bmz bmzVarA = a(defpackage.bxi.n(bveVar2));
        if (jC == 16) {
            jC = bmzVarA.a;
        }
        long j3 = jC;
        if (jD == 16) {
            jD = bmzVarA.b;
        }
        long j4 = jD;
        if (jC2 == 16) {
            jC2 = bmzVarA.c;
        }
        long j5 = jC2;
        if (jH == 16) {
            jH = bmzVarA.d;
        }
        return new defpackage.bmz(j3, j4, j5, jH);
    }

    public static defpackage.bna e(int i) {
        return new defpackage.bna(0.0f, 0.0f, 0.0f, (i & 8) != 0 ? 1.0f : 0.0f, 0.0f);
    }

    public static java.lang.CharSequence f(java.lang.CharSequence charSequence) {
        if (charSequence.length() <= 5000) {
            return charSequence;
        }
        return (java.lang.Character.isHighSurrogate(charSequence.charAt(4999)) && java.lang.Character.isLowSurrogate(charSequence.charAt(5000))) ? afzh.y(charSequence, 4999) : afzh.y(charSequence, 5000);
    }

    public static android.view.autofill.AutofillValue g(java.lang.String str) {
        return a$.ExternalSyntheticApiModelOutline1.m(f(str));
    }

    public static java.lang.Object h(defpackage.zhs zhsVar, defpackage.afdk afdkVar) throws java.lang.Throwable {
        try {
            if (zhsVar.isDone()) {
                int i = defpackage.dod.c;
                return defpackage.a.K(zhsVar);
            }
            aiug aiugVar = new aiug(defpackage.afga.s(afdkVar), 1);
            aiugVar.z();
            zhsVar.c(new flc(zhsVar, aiugVar, 1), doj.a);
            aiugVar.d(new dnh(zhsVar, 3));
            return aiugVar.k();
        } catch (java.util.concurrent.ExecutionException e) {
            throw i(e);
        }
    }

    public static java.lang.Throwable i(java.util.concurrent.ExecutionException executionException) {
        java.lang.Throwable cause = executionException.getCause();
        cause.getClass();
        return cause;
    }

    public static void l(defpackage.afer aferVar, defpackage.dns dnsVar, defpackage.affg affgVar, defpackage.bve bveVar, int i) {
        defpackage.afer aferVar2;
        int i2;
        boolean z;
        boolean z2;
        defpackage.bve bveVarC = bveVar.c(826668973);
        if ((i & 6) == 0) {
            aferVar2 = aferVar;
            i2 = (true != bveVarC.E(aferVar2) ? 2 : 4) | i;
        } else {
            aferVar2 = aferVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.C(dnsVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != bveVarC.E(affgVar) ? 128 : 256;
        }
        int i3 = i2;
        if (bveVarC.I((i3 & 147) != 146, i3 & 1)) {
            android.view.View view = (android.view.View) bveVarC.f(defpackage.daj.f);
            defpackage.dlo dloVar = (defpackage.dlo) bveVarC.f(defpackage.dbl.d);
            defpackage.dlz dlzVar = (defpackage.dlz) bveVarC.f(defpackage.dbl.i);
            defpackage.bvi bviVarD = bveVarC.d();
            defpackage.bys bysVarC = defpackage.bzd.c(affgVar, bveVarC);
            java.lang.Object[] objArr = new java.lang.Object[0];
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            java.lang.Object objS = bwcVar.S();
            java.lang.Object obj = defpackage.bvd.a;
            if (objS == obj) {
                objS = new defpackage.bmd(17);
                bwcVar.ad(objS);
            }
            java.util.UUID uuid = (java.util.UUID) defpackage.bxi.h(objArr, (defpackage.afer) objS, bveVarC);
            boolean zC = bveVarC.C(view) | bveVarC.C(dloVar) | bveVarC.A(2) | bveVarC.C(null);
            java.lang.Object objS2 = bwcVar.S();
            if (zC || objS2 == obj) {
                z = false;
                dnu dnuVar = new dnu(aferVar2, dnsVar, view, dlzVar, dloVar, uuid);
                z2 = true;
                dnuVar.c.k(bviVarD, new defpackage.ccz(-1338939603, true, new defpackage.bmc(bysVarC, 10)));
                bwcVar.ad(dnuVar);
                objS2 = dnuVar;
            } else {
                z2 = true;
                z = false;
            }
            dnu dnuVar2 = (dnu) objS2;
            boolean zE = bveVarC.E(dnuVar2);
            java.lang.Object objS3 = bwcVar.S();
            if (zE || objS3 == obj) {
                objS3 = new defpackage.deh(dnuVar2, 8);
                bwcVar.ad(objS3);
            }
            defpackage.bvx.c(dnuVar2, (defpackage.affc) objS3, bveVarC);
            boolean zE2 = bveVarC.E(dnuVar2) | ((i3 & 14) == 4 ? z2 : z);
            if ((i3 & 112) == 32) {
                z = z2;
            }
            boolean zA = zE2 | z | bveVarC.A(dlzVar.ordinal()) | bveVarC.C(dloVar);
            java.lang.Object objS4 = bwcVar.S();
            if (zA || objS4 == obj) {
                dnc dncVar = new dnc(dnuVar2, aferVar, dnsVar, dlzVar, dloVar, 1);
                bwcVar.ad(dncVar);
                objS4 = dncVar;
            }
            bveVarC.r((defpackage.afer) objS4);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.cvf(aferVar, dnsVar, affgVar, i, 2);
        }
    }

    public static void m(defpackage.cgf cgfVar, defpackage.affg affgVar, defpackage.bve bveVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(1090521195);
        if (i3 == 0) {
            i2 = (true != bveVarC.C(cgfVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.E(affgVar) ? 16 : 32;
        }
        int i4 = 3;
        if (bveVarC.I((i2 & 19) != 18, i2 & 1)) {
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            java.lang.Object objS = bwcVar.S();
            if (objS == defpackage.bvd.a) {
                objS = dni.b;
                bwcVar.ad(objS);
            }
            defpackage.cty ctyVar = (defpackage.cty) objS;
            int iF = defpackage.a.f(bwcVar.u);
            defpackage.cdd cddVarAh = bwcVar.ah();
            defpackage.cgf cgfVarN = defpackage.bzo.n(bveVarC, cgfVar);
            int i5 = (((((i2 << 3) & 112) | (((i2 >> 3) & 14) | 384)) << 6) & 896) | 6;
            defpackage.afer aferVar = defpackage.cwl.a;
            bveVarC.w();
            if (bwcVar.t) {
                bveVarC.j(aferVar);
            } else {
                bveVarC.y();
            }
            defpackage.byw.c(bveVarC, ctyVar, defpackage.cwl.e);
            defpackage.byw.c(bveVarC, cddVarAh, defpackage.cwl.d);
            defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF), defpackage.cwl.f);
            defpackage.byw.b(bveVarC, defpackage.cwl.g);
            defpackage.byw.c(bveVarC, cgfVarN, defpackage.cwl.c);
            affgVar.invoke(bveVarC, java.lang.Integer.valueOf((i5 >> 6) & 14));
            bwcVar.Y(true);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.bru(cgfVar, affgVar, i, i4);
        }
    }

    public static android.view.View n(defpackage.cge cgeVar) {
        android.view.View viewH = defpackage.cjv.r(cgeVar.q).h();
        if (viewH != null) {
            return viewH;
        }
        throw new java.lang.IllegalStateException("Could not fetch interop view");
    }

    public static boolean o(android.view.View view, android.view.View view2) {
        for (android.view.ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view.getParent()) {
                return true;
            }
        }
        return false;
    }

    public void j(android.view.View view, android.graphics.Rect rect) {
        android.util.DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        rect.set(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    public void k(android.view.View view, int i, int i2) {
    }
}
