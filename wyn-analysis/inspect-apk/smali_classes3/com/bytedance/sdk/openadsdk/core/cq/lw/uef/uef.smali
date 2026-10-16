.class public Lcom/bytedance/sdk/openadsdk/core/cq/lw/uef/uef;
.super Lcom/bytedance/adsdk/ugeno/moa/oa/uef;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lcom/bytedance/adsdk/ugeno/oa/yo;Ljava/lang/String;Lcom/bytedance/adsdk/ugeno/moa/ivm$uef;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/bytedance/adsdk/ugeno/moa/oa/uef;-><init>(Lcom/bytedance/adsdk/ugeno/oa/yo;Ljava/lang/String;Lcom/bytedance/adsdk/ugeno/moa/ivm$uef;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public oa()V
    .locals 0

    return-void
.end method

.method public uef()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/moa/oa/uef;->ivm:Ljava/util/Map;

    .line 2
    .line 3
    if-eqz v0, :cond_4

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v0, p0, Lcom/bytedance/adsdk/ugeno/moa/oa/uef;->ivm:Ljava/util/Map;

    .line 13
    .line 14
    const-string v1, "id"

    .line 15
    .line 16
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_2
    iget-object v1, p0, Lcom/bytedance/adsdk/ugeno/moa/oa/uef;->yo:Lcom/bytedance/adsdk/ugeno/oa/yo;

    .line 35
    .line 36
    invoke-virtual {v1, v1}, Lcom/bytedance/adsdk/ugeno/oa/yo;->oa(Lcom/bytedance/adsdk/ugeno/oa/yo;)Lcom/bytedance/adsdk/ugeno/oa/yo;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    if-nez v1, :cond_3

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_3
    invoke-virtual {v1, v0}, Lcom/bytedance/adsdk/ugeno/oa/yo;->lw(Ljava/lang/String;)Lcom/bytedance/adsdk/ugeno/oa/yo;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    instance-of v1, v0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/oa/uef;

    .line 48
    .line 49
    if-eqz v1, :cond_4

    .line 50
    .line 51
    check-cast v0, Lcom/bytedance/sdk/openadsdk/core/cq/oa/oa/uef;

    .line 52
    .line 53
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/cq/oa/oa/uef;->moa()V

    .line 54
    .line 55
    .line 56
    new-instance v1, Lcom/bytedance/sdk/openadsdk/core/cq/lw/uef/uef$1;

    .line 57
    .line 58
    invoke-direct {v1, p0}, Lcom/bytedance/sdk/openadsdk/core/cq/lw/uef/uef$1;-><init>(Lcom/bytedance/sdk/openadsdk/core/cq/lw/uef/uef;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/cq/oa/oa/uef;->uef(Landroid/animation/AnimatorListenerAdapter;)V

    .line 62
    .line 63
    .line 64
    :cond_4
    :goto_0
    return-void
.end method
