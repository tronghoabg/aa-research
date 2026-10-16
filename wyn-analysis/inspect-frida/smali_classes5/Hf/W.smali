.class public final LHf/W;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public a:I

.field public final synthetic b:LHf/o0;

.field public final synthetic c:LHf/l;

.field public final synthetic d:LIf/b;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LHf/o0;LHf/l;LHf/b0;Ljava/lang/Object;Ljf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LHf/W;->b:LHf/o0;

    .line 2
    .line 3
    iput-object p2, p0, LHf/W;->c:LHf/l;

    .line 4
    .line 5
    check-cast p3, LIf/b;

    .line 6
    .line 7
    iput-object p3, p0, LHf/W;->d:LIf/b;

    .line 8
    .line 9
    iput-object p4, p0, LHf/W;->e:Ljava/lang/Object;

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    invoke-direct {p0, p1, p5}, Llf/j;-><init>(ILjf/c;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ljf/c;)Ljf/c;
    .locals 6

    .line 1
    new-instance v0, LHf/W;

    .line 2
    .line 3
    iget-object v3, p0, LHf/W;->d:LIf/b;

    .line 4
    .line 5
    iget-object v1, p0, LHf/W;->b:LHf/o0;

    .line 6
    .line 7
    iget-object v2, p0, LHf/W;->c:LHf/l;

    .line 8
    .line 9
    iget-object v4, p0, LHf/W;->e:Ljava/lang/Object;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, LHf/W;-><init>(LHf/o0;LHf/l;LHf/b0;Ljava/lang/Object;Ljf/c;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LEf/E;

    .line 2
    .line 3
    check-cast p2, Ljf/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, LHf/W;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LHf/W;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LHf/W;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    sget-object v0, Lkf/a;->a:Lkf/a;

    .line 2
    .line 3
    iget v1, p0, LHf/W;->a:I

    .line 4
    .line 5
    iget-object v2, p0, LHf/W;->d:LIf/b;

    .line 6
    .line 7
    const/4 v3, 0x4

    .line 8
    const/4 v4, 0x3

    .line 9
    const/4 v5, 0x1

    .line 10
    iget-object v6, p0, LHf/W;->c:LHf/l;

    .line 11
    .line 12
    const/4 v7, 0x2

    .line 13
    if-eqz v1, :cond_3

    .line 14
    .line 15
    if-eq v1, v5, :cond_2

    .line 16
    .line 17
    if-eq v1, v7, :cond_1

    .line 18
    .line 19
    if-eq v1, v4, :cond_2

    .line 20
    .line 21
    if-ne v1, v3, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 25
    .line 26
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 27
    .line 28
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw p1

    .line 32
    :cond_1
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_2
    :goto_0
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_3

    .line 40
    :cond_3
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    sget-object p1, LHf/n0;->a:LHf/p0;

    .line 44
    .line 45
    iget-object v1, p0, LHf/W;->b:LHf/o0;

    .line 46
    .line 47
    if-ne v1, p1, :cond_4

    .line 48
    .line 49
    iput v5, p0, LHf/W;->a:I

    .line 50
    .line 51
    invoke-interface {v6, v2, p0}, LHf/l;->collect(LHf/m;Ljf/c;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    if-ne p1, v0, :cond_7

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_4
    sget-object p1, LHf/n0;->b:LHf/p0;

    .line 59
    .line 60
    const/4 v5, 0x0

    .line 61
    if-ne v1, p1, :cond_6

    .line 62
    .line 63
    invoke-virtual {v2}, LIf/b;->h()LIf/E;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    new-instance v1, LHf/U;

    .line 68
    .line 69
    invoke-direct {v1, v7, v5}, Llf/j;-><init>(ILjf/c;)V

    .line 70
    .line 71
    .line 72
    iput v7, p0, LHf/W;->a:I

    .line 73
    .line 74
    invoke-static {p1, v1, p0}, LHf/k0;->p(LHf/l;Ltf/p;Ljf/c;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    if-ne p1, v0, :cond_5

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_5
    :goto_1
    iput v4, p0, LHf/W;->a:I

    .line 82
    .line 83
    invoke-interface {v6, v2, p0}, LHf/l;->collect(LHf/m;Ljf/c;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    if-ne p1, v0, :cond_7

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_6
    invoke-virtual {v2}, LIf/b;->h()LIf/E;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    invoke-interface {v1, p1}, LHf/o0;->a(LIf/E;)LHf/l;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    invoke-static {p1}, LHf/k0;->m(LHf/l;)LHf/l;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    new-instance v1, LHf/V;

    .line 103
    .line 104
    iget-object v4, p0, LHf/W;->e:Ljava/lang/Object;

    .line 105
    .line 106
    invoke-direct {v1, v6, v2, v4, v5}, LHf/V;-><init>(LHf/l;LHf/b0;Ljava/lang/Object;Ljf/c;)V

    .line 107
    .line 108
    .line 109
    iput v3, p0, LHf/W;->a:I

    .line 110
    .line 111
    invoke-static {p1, v1, p0}, LHf/k0;->k(LHf/l;Ltf/p;Llf/j;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    if-ne p1, v0, :cond_7

    .line 116
    .line 117
    :goto_2
    return-object v0

    .line 118
    :cond_7
    :goto_3
    sget-object p1, Lef/C;->a:Lef/C;

    .line 119
    .line 120
    return-object p1
.end method
