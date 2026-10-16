package com.applovin.impl;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import cb.AbstractC1593a;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdWaterfallInfo;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.sdk.AppLovinSdkUtils;
import j$.util.Objects;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class y2 extends k3 implements MaxAd {
    private final AtomicBoolean k;

    /* renamed from: l, reason: collision with root package name */
    private final AtomicBoolean f23541l;

    /* renamed from: m, reason: collision with root package name */
    private final a3 f23542m;

    /* renamed from: n, reason: collision with root package name */
    protected com.applovin.impl.mediation.h f23543n;

    /* renamed from: o, reason: collision with root package name */
    private final String f23544o;

    /* renamed from: p, reason: collision with root package name */
    private MaxAdWaterfallInfo f23545p;

    /* renamed from: q, reason: collision with root package name */
    private long f23546q;

    /* renamed from: r, reason: collision with root package name */
    private String f23547r;

    /* renamed from: s, reason: collision with root package name */
    private String f23548s;

    public y2(a3 a3Var, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.mediation.h hVar, com.applovin.impl.sdk.k kVar) {
        super(a3Var.e(), jSONObject, jSONObject2, kVar);
        this.k = new AtomicBoolean();
        this.f23541l = new AtomicBoolean();
        this.f23542m = a3Var;
        this.f23543n = hVar;
        this.f23544o = hVar != null ? hVar.b() : null;
    }

    private long H() {
        return a("load_started_time_ms", 0L);
    }

    public static y2 a(a3 a3Var, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.k kVar) {
        String string = JsonUtils.getString(jSONObject2, "ad_format", null);
        MaxAdFormat fromString = MaxAdFormat.formatFromString(string);
        Objects.requireNonNull(fromString, "Invalid ad format for string: " + string);
        if (fromString.isAdViewAd()) {
            return new b3(a3Var, jSONObject, jSONObject2, kVar);
        }
        if (fromString == MaxAdFormat.NATIVE) {
            return new d3(a3Var, jSONObject, jSONObject2, kVar);
        }
        if (fromString.isFullscreenAd()) {
            return new c3(a3Var, jSONObject, jSONObject2, kVar);
        }
        throw new IllegalArgumentException(R8.v.f("Unsupported ad format: ", string));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ JSONObject b(i5 i5Var) {
        return JsonUtils.deepCopy(i5Var.a("ad_values", new JSONObject()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bundle c(i5 i5Var) {
        JSONObject jSONObjectN;
        if (i5Var.a("credentials")) {
            jSONObjectN = AbstractC1593a.n("credentials", i5Var);
        } else {
            jSONObjectN = AbstractC1593a.n("server_parameters", i5Var);
            JsonUtils.putString(jSONObjectN, "placement_id", P());
        }
        return JsonUtils.toBundle(jSONObjectN);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ JSONObject d(i5 i5Var) {
        return JsonUtils.deepCopy(i5Var.a("publisher_extra_info", new JSONObject()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double e(i5 i5Var) {
        return Double.valueOf(JsonUtils.getDouble(i5Var.a("revenue_parameters", (JSONObject) null), "revenue", -1.0d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ JSONObject f(i5 i5Var) {
        return JsonUtils.deepCopy(i5Var.a("revenue_parameters", new JSONObject()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String g(i5 i5Var) {
        return JsonUtils.getString(i5Var.a("revenue_parameters", (JSONObject) null), "precision", "");
    }

    public com.applovin.impl.mediation.h A() {
        return this.f23543n;
    }

    public String B() {
        return a("bcode", "");
    }

    public long C() {
        return a("bid_expiration_ms", BundleUtils.getLong("bid_expiration_ms", -1L, l()));
    }

    public String D() {
        return a("bid_response", (String) null);
    }

    public Bundle E() {
        JSONObject jSONObjectA;
        i5 i5Var = this.f21811h;
        if (i5Var != null) {
            return (Bundle) i5Var.a(new G(this, 7));
        }
        if (c("credentials")) {
            jSONObjectA = a("credentials", new JSONObject());
        } else {
            jSONObjectA = a("server_parameters", new JSONObject());
            JsonUtils.putString(jSONObjectA, "placement_id", P());
        }
        return JsonUtils.toBundle(jSONObjectA);
    }

    public long F() {
        if (H() > 0) {
            return G() - H();
        }
        return -1L;
    }

    public long G() {
        return a("load_completed_time_ms", 0L);
    }

    public String I() {
        return this.f23547r;
    }

    public int J() {
        return a("mspc", ((Integer) this.f21804a.a(r3.f22713l8)).intValue());
    }

    public JSONObject K() {
        i5 i5Var = this.f21811h;
        return i5Var != null ? (JSONObject) i5Var.a(new Z0(3)) : a("publisher_extra_info", new JSONObject());
    }

    public a3 L() {
        return this.f23542m;
    }

    public String M() {
        return JsonUtils.getString(N(), "revenue_event", "");
    }

    public JSONObject N() {
        i5 i5Var = this.f21811h;
        return i5Var != null ? (JSONObject) i5Var.a(new Z0(0)) : a("revenue_parameters", new JSONObject());
    }

    public String O() {
        return b("event_id", "");
    }

    public String P() {
        return a("third_party_ad_placement_id", (String) null);
    }

    public List Q() {
        return b("mwf_info_urls");
    }

    public String R() {
        return b("waterfall_name", "");
    }

    public String S() {
        return b("waterfall_test_name", "");
    }

    public boolean T() {
        return StringUtils.isValidString(D());
    }

    public boolean U() {
        com.applovin.impl.mediation.h hVar = this.f23543n;
        return hVar != null && hVar.k() && this.f23543n.j();
    }

    public boolean V() {
        return a("only_load_when_initialized", Boolean.FALSE).booleanValue();
    }

    public boolean W() {
        return a("prefer_load_when_initialized", Boolean.TRUE).booleanValue();
    }

    public void X() {
        c("load_completed_time_ms", SystemClock.elapsedRealtime());
    }

    public void Y() {
        c("load_started_time_ms", SystemClock.elapsedRealtime());
    }

    public Boolean Z() {
        return a("destroy_on_ui_thread", (Boolean) null);
    }

    public abstract y2 a(com.applovin.impl.mediation.h hVar);

    public Boolean a0() {
        return a("load_on_ui_thread", (Boolean) null);
    }

    public Boolean b0() {
        return a("show_on_ui_thread", (Boolean) null);
    }

    @Override // com.applovin.mediation.MaxAd
    public String getAdReviewCreativeId() {
        return this.f23548s;
    }

    @Override // com.applovin.mediation.MaxAd
    public String getAdValue(String str) {
        return getAdValue(str, null);
    }

    @Override // com.applovin.mediation.MaxAd
    public String getCreativeId() {
        return a("creative_id", (String) null);
    }

    @Override // com.applovin.mediation.MaxAd
    public String getDspId() {
        return a("dsp_id", (String) null);
    }

    @Override // com.applovin.mediation.MaxAd
    public String getDspName() {
        return a("dsp_name", (String) null);
    }

    @Override // com.applovin.mediation.MaxAd
    public MaxAdFormat getFormat() {
        return MaxAdFormat.formatFromString(a("ad_format", b("ad_format", (String) null)));
    }

    @Override // com.applovin.mediation.MaxAd
    public MaxNativeAd getNativeAd() {
        com.applovin.impl.mediation.h hVar = this.f23543n;
        if (hVar != null) {
            return hVar.e();
        }
        return null;
    }

    @Override // com.applovin.mediation.MaxAd
    public String getNetworkName() {
        return a("network_name", "");
    }

    @Override // com.applovin.mediation.MaxAd
    public String getNetworkPlacement() {
        return StringUtils.emptyIfNull(P());
    }

    @Override // com.applovin.mediation.MaxAd
    public long getRequestLatencyMillis() {
        return this.f23546q;
    }

    @Override // com.applovin.mediation.MaxAd
    public double getRevenue() {
        if (!((Boolean) this.f21804a.a(r3.f22718q8)).booleanValue() || !getFormat().isFullscreenAd() || u().get()) {
            i5 i5Var = this.f21811h;
            return i5Var != null ? ((Double) i5Var.a(new Z0(2))).doubleValue() : JsonUtils.getDouble(a("revenue_parameters", (JSONObject) null), "revenue", -1.0d);
        }
        this.f21804a.O();
        if (!com.applovin.impl.sdk.o.a()) {
            return 0.0d;
        }
        this.f21804a.O().b("MediatedAd", "Attempting to retrieve revenue when not available yet");
        return 0.0d;
    }

    @Override // com.applovin.mediation.MaxAd
    public String getRevenuePrecision() {
        i5 i5Var = this.f21811h;
        return i5Var != null ? (String) i5Var.a(new Z0(1)) : JsonUtils.getString(a("revenue_parameters", (JSONObject) null), "precision", "");
    }

    @Override // com.applovin.mediation.MaxAd
    public AppLovinSdkUtils.Size getSize() {
        int iA = a("ad_width", -3);
        int iA2 = a("ad_height", -3);
        return (iA == -3 || iA2 == -3) ? getFormat().getSize() : new AppLovinSdkUtils.Size(iA, iA2);
    }

    @Override // com.applovin.mediation.MaxAd
    public MaxAdWaterfallInfo getWaterfall() {
        return this.f23545p;
    }

    public void h(String str) {
        this.f23548s = str;
    }

    public void i(String str) {
        this.f23547r = str;
    }

    @Override // com.applovin.impl.k3
    public String toString() {
        return "MediatedAd{thirdPartyAdPlacementId=" + P() + ", adUnitId=" + getAdUnitId() + ", format=" + getFormat().getLabel() + ", networkName='" + getNetworkName() + "'}";
    }

    public String z() {
        return this.f23544o;
    }

    @Override // com.applovin.mediation.MaxAd
    public String getAdValue(String str, String str2) {
        JSONObject jSONObjectX = x();
        if (jSONObjectX.has(str)) {
            return JsonUtils.getString(jSONObjectX, str, str2);
        }
        Bundle bundleL = l();
        if (bundleL.containsKey(str)) {
            return bundleL.getString(str);
        }
        JSONObject jSONObjectK = K();
        return jSONObjectK.has(str) ? JsonUtils.getString(jSONObjectK, str, str2) : a(str, str2);
    }

    public void t() {
        this.f23543n = null;
        this.f23545p = null;
    }

    public AtomicBoolean u() {
        return this.k;
    }

    public String v() {
        return a("adomain", (String) null);
    }

    public AtomicBoolean w() {
        return this.f23541l;
    }

    public JSONObject x() {
        i5 i5Var = this.f21811h;
        return i5Var != null ? (JSONObject) i5Var.a(new V1.c(29)) : a("ad_values", new JSONObject());
    }

    public View y() {
        com.applovin.impl.mediation.h hVar;
        if (!U() || (hVar = this.f23543n) == null) {
            return null;
        }
        return hVar.d();
    }

    public void a(MaxAdWaterfallInfo maxAdWaterfallInfo) {
        this.f23545p = maxAdWaterfallInfo;
    }

    public void a(long j8) {
        this.f23546q = j8;
    }

    public void a(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null || jSONObject.length() == 0) {
            return;
        }
        JSONObject jSONObjectK = K();
        JsonUtils.putAll(jSONObjectK, jSONObject);
        a("publisher_extra_info", (Object) jSONObjectK);
    }

    public void a(Bundle bundle) throws JSONException {
        if (bundle == null) {
            return;
        }
        if (bundle.containsKey("creative_id") && !c("creative_id")) {
            c("creative_id", BundleUtils.getString("creative_id", bundle));
        }
        if (bundle.containsKey("ad_width") && !c("ad_width") && bundle.containsKey("ad_height") && !c("ad_height")) {
            int i5 = BundleUtils.getInt("ad_width", bundle);
            int i10 = BundleUtils.getInt("ad_height", bundle);
            c("ad_width", i5);
            c("ad_height", i10);
        }
        if (bundle.containsKey("publisher_extra_info")) {
            a(BundleUtils.toJSONObject(bundle.getBundle("publisher_extra_info")));
        }
    }
}
