.class public final LHf/V;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:LHf/l;

.field public final synthetic d:LIf/b;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LHf/l;LHf/b0;Ljava/lang/Object;Ljf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LHf/V;->c:LHf/l;

    .line 2
    .line 3
    check-cast p2, LIf/b;

    .line 4
    .line 5
    iput-object p2, p0, LHf/V;->d:LIf/b;

    .line 6
    .line 7
    iput-object p3, p0, LHf/V;->e:Ljava/lang/Object;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p4}, Llf/j;-><init>(ILjf/c;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ljf/c;)Ljf/c;
    .locals 4

    .line 1
    new-instance v0, LHf/V;

    .line 2
    .line 3
    iget-object v1, p0, LHf/V;->d:LIf/b;

    .line 4
    .line 5
    iget-object v2, p0, LHf/V;->e:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, p0, LHf/V;->c:LHf/l;

    .line 8
    .line 9
    invoke-direct {v0, v3, v1, v2, p2}, LHf/V;-><init>(LHf/l;LHf/b0;Ljava/lang/Object;Ljf/c;)V

    .line 10
    .line 11
    .line 12
    iput-object p1, v0, LHf/V;->b:Ljava/lang/Object;

    .line 13
    .line 14
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LHf/m0;

    .line 2
    .line 3
    check-cast p2, Ljf/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, LHf/V;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LHf/V;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LHf/V;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    sget-object v0, Lkf/a;->a:Lkf/a;

    .line 2
    .line 3
    iget v1, p0, LHf/V;->a:I

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
    iget-object p1, p0, LHf/V;->b:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p1, LHf/m0;

    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    iget-object v1, p0, LHf/V;->d:LIf/b;

    .line 34
    .line 35
    if-eqz p1, :cond_4

    .line 36
    .line 37
    if-eq p1, v2, :cond_5

    .line 38
    .line 39
    const/4 v0, 0x2

    .line 40
    if-ne p1, v0, :cond_3

    .line 41
    .line 42
    sget-object p1, LHf/k0;->a:LH6/g;

    .line 43
    .line 44
    iget-object v0, p0, LHf/V;->e:Ljava/lang/Object;

    .line 45
    .line 46
    if-ne v0, p1, :cond_2

    .line 47
    .line 48
    invoke-interface {v1}, LHf/b0;->c()V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_2
    invoke-interface {v1, v0}, LHf/b0;->b(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_3
    new-instance p1, LE5/Q;

    .line 57
    .line 58
    const/16 v0, 0x9

    .line 59
    .line 60
    const/4 v1, 0x0

    .line 61
    invoke-direct {p1, v1, v0}, LE5/Q;-><init>(BI)V

    .line 62
    .line 63
    .line 64
    throw p1

    .line 65
    :cond_4
    iput v2, p0, LHf/V;->a:I

    .line 66
    .line 67
    iget-object p1, p0, LHf/V;->c:LHf/l;

    .line 68
    .line 69
    invoke-interface {p1, v1, p0}, LHf/l;->collect(LHf/m;Ljf/c;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    if-ne p1, v0, :cond_5

    .line 74
    .line 75
    return-object v0

    .line 76
    :cond_5
    :goto_0
    sget-object p1, Lef/C;->a:Lef/C;

    .line 77
    .line 78
    return-object p1
.end method
