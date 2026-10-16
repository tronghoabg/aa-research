package com.applovin.impl;

import android.content.Context;
import android.content.SharedPreferences;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class z4 {

    /* renamed from: a, reason: collision with root package name */
    protected final com.applovin.impl.sdk.k f24006a;

    /* renamed from: b, reason: collision with root package name */
    protected final Context f24007b;

    /* renamed from: c, reason: collision with root package name */
    protected final SharedPreferences f24008c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f24009d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private final Object f24010e = new Object();

    public z4(com.applovin.impl.sdk.k kVar) {
        this.f24006a = kVar;
        Context contextO = com.applovin.impl.sdk.k.o();
        this.f24007b = contextO;
        this.f24008c = contextO.getSharedPreferences("com.applovin.sdk.1", 0);
        try {
            Class.forName(y4.class.getName());
            Class.forName(r3.class.getName());
        } catch (Throwable unused) {
        }
        d();
    }

    private void d() {
        String strB = ((Boolean) b5.a(a5.f20957j, Boolean.FALSE, com.applovin.impl.sdk.k.o())).booleanValue() ? "" : b();
        synchronized (this.f24010e) {
            try {
                for (y4 y4Var : y4.c()) {
                    try {
                        Object objA = this.f24006a.a(strB + y4Var.b(), null, y4Var.a().getClass(), this.f24008c);
                        if (objA != null) {
                            this.f24009d.put(y4Var.b(), objA);
                        }
                    } catch (Throwable th) {
                        com.applovin.impl.sdk.o.c("SettingsManager", "Unable to load \"" + y4Var.b() + "\"", th);
                        this.f24006a.D().a("SettingsManager", "initSettings", th);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public Object a(y4 y4Var) {
        if (y4Var == null) {
            throw new IllegalArgumentException("No setting type specified");
        }
        synchronized (this.f24010e) {
            try {
                Object obj = this.f24009d.get(y4Var.b());
                if (obj == null) {
                    return y4Var.a();
                }
                return y4Var.a(obj);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public List b(y4 y4Var) {
        ArrayList arrayList = new ArrayList(6);
        Iterator it = c(y4Var).iterator();
        while (it.hasNext()) {
            arrayList.add(MaxAdFormat.formatFromString((String) it.next()));
        }
        return arrayList;
    }

    public List c(y4 y4Var) {
        return CollectionUtils.explode((String) a(y4Var));
    }

    public void e() {
        Boolean bool = (Boolean) b5.a(a5.f20957j, Boolean.FALSE, com.applovin.impl.sdk.k.o());
        String strB = b();
        synchronized (this.f24010e) {
            try {
                SharedPreferences.Editor editorEdit = this.f24008c.edit();
                for (y4 y4Var : y4.c()) {
                    Object obj = this.f24009d.get(y4Var.b());
                    if (obj != null) {
                        String strB2 = y4Var.b();
                        this.f24006a.a(strB + y4Var.b(), obj, editorEdit);
                        if (bool.booleanValue()) {
                            this.f24006a.a(strB2, obj, editorEdit);
                        }
                    }
                }
                if (((Boolean) this.f24006a.a(y4.f23603G6)).booleanValue()) {
                    b5.a(editorEdit);
                } else {
                    editorEdit.apply();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean c() {
        return this.f24006a.o0().isVerboseLoggingEnabled() || ((Boolean) a(y4.k)).booleanValue();
    }

    private String b() {
        return "com.applovin.sdk." + o7.f(this.f24006a.j0()) + ".";
    }

    public void a(y4 y4Var, Object obj) {
        if (y4Var == null) {
            throw new IllegalArgumentException("No setting type specified");
        }
        if (obj != null) {
            synchronized (this.f24010e) {
                this.f24009d.put(y4Var.b(), obj);
            }
            return;
        }
        throw new IllegalArgumentException("No new value specified");
    }

    public void a(JSONObject jSONObject) {
        synchronized (this.f24010e) {
            try {
                boolean zBooleanValue = JsonUtils.getBoolean(jSONObject, y4.f23922v.b(), Boolean.FALSE).booleanValue();
                HashMap map = zBooleanValue ? new HashMap() : null;
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (next != null && next.length() > 0) {
                        try {
                            y4 y4VarA = y4.a(next);
                            if (y4VarA != null) {
                                Object objA = zBooleanValue ? a(y4VarA) : null;
                                Object objA2 = a(next, jSONObject, y4VarA.a());
                                this.f24009d.put(y4VarA.b(), objA2);
                                if (y4VarA == y4.f23617I5) {
                                    this.f24009d.put(y4.f23625J5.b(), Long.valueOf(System.currentTimeMillis()));
                                }
                                if (zBooleanValue && !objA2.equals(objA)) {
                                    map.put(y4VarA, objA);
                                }
                            }
                        } catch (JSONException e7) {
                            com.applovin.impl.sdk.o.c("SettingsManager", "Unable to parse JSON settingsValues array", e7);
                            this.f24006a.D().a("SettingsManager", "loadSettingsException", e7);
                        } catch (Throwable th) {
                            com.applovin.impl.sdk.o.c("SettingsManager", "Unable to convert setting object ", th);
                            this.f24006a.D().a("SettingsManager", "loadSettingsThrowable", th);
                        }
                    }
                }
                if (zBooleanValue && map.size() > 0) {
                    v2 v2Var = new v2();
                    v2Var.a("========== UPDATED SETTINGS ==========");
                    for (y4 y4Var : map.keySet()) {
                        v2Var.a(y4Var.b(), a(y4Var) + " (" + map.get(y4Var) + ")");
                    }
                    v2Var.a("========== END ==========");
                    this.f24006a.O();
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f24006a.O().a("SettingsManager", v2Var.toString());
                    }
                }
                b5.b(a5.f20957j, (Boolean) a(y4.f23710U6), com.applovin.impl.sdk.k.o());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a() {
        synchronized (this.f24010e) {
            this.f24009d.clear();
        }
        this.f24006a.a(this.f24008c);
    }

    private static Object a(String str, JSONObject jSONObject, Object obj) {
        if (obj instanceof Boolean) {
            return Boolean.valueOf(jSONObject.getBoolean(str));
        }
        if (obj instanceof Float) {
            return Float.valueOf((float) jSONObject.getDouble(str));
        }
        if (obj instanceof Double) {
            return Double.valueOf(jSONObject.getDouble(str));
        }
        if (obj instanceof Integer) {
            return Integer.valueOf(jSONObject.getInt(str));
        }
        if (obj instanceof Long) {
            return Long.valueOf(jSONObject.getLong(str));
        }
        if (obj instanceof String) {
            return jSONObject.getString(str);
        }
        throw new RuntimeException("SDK Error: unknown value type: " + obj.getClass());
    }
}
