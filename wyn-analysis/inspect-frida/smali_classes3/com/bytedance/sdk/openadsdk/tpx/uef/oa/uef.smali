.class public Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static volatile bcc:Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;


# instance fields
.field private volatile ivm:Z

.field private final lw:Ljava/util/concurrent/CountDownLatch;

.field private moa:Ljava/lang/String;

.field private oa:Ljava/util/concurrent/atomic/AtomicLong;

.field private volatile uef:Ljava/lang/Boolean;

.field private xs:Ljava/lang/String;

.field private yo:I


# direct methods
.method private constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;->uef:Ljava/lang/Boolean;

    .line 6
    .line 7
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    .line 8
    .line 9
    const-wide/16 v1, 0x0

    .line 10
    .line 11
    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;->oa:Ljava/util/concurrent/atomic/AtomicLong;

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    iput v0, p0, Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;->yo:I

    .line 18
    .line 19
    const-string v1, ""

    .line 20
    .line 21
    iput-object v1, p0, Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;->moa:Ljava/lang/String;

    .line 22
    .line 23
    new-instance v2, Ljava/util/concurrent/CountDownLatch;

    .line 24
    .line 25
    const/4 v3, 0x1

    .line 26
    invoke-direct {v2, v3}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 27
    .line 28
    .line 29
    iput-object v2, p0, Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;->lw:Ljava/util/concurrent/CountDownLatch;

    .line 30
    .line 31
    iput-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;->ivm:Z

    .line 32
    .line 33
    iput-object v1, p0, Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;->xs:Ljava/lang/String;

    .line 34
    .line 35
    return-void
.end method

