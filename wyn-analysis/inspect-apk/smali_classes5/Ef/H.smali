.class public abstract LEf/H;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LH6/g;

.field public static final b:LH6/g;

.field public static final c:LH6/g;

.field public static final d:LH6/g;

.field public static final e:LH6/g;

.field public static final f:LH6/g;

.field public static final g:LH6/g;

.field public static final h:LH6/g;

.field public static final i:LEf/W;

.field public static final j:LEf/W;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, LH6/g;

    .line 2
    .line 3
    const-string v1, "RESUME_TOKEN"

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    invoke-direct {v0, v1, v2}, LH6/g;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, LEf/H;->a:LH6/g;

    .line 10
    .line 11
    new-instance v0, LH6/g;

    .line 12
    .line 13
    const-string v1, "REMOVED_TASK"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2}, LH6/g;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v0, LEf/H;->b:LH6/g;

    .line 20
    .line 21
    new-instance v0, LH6/g;

    .line 22
    .line 23
    const-string v1, "CLOSED_EMPTY"

    .line 24
    .line 25
    invoke-direct {v0, v1, v2}, LH6/g;-><init>(Ljava/lang/String;I)V

    .line 26
    .line 27
    .line 28
    sput-object v0, LEf/H;->c:LH6/g;

    .line 29
    .line 30
    new-instance v0, LH6/g;

    .line 31
    .line 32
    const-string v1, "COMPLETING_ALREADY"

    .line 33
    .line 34
    const/4 v2, 0x1

    .line 35
    invoke-direct {v0, v1, v2}, LH6/g;-><init>(Ljava/lang/String;I)V

    .line 36
    .line 37
    .line 38
    sput-object v0, LEf/H;->d:LH6/g;

    .line 39
    .line 40
    new-instance v0, LH6/g;

    .line 41
    .line 42
    const-string v1, "COMPLETING_WAITING_CHILDREN"

    .line 43
    .line 44
    invoke-direct {v0, v1, v2}, LH6/g;-><init>(Ljava/lang/String;I)V

    .line 45
    .line 46
    .line 47
    sput-object v0, LEf/H;->e:LH6/g;

    .line 48
    .line 49
    new-instance v0, LH6/g;

    .line 50
    .line 51
    const-string v1, "COMPLETING_RETRY"

    .line 52
    .line 53
    invoke-direct {v0, v1, v2}, LH6/g;-><init>(Ljava/lang/String;I)V

    .line 54
    .line 55
    .line 56
    sput-object v0, LEf/H;->f:LH6/g;

    .line 57
    .line 58
    new-instance v0, LH6/g;

    .line 59
    .line 60
    const-string v1, "TOO_LATE_TO_CANCEL"

    .line 61
    .line 62
    invoke-direct {v0, v1, v2}, LH6/g;-><init>(Ljava/lang/String;I)V

    .line 63
    .line 64
    .line 65
    sput-object v0, LEf/H;->g:LH6/g;

    .line 66
    .line 67
    new-instance v0, LH6/g;

    .line 68
    .line 69
    const-string v1, "SEALED"

    .line 70
    .line 71
    invoke-direct {v0, v1, v2}, LH6/g;-><init>(Ljava/lang/String;I)V

    .line 72
    .line 73
    .line 74
    sput-object v0, LEf/H;->h:LH6/g;

    .line 75
    .line 76
    new-instance v0, LEf/W;

    .line 77
    .line 78
    const/4 v1, 0x0

    .line 79
    invoke-direct {v0, v1}, LEf/W;-><init>(Z)V

    .line 80
    .line 81
    .line 82
    sput-object v0, LEf/H;->i:LEf/W;

    .line 83
    .line 84
    new-instance v0, LEf/W;

    .line 85
    .line 86
    const/4 v1, 0x1

    .line 87
    invoke-direct {v0, v1}, LEf/W;-><init>(Z)V

    .line 88
    .line 89
    .line 90
    sput-object v0, LEf/H;->j:LEf/W;

    .line 91
    .line 92
    return-void
.end method

