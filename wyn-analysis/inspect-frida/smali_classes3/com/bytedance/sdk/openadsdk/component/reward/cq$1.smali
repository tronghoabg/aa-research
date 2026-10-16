.class Lcom/bytedance/sdk/openadsdk/component/reward/cq$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/sy/moa;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/component/reward/cq;->uef(Landroid/content/Context;Landroid/content/Intent;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic uef:Lcom/bytedance/sdk/openadsdk/component/reward/cq;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/component/reward/cq;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/cq$1;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/cq;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public uef()Lcom/bytedance/sdk/openadsdk/sy/oa/uef;
    .locals 2

    .line 1
    const-string v0, "start_activity"

    .line 2
    .line 3
    invoke-static {v0}, Lcb/a;->f(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/sy/oa/uef;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/cq$1;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/cq;

    .line 8
    .line 9
    iget-object v1, v1, Lcom/bytedance/sdk/openadsdk/component/reward/cq;->yo:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/sy/oa/uef;->moa(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method
