.class Lcom/bytedance/sdk/openadsdk/component/reward/zjm$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/component/reward/cq$uef;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/component/reward/zjm;-><init>(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/core/model/uef;Lcom/bytedance/sdk/openadsdk/AdSlot;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic uef:Lcom/bytedance/sdk/openadsdk/component/reward/zjm;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/component/reward/zjm;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/zjm$1;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/zjm;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public uef(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Landroid/app/Activity;)Landroid/content/Intent;
    .locals 0

    .line 1
    invoke-static {p2}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/bcc;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)Z

    move-result p3

    if-eqz p3, :cond_0

    .line 2
    new-instance p2, Landroid/content/Intent;

    const-class p3, Lcom/bytedance/sdk/openadsdk/activity/TTRewardWebActivity;

    invoke-direct {p2, p1, p3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    return-object p2

    .line 3
    :cond_0
    invoke-virtual {p2}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->gem()Z

    move-result p3

    if-eqz p3, :cond_1

    .line 4
    new-instance p2, Landroid/content/Intent;

    const-class p3, Lcom/bytedance/sdk/openadsdk/activity/single/TTAdActivity;

    invoke-direct {p2, p1, p3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    return-object p2

    .line 5
    :cond_1
    invoke-virtual {p2}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->ivm()Z

    move-result p2

    if-eqz p2, :cond_2

    new-instance p2, Landroid/content/Intent;

    const-class p3, Lcom/bytedance/sdk/openadsdk/activity/single/TTRewardExpressVideoActivity;

    invoke-direct {p2, p1, p3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    return-object p2

    :cond_2
    new-instance p2, Landroid/content/Intent;

    const-class p3, Lcom/bytedance/sdk/openadsdk/activity/single/TTRewardVideoActivity;

    invoke-direct {p2, p1, p3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    return-object p2
.end method

.method public uef(Landroid/content/Intent;Landroid/app/Activity;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Z)V
    .locals 1

    .line 6
    iget-object p3, p0, Lcom/bytedance/sdk/openadsdk/component/reward/zjm$1;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/zjm;

    invoke-static {p3}, Lcom/bytedance/sdk/openadsdk/component/reward/zjm;->uef(Lcom/bytedance/sdk/openadsdk/component/reward/zjm;)Lcom/bytedance/sdk/openadsdk/component/reward/cq;

    move-result-object p3

    invoke-virtual {p3}, Lcom/bytedance/sdk/openadsdk/component/reward/cq;->yo()Z

    move-result p3

    iget-object p4, p0, Lcom/bytedance/sdk/openadsdk/component/reward/zjm$1;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/zjm;

    invoke-static {p4}, Lcom/bytedance/sdk/openadsdk/component/reward/zjm;->oa(Lcom/bytedance/sdk/openadsdk/component/reward/zjm;)Lcom/bytedance/sdk/openadsdk/core/model/uef;

    move-result-object p4

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/zjm$1;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/zjm;

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/zjm;->yo(Lcom/bytedance/sdk/openadsdk/component/reward/zjm;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, p2, p3, p4, v0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/yo;->uef(Landroid/content/Intent;Landroid/app/Activity;ZLcom/bytedance/sdk/openadsdk/core/model/uef;Ljava/lang/String;)V

    .line 7
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/zjm$1;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/zjm;

    invoke-static {p2}, Lcom/bytedance/sdk/openadsdk/component/reward/zjm;->moa(Lcom/bytedance/sdk/openadsdk/component/reward/zjm;)Lcom/bytedance/sdk/openadsdk/AdSlot;

    move-result-object p2

    invoke-virtual {p2}, Lcom/bytedance/sdk/openadsdk/AdSlot;->getMediaExtra()Ljava/lang/String;

    move-result-object p2

    const-string p3, "media_extra"

    invoke-virtual {p1, p3, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 8
    iget-object p2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/zjm$1;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/zjm;

    invoke-static {p2}, Lcom/bytedance/sdk/openadsdk/component/reward/zjm;->moa(Lcom/bytedance/sdk/openadsdk/component/reward/zjm;)Lcom/bytedance/sdk/openadsdk/AdSlot;

    move-result-object p2

    invoke-virtual {p2}, Lcom/bytedance/sdk/openadsdk/AdSlot;->getUserID()Ljava/lang/String;

    move-result-object p2

    const-string p3, "user_id"

    invoke-virtual {p1, p3, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V
    .locals 2

    .line 13
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/zjm$1;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/zjm;

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/zjm;->uef(Lcom/bytedance/sdk/openadsdk/component/reward/zjm;)Lcom/bytedance/sdk/openadsdk/component/reward/cq;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/cq;->yo()Z

    move-result v0

    const/4 v1, 0x1

    invoke-static {p1, v0, v1}, Lcom/bytedance/sdk/openadsdk/component/reward/oa;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;ZZ)V

    return-void
.end method

.method public uef(Z)V
    .locals 2

    .line 9
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/zjm$1;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/zjm;

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/zjm;->lw(Lcom/bytedance/sdk/openadsdk/component/reward/zjm;)Lcom/bytedance/sdk/openadsdk/uef/lw/uef;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    if-eqz p1, :cond_1

    .line 10
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/cp;->uef()Lcom/bytedance/sdk/openadsdk/core/cp;

    move-result-object p1

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/zjm$1;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/zjm;

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/zjm;->yo(Lcom/bytedance/sdk/openadsdk/component/reward/zjm;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/zjm$1;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/zjm;

    invoke-static {v1}, Lcom/bytedance/sdk/openadsdk/component/reward/zjm;->lw(Lcom/bytedance/sdk/openadsdk/component/reward/zjm;)Lcom/bytedance/sdk/openadsdk/uef/lw/uef;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/bytedance/sdk/openadsdk/core/cp;->uef(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    .line 11
    :cond_1
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/cp;->uef()Lcom/bytedance/sdk/openadsdk/core/cp;

    move-result-object p1

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/zjm$1;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/zjm;

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/zjm;->lw(Lcom/bytedance/sdk/openadsdk/component/reward/zjm;)Lcom/bytedance/sdk/openadsdk/uef/lw/uef;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/bytedance/sdk/openadsdk/core/cp;->uef(Lcom/bytedance/sdk/openadsdk/uef/lw/uef;)V

    .line 12
    :goto_0
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/zjm$1;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/zjm;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/bytedance/sdk/openadsdk/component/reward/zjm;->uef(Lcom/bytedance/sdk/openadsdk/component/reward/zjm;Lcom/bytedance/sdk/openadsdk/uef/lw/uef;)Lcom/bytedance/sdk/openadsdk/uef/lw/uef;

    return-void
.end method
