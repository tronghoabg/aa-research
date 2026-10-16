.class public final LB/C;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public a:LN/V;

.field public b:I

.field public final synthetic c:LN/V;

.field public final synthetic d:LD/i;


# direct methods
.method public constructor <init>(LD/i;LN/V;Ljf/c;)V
    .locals 0

    .line 1
    iput-object p2, p0, LB/C;->c:LN/V;

    .line 2
    .line 3
    iput-object p1, p0, LB/C;->d:LD/i;

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
    new-instance p1, LB/C;

    .line 2
    .line 3
    iget-object v0, p0, LB/C;->c:LN/V;

    .line 4
    .line 5
    iget-object v1, p0, LB/C;->d:LD/i;

    .line 6
    .line 7
    invoke-direct {p1, v1, v0, p2}, LB/C;-><init>(LD/i;LN/V;Ljf/c;)V

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
    invoke-virtual {p0, p1, p2}, LB/C;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LB/C;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LB/C;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    sget-object v0, Lkf/a;->a:Lkf/a;

    .line 2
    .line 3
    iget v1, p0, LB/C;->b:I

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
    iget-object v0, p0, LB/C;->a:LN/V;

    .line 11
    .line 12
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p1

    .line 24
    :cond_1
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, LB/C;->c:LN/V;

    .line 28
    .line 29
    invoke-interface {p1}, LN/K0;->getValue()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    check-cast v1, LD/a;

    .line 34
    .line 35
    if-eqz v1, :cond_4

    .line 36
    .line 37
    new-instance v3, LD/b;

    .line 38
    .line 39
    invoke-direct {v3, v1}, LD/b;-><init>(LD/a;)V

    .line 40
    .line 41
    .line 42
    iget-object v1, p0, LB/C;->d:LD/i;

    .line 43
    .line 44
    if-eqz v1, :cond_3

    .line 45
    .line 46
    iput-object p1, p0, LB/C;->a:LN/V;

    .line 47
    .line 48
    iput v2, p0, LB/C;->b:I

    .line 49
    .line 50
    invoke-virtual {v1, v3, p0}, LD/i;->a(LD/h;Llf/c;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    if-ne v1, v0, :cond_2

    .line 55
    .line 56
    return-object v0

    .line 57
    :cond_2
    move-object v0, p1

    .line 58
    :goto_0
    move-object p1, v0

    .line 59
    :cond_3
    const/4 v0, 0x0

    .line 60
    invoke-interface {p1, v0}, LN/V;->setValue(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    :cond_4
    sget-object p1, Lef/C;->a:Lef/C;

    .line 64
    .line 65
    return-object p1
.end method
