.class public final Lu1/u;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lu1/G;


# direct methods
.method public constructor <init>(Lu1/G;Ljf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lu1/u;->c:Lu1/G;

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
    .locals 2

    .line 1
    new-instance v0, Lu1/u;

    .line 2
    .line 3
    iget-object v1, p0, Lu1/u;->c:Lu1/G;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Lu1/u;-><init>(Lu1/G;Ljf/c;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Lu1/u;->b:Ljava/lang/Object;

    .line 9
    .line 10
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
    invoke-virtual {p0, p1, p2}, Lu1/u;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lu1/u;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lu1/u;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v1, p0, Lu1/u;->a:I

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
    iget-object p1, p0, Lu1/u;->b:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p1, LHf/m;

    .line 30
    .line 31
    iget-object v1, p0, Lu1/u;->c:Lu1/G;

    .line 32
    .line 33
    iget-object v2, v1, Lu1/G;->g:LHf/x0;

    .line 34
    .line 35
    invoke-virtual {v2}, LHf/x0;->getValue()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    check-cast v2, Lu1/H;

    .line 40
    .line 41
    instance-of v4, v2, Lu1/c;

    .line 42
    .line 43
    if-nez v4, :cond_2

    .line 44
    .line 45
    new-instance v4, Lu1/o;

    .line 46
    .line 47
    invoke-direct {v4, v2}, Lu1/o;-><init>(Lu1/H;)V

    .line 48
    .line 49
    .line 50
    iget-object v5, v1, Lu1/G;->i:LS3/n;

    .line 51
    .line 52
    invoke-virtual {v5, v4}, LS3/n;->b(Lu1/q;)V

    .line 53
    .line 54
    .line 55
    :cond_2
    new-instance v4, Lu1/s;

    .line 56
    .line 57
    const/4 v5, 0x0

    .line 58
    invoke-direct {v4, v2, v5}, Lu1/s;-><init>(Lu1/H;Ljf/c;)V

    .line 59
    .line 60
    .line 61
    iput v3, p0, Lu1/u;->a:I

    .line 62
    .line 63
    instance-of v2, p1, LHf/D0;

    .line 64
    .line 65
    if-nez v2, :cond_3

    .line 66
    .line 67
    new-instance v2, LHf/f;

    .line 68
    .line 69
    const/16 v3, 0xb

    .line 70
    .line 71
    invoke-direct {v2, p1, v3}, LHf/f;-><init>(LHf/m;I)V

    .line 72
    .line 73
    .line 74
    new-instance p1, Lkotlin/jvm/internal/C;

    .line 75
    .line 76
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 77
    .line 78
    .line 79
    new-instance v3, LHf/j;

    .line 80
    .line 81
    invoke-direct {v3, p1, v2, v4}, LHf/j;-><init>(Lkotlin/jvm/internal/C;LHf/m;Ltf/p;)V

    .line 82
    .line 83
    .line 84
    iget-object p1, v1, Lu1/G;->g:LHf/x0;

    .line 85
    .line 86
    invoke-virtual {p1, v3, p0}, LHf/x0;->collect(LHf/m;Ljf/c;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    return-object v0

    .line 90
    :cond_3
    check-cast p1, LHf/D0;

    .line 91
    .line 92
    iget-object p1, p1, LHf/D0;->a:Ljava/lang/Throwable;

    .line 93
    .line 94
    throw p1
.end method
