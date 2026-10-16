.class public final LVd/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/ktor/utils/io/t;


# instance fields
.field public final b:LPf/b;

.field public c:Lio/ktor/utils/io/S;

.field public final d:LPf/a;

.field public final e:LEf/o0;

.field public final f:Ljf/h;


# direct methods
.method public constructor <init>(LPf/b;Ljf/h;)V
    .locals 1

    .line 1
    const-string v0, "parent"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, LVd/d;->b:LPf/b;

    .line 10
    .line 11
    new-instance p1, LPf/a;

    .line 12
    .line 13
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, LVd/d;->d:LPf/a;

    .line 17
    .line 18
    sget-object p1, LEf/l0;->a:LEf/l0;

    .line 19
    .line 20
    invoke-interface {p2, p1}, Ljf/h;->get(Ljf/g;)Ljf/f;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    check-cast p1, LEf/m0;

    .line 25
    .line 26
    new-instance v0, LEf/o0;

    .line 27
    .line 28
    invoke-direct {v0, p1}, LEf/o0;-><init>(LEf/m0;)V

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, LVd/d;->e:LEf/o0;

    .line 32
    .line 33
    invoke-interface {p2, v0}, Ljf/h;->plus(Ljf/h;)Ljf/h;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    new-instance p2, LEf/D;

    .line 38
    .line 39
    const-string v0, "RawSourceChannel"

    .line 40
    .line 41
    invoke-direct {p2, v0}, LEf/D;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-interface {p1, p2}, Ljf/h;->plus(Ljf/h;)Ljf/h;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    iput-object p1, p0, LVd/d;->f:Ljf/h;

    .line 49
    .line 50
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 4

    .line 1
    iget-object v0, p0, LVd/d;->c:Lio/ktor/utils/io/S;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, LVd/d;->e:LEf/o0;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const-string v2, "Channel was cancelled"

    .line 13
    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    move-object v1, v2

    .line 17
    :cond_1
    invoke-static {v0, v1, p1}, LEf/H;->k(LEf/m0;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, LVd/d;->b:LPf/b;

    .line 21
    .line 22
    invoke-virtual {v0}, LPf/b;->close()V

    .line 23
    .line 24
    .line 25
    new-instance v0, Lio/ktor/utils/io/S;

    .line 26
    .line 27
    new-instance v1, Ljava/io/IOException;

    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    if-nez v3, :cond_2

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    move-object v2, v3

    .line 37
    :goto_0
    invoke-direct {v1, v2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 38
    .line 39
    .line 40
    invoke-direct {v0, v1}, Lio/ktor/utils/io/S;-><init>(Ljava/lang/Throwable;)V

    .line 41
    .line 42
    .line 43
    iput-object v0, p0, LVd/d;->c:Lio/ktor/utils/io/S;

    .line 44
    .line 45
    return-void
.end method

.method public final b()Ljava/lang/Throwable;
    .locals 2

    .line 1
    iget-object v0, p0, LVd/d;->c:Lio/ktor/utils/io/S;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v1, Lio/ktor/utils/io/Q;->a:Lio/ktor/utils/io/Q;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lio/ktor/utils/io/S;->a(Ltf/l;)Ljava/lang/Throwable;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    return-object v0
.end method

.method public final d()LPf/a;
    .locals 1

    .line 1
    iget-object v0, p0, LVd/d;->d:LPf/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final g(ILlf/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p2, LVd/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, LVd/b;

    .line 7
    .line 8
    iget v1, v0, LVd/b;->d:I

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
    iput v1, v0, LVd/b;->d:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LVd/b;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, LVd/b;-><init>(LVd/d;Llf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, LVd/b;->b:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 28
    .line 29
    iget v2, v0, LVd/b;->d:I

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
    iget p1, v0, LVd/b;->a:I

    .line 37
    .line 38
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 43
    .line 44
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_2
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    iget-object p2, p0, LVd/d;->c:Lio/ktor/utils/io/S;

    .line 54
    .line 55
    if-eqz p2, :cond_3

    .line 56
    .line 57
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 58
    .line 59
    return-object p1

    .line 60
    :cond_3
    new-instance p2, LVd/c;

    .line 61
    .line 62
    const/4 v2, 0x0

    .line 63
    invoke-direct {p2, p0, p1, v2}, LVd/c;-><init>(LVd/d;ILjf/c;)V

    .line 64
    .line 65
    .line 66
    iput p1, v0, LVd/b;->a:I

    .line 67
    .line 68
    iput v3, v0, LVd/b;->d:I

    .line 69
    .line 70
    iget-object v2, p0, LVd/d;->f:Ljf/h;

    .line 71
    .line 72
    invoke-static {v2, p2, v0}, LEf/H;->P(Ljf/h;Ltf/p;Ljf/c;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p2

    .line 76
    if-ne p2, v1, :cond_4

    .line 77
    .line 78
    return-object v1

    .line 79
    :cond_4
    :goto_1
    iget-object p2, p0, LVd/d;->d:LPf/a;

    .line 80
    .line 81
    invoke-static {p2}, LFe/b;->C(LPf/i;)J

    .line 82
    .line 83
    .line 84
    move-result-wide v0

    .line 85
    int-to-long p1, p1

    .line 86
    cmp-long p1, v0, p1

    .line 87
    .line 88
    if-ltz p1, :cond_5

    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_5
    const/4 v3, 0x0

    .line 92
    :goto_2
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    return-object p1
.end method

.method public final h()Z
    .locals 1

    .line 1
    iget-object v0, p0, LVd/d;->c:Lio/ktor/utils/io/S;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, LVd/d;->d:LPf/a;

    .line 6
    .line 7
    invoke-virtual {v0}, LPf/a;->exhausted()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    return v0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    return v0
.end method
