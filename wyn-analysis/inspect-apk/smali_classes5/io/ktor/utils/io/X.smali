.class public final Lio/ktor/utils/io/X;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/ktor/utils/io/t;


# instance fields
.field public final b:Lio/ktor/utils/io/t;

.field public final c:LPf/a;

.field public d:J

.field public e:J


# direct methods
.method public constructor <init>(Lio/ktor/utils/io/t;)V
    .locals 1

    .line 1
    const-string v0, "delegate"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lio/ktor/utils/io/X;->b:Lio/ktor/utils/io/t;

    .line 10
    .line 11
    new-instance p1, LPf/a;

    .line 12
    .line 13
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lio/ktor/utils/io/X;->c:LPf/a;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/ktor/utils/io/X;->b:Lio/ktor/utils/io/t;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lio/ktor/utils/io/t;->a(Ljava/lang/Throwable;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final b()Ljava/lang/Throwable;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/ktor/utils/io/X;->b:Lio/ktor/utils/io/t;

    .line 2
    .line 3
    invoke-interface {v0}, Lio/ktor/utils/io/t;->b()Ljava/lang/Throwable;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final c()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lio/ktor/utils/io/X;->e()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lio/ktor/utils/io/X;->b:Lio/ktor/utils/io/t;

    .line 5
    .line 6
    invoke-interface {v0}, Lio/ktor/utils/io/t;->d()LPf/a;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v1, p0, Lio/ktor/utils/io/X;->c:LPf/a;

    .line 11
    .line 12
    invoke-virtual {v1, v0}, LPf/a;->h(LPf/d;)J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    iget-wide v2, p0, Lio/ktor/utils/io/X;->d:J

    .line 17
    .line 18
    add-long/2addr v2, v0

    .line 19
    iput-wide v2, p0, Lio/ktor/utils/io/X;->d:J

    .line 20
    .line 21
    return-void
.end method

.method public final d()LPf/a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lio/ktor/utils/io/X;->c()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lio/ktor/utils/io/X;->c:LPf/a;

    .line 5
    .line 6
    return-object v0
.end method

.method public final e()V
    .locals 6

    .line 1
    iget-wide v0, p0, Lio/ktor/utils/io/X;->e:J

    .line 2
    .line 3
    iget-wide v2, p0, Lio/ktor/utils/io/X;->d:J

    .line 4
    .line 5
    iget-object v4, p0, Lio/ktor/utils/io/X;->c:LPf/a;

    .line 6
    .line 7
    iget-wide v4, v4, LPf/a;->c:J

    .line 8
    .line 9
    sub-long/2addr v2, v4

    .line 10
    add-long/2addr v2, v0

    .line 11
    iput-wide v2, p0, Lio/ktor/utils/io/X;->e:J

    .line 12
    .line 13
    iput-wide v4, p0, Lio/ktor/utils/io/X;->d:J

    .line 14
    .line 15
    return-void
.end method

.method public final g(ILlf/c;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p2, Lio/ktor/utils/io/W;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lio/ktor/utils/io/W;

    .line 7
    .line 8
    iget v1, v0, Lio/ktor/utils/io/W;->c:I

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
    iput v1, v0, Lio/ktor/utils/io/W;->c:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lio/ktor/utils/io/W;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lio/ktor/utils/io/W;-><init>(Lio/ktor/utils/io/X;Llf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lio/ktor/utils/io/W;->a:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 28
    .line 29
    iget v2, v0, Lio/ktor/utils/io/W;->c:I

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
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 41
    .line 42
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw p1

    .line 48
    :cond_2
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Lio/ktor/utils/io/X;->c()V

    .line 52
    .line 53
    .line 54
    iget-object p2, p0, Lio/ktor/utils/io/X;->c:LPf/a;

    .line 55
    .line 56
    iget-wide v4, p2, LPf/a;->c:J

    .line 57
    .line 58
    int-to-long v6, p1

    .line 59
    cmp-long p2, v4, v6

    .line 60
    .line 61
    if-ltz p2, :cond_3

    .line 62
    .line 63
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 64
    .line 65
    return-object p1

    .line 66
    :cond_3
    iput v3, v0, Lio/ktor/utils/io/W;->c:I

    .line 67
    .line 68
    iget-object p2, p0, Lio/ktor/utils/io/X;->b:Lio/ktor/utils/io/t;

    .line 69
    .line 70
    invoke-interface {p2, p1, v0}, Lio/ktor/utils/io/t;->g(ILlf/c;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    if-ne p2, v1, :cond_4

    .line 75
    .line 76
    return-object v1

    .line 77
    :cond_4
    :goto_1
    check-cast p2, Ljava/lang/Boolean;

    .line 78
    .line 79
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    if-eqz p1, :cond_5

    .line 84
    .line 85
    invoke-virtual {p0}, Lio/ktor/utils/io/X;->c()V

    .line 86
    .line 87
    .line 88
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 89
    .line 90
    return-object p1

    .line 91
    :cond_5
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 92
    .line 93
    return-object p1
.end method

.method public final h()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lio/ktor/utils/io/X;->c:LPf/a;

    .line 2
    .line 3
    invoke-virtual {v0}, LPf/a;->exhausted()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lio/ktor/utils/io/X;->b:Lio/ktor/utils/io/t;

    .line 10
    .line 11
    invoke-interface {v0}, Lio/ktor/utils/io/t;->h()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    return v0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    return v0
.end method
