package com.applovin.impl;

import android.content.Context;
import android.provider.Settings;
import com.applovin.impl.e6;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t3;
import com.applovin.impl.v4;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class w5 extends j5 {

    /* renamed from: g, reason: collision with root package name */
    private final a3 f23474g;

    /* renamed from: h, reason: collision with root package name */
    private final JSONArray f23475h;

    /* renamed from: i, reason: collision with root package name */
    private final Context f23476i;

    /* renamed from: j, reason: collision with root package name */
    private final a.InterfaceC0014a f23477j;

    public w5(a3 a3Var, JSONArray jSONArray, Context context, com.applovin.impl.sdk.k kVar, a.InterfaceC0014a interfaceC0014a) {
        super("TaskFetchMediatedAd", kVar, a3Var.b());
        this.f23474g = a3Var;
        this.f23475h = jSONArray;
        this.f23476i = context;
        this.f23477j = interfaceC0014a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(JSONObject jSONObject) {
        try {
            AbstractC1659r0.c(jSONObject, this.f21766a);
            AbstractC1659r0.b(jSONObject, this.f21766a);
            AbstractC1659r0.a(jSONObject, this.f21766a);
            l3.f(jSONObject, this.f21766a);
            l3.d(jSONObject, this.f21766a);
            l3.e(jSONObject, this.f21766a);
            l3.g(jSONObject, this.f21766a);
            this.f21766a.m().a();
            MaxAdFormat maxAdFormatA = this.f23474g.a();
            MaxAdFormat fromString = MaxAdFormat.formatFromString(JsonUtils.getString(jSONObject, "ad_format", null));
            if (maxAdFormatA == fromString) {
                a(jSONObject);
                return;
            }
            String strB = this.f23474g.b();
            if (fromString == null) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f21768c.b(this.f21767b, "Mediated ad response is missing the ad format field for ad unit " + strB);
                }
                if (jSONObject.has("ads")) {
                    HashMap map = new HashMap(3);
                    CollectionUtils.putStringIfValid("details", "Missing ad format field", map);
                    CollectionUtils.putStringIfValid("ad_unit_id", strB, map);
                    CollectionUtils.putStringIfValid("mcode", JsonUtils.getString(jSONObject, "mcode", ""), map);
                    this.f21766a.D().a(d2.f21306a1, this.f21767b, map);
                }
                this.f23477j.onAdLoadFailed(strB, MaxAdapterError.NO_FILL);
                return;
            }
            String label = fromString.getLabel();
            String label2 = maxAdFormatA.getLabel();
            String str = "Incorrect format (" + label + ") loaded for (" + label2 + ") ad. Please verify if the ad unit ID (" + strB + ") is assigned to the correct ad format.";
            if (o7.a(maxAdFormatA, fromString)) {
                com.applovin.impl.sdk.o.j(this.f21767b, str);
                a(jSONObject);
                return;
            }
            l1.a(str, new Object[0]);
            com.applovin.impl.sdk.o.h(this.f21767b, str);
            this.f23477j.onAdLoadFailed(strB, new MaxAdapterError(MaxAdapterError.INVALID_CONFIGURATION, 0, str));
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("ad_unit_id", strB);
            CollectionUtils.putStringIfValid(MediationMetaData.KEY_NAME, label2, mapHashMap);
            CollectionUtils.putStringIfValid("details", label, mapHashMap);
            this.f21766a.D().a(d2.f21291S0, "incompatible_ad_format", mapHashMap);
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21768c.a(this.f21767b, "Unable to process mediated ad response for ad unit " + this.f23474g.b(), th);
            }
            throw new RuntimeException("Unable to process ad: " + th);
        }
    }

    private void c(JSONObject jSONObject) throws JSONException {
        JSONObject andResetCustomPostBodyData = this.f21766a.X().getAndResetCustomPostBodyData();
        if (andResetCustomPostBodyData == null || !o7.h(com.applovin.impl.sdk.k.o())) {
            return;
        }
        JsonUtils.putAll(jSONObject, andResetCustomPostBodyData);
    }

    private void d(JSONObject jSONObject) throws JSONException {
        if (((Boolean) this.f21766a.a(y4.f23654N4)).booleanValue()) {
            u3 u3VarY = this.f21766a.Y();
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            s3 s3Var = s3.f22768f;
            JsonUtils.putAll(jSONObject3, (Map<String, ?>) u3VarY.a(s3Var, t3.a.AD_UNIT_ID));
            JsonUtils.putJSONObject(jSONObject2, "arpau", jSONObject3);
            JSONObject jSONObject4 = new JSONObject();
            JsonUtils.putAll(jSONObject4, (Map<String, ?>) u3VarY.a(s3Var, t3.a.AD_FORMAT));
            JsonUtils.putJSONObject(jSONObject2, "arpaf", jSONObject4);
            JSONObject jSONObject5 = new JSONObject();
            JsonUtils.putAll(jSONObject5, (Map<String, ?>) u3VarY.a(s3.f22769g, t3.a.AD));
            JsonUtils.putJSONObject(jSONObject2, "ttdasipa_ms", jSONObject5);
            JsonUtils.putJSONObject(jSONObject, "mediation_stats", jSONObject2);
        }
    }

    private String e() {
        return l3.a(this.f21766a);
    }

    private String f() {
        return l3.b(this.f21766a);
    }

    private JSONObject g() throws JSONException, Settings.SettingNotFoundException {
        Map mapA = this.f21766a.A().a((Map) null, false, true);
        mapA.putAll(this.f23474g.c());
        JSONObject jSONObject = new JSONObject(mapA);
        e(jSONObject);
        h(jSONObject);
        f(jSONObject);
        c(jSONObject);
        g(jSONObject);
        d(jSONObject);
        return jSONObject;
    }

    private Map h() {
        HashMap map = new HashMap(4);
        map.put("AppLovin-Ad-Unit-Id", this.f23474g.b());
        map.put("AppLovin-Ad-Format", this.f23474g.a().getLabel());
        Map mapD = this.f23474g.d();
        CollectionUtils.putObjectToStringIfValid("AppLovin-Retry-Attempt", mapD.get("retry_attempt"), map);
        CollectionUtils.putObjectToStringIfValid("AppLovin-Retry-Delay-Sec", mapD.get("retry_delay_sec"), map);
        return map;
    }

    @Override // java.lang.Runnable
    public void run() {
        w5 w5Var;
        MaxAdFormat maxAdFormatA = this.f23474g.a();
        String strB = this.f23474g.b();
        if (com.applovin.impl.sdk.o.a()) {
            this.f21768c.a(this.f21767b, "Fetching next ad for " + maxAdFormatA.getLabel() + " ad unit " + strB);
        }
        k2.a();
        if (((Boolean) this.f21766a.a(y4.f23739Y3)).booleanValue() && o7.j() && com.applovin.impl.sdk.o.a()) {
            this.f21768c.a(this.f21767b, "User is connected to a VPN");
        }
        this.f21766a.P().a(d2.f21318g0, maxAdFormatA, strB, (MaxError) null);
        if (((Boolean) this.f21766a.a(y4.f23654N4)).booleanValue()) {
            u3 u3VarY = this.f21766a.Y();
            s3 s3Var = s3.f22768f;
            u3VarY.a(s3Var, t3.a(strB));
            u3VarY.a(s3Var, t3.a(maxAdFormatA));
        }
        o7.a(this.f21766a, this.f21767b);
        try {
            JSONObject jSONObjectG = g();
            HashMap map = new HashMap();
            if (!((Boolean) this.f21766a.a(y4.f23570C5)).booleanValue() && !((Boolean) this.f21766a.a(y4.f23556A5)).booleanValue()) {
                map.put("rid", UUID.randomUUID().toString());
            }
            if (!((Boolean) this.f21766a.a(y4.f23844l5)).booleanValue()) {
                map.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f21766a.j0());
            }
            if (this.f21766a.t0().c()) {
                map.put("test_mode", UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
            }
            List listB = this.f21766a.t0().b();
            String str = this.f21766a.o0().getExtraParameters().get("fan");
            if (listB != null && !listB.isEmpty()) {
                StringBuilder sb2 = new StringBuilder();
                Iterator it = listB.iterator();
                if (it.hasNext()) {
                    CharSequence charSequence = (CharSequence) it.next();
                    while (true) {
                        sb2.append(charSequence);
                        if (!it.hasNext()) {
                            break;
                        }
                        sb2.append((CharSequence) ",");
                        charSequence = (CharSequence) it.next();
                    }
                }
                String string = sb2.toString();
                map.put("filter_ad_network", string);
                if (!this.f21766a.t0().c()) {
                    map.put("fhkZsVqYC7", UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
                }
                if (this.f21766a.t0().d()) {
                    map.put("force_ad_network", string);
                }
            } else if (StringUtils.isValidString(str)) {
                map.put("filter_ad_network", str);
            }
            w5Var = this;
            try {
                a aVar = w5Var.new a(com.applovin.impl.sdk.network.a.a(this.f21766a).c("POST").a(h()).b(f()).a(e()).b(map).a(jSONObjectG).b(((Boolean) this.f21766a.a(r3.f22681D8)).booleanValue()).a((Object) new JSONObject()).c(((Long) this.f21766a.a(r3.f22731x7)).intValue()).a(((Integer) this.f21766a.a(y4.f23760b3)).intValue()).b(((Long) this.f21766a.a(r3.f22729w7)).intValue()).a(v4.a.a(((Integer) this.f21766a.a(y4.f23896r5)).intValue())).f(true).a(), this.f21766a, strB, maxAdFormatA);
                aVar.c(r3.f22725u7);
                aVar.b(r3.f22727v7);
                w5Var.f21766a.r0().a(aVar);
            } catch (Throwable th) {
                th = th;
                if (com.applovin.impl.sdk.o.a()) {
                    w5Var.f21768c.a(w5Var.f21767b, "Unable to fetch ad for Ad Unit ID: " + strB, th);
                }
                a("", 0, th.getMessage());
            }
        } catch (Throwable th2) {
            th = th2;
            w5Var = this;
        }
    }

    public class a extends m6 {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ String f23478m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ MaxAdFormat f23479n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar, String str, MaxAdFormat maxAdFormat) {
            super(aVar, kVar);
            this.f23478m = str;
            this.f23479n = maxAdFormat;
        }

        @Override // com.applovin.impl.m6, com.applovin.impl.C1658q0.e
        public void a(String str, JSONObject jSONObject, int i5) {
            if (i5 != 200) {
                w5.this.a(str, i5, (String) null);
                return;
            }
            JsonUtils.putLong(jSONObject, "ad_fetch_latency_millis", this.f21935l.a());
            JsonUtils.putLong(jSONObject, "ad_fetch_response_size", this.f21935l.b());
            HashMap map = new HashMap(6);
            CollectionUtils.putStringIfValid("url", StringUtils.getHost(str), map);
            CollectionUtils.putStringIfValid("code", String.valueOf(i5), map);
            CollectionUtils.putStringIfValid("ad_unit_id", this.f23478m, map);
            CollectionUtils.putStringIfValid("ad_format", this.f23479n.getLabel(), map);
            CollectionUtils.putStringIfValid("latency_ms", String.valueOf(this.f21935l.a()), map);
            CollectionUtils.putStringIfValid("response_size", String.valueOf(this.f21935l.b()), map);
            this.f21766a.P().d(d2.f21320h0, map);
            w5.this.b(jSONObject);
        }

        @Override // com.applovin.impl.m6, com.applovin.impl.C1658q0.e
        public void a(String str, int i5, String str2, JSONObject jSONObject) {
            w5.this.a(str, i5, str2);
            this.f21766a.D().a("fetchMediatedAd", str, i5, str2);
        }
    }

    private void e(JSONObject jSONObject) throws JSONException {
        String strB = this.f23474g.b();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("ad_unit_id", strB);
        jSONObject2.put("ad_format", this.f23474g.a().getLabel());
        Map map = CollectionUtils.map(this.f23474g.d());
        com.applovin.impl.sdk.p pVarA0 = this.f21766a.a0();
        CollectionUtils.putStringIfValid("previous_request_id", pVarA0.b(strB), map);
        CollectionUtils.putStringIfValid("previous_loaded_request_id", pVarA0.a(strB), map);
        p.a aVarC = pVarA0.c(strB);
        if (aVarC != null) {
            if (Boolean.parseBoolean(this.f21766a.o0().getExtraParameters().get("esc"))) {
                map.put("previous_winning_network", "APPLOVIN_NETWORK");
                map.put("previous_winning_network_name", "AppLovin");
            } else {
                map.put("previous_winning_network", aVarC.a());
                map.put("previous_winning_network_name", aVarC.c());
            }
            if (this.f21766a.R() != null) {
                Queue<y2> queueC = this.f21766a.R().c(strB);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (y2 y2Var : queueC) {
                    arrayList.add(y2Var.c());
                    arrayList2.add(y2Var.getNetworkName());
                }
                StringBuilder sb2 = new StringBuilder();
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    while (true) {
                        sb2.append((CharSequence) it.next());
                        if (!it.hasNext()) {
                            break;
                        } else {
                            sb2.append((CharSequence) ",");
                        }
                    }
                }
                CollectionUtils.putStringIfValid("queued_ad_networks", sb2.toString(), map);
                StringBuilder sb3 = new StringBuilder();
                Iterator it2 = arrayList2.iterator();
                if (it2.hasNext()) {
                    while (true) {
                        sb3.append((CharSequence) it2.next());
                        if (!it2.hasNext()) {
                            break;
                        } else {
                            sb3.append((CharSequence) ",");
                        }
                    }
                }
                CollectionUtils.putStringIfValid("queued_ad_network_names", sb3.toString(), map);
            }
        }
        jSONObject2.put("extra_parameters", CollectionUtils.toJson(map));
        jSONObject.put("ad_info", jSONObject2);
    }

    private void f(JSONObject jSONObject) throws JSONException {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("disabled", new JSONArray(this.f21766a.T().a()));
            jSONObject2.put("installed", w3.b(this.f21766a));
            jSONObject2.put("initialized", this.f21766a.S().b());
            jSONObject2.put("initialized_classnames", new JSONArray((Collection) this.f21766a.S().a()));
            jSONObject2.put("loaded_classnames", new JSONArray(this.f21766a.T().c()));
            jSONObject2.put("failed_classnames", new JSONArray(this.f21766a.T().b()));
            jSONObject.put("adapters_info", jSONObject2);
        } catch (Exception e7) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21768c.a(this.f21767b, "Failed to populate adapter classNames", e7);
            }
            throw new RuntimeException("Failed to populate classNames: " + e7);
        }
    }

    private void a(JSONObject jSONObject) {
        g6 g6Var = new g6(this.f23474g, jSONObject, this.f23476i, this.f21766a, this.f23477j);
        long j8 = JsonUtils.getLong(jSONObject, "process_waterfall_delay_ms", -1L);
        if (j8 > 0) {
            this.f21766a.r0().a(g6Var, e6.b.MEDIATION, j8, true);
        } else {
            this.f21766a.r0().a(g6Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, int i5, String str2) {
        MaxErrorImpl maxErrorImpl;
        String strB = this.f23474g.b();
        if (com.applovin.impl.sdk.o.a()) {
            this.f21768c.b(this.f21767b, "Unable to fetch ad for ad unit " + strB + ": server returned " + i5);
        }
        if (i5 == -1009) {
            maxErrorImpl = new MaxErrorImpl(-1009, str2);
        } else if (i5 == -1001) {
            maxErrorImpl = new MaxErrorImpl(-1001, str2);
        } else if (StringUtils.isValidString(str2)) {
            maxErrorImpl = new MaxErrorImpl(-1000, str2);
        } else {
            maxErrorImpl = new MaxErrorImpl(-1);
        }
        HashMap map = new HashMap(5);
        CollectionUtils.putStringIfValid("url", StringUtils.getHost(str), map);
        CollectionUtils.putStringIfValid("code", String.valueOf(i5), map);
        CollectionUtils.putStringIfValid("error_message", str2, map);
        CollectionUtils.putStringIfValid("ad_unit_id", strB, map);
        CollectionUtils.putStringIfValid("ad_format", this.f23474g.a().getLabel(), map);
        this.f21766a.P().d(d2.f21322i0, map);
        t2.a(this.f23477j, strB, maxErrorImpl);
    }

    private void h(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = this.f23475h;
        if (jSONArray != null) {
            jSONObject.put("signal_data", jSONArray);
        }
    }

    private void g(JSONObject jSONObject) throws JSONException {
        JsonUtils.putObject(jSONObject, "sdk_extra_parameters", new JSONObject(this.f21766a.o0().getExtraParameters()));
    }
}
