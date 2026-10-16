package com.bytedance.sdk.component.utils;

import N0.a;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import java.security.SecureRandom;
import java.util.Random;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class uef {

    /* renamed from: com.bytedance.sdk.component.utils.uef$uef, reason: collision with other inner class name */
    public static class C0067uef {
        static final Random uef = uef.yo();
    }

    public static String oa(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String strUef = uef();
        String strUef2 = uef(strUef, 32);
        String strOa = oa();
        return a.h("3", strUef, strOa, (strUef2 == null || strOa == null) ? null : com.bytedance.sdk.component.moa.uef.uef(str, strOa, strUef2));
    }

    public static JSONObject uef(JSONObject jSONObject) {
        return jSONObject == null ? new JSONObject() : uef(jSONObject.toString());
    }

    public static String yo(String str) {
        if (TextUtils.isEmpty(str) || str.length() < 49) {
            return str;
        }
        String strUef = uef(str.substring(1, 33), 32);
        String strSubstring = str.substring(33, 49);
        return (strSubstring == null || strUef == null) ? str : com.bytedance.sdk.component.moa.uef.oa(str.substring(49), strSubstring, strUef);
    }

    public static JSONObject uef(String str) {
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(str)) {
            try {
                try {
                    String strOa = oa(str);
                    if (!TextUtils.isEmpty(strOa)) {
                        jSONObject.put(PglCryptUtils.KEY_MESSAGE, strOa);
                        jSONObject.put("cypher", 3);
                        return jSONObject;
                    }
                    jSONObject.put(PglCryptUtils.KEY_MESSAGE, str);
                    jSONObject.put("cypher", 0);
                    return jSONObject;
                } catch (Throwable th) {
                    th.getMessage();
                }
            } catch (Throwable unused) {
                jSONObject.put(PglCryptUtils.KEY_MESSAGE, str);
                jSONObject.put("cypher", 0);
            }
        }
        return jSONObject;
    }

    public static Random yo() {
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                return SecureRandom.getInstanceStrong();
            } catch (Throwable unused) {
                return new SecureRandom();
            }
        }
        return new SecureRandom();
    }

    public static String oa() {
        String strUef = uef(8);
        if (strUef == null || strUef.length() != 16) {
            return null;
        }
        return strUef;
    }

    public static String uef() {
        String strUef = uef(16);
        if (strUef == null || strUef.length() != 32) {
            return null;
        }
        return strUef;
    }

    public static String uef(String str, int i5) {
        if (str == null || str.length() != i5) {
            return null;
        }
        int i10 = i5 / 2;
        return str.substring(i10, i5) + str.substring(0, i10);
    }

    public static String uef(int i5) {
        try {
            byte[] bArr = new byte[i5];
            C0067uef.uef.nextBytes(bArr);
            return lw.uef(bArr);
        } catch (Exception unused) {
            return null;
        }
    }
}
