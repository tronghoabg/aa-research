.class public Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/adsdk/ugeno/core/ab;
.implements Lcom/bytedance/sdk/openadsdk/core/cq/moa/uef$uef;


# static fields
.field protected static uef:I = 0x8


# instance fields
.field private ab:F

.field private bcc:Ljava/lang/String;

.field private bs:F

.field private cq:Landroid/view/View;

.field private cz:Lorg/json/JSONObject;

.field private dhk:Z

.field private dj:Lcom/bytedance/sdk/openadsdk/core/cq/xs/uef;

.field private dz:F

.field private ivm:Ljava/lang/String;

.field private final lw:Lcom/bytedance/sdk/openadsdk/core/cq/bcc/uef;

.field private final moa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

.field private oa:Lcom/bytedance/sdk/openadsdk/core/cq/moa/uef;

.field private oib:J

.field private sy:J

.field private wk:F

.field private wrv:Ljava/lang/String;

.field private xs:Ljava/lang/String;

.field private final yo:Landroid/app/Activity;

.field private final zjm:Lcom/bytedance/sdk/openadsdk/core/cq/xs/oa;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Lcom/bytedance/sdk/openadsdk/core/cq/bcc/uef;Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/cq/xs/oa;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->dhk:Z

    .line 6
    .line 7
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->yo:Landroid/app/Activity;

    .line 8
    .line 9
    iput-object p4, p0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->wrv:Ljava/lang/String;

    .line 10
    .line 11
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->moa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 12
    .line 13
    iput-object p5, p0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->zjm:Lcom/bytedance/sdk/openadsdk/core/cq/xs/oa;

    .line 14
    .line 15
    iput-object p3, p0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->lw:Lcom/bytedance/sdk/openadsdk/core/cq/bcc/uef;

    .line 16
    .line 17
    return-void
.end method

.method public static synthetic oa(Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;)Lcom/bytedance/sdk/openadsdk/core/cq/xs/oa;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->zjm:Lcom/bytedance/sdk/openadsdk/core/cq/xs/oa;

    return-object p0
.end method

