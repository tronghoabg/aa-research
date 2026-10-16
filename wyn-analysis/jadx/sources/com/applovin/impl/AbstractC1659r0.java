package com.applovin.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.preference.PreferenceManager;
import com.applovin.impl.C1658q0;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1659r0 {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f22637a = {7, 4, 2, 1, 11};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f22638b = {5, 6, 12, 10, 3, 9, 8, 14};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f22639c = {15, 13};

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f22640d = {20};

    public static boolean a(int i5) {
        return i5 < 200 || i5 >= 300;
    }

    public static String b(String str, com.applovin.impl.sdk.k kVar) {
        return a((String) kVar.a(y4.f23899s0), str, kVar);
    }

    public static Map c(com.applovin.impl.sdk.k kVar) {
        HashMap map = new HashMap();
        String str = (String) kVar.a(y4.f23822j);
        if (StringUtils.isValidString(str)) {
            map.put("device_token", str);
        } else if (!((Boolean) kVar.a(y4.f23844l5)).booleanValue()) {
            map.put("api_key", kVar.j0());
        }
        map.putAll(o7.a(kVar.A().e()));
        return map;
    }

    public static String d(com.applovin.impl.sdk.k kVar) {
        return a((String) kVar.a(y4.f23891r0), "4.0/ad", kVar);
    }

    public static String e(com.applovin.impl.sdk.k kVar) {
        return a((String) kVar.a(y4.f23883q0), "4.0/ad", kVar);
    }

    public static Long f(com.applovin.impl.sdk.k kVar) {
        C1658q0.d dVarA = kVar.w().a();
        if (dVarA == null) {
            return null;
        }
        double dC = o7.c(dVarA.b());
        double d3 = o7.d(dVarA.a());
        if (d3 == 0.0d) {
            return null;
        }
        return Long.valueOf((long) (dC / d3));
    }

    public static String g(com.applovin.impl.sdk.k kVar) {
        NetworkInfo networkInfoB = b(com.applovin.impl.sdk.k.o());
        if (networkInfoB != null) {
            int type = networkInfoB.getType();
            int subtype = networkInfoB.getSubtype();
            if (type == 1) {
                return "wifi";
            }
            if (type == 0) {
                return a(subtype, f22637a) ? "2g" : a(subtype, f22638b) ? "3g" : a(subtype, f22639c) ? "4g" : a(subtype, f22640d) ? "5g" : "mobile";
            }
        }
        return "unknown";
    }

    public static String a(String str, com.applovin.impl.sdk.k kVar) {
        return a((String) kVar.a(y4.f23907t0), str, kVar);
    }

    public static void b(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        String string = JsonUtils.getString(jSONObject, "persisted_data", null);
        if (StringUtils.isValidString(string)) {
            kVar.b(a5.f20938H, string);
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().d("ConnectionUtils", "Updated persisted data");
            }
        }
    }

    public static void a(JSONObject jSONObject, boolean z2, com.applovin.impl.sdk.k kVar) {
        kVar.t().a(jSONObject, z2);
    }

    public static void a(int i5, com.applovin.impl.sdk.k kVar) {
        if (i5 == 401) {
            com.applovin.impl.sdk.o.h("AppLovinSdk", "SDK key \"" + kVar.j0() + "\" is rejected by AppLovin. Please make sure the SDK key is correct.");
            return;
        }
        if (i5 == 418) {
            kVar.p0().a(y4.f23780e, Boolean.TRUE);
            kVar.p0().e();
        } else if (i5 >= 400 && i5 < 500) {
            if (((Boolean) kVar.a(y4.f23796g)).booleanValue()) {
                kVar.V0();
            }
        } else if (i5 == -1 && ((Boolean) kVar.a(y4.f23796g)).booleanValue()) {
            kVar.V0();
        }
    }

    private static NetworkInfo b(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager != null) {
            return connectivityManager.getActiveNetworkInfo();
        }
        return null;
    }

    public static void c(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        if (jSONObject == null) {
            throw new IllegalArgumentException("No response specified");
        }
        if (kVar != null) {
            try {
                if (jSONObject.has("settings")) {
                    z4 z4VarP0 = kVar.p0();
                    if (jSONObject.isNull("settings")) {
                        return;
                    }
                    JSONObject jSONObject2 = jSONObject.getJSONObject("settings");
                    z4VarP0.a(jSONObject2);
                    z4VarP0.e();
                    String strB = y4.f23634K6.b();
                    if (JsonUtils.valueExists(jSONObject2, strB)) {
                        b5.b(a5.f20940J, JsonUtils.getBoolean(jSONObject2, strB, Boolean.FALSE), com.applovin.impl.sdk.k.o());
                        return;
                    }
                    return;
                }
                return;
            } catch (JSONException e7) {
                kVar.O();
                if (com.applovin.impl.sdk.o.a()) {
                    kVar.O().a("ConnectionUtils", "Unable to parse settings out of API response", e7);
                    return;
                }
                return;
            }
        }
        throw new IllegalArgumentException("No sdk specified");
    }

    public static String b(com.applovin.impl.sdk.k kVar) {
        return a((String) kVar.a(y4.f23883q0), ((Boolean) kVar.a(y4.f23851m3)).booleanValue() ? "5.0/ad" : "4.0/ad", kVar);
    }

    public static String a(String str, String str2, com.applovin.impl.sdk.k kVar) {
        if (str == null || str.length() < 4) {
            throw new IllegalArgumentException("Invalid domain specified");
        }
        if (str2 == null) {
            throw new IllegalArgumentException("No endpoint specified");
        }
        if (kVar != null) {
            return str.concat(str2);
        }
        throw new IllegalArgumentException("No sdk specified");
    }

    public static void a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "filesystem_values", (JSONObject) null);
        if (jSONObject2 != null) {
            SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(com.applovin.impl.sdk.k.o()).edit();
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object object = JsonUtils.getObject(jSONObject2, next, null);
                if (object != null) {
                    b5.a(next, object, (SharedPreferences) null, editorEdit);
                }
            }
            if (((Boolean) kVar.a(y4.f23603G6)).booleanValue()) {
                b5.a(editorEdit);
            } else {
                editorEdit.apply();
            }
        }
    }

    public static byte[] a(InputStream inputStream, com.applovin.impl.sdk.k kVar) throws IOException {
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[((Integer) kVar.a(y4.f23791f3)).intValue()];
        while (true) {
            int i5 = inputStream.read(bArr);
            if (i5 > 0) {
                byteArrayOutputStream.write(bArr, 0, i5);
            } else {
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    public static boolean a(Context context) {
        if (context.getSystemService("connectivity") == null) {
            return true;
        }
        NetworkInfo networkInfoB = b(context);
        if (networkInfoB != null) {
            return networkInfoB.isConnected();
        }
        return false;
    }

    private static boolean a(int i5, int[] iArr) {
        for (int i10 : iArr) {
            if (i10 == i5) {
                return true;
            }
        }
        return false;
    }

    public static String a(com.applovin.impl.sdk.k kVar) {
        return a((String) kVar.a(y4.f23891r0), ((Boolean) kVar.a(y4.f23851m3)).booleanValue() ? "5.0/ad" : "4.0/ad", kVar);
    }
}
