package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class skm {
    public static boolean a = false;
    public static boolean b = false;

    @Deprecated
    static final AtomicBoolean c = new AtomicBoolean();
    private static final AtomicBoolean d = new AtomicBoolean();

    @Deprecated
    public static int a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00f6  */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int b(android.content.Context r9, int r10) throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.skm.b(android.content.Context, int):int");
    }

    @Deprecated
    public static void c(Context context, int i) throws skk, skl {
        sjw sjwVar = sjw.d;
        int iL = sjwVar.l(context, i);
        if (iL != 0) {
            Intent intentM = sjwVar.m(context, iL, "e");
            Log.e("GooglePlayServicesUtil", a.bp(iL, "GooglePlayServices not available due to error "));
            if (intentM != null) {
                throw new skl(iL, "Google Play Services not available", intentM);
            }
            throw new skk(iL);
        }
    }

    public static boolean d(Context context) {
        try {
            if (!b) {
                PackageInfo packageInfoD = spz.a.a(context).d("com.google.android.gms", 134217792);
                skn.a(context);
                if (packageInfoD == null || skn.d(packageInfoD, false) || !skn.d(packageInfoD, true)) {
                    a = false;
                } else {
                    a = true;
                }
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e);
        } finally {
            b = true;
        }
        return a || !"user".equals(Build.TYPE);
    }

    public static boolean e(Context context) {
        try {
            Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
            while (it.hasNext()) {
                if ("com.google.android.gms".equals(it.next().getAppPackageName())) {
                    return true;
                }
            }
            return context.getPackageManager().getApplicationInfo("com.google.android.gms", 8192).enabled;
        } catch (PackageManager.NameNotFoundException | Exception unused) {
            return false;
        }
    }
}
