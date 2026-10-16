.class public final LIf/j;
.super LIf/i;
.source "SourceFile"


# direct methods
.method public constructor <init>(LHf/l;LFf/e;ILGf/a;I)V
    .locals 1

    .line 1
    and-int/lit8 v0, p5, 0x2

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object p2, Ljf/i;->a:Ljf/i;

    .line 6
    .line 7
    :cond_0
    and-int/lit8 v0, p5, 0x4

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    const/4 p3, -0x3

    .line 12
    :cond_1
    and-int/lit8 p5, p5, 0x8

    .line 13
    .line 14
    if-eqz p5, :cond_2

    .line 15
    .line 16
    sget-object p4, LGf/a;->a:LGf/a;

    .line 17
    .line 18
    :cond_2
    invoke-direct {p0, p3, p4, p1, p2}, LIf/i;-><init>(ILGf/a;LHf/l;Ljf/h;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final e(Ljf/h;ILGf/a;)LIf/g;
    .locals 2

    .line 1
    new-instance v0, LIf/j;

    .line 2
    .line 3
    iget-object v1, p0, LIf/i;->d:LHf/l;

    .line 4
    .line 5
    invoke-direct {v0, p2, p3, v1, p1}, LIf/i;-><init>(ILGf/a;LHf/l;Ljf/h;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public final f()LHf/l;
    .locals 1

    .line 1
    iget-object v0, p0, LIf/i;->d:LHf/l;

    .line 2
    .line 3
    return-object v0
.end method

.method public final g(LHf/m;Ljf/c;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LIf/i;->d:LHf/l;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, LHf/l;->collect(LHf/m;Ljf/c;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    sget-object p2, Lkf/a;->a:Lkf/a;

    .line 8
    .line 9
    if-ne p1, p2, :cond_0

    .line 10
    .line 11
    return-object p1

    .line 12
    :cond_0
    sget-object p1, Lef/C;->a:Lef/C;

    .line 13
    .line 14
    return-object p1
.end method
