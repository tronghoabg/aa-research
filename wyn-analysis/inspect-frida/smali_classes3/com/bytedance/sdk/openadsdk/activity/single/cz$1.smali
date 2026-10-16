.class Lcom/bytedance/sdk/openadsdk/activity/single/cz$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/utils/cz$uef;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/sdk/openadsdk/activity/single/cz;->orq()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic uef:Lcom/bytedance/sdk/openadsdk/activity/single/cz;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/activity/single/cz;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz$1;->uef:Lcom/bytedance/sdk/openadsdk/activity/single/cz;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public oa()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz$1;->uef:Lcom/bytedance/sdk/openadsdk/activity/single/cz;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->uef(Lcom/bytedance/sdk/openadsdk/activity/single/cz;)Lcom/bytedance/sdk/openadsdk/component/reward/top/yo;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz$1;->uef:Lcom/bytedance/sdk/openadsdk/activity/single/cz;

    .line 10
    .line 11
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->uef(Lcom/bytedance/sdk/openadsdk/activity/single/cz;)Lcom/bytedance/sdk/openadsdk/component/reward/top/yo;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/top/yo;->setSkipInvisiable()V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public uef()Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz$1;->uef:Lcom/bytedance/sdk/openadsdk/activity/single/cz;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->uef(Lcom/bytedance/sdk/openadsdk/activity/single/cz;)Lcom/bytedance/sdk/openadsdk/component/reward/top/yo;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/activity/single/cz$1;->uef:Lcom/bytedance/sdk/openadsdk/activity/single/cz;

    .line 10
    .line 11
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/activity/single/cz;->uef(Lcom/bytedance/sdk/openadsdk/activity/single/cz;)Lcom/bytedance/sdk/openadsdk/component/reward/top/yo;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/component/reward/top/yo;->getCloseButton()Landroid/view/View;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    return-object v0

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    return-object v0
.end method
