.class public final Landroidx/lifecycle/N;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public a:Lkotlin/jvm/internal/G;

.field public b:Lkotlin/jvm/internal/G;

.field public c:I

.field public final synthetic d:Landroidx/lifecycle/o;

.field public final synthetic e:Landroidx/lifecycle/n;

.field public final synthetic f:LEf/E;

.field public final synthetic g:LG1/c;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/o;Landroidx/lifecycle/n;LEf/E;LG1/c;Ljf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/lifecycle/N;->d:Landroidx/lifecycle/o;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/lifecycle/N;->e:Landroidx/lifecycle/n;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/lifecycle/N;->f:LEf/E;

    .line 6
    .line 7
    iput-object p4, p0, Landroidx/lifecycle/N;->g:LG1/c;

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
    new-instance v0, Landroidx/lifecycle/N;

    .line 2
    .line 3
    iget-object v4, p0, Landroidx/lifecycle/N;->g:LG1/c;

    .line 4
    .line 5
    iget-object v1, p0, Landroidx/lifecycle/N;->d:Landroidx/lifecycle/o;

    .line 6
    .line 7
    iget-object v2, p0, Landroidx/lifecycle/N;->e:Landroidx/lifecycle/n;

    .line 8
    .line 9
    iget-object v3, p0, Landroidx/lifecycle/N;->f:LEf/E;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, Landroidx/lifecycle/N;-><init>(Landroidx/lifecycle/o;Landroidx/lifecycle/n;LEf/E;LG1/c;Ljf/c;)V

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
    invoke-virtual {p0, p1, p2}, Landroidx/lifecycle/N;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Landroidx/lifecycle/N;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Landroidx/lifecycle/N;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    sget-object v0, Lkf/a;->a:Lkf/a;

    .line 2
    .line 3
    iget v1, p0, Landroidx/lifecycle/N;->c:I

    .line 4
    .line 5
    sget-object v2, Lef/C;->a:Lef/C;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    iget-object v4, p0, Landroidx/lifecycle/N;->d:Landroidx/lifecycle/o;

    .line 9
    .line 10
    const/4 v5, 0x1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    if-ne v1, v5, :cond_0

    .line 14
    .line 15
    iget-object v1, p0, Landroidx/lifecycle/N;->b:Lkotlin/jvm/internal/G;

    .line 16
    .line 17
    iget-object v5, p0, Landroidx/lifecycle/N;->a:Lkotlin/jvm/internal/G;

    .line 18
    .line 19
    :try_start_0
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    .line 22
    goto/16 :goto_2

    .line 23
    .line 24
    :catchall_0
    move-exception v0

    .line 25
    move-object p1, v0

    .line 26
    goto/16 :goto_4

    .line 27
    .line 28
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 29
    .line 30
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 31
    .line 32
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw p1

    .line 36
    :cond_1
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v4}, Landroidx/lifecycle/o;->b()Landroidx/lifecycle/n;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    sget-object v1, Landroidx/lifecycle/n;->a:Landroidx/lifecycle/n;

    .line 44
    .line 45
    if-ne p1, v1, :cond_2

    .line 46
    .line 47
    goto/16 :goto_3

    .line 48
    .line 49
    :cond_2
    new-instance v8, Lkotlin/jvm/internal/G;

    .line 50
    .line 51
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 52
    .line 53
    .line 54
    new-instance v1, Lkotlin/jvm/internal/G;

    .line 55
    .line 56
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 57
    .line 58
    .line 59
    :try_start_1
    iget-object p1, p0, Landroidx/lifecycle/N;->e:Landroidx/lifecycle/n;

    .line 60
    .line 61
    iget-object v9, p0, Landroidx/lifecycle/N;->f:LEf/E;

    .line 62
    .line 63
    iget-object v13, p0, Landroidx/lifecycle/N;->g:LG1/c;

    .line 64
    .line 65
    iput-object v8, p0, Landroidx/lifecycle/N;->a:Lkotlin/jvm/internal/G;

    .line 66
    .line 67
    iput-object v1, p0, Landroidx/lifecycle/N;->b:Lkotlin/jvm/internal/G;

    .line 68
    .line 69
    iput v5, p0, Landroidx/lifecycle/N;->c:I

    .line 70
    .line 71
    new-instance v11, LEf/n;

    .line 72
    .line 73
    invoke-static {p0}, LA6/h;->A(Ljf/c;)Ljf/c;

    .line 74
    .line 75
    .line 76
    move-result-object v6

    .line 77
    invoke-direct {v11, v5, v6}, LEf/n;-><init>(ILjf/c;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v11}, LEf/n;->t()V

    .line 81
    .line 82
    .line 83
    sget-object v5, Landroidx/lifecycle/m;->Companion:Landroidx/lifecycle/k;

    .line 84
    .line 85
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    const-string v5, "state"

    .line 89
    .line 90
    invoke-static {p1, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 94
    .line 95
    .line 96
    move-result v5

    .line 97
    const/4 v6, 0x2

    .line 98
    if-eq v5, v6, :cond_5

    .line 99
    .line 100
    const/4 v6, 0x3

    .line 101
    if-eq v5, v6, :cond_4

    .line 102
    .line 103
    const/4 v6, 0x4

    .line 104
    if-eq v5, v6, :cond_3

    .line 105
    .line 106
    move-object v7, v3

    .line 107
    goto :goto_1

    .line 108
    :cond_3
    sget-object v5, Landroidx/lifecycle/m;->ON_RESUME:Landroidx/lifecycle/m;

    .line 109
    .line 110
    :goto_0
    move-object v7, v5

    .line 111
    goto :goto_1

    .line 112
    :cond_4
    sget-object v5, Landroidx/lifecycle/m;->ON_START:Landroidx/lifecycle/m;

    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_5
    sget-object v5, Landroidx/lifecycle/m;->ON_CREATE:Landroidx/lifecycle/m;

    .line 116
    .line 117
    goto :goto_0

    .line 118
    :goto_1
    invoke-static {p1}, Landroidx/lifecycle/k;->a(Landroidx/lifecycle/n;)Landroidx/lifecycle/m;

    .line 119
    .line 120
    .line 121
    move-result-object v10

    .line 122
    invoke-static {}, LNf/e;->a()LNf/d;

    .line 123
    .line 124
    .line 125
    move-result-object v12

    .line 126
    new-instance v6, Landroidx/lifecycle/M;

    .line 127
    .line 128
    invoke-direct/range {v6 .. v13}, Landroidx/lifecycle/M;-><init>(Landroidx/lifecycle/m;Lkotlin/jvm/internal/G;LEf/E;Landroidx/lifecycle/m;LEf/n;LNf/d;LG1/c;)V

    .line 129
    .line 130
    .line 131
    iput-object v6, v1, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 132
    .line 133
    invoke-virtual {v4, v6}, Landroidx/lifecycle/o;->a(Landroidx/lifecycle/u;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v11}, LEf/n;->s()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 140
    if-ne p1, v0, :cond_6

    .line 141
    .line 142
    return-object v0

    .line 143
    :cond_6
    move-object v5, v8

    .line 144
    :goto_2
    iget-object p1, v5, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 145
    .line 146
    check-cast p1, LEf/m0;

    .line 147
    .line 148
    if-eqz p1, :cond_7

    .line 149
    .line 150
    invoke-interface {p1, v3}, LEf/m0;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 151
    .line 152
    .line 153
    :cond_7
    iget-object p1, v1, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 154
    .line 155
    check-cast p1, Landroidx/lifecycle/t;

    .line 156
    .line 157
    if-eqz p1, :cond_8

    .line 158
    .line 159
    invoke-virtual {v4, p1}, Landroidx/lifecycle/o;->c(Landroidx/lifecycle/u;)V

    .line 160
    .line 161
    .line 162
    :cond_8
    :goto_3
    return-object v2

    .line 163
    :catchall_1
    move-exception v0

    .line 164
    move-object p1, v0

    .line 165
    move-object v5, v8

    .line 166
    :goto_4
    iget-object v0, v5, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 167
    .line 168
    check-cast v0, LEf/m0;

    .line 169
    .line 170
    if-eqz v0, :cond_9

    .line 171
    .line 172
    invoke-interface {v0, v3}, LEf/m0;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 173
    .line 174
    .line 175
    :cond_9
    iget-object v0, v1, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 176
    .line 177
    check-cast v0, Landroidx/lifecycle/t;

    .line 178
    .line 179
    if-eqz v0, :cond_a

    .line 180
    .line 181
    invoke-virtual {v4, v0}, Landroidx/lifecycle/o;->c(Landroidx/lifecycle/u;)V

    .line 182
    .line 183
    .line 184
    :cond_a
    throw p1
.end method
