.class public abstract LKd/o;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LQf/a;

.field public static final b:LQf/a;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, LQf/a;

    .line 2
    .line 3
    sget-object v1, LBf/a;->a:Ljava/nio/charset/Charset;

    .line 4
    .line 5
    const-string v2, "\r\n"

    .line 6
    .line 7
    invoke-static {v2, v1}, LFe/c;->F(Ljava/lang/String;Ljava/nio/charset/Charset;)[B

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    array-length v2, v1

    .line 12
    const/4 v3, 0x0

    .line 13
    invoke-direct {v0, v1, v3, v2}, LQf/a;-><init>([BII)V

    .line 14
    .line 15
    .line 16
    sput-object v0, LKd/o;->a:LQf/a;

    .line 17
    .line 18
    const/4 v0, 0x2

    .line 19
    new-array v0, v0, [B

    .line 20
    .line 21
    fill-array-data v0, :array_0

    .line 22
    .line 23
    .line 24
    new-instance v1, LQf/a;

    .line 25
    .line 26
    invoke-direct {v1, v0}, LQf/a;-><init>([B)V

    .line 27
    .line 28
    .line 29
    sput-object v1, LKd/o;->b:LQf/a;

    .line 30
    .line 31
    return-void

    .line 32
    nop

    .line 33
    :array_0
    .array-data 1
        0x2dt
        0x2dt
    .end array-data
.end method

.method public static final a(LQf/a;Lio/ktor/utils/io/X;Lio/ktor/utils/io/m;LKd/d;JLlf/c;)Ljava/lang/Object;
    .locals 27

    .line 1
    move-object/from16 v3, p2

    .line 2
    .line 3
    move-object/from16 v0, p6

    .line 4
    .line 5
    const/4 v6, 0x1

    .line 6
    instance-of v1, v0, LKd/l;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    move-object v1, v0

    .line 11
    check-cast v1, LKd/l;

    .line 12
    .line 13
    iget v2, v1, LKd/l;->f:I

    .line 14
    .line 15
    const/high16 v4, -0x80000000

    .line 16
    .line 17
    and-int v5, v2, v4

    .line 18
    .line 19
    if-eqz v5, :cond_0

    .line 20
    .line 21
    sub-int/2addr v2, v4

    .line 22
    iput v2, v1, LKd/l;->f:I

    .line 23
    .line 24
    :goto_0
    move-object v7, v1

    .line 25
    goto :goto_1

    .line 26
    :cond_0
    new-instance v1, LKd/l;

    .line 27
    .line 28
    invoke-direct {v1, v0}, Llf/c;-><init>(Ljf/c;)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :goto_1
    iget-object v0, v7, LKd/l;->e:Ljava/lang/Object;

    .line 33
    .line 34
    sget-object v8, Lkf/a;->a:Lkf/a;

    .line 35
    .line 36
    iget v1, v7, LKd/l;->f:I

    .line 37
    .line 38
    const/4 v9, 0x0

    .line 39
    const/4 v10, 0x4

    .line 40
    const/4 v2, 0x2

    .line 41
    const/4 v4, 0x3

    .line 42
    if-eqz v1, :cond_5

    .line 43
    .line 44
    if-eq v1, v6, :cond_4

    .line 45
    .line 46
    if-eq v1, v2, :cond_3

    .line 47
    .line 48
    if-eq v1, v4, :cond_2

    .line 49
    .line 50
    if-ne v1, v10, :cond_1

    .line 51
    .line 52
    iget-wide v1, v7, LKd/l;->d:J

    .line 53
    .line 54
    invoke-static {v0}, LFe/e;->U(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    goto/16 :goto_f

    .line 58
    .line 59
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 60
    .line 61
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 62
    .line 63
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    throw v0

    .line 67
    :cond_2
    iget-wide v1, v7, LKd/l;->d:J

    .line 68
    .line 69
    iget-object v3, v7, LKd/l;->a:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v3, Lio/ktor/utils/io/J;

    .line 72
    .line 73
    invoke-static {v0}, LFe/e;->U(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    goto/16 :goto_c

    .line 77
    .line 78
    :cond_3
    iget-object v1, v7, LKd/l;->c:Lio/ktor/utils/io/J;

    .line 79
    .line 80
    iget-object v2, v7, LKd/l;->b:Lio/ktor/utils/io/t;

    .line 81
    .line 82
    iget-object v3, v7, LKd/l;->a:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v3, LQf/a;

    .line 85
    .line 86
    invoke-static {v0}, LFe/e;->U(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    goto/16 :goto_b

    .line 90
    .line 91
    :cond_4
    iget-object v1, v7, LKd/l;->a:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v1, Lio/ktor/utils/io/J;

    .line 94
    .line 95
    invoke-static {v0}, LFe/e;->U(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    goto/16 :goto_6

    .line 99
    .line 100
    :cond_5
    invoke-static {v0}, LFe/e;->U(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    const-string v0, "Content-Length"

    .line 104
    .line 105
    move-object/from16 v1, p3

    .line 106
    .line 107
    invoke-virtual {v1, v0}, LKd/d;->a(Ljava/lang/String;)LLd/b;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    if-eqz v0, :cond_d

    .line 112
    .line 113
    sget v1, LLd/f;->a:I

    .line 114
    .line 115
    invoke-virtual {v0}, LLd/b;->length()I

    .line 116
    .line 117
    .line 118
    move-result v1

    .line 119
    const-string v5, ": too large for Long type"

    .line 120
    .line 121
    const-string v13, "Invalid number "

    .line 122
    .line 123
    const/16 v14, 0x13

    .line 124
    .line 125
    if-gt v1, v14, :cond_c

    .line 126
    .line 127
    const-wide/16 v15, 0x9

    .line 128
    .line 129
    const-wide/16 v17, 0x30

    .line 130
    .line 131
    const/16 v19, 0x0

    .line 132
    .line 133
    if-ne v1, v14, :cond_a

    .line 134
    .line 135
    invoke-virtual {v0}, LLd/b;->length()I

    .line 136
    .line 137
    .line 138
    move-result v1

    .line 139
    move/from16 v14, v19

    .line 140
    .line 141
    const-wide/16 v19, 0x0

    .line 142
    .line 143
    :goto_2
    if-ge v14, v1, :cond_8

    .line 144
    .line 145
    const-wide/16 v21, 0x0

    .line 146
    .line 147
    invoke-virtual {v0, v14}, LLd/b;->charAt(I)C

    .line 148
    .line 149
    .line 150
    move-result v11

    .line 151
    int-to-long v11, v11

    .line 152
    sub-long v11, v11, v17

    .line 153
    .line 154
    cmp-long v23, v11, v21

    .line 155
    .line 156
    if-ltz v23, :cond_7

    .line 157
    .line 158
    cmp-long v23, v11, v15

    .line 159
    .line 160
    if-gtz v23, :cond_7

    .line 161
    .line 162
    shl-long v23, v19, v4

    .line 163
    .line 164
    shl-long v19, v19, v6

    .line 165
    .line 166
    add-long v23, v23, v19

    .line 167
    .line 168
    add-long v19, v23, v11

    .line 169
    .line 170
    cmp-long v11, v19, v21

    .line 171
    .line 172
    if-ltz v11, :cond_6

    .line 173
    .line 174
    add-int/2addr v14, v6

    .line 175
    goto :goto_2

    .line 176
    :cond_6
    new-instance v1, Ljava/lang/NumberFormatException;

    .line 177
    .line 178
    new-instance v2, Ljava/lang/StringBuilder;

    .line 179
    .line 180
    invoke-direct {v2, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    invoke-direct {v1, v0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    throw v1

    .line 197
    :cond_7
    invoke-static {v0, v14}, LLd/f;->b(LLd/b;I)V

    .line 198
    .line 199
    .line 200
    throw v9

    .line 201
    :cond_8
    const-wide/16 v21, 0x0

    .line 202
    .line 203
    :cond_9
    move-wide/from16 v0, v19

    .line 204
    .line 205
    goto :goto_4

    .line 206
    :cond_a
    const-wide/16 v21, 0x0

    .line 207
    .line 208
    move/from16 v5, v19

    .line 209
    .line 210
    move-wide/from16 v19, v21

    .line 211
    .line 212
    :goto_3
    if-ge v5, v1, :cond_9

    .line 213
    .line 214
    invoke-virtual {v0, v5}, LLd/b;->charAt(I)C

    .line 215
    .line 216
    .line 217
    move-result v11

    .line 218
    int-to-long v11, v11

    .line 219
    sub-long v11, v11, v17

    .line 220
    .line 221
    cmp-long v13, v11, v21

    .line 222
    .line 223
    if-ltz v13, :cond_b

    .line 224
    .line 225
    cmp-long v13, v11, v15

    .line 226
    .line 227
    if-gtz v13, :cond_b

    .line 228
    .line 229
    shl-long v13, v19, v4

    .line 230
    .line 231
    shl-long v19, v19, v6

    .line 232
    .line 233
    add-long v13, v13, v19

    .line 234
    .line 235
    add-long v19, v13, v11

    .line 236
    .line 237
    add-int/2addr v5, v6

    .line 238
    goto :goto_3

    .line 239
    :cond_b
    invoke-static {v0, v5}, LLd/f;->b(LLd/b;I)V

    .line 240
    .line 241
    .line 242
    throw v9

    .line 243
    :goto_4
    new-instance v5, Ljava/lang/Long;

    .line 244
    .line 245
    invoke-direct {v5, v0, v1}, Ljava/lang/Long;-><init>(J)V

    .line 246
    .line 247
    .line 248
    goto :goto_5

    .line 249
    :cond_c
    new-instance v1, Ljava/lang/NumberFormatException;

    .line 250
    .line 251
    new-instance v2, Ljava/lang/StringBuilder;

    .line 252
    .line 253
    invoke-direct {v2, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 257
    .line 258
    .line 259
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 260
    .line 261
    .line 262
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    invoke-direct {v1, v0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    .line 267
    .line 268
    .line 269
    throw v1

    .line 270
    :cond_d
    const-wide/16 v21, 0x0

    .line 271
    .line 272
    move-object v5, v9

    .line 273
    :goto_5
    if-nez v5, :cond_f

    .line 274
    .line 275
    iput-object v3, v7, LKd/l;->a:Ljava/lang/Object;

    .line 276
    .line 277
    iput v6, v7, LKd/l;->f:I

    .line 278
    .line 279
    new-instance v0, Lio/ktor/utils/io/q;

    .line 280
    .line 281
    move-object/from16 v2, p0

    .line 282
    .line 283
    move-object/from16 v1, p1

    .line 284
    .line 285
    move-wide/from16 v4, p4

    .line 286
    .line 287
    invoke-direct/range {v0 .. v5}, Lio/ktor/utils/io/q;-><init>(Lio/ktor/utils/io/t;LQf/a;Lio/ktor/utils/io/J;J)V

    .line 288
    .line 289
    .line 290
    invoke-virtual {v0, v6, v7}, Lio/ktor/utils/io/q;->d(ZLlf/c;)Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    move-result-object v0

    .line 294
    if-ne v0, v8, :cond_e

    .line 295
    .line 296
    goto/16 :goto_e

    .line 297
    .line 298
    :cond_e
    move-object v1, v3

    .line 299
    :goto_6
    check-cast v0, Ljava/lang/Number;

    .line 300
    .line 301
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 302
    .line 303
    .line 304
    move-result-wide v2

    .line 305
    move-wide/from16 v25, v2

    .line 306
    .line 307
    move-object v3, v1

    .line 308
    move-wide/from16 v1, v25

    .line 309
    .line 310
    goto/16 :goto_d

    .line 311
    .line 312
    :cond_f
    move-object/from16 v6, p1

    .line 313
    .line 314
    move-wide/from16 v0, p4

    .line 315
    .line 316
    cmp-long v11, v21, v0

    .line 317
    .line 318
    if-ltz v11, :cond_10

    .line 319
    .line 320
    move-wide v11, v0

    .line 321
    goto :goto_a

    .line 322
    :cond_10
    const-wide/16 v11, 0x1

    .line 323
    .line 324
    rem-long v13, v0, v11

    .line 325
    .line 326
    cmp-long v15, v13, v21

    .line 327
    .line 328
    if-ltz v15, :cond_11

    .line 329
    .line 330
    goto :goto_7

    .line 331
    :cond_11
    add-long/2addr v13, v11

    .line 332
    :goto_7
    rem-long v15, v21, v11

    .line 333
    .line 334
    cmp-long v17, v15, v21

    .line 335
    .line 336
    if-ltz v17, :cond_12

    .line 337
    .line 338
    goto :goto_8

    .line 339
    :cond_12
    add-long/2addr v15, v11

    .line 340
    :goto_8
    sub-long/2addr v13, v15

    .line 341
    rem-long/2addr v13, v11

    .line 342
    cmp-long v15, v13, v21

    .line 343
    .line 344
    if-ltz v15, :cond_13

    .line 345
    .line 346
    goto :goto_9

    .line 347
    :cond_13
    add-long/2addr v13, v11

    .line 348
    :goto_9
    sub-long v11, v0, v13

    .line 349
    .line 350
    :goto_a
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 351
    .line 352
    .line 353
    move-result-wide v13

    .line 354
    cmp-long v15, v21, v13

    .line 355
    .line 356
    if-gtz v15, :cond_17

    .line 357
    .line 358
    cmp-long v11, v13, v11

    .line 359
    .line 360
    if-gtz v11, :cond_17

    .line 361
    .line 362
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 363
    .line 364
    .line 365
    move-result-wide v0

    .line 366
    move-object/from16 v5, p0

    .line 367
    .line 368
    iput-object v5, v7, LKd/l;->a:Ljava/lang/Object;

    .line 369
    .line 370
    iput-object v6, v7, LKd/l;->b:Lio/ktor/utils/io/t;

    .line 371
    .line 372
    iput-object v3, v7, LKd/l;->c:Lio/ktor/utils/io/J;

    .line 373
    .line 374
    iput v2, v7, LKd/l;->f:I

    .line 375
    .line 376
    invoke-static {v6, v3, v0, v1, v7}, Lio/ktor/utils/io/N;->e(Lio/ktor/utils/io/t;Lio/ktor/utils/io/J;JLlf/c;)Ljava/lang/Object;

    .line 377
    .line 378
    .line 379
    move-result-object v0

    .line 380
    if-ne v0, v8, :cond_14

    .line 381
    .line 382
    goto :goto_e

    .line 383
    :cond_14
    move-object v1, v3

    .line 384
    move-object v3, v5

    .line 385
    move-object v2, v6

    .line 386
    :goto_b
    check-cast v0, Ljava/lang/Number;

    .line 387
    .line 388
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 389
    .line 390
    .line 391
    move-result-wide v5

    .line 392
    iput-object v1, v7, LKd/l;->a:Ljava/lang/Object;

    .line 393
    .line 394
    iput-object v9, v7, LKd/l;->b:Lio/ktor/utils/io/t;

    .line 395
    .line 396
    iput-object v9, v7, LKd/l;->c:Lio/ktor/utils/io/J;

    .line 397
    .line 398
    iput-wide v5, v7, LKd/l;->d:J

    .line 399
    .line 400
    iput v4, v7, LKd/l;->f:I

    .line 401
    .line 402
    invoke-static {v2, v3, v7}, LKd/o;->d(Lio/ktor/utils/io/t;LQf/a;Llf/c;)Ljava/lang/Object;

    .line 403
    .line 404
    .line 405
    move-result-object v0

    .line 406
    if-ne v0, v8, :cond_15

    .line 407
    .line 408
    goto :goto_e

    .line 409
    :cond_15
    move-object v3, v1

    .line 410
    move-wide v1, v5

    .line 411
    :goto_c
    check-cast v0, Ljava/lang/Number;

    .line 412
    .line 413
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 414
    .line 415
    .line 416
    move-result-wide v4

    .line 417
    add-long/2addr v4, v1

    .line 418
    move-wide v1, v4

    .line 419
    :goto_d
    iput-object v9, v7, LKd/l;->a:Ljava/lang/Object;

    .line 420
    .line 421
    iput-wide v1, v7, LKd/l;->d:J

    .line 422
    .line 423
    iput v10, v7, LKd/l;->f:I

    .line 424
    .line 425
    invoke-interface {v3, v7}, Lio/ktor/utils/io/J;->e(Llf/c;)Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    move-result-object v0

    .line 429
    if-ne v0, v8, :cond_16

    .line 430
    .line 431
    :goto_e
    return-object v8

    .line 432
    :cond_16
    :goto_f
    new-instance v0, Ljava/lang/Long;

    .line 433
    .line 434
    invoke-direct {v0, v1, v2}, Ljava/lang/Long;-><init>(J)V

    .line 435
    .line 436
    .line 437
    return-object v0

    .line 438
    :cond_17
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 439
    .line 440
    .line 441
    move-result-wide v2

    .line 442
    new-instance v4, Ljava/io/IOException;

    .line 443
    .line 444
    const-string v5, "Multipart content length exceeds limit "

    .line 445
    .line 446
    const-string v6, " > "

    .line 447
    .line 448
    invoke-static {v2, v3, v5, v6}, LVa/M6;->u(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 449
    .line 450
    .line 451
    move-result-object v2

    .line 452
    const-string v3, "; limit is defined using \'formFieldLimit\' argument"

    .line 453
    .line 454
    invoke-static {v2, v0, v1, v3}, LVa/M6;->s(Ljava/lang/StringBuilder;JLjava/lang/String;)Ljava/lang/String;

    .line 455
    .line 456
    .line 457
    move-result-object v0

    .line 458
    invoke-direct {v4, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 459
    .line 460
    .line 461
    throw v4
.end method

.method public static final b(Lio/ktor/utils/io/X;Llf/c;)Ljava/lang/Object;
    .locals 9

    .line 1
    const/4 v0, 0x1

    .line 2
    instance-of v1, p1, LKd/m;

    .line 3
    .line 4
    if-eqz v1, :cond_0

    .line 5
    .line 6
    move-object v1, p1

    .line 7
    check-cast v1, LKd/m;

    .line 8
    .line 9
    iget v2, v1, LKd/m;->c:I

    .line 10
    .line 11
    const/high16 v3, -0x80000000

    .line 12
    .line 13
    and-int v4, v2, v3

    .line 14
    .line 15
    if-eqz v4, :cond_0

    .line 16
    .line 17
    sub-int/2addr v2, v3

    .line 18
    iput v2, v1, LKd/m;->c:I

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    new-instance v1, LKd/m;

    .line 22
    .line 23
    invoke-direct {v1, p1}, Llf/c;-><init>(Ljf/c;)V

    .line 24
    .line 25
    .line 26
    :goto_0
    iget-object p1, v1, LKd/m;->b:Ljava/lang/Object;

    .line 27
    .line 28
    sget-object v2, Lkf/a;->a:Lkf/a;

    .line 29
    .line 30
    iget v3, v1, LKd/m;->c:I

    .line 31
    .line 32
    const/4 v4, 0x0

    .line 33
    if-eqz v3, :cond_2

    .line 34
    .line 35
    if-ne v3, v0, :cond_1

    .line 36
    .line 37
    iget-object p0, v1, LKd/m;->a:LLd/c;

    .line 38
    .line 39
    :try_start_0
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :catchall_0
    move-exception p1

    .line 44
    goto :goto_3

    .line 45
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 46
    .line 47
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw p0

    .line 53
    :cond_2
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    new-instance p1, LLd/c;

    .line 57
    .line 58
    invoke-direct {p1}, LLd/c;-><init>()V

    .line 59
    .line 60
    .line 61
    :try_start_1
    iput-object p1, v1, LKd/m;->a:LLd/c;

    .line 62
    .line 63
    iput v0, v1, LKd/m;->c:I

    .line 64
    .line 65
    sget-object v3, LKd/h;->a:Ljava/util/Set;

    .line 66
    .line 67
    new-instance v3, LD9/n;

    .line 68
    .line 69
    const/4 v5, 0x2

    .line 70
    invoke-direct {v3, v5}, LD9/n;-><init>(I)V

    .line 71
    .line 72
    .line 73
    iput v4, v3, LD9/n;->b:I

    .line 74
    .line 75
    iput v4, v3, LD9/n;->c:I

    .line 76
    .line 77
    invoke-static {p0, p1, v3, v1}, LKd/h;->c(Lio/ktor/utils/io/X;LLd/c;LD9/n;Llf/c;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 81
    if-ne p0, v2, :cond_3

    .line 82
    .line 83
    return-object v2

    .line 84
    :cond_3
    move-object v8, p1

    .line 85
    move-object p1, p0

    .line 86
    move-object p0, v8

    .line 87
    :goto_1
    :try_start_2
    check-cast p1, LKd/d;

    .line 88
    .line 89
    if-eqz p1, :cond_4

    .line 90
    .line 91
    return-object p1

    .line 92
    :cond_4
    new-instance p1, Ljava/io/EOFException;

    .line 93
    .line 94
    const-string v1, "Failed to parse multipart headers: unexpected end of stream"

    .line 95
    .line 96
    invoke-direct {p1, v1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 100
    :goto_2
    move-object v8, p1

    .line 101
    move-object p1, p0

    .line 102
    move-object p0, v8

    .line 103
    goto :goto_3

    .line 104
    :catchall_1
    move-exception p0

    .line 105
    goto :goto_2

    .line 106
    :goto_3
    iget-object v1, p0, LLd/c;->b:Ljava/util/ArrayList;

    .line 107
    .line 108
    const/4 v2, 0x0

    .line 109
    iget-object v3, p0, LLd/c;->a:LWd/d;

    .line 110
    .line 111
    if-eqz v1, :cond_5

    .line 112
    .line 113
    iput-object v2, p0, LLd/c;->c:[C

    .line 114
    .line 115
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 116
    .line 117
    .line 118
    move-result v5

    .line 119
    move v6, v4

    .line 120
    :goto_4
    if-ge v6, v5, :cond_7

    .line 121
    .line 122
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v7

    .line 126
    invoke-interface {v3, v7}, LWd/d;->S(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    add-int/2addr v6, v0

    .line 130
    goto :goto_4

    .line 131
    :cond_5
    iget-object v1, p0, LLd/c;->c:[C

    .line 132
    .line 133
    if-eqz v1, :cond_6

    .line 134
    .line 135
    invoke-interface {v3, v1}, LWd/d;->S(Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    :cond_6
    iput-object v2, p0, LLd/c;->c:[C

    .line 139
    .line 140
    :cond_7
    iput-boolean v0, p0, LLd/c;->e:Z

    .line 141
    .line 142
    iput-object v2, p0, LLd/c;->b:Ljava/util/ArrayList;

    .line 143
    .line 144
    iput-object v2, p0, LLd/c;->d:Ljava/lang/String;

    .line 145
    .line 146
    iput v4, p0, LLd/c;->g:I

    .line 147
    .line 148
    iput v4, p0, LLd/c;->f:I

    .line 149
    .line 150
    throw p1
.end method

.method public static final c(Lkotlin/jvm/internal/E;[BB)V
    .locals 2

    .line 1
    iget v0, p0, Lkotlin/jvm/internal/E;->a:I

    .line 2
    .line 3
    array-length v1, p1

    .line 4
    if-ge v0, v1, :cond_0

    .line 5
    .line 6
    add-int/lit8 v1, v0, 0x1

    .line 7
    .line 8
    iput v1, p0, Lkotlin/jvm/internal/E;->a:I

    .line 9
    .line 10
    aput-byte p2, p1, v0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    new-instance p0, Ljava/io/IOException;

    .line 14
    .line 15
    const-string p1, "Failed to parse multipart: boundary shouldn\'t be longer than 70 characters"

    .line 16
    .line 17
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw p0
.end method

.method public static final d(Lio/ktor/utils/io/t;LQf/a;Llf/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p2, LKd/n;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, LKd/n;

    .line 7
    .line 8
    iget v1, v0, LKd/n;->c:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, LKd/n;->c:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LKd/n;

    .line 21
    .line 22
    invoke-direct {v0, p2}, Llf/c;-><init>(Ljf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, LKd/n;->b:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 28
    .line 29
    iget v2, v0, LKd/n;->c:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    iget-object p1, v0, LKd/n;->a:LQf/a;

    .line 37
    .line 38
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 43
    .line 44
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p0

    .line 50
    :cond_2
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    iput-object p1, v0, LKd/n;->a:LQf/a;

    .line 54
    .line 55
    iput v3, v0, LKd/n;->c:I

    .line 56
    .line 57
    invoke-static {p0, p1, v0}, Lio/ktor/utils/io/N;->p(Lio/ktor/utils/io/t;LQf/a;Llf/c;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p2

    .line 61
    if-ne p2, v1, :cond_3

    .line 62
    .line 63
    return-object v1

    .line 64
    :cond_3
    :goto_1
    check-cast p2, Ljava/lang/Boolean;

    .line 65
    .line 66
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 67
    .line 68
    .line 69
    move-result p0

    .line 70
    if-eqz p0, :cond_4

    .line 71
    .line 72
    iget-object p0, p1, LQf/a;->a:[B

    .line 73
    .line 74
    array-length p0, p0

    .line 75
    int-to-long p0, p0

    .line 76
    goto :goto_2

    .line 77
    :cond_4
    const-wide/16 p0, 0x0

    .line 78
    .line 79
    :goto_2
    new-instance p2, Ljava/lang/Long;

    .line 80
    .line 81
    invoke-direct {p2, p0, p1}, Ljava/lang/Long;-><init>(J)V

    .line 82
    .line 83
    .line 84
    return-object p2
.end method
