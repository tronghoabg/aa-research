.class public final LRe/x;
.super LRe/a;
.source "SourceFile"


# instance fields
.field public final synthetic c:I

.field public final d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(LHe/c;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p3, p0, LRe/x;->c:I

    invoke-direct {p0, p1}, LRe/a;-><init>(LHe/c;)V

    iput-object p2, p0, LRe/x;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LRe/B;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, LRe/x;->c:I

    sget-object v0, LZe/a;->a:LZe/a;

    .line 2
    invoke-direct {p0, p1}, LRe/a;-><init>(LHe/c;)V

    .line 3
    iput-object v0, p0, LRe/x;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final e(LHe/f;)V
    .locals 4

    .line 1
    iget v0, p0, LRe/x;->c:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :try_start_0
    iget-object v0, p0, LRe/x;->d:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, LZe/a;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    new-instance v0, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    .line 18
    new-instance v1, LRe/T;

    .line 19
    .line 20
    invoke-direct {v1, p1}, LYe/c;-><init>(LHe/f;)V

    .line 21
    .line 22
    .line 23
    iput-object v0, v1, LYe/c;->b:Ljava/lang/Object;

    .line 24
    .line 25
    iget-object p1, p0, LRe/a;->b:LHe/c;

    .line 26
    .line 27
    invoke-virtual {p1, v1}, LHe/c;->d(LHe/f;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :catchall_0
    move-exception v0

    .line 32
    invoke-static {v0}, Lp7/b;->U(Ljava/lang/Throwable;)V

    .line 33
    .line 34
    .line 35
    invoke-static {v0, p1}, LYe/d;->b(Ljava/lang/Throwable;LHe/f;)V

    .line 36
    .line 37
    .line 38
    :goto_0
    return-void

    .line 39
    :pswitch_0
    instance-of v0, p1, LOe/a;

    .line 40
    .line 41
    iget-object v1, p0, LRe/x;->d:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v1, LY9/c;

    .line 44
    .line 45
    iget-object v2, p0, LRe/a;->b:LHe/c;

    .line 46
    .line 47
    if-eqz v0, :cond_0

    .line 48
    .line 49
    new-instance v0, LRe/v;

    .line 50
    .line 51
    check-cast p1, LOe/a;

    .line 52
    .line 53
    const/4 v3, 0x1

    .line 54
    invoke-direct {v0, p1, v1, v3}, LRe/v;-><init>(LOe/a;Ljava/lang/Object;I)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v2, v0}, LHe/c;->d(LHe/f;)V

    .line 58
    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_0
    new-instance v0, LRe/H;

    .line 62
    .line 63
    invoke-direct {v0, p1, v1}, LRe/H;-><init>(LHe/f;LY9/c;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v2, v0}, LHe/c;->d(LHe/f;)V

    .line 67
    .line 68
    .line 69
    :goto_1
    return-void

    .line 70
    :pswitch_1
    instance-of v0, p1, LOe/a;

    .line 71
    .line 72
    iget-object v1, p0, LRe/x;->d:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v1, LLe/d;

    .line 75
    .line 76
    iget-object v2, p0, LRe/a;->b:LHe/c;

    .line 77
    .line 78
    if-eqz v0, :cond_1

    .line 79
    .line 80
    new-instance v0, LRe/v;

    .line 81
    .line 82
    check-cast p1, LOe/a;

    .line 83
    .line 84
    const/4 v3, 0x0

    .line 85
    invoke-direct {v0, p1, v1, v3}, LRe/v;-><init>(LOe/a;Ljava/lang/Object;I)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v2, v0}, LHe/c;->d(LHe/f;)V

    .line 89
    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_1
    new-instance v0, LRe/w;

    .line 93
    .line 94
    invoke-direct {v0, p1, v1}, LRe/w;-><init>(LHe/f;LLe/d;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v2, v0}, LHe/c;->d(LHe/f;)V

    .line 98
    .line 99
    .line 100
    :goto_2
    return-void

    .line 101
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
