.class public final LRe/K;
.super LRe/I;
.source "SourceFile"


# instance fields
.field public final m:LHe/f;


# direct methods
.method public constructor <init>(LHe/f;LHe/l;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p2, p3}, LRe/I;-><init>(LHe/l;I)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LRe/K;->m:LHe/f;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final e(Lug/b;)V
    .locals 3

    .line 1
    iget-object v0, p0, LRe/I;->e:Lug/b;

    .line 2
    .line 3
    invoke-static {v0, p1}, LYe/f;->d(Lug/b;Lug/b;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    iput-object p1, p0, LRe/I;->e:Lug/b;

    .line 10
    .line 11
    instance-of v0, p1, LOe/e;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    move-object v0, p1

    .line 16
    check-cast v0, LOe/e;

    .line 17
    .line 18
    const/4 v1, 0x7

    .line 19
    invoke-interface {v0, v1}, LOe/d;->c(I)I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    const/4 v2, 0x1

    .line 24
    if-ne v1, v2, :cond_0

    .line 25
    .line 26
    iput v2, p0, LRe/I;->j:I

    .line 27
    .line 28
    iput-object v0, p0, LRe/I;->f:LOe/h;

    .line 29
    .line 30
    iput-boolean v2, p0, LRe/I;->h:Z

    .line 31
    .line 32
    iget-object p1, p0, LRe/K;->m:LHe/f;

    .line 33
    .line 34
    invoke-interface {p1, p0}, LHe/f;->e(Lug/b;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_0
    const/4 v2, 0x2

    .line 39
    if-ne v1, v2, :cond_1

    .line 40
    .line 41
    iput v2, p0, LRe/I;->j:I

    .line 42
    .line 43
    iput-object v0, p0, LRe/I;->f:LOe/h;

    .line 44
    .line 45
    iget-object v0, p0, LRe/K;->m:LHe/f;

    .line 46
    .line 47
    invoke-interface {v0, p0}, LHe/f;->e(Lug/b;)V

    .line 48
    .line 49
    .line 50
    iget v0, p0, LRe/I;->b:I

    .line 51
    .line 52
    int-to-long v0, v0

    .line 53
    invoke-interface {p1, v0, v1}, Lug/b;->request(J)V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :cond_1
    new-instance v0, LVe/a;

    .line 58
    .line 59
    iget v1, p0, LRe/I;->b:I

    .line 60
    .line 61
    invoke-direct {v0, v1}, LVe/a;-><init>(I)V

    .line 62
    .line 63
    .line 64
    iput-object v0, p0, LRe/I;->f:LOe/h;

    .line 65
    .line 66
    iget-object v0, p0, LRe/K;->m:LHe/f;

    .line 67
    .line 68
    invoke-interface {v0, p0}, LHe/f;->e(Lug/b;)V

    .line 69
    .line 70
    .line 71
    iget v0, p0, LRe/I;->b:I

    .line 72
    .line 73
    int-to-long v0, v0

    .line 74
    invoke-interface {p1, v0, v1}, Lug/b;->request(J)V

    .line 75
    .line 76
    .line 77
    :cond_2
    return-void
.end method

.method public final g()V
    .locals 12

    .line 1
    iget-object v0, p0, LRe/K;->m:LHe/f;

    .line 2
    .line 3
    iget-object v1, p0, LRe/I;->f:LOe/h;

    .line 4
    .line 5
    iget-wide v2, p0, LRe/I;->k:J

    .line 6
    .line 7
    const/4 v4, 0x1

    .line 8
    move v5, v4

    .line 9
    :cond_0
    :goto_0
    iget-object v6, p0, LRe/I;->d:Ljava/util/concurrent/atomic/AtomicLong;

    .line 10
    .line 11
    invoke-virtual {v6}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 12
    .line 13
    .line 14
    move-result-wide v6

    .line 15
    :cond_1
    :goto_1
    cmp-long v8, v2, v6

    .line 16
    .line 17
    if-eqz v8, :cond_6

    .line 18
    .line 19
    iget-boolean v9, p0, LRe/I;->h:Z

    .line 20
    .line 21
    :try_start_0
    invoke-interface {v1}, LOe/h;->poll()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v10
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    if-nez v10, :cond_2

    .line 26
    .line 27
    move v11, v4

    .line 28
    goto :goto_2

    .line 29
    :cond_2
    const/4 v11, 0x0

    .line 30
    :goto_2
    invoke-virtual {p0, v9, v11, v0}, LRe/I;->f(ZZLHe/f;)Z

    .line 31
    .line 32
    .line 33
    move-result v9

    .line 34
    if-eqz v9, :cond_3

    .line 35
    .line 36
    goto :goto_4

    .line 37
    :cond_3
    if-eqz v11, :cond_4

    .line 38
    .line 39
    goto :goto_3

    .line 40
    :cond_4
    invoke-interface {v0, v10}, LHe/f;->b(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    const-wide/16 v8, 0x1

    .line 44
    .line 45
    add-long/2addr v2, v8

    .line 46
    iget v8, p0, LRe/I;->c:I

    .line 47
    .line 48
    int-to-long v8, v8

    .line 49
    cmp-long v8, v2, v8

    .line 50
    .line 51
    if-nez v8, :cond_1

    .line 52
    .line 53
    const-wide v8, 0x7fffffffffffffffL

    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    cmp-long v8, v6, v8

    .line 59
    .line 60
    if-eqz v8, :cond_5

    .line 61
    .line 62
    iget-object v6, p0, LRe/I;->d:Ljava/util/concurrent/atomic/AtomicLong;

    .line 63
    .line 64
    neg-long v7, v2

    .line 65
    invoke-virtual {v6, v7, v8}, Ljava/util/concurrent/atomic/AtomicLong;->addAndGet(J)J

    .line 66
    .line 67
    .line 68
    move-result-wide v6

    .line 69
    :cond_5
    iget-object v8, p0, LRe/I;->e:Lug/b;

    .line 70
    .line 71
    invoke-interface {v8, v2, v3}, Lug/b;->request(J)V

    .line 72
    .line 73
    .line 74
    const-wide/16 v2, 0x0

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :catchall_0
    move-exception v2

    .line 78
    invoke-static {v2}, Lp7/b;->U(Ljava/lang/Throwable;)V

    .line 79
    .line 80
    .line 81
    iget-object v3, p0, LRe/I;->e:Lug/b;

    .line 82
    .line 83
    invoke-interface {v3}, Lug/b;->cancel()V

    .line 84
    .line 85
    .line 86
    invoke-interface {v1}, LOe/h;->clear()V

    .line 87
    .line 88
    .line 89
    invoke-interface {v0, v2}, LHe/f;->onError(Ljava/lang/Throwable;)V

    .line 90
    .line 91
    .line 92
    iget-object v0, p0, LRe/I;->a:LHe/l;

    .line 93
    .line 94
    invoke-interface {v0}, LJe/b;->dispose()V

    .line 95
    .line 96
    .line 97
    return-void

    .line 98
    :cond_6
    :goto_3
    if-nez v8, :cond_7

    .line 99
    .line 100
    iget-boolean v6, p0, LRe/I;->h:Z

    .line 101
    .line 102
    invoke-interface {v1}, LOe/h;->isEmpty()Z

    .line 103
    .line 104
    .line 105
    move-result v7

    .line 106
    invoke-virtual {p0, v6, v7, v0}, LRe/I;->f(ZZLHe/f;)Z

    .line 107
    .line 108
    .line 109
    move-result v6

    .line 110
    if-eqz v6, :cond_7

    .line 111
    .line 112
    goto :goto_4

    .line 113
    :cond_7
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 114
    .line 115
    .line 116
    move-result v6

    .line 117
    if-ne v5, v6, :cond_8

    .line 118
    .line 119
    iput-wide v2, p0, LRe/I;->k:J

    .line 120
    .line 121
    neg-int v5, v5

    .line 122
    invoke-virtual {p0, v5}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    .line 123
    .line 124
    .line 125
    move-result v5

    .line 126
    if-nez v5, :cond_0

    .line 127
    .line 128
    :goto_4
    return-void

    .line 129
    :cond_8
    move v5, v6

    .line 130
    goto :goto_0
.end method

.method public final h()V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    :cond_0
    iget-boolean v1, p0, LRe/I;->g:Z

    .line 3
    .line 4
    if-eqz v1, :cond_1

    .line 5
    .line 6
    goto :goto_1

    .line 7
    :cond_1
    iget-boolean v1, p0, LRe/I;->h:Z

    .line 8
    .line 9
    iget-object v2, p0, LRe/K;->m:LHe/f;

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    invoke-interface {v2, v3}, LHe/f;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    if-eqz v1, :cond_3

    .line 16
    .line 17
    iget-object v0, p0, LRe/I;->i:Ljava/lang/Throwable;

    .line 18
    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    iget-object v1, p0, LRe/K;->m:LHe/f;

    .line 22
    .line 23
    invoke-interface {v1, v0}, LHe/f;->onError(Ljava/lang/Throwable;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_2
    iget-object v0, p0, LRe/K;->m:LHe/f;

    .line 28
    .line 29
    invoke-interface {v0}, LHe/f;->onComplete()V

    .line 30
    .line 31
    .line 32
    :goto_0
    iget-object v0, p0, LRe/I;->a:LHe/l;

    .line 33
    .line 34
    invoke-interface {v0}, LJe/b;->dispose()V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_3
    neg-int v0, v0

    .line 39
    invoke-virtual {p0, v0}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-nez v0, :cond_0

    .line 44
    .line 45
    :goto_1
    return-void
.end method

.method public final i()V
    .locals 9

    .line 1
    iget-object v0, p0, LRe/K;->m:LHe/f;

    .line 2
    .line 3
    iget-object v1, p0, LRe/I;->f:LOe/h;

    .line 4
    .line 5
    iget-wide v2, p0, LRe/I;->k:J

    .line 6
    .line 7
    const/4 v4, 0x1

    .line 8
    :cond_0
    :goto_0
    iget-object v5, p0, LRe/I;->d:Ljava/util/concurrent/atomic/AtomicLong;

    .line 9
    .line 10
    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 11
    .line 12
    .line 13
    move-result-wide v5

    .line 14
    :goto_1
    cmp-long v7, v2, v5

    .line 15
    .line 16
    if-eqz v7, :cond_3

    .line 17
    .line 18
    :try_start_0
    invoke-interface {v1}, LOe/h;->poll()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    iget-boolean v8, p0, LRe/I;->g:Z

    .line 23
    .line 24
    if-eqz v8, :cond_1

    .line 25
    .line 26
    goto :goto_2

    .line 27
    :cond_1
    if-nez v7, :cond_2

    .line 28
    .line 29
    invoke-interface {v0}, LHe/f;->onComplete()V

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, LRe/I;->a:LHe/l;

    .line 33
    .line 34
    invoke-interface {v0}, LJe/b;->dispose()V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_2
    invoke-interface {v0, v7}, LHe/f;->b(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    const-wide/16 v7, 0x1

    .line 42
    .line 43
    add-long/2addr v2, v7

    .line 44
    goto :goto_1

    .line 45
    :catchall_0
    move-exception v1

    .line 46
    invoke-static {v1}, Lp7/b;->U(Ljava/lang/Throwable;)V

    .line 47
    .line 48
    .line 49
    iget-object v2, p0, LRe/I;->e:Lug/b;

    .line 50
    .line 51
    invoke-interface {v2}, Lug/b;->cancel()V

    .line 52
    .line 53
    .line 54
    invoke-interface {v0, v1}, LHe/f;->onError(Ljava/lang/Throwable;)V

    .line 55
    .line 56
    .line 57
    iget-object v0, p0, LRe/I;->a:LHe/l;

    .line 58
    .line 59
    invoke-interface {v0}, LJe/b;->dispose()V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :cond_3
    iget-boolean v5, p0, LRe/I;->g:Z

    .line 64
    .line 65
    if-eqz v5, :cond_4

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_4
    invoke-interface {v1}, LOe/h;->isEmpty()Z

    .line 69
    .line 70
    .line 71
    move-result v5

    .line 72
    if-eqz v5, :cond_5

    .line 73
    .line 74
    invoke-interface {v0}, LHe/f;->onComplete()V

    .line 75
    .line 76
    .line 77
    iget-object v0, p0, LRe/I;->a:LHe/l;

    .line 78
    .line 79
    invoke-interface {v0}, LJe/b;->dispose()V

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :cond_5
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 84
    .line 85
    .line 86
    move-result v5

    .line 87
    if-ne v4, v5, :cond_6

    .line 88
    .line 89
    iput-wide v2, p0, LRe/I;->k:J

    .line 90
    .line 91
    neg-int v4, v4

    .line 92
    invoke-virtual {p0, v4}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    .line 93
    .line 94
    .line 95
    move-result v4

    .line 96
    if-nez v4, :cond_0

    .line 97
    .line 98
    :goto_2
    return-void

    .line 99
    :cond_6
    move v4, v5

    .line 100
    goto :goto_0
.end method

.method public final poll()Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object v0, p0, LRe/I;->f:LOe/h;

    .line 2
    .line 3
    invoke-interface {v0}, LOe/h;->poll()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget v1, p0, LRe/I;->j:I

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    if-eq v1, v2, :cond_1

    .line 13
    .line 14
    iget-wide v1, p0, LRe/I;->k:J

    .line 15
    .line 16
    const-wide/16 v3, 0x1

    .line 17
    .line 18
    add-long/2addr v1, v3

    .line 19
    iget v3, p0, LRe/I;->c:I

    .line 20
    .line 21
    int-to-long v3, v3

    .line 22
    cmp-long v3, v1, v3

    .line 23
    .line 24
    if-nez v3, :cond_0

    .line 25
    .line 26
    const-wide/16 v3, 0x0

    .line 27
    .line 28
    iput-wide v3, p0, LRe/I;->k:J

    .line 29
    .line 30
    iget-object v3, p0, LRe/I;->e:Lug/b;

    .line 31
    .line 32
    invoke-interface {v3, v1, v2}, Lug/b;->request(J)V

    .line 33
    .line 34
    .line 35
    return-object v0

    .line 36
    :cond_0
    iput-wide v1, p0, LRe/I;->k:J

    .line 37
    .line 38
    :cond_1
    return-object v0
.end method
