package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;
import j$.util.Objects;

/* loaded from: classes.dex */
public final class spl {
    public static Boolean a;
    public static Boolean b;
    public static Boolean c;
    public static Boolean d;
    public static Boolean e;
    public static Boolean f;
    public static Boolean g;
    public static Boolean h;
    private static Boolean i;
    private static Boolean j;
    private static Boolean k;
    private static Boolean l;
    private static Boolean m;
    private static Boolean n;
    private static Boolean o;
    private static Boolean p;
    private static Boolean q;

    public static boolean a(PackageManager packageManager) {
        Boolean boolValueOf = o;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(packageManager.hasSystemFeature("com.google.android.feature.AMATI_EXPERIENCE"));
            o = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    public static boolean b(Context context) {
        return c(context.getPackageManager());
    }

    public static boolean c(PackageManager packageManager) {
        Boolean boolValueOf = m;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.automotive"));
            m = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    public static boolean d(Context context) {
        Boolean boolValueOf = p;
        if (boolValueOf == null) {
            boolean z = false;
            if (a.O() && context.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")) {
                z = true;
            }
            boolValueOf = Boolean.valueOf(z);
            p = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    public static boolean e(Context context) {
        Boolean boolValueOf = l;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.embedded"));
            l = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    public static boolean f(Context context) {
        ActivityManager activityManager;
        if (k == null && (activityManager = (ActivityManager) context.getSystemService("activity")) != null) {
            k = Boolean.valueOf(activityManager.isLowRamDevice());
        }
        return Objects.equals(k, true);
    }

    public static boolean g(Context context) {
        return h(context.getPackageManager());
    }

    public static boolean h(PackageManager packageManager) {
        Boolean boolValueOf = n;
        if (boolValueOf == null) {
            boolean z = true;
            if (!packageManager.hasSystemFeature("com.google.android.tv") && !packageManager.hasSystemFeature("android.hardware.type.television") && !packageManager.hasSystemFeature("android.software.leanback") && !a(packageManager)) {
                z = false;
            }
            boolValueOf = Boolean.valueOf(z);
            n = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    public static boolean i(Context context) {
        return j(context.getPackageManager());
    }

    public static boolean j(PackageManager packageManager) {
        Boolean boolValueOf = i;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
            i = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    public static boolean k(Context context) {
        Boolean boolValueOf = j;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
            j = boolValueOf;
        }
        return boolValueOf.booleanValue() && a.O();
    }

    public static boolean l(Context context) {
        return m(context.getPackageManager());
    }

    public static boolean m(PackageManager packageManager) {
        Boolean boolValueOf = q;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(packageManager.hasSystemFeature("android.software.xr.api.spatial"));
            q = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }
}
