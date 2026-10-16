.class public final LSe/i;
.super Ljava/util/concurrent/atomic/AtomicReference;
.source "SourceFile"

# interfaces
.implements LHe/h;
.implements LHe/b;
.implements LJe/b;
.implements LHe/o;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, LSe/i;->a:I

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p2, p0, LSe/i;->b:Ljava/lang/Object;

    iput-object p3, p0, LSe/i;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LHe/h;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LSe/i;->a:I

    .line 2
    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 3
    iput-object p1, p0, LSe/i;->c:Ljava/lang/Object;

    .line 4
    new-instance p1, LJe/c;

    const/4 v0, 0x1

    .line 5
    invoke-direct {p1, v0}, LJe/c;-><init>(I)V

    .line 6
    iput-object p1, p0, LSe/i;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(LJe/b;)V
    .locals 1

    .line 1
    iget v0, p0, LSe/i;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-static {p0, p1}, LMe/a;->e(Ljava/util/concurrent/atomic/AtomicReference;LJe/b;)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    iget-object p1, p0, LSe/i;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p1, LHe/o;

    .line 15
    .line 16
    invoke-interface {p1, p0}, LHe/o;->a(LJe/b;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void

    .line 20
    :pswitch_0
    invoke-static {p0, p1}, LMe/a;->e(Ljava/util/concurrent/atomic/AtomicReference;LJe/b;)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    if-eqz p1, :cond_1

    .line 25
    .line 26
    iget-object p1, p0, LSe/i;->b:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast p1, LHe/h;

    .line 29
    .line 30
    invoke-interface {p1, p0}, LHe/h;->a(LJe/b;)V

    .line 31
    .line 32
    .line 33
    :cond_1
    return-void

    .line 34
    :pswitch_1
    invoke-static {p0, p1}, LMe/a;->e(Ljava/util/concurrent/atomic/AtomicReference;LJe/b;)Z

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :pswitch_2
    invoke-static {p0, p1}, LMe/a;->c(Ljava/util/concurrent/atomic/AtomicReference;LJe/b;)Z

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    nop

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final dispose()V
    .locals 1

    .line 1
    iget v0, p0, LSe/i;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, LMe/a;->a(Ljava/util/concurrent/atomic/AtomicReference;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    invoke-static {p0}, LMe/a;->a(Ljava/util/concurrent/atomic/AtomicReference;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_1
    invoke-static {p0}, LMe/a;->a(Ljava/util/concurrent/atomic/AtomicReference;)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, LSe/i;->b:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, LJe/c;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-static {v0}, LMe/a;->a(Ljava/util/concurrent/atomic/AtomicReference;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :pswitch_2
    invoke-static {p0}, LMe/a;->a(Ljava/util/concurrent/atomic/AtomicReference;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onComplete()V
    .locals 3

    .line 1
    iget v0, p0, LSe/i;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, LJe/b;

    .line 11
    .line 12
    sget-object v1, LMe/a;->a:LMe/a;

    .line 13
    .line 14
    if-eq v0, v1, :cond_0

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-virtual {p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    new-instance v0, LS3/s;

    .line 24
    .line 25
    iget-object v1, p0, LSe/i;->b:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v1, LHe/h;

    .line 28
    .line 29
    const/16 v2, 0x16

    .line 30
    .line 31
    invoke-direct {v0, v2, v1, p0}, LS3/s;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iget-object v1, p0, LSe/i;->c:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v1, LHe/g;

    .line 37
    .line 38
    invoke-virtual {v1, v0}, LHe/g;->b(LHe/h;)V

    .line 39
    .line 40
    .line 41
    :cond_0
    return-void

    .line 42
    :pswitch_0
    iget-object v0, p0, LSe/i;->c:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v0, LHe/h;

    .line 45
    .line 46
    invoke-interface {v0}, LHe/h;->onComplete()V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :pswitch_1
    iget-object v0, p0, LSe/i;->b:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v0, LHe/b;

    .line 53
    .line 54
    invoke-interface {v0}, LHe/b;->onComplete()V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    nop

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onError(Ljava/lang/Throwable;)V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, LSe/i;->c:Ljava/lang/Object;

    .line 3
    .line 4
    iget-object v2, p0, LSe/i;->b:Ljava/lang/Object;

    .line 5
    .line 6
    iget v3, p0, LSe/i;->a:I

    .line 7
    .line 8
    packed-switch v3, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast v2, LHe/o;

    .line 12
    .line 13
    :try_start_0
    check-cast v1, LA7/h0;

    .line 14
    .line 15
    iget-object v1, v1, LA7/h0;->b:Ljava/lang/Object;

    .line 16
    .line 17
    const-string v3, "The nextFunction returned a null SingleSource."

    .line 18
    .line 19
    invoke-static {v1, v3}, LNe/b;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    check-cast v1, LHe/n;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    new-instance p1, LS3/e;

    .line 25
    .line 26
    const/16 v3, 0xe

    .line 27
    .line 28
    invoke-direct {p1, p0, v0, v2, v3}, LS3/e;-><init>(Ljava/lang/Object;ZLjava/lang/Object;I)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, p1}, LHe/n;->b(LHe/o;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :catchall_0
    move-exception v1

    .line 36
    invoke-static {v1}, Lp7/b;->U(Ljava/lang/Throwable;)V

    .line 37
    .line 38
    .line 39
    new-instance v3, LKe/b;

    .line 40
    .line 41
    const/4 v4, 0x2

    .line 42
    new-array v4, v4, [Ljava/lang/Throwable;

    .line 43
    .line 44
    aput-object p1, v4, v0

    .line 45
    .line 46
    const/4 p1, 0x1

    .line 47
    aput-object v1, v4, p1

    .line 48
    .line 49
    invoke-direct {v3, v4}, LKe/b;-><init>([Ljava/lang/Throwable;)V

    .line 50
    .line 51
    .line 52
    invoke-interface {v2, v3}, LHe/o;->onError(Ljava/lang/Throwable;)V

    .line 53
    .line 54
    .line 55
    :goto_0
    return-void

    .line 56
    :pswitch_0
    check-cast v2, LHe/h;

    .line 57
    .line 58
    invoke-interface {v2, p1}, LHe/h;->onError(Ljava/lang/Throwable;)V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :pswitch_1
    check-cast v1, LHe/h;

    .line 63
    .line 64
    invoke-interface {v1, p1}, LHe/h;->onError(Ljava/lang/Throwable;)V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :pswitch_2
    check-cast v2, LHe/b;

    .line 69
    .line 70
    invoke-interface {v2, p1}, LHe/b;->onError(Ljava/lang/Throwable;)V

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    nop

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onSuccess(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget v0, p0, LSe/i;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LSe/i;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, LHe/o;

    .line 9
    .line 10
    invoke-interface {v0, p1}, LHe/o;->onSuccess(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    iget-object v0, p0, LSe/i;->b:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, LHe/h;

    .line 17
    .line 18
    invoke-interface {v0, p1}, LHe/h;->onSuccess(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_1
    iget-object v0, p0, LSe/i;->c:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, LHe/h;

    .line 25
    .line 26
    invoke-interface {v0, p1}, LHe/h;->onSuccess(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :pswitch_2
    :try_start_0
    iget-object v0, p0, LSe/i;->c:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, LLe/c;

    .line 33
    .line 34
    invoke-interface {v0, p1}, LLe/c;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    const-string v0, "The mapper returned a null CompletableSource"

    .line 39
    .line 40
    invoke-static {p1, v0}, LNe/b;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    check-cast p1, LHe/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    .line 45
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    check-cast v0, LJe/b;

    .line 50
    .line 51
    invoke-static {v0}, LMe/a;->b(LJe/b;)Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-nez v0, :cond_0

    .line 56
    .line 57
    invoke-virtual {p1, p0}, LHe/a;->d(LHe/b;)V

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :catchall_0
    move-exception p1

    .line 62
    invoke-static {p1}, Lp7/b;->U(Ljava/lang/Throwable;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0, p1}, LSe/i;->onError(Ljava/lang/Throwable;)V

    .line 66
    .line 67
    .line 68
    :cond_0
    :goto_0
    return-void

    .line 69
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
