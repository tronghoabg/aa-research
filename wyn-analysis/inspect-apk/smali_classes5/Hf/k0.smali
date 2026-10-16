.class public abstract LHf/k0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LH6/g;

.field public static final b:LH6/g;

.field public static final c:LH6/g;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, LH6/g;

    .line 2
    .line 3
    const-string v1, "NO_VALUE"

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    invoke-direct {v0, v1, v2}, LH6/g;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, LHf/k0;->a:LH6/g;

    .line 10
    .line 11
    new-instance v0, LH6/g;

    .line 12
    .line 13
    const-string v1, "NONE"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2}, LH6/g;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v0, LHf/k0;->b:LH6/g;

    .line 20
    .line 21
    new-instance v0, LH6/g;

    .line 22
    .line 23
    const-string v1, "PENDING"

    .line 24
    .line 25
    invoke-direct {v0, v1, v2}, LH6/g;-><init>(Ljava/lang/String;I)V

    .line 26
    .line 27
    .line 28
    sput-object v0, LHf/k0;->c:LH6/g;

    .line 29
    .line 30
    return-void
.end method

.method public static final a(IILGf/a;)LHf/j0;
    .locals 1

    .line 1
    if-ltz p0, :cond_4

    .line 2
    .line 3
    if-ltz p1, :cond_3

    .line 4
    .line 5
    if-gtz p0, :cond_1

    .line 6
    .line 7
    if-gtz p1, :cond_1

    .line 8
    .line 9
    sget-object v0, LGf/a;->a:LGf/a;

    .line 10
    .line 11
    if-ne p2, v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    new-instance p0, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    const-string p1, "replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy "

    .line 17
    .line 18
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 29
    .line 30
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw p1

    .line 38
    :cond_1
    :goto_0
    add-int/2addr p1, p0

    .line 39
    if-gez p1, :cond_2

    .line 40
    .line 41
    const p1, 0x7fffffff

    .line 42
    .line 43
    .line 44
    :cond_2
    new-instance v0, LHf/j0;

    .line 45
    .line 46
    invoke-direct {v0, p0, p1, p2}, LHf/j0;-><init>(IILGf/a;)V

    .line 47
    .line 48
    .line 49
    return-object v0

    .line 50
    :cond_3
    const-string p0, "extraBufferCapacity cannot be negative, but was "

    .line 51
    .line 52
    invoke-static {p1, p0}, Lka/n;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 57
    .line 58
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    throw p1

    .line 66
    :cond_4
    const-string p1, "replay cannot be negative, but was "

    .line 67
    .line 68
    invoke-static {p0, p1}, Lka/n;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 73
    .line 74
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    throw p1
.end method

.method public static synthetic b(III)LHf/j0;
    .locals 3

    .line 1
    sget-object v0, LGf/a;->b:LGf/a;

    .line 2
    .line 3
    and-int/lit8 v1, p2, 0x1

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    move p0, v2

    .line 9
    :cond_0
    and-int/lit8 v1, p2, 0x2

    .line 10
    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    move p1, v2

    .line 14
    :cond_1
    and-int/lit8 p2, p2, 0x4

    .line 15
    .line 16
    if-eqz p2, :cond_2

    .line 17
    .line 18
    sget-object v0, LGf/a;->a:LGf/a;

    .line 19
    .line 20
    :cond_2
    invoke-static {p0, p1, v0}, LHf/k0;->a(IILGf/a;)LHf/j0;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method

