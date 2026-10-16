.class Lcom/bytedance/sdk/openadsdk/core/wk/oa/moa$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/core/wk/oa/moa;->moa()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic uef:Lcom/bytedance/sdk/openadsdk/core/wk/oa/moa;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/core/wk/oa/moa;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/moa$1;->uef:Lcom/bytedance/sdk/openadsdk/core/wk/oa/moa;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/moa$1;->uef:Lcom/bytedance/sdk/openadsdk/core/wk/oa/moa;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->ab()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/moa$1;->uef:Lcom/bytedance/sdk/openadsdk/core/wk/oa/moa;

    .line 10
    .line 11
    iget-object v1, v0, Lcom/bytedance/sdk/openadsdk/core/wk/oa/lw;->rt:Lcom/bytedance/sdk/openadsdk/core/wk/oa/uef;

    .line 12
    .line 13
    invoke-interface {v1, v0, p1}, Lcom/bykv/vk/openvk/uef/uef/uef/moa/uef;->yo(Lcom/bykv/vk/openvk/uef/uef/uef/moa/oa;Landroid/view/View;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method
