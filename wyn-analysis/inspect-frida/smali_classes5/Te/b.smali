.class public final LTe/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LHe/j;
.implements LJe/b;


# instance fields
.field public final synthetic a:I

.field public final b:LNe/a;

.field public c:LJe/b;

.field public d:Z

.field public final e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;LNe/a;I)V
    .locals 0

    .line 1
    iput p3, p0, LTe/b;->a:I

    iput-object p1, p0, LTe/b;->e:Ljava/lang/Object;

    iput-object p2, p0, LTe/b;->b:LNe/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LJe/b;)V
    .locals 1

    .line 1
    iget v0, p0, LTe/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LTe/b;->c:LJe/b;

    .line 7
    .line 8
    invoke-static {v0, p1}, LMe/a;->f(LJe/b;LJe/b;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iput-object p1, p0, LTe/b;->c:LJe/b;

    .line 15
    .line 16
    iget-object p1, p0, LTe/b;->e:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p1, LHe/o;

    .line 19
    .line 20
    invoke-interface {p1, p0}, LHe/o;->a(LJe/b;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void

    .line 24
    :pswitch_0
    iget-object v0, p0, LTe/b;->c:LJe/b;

    .line 25
    .line 26
    invoke-static {v0, p1}, LMe/a;->f(LJe/b;LJe/b;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    iput-object p1, p0, LTe/b;->c:LJe/b;

    .line 33
    .line 34
    iget-object p1, p0, LTe/b;->e:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast p1, LHe/j;

    .line 37
    .line 38
    invoke-interface {p1, p0}, LHe/j;->a(LJe/b;)V

    .line 39
    .line 40
    .line 41
    :cond_1
    return-void

    .line 42
    nop

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget v0, p0, LTe/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, LTe/b;->d:Z

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    :try_start_0
    iget-object v0, p0, LTe/b;->b:LNe/a;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, LNe/a;->test(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    if-eqz p1, :cond_1

    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    iput-boolean p1, p0, LTe/b;->d:Z

    .line 21
    .line 22
    iget-object p1, p0, LTe/b;->c:LJe/b;

    .line 23
    .line 24
    invoke-interface {p1}, LJe/b;->dispose()V

    .line 25
    .line 26
    .line 27
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 28
    .line 29
    iget-object v0, p0, LTe/b;->e:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v0, LHe/o;

    .line 32
    .line 33
    invoke-interface {v0, p1}, LHe/o;->onSuccess(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :catchall_0
    move-exception p1

    .line 38
    invoke-static {p1}, Lp7/b;->U(Ljava/lang/Throwable;)V

    .line 39
    .line 40
    .line 41
    iget-object v0, p0, LTe/b;->c:LJe/b;

    .line 42
    .line 43
    invoke-interface {v0}, LJe/b;->dispose()V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, p1}, LTe/b;->onError(Ljava/lang/Throwable;)V

    .line 47
    .line 48
    .line 49
    :cond_1
    :goto_0
    return-void

    .line 50
    :pswitch_0
    iget-boolean v0, p0, LTe/b;->d:Z

    .line 51
    .line 52
    if-eqz v0, :cond_2

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_2
    :try_start_1
    iget-object v0, p0, LTe/b;->b:LNe/a;

    .line 56
    .line 57
    invoke-virtual {v0, p1}, LNe/a;->test(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 61
    if-eqz p1, :cond_3

    .line 62
    .line 63
    const/4 p1, 0x1

    .line 64
    iput-boolean p1, p0, LTe/b;->d:Z

    .line 65
    .line 66
    iget-object p1, p0, LTe/b;->c:LJe/b;

    .line 67
    .line 68
    invoke-interface {p1}, LJe/b;->dispose()V

    .line 69
    .line 70
    .line 71
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 72
    .line 73
    iget-object v0, p0, LTe/b;->e:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v0, LHe/j;

    .line 76
    .line 77
    invoke-interface {v0, p1}, LHe/j;->b(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    invoke-interface {v0}, LHe/j;->onComplete()V

    .line 81
    .line 82
    .line 83
    goto :goto_1

    .line 84
    :catchall_1
    move-exception p1

    .line 85
    invoke-static {p1}, Lp7/b;->U(Ljava/lang/Throwable;)V

    .line 86
    .line 87
    .line 88
    iget-object v0, p0, LTe/b;->c:LJe/b;

    .line 89
    .line 90
    invoke-interface {v0}, LJe/b;->dispose()V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0, p1}, LTe/b;->onError(Ljava/lang/Throwable;)V

    .line 94
    .line 95
    .line 96
    :cond_3
    :goto_1
    return-void

    .line 97
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final dispose()V
    .locals 1

    .line 1
    iget v0, p0, LTe/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LTe/b;->c:LJe/b;

    .line 7
    .line 8
    invoke-interface {v0}, LJe/b;->dispose()V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    iget-object v0, p0, LTe/b;->c:LJe/b;

    .line 13
    .line 14
    invoke-interface {v0}, LJe/b;->dispose()V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onComplete()V
    .locals 2

    .line 1
    iget v0, p0, LTe/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, LTe/b;->d:Z

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    iput-boolean v0, p0, LTe/b;->d:Z

    .line 12
    .line 13
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 14
    .line 15
    iget-object v1, p0, LTe/b;->e:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, LHe/o;

    .line 18
    .line 19
    invoke-interface {v1, v0}, LHe/o;->onSuccess(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void

    .line 23
    :pswitch_0
    iget-boolean v0, p0, LTe/b;->d:Z

    .line 24
    .line 25
    if-nez v0, :cond_1

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    iput-boolean v0, p0, LTe/b;->d:Z

    .line 29
    .line 30
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 31
    .line 32
    iget-object v1, p0, LTe/b;->e:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v1, LHe/j;

    .line 35
    .line 36
    invoke-interface {v1, v0}, LHe/j;->b(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    invoke-interface {v1}, LHe/j;->onComplete()V

    .line 40
    .line 41
    .line 42
    :cond_1
    return-void

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onError(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget v0, p0, LTe/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, LTe/b;->d:Z

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-static {p1}, LS3/f;->A(Ljava/lang/Throwable;)V

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x1

    .line 15
    iput-boolean v0, p0, LTe/b;->d:Z

    .line 16
    .line 17
    iget-object v0, p0, LTe/b;->e:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, LHe/o;

    .line 20
    .line 21
    invoke-interface {v0, p1}, LHe/o;->onError(Ljava/lang/Throwable;)V

    .line 22
    .line 23
    .line 24
    :goto_0
    return-void

    .line 25
    :pswitch_0
    iget-boolean v0, p0, LTe/b;->d:Z

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    invoke-static {p1}, LS3/f;->A(Ljava/lang/Throwable;)V

    .line 30
    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    const/4 v0, 0x1

    .line 34
    iput-boolean v0, p0, LTe/b;->d:Z

    .line 35
    .line 36
    iget-object v0, p0, LTe/b;->e:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v0, LHe/j;

    .line 39
    .line 40
    invoke-interface {v0, p1}, LHe/j;->onError(Ljava/lang/Throwable;)V

    .line 41
    .line 42
    .line 43
    :goto_1
    return-void

    .line 44
    nop

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
