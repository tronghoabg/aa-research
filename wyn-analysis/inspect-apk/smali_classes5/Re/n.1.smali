.class public final LRe/n;
.super LXe/a;
.source "SourceFile"


# instance fields
.field public final f:LF5/d;

.field public final g:Lya/b;

.field public final h:Lx9/d;

.field public final i:Lx9/d;


# direct methods
.method public constructor <init>(LOe/a;LF5/d;Lya/b;Lx9/d;Lx9/d;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LXe/a;-><init>(LOe/a;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, LRe/n;->f:LF5/d;

    .line 5
    .line 6
    iput-object p3, p0, LRe/n;->g:Lya/b;

    .line 7
    .line 8
    iput-object p4, p0, LRe/n;->h:Lx9/d;

    .line 9
    .line 10
    iput-object p5, p0, LRe/n;->i:Lx9/d;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, LXe/a;->d:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget v0, p0, LXe/a;->e:I

    .line 7
    .line 8
    iget-object v1, p0, LXe/a;->a:LOe/a;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    invoke-interface {v1, p1}, LHe/f;->b(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_1
    :try_start_0
    iget-object v0, p0, LRe/n;->f:LF5/d;

    .line 18
    .line 19
    invoke-virtual {v0, p1}, LF5/d;->accept(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    .line 22
    invoke-interface {v1, p1}, LHe/f;->b(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :catchall_0
    move-exception p1

    .line 27
    invoke-virtual {p0, p1}, LXe/a;->a(Ljava/lang/Throwable;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final d(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    iget-boolean v0, p0, LXe/a;->d:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    :try_start_0
    iget-object v0, p0, LRe/n;->f:LF5/d;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, LF5/d;->accept(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, LXe/a;->a:LOe/a;

    .line 13
    .line 14
    invoke-interface {v0, p1}, LOe/a;->d(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    return p1

    .line 19
    :catchall_0
    move-exception p1

    .line 20
    invoke-virtual {p0, p1}, LXe/a;->a(Ljava/lang/Throwable;)V

    .line 21
    .line 22
    .line 23
    return v1
.end method

.method public final onComplete()V
    .locals 1

    .line 1
    iget-boolean v0, p0, LXe/a;->d:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    :try_start_0
    iget-object v0, p0, LRe/n;->h:Lx9/d;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    iput-boolean v0, p0, LXe/a;->d:Z

    .line 13
    .line 14
    iget-object v0, p0, LXe/a;->a:LOe/a;

    .line 15
    .line 16
    invoke-interface {v0}, LHe/f;->onComplete()V

    .line 17
    .line 18
    .line 19
    :try_start_1
    iget-object v0, p0, LRe/n;->i:Lx9/d;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :catchall_0
    move-exception v0

    .line 26
    invoke-static {v0}, Lp7/b;->U(Ljava/lang/Throwable;)V

    .line 27
    .line 28
    .line 29
    invoke-static {v0}, LS3/f;->A(Ljava/lang/Throwable;)V

    .line 30
    .line 31
    .line 32
    :goto_0
    return-void

    .line 33
    :catchall_1
    move-exception v0

    .line 34
    invoke-virtual {p0, v0}, LXe/a;->a(Ljava/lang/Throwable;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public final onError(Ljava/lang/Throwable;)V
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    iget-object v1, p0, LXe/a;->a:LOe/a;

    .line 3
    .line 4
    iget-boolean v2, p0, LXe/a;->d:Z

    .line 5
    .line 6
    if-eqz v2, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, LS3/f;->A(Ljava/lang/Throwable;)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    iput-boolean v0, p0, LXe/a;->d:Z

    .line 13
    .line 14
    :try_start_0
    iget-object v2, p0, LRe/n;->g:Lya/b;

    .line 15
    .line 16
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    .line 19
    invoke-interface {v1, p1}, LHe/f;->onError(Ljava/lang/Throwable;)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception v2

    .line 24
    invoke-static {v2}, Lp7/b;->U(Ljava/lang/Throwable;)V

    .line 25
    .line 26
    .line 27
    new-instance v3, LKe/b;

    .line 28
    .line 29
    const/4 v4, 0x2

    .line 30
    new-array v4, v4, [Ljava/lang/Throwable;

    .line 31
    .line 32
    const/4 v5, 0x0

    .line 33
    aput-object p1, v4, v5

    .line 34
    .line 35
    aput-object v2, v4, v0

    .line 36
    .line 37
    invoke-direct {v3, v4}, LKe/b;-><init>([Ljava/lang/Throwable;)V

    .line 38
    .line 39
    .line 40
    invoke-interface {v1, v3}, LHe/f;->onError(Ljava/lang/Throwable;)V

    .line 41
    .line 42
    .line 43
    :goto_0
    :try_start_1
    iget-object p1, p0, LRe/n;->i:Lx9/d;

    .line 44
    .line 45
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 46
    .line 47
    .line 48
    goto :goto_1

    .line 49
    :catchall_1
    move-exception p1

    .line 50
    invoke-static {p1}, Lp7/b;->U(Ljava/lang/Throwable;)V

    .line 51
    .line 52
    .line 53
    invoke-static {p1}, LS3/f;->A(Ljava/lang/Throwable;)V

    .line 54
    .line 55
    .line 56
    :goto_1
    return-void
.end method

.method public final poll()Ljava/lang/Object;
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x2

    .line 3
    const/4 v2, 0x1

    .line 4
    iget-object v3, p0, LRe/n;->g:Lya/b;

    .line 5
    .line 6
    :try_start_0
    iget-object v4, p0, LXe/a;->c:LOe/e;

    .line 7
    .line 8
    invoke-interface {v4}, LOe/h;->poll()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 12
    iget-object v5, p0, LRe/n;->i:Lx9/d;

    .line 13
    .line 14
    if-eqz v4, :cond_1

    .line 15
    .line 16
    :try_start_1
    iget-object v6, p0, LRe/n;->f:LF5/d;

    .line 17
    .line 18
    invoke-virtual {v6, v4}, LF5/d;->accept(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 19
    .line 20
    .line 21
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    return-object v4

    .line 25
    :catchall_0
    move-exception v4

    .line 26
    :try_start_2
    invoke-static {v4}, Lp7/b;->U(Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 27
    .line 28
    .line 29
    :try_start_3
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 30
    .line 31
    .line 32
    :try_start_4
    sget-object v0, LZe/d;->a:LZe/c;

    .line 33
    .line 34
    instance-of v0, v4, Ljava/lang/Exception;

    .line 35
    .line 36
    if-eqz v0, :cond_0

    .line 37
    .line 38
    check-cast v4, Ljava/lang/Exception;

    .line 39
    .line 40
    throw v4

    .line 41
    :catchall_1
    move-exception v0

    .line 42
    goto :goto_0

    .line 43
    :cond_0
    throw v4

    .line 44
    :catchall_2
    move-exception v3

    .line 45
    new-instance v6, LKe/b;

    .line 46
    .line 47
    new-array v1, v1, [Ljava/lang/Throwable;

    .line 48
    .line 49
    aput-object v4, v1, v0

    .line 50
    .line 51
    aput-object v3, v1, v2

    .line 52
    .line 53
    invoke-direct {v6, v1}, LKe/b;-><init>([Ljava/lang/Throwable;)V

    .line 54
    .line 55
    .line 56
    throw v6
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 57
    :goto_0
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    throw v0

    .line 61
    :cond_1
    iget v0, p0, LXe/a;->e:I

    .line 62
    .line 63
    if-ne v0, v2, :cond_2

    .line 64
    .line 65
    iget-object v0, p0, LRe/n;->h:Lx9/d;

    .line 66
    .line 67
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    :cond_2
    return-object v4

    .line 74
    :catchall_3
    move-exception v4

    .line 75
    invoke-static {v4}, Lp7/b;->U(Ljava/lang/Throwable;)V

    .line 76
    .line 77
    .line 78
    :try_start_5
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 79
    .line 80
    .line 81
    sget-object v0, LZe/d;->a:LZe/c;

    .line 82
    .line 83
    instance-of v0, v4, Ljava/lang/Exception;

    .line 84
    .line 85
    if-eqz v0, :cond_3

    .line 86
    .line 87
    check-cast v4, Ljava/lang/Exception;

    .line 88
    .line 89
    throw v4

    .line 90
    :cond_3
    throw v4

    .line 91
    :catchall_4
    move-exception v3

    .line 92
    new-instance v5, LKe/b;

    .line 93
    .line 94
    new-array v1, v1, [Ljava/lang/Throwable;

    .line 95
    .line 96
    aput-object v4, v1, v0

    .line 97
    .line 98
    aput-object v3, v1, v2

    .line 99
    .line 100
    invoke-direct {v5, v1}, LKe/b;-><init>([Ljava/lang/Throwable;)V

    .line 101
    .line 102
    .line 103
    throw v5
.end method
