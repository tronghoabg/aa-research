.class public Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef;
.super Lcom/bytedance/sdk/component/adexpress/oa/cq;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef$uef;
    }
.end annotation


# instance fields
.field private lw:Z

.field private moa:F

.field private oa:Lcom/bytedance/adsdk/ugeno/core/sy;

.field private uef:Lorg/json/JSONObject;

.field private yo:F


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef$uef;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/component/adexpress/oa/cq;-><init>(Lcom/bytedance/sdk/component/adexpress/oa/cq$uef;)V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef$uef;->uef(Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef$uef;)Lorg/json/JSONObject;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef;->uef:Lorg/json/JSONObject;

    .line 9
    .line 10
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef$uef;->oa(Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef$uef;)Lcom/bytedance/adsdk/ugeno/core/sy;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef;->oa:Lcom/bytedance/adsdk/ugeno/core/sy;

    .line 15
    .line 16
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef$uef;->yo(Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef$uef;)F

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    iput v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef;->yo:F

    .line 21
    .line 22
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef$uef;->moa(Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef$uef;)F

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    iput v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef;->moa:F

    .line 27
    .line 28
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef$uef;->lw(Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef$uef;)Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef;->lw:Z

    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public cp()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef;->yo:F

    .line 2
    .line 3
    return v0
.end method

.method public dxx()Lcom/bytedance/adsdk/ugeno/core/sy;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef;->oa:Lcom/bytedance/adsdk/ugeno/core/sy;

    .line 2
    .line 3
    return-object v0
.end method

.method public fz()Lorg/json/JSONObject;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef;->uef:Lorg/json/JSONObject;

    .line 2
    .line 3
    return-object v0
.end method

.method public ku()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef;->moa:F

    .line 2
    .line 3
    return v0
.end method

.method public lz()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef;->lw:Z

    .line 2
    .line 3
    return v0
.end method
