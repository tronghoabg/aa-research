.class public final LSe/b;
.super Ljava/util/concurrent/atomic/AtomicReference;
.source "SourceFile"

# interfaces
.implements LHe/h;
.implements LJe/b;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 3

    const/4 v0, 0x0

    iput v0, p0, LSe/b;->a:I

    sget-object v0, LNe/b;->d:Lya/b;

    sget-object v1, LNe/b;->e:LVa/ka;

    sget-object v2, LNe/b;->c:Lx9/d;

    .line 1
    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 2
    iput-object v0, p0, LSe/b;->b:Ljava/lang/Object;

    .line 3
    iput-object v1, p0, LSe/b;->c:Ljava/lang/Object;

    .line 4
    iput-object v2, p0, LSe/b;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LHe/h;LLe/c;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LSe/b;->a:I

    .line 5
    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 6
    iput-object p1, p0, LSe/b;->b:Ljava/lang/Object;

    .line 7
    iput-object p2, p0, LSe/b;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(LJe/b;)V
    .locals 1

    .line 1
    iget v0, p0, LSe/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LSe/b;->d:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, LJe/b;

    .line 9
    .line 10
    invoke-static {v0, p1}, LMe/a;->f(LJe/b;LJe/b;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    iput-object p1, p0, LSe/b;->d:Ljava/lang/Object;

    .line 17
    .line 18
    iget-object p1, p0, LSe/b;->b:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p1, LHe/h;

    .line 21
    .line 22
    invoke-interface {p1, p0}, LHe/h;->a(LJe/b;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void

    .line 26
    :pswitch_0
    invoke-static {p0, p1}, LMe/a;->e(Ljava/util/concurrent/atomic/AtomicReference;LJe/b;)Z

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final dispose()V
    .locals 1

    .line 1
    iget v0, p0, LSe/b;->a:I

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
    iget-object v0, p0, LSe/b;->d:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, LJe/b;

    .line 12
    .line 13
    invoke-interface {v0}, LJe/b;->dispose()V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :pswitch_0
    invoke-static {p0}, LMe/a;->a(Ljava/util/concurrent/atomic/AtomicReference;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onComplete()V
    .locals 1

    .line 1
    iget v0, p0, LSe/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LSe/b;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, LHe/h;

    .line 9
    .line 10
    invoke-interface {v0}, LHe/h;->onComplete()V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    sget-object v0, LMe/a;->a:LMe/a;

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Ljava/util/concurrent/atomic/AtomicReference;->lazySet(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    :try_start_0
    iget-object v0, p0, LSe/b;->d:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Lx9/d;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception v0

    .line 28
    invoke-static {v0}, Lp7/b;->U(Ljava/lang/Throwable;)V

    .line 29
    .line 30
    .line 31
    invoke-static {v0}, LS3/f;->A(Ljava/lang/Throwable;)V

    .line 32
    .line 33
    .line 34
    :goto_0
    return-void

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onError(Ljava/lang/Throwable;)V
    .locals 4

    .line 1
    iget v0, p0, LSe/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LSe/b;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, LHe/h;

    .line 9
    .line 10
    invoke-interface {v0, p1}, LHe/h;->onError(Ljava/lang/Throwable;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    sget-object v0, LMe/a;->a:LMe/a;

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Ljava/util/concurrent/atomic/AtomicReference;->lazySet(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    :try_start_0
    iget-object v0, p0, LSe/b;->c:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, LVa/ka;

    .line 22
    .line 23
    invoke-virtual {v0, p1}, LVa/ka;->accept(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception v0

    .line 28
    invoke-static {v0}, Lp7/b;->U(Ljava/lang/Throwable;)V

    .line 29
    .line 30
    .line 31
    new-instance v1, LKe/b;

    .line 32
    .line 33
    const/4 v2, 0x2

    .line 34
    new-array v2, v2, [Ljava/lang/Throwable;

    .line 35
    .line 36
    const/4 v3, 0x0

    .line 37
    aput-object p1, v2, v3

    .line 38
    .line 39
    const/4 p1, 0x1

    .line 40
    aput-object v0, v2, p1

    .line 41
    .line 42
    invoke-direct {v1, v2}, LKe/b;-><init>([Ljava/lang/Throwable;)V

    .line 43
    .line 44
    .line 45
    invoke-static {v1}, LS3/f;->A(Ljava/lang/Throwable;)V

    .line 46
    .line 47
    .line 48
    :goto_0
    return-void

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onSuccess(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget v0, p0, LSe/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :try_start_0
    iget-object v0, p0, LSe/b;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, LLe/c;

    .line 9
    .line 10
    invoke-interface {v0, p1}, LLe/c;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const-string v0, "The mapper returned a null MaybeSource"

    .line 15
    .line 16
    invoke-static {p1, v0}, LNe/b;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    check-cast p1, LHe/g;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    .line 21
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, LJe/b;

    .line 26
    .line 27
    invoke-static {v0}, LMe/a;->b(LJe/b;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_0

    .line 32
    .line 33
    new-instance v0, LS3/l;

    .line 34
    .line 35
    invoke-direct {v0, p0}, LS3/l;-><init>(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1, v0}, LHe/g;->b(LHe/h;)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :catch_0
    move-exception p1

    .line 43
    invoke-static {p1}, Lp7/b;->U(Ljava/lang/Throwable;)V

    .line 44
    .line 45
    .line 46
    iget-object v0, p0, LSe/b;->b:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v0, LHe/h;

    .line 49
    .line 50
    invoke-interface {v0, p1}, LHe/h;->onError(Ljava/lang/Throwable;)V

    .line 51
    .line 52
    .line 53
    :cond_0
    :goto_0
    return-void

    .line 54
    :pswitch_0
    sget-object p1, LMe/a;->a:LMe/a;

    .line 55
    .line 56
    invoke-virtual {p0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->lazySet(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    :try_start_1
    iget-object p1, p0, LSe/b;->b:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast p1, Lya/b;

    .line 62
    .line 63
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 64
    .line 65
    .line 66
    goto :goto_1

    .line 67
    :catchall_0
    move-exception p1

    .line 68
    invoke-static {p1}, Lp7/b;->U(Ljava/lang/Throwable;)V

    .line 69
    .line 70
    .line 71
    invoke-static {p1}, LS3/f;->A(Ljava/lang/Throwable;)V

    .line 72
    .line 73
    .line 74
    :goto_1
    return-void

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
