.class Lcom/bytedance/sdk/openadsdk/core/bs$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/core/bcc$uef;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/core/bs;->uef(Lcom/bytedance/sdk/openadsdk/core/bcc;Landroid/view/ViewGroup;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic oa:Lcom/bytedance/sdk/openadsdk/core/bs;

.field final synthetic uef:Landroid/view/ViewGroup;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/core/bs;Landroid/view/ViewGroup;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/bs$5;->oa:Lcom/bytedance/sdk/openadsdk/core/bs;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/core/bs$5;->uef:Landroid/view/ViewGroup;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public oa()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/bs$5;->oa:Lcom/bytedance/sdk/openadsdk/core/bs;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/bs;->moa(Lcom/bytedance/sdk/openadsdk/core/bs;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public uef()V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/bs$5;->oa:Lcom/bytedance/sdk/openadsdk/core/bs;

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/bs$5;->uef:Landroid/view/ViewGroup;

    invoke-static {v0, v1}, Lcom/bytedance/sdk/openadsdk/core/bs;->uef(Lcom/bytedance/sdk/openadsdk/core/bs;Landroid/view/ViewGroup;)V

    return-void
.end method

.method public uef(Landroid/view/View;)V
    .locals 2

    .line 3
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/bs$5;->oa:Lcom/bytedance/sdk/openadsdk/core/bs;

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/bs$5;->uef:Landroid/view/ViewGroup;

    invoke-static {v0, v1, p1}, Lcom/bytedance/sdk/openadsdk/core/bs;->uef(Lcom/bytedance/sdk/openadsdk/core/bs;Landroid/view/ViewGroup;Landroid/view/View;)V

    return-void
.end method

.method public uef(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/bs$5;->oa:Lcom/bytedance/sdk/openadsdk/core/bs;

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/bs$5;->uef:Landroid/view/ViewGroup;

    invoke-static {v0, p1, v1}, Lcom/bytedance/sdk/openadsdk/core/bs;->uef(Lcom/bytedance/sdk/openadsdk/core/bs;ZLandroid/view/ViewGroup;)V

    return-void
.end method
