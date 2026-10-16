.class public Lcom/bytedance/sdk/openadsdk/utils/km;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static volatile bcc:Lcom/bytedance/sdk/component/bcc/oa/xs;

.field private static volatile cz:Lcom/bytedance/sdk/component/bcc/oa/xs;

.field private static volatile dj:Lcom/bytedance/sdk/component/bcc/oa/xs;

.field private static volatile ivm:Lcom/bytedance/sdk/component/bcc/oa/xs;

.field private static volatile lw:Lcom/bytedance/sdk/component/bcc/oa/xs;

.field private static volatile moa:Lcom/bytedance/sdk/component/bcc/oa/xs;

.field private static volatile oa:Ljava/util/concurrent/ThreadPoolExecutor;

.field private static volatile uef:Ljava/util/concurrent/ScheduledExecutorService;

.field private static volatile wrv:Lcom/bytedance/sdk/component/bcc/oa/xs;

.field private static volatile xs:Lcom/bytedance/sdk/component/bcc/oa/xs;

.field private static volatile yo:Z

.field private static volatile zjm:Lcom/bytedance/sdk/component/bcc/oa/xs;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/bytedance/sdk/openadsdk/utils/km$1;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/bytedance/sdk/openadsdk/utils/km$1;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lcom/bytedance/sdk/component/bcc/oa/moa;->uef(Lcom/bytedance/sdk/component/bcc/oa/uef;)V

    .line 7
    .line 8
    .line 9
    new-instance v0, Lcom/bytedance/sdk/openadsdk/utils/km$2;

    .line 10
    .line 11
    invoke-direct {v0}, Lcom/bytedance/sdk/openadsdk/utils/km$2;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, Lcom/bytedance/sdk/component/bcc/uef;->uef(Lcom/bytedance/sdk/component/uef;)V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    sput-object v0, Lcom/bytedance/sdk/openadsdk/utils/km;->oa:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    sput-boolean v0, Lcom/bytedance/sdk/openadsdk/utils/km;->yo:Z

    .line 22
    .line 23
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static ab()Lcom/bytedance/sdk/component/bcc/oa/xs;
    .locals 3

    .line 1
    sget-object v0, Lcom/bytedance/sdk/openadsdk/utils/km;->dj:Lcom/bytedance/sdk/component/bcc/oa/xs;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/utils/km;->uef(Lcom/bytedance/sdk/component/bcc/oa/xs;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    const-class v0, Lcom/bytedance/sdk/openadsdk/utils/km;

    .line 10
    .line 11
    monitor-enter v0

    .line 12
    :try_start_0
    sget-object v1, Lcom/bytedance/sdk/openadsdk/utils/km;->dj:Lcom/bytedance/sdk/component/bcc/oa/xs;

    .line 13
    .line 14
    invoke-static {v1}, Lcom/bytedance/sdk/openadsdk/utils/km;->uef(Lcom/bytedance/sdk/component/bcc/oa/xs;)Z

    .line 15
    .line 16
    .line 17
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    :try_start_1
    const-string v1, "imgdisk"

    .line 21
    .line 22
    sget-object v2, Lcom/bytedance/sdk/openadsdk/utils/km;->dj:Lcom/bytedance/sdk/component/bcc/oa/xs;

    .line 23
    .line 24
    invoke-static {v1, v2}, Lcom/bytedance/sdk/openadsdk/utils/km;->uef(Ljava/lang/String;Lcom/bytedance/sdk/component/bcc/oa/xs;)Lcom/bytedance/sdk/component/bcc/oa/xs;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    sput-object v1, Lcom/bytedance/sdk/openadsdk/utils/km;->dj:Lcom/bytedance/sdk/component/bcc/oa/xs;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :catchall_0
    move-exception v1

    .line 32
    :try_start_2
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    :goto_0
    sget-object v1, Lcom/bytedance/sdk/openadsdk/utils/km;->dj:Lcom/bytedance/sdk/component/bcc/oa/xs;

    .line 36
    .line 37
    if-nez v1, :cond_0

    .line 38
    .line 39
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/utils/km;->bs()Lcom/bytedance/sdk/component/bcc/oa/xs;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    sput-object v1, Lcom/bytedance/sdk/openadsdk/utils/km;->dj:Lcom/bytedance/sdk/component/bcc/oa/xs;

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :catchall_1
    move-exception v1

    .line 47
    goto :goto_2

    .line 48
    :cond_0
    :goto_1
    sget-object v1, Lcom/bytedance/sdk/openadsdk/utils/km;->dj:Lcom/bytedance/sdk/component/bcc/oa/xs;

    .line 49
    .line 50
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 51
    return-object v1

    .line 52
    :goto_2
    monitor-exit v0

    .line 53
    throw v1

    .line 54
    :cond_1
    return-object v0
.end method

.method public static bcc()Ljava/util/concurrent/ExecutorService;
    .locals 1

    .line 1
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/utils/km;->wk()Lcom/bytedance/sdk/component/bcc/oa/xs;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method private static bs()Lcom/bytedance/sdk/component/bcc/oa/xs;
    .locals 2

    .line 1
    sget-object v0, Lcom/bytedance/sdk/openadsdk/utils/km;->wrv:Lcom/bytedance/sdk/component/bcc/oa/xs;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const-class v0, Lcom/bytedance/sdk/openadsdk/utils/km;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    sget-object v1, Lcom/bytedance/sdk/openadsdk/utils/km;->wrv:Lcom/bytedance/sdk/component/bcc/oa/xs;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    :try_start_1
    const-string v1, "default"

    .line 13
    .line 14
    invoke-static {v1}, Lcom/bytedance/sdk/openadsdk/utils/km;->oa(Ljava/lang/String;)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v1}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->uef()Lcom/bytedance/sdk/component/bcc/oa/xs;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    sput-object v1, Lcom/bytedance/sdk/openadsdk/utils/km;->wrv:Lcom/bytedance/sdk/component/bcc/oa/xs;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception v1

    .line 26
    :try_start_2
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :catchall_1
    move-exception v1

    .line 31
    goto :goto_1

    .line 32
    :cond_0
    :goto_0
    sget-object v1, Lcom/bytedance/sdk/openadsdk/utils/km;->wrv:Lcom/bytedance/sdk/component/bcc/oa/xs;

    .line 33
    .line 34
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 35
    return-object v1

    .line 36
    :goto_1
    monitor-exit v0

    .line 37
    throw v1

    .line 38
    :cond_1
    return-object v0
