.class public abstract Lcom/bytedance/sdk/component/xs/oa/yo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field protected bcc:Ljava/lang/String;

.field protected cz:Lcom/bytedance/sdk/openadsdk/sy/moa;

.field private dj:J

.field ivm:I

.field lw:Ljava/lang/String;

.field protected moa:Ljava/lang/String;

.field private oa:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private uef:Ljava/lang/String;

.field protected final xs:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field protected yo:Lcom/bytedance/sdk/component/oa/uef/dj;

.field protected zjm:Z


# direct methods
.method public constructor <init>(Lcom/bytedance/sdk/component/oa/uef/dj;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/bytedance/sdk/component/xs/oa/yo;->moa:Ljava/lang/String;

    .line 6
    .line 7
    new-instance v1, Ljava/util/HashMap;

    .line 8
    .line 9
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v1, p0, Lcom/bytedance/sdk/component/xs/oa/yo;->xs:Ljava/util/Map;

    .line 13
    .line 14
    iput-object v0, p0, Lcom/bytedance/sdk/component/xs/oa/yo;->bcc:Ljava/lang/String;

    .line 15
    .line 16
    iput-object v0, p0, Lcom/bytedance/sdk/component/xs/oa/yo;->uef:Ljava/lang/String;

    .line 17
    .line 18
    const-wide/16 v0, 0x7530

    .line 19
    .line 20
    iput-wide v0, p0, Lcom/bytedance/sdk/component/xs/oa/yo;->dj:J

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    iput-boolean v0, p0, Lcom/bytedance/sdk/component/xs/oa/yo;->zjm:Z

    .line 24
    .line 25
    iput-object p1, p0, Lcom/bytedance/sdk/component/xs/oa/yo;->yo:Lcom/bytedance/sdk/component/oa/uef/dj;

    .line 26
    .line 27
    :try_start_0
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {p0, p1}, Lcom/bytedance/sdk/component/xs/oa/yo;->moa(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :catchall_0
    move-exception p1

    .line 40
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    return-void
.end method


# virtual methods
.method public bcc()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/xs/oa/yo;->cz:Lcom/bytedance/sdk/openadsdk/sy/moa;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/bytedance/sdk/component/xs/oa/yo;->yo:Lcom/bytedance/sdk/component/oa/uef/dj;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/bytedance/sdk/component/oa/uef/dj;->uef()Lcom/bytedance/sdk/component/xs/uef$oa;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    iget-object v0, p0, Lcom/bytedance/sdk/component/xs/oa/yo;->yo:Lcom/bytedance/sdk/component/oa/uef/dj;

    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/bytedance/sdk/component/oa/uef/dj;->uef()Lcom/bytedance/sdk/component/xs/uef$oa;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget-object v1, p0, Lcom/bytedance/sdk/component/xs/oa/yo;->cz:Lcom/bytedance/sdk/openadsdk/sy/moa;

    .line 23
    .line 24
    invoke-interface {v0, v1}, Lcom/bytedance/sdk/component/xs/uef$oa;->oa(Lcom/bytedance/sdk/openadsdk/sy/moa;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    .line 26
    .line 27
    :catchall_0
    :cond_1
    :goto_0
    return-void
.end method

.method public cz()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/xs/oa/yo;->cz:Lcom/bytedance/sdk/openadsdk/sy/moa;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/bytedance/sdk/component/xs/oa/yo;->yo:Lcom/bytedance/sdk/component/oa/uef/dj;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/bytedance/sdk/component/oa/uef/dj;->uef()Lcom/bytedance/sdk/component/xs/uef$oa;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    iget-object v0, p0, Lcom/bytedance/sdk/component/xs/oa/yo;->yo:Lcom/bytedance/sdk/component/oa/uef/dj;

    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/bytedance/sdk/component/oa/uef/dj;->uef()Lcom/bytedance/sdk/component/xs/uef$oa;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget-object v1, p0, Lcom/bytedance/sdk/component/xs/oa/yo;->cz:Lcom/bytedance/sdk/openadsdk/sy/moa;

    .line 23
    .line 24
    invoke-interface {v0, v1}, Lcom/bytedance/sdk/component/xs/uef$oa;->yo(Lcom/bytedance/sdk/openadsdk/sy/moa;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    .line 26
    .line 27
    :catchall_0
    :cond_1
    :goto_0
    return-void
.end method

.method public ivm()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/xs/oa/yo;->bcc:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final lw()Lcom/bytedance/sdk/component/xs/oa;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/bytedance/sdk/component/xs/oa/yo;->xs()V

    .line 2
    .line 3
    .line 4
    :try_start_0
    invoke-virtual {p0}, Lcom/bytedance/sdk/component/xs/oa/yo;->uef()Lcom/bytedance/sdk/component/xs/oa;

    .line 5
    .line 6
    .line 7
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    :try_start_1
    invoke-virtual {v0}, Lcom/bytedance/sdk/component/xs/oa;->ivm()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/bytedance/sdk/component/xs/oa/yo;->bcc()V

    .line 17
    .line 18
    .line 19
    return-object v0

    .line 20
    :cond_0
    invoke-virtual {p0}, Lcom/bytedance/sdk/component/xs/oa/yo;->cz()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 21
    .line 22
    .line 23
    return-object v0

    .line 24
    :catchall_0
    const/4 v0, 0x0

    .line 25
    :catchall_1
    invoke-virtual {p0}, Lcom/bytedance/sdk/component/xs/oa/yo;->cz()V

    .line 26
    .line 27
    .line 28
    return-object v0
.end method

.method public moa()Ljava/lang/String;
    .locals 1

    .line 4
    iget-object v0, p0, Lcom/bytedance/sdk/component/xs/oa/yo;->moa:Ljava/lang/String;

    return-object v0
.end method

.method public moa(Ljava/lang/String;)V
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/bytedance/sdk/component/xs/oa/yo;->moa:Ljava/lang/String;

    return-void
.end method

.method public moa(Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 1
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 2
    iget-object v1, p0, Lcom/bytedance/sdk/component/xs/oa/yo;->xs:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-void
.end method

.method public oa()V
    .locals 5

    .line 3
    iget-object v0, p0, Lcom/bytedance/sdk/component/xs/oa/yo;->moa:Ljava/lang/String;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/bytedance/sdk/component/xs/oa/yo;->yo:Lcom/bytedance/sdk/component/oa/uef/dj;

    if-nez v0, :cond_0

    goto :goto_3

    .line 4
    :cond_0
    invoke-virtual {v0}, Lcom/bytedance/sdk/component/oa/uef/dj;->oa()Lcom/bytedance/sdk/component/oa/uef/moa;

    move-result-object v0

    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    invoke-virtual {v0}, Lcom/bytedance/sdk/component/oa/uef/moa;->yo()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/bytedance/sdk/component/oa/uef/oa;

    .line 7
    iget-object v3, p0, Lcom/bytedance/sdk/component/xs/oa/yo;->moa:Ljava/lang/String;

    invoke-interface {v2}, Lcom/bytedance/sdk/component/oa/uef/oa;->uef()Lcom/bytedance/sdk/component/oa/uef/wrv;

    move-result-object v4

    invoke-virtual {v4}, Lcom/bytedance/sdk/component/oa/uef/wrv;->yo()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 8
    invoke-interface {v2}, Lcom/bytedance/sdk/component/oa/uef/oa;->yo()V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_2

    .line 9
    :cond_2
    invoke-virtual {v0}, Lcom/bytedance/sdk/component/oa/uef/moa;->moa()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_3
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/bytedance/sdk/component/oa/uef/oa;

    .line 10
    iget-object v3, p0, Lcom/bytedance/sdk/component/xs/oa/yo;->moa:Ljava/lang/String;

    invoke-interface {v2}, Lcom/bytedance/sdk/component/oa/uef/oa;->uef()Lcom/bytedance/sdk/component/oa/uef/wrv;

    move-result-object v4

    invoke-virtual {v4}, Lcom/bytedance/sdk/component/oa/uef/wrv;->yo()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 11
    invoke-interface {v2}, Lcom/bytedance/sdk/component/oa/uef/oa;->yo()V

    goto :goto_1

    .line 12
    :cond_4
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :goto_2
    monitor-exit v0

    throw v1

    :cond_5
    :goto_3
    return-void
.end method

.method public oa(Lcom/bytedance/sdk/component/oa/uef/wrv$uef;)V
    .locals 4

    if-nez p1, :cond_0

    goto :goto_1

    .line 16
    :cond_0
    iget-object v0, p0, Lcom/bytedance/sdk/component/xs/oa/yo;->xs:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    if-lez v0, :cond_3

    .line 17
    iget-object v0, p0, Lcom/bytedance/sdk/component/xs/oa/yo;->xs:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 18
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 19
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 20
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-nez v1, :cond_2

    .line 21
    const-string v1, ""

    .line 22
    :cond_2
    invoke-virtual {p1, v2, v1}, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->oa(Ljava/lang/String;Ljava/lang/String;)Lcom/bytedance/sdk/component/oa/uef/wrv$uef;

    goto :goto_0

    :cond_3
    :goto_1
    return-void
.end method

.method public final oa(Lcom/bytedance/sdk/component/xs/uef/uef;)V
    .locals 1

    .line 13
    invoke-virtual {p0}, Lcom/bytedance/sdk/component/xs/oa/yo;->xs()V

    .line 14
    new-instance v0, Lcom/bytedance/sdk/component/xs/oa/yo$1;

    invoke-direct {v0, p0, p1}, Lcom/bytedance/sdk/component/xs/oa/yo$1;-><init>(Lcom/bytedance/sdk/component/xs/oa/yo;Lcom/bytedance/sdk/component/xs/uef/uef;)V

    .line 15
    invoke-virtual {p0, v0}, Lcom/bytedance/sdk/component/xs/oa/yo;->uef(Lcom/bytedance/sdk/component/xs/uef/uef;)V

    return-void
.end method

.method public oa(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/component/xs/oa/yo;->lw:Ljava/lang/String;

    return-void
.end method

.method public oa(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/bytedance/sdk/component/xs/oa/yo;->xs:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public abstract uef()Lcom/bytedance/sdk/component/xs/oa;
.end method

.method public uef(I)V
    .locals 0

    .line 9
    iput p1, p0, Lcom/bytedance/sdk/component/xs/oa/yo;->ivm:I

    return-void
.end method

.method public uef(JLjava/util/concurrent/TimeUnit;)V
    .locals 0

    .line 3
    invoke-virtual {p3, p1, p2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide p1

    iput-wide p1, p0, Lcom/bytedance/sdk/component/xs/oa/yo;->dj:J

    return-void
.end method

.method public uef(Lcom/bytedance/sdk/component/oa/uef/wrv$uef;)V
    .locals 2

    .line 4
    invoke-static {}, Lcom/bytedance/sdk/component/xs/uef;->ivm()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 5
    iget-object v0, p0, Lcom/bytedance/sdk/component/xs/oa/yo;->oa:Ljava/util/List;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 6
    iget-object v0, p0, Lcom/bytedance/sdk/component/xs/oa/yo;->oa:Ljava/util/List;

    invoke-virtual {p1, v0}, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->uef(Ljava/util/List;)Lcom/bytedance/sdk/component/oa/uef/wrv$uef;

    .line 7
    :cond_0
    iget-wide v0, p0, Lcom/bytedance/sdk/component/xs/oa/yo;->dj:J

    invoke-virtual {p1, v0, v1}, Lcom/bytedance/sdk/component/oa/uef/wrv$uef;->uef(J)Lcom/bytedance/sdk/component/oa/uef/wrv$uef;

    :cond_1
    return-void
.end method

.method public abstract uef(Lcom/bytedance/sdk/component/xs/uef/uef;)V
.end method

.method public uef(Lcom/bytedance/sdk/openadsdk/sy/moa;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/component/xs/oa/yo;->cz:Lcom/bytedance/sdk/openadsdk/sy/moa;

    return-void
.end method

.method public uef(Ljava/lang/String;)V
    .locals 0

    .line 8
    iput-object p1, p0, Lcom/bytedance/sdk/component/xs/oa/yo;->uef:Ljava/lang/String;

    return-void
.end method

.method public uef(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 2
    iput-object p1, p0, Lcom/bytedance/sdk/component/xs/oa/yo;->oa:Ljava/util/List;

    return-void
.end method

.method public xs()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/xs/oa/yo;->cz:Lcom/bytedance/sdk/openadsdk/sy/moa;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/bytedance/sdk/component/xs/oa/yo;->yo:Lcom/bytedance/sdk/component/oa/uef/dj;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/bytedance/sdk/component/oa/uef/dj;->uef()Lcom/bytedance/sdk/component/xs/uef$oa;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    iget-object v0, p0, Lcom/bytedance/sdk/component/xs/oa/yo;->yo:Lcom/bytedance/sdk/component/oa/uef/dj;

    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/bytedance/sdk/component/oa/uef/dj;->uef()Lcom/bytedance/sdk/component/xs/uef$oa;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget-object v1, p0, Lcom/bytedance/sdk/component/xs/oa/yo;->cz:Lcom/bytedance/sdk/openadsdk/sy/moa;

    .line 23
    .line 24
    invoke-interface {v0, v1}, Lcom/bytedance/sdk/component/xs/uef$oa;->uef(Lcom/bytedance/sdk/openadsdk/sy/moa;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    .line 26
    .line 27
    :catchall_0
    :cond_1
    :goto_0
    return-void
.end method

.method public yo()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/component/xs/oa/yo;->uef:Ljava/lang/String;

    return-object v0
.end method

.method public yo(Ljava/lang/String;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/bytedance/sdk/component/xs/oa/yo;->bcc:Ljava/lang/String;

    return-void
.end method
