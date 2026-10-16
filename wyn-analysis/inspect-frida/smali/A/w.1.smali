.class public final LA/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LA/v;


# instance fields
.field public final a:F

.field public final b:LA/E;


# direct methods
.method public constructor <init>(FF)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p2, p0, LA/w;->a:F

    .line 5
    .line 6
    new-instance p2, LA/E;

    .line 7
    .line 8
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    const/high16 v0, 0x3f800000    # 1.0f

    .line 12
    .line 13
    iput v0, p2, LA/E;->a:F

    .line 14
    .line 15
    const-wide/high16 v0, 0x4049000000000000L    # 50.0

    .line 16
    .line 17
    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    iput-wide v0, p2, LA/E;->b:D

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    iput-boolean v2, p2, LA/E;->c:Z

    .line 25
    .line 26
    mul-double/2addr v0, v0

    .line 27
    double-to-float v0, v0

    .line 28
    const/4 v1, 0x0

    .line 29
    cmpg-float v0, v0, v1

    .line 30
    .line 31
    if-lez v0, :cond_0

    .line 32
    .line 33
    float-to-double v0, p1

    .line 34
    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    .line 35
    .line 36
    .line 37
    move-result-wide v0

    .line 38
    iput-wide v0, p2, LA/E;->b:D

    .line 39
    .line 40
    iput-boolean v2, p2, LA/E;->c:Z

    .line 41
    .line 42
    iput-object p2, p0, LA/w;->b:LA/E;

    .line 43
    .line 44
    return-void

    .line 45
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 46
    .line 47
    const-string p2, "Spring stiffness constant must be positive."

    .line 48
    .line 49
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw p1
.end method


# virtual methods
.method public final c(FFF)F
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
.end method

.method public final d(JFFF)F
    .locals 2

    .line 1
    const-wide/32 v0, 0xf4240

    .line 2
    .line 3
    .line 4
    div-long/2addr p1, v0

    .line 5
    iget-object v0, p0, LA/w;->b:LA/E;

    .line 6
    .line 7
    iput p4, v0, LA/E;->a:F

    .line 8
    .line 9
    invoke-virtual {v0, p3, p5, p1, p2}, LA/E;->a(FFJ)J

    .line 10
    .line 11
    .line 12
    move-result-wide p1

    .line 13
    const/16 p3, 0x20

    .line 14
    .line 15
    shr-long/2addr p1, p3

    .line 16
    long-to-int p1, p1

    .line 17
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1
.end method

.method public final j(JFFF)F
    .locals 2

    .line 1
    const-wide/32 v0, 0xf4240

    .line 2
    .line 3
    .line 4
    div-long/2addr p1, v0

    .line 5
    iget-object v0, p0, LA/w;->b:LA/E;

    .line 6
    .line 7
    iput p4, v0, LA/E;->a:F

    .line 8
    .line 9
    invoke-virtual {v0, p3, p5, p1, p2}, LA/E;->a(FFJ)J

    .line 10
    .line 11
    .line 12
    move-result-wide p1

    .line 13
    const-wide p3, 0xffffffffL

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    and-long/2addr p1, p3

    .line 19
    long-to-int p1, p1

    .line 20
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    return p1
.end method

