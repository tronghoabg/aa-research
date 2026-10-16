.class public final LB/B;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public a:Ljava/lang/Object;

.field public b:I

.field public final synthetic c:LN/V;

.field public final synthetic d:LD/i;


# direct methods
.method public constructor <init>(LD/i;LN/V;Ljf/c;)V
    .locals 0

    .line 1
    iput-object p2, p0, LB/B;->c:LN/V;

    .line 2
    .line 3
    iput-object p1, p0, LB/B;->d:LD/i;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Llf/j;-><init>(ILjf/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ljf/c;)Ljf/c;
    .locals 2

    .line 1
    new-instance p1, LB/B;

    .line 2
    .line 3
    iget-object v0, p0, LB/B;->c:LN/V;

    .line 4
    .line 5
    iget-object v1, p0, LB/B;->d:LD/i;

    .line 6
    .line 7
    invoke-direct {p1, v1, v0, p2}, LB/B;-><init>(LD/i;LN/V;Ljf/c;)V

    .line 8
    .line 9
    .line 10
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
    invoke-virtual {p0, p1, p2}, LB/B;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LB/B;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LB/B;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    sget-object v0, Lkf/a;->a:Lkf/a;

    .line 2
    .line 3
    iget v1, p0, LB/B;->b:I

    .line 4
    .line 5
    iget-object v2, p0, LB/B;->d:LD/i;

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    const/4 v4, 0x1

    .line 9
    iget-object v5, p0, LB/B;->c:LN/V;

    .line 10
    .line 11
    if-eqz v1, :cond_2

    .line 12
    .line 13
    if-eq v1, v4, :cond_1

    .line 14
    .line 15
    if-ne v1, v3, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, LB/B;->a:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, LD/a;

    .line 20
    .line 21
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    goto :goto_2

    .line 25
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 26
    .line 27
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 28
    .line 29
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw p1

    .line 33
    :cond_1
    iget-object v1, p0, LB/B;->a:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v1, LN/V;

    .line 36
    .line 37
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    invoke-interface {v5}, LN/K0;->getValue()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    check-cast p1, LD/a;

    .line 49
    .line 50
    if-eqz p1, :cond_4

    .line 51
    .line 52
    new-instance v1, LD/b;

    .line 53
    .line 54
    invoke-direct {v1, p1}, LD/b;-><init>(LD/a;)V

    .line 55
    .line 56
    .line 57
    if-eqz v2, :cond_3

    .line 58
    .line 59
    iput-object v5, p0, LB/B;->a:Ljava/lang/Object;

    .line 60
    .line 61
    iput v4, p0, LB/B;->b:I

    .line 62
    .line 63
    invoke-virtual {v2, v1, p0}, LD/i;->a(LD/h;Llf/c;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    if-ne p1, v0, :cond_3

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_3
    move-object v1, v5

    .line 71
    :goto_0
    const/4 p1, 0x0

    .line 72
    invoke-interface {v1, p1}, LN/V;->setValue(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    :cond_4
    new-instance p1, LD/a;

    .line 76
    .line 77
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 78
    .line 79
    .line 80
    if-eqz v2, :cond_6

    .line 81
    .line 82
    iput-object p1, p0, LB/B;->a:Ljava/lang/Object;

    .line 83
    .line 84
    iput v3, p0, LB/B;->b:I

    .line 85
    .line 86
    invoke-virtual {v2, p1, p0}, LD/i;->a(LD/h;Llf/c;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    if-ne v1, v0, :cond_5

    .line 91
    .line 92
    :goto_1
    return-object v0

    .line 93
    :cond_5
    move-object v0, p1

    .line 94
    :goto_2
    move-object p1, v0

    .line 95
    :cond_6
    invoke-interface {v5, p1}, LN/V;->setValue(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    sget-object p1, Lef/C;->a:Lef/C;

    .line 99
    .line 100
    return-object p1
.end method
