package com.bytedance.sdk.openadsdk.dz.uef.uef;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.nio.charset.StandardCharsets;

/* loaded from: classes3.dex */
public class uef {
    public static String oa(String str) {
        if (TextUtils.isEmpty(str) || !str.startsWith("XOR$1_")) {
            Log.e("IABCypherTool", "decryptString: Invalid encrypt string input");
            return null;
        }
        String strSubstring = str.substring(6);
        if (TextUtils.isEmpty(strSubstring)) {
            return null;
        }
        try {
            return new String(uef(Base64.decode(strSubstring, 0)), StandardCharsets.UTF_8);
        } catch (Exception unused) {
            return null;
        }
    }

    public static String uef(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return "XOR$1_".concat(String.valueOf(Base64.encodeToString(uef(str.getBytes(StandardCharsets.UTF_8)), 0)));
    }

    private static byte[] uef(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            byte[] bytes = "PAGAdSDK".getBytes(StandardCharsets.UTF_8);
            int length = bytes.length;
            byte[] bArr2 = new byte[bArr.length];
            for (int i5 = 0; i5 < bArr.length; i5++) {
                bArr2[i5] = (byte) (bArr[i5] ^ bytes[i5 % length]);
            }
            return bArr2;
        }
        return new byte[0];
    }
}
