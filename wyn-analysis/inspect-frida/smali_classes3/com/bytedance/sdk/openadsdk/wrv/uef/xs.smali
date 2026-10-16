.class public Lcom/bytedance/sdk/openadsdk/wrv/uef/xs;
.super Lcom/bytedance/sdk/component/uef/moa;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/bytedance/sdk/component/uef/moa<",
        "Lorg/json/JSONObject;",
        "Lorg/json/JSONObject;",
        ">;"
    }
.end annotation


# instance fields
.field private final oa:Ljava/lang/String;

.field private final uef:Lcom/bytedance/sdk/openadsdk/core/oyt;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/oyt;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/bytedance/sdk/component/uef/moa;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/wrv/uef/xs;->uef:Lcom/bytedance/sdk/openadsdk/core/oyt;

    .line 5
    .line 6
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/wrv/uef/xs;->oa:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method

.method public static uef(Lcom/bytedance/sdk/component/uef/wk;Lcom/bytedance/sdk/openadsdk/core/oyt;)V
    .locals 2

    .line 2
    new-instance v0, Lcom/bytedance/sdk/openadsdk/wrv/uef/xs;

    const-string v1, "appInfo"

    invoke-direct {v0, v1, p1}, Lcom/bytedance/sdk/openadsdk/wrv/uef/xs;-><init>(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/oyt;)V

    invoke-virtual {p0, v1, v0}, Lcom/bytedance/sdk/component/uef/wk;->uef(Ljava/lang/String;Lcom/bytedance/sdk/component/uef/moa;)Lcom/bytedance/sdk/component/uef/wk;

    .line 3
    new-instance v0, Lcom/bytedance/sdk/openadsdk/wrv/uef/xs;

    const-string v1, "adInfo"

    invoke-direct {v0, v1, p1}, Lcom/bytedance/sdk/openadsdk/wrv/uef/xs;-><init>(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/oyt;)V

    invoke-virtual {p0, v1, v0}, Lcom/bytedance/sdk/component/uef/wk;->uef(Ljava/lang/String;Lcom/bytedance/sdk/component/uef/moa;)Lcom/bytedance/sdk/component/uef/wk;

    .line 4
    new-instance v0, Lcom/bytedance/sdk/openadsdk/wrv/uef/xs;

    const-string v1, "sendLog"

    invoke-direct {v0, v1, p1}, Lcom/bytedance/sdk/openadsdk/wrv/uef/xs;-><init>(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/oyt;)V

    invoke-virtual {p0, v1, v0}, Lcom/bytedance/sdk/component/uef/wk;->uef(Ljava/lang/String;Lcom/bytedance/sdk/component/uef/moa;)Lcom/bytedance/sdk/component/uef/wk;

    .line 5
    new-instance v0, Lcom/bytedance/sdk/openadsdk/wrv/uef/xs;

    const-string v1, "playable_style"

    invoke-direct {v0, v1, p1}, Lcom/bytedance/sdk/openadsdk/wrv/uef/xs;-><init>(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/oyt;)V

    invoke-virtual {p0, v1, v0}, Lcom/bytedance/sdk/component/uef/wk;->uef(Ljava/lang/String;Lcom/bytedance/sdk/component/uef/moa;)Lcom/bytedance/sdk/component/uef/wk;

    .line 6
    new-instance v0, Lcom/bytedance/sdk/openadsdk/wrv/uef/xs;

    const-string v1, "getTemplateInfo"

    invoke-direct {v0, v1, p1}, Lcom/bytedance/sdk/openadsdk/wrv/uef/xs;-><init>(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/oyt;)V

    invoke-virtual {p0, v1, v0}, Lcom/bytedance/sdk/component/uef/wk;->uef(Ljava/lang/String;Lcom/bytedance/sdk/component/uef/moa;)Lcom/bytedance/sdk/component/uef/wk;

    .line 7
    new-instance v0, Lcom/bytedance/sdk/openadsdk/wrv/uef/xs;

    const-string v1, "getTeMaiAds"

    invoke-direct {v0, v1, p1}, Lcom/bytedance/sdk/openadsdk/wrv/uef/xs;-><init>(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/oyt;)V

    invoke-virtual {p0, v1, v0}, Lcom/bytedance/sdk/component/uef/wk;->uef(Ljava/lang/String;Lcom/bytedance/sdk/component/uef/moa;)Lcom/bytedance/sdk/component/uef/wk;

    .line 8
    new-instance v0, Lcom/bytedance/sdk/openadsdk/wrv/uef/xs;

    const-string v1, "isViewable"

    invoke-direct {v0, v1, p1}, Lcom/bytedance/sdk/openadsdk/wrv/uef/xs;-><init>(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/oyt;)V

    invoke-virtual {p0, v1, v0}, Lcom/bytedance/sdk/component/uef/wk;->uef(Ljava/lang/String;Lcom/bytedance/sdk/component/uef/moa;)Lcom/bytedance/sdk/component/uef/wk;

    .line 9
    new-instance v0, Lcom/bytedance/sdk/openadsdk/wrv/uef/xs;

    const-string v1, "getScreenSize"

    invoke-direct {v0, v1, p1}, Lcom/bytedance/sdk/openadsdk/wrv/uef/xs;-><init>(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/oyt;)V

    invoke-virtual {p0, v1, v0}, Lcom/bytedance/sdk/component/uef/wk;->uef(Ljava/lang/String;Lcom/bytedance/sdk/component/uef/moa;)Lcom/bytedance/sdk/component/uef/wk;

    .line 10
    new-instance v0, Lcom/bytedance/sdk/openadsdk/wrv/uef/xs;

    const-string v1, "getCloseButtonInfo"

    invoke-direct {v0, v1, p1}, Lcom/bytedance/sdk/openadsdk/wrv/uef/xs;-><init>(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/oyt;)V

    invoke-virtual {p0, v1, v0}, Lcom/bytedance/sdk/component/uef/wk;->uef(Ljava/lang/String;Lcom/bytedance/sdk/component/uef/moa;)Lcom/bytedance/sdk/component/uef/wk;

    .line 11
    new-instance v0, Lcom/bytedance/sdk/openadsdk/wrv/uef/xs;

    const-string v1, "getVolume"

    invoke-direct {v0, v1, p1}, Lcom/bytedance/sdk/openadsdk/wrv/uef/xs;-><init>(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/oyt;)V

    invoke-virtual {p0, v1, v0}, Lcom/bytedance/sdk/component/uef/wk;->uef(Ljava/lang/String;Lcom/bytedance/sdk/component/uef/moa;)Lcom/bytedance/sdk/component/uef/wk;

    .line 12
    new-instance v0, Lcom/bytedance/sdk/openadsdk/wrv/uef/xs;

    const-string v1, "removeLoading"

    invoke-direct {v0, v1, p1}, Lcom/bytedance/sdk/openadsdk/wrv/uef/xs;-><init>(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/oyt;)V

    invoke-virtual {p0, v1, v0}, Lcom/bytedance/sdk/component/uef/wk;->uef(Ljava/lang/String;Lcom/bytedance/sdk/component/uef/moa;)Lcom/bytedance/sdk/component/uef/wk;

    .line 13
    new-instance v0, Lcom/bytedance/sdk/openadsdk/wrv/uef/xs;

    const-string v1, "sendReward"

    invoke-direct {v0, v1, p1}, Lcom/bytedance/sdk/openadsdk/wrv/uef/xs;-><init>(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/oyt;)V

    invoke-virtual {p0, v1, v0}, Lcom/bytedance/sdk/component/uef/wk;->uef(Ljava/lang/String;Lcom/bytedance/sdk/component/uef/moa;)Lcom/bytedance/sdk/component/uef/wk;

    .line 14
    new-instance v0, Lcom/bytedance/sdk/openadsdk/wrv/uef/xs;

    const-string v1, "subscribe_app_ad"

    invoke-direct {v0, v1, p1}, Lcom/bytedance/sdk/openadsdk/wrv/uef/xs;-><init>(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/oyt;)V

    invoke-virtual {p0, v1, v0}, Lcom/bytedance/sdk/component/uef/wk;->uef(Ljava/lang/String;Lcom/bytedance/sdk/component/uef/moa;)Lcom/bytedance/sdk/component/uef/wk;

    .line 15
    new-instance v0, Lcom/bytedance/sdk/openadsdk/wrv/uef/xs;

    const-string v1, "download_app_ad"

    invoke-direct {v0, v1, p1}, Lcom/bytedance/sdk/openadsdk/wrv/uef/xs;-><init>(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/oyt;)V

    invoke-virtual {p0, v1, v0}, Lcom/bytedance/sdk/component/uef/wk;->uef(Ljava/lang/String;Lcom/bytedance/sdk/component/uef/moa;)Lcom/bytedance/sdk/component/uef/wk;

    .line 16
    new-instance v0, Lcom/bytedance/sdk/openadsdk/wrv/uef/xs;

    const-string v1, "cancel_download_app_ad"

    invoke-direct {v0, v1, p1}, Lcom/bytedance/sdk/openadsdk/wrv/uef/xs;-><init>(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/oyt;)V

    invoke-virtual {p0, v1, v0}, Lcom/bytedance/sdk/component/uef/wk;->uef(Ljava/lang/String;Lcom/bytedance/sdk/component/uef/moa;)Lcom/bytedance/sdk/component/uef/wk;

    .line 17
    new-instance v0, Lcom/bytedance/sdk/openadsdk/wrv/uef/xs;

    const-string v1, "unsubscribe_app_ad"

    invoke-direct {v0, v1, p1}, Lcom/bytedance/sdk/openadsdk/wrv/uef/xs;-><init>(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/oyt;)V

    invoke-virtual {p0, v1, v0}, Lcom/bytedance/sdk/component/uef/wk;->uef(Ljava/lang/String;Lcom/bytedance/sdk/component/uef/moa;)Lcom/bytedance/sdk/component/uef/wk;

    .line 18
    new-instance v0, Lcom/bytedance/sdk/openadsdk/wrv/uef/xs;

    const-string v1, "landscape_click"

    invoke-direct {v0, v1, p1}, Lcom/bytedance/sdk/openadsdk/wrv/uef/xs;-><init>(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/oyt;)V

    invoke-virtual {p0, v1, v0}, Lcom/bytedance/sdk/component/uef/wk;->uef(Ljava/lang/String;Lcom/bytedance/sdk/component/uef/moa;)Lcom/bytedance/sdk/component/uef/wk;

    .line 19
    new-instance v0, Lcom/bytedance/sdk/openadsdk/wrv/uef/xs;

    const-string v1, "clickEvent"

    invoke-direct {v0, v1, p1}, Lcom/bytedance/sdk/openadsdk/wrv/uef/xs;-><init>(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/oyt;)V

    invoke-virtual {p0, v1, v0}, Lcom/bytedance/sdk/component/uef/wk;->uef(Ljava/lang/String;Lcom/bytedance/sdk/component/uef/moa;)Lcom/bytedance/sdk/component/uef/wk;

    .line 20
    new-instance v0, Lcom/bytedance/sdk/openadsdk/wrv/uef/xs;

    const-string v1, "renderDidFinish"

    invoke-direct {v0, v1, p1}, Lcom/bytedance/sdk/openadsdk/wrv/uef/xs;-><init>(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/oyt;)V

    invoke-virtual {p0, v1, v0}, Lcom/bytedance/sdk/component/uef/wk;->uef(Ljava/lang/String;Lcom/bytedance/sdk/component/uef/moa;)Lcom/bytedance/sdk/component/uef/wk;

    .line 21
    new-instance v0, Lcom/bytedance/sdk/openadsdk/wrv/uef/xs;

    const-string v1, "dynamicTrack"

    invoke-direct {v0, v1, p1}, Lcom/bytedance/sdk/openadsdk/wrv/uef/xs;-><init>(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/oyt;)V

    invoke-virtual {p0, v1, v0}, Lcom/bytedance/sdk/component/uef/wk;->uef(Ljava/lang/String;Lcom/bytedance/sdk/component/uef/moa;)Lcom/bytedance/sdk/component/uef/wk;

    .line 22
    new-instance v0, Lcom/bytedance/sdk/openadsdk/wrv/uef/xs;

    const-string v1, "skipVideo"

    invoke-direct {v0, v1, p1}, Lcom/bytedance/sdk/openadsdk/wrv/uef/xs;-><init>(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/oyt;)V

    invoke-virtual {p0, v1, v0}, Lcom/bytedance/sdk/component/uef/wk;->uef(Ljava/lang/String;Lcom/bytedance/sdk/component/uef/moa;)Lcom/bytedance/sdk/component/uef/wk;

    .line 23
    new-instance v0, Lcom/bytedance/sdk/openadsdk/wrv/uef/xs;

    const-string v1, "muteVideo"

    invoke-direct {v0, v1, p1}, Lcom/bytedance/sdk/openadsdk/wrv/uef/xs;-><init>(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/oyt;)V

    invoke-virtual {p0, v1, v0}, Lcom/bytedance/sdk/component/uef/wk;->uef(Ljava/lang/String;Lcom/bytedance/sdk/component/uef/moa;)Lcom/bytedance/sdk/component/uef/wk;

    .line 24
    new-instance v0, Lcom/bytedance/sdk/openadsdk/wrv/uef/xs;

    const-string v1, "changeVideoState"

    invoke-direct {v0, v1, p1}, Lcom/bytedance/sdk/openadsdk/wrv/uef/xs;-><init>(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/oyt;)V

    const-string v1, "changeVideoState"

    invoke-virtual {p0, v1, v0}, Lcom/bytedance/sdk/component/uef/wk;->uef(Ljava/lang/String;Lcom/bytedance/sdk/component/uef/moa;)Lcom/bytedance/sdk/component/uef/wk;

    .line 25
    new-instance v0, Lcom/bytedance/sdk/openadsdk/wrv/uef/xs;

    const-string v1, "getCurrentVideoState"

    invoke-direct {v0, v1, p1}, Lcom/bytedance/sdk/openadsdk/wrv/uef/xs;-><init>(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/oyt;)V

    const-string v1, "getCurrentVideoState"

    invoke-virtual {p0, v1, v0}, Lcom/bytedance/sdk/component/uef/wk;->uef(Ljava/lang/String;Lcom/bytedance/sdk/component/uef/moa;)Lcom/bytedance/sdk/component/uef/wk;

    .line 26
    new-instance v0, Lcom/bytedance/sdk/openadsdk/wrv/uef/xs;

    const-string v1, "send_temai_product_ids"

    invoke-direct {v0, v1, p1}, Lcom/bytedance/sdk/openadsdk/wrv/uef/xs;-><init>(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/oyt;)V

    const-string v1, "send_temai_product_ids"

    invoke-virtual {p0, v1, v0}, Lcom/bytedance/sdk/component/uef/wk;->uef(Ljava/lang/String;Lcom/bytedance/sdk/component/uef/moa;)Lcom/bytedance/sdk/component/uef/wk;

    .line 27
    new-instance v0, Lcom/bytedance/sdk/openadsdk/wrv/uef/xs;

    const-string v1, "getMaterialMeta"

    invoke-direct {v0, v1, p1}, Lcom/bytedance/sdk/openadsdk/wrv/uef/xs;-><init>(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/oyt;)V

    const-string v1, "getMaterialMeta"

    invoke-virtual {p0, v1, v0}, Lcom/bytedance/sdk/component/uef/wk;->uef(Ljava/lang/String;Lcom/bytedance/sdk/component/uef/moa;)Lcom/bytedance/sdk/component/uef/wk;

    .line 28
    new-instance v0, Lcom/bytedance/sdk/openadsdk/wrv/uef/xs;

    const-string v1, "endcard_load"

    invoke-direct {v0, v1, p1}, Lcom/bytedance/sdk/openadsdk/wrv/uef/xs;-><init>(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/oyt;)V

    const-string v1, "endcard_load"

    invoke-virtual {p0, v1, v0}, Lcom/bytedance/sdk/component/uef/wk;->uef(Ljava/lang/String;Lcom/bytedance/sdk/component/uef/moa;)Lcom/bytedance/sdk/component/uef/wk;

    .line 29
    new-instance v0, Lcom/bytedance/sdk/openadsdk/wrv/uef/xs;

    const-string v1, "pauseWebView"

    invoke-direct {v0, v1, p1}, Lcom/bytedance/sdk/openadsdk/wrv/uef/xs;-><init>(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/oyt;)V

    const-string v1, "pauseWebView"

    invoke-virtual {p0, v1, v0}, Lcom/bytedance/sdk/component/uef/wk;->uef(Ljava/lang/String;Lcom/bytedance/sdk/component/uef/moa;)Lcom/bytedance/sdk/component/uef/wk;

    .line 30
    new-instance v0, Lcom/bytedance/sdk/openadsdk/wrv/uef/xs;

    const-string v1, "pauseWebViewTimers"

    invoke-direct {v0, v1, p1}, Lcom/bytedance/sdk/openadsdk/wrv/uef/xs;-><init>(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/oyt;)V

    const-string v1, "pauseWebViewTimers"

    invoke-virtual {p0, v1, v0}, Lcom/bytedance/sdk/component/uef/wk;->uef(Ljava/lang/String;Lcom/bytedance/sdk/component/uef/moa;)Lcom/bytedance/sdk/component/uef/wk;

    .line 31
    new-instance v0, Lcom/bytedance/sdk/openadsdk/wrv/uef/xs;

    const-string v1, "webview_time_track"

    invoke-direct {v0, v1, p1}, Lcom/bytedance/sdk/openadsdk/wrv/uef/xs;-><init>(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/oyt;)V

    const-string v1, "webview_time_track"

    invoke-virtual {p0, v1, v0}, Lcom/bytedance/sdk/component/uef/wk;->uef(Ljava/lang/String;Lcom/bytedance/sdk/component/uef/moa;)Lcom/bytedance/sdk/component/uef/wk;

    .line 32
    new-instance v0, Lcom/bytedance/sdk/openadsdk/wrv/uef/xs;

    const-string v1, "openPrivacy"

    invoke-direct {v0, v1, p1}, Lcom/bytedance/sdk/openadsdk/wrv/uef/xs;-><init>(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/oyt;)V

    const-string v1, "openPrivacy"

    invoke-virtual {p0, v1, v0}, Lcom/bytedance/sdk/component/uef/wk;->uef(Ljava/lang/String;Lcom/bytedance/sdk/component/uef/moa;)Lcom/bytedance/sdk/component/uef/wk;

    .line 33
    new-instance v0, Lcom/bytedance/sdk/openadsdk/wrv/uef/xs;

    const-string v1, "openAdLandPageLinks"

    invoke-direct {v0, v1, p1}, Lcom/bytedance/sdk/openadsdk/wrv/uef/xs;-><init>(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/oyt;)V

    const-string v1, "openAdLandPageLinks"

    invoke-virtual {p0, v1, v0}, Lcom/bytedance/sdk/component/uef/wk;->uef(Ljava/lang/String;Lcom/bytedance/sdk/component/uef/moa;)Lcom/bytedance/sdk/component/uef/wk;

    .line 34
    new-instance v0, Lcom/bytedance/sdk/openadsdk/wrv/uef/xs;

    const-string v1, "getNativeSiteCustomData"

    invoke-direct {v0, v1, p1}, Lcom/bytedance/sdk/openadsdk/wrv/uef/xs;-><init>(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/oyt;)V

    const-string v1, "getNativeSiteCustomData"

    invoke-virtual {p0, v1, v0}, Lcom/bytedance/sdk/component/uef/wk;->uef(Ljava/lang/String;Lcom/bytedance/sdk/component/uef/moa;)Lcom/bytedance/sdk/component/uef/wk;

    .line 35
    new-instance v0, Lcom/bytedance/sdk/openadsdk/wrv/uef/xs;

    const-string v1, "close"

    invoke-direct {v0, v1, p1}, Lcom/bytedance/sdk/openadsdk/wrv/uef/xs;-><init>(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/oyt;)V

    const-string p1, "close"

    invoke-virtual {p0, p1, v0}, Lcom/bytedance/sdk/component/uef/wk;->uef(Ljava/lang/String;Lcom/bytedance/sdk/component/uef/moa;)Lcom/bytedance/sdk/component/uef/wk;

    return-void
