.class Lcom/bytedance/sdk/openadsdk/component/reward/cq$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/component/utils/oa$oa;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/component/reward/cq;->uef(Landroid/content/Context;Landroid/content/Intent;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic moa:Lcom/bytedance/sdk/openadsdk/component/reward/cq;

.field final synthetic oa:J

.field final synthetic uef:Z

.field final synthetic yo:Lcom/bytedance/sdk/openadsdk/core/model/gzw;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/component/reward/cq;ZJLcom/bytedance/sdk/openadsdk/core/model/gzw;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/cq$2;->moa:Lcom/bytedance/sdk/openadsdk/component/reward/cq;

    .line 2
    .line 3
    iput-boolean p2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/cq$2;->uef:Z

    .line 4
    .line 5
    iput-wide p3, p0, Lcom/bytedance/sdk/openadsdk/component/reward/cq$2;->oa:J

    .line 6
    .line 7
    iput-object p5, p0, Lcom/bytedance/sdk/openadsdk/component/reward/cq$2;->yo:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public uef()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/cq$2;->uef:Z

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/cq$2;->moa:Lcom/bytedance/sdk/openadsdk/component/reward/cq;

    iget-wide v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/cq$2;->oa:J

    invoke-static {v0, v1, v2}, Lcom/bytedance/sdk/openadsdk/component/reward/cq;->uef(Lcom/bytedance/sdk/openadsdk/component/reward/cq;J)V

    :cond_0
    return-void
.end method

.method public uef(Ljava/lang/Throwable;)V
    .locals 3

    .line 3
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/cq$2;->yo:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/cq$2;->moa:Lcom/bytedance/sdk/openadsdk/component/reward/cq;

    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/cq;->yo:Ljava/lang/String;

    const-string v1, "activity_start_fail"

    const-string v2, "show_ad_fail"

    invoke-static {p1, v2, v0, v1}, Lcom/bytedance/sdk/openadsdk/moa/zjm;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    iget-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/cq$2;->uef:Z

    if-eqz p1, :cond_0

    .line 5
    new-instance p1, Lcom/bytedance/sdk/openadsdk/component/reward/cq$2$1;

    invoke-direct {p1, p0}, Lcom/bytedance/sdk/openadsdk/component/reward/cq$2$1;-><init>(Lcom/bytedance/sdk/openadsdk/component/reward/cq$2;)V

    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/sy/yo;->yo(Lcom/bytedance/sdk/openadsdk/sy/moa;)V

    :cond_0
    return-void
.end method
