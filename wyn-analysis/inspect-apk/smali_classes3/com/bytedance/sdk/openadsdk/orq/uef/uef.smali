.class public Lcom/bytedance/sdk/openadsdk/orq/uef/uef;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bytedance/sdk/openadsdk/orq/uef/uef$oa;,
        Lcom/bytedance/sdk/openadsdk/orq/uef/uef$uef;
    }
.end annotation


# instance fields
.field private ab:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private bcc:Ljava/lang/String;

.field private bs:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private volatile cq:Z

.field private final cz:Ljava/lang/String;

.field private dhk:Lcom/bytedance/sdk/openadsdk/orq/uef/uef$oa;

.field private dj:Lcom/bytedance/sdk/openadsdk/cq/xs;

.field private volatile dz:Z

.field private gr:Lcom/bytedance/sdk/openadsdk/orq/uef/uef$uef;

.field private gsd:J

.field private gzw:I

.field private ivm:Lcom/bytedance/sdk/openadsdk/core/widget/zjm;

.field private final lw:Landroid/widget/FrameLayout;

.field private final moa:I

.field private final oa:Landroid/content/Context;

.field private oib:Lcom/bytedance/sdk/openadsdk/core/yo/uef;

.field private orq:I

.field private rt:Ljava/lang/StringBuilder;

.field private sy:Lcom/bytedance/sdk/openadsdk/core/widget/cz;

.field private tpx:Z

.field protected uef:Lcom/bytedance/sdk/component/cz/ivm;

.field private wk:I

.field private wrv:Z

.field private xs:Lcom/bytedance/sdk/openadsdk/core/oyt;

.field private final yo:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

