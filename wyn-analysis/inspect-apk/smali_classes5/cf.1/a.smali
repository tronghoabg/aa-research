.class public final Lcf/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LJe/b;
.implements LLe/d;


# instance fields
.field public final a:LHe/j;

.field public final b:Lcf/b;

.field public c:Z

.field public d:Z

.field public e:LE4/n;

.field public f:Z

.field public volatile g:Z

.field public h:J


# direct methods
.method public constructor <init>(LHe/j;Lcf/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcf/a;->a:LHe/j;

    .line 5
    .line 6
    iput-object p2, p0, Lcf/a;->b:Lcf/b;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    .line 1
    :cond_0
    :goto_0
    iget-boolean v0, p0, Lcf/a;->g:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    return-void

    .line 6
    :cond_1
    monitor-enter p0

    .line 7
    :try_start_0
    iget-object v0, p0, Lcf/a;->e:LE4/n;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    if-nez v0, :cond_2

    .line 11
    .line 12
    iput-boolean v1, p0, Lcf/a;->d:Z

    .line 13
    .line 14
    monitor-exit p0

    .line 15
    return-void

    .line 16
    :catchall_0
    move-exception v0

    .line 17
    goto :goto_4

    .line 18
    :cond_2
    const/4 v2, 0x0

    .line 19
    iput-object v2, p0, Lcf/a;->e:LE4/n;

    .line 20
    .line 21
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    iget-object v0, v0, LE4/n;->c:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, [Ljava/lang/Object;

    .line 25
    .line 26
    :goto_1
    if-eqz v0, :cond_0

    .line 27
    .line 28
    move v2, v1

    .line 29
    :goto_2
    const/4 v3, 0x4

    .line 30
    if-ge v2, v3, :cond_5

    .line 31
    .line 32
    aget-object v4, v0, v2

    .line 33
    .line 34
    if-nez v4, :cond_3

    .line 35
    .line 36
    goto :goto_3

    .line 37
    :cond_3
    invoke-virtual {p0, v4}, Lcf/a;->test(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-eqz v3, :cond_4

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_4
    add-int/lit8 v2, v2, 0x1

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_5
    :goto_3
    aget-object v0, v0, v3

    .line 48
    .line 49
    check-cast v0, [Ljava/lang/Object;

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :goto_4
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 53
    throw v0
.end method

.method public final b(JLjava/lang/Object;)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcf/a;->g:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-boolean v0, p0, Lcf/a;->f:Z

    .line 7
    .line 8
    if-nez v0, :cond_6

    .line 9
    .line 10
    monitor-enter p0

    .line 11
    :try_start_0
    iget-boolean v0, p0, Lcf/a;->g:Z

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    monitor-exit p0

    .line 16
    return-void

    .line 17
    :catchall_0
    move-exception p1

    .line 18
    goto :goto_0

    .line 19
    :cond_1
    iget-wide v0, p0, Lcf/a;->h:J

    .line 20
    .line 21
    cmp-long p1, v0, p1

    .line 22
    .line 23
    if-nez p1, :cond_2

    .line 24
    .line 25
    monitor-exit p0

    .line 26
    return-void

    .line 27
    :cond_2
    iget-boolean p1, p0, Lcf/a;->d:Z

    .line 28
    .line 29
    const/4 p2, 0x1

    .line 30
    if-eqz p1, :cond_5

    .line 31
    .line 32
    iget-object p1, p0, Lcf/a;->e:LE4/n;

    .line 33
    .line 34
    if-nez p1, :cond_3

    .line 35
    .line 36
    new-instance p1, LE4/n;

    .line 37
    .line 38
    const/16 v0, 0x9

    .line 39
    .line 40
    const/4 v1, 0x0

    .line 41
    invoke-direct {p1, v0, v1}, LE4/n;-><init>(IC)V

    .line 42
    .line 43
    .line 44
    iput-object p1, p0, Lcf/a;->e:LE4/n;

    .line 45
    .line 46
    :cond_3
    iget v0, p1, LE4/n;->b:I

    .line 47
    .line 48
    const/4 v1, 0x4

    .line 49
    if-ne v0, v1, :cond_4

    .line 50
    .line 51
    const/4 v0, 0x5

    .line 52
    new-array v0, v0, [Ljava/lang/Object;

    .line 53
    .line 54
    iget-object v2, p1, LE4/n;->d:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v2, [Ljava/lang/Object;

    .line 57
    .line 58
    aput-object v0, v2, v1

    .line 59
    .line 60
    iput-object v0, p1, LE4/n;->d:Ljava/lang/Object;

    .line 61
    .line 62
    const/4 v0, 0x0

    .line 63
    :cond_4
    iget-object v1, p1, LE4/n;->d:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v1, [Ljava/lang/Object;

    .line 66
    .line 67
    aput-object p3, v1, v0

    .line 68
    .line 69
    add-int/2addr v0, p2

    .line 70
    iput v0, p1, LE4/n;->b:I

    .line 71
    .line 72
    monitor-exit p0

    .line 73
    return-void

    .line 74
    :cond_5
    iput-boolean p2, p0, Lcf/a;->c:Z

    .line 75
    .line 76
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 77
    iput-boolean p2, p0, Lcf/a;->f:Z

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 81
    throw p1

    .line 82
    :cond_6
    :goto_1
    invoke-virtual {p0, p3}, Lcf/a;->test(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    return-void
.end method

.method public final dispose()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcf/a;->g:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lcf/a;->g:Z

    .line 7
    .line 8
    iget-object v0, p0, Lcf/a;->b:Lcf/b;

    .line 9
    .line 10
    invoke-virtual {v0, p0}, Lcf/b;->e(Lcf/a;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public final test(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcf/a;->g:Z

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    iget-object v0, p0, Lcf/a;->a:LHe/j;

    .line 6
    .line 7
    sget-object v1, LZe/f;->a:LZe/f;

    .line 8
    .line 9
    if-ne p1, v1, :cond_0

    .line 10
    .line 11
    invoke-interface {v0}, LHe/j;->onComplete()V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    instance-of v1, p1, LZe/e;

    .line 16
    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    check-cast p1, LZe/e;

    .line 20
    .line 21
    iget-object p1, p1, LZe/e;->a:Ljava/lang/Throwable;

    .line 22
    .line 23
    invoke-interface {v0, p1}, LHe/j;->onError(Ljava/lang/Throwable;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    invoke-interface {v0, p1}, LHe/j;->b(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    const/4 p1, 0x0

    .line 31
    return p1

    .line 32
    :cond_2
    :goto_0
    const/4 p1, 0x1

    .line 33
    return p1
.end method
