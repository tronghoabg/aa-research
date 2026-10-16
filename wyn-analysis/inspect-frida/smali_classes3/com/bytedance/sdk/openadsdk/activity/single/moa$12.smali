.class Lcom/bytedance/sdk/openadsdk/activity/single/moa$12;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/component/reward/top/oa;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/activity/single/moa;-><init>(Landroid/app/Activity;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Lcom/bytedance/sdk/openadsdk/activity/single/oa;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic oa:Lcom/bytedance/sdk/openadsdk/activity/single/oa;

.field final synthetic uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

.field final synthetic yo:Lcom/bytedance/sdk/openadsdk/activity/single/moa;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/activity/single/moa;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Lcom/bytedance/sdk/openadsdk/activity/single/oa;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/moa$12;->yo:Lcom/bytedance/sdk/openadsdk/activity/single/moa;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/activity/single/moa$12;->uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/bytedance/sdk/openadsdk/activity/single/moa$12;->oa:Lcom/bytedance/sdk/openadsdk/activity/single/oa;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public moa(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method public oa(Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/moa$12;->yo:Lcom/bytedance/sdk/openadsdk/activity/single/moa;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/activity/single/moa;->oa(Lcom/bytedance/sdk/openadsdk/activity/single/moa;)Lcom/bytedance/sdk/openadsdk/activity/single/bcc;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/moa$12;->yo:Lcom/bytedance/sdk/openadsdk/activity/single/moa;

    .line 10
    .line 11
    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/activity/single/moa;->oa(Lcom/bytedance/sdk/openadsdk/activity/single/moa;)Lcom/bytedance/sdk/openadsdk/activity/single/bcc;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->f_()V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public uef(Landroid/view/View;)V
    .locals 3

    .line 1
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/moa$12;->uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->lw()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const-string v2, "skip"

    invoke-static {v2, p1, v0, v1}, Lcom/bytedance/sdk/openadsdk/moa/yo;->uef(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;Ljava/util/Map;)V

    .line 2
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/moa$12;->uef:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->odd()Lcom/bytedance/sdk/openadsdk/core/model/moa;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/core/model/moa;->uef()Lcom/bytedance/sdk/openadsdk/core/dz/moa;

    move-result-object p1

    if-eqz p1, :cond_0

    const-wide/16 v0, 0x0

    .line 4
    invoke-virtual {p1, v0, v1}, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->ivm(J)V

    .line 5
    invoke-virtual {p1, v0, v1}, Lcom/bytedance/sdk/openadsdk/core/dz/moa;->lw(J)V

    .line 6
    :cond_0
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/moa$12;->yo:Lcom/bytedance/sdk/openadsdk/activity/single/moa;

    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/activity/single/moa;->uef(Lcom/bytedance/sdk/openadsdk/activity/single/moa;)V

    return-void
.end method

.method public uef(Landroid/view/View;Ljava/lang/String;)V
    .locals 0

    .line 7
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/moa$12;->yo:Lcom/bytedance/sdk/openadsdk/activity/single/moa;

    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/activity/single/moa;->oa(Lcom/bytedance/sdk/openadsdk/activity/single/moa;)Lcom/bytedance/sdk/openadsdk/activity/single/bcc;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 8
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/moa$12;->yo:Lcom/bytedance/sdk/openadsdk/activity/single/moa;

    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/activity/single/moa;->oa(Lcom/bytedance/sdk/openadsdk/activity/single/moa;)Lcom/bytedance/sdk/openadsdk/activity/single/bcc;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->uef(Ljava/lang/String;)V

    .line 9
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/moa$12;->yo:Lcom/bytedance/sdk/openadsdk/activity/single/moa;

    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/activity/single/moa;->yo(Lcom/bytedance/sdk/openadsdk/activity/single/moa;)Z

    move-result p2

    xor-int/lit8 p2, p2, 0x1

    invoke-static {p1, p2}, Lcom/bytedance/sdk/openadsdk/activity/single/moa;->uef(Lcom/bytedance/sdk/openadsdk/activity/single/moa;Z)Z

    :cond_0
    return-void
.end method

.method public yo(Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/moa$12;->oa:Lcom/bytedance/sdk/openadsdk/activity/single/oa;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->xs()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
