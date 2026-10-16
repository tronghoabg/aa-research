.class public final LRe/B;
.super LRe/a;
.source "SourceFile"


# instance fields
.field public final synthetic c:I

.field public final d:I

.field public final e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LHe/c;LHe/m;I)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, LRe/B;->c:I

    .line 4
    invoke-direct {p0, p1}, LRe/a;-><init>(LHe/c;)V

    .line 5
    iput-object p2, p0, LRe/B;->e:Ljava/lang/Object;

    .line 6
    iput p3, p0, LRe/B;->d:I

    return-void
.end method

.method public constructor <init>(LHe/c;LLe/c;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LRe/B;->c:I

    .line 7
    invoke-direct {p0, p1}, LRe/a;-><init>(LHe/c;)V

    .line 8
    iput-object p2, p0, LRe/B;->e:Ljava/lang/Object;

    const p1, 0x7fffffff

    .line 9
    iput p1, p0, LRe/B;->d:I

    return-void
.end method

.method public constructor <init>(LRe/x;I)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LRe/B;->c:I

    sget-object v0, LNe/b;->a:Lza/a;

    .line 1
    invoke-direct {p0, p1}, LRe/a;-><init>(LHe/c;)V

    .line 2
    iput-object v0, p0, LRe/B;->e:Ljava/lang/Object;

    .line 3
    iput p2, p0, LRe/B;->d:I

    return-void
.end method


# virtual methods
.method public final e(LHe/f;)V
    .locals 4

    .line 1
    iget v0, p0, LRe/B;->c:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LRe/B;->e:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, LHe/m;

    .line 9
    .line 10
    invoke-virtual {v0}, LHe/m;->a()LHe/l;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    instance-of v1, p1, LOe/a;

    .line 15
    .line 16
    iget v2, p0, LRe/B;->d:I

    .line 17
    .line 18
    iget-object v3, p0, LRe/a;->b:LHe/c;

    .line 19
    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    new-instance v1, LRe/J;

    .line 23
    .line 24
    check-cast p1, LOe/a;

    .line 25
    .line 26
    invoke-direct {v1, p1, v0, v2}, LRe/J;-><init>(LOe/a;LHe/l;I)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v3, v1}, LHe/c;->d(LHe/f;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    new-instance v1, LRe/K;

    .line 34
    .line 35
    invoke-direct {v1, p1, v0, v2}, LRe/K;-><init>(LHe/f;LHe/l;I)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v3, v1}, LHe/c;->d(LHe/f;)V

    .line 39
    .line 40
    .line 41
    :goto_0
    return-void

    .line 42
    :pswitch_0
    iget-object v0, p0, LRe/a;->b:LHe/c;

    .line 43
    .line 44
    instance-of v1, v0, Ljava/util/concurrent/Callable;

    .line 45
    .line 46
    iget-object v2, p0, LRe/B;->e:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v2, Lza/a;

    .line 49
    .line 50
    if-eqz v1, :cond_2

    .line 51
    .line 52
    :try_start_0
    check-cast v0, Ljava/util/concurrent/Callable;

    .line 53
    .line 54
    invoke-interface {v0}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 58
    if-nez v0, :cond_1

    .line 59
    .line 60
    invoke-static {p1}, LYe/d;->a(LHe/f;)V

    .line 61
    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_1
    :try_start_1
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    check-cast v0, Ljava/lang/Iterable;

    .line 68
    .line 69
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 70
    .line 71
    .line 72
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 73
    invoke-static {p1, v0}, LRe/m;->f(LHe/f;Ljava/util/Iterator;)V

    .line 74
    .line 75
    .line 76
    goto :goto_1

    .line 77
    :catchall_0
    move-exception v0

    .line 78
    invoke-static {v0}, Lp7/b;->U(Ljava/lang/Throwable;)V

    .line 79
    .line 80
    .line 81
    invoke-static {v0, p1}, LYe/d;->b(Ljava/lang/Throwable;LHe/f;)V

    .line 82
    .line 83
    .line 84
    goto :goto_1

    .line 85
    :catchall_1
    move-exception v0

    .line 86
    invoke-static {v0}, Lp7/b;->U(Ljava/lang/Throwable;)V

    .line 87
    .line 88
    .line 89
    invoke-static {v0, p1}, LYe/d;->b(Ljava/lang/Throwable;LHe/f;)V

    .line 90
    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_2
    new-instance v1, LRe/C;

    .line 94
    .line 95
    iget v3, p0, LRe/B;->d:I

    .line 96
    .line 97
    invoke-direct {v1, p1, v2, v3}, LRe/C;-><init>(LHe/f;Lza/a;I)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0, v1}, LHe/c;->d(LHe/f;)V

    .line 101
    .line 102
    .line 103
    :goto_1
    return-void

    .line 104
    :pswitch_1
    new-instance v0, LRe/A;

    .line 105
    .line 106
    iget v1, p0, LRe/B;->d:I

    .line 107
    .line 108
    iget-object v2, p0, LRe/B;->e:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v2, LLe/c;

    .line 111
    .line 112
    invoke-direct {v0, p1, v2, v1}, LRe/A;-><init>(LHe/f;LLe/c;I)V

    .line 113
    .line 114
    .line 115
    iget-object p1, p0, LRe/a;->b:LHe/c;

    .line 116
    .line 117
    invoke-virtual {p1, v0}, LHe/c;->d(LHe/f;)V

    .line 118
    .line 119
    .line 120
    return-void

    .line 121
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
