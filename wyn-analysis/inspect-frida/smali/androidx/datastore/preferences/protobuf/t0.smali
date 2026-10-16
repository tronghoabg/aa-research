.class public final Landroidx/datastore/preferences/protobuf/t0;
.super Landroidx/datastore/preferences/protobuf/Q;
.source "SourceFile"


# instance fields
.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/datastore/preferences/protobuf/t0;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static m(J[BII)I
    .locals 2

    .line 1
    if-eqz p4, :cond_2

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eq p4, v0, :cond_1

    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    if-ne p4, v0, :cond_0

    .line 8
    .line 9
    invoke-static {p0, p1, p2}, Landroidx/datastore/preferences/protobuf/s0;->f(J[B)B

    .line 10
    .line 11
    .line 12
    move-result p4

    .line 13
    const-wide/16 v0, 0x1

    .line 14
    .line 15
    add-long/2addr p0, v0

    .line 16
    invoke-static {p0, p1, p2}, Landroidx/datastore/preferences/protobuf/s0;->f(J[B)B

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    invoke-static {p3, p4, p0}, Landroidx/datastore/preferences/protobuf/v0;->d(III)I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    return p0

    .line 25
    :cond_0
    new-instance p0, Ljava/lang/AssertionError;

    .line 26
    .line 27
    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    .line 28
    .line 29
    .line 30
    throw p0

    .line 31
    :cond_1
    invoke-static {p0, p1, p2}, Landroidx/datastore/preferences/protobuf/s0;->f(J[B)B

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    invoke-static {p3, p0}, Landroidx/datastore/preferences/protobuf/v0;->c(II)I

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    return p0

    .line 40
    :cond_2
    sget-object p0, Landroidx/datastore/preferences/protobuf/v0;->a:Landroidx/datastore/preferences/protobuf/Q;

    .line 41
    .line 42
    const/16 p0, -0xc

    .line 43
    .line 44
    if-le p3, p0, :cond_3

    .line 45
    .line 46
    const/4 p0, -0x1

    .line 47
    return p0

    .line 48
    :cond_3
    return p3
.end method


# virtual methods
.method public final e(II[B)Ljava/lang/String;
    .locals 18

    .line 1
    move/from16 v0, p2

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    const-string v2, "buffer length=%d, index=%d, size=%d"

    .line 6
    .line 7
    const/16 v3, -0x10

    .line 8
    .line 9
    const/16 v4, -0x20

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    const/4 v6, 0x3

    .line 13
    const/4 v7, 0x2

    .line 14
    const/4 v8, 0x1

    .line 15
    move-object/from16 v9, p0

    .line 16
    .line 17
    iget v10, v9, Landroidx/datastore/preferences/protobuf/t0;->c:I

    .line 18
    .line 19
    packed-switch v10, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    or-int v10, p1, v0

    .line 23
    .line 24
    array-length v11, v1

    .line 25
    sub-int v11, v11, p1

    .line 26
    .line 27
    sub-int/2addr v11, v0

    .line 28
    or-int/2addr v10, v11

    .line 29
    if-ltz v10, :cond_9

    .line 30
    .line 31
    add-int v2, p1, v0

    .line 32
    .line 33
    new-array v14, v0, [C

    .line 34
    .line 35
    move/from16 v0, p1

    .line 36
    .line 37
    move v10, v5

    .line 38
    :goto_0
    if-ge v0, v2, :cond_0

    .line 39
    .line 40
    int-to-long v11, v0

    .line 41
    invoke-static {v11, v12, v1}, Landroidx/datastore/preferences/protobuf/s0;->f(J[B)B

    .line 42
    .line 43
    .line 44
    move-result v11

    .line 45
    if-ltz v11, :cond_0

    .line 46
    .line 47
    add-int/2addr v0, v8

    .line 48
    add-int/lit8 v12, v10, 0x1

    .line 49
    .line 50
    int-to-char v11, v11

    .line 51
    aput-char v11, v14, v10

    .line 52
    .line 53
    move v10, v12

    .line 54
    goto :goto_0

    .line 55
    :cond_0
    move v15, v10

    .line 56
    :goto_1
    if-ge v0, v2, :cond_8

    .line 57
    .line 58
    add-int/lit8 v10, v0, 0x1

    .line 59
    .line 60
    int-to-long v11, v0

    .line 61
    invoke-static {v11, v12, v1}, Landroidx/datastore/preferences/protobuf/s0;->f(J[B)B

    .line 62
    .line 63
    .line 64
    move-result v11

    .line 65
    if-ltz v11, :cond_2

    .line 66
    .line 67
    add-int/lit8 v0, v15, 0x1

    .line 68
    .line 69
    int-to-char v11, v11

    .line 70
    aput-char v11, v14, v15

    .line 71
    .line 72
    :goto_2
    if-ge v10, v2, :cond_1

    .line 73
    .line 74
    int-to-long v11, v10

    .line 75
    invoke-static {v11, v12, v1}, Landroidx/datastore/preferences/protobuf/s0;->f(J[B)B

    .line 76
    .line 77
    .line 78
    move-result v11

    .line 79
    if-ltz v11, :cond_1

    .line 80
    .line 81
    add-int/2addr v10, v8

    .line 82
    add-int/lit8 v12, v0, 0x1

    .line 83
    .line 84
    int-to-char v11, v11

    .line 85
    aput-char v11, v14, v0

    .line 86
    .line 87
    move v0, v12

    .line 88
    goto :goto_2

    .line 89
    :cond_1
    move v15, v0

    .line 90
    move/from16 v16, v7

    .line 91
    .line 92
    move/from16 v17, v8

    .line 93
    .line 94
    move v0, v10

    .line 95
    goto :goto_3

    .line 96
    :cond_2
    if-ge v11, v4, :cond_4

    .line 97
    .line 98
    if-ge v10, v2, :cond_3

    .line 99
    .line 100
    add-int/2addr v0, v7

    .line 101
    int-to-long v12, v10

    .line 102
    invoke-static {v12, v13, v1}, Landroidx/datastore/preferences/protobuf/s0;->f(J[B)B

    .line 103
    .line 104
    .line 105
    move-result v10

    .line 106
    add-int/lit8 v12, v15, 0x1

    .line 107
    .line 108
    invoke-static {v11, v10, v14, v15}, Landroidx/datastore/preferences/protobuf/Q;->b(BB[CI)V

    .line 109
    .line 110
    .line 111
    move/from16 v16, v7

    .line 112
    .line 113
    move/from16 v17, v8

    .line 114
    .line 115
    move v15, v12

    .line 116
    goto :goto_3

    .line 117
    :cond_3
    invoke-static {}, Landroidx/datastore/preferences/protobuf/A;->a()Landroidx/datastore/preferences/protobuf/A;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    throw v0

    .line 122
    :cond_4
    if-ge v11, v3, :cond_6

    .line 123
    .line 124
    add-int/lit8 v12, v2, -0x1

    .line 125
    .line 126
    if-ge v10, v12, :cond_5

    .line 127
    .line 128
    add-int/lit8 v12, v0, 0x2

    .line 129
    .line 130
    move/from16 v16, v7

    .line 131
    .line 132
    move/from16 v17, v8

    .line 133
    .line 134
    int-to-long v7, v10

    .line 135
    invoke-static {v7, v8, v1}, Landroidx/datastore/preferences/protobuf/s0;->f(J[B)B

    .line 136
    .line 137
    .line 138
    move-result v7

    .line 139
    add-int/2addr v0, v6

    .line 140
    int-to-long v12, v12

    .line 141
    invoke-static {v12, v13, v1}, Landroidx/datastore/preferences/protobuf/s0;->f(J[B)B

    .line 142
    .line 143
    .line 144
    move-result v8

    .line 145
    add-int/lit8 v10, v15, 0x1

    .line 146
    .line 147
    invoke-static {v11, v7, v8, v14, v15}, Landroidx/datastore/preferences/protobuf/Q;->c(BBB[CI)V

    .line 148
    .line 149
    .line 150
    move v15, v10

    .line 151
    goto :goto_3

    .line 152
    :cond_5
    invoke-static {}, Landroidx/datastore/preferences/protobuf/A;->a()Landroidx/datastore/preferences/protobuf/A;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    throw v0

    .line 157
    :cond_6
    move/from16 v16, v7

    .line 158
    .line 159
    move/from16 v17, v8

    .line 160
    .line 161
    add-int/lit8 v7, v2, -0x2

    .line 162
    .line 163
    if-ge v10, v7, :cond_7

    .line 164
    .line 165
    add-int/lit8 v7, v0, 0x2

    .line 166
    .line 167
    int-to-long v12, v10

    .line 168
    invoke-static {v12, v13, v1}, Landroidx/datastore/preferences/protobuf/s0;->f(J[B)B

    .line 169
    .line 170
    .line 171
    move-result v8

    .line 172
    add-int/lit8 v10, v0, 0x3

    .line 173
    .line 174
    int-to-long v12, v7

    .line 175
    invoke-static {v12, v13, v1}, Landroidx/datastore/preferences/protobuf/s0;->f(J[B)B

    .line 176
    .line 177
    .line 178
    move-result v12

    .line 179
    add-int/lit8 v0, v0, 0x4

    .line 180
    .line 181
    int-to-long v3, v10

    .line 182
    invoke-static {v3, v4, v1}, Landroidx/datastore/preferences/protobuf/s0;->f(J[B)B

    .line 183
    .line 184
    .line 185
    move-result v13

    .line 186
    move v10, v11

    .line 187
    move v11, v8

    .line 188
    invoke-static/range {v10 .. v15}, Landroidx/datastore/preferences/protobuf/Q;->a(BBBB[CI)V

    .line 189
    .line 190
    .line 191
    add-int/lit8 v15, v15, 0x2

    .line 192
    .line 193
    :goto_3
    move/from16 v7, v16

    .line 194
    .line 195
    move/from16 v8, v17

    .line 196
    .line 197
    const/16 v3, -0x10

    .line 198
    .line 199
    const/16 v4, -0x20

    .line 200
    .line 201
    goto/16 :goto_1

    .line 202
    .line 203
    :cond_7
    invoke-static {}, Landroidx/datastore/preferences/protobuf/A;->a()Landroidx/datastore/preferences/protobuf/A;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    throw v0

    .line 208
    :cond_8
    new-instance v0, Ljava/lang/String;

    .line 209
    .line 210
    invoke-direct {v0, v14, v5, v15}, Ljava/lang/String;-><init>([CII)V

    .line 211
    .line 212
    .line 213
    return-object v0

    .line 214
    :cond_9
    move/from16 v16, v7

    .line 215
    .line 216
    move/from16 v17, v8

    .line 217
    .line 218
    new-instance v3, Ljava/lang/ArrayIndexOutOfBoundsException;

    .line 219
    .line 220
    array-length v1, v1

    .line 221
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 222
    .line 223
    .line 224
    move-result-object v1

    .line 225
    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 226
    .line 227
    .line 228
    move-result-object v4

    .line 229
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    new-array v6, v6, [Ljava/lang/Object;

    .line 234
    .line 235
    aput-object v1, v6, v5

    .line 236
    .line 237
    aput-object v4, v6, v17

    .line 238
    .line 239
    aput-object v0, v6, v16

    .line 240
    .line 241
    invoke-static {v2, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object v0

    .line 245
    invoke-direct {v3, v0}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    throw v3

    .line 249
    :pswitch_0
    move/from16 v16, v7

    .line 250
    .line 251
    move/from16 v17, v8

    .line 252
    .line 253
    or-int v3, p1, v0

    .line 254
    .line 255
    array-length v4, v1

    .line 256
    sub-int v4, v4, p1

    .line 257
    .line 258
    sub-int/2addr v4, v0

    .line 259
    or-int/2addr v3, v4

    .line 260
    if-ltz v3, :cond_13

    .line 261
    .line 262
    add-int v2, p1, v0

    .line 263
    .line 264
    new-array v14, v0, [C

    .line 265
    .line 266
    move/from16 v0, p1

    .line 267
    .line 268
    move v3, v5

    .line 269
    :goto_4
    if-ge v0, v2, :cond_a

    .line 270
    .line 271
    aget-byte v4, v1, v0

    .line 272
    .line 273
    if-ltz v4, :cond_a

    .line 274
    .line 275
    add-int/lit8 v0, v0, 0x1

    .line 276
    .line 277
    add-int/lit8 v8, v3, 0x1

    .line 278
    .line 279
    int-to-char v4, v4

    .line 280
    aput-char v4, v14, v3

    .line 281
    .line 282
    move v3, v8

    .line 283
    goto :goto_4

    .line 284
    :cond_a
    move v15, v3

    .line 285
    :goto_5
    if-ge v0, v2, :cond_12

    .line 286
    .line 287
    add-int/lit8 v8, v0, 0x1

    .line 288
    .line 289
    aget-byte v10, v1, v0

    .line 290
    .line 291
    if-ltz v10, :cond_c

    .line 292
    .line 293
    add-int/lit8 v0, v15, 0x1

    .line 294
    .line 295
    int-to-char v3, v10

    .line 296
    aput-char v3, v14, v15

    .line 297
    .line 298
    :goto_6
    if-ge v8, v2, :cond_b

    .line 299
    .line 300
    aget-byte v3, v1, v8

    .line 301
    .line 302
    if-ltz v3, :cond_b

    .line 303
    .line 304
    add-int/lit8 v8, v8, 0x1

    .line 305
    .line 306
    add-int/lit8 v4, v0, 0x1

    .line 307
    .line 308
    int-to-char v3, v3

    .line 309
    aput-char v3, v14, v0

    .line 310
    .line 311
    move v0, v4

    .line 312
    goto :goto_6

    .line 313
    :cond_b
    move v15, v0

    .line 314
    move v0, v8

    .line 315
    const/16 v3, -0x20

    .line 316
    .line 317
    :goto_7
    const/16 v7, -0x10

    .line 318
    .line 319
    goto :goto_5

    .line 320
    :cond_c
    const/16 v3, -0x20

    .line 321
    .line 322
    if-ge v10, v3, :cond_e

    .line 323
    .line 324
    if-ge v8, v2, :cond_d

    .line 325
    .line 326
    add-int/lit8 v0, v0, 0x2

    .line 327
    .line 328
    aget-byte v4, v1, v8

    .line 329
    .line 330
    add-int/lit8 v8, v15, 0x1

    .line 331
    .line 332
    invoke-static {v10, v4, v14, v15}, Landroidx/datastore/preferences/protobuf/Q;->b(BB[CI)V

    .line 333
    .line 334
    .line 335
    move v15, v8

    .line 336
    goto :goto_7

    .line 337
    :cond_d
    invoke-static {}, Landroidx/datastore/preferences/protobuf/A;->a()Landroidx/datastore/preferences/protobuf/A;

    .line 338
    .line 339
    .line 340
    move-result-object v0

    .line 341
    throw v0

    .line 342
    :cond_e
    const/16 v7, -0x10

    .line 343
    .line 344
    if-ge v10, v7, :cond_10

    .line 345
    .line 346
    add-int/lit8 v4, v2, -0x1

    .line 347
    .line 348
    if-ge v8, v4, :cond_f

    .line 349
    .line 350
    add-int/lit8 v4, v0, 0x2

    .line 351
    .line 352
    aget-byte v8, v1, v8

    .line 353
    .line 354
    add-int/2addr v0, v6

    .line 355
    aget-byte v4, v1, v4

    .line 356
    .line 357
    add-int/lit8 v11, v15, 0x1

    .line 358
    .line 359
    invoke-static {v10, v8, v4, v14, v15}, Landroidx/datastore/preferences/protobuf/Q;->c(BBB[CI)V

    .line 360
    .line 361
    .line 362
    move v15, v11

    .line 363
    goto :goto_5

    .line 364
    :cond_f
    invoke-static {}, Landroidx/datastore/preferences/protobuf/A;->a()Landroidx/datastore/preferences/protobuf/A;

    .line 365
    .line 366
    .line 367
    move-result-object v0

    .line 368
    throw v0

    .line 369
    :cond_10
    add-int/lit8 v4, v2, -0x2

    .line 370
    .line 371
    if-ge v8, v4, :cond_11

    .line 372
    .line 373
    add-int/lit8 v4, v0, 0x2

    .line 374
    .line 375
    aget-byte v11, v1, v8

    .line 376
    .line 377
    add-int/lit8 v8, v0, 0x3

    .line 378
    .line 379
    aget-byte v12, v1, v4

    .line 380
    .line 381
    add-int/lit8 v0, v0, 0x4

    .line 382
    .line 383
    aget-byte v13, v1, v8

    .line 384
    .line 385
    invoke-static/range {v10 .. v15}, Landroidx/datastore/preferences/protobuf/Q;->a(BBBB[CI)V

    .line 386
    .line 387
    .line 388
    add-int/lit8 v15, v15, 0x2

    .line 389
    .line 390
    goto :goto_5

    .line 391
    :cond_11
    invoke-static {}, Landroidx/datastore/preferences/protobuf/A;->a()Landroidx/datastore/preferences/protobuf/A;

    .line 392
    .line 393
    .line 394
    move-result-object v0

    .line 395
    throw v0

    .line 396
    :cond_12
    new-instance v0, Ljava/lang/String;

    .line 397
    .line 398
    invoke-direct {v0, v14, v5, v15}, Ljava/lang/String;-><init>([CII)V

    .line 399
    .line 400
    .line 401
    return-object v0

    .line 402
    :cond_13
    new-instance v3, Ljava/lang/ArrayIndexOutOfBoundsException;

    .line 403
    .line 404
    array-length v1, v1

    .line 405
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 406
    .line 407
    .line 408
    move-result-object v1

    .line 409
    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 410
    .line 411
    .line 412
    move-result-object v4

    .line 413
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 414
    .line 415
    .line 416
    move-result-object v0

    .line 417
    new-array v6, v6, [Ljava/lang/Object;

    .line 418
    .line 419
    aput-object v1, v6, v5

    .line 420
    .line 421
    aput-object v4, v6, v17

    .line 422
    .line 423
    aput-object v0, v6, v16

    .line 424
    .line 425
    invoke-static {v2, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 426
    .line 427
    .line 428
    move-result-object v0

    .line 429
    invoke-direct {v3, v0}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 430
    .line 431
    .line 432
    throw v3

    .line 433
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final f(IILjava/lang/String;[B)I
    .locals 22

    .line 1
    move/from16 v0, p1

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    move-object/from16 v3, p0

    .line 8
    .line 9
    move-object/from16 v4, p4

    .line 10
    .line 11
    iget v5, v3, Landroidx/datastore/preferences/protobuf/t0;->c:I

    .line 12
    .line 13
    packed-switch v5, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    int-to-long v5, v0

    .line 17
    int-to-long v7, v1

    .line 18
    add-long/2addr v7, v5

    .line 19
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 20
    .line 21
    .line 22
    move-result v9

    .line 23
    const-string v10, " at index "

    .line 24
    .line 25
    const-string v11, "Failed writing "

    .line 26
    .line 27
    if-gt v9, v1, :cond_c

    .line 28
    .line 29
    array-length v12, v4

    .line 30
    sub-int/2addr v12, v1

    .line 31
    if-lt v12, v0, :cond_c

    .line 32
    .line 33
    const/4 v0, 0x0

    .line 34
    :goto_0
    const-wide/16 v12, 0x1

    .line 35
    .line 36
    const/16 v1, 0x80

    .line 37
    .line 38
    if-ge v0, v9, :cond_0

    .line 39
    .line 40
    invoke-virtual {v2, v0}, Ljava/lang/String;->charAt(I)C

    .line 41
    .line 42
    .line 43
    move-result v14

    .line 44
    if-ge v14, v1, :cond_0

    .line 45
    .line 46
    add-long/2addr v12, v5

    .line 47
    int-to-byte v1, v14

    .line 48
    invoke-static {v4, v5, v6, v1}, Landroidx/datastore/preferences/protobuf/s0;->j([BJB)V

    .line 49
    .line 50
    .line 51
    add-int/lit8 v0, v0, 0x1

    .line 52
    .line 53
    move-wide v5, v12

    .line 54
    goto :goto_0

    .line 55
    :cond_0
    if-ne v0, v9, :cond_2

    .line 56
    .line 57
    :cond_1
    long-to-int v0, v5

    .line 58
    goto/16 :goto_4

    .line 59
    .line 60
    :cond_2
    :goto_1
    if-ge v0, v9, :cond_1

    .line 61
    .line 62
    invoke-virtual {v2, v0}, Ljava/lang/String;->charAt(I)C

    .line 63
    .line 64
    .line 65
    move-result v14

    .line 66
    if-ge v14, v1, :cond_3

    .line 67
    .line 68
    cmp-long v15, v5, v7

    .line 69
    .line 70
    if-gez v15, :cond_3

    .line 71
    .line 72
    add-long v15, v5, v12

    .line 73
    .line 74
    int-to-byte v14, v14

    .line 75
    invoke-static {v4, v5, v6, v14}, Landroidx/datastore/preferences/protobuf/s0;->j([BJB)V

    .line 76
    .line 77
    .line 78
    move v3, v0

    .line 79
    move v0, v1

    .line 80
    move-wide/from16 p1, v12

    .line 81
    .line 82
    move-wide v5, v15

    .line 83
    :goto_2
    move-object v12, v2

    .line 84
    goto/16 :goto_3

    .line 85
    .line 86
    :cond_3
    const/16 v15, 0x800

    .line 87
    .line 88
    const-wide/16 v16, 0x2

    .line 89
    .line 90
    if-ge v14, v15, :cond_4

    .line 91
    .line 92
    sub-long v18, v7, v16

    .line 93
    .line 94
    cmp-long v15, v5, v18

    .line 95
    .line 96
    if-gtz v15, :cond_4

    .line 97
    .line 98
    move-wide/from16 p1, v12

    .line 99
    .line 100
    add-long v12, v5, p1

    .line 101
    .line 102
    ushr-int/lit8 v15, v14, 0x6

    .line 103
    .line 104
    or-int/lit16 v15, v15, 0x3c0

    .line 105
    .line 106
    int-to-byte v15, v15

    .line 107
    invoke-static {v4, v5, v6, v15}, Landroidx/datastore/preferences/protobuf/s0;->j([BJB)V

    .line 108
    .line 109
    .line 110
    add-long v5, v5, v16

    .line 111
    .line 112
    and-int/lit8 v14, v14, 0x3f

    .line 113
    .line 114
    or-int/2addr v14, v1

    .line 115
    int-to-byte v14, v14

    .line 116
    invoke-static {v4, v12, v13, v14}, Landroidx/datastore/preferences/protobuf/s0;->j([BJB)V

    .line 117
    .line 118
    .line 119
    move v3, v0

    .line 120
    move v0, v1

    .line 121
    goto :goto_2

    .line 122
    :cond_4
    move-wide/from16 p1, v12

    .line 123
    .line 124
    const v12, 0xdfff

    .line 125
    .line 126
    .line 127
    const v13, 0xd800

    .line 128
    .line 129
    .line 130
    const-wide/16 v18, 0x3

    .line 131
    .line 132
    if-lt v14, v13, :cond_5

    .line 133
    .line 134
    if-ge v12, v14, :cond_6

    .line 135
    .line 136
    :cond_5
    sub-long v20, v7, v18

    .line 137
    .line 138
    cmp-long v15, v5, v20

    .line 139
    .line 140
    if-gtz v15, :cond_6

    .line 141
    .line 142
    add-long v12, v5, p1

    .line 143
    .line 144
    ushr-int/lit8 v15, v14, 0xc

    .line 145
    .line 146
    or-int/lit16 v15, v15, 0x1e0

    .line 147
    .line 148
    int-to-byte v15, v15

    .line 149
    invoke-static {v4, v5, v6, v15}, Landroidx/datastore/preferences/protobuf/s0;->j([BJB)V

    .line 150
    .line 151
    .line 152
    add-long v1, v5, v16

    .line 153
    .line 154
    ushr-int/lit8 v16, v14, 0x6

    .line 155
    .line 156
    and-int/lit8 v15, v16, 0x3f

    .line 157
    .line 158
    const/16 v3, 0x80

    .line 159
    .line 160
    or-int/2addr v15, v3

    .line 161
    int-to-byte v15, v15

    .line 162
    invoke-static {v4, v12, v13, v15}, Landroidx/datastore/preferences/protobuf/s0;->j([BJB)V

    .line 163
    .line 164
    .line 165
    add-long v5, v5, v18

    .line 166
    .line 167
    and-int/lit8 v12, v14, 0x3f

    .line 168
    .line 169
    or-int/2addr v12, v3

    .line 170
    int-to-byte v3, v12

    .line 171
    invoke-static {v4, v1, v2, v3}, Landroidx/datastore/preferences/protobuf/s0;->j([BJB)V

    .line 172
    .line 173
    .line 174
    move-object/from16 v12, p3

    .line 175
    .line 176
    move v3, v0

    .line 177
    const/16 v0, 0x80

    .line 178
    .line 179
    goto :goto_3

    .line 180
    :cond_6
    const-wide/16 v1, 0x4

    .line 181
    .line 182
    sub-long v20, v7, v1

    .line 183
    .line 184
    cmp-long v3, v5, v20

    .line 185
    .line 186
    if-gtz v3, :cond_9

    .line 187
    .line 188
    add-int/lit8 v3, v0, 0x1

    .line 189
    .line 190
    if-eq v3, v9, :cond_8

    .line 191
    .line 192
    move-object/from16 v12, p3

    .line 193
    .line 194
    invoke-virtual {v12, v3}, Ljava/lang/String;->charAt(I)C

    .line 195
    .line 196
    .line 197
    move-result v0

    .line 198
    invoke-static {v14, v0}, Ljava/lang/Character;->isSurrogatePair(CC)Z

    .line 199
    .line 200
    .line 201
    move-result v13

    .line 202
    if-eqz v13, :cond_7

    .line 203
    .line 204
    invoke-static {v14, v0}, Ljava/lang/Character;->toCodePoint(CC)I

    .line 205
    .line 206
    .line 207
    move-result v0

    .line 208
    add-long v13, v5, p1

    .line 209
    .line 210
    move-wide/from16 v20, v1

    .line 211
    .line 212
    ushr-int/lit8 v1, v0, 0x12

    .line 213
    .line 214
    or-int/lit16 v1, v1, 0xf0

    .line 215
    .line 216
    int-to-byte v1, v1

    .line 217
    invoke-static {v4, v5, v6, v1}, Landroidx/datastore/preferences/protobuf/s0;->j([BJB)V

    .line 218
    .line 219
    .line 220
    add-long v1, v5, v16

    .line 221
    .line 222
    ushr-int/lit8 v16, v0, 0xc

    .line 223
    .line 224
    and-int/lit8 v15, v16, 0x3f

    .line 225
    .line 226
    move/from16 v16, v0

    .line 227
    .line 228
    const/16 v0, 0x80

    .line 229
    .line 230
    or-int/2addr v15, v0

    .line 231
    int-to-byte v15, v15

    .line 232
    invoke-static {v4, v13, v14, v15}, Landroidx/datastore/preferences/protobuf/s0;->j([BJB)V

    .line 233
    .line 234
    .line 235
    add-long v13, v5, v18

    .line 236
    .line 237
    ushr-int/lit8 v15, v16, 0x6

    .line 238
    .line 239
    and-int/lit8 v15, v15, 0x3f

    .line 240
    .line 241
    or-int/2addr v15, v0

    .line 242
    int-to-byte v15, v15

    .line 243
    invoke-static {v4, v1, v2, v15}, Landroidx/datastore/preferences/protobuf/s0;->j([BJB)V

    .line 244
    .line 245
    .line 246
    add-long v5, v5, v20

    .line 247
    .line 248
    and-int/lit8 v1, v16, 0x3f

    .line 249
    .line 250
    or-int/2addr v1, v0

    .line 251
    int-to-byte v1, v1

    .line 252
    invoke-static {v4, v13, v14, v1}, Landroidx/datastore/preferences/protobuf/s0;->j([BJB)V

    .line 253
    .line 254
    .line 255
    :goto_3
    add-int/lit8 v1, v3, 0x1

    .line 256
    .line 257
    move v2, v1

    .line 258
    move v1, v0

    .line 259
    move v0, v2

    .line 260
    move-object/from16 v3, p0

    .line 261
    .line 262
    move-object v2, v12

    .line 263
    move-wide/from16 v12, p1

    .line 264
    .line 265
    goto/16 :goto_1

    .line 266
    .line 267
    :cond_7
    move v0, v3

    .line 268
    :cond_8
    new-instance v1, Landroidx/datastore/preferences/protobuf/u0;

    .line 269
    .line 270
    add-int/lit8 v0, v0, -0x1

    .line 271
    .line 272
    invoke-direct {v1, v0, v9}, Landroidx/datastore/preferences/protobuf/u0;-><init>(II)V

    .line 273
    .line 274
    .line 275
    throw v1

    .line 276
    :cond_9
    move-object/from16 v2, p3

    .line 277
    .line 278
    if-gt v13, v14, :cond_b

    .line 279
    .line 280
    if-gt v14, v12, :cond_b

    .line 281
    .line 282
    add-int/lit8 v1, v0, 0x1

    .line 283
    .line 284
    if-eq v1, v9, :cond_a

    .line 285
    .line 286
    invoke-virtual {v2, v1}, Ljava/lang/String;->charAt(I)C

    .line 287
    .line 288
    .line 289
    move-result v1

    .line 290
    invoke-static {v14, v1}, Ljava/lang/Character;->isSurrogatePair(CC)Z

    .line 291
    .line 292
    .line 293
    move-result v1

    .line 294
    if-nez v1, :cond_b

    .line 295
    .line 296
    :cond_a
    new-instance v1, Landroidx/datastore/preferences/protobuf/u0;

    .line 297
    .line 298
    invoke-direct {v1, v0, v9}, Landroidx/datastore/preferences/protobuf/u0;-><init>(II)V

    .line 299
    .line 300
    .line 301
    throw v1

    .line 302
    :cond_b
    new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;

    .line 303
    .line 304
    new-instance v1, Ljava/lang/StringBuilder;

    .line 305
    .line 306
    invoke-direct {v1, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 307
    .line 308
    .line 309
    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 310
    .line 311
    .line 312
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 313
    .line 314
    .line 315
    invoke-virtual {v1, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 316
    .line 317
    .line 318
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 319
    .line 320
    .line 321
    move-result-object v1

    .line 322
    invoke-direct {v0, v1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 323
    .line 324
    .line 325
    throw v0

    .line 326
    :goto_4
    return v0

    .line 327
    :cond_c
    new-instance v3, Ljava/lang/ArrayIndexOutOfBoundsException;

    .line 328
    .line 329
    new-instance v4, Ljava/lang/StringBuilder;

    .line 330
    .line 331
    invoke-direct {v4, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 332
    .line 333
    .line 334
    add-int/lit8 v9, v9, -0x1

    .line 335
    .line 336
    invoke-virtual {v2, v9}, Ljava/lang/String;->charAt(I)C

    .line 337
    .line 338
    .line 339
    move-result v2

    .line 340
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 341
    .line 342
    .line 343
    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 344
    .line 345
    .line 346
    add-int/2addr v0, v1

    .line 347
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 348
    .line 349
    .line 350
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 351
    .line 352
    .line 353
    move-result-object v0

    .line 354
    invoke-direct {v3, v0}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 355
    .line 356
    .line 357
    throw v3

    .line 358
    :pswitch_0
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 359
    .line 360
    .line 361
    move-result v3

    .line 362
    add-int/2addr v1, v0

    .line 363
    const/4 v5, 0x0

    .line 364
    :goto_5
    const/16 v6, 0x80

    .line 365
    .line 366
    if-ge v5, v3, :cond_d

    .line 367
    .line 368
    add-int v7, v5, v0

    .line 369
    .line 370
    if-ge v7, v1, :cond_d

    .line 371
    .line 372
    invoke-virtual {v2, v5}, Ljava/lang/String;->charAt(I)C

    .line 373
    .line 374
    .line 375
    move-result v8

    .line 376
    if-ge v8, v6, :cond_d

    .line 377
    .line 378
    int-to-byte v6, v8

    .line 379
    aput-byte v6, v4, v7

    .line 380
    .line 381
    add-int/lit8 v5, v5, 0x1

    .line 382
    .line 383
    goto :goto_5

    .line 384
    :cond_d
    if-ne v5, v3, :cond_e

    .line 385
    .line 386
    add-int/2addr v0, v3

    .line 387
    goto/16 :goto_8

    .line 388
    .line 389
    :cond_e
    add-int/2addr v0, v5

    .line 390
    :goto_6
    if-ge v5, v3, :cond_18

    .line 391
    .line 392
    invoke-virtual {v2, v5}, Ljava/lang/String;->charAt(I)C

    .line 393
    .line 394
    .line 395
    move-result v7

    .line 396
    if-ge v7, v6, :cond_f

    .line 397
    .line 398
    if-ge v0, v1, :cond_f

    .line 399
    .line 400
    add-int/lit8 v8, v0, 0x1

    .line 401
    .line 402
    int-to-byte v7, v7

    .line 403
    aput-byte v7, v4, v0

    .line 404
    .line 405
    move v0, v8

    .line 406
    goto/16 :goto_7

    .line 407
    .line 408
    :cond_f
    const/16 v8, 0x800

    .line 409
    .line 410
    if-ge v7, v8, :cond_10

    .line 411
    .line 412
    add-int/lit8 v8, v1, -0x2

    .line 413
    .line 414
    if-gt v0, v8, :cond_10

    .line 415
    .line 416
    add-int/lit8 v8, v0, 0x1

    .line 417
    .line 418
    ushr-int/lit8 v9, v7, 0x6

    .line 419
    .line 420
    or-int/lit16 v9, v9, 0x3c0

    .line 421
    .line 422
    int-to-byte v9, v9

    .line 423
    aput-byte v9, v4, v0

    .line 424
    .line 425
    add-int/lit8 v0, v0, 0x2

    .line 426
    .line 427
    and-int/lit8 v7, v7, 0x3f

    .line 428
    .line 429
    or-int/2addr v7, v6

    .line 430
    int-to-byte v7, v7

    .line 431
    aput-byte v7, v4, v8

    .line 432
    .line 433
    goto :goto_7

    .line 434
    :cond_10
    const v8, 0xdfff

    .line 435
    .line 436
    .line 437
    const v9, 0xd800

    .line 438
    .line 439
    .line 440
    if-lt v7, v9, :cond_11

    .line 441
    .line 442
    if-ge v8, v7, :cond_12

    .line 443
    .line 444
    :cond_11
    add-int/lit8 v10, v1, -0x3

    .line 445
    .line 446
    if-gt v0, v10, :cond_12

    .line 447
    .line 448
    add-int/lit8 v8, v0, 0x1

    .line 449
    .line 450
    ushr-int/lit8 v9, v7, 0xc

    .line 451
    .line 452
    or-int/lit16 v9, v9, 0x1e0

    .line 453
    .line 454
    int-to-byte v9, v9

    .line 455
    aput-byte v9, v4, v0

    .line 456
    .line 457
    add-int/lit8 v9, v0, 0x2

    .line 458
    .line 459
    ushr-int/lit8 v10, v7, 0x6

    .line 460
    .line 461
    and-int/lit8 v10, v10, 0x3f

    .line 462
    .line 463
    or-int/2addr v10, v6

    .line 464
    int-to-byte v10, v10

    .line 465
    aput-byte v10, v4, v8

    .line 466
    .line 467
    add-int/lit8 v0, v0, 0x3

    .line 468
    .line 469
    and-int/lit8 v7, v7, 0x3f

    .line 470
    .line 471
    or-int/2addr v7, v6

    .line 472
    int-to-byte v7, v7

    .line 473
    aput-byte v7, v4, v9

    .line 474
    .line 475
    goto :goto_7

    .line 476
    :cond_12
    add-int/lit8 v10, v1, -0x4

    .line 477
    .line 478
    if-gt v0, v10, :cond_15

    .line 479
    .line 480
    add-int/lit8 v8, v5, 0x1

    .line 481
    .line 482
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 483
    .line 484
    .line 485
    move-result v9

    .line 486
    if-eq v8, v9, :cond_14

    .line 487
    .line 488
    invoke-virtual {v2, v8}, Ljava/lang/String;->charAt(I)C

    .line 489
    .line 490
    .line 491
    move-result v5

    .line 492
    invoke-static {v7, v5}, Ljava/lang/Character;->isSurrogatePair(CC)Z

    .line 493
    .line 494
    .line 495
    move-result v9

    .line 496
    if-eqz v9, :cond_13

    .line 497
    .line 498
    invoke-static {v7, v5}, Ljava/lang/Character;->toCodePoint(CC)I

    .line 499
    .line 500
    .line 501
    move-result v5

    .line 502
    add-int/lit8 v7, v0, 0x1

    .line 503
    .line 504
    ushr-int/lit8 v9, v5, 0x12

    .line 505
    .line 506
    or-int/lit16 v9, v9, 0xf0

    .line 507
    .line 508
    int-to-byte v9, v9

    .line 509
    aput-byte v9, v4, v0

    .line 510
    .line 511
    add-int/lit8 v9, v0, 0x2

    .line 512
    .line 513
    ushr-int/lit8 v10, v5, 0xc

    .line 514
    .line 515
    and-int/lit8 v10, v10, 0x3f

    .line 516
    .line 517
    or-int/2addr v10, v6

    .line 518
    int-to-byte v10, v10

    .line 519
    aput-byte v10, v4, v7

    .line 520
    .line 521
    add-int/lit8 v7, v0, 0x3

    .line 522
    .line 523
    ushr-int/lit8 v10, v5, 0x6

    .line 524
    .line 525
    and-int/lit8 v10, v10, 0x3f

    .line 526
    .line 527
    or-int/2addr v10, v6

    .line 528
    int-to-byte v10, v10

    .line 529
    aput-byte v10, v4, v9

    .line 530
    .line 531
    add-int/lit8 v0, v0, 0x4

    .line 532
    .line 533
    and-int/lit8 v5, v5, 0x3f

    .line 534
    .line 535
    or-int/2addr v5, v6

    .line 536
    int-to-byte v5, v5

    .line 537
    aput-byte v5, v4, v7

    .line 538
    .line 539
    move v5, v8

    .line 540
    :goto_7
    add-int/lit8 v5, v5, 0x1

    .line 541
    .line 542
    goto/16 :goto_6

    .line 543
    .line 544
    :cond_13
    move v5, v8

    .line 545
    :cond_14
    new-instance v0, Landroidx/datastore/preferences/protobuf/u0;

    .line 546
    .line 547
    add-int/lit8 v5, v5, -0x1

    .line 548
    .line 549
    invoke-direct {v0, v5, v3}, Landroidx/datastore/preferences/protobuf/u0;-><init>(II)V

    .line 550
    .line 551
    .line 552
    throw v0

    .line 553
    :cond_15
    if-gt v9, v7, :cond_17

    .line 554
    .line 555
    if-gt v7, v8, :cond_17

    .line 556
    .line 557
    add-int/lit8 v1, v5, 0x1

    .line 558
    .line 559
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 560
    .line 561
    .line 562
    move-result v4

    .line 563
    if-eq v1, v4, :cond_16

    .line 564
    .line 565
    invoke-virtual {v2, v1}, Ljava/lang/String;->charAt(I)C

    .line 566
    .line 567
    .line 568
    move-result v1

    .line 569
    invoke-static {v7, v1}, Ljava/lang/Character;->isSurrogatePair(CC)Z

    .line 570
    .line 571
    .line 572
    move-result v1

    .line 573
    if-nez v1, :cond_17

    .line 574
    .line 575
    :cond_16
    new-instance v0, Landroidx/datastore/preferences/protobuf/u0;

    .line 576
    .line 577
    invoke-direct {v0, v5, v3}, Landroidx/datastore/preferences/protobuf/u0;-><init>(II)V

    .line 578
    .line 579
    .line 580
    throw v0

    .line 581
    :cond_17
    new-instance v1, Ljava/lang/ArrayIndexOutOfBoundsException;

    .line 582
    .line 583
    new-instance v2, Ljava/lang/StringBuilder;

    .line 584
    .line 585
    const-string v3, "Failed writing "

    .line 586
    .line 587
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 588
    .line 589
    .line 590
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 591
    .line 592
    .line 593
    const-string v3, " at index "

    .line 594
    .line 595
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 596
    .line 597
    .line 598
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 599
    .line 600
    .line 601
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 602
    .line 603
    .line 604
    move-result-object v0

    .line 605
    invoke-direct {v1, v0}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 606
    .line 607
    .line 608
    throw v1

    .line 609
    :cond_18
    :goto_8
    return v0

    .line 610
    nop

    .line 611
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final i([BII)I
    .locals 24

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    move/from16 v2, p3

    .line 6
    .line 7
    const/16 v3, -0x13

    .line 8
    .line 9
    const/16 v4, -0x60

    .line 10
    .line 11
    const/16 v5, -0x10

    .line 12
    .line 13
    const/16 v6, -0x3e

    .line 14
    .line 15
    const/16 v7, -0x41

    .line 16
    .line 17
    const/16 v8, -0x20

    .line 18
    .line 19
    const/4 v13, 0x2

    .line 20
    move-object/from16 v14, p0

    .line 21
    .line 22
    iget v15, v14, Landroidx/datastore/preferences/protobuf/t0;->c:I

    .line 23
    .line 24
    packed-switch v15, :pswitch_data_0

    .line 25
    .line 26
    .line 27
    or-int v15, v1, v2

    .line 28
    .line 29
    const/16 v16, 0x0

    .line 30
    .line 31
    array-length v9, v0

    .line 32
    sub-int/2addr v9, v2

    .line 33
    or-int/2addr v9, v15

    .line 34
    if-ltz v9, :cond_11

    .line 35
    .line 36
    const/4 v9, -0x1

    .line 37
    const/4 v15, 0x1

    .line 38
    int-to-long v11, v1

    .line 39
    int-to-long v1, v2

    .line 40
    sub-long/2addr v1, v11

    .line 41
    long-to-int v1, v1

    .line 42
    const/16 v2, 0x10

    .line 43
    .line 44
    const-wide/16 v17, 0x1

    .line 45
    .line 46
    if-ge v1, v2, :cond_0

    .line 47
    .line 48
    move/from16 v20, v9

    .line 49
    .line 50
    move/from16 v2, v16

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_0
    move/from16 v20, v9

    .line 54
    .line 55
    move-wide v9, v11

    .line 56
    move/from16 v2, v16

    .line 57
    .line 58
    :goto_0
    if-ge v2, v1, :cond_2

    .line 59
    .line 60
    add-long v21, v9, v17

    .line 61
    .line 62
    invoke-static {v9, v10, v0}, Landroidx/datastore/preferences/protobuf/s0;->f(J[B)B

    .line 63
    .line 64
    .line 65
    move-result v9

    .line 66
    if-gez v9, :cond_1

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_1
    add-int/2addr v2, v15

    .line 70
    move-wide/from16 v9, v21

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_2
    move v2, v1

    .line 74
    :goto_1
    sub-int/2addr v1, v2

    .line 75
    int-to-long v9, v2

    .line 76
    add-long/2addr v11, v9

    .line 77
    :goto_2
    move/from16 v2, v16

    .line 78
    .line 79
    :goto_3
    if-lez v1, :cond_4

    .line 80
    .line 81
    add-long v9, v11, v17

    .line 82
    .line 83
    invoke-static {v11, v12, v0}, Landroidx/datastore/preferences/protobuf/s0;->f(J[B)B

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    if-ltz v2, :cond_3

    .line 88
    .line 89
    add-int/lit8 v1, v1, -0x1

    .line 90
    .line 91
    move-wide v11, v9

    .line 92
    goto :goto_3

    .line 93
    :cond_3
    move-wide v11, v9

    .line 94
    :cond_4
    if-nez v1, :cond_5

    .line 95
    .line 96
    move/from16 v9, v16

    .line 97
    .line 98
    goto/16 :goto_6

    .line 99
    .line 100
    :cond_5
    add-int/lit8 v9, v1, -0x1

    .line 101
    .line 102
    if-ge v2, v8, :cond_9

    .line 103
    .line 104
    if-nez v9, :cond_6

    .line 105
    .line 106
    move v9, v2

    .line 107
    goto/16 :goto_6

    .line 108
    .line 109
    :cond_6
    add-int/lit8 v1, v1, -0x2

    .line 110
    .line 111
    if-lt v2, v6, :cond_10

    .line 112
    .line 113
    add-long v9, v11, v17

    .line 114
    .line 115
    invoke-static {v11, v12, v0}, Landroidx/datastore/preferences/protobuf/s0;->f(J[B)B

    .line 116
    .line 117
    .line 118
    move-result v2

    .line 119
    if-le v2, v7, :cond_7

    .line 120
    .line 121
    goto/16 :goto_5

    .line 122
    .line 123
    :cond_7
    move-wide v11, v9

    .line 124
    :cond_8
    move/from16 v23, v13

    .line 125
    .line 126
    goto :goto_4

    .line 127
    :cond_9
    const-wide/16 v21, 0x2

    .line 128
    .line 129
    if-ge v2, v5, :cond_d

    .line 130
    .line 131
    if-ge v9, v13, :cond_a

    .line 132
    .line 133
    invoke-static {v11, v12, v0, v2, v9}, Landroidx/datastore/preferences/protobuf/t0;->m(J[BII)I

    .line 134
    .line 135
    .line 136
    move-result v9

    .line 137
    goto :goto_6

    .line 138
    :cond_a
    add-int/lit8 v1, v1, -0x3

    .line 139
    .line 140
    add-long v9, v11, v17

    .line 141
    .line 142
    invoke-static {v11, v12, v0}, Landroidx/datastore/preferences/protobuf/s0;->f(J[B)B

    .line 143
    .line 144
    .line 145
    move-result v15

    .line 146
    if-gt v15, v7, :cond_10

    .line 147
    .line 148
    if-ne v2, v8, :cond_b

    .line 149
    .line 150
    if-lt v15, v4, :cond_10

    .line 151
    .line 152
    :cond_b
    if-ne v2, v3, :cond_c

    .line 153
    .line 154
    if-ge v15, v4, :cond_10

    .line 155
    .line 156
    :cond_c
    add-long v11, v11, v21

    .line 157
    .line 158
    invoke-static {v9, v10, v0}, Landroidx/datastore/preferences/protobuf/s0;->f(J[B)B

    .line 159
    .line 160
    .line 161
    move-result v2

    .line 162
    if-le v2, v7, :cond_8

    .line 163
    .line 164
    goto :goto_5

    .line 165
    :cond_d
    const/4 v10, 0x3

    .line 166
    if-ge v9, v10, :cond_e

    .line 167
    .line 168
    invoke-static {v11, v12, v0, v2, v9}, Landroidx/datastore/preferences/protobuf/t0;->m(J[BII)I

    .line 169
    .line 170
    .line 171
    move-result v9

    .line 172
    goto :goto_6

    .line 173
    :cond_e
    add-int/lit8 v1, v1, -0x4

    .line 174
    .line 175
    add-long v9, v11, v17

    .line 176
    .line 177
    invoke-static {v11, v12, v0}, Landroidx/datastore/preferences/protobuf/s0;->f(J[B)B

    .line 178
    .line 179
    .line 180
    move-result v15

    .line 181
    if-gt v15, v7, :cond_10

    .line 182
    .line 183
    shl-int/lit8 v2, v2, 0x1c

    .line 184
    .line 185
    add-int/lit8 v15, v15, 0x70

    .line 186
    .line 187
    add-int/2addr v15, v2

    .line 188
    shr-int/lit8 v2, v15, 0x1e

    .line 189
    .line 190
    if-nez v2, :cond_10

    .line 191
    .line 192
    move/from16 v23, v13

    .line 193
    .line 194
    add-long v13, v11, v21

    .line 195
    .line 196
    invoke-static {v9, v10, v0}, Landroidx/datastore/preferences/protobuf/s0;->f(J[B)B

    .line 197
    .line 198
    .line 199
    move-result v2

    .line 200
    if-gt v2, v7, :cond_10

    .line 201
    .line 202
    const-wide/16 v9, 0x3

    .line 203
    .line 204
    add-long/2addr v11, v9

    .line 205
    invoke-static {v13, v14, v0}, Landroidx/datastore/preferences/protobuf/s0;->f(J[B)B

    .line 206
    .line 207
    .line 208
    move-result v2

    .line 209
    if-le v2, v7, :cond_f

    .line 210
    .line 211
    goto :goto_5

    .line 212
    :cond_f
    :goto_4
    move-object/from16 v14, p0

    .line 213
    .line 214
    move/from16 v13, v23

    .line 215
    .line 216
    goto/16 :goto_2

    .line 217
    .line 218
    :cond_10
    :goto_5
    move/from16 v9, v20

    .line 219
    .line 220
    :goto_6
    return v9

    .line 221
    :cond_11
    move/from16 v23, v13

    .line 222
    .line 223
    const/4 v15, 0x1

    .line 224
    new-instance v3, Ljava/lang/ArrayIndexOutOfBoundsException;

    .line 225
    .line 226
    array-length v0, v0

    .line 227
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 232
    .line 233
    .line 234
    move-result-object v1

    .line 235
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 236
    .line 237
    .line 238
    move-result-object v2

    .line 239
    const/4 v10, 0x3

    .line 240
    new-array v4, v10, [Ljava/lang/Object;

    .line 241
    .line 242
    aput-object v0, v4, v16

    .line 243
    .line 244
    aput-object v1, v4, v15

    .line 245
    .line 246
    aput-object v2, v4, v23

    .line 247
    .line 248
    const-string v0, "Array length=%d, index=%d, limit=%d"

    .line 249
    .line 250
    invoke-static {v0, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    invoke-direct {v3, v0}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 255
    .line 256
    .line 257
    throw v3

    .line 258
    :pswitch_0
    move/from16 v23, v13

    .line 259
    .line 260
    const/4 v15, 0x1

    .line 261
    const/16 v16, 0x0

    .line 262
    .line 263
    const/16 v20, -0x1

    .line 264
    .line 265
    :goto_7
    if-ge v1, v2, :cond_12

    .line 266
    .line 267
    aget-byte v9, v0, v1

    .line 268
    .line 269
    if-ltz v9, :cond_12

    .line 270
    .line 271
    add-int/2addr v1, v15

    .line 272
    goto :goto_7

    .line 273
    :cond_12
    if-lt v1, v2, :cond_13

    .line 274
    .line 275
    goto :goto_9

    .line 276
    :cond_13
    :goto_8
    if-lt v1, v2, :cond_14

    .line 277
    .line 278
    :goto_9
    move/from16 v9, v16

    .line 279
    .line 280
    goto/16 :goto_b

    .line 281
    .line 282
    :cond_14
    add-int/lit8 v9, v1, 0x1

    .line 283
    .line 284
    aget-byte v10, v0, v1

    .line 285
    .line 286
    if-gez v10, :cond_1e

    .line 287
    .line 288
    if-ge v10, v8, :cond_17

    .line 289
    .line 290
    if-lt v9, v2, :cond_15

    .line 291
    .line 292
    move v9, v10

    .line 293
    goto :goto_b

    .line 294
    :cond_15
    if-lt v10, v6, :cond_1d

    .line 295
    .line 296
    add-int/lit8 v1, v1, 0x2

    .line 297
    .line 298
    aget-byte v9, v0, v9

    .line 299
    .line 300
    if-le v9, v7, :cond_16

    .line 301
    .line 302
    goto :goto_a

    .line 303
    :cond_16
    const/16 v19, 0x3

    .line 304
    .line 305
    goto :goto_8

    .line 306
    :cond_17
    if-ge v10, v5, :cond_1b

    .line 307
    .line 308
    add-int/lit8 v11, v2, -0x1

    .line 309
    .line 310
    if-lt v9, v11, :cond_18

    .line 311
    .line 312
    invoke-static {v9, v2, v0}, Landroidx/datastore/preferences/protobuf/v0;->a(II[B)I

    .line 313
    .line 314
    .line 315
    move-result v9

    .line 316
    goto :goto_b

    .line 317
    :cond_18
    add-int/lit8 v13, v1, 0x2

    .line 318
    .line 319
    aget-byte v9, v0, v9

    .line 320
    .line 321
    if-gt v9, v7, :cond_1d

    .line 322
    .line 323
    if-ne v10, v8, :cond_19

    .line 324
    .line 325
    if-lt v9, v4, :cond_1d

    .line 326
    .line 327
    :cond_19
    if-ne v10, v3, :cond_1a

    .line 328
    .line 329
    if-ge v9, v4, :cond_1d

    .line 330
    .line 331
    :cond_1a
    const/16 v19, 0x3

    .line 332
    .line 333
    add-int/lit8 v1, v1, 0x3

    .line 334
    .line 335
    aget-byte v9, v0, v13

    .line 336
    .line 337
    if-le v9, v7, :cond_16

    .line 338
    .line 339
    goto :goto_a

    .line 340
    :cond_1b
    add-int/lit8 v11, v2, -0x2

    .line 341
    .line 342
    if-lt v9, v11, :cond_1c

    .line 343
    .line 344
    invoke-static {v9, v2, v0}, Landroidx/datastore/preferences/protobuf/v0;->a(II[B)I

    .line 345
    .line 346
    .line 347
    move-result v9

    .line 348
    goto :goto_b

    .line 349
    :cond_1c
    add-int/lit8 v13, v1, 0x2

    .line 350
    .line 351
    aget-byte v9, v0, v9

    .line 352
    .line 353
    if-gt v9, v7, :cond_1d

    .line 354
    .line 355
    shl-int/lit8 v10, v10, 0x1c

    .line 356
    .line 357
    add-int/lit8 v9, v9, 0x70

    .line 358
    .line 359
    add-int/2addr v9, v10

    .line 360
    shr-int/lit8 v9, v9, 0x1e

    .line 361
    .line 362
    if-nez v9, :cond_1d

    .line 363
    .line 364
    const/16 v19, 0x3

    .line 365
    .line 366
    add-int/lit8 v10, v1, 0x3

    .line 367
    .line 368
    aget-byte v9, v0, v13

    .line 369
    .line 370
    if-gt v9, v7, :cond_1d

    .line 371
    .line 372
    add-int/lit8 v1, v1, 0x4

    .line 373
    .line 374
    aget-byte v9, v0, v10

    .line 375
    .line 376
    if-le v9, v7, :cond_13

    .line 377
    .line 378
    :cond_1d
    :goto_a
    move/from16 v9, v20

    .line 379
    .line 380
    :goto_b
    return v9

    .line 381
    :cond_1e
    const/16 v19, 0x3

    .line 382
    .line 383
    move v1, v9

    .line 384
    goto :goto_8

    .line 385
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
