.class public final Lio/ktor/utils/io/E;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public a:LEf/o0;

.field public b:I

.field public synthetic c:Ljava/lang/Object;

.field public final synthetic d:LOd/b;

.field public final synthetic e:Lio/ktor/utils/io/m;


# direct methods
.method public constructor <init>(LOd/b;Lio/ktor/utils/io/m;Ljf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lio/ktor/utils/io/E;->d:LOd/b;

    .line 2
    .line 3
    iput-object p2, p0, Lio/ktor/utils/io/E;->e:Lio/ktor/utils/io/m;

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
    new-instance v0, Lio/ktor/utils/io/E;

    .line 2
    .line 3
    iget-object v1, p0, Lio/ktor/utils/io/E;->d:LOd/b;

    .line 4
    .line 5
    iget-object v2, p0, Lio/ktor/utils/io/E;->e:Lio/ktor/utils/io/m;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p2}, Lio/ktor/utils/io/E;-><init>(LOd/b;Lio/ktor/utils/io/m;Ljf/c;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, Lio/ktor/utils/io/E;->c:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lio/ktor/utils/io/E;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lio/ktor/utils/io/E;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lio/ktor/utils/io/E;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    sget-object v0, Lkf/a;->a:Lkf/a;

    .line 2
    .line 3
    iget v1, p0, Lio/ktor/utils/io/E;->b:I

    .line 4
    .line 5
    iget-object v2, p0, Lio/ktor/utils/io/E;->e:Lio/ktor/utils/io/m;

    .line 6
    .line 7
    const/4 v3, 0x4

    .line 8
    const/4 v4, 0x3

    .line 9
    const/4 v5, 0x2

    .line 10
    const/4 v6, 0x1

    .line 11
    const/4 v7, 0x0

    .line 12
    if-eqz v1, :cond_3

    .line 13
    .line 14
    if-eq v1, v6, :cond_2

    .line 15
    .line 16
    if-eq v1, v5, :cond_1

    .line 17
    .line 18
    if-eq v1, v4, :cond_1

    .line 19
    .line 20
    if-eq v1, v3, :cond_0

    .line 21
    .line 22
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 23
    .line 24
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 25
    .line 26
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw p1

    .line 30
    :cond_0
    iget-object v0, p0, Lio/ktor/utils/io/E;->c:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, Ljava/lang/Throwable;

    .line 33
    .line 34
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    goto/16 :goto_4

    .line 38
    .line 39
    :cond_1
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto/16 :goto_2

    .line 43
    .line 44
    :cond_2
    iget-object v1, p0, Lio/ktor/utils/io/E;->a:LEf/o0;

    .line 45
    .line 46
    iget-object v6, p0, Lio/ktor/utils/io/E;->c:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v6, LEf/E;

    .line 49
    .line 50
    :try_start_0
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :catchall_0
    move-exception p1

    .line 55
    goto :goto_1

    .line 56
    :cond_3
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    iget-object p1, p0, Lio/ktor/utils/io/E;->c:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast p1, LEf/E;

    .line 62
    .line 63
    invoke-interface {p1}, LEf/E;->getCoroutineContext()Ljf/h;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-static {v1}, LEf/H;->u(Ljf/h;)LEf/m0;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    new-instance v8, LEf/o0;

    .line 72
    .line 73
    invoke-direct {v8, v1}, LEf/o0;-><init>(LEf/m0;)V

    .line 74
    .line 75
    .line 76
    :try_start_1
    iget-object v1, p0, Lio/ktor/utils/io/E;->d:LOd/b;

    .line 77
    .line 78
    new-instance v9, Lio/ktor/utils/io/Z;

    .line 79
    .line 80
    invoke-interface {p1}, LEf/E;->getCoroutineContext()Ljf/h;

    .line 81
    .line 82
    .line 83
    move-result-object v10

    .line 84
    invoke-interface {v10, v8}, Ljf/h;->plus(Ljf/h;)Ljf/h;

    .line 85
    .line 86
    .line 87
    move-result-object v10

    .line 88
    invoke-direct {v9, v2, v10}, Lio/ktor/utils/io/Z;-><init>(Lio/ktor/utils/io/t;Ljf/h;)V

    .line 89
    .line 90
    .line 91
    iput-object p1, p0, Lio/ktor/utils/io/E;->c:Ljava/lang/Object;

    .line 92
    .line 93
    iput-object v8, p0, Lio/ktor/utils/io/E;->a:LEf/o0;

    .line 94
    .line 95
    iput v6, p0, Lio/ktor/utils/io/E;->b:I

    .line 96
    .line 97
    invoke-virtual {v1, v9, p0}, LOd/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 101
    if-ne v1, v0, :cond_4

    .line 102
    .line 103
    goto :goto_3

    .line 104
    :cond_4
    move-object v6, p1

    .line 105
    move-object v1, v8

    .line 106
    :goto_0
    :try_start_2
    invoke-virtual {v1}, LEf/o0;->Y()Z

    .line 107
    .line 108
    .line 109
    invoke-interface {v6}, LEf/E;->getCoroutineContext()Ljf/h;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    invoke-static {p1}, LEf/H;->u(Ljf/h;)LEf/m0;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    invoke-interface {p1}, LEf/m0;->isCancelled()Z

    .line 118
    .line 119
    .line 120
    move-result p1

    .line 121
    if-eqz p1, :cond_5

    .line 122
    .line 123
    invoke-interface {v6}, LEf/E;->getCoroutineContext()Ljf/h;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    invoke-static {p1}, LEf/H;->u(Ljf/h;)LEf/m0;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    invoke-interface {p1}, LEf/m0;->getCancellationException()Ljava/util/concurrent/CancellationException;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    invoke-virtual {v2, p1}, Lio/ktor/utils/io/m;->a(Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 136
    .line 137
    .line 138
    :cond_5
    iput-object v7, p0, Lio/ktor/utils/io/E;->c:Ljava/lang/Object;

    .line 139
    .line 140
    iput-object v7, p0, Lio/ktor/utils/io/E;->a:LEf/o0;

    .line 141
    .line 142
    iput v5, p0, Lio/ktor/utils/io/E;->b:I

    .line 143
    .line 144
    invoke-virtual {v1, p0}, LEf/z0;->join(Ljf/c;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    if-ne p1, v0, :cond_6

    .line 149
    .line 150
    goto :goto_3

    .line 151
    :catchall_1
    move-exception p1

    .line 152
    move-object v1, v8

    .line 153
    :goto_1
    :try_start_3
    const-string v5, "Exception thrown while reading from channel"

    .line 154
    .line 155
    invoke-static {v1, v5, p1}, LEf/H;->k(LEf/m0;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 156
    .line 157
    .line 158
    invoke-static {v2, p1}, Lio/ktor/utils/io/N;->c(Lio/ktor/utils/io/J;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 159
    .line 160
    .line 161
    iput-object v7, p0, Lio/ktor/utils/io/E;->c:Ljava/lang/Object;

    .line 162
    .line 163
    iput-object v7, p0, Lio/ktor/utils/io/E;->a:LEf/o0;

    .line 164
    .line 165
    iput v4, p0, Lio/ktor/utils/io/E;->b:I

    .line 166
    .line 167
    invoke-virtual {v1, p0}, LEf/z0;->join(Ljf/c;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    if-ne p1, v0, :cond_6

    .line 172
    .line 173
    goto :goto_3

    .line 174
    :cond_6
    :goto_2
    sget-object p1, Lef/C;->a:Lef/C;

    .line 175
    .line 176
    return-object p1

    .line 177
    :catchall_2
    move-exception p1

    .line 178
    iput-object p1, p0, Lio/ktor/utils/io/E;->c:Ljava/lang/Object;

    .line 179
    .line 180
    iput-object v7, p0, Lio/ktor/utils/io/E;->a:LEf/o0;

    .line 181
    .line 182
    iput v3, p0, Lio/ktor/utils/io/E;->b:I

    .line 183
    .line 184
    invoke-virtual {v1, p0}, LEf/z0;->join(Ljf/c;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    if-ne v1, v0, :cond_7

    .line 189
    .line 190
    :goto_3
    return-object v0

    .line 191
    :cond_7
    move-object v0, p1

    .line 192
    :goto_4
    throw v0
.end method
