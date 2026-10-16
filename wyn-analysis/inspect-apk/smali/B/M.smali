.class public final LB/M;
.super Llf/i;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljf/h;

.field public final synthetic d:LKd/a;

.field public final synthetic e:LD/i;

.field public final synthetic f:LN/V;


# direct methods
.method public constructor <init>(Ljf/h;LKd/a;LD/i;LN/V;Ljf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LB/M;->c:Ljf/h;

    .line 2
    .line 3
    iput-object p2, p0, LB/M;->d:LKd/a;

    .line 4
    .line 5
    iput-object p3, p0, LB/M;->e:LD/i;

    .line 6
    .line 7
    iput-object p4, p0, LB/M;->f:LN/V;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, Llf/i;-><init>(ILjf/c;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ljf/c;)Ljf/c;
    .locals 6

    .line 1
    new-instance v0, LB/M;

    .line 2
    .line 3
    iget-object v2, p0, LB/M;->d:LKd/a;

    .line 4
    .line 5
    iget-object v1, p0, LB/M;->c:Ljf/h;

    .line 6
    .line 7
    iget-object v3, p0, LB/M;->e:LD/i;

    .line 8
    .line 9
    iget-object v4, p0, LB/M;->f:LN/V;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, LB/M;-><init>(Ljf/h;LKd/a;LD/i;LN/V;Ljf/c;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, v0, LB/M;->b:Ljava/lang/Object;

    .line 16
    .line 17
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lp0/s;

    .line 2
    .line 3
    check-cast p2, Ljf/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, LB/M;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LB/M;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LB/M;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    sget-object v0, Lkf/a;->a:Lkf/a;

    .line 2
    .line 3
    iget v1, p0, LB/M;->a:I

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
    iget-object v1, p0, LB/M;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Lp0/s;

    .line 13
    .line 14
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 19
    .line 20
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 21
    .line 22
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw p1

    .line 26
    :cond_1
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    iget-object p1, p0, LB/M;->b:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast p1, Lp0/s;

    .line 32
    .line 33
    move-object v1, p1

    .line 34
    :cond_2
    :goto_0
    iget-object p1, p0, LB/M;->c:Ljf/h;

    .line 35
    .line 36
    invoke-static {p1}, LEf/H;->z(Ljf/h;)Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-eqz p1, :cond_5

    .line 41
    .line 42
    iput-object v1, p0, LB/M;->b:Ljava/lang/Object;

    .line 43
    .line 44
    iput v2, p0, LB/M;->a:I

    .line 45
    .line 46
    sget-object p1, Lp0/g;->b:Lp0/g;

    .line 47
    .line 48
    invoke-virtual {v1, p1, p0}, Lp0/s;->e(Lp0/g;Llf/a;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    if-ne p1, v0, :cond_3

    .line 53
    .line 54
    return-object v0

    .line 55
    :cond_3
    :goto_1
    check-cast p1, Lp0/f;

    .line 56
    .line 57
    iget p1, p1, Lp0/f;->c:I

    .line 58
    .line 59
    const/4 v3, 0x4

    .line 60
    iget-object v4, p0, LB/M;->d:LKd/a;

    .line 61
    .line 62
    const/4 v5, 0x3

    .line 63
    const/4 v6, 0x0

    .line 64
    iget-object v7, p0, LB/M;->f:LN/V;

    .line 65
    .line 66
    iget-object v8, p0, LB/M;->e:LD/i;

    .line 67
    .line 68
    if-ne p1, v3, :cond_4

    .line 69
    .line 70
    new-instance p1, LB/K;

    .line 71
    .line 72
    invoke-direct {p1, v8, v7, v6}, LB/K;-><init>(LD/i;LN/V;Ljf/c;)V

    .line 73
    .line 74
    .line 75
    invoke-static {v4, v6, p1, v5}, LEf/H;->D(LEf/E;Ljf/h;Ltf/p;I)LEf/H0;

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_4
    const/4 v3, 0x5

    .line 80
    if-ne p1, v3, :cond_2

    .line 81
    .line 82
    new-instance p1, LB/L;

    .line 83
    .line 84
    invoke-direct {p1, v8, v7, v6}, LB/L;-><init>(LD/i;LN/V;Ljf/c;)V

    .line 85
    .line 86
    .line 87
    invoke-static {v4, v6, p1, v5}, LEf/H;->D(LEf/E;Ljf/h;Ltf/p;I)LEf/H0;

    .line 88
    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_5
    sget-object p1, Lef/C;->a:Lef/C;

    .line 92
    .line 93
    return-object p1
.end method
