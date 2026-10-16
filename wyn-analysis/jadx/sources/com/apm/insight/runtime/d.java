package com.apm.insight.runtime;

import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private static HashMap<String, d> f20638a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private JSONObject f20639b = null;

    /* renamed from: c, reason: collision with root package name */
    private JSONObject f20640c = null;

    /* renamed from: d, reason: collision with root package name */
    private boolean f20641d = false;

    /* renamed from: e, reason: collision with root package name */
    private String f20642e;

    private d(JSONObject jSONObject, String str) {
        this.f20642e = str;
        a(jSONObject);
        f20638a.put(this.f20642e, this);
        com.apm.insight.a.a((Object) "after update aid ".concat(String.valueOf(str)));
    }

    private void a(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        this.f20639b = jSONObject;
        if (jSONObject == null || (jSONObjectOptJSONObject = jSONObject.optJSONObject("error_module")) == null) {
            return;
        }
        this.f20641d = jSONObjectOptJSONObject.optInt("switcher") == 1 && jSONObjectOptJSONObject.optInt("err_sampling_rate") == 1;
    }

    public static JSONObject b(String str) {
        d dVar = f20638a.get(str);
        if (dVar != null) {
            return dVar.f20639b;
        }
        return null;
    }

    public static d c(String str) {
        return f20638a.get(str);
    }

    public static long d(String str) {
        d dVar = f20638a.get(str);
        if (dVar == null) {
            return 3600000L;
        }
        try {
            return Long.decode(com.apm.insight.a.a(dVar.f20639b, "over_all", "get_settings_interval")).longValue() * 1000;
        } catch (Throwable unused) {
            return 3600000L;
        }
    }

    public static boolean e(String str) {
        JSONObject jSONObject;
        d dVar = f20638a.get(str);
        return (dVar == null || (jSONObject = dVar.f20639b) == null || 1 != com.apm.insight.a.a(jSONObject, 0, "crash_module", "switcher")) ? false : true;
    }

    public static boolean f(String str) {
        JSONObject jSONObject;
        d dVar = f20638a.get(str);
        return (dVar == null || (jSONObject = dVar.f20639b) == null || 1 != com.apm.insight.a.a(jSONObject, 0, "crash_module", "switcher")) ? false : true;
    }

    public static boolean g(String str) {
        JSONObject jSONObject;
        d dVar = f20638a.get(str);
        return (dVar == null || (jSONObject = dVar.f20639b) == null || 1 != com.apm.insight.a.a(jSONObject, 0, "crash_module", "switcher")) ? false : true;
    }

    public final boolean a() {
        if (this.f20639b == null) {
            return false;
        }
        return this.f20641d;
    }

    public static boolean a(String str) {
        return f20638a.get(str) != null;
    }

    public static void a(String str, JSONObject jSONObject) {
        d dVar = f20638a.get(str);
        if (dVar != null) {
            dVar.a(jSONObject);
        } else {
            new d(jSONObject, str);
        }
    }
}
