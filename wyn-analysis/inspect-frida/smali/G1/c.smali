.class public final LG1/c;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public a:I

.field public final synthetic b:Ljf/h;

.field public final synthetic c:LHf/v0;

.field public final synthetic d:LN/e0;


# direct methods
.method public constructor <init>(Ljf/h;LHf/v0;LN/e0;Ljf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LG1/c;->b:Ljf/h;

    .line 2
    .line 3
    iput-object p2, p0, LG1/c;->c:LHf/v0;

    .line 4
    .line 5
    iput-object p3, p0, LG1/c;->d:LN/e0;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Llf/j;-><init>(ILjf/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ljf/c;)Ljf/c;
    .locals 3

    .line 1
    new-instance p1, LG1/c;

    .line 2
    .line 3
    iget-object v0, p0, LG1/c;->d:LN/e0;

    .line 4
    .line 5
    iget-object v1, p0, LG1/c;->b:Ljf/h;

    .line 6
    .line 7
    iget-object v2, p0, LG1/c;->c:LHf/v0;

    .line 8
    .line 9
    invoke-direct {p1, v1, v2, v0, p2}, LG1/c;-><init>(Ljf/h;LHf/v0;LN/e0;Ljf/c;)V

    .line 10
    .line 11
    .line 12
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
    invoke-virtual {p0, p1, p2}, LG1/c;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LG1/c;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LG1/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v1, p0, LG1/c;->a:I

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
    :goto_0
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    goto :goto_2

    .line 26
    :cond_2
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    sget-object p1, Ljf/i;->a:Ljf/i;

    .line 30
    .line 31
    iget-object v1, p0, LG1/c;->b:Ljf/h;

    .line 32
    .line 33
    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    iget-object v4, p0, LG1/c;->d:LN/e0;

    .line 38
    .line 39
    iget-object v5, p0, LG1/c;->c:LHf/v0;

    .line 40
    .line 41
    if-eqz p1, :cond_3

    .line 42
    .line 43
    new-instance p1, LG1/a;

    .line 44
    .line 45
    const/4 v1, 0x0

    .line 46
    invoke-direct {p1, v4, v1}, LG1/a;-><init>(LN/e0;I)V

    .line 47
    .line 48
    .line 49
    iput v3, p0, LG1/c;->a:I

    .line 50
    .line 51
    invoke-interface {v5, p1, p0}, LHf/l;->collect(LHf/m;Ljf/c;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    if-ne p1, v0, :cond_4

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_3
    new-instance p1, LG1/b;

    .line 59
    .line 60
    const/4 v3, 0x0

    .line 61
    invoke-direct {p1, v5, v4, v3}, LG1/b;-><init>(LHf/v0;LN/e0;Ljf/c;)V

    .line 62
    .line 63
    .line 64
    iput v2, p0, LG1/c;->a:I

    .line 65
    .line 66
    invoke-static {v1, p1, p0}, LEf/H;->P(Ljf/h;Ltf/p;Ljf/c;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    if-ne p1, v0, :cond_4

    .line 71
    .line 72
    :goto_1
    return-object v0

    .line 73
    :cond_4
    :goto_2
    sget-object p1, Lef/C;->a:Lef/C;

    .line 74
    .line 75
    return-object p1
.end method
