package com.applovin.impl;

import Va.M6;
import android.content.Context;
import com.applovin.impl.d5;
import com.applovin.impl.e6;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxError;
import com.applovin.sdk.AppLovinSdkUtils;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class q5 extends j5 {

    /* renamed from: j, reason: collision with root package name */
    private static JSONObject f22608j;
    private static final Object k = new Object();

    /* renamed from: l, reason: collision with root package name */
    private static final Map f22609l = M6.v();

    /* renamed from: g, reason: collision with root package name */
    private final a3 f22610g;

    /* renamed from: h, reason: collision with root package name */
    private final Context f22611h;

    /* renamed from: i, reason: collision with root package name */
    private final b f22612i;

    public interface b {
        void a(JSONArray jSONArray);
    }

    public static class c implements d5.a, Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final b f22613a;

        /* renamed from: b, reason: collision with root package name */
        private final Object f22614b;

        /* renamed from: c, reason: collision with root package name */
        private int f22615c;

        /* renamed from: d, reason: collision with root package name */
        private final AtomicBoolean f22616d;

        /* renamed from: e, reason: collision with root package name */
        private final Collection f22617e;

        /* renamed from: f, reason: collision with root package name */
        private final com.applovin.impl.sdk.k f22618f;

        /* renamed from: g, reason: collision with root package name */
        private final com.applovin.impl.sdk.o f22619g;

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            if (this.f22616d.compareAndSet(false, true)) {
                a();
            }
        }

        private c(int i5, b bVar, com.applovin.impl.sdk.k kVar) {
            this.f22615c = i5;
            this.f22613a = bVar;
            this.f22618f = kVar;
            this.f22619g = kVar.O();
            this.f22614b = new Object();
            this.f22617e = new ArrayList(i5);
            this.f22616d = new AtomicBoolean();
        }

        @Override // com.applovin.impl.d5.a
        public void a(d5 d5Var) throws JSONException {
            boolean z2;
            synchronized (this.f22614b) {
                this.f22617e.add(d5Var);
                int i5 = this.f22615c - 1;
                this.f22615c = i5;
                z2 = i5 < 1;
            }
            if (z2 && this.f22616d.compareAndSet(false, true)) {
                if (o7.h() && ((Boolean) this.f22618f.a(y4.f23664P)).booleanValue()) {
                    this.f22618f.r0().a((j5) new s6(this.f22618f, "handleSignalCollectionCompleted", new D0(this, 1)), e6.b.MEDIATION);
                } else {
                    a();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a() throws JSONException {
            ArrayList arrayList;
            synchronized (this.f22614b) {
                arrayList = new ArrayList(this.f22617e);
            }
            JSONArray jSONArray = new JSONArray();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                d5 d5Var = (d5) it.next();
                try {
                    JSONObject jSONObject = new JSONObject();
                    e5 e5VarF = d5Var.f();
                    jSONObject.put(MediationMetaData.KEY_NAME, e5VarF.c());
                    jSONObject.put("class", e5VarF.b());
                    jSONObject.put("adapter_version", d5Var.a());
                    jSONObject.put("sdk_version", d5Var.d());
                    JSONObject jSONObject2 = new JSONObject();
                    MaxError maxErrorC = d5Var.c();
                    if (maxErrorC != null) {
                        jSONObject2.put("error_message", maxErrorC.getMessage());
                    } else {
                        jSONObject2.put("signal", d5Var.e());
                    }
                    jSONObject2.put("signal_collection_time_ms", d5Var.b());
                    jSONObject2.put("is_cached", d5Var.g());
                    jSONObject.put(JsonStorageKeyNames.DATA_KEY, jSONObject2);
                    jSONArray.put(jSONObject);
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f22619g.a("TaskCollectSignals", "Collected signal from " + e5VarF);
                    }
                } catch (JSONException e7) {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f22619g.a("TaskCollectSignals", "Failed to create signal data", e7);
                    }
                    this.f22618f.D().a("TaskCollectSignals", "createSignalsData", e7);
                }
            }
            a(jSONArray);
        }

        private void a(JSONArray jSONArray) {
            b bVar = this.f22613a;
            if (bVar != null) {
                bVar.a(jSONArray);
            }
        }
    }

    public q5(a3 a3Var, Context context, com.applovin.impl.sdk.k kVar, b bVar) {
        super("TaskCollectSignals", kVar);
        this.f22610g = a3Var;
        this.f22611h = context;
        this.f22612i = bVar;
    }

    private void a(JSONArray jSONArray, JSONObject jSONObject) throws JSONException {
        c cVar = new c(jSONArray.length(), this.f22612i, this.f21766a);
        this.f21766a.r0().a(new s6(this.f21766a, "timeoutCollectSignal", cVar), e6.b.TIMEOUT, ((Long) this.f21766a.a(r3.f22676B7)).longValue());
        for (int i5 = 0; i5 < jSONArray.length(); i5++) {
            a(new e5(this.f22610g, jSONArray.getJSONObject(i5), jSONObject, this.f21766a), cVar);
        }
    }

    private void b(JSONArray jSONArray, JSONObject jSONObject) throws JSONException {
        Set set = (Set) f22609l.get(this.f22610g.b());
        if (set == null || set.isEmpty()) {
            a("No signal providers found for ad unit: " + this.f22610g.b(), (Throwable) null);
            return;
        }
        JSONArray jSONArray2 = new JSONArray();
        for (int i5 = 0; i5 < jSONArray.length(); i5++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i5);
            if (set.contains(JsonUtils.getString(jSONObject2, MediationMetaData.KEY_NAME, null))) {
                jSONArray2.put(jSONObject2);
            }
        }
        a(jSONArray2, jSONObject);
    }

    @Override // java.lang.Runnable
    public void run() {
        JSONArray jSONArray;
        try {
            synchronized (k) {
                jSONArray = JsonUtils.getJSONArray(f22608j, "signal_providers", null);
            }
            if (jSONArray != null && jSONArray.length() > 0) {
                if (f22609l.size() > 0) {
                    b(jSONArray, f22608j);
                    return;
                } else {
                    a(jSONArray, f22608j);
                    return;
                }
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.f21768c.k(this.f21767b, "Unable to find cached signal providers, fetching signal providers from SharedPreferences.");
            }
            JSONObject jSONObject = new JSONObject((String) this.f21766a.a(a5.f20936F, JsonUtils.EMPTY_JSON));
            JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "signal_providers", null);
            if (jSONArray2 != null && jSONArray2.length() != 0) {
                if (f22609l.size() > 0) {
                    b(jSONArray2, jSONObject);
                    return;
                } else {
                    a(jSONArray2, jSONObject);
                    return;
                }
            }
            a("No signal providers found", (Throwable) null);
        } catch (InterruptedException e7) {
            a("Failed to wait for signals", e7);
            this.f21766a.D().a("TaskCollectSignals", "waitForSignals", e7);
        } catch (JSONException e10) {
            a("Failed to parse signals JSON", e10);
            this.f21766a.D().a("TaskCollectSignals", "parseSignalsJSON", e10);
        } catch (Throwable th) {
            a("Failed to collect signals", th);
            this.f21766a.D().a("TaskCollectSignals", "collectSignals", th);
        }
    }

    private void a(e5 e5Var, d5.a aVar) {
        if (e5Var.r()) {
            AppLovinSdkUtils.runOnUiThread(new com.applovin.impl.mediation.ads.f(this, e5Var, aVar, 2));
        } else {
            this.f21766a.X().collectSignal(e5Var, this.f22611h, aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(e5 e5Var, d5.a aVar) {
        this.f21766a.X().collectSignal(e5Var, this.f22611h, aVar);
    }

    private void a(String str, Throwable th) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f21768c.a(this.f21767b, "No signals collected: " + str, th);
        }
        b bVar = this.f22612i;
        if (bVar != null) {
            bVar.a(new JSONArray());
        }
    }

    public static void a(JSONObject jSONObject) {
        synchronized (k) {
            f22608j = jSONObject;
        }
    }

    public static void a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        try {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "ad_unit_signal_providers", (JSONObject) null);
            if (jSONObject2 != null) {
                for (String str : JsonUtils.toList(jSONObject2.names())) {
                    f22609l.put(str, new HashSet(JsonUtils.getList(jSONObject2, str, null)));
                }
            }
        } catch (JSONException e7) {
            com.applovin.impl.sdk.o.c("TaskCollectSignals", "Failed to parse ad unit signal providers for JSON object: " + jSONObject, e7);
            kVar.D().a("TaskCollectSignals", "parseAdUnitSignalProvidersJSON", e7);
        }
    }
}
