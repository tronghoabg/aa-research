.class public final Lu1/r;
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
    iput-object p1, p0, Lu1/r;->c:Lu1/G;

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
    new-instance v0, Lu1/r;

    .line 2
    .line 3
    iget-object v1, p0, Lu1/r;->c:Lu1/G;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Lu1/r;-><init>(Lu1/G;Ljf/c;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Lu1/r;->b:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lu1/q;

    .line 2
    .line 3
    check-cast p2, Ljf/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lu1/r;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lu1/r;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lu1/r;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v1, p0, Lu1/r;->a:I

    .line 4
    .line 5
    sget-object v2, Lef/C;->a:Lef/C;

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    const/4 v4, 0x1

    .line 9
    if-eqz v1, :cond_2

    .line 10
    .line 11
    if-eq v1, v4, :cond_1

    .line 12
    .line 13
    if-ne v1, v3, :cond_0

    .line 14
    .line 15
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    return-object v2

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
    return-object v2

    .line 31
    :cond_2
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iget-object p1, p0, Lu1/r;->b:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast p1, Lu1/q;

    .line 37
    .line 38
    instance-of v1, p1, Lu1/o;

    .line 39
    .line 40
    iget-object v5, p0, Lu1/r;->c:Lu1/G;

    .line 41
    .line 42
    if-eqz v1, :cond_8

    .line 43
    .line 44
    check-cast p1, Lu1/o;

    .line 45
    .line 46
    iput v4, p0, Lu1/r;->a:I

    .line 47
    .line 48
    iget-object v1, v5, Lu1/G;->g:LHf/x0;

    .line 49
    .line 50
    invoke-virtual {v1}, LHf/x0;->getValue()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    check-cast v1, Lu1/H;

    .line 55
    .line 56
    instance-of v3, v1, Lu1/c;

    .line 57
    .line 58
    if-eqz v3, :cond_3

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_3
    instance-of v3, v1, Lu1/l;

    .line 62
    .line 63
    if-eqz v3, :cond_4

    .line 64
    .line 65
    iget-object p1, p1, Lu1/o;->a:Lu1/H;

    .line 66
    .line 67
    if-ne v1, p1, :cond_6

    .line 68
    .line 69
    invoke-virtual {v5, p0}, Lu1/G;->f(Llf/c;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    if-ne p1, v0, :cond_6

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_4
    sget-object p1, Lu1/I;->a:Lu1/I;

    .line 77
    .line 78
    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    if-eqz p1, :cond_5

    .line 83
    .line 84
    invoke-virtual {v5, p0}, Lu1/G;->f(Llf/c;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    if-ne p1, v0, :cond_6

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_5
    instance-of p1, v1, Lu1/k;

    .line 92
    .line 93
    if-nez p1, :cond_7

    .line 94
    .line 95
    :cond_6
    :goto_0
    move-object p1, v2

    .line 96
    :goto_1
    if-ne p1, v0, :cond_9

    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 100
    .line 101
    const-string v0, "Can\'t read in final state."

    .line 102
    .line 103
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    throw p1

    .line 107
    :cond_8
    instance-of v1, p1, Lu1/p;

    .line 108
    .line 109
    if-eqz v1, :cond_9

    .line 110
    .line 111
    check-cast p1, Lu1/p;

    .line 112
    .line 113
    iput v3, p0, Lu1/r;->a:I

    .line 114
    .line 115
    invoke-static {v5, p1, p0}, Lu1/G;->b(Lu1/G;Lu1/p;Llf/c;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    if-ne p1, v0, :cond_9

    .line 120
    .line 121
    :goto_2
    return-object v0

    .line 122
    :cond_9
    return-object v2
.end method
