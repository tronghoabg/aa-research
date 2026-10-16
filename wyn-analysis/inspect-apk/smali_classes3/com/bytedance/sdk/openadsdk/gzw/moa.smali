.class public Lcom/bytedance/sdk/openadsdk/gzw/moa;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final ivm:Lj$/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj$/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private lw:I

.field private moa:Lcom/bytedance/sdk/openadsdk/gzw/uef;

.field private oa:Lcom/bytedance/sdk/openadsdk/gzw/yo;

.field private final uef:Ljava/lang/String;

.field private xs:Ljava/lang/Runnable;

.field private yo:Lcom/bytedance/sdk/openadsdk/gzw/ivm;


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/openadsdk/gzw/ivm;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "StrategyCenter"

    .line 5
    .line 6
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/gzw/moa;->uef:Ljava/lang/String;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/gzw/moa;->oa:Lcom/bytedance/sdk/openadsdk/gzw/yo;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput v0, p0, Lcom/bytedance/sdk/openadsdk/gzw/moa;->lw:I

    .line 13
    .line 14
    new-instance v0, Lj$/util/concurrent/ConcurrentHashMap;

    .line 15
    .line 16
    invoke-direct {v0}, Lj$/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/gzw/moa;->ivm:Lj$/util/concurrent/ConcurrentHashMap;

    .line 20
    .line 21
    new-instance v0, Lcom/bytedance/sdk/openadsdk/gzw/moa$2;

    .line 22
    .line 23
    invoke-direct {v0, p0}, Lcom/bytedance/sdk/openadsdk/gzw/moa$2;-><init>(Lcom/bytedance/sdk/openadsdk/gzw/moa;)V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/gzw/moa;->xs:Ljava/lang/Runnable;

    .line 27
    .line 28
    new-instance v0, Lcom/bytedance/sdk/openadsdk/gzw/xs;

    .line 29
    .line 30
    invoke-direct {v0, p1}, Lcom/bytedance/sdk/openadsdk/gzw/xs;-><init>(Lcom/bytedance/sdk/openadsdk/gzw/ivm;)V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/gzw/moa;->yo:Lcom/bytedance/sdk/openadsdk/gzw/ivm;

    .line 34
    .line 35
    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/gzw/ivm;->yo()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-nez v0, :cond_0

    .line 44
    .line 45
    const-string v0, "pag"

    .line 46
    .line 47
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-nez v0, :cond_0

    .line 52
    .line 53
    const-string v0, "pag_"

    .line 54
    .line 55
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    :cond_0
    new-instance v0, Lcom/bytedance/sdk/openadsdk/gzw/yo;

    .line 60
    .line 61
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/gzw/moa;->yo:Lcom/bytedance/sdk/openadsdk/gzw/ivm;

    .line 62
    .line 63
    invoke-interface {v1}, Lcom/bytedance/sdk/openadsdk/gzw/ivm;->oa()Landroid/content/Context;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-direct {v0, v1, p1}, Lcom/bytedance/sdk/openadsdk/gzw/yo;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    iput-object v0, p0, Lcom/bytedance/sdk/openadsdk/gzw/moa;->oa:Lcom/bytedance/sdk/openadsdk/gzw/yo;

    .line 71
    .line 72
    return-void
.end method

