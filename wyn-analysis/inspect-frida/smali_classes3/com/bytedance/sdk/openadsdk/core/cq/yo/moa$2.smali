.class Lcom/bytedance/sdk/openadsdk/core/cq/yo/moa$2;
.super Lcom/bytedance/sdk/openadsdk/core/widget/uef/lw;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/core/cq/yo/moa;->xs()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic uef:Lcom/bytedance/sdk/openadsdk/core/cq/yo/moa;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/core/cq/yo/moa;Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/core/oyt;Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/moa/cq;Z)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/yo/moa$2;->uef:Lcom/bytedance/sdk/openadsdk/core/cq/yo/moa;

    .line 2
    .line 3
    move-object p1, p0

    .line 4
    invoke-direct/range {p1 .. p6}, Lcom/bytedance/sdk/openadsdk/core/widget/uef/lw;-><init>(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/core/oyt;Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/moa/cq;Z)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/bytedance/sdk/openadsdk/core/widget/uef/lw;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/yo/moa$2;->uef:Lcom/bytedance/sdk/openadsdk/core/cq/yo/moa;

    .line 5
    .line 6
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/core/cq/yo/moa;->uef(Lcom/bytedance/sdk/openadsdk/core/cq/yo/moa;)Lcom/bytedance/sdk/openadsdk/core/cq/yo/moa$uef;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/cq/yo/moa$2;->uef:Lcom/bytedance/sdk/openadsdk/core/cq/yo/moa;

    .line 13
    .line 14
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/core/cq/yo/moa;->uef(Lcom/bytedance/sdk/openadsdk/core/cq/yo/moa;)Lcom/bytedance/sdk/openadsdk/core/cq/yo/moa$uef;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-interface {p1}, Lcom/bytedance/sdk/openadsdk/core/cq/yo/moa$uef;->xs()V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method