.method public final k(FFF)J
    .locals 34

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, LA/w;->b:LA/E;

    .line 4
    .line 5
    iget-wide v1, v1, LA/E;->b:D

    .line 6
    .line 7
    mul-double/2addr v1, v1

    .line 8
    double-to-float v1, v1

    .line 9
    sub-float v2, p1, p2

    .line 10
    .line 11
    iget v3, v0, LA/w;->a:F

    .line 12
    .line 13
    div-float/2addr v2, v3

    .line 14
    div-float v3, p3, v3

    .line 15
    .line 16
    float-to-double v4, v1

    .line 17
    const/high16 v1, 0x3f800000    # 1.0f

    .line 18
    .line 19
    float-to-double v6, v1

    .line 20
    float-to-double v8, v3

    .line 21
    float-to-double v1, v2

    .line 22
    const-wide/high16 v10, 0x4000000000000000L    # 2.0

    .line 23
    .line 24
    mul-double v12, v6, v10

    .line 25
    .line 26
    invoke-static {v4, v5}, Ljava/lang/Math;->sqrt(D)D

    .line 27
    .line 28
    .line 29
    move-result-wide v14

    .line 30
    mul-double/2addr v14, v12

    .line 31
    neg-double v12, v14

    .line 32
    mul-double/2addr v14, v14

    .line 33
    const-wide/high16 v16, 0x4010000000000000L    # 4.0

    .line 34
    .line 35
    mul-double v16, v16, v4

    .line 36
    .line 37
    sub-double v14, v14, v16

    .line 38
    .line 39
    const-wide/16 v3, 0x0

    .line 40
    .line 41
    cmpg-double v5, v14, v3

    .line 42
    .line 43
    if-gez v5, :cond_0

    .line 44
    .line 45
    move-wide/from16 p1, v10

    .line 46
    .line 47
    new-instance v10, LA/p;

    .line 48
    .line 49
    invoke-static {v14, v15}, Ljava/lang/Math;->abs(D)D

    .line 50
    .line 51
    .line 52
    move-result-wide v16

    .line 53
    move-wide/from16 v18, v1

    .line 54
    .line 55
    invoke-static/range {v16 .. v17}, Ljava/lang/Math;->sqrt(D)D

    .line 56
    .line 57
    .line 58
    move-result-wide v0

    .line 59
    invoke-direct {v10, v3, v4, v0, v1}, LA/p;-><init>(DD)V

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_0
    move-wide/from16 v18, v1

    .line 64
    .line 65
    move-wide/from16 p1, v10

    .line 66
    .line 67
    new-instance v10, LA/p;

    .line 68
    .line 69
    invoke-static {v14, v15}, Ljava/lang/Math;->sqrt(D)D

    .line 70
    .line 71
    .line 72
    move-result-wide v0

    .line 73
    invoke-direct {v10, v0, v1, v3, v4}, LA/p;-><init>(DD)V

    .line 74
    .line 75
    .line 76
    :goto_0
    iget-wide v0, v10, LA/p;->a:D

    .line 77
    .line 78
    add-double/2addr v0, v12

    .line 79
    div-double v0, v0, p1

    .line 80
    .line 81
    iput-wide v0, v10, LA/p;->a:D

    .line 82
    .line 83
    iget-wide v0, v10, LA/p;->b:D

    .line 84
    .line 85
    div-double v0, v0, p1

    .line 86
    .line 87
    iput-wide v0, v10, LA/p;->b:D

    .line 88
    .line 89
    if-gez v5, :cond_1

    .line 90
    .line 91
    new-instance v0, LA/p;

    .line 92
    .line 93
    invoke-static {v14, v15}, Ljava/lang/Math;->abs(D)D

    .line 94
    .line 95
    .line 96
    move-result-wide v1

    .line 97
    invoke-static {v1, v2}, Ljava/lang/Math;->sqrt(D)D

    .line 98
    .line 99
    .line 100
    move-result-wide v1

    .line 101
    invoke-direct {v0, v3, v4, v1, v2}, LA/p;-><init>(DD)V

    .line 102
    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_1
    new-instance v0, LA/p;

    .line 106
    .line 107
    invoke-static {v14, v15}, Ljava/lang/Math;->sqrt(D)D

    .line 108
    .line 109
    .line 110
    move-result-wide v1

    .line 111
    invoke-direct {v0, v1, v2, v3, v4}, LA/p;-><init>(DD)V

    .line 112
    .line 113
    .line 114
    :goto_1
    iget-wide v1, v0, LA/p;->a:D

    .line 115
    .line 116
    const/4 v5, -0x1

    .line 117
    int-to-double v14, v5

    .line 118
    mul-double/2addr v1, v14

    .line 119
    move-wide/from16 v16, v3

    .line 120
    .line 121
    iget-wide v3, v0, LA/p;->b:D

    .line 122
    .line 123
    mul-double/2addr v3, v14

    .line 124
    add-double/2addr v1, v12

    .line 125
    div-double v1, v1, p1

    .line 126
    .line 127
    iput-wide v1, v0, LA/p;->a:D

    .line 128
    .line 129
    div-double v3, v3, p1

    .line 130
    .line 131
    iput-wide v3, v0, LA/p;->b:D

    .line 132
    .line 133
    cmpg-double v1, v18, v16

    .line 134
    .line 135
    if-nez v1, :cond_2

    .line 136
    .line 137
    cmpg-double v2, v8, v16

    .line 138
    .line 139
    if-nez v2, :cond_2

    .line 140
    .line 141
    const-wide/16 v0, 0x0

    .line 142
    .line 143
    goto/16 :goto_10

    .line 144
    .line 145
    :cond_2
    if-gez v1, :cond_3

    .line 146
    .line 147
    neg-double v8, v8

    .line 148
    :cond_3
    invoke-static/range {v18 .. v19}, Ljava/lang/Math;->abs(D)D

    .line 149
    .line 150
    .line 151
    move-result-wide v21

    .line 152
    const-wide/high16 v1, 0x3ff0000000000000L    # 1.0

    .line 153
    .line 154
    cmpl-double v3, v6, v1

    .line 155
    .line 156
    if-lez v3, :cond_b

    .line 157
    .line 158
    iget-wide v1, v10, LA/p;->a:D

    .line 159
    .line 160
    const-wide v18, 0x3f50624dd2f1a9fcL    # 0.001

    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    iget-wide v11, v0, LA/p;->a:D

    .line 166
    .line 167
    mul-double v23, v1, v21

    .line 168
    .line 169
    sub-double v23, v23, v8

    .line 170
    .line 171
    sub-double v8, v1, v11

    .line 172
    .line 173
    div-double v13, v23, v8

    .line 174
    .line 175
    sub-double v24, v21, v13

    .line 176
    .line 177
    div-double v20, v6, v24

    .line 178
    .line 179
    invoke-static/range {v20 .. v21}, Ljava/lang/Math;->abs(D)D

    .line 180
    .line 181
    .line 182
    move-result-wide v20

    .line 183
    invoke-static/range {v20 .. v21}, Ljava/lang/Math;->log(D)D

    .line 184
    .line 185
    .line 186
    move-result-wide v20

    .line 187
    div-double v4, v20, v1

    .line 188
    .line 189
    div-double v20, v6, v13

    .line 190
    .line 191
    invoke-static/range {v20 .. v21}, Ljava/lang/Math;->abs(D)D

    .line 192
    .line 193
    .line 194
    move-result-wide v20

    .line 195
    invoke-static/range {v20 .. v21}, Ljava/lang/Math;->log(D)D

    .line 196
    .line 197
    .line 198
    move-result-wide v20

    .line 199
    move-wide/from16 v26, v1

    .line 200
    .line 201
    div-double v0, v20, v11

    .line 202
    .line 203
    invoke-static {v4, v5}, Ljava/lang/Double;->isInfinite(D)Z

    .line 204
    .line 205
    .line 206
    move-result v2

    .line 207
    if-nez v2, :cond_4

    .line 208
    .line 209
    invoke-static {v4, v5}, Ljava/lang/Double;->isNaN(D)Z

    .line 210
    .line 211
    .line 212
    move-result v2

    .line 213
    if-nez v2, :cond_4

    .line 214
    .line 215
    invoke-static {v0, v1}, Ljava/lang/Double;->isInfinite(D)Z

    .line 216
    .line 217
    .line 218
    move-result v2

    .line 219
    if-nez v2, :cond_5

    .line 220
    .line 221
    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    .line 222
    .line 223
    .line 224
    move-result v2

    .line 225
    if-nez v2, :cond_5

    .line 226
    .line 227
    invoke-static {v4, v5, v0, v1}, Ljava/lang/Math;->max(DD)D

    .line 228
    .line 229
    .line 230
    move-result-wide v4

    .line 231
    goto :goto_2

    .line 232
    :cond_4
    move-wide v4, v0

    .line 233
    :cond_5
    :goto_2
    mul-double v1, v24, v26

    .line 234
    .line 235
    move-wide/from16 p1, v4

    .line 236
    .line 237
    neg-double v3, v13

    .line 238
    mul-double/2addr v3, v11

    .line 239
    div-double v3, v1, v3

    .line 240
    .line 241
    invoke-static {v3, v4}, Ljava/lang/Math;->log(D)D

    .line 242
    .line 243
    .line 244
    move-result-wide v3

    .line 245
    sub-double v20, v11, v26

    .line 246
    .line 247
    div-double v3, v3, v20

    .line 248
    .line 249
    invoke-static {v3, v4}, Ljava/lang/Double;->isNaN(D)Z

    .line 250
    .line 251
    .line 252
    move-result v5

    .line 253
    if-nez v5, :cond_9

    .line 254
    .line 255
    cmpg-double v5, v3, v16

    .line 256
    .line 257
    if-gtz v5, :cond_6

    .line 258
    .line 259
    goto :goto_5

    .line 260
    :cond_6
    cmpl-double v5, v3, v16

    .line 261
    .line 262
    if-lez v5, :cond_8

    .line 263
    .line 264
    mul-double v20, v26, v3

    .line 265
    .line 266
    invoke-static/range {v20 .. v21}, Ljava/lang/Math;->exp(D)D

    .line 267
    .line 268
    .line 269
    move-result-wide v20

    .line 270
    mul-double v20, v20, v24

    .line 271
    .line 272
    mul-double/2addr v3, v11

    .line 273
    invoke-static {v3, v4}, Ljava/lang/Math;->exp(D)D

    .line 274
    .line 275
    .line 276
    move-result-wide v3

    .line 277
    mul-double/2addr v3, v13

    .line 278
    add-double v3, v3, v20

    .line 279
    .line 280
    neg-double v3, v3

    .line 281
    cmpg-double v3, v3, v6

    .line 282
    .line 283
    if-gez v3, :cond_8

    .line 284
    .line 285
    cmpl-double v1, v13, v16

    .line 286
    .line 287
    if-lez v1, :cond_7

    .line 288
    .line 289
    cmpg-double v1, v24, v16

    .line 290
    .line 291
    if-gez v1, :cond_7

    .line 292
    .line 293
    move-wide/from16 v3, v16

    .line 294
    .line 295
    goto :goto_3

    .line 296
    :cond_7
    move-wide/from16 v3, p1

    .line 297
    .line 298
    :goto_3
    neg-double v6, v6

    .line 299
    move-wide v4, v3

    .line 300
    :goto_4
    move-wide/from16 v32, v6

    .line 301
    .line 302
    goto :goto_6

    .line 303
    :cond_8
    mul-double v3, v13, v11

    .line 304
    .line 305
    mul-double/2addr v3, v11

    .line 306
    neg-double v3, v3

    .line 307
    mul-double v1, v1, v26

    .line 308
    .line 309
    div-double/2addr v3, v1

    .line 310
    invoke-static {v3, v4}, Ljava/lang/Math;->log(D)D

    .line 311
    .line 312
    .line 313
    move-result-wide v1

    .line 314
    div-double v4, v1, v8

    .line 315
    .line 316
    goto :goto_4

    .line 317
    :cond_9
    :goto_5
    neg-double v6, v6

    .line 318
    move-wide/from16 v4, p1

    .line 319
    .line 320
    goto :goto_4

    .line 321
    :goto_6
    new-instance v23, LA/D;

    .line 322
    .line 323
    move-wide/from16 v30, v11

    .line 324
    .line 325
    move-wide/from16 v28, v13

    .line 326
    .line 327
    invoke-direct/range {v23 .. v33}, LA/D;-><init>(DDDDD)V

    .line 328
    .line 329
    .line 330
    move-object/from16 v1, v23

    .line 331
    .line 332
    new-instance v23, LA/B;

    .line 333
    .line 334
    const/16 v32, 0x1

    .line 335
    .line 336
    invoke-direct/range {v23 .. v32}, LA/B;-><init>(DDDDI)V

    .line 337
    .line 338
    .line 339
    move-object/from16 v2, v23

    .line 340
    .line 341
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 342
    .line 343
    .line 344
    move-result-object v3

    .line 345
    invoke-virtual {v1, v3}, LA/D;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 346
    .line 347
    .line 348
    move-result-object v3

    .line 349
    check-cast v3, Ljava/lang/Number;

    .line 350
    .line 351
    invoke-virtual {v3}, Ljava/lang/Number;->doubleValue()D

    .line 352
    .line 353
    .line 354
    move-result-wide v6

    .line 355
    invoke-static {v6, v7}, Ljava/lang/Math;->abs(D)D

    .line 356
    .line 357
    .line 358
    move-result-wide v6

    .line 359
    const-wide v8, 0x3f1a36e2eb1c432dL    # 1.0E-4

    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    cmpg-double v3, v6, v8

    .line 365
    .line 366
    if-gez v3, :cond_a

    .line 367
    .line 368
    goto/16 :goto_f

    .line 369
    .line 370
    :cond_a
    const/4 v0, 0x0

    .line 371
    const-wide v13, 0x7fefffffffffffffL    # Double.MAX_VALUE

    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    :goto_7
    cmpl-double v3, v13, v18

    .line 377
    .line 378
    if-lez v3, :cond_14

    .line 379
    .line 380
    const/16 v3, 0x64

    .line 381
    .line 382
    if-ge v0, v3, :cond_14

    .line 383
    .line 384
    add-int/lit8 v0, v0, 0x1

    .line 385
    .line 386
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 387
    .line 388
    .line 389
    move-result-object v3

    .line 390
    invoke-virtual {v1, v3}, LA/D;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 391
    .line 392
    .line 393
    move-result-object v3

    .line 394
    check-cast v3, Ljava/lang/Number;

    .line 395
    .line 396
    invoke-virtual {v3}, Ljava/lang/Number;->doubleValue()D

    .line 397
    .line 398
    .line 399
    move-result-wide v6

    .line 400
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 401
    .line 402
    .line 403
    move-result-object v3

    .line 404
    invoke-virtual {v2, v3}, LA/B;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    move-result-object v3

    .line 408
    check-cast v3, Ljava/lang/Number;

    .line 409
    .line 410
    invoke-virtual {v3}, Ljava/lang/Number;->doubleValue()D

    .line 411
    .line 412
    .line 413
    move-result-wide v8

    .line 414
    div-double/2addr v6, v8

    .line 415
    sub-double v6, v4, v6

    .line 416
    .line 417
    sub-double/2addr v4, v6

    .line 418
    invoke-static {v4, v5}, Ljava/lang/Math;->abs(D)D

    .line 419
    .line 420
    .line 421
    move-result-wide v13

    .line 422
    move-wide v4, v6

    .line 423
    goto :goto_7

    .line 424
    :cond_b
    const-wide v18, 0x3f50624dd2f1a9fcL    # 0.001

    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    cmpg-double v1, v6, v1

    .line 430
    .line 431
    if-gez v1, :cond_c

    .line 432
    .line 433
    iget-wide v0, v10, LA/p;->a:D

    .line 434
    .line 435
    mul-double v2, v0, v21

    .line 436
    .line 437
    sub-double/2addr v8, v2

    .line 438
    iget-wide v2, v10, LA/p;->b:D

    .line 439
    .line 440
    div-double/2addr v8, v2

    .line 441
    mul-double v21, v21, v21

    .line 442
    .line 443
    mul-double/2addr v8, v8

    .line 444
    add-double v8, v8, v21

    .line 445
    .line 446
    invoke-static {v8, v9}, Ljava/lang/Math;->sqrt(D)D

    .line 447
    .line 448
    .line 449
    move-result-wide v2

    .line 450
    div-double/2addr v6, v2

    .line 451
    invoke-static {v6, v7}, Ljava/lang/Math;->log(D)D

    .line 452
    .line 453
    .line 454
    move-result-wide v2

    .line 455
    div-double v4, v2, v0

    .line 456
    .line 457
    goto/16 :goto_f

    .line 458
    .line 459
    :cond_c
    iget-wide v1, v10, LA/p;->a:D

    .line 460
    .line 461
    mul-double v3, v1, v21

    .line 462
    .line 463
    sub-double v23, v8, v3

    .line 464
    .line 465
    div-double v8, v6, v21

    .line 466
    .line 467
    invoke-static {v8, v9}, Ljava/lang/Math;->abs(D)D

    .line 468
    .line 469
    .line 470
    move-result-wide v8

    .line 471
    invoke-static {v8, v9}, Ljava/lang/Math;->log(D)D

    .line 472
    .line 473
    .line 474
    move-result-wide v8

    .line 475
    div-double/2addr v8, v1

    .line 476
    div-double v10, v6, v23

    .line 477
    .line 478
    invoke-static {v10, v11}, Ljava/lang/Math;->abs(D)D

    .line 479
    .line 480
    .line 481
    move-result-wide v10

    .line 482
    invoke-static {v10, v11}, Ljava/lang/Math;->log(D)D

    .line 483
    .line 484
    .line 485
    move-result-wide v10

    .line 486
    move-wide v12, v10

    .line 487
    const/4 v5, 0x0

    .line 488
    :goto_8
    const/4 v14, 0x6

    .line 489
    if-ge v5, v14, :cond_d

    .line 490
    .line 491
    div-double/2addr v12, v1

    .line 492
    invoke-static {v12, v13}, Ljava/lang/Math;->abs(D)D

    .line 493
    .line 494
    .line 495
    move-result-wide v12

    .line 496
    invoke-static {v12, v13}, Ljava/lang/Math;->log(D)D

    .line 497
    .line 498
    .line 499
    move-result-wide v12

    .line 500
    sub-double v12, v10, v12

    .line 501
    .line 502
    add-int/lit8 v5, v5, 0x1

    .line 503
    .line 504
    goto :goto_8

    .line 505
    :cond_d
    div-double/2addr v12, v1

    .line 506
    invoke-static {v8, v9}, Ljava/lang/Double;->isInfinite(D)Z

    .line 507
    .line 508
    .line 509
    move-result v5

    .line 510
    if-nez v5, :cond_e

    .line 511
    .line 512
    invoke-static {v8, v9}, Ljava/lang/Double;->isNaN(D)Z

    .line 513
    .line 514
    .line 515
    move-result v5

    .line 516
    if-nez v5, :cond_e

    .line 517
    .line 518
    invoke-static {v12, v13}, Ljava/lang/Double;->isInfinite(D)Z

    .line 519
    .line 520
    .line 521
    move-result v5

    .line 522
    if-nez v5, :cond_f

    .line 523
    .line 524
    invoke-static {v12, v13}, Ljava/lang/Double;->isNaN(D)Z

    .line 525
    .line 526
    .line 527
    move-result v5

    .line 528
    if-nez v5, :cond_f

    .line 529
    .line 530
    invoke-static {v8, v9, v12, v13}, Ljava/lang/Math;->max(DD)D

    .line 531
    .line 532
    .line 533
    move-result-wide v8

    .line 534
    goto :goto_9

    .line 535
    :cond_e
    move-wide v8, v12

    .line 536
    :cond_f
    :goto_9
    add-double v3, v3, v23

    .line 537
    .line 538
    neg-double v3, v3

    .line 539
    mul-double v10, v1, v23

    .line 540
    .line 541
    div-double/2addr v3, v10

    .line 542
    invoke-static {v3, v4}, Ljava/lang/Double;->isNaN(D)Z

    .line 543
    .line 544
    .line 545
    move-result v5

    .line 546
    if-nez v5, :cond_13

    .line 547
    .line 548
    cmpg-double v5, v3, v16

    .line 549
    .line 550
    if-gtz v5, :cond_10

    .line 551
    .line 552
    goto :goto_c

    .line 553
    :cond_10
    cmpl-double v5, v3, v16

    .line 554
    .line 555
    if-lez v5, :cond_12

    .line 556
    .line 557
    mul-double v10, v1, v3

    .line 558
    .line 559
    invoke-static {v10, v11}, Ljava/lang/Math;->exp(D)D

    .line 560
    .line 561
    .line 562
    move-result-wide v12

    .line 563
    mul-double v12, v12, v21

    .line 564
    .line 565
    mul-double v3, v3, v23

    .line 566
    .line 567
    invoke-static {v10, v11}, Ljava/lang/Math;->exp(D)D

    .line 568
    .line 569
    .line 570
    move-result-wide v10

    .line 571
    mul-double/2addr v10, v3

    .line 572
    add-double/2addr v10, v12

    .line 573
    neg-double v3, v10

    .line 574
    cmpg-double v3, v3, v6

    .line 575
    .line 576
    if-gez v3, :cond_12

    .line 577
    .line 578
    cmpg-double v3, v23, v16

    .line 579
    .line 580
    if-gez v3, :cond_11

    .line 581
    .line 582
    cmpl-double v3, v21, v16

    .line 583
    .line 584
    if-lez v3, :cond_11

    .line 585
    .line 586
    move-wide/from16 v3, v16

    .line 587
    .line 588
    goto :goto_a

    .line 589
    :cond_11
    move-wide v3, v8

    .line 590
    :goto_a
    neg-double v6, v6

    .line 591
    move-wide v8, v3

    .line 592
    :goto_b
    move-wide/from16 v27, v6

    .line 593
    .line 594
    goto :goto_d

    .line 595
    :cond_12
    div-double v10, p1, v1

    .line 596
    .line 597
    neg-double v3, v10

    .line 598
    div-double v8, v21, v23

    .line 599
    .line 600
    sub-double v8, v3, v8

    .line 601
    .line 602
    goto :goto_b

    .line 603
    :cond_13
    :goto_c
    neg-double v6, v6

    .line 604
    goto :goto_b

    .line 605
    :goto_d
    new-instance v20, LA/B;

    .line 606
    .line 607
    const/16 v29, 0x0

    .line 608
    .line 609
    move-wide/from16 v25, v1

    .line 610
    .line 611
    invoke-direct/range {v20 .. v29}, LA/B;-><init>(DDDDI)V

    .line 612
    .line 613
    .line 614
    move-object/from16 v3, v20

    .line 615
    .line 616
    move-wide/from16 v1, v23

    .line 617
    .line 618
    move-wide/from16 v23, v25

    .line 619
    .line 620
    new-instance v20, LA/C;

    .line 621
    .line 622
    move-wide/from16 v25, v21

    .line 623
    .line 624
    move-wide/from16 v21, v1

    .line 625
    .line 626
    invoke-direct/range {v20 .. v26}, LA/C;-><init>(DDD)V

    .line 627
    .line 628
    .line 629
    move-object/from16 v1, v20

    .line 630
    .line 631
    move-wide v4, v8

    .line 632
    const/4 v0, 0x0

    .line 633
    const-wide v13, 0x7fefffffffffffffL    # Double.MAX_VALUE

    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    :goto_e
    cmpl-double v2, v13, v18

    .line 639
    .line 640
    if-lez v2, :cond_14

    .line 641
    .line 642
    const/16 v2, 0x64

    .line 643
    .line 644
    if-ge v0, v2, :cond_14

    .line 645
    .line 646
    add-int/lit8 v0, v0, 0x1

    .line 647
    .line 648
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 649
    .line 650
    .line 651
    move-result-object v6

    .line 652
    invoke-virtual {v3, v6}, LA/B;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 653
    .line 654
    .line 655
    move-result-object v6

    .line 656
    check-cast v6, Ljava/lang/Number;

    .line 657
    .line 658
    invoke-virtual {v6}, Ljava/lang/Number;->doubleValue()D

    .line 659
    .line 660
    .line 661
    move-result-wide v6

    .line 662
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 663
    .line 664
    .line 665
    move-result-object v8

    .line 666
    invoke-virtual {v1, v8}, LA/C;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 667
    .line 668
    .line 669
    move-result-object v8

    .line 670
    check-cast v8, Ljava/lang/Number;

    .line 671
    .line 672
    invoke-virtual {v8}, Ljava/lang/Number;->doubleValue()D

    .line 673
    .line 674
    .line 675
    move-result-wide v8

    .line 676
    div-double/2addr v6, v8

    .line 677
    sub-double v6, v4, v6

    .line 678
    .line 679
    sub-double/2addr v4, v6

    .line 680
    invoke-static {v4, v5}, Ljava/lang/Math;->abs(D)D

    .line 681
    .line 682
    .line 683
    move-result-wide v13

    .line 684
    move-wide v4, v6

    .line 685
    goto :goto_e

    .line 686
    :cond_14
    :goto_f
    const-wide v0, 0x408f400000000000L    # 1000.0

    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    mul-double/2addr v4, v0

    .line 692
    double-to-long v0, v4

    .line 693
    :goto_10
    const-wide/32 v2, 0xf4240

    .line 694
    .line 695
    .line 696
    mul-long/2addr v0, v2

    .line 697
    return-wide v0
.end method

.method public final q(LS3/e;)LA/c0;
    .locals 1

    .line 1
    const-string v0, "converter"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance p1, LS3/n;

    .line 7
    .line 8
    invoke-direct {p1, p0}, LS3/n;-><init>(LA/v;)V

    .line 9
    .line 10
    .line 11
    return-object p1
.end method
