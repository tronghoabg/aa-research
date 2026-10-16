.class public final Lkc/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final f:Landroid/graphics/Matrix;


# instance fields
.field public final a:Lio/flutter/embedding/engine/renderer/k;

.field public final b:Lba/a;

.field public final c:Z

.field public final d:Ljava/util/HashMap;

.field public e:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Landroid/graphics/Matrix;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lkc/a;->f:Landroid/graphics/Matrix;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Lio/flutter/embedding/engine/renderer/k;Z)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lkc/a;->d:Ljava/util/HashMap;

    .line 10
    .line 11
    iput-object p1, p0, Lkc/a;->a:Lio/flutter/embedding/engine/renderer/k;

    .line 12
    .line 13
    sget-object p1, Lba/a;->d:Lba/a;

    .line 14
    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    new-instance p1, Lba/a;

    .line 18
    .line 19
    const/16 v0, 0xd

    .line 20
    .line 21
    invoke-direct {p1, v0}, Lba/a;-><init>(I)V

    .line 22
    .line 23
    .line 24
    sput-object p1, Lba/a;->d:Lba/a;

    .line 25
    .line 26
    :cond_0
    sget-object p1, Lba/a;->d:Lba/a;

    .line 27
    .line 28
    iput-object p1, p0, Lkc/a;->b:Lba/a;

    .line 29
    .line 30
    iput-boolean p2, p0, Lkc/a;->c:Z

    .line 31
    .line 32
    return-void
.end method

.method public static b(I)I
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    const/4 v0, 0x1

    .line 5
    const/4 v1, 0x6

    .line 6
    if-ne p0, v0, :cond_1

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_1
    const/4 v0, 0x5

    .line 10
    if-ne p0, v0, :cond_2

    .line 11
    .line 12
    :goto_0
    const/4 p0, 0x4

    .line 13
    return p0

    .line 14
    :cond_2
    if-ne p0, v1, :cond_3

    .line 15
    .line 16
    :goto_1
    return v1

    .line 17
    :cond_3
    const/4 v1, 0x2

    .line 18
    if-ne p0, v1, :cond_4

    .line 19
    .line 20
    return v0

    .line 21
    :cond_4
    const/4 v0, 0x7

    .line 22
    const/4 v1, 0x3

    .line 23
    if-ne p0, v0, :cond_5

    .line 24
    .line 25
    goto :goto_2

    .line 26
    :cond_5
    if-ne p0, v1, :cond_6

    .line 27
    .line 28
    const/4 p0, 0x0

    .line 29
    return p0

    .line 30
    :cond_6
    const/16 v0, 0x8

    .line 31
    .line 32
    if-ne p0, v0, :cond_7

    .line 33
    .line 34
    :goto_2
    return v1

    .line 35
    :cond_7
    const/4 p0, -0x1

    .line 36
    return p0
.end method


