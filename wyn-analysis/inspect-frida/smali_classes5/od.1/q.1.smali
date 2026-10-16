.class public final Lod/q;
.super Lmd/f;
.source "SourceFile"


# static fields
.field public static final q:Ljava/util/logging/Logger;

.field public static final r:D


# instance fields
.field public final a:LF6/r;

.field public final b:LXd/c;

.field public final c:Ljava/util/concurrent/Executor;

.field public final d:Z

.field public final e:LVa/X7;

.field public final f:Lmd/q;

.field public volatile g:Ljava/util/concurrent/ScheduledFuture;

.field public final h:Z

.field public i:Lmd/c;

.field public j:Lod/r;

.field public volatile k:Z

.field public l:Z

.field public m:Z

.field public final n:Ld7/j;

.field public final o:Ljava/util/concurrent/ScheduledExecutorService;

.field public p:Lmd/t;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const-class v0, Lod/q;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Lod/q;->q:Ljava/util/logging/Logger;

    .line 12
    .line 13
    const-string v0, "US-ASCII"

    .line 14
    .line 15
    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const-string v1, "gzip"

    .line 20
    .line 21
    invoke-virtual {v1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 22
    .line 23
    .line 24
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 25
    .line 26
    const-wide/16 v1, 0x1

    .line 27
    .line 28
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    .line 29
    .line 30
    .line 31
    move-result-wide v0

    .line 32
    long-to-double v0, v0

    .line 33
    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    .line 34
    .line 35
    mul-double/2addr v0, v2

    .line 36
    sput-wide v0, Lod/q;->r:D

    .line 37
    .line 38
    return-void
.end method

.method public constructor <init>(LF6/r;Ljava/util/concurrent/Executor;Lmd/c;Ld7/j;Ljava/util/concurrent/ScheduledExecutorService;LVa/X7;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lmd/t;->d:Lmd/t;

    .line 5
    .line 6
    iput-object v0, p0, Lod/q;->p:Lmd/t;

    .line 7
    .line 8
    sget-object v0, Lmd/l;->b:Lmd/l;

    .line 9
    .line 10
    iput-object p1, p0, Lod/q;->a:LF6/r;

    .line 11
    .line 12
    iget-object v0, p1, LF6/r;->c:Ljava/lang/Object;

    .line 13
    .line 14
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 15
    .line 16
    .line 17
    sget-object v0, LXd/b;->a:LXd/a;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    sget-object v0, LXd/a;->a:LXd/c;

    .line 23
    .line 24
    iput-object v0, p0, Lod/q;->b:LXd/c;

    .line 25
    .line 26
    sget-object v0, Lp8/n;->a:Lp8/n;

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    const/4 v2, 0x1

    .line 30
    if-ne p2, v0, :cond_0

    .line 31
    .line 32
    new-instance p2, Lod/M1;

    .line 33
    .line 34
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object p2, p0, Lod/q;->c:Ljava/util/concurrent/Executor;

    .line 38
    .line 39
    iput-boolean v2, p0, Lod/q;->d:Z

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    new-instance v0, Lod/P1;

    .line 43
    .line 44
    invoke-direct {v0, p2}, Lod/P1;-><init>(Ljava/util/concurrent/Executor;)V

    .line 45
    .line 46
    .line 47
    iput-object v0, p0, Lod/q;->c:Ljava/util/concurrent/Executor;

    .line 48
    .line 49
    iput-boolean v1, p0, Lod/q;->d:Z

    .line 50
    .line 51
    :goto_0
    iput-object p6, p0, Lod/q;->e:LVa/X7;

    .line 52
    .line 53
    invoke-static {}, Lmd/q;->b()Lmd/q;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    iput-object p2, p0, Lod/q;->f:Lmd/q;

    .line 58
    .line 59
    sget-object p2, Lmd/c0;->a:Lmd/c0;

    .line 60
    .line 61
    iget-object p1, p1, LF6/r;->e:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast p1, Lmd/c0;

    .line 64
    .line 65
    if-eq p1, p2, :cond_1

    .line 66
    .line 67
    sget-object p2, Lmd/c0;->b:Lmd/c0;

    .line 68
    .line 69
    if-ne p1, p2, :cond_2

    .line 70
    .line 71
    :cond_1
    move v1, v2

    .line 72
    :cond_2
    iput-boolean v1, p0, Lod/q;->h:Z

    .line 73
    .line 74
    iput-object p3, p0, Lod/q;->i:Lmd/c;

    .line 75
    .line 76
    iput-object p4, p0, Lod/q;->n:Ld7/j;

    .line 77
    .line 78
    iput-object p5, p0, Lod/q;->o:Ljava/util/concurrent/ScheduledExecutorService;

    .line 79
    .line 80
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    invoke-static {}, LXd/b;->c()V

    .line 2
    .line 3
    .line 4
    :try_start_0
    invoke-static {}, LXd/b;->a()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1, p2}, Lod/q;->f(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    .line 9
    .line 10
    sget-object p1, LXd/b;->a:LXd/a;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :catchall_0
    move-exception p1

    .line 17
    :try_start_1
    sget-object p2, LXd/b;->a:LXd/a;

    .line 18
    .line 19
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catchall_1
    move-exception p2

    .line 24
    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    throw p1
.end method

.method public final b()V
    .locals 3

    .line 1
    invoke-static {}, LXd/b;->c()V

    .line 2
    .line 3
    .line 4
    :try_start_0
    invoke-static {}, LXd/b;->a()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lod/q;->j:Lod/r;

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    move v0, v1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    :goto_0
    const-string v2, "Not started"

    .line 16
    .line 17
    invoke-static {v2, v0}, LFe/e;->w(Ljava/lang/String;Z)V

    .line 18
    .line 19
    .line 20
    iget-boolean v0, p0, Lod/q;->l:Z

    .line 21
    .line 22
    xor-int/2addr v0, v1

    .line 23
    const-string v2, "call was cancelled"

    .line 24
    .line 25
    invoke-static {v2, v0}, LFe/e;->w(Ljava/lang/String;Z)V

    .line 26
    .line 27
    .line 28
    iget-boolean v0, p0, Lod/q;->m:Z

    .line 29
    .line 30
    xor-int/2addr v0, v1

    .line 31
    const-string v2, "call already half-closed"

    .line 32
    .line 33
    invoke-static {v2, v0}, LFe/e;->w(Ljava/lang/String;Z)V

    .line 34
    .line 35
    .line 36
    iput-boolean v1, p0, Lod/q;->m:Z

    .line 37
    .line 38
    iget-object v0, p0, Lod/q;->j:Lod/r;

    .line 39
    .line 40
    invoke-interface {v0}, Lod/r;->j()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    .line 42
    .line 43
    sget-object v0, LXd/b;->a:LXd/a;

    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :catchall_0
    move-exception v0

    .line 50
    :try_start_1
    sget-object v1, LXd/b;->a:LXd/a;

    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 53
    .line 54
    .line 55
    goto :goto_1

    .line 56
    :catchall_1
    move-exception v1

    .line 57
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 58
    .line 59
    .line 60
    :goto_1
    throw v0
.end method

.method public final c(I)V
    .locals 4

    .line 1
    invoke-static {}, LXd/b;->c()V

    .line 2
    .line 3
    .line 4
    :try_start_0
    invoke-static {}, LXd/b;->a()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lod/q;->j:Lod/r;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    const/4 v2, 0x1

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    move v0, v2

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move v0, v1

    .line 16
    :goto_0
    const-string v3, "Not started"

    .line 17
    .line 18
    invoke-static {v3, v0}, LFe/e;->w(Ljava/lang/String;Z)V

    .line 19
    .line 20
    .line 21
    if-ltz p1, :cond_1

    .line 22
    .line 23
    move v1, v2

    .line 24
    :cond_1
    const-string v0, "Number requested must be non-negative"

    .line 25
    .line 26
    invoke-static {v0, v1}, LFe/e;->p(Ljava/lang/String;Z)V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Lod/q;->j:Lod/r;

    .line 30
    .line 31
    invoke-interface {v0, p1}, Lod/X1;->d(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    .line 33
    .line 34
    sget-object p1, LXd/b;->a:LXd/a;

    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :catchall_0
    move-exception p1

    .line 41
    :try_start_1
    sget-object v0, LXd/b;->a:LXd/a;

    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 44
    .line 45
    .line 46
    goto :goto_1

    .line 47
    :catchall_1
    move-exception v0

    .line 48
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 49
    .line 50
    .line 51
    :goto_1
    throw p1
.end method

.method public final d(Ljava/lang/Object;)V
    .locals 1

    .line 1
    invoke-static {}, LXd/b;->c()V

    .line 2
    .line 3
    .line 4
    :try_start_0
    invoke-static {}, LXd/b;->a()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lod/q;->h(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    .line 9
    .line 10
    sget-object p1, LXd/b;->a:LXd/a;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :catchall_0
    move-exception p1

    .line 17
    :try_start_1
    sget-object v0, LXd/b;->a:LXd/a;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catchall_1
    move-exception v0

    .line 24
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    throw p1
.end method

.method public final e(Lmd/e;Lmd/b0;)V
    .locals 0

    .line 1
    invoke-static {}, LXd/b;->c()V

    .line 2
    .line 3
    .line 4
    :try_start_0
    invoke-static {}, LXd/b;->a()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1, p2}, Lod/q;->i(Lmd/e;Lmd/b0;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    .line 9
    .line 10
    sget-object p1, LXd/b;->a:LXd/a;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :catchall_0
    move-exception p1

    .line 17
    :try_start_1
    sget-object p2, LXd/b;->a:LXd/a;

    .line 18
    .line 19
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catchall_1
    move-exception p2

    .line 24
    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    throw p1
.end method

.method public final f(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    new-instance p2, Ljava/util/concurrent/CancellationException;

    .line 6
    .line 7
    const-string v0, "Cancelled without a message or cause"

    .line 8
    .line 9
    invoke-direct {p2, v0}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    sget-object v0, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    .line 13
    .line 14
    const-string v1, "Cancelling without a message or cause is suboptimal"

    .line 15
    .line 16
    sget-object v2, Lod/q;->q:Ljava/util/logging/Logger;

    .line 17
    .line 18
    invoke-virtual {v2, v0, v1, p2}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    iget-boolean v0, p0, Lod/q;->l:Z

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    return-void

    .line 26
    :cond_1
    const/4 v0, 0x1

    .line 27
    iput-boolean v0, p0, Lod/q;->l:Z

    .line 28
    .line 29
    :try_start_0
    iget-object v0, p0, Lod/q;->j:Lod/r;

    .line 30
    .line 31
    if-eqz v0, :cond_4

    .line 32
    .line 33
    sget-object v0, Lmd/k0;->f:Lmd/k0;

    .line 34
    .line 35
    if-eqz p1, :cond_2

    .line 36
    .line 37
    invoke-virtual {v0, p1}, Lmd/k0;->h(Ljava/lang/String;)Lmd/k0;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    goto :goto_0

    .line 42
    :catchall_0
    move-exception p1

    .line 43
    goto :goto_1

    .line 44
    :cond_2
    const-string p1, "Call cancelled without message"

    .line 45
    .line 46
    invoke-virtual {v0, p1}, Lmd/k0;->h(Ljava/lang/String;)Lmd/k0;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    :goto_0
    if-eqz p2, :cond_3

    .line 51
    .line 52
    invoke-virtual {p1, p2}, Lmd/k0;->g(Ljava/lang/Throwable;)Lmd/k0;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    :cond_3
    iget-object p2, p0, Lod/q;->j:Lod/r;

    .line 57
    .line 58
    invoke-interface {p2, p1}, Lod/r;->g(Lmd/k0;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    .line 60
    .line 61
    :cond_4
    invoke-virtual {p0}, Lod/q;->g()V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :goto_1
    invoke-virtual {p0}, Lod/q;->g()V

    .line 66
    .line 67
    .line 68
    throw p1
.end method

.method public final g()V
    .locals 2

    .line 1
    iget-object v0, p0, Lod/q;->f:Lmd/q;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lod/q;->g:Ljava/util/concurrent/ScheduledFuture;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-interface {v0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public final h(Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lod/q;->j:Lod/r;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    move v0, v1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    const-string v2, "Not started"

    .line 10
    .line 11
    invoke-static {v2, v0}, LFe/e;->w(Ljava/lang/String;Z)V

    .line 12
    .line 13
    .line 14
    iget-boolean v0, p0, Lod/q;->l:Z

    .line 15
    .line 16
    xor-int/2addr v0, v1

    .line 17
    const-string v2, "call was cancelled"

    .line 18
    .line 19
    invoke-static {v2, v0}, LFe/e;->w(Ljava/lang/String;Z)V

    .line 20
    .line 21
    .line 22
    iget-boolean v0, p0, Lod/q;->m:Z

    .line 23
    .line 24
    xor-int/2addr v0, v1

    .line 25
    const-string v1, "call was half-closed"

    .line 26
    .line 27
    invoke-static {v1, v0}, LFe/e;->w(Ljava/lang/String;Z)V

    .line 28
    .line 29
    .line 30
    :try_start_0
    iget-object v0, p0, Lod/q;->j:Lod/r;

    .line 31
    .line 32
    instance-of v1, v0, Lod/B0;

    .line 33
    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    check-cast v0, Lod/B0;

    .line 37
    .line 38
    invoke-virtual {v0, p1}, Lod/B0;->v(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :catch_0
    move-exception p1

    .line 43
    goto :goto_2

    .line 44
    :catch_1
    move-exception p1

    .line 45
    goto :goto_3

    .line 46
    :cond_1
    iget-object v1, p0, Lod/q;->a:LF6/r;

    .line 47
    .line 48
    invoke-virtual {v1, p1}, LF6/r;->f(Ljava/lang/Object;)Ltd/a;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-interface {v0, p1}, Lod/X1;->c(Ltd/a;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0

    .line 53
    .line 54
    .line 55
    :goto_1
    iget-boolean p1, p0, Lod/q;->h:Z

    .line 56
    .line 57
    if-nez p1, :cond_2

    .line 58
    .line 59
    iget-object p1, p0, Lod/q;->j:Lod/r;

    .line 60
    .line 61
    invoke-interface {p1}, Lod/X1;->flush()V

    .line 62
    .line 63
    .line 64
    :cond_2
    return-void

    .line 65
    :goto_2
    iget-object v0, p0, Lod/q;->j:Lod/r;

    .line 66
    .line 67
    sget-object v1, Lmd/k0;->f:Lmd/k0;

    .line 68
    .line 69
    const-string v2, "Client sendMessage() failed with Error"

    .line 70
    .line 71
    invoke-virtual {v1, v2}, Lmd/k0;->h(Ljava/lang/String;)Lmd/k0;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-interface {v0, v1}, Lod/r;->g(Lmd/k0;)V

    .line 76
    .line 77
    .line 78
    throw p1

    .line 79
    :goto_3
    iget-object v0, p0, Lod/q;->j:Lod/r;

    .line 80
    .line 81
    sget-object v1, Lmd/k0;->f:Lmd/k0;

    .line 82
    .line 83
    invoke-virtual {v1, p1}, Lmd/k0;->g(Ljava/lang/Throwable;)Lmd/k0;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    const-string v1, "Failed to stream message"

    .line 88
    .line 89
    invoke-virtual {p1, v1}, Lmd/k0;->h(Ljava/lang/String;)Lmd/k0;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-interface {v0, p1}, Lod/r;->g(Lmd/k0;)V

    .line 94
    .line 95
    .line 96
    return-void
.end method

.method public final i(Lmd/e;Lmd/b0;)V
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v5, p2

    .line 4
    .line 5
    const/4 v0, 0x3

    .line 6
    iget-object v2, v1, Lod/q;->j:Lod/r;

    .line 7
    .line 8
    const/4 v3, 0x1

    .line 9
    const/4 v4, 0x0

    .line 10
    if-nez v2, :cond_0

    .line 11
    .line 12
    move v2, v3

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move v2, v4

    .line 15
    :goto_0
    const-string v6, "Already started"

    .line 16
    .line 17
    invoke-static {v6, v2}, LFe/e;->w(Ljava/lang/String;Z)V

    .line 18
    .line 19
    .line 20
    iget-boolean v2, v1, Lod/q;->l:Z

    .line 21
    .line 22
    xor-int/2addr v2, v3

    .line 23
    const-string v6, "call was cancelled"

    .line 24
    .line 25
    invoke-static {v6, v2}, LFe/e;->w(Ljava/lang/String;Z)V

    .line 26
    .line 27
    .line 28
    iget-object v2, v1, Lod/q;->f:Lmd/q;

    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    iget-object v2, v1, Lod/q;->i:Lmd/c;

    .line 34
    .line 35
    sget-object v6, Lod/Q0;->g:LB8/e;

    .line 36
    .line 37
    invoke-virtual {v2, v6}, Lmd/c;->a(LB8/e;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    check-cast v2, Lod/Q0;

    .line 42
    .line 43
    const-wide/16 v7, 0x0

    .line 44
    .line 45
    if-nez v2, :cond_1

    .line 46
    .line 47
    goto/16 :goto_9

    .line 48
    .line 49
    :cond_1
    iget-object v9, v2, Lod/Q0;->a:Ljava/lang/Long;

    .line 50
    .line 51
    if-eqz v9, :cond_5

    .line 52
    .line 53
    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    .line 54
    .line 55
    .line 56
    move-result-wide v9

    .line 57
    sget-object v11, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    .line 58
    .line 59
    if-eqz v11, :cond_4

    .line 60
    .line 61
    new-instance v12, Lmd/r;

    .line 62
    .line 63
    invoke-virtual {v11, v9, v10}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    .line 64
    .line 65
    .line 66
    move-result-wide v9

    .line 67
    invoke-direct {v12, v9, v10}, Lmd/r;-><init>(J)V

    .line 68
    .line 69
    .line 70
    iget-object v9, v1, Lod/q;->i:Lmd/c;

    .line 71
    .line 72
    iget-object v10, v9, Lmd/c;->a:Lmd/r;

    .line 73
    .line 74
    if-eqz v10, :cond_3

    .line 75
    .line 76
    iget-object v11, v10, Lmd/r;->a:Lmd/j;

    .line 77
    .line 78
    iget-object v13, v12, Lmd/r;->a:Lmd/j;

    .line 79
    .line 80
    if-ne v13, v11, :cond_2

    .line 81
    .line 82
    iget-wide v13, v12, Lmd/r;->b:J

    .line 83
    .line 84
    iget-wide v10, v10, Lmd/r;->b:J

    .line 85
    .line 86
    sub-long/2addr v13, v10

    .line 87
    cmp-long v10, v13, v7

    .line 88
    .line 89
    if-gez v10, :cond_5

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_2
    new-instance v0, Ljava/lang/AssertionError;

    .line 93
    .line 94
    new-instance v2, Ljava/lang/StringBuilder;

    .line 95
    .line 96
    const-string v3, "Tickers ("

    .line 97
    .line 98
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    const-string v3, " and "

    .line 105
    .line 106
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    iget-object v3, v10, Lmd/r;->a:Lmd/j;

    .line 110
    .line 111
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    const-string v3, ") don\'t match. Custom Ticker should only be used in tests!"

    .line 115
    .line 116
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    invoke-direct {v0, v2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    throw v0

    .line 127
    :cond_3
    :goto_1
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    invoke-static {v9}, Lmd/c;->b(Lmd/c;)LR8/a;

    .line 131
    .line 132
    .line 133
    move-result-object v9

    .line 134
    iput-object v12, v9, LR8/a;->a:Ljava/lang/Object;

    .line 135
    .line 136
    new-instance v10, Lmd/c;

    .line 137
    .line 138
    invoke-direct {v10, v9}, Lmd/c;-><init>(LR8/a;)V

    .line 139
    .line 140
    .line 141
    iput-object v10, v1, Lod/q;->i:Lmd/c;

    .line 142
    .line 143
    goto :goto_2

    .line 144
    :cond_4
    sget-object v0, Lmd/r;->d:Lmd/j;

    .line 145
    .line 146
    new-instance v0, Ljava/lang/NullPointerException;

    .line 147
    .line 148
    const-string v2, "units"

    .line 149
    .line 150
    invoke-direct {v0, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    throw v0

    .line 154
    :cond_5
    :goto_2
    iget-object v9, v2, Lod/Q0;->b:Ljava/lang/Boolean;

    .line 155
    .line 156
    if-eqz v9, :cond_7

    .line 157
    .line 158
    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    .line 159
    .line 160
    .line 161
    move-result v9

    .line 162
    if-eqz v9, :cond_6

    .line 163
    .line 164
    iget-object v9, v1, Lod/q;->i:Lmd/c;

    .line 165
    .line 166
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 167
    .line 168
    .line 169
    invoke-static {v9}, Lmd/c;->b(Lmd/c;)LR8/a;

    .line 170
    .line 171
    .line 172
    move-result-object v9

    .line 173
    sget-object v10, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 174
    .line 175
    iput-object v10, v9, LR8/a;->f:Ljava/lang/Object;

    .line 176
    .line 177
    new-instance v10, Lmd/c;

    .line 178
    .line 179
    invoke-direct {v10, v9}, Lmd/c;-><init>(LR8/a;)V

    .line 180
    .line 181
    .line 182
    goto :goto_3

    .line 183
    :cond_6
    iget-object v9, v1, Lod/q;->i:Lmd/c;

    .line 184
    .line 185
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    invoke-static {v9}, Lmd/c;->b(Lmd/c;)LR8/a;

    .line 189
    .line 190
    .line 191
    move-result-object v9

    .line 192
    sget-object v10, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 193
    .line 194
    iput-object v10, v9, LR8/a;->f:Ljava/lang/Object;

    .line 195
    .line 196
    new-instance v10, Lmd/c;

    .line 197
    .line 198
    invoke-direct {v10, v9}, Lmd/c;-><init>(LR8/a;)V

    .line 199
    .line 200
    .line 201
    :goto_3
    iput-object v10, v1, Lod/q;->i:Lmd/c;

    .line 202
    .line 203
    :cond_7
    iget-object v9, v2, Lod/Q0;->c:Ljava/lang/Integer;

    .line 204
    .line 205
    const-string v10, "invalid maxsize %s"

    .line 206
    .line 207
    if-eqz v9, :cond_b

    .line 208
    .line 209
    iget-object v11, v1, Lod/q;->i:Lmd/c;

    .line 210
    .line 211
    iget-object v12, v11, Lmd/c;->g:Ljava/lang/Integer;

    .line 212
    .line 213
    if-eqz v12, :cond_9

    .line 214
    .line 215
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    .line 216
    .line 217
    .line 218
    move-result v12

    .line 219
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 220
    .line 221
    .line 222
    move-result v9

    .line 223
    invoke-static {v12, v9}, Ljava/lang/Math;->min(II)I

    .line 224
    .line 225
    .line 226
    move-result v9

    .line 227
    if-ltz v9, :cond_8

    .line 228
    .line 229
    move v12, v3

    .line 230
    goto :goto_4

    .line 231
    :cond_8
    move v12, v4

    .line 232
    :goto_4
    invoke-static {v9, v10, v12}, LFe/e;->n(ILjava/lang/String;Z)V

    .line 233
    .line 234
    .line 235
    invoke-static {v11}, Lmd/c;->b(Lmd/c;)LR8/a;

    .line 236
    .line 237
    .line 238
    move-result-object v11

    .line 239
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 240
    .line 241
    .line 242
    move-result-object v9

    .line 243
    iput-object v9, v11, LR8/a;->g:Ljava/lang/Object;

    .line 244
    .line 245
    new-instance v9, Lmd/c;

    .line 246
    .line 247
    invoke-direct {v9, v11}, Lmd/c;-><init>(LR8/a;)V

    .line 248
    .line 249
    .line 250
    iput-object v9, v1, Lod/q;->i:Lmd/c;

    .line 251
    .line 252
    goto :goto_6

    .line 253
    :cond_9
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 254
    .line 255
    .line 256
    move-result v12

    .line 257
    if-ltz v12, :cond_a

    .line 258
    .line 259
    move v13, v3

    .line 260
    goto :goto_5

    .line 261
    :cond_a
    move v13, v4

    .line 262
    :goto_5
    invoke-static {v12, v10, v13}, LFe/e;->n(ILjava/lang/String;Z)V

    .line 263
    .line 264
    .line 265
    invoke-static {v11}, Lmd/c;->b(Lmd/c;)LR8/a;

    .line 266
    .line 267
    .line 268
    move-result-object v11

    .line 269
    iput-object v9, v11, LR8/a;->g:Ljava/lang/Object;

    .line 270
    .line 271
    new-instance v9, Lmd/c;

    .line 272
    .line 273
    invoke-direct {v9, v11}, Lmd/c;-><init>(LR8/a;)V

    .line 274
    .line 275
    .line 276
    iput-object v9, v1, Lod/q;->i:Lmd/c;

    .line 277
    .line 278
    :cond_b
    :goto_6
    iget-object v2, v2, Lod/Q0;->d:Ljava/lang/Integer;

    .line 279
    .line 280
    if-eqz v2, :cond_f

    .line 281
    .line 282
    iget-object v9, v1, Lod/q;->i:Lmd/c;

    .line 283
    .line 284
    iget-object v11, v9, Lmd/c;->h:Ljava/lang/Integer;

    .line 285
    .line 286
    if-eqz v11, :cond_d

    .line 287
    .line 288
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    .line 289
    .line 290
    .line 291
    move-result v11

    .line 292
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 293
    .line 294
    .line 295
    move-result v2

    .line 296
    invoke-static {v11, v2}, Ljava/lang/Math;->min(II)I

    .line 297
    .line 298
    .line 299
    move-result v2

    .line 300
    if-ltz v2, :cond_c

    .line 301
    .line 302
    move v11, v3

    .line 303
    goto :goto_7

    .line 304
    :cond_c
    move v11, v4

    .line 305
    :goto_7
    invoke-static {v2, v10, v11}, LFe/e;->n(ILjava/lang/String;Z)V

    .line 306
    .line 307
    .line 308
    invoke-static {v9}, Lmd/c;->b(Lmd/c;)LR8/a;

    .line 309
    .line 310
    .line 311
    move-result-object v9

    .line 312
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 313
    .line 314
    .line 315
    move-result-object v2

    .line 316
    iput-object v2, v9, LR8/a;->h:Ljava/lang/Object;

    .line 317
    .line 318
    new-instance v2, Lmd/c;

    .line 319
    .line 320
    invoke-direct {v2, v9}, Lmd/c;-><init>(LR8/a;)V

    .line 321
    .line 322
    .line 323
    iput-object v2, v1, Lod/q;->i:Lmd/c;

    .line 324
    .line 325
    goto :goto_9

    .line 326
    :cond_d
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 327
    .line 328
    .line 329
    move-result v11

    .line 330
    if-ltz v11, :cond_e

    .line 331
    .line 332
    move v12, v3

    .line 333
    goto :goto_8

    .line 334
    :cond_e
    move v12, v4

    .line 335
    :goto_8
    invoke-static {v11, v10, v12}, LFe/e;->n(ILjava/lang/String;Z)V

    .line 336
    .line 337
    .line 338
    invoke-static {v9}, Lmd/c;->b(Lmd/c;)LR8/a;

    .line 339
    .line 340
    .line 341
    move-result-object v9

    .line 342
    iput-object v2, v9, LR8/a;->h:Ljava/lang/Object;

    .line 343
    .line 344
    new-instance v2, Lmd/c;

    .line 345
    .line 346
    invoke-direct {v2, v9}, Lmd/c;-><init>(LR8/a;)V

    .line 347
    .line 348
    .line 349
    iput-object v2, v1, Lod/q;->i:Lmd/c;

    .line 350
    .line 351
    :cond_f
    :goto_9
    iget-object v2, v1, Lod/q;->i:Lmd/c;

    .line 352
    .line 353
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 354
    .line 355
    .line 356
    sget-object v10, Lmd/j;->b:Lmd/j;

    .line 357
    .line 358
    iget-object v2, v1, Lod/q;->p:Lmd/t;

    .line 359
    .line 360
    sget-object v9, Lod/a0;->h:Lmd/W;

    .line 361
    .line 362
    invoke-virtual {v5, v9}, Lmd/b0;->a(Lmd/Y;)V

    .line 363
    .line 364
    .line 365
    sget-object v9, Lod/a0;->d:Lmd/W;

    .line 366
    .line 367
    invoke-virtual {v5, v9}, Lmd/b0;->a(Lmd/Y;)V

    .line 368
    .line 369
    .line 370
    sget-object v9, Lod/a0;->e:Lmd/Z;

    .line 371
    .line 372
    invoke-virtual {v5, v9}, Lmd/b0;->a(Lmd/Y;)V

    .line 373
    .line 374
    .line 375
    iget-object v2, v2, Lmd/t;->b:[B

    .line 376
    .line 377
    array-length v11, v2

    .line 378
    if-eqz v11, :cond_10

    .line 379
    .line 380
    invoke-virtual {v5, v9, v2}, Lmd/b0;->f(Lmd/Y;Ljava/lang/Object;)V

    .line 381
    .line 382
    .line 383
    :cond_10
    sget-object v2, Lod/a0;->f:Lmd/W;

    .line 384
    .line 385
    invoke-virtual {v5, v2}, Lmd/b0;->a(Lmd/Y;)V

    .line 386
    .line 387
    .line 388
    sget-object v2, Lod/a0;->g:Lmd/Z;

    .line 389
    .line 390
    invoke-virtual {v5, v2}, Lmd/b0;->a(Lmd/Y;)V

    .line 391
    .line 392
    .line 393
    iget-object v2, v1, Lod/q;->i:Lmd/c;

    .line 394
    .line 395
    iget-object v2, v2, Lmd/c;->a:Lmd/r;

    .line 396
    .line 397
    iget-object v9, v1, Lod/q;->f:Lmd/q;

    .line 398
    .line 399
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 400
    .line 401
    .line 402
    const/4 v11, 0x0

    .line 403
    if-nez v2, :cond_11

    .line 404
    .line 405
    move-object v12, v11

    .line 406
    goto :goto_a

    .line 407
    :cond_11
    move-object v12, v2

    .line 408
    :goto_a
    if-eqz v12, :cond_14

    .line 409
    .line 410
    invoke-virtual {v12}, Lmd/r;->a()Z

    .line 411
    .line 412
    .line 413
    move-result v2

    .line 414
    if-eqz v2, :cond_14

    .line 415
    .line 416
    iget-object v2, v1, Lod/q;->i:Lmd/c;

    .line 417
    .line 418
    invoke-static {v2, v5, v4, v4}, Lod/a0;->c(Lmd/c;Lmd/b0;IZ)[Lmd/i;

    .line 419
    .line 420
    .line 421
    move-result-object v2

    .line 422
    iget-object v5, v1, Lod/q;->i:Lmd/c;

    .line 423
    .line 424
    iget-object v5, v5, Lmd/c;->a:Lmd/r;

    .line 425
    .line 426
    iget-object v6, v1, Lod/q;->f:Lmd/q;

    .line 427
    .line 428
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 429
    .line 430
    .line 431
    if-nez v5, :cond_12

    .line 432
    .line 433
    const-string v5, "Context"

    .line 434
    .line 435
    goto :goto_b

    .line 436
    :cond_12
    const-string v5, "CallOptions"

    .line 437
    .line 438
    :goto_b
    iget-object v6, v1, Lod/q;->i:Lmd/c;

    .line 439
    .line 440
    sget-object v7, Lmd/i;->a:LB8/e;

    .line 441
    .line 442
    invoke-virtual {v6, v7}, Lmd/c;->a(LB8/e;)Ljava/lang/Object;

    .line 443
    .line 444
    .line 445
    move-result-object v6

    .line 446
    check-cast v6, Ljava/lang/Long;

    .line 447
    .line 448
    sget-object v7, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    .line 449
    .line 450
    invoke-virtual {v12}, Lmd/r;->b()J

    .line 451
    .line 452
    .line 453
    move-result-wide v7

    .line 454
    long-to-double v7, v7

    .line 455
    sget-wide v13, Lod/q;->r:D

    .line 456
    .line 457
    div-double/2addr v7, v13

    .line 458
    invoke-static {v7, v8}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 459
    .line 460
    .line 461
    move-result-object v7

    .line 462
    if-nez v6, :cond_13

    .line 463
    .line 464
    const-wide/16 v8, 0x0

    .line 465
    .line 466
    goto :goto_c

    .line 467
    :cond_13
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    .line 468
    .line 469
    .line 470
    move-result-wide v8

    .line 471
    long-to-double v8, v8

    .line 472
    div-double/2addr v8, v13

    .line 473
    :goto_c
    invoke-static {v8, v9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 474
    .line 475
    .line 476
    move-result-object v6

    .line 477
    new-array v8, v0, [Ljava/lang/Object;

    .line 478
    .line 479
    aput-object v5, v8, v4

    .line 480
    .line 481
    aput-object v7, v8, v3

    .line 482
    .line 483
    const/4 v3, 0x2

    .line 484
    aput-object v6, v8, v3

    .line 485
    .line 486
    const-string v3, "ClientCall started after %s deadline was exceeded %.9f seconds ago. Name resolution delay %.9f seconds."

    .line 487
    .line 488
    invoke-static {v3, v8}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 489
    .line 490
    .line 491
    move-result-object v3

    .line 492
    new-instance v4, Lod/S;

    .line 493
    .line 494
    sget-object v5, Lmd/k0;->h:Lmd/k0;

    .line 495
    .line 496
    invoke-virtual {v5, v3}, Lmd/k0;->h(Ljava/lang/String;)Lmd/k0;

    .line 497
    .line 498
    .line 499
    move-result-object v3

    .line 500
    sget-object v5, Lod/s;->a:Lod/s;

    .line 501
    .line 502
    invoke-direct {v4, v3, v5, v2}, Lod/S;-><init>(Lmd/k0;Lod/s;[Lmd/i;)V

    .line 503
    .line 504
    .line 505
    iput-object v4, v1, Lod/q;->j:Lod/r;

    .line 506
    .line 507
    goto/16 :goto_13

    .line 508
    .line 509
    :cond_14
    iget-object v2, v1, Lod/q;->f:Lmd/q;

    .line 510
    .line 511
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 512
    .line 513
    .line 514
    iget-object v2, v1, Lod/q;->i:Lmd/c;

    .line 515
    .line 516
    iget-object v2, v2, Lmd/c;->a:Lmd/r;

    .line 517
    .line 518
    sget-object v3, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    .line 519
    .line 520
    sget-object v9, Lod/q;->q:Ljava/util/logging/Logger;

    .line 521
    .line 522
    invoke-virtual {v9, v3}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    .line 523
    .line 524
    .line 525
    move-result v3

    .line 526
    if-eqz v3, :cond_17

    .line 527
    .line 528
    if-eqz v12, :cond_17

    .line 529
    .line 530
    invoke-virtual {v12, v11}, Lmd/r;->equals(Ljava/lang/Object;)Z

    .line 531
    .line 532
    .line 533
    move-result v3

    .line 534
    if-nez v3, :cond_15

    .line 535
    .line 536
    goto :goto_e

    .line 537
    :cond_15
    sget-object v3, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    .line 538
    .line 539
    invoke-virtual {v12}, Lmd/r;->b()J

    .line 540
    .line 541
    .line 542
    move-result-wide v13

    .line 543
    invoke-static {v7, v8, v13, v14}, Ljava/lang/Math;->max(JJ)J

    .line 544
    .line 545
    .line 546
    move-result-wide v7

    .line 547
    new-instance v3, Ljava/lang/StringBuilder;

    .line 548
    .line 549
    sget-object v13, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 550
    .line 551
    const-string v13, "Call timeout set to \'"

    .line 552
    .line 553
    const-string v14, "\' ns, due to context deadline."

    .line 554
    .line 555
    invoke-static {v7, v8, v13, v14}, Lcb/a;->h(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 556
    .line 557
    .line 558
    move-result-object v7

    .line 559
    invoke-direct {v3, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 560
    .line 561
    .line 562
    if-nez v2, :cond_16

    .line 563
    .line 564
    const-string v2, " Explicit call timeout was not set."

    .line 565
    .line 566
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 567
    .line 568
    .line 569
    goto :goto_d

    .line 570
    :cond_16
    invoke-virtual {v2}, Lmd/r;->b()J

    .line 571
    .line 572
    .line 573
    move-result-wide v7

    .line 574
    new-instance v2, Ljava/lang/StringBuilder;

    .line 575
    .line 576
    const-string v13, " Explicit call timeout was \'"

    .line 577
    .line 578
    invoke-direct {v2, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 579
    .line 580
    .line 581
    invoke-virtual {v2, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 582
    .line 583
    .line 584
    const-string v7, "\' ns."

    .line 585
    .line 586
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 587
    .line 588
    .line 589
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 590
    .line 591
    .line 592
    move-result-object v2

    .line 593
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 594
    .line 595
    .line 596
    :goto_d
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 597
    .line 598
    .line 599
    move-result-object v2

    .line 600
    invoke-virtual {v9, v2}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 601
    .line 602
    .line 603
    :cond_17
    :goto_e
    iget-object v3, v1, Lod/q;->n:Ld7/j;

    .line 604
    .line 605
    iget-object v2, v1, Lod/q;->a:LF6/r;

    .line 606
    .line 607
    iget-object v7, v1, Lod/q;->i:Lmd/c;

    .line 608
    .line 609
    iget-object v9, v1, Lod/q;->f:Lmd/q;

    .line 610
    .line 611
    iget-object v8, v3, Ld7/j;->a:Ljava/lang/Object;

    .line 612
    .line 613
    check-cast v8, Lod/M0;

    .line 614
    .line 615
    iget-boolean v8, v8, Lod/M0;->X:Z

    .line 616
    .line 617
    if-nez v8, :cond_18

    .line 618
    .line 619
    new-instance v6, Lod/n1;

    .line 620
    .line 621
    invoke-direct {v6, v2, v5, v7}, Lod/n1;-><init>(LF6/r;Lmd/b0;Lmd/c;)V

    .line 622
    .line 623
    .line 624
    invoke-virtual {v3, v6}, Ld7/j;->c(Lod/n1;)Lod/u;

    .line 625
    .line 626
    .line 627
    move-result-object v3

    .line 628
    invoke-virtual {v9}, Lmd/q;->a()Lmd/q;

    .line 629
    .line 630
    .line 631
    move-result-object v6

    .line 632
    invoke-static {v7, v5, v4, v4}, Lod/a0;->c(Lmd/c;Lmd/b0;IZ)[Lmd/i;

    .line 633
    .line 634
    .line 635
    move-result-object v4

    .line 636
    :try_start_0
    invoke-interface {v3, v2, v5, v7, v4}, Lod/u;->c(LF6/r;Lmd/b0;Lmd/c;[Lmd/i;)Lod/r;

    .line 637
    .line 638
    .line 639
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 640
    invoke-virtual {v9, v6}, Lmd/q;->c(Lmd/q;)V

    .line 641
    .line 642
    .line 643
    goto :goto_12

    .line 644
    :catchall_0
    move-exception v0

    .line 645
    invoke-virtual {v9, v6}, Lmd/q;->c(Lmd/q;)V

    .line 646
    .line 647
    .line 648
    throw v0

    .line 649
    :cond_18
    invoke-virtual {v7, v6}, Lmd/c;->a(LB8/e;)Ljava/lang/Object;

    .line 650
    .line 651
    .line 652
    move-result-object v4

    .line 653
    check-cast v4, Lod/Q0;

    .line 654
    .line 655
    if-nez v4, :cond_19

    .line 656
    .line 657
    move-object v6, v11

    .line 658
    goto :goto_f

    .line 659
    :cond_19
    iget-object v6, v4, Lod/Q0;->e:Lod/I1;

    .line 660
    .line 661
    :goto_f
    if-nez v4, :cond_1a

    .line 662
    .line 663
    move-object v8, v11

    .line 664
    :goto_10
    move-object v4, v2

    .line 665
    goto :goto_11

    .line 666
    :cond_1a
    iget-object v4, v4, Lod/Q0;->f:Lod/c0;

    .line 667
    .line 668
    move-object v8, v4

    .line 669
    goto :goto_10

    .line 670
    :goto_11
    new-instance v2, Lod/B0;

    .line 671
    .line 672
    move-object v15, v7

    .line 673
    move-object v7, v6

    .line 674
    move-object v6, v15

    .line 675
    invoke-direct/range {v2 .. v9}, Lod/B0;-><init>(Ld7/j;LF6/r;Lmd/b0;Lmd/c;Lod/I1;Lod/c0;Lmd/q;)V

    .line 676
    .line 677
    .line 678
    :goto_12
    iput-object v2, v1, Lod/q;->j:Lod/r;

    .line 679
    .line 680
    :goto_13
    iget-boolean v2, v1, Lod/q;->d:Z

    .line 681
    .line 682
    if-eqz v2, :cond_1b

    .line 683
    .line 684
    iget-object v2, v1, Lod/q;->j:Lod/r;

    .line 685
    .line 686
    invoke-interface {v2}, Lod/X1;->h()V

    .line 687
    .line 688
    .line 689
    :cond_1b
    iget-object v2, v1, Lod/q;->i:Lmd/c;

    .line 690
    .line 691
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 692
    .line 693
    .line 694
    iget-object v2, v1, Lod/q;->i:Lmd/c;

    .line 695
    .line 696
    iget-object v2, v2, Lmd/c;->g:Ljava/lang/Integer;

    .line 697
    .line 698
    if-eqz v2, :cond_1c

    .line 699
    .line 700
    iget-object v3, v1, Lod/q;->j:Lod/r;

    .line 701
    .line 702
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 703
    .line 704
    .line 705
    move-result v2

    .line 706
    invoke-interface {v3, v2}, Lod/r;->e(I)V

    .line 707
    .line 708
    .line 709
    :cond_1c
    iget-object v2, v1, Lod/q;->i:Lmd/c;

    .line 710
    .line 711
    iget-object v2, v2, Lmd/c;->h:Ljava/lang/Integer;

    .line 712
    .line 713
    if-eqz v2, :cond_1d

    .line 714
    .line 715
    iget-object v3, v1, Lod/q;->j:Lod/r;

    .line 716
    .line 717
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 718
    .line 719
    .line 720
    move-result v2

    .line 721
    invoke-interface {v3, v2}, Lod/r;->b(I)V

    .line 722
    .line 723
    .line 724
    :cond_1d
    if-eqz v12, :cond_1e

    .line 725
    .line 726
    iget-object v2, v1, Lod/q;->j:Lod/r;

    .line 727
    .line 728
    invoke-interface {v2, v12}, Lod/r;->f(Lmd/r;)V

    .line 729
    .line 730
    .line 731
    :cond_1e
    iget-object v2, v1, Lod/q;->j:Lod/r;

    .line 732
    .line 733
    invoke-interface {v2, v10}, Lod/X1;->a(Lmd/k;)V

    .line 734
    .line 735
    .line 736
    iget-object v2, v1, Lod/q;->j:Lod/r;

    .line 737
    .line 738
    iget-object v3, v1, Lod/q;->p:Lmd/t;

    .line 739
    .line 740
    invoke-interface {v2, v3}, Lod/r;->l(Lmd/t;)V

    .line 741
    .line 742
    .line 743
    iget-object v2, v1, Lod/q;->e:LVa/X7;

    .line 744
    .line 745
    iget-object v3, v2, LVa/X7;->b:Ljava/lang/Object;

    .line 746
    .line 747
    check-cast v3, Lod/w0;

    .line 748
    .line 749
    invoke-interface {v3}, Lod/w0;->a()V

    .line 750
    .line 751
    .line 752
    iget-object v2, v2, LVa/X7;->a:Ljava/lang/Object;

    .line 753
    .line 754
    check-cast v2, Lod/Y1;

    .line 755
    .line 756
    invoke-virtual {v2}, Lod/Y1;->d()J

    .line 757
    .line 758
    .line 759
    iget-object v2, v1, Lod/q;->j:Lod/r;

    .line 760
    .line 761
    new-instance v3, Lme/a;

    .line 762
    .line 763
    move-object/from16 v4, p1

    .line 764
    .line 765
    invoke-direct {v3, v1, v4}, Lme/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 766
    .line 767
    .line 768
    invoke-interface {v2, v3}, Lod/r;->k(Lod/t;)V

    .line 769
    .line 770
    .line 771
    iget-object v2, v1, Lod/q;->f:Lmd/q;

    .line 772
    .line 773
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 774
    .line 775
    .line 776
    sget-object v2, Lmd/q;->a:Ljava/util/logging/Logger;

    .line 777
    .line 778
    if-eqz v12, :cond_1f

    .line 779
    .line 780
    iget-object v2, v1, Lod/q;->f:Lmd/q;

    .line 781
    .line 782
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 783
    .line 784
    .line 785
    invoke-virtual {v12, v11}, Lmd/r;->equals(Ljava/lang/Object;)Z

    .line 786
    .line 787
    .line 788
    move-result v2

    .line 789
    if-nez v2, :cond_1f

    .line 790
    .line 791
    iget-object v2, v1, Lod/q;->o:Ljava/util/concurrent/ScheduledExecutorService;

    .line 792
    .line 793
    if-eqz v2, :cond_1f

    .line 794
    .line 795
    sget-object v2, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    .line 796
    .line 797
    invoke-virtual {v12}, Lmd/r;->b()J

    .line 798
    .line 799
    .line 800
    move-result-wide v3

    .line 801
    new-instance v5, Lod/v0;

    .line 802
    .line 803
    new-instance v6, LA7/A;

    .line 804
    .line 805
    invoke-direct {v6, v1, v3, v4, v0}, LA7/A;-><init>(Ljava/lang/Object;JI)V

    .line 806
    .line 807
    .line 808
    invoke-direct {v5, v6}, Lod/v0;-><init>(Ljava/lang/Runnable;)V

    .line 809
    .line 810
    .line 811
    iget-object v0, v1, Lod/q;->o:Ljava/util/concurrent/ScheduledExecutorService;

    .line 812
    .line 813
    invoke-interface {v0, v5, v3, v4, v2}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 814
    .line 815
    .line 816
    move-result-object v0

    .line 817
    iput-object v0, v1, Lod/q;->g:Ljava/util/concurrent/ScheduledFuture;

    .line 818
    .line 819
    :cond_1f
    iget-boolean v0, v1, Lod/q;->k:Z

    .line 820
    .line 821
    if-eqz v0, :cond_20

    .line 822
    .line 823
    invoke-virtual {v1}, Lod/q;->g()V

    .line 824
    .line 825
    .line 826
    :cond_20
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    invoke-static {p0}, LBa/c;->S(Ljava/lang/Object;)LA7/b0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "method"

    .line 6
    .line 7
    iget-object v2, p0, Lod/q;->a:LF6/r;

    .line 8
    .line 9
    invoke-virtual {v0, v2, v1}, LA7/b0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, LA7/b0;->toString()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    return-object v0
.end method
