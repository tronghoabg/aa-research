.class Lcom/bytedance/sdk/openadsdk/component/cz/lw$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/core/zjm/ivm$oa;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/component/cz/lw;->uef(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic uef:Lcom/bytedance/sdk/openadsdk/component/cz/lw;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/component/cz/lw;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/cz/lw$1;->uef:Lcom/bytedance/sdk/openadsdk/component/cz/lw;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public oa()V
    .locals 0

    return-void
.end method

.method public uef()Landroid/view/View;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/cz/lw$1;->uef:Lcom/bytedance/sdk/openadsdk/component/cz/lw;

    return-object v0
.end method

.method public uef(II)V
    .locals 0

    .line 1
    return-void
.end method

.method public uef(Landroid/view/View;I)V
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/cz/lw$1;->uef:Lcom/bytedance/sdk/openadsdk/component/cz/lw;

    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/cz/lw;->cq:Lcom/bytedance/sdk/openadsdk/component/cz/lw$uef;

    if-eqz v0, :cond_0

    .line 4
    invoke-interface {v0, p1, p2}, Lcom/bytedance/sdk/openadsdk/component/cz/lw$uef;->uef(Landroid/view/View;I)V

    :cond_0
    return-void
.end method
