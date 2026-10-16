.class public final LHf/u0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LHf/o0;


# virtual methods
.method public final a(LIf/E;)LHf/l;
    .locals 7

    .line 1
    new-instance v1, LHf/s0;

    .line 2
    .line 3
    const/4 v6, 0x0

    .line 4
    invoke-direct {v1, p0, v6}, LHf/s0;-><init>(LHf/u0;Ljf/c;)V

    .line 5
    .line 6
    .line 7
    sget v0, LHf/K;->a:I

    .line 8
    .line 9
    new-instance v0, LIf/o;

    .line 10
    .line 11
    sget-object v3, Ljf/i;->a:Ljf/i;

    .line 12
    .line 13
    sget-object v5, LGf/a;->a:LGf/a;

    .line 14
    .line 15
    const/4 v4, -0x2

    .line 16
    move-object v2, p1

    .line 17
    invoke-direct/range {v0 .. v5}, LIf/o;-><init>(Ltf/q;LHf/l;Ljf/h;ILGf/a;)V

    .line 18
    .line 19
    .line 20
    new-instance p1, LHf/t0;

    .line 21
    .line 22
    const/4 v1, 0x2

    .line 23
    invoke-direct {p1, v1, v6}, Llf/j;-><init>(ILjf/c;)V

    .line 24
    .line 25
    .line 26
    new-instance v1, LHf/v;

    .line 27
    .line 28
    invoke-direct {v1, v0, p1}, LHf/v;-><init>(LHf/l;Ltf/p;)V

    .line 29
    .line 30
    .line 31
    invoke-static {v1}, LHf/k0;->m(LHf/l;)LHf/l;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, LHf/u0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, LHf/u0;

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const/4 p1, 0x1

    .line 11
    return p1

    .line 12
    :cond_0
    const/4 p1, 0x0

    .line 13
    return p1
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    long-to-int v0, v0

    .line 4
    mul-int/lit8 v0, v0, 0x1f

    .line 5
    .line 6
    const-wide v1, 0x7fffffff80000000L

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    long-to-int v1, v1

    .line 12
    add-int/2addr v0, v1

    .line 13
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 8

    .line 1
    new-instance v0, Lgf/b;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-direct {v0, v1}, Lgf/b;-><init>(I)V

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, Lr7/e;->l(Lgf/b;)Lgf/b;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v1, "SharingStarted.WhileSubscribed("

    .line 14
    .line 15
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const/4 v5, 0x0

    .line 19
    const/4 v6, 0x0

    .line 20
    const/4 v3, 0x0

    .line 21
    const/4 v4, 0x0

    .line 22
    const/16 v7, 0x3f

    .line 23
    .line 24
    invoke-static/range {v2 .. v7}, Lff/o;->w0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ltf/l;I)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    const/16 v2, 0x29

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, LA7/p0;->n(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    return-object v0
.end method
