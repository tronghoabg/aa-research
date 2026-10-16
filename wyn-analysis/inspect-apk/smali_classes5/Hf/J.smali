.class public final LHf/J;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:LHf/l;

.field public final synthetic d:Llf/j;


# direct methods
.method public constructor <init>(LHf/l;Ltf/q;Ljf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LHf/J;->c:LHf/l;

    .line 2
    .line 3
    check-cast p2, Llf/j;

    .line 4
    .line 5
    iput-object p2, p0, LHf/J;->d:Llf/j;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p3}, Llf/j;-><init>(ILjf/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ljf/c;)Ljf/c;
    .locals 3

    .line 1
    new-instance v0, LHf/J;

    .line 2
    .line 3
    iget-object v1, p0, LHf/J;->c:LHf/l;

    .line 4
    .line 5
    iget-object v2, p0, LHf/J;->d:Llf/j;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p2}, LHf/J;-><init>(LHf/l;Ltf/q;Ljf/c;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, LHf/J;->b:Ljava/lang/Object;

    .line 11
    .line 12
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LHf/m;

    .line 2
    .line 3
    check-cast p2, Ljf/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, LHf/J;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LHf/J;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LHf/J;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    sget-object v0, Lkf/a;->a:Lkf/a;

    .line 2
    .line 3
    iget v1, p0, LHf/J;->a:I

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
    iget-object v0, p0, LHf/J;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, LHf/I;

    .line 13
    .line 14
    :try_start_0
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_0
    .catch LIf/a; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    .line 16
    .line 17
    goto :goto_1

    .line 18
    :catch_0
    move-exception p1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 21
    .line 22
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 23
    .line 24
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw p1

    .line 28
    :cond_1
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, LHf/J;->b:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast p1, LHf/m;

    .line 34
    .line 35
    iget-object v1, p0, LHf/J;->c:LHf/l;

    .line 36
    .line 37
    new-instance v3, LHf/I;

    .line 38
    .line 39
    iget-object v4, p0, LHf/J;->d:Llf/j;

    .line 40
    .line 41
    invoke-direct {v3, v4, p1}, LHf/I;-><init>(Ltf/q;LHf/m;)V

    .line 42
    .line 43
    .line 44
    :try_start_1
    iput-object v3, p0, LHf/J;->b:Ljava/lang/Object;

    .line 45
    .line 46
    iput v2, p0, LHf/J;->a:I

    .line 47
    .line 48
    invoke-interface {v1, v3, p0}, LHf/l;->collect(LHf/m;Ljf/c;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p1
    :try_end_1
    .catch LIf/a; {:try_start_1 .. :try_end_1} :catch_1

    .line 52
    if-ne p1, v0, :cond_2

    .line 53
    .line 54
    return-object v0

    .line 55
    :catch_1
    move-exception p1

    .line 56
    move-object v0, v3

    .line 57
    :goto_0
    iget-object v1, p1, LIf/a;->a:Ljava/lang/Object;

    .line 58
    .line 59
    if-ne v1, v0, :cond_3

    .line 60
    .line 61
    invoke-interface {p0}, Ljf/c;->getContext()Ljf/h;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-static {p1}, LEf/H;->p(Ljf/h;)V

    .line 66
    .line 67
    .line 68
    :cond_2
    :goto_1
    sget-object p1, Lef/C;->a:Lef/C;

    .line 69
    .line 70
    return-object p1

    .line 71
    :cond_3
    throw p1
.end method
