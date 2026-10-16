.class public final LB/s;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public a:LD/k;

.field public b:I

.field public final synthetic c:LN/V;

.field public final synthetic d:J

.field public final synthetic e:LD/i;

.field public final synthetic f:LN/V;


# direct methods
.method public constructor <init>(LN/V;JLD/i;LN/V;Ljf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LB/s;->c:LN/V;

    .line 2
    .line 3
    iput-wide p2, p0, LB/s;->d:J

    .line 4
    .line 5
    iput-object p4, p0, LB/s;->e:LD/i;

    .line 6
    .line 7
    iput-object p5, p0, LB/s;->f:LN/V;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p6}, Llf/j;-><init>(ILjf/c;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ljf/c;)Ljf/c;
    .locals 7

    .line 1
    new-instance v0, LB/s;

    .line 2
    .line 3
    iget-object v1, p0, LB/s;->c:LN/V;

    .line 4
    .line 5
    iget-wide v2, p0, LB/s;->d:J

    .line 6
    .line 7
    iget-object v4, p0, LB/s;->e:LD/i;

    .line 8
    .line 9
    iget-object v5, p0, LB/s;->f:LN/V;

    .line 10
    .line 11
    move-object v6, p2

    .line 12
    invoke-direct/range {v0 .. v6}, LB/s;-><init>(LN/V;JLD/i;LN/V;Ljf/c;)V

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
    invoke-virtual {p0, p1, p2}, LB/s;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LB/s;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LB/s;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v1, p0, LB/s;->b:I

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x1

    .line 7
    if-eqz v1, :cond_2

    .line 8
    .line 9
    if-eq v1, v3, :cond_1

    .line 10
    .line 11
    if-ne v1, v2, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, LB/s;->a:LD/k;

    .line 14
    .line 15
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    goto :goto_2

    .line 19
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 20
    .line 21
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 22
    .line 23
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p1

    .line 27
    :cond_1
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_2
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iget-object p1, p0, LB/s;->c:LN/V;

    .line 35
    .line 36
    invoke-interface {p1}, LN/K0;->getValue()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    check-cast p1, Ltf/a;

    .line 41
    .line 42
    invoke-interface {p1}, Ltf/a;->invoke()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    check-cast p1, Ljava/lang/Boolean;

    .line 47
    .line 48
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    if-eqz p1, :cond_3

    .line 53
    .line 54
    sget-wide v4, LB/u;->a:J

    .line 55
    .line 56
    iput v3, p0, LB/s;->b:I

    .line 57
    .line 58
    invoke-static {v4, v5, p0}, LEf/H;->m(JLjf/c;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    if-ne p1, v0, :cond_3

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_3
    :goto_0
    new-instance p1, LD/k;

    .line 66
    .line 67
    iget-wide v3, p0, LB/s;->d:J

    .line 68
    .line 69
    invoke-direct {p1, v3, v4}, LD/k;-><init>(J)V

    .line 70
    .line 71
    .line 72
    iput-object p1, p0, LB/s;->a:LD/k;

    .line 73
    .line 74
    iput v2, p0, LB/s;->b:I

    .line 75
    .line 76
    iget-object v1, p0, LB/s;->e:LD/i;

    .line 77
    .line 78
    invoke-virtual {v1, p1, p0}, LD/i;->a(LD/h;Llf/c;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    if-ne v1, v0, :cond_4

    .line 83
    .line 84
    :goto_1
    return-object v0

    .line 85
    :cond_4
    move-object v0, p1

    .line 86
    :goto_2
    iget-object p1, p0, LB/s;->f:LN/V;

    .line 87
    .line 88
    invoke-interface {p1, v0}, LN/V;->setValue(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    sget-object p1, Lef/C;->a:Lef/C;

    .line 92
    .line 93
    return-object p1
.end method
