.class Lcom/bytedance/sdk/openadsdk/core/widget/dhk$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/core/widget/dhk;->uef(Landroid/content/Context;Landroid/view/View;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic uef:Lcom/bytedance/sdk/openadsdk/core/widget/dhk;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/core/widget/dhk;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/widget/dhk$1;->uef:Lcom/bytedance/sdk/openadsdk/core/widget/dhk;

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
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/widget/dhk$1;->uef:Lcom/bytedance/sdk/openadsdk/core/widget/dhk;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/core/widget/dhk;->uef(Lcom/bytedance/sdk/openadsdk/core/widget/dhk;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/widget/dhk$1;->uef:Lcom/bytedance/sdk/openadsdk/core/widget/dhk;

    .line 7
    .line 8
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/core/widget/dhk;->oa(Lcom/bytedance/sdk/openadsdk/core/widget/dhk;)Lcom/bytedance/sdk/openadsdk/core/wk/oa/uef;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/widget/dhk$1;->uef:Lcom/bytedance/sdk/openadsdk/core/widget/dhk;

    .line 15
    .line 16
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/core/widget/dhk;->oa(Lcom/bytedance/sdk/openadsdk/core/widget/dhk;)Lcom/bytedance/sdk/openadsdk/core/wk/oa/uef;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    sget-object v0, Lcom/bytedance/sdk/openadsdk/core/widget/dhk$uef;->yo:Lcom/bytedance/sdk/openadsdk/core/widget/dhk$uef;

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    invoke-interface {p1, v0, v1}, Lcom/bytedance/sdk/openadsdk/core/wk/oa/uef;->uef(Lcom/bytedance/sdk/openadsdk/core/widget/dhk$uef;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    return-void
.end method
