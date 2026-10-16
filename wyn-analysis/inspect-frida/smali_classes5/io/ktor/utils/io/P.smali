.class public final Lio/ktor/utils/io/P;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/ktor/utils/io/J;


# instance fields
.field public final b:Lio/ktor/utils/io/m;

.field public final c:Lio/ktor/utils/io/D;


# direct methods
.method public constructor <init>(Lio/ktor/utils/io/m;Lio/ktor/utils/io/D;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/ktor/utils/io/P;->b:Lio/ktor/utils/io/m;

    .line 5
    .line 6
    iput-object p2, p0, Lio/ktor/utils/io/P;->c:Lio/ktor/utils/io/D;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/ktor/utils/io/P;->b:Lio/ktor/utils/io/m;

    invoke-virtual {v0, p1}, Lio/ktor/utils/io/m;->a(Ljava/lang/Throwable;)V

    return-void
.end method

.method public final b()Ljava/lang/Throwable;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/ktor/utils/io/P;->b:Lio/ktor/utils/io/m;

    invoke-virtual {v0}, Lio/ktor/utils/io/m;->b()Ljava/lang/Throwable;

    move-result-object v0

    return-object v0
.end method

.method public final c()LPf/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/ktor/utils/io/P;->b:Lio/ktor/utils/io/m;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/ktor/utils/io/m;->c()LPf/a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final e(Llf/c;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/ktor/utils/io/P;->b:Lio/ktor/utils/io/m;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lio/ktor/utils/io/m;->e(Llf/c;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final f(Ljf/c;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p1, Lio/ktor/utils/io/O;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lio/ktor/utils/io/O;

    .line 7
    .line 8
    iget v1, v0, Lio/ktor/utils/io/O;->c:I

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
    iput v1, v0, Lio/ktor/utils/io/O;->c:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lio/ktor/utils/io/O;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lio/ktor/utils/io/O;-><init>(Lio/ktor/utils/io/P;Ljf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lio/ktor/utils/io/O;->a:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 28
    .line 29
    iget v2, v0, Lio/ktor/utils/io/O;->c:I

    .line 30
    .line 31
    const/4 v3, 0x2

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_3

    .line 34
    .line 35
    if-eq v2, v4, :cond_2

    .line 36
    .line 37
    if-ne v2, v3, :cond_1

    .line 38
    .line 39
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto :goto_3

    .line 43
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 44
    .line 45
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw p1

    .line 51
    :cond_2
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_3
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    iput v4, v0, Lio/ktor/utils/io/O;->c:I

    .line 59
    .line 60
    iget-object p1, p0, Lio/ktor/utils/io/P;->b:Lio/ktor/utils/io/m;

    .line 61
    .line 62
    invoke-virtual {p1, v0}, Lio/ktor/utils/io/m;->f(Ljf/c;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    if-ne p1, v1, :cond_4

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_4
    :goto_1
    iput v3, v0, Lio/ktor/utils/io/O;->c:I

    .line 70
    .line 71
    iget-object p1, p0, Lio/ktor/utils/io/P;->c:Lio/ktor/utils/io/D;

    .line 72
    .line 73
    invoke-virtual {p1, v0}, Lio/ktor/utils/io/D;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    if-ne p1, v1, :cond_5

    .line 78
    .line 79
    :goto_2
    return-object v1

    .line 80
    :cond_5
    :goto_3
    sget-object p1, Lef/C;->a:Lef/C;

    .line 81
    .line 82
    return-object p1
.end method
