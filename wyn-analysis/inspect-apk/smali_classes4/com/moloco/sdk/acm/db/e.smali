.class public final Lcom/moloco/sdk/acm/db/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lcom/moloco/sdk/acm/db/MetricsDb_Impl;

.field public final b:Lcom/moloco/sdk/acm/db/d;

.field public final c:La9/b;

.field public final d:LS3/h;


# direct methods
.method public constructor <init>(Lcom/moloco/sdk/acm/db/MetricsDb_Impl;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La9/b;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/moloco/sdk/acm/db/e;->c:La9/b;

    .line 10
    .line 11
    iput-object p1, p0, Lcom/moloco/sdk/acm/db/e;->a:Lcom/moloco/sdk/acm/db/MetricsDb_Impl;

    .line 12
    .line 13
    new-instance v0, Lcom/moloco/sdk/acm/db/d;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-direct {v0, p0, p1, v1}, Lcom/moloco/sdk/acm/db/d;-><init>(Lcom/moloco/sdk/acm/db/e;Lcom/moloco/sdk/acm/db/MetricsDb_Impl;I)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lcom/moloco/sdk/acm/db/e;->b:Lcom/moloco/sdk/acm/db/d;

    .line 20
    .line 21
    new-instance v0, Lcom/moloco/sdk/acm/db/d;

    .line 22
    .line 23
    const/4 v1, 0x1

    .line 24
    invoke-direct {v0, p0, p1, v1}, Lcom/moloco/sdk/acm/db/d;-><init>(Lcom/moloco/sdk/acm/db/e;Lcom/moloco/sdk/acm/db/MetricsDb_Impl;I)V

    .line 25
    .line 26
    .line 27
    new-instance v0, LS3/h;

    .line 28
    .line 29
    const/16 v1, 0x11

    .line 30
    .line 31
    invoke-direct {v0, p1, v1}, LS3/h;-><init>(Lk3/m;I)V

    .line 32
    .line 33
    .line 34
    new-instance v0, LS3/h;

    .line 35
    .line 36
    const/16 v1, 0x12

    .line 37
    .line 38
    invoke-direct {v0, p1, v1}, LS3/h;-><init>(Lk3/m;I)V

    .line 39
    .line 40
    .line 41
    iput-object v0, p0, Lcom/moloco/sdk/acm/db/e;->d:LS3/h;

    .line 42
    .line 43
    return-void
.end method


# virtual methods
.method public final a(Lcom/moloco/sdk/acm/db/a;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/moloco/sdk/acm/db/e;->a:Lcom/moloco/sdk/acm/db/MetricsDb_Impl;

    .line 2
    .line 3
    invoke-virtual {v0}, Lk3/m;->b()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Lk3/m;->c()V

    .line 7
    .line 8
    .line 9
    :try_start_0
    iget-object v1, p0, Lcom/moloco/sdk/acm/db/e;->b:Lcom/moloco/sdk/acm/db/d;

    .line 10
    .line 11
    invoke-virtual {v1}, LE9/c;->a()Lo3/g;

    .line 12
    .line 13
    .line 14
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    :try_start_1
    invoke-virtual {v1, v2, p1}, Lcom/moloco/sdk/acm/db/d;->w(Lo3/g;Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    invoke-interface {v2}, Lo3/g;->v()J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 19
    .line 20
    .line 21
    :try_start_2
    invoke-virtual {v1, v2}, LE9/c;->q(Lo3/g;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Lk3/m;->n()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Lk3/m;->j()V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :catchall_0
    move-exception p1

    .line 32
    goto :goto_0

    .line 33
    :catchall_1
    move-exception p1

    .line 34
    :try_start_3
    invoke-virtual {v1, v2}, LE9/c;->q(Lo3/g;)V

    .line 35
    .line 36
    .line 37
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 38
    :goto_0
    invoke-virtual {v0}, Lk3/m;->j()V

    .line 39
    .line 40
    .line 41
    throw p1
.end method
