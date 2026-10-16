package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class vm {
    public static defpackage.cno a;

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public static final void a(java.lang.Throwable th, defpackage.afer aferVar) {
        java.util.List listBx;
        java.lang.Object objInvoke;
        th.getClass();
        defpackage.cfo cfoVar = null;
        if (defpackage.afek.a()) {
            java.lang.Throwable[] suppressed = th.getSuppressed();
            suppressed.getClass();
            listBx = defpackage.afga.bx(suppressed);
        } else {
            java.lang.reflect.Method method = afei.b;
            listBx = (method == null || (objInvoke = method.invoke(th, null)) == null) ? defpackage.afce.a : defpackage.afga.bx((java.lang.Throwable[]) objInvoke);
        }
        int size = listBx.size();
        for (int i = 0; i < size; i++) {
            if (((java.lang.Throwable) listBx.get(i)) instanceof defpackage.cfo) {
                return;
            }
        }
        try {
            defpackage.adnr adnrVar = (defpackage.adnr) aferVar.invoke();
            if (adnrVar != null) {
                if (adnrVar.a) {
                    ?? r7 = adnrVar.b;
                    int size2 = r7.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        defpackage.vx vxVar = ((defpackage.cfj) r7.get(i2)).c;
                    }
                } else if (!adnrVar.b.isEmpty()) {
                    adnrVar.getClass();
                    cfoVar = new defpackage.cfo(adnrVar);
                }
            }
        } catch (java.lang.Throwable th2) {
            cfoVar = th2;
        }
        if (cfoVar != null) {
            defpackage.adrs.E(th, cfoVar);
        }
    }

    public static final java.lang.Integer b(defpackage.bzl bzlVar, defpackage.bvi bviVar, int i, int i2) {
        java.lang.Integer numB;
        while (true) {
            if (i >= i2) {
                return null;
            }
            int iC = bzlVar.c(i) + i;
            if (bzlVar.y(i) && bzlVar.b(i) == 206 && defpackage.afga.f(bzlVar.m(i), defpackage.bvg.f)) {
                java.lang.Object objL = bzlVar.l(i, 0);
                defpackage.bxx bxxVar = objL instanceof defpackage.bxx ? (defpackage.bxx) objL : null;
                defpackage.bxw bxwVarA = bxxVar != null ? bxxVar.a() : null;
                defpackage.bwa bwaVar = bxwVarA instanceof defpackage.bwa ? (defpackage.bwa) bxwVarA : null;
                if (bwaVar != null && defpackage.afga.f(bwaVar.a, bviVar)) {
                    return java.lang.Integer.valueOf(i);
                }
            }
            if (bzlVar.w(i) && (numB = b(bzlVar, bviVar, i + 1, iC)) != null) {
                return java.lang.Integer.valueOf(numB.intValue());
            }
            i = iC;
        }
    }

    public static final java.util.List c(defpackage.bzl bzlVar, int i, java.lang.Object obj) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        i = bzlVar.e(i);
        defpackage.bzh bzhVarG = bzlVar.g(i);
        while (i >= 0) {
            defpackage.cdp.d(bzlVar.b(i), bzlVar.z(i) ? bzlVar.m(i) : defpackage.bvd.a, bzlVar.a.j(i), obj, arrayList);
            if (i >= 0) {
                defpackage.bzh bzhVar = bzhVarG;
                bzhVarG = bzlVar.g(i);
                i = bzlVar.e(i);
                obj = bzhVar;
            } else {
                obj = bzhVarG;
            }
        }
        return arrayList;
    }

    public static final java.util.List d(defpackage.bzp bzpVar, int i, java.lang.Integer num) {
        int iK;
        int iH;
        defpackage.aan aanVar;
        if (bzpVar.r || bzpVar.f() == 0) {
            return defpackage.afce.a;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (num != null) {
            iK = num.intValue();
        } else {
            iK = bzpVar.q;
            if (iK < 0) {
                iK = bzpVar.k(i);
            }
        }
        int iN = bzpVar.h - bzpVar.n(i);
        defpackage.zo zoVar = bzpVar.t;
        int i2 = 0;
        if (zoVar != null && (aanVar = (defpackage.aan) zoVar.a(i)) != null) {
            i2 = aanVar.b;
        }
        java.lang.Object objValueOf = java.lang.Integer.valueOf(iN + i2);
        if (bzpVar.g(i) * 5 < bzpVar.b.length) {
            iH = bzpVar.h(i);
        } else {
            int iK2 = iK >= 0 ? bzpVar.k(iK) : iK;
            iH = bzpVar.h(iK);
            int i3 = iK;
            iK = iK2;
            i = i3;
        }
        while (i >= 0) {
            defpackage.cdp.d(iH, (bzpVar.b[(bzpVar.g(i) * 5) + 1] & 536870912) != 0 ? bzpVar.r(i) : defpackage.bvd.a, bzpVar.Y(i), objValueOf, arrayList);
            objValueOf = bzpVar.o(i);
            if (iK >= 0) {
                int iK3 = bzpVar.k(iK);
                iH = bzpVar.h(iK);
                int i4 = iK;
                iK = iK3;
                i = i4;
            } else {
                i = iK;
            }
        }
        return arrayList;
    }

    public static final java.lang.String e(int i, defpackage.bve bveVar) {
        return ((android.content.res.Resources) bveVar.f(defpackage.daj.c)).getString(i);
    }

    public static final java.lang.String f(int i, java.lang.Object[] objArr, defpackage.bve bveVar) {
        return ((android.content.res.Resources) bveVar.f(defpackage.daj.c)).getString(i, java.util.Arrays.copyOf(objArr, 1));
    }

    public static final float g(defpackage.bve bveVar) {
        return ((android.content.res.Resources) bveVar.f(defpackage.daj.c)).getDimension(2131166109) / ((defpackage.dlo) bveVar.f(defpackage.dbl.d)).a();
    }

    public static final defpackage.cjr h(android.content.res.Resources resources, int i) {
        android.graphics.drawable.Drawable drawable = resources.getDrawable(i, null);
        drawable.getClass();
        return new defpackage.cjr(((android.graphics.drawable.BitmapDrawable) drawable).getBitmap());
    }

    public static final java.lang.Object i(defpackage.cwn cwnVar, defpackage.afer aferVar, defpackage.afdk afdkVar) {
        java.lang.Object obj;
        defpackage.ctc ctcVarP;
        java.lang.Object objD;
        defpackage.cyg cygVar;
        if (cwnVar.M().A) {
            if (!cwnVar.M().A) {
                defpackage.csc.c("visitAncestors called on an unattached node");
            }
            defpackage.cge cgeVar = cwnVar.M().t;
            defpackage.cxl cxlVarR = defpackage.cjv.r(cwnVar);
            loop0: while (true) {
                obj = null;
                if (cxlVarR == null) {
                    break;
                }
                if ((cxlVarR.v.f.s & 524288) != 0) {
                    while (cgeVar != null) {
                        if ((cgeVar.r & 524288) != 0) {
                            defpackage.cge cgeVarO = cgeVar;
                            defpackage.bzc bzcVar = null;
                            while (cgeVarO != null) {
                                if (cgeVarO instanceof defpackage.dda) {
                                    obj = cgeVarO;
                                    break loop0;
                                }
                                if ((cgeVarO.r & 524288) != 0 && (cgeVarO instanceof defpackage.cwo)) {
                                    int i = 0;
                                    for (defpackage.cge cgeVar2 = ((defpackage.cwo) cgeVarO).C; cgeVar2 != null; cgeVar2 = cgeVar2.u) {
                                        if ((cgeVar2.r & 524288) != 0) {
                                            i++;
                                            if (i == 1) {
                                                cgeVarO = cgeVar2;
                                            } else {
                                                if (bzcVar == null) {
                                                    bzcVar = new defpackage.bzc(new defpackage.cge[16]);
                                                }
                                                if (cgeVarO != null) {
                                                    bzcVar.n(cgeVarO);
                                                }
                                                bzcVar.n(cgeVar2);
                                                cgeVarO = null;
                                            }
                                        }
                                    }
                                    if (i != 1) {
                                    }
                                }
                                cgeVarO = defpackage.cjv.o(bzcVar);
                            }
                        }
                        cgeVar = cgeVar.t;
                    }
                }
                cxlVarR = cxlVarR.l();
                cgeVar = (cxlVarR == null || (cygVar = cxlVarR.v) == null) ? null : cygVar.e;
            }
            defpackage.dda ddaVar = (defpackage.dda) obj;
            if (ddaVar != null && (objD = ddaVar.d((ctcVarP = defpackage.cjv.p(cwnVar)), new defpackage.bso(aferVar, ctcVarP, 9), afdkVar)) == defpackage.afdr.a) {
                return objD;
            }
        }
        return defpackage.afbk.a;
    }
}
