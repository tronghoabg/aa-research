.class public Lcom/bytedance/sdk/openadsdk/core/dj/yo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private oa:Lcom/bytedance/sdk/openadsdk/core/dj/moa;

.field private final uef:Ljava/util/concurrent/atomic/AtomicInteger;

.field private final yo:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/dj/yo;->uef:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 11
    .line 12
    new-instance v0, Lcom/bytedance/sdk/openadsdk/core/dj/yo$3;

    .line 13
    .line 14
    invoke-direct {v0, p0}, Lcom/bytedance/sdk/openadsdk/core/dj/yo$3;-><init>(Lcom/bytedance/sdk/openadsdk/core/dj/yo;)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/dj/yo;->yo:Ljava/lang/Runnable;

    .line 18
    .line 19
    return-void
.end method

.method private oa(Lorg/json/JSONObject;)Lorg/json/JSONObject;
    .locals 1

    .line 7
    sget-object v0, Lcom/bytedance/sdk/component/embedapplog/PangleEncryptConstant$CryptDataScene;->REGISTER_STATUS:Lcom/bytedance/sdk/component/embedapplog/PangleEncryptConstant$CryptDataScene;

    invoke-static {v0, p1}, Lcom/bytedance/sdk/openadsdk/core/gsd;->uef(Lcom/bytedance/sdk/component/embedapplog/PangleEncryptConstant$CryptDataScene;Lorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object p1

    return-object p1
.end method

.method private oa()V
    .locals 5

    .line 1
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/dj/oa;->uef()Lcom/bytedance/sdk/openadsdk/core/dj/oa;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/dj/oa;->xs()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/dj/yo;->uef:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result v0

    const/4 v2, 0x3

    if-gt v0, v2, :cond_0

    .line 3
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/wk;->oa()Landroid/os/Handler;

    move-result-object v1

    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/core/dj/yo;->yo:Ljava/lang/Runnable;

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    mul-int/lit16 v0, v0, 0x2710

    .line 4
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/wk;->oa()Landroid/os/Handler;

    move-result-object v1

    iget-object v2, p0, Lcom/bytedance/sdk/openadsdk/core/dj/yo;->yo:Ljava/lang/Runnable;

    int-to-long v3, v0

    invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    .line 5
    :cond_0
    invoke-direct {p0, v1}, Lcom/bytedance/sdk/openadsdk/core/dj/yo;->uef(Z)V

    return-void

    .line 6
    :cond_1
    invoke-direct {p0, v1}, Lcom/bytedance/sdk/openadsdk/core/dj/yo;->uef(Z)V

    return-void
.end method

.method private uef(Landroid/content/Context;)Lorg/json/JSONObject;
    .locals 2

    .line 26
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 27
    :try_start_0
    const-string v1, "net_status"

    invoke-static {p1}, Lcom/bytedance/sdk/component/utils/sy;->uef(Landroid/content/Context;)Z

    move-result p1

    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-object v0
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/core/dj/yo;Landroid/content/Context;)Lorg/json/JSONObject;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/core/dj/yo;->uef(Landroid/content/Context;)Lorg/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/core/dj/yo;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/core/dj/yo;->oa()V

    return-void
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/core/dj/yo;Z)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/core/dj/yo;->uef(Z)V

    return-void
.end method

.method private uef(Z)V
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/core/dj/yo;->oa:Lcom/bytedance/sdk/openadsdk/core/dj/moa;

    if-eqz v0, :cond_0

    .line 21
    invoke-interface {v0, p1}, Lcom/bytedance/sdk/openadsdk/core/dj/moa;->uef(Z)V

    :cond_0
    return-void
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/core/dj/yo;Lorg/json/JSONObject;)Z
    .locals 0

    .line 4
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/openadsdk/core/dj/yo;->uef(Lorg/json/JSONObject;)Z

    move-result p0

    return p0
.end method

