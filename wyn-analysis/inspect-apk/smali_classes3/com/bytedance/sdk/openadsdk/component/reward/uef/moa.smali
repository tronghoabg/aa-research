.class public Lcom/bytedance/sdk/openadsdk/component/reward/uef/moa;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private oa:Lcom/bytedance/sdk/openadsdk/common/bs;

.field private final uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

.field private yo:Lcom/bytedance/sdk/openadsdk/common/TTAdDislikeToast;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/moa;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    .line 5
    .line 6
    return-void
.end method

.method private moa()V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/moa;->yo:Lcom/bytedance/sdk/openadsdk/common/TTAdDislikeToast;

    if-eqz v0, :cond_0

    .line 3
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/common/TTAdDislikeToast;->getDislikeSendTip()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/openadsdk/common/TTAdDislikeToast;->show(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static synthetic moa(Lcom/bytedance/sdk/openadsdk/component/reward/uef/moa;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/moa;->moa()V

    return-void
.end method

.method public static synthetic oa(Lcom/bytedance/sdk/openadsdk/component/reward/uef/moa;)Lcom/bytedance/sdk/openadsdk/common/bs;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/moa;->oa:Lcom/bytedance/sdk/openadsdk/common/bs;

    return-object p0
.end method

.method private oa(Lcom/bytedance/sdk/openadsdk/component/reward/oa/oa;)V
    .locals 4

    .line 4
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/moa;->oa:Lcom/bytedance/sdk/openadsdk/common/bs;

    const v1, 0x1020002

    if-nez v0, :cond_0

    .line 5
    new-instance v0, Lcom/bytedance/sdk/openadsdk/common/bs;

    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/moa;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object v3, v2, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->pu:Landroid/app/Activity;

    iget-object v2, v2, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->oa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    invoke-direct {v0, v3, v2}, Lcom/bytedance/sdk/openadsdk/common/bs;-><init>(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/core/model/gzw;)V

    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/moa;->oa:Lcom/bytedance/sdk/openadsdk/common/bs;

    .line 6
    new-instance v2, Lcom/bytedance/sdk/openadsdk/component/reward/uef/moa$1;

    invoke-direct {v2, p0, p1}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/moa$1;-><init>(Lcom/bytedance/sdk/openadsdk/component/reward/uef/moa;Lcom/bytedance/sdk/openadsdk/component/reward/oa/oa;)V

    invoke-virtual {v0, v2}, Lcom/bytedance/sdk/openadsdk/common/bs;->setCallback(Lcom/bytedance/sdk/openadsdk/common/bs$uef;)V

    .line 7
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/moa;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object p1, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->pu:Landroid/app/Activity;

    invoke-virtual {p1, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/FrameLayout;

    .line 8
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/moa;->oa:Lcom/bytedance/sdk/openadsdk/common/bs;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 9
    :cond_0
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/moa;->yo:Lcom/bytedance/sdk/openadsdk/common/TTAdDislikeToast;

    if-nez p1, :cond_1

    .line 10
    new-instance p1, Lcom/bytedance/sdk/openadsdk/common/TTAdDislikeToast;

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/moa;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->pu:Landroid/app/Activity;

    invoke-direct {p1, v0}, Lcom/bytedance/sdk/openadsdk/common/TTAdDislikeToast;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/moa;->yo:Lcom/bytedance/sdk/openadsdk/common/TTAdDislikeToast;

    .line 11
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/moa;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object p1, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->pu:Landroid/app/Activity;

    invoke-virtual {p1, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/FrameLayout;

    .line 12
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/moa;->yo:Lcom/bytedance/sdk/openadsdk/common/TTAdDislikeToast;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_1
    return-void
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/component/reward/uef/moa;)Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/moa;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    return-object p0
.end method

.method private yo()Z
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/moa;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-boolean v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->dh:Z

    return v0
.end method

.method public static synthetic yo(Lcom/bytedance/sdk/openadsdk/component/reward/uef/moa;)Z
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/moa;->yo()Z

    move-result p0

    return p0
.end method


# virtual methods
.method public oa()V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/moa;->yo:Lcom/bytedance/sdk/openadsdk/common/TTAdDislikeToast;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/common/TTAdDislikeToast;->onDestroy()V

    :cond_0
    return-void
.end method

.method public uef()V
    .locals 1

    .line 16
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/moa;->yo:Lcom/bytedance/sdk/openadsdk/common/TTAdDislikeToast;

    if-eqz v0, :cond_0

    .line 17
    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/common/TTAdDislikeToast;->hide()V

    :cond_0
    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/component/reward/oa/oa;)V
    .locals 4

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/moa;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->pu:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_2

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/moa;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object v1, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->sw:Lcom/bytedance/sdk/openadsdk/activity/single/bcc;

    instance-of v2, v1, Lcom/bytedance/sdk/openadsdk/activity/single/lw;

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    check-cast v1, Lcom/bytedance/sdk/openadsdk/activity/single/lw;

    iget-boolean v1, v1, Lcom/bytedance/sdk/openadsdk/activity/single/lw;->uef:Z

    if-eqz v1, :cond_1

    move v1, v3

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    .line 4
    :goto_0
    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->dj:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_5

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/moa;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->sw:Lcom/bytedance/sdk/openadsdk/activity/single/bcc;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/activity/single/bcc;->sk()Lcom/bytedance/sdk/openadsdk/activity/single/oa;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/activity/single/oa;->ue()Z

    move-result v0

    if-eqz v0, :cond_2

    if-nez v1, :cond_2

    goto :goto_3

    .line 5
    :cond_2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/moa;->oa:Lcom/bytedance/sdk/openadsdk/common/bs;

    if-nez v0, :cond_3

    .line 6
    :try_start_0
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/component/reward/uef/moa;->oa(Lcom/bytedance/sdk/openadsdk/component/reward/oa/oa;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    .line 7
    const-string v0, "initDislike error"

    const-string v1, "RewardFullDislikeManager"

    invoke-static {v0, v1, p1}, Lcom/bytedance/sdk/openadsdk/ApmHelper;->reportCustomError(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 8
    :cond_3
    :goto_1
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/moa;->oa:Lcom/bytedance/sdk/openadsdk/common/bs;

    if-eqz p1, :cond_4

    .line 9
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/common/bs;->uef()V

    :cond_4
    :goto_2
    return-void

    .line 10
    :cond_5
    :goto_3
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/moa;->yo:Lcom/bytedance/sdk/openadsdk/common/TTAdDislikeToast;

    if-nez p1, :cond_6

    .line 11
    new-instance p1, Lcom/bytedance/sdk/openadsdk/common/TTAdDislikeToast;

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/moa;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object v0, v0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->pu:Landroid/app/Activity;

    invoke-direct {p1, v0}, Lcom/bytedance/sdk/openadsdk/common/TTAdDislikeToast;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/moa;->yo:Lcom/bytedance/sdk/openadsdk/common/TTAdDislikeToast;

    .line 12
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/moa;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object p1, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->pu:Landroid/app/Activity;

    const v0, 0x1020002

    invoke-virtual {p1, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/FrameLayout;

    .line 13
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/moa;->yo:Lcom/bytedance/sdk/openadsdk/common/TTAdDislikeToast;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 14
    :cond_6
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/moa;->yo:Lcom/bytedance/sdk/openadsdk/common/TTAdDislikeToast;

    invoke-static {}, Lcom/bytedance/sdk/openadsdk/common/TTAdDislikeToast;->getDislikeTip()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/bytedance/sdk/openadsdk/common/TTAdDislikeToast;->show(Ljava/lang/String;)V

    .line 15
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/uef/moa;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;

    iget-object p1, p1, Lcom/bytedance/sdk/openadsdk/component/reward/uef/oa;->dj:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p1, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void
.end method
