package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class tis {
    private static android.content.Context a;
    private static java.lang.Boolean b;

    public tis() {
    }

    public static androidx.car.app.model.CarIcon c(int i, defpackage.bve bveVar) {
        qs qsVar = (qs) bveVar.f(tjg.c);
        bveVar.f(tjg.a);
        boolean zC = bveVar.C(qsVar.getResources()) | bveVar.A(i);
        java.lang.Object objG = bveVar.g();
        if (zC || objG == defpackage.bvd.a) {
            objG = new androidx.car.app.model.CarIcon(new defpackage.to(androidx.core.graphics.drawable.IconCompat.m(qsVar, i)));
            bveVar.x(objG);
        }
        objG.getClass();
        return (androidx.car.app.model.CarIcon) objG;
    }

    public static tjj d(androidx.car.app.model.CarIcon carIcon, defpackage.afer aferVar, java.lang.Boolean bool, defpackage.bve bveVar) {
        int i = 17;
        met metVar = aferVar != null ? new met(aferVar, 17) : null;
        boolean zE = bveVar.E(null) | bveVar.E(carIcon) | bveVar.E(metVar) | bveVar.C(bool) | bveVar.E(null) | bveVar.E(null);
        java.lang.Object objG = bveVar.g();
        if (zE || objG == defpackage.bvd.a) {
            objG = new defpackage.lyb(carIcon, (ux) metVar, bool, i);
            bveVar.x(objG);
        }
        defpackage.afer aferVar2 = (defpackage.afer) objG;
        bveVar.M();
        bveVar.u();
        if (bveVar.G()) {
            bveVar.j(aferVar2);
        } else {
            bveVar.y();
        }
        defpackage.byw.d(bveVar, null, new gcr(3));
        defpackage.byw.d(bveVar, carIcon, new gcr(4));
        defpackage.byw.d(bveVar, metVar, new gcr(5));
        defpackage.byw.d(bveVar, bool, new gcr(6));
        defpackage.byw.d(bveVar, null, new gcr(7));
        defpackage.byw.d(bveVar, null, new gcr(8));
        bveVar.n();
        return tjj.a;
    }

    public static int e(int i, android.content.Context context) {
        return defpackage.afhi.k(i * context.getResources().getDisplayMetrics().density);
    }

    public static boolean f(float f, float f2, float f3) {
        if (java.lang.Math.copySign(f - f2, 1.0f) <= f3 || f == f2) {
            return true;
        }
        return java.lang.Float.isNaN(f) && java.lang.Float.isNaN(f2);
    }

    public static boolean g(float f, float f2) {
        return f >= f2 || f(f, f2, 0.5f);
    }

    public static boolean h(float f, float f2) {
        return f <= f2 || f(f, f2, 0.5f);
    }

    public static java.lang.Object i(android.view.View view, defpackage.afdk afdkVar) {
        aiug aiugVar = new aiug(defpackage.afga.s(afdkVar), 1);
        aiugVar.z();
        defpackage.nxz nxzVar = new defpackage.nxz(aiugVar, 7);
        if (view.isAttachedToWindow()) {
            nxzVar.invoke(view);
        } else {
            view.addOnAttachStateChangeListener(new eei(view, nxzVar, 2));
        }
        java.lang.Object objK = aiugVar.k();
        return objK == defpackage.afdr.a ? objK : defpackage.afbk.a;
    }

    public static android.content.res.ColorStateList j(int i) {
        android.content.res.ColorStateList colorStateListValueOf = android.content.res.ColorStateList.valueOf(i);
        colorStateListValueOf.getClass();
        return colorStateListValueOf;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Iterable, java.lang.Object] */
    public static android.content.res.ColorStateList k(defpackage.affc affcVar) {
        defpackage.gkc gkcVar = new defpackage.gkc((short[]) null);
        affcVar.invoke(gkcVar);
        ?? r4 = gkcVar.a;
        java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.afga.aj(r4, 10));
        java.util.Iterator it = r4.iterator();
        while (it.hasNext()) {
            arrayList.add((int[]) ((defpackage.afau) it.next()).b);
        }
        int[][] iArr = (int[][]) arrayList.toArray(new int[0][]);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(defpackage.afga.aj(r4, 10));
        java.util.Iterator it2 = r4.iterator();
        while (it2.hasNext()) {
            arrayList2.add(java.lang.Integer.valueOf(((java.lang.Number) ((defpackage.afau) it2.next()).a).intValue()));
        }
        return new android.content.res.ColorStateList(iArr, defpackage.afga.bj(arrayList2));
    }

    public static java.lang.Object l(emv emvVar, defpackage.afdk afdkVar) {
        aiug aiugVar = new aiug(defpackage.afga.s(afdkVar), 1);
        aiugVar.z();
        emvVar.g(new tfi(aiugVar, 0));
        aiugVar.d(new defpackage.nxz(emvVar, 6));
        java.lang.Object objK = aiugVar.k();
        return objK == defpackage.afdr.a ? objK : defpackage.afbk.a;
    }

    public static void m(java.lang.Runnable runnable) {
        java.lang.Thread thread = new java.lang.Thread(runnable, "PsdCollector");
        thread.setPriority(4);
        thread.start();
    }

    public static android.os.Bundle n(java.util.List list) {
        if (list == null) {
            return null;
        }
        int size = list.size();
        android.os.Bundle bundle = new android.os.Bundle(size);
        for (int i = 0; i < size; i++) {
            android.util.Pair pair = (android.util.Pair) list.get(i);
            bundle.putString((java.lang.String) pair.first, (java.lang.String) pair.second);
        }
        return bundle;
    }

    @java.lang.Deprecated
    public static java.lang.String o() {
        return defpackage.a.ce("-");
    }

    public static void p(android.os.Bundle bundle) {
        if (!((java.lang.Boolean) ssi.c.a()).booleanValue() || bundle == null) {
            return;
        }
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        int iDataSize = parcelObtain.dataSize();
        parcelObtain.recycle();
        defpackage.sym symVar = ssi.b;
        if (iDataSize <= ((java.lang.Integer) symVar.a()).intValue()) {
            return;
        }
        throw new java.lang.IllegalStateException("Max allowed bundle size of " + symVar.a().toString() + " exceeded, you are passing in a bundle of " + iDataSize + " size.");
    }

    public static void q(com.google.android.gms.feedback.FeedbackOptions feedbackOptions) {
        if (((java.lang.Boolean) ssi.c.a()).booleanValue()) {
            android.os.Parcel parcelObtain = android.os.Parcel.obtain();
            ssc.a(feedbackOptions, parcelObtain, 0);
            int iDataSize = parcelObtain.dataSize();
            parcelObtain.recycle();
            defpackage.sym symVar = ssi.b;
            if (iDataSize <= ((java.lang.Integer) symVar.a()).intValue()) {
                return;
            }
            throw new java.lang.IllegalStateException("Max allowed feedback options size of " + symVar.a().toString() + " exceeded, you are passing in feedback options of " + iDataSize + " size.");
        }
    }

    public static void r(java.lang.Runnable runnable) {
        java.lang.Thread thread = new java.lang.Thread(runnable, "Feedback");
        thread.setPriority(4);
        thread.start();
    }

    public static void s(android.os.Bundle bundle, java.util.List list) {
        if (bundle.isEmpty()) {
            list.isEmpty();
        }
    }

    public static synchronized boolean t(android.content.Context context) {
        java.lang.Boolean bool;
        android.content.Context applicationContext = context.getApplicationContext();
        android.content.Context context2 = a;
        if (context2 != null && (bool = b) != null && context2 == applicationContext) {
            return bool.booleanValue();
        }
        b = null;
        java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(xi$.ExternalSyntheticApiModelOutline0.m(applicationContext.getPackageManager()));
        b = boolValueOf;
        a = applicationContext;
        return boolValueOf.booleanValue();
    }

    public static boolean u() {
        return android.os.Looper.getMainLooper() == android.os.Looper.myLooper();
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public static void v(android.content.Context context) {
        try {
            defpackage.sqs.aA(context);
        } catch (java.lang.Exception e) {
            android.util.Log.e("CrashUtils", "Error adding exception to DropBox!", e);
        }
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public static com.google.android.gms.feedback.FeedbackOptions w(android.graphics.Bitmap bitmap, android.os.Bundle bundle, java.lang.String str, java.lang.String str2, java.util.List list, com.google.android.gms.feedback.LogOptions logOptions, defpackage.tis tisVar, java.lang.String str3) {
        com.google.android.gms.feedback.FeedbackOptions feedbackOptions = new com.google.android.gms.feedback.FeedbackOptions((java.lang.String) null, (android.os.Bundle) null, (java.lang.String) null, new android.app.ApplicationErrorReport(), (java.lang.String) null, (com.google.android.gms.common.data.BitmapTeleporter) null, (java.lang.String) null, (java.util.List) null, true, (com.google.android.gms.feedback.ThemeSettings) null, (com.google.android.gms.feedback.LogOptions) null, false, (android.graphics.Bitmap) null, (java.lang.String) null, false, 0L, false, (java.lang.String) null, (com.google.android.gms.feedback.AdditionalConsentConfig) null, (java.lang.String) null);
        feedbackOptions.m = bitmap;
        feedbackOptions.f = null;
        feedbackOptions.a = null;
        feedbackOptions.c = str;
        feedbackOptions.b = bundle;
        feedbackOptions.e = str2;
        feedbackOptions.h = list;
        feedbackOptions.i = false;
        feedbackOptions.j = null;
        feedbackOptions.k = logOptions;
        feedbackOptions.l = false;
        feedbackOptions.u = tisVar;
        feedbackOptions.n = str3;
        feedbackOptions.o = false;
        feedbackOptions.p = 0L;
        feedbackOptions.q = false;
        feedbackOptions.r = null;
        feedbackOptions.s = null;
        feedbackOptions.t = null;
        return feedbackOptions;
    }

    public java.util.List a() {
        throw null;
    }

    public java.util.List b() {
        throw null;
    }

    public tis(byte[] bArr) {
    }
}