# virtual methods
.method public final a(Landroid/view/MotionEvent;IIILandroid/graphics/Matrix;Ljava/nio/ByteBuffer;Landroid/content/Context;)V
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v2, p2

    .line 4
    .line 5
    move/from16 v3, p3

    .line 6
    .line 7
    move-object/from16 v4, p6

    .line 8
    .line 9
    move-object/from16 v5, p7

    .line 10
    .line 11
    const/4 v6, 0x1

    .line 12
    const/4 v7, 0x2

    .line 13
    const/4 v9, -0x1

    .line 14
    if-ne v3, v9, :cond_0

    .line 15
    .line 16
    :goto_0
    move-object v7, v0

    .line 17
    goto/16 :goto_13

    .line 18
    .line 19
    :cond_0
    invoke-virtual/range {p1 .. p2}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 20
    .line 21
    .line 22
    move-result v10

    .line 23
    invoke-virtual/range {p1 .. p2}, Landroid/view/MotionEvent;->getToolType(I)I

    .line 24
    .line 25
    .line 26
    move-result v11

    .line 27
    const/4 v12, 0x5

    .line 28
    const/4 v13, 0x4

    .line 29
    if-eq v11, v6, :cond_3

    .line 30
    .line 31
    if-eq v11, v7, :cond_2

    .line 32
    .line 33
    const/4 v14, 0x3

    .line 34
    if-eq v11, v14, :cond_1

    .line 35
    .line 36
    if-eq v11, v13, :cond_4

    .line 37
    .line 38
    move v14, v12

    .line 39
    goto :goto_1

    .line 40
    :cond_1
    move v14, v6

    .line 41
    goto :goto_1

    .line 42
    :cond_2
    move v14, v7

    .line 43
    goto :goto_1

    .line 44
    :cond_3
    const/4 v14, 0x0

    .line 45
    :cond_4
    :goto_1
    invoke-virtual/range {p1 .. p2}, Landroid/view/MotionEvent;->getX(I)F

    .line 46
    .line 47
    .line 48
    move-result v11

    .line 49
    invoke-virtual/range {p1 .. p2}, Landroid/view/MotionEvent;->getY(I)F

    .line 50
    .line 51
    .line 52
    move-result v15

    .line 53
    const/16 v16, 0x0

    .line 54
    .line 55
    new-array v8, v7, [F

    .line 56
    .line 57
    aput v11, v8, v16

    .line 58
    .line 59
    aput v15, v8, v6

    .line 60
    .line 61
    move-object/from16 v11, p5

    .line 62
    .line 63
    invoke-virtual {v11, v8}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 64
    .line 65
    .line 66
    iget-object v11, v0, Lkc/a;->d:Ljava/util/HashMap;

    .line 67
    .line 68
    move/from16 v17, v10

    .line 69
    .line 70
    if-ne v14, v6, :cond_6

    .line 71
    .line 72
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getButtonState()I

    .line 73
    .line 74
    .line 75
    move-result v18

    .line 76
    and-int/lit8 v15, v18, 0x1f

    .line 77
    .line 78
    const-wide/16 v18, 0x0

    .line 79
    .line 80
    int-to-long v9, v15

    .line 81
    cmp-long v15, v9, v18

    .line 82
    .line 83
    if-nez v15, :cond_5

    .line 84
    .line 85
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getSource()I

    .line 86
    .line 87
    .line 88
    move-result v15

    .line 89
    move/from16 v20, v6

    .line 90
    .line 91
    const/16 v6, 0x2002

    .line 92
    .line 93
    if-ne v15, v6, :cond_8

    .line 94
    .line 95
    if-ne v3, v13, :cond_8

    .line 96
    .line 97
    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 98
    .line 99
    .line 100
    move-result-object v6

    .line 101
    invoke-virtual {v11, v6, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_5
    move/from16 v20, v6

    .line 106
    .line 107
    goto :goto_2

    .line 108
    :cond_6
    move/from16 v20, v6

    .line 109
    .line 110
    const-wide/16 v18, 0x0

    .line 111
    .line 112
    if-ne v14, v7, :cond_7

    .line 113
    .line 114
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getButtonState()I

    .line 115
    .line 116
    .line 117
    move-result v6

    .line 118
    shr-int/2addr v6, v13

    .line 119
    and-int/lit8 v6, v6, 0xf

    .line 120
    .line 121
    int-to-long v9, v6

    .line 122
    goto :goto_2

    .line 123
    :cond_7
    move-wide/from16 v9, v18

    .line 124
    .line 125
    :cond_8
    :goto_2
    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 126
    .line 127
    .line 128
    move-result-object v6

    .line 129
    invoke-virtual {v11, v6}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v6

    .line 133
    if-eqz v6, :cond_d

    .line 134
    .line 135
    if-ne v3, v13, :cond_9

    .line 136
    .line 137
    const/4 v12, 0x7

    .line 138
    :goto_3
    const/4 v13, -0x1

    .line 139
    goto :goto_5

    .line 140
    :cond_9
    if-ne v3, v12, :cond_a

    .line 141
    .line 142
    const/16 v12, 0x8

    .line 143
    .line 144
    goto :goto_3

    .line 145
    :cond_a
    const/4 v12, 0x6

    .line 146
    if-eq v3, v12, :cond_c

    .line 147
    .line 148
    if-nez v3, :cond_b

    .line 149
    .line 150
    goto :goto_4

    .line 151
    :cond_b
    const/4 v12, -0x1

    .line 152
    goto :goto_3

    .line 153
    :cond_c
    :goto_4
    const/16 v12, 0x9

    .line 154
    .line 155
    goto :goto_3

    .line 156
    :goto_5
    if-ne v12, v13, :cond_e

    .line 157
    .line 158
    goto/16 :goto_0

    .line 159
    .line 160
    :cond_d
    const/4 v13, -0x1

    .line 161
    move v12, v13

    .line 162
    :cond_e
    iget-boolean v13, v0, Lkc/a;->c:Z

    .line 163
    .line 164
    if-eqz v13, :cond_f

    .line 165
    .line 166
    iget-object v13, v0, Lkc/a;->b:Lba/a;

    .line 167
    .line 168
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 169
    .line 170
    .line 171
    sget-object v21, Lkc/A;->b:Ljava/util/concurrent/atomic/AtomicLong;

    .line 172
    .line 173
    move-object/from16 v22, v8

    .line 174
    .line 175
    invoke-virtual/range {v21 .. v21}, Ljava/util/concurrent/atomic/AtomicLong;->incrementAndGet()J

    .line 176
    .line 177
    .line 178
    move-result-wide v7

    .line 179
    new-instance v21, Lkc/A;

    .line 180
    .line 181
    invoke-static/range {p1 .. p1}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    .line 182
    .line 183
    .line 184
    move-result-object v15

    .line 185
    move/from16 v21, v6

    .line 186
    .line 187
    iget-object v6, v13, Lba/a;->b:Ljava/lang/Object;

    .line 188
    .line 189
    check-cast v6, Landroid/util/LongSparseArray;

    .line 190
    .line 191
    invoke-virtual {v6, v7, v8, v15}, Landroid/util/LongSparseArray;->put(JLjava/lang/Object;)V

    .line 192
    .line 193
    .line 194
    iget-object v6, v13, Lba/a;->c:Ljava/lang/Object;

    .line 195
    .line 196
    check-cast v6, Ljava/util/PriorityQueue;

    .line 197
    .line 198
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 199
    .line 200
    .line 201
    move-result-object v13

    .line 202
    invoke-virtual {v6, v13}, Ljava/util/PriorityQueue;->add(Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    goto :goto_6

    .line 206
    :cond_f
    move/from16 v21, v6

    .line 207
    .line 208
    move-object/from16 v22, v8

    .line 209
    .line 210
    move-wide/from16 v7, v18

    .line 211
    .line 212
    :goto_6
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 213
    .line 214
    .line 215
    move-result v6

    .line 216
    const/16 v13, 0x8

    .line 217
    .line 218
    if-ne v6, v13, :cond_10

    .line 219
    .line 220
    move/from16 v6, v20

    .line 221
    .line 222
    goto :goto_7

    .line 223
    :cond_10
    move/from16 v6, v16

    .line 224
    .line 225
    :goto_7
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getEventTime()J

    .line 226
    .line 227
    .line 228
    move-result-wide v23

    .line 229
    const-wide/16 v25, 0x3e8

    .line 230
    .line 231
    mul-long v0, v23, v25

    .line 232
    .line 233
    invoke-virtual {v4, v7, v8}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 234
    .line 235
    .line 236
    invoke-virtual {v4, v0, v1}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 237
    .line 238
    .line 239
    if-eqz v21, :cond_11

    .line 240
    .line 241
    int-to-long v0, v12

    .line 242
    invoke-virtual {v4, v0, v1}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 243
    .line 244
    .line 245
    const-wide/16 v0, 0x4

    .line 246
    .line 247
    invoke-virtual {v4, v0, v1}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 248
    .line 249
    .line 250
    goto :goto_8

    .line 251
    :cond_11
    int-to-long v0, v3

    .line 252
    invoke-virtual {v4, v0, v1}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 253
    .line 254
    .line 255
    int-to-long v0, v14

    .line 256
    invoke-virtual {v4, v0, v1}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 257
    .line 258
    .line 259
    :goto_8
    int-to-long v0, v6

    .line 260
    invoke-virtual {v4, v0, v1}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 261
    .line 262
    .line 263
    move/from16 v0, v17

    .line 264
    .line 265
    int-to-long v7, v0

    .line 266
    invoke-virtual {v4, v7, v8}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 267
    .line 268
    .line 269
    move-wide/from16 v7, v18

    .line 270
    .line 271
    invoke-virtual {v4, v7, v8}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 272
    .line 273
    .line 274
    if-eqz v21, :cond_12

    .line 275
    .line 276
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 277
    .line 278
    .line 279
    move-result-object v1

    .line 280
    invoke-virtual {v11, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object v1

    .line 284
    check-cast v1, [F

    .line 285
    .line 286
    aget v3, v1, v16

    .line 287
    .line 288
    float-to-double v7, v3

    .line 289
    invoke-virtual {v4, v7, v8}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 290
    .line 291
    .line 292
    aget v1, v1, v20

    .line 293
    .line 294
    float-to-double v7, v1

    .line 295
    invoke-virtual {v4, v7, v8}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 296
    .line 297
    .line 298
    goto :goto_9

    .line 299
    :cond_12
    aget v1, v22, v16

    .line 300
    .line 301
    float-to-double v7, v1

    .line 302
    invoke-virtual {v4, v7, v8}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 303
    .line 304
    .line 305
    aget v1, v22, v20

    .line 306
    .line 307
    float-to-double v7, v1

    .line 308
    invoke-virtual {v4, v7, v8}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 309
    .line 310
    .line 311
    :goto_9
    const-wide/16 v7, 0x0

    .line 312
    .line 313
    invoke-virtual {v4, v7, v8}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 314
    .line 315
    .line 316
    invoke-virtual {v4, v7, v8}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 317
    .line 318
    .line 319
    invoke-virtual {v4, v9, v10}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 320
    .line 321
    .line 322
    const-wide/16 v9, 0x0

    .line 323
    .line 324
    invoke-virtual {v4, v9, v10}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 325
    .line 326
    .line 327
    invoke-virtual {v4, v9, v10}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 328
    .line 329
    .line 330
    invoke-virtual/range {p1 .. p2}, Landroid/view/MotionEvent;->getPressure(I)F

    .line 331
    .line 332
    .line 333
    move-result v1

    .line 334
    float-to-double v9, v1

    .line 335
    invoke-virtual {v4, v9, v10}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 336
    .line 337
    .line 338
    invoke-virtual/range {p1 .. p1}, Landroid/view/InputEvent;->getDevice()Landroid/view/InputDevice;

    .line 339
    .line 340
    .line 341
    move-result-object v1

    .line 342
    if-eqz v1, :cond_13

    .line 343
    .line 344
    invoke-virtual/range {p1 .. p1}, Landroid/view/InputEvent;->getDevice()Landroid/view/InputDevice;

    .line 345
    .line 346
    .line 347
    move-result-object v1

    .line 348
    const/4 v3, 0x2

    .line 349
    invoke-virtual {v1, v3}, Landroid/view/InputDevice;->getMotionRange(I)Landroid/view/InputDevice$MotionRange;

    .line 350
    .line 351
    .line 352
    move-result-object v1

    .line 353
    if-eqz v1, :cond_13

    .line 354
    .line 355
    invoke-virtual {v1}, Landroid/view/InputDevice$MotionRange;->getMin()F

    .line 356
    .line 357
    .line 358
    move-result v3

    .line 359
    float-to-double v9, v3

    .line 360
    invoke-virtual {v1}, Landroid/view/InputDevice$MotionRange;->getMax()F

    .line 361
    .line 362
    .line 363
    move-result v1

    .line 364
    float-to-double v7, v1

    .line 365
    goto :goto_a

    .line 366
    :cond_13
    const-wide/high16 v7, 0x3ff0000000000000L    # 1.0

    .line 367
    .line 368
    const-wide/16 v9, 0x0

    .line 369
    .line 370
    :goto_a
    invoke-virtual {v4, v9, v10}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 371
    .line 372
    .line 373
    invoke-virtual {v4, v7, v8}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 374
    .line 375
    .line 376
    const/4 v3, 0x2

    .line 377
    if-ne v14, v3, :cond_14

    .line 378
    .line 379
    const/16 v1, 0x18

    .line 380
    .line 381
    move-object/from16 v3, p1

    .line 382
    .line 383
    invoke-virtual {v3, v1, v2}, Landroid/view/MotionEvent;->getAxisValue(II)F

    .line 384
    .line 385
    .line 386
    move-result v1

    .line 387
    float-to-double v7, v1

    .line 388
    invoke-virtual {v4, v7, v8}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 389
    .line 390
    .line 391
    const-wide/16 v7, 0x0

    .line 392
    .line 393
    invoke-virtual {v4, v7, v8}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 394
    .line 395
    .line 396
    goto :goto_b

    .line 397
    :cond_14
    move-object/from16 v3, p1

    .line 398
    .line 399
    const-wide/16 v7, 0x0

    .line 400
    .line 401
    invoke-virtual {v4, v7, v8}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 402
    .line 403
    .line 404
    invoke-virtual {v4, v7, v8}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 405
    .line 406
    .line 407
    :goto_b
    invoke-virtual/range {p1 .. p2}, Landroid/view/MotionEvent;->getSize(I)F

    .line 408
    .line 409
    .line 410
    move-result v1

    .line 411
    float-to-double v9, v1

    .line 412
    invoke-virtual {v4, v9, v10}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 413
    .line 414
    .line 415
    invoke-virtual/range {p1 .. p2}, Landroid/view/MotionEvent;->getToolMajor(I)F

    .line 416
    .line 417
    .line 418
    move-result v1

    .line 419
    float-to-double v9, v1

    .line 420
    invoke-virtual {v4, v9, v10}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 421
    .line 422
    .line 423
    invoke-virtual/range {p1 .. p2}, Landroid/view/MotionEvent;->getToolMinor(I)F

    .line 424
    .line 425
    .line 426
    move-result v1

    .line 427
    float-to-double v9, v1

    .line 428
    invoke-virtual {v4, v9, v10}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 429
    .line 430
    .line 431
    invoke-virtual {v4, v7, v8}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 432
    .line 433
    .line 434
    invoke-virtual {v4, v7, v8}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 435
    .line 436
    .line 437
    const/16 v13, 0x8

    .line 438
    .line 439
    invoke-virtual {v3, v13, v2}, Landroid/view/MotionEvent;->getAxisValue(II)F

    .line 440
    .line 441
    .line 442
    move-result v1

    .line 443
    float-to-double v9, v1

    .line 444
    invoke-virtual {v4, v9, v10}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 445
    .line 446
    .line 447
    const/4 v1, 0x2

    .line 448
    if-ne v14, v1, :cond_15

    .line 449
    .line 450
    const/16 v1, 0x19

    .line 451
    .line 452
    invoke-virtual {v3, v1, v2}, Landroid/view/MotionEvent;->getAxisValue(II)F

    .line 453
    .line 454
    .line 455
    move-result v1

    .line 456
    float-to-double v9, v1

    .line 457
    invoke-virtual {v4, v9, v10}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 458
    .line 459
    .line 460
    :goto_c
    move/from16 v1, p4

    .line 461
    .line 462
    goto :goto_d

    .line 463
    :cond_15
    invoke-virtual {v4, v7, v8}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 464
    .line 465
    .line 466
    goto :goto_c

    .line 467
    :goto_d
    int-to-long v7, v1

    .line 468
    invoke-virtual {v4, v7, v8}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 469
    .line 470
    .line 471
    move/from16 v1, v20

    .line 472
    .line 473
    if-ne v6, v1, :cond_19

    .line 474
    .line 475
    if-eqz v5, :cond_18

    .line 476
    .line 477
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 478
    .line 479
    const/16 v6, 0x1a

    .line 480
    .line 481
    if-lt v1, v6, :cond_16

    .line 482
    .line 483
    invoke-static {v5}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    .line 484
    .line 485
    .line 486
    move-result-object v7

    .line 487
    invoke-static {v7}, Lio/flutter/plugin/editing/h;->D(Landroid/view/ViewConfiguration;)F

    .line 488
    .line 489
    .line 490
    move-result v7

    .line 491
    move v8, v7

    .line 492
    move-object/from16 v7, p0

    .line 493
    .line 494
    goto :goto_e

    .line 495
    :cond_16
    move-object/from16 v7, p0

    .line 496
    .line 497
    invoke-virtual {v7, v5}, Lkc/a;->c(Landroid/content/Context;)I

    .line 498
    .line 499
    .line 500
    move-result v8

    .line 501
    int-to-float v8, v8

    .line 502
    :goto_e
    float-to-double v8, v8

    .line 503
    if-lt v1, v6, :cond_17

    .line 504
    .line 505
    invoke-static {v5}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    .line 506
    .line 507
    .line 508
    move-result-object v1

    .line 509
    invoke-static {v1}, Lio/flutter/plugin/editing/h;->a(Landroid/view/ViewConfiguration;)F

    .line 510
    .line 511
    .line 512
    move-result v1

    .line 513
    goto :goto_f

    .line 514
    :cond_17
    invoke-virtual {v7, v5}, Lkc/a;->c(Landroid/content/Context;)I

    .line 515
    .line 516
    .line 517
    move-result v1

    .line 518
    int-to-float v1, v1

    .line 519
    :goto_f
    float-to-double v5, v1

    .line 520
    goto :goto_10

    .line 521
    :cond_18
    move-object/from16 v7, p0

    .line 522
    .line 523
    const-wide/high16 v8, 0x4048000000000000L    # 48.0

    .line 524
    .line 525
    move-wide v5, v8

    .line 526
    :goto_10
    const/16 v1, 0xa

    .line 527
    .line 528
    invoke-virtual {v3, v1, v2}, Landroid/view/MotionEvent;->getAxisValue(II)F

    .line 529
    .line 530
    .line 531
    move-result v1

    .line 532
    neg-float v1, v1

    .line 533
    float-to-double v13, v1

    .line 534
    mul-double/2addr v8, v13

    .line 535
    const/16 v1, 0x9

    .line 536
    .line 537
    invoke-virtual {v3, v1, v2}, Landroid/view/MotionEvent;->getAxisValue(II)F

    .line 538
    .line 539
    .line 540
    move-result v2

    .line 541
    neg-float v1, v2

    .line 542
    float-to-double v1, v1

    .line 543
    mul-double/2addr v5, v1

    .line 544
    invoke-virtual {v4, v8, v9}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 545
    .line 546
    .line 547
    invoke-virtual {v4, v5, v6}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 548
    .line 549
    .line 550
    goto :goto_11

    .line 551
    :cond_19
    move-object/from16 v7, p0

    .line 552
    .line 553
    const-wide/16 v1, 0x0

    .line 554
    .line 555
    invoke-virtual {v4, v1, v2}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 556
    .line 557
    .line 558
    invoke-virtual {v4, v1, v2}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 559
    .line 560
    .line 561
    :goto_11
    if-eqz v21, :cond_1a

    .line 562
    .line 563
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 564
    .line 565
    .line 566
    move-result-object v1

    .line 567
    invoke-virtual {v11, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 568
    .line 569
    .line 570
    move-result-object v1

    .line 571
    check-cast v1, [F

    .line 572
    .line 573
    aget v2, v22, v16

    .line 574
    .line 575
    aget v3, v1, v16

    .line 576
    .line 577
    sub-float/2addr v2, v3

    .line 578
    float-to-double v2, v2

    .line 579
    invoke-virtual {v4, v2, v3}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 580
    .line 581
    .line 582
    const/16 v20, 0x1

    .line 583
    .line 584
    aget v2, v22, v20

    .line 585
    .line 586
    aget v1, v1, v20

    .line 587
    .line 588
    sub-float/2addr v2, v1

    .line 589
    float-to-double v1, v2

    .line 590
    invoke-virtual {v4, v1, v2}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 591
    .line 592
    .line 593
    const-wide/16 v1, 0x0

    .line 594
    .line 595
    goto :goto_12

    .line 596
    :cond_1a
    const-wide/16 v1, 0x0

    .line 597
    .line 598
    invoke-virtual {v4, v1, v2}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 599
    .line 600
    .line 601
    invoke-virtual {v4, v1, v2}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 602
    .line 603
    .line 604
    :goto_12
    invoke-virtual {v4, v1, v2}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 605
    .line 606
    .line 607
    invoke-virtual {v4, v1, v2}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 608
    .line 609
    .line 610
    const-wide/high16 v5, 0x3ff0000000000000L    # 1.0

    .line 611
    .line 612
    invoke-virtual {v4, v5, v6}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 613
    .line 614
    .line 615
    invoke-virtual {v4, v1, v2}, Ljava/nio/ByteBuffer;->putDouble(D)Ljava/nio/ByteBuffer;

    .line 616
    .line 617
    .line 618
    const-wide/16 v9, 0x0

    .line 619
    .line 620
    invoke-virtual {v4, v9, v10}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 621
    .line 622
    .line 623
    if-eqz v21, :cond_1b

    .line 624
    .line 625
    const/16 v1, 0x9

    .line 626
    .line 627
    if-ne v12, v1, :cond_1b

    .line 628
    .line 629
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 630
    .line 631
    .line 632
    move-result-object v0

    .line 633
    invoke-virtual {v11, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 634
    .line 635
    .line 636
    :cond_1b
    :goto_13
    return-void
.end method

.method public final c(Landroid/content/Context;)I
    .locals 4

    .line 1
    iget v0, p0, Lkc/a;->e:I

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    new-instance v0, Landroid/util/TypedValue;

    .line 6
    .line 7
    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const v2, 0x101004d

    .line 15
    .line 16
    .line 17
    const/4 v3, 0x1

    .line 18
    invoke-virtual {v1, v2, v0, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-nez v1, :cond_0

    .line 23
    .line 24
    const/16 p1, 0x30

    .line 25
    .line 26
    return p1

    .line 27
    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {v0, p1}, Landroid/util/TypedValue;->getDimension(Landroid/util/DisplayMetrics;)F

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    float-to-int p1, p1

    .line 40
    iput p1, p0, Lkc/a;->e:I

    .line 41
    .line 42
    :cond_1
    iget p1, p0, Lkc/a;->e:I

    .line 43
    .line 44
    return p1
.end method

.method public final d(Landroid/view/MotionEvent;Landroid/graphics/Matrix;)V
    .locals 12

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    invoke-static {v2}, Lkc/a;->b(I)I

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    const/4 v2, 0x5

    .line 14
    const/4 v4, 0x0

    .line 15
    const/4 v8, 0x1

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    if-ne v0, v2, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move v5, v4

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    :goto_0
    move v5, v8

    .line 24
    :goto_1
    if-nez v5, :cond_3

    .line 25
    .line 26
    if-eq v0, v8, :cond_2

    .line 27
    .line 28
    const/4 v6, 0x6

    .line 29
    if-ne v0, v6, :cond_3

    .line 30
    .line 31
    :cond_2
    move v0, v8

    .line 32
    goto :goto_2

    .line 33
    :cond_3
    move v0, v4

    .line 34
    :goto_2
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 35
    .line 36
    .line 37
    move-result v6

    .line 38
    invoke-virtual {p1, v6}, Landroid/view/MotionEvent;->getToolType(I)I

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    if-eq v6, v8, :cond_6

    .line 43
    .line 44
    const/4 v7, 0x2

    .line 45
    if-eq v6, v7, :cond_4

    .line 46
    .line 47
    const/4 v7, 0x3

    .line 48
    if-eq v6, v7, :cond_5

    .line 49
    .line 50
    const/4 v9, 0x4

    .line 51
    if-eq v6, v9, :cond_4

    .line 52
    .line 53
    goto :goto_3

    .line 54
    :cond_4
    move v2, v7

    .line 55
    goto :goto_3

    .line 56
    :cond_5
    move v2, v8

    .line 57
    goto :goto_3

    .line 58
    :cond_6
    move v2, v4

    .line 59
    :goto_3
    if-eqz v0, :cond_7

    .line 60
    .line 61
    if-nez v2, :cond_7

    .line 62
    .line 63
    move v9, v8

    .line 64
    goto :goto_4

    .line 65
    :cond_7
    move v9, v4

    .line 66
    :goto_4
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 67
    .line 68
    .line 69
    move-result v10

    .line 70
    add-int v2, v10, v9

    .line 71
    .line 72
    mul-int/lit16 v2, v2, 0x120

    .line 73
    .line 74
    invoke-static {v2}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    .line 75
    .line 76
    .line 77
    move-result-object v6

    .line 78
    sget-object v2, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 79
    .line 80
    invoke-virtual {v6, v2}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 81
    .line 82
    .line 83
    if-eqz v5, :cond_8

    .line 84
    .line 85
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    const/4 v7, 0x0

    .line 90
    const/4 v4, 0x0

    .line 91
    move-object v0, p0

    .line 92
    move-object v1, p1

    .line 93
    move-object v5, p2

    .line 94
    invoke-virtual/range {v0 .. v7}, Lkc/a;->a(Landroid/view/MotionEvent;IIILandroid/graphics/Matrix;Ljava/nio/ByteBuffer;Landroid/content/Context;)V

    .line 95
    .line 96
    .line 97
    goto :goto_7

    .line 98
    :cond_8
    move v11, v3

    .line 99
    if-eqz v0, :cond_b

    .line 100
    .line 101
    move v2, v4

    .line 102
    :goto_5
    if-ge v2, v10, :cond_a

    .line 103
    .line 104
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    if-eq v2, v0, :cond_9

    .line 109
    .line 110
    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getToolType(I)I

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    if-ne v0, v8, :cond_9

    .line 115
    .line 116
    const/4 v3, 0x5

    .line 117
    const/4 v4, 0x1

    .line 118
    const/4 v7, 0x0

    .line 119
    move-object v0, p0

    .line 120
    move-object v1, p1

    .line 121
    move-object v5, p2

    .line 122
    invoke-virtual/range {v0 .. v7}, Lkc/a;->a(Landroid/view/MotionEvent;IIILandroid/graphics/Matrix;Ljava/nio/ByteBuffer;Landroid/content/Context;)V

    .line 123
    .line 124
    .line 125
    :cond_9
    add-int/lit8 v2, v2, 0x1

    .line 126
    .line 127
    goto :goto_5

    .line 128
    :cond_a
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 129
    .line 130
    .line 131
    move-result v2

    .line 132
    const/4 v7, 0x0

    .line 133
    const/4 v4, 0x0

    .line 134
    move-object v0, p0

    .line 135
    move-object v1, p1

    .line 136
    move-object v5, p2

    .line 137
    move v3, v11

    .line 138
    invoke-virtual/range {v0 .. v7}, Lkc/a;->a(Landroid/view/MotionEvent;IIILandroid/graphics/Matrix;Ljava/nio/ByteBuffer;Landroid/content/Context;)V

    .line 139
    .line 140
    .line 141
    if-eqz v9, :cond_c

    .line 142
    .line 143
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 144
    .line 145
    .line 146
    move-result v2

    .line 147
    const/4 v3, 0x2

    .line 148
    const/4 v4, 0x0

    .line 149
    const/4 v7, 0x0

    .line 150
    move-object v0, p0

    .line 151
    move-object v1, p1

    .line 152
    move-object v5, p2

    .line 153
    invoke-virtual/range {v0 .. v7}, Lkc/a;->a(Landroid/view/MotionEvent;IIILandroid/graphics/Matrix;Ljava/nio/ByteBuffer;Landroid/content/Context;)V

    .line 154
    .line 155
    .line 156
    goto :goto_7

    .line 157
    :cond_b
    move v3, v11

    .line 158
    move v2, v4

    .line 159
    :goto_6
    if-ge v2, v10, :cond_c

    .line 160
    .line 161
    const/4 v7, 0x0

    .line 162
    const/4 v4, 0x0

    .line 163
    move-object v0, p0

    .line 164
    move-object v1, p1

    .line 165
    move-object v5, p2

    .line 166
    invoke-virtual/range {v0 .. v7}, Lkc/a;->a(Landroid/view/MotionEvent;IIILandroid/graphics/Matrix;Ljava/nio/ByteBuffer;Landroid/content/Context;)V

    .line 167
    .line 168
    .line 169
    add-int/lit8 v2, v2, 0x1

    .line 170
    .line 171
    goto :goto_6

    .line 172
    :cond_c
    :goto_7
    invoke-virtual {v6}, Ljava/nio/Buffer;->position()I

    .line 173
    .line 174
    .line 175
    move-result v0

    .line 176
    rem-int/lit16 v0, v0, 0x120

    .line 177
    .line 178
    if-nez v0, :cond_d

    .line 179
    .line 180
    invoke-virtual {v6}, Ljava/nio/Buffer;->position()I

    .line 181
    .line 182
    .line 183
    move-result v0

    .line 184
    iget-object v2, p0, Lkc/a;->a:Lio/flutter/embedding/engine/renderer/k;

    .line 185
    .line 186
    iget-object v2, v2, Lio/flutter/embedding/engine/renderer/k;->a:Lio/flutter/embedding/engine/FlutterJNI;

    .line 187
    .line 188
    invoke-virtual {v2, v6, v0}, Lio/flutter/embedding/engine/FlutterJNI;->dispatchPointerDataPacket(Ljava/nio/ByteBuffer;I)V

    .line 189
    .line 190
    .line 191
    return-void

    .line 192
    :cond_d
    new-instance v0, Ljava/lang/AssertionError;

    .line 193
    .line 194
    const-string v2, "Packet position is not on field boundary"

    .line 195
    .line 196
    invoke-direct {v0, v2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 197
    .line 198
    .line 199
    throw v0
.end method
