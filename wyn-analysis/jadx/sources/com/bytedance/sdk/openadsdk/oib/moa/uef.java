package com.bytedance.sdk.openadsdk.oib.moa;

import A7.AbstractC0279p0;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.sdk.component.oa;
import com.bytedance.sdk.component.utils.dhk;
import com.bytedance.sdk.component.utils.tpx;
import com.bytedance.sdk.openadsdk.core.sy;
import com.bytedance.sdk.openadsdk.core.zjm;
import com.qonversion.android.sdk.internal.Constants;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* loaded from: classes3.dex */
public class uef {

    /* renamed from: oa, reason: collision with root package name */
    private static SoftReference<ConcurrentHashMap<String, Map<String, Object>>> f26054oa;
    public static HashSet<String> uef = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.oib.moa.uef.1
        {
            add("app_id");
            add("extra_data");
            add("sdk_app_sha1");
            add("uuid");
            add("android_system_ua");
            add("sdk_local_web_ua");
            add("sdk_local_rom_info");
        }
    };

    private static String oa(String str) {
        return TextUtils.isEmpty(str) ? "tt_sp" : str;
    }

    private static String uef(Context context, String str, String str2) {
        if (uef.contains(str2)) {
            str = "pag_sp_bad_par";
        }
        if (tpx.uef(context)) {
            return str;
        }
        StringBuilder sbQ = AbstractC0279p0.q(str, Constants.USER_ID_SEPARATOR);
        sbQ.append(tpx.yo(context));
        return sbQ.toString();
    }

    private static void yo(String str) {
        ConcurrentHashMap<String, Map<String, Object>> concurrentHashMap;
        Map<String, Object> map;
        SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = f26054oa;
        if (softReference == null || (concurrentHashMap = softReference.get()) == null || (map = concurrentHashMap.get(oa(str))) == null) {
            return;
        }
        map.clear();
    }

    public static String oa(String str, String str2, String str3) {
        return uef() ? str3 : uef(sy.uef(), oa(str), str2, str3);
    }

    private static void oa(Context context, String str, String str2) {
        ConcurrentHashMap<String, Map<String, Object>> concurrentHashMap;
        Map<String, Object> map;
        try {
            String strUef = uef(context, str, str2);
            if (zjm.xs(strUef)) {
                oa.uef(context, strUef).oa().remove(str2).apply();
                return;
            }
            SharedPreferences sharedPreferencesUef = uef(context, strUef);
            if (sharedPreferencesUef == null) {
                return;
            }
            SharedPreferences.Editor editorEdit = sharedPreferencesUef.edit();
            editorEdit.remove(str2);
            editorEdit.apply();
            SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = f26054oa;
            if (softReference != null && (concurrentHashMap = softReference.get()) != null && (map = concurrentHashMap.get(oa(strUef))) != null && map.size() != 0) {
                map.remove(str2);
            }
        } catch (Throwable unused) {
        }
    }

    private static boolean uef() {
        return sy.uef() == null;
    }

    public static void uef(String str, String str2, Boolean bool) {
        if (uef()) {
            return;
        }
        uef(oa(str), str2, bool);
    }

    public static void uef(String str, String str2, Long l10) {
        if (uef()) {
            return;
        }
        uef(oa(str), str2, l10);
    }

    public static void uef(String str, String str2, String str3) {
        if (uef()) {
            return;
        }
        uef(oa(str), str2, str3);
    }

    public static void uef(String str, String str2, Integer num) {
        if (uef()) {
            return;
        }
        uef(oa(str), str2, num);
    }

    private static void oa(Context context, String str) {
        String strUef = uef(sy.uef(), str, "");
        if (zjm.xs(strUef)) {
            oa.uef(context, strUef).oa().clear().apply();
            yo(strUef);
            return;
        }
        SharedPreferences sharedPreferencesUef = uef(context, strUef);
        if (sharedPreferencesUef == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = sharedPreferencesUef.edit();
        editorEdit.clear();
        editorEdit.apply();
        yo(strUef);
    }

    public static int uef(String str, String str2, int i5) {
        return uef() ? i5 : uef(sy.uef(), oa(str), str2, i5);
    }

    private static int uef(Context context, String str, String str2, int i5) {
        String strUef = uef(context, str, str2);
        if (zjm.xs(strUef)) {
            return oa.uef(context, strUef).uef(str2, i5);
        }
        SharedPreferences sharedPreferencesUef = uef(context, strUef);
        return sharedPreferencesUef == null ? i5 : sharedPreferencesUef.getInt(str2, i5);
    }

    public static boolean uef(String str, String str2, boolean z2) {
        return uef() ? z2 : uef(sy.uef(), oa(str), str2, z2);
    }

    private static Object oa(String str, String str2) {
        ConcurrentHashMap<String, Map<String, Object>> concurrentHashMap;
        Map<String, Object> map;
        SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = f26054oa;
        if (softReference == null || (concurrentHashMap = softReference.get()) == null || (map = concurrentHashMap.get(oa(str))) == null) {
            return null;
        }
        return map.get(str2);
    }

    private static boolean uef(Context context, String str, String str2, boolean z2) {
        String strUef = uef(context, str, str2);
        if (zjm.xs(strUef)) {
            return oa.uef(context, strUef).uef(str2, z2);
        }
        SharedPreferences sharedPreferencesUef = uef(context, strUef);
        return sharedPreferencesUef == null ? z2 : sharedPreferencesUef.getBoolean(str2, z2);
    }

    private static void oa(String str, String str2, Object obj) {
        SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = f26054oa;
        if (softReference == null || softReference.get() == null) {
            f26054oa = new SoftReference<>(new ConcurrentHashMap());
        }
        String strOa = oa(str);
        ConcurrentHashMap<String, Map<String, Object>> concurrentHashMap = f26054oa.get();
        if (concurrentHashMap == null) {
            return;
        }
        Map<String, Object> map = concurrentHashMap.get(strOa);
        if (map == null) {
            map = new HashMap<>();
            concurrentHashMap.put(strOa, map);
        }
        map.put(str2, obj);
    }

    public static long uef(String str, String str2, long j8) {
        return uef() ? j8 : uef(sy.uef(), oa(str), str2, j8);
    }

    private static long uef(Context context, String str, String str2, long j8) {
        String strUef = uef(context, str, str2);
        if (zjm.xs(strUef)) {
            return oa.uef(context, strUef).uef(str2, j8);
        }
        SharedPreferences sharedPreferencesUef = uef(context, strUef);
        return sharedPreferencesUef == null ? j8 : sharedPreferencesUef.getLong(str2, j8);
    }

    private static String uef(Context context, String str, String str2, String str3) {
        String strUef = uef(context, str, str2);
        if (zjm.xs(strUef)) {
            return oa.uef(context, strUef).uef(str2, str3);
        }
        SharedPreferences sharedPreferencesUef = uef(context, strUef);
        return sharedPreferencesUef == null ? str3 : sharedPreferencesUef.getString(str2, str3);
    }

    public static void uef(String str, String str2) {
        if (uef()) {
            return;
        }
        try {
            oa(sy.uef(), oa(str), str2);
        } catch (Throwable unused) {
        }
    }

    public static void uef(String str) {
        if (uef()) {
            return;
        }
        try {
            oa(sy.uef(), oa(str));
        } catch (Throwable unused) {
        }
    }

    private static <T> void uef(String str, String str2, T t10) {
        String strUef = uef(sy.uef(), str, str2);
        if (zjm.xs(strUef)) {
            if (t10.equals(oa(strUef, str2))) {
                return;
            }
            oa.yo yoVarOa = oa.uef(sy.uef(), oa(strUef)).oa();
            uef(yoVarOa, str2, (Object) t10);
            yoVarOa.apply();
            oa(strUef, str2, t10);
            return;
        }
        SharedPreferences sharedPreferencesUef = uef(sy.uef(), oa(strUef));
        if (sharedPreferencesUef == null || t10.equals(oa(strUef, str2))) {
            return;
        }
        SharedPreferences.Editor editorEdit = sharedPreferencesUef.edit();
        uef(editorEdit, str2, t10);
        editorEdit.apply();
        oa(strUef, str2, t10);
    }

    public static SharedPreferences uef(Context context, String str) {
        if (context == null) {
            return null;
        }
        try {
            return context.getSharedPreferences(oa(str), 0);
        } catch (Throwable th) {
            dhk.yo("TTAD.TTSaveHelper", "getSharedPreferences error ", th.getMessage());
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <T> void uef(oa.yo yoVar, String str, T t10) {
        if (t10 instanceof Integer) {
            yoVar.putInt(str, ((Integer) t10).intValue());
        }
        if (t10 instanceof Long) {
            yoVar.putLong(str, ((Long) t10).longValue());
        }
        if (t10 instanceof Float) {
            yoVar.putFloat(str, ((Float) t10).floatValue());
        }
        if (t10 instanceof Boolean) {
            yoVar.putBoolean(str, ((Boolean) t10).booleanValue());
        }
        if (t10 instanceof String) {
            yoVar.putString(str, (String) t10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <T> void uef(SharedPreferences.Editor editor, String str, T t10) {
        if (t10 instanceof Integer) {
            editor.putInt(str, ((Integer) t10).intValue());
        }
        if (t10 instanceof Long) {
            editor.putLong(str, ((Long) t10).longValue());
        }
        if (t10 instanceof Float) {
            editor.putFloat(str, ((Float) t10).floatValue());
        }
        if (t10 instanceof Boolean) {
            editor.putBoolean(str, ((Boolean) t10).booleanValue());
        }
        if (t10 instanceof String) {
            editor.putString(str, (String) t10);
        }
    }
}
