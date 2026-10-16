package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import j1.InterfaceC3073a;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import t.InterfaceC4035a;

/* loaded from: classes.dex */
public class i5 {

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f21735a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f21736b = new Object();

    public i5(JSONObject jSONObject) {
        this.f21735a = jSONObject;
    }

    public JSONObject a() {
        JSONObject jSONObjectDeepCopy;
        synchronized (this.f21736b) {
            jSONObjectDeepCopy = JsonUtils.deepCopy(this.f21735a);
        }
        return jSONObjectDeepCopy;
    }

    public List b(String str, List list) {
        List<String> stringList;
        synchronized (this.f21736b) {
            stringList = JsonUtils.getStringList(this.f21735a, str, list);
        }
        return stringList;
    }

    public void c(String str) {
        synchronized (this.f21736b) {
            this.f21735a.remove(str);
        }
    }

    public String toString() {
        String string;
        synchronized (this.f21736b) {
            string = this.f21735a.toString();
        }
        return string;
    }

    public boolean a(String str) {
        boolean zHas;
        synchronized (this.f21736b) {
            zHas = this.f21735a.has(str);
        }
        return zHas;
    }

    public Object b(String str) {
        Object objOpt;
        synchronized (this.f21736b) {
            objOpt = this.f21735a.opt(str);
        }
        return objOpt;
    }

    public void a(InterfaceC3073a interfaceC3073a) {
        synchronized (this.f21736b) {
            interfaceC3073a.accept(this);
        }
    }

    public void b(String str, int i5) {
        synchronized (this.f21736b) {
            JsonUtils.putInt(this.f21735a, str, i5);
        }
    }

    public Object a(InterfaceC4035a interfaceC4035a) {
        Object objApply;
        synchronized (this.f21736b) {
            objApply = interfaceC4035a.apply(this);
        }
        return objApply;
    }

    public void b(String str, long j8) {
        synchronized (this.f21736b) {
            JsonUtils.putLong(this.f21735a, str, j8);
        }
    }

    public Boolean a(String str, Boolean bool) {
        Boolean bool2;
        synchronized (this.f21736b) {
            bool2 = JsonUtils.getBoolean(this.f21735a, str, bool);
        }
        return bool2;
    }

    public void b(String str, String str2) {
        synchronized (this.f21736b) {
            JsonUtils.putString(this.f21735a, str, str2);
        }
    }

    public float a(String str, float f10) {
        float f11;
        synchronized (this.f21736b) {
            f11 = JsonUtils.getFloat(this.f21735a, str, f10);
        }
        return f11;
    }

    public int a(String str, int i5) {
        int i10;
        synchronized (this.f21736b) {
            i10 = JsonUtils.getInt(this.f21735a, str, i5);
        }
        return i10;
    }

    public JSONArray a(String str, JSONArray jSONArray) {
        JSONArray jSONArray2;
        synchronized (this.f21736b) {
            jSONArray2 = JsonUtils.getJSONArray(this.f21735a, str, jSONArray);
        }
        return jSONArray2;
    }

    public JSONObject a(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        synchronized (this.f21736b) {
            jSONObject2 = JsonUtils.getJSONObject(this.f21735a, str, jSONObject);
        }
        return jSONObject2;
    }

    public long a(String str, long j8) {
        long j10;
        synchronized (this.f21736b) {
            j10 = JsonUtils.getLong(this.f21735a, str, j8);
        }
        return j10;
    }

    public String a(String str, String str2) {
        String string;
        synchronized (this.f21736b) {
            string = JsonUtils.getString(this.f21735a, str, str2);
        }
        return string;
    }

    public List a(String str, List list) {
        List<Integer> integerList;
        synchronized (this.f21736b) {
            integerList = JsonUtils.getIntegerList(this.f21735a, str, list);
        }
        return integerList;
    }

    public void a(String str, boolean z2) {
        synchronized (this.f21736b) {
            JsonUtils.putBoolean(this.f21735a, str, z2);
        }
    }

    public void a(String str, Object obj) {
        synchronized (this.f21736b) {
            JsonUtils.putObject(this.f21735a, str, obj);
        }
    }
}
