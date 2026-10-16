.class public final LW1/l;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public A:J

.field public B:J

.field public C:J

.field public D:Z

.field public E:J

.field public F:J

.field public G:Z

.field public H:J

.field public I:LQ1/q;

.field public final a:LA/e0;

.field public final b:[J

.field public c:Landroid/media/AudioTrack;

.field public d:I

.field public e:LG5/v;

.field public f:I

.field public g:Z

.field public h:J

.field public i:F

.field public j:Z

.field public k:J

.field public l:J

.field public m:Ljava/lang/reflect/Method;

.field public n:J

.field public o:Z

.field public p:Z

.field public q:J

.field public r:J

.field public s:J

.field public t:J

.field public u:J

.field public v:I

.field public w:I

.field public x:J

.field public y:J

.field public z:J


# direct methods
.method public constructor <init>(LA/e0;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LW1/l;->a:LA/e0;

    .line 5
    .line 6
    :try_start_0
    const-class p1, Landroid/media/AudioTrack;

    .line 7
    .line 8
    const-string v0, "getLatency"

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-virtual {p1, v0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iput-object p1, p0, LW1/l;->m:Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    .line 17
    :catch_0
    const/16 p1, 0xa

    .line 18
    .line 19
    new-array p1, p1, [J

    .line 20
    .line 21
    iput-object p1, p0, LW1/l;->b:[J

    .line 22
    .line 23
    sget-object p1, LQ1/q;->a:LQ1/q;

    .line 24
    .line 25
    iput-object p1, p0, LW1/l;->I:LQ1/q;

    .line 26
    .line 27
    return-void
.end method


# virtual methods
.method public final a(Z)J
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object v2, v0, LW1/l;->c:Landroid/media/AudioTrack;

    .line 5
    .line 6
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v2}, Landroid/media/AudioTrack;->getPlayState()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    iget-object v3, v0, LW1/l;->a:LA/e0;

    .line 14
    .line 15
    const-wide/16 v8, 0x3e8

    .line 16
    .line 17
    iget-object v3, v3, LA/e0;->b:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v3, LW1/t;

    .line 20
    .line 21
    const/4 v10, 0x2

    .line 22
    const-wide/16 v11, 0x0

    .line 23
    .line 24
    const/4 v13, 0x0

    .line 25
    const/4 v14, 0x3

    .line 26
    if-ne v2, v14, :cond_1a

    .line 27
    .line 28
    iget-object v2, v0, LW1/l;->I:LQ1/q;

    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 34
    .line 35
    .line 36
    move-result-wide v15

    .line 37
    div-long v4, v15, v8

    .line 38
    .line 39
    iget-wide v6, v0, LW1/l;->l:J

    .line 40
    .line 41
    sub-long v6, v4, v6

    .line 42
    .line 43
    const-wide/16 v17, 0x7530

    .line 44
    .line 45
    cmp-long v2, v6, v17

    .line 46
    .line 47
    if-ltz v2, :cond_2

    .line 48
    .line 49
    invoke-virtual {v0}, LW1/l;->b()J

    .line 50
    .line 51
    .line 52
    move-result-wide v6

    .line 53
    iget v2, v0, LW1/l;->f:I

    .line 54
    .line 55
    invoke-static {v2, v6, v7}, LQ1/x;->Q(IJ)J

    .line 56
    .line 57
    .line 58
    move-result-wide v6

    .line 59
    cmp-long v2, v6, v11

    .line 60
    .line 61
    if-nez v2, :cond_0

    .line 62
    .line 63
    goto/16 :goto_b

    .line 64
    .line 65
    :cond_0
    iget v2, v0, LW1/l;->v:I

    .line 66
    .line 67
    move-wide/from16 v17, v8

    .line 68
    .line 69
    iget v8, v0, LW1/l;->i:F

    .line 70
    .line 71
    invoke-static {v6, v7, v8}, LQ1/x;->A(JF)J

    .line 72
    .line 73
    .line 74
    move-result-wide v6

    .line 75
    sub-long/2addr v6, v4

    .line 76
    iget-object v8, v0, LW1/l;->b:[J

    .line 77
    .line 78
    aput-wide v6, v8, v2

    .line 79
    .line 80
    iget v2, v0, LW1/l;->v:I

    .line 81
    .line 82
    add-int/2addr v2, v1

    .line 83
    const/16 v6, 0xa

    .line 84
    .line 85
    rem-int/2addr v2, v6

    .line 86
    iput v2, v0, LW1/l;->v:I

    .line 87
    .line 88
    iget v2, v0, LW1/l;->w:I

    .line 89
    .line 90
    if-ge v2, v6, :cond_1

    .line 91
    .line 92
    add-int/2addr v2, v1

    .line 93
    iput v2, v0, LW1/l;->w:I

    .line 94
    .line 95
    :cond_1
    iput-wide v4, v0, LW1/l;->l:J

    .line 96
    .line 97
    iput-wide v11, v0, LW1/l;->k:J

    .line 98
    .line 99
    move v2, v13

    .line 100
    :goto_0
    iget v6, v0, LW1/l;->w:I

    .line 101
    .line 102
    if-ge v2, v6, :cond_3

    .line 103
    .line 104
    iget-wide v11, v0, LW1/l;->k:J

    .line 105
    .line 106
    aget-wide v19, v8, v2

    .line 107
    .line 108
    int-to-long v6, v6

    .line 109
    div-long v19, v19, v6

    .line 110
    .line 111
    add-long v6, v19, v11

    .line 112
    .line 113
    iput-wide v6, v0, LW1/l;->k:J

    .line 114
    .line 115
    add-int/2addr v2, v1

    .line 116
    const-wide/16 v11, 0x0

    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_2
    move-wide/from16 v17, v8

    .line 120
    .line 121
    :cond_3
    iget-boolean v2, v0, LW1/l;->g:Z

    .line 122
    .line 123
    if-eqz v2, :cond_4

    .line 124
    .line 125
    goto/16 :goto_c

    .line 126
    .line 127
    :cond_4
    iget-object v2, v0, LW1/l;->e:LG5/v;

    .line 128
    .line 129
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    iget-object v6, v2, LG5/v;->g:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast v6, LW1/k;

    .line 135
    .line 136
    if-eqz v6, :cond_11

    .line 137
    .line 138
    iget-wide v11, v2, LG5/v;->e:J

    .line 139
    .line 140
    sub-long v11, v4, v11

    .line 141
    .line 142
    const-wide/32 v19, 0x7a120

    .line 143
    .line 144
    .line 145
    iget-wide v7, v2, LG5/v;->d:J

    .line 146
    .line 147
    cmp-long v7, v11, v7

    .line 148
    .line 149
    if-gez v7, :cond_5

    .line 150
    .line 151
    :goto_1
    move-object v1, v2

    .line 152
    goto/16 :goto_4

    .line 153
    .line 154
    :cond_5
    iput-wide v4, v2, LG5/v;->e:J

    .line 155
    .line 156
    iget-object v7, v6, LW1/k;->a:Landroid/media/AudioTrack;

    .line 157
    .line 158
    iget-object v8, v6, LW1/k;->b:Landroid/media/AudioTimestamp;

    .line 159
    .line 160
    invoke-virtual {v7, v8}, Landroid/media/AudioTrack;->getTimestamp(Landroid/media/AudioTimestamp;)Z

    .line 161
    .line 162
    .line 163
    move-result v7

    .line 164
    if-eqz v7, :cond_8

    .line 165
    .line 166
    iget-wide v11, v8, Landroid/media/AudioTimestamp;->framePosition:J

    .line 167
    .line 168
    iget-wide v14, v6, LW1/k;->d:J

    .line 169
    .line 170
    cmp-long v16, v14, v11

    .line 171
    .line 172
    if-lez v16, :cond_7

    .line 173
    .line 174
    iget-boolean v9, v6, LW1/k;->f:Z

    .line 175
    .line 176
    if-eqz v9, :cond_6

    .line 177
    .line 178
    move-object/from16 v21, v2

    .line 179
    .line 180
    iget-wide v1, v6, LW1/k;->g:J

    .line 181
    .line 182
    add-long/2addr v1, v14

    .line 183
    iput-wide v1, v6, LW1/k;->g:J

    .line 184
    .line 185
    iput-boolean v13, v6, LW1/k;->f:Z

    .line 186
    .line 187
    goto :goto_2

    .line 188
    :cond_6
    move-object/from16 v21, v2

    .line 189
    .line 190
    iget-wide v1, v6, LW1/k;->c:J

    .line 191
    .line 192
    const-wide/16 v14, 0x1

    .line 193
    .line 194
    add-long/2addr v1, v14

    .line 195
    iput-wide v1, v6, LW1/k;->c:J

    .line 196
    .line 197
    goto :goto_2

    .line 198
    :cond_7
    move-object/from16 v21, v2

    .line 199
    .line 200
    :goto_2
    iput-wide v11, v6, LW1/k;->d:J

    .line 201
    .line 202
    iget-wide v1, v6, LW1/k;->g:J

    .line 203
    .line 204
    add-long/2addr v11, v1

    .line 205
    iget-wide v1, v6, LW1/k;->c:J

    .line 206
    .line 207
    const/16 v14, 0x20

    .line 208
    .line 209
    shl-long/2addr v1, v14

    .line 210
    add-long/2addr v11, v1

    .line 211
    iput-wide v11, v6, LW1/k;->e:J

    .line 212
    .line 213
    move-object/from16 v1, v21

    .line 214
    .line 215
    goto :goto_3

    .line 216
    :cond_8
    move-object v1, v2

    .line 217
    :goto_3
    iget v2, v1, LG5/v;->b:I

    .line 218
    .line 219
    if-eqz v2, :cond_e

    .line 220
    .line 221
    const/4 v9, 0x1

    .line 222
    if-eq v2, v9, :cond_c

    .line 223
    .line 224
    if-eq v2, v10, :cond_b

    .line 225
    .line 226
    const/4 v8, 0x3

    .line 227
    if-eq v2, v8, :cond_a

    .line 228
    .line 229
    const/4 v8, 0x4

    .line 230
    if-ne v2, v8, :cond_9

    .line 231
    .line 232
    goto :goto_5

    .line 233
    :cond_9
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 234
    .line 235
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 236
    .line 237
    .line 238
    throw v1

    .line 239
    :cond_a
    if-eqz v7, :cond_12

    .line 240
    .line 241
    invoke-virtual {v1}, LG5/v;->a()V

    .line 242
    .line 243
    .line 244
    goto :goto_5

    .line 245
    :cond_b
    if-nez v7, :cond_12

    .line 246
    .line 247
    invoke-virtual {v1}, LG5/v;->a()V

    .line 248
    .line 249
    .line 250
    goto :goto_5

    .line 251
    :cond_c
    if-eqz v7, :cond_d

    .line 252
    .line 253
    iget-wide v11, v6, LW1/k;->e:J

    .line 254
    .line 255
    iget-wide v14, v1, LG5/v;->f:J

    .line 256
    .line 257
    cmp-long v2, v11, v14

    .line 258
    .line 259
    if-lez v2, :cond_12

    .line 260
    .line 261
    invoke-virtual {v1, v10}, LG5/v;->b(I)V

    .line 262
    .line 263
    .line 264
    goto :goto_5

    .line 265
    :cond_d
    invoke-virtual {v1}, LG5/v;->a()V

    .line 266
    .line 267
    .line 268
    goto :goto_5

    .line 269
    :cond_e
    if-eqz v7, :cond_10

    .line 270
    .line 271
    iget-wide v11, v8, Landroid/media/AudioTimestamp;->nanoTime:J

    .line 272
    .line 273
    div-long v11, v11, v17

    .line 274
    .line 275
    iget-wide v14, v1, LG5/v;->c:J

    .line 276
    .line 277
    cmp-long v2, v11, v14

    .line 278
    .line 279
    if-ltz v2, :cond_f

    .line 280
    .line 281
    iget-wide v11, v6, LW1/k;->e:J

    .line 282
    .line 283
    iput-wide v11, v1, LG5/v;->f:J

    .line 284
    .line 285
    const/4 v9, 0x1

    .line 286
    invoke-virtual {v1, v9}, LG5/v;->b(I)V

    .line 287
    .line 288
    .line 289
    goto :goto_5

    .line 290
    :cond_f
    :goto_4
    move v7, v13

    .line 291
    goto :goto_5

    .line 292
    :cond_10
    iget-wide v11, v1, LG5/v;->c:J

    .line 293
    .line 294
    sub-long v11, v4, v11

    .line 295
    .line 296
    cmp-long v2, v11, v19

    .line 297
    .line 298
    if-lez v2, :cond_12

    .line 299
    .line 300
    const/4 v8, 0x3

    .line 301
    invoke-virtual {v1, v8}, LG5/v;->b(I)V

    .line 302
    .line 303
    .line 304
    goto :goto_5

    .line 305
    :cond_11
    const-wide/32 v19, 0x7a120

    .line 306
    .line 307
    .line 308
    goto/16 :goto_1

    .line 309
    .line 310
    :cond_12
    :goto_5
    const-string v2, "DefaultAudioSink"

    .line 311
    .line 312
    if-nez v7, :cond_13

    .line 313
    .line 314
    const-wide/32 v21, 0x4c4b40

    .line 315
    .line 316
    .line 317
    goto/16 :goto_9

    .line 318
    .line 319
    :cond_13
    if-eqz v6, :cond_14

    .line 320
    .line 321
    iget-object v7, v6, LW1/k;->b:Landroid/media/AudioTimestamp;

    .line 322
    .line 323
    iget-wide v7, v7, Landroid/media/AudioTimestamp;->nanoTime:J

    .line 324
    .line 325
    div-long v7, v7, v17

    .line 326
    .line 327
    goto :goto_6

    .line 328
    :cond_14
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    :goto_6
    if-eqz v6, :cond_15

    .line 334
    .line 335
    iget-wide v14, v6, LW1/k;->e:J

    .line 336
    .line 337
    :goto_7
    const-wide/32 v21, 0x4c4b40

    .line 338
    .line 339
    .line 340
    goto :goto_8

    .line 341
    :cond_15
    const-wide/16 v14, -0x1

    .line 342
    .line 343
    goto :goto_7

    .line 344
    :goto_8
    invoke-virtual {v0}, LW1/l;->b()J

    .line 345
    .line 346
    .line 347
    move-result-wide v11

    .line 348
    iget v6, v0, LW1/l;->f:I

    .line 349
    .line 350
    invoke-static {v6, v11, v12}, LQ1/x;->Q(IJ)J

    .line 351
    .line 352
    .line 353
    move-result-wide v11

    .line 354
    sub-long v23, v7, v4

    .line 355
    .line 356
    invoke-static/range {v23 .. v24}, Ljava/lang/Math;->abs(J)J

    .line 357
    .line 358
    .line 359
    move-result-wide v23

    .line 360
    cmp-long v6, v23, v21

    .line 361
    .line 362
    const-string v9, ", "

    .line 363
    .line 364
    if-lez v6, :cond_16

    .line 365
    .line 366
    const-string v6, "Spurious audio timestamp (system clock mismatch): "

    .line 367
    .line 368
    invoke-static {v14, v15, v6, v9}, LVa/M6;->u(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 369
    .line 370
    .line 371
    move-result-object v6

    .line 372
    invoke-virtual {v6, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 373
    .line 374
    .line 375
    invoke-static {v6, v9, v4, v5, v9}, LVa/M6;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 376
    .line 377
    .line 378
    invoke-virtual {v6, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 379
    .line 380
    .line 381
    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 382
    .line 383
    .line 384
    invoke-virtual {v3}, LW1/t;->j()J

    .line 385
    .line 386
    .line 387
    move-result-wide v7

    .line 388
    invoke-virtual {v6, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 389
    .line 390
    .line 391
    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 392
    .line 393
    .line 394
    invoke-virtual {v3}, LW1/t;->k()J

    .line 395
    .line 396
    .line 397
    move-result-wide v7

    .line 398
    invoke-virtual {v6, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 399
    .line 400
    .line 401
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 402
    .line 403
    .line 404
    move-result-object v6

    .line 405
    invoke-static {v2, v6}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 406
    .line 407
    .line 408
    const/4 v8, 0x4

    .line 409
    invoke-virtual {v1, v8}, LG5/v;->b(I)V

    .line 410
    .line 411
    .line 412
    goto :goto_9

    .line 413
    :cond_16
    iget v6, v0, LW1/l;->f:I

    .line 414
    .line 415
    invoke-static {v6, v14, v15}, LQ1/x;->Q(IJ)J

    .line 416
    .line 417
    .line 418
    move-result-wide v23

    .line 419
    sub-long v23, v23, v11

    .line 420
    .line 421
    invoke-static/range {v23 .. v24}, Ljava/lang/Math;->abs(J)J

    .line 422
    .line 423
    .line 424
    move-result-wide v23

    .line 425
    cmp-long v6, v23, v21

    .line 426
    .line 427
    if-lez v6, :cond_17

    .line 428
    .line 429
    const-string v6, "Spurious audio timestamp (frame position mismatch): "

    .line 430
    .line 431
    invoke-static {v14, v15, v6, v9}, LVa/M6;->u(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 432
    .line 433
    .line 434
    move-result-object v6

    .line 435
    invoke-virtual {v6, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 436
    .line 437
    .line 438
    invoke-static {v6, v9, v4, v5, v9}, LVa/M6;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 439
    .line 440
    .line 441
    invoke-virtual {v6, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 442
    .line 443
    .line 444
    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 445
    .line 446
    .line 447
    invoke-virtual {v3}, LW1/t;->j()J

    .line 448
    .line 449
    .line 450
    move-result-wide v7

    .line 451
    invoke-virtual {v6, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 452
    .line 453
    .line 454
    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 455
    .line 456
    .line 457
    invoke-virtual {v3}, LW1/t;->k()J

    .line 458
    .line 459
    .line 460
    move-result-wide v7

    .line 461
    invoke-virtual {v6, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 462
    .line 463
    .line 464
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 465
    .line 466
    .line 467
    move-result-object v6

    .line 468
    invoke-static {v2, v6}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 469
    .line 470
    .line 471
    const/4 v8, 0x4

    .line 472
    invoke-virtual {v1, v8}, LG5/v;->b(I)V

    .line 473
    .line 474
    .line 475
    goto :goto_9

    .line 476
    :cond_17
    const/4 v8, 0x4

    .line 477
    iget v6, v1, LG5/v;->b:I

    .line 478
    .line 479
    if-ne v6, v8, :cond_18

    .line 480
    .line 481
    invoke-virtual {v1}, LG5/v;->a()V

    .line 482
    .line 483
    .line 484
    :cond_18
    :goto_9
    iget-boolean v1, v0, LW1/l;->p:Z

    .line 485
    .line 486
    if-eqz v1, :cond_1b

    .line 487
    .line 488
    iget-object v1, v0, LW1/l;->m:Ljava/lang/reflect/Method;

    .line 489
    .line 490
    if-eqz v1, :cond_1b

    .line 491
    .line 492
    iget-wide v6, v0, LW1/l;->q:J

    .line 493
    .line 494
    sub-long v6, v4, v6

    .line 495
    .line 496
    cmp-long v6, v6, v19

    .line 497
    .line 498
    if-ltz v6, :cond_1b

    .line 499
    .line 500
    :try_start_0
    iget-object v6, v0, LW1/l;->c:Landroid/media/AudioTrack;

    .line 501
    .line 502
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 503
    .line 504
    .line 505
    new-array v7, v13, [Ljava/lang/Object;

    .line 506
    .line 507
    invoke-virtual {v1, v6, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 508
    .line 509
    .line 510
    move-result-object v1

    .line 511
    check-cast v1, Ljava/lang/Integer;

    .line 512
    .line 513
    sget v6, LQ1/x;->a:I

    .line 514
    .line 515
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 516
    .line 517
    .line 518
    move-result v1

    .line 519
    int-to-long v6, v1

    .line 520
    mul-long v6, v6, v17

    .line 521
    .line 522
    iget-wide v8, v0, LW1/l;->h:J

    .line 523
    .line 524
    sub-long/2addr v6, v8

    .line 525
    iput-wide v6, v0, LW1/l;->n:J

    .line 526
    .line 527
    const-wide/16 v8, 0x0

    .line 528
    .line 529
    invoke-static {v6, v7, v8, v9}, Ljava/lang/Math;->max(JJ)J

    .line 530
    .line 531
    .line 532
    move-result-wide v6

    .line 533
    iput-wide v6, v0, LW1/l;->n:J

    .line 534
    .line 535
    cmp-long v1, v6, v21

    .line 536
    .line 537
    if-lez v1, :cond_19

    .line 538
    .line 539
    new-instance v1, Ljava/lang/StringBuilder;

    .line 540
    .line 541
    const-string v8, "Ignoring impossibly large audio latency: "

    .line 542
    .line 543
    invoke-direct {v1, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 544
    .line 545
    .line 546
    invoke-virtual {v1, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 547
    .line 548
    .line 549
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 550
    .line 551
    .line 552
    move-result-object v1

    .line 553
    invoke-static {v2, v1}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 554
    .line 555
    .line 556
    const-wide/16 v8, 0x0

    .line 557
    .line 558
    iput-wide v8, v0, LW1/l;->n:J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 559
    .line 560
    goto :goto_a

    .line 561
    :catch_0
    const/4 v1, 0x0

    .line 562
    iput-object v1, v0, LW1/l;->m:Ljava/lang/reflect/Method;

    .line 563
    .line 564
    :cond_19
    :goto_a
    iput-wide v4, v0, LW1/l;->q:J

    .line 565
    .line 566
    goto :goto_c

    .line 567
    :cond_1a
    :goto_b
    move-wide/from16 v17, v8

    .line 568
    .line 569
    :cond_1b
    :goto_c
    iget-object v1, v0, LW1/l;->I:LQ1/q;

    .line 570
    .line 571
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 572
    .line 573
    .line 574
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 575
    .line 576
    .line 577
    move-result-wide v1

    .line 578
    div-long v1, v1, v17

    .line 579
    .line 580
    iget-object v4, v0, LW1/l;->e:LG5/v;

    .line 581
    .line 582
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 583
    .line 584
    .line 585
    iget v5, v4, LG5/v;->b:I

    .line 586
    .line 587
    if-ne v5, v10, :cond_1c

    .line 588
    .line 589
    const/4 v13, 0x1

    .line 590
    :cond_1c
    if-eqz v13, :cond_1f

    .line 591
    .line 592
    iget-object v4, v4, LG5/v;->g:Ljava/lang/Object;

    .line 593
    .line 594
    check-cast v4, LW1/k;

    .line 595
    .line 596
    if-eqz v4, :cond_1d

    .line 597
    .line 598
    iget-wide v5, v4, LW1/k;->e:J

    .line 599
    .line 600
    goto :goto_d

    .line 601
    :cond_1d
    const-wide/16 v5, -0x1

    .line 602
    .line 603
    :goto_d
    iget v7, v0, LW1/l;->f:I

    .line 604
    .line 605
    invoke-static {v7, v5, v6}, LQ1/x;->Q(IJ)J

    .line 606
    .line 607
    .line 608
    move-result-wide v5

    .line 609
    if-eqz v4, :cond_1e

    .line 610
    .line 611
    iget-object v4, v4, LW1/k;->b:Landroid/media/AudioTimestamp;

    .line 612
    .line 613
    iget-wide v7, v4, Landroid/media/AudioTimestamp;->nanoTime:J

    .line 614
    .line 615
    div-long v7, v7, v17

    .line 616
    .line 617
    goto :goto_e

    .line 618
    :cond_1e
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    :goto_e
    sub-long v7, v1, v7

    .line 624
    .line 625
    iget v4, v0, LW1/l;->i:F

    .line 626
    .line 627
    invoke-static {v7, v8, v4}, LQ1/x;->w(JF)J

    .line 628
    .line 629
    .line 630
    move-result-wide v7

    .line 631
    add-long/2addr v7, v5

    .line 632
    goto :goto_11

    .line 633
    :cond_1f
    iget v4, v0, LW1/l;->w:I

    .line 634
    .line 635
    if-nez v4, :cond_20

    .line 636
    .line 637
    invoke-virtual {v0}, LW1/l;->b()J

    .line 638
    .line 639
    .line 640
    move-result-wide v4

    .line 641
    iget v6, v0, LW1/l;->f:I

    .line 642
    .line 643
    invoke-static {v6, v4, v5}, LQ1/x;->Q(IJ)J

    .line 644
    .line 645
    .line 646
    move-result-wide v4

    .line 647
    :goto_f
    move-wide v7, v4

    .line 648
    goto :goto_10

    .line 649
    :cond_20
    iget-wide v4, v0, LW1/l;->k:J

    .line 650
    .line 651
    add-long/2addr v4, v1

    .line 652
    iget v6, v0, LW1/l;->i:F

    .line 653
    .line 654
    invoke-static {v4, v5, v6}, LQ1/x;->w(JF)J

    .line 655
    .line 656
    .line 657
    move-result-wide v4

    .line 658
    goto :goto_f

    .line 659
    :goto_10
    if-nez p1, :cond_21

    .line 660
    .line 661
    iget-wide v4, v0, LW1/l;->n:J

    .line 662
    .line 663
    sub-long/2addr v7, v4

    .line 664
    const-wide/16 v4, 0x0

    .line 665
    .line 666
    invoke-static {v4, v5, v7, v8}, Ljava/lang/Math;->max(JJ)J

    .line 667
    .line 668
    .line 669
    move-result-wide v7

    .line 670
    :cond_21
    :goto_11
    iget-boolean v4, v0, LW1/l;->D:Z

    .line 671
    .line 672
    if-eq v4, v13, :cond_22

    .line 673
    .line 674
    iget-wide v4, v0, LW1/l;->C:J

    .line 675
    .line 676
    iput-wide v4, v0, LW1/l;->F:J

    .line 677
    .line 678
    iget-wide v4, v0, LW1/l;->B:J

    .line 679
    .line 680
    iput-wide v4, v0, LW1/l;->E:J

    .line 681
    .line 682
    :cond_22
    iget-wide v4, v0, LW1/l;->F:J

    .line 683
    .line 684
    sub-long v4, v1, v4

    .line 685
    .line 686
    const-wide/32 v9, 0xf4240

    .line 687
    .line 688
    .line 689
    cmp-long v6, v4, v9

    .line 690
    .line 691
    if-gez v6, :cond_23

    .line 692
    .line 693
    iget-wide v11, v0, LW1/l;->E:J

    .line 694
    .line 695
    iget v6, v0, LW1/l;->i:F

    .line 696
    .line 697
    invoke-static {v4, v5, v6}, LQ1/x;->w(JF)J

    .line 698
    .line 699
    .line 700
    move-result-wide v14

    .line 701
    add-long/2addr v14, v11

    .line 702
    mul-long v4, v4, v17

    .line 703
    .line 704
    div-long/2addr v4, v9

    .line 705
    mul-long/2addr v7, v4

    .line 706
    sub-long v4, v17, v4

    .line 707
    .line 708
    mul-long/2addr v4, v14

    .line 709
    add-long/2addr v4, v7

    .line 710
    div-long v7, v4, v17

    .line 711
    .line 712
    :cond_23
    iget-boolean v4, v0, LW1/l;->j:Z

    .line 713
    .line 714
    if-nez v4, :cond_24

    .line 715
    .line 716
    iget-wide v4, v0, LW1/l;->B:J

    .line 717
    .line 718
    cmp-long v6, v7, v4

    .line 719
    .line 720
    if-lez v6, :cond_24

    .line 721
    .line 722
    const/4 v9, 0x1

    .line 723
    iput-boolean v9, v0, LW1/l;->j:Z

    .line 724
    .line 725
    sub-long v4, v7, v4

    .line 726
    .line 727
    invoke-static {v4, v5}, LQ1/x;->W(J)J

    .line 728
    .line 729
    .line 730
    move-result-wide v4

    .line 731
    iget v6, v0, LW1/l;->i:F

    .line 732
    .line 733
    invoke-static {v4, v5, v6}, LQ1/x;->A(JF)J

    .line 734
    .line 735
    .line 736
    move-result-wide v4

    .line 737
    iget-object v6, v0, LW1/l;->I:LQ1/q;

    .line 738
    .line 739
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 740
    .line 741
    .line 742
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 743
    .line 744
    .line 745
    move-result-wide v9

    .line 746
    invoke-static {v4, v5}, LQ1/x;->W(J)J

    .line 747
    .line 748
    .line 749
    move-result-wide v4

    .line 750
    sub-long/2addr v9, v4

    .line 751
    iget-object v3, v3, LW1/t;->r:Lxa/d;

    .line 752
    .line 753
    if-eqz v3, :cond_24

    .line 754
    .line 755
    iget-object v3, v3, Lxa/d;->b:Ljava/lang/Object;

    .line 756
    .line 757
    check-cast v3, LW1/v;

    .line 758
    .line 759
    iget-object v3, v3, LW1/v;->D0:LS3/s;

    .line 760
    .line 761
    iget-object v4, v3, LS3/s;->b:Ljava/lang/Object;

    .line 762
    .line 763
    check-cast v4, Landroid/os/Handler;

    .line 764
    .line 765
    if-eqz v4, :cond_24

    .line 766
    .line 767
    new-instance v5, LW1/f;

    .line 768
    .line 769
    invoke-direct {v5, v3, v9, v10}, LW1/f;-><init>(LS3/s;J)V

    .line 770
    .line 771
    .line 772
    invoke-virtual {v4, v5}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 773
    .line 774
    .line 775
    :cond_24
    iput-wide v1, v0, LW1/l;->C:J

    .line 776
    .line 777
    iput-wide v7, v0, LW1/l;->B:J

    .line 778
    .line 779
    iput-boolean v13, v0, LW1/l;->D:Z

    .line 780
    .line 781
    return-wide v7
.end method

.method public final b()J
    .locals 11

    .line 1
    iget-object v0, p0, LW1/l;->I:LQ1/q;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    iget-wide v2, p0, LW1/l;->x:J

    .line 11
    .line 12
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    cmp-long v2, v2, v4

    .line 18
    .line 19
    const/4 v3, 0x2

    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    iget-object v2, p0, LW1/l;->c:Landroid/media/AudioTrack;

    .line 23
    .line 24
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2}, Landroid/media/AudioTrack;->getPlayState()I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-ne v2, v3, :cond_0

    .line 32
    .line 33
    iget-wide v0, p0, LW1/l;->z:J

    .line 34
    .line 35
    return-wide v0

    .line 36
    :cond_0
    invoke-static {v0, v1}, LQ1/x;->K(J)J

    .line 37
    .line 38
    .line 39
    move-result-wide v0

    .line 40
    iget-wide v2, p0, LW1/l;->x:J

    .line 41
    .line 42
    sub-long/2addr v0, v2

    .line 43
    iget v2, p0, LW1/l;->i:F

    .line 44
    .line 45
    invoke-static {v0, v1, v2}, LQ1/x;->w(JF)J

    .line 46
    .line 47
    .line 48
    move-result-wide v3

    .line 49
    iget v0, p0, LW1/l;->f:I

    .line 50
    .line 51
    int-to-long v5, v0

    .line 52
    const-wide/32 v7, 0xf4240

    .line 53
    .line 54
    .line 55
    sget-object v9, Ljava/math/RoundingMode;->UP:Ljava/math/RoundingMode;

    .line 56
    .line 57
    invoke-static/range {v3 .. v9}, LQ1/x;->S(JJJLjava/math/RoundingMode;)J

    .line 58
    .line 59
    .line 60
    move-result-wide v0

    .line 61
    iget-wide v2, p0, LW1/l;->A:J

    .line 62
    .line 63
    iget-wide v4, p0, LW1/l;->z:J

    .line 64
    .line 65
    add-long/2addr v4, v0

    .line 66
    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->min(JJ)J

    .line 67
    .line 68
    .line 69
    move-result-wide v0

    .line 70
    return-wide v0

    .line 71
    :cond_1
    iget-wide v6, p0, LW1/l;->r:J

    .line 72
    .line 73
    sub-long v6, v0, v6

    .line 74
    .line 75
    const-wide/16 v8, 0x5

    .line 76
    .line 77
    cmp-long v2, v6, v8

    .line 78
    .line 79
    if-ltz v2, :cond_a

    .line 80
    .line 81
    iget-object v2, p0, LW1/l;->c:Landroid/media/AudioTrack;

    .line 82
    .line 83
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v2}, Landroid/media/AudioTrack;->getPlayState()I

    .line 87
    .line 88
    .line 89
    move-result v6

    .line 90
    const/4 v7, 0x1

    .line 91
    if-ne v6, v7, :cond_2

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_2
    invoke-virtual {v2}, Landroid/media/AudioTrack;->getPlaybackHeadPosition()I

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    int-to-long v7, v2

    .line 99
    const-wide v9, 0xffffffffL

    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    and-long/2addr v7, v9

    .line 105
    iget-boolean v2, p0, LW1/l;->g:Z

    .line 106
    .line 107
    const-wide/16 v9, 0x0

    .line 108
    .line 109
    if-eqz v2, :cond_4

    .line 110
    .line 111
    if-ne v6, v3, :cond_3

    .line 112
    .line 113
    cmp-long v2, v7, v9

    .line 114
    .line 115
    if-nez v2, :cond_3

    .line 116
    .line 117
    iget-wide v2, p0, LW1/l;->s:J

    .line 118
    .line 119
    iput-wide v2, p0, LW1/l;->u:J

    .line 120
    .line 121
    :cond_3
    iget-wide v2, p0, LW1/l;->u:J

    .line 122
    .line 123
    add-long/2addr v7, v2

    .line 124
    :cond_4
    sget v2, LQ1/x;->a:I

    .line 125
    .line 126
    const/16 v3, 0x1d

    .line 127
    .line 128
    if-gt v2, v3, :cond_6

    .line 129
    .line 130
    cmp-long v2, v7, v9

    .line 131
    .line 132
    if-nez v2, :cond_5

    .line 133
    .line 134
    iget-wide v2, p0, LW1/l;->s:J

    .line 135
    .line 136
    cmp-long v2, v2, v9

    .line 137
    .line 138
    if-lez v2, :cond_5

    .line 139
    .line 140
    const/4 v2, 0x3

    .line 141
    if-ne v6, v2, :cond_5

    .line 142
    .line 143
    iget-wide v2, p0, LW1/l;->y:J

    .line 144
    .line 145
    cmp-long v2, v2, v4

    .line 146
    .line 147
    if-nez v2, :cond_9

    .line 148
    .line 149
    iput-wide v0, p0, LW1/l;->y:J

    .line 150
    .line 151
    goto :goto_1

    .line 152
    :cond_5
    iput-wide v4, p0, LW1/l;->y:J

    .line 153
    .line 154
    :cond_6
    iget-wide v2, p0, LW1/l;->s:J

    .line 155
    .line 156
    cmp-long v4, v2, v7

    .line 157
    .line 158
    if-lez v4, :cond_8

    .line 159
    .line 160
    iget-boolean v4, p0, LW1/l;->G:Z

    .line 161
    .line 162
    if-eqz v4, :cond_7

    .line 163
    .line 164
    iget-wide v4, p0, LW1/l;->H:J

    .line 165
    .line 166
    add-long/2addr v4, v2

    .line 167
    iput-wide v4, p0, LW1/l;->H:J

    .line 168
    .line 169
    const/4 v2, 0x0

    .line 170
    iput-boolean v2, p0, LW1/l;->G:Z

    .line 171
    .line 172
    goto :goto_0

    .line 173
    :cond_7
    iget-wide v2, p0, LW1/l;->t:J

    .line 174
    .line 175
    const-wide/16 v4, 0x1

    .line 176
    .line 177
    add-long/2addr v2, v4

    .line 178
    iput-wide v2, p0, LW1/l;->t:J

    .line 179
    .line 180
    :cond_8
    :goto_0
    iput-wide v7, p0, LW1/l;->s:J

    .line 181
    .line 182
    :cond_9
    :goto_1
    iput-wide v0, p0, LW1/l;->r:J

    .line 183
    .line 184
    :cond_a
    iget-wide v0, p0, LW1/l;->s:J

    .line 185
    .line 186
    iget-wide v2, p0, LW1/l;->H:J

    .line 187
    .line 188
    add-long/2addr v0, v2

    .line 189
    iget-wide v2, p0, LW1/l;->t:J

    .line 190
    .line 191
    const/16 v4, 0x20

    .line 192
    .line 193
    shl-long/2addr v2, v4

    .line 194
    add-long/2addr v0, v2

    .line 195
    return-wide v0
.end method

.method public final c(J)Z
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, LW1/l;->a(Z)J

    .line 3
    .line 4
    .line 5
    move-result-wide v1

    .line 6
    iget v3, p0, LW1/l;->f:I

    .line 7
    .line 8
    sget v4, LQ1/x;->a:I

    .line 9
    .line 10
    int-to-long v3, v3

    .line 11
    const-wide/32 v5, 0xf4240

    .line 12
    .line 13
    .line 14
    sget-object v7, Ljava/math/RoundingMode;->UP:Ljava/math/RoundingMode;

    .line 15
    .line 16
    invoke-static/range {v1 .. v7}, LQ1/x;->S(JJJLjava/math/RoundingMode;)J

    .line 17
    .line 18
    .line 19
    move-result-wide v1

    .line 20
    cmp-long p1, p1, v1

    .line 21
    .line 22
    if-gtz p1, :cond_1

    .line 23
    .line 24
    iget-boolean p1, p0, LW1/l;->g:Z

    .line 25
    .line 26
    if-eqz p1, :cond_0

    .line 27
    .line 28
    iget-object p1, p0, LW1/l;->c:Landroid/media/AudioTrack;

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Landroid/media/AudioTrack;->getPlayState()I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    const/4 p2, 0x2

    .line 38
    if-ne p1, p2, :cond_0

    .line 39
    .line 40
    invoke-virtual {p0}, LW1/l;->b()J

    .line 41
    .line 42
    .line 43
    move-result-wide p1

    .line 44
    const-wide/16 v1, 0x0

    .line 45
    .line 46
    cmp-long p1, p1, v1

    .line 47
    .line 48
    if-nez p1, :cond_0

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    return v0

    .line 52
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 53
    return p1
.end method

.method public final d()V
    .locals 3

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    iput-wide v0, p0, LW1/l;->k:J

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iput v2, p0, LW1/l;->w:I

    .line 7
    .line 8
    iput v2, p0, LW1/l;->v:I

    .line 9
    .line 10
    iput-wide v0, p0, LW1/l;->l:J

    .line 11
    .line 12
    iput-wide v0, p0, LW1/l;->C:J

    .line 13
    .line 14
    iput-wide v0, p0, LW1/l;->F:J

    .line 15
    .line 16
    iput-boolean v2, p0, LW1/l;->j:Z

    .line 17
    .line 18
    return-void
.end method
