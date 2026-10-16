.class public Lcom/bytedance/sdk/component/ivm/uef/xs;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static volatile cz:Lcom/bytedance/sdk/component/ivm/uef/lw/uef;

.field private static wrv:Lcom/bytedance/sdk/component/ivm/uef/xs;


# instance fields
.field private volatile bcc:Lcom/bytedance/sdk/component/ivm/uef/lw;

.field private final cq:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private volatile dj:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lcom/bytedance/sdk/component/ivm/uef/oa/yo;",
            ">;"
        }
    .end annotation
.end field

.field private dz:J

.field private volatile ivm:Lcom/bytedance/sdk/component/ivm/uef/moa/oa/uef;

.field private volatile lw:Lcom/bytedance/sdk/component/ivm/uef/moa/oa/uef;

.field private volatile moa:Lcom/bytedance/sdk/component/ivm/uef/moa/oa/uef;

.field private volatile oa:Lcom/bytedance/sdk/component/ivm/uef/moa/oa/uef;

.field private volatile uef:Landroid/content/Context;

.field private volatile xs:Lcom/bytedance/sdk/component/ivm/uef/uef/lw;

.field private volatile yo:Lcom/bytedance/sdk/component/ivm/uef/moa/oa/uef;

.field private volatile zjm:Lcom/bytedance/sdk/component/ivm/uef/oa/yo;


# direct methods
.method private constructor <init>()V
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
    iput-object v0, p0, Lcom/bytedance/sdk/component/ivm/uef/xs;->cq:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 11
    .line 12
    return-void
.end method

.method public static declared-synchronized ivm()Lcom/bytedance/sdk/component/ivm/uef/xs;
    .locals 2

    .line 1
    const-class v0, Lcom/bytedance/sdk/component/ivm/uef/xs;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lcom/bytedance/sdk/component/ivm/uef/xs;->wrv:Lcom/bytedance/sdk/component/ivm/uef/xs;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    new-instance v1, Lcom/bytedance/sdk/component/ivm/uef/xs;

    .line 9
    .line 10
    invoke-direct {v1}, Lcom/bytedance/sdk/component/ivm/uef/xs;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v1, Lcom/bytedance/sdk/component/ivm/uef/xs;->wrv:Lcom/bytedance/sdk/component/ivm/uef/xs;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception v1

    .line 17
    goto :goto_1

    .line 18
    :cond_0
    :goto_0
    sget-object v1, Lcom/bytedance/sdk/component/ivm/uef/xs;->wrv:Lcom/bytedance/sdk/component/ivm/uef/xs;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    monitor-exit v0

    .line 21
    return-object v1

    .line 22
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    throw v1
.end method

.method public static moa()Lcom/bytedance/sdk/component/ivm/uef/lw/uef;
    .locals 2

    .line 1
    sget-object v0, Lcom/bytedance/sdk/component/ivm/uef/xs;->cz:Lcom/bytedance/sdk/component/ivm/uef/lw/uef;

    if-nez v0, :cond_1

    .line 2
    const-class v0, Lcom/bytedance/sdk/component/ivm/uef/xs;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Lcom/bytedance/sdk/component/ivm/uef/xs;->cz:Lcom/bytedance/sdk/component/ivm/uef/lw/uef;

    if-nez v1, :cond_0

    .line 4
    new-instance v1, Lcom/bytedance/sdk/component/ivm/uef/lw/oa;

    invoke-direct {v1}, Lcom/bytedance/sdk/component/ivm/uef/lw/oa;-><init>()V

    sput-object v1, Lcom/bytedance/sdk/component/ivm/uef/xs;->cz:Lcom/bytedance/sdk/component/ivm/uef/lw/uef;

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
    sget-object v0, Lcom/bytedance/sdk/component/ivm/uef/xs;->cz:Lcom/bytedance/sdk/component/ivm/uef/lw/uef;

    return-object v0
.end method


# virtual methods
.method public ab()J
    .locals 4

    .line 1
    iget-wide v0, p0, Lcom/bytedance/sdk/component/ivm/uef/xs;->dz:J

    .line 2
    .line 3
    const-wide/32 v2, 0x5265c00

    .line 4
    .line 5
    .line 6
    mul-long/2addr v0, v2

    .line 7
    return-wide v0
