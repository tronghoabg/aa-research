.class public final LQe/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LHe/b;
.implements LJe/b;
.implements LHe/h;


# instance fields
.field public final synthetic a:I

.field public b:LJe/b;

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(LHe/h;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p3, p0, LQe/d;->a:I

    iput-object p1, p0, LQe/d;->c:Ljava/lang/Object;

    iput-object p2, p0, LQe/d;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(LQe/e;LHe/b;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LQe/d;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LQe/d;->d:Ljava/lang/Object;

    .line 3
    iput-object p2, p0, LQe/d;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(LJe/b;)V
    .locals 2

    .line 1
    iget v0, p0, LQe/d;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LQe/d;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, LHe/h;

    .line 9
    .line 10
    iget-object v1, p0, LQe/d;->b:LJe/b;

    .line 11
    .line 12
    invoke-static {v1, p1}, LMe/a;->f(LJe/b;LJe/b;)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    :try_start_0
    iget-object v1, p0, LQe/d;->d:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, LSe/r;

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, LQe/d;->b:LJe/b;

    .line 26
    .line 27
    invoke-interface {v0, p0}, LHe/h;->a(LJe/b;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :catchall_0
    move-exception v1

    .line 32
    invoke-static {v1}, Lp7/b;->U(Ljava/lang/Throwable;)V

    .line 33
    .line 34
    .line 35
    invoke-interface {p1}, LJe/b;->dispose()V

    .line 36
    .line 37
    .line 38
    sget-object p1, LMe/a;->a:LMe/a;

    .line 39
    .line 40
    iput-object p1, p0, LQe/d;->b:LJe/b;

    .line 41
    .line 42
    sget-object p1, LMe/b;->a:LMe/b;

    .line 43
    .line 44
    invoke-interface {v0, p1}, LHe/h;->a(LJe/b;)V

    .line 45
    .line 46
    .line 47
    invoke-interface {v0, v1}, LHe/h;->onError(Ljava/lang/Throwable;)V

    .line 48
    .line 49
    .line 50
    :cond_0
    :goto_0
    return-void

    .line 51
    :pswitch_0
    iget-object v0, p0, LQe/d;->b:LJe/b;

    .line 52
    .line 53
    invoke-static {v0, p1}, LMe/a;->f(LJe/b;LJe/b;)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-eqz v0, :cond_1

    .line 58
    .line 59
    iput-object p1, p0, LQe/d;->b:LJe/b;

    .line 60
    .line 61
    iget-object p1, p0, LQe/d;->c:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast p1, LHe/h;

    .line 64
    .line 65
    invoke-interface {p1, p0}, LHe/h;->a(LJe/b;)V

    .line 66
    .line 67
    .line 68
    :cond_1
    return-void

    .line 69
    :pswitch_1
    iget-object v0, p0, LQe/d;->c:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v0, LHe/b;

    .line 72
    .line 73
    :try_start_1
    iget-object v1, p0, LQe/d;->d:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v1, LQe/e;

    .line 76
    .line 77
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 78
    .line 79
    .line 80
    iget-object v1, p0, LQe/d;->b:LJe/b;

    .line 81
    .line 82
    invoke-static {v1, p1}, LMe/a;->f(LJe/b;LJe/b;)Z

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    if-eqz v1, :cond_2

    .line 87
    .line 88
    iput-object p1, p0, LQe/d;->b:LJe/b;

    .line 89
    .line 90
    invoke-interface {v0, p0}, LHe/b;->a(LJe/b;)V

    .line 91
    .line 92
    .line 93
    goto :goto_1

    .line 94
    :catchall_1
    move-exception v1

    .line 95
    invoke-static {v1}, Lp7/b;->U(Ljava/lang/Throwable;)V

    .line 96
    .line 97
    .line 98
    invoke-interface {p1}, LJe/b;->dispose()V

    .line 99
    .line 100
    .line 101
    sget-object p1, LMe/a;->a:LMe/a;

    .line 102
    .line 103
    iput-object p1, p0, LQe/d;->b:LJe/b;

    .line 104
    .line 105
    sget-object p1, LMe/b;->a:LMe/b;

    .line 106
    .line 107
    invoke-interface {v0, p1}, LHe/b;->a(LJe/b;)V

    .line 108
    .line 109
    .line 110
    invoke-interface {v0, v1}, LHe/b;->onError(Ljava/lang/Throwable;)V

    .line 111
    .line 112
    .line 113
    :cond_2
    :goto_1
    return-void

    .line 114
    nop

    .line 115
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public b()V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, LQe/d;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LSe/r;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :catchall_0
    move-exception v0

    .line 10
    invoke-static {v0}, Lp7/b;->U(Ljava/lang/Throwable;)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, LS3/f;->A(Ljava/lang/Throwable;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public c(Ljava/lang/Throwable;)V
    .locals 4

    .line 1
    :try_start_0
    iget-object v0, p0, LQe/d;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LSe/r;

    .line 4
    .line 5
    iget-object v0, v0, LSe/r;->c:LLe/b;

    .line 6
    .line 7
    invoke-interface {v0, p1}, LLe/b;->accept(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    .line 9
    .line 10
    goto :goto_0

    .line 11
    :catchall_0
    move-exception v0

    .line 12
    invoke-static {v0}, Lp7/b;->U(Ljava/lang/Throwable;)V

    .line 13
    .line 14
    .line 15
    new-instance v1, LKe/b;

    .line 16
    .line 17
    const/4 v2, 0x2

    .line 18
    new-array v2, v2, [Ljava/lang/Throwable;

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    aput-object p1, v2, v3

    .line 22
    .line 23
    const/4 p1, 0x1

    .line 24
    aput-object v0, v2, p1

    .line 25
    .line 26
    invoke-direct {v1, v2}, LKe/b;-><init>([Ljava/lang/Throwable;)V

    .line 27
    .line 28
    .line 29
    move-object p1, v1

    .line 30
    :goto_0
    sget-object v0, LMe/a;->a:LMe/a;

    .line 31
    .line 32
    iput-object v0, p0, LQe/d;->b:LJe/b;

    .line 33
    .line 34
    iget-object v0, p0, LQe/d;->c:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v0, LHe/h;

    .line 37
    .line 38
    invoke-interface {v0, p1}, LHe/h;->onError(Ljava/lang/Throwable;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, LQe/d;->b()V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public final dispose()V
    .locals 2

    .line 1
    iget v0, p0, LQe/d;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :try_start_0
    iget-object v0, p0, LQe/d;->d:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, LSe/r;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :catchall_0
    move-exception v0

    .line 15
    invoke-static {v0}, Lp7/b;->U(Ljava/lang/Throwable;)V

    .line 16
    .line 17
    .line 18
    invoke-static {v0}, LS3/f;->A(Ljava/lang/Throwable;)V

    .line 19
    .line 20
    .line 21
    :goto_0
    iget-object v0, p0, LQe/d;->b:LJe/b;

    .line 22
    .line 23
    invoke-interface {v0}, LJe/b;->dispose()V

    .line 24
    .line 25
    .line 26
    sget-object v0, LMe/a;->a:LMe/a;

    .line 27
    .line 28
    iput-object v0, p0, LQe/d;->b:LJe/b;

    .line 29
    .line 30
    return-void

    .line 31
    :pswitch_0
    iget-object v0, p0, LQe/d;->b:LJe/b;

    .line 32
    .line 33
    sget-object v1, LMe/a;->a:LMe/a;

    .line 34
    .line 35
    iput-object v1, p0, LQe/d;->b:LJe/b;

    .line 36
    .line 37
    invoke-interface {v0}, LJe/b;->dispose()V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :pswitch_1
    :try_start_1
    iget-object v0, p0, LQe/d;->d:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v0, LQe/e;

    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 46
    .line 47
    .line 48
    goto :goto_1

    .line 49
    :catchall_1
    move-exception v0

    .line 50
    invoke-static {v0}, Lp7/b;->U(Ljava/lang/Throwable;)V

    .line 51
    .line 52
    .line 53
    invoke-static {v0}, LS3/f;->A(Ljava/lang/Throwable;)V

    .line 54
    .line 55
    .line 56
    :goto_1
    iget-object v0, p0, LQe/d;->b:LJe/b;

    .line 57
    .line 58
    invoke-interface {v0}, LJe/b;->dispose()V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    nop

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onComplete()V
    .locals 4

    .line 1
    iget v0, p0, LQe/d;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LQe/d;->b:LJe/b;

    .line 7
    .line 8
    sget-object v1, LMe/a;->a:LMe/a;

    .line 9
    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    :try_start_0
    iget-object v0, p0, LQe/d;->d:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, LSe/r;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    .line 19
    .line 20
    iput-object v1, p0, LQe/d;->b:LJe/b;

    .line 21
    .line 22
    iget-object v0, p0, LQe/d;->c:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, LHe/h;

    .line 25
    .line 26
    invoke-interface {v0}, LHe/h;->onComplete()V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, LQe/d;->b()V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :catchall_0
    move-exception v0

    .line 34
    invoke-static {v0}, Lp7/b;->U(Ljava/lang/Throwable;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, v0}, LQe/d;->c(Ljava/lang/Throwable;)V

    .line 38
    .line 39
    .line 40
    :goto_0
    return-void

    .line 41
    :pswitch_0
    iget-object v0, p0, LQe/d;->c:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v0, LHe/h;

    .line 44
    .line 45
    invoke-interface {v0}, LHe/h;->onComplete()V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :pswitch_1
    iget-object v0, p0, LQe/d;->c:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v0, LHe/b;

    .line 52
    .line 53
    iget-object v1, p0, LQe/d;->d:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v1, LQe/e;

    .line 56
    .line 57
    iget-object v2, p0, LQe/d;->b:LJe/b;

    .line 58
    .line 59
    sget-object v3, LMe/a;->a:LMe/a;

    .line 60
    .line 61
    if-ne v2, v3, :cond_1

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_1
    :try_start_1
    iget-object v2, v1, LQe/e;->c:LLe/a;

    .line 65
    .line 66
    invoke-interface {v2}, LLe/a;->run()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 67
    .line 68
    .line 69
    invoke-interface {v0}, LHe/b;->onComplete()V

    .line 70
    .line 71
    .line 72
    :try_start_2
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 73
    .line 74
    .line 75
    goto :goto_1

    .line 76
    :catchall_1
    move-exception v0

    .line 77
    invoke-static {v0}, Lp7/b;->U(Ljava/lang/Throwable;)V

    .line 78
    .line 79
    .line 80
    invoke-static {v0}, LS3/f;->A(Ljava/lang/Throwable;)V

    .line 81
    .line 82
    .line 83
    goto :goto_1

    .line 84
    :catchall_2
    move-exception v1

    .line 85
    invoke-static {v1}, Lp7/b;->U(Ljava/lang/Throwable;)V

    .line 86
    .line 87
    .line 88
    invoke-interface {v0, v1}, LHe/b;->onError(Ljava/lang/Throwable;)V

    .line 89
    .line 90
    .line 91
    :goto_1
    return-void

    .line 92
    nop

    .line 93
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onError(Ljava/lang/Throwable;)V
    .locals 6

    .line 1
    iget-object v0, p0, LQe/d;->c:Ljava/lang/Object;

    .line 2
    .line 3
    sget-object v1, LMe/a;->a:LMe/a;

    .line 4
    .line 5
    iget v2, p0, LQe/d;->a:I

    .line 6
    .line 7
    packed-switch v2, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, LQe/d;->b:LJe/b;

    .line 11
    .line 12
    if-ne v0, v1, :cond_0

    .line 13
    .line 14
    invoke-static {p1}, LS3/f;->A(Ljava/lang/Throwable;)V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {p0, p1}, LQe/d;->c(Ljava/lang/Throwable;)V

    .line 19
    .line 20
    .line 21
    :goto_0
    return-void

    .line 22
    :pswitch_0
    check-cast v0, LHe/h;

    .line 23
    .line 24
    invoke-interface {v0, p1}, LHe/h;->onError(Ljava/lang/Throwable;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :pswitch_1
    iget-object v2, p0, LQe/d;->d:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v2, LQe/e;

    .line 31
    .line 32
    iget-object v3, p0, LQe/d;->b:LJe/b;

    .line 33
    .line 34
    if-ne v3, v1, :cond_1

    .line 35
    .line 36
    invoke-static {p1}, LS3/f;->A(Ljava/lang/Throwable;)V

    .line 37
    .line 38
    .line 39
    goto :goto_2

    .line 40
    :cond_1
    :try_start_0
    iget-object v1, v2, LQe/e;->b:LLe/b;

    .line 41
    .line 42
    invoke-interface {v1, p1}, LLe/b;->accept(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :catchall_0
    move-exception v1

    .line 47
    invoke-static {v1}, Lp7/b;->U(Ljava/lang/Throwable;)V

    .line 48
    .line 49
    .line 50
    new-instance v3, LKe/b;

    .line 51
    .line 52
    const/4 v4, 0x2

    .line 53
    new-array v4, v4, [Ljava/lang/Throwable;

    .line 54
    .line 55
    const/4 v5, 0x0

    .line 56
    aput-object p1, v4, v5

    .line 57
    .line 58
    const/4 p1, 0x1

    .line 59
    aput-object v1, v4, p1

    .line 60
    .line 61
    invoke-direct {v3, v4}, LKe/b;-><init>([Ljava/lang/Throwable;)V

    .line 62
    .line 63
    .line 64
    move-object p1, v3

    .line 65
    :goto_1
    check-cast v0, LHe/b;

    .line 66
    .line 67
    invoke-interface {v0, p1}, LHe/b;->onError(Ljava/lang/Throwable;)V

    .line 68
    .line 69
    .line 70
    :try_start_1
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 71
    .line 72
    .line 73
    goto :goto_2

    .line 74
    :catchall_1
    move-exception p1

    .line 75
    invoke-static {p1}, Lp7/b;->U(Ljava/lang/Throwable;)V

    .line 76
    .line 77
    .line 78
    invoke-static {p1}, LS3/f;->A(Ljava/lang/Throwable;)V

    .line 79
    .line 80
    .line 81
    :goto_2
    return-void

    .line 82
    nop

    .line 83
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onSuccess(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget v0, p0, LQe/d;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LQe/d;->b:LJe/b;

    .line 7
    .line 8
    sget-object v1, LMe/a;->a:LMe/a;

    .line 9
    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    :try_start_0
    iget-object v0, p0, LQe/d;->d:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, LSe/r;

    .line 16
    .line 17
    iget-object v0, v0, LSe/r;->b:LLe/b;

    .line 18
    .line 19
    invoke-interface {v0, p1}, LLe/b;->accept(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    .line 22
    iput-object v1, p0, LQe/d;->b:LJe/b;

    .line 23
    .line 24
    iget-object v0, p0, LQe/d;->c:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v0, LHe/h;

    .line 27
    .line 28
    invoke-interface {v0, p1}, LHe/h;->onSuccess(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, LQe/d;->b()V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :catchall_0
    move-exception p1

    .line 36
    invoke-static {p1}, Lp7/b;->U(Ljava/lang/Throwable;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0, p1}, LQe/d;->c(Ljava/lang/Throwable;)V

    .line 40
    .line 41
    .line 42
    :goto_0
    return-void

    .line 43
    :pswitch_0
    iget-object v0, p0, LQe/d;->c:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v0, LHe/h;

    .line 46
    .line 47
    :try_start_1
    iget-object v1, p0, LQe/d;->d:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v1, LLe/c;

    .line 50
    .line 51
    invoke-interface {v1, p1}, LLe/c;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    const-string v1, "The mapper returned a null item"

    .line 56
    .line 57
    invoke-static {p1, v1}, LNe/b;->a(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 58
    .line 59
    .line 60
    invoke-interface {v0, p1}, LHe/h;->onSuccess(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    goto :goto_1

    .line 64
    :catchall_1
    move-exception p1

    .line 65
    invoke-static {p1}, Lp7/b;->U(Ljava/lang/Throwable;)V

    .line 66
    .line 67
    .line 68
    invoke-interface {v0, p1}, LHe/h;->onError(Ljava/lang/Throwable;)V

    .line 69
    .line 70
    .line 71
    :goto_1
    return-void

    .line 72
    nop

    .line 73
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
