.class public final LA/z;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public a:LNf/a;

.field public b:Ljava/lang/Object;

.field public c:LA/A;

.field public d:I

.field public synthetic e:Ljava/lang/Object;

.field public final synthetic f:LA/A;

.field public final synthetic g:Llf/j;


# direct methods
.method public constructor <init>(LA/A;Ltf/l;Ljf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LA/z;->f:LA/A;

    .line 2
    .line 3
    check-cast p2, Llf/j;

    .line 4
    .line 5
    iput-object p2, p0, LA/z;->g:Llf/j;

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
    new-instance v0, LA/z;

    .line 2
    .line 3
    iget-object v1, p0, LA/z;->g:Llf/j;

    .line 4
    .line 5
    iget-object v2, p0, LA/z;->f:LA/A;

    .line 6
    .line 7
    invoke-direct {v0, v2, v1, p2}, LA/z;-><init>(LA/A;Ltf/l;Ljf/c;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, LA/z;->e:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, LA/z;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LA/z;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LA/z;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    sget-object v0, Lkf/a;->a:Lkf/a;

    .line 2
    .line 3
    iget v1, p0, LA/z;->d:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    const/4 v4, 0x2

    .line 8
    if-eqz v1, :cond_2

    .line 9
    .line 10
    if-eq v1, v3, :cond_1

    .line 11
    .line 12
    if-ne v1, v4, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, LA/z;->b:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, LA/A;

    .line 17
    .line 18
    iget-object v1, p0, LA/z;->a:LNf/a;

    .line 19
    .line 20
    check-cast v1, LNf/a;

    .line 21
    .line 22
    iget-object v3, p0, LA/z;->e:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v3, LA/y;

    .line 25
    .line 26
    :try_start_0
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    .line 29
    goto/16 :goto_5

    .line 30
    .line 31
    :catchall_0
    move-exception p1

    .line 32
    goto/16 :goto_7

    .line 33
    .line 34
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 35
    .line 36
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 37
    .line 38
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    throw p1

    .line 42
    :cond_1
    iget-object v1, p0, LA/z;->c:LA/A;

    .line 43
    .line 44
    iget-object v3, p0, LA/z;->b:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v3, Ltf/l;

    .line 47
    .line 48
    iget-object v5, p0, LA/z;->a:LNf/a;

    .line 49
    .line 50
    check-cast v5, LNf/a;

    .line 51
    .line 52
    iget-object v6, p0, LA/z;->e:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v6, LA/y;

    .line 55
    .line 56
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    move-object p1, v1

    .line 60
    :goto_0
    move-object v1, v5

    .line 61
    goto :goto_3

    .line 62
    :cond_2
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    iget-object p1, p0, LA/z;->e:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast p1, LEf/E;

    .line 68
    .line 69
    new-instance v1, LA/y;

    .line 70
    .line 71
    invoke-interface {p1}, LEf/E;->getCoroutineContext()Ljf/h;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    sget-object v5, LEf/l0;->a:LEf/l0;

    .line 76
    .line 77
    invoke-interface {p1, v5}, Ljf/h;->get(Ljf/g;)Ljf/f;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    check-cast p1, LEf/m0;

    .line 85
    .line 86
    invoke-direct {v1, p1}, LA/y;-><init>(LEf/m0;)V

    .line 87
    .line 88
    .line 89
    :goto_1
    iget-object p1, p0, LA/z;->f:LA/A;

    .line 90
    .line 91
    iget-object v5, p1, LA/A;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 92
    .line 93
    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v6

    .line 97
    check-cast v6, LA/y;

    .line 98
    .line 99
    if-eqz v6, :cond_4

    .line 100
    .line 101
    invoke-static {v3, v3}, LA/f;->a(II)I

    .line 102
    .line 103
    .line 104
    move-result v7

    .line 105
    if-ltz v7, :cond_3

    .line 106
    .line 107
    goto :goto_2

    .line 108
    :cond_3
    new-instance p1, Ljava/util/concurrent/CancellationException;

    .line 109
    .line 110
    const-string v0, "Current mutation had a higher priority"

    .line 111
    .line 112
    invoke-direct {p1, v0}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    throw p1

    .line 116
    :cond_4
    :goto_2
    invoke-virtual {v5, v6, v1}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result v7

    .line 120
    if-eqz v7, :cond_b

    .line 121
    .line 122
    if-eqz v6, :cond_5

    .line 123
    .line 124
    iget-object v5, v6, LA/y;->a:LEf/m0;

    .line 125
    .line 126
    invoke-interface {v5, v2}, LEf/m0;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 127
    .line 128
    .line 129
    :cond_5
    iput-object v1, p0, LA/z;->e:Ljava/lang/Object;

    .line 130
    .line 131
    iget-object v5, p1, LA/A;->b:LNf/d;

    .line 132
    .line 133
    iput-object v5, p0, LA/z;->a:LNf/a;

    .line 134
    .line 135
    iget-object v6, p0, LA/z;->g:Llf/j;

    .line 136
    .line 137
    iput-object v6, p0, LA/z;->b:Ljava/lang/Object;

    .line 138
    .line 139
    iput-object p1, p0, LA/z;->c:LA/A;

    .line 140
    .line 141
    iput v3, p0, LA/z;->d:I

    .line 142
    .line 143
    invoke-virtual {v5, p0}, LNf/d;->b(Ljf/c;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v3

    .line 147
    if-ne v3, v0, :cond_6

    .line 148
    .line 149
    goto :goto_4

    .line 150
    :cond_6
    move-object v3, v6

    .line 151
    move-object v6, v1

    .line 152
    goto :goto_0

    .line 153
    :goto_3
    :try_start_1
    iput-object v6, p0, LA/z;->e:Ljava/lang/Object;

    .line 154
    .line 155
    move-object v5, v1

    .line 156
    check-cast v5, LNf/a;

    .line 157
    .line 158
    iput-object v5, p0, LA/z;->a:LNf/a;

    .line 159
    .line 160
    iput-object p1, p0, LA/z;->b:Ljava/lang/Object;

    .line 161
    .line 162
    iput-object v2, p0, LA/z;->c:LA/A;

    .line 163
    .line 164
    iput v4, p0, LA/z;->d:I

    .line 165
    .line 166
    invoke-interface {v3, p0}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 170
    if-ne v3, v0, :cond_7

    .line 171
    .line 172
    :goto_4
    return-object v0

    .line 173
    :cond_7
    move-object v0, p1

    .line 174
    move-object p1, v3

    .line 175
    move-object v3, v6

    .line 176
    :goto_5
    :try_start_2
    iget-object v0, v0, LA/A;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 177
    .line 178
    :cond_8
    invoke-virtual {v0, v3, v2}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    move-result v4

    .line 182
    if-eqz v4, :cond_9

    .line 183
    .line 184
    goto :goto_6

    .line 185
    :cond_9
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 189
    if-eq v4, v3, :cond_8

    .line 190
    .line 191
    :goto_6
    invoke-interface {v1, v2}, LNf/a;->a(Ljava/lang/Object;)V

    .line 192
    .line 193
    .line 194
    return-object p1

    .line 195
    :catchall_1
    move-exception v0

    .line 196
    move-object v3, v0

    .line 197
    move-object v0, p1

    .line 198
    move-object p1, v3

    .line 199
    move-object v3, v6

    .line 200
    :goto_7
    :try_start_3
    iget-object v0, v0, LA/A;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 201
    .line 202
    :goto_8
    invoke-virtual {v0, v3, v2}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    move-result v4

    .line 206
    if-nez v4, :cond_a

    .line 207
    .line 208
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v4

    .line 212
    if-ne v4, v3, :cond_a

    .line 213
    .line 214
    goto :goto_8

    .line 215
    :cond_a
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 216
    :catchall_2
    move-exception p1

    .line 217
    invoke-interface {v1, v2}, LNf/a;->a(Ljava/lang/Object;)V

    .line 218
    .line 219
    .line 220
    throw p1

    .line 221
    :cond_b
    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v7

    .line 225
    if-eq v7, v6, :cond_4

    .line 226
    .line 227
    goto/16 :goto_1
.end method
