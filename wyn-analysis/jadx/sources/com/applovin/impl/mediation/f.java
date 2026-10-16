package com.applovin.impl.mediation;

import android.app.Activity;
import com.applovin.impl.a5;
import com.applovin.impl.d2;
import com.applovin.impl.e6;
import com.applovin.impl.f2;
import com.applovin.impl.j6;
import com.applovin.impl.k3;
import com.applovin.impl.l1;
import com.applovin.impl.l5;
import com.applovin.impl.r3;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t4;
import com.applovin.mediation.adapter.MaxAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f22200a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f22201b;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f22202c = new AtomicBoolean();

    /* renamed from: d, reason: collision with root package name */
    private final Set f22203d = new HashSet();

    /* renamed from: e, reason: collision with root package name */
    private final Object f22204e = new Object();

    /* renamed from: f, reason: collision with root package name */
    private final JSONArray f22205f = new JSONArray();

    /* renamed from: g, reason: collision with root package name */
    private final LinkedHashMap f22206g = new LinkedHashMap();

    /* renamed from: h, reason: collision with root package name */
    private final Object f22207h = new Object();

    /* renamed from: i, reason: collision with root package name */
    private final Map f22208i = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    private final Map f22209j = new HashMap();
    private final Object k = new Object();

    /* renamed from: l, reason: collision with root package name */
    private List f22210l;

    public f(com.applovin.impl.sdk.k kVar) {
        this.f22200a = kVar;
        this.f22201b = kVar.O();
    }

    public void a(Activity activity) {
        if (this.f22202c.compareAndSet(false, true)) {
            String str = (String) this.f22200a.a(a5.f20937G);
            if (StringUtils.isValidString(str)) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    List<k3> listA = a(JsonUtils.getJSONArray(jSONObject, this.f22200a.t0().c() ? "test_mode_auto_init_adapters" : "auto_init_adapters", new JSONArray()), jSONObject);
                    this.f22210l = listA;
                    for (k3 k3Var : listA) {
                        this.f22208i.put(k3Var.b(), k3Var);
                    }
                    long j8 = StringUtils.parseLong(this.f22200a.o0().getExtraParameters().get("adapter_initialization_delay_ms"), -1L);
                    l5 l5Var = new l5(listA, activity, this.f22200a);
                    if (j8 > 0) {
                        this.f22200a.r0().a(l5Var, e6.b.MEDIATION, j8);
                    } else {
                        this.f22200a.r0().a(l5Var);
                    }
                } catch (JSONException e7) {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f22201b.a("MediationAdapterInitializationManager", "Failed to parse auto-init adapters JSON", e7);
                    }
                    l1.a((Throwable) e7);
                }
            }
        }
    }

    public boolean c() {
        return this.f22202c.get();
    }

    private void c(k3 k3Var) {
        String strB = k3Var.b();
        synchronized (this.f22204e) {
            try {
                if (this.f22203d.contains(strB)) {
                    return;
                }
                this.f22203d.add(strB);
                this.f22200a.P().d(d2.f21307b0, f2.a(k3Var));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public JSONArray b() {
        JSONArray jSONArrayShallowCopy;
        synchronized (this.f22207h) {
            jSONArrayShallowCopy = JsonUtils.shallowCopy(this.f22205f);
        }
        return jSONArrayShallowCopy;
    }

    public boolean b(k3 k3Var) {
        boolean zContainsKey;
        synchronized (this.f22207h) {
            zContainsKey = this.f22206g.containsKey(k3Var.b());
        }
        return zContainsKey;
    }

    public t4 a(k3 k3Var, Activity activity) {
        k3 k3VarA = a(k3Var);
        if (k3VarA == null) {
            return t4.a("AdapterInitialization:" + k3Var.c(), MaxAdapter.InitializationStatus.DOES_NOT_APPLY);
        }
        String strB = k3Var.b();
        synchronized (this.k) {
            try {
                t4 t4Var = (t4) this.f22209j.get(strB);
                if (t4Var == null || (t4Var.d() && k3VarA.q())) {
                    final t4 t4Var2 = new t4("AdapterInitialization:" + k3Var.c());
                    this.f22209j.put(strB, t4Var2);
                    h hVarA = this.f22200a.T().a(k3VarA);
                    if (hVarA == null) {
                        t4Var2.a("Adapter implementation not found");
                        return t4Var2;
                    }
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f22201b.d("MediationAdapterInitializationManager", "Initializing adapter " + k3VarA);
                    }
                    c(k3VarA);
                    hVarA.a(MaxAdapterParametersImpl.a(k3VarA), activity, new MaxAdapter.OnCompletionListener() { // from class: com.applovin.impl.mediation.m
                        @Override // com.applovin.mediation.adapter.MaxAdapter.OnCompletionListener
                        public final void onCompletion(MaxAdapter.InitializationStatus initializationStatus, String str) {
                            f.a(t4Var2, initializationStatus, str);
                        }
                    });
                    j6.a(k3VarA.m(), t4Var2, "The adapter (" + k3Var.c() + ") timed out initializing", "MediationAdapterInitializationManager", this.f22200a);
                    return t4Var2;
                }
                return t4Var;
            } finally {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(t4 t4Var, MaxAdapter.InitializationStatus initializationStatus, String str) {
        if (initializationStatus != null && initializationStatus != MaxAdapter.InitializationStatus.INITIALIZING) {
            if (initializationStatus == MaxAdapter.InitializationStatus.INITIALIZED_FAILURE) {
                t4Var.a(str);
                return;
            } else {
                t4Var.b(initializationStatus);
                return;
            }
        }
        l1.a("Adapters should never report a null or INITIALIZING status.", new Object[0]);
        t4Var.a("Adapter reported INITIALIZING");
    }

    private k3 a(k3 k3Var) {
        List<k3> list;
        if (((Boolean) this.f22200a.a(r3.f22675A8)).booleanValue()) {
            k3 k3Var2 = (k3) this.f22208i.get(k3Var.b());
            return k3Var2 != null ? k3Var2 : k3Var;
        }
        if (!this.f22200a.t0().c() || (list = this.f22210l) == null) {
            return k3Var;
        }
        for (k3 k3Var3 : list) {
            if (k3Var3.b().equals(k3Var.b())) {
                return k3Var3;
            }
        }
        return null;
    }

    public Integer a(String str) {
        Integer num;
        synchronized (this.f22207h) {
            num = (Integer) this.f22206g.get(str);
        }
        return num;
    }

    public Set a() {
        HashSet hashSet;
        synchronized (this.f22207h) {
            hashSet = new HashSet(this.f22206g.keySet());
        }
        return hashSet;
    }

    public void a(k3 k3Var, long j8, MaxAdapter.InitializationStatus initializationStatus, String str) {
        boolean zB;
        if (initializationStatus == null || initializationStatus == MaxAdapter.InitializationStatus.INITIALIZING) {
            return;
        }
        synchronized (this.f22207h) {
            try {
                zB = b(k3Var);
                if (!zB) {
                    this.f22206g.put(k3Var.b(), Integer.valueOf(initializationStatus.getCode()));
                    JSONObject jSONObject = new JSONObject();
                    JsonUtils.putString(jSONObject, "class", k3Var.b());
                    JsonUtils.putString(jSONObject, "init_status", String.valueOf(initializationStatus.getCode()));
                    JsonUtils.putLong(jSONObject, "init_time_ms", j8);
                    JsonUtils.putString(jSONObject, "error_message", JSONObject.quote(str));
                    this.f22205f.put(jSONObject);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zB) {
            return;
        }
        this.f22200a.a(k3Var);
        this.f22200a.X().processAdapterInitializationPostback(k3Var, j8, initializationStatus, str);
        this.f22200a.t().a(initializationStatus, k3Var.b());
    }

    private List a(JSONArray jSONArray, JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i5 = 0; i5 < jSONArray.length(); i5++) {
            arrayList.add(new k3(Collections.EMPTY_MAP, JsonUtils.getJSONObject(jSONArray, i5, (JSONObject) null), jSONObject, this.f22200a));
        }
        return arrayList;
    }

    public void a(MaxAdapter.InitializationStatus initializationStatus) {
        synchronized (this.f22207h) {
            this.f22206g.put("com.applovin.mediation.adapters.AppLovinMediationAdapter", Integer.valueOf(initializationStatus.getCode()));
        }
        this.f22200a.t().a(initializationStatus, "com.applovin.mediation.adapters.AppLovinMediationAdapter");
    }
}
