package com.google.firebase.installations.b;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import androidx.compose.foundation.style.StylePropertiesKt;
import androidx.webkit.ProxyConfig;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f9974a = {ProxyConfig.MATCH_ALL_SCHEMES, "FCM", "GCM", ""};

    /* renamed from: b, reason: collision with root package name */
    private final SharedPreferences f9975b;

    /* renamed from: c, reason: collision with root package name */
    private final String f9976c;

    /* JADX WARN: Removed duplicated region for block: B:11:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(com.google.firebase.e r4) {
        /*
            r3 = this;
            r3.<init>()
            android.content.Context r0 = r4.a()
            java.lang.String r1 = "com.google.android.gms.appid"
            r2 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
            r3.f9975b = r0
            com.google.firebase.i r0 = r4.d()
            java.lang.String r0 = r0.d()
            if (r0 == 0) goto L1b
            goto L4a
        L1b:
            com.google.firebase.i r4 = r4.d()
            java.lang.String r0 = r4.c()
            java.lang.String r4 = "1:"
            boolean r4 = r0.startsWith(r4)
            if (r4 != 0) goto L33
            java.lang.String r4 = "2:"
            boolean r4 = r0.startsWith(r4)
            if (r4 == 0) goto L4a
        L33:
            java.lang.String r4 = ":"
            java.lang.String[] r4 = r0.split(r4)
            int r0 = r4.length
            r1 = 4
            r2 = 0
            if (r0 == r1) goto L40
        L3e:
            r0 = r2
            goto L4a
        L40:
            r0 = 1
            r0 = r4[r0]
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L4a
            goto L3e
        L4a:
            r3.f9976c = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.b.a.<init>(com.google.firebase.e):void");
    }

    private static String c(PublicKey publicKey) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            bArrDigest[0] = (byte) ((bArrDigest[0] & StylePropertiesKt.RightId) + 112);
            return Base64.encodeToString(bArrDigest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    private static final PublicKey d(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e2) {
            Log.w("ContentValues", "Invalid key stored ".concat(e2.toString()));
            return null;
        }
    }

    public final String a() {
        String strC;
        String string;
        SharedPreferences sharedPreferences = this.f9975b;
        synchronized (sharedPreferences) {
            synchronized (sharedPreferences) {
                strC = null;
                string = sharedPreferences.getString("|S|id", null);
            }
        }
        if (string != null) {
            return string;
        }
        SharedPreferences sharedPreferences2 = this.f9975b;
        synchronized (sharedPreferences2) {
            String string2 = sharedPreferences2.getString("|S||P|", null);
            if (string2 != null) {
                PublicKey publicKeyD = d(string2);
                if (publicKeyD != null) {
                    strC = c(publicKeyD);
                }
            }
        }
        return strC;
    }

    public final String b() {
        SharedPreferences sharedPreferences = this.f9975b;
        synchronized (sharedPreferences) {
            String[] strArr = f9974a;
            int i2 = 0;
            while (true) {
                String string = null;
                if (i2 >= 4) {
                    return null;
                }
                String str = strArr[i2];
                String string2 = sharedPreferences.getString("|T|" + this.f9976c + "|" + str, null);
                if (string2 != null && !string2.isEmpty()) {
                    if (string2.startsWith("{")) {
                        try {
                            string = new JSONObject(string2).getString("token");
                        } catch (JSONException unused) {
                        }
                    } else {
                        string = string2;
                    }
                    return string;
                }
                i2++;
            }
        }
    }
}