.method public static final A(Ljava/util/List;Llf/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p1, LEf/g;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, LEf/g;

    .line 7
    .line 8
    iget v1, v0, LEf/g;->c:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, LEf/g;->c:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LEf/g;

    .line 21
    .line 22
    invoke-direct {v0, p1}, Llf/c;-><init>(Ljf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, LEf/g;->b:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 28
    .line 29
    iget v2, v0, LEf/g;->c:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    iget-object p0, v0, LEf/g;->a:Ljava/util/Iterator;

    .line 37
    .line 38
    check-cast p0, Ljava/util/Iterator;

    .line 39
    .line 40
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 45
    .line 46
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw p0

    .line 52
    :cond_2
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    check-cast p0, Ljava/lang/Iterable;

    .line 56
    .line 57
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    :cond_3
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    if-eqz p1, :cond_4

    .line 66
    .line 67
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    check-cast p1, LEf/m0;

    .line 72
    .line 73
    move-object v2, p0

    .line 74
    check-cast v2, Ljava/util/Iterator;

    .line 75
    .line 76
    iput-object v2, v0, LEf/g;->a:Ljava/util/Iterator;

    .line 77
    .line 78
    iput v3, v0, LEf/g;->c:I

    .line 79
    .line 80
    invoke-interface {p1, v0}, LEf/m0;->join(Ljf/c;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    if-ne p1, v1, :cond_3

    .line 85
    .line 86
    return-object v1

    .line 87
    :cond_4
    sget-object p0, Lef/C;->a:Lef/C;

    .line 88
    .line 89
    return-object p0
.end method

.method public static final B([LEf/m0;Llf/c;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p1, LEf/f;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, LEf/f;

    .line 7
    .line 8
    iget v1, v0, LEf/f;->e:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, LEf/f;->e:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LEf/f;

    .line 21
    .line 22
    invoke-direct {v0, p1}, Llf/c;-><init>(Ljf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, LEf/f;->d:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 28
    .line 29
    iget v2, v0, LEf/f;->e:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    iget p0, v0, LEf/f;->c:I

    .line 37
    .line 38
    iget v2, v0, LEf/f;->b:I

    .line 39
    .line 40
    iget-object v4, v0, LEf/f;->a:[Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v4, [LEf/m0;

    .line 43
    .line 44
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    move-object p1, v4

    .line 48
    goto :goto_2

    .line 49
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 50
    .line 51
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 52
    .line 53
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw p0

    .line 57
    :cond_2
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    array-length p1, p0

    .line 61
    const/4 v2, 0x0

    .line 62
    move v5, p1

    .line 63
    move-object p1, p0

    .line 64
    move p0, v5

    .line 65
    :goto_1
    if-ge v2, p0, :cond_4

    .line 66
    .line 67
    aget-object v4, p1, v2

    .line 68
    .line 69
    iput-object p1, v0, LEf/f;->a:[Ljava/lang/Object;

    .line 70
    .line 71
    iput v2, v0, LEf/f;->b:I

    .line 72
    .line 73
    iput p0, v0, LEf/f;->c:I

    .line 74
    .line 75
    iput v3, v0, LEf/f;->e:I

    .line 76
    .line 77
    invoke-interface {v4, v0}, LEf/m0;->join(Ljf/c;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    if-ne v4, v1, :cond_3

    .line 82
    .line 83
    return-object v1

    .line 84
    :cond_3
    :goto_2
    add-int/2addr v2, v3

    .line 85
    goto :goto_1

    .line 86
    :cond_4
    sget-object p0, Lef/C;->a:Lef/C;

    .line 87
    .line 88
    return-object p0
.end method

.method public static final C(LEf/E;Ljf/h;LEf/F;Ltf/p;)LEf/H0;
    .locals 1

    .line 1
    invoke-static {p0, p1}, LEf/H;->E(LEf/E;Ljf/h;)Ljf/h;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    sget-object p1, LEf/F;->b:LEf/F;

    .line 9
    .line 10
    if-ne p2, p1, :cond_0

    .line 11
    .line 12
    new-instance p1, LEf/B0;

    .line 13
    .line 14
    invoke-direct {p1, p0, p3}, LEf/B0;-><init>(Ljf/h;Ltf/p;)V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    new-instance p1, LEf/H0;

    .line 19
    .line 20
    const/4 v0, 0x1

    .line 21
    invoke-direct {p1, p0, v0}, LEf/a;-><init>(Ljf/h;Z)V

    .line 22
    .line 23
    .line 24
    :goto_0
    invoke-virtual {p1, p2, p1, p3}, LEf/a;->a0(LEf/F;LEf/a;Ltf/p;)V

    .line 25
    .line 26
    .line 27
    return-object p1
.end method

.method public static synthetic D(LEf/E;Ljf/h;Ltf/p;I)LEf/H0;
    .locals 2

    .line 1
    sget-object v0, LEf/F;->d:LEf/F;

    .line 2
    .line 3
    and-int/lit8 v1, p3, 0x1

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    sget-object p1, Ljf/i;->a:Ljf/i;

    .line 8
    .line 9
    :cond_0
    and-int/lit8 p3, p3, 0x2

    .line 10
    .line 11
    if-eqz p3, :cond_1

    .line 12
    .line 13
    sget-object v0, LEf/F;->a:LEf/F;

    .line 14
    .line 15
    :cond_1
    invoke-static {p0, p1, v0, p2}, LEf/H;->C(LEf/E;Ljf/h;LEf/F;Ltf/p;)LEf/H0;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method

.method public static final E(LEf/E;Ljf/h;)Ljf/h;
    .locals 1

    .line 1
    invoke-interface {p0}, LEf/E;->getCoroutineContext()Ljf/h;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x1

    .line 6
    invoke-static {p0, p1, v0}, LEf/H;->q(Ljf/h;Ljf/h;Z)Ljf/h;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    sget-object p1, LEf/S;->a:LLf/e;

    .line 11
    .line 12
    if-eq p0, p1, :cond_0

    .line 13
    .line 14
    sget-object v0, Ljf/d;->a:Ljf/d;

    .line 15
    .line 16
    invoke-interface {p0, v0}, Ljf/h;->get(Ljf/g;)Ljf/f;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    invoke-interface {p0, p1}, Ljf/h;->plus(Ljf/h;)Ljf/h;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    :cond_0
    return-object p0
.end method

.method public static final F(LEf/E;Ljf/f;)LKd/a;
    .locals 1

    .line 1
    new-instance v0, LKd/a;

    .line 2
    .line 3
    invoke-interface {p0}, LEf/E;->getCoroutineContext()Ljf/h;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {p0, p1}, Ljf/h;->plus(Ljf/h;)Ljf/h;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-direct {v0, p0}, LKd/a;-><init>(Ljf/h;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public static final G(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    instance-of v0, p0, LEf/x;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, LEf/x;

    .line 6
    .line 7
    iget-object p0, p0, LEf/x;->a:Ljava/lang/Throwable;

    .line 8
    .line 9
    invoke-static {p0}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    :cond_0
    return-object p0
.end method

.method public static final H(LEf/n;Ljf/c;Z)V
    .locals 2

    .line 1
    sget-object v0, LEf/n;->g:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p0, v0}, LEf/n;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-static {v1}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {p0, v0}, LEf/n;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    :goto_0
    if-eqz p2, :cond_6

    .line 23
    .line 24
    const-string p2, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>"

    .line 25
    .line 26
    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    check-cast p1, LJf/f;

    .line 30
    .line 31
    iget-object p2, p1, LJf/f;->e:Llf/c;

    .line 32
    .line 33
    invoke-interface {p2}, Ljf/c;->getContext()Ljf/h;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    iget-object p1, p1, LJf/f;->g:Ljava/lang/Object;

    .line 38
    .line 39
    invoke-static {v0, p1}, LJf/b;->n(Ljf/h;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    sget-object v1, LJf/b;->d:LH6/g;

    .line 44
    .line 45
    if-eq p1, v1, :cond_1

    .line 46
    .line 47
    invoke-static {p2, v0, p1}, LEf/H;->O(Ljf/c;Ljf/h;Ljava/lang/Object;)LEf/P0;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    goto :goto_1

    .line 52
    :cond_1
    const/4 v1, 0x0

    .line 53
    :goto_1
    :try_start_0
    invoke-interface {p2, p0}, Ljf/c;->resumeWith(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    .line 55
    .line 56
    if-eqz v1, :cond_3

    .line 57
    .line 58
    invoke-virtual {v1}, LEf/P0;->c0()Z

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    if-eqz p0, :cond_2

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_2
    return-void

    .line 66
    :cond_3
    :goto_2
    invoke-static {v0, p1}, LJf/b;->g(Ljf/h;Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :catchall_0
    move-exception p0

    .line 71
    if-eqz v1, :cond_4

    .line 72
    .line 73
    invoke-virtual {v1}, LEf/P0;->c0()Z

    .line 74
    .line 75
    .line 76
    move-result p2

    .line 77
    if-eqz p2, :cond_5

    .line 78
    .line 79
    :cond_4
    invoke-static {v0, p1}, LJf/b;->g(Ljf/h;Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    :cond_5
    throw p0

    .line 83
    :cond_6
    invoke-interface {p1, p0}, Ljf/c;->resumeWith(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    return-void
.end method

.method public static final I(Ljf/h;Ltf/p;)Ljava/lang/Object;
    .locals 6

    .line 1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Ljf/d;->a:Ljf/d;

    .line 6
    .line 7
    invoke-interface {p0, v1}, Ljf/h;->get(Ljf/g;)Ljf/f;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    check-cast v2, Ljf/e;

    .line 12
    .line 13
    sget-object v3, Ljf/i;->a:Ljf/i;

    .line 14
    .line 15
    const/4 v4, 0x1

    .line 16
    if-nez v2, :cond_0

    .line 17
    .line 18
    invoke-static {}, LEf/J0;->a()LEf/c0;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-interface {p0, v2}, Ljf/h;->plus(Ljf/h;)Ljf/h;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-static {v3, p0, v4}, LEf/H;->q(Ljf/h;Ljf/h;Z)Ljf/h;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    sget-object v3, LEf/S;->a:LLf/e;

    .line 31
    .line 32
    if-eq p0, v3, :cond_2

    .line 33
    .line 34
    invoke-interface {p0, v1}, Ljf/h;->get(Ljf/g;)Ljf/f;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    if-nez v1, :cond_2

    .line 39
    .line 40
    invoke-interface {p0, v3}, Ljf/h;->plus(Ljf/h;)Ljf/h;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    goto :goto_0

    .line 45
    :cond_0
    instance-of v5, v2, LEf/c0;

    .line 46
    .line 47
    if-eqz v5, :cond_1

    .line 48
    .line 49
    check-cast v2, LEf/c0;

    .line 50
    .line 51
    :cond_1
    sget-object v2, LEf/J0;->a:Ljava/lang/ThreadLocal;

    .line 52
    .line 53
    invoke-virtual {v2}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    check-cast v2, LEf/c0;

    .line 58
    .line 59
    invoke-static {v3, p0, v4}, LEf/H;->q(Ljf/h;Ljf/h;Z)Ljf/h;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    sget-object v3, LEf/S;->a:LLf/e;

    .line 64
    .line 65
    if-eq p0, v3, :cond_2

    .line 66
    .line 67
    invoke-interface {p0, v1}, Ljf/h;->get(Ljf/g;)Ljf/f;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    if-nez v1, :cond_2

    .line 72
    .line 73
    invoke-interface {p0, v3}, Ljf/h;->plus(Ljf/h;)Ljf/h;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    :cond_2
    :goto_0
    new-instance v1, LEf/h;

    .line 78
    .line 79
    invoke-direct {v1, p0, v0, v2}, LEf/h;-><init>(Ljf/h;Ljava/lang/Thread;LEf/c0;)V

    .line 80
    .line 81
    .line 82
    sget-object p0, LEf/F;->a:LEf/F;

    .line 83
    .line 84
    invoke-virtual {v1, p0, v1, p1}, LEf/a;->a0(LEf/F;LEf/a;Ltf/p;)V

    .line 85
    .line 86
    .line 87
    const/4 p0, 0x0

    .line 88
    iget-object p1, v1, LEf/h;->e:LEf/c0;

    .line 89
    .line 90
    if-eqz p1, :cond_3

    .line 91
    .line 92
    sget v0, LEf/c0;->e:I

    .line 93
    .line 94
    invoke-virtual {p1, p0}, LEf/c0;->J(Z)V

    .line 95
    .line 96
    .line 97
    :cond_3
    :goto_1
    if-eqz p1, :cond_4

    .line 98
    .line 99
    :try_start_0
    invoke-virtual {p1}, LEf/c0;->P()J

    .line 100
    .line 101
    .line 102
    move-result-wide v2

    .line 103
    goto :goto_2

    .line 104
    :catchall_0
    move-exception v0

    .line 105
    goto :goto_4

    .line 106
    :cond_4
    const-wide v2, 0x7fffffffffffffffL

    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    :goto_2
    invoke-virtual {v1}, LEf/z0;->I()Z

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    if-nez v0, :cond_5

    .line 116
    .line 117
    invoke-static {v1, v2, v3}, Ljava/util/concurrent/locks/LockSupport;->parkNanos(Ljava/lang/Object;J)V

    .line 118
    .line 119
    .line 120
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    if-eqz v0, :cond_3

    .line 125
    .line 126
    new-instance v0, Ljava/lang/InterruptedException;

    .line 127
    .line 128
    invoke-direct {v0}, Ljava/lang/InterruptedException;-><init>()V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v1, v0}, LEf/z0;->q(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 132
    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_5
    if-eqz p1, :cond_6

    .line 136
    .line 137
    sget v0, LEf/c0;->e:I

    .line 138
    .line 139
    invoke-virtual {p1, p0}, LEf/c0;->z(Z)V

    .line 140
    .line 141
    .line 142
    :cond_6
    sget-object p0, LEf/z0;->a:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 143
    .line 144
    invoke-virtual {p0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    invoke-static {p0}, LEf/H;->N(Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    instance-of p1, p0, LEf/x;

    .line 153
    .line 154
    if-eqz p1, :cond_7

    .line 155
    .line 156
    move-object p1, p0

    .line 157
    check-cast p1, LEf/x;

    .line 158
    .line 159
    goto :goto_3

    .line 160
    :cond_7
    const/4 p1, 0x0

    .line 161
    :goto_3
    if-nez p1, :cond_8

    .line 162
    .line 163
    return-object p0

    .line 164
    :cond_8
    iget-object p0, p1, LEf/x;->a:Ljava/lang/Throwable;

    .line 165
    .line 166
    throw p0

    .line 167
    :goto_4
    if-eqz p1, :cond_9

    .line 168
    .line 169
    sget v1, LEf/c0;->e:I

    .line 170
    .line 171
    invoke-virtual {p1, p0}, LEf/c0;->z(Z)V

    .line 172
    .line 173
    .line 174
    :cond_9
    throw v0
.end method

.method public static synthetic J(Ltf/p;)Ljava/lang/Object;
    .locals 1

    .line 1
    sget-object v0, Ljf/i;->a:Ljf/i;

    .line 2
    .line 3
    invoke-static {v0, p0}, LEf/H;->I(Ljf/h;Ltf/p;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public static final K(LEf/M0;Ltf/p;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, LJf/q;->d:Ljf/c;

    .line 2
    .line 3
    invoke-interface {v0}, Ljf/c;->getContext()Ljf/h;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, LEf/H;->s(Ljf/h;)LEf/M;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-wide v1, p0, LEf/M0;->e:J

    .line 12
    .line 13
    iget-object v3, p0, LEf/a;->c:Ljf/h;

    .line 14
    .line 15
    invoke-interface {v0, v1, v2, p0, v3}, LEf/M;->b(JLEf/M0;Ljf/h;)LEf/U;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    new-instance v1, LEf/V;

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    invoke-direct {v1, v0, v2}, LEf/V;-><init>(Ljava/lang/Object;I)V

    .line 23
    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    invoke-static {p0, v0, v1}, LEf/H;->x(LEf/m0;ZLEf/q0;)LEf/U;

    .line 27
    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    invoke-static {p0, v0, p0, p1}, Lff/B;->L(LJf/q;ZLJf/q;Ltf/p;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
.end method

.method public static final L(Ljf/c;)Ljava/lang/String;
    .locals 3

    .line 1
    instance-of v0, p0, LJf/f;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, LJf/f;

    .line 6
    .line 7
    invoke-virtual {p0}, LJf/f;->toString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    const/16 v0, 0x40

    .line 13
    .line 14
    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-static {p0}, LEf/H;->t(Ljava/lang/Object;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    goto :goto_0

    .line 37
    :catchall_0
    move-exception v1

    .line 38
    invoke-static {v1}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    :goto_0
    invoke-static {v1}, Lef/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    if-nez v2, :cond_1

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-static {p0}, LEf/H;->t(Ljava/lang/Object;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    :goto_1
    check-cast v1, Ljava/lang/String;

    .line 80
    .line 81
    return-object v1
.end method

.method public static final M(J)J
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    sget-object v1, LCf/a;->b:LCf/h;

    .line 3
    .line 4
    const-wide/16 v1, 0x0

    .line 5
    .line 6
    cmp-long v3, p0, v1

    .line 7
    .line 8
    const/4 v4, 0x1

    .line 9
    if-lez v3, :cond_0

    .line 10
    .line 11
    move v3, v4

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move v3, v0

    .line 14
    :goto_0
    if-ne v3, v4, :cond_1

    .line 15
    .line 16
    const-wide/32 v0, 0xf423f

    .line 17
    .line 18
    .line 19
    sget-object v2, LCf/c;->b:LCf/c;

    .line 20
    .line 21
    invoke-static {v0, v1, v2}, LFe/b;->T(JLCf/c;)J

    .line 22
    .line 23
    .line 24
    move-result-wide v0

    .line 25
    invoke-static {p0, p1, v0, v1}, LCf/a;->g(JJ)J

    .line 26
    .line 27
    .line 28
    move-result-wide p0

    .line 29
    invoke-static {p0, p1}, LCf/a;->d(J)J

    .line 30
    .line 31
    .line 32
    move-result-wide p0

    .line 33
    return-wide p0

    .line 34
    :cond_1
    if-nez v3, :cond_2

    .line 35
    .line 36
    return-wide v1

    .line 37
    :cond_2
    new-instance p0, LE5/Q;

    .line 38
    .line 39
    const/16 p1, 0x9

    .line 40
    .line 41
    invoke-direct {p0, v0, p1}, LE5/Q;-><init>(BI)V

    .line 42
    .line 43
    .line 44
    throw p0
.end method

.method public static final N(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    instance-of v0, p0, LEf/i0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p0

    .line 6
    check-cast v0, LEf/i0;

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    :goto_0
    if-eqz v0, :cond_2

    .line 11
    .line 12
    iget-object v0, v0, LEf/i0;->a:LEf/h0;

    .line 13
    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_1
    return-object v0

    .line 18
    :cond_2
    :goto_1
    return-object p0
.end method

.method public static final O(Ljf/c;Ljf/h;Ljava/lang/Object;)LEf/P0;
    .locals 2

    .line 1
    instance-of v0, p0, Llf/d;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    goto :goto_1

    .line 7
    :cond_0
    sget-object v0, LEf/Q0;->a:LEf/Q0;

    .line 8
    .line 9
    invoke-interface {p1, v0}, Ljf/h;->get(Ljf/g;)Ljf/f;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_4

    .line 14
    .line 15
    check-cast p0, Llf/d;

    .line 16
    .line 17
    :cond_1
    instance-of v0, p0, LEf/O;

    .line 18
    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_2
    invoke-interface {p0}, Llf/d;->getCallerFrame()Llf/d;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    if-nez p0, :cond_3

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_3
    instance-of v0, p0, LEf/P0;

    .line 30
    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    move-object v1, p0

    .line 34
    check-cast v1, LEf/P0;

    .line 35
    .line 36
    :goto_0
    if-eqz v1, :cond_4

    .line 37
    .line 38
    invoke-virtual {v1, p1, p2}, LEf/P0;->e0(Ljf/h;Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    :cond_4
    :goto_1
    return-object v1
.end method

.method public static final P(Ljf/h;Ltf/p;Ljf/c;)Ljava/lang/Object;
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-interface {p2}, Ljf/c;->getContext()Ljf/h;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 7
    .line 8
    new-instance v3, LCd/U;

    .line 9
    .line 10
    invoke-direct {v3, v0}, LCd/U;-><init>(I)V

    .line 11
    .line 12
    .line 13
    invoke-interface {p0, v2, v3}, Ljf/h;->fold(Ljava/lang/Object;Ltf/p;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    check-cast v2, Ljava/lang/Boolean;

    .line 18
    .line 19
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    const/4 v3, 0x0

    .line 24
    if-nez v2, :cond_0

    .line 25
    .line 26
    invoke-interface {v1, p0}, Ljf/h;->plus(Ljf/h;)Ljf/h;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-static {v1, p0, v3}, LEf/H;->q(Ljf/h;Ljf/h;Z)Ljf/h;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    :goto_0
    invoke-static {p0}, LEf/H;->p(Ljf/h;)V

    .line 36
    .line 37
    .line 38
    if-ne p0, v1, :cond_1

    .line 39
    .line 40
    new-instance v1, LJf/q;

    .line 41
    .line 42
    invoke-direct {v1, p2, p0}, LJf/q;-><init>(Ljf/c;Ljf/h;)V

    .line 43
    .line 44
    .line 45
    invoke-static {v1, v0, v1, p1}, Lff/B;->L(LJf/q;ZLJf/q;Ltf/p;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    goto :goto_1

    .line 50
    :cond_1
    sget-object v2, Ljf/d;->a:Ljf/d;

    .line 51
    .line 52
    invoke-interface {p0, v2}, Ljf/h;->get(Ljf/g;)Ljf/f;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    invoke-interface {v1, v2}, Ljf/h;->get(Ljf/g;)Ljf/f;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-static {v4, v1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    const/4 v2, 0x0

    .line 65
    if-eqz v1, :cond_2

    .line 66
    .line 67
    new-instance v1, LEf/P0;

    .line 68
    .line 69
    invoke-direct {v1, p2, p0}, LEf/P0;-><init>(Ljf/c;Ljf/h;)V

    .line 70
    .line 71
    .line 72
    iget-object p0, v1, LEf/a;->c:Ljf/h;

    .line 73
    .line 74
    invoke-static {p0, v2}, LJf/b;->n(Ljf/h;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    :try_start_0
    invoke-static {v1, v0, v1, p1}, Lff/B;->L(LJf/q;ZLJf/q;Ltf/p;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 82
    invoke-static {p0, p2}, LJf/b;->g(Ljf/h;Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    move-object p0, p1

    .line 86
    goto :goto_1

    .line 87
    :catchall_0
    move-exception p1

    .line 88
    invoke-static {p0, p2}, LJf/b;->g(Ljf/h;Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    throw p1

    .line 92
    :cond_2
    new-instance v1, LEf/O;

    .line 93
    .line 94
    invoke-direct {v1, p2, p0}, LJf/q;-><init>(Ljf/c;Ljf/h;)V

    .line 95
    .line 96
    .line 97
    :try_start_1
    invoke-static {v1, v1, p1}, LA6/h;->q(Ljf/c;Ljf/c;Ltf/p;)Ljf/c;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    invoke-static {p0}, LA6/h;->A(Ljf/c;)Ljf/c;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    sget-object p1, Lef/C;->a:Lef/C;

    .line 106
    .line 107
    invoke-static {p1, p0}, LJf/b;->h(Ljava/lang/Object;Ljf/c;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 108
    .line 109
    .line 110
    :cond_3
    sget-object p0, LEf/O;->e:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 111
    .line 112
    invoke-virtual {p0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    .line 113
    .line 114
    .line 115
    move-result p1

    .line 116
    if-eqz p1, :cond_6

    .line 117
    .line 118
    const/4 p0, 0x2

    .line 119
    if-ne p1, p0, :cond_5

    .line 120
    .line 121
    sget-object p0, LEf/z0;->a:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 122
    .line 123
    invoke-virtual {p0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    invoke-static {p0}, LEf/H;->N(Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    instance-of p1, p0, LEf/x;

    .line 132
    .line 133
    if-nez p1, :cond_4

    .line 134
    .line 135
    goto :goto_1

    .line 136
    :cond_4
    check-cast p0, LEf/x;

    .line 137
    .line 138
    iget-object p0, p0, LEf/x;->a:Ljava/lang/Throwable;

    .line 139
    .line 140
    throw p0

    .line 141
    :cond_5
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 142
    .line 143
    const-string p1, "Already suspended"

    .line 144
    .line 145
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    throw p0

    .line 149
    :cond_6
    invoke-virtual {p0, v1, v3, v0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    .line 150
    .line 151
    .line 152
    move-result p0

    .line 153
    if-eqz p0, :cond_3

    .line 154
    .line 155
    sget-object p0, Lkf/a;->a:Lkf/a;

    .line 156
    .line 157
    :goto_1
    sget-object p1, Lkf/a;->a:Lkf/a;

    .line 158
    .line 159
    return-object p0

    .line 160
    :catchall_1
    move-exception p0

    .line 161
    invoke-static {v1, p0}, Lr7/e;->v(Ljf/c;Ljava/lang/Throwable;)V

    .line 162
    .line 163
    .line 164
    throw v2
.end method

.method public static final Q(JLtf/p;Llf/c;)Ljava/lang/Object;
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p0, v0

    .line 4
    .line 5
    if-lez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, LEf/M0;

    .line 8
    .line 9
    invoke-direct {v0, p0, p1, p3}, LEf/M0;-><init>(JLlf/c;)V

    .line 10
    .line 11
    .line 12
    invoke-static {v0, p2}, LEf/H;->K(LEf/M0;Ltf/p;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    sget-object p1, Lkf/a;->a:Lkf/a;

    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_0
    new-instance p0, LEf/L0;

    .line 20
    .line 21
    const/4 p1, 0x0

    .line 22
    const-string p2, "Timed out immediately"

    .line 23
    .line 24
    invoke-direct {p0, p2, p1}, LEf/L0;-><init>(Ljava/lang/String;LEf/M0;)V

    .line 25
    .line 26
    .line 27
    throw p0
.end method

.method public static final R(JLtf/p;Ljf/c;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p3, LEf/N0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, LEf/N0;

    .line 7
    .line 8
    iget v1, v0, LEf/N0;->d:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, LEf/N0;->d:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LEf/N0;

    .line 21
    .line 22
    invoke-direct {v0, p3}, Llf/c;-><init>(Ljf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, LEf/N0;->c:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 28
    .line 29
    iget v2, v0, LEf/N0;->d:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    iget-object p0, v0, LEf/N0;->b:Lkotlin/jvm/internal/G;

    .line 37
    .line 38
    :try_start_0
    invoke-static {p3}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_0
    .catch LEf/L0; {:try_start_0 .. :try_end_0} :catch_0

    .line 39
    .line 40
    .line 41
    return-object p3

    .line 42
    :catch_0
    move-exception p1

    .line 43
    goto :goto_1

    .line 44
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 45
    .line 46
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw p0

    .line 52
    :cond_2
    invoke-static {p3}, LFe/e;->U(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    const-wide/16 v4, 0x0

    .line 56
    .line 57
    cmp-long p3, p0, v4

    .line 58
    .line 59
    if-gtz p3, :cond_3

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_3
    new-instance p3, Lkotlin/jvm/internal/G;

    .line 63
    .line 64
    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    .line 65
    .line 66
    .line 67
    :try_start_1
    iput-object p2, v0, LEf/N0;->a:Ltf/p;

    .line 68
    .line 69
    iput-object p3, v0, LEf/N0;->b:Lkotlin/jvm/internal/G;

    .line 70
    .line 71
    iput v3, v0, LEf/N0;->d:I

    .line 72
    .line 73
    new-instance v2, LEf/M0;

    .line 74
    .line 75
    invoke-direct {v2, p0, p1, v0}, LEf/M0;-><init>(JLlf/c;)V

    .line 76
    .line 77
    .line 78
    iput-object v2, p3, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 79
    .line 80
    invoke-static {v2, p2}, LEf/H;->K(LEf/M0;Ltf/p;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p0
    :try_end_1
    .catch LEf/L0; {:try_start_1 .. :try_end_1} :catch_1

    .line 84
    if-ne p0, v1, :cond_4

    .line 85
    .line 86
    return-object v1

    .line 87
    :cond_4
    return-object p0

    .line 88
    :catch_1
    move-exception p1

    .line 89
    move-object p0, p3

    .line 90
    :goto_1
    iget-object p2, p1, LEf/L0;->a:LEf/M0;

    .line 91
    .line 92
    iget-object p0, p0, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 93
    .line 94
    if-ne p2, p0, :cond_5

    .line 95
    .line 96
    :goto_2
    const/4 p0, 0x0

    .line 97
    return-object p0

    .line 98
    :cond_5
    throw p1
.end method

.method public static final S(JLtf/p;Llf/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LEf/H;->M(J)J

    .line 2
    .line 3
    .line 4
    move-result-wide p0

    .line 5
    invoke-static {p0, p1, p2, p3}, LEf/H;->R(JLtf/p;Ljf/c;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static final T(Llf/c;)Ljava/lang/Object;
    .locals 7

    .line 1
    invoke-interface {p0}, Ljf/c;->getContext()Ljf/h;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, LEf/H;->p(Ljf/h;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p0}, LA6/h;->A(Ljf/c;)Ljf/c;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    instance-of v1, p0, LJf/f;

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    check-cast p0, LJf/f;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 p0, 0x0

    .line 20
    :goto_0
    sget-object v1, Lef/C;->a:Lef/C;

    .line 21
    .line 22
    if-nez p0, :cond_1

    .line 23
    .line 24
    :goto_1
    move-object p0, v1

    .line 25
    goto/16 :goto_6

    .line 26
    .line 27
    :cond_1
    iget-object v2, p0, LJf/f;->d:LEf/A;

    .line 28
    .line 29
    invoke-static {v2, v0}, LJf/b;->j(LEf/A;Ljf/h;)Z

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    const/4 v4, 0x1

    .line 34
    if-eqz v3, :cond_2

    .line 35
    .line 36
    iput-object v1, p0, LJf/f;->f:Ljava/lang/Object;

    .line 37
    .line 38
    iput v4, p0, LEf/P;->c:I

    .line 39
    .line 40
    invoke-virtual {v2, v0, p0}, LEf/A;->o(Ljf/h;Ljava/lang/Runnable;)V

    .line 41
    .line 42
    .line 43
    goto :goto_5

    .line 44
    :cond_2
    new-instance v3, LEf/S0;

    .line 45
    .line 46
    sget-object v5, LEf/S0;->b:LEf/l0;

    .line 47
    .line 48
    invoke-direct {v3, v5}, Ljf/a;-><init>(Ljf/g;)V

    .line 49
    .line 50
    .line 51
    invoke-interface {v0, v3}, Ljf/h;->plus(Ljf/h;)Ljf/h;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    iput-object v1, p0, LJf/f;->f:Ljava/lang/Object;

    .line 56
    .line 57
    iput v4, p0, LEf/P;->c:I

    .line 58
    .line 59
    invoke-virtual {v2, v0, p0}, LEf/A;->o(Ljf/h;Ljava/lang/Runnable;)V

    .line 60
    .line 61
    .line 62
    iget-boolean v0, v3, LEf/S0;->a:Z

    .line 63
    .line 64
    if-eqz v0, :cond_8

    .line 65
    .line 66
    invoke-static {}, LEf/J0;->a()LEf/c0;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    iget-object v2, v0, LEf/c0;->d:Lff/l;

    .line 71
    .line 72
    if-eqz v2, :cond_3

    .line 73
    .line 74
    invoke-virtual {v2}, Lff/l;->isEmpty()Z

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    goto :goto_2

    .line 79
    :cond_3
    move v2, v4

    .line 80
    :goto_2
    if-eqz v2, :cond_4

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_4
    iget-wide v2, v0, LEf/c0;->b:J

    .line 84
    .line 85
    const-wide v5, 0x100000000L

    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    cmp-long v2, v2, v5

    .line 91
    .line 92
    if-ltz v2, :cond_5

    .line 93
    .line 94
    move v2, v4

    .line 95
    goto :goto_3

    .line 96
    :cond_5
    const/4 v2, 0x0

    .line 97
    :goto_3
    if-eqz v2, :cond_6

    .line 98
    .line 99
    iput-object v1, p0, LJf/f;->f:Ljava/lang/Object;

    .line 100
    .line 101
    iput v4, p0, LEf/P;->c:I

    .line 102
    .line 103
    invoke-virtual {v0, p0}, LEf/c0;->B(LEf/P;)V

    .line 104
    .line 105
    .line 106
    sget-object p0, Lkf/a;->a:Lkf/a;

    .line 107
    .line 108
    goto :goto_6

    .line 109
    :cond_6
    invoke-virtual {v0, v4}, LEf/c0;->J(Z)V

    .line 110
    .line 111
    .line 112
    :try_start_0
    invoke-virtual {p0}, LEf/P;->run()V

    .line 113
    .line 114
    .line 115
    :cond_7
    invoke-virtual {v0}, LEf/c0;->Q()Z

    .line 116
    .line 117
    .line 118
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 119
    if-nez v2, :cond_7

    .line 120
    .line 121
    :goto_4
    invoke-virtual {v0, v4}, LEf/c0;->z(Z)V

    .line 122
    .line 123
    .line 124
    goto :goto_1

    .line 125
    :catchall_0
    move-exception v2

    .line 126
    :try_start_1
    invoke-virtual {p0, v2}, LEf/P;->h(Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 127
    .line 128
    .line 129
    goto :goto_4

    .line 130
    :catchall_1
    move-exception p0

    .line 131
    invoke-virtual {v0, v4}, LEf/c0;->z(Z)V

    .line 132
    .line 133
    .line 134
    throw p0

    .line 135
    :cond_8
    :goto_5
    sget-object p0, Lkf/a;->a:Lkf/a;

    .line 136
    .line 137
    :goto_6
    sget-object v0, Lkf/a;->a:Lkf/a;

    .line 138
    .line 139
    if-ne p0, v0, :cond_9

    .line 140
    .line 141
    return-object p0

    .line 142
    :cond_9
    return-object v1
.end method

.method public static final a(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/util/concurrent/CancellationException;
    .locals 1

    .line 1
    new-instance v0, Ljava/util/concurrent/CancellationException;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method public static b()LEf/u;
    .locals 2

    .line 1
    new-instance v0, LEf/u;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, LEf/z0;-><init>(Z)V

    .line 5
    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-virtual {v0, v1}, LEf/z0;->G(LEf/m0;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public static final c(Ljf/h;)LKd/a;
    .locals 2

    .line 1
    new-instance v0, LKd/a;

    .line 2
    .line 3
    sget-object v1, LEf/l0;->a:LEf/l0;

    .line 4
    .line 5
    invoke-interface {p0, v1}, Ljf/h;->get(Ljf/g;)Ljf/f;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-static {}, LEf/H;->d()LEf/o0;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-interface {p0, v1}, Ljf/h;->plus(Ljf/h;)Ljf/h;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    :goto_0
    invoke-direct {v0, p0}, LKd/a;-><init>(Ljf/h;)V

    .line 21
    .line 22
    .line 23
    return-object v0
.end method

.method public static d()LEf/o0;
    .locals 2

    .line 1
    new-instance v0, LEf/o0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LEf/o0;-><init>(LEf/m0;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public static final e()LKd/a;
    .locals 3

    .line 1
    new-instance v0, LKd/a;

    .line 2
    .line 3
    invoke-static {}, LEf/H;->f()LEf/I0;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    sget-object v2, LEf/S;->a:LLf/e;

    .line 8
    .line 9
    sget-object v2, LJf/n;->a:LFf/e;

    .line 10
    .line 11
    invoke-static {v1, v2}, LFe/e;->O(Ljf/f;Ljf/h;)Ljf/h;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-direct {v0, v1}, LKd/a;-><init>(Ljf/h;)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method

.method public static f()LEf/I0;
    .locals 2

    .line 1
    new-instance v0, LEf/I0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LEf/o0;-><init>(LEf/m0;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public static final g(LEf/A;)Ljava/util/concurrent/Executor;
    .locals 1

    .line 1
    instance-of v0, p0, LEf/d0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p0

    .line 6
    check-cast v0, LEf/d0;

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    :goto_0
    if-eqz v0, :cond_2

    .line 11
    .line 12
    invoke-virtual {v0}, LEf/d0;->z()Ljava/util/concurrent/Executor;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_1
    return-object v0

    .line 20
    :cond_2
    :goto_1
    new-instance v0, LEf/Q;

    .line 21
    .line 22
    invoke-direct {v0, p0}, LEf/Q;-><init>(LEf/A;)V

    .line 23
    .line 24
    .line 25
    return-object v0
.end method

.method public static h(LEf/E;Ljf/h;Ltf/p;I)LEf/L;
    .locals 2

    .line 1
    sget-object v0, LEf/F;->d:LEf/F;

    .line 2
    .line 3
    and-int/lit8 v1, p3, 0x1

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    sget-object p1, Ljf/i;->a:Ljf/i;

    .line 8
    .line 9
    :cond_0
    and-int/lit8 p3, p3, 0x2

    .line 10
    .line 11
    if-eqz p3, :cond_1

    .line 12
    .line 13
    sget-object v0, LEf/F;->a:LEf/F;

    .line 14
    .line 15
    :cond_1
    invoke-static {p0, p1}, LEf/H;->E(LEf/E;Ljf/h;)Ljf/h;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    sget-object p1, LEf/F;->b:LEf/F;

    .line 20
    .line 21
    if-ne v0, p1, :cond_2

    .line 22
    .line 23
    new-instance p1, LEf/A0;

    .line 24
    .line 25
    invoke-direct {p1, p0, p2}, LEf/A0;-><init>(Ljf/h;Ltf/p;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_2
    new-instance p1, LEf/L;

    .line 30
    .line 31
    const/4 p3, 0x1

    .line 32
    invoke-direct {p1, p0, p3}, LEf/a;-><init>(Ljf/h;Z)V

    .line 33
    .line 34
    .line 35
    :goto_0
    invoke-virtual {p1, v0, p1, p2}, LEf/a;->a0(LEf/F;LEf/a;Ltf/p;)V

    .line 36
    .line 37
    .line 38
    return-object p1
.end method

.method public static final i(Ljava/util/ArrayList;Llf/c;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget-object p0, Lff/v;->a:Lff/v;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    new-instance v0, LEf/e;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    new-array v1, v1, [LEf/K;

    .line 14
    .line 15
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    check-cast p0, [LEf/K;

    .line 20
    .line 21
    invoke-direct {v0, p0}, LEf/e;-><init>([LEf/K;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p1}, LEf/e;->a(Llf/c;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0
.end method

.method public static final j(LEf/E;Ljava/util/concurrent/CancellationException;)V
    .locals 2

    .line 1
    invoke-interface {p0}, LEf/E;->getCoroutineContext()Ljf/h;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, LEf/l0;->a:LEf/l0;

    .line 6
    .line 7
    invoke-interface {v0, v1}, Ljf/h;->get(Ljf/g;)Ljf/f;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, LEf/m0;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-interface {v0, p1}, LEf/m0;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 20
    .line 21
    new-instance v0, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    const-string v1, "Scope cannot be cancelled because it does not have a job: "

    .line 24
    .line 25
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw p1
.end method

.method public static final k(LEf/m0;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    invoke-static {p1, p2}, LEf/H;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/util/concurrent/CancellationException;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p0, p1}, LEf/m0;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static final l(Ltf/p;Ljf/c;)Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, LJf/q;

    .line 2
    .line 3
    invoke-interface {p1}, Ljf/c;->getContext()Ljf/h;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, p1, v1}, LJf/q;-><init>(Ljf/c;Ljf/h;)V

    .line 8
    .line 9
    .line 10
    const/4 p1, 0x1

    .line 11
    invoke-static {v0, p1, v0, p0}, Lff/B;->L(LJf/q;ZLJf/q;Ltf/p;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    sget-object p1, Lkf/a;->a:Lkf/a;

    .line 16
    .line 17
    return-object p0
.end method

.method public static final m(JLjf/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p0, v0

    .line 4
    .line 5
    sget-object v1, Lef/C;->a:Lef/C;

    .line 6
    .line 7
    if-gtz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance v0, LEf/n;

    .line 11
    .line 12
    invoke-static {p2}, LA6/h;->A(Ljf/c;)Ljf/c;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    const/4 v2, 0x1

    .line 17
    invoke-direct {v0, v2, p2}, LEf/n;-><init>(ILjf/c;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, LEf/n;->t()V

    .line 21
    .line 22
    .line 23
    const-wide v2, 0x7fffffffffffffffL

    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    cmp-long p2, p0, v2

    .line 29
    .line 30
    if-gez p2, :cond_1

    .line 31
    .line 32
    iget-object p2, v0, LEf/n;->e:Ljf/h;

    .line 33
    .line 34
    invoke-static {p2}, LEf/H;->s(Ljf/h;)LEf/M;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    invoke-interface {p2, p0, p1, v0}, LEf/M;->h(JLEf/n;)V

    .line 39
    .line 40
    .line 41
    :cond_1
    invoke-virtual {v0}, LEf/n;->s()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    sget-object p1, Lkf/a;->a:Lkf/a;

    .line 46
    .line 47
    if-ne p0, p1, :cond_2

    .line 48
    .line 49
    return-object p0

    .line 50
    :cond_2
    :goto_0
    return-object v1
.end method

.method public static final n(JLlf/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LEf/H;->M(J)J

    .line 2
    .line 3
    .line 4
    move-result-wide p0

    .line 5
    invoke-static {p0, p1, p2}, LEf/H;->m(JLjf/c;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    sget-object p1, Lkf/a;->a:Lkf/a;

    .line 10
    .line 11
    if-ne p0, p1, :cond_0

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    sget-object p0, Lef/C;->a:Lef/C;

    .line 15
    .line 16
    return-object p0
.end method

.method public static final o(LEf/E;)V
    .locals 0

    .line 1
    invoke-interface {p0}, LEf/E;->getCoroutineContext()Ljf/h;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, LEf/H;->p(Ljf/h;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static final p(Ljf/h;)V
    .locals 1

    .line 1
    sget-object v0, LEf/l0;->a:LEf/l0;

    .line 2
    .line 3
    invoke-interface {p0, v0}, Ljf/h;->get(Ljf/g;)Ljf/f;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, LEf/m0;

    .line 8
    .line 9
    if-eqz p0, :cond_1

    .line 10
    .line 11
    invoke-interface {p0}, LEf/m0;->isActive()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-interface {p0}, LEf/m0;->getCancellationException()Ljava/util/concurrent/CancellationException;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    throw p0

    .line 23
    :cond_1
    :goto_0
    return-void
.end method

.method public static final q(Ljf/h;Ljf/h;Z)Ljf/h;
    .locals 3

    .line 1
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 2
    .line 3
    new-instance v0, LCd/U;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-direct {v0, v1}, LCd/U;-><init>(I)V

    .line 7
    .line 8
    .line 9
    invoke-interface {p0, p2, v0}, Ljf/h;->fold(Ljava/lang/Object;Ltf/p;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Ljava/lang/Boolean;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    new-instance v1, LCd/U;

    .line 20
    .line 21
    const/4 v2, 0x1

    .line 22
    invoke-direct {v1, v2}, LCd/U;-><init>(I)V

    .line 23
    .line 24
    .line 25
    invoke-interface {p1, p2, v1}, Ljf/h;->fold(Ljava/lang/Object;Ltf/p;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    check-cast p2, Ljava/lang/Boolean;

    .line 30
    .line 31
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    if-nez v0, :cond_0

    .line 36
    .line 37
    if-nez p2, :cond_0

    .line 38
    .line 39
    invoke-interface {p0, p1}, Ljf/h;->plus(Ljf/h;)Ljf/h;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0

    .line 44
    :cond_0
    sget-object v0, Ljf/i;->a:Ljf/i;

    .line 45
    .line 46
    new-instance v1, LCd/U;

    .line 47
    .line 48
    const/4 v2, 0x2

    .line 49
    invoke-direct {v1, v2}, LCd/U;-><init>(I)V

    .line 50
    .line 51
    .line 52
    invoke-interface {p0, v0, v1}, Ljf/h;->fold(Ljava/lang/Object;Ltf/p;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    check-cast p0, Ljf/h;

    .line 57
    .line 58
    if-eqz p2, :cond_1

    .line 59
    .line 60
    check-cast p1, Ljf/h;

    .line 61
    .line 62
    new-instance p2, LCd/U;

    .line 63
    .line 64
    const/4 v1, 0x3

    .line 65
    invoke-direct {p2, v1}, LCd/U;-><init>(I)V

    .line 66
    .line 67
    .line 68
    invoke-interface {p1, v0, p2}, Ljf/h;->fold(Ljava/lang/Object;Ltf/p;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    :cond_1
    check-cast p1, Ljf/h;

    .line 73
    .line 74
    invoke-interface {p0, p1}, Ljf/h;->plus(Ljf/h;)Ljf/h;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    return-object p0
.end method

.method public static final r(Ljava/util/concurrent/Executor;)LEf/A;
    .locals 1

    .line 1
    instance-of v0, p0, LEf/Q;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p0

    .line 6
    check-cast v0, LEf/Q;

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    :goto_0
    if-eqz v0, :cond_2

    .line 11
    .line 12
    iget-object v0, v0, LEf/Q;->a:LEf/A;

    .line 13
    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_1
    return-object v0

    .line 18
    :cond_2
    :goto_1
    new-instance v0, LEf/e0;

    .line 19
    .line 20
    invoke-direct {v0, p0}, LEf/e0;-><init>(Ljava/util/concurrent/Executor;)V

    .line 21
    .line 22
    .line 23
    return-object v0
.end method

.method public static final s(Ljf/h;)LEf/M;
    .locals 1

    .line 1
    sget-object v0, Ljf/d;->a:Ljf/d;

    .line 2
    .line 3
    invoke-interface {p0, v0}, Ljf/h;->get(Ljf/g;)Ljf/f;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    instance-of v0, p0, LEf/M;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    check-cast p0, LEf/M;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    :goto_0
    if-nez p0, :cond_1

    .line 16
    .line 17
    sget-object p0, LEf/J;->a:LEf/M;

    .line 18
    .line 19
    :cond_1
    return-object p0
.end method

.method public static final t(Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    invoke-static {p0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static final u(Ljf/h;)LEf/m0;
    .locals 3

    .line 1
    sget-object v0, LEf/l0;->a:LEf/l0;

    .line 2
    .line 3
    invoke-interface {p0, v0}, Ljf/h;->get(Ljf/g;)Ljf/f;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LEf/m0;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 13
    .line 14
    new-instance v1, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    const-string v2, "Current context doesn\'t contain Job in it: "

    .line 17
    .line 18
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw v0
.end method

.method public static final v(Ljf/c;)LEf/n;
    .locals 6

    .line 1
    instance-of v0, p0, LJf/f;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, LEf/n;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-direct {v0, v1, p0}, LEf/n;-><init>(ILjf/c;)V

    .line 9
    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    move-object v0, p0

    .line 13
    check-cast v0, LJf/f;

    .line 14
    .line 15
    :cond_1
    :goto_0
    sget-object v1, LJf/f;->h:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 16
    .line 17
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    sget-object v3, LJf/b;->c:LH6/g;

    .line 22
    .line 23
    const/4 v4, 0x0

    .line 24
    if-nez v2, :cond_2

    .line 25
    .line 26
    invoke-virtual {v1, v0, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    move-object v2, v4

    .line 30
    goto :goto_1

    .line 31
    :cond_2
    instance-of v5, v2, LEf/n;

    .line 32
    .line 33
    if-eqz v5, :cond_8

    .line 34
    .line 35
    :cond_3
    invoke-virtual {v1, v0, v2, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    if-eqz v5, :cond_7

    .line 40
    .line 41
    check-cast v2, LEf/n;

    .line 42
    .line 43
    :goto_1
    if-eqz v2, :cond_6

    .line 44
    .line 45
    sget-object v0, LEf/n;->g:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 46
    .line 47
    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    instance-of v3, v1, LEf/w;

    .line 52
    .line 53
    if-eqz v3, :cond_4

    .line 54
    .line 55
    check-cast v1, LEf/w;

    .line 56
    .line 57
    iget-object v1, v1, LEf/w;->d:Ljava/lang/Object;

    .line 58
    .line 59
    if-eqz v1, :cond_4

    .line 60
    .line 61
    invoke-virtual {v2}, LEf/n;->p()V

    .line 62
    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_4
    const v1, 0x1fffffff

    .line 66
    .line 67
    .line 68
    sget-object v3, LEf/n;->f:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 69
    .line 70
    invoke-virtual {v3, v2, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->set(Ljava/lang/Object;I)V

    .line 71
    .line 72
    .line 73
    sget-object v1, LEf/b;->a:LEf/b;

    .line 74
    .line 75
    invoke-virtual {v0, v2, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    move-object v4, v2

    .line 79
    :goto_2
    if-nez v4, :cond_5

    .line 80
    .line 81
    goto :goto_3

    .line 82
    :cond_5
    return-object v4

    .line 83
    :cond_6
    :goto_3
    new-instance v0, LEf/n;

    .line 84
    .line 85
    const/4 v1, 0x2

    .line 86
    invoke-direct {v0, v1, p0}, LEf/n;-><init>(ILjf/c;)V

    .line 87
    .line 88
    .line 89
    return-object v0

    .line 90
    :cond_7
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    if-eq v5, v2, :cond_3

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_8
    if-eq v2, v3, :cond_1

    .line 98
    .line 99
    instance-of v1, v2, Ljava/lang/Throwable;

    .line 100
    .line 101
    if-eqz v1, :cond_9

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_9
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 105
    .line 106
    new-instance v0, Ljava/lang/StringBuilder;

    .line 107
    .line 108
    const-string v1, "Inconsistent state "

    .line 109
    .line 110
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    throw p0
.end method

.method public static final w(Ljf/h;Ljava/lang/Throwable;)V
    .locals 3

    .line 1
    instance-of v0, p1, LEf/N;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, LEf/N;

    .line 6
    .line 7
    iget-object p1, p1, LEf/N;->a:Ljava/lang/Throwable;

    .line 8
    .line 9
    :cond_0
    :try_start_0
    sget-object v0, LEf/B;->a:LEf/B;

    .line 10
    .line 11
    invoke-interface {p0, v0}, Ljf/h;->get(Ljf/g;)Ljf/f;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, LEf/C;

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    invoke-interface {v0, p0, p1}, LEf/C;->handleException(Ljf/h;Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :catchall_0
    move-exception v0

    .line 24
    goto :goto_0

    .line 25
    :cond_1
    invoke-static {p0, p1}, LJf/b;->d(Ljf/h;Ljava/lang/Throwable;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :goto_0
    if-ne p1, v0, :cond_2

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_2
    new-instance v1, Ljava/lang/RuntimeException;

    .line 33
    .line 34
    const-string v2, "Exception while trying to handle coroutine exception"

    .line 35
    .line 36
    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 37
    .line 38
    .line 39
    invoke-static {v1, p1}, LFe/b;->d(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 40
    .line 41
    .line 42
    move-object p1, v1

    .line 43
    :goto_1
    invoke-static {p0, p1}, LJf/b;->d(Ljf/h;Ljava/lang/Throwable;)V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public static final x(LEf/m0;ZLEf/q0;)LEf/U;
    .locals 9

    .line 1
    instance-of v0, p0, LEf/z0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, LEf/z0;

    .line 6
    .line 7
    invoke-virtual {p0, p1, p2}, LEf/z0;->H(ZLEf/q0;)LEf/U;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    invoke-virtual {p2}, LEf/q0;->i()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    new-instance v1, LEf/p0;

    .line 17
    .line 18
    const-string v6, "invoke(Ljava/lang/Throwable;)V"

    .line 19
    .line 20
    const/4 v7, 0x0

    .line 21
    const/4 v2, 0x1

    .line 22
    const-class v4, LEf/q0;

    .line 23
    .line 24
    const-string v5, "invoke"

    .line 25
    .line 26
    const/4 v8, 0x0

    .line 27
    move-object v3, p2

    .line 28
    invoke-direct/range {v1 .. v8}, LEf/p0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 29
    .line 30
    .line 31
    invoke-interface {p0, v0, p1, v1}, LEf/m0;->invokeOnCompletion(ZZLtf/l;)LEf/U;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0
.end method

.method public static final y(LEf/E;)Z
    .locals 1

    .line 1
    invoke-interface {p0}, LEf/E;->getCoroutineContext()Ljf/h;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object v0, LEf/l0;->a:LEf/l0;

    .line 6
    .line 7
    invoke-interface {p0, v0}, Ljf/h;->get(Ljf/g;)Ljf/f;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, LEf/m0;

    .line 12
    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    invoke-interface {p0}, LEf/m0;->isActive()Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0

    .line 20
    :cond_0
    const/4 p0, 0x1

    .line 21
    return p0
.end method

.method public static final z(Ljf/h;)Z
    .locals 1

    .line 1
    sget-object v0, LEf/l0;->a:LEf/l0;

    .line 2
    .line 3
    invoke-interface {p0, v0}, Ljf/h;->get(Ljf/g;)Ljf/f;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, LEf/m0;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-interface {p0}, LEf/m0;->isActive()Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    :cond_0
    const/4 p0, 0x1

    .line 17
    return p0
.end method
