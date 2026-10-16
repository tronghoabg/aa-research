package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ag {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f4671a = false;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f4672b = false;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    static final AtomicBoolean f4673c = new AtomicBoolean();

    /* renamed from: d, reason: collision with root package name */
    private static final AtomicBoolean f4674d = new AtomicBoolean();

    /* JADX WARN: Removed duplicated region for block: B:45:0x00b9  */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int a(android.content.Context r10, int r11) throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.ag.a(android.content.Context, int):int");
    }

    @Deprecated
    public static String b(int i2) {
        return d.e(i2);
    }

    public static boolean c(Context context) {
        try {
            if (!f4672b) {
                PackageInfo packageInfoB = com.google.android.gms.common.d.c.b(context).b("com.google.android.gms", 134217792);
                ah.a(context);
                if (packageInfoB == null || ah.e(packageInfoB, false) || !ah.e(packageInfoB, true)) {
                    f4671a = false;
                } else {
                    f4671a = true;
                }
            }
        } catch (PackageManager.NameNotFoundException e2) {
            Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e2);
        } finally {
            f4672b = true;
        }
        return f4671a || !"user".equals(Build.TYPE);
    }

    static boolean d(Context context) {
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
