package com.bytedance.sdk.openadsdk.wrv.uef;

import com.bytedance.sdk.openadsdk.core.oyt;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class xs extends com.bytedance.sdk.component.uef.moa<JSONObject, JSONObject> {

    /* renamed from: oa, reason: collision with root package name */
    private final String f26192oa;
    private final oyt uef;

    public xs(String str, oyt oytVar) {
        this.uef = oytVar;
        this.f26192oa = str;
    }

    public static void uef(com.bytedance.sdk.component.uef.wk wkVar, oyt oytVar) {
        wkVar.uef("appInfo", new xs("appInfo", oytVar));
        wkVar.uef("adInfo", new xs("adInfo", oytVar));
        wkVar.uef("sendLog", new xs("sendLog", oytVar));
        wkVar.uef("playable_style", new xs("playable_style", oytVar));
        wkVar.uef("getTemplateInfo", new xs("getTemplateInfo", oytVar));
        wkVar.uef("getTeMaiAds", new xs("getTeMaiAds", oytVar));
        wkVar.uef("isViewable", new xs("isViewable", oytVar));
        wkVar.uef("getScreenSize", new xs("getScreenSize", oytVar));
        wkVar.uef("getCloseButtonInfo", new xs("getCloseButtonInfo", oytVar));
        wkVar.uef("getVolume", new xs("getVolume", oytVar));
        wkVar.uef("removeLoading", new xs("removeLoading", oytVar));
        wkVar.uef("sendReward", new xs("sendReward", oytVar));
        wkVar.uef("subscribe_app_ad", new xs("subscribe_app_ad", oytVar));
        wkVar.uef("download_app_ad", new xs("download_app_ad", oytVar));
        wkVar.uef("cancel_download_app_ad", new xs("cancel_download_app_ad", oytVar));
        wkVar.uef("unsubscribe_app_ad", new xs("unsubscribe_app_ad", oytVar));
        wkVar.uef("landscape_click", new xs("landscape_click", oytVar));
        wkVar.uef("clickEvent", new xs("clickEvent", oytVar));
        wkVar.uef("renderDidFinish", new xs("renderDidFinish", oytVar));
        wkVar.uef("dynamicTrack", new xs("dynamicTrack", oytVar));
        wkVar.uef("skipVideo", new xs("skipVideo", oytVar));
        wkVar.uef("muteVideo", new xs("muteVideo", oytVar));
        wkVar.uef("changeVideoState", new xs("changeVideoState", oytVar));
        wkVar.uef("getCurrentVideoState", new xs("getCurrentVideoState", oytVar));
        wkVar.uef("send_temai_product_ids", new xs("send_temai_product_ids", oytVar));
        wkVar.uef("getMaterialMeta", new xs("getMaterialMeta", oytVar));
        wkVar.uef("endcard_load", new xs("endcard_load", oytVar));
        wkVar.uef("pauseWebView", new xs("pauseWebView", oytVar));
        wkVar.uef("pauseWebViewTimers", new xs("pauseWebViewTimers", oytVar));
        wkVar.uef("webview_time_track", new xs("webview_time_track", oytVar));
        wkVar.uef("openPrivacy", new xs("openPrivacy", oytVar));
        wkVar.uef("openAdLandPageLinks", new xs("openAdLandPageLinks", oytVar));
        wkVar.uef("getNativeSiteCustomData", new xs("getNativeSiteCustomData", oytVar));
        wkVar.uef("close", new xs("close", oytVar));
    }

    @Override // com.bytedance.sdk.component.uef.moa
    public JSONObject uef(String str, JSONObject jSONObject, com.bytedance.sdk.component.uef.lw lwVar) throws Exception {
        oyt.oa oaVar = new oyt.oa();
        oaVar.uef = "call";
        oaVar.yo = this.f26192oa;
        oaVar.moa = jSONObject;
        return this.uef.uef(oaVar, 3);
    }
}
