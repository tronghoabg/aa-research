.class public final LY3/j;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public a:I

.field public final synthetic b:LY3/n;


# direct methods
.method public constructor <init>(LY3/n;Ljf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LY3/j;->b:LY3/n;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Llf/j;-><init>(ILjf/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ljf/c;)Ljf/c;
    .locals 1

    .line 1
    new-instance p1, LY3/j;

    .line 2
    .line 3
    iget-object v0, p0, LY3/j;->b:LY3/n;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, LY3/j;-><init>(LY3/n;Ljf/c;)V

    .line 6
    .line 7
    .line 8
    return-object p1
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
    invoke-virtual {p0, p1, p2}, LY3/j;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LY3/j;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LY3/j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    sget-object v0, Lkf/a;->a:Lkf/a;

    .line 2
    .line 3
    iget v1, p0, LY3/j;->a:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-eqz v1, :cond_1

    .line 7
    .line 8
    if-ne v1, v2, :cond_0

    .line 9
    .line 10
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 15
    .line 16
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 17
    .line 18
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw p1

    .line 22
    :cond_1
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    new-instance p1, LA0/p;

    .line 26
    .line 27
    iget-object v1, p0, LY3/j;->b:LY3/n;

    .line 28
    .line 29
    const/16 v3, 0xf

    .line 30
    .line 31
    invoke-direct {p1, v1, v3}, LA0/p;-><init>(Ljava/lang/Object;I)V

    .line 32
    .line 33
    .line 34
    invoke-static {p1}, LN/d;->N(Ltf/a;)LHf/f0;

    .line 35
    .line 36
    .line 37
    move-result-object v6

    .line 38
    new-instance p1, LY3/h;

    .line 39
    .line 40
    const/4 v3, 0x0

    .line 41
    invoke-direct {p1, v1, v3}, LY3/h;-><init>(LY3/n;Ljf/c;)V

    .line 42
    .line 43
    .line 44
    sget v4, LHf/K;->a:I

    .line 45
    .line 46
    new-instance v5, LCd/a;

    .line 47
    .line 48
    invoke-direct {v5, p1, v3}, LCd/a;-><init>(Ltf/p;Ljf/c;)V

    .line 49
    .line 50
    .line 51
    new-instance v4, LIf/o;

    .line 52
    .line 53
    sget-object v7, Ljf/i;->a:Ljf/i;

    .line 54
    .line 55
    sget-object v9, LGf/a;->a:LGf/a;

    .line 56
    .line 57
    const/4 v8, -0x2

    .line 58
    invoke-direct/range {v4 .. v9}, LIf/o;-><init>(Ltf/q;LHf/l;Ljf/h;ILGf/a;)V

    .line 59
    .line 60
    .line 61
    new-instance p1, LY3/i;

    .line 62
    .line 63
    invoke-direct {p1, v1}, LY3/i;-><init>(LY3/n;)V

    .line 64
    .line 65
    .line 66
    iput v2, p0, LY3/j;->a:I

    .line 67
    .line 68
    invoke-virtual {v4, p1, p0}, LIf/i;->collect(LHf/m;Ljf/c;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    if-ne p1, v0, :cond_2

    .line 73
    .line 74
    return-object v0

    .line 75
    :cond_2
    :goto_0
    sget-object p1, Lef/C;->a:Lef/C;

    .line 76
    .line 77
    return-object p1
.end method
