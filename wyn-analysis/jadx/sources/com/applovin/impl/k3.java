package com.applovin.impl;

import android.os.Bundle;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinEventParameters;
import com.qonversion.android.sdk.internal.Constants;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class k3 {

    /* renamed from: a, reason: collision with root package name */
    protected final com.applovin.impl.sdk.k f21804a;

    /* renamed from: b, reason: collision with root package name */
    private final JSONObject f21805b;

    /* renamed from: d, reason: collision with root package name */
    protected final JSONObject f21807d;

    /* renamed from: f, reason: collision with root package name */
    private final Map f21809f;

    /* renamed from: g, reason: collision with root package name */
    private final i5 f21810g;

    /* renamed from: h, reason: collision with root package name */
    protected final i5 f21811h;

    /* renamed from: i, reason: collision with root package name */
    private String f21812i;

    /* renamed from: j, reason: collision with root package name */
    private String f21813j;

    /* renamed from: c, reason: collision with root package name */
    private final Object f21806c = new Object();

    /* renamed from: e, reason: collision with root package name */
    protected final Object f21808e = new Object();

    public k3(Map map, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.k kVar) {
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        if (jSONObject2 == null) {
            throw new IllegalArgumentException("No full response specified");
        }
        if (jSONObject == null) {
            throw new IllegalArgumentException("No ad object specified");
        }
        this.f21804a = kVar;
        if (((Boolean) kVar.a(y4.f23579D6)).booleanValue()) {
            this.f21810g = new i5(jSONObject2);
            this.f21811h = new i5(jSONObject);
            this.f21805b = null;
            this.f21807d = null;
        } else {
            this.f21805b = jSONObject2;
            this.f21807d = jSONObject;
            this.f21810g = null;
            this.f21811h = null;
        }
        this.f21809f = map;
    }

    private int j() {
        return a("mute_state", b("mute_state", ((Integer) this.f21804a.a(r3.f22709g8)).intValue()));
    }

    public JSONObject a() {
        JSONObject jSONObject;
        i5 i5Var = this.f21811h;
        if (i5Var != null) {
            return i5Var.a();
        }
        synchronized (this.f21808e) {
            jSONObject = this.f21807d;
        }
        return jSONObject;
    }

    public Boolean b(String str, Boolean bool) {
        Boolean bool2;
        i5 i5Var = this.f21810g;
        if (i5Var != null) {
            return i5Var.a(str, bool);
        }
        synchronized (this.f21806c) {
            bool2 = JsonUtils.getBoolean(this.f21805b, str, bool);
        }
        return bool2;
    }

    public boolean c(String str) {
        boolean zHas;
        i5 i5Var = this.f21811h;
        if (i5Var != null) {
            return i5Var.a(str);
        }
        synchronized (this.f21808e) {
            zHas = this.f21807d.has(str);
        }
        return zHas;
    }

    public boolean d(String str) {
        boolean zHas;
        i5 i5Var = this.f21810g;
        if (i5Var != null) {
            return i5Var.a(str);
        }
        synchronized (this.f21806c) {
            zHas = this.f21805b.has(str);
        }
        return zHas;
    }

    public Object e(String str) {
        Object objOpt;
        i5 i5Var = this.f21811h;
        if (i5Var != null) {
            return i5Var.b(str);
        }
        synchronized (this.f21808e) {
            objOpt = this.f21807d.opt(str);
        }
        return objOpt;
    }

    public Bundle f() {
        return BundleUtils.getBundle("custom_parameters", new Bundle(), l());
    }

    public JSONObject g() {
        JSONObject jSONObject;
        i5 i5Var = this.f21810g;
        if (i5Var != null) {
            return i5Var.a();
        }
        synchronized (this.f21806c) {
            jSONObject = this.f21805b;
        }
        return jSONObject;
    }

    public String getAdUnitId() {
        return b("ad_unit_id", "");
    }

    public String getPlacement() {
        return this.f21812i;
    }

    public Map i() {
        return this.f21809f;
    }

    public String k() {
        return c().split(Constants.USER_ID_SEPARATOR)[0];
    }

    public Bundle l() {
        Bundle bundle;
        if (e("server_parameters") instanceof JSONObject) {
            i5 i5Var = this.f21811h;
            bundle = i5Var != null ? (Bundle) i5Var.a(new V1.c(20)) : JsonUtils.toBundle(a("server_parameters", (JSONObject) null));
        } else {
            bundle = new Bundle();
        }
        int iJ = j();
        if (iJ != -1) {
            if (iJ == 2) {
                bundle.putBoolean("is_muted", this.f21804a.o0().isMuted());
            } else {
                bundle.putBoolean("is_muted", iJ == 0);
            }
        }
        if (!bundle.containsKey(AppLovinEventParameters.REVENUE_AMOUNT)) {
            bundle.putLong(AppLovinEventParameters.REVENUE_AMOUNT, b(AppLovinEventParameters.REVENUE_AMOUNT, 0L));
        }
        if (!bundle.containsKey("currency")) {
            bundle.putString("currency", b("currency", ""));
        }
        return bundle;
    }

    public long m() {
        return a("adapter_timeout_ms", ((Long) this.f21804a.a(r3.f22678C7)).longValue());
    }

    public Boolean n() {
        String str = this.f21804a.o0().getExtraParameters().get("huc");
        return StringUtils.isValidString(str) ? Boolean.valueOf(str) : c("huc") ? a("huc", Boolean.FALSE) : b("huc", (Boolean) null);
    }

    public Boolean o() {
        String str = this.f21804a.o0().getExtraParameters().get("dns");
        return StringUtils.isValidString(str) ? Boolean.valueOf(str) : c("dns") ? a("dns", Boolean.FALSE) : b("dns", (Boolean) null);
    }

    public boolean p() {
        return a("is_testing", Boolean.FALSE).booleanValue();
    }

    public boolean q() {
        return a("reinitialize_if_init_fails", Boolean.FALSE).booleanValue();
    }

    public boolean r() {
        return a("run_on_ui_thread", Boolean.TRUE).booleanValue();
    }

    public boolean s() {
        return a("eagerly_initialize", Boolean.TRUE).booleanValue();
    }

    public String toString() {
        return "MediationAdapterSpec{adapterClass='" + b() + "', adapterName='" + c() + "', isTesting=" + p() + '}';
    }

    public void f(String str) {
        this.f21813j = str;
    }

    public long h() {
        return a("init_completion_delay_ms", -1L);
    }

    public Boolean a(String str, Boolean bool) {
        Boolean bool2;
        i5 i5Var = this.f21811h;
        if (i5Var != null) {
            return i5Var.a(str, bool);
        }
        synchronized (this.f21808e) {
            bool2 = JsonUtils.getBoolean(this.f21807d, str, bool);
        }
        return bool2;
    }

    public int b(String str, int i5) {
        int i10;
        i5 i5Var = this.f21810g;
        if (i5Var != null) {
            return i5Var.a(str, i5);
        }
        synchronized (this.f21806c) {
            i10 = JsonUtils.getInt(this.f21805b, str, i5);
        }
        return i10;
    }

    public void c(String str, int i5) {
        i5 i5Var = this.f21811h;
        if (i5Var != null) {
            i5Var.b(str, i5);
            return;
        }
        synchronized (this.f21808e) {
            JsonUtils.putInt(this.f21807d, str, i5);
        }
    }

    public String d() {
        if (c("consent_string")) {
            return a("consent_string", (String) null);
        }
        if (d("consent_string")) {
            return b("consent_string", (String) null);
        }
        return this.f21804a.s0().j();
    }

    public String e() {
        return this.f21813j;
    }

    public void g(String str) {
        this.f21812i = str;
    }

    public float a(String str, float f10) {
        float f11;
        i5 i5Var = this.f21811h;
        if (i5Var != null) {
            return i5Var.a(str, f10);
        }
        synchronized (this.f21808e) {
            f11 = JsonUtils.getFloat(this.f21807d, str, f10);
        }
        return f11;
    }

    public JSONArray b(String str, JSONArray jSONArray) {
        JSONArray jSONArray2;
        i5 i5Var = this.f21810g;
        if (i5Var != null) {
            return i5Var.a(str, jSONArray);
        }
        synchronized (this.f21806c) {
            jSONArray2 = JsonUtils.getJSONArray(this.f21805b, str, jSONArray);
        }
        return jSONArray2;
    }

    public void c(String str, long j8) {
        i5 i5Var = this.f21811h;
        if (i5Var != null) {
            i5Var.b(str, j8);
            return;
        }
        synchronized (this.f21808e) {
            JsonUtils.putLong(this.f21807d, str, j8);
        }
    }

    public int a(String str, int i5) {
        int i10;
        i5 i5Var = this.f21811h;
        if (i5Var != null) {
            return i5Var.a(str, i5);
        }
        synchronized (this.f21808e) {
            i10 = JsonUtils.getInt(this.f21807d, str, i5);
        }
        return i10;
    }

    public long b(String str, long j8) {
        long j10;
        i5 i5Var = this.f21810g;
        if (i5Var != null) {
            return i5Var.a(str, j8);
        }
        synchronized (this.f21806c) {
            j10 = JsonUtils.getLong(this.f21805b, str, j8);
        }
        return j10;
    }

    public void c(String str, String str2) {
        i5 i5Var = this.f21811h;
        if (i5Var != null) {
            i5Var.b(str, str2);
            return;
        }
        synchronized (this.f21808e) {
            JsonUtils.putString(this.f21807d, str, str2);
        }
    }

    public JSONArray a(String str, JSONArray jSONArray) {
        JSONArray jSONArray2;
        i5 i5Var = this.f21811h;
        if (i5Var != null) {
            return i5Var.a(str, jSONArray);
        }
        synchronized (this.f21808e) {
            jSONArray2 = JsonUtils.getJSONArray(this.f21807d, str, jSONArray);
        }
        return jSONArray2;
    }

    public String b(String str, String str2) {
        String string;
        i5 i5Var = this.f21810g;
        if (i5Var != null) {
            return i5Var.a(str, str2);
        }
        synchronized (this.f21806c) {
            string = JsonUtils.getString(this.f21805b, str, str2);
        }
        return string;
    }

    public String c() {
        return a(MediationMetaData.KEY_NAME, (String) null);
    }

    public JSONObject a(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        i5 i5Var = this.f21811h;
        if (i5Var != null) {
            return i5Var.a(str, jSONObject);
        }
        synchronized (this.f21808e) {
            jSONObject2 = JsonUtils.getJSONObject(this.f21807d, str, jSONObject);
        }
        return jSONObject2;
    }

    public String b() {
        return a("class", (String) null);
    }

    public List b(String str) {
        List listOptList;
        List listOptList2;
        if (str != null) {
            i5 i5Var = this.f21810g;
            if (i5Var != null) {
                listOptList = i5Var.b(str, Collections.EMPTY_LIST);
            } else {
                listOptList = JsonUtils.optList(b(str, new JSONArray()), Collections.EMPTY_LIST);
            }
            i5 i5Var2 = this.f21811h;
            if (i5Var2 != null) {
                listOptList2 = i5Var2.b(str, Collections.EMPTY_LIST);
            } else {
                listOptList2 = JsonUtils.optList(a(str, new JSONArray()), Collections.EMPTY_LIST);
            }
            ArrayList arrayList = new ArrayList(listOptList2.size() + listOptList.size());
            arrayList.addAll(listOptList);
            arrayList.addAll(listOptList2);
            return arrayList;
        }
        throw new IllegalArgumentException("No key specified");
    }

    public long a(String str, long j8) {
        long j10;
        i5 i5Var = this.f21811h;
        if (i5Var != null) {
            return i5Var.a(str, j8);
        }
        synchronized (this.f21808e) {
            j10 = JsonUtils.getLong(this.f21807d, str, j8);
        }
        return j10;
    }

    public String a(String str, String str2) {
        String string;
        i5 i5Var = this.f21811h;
        if (i5Var != null) {
            return i5Var.a(str, str2);
        }
        synchronized (this.f21808e) {
            string = JsonUtils.getString(this.f21807d, str, str2);
        }
        return string;
    }

    public void a(String str, Object obj) {
        i5 i5Var = this.f21811h;
        if (i5Var != null) {
            i5Var.a(str, obj);
            return;
        }
        synchronized (this.f21808e) {
            JsonUtils.putObject(this.f21807d, str, obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Bundle a(i5 i5Var) {
        return JsonUtils.toBundle(i5Var.a("server_parameters", (JSONObject) null));
    }

    public String a(String str) {
        String strA = a(str, "");
        return StringUtils.isValidString(strA) ? strA : b(str, "");
    }
}
