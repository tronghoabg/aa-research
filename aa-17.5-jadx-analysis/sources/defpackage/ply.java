package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes2.dex */
public final class ply {
    public static final ply a = new ply();
    public static final String[] b;
    public static final String c;

    static {
        String[] strArr = {"com.google.android.geo.API_KEY", "com.google.android.maps.v2.API_KEY"};
        b = strArr;
        c = strArr[0];
    }

    public static String a(Signature signature) {
        byte[] bArrDigest;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            if (messageDigest != null && (bArrDigest = messageDigest.digest(signature.toByteArray())) != null) {
                return a.K(bArrDigest);
            }
        } catch (NoSuchAlgorithmException unused) {
        }
        return null;
    }

    public final synchronized String b(Context context, String str) {
        String string;
        try {
            try {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 128);
                string = null;
                if (applicationInfo.metaData != null) {
                    String[] strArr = b;
                    int i = 0;
                    for (int i2 = 0; i2 < 2; i2++) {
                        String str2 = strArr[i2];
                        if (applicationInfo.metaData.containsKey(str2)) {
                            string = applicationInfo.metaData.getString(str2);
                            i++;
                        }
                    }
                    if (i > 1) {
                        throw new RuntimeException("The API key can only be specified once. It is recommended that you use the meta-data tag with the name: " + c + " in the <application> element of AndroidManifest.xml");
                    }
                }
                if (string == null) {
                    throw new RuntimeException("API key not found.  Check that <meta-data android:name=\"" + c + "\" android:value=\"your API key\"/> is in the <application> element of AndroidManifest.xml");
                }
            } catch (PackageManager.NameNotFoundException e) {
                throw new AssertionError(e);
            }
        } finally {
        }
        return string;
    }
}
