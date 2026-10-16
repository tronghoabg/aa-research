.class public final LTe/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LHe/j;
.implements LOe/c;


# instance fields
.field public final a:LHe/j;

.field public b:LJe/b;

.field public c:LOe/c;

.field public d:Z

.field public final synthetic e:I

.field public final f:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LHe/j;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p3, p0, LTe/f;->e:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, LTe/f;->a:LHe/j;

    .line 7
    .line 8
    iput-object p2, p0, LTe/f;->f:Ljava/lang/Object;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(LJe/b;)V
    .locals 1

    .line 1
    iget-object v0, p0, LTe/f;->b:LJe/b;

    .line 2
    .line 3
    invoke-static {v0, p1}, LMe/a;->f(LJe/b;LJe/b;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iput-object p1, p0, LTe/f;->b:LJe/b;

    .line 10
    .line 11
    instance-of v0, p1, LOe/c;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    check-cast p1, LOe/c;

    .line 16
    .line 17
    iput-object p1, p0, LTe/f;->c:LOe/c;

    .line 18
    .line 19
    :cond_0
    iget-object p1, p0, LTe/f;->a:LHe/j;

    .line 20
    .line 21
    invoke-interface {p1, p0}, LHe/j;->a(LJe/b;)V

    .line 22
    .line 23
    .line 24
    :cond_1
    return-void
.end method

.method public final b(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget v0, p0, LTe/f;->e:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, LTe/f;->d:Z

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    iget-object v0, p0, LTe/f;->a:LHe/j;

    .line 12
    .line 13
    :try_start_0
    iget-object v1, p0, LTe/f;->f:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, LLe/c;

    .line 16
    .line 17
    invoke-interface {v1, p1}, LLe/c;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const-string v1, "The mapper function returned a null value."

    .line 22
    .line 23
    invoke-static {p1, v1}, LNe/b;->a(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    .line 25
    .line 26
    invoke-interface {v0, p1}, LHe/j;->b(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception p1

    .line 31
    invoke-static {p1}, Lp7/b;->U(Ljava/lang/Throwable;)V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, LTe/f;->b:LJe/b;

    .line 35
    .line 36
    invoke-interface {v0}, LJe/b;->dispose()V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0, p1}, LTe/f;->onError(Ljava/lang/Throwable;)V

    .line 40
    .line 41
    .line 42
    :goto_0
    return-void

    .line 43
    :pswitch_0
    iget-object v0, p0, LTe/f;->a:LHe/j;

    .line 44
    .line 45
    :try_start_1
    iget-object v1, p0, LTe/f;->f:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v1, LJ9/T;

    .line 48
    .line 49
    invoke-virtual {v1, p1}, LJ9/T;->test(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 53
    if-eqz v1, :cond_1

    .line 54
    .line 55
    invoke-interface {v0, p1}, LHe/j;->b(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    goto :goto_1

    .line 59
    :catchall_1
    move-exception p1

    .line 60
    invoke-static {p1}, Lp7/b;->U(Ljava/lang/Throwable;)V

    .line 61
    .line 62
    .line 63
    iget-object v0, p0, LTe/f;->b:LJe/b;

    .line 64
    .line 65
    invoke-interface {v0}, LJe/b;->dispose()V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0, p1}, LTe/f;->onError(Ljava/lang/Throwable;)V

    .line 69
    .line 70
    .line 71
    :cond_1
    :goto_1
    return-void

    .line 72
    nop

    .line 73
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final c(I)I
    .locals 0

    .line 1
    iget p1, p0, LTe/f;->e:I

    packed-switch p1, :pswitch_data_0

    const/4 p1, 0x0

    return p1

    :pswitch_0
    const/4 p1, 0x0

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final clear()V
    .locals 1

    .line 1
    iget-object v0, p0, LTe/f;->c:LOe/c;

    .line 2
    .line 3
    invoke-interface {v0}, LOe/h;->clear()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final dispose()V
    .locals 1

    .line 1
    iget-object v0, p0, LTe/f;->b:LJe/b;

    .line 2
    .line 3
    invoke-interface {v0}, LJe/b;->dispose()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final isEmpty()Z
    .locals 1

    .line 1
    iget-object v0, p0, LTe/f;->c:LOe/c;

    .line 2
    .line 3
    invoke-interface {v0}, LOe/h;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final offer(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v0, "Should not be called!"

    .line 4
    .line 5
    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p1
.end method

.method public final onComplete()V
    .locals 1

    .line 1
    iget-boolean v0, p0, LTe/f;->d:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, LTe/f;->d:Z

    .line 8
    .line 9
    iget-object v0, p0, LTe/f;->a:LHe/j;

    .line 10
    .line 11
    invoke-interface {v0}, LHe/j;->onComplete()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final onError(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, LTe/f;->d:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p1}, LS3/f;->A(Ljava/lang/Throwable;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    const/4 v0, 0x1

    .line 10
    iput-boolean v0, p0, LTe/f;->d:Z

    .line 11
    .line 12
    iget-object v0, p0, LTe/f;->a:LHe/j;

    .line 13
    .line 14
    invoke-interface {v0, p1}, LHe/j;->onError(Ljava/lang/Throwable;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final poll()Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, LTe/f;->e:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LTe/f;->c:LOe/c;

    .line 7
    .line 8
    invoke-interface {v0}, LOe/h;->poll()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object v1, p0, LTe/f;->f:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, LLe/c;

    .line 17
    .line 18
    invoke-interface {v1, v0}, LLe/c;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-string v1, "The mapper function returned a null value."

    .line 23
    .line 24
    invoke-static {v0, v1}, LNe/b;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v0, 0x0

    .line 29
    :goto_0
    return-object v0

    .line 30
    :cond_1
    :pswitch_0
    iget-object v0, p0, LTe/f;->c:LOe/c;

    .line 31
    .line 32
    invoke-interface {v0}, LOe/h;->poll()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    iget-object v1, p0, LTe/f;->f:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v1, LJ9/T;

    .line 41
    .line 42
    invoke-virtual {v1, v0}, LJ9/T;->test(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-eqz v1, :cond_1

    .line 47
    .line 48
    :cond_2
    return-object v0

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
