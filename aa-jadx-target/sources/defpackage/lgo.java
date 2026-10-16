package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class lgo {
    public static final /* synthetic */ int a = 0;
    private static final defpackage.yqm b = defpackage.yqm.c("GH.GhIconKt");

    public static final long a(android.graphics.drawable.Drawable drawable) {
        long jFloatToRawIntBits;
        int iFloatToRawIntBits;
        if (defpackage.acyc.aJ()) {
            float intrinsicWidth = drawable.getIntrinsicWidth();
            float intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth <= 0.0f || intrinsicHeight <= 0.0f) {
                return 9205357640488583168L;
            }
            jFloatToRawIntBits = java.lang.Float.floatToRawIntBits(intrinsicWidth);
            iFloatToRawIntBits = java.lang.Float.floatToRawIntBits(intrinsicHeight);
        } else {
            float intrinsicWidth2 = drawable.getIntrinsicWidth();
            float intrinsicHeight2 = drawable.getIntrinsicHeight();
            jFloatToRawIntBits = java.lang.Float.floatToRawIntBits(intrinsicWidth2);
            iFloatToRawIntBits = java.lang.Float.floatToRawIntBits(intrinsicHeight2);
        }
        return (4294967295L & ((long) iFloatToRawIntBits)) | (jFloatToRawIntBits << 32);
    }

    public static final android.content.res.Resources b(android.content.Context context, java.lang.String str) {
        if (afzh.v(str)) {
            return context.getResources();
        }
        if (defpackage.afga.f(str, context.getPackageName())) {
            return context.getResources();
        }
        if (defpackage.afga.f("android", str)) {
            return android.content.res.Resources.getSystem();
        }
        try {
            if (android.os.Build.VERSION.SDK_INT >= 31) {
                android.content.pm.ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
                applicationInfo.getClass();
                return a$.ExternalSyntheticApiModelOutline0.m(context.getPackageManager(), applicationInfo, context.getResources().getConfiguration());
            }
            android.content.res.Resources resourcesForApplication = context.getPackageManager().getResourcesForApplication(str);
            resourcesForApplication.updateConfiguration(context.getResources().getConfiguration(), context.getResources().getDisplayMetrics());
            return resourcesForApplication;
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            java.lang.String str2 = java.lang.String.format("Unable to find pkg=%s", java.util.Arrays.copyOf(new java.lang.Object[]{str}, 1));
            str2.getClass();
            android.util.Log.e("GH.GhIcon", str2, e);
            return null;
        }
    }

    public static final defpackage.cne c(com.google.android.apps.auto.components.graphics.icon.GhIcon ghIcon, boolean z, float f, defpackage.cne cneVar, defpackage.cne cneVar2, defpackage.bve bveVar, int i) {
        int i2 = i >> 3;
        int i3 = (i & 14) | (i2 & 112);
        boolean z2 = true;
        if (z) {
            bveVar.v(569878288);
            android.content.Context context = (android.content.Context) bveVar.f(defpackage.daj.b);
            int i4 = (i2 & 7168) | i3 | 512 | (i2 & 896) | 4096;
            boolean zE = ((((i4 & 112) ^ 48) > 32 && bveVar.z(f)) || (i4 & 48) == 32) | bveVar.E(context) | ((((i4 & 14) ^ 6) > 4 && bveVar.C(ghIcon)) || (i4 & 6) == 4);
            if (!bveVar.E(cneVar2) && (i4 & 3072) != 2048) {
                z2 = false;
            }
            boolean z3 = zE | z2;
            defpackage.bwc bwcVar = (defpackage.bwc) bveVar;
            java.lang.Object objS = bwcVar.S();
            if (z3 || objS == defpackage.bvd.a) {
                lgm lgmVar = new lgm(f, context, ghIcon, cneVar2, (defpackage.afdk) null);
                bwcVar.ad(lgmVar);
                objS = lgmVar;
            }
            defpackage.cne cneVar3 = (defpackage.cne) defpackage.dai.ax(cneVar, ghIcon, (defpackage.affg) objS, bveVar).a();
            bwcVar.Y(false);
            return cneVar3;
        }
        bveVar.v(569952037);
        android.content.Context context2 = (android.content.Context) bveVar.f(defpackage.daj.b);
        int i5 = i3 | 512 | ((i >> 6) & 896);
        boolean z4 = (((i5 & 14) ^ 6) > 4 && bveVar.C(ghIcon)) || (i5 & 6) == 4;
        if ((((i5 & 112) ^ 48) <= 32 || !bveVar.z(f)) && (i5 & 48) != 32) {
            z2 = false;
        }
        boolean z5 = z4 | z2;
        defpackage.bwc bwcVar2 = (defpackage.bwc) bveVar;
        java.lang.Object objS2 = bwcVar2.S();
        if (z5 || objS2 == defpackage.bvd.a) {
            android.graphics.drawable.Drawable drawableF = ghIcon.f(context2, java.lang.Float.isNaN(f) ? -1 : defpackage.afhi.k(defpackage.dln.t(context2).dI(f)));
            defpackage.cne lgkVar = drawableF == null ? cneVar2 : new lgk(drawableF);
            bwcVar2.ad(lgkVar);
            objS2 = lgkVar;
        }
        defpackage.cne cneVar4 = (defpackage.cne) objS2;
        bwcVar2.Y(false);
        return cneVar4;
    }

    public static final void d(android.widget.ImageView imageView, com.google.android.apps.auto.components.graphics.icon.GhIcon ghIcon, boolean z, boolean z2, boolean z3) {
        imageView.getClass();
        imageView.setTag(2131429709, ghIcon);
        if (ghIcon.b == 2 && defpackage.afga.f(ghIcon.s(), imageView.getContext().getPackageName()) && !z3) {
            imageView.setImageResource(ghIcon.a());
            if (z2 && ghIcon.t()) {
                imageView.setImageTintList(ghIcon.d(imageView.getContext()));
                imageView.setImageTintMode(ghIcon.e);
                return;
            }
            return;
        }
        if (imageView.isLaidOut()) {
            e(imageView, ghIcon, imageView.getWidth(), z3);
        } else if (!imageView.isLaidOut() || imageView.isLayoutRequested()) {
            imageView.addOnLayoutChangeListener(new lgn(imageView, z3));
        } else {
            java.lang.Object tag = imageView.getTag(2131429709);
            e(imageView, tag instanceof com.google.android.apps.auto.components.graphics.icon.GhIcon ? (com.google.android.apps.auto.components.graphics.icon.GhIcon) tag : null, imageView.getWidth(), z3);
        }
    }

    public static final void e(android.widget.ImageView imageView, com.google.android.apps.auto.components.graphics.icon.GhIcon ghIcon, int i, boolean z) {
        android.graphics.drawable.BitmapDrawable bitmapDrawable = null;
        android.graphics.drawable.Drawable drawableF = ghIcon != null ? ghIcon.f(imageView.getContext(), i) : null;
        if (drawableF == null) {
            imageView.setImageDrawable(null);
            return;
        }
        if (z && ghIcon.b == 1) {
            android.content.Context context = imageView.getContext();
            context.getClass();
            android.graphics.Bitmap bitmapE = i != -1 ? dtp.e(drawableF, i, i, 4) : dtp.e(drawableF, 0, 0, 7);
            android.graphics.Bitmap bitmapE2 = defpackage.kfn.e(bitmapE, defpackage.lfx.a.a().a(bitmapE.getWidth()), bitmapE.getWidth());
            if (bitmapE2 != null) {
                android.content.res.Resources resources = context.getResources();
                resources.getClass();
                bitmapDrawable = new android.graphics.drawable.BitmapDrawable(resources, bitmapE2);
            }
            drawableF = bitmapDrawable;
        }
        imageView.setImageDrawable(drawableF);
    }

    public static final defpackage.cne f(com.google.android.apps.auto.components.graphics.icon.GhIcon ghIcon, float f, defpackage.bve bveVar, int i) {
        ghIcon.getClass();
        defpackage.cne cneVarG = null;
        defpackage.cnd cndVar = (i & 1) != 0 ? new defpackage.cnd(0L) : null;
        if ((i & 2) != 0) {
            f = Float.NaN;
        }
        android.content.Context context = (android.content.Context) bveVar.f(defpackage.daj.b);
        int i2 = ghIcon.b;
        if (i2 == 1) {
            bveVar.v(1332709630);
            bveVar.o();
            android.graphics.Bitmap bitmapE = ghIcon.e();
            bitmapE.getClass();
            return new defpackage.cnc(new defpackage.cjr(bitmapE));
        }
        if (i2 != 2) {
            if (i2 == 8) {
                bveVar.v(1332707864);
                bveVar.o();
                return new defpackage.cnd(0L);
            }
            bveVar.v(1332716105);
            defpackage.cne cneVarH = h(ghIcon, f, context, cndVar, bveVar);
            bveVar.o();
            return cneVarH;
        }
        bveVar.v(-1635603376);
        android.content.res.Resources resourcesB = b(context, ghIcon.s());
        if (resourcesB == null) {
            bveVar.v(-1635561961);
        } else {
            bveVar.v(-1635561960);
            android.content.res.Resources.Theme theme = context.getTheme();
            theme.getClass();
            cneVarG = g(theme, resourcesB, ghIcon.a(), bveVar);
        }
        bveVar.o();
        if (cneVarG == null) {
            bveVar.v(1332715177);
            cneVarG = h(ghIcon, f, context, cndVar, bveVar);
        } else {
            bveVar.v(1332711922);
        }
        bveVar.o();
        bveVar.o();
        return cneVarG;
    }

    public static final defpackage.cne g(android.content.res.Resources.Theme theme, android.content.res.Resources resources, int i, defpackage.bve bveVar) throws java.lang.Exception {
        java.lang.Object objH;
        defpackage.cne cneVarP;
        bveVar.v(1894731347);
        java.lang.Object objG = bveVar.g();
        if (objG == defpackage.bvd.a) {
            objG = new android.util.TypedValue();
            bveVar.x(objG);
        }
        android.util.TypedValue typedValue = (android.util.TypedValue) objG;
        try {
            resources.getValue(i, typedValue, true);
            boolean zC = bveVar.C(resources) | bveVar.A(i);
            java.lang.Object objG2 = bveVar.g();
            if (zC || objG2 == defpackage.bvd.a) {
                android.graphics.drawable.Drawable drawable = resources.getDrawable(i, null);
                android.graphics.drawable.ColorDrawable colorDrawable = drawable instanceof android.graphics.drawable.ColorDrawable ? (android.graphics.drawable.ColorDrawable) drawable : null;
                objG2 = colorDrawable != null ? new defpackage.cnd(defpackage.cjv.j(colorDrawable.getColor())) : null;
                bveVar.x(objG2);
            }
            defpackage.cnd cndVar = (defpackage.cnd) objG2;
            if (cndVar != null) {
                bveVar.o();
                return cndVar;
            }
            java.lang.CharSequence charSequence = typedValue.string;
            if (charSequence == null || !afzh.C(charSequence, ".xml")) {
                bveVar.v(1482630345);
                boolean zC2 = bveVar.C(theme) | bveVar.C(charSequence) | bveVar.A(i);
                java.lang.Object objG3 = bveVar.g();
                if (zC2 || objG3 == defpackage.bvd.a) {
                    if (defpackage.acyc.an()) {
                        try {
                            objH = defpackage.vm.h(resources, i);
                        } catch (java.lang.ClassCastException e) {
                            ((defpackage.yqj) b.h()).y("Exception while loading bitmap resource %s", e.toString());
                            objG3 = null;
                        }
                    } else {
                        objH = defpackage.vm.h(resources, i);
                    }
                    objG3 = objH;
                    bveVar.x(objG3);
                }
                defpackage.cjr cjrVar = (defpackage.cjr) objG3;
                defpackage.cnc cncVar = cjrVar != null ? new defpackage.cnc(cjrVar) : null;
                bveVar.o();
                cneVarP = cncVar;
            } else {
                bveVar.v(1481993295);
                try {
                    cneVarP = defpackage.dai.P(defpackage.day.g(theme, resources, i), bveVar);
                    bveVar.o();
                } catch (java.lang.Exception e2) {
                    if (!(e2 instanceof java.lang.IllegalArgumentException) && !(e2 instanceof java.lang.UnsupportedOperationException) && !(e2 instanceof org.xmlpull.v1.XmlPullParserException)) {
                        throw e2;
                    }
                    ((defpackage.yqj) ((defpackage.yqj) b.g()).l(1, java.util.concurrent.TimeUnit.MINUTES)).y("Exception while loading vector resource %s", e2.toString());
                    bveVar.o();
                    bveVar.o();
                    return null;
                }
            }
            bveVar.o();
            return cneVarP;
        } catch (android.content.res.Resources.NotFoundException e3) {
            java.lang.String str = java.lang.String.format("Unable to load resource 0x%08x", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i)}, 1));
            str.getClass();
            android.util.Log.e("GH.GhIcon", str, e3);
        }
    }

    private static final defpackage.cne h(com.google.android.apps.auto.components.graphics.icon.GhIcon ghIcon, float f, android.content.Context context, defpackage.cne cneVar, defpackage.bve bveVar) {
        boolean zC = bveVar.C(ghIcon) | bveVar.z(f);
        java.lang.Object objG = bveVar.g();
        if (zC || objG == defpackage.bvd.a) {
            android.graphics.drawable.Drawable drawableF = ghIcon.f(context, java.lang.Float.isNaN(f) ? -1 : defpackage.afhi.k(defpackage.dln.t(context).dI(f)));
            if (drawableF != null) {
                cneVar = new defpackage.lgj(drawableF);
            }
            bveVar.x(cneVar);
            objG = cneVar;
        }
        return (defpackage.cne) objG;
    }
}
