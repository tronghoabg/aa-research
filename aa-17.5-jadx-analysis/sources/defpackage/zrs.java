package defpackage;

import android.content.Context;
import android.content.pm.FeatureInfo;
import android.os.StrictMode;
import android.util.Log;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/* loaded from: classes3.dex */
public final class zrs {
    public static final zrs a = new zrs();
    private static final String b = "zrs";

    private zrs() {
    }

    public static boolean b() {
        try {
            return zkt.p();
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean c(Context context) {
        FeatureInfo[] systemAvailableFeatures = context.getPackageManager().getSystemAvailableFeatures();
        if (systemAvailableFeatures != null && (systemAvailableFeatures.length) > 0) {
            for (FeatureInfo featureInfo : systemAvailableFeatures) {
                if (featureInfo.name == null && featureInfo.reqGlEsVersion >= 131072) {
                    return true;
                }
            }
        }
        return false;
    }

    static final Process d(String str) throws InterruptedException, IOException {
        try {
            Process processExec = Runtime.getRuntime().exec(new String[]{"/system/bin/getprop", str});
            int i = 0;
            while (true) {
                try {
                    try {
                        if (processExec.exitValue() == 0) {
                            return processExec;
                        }
                    } catch (IllegalThreadStateException unused) {
                        Thread.sleep(5L);
                        i += 5;
                        if (i >= 1000) {
                            break;
                        }
                    }
                } catch (InterruptedException unused2) {
                    String str2 = b;
                    if (zrn.e(str2, 5)) {
                        Log.w(str2, "Unable to retrieve system property. Interrupted while waiting for process.");
                    }
                    return null;
                }
            }
            String str3 = b;
            if (zrn.e(str3, 5)) {
                Log.w(str3, "Unable to retrieve system property. Process timed out or exited unsuccessfully.");
            }
            return null;
        } catch (IOException unused3) {
            String str4 = b;
            if (zrn.e(str4, 5)) {
                Log.w(str4, "Unable to retrieve system property.");
            }
            return null;
        }
    }

    public final String a(String str, String str2) throws InterruptedException, IOException {
        String property = System.getProperty(str);
        if (property == null) {
            Process processD = d(str);
            if (processD != null) {
                StrictMode.ThreadPolicy threadPolicyA = zrr.a.a();
                try {
                    Scanner scannerUseDelimiter = new Scanner(processD.getInputStream(), StandardCharsets.UTF_8.name()).useDelimiter("\n");
                    try {
                        next = scannerUseDelimiter.hasNext() ? scannerUseDelimiter.next() : null;
                        if (scannerUseDelimiter != null) {
                            scannerUseDelimiter.close();
                        }
                    } finally {
                    }
                } finally {
                    zrr.a.d(threadPolicyA);
                }
            }
            property = next;
        }
        return property != null ? property : str2;
    }
}