.end method

.method public bcc()V
    .locals 1

    .line 1
    sget-object v0, Lcom/bytedance/sdk/component/ivm/uef/oa/moa;->uef:Lcom/bytedance/sdk/component/ivm/uef/oa/moa;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/bytedance/sdk/component/ivm/uef/oa/moa;->oa()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public cq()Lcom/bytedance/sdk/component/ivm/uef/moa/oa/uef;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/ivm/uef/xs;->moa:Lcom/bytedance/sdk/component/ivm/uef/moa/oa/uef;

    .line 2
    .line 3
    return-object v0
.end method

.method public cz()Lcom/bytedance/sdk/component/ivm/uef/moa/oa/uef;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/ivm/uef/xs;->ivm:Lcom/bytedance/sdk/component/ivm/uef/moa/oa/uef;

    .line 2
    .line 3
    return-object v0
.end method

.method public dj()Lcom/bytedance/sdk/component/ivm/uef/moa/oa/uef;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/ivm/uef/xs;->oa:Lcom/bytedance/sdk/component/ivm/uef/moa/oa/uef;

    .line 2
    .line 3
    return-object v0
.end method

.method public dz()Lcom/bytedance/sdk/component/ivm/uef/moa/oa/uef;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/ivm/uef/xs;->lw:Lcom/bytedance/sdk/component/ivm/uef/moa/oa/uef;

    .line 2
    .line 3
    return-object v0
.end method

.method public lw()Landroid/content/Context;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/ivm/uef/xs;->uef:Landroid/content/Context;

    return-object v0
.end method

