package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zsw {
    public static final defpackage.zsw a = new defpackage.zsw();
    private static final java.lang.String b = "zsw";

    private zsw() {
    }

    public static boolean b() {
        try {
            return defpackage.zlv.p();
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    public static boolean c(android.content.Context context) {
        android.content.pm.FeatureInfo[] systemAvailableFeatures = context.getPackageManager().getSystemAvailableFeatures();
        if (systemAvailableFeatures != null && (systemAvailableFeatures.length) > 0) {
            for (android.content.pm.FeatureInfo featureInfo : systemAvailableFeatures) {
                if (featureInfo.name == null && featureInfo.reqGlEsVersion >= 131072) {
                    return true;
                }
            }
        }
        return false;
    }

    static final java.lang.Process d(java.lang.String str) {
        try {
            java.lang.Process processExec = java.lang.Runtime.getRuntime().exec(new java.lang.String[]{"/system/bin/getprop", str});
            int i = 0;
            do {
                try {
                    try {
                        if (processExec.exitValue() != 0) {
                            break;
                        }
                        return processExec;
                    } catch (java.lang.IllegalThreadStateException unused) {
                        java.lang.Thread.sleep(5L);
                        i += 5;
                    }
                } catch (java.lang.InterruptedException unused2) {
                    java.lang.String str2 = b;
                    if (defpackage.zsr.e(str2, 5)) {
                        android.util.Log.w(str2, "Unable to retrieve system property. Interrupted while waiting for process.");
                    }
                    return null;
                }
            } while (i < 1000);
            java.lang.String str3 = b;
            if (defpackage.zsr.e(str3, 5)) {
                android.util.Log.w(str3, "Unable to retrieve system property. Process timed out or exited unsuccessfully.");
            }
            return null;
        } catch (java.io.IOException unused3) {
            java.lang.String str4 = b;
            if (defpackage.zsr.e(str4, 5)) {
                android.util.Log.w(str4, "Unable to retrieve system property.");
            }
            return null;
        }
    }

    public final java.lang.String a(java.lang.String str, java.lang.String str2) {
        java.lang.String property = java.lang.System.getProperty(str);
        if (property == null) {
            java.lang.Process processD = d(str);
            java.lang.String next = null;
            if (processD != null) {
                android.os.StrictMode.ThreadPolicy threadPolicyA = defpackage.zsv.a.a();
                try {
                    java.util.Scanner scannerUseDelimiter = new java.util.Scanner(processD.getInputStream(), java.nio.charset.StandardCharsets.UTF_8.name()).useDelimiter("\n");
                    try {
                        next = scannerUseDelimiter.hasNext() ? scannerUseDelimiter.next() : null;
                        if (scannerUseDelimiter != null) {
                            scannerUseDelimiter.close();
                        }
                        defpackage.zsv.a.d(threadPolicyA);
                    } catch (java.lang.Throwable th) {
                        if (scannerUseDelimiter != null) {
                            try {
                                scannerUseDelimiter.close();
                            } catch (java.lang.Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (java.lang.Throwable th3) {
                    defpackage.zsv.a.d(threadPolicyA);
                    throw th3;
                }
            }
            property = next;
        }
        return property != null ? property : str2;
    }
}
