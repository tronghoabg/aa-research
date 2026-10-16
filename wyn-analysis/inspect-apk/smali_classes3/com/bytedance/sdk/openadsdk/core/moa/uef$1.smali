.class Lcom/bytedance/sdk/openadsdk/core/moa/uef$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bytedance/sdk/openadsdk/core/moa/uef;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic uef:Lcom/bytedance/sdk/openadsdk/core/moa/uef;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/core/moa/uef;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef$1;->uef:Lcom/bytedance/sdk/openadsdk/core/moa/uef;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onViewAttachedToWindow(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef$1;->uef:Lcom/bytedance/sdk/openadsdk/core/moa/uef;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->uef(Lcom/bytedance/sdk/openadsdk/core/moa/uef;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef$1;->uef:Lcom/bytedance/sdk/openadsdk/core/moa/uef;

    .line 10
    .line 11
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->oa(Lcom/bytedance/sdk/openadsdk/core/moa/uef;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef$1;->uef:Lcom/bytedance/sdk/openadsdk/core/moa/uef;

    .line 18
    .line 19
    iget-object v0, p1, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->uef:Lcom/bytedance/sdk/openadsdk/core/moa/moa;

    .line 20
    .line 21
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/moa/moa;->getCurView()Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef$1;->uef:Lcom/bytedance/sdk/openadsdk/core/moa/uef;

    .line 26
    .line 27
    invoke-static {v1}, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->yo(Lcom/bytedance/sdk/openadsdk/core/moa/uef;)Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-static {p1, v0, v1}, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->uef(Lcom/bytedance/sdk/openadsdk/core/moa/uef;Lcom/bytedance/sdk/openadsdk/core/zjm/tpx;Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V

    .line 32
    .line 33
    .line 34
    :cond_0
    return-void
.end method

.method public onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef$1;->uef:Lcom/bytedance/sdk/openadsdk/core/moa/uef;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->moa(Lcom/bytedance/sdk/openadsdk/core/moa/uef;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef$1;->uef:Lcom/bytedance/sdk/openadsdk/core/moa/uef;

    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->ivm()V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/moa/uef$1;->uef:Lcom/bytedance/sdk/openadsdk/core/moa/uef;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-static {p1, v0}, Lcom/bytedance/sdk/openadsdk/core/moa/uef;->uef(Lcom/bytedance/sdk/openadsdk/core/moa/uef;I)I

    .line 19
    .line 20
    .line 21
    return-void
.end method
