.class public final Lcom/moloco/sdk/acm/db/MetricsDb_Impl;
.super Lcom/moloco/sdk/acm/db/MetricsDb;
.source "SourceFile"


# instance fields
.field public volatile o:Lcom/moloco/sdk/acm/db/e;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/moloco/sdk/acm/db/MetricsDb;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final d()Lk3/h;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v2, Ljava/util/HashMap;

    .line 8
    .line 9
    invoke-direct {v2, v1}, Ljava/util/HashMap;-><init>(I)V

    .line 10
    .line 11
    .line 12
    new-instance v1, Lk3/h;

    .line 13
    .line 14
    const-string v3, "events"

    .line 15
    .line 16
    filled-new-array {v3}, [Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    invoke-direct {v1, p0, v0, v2, v3}, Lk3/h;-><init>(Lk3/m;Ljava/util/HashMap;Ljava/util/HashMap;[Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-object v1
.end method

.method public final e(Lk3/c;)Lo3/d;
    .locals 6

    .line 1
    new-instance v3, LN2/j;

    .line 2
    .line 3
    new-instance v0, LK3/o;

    .line 4
    .line 5
    invoke-direct {v0, p0}, LK3/o;-><init>(Lcom/moloco/sdk/acm/db/MetricsDb_Impl;)V

    .line 6
    .line 7
    .line 8
    const-string v1, "b1f78eccdc6d7153084e9120766fe56b"

    .line 9
    .line 10
    const-string v2, "82d5e07fb1fc98c9c5bfa339c0f04693"

    .line 11
    .line 12
    invoke-direct {v3, p1, v0, v1, v2}, LN2/j;-><init>(Lk3/c;LH5/a;Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iget-object v1, p1, Lk3/c;->a:Landroid/content/Context;

    .line 16
    .line 17
    new-instance v0, Lo3/b;

    .line 18
    .line 19
    const/4 v4, 0x0

    .line 20
    const/4 v5, 0x0

    .line 21
    iget-object v2, p1, Lk3/c;->b:Ljava/lang/String;

    .line 22
    .line 23
    invoke-direct/range {v0 .. v5}, Lo3/b;-><init>(Landroid/content/Context;Ljava/lang/String;LN2/j;ZZ)V

    .line 24
    .line 25
    .line 26
    iget-object p1, p1, Lk3/c;->c:Lo3/c;

    .line 27
    .line 28
    invoke-interface {p1, v0}, Lo3/c;->c(Lo3/b;)Lo3/d;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    return-object p1
.end method

.method public final f(Ljava/util/LinkedHashMap;)Ljava/util/List;
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    new-array p1, p1, [Ll3/a;

    .line 3
    .line 4
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    return-object p1
.end method

.method public final h()Ljava/util/Set;
    .locals 1

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final i()Ljava/util/Map;
    .locals 3

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 7
    .line 8
    const-class v2, Lcom/moloco/sdk/acm/db/e;

    .line 9
    .line 10
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public final p()Lcom/moloco/sdk/acm/db/e;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/moloco/sdk/acm/db/MetricsDb_Impl;->o:Lcom/moloco/sdk/acm/db/e;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/moloco/sdk/acm/db/MetricsDb_Impl;->o:Lcom/moloco/sdk/acm/db/e;

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    monitor-enter p0

    .line 9
    :try_start_0
    iget-object v0, p0, Lcom/moloco/sdk/acm/db/MetricsDb_Impl;->o:Lcom/moloco/sdk/acm/db/e;

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    new-instance v0, Lcom/moloco/sdk/acm/db/e;

    .line 14
    .line 15
    invoke-direct {v0, p0}, Lcom/moloco/sdk/acm/db/e;-><init>(Lcom/moloco/sdk/acm/db/MetricsDb_Impl;)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lcom/moloco/sdk/acm/db/MetricsDb_Impl;->o:Lcom/moloco/sdk/acm/db/e;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception v0

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/moloco/sdk/acm/db/MetricsDb_Impl;->o:Lcom/moloco/sdk/acm/db/e;

    .line 24
    .line 25
    monitor-exit p0

    .line 26
    return-object v0

    .line 27
    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    throw v0
.end method
