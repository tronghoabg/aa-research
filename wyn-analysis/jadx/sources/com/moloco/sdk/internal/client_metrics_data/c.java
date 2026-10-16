package com.moloco.sdk.internal.client_metrics_data;

import ic.d;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ c[] f28497b;

    /* renamed from: a, reason: collision with root package name */
    public final String f28498a;

    static {
        c[] cVarArr = {new c("SDKInit", 0, "sdk_init_time"), new c("SDKPerformInitAttempt", 1, "sdk_perform_init_time_ms"), new c("SDKInitHttpRequest", 2, "sdk_init_request_time_ms"), new c("SDKInitCacheRead", 3, "sdk_init_cache_read_time_ms"), new c("SDKInitCacheWrite", 4, "sdk_init_cache_write_time_ms"), new c("SDKInitCacheClear", 5, "sdk_init_cache_clear_time_ms"), new c("CreateAd", 6, "create_ad_time_ms"), new c("CreateAdAwaitAdFactory", 7, "create_ad_await_ad_factory_time_ms"), new c("LoadAd", 8, "load_ad_time"), new c("NativePrepareAd", 9, "native_ad_load_prepare_time"), new c("BidTokenFetch", 10, "bid_token_fetch_time"), new c("ServerBidTokenFetch", 11, "sbt_fetch_time_ms"), new c("ServerBidTokenApiFetchTime", 12, "sbt_api_fetch_time_ms"), new c("ClientBidTokenBuild", 13, "bid_token_build_time_ms"), new c("LoadToShow", 14, "load_to_show_time"), new c("CreateToLoad", 15, "ad_create_to_load_ms"), new c("WebviewLoadAd", 16, "webview_load_ad_ms"), new c("WebviewEventHandled", 17, "webview_event_handled_time_ms"), new c("WebviewEventHandlerLatency", 18, "webview_event_handler_latency_ms"), new c("WebviewPageLoadLatency", 19, "webview_page_load_ms"), new c("WebviewRequiredContentLoadLatency", 20, "webview_required_content_load_ms"), new c("VastShowFileNotExistsLoadToShow", 21, "vast_show_file_not_exists_load_to_show_ms")};
        f28497b = cVarArr;
        d.t(cVarArr);
    }

    public c(String str, int i5, String str2) {
        this.f28498a = str2;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f28497b.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f28498a;
    }
}
