.class public final Lio/ktor/utils/io/M;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public a:Ljava/lang/Object;

.field public b:I

.field public synthetic c:Ljava/lang/Object;

.field public final synthetic d:Llf/j;

.field public final synthetic e:Lio/ktor/utils/io/m;


# direct methods
.method public constructor <init>(Ltf/p;Lio/ktor/utils/io/m;Ljf/c;)V
    .locals 0

    .line 1
    check-cast p1, Llf/j;

    .line 2
    .line 3
    iput-object p1, p0, Lio/ktor/utils/io/M;->d:Llf/j;

    .line 4
    .line 5
    iput-object p2, p0, Lio/ktor/utils/io/M;->e:Lio/ktor/utils/io/m;

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
    new-instance v0, Lio/ktor/utils/io/M;

    .line 2
    .line 3
    iget-object v1, p0, Lio/ktor/utils/io/M;->d:Llf/j;

    .line 4
    .line 5
    iget-object v2, p0, Lio/ktor/utils/io/M;->e:Lio/ktor/utils/io/m;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p2}, Lio/ktor/utils/io/M;-><init>(Ltf/p;Lio/ktor/utils/io/m;Ljf/c;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, Lio/ktor/utils/io/M;->c:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lio/ktor/utils/io/M;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lio/ktor/utils/io/M;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lio/ktor/utils/io/M;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v1, p0, Lio/ktor/utils/io/M;->b:I

    .line 4
    .line 5
    iget-object v2, p0, Lio/ktor/utils/io/M;->e:Lio/ktor/utils/io/m;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 12
    .line 13
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 14
    .line 15
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    throw p1

    .line 19
    :pswitch_0
    iget-object v0, p0, Lio/ktor/utils/io/M;->c:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Ljava/lang/Throwable;

    .line 22
    .line 23
    :try_start_0
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    .line 25
    .line 26
    goto/16 :goto_a

    .line 27
    .line 28
    :catchall_0
    move-exception p1

    .line 29
    goto/16 :goto_9

    .line 30
    .line 31
    :pswitch_1
    iget-object v1, p0, Lio/ktor/utils/io/M;->a:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v1, Ljava/lang/Throwable;

    .line 34
    .line 35
    iget-object v4, p0, Lio/ktor/utils/io/M;->c:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v4, LEf/E;

    .line 38
    .line 39
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    move-object p1, v1

    .line 43
    goto/16 :goto_7

    .line 44
    .line 45
    :pswitch_2
    :try_start_1
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 46
    .line 47
    .line 48
    goto/16 :goto_6

    .line 49
    .line 50
    :pswitch_3
    iget-object v1, p0, Lio/ktor/utils/io/M;->c:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v1, LEf/E;

    .line 53
    .line 54
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    goto/16 :goto_5

    .line 58
    .line 59
    :pswitch_4
    :try_start_2
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 60
    .line 61
    .line 62
    goto/16 :goto_6

    .line 63
    .line 64
    :catchall_1
    move-exception p1

    .line 65
    goto/16 :goto_3

    .line 66
    .line 67
    :pswitch_5
    iget-object v1, p0, Lio/ktor/utils/io/M;->c:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v1, LEf/E;

    .line 70
    .line 71
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    goto/16 :goto_2

    .line 75
    .line 76
    :pswitch_6
    iget-object v1, p0, Lio/ktor/utils/io/M;->a:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v1, LEf/v;

    .line 79
    .line 80
    iget-object v4, p0, Lio/ktor/utils/io/M;->c:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v4, LEf/E;

    .line 83
    .line 84
    :try_start_3
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 85
    .line 86
    .line 87
    goto :goto_0

    .line 88
    :catchall_2
    move-exception p1

    .line 89
    goto/16 :goto_4

    .line 90
    .line 91
    :pswitch_7
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    iget-object p1, p0, Lio/ktor/utils/io/M;->c:Ljava/lang/Object;

    .line 95
    .line 96
    move-object v4, p1

    .line 97
    check-cast v4, LEf/E;

    .line 98
    .line 99
    invoke-interface {v4}, LEf/E;->getCoroutineContext()Ljf/h;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-static {p1}, LEf/H;->u(Ljf/h;)LEf/m0;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    new-instance v1, LEf/o0;

    .line 108
    .line 109
    invoke-direct {v1, p1}, LEf/o0;-><init>(LEf/m0;)V

    .line 110
    .line 111
    .line 112
    :try_start_4
    iget-object p1, p0, Lio/ktor/utils/io/M;->d:Llf/j;

    .line 113
    .line 114
    new-instance v5, Lio/ktor/utils/io/b0;

    .line 115
    .line 116
    invoke-interface {v4}, LEf/E;->getCoroutineContext()Ljf/h;

    .line 117
    .line 118
    .line 119
    move-result-object v6

    .line 120
    invoke-interface {v6, v1}, Ljf/h;->plus(Ljf/h;)Ljf/h;

    .line 121
    .line 122
    .line 123
    move-result-object v6

    .line 124
    invoke-direct {v5, v2, v6}, Lio/ktor/utils/io/b0;-><init>(Lio/ktor/utils/io/J;Ljf/h;)V

    .line 125
    .line 126
    .line 127
    iput-object v4, p0, Lio/ktor/utils/io/M;->c:Ljava/lang/Object;

    .line 128
    .line 129
    iput-object v1, p0, Lio/ktor/utils/io/M;->a:Ljava/lang/Object;

    .line 130
    .line 131
    const/4 v6, 0x1

    .line 132
    iput v6, p0, Lio/ktor/utils/io/M;->b:I

    .line 133
    .line 134
    invoke-interface {p1, v5, p0}, Ltf/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    if-ne p1, v0, :cond_0

    .line 139
    .line 140
    goto/16 :goto_8

    .line 141
    .line 142
    :cond_0
    :goto_0
    move-object p1, v1

    .line 143
    check-cast p1, LEf/o0;

    .line 144
    .line 145
    invoke-virtual {p1}, LEf/o0;->Y()Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 146
    .line 147
    .line 148
    :try_start_5
    invoke-interface {v4}, LEf/E;->getCoroutineContext()Ljf/h;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    invoke-static {v1}, LEf/H;->u(Ljf/h;)LEf/m0;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    invoke-interface {v1}, LEf/m0;->isCancelled()Z

    .line 157
    .line 158
    .line 159
    move-result v1

    .line 160
    if-eqz v1, :cond_1

    .line 161
    .line 162
    invoke-interface {v4}, LEf/E;->getCoroutineContext()Ljf/h;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    invoke-static {v1}, LEf/H;->u(Ljf/h;)LEf/m0;

    .line 167
    .line 168
    .line 169
    move-result-object v1

    .line 170
    invoke-interface {v1}, LEf/m0;->getCancellationException()Ljava/util/concurrent/CancellationException;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    invoke-virtual {v2, v1}, Lio/ktor/utils/io/m;->a(Ljava/lang/Throwable;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 175
    .line 176
    .line 177
    goto :goto_1

    .line 178
    :catchall_3
    move-exception v1

    .line 179
    move-object v7, v1

    .line 180
    move-object v1, p1

    .line 181
    move-object p1, v7

    .line 182
    goto :goto_4

    .line 183
    :cond_1
    :goto_1
    iput-object v4, p0, Lio/ktor/utils/io/M;->c:Ljava/lang/Object;

    .line 184
    .line 185
    iput-object v3, p0, Lio/ktor/utils/io/M;->a:Ljava/lang/Object;

    .line 186
    .line 187
    const/4 v1, 0x2

    .line 188
    iput v1, p0, Lio/ktor/utils/io/M;->b:I

    .line 189
    .line 190
    invoke-virtual {p1, p0}, LEf/z0;->join(Ljf/c;)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    if-ne p1, v0, :cond_2

    .line 195
    .line 196
    goto :goto_8

    .line 197
    :cond_2
    :goto_2
    :try_start_6
    iput-object v3, p0, Lio/ktor/utils/io/M;->c:Ljava/lang/Object;

    .line 198
    .line 199
    const/4 p1, 0x3

    .line 200
    iput p1, p0, Lio/ktor/utils/io/M;->b:I

    .line 201
    .line 202
    invoke-virtual {v2, p0}, Lio/ktor/utils/io/m;->f(Ljf/c;)Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 206
    if-ne p1, v0, :cond_4

    .line 207
    .line 208
    goto :goto_8

    .line 209
    :goto_3
    invoke-static {p1}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    .line 210
    .line 211
    .line 212
    goto :goto_6

    .line 213
    :goto_4
    :try_start_7
    const-string v5, "Exception thrown while writing to channel"

    .line 214
    .line 215
    invoke-static {v1, v5, p1}, LEf/H;->k(LEf/m0;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v2, p1}, Lio/ktor/utils/io/m;->a(Ljava/lang/Throwable;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 219
    .line 220
    .line 221
    iput-object v4, p0, Lio/ktor/utils/io/M;->c:Ljava/lang/Object;

    .line 222
    .line 223
    iput-object v3, p0, Lio/ktor/utils/io/M;->a:Ljava/lang/Object;

    .line 224
    .line 225
    const/4 p1, 0x4

    .line 226
    iput p1, p0, Lio/ktor/utils/io/M;->b:I

    .line 227
    .line 228
    check-cast v1, LEf/z0;

    .line 229
    .line 230
    invoke-virtual {v1, p0}, LEf/z0;->join(Ljf/c;)Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object p1

    .line 234
    if-ne p1, v0, :cond_3

    .line 235
    .line 236
    goto :goto_8

    .line 237
    :cond_3
    :goto_5
    :try_start_8
    iput-object v3, p0, Lio/ktor/utils/io/M;->c:Ljava/lang/Object;

    .line 238
    .line 239
    const/4 p1, 0x5

    .line 240
    iput p1, p0, Lio/ktor/utils/io/M;->b:I

    .line 241
    .line 242
    invoke-virtual {v2, p0}, Lio/ktor/utils/io/m;->f(Ljf/c;)Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object p1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 246
    if-ne p1, v0, :cond_4

    .line 247
    .line 248
    goto :goto_8

    .line 249
    :cond_4
    :goto_6
    sget-object p1, Lef/C;->a:Lef/C;

    .line 250
    .line 251
    return-object p1

    .line 252
    :catchall_4
    move-exception p1

    .line 253
    iput-object v4, p0, Lio/ktor/utils/io/M;->c:Ljava/lang/Object;

    .line 254
    .line 255
    iput-object p1, p0, Lio/ktor/utils/io/M;->a:Ljava/lang/Object;

    .line 256
    .line 257
    const/4 v4, 0x6

    .line 258
    iput v4, p0, Lio/ktor/utils/io/M;->b:I

    .line 259
    .line 260
    check-cast v1, LEf/z0;

    .line 261
    .line 262
    invoke-virtual {v1, p0}, LEf/z0;->join(Ljf/c;)Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v1

    .line 266
    if-ne v1, v0, :cond_5

    .line 267
    .line 268
    goto :goto_8

    .line 269
    :cond_5
    :goto_7
    :try_start_9
    iput-object p1, p0, Lio/ktor/utils/io/M;->c:Ljava/lang/Object;

    .line 270
    .line 271
    iput-object v3, p0, Lio/ktor/utils/io/M;->a:Ljava/lang/Object;

    .line 272
    .line 273
    const/4 v1, 0x7

    .line 274
    iput v1, p0, Lio/ktor/utils/io/M;->b:I

    .line 275
    .line 276
    invoke-virtual {v2, p0}, Lio/ktor/utils/io/m;->f(Ljf/c;)Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-result-object v1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    .line 280
    if-ne v1, v0, :cond_6

    .line 281
    .line 282
    :goto_8
    return-object v0

    .line 283
    :cond_6
    move-object v0, p1

    .line 284
    goto :goto_a

    .line 285
    :catchall_5
    move-exception v0

    .line 286
    move-object v7, v0

    .line 287
    move-object v0, p1

    .line 288
    move-object p1, v7

    .line 289
    :goto_9
    invoke-static {p1}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    .line 290
    .line 291
    .line 292
    :goto_a
    throw v0

    .line 293
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
