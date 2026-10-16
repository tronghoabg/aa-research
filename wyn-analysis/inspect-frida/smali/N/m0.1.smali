.class public final LN/m0;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public a:LS8/b;

.field public b:I

.field public synthetic c:Ljava/lang/Object;

.field public final synthetic d:LN/p0;

.field public final synthetic e:LN/o0;

.field public final synthetic f:LN/Q;


# direct methods
.method public constructor <init>(LN/p0;LN/o0;LN/Q;Ljf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LN/m0;->d:LN/p0;

    .line 2
    .line 3
    iput-object p2, p0, LN/m0;->e:LN/o0;

    .line 4
    .line 5
    iput-object p3, p0, LN/m0;->f:LN/Q;

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
    .locals 4

    .line 1
    new-instance v0, LN/m0;

    .line 2
    .line 3
    iget-object v1, p0, LN/m0;->e:LN/o0;

    .line 4
    .line 5
    iget-object v2, p0, LN/m0;->f:LN/Q;

    .line 6
    .line 7
    iget-object v3, p0, LN/m0;->d:LN/p0;

    .line 8
    .line 9
    invoke-direct {v0, v3, v1, v2, p2}, LN/m0;-><init>(LN/p0;LN/o0;LN/Q;Ljf/c;)V

    .line 10
    .line 11
    .line 12
    iput-object p1, v0, LN/m0;->c:Ljava/lang/Object;

    .line 13
    .line 14
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
    invoke-virtual {p0, p1, p2}, LN/m0;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LN/m0;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LN/m0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    const/4 v0, 0x1

    .line 2
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 3
    .line 4
    iget v2, p0, LN/m0;->b:I

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    if-eqz v2, :cond_1

    .line 8
    .line 9
    if-ne v2, v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, LN/m0;->a:LS8/b;

    .line 12
    .line 13
    iget-object v1, p0, LN/m0;->c:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, LEf/m0;

    .line 16
    .line 17
    :try_start_0
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    .line 19
    .line 20
    goto/16 :goto_3

    .line 21
    .line 22
    :catchall_0
    move-exception p1

    .line 23
    goto/16 :goto_6

    .line 24
    .line 25
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 26
    .line 27
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 28
    .line 29
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw p1

    .line 33
    :cond_1
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    iget-object p1, p0, LN/m0;->c:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast p1, LEf/E;

    .line 39
    .line 40
    invoke-interface {p1}, LEf/E;->getCoroutineContext()Ljf/h;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-static {p1}, LEf/H;->u(Ljf/h;)LEf/m0;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    iget-object v2, p0, LN/m0;->d:LN/p0;

    .line 49
    .line 50
    invoke-static {v2, p1}, LN/p0;->u(LN/p0;LEf/m0;)V

    .line 51
    .line 52
    .line 53
    new-instance v2, LE/k;

    .line 54
    .line 55
    iget-object v4, p0, LN/m0;->d:LN/p0;

    .line 56
    .line 57
    invoke-direct {v2, v4, v0}, LE/k;-><init>(Ljava/lang/Object;I)V

    .line 58
    .line 59
    .line 60
    invoke-static {v2}, LX/q;->d(LE/k;)LS8/b;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    iget-object v4, p0, LN/m0;->d:LN/p0;

    .line 65
    .line 66
    iget-object v4, v4, LN/p0;->t:LN/P;

    .line 67
    .line 68
    :cond_2
    sget-object v5, LN/p0;->u:LHf/x0;

    .line 69
    .line 70
    invoke-virtual {v5}, LHf/x0;->getValue()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v6

    .line 74
    check-cast v6, LQ/e;

    .line 75
    .line 76
    move-object v7, v6

    .line 77
    check-cast v7, LT/b;

    .line 78
    .line 79
    iget-object v8, v7, LT/b;->c:LS/c;

    .line 80
    .line 81
    invoke-virtual {v8, v4}, LS/c;->containsKey(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v9

    .line 85
    if-eqz v9, :cond_3

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_3
    invoke-virtual {v7}, Lff/a;->isEmpty()Z

    .line 89
    .line 90
    .line 91
    move-result v9

    .line 92
    sget-object v10, LU/b;->a:LU/b;

    .line 93
    .line 94
    if-eqz v9, :cond_4

    .line 95
    .line 96
    new-instance v7, LT/a;

    .line 97
    .line 98
    invoke-direct {v7, v10, v10}, LT/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v8, v4, v7}, LS/c;->c(Ljava/lang/Object;LT/a;)LS/c;

    .line 102
    .line 103
    .line 104
    move-result-object v7

    .line 105
    new-instance v8, LT/b;

    .line 106
    .line 107
    invoke-direct {v8, v4, v4, v7}, LT/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;LS/c;)V

    .line 108
    .line 109
    .line 110
    move-object v7, v8

    .line 111
    goto :goto_0

    .line 112
    :cond_4
    iget-object v9, v7, LT/b;->b:Ljava/lang/Object;

    .line 113
    .line 114
    invoke-virtual {v8, v9}, LS/c;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v11

    .line 118
    invoke-static {v11}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    check-cast v11, LT/a;

    .line 122
    .line 123
    new-instance v12, LT/a;

    .line 124
    .line 125
    iget-object v11, v11, LT/a;->a:Ljava/lang/Object;

    .line 126
    .line 127
    invoke-direct {v12, v11, v4}, LT/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v8, v9, v12}, LS/c;->c(Ljava/lang/Object;LT/a;)LS/c;

    .line 131
    .line 132
    .line 133
    move-result-object v8

    .line 134
    new-instance v11, LT/a;

    .line 135
    .line 136
    invoke-direct {v11, v9, v10}, LT/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v8, v4, v11}, LS/c;->c(Ljava/lang/Object;LT/a;)LS/c;

    .line 140
    .line 141
    .line 142
    move-result-object v8

    .line 143
    new-instance v9, LT/b;

    .line 144
    .line 145
    iget-object v7, v7, LT/b;->a:Ljava/lang/Object;

    .line 146
    .line 147
    invoke-direct {v9, v7, v4, v8}, LT/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;LS/c;)V

    .line 148
    .line 149
    .line 150
    move-object v7, v9

    .line 151
    :goto_0
    if-eq v6, v7, :cond_5

    .line 152
    .line 153
    invoke-virtual {v5, v6, v7}, LHf/x0;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result v5

    .line 157
    if-eqz v5, :cond_2

    .line 158
    .line 159
    :cond_5
    :try_start_1
    iget-object v4, p0, LN/m0;->d:LN/p0;

    .line 160
    .line 161
    iget-object v5, v4, LN/p0;->b:Ljava/lang/Object;

    .line 162
    .line 163
    monitor-enter v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 164
    :try_start_2
    invoke-virtual {v4}, LN/p0;->A()Ljava/util/List;

    .line 165
    .line 166
    .line 167
    move-result-object v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 168
    :try_start_3
    monitor-exit v5

    .line 169
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 170
    .line 171
    .line 172
    move-result v5

    .line 173
    const/4 v6, 0x0

    .line 174
    :goto_1
    if-ge v6, v5, :cond_6

    .line 175
    .line 176
    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v7

    .line 180
    check-cast v7, LN/s;

    .line 181
    .line 182
    invoke-virtual {v7}, LN/s;->p()V

    .line 183
    .line 184
    .line 185
    add-int/2addr v6, v0

    .line 186
    goto :goto_1

    .line 187
    :goto_2
    move-object v1, p1

    .line 188
    move-object p1, v0

    .line 189
    move-object v0, v2

    .line 190
    goto :goto_6

    .line 191
    :catchall_1
    move-exception v0

    .line 192
    goto :goto_2

    .line 193
    :cond_6
    new-instance v4, LN/l0;

    .line 194
    .line 195
    iget-object v5, p0, LN/m0;->e:LN/o0;

    .line 196
    .line 197
    iget-object v6, p0, LN/m0;->f:LN/Q;

    .line 198
    .line 199
    invoke-direct {v4, v5, v6, v3}, LN/l0;-><init>(LN/o0;LN/Q;Ljf/c;)V

    .line 200
    .line 201
    .line 202
    iput-object p1, p0, LN/m0;->c:Ljava/lang/Object;

    .line 203
    .line 204
    iput-object v2, p0, LN/m0;->a:LS8/b;

    .line 205
    .line 206
    iput v0, p0, LN/m0;->b:I

    .line 207
    .line 208
    invoke-static {v4, p0}, LEf/H;->l(Ltf/p;Ljf/c;)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 212
    if-ne v0, v1, :cond_7

    .line 213
    .line 214
    return-object v1

    .line 215
    :cond_7
    move-object v1, p1

    .line 216
    move-object v0, v2

    .line 217
    :goto_3
    invoke-virtual {v0}, LS8/b;->c()V

    .line 218
    .line 219
    .line 220
    iget-object p1, p0, LN/m0;->d:LN/p0;

    .line 221
    .line 222
    iget-object v0, p1, LN/p0;->b:Ljava/lang/Object;

    .line 223
    .line 224
    monitor-enter v0

    .line 225
    :try_start_4
    iget-object v2, p1, LN/p0;->c:LEf/m0;

    .line 226
    .line 227
    if-ne v2, v1, :cond_8

    .line 228
    .line 229
    iput-object v3, p1, LN/p0;->c:LEf/m0;

    .line 230
    .line 231
    goto :goto_4

    .line 232
    :catchall_2
    move-exception p1

    .line 233
    goto :goto_5

    .line 234
    :cond_8
    :goto_4
    invoke-virtual {p1}, LN/p0;->x()LEf/l;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 235
    .line 236
    .line 237
    monitor-exit v0

    .line 238
    sget-object p1, LN/p0;->u:LHf/x0;

    .line 239
    .line 240
    iget-object p1, p0, LN/m0;->d:LN/p0;

    .line 241
    .line 242
    iget-object p1, p1, LN/p0;->t:LN/P;

    .line 243
    .line 244
    invoke-static {p1}, LN/P;->b(LN/P;)V

    .line 245
    .line 246
    .line 247
    sget-object p1, Lef/C;->a:Lef/C;

    .line 248
    .line 249
    return-object p1

    .line 250
    :goto_5
    monitor-exit v0

    .line 251
    throw p1

    .line 252
    :catchall_3
    move-exception v0

    .line 253
    :try_start_5
    monitor-exit v5

    .line 254
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 255
    :goto_6
    invoke-virtual {v0}, LS8/b;->c()V

    .line 256
    .line 257
    .line 258
    iget-object v0, p0, LN/m0;->d:LN/p0;

    .line 259
    .line 260
    iget-object v2, v0, LN/p0;->b:Ljava/lang/Object;

    .line 261
    .line 262
    monitor-enter v2

    .line 263
    :try_start_6
    iget-object v4, v0, LN/p0;->c:LEf/m0;

    .line 264
    .line 265
    if-ne v4, v1, :cond_9

    .line 266
    .line 267
    iput-object v3, v0, LN/p0;->c:LEf/m0;

    .line 268
    .line 269
    goto :goto_7

    .line 270
    :catchall_4
    move-exception p1

    .line 271
    goto :goto_8

    .line 272
    :cond_9
    :goto_7
    invoke-virtual {v0}, LN/p0;->x()LEf/l;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 273
    .line 274
    .line 275
    monitor-exit v2

    .line 276
    sget-object v0, LN/p0;->u:LHf/x0;

    .line 277
    .line 278
    iget-object v0, p0, LN/m0;->d:LN/p0;

    .line 279
    .line 280
    iget-object v0, v0, LN/p0;->t:LN/P;

    .line 281
    .line 282
    invoke-static {v0}, LN/P;->b(LN/P;)V

    .line 283
    .line 284
    .line 285
    throw p1

    .line 286
    :goto_8
    monitor-exit v2

    .line 287
    throw p1
.end method