.method public lw(Lcom/bytedance/sdk/component/ivm/uef/moa/oa/uef;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/bytedance/sdk/component/ivm/uef/xs;->lw:Lcom/bytedance/sdk/component/ivm/uef/moa/oa/uef;

    return-void
.end method

.method public moa(Lcom/bytedance/sdk/component/ivm/uef/moa/oa/uef;)V
    .locals 0

    .line 7
    iput-object p1, p0, Lcom/bytedance/sdk/component/ivm/uef/xs;->moa:Lcom/bytedance/sdk/component/ivm/uef/moa/oa/uef;

    return-void
.end method

.method public oa()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lcom/bytedance/sdk/component/ivm/uef/oa/yo;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/ivm/uef/xs;->dj:Ljava/util/Map;

    return-object v0
.end method

.method public oa(Lcom/bytedance/sdk/component/ivm/uef/moa/oa/uef;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/bytedance/sdk/component/ivm/uef/xs;->oa:Lcom/bytedance/sdk/component/ivm/uef/moa/oa/uef;

    return-void
.end method

.method public uef(J)V
    .locals 0

    .line 12
    iput-wide p1, p0, Lcom/bytedance/sdk/component/ivm/uef/xs;->dz:J

    return-void
.end method

.method public uef(Landroid/content/Context;)V
    .locals 0

    .line 4
    iput-object p1, p0, Lcom/bytedance/sdk/component/ivm/uef/xs;->uef:Landroid/content/Context;

    return-void
.end method

.method public uef(Lcom/bytedance/sdk/component/ivm/uef/lw;)V
    .locals 0

    .line 11
    iput-object p1, p0, Lcom/bytedance/sdk/component/ivm/uef/xs;->bcc:Lcom/bytedance/sdk/component/ivm/uef/lw;

    return-void
.end method

.method public uef(Lcom/bytedance/sdk/component/ivm/uef/moa/oa/uef;)V
    .locals 0

    .line 6
    iput-object p1, p0, Lcom/bytedance/sdk/component/ivm/uef/xs;->ivm:Lcom/bytedance/sdk/component/ivm/uef/moa/oa/uef;

    return-void
.end method

.method public uef(Lcom/bytedance/sdk/component/ivm/uef/moa/uef;)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    .line 7
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-interface {p1, v0, v1}, Lcom/bytedance/sdk/component/ivm/uef/moa/uef;->uef(J)V

    .line 8
    sget-object v0, Lcom/bytedance/sdk/component/ivm/uef/oa/moa;->uef:Lcom/bytedance/sdk/component/ivm/uef/oa/moa;

    invoke-interface {p1}, Lcom/bytedance/sdk/component/ivm/uef/moa/uef;->moa()B

    move-result v1

    invoke-virtual {v0, p1, v1}, Lcom/bytedance/sdk/component/ivm/uef/oa/moa;->uef(Lcom/bytedance/sdk/component/ivm/uef/moa/uef;I)V

    return-void
.end method

.method public uef(Lcom/bytedance/sdk/component/ivm/uef/oa/yo;)V
    .locals 0

    .line 5
    iput-object p1, p0, Lcom/bytedance/sdk/component/ivm/uef/xs;->zjm:Lcom/bytedance/sdk/component/ivm/uef/oa/yo;

    return-void
.end method

.method public uef(Lcom/bytedance/sdk/component/ivm/uef/uef/lw;)V
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/bytedance/sdk/component/ivm/uef/xs;->xs:Lcom/bytedance/sdk/component/ivm/uef/uef/lw;

    return-void
.end method

.method public uef(Ljava/lang/String;Ljava/util/List;ZLjava/util/Map;ILjava/lang/String;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;Z",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;I",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 10
    invoke-static {}, Lcom/bytedance/sdk/component/ivm/uef/ivm/uef;->uef()Lcom/bytedance/sdk/component/ivm/uef/ivm/oa;

    move-result-object v0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-object v4, p4

    move v5, p5

    move-object v6, p6

    invoke-interface/range {v0 .. v6}, Lcom/bytedance/sdk/component/ivm/uef/ivm/oa;->uef(Ljava/lang/String;Ljava/util/List;ZLjava/util/Map;ILjava/lang/String;)V

    return-void
.end method

.method public uef(Ljava/lang/String;Z)V
    .locals 1

    .line 9
    invoke-static {}, Lcom/bytedance/sdk/component/ivm/uef/ivm/uef;->uef()Lcom/bytedance/sdk/component/ivm/uef/ivm/oa;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/bytedance/sdk/component/ivm/uef/ivm/oa;->uef(Ljava/lang/String;Z)V

    return-void
.end method

.method public uef(Z)V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/component/ivm/uef/xs;->cq:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void
.end method

.method public uef()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/ivm/uef/xs;->cq:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    return v0
.end method

.method public wk()Lcom/bytedance/sdk/component/ivm/uef/lw;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/ivm/uef/xs;->bcc:Lcom/bytedance/sdk/component/ivm/uef/lw;

    .line 2
    .line 3
    return-object v0
.end method

.method public wrv()Lcom/bytedance/sdk/component/ivm/uef/moa/oa/uef;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/ivm/uef/xs;->yo:Lcom/bytedance/sdk/component/ivm/uef/moa/oa/uef;

    .line 2
    .line 3
    return-object v0
.end method

.method public xs()Lcom/bytedance/sdk/component/ivm/uef/oa/yo;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/ivm/uef/xs;->zjm:Lcom/bytedance/sdk/component/ivm/uef/oa/yo;

    .line 2
    .line 3
    return-object v0
.end method

.method public yo()Lcom/bytedance/sdk/component/ivm/uef/uef/lw;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/ivm/uef/xs;->xs:Lcom/bytedance/sdk/component/ivm/uef/uef/lw;

    return-object v0
.end method

.method public yo(Lcom/bytedance/sdk/component/ivm/uef/moa/oa/uef;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/bytedance/sdk/component/ivm/uef/xs;->yo:Lcom/bytedance/sdk/component/ivm/uef/moa/oa/uef;

    return-void
.end method

.method public zjm()V
    .locals 1

    .line 1
    sget-object v0, Lcom/bytedance/sdk/component/ivm/uef/oa/moa;->uef:Lcom/bytedance/sdk/component/ivm/uef/oa/moa;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/bytedance/sdk/component/ivm/uef/oa/moa;->yo()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