.method public static synthetic moa(Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;->xs:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method private static oa(Ljava/lang/Throwable;)Ljava/lang/String;
    .locals 6

    .line 13
    const-string v0, ""

    if-nez p0, :cond_0

    return-object v0

    .line 14
    :cond_0
    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 15
    invoke-virtual {p0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    invoke-virtual {p0}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object p0

    .line 17
    array-length v2, p0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, p0, v3

    .line 18
    const-string v5, "\n\tat "

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    invoke-virtual {v4}, Ljava/lang/StackTraceElement;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 20
    :cond_1
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    return-object v0
.end method

.method public static synthetic oa(Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;)Ljava/util/concurrent/CountDownLatch;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;->lw:Ljava/util/concurrent/CountDownLatch;

    return-object p0
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;->yo:I

    return p1
.end method

.method public static uef()Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;
    .locals 2

    .line 6
    sget-object v0, Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;->bcc:Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;

    if-nez v0, :cond_1

    .line 7
    const-class v0, Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;

    monitor-enter v0

    .line 8
    :try_start_0
    sget-object v1, Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;->bcc:Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;

    if-nez v1, :cond_0

    .line 9
    new-instance v1, Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;

    invoke-direct {v1}, Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;-><init>()V

    sput-object v1, Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;->bcc:Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    .line 10
    :cond_0
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    monitor-exit v0

    throw v1

    .line 11
    :cond_1
    :goto_2
    sget-object v0, Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;->bcc:Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;

    return-object v0
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;)Ljava/lang/String;
    .locals 0

    .line 2
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;->moa:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;->moa:Ljava/lang/String;

    return-object p1
.end method

.method public static synthetic uef(Ljava/lang/Throwable;)Ljava/lang/String;
    .locals 0

    .line 4
    invoke-static {p0}, Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;->oa(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;Z)Z
    .locals 0

    .line 5
    iput-boolean p1, p0, Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;->ivm:Z

    return p1
.end method

.method private yo()Z
    .locals 5

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;->uef:Ljava/lang/Boolean;

    if-nez v0, :cond_2

    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;->uef:Ljava/lang/Boolean;

    if-nez v0, :cond_1

    .line 5
    const-string v0, "gid_status"

    const/16 v1, 0x64

    invoke-static {v0, v1}, Lcom/bytedance/sdk/openadsdk/ab/yo;->oa(Ljava/lang/String;I)I

    move-result v0

    .line 6
    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v1

    const-wide/high16 v3, 0x4059000000000000L    # 100.0

    mul-double/2addr v1, v3

    const-wide/high16 v3, 0x3ff0000000000000L    # 1.0

    add-double/2addr v1, v3

    double-to-int v1, v1

    if-gt v1, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 7
    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;->uef:Ljava/lang/Boolean;

    .line 8
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;->uef:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v0, :cond_1

    .line 9
    :try_start_1
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/utils/ue;->uef()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;->xs:Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    .line 10
    :catchall_0
    :try_start_2
    const-string v0, "default"

    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;->xs:Ljava/lang/String;

    goto :goto_1

    :catchall_1
    move-exception v0

    goto :goto_2

    .line 11
    :cond_1
    :goto_1
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_3

    :goto_2
    monitor-exit p0

    throw v0

    .line 12
    :cond_2
    :goto_3
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;->uef:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public static synthetic yo(Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;)Z
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;->yo()Z

    move-result p0

    return p0
.end method


# virtual methods
.method public oa()Ljava/lang/String;
    .locals 5

    .line 2
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->moa()Lcom/bytedance/sdk/openadsdk/core/settings/dj;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bytedance/sdk/openadsdk/core/settings/dj;->vep()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 3
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/utils/km;->ivm()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;->moa:Ljava/lang/String;

    return-object v0

    .line 5
    :cond_0
    iget-boolean v0, p0, Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;->ivm:Z

    if-nez v0, :cond_1

    .line 6
    :try_start_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;->lw:Ljava/util/concurrent/CountDownLatch;

    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v3, 0x4

    invoke-virtual {v0, v3, v4, v2}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    :catch_0
    iput-boolean v1, p0, Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;->ivm:Z

    .line 8
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;->lw:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 9
    iput-boolean v1, p0, Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;->ivm:Z

    .line 10
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;->lw:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    throw v0

    .line 11
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;->moa:Ljava/lang/String;

    return-object v0

    .line 12
    :cond_2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;->moa:Ljava/lang/String;

    return-object v0
.end method

.method public uef(ILjava/lang/String;J)V
    .locals 7

    const/4 v1, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    move v2, p1

    move-object v3, p2

    move-wide v5, p3

    .line 20
    invoke-virtual/range {v0 .. v6}, Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;->uef(ZILjava/lang/String;Ljava/lang/Throwable;J)V

    return-void
.end method

.method public uef(ILjava/lang/Throwable;J)V
    .locals 7

    const/4 v1, 0x0

    .line 21
    const-string v3, ""

    move-object v0, p0

    move v2, p1

    move-object v4, p2

    move-wide v5, p3

    invoke-virtual/range {v0 .. v6}, Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;->uef(ZILjava/lang/String;Ljava/lang/Throwable;J)V

    return-void
.end method

.method public uef(Lorg/json/JSONObject;)V
    .locals 2

    if-nez p1, :cond_0

    goto :goto_0

    .line 18
    :cond_0
    :try_start_0
    const-string v0, "gaid"

    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;->oa()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :goto_0
    return-void
.end method

.method public uef(Z)V
    .locals 4

    .line 12
    iget v0, p0, Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;->yo:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;->moa:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 13
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    if-nez p1, :cond_0

    .line 14
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;->oa:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v2

    cmp-long p1, v2, v0

    if-gtz p1, :cond_1

    .line 15
    :cond_0
    iget-object p1, p0, Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;->oa:Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/32 v2, 0x493e0

    add-long/2addr v0, v2

    invoke-virtual {p1, v0, v1}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    .line 16
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    .line 17
    new-instance p1, Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef$1;

    const-string v2, "pag_gaid"

    invoke-direct {p1, p0, v2, v0, v1}, Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef$1;-><init>(Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;Ljava/lang/String;J)V

    invoke-static {p1}, Lcom/bytedance/sdk/openadsdk/utils/km;->uef(Lcom/bytedance/sdk/component/bcc/oa/yo;)V

    :cond_1
    return-void
.end method

.method public uef(ZILjava/lang/String;Ljava/lang/Throwable;J)V
    .locals 9

    .line 22
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;->uef:Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;->uef:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 23
    :cond_0
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->uef()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_2

    :cond_1
    return-void

    .line 24
    :cond_2
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/sy;->lw()Lcom/bytedance/sdk/openadsdk/ab/oa/yo;

    move-result-object v0

    new-instance v1, Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef$2;

    move-object v2, p0

    move v3, p1

    move v4, p2

    move-object v5, p3

    move-object v6, p4

    move-wide v7, p5

    invoke-direct/range {v1 .. v8}, Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef$2;-><init>(Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;ZILjava/lang/String;Ljava/lang/Throwable;J)V

    const/4 p1, 0x0

    invoke-interface {v0, v1, p1}, Lcom/bytedance/sdk/openadsdk/ab/oa/yo;->uef(Lcom/bytedance/sdk/openadsdk/ab/oa;Z)V

    return-void
.end method

.method public uef(ZJ)V
    .locals 7

    .line 19
    const-string v3, ""

    const/4 v4, 0x0

    const/4 v2, 0x0

    move-object v0, p0

    move v1, p1

    move-wide v5, p2

    invoke-virtual/range {v0 .. v6}, Lcom/bytedance/sdk/openadsdk/tpx/uef/oa/uef;->uef(ZILjava/lang/String;Ljava/lang/Throwable;J)V

    return-void
.end method
