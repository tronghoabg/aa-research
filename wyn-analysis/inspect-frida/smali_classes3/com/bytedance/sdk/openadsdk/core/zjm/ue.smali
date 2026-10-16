.class public Lcom/bytedance/sdk/openadsdk/core/zjm/ue;
.super Lcom/bytedance/sdk/component/adexpress/lw/uef;
.source "SourceFile"


# instance fields
.field protected ab:Lcom/bytedance/sdk/openadsdk/core/wk/moa/oa;

.field private bcc:Lcom/bytedance/sdk/openadsdk/moa/cq;

.field bs:Lcom/bytedance/sdk/openadsdk/utils/uef;

.field protected cq:Lcom/bytedance/sdk/openadsdk/moa/moa/lw;

.field protected cz:Landroid/content/Context;

.field private dhk:Lcom/bytedance/sdk/openadsdk/core/model/gzw$uef;

.field protected dj:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

.field protected dz:Lcom/bytedance/sdk/openadsdk/core/oyt;

.field private final gzw:Ljava/lang/Runnable;

.field private oib:Lcom/bytedance/sdk/component/adexpress/oa/xs;

.field private final orq:Lcom/bytedance/sdk/component/bcc/oa/yo;

.field private final sy:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/bytedance/sdk/openadsdk/tpx/uef/uef/yo;",
            ">;"
        }
    .end annotation
.end field

.field private volatile tpx:I

.field protected wk:Lcom/bytedance/sdk/openadsdk/core/zjm/dj;

.field protected wrv:Lorg/json/JSONObject;

.field private xs:Ljava/lang/String;

