.class public final LCd/p0;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public a:I

.field public final synthetic b:Ljava/lang/Long;

.field public final synthetic c:LFd/c;

.field public final synthetic d:LEf/I0;


# direct methods
.method public constructor <init>(Ljava/lang/Long;LFd/c;LEf/I0;Ljf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LCd/p0;->b:Ljava/lang/Long;

    .line 2
    .line 3
    iput-object p2, p0, LCd/p0;->c:LFd/c;

    .line 4
    .line 5
    iput-object p3, p0, LCd/p0;->d:LEf/I0;

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
    new-instance p1, LCd/p0;

    .line 2
    .line 3
    iget-object v0, p0, LCd/p0;->d:LEf/I0;

    .line 4
    .line 5
    iget-object v1, p0, LCd/p0;->b:Ljava/lang/Long;

    .line 6
    .line 7
    iget-object v2, p0, LCd/p0;->c:LFd/c;

    .line 8
    .line 9
    invoke-direct {p1, v1, v2, v0, p2}, LCd/p0;-><init>(Ljava/lang/Long;LFd/c;LEf/I0;Ljf/c;)V

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
    invoke-virtual {p0, p1, p2}, LCd/p0;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LCd/p0;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LCd/p0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v1, p0, LCd/p0;->a:I

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
    iget-object p1, p0, LCd/p0;->b:Ljava/lang/Long;

    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 28
    .line 29
    .line 30
    move-result-wide v3

    .line 31
    iput v2, p0, LCd/p0;->a:I

    .line 32
    .line 33
    invoke-static {v3, v4, p0}, LEf/H;->m(JLjf/c;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    if-ne p1, v0, :cond_2

    .line 38
    .line 39
    return-object v0

    .line 40
    :cond_2
    :goto_0
    new-instance p1, LCd/c0;

    .line 41
    .line 42
    iget-object v0, p0, LCd/p0;->c:LFd/c;

    .line 43
    .line 44
    const-string v1, "request"

    .line 45
    .line 46
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    iget-object v1, v0, LFd/c;->a:LJd/B;

    .line 50
    .line 51
    invoke-virtual {v1}, LJd/B;->a()V

    .line 52
    .line 53
    .line 54
    new-instance v2, Ljava/lang/StringBuilder;

    .line 55
    .line 56
    const/16 v3, 0x100

    .line 57
    .line 58
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 59
    .line 60
    .line 61
    invoke-static {v1, v2}, Lvf/a;->g(LJd/B;Ljava/lang/StringBuilder;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    const-string v3, "toString(...)"

    .line 69
    .line 70
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    sget-object v3, LCd/m0;->a:LCd/m0;

    .line 74
    .line 75
    sget-object v4, Lzd/g;->a:LNd/a;

    .line 76
    .line 77
    iget-object v0, v0, LFd/c;->f:LNd/d;

    .line 78
    .line 79
    invoke-virtual {v0, v4}, LNd/d;->d(LNd/a;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    check-cast v0, Ljava/util/Map;

    .line 84
    .line 85
    const/4 v4, 0x0

    .line 86
    if-eqz v0, :cond_3

    .line 87
    .line 88
    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    goto :goto_1

    .line 93
    :cond_3
    move-object v0, v4

    .line 94
    :goto_1
    check-cast v0, LCd/n0;

    .line 95
    .line 96
    if-eqz v0, :cond_4

    .line 97
    .line 98
    iget-object v0, v0, LCd/n0;->a:Ljava/lang/Long;

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_4
    move-object v0, v4

    .line 102
    :goto_2
    invoke-direct {p1, v2, v0, v4}, LCd/c0;-><init>(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Throwable;)V

    .line 103
    .line 104
    .line 105
    sget-object v0, LCd/q0;->a:Lvg/b;

    .line 106
    .line 107
    const-string v2, "<this>"

    .line 108
    .line 109
    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    invoke-interface {v0}, Lvg/b;->e()Z

    .line 113
    .line 114
    .line 115
    move-result v2

    .line 116
    if-eqz v2, :cond_5

    .line 117
    .line 118
    new-instance v2, Ljava/lang/StringBuilder;

    .line 119
    .line 120
    const-string v3, "Request timeout: "

    .line 121
    .line 122
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    invoke-interface {v0, v1}, Lvg/b;->s(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    :cond_5
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    invoke-static {v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    iget-object v1, p0, LCd/p0;->d:LEf/I0;

    .line 143
    .line 144
    invoke-static {v1, v0, p1}, LEf/H;->k(LEf/m0;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 145
    .line 146
    .line 147
    sget-object p1, Lef/C;->a:Lef/C;

    .line 148
    .line 149
    return-object p1
.end method
