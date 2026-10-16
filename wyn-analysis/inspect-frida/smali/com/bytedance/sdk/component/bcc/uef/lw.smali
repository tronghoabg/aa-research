.class final Lcom/bytedance/sdk/component/bcc/uef/lw;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static volatile uef:Lcom/bytedance/sdk/component/bcc/uef/lw;


# instance fields
.field private volatile oa:Landroid/os/HandlerThread;

.field private volatile yo:Landroid/os/Handler;


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/bytedance/sdk/component/bcc/uef/lw;->oa()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method private oa()V
    .locals 3

    .line 1
    :try_start_0
    invoke-direct {p0}, Lcom/bytedance/sdk/component/bcc/uef/lw;->yo()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Lcom/bytedance/sdk/component/bcc/uef/lw$1;

    .line 8
    .line 9
    const-string v1, "csj_dispatch_msg"

    .line 10
    .line 11
    invoke-direct {v0, p0, v1}, Lcom/bytedance/sdk/component/bcc/uef/lw$1;-><init>(Lcom/bytedance/sdk/component/bcc/uef/lw;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lcom/bytedance/sdk/component/bcc/uef/lw;->oa:Landroid/os/HandlerThread;

    .line 15
    .line 16
    iget-object v0, p0, Lcom/bytedance/sdk/component/bcc/uef/lw;->oa:Landroid/os/HandlerThread;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 19
    .line 20
    .line 21
    new-instance v0, Landroid/os/Handler;

    .line 22
    .line 23
    iget-object v1, p0, Lcom/bytedance/sdk/component/bcc/uef/lw;->oa:Landroid/os/HandlerThread;

    .line 24
    .line 25
    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Lcom/bytedance/sdk/component/bcc/uef/lw;->yo:Landroid/os/Handler;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    .line 34
    return-void

    .line 35
    :catchall_0
    move-exception v0

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    return-void

    .line 38
    :goto_0
    const-string v1, "TTDispatchThread"

    .line 39
    .line 40
    const-string v2, "new handlerThread error"

    .line 41
    .line 42
    invoke-static {v1, v2, v0}, Lcom/bytedance/sdk/component/utils/dhk;->uef(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public static uef()Lcom/bytedance/sdk/component/bcc/uef/lw;
    .locals 2

    .line 1
    sget-object v0, Lcom/bytedance/sdk/component/bcc/uef/lw;->uef:Lcom/bytedance/sdk/component/bcc/uef/lw;

    if-nez v0, :cond_1

    .line 2
    const-class v0, Lcom/bytedance/sdk/component/bcc/uef/lw;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Lcom/bytedance/sdk/component/bcc/uef/lw;->uef:Lcom/bytedance/sdk/component/bcc/uef/lw;

    if-nez v1, :cond_0

    .line 4
    new-instance v1, Lcom/bytedance/sdk/component/bcc/uef/lw;

    invoke-direct {v1}, Lcom/bytedance/sdk/component/bcc/uef/lw;-><init>()V

    sput-object v1, Lcom/bytedance/sdk/component/bcc/uef/lw;->uef:Lcom/bytedance/sdk/component/bcc/uef/lw;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    .line 5
    :cond_0
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    monitor-exit v0

    throw v1

    .line 6
    :cond_1
    :goto_2
    sget-object v0, Lcom/bytedance/sdk/component/bcc/uef/lw;->uef:Lcom/bytedance/sdk/component/bcc/uef/lw;

    return-object v0
.end method

.method private yo()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/bcc/uef/lw;->oa:Landroid/os/HandlerThread;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/bytedance/sdk/component/bcc/uef/lw;->yo:Landroid/os/Handler;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/bytedance/sdk/component/bcc/uef/lw;->oa:Landroid/os/HandlerThread;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Thread;->isAlive()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    return v0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    return v0
.end method


# virtual methods
.method public uef(Ljava/lang/Runnable;)V
    .locals 1

    .line 7
    invoke-direct {p0}, Lcom/bytedance/sdk/component/bcc/uef/lw;->yo()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 8
    iget-object v0, p0, Lcom/bytedance/sdk/component/bcc/uef/lw;->yo:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 9
    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    .line 10
    :cond_0
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return-void
.end method
