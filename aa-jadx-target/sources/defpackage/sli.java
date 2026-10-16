package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class sli {
    public static boolean a = false;
    public static boolean b = false;

    @java.lang.Deprecated
    static final java.util.concurrent.atomic.AtomicBoolean c = new java.util.concurrent.atomic.AtomicBoolean();
    private static final java.util.concurrent.atomic.AtomicBoolean d = new java.util.concurrent.atomic.AtomicBoolean();

    @java.lang.Deprecated
    public static int a(android.content.Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            android.util.Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.common.GooglePlayServicesMissingManifestValueException */
    /* JADX WARN: Code duplicated, block: B:63:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:70:0x011e  */
    /* JADX WARN: Code duplicated, block: B:73:0x0124  */
    /* JADX WARN: Code duplicated, block: B:74:0x014b  */
    /* JADX WARN: Code duplicated, block: B:82:0x016b A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x016d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:88:0x014f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:73:0x0124, please report this as an issue */
    @java.lang.Deprecated
    public static int b(android.content.Context context, int i) throws com.google.android.gms.common.GooglePlayServicesMissingManifestValueException, com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException {
        android.content.pm.PackageInfo packageInfo;
        int i2;
        android.content.pm.ApplicationInfo applicationInfo;
        try {
            context.getResources().getString(2132083582);
        } catch (java.lang.Throwable unused) {
            android.util.Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        if (!"com.google.android.gms".equals(context.getPackageName()) && !d.get()) {
            synchronized (defpackage.spj.a) {
                if (!defpackage.spj.b) {
                    defpackage.spj.b = true;
                    try {
                        android.os.Bundle bundle = defpackage.sqx.a.a(context).h(context.getPackageName(), 128).metaData;
                        if (bundle != null) {
                            bundle.getString("com.google.app.id");
                            defpackage.spj.c = bundle.getInt("com.google.android.gms.version");
                        }
                    } catch (android.content.pm.PackageManager.NameNotFoundException e) {
                        android.util.Log.wtf("MetadataValueReader", "This should never happen.", e);
                    }
                }
            }
            int i3 = defpackage.spj.c;
            if (i3 == 0) {
                throw new com.google.android.gms.common.GooglePlayServicesMissingManifestValueException();
            }
            if (i3 != 263410000) {
                throw new com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException(i3);
            }
        }
        boolean z = (defpackage.sqj.k(context) || defpackage.sqj.e(context)) ? false : true;
        java.lang.String packageName = context.getPackageName();
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        if (z) {
            try {
                packageInfo = packageManager.getPackageInfo("com.android.vending", 134225984);
            } catch (android.content.pm.PackageManager.NameNotFoundException unused2) {
                android.util.Log.w("GooglePlayServicesUtil", java.lang.String.valueOf(packageName).concat(" requires the Google Play Store, but it is missing."));
            }
        } else {
            packageInfo = null;
        }
        try {
            android.content.pm.PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 134217792);
            defpackage.slj.a(context);
            if (!defpackage.slj.d(packageInfo2, true)) {
                android.util.Log.w("GooglePlayServicesUtil", java.lang.String.valueOf(packageName).concat(" requires Google Play services, but their signature is invalid."));
            } else if (z) {
                if (packageInfo == null) {
                    throw new java.lang.NullPointerException("null reference");
                }
                if (defpackage.slj.d(packageInfo, true)) {
                    if (z) {
                    }
                    i2 = packageInfo2.versionCode;
                    int i4 = defpackage.sqn.a;
                    if ((i2 != -1 ? i2 / 1000 : -1) >= i / 1000) {
                        applicationInfo = packageInfo2.applicationInfo;
                        if (applicationInfo == null) {
                            applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                        }
                        if (applicationInfo.enabled) {
                            return 0;
                        }
                        return 3;
                    }
                    android.util.Log.w("GooglePlayServicesUtil", "Google Play services out of date for " + packageName + ".  Requires " + i + " but found " + packageInfo2.versionCode);
                    return 2;
                }
                android.util.Log.w("GooglePlayServicesUtil", java.lang.String.valueOf(packageName).concat(" requires Google Play Store, but its signature is invalid."));
            } else {
                if (z || packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                    i2 = packageInfo2.versionCode;
                    int i5 = defpackage.sqn.a;
                    if ((i2 != -1 ? i2 / 1000 : -1) >= i / 1000) {
                        android.util.Log.w("GooglePlayServicesUtil", "Google Play services out of date for " + packageName + ".  Requires " + i + " but found " + packageInfo2.versionCode);
                        return 2;
                    }
                    applicationInfo = packageInfo2.applicationInfo;
                    if (applicationInfo == null) {
                        try {
                            applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                        } catch (android.content.pm.PackageManager.NameNotFoundException e2) {
                            android.util.Log.wtf("GooglePlayServicesUtil", java.lang.String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info."), e2);
                            return 1;
                        }
                    }
                    if (applicationInfo.enabled) {
                        return 3;
                    }
                    return 0;
                }
                android.util.Log.w("GooglePlayServicesUtil", java.lang.String.valueOf(packageName).concat(" requires Google Play Store, but its signature doesn't match that of Google Play services."));
            }
            return 9;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused3) {
            android.util.Log.w("GooglePlayServicesUtil", java.lang.String.valueOf(packageName).concat(" requires Google Play services, but they are missing."));
            return 1;
        }
    }

    @java.lang.Deprecated
    public static void c(android.content.Context context, int i) throws defpackage.slh, defpackage.slg {
        defpackage.sks sksVar = defpackage.sks.d;
        int iL = sksVar.l(context, i);
        if (iL != 0) {
            android.content.Intent intentM = sksVar.m(context, iL, "e");
            android.util.Log.e("GooglePlayServicesUtil", defpackage.a.bo(iL, "GooglePlayServices not available due to error "));
            if (intentM != null) {
                throw new defpackage.slh(iL, "Google Play Services not available", intentM);
            }
            throw new defpackage.slg(iL);
        }
    }

    public static boolean d(android.content.Context context) {
        try {
            if (!b) {
                android.content.pm.PackageInfo packageInfoI = defpackage.sqx.a.a(context).i("com.google.android.gms", 134217792);
                defpackage.slj.a(context);
                if (packageInfoI == null || defpackage.slj.d(packageInfoI, false) || !defpackage.slj.d(packageInfoI, true)) {
                    a = false;
                } else {
                    a = true;
                }
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            android.util.Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e);
        } finally {
            b = true;
        }
        return a || !"user".equals(android.os.Build.TYPE);
    }

    public static boolean e(android.content.Context context) {
        try {
            java.util.Iterator<android.content.pm.PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
            while (it.hasNext()) {
                if ("com.google.android.gms".equals(it.next().getAppPackageName())) {
                    return true;
                }
            }
            return context.getPackageManager().getApplicationInfo("com.google.android.gms", 8192).enabled;
        } catch (android.content.pm.PackageManager.NameNotFoundException | java.lang.Exception unused) {
            return false;
        }
    }
}