.method private oa()V
    .locals 10

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->moa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->ykf()I

    move-result v0

    const/4 v1, 0x2

    const/4 v2, 0x4

    const/4 v3, 0x3

    if-eq v0, v1, :cond_2

    if-eq v0, v3, :cond_2

    if-eq v0, v2, :cond_1

    const/4 v1, 0x5

    if-eq v0, v1, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->yo:Landroid/app/Activity;

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->moa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-virtual {v1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->wp()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/bytedance/sdk/openadsdk/utils/gb;->oa(Landroid/content/Context;Ljava/lang/String;)Z

    return-void

    .line 4
    :cond_1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->yo:Landroid/app/Activity;

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->wrv:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/bytedance/sdk/openadsdk/tpx/uef/uef/moa;->uef(Landroid/content/Context;Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/tpx/uef/uef/yo;

    move-result-object v0

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->moa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-interface {v0, v1}, Lcom/bytedance/sdk/openadsdk/tpx/uef/uef/yo;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V

    return-void

    :cond_2
    if-ne v0, v3, :cond_4

    .line 5
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->moa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->cc()Ljava/lang/String;

    move-result-object v0

    .line 6
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_4

    const-string v1, "play.google.com/store"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 7
    const-string v1, "?id="

    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v1

    add-int/2addr v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    .line 8
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->yo:Landroid/app/Activity;

    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->wrv:Ljava/lang/String;

    iget-object v4, p0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->moa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-static {v2, v0, v1, v3, v4}, Lcom/bytedance/sdk/openadsdk/tpx/uef/uef/oa;->uef(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    return-void

    .line 9
    :cond_4
    :goto_1
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->yo:Landroid/app/Activity;

    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->moa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->wrv:Ljava/lang/String;

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/utils/gb;->uef(Ljava/lang/String;)I

    move-result v3

    iget-object v6, p0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->wrv:Ljava/lang/String;

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->yo:Landroid/app/Activity;

    .line 10
    invoke-static {v0, v6}, Lcom/bytedance/sdk/openadsdk/tpx/uef/uef/moa;->uef(Landroid/content/Context;Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/tpx/uef/uef/yo;

    move-result-object v7

    const/4 v8, 0x1

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    .line 11
    invoke-static/range {v1 .. v9}, Lcom/bytedance/sdk/openadsdk/core/pu;->uef(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/core/model/gzw;ILcom/bytedance/sdk/openadsdk/api/nativeAd/PAGNativeAd;Lcom/bytedance/sdk/openadsdk/core/moa/uef;Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/tpx/uef/uef/yo;ZI)Z

    return-void
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;)Lorg/json/JSONObject;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->cz:Lorg/json/JSONObject;

    return-object p0
.end method

.method private uef(Lcom/bytedance/adsdk/ugeno/core/cq;Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V
    .locals 13

    .line 32
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 33
    :try_start_0
    const-string v1, "down_x"

    iget v2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->dz:F

    float-to-double v2, v2

    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 34
    const-string v1, "down_y"

    iget v2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->wk:F

    float-to-double v2, v2

    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 35
    const-string v1, "down_time"

    iget-wide v2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->sy:J

    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 36
    const-string v1, "up_x"

    iget v2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->ab:F

    float-to-double v2, v2

    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 37
    const-string v1, "up_y"

    iget v2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->bs:F

    float-to-double v2, v2

    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 38
    const-string v1, "up_time"

    iget-wide v2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->oib:J

    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 39
    invoke-virtual {p1}, Lcom/bytedance/adsdk/ugeno/core/cq;->uef()Lcom/bytedance/adsdk/ugeno/oa/yo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/bytedance/adsdk/ugeno/oa/yo;->dj()Landroid/view/View;

    move-result-object v1
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    const-string v2, "height"

    const-string v3, "width"

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x2

    if-eqz v1, :cond_0

    .line 41
    :try_start_1
    new-instance v7, Lorg/json/JSONObject;

    invoke-direct {v7}, Lorg/json/JSONObject;-><init>()V

    .line 42
    new-array v8, v6, [I

    .line 43
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v9

    int-to-float v9, v9

    .line 44
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v10

    int-to-float v10, v10

    .line 45
    invoke-virtual {v1, v8}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 46
    aget v1, v8, v4

    int-to-float v1, v1

    .line 47
    aget v8, v8, v5

    int-to-float v8, v8

    float-to-double v11, v9

    .line 48
    invoke-virtual {v7, v3, v11, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    float-to-double v9, v10

    .line 49
    invoke-virtual {v7, v2, v9, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 50
    const-string v9, "left"

    float-to-double v10, v1

    invoke-virtual {v7, v9, v10, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 51
    const-string v1, "top"

    float-to-double v8, v8

    invoke-virtual {v7, v1, v8, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 52
    const-string v1, "rectInfo"

    invoke-virtual {v0, v1, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 53
    :cond_0
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->cq:Landroid/view/View;

    if-eqz v1, :cond_1

    .line 54
    new-array v7, v6, [I

    .line 55
    invoke-virtual {v1, v7}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 56
    const-string v1, "button_x"

    aget v8, v7, v4

    invoke-virtual {v0, v1, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 57
    const-string v1, "button_y"

    aget v7, v7, v5

    invoke-virtual {v0, v1, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 58
    const-string v1, "button_width"

    iget-object v7, p0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->cq:Landroid/view/View;

    invoke-virtual {v7}, Landroid/view/View;->getWidth()I

    move-result v7

    invoke-virtual {v0, v1, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 59
    const-string v1, "button_height"

    iget-object v7, p0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->cq:Landroid/view/View;

    invoke-virtual {v7}, Landroid/view/View;->getHeight()I

    move-result v7

    invoke-virtual {v0, v1, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 60
    :cond_1
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->yo:Landroid/app/Activity;

    const v7, 0x1020002

    invoke-virtual {v1, v7}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 61
    new-array v7, v6, [I

    .line 62
    invoke-virtual {v1, v7}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 63
    const-string v8, "ad_x"

    aget v4, v7, v4

    invoke-virtual {v0, v8, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 64
    const-string v4, "ad_y"

    aget v7, v7, v5

    invoke-virtual {v0, v4, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 65
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v4

    invoke-virtual {v0, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 66
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v1

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 67
    :cond_2
    const-string v1, "click_area_type"

    invoke-virtual {p1}, Lcom/bytedance/adsdk/ugeno/core/cq;->uef()Lcom/bytedance/adsdk/ugeno/oa/yo;

    move-result-object v2

    invoke-virtual {v2}, Lcom/bytedance/adsdk/ugeno/oa/yo;->oyt()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 68
    const-string v1, "brick_id"

    invoke-virtual {p1}, Lcom/bytedance/adsdk/ugeno/core/cq;->uef()Lcom/bytedance/adsdk/ugeno/oa/yo;

    move-result-object p1

    invoke-virtual {p1}, Lcom/bytedance/adsdk/ugeno/oa/yo;->lz()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 69
    const-string p1, "endcard_id"

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->ivm:Ljava/lang/String;

    invoke-virtual {v0, p1, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 70
    const-string p1, "click_scence"

    invoke-virtual {v0, p1, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 71
    const-string p1, "user_behavior_type"

    iget-boolean v1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->dhk:Z

    if-eqz v1, :cond_3

    goto :goto_0

    :cond_3
    move v5, v6

    :goto_0
    invoke-virtual {v0, p1, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 72
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->dj:Lcom/bytedance/sdk/openadsdk/core/cq/xs/uef;

    if-eqz p1, :cond_4

    .line 73
    const-string v1, "endcard_type"

    invoke-interface {p1}, Lcom/bytedance/sdk/openadsdk/core/cq/xs/uef;->uef()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 74
    :cond_4
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->wrv:Ljava/lang/String;

    const-string v1, "click"

    invoke-static {p2, p1, v1, v0}, Lcom/bytedance/sdk/openadsdk/moa/yo;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    return-void
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;Lorg/json/JSONObject;Lorg/json/JSONObject;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->uef(Lorg/json/JSONObject;Lorg/json/JSONObject;)V

    return-void
.end method

.method private uef(Lorg/json/JSONObject;Lorg/json/JSONObject;)V
    .locals 2

    .line 16
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/cq/moa/uef;

    invoke-virtual {v0, p0}, Lcom/bytedance/sdk/openadsdk/core/cq/moa/uef;->uef(Lcom/bytedance/sdk/openadsdk/core/cq/moa/uef$uef;)V

    .line 17
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/cq/moa/uef;

    invoke-virtual {v0, p0}, Lcom/bytedance/sdk/openadsdk/core/cq/moa/uef;->uef(Lcom/bytedance/adsdk/ugeno/core/ab;)V

    .line 18
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->zjm:Lcom/bytedance/sdk/openadsdk/core/cq/xs/oa;

    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/core/cq/xs/oa;->uef()V

    .line 19
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/cq/moa/uef;

    new-instance v1, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa$2;

    invoke-direct {v1, p0}, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa$2;-><init>(Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;)V

    invoke-virtual {v0, p1, p2, v1}, Lcom/bytedance/sdk/openadsdk/core/cq/moa/uef;->uef(Lorg/json/JSONObject;Lorg/json/JSONObject;Lcom/bytedance/sdk/openadsdk/core/cq/xs/moa;)V

    return-void
.end method


# virtual methods
.method public uef()V
    .locals 9

    .line 3
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->moa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    const-string v1, "net"

    const/4 v2, 0x1

    if-nez v0, :cond_0

    .line 4
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->zjm:Lcom/bytedance/sdk/openadsdk/core/cq/xs/oa;

    const-string v3, "material is null"

    invoke-interface {v0, v2, v3, v1}, Lcom/bytedance/sdk/openadsdk/core/cq/xs/yo;->uef(ILjava/lang/String;Ljava/lang/String;)V

    return-void

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->lw:Lcom/bytedance/sdk/openadsdk/core/cq/bcc/uef;

    if-nez v0, :cond_1

    .line 6
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->zjm:Lcom/bytedance/sdk/openadsdk/core/cq/xs/oa;

    const-string v3, "material ugen template is null"

    invoke-interface {v0, v2, v3, v1}, Lcom/bytedance/sdk/openadsdk/core/cq/xs/yo;->uef(ILjava/lang/String;Ljava/lang/String;)V

    return-void

    .line 7
    :cond_1
    new-instance v0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/uef;

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->yo:Landroid/app/Activity;

    invoke-direct {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/cq/moa/uef;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/cq/moa/uef;

    .line 8
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->lw:Lcom/bytedance/sdk/openadsdk/core/cq/bcc/uef;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/cq/bcc/uef;->yo()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->bcc:Ljava/lang/String;

    .line 9
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->lw:Lcom/bytedance/sdk/openadsdk/core/cq/bcc/uef;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/cq/bcc/uef;->uef()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->ivm:Ljava/lang/String;

    .line 10
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->lw:Lcom/bytedance/sdk/openadsdk/core/cq/bcc/uef;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/cq/bcc/uef;->oa()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->xs:Ljava/lang/String;

    .line 11
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->moa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-virtual {v0, v2}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->cq(Z)Lorg/json/JSONObject;

    move-result-object v0

    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->cz:Lorg/json/JSONObject;

    .line 12
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->zjm:Lcom/bytedance/sdk/openadsdk/core/cq/xs/oa;

    const-string v1, "endcard"

    invoke-interface {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/cq/xs/yo;->uef(Ljava/lang/String;)V

    .line 13
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/cq/uef/oa;->uef()Lcom/bytedance/sdk/openadsdk/core/cq/uef/oa;

    move-result-object v2

    iget-object v4, p0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->bcc:Ljava/lang/String;

    iget-object v5, p0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->ivm:Ljava/lang/String;

    iget-object v6, p0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->xs:Ljava/lang/String;

    new-instance v8, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa$1;

    invoke-direct {v8, p0}, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa$1;-><init>(Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;)V

    const-string v3, "endcard"

    const-string v7, ""

    invoke-virtual/range {v2 .. v8}, Lcom/bytedance/sdk/openadsdk/core/cq/uef/oa;->uef(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/cq/uef/oa$uef;)V

    return-void
.end method

.method public uef(Landroid/view/View;)V
    .locals 0

    .line 14
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->cq:Landroid/view/View;

    return-void
.end method

.method public uef(Lcom/bytedance/adsdk/ugeno/core/cq;)V
    .locals 3

    .line 20
    invoke-virtual {p1}, Lcom/bytedance/adsdk/ugeno/core/cq;->yo()Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "type"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 21
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, -0x1

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v2

    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v2, "creative"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    goto :goto_0

    :sswitch_1
    const-string v2, "close"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x1

    goto :goto_0

    :sswitch_2
    const-string v2, "privacy"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :goto_0
    packed-switch v1, :pswitch_data_0

    goto :goto_1

    .line 22
    :pswitch_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->yo:Landroid/app/Activity;

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->moa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    if-nez v0, :cond_3

    goto :goto_1

    .line 23
    :cond_3
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->oa()V

    .line 24
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->yo:Landroid/app/Activity;

    instance-of v1, v0, Lcom/bytedance/sdk/openadsdk/core/wk/moa/oa;

    if-eqz v1, :cond_4

    .line 25
    check-cast v0, Lcom/bytedance/sdk/openadsdk/core/wk/moa/oa;

    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/core/wk/moa/oa;->hts()V

    .line 26
    :cond_4
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->moa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-direct {p0, p1, v0}, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->uef(Lcom/bytedance/adsdk/ugeno/core/cq;Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V

    return-void

    .line 27
    :pswitch_1
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->dj:Lcom/bytedance/sdk/openadsdk/core/cq/xs/uef;

    if-eqz p1, :cond_6

    .line 28
    invoke-interface {p1}, Lcom/bytedance/sdk/openadsdk/core/cq/xs/uef;->oa()V

    return-void

    .line 29
    :pswitch_2
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->yo:Landroid/app/Activity;

    if-eqz p1, :cond_6

    .line 30
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->moa()Lcom/bytedance/sdk/openadsdk/core/settings/dj;

    move-result-object p1

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/settings/dj;->swd()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_5

    goto :goto_1

    .line 31
    :cond_5
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->yo:Landroid/app/Activity;

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->moa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->wrv:Ljava/lang/String;

    invoke-static {p1, v0, v1}, Lcom/bytedance/sdk/openadsdk/activity/single/TTWebsiteActivity;->uef(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;)V

    :cond_6
    :goto_1
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x12bedc78 -> :sswitch_2
        0x5a5ddf8 -> :sswitch_1
        0x6c816faf -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public uef(Lcom/bytedance/adsdk/ugeno/oa/yo;Landroid/view/MotionEvent;)V
    .locals 3

    .line 75
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result p1

    const/4 v0, 0x1

    if-eqz p1, :cond_6

    const/4 v1, 0x0

    if-eq p1, v0, :cond_3

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    goto :goto_0

    .line 76
    :cond_0
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F

    move-result p1

    iget v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->dz:F

    sub-float/2addr p1, v0

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    sget v0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->uef:I

    int-to-float v0, v0

    cmpl-float p1, p1, v0

    if-gez p1, :cond_2

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawY()F

    move-result p1

    iget p2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->wk:F

    sub-float/2addr p1, p2

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    sget p2, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->uef:I

    int-to-float p2, p2

    cmpl-float p1, p1, p2

    if-ltz p1, :cond_1

    goto :goto_1

    :cond_1
    :goto_0
    return-void

    .line 77
    :cond_2
    :goto_1
    iput-boolean v1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->dhk:Z

    return-void

    .line 78
    :cond_3
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F

    move-result p1

    iput p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->ab:F

    .line 79
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawY()F

    move-result p1

    iput p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->bs:F

    .line 80
    iget p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->ab:F

    iget p2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->dz:F

    sub-float/2addr p1, p2

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    sget p2, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->uef:I

    int-to-float p2, p2

    cmpl-float p1, p1, p2

    if-gez p1, :cond_4

    iget p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->bs:F

    iget p2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->wk:F

    sub-float/2addr p1, p2

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    sget p2, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->uef:I

    int-to-float p2, p2

    cmpl-float p1, p1, p2

    if-ltz p1, :cond_5

    .line 81
    :cond_4
    iput-boolean v1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->dhk:Z

    .line 82
    :cond_5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    iput-wide p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->oib:J

    return-void

    .line 83
    :cond_6
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iput-wide v1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->sy:J

    .line 84
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F

    move-result p1

    iput p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->dz:F

    .line 85
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawY()F

    move-result p1

    iput p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->wk:F

    .line 86
    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->dhk:Z

    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/core/cq/xs/uef;)V
    .locals 0

    .line 15
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/moa/oa;->dj:Lcom/bytedance/sdk/openadsdk/core/cq/xs/uef;

    return-void
.end method
