.class public Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef$uef;
.super Lcom/bytedance/sdk/component/adexpress/oa/cq$uef;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "uef"
.end annotation


# instance fields
.field private lw:Z

.field private moa:F

.field private oa:Lcom/bytedance/adsdk/ugeno/core/sy;

.field private uef:Lorg/json/JSONObject;

.field private yo:F


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/bytedance/sdk/component/adexpress/oa/cq$uef;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic lw(Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef$uef;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef$uef;->lw:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic moa(Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef$uef;)F
    .locals 0

    .line 1
    iget p0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef$uef;->moa:F

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic oa(Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef$uef;)Lcom/bytedance/adsdk/ugeno/core/sy;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef$uef;->oa:Lcom/bytedance/adsdk/ugeno/core/sy;

    return-object p0
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef$uef;)Lorg/json/JSONObject;
    .locals 0

    .line 2
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef$uef;->uef:Lorg/json/JSONObject;

    return-object p0
.end method

.method public static synthetic yo(Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef$uef;)F
    .locals 0

    .line 1
    iget p0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef$uef;->yo:F

    .line 2
    .line 3
    return p0
.end method


# virtual methods
.method public ivm(Z)Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef$uef;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef$uef;->lw:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public oa(F)Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef$uef;
    .locals 0

    .line 2
    iput p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef$uef;->moa:F

    return-object p0
.end method

.method public oa()Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef;
    .locals 1

    .line 3
    new-instance v0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef;

    invoke-direct {v0, p0}, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef;-><init>(Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef$uef;)V

    return-object v0
.end method

.method public synthetic uef()Lcom/bytedance/sdk/component/adexpress/oa/cq;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef$uef;->oa()Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef;

    move-result-object v0

    return-object v0
.end method

.method public uef(F)Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef$uef;
    .locals 0

    .line 5
    iput p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef$uef;->yo:F

    return-object p0
.end method

.method public uef(Lcom/bytedance/adsdk/ugeno/core/sy;)Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef$uef;
    .locals 0

    .line 4
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef$uef;->oa:Lcom/bytedance/adsdk/ugeno/core/sy;

    return-object p0
.end method

.method public uef(Lorg/json/JSONObject;)Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef$uef;
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/ivm/uef$uef;->uef:Lorg/json/JSONObject;

    return-object p0
.end method
