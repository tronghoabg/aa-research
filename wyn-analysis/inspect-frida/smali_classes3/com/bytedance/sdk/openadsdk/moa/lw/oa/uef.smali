.class public Lcom/bytedance/sdk/openadsdk/moa/lw/oa/uef;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private ivm:Z

.field private lw:Lcom/bytedance/sdk/openadsdk/moa/lw/oa/yo;

.field private moa:Lorg/json/JSONObject;

.field private oa:Ljava/lang/String;

.field private uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

.field private yo:Lorg/json/JSONObject;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;Lorg/json/JSONObject;Lorg/json/JSONObject;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/uef;->ivm:Z

    .line 6
    .line 7
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 8
    .line 9
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/uef;->oa:Ljava/lang/String;

    .line 10
    .line 11
    iput-object p3, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/uef;->yo:Lorg/json/JSONObject;

    .line 12
    .line 13
    iput-object p4, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/uef;->moa:Lorg/json/JSONObject;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public ivm()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/uef;->ivm:Z

    .line 2
    .line 3
    return v0
.end method

.method public lw()Lcom/bytedance/sdk/openadsdk/moa/lw/oa/yo;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/uef;->lw:Lcom/bytedance/sdk/openadsdk/moa/lw/oa/yo;

    .line 2
    .line 3
    return-object v0
.end method

.method public moa()Lorg/json/JSONObject;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/uef;->moa:Lorg/json/JSONObject;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lorg/json/JSONObject;

    .line 6
    .line 7
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/uef;->moa:Lorg/json/JSONObject;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/uef;->moa:Lorg/json/JSONObject;

    .line 13
    .line 14
    return-object v0
.end method

.method public oa()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/uef;->oa:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public uef()Lcom/bytedance/sdk/openadsdk/core/model/gzw;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/uef;->uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    return-object v0
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/moa/lw/oa/yo;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/uef;->lw:Lcom/bytedance/sdk/openadsdk/moa/lw/oa/yo;

    return-void
.end method

.method public uef(Z)V
    .locals 0

    .line 3
    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/uef;->ivm:Z

    return-void
.end method

.method public xs()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/uef;->lw:Lcom/bytedance/sdk/openadsdk/moa/lw/oa/yo;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p0}, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/yo;->uef(Lcom/bytedance/sdk/openadsdk/moa/lw/oa/uef;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public yo()Lorg/json/JSONObject;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/uef;->yo:Lorg/json/JSONObject;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lorg/json/JSONObject;

    .line 6
    .line 7
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/uef;->yo:Lorg/json/JSONObject;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/moa/lw/oa/uef;->yo:Lorg/json/JSONObject;

    .line 13
    .line 14
    return-object v0
.end method
