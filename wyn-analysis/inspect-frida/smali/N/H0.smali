.class public final LN/H0;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public a:Lx/r;

.field public b:Ltf/l;

.field public c:LGf/i;

.field public d:LS8/b;

.field public e:Ljava/lang/Object;

.field public f:I

.field public synthetic g:Ljava/lang/Object;

.field public final synthetic h:Ltf/a;


# direct methods
.method public constructor <init>(Ltf/a;Ljf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LN/H0;->h:Ltf/a;

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
    new-instance v0, LN/H0;

    .line 2
    .line 3
    iget-object v1, p0, LN/H0;->h:Ltf/a;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, LN/H0;-><init>(Ltf/a;Ljf/c;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, LN/H0;->g:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, LN/H0;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LN/H0;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LN/H0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    sget-object p1, Lkf/a;->a:Lkf/a;

    .line 17
    .line 18
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v2, 0x2

    .line 5
    const/4 v3, 0x3

    .line 6
    const/4 v4, 0x1

    .line 7
    sget-object v5, Lkf/a;->a:Lkf/a;

    .line 8
    .line 9
    iget v6, v1, LN/H0;->f:I

    .line 10
    .line 11
    if-eqz v6, :cond_3

    .line 12
    .line 13
    if-eq v6, v4, :cond_2

    .line 14
    .line 15
    if-eq v6, v2, :cond_1

    .line 16
    .line 17
    if-ne v6, v3, :cond_0

    .line 18
    .line 19
    iget-object v6, v1, LN/H0;->e:Ljava/lang/Object;

    .line 20
    .line 21
    iget-object v7, v1, LN/H0;->d:LS8/b;

    .line 22
    .line 23
    iget-object v8, v1, LN/H0;->c:LGf/i;

    .line 24
    .line 25
    iget-object v9, v1, LN/H0;->b:Ltf/l;

    .line 26
    .line 27
    iget-object v10, v1, LN/H0;->a:Lx/r;

    .line 28
    .line 29
    iget-object v11, v1, LN/H0;->g:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v11, LHf/m;

    .line 32
    .line 33
    :try_start_0
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    .line 35
    .line 36
    move v2, v3

    .line 37
    move/from16 v16, v4

    .line 38
    .line 39
    move-object v4, v5

    .line 40
    goto/16 :goto_9

    .line 41
    .line 42
    :catchall_0
    move-exception v0

    .line 43
    goto/16 :goto_a

    .line 44
    .line 45
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 46
    .line 47
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw v0

    .line 53
    :cond_1
    iget-object v6, v1, LN/H0;->e:Ljava/lang/Object;

    .line 54
    .line 55
    iget-object v7, v1, LN/H0;->d:LS8/b;

    .line 56
    .line 57
    iget-object v8, v1, LN/H0;->c:LGf/i;

    .line 58
    .line 59
    iget-object v9, v1, LN/H0;->b:Ltf/l;

    .line 60
    .line 61
    iget-object v10, v1, LN/H0;->a:Lx/r;

    .line 62
    .line 63
    iget-object v11, v1, LN/H0;->g:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v11, LHf/m;

    .line 66
    .line 67
    :try_start_1
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 68
    .line 69
    .line 70
    move-object/from16 v12, p1

    .line 71
    .line 72
    goto/16 :goto_2

    .line 73
    .line 74
    :cond_2
    iget-object v6, v1, LN/H0;->e:Ljava/lang/Object;

    .line 75
    .line 76
    iget-object v7, v1, LN/H0;->d:LS8/b;

    .line 77
    .line 78
    iget-object v8, v1, LN/H0;->c:LGf/i;

    .line 79
    .line 80
    iget-object v9, v1, LN/H0;->b:Ltf/l;

    .line 81
    .line 82
    iget-object v10, v1, LN/H0;->a:Lx/r;

    .line 83
    .line 84
    iget-object v11, v1, LN/H0;->g:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v11, LHf/m;

    .line 87
    .line 88
    :try_start_2
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 89
    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_3
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    iget-object v6, v1, LN/H0;->g:Ljava/lang/Object;

    .line 96
    .line 97
    move-object v11, v6

    .line 98
    check-cast v11, LHf/m;

    .line 99
    .line 100
    new-instance v10, Lx/r;

    .line 101
    .line 102
    invoke-direct {v10}, Lx/r;-><init>()V

    .line 103
    .line 104
    .line 105
    new-instance v9, LN/G0;

    .line 106
    .line 107
    invoke-direct {v9, v10, v0}, LN/G0;-><init>(Lx/r;I)V

    .line 108
    .line 109
    .line 110
    const v6, 0x7fffffff

    .line 111
    .line 112
    .line 113
    const/4 v7, 0x6

    .line 114
    const/4 v8, 0x0

    .line 115
    invoke-static {v6, v7, v8}, Lic/d;->a(IILGf/a;)LGf/e;

    .line 116
    .line 117
    .line 118
    move-result-object v8

    .line 119
    new-instance v6, LE/k;

    .line 120
    .line 121
    invoke-direct {v6, v8, v2}, LE/k;-><init>(Ljava/lang/Object;I)V

    .line 122
    .line 123
    .line 124
    sget-object v7, LX/m;->a:LDd/c;

    .line 125
    .line 126
    sget-object v7, LX/l;->k:LX/l;

    .line 127
    .line 128
    invoke-static {v7}, LX/m;->f(Ltf/l;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    sget-object v7, LX/m;->b:Ljava/lang/Object;

    .line 132
    .line 133
    monitor-enter v7

    .line 134
    :try_start_3
    sget-object v12, LX/m;->g:Ljava/lang/Object;

    .line 135
    .line 136
    check-cast v12, Ljava/util/Collection;

    .line 137
    .line 138
    invoke-static {v12, v6}, Lff/o;->F0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 139
    .line 140
    .line 141
    move-result-object v12

    .line 142
    sput-object v12, LX/m;->g:Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_5

    .line 143
    .line 144
    monitor-exit v7

    .line 145
    new-instance v7, LS8/b;

    .line 146
    .line 147
    invoke-direct {v7, v6}, LS8/b;-><init>(Ltf/p;)V

    .line 148
    .line 149
    .line 150
    :try_start_4
    invoke-static {}, LX/m;->k()LX/g;

    .line 151
    .line 152
    .line 153
    move-result-object v6

    .line 154
    invoke-virtual {v6, v9}, LX/g;->t(Ltf/l;)LX/g;

    .line 155
    .line 156
    .line 157
    move-result-object v6

    .line 158
    iget-object v12, v1, LN/H0;->h:Ltf/a;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 159
    .line 160
    :try_start_5
    invoke-virtual {v6}, LX/g;->j()LX/g;

    .line 161
    .line 162
    .line 163
    move-result-object v13
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 164
    :try_start_6
    invoke-interface {v12}, Ltf/a;->invoke()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v12
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 168
    :try_start_7
    invoke-static {v13}, LX/g;->p(LX/g;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 169
    .line 170
    .line 171
    :try_start_8
    invoke-virtual {v6}, LX/g;->c()V

    .line 172
    .line 173
    .line 174
    iput-object v11, v1, LN/H0;->g:Ljava/lang/Object;

    .line 175
    .line 176
    iput-object v10, v1, LN/H0;->a:Lx/r;

    .line 177
    .line 178
    iput-object v9, v1, LN/H0;->b:Ltf/l;

    .line 179
    .line 180
    iput-object v8, v1, LN/H0;->c:LGf/i;

    .line 181
    .line 182
    iput-object v7, v1, LN/H0;->d:LS8/b;

    .line 183
    .line 184
    iput-object v12, v1, LN/H0;->e:Ljava/lang/Object;

    .line 185
    .line 186
    iput v4, v1, LN/H0;->f:I

    .line 187
    .line 188
    invoke-interface {v11, v12, v1}, LHf/m;->emit(Ljava/lang/Object;Ljf/c;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v6

    .line 192
    if-ne v6, v5, :cond_4

    .line 193
    .line 194
    :goto_0
    move-object v4, v5

    .line 195
    goto/16 :goto_8

    .line 196
    .line 197
    :cond_4
    move-object v6, v12

    .line 198
    :goto_1
    iput-object v11, v1, LN/H0;->g:Ljava/lang/Object;

    .line 199
    .line 200
    iput-object v10, v1, LN/H0;->a:Lx/r;

    .line 201
    .line 202
    iput-object v9, v1, LN/H0;->b:Ltf/l;

    .line 203
    .line 204
    iput-object v8, v1, LN/H0;->c:LGf/i;

    .line 205
    .line 206
    iput-object v7, v1, LN/H0;->d:LS8/b;

    .line 207
    .line 208
    iput-object v6, v1, LN/H0;->e:Ljava/lang/Object;

    .line 209
    .line 210
    iput v2, v1, LN/H0;->f:I

    .line 211
    .line 212
    invoke-interface {v8, v1}, LGf/v;->j(Ljf/c;)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v12

    .line 216
    if-ne v12, v5, :cond_5

    .line 217
    .line 218
    goto :goto_0

    .line 219
    :cond_5
    :goto_2
    check-cast v12, Ljava/util/Set;

    .line 220
    .line 221
    move v13, v0

    .line 222
    :goto_3
    if-nez v13, :cond_c

    .line 223
    .line 224
    iget-object v13, v10, Lx/r;->b:[Ljava/lang/Object;

    .line 225
    .line 226
    iget-object v14, v10, Lx/r;->a:[J

    .line 227
    .line 228
    array-length v15, v14

    .line 229
    sub-int/2addr v15, v2

    .line 230
    if-ltz v15, :cond_a

    .line 231
    .line 232
    move/from16 v16, v4

    .line 233
    .line 234
    move-object/from16 v17, v5

    .line 235
    .line 236
    :goto_4
    aget-wide v4, v14, v0

    .line 237
    .line 238
    move/from16 v18, v3

    .line 239
    .line 240
    not-long v2, v4

    .line 241
    const/16 v19, 0x7

    .line 242
    .line 243
    shl-long v2, v2, v19

    .line 244
    .line 245
    and-long/2addr v2, v4

    .line 246
    const-wide v19, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    and-long v2, v2, v19

    .line 252
    .line 253
    cmp-long v2, v2, v19

    .line 254
    .line 255
    if-eqz v2, :cond_9

    .line 256
    .line 257
    sub-int v2, v0, v15

    .line 258
    .line 259
    not-int v2, v2

    .line 260
    ushr-int/lit8 v2, v2, 0x1f

    .line 261
    .line 262
    const/16 v3, 0x8

    .line 263
    .line 264
    rsub-int/lit8 v2, v2, 0x8

    .line 265
    .line 266
    move/from16 p1, v3

    .line 267
    .line 268
    const/4 v3, 0x0

    .line 269
    :goto_5
    if-ge v3, v2, :cond_8

    .line 270
    .line 271
    const-wide/16 v19, 0xff

    .line 272
    .line 273
    and-long v19, v4, v19

    .line 274
    .line 275
    const-wide/16 v21, 0x80

    .line 276
    .line 277
    cmp-long v19, v19, v21

    .line 278
    .line 279
    if-gez v19, :cond_6

    .line 280
    .line 281
    shl-int/lit8 v19, v0, 0x3

    .line 282
    .line 283
    add-int v19, v19, v3

    .line 284
    .line 285
    move/from16 v20, v3

    .line 286
    .line 287
    aget-object v3, v13, v19

    .line 288
    .line 289
    invoke-interface {v12, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 290
    .line 291
    .line 292
    move-result v3

    .line 293
    if-eqz v3, :cond_7

    .line 294
    .line 295
    goto :goto_6

    .line 296
    :cond_6
    move/from16 v20, v3

    .line 297
    .line 298
    :cond_7
    shr-long v4, v4, p1

    .line 299
    .line 300
    add-int/lit8 v3, v20, 0x1

    .line 301
    .line 302
    goto :goto_5

    .line 303
    :cond_8
    move/from16 v3, p1

    .line 304
    .line 305
    if-ne v2, v3, :cond_b

    .line 306
    .line 307
    :cond_9
    if-eq v0, v15, :cond_b

    .line 308
    .line 309
    add-int/lit8 v0, v0, 0x1

    .line 310
    .line 311
    move/from16 v3, v18

    .line 312
    .line 313
    const/4 v2, 0x2

    .line 314
    goto :goto_4

    .line 315
    :cond_a
    move/from16 v18, v3

    .line 316
    .line 317
    move/from16 v16, v4

    .line 318
    .line 319
    move-object/from16 v17, v5

    .line 320
    .line 321
    :cond_b
    const/4 v13, 0x0

    .line 322
    goto :goto_7

    .line 323
    :cond_c
    move/from16 v18, v3

    .line 324
    .line 325
    move/from16 v16, v4

    .line 326
    .line 327
    move-object/from16 v17, v5

    .line 328
    .line 329
    :goto_6
    move/from16 v13, v16

    .line 330
    .line 331
    :goto_7
    invoke-interface {v8}, LGf/v;->f()Ljava/lang/Object;

    .line 332
    .line 333
    .line 334
    move-result-object v0

    .line 335
    invoke-static {v0}, LGf/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    move-result-object v0

    .line 339
    move-object v12, v0

    .line 340
    check-cast v12, Ljava/util/Set;

    .line 341
    .line 342
    if-nez v12, :cond_f

    .line 343
    .line 344
    if-eqz v13, :cond_e

    .line 345
    .line 346
    invoke-virtual {v10}, Lx/r;->b()V

    .line 347
    .line 348
    .line 349
    invoke-static {}, LX/m;->k()LX/g;

    .line 350
    .line 351
    .line 352
    move-result-object v0

    .line 353
    invoke-virtual {v0, v9}, LX/g;->t(Ltf/l;)LX/g;

    .line 354
    .line 355
    .line 356
    move-result-object v2

    .line 357
    iget-object v0, v1, LN/H0;->h:Ltf/a;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 358
    .line 359
    :try_start_9
    invoke-virtual {v2}, LX/g;->j()LX/g;

    .line 360
    .line 361
    .line 362
    move-result-object v3
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 363
    :try_start_a
    invoke-interface {v0}, Ltf/a;->invoke()Ljava/lang/Object;

    .line 364
    .line 365
    .line 366
    move-result-object v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    .line 367
    :try_start_b
    invoke-static {v3}, LX/g;->p(LX/g;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    .line 368
    .line 369
    .line 370
    :try_start_c
    invoke-virtual {v2}, LX/g;->c()V

    .line 371
    .line 372
    .line 373
    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 374
    .line 375
    .line 376
    move-result v2

    .line 377
    if-nez v2, :cond_e

    .line 378
    .line 379
    iput-object v11, v1, LN/H0;->g:Ljava/lang/Object;

    .line 380
    .line 381
    iput-object v10, v1, LN/H0;->a:Lx/r;

    .line 382
    .line 383
    iput-object v9, v1, LN/H0;->b:Ltf/l;

    .line 384
    .line 385
    iput-object v8, v1, LN/H0;->c:LGf/i;

    .line 386
    .line 387
    iput-object v7, v1, LN/H0;->d:LS8/b;

    .line 388
    .line 389
    iput-object v0, v1, LN/H0;->e:Ljava/lang/Object;

    .line 390
    .line 391
    move/from16 v2, v18

    .line 392
    .line 393
    iput v2, v1, LN/H0;->f:I

    .line 394
    .line 395
    invoke-interface {v11, v0, v1}, LHf/m;->emit(Ljava/lang/Object;Ljf/c;)Ljava/lang/Object;

    .line 396
    .line 397
    .line 398
    move-result-object v3
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    .line 399
    move-object/from16 v4, v17

    .line 400
    .line 401
    if-ne v3, v4, :cond_d

    .line 402
    .line 403
    :goto_8
    return-object v4

    .line 404
    :cond_d
    move-object v6, v0

    .line 405
    :goto_9
    move v3, v2

    .line 406
    move-object v5, v4

    .line 407
    move/from16 v4, v16

    .line 408
    .line 409
    const/4 v0, 0x0

    .line 410
    const/4 v2, 0x2

    .line 411
    goto/16 :goto_1

    .line 412
    .line 413
    :cond_e
    move-object/from16 v4, v17

    .line 414
    .line 415
    move/from16 v2, v18

    .line 416
    .line 417
    goto :goto_9

    .line 418
    :catchall_1
    move-exception v0

    .line 419
    :try_start_d
    invoke-static {v3}, LX/g;->p(LX/g;)V

    .line 420
    .line 421
    .line 422
    throw v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_2

    .line 423
    :catchall_2
    move-exception v0

    .line 424
    :try_start_e
    invoke-virtual {v2}, LX/g;->c()V

    .line 425
    .line 426
    .line 427
    throw v0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_0

    .line 428
    :cond_f
    move/from16 v4, v16

    .line 429
    .line 430
    move-object/from16 v5, v17

    .line 431
    .line 432
    move/from16 v3, v18

    .line 433
    .line 434
    const/4 v0, 0x0

    .line 435
    const/4 v2, 0x2

    .line 436
    goto/16 :goto_3

    .line 437
    .line 438
    :catchall_3
    move-exception v0

    .line 439
    :try_start_f
    invoke-static {v13}, LX/g;->p(LX/g;)V

    .line 440
    .line 441
    .line 442
    throw v0
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_4

    .line 443
    :catchall_4
    move-exception v0

    .line 444
    :try_start_10
    invoke-virtual {v6}, LX/g;->c()V

    .line 445
    .line 446
    .line 447
    throw v0
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_0

    .line 448
    :goto_a
    invoke-virtual {v7}, LS8/b;->c()V

    .line 449
    .line 450
    .line 451
    throw v0

    .line 452
    :catchall_5
    move-exception v0

    .line 453
    monitor-exit v7

    .line 454
    throw v0
.end method
