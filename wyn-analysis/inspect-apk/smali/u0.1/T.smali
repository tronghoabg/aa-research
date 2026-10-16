.class public final Lu0/T;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public a:LGf/v;

.field public b:LGf/b;

.field public c:I

.field public final synthetic d:LGf/e;


# direct methods
.method public constructor <init>(LGf/e;Ljf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lu0/T;->d:LGf/e;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Llf/j;-><init>(ILjf/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ljf/c;)Ljf/c;
    .locals 1

    .line 1
    new-instance p1, Lu0/T;

    .line 2
    .line 3
    iget-object v0, p0, Lu0/T;->d:LGf/e;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lu0/T;-><init>(LGf/e;Ljf/c;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LEf/E;

    .line 2
    .line 3
    check-cast p2, Ljf/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lu0/T;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lu0/T;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lu0/T;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    sget-object v0, Lkf/a;->a:Lkf/a;

    .line 2
    .line 3
    iget v1, p0, Lu0/T;->c:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    if-ne v1, v3, :cond_0

    .line 10
    .line 11
    iget-object v1, p0, Lu0/T;->b:LGf/b;

    .line 12
    .line 13
    iget-object v4, p0, Lu0/T;->a:LGf/v;

    .line 14
    .line 15
    :try_start_0
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    .line 18
    goto :goto_1

    .line 19
    :catchall_0
    move-exception p1

    .line 20
    goto :goto_4

    .line 21
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 22
    .line 23
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 24
    .line 25
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw p1

    .line 29
    :cond_1
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iget-object v4, p0, Lu0/T;->d:LGf/e;

    .line 33
    .line 34
    :try_start_1
    new-instance p1, LGf/b;

    .line 35
    .line 36
    invoke-direct {p1, v4}, LGf/b;-><init>(LGf/e;)V

    .line 37
    .line 38
    .line 39
    move-object v1, p1

    .line 40
    :cond_2
    :goto_0
    iput-object v4, p0, Lu0/T;->a:LGf/v;

    .line 41
    .line 42
    iput-object v1, p0, Lu0/T;->b:LGf/b;

    .line 43
    .line 44
    iput v3, p0, Lu0/T;->c:I

    .line 45
    .line 46
    invoke-virtual {v1, p0}, LGf/b;->a(Llf/c;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    if-ne p1, v0, :cond_3

    .line 51
    .line 52
    return-object v0

    .line 53
    :cond_3
    :goto_1
    check-cast p1, Ljava/lang/Boolean;

    .line 54
    .line 55
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    if-eqz p1, :cond_5

    .line 60
    .line 61
    invoke-virtual {v1}, LGf/b;->c()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    check-cast p1, Lef/C;

    .line 66
    .line 67
    sget-object p1, LX/m;->b:Ljava/lang/Object;

    .line 68
    .line 69
    monitor-enter p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 70
    :try_start_2
    sget-object v5, LX/m;->i:Ljava/util/concurrent/atomic/AtomicReference;

    .line 71
    .line 72
    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    check-cast v5, LX/b;

    .line 77
    .line 78
    iget-object v5, v5, LX/c;->h:Lx/r;

    .line 79
    .line 80
    const/4 v6, 0x0

    .line 81
    if-eqz v5, :cond_4

    .line 82
    .line 83
    invoke-virtual {v5}, Lx/r;->h()Z

    .line 84
    .line 85
    .line 86
    move-result v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 87
    if-ne v5, v3, :cond_4

    .line 88
    .line 89
    move v6, v3

    .line 90
    goto :goto_2

    .line 91
    :catchall_1
    move-exception v0

    .line 92
    goto :goto_3

    .line 93
    :cond_4
    :goto_2
    :try_start_3
    monitor-exit p1

    .line 94
    if-eqz v6, :cond_2

    .line 95
    .line 96
    invoke-static {}, LX/m;->a()V

    .line 97
    .line 98
    .line 99
    goto :goto_0

    .line 100
    :goto_3
    monitor-exit p1

    .line 101
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 102
    :cond_5
    invoke-interface {v4, v2}, LGf/v;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 103
    .line 104
    .line 105
    sget-object p1, Lef/C;->a:Lef/C;

    .line 106
    .line 107
    return-object p1

    .line 108
    :goto_4
    :try_start_4
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 109
    :catchall_2
    move-exception v0

    .line 110
    instance-of v1, p1, Ljava/util/concurrent/CancellationException;

    .line 111
    .line 112
    if-eqz v1, :cond_6

    .line 113
    .line 114
    move-object v2, p1

    .line 115
    check-cast v2, Ljava/util/concurrent/CancellationException;

    .line 116
    .line 117
    :cond_6
    if-nez v2, :cond_7

    .line 118
    .line 119
    const-string v1, "Channel was consumed, consumer had failed"

    .line 120
    .line 121
    invoke-static {v1, p1}, LEf/H;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/util/concurrent/CancellationException;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    :cond_7
    invoke-interface {v4, v2}, LGf/v;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 126
    .line 127
    .line 128
    throw v0
.end method