.method private uef(Lorg/json/JSONObject;)Z
    .locals 3

    .line 22
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/dj/oa;->uef()Lcom/bytedance/sdk/openadsdk/core/dj/oa;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/dj/oa;->yo()I

    move-result v0

    .line 23
    const-string v1, "app_reg"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v0, -0x1

    .line 24
    invoke-virtual {p1, v1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    .line 25
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/dj/oa;->uef()Lcom/bytedance/sdk/openadsdk/core/dj/oa;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/bytedance/sdk/openadsdk/core/dj/oa;->uef(I)V

    :cond_0
    const/4 p1, 0x1

    if-ne v0, p1, :cond_1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method private yo()Lorg/json/JSONObject;
    .locals 3

    .line 1
    new-instance v0, Lorg/json/JSONObject;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    const-string v1, "app_id"

    .line 7
    .line 8
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/zjm;->oa()Lcom/bytedance/sdk/openadsdk/core/zjm;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {v2}, Lcom/bytedance/sdk/openadsdk/core/zjm;->moa()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    .line 19
    :catchall_0
    return-object v0
.end method


# virtual methods
.method public uef()V
    .locals 5

    .line 6
    :try_start_0
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/dj/oa;->uef()Lcom/bytedance/sdk/openadsdk/core/dj/oa;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/dj/oa;->ivm()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    .line 7
    invoke-direct {p0, v1}, Lcom/bytedance/sdk/openadsdk/core/dj/yo;->uef(Z)V

    return-void

    .line 8
    :cond_0
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/core/dj/yo;->yo()Lorg/json/JSONObject;

    move-result-object v0

    .line 9
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/dhk/oa;->oa()Lcom/bytedance/sdk/openadsdk/dhk/oa;

    move-result-object v2

    invoke-virtual {v2}, Lcom/bytedance/sdk/openadsdk/dhk/oa;->yo()Lcom/bytedance/sdk/component/xs/uef;

    move-result-object v2

    invoke-virtual {v2}, Lcom/bytedance/sdk/component/xs/uef;->oa()Lcom/bytedance/sdk/component/xs/oa/moa;

    move-result-object v2

    .line 10
    const-string v3, "/api/ad/union/sdk/register_status/"

    const/4 v4, 0x0

    invoke-static {v3, v4, v1}, Lcom/bytedance/sdk/openadsdk/utils/gb;->uef(Ljava/lang/String;ZZ)Ljava/lang/String;

    move-result-object v1

    .line 11
    invoke-virtual {v2, v1}, Lcom/bytedance/sdk/component/xs/oa/yo;->yo(Ljava/lang/String;)V

    .line 12
    const-string v3, "User-Agent"

    const-string v4, ""

    invoke-virtual {v2, v3, v4}, Lcom/bytedance/sdk/component/xs/oa/yo;->oa(Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    invoke-direct {p0, v0}, Lcom/bytedance/sdk/openadsdk/core/dj/yo;->oa(Lorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object v0

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    .line 14
    invoke-virtual {v2, v0}, Lcom/bytedance/sdk/component/xs/oa/moa;->lw(Ljava/lang/String;)V

    const/4 v0, 0x6

    .line 15
    invoke-virtual {v2, v0}, Lcom/bytedance/sdk/component/xs/oa/yo;->uef(I)V

    .line 16
    const-string v0, "register_stats"

    invoke-virtual {v2, v0}, Lcom/bytedance/sdk/component/xs/oa/yo;->oa(Ljava/lang/String;)V

    .line 17
    new-instance v0, Lcom/bytedance/sdk/openadsdk/core/dj/yo$1;

    invoke-direct {v0, p0}, Lcom/bytedance/sdk/openadsdk/core/dj/yo$1;-><init>(Lcom/bytedance/sdk/openadsdk/core/dj/yo;)V

    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/sy/yo;->uef(Lcom/bytedance/sdk/openadsdk/sy/moa;)V

    .line 18
    new-instance v0, Lcom/bytedance/sdk/openadsdk/core/dj/yo$2;

    invoke-direct {v0, p0, v1}, Lcom/bytedance/sdk/openadsdk/core/dj/yo$2;-><init>(Lcom/bytedance/sdk/openadsdk/core/dj/yo;Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Lcom/bytedance/sdk/component/xs/oa/yo;->oa(Lcom/bytedance/sdk/component/xs/uef/uef;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    .line 19
    :catchall_0
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/core/dj/yo;->oa()V

    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/core/dj/moa;)V
    .locals 0

    .line 5
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/core/dj/yo;->oa:Lcom/bytedance/sdk/openadsdk/core/dj/moa;

    return-void
.end method
