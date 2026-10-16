package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class sqj {
    public static java.lang.Boolean a;
    public static java.lang.Boolean b;
    public static java.lang.Boolean c;
    public static java.lang.Boolean d;
    public static java.lang.Boolean e;
    public static java.lang.Boolean f;
    public static java.lang.Boolean g;
    public static java.lang.Boolean h;
    private static java.lang.Boolean i;
    private static java.lang.Boolean j;
    private static java.lang.Boolean k;
    private static java.lang.Boolean l;
    private static java.lang.Boolean m;
    private static java.lang.Boolean n;
    private static java.lang.Boolean o;
    private static java.lang.Boolean p;
    private static java.lang.Boolean q;

    public static boolean a(android.content.pm.PackageManager packageManager) {
        java.lang.Boolean boolValueOf = o;
        if (boolValueOf == null) {
            boolValueOf = java.lang.Boolean.valueOf(packageManager.hasSystemFeature("com.google.android.feature.AMATI_EXPERIENCE"));
            o = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    public static boolean b(android.content.Context context) {
        return c(context.getPackageManager());
    }

    public static boolean c(android.content.pm.PackageManager packageManager) {
        java.lang.Boolean boolValueOf = m;
        if (boolValueOf == null) {
            boolValueOf = java.lang.Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.automotive"));
            m = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    public static boolean d(android.content.Context context) {
        java.lang.Boolean boolValueOf = p;
        if (boolValueOf == null) {
            boolean z = false;
            if (defpackage.a.N() && context.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")) {
                z = true;
            }
            boolValueOf = java.lang.Boolean.valueOf(z);
            p = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    public static boolean e(android.content.Context context) {
        java.lang.Boolean boolValueOf = l;
        if (boolValueOf == null) {
            boolValueOf = java.lang.Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.embedded"));
            l = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    public static boolean f(android.content.Context context) {
        android.app.ActivityManager activityManager;
        if (k == null && (activityManager = (android.app.ActivityManager) context.getSystemService("activity")) != null) {
            k = java.lang.Boolean.valueOf(activityManager.isLowRamDevice());
        }
        return j$.util.Objects.equals(k, java.lang.Boolean.TRUE);
    }

    public static boolean g(android.content.Context context) {
        return h(context.getPackageManager());
    }

    public static boolean h(android.content.pm.PackageManager packageManager) {
        java.lang.Boolean boolValueOf = n;
        if (boolValueOf == null) {
            boolean z = true;
            if (!packageManager.hasSystemFeature("com.google.android.tv") && !packageManager.hasSystemFeature("android.hardware.type.television") && !packageManager.hasSystemFeature("android.software.leanback") && !a(packageManager)) {
                z = false;
            }
            boolValueOf = java.lang.Boolean.valueOf(z);
            n = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    public static boolean i(android.content.Context context) {
        return j(context.getPackageManager());
    }

    public static boolean j(android.content.pm.PackageManager packageManager) {
        java.lang.Boolean boolValueOf = i;
        if (boolValueOf == null) {
            boolValueOf = java.lang.Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
            i = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    public static boolean k(android.content.Context context) {
        java.lang.Boolean boolValueOf = j;
        if (boolValueOf == null) {
            boolValueOf = java.lang.Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
            j = boolValueOf;
        }
        return boolValueOf.booleanValue() && defpackage.a.N();
    }

    public static boolean l(android.content.Context context) {
        return m(context.getPackageManager());
    }

    public static boolean m(android.content.pm.PackageManager packageManager) {
        java.lang.Boolean boolValueOf = q;
        if (boolValueOf == null) {
            boolValueOf = java.lang.Boolean.valueOf(packageManager.hasSystemFeature("android.software.xr.api.spatial"));
            q = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }
}
