package com.bytedance.sdk.openadsdk.wrv.uef;

import com.bytedance.sdk.openadsdk.core.oyt;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class bcc extends com.bytedance.sdk.component.uef.sy<JSONObject, JSONObject> {
    public static final HashSet<String> uef = new HashSet<>(Arrays.asList("appInfo", "adInfo", "sendLog", "playable_style", "getTemplateInfo", "getTeMaiAds", "isViewable", "getScreenSize", "getCloseButtonInfo", "getVolume", "removeLoading", "sendReward", "subscribe_app_ad", "download_app_ad", "cancel_download_app_ad", "unsubscribe_app_ad", "landscape_click", "clickEvent", "renderDidFinish", "dynamicTrack", "skipVideo", "muteVideo", "changeVideoState", "getCurrentVideoState", "send_temai_product_ids", "getMaterialMeta", "endcard_load", "pauseWebView", "pauseWebViewTimers", "webview_time_track", "getDownloadStatus", "openPrivacy", "openAdLandPageLinks", "getNativeSiteCustomData", "close"));

    /* renamed from: oa, reason: collision with root package name */
    private final oyt f26173oa;

    public bcc(oyt oytVar) {
        this.f26173oa = oytVar;
    }

    public static void uef(com.bytedance.sdk.component.uef.wk wkVar, oyt oytVar) {
        wkVar.uef(uef, new bcc(oytVar));
    }

    @Override // com.bytedance.sdk.component.uef.moa
    public JSONObject uef(String str, JSONObject jSONObject, com.bytedance.sdk.component.uef.lw lwVar) throws Exception {
        oyt.oa oaVar = new oyt.oa();
        oaVar.uef = "call";
        oaVar.yo = str;
        oaVar.moa = jSONObject;
        return this.f26173oa.uef(oaVar, 3);
    }
}