.field protected zjm:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/bytedance/sdk/component/adexpress/oa/cq;Lcom/bytedance/sdk/component/adexpress/theme/ThemeStatusBroadcastReceiver;Lcom/bytedance/sdk/openadsdk/moa/moa/lw;Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/bytedance/sdk/component/adexpress/lw/uef;-><init>(Landroid/content/Context;Lcom/bytedance/sdk/component/adexpress/oa/cq;Lcom/bytedance/sdk/component/adexpress/theme/ThemeStatusBroadcastReceiver;)V

    .line 2
    .line 3
    .line 4
    invoke-static {}, LVa/M6;->v()Ljava/util/Map;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->sy:Ljava/util/Map;

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    iput v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->tpx:I

    .line 12
    .line 13
    new-instance v0, Lcom/bytedance/sdk/openadsdk/core/zjm/ue$1;

    .line 14
    .line 15
    const-string v1, "webviewrender_template"

    .line 16
    .line 17
    invoke-direct {v0, p0, v1}, Lcom/bytedance/sdk/openadsdk/core/zjm/ue$1;-><init>(Lcom/bytedance/sdk/openadsdk/core/zjm/ue;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->orq:Lcom/bytedance/sdk/component/bcc/oa/yo;

    .line 21
    .line 22
    new-instance v0, Lcom/bytedance/sdk/openadsdk/core/zjm/ue$2;

    .line 23
    .line 24
    invoke-direct {v0, p0}, Lcom/bytedance/sdk/openadsdk/core/zjm/ue$2;-><init>(Lcom/bytedance/sdk/openadsdk/core/zjm/ue;)V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->gzw:Ljava/lang/Runnable;

    .line 28
    .line 29
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->moa:Lcom/bytedance/sdk/component/cz/ivm;

    .line 30
    .line 31
    if-nez v0, :cond_0

    .line 32
    .line 33
    return-void

    .line 34
    :cond_0
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->cz:Landroid/content/Context;

    .line 35
    .line 36
    invoke-virtual {p2}, Lcom/bytedance/sdk/component/adexpress/oa/cq;->moa()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->zjm:Ljava/lang/String;

    .line 41
    .line 42
    iput-object p5, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->dj:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 43
    .line 44
    iput-object p4, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->cq:Lcom/bytedance/sdk/openadsdk/moa/moa/lw;

    .line 45
    .line 46
    invoke-virtual {p3, p0}, Lcom/bytedance/sdk/component/adexpress/theme/ThemeStatusBroadcastReceiver;->uef(Lcom/bytedance/sdk/component/adexpress/theme/uef;)V

    .line 47
    .line 48
    .line 49
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->bs()V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public static synthetic bcc(Lcom/bytedance/sdk/openadsdk/core/zjm/ue;)Lcom/bytedance/sdk/component/cz/ivm;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->moa:Lcom/bytedance/sdk/component/cz/ivm;

    return-object p0
.end method

.method private bs()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->moa:Lcom/bytedance/sdk/component/cz/ivm;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/bytedance/sdk/component/cz/ivm;->getWebView()Landroid/webkit/WebView;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/utils/km;->ivm()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->sy()V

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v0, 0x1

    .line 20
    iput v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->tpx:I

    .line 21
    .line 22
    new-instance v0, Lcom/bytedance/sdk/openadsdk/core/zjm/ue$3;

    .line 23
    .line 24
    invoke-direct {v0, p0}, Lcom/bytedance/sdk/openadsdk/core/zjm/ue$3;-><init>(Lcom/bytedance/sdk/openadsdk/core/zjm/ue;)V

    .line 25
    .line 26
    .line 27
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/utils/km;->uef(Ljava/lang/Runnable;)V

    .line 28
    .line 29
    .line 30
    :goto_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->dj:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 31
    .line 32
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/zjm/wk;->oa(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    iget-boolean v0, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->oa:Z

    .line 39
    .line 40
    if-nez v0, :cond_1

    .line 41
    .line 42
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->dj:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 43
    .line 44
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/zjm/wk;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V

    .line 45
    .line 46
    .line 47
    :cond_1
    return-void
.end method

.method public static synthetic ivm(Lcom/bytedance/sdk/openadsdk/core/zjm/ue;)Lcom/bytedance/sdk/component/adexpress/oa/xs;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->oib:Lcom/bytedance/sdk/component/adexpress/oa/xs;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic lw(Lcom/bytedance/sdk/openadsdk/core/zjm/ue;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->ivm:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic moa(Lcom/bytedance/sdk/openadsdk/core/zjm/ue;)Ljava/lang/Runnable;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->gzw:Ljava/lang/Runnable;

    return-object p0
.end method

.method public static synthetic oa(Lcom/bytedance/sdk/openadsdk/core/zjm/ue;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->tpx:I

    return p0
.end method

.method public static oa(Ljava/lang/String;)Z
    .locals 1

    .line 7
    const-string v0, "banner_call"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "banner_ad"

    .line 8
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "slide_banner_ad"

    .line 9
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "banner_ad_landingpage"

    .line 10
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method private sy()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->moa:Lcom/bytedance/sdk/component/cz/ivm;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/bytedance/sdk/component/cz/ivm;->getWebView()Landroid/webkit/WebView;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->tpx:I

    .line 13
    .line 14
    const/4 v1, 0x2

    .line 15
    if-ne v0, v1, :cond_1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->dj:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 19
    .line 20
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->xs:Ljava/lang/String;

    .line 25
    .line 26
    new-instance v0, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    const-string v2, "initWebViewRender: url = "

    .line 29
    .line 30
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->xs:Ljava/lang/String;

    .line 34
    .line 35
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    const-string v2, "TTAD.WebViewRender"

    .line 43
    .line 44
    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 45
    .line 46
    .line 47
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->moa:Lcom/bytedance/sdk/component/cz/ivm;

    .line 48
    .line 49
    const/4 v2, 0x0

    .line 50
    invoke-virtual {v0, v2}, Lcom/bytedance/sdk/component/cz/ivm;->setDisplayZoomControls(Z)V

    .line 51
    .line 52
    .line 53
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->xs:Ljava/lang/String;

    .line 54
    .line 55
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/utils/oyt;->uef(Ljava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {p0, v0}, Lcom/bytedance/sdk/component/adexpress/lw/uef;->uef(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->oib()V

    .line 63
    .line 64
    .line 65
    new-instance v0, Lcom/bytedance/sdk/openadsdk/core/oyt;

    .line 66
    .line 67
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->cz:Landroid/content/Context;

    .line 68
    .line 69
    invoke-direct {v0, v2}, Lcom/bytedance/sdk/openadsdk/core/oyt;-><init>(Landroid/content/Context;)V

    .line 70
    .line 71
    .line 72
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->dz:Lcom/bytedance/sdk/openadsdk/core/oyt;

    .line 73
    .line 74
    const/4 v2, 0x1

    .line 75
    invoke-virtual {v0, v2}, Lcom/bytedance/sdk/openadsdk/core/oyt;->moa(Z)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->dz()V

    .line 79
    .line 80
    .line 81
    iput v1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->tpx:I

    .line 82
    .line 83
    :cond_2
    :goto_0
    return-void
.end method

.method public static uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Ljava/lang/String;
    .locals 0

    if-eqz p0, :cond_0

    .line 3
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->uu()Z

    move-result p0

    if-eqz p0, :cond_0

    .line 4
    const-string p0, "v3"

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    .line 5
    :goto_0
    invoke-static {p0}, Lcom/bytedance/sdk/component/adexpress/uef/oa/oa;->moa(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/core/zjm/ue;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->ivm:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object p0
.end method

.method private uef(Lcom/bytedance/sdk/component/cz/ivm;)V
    .locals 3

    if-nez p1, :cond_0

    return-void

    .line 8
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->cz:Landroid/content/Context;

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/widget/uef/yo;->uef(Landroid/content/Context;)Lcom/bytedance/sdk/openadsdk/core/widget/uef/yo;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/widget/uef/yo;->uef(Z)Lcom/bytedance/sdk/openadsdk/core/widget/uef/yo;

    move-result-object v0

    invoke-virtual {p1}, Lcom/bytedance/sdk/component/cz/ivm;->getWebView()Landroid/webkit/WebView;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/bytedance/sdk/openadsdk/core/widget/uef/yo;->uef(Landroid/webkit/WebView;)V

    .line 9
    invoke-virtual {p1, v1}, Landroid/view/View;->setVerticalScrollBarEnabled(Z)V

    .line 10
    invoke-virtual {p1, v1}, Landroid/view/View;->setHorizontalScrollBarEnabled(Z)V

    .line 11
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/core/widget/uef/yo;->uef(Lcom/bytedance/sdk/component/cz/ivm;)V

    .line 12
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/cz/ivm;->dz()V

    .line 13
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/cz/ivm;->getWebView()Landroid/webkit/WebView;

    move-result-object v0

    const/16 v2, 0x1f45

    invoke-static {v0, v2}, Lcom/bytedance/sdk/openadsdk/utils/dhk;->uef(Landroid/webkit/WebView;I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/bytedance/sdk/component/cz/ivm;->setUserAgentString(Ljava/lang/String;)V

    .line 14
    invoke-virtual {p1, v1}, Lcom/bytedance/sdk/component/cz/ivm;->setMixedContentMode(I)V

    const/4 v0, 0x1

    .line 15
    invoke-virtual {p1, v0}, Lcom/bytedance/sdk/component/cz/ivm;->setJavaScriptEnabled(Z)V

    .line 16
    invoke-virtual {p1, v0}, Lcom/bytedance/sdk/component/cz/ivm;->setJavaScriptCanOpenWindowsAutomatically(Z)V

    .line 17
    invoke-virtual {p1, v0}, Lcom/bytedance/sdk/component/cz/ivm;->setDomStorageEnabled(Z)V

    .line 18
    invoke-virtual {p1, v0}, Lcom/bytedance/sdk/component/cz/ivm;->setDatabaseEnabled(Z)V

    .line 19
    invoke-virtual {p1, v1}, Lcom/bytedance/sdk/component/cz/ivm;->setAllowFileAccess(Z)V

    .line 20
    invoke-virtual {p1, v0}, Lcom/bytedance/sdk/component/cz/ivm;->setSupportZoom(Z)V

    .line 21
    invoke-virtual {p1, v0}, Lcom/bytedance/sdk/component/cz/ivm;->setBuiltInZoomControls(Z)V

    .line 22
    sget-object v1, Landroid/webkit/WebSettings$LayoutAlgorithm;->NARROW_COLUMNS:Landroid/webkit/WebSettings$LayoutAlgorithm;

    invoke-virtual {p1, v1}, Lcom/bytedance/sdk/component/cz/ivm;->setLayoutAlgorithm(Landroid/webkit/WebSettings$LayoutAlgorithm;)V

    .line 23
    invoke-virtual {p1, v0}, Lcom/bytedance/sdk/component/cz/ivm;->setUseWideViewPort(Z)V

    const/4 v0, -0x1

    .line 24
    invoke-virtual {p1, v0}, Lcom/bytedance/sdk/component/cz/ivm;->setCacheMode(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 25
    const-string v0, "TTAD.WebViewRender"

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/bytedance/sdk/component/utils/dhk;->yo(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/core/zjm/ue;Lcom/bytedance/sdk/component/adexpress/oa/xs;)V
    .locals 0

    .line 2
    invoke-super {p0, p1}, Lcom/bytedance/sdk/component/adexpress/lw/uef;->uef(Lcom/bytedance/sdk/component/adexpress/oa/xs;)V

    return-void
.end method

.method public static synthetic xs(Lcom/bytedance/sdk/openadsdk/core/zjm/ue;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->sy()V

    return-void
.end method

.method public static synthetic yo(Lcom/bytedance/sdk/openadsdk/core/zjm/ue;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->bs()V

    return-void
.end method

.method private yo(Z)V
    .locals 3

    .line 3
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->dz:Lcom/bytedance/sdk/openadsdk/core/oyt;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->moa:Lcom/bytedance/sdk/component/cz/ivm;

    if-nez v0, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 5
    const-string v1, "adVisible"

    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 6
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->dz:Lcom/bytedance/sdk/openadsdk/core/oyt;

    const-string v2, "expressAdShow"

    invoke-virtual {v1, v2, v0}, Lcom/bytedance/sdk/openadsdk/core/oyt;->uef(Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 7
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->dz:Lcom/bytedance/sdk/openadsdk/core/oyt;

    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/core/oyt;->uef(Z)Lcom/bytedance/sdk/openadsdk/core/oyt;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public ab()V
    .locals 0

    return-void
.end method

.method public bcc()V
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->moa()Lcom/bytedance/sdk/component/cz/ivm;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->moa()Lcom/bytedance/sdk/component/cz/ivm;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bytedance/sdk/component/cz/ivm;->getWebView()Landroid/webkit/WebView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/webkit/WebView;->resumeTimers()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :goto_0
    return-void
.end method

.method public cz()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->dz:Lcom/bytedance/sdk/openadsdk/core/oyt;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const-string v1, "expressWebviewRecycle"

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-virtual {v0, v1, v2}, Lcom/bytedance/sdk/openadsdk/core/oyt;->uef(Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public dhk()Lcom/bytedance/sdk/openadsdk/core/zjm/dj;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->wk:Lcom/bytedance/sdk/openadsdk/core/zjm/dj;

    .line 2
    .line 3
    return-object v0
.end method

.method public dj()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/bytedance/sdk/component/adexpress/lw/uef;->dj()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/ab;->uef()Lcom/bytedance/sdk/openadsdk/core/ab;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/ab;->lw()Lcom/bytedance/sdk/openadsdk/utils/uef;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->bs:Lcom/bytedance/sdk/openadsdk/utils/uef;

    .line 13
    .line 14
    invoke-virtual {v0, p0}, Lcom/bytedance/sdk/openadsdk/utils/uef;->uef(Lcom/bytedance/sdk/component/adexpress/uef;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public dz()V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->moa:Lcom/bytedance/sdk/component/cz/ivm;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/bytedance/sdk/component/cz/ivm;->getWebView()Landroid/webkit/WebView;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->moa:Lcom/bytedance/sdk/component/cz/ivm;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/component/cz/ivm;->setBackgroundColor(I)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->moa:Lcom/bytedance/sdk/component/cz/ivm;

    .line 19
    .line 20
    const v2, 0x106000d

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v2}, Landroid/view/View;->setBackgroundResource(I)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->moa:Lcom/bytedance/sdk/component/cz/ivm;

    .line 27
    .line 28
    invoke-direct {p0, v0}, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->uef(Lcom/bytedance/sdk/component/cz/ivm;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->moa()Lcom/bytedance/sdk/component/cz/ivm;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    new-instance v0, Lcom/bytedance/sdk/openadsdk/moa/cq;

    .line 38
    .line 39
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->dj:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 40
    .line 41
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->moa()Lcom/bytedance/sdk/component/cz/ivm;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-virtual {v3}, Lcom/bytedance/sdk/component/cz/ivm;->getWebView()Landroid/webkit/WebView;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    invoke-direct {v0, v2, v3}, Lcom/bytedance/sdk/openadsdk/moa/cq;-><init>(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Landroid/webkit/WebView;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/moa/cq;->oa(Z)Lcom/bytedance/sdk/openadsdk/moa/cq;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->bcc:Lcom/bytedance/sdk/openadsdk/moa/cq;

    .line 57
    .line 58
    :cond_1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->bcc:Lcom/bytedance/sdk/openadsdk/moa/cq;

    .line 59
    .line 60
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->cq:Lcom/bytedance/sdk/openadsdk/moa/moa/lw;

    .line 61
    .line 62
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/moa/cq;->uef(Lcom/bytedance/sdk/openadsdk/moa/moa/lw;)V

    .line 63
    .line 64
    .line 65
    new-instance v2, Lcom/bytedance/sdk/openadsdk/core/zjm/dj;

    .line 66
    .line 67
    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->cz:Landroid/content/Context;

    .line 68
    .line 69
    iget-object v4, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->dz:Lcom/bytedance/sdk/openadsdk/core/oyt;

    .line 70
    .line 71
    iget-object v5, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->dj:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 72
    .line 73
    iget-object v6, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->bcc:Lcom/bytedance/sdk/openadsdk/moa/cq;

    .line 74
    .line 75
    invoke-virtual {p0}, Lcom/bytedance/sdk/component/adexpress/lw/uef;->cq()Lcom/bytedance/sdk/component/adexpress/oa/cq;

    .line 76
    .line 77
    .line 78
    move-result-object v7

    .line 79
    invoke-direct/range {v2 .. v7}, Lcom/bytedance/sdk/openadsdk/core/zjm/dj;-><init>(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/core/oyt;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Lcom/bytedance/sdk/openadsdk/moa/cq;Lcom/bytedance/sdk/component/adexpress/oa/cq;)V

    .line 80
    .line 81
    .line 82
    iput-object v2, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->wk:Lcom/bytedance/sdk/openadsdk/core/zjm/dj;

    .line 83
    .line 84
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->moa:Lcom/bytedance/sdk/component/cz/ivm;

    .line 85
    .line 86
    invoke-virtual {v0, v2}, Lcom/bytedance/sdk/component/cz/ivm;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 87
    .line 88
    .line 89
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->moa:Lcom/bytedance/sdk/component/cz/ivm;

    .line 90
    .line 91
    new-instance v1, Lcom/bytedance/sdk/openadsdk/core/widget/uef/moa;

    .line 92
    .line 93
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->dz:Lcom/bytedance/sdk/openadsdk/core/oyt;

    .line 94
    .line 95
    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->bcc:Lcom/bytedance/sdk/openadsdk/moa/cq;

    .line 96
    .line 97
    invoke-direct {v1, v2, v3}, Lcom/bytedance/sdk/openadsdk/core/widget/uef/moa;-><init>(Lcom/bytedance/sdk/openadsdk/core/oyt;Lcom/bytedance/sdk/openadsdk/moa/cq;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/component/cz/ivm;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    .line 101
    .line 102
    .line 103
    invoke-static {}, Lcom/bytedance/sdk/component/adexpress/lw/lw;->uef()Lcom/bytedance/sdk/component/adexpress/lw/lw;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    iget-object v1, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->moa:Lcom/bytedance/sdk/component/cz/ivm;

    .line 108
    .line 109
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->dz:Lcom/bytedance/sdk/openadsdk/core/oyt;

    .line 110
    .line 111
    invoke-virtual {v0, v1, v2}, Lcom/bytedance/sdk/component/adexpress/lw/lw;->uef(Lcom/bytedance/sdk/component/cz/ivm;Lcom/bytedance/sdk/component/adexpress/lw/oa;)V

    .line 112
    .line 113
    .line 114
    :cond_2
    :goto_0
    return-void
.end method

.method public moa()Lcom/bytedance/sdk/component/cz/ivm;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->moa:Lcom/bytedance/sdk/component/cz/ivm;

    return-object v0
.end method

.method public oa(I)V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->dz:Lcom/bytedance/sdk/openadsdk/core/oyt;

    if-nez v0, :cond_0

    return-void

    .line 3
    :cond_0
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 4
    const-string v1, "zoom_type"

    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 5
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->dz:Lcom/bytedance/sdk/openadsdk/core/oyt;

    const-string v1, "expressAdViewWillZoom"

    invoke-virtual {p1, v1, v0}, Lcom/bytedance/sdk/openadsdk/core/oyt;->uef(Ljava/lang/String;Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 6
    const-string v0, "TTAD.WebViewRender"

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/bytedance/sdk/component/utils/dhk;->yo(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public oib()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->dj:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->vep()Lcom/bytedance/sdk/openadsdk/core/model/gzw$uef;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->dj:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->vep()Lcom/bytedance/sdk/openadsdk/core/model/gzw$uef;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->dhk:Lcom/bytedance/sdk/openadsdk/core/model/gzw$uef;

    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public onThemeChanged(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->dz:Lcom/bytedance/sdk/openadsdk/core/oyt;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance v0, Lorg/json/JSONObject;

    .line 7
    .line 8
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 9
    .line 10
    .line 11
    :try_start_0
    const-string v1, "status"

    .line 12
    .line 13
    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    .line 15
    .line 16
    :catch_0
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->dz:Lcom/bytedance/sdk/openadsdk/core/oyt;

    .line 17
    .line 18
    const-string v1, "themeChange"

    .line 19
    .line 20
    invoke-virtual {p1, v1, v0}, Lcom/bytedance/sdk/openadsdk/core/oyt;->uef(Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public tpx()Lcom/bytedance/sdk/openadsdk/core/oyt;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->dz:Lcom/bytedance/sdk/openadsdk/core/oyt;

    .line 2
    .line 3
    return-object v0
.end method

.method public uef(I)V
    .locals 1

    .line 26
    iget v0, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->lw:I

    if-ne p1, v0, :cond_0

    return-void

    .line 27
    :cond_0
    iput p1, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->lw:I

    if-nez p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    .line 28
    :goto_0
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->yo(Z)V

    return-void
.end method

.method public uef(Lcom/bytedance/sdk/component/adexpress/oa/dz;)V
    .locals 3

    .line 29
    invoke-super {p0, p1}, Lcom/bytedance/sdk/component/adexpress/lw/uef;->uef(Lcom/bytedance/sdk/component/adexpress/oa/dz;)V

    .line 30
    iget-boolean p1, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->yo:Z

    if-nez p1, :cond_0

    return-void

    .line 31
    :cond_0
    invoke-static {}, Lcom/bytedance/sdk/component/utils/cz;->oa()Landroid/os/Handler;

    move-result-object p1

    new-instance v0, Lcom/bytedance/sdk/openadsdk/core/zjm/ue$4;

    invoke-direct {v0, p0}, Lcom/bytedance/sdk/openadsdk/core/zjm/ue$4;-><init>(Lcom/bytedance/sdk/openadsdk/core/zjm/ue;)V

    const-wide/16 v1, 0x7d0

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public uef(Lcom/bytedance/sdk/component/adexpress/oa/xs;)V
    .locals 0

    .line 6
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->oib:Lcom/bytedance/sdk/component/adexpress/oa/xs;

    .line 7
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->orq:Lcom/bytedance/sdk/component/bcc/oa/yo;

    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/utils/km;->yo(Ljava/lang/Runnable;)V

    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/core/wk/moa/oa;)V
    .locals 1

    .line 32
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->ab:Lcom/bytedance/sdk/openadsdk/core/wk/moa/oa;

    .line 33
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->dz:Lcom/bytedance/sdk/openadsdk/core/oyt;

    if-eqz v0, :cond_0

    .line 34
    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/core/oyt;->uef(Lcom/bytedance/sdk/openadsdk/core/wk/moa/oa;)V

    :cond_0
    return-void
.end method

.method public wk()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->moa:Lcom/bytedance/sdk/component/cz/ivm;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/bytedance/sdk/component/cz/ivm;->getWebView()Landroid/webkit/WebView;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->dz:Lcom/bytedance/sdk/openadsdk/core/oyt;

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-object v1, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->moa:Lcom/bytedance/sdk/component/cz/ivm;

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/oyt;->oa(Lcom/bytedance/sdk/component/cz/ivm;)Lcom/bytedance/sdk/openadsdk/core/oyt;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->dj:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/oyt;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Lcom/bytedance/sdk/openadsdk/core/oyt;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->dj:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 29
    .line 30
    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->iou()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/oyt;->yo(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/core/oyt;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->dj:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 39
    .line 40
    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->em()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/oyt;->moa(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/core/oyt;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->zjm:Ljava/lang/String;

    .line 49
    .line 50
    invoke-static {v1}, Lcom/bytedance/sdk/openadsdk/utils/gb;->uef(Ljava/lang/String;)I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/oyt;->oa(I)Lcom/bytedance/sdk/openadsdk/core/oyt;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->dj:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 59
    .line 60
    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->kid()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/oyt;->lw(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/core/oyt;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-virtual {v0, p0}, Lcom/bytedance/sdk/openadsdk/core/oyt;->uef(Lcom/bytedance/sdk/component/adexpress/oa/dj;)Lcom/bytedance/sdk/openadsdk/core/oyt;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->wrv:Lorg/json/JSONObject;

    .line 73
    .line 74
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/oyt;->uef(Lorg/json/JSONObject;)Lcom/bytedance/sdk/openadsdk/core/oyt;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    iget-object v1, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->moa:Lcom/bytedance/sdk/component/cz/ivm;

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/oyt;->uef(Lcom/bytedance/sdk/component/cz/ivm;)Lcom/bytedance/sdk/openadsdk/core/oyt;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->cq:Lcom/bytedance/sdk/openadsdk/moa/moa/lw;

    .line 85
    .line 86
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/oyt;->uef(Lcom/bytedance/sdk/openadsdk/moa/moa/lw;)Lcom/bytedance/sdk/openadsdk/core/oyt;

    .line 87
    .line 88
    .line 89
    :cond_1
    :goto_0
    return-void
.end method

.method public wrv()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/bytedance/sdk/component/adexpress/lw/uef;->wrv()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->bs:Lcom/bytedance/sdk/openadsdk/utils/uef;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0, p0}, Lcom/bytedance/sdk/openadsdk/utils/uef;->oa(Lcom/bytedance/sdk/component/adexpress/uef;)Z

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public xs()V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/component/adexpress/lw/uef;->ivm:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 3
    :cond_0
    invoke-super {p0}, Lcom/bytedance/sdk/component/adexpress/lw/uef;->xs()V

    .line 4
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->dz:Lcom/bytedance/sdk/openadsdk/core/oyt;

    if-eqz v0, :cond_1

    .line 5
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/oyt;->yo()V

    .line 6
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->dz:Lcom/bytedance/sdk/openadsdk/core/oyt;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/oyt;->wrv()V

    const/4 v0, 0x0

    .line 7
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->dz:Lcom/bytedance/sdk/openadsdk/core/oyt;

    .line 8
    :cond_1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->bcc:Lcom/bytedance/sdk/openadsdk/moa/cq;

    if-eqz v0, :cond_2

    const/4 v1, 0x0

    .line 9
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/moa/cq;->moa(Z)V

    .line 10
    :cond_2
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/wk;->yo()Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->gzw:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 11
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->sy:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    return-void
.end method

.method public yo()I
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->dj:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->ix()I

    move-result v0

    return v0
.end method

.method public zjm()V
    .locals 4

    .line 1
    const-string v0, "expressShow"

    .line 2
    .line 3
    invoke-super {p0}, Lcom/bytedance/sdk/component/adexpress/lw/uef;->zjm()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->dz:Lcom/bytedance/sdk/openadsdk/core/oyt;

    .line 7
    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    .line 12
    .line 13
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 14
    .line 15
    .line 16
    const/4 v2, 0x1

    .line 17
    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 18
    .line 19
    .line 20
    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->dz:Lcom/bytedance/sdk/openadsdk/core/oyt;

    .line 21
    .line 22
    invoke-virtual {v3, v0, v1}, Lcom/bytedance/sdk/openadsdk/core/oyt;->uef(Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/ue;->dz:Lcom/bytedance/sdk/openadsdk/core/oyt;

    .line 26
    .line 27
    invoke-virtual {v0, v2}, Lcom/bytedance/sdk/openadsdk/core/oyt;->oa(Z)Lcom/bytedance/sdk/openadsdk/core/oyt;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 28
    .line 29
    .line 30
    :catch_0
    :goto_0
    return-void
.end method
