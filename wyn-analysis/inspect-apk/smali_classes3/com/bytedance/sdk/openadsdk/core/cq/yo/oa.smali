.class public Lcom/bytedance/sdk/openadsdk/core/cq/yo/oa;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bytedance/sdk/openadsdk/core/cq/yo/oa$uef;
    }
.end annotation


# instance fields
.field private final lw:Z

.field private moa:Lcom/bytedance/sdk/openadsdk/core/cq/yo/uef;

.field private oa:Landroid/content/Context;

.field private uef:Lcom/bytedance/sdk/openadsdk/core/cq/yo/yo;

.field private yo:Lcom/bytedance/sdk/openadsdk/core/model/gzw;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, p2, v0}, Lcom/bytedance/sdk/openadsdk/core/cq/yo/oa;-><init>(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Z)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Z)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/yo/oa;->oa:Landroid/content/Context;

    .line 4
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/yo/oa;->yo:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 5
    iput-boolean p3, p0, Lcom/bytedance/sdk/openadsdk/core/cq/yo/oa;->lw:Z

    return-void
.end method


# virtual methods
.method public moa()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/yo/oa;->uef:Lcom/bytedance/sdk/openadsdk/core/cq/yo/yo;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/core/cq/yo/yo;->yo()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public oa()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/yo/oa;->uef:Lcom/bytedance/sdk/openadsdk/core/cq/yo/yo;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/core/cq/yo/yo;->oa()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public uef()Lcom/bytedance/sdk/openadsdk/core/cq/yo/yo;
    .locals 1

    .line 11
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/yo/oa;->uef:Lcom/bytedance/sdk/openadsdk/core/cq/yo/yo;

    return-object v0
.end method

.method public uef(I)V
    .locals 2

    .line 7
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/yo/oa;->uef:Lcom/bytedance/sdk/openadsdk/core/cq/yo/yo;

    instance-of v1, v0, Lcom/bytedance/sdk/openadsdk/core/cq/yo/moa;

    if-eqz v1, :cond_0

    .line 8
    check-cast v0, Lcom/bytedance/sdk/openadsdk/core/cq/yo/moa;

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/cq/yo/moa;->lw()Lcom/bytedance/sdk/openadsdk/core/oyt;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 9
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/oyt;->uef()Lcom/bytedance/sdk/openadsdk/cq/oa;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 10
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/oyt;->uef()Lcom/bytedance/sdk/openadsdk/cq/oa;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/bytedance/sdk/openadsdk/cq/oa;->uef(I)V

    :cond_0
    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/core/cq/yo/uef;)V
    .locals 1

    .line 4
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/yo/oa;->moa:Lcom/bytedance/sdk/openadsdk/core/cq/yo/uef;

    .line 5
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/yo/oa;->uef:Lcom/bytedance/sdk/openadsdk/core/cq/yo/yo;

    if-eqz v0, :cond_0

    .line 6
    invoke-interface {v0, p1}, Lcom/bytedance/sdk/openadsdk/core/cq/yo/yo;->uef(Lcom/bytedance/sdk/openadsdk/core/cq/yo/uef;)V

    :cond_0
    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/core/zjm/ab;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/yo/oa;->oa:Landroid/content/Context;

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/yo/oa;->yo:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    iget-boolean v2, p0, Lcom/bytedance/sdk/openadsdk/core/cq/yo/oa;->lw:Z

    invoke-static {v0, v1, v2}, Lcom/bytedance/sdk/openadsdk/core/cq/yo/oa$uef;->uef(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Z)Lcom/bytedance/sdk/openadsdk/core/cq/yo/yo;

    move-result-object v0

    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/yo/oa;->uef:Lcom/bytedance/sdk/openadsdk/core/cq/yo/yo;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/core/cq/yo/yo;->uef()V

    .line 3
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/yo/oa;->uef:Lcom/bytedance/sdk/openadsdk/core/cq/yo/yo;

    invoke-interface {v0, p1}, Lcom/bytedance/sdk/openadsdk/core/cq/yo/yo;->uef(Lcom/bytedance/sdk/openadsdk/core/zjm/ab;)V

    :cond_0
    return-void
.end method

.method public yo()Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/cq/yo/oa;->uef:Lcom/bytedance/sdk/openadsdk/core/cq/yo/yo;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/core/cq/yo/yo;->moa()Landroid/view/View;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
.end method