.field private zjm:Lcom/bytedance/sdk/openadsdk/orq/bcc;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/core/model/gzw;IZLandroid/widget/FrameLayout;)V
    .locals 7

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move v4, p4

    move-object v5, p5

    .line 1
    invoke-direct/range {v0 .. v6}, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;-><init>(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/core/model/gzw;IZLandroid/widget/FrameLayout;Z)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/core/model/gzw;IZLandroid/widget/FrameLayout;Z)V
    .locals 8

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move v4, p4

    move-object v5, p5

    move v6, p6

    .line 2
    invoke-direct/range {v0 .. v7}, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;-><init>(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/core/model/gzw;IZLandroid/widget/FrameLayout;ZI)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/core/model/gzw;IZLandroid/widget/FrameLayout;ZI)V
    .locals 2

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 4
    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->wrv:Z

    .line 5
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->ab:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 6
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->bs:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 7
    iput v1, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->gzw:I

    const-wide/16 v0, 0x0

    .line 8
    iput-wide v0, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->gsd:J

    .line 9
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->oa:Landroid/content/Context;

    .line 10
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->yo:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 11
    iput p7, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->orq:I

    if-eqz p2, :cond_0

    .line 12
    invoke-virtual {p2}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->moa()Lcom/bytedance/sdk/openadsdk/core/model/uef;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p2}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->moa()Lcom/bytedance/sdk/openadsdk/core/model/uef;

    move-result-object p1

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/model/uef;->lw()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 13
    invoke-virtual {p2}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->moa()Lcom/bytedance/sdk/openadsdk/core/model/uef;

    move-result-object p1

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/model/uef;->lw()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    iput p1, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->gzw:I

    .line 14
    :cond_0
    iput p3, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->moa:I

    .line 15
    invoke-virtual {p2}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->cl()Lcom/bytedance/sdk/openadsdk/AdSlot;

    move-result-object p1

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/AdSlot;->getDurationSlotType()I

    move-result p1

    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/utils/gb;->yo(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->bcc:Ljava/lang/String;

    .line 16
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/utils/gb;->uef(Ljava/lang/String;)I

    move-result p1

    .line 17
    iput-boolean p6, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->tpx:Z

    if-eqz p6, :cond_1

    .line 18
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/utils/gb;->oa(I)Ljava/lang/String;

    move-result-object p3

    iput-object p3, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->bcc:Ljava/lang/String;

    .line 19
    :cond_1
    invoke-static {p2}, Lcom/bytedance/sdk/openadsdk/core/model/cp;->wrv(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->cz:Ljava/lang/String;

    .line 20
    iput-object p5, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->lw:Landroid/widget/FrameLayout;

    .line 21
    invoke-direct {p0, p5}, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->uef(Landroid/widget/FrameLayout;)V

    .line 22
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->uef(I)V

    .line 23
    invoke-direct {p0, p4}, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->yo(Z)V

    .line 24
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->bcc()V

    return-void
.end method

.method public static synthetic bcc(Lcom/bytedance/sdk/openadsdk/orq/uef/uef;)Ljava/lang/StringBuilder;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->rt:Ljava/lang/StringBuilder;

    return-object p0
.end method

.method private bcc()V
    .locals 8

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->uef:Lcom/bytedance/sdk/component/cz/ivm;

    new-instance v1, Lcom/bytedance/sdk/openadsdk/orq/uef/uef$5;

    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->uef()Landroid/content/Context;

    move-result-object v3

    iget-object v4, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->xs:Lcom/bytedance/sdk/openadsdk/core/oyt;

    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->yo:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-virtual {v2}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->iou()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x1

    move-object v2, p0

    invoke-direct/range {v1 .. v7}, Lcom/bytedance/sdk/openadsdk/orq/uef/uef$5;-><init>(Lcom/bytedance/sdk/openadsdk/orq/uef/uef;Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/core/oyt;Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/moa/cq;Z)V

    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/component/cz/ivm;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 3
    iget-object v0, v2, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->uef:Lcom/bytedance/sdk/component/cz/ivm;

    new-instance v1, Lcom/bytedance/sdk/openadsdk/orq/uef/uef$6;

    iget-object v3, v2, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->xs:Lcom/bytedance/sdk/openadsdk/core/oyt;

    invoke-direct {v1, p0, v3}, Lcom/bytedance/sdk/openadsdk/orq/uef/uef$6;-><init>(Lcom/bytedance/sdk/openadsdk/orq/uef/uef;Lcom/bytedance/sdk/openadsdk/core/oyt;)V

    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/component/cz/ivm;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    .line 4
    iget-object v0, v2, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->oa:Landroid/content/Context;

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/widget/uef/yo;->uef(Landroid/content/Context;)Lcom/bytedance/sdk/openadsdk/core/widget/uef/yo;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/widget/uef/yo;->uef(Z)Lcom/bytedance/sdk/openadsdk/core/widget/uef/yo;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/widget/uef/yo;->oa(Z)Lcom/bytedance/sdk/openadsdk/core/widget/uef/yo;

    move-result-object v0

    iget-object v3, v2, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->uef:Lcom/bytedance/sdk/component/cz/ivm;

    invoke-virtual {v3}, Lcom/bytedance/sdk/component/cz/ivm;->getWebView()Landroid/webkit/WebView;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/bytedance/sdk/openadsdk/core/widget/uef/yo;->uef(Landroid/webkit/WebView;)V

    .line 5
    iget-object v0, v2, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->uef:Lcom/bytedance/sdk/component/cz/ivm;

    invoke-virtual {v0}, Lcom/bytedance/sdk/component/cz/ivm;->getWebView()Landroid/webkit/WebView;

    move-result-object v3

    const/16 v4, 0x1f45

    invoke-static {v3, v4}, Lcom/bytedance/sdk/openadsdk/utils/dhk;->uef(Landroid/webkit/WebView;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/bytedance/sdk/component/cz/ivm;->setUserAgentString(Ljava/lang/String;)V

    .line 6
    iget-object v0, v2, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->uef:Lcom/bytedance/sdk/component/cz/ivm;

    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/component/cz/ivm;->setMixedContentMode(I)V

    return-void
.end method

.method public static synthetic cq(Lcom/bytedance/sdk/openadsdk/orq/uef/uef;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->ab:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic cz(Lcom/bytedance/sdk/openadsdk/orq/uef/uef;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->gsd:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public static synthetic dj(Lcom/bytedance/sdk/openadsdk/orq/uef/uef;)Lcom/bytedance/sdk/openadsdk/core/widget/cz;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->sy:Lcom/bytedance/sdk/openadsdk/core/widget/cz;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic dz(Lcom/bytedance/sdk/openadsdk/orq/uef/uef;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->cz:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic ivm(Lcom/bytedance/sdk/openadsdk/orq/uef/uef;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->wrv:Z

    return p0
.end method

.method public static synthetic lw(Lcom/bytedance/sdk/openadsdk/orq/uef/uef;)Lcom/bytedance/sdk/openadsdk/orq/bcc;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->zjm:Lcom/bytedance/sdk/openadsdk/orq/bcc;

    return-object p0
.end method

.method public static synthetic moa(Lcom/bytedance/sdk/openadsdk/orq/uef/uef;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->bcc:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic oa(Lcom/bytedance/sdk/openadsdk/orq/uef/uef;)Lcom/bytedance/sdk/openadsdk/cq/xs;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->dj:Lcom/bytedance/sdk/openadsdk/cq/xs;

    return-object p0
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/orq/uef/uef;)Lcom/bytedance/sdk/openadsdk/core/oyt;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->xs:Lcom/bytedance/sdk/openadsdk/core/oyt;

    return-object p0
.end method

.method private uef(I)V
    .locals 7

    .line 21
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const/4 v1, 0x3

    .line 22
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "click_scence"

    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    new-instance v2, Lcom/bytedance/sdk/openadsdk/core/oyt;

    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->oa:Landroid/content/Context;

    invoke-direct {v2, v3}, Lcom/bytedance/sdk/openadsdk/core/oyt;-><init>(Landroid/content/Context;)V

    iput-object v2, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->xs:Lcom/bytedance/sdk/openadsdk/core/oyt;

    .line 24
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->yo:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-virtual {v2}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->kid()Ljava/lang/String;

    move-result-object v2

    .line 25
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 26
    :try_start_0
    const-string v4, "isMultiAd"

    iget-object v5, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->yo:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-virtual {v5}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->gem()Z

    move-result v5

    invoke-virtual {v3, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 27
    const-string v4, "currentIndex"

    iget v5, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->orq:I

    invoke-virtual {v3, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 28
    const-string v4, "totalAdCount"

    iget v5, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->gzw:I

    invoke-virtual {v3, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    :catch_0
    iget-object v4, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->xs:Lcom/bytedance/sdk/openadsdk/core/oyt;

    iget-object v5, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->uef:Lcom/bytedance/sdk/component/cz/ivm;

    invoke-virtual {v4, v5}, Lcom/bytedance/sdk/openadsdk/core/oyt;->oa(Lcom/bytedance/sdk/component/cz/ivm;)Lcom/bytedance/sdk/openadsdk/core/oyt;

    move-result-object v4

    iget-object v5, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->yo:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 30
    invoke-virtual {v4, v5}, Lcom/bytedance/sdk/openadsdk/core/oyt;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Lcom/bytedance/sdk/openadsdk/core/oyt;

    move-result-object v4

    iget-object v5, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->yo:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    const/4 v6, 0x1

    .line 31
    invoke-static {v5, v6, v3}, Lcom/bytedance/sdk/openadsdk/core/zjm/oa/yo;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;ZLorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object v3

    invoke-virtual {v4, v3}, Lcom/bytedance/sdk/openadsdk/core/oyt;->uef(Lorg/json/JSONObject;)Lcom/bytedance/sdk/openadsdk/core/oyt;

    move-result-object v3

    iget-object v4, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->yo:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 32
    invoke-virtual {v4}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->iou()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/bytedance/sdk/openadsdk/core/oyt;->yo(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/core/oyt;

    move-result-object v3

    iget-object v4, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->yo:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 33
    invoke-virtual {v4}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->em()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/bytedance/sdk/openadsdk/core/oyt;->moa(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/core/oyt;

    move-result-object v3

    .line 34
    invoke-virtual {v3, p1}, Lcom/bytedance/sdk/openadsdk/core/oyt;->oa(I)Lcom/bytedance/sdk/openadsdk/core/oyt;

    move-result-object p1

    .line 35
    invoke-virtual {p1, v2}, Lcom/bytedance/sdk/openadsdk/core/oyt;->lw(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/core/oyt;

    move-result-object p1

    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->uef:Lcom/bytedance/sdk/component/cz/ivm;

    .line 36
    invoke-virtual {p1, v2}, Lcom/bytedance/sdk/openadsdk/core/oyt;->uef(Lcom/bytedance/sdk/component/cz/ivm;)Lcom/bytedance/sdk/openadsdk/core/oyt;

    move-result-object p1

    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->bcc:Ljava/lang/String;

    .line 37
    invoke-virtual {p1, v2}, Lcom/bytedance/sdk/openadsdk/core/oyt;->oa(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/core/oyt;

    move-result-object p1

    .line 38
    invoke-virtual {p1, v0}, Lcom/bytedance/sdk/openadsdk/core/oyt;->uef(Ljava/util/Map;)Lcom/bytedance/sdk/openadsdk/core/oyt;

    move-result-object p1

    new-instance v0, Lcom/bytedance/sdk/openadsdk/moa/oib;

    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->bcc:Ljava/lang/String;

    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->yo:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-direct {v0, v1, v2, v3}, Lcom/bytedance/sdk/openadsdk/moa/oib;-><init>(ILjava/lang/String;Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V

    .line 39
    invoke-virtual {p1, v0}, Lcom/bytedance/sdk/openadsdk/core/oyt;->uef(Lcom/bytedance/sdk/openadsdk/moa/moa/lw;)Lcom/bytedance/sdk/openadsdk/core/oyt;

    return-void
.end method

.method private uef(Landroid/widget/FrameLayout;)V
    .locals 6

    .line 4
    new-instance v0, Lcom/bytedance/sdk/component/cz/ivm;

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->oa:Landroid/content/Context;

    sget-object v2, Lcom/bytedance/sdk/component/cz/ivm$yo;->ivm:Lcom/bytedance/sdk/component/cz/ivm$yo;

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3, v2}, Lcom/bytedance/sdk/component/cz/ivm;-><init>(Landroid/content/Context;ZLcom/bytedance/sdk/component/cz/ivm$yo;)V

    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->uef:Lcom/bytedance/sdk/component/cz/ivm;

    .line 5
    invoke-virtual {v0}, Lcom/bytedance/sdk/component/cz/ivm;->lw()V

    .line 6
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->uef:Lcom/bytedance/sdk/component/cz/ivm;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/bytedance/sdk/component/cz/ivm;->setLayerType(ILandroid/graphics/Paint;)V

    .line 7
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->uef:Lcom/bytedance/sdk/component/cz/ivm;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/component/cz/ivm;->setVisibility(I)V

    .line 8
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->uef:Lcom/bytedance/sdk/component/cz/ivm;

    const/high16 v1, -0x1000000

    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/component/cz/ivm;->setBackgroundColor(I)V

    .line 9
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->uef:Lcom/bytedance/sdk/component/cz/ivm;

    invoke-virtual {v0, v3}, Landroid/view/View;->setEnabled(Z)V

    .line 10
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->uef:Lcom/bytedance/sdk/component/cz/ivm;

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->bcc:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/component/cz/ivm;->setTag(Ljava/lang/String;)V

    .line 11
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->uef:Lcom/bytedance/sdk/component/cz/ivm;

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->yo:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->cuu()Lcom/bytedance/sdk/component/cz/oa/uef;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/component/cz/ivm;->setMaterialMeta(Lcom/bytedance/sdk/component/cz/oa/uef;)V

    .line 12
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->uef:Lcom/bytedance/sdk/component/cz/ivm;

    invoke-virtual {v0, v3}, Lcom/bytedance/sdk/component/cz/ivm;->setLandingPage(Z)V

    .line 13
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->uef:Lcom/bytedance/sdk/component/cz/ivm;

    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v2, -0x1

    invoke-direct {v1, v2, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p1, v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 14
    new-instance v0, Lcom/bytedance/sdk/openadsdk/core/widget/cz;

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->oa:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/widget/cz;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->sy:Lcom/bytedance/sdk/openadsdk/core/widget/cz;

    .line 15
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->yo:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->bcc:Ljava/lang/String;

    iget-object v4, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->oib:Lcom/bytedance/sdk/openadsdk/core/yo/uef;

    iget-boolean v5, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->tpx:Z

    invoke-virtual {v0, v1, v3, v4, v5}, Lcom/bytedance/sdk/openadsdk/core/widget/cz;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/yo/uef;Z)V

    .line 16
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->sy:Lcom/bytedance/sdk/openadsdk/core/widget/cz;

    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v1, v2, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p1, v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 17
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->yo:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->hve()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 18
    new-instance v0, Lcom/bytedance/sdk/openadsdk/core/widget/zjm;

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->oa:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/widget/zjm;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->ivm:Lcom/bytedance/sdk/openadsdk/core/widget/zjm;

    .line 19
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/widget/xs;->oa()V

    .line 20
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->ivm:Lcom/bytedance/sdk/openadsdk/core/widget/zjm;

    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v1, v2, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p1, v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    :cond_0
    return-void
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/orq/uef/uef;Z)Z
    .locals 0

    .line 2
    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->wrv:Z

    return p1
.end method

.method public static synthetic wrv(Lcom/bytedance/sdk/openadsdk/orq/uef/uef;)Lcom/bytedance/sdk/openadsdk/orq/uef/uef$uef;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->gr:Lcom/bytedance/sdk/openadsdk/orq/uef/uef$uef;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic xs(Lcom/bytedance/sdk/openadsdk/orq/uef/uef;)Lcom/bytedance/sdk/openadsdk/core/widget/zjm;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->ivm:Lcom/bytedance/sdk/openadsdk/core/widget/zjm;

    return-object p0
.end method

.method public static synthetic yo(Lcom/bytedance/sdk/openadsdk/orq/uef/uef;)Lcom/bytedance/sdk/openadsdk/core/model/gzw;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->yo:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    return-object p0
.end method

.method private yo(Z)V
    .locals 5

    .line 2
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 3
    :try_start_0
    const-string v1, "cid"

    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->yo:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-virtual {v2}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->iou()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 4
    const-string v1, "log_extra"

    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->yo:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-virtual {v2}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->em()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    :catchall_0
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/zjm;->oa()Lcom/bytedance/sdk/openadsdk/core/zjm;

    move-result-object v1

    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/core/zjm;->wk()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 6
    new-instance v1, Lcom/bytedance/sdk/openadsdk/orq/uef/uef$1;

    invoke-direct {v1, p0}, Lcom/bytedance/sdk/openadsdk/orq/uef/uef$1;-><init>(Lcom/bytedance/sdk/openadsdk/orq/uef/uef;)V

    invoke-static {v1}, Lcom/bytedance/sdk/openadsdk/orq/xs;->uef(Lcom/bytedance/sdk/openadsdk/orq/xs$uef;)V

    .line 7
    :cond_0
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->uef()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->uef:Lcom/bytedance/sdk/component/cz/ivm;

    invoke-virtual {v2}, Lcom/bytedance/sdk/component/cz/ivm;->getWebView()Landroid/webkit/WebView;

    move-result-object v2

    new-instance v3, Lcom/bytedance/sdk/openadsdk/orq/uef/uef$2;

    invoke-direct {v3, p0}, Lcom/bytedance/sdk/openadsdk/orq/uef/uef$2;-><init>(Lcom/bytedance/sdk/openadsdk/orq/uef/uef;)V

    new-instance v4, Lcom/bytedance/sdk/openadsdk/orq/uef/uef$3;

    invoke-direct {v4, p0}, Lcom/bytedance/sdk/openadsdk/orq/uef/uef$3;-><init>(Lcom/bytedance/sdk/openadsdk/orq/uef/uef;)V

    invoke-static {v1, v2, v3, v4}, Lcom/bytedance/sdk/openadsdk/orq/bcc;->uef(Landroid/content/Context;Landroid/webkit/WebView;Lcom/bytedance/sdk/openadsdk/orq/yo;Lcom/bytedance/sdk/openadsdk/orq/uef;)Lcom/bytedance/sdk/openadsdk/orq/bcc;

    move-result-object v1

    iput-object v1, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->zjm:Lcom/bytedance/sdk/openadsdk/orq/bcc;

    .line 8
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->cz:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/bytedance/sdk/openadsdk/orq/bcc;->xs(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/orq/bcc;

    move-result-object v1

    .line 9
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->uef()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lcom/bytedance/sdk/openadsdk/common/yo;->uef(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/bytedance/sdk/openadsdk/orq/bcc;->lw(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/orq/bcc;

    move-result-object v1

    .line 10
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/common/yo;->xs()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/bytedance/sdk/openadsdk/orq/bcc;->oa(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/orq/bcc;

    move-result-object v1

    .line 11
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/common/yo;->uef()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/bytedance/sdk/openadsdk/orq/bcc;->uef(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/orq/bcc;

    move-result-object v1

    .line 12
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/common/yo;->ivm()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/bytedance/sdk/openadsdk/orq/bcc;->moa(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/orq/bcc;

    move-result-object v1

    .line 13
    invoke-virtual {v1, v0}, Lcom/bytedance/sdk/openadsdk/orq/bcc;->yo(Lorg/json/JSONObject;)Lcom/bytedance/sdk/openadsdk/orq/bcc;

    move-result-object v0

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->yo:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 14
    invoke-static {v1}, Lcom/bytedance/sdk/openadsdk/core/model/cp;->zjm(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/orq/bcc;->yo(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/orq/bcc;

    move-result-object v0

    const/4 v1, 0x1

    .line 15
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/orq/bcc;->moa(Z)Lcom/bytedance/sdk/openadsdk/orq/bcc;

    move-result-object v0

    .line 16
    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/orq/bcc;->uef(Z)Lcom/bytedance/sdk/openadsdk/orq/bcc;

    move-result-object p1

    const/4 v0, 0x0

    .line 17
    invoke-virtual {p1, v0}, Lcom/bytedance/sdk/openadsdk/orq/bcc;->yo(Z)Lcom/bytedance/sdk/openadsdk/orq/bcc;

    move-result-object p1

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->yo:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 18
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/model/cp;->bs(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lcom/bytedance/sdk/openadsdk/orq/bcc;->uef(J)Lcom/bytedance/sdk/openadsdk/orq/bcc;

    move-result-object p1

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->yo:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 19
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/model/cp;->bs(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lcom/bytedance/sdk/openadsdk/orq/bcc;->oa(J)Lcom/bytedance/sdk/openadsdk/orq/bcc;

    move-result-object p1

    const-string v0, "sdkEdition"

    .line 20
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/common/yo;->yo()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/bytedance/sdk/openadsdk/orq/bcc;->uef(Ljava/lang/String;Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/orq/bcc;

    move-result-object p1

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->yo:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 21
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/model/cp;->ivm(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    move-result v0

    invoke-virtual {p1, v0}, Lcom/bytedance/sdk/openadsdk/orq/bcc;->lw(Z)Lcom/bytedance/sdk/openadsdk/orq/bcc;

    move-result-object p1

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->bcc:Ljava/lang/String;

    .line 22
    invoke-virtual {p1, v0}, Lcom/bytedance/sdk/openadsdk/orq/bcc;->ivm(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/orq/bcc;

    .line 23
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->zjm:Lcom/bytedance/sdk/openadsdk/orq/bcc;

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->oa:Landroid/content/Context;

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/orq/lw;->oa(Landroid/content/Context;)F

    move-result v0

    invoke-virtual {p1, v0}, Lcom/bytedance/sdk/openadsdk/orq/bcc;->uef(F)Lcom/bytedance/sdk/openadsdk/orq/bcc;

    .line 24
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->zjm:Lcom/bytedance/sdk/openadsdk/orq/bcc;

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/orq/bcc;->dj()Ljava/util/Set;

    move-result-object p1

    .line 25
    new-instance v0, Ljava/lang/ref/WeakReference;

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->zjm:Lcom/bytedance/sdk/openadsdk/orq/bcc;

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 26
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 27
    const-string v2, "subscribe_app_ad"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    const-string v2, "adInfo"

    .line 28
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    const-string v2, "webview_time_track"

    .line 29
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    const-string v2, "download_app_ad"

    .line 30
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 31
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->xs:Lcom/bytedance/sdk/openadsdk/core/oyt;

    invoke-virtual {v2}, Lcom/bytedance/sdk/openadsdk/core/oyt;->oa()Lcom/bytedance/sdk/component/uef/wk;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 32
    new-instance v3, Lcom/bytedance/sdk/openadsdk/orq/uef/uef$4;

    invoke-direct {v3, p0, v0}, Lcom/bytedance/sdk/openadsdk/orq/uef/uef$4;-><init>(Lcom/bytedance/sdk/openadsdk/orq/uef/uef;Ljava/lang/ref/WeakReference;)V

    invoke-virtual {v2, v1, v3}, Lcom/bytedance/sdk/component/uef/wk;->uef(Ljava/lang/String;Lcom/bytedance/sdk/component/uef/moa;)Lcom/bytedance/sdk/component/uef/wk;

    goto :goto_0

    :cond_2
    return-void
.end method

.method public static synthetic zjm(Lcom/bytedance/sdk/openadsdk/orq/uef/uef;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->cq:Z

    .line 2
    .line 3
    return p0
.end method


# virtual methods
.method public ivm()Z
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->xs:Lcom/bytedance/sdk/openadsdk/core/oyt;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/oyt;->ivm()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public lw()Z
    .locals 1

    .line 2
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->cq:Z

    return v0
.end method

.method public moa()V
    .locals 5

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->zjm:Lcom/bytedance/sdk/openadsdk/orq/bcc;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/orq/bcc;->km()V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->uef:Lcom/bytedance/sdk/component/cz/ivm;

    if-eqz v0, :cond_1

    .line 5
    invoke-virtual {v0}, Lcom/bytedance/sdk/component/cz/ivm;->ab()V

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->xs:Lcom/bytedance/sdk/openadsdk/core/oyt;

    if-eqz v0, :cond_2

    .line 7
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/oyt;->wrv()V

    .line 8
    :cond_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->gsd:J

    .line 9
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->rt:Ljava/lang/StringBuilder;

    .line 10
    :try_start_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v0

    .line 11
    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_3

    aget-object v3, v0, v2

    .line 12
    iget-object v4, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->rt:Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, "\n"

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 13
    const-string v1, "PlayableManager"

    const-string v2, "onDestroy() error"

    invoke-static {v1, v2, v0}, Lcom/bytedance/sdk/component/utils/dhk;->uef(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    const/4 v0, 0x0

    .line 14
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->uef:Lcom/bytedance/sdk/component/cz/ivm;

    return-void
.end method

.method public oa()V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->ab:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->zjm:Lcom/bytedance/sdk/openadsdk/orq/bcc;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    .line 3
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/orq/bcc;->yo(Z)Lcom/bytedance/sdk/openadsdk/orq/bcc;

    :cond_0
    return-void
.end method

.method public oa(Z)V
    .locals 1

    .line 4
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->zjm:Lcom/bytedance/sdk/openadsdk/orq/bcc;

    if-eqz v0, :cond_0

    .line 5
    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/orq/bcc;->lw(Z)Lcom/bytedance/sdk/openadsdk/orq/bcc;

    :cond_0
    return-void
.end method

.method public uef()V
    .locals 9

    .line 47
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->ab:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 48
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->lw:Landroid/widget/FrameLayout;

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    .line 49
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 50
    :cond_1
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->dz:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->ivm:Lcom/bytedance/sdk/openadsdk/core/widget/zjm;

    if-eqz v0, :cond_2

    .line 51
    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->yo:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    iget v4, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->moa:I

    invoke-virtual {v0, v3, v4}, Lcom/bytedance/sdk/openadsdk/core/widget/zjm;->oa(Lcom/bytedance/sdk/openadsdk/core/model/gzw;I)V

    .line 52
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->zjm:Lcom/bytedance/sdk/openadsdk/orq/bcc;

    if-eqz v0, :cond_5

    .line 53
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/orq/bcc;->ku()V

    goto :goto_0

    .line 54
    :cond_2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->zjm:Lcom/bytedance/sdk/openadsdk/orq/bcc;

    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/orq/bcc;->yo(Z)Lcom/bytedance/sdk/openadsdk/orq/bcc;

    .line 55
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->xs:Lcom/bytedance/sdk/openadsdk/core/oyt;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/oyt;->dz()Lcom/bytedance/sdk/openadsdk/core/wk/moa/oa;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 56
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->xs:Lcom/bytedance/sdk/openadsdk/core/oyt;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/oyt;->dz()Lcom/bytedance/sdk/openadsdk/core/wk/moa/oa;

    move-result-object v0

    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/core/wk/moa/oa;->lw()V

    .line 57
    :cond_3
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->gr:Lcom/bytedance/sdk/openadsdk/orq/uef/uef$uef;

    if-eqz v0, :cond_4

    .line 58
    iget v1, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->wk:I

    invoke-interface {v0, v1}, Lcom/bytedance/sdk/openadsdk/orq/uef/uef$uef;->uef(I)V

    :cond_4
    move v1, v2

    .line 59
    :cond_5
    :goto_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->zjm:Lcom/bytedance/sdk/openadsdk/orq/bcc;

    if-eqz v0, :cond_6

    .line 60
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    iget-object v5, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->yo:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    iget-object v6, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->bcc:Ljava/lang/String;

    new-instance v8, Lcom/bytedance/sdk/openadsdk/orq/uef/uef$7;

    invoke-direct {v8, p0, v1}, Lcom/bytedance/sdk/openadsdk/orq/uef/uef$7;-><init>(Lcom/bytedance/sdk/openadsdk/orq/uef/uef;Z)V

    const-string v7, "playable_track"

    invoke-static/range {v3 .. v8}, Lcom/bytedance/sdk/openadsdk/moa/yo;->uef(JLcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/ab/oa/oa;)V

    .line 61
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->zjm:Lcom/bytedance/sdk/openadsdk/orq/bcc;

    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/wk/yo/uef;->uef()Lcom/bytedance/sdk/openadsdk/core/wk/yo/uef;

    move-result-object v1

    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->yo:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-virtual {v1, v3}, Lcom/bytedance/sdk/openadsdk/core/wk/yo/uef;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/orq/bcc;->ivm(Z)V

    .line 62
    :cond_6
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->uef:Lcom/bytedance/sdk/component/cz/ivm;

    if-eqz v0, :cond_7

    .line 63
    invoke-virtual {v0, v2}, Lcom/bytedance/sdk/component/cz/ivm;->setVisibility(I)V

    return-void

    .line 64
    :cond_7
    new-instance v0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef$8;

    invoke-direct {v0, p0}, Lcom/bytedance/sdk/openadsdk/orq/uef/uef$8;-><init>(Lcom/bytedance/sdk/openadsdk/orq/uef/uef;)V

    const-string v1, "plb_npe_crash"

    invoke-static {v1, v2, v0}, Lcom/bytedance/sdk/openadsdk/ab/moa;->uef(Ljava/lang/String;ZLcom/bytedance/sdk/openadsdk/ab/oa;)V

    return-void
.end method

.method public uef(II)V
    .locals 3

    .line 65
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->dz:Z

    if-eqz v0, :cond_0

    goto/16 :goto_1

    :cond_0
    const/4 v0, 0x1

    .line 66
    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->dz:Z

    .line 67
    iput p1, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->wk:I

    const/4 v1, 0x3

    const/4 v2, 0x2

    if-ne p1, v2, :cond_1

    .line 68
    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->cq:Z

    .line 69
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->zjm:Lcom/bytedance/sdk/openadsdk/orq/bcc;

    invoke-virtual {v2, v1}, Lcom/bytedance/sdk/openadsdk/orq/bcc;->uef(I)V

    goto :goto_0

    :cond_1
    if-ne p1, v0, :cond_2

    .line 70
    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->cq:Z

    .line 71
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->zjm:Lcom/bytedance/sdk/openadsdk/orq/bcc;

    invoke-virtual {v1, v2}, Lcom/bytedance/sdk/openadsdk/orq/bcc;->uef(I)V

    goto :goto_0

    :cond_2
    if-ne p1, v1, :cond_3

    .line 72
    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->cq:Z

    .line 73
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->zjm:Lcom/bytedance/sdk/openadsdk/orq/bcc;

    const/4 v2, 0x4

    invoke-virtual {v1, v2}, Lcom/bytedance/sdk/openadsdk/orq/bcc;->uef(I)V

    goto :goto_0

    :cond_3
    if-nez p1, :cond_4

    .line 74
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->zjm:Lcom/bytedance/sdk/openadsdk/orq/bcc;

    invoke-virtual {v1, v0}, Lcom/bytedance/sdk/openadsdk/orq/bcc;->uef(I)V

    .line 75
    :cond_4
    :goto_0
    iget-boolean v1, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->cq:Z

    if-eqz v1, :cond_5

    .line 76
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->dhk:Lcom/bytedance/sdk/openadsdk/orq/uef/uef$oa;

    if-eqz v1, :cond_5

    .line 77
    invoke-interface {v1}, Lcom/bytedance/sdk/openadsdk/orq/uef/uef$oa;->uef()V

    .line 78
    :cond_5
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->ab:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v1

    if-eqz v1, :cond_6

    .line 79
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->zjm:Lcom/bytedance/sdk/openadsdk/orq/bcc;

    if-eqz v1, :cond_6

    .line 80
    invoke-virtual {v1, v0}, Lcom/bytedance/sdk/openadsdk/orq/bcc;->yo(Z)Lcom/bytedance/sdk/openadsdk/orq/bcc;

    .line 81
    :cond_6
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->xs:Lcom/bytedance/sdk/openadsdk/core/oyt;

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/oyt;->dz()Lcom/bytedance/sdk/openadsdk/core/wk/moa/oa;

    move-result-object v0

    if-eqz v0, :cond_7

    .line 82
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->xs:Lcom/bytedance/sdk/openadsdk/core/oyt;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/oyt;->dz()Lcom/bytedance/sdk/openadsdk/core/wk/moa/oa;

    move-result-object v0

    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/core/wk/moa/oa;->lw()V

    .line 83
    :cond_7
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->cq:Z

    if-nez v0, :cond_8

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->gr:Lcom/bytedance/sdk/openadsdk/orq/uef/uef$uef;

    if-eqz v0, :cond_8

    .line 84
    invoke-interface {v0, p1}, Lcom/bytedance/sdk/openadsdk/orq/uef/uef$uef;->uef(I)V

    .line 85
    :cond_8
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->ivm:Lcom/bytedance/sdk/openadsdk/core/widget/zjm;

    if-eqz v0, :cond_9

    .line 86
    new-instance v1, Lcom/bytedance/sdk/openadsdk/orq/uef/uef$9;

    invoke-direct {v1, p0, p1, p2}, Lcom/bytedance/sdk/openadsdk/orq/uef/uef$9;-><init>(Lcom/bytedance/sdk/openadsdk/orq/uef/uef;II)V

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_9
    :goto_1
    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/core/wk/moa/oa;)V
    .locals 1

    .line 97
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->xs:Lcom/bytedance/sdk/openadsdk/core/oyt;

    if-eqz v0, :cond_0

    .line 98
    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/core/oyt;->uef(Lcom/bytedance/sdk/openadsdk/core/wk/moa/oa;)V

    :cond_0
    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/core/yo/uef;)V
    .locals 1

    .line 89
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->oib:Lcom/bytedance/sdk/openadsdk/core/yo/uef;

    .line 90
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->ivm:Lcom/bytedance/sdk/openadsdk/core/widget/zjm;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/widget/xs;->getDownloadButton()Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 91
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->ivm:Lcom/bytedance/sdk/openadsdk/core/widget/zjm;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/widget/xs;->getDownloadButton()Lcom/bytedance/sdk/openadsdk/core/ivm/bcc;

    move-result-object v0

    .line 92
    invoke-virtual {v0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 93
    invoke-virtual {v0, p1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 94
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->sy:Lcom/bytedance/sdk/openadsdk/core/widget/cz;

    if-eqz v0, :cond_1

    .line 95
    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/core/widget/cz;->setClickListener(Lcom/bytedance/sdk/openadsdk/core/yo/uef;)V

    :cond_1
    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/orq/uef/uef$oa;)V
    .locals 0

    .line 96
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->dhk:Lcom/bytedance/sdk/openadsdk/orq/uef/uef$oa;

    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/orq/uef/uef$uef;)V
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->gr:Lcom/bytedance/sdk/openadsdk/orq/uef/uef$uef;

    return-void
.end method

.method public uef(Z)V
    .locals 1

    .line 87
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->zjm:Lcom/bytedance/sdk/openadsdk/orq/bcc;

    if-eqz v0, :cond_0

    .line 88
    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/orq/bcc;->uef(Z)Lcom/bytedance/sdk/openadsdk/orq/bcc;

    :cond_0
    return-void
.end method

.method public uef(ZLcom/bytedance/sdk/openadsdk/cq/xs;)V
    .locals 1

    .line 40
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->dj:Lcom/bytedance/sdk/openadsdk/cq/xs;

    .line 41
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->zjm:Lcom/bytedance/sdk/openadsdk/orq/bcc;

    invoke-virtual {p2, p1}, Lcom/bytedance/sdk/openadsdk/orq/bcc;->oa(Z)Lcom/bytedance/sdk/openadsdk/orq/bcc;

    .line 42
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/wk/yo/uef;->uef()Lcom/bytedance/sdk/openadsdk/core/wk/yo/uef;

    move-result-object p1

    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->yo:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-virtual {p1, p2}, Lcom/bytedance/sdk/openadsdk/core/wk/yo/uef;->oa(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V

    .line 43
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->uef:Lcom/bytedance/sdk/component/cz/ivm;

    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->cz:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/bytedance/sdk/component/cz/ivm;->a_(Ljava/lang/String;)V

    .line 44
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->zjm:Lcom/bytedance/sdk/openadsdk/orq/bcc;

    if-eqz p1, :cond_0

    .line 45
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/wk/yo/uef;->uef()Lcom/bytedance/sdk/openadsdk/core/wk/yo/uef;

    move-result-object p2

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->yo:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-virtual {p2, v0}, Lcom/bytedance/sdk/openadsdk/core/wk/yo/uef;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    move-result p2

    invoke-virtual {p1, p2}, Lcom/bytedance/sdk/openadsdk/orq/bcc;->ivm(Z)V

    .line 46
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->zjm:Lcom/bytedance/sdk/openadsdk/orq/bcc;

    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->cz:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/bytedance/sdk/openadsdk/orq/bcc;->bcc(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public xs()Lcom/bytedance/sdk/openadsdk/core/oyt;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->xs:Lcom/bytedance/sdk/openadsdk/core/oyt;

    return-object v0
.end method

.method public yo()V
    .locals 2

    .line 33
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->ab:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/orq/uef/uef;->zjm:Lcom/bytedance/sdk/openadsdk/orq/bcc;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 34
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/orq/bcc;->yo(Z)Lcom/bytedance/sdk/openadsdk/orq/bcc;

    :cond_0
    return-void
.end method
