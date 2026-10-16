package com.moloco.sdk.internal.client_metrics_data;

import ic.d;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a[] f28494b;

    /* renamed from: a, reason: collision with root package name */
    public final String f28495a;

    static {
        a[] aVarArr = {new a("SDKInitAttempt", 0, "sdk_init_attempt"), new a("SDKInitSuccess", 1, "sdk_init_success"), new a("SDKInitFailure", 2, "sdk_init_failure"), new a("SDKPerformInitAttempt", 3, "sdk_perform_init_attempt"), new a("SDKFetchInitAttempt", 4, "sdk_fetch_init_attempt"), new a("SDKInitCacheRead", 5, "sdk_init_cache_read"), new a("SDKInitCacheWrite", 6, "sdk_init_cache_write"), new a("SDKInitCacheClear", 7, "sdk_init_cache_clear"), new a("SDKInitFailureDifferentAppKey", 8, "sdk_init_failure_different_app_key"), new a("CreateAd", 9, "create_ad"), new a("LoadAdAttempt", 10, "load_ad_attempted"), new a("LoadAdSuccess", 11, "load_ad_success"), new a("LoadAdFailed", 12, "load_ad_failed"), new a("NativeAdLoadAdAttempted", 13, "native_ad_load_attempted"), new a("NativeLoadAd", 14, "native_ad_load"), new a("BidTokenGetRequest", 15, "bid_token_get_request"), new a("BidTokenGetResponse", 16, "bid_token_get_response"), new a("BidTokenFetch", 17, "bid_token_fetch"), new a("BidTokenDurationTimeoutOneSecond", 18, "bid_token_duration_crossed_1s"), new a("BidTokenDurationTimeoutThreeSecond", 19, "bid_token_duration_crossed_3s"), new a("ServerBidTokenFetch", 20, "sbt_fetch"), new a("ServerBidTokenCached", 21, "sbt_cached"), new a("ServerBidTokenApiFetch", 22, "sbt_api_fetch"), new a("ServerBidTokenAsyncRefresh", 23, "sbt_async_fetch"), new a("ClientBidTokenBuild", 24, "bid_token_build"), new a("ClientBidTokenCached", 25, "cbt_cached"), new a("ShowAdAttempt", 26, "show_ad_attempted"), new a("ShowAdSuccess", 27, "show_ad_success"), new a("ShowAdFailed", 28, "show_ad_failed"), new a("AdClicked", 29, "ad_clicked"), new a("AdClickedDeduped", 30, "ad_clicked_deduped"), new a("CrashDetected", 31, "crash_detected"), new a("WebviewLoadAd", 32, "webview_load_ad"), new a("WebviewHtmlAdError", 33, "webview_html_ad_error"), new a("WebviewHtmlAdRetryAttempt", 34, "webview_html_ad_retry_attempt"), new a("WebviewHtmlAdIgnoredError", 35, "webview_html_ad_ignored_error"), new a("WebviewEventHandled", 36, "webview_event_handled"), new a("WebviewEventMultipleHandlers", 37, "webview_event_multiple_handlers"), new a("WebviewPageLoadStart", 38, "webview_page_load_start"), new a("WebviewPageLoadEnd", 39, "webview_page_load_end"), new a("WebviewPageLoadFinishCallback", 40, "webview_page_load_finish_callback"), new a("WebviewRequiredContentLoaded", 41, "webview_required_content_loaded"), new a("StoreLaunchStarted", 42, "store_launch_started"), new a("StoreLaunchComplete", 43, "store_launch_complete"), new a("TemplateBridgeNotifyReadyInvoked", 44, "template_bridge_notify_ready_invoked"), new a("TemplateBridgeNotifyReadyCompleted", 45, "template_bridge_notify_ready_completed"), new a("TemplateBridgeViewVisibleInvoked", 46, "template_bridge_view_visible_invoked"), new a("TemplateBridgeViewVisibleCompleted", 47, "template_bridge_view_visible_completed"), new a("FullscreenWebviewActivityOnCreate", 48, "fullscreen_webview_activity_create"), new a("RewardIssued", 49, "reward_issued"), new a("UnknownCreativeType", 50, "unknown_creative_type"), new a("WebViewNotAvailable", 51, "webview_not_available"), new a("VastShowFileNotExists", 52, "vast_show_file_not_exists"), new a("SoftwareRenderingDetected", 53, "software_rendering_detected"), new a("ExoPlayerError", 54, "exoplayer_error"), new a("AdHidden", 55, "ad_hidden"), new a("NativeAdComposeViewNotAvailable", 56, "native_ad_compose_not_available"), new a("FullscreenAdComposeViewNotAvailable", 57, "fullscreen_ad_compose_not_available")};
        f28494b = aVarArr;
        d.t(aVarArr);
    }

    public a(String str, int i5, String str2) {
        this.f28495a = str2;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f28494b.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f28495a;
    }
}
