package com.applovin.impl;

import android.app.ActivityManager;
import android.net.Uri;
import android.os.SystemClock;
import com.applovin.impl.AbstractC1668v;
import com.applovin.impl.e6;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.v4;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.unity3d.ads.core.data.datasource.AndroidTcfDataSource;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class u5 extends j5 {

    /* renamed from: j, reason: collision with root package name */
    private static final AtomicBoolean f23335j = new AtomicBoolean();

    /* renamed from: g, reason: collision with root package name */
    private final int f23336g;

    /* renamed from: h, reason: collision with root package name */
    private final Object f23337h;

    /* renamed from: i, reason: collision with root package name */
    private b f23338i;

    public interface b {
        void a(JSONObject jSONObject);
    }

    public class c extends j5 {
        public c(com.applovin.impl.sdk.k kVar) {
            super("TaskTimeoutFetchBasicSettings", kVar, true);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (u5.this.f23338i != null) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f21768c.b(this.f21767b, "Timing out fetch basic settings...");
                }
                u5.this.a(new JSONObject());
            }
        }
    }

    public u5(int i5, com.applovin.impl.sdk.k kVar, b bVar) {
        super("TaskFetchBasicSettings", kVar, true);
        this.f23337h = new Object();
        this.f23336g = i5;
        this.f23338i = bVar;
    }

    private HashMap b(String str) {
        return a(str, 0L, 0, null, null);
    }

    private String f() {
        return AbstractC1659r0.a((String) this.f21766a.a(y4.f23874p0), "5.0/i", b());
    }

    private String g() {
        return AbstractC1659r0.a((String) this.f21766a.a(y4.f23866o0), "5.0/i", b());
    }

    public JSONObject e() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            com.applovin.impl.sdk.k kVar = this.f21766a;
            y4 y4Var = y4.f23556A5;
            if (((Boolean) kVar.a(y4Var)).booleanValue() || ((Boolean) this.f21766a.a(y4Var)).booleanValue()) {
                jSONObject.put("rid", UUID.randomUUID().toString());
            }
            jSONObject.put("sdk_version", AppLovinSdk.VERSION);
            JsonUtils.putStringIfValid(jSONObject, "ad_review_sdk_version", C1643j.b());
            jSONObject.put("init_count", this.f23336g);
            jSONObject.put("server_installed_at", this.f21766a.a(y4.f23865o));
            if (this.f21766a.D0()) {
                jSONObject.put("first_install", true);
            }
            if (!this.f21766a.A0()) {
                jSONObject.put("first_install_v2", true);
            }
            JsonUtils.putStringIfValid(jSONObject, "process_name", o7.c(a()));
            JsonUtils.putBooleanIfValid(jSONObject, "is_main_process", o7.i(a()));
            JsonUtils.putStringIfValid(jSONObject, "plugin_version", (String) this.f21766a.a(y4.f23676Q3));
            JsonUtils.putStringIfValid(jSONObject, "mediation_provider", this.f21766a.V());
            JsonUtils.putStringIfValid(jSONObject, "mediation_provider_v2", this.f21766a.C());
            jSONObject.put("installed_mediation_adapters", w3.b(this.f21766a));
            Map mapF = this.f21766a.A().F();
            jSONObject.put("package_name", mapF.get("package_name"));
            jSONObject.put("app_version", mapF.get("app_version"));
            jSONObject.put("debug", mapF.get("debug"));
            jSONObject.put("tg", mapF.get("tg"));
            jSONObject.put("target_sdk", mapF.get("target_sdk"));
            jSONObject.put("session_id", mapF.get("session_id"));
            List list = (List) mapF.get("application_start_info");
            if (!CollectionUtils.isEmpty(list)) {
                JsonUtils.putJsonArray(jSONObject, "application_start_info", new JSONArray((Collection) list));
            }
            List list2 = (List) mapF.get("application_exit_info");
            if (!CollectionUtils.isEmpty(list2)) {
                JsonUtils.putJsonArray(jSONObject, "application_exit_info", new JSONArray((Collection) list2));
            }
            List<String> adUnitIds = this.f21766a.J() != null ? this.f21766a.J().getAdUnitIds() : null;
            if (adUnitIds != null && adUnitIds.size() > 0) {
                List<String> listRemoveTrimmedEmptyStrings = CollectionUtils.removeTrimmedEmptyStrings(adUnitIds);
                jSONObject.put("ad_unit_ids", CollectionUtils.implode(listRemoveTrimmedEmptyStrings, listRemoveTrimmedEmptyStrings.size()));
            }
            jSONObject.put(AndroidTcfDataSource.TCF_TCSTRING_KEY, mapF.get(AndroidTcfDataSource.TCF_TCSTRING_KEY));
            jSONObject.put("IABTCF_gdprApplies", mapF.get("IABTCF_gdprApplies"));
            Object obj = mapF.get("IABTCF_AddtlConsent");
            if (obj instanceof String) {
                JsonUtils.putStringIfValid(jSONObject, "IABTCF_AddtlConsent", (String) obj);
            }
            jSONObject.put("consent_flow_info", this.f21766a.x().b());
            Map mapM = this.f21766a.A().M();
            jSONObject.put("platform", mapM.get("platform"));
            jSONObject.put("os", mapM.get("os"));
            jSONObject.put("locale", mapM.get("locale"));
            jSONObject.put("brand", mapM.get("brand"));
            jSONObject.put("brand_name", mapM.get("brand_name"));
            jSONObject.put("hardware", mapM.get("hardware"));
            jSONObject.put("model", mapM.get("model"));
            jSONObject.put("revision", mapM.get("revision"));
            jSONObject.put("is_tablet", mapM.get("is_tablet"));
            jSONObject.put("screen_size_in", mapM.get("screen_size_in"));
            jSONObject.put("supported_abis", mapM.get("supported_abis"));
            Object obj2 = mapM.get("video_decoders");
            if (obj2 != null) {
                jSONObject.put("video_decoders", obj2);
            }
            if (((Boolean) this.f21766a.a(y4.f23761b4)).booleanValue()) {
                jSONObject.put("mtl", this.f21766a.n0().getLastTrimMemoryLevel());
            }
            try {
                ActivityManager activityManager = (ActivityManager) com.applovin.impl.sdk.k.o().getSystemService("activity");
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                if (activityManager != null) {
                    activityManager.getMemoryInfo(memoryInfo);
                    jSONObject.put("fm", memoryInfo.availMem);
                    jSONObject.put("tm", memoryInfo.totalMem);
                    jSONObject.put("lmt", memoryInfo.threshold);
                    jSONObject.put("lm", memoryInfo.lowMemory);
                }
            } catch (Throwable unused) {
            }
            AbstractC1668v.a aVarF = this.f21766a.A().f();
            jSONObject.put("dnt", aVarF.c());
            jSONObject.put("dnt_code", aVarF.b().b());
            Boolean boolB = AbstractC1656p0.c().b(a());
            if (((Boolean) this.f21766a.a(y4.f23638L3)).booleanValue() && StringUtils.isValidString(aVarF.a()) && !Boolean.TRUE.equals(boolB)) {
                jSONObject.put("idfa", aVarF.a());
            }
            l.b bVarG = this.f21766a.A().G();
            if (((Boolean) this.f21766a.a(y4.f23584E3)).booleanValue() && bVarG != null && !Boolean.TRUE.equals(boolB)) {
                jSONObject.put("idfv", bVarG.f23088a);
                jSONObject.put("idfv_scope", bVarG.f23089b);
            }
            if (((Boolean) this.f21766a.a(y4.f23608H3)).booleanValue()) {
                jSONObject.put("compass_random_token", this.f21766a.u());
            }
            if (((Boolean) this.f21766a.a(y4.f23623J3)).booleanValue()) {
                jSONObject.put("applovin_random_token", this.f21766a.i0());
            }
            if (((Boolean) this.f21766a.a(y4.f23653N3)).booleanValue()) {
                JsonUtils.putStringIfValid(jSONObject, "art", this.f21766a.r());
            }
            JsonUtils.putStringIfValid(jSONObject, "eventid", this.f21766a.E());
            if (this.f21766a.t0().c()) {
                jSONObject.put("test_mode", true);
            }
            List listB = this.f21766a.t0().b();
            if (listB != null && !listB.isEmpty()) {
                jSONObject.put("test_mode_networks", listB);
            }
            jSONObject.put("sdk_extra_parameters", new JSONObject(this.f21766a.o0().getExtraParameters()));
            Map mapL0 = this.f21766a.l0();
            if (!CollectionUtils.isEmpty(mapL0)) {
                jSONObject.put("segments", new JSONObject(mapL0));
            }
        } catch (JSONException e7) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21768c.a(this.f21767b, "Failed to create JSON body", e7);
            }
            this.f21766a.D().a(this.f21767b, "createJSONBody", e7);
        }
        return jSONObject;
    }

    public Map h() {
        HashMap map = new HashMap();
        if (!((Boolean) this.f21766a.a(y4.f23563B5)).booleanValue() && !((Boolean) this.f21766a.a(y4.f23556A5)).booleanValue()) {
            map.put("rid", UUID.randomUUID().toString());
        }
        if (!((Boolean) this.f21766a.a(y4.f23844l5)).booleanValue()) {
            map.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f21766a.j0());
        }
        CollectionUtils.putStringIfValid("connectEventKey", this.f21766a.q(), map);
        Boolean boolB = AbstractC1656p0.b().b(a());
        if (boolB != null) {
            map.put("huc", boolB.toString());
        }
        Boolean boolB2 = AbstractC1656p0.c().b(a());
        if (boolB2 != null) {
            map.put("aru", boolB2.toString());
        }
        Boolean boolB3 = AbstractC1656p0.a().b(a());
        if (boolB3 != null) {
            map.put("dns", boolB3.toString());
        }
        return map;
    }

    @Override // java.lang.Runnable
    public void run() throws JSONException {
        if (!AbstractC1654o0.j() && f23335j.compareAndSet(false, true)) {
            try {
                D7.a.a(com.applovin.impl.sdk.k.o());
            } catch (Throwable th) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f21768c.a(this.f21767b, "Cannot update security provider", th);
                }
            }
        }
        this.f21766a.w0().d(d2.f21315f, b(g()));
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        com.applovin.impl.sdk.network.a aVarA = com.applovin.impl.sdk.network.a.a(this.f21766a).b(g()).a(f()).b(h()).a(e()).b(((Boolean) this.f21766a.a(y4.f23647M5)).booleanValue()).c("POST").a((Object) new JSONObject()).a(((Integer) this.f21766a.a(y4.f23809h3)).intValue()).b(((Integer) this.f21766a.a(y4.f23834k3)).intValue()).c(((Integer) this.f21766a.a(y4.f23800g3)).intValue()).e(((Boolean) this.f21766a.a(y4.f23910t3)).booleanValue()).a(v4.a.a(((Integer) this.f21766a.a(y4.f23887q5)).intValue())).f(true).a();
        this.f21766a.r0().a(new c(this.f21766a), e6.b.TIMEOUT, ((Integer) this.f21766a.a(r3)).intValue() + 250);
        a aVar = new a(aVarA, this.f21766a, d(), jElapsedRealtime);
        aVar.c(y4.f23866o0);
        aVar.b(y4.f23874p0);
        this.f21766a.r0().a(aVar);
    }

    public class a extends m6 {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ long f23339m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar, boolean z2, long j8) {
            super(aVar, kVar, z2);
            this.f23339m = j8;
        }

        @Override // com.applovin.impl.m6, com.applovin.impl.C1658q0.e
        public void a(String str, JSONObject jSONObject, int i5) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f23339m;
            u5.this.a(jSONObject);
            this.f21766a.w0().d(d2.f21317g, u5.this.a(str, jElapsedRealtime, i5, jSONObject, null));
        }

        @Override // com.applovin.impl.m6, com.applovin.impl.C1658q0.e
        public void a(String str, int i5, String str2, JSONObject jSONObject) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21768c.b(this.f21767b, "Unable to fetch basic SDK settings: server returned " + i5);
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f23339m;
            u5.this.a(jSONObject != null ? jSONObject : new JSONObject());
            this.f21766a.w0().d(d2.f21319h, u5.this.a(str, jElapsedRealtime, i5, jSONObject, str2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HashMap a(String str, long j8, int i5, JSONObject jSONObject, String str2) {
        Uri uriBuild = Uri.parse(str).buildUpon().clearQuery().build();
        JSONObject jSONObject2 = new JSONObject();
        JsonUtils.putString(jSONObject2, "domain", uriBuild.getHost());
        if (jSONObject != null) {
            JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "signal_providers", null);
            JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "auto_init_adapters", null);
            if (jSONArray != null) {
                JsonUtils.putInt(jSONObject2, "signal_provider_count", jSONArray.length());
            }
            if (jSONArray2 != null) {
                JsonUtils.putInt(jSONObject2, "auto_init_adapter_count", jSONArray2.length());
            }
        }
        HashMap map = new HashMap();
        map.put("attempt_number", Integer.toString(this.f23336g));
        map.put("error_message", str2);
        map.put("url", uriBuild.toString());
        map.put("details", jSONObject2.toString());
        map.put("duration_ms", Long.toString(j8));
        map.put("code", Integer.toString(i5));
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject) {
        b bVar;
        synchronized (this.f23337h) {
            bVar = this.f23338i;
            this.f23338i = null;
        }
        if (bVar != null) {
            bVar.a(jSONObject);
        }
    }
}
