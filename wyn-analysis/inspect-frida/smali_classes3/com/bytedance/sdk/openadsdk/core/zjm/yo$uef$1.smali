.class Lcom/bytedance/sdk/openadsdk/core/zjm/yo$uef$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/core/zjm/yo$uef;->xs()Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic uef:Lcom/bytedance/sdk/openadsdk/core/zjm/yo$uef;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/core/zjm/yo$uef;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/yo$uef$1;->uef:Lcom/bytedance/sdk/openadsdk/core/zjm/yo$uef;

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
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/yo$uef$1;->uef:Lcom/bytedance/sdk/openadsdk/core/zjm/yo$uef;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/core/zjm/yo$uef;->oa(Lcom/bytedance/sdk/openadsdk/core/zjm/yo$uef;)Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/yo$uef$1;->uef:Lcom/bytedance/sdk/openadsdk/core/zjm/yo$uef;

    .line 8
    .line 9
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/core/zjm/yo$uef;->yo(Lcom/bytedance/sdk/openadsdk/core/zjm/yo$uef;)Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/core/zjm/yo$uef$1;->uef:Lcom/bytedance/sdk/openadsdk/core/zjm/yo$uef;

    .line 14
    .line 15
    invoke-static {v1}, Lcom/bytedance/sdk/openadsdk/core/zjm/yo$uef;->moa(Lcom/bytedance/sdk/openadsdk/core/zjm/yo$uef;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-static {p1, v0, v1}, Lcom/bytedance/sdk/openadsdk/activity/single/TTWebsiteActivity;->uef(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method
