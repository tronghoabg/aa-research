.class public final LCd/a0;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/q;


# instance fields
.field public a:Ltf/q;

.field public b:Ltf/q;

.field public c:Ltf/p;

.field public d:Ltf/p;

.field public e:Ljava/lang/Object;

.field public f:LFd/c;

.field public g:I

.field public h:I

.field public i:I

.field public synthetic j:LDd/h;

.field public synthetic k:LFd/c;

.field public final synthetic l:Ltf/q;

.field public final synthetic m:Ltf/q;

.field public final synthetic n:I

.field public final synthetic o:Ltf/p;

.field public final synthetic p:Ltf/p;

.field public final synthetic q:LDd/b;

.field public final synthetic r:LCd/X;


# direct methods
.method public constructor <init>(Ltf/q;Ltf/q;ILtf/p;Ltf/p;LDd/b;LCd/X;Ljf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LCd/a0;->l:Ltf/q;

    .line 2
    .line 3
    iput-object p2, p0, LCd/a0;->m:Ltf/q;

    .line 4
    .line 5
    iput p3, p0, LCd/a0;->n:I

    .line 6
    .line 7
    iput-object p4, p0, LCd/a0;->o:Ltf/p;

    .line 8
    .line 9
    iput-object p5, p0, LCd/a0;->p:Ltf/p;

    .line 10
    .line 11
    iput-object p6, p0, LCd/a0;->q:LDd/b;

    .line 12
    .line 13
    iput-object p7, p0, LCd/a0;->r:LCd/X;

    .line 14
    .line 15
    const/4 p1, 0x3

    .line 16
    invoke-direct {p0, p1, p8}, Llf/j;-><init>(ILjf/c;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    check-cast p1, LDd/h;

    .line 2
    .line 3
    check-cast p2, LFd/c;

    .line 4
    .line 5
    move-object v8, p3

    .line 6
    check-cast v8, Ljf/c;

    .line 7
    .line 8
    new-instance v0, LCd/a0;

    .line 9
    .line 10
    iget-object v4, p0, LCd/a0;->o:Ltf/p;

    .line 11
    .line 12
    iget-object v1, p0, LCd/a0;->l:Ltf/q;

    .line 13
    .line 14
    iget-object v2, p0, LCd/a0;->m:Ltf/q;

    .line 15
    .line 16
    iget-object v6, p0, LCd/a0;->q:LDd/b;

    .line 17
    .line 18
    iget-object v7, p0, LCd/a0;->r:LCd/X;

    .line 19
    .line 20
    iget v3, p0, LCd/a0;->n:I

    .line 21
    .line 22
    iget-object v5, p0, LCd/a0;->p:Ltf/p;

    .line 23
    .line 24
    invoke-direct/range {v0 .. v8}, LCd/a0;-><init>(Ltf/q;Ltf/q;ILtf/p;Ltf/p;LDd/b;LCd/X;Ljf/c;)V

    .line 25
    .line 26
    .line 27
    iput-object p1, v0, LCd/a0;->j:LDd/h;

    .line 28
    .line 29
    iput-object p2, v0, LCd/a0;->k:LFd/c;

    .line 30
    .line 31
    sget-object p1, Lef/C;->a:Lef/C;

    .line 32
    .line 33
    invoke-virtual {v0, p1}, LCd/a0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const/4 v2, 0x1

    .line 4
    sget-object v3, Lkf/a;->a:Lkf/a;

    .line 5
    .line 6
    iget v0, v1, LCd/a0;->i:I

    .line 7
    .line 8
    const/4 v4, 0x3

    .line 9
    const/4 v5, 0x2

    .line 10
    if-eqz v0, :cond_3

    .line 11
    .line 12
    if-eq v0, v2, :cond_2

    .line 13
    .line 14
    if-eq v0, v5, :cond_1

    .line 15
    .line 16
    if-ne v0, v4, :cond_0

    .line 17
    .line 18
    iget v0, v1, LCd/a0;->h:I

    .line 19
    .line 20
    iget v7, v1, LCd/a0;->g:I

    .line 21
    .line 22
    iget-object v8, v1, LCd/a0;->e:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v8, LCd/e0;

    .line 25
    .line 26
    iget-object v9, v1, LCd/a0;->d:Ltf/p;

    .line 27
    .line 28
    iget-object v10, v1, LCd/a0;->c:Ltf/p;

    .line 29
    .line 30
    iget-object v11, v1, LCd/a0;->b:Ltf/q;

    .line 31
    .line 32
    iget-object v12, v1, LCd/a0;->a:Ltf/q;

    .line 33
    .line 34
    iget-object v13, v1, LCd/a0;->k:LFd/c;

    .line 35
    .line 36
    iget-object v14, v1, LCd/a0;->j:LDd/h;

    .line 37
    .line 38
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    move v5, v7

    .line 42
    move v7, v0

    .line 43
    move-object v0, v8

    .line 44
    move v8, v5

    .line 45
    move/from16 v16, v2

    .line 46
    .line 47
    const/4 v5, 0x0

    .line 48
    :goto_0
    move-object v15, v14

    .line 49
    move-object v14, v13

    .line 50
    move-object v13, v12

    .line 51
    move-object v12, v11

    .line 52
    move-object v11, v10

    .line 53
    move-object v10, v9

    .line 54
    goto/16 :goto_9

    .line 55
    .line 56
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 57
    .line 58
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 59
    .line 60
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    throw v0

    .line 64
    :cond_1
    iget v7, v1, LCd/a0;->h:I

    .line 65
    .line 66
    iget v8, v1, LCd/a0;->g:I

    .line 67
    .line 68
    iget-object v9, v1, LCd/a0;->f:LFd/c;

    .line 69
    .line 70
    iget-object v0, v1, LCd/a0;->e:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v0, Lxd/c;

    .line 73
    .line 74
    iget-object v10, v1, LCd/a0;->d:Ltf/p;

    .line 75
    .line 76
    iget-object v11, v1, LCd/a0;->c:Ltf/p;

    .line 77
    .line 78
    iget-object v12, v1, LCd/a0;->b:Ltf/q;

    .line 79
    .line 80
    iget-object v13, v1, LCd/a0;->a:Ltf/q;

    .line 81
    .line 82
    iget-object v14, v1, LCd/a0;->k:LFd/c;

    .line 83
    .line 84
    iget-object v15, v1, LCd/a0;->j:LDd/h;

    .line 85
    .line 86
    :try_start_0
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 87
    .line 88
    .line 89
    return-object v0

    .line 90
    :catchall_0
    move-exception v0

    .line 91
    goto/16 :goto_6

    .line 92
    .line 93
    :cond_2
    iget v7, v1, LCd/a0;->h:I

    .line 94
    .line 95
    iget v8, v1, LCd/a0;->g:I

    .line 96
    .line 97
    iget-object v0, v1, LCd/a0;->e:Ljava/lang/Object;

    .line 98
    .line 99
    move-object v9, v0

    .line 100
    check-cast v9, LFd/c;

    .line 101
    .line 102
    iget-object v10, v1, LCd/a0;->d:Ltf/p;

    .line 103
    .line 104
    iget-object v11, v1, LCd/a0;->c:Ltf/p;

    .line 105
    .line 106
    iget-object v12, v1, LCd/a0;->b:Ltf/q;

    .line 107
    .line 108
    iget-object v13, v1, LCd/a0;->a:Ltf/q;

    .line 109
    .line 110
    iget-object v14, v1, LCd/a0;->k:LFd/c;

    .line 111
    .line 112
    iget-object v15, v1, LCd/a0;->j:LDd/h;

    .line 113
    .line 114
    :try_start_1
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 115
    .line 116
    .line 117
    move-object/from16 v0, p1

    .line 118
    .line 119
    goto/16 :goto_3

    .line 120
    .line 121
    :cond_3
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    iget-object v0, v1, LCd/a0;->j:LDd/h;

    .line 125
    .line 126
    iget-object v7, v1, LCd/a0;->k:LFd/c;

    .line 127
    .line 128
    iget-object v8, v7, LFd/c;->f:LNd/d;

    .line 129
    .line 130
    sget-object v9, LCd/b0;->e:LNd/a;

    .line 131
    .line 132
    invoke-virtual {v8, v9}, LNd/d;->d(LNd/a;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v8

    .line 136
    check-cast v8, Ltf/q;

    .line 137
    .line 138
    if-nez v8, :cond_4

    .line 139
    .line 140
    iget-object v8, v1, LCd/a0;->l:Ltf/q;

    .line 141
    .line 142
    :cond_4
    sget-object v9, LCd/b0;->f:LNd/a;

    .line 143
    .line 144
    iget-object v10, v7, LFd/c;->f:LNd/d;

    .line 145
    .line 146
    invoke-virtual {v10, v9}, LNd/d;->d(LNd/a;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v9

    .line 150
    check-cast v9, Ltf/q;

    .line 151
    .line 152
    if-nez v9, :cond_5

    .line 153
    .line 154
    iget-object v9, v1, LCd/a0;->m:Ltf/q;

    .line 155
    .line 156
    :cond_5
    sget-object v11, LCd/b0;->d:LNd/a;

    .line 157
    .line 158
    invoke-virtual {v10, v11}, LNd/d;->d(LNd/a;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v11

    .line 162
    check-cast v11, Ljava/lang/Integer;

    .line 163
    .line 164
    if-eqz v11, :cond_6

    .line 165
    .line 166
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    .line 167
    .line 168
    .line 169
    move-result v11

    .line 170
    goto :goto_1

    .line 171
    :cond_6
    iget v11, v1, LCd/a0;->n:I

    .line 172
    .line 173
    :goto_1
    sget-object v12, LCd/b0;->h:LNd/a;

    .line 174
    .line 175
    invoke-virtual {v10, v12}, LNd/d;->d(LNd/a;)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v12

    .line 179
    check-cast v12, Ltf/p;

    .line 180
    .line 181
    if-nez v12, :cond_7

    .line 182
    .line 183
    iget-object v12, v1, LCd/a0;->o:Ltf/p;

    .line 184
    .line 185
    :cond_7
    sget-object v13, LCd/b0;->g:LNd/a;

    .line 186
    .line 187
    invoke-virtual {v10, v13}, LNd/d;->d(LNd/a;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v10

    .line 191
    check-cast v10, Ltf/p;

    .line 192
    .line 193
    if-nez v10, :cond_8

    .line 194
    .line 195
    iget-object v10, v1, LCd/a0;->p:Ltf/p;

    .line 196
    .line 197
    :cond_8
    const/4 v13, 0x0

    .line 198
    move v14, v13

    .line 199
    move-object v13, v8

    .line 200
    move v8, v14

    .line 201
    move-object v15, v0

    .line 202
    move-object v14, v7

    .line 203
    move v7, v11

    .line 204
    move-object v11, v12

    .line 205
    const/4 v0, 0x0

    .line 206
    move-object v12, v9

    .line 207
    :goto_2
    sget-object v9, LCd/b0;->a:Lvg/b;

    .line 208
    .line 209
    new-instance v9, LFd/c;

    .line 210
    .line 211
    invoke-direct {v9}, LFd/c;-><init>()V

    .line 212
    .line 213
    .line 214
    invoke-virtual {v9, v14}, LFd/c;->d(LFd/c;)V

    .line 215
    .line 216
    .line 217
    iget-object v4, v14, LFd/c;->e:LEf/I0;

    .line 218
    .line 219
    new-instance v5, LAf/r;

    .line 220
    .line 221
    const/4 v6, 0x5

    .line 222
    invoke-direct {v5, v9, v6}, LAf/r;-><init>(Ljava/lang/Object;I)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v4, v5}, LEf/z0;->invokeOnCompletion(Ltf/l;)LEf/U;

    .line 226
    .line 227
    .line 228
    if-eqz v0, :cond_9

    .line 229
    .line 230
    :try_start_2
    new-instance v4, LCd/f0;

    .line 231
    .line 232
    iget v0, v0, LCd/e0;->b:I

    .line 233
    .line 234
    invoke-direct {v4, v14, v0}, LCd/f0;-><init>(LFd/c;I)V

    .line 235
    .line 236
    .line 237
    invoke-interface {v10, v4, v9}, Ltf/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    :cond_9
    iput-object v15, v1, LCd/a0;->j:LDd/h;

    .line 241
    .line 242
    iput-object v14, v1, LCd/a0;->k:LFd/c;

    .line 243
    .line 244
    iput-object v13, v1, LCd/a0;->a:Ltf/q;

    .line 245
    .line 246
    iput-object v12, v1, LCd/a0;->b:Ltf/q;

    .line 247
    .line 248
    iput-object v11, v1, LCd/a0;->c:Ltf/p;

    .line 249
    .line 250
    iput-object v10, v1, LCd/a0;->d:Ltf/p;

    .line 251
    .line 252
    iput-object v9, v1, LCd/a0;->e:Ljava/lang/Object;

    .line 253
    .line 254
    iput v8, v1, LCd/a0;->g:I

    .line 255
    .line 256
    iput v7, v1, LCd/a0;->h:I

    .line 257
    .line 258
    iput v2, v1, LCd/a0;->i:I

    .line 259
    .line 260
    iget-object v0, v15, LDd/h;->a:LCd/u0;

    .line 261
    .line 262
    invoke-interface {v0, v9, v1}, LCd/u0;->a(LFd/c;Llf/c;)Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    if-ne v0, v3, :cond_a

    .line 267
    .line 268
    goto/16 :goto_8

    .line 269
    .line 270
    :cond_a
    :goto_3
    check-cast v0, Lxd/c;

    .line 271
    .line 272
    sget-object v4, LCd/b0;->a:Lvg/b;

    .line 273
    .line 274
    if-ge v8, v7, :cond_b

    .line 275
    .line 276
    new-instance v4, LCd/g0;

    .line 277
    .line 278
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 279
    .line 280
    .line 281
    invoke-virtual {v0}, Lxd/c;->d()LFd/b;

    .line 282
    .line 283
    .line 284
    move-result-object v5

    .line 285
    invoke-virtual {v0}, Lxd/c;->e()LGd/a;

    .line 286
    .line 287
    .line 288
    move-result-object v6

    .line 289
    invoke-interface {v13, v4, v5, v6}, Ltf/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object v4

    .line 293
    check-cast v4, Ljava/lang/Boolean;

    .line 294
    .line 295
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 296
    .line 297
    .line 298
    move-result v4

    .line 299
    if-eqz v4, :cond_b

    .line 300
    .line 301
    new-instance v4, LCd/e0;

    .line 302
    .line 303
    add-int/2addr v8, v2

    .line 304
    invoke-virtual {v0}, Lxd/c;->e()LGd/a;

    .line 305
    .line 306
    .line 307
    move-result-object v0

    .line 308
    const/4 v5, 0x0

    .line 309
    invoke-direct {v4, v9, v8, v0, v5}, LCd/e0;-><init>(LFd/c;ILGd/a;Ljava/lang/Throwable;)V

    .line 310
    .line 311
    .line 312
    move/from16 v16, v2

    .line 313
    .line 314
    move v0, v7

    .line 315
    move v7, v8

    .line 316
    move-object v8, v4

    .line 317
    :goto_4
    move-object v9, v10

    .line 318
    move-object v10, v11

    .line 319
    move-object v11, v12

    .line 320
    move-object v12, v13

    .line 321
    move-object v13, v14

    .line 322
    move-object v14, v15

    .line 323
    goto :goto_7

    .line 324
    :cond_b
    invoke-virtual {v0}, Lxd/c;->e()LGd/a;

    .line 325
    .line 326
    .line 327
    move-result-object v4

    .line 328
    iput-object v15, v1, LCd/a0;->j:LDd/h;

    .line 329
    .line 330
    iput-object v14, v1, LCd/a0;->k:LFd/c;

    .line 331
    .line 332
    iput-object v13, v1, LCd/a0;->a:Ltf/q;

    .line 333
    .line 334
    iput-object v12, v1, LCd/a0;->b:Ltf/q;

    .line 335
    .line 336
    iput-object v11, v1, LCd/a0;->c:Ltf/p;

    .line 337
    .line 338
    iput-object v10, v1, LCd/a0;->d:Ltf/p;

    .line 339
    .line 340
    iput-object v0, v1, LCd/a0;->e:Ljava/lang/Object;

    .line 341
    .line 342
    iput-object v9, v1, LCd/a0;->f:LFd/c;

    .line 343
    .line 344
    iput v8, v1, LCd/a0;->g:I

    .line 345
    .line 346
    iput v7, v1, LCd/a0;->h:I

    .line 347
    .line 348
    const/4 v5, 0x2

    .line 349
    iput v5, v1, LCd/a0;->i:I

    .line 350
    .line 351
    sget-object v6, LCd/w;->a:LNd/a;

    .line 352
    .line 353
    invoke-virtual {v4}, LGd/a;->c()Lxd/c;

    .line 354
    .line 355
    .line 356
    move-result-object v6

    .line 357
    invoke-virtual {v6}, Lxd/c;->b()LNd/d;

    .line 358
    .line 359
    .line 360
    move-result-object v6

    .line 361
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 362
    .line 363
    .line 364
    const-string v5, "key"

    .line 365
    .line 366
    sget-object v2, LCd/w;->b:LNd/a;

    .line 367
    .line 368
    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 369
    .line 370
    .line 371
    invoke-virtual {v6}, LNd/d;->c()Ljava/util/Map;

    .line 372
    .line 373
    .line 374
    move-result-object v5

    .line 375
    invoke-interface {v5, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 376
    .line 377
    .line 378
    move-result v2

    .line 379
    if-eqz v2, :cond_c

    .line 380
    .line 381
    invoke-virtual {v4}, LGd/a;->d()Lio/ktor/utils/io/t;

    .line 382
    .line 383
    .line 384
    move-result-object v2

    .line 385
    const/4 v4, 0x1

    .line 386
    invoke-interface {v2, v4, v1}, Lio/ktor/utils/io/t;->g(ILlf/c;)Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    move-result-object v2

    .line 390
    goto :goto_5

    .line 391
    :cond_c
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 392
    .line 393
    :goto_5
    if-ne v2, v3, :cond_d

    .line 394
    .line 395
    goto :goto_8

    .line 396
    :cond_d
    return-object v0

    .line 397
    :goto_6
    sget-object v2, LCd/b0;->a:Lvg/b;

    .line 398
    .line 399
    if-ge v8, v7, :cond_f

    .line 400
    .line 401
    new-instance v2, LCd/g0;

    .line 402
    .line 403
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 404
    .line 405
    .line 406
    invoke-interface {v12, v2, v9, v0}, Ltf/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 407
    .line 408
    .line 409
    move-result-object v2

    .line 410
    check-cast v2, Ljava/lang/Boolean;

    .line 411
    .line 412
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 413
    .line 414
    .line 415
    move-result v2

    .line 416
    if-eqz v2, :cond_f

    .line 417
    .line 418
    new-instance v2, LCd/e0;

    .line 419
    .line 420
    const/16 v16, 0x1

    .line 421
    .line 422
    add-int/lit8 v8, v8, 0x1

    .line 423
    .line 424
    const/4 v5, 0x0

    .line 425
    invoke-direct {v2, v9, v8, v5, v0}, LCd/e0;-><init>(LFd/c;ILGd/a;Ljava/lang/Throwable;)V

    .line 426
    .line 427
    .line 428
    move v0, v7

    .line 429
    move v7, v8

    .line 430
    move-object v8, v2

    .line 431
    goto :goto_4

    .line 432
    :goto_7
    iget-object v2, v1, LCd/a0;->q:LDd/b;

    .line 433
    .line 434
    iget-object v2, v2, LDd/b;->a:Lwd/c;

    .line 435
    .line 436
    iget-object v2, v2, Lwd/c;->j:Ly3/j;

    .line 437
    .line 438
    sget-object v4, LCd/b0;->b:Lwa/a;

    .line 439
    .line 440
    invoke-virtual {v2, v4}, Ly3/j;->q(Lwa/a;)V

    .line 441
    .line 442
    .line 443
    new-instance v2, LCd/d0;

    .line 444
    .line 445
    iget-object v4, v8, LCd/e0;->a:LFd/c;

    .line 446
    .line 447
    iget-object v5, v8, LCd/e0;->c:LGd/a;

    .line 448
    .line 449
    invoke-direct {v2, v4, v5}, LCd/d0;-><init>(LFd/c;LGd/a;)V

    .line 450
    .line 451
    .line 452
    new-instance v4, Ljava/lang/Integer;

    .line 453
    .line 454
    invoke-direct {v4, v7}, Ljava/lang/Integer;-><init>(I)V

    .line 455
    .line 456
    .line 457
    invoke-interface {v10, v2, v4}, Ltf/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 458
    .line 459
    .line 460
    move-result-object v2

    .line 461
    iput-object v14, v1, LCd/a0;->j:LDd/h;

    .line 462
    .line 463
    iput-object v13, v1, LCd/a0;->k:LFd/c;

    .line 464
    .line 465
    iput-object v12, v1, LCd/a0;->a:Ltf/q;

    .line 466
    .line 467
    iput-object v11, v1, LCd/a0;->b:Ltf/q;

    .line 468
    .line 469
    iput-object v10, v1, LCd/a0;->c:Ltf/p;

    .line 470
    .line 471
    iput-object v9, v1, LCd/a0;->d:Ltf/p;

    .line 472
    .line 473
    iput-object v8, v1, LCd/a0;->e:Ljava/lang/Object;

    .line 474
    .line 475
    const/4 v5, 0x0

    .line 476
    iput-object v5, v1, LCd/a0;->f:LFd/c;

    .line 477
    .line 478
    iput v7, v1, LCd/a0;->g:I

    .line 479
    .line 480
    iput v0, v1, LCd/a0;->h:I

    .line 481
    .line 482
    const/4 v4, 0x3

    .line 483
    iput v4, v1, LCd/a0;->i:I

    .line 484
    .line 485
    iget-object v6, v1, LCd/a0;->r:LCd/X;

    .line 486
    .line 487
    invoke-virtual {v6, v2, v1}, LCd/X;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 488
    .line 489
    .line 490
    move-result-object v2

    .line 491
    if-ne v2, v3, :cond_e

    .line 492
    .line 493
    :goto_8
    return-object v3

    .line 494
    :cond_e
    move v15, v7

    .line 495
    move v7, v0

    .line 496
    move-object v0, v8

    .line 497
    move v8, v15

    .line 498
    goto/16 :goto_0

    .line 499
    .line 500
    :goto_9
    sget-object v2, LCd/b0;->a:Lvg/b;

    .line 501
    .line 502
    new-instance v6, Ljava/lang/StringBuilder;

    .line 503
    .line 504
    const-string v9, "Retrying request "

    .line 505
    .line 506
    invoke-direct {v6, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 507
    .line 508
    .line 509
    iget-object v9, v14, LFd/c;->a:LJd/B;

    .line 510
    .line 511
    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 512
    .line 513
    .line 514
    const-string v9, " attempt: "

    .line 515
    .line 516
    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 517
    .line 518
    .line 519
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 520
    .line 521
    .line 522
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 523
    .line 524
    .line 525
    move-result-object v6

    .line 526
    invoke-interface {v2, v6}, Lvg/b;->s(Ljava/lang/String;)V

    .line 527
    .line 528
    .line 529
    move/from16 v2, v16

    .line 530
    .line 531
    const/4 v5, 0x2

    .line 532
    goto/16 :goto_2

    .line 533
    .line 534
    :cond_f
    throw v0
.end method
