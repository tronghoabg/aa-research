.class public final LN/D0;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ltf/p;

.field public final synthetic d:LN/V;


# direct methods
.method public constructor <init>(Ltf/p;LN/V;Ljf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LN/D0;->c:Ltf/p;

    .line 2
    .line 3
    iput-object p2, p0, LN/D0;->d:LN/V;

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
    .locals 3

    .line 1
    new-instance v0, LN/D0;

    .line 2
    .line 3
    iget-object v1, p0, LN/D0;->c:Ltf/p;

    .line 4
    .line 5
    iget-object v2, p0, LN/D0;->d:LN/V;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p2}, LN/D0;-><init>(Ltf/p;LN/V;Ljf/c;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, LN/D0;->b:Ljava/lang/Object;

    .line 11
    .line 12
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
    invoke-virtual {p0, p1, p2}, LN/D0;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LN/D0;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LN/D0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v1, p0, LN/D0;->a:I

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
    iget-object p1, p0, LN/D0;->b:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p1, LEf/E;

    .line 28
    .line 29
    new-instance v1, LN/e0;

    .line 30
    .line 31
    iget-object v3, p0, LN/D0;->d:LN/V;

    .line 32
    .line 33
    invoke-interface {p1}, LEf/E;->getCoroutineContext()Ljf/h;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-direct {v1, v3, p1}, LN/e0;-><init>(LN/V;Ljf/h;)V

    .line 38
    .line 39
    .line 40
    iput v2, p0, LN/D0;->a:I

    .line 41
    .line 42
    iget-object p1, p0, LN/D0;->c:Ltf/p;

    .line 43
    .line 44
    invoke-interface {p1, v1, p0}, Ltf/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    if-ne p1, v0, :cond_2

    .line 49
    .line 50
    return-object v0

    .line 51
    :cond_2
    :goto_0
    sget-object p1, Lef/C;->a:Lef/C;

    .line 52
    .line 53
    return-object p1
.end method
