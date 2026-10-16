.class public final LHf/h0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LEf/U;


# instance fields
.field public final a:LHf/j0;

.field public final b:J

.field public final c:Ljava/lang/Object;

.field public final d:LEf/n;


# direct methods
.method public constructor <init>(LHf/j0;JLjava/lang/Object;LEf/n;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LHf/h0;->a:LHf/j0;

    .line 5
    .line 6
    iput-wide p2, p0, LHf/h0;->b:J

    .line 7
    .line 8
    iput-object p4, p0, LHf/h0;->c:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p5, p0, LHf/h0;->d:LEf/n;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final dispose()V
    .locals 6

    .line 1
    iget-object v0, p0, LHf/h0;->a:LHf/j0;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-wide v1, p0, LHf/h0;->b:J

    .line 5
    .line 6
    invoke-virtual {v0}, LHf/j0;->o()J

    .line 7
    .line 8
    .line 9
    move-result-wide v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    cmp-long v1, v1, v3

    .line 11
    .line 12
    if-gez v1, :cond_0

    .line 13
    .line 14
    monitor-exit v0

    .line 15
    return-void

    .line 16
    :cond_0
    :try_start_1
    iget-object v1, v0, LHf/j0;->h:[Ljava/lang/Object;

    .line 17
    .line 18
    invoke-static {v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    iget-wide v2, p0, LHf/h0;->b:J

    .line 22
    .line 23
    long-to-int v4, v2

    .line 24
    array-length v5, v1

    .line 25
    add-int/lit8 v5, v5, -0x1

    .line 26
    .line 27
    and-int/2addr v4, v5

    .line 28
    aget-object v4, v1, v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 29
    .line 30
    if-eq v4, p0, :cond_1

    .line 31
    .line 32
    monitor-exit v0

    .line 33
    return-void

    .line 34
    :cond_1
    :try_start_2
    sget-object v4, LHf/k0;->a:LH6/g;

    .line 35
    .line 36
    invoke-static {v1, v2, v3, v4}, LHf/k0;->f([Ljava/lang/Object;JLjava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, LHf/j0;->j()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 40
    .line 41
    .line 42
    monitor-exit v0

    .line 43
    return-void

    .line 44
    :catchall_0
    move-exception v1

    .line 45
    monitor-exit v0

    .line 46
    throw v1
.end method
