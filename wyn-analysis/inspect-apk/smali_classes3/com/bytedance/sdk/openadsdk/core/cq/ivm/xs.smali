.class public Lcom/bytedance/sdk/openadsdk/core/cq/ivm/xs;
.super Lcom/bytedance/sdk/openadsdk/core/cq/ivm/moa;
.source "SourceFile"


# instance fields
.field private cp:F

.field private dxx:Z

.field private fz:F

.field private gr:Lcom/bytedance/adsdk/ugeno/oa/yo;

.field private ku:Z

.field private lz:F

.field private pz:Lcom/bytedance/sdk/openadsdk/core/widget/lw;

.field private rt:Lcom/bytedance/adsdk/ugeno/oa/yo;

.field private ue:Lcom/bytedance/adsdk/ugeno/oa/yo;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/core/model/gzw;ZLcom/bytedance/sdk/openadsdk/core/cq/ivm/uef;Landroid/view/ViewGroup;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/moa;-><init>(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/core/model/gzw;ZLcom/bytedance/sdk/openadsdk/core/cq/ivm/uef;Landroid/view/ViewGroup;)V

    .line 2
    .line 3
    .line 4
    move-object p1, p0

    .line 5
    const/4 p2, 0x0

    .line 6
    iput-boolean p2, p1, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/xs;->ku:Z

    .line 7
    .line 8
    const/4 p2, 0x1

    .line 9
    iput-boolean p2, p1, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/xs;->dxx:Z

    .line 10
    .line 11
    iget-object p2, p1, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/moa;->orq:Ljava/lang/String;

    .line 12
    .line 13
    const-string p3, "fullscreen_interstitial_ad"

    .line 14
    .line 15
    invoke-static {p2, p3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    if-eqz p2, :cond_0

    .line 20
    .line 21
    iget-object p2, p1, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/moa;->lw:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 22
    .line 23
    invoke-virtual {p2}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->qe()I

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    int-to-float p2, p2

    .line 28
    iput p2, p1, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/xs;->cp:F

    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    iget-object p2, p1, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/moa;->orq:Ljava/lang/String;

    .line 32
    .line 33
    const-string p3, "rewarded_video"

    .line 34
    .line 35
    invoke-static {p2, p3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    if-eqz p2, :cond_1

    .line 40
    .line 41
    iget-object p2, p1, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/moa;->lw:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 42
    .line 43
    invoke-virtual {p2}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->ho()I

    .line 44
    .line 45
    .line 46
    move-result p2

    .line 47
    int-to-float p2, p2

    .line 48
    iput p2, p1, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/xs;->cp:F

    .line 49
    .line 50
    :cond_1
    return-void
.end method

.method private ab()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/moa;->lw:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->qn()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v2, 0x1

    .line 12
    if-ne v0, v2, :cond_1

    .line 13
    .line 14
    return v2

    .line 15
    :cond_1
    return v1
.end method

.method private cq()V
    .locals 4

    .line 1
    new-instance v0, Lcom/bytedance/adsdk/ugeno/core/dj;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/bytedance/adsdk/ugeno/core/dj;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/util/HashMap;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 9
    .line 10
    .line 11
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/moa;->ivm:Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef;

    .line 12
    .line 13
    invoke-virtual {v2}, Lcom/bytedance/sdk/component/adexpress/oa/cq;->dj()Ljava/util/Map;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    const-string v3, "image_info"

    .line 18
    .line 19
    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/moa;->ivm:Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef;

    .line 23
    .line 24
    invoke-virtual {v2}, Lcom/bytedance/sdk/component/adexpress/oa/cq;->dz()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    const-string v3, "cache_dir"

    .line 29
    .line 30
    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v1}, Lcom/bytedance/adsdk/ugeno/core/dj;->uef(Ljava/util/Map;)V

    .line 34
    .line 35
    .line 36
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/moa;->oa:Landroid/content/Context;

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Lcom/bytedance/adsdk/ugeno/core/dj;->uef(Landroid/content/Context;)V

    .line 39
    .line 40
    .line 41
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/moa;->moa:Lorg/json/JSONObject;

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Lcom/bytedance/adsdk/ugeno/core/dj;->uef(Lorg/json/JSONObject;)V

    .line 44
    .line 45
    .line 46
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/moa;->gsd:Lorg/json/JSONObject;

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Lcom/bytedance/adsdk/ugeno/core/dj;->oa(Lorg/json/JSONObject;)V

    .line 49
    .line 50
    .line 51
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/moa;->uef:Lcom/bytedance/adsdk/ugeno/core/wrv;

    .line 52
    .line 53
    const-string v2, "ad"

    .line 54
    .line 55
    invoke-virtual {v1, v2, v0}, Lcom/bytedance/adsdk/ugeno/core/wrv;->uef(Ljava/lang/String;Lcom/bytedance/adsdk/ugeno/core/dj;)V

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method private dz()I
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/xs;->cq()V

    .line 2
    .line 3
    .line 4
    :try_start_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/moa;->uef:Lcom/bytedance/adsdk/ugeno/core/wrv;

    .line 5
    .line 6
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/moa;->gsd:Lorg/json/JSONObject;

    .line 7
    .line 8
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/moa;->yo:Lcom/bytedance/adsdk/ugeno/oa/yo;

    .line 9
    .line 10
    invoke-virtual {v0, v1, v2}, Lcom/bytedance/adsdk/ugeno/core/wrv;->uef(Lorg/json/JSONObject;Lcom/bytedance/adsdk/ugeno/oa/yo;)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/moa;->yo:Lcom/bytedance/adsdk/ugeno/oa/yo;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/xs;->wk()V

    .line 18
    .line 19
    .line 20
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/xs;->wrv()V

    .line 21
    .line 22
    .line 23
    :cond_0
    instance-of v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef/ivm;

    .line 24
    .line 25
    if-nez v0, :cond_1

    .line 26
    .line 27
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/moa;->ivm:Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef;

    .line 28
    .line 29
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef;->dxx()Lcom/bytedance/adsdk/ugeno/core/sy;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-interface {v0}, Lcom/bytedance/adsdk/ugeno/core/sy;->oa()V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/moa;->ivm:Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef;

    .line 37
    .line 38
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef;->dxx()Lcom/bytedance/adsdk/ugeno/core/sy;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-interface {v0}, Lcom/bytedance/adsdk/ugeno/core/sy;->yo()V
    :try_end_0
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    .line 45
    :cond_1
    const/4 v0, 0x0

    .line 46
    return v0

    .line 47
    :catchall_0
    const/16 v0, 0x8d

    .line 48
    .line 49
    return v0

    .line 50
    :catch_0
    const/16 v0, 0x8c

    .line 51
    .line 52
    return v0

    .line 53
    :catch_1
    const/16 v0, 0x8b

    .line 54
    .line 55
    return v0
.end method

.method private oa(Ljava/lang/CharSequence;ZIZ)V
    .locals 7

    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/xs;->ue:Lcom/bytedance/adsdk/ugeno/oa/yo;

    if-nez v1, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    instance-of v1, v1, Lcom/bytedance/sdk/openadsdk/core/cq/oa/moa/yo;

    if-nez v1, :cond_1

    :goto_0
    return-void

    .line 4
    :cond_1
    :try_start_0
    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    .line 5
    iget-boolean v1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/xs;->dxx:Z

    if-eqz v1, :cond_2

    int-to-float p3, p3

    .line 6
    iput p3, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/xs;->fz:F

    .line 7
    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/xs;->dxx:Z

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_3

    .line 8
    :cond_2
    :goto_1
    iget p3, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/xs;->lz:F

    float-to-double v1, p3

    iget p3, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/xs;->fz:F

    float-to-double v3, p3

    const-wide/high16 v5, 0x3fe0000000000000L    # 0.5

    div-double/2addr v5, v3

    const-wide/high16 v3, 0x4059000000000000L    # 100.0

    mul-double/2addr v5, v3

    add-double/2addr v5, v1

    double-to-float p3, v5

    iput p3, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/xs;->lz:F

    .line 9
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/moa;->uef:Lcom/bytedance/adsdk/ugeno/core/wrv;

    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/moa;->yo:Lcom/bytedance/adsdk/ugeno/oa/yo;

    const-string v3, "ProgressBar://progress"

    invoke-static {p3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p3

    iget v4, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/xs;->cp:F

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/Object;

    aput-object p3, v5, v0

    const/4 p3, 0x1

    aput-object v4, v5, p3

    invoke-virtual {v1, v2, v3, v5}, Lcom/bytedance/adsdk/ugeno/core/wrv;->uef(Lcom/bytedance/adsdk/ugeno/oa/yo;Ljava/lang/String;[Ljava/lang/Object;)V

    if-nez p4, :cond_4

    if-lez p1, :cond_4

    if-eqz p2, :cond_3

    goto :goto_2

    .line 10
    :cond_3
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/xs;->ue:Lcom/bytedance/adsdk/ugeno/oa/yo;

    check-cast p1, Lcom/bytedance/sdk/openadsdk/core/cq/oa/moa/yo;

    const/16 p2, 0x1f4

    invoke-virtual {p1, p2}, Lcom/bytedance/sdk/openadsdk/core/cq/oa/moa/yo;->xs(I)V

    .line 11
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/xs;->ue:Lcom/bytedance/adsdk/ugeno/oa/yo;

    check-cast p1, Lcom/bytedance/sdk/openadsdk/core/cq/oa/moa/yo;

    iget p2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/xs;->lz:F

    float-to-int p2, p2

    invoke-virtual {p1, p2}, Lcom/bytedance/sdk/openadsdk/core/cq/oa/moa/yo;->uef(I)V

    return-void

    .line 12
    :cond_4
    :goto_2
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/xs;->ue:Lcom/bytedance/adsdk/ugeno/oa/yo;

    check-cast p1, Lcom/bytedance/sdk/openadsdk/core/cq/oa/moa/yo;

    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Lcom/bytedance/adsdk/ugeno/oa/yo;->yo(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    .line 13
    :goto_3
    const-string p2, "UGenRender"

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Lcom/bytedance/sdk/component/utils/dhk;->yo(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private uef(Landroid/view/View;)Landroid/content/Context;
    .locals 0

    if-eqz p1, :cond_0

    .line 46
    invoke-static {p1}, Lcom/bytedance/sdk/component/utils/oa;->uef(Landroid/view/View;)Landroid/app/Activity;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_1

    .line 47
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/moa;->oa:Landroid/content/Context;

    :cond_1
    return-object p1
.end method

.method private uef(Ljava/lang/CharSequence;ZIZ)V
    .locals 5

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 32
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/xs;->rt:Lcom/bytedance/adsdk/ugeno/oa/yo;

    if-nez v2, :cond_0

    goto :goto_0

    .line 33
    :cond_0
    instance-of v2, v2, Lcom/bytedance/sdk/openadsdk/core/cq/oa/oa;

    if-nez v2, :cond_1

    :goto_0
    return-void

    .line 34
    :cond_1
    :try_start_0
    move-object v2, p1

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    const/4 v2, 0x2

    .line 35
    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "parse duration exception"

    aput-object v3, v2, v1

    aput-object p1, v2, v0

    const-string v3, "UGenRender"

    invoke-static {v3, v2}, Lcom/bytedance/sdk/component/utils/dhk;->yo(Ljava/lang/String;[Ljava/lang/Object;)V

    move v2, v1

    .line 36
    :goto_1
    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/xs;->rt:Lcom/bytedance/adsdk/ugeno/oa/yo;

    check-cast v3, Lcom/bytedance/sdk/openadsdk/core/cq/oa/oa;

    const/16 v4, 0x8

    if-nez p4, :cond_5

    if-lez v2, :cond_5

    .line 37
    iget-boolean p4, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/xs;->ku:Z

    if-nez p4, :cond_5

    invoke-direct {p0, v3}, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/xs;->uef(Lcom/bytedance/sdk/openadsdk/core/cq/oa/oa;)Z

    move-result p4

    if-eqz p4, :cond_2

    goto :goto_2

    .line 38
    :cond_2
    iget-object p4, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/xs;->rt:Lcom/bytedance/adsdk/ugeno/oa/yo;

    invoke-virtual {p4, v1}, Lcom/bytedance/adsdk/ugeno/oa/yo;->yo(I)V

    if-nez p2, :cond_3

    .line 39
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/moa;->ivm:Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef;

    invoke-virtual {p2}, Lcom/bytedance/sdk/component/adexpress/oa/cq;->uef()Z

    move-result p2

    if-eqz p2, :cond_3

    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/moa;->ivm:Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef;

    invoke-virtual {p2}, Lcom/bytedance/sdk/component/adexpress/oa/cq;->moa()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lcom/bytedance/sdk/component/adexpress/moa/ivm;->oa(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_3

    .line 40
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/xs;->rt:Lcom/bytedance/adsdk/ugeno/oa/yo;

    check-cast p1, Lcom/bytedance/sdk/openadsdk/core/cq/oa/oa;

    invoke-static {p3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/bytedance/sdk/openadsdk/core/cq/oa/oa;->dz(Ljava/lang/String;)V

    return-void

    .line 41
    :cond_3
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/moa;->ivm:Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef;

    invoke-virtual {p2}, Lcom/bytedance/sdk/component/adexpress/oa/cq;->moa()Ljava/lang/String;

    move-result-object p2

    const-string p3, "open_ad"

    invoke-virtual {p3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_4

    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/moa;->ivm:Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef;

    invoke-virtual {p2}, Lcom/bytedance/sdk/component/adexpress/oa/cq;->uef()Z

    move-result p2

    if-eqz p2, :cond_4

    .line 42
    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/xs;->ku:Z

    .line 43
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/xs;->rt:Lcom/bytedance/adsdk/ugeno/oa/yo;

    invoke-virtual {p1, v4}, Lcom/bytedance/adsdk/ugeno/oa/yo;->yo(I)V

    return-void

    .line 44
    :cond_4
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/xs;->rt:Lcom/bytedance/adsdk/ugeno/oa/yo;

    check-cast p2, Lcom/bytedance/sdk/openadsdk/core/cq/oa/oa;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/bytedance/sdk/openadsdk/core/cq/oa/oa;->dz(Ljava/lang/String;)V

    return-void

    .line 45
    :cond_5
    :goto_2
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/xs;->rt:Lcom/bytedance/adsdk/ugeno/oa/yo;

    invoke-virtual {p1, v4}, Lcom/bytedance/adsdk/ugeno/oa/yo;->yo(I)V

    return-void
.end method

.method private uef(Lcom/bytedance/sdk/openadsdk/core/cq/oa/oa;)Z
    .locals 3

    const/4 v0, 0x1

    if-nez p1, :cond_0

    return v0

    .line 51
    :cond_0
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/moa;->orq:Ljava/lang/String;

    const-string v2, "open_ad"

    invoke-static {v1, v2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/cq/oa/oa;->moa()I

    move-result v1

    const/16 v2, 0x8

    if-eq v1, v2, :cond_1

    .line 52
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/cq/oa/oa;->moa()I

    move-result p1

    const/4 v1, 0x4

    if-ne p1, v1, :cond_2

    :cond_1
    return v0

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method private wk()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/moa;->yo:Lcom/bytedance/adsdk/ugeno/oa/yo;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const-string v1, "RVCountdown"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lcom/bytedance/adsdk/ugeno/oa/yo;->ivm(Ljava/lang/String;)Lcom/bytedance/adsdk/ugeno/oa/yo;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/xs;->rt:Lcom/bytedance/adsdk/ugeno/oa/yo;

    .line 13
    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/moa;->yo:Lcom/bytedance/adsdk/ugeno/oa/yo;

    .line 17
    .line 18
    const-string v1, "FVCountdown"

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Lcom/bytedance/adsdk/ugeno/oa/yo;->ivm(Ljava/lang/String;)Lcom/bytedance/adsdk/ugeno/oa/yo;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/xs;->rt:Lcom/bytedance/adsdk/ugeno/oa/yo;

    .line 25
    .line 26
    :cond_1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/xs;->rt:Lcom/bytedance/adsdk/ugeno/oa/yo;

    .line 27
    .line 28
    if-nez v0, :cond_2

    .line 29
    .line 30
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/moa;->yo:Lcom/bytedance/adsdk/ugeno/oa/yo;

    .line 31
    .line 32
    const-string v1, "AOCountdown"

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Lcom/bytedance/adsdk/ugeno/oa/yo;->ivm(Ljava/lang/String;)Lcom/bytedance/adsdk/ugeno/oa/yo;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/xs;->rt:Lcom/bytedance/adsdk/ugeno/oa/yo;

    .line 39
    .line 40
    :cond_2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/moa;->yo:Lcom/bytedance/adsdk/ugeno/oa/yo;

    .line 41
    .line 42
    const-string v1, "RVSkipView"

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Lcom/bytedance/adsdk/ugeno/oa/yo;->ivm(Ljava/lang/String;)Lcom/bytedance/adsdk/ugeno/oa/yo;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/xs;->gr:Lcom/bytedance/adsdk/ugeno/oa/yo;

    .line 49
    .line 50
    if-nez v0, :cond_3

    .line 51
    .line 52
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/moa;->yo:Lcom/bytedance/adsdk/ugeno/oa/yo;

    .line 53
    .line 54
    const-string v1, "FVSkipView"

    .line 55
    .line 56
    invoke-virtual {v0, v1}, Lcom/bytedance/adsdk/ugeno/oa/yo;->ivm(Ljava/lang/String;)Lcom/bytedance/adsdk/ugeno/oa/yo;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/xs;->gr:Lcom/bytedance/adsdk/ugeno/oa/yo;

    .line 61
    .line 62
    :cond_3
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/xs;->gr:Lcom/bytedance/adsdk/ugeno/oa/yo;

    .line 63
    .line 64
    if-nez v0, :cond_4

    .line 65
    .line 66
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/moa;->yo:Lcom/bytedance/adsdk/ugeno/oa/yo;

    .line 67
    .line 68
    const-string v1, "AOSkipView"

    .line 69
    .line 70
    invoke-virtual {v0, v1}, Lcom/bytedance/adsdk/ugeno/oa/yo;->ivm(Ljava/lang/String;)Lcom/bytedance/adsdk/ugeno/oa/yo;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/xs;->gr:Lcom/bytedance/adsdk/ugeno/oa/yo;

    .line 75
    .line 76
    :cond_4
    :goto_0
    return-void
.end method

.method private wrv()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/xs;->rt:Lcom/bytedance/adsdk/ugeno/oa/yo;

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/bytedance/adsdk/ugeno/oa/yo;->yo(I)V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/xs;->gr:Lcom/bytedance/adsdk/ugeno/oa/yo;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lcom/bytedance/adsdk/ugeno/oa/yo;->yo(I)V

    .line 15
    .line 16
    .line 17
    :cond_1
    return-void
.end method

.method private yo(Ljava/lang/CharSequence;ZIZ)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/xs;->gr:Lcom/bytedance/adsdk/ugeno/oa/yo;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    instance-of p3, p1, Lcom/bytedance/sdk/openadsdk/core/cq/oa/ivm;

    .line 7
    .line 8
    if-nez p3, :cond_1

    .line 9
    .line 10
    :goto_0
    return-void

    .line 11
    :cond_1
    const/4 p3, 0x0

    .line 12
    if-eqz p2, :cond_2

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_2
    if-eqz p4, :cond_3

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_3
    const/16 p3, 0x8

    .line 19
    .line 20
    :goto_1
    invoke-virtual {p1, p3}, Lcom/bytedance/adsdk/ugeno/oa/yo;->yo(I)V

    .line 21
    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public bcc()Lcom/bytedance/adsdk/ugeno/oa/yo;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/moa;->yo:Lcom/bytedance/adsdk/ugeno/oa/yo;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return-object v0

    .line 7
    :cond_0
    const-string v1, "VideoV3"

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lcom/bytedance/adsdk/ugeno/oa/yo;->ivm(Ljava/lang/String;)Lcom/bytedance/adsdk/ugeno/oa/yo;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method public cz()I
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/xs;->cq()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/moa;->uef:Lcom/bytedance/adsdk/ugeno/core/wrv;

    .line 5
    .line 6
    invoke-virtual {v0, p0}, Lcom/bytedance/adsdk/ugeno/core/wrv;->uef(Lcom/bytedance/adsdk/ugeno/core/wk;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/moa;->uef:Lcom/bytedance/adsdk/ugeno/core/wrv;

    .line 10
    .line 11
    invoke-virtual {v0, p0}, Lcom/bytedance/adsdk/ugeno/core/wrv;->uef(Lcom/bytedance/adsdk/ugeno/core/ab;)V

    .line 12
    .line 13
    .line 14
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/xs;->ab()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/moa;->uef:Lcom/bytedance/adsdk/ugeno/core/wrv;

    .line 21
    .line 22
    new-instance v1, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/yo;

    .line 23
    .line 24
    invoke-direct {v1}, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/yo;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1}, Lcom/bytedance/adsdk/ugeno/core/wrv;->uef(Lcom/bytedance/adsdk/ugeno/moa/dz;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/moa;->lw:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 31
    .line 32
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->aje()Lcom/bytedance/sdk/openadsdk/core/model/dxx;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    if-nez v0, :cond_2

    .line 37
    .line 38
    :try_start_0
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/moa;->orq:Ljava/lang/String;

    .line 39
    .line 40
    invoke-static {v1}, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef/ivm;->uef(Ljava/lang/String;)Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-eqz v1, :cond_1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/moa;->uef:Lcom/bytedance/adsdk/ugeno/core/wrv;

    .line 48
    .line 49
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/moa;->moa:Lorg/json/JSONObject;

    .line 50
    .line 51
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/moa;->gsd:Lorg/json/JSONObject;

    .line 52
    .line 53
    const/4 v3, 0x0

    .line 54
    invoke-virtual {v0, v1, v2, v3}, Lcom/bytedance/adsdk/ugeno/core/wrv;->uef(Lorg/json/JSONObject;Lorg/json/JSONObject;Lorg/json/JSONObject;)Lcom/bytedance/adsdk/ugeno/oa/yo;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/moa;->yo:Lcom/bytedance/adsdk/ugeno/oa/yo;

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_2
    :goto_0
    invoke-virtual {p0, v0}, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/xs;->uef(Lcom/bytedance/sdk/openadsdk/core/model/dxx;)Lorg/json/JSONObject;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/moa;->uef:Lcom/bytedance/adsdk/ugeno/core/wrv;

    .line 66
    .line 67
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/moa;->moa:Lorg/json/JSONObject;

    .line 68
    .line 69
    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/moa;->gsd:Lorg/json/JSONObject;

    .line 70
    .line 71
    invoke-virtual {v1, v2, v3, v0}, Lcom/bytedance/adsdk/ugeno/core/wrv;->uef(Lorg/json/JSONObject;Lorg/json/JSONObject;Lorg/json/JSONObject;)Lcom/bytedance/adsdk/ugeno/oa/yo;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/moa;->yo:Lcom/bytedance/adsdk/ugeno/oa/yo;

    .line 76
    .line 77
    :goto_1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/moa;->yo:Lcom/bytedance/adsdk/ugeno/oa/yo;

    .line 78
    .line 79
    if-eqz v0, :cond_3

    .line 80
    .line 81
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/xs;->wk()V

    .line 82
    .line 83
    .line 84
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/moa;->yo:Lcom/bytedance/adsdk/ugeno/oa/yo;

    .line 85
    .line 86
    const-string v1, "ProgressBar"

    .line 87
    .line 88
    invoke-virtual {v0, v1}, Lcom/bytedance/adsdk/ugeno/oa/yo;->ivm(Ljava/lang/String;)Lcom/bytedance/adsdk/ugeno/oa/yo;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/xs;->ue:Lcom/bytedance/adsdk/ugeno/oa/yo;

    .line 93
    .line 94
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/xs;->wrv()V

    .line 95
    .line 96
    .line 97
    :cond_3
    instance-of v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef/ivm;

    .line 98
    .line 99
    if-nez v0, :cond_4

    .line 100
    .line 101
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/moa;->ivm:Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef;

    .line 102
    .line 103
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef;->dxx()Lcom/bytedance/adsdk/ugeno/core/sy;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    invoke-interface {v0}, Lcom/bytedance/adsdk/ugeno/core/sy;->oa()V

    .line 108
    .line 109
    .line 110
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/moa;->ivm:Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef;

    .line 111
    .line 112
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef;->dxx()Lcom/bytedance/adsdk/ugeno/core/sy;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-interface {v0}, Lcom/bytedance/adsdk/ugeno/core/sy;->yo()V
    :try_end_0
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 117
    .line 118
    .line 119
    :cond_4
    const/4 v0, 0x0

    .line 120
    return v0

    .line 121
    :catchall_0
    const/16 v0, 0x8d

    .line 122
    .line 123
    return v0

    .line 124
    :catch_0
    const/16 v0, 0x8c

    .line 125
    .line 126
    return v0

    .line 127
    :catch_1
    const/16 v0, 0x8b

    .line 128
    .line 129
    return v0
.end method

.method public dj()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/moa;->uef:Lcom/bytedance/adsdk/ugeno/core/wrv;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/moa;->yo:Lcom/bytedance/adsdk/ugeno/oa/yo;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    new-array v2, v2, [Ljava/lang/Object;

    .line 9
    .line 10
    const-string v3, "show"

    .line 11
    .line 12
    invoke-virtual {v0, v1, v3, v2}, Lcom/bytedance/adsdk/ugeno/core/wrv;->uef(Lcom/bytedance/adsdk/ugeno/oa/yo;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public moa()I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/moa;->ivm:Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef;->lz()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const-string v0, "UGenRender"

    .line 10
    .line 11
    const-string v1, "renderWidget: only update data"

    .line 12
    .line 13
    invoke-static {v0, v1}, Lcom/bytedance/sdk/component/utils/dhk;->uef(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/xs;->dz()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    return v0

    .line 21
    :cond_0
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/xs;->cz()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    return v0
.end method

.method public oa()Lorg/json/JSONObject;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/moa;->ivm:Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef;

    invoke-virtual {v0}, Lcom/bytedance/sdk/component/adexpress/oa/cq;->yo()Lorg/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public setSoundMute(Z)V
    .locals 0

    return-void
.end method

.method public setTime(Ljava/lang/CharSequence;IIZ)V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/moa;->yo:Lcom/bytedance/adsdk/ugeno/oa/yo;

    .line 4
    .line 5
    if-nez v2, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    if-ne p2, v1, :cond_1

    .line 9
    .line 10
    move p2, v1

    .line 11
    goto :goto_0

    .line 12
    :cond_1
    move p2, v0

    .line 13
    :goto_0
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/moa;->orq:Ljava/lang/String;

    .line 14
    .line 15
    const-string v3, "open_ad"

    .line 16
    .line 17
    invoke-static {v2, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_2

    .line 22
    .line 23
    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/moa;->uef:Lcom/bytedance/adsdk/ugeno/core/wrv;

    .line 24
    .line 25
    if-eqz v2, :cond_2

    .line 26
    .line 27
    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/moa;->yo:Lcom/bytedance/adsdk/ugeno/oa/yo;

    .line 28
    .line 29
    const-string v4, "countdown"

    .line 30
    .line 31
    new-array v1, v1, [Ljava/lang/Object;

    .line 32
    .line 33
    aput-object p1, v1, v0

    .line 34
    .line 35
    invoke-virtual {v2, v3, v4, v1}, Lcom/bytedance/adsdk/ugeno/core/wrv;->uef(Lcom/bytedance/adsdk/ugeno/oa/yo;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    :cond_2
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/xs;->oa(Ljava/lang/CharSequence;ZIZ)V

    .line 39
    .line 40
    .line 41
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/xs;->uef(Ljava/lang/CharSequence;ZIZ)V

    .line 42
    .line 43
    .line 44
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/xs;->yo(Ljava/lang/CharSequence;ZIZ)V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public uef()Lorg/json/JSONObject;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/moa;->ivm:Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef;

    invoke-virtual {v0}, Lcom/bytedance/sdk/component/adexpress/oa/cq;->yo()Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    const-string v1, "xTemplate"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/core/model/dxx;)Lorg/json/JSONObject;
    .locals 0

    if-eqz p1, :cond_0

    .line 53
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/model/dxx;->lw()Lorg/json/JSONObject;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public uef(JJ)V
    .locals 2

    .line 48
    invoke-super {p0, p1, p2, p3, p4}, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/moa;->uef(JJ)V

    .line 49
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/moa;->uef:Lcom/bytedance/adsdk/ugeno/core/wrv;

    if-eqz v0, :cond_0

    .line 50
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/moa;->yo:Lcom/bytedance/adsdk/ugeno/oa/yo;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    const/4 p3, 0x2

    new-array p3, p3, [Ljava/lang/Object;

    const/4 p4, 0x0

    aput-object p1, p3, p4

    const/4 p1, 0x1

    aput-object p2, p3, p1

    const-string p1, "videoProgress"

    invoke-virtual {v0, v1, p1, p3}, Lcom/bytedance/adsdk/ugeno/core/wrv;->uef(Lcom/bytedance/adsdk/ugeno/oa/yo;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public uef(Lcom/bytedance/adsdk/ugeno/oa/yo;Ljava/lang/String;Lcom/bytedance/adsdk/ugeno/moa/ivm$uef;)V
    .locals 12

    const/4 p2, 0x7

    const/4 v0, 0x6

    const/4 v1, 0x5

    const/4 v2, 0x4

    const/4 v3, 0x3

    const/4 v4, 0x2

    .line 4
    const-string v5, "sendAdExtra"

    const-string v6, "sendLogExtra"

    const/4 v7, -0x1

    const/4 v8, 0x1

    const/4 v9, 0x0

    iget-object v10, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/moa;->bcc:Lcom/bytedance/sdk/component/adexpress/oa/bcc;

    if-nez v10, :cond_0

    goto/16 :goto_3

    :cond_0
    if-nez p3, :cond_1

    goto/16 :goto_3

    .line 5
    :cond_1
    invoke-virtual {p3}, Lcom/bytedance/adsdk/ugeno/moa/ivm$uef;->oa()Ljava/lang/String;

    move-result-object v10

    .line 6
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v10}, Ljava/lang/String;->hashCode()I

    move-result v11

    sparse-switch v11, :sswitch_data_0

    :goto_0
    move v10, v7

    goto/16 :goto_1

    :sswitch_0
    const-string v11, "dislike"

    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_2

    goto :goto_0

    :cond_2
    const/16 v10, 0xb

    goto/16 :goto_1

    :sswitch_1
    const-string v11, "speedVideoOrTimer"

    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_3

    goto :goto_0

    :cond_3
    const/16 v10, 0xa

    goto/16 :goto_1

    :sswitch_2
    const-string v11, "openLinks"

    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_4

    goto :goto_0

    :cond_4
    const/16 v10, 0x9

    goto/16 :goto_1

    :sswitch_3
    const-string v11, "muteVideo"

    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_5

    goto :goto_0

    :cond_5
    const/16 v10, 0x8

    goto/16 :goto_1

    :sswitch_4
    const-string v11, "convert"

    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_6

    goto :goto_0

    :cond_6
    move v10, p2

    goto :goto_1

    :sswitch_5
    const-string v11, "videoControl"

    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_7

    goto :goto_0

    :cond_7
    move v10, v0

    goto :goto_1

    :sswitch_6
    const-string v11, "openPlayable"

    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_8

    goto :goto_0

    :cond_8
    move v10, v1

    goto :goto_1

    :sswitch_7
    const-string v11, "skip"

    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_9

    goto :goto_0

    :cond_9
    move v10, v2

    goto :goto_1

    :sswitch_8
    const-string v11, "pauseVideo"

    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_a

    goto :goto_0

    :cond_a
    move v10, v3

    goto :goto_1

    :sswitch_9
    const-string v11, "openPrivacy"

    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_b

    goto :goto_0

    :cond_b
    move v10, v4

    goto :goto_1

    :sswitch_a
    invoke-virtual {v10, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_c

    goto :goto_0

    :cond_c
    move v10, v8

    goto :goto_1

    :sswitch_b
    invoke-virtual {v10, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_d

    goto/16 :goto_0

    :cond_d
    move v10, v9

    :goto_1
    packed-switch v10, :pswitch_data_0

    move p2, v9

    goto/16 :goto_4

    :pswitch_0
    move p2, v3

    goto/16 :goto_4

    .line 7
    :pswitch_1
    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "onUGenEvent: "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3}, Lcom/bytedance/adsdk/ugeno/moa/ivm$uef;->yo()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v1, "UGenRender"

    invoke-static {v1, p2}, Lcom/bytedance/sdk/component/utils/dhk;->oa(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    invoke-virtual {p3}, Lcom/bytedance/adsdk/ugeno/moa/ivm$uef;->yo()Ljava/util/Map;

    move-result-object p2

    const/16 v2, 0xd

    if-eqz p2, :cond_e

    invoke-virtual {p3}, Lcom/bytedance/adsdk/ugeno/moa/ivm$uef;->yo()Ljava/util/Map;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Map;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_e

    .line 9
    :try_start_0
    invoke-virtual {p3}, Lcom/bytedance/adsdk/ugeno/moa/ivm$uef;->yo()Ljava/util/Map;

    move-result-object p2

    const-string p3, "switch"

    invoke-interface {p2, p3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_e
    :goto_2
    :pswitch_2
    move p2, v2

    goto :goto_4

    :catchall_0
    move-exception v0

    move-object p2, v0

    .line 10
    new-array p3, v8, [Ljava/lang/Object;

    aput-object p2, p3, v9

    invoke-static {v1, p3}, Lcom/bytedance/sdk/component/utils/dhk;->yo(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2

    .line 11
    :pswitch_3
    invoke-virtual {p1}, Lcom/bytedance/adsdk/ugeno/oa/yo;->dj()Landroid/view/View;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/xs;->uef(Landroid/view/View;)Landroid/content/Context;

    move-result-object v1

    .line 12
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/moa;->oa:Landroid/content/Context;

    instance-of v2, p1, Landroid/app/Activity;

    .line 13
    new-instance v0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/ivm;

    invoke-direct {v0}, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/ivm;-><init>()V

    iget-object v3, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/moa;->lw:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    iget-object v4, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/moa;->orq:Ljava/lang/String;

    invoke-virtual {p3}, Lcom/bytedance/adsdk/ugeno/moa/ivm$uef;->yo()Ljava/util/Map;

    move-result-object v5

    iget-object v6, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/xs;->pz:Lcom/bytedance/sdk/openadsdk/core/widget/lw;

    invoke-virtual/range {v0 .. v6}, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/ivm;->uef(Landroid/content/Context;ZLcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;Ljava/util/Map;Lcom/bytedance/sdk/openadsdk/core/widget/lw;)V

    return-void

    :pswitch_4
    move p2, v1

    goto :goto_4

    :pswitch_5
    move p2, v4

    goto :goto_4

    .line 14
    :pswitch_6
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/moa;->cz:Lcom/bytedance/sdk/openadsdk/core/zjm/ab;

    if-eqz p1, :cond_f

    const/4 p2, 0x0

    .line 15
    invoke-interface {p1, p2}, Lcom/bytedance/sdk/openadsdk/core/zjm/ab;->oa(Lorg/json/JSONObject;)Z

    :cond_f
    :goto_3
    return-void

    :pswitch_7
    move p2, v0

    .line 16
    :goto_4
    :pswitch_8
    new-instance p3, Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;

    invoke-direct {p3}, Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;-><init>()V

    iget v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/moa;->dz:F

    .line 17
    invoke-virtual {p3, v0}, Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;->moa(F)Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;

    move-result-object p3

    iget v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/moa;->wk:F

    .line 18
    invoke-virtual {p3, v0}, Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;->yo(F)Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;

    move-result-object p3

    iget v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/moa;->ab:F

    .line 19
    invoke-virtual {p3, v0}, Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;->oa(F)Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;

    move-result-object p3

    iget v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/moa;->bs:F

    .line 20
    invoke-virtual {p3, v0}, Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;->uef(F)Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;

    move-result-object p3

    iget-wide v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/moa;->sy:J

    .line 21
    invoke-virtual {p3, v0, v1}, Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;->oa(J)Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;

    move-result-object p3

    iget-wide v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/moa;->oib:J

    .line 22
    invoke-virtual {p3, v0, v1}, Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;->uef(J)Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;

    move-result-object p3

    .line 23
    invoke-virtual {p3, v7}, Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;->yo(I)Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;

    move-result-object p3

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/moa;->gzw:Landroid/util/SparseArray;

    .line 24
    invoke-virtual {p3, v0}, Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;->uef(Landroid/util/SparseArray;)Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;

    move-result-object p3

    .line 25
    invoke-virtual {p3, v8}, Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;->uef(Z)Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;

    move-result-object p3

    .line 26
    invoke-virtual {p1}, Lcom/bytedance/adsdk/ugeno/oa/yo;->oyt()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;->uef(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;

    move-result-object p3

    .line 27
    invoke-virtual {p3, v9}, Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;->oa(Z)Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;

    move-result-object p3

    .line 28
    invoke-virtual {p3}, Lcom/bytedance/sdk/openadsdk/core/model/ab$uef;->uef()Lcom/bytedance/sdk/openadsdk/core/model/ab;

    move-result-object p3

    .line 29
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/moa;->bcc:Lcom/bytedance/sdk/component/adexpress/oa/bcc;

    invoke-virtual {p1}, Lcom/bytedance/adsdk/ugeno/oa/yo;->dj()Landroid/view/View;

    move-result-object p1

    invoke-interface {v0, p1, p2, p3}, Lcom/bytedance/sdk/component/adexpress/oa/bcc;->uef(Landroid/view/View;ILcom/bytedance/sdk/component/adexpress/yo;)V

    return-void

    .line 30
    :pswitch_9
    new-instance p1, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/bcc;

    invoke-direct {p1}, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/bcc;-><init>()V

    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/moa;->lw:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/moa;->orq:Ljava/lang/String;

    invoke-virtual {p3}, Lcom/bytedance/adsdk/ugeno/moa/ivm$uef;->yo()Ljava/util/Map;

    move-result-object p3

    invoke-virtual {p1, v5, p2, v0, p3}, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/bcc;->uef(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;Ljava/util/Map;)V

    return-void

    .line 31
    :pswitch_a
    new-instance p1, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/bcc;

    invoke-direct {p1}, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/bcc;-><init>()V

    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/moa;->lw:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/moa;->orq:Ljava/lang/String;

    invoke-virtual {p3}, Lcom/bytedance/adsdk/ugeno/moa/ivm$uef;->yo()Ljava/util/Map;

    move-result-object p3

    invoke-virtual {p1, v6, p2, v0, p3}, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/bcc;->uef(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;Ljava/util/Map;)V

    return-void

    :sswitch_data_0
    .sparse-switch
        -0x7039692c -> :sswitch_b
        -0x55ce8afb -> :sswitch_a
        -0x1e7a3222 -> :sswitch_9
        -0x353b7db -> :sswitch_8
        0x35e57f -> :sswitch_7
        0x45206f8 -> :sswitch_6
        0x2ff1f862 -> :sswitch_5
        0x38b81db3 -> :sswitch_4
        0x44a639e2 -> :sswitch_3
        0x5b1a978f -> :sswitch_2
        0x5f92f40e -> :sswitch_1
        0x63a33d25 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_2
        :pswitch_7
        :pswitch_6
        :pswitch_2
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/core/widget/lw;)V
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/xs;->pz:Lcom/bytedance/sdk/openadsdk/core/widget/lw;

    return-void
.end method

.method public xs()Lcom/bytedance/adsdk/ugeno/oa/yo;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/moa;->yo:Lcom/bytedance/adsdk/ugeno/oa/yo;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return-object v0

    .line 7
    :cond_0
    const-string v1, "Playable"

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lcom/bytedance/adsdk/ugeno/oa/yo;->ivm(Ljava/lang/String;)Lcom/bytedance/adsdk/ugeno/oa/yo;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method public zjm()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/moa;->uef:Lcom/bytedance/adsdk/ugeno/core/wrv;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/moa;->yo:Lcom/bytedance/adsdk/ugeno/oa/yo;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    new-array v2, v2, [Ljava/lang/Object;

    .line 9
    .line 10
    const-string v3, "videoFail"

    .line 11
    .line 12
    invoke-virtual {v0, v1, v3, v2}, Lcom/bytedance/adsdk/ugeno/core/wrv;->uef(Lcom/bytedance/adsdk/ugeno/oa/yo;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method
