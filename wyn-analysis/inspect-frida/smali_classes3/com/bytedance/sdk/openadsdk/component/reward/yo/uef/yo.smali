.class public Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/yo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final ivm:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private lw:Ljava/lang/String;

.field private moa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

.field private oa:Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef;

.field private final uef:Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;

.field private xs:J

.field private yo:Landroid/app/Activity;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;Landroid/app/Activity;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/yo;->ivm:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 11
    .line 12
    const-wide/16 v0, 0x0

    .line 13
    .line 14
    iput-wide v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/yo;->xs:J

    .line 15
    .line 16
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/yo;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;

    .line 17
    .line 18
    iput-object p2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/yo;->yo:Landroid/app/Activity;

    .line 19
    .line 20
    iput-object p3, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/yo;->moa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    .line 21
    .line 22
    iput-object p4, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/yo;->lw:Ljava/lang/String;

    .line 23
    .line 24
    return-void
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/yo;)Lcom/bytedance/sdk/openadsdk/core/model/gzw;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/yo;->moa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    return-object p0
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/yo;Lorg/json/JSONObject;Lorg/json/JSONObject;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/yo;->uef(Lorg/json/JSONObject;Lorg/json/JSONObject;)V

    return-void
.end method

.method private uef(Lorg/json/JSONObject;Lorg/json/JSONObject;)V
    .locals 2

    .line 10
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/yo;->moa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/yo;->lw:Ljava/lang/String;

    invoke-static {v0, v1, p1, p2}, Lcom/bytedance/sdk/openadsdk/moa/yo;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;Lorg/json/JSONObject;Lorg/json/JSONObject;)V

    .line 11
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/yo;->oa:Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef;

    if-eqz p1, :cond_0

    .line 12
    invoke-interface {p1}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef;->oa()V

    :cond_0
    return-void
.end method


# virtual methods
.method public oa()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/yo;->xs:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef;)V
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/yo;->oa:Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef;

    return-void
.end method

.method public uef(Lorg/json/JSONObject;)V
    .locals 3

    .line 5
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/yo;->ivm:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/yo;->ivm:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-nez v0, :cond_1

    :goto_0
    return-void

    .line 7
    :cond_1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/yo;->yo:Landroid/app/Activity;

    const v1, 0x1020002

    invoke-virtual {v0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_2

    .line 8
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/yo;->yo:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    .line 9
    :cond_2
    new-instance v1, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/yo$1;

    invoke-direct {v1, p0, p1, v0}, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/yo$1;-><init>(Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/yo;Lorg/json/JSONObject;Landroid/view/View;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public uef(ZLcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;)V
    .locals 0

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_1

    .line 19
    invoke-virtual {p2}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->vxo()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p2}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->ue()Z

    move-result p1

    if-nez p1, :cond_1

    const/4 p1, 0x1

    .line 20
    invoke-virtual {p2, p1}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->xs(Z)V

    .line 21
    invoke-virtual {p2}, Lcom/bytedance/sdk/openadsdk/core/model/gzw;->lu()Lcom/bytedance/sdk/openadsdk/utils/pu;

    move-result-object p1

    invoke-static {p2, p3, p1}, Lcom/bytedance/sdk/openadsdk/moa/yo;->uef(Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/utils/pu;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public uef(ZLcom/bytedance/sdk/openadsdk/moa/xs;)V
    .locals 6

    .line 13
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/yo;->uef:Lcom/bytedance/sdk/openadsdk/component/reward/yo/oa;

    if-nez v0, :cond_0

    return-void

    :cond_0
    if-nez p1, :cond_1

    .line 14
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/yo;->ivm:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-wide v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/yo;->xs:J

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-lez p1, :cond_1

    .line 15
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iget-wide v4, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/yo;->xs:J

    sub-long/2addr v0, v4

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p1

    .line 16
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/yo;->moa:Lcom/bytedance/sdk/openadsdk/core/model/gzw;

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/yo;->lw:Ljava/lang/String;

    invoke-static {p1, v0, v1, p2}, Lcom/bytedance/sdk/openadsdk/moa/yo;->uef(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/core/model/gzw;Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/moa/xs;)V

    .line 17
    iput-wide v2, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/yo;->xs:J

    return-void

    .line 18
    :cond_1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide p1

    iput-wide p1, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/yo;->xs:J

    return-void
.end method

.method public uef()Z
    .locals 1

    .line 4
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/component/reward/yo/uef/yo;->ivm:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    return v0
.end method
