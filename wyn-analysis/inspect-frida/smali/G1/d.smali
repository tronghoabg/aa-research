.class public final LG1/d;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Landroidx/lifecycle/o;

.field public final synthetic d:Landroidx/lifecycle/n;

.field public final synthetic e:Ljf/h;

.field public final synthetic f:LHf/v0;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/o;Landroidx/lifecycle/n;Ljf/h;LHf/v0;Ljf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LG1/d;->c:Landroidx/lifecycle/o;

    .line 2
    .line 3
    iput-object p2, p0, LG1/d;->d:Landroidx/lifecycle/n;

    .line 4
    .line 5
    iput-object p3, p0, LG1/d;->e:Ljf/h;

    .line 6
    .line 7
    iput-object p4, p0, LG1/d;->f:LHf/v0;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, Llf/j;-><init>(ILjf/c;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ljf/c;)Ljf/c;
    .locals 6

    .line 1
    new-instance v0, LG1/d;

    .line 2
    .line 3
    iget-object v1, p0, LG1/d;->c:Landroidx/lifecycle/o;

    .line 4
    .line 5
    iget-object v2, p0, LG1/d;->d:Landroidx/lifecycle/n;

    .line 6
    .line 7
    iget-object v3, p0, LG1/d;->e:Ljf/h;

    .line 8
    .line 9
    iget-object v4, p0, LG1/d;->f:LHf/v0;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, LG1/d;-><init>(Landroidx/lifecycle/o;Landroidx/lifecycle/n;Ljf/h;LHf/v0;Ljf/c;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, v0, LG1/d;->b:Ljava/lang/Object;

    .line 16
    .line 17
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LN/e0;

    .line 2
    .line 3
    check-cast p2, Ljf/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, LG1/d;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LG1/d;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LG1/d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    sget-object v0, Lkf/a;->a:Lkf/a;

    .line 2
    .line 3
    iget v1, p0, LG1/d;->a:I

    .line 4
    .line 5
    sget-object v2, Lef/C;->a:Lef/C;

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    if-ne v1, v3, :cond_0

    .line 11
    .line 12
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-object v2

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
    iget-object p1, p0, LG1/d;->b:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p1, LN/e0;

    .line 30
    .line 31
    new-instance v1, LG1/c;

    .line 32
    .line 33
    iget-object v4, p0, LG1/d;->e:Ljf/h;

    .line 34
    .line 35
    iget-object v5, p0, LG1/d;->f:LHf/v0;

    .line 36
    .line 37
    const/4 v6, 0x0

    .line 38
    invoke-direct {v1, v4, v5, p1, v6}, LG1/c;-><init>(Ljf/h;LHf/v0;LN/e0;Ljf/c;)V

    .line 39
    .line 40
    .line 41
    iput v3, p0, LG1/d;->a:I

    .line 42
    .line 43
    sget-object p1, Landroidx/lifecycle/n;->b:Landroidx/lifecycle/n;

    .line 44
    .line 45
    iget-object v3, p0, LG1/d;->d:Landroidx/lifecycle/n;

    .line 46
    .line 47
    if-eq v3, p1, :cond_5

    .line 48
    .line 49
    iget-object p1, p0, LG1/d;->c:Landroidx/lifecycle/o;

    .line 50
    .line 51
    invoke-virtual {p1}, Landroidx/lifecycle/o;->b()Landroidx/lifecycle/n;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    sget-object v5, Landroidx/lifecycle/n;->a:Landroidx/lifecycle/n;

    .line 56
    .line 57
    if-ne v4, v5, :cond_3

    .line 58
    .line 59
    :cond_2
    move-object p1, v2

    .line 60
    goto :goto_0

    .line 61
    :cond_3
    new-instance v4, Landroidx/lifecycle/O;

    .line 62
    .line 63
    invoke-direct {v4, p1, v3, v1, v6}, Landroidx/lifecycle/O;-><init>(Landroidx/lifecycle/o;Landroidx/lifecycle/n;LG1/c;Ljf/c;)V

    .line 64
    .line 65
    .line 66
    invoke-static {v4, p0}, LEf/H;->l(Ltf/p;Ljf/c;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    if-ne p1, v0, :cond_2

    .line 71
    .line 72
    :goto_0
    if-ne p1, v0, :cond_4

    .line 73
    .line 74
    return-object v0

    .line 75
    :cond_4
    return-object v2

    .line 76
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 77
    .line 78
    const-string v0, "repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state."

    .line 79
    .line 80
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    throw p1
.end method
