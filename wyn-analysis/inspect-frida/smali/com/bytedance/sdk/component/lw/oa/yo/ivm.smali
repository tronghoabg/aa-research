.class public Lcom/bytedance/sdk/component/lw/oa/yo/ivm;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private bcc:Ljava/util/concurrent/ExecutorService;

.field private cz:Landroid/content/Context;

.field private ivm:Lcom/bytedance/sdk/component/lw/moa;

.field private lw:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/bytedance/sdk/component/lw/yo;",
            ">;"
        }
    .end annotation
.end field

.field private volatile moa:Lcom/bytedance/sdk/component/lw/sy;

.field private final oa:Lcom/bytedance/sdk/component/lw/cq;

.field private uef:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/bytedance/sdk/component/lw/oa/yo/yo;",
            ">;>;"
        }
    .end annotation
.end field

.field private xs:Ljava/util/concurrent/ExecutorService;

.field private volatile yo:Lcom/bytedance/sdk/component/lw/bs;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/bytedance/sdk/component/lw/cq;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lj$/util/concurrent/ConcurrentHashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Lj$/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/bytedance/sdk/component/lw/oa/yo/ivm;->uef:Ljava/util/Map;

    .line 10
    .line 11
    new-instance v0, Lj$/util/concurrent/ConcurrentHashMap;

    .line 12
    .line 13
    invoke-direct {v0}, Lj$/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/bytedance/sdk/component/lw/oa/yo/ivm;->lw:Ljava/util/Map;

    .line 17
    .line 18
    invoke-static {p2}, Lcom/bytedance/sdk/component/lw/oa/yo/xs;->uef(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Lcom/bytedance/sdk/component/lw/cq;

    .line 23
    .line 24
    iput-object v0, p0, Lcom/bytedance/sdk/component/lw/oa/yo/ivm;->oa:Lcom/bytedance/sdk/component/lw/cq;

    .line 25
    .line 26
    iput-object p1, p0, Lcom/bytedance/sdk/component/lw/oa/yo/ivm;->cz:Landroid/content/Context;

    .line 27
    .line 28
    invoke-interface {p2}, Lcom/bytedance/sdk/component/lw/cq;->lw()Lcom/bytedance/sdk/component/lw/oa;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    invoke-static {p1, p2}, Lcom/bytedance/sdk/component/lw/oa/yo/uef/oa;->uef(Landroid/content/Context;Lcom/bytedance/sdk/component/lw/oa;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method private dj()Ljava/util/concurrent/ExecutorService;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/lw/oa/yo/ivm;->oa:Lcom/bytedance/sdk/component/lw/cq;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/bytedance/sdk/component/lw/cq;->uef()Ljava/util/concurrent/ExecutorService;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    invoke-static {}, Lcom/bytedance/sdk/component/lw/oa/uef/oa;->uef()Ljava/util/concurrent/ExecutorService;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0
.end method

.method private moa(Lcom/bytedance/sdk/component/lw/oa;)Lcom/bytedance/sdk/component/lw/yo;
    .locals 4

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/component/lw/oa/yo/ivm;->oa:Lcom/bytedance/sdk/component/lw/cq;

    invoke-interface {v0}, Lcom/bytedance/sdk/component/lw/cq;->moa()Lcom/bytedance/sdk/component/lw/yo;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    .line 3
    :cond_0
    new-instance v0, Lcom/bytedance/sdk/component/lw/oa/yo/uef/uef/oa;

    invoke-interface {p1}, Lcom/bytedance/sdk/component/lw/oa;->bcc()Ljava/io/File;

    move-result-object v1

    invoke-interface {p1}, Lcom/bytedance/sdk/component/lw/oa;->uef()J

    move-result-wide v2

    invoke-direct {v0, v1, v2, v3}, Lcom/bytedance/sdk/component/lw/oa/yo/uef/uef/oa;-><init>(Ljava/io/File;J)V

    return-object v0
.end method

.method private zjm()Lcom/bytedance/sdk/component/lw/moa;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/lw/oa/yo/ivm;->oa:Lcom/bytedance/sdk/component/lw/cq;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/bytedance/sdk/component/lw/cq;->yo()Lcom/bytedance/sdk/component/lw/moa;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    new-instance v0, Lcom/bytedance/sdk/component/lw/uef/uef;

    .line 10
    .line 11
    invoke-direct {v0}, Lcom/bytedance/sdk/component/lw/uef/uef;-><init>()V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-object v0
.end method


# virtual methods
.method public bcc()Ljava/util/concurrent/ExecutorService;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/lw/oa/yo/ivm;->oa:Lcom/bytedance/sdk/component/lw/cq;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/bytedance/sdk/component/lw/cq;->oa()Lcom/bytedance/sdk/component/lw/dhk;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-interface {v0}, Lcom/bytedance/sdk/component/lw/dhk;->oa()Ljava/util/concurrent/ExecutorService;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/component/lw/oa/yo/ivm;->bcc:Ljava/util/concurrent/ExecutorService;

    .line 17
    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    invoke-static {}, Lcom/bytedance/sdk/component/lw/oa/uef/oa;->uef()Ljava/util/concurrent/ExecutorService;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iput-object v0, p0, Lcom/bytedance/sdk/component/lw/oa/yo/ivm;->bcc:Ljava/util/concurrent/ExecutorService;

    .line 25
    .line 26
    :cond_1
    iget-object v0, p0, Lcom/bytedance/sdk/component/lw/oa/yo/ivm;->bcc:Ljava/util/concurrent/ExecutorService;

    .line 27
    .line 28
    return-object v0
.end method

.method public cz()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/bytedance/sdk/component/lw/oa/yo/yo;",
            ">;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/lw/oa/yo/ivm;->uef:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
.end method

.method public ivm()Ljava/util/concurrent/ExecutorService;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/lw/oa/yo/ivm;->oa:Lcom/bytedance/sdk/component/lw/cq;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/bytedance/sdk/component/lw/cq;->oa()Lcom/bytedance/sdk/component/lw/dhk;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-interface {v0}, Lcom/bytedance/sdk/component/lw/dhk;->uef()Ljava/util/concurrent/ExecutorService;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/component/lw/oa/yo/ivm;->xs:Ljava/util/concurrent/ExecutorService;

    .line 17
    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    invoke-direct {p0}, Lcom/bytedance/sdk/component/lw/oa/yo/ivm;->dj()Ljava/util/concurrent/ExecutorService;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iput-object v0, p0, Lcom/bytedance/sdk/component/lw/oa/yo/ivm;->xs:Ljava/util/concurrent/ExecutorService;

    .line 25
    .line 26
    :cond_1
    iget-object v0, p0, Lcom/bytedance/sdk/component/lw/oa/yo/ivm;->xs:Ljava/util/concurrent/ExecutorService;

    .line 27
    .line 28
    return-object v0
.end method

.method public lw()Lcom/bytedance/sdk/component/lw/moa;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/lw/oa/yo/ivm;->ivm:Lcom/bytedance/sdk/component/lw/moa;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/bytedance/sdk/component/lw/oa/yo/ivm;->zjm()Lcom/bytedance/sdk/component/lw/moa;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lcom/bytedance/sdk/component/lw/oa/yo/ivm;->ivm:Lcom/bytedance/sdk/component/lw/moa;

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/component/lw/oa/yo/ivm;->ivm:Lcom/bytedance/sdk/component/lw/moa;

    .line 12
    .line 13
    return-object v0
.end method

.method public moa()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Lcom/bytedance/sdk/component/lw/yo;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/lw/oa/yo/ivm;->lw:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public oa(Lcom/bytedance/sdk/component/lw/oa;)Lcom/bytedance/sdk/component/lw/sy;
    .locals 3

    if-nez p1, :cond_0

    .line 2
    invoke-static {}, Lcom/bytedance/sdk/component/lw/oa/yo/uef/oa;->cz()Lcom/bytedance/sdk/component/lw/oa;

    move-result-object p1

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/component/lw/oa/yo/ivm;->moa:Lcom/bytedance/sdk/component/lw/sy;

    if-nez v0, :cond_2

    .line 4
    const-class v0, Lcom/bytedance/sdk/component/lw/oa/yo/uef/oa/oa;

    monitor-enter v0

    .line 5
    :try_start_0
    iget-object v1, p0, Lcom/bytedance/sdk/component/lw/oa/yo/ivm;->moa:Lcom/bytedance/sdk/component/lw/sy;

    if-nez v1, :cond_1

    .line 6
    new-instance v1, Lcom/bytedance/sdk/component/lw/oa/yo/uef/oa/oa;

    invoke-interface {p1}, Lcom/bytedance/sdk/component/lw/oa;->oa()I

    move-result v2

    invoke-interface {p1}, Lcom/bytedance/sdk/component/lw/oa;->moa()I

    move-result p1

    invoke-direct {v1, v2, p1}, Lcom/bytedance/sdk/component/lw/oa/yo/uef/oa/oa;-><init>(II)V

    iput-object v1, p0, Lcom/bytedance/sdk/component/lw/oa/yo/ivm;->moa:Lcom/bytedance/sdk/component/lw/sy;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 7
    :cond_1
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    monitor-exit v0

    throw p1

    .line 8
    :cond_2
    :goto_2
    iget-object p1, p0, Lcom/bytedance/sdk/component/lw/oa/yo/ivm;->moa:Lcom/bytedance/sdk/component/lw/sy;

    return-object p1
.end method

.method public oa()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/lw/oa/yo/ivm;->oa:Lcom/bytedance/sdk/component/lw/cq;

    invoke-interface {v0}, Lcom/bytedance/sdk/component/lw/cq;->xs()Z

    move-result v0

    return v0
.end method

.method public uef()Landroid/content/Context;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/lw/oa/yo/ivm;->cz:Landroid/content/Context;

    return-object v0
.end method

.method public uef(Lcom/bytedance/sdk/component/lw/oa;)Lcom/bytedance/sdk/component/lw/bs;
    .locals 4

    if-nez p1, :cond_0

    .line 2
    invoke-static {}, Lcom/bytedance/sdk/component/lw/oa/yo/uef/oa;->cz()Lcom/bytedance/sdk/component/lw/oa;

    move-result-object p1

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/component/lw/oa/yo/ivm;->yo:Lcom/bytedance/sdk/component/lw/bs;

    if-nez v0, :cond_2

    .line 4
    const-class v0, Lcom/bytedance/sdk/component/lw/oa/yo/uef/oa/yo;

    monitor-enter v0

    .line 5
    :try_start_0
    iget-object v1, p0, Lcom/bytedance/sdk/component/lw/oa/yo/ivm;->yo:Lcom/bytedance/sdk/component/lw/bs;

    if-nez v1, :cond_1

    .line 6
    new-instance v1, Lcom/bytedance/sdk/component/lw/oa/yo/uef/oa/yo;

    new-instance v2, Lcom/bytedance/sdk/component/lw/oa/yo/uef/oa/uef;

    invoke-interface {p1}, Lcom/bytedance/sdk/component/lw/oa;->oa()I

    move-result v3

    invoke-interface {p1}, Lcom/bytedance/sdk/component/lw/oa;->yo()I

    move-result p1

    invoke-direct {v2, v3, p1}, Lcom/bytedance/sdk/component/lw/oa/yo/uef/oa/uef;-><init>(II)V

    invoke-direct {v1, v2}, Lcom/bytedance/sdk/component/lw/oa/yo/uef/oa/yo;-><init>(Lcom/bytedance/sdk/component/lw/bs;)V

    iput-object v1, p0, Lcom/bytedance/sdk/component/lw/oa/yo/ivm;->yo:Lcom/bytedance/sdk/component/lw/bs;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 7
    :cond_1
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    monitor-exit v0

    throw p1

    .line 8
    :cond_2
    :goto_2
    iget-object p1, p0, Lcom/bytedance/sdk/component/lw/oa/yo/ivm;->yo:Lcom/bytedance/sdk/component/lw/bs;

    return-object p1
.end method

.method public uef(Lcom/bytedance/sdk/component/lw/oa/yo/yo;)Lcom/bytedance/sdk/component/lw/oa/yo/oa/oa;
    .locals 8

    .line 11
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->cz()Landroid/widget/ImageView$ScaleType;

    move-result-object v0

    if-nez v0, :cond_0

    .line 12
    sget-object v0, Lcom/bytedance/sdk/component/lw/oa/yo/oa/oa;->uef:Landroid/widget/ImageView$ScaleType;

    :cond_0
    move-object v4, v0

    .line 13
    invoke-virtual {p1}, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->zjm()Landroid/graphics/Bitmap$Config;

    move-result-object v0

    if-nez v0, :cond_1

    .line 14
    sget-object v0, Lcom/bytedance/sdk/component/lw/oa/yo/oa/oa;->oa:Landroid/graphics/Bitmap$Config;

    :cond_1
    move-object v5, v0

    .line 15
    new-instance v1, Lcom/bytedance/sdk/component/lw/oa/yo/oa/oa;

    invoke-virtual {p1}, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->oa()I

    move-result v2

    invoke-virtual {p1}, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->yo()I

    move-result v3

    invoke-virtual {p1}, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->moa()I

    move-result v6

    invoke-virtual {p1}, Lcom/bytedance/sdk/component/lw/oa/yo/yo;->lw()I

    move-result v7

    invoke-direct/range {v1 .. v7}, Lcom/bytedance/sdk/component/lw/oa/yo/oa/oa;-><init>(IILandroid/widget/ImageView$ScaleType;Landroid/graphics/Bitmap$Config;II)V

    return-object v1
.end method

.method public uef(Ljava/lang/String;)Lcom/bytedance/sdk/component/lw/yo;
    .locals 1

    .line 9
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/bytedance/sdk/component/lw/oa/yo/uef/oa;->uef(Ljava/io/File;)Lcom/bytedance/sdk/component/lw/oa;

    move-result-object p1

    .line 10
    invoke-virtual {p0, p1}, Lcom/bytedance/sdk/component/lw/oa/yo/ivm;->yo(Lcom/bytedance/sdk/component/lw/oa;)Lcom/bytedance/sdk/component/lw/yo;

    move-result-object p1

    return-object p1
.end method

.method public xs()Lcom/bytedance/sdk/component/lw/tpx;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/lw/oa/yo/ivm;->oa:Lcom/bytedance/sdk/component/lw/cq;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/bytedance/sdk/component/lw/cq;->ivm()Lcom/bytedance/sdk/component/lw/tpx;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
.end method

.method public yo()Lcom/bytedance/sdk/component/lw/sy;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/lw/oa/yo/ivm;->moa:Lcom/bytedance/sdk/component/lw/sy;

    return-object v0
.end method

.method public yo(Lcom/bytedance/sdk/component/lw/oa;)Lcom/bytedance/sdk/component/lw/yo;
    .locals 2

    if-nez p1, :cond_0

    .line 2
    invoke-static {}, Lcom/bytedance/sdk/component/lw/oa/yo/uef/oa;->cz()Lcom/bytedance/sdk/component/lw/oa;

    move-result-object p1

    .line 3
    :cond_0
    invoke-interface {p1}, Lcom/bytedance/sdk/component/lw/oa;->bcc()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->toString()Ljava/lang/String;

    move-result-object v0

    .line 4
    iget-object v1, p0, Lcom/bytedance/sdk/component/lw/oa/yo/ivm;->lw:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/bytedance/sdk/component/lw/yo;

    if-nez v1, :cond_1

    .line 5
    invoke-direct {p0, p1}, Lcom/bytedance/sdk/component/lw/oa/yo/ivm;->moa(Lcom/bytedance/sdk/component/lw/oa;)Lcom/bytedance/sdk/component/lw/yo;

    move-result-object p1

    .line 6
    iget-object v1, p0, Lcom/bytedance/sdk/component/lw/oa/yo/ivm;->lw:Ljava/util/Map;

    invoke-interface {v1, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p1

    :cond_1
    return-object v1
.end method
