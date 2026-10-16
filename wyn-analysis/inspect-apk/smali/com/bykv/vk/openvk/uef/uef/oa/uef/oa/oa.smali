.class public Lcom/bykv/vk/openvk/uef/uef/oa/uef/oa/oa;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final ivm:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/bykv/vk/openvk/uef/uef/uef/lw/uef$uef;",
            ">;"
        }
    .end annotation
.end field

.field private lw:Ljava/io/File;

.field private moa:Ljava/io/File;

.field private oa:Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;

.field private uef:Landroid/content/Context;

.field private volatile xs:Z

.field private volatile yo:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/oa/oa;->yo:Z

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    iput-object v1, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/oa/oa;->moa:Ljava/io/File;

    .line 9
    .line 10
    iput-object v1, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/oa/oa;->lw:Ljava/io/File;

    .line 11
    .line 12
    new-instance v1, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v1, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/oa/oa;->ivm:Ljava/util/List;

    .line 18
    .line 19
    iput-boolean v0, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/oa/oa;->xs:Z

    .line 20
    .line 21
    iput-object p1, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/oa/oa;->uef:Landroid/content/Context;

    .line 22
    .line 23
    iput-object p2, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/oa/oa;->oa:Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;

    .line 24
    .line 25
    invoke-virtual {p2}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->lw()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {p2}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->bs()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-static {p1, v0}, Lcom/bykv/vk/openvk/uef/uef/oa/moa/oa;->oa(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iput-object p1, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/oa/oa;->moa:Ljava/io/File;

    .line 38
    .line 39
    invoke-virtual {p2}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->lw()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {p2}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->bs()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    invoke-static {p1, p2}, Lcom/bykv/vk/openvk/uef/uef/oa/moa/oa;->yo(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    iput-object p1, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/oa/oa;->lw:Ljava/io/File;

    .line 52
    .line 53
    return-void
.end method

.method private lw()V
    .locals 3

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/oa/oa;->moa:Ljava/io/File;

    iget-object v1, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/oa/oa;->lw:Ljava/io/File;

    invoke-virtual {v0, v1}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Error renaming file "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/oa/oa;->moa:Ljava/io/File;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " to "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/oa/oa;->lw:Ljava/io/File;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " for completion!"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception v0

    .line 4
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    :goto_0
    return-void
.end method

.method public static synthetic lw(Lcom/bykv/vk/openvk/uef/uef/oa/uef/oa/oa;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/bykv/vk/openvk/uef/uef/oa/uef/oa/oa;->moa()V

    return-void
.end method

.method private moa()V
    .locals 1

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/oa/oa;->lw:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 3
    iget-object v0, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/oa/oa;->moa:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->delete()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public static synthetic moa(Lcom/bykv/vk/openvk/uef/uef/oa/uef/oa/oa;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/bykv/vk/openvk/uef/uef/oa/uef/oa/oa;->lw()V

    return-void
.end method

.method public static synthetic oa(Lcom/bykv/vk/openvk/uef/uef/oa/uef/oa/oa;)Ljava/io/File;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/oa/oa;->moa:Ljava/io/File;

    return-object p0
.end method

.method public static synthetic oa(Lcom/bykv/vk/openvk/uef/uef/oa/uef/oa/oa;Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;I)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Lcom/bykv/vk/openvk/uef/uef/oa/uef/oa/oa;->uef(Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;I)V

    return-void
.end method

.method private oa(Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;I)V
    .locals 3

    .line 7
    const-class v0, Lcom/bykv/vk/openvk/uef/uef/uef/lw/uef$uef;

    monitor-enter v0

    .line 8
    :try_start_0
    iget-object v1, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/oa/oa;->ivm:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/bykv/vk/openvk/uef/uef/uef/lw/uef$uef;

    if-eqz v2, :cond_0

    .line 9
    invoke-interface {v2, p1, p2}, Lcom/bykv/vk/openvk/uef/uef/uef/lw/uef$uef;->oa(Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;I)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 10
    :cond_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :goto_1
    monitor-exit v0

    throw p1
.end method

.method private oa()Z
    .locals 7

    .line 3
    iget-object v0, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/oa/oa;->lw:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/oa/oa;->oa:Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;

    invoke-virtual {v0}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->cq()Z

    move-result v0

    const/4 v2, 0x0

    if-nez v0, :cond_2

    .line 5
    iget-object v0, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/oa/oa;->moa:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v3

    iget-object v0, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/oa/oa;->oa:Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;

    invoke-virtual {v0}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->ivm()I

    move-result v0

    int-to-long v5, v0

    cmp-long v0, v3, v5

    if-ltz v0, :cond_1

    return v1

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/oa/oa;->oa:Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;

    invoke-virtual {v0}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->moa()I

    move-result v0

    if-lez v0, :cond_2

    iget-object v0, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/oa/oa;->moa:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v3

    iget-object v0, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/oa/oa;->oa:Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;

    invoke-virtual {v0}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->moa()I

    move-result v0

    int-to-long v5, v0

    cmp-long v0, v3, v5

    if-ltz v0, :cond_2

    return v1

    :cond_2
    return v2
.end method

.method public static synthetic uef(Lcom/bykv/vk/openvk/uef/uef/oa/uef/oa/oa;)Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/oa/oa;->oa:Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;

    return-object p0
.end method

.method public static synthetic uef(Lcom/bykv/vk/openvk/uef/uef/oa/uef/oa/oa;Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;I)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Lcom/bykv/vk/openvk/uef/uef/oa/uef/oa/oa;->oa(Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;I)V

    return-void
.end method

.method public static synthetic uef(Lcom/bykv/vk/openvk/uef/uef/oa/uef/oa/oa;Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;ILjava/lang/String;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2, p3}, Lcom/bykv/vk/openvk/uef/uef/oa/uef/oa/oa;->uef(Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;ILjava/lang/String;)V

    return-void
.end method

.method public static synthetic uef(Lcom/bykv/vk/openvk/uef/uef/oa/uef/oa/oa;Ljava/io/Closeable;)V
    .locals 0

    .line 4
    invoke-direct {p0, p1}, Lcom/bykv/vk/openvk/uef/uef/oa/uef/oa/oa;->uef(Ljava/io/Closeable;)V

    return-void
.end method

.method private uef(Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;I)V
    .locals 3

    .line 20
    const-class v0, Lcom/bykv/vk/openvk/uef/uef/uef/lw/uef$uef;

    monitor-enter v0

    .line 21
    :try_start_0
    iget-object v1, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/oa/oa;->ivm:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/bykv/vk/openvk/uef/uef/uef/lw/uef$uef;

    if-eqz v2, :cond_0

    .line 22
    invoke-interface {v2, p1, p2}, Lcom/bykv/vk/openvk/uef/uef/uef/lw/uef$uef;->uef(Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;I)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 23
    :cond_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :goto_1
    monitor-exit v0

    throw p1
.end method

.method private uef(Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;ILjava/lang/String;)V
    .locals 3

    .line 24
    const-class v0, Lcom/bykv/vk/openvk/uef/uef/uef/lw/uef$uef;

    monitor-enter v0

    .line 25
    :try_start_0
    iget-object v1, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/oa/oa;->ivm:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/bykv/vk/openvk/uef/uef/uef/lw/uef$uef;

    if-eqz v2, :cond_0

    .line 26
    invoke-interface {v2, p1, p2, p3}, Lcom/bykv/vk/openvk/uef/uef/uef/lw/uef$uef;->uef(Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;ILjava/lang/String;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 27
    :cond_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :goto_1
    monitor-exit v0

    throw p1
.end method

.method private uef(Ljava/io/Closeable;)V
    .locals 0

    if-eqz p1, :cond_0

    .line 17
    :try_start_0
    invoke-interface {p1}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

.method private yo()V
    .locals 11

    .line 2
    invoke-static {}, Lcom/bykv/vk/openvk/uef/uef/uef/yo;->yo()Lcom/bytedance/sdk/component/oa/uef/dj;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    invoke-static {}, Lcom/bykv/vk/openvk/uef/uef/uef/yo;->yo()Lcom/bytedance/sdk/component/oa/uef/dj;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bytedance/sdk/component/oa/uef/dj;->yo()Lcom/bytedance/sdk/component/oa/uef/dj$uef;

    move-result-object v0

    goto :goto_0

    .line 4
    :cond_0
    new-instance v0, Lcom/bytedance/sdk/component/oa/uef/dj$uef;

    const-string v1, "v_preload"

    invoke-direct {v0, v1}, Lcom/bytedance/sdk/component/oa/uef/dj$uef;-><init>(Ljava/lang/String;)V

    .line 5
    :goto_0
    iget-object v1, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/oa/oa;->oa:Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;

    invoke-virtual {v1}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->oib()I

    move-result v1

    int-to-long v1, v1

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, v3}, Lcom/bytedance/sdk/component/oa/uef/dj$uef;->uef(JLjava/util/concurrent/TimeUnit;)Lcom/bytedance/sdk/component/oa/uef/dj$uef;

    move-result-object v1

    iget-object v2, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/oa/oa;->oa:Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;

    .line 6
    invoke-virtual {v2}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->dhk()I

    move-result v2

    int-to-long v4, v2

    invoke-virtual {v1, v4, v5, v3}, Lcom/bytedance/sdk/component/oa/uef/dj$uef;->oa(JLjava/util/concurrent/TimeUnit;)Lcom/bytedance/sdk/component/oa/uef/dj$uef;

    move-result-object v1

    iget-object v2, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/oa/oa;->oa:Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;

    .line 7
    invoke-virtual {v2}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->tpx()I

    move-result v2

    int-to-long v4, v2

    invoke-virtual {v1, v4, v5, v3}, Lcom/bytedance/sdk/component/oa/uef/dj$uef;->yo(JLjava/util/concurrent/TimeUnit;)Lcom/bytedance/sdk/component/oa/uef/dj$uef;

    .line 8
    invoke-virtual {v0}, Lcom/bytedance/sdk/component/oa/uef/dj$uef;->uef()Lcom/bytedance/sdk/component/oa/uef/dj;

    move-result-object v0

    .line 9
    new-instance v1, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;

    invoke-direct {v1}, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;-><init>()V

    .line 10
    iget-object v2, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/oa/oa;->moa:Ljava/io/File;

    invoke-virtual {v2}, Ljava/io/File;->length()J

    move-result-wide v2

    .line 11
    iget-object v4, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/oa/oa;->oa:Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;

    invoke-virtual {v4}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->ivm()I

    move-result v4

    .line 12
    iget-object v5, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/oa/oa;->oa:Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;

    invoke-virtual {v5}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->cq()Z

    move-result v5

    .line 13
    iget-object v6, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/oa/oa;->oa:Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;

    invoke-virtual {v6}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->moa()I

    move-result v6

    if-lez v6, :cond_2

    int-to-long v7, v6

    .line 14
    iget-object v9, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/oa/oa;->oa:Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;

    invoke-virtual {v9}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->wrv()J

    move-result-wide v9

    cmp-long v7, v7, v9

    if-ltz v7, :cond_1

    const/4 v5, 0x1

    goto :goto_1

    :cond_1
    move v4, v6

    .line 15
    :cond_2
    :goto_1
    const-string v6, "videoPreload"

    invoke-virtual {v1, v6}, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->uef(Ljava/lang/String;)Lcom/bytedance/sdk/component/oa/uef/wrv$uef;

    move-result-object v6

    const/4 v7, 0x6

    invoke-virtual {v6, v7}, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->uef(I)Lcom/bytedance/sdk/component/oa/uef/wrv$uef;

    .line 16
    const-string v6, "-"

    const-string v7, "bytes="

    const-string v8, "RANGE"

    if-eqz v5, :cond_3

    .line 17
    invoke-static {v2, v3, v7, v6}, Lcb/a;->h(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 18
    invoke-virtual {v1, v8, v4}, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->uef(Ljava/lang/String;Ljava/lang/String;)Lcom/bytedance/sdk/component/oa/uef/wrv$uef;

    move-result-object v4

    iget-object v5, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/oa/oa;->oa:Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;

    .line 19
    invoke-virtual {v5}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->ab()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->oa(Ljava/lang/String;)Lcom/bytedance/sdk/component/oa/uef/wrv$uef;

    move-result-object v4

    .line 20
    invoke-virtual {v4}, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->uef()Lcom/bytedance/sdk/component/oa/uef/wrv$uef;

    move-result-object v4

    .line 21
    invoke-virtual {v4}, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->oa()Lcom/bytedance/sdk/component/oa/uef/wrv;

    goto :goto_2

    .line 22
    :cond_3
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v8, v4}, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->uef(Ljava/lang/String;Ljava/lang/String;)Lcom/bytedance/sdk/component/oa/uef/wrv$uef;

    move-result-object v4

    iget-object v5, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/oa/oa;->oa:Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;

    .line 23
    invoke-virtual {v5}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->ab()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->oa(Ljava/lang/String;)Lcom/bytedance/sdk/component/oa/uef/wrv$uef;

    move-result-object v4

    .line 24
    invoke-virtual {v4}, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->uef()Lcom/bytedance/sdk/component/oa/uef/wrv$uef;

    move-result-object v4

    .line 25
    invoke-virtual {v4}, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->oa()Lcom/bytedance/sdk/component/oa/uef/wrv;

    .line 26
    :goto_2
    invoke-virtual {v1}, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->oa()Lcom/bytedance/sdk/component/oa/uef/wrv;

    move-result-object v1

    .line 27
    invoke-virtual {v0, v1}, Lcom/bytedance/sdk/component/oa/uef/dj;->uef(Lcom/bytedance/sdk/component/oa/uef/wrv;)Lcom/bytedance/sdk/component/oa/uef/oa;

    move-result-object v0

    .line 28
    new-instance v1, Lcom/bykv/vk/openvk/uef/uef/oa/uef/oa/oa$1;

    invoke-direct {v1, p0, v2, v3}, Lcom/bykv/vk/openvk/uef/uef/oa/uef/oa/oa$1;-><init>(Lcom/bykv/vk/openvk/uef/uef/oa/uef/oa/oa;J)V

    invoke-interface {v0, v1}, Lcom/bytedance/sdk/component/oa/uef/oa;->uef(Lcom/bytedance/sdk/component/oa/uef/yo;)V

    return-void
.end method

.method public static synthetic yo(Lcom/bykv/vk/openvk/uef/uef/oa/uef/oa/oa;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/oa/oa;->yo:Z

    return p0
.end method


# virtual methods
.method public uef()Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;
    .locals 1

    .line 18
    iget-object v0, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/oa/oa;->oa:Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;

    return-object v0
.end method

.method public uef(Lcom/bykv/vk/openvk/uef/uef/uef/lw/uef$uef;)V
    .locals 2

    .line 5
    iget-boolean v0, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/oa/oa;->xs:Z

    if-eqz v0, :cond_0

    .line 6
    const-class v0, Lcom/bykv/vk/openvk/uef/uef/uef/lw/uef$uef;

    monitor-enter v0

    .line 7
    :try_start_0
    iget-object v1, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/oa/oa;->ivm:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 8
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1

    .line 9
    :cond_0
    iget-object v0, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/oa/oa;->ivm:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 10
    invoke-direct {p0}, Lcom/bykv/vk/openvk/uef/uef/oa/uef/oa/oa;->oa()Z

    move-result p1

    const/4 v0, 0x1

    if-eqz p1, :cond_1

    .line 11
    iget-object p1, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/oa/oa;->oa:Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;

    invoke-virtual {p1, v0}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->bcc(I)V

    .line 12
    iget-object p1, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/oa/oa;->oa:Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;

    const/16 v0, 0xc8

    invoke-direct {p0, p1, v0}, Lcom/bykv/vk/openvk/uef/uef/oa/uef/oa/oa;->uef(Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;I)V

    .line 13
    iget-object p1, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/oa/oa;->oa:Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;

    invoke-static {p1}, Lcom/bykv/vk/openvk/uef/uef/oa/uef/oa/yo;->uef(Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;)V

    return-void

    .line 14
    :cond_1
    iput-boolean v0, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/oa/oa;->xs:Z

    .line 15
    iget-object p1, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/oa/oa;->oa:Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/bykv/vk/openvk/uef/uef/uef/yo/yo;->bcc(I)V

    .line 16
    invoke-direct {p0}, Lcom/bykv/vk/openvk/uef/uef/oa/uef/oa/oa;->yo()V

    return-void
.end method

.method public uef(Z)V
    .locals 0

    .line 19
    iput-boolean p1, p0, Lcom/bykv/vk/openvk/uef/uef/oa/uef/oa/oa;->yo:Z

    return-void
.end method
