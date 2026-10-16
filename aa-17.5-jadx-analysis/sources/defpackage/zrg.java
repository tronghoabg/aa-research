package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.security.MessageDigest;

/* loaded from: classes3.dex */
public final class zrg {
    public static final zrg a = new zrg();
    public static final yfq b;
    public static final String c;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        yfq yfqVarR = yfq.r("com.google.android.geo.API_KEY", "com.google.android.maps.v2.API_KEY");
        b = yfqVarR;
        c = (String) yfqVarR.get(0);
    }

    public static String a(Context context, String str) throws PackageManager.NameNotFoundException {
        byte[] byteArray;
        MessageDigest messageDigest;
        byte[] bArrDigest;
        if (!addm.a.gu().v()) {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 64);
            if (packageInfo != null && packageInfo.signatures != null && packageInfo.signatures.length != 0 && packageInfo.signatures[0] != null) {
                byteArray = packageInfo.signatures[0].toByteArray();
            }
            return null;
        }
        int i = spj.a;
        PackageInfo packageInfoD = spz.b(context).d(str, 134217728);
        byteArray = (packageInfoD == null || packageInfoD.signingInfo == null || packageInfoD.signingInfo.getApkContentsSigners().length != 1) ? null : packageInfoD.signingInfo.getApkContentsSigners()[0].toByteArray();
        if (byteArray != null && (messageDigest = MessageDigest.getInstance("SHA-1")) != null && (bArrDigest = messageDigest.digest(byteArray)) != null) {
            return a.K(bArrDigest);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized String b(Context context, String str) {
        String string;
        try {
            try {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 128);
                string = null;
                if (applicationInfo.metaData != null) {
                    yfq yfqVar = b;
                    int i = ((yls) yfqVar).c;
                    int i2 = 0;
                    for (int i3 = 0; i3 < i; i3++) {
                        String str2 = (String) yfqVar.get(i3);
                        if (applicationInfo.metaData.containsKey(str2)) {
                            string = applicationInfo.metaData.getString(str2);
                            i2++;
                        }
                    }
                    if (i2 > 1) {
                        throw new IllegalStateException("The API key can only be specified once. It is recommended that you use the meta-data tag with the name: " + c + " in the <application> element of AndroidManifest.xml");
                    }
                }
                if (string == null) {
                    throw new IllegalStateException("API key not found.  Check that <meta-data android:name=\"" + c + "\" android:value=\"your API key\"/> is in the <application> element of AndroidManifest.xml");
                }
            } catch (PackageManager.NameNotFoundException e) {
                throw new AssertionError(e);
            }
        } finally {
        }
        return string;
    }
}
