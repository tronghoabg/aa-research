.class public Lcom/bytedance/sdk/openadsdk/core/moa/uef;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bytedance/sdk/openadsdk/core/moa/uef$uef;
    }
.end annotation


# instance fields
.field private final ab:I

.field private final bcc:Z

.field private bs:I

.field private final cq:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private cz:Z

.field private dj:Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;

.field private dz:Z

.field private final ivm:Landroid/content/Context;

.field private lw:Lcom/bytedance/sdk/openadsdk/api/banner/PAGBannerAdWrapperListener;

.field private moa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

.field protected oa:Lcom/bytedance/sdk/openadsdk/AdSlot;

.field private oib:J

.field private final sy:Landroid/view/View$OnAttachStateChangeListener;

.field protected uef:Lcom/bytedance/sdk/openadsdk/core/moa/moa;

.field private final wk:I

.field private wrv:Lcom/bytedance/sdk/openadsdk/core/moa/xs;

.field private xs:J

.field private yo:Ljava/lang/String;

.field private zjm:Lcom/bytedance/sdk/openadsdk/tpx/uef/uef/yo;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Lcom/bytedance/sdk/openadsdk/AdSlot;Lcom/bytedance/sdk/openadsdk/core/moa/xs;Z)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "banner_ad"

    .line 5
    .line 6
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->yo:Ljava/lang/String;

    .line 7
    .line 8
    const-wide/16 v0, 0x0

    .line 9
    .line 10
    iput-wide v0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->xs:J

    .line 11
    .line 12
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->cq:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 19
    .line 20
    iput-boolean v1, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->dz:Z

    .line 21
    .line 22
    const/4 v0, 0x1

    .line 23
    iput v0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->wk:I

    .line 24
    .line 25
    iput v1, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->ab:I

    .line 26
    .line 27
    const/4 v0, -0x1

    .line 28
    iput v0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->bs:I

    .line 29
    .line 30
    new-instance v0, Lcom/bytedance/sdk/openadsdk/core/moa/uef$1;

    .line 31
    .line 32
    invoke-direct {v0, p0}, Lcom/bytedance/sdk/openadsdk/core/moa/uef$1;-><init>(Lcom/bytedance/sdk/openadsdk/core/moa/uef;)V

    .line 33
    .line 34
    .line 35
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->sy:Landroid/view/View$OnAttachStateChangeListener;

    .line 36
    .line 37
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->ivm:Landroid/content/Context;

    .line 38
    .line 39
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->moa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 40
    .line 41
    iput-object p3, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->oa:Lcom/bytedance/sdk/openadsdk/AdSlot;

    .line 42
    .line 43
    iput-object p4, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->wrv:Lcom/bytedance/sdk/openadsdk/core/moa/xs;

    .line 44
    .line 45
    iput-boolean p5, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->dz:Z

    .line 46
    .line 47
    invoke-direct {p0, p1, p2, p3}, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->uef(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Lcom/bytedance/sdk/openadsdk/AdSlot;)V

    .line 48
    .line 49
    .line 50
    iput-boolean v1, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->bcc:Z

    .line 51
    .line 52
    iput-boolean v1, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->cz:Z

    .line 53
    .line 54
    return-void
.end method