.end method

.method private static cq()Lcom/bytedance/sdk/component/bcc/oa/xs;
    .locals 3

    .line 1
    sget-object v0, Lcom/bytedance/sdk/openadsdk/utils/km;->lw:Lcom/bytedance/sdk/component/bcc/oa/xs;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/utils/km;->uef(Lcom/bytedance/sdk/component/bcc/oa/xs;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    const-class v0, Lcom/bytedance/sdk/openadsdk/utils/km;

    .line 10
    .line 11
    monitor-enter v0

    .line 12
    :try_start_0
    sget-object v1, Lcom/bytedance/sdk/openadsdk/utils/km;->lw:Lcom/bytedance/sdk/component/bcc/oa/xs;

    .line 13
    .line 14
    invoke-static {v1}, Lcom/bytedance/sdk/openadsdk/utils/km;->uef(Lcom/bytedance/sdk/component/bcc/oa/xs;)Z

    .line 15
    .line 16
    .line 17
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    :try_start_1
    const-string v1, "log"

    .line 21
    .line 22
    sget-object v2, Lcom/bytedance/sdk/openadsdk/utils/km;->lw:Lcom/bytedance/sdk/component/bcc/oa/xs;

    .line 23
    .line 24
    invoke-static {v1, v2}, Lcom/bytedance/sdk/openadsdk/utils/km;->uef(Ljava/lang/String;Lcom/bytedance/sdk/component/bcc/oa/xs;)Lcom/bytedance/sdk/component/bcc/oa/xs;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    sput-object v1, Lcom/bytedance/sdk/openadsdk/utils/km;->lw:Lcom/bytedance/sdk/component/bcc/oa/xs;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :catchall_0
    move-exception v1

    .line 32
    :try_start_2
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    :goto_0
    sget-object v1, Lcom/bytedance/sdk/openadsdk/utils/km;->lw:Lcom/bytedance/sdk/component/bcc/oa/xs;

    .line 36
    .line 37
    if-nez v1, :cond_0

    .line 38
    .line 39
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/utils/km;->bs()Lcom/bytedance/sdk/component/bcc/oa/xs;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    sput-object v1, Lcom/bytedance/sdk/openadsdk/utils/km;->lw:Lcom/bytedance/sdk/component/bcc/oa/xs;

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :catchall_1
    move-exception v1

    .line 47
    goto :goto_2

    .line 48
    :cond_0
    :goto_1
    sget-object v1, Lcom/bytedance/sdk/openadsdk/utils/km;->lw:Lcom/bytedance/sdk/component/bcc/oa/xs;

    .line 49
    .line 50
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 51
    return-object v1

    .line 52
    :goto_2
    monitor-exit v0

    .line 53
    throw v1

    .line 54
    :cond_1
    return-object v0
.end method

.method public static cz()Lcom/bytedance/sdk/component/bcc/oa/xs;
    .locals 3

    .line 1
    sget-object v0, Lcom/bytedance/sdk/openadsdk/utils/km;->ivm:Lcom/bytedance/sdk/component/bcc/oa/xs;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/utils/km;->uef(Lcom/bytedance/sdk/component/bcc/oa/xs;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    const-class v0, Lcom/bytedance/sdk/openadsdk/utils/km;

    .line 10
    .line 11
    monitor-enter v0

    .line 12
    :try_start_0
    sget-object v1, Lcom/bytedance/sdk/openadsdk/utils/km;->ivm:Lcom/bytedance/sdk/component/bcc/oa/xs;

    .line 13
    .line 14
    invoke-static {v1}, Lcom/bytedance/sdk/openadsdk/utils/km;->uef(Lcom/bytedance/sdk/component/bcc/oa/xs;)Z

    .line 15
    .line 16
    .line 17
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    :try_start_1
    const-string v1, "cache"

    .line 21
    .line 22
    sget-object v2, Lcom/bytedance/sdk/openadsdk/utils/km;->ivm:Lcom/bytedance/sdk/component/bcc/oa/xs;

    .line 23
    .line 24
    invoke-static {v1, v2}, Lcom/bytedance/sdk/openadsdk/utils/km;->uef(Ljava/lang/String;Lcom/bytedance/sdk/component/bcc/oa/xs;)Lcom/bytedance/sdk/component/bcc/oa/xs;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    sput-object v1, Lcom/bytedance/sdk/openadsdk/utils/km;->ivm:Lcom/bytedance/sdk/component/bcc/oa/xs;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :catchall_0
    move-exception v1

    .line 32
    :try_start_2
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    :goto_0
    sget-object v1, Lcom/bytedance/sdk/openadsdk/utils/km;->ivm:Lcom/bytedance/sdk/component/bcc/oa/xs;

    .line 36
    .line 37
    if-nez v1, :cond_0

    .line 38
    .line 39
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/utils/km;->bs()Lcom/bytedance/sdk/component/bcc/oa/xs;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    sput-object v1, Lcom/bytedance/sdk/openadsdk/utils/km;->ivm:Lcom/bytedance/sdk/component/bcc/oa/xs;

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :catchall_1
    move-exception v1

    .line 47
    goto :goto_2

    .line 48
    :cond_0
    :goto_1
    sget-object v1, Lcom/bytedance/sdk/openadsdk/utils/km;->ivm:Lcom/bytedance/sdk/component/bcc/oa/xs;

    .line 49
    .line 50
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 51
    return-object v1

    .line 52
    :goto_2
    monitor-exit v0

    .line 53
    throw v1

    .line 54
    :cond_1
    return-object v0
.end method

.method public static dj()Lcom/bytedance/sdk/component/bcc/oa/xs;
    .locals 3

    .line 1
    sget-object v0, Lcom/bytedance/sdk/openadsdk/utils/km;->zjm:Lcom/bytedance/sdk/component/bcc/oa/xs;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/utils/km;->uef(Lcom/bytedance/sdk/component/bcc/oa/xs;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    const-class v0, Lcom/bytedance/sdk/openadsdk/utils/km;

    .line 10
    .line 11
    monitor-enter v0

    .line 12
    :try_start_0
    sget-object v1, Lcom/bytedance/sdk/openadsdk/utils/km;->zjm:Lcom/bytedance/sdk/component/bcc/oa/xs;

    .line 13
    .line 14
    invoke-static {v1}, Lcom/bytedance/sdk/openadsdk/utils/km;->uef(Lcom/bytedance/sdk/component/bcc/oa/xs;)Z

    .line 15
    .line 16
    .line 17
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    :try_start_1
    const-string v1, "net"

    .line 21
    .line 22
    sget-object v2, Lcom/bytedance/sdk/openadsdk/utils/km;->zjm:Lcom/bytedance/sdk/component/bcc/oa/xs;

    .line 23
    .line 24
    invoke-static {v1, v2}, Lcom/bytedance/sdk/openadsdk/utils/km;->uef(Ljava/lang/String;Lcom/bytedance/sdk/component/bcc/oa/xs;)Lcom/bytedance/sdk/component/bcc/oa/xs;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    sput-object v1, Lcom/bytedance/sdk/openadsdk/utils/km;->zjm:Lcom/bytedance/sdk/component/bcc/oa/xs;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :catchall_0
    move-exception v1

    .line 32
    :try_start_2
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    :goto_0
    sget-object v1, Lcom/bytedance/sdk/openadsdk/utils/km;->zjm:Lcom/bytedance/sdk/component/bcc/oa/xs;

    .line 36
    .line 37
    if-nez v1, :cond_0

    .line 38
    .line 39
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/utils/km;->bs()Lcom/bytedance/sdk/component/bcc/oa/xs;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    sput-object v1, Lcom/bytedance/sdk/openadsdk/utils/km;->zjm:Lcom/bytedance/sdk/component/bcc/oa/xs;

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :catchall_1
    move-exception v1

    .line 47
    goto :goto_2

    .line 48
    :cond_0
    :goto_1
    sget-object v1, Lcom/bytedance/sdk/openadsdk/utils/km;->zjm:Lcom/bytedance/sdk/component/bcc/oa/xs;

    .line 49
    .line 50
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 51
    return-object v1

    .line 52
    :goto_2
    monitor-exit v0

    .line 53
    throw v1

    .line 54
    :cond_1
    return-object v0
.end method

.method private static dz()Lcom/bytedance/sdk/component/bcc/oa/xs;
    .locals 3

    .line 1
    sget-object v0, Lcom/bytedance/sdk/openadsdk/utils/km;->bcc:Lcom/bytedance/sdk/component/bcc/oa/xs;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/utils/km;->uef(Lcom/bytedance/sdk/component/bcc/oa/xs;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    const-class v0, Lcom/bytedance/sdk/openadsdk/utils/km;

    .line 10
    .line 11
    monitor-enter v0

    .line 12
    :try_start_0
    sget-object v1, Lcom/bytedance/sdk/openadsdk/utils/km;->bcc:Lcom/bytedance/sdk/component/bcc/oa/xs;

    .line 13
    .line 14
    invoke-static {v1}, Lcom/bytedance/sdk/openadsdk/utils/km;->uef(Lcom/bytedance/sdk/component/bcc/oa/xs;)Z

    .line 15
    .line 16
    .line 17
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    :try_start_1
    const-string v1, "image"

    .line 21
    .line 22
    sget-object v2, Lcom/bytedance/sdk/openadsdk/utils/km;->bcc:Lcom/bytedance/sdk/component/bcc/oa/xs;

    .line 23
    .line 24
    invoke-static {v1, v2}, Lcom/bytedance/sdk/openadsdk/utils/km;->uef(Ljava/lang/String;Lcom/bytedance/sdk/component/bcc/oa/xs;)Lcom/bytedance/sdk/component/bcc/oa/xs;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    sput-object v1, Lcom/bytedance/sdk/openadsdk/utils/km;->bcc:Lcom/bytedance/sdk/component/bcc/oa/xs;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :catchall_0
    move-exception v1

    .line 32
    :try_start_2
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    :goto_0
    sget-object v1, Lcom/bytedance/sdk/openadsdk/utils/km;->bcc:Lcom/bytedance/sdk/component/bcc/oa/xs;

    .line 36
    .line 37
    if-nez v1, :cond_0

    .line 38
    .line 39
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/utils/km;->bs()Lcom/bytedance/sdk/component/bcc/oa/xs;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    sput-object v1, Lcom/bytedance/sdk/openadsdk/utils/km;->bcc:Lcom/bytedance/sdk/component/bcc/oa/xs;

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :catchall_1
    move-exception v1

    .line 47
    goto :goto_2

    .line 48
    :cond_0
    :goto_1
    sget-object v1, Lcom/bytedance/sdk/openadsdk/utils/km;->bcc:Lcom/bytedance/sdk/component/bcc/oa/xs;

    .line 49
    .line 50
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 51
    return-object v1

    .line 52
    :goto_2
    monitor-exit v0

    .line 53
    throw v1

    .line 54
    :cond_1
    return-object v0
.end method

.method public static ivm()Z
    .locals 2

    .line 1
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    return v0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return v0
.end method

.method public static lw()Ljava/util/concurrent/ExecutorService;
    .locals 1

    .line 1
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/utils/km;->cz()Lcom/bytedance/sdk/component/bcc/oa/xs;

    move-result-object v0

    return-object v0
.end method

.method public static lw(Lcom/bytedance/sdk/component/bcc/oa/yo;)V
    .locals 1

    .line 2
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/utils/km;->dj()Lcom/bytedance/sdk/component/bcc/oa/xs;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/bytedance/sdk/component/bcc/oa/xs;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static moa()Ljava/util/concurrent/ExecutorService;
    .locals 1

    .line 1
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/utils/km;->cq()Lcom/bytedance/sdk/component/bcc/oa/xs;

    move-result-object v0

    return-object v0
.end method

.method public static moa(Lcom/bytedance/sdk/component/bcc/oa/yo;)V
    .locals 1

    .line 2
    sget-boolean v0, Lcom/bytedance/sdk/openadsdk/utils/lz;->uef:Z

    if-eqz v0, :cond_0

    return-void

    .line 3
    :cond_0
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/utils/km;->wrv()Ljava/util/concurrent/ThreadPoolExecutor;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method private static oa(Ljava/lang/String;)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;
    .locals 15

    const/16 v0, 0x8

    const/4 v1, 0x6

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, -0x1

    const/4 v5, 0x2

    const/4 v6, 0x4

    const/4 v7, 0x3

    .line 8
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    if-eqz v8, :cond_0

    .line 9
    const-string p0, "unknown"

    .line 10
    :cond_0
    new-instance v8, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    invoke-direct {v8}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;-><init>()V

    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-wide/16 v9, 0x2710

    const-wide/16 v11, 0x4e20

    const/16 v13, 0xa

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v14

    sparse-switch v14, :sswitch_data_0

    :goto_0
    move v14, v4

    goto/16 :goto_1

    :sswitch_0
    const-string v14, "imgdisk"

    invoke-virtual {p0, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_1

    goto :goto_0

    :cond_1
    const/16 v14, 0x9

    goto/16 :goto_1

    :sswitch_1
    const-string v14, "monitor"

    invoke-virtual {p0, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_2

    goto :goto_0

    :cond_2
    move v14, v0

    goto/16 :goto_1

    :sswitch_2
    const-string v14, "image"

    invoke-virtual {p0, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_3

    goto :goto_0

    :cond_3
    const/4 v14, 0x7

    goto :goto_1

    :sswitch_3
    const-string v14, "cache"

    invoke-virtual {p0, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_4

    goto :goto_0

    :cond_4
    move v14, v1

    goto :goto_1

    :sswitch_4
    const-string v14, "aidl"

    invoke-virtual {p0, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_5

    goto :goto_0

    :cond_5
    const/4 v14, 0x5

    goto :goto_1

    :sswitch_5
    const-string v14, "net"

    invoke-virtual {p0, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_6

    goto :goto_0

    :cond_6
    move v14, v6

    goto :goto_1

    :sswitch_6
    const-string v14, "log"

    invoke-virtual {p0, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_7

    goto :goto_0

    :cond_7
    move v14, v7

    goto :goto_1

    :sswitch_7
    const-string v14, "io"

    invoke-virtual {p0, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_8

    goto :goto_0

    :cond_8
    move v14, v5

    goto :goto_1

    :sswitch_8
    const-string v14, "ad"

    invoke-virtual {p0, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_9

    goto :goto_0

    :cond_9
    move v14, v3

    goto :goto_1

    :sswitch_9
    const-string v14, "express"

    invoke-virtual {p0, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_a

    goto :goto_0

    :cond_a
    move v14, v2

    :goto_1
    packed-switch v14, :pswitch_data_0

    .line 12
    invoke-virtual {v8, p0}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->uef(Ljava/lang/String;)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    move-result-object p0

    .line 13
    invoke-virtual {p0, v0}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->uef(I)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    move-result-object p0

    const/16 v0, 0x10

    .line 14
    invoke-virtual {p0, v0}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->oa(I)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    move-result-object p0

    .line 15
    invoke-virtual {p0, v5}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->yo(I)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    move-result-object p0

    .line 16
    invoke-virtual {p0, v11, v12}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->uef(J)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    move-result-object p0

    .line 17
    invoke-virtual {p0, v3}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->uef(Z)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    move-result-object p0

    .line 18
    invoke-virtual {p0, v4}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->lw(I)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    move-result-object p0

    .line 19
    invoke-virtual {p0, v13}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->moa(I)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    move-result-object p0

    .line 20
    invoke-virtual {p0, v2}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->oa(Z)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    move-result-object p0

    return-object p0

    .line 21
    :pswitch_0
    invoke-virtual {v8, p0}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->uef(Ljava/lang/String;)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    move-result-object p0

    .line 22
    invoke-virtual {p0, v3}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->uef(I)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    move-result-object p0

    .line 23
    invoke-virtual {p0, v5}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->oa(I)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    move-result-object p0

    .line 24
    invoke-virtual {p0, v7}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->yo(I)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    move-result-object p0

    .line 25
    invoke-virtual {p0, v9, v10}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->uef(J)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    move-result-object p0

    .line 26
    invoke-virtual {p0, v3}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->uef(Z)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    move-result-object p0

    .line 27
    invoke-virtual {p0, v4}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->lw(I)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    move-result-object p0

    .line 28
    invoke-virtual {p0, v13}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->moa(I)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    move-result-object p0

    .line 29
    invoke-virtual {p0, v2}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->oa(Z)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    move-result-object p0

    return-object p0

    .line 30
    :pswitch_1
    invoke-virtual {v8, p0}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->uef(Ljava/lang/String;)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    move-result-object p0

    .line 31
    invoke-virtual {p0, v5}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->uef(I)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    move-result-object p0

    .line 32
    invoke-virtual {p0, v5}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->oa(I)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    move-result-object p0

    .line 33
    invoke-virtual {p0, v2}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->yo(I)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    move-result-object p0

    .line 34
    invoke-virtual {p0, v9, v10}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->uef(J)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    move-result-object p0

    .line 35
    invoke-virtual {p0, v3}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->uef(Z)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    move-result-object p0

    .line 36
    invoke-virtual {p0, v4}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->lw(I)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    move-result-object p0

    .line 37
    invoke-virtual {p0, v13}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->moa(I)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    move-result-object p0

    .line 38
    invoke-virtual {p0, v2}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->oa(Z)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    move-result-object p0

    return-object p0

    .line 39
    :pswitch_2
    invoke-virtual {v8, p0}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->uef(Ljava/lang/String;)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    move-result-object p0

    .line 40
    invoke-virtual {p0, v7}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->uef(I)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    move-result-object p0

    .line 41
    invoke-virtual {p0, v7}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->oa(I)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    move-result-object p0

    .line 42
    invoke-virtual {p0, v2}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->yo(I)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    move-result-object p0

    .line 43
    invoke-virtual {p0, v11, v12}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->uef(J)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    move-result-object p0

    .line 44
    invoke-virtual {p0, v3}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->uef(Z)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    move-result-object p0

    .line 45
    invoke-virtual {p0, v4}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->lw(I)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    move-result-object p0

    .line 46
    invoke-virtual {p0, v13}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->moa(I)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    move-result-object p0

    .line 47
    invoke-virtual {p0, v2}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->oa(Z)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    move-result-object p0

    return-object p0

    .line 48
    :pswitch_3
    invoke-virtual {v8, p0}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->uef(Ljava/lang/String;)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    move-result-object p0

    .line 49
    invoke-virtual {p0, v2}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->uef(I)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    move-result-object p0

    .line 50
    invoke-virtual {p0, v2}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->oa(I)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    move-result-object p0

    .line 51
    invoke-virtual {p0, v2}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->yo(I)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    move-result-object p0

    const-wide/16 v0, 0x1388

    .line 52
    invoke-virtual {p0, v0, v1}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->uef(J)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    move-result-object p0

    .line 53
    invoke-virtual {p0, v3}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->uef(Z)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    move-result-object p0

    .line 54
    invoke-virtual {p0, v4}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->lw(I)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    move-result-object p0

    const/16 v0, 0x14

    .line 55
    invoke-virtual {p0, v0}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->moa(I)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    move-result-object p0

    .line 56
    invoke-virtual {p0, v2}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->oa(Z)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    move-result-object p0

    return-object p0

    .line 57
    :pswitch_4
    invoke-virtual {v8, p0}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->uef(Ljava/lang/String;)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    move-result-object p0

    .line 58
    invoke-virtual {p0, v5}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->uef(I)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    move-result-object p0

    .line 59
    invoke-virtual {p0, v6}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->oa(I)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    move-result-object p0

    .line 60
    invoke-virtual {p0, v2}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->yo(I)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    move-result-object p0

    .line 61
    invoke-virtual {p0, v9, v10}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->uef(J)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    move-result-object p0

    .line 62
    invoke-virtual {p0, v3}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->uef(Z)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    move-result-object p0

    .line 63
    invoke-virtual {p0, v4}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->lw(I)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    move-result-object p0

    .line 64
    invoke-virtual {p0, v13}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->moa(I)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    move-result-object p0

    .line 65
    invoke-virtual {p0, v2}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->oa(Z)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    move-result-object p0

    return-object p0

    .line 66
    :pswitch_5
    invoke-virtual {v8, p0}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->uef(Ljava/lang/String;)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    move-result-object p0

    .line 67
    invoke-virtual {p0, v13}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->uef(I)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    move-result-object p0

    .line 68
    invoke-virtual {p0, v13}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->oa(I)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    move-result-object p0

    .line 69
    invoke-virtual {p0, v2}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->yo(I)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    move-result-object p0

    .line 70
    invoke-virtual {p0, v9, v10}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->uef(J)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    move-result-object p0

    .line 71
    invoke-virtual {p0, v3}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->uef(Z)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    move-result-object p0

    .line 72
    invoke-virtual {p0, v4}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->lw(I)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    move-result-object p0

    .line 73
    invoke-virtual {p0, v13}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->moa(I)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    move-result-object p0

    .line 74
    invoke-virtual {p0, v2}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->oa(Z)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    move-result-object p0

    return-object p0

    .line 75
    :pswitch_6
    invoke-virtual {v8, p0}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->uef(Ljava/lang/String;)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    move-result-object p0

    .line 76
    invoke-virtual {p0, v6}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->uef(I)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    move-result-object p0

    .line 77
    invoke-virtual {p0, v1}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->oa(I)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    move-result-object p0

    .line 78
    invoke-virtual {p0, v5}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->yo(I)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    move-result-object p0

    .line 79
    invoke-virtual {p0, v11, v12}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->uef(J)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    move-result-object p0

    .line 80
    invoke-virtual {p0, v3}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->uef(Z)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    move-result-object p0

    .line 81
    invoke-virtual {p0, v4}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->lw(I)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    move-result-object p0

    .line 82
    invoke-virtual {p0, v13}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->moa(I)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    move-result-object p0

    .line 83
    invoke-virtual {p0, v2}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->oa(Z)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    move-result-object p0

    return-object p0

    .line 84
    :pswitch_7
    invoke-virtual {v8, p0}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->uef(Ljava/lang/String;)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    move-result-object p0

    .line 85
    invoke-virtual {p0, v6}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->uef(I)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    move-result-object p0

    .line 86
    invoke-virtual {p0, v13}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->oa(I)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    move-result-object p0

    .line 87
    invoke-virtual {p0, v2}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->yo(I)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    move-result-object p0

    .line 88
    invoke-virtual {p0, v11, v12}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->uef(J)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    move-result-object p0

    .line 89
    invoke-virtual {p0, v3}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->uef(Z)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    move-result-object p0

    .line 90
    invoke-virtual {p0, v4}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->lw(I)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    move-result-object p0

    .line 91
    invoke-virtual {p0, v13}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->moa(I)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    move-result-object p0

    .line 92
    invoke-virtual {p0, v2}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->oa(Z)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    move-result-object p0

    return-object p0

    .line 93
    :pswitch_8
    invoke-virtual {v8, p0}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->uef(Ljava/lang/String;)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    move-result-object p0

    .line 94
    invoke-virtual {p0, v6}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->uef(I)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    move-result-object p0

    .line 95
    invoke-virtual {p0, v6}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->oa(I)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    move-result-object p0

    .line 96
    invoke-virtual {p0, v2}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->yo(I)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    move-result-object p0

    .line 97
    invoke-virtual {p0, v11, v12}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->uef(J)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    move-result-object p0

    .line 98
    invoke-virtual {p0, v3}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->uef(Z)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    move-result-object p0

    .line 99
    invoke-virtual {p0, v4}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->lw(I)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    move-result-object p0

    .line 100
    invoke-virtual {p0, v13}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->moa(I)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    move-result-object p0

    .line 101
    invoke-virtual {p0, v2}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->oa(Z)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    move-result-object p0

    return-object p0

    .line 102
    :pswitch_9
    invoke-virtual {v8, p0}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->uef(Ljava/lang/String;)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    move-result-object p0

    .line 103
    invoke-virtual {p0, v5}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->uef(I)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    move-result-object p0

    .line 104
    invoke-virtual {p0, v6}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->oa(I)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    move-result-object p0

    .line 105
    invoke-virtual {p0, v2}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->yo(I)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    move-result-object p0

    .line 106
    invoke-virtual {p0, v9, v10}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->uef(J)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    move-result-object p0

    .line 107
    invoke-virtual {p0, v3}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->uef(Z)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    move-result-object p0

    .line 108
    invoke-virtual {p0, v4}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->lw(I)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    move-result-object p0

    .line 109
    invoke-virtual {p0, v13}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->moa(I)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    move-result-object p0

    .line 110
    invoke-virtual {p0, v2}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->oa(Z)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    move-result-object p0

    return-object p0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x4e057090 -> :sswitch_9
        0xc23 -> :sswitch_8
        0xd26 -> :sswitch_7
        0x1a344 -> :sswitch_6
        0x1a99d -> :sswitch_5
        0x2daeb0 -> :sswitch_4
        0x5a0af82 -> :sswitch_3
        0x5faa95b -> :sswitch_2
        0x49b0bd5a -> :sswitch_1
        0x72490be0 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static oa()Ljava/util/concurrent/ExecutorService;
    .locals 1

    .line 1
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/utils/km;->dz()Lcom/bytedance/sdk/component/bcc/oa/xs;

    move-result-object v0

    return-object v0
.end method

.method public static oa(Lcom/bytedance/sdk/component/bcc/oa/yo;)V
    .locals 1

    if-nez p0, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    sget-boolean v0, Lcom/bytedance/sdk/openadsdk/utils/lz;->uef:Z

    if-eqz v0, :cond_1

    :goto_0
    return-void

    .line 4
    :cond_1
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/utils/km;->cq()Lcom/bytedance/sdk/component/bcc/oa/xs;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/bytedance/sdk/component/bcc/oa/xs;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static oa(Lcom/bytedance/sdk/component/bcc/oa/yo;I)V
    .locals 1

    if-nez p0, :cond_0

    goto :goto_0

    .line 5
    :cond_0
    sget-boolean v0, Lcom/bytedance/sdk/openadsdk/utils/lz;->uef:Z

    if-eqz v0, :cond_1

    :goto_0
    return-void

    .line 6
    :cond_1
    invoke-virtual {p0, p1}, Lcom/bytedance/sdk/component/bcc/oa/yo;->setPriority(I)V

    .line 7
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/utils/km;->cq()Lcom/bytedance/sdk/component/bcc/oa/xs;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/bytedance/sdk/component/bcc/oa/xs;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static oa(Ljava/lang/Runnable;)V
    .locals 1

    if-nez p0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/wk;->yo()Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    return-void
.end method

.method private static uef(Ljava/lang/String;)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;
    .locals 10

    .line 20
    const-string v0, "logTaskCount"

    const-string v1, "reportLogThreshold"

    const-string v2, "allowCoreTimeOut"

    const-string v3, "keepAlive"

    const-string v4, "createSize"

    const-string v5, "maxSize"

    const-string v6, "coreSize"

    invoke-static {p0}, Lcom/bytedance/sdk/openadsdk/utils/km;->oa(Ljava/lang/String;)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    move-result-object v7

    .line 21
    :try_start_0
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/settings/dj;->uu()Z

    move-result v8

    if-eqz v8, :cond_7

    const/4 v8, 0x1

    .line 22
    invoke-virtual {v7, v8}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->oa(Z)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    .line 23
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/settings/dj;->oa()Lcom/bytedance/sdk/openadsdk/core/settings/dj;

    move-result-object v9

    invoke-virtual {v9}, Lcom/bytedance/sdk/openadsdk/core/settings/dj;->aos()Lorg/json/JSONObject;

    move-result-object v9

    if-eqz v9, :cond_0

    .line 24
    invoke-virtual {v9, p0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-eqz p0, :cond_7

    .line 25
    invoke-virtual {v7, v8}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->oa(Z)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    .line 26
    invoke-virtual {p0, v6}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_1

    .line 27
    invoke-virtual {p0, v6}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v6

    invoke-virtual {v7, v6}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->uef(I)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    .line 28
    :cond_1
    invoke-virtual {p0, v5}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_2

    .line 29
    invoke-virtual {p0, v5}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v5

    invoke-virtual {v7, v5}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->oa(I)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    .line 30
    :cond_2
    invoke-virtual {p0, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_3

    .line 31
    invoke-virtual {p0, v4}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v4

    invoke-virtual {v7, v4}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->yo(I)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    .line 32
    :cond_3
    invoke-virtual {p0, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_4

    .line 33
    invoke-virtual {p0, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v3

    int-to-long v3, v3

    invoke-virtual {v7, v3, v4}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->uef(J)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    .line 34
    :cond_4
    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_5

    .line 35
    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v2

    invoke-virtual {v7, v2}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->uef(Z)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    .line 36
    :cond_5
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 37
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    .line 38
    :cond_6
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 39
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v7

    .line 40
    :goto_1
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    :cond_7
    return-object v7
.end method

.method private static uef(Ljava/lang/String;Lcom/bytedance/sdk/component/bcc/oa/xs;)Lcom/bytedance/sdk/component/bcc/oa/xs;
    .locals 0

    .line 17
    invoke-static {p0}, Lcom/bytedance/sdk/openadsdk/utils/km;->uef(Ljava/lang/String;)Lcom/bytedance/sdk/component/bcc/oa/xs$uef;

    move-result-object p0

    if-nez p1, :cond_0

    .line 18
    invoke-virtual {p0}, Lcom/bytedance/sdk/component/bcc/oa/xs$uef;->uef()Lcom/bytedance/sdk/component/bcc/oa/xs;

    move-result-object p0

    return-object p0

    .line 19
    :cond_0
    invoke-virtual {p1, p0}, Lcom/bytedance/sdk/component/bcc/oa/xs;->uef(Lcom/bytedance/sdk/component/bcc/oa/xs$uef;)V

    return-object p1
.end method

.method public static uef()Ljava/util/concurrent/ScheduledExecutorService;
    .locals 3

    .line 1
    sget-object v0, Lcom/bytedance/sdk/openadsdk/utils/km;->uef:Ljava/util/concurrent/ScheduledExecutorService;

    if-nez v0, :cond_1

    .line 2
    const-class v0, Lcom/bytedance/sdk/openadsdk/utils/km;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Lcom/bytedance/sdk/openadsdk/utils/km;->uef:Ljava/util/concurrent/ScheduledExecutorService;

    if-nez v1, :cond_0

    .line 4
    new-instance v1, Lcom/bytedance/sdk/component/bcc/oa/lw;

    const-string v2, "scheduled"

    invoke-direct {v1, v2}, Lcom/bytedance/sdk/component/bcc/oa/lw;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v1

    sput-object v1, Lcom/bytedance/sdk/openadsdk/utils/km;->uef:Ljava/util/concurrent/ScheduledExecutorService;

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
    sget-object v0, Lcom/bytedance/sdk/openadsdk/utils/km;->uef:Ljava/util/concurrent/ScheduledExecutorService;

    return-object v0
.end method

.method public static uef(Lcom/bytedance/sdk/component/bcc/oa/yo;)V
    .locals 1

    .line 11
    sget-boolean v0, Lcom/bytedance/sdk/openadsdk/utils/lz;->uef:Z

    if-eqz v0, :cond_0

    return-void

    .line 12
    :cond_0
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/utils/km;->cz()Lcom/bytedance/sdk/component/bcc/oa/xs;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/bytedance/sdk/component/bcc/oa/xs;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static uef(Lcom/bytedance/sdk/component/bcc/oa/yo;I)V
    .locals 1

    if-nez p0, :cond_0

    goto :goto_0

    .line 13
    :cond_0
    sget-boolean v0, Lcom/bytedance/sdk/openadsdk/utils/lz;->uef:Z

    if-eqz v0, :cond_1

    :goto_0
    return-void

    .line 14
    :cond_1
    invoke-virtual {p0, p1}, Lcom/bytedance/sdk/component/bcc/oa/yo;->setPriority(I)V

    .line 15
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/utils/km;->wk()Lcom/bytedance/sdk/component/bcc/oa/xs;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/bytedance/sdk/component/bcc/oa/xs;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static uef(Ljava/lang/Runnable;)V
    .locals 1

    if-nez p0, :cond_0

    goto :goto_0

    .line 7
    :cond_0
    sget-boolean v0, Lcom/bytedance/sdk/openadsdk/utils/lz;->uef:Z

    if-eqz v0, :cond_1

    :goto_0
    return-void

    .line 8
    :cond_1
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/utils/km;->ivm()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 9
    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    return-void

    .line 10
    :cond_2
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/wk;->yo()Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private static uef(Lcom/bytedance/sdk/component/bcc/oa/xs;)Z
    .locals 0

    if-eqz p0, :cond_1

    .line 16
    invoke-virtual {p0}, Lcom/bytedance/sdk/component/bcc/oa/xs;->uef()Z

    move-result p0

    if-nez p0, :cond_0

    invoke-static {}, Lcom/bytedance/sdk/openadsdk/core/settings/dj;->uu()Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method private static wk()Lcom/bytedance/sdk/component/bcc/oa/xs;
    .locals 3

    .line 1
    sget-object v0, Lcom/bytedance/sdk/openadsdk/utils/km;->xs:Lcom/bytedance/sdk/component/bcc/oa/xs;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/utils/km;->uef(Lcom/bytedance/sdk/component/bcc/oa/xs;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    const-class v0, Lcom/bytedance/sdk/openadsdk/utils/km;

    .line 10
    .line 11
    monitor-enter v0

    .line 12
    :try_start_0
    sget-object v1, Lcom/bytedance/sdk/openadsdk/utils/km;->xs:Lcom/bytedance/sdk/component/bcc/oa/xs;

    .line 13
    .line 14
    invoke-static {v1}, Lcom/bytedance/sdk/openadsdk/utils/km;->uef(Lcom/bytedance/sdk/component/bcc/oa/xs;)Z

    .line 15
    .line 16
    .line 17
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    :try_start_1
    const-string v1, "io"

    .line 21
    .line 22
    sget-object v2, Lcom/bytedance/sdk/openadsdk/utils/km;->xs:Lcom/bytedance/sdk/component/bcc/oa/xs;

    .line 23
    .line 24
    invoke-static {v1, v2}, Lcom/bytedance/sdk/openadsdk/utils/km;->uef(Ljava/lang/String;Lcom/bytedance/sdk/component/bcc/oa/xs;)Lcom/bytedance/sdk/component/bcc/oa/xs;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    sput-object v1, Lcom/bytedance/sdk/openadsdk/utils/km;->xs:Lcom/bytedance/sdk/component/bcc/oa/xs;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :catchall_0
    move-exception v1

    .line 32
    :try_start_2
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    :goto_0
    sget-object v1, Lcom/bytedance/sdk/openadsdk/utils/km;->xs:Lcom/bytedance/sdk/component/bcc/oa/xs;

    .line 36
    .line 37
    if-nez v1, :cond_0

    .line 38
    .line 39
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/utils/km;->bs()Lcom/bytedance/sdk/component/bcc/oa/xs;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    sput-object v1, Lcom/bytedance/sdk/openadsdk/utils/km;->xs:Lcom/bytedance/sdk/component/bcc/oa/xs;

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :catchall_1
    move-exception v1

    .line 47
    goto :goto_2

    .line 48
    :cond_0
    :goto_1
    sget-object v1, Lcom/bytedance/sdk/openadsdk/utils/km;->xs:Lcom/bytedance/sdk/component/bcc/oa/xs;

    .line 49
    .line 50
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 51
    return-object v1

    .line 52
    :goto_2
    monitor-exit v0

    .line 53
    throw v1

    .line 54
    :cond_1
    return-object v0
.end method

.method private static wrv()Ljava/util/concurrent/ThreadPoolExecutor;
    .locals 3

    .line 1
    sget-object v0, Lcom/bytedance/sdk/openadsdk/utils/km;->moa:Lcom/bytedance/sdk/component/bcc/oa/xs;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/utils/km;->uef(Lcom/bytedance/sdk/component/bcc/oa/xs;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    const-class v0, Lcom/bytedance/sdk/openadsdk/utils/km;

    .line 10
    .line 11
    monitor-enter v0

    .line 12
    :try_start_0
    sget-object v1, Lcom/bytedance/sdk/openadsdk/utils/km;->moa:Lcom/bytedance/sdk/component/bcc/oa/xs;

    .line 13
    .line 14
    invoke-static {v1}, Lcom/bytedance/sdk/openadsdk/utils/km;->uef(Lcom/bytedance/sdk/component/bcc/oa/xs;)Z

    .line 15
    .line 16
    .line 17
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    :try_start_1
    const-string v1, "ad"

    .line 21
    .line 22
    sget-object v2, Lcom/bytedance/sdk/openadsdk/utils/km;->moa:Lcom/bytedance/sdk/component/bcc/oa/xs;

    .line 23
    .line 24
    invoke-static {v1, v2}, Lcom/bytedance/sdk/openadsdk/utils/km;->uef(Ljava/lang/String;Lcom/bytedance/sdk/component/bcc/oa/xs;)Lcom/bytedance/sdk/component/bcc/oa/xs;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    sput-object v1, Lcom/bytedance/sdk/openadsdk/utils/km;->moa:Lcom/bytedance/sdk/component/bcc/oa/xs;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :catchall_0
    move-exception v1

    .line 32
    :try_start_2
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    :goto_0
    sget-object v1, Lcom/bytedance/sdk/openadsdk/utils/km;->moa:Lcom/bytedance/sdk/component/bcc/oa/xs;

    .line 36
    .line 37
    if-nez v1, :cond_0

    .line 38
    .line 39
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/utils/km;->bs()Lcom/bytedance/sdk/component/bcc/oa/xs;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    sput-object v1, Lcom/bytedance/sdk/openadsdk/utils/km;->moa:Lcom/bytedance/sdk/component/bcc/oa/xs;

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :catchall_1
    move-exception v1

    .line 47
    goto :goto_2

    .line 48
    :cond_0
    :goto_1
    sget-object v1, Lcom/bytedance/sdk/openadsdk/utils/km;->moa:Lcom/bytedance/sdk/component/bcc/oa/xs;

    .line 49
    .line 50
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 51
    return-object v1

    .line 52
    :goto_2
    monitor-exit v0

    .line 53
    throw v1

    .line 54
    :cond_1
    return-object v0
.end method

.method public static xs()Z
    .locals 2

    .line 1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    return v0

    .line 17
    :cond_0
    const-string v1, "pag_log"

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    return v0
.end method

.method public static yo()Ljava/util/concurrent/ExecutorService;
    .locals 1

    .line 1
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/utils/km;->ab()Lcom/bytedance/sdk/component/bcc/oa/xs;

    move-result-object v0

    return-object v0
.end method

.method public static yo(Lcom/bytedance/sdk/component/bcc/oa/yo;)V
    .locals 1

    if-nez p0, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    sget-boolean v0, Lcom/bytedance/sdk/openadsdk/utils/lz;->uef:Z

    if-eqz v0, :cond_1

    :goto_0
    return-void

    .line 5
    :cond_1
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/utils/km;->wrv()Ljava/util/concurrent/ThreadPoolExecutor;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static yo(Ljava/lang/Runnable;)V
    .locals 1

    .line 2
    sget-boolean v0, Lcom/bytedance/sdk/openadsdk/utils/lz;->uef:Z

    if-eqz v0, :cond_0

    return-void

    .line 3
    :cond_0
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/utils/km;->wk()Lcom/bytedance/sdk/component/bcc/oa/xs;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/bytedance/sdk/component/bcc/oa/xs;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static zjm()Lcom/bytedance/sdk/component/bcc/oa/xs;
    .locals 3

    .line 1
    sget-object v0, Lcom/bytedance/sdk/openadsdk/utils/km;->cz:Lcom/bytedance/sdk/component/bcc/oa/xs;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/bytedance/sdk/openadsdk/utils/km;->uef(Lcom/bytedance/sdk/component/bcc/oa/xs;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    const-class v0, Lcom/bytedance/sdk/openadsdk/utils/km;

    .line 10
    .line 11
    monitor-enter v0

    .line 12
    :try_start_0
    sget-object v1, Lcom/bytedance/sdk/openadsdk/utils/km;->cz:Lcom/bytedance/sdk/component/bcc/oa/xs;

    .line 13
    .line 14
    invoke-static {v1}, Lcom/bytedance/sdk/openadsdk/utils/km;->uef(Lcom/bytedance/sdk/component/bcc/oa/xs;)Z

    .line 15
    .line 16
    .line 17
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    :try_start_1
    const-string v1, "express"

    .line 21
    .line 22
    sget-object v2, Lcom/bytedance/sdk/openadsdk/utils/km;->cz:Lcom/bytedance/sdk/component/bcc/oa/xs;

    .line 23
    .line 24
    invoke-static {v1, v2}, Lcom/bytedance/sdk/openadsdk/utils/km;->uef(Ljava/lang/String;Lcom/bytedance/sdk/component/bcc/oa/xs;)Lcom/bytedance/sdk/component/bcc/oa/xs;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    sput-object v1, Lcom/bytedance/sdk/openadsdk/utils/km;->cz:Lcom/bytedance/sdk/component/bcc/oa/xs;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :catchall_0
    move-exception v1

    .line 32
    :try_start_2
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    :goto_0
    sget-object v1, Lcom/bytedance/sdk/openadsdk/utils/km;->cz:Lcom/bytedance/sdk/component/bcc/oa/xs;

    .line 36
    .line 37
    if-nez v1, :cond_0

    .line 38
    .line 39
    invoke-static {}, Lcom/bytedance/sdk/openadsdk/utils/km;->bs()Lcom/bytedance/sdk/component/bcc/oa/xs;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    sput-object v1, Lcom/bytedance/sdk/openadsdk/utils/km;->cz:Lcom/bytedance/sdk/component/bcc/oa/xs;

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :catchall_1
    move-exception v1

    .line 47
    goto :goto_2

    .line 48
    :cond_0
    :goto_1
    sget-object v1, Lcom/bytedance/sdk/openadsdk/utils/km;->cz:Lcom/bytedance/sdk/component/bcc/oa/xs;

    .line 49
    .line 50
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 51
    return-object v1

    .line 52
    :goto_2
    monitor-exit v0

    .line 53
    throw v1

    .line 54
    :cond_1
    return-object v0
.end method
