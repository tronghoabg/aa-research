.class public final LKd/k;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public a:Lio/ktor/utils/io/X;

.field public b:LQf/a;

.field public c:Lio/ktor/utils/io/m;

.field public d:LEf/t;

.field public e:LKd/d;

.field public f:J

.field public g:I

.field public synthetic h:Ljava/lang/Object;

.field public final synthetic i:Lio/ktor/utils/io/t;

.field public final synthetic j:LQf/a;

.field public final synthetic k:Ljava/lang/Long;


# direct methods
.method public constructor <init>(Lio/ktor/utils/io/t;LQf/a;Ljava/lang/Long;Ljf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LKd/k;->i:Lio/ktor/utils/io/t;

    .line 2
    .line 3
    iput-object p2, p0, LKd/k;->j:LQf/a;

    .line 4
    .line 5
    iput-object p3, p0, LKd/k;->k:Ljava/lang/Long;

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
    new-instance v0, LKd/k;

    .line 2
    .line 3
    iget-object v1, p0, LKd/k;->j:LQf/a;

    .line 4
    .line 5
    iget-object v2, p0, LKd/k;->i:Lio/ktor/utils/io/t;

    .line 6
    .line 7
    iget-object v3, p0, LKd/k;->k:Ljava/lang/Long;

    .line 8
    .line 9
    invoke-direct {v0, v2, v1, v3, p2}, LKd/k;-><init>(Lio/ktor/utils/io/t;LQf/a;Ljava/lang/Long;Ljf/c;)V

    .line 10
    .line 11
    .line 12
    iput-object p1, v0, LKd/k;->h:Ljava/lang/Object;

    .line 13
    .line 14
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LGf/t;

    .line 2
    .line 3
    check-cast p2, Ljf/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, LKd/k;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LKd/k;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LKd/k;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v6, p0

    .line 2
    .line 3
    sget-object v7, Lkf/a;->a:Lkf/a;

    .line 4
    .line 5
    iget v0, v6, LKd/k;->g:I

    .line 6
    .line 7
    const/4 v1, 0x2

    .line 8
    move v2, v0

    .line 9
    iget-object v0, v6, LKd/k;->j:LQf/a;

    .line 10
    .line 11
    const/4 v8, 0x0

    .line 12
    const-wide/16 v9, 0x0

    .line 13
    .line 14
    packed-switch v2, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 18
    .line 19
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 20
    .line 21
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    throw v0

    .line 25
    :pswitch_0
    iget-object v0, v6, LKd/k;->h:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, LGf/t;

    .line 28
    .line 29
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    move-object/from16 v1, p1

    .line 33
    .line 34
    goto/16 :goto_14

    .line 35
    .line 36
    :pswitch_1
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto/16 :goto_16

    .line 40
    .line 41
    :pswitch_2
    iget-object v0, v6, LKd/k;->h:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v0, LGf/t;

    .line 44
    .line 45
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    move-object/from16 v1, p1

    .line 49
    .line 50
    goto/16 :goto_13

    .line 51
    .line 52
    :pswitch_3
    iget-wide v0, v6, LKd/k;->f:J

    .line 53
    .line 54
    iget-object v2, v6, LKd/k;->a:Lio/ktor/utils/io/X;

    .line 55
    .line 56
    iget-object v3, v6, LKd/k;->h:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v3, LGf/t;

    .line 59
    .line 60
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    :cond_0
    move-object/from16 v17, v3

    .line 64
    .line 65
    move-object v3, v2

    .line 66
    move-wide v1, v0

    .line 67
    move-object/from16 v0, v17

    .line 68
    .line 69
    goto/16 :goto_12

    .line 70
    .line 71
    :pswitch_4
    iget-wide v0, v6, LKd/k;->f:J

    .line 72
    .line 73
    iget-object v2, v6, LKd/k;->a:Lio/ktor/utils/io/X;

    .line 74
    .line 75
    iget-object v3, v6, LKd/k;->h:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v3, LGf/t;

    .line 78
    .line 79
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    goto/16 :goto_11

    .line 83
    .line 84
    :pswitch_5
    iget-wide v1, v6, LKd/k;->f:J

    .line 85
    .line 86
    iget-object v3, v6, LKd/k;->e:LKd/d;

    .line 87
    .line 88
    iget-object v4, v6, LKd/k;->d:LEf/t;

    .line 89
    .line 90
    iget-object v5, v6, LKd/k;->c:Lio/ktor/utils/io/m;

    .line 91
    .line 92
    iget-object v11, v6, LKd/k;->b:LQf/a;

    .line 93
    .line 94
    iget-object v12, v6, LKd/k;->a:Lio/ktor/utils/io/X;

    .line 95
    .line 96
    iget-object v13, v6, LKd/k;->h:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v13, LGf/t;

    .line 99
    .line 100
    :try_start_0
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 101
    .line 102
    .line 103
    move-wide v14, v1

    .line 104
    move-object v1, v3

    .line 105
    move-wide v2, v14

    .line 106
    move-object v14, v4

    .line 107
    move-object v15, v11

    .line 108
    move-object v4, v12

    .line 109
    :goto_0
    move-object v12, v13

    .line 110
    goto/16 :goto_b

    .line 111
    .line 112
    :catchall_0
    move-exception v0

    .line 113
    move-object v8, v3

    .line 114
    goto/16 :goto_10

    .line 115
    .line 116
    :pswitch_6
    iget-wide v1, v6, LKd/k;->f:J

    .line 117
    .line 118
    iget-object v4, v6, LKd/k;->d:LEf/t;

    .line 119
    .line 120
    iget-object v5, v6, LKd/k;->c:Lio/ktor/utils/io/m;

    .line 121
    .line 122
    iget-object v3, v6, LKd/k;->b:LQf/a;

    .line 123
    .line 124
    iget-object v11, v6, LKd/k;->a:Lio/ktor/utils/io/X;

    .line 125
    .line 126
    iget-object v12, v6, LKd/k;->h:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast v12, LGf/t;

    .line 129
    .line 130
    :try_start_1
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 131
    .line 132
    .line 133
    move-object/from16 v13, p1

    .line 134
    .line 135
    move-object v15, v3

    .line 136
    move-wide/from16 v17, v1

    .line 137
    .line 138
    move-object v2, v5

    .line 139
    move-object v14, v4

    .line 140
    move-object v3, v12

    .line 141
    move-object v1, v11

    .line 142
    :goto_1
    move-wide/from16 v11, v17

    .line 143
    .line 144
    goto/16 :goto_a

    .line 145
    .line 146
    :catchall_1
    move-exception v0

    .line 147
    goto/16 :goto_10

    .line 148
    .line 149
    :pswitch_7
    iget-wide v1, v6, LKd/k;->f:J

    .line 150
    .line 151
    iget-object v3, v6, LKd/k;->d:LEf/t;

    .line 152
    .line 153
    iget-object v4, v6, LKd/k;->c:Lio/ktor/utils/io/m;

    .line 154
    .line 155
    iget-object v5, v6, LKd/k;->b:LQf/a;

    .line 156
    .line 157
    iget-object v11, v6, LKd/k;->a:Lio/ktor/utils/io/X;

    .line 158
    .line 159
    iget-object v12, v6, LKd/k;->h:Ljava/lang/Object;

    .line 160
    .line 161
    check-cast v12, LGf/t;

    .line 162
    .line 163
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    move-object/from16 v17, v4

    .line 167
    .line 168
    move-object v4, v3

    .line 169
    move-object/from16 v3, v17

    .line 170
    .line 171
    goto/16 :goto_9

    .line 172
    .line 173
    :pswitch_8
    iget-wide v1, v6, LKd/k;->f:J

    .line 174
    .line 175
    iget-object v3, v6, LKd/k;->b:LQf/a;

    .line 176
    .line 177
    iget-object v4, v6, LKd/k;->a:Lio/ktor/utils/io/X;

    .line 178
    .line 179
    iget-object v5, v6, LKd/k;->h:Ljava/lang/Object;

    .line 180
    .line 181
    check-cast v5, LGf/t;

    .line 182
    .line 183
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 184
    .line 185
    .line 186
    move-object/from16 v11, p1

    .line 187
    .line 188
    :cond_1
    move-object v12, v5

    .line 189
    move-object v5, v3

    .line 190
    move-wide v2, v1

    .line 191
    goto/16 :goto_8

    .line 192
    .line 193
    :pswitch_9
    iget-wide v1, v6, LKd/k;->f:J

    .line 194
    .line 195
    iget-object v3, v6, LKd/k;->b:LQf/a;

    .line 196
    .line 197
    iget-object v4, v6, LKd/k;->a:Lio/ktor/utils/io/X;

    .line 198
    .line 199
    iget-object v5, v6, LKd/k;->h:Ljava/lang/Object;

    .line 200
    .line 201
    check-cast v5, LGf/t;

    .line 202
    .line 203
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 204
    .line 205
    .line 206
    goto/16 :goto_7

    .line 207
    .line 208
    :pswitch_a
    iget-wide v1, v6, LKd/k;->f:J

    .line 209
    .line 210
    iget-object v3, v6, LKd/k;->b:LQf/a;

    .line 211
    .line 212
    iget-object v4, v6, LKd/k;->a:Lio/ktor/utils/io/X;

    .line 213
    .line 214
    iget-object v5, v6, LKd/k;->h:Ljava/lang/Object;

    .line 215
    .line 216
    check-cast v5, LGf/t;

    .line 217
    .line 218
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 219
    .line 220
    .line 221
    move-object v12, v5

    .line 222
    move-object v5, v3

    .line 223
    move-wide v2, v1

    .line 224
    move-object/from16 v1, p1

    .line 225
    .line 226
    goto/16 :goto_6

    .line 227
    .line 228
    :pswitch_b
    iget-wide v1, v6, LKd/k;->f:J

    .line 229
    .line 230
    iget-object v3, v6, LKd/k;->b:LQf/a;

    .line 231
    .line 232
    iget-object v4, v6, LKd/k;->a:Lio/ktor/utils/io/X;

    .line 233
    .line 234
    iget-object v5, v6, LKd/k;->h:Ljava/lang/Object;

    .line 235
    .line 236
    check-cast v5, LGf/t;

    .line 237
    .line 238
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 239
    .line 240
    .line 241
    goto/16 :goto_4

    .line 242
    .line 243
    :pswitch_c
    iget-wide v2, v6, LKd/k;->f:J

    .line 244
    .line 245
    iget-object v4, v6, LKd/k;->b:LQf/a;

    .line 246
    .line 247
    iget-object v5, v6, LKd/k;->a:Lio/ktor/utils/io/X;

    .line 248
    .line 249
    iget-object v11, v6, LKd/k;->h:Ljava/lang/Object;

    .line 250
    .line 251
    check-cast v11, LGf/t;

    .line 252
    .line 253
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 254
    .line 255
    .line 256
    move-object v12, v11

    .line 257
    move-object v11, v5

    .line 258
    move-object v5, v4

    .line 259
    move-object/from16 v4, p1

    .line 260
    .line 261
    goto :goto_3

    .line 262
    :pswitch_d
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 263
    .line 264
    .line 265
    iget-object v2, v6, LKd/k;->h:Ljava/lang/Object;

    .line 266
    .line 267
    check-cast v2, LGf/t;

    .line 268
    .line 269
    iget-object v3, v6, LKd/k;->i:Lio/ktor/utils/io/t;

    .line 270
    .line 271
    const-string v4, "<this>"

    .line 272
    .line 273
    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    new-instance v5, Lio/ktor/utils/io/X;

    .line 277
    .line 278
    invoke-direct {v5, v3}, Lio/ktor/utils/io/X;-><init>(Lio/ktor/utils/io/t;)V

    .line 279
    .line 280
    .line 281
    invoke-virtual {v5}, Lio/ktor/utils/io/X;->e()V

    .line 282
    .line 283
    .line 284
    iget-wide v11, v5, Lio/ktor/utils/io/X;->e:J

    .line 285
    .line 286
    sget-object v3, LKd/o;->b:LQf/a;

    .line 287
    .line 288
    iget-object v3, v3, LQf/a;->a:[B

    .line 289
    .line 290
    array-length v3, v3

    .line 291
    iget-object v13, v0, LQf/a;->a:[B

    .line 292
    .line 293
    array-length v14, v13

    .line 294
    if-ne v3, v14, :cond_2

    .line 295
    .line 296
    sget-object v3, LQf/a;->c:LQf/a;

    .line 297
    .line 298
    goto :goto_2

    .line 299
    :cond_2
    new-instance v15, LQf/a;

    .line 300
    .line 301
    invoke-direct {v15, v13, v3, v14}, LQf/a;-><init>([BII)V

    .line 302
    .line 303
    .line 304
    move-object v3, v15

    .line 305
    :goto_2
    new-instance v13, LKd/j;

    .line 306
    .line 307
    invoke-direct {v13, v3, v5, v8}, LKd/j;-><init>(LQf/a;Lio/ktor/utils/io/X;Ljf/c;)V

    .line 308
    .line 309
    .line 310
    sget-object v14, Ljf/i;->a:Ljf/i;

    .line 311
    .line 312
    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 313
    .line 314
    .line 315
    new-instance v4, Lio/ktor/utils/io/m;

    .line 316
    .line 317
    invoke-direct {v4}, Lio/ktor/utils/io/m;-><init>()V

    .line 318
    .line 319
    .line 320
    new-instance v15, Lio/ktor/utils/io/M;

    .line 321
    .line 322
    invoke-direct {v15, v13, v4, v8}, Lio/ktor/utils/io/M;-><init>(Ltf/p;Lio/ktor/utils/io/m;Ljf/c;)V

    .line 323
    .line 324
    .line 325
    invoke-static {v2, v14, v15, v1}, LEf/H;->D(LEf/E;Ljf/h;Ltf/p;I)LEf/H0;

    .line 326
    .line 327
    .line 328
    move-result-object v13

    .line 329
    new-instance v14, Lio/ktor/utils/io/K;

    .line 330
    .line 331
    const/4 v15, 0x0

    .line 332
    invoke-direct {v14, v4, v15}, Lio/ktor/utils/io/K;-><init>(Lio/ktor/utils/io/m;I)V

    .line 333
    .line 334
    .line 335
    invoke-virtual {v13, v14}, LEf/z0;->invokeOnCompletion(Ltf/l;)LEf/U;

    .line 336
    .line 337
    .line 338
    iput-object v2, v6, LKd/k;->h:Ljava/lang/Object;

    .line 339
    .line 340
    iput-object v5, v6, LKd/k;->a:Lio/ktor/utils/io/X;

    .line 341
    .line 342
    iput-object v3, v6, LKd/k;->b:LQf/a;

    .line 343
    .line 344
    iput-wide v11, v6, LKd/k;->f:J

    .line 345
    .line 346
    const/4 v13, 0x1

    .line 347
    iput v13, v6, LKd/k;->g:I

    .line 348
    .line 349
    invoke-static {v4, v6}, Lio/ktor/utils/io/N;->m(Lio/ktor/utils/io/t;Llf/c;)Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    move-result-object v4

    .line 353
    if-ne v4, v7, :cond_3

    .line 354
    .line 355
    goto/16 :goto_15

    .line 356
    .line 357
    :cond_3
    move-wide/from16 v17, v11

    .line 358
    .line 359
    move-object v12, v2

    .line 360
    move-object v11, v5

    .line 361
    move-object v5, v3

    .line 362
    move-wide/from16 v2, v17

    .line 363
    .line 364
    :goto_3
    check-cast v4, LPf/i;

    .line 365
    .line 366
    invoke-static {v4}, LFe/b;->C(LPf/i;)J

    .line 367
    .line 368
    .line 369
    move-result-wide v13

    .line 370
    cmp-long v4, v13, v9

    .line 371
    .line 372
    if-lez v4, :cond_5

    .line 373
    .line 374
    new-instance v4, LKd/i;

    .line 375
    .line 376
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 377
    .line 378
    .line 379
    iput-object v12, v6, LKd/k;->h:Ljava/lang/Object;

    .line 380
    .line 381
    iput-object v11, v6, LKd/k;->a:Lio/ktor/utils/io/X;

    .line 382
    .line 383
    iput-object v5, v6, LKd/k;->b:LQf/a;

    .line 384
    .line 385
    iput-wide v2, v6, LKd/k;->f:J

    .line 386
    .line 387
    iput v1, v6, LKd/k;->g:I

    .line 388
    .line 389
    move-object v1, v12

    .line 390
    check-cast v1, LGf/s;

    .line 391
    .line 392
    iget-object v1, v1, LGf/s;->d:LGf/e;

    .line 393
    .line 394
    invoke-interface {v1, v4, v6}, LGf/w;->i(Ljava/lang/Object;Ljf/c;)Ljava/lang/Object;

    .line 395
    .line 396
    .line 397
    move-result-object v1

    .line 398
    if-ne v1, v7, :cond_4

    .line 399
    .line 400
    goto/16 :goto_15

    .line 401
    .line 402
    :cond_4
    move-wide v1, v2

    .line 403
    move-object v3, v5

    .line 404
    move-object v4, v11

    .line 405
    move-object v5, v12

    .line 406
    :goto_4
    move-object v12, v5

    .line 407
    move-object v5, v3

    .line 408
    move-wide v2, v1

    .line 409
    goto :goto_5

    .line 410
    :cond_5
    move-object v4, v11

    .line 411
    :goto_5
    invoke-virtual {v4}, Lio/ktor/utils/io/X;->h()Z

    .line 412
    .line 413
    .line 414
    move-result v1

    .line 415
    if-nez v1, :cond_10

    .line 416
    .line 417
    sget-object v1, LKd/o;->b:LQf/a;

    .line 418
    .line 419
    iput-object v12, v6, LKd/k;->h:Ljava/lang/Object;

    .line 420
    .line 421
    iput-object v4, v6, LKd/k;->a:Lio/ktor/utils/io/X;

    .line 422
    .line 423
    iput-object v5, v6, LKd/k;->b:LQf/a;

    .line 424
    .line 425
    iput-object v8, v6, LKd/k;->c:Lio/ktor/utils/io/m;

    .line 426
    .line 427
    iput-object v8, v6, LKd/k;->d:LEf/t;

    .line 428
    .line 429
    iput-object v8, v6, LKd/k;->e:LKd/d;

    .line 430
    .line 431
    iput-wide v2, v6, LKd/k;->f:J

    .line 432
    .line 433
    const/4 v11, 0x3

    .line 434
    iput v11, v6, LKd/k;->g:I

    .line 435
    .line 436
    invoke-static {v4, v1, v6}, Lio/ktor/utils/io/N;->p(Lio/ktor/utils/io/t;LQf/a;Llf/c;)Ljava/lang/Object;

    .line 437
    .line 438
    .line 439
    move-result-object v1

    .line 440
    if-ne v1, v7, :cond_6

    .line 441
    .line 442
    goto/16 :goto_15

    .line 443
    .line 444
    :cond_6
    :goto_6
    check-cast v1, Ljava/lang/Boolean;

    .line 445
    .line 446
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 447
    .line 448
    .line 449
    move-result v1

    .line 450
    if-nez v1, :cond_10

    .line 451
    .line 452
    sget-object v1, LKd/o;->a:LQf/a;

    .line 453
    .line 454
    iput-object v12, v6, LKd/k;->h:Ljava/lang/Object;

    .line 455
    .line 456
    iput-object v4, v6, LKd/k;->a:Lio/ktor/utils/io/X;

    .line 457
    .line 458
    iput-object v5, v6, LKd/k;->b:LQf/a;

    .line 459
    .line 460
    iput-wide v2, v6, LKd/k;->f:J

    .line 461
    .line 462
    const/4 v11, 0x4

    .line 463
    iput v11, v6, LKd/k;->g:I

    .line 464
    .line 465
    invoke-static {v4, v1, v6}, Lio/ktor/utils/io/N;->p(Lio/ktor/utils/io/t;LQf/a;Llf/c;)Ljava/lang/Object;

    .line 466
    .line 467
    .line 468
    move-result-object v1

    .line 469
    if-ne v1, v7, :cond_7

    .line 470
    .line 471
    goto/16 :goto_15

    .line 472
    .line 473
    :cond_7
    move-wide v1, v2

    .line 474
    move-object v3, v5

    .line 475
    move-object v5, v12

    .line 476
    :goto_7
    iput-object v5, v6, LKd/k;->h:Ljava/lang/Object;

    .line 477
    .line 478
    iput-object v4, v6, LKd/k;->a:Lio/ktor/utils/io/X;

    .line 479
    .line 480
    iput-object v3, v6, LKd/k;->b:LQf/a;

    .line 481
    .line 482
    iput-wide v1, v6, LKd/k;->f:J

    .line 483
    .line 484
    const/4 v11, 0x5

    .line 485
    iput v11, v6, LKd/k;->g:I

    .line 486
    .line 487
    invoke-static {v4, v3, v6}, Lio/ktor/utils/io/N;->p(Lio/ktor/utils/io/t;LQf/a;Llf/c;)Ljava/lang/Object;

    .line 488
    .line 489
    .line 490
    move-result-object v11

    .line 491
    if-ne v11, v7, :cond_1

    .line 492
    .line 493
    goto/16 :goto_15

    .line 494
    .line 495
    :goto_8
    check-cast v11, Ljava/lang/Boolean;

    .line 496
    .line 497
    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    .line 498
    .line 499
    .line 500
    move-result v1

    .line 501
    if-eqz v1, :cond_8

    .line 502
    .line 503
    goto :goto_5

    .line 504
    :cond_8
    new-instance v1, Lio/ktor/utils/io/m;

    .line 505
    .line 506
    invoke-direct {v1}, Lio/ktor/utils/io/m;-><init>()V

    .line 507
    .line 508
    .line 509
    invoke-static {}, LEf/H;->b()LEf/u;

    .line 510
    .line 511
    .line 512
    move-result-object v11

    .line 513
    new-instance v13, LKd/i;

    .line 514
    .line 515
    invoke-direct {v13}, Ljava/lang/Object;-><init>()V

    .line 516
    .line 517
    .line 518
    iput-object v12, v6, LKd/k;->h:Ljava/lang/Object;

    .line 519
    .line 520
    iput-object v4, v6, LKd/k;->a:Lio/ktor/utils/io/X;

    .line 521
    .line 522
    iput-object v5, v6, LKd/k;->b:LQf/a;

    .line 523
    .line 524
    iput-object v1, v6, LKd/k;->c:Lio/ktor/utils/io/m;

    .line 525
    .line 526
    iput-object v11, v6, LKd/k;->d:LEf/t;

    .line 527
    .line 528
    iput-wide v2, v6, LKd/k;->f:J

    .line 529
    .line 530
    const/4 v14, 0x6

    .line 531
    iput v14, v6, LKd/k;->g:I

    .line 532
    .line 533
    move-object v14, v12

    .line 534
    check-cast v14, LGf/s;

    .line 535
    .line 536
    iget-object v14, v14, LGf/s;->d:LGf/e;

    .line 537
    .line 538
    invoke-interface {v14, v13, v6}, LGf/w;->i(Ljava/lang/Object;Ljf/c;)Ljava/lang/Object;

    .line 539
    .line 540
    .line 541
    move-result-object v13

    .line 542
    if-ne v13, v7, :cond_9

    .line 543
    .line 544
    goto/16 :goto_15

    .line 545
    .line 546
    :cond_9
    move-wide/from16 v17, v2

    .line 547
    .line 548
    move-object v3, v1

    .line 549
    move-wide/from16 v1, v17

    .line 550
    .line 551
    move-object/from16 v17, v11

    .line 552
    .line 553
    move-object v11, v4

    .line 554
    move-object/from16 v4, v17

    .line 555
    .line 556
    :goto_9
    :try_start_2
    iput-object v12, v6, LKd/k;->h:Ljava/lang/Object;

    .line 557
    .line 558
    iput-object v11, v6, LKd/k;->a:Lio/ktor/utils/io/X;

    .line 559
    .line 560
    iput-object v5, v6, LKd/k;->b:LQf/a;

    .line 561
    .line 562
    iput-object v3, v6, LKd/k;->c:Lio/ktor/utils/io/m;

    .line 563
    .line 564
    iput-object v4, v6, LKd/k;->d:LEf/t;

    .line 565
    .line 566
    iput-wide v1, v6, LKd/k;->f:J

    .line 567
    .line 568
    const/4 v13, 0x7

    .line 569
    iput v13, v6, LKd/k;->g:I

    .line 570
    .line 571
    invoke-static {v11, v6}, LKd/o;->b(Lio/ktor/utils/io/X;Llf/c;)Ljava/lang/Object;

    .line 572
    .line 573
    .line 574
    move-result-object v13
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_6

    .line 575
    if-ne v13, v7, :cond_a

    .line 576
    .line 577
    goto/16 :goto_15

    .line 578
    .line 579
    :cond_a
    move-object v15, v5

    .line 580
    move-wide/from16 v17, v1

    .line 581
    .line 582
    move-object v2, v3

    .line 583
    move-object v14, v4

    .line 584
    move-object v1, v11

    .line 585
    move-object v3, v12

    .line 586
    goto/16 :goto_1

    .line 587
    .line 588
    :goto_a
    :try_start_3
    check-cast v13, LKd/d;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_5

    .line 589
    .line 590
    :try_start_4
    move-object v4, v14

    .line 591
    check-cast v4, LEf/u;

    .line 592
    .line 593
    invoke-virtual {v4, v13}, LEf/z0;->K(Ljava/lang/Object;)Z

    .line 594
    .line 595
    .line 596
    move-result v4

    .line 597
    if-eqz v4, :cond_e

    .line 598
    .line 599
    iput-object v3, v6, LKd/k;->h:Ljava/lang/Object;

    .line 600
    .line 601
    iput-object v1, v6, LKd/k;->a:Lio/ktor/utils/io/X;

    .line 602
    .line 603
    iput-object v15, v6, LKd/k;->b:LQf/a;

    .line 604
    .line 605
    iput-object v2, v6, LKd/k;->c:Lio/ktor/utils/io/m;

    .line 606
    .line 607
    iput-object v14, v6, LKd/k;->d:LEf/t;

    .line 608
    .line 609
    iput-object v13, v6, LKd/k;->e:LKd/d;

    .line 610
    .line 611
    iput-wide v11, v6, LKd/k;->f:J

    .line 612
    .line 613
    const/16 v4, 0x8

    .line 614
    .line 615
    iput v4, v6, LKd/k;->g:I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 616
    .line 617
    const-wide/32 v4, 0x10000

    .line 618
    .line 619
    .line 620
    move-object/from16 v17, v13

    .line 621
    .line 622
    move-object v13, v3

    .line 623
    move-object/from16 v3, v17

    .line 624
    .line 625
    :try_start_5
    invoke-static/range {v0 .. v6}, LKd/o;->a(LQf/a;Lio/ktor/utils/io/X;Lio/ktor/utils/io/m;LKd/d;JLlf/c;)Ljava/lang/Object;

    .line 626
    .line 627
    .line 628
    move-result-object v4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 629
    if-ne v4, v7, :cond_b

    .line 630
    .line 631
    goto/16 :goto_15

    .line 632
    .line 633
    :cond_b
    move-object v4, v1

    .line 634
    move-object v5, v2

    .line 635
    move-object v1, v3

    .line 636
    move-wide v2, v11

    .line 637
    goto/16 :goto_0

    .line 638
    .line 639
    :goto_b
    :try_start_6
    invoke-virtual {v5}, Lio/ktor/utils/io/m;->j()V

    .line 640
    .line 641
    .line 642
    sget-object v11, Lio/ktor/utils/io/N;->b:Lio/ktor/utils/io/S;

    .line 643
    .line 644
    :cond_c
    sget-object v13, Lio/ktor/utils/io/m;->g:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 645
    .line 646
    invoke-virtual {v13, v5, v8, v11}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 647
    .line 648
    .line 649
    move-result v16

    .line 650
    if-eqz v16, :cond_d

    .line 651
    .line 652
    invoke-virtual {v5, v8}, Lio/ktor/utils/io/m;->i(Ljava/lang/Throwable;)V

    .line 653
    .line 654
    .line 655
    goto :goto_c

    .line 656
    :cond_d
    invoke-virtual {v13, v5}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 657
    .line 658
    .line 659
    move-result-object v13
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 660
    if-eqz v13, :cond_c

    .line 661
    .line 662
    :goto_c
    move-object v5, v15

    .line 663
    goto/16 :goto_5

    .line 664
    .line 665
    :catchall_2
    move-exception v0

    .line 666
    move-object v8, v1

    .line 667
    :goto_d
    move-object v4, v14

    .line 668
    goto :goto_10

    .line 669
    :goto_e
    move-object v5, v2

    .line 670
    move-object v8, v3

    .line 671
    goto :goto_d

    .line 672
    :catchall_3
    move-exception v0

    .line 673
    move-object v3, v13

    .line 674
    goto :goto_e

    .line 675
    :cond_e
    move-object v3, v13

    .line 676
    :try_start_7
    invoke-virtual {v3}, LKd/d;->d()V

    .line 677
    .line 678
    .line 679
    new-instance v0, Ljava/util/concurrent/CancellationException;

    .line 680
    .line 681
    const-string v1, "Multipart processing has been cancelled"

    .line 682
    .line 683
    invoke-direct {v0, v1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 684
    .line 685
    .line 686
    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 687
    :catchall_4
    move-exception v0

    .line 688
    goto :goto_e

    .line 689
    :catchall_5
    move-exception v0

    .line 690
    move-object v5, v2

    .line 691
    goto :goto_d

    .line 692
    :goto_f
    move-object v5, v3

    .line 693
    goto :goto_10

    .line 694
    :catchall_6
    move-exception v0

    .line 695
    goto :goto_f

    .line 696
    :goto_10
    check-cast v4, LEf/u;

    .line 697
    .line 698
    invoke-virtual {v4, v0}, LEf/u;->Y(Ljava/lang/Throwable;)Z

    .line 699
    .line 700
    .line 701
    move-result v1

    .line 702
    if-eqz v1, :cond_f

    .line 703
    .line 704
    if-eqz v8, :cond_f

    .line 705
    .line 706
    invoke-virtual {v8}, LKd/d;->d()V

    .line 707
    .line 708
    .line 709
    :cond_f
    invoke-static {v5, v0}, Lio/ktor/utils/io/N;->c(Lio/ktor/utils/io/J;Ljava/lang/Throwable;)V

    .line 710
    .line 711
    .line 712
    throw v0

    .line 713
    :cond_10
    sget-object v0, LKd/o;->a:LQf/a;

    .line 714
    .line 715
    iput-object v12, v6, LKd/k;->h:Ljava/lang/Object;

    .line 716
    .line 717
    iput-object v4, v6, LKd/k;->a:Lio/ktor/utils/io/X;

    .line 718
    .line 719
    iput-object v8, v6, LKd/k;->b:LQf/a;

    .line 720
    .line 721
    iput-object v8, v6, LKd/k;->c:Lio/ktor/utils/io/m;

    .line 722
    .line 723
    iput-object v8, v6, LKd/k;->d:LEf/t;

    .line 724
    .line 725
    iput-object v8, v6, LKd/k;->e:LKd/d;

    .line 726
    .line 727
    iput-wide v2, v6, LKd/k;->f:J

    .line 728
    .line 729
    const/16 v1, 0x9

    .line 730
    .line 731
    iput v1, v6, LKd/k;->g:I

    .line 732
    .line 733
    invoke-static {v4, v0, v6}, Lio/ktor/utils/io/N;->p(Lio/ktor/utils/io/t;LQf/a;Llf/c;)Ljava/lang/Object;

    .line 734
    .line 735
    .line 736
    move-result-object v0

    .line 737
    if-ne v0, v7, :cond_11

    .line 738
    .line 739
    goto/16 :goto_15

    .line 740
    .line 741
    :cond_11
    move-wide v0, v2

    .line 742
    move-object v2, v4

    .line 743
    move-object v3, v12

    .line 744
    :goto_11
    sget-object v4, LKd/o;->a:LQf/a;

    .line 745
    .line 746
    iput-object v3, v6, LKd/k;->h:Ljava/lang/Object;

    .line 747
    .line 748
    iput-object v2, v6, LKd/k;->a:Lio/ktor/utils/io/X;

    .line 749
    .line 750
    iput-wide v0, v6, LKd/k;->f:J

    .line 751
    .line 752
    const/16 v5, 0xa

    .line 753
    .line 754
    iput v5, v6, LKd/k;->g:I

    .line 755
    .line 756
    invoke-static {v2, v4, v6}, Lio/ktor/utils/io/N;->p(Lio/ktor/utils/io/t;LQf/a;Llf/c;)Ljava/lang/Object;

    .line 757
    .line 758
    .line 759
    move-result-object v4

    .line 760
    if-ne v4, v7, :cond_0

    .line 761
    .line 762
    goto/16 :goto_15

    .line 763
    .line 764
    :goto_12
    iget-object v4, v6, LKd/k;->k:Ljava/lang/Long;

    .line 765
    .line 766
    if-eqz v4, :cond_14

    .line 767
    .line 768
    invoke-virtual {v3}, Lio/ktor/utils/io/X;->e()V

    .line 769
    .line 770
    .line 771
    iget-wide v11, v3, Lio/ktor/utils/io/X;->e:J

    .line 772
    .line 773
    sub-long/2addr v11, v1

    .line 774
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 775
    .line 776
    .line 777
    move-result-wide v1

    .line 778
    sub-long/2addr v1, v11

    .line 779
    const-wide/32 v4, 0x7fffffff

    .line 780
    .line 781
    .line 782
    cmp-long v4, v1, v4

    .line 783
    .line 784
    if-gtz v4, :cond_13

    .line 785
    .line 786
    cmp-long v4, v1, v9

    .line 787
    .line 788
    if-lez v4, :cond_16

    .line 789
    .line 790
    long-to-int v1, v1

    .line 791
    iput-object v0, v6, LKd/k;->h:Ljava/lang/Object;

    .line 792
    .line 793
    iput-object v8, v6, LKd/k;->a:Lio/ktor/utils/io/X;

    .line 794
    .line 795
    const/16 v2, 0xb

    .line 796
    .line 797
    iput v2, v6, LKd/k;->g:I

    .line 798
    .line 799
    invoke-static {v3, v1, v6}, Lio/ktor/utils/io/N;->k(Lio/ktor/utils/io/X;ILlf/c;)Ljava/lang/Object;

    .line 800
    .line 801
    .line 802
    move-result-object v1

    .line 803
    if-ne v1, v7, :cond_12

    .line 804
    .line 805
    goto :goto_15

    .line 806
    :cond_12
    :goto_13
    check-cast v1, LPf/i;

    .line 807
    .line 808
    new-instance v2, LKd/i;

    .line 809
    .line 810
    const-string v3, "body"

    .line 811
    .line 812
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 813
    .line 814
    .line 815
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 816
    .line 817
    .line 818
    iput-object v8, v6, LKd/k;->h:Ljava/lang/Object;

    .line 819
    .line 820
    const/16 v1, 0xc

    .line 821
    .line 822
    iput v1, v6, LKd/k;->g:I

    .line 823
    .line 824
    check-cast v0, LGf/s;

    .line 825
    .line 826
    iget-object v0, v0, LGf/s;->d:LGf/e;

    .line 827
    .line 828
    invoke-interface {v0, v2, v6}, LGf/w;->i(Ljava/lang/Object;Ljf/c;)Ljava/lang/Object;

    .line 829
    .line 830
    .line 831
    move-result-object v0

    .line 832
    if-ne v0, v7, :cond_16

    .line 833
    .line 834
    goto :goto_15

    .line 835
    :cond_13
    new-instance v0, Ljava/io/IOException;

    .line 836
    .line 837
    const-string v1, "Failed to parse multipart: prologue is too long"

    .line 838
    .line 839
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 840
    .line 841
    .line 842
    throw v0

    .line 843
    :cond_14
    iput-object v0, v6, LKd/k;->h:Ljava/lang/Object;

    .line 844
    .line 845
    iput-object v8, v6, LKd/k;->a:Lio/ktor/utils/io/X;

    .line 846
    .line 847
    const/16 v1, 0xd

    .line 848
    .line 849
    iput v1, v6, LKd/k;->g:I

    .line 850
    .line 851
    invoke-static {v3, v6}, Lio/ktor/utils/io/N;->m(Lio/ktor/utils/io/t;Llf/c;)Ljava/lang/Object;

    .line 852
    .line 853
    .line 854
    move-result-object v1

    .line 855
    if-ne v1, v7, :cond_15

    .line 856
    .line 857
    goto :goto_15

    .line 858
    :cond_15
    :goto_14
    check-cast v1, LPf/i;

    .line 859
    .line 860
    invoke-interface {v1}, LPf/i;->exhausted()Z

    .line 861
    .line 862
    .line 863
    move-result v1

    .line 864
    if-nez v1, :cond_16

    .line 865
    .line 866
    new-instance v1, LKd/i;

    .line 867
    .line 868
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 869
    .line 870
    .line 871
    iput-object v8, v6, LKd/k;->h:Ljava/lang/Object;

    .line 872
    .line 873
    const/16 v2, 0xe

    .line 874
    .line 875
    iput v2, v6, LKd/k;->g:I

    .line 876
    .line 877
    check-cast v0, LGf/s;

    .line 878
    .line 879
    iget-object v0, v0, LGf/s;->d:LGf/e;

    .line 880
    .line 881
    invoke-interface {v0, v1, v6}, LGf/w;->i(Ljava/lang/Object;Ljf/c;)Ljava/lang/Object;

    .line 882
    .line 883
    .line 884
    move-result-object v0

    .line 885
    if-ne v0, v7, :cond_16

    .line 886
    .line 887
    :goto_15
    return-object v7

    .line 888
    :cond_16
    :goto_16
    sget-object v0, Lef/C;->a:Lef/C;

    .line 889
    .line 890
    return-object v0

    .line 891
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