.method public static synthetic bcc(Lcom/bytedance/sdk/openadsdk/core/moa/uef;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->cq:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object p0
.end method

.method public static synthetic cz(Lcom/bytedance/sdk/openadsdk/core/moa/uef;)Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->dj:Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;

    return-object p0
.end method

.method private dj()Lcom/bytedance/sdk/openadsdk/core/moa/xs$uef;
    .locals 1

    .line 2
    new-instance v0, Lcom/bytedance/sdk/openadsdk/core/moa/uef$7;

    invoke-direct {v0, p0}, Lcom/bytedance/sdk/openadsdk/core/moa/uef$7;-><init>(Lcom/bytedance/sdk/openadsdk/core/moa/uef;)V

    return-object v0
.end method

.method public static synthetic dj(Lcom/bytedance/sdk/openadsdk/core/moa/uef;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->yo:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic ivm(Lcom/bytedance/sdk/openadsdk/core/moa/uef;)Lcom/bytedance/sdk/openadsdk/api/banner/PAGBannerAdWrapperListener;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->lw:Lcom/bytedance/sdk/openadsdk/api/banner/PAGBannerAdWrapperListener;

    return-object p0
.end method

.method public static synthetic lw(Lcom/bytedance/sdk/openadsdk/core/moa/uef;)Lcom/bytedance/sdk/openadsdk/tpx/uef/uef/yo;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->zjm:Lcom/bytedance/sdk/openadsdk/tpx/uef/uef/yo;

    return-object p0
.end method

.method public static synthetic moa(Lcom/bytedance/sdk/openadsdk/core/moa/uef;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->dz:Z

    return p0
.end method

.method public static synthetic oa(Lcom/bytedance/sdk/openadsdk/core/moa/uef;ZLcom/bytedance/sdk/openadsdk/core/model/gzw;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->oa(ZLcom/bytedance/sdk/openadsdk/core/model/gzw;)V

    return-void
.end method

.method private oa(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V
    .locals 6

    .line 10
    iget-wide v0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->xs:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    if-nez p1, :cond_0

    goto :goto_0

    .line 11
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->dj:Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;

    if-eqz v0, :cond_1

    .line 12
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v4, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->xs:J

    sub-long/2addr v0, v4

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    .line 13
    iput-wide v2, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->xs:J

    .line 14
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->yo:Ljava/lang/String;

    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->dj:Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;

    invoke-virtual {v2}, Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;->getAdShowTime()Lcom/bytedance/sdk/openadsdk/moa/xs;

    move-result-object v2

    invoke-static {v0, p1, v1, v2}, Lcom/bytedance/sdk/openadsdk/moa/yo;->uef(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/moa/xs;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 15
    const-string v0, "PAGBannerAdImpl"

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/bytedance/sdk/component/utils/dhk;->yo(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method

.method private oa(ZLcom/bytedance/sdk/openadsdk/core/model/gzw;)V
    .locals 6

    if-eqz p1, :cond_0

    .line 4
    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    iput-wide p1, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->xs:J

    return-void

    :catch_0
    move-exception p1

    goto :goto_0

    .line 5
    :cond_0
    iget-wide v0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->xs:J

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-lez p1, :cond_1

    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->dj:Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;

    if-eqz p1, :cond_1

    .line 6
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v4, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->xs:J

    sub-long/2addr v0, v4

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p1

    .line 7
    iput-wide v2, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->xs:J

    .line 8
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->yo:Ljava/lang/String;

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->dj:Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;

    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;->getAdShowTime()Lcom/bytedance/sdk/openadsdk/moa/xs;

    move-result-object v1

    invoke-static {p1, p2, v0, v1}, Lcom/bytedance/sdk/openadsdk/moa/yo;->uef(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/moa/xs;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    return-void

    .line 9
    :goto_0
    const-string p2, "PAGBannerAdImpl"

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Lcom/bytedance/sdk/component/utils/dhk;->yo(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic oa(Lcom/bytedance/sdk/openadsdk/core/moa/uef;)Z
    .locals 0

    .line 2
    iget-boolean p0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->cz:Z

    return p0
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/core/moa/uef;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->bs:I

    return p0
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/core/moa/uef;I)I
    .locals 0

    .line 2
    iput p1, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->bs:I

    return p1
.end method

.method private uef(Landroid/view/ViewGroup;)Lcom/bytedance/sdk/openadsdk/core/bcc;
    .locals 4

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    const/4 v1, 0x0

    .line 78
    :goto_0
    :try_start_0
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v2

    if-ge v1, v2, :cond_2

    .line 79
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 80
    instance-of v3, v2, Lcom/bytedance/sdk/openadsdk/core/bcc;

    if-eqz v3, :cond_1

    .line 81
    check-cast v2, Lcom/bytedance/sdk/openadsdk/core/bcc;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v2

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :catch_0
    :cond_2
    return-object v0
.end method

.method private uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Lcom/bytedance/sdk/openadsdk/tpx/uef/uef/yo;
    .locals 1

    .line 43
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->ykf()I

    move-result p1

    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    .line 44
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->ivm:Landroid/content/Context;

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->yo:Ljava/lang/String;

    invoke-static {p1, v0}, Lcom/bytedance/sdk/openadsdk/tpx/uef/uef/moa;->uef(Landroid/content/Context;Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/tpx/uef/uef/yo;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private uef(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Lcom/bytedance/sdk/openadsdk/AdSlot;)V
    .locals 2

    .line 17
    invoke-virtual {p2}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->nj()Lcom/bykv/vk/openvk/uef/uef/uef/yo/oa;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 18
    new-instance v0, Lcom/bytedance/sdk/openadsdk/core/moa/yo;

    iget-boolean v1, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->dz:Z

    invoke-direct {v0, p1, p2, p3, v1}, Lcom/bytedance/sdk/openadsdk/core/moa/yo;-><init>(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Lcom/bytedance/sdk/openadsdk/AdSlot;Z)V

    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->uef:Lcom/bytedance/sdk/openadsdk/core/moa/moa;

    .line 19
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->sy:Landroid/view/View$OnAttachStateChangeListener;

    invoke-virtual {v0, p1}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    return-void

    .line 20
    :cond_0
    new-instance v0, Lcom/bytedance/sdk/openadsdk/core/moa/moa;

    iget-boolean v1, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->dz:Z

    invoke-direct {v0, p1, p2, p3, v1}, Lcom/bytedance/sdk/openadsdk/core/moa/moa;-><init>(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Lcom/bytedance/sdk/openadsdk/AdSlot;Z)V

    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->uef:Lcom/bytedance/sdk/openadsdk/core/moa/moa;

    .line 21
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->sy:Landroid/view/View$OnAttachStateChangeListener;

    invoke-virtual {v0, p1}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    return-void
.end method

.method private uef(Landroid/view/View;Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/moa/xs$uef;)V
    .locals 2

    .line 26
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/zjm;->oa()Lcom/bytedance/sdk/openadsdk/core/zjm;

    move-result-object v0

    invoke-virtual {v0, p4, p5}, Lcom/bytedance/sdk/openadsdk/core/zjm;->uef(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/moa/xs$uef;)V

    .line 27
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p4

    iput-wide p4, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->xs:J

    .line 28
    :try_start_0
    new-instance p4, Lorg/json/JSONObject;

    invoke-direct {p4}, Lorg/json/JSONObject;-><init>()V

    if-eqz p2, :cond_0

    .line 29
    const-string p5, "dynamic_show_type"

    invoke-virtual {p2}, Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;->getDynamicShowType()I

    move-result v0

    invoke-virtual {p4, p5, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 30
    invoke-virtual {p2, p4, p3}, Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;->uef(Lorg/json/JSONObject;Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Lorg/json/JSONObject;

    :cond_0
    if-eqz p1, :cond_1

    .line 31
    new-instance p2, Lorg/json/JSONObject;

    invoke-direct {p2}, Lorg/json/JSONObject;-><init>()V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 32
    :try_start_1
    const-string p5, "width"

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v0

    invoke-virtual {p2, p5, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 33
    const-string p5, "height"

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v0

    invoke-virtual {p2, p5, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 34
    const-string p5, "alpha"

    invoke-virtual {p1}, Landroid/view/View;->getAlpha()F

    move-result v0

    float-to-double v0, v0

    invoke-virtual {p2, p5, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 35
    :catchall_0
    :try_start_2
    const-string p5, "root_view"

    invoke-virtual {p2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p4, p5, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 36
    :cond_1
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->yo:Ljava/lang/String;

    const/4 p5, 0x0

    invoke-static {p3, p2, p4, p5}, Lcom/bytedance/sdk/openadsdk/moa/yo;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;Lorg/json/JSONObject;Lorg/json/JSONObject;)V

    .line 37
    invoke-static {p3}, Lcom/bytedance/sdk/openadsdk/gsd/uef/yo;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_0

    .line 38
    :catch_0
    const-string p2, "PAGBannerAdImpl"

    const-string p4, "onShowFun json error"

    invoke-static {p2, p4}, Lcom/bytedance/sdk/component/utils/dhk;->yo(Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    :goto_0
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->lw:Lcom/bytedance/sdk/openadsdk/api/banner/PAGBannerAdWrapperListener;

    if-eqz p2, :cond_2

    .line 40
    invoke-virtual {p3}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->ykf()I

    move-result p4

    invoke-interface {p2, p1, p4}, Lcom/bytedance/sdk/openadsdk/api/PAGExpressAdWrapperListener;->onAdShow(Landroid/view/View;I)V

    .line 41
    :cond_2
    invoke-virtual {p3}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->zrl()Z

    move-result p2

    if-eqz p2, :cond_3

    .line 42
    invoke-static {p3, p1}, Lcom/bytedance/sdk/openadsdk/utils/gb;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Landroid/view/View;)V

    :cond_3
    return-void
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/core/moa/uef;Landroid/view/View;Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/moa/xs$uef;)V
    .locals 0

    .line 3
    invoke-direct/range {p0 .. p5}, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->uef(Landroid/view/View;Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/moa/xs$uef;)V

    return-void
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/core/moa/uef;Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V
    .locals 0

    .line 4
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->oa(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V

    return-void
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/core/moa/uef;Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V
    .locals 0

    .line 5
    invoke-direct {p0, p1, p2}, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->uef(Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V

    return-void
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/core/moa/uef;ZLcom/bytedance/sdk/openadsdk/core/model/gzw;)V
    .locals 0

    .line 6
    invoke-direct {p0, p1, p2}, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->uef(ZLcom/bytedance/sdk/openadsdk/core/model/gzw;)V

    return-void
.end method

.method private uef(Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V
    .locals 8

    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    :cond_0
    move-object p2, p0

    goto/16 :goto_1

    .line 45
    :cond_1
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->moa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 46
    invoke-direct {p0, p2}, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Lcom/bytedance/sdk/openadsdk/tpx/uef/uef/yo;

    move-result-object v0

    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->zjm:Lcom/bytedance/sdk/openadsdk/tpx/uef/uef/yo;

    .line 47
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->dj:Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;

    .line 48
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/utils/ue;->uef()Ljava/lang/String;

    move-result-object v5

    .line 49
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->dj()Lcom/bytedance/sdk/openadsdk/core/moa/xs$uef;

    move-result-object v6

    .line 50
    invoke-virtual {p1, v5}, Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;->setClosedListenerKey(Ljava/lang/String;)V

    .line 51
    invoke-virtual {p1, v6}, Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;->setBannerClickClosedListener(Lcom/bytedance/sdk/openadsdk/core/moa/xs$uef;)V

    .line 52
    new-instance v0, Lcom/bytedance/sdk/openadsdk/core/moa/uef$2;

    invoke-direct {v0, p0, p1, v5}, Lcom/bytedance/sdk/openadsdk/core/moa/uef$2;-><init>(Lcom/bytedance/sdk/openadsdk/core/moa/uef;Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;->setBackupListener(Lcom/bytedance/sdk/component/adexpress/oa/yo;)V

    .line 53
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->bcc:Z

    const/4 v7, 0x1

    if-nez v0, :cond_3

    .line 54
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->uef(Landroid/view/ViewGroup;)Lcom/bytedance/sdk/openadsdk/core/bcc;

    move-result-object v0

    if-nez v0, :cond_2

    .line 55
    new-instance v0, Lcom/bytedance/sdk/openadsdk/core/bcc;

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->ivm:Landroid/content/Context;

    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->wrv:Lcom/bytedance/sdk/openadsdk/core/moa/xs;

    invoke-virtual {v2}, Lcom/bytedance/sdk/openadsdk/core/moa/xs;->uef()Z

    move-result v2

    invoke-direct {v0, v1, p1, v2}, Lcom/bytedance/sdk/openadsdk/core/bcc;-><init>(Landroid/content/Context;Landroid/view/View;Z)V

    .line 56
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 57
    :cond_2
    invoke-virtual {v0, v7}, Lcom/bytedance/sdk/openadsdk/core/bcc;->setAdType(I)V

    .line 58
    new-instance v1, Lcom/bytedance/sdk/openadsdk/core/moa/uef$3;

    move-object v2, p0

    move-object v4, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lcom/bytedance/sdk/openadsdk/core/moa/uef$3;-><init>(Lcom/bytedance/sdk/openadsdk/core/moa/uef;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/moa/xs$uef;)V

    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/bcc;->setCallback(Lcom/bytedance/sdk/openadsdk/core/bcc$uef;)V

    move-object p1, v0

    move-object p2, v2

    move-object v0, v3

    goto :goto_0

    :cond_3
    move-object v2, p0

    move-object v4, p1

    move-object v3, p2

    .line 59
    iget-object p1, v2, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->wrv:Lcom/bytedance/sdk/openadsdk/core/moa/xs;

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/moa/xs;->uef()Z

    move-result p1

    new-instance v1, Lcom/bytedance/sdk/openadsdk/core/moa/uef$4;

    invoke-direct/range {v1 .. v6}, Lcom/bytedance/sdk/openadsdk/core/moa/uef$4;-><init>(Lcom/bytedance/sdk/openadsdk/core/moa/uef;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/moa/xs$uef;)V

    move-object p2, v2

    move-object v0, v3

    const/4 v6, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x1

    move-object v5, v1

    move-object v1, v4

    move v4, p1

    invoke-static/range {v1 .. v6}, Lcom/bytedance/sdk/openadsdk/utils/sk;->uef(Landroid/view/ViewGroup;ZIZLcom/bytedance/sdk/openadsdk/utils/sk$oa;Ljava/util/List;)V

    move-object v4, v1

    const/4 p1, 0x0

    .line 60
    :goto_0
    invoke-static {v4}, Lcom/bytedance/sdk/component/utils/oa;->uef(Landroid/view/View;)Landroid/app/Activity;

    move-result-object v1

    if-nez v1, :cond_4

    .line 61
    iget-object v1, p2, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->ivm:Landroid/content/Context;

    .line 62
    :cond_4
    new-instance v2, Lcom/bytedance/sdk/openadsdk/core/zjm/zjm;

    iget-object v3, p2, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->yo:Ljava/lang/String;

    const/4 v5, 0x2

    invoke-direct {v2, v1, v0, v3, v5}, Lcom/bytedance/sdk/openadsdk/core/zjm/zjm;-><init>(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;I)V

    .line 63
    invoke-virtual {v2, v4}, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->oa(Landroid/view/View;)V

    .line 64
    invoke-virtual {v2, p0}, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->uef(Lcom/bytedance/sdk/openadsdk/core/moa/uef;)V

    .line 65
    iget-object v1, p2, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->zjm:Lcom/bytedance/sdk/openadsdk/tpx/uef/uef/yo;

    invoke-virtual {v2, v1}, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->uef(Lcom/bytedance/sdk/openadsdk/tpx/uef/uef/yo;)V

    .line 66
    new-instance v1, Lcom/bytedance/sdk/openadsdk/core/moa/uef$5;

    invoke-direct {v1, p0}, Lcom/bytedance/sdk/openadsdk/core/moa/uef$5;-><init>(Lcom/bytedance/sdk/openadsdk/core/moa/uef;)V

    invoke-virtual {v2, v1}, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->uef(Lcom/bytedance/sdk/openadsdk/core/yo/oa$uef;)V

    .line 67
    invoke-virtual {v4, v2}, Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;->setClickListener(Lcom/bytedance/sdk/openadsdk/core/zjm/zjm;)V

    .line 68
    new-instance v1, Lcom/bytedance/sdk/openadsdk/core/zjm/cz;

    iget-object v2, p2, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->ivm:Landroid/content/Context;

    iget-object v3, p2, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->yo:Ljava/lang/String;

    invoke-direct {v1, v2, v0, v3, v5}, Lcom/bytedance/sdk/openadsdk/core/zjm/cz;-><init>(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;I)V

    .line 69
    invoke-virtual {v1, v4}, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->oa(Landroid/view/View;)V

    .line 70
    invoke-virtual {v1, p0}, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->uef(Lcom/bytedance/sdk/openadsdk/core/moa/uef;)V

    .line 71
    new-instance v0, Lcom/bytedance/sdk/openadsdk/core/moa/uef$6;

    invoke-direct {v0, p0}, Lcom/bytedance/sdk/openadsdk/core/moa/uef$6;-><init>(Lcom/bytedance/sdk/openadsdk/core/moa/uef;)V

    invoke-virtual {v1, v0}, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->uef(Lcom/bytedance/sdk/openadsdk/core/yo/oa$uef;)V

    .line 72
    iget-object v0, p2, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->dj:Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;

    instance-of v2, v0, Lcom/bytedance/sdk/openadsdk/core/zjm/dhk;

    if-eqz v2, :cond_5

    .line 73
    check-cast v0, Lcom/bytedance/sdk/openadsdk/core/zjm/dhk;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/zjm/dhk;->getVideoController()Lcom/bytedance/sdk/openadsdk/core/wk/oa/yo;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->uef(Lcom/bykv/vk/openvk/uef/uef/uef/moa/yo;)V

    .line 74
    :cond_5
    iget-object v0, p2, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->zjm:Lcom/bytedance/sdk/openadsdk/tpx/uef/uef/yo;

    invoke-virtual {v1, v0}, Lcom/bytedance/sdk/openadsdk/core/yo/oa;->uef(Lcom/bytedance/sdk/openadsdk/tpx/uef/uef/yo;)V

    .line 75
    invoke-virtual {v4, v1}, Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;->setClickCreativeListener(Lcom/bytedance/sdk/openadsdk/core/zjm/cz;)V

    .line 76
    iget-boolean v0, p2, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->bcc:Z

    if-nez v0, :cond_6

    .line 77
    invoke-virtual {p1, v7}, Lcom/bytedance/sdk/openadsdk/core/bcc;->setNeedCheckingShow(Z)V

    :cond_6
    :goto_1
    return-void
.end method

.method private uef(ZLcom/bytedance/sdk/openadsdk/core/model/gzw;)V
    .locals 3

    if-eqz p1, :cond_0

    .line 22
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->moa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->vxo()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->moa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->ue()Z

    move-result v0

    if-nez v0, :cond_0

    .line 23
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->moa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->xs(Z)V

    .line 24
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->moa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->yo:Ljava/lang/String;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->lu()Lcom/bytedance/sdk/openadsdk/utils/pu;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/bytedance/sdk/openadsdk/moa/yo;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/utils/pu;)V

    .line 25
    :cond_0
    new-instance v0, Lcom/bytedance/sdk/openadsdk/core/moa/uef$uef;

    invoke-direct {v0, p1, p2, p0}, Lcom/bytedance/sdk/openadsdk/core/moa/uef$uef;-><init>(ZLcom/bytedance/sdk/openadsdk/core/model/gzw;Lcom/bytedance/sdk/openadsdk/core/moa/uef;)V

    const/16 p1, 0xa

    invoke-static {v0, p1}, Lcom/bytedance/sdk/openadsdk/utils/km;->oa(Lcom/bytedance/sdk/component/bcc/oa/yo;I)V

    return-void
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/core/moa/uef;Z)Z
    .locals 0

    .line 7
    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->cz:Z

    return p1
.end method

.method private wrv()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->moa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 2
    .line 3
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    invoke-virtual {v0, v1, v2}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->uef(J)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->uef:Lcom/bytedance/sdk/openadsdk/core/moa/moa;

    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/moa/moa;->lw()V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public static synthetic xs(Lcom/bytedance/sdk/openadsdk/core/moa/uef;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->zjm()V

    return-void
.end method

.method public static synthetic yo(Lcom/bytedance/sdk/openadsdk/core/moa/uef;)Lcom/bytedance/sdk/openadsdk/core/model/gzw;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->moa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    return-object p0
.end method

.method public static synthetic zjm(Lcom/bytedance/sdk/openadsdk/core/moa/uef;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->ivm:Landroid/content/Context;

    return-object p0
.end method

.method private zjm()V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->wrv()V

    return-void
.end method


# virtual methods
.method public bcc()V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->uef:Lcom/bytedance/sdk/openadsdk/core/moa/moa;

    instance-of v1, v0, Lcom/bytedance/sdk/openadsdk/core/moa/yo;

    if-eqz v1, :cond_0

    .line 3
    check-cast v0, Lcom/bytedance/sdk/openadsdk/core/moa/yo;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/moa/yo;->oa()V

    :cond_0
    return-void
.end method

.method public cz()V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->uef:Lcom/bytedance/sdk/openadsdk/core/moa/moa;

    instance-of v1, v0, Lcom/bytedance/sdk/openadsdk/core/moa/yo;

    if-eqz v1, :cond_0

    .line 3
    check-cast v0, Lcom/bytedance/sdk/openadsdk/core/moa/yo;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/moa/yo;->uef()V

    :cond_0
    return-void
.end method

.method public ivm()V
    .locals 1

    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->bs:I

    .line 3
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->uef:Lcom/bytedance/sdk/openadsdk/core/moa/moa;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/moa/moa;->moa()V

    return-void
.end method

.method public lw()V
    .locals 2

    .line 2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->xs:J

    return-void
.end method

.method public moa()V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->moa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-direct {p0, v0}, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->oa(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V

    const-wide/16 v0, 0x0

    .line 3
    iput-wide v0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->xs:J

    return-void
.end method

.method public oa()Z
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->uef:Lcom/bytedance/sdk/openadsdk/core/moa/moa;

    instance-of v0, v0, Lcom/bytedance/sdk/openadsdk/core/moa/yo;

    return v0
.end method

.method public uef()Landroid/view/View;
    .locals 2

    .line 14
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->moa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/utils/oa;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V

    .line 15
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->ivm:Landroid/content/Context;

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->moa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-static {v0, v1}, Lcom/bytedance/sdk/openadsdk/oem/IPBroadcastReceiver;->oa(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V

    .line 16
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->uef:Lcom/bytedance/sdk/openadsdk/core/moa/moa;

    return-object v0
.end method

.method public uef(I)V
    .locals 1

    .line 8
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->uef:Lcom/bytedance/sdk/openadsdk/core/moa/moa;

    if-eqz v0, :cond_0

    .line 9
    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/core/moa/moa;->setCurrentIndex(I)V

    :cond_0
    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/api/banner/PAGBannerAdInteractionCallback;)V
    .locals 1

    .line 10
    new-instance v0, Lcom/bytedance/sdk/openadsdk/core/moa/bcc;

    invoke-direct {v0, p1}, Lcom/bytedance/sdk/openadsdk/core/moa/bcc;-><init>(Lcom/bytedance/sdk/openadsdk/api/banner/PAGBannerAdInteractionListener;)V

    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->lw:Lcom/bytedance/sdk/openadsdk/api/banner/PAGBannerAdWrapperListener;

    .line 11
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->uef:Lcom/bytedance/sdk/openadsdk/core/moa/moa;

    invoke-virtual {p1, v0}, Lcom/bytedance/sdk/openadsdk/core/moa/moa;->setExpressInteractionListener(Lcom/bytedance/sdk/openadsdk/api/banner/PAGBannerAdWrapperListener;)V

    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/api/banner/PAGBannerAdInteractionListener;)V
    .locals 1

    .line 12
    new-instance v0, Lcom/bytedance/sdk/openadsdk/core/moa/bcc;

    invoke-direct {v0, p1}, Lcom/bytedance/sdk/openadsdk/core/moa/bcc;-><init>(Lcom/bytedance/sdk/openadsdk/api/banner/PAGBannerAdInteractionListener;)V

    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->lw:Lcom/bytedance/sdk/openadsdk/api/banner/PAGBannerAdWrapperListener;

    .line 13
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->uef:Lcom/bytedance/sdk/openadsdk/core/moa/moa;

    invoke-virtual {p1, v0}, Lcom/bytedance/sdk/openadsdk/core/moa/moa;->setExpressInteractionListener(Lcom/bytedance/sdk/openadsdk/api/banner/PAGBannerAdWrapperListener;)V

    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/uef/uef/oa;)V
    .locals 6

    .line 82
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 83
    iget-wide v2, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->oib:J

    sub-long v2, v0, v2

    const-wide/16 v4, 0x1f4

    cmp-long v2, v2, v4

    if-lez v2, :cond_0

    .line 84
    iput-wide v0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->oib:J

    .line 85
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->uef:Lcom/bytedance/sdk/openadsdk/core/moa/moa;

    instance-of v1, v0, Lcom/bytedance/sdk/openadsdk/core/moa/yo;

    if-eqz v1, :cond_0

    .line 86
    new-instance v1, Lcom/bytedance/sdk/openadsdk/core/moa/uef$8;

    invoke-direct {v1, p0, p1}, Lcom/bytedance/sdk/openadsdk/core/moa/uef$8;-><init>(Lcom/bytedance/sdk/openadsdk/core/moa/uef;Lcom/bytedance/sdk/openadsdk/uef/uef/oa;)V

    invoke-virtual {v0, v1, v4, v5}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    return-void
.end method

.method public xs()V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->uef:Lcom/bytedance/sdk/openadsdk/core/moa/moa;

    if-eqz v0, :cond_0

    .line 3
    :try_start_0
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->ivm()V

    .line 4
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->uef:Lcom/bytedance/sdk/openadsdk/core/moa/moa;

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->sy:Landroid/view/View$OnAttachStateChangeListener;

    invoke-virtual {v0, v1}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_0
    return-void
.end method

.method public yo()Lcom/bytedance/sdk/openadsdk/oib/yo/uef;
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->uef:Lcom/bytedance/sdk/openadsdk/core/moa/moa;

    instance-of v1, v0, Lcom/bytedance/sdk/openadsdk/core/moa/yo;

    if-eqz v1, :cond_0

    .line 3
    check-cast v0, Lcom/bytedance/sdk/openadsdk/core/moa/yo;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/moa/yo;->getVideoModel()Lcom/bytedance/sdk/openadsdk/oib/yo/uef;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method
