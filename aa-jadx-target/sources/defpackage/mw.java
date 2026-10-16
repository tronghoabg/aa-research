package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class mw {
    public static int a() {
        return android.os.Build.VERSION.SDK_INT < 36 ? android.os.Build.VERSION.SDK_INT * 100000 : b$.ExternalSyntheticApiModelOutline0.m();
    }

    public static final int b(android.view.View view) {
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.getMarginEnd();
        }
        return 0;
    }

    public static final int c(android.view.View view) {
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.getMarginStart();
        }
        return 0;
    }

    public static final int d(android.view.View view) {
        int measuredHeight = view.getMeasuredHeight();
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        int i = measuredHeight + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
        android.view.ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
        return i + (marginLayoutParams2 != null ? marginLayoutParams2.bottomMargin : 0);
    }

    public static final int e(android.view.View view) {
        return c(view) + b(view);
    }

    public static final int f(android.view.View view) {
        return view.getMeasuredWidth() + e(view);
    }

    public static androidx.car.app.SessionInfo g(android.content.Intent intent) {
        android.os.Bundle extras = intent.getExtras();
        if (extras == null) {
            throw new java.lang.IllegalArgumentException("Expected the SessionInfo to be encoded in the bind intent extras, but the extras were null.");
        }
        android.os.Bundle bundle = extras.getBundle("androidx.car.app.extra.SESSION_INFO_BUNDLE");
        return new androidx.car.app.SessionInfo(bundle.getInt("display-type"), bundle.getString("session-id"));
    }

    public static void h(androidx.car.app.SessionInfo sessionInfo, android.content.Intent intent) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            ep$.ExternalSyntheticApiModelOutline0.m(intent, sessionInfo.toString());
        } else {
            intent.setData(new android.net.Uri.Builder().path(sessionInfo.toString()).build());
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("display-type", sessionInfo.getDisplayType());
        bundle.putString("session-id", sessionInfo.getSessionId());
        intent.putExtra("androidx.car.app.extra.SESSION_INFO_BUNDLE", bundle);
    }

    public static boolean i(android.content.Intent intent) {
        android.os.Bundle extras = intent.getExtras();
        if (extras == null) {
            return false;
        }
        return extras.containsKey("androidx.car.app.extra.SESSION_INFO_BUNDLE");
    }

    public static void j(android.content.Context context, java.lang.String str) {
        if (android.util.Log.isLoggable("CarApp", 3)) {
            android.util.Log.d("CarApp", "Checking to see if the car app requested the required library permission: ".concat(str));
        }
        try {
            try {
                k(context, str);
            } catch (android.content.pm.PackageManager.NameNotFoundException e) {
                android.util.Log.e("CarApp", "Package name not found on the system: ".concat(java.lang.String.valueOf(context.getPackageName())), e);
                throw new java.lang.SecurityException("The car app does not have a required permission: ".concat(str));
            }
        } catch (java.lang.SecurityException unused) {
            android.content.pm.PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
            if (packageInfo.requestedPermissions != null) {
                for (java.lang.String str2 : packageInfo.requestedPermissions) {
                    if (str2.equals(str)) {
                        return;
                    }
                }
            }
            throw new java.lang.SecurityException("The car app does not have a required permission: ".concat(str));
        }
    }

    public static void k(android.content.Context context, java.lang.String str) {
        if (context.getPackageManager().checkPermission(str, context.getPackageName()) != 0) {
            throw new java.lang.SecurityException("The car app does not have the required permission: ".concat(str));
        }
    }

    public static final defpackage.cjc l(defpackage.cjc cjcVar) {
        defpackage.cjc cjcVarB = ((defpackage.czz) defpackage.cjv.t(cjcVar)).J.b();
        if (cjcVarB == null || !cjcVarB.A) {
            return null;
        }
        return cjcVarB;
    }

    public static final defpackage.cjc m(defpackage.cjc cjcVar) {
        boolean z = cjcVar.q.A;
        if (z) {
            if (!z) {
                defpackage.csc.c("visitChildren called on an unattached node");
            }
            defpackage.bzc bzcVar = new defpackage.bzc(new defpackage.cge[16]);
            defpackage.cge cgeVar = cjcVar.q;
            defpackage.cge cgeVar2 = cgeVar.u;
            if (cgeVar2 == null) {
                defpackage.cjv.x(bzcVar, cgeVar);
            } else {
                bzcVar.n(cgeVar2);
            }
            while (true) {
                int i = bzcVar.b;
                if (i == 0) {
                    break;
                }
                defpackage.cge cgeVarO = (defpackage.cge) bzcVar.c(i - 1);
                if ((cgeVarO.s & 1024) == 0) {
                    defpackage.cjv.x(bzcVar, cgeVarO);
                } else {
                    while (cgeVarO != null) {
                        if ((cgeVarO.r & 1024) != 0) {
                            defpackage.bzc bzcVar2 = null;
                            while (cgeVarO != null) {
                                if (cgeVarO instanceof defpackage.cjc) {
                                    defpackage.cjc cjcVar2 = (defpackage.cjc) cgeVarO;
                                    if (cjcVar2.q.A) {
                                        int iOrdinal = cjcVar2.g().ordinal();
                                        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
                                            return cjcVar2;
                                        }
                                        if (iOrdinal != 3) {
                                            throw new defpackage.afas();
                                        }
                                    }
                                } else if ((cgeVarO.r & 1024) != 0 && (cgeVarO instanceof defpackage.cwo)) {
                                    int i2 = 0;
                                    for (defpackage.cge cgeVar3 = ((defpackage.cwo) cgeVarO).C; cgeVar3 != null; cgeVar3 = cgeVar3.u) {
                                        if ((cgeVar3.r & 1024) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                cgeVarO = cgeVar3;
                                            } else {
                                                if (bzcVar2 == null) {
                                                    bzcVar2 = new defpackage.bzc(new defpackage.cge[16]);
                                                }
                                                if (cgeVarO != null) {
                                                    bzcVar2.n(cgeVarO);
                                                }
                                                bzcVar2.n(cgeVar3);
                                                cgeVarO = null;
                                            }
                                        }
                                    }
                                    if (i2 != 1) {
                                    }
                                }
                                cgeVarO = defpackage.cjv.o(bzcVar2);
                            }
                            break;
                        }
                        cgeVarO = cgeVarO.u;
                    }
                }
            }
        }
        return null;
    }

    public static final defpackage.cjj n(defpackage.cjc cjcVar) {
        defpackage.cyl cylVar;
        defpackage.ctc ctcVarG;
        if (cjcVar.A && (cylVar = cjcVar.w) != null && (ctcVarG = defpackage.csc.g(cylVar)) != null) {
            if (true != ctcVarG.t()) {
                ctcVarG = null;
            }
            if (ctcVarG != null) {
                return cjcVar.h(ctcVarG);
            }
        }
        return defpackage.cjj.a;
    }

    public static final boolean o(defpackage.cjc cjcVar) {
        defpackage.cxl cxlVar;
        defpackage.cyl cylVar;
        defpackage.cxl cxlVar2;
        defpackage.cyl cylVar2 = cjcVar.w;
        return (cylVar2 == null || (cxlVar = cylVar2.t) == null || !cxlVar.an() || (cylVar = cjcVar.w) == null || (cxlVar2 = cylVar.t) == null || !cxlVar2.am()) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0164 A[PHI: r14
  0x0164: PHI (r14v2 bzc) = (r14v1 bzc), (r14v1 bzc), (r14v1 bzc), (r14v4 bzc) binds: [B:89:0x012a, B:91:0x0130, B:93:0x0134, B:107:0x0162] A[DONT_GENERATE, DONT_INLINE]] */
    public static final boolean p(defpackage.cjc cjcVar) {
        defpackage.bzc bzcVar;
        defpackage.cyg cygVar;
        int i;
        defpackage.cyg cygVar2;
        defpackage.cik cikVar = ((defpackage.czz) defpackage.cjv.t(cjcVar)).J;
        defpackage.cjc cjcVarB = cikVar.b();
        defpackage.cja cjaVarG = cjcVar.g();
        int i2 = 1;
        if (cjcVarB == cjcVar) {
            cjcVar.l(cjaVarG, cjaVarG);
            return true;
        }
        if ((cjcVarB == null || cjcVarB.a) && !cjcVar.a && !((defpackage.czz) defpackage.cjv.t(cjcVar)).J.m()) {
            return false;
        }
        if (cjcVarB != null) {
            bzcVar = new defpackage.bzc(new defpackage.cjc[16]);
            if (!cjcVarB.q.A) {
                defpackage.csc.c("visitAncestors called on an unattached node");
            }
            defpackage.cge cgeVar = cjcVarB.q.t;
            defpackage.cxl cxlVarR = defpackage.cjv.r(cjcVarB);
            while (cxlVarR != null) {
                if ((cxlVarR.v.f.s & 1024) != 0) {
                    while (cgeVar != null) {
                        if ((cgeVar.r & 1024) != 0) {
                            defpackage.cge cgeVarO = cgeVar;
                            defpackage.bzc bzcVar2 = null;
                            while (cgeVarO != null) {
                                if (cgeVarO instanceof defpackage.cjc) {
                                    bzcVar.n((defpackage.cjc) cgeVarO);
                                } else if ((cgeVarO.r & 1024) != 0 && (cgeVarO instanceof defpackage.cwo)) {
                                    int i3 = 0;
                                    for (defpackage.cge cgeVar2 = ((defpackage.cwo) cgeVarO).C; cgeVar2 != null; cgeVar2 = cgeVar2.u) {
                                        if ((cgeVar2.r & 1024) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                cgeVarO = cgeVar2;
                                            } else {
                                                if (bzcVar2 == null) {
                                                    bzcVar2 = new defpackage.bzc(new defpackage.cge[16]);
                                                }
                                                if (cgeVarO != null) {
                                                    bzcVar2.n(cgeVarO);
                                                }
                                                bzcVar2.n(cgeVar2);
                                                cgeVarO = null;
                                            }
                                        }
                                    }
                                    if (i3 != 1) {
                                    }
                                }
                                cgeVarO = defpackage.cjv.o(bzcVar2);
                            }
                        }
                        cgeVar = cgeVar.t;
                    }
                }
                cxlVarR = cxlVarR.l();
                cgeVar = (cxlVarR == null || (cygVar2 = cxlVarR.v) == null) ? null : cygVar2.e;
            }
        } else {
            bzcVar = null;
        }
        defpackage.bzc bzcVar3 = new defpackage.bzc(new defpackage.cjc[16]);
        defpackage.bzc bzcVar4 = new defpackage.bzc(new defpackage.cjc[16]);
        if (!cjcVar.q.A) {
            defpackage.csc.c("visitAncestors called on an unattached node");
        }
        defpackage.cge cgeVar3 = cjcVar.q.t;
        defpackage.cxl cxlVarR2 = defpackage.cjv.r(cjcVar);
        int i4 = 1;
        while (cxlVarR2 != null) {
            if ((cxlVarR2.v.f.s & 1024) != 0) {
                while (cgeVar3 != null) {
                    if ((cgeVar3.r & 1024) != 0) {
                        defpackage.cge cgeVarO2 = cgeVar3;
                        defpackage.bzc bzcVar5 = null;
                        while (cgeVarO2 != null) {
                            if (cgeVarO2 instanceof defpackage.cjc) {
                                defpackage.cjc cjcVar2 = (defpackage.cjc) cgeVarO2;
                                if (defpackage.afga.f(bzcVar != null ? java.lang.Boolean.valueOf(bzcVar.m(cjcVar2)) : null, java.lang.Boolean.TRUE)) {
                                    bzcVar3.n(cjcVar2);
                                } else {
                                    bzcVar4.n(cjcVar2);
                                }
                                i4 &= cjcVar2 == cjcVarB ? 0 : i2;
                                i = 0;
                            } else {
                                i = i2;
                            }
                            if (i == 0 || (cgeVarO2.r & 1024) == 0 || !(cgeVarO2 instanceof defpackage.cwo)) {
                                cgeVarO2 = defpackage.cjv.o(bzcVar5);
                                i2 = 1;
                            } else {
                                defpackage.cge cgeVar4 = ((defpackage.cwo) cgeVarO2).C;
                                int i5 = 0;
                                while (cgeVar4 != null) {
                                    if ((cgeVar4.r & 1024) != 0) {
                                        i5++;
                                        if (i5 == i2) {
                                            cgeVarO2 = cgeVar4;
                                        } else {
                                            if (bzcVar5 == null) {
                                                bzcVar5 = new defpackage.bzc(new defpackage.cge[16]);
                                            }
                                            if (cgeVarO2 != null) {
                                                bzcVar5.n(cgeVarO2);
                                            }
                                            bzcVar5.n(cgeVar4);
                                            cgeVarO2 = null;
                                        }
                                    }
                                    cgeVar4 = cgeVar4.u;
                                    i2 = 1;
                                }
                                if (i5 != i2) {
                                    cgeVarO2 = defpackage.cjv.o(bzcVar5);
                                    i2 = 1;
                                }
                            }
                        }
                    }
                    cgeVar3 = cgeVar3.t;
                    i2 = 1;
                }
            }
            cxlVarR2 = cxlVarR2.l();
            if (cxlVarR2 == null || (cygVar = cxlVarR2.v) == null) {
                i2 = 1;
                cgeVar3 = null;
            } else {
                cgeVar3 = cygVar.e;
                i2 = 1;
            }
        }
        if (i4 != 0 && cjcVarB != null && !q(cjcVarB, false)) {
            return false;
        }
        defpackage.dai.z(cjcVar, new defpackage.oe(cjcVar, 16));
        int iOrdinal = cjcVar.g().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                ((defpackage.czz) defpackage.cjv.t(cjcVar)).J.g(cjcVar);
            } else if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new defpackage.afas();
                }
                ((defpackage.czz) defpackage.cjv.t(cjcVar)).J.g(cjcVar);
            }
        }
        if (i4 != 0 && cjcVarB != null) {
            cjcVarB.l(defpackage.cja.a, defpackage.cja.d);
        }
        if (bzcVar != null) {
            int i6 = bzcVar.b - 1;
            java.lang.Object[] objArr = bzcVar.a;
            if (i6 < objArr.length) {
                while (i6 >= 0) {
                    defpackage.cjc cjcVar3 = (defpackage.cjc) objArr[i6];
                    if (cikVar.b() != cjcVar) {
                        return false;
                    }
                    cjcVar3.l(defpackage.cja.b, defpackage.cja.d);
                    i6--;
                }
            }
        }
        int i7 = bzcVar4.b - 1;
        java.lang.Object[] objArr2 = bzcVar4.a;
        if (i7 < objArr2.length) {
            while (i7 >= 0) {
                defpackage.cjc cjcVar4 = (defpackage.cjc) objArr2[i7];
                if (cikVar.b() != cjcVar) {
                    return false;
                }
                cjcVar4.l(cjcVar4 == cjcVarB ? defpackage.cja.a : defpackage.cja.d, defpackage.cja.b);
                i7--;
            }
        }
        if (cikVar.b() != cjcVar) {
            return false;
        }
        cjcVar.l(cjaVarG, defpackage.cja.a);
        return cikVar.b() == cjcVar;
    }

    public static final boolean q(defpackage.cjc cjcVar, boolean z) {
        int iOrdinal = cjcVar.g().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    return z;
                }
                if (iOrdinal == 3) {
                    return true;
                }
                throw new defpackage.afas();
            }
            defpackage.cjc cjcVarM = m(cjcVar);
            if (cjcVarM != null && !q(cjcVarM, z)) {
                return false;
            }
            cjcVar.l(defpackage.cja.b, defpackage.cja.d);
        }
        return true;
    }

    public static final int r(defpackage.cjc cjcVar, int i) {
        int iOrdinal = cjcVar.g().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                int iR = r(x(cjcVar), i);
                if (iR == 1) {
                    iR = 0;
                }
                if (iR != 0) {
                    return iR;
                }
                if (cjcVar.b) {
                    return 1;
                }
                cjcVar.b = true;
                try {
                    defpackage.cim cimVarB = cjcVar.b();
                    defpackage.chw chwVar = new defpackage.chw(i);
                    defpackage.cik cikVar = ((defpackage.czz) defpackage.cjv.t(cjcVar)).J;
                    defpackage.cjc cjcVarB = cikVar.b();
                    ((defpackage.cio) cimVarB).k.invoke(chwVar);
                    defpackage.cjc cjcVarB2 = cikVar.b();
                    if (chwVar.b) {
                        cjcVar.b = false;
                        return 2;
                    }
                    if (cjcVarB == cjcVarB2 || cjcVarB2 == null) {
                        cjcVar.b = false;
                        return 1;
                    }
                    defpackage.cit citVar = defpackage.cit.c;
                    defpackage.cit citVar2 = defpackage.cit.b;
                    cjcVar.b = false;
                    return citVar == citVar2 ? 2 : 3;
                } catch (java.lang.Throwable th) {
                    cjcVar.b = false;
                    throw th;
                }
            }
            if (iOrdinal == 2) {
                return 2;
            }
            if (iOrdinal != 3) {
                throw new defpackage.afas();
            }
        }
        return 1;
    }

    public static final int s(defpackage.cjc cjcVar, int i) {
        defpackage.cge cgeVar;
        defpackage.cyg cygVar;
        int iOrdinal = cjcVar.g().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return r(x(cjcVar), i);
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new defpackage.afas();
                }
                if (!cjcVar.q.A) {
                    defpackage.csc.c("visitAncestors called on an unattached node");
                }
                defpackage.cge cgeVar2 = cjcVar.q.t;
                defpackage.cxl cxlVarR = defpackage.cjv.r(cjcVar);
                loop0: while (true) {
                    cgeVar = null;
                    if (cxlVarR == null) {
                        break;
                    }
                    if ((cxlVarR.v.f.s & 1024) != 0) {
                        while (cgeVar2 != null) {
                            if ((cgeVar2.r & 1024) != 0) {
                                defpackage.cge cgeVarO = cgeVar2;
                                defpackage.bzc bzcVar = null;
                                while (cgeVarO != null) {
                                    if (cgeVarO instanceof defpackage.cjc) {
                                        cgeVar = cgeVarO;
                                        break loop0;
                                    }
                                    if ((cgeVarO.r & 1024) != 0 && (cgeVarO instanceof defpackage.cwo)) {
                                        int i2 = 0;
                                        for (defpackage.cge cgeVar3 = ((defpackage.cwo) cgeVarO).C; cgeVar3 != null; cgeVar3 = cgeVar3.u) {
                                            if ((cgeVar3.r & 1024) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    cgeVarO = cgeVar3;
                                                } else {
                                                    if (bzcVar == null) {
                                                        bzcVar = new defpackage.bzc(new defpackage.cge[16]);
                                                    }
                                                    if (cgeVarO != null) {
                                                        bzcVar.n(cgeVarO);
                                                    }
                                                    bzcVar.n(cgeVar3);
                                                    cgeVarO = null;
                                                }
                                            }
                                        }
                                        if (i2 != 1) {
                                        }
                                    }
                                    cgeVarO = defpackage.cjv.o(bzcVar);
                                }
                            }
                            cgeVar2 = cgeVar2.t;
                        }
                    }
                    cxlVarR = cxlVarR.l();
                    cgeVar2 = (cxlVarR == null || (cygVar = cxlVarR.v) == null) ? null : cygVar.e;
                }
                defpackage.cjc cjcVar2 = (defpackage.cjc) cgeVar;
                if (cjcVar2 == null) {
                    return 1;
                }
                int iOrdinal2 = cjcVar2.g().ordinal();
                if (iOrdinal2 == 0) {
                    return y(cjcVar2, i);
                }
                if (iOrdinal2 == 1) {
                    return s(cjcVar2, i);
                }
                if (iOrdinal2 == 2) {
                    return 2;
                }
                if (iOrdinal2 != 3) {
                    throw new defpackage.afas();
                }
                int iS = s(cjcVar2, i);
                int i3 = iS != 1 ? iS : 0;
                return i3 == 0 ? y(cjcVar2, i) : i3;
            }
        }
        return 1;
    }

    public static final boolean t(defpackage.cjc cjcVar) {
        defpackage.cdv cdvVar;
        if (cjcVar.d == null && (cdvVar = (defpackage.cdv) defpackage.cjv.y(cjcVar, defpackage.cdx.a)) != null) {
            java.lang.Object objA = cdvVar.a("pfc" + defpackage.cjv.r(cjcVar).i);
            if (objA != null) {
                cjcVar.d = (java.lang.Integer) objA;
            }
        }
        if (cjcVar.d != null) {
            if (!cjcVar.q.A) {
                defpackage.csc.c("visitChildren called on an unattached node");
            }
            defpackage.bzc bzcVar = new defpackage.bzc(new defpackage.cge[16]);
            defpackage.cge cgeVar = cjcVar.q;
            defpackage.cge cgeVar2 = cgeVar.u;
            if (cgeVar2 == null) {
                defpackage.cjv.x(bzcVar, cgeVar);
            } else {
                bzcVar.n(cgeVar2);
            }
            while (true) {
                int i = bzcVar.b;
                if (i == 0) {
                    break;
                }
                defpackage.cge cgeVarO = (defpackage.cge) bzcVar.c(i - 1);
                if ((cgeVarO.s & 1024) == 0) {
                    defpackage.cjv.x(bzcVar, cgeVarO);
                } else {
                    while (cgeVarO != null) {
                        if ((cgeVarO.r & 1024) != 0) {
                            defpackage.bzc bzcVar2 = null;
                            while (cgeVarO != null) {
                                if (cgeVarO instanceof defpackage.cjc) {
                                    defpackage.cjc cjcVar2 = (defpackage.cjc) cgeVarO;
                                    if (cjcVar2.A) {
                                        int i2 = defpackage.cjv.r(cjcVar2).i;
                                        java.lang.Integer num = cjcVar.d;
                                        if (num != null && i2 == num.intValue()) {
                                            if (t(cjcVar2)) {
                                                return true;
                                            }
                                            return ((defpackage.cio) cjcVar2.b()).a && cjcVar2.k(7);
                                        }
                                    }
                                } else if ((cgeVarO.r & 1024) != 0 && (cgeVarO instanceof defpackage.cwo)) {
                                    int i3 = 0;
                                    for (defpackage.cge cgeVar3 = ((defpackage.cwo) cgeVarO).C; cgeVar3 != null; cgeVar3 = cgeVar3.u) {
                                        if ((cgeVar3.r & 1024) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                cgeVarO = cgeVar3;
                                            } else {
                                                if (bzcVar2 == null) {
                                                    bzcVar2 = new defpackage.bzc(new defpackage.cge[16]);
                                                }
                                                if (cgeVarO != null) {
                                                    bzcVar2.n(cgeVarO);
                                                }
                                                bzcVar2.n(cgeVar3);
                                                cgeVarO = null;
                                            }
                                        }
                                    }
                                    if (i3 != 1) {
                                    }
                                }
                                cgeVarO = defpackage.cjv.o(bzcVar2);
                            }
                            break;
                        }
                        cgeVarO = cgeVarO.u;
                    }
                }
            }
        }
        return false;
    }

    public static final boolean u(defpackage.cjc cjcVar) {
        if (cjcVar.g().a()) {
            if (!cjcVar.q.A) {
                defpackage.csc.c("visitChildren called on an unattached node");
            }
            defpackage.bzc bzcVar = new defpackage.bzc(new defpackage.cge[16]);
            defpackage.cge cgeVar = cjcVar.q;
            defpackage.cge cgeVar2 = cgeVar.u;
            if (cgeVar2 == null) {
                defpackage.cjv.x(bzcVar, cgeVar);
            } else {
                bzcVar.n(cgeVar2);
            }
            while (true) {
                int i = bzcVar.b;
                if (i == 0) {
                    break;
                }
                defpackage.cge cgeVarO = (defpackage.cge) bzcVar.c(i - 1);
                if ((cgeVarO.s & 1024) == 0) {
                    defpackage.cjv.x(bzcVar, cgeVarO);
                } else {
                    while (cgeVarO != null) {
                        if ((cgeVarO.r & 1024) != 0) {
                            defpackage.bzc bzcVar2 = null;
                            while (cgeVarO != null) {
                                int i2 = 1;
                                if (cgeVarO instanceof defpackage.cjc) {
                                    defpackage.cjc cjcVar2 = (defpackage.cjc) cgeVarO;
                                    if (cjcVar2.g().a()) {
                                        int i3 = defpackage.cjv.r(cjcVar2).i;
                                        cjcVar.d = java.lang.Integer.valueOf(i3);
                                        defpackage.cdv cdvVar = (defpackage.cdv) defpackage.cjv.y(cjcVar, defpackage.cdx.a);
                                        defpackage.rqj rqjVar = cjcVar.f;
                                        if (rqjVar != null) {
                                            rqjVar.b();
                                        }
                                        cjcVar.f = cdvVar != null ? cdvVar.e("pfc" + defpackage.cjv.r(cjcVar).i, new defpackage.kmr(i3, i2)) : null;
                                        return true;
                                    }
                                } else if ((cgeVarO.r & 1024) != 0 && (cgeVarO instanceof defpackage.cwo)) {
                                    int i4 = 0;
                                    for (defpackage.cge cgeVar3 = ((defpackage.cwo) cgeVarO).C; cgeVar3 != null; cgeVar3 = cgeVar3.u) {
                                        if ((cgeVar3.r & 1024) != 0) {
                                            i4++;
                                            if (i4 == 1) {
                                                cgeVarO = cgeVar3;
                                            } else {
                                                if (bzcVar2 == null) {
                                                    bzcVar2 = new defpackage.bzc(new defpackage.cge[16]);
                                                }
                                                if (cgeVarO != null) {
                                                    bzcVar2.n(cgeVarO);
                                                }
                                                bzcVar2.n(cgeVar3);
                                                cgeVarO = null;
                                            }
                                        }
                                    }
                                    if (i4 != 1) {
                                    }
                                }
                                cgeVarO = defpackage.cjv.o(bzcVar2);
                            }
                            break;
                        }
                        cgeVarO = cgeVarO.u;
                    }
                }
            }
        }
        return false;
    }

    public static final void w(defpackage.ciw ciwVar) {
        defpackage.cge cgeVarM = ciwVar.M();
        defpackage.bzc bzcVar = null;
        while (true) {
            int i = 0;
            if (cgeVarM == null) {
                if (!ciwVar.M().A) {
                    defpackage.csc.c("visitChildren called on an unattached node");
                }
                defpackage.bzc bzcVar2 = new defpackage.bzc(new defpackage.cge[16]);
                defpackage.cge cgeVar = ciwVar.M().u;
                if (cgeVar == null) {
                    defpackage.cjv.x(bzcVar2, ciwVar.M());
                } else {
                    bzcVar2.n(cgeVar);
                }
                while (true) {
                    int i2 = bzcVar2.b;
                    if (i2 == 0) {
                        return;
                    }
                    defpackage.cge cgeVarO = (defpackage.cge) bzcVar2.c(i2 - 1);
                    if ((cgeVarO.s & 1024) == 0) {
                        defpackage.cjv.x(bzcVar2, cgeVarO);
                    } else {
                        while (cgeVarO != null) {
                            if ((cgeVarO.r & 1024) != 0) {
                                defpackage.bzc bzcVar3 = null;
                                while (cgeVarO != null) {
                                    if (cgeVarO instanceof defpackage.cjc) {
                                        ((defpackage.cjc) cgeVarO).k(7);
                                        return;
                                    }
                                    if ((cgeVarO.r & 1024) != 0 && (cgeVarO instanceof defpackage.cwo)) {
                                        int i3 = 0;
                                        for (defpackage.cge cgeVar2 = ((defpackage.cwo) cgeVarO).C; cgeVar2 != null; cgeVar2 = cgeVar2.u) {
                                            if ((cgeVar2.r & 1024) != 0) {
                                                i3++;
                                                if (i3 == 1) {
                                                    cgeVarO = cgeVar2;
                                                } else {
                                                    if (bzcVar3 == null) {
                                                        bzcVar3 = new defpackage.bzc(new defpackage.cge[16]);
                                                    }
                                                    if (cgeVarO != null) {
                                                        bzcVar3.n(cgeVarO);
                                                    }
                                                    bzcVar3.n(cgeVar2);
                                                    cgeVarO = null;
                                                }
                                            }
                                        }
                                        if (i3 != 1) {
                                        }
                                    }
                                    cgeVarO = defpackage.cjv.o(bzcVar3);
                                }
                                break;
                            }
                            cgeVarO = cgeVarO.u;
                        }
                    }
                }
            } else {
                if (cgeVarM instanceof defpackage.cjc) {
                    ((defpackage.cjc) cgeVarM).k(7);
                    return;
                }
                if ((cgeVarM.r & 1024) != 0 && (cgeVarM instanceof defpackage.cwo)) {
                    for (defpackage.cge cgeVar3 = ((defpackage.cwo) cgeVarM).C; cgeVar3 != null; cgeVar3 = cgeVar3.u) {
                        if ((cgeVar3.r & 1024) != 0) {
                            i++;
                            if (i == 1) {
                                cgeVarM = cgeVar3;
                            } else {
                                if (bzcVar == null) {
                                    bzcVar = new defpackage.bzc(new defpackage.cge[16]);
                                }
                                if (cgeVarM != null) {
                                    bzcVar.n(cgeVarM);
                                }
                                bzcVar.n(cgeVar3);
                                cgeVarM = null;
                            }
                        }
                    }
                    if (i != 1) {
                    }
                }
                cgeVarM = defpackage.cjv.o(bzcVar);
            }
        }
    }

    private static final defpackage.cjc x(defpackage.cjc cjcVar) {
        defpackage.cjc cjcVarM = m(cjcVar);
        if (cjcVarM != null) {
            return cjcVarM;
        }
        throw new java.lang.IllegalArgumentException("ActiveParent with no focused child");
    }

    private static final int y(defpackage.cjc cjcVar, int i) {
        if (!cjcVar.c) {
            cjcVar.c = true;
            try {
                defpackage.cim cimVarB = cjcVar.b();
                defpackage.chw chwVar = new defpackage.chw(i);
                defpackage.cik cikVar = ((defpackage.czz) defpackage.cjv.t(cjcVar)).J;
                defpackage.cjc cjcVarB = cikVar.b();
                ((defpackage.cio) cimVarB).j.invoke(chwVar);
                defpackage.cjc cjcVarB2 = cikVar.b();
                boolean z = chwVar.b;
                int i2 = 2;
                if (!z) {
                    if (cjcVarB != cjcVarB2 && cjcVarB2 != null) {
                        if (defpackage.cit.c != defpackage.cit.b) {
                            i2 = 3;
                        }
                    }
                }
                return i2;
            } finally {
                cjcVar.c = false;
            }
        }
        return 1;
    }
}