.method public static synthetic ivm(Lcom/bytedance/sdk/openadsdk/gzw/moa;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/gzw/moa;->oa()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic lw(Lcom/bytedance/sdk/openadsdk/gzw/moa;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/bytedance/sdk/openadsdk/gzw/moa;->yo()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic moa(Lcom/bytedance/sdk/openadsdk/gzw/moa;)Lcom/bytedance/sdk/openadsdk/gzw/yo;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/gzw/moa;->oa:Lcom/bytedance/sdk/openadsdk/gzw/yo;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic oa(Lcom/bytedance/sdk/openadsdk/gzw/moa;)Lcom/bytedance/sdk/openadsdk/gzw/uef;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/gzw/moa;->moa:Lcom/bytedance/sdk/openadsdk/gzw/uef;

    return-object p0
.end method

.method private oa()V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/gzw/moa;->yo:Lcom/bytedance/sdk/openadsdk/gzw/ivm;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/gzw/ivm;->lw()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/gzw/moa;->yo:Lcom/bytedance/sdk/openadsdk/gzw/ivm;

    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/gzw/ivm;->ivm()Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/gzw/moa;->yo:Lcom/bytedance/sdk/openadsdk/gzw/ivm;

    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/gzw/ivm;->bcc()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/gzw/moa;->yo:Lcom/bytedance/sdk/openadsdk/gzw/ivm;

    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/gzw/ivm;->uef()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lcom/bytedance/sdk/openadsdk/gzw/moa$1;

    invoke-direct {v1, p0}, Lcom/bytedance/sdk/openadsdk/gzw/moa$1;-><init>(Lcom/bytedance/sdk/openadsdk/gzw/moa;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/gzw/moa;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/bytedance/sdk/openadsdk/gzw/moa;->lw:I

    return p0
.end method

.method public static synthetic uef(Lcom/bytedance/sdk/openadsdk/gzw/moa;I)I
    .locals 0

    .line 2
    iput p1, p0, Lcom/bytedance/sdk/openadsdk/gzw/moa;->lw:I

    return p1
.end method

.method public static synthetic yo(Lcom/bytedance/sdk/openadsdk/gzw/moa;)Lcom/bytedance/sdk/openadsdk/gzw/ivm;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bytedance/sdk/openadsdk/gzw/moa;->yo:Lcom/bytedance/sdk/openadsdk/gzw/ivm;

    return-object p0
.end method

.method private yo()V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/gzw/moa;->ivm:Lj$/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Lj$/util/concurrent/ConcurrentHashMap;->clear()V

    return-void
.end method


# virtual methods
.method public uef(Ljava/lang/String;I)I
    .locals 1

    .line 13
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/gzw/moa;->oa:Lcom/bytedance/sdk/openadsdk/gzw/yo;

    if-nez v0, :cond_0

    return p2

    .line 14
    :cond_0
    invoke-virtual {v0, p1, p2}, Lcom/bytedance/sdk/openadsdk/gzw/yo;->uef(Ljava/lang/String;I)I

    move-result p1

    return p1
.end method

.method public uef(Ljava/lang/String;Ljava/lang/Object;Lcom/bytedance/sdk/openadsdk/gzw/oa$uef;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "TT;",
            "Lcom/bytedance/sdk/openadsdk/gzw/oa$uef<",
            "TT;>;)TT;"
        }
    .end annotation

    .line 19
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/gzw/moa;->oa:Lcom/bytedance/sdk/openadsdk/gzw/yo;

    if-eqz v0, :cond_3

    if-nez p1, :cond_0

    goto :goto_0

    .line 20
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/gzw/moa;->ivm:Lj$/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Lj$/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_2

    if-eqz p2, :cond_1

    .line 21
    :try_start_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v1, :cond_2

    :cond_1
    return-object v0

    :catch_0
    :cond_2
    if-eqz p3, :cond_3

    .line 22
    :try_start_1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/gzw/moa;->oa:Lcom/bytedance/sdk/openadsdk/gzw/yo;

    invoke-virtual {v0, p1, p2, p3}, Lcom/bytedance/sdk/openadsdk/gzw/yo;->uef(Ljava/lang/String;Ljava/lang/Object;Lcom/bytedance/sdk/openadsdk/gzw/oa$uef;)Ljava/lang/Object;

    move-result-object p3

    if-eqz p3, :cond_3

    .line 23
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/gzw/moa;->ivm:Lj$/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1, p3}, Lj$/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    return-object p3

    :catch_1
    :cond_3
    :goto_0
    return-object p2
.end method

.method public uef(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 15
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/gzw/moa;->oa:Lcom/bytedance/sdk/openadsdk/gzw/yo;

    if-nez v0, :cond_0

    return-object p2

    .line 16
    :cond_0
    invoke-virtual {v0, p1, p2}, Lcom/bytedance/sdk/openadsdk/gzw/yo;->uef(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public uef()V
    .locals 8

    .line 4
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/gzw/moa;->yo:Lcom/bytedance/sdk/openadsdk/gzw/ivm;

    if-eqz v0, :cond_4

    .line 5
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/gzw/moa;->oa:Lcom/bytedance/sdk/openadsdk/gzw/yo;

    const-string v1, "req_interval"

    const v2, 0x36ee80

    invoke-virtual {v0, v1, v2}, Lcom/bytedance/sdk/openadsdk/gzw/yo;->uef(Ljava/lang/String;I)I

    move-result v0

    .line 6
    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/gzw/moa;->oa:Lcom/bytedance/sdk/openadsdk/gzw/yo;

    const-string v3, "local_last_update_time"

    const-wide/16 v4, 0x0

    invoke-virtual {v1, v3, v4, v5}, Lcom/bytedance/sdk/openadsdk/gzw/yo;->oa(Ljava/lang/String;J)J

    move-result-wide v6

    const v1, 0x927c0

    if-lt v0, v1, :cond_1

    const v1, 0x5265c00

    if-le v0, v1, :cond_0

    goto :goto_0

    :cond_0
    move v2, v0

    .line 7
    :cond_1
    :goto_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sub-long/2addr v0, v6

    .line 8
    const-string v3, "before  realInterval="

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v6, "StrategyCenter"

    invoke-static {v6, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    cmp-long v3, v0, v4

    if-ltz v3, :cond_2

    int-to-long v2, v2

    cmp-long v7, v0, v2

    if-gtz v7, :cond_2

    sub-long v4, v2, v0

    .line 9
    :cond_2
    const-string v0, "after  realInterval="

    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v6, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 10
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/gzw/moa;->yo:Lcom/bytedance/sdk/openadsdk/gzw/ivm;

    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/gzw/ivm;->moa()Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/gzw/moa;->xs:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 11
    iget v0, p0, Lcom/bytedance/sdk/openadsdk/gzw/moa;->lw:I

    const/16 v1, 0x18

    if-le v0, v1, :cond_3

    goto :goto_1

    .line 12
    :cond_3
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/gzw/moa;->yo:Lcom/bytedance/sdk/openadsdk/gzw/ivm;

    invoke-interface {v0}, Lcom/bytedance/sdk/openadsdk/gzw/ivm;->moa()Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/bytedance/sdk/openadsdk/gzw/moa;->xs:Ljava/lang/Runnable;

    invoke-virtual {v0, v1, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_4
    :goto_1
    return-void
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/gzw/uef;)V
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/gzw/moa;->moa:Lcom/bytedance/sdk/openadsdk/gzw/uef;

    return-void
.end method

.method public uef(Ljava/lang/String;Z)Z
    .locals 1

    .line 17
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/gzw/moa;->oa:Lcom/bytedance/sdk/openadsdk/gzw/yo;

    if-nez v0, :cond_0

    return p2

    .line 18
    :cond_0
    invoke-virtual {v0, p1, p2}, Lcom/bytedance/sdk/openadsdk/gzw/yo;->uef(Ljava/lang/String;Z)Z

    move-result p1

    return p1
.end method
