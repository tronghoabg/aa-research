.class public final Ly1/d;
.super Ltg/b;
.source "SourceFile"


# instance fields
.field public final synthetic g:LN8/b;


# direct methods
.method public constructor <init>(LN8/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ly1/d;->g:LN8/b;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final J(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ly1/d;->g:LN8/b;

    .line 2
    .line 3
    iget-object v0, v0, LN8/b;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Ly1/g;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Ly1/g;->d(Ljava/lang/Throwable;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final K(LVa/X7;)V
    .locals 5

    .line 1
    iget-object v0, p0, Ly1/d;->g:LN8/b;

    .line 2
    .line 3
    iput-object p1, v0, LN8/b;->c:Ljava/lang/Object;

    .line 4
    .line 5
    new-instance p1, Lba/a;

    .line 6
    .line 7
    iget-object v1, v0, LN8/b;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, LVa/X7;

    .line 10
    .line 11
    new-instance v2, Lad/r;

    .line 12
    .line 13
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iget-object v3, v0, LN8/b;->a:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v3, Ly1/g;

    .line 19
    .line 20
    iget-object v3, v3, Ly1/g;->h:Ly1/c;

    .line 21
    .line 22
    const/16 v4, 0x1c

    .line 23
    .line 24
    invoke-direct {p1, v1, v2, v3, v4}, Lba/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 25
    .line 26
    .line 27
    iput-object p1, v0, LN8/b;->b:Ljava/lang/Object;

    .line 28
    .line 29
    iget-object p1, v0, LN8/b;->a:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast p1, Ly1/g;

    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    new-instance v0, Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 39
    .line 40
    .line 41
    iget-object v1, p1, Ly1/g;->a:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 48
    .line 49
    .line 50
    const/4 v1, 0x1

    .line 51
    :try_start_0
    iput v1, p1, Ly1/g;->c:I

    .line 52
    .line 53
    iget-object v1, p1, Ly1/g;->b:Lx/f;

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 56
    .line 57
    .line 58
    iget-object v1, p1, Ly1/g;->b:Lx/f;

    .line 59
    .line 60
    invoke-virtual {v1}, Lx/f;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 61
    .line 62
    .line 63
    iget-object v1, p1, Ly1/g;->a:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 64
    .line 65
    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 70
    .line 71
    .line 72
    iget-object v1, p1, Ly1/g;->d:Landroid/os/Handler;

    .line 73
    .line 74
    new-instance v2, LR3/c;

    .line 75
    .line 76
    iget p1, p1, Ly1/g;->c:I

    .line 77
    .line 78
    const/4 v3, 0x0

    .line 79
    invoke-direct {v2, v0, p1, v3}, LR3/c;-><init>(Ljava/util/List;ILjava/lang/Throwable;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 83
    .line 84
    .line 85
    return-void

    .line 86
    :catchall_0
    move-exception v0

    .line 87
    iget-object p1, p1, Ly1/g;->a:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 88
    .line 89
    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 94
    .line 95
    .line 96
    throw v0
.end method