.method public static final c(Ljava/lang/Object;)LHf/x0;
    .locals 1

    .line 1
    new-instance v0, LHf/x0;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    sget-object p0, LIf/c;->b:LH6/g;

    .line 6
    .line 7
    :cond_0
    invoke-direct {v0, p0}, LHf/x0;-><init>(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public static final d(LHf/m;Ljava/lang/Object;Ljava/lang/Object;Llf/c;)V
    .locals 4

    .line 1
    instance-of v0, p3, LHf/D;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, LHf/D;

    .line 7
    .line 8
    iget v1, v0, LHf/D;->c:I

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
    iput v1, v0, LHf/D;->c:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LHf/D;

    .line 21
    .line 22
    invoke-direct {v0, p3}, Llf/c;-><init>(Ljf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, LHf/D;->b:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 28
    .line 29
    iget v2, v0, LHf/D;->c:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-eq v2, v3, :cond_1

    .line 35
    .line 36
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 37
    .line 38
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 39
    .line 40
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    throw p0

    .line 44
    :cond_1
    iget-object p2, v0, LHf/D;->a:Ljava/lang/Object;

    .line 45
    .line 46
    invoke-static {p3}, LFe/e;->U(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_2
    invoke-static {p3}, LFe/e;->U(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    iput-object p2, v0, LHf/D;->a:Ljava/lang/Object;

    .line 54
    .line 55
    iput v3, v0, LHf/D;->c:I

    .line 56
    .line 57
    invoke-interface {p0, p1, v0}, LHf/m;->emit(Ljava/lang/Object;Ljf/c;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    if-ne p0, v1, :cond_3

    .line 62
    .line 63
    return-void

    .line 64
    :cond_3
    :goto_1
    new-instance p0, LIf/a;

    .line 65
    .line 66
    invoke-direct {p0, p2}, LIf/a;-><init>(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    throw p0
.end method

.method public static final e(LHf/D0;Ltf/q;Ljava/lang/Throwable;Llf/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p3, LHf/r;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, LHf/r;

    .line 7
    .line 8
    iget v1, v0, LHf/r;->c:I

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
    iput v1, v0, LHf/r;->c:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LHf/r;

    .line 21
    .line 22
    invoke-direct {v0, p3}, Llf/c;-><init>(Ljf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, LHf/r;->b:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 28
    .line 29
    iget v2, v0, LHf/r;->c:I

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
    iget-object p2, v0, LHf/r;->a:Ljava/lang/Throwable;

    .line 37
    .line 38
    :try_start_0
    invoke-static {p3}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :catchall_0
    move-exception p0

    .line 43
    goto :goto_2

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
    :try_start_1
    iput-object p2, v0, LHf/r;->a:Ljava/lang/Throwable;

    .line 56
    .line 57
    iput v3, v0, LHf/r;->c:I

    .line 58
    .line 59
    invoke-interface {p1, p0, p2, v0}, Ltf/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 63
    if-ne p0, v1, :cond_3

    .line 64
    .line 65
    return-object v1

    .line 66
    :cond_3
    :goto_1
    sget-object p0, Lef/C;->a:Lef/C;

    .line 67
    .line 68
    return-object p0

    .line 69
    :goto_2
    if-eqz p2, :cond_4

    .line 70
    .line 71
    if-eq p2, p0, :cond_4

    .line 72
    .line 73
    invoke-static {p0, p2}, LFe/b;->d(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 74
    .line 75
    .line 76
    :cond_4
    throw p0
.end method

.method public static final f([Ljava/lang/Object;JLjava/lang/Object;)V
    .locals 0

    .line 1
    long-to-int p1, p1

    .line 2
    array-length p2, p0

    .line 3
    add-int/lit8 p2, p2, -0x1

    .line 4
    .line 5
    and-int/2addr p1, p2

    .line 6
    aput-object p3, p0, p1

    .line 7
    .line 8
    return-void
.end method

.method public static g(LHf/l;I)LHf/l;
    .locals 7

    .line 1
    sget-object v0, LGf/a;->a:LGf/a;

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-gez p1, :cond_1

    .line 5
    .line 6
    const/4 v2, -0x2

    .line 7
    if-eq p1, v2, :cond_1

    .line 8
    .line 9
    if-ne p1, v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const-string p0, "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was "

    .line 13
    .line 14
    invoke-static {p1, p0}, Lka/n;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw p1

    .line 28
    :cond_1
    :goto_0
    if-ne p1, v1, :cond_2

    .line 29
    .line 30
    sget-object v0, LGf/a;->b:LGf/a;

    .line 31
    .line 32
    const/4 p1, 0x0

    .line 33
    :cond_2
    move v4, p1

    .line 34
    move-object v5, v0

    .line 35
    instance-of p1, p0, LIf/w;

    .line 36
    .line 37
    if-eqz p1, :cond_3

    .line 38
    .line 39
    check-cast p0, LIf/w;

    .line 40
    .line 41
    const/4 p1, 0x1

    .line 42
    const/4 v0, 0x0

    .line 43
    invoke-static {p0, v0, v4, v5, p1}, LIf/c;->a(LIf/w;LFf/e;ILGf/a;I)LHf/l;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0

    .line 48
    :cond_3
    new-instance v1, LIf/j;

    .line 49
    .line 50
    const/4 v6, 0x2

    .line 51
    const/4 v3, 0x0

    .line 52
    move-object v2, p0

    .line 53
    invoke-direct/range {v1 .. v6}, LIf/j;-><init>(LHf/l;LFf/e;ILGf/a;I)V

    .line 54
    .line 55
    .line 56
    return-object v1
.end method

.method public static final h(Ltf/p;)LHf/c;
    .locals 4

    .line 1
    new-instance v0, LHf/c;

    .line 2
    .line 3
    sget-object v1, Ljf/i;->a:Ljf/i;

    .line 4
    .line 5
    sget-object v2, LGf/a;->a:LGf/a;

    .line 6
    .line 7
    const/4 v3, -0x2

    .line 8
    invoke-direct {v0, p0, v1, v3, v2}, LHf/c;-><init>(Ltf/p;Ljf/h;ILGf/a;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public static final i(LHf/l;LHf/m;Llf/c;)Ljava/io/Serializable;
    .locals 5

    .line 1
    instance-of v0, p2, LHf/x;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, LHf/x;

    .line 7
    .line 8
    iget v1, v0, LHf/x;->c:I

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
    iput v1, v0, LHf/x;->c:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LHf/x;

    .line 21
    .line 22
    invoke-direct {v0, p2}, Llf/c;-><init>(Ljf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, LHf/x;->b:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 28
    .line 29
    iget v2, v0, LHf/x;->c:I

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
    iget-object p0, v0, LHf/x;->a:Lkotlin/jvm/internal/G;

    .line 37
    .line 38
    :try_start_0
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :catchall_0
    move-exception p1

    .line 43
    goto :goto_2

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
    invoke-static {p2}, LA7/p0;->s(Ljava/lang/Object;)Lkotlin/jvm/internal/G;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    :try_start_1
    new-instance v2, LHf/z;

    .line 57
    .line 58
    const/4 v4, 0x0

    .line 59
    invoke-direct {v2, v4, p1, p2}, LHf/z;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    iput-object p2, v0, LHf/x;->a:Lkotlin/jvm/internal/G;

    .line 63
    .line 64
    iput v3, v0, LHf/x;->c:I

    .line 65
    .line 66
    invoke-interface {p0, v2, v0}, LHf/l;->collect(LHf/m;Ljf/c;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 70
    if-ne p0, v1, :cond_3

    .line 71
    .line 72
    return-object v1

    .line 73
    :cond_3
    :goto_1
    const/4 p0, 0x0

    .line 74
    return-object p0

    .line 75
    :catchall_1
    move-exception p1

    .line 76
    move-object p0, p2

    .line 77
    :goto_2
    iget-object p0, p0, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast p0, Ljava/lang/Throwable;

    .line 80
    .line 81
    if-eqz p0, :cond_4

    .line 82
    .line 83
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result p2

    .line 87
    if-nez p2, :cond_6

    .line 88
    .line 89
    :cond_4
    invoke-interface {v0}, Ljf/c;->getContext()Ljf/h;

    .line 90
    .line 91
    .line 92
    move-result-object p2

    .line 93
    sget-object v0, LEf/l0;->a:LEf/l0;

    .line 94
    .line 95
    invoke-interface {p2, v0}, Ljf/h;->get(Ljf/g;)Ljf/f;

    .line 96
    .line 97
    .line 98
    move-result-object p2

    .line 99
    check-cast p2, LEf/m0;

    .line 100
    .line 101
    if-eqz p2, :cond_7

    .line 102
    .line 103
    invoke-interface {p2}, LEf/m0;->isCancelled()Z

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    if-nez v0, :cond_5

    .line 108
    .line 109
    goto :goto_3

    .line 110
    :cond_5
    invoke-interface {p2}, LEf/m0;->getCancellationException()Ljava/util/concurrent/CancellationException;

    .line 111
    .line 112
    .line 113
    move-result-object p2

    .line 114
    if-eqz p2, :cond_7

    .line 115
    .line 116
    invoke-virtual {p2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result p2

    .line 120
    if-nez p2, :cond_6

    .line 121
    .line 122
    goto :goto_3

    .line 123
    :cond_6
    throw p1

    .line 124
    :cond_7
    :goto_3
    if-nez p0, :cond_8

    .line 125
    .line 126
    return-object p1

    .line 127
    :cond_8
    instance-of p2, p1, Ljava/util/concurrent/CancellationException;

    .line 128
    .line 129
    if-eqz p2, :cond_9

    .line 130
    .line 131
    invoke-static {p0, p1}, LFe/b;->d(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 132
    .line 133
    .line 134
    throw p0

    .line 135
    :cond_9
    invoke-static {p1, p0}, LFe/b;->d(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 136
    .line 137
    .line 138
    throw p1
.end method

.method public static final j(Ltf/p;)LHf/h;
    .locals 4

    .line 1
    new-instance v0, LHf/h;

    .line 2
    .line 3
    sget-object v1, Ljf/i;->a:Ljf/i;

    .line 4
    .line 5
    sget-object v2, LGf/a;->a:LGf/a;

    .line 6
    .line 7
    const/4 v3, -0x2

    .line 8
    invoke-direct {v0, p0, v1, v3, v2}, LHf/h;-><init>(Ltf/p;Ljf/h;ILGf/a;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public static final k(LHf/l;Ltf/p;Llf/j;)Ljava/lang/Object;
    .locals 7

    .line 1
    sget v0, LHf/K;->a:I

    .line 2
    .line 3
    new-instance v2, LCd/a;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-direct {v2, p1, v0}, LCd/a;-><init>(Ltf/p;Ljf/c;)V

    .line 7
    .line 8
    .line 9
    new-instance v1, LIf/o;

    .line 10
    .line 11
    sget-object v4, Ljf/i;->a:Ljf/i;

    .line 12
    .line 13
    sget-object v6, LGf/a;->a:LGf/a;

    .line 14
    .line 15
    const/4 v5, -0x2

    .line 16
    move-object v3, p0

    .line 17
    invoke-direct/range {v1 .. v6}, LIf/o;-><init>(Ltf/q;LHf/l;Ljf/h;ILGf/a;)V

    .line 18
    .line 19
    .line 20
    const/4 p0, 0x0

    .line 21
    invoke-static {v1, p0}, LHf/k0;->g(LHf/l;I)LHf/l;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    sget-object p1, LIf/y;->a:LIf/y;

    .line 26
    .line 27
    invoke-interface {p0, p1, p2}, LHf/l;->collect(LHf/m;Ljf/c;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    sget-object p1, Lkf/a;->a:Lkf/a;

    .line 32
    .line 33
    sget-object p2, Lef/C;->a:Lef/C;

    .line 34
    .line 35
    if-ne p0, p1, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    move-object p0, p2

    .line 39
    :goto_0
    if-ne p0, p1, :cond_1

    .line 40
    .line 41
    return-object p0

    .line 42
    :cond_1
    return-object p2
.end method

.method public static final l(LHf/l;I)Lu6/o;
    .locals 7

    .line 1
    sget-object v0, LGf/i;->J8:LGf/h;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget v0, LGf/h;->b:I

    .line 7
    .line 8
    if-ge p1, v0, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v0, p1

    .line 12
    :goto_0
    sub-int/2addr v0, p1

    .line 13
    instance-of v1, p0, LIf/g;

    .line 14
    .line 15
    if-eqz v1, :cond_5

    .line 16
    .line 17
    move-object v1, p0

    .line 18
    check-cast v1, LIf/g;

    .line 19
    .line 20
    invoke-virtual {v1}, LIf/g;->f()LHf/l;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    if-eqz v2, :cond_5

    .line 25
    .line 26
    new-instance p0, Lu6/o;

    .line 27
    .line 28
    const/4 v3, -0x3

    .line 29
    iget-object v4, v1, LIf/g;->c:LGf/a;

    .line 30
    .line 31
    iget v5, v1, LIf/g;->b:I

    .line 32
    .line 33
    if-eq v5, v3, :cond_1

    .line 34
    .line 35
    const/4 v3, -0x2

    .line 36
    if-eq v5, v3, :cond_1

    .line 37
    .line 38
    if-eqz v5, :cond_1

    .line 39
    .line 40
    move v0, v5

    .line 41
    goto :goto_1

    .line 42
    :cond_1
    sget-object v3, LGf/a;->a:LGf/a;

    .line 43
    .line 44
    const/4 v6, 0x0

    .line 45
    if-ne v4, v3, :cond_3

    .line 46
    .line 47
    if-nez v5, :cond_4

    .line 48
    .line 49
    :cond_2
    move v0, v6

    .line 50
    goto :goto_1

    .line 51
    :cond_3
    if-nez p1, :cond_2

    .line 52
    .line 53
    const/4 v0, 0x1

    .line 54
    :cond_4
    :goto_1
    iget-object p1, v1, LIf/g;->a:Ljf/h;

    .line 55
    .line 56
    invoke-direct {p0, v0, v4, v2, p1}, Lu6/o;-><init>(ILGf/a;LHf/l;Ljf/h;)V

    .line 57
    .line 58
    .line 59
    return-object p0

    .line 60
    :cond_5
    new-instance p1, Lu6/o;

    .line 61
    .line 62
    sget-object v1, LGf/a;->a:LGf/a;

    .line 63
    .line 64
    sget-object v2, Ljf/i;->a:Ljf/i;

    .line 65
    .line 66
    invoke-direct {p1, v0, v1, p0, v2}, Lu6/o;-><init>(ILGf/a;LHf/l;Ljf/h;)V

    .line 67
    .line 68
    .line 69
    return-object p1
.end method

.method public static final m(LHf/l;)LHf/l;
    .locals 1

    .line 1
    instance-of v0, p0, LHf/v0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    instance-of v0, p0, LHf/k;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    move-object v0, p0

    .line 11
    check-cast v0, LHf/k;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_1
    new-instance v0, LHf/k;

    .line 18
    .line 19
    invoke-direct {v0, p0}, LHf/k;-><init>(LHf/l;)V

    .line 20
    .line 21
    .line 22
    return-object v0
.end method

.method public static final n(LHf/m;LGf/s;ZLlf/c;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p3, LHf/p;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, LHf/p;

    .line 7
    .line 8
    iget v1, v0, LHf/p;->f:I

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
    iput v1, v0, LHf/p;->f:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LHf/p;

    .line 21
    .line 22
    invoke-direct {v0, p3}, Llf/c;-><init>(Ljf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, LHf/p;->e:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 28
    .line 29
    iget v2, v0, LHf/p;->f:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x2

    .line 33
    const/4 v5, 0x1

    .line 34
    if-eqz v2, :cond_4

    .line 35
    .line 36
    if-eq v2, v5, :cond_3

    .line 37
    .line 38
    if-ne v2, v4, :cond_2

    .line 39
    .line 40
    iget-boolean p2, v0, LHf/p;->d:Z

    .line 41
    .line 42
    iget-object p0, v0, LHf/p;->c:LGf/b;

    .line 43
    .line 44
    iget-object p1, v0, LHf/p;->b:LGf/v;

    .line 45
    .line 46
    iget-object v2, v0, LHf/p;->a:LHf/m;

    .line 47
    .line 48
    :try_start_0
    invoke-static {p3}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    .line 50
    .line 51
    :cond_1
    move-object v6, v2

    .line 52
    move-object v2, p0

    .line 53
    move-object p0, v6

    .line 54
    goto :goto_1

    .line 55
    :catchall_0
    move-exception p0

    .line 56
    goto :goto_4

    .line 57
    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 58
    .line 59
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 60
    .line 61
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw p0

    .line 65
    :cond_3
    iget-boolean p2, v0, LHf/p;->d:Z

    .line 66
    .line 67
    iget-object p0, v0, LHf/p;->c:LGf/b;

    .line 68
    .line 69
    iget-object p1, v0, LHf/p;->b:LGf/v;

    .line 70
    .line 71
    iget-object v2, v0, LHf/p;->a:LHf/m;

    .line 72
    .line 73
    :try_start_1
    invoke-static {p3}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 74
    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_4
    invoke-static {p3}, LFe/e;->U(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    instance-of p3, p0, LHf/D0;

    .line 81
    .line 82
    if-nez p3, :cond_b

    .line 83
    .line 84
    :try_start_2
    iget-object p3, p1, LGf/s;->d:LGf/e;

    .line 85
    .line 86
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    new-instance v2, LGf/b;

    .line 90
    .line 91
    invoke-direct {v2, p3}, LGf/b;-><init>(LGf/e;)V

    .line 92
    .line 93
    .line 94
    :goto_1
    iput-object p0, v0, LHf/p;->a:LHf/m;

    .line 95
    .line 96
    iput-object p1, v0, LHf/p;->b:LGf/v;

    .line 97
    .line 98
    iput-object v2, v0, LHf/p;->c:LGf/b;

    .line 99
    .line 100
    iput-boolean p2, v0, LHf/p;->d:Z

    .line 101
    .line 102
    iput v5, v0, LHf/p;->f:I

    .line 103
    .line 104
    invoke-virtual {v2, v0}, LGf/b;->a(Llf/c;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p3

    .line 108
    if-ne p3, v1, :cond_5

    .line 109
    .line 110
    goto :goto_3

    .line 111
    :cond_5
    move-object v6, v2

    .line 112
    move-object v2, p0

    .line 113
    move-object p0, v6

    .line 114
    :goto_2
    check-cast p3, Ljava/lang/Boolean;

    .line 115
    .line 116
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 117
    .line 118
    .line 119
    move-result p3

    .line 120
    if-eqz p3, :cond_6

    .line 121
    .line 122
    invoke-virtual {p0}, LGf/b;->c()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object p3

    .line 126
    iput-object v2, v0, LHf/p;->a:LHf/m;

    .line 127
    .line 128
    iput-object p1, v0, LHf/p;->b:LGf/v;

    .line 129
    .line 130
    iput-object p0, v0, LHf/p;->c:LGf/b;

    .line 131
    .line 132
    iput-boolean p2, v0, LHf/p;->d:Z

    .line 133
    .line 134
    iput v4, v0, LHf/p;->f:I

    .line 135
    .line 136
    invoke-interface {v2, p3, v0}, LHf/m;->emit(Ljava/lang/Object;Ljf/c;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object p3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 140
    if-ne p3, v1, :cond_1

    .line 141
    .line 142
    :goto_3
    return-object v1

    .line 143
    :cond_6
    if-eqz p2, :cond_7

    .line 144
    .line 145
    invoke-interface {p1, v3}, LGf/v;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 146
    .line 147
    .line 148
    :cond_7
    sget-object p0, Lef/C;->a:Lef/C;

    .line 149
    .line 150
    return-object p0

    .line 151
    :goto_4
    :try_start_3
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 152
    :catchall_1
    move-exception p3

    .line 153
    if-eqz p2, :cond_a

    .line 154
    .line 155
    instance-of p2, p0, Ljava/util/concurrent/CancellationException;

    .line 156
    .line 157
    if-eqz p2, :cond_8

    .line 158
    .line 159
    move-object v3, p0

    .line 160
    check-cast v3, Ljava/util/concurrent/CancellationException;

    .line 161
    .line 162
    :cond_8
    if-nez v3, :cond_9

    .line 163
    .line 164
    const-string p2, "Channel was consumed, consumer had failed"

    .line 165
    .line 166
    invoke-static {p2, p0}, LEf/H;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/util/concurrent/CancellationException;

    .line 167
    .line 168
    .line 169
    move-result-object v3

    .line 170
    :cond_9
    invoke-interface {p1, v3}, LGf/v;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 171
    .line 172
    .line 173
    :cond_a
    throw p3

    .line 174
    :cond_b
    check-cast p0, LHf/D0;

    .line 175
    .line 176
    iget-object p0, p0, LHf/D0;->a:Ljava/lang/Throwable;

    .line 177
    .line 178
    throw p0
.end method

.method public static final o(LHf/l;Ljf/c;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p1, LHf/N;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, LHf/N;

    .line 7
    .line 8
    iget v1, v0, LHf/N;->d:I

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
    iput v1, v0, LHf/N;->d:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LHf/N;

    .line 21
    .line 22
    invoke-direct {v0, p1}, Llf/c;-><init>(Ljf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, LHf/N;->c:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 28
    .line 29
    iget v2, v0, LHf/N;->d:I

    .line 30
    .line 31
    sget-object v3, LIf/c;->b:LH6/g;

    .line 32
    .line 33
    const/4 v4, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v4, :cond_1

    .line 37
    .line 38
    iget-object p0, v0, LHf/N;->b:LHf/L;

    .line 39
    .line 40
    iget-object v1, v0, LHf/N;->a:Lkotlin/jvm/internal/G;

    .line 41
    .line 42
    :try_start_0
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_0
    .catch LIf/a; {:try_start_0 .. :try_end_0} :catch_0

    .line 43
    .line 44
    .line 45
    goto :goto_2

    .line 46
    :catch_0
    move-exception p1

    .line 47
    goto :goto_1

    .line 48
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 49
    .line 50
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw p0

    .line 56
    :cond_2
    invoke-static {p1}, LA7/p0;->s(Ljava/lang/Object;)Lkotlin/jvm/internal/G;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    iput-object v3, p1, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 61
    .line 62
    new-instance v2, LHf/L;

    .line 63
    .line 64
    const/4 v5, 0x0

    .line 65
    invoke-direct {v2, p1, v5}, LHf/L;-><init>(Lkotlin/jvm/internal/G;I)V

    .line 66
    .line 67
    .line 68
    :try_start_1
    iput-object p1, v0, LHf/N;->a:Lkotlin/jvm/internal/G;

    .line 69
    .line 70
    iput-object v2, v0, LHf/N;->b:LHf/L;

    .line 71
    .line 72
    iput v4, v0, LHf/N;->d:I

    .line 73
    .line 74
    invoke-interface {p0, v2, v0}, LHf/l;->collect(LHf/m;Ljf/c;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p0
    :try_end_1
    .catch LIf/a; {:try_start_1 .. :try_end_1} :catch_1

    .line 78
    if-ne p0, v1, :cond_3

    .line 79
    .line 80
    return-object v1

    .line 81
    :cond_3
    move-object v1, p1

    .line 82
    goto :goto_2

    .line 83
    :catch_1
    move-exception p0

    .line 84
    move-object v1, p1

    .line 85
    move-object p1, p0

    .line 86
    move-object p0, v2

    .line 87
    :goto_1
    iget-object v2, p1, LIf/a;->a:Ljava/lang/Object;

    .line 88
    .line 89
    if-ne v2, p0, :cond_5

    .line 90
    .line 91
    invoke-interface {v0}, Ljf/c;->getContext()Ljf/h;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    invoke-static {p0}, LEf/H;->p(Ljf/h;)V

    .line 96
    .line 97
    .line 98
    :goto_2
    iget-object p0, v1, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 99
    .line 100
    if-eq p0, v3, :cond_4

    .line 101
    .line 102
    return-object p0

    .line 103
    :cond_4
    new-instance p0, Ljava/util/NoSuchElementException;

    .line 104
    .line 105
    const-string p1, "Expected at least one element"

    .line 106
    .line 107
    invoke-direct {p0, p1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    throw p0

    .line 111
    :cond_5
    throw p1
.end method

.method public static final p(LHf/l;Ltf/p;Ljf/c;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p2, LHf/O;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, LHf/O;

    .line 7
    .line 8
    iget v1, v0, LHf/O;->d:I

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
    iput v1, v0, LHf/O;->d:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LHf/O;

    .line 21
    .line 22
    invoke-direct {v0, p2}, Llf/c;-><init>(Ljf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, LHf/O;->c:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 28
    .line 29
    iget v2, v0, LHf/O;->d:I

    .line 30
    .line 31
    sget-object v3, LIf/c;->b:LH6/g;

    .line 32
    .line 33
    const/4 v4, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v4, :cond_1

    .line 37
    .line 38
    iget-object p0, v0, LHf/O;->b:LHf/z;

    .line 39
    .line 40
    iget-object p1, v0, LHf/O;->a:Lkotlin/jvm/internal/G;

    .line 41
    .line 42
    :try_start_0
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_0
    .catch LIf/a; {:try_start_0 .. :try_end_0} :catch_0

    .line 43
    .line 44
    .line 45
    goto :goto_2

    .line 46
    :catch_0
    move-exception p2

    .line 47
    goto :goto_1

    .line 48
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 49
    .line 50
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw p0

    .line 56
    :cond_2
    invoke-static {p2}, LA7/p0;->s(Ljava/lang/Object;)Lkotlin/jvm/internal/G;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    iput-object v3, p2, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 61
    .line 62
    new-instance v2, LHf/z;

    .line 63
    .line 64
    const/4 v5, 0x2

    .line 65
    invoke-direct {v2, v5, p1, p2}, LHf/z;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    :try_start_1
    iput-object p2, v0, LHf/O;->a:Lkotlin/jvm/internal/G;

    .line 69
    .line 70
    iput-object v2, v0, LHf/O;->b:LHf/z;

    .line 71
    .line 72
    iput v4, v0, LHf/O;->d:I

    .line 73
    .line 74
    invoke-interface {p0, v2, v0}, LHf/l;->collect(LHf/m;Ljf/c;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p0
    :try_end_1
    .catch LIf/a; {:try_start_1 .. :try_end_1} :catch_1

    .line 78
    if-ne p0, v1, :cond_3

    .line 79
    .line 80
    return-object v1

    .line 81
    :cond_3
    move-object p1, p2

    .line 82
    goto :goto_2

    .line 83
    :catch_1
    move-exception p0

    .line 84
    move-object p1, p2

    .line 85
    move-object p2, p0

    .line 86
    move-object p0, v2

    .line 87
    :goto_1
    iget-object v1, p2, LIf/a;->a:Ljava/lang/Object;

    .line 88
    .line 89
    if-ne v1, p0, :cond_5

    .line 90
    .line 91
    invoke-interface {v0}, Ljf/c;->getContext()Ljf/h;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    invoke-static {p0}, LEf/H;->p(Ljf/h;)V

    .line 96
    .line 97
    .line 98
    :goto_2
    iget-object p0, p1, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 99
    .line 100
    if-eq p0, v3, :cond_4

    .line 101
    .line 102
    return-object p0

    .line 103
    :cond_4
    new-instance p0, Ljava/util/NoSuchElementException;

    .line 104
    .line 105
    const-string p1, "Expected at least one element matching the predicate"

    .line 106
    .line 107
    invoke-direct {p0, p1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    throw p0

    .line 111
    :cond_5
    throw p2
.end method

.method public static final q(LHf/l;Llf/c;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p1, LHf/Q;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, LHf/Q;

    .line 7
    .line 8
    iget v1, v0, LHf/Q;->d:I

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
    iput v1, v0, LHf/Q;->d:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LHf/Q;

    .line 21
    .line 22
    invoke-direct {v0, p1}, Llf/c;-><init>(Ljf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, LHf/Q;->c:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 28
    .line 29
    iget v2, v0, LHf/Q;->d:I

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
    iget-object p0, v0, LHf/Q;->b:LHf/L;

    .line 37
    .line 38
    iget-object v1, v0, LHf/Q;->a:Lkotlin/jvm/internal/G;

    .line 39
    .line 40
    :try_start_0
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_0
    .catch LIf/a; {:try_start_0 .. :try_end_0} :catch_0

    .line 41
    .line 42
    .line 43
    goto :goto_2

    .line 44
    :catch_0
    move-exception p1

    .line 45
    goto :goto_1

    .line 46
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 47
    .line 48
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p0

    .line 54
    :cond_2
    invoke-static {p1}, LA7/p0;->s(Ljava/lang/Object;)Lkotlin/jvm/internal/G;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    new-instance v2, LHf/L;

    .line 59
    .line 60
    const/4 v4, 0x1

    .line 61
    invoke-direct {v2, p1, v4}, LHf/L;-><init>(Lkotlin/jvm/internal/G;I)V

    .line 62
    .line 63
    .line 64
    :try_start_1
    iput-object p1, v0, LHf/Q;->a:Lkotlin/jvm/internal/G;

    .line 65
    .line 66
    iput-object v2, v0, LHf/Q;->b:LHf/L;

    .line 67
    .line 68
    iput v3, v0, LHf/Q;->d:I

    .line 69
    .line 70
    invoke-interface {p0, v2, v0}, LHf/l;->collect(LHf/m;Ljf/c;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p0
    :try_end_1
    .catch LIf/a; {:try_start_1 .. :try_end_1} :catch_1

    .line 74
    if-ne p0, v1, :cond_3

    .line 75
    .line 76
    return-object v1

    .line 77
    :cond_3
    move-object v1, p1

    .line 78
    goto :goto_2

    .line 79
    :catch_1
    move-exception p0

    .line 80
    move-object v1, p1

    .line 81
    move-object p1, p0

    .line 82
    move-object p0, v2

    .line 83
    :goto_1
    iget-object v2, p1, LIf/a;->a:Ljava/lang/Object;

    .line 84
    .line 85
    if-ne v2, p0, :cond_4

    .line 86
    .line 87
    invoke-interface {v0}, Ljf/c;->getContext()Ljf/h;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    invoke-static {p0}, LEf/H;->p(Ljf/h;)V

    .line 92
    .line 93
    .line 94
    :goto_2
    iget-object p0, v1, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 95
    .line 96
    return-object p0

    .line 97
    :cond_4
    throw p1
.end method

.method public static final r(LHf/l;Ltf/p;Llf/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p2, LHf/S;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, LHf/S;

    .line 7
    .line 8
    iget v1, v0, LHf/S;->d:I

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
    iput v1, v0, LHf/S;->d:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LHf/S;

    .line 21
    .line 22
    invoke-direct {v0, p2}, Llf/c;-><init>(Ljf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, LHf/S;->c:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 28
    .line 29
    iget v2, v0, LHf/S;->d:I

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
    iget-object p0, v0, LHf/S;->b:LHf/z;

    .line 37
    .line 38
    iget-object p1, v0, LHf/S;->a:Lkotlin/jvm/internal/G;

    .line 39
    .line 40
    :try_start_0
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_0
    .catch LIf/a; {:try_start_0 .. :try_end_0} :catch_0

    .line 41
    .line 42
    .line 43
    goto :goto_2

    .line 44
    :catch_0
    move-exception p2

    .line 45
    goto :goto_1

    .line 46
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 47
    .line 48
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p0

    .line 54
    :cond_2
    invoke-static {p2}, LA7/p0;->s(Ljava/lang/Object;)Lkotlin/jvm/internal/G;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    new-instance v2, LHf/z;

    .line 59
    .line 60
    invoke-direct {v2, p1, p2}, LHf/z;-><init>(Ltf/p;Lkotlin/jvm/internal/G;)V

    .line 61
    .line 62
    .line 63
    :try_start_1
    iput-object p2, v0, LHf/S;->a:Lkotlin/jvm/internal/G;

    .line 64
    .line 65
    iput-object v2, v0, LHf/S;->b:LHf/z;

    .line 66
    .line 67
    iput v3, v0, LHf/S;->d:I

    .line 68
    .line 69
    invoke-interface {p0, v2, v0}, LHf/l;->collect(LHf/m;Ljf/c;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0
    :try_end_1
    .catch LIf/a; {:try_start_1 .. :try_end_1} :catch_1

    .line 73
    if-ne p0, v1, :cond_3

    .line 74
    .line 75
    return-object v1

    .line 76
    :cond_3
    move-object p1, p2

    .line 77
    goto :goto_2

    .line 78
    :catch_1
    move-exception p0

    .line 79
    move-object p1, p2

    .line 80
    move-object p2, p0

    .line 81
    move-object p0, v2

    .line 82
    :goto_1
    iget-object v1, p2, LIf/a;->a:Ljava/lang/Object;

    .line 83
    .line 84
    if-ne v1, p0, :cond_4

    .line 85
    .line 86
    invoke-interface {v0}, Ljf/c;->getContext()Ljf/h;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    invoke-static {p0}, LEf/H;->p(Ljf/h;)V

    .line 91
    .line 92
    .line 93
    :goto_2
    iget-object p0, p1, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 94
    .line 95
    return-object p0

    .line 96
    :cond_4
    throw p2
.end method

.method public static final s(LHf/l;LFf/e;)LHf/l;
    .locals 6

    .line 1
    sget-object v0, LEf/l0;->a:LEf/l0;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, LEf/A;->get(Ljf/g;)Ljf/f;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_2

    .line 8
    .line 9
    sget-object v0, Ljf/i;->a:Ljf/i;

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_0
    instance-of v0, p0, LIf/w;

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    check-cast p0, LIf/w;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    const/4 v1, 0x6

    .line 26
    const/4 v2, 0x0

    .line 27
    invoke-static {p0, p1, v2, v0, v1}, LIf/c;->a(LIf/w;LFf/e;ILGf/a;I)LHf/l;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0

    .line 32
    :cond_1
    new-instance v0, LIf/j;

    .line 33
    .line 34
    const/4 v4, 0x0

    .line 35
    const/16 v5, 0xc

    .line 36
    .line 37
    const/4 v3, 0x0

    .line 38
    move-object v1, p0

    .line 39
    move-object v2, p1

    .line 40
    invoke-direct/range {v0 .. v5}, LIf/j;-><init>(LHf/l;LFf/e;ILGf/a;I)V

    .line 41
    .line 42
    .line 43
    return-object v0

    .line 44
    :cond_2
    move-object v2, p1

    .line 45
    new-instance p0, Ljava/lang/StringBuilder;

    .line 46
    .line 47
    const-string p1, "Flow context cannot contain job in it. Had "

    .line 48
    .line 49
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 60
    .line 61
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw p1
.end method

.method public static final t(LHf/g0;Ljf/h;ILGf/a;)LHf/l;
    .locals 1

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    const/4 v0, -0x3

    .line 4
    if-ne p2, v0, :cond_1

    .line 5
    .line 6
    :cond_0
    sget-object v0, LGf/a;->a:LGf/a;

    .line 7
    .line 8
    if-ne p3, v0, :cond_1

    .line 9
    .line 10
    return-object p0

    .line 11
    :cond_1
    new-instance v0, LIf/j;

    .line 12
    .line 13
    invoke-direct {v0, p2, p3, p0, p1}, LIf/i;-><init>(ILGf/a;LHf/l;Ljf/h;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public static final u(LHf/l;LEf/E;)LEf/H0;
    .locals 2

    .line 1
    new-instance v0, LHf/q;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, LHf/q;-><init>(LHf/l;Ljf/c;)V

    .line 5
    .line 6
    .line 7
    const/4 p0, 0x3

    .line 8
    invoke-static {p1, v1, v0, p0}, LEf/H;->D(LEf/E;Ljf/h;Ltf/p;I)LEf/H0;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method public static final v(LHf/l;LEf/E;I)LHf/d0;
    .locals 6

    .line 1
    sget-object v1, LHf/n0;->a:LHf/p0;

    .line 2
    .line 3
    invoke-static {p0, p2}, LHf/k0;->l(LHf/l;I)Lu6/o;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    iget v0, p0, Lu6/o;->a:I

    .line 8
    .line 9
    iget-object v2, p0, Lu6/o;->c:Ljava/io/Serializable;

    .line 10
    .line 11
    check-cast v2, LGf/a;

    .line 12
    .line 13
    invoke-static {p2, v0, v2}, LHf/k0;->a(IILGf/a;)LHf/j0;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    sget-object v4, LHf/k0;->a:LH6/g;

    .line 18
    .line 19
    invoke-virtual {v1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    if-eqz p2, :cond_0

    .line 24
    .line 25
    sget-object p2, LEf/F;->a:LEf/F;

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    sget-object p2, LEf/F;->d:LEf/F;

    .line 29
    .line 30
    :goto_0
    new-instance v0, LHf/W;

    .line 31
    .line 32
    const/4 v5, 0x0

    .line 33
    iget-object v2, p0, Lu6/o;->b:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v2, LHf/l;

    .line 36
    .line 37
    invoke-direct/range {v0 .. v5}, LHf/W;-><init>(LHf/o0;LHf/l;LHf/b0;Ljava/lang/Object;Ljf/c;)V

    .line 38
    .line 39
    .line 40
    iget-object p0, p0, Lu6/o;->d:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p0, Ljf/h;

    .line 43
    .line 44
    invoke-static {p1, p0, p2, v0}, LEf/H;->C(LEf/E;Ljf/h;LEf/F;Ltf/p;)LEf/H0;

    .line 45
    .line 46
    .line 47
    new-instance p0, LHf/d0;

    .line 48
    .line 49
    invoke-direct {p0, v3}, LHf/d0;-><init>(LHf/b0;)V

    .line 50
    .line 51
    .line 52
    return-object p0
.end method

.method public static final w(LHf/l;Llf/c;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p1, LHf/T;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, LHf/T;

    .line 7
    .line 8
    iget v1, v0, LHf/T;->c:I

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
    iput v1, v0, LHf/T;->c:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LHf/T;

    .line 21
    .line 22
    invoke-direct {v0, p1}, Llf/c;-><init>(Ljf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, LHf/T;->b:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 28
    .line 29
    iget v2, v0, LHf/T;->c:I

    .line 30
    .line 31
    sget-object v3, LIf/c;->b:LH6/g;

    .line 32
    .line 33
    const/4 v4, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v4, :cond_1

    .line 37
    .line 38
    iget-object p0, v0, LHf/T;->a:Lkotlin/jvm/internal/G;

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
    invoke-static {p1}, LA7/p0;->s(Ljava/lang/Object;)Lkotlin/jvm/internal/G;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    iput-object v3, p1, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 57
    .line 58
    new-instance v2, LHf/L;

    .line 59
    .line 60
    const/4 v5, 0x2

    .line 61
    invoke-direct {v2, p1, v5}, LHf/L;-><init>(Lkotlin/jvm/internal/G;I)V

    .line 62
    .line 63
    .line 64
    iput-object p1, v0, LHf/T;->a:Lkotlin/jvm/internal/G;

    .line 65
    .line 66
    iput v4, v0, LHf/T;->c:I

    .line 67
    .line 68
    invoke-interface {p0, v2, v0}, LHf/l;->collect(LHf/m;Ljf/c;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    if-ne p0, v1, :cond_3

    .line 73
    .line 74
    return-object v1

    .line 75
    :cond_3
    move-object p0, p1

    .line 76
    :goto_1
    iget-object p0, p0, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 77
    .line 78
    if-eq p0, v3, :cond_4

    .line 79
    .line 80
    return-object p0

    .line 81
    :cond_4
    new-instance p0, Ljava/util/NoSuchElementException;

    .line 82
    .line 83
    const-string p1, "Flow is empty"

    .line 84
    .line 85
    invoke-direct {p0, p1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    throw p0
.end method

.method public static final x(LHf/l;LEf/E;LHf/o0;Ljava/lang/Object;)LHf/e0;
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {p0, v0}, LHf/k0;->l(LHf/l;I)Lu6/o;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    invoke-static {p3}, LHf/k0;->c(Ljava/lang/Object;)LHf/x0;

    .line 7
    .line 8
    .line 9
    move-result-object v3

    .line 10
    sget-object v0, LHf/n0;->a:LHf/p0;

    .line 11
    .line 12
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    sget-object v0, LEf/F;->a:LEf/F;

    .line 19
    .line 20
    :goto_0
    move-object v6, v0

    .line 21
    goto :goto_1

    .line 22
    :cond_0
    sget-object v0, LEf/F;->d:LEf/F;

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :goto_1
    new-instance v0, LHf/W;

    .line 26
    .line 27
    const/4 v5, 0x0

    .line 28
    iget-object v1, p0, Lu6/o;->b:Ljava/lang/Object;

    .line 29
    .line 30
    move-object v2, v1

    .line 31
    check-cast v2, LHf/l;

    .line 32
    .line 33
    move-object v1, p2

    .line 34
    move-object v4, p3

    .line 35
    invoke-direct/range {v0 .. v5}, LHf/W;-><init>(LHf/o0;LHf/l;LHf/b0;Ljava/lang/Object;Ljf/c;)V

    .line 36
    .line 37
    .line 38
    iget-object p0, p0, Lu6/o;->d:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p0, Ljf/h;

    .line 41
    .line 42
    invoke-static {p1, p0, v6, v0}, LEf/H;->C(LEf/E;Ljf/h;LEf/F;Ltf/p;)LEf/H0;

    .line 43
    .line 44
    .line 45
    new-instance p0, LHf/e0;

    .line 46
    .line 47
    invoke-direct {p0, v3}, LHf/e0;-><init>(LHf/c0;)V

    .line 48
    .line 49
    .line 50
    return-object p0
.end method
