.class public final LQe/b;
.super LHe/a;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, LQe/b;->a:I

    iput-object p1, p0, LQe/b;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final e(LHe/b;)V
    .locals 2

    .line 1
    iget v0, p0, LQe/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, LS3/c;

    .line 7
    .line 8
    const/16 v1, 0x11

    .line 9
    .line 10
    invoke-direct {v0, v1, p0, p1}, LS3/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, LQe/b;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p1, LQe/e;

    .line 16
    .line 17
    invoke-virtual {p1, v0}, LHe/a;->d(LHe/b;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_0
    sget-object v0, LNe/b;->b:LA7/z;

    .line 22
    .line 23
    new-instance v1, LJe/c;

    .line 24
    .line 25
    invoke-direct {v1, v0}, LJe/c;-><init>(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    invoke-interface {p1, v1}, LHe/b;->a(LJe/b;)V

    .line 29
    .line 30
    .line 31
    :try_start_0
    iget-object v0, p0, LQe/b;->b:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v0, LB8/c;

    .line 34
    .line 35
    invoke-virtual {v0}, LB8/c;->call()Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, LJe/c;->b()Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-nez v0, :cond_0

    .line 43
    .line 44
    invoke-interface {p1}, LHe/b;->onComplete()V

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :catchall_0
    move-exception v0

    .line 49
    invoke-static {v0}, Lp7/b;->U(Ljava/lang/Throwable;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1}, LJe/c;->b()Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-nez v1, :cond_0

    .line 57
    .line 58
    invoke-interface {p1, v0}, LHe/b;->onError(Ljava/lang/Throwable;)V

    .line 59
    .line 60
    .line 61
    :cond_0
    :goto_0
    return-void

    .line 62
    :pswitch_1
    sget-object v0, LNe/b;->b:LA7/z;

    .line 63
    .line 64
    new-instance v1, LJe/c;

    .line 65
    .line 66
    invoke-direct {v1, v0}, LJe/c;-><init>(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    invoke-interface {p1, v1}, LHe/b;->a(LJe/b;)V

    .line 70
    .line 71
    .line 72
    :try_start_1
    iget-object v0, p0, LQe/b;->b:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v0, LLe/a;

    .line 75
    .line 76
    invoke-interface {v0}, LLe/a;->run()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1}, LJe/c;->b()Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-nez v0, :cond_1

    .line 84
    .line 85
    invoke-interface {p1}, LHe/b;->onComplete()V

    .line 86
    .line 87
    .line 88
    goto :goto_1

    .line 89
    :catchall_1
    move-exception v0

    .line 90
    invoke-static {v0}, Lp7/b;->U(Ljava/lang/Throwable;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v1}, LJe/c;->b()Z

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    if-nez v1, :cond_1

    .line 98
    .line 99
    invoke-interface {p1, v0}, LHe/b;->onError(Ljava/lang/Throwable;)V

    .line 100
    .line 101
    .line 102
    :cond_1
    :goto_1
    return-void

    .line 103
    :pswitch_2
    new-instance v0, LQe/a;

    .line 104
    .line 105
    iget-object v1, p0, LQe/b;->b:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v1, [LHe/a;

    .line 108
    .line 109
    invoke-direct {v0, p1, v1}, LQe/a;-><init>(LHe/b;[LHe/a;)V

    .line 110
    .line 111
    .line 112
    iget-object v1, v0, LQe/a;->d:LJe/c;

    .line 113
    .line 114
    invoke-interface {p1, v1}, LHe/b;->a(LJe/b;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v0}, LQe/a;->b()V

    .line 118
    .line 119
    .line 120
    return-void

    .line 121
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
