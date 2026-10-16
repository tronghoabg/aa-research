package com.applovin.impl.sdk;

import android.os.Bundle;
import android.provider.Settings;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorPublisher;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.C1643j;
import com.applovin.impl.C1652n0;
import com.applovin.impl.communicator.CommunicatorMessageImpl;
import com.applovin.impl.e6;
import com.applovin.impl.i7;
import com.applovin.impl.j5;
import com.applovin.impl.o7;
import com.applovin.impl.sdk.network.d;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.w3;
import com.applovin.impl.y2;
import com.applovin.impl.y4;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import ka.AbstractC3256n;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class j implements AppLovinCommunicatorSubscriber, AppLovinCommunicatorPublisher {

    /* renamed from: a, reason: collision with root package name */
    private final k f22984a;

    /* renamed from: b, reason: collision with root package name */
    private final AppLovinCommunicator f22985b;

    public j(k kVar) {
        this.f22984a = kVar;
        AppLovinCommunicator appLovinCommunicator = AppLovinCommunicator.getInstance(k.o());
        this.f22985b = appLovinCommunicator;
        if (((Boolean) kVar.a(y4.f23881p7)).booleanValue()) {
            appLovinCommunicator.a(kVar);
            appLovinCommunicator.subscribe(this, i7.f21742a);
        }
    }

    public void a(JSONObject jSONObject, boolean z2) {
        if (b("safedk_init") && C1643j.c()) {
            Bundle bundle = new Bundle();
            bundle.putString(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f22984a.j0());
            bundle.putString("applovin_random_token", this.f22984a.i0());
            bundle.putString("compass_random_token", this.f22984a.u());
            bundle.putString("device_type", AppLovinSdkUtils.isTablet(k.o()) ? "tablet" : "phone");
            bundle.putString("init_success", String.valueOf(z2));
            bundle.putParcelableArrayList("installed_mediation_adapters", JsonUtils.toBundle(w3.b(this.f22984a)));
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "communicator_settings", (JSONObject) null);
            Bundle bundle2 = (Bundle) bundle.clone();
            bundle2.putString("user_id", this.f22984a.x0().e());
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONObject2, "safedk_settings", new JSONObject());
            if (!((Boolean) this.f22984a.a(y4.f23889q7)).booleanValue()) {
                JSONObject jSONObject4 = new JSONObject();
                JsonUtils.putBoolean(jSONObject4, "deactivated", true);
                JsonUtils.putJSONObject(jSONObject3, "safeDKDeactivation", jSONObject4);
            }
            bundle2.putBundle("settings", JsonUtils.toBundle(jSONObject3));
            this.f22984a.O();
            if (o.a()) {
                this.f22984a.O().a("CommunicatorService", "Sending \"safedk_init\" message: " + bundle);
            }
            a(bundle2, "safedk_init");
        }
    }

    public void b(String str, String str2) {
        if (b("user_info") && C1643j.c()) {
            Bundle bundle = new Bundle(2);
            bundle.putString("user_id", StringUtils.emptyIfNull(str));
            bundle.putString("applovin_random_token", str2);
            a(bundle, "user_info");
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "applovin_sdk";
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) throws Settings.SettingNotFoundException {
        Map<String, Object> map;
        long j8;
        int i5;
        long j10;
        Map<String, Object> map2;
        if (((Boolean) this.f22984a.a(y4.f23881p7)).booleanValue()) {
            if ("send_http_request".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                Bundle messageData = appLovinCommunicatorMessage.getMessageData();
                Map<String, String> stringMap = BundleUtils.toStringMap(messageData.getBundle("query_params"));
                Map<String, Object> map3 = BundleUtils.toMap(messageData.getBundle("post_body"));
                Map<String, String> stringMap2 = BundleUtils.toStringMap(messageData.getBundle("headers"));
                String string = messageData.getString("id", "");
                if (!map3.containsKey(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY)) {
                    map3.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f22984a.j0());
                }
                this.f22984a.f0().e(new d.b().d(messageData.getString("url")).a(messageData.getString("backup_url")).b(stringMap).c(map3).a(stringMap2).a(((Boolean) this.f22984a.a(y4.f23844l5)).booleanValue()).b(string).a());
                return;
            }
            if (!"send_http_request_v2".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                if ("set_ad_request_query_params".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                    this.f22984a.k().addCustomQueryParams(o7.a((Map) BundleUtils.toMap(appLovinCommunicatorMessage.getMessageData())));
                    return;
                } else if ("set_ad_request_post_body".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                    this.f22984a.k().setCustomPostBody(BundleUtils.toJSONObject(appLovinCommunicatorMessage.getMessageData()));
                    return;
                } else {
                    if ("set_mediate_request_post_body_data".equalsIgnoreCase(appLovinCommunicatorMessage.getTopic())) {
                        this.f22984a.X().setCustomPostBodyData(BundleUtils.toJSONObject(appLovinCommunicatorMessage.getMessageData()));
                        return;
                    }
                    return;
                }
            }
            Bundle messageData2 = appLovinCommunicatorMessage.getMessageData();
            String string2 = messageData2.getString("http_method", "POST");
            long millis = messageData2.containsKey("timeout_sec") ? TimeUnit.SECONDS.toMillis(messageData2.getLong("timeout_sec")) : ((Long) this.f22984a.a(y4.f23869o3)).longValue();
            int i10 = messageData2.getInt("retry_count", ((Integer) this.f22984a.a(y4.f23877p3)).intValue());
            long millis2 = messageData2.containsKey("retry_delay_sec") ? TimeUnit.SECONDS.toMillis(messageData2.getLong("retry_delay_sec")) : ((Long) this.f22984a.a(y4.f23886q3)).longValue();
            Map<String, String> stringMap3 = BundleUtils.toStringMap(messageData2.getBundle("query_params"));
            if ("GET".equalsIgnoreCase(string2)) {
                if (messageData2.getBoolean("include_data_collector_info", true)) {
                    map2 = null;
                    stringMap3.putAll(BundleUtils.toStringMap(CollectionUtils.toBundle(this.f22984a.A().a((Map) null, false, false))));
                } else {
                    map2 = null;
                }
                j8 = millis;
                i5 = i10;
                j10 = millis2;
                map = map2;
            } else {
                map = BundleUtils.toMap(messageData2.getBundle("post_body"));
                if (messageData2.getBoolean("include_data_collector_info", true)) {
                    Map mapF = this.f22984a.A().F();
                    Map mapP = this.f22984a.A().p();
                    j10 = millis2;
                    if (mapP.containsKey("idfv") && mapP.containsKey("idfv_scope")) {
                        i5 = i10;
                        String str = (String) mapP.get("idfv");
                        j8 = millis;
                        Integer num = (Integer) mapP.get("idfv_scope");
                        num.getClass();
                        mapP.remove("idfv");
                        mapP.remove("idfv_scope");
                        mapF.put("idfv", str);
                        mapF.put("idfv_scope", num);
                    } else {
                        j8 = millis;
                        i5 = i10;
                    }
                    mapF.put("server_installed_at", this.f22984a.a(y4.f23865o));
                    mapF.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f22984a.j0());
                    map.put("app", mapF);
                    map.put("device", mapP);
                } else {
                    j8 = millis;
                    i5 = i10;
                    j10 = millis2;
                }
            }
            this.f22984a.r0().a((j5) new C1652n0(appLovinCommunicatorMessage.getPublisherId(), com.applovin.impl.sdk.network.a.a(this.f22984a).b(messageData2.getString("url")).a(messageData2.getString("backup_url")).b(stringMap3).c(string2).a((Map) BundleUtils.toStringMap(messageData2.getBundle("headers"))).a(map != null ? new JSONObject(map) : null).c((int) j8).a(i5).b((int) j10).a((Object) new JSONObject()).a(messageData2.getBoolean("is_encoding_enabled", false)).a(), this.f22984a), e6.b.OTHER);
        }
    }

    public void b(y2 y2Var, String str) {
        if (b("max_ad_events")) {
            Bundle bundleA = a(y2Var);
            bundleA.putString("type", str);
            this.f22984a.O();
            if (o.a()) {
                this.f22984a.O().a("CommunicatorService", "Sending \"max_ad_events\" message: " + bundleA);
            }
            a(bundleA, "max_ad_events");
        }
    }

    public void b(y2 y2Var) {
        if (b("max_revenue_events")) {
            Bundle bundleA = a(y2Var);
            bundleA.putAll(JsonUtils.toBundle(y2Var.N()));
            bundleA.putString("country_code", this.f22984a.v().getCountryCode());
            a(bundleA, "max_revenue_events");
        }
    }

    public void b(List list) {
        if (b("test_mode_networks_updated")) {
            if (list == null || list.isEmpty()) {
                a(Bundle.EMPTY, "test_mode_networks_updated");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("test_mode_networks", new ArrayList<>(list));
            a(bundle, "test_mode_networks_updated");
        }
    }

    public void a(y2 y2Var, String str) {
        if (b("ad_callback_blocked_after_hidden")) {
            Bundle bundleA = a(y2Var);
            bundleA.putString("callback_name", str);
            a(bundleA, "ad_callback_blocked_after_hidden");
        }
    }

    private boolean b(String str) {
        if (((Boolean) this.f22984a.a(y4.f23881p7)).booleanValue()) {
            return this.f22984a.c(y4.o7).contains(str) || this.f22985b.hasSubscriber(str);
        }
        return false;
    }

    public void a(MaxAdapter.InitializationStatus initializationStatus, String str) {
        if (b("adapter_initialization_status")) {
            Bundle bundleB = AbstractC3256n.b("adapter_class", str);
            bundleB.putInt("init_status", initializationStatus.getCode());
            a(bundleB, "adapter_initialization_status");
        }
    }

    public void a() {
        if (b("privacy_setting_updated")) {
            a(new Bundle(), "privacy_setting_updated");
        }
    }

    public void a(String str, String str2) {
        if (b("network_sdk_version_updated")) {
            Bundle bundle = new Bundle();
            bundle.putString("adapter_class", str2);
            bundle.putString("sdk_version", str);
            a(bundle, "network_sdk_version_updated");
        }
    }

    public void a(List list) {
        if (b("live_networks_updated")) {
            if (list == null || list.isEmpty()) {
                a(Bundle.EMPTY, "live_networks_updated");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("live_networks", new ArrayList<>(list));
            a(bundle, "live_networks_updated");
        }
    }

    public void a(String str, String str2, String str3) {
        if (b("responses")) {
            String strMaybeConvertToIndentedString = JsonUtils.maybeConvertToIndentedString(str3, 2);
            String strMaybeConvertToIndentedString2 = JsonUtils.maybeConvertToIndentedString(str, 2);
            Bundle bundle = new Bundle();
            bundle.putString("request_url", str2);
            bundle.putString("request_body", strMaybeConvertToIndentedString);
            bundle.putString("response", strMaybeConvertToIndentedString2);
            a(bundle, "responses");
        }
    }

    public void a(String str, String str2, int i5, Object obj, String str3, boolean z2) {
        if (b("receive_http_response")) {
            Bundle bundle = new Bundle();
            bundle.putString("id", str);
            bundle.putString("url", str2);
            bundle.putInt("code", i5);
            bundle.putBundle("body", JsonUtils.toBundle(obj));
            bundle.putBoolean("success", z2);
            BundleUtils.putString("error_message", str3, bundle);
            a(bundle, "receive_http_response");
        }
    }

    public void a(Bundle bundle, String str) {
        if (b(str)) {
            this.f22985b.getMessagingService().publish(CommunicatorMessageImpl.create(bundle, str, this, this.f22984a.c(y4.o7).contains(str)));
        }
    }

    public boolean a(String str) {
        return i7.f21742a.contains(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.os.Bundle a(com.applovin.impl.y2 r5) {
        /*
            r4 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = r5.O()
            java.lang.String r2 = "id"
            r0.putString(r2, r1)
            java.lang.String r1 = r5.c()
            java.lang.String r2 = "network_name"
            r0.putString(r2, r1)
            java.lang.String r1 = r5.getAdUnitId()
            java.lang.String r2 = "max_ad_unit_id"
            r0.putString(r2, r1)
            java.lang.String r1 = r5.P()
            java.lang.String r2 = "third_party_ad_placement_id"
            r0.putString(r2, r1)
            com.applovin.mediation.MaxAdFormat r1 = r5.getFormat()
            java.lang.String r1 = r1.getLabel()
            java.lang.String r2 = "ad_format"
            r0.putString(r2, r1)
            java.lang.String r1 = r5.getCreativeId()
            java.lang.String r2 = "creative_id"
            com.applovin.impl.sdk.utils.BundleUtils.putStringIfValid(r2, r1, r0)
            java.lang.String r1 = r5.v()
            java.lang.String r2 = "adomain"
            com.applovin.impl.sdk.utils.BundleUtils.putStringIfValid(r2, r1, r0)
            java.lang.String r1 = r5.getDspName()
            java.lang.String r2 = "dsp_name"
            com.applovin.impl.sdk.utils.BundleUtils.putStringIfValid(r2, r1, r0)
            java.lang.String r1 = r5.c()
            java.lang.String r2 = "CUSTOM_NETWORK_SDK"
            boolean r1 = r2.equalsIgnoreCase(r1)
            if (r1 == 0) goto L66
            java.lang.String r1 = r5.getNetworkName()
            java.lang.String r2 = "custom_sdk_network_name"
            r0.putString(r2, r1)
        L66:
            org.json.JSONObject r1 = r5.x()
            android.os.Bundle r1 = com.applovin.impl.sdk.utils.JsonUtils.toBundle(r1)
            r0.putAll(r1)
            boolean r1 = r5 instanceof com.applovin.impl.h3
            java.lang.String r2 = "ad_view"
            java.lang.String r3 = "N/A"
            if (r1 == 0) goto Lab
            boolean r1 = r5 instanceof com.applovin.impl.b3
            if (r1 == 0) goto L84
            com.applovin.impl.b3 r5 = (com.applovin.impl.b3) r5
            android.view.View r5 = r5.y()
            goto La1
        L84:
            boolean r1 = r5 instanceof com.applovin.impl.d3
            if (r1 == 0) goto La0
            com.applovin.impl.d3 r5 = (com.applovin.impl.d3) r5
            boolean r1 = r5.q0()
            if (r1 != 0) goto La0
            com.applovin.mediation.nativeAds.MaxNativeAdView r1 = r5.l0()
            if (r1 == 0) goto L9b
            com.applovin.mediation.nativeAds.MaxNativeAdView r5 = r5.l0()
            goto La1
        L9b:
            android.view.ViewGroup r5 = r5.m0()
            goto La1
        La0:
            r5 = 0
        La1:
            if (r5 == 0) goto La7
            java.lang.String r3 = com.applovin.impl.f8.a(r5)
        La7:
            r0.putString(r2, r3)
            return r0
        Lab:
            boolean r1 = r5 instanceof com.applovin.impl.c3
            if (r1 == 0) goto Lcf
            com.applovin.impl.c3 r5 = (com.applovin.impl.c3) r5
            android.os.Bundle r5 = r5.j0()
            java.lang.String r1 = "applovin_ad_view_info"
            android.os.Bundle r5 = r5.getBundle(r1)
            java.lang.String r1 = "ad_view_address"
            java.lang.String r1 = com.applovin.impl.sdk.utils.BundleUtils.getString(r1, r3, r5)
            r0.putString(r2, r1)
            java.lang.String r1 = "video_view_address"
            java.lang.String r5 = com.applovin.impl.sdk.utils.BundleUtils.getString(r1, r3, r5)
            java.lang.String r1 = "video_view"
            r0.putString(r1, r5)
        Lcf:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.j.a(com.applovin.impl.y2):android.os.Bundle");
    }
}