.end method


# virtual methods
.method public bridge synthetic uef(Ljava/lang/String;Ljava/lang/Object;Lcom/bytedance/sdk/component/uef/lw;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    check-cast p2, Lorg/json/JSONObject;

    invoke-virtual {p0, p1, p2, p3}, Lcom/bytedance/sdk/openadsdk/wrv/uef/xs;->uef(Ljava/lang/String;Lorg/json/JSONObject;Lcom/bytedance/sdk/component/uef/lw;)Lorg/json/JSONObject;

    move-result-object p1

    return-object p1
.end method

.method public uef(Ljava/lang/String;Lorg/json/JSONObject;Lcom/bytedance/sdk/component/uef/lw;)Lorg/json/JSONObject;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 36
    new-instance p1, Lcom/bytedance/sdk/openadsdk/core/oyt$oa;

    invoke-direct {p1}, Lcom/bytedance/sdk/openadsdk/core/oyt$oa;-><init>()V

    .line 37
    const-string p3, "call"

    iput-object p3, p1, Lcom/bytedance/sdk/openadsdk/core/oyt$oa;->uef:Ljava/lang/String;

    .line 38
    iget-object p3, p0, Lcom/bytedance/sdk/openadsdk/wrv/uef/xs;->oa:Ljava/lang/String;

    iput-object p3, p1, Lcom/bytedance/sdk/openadsdk/core/oyt$oa;->yo:Ljava/lang/String;

    .line 39
    iput-object p2, p1, Lcom/bytedance/sdk/openadsdk/core/oyt$oa;->moa:Lorg/json/JSONObject;

    .line 40
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/wrv/uef/xs;->uef:Lcom/bytedance/sdk/openadsdk/core/oyt;

    const/4 p3, 0x3

    invoke-virtual {p2, p1, p3}, Lcom/bytedance/sdk/openadsdk/core/oyt;->uef(Lcom/bytedance/sdk/openadsdk/core/oyt$oa;I)Lorg/json/JSONObject;

    move-result-object p1

    return-object p1
.end method
