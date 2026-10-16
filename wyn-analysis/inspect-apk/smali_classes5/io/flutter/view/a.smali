.class public final Lio/flutter/view/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llc/h;
.implements Llc/i;


# instance fields
.field public final synthetic a:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lio/flutter/view/a;->a:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/nio/ByteBuffer;[Ljava/lang/String;[Ljava/nio/ByteBuffer;)V
    .locals 18

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    sget-object v2, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 6
    .line 7
    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 8
    .line 9
    .line 10
    array-length v2, v1

    .line 11
    const/4 v4, 0x0

    .line 12
    :goto_0
    if-ge v4, v2, :cond_0

    .line 13
    .line 14
    aget-object v5, v1, v4

    .line 15
    .line 16
    sget-object v6, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 17
    .line 18
    invoke-virtual {v5, v6}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 19
    .line 20
    .line 21
    add-int/lit8 v4, v4, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move-object/from16 v4, p0

    .line 25
    .line 26
    iget-object v2, v4, Lio/flutter/view/a;->a:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v2, Lio/flutter/view/l;

    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    new-instance v5, Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 36
    .line 37
    .line 38
    :goto_1
    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    const/16 v7, 0x10

    .line 43
    .line 44
    const/4 v8, -0x1

    .line 45
    const/4 v9, 0x1

    .line 46
    const/4 v11, 0x2

    .line 47
    iget-object v12, v2, Lio/flutter/view/l;->e:Lio/flutter/plugin/platform/j;

    .line 48
    .line 49
    const/4 v13, 0x0

    .line 50
    if-eqz v6, :cond_16

    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    .line 53
    .line 54
    .line 55
    move-result v6

    .line 56
    invoke-virtual {v2, v6}, Lio/flutter/view/l;->c(I)Lio/flutter/view/h;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    iput-boolean v9, v6, Lio/flutter/view/h;->C:Z

    .line 61
    .line 62
    iget-object v14, v6, Lio/flutter/view/h;->r:Ljava/lang/String;

    .line 63
    .line 64
    iput-object v14, v6, Lio/flutter/view/h;->I:Ljava/lang/String;

    .line 65
    .line 66
    iget-object v14, v6, Lio/flutter/view/h;->p:Ljava/lang/String;

    .line 67
    .line 68
    iput-object v14, v6, Lio/flutter/view/h;->J:Ljava/lang/String;

    .line 69
    .line 70
    iget v14, v6, Lio/flutter/view/h;->c:I

    .line 71
    .line 72
    iput v14, v6, Lio/flutter/view/h;->D:I

    .line 73
    .line 74
    iget v14, v6, Lio/flutter/view/h;->d:I

    .line 75
    .line 76
    iput v14, v6, Lio/flutter/view/h;->E:I

    .line 77
    .line 78
    iget v14, v6, Lio/flutter/view/h;->g:I

    .line 79
    .line 80
    iput v14, v6, Lio/flutter/view/h;->F:I

    .line 81
    .line 82
    iget v14, v6, Lio/flutter/view/h;->h:I

    .line 83
    .line 84
    iput v14, v6, Lio/flutter/view/h;->G:I

    .line 85
    .line 86
    iget v14, v6, Lio/flutter/view/h;->l:F

    .line 87
    .line 88
    iput v14, v6, Lio/flutter/view/h;->H:F

    .line 89
    .line 90
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    .line 91
    .line 92
    .line 93
    move-result v14

    .line 94
    iput v14, v6, Lio/flutter/view/h;->c:I

    .line 95
    .line 96
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    .line 97
    .line 98
    .line 99
    move-result v14

    .line 100
    iput v14, v6, Lio/flutter/view/h;->d:I

    .line 101
    .line 102
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    .line 103
    .line 104
    .line 105
    move-result v14

    .line 106
    iput v14, v6, Lio/flutter/view/h;->e:I

    .line 107
    .line 108
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    .line 109
    .line 110
    .line 111
    move-result v14

    .line 112
    iput v14, v6, Lio/flutter/view/h;->f:I

    .line 113
    .line 114
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    .line 115
    .line 116
    .line 117
    move-result v14

    .line 118
    iput v14, v6, Lio/flutter/view/h;->g:I

    .line 119
    .line 120
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    .line 121
    .line 122
    .line 123
    move-result v14

    .line 124
    iput v14, v6, Lio/flutter/view/h;->h:I

    .line 125
    .line 126
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    .line 127
    .line 128
    .line 129
    move-result v14

    .line 130
    iput v14, v6, Lio/flutter/view/h;->i:I

    .line 131
    .line 132
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    .line 133
    .line 134
    .line 135
    move-result v14

    .line 136
    iput v14, v6, Lio/flutter/view/h;->j:I

    .line 137
    .line 138
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    .line 139
    .line 140
    .line 141
    move-result v14

    .line 142
    iput v14, v6, Lio/flutter/view/h;->k:I

    .line 143
    .line 144
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getFloat()F

    .line 145
    .line 146
    .line 147
    move-result v14

    .line 148
    iput v14, v6, Lio/flutter/view/h;->l:F

    .line 149
    .line 150
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getFloat()F

    .line 151
    .line 152
    .line 153
    move-result v14

    .line 154
    iput v14, v6, Lio/flutter/view/h;->m:F

    .line 155
    .line 156
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getFloat()F

    .line 157
    .line 158
    .line 159
    move-result v14

    .line 160
    iput v14, v6, Lio/flutter/view/h;->n:F

    .line 161
    .line 162
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    .line 163
    .line 164
    .line 165
    move-result v14

    .line 166
    if-ne v14, v8, :cond_1

    .line 167
    .line 168
    move-object v14, v13

    .line 169
    goto :goto_2

    .line 170
    :cond_1
    aget-object v14, p2, v14

    .line 171
    .line 172
    :goto_2
    iput-object v14, v6, Lio/flutter/view/h;->o:Ljava/lang/String;

    .line 173
    .line 174
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    .line 175
    .line 176
    .line 177
    move-result v14

    .line 178
    if-ne v14, v8, :cond_2

    .line 179
    .line 180
    move-object v14, v13

    .line 181
    goto :goto_3

    .line 182
    :cond_2
    aget-object v14, p2, v14

    .line 183
    .line 184
    :goto_3
    iput-object v14, v6, Lio/flutter/view/h;->p:Ljava/lang/String;

    .line 185
    .line 186
    invoke-static {v0, v1}, Lio/flutter/view/h;->g(Ljava/nio/ByteBuffer;[Ljava/nio/ByteBuffer;)Ljava/util/ArrayList;

    .line 187
    .line 188
    .line 189
    move-result-object v14

    .line 190
    iput-object v14, v6, Lio/flutter/view/h;->q:Ljava/util/ArrayList;

    .line 191
    .line 192
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    .line 193
    .line 194
    .line 195
    move-result v14

    .line 196
    if-ne v14, v8, :cond_3

    .line 197
    .line 198
    move-object v14, v13

    .line 199
    goto :goto_4

    .line 200
    :cond_3
    aget-object v14, p2, v14

    .line 201
    .line 202
    :goto_4
    iput-object v14, v6, Lio/flutter/view/h;->r:Ljava/lang/String;

    .line 203
    .line 204
    invoke-static {v0, v1}, Lio/flutter/view/h;->g(Ljava/nio/ByteBuffer;[Ljava/nio/ByteBuffer;)Ljava/util/ArrayList;

    .line 205
    .line 206
    .line 207
    move-result-object v14

    .line 208
    iput-object v14, v6, Lio/flutter/view/h;->s:Ljava/util/ArrayList;

    .line 209
    .line 210
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    .line 211
    .line 212
    .line 213
    move-result v14

    .line 214
    if-ne v14, v8, :cond_4

    .line 215
    .line 216
    move-object v14, v13

    .line 217
    goto :goto_5

    .line 218
    :cond_4
    aget-object v14, p2, v14

    .line 219
    .line 220
    :goto_5
    iput-object v14, v6, Lio/flutter/view/h;->t:Ljava/lang/String;

    .line 221
    .line 222
    invoke-static {v0, v1}, Lio/flutter/view/h;->g(Ljava/nio/ByteBuffer;[Ljava/nio/ByteBuffer;)Ljava/util/ArrayList;

    .line 223
    .line 224
    .line 225
    move-result-object v14

    .line 226
    iput-object v14, v6, Lio/flutter/view/h;->u:Ljava/util/ArrayList;

    .line 227
    .line 228
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    .line 229
    .line 230
    .line 231
    move-result v14

    .line 232
    if-ne v14, v8, :cond_5

    .line 233
    .line 234
    move-object v14, v13

    .line 235
    goto :goto_6

    .line 236
    :cond_5
    aget-object v14, p2, v14

    .line 237
    .line 238
    :goto_6
    iput-object v14, v6, Lio/flutter/view/h;->v:Ljava/lang/String;

    .line 239
    .line 240
    invoke-static {v0, v1}, Lio/flutter/view/h;->g(Ljava/nio/ByteBuffer;[Ljava/nio/ByteBuffer;)Ljava/util/ArrayList;

    .line 241
    .line 242
    .line 243
    move-result-object v14

    .line 244
    iput-object v14, v6, Lio/flutter/view/h;->w:Ljava/util/ArrayList;

    .line 245
    .line 246
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    .line 247
    .line 248
    .line 249
    move-result v14

    .line 250
    if-ne v14, v8, :cond_6

    .line 251
    .line 252
    move-object v14, v13

    .line 253
    goto :goto_7

    .line 254
    :cond_6
    aget-object v14, p2, v14

    .line 255
    .line 256
    :goto_7
    iput-object v14, v6, Lio/flutter/view/h;->x:Ljava/lang/String;

    .line 257
    .line 258
    invoke-static {v0, v1}, Lio/flutter/view/h;->g(Ljava/nio/ByteBuffer;[Ljava/nio/ByteBuffer;)Ljava/util/ArrayList;

    .line 259
    .line 260
    .line 261
    move-result-object v14

    .line 262
    iput-object v14, v6, Lio/flutter/view/h;->y:Ljava/util/ArrayList;

    .line 263
    .line 264
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    .line 265
    .line 266
    .line 267
    move-result v14

    .line 268
    if-ne v14, v8, :cond_7

    .line 269
    .line 270
    move-object v14, v13

    .line 271
    goto :goto_8

    .line 272
    :cond_7
    aget-object v14, p2, v14

    .line 273
    .line 274
    :goto_8
    iput-object v14, v6, Lio/flutter/view/h;->z:Ljava/lang/String;

    .line 275
    .line 276
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    .line 277
    .line 278
    .line 279
    move-result v14

    .line 280
    if-ne v14, v8, :cond_8

    .line 281
    .line 282
    move-object v14, v13

    .line 283
    goto :goto_9

    .line 284
    :cond_8
    aget-object v14, p2, v14

    .line 285
    .line 286
    :goto_9
    iput-object v14, v6, Lio/flutter/view/h;->A:Ljava/lang/String;

    .line 287
    .line 288
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    .line 289
    .line 290
    .line 291
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getFloat()F

    .line 292
    .line 293
    .line 294
    move-result v14

    .line 295
    iput v14, v6, Lio/flutter/view/h;->K:F

    .line 296
    .line 297
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getFloat()F

    .line 298
    .line 299
    .line 300
    move-result v14

    .line 301
    iput v14, v6, Lio/flutter/view/h;->L:F

    .line 302
    .line 303
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getFloat()F

    .line 304
    .line 305
    .line 306
    move-result v14

    .line 307
    iput v14, v6, Lio/flutter/view/h;->M:F

    .line 308
    .line 309
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getFloat()F

    .line 310
    .line 311
    .line 312
    move-result v14

    .line 313
    iput v14, v6, Lio/flutter/view/h;->N:F

    .line 314
    .line 315
    iget-object v14, v6, Lio/flutter/view/h;->O:[F

    .line 316
    .line 317
    if-nez v14, :cond_9

    .line 318
    .line 319
    new-array v14, v7, [F

    .line 320
    .line 321
    iput-object v14, v6, Lio/flutter/view/h;->O:[F

    .line 322
    .line 323
    :cond_9
    const/4 v14, 0x0

    .line 324
    :goto_a
    if-ge v14, v7, :cond_a

    .line 325
    .line 326
    iget-object v15, v6, Lio/flutter/view/h;->O:[F

    .line 327
    .line 328
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getFloat()F

    .line 329
    .line 330
    .line 331
    move-result v16

    .line 332
    aput v16, v15, v14

    .line 333
    .line 334
    add-int/lit8 v14, v14, 0x1

    .line 335
    .line 336
    goto :goto_a

    .line 337
    :cond_a
    iput-boolean v9, v6, Lio/flutter/view/h;->V:Z

    .line 338
    .line 339
    iput-boolean v9, v6, Lio/flutter/view/h;->X:Z

    .line 340
    .line 341
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    .line 342
    .line 343
    .line 344
    move-result v7

    .line 345
    iget-object v14, v6, Lio/flutter/view/h;->Q:Ljava/util/ArrayList;

    .line 346
    .line 347
    invoke-virtual {v14}, Ljava/util/ArrayList;->clear()V

    .line 348
    .line 349
    .line 350
    iget-object v15, v6, Lio/flutter/view/h;->R:Ljava/util/ArrayList;

    .line 351
    .line 352
    invoke-virtual {v15}, Ljava/util/ArrayList;->clear()V

    .line 353
    .line 354
    .line 355
    const/4 v3, 0x0

    .line 356
    :goto_b
    iget-object v8, v6, Lio/flutter/view/h;->a:Lio/flutter/view/l;

    .line 357
    .line 358
    if-ge v3, v7, :cond_b

    .line 359
    .line 360
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    .line 361
    .line 362
    .line 363
    move-result v10

    .line 364
    invoke-virtual {v8, v10}, Lio/flutter/view/l;->c(I)Lio/flutter/view/h;

    .line 365
    .line 366
    .line 367
    move-result-object v8

    .line 368
    iput-object v6, v8, Lio/flutter/view/h;->P:Lio/flutter/view/h;

    .line 369
    .line 370
    invoke-virtual {v14, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 371
    .line 372
    .line 373
    add-int/lit8 v3, v3, 0x1

    .line 374
    .line 375
    goto :goto_b

    .line 376
    :cond_b
    const/4 v3, 0x0

    .line 377
    :goto_c
    if-ge v3, v7, :cond_c

    .line 378
    .line 379
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    .line 380
    .line 381
    .line 382
    move-result v10

    .line 383
    invoke-virtual {v8, v10}, Lio/flutter/view/l;->c(I)Lio/flutter/view/h;

    .line 384
    .line 385
    .line 386
    move-result-object v10

    .line 387
    iput-object v6, v10, Lio/flutter/view/h;->P:Lio/flutter/view/h;

    .line 388
    .line 389
    invoke-virtual {v15, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 390
    .line 391
    .line 392
    add-int/lit8 v3, v3, 0x1

    .line 393
    .line 394
    goto :goto_c

    .line 395
    :cond_c
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    .line 396
    .line 397
    .line 398
    move-result v3

    .line 399
    if-nez v3, :cond_e

    .line 400
    .line 401
    iput-object v13, v6, Lio/flutter/view/h;->S:Ljava/util/ArrayList;

    .line 402
    .line 403
    :cond_d
    const/16 v3, 0xe

    .line 404
    .line 405
    goto :goto_10

    .line 406
    :cond_e
    iget-object v7, v6, Lio/flutter/view/h;->S:Ljava/util/ArrayList;

    .line 407
    .line 408
    if-nez v7, :cond_f

    .line 409
    .line 410
    new-instance v7, Ljava/util/ArrayList;

    .line 411
    .line 412
    invoke-direct {v7, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 413
    .line 414
    .line 415
    iput-object v7, v6, Lio/flutter/view/h;->S:Ljava/util/ArrayList;

    .line 416
    .line 417
    goto :goto_d

    .line 418
    :cond_f
    invoke-virtual {v7}, Ljava/util/ArrayList;->clear()V

    .line 419
    .line 420
    .line 421
    :goto_d
    const/4 v7, 0x0

    .line 422
    :goto_e
    if-ge v7, v3, :cond_d

    .line 423
    .line 424
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    .line 425
    .line 426
    .line 427
    move-result v10

    .line 428
    invoke-virtual {v8, v10}, Lio/flutter/view/l;->b(I)Lio/flutter/view/f;

    .line 429
    .line 430
    .line 431
    move-result-object v10

    .line 432
    iget v13, v10, Lio/flutter/view/f;->c:I

    .line 433
    .line 434
    if-ne v13, v9, :cond_10

    .line 435
    .line 436
    iput-object v10, v6, Lio/flutter/view/h;->T:Lio/flutter/view/f;

    .line 437
    .line 438
    goto :goto_f

    .line 439
    :cond_10
    if-ne v13, v11, :cond_11

    .line 440
    .line 441
    iput-object v10, v6, Lio/flutter/view/h;->U:Lio/flutter/view/f;

    .line 442
    .line 443
    goto :goto_f

    .line 444
    :cond_11
    iget-object v13, v6, Lio/flutter/view/h;->S:Ljava/util/ArrayList;

    .line 445
    .line 446
    invoke-virtual {v13, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 447
    .line 448
    .line 449
    :goto_f
    iget-object v13, v6, Lio/flutter/view/h;->S:Ljava/util/ArrayList;

    .line 450
    .line 451
    invoke-virtual {v13, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 452
    .line 453
    .line 454
    add-int/lit8 v7, v7, 0x1

    .line 455
    .line 456
    goto :goto_e

    .line 457
    :goto_10
    invoke-virtual {v6, v3}, Lio/flutter/view/h;->h(I)Z

    .line 458
    .line 459
    .line 460
    move-result v3

    .line 461
    if-eqz v3, :cond_12

    .line 462
    .line 463
    goto/16 :goto_1

    .line 464
    .line 465
    :cond_12
    const/4 v3, 0x6

    .line 466
    invoke-virtual {v6, v3}, Lio/flutter/view/h;->h(I)Z

    .line 467
    .line 468
    .line 469
    move-result v3

    .line 470
    if-eqz v3, :cond_13

    .line 471
    .line 472
    iput-object v6, v2, Lio/flutter/view/l;->m:Lio/flutter/view/h;

    .line 473
    .line 474
    :cond_13
    iget-boolean v3, v6, Lio/flutter/view/h;->C:Z

    .line 475
    .line 476
    if-eqz v3, :cond_14

    .line 477
    .line 478
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 479
    .line 480
    .line 481
    :cond_14
    iget v3, v6, Lio/flutter/view/h;->i:I

    .line 482
    .line 483
    const/4 v7, -0x1

    .line 484
    if-eq v3, v7, :cond_15

    .line 485
    .line 486
    invoke-interface {v12, v3}, Lio/flutter/plugin/platform/j;->c(I)Z

    .line 487
    .line 488
    .line 489
    move-result v3

    .line 490
    if-nez v3, :cond_15

    .line 491
    .line 492
    iget v3, v6, Lio/flutter/view/h;->i:I

    .line 493
    .line 494
    invoke-interface {v12, v3}, Lio/flutter/plugin/platform/j;->b(I)Landroid/view/View;

    .line 495
    .line 496
    .line 497
    move-result-object v3

    .line 498
    if-eqz v3, :cond_15

    .line 499
    .line 500
    const/4 v6, 0x0

    .line 501
    invoke-virtual {v3, v6}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 502
    .line 503
    .line 504
    goto/16 :goto_1

    .line 505
    .line 506
    :cond_15
    const/4 v6, 0x0

    .line 507
    goto/16 :goto_1

    .line 508
    .line 509
    :cond_16
    const/4 v6, 0x0

    .line 510
    new-instance v0, Ljava/util/HashSet;

    .line 511
    .line 512
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 513
    .line 514
    .line 515
    iget-object v1, v2, Lio/flutter/view/l;->g:Ljava/util/HashMap;

    .line 516
    .line 517
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 518
    .line 519
    .line 520
    move-result-object v3

    .line 521
    invoke-virtual {v1, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 522
    .line 523
    .line 524
    move-result-object v3

    .line 525
    check-cast v3, Lio/flutter/view/h;

    .line 526
    .line 527
    new-instance v8, Ljava/util/ArrayList;

    .line 528
    .line 529
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 530
    .line 531
    .line 532
    const/16 v10, 0x1c

    .line 533
    .line 534
    iget-object v14, v2, Lio/flutter/view/l;->a:Lkc/r;

    .line 535
    .line 536
    if-eqz v3, :cond_1b

    .line 537
    .line 538
    new-array v15, v7, [F

    .line 539
    .line 540
    invoke-static {v15, v6}, Landroid/opengl/Matrix;->setIdentityM([FI)V

    .line 541
    .line 542
    .line 543
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 544
    .line 545
    if-lt v6, v10, :cond_19

    .line 546
    .line 547
    invoke-virtual {v14}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 548
    .line 549
    .line 550
    move-result-object v6

    .line 551
    invoke-static {v6}, LS3/f;->t(Landroid/content/Context;)Landroid/app/Activity;

    .line 552
    .line 553
    .line 554
    move-result-object v6

    .line 555
    if-eqz v6, :cond_18

    .line 556
    .line 557
    invoke-virtual {v6}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 558
    .line 559
    .line 560
    move-result-object v17

    .line 561
    if-nez v17, :cond_17

    .line 562
    .line 563
    goto :goto_11

    .line 564
    :cond_17
    invoke-virtual {v6}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 565
    .line 566
    .line 567
    move-result-object v6

    .line 568
    invoke-virtual {v6}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 569
    .line 570
    .line 571
    move-result-object v6

    .line 572
    invoke-static {v6}, LA0/j;->e(Landroid/view/WindowManager$LayoutParams;)I

    .line 573
    .line 574
    .line 575
    move-result v6

    .line 576
    if-eq v6, v11, :cond_19

    .line 577
    .line 578
    if-nez v6, :cond_18

    .line 579
    .line 580
    goto :goto_12

    .line 581
    :cond_18
    :goto_11
    const/4 v11, 0x0

    .line 582
    goto :goto_13

    .line 583
    :cond_19
    :goto_12
    invoke-virtual {v14}, Landroid/view/View;->getRootWindowInsets()Landroid/view/WindowInsets;

    .line 584
    .line 585
    .line 586
    move-result-object v6

    .line 587
    if-eqz v6, :cond_18

    .line 588
    .line 589
    iget-object v11, v2, Lio/flutter/view/l;->r:Ljava/lang/Integer;

    .line 590
    .line 591
    invoke-virtual {v6}, Landroid/view/WindowInsets;->getSystemWindowInsetLeft()I

    .line 592
    .line 593
    .line 594
    move-result v17

    .line 595
    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 596
    .line 597
    .line 598
    move-result-object v7

    .line 599
    invoke-virtual {v11, v7}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    .line 600
    .line 601
    .line 602
    move-result v7

    .line 603
    if-nez v7, :cond_1a

    .line 604
    .line 605
    iput-boolean v9, v3, Lio/flutter/view/h;->X:Z

    .line 606
    .line 607
    iput-boolean v9, v3, Lio/flutter/view/h;->V:Z

    .line 608
    .line 609
    :cond_1a
    invoke-virtual {v6}, Landroid/view/WindowInsets;->getSystemWindowInsetLeft()I

    .line 610
    .line 611
    .line 612
    move-result v6

    .line 613
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 614
    .line 615
    .line 616
    move-result-object v7

    .line 617
    iput-object v7, v2, Lio/flutter/view/l;->r:Ljava/lang/Integer;

    .line 618
    .line 619
    int-to-float v6, v6

    .line 620
    const/4 v7, 0x0

    .line 621
    const/4 v11, 0x0

    .line 622
    invoke-static {v15, v11, v6, v7, v7}, Landroid/opengl/Matrix;->translateM([FIFFF)V

    .line 623
    .line 624
    .line 625
    :goto_13
    invoke-virtual {v3, v15, v0, v11}, Lio/flutter/view/h;->l([FLjava/util/HashSet;Z)V

    .line 626
    .line 627
    .line 628
    invoke-virtual {v3, v8}, Lio/flutter/view/h;->c(Ljava/util/ArrayList;)V

    .line 629
    .line 630
    .line 631
    :cond_1b
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 632
    .line 633
    .line 634
    move-result-object v3

    .line 635
    move-object v6, v13

    .line 636
    :cond_1c
    :goto_14
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 637
    .line 638
    .line 639
    move-result v7

    .line 640
    iget-object v11, v2, Lio/flutter/view/l;->p:Ljava/util/ArrayList;

    .line 641
    .line 642
    if-eqz v7, :cond_1d

    .line 643
    .line 644
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 645
    .line 646
    .line 647
    move-result-object v7

    .line 648
    check-cast v7, Lio/flutter/view/h;

    .line 649
    .line 650
    iget v15, v7, Lio/flutter/view/h;->b:I

    .line 651
    .line 652
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 653
    .line 654
    .line 655
    move-result-object v15

    .line 656
    invoke-virtual {v11, v15}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 657
    .line 658
    .line 659
    move-result v11

    .line 660
    if-nez v11, :cond_1c

    .line 661
    .line 662
    move-object v6, v7

    .line 663
    goto :goto_14

    .line 664
    :cond_1d
    if-nez v6, :cond_1e

    .line 665
    .line 666
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 667
    .line 668
    .line 669
    move-result v3

    .line 670
    if-lez v3, :cond_1e

    .line 671
    .line 672
    invoke-static {v8, v9}, Lka/n;->e(Ljava/util/ArrayList;I)Ljava/lang/Object;

    .line 673
    .line 674
    .line 675
    move-result-object v3

    .line 676
    move-object v6, v3

    .line 677
    check-cast v6, Lio/flutter/view/h;

    .line 678
    .line 679
    :cond_1e
    if-eqz v6, :cond_22

    .line 680
    .line 681
    iget v3, v6, Lio/flutter/view/h;->b:I

    .line 682
    .line 683
    iget v7, v2, Lio/flutter/view/l;->q:I

    .line 684
    .line 685
    if-ne v3, v7, :cond_1f

    .line 686
    .line 687
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 688
    .line 689
    .line 690
    move-result v3

    .line 691
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 692
    .line 693
    .line 694
    move-result v7

    .line 695
    if-eq v3, v7, :cond_22

    .line 696
    .line 697
    :cond_1f
    iget v3, v6, Lio/flutter/view/h;->b:I

    .line 698
    .line 699
    iput v3, v2, Lio/flutter/view/l;->q:I

    .line 700
    .line 701
    invoke-virtual {v6}, Lio/flutter/view/h;->f()Ljava/lang/String;

    .line 702
    .line 703
    .line 704
    move-result-object v3

    .line 705
    if-nez v3, :cond_20

    .line 706
    .line 707
    const-string v3, " "

    .line 708
    .line 709
    :cond_20
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 710
    .line 711
    if-lt v7, v10, :cond_21

    .line 712
    .line 713
    invoke-static {v14, v3}, Ldb/b;->x(Lkc/r;Ljava/lang/String;)V

    .line 714
    .line 715
    .line 716
    goto :goto_15

    .line 717
    :cond_21
    iget v6, v6, Lio/flutter/view/h;->b:I

    .line 718
    .line 719
    const/16 v7, 0x20

    .line 720
    .line 721
    invoke-virtual {v2, v6, v7}, Lio/flutter/view/l;->d(II)Landroid/view/accessibility/AccessibilityEvent;

    .line 722
    .line 723
    .line 724
    move-result-object v6

    .line 725
    invoke-virtual {v6}, Landroid/view/accessibility/AccessibilityRecord;->getText()Ljava/util/List;

    .line 726
    .line 727
    .line 728
    move-result-object v7

    .line 729
    invoke-interface {v7, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 730
    .line 731
    .line 732
    invoke-virtual {v2, v6}, Lio/flutter/view/l;->h(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 733
    .line 734
    .line 735
    :cond_22
    :goto_15
    invoke-virtual {v11}, Ljava/util/ArrayList;->clear()V

    .line 736
    .line 737
    .line 738
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 739
    .line 740
    .line 741
    move-result-object v3

    .line 742
    :goto_16
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 743
    .line 744
    .line 745
    move-result v6

    .line 746
    if-eqz v6, :cond_23

    .line 747
    .line 748
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 749
    .line 750
    .line 751
    move-result-object v6

    .line 752
    check-cast v6, Lio/flutter/view/h;

    .line 753
    .line 754
    iget v6, v6, Lio/flutter/view/h;->b:I

    .line 755
    .line 756
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 757
    .line 758
    .line 759
    move-result-object v6

    .line 760
    invoke-virtual {v11, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 761
    .line 762
    .line 763
    goto :goto_16

    .line 764
    :cond_23
    invoke-virtual {v1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 765
    .line 766
    .line 767
    move-result-object v1

    .line 768
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 769
    .line 770
    .line 771
    move-result-object v1

    .line 772
    :goto_17
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 773
    .line 774
    .line 775
    move-result v3

    .line 776
    const/4 v6, 0x4

    .line 777
    if-eqz v3, :cond_2a

    .line 778
    .line 779
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 780
    .line 781
    .line 782
    move-result-object v3

    .line 783
    check-cast v3, Ljava/util/Map$Entry;

    .line 784
    .line 785
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 786
    .line 787
    .line 788
    move-result-object v3

    .line 789
    check-cast v3, Lio/flutter/view/h;

    .line 790
    .line 791
    invoke-virtual {v0, v3}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 792
    .line 793
    .line 794
    move-result v7

    .line 795
    if-nez v7, :cond_29

    .line 796
    .line 797
    iput-object v13, v3, Lio/flutter/view/h;->P:Lio/flutter/view/h;

    .line 798
    .line 799
    iget v7, v3, Lio/flutter/view/h;->i:I

    .line 800
    .line 801
    const/high16 v8, 0x10000

    .line 802
    .line 803
    const/4 v10, -0x1

    .line 804
    if-eq v7, v10, :cond_24

    .line 805
    .line 806
    iget-object v7, v2, Lio/flutter/view/l;->j:Ljava/lang/Integer;

    .line 807
    .line 808
    if-eqz v7, :cond_24

    .line 809
    .line 810
    iget-object v10, v2, Lio/flutter/view/l;->d:Lio/flutter/view/AccessibilityViewEmbedder;

    .line 811
    .line 812
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 813
    .line 814
    .line 815
    move-result v7

    .line 816
    invoke-virtual {v10, v7}, Lio/flutter/view/AccessibilityViewEmbedder;->platformViewOfNode(I)Landroid/view/View;

    .line 817
    .line 818
    .line 819
    move-result-object v7

    .line 820
    iget v10, v3, Lio/flutter/view/h;->i:I

    .line 821
    .line 822
    invoke-interface {v12, v10}, Lio/flutter/plugin/platform/j;->b(I)Landroid/view/View;

    .line 823
    .line 824
    .line 825
    move-result-object v10

    .line 826
    if-ne v7, v10, :cond_24

    .line 827
    .line 828
    iget-object v7, v2, Lio/flutter/view/l;->j:Ljava/lang/Integer;

    .line 829
    .line 830
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 831
    .line 832
    .line 833
    move-result v7

    .line 834
    invoke-virtual {v2, v7, v8}, Lio/flutter/view/l;->g(II)V

    .line 835
    .line 836
    .line 837
    iput-object v13, v2, Lio/flutter/view/l;->j:Ljava/lang/Integer;

    .line 838
    .line 839
    :cond_24
    iget v7, v3, Lio/flutter/view/h;->i:I

    .line 840
    .line 841
    const/4 v10, -0x1

    .line 842
    if-eq v7, v10, :cond_25

    .line 843
    .line 844
    invoke-interface {v12, v7}, Lio/flutter/plugin/platform/j;->b(I)Landroid/view/View;

    .line 845
    .line 846
    .line 847
    move-result-object v7

    .line 848
    if-eqz v7, :cond_25

    .line 849
    .line 850
    invoke-virtual {v7, v6}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 851
    .line 852
    .line 853
    :cond_25
    iget-object v6, v2, Lio/flutter/view/l;->i:Lio/flutter/view/h;

    .line 854
    .line 855
    if-ne v6, v3, :cond_26

    .line 856
    .line 857
    iget v6, v6, Lio/flutter/view/h;->b:I

    .line 858
    .line 859
    invoke-virtual {v2, v6, v8}, Lio/flutter/view/l;->g(II)V

    .line 860
    .line 861
    .line 862
    iput-object v13, v2, Lio/flutter/view/l;->i:Lio/flutter/view/h;

    .line 863
    .line 864
    :cond_26
    iget-object v6, v2, Lio/flutter/view/l;->m:Lio/flutter/view/h;

    .line 865
    .line 866
    if-ne v6, v3, :cond_27

    .line 867
    .line 868
    iput-object v13, v2, Lio/flutter/view/l;->m:Lio/flutter/view/h;

    .line 869
    .line 870
    :cond_27
    iget-object v6, v2, Lio/flutter/view/l;->o:Lio/flutter/view/h;

    .line 871
    .line 872
    if-ne v6, v3, :cond_28

    .line 873
    .line 874
    iput-object v13, v2, Lio/flutter/view/l;->o:Lio/flutter/view/h;

    .line 875
    .line 876
    :cond_28
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    .line 877
    .line 878
    .line 879
    goto :goto_17

    .line 880
    :cond_29
    const/4 v10, -0x1

    .line 881
    goto :goto_17

    .line 882
    :cond_2a
    const/16 v0, 0x800

    .line 883
    .line 884
    const/4 v11, 0x0

    .line 885
    invoke-virtual {v2, v11, v0}, Lio/flutter/view/l;->d(II)Landroid/view/accessibility/AccessibilityEvent;

    .line 886
    .line 887
    .line 888
    move-result-object v1

    .line 889
    invoke-virtual {v1, v9}, Landroid/view/accessibility/AccessibilityEvent;->setContentChangeTypes(I)V

    .line 890
    .line 891
    .line 892
    invoke-virtual {v2, v1}, Lio/flutter/view/l;->h(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 893
    .line 894
    .line 895
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 896
    .line 897
    .line 898
    move-result-object v1

    .line 899
    :goto_18
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 900
    .line 901
    .line 902
    move-result v3

    .line 903
    if-eqz v3, :cond_4b

    .line 904
    .line 905
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 906
    .line 907
    .line 908
    move-result-object v3

    .line 909
    check-cast v3, Lio/flutter/view/h;

    .line 910
    .line 911
    iget v5, v3, Lio/flutter/view/h;->l:F

    .line 912
    .line 913
    invoke-static {v5}, Ljava/lang/Float;->isNaN(F)Z

    .line 914
    .line 915
    .line 916
    move-result v5

    .line 917
    if-nez v5, :cond_36

    .line 918
    .line 919
    iget v5, v3, Lio/flutter/view/h;->H:F

    .line 920
    .line 921
    invoke-static {v5}, Ljava/lang/Float;->isNaN(F)Z

    .line 922
    .line 923
    .line 924
    move-result v5

    .line 925
    if-nez v5, :cond_36

    .line 926
    .line 927
    iget v5, v3, Lio/flutter/view/h;->H:F

    .line 928
    .line 929
    iget v7, v3, Lio/flutter/view/h;->l:F

    .line 930
    .line 931
    cmpl-float v5, v5, v7

    .line 932
    .line 933
    if-eqz v5, :cond_36

    .line 934
    .line 935
    iget v5, v3, Lio/flutter/view/h;->b:I

    .line 936
    .line 937
    const/16 v7, 0x1000

    .line 938
    .line 939
    invoke-virtual {v2, v5, v7}, Lio/flutter/view/l;->d(II)Landroid/view/accessibility/AccessibilityEvent;

    .line 940
    .line 941
    .line 942
    move-result-object v5

    .line 943
    iget v7, v3, Lio/flutter/view/h;->l:F

    .line 944
    .line 945
    iget v8, v3, Lio/flutter/view/h;->m:F

    .line 946
    .line 947
    invoke-static {v8}, Ljava/lang/Float;->isInfinite(F)Z

    .line 948
    .line 949
    .line 950
    move-result v10

    .line 951
    const v12, 0x47c35000    # 100000.0f

    .line 952
    .line 953
    .line 954
    if-eqz v10, :cond_2c

    .line 955
    .line 956
    const v8, 0x4788b800    # 70000.0f

    .line 957
    .line 958
    .line 959
    cmpl-float v10, v7, v8

    .line 960
    .line 961
    if-lez v10, :cond_2b

    .line 962
    .line 963
    move v7, v8

    .line 964
    :cond_2b
    move v8, v12

    .line 965
    :cond_2c
    iget v10, v3, Lio/flutter/view/h;->n:F

    .line 966
    .line 967
    invoke-static {v10}, Ljava/lang/Float;->isInfinite(F)Z

    .line 968
    .line 969
    .line 970
    move-result v10

    .line 971
    if-eqz v10, :cond_2e

    .line 972
    .line 973
    add-float/2addr v8, v12

    .line 974
    const v10, -0x38774800    # -70000.0f

    .line 975
    .line 976
    .line 977
    cmpg-float v14, v7, v10

    .line 978
    .line 979
    if-gez v14, :cond_2d

    .line 980
    .line 981
    move v7, v10

    .line 982
    :cond_2d
    add-float/2addr v7, v12

    .line 983
    goto :goto_19

    .line 984
    :cond_2e
    iget v10, v3, Lio/flutter/view/h;->n:F

    .line 985
    .line 986
    sub-float/2addr v8, v10

    .line 987
    sub-float/2addr v7, v10

    .line 988
    :goto_19
    iget v10, v3, Lio/flutter/view/h;->E:I

    .line 989
    .line 990
    and-int/lit8 v12, v10, 0x10

    .line 991
    .line 992
    if-eqz v12, :cond_2f

    .line 993
    .line 994
    goto :goto_1a

    .line 995
    :cond_2f
    and-int/lit8 v12, v10, 0x20

    .line 996
    .line 997
    if-eqz v12, :cond_30

    .line 998
    .line 999
    :goto_1a
    float-to-int v7, v7

    .line 1000
    invoke-virtual {v5, v7}, Landroid/view/accessibility/AccessibilityRecord;->setScrollY(I)V

    .line 1001
    .line 1002
    .line 1003
    float-to-int v7, v8

    .line 1004
    invoke-virtual {v5, v7}, Landroid/view/accessibility/AccessibilityRecord;->setMaxScrollY(I)V

    .line 1005
    .line 1006
    .line 1007
    goto :goto_1c

    .line 1008
    :cond_30
    and-int/lit8 v12, v10, 0x4

    .line 1009
    .line 1010
    if-eqz v12, :cond_31

    .line 1011
    .line 1012
    goto :goto_1b

    .line 1013
    :cond_31
    and-int/lit8 v10, v10, 0x8

    .line 1014
    .line 1015
    if-eqz v10, :cond_32

    .line 1016
    .line 1017
    :goto_1b
    float-to-int v7, v7

    .line 1018
    invoke-virtual {v5, v7}, Landroid/view/accessibility/AccessibilityRecord;->setScrollX(I)V

    .line 1019
    .line 1020
    .line 1021
    float-to-int v7, v8

    .line 1022
    invoke-virtual {v5, v7}, Landroid/view/accessibility/AccessibilityRecord;->setMaxScrollX(I)V

    .line 1023
    .line 1024
    .line 1025
    :cond_32
    :goto_1c
    iget v7, v3, Lio/flutter/view/h;->j:I

    .line 1026
    .line 1027
    if-lez v7, :cond_35

    .line 1028
    .line 1029
    invoke-virtual {v5, v7}, Landroid/view/accessibility/AccessibilityRecord;->setItemCount(I)V

    .line 1030
    .line 1031
    .line 1032
    iget v7, v3, Lio/flutter/view/h;->k:I

    .line 1033
    .line 1034
    invoke-virtual {v5, v7}, Landroid/view/accessibility/AccessibilityRecord;->setFromIndex(I)V

    .line 1035
    .line 1036
    .line 1037
    iget-object v7, v3, Lio/flutter/view/h;->R:Ljava/util/ArrayList;

    .line 1038
    .line 1039
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1040
    .line 1041
    .line 1042
    move-result-object v7

    .line 1043
    move v8, v11

    .line 1044
    :cond_33
    :goto_1d
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 1045
    .line 1046
    .line 1047
    move-result v10

    .line 1048
    if-eqz v10, :cond_34

    .line 1049
    .line 1050
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1051
    .line 1052
    .line 1053
    move-result-object v10

    .line 1054
    check-cast v10, Lio/flutter/view/h;

    .line 1055
    .line 1056
    const/16 v12, 0xe

    .line 1057
    .line 1058
    invoke-virtual {v10, v12}, Lio/flutter/view/h;->h(I)Z

    .line 1059
    .line 1060
    .line 1061
    move-result v10

    .line 1062
    if-nez v10, :cond_33

    .line 1063
    .line 1064
    add-int/lit8 v8, v8, 0x1

    .line 1065
    .line 1066
    goto :goto_1d

    .line 1067
    :cond_34
    const/16 v12, 0xe

    .line 1068
    .line 1069
    iget v7, v3, Lio/flutter/view/h;->k:I

    .line 1070
    .line 1071
    add-int/2addr v7, v8

    .line 1072
    sub-int/2addr v7, v9

    .line 1073
    invoke-virtual {v5, v7}, Landroid/view/accessibility/AccessibilityRecord;->setToIndex(I)V

    .line 1074
    .line 1075
    .line 1076
    goto :goto_1e

    .line 1077
    :cond_35
    const/16 v12, 0xe

    .line 1078
    .line 1079
    :goto_1e
    invoke-virtual {v2, v5}, Lio/flutter/view/l;->h(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 1080
    .line 1081
    .line 1082
    :goto_1f
    const/16 v5, 0x10

    .line 1083
    .line 1084
    goto :goto_20

    .line 1085
    :cond_36
    const/16 v12, 0xe

    .line 1086
    .line 1087
    goto :goto_1f

    .line 1088
    :goto_20
    invoke-virtual {v3, v5}, Lio/flutter/view/h;->h(I)Z

    .line 1089
    .line 1090
    .line 1091
    move-result v7

    .line 1092
    if-eqz v7, :cond_39

    .line 1093
    .line 1094
    iget-object v5, v3, Lio/flutter/view/h;->p:Ljava/lang/String;

    .line 1095
    .line 1096
    if-nez v5, :cond_37

    .line 1097
    .line 1098
    iget-object v7, v3, Lio/flutter/view/h;->J:Ljava/lang/String;

    .line 1099
    .line 1100
    if-nez v7, :cond_37

    .line 1101
    .line 1102
    goto :goto_21

    .line 1103
    :cond_37
    if-eqz v5, :cond_38

    .line 1104
    .line 1105
    iget-object v7, v3, Lio/flutter/view/h;->J:Ljava/lang/String;

    .line 1106
    .line 1107
    if-eqz v7, :cond_38

    .line 1108
    .line 1109
    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1110
    .line 1111
    .line 1112
    move-result v5

    .line 1113
    if-nez v5, :cond_39

    .line 1114
    .line 1115
    :cond_38
    iget v5, v3, Lio/flutter/view/h;->b:I

    .line 1116
    .line 1117
    invoke-virtual {v2, v5, v0}, Lio/flutter/view/l;->d(II)Landroid/view/accessibility/AccessibilityEvent;

    .line 1118
    .line 1119
    .line 1120
    move-result-object v5

    .line 1121
    invoke-virtual {v5, v9}, Landroid/view/accessibility/AccessibilityEvent;->setContentChangeTypes(I)V

    .line 1122
    .line 1123
    .line 1124
    invoke-virtual {v2, v5}, Lio/flutter/view/l;->h(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 1125
    .line 1126
    .line 1127
    :cond_39
    :goto_21
    iget-object v5, v2, Lio/flutter/view/l;->i:Lio/flutter/view/h;

    .line 1128
    .line 1129
    if-eqz v5, :cond_3b

    .line 1130
    .line 1131
    iget v5, v5, Lio/flutter/view/h;->b:I

    .line 1132
    .line 1133
    iget v7, v3, Lio/flutter/view/h;->b:I

    .line 1134
    .line 1135
    if-ne v5, v7, :cond_3b

    .line 1136
    .line 1137
    iget v5, v3, Lio/flutter/view/h;->D:I

    .line 1138
    .line 1139
    const/4 v7, 0x3

    .line 1140
    invoke-static {v7}, Lcom/google/android/gms/internal/consent_sdk/a;->l(I)I

    .line 1141
    .line 1142
    .line 1143
    move-result v8

    .line 1144
    and-int/2addr v5, v8

    .line 1145
    if-eqz v5, :cond_3a

    .line 1146
    .line 1147
    goto :goto_22

    .line 1148
    :cond_3a
    invoke-virtual {v3, v7}, Lio/flutter/view/h;->h(I)Z

    .line 1149
    .line 1150
    .line 1151
    move-result v5

    .line 1152
    if-eqz v5, :cond_3b

    .line 1153
    .line 1154
    iget v5, v3, Lio/flutter/view/h;->b:I

    .line 1155
    .line 1156
    invoke-virtual {v2, v5, v6}, Lio/flutter/view/l;->d(II)Landroid/view/accessibility/AccessibilityEvent;

    .line 1157
    .line 1158
    .line 1159
    move-result-object v5

    .line 1160
    invoke-virtual {v5}, Landroid/view/accessibility/AccessibilityRecord;->getText()Ljava/util/List;

    .line 1161
    .line 1162
    .line 1163
    move-result-object v7

    .line 1164
    iget-object v8, v3, Lio/flutter/view/h;->p:Ljava/lang/String;

    .line 1165
    .line 1166
    invoke-interface {v7, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1167
    .line 1168
    .line 1169
    invoke-virtual {v2, v5}, Lio/flutter/view/l;->h(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 1170
    .line 1171
    .line 1172
    :cond_3b
    :goto_22
    iget-object v5, v2, Lio/flutter/view/l;->m:Lio/flutter/view/h;

    .line 1173
    .line 1174
    if-eqz v5, :cond_3d

    .line 1175
    .line 1176
    iget v7, v5, Lio/flutter/view/h;->b:I

    .line 1177
    .line 1178
    iget v8, v3, Lio/flutter/view/h;->b:I

    .line 1179
    .line 1180
    if-ne v7, v8, :cond_3d

    .line 1181
    .line 1182
    iget-object v10, v2, Lio/flutter/view/l;->n:Lio/flutter/view/h;

    .line 1183
    .line 1184
    if-eqz v10, :cond_3c

    .line 1185
    .line 1186
    iget v10, v10, Lio/flutter/view/h;->b:I

    .line 1187
    .line 1188
    if-eq v10, v7, :cond_3d

    .line 1189
    .line 1190
    :cond_3c
    iput-object v5, v2, Lio/flutter/view/l;->n:Lio/flutter/view/h;

    .line 1191
    .line 1192
    const/16 v5, 0x8

    .line 1193
    .line 1194
    invoke-virtual {v2, v8, v5}, Lio/flutter/view/l;->d(II)Landroid/view/accessibility/AccessibilityEvent;

    .line 1195
    .line 1196
    .line 1197
    move-result-object v5

    .line 1198
    invoke-virtual {v2, v5}, Lio/flutter/view/l;->h(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 1199
    .line 1200
    .line 1201
    goto :goto_23

    .line 1202
    :cond_3d
    if-nez v5, :cond_3e

    .line 1203
    .line 1204
    iput-object v13, v2, Lio/flutter/view/l;->n:Lio/flutter/view/h;

    .line 1205
    .line 1206
    :cond_3e
    :goto_23
    iget-object v5, v2, Lio/flutter/view/l;->m:Lio/flutter/view/h;

    .line 1207
    .line 1208
    if-eqz v5, :cond_3f

    .line 1209
    .line 1210
    iget v5, v5, Lio/flutter/view/h;->b:I

    .line 1211
    .line 1212
    iget v7, v3, Lio/flutter/view/h;->b:I

    .line 1213
    .line 1214
    if-ne v5, v7, :cond_3f

    .line 1215
    .line 1216
    iget v5, v3, Lio/flutter/view/h;->D:I

    .line 1217
    .line 1218
    const/4 v7, 0x5

    .line 1219
    invoke-static {v7}, Lcom/google/android/gms/internal/consent_sdk/a;->l(I)I

    .line 1220
    .line 1221
    .line 1222
    move-result v8

    .line 1223
    and-int/2addr v5, v8

    .line 1224
    if-eqz v5, :cond_3f

    .line 1225
    .line 1226
    invoke-virtual {v3, v7}, Lio/flutter/view/h;->h(I)Z

    .line 1227
    .line 1228
    .line 1229
    move-result v5

    .line 1230
    if-eqz v5, :cond_3f

    .line 1231
    .line 1232
    iget-object v5, v2, Lio/flutter/view/l;->i:Lio/flutter/view/h;

    .line 1233
    .line 1234
    if-eqz v5, :cond_40

    .line 1235
    .line 1236
    iget v5, v5, Lio/flutter/view/h;->b:I

    .line 1237
    .line 1238
    iget-object v7, v2, Lio/flutter/view/l;->m:Lio/flutter/view/h;

    .line 1239
    .line 1240
    iget v7, v7, Lio/flutter/view/h;->b:I

    .line 1241
    .line 1242
    if-ne v5, v7, :cond_3f

    .line 1243
    .line 1244
    goto :goto_24

    .line 1245
    :cond_3f
    move/from16 v16, v9

    .line 1246
    .line 1247
    const/16 v10, 0x10

    .line 1248
    .line 1249
    goto/16 :goto_2b

    .line 1250
    .line 1251
    :cond_40
    :goto_24
    iget-object v5, v3, Lio/flutter/view/h;->I:Ljava/lang/String;

    .line 1252
    .line 1253
    const-string v7, ""

    .line 1254
    .line 1255
    if-eqz v5, :cond_41

    .line 1256
    .line 1257
    goto :goto_25

    .line 1258
    :cond_41
    move-object v5, v7

    .line 1259
    :goto_25
    iget-object v8, v3, Lio/flutter/view/h;->r:Ljava/lang/String;

    .line 1260
    .line 1261
    if-eqz v8, :cond_42

    .line 1262
    .line 1263
    move-object v7, v8

    .line 1264
    :cond_42
    iget v8, v3, Lio/flutter/view/h;->b:I

    .line 1265
    .line 1266
    const/16 v10, 0x10

    .line 1267
    .line 1268
    invoke-virtual {v2, v8, v10}, Lio/flutter/view/l;->d(II)Landroid/view/accessibility/AccessibilityEvent;

    .line 1269
    .line 1270
    .line 1271
    move-result-object v8

    .line 1272
    invoke-virtual {v8, v5}, Landroid/view/accessibility/AccessibilityRecord;->setBeforeText(Ljava/lang/CharSequence;)V

    .line 1273
    .line 1274
    .line 1275
    invoke-virtual {v8}, Landroid/view/accessibility/AccessibilityRecord;->getText()Ljava/util/List;

    .line 1276
    .line 1277
    .line 1278
    move-result-object v14

    .line 1279
    invoke-interface {v14, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1280
    .line 1281
    .line 1282
    move v14, v11

    .line 1283
    :goto_26
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 1284
    .line 1285
    .line 1286
    move-result v15

    .line 1287
    if-ge v14, v15, :cond_44

    .line 1288
    .line 1289
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 1290
    .line 1291
    .line 1292
    move-result v15

    .line 1293
    if-ge v14, v15, :cond_44

    .line 1294
    .line 1295
    invoke-virtual {v5, v14}, Ljava/lang/String;->charAt(I)C

    .line 1296
    .line 1297
    .line 1298
    move-result v15

    .line 1299
    invoke-virtual {v7, v14}, Ljava/lang/String;->charAt(I)C

    .line 1300
    .line 1301
    .line 1302
    move-result v0

    .line 1303
    if-eq v15, v0, :cond_43

    .line 1304
    .line 1305
    goto :goto_27

    .line 1306
    :cond_43
    add-int/lit8 v14, v14, 0x1

    .line 1307
    .line 1308
    const/16 v0, 0x800

    .line 1309
    .line 1310
    goto :goto_26

    .line 1311
    :cond_44
    :goto_27
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 1312
    .line 1313
    .line 1314
    move-result v0

    .line 1315
    if-lt v14, v0, :cond_45

    .line 1316
    .line 1317
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 1318
    .line 1319
    .line 1320
    move-result v0

    .line 1321
    if-lt v14, v0, :cond_45

    .line 1322
    .line 1323
    move/from16 v16, v9

    .line 1324
    .line 1325
    move-object v8, v13

    .line 1326
    goto :goto_2a

    .line 1327
    :cond_45
    invoke-virtual {v8, v14}, Landroid/view/accessibility/AccessibilityRecord;->setFromIndex(I)V

    .line 1328
    .line 1329
    .line 1330
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 1331
    .line 1332
    .line 1333
    move-result v0

    .line 1334
    sub-int/2addr v0, v9

    .line 1335
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 1336
    .line 1337
    .line 1338
    move-result v15

    .line 1339
    sub-int/2addr v15, v9

    .line 1340
    :goto_28
    if-lt v0, v14, :cond_47

    .line 1341
    .line 1342
    if-lt v15, v14, :cond_47

    .line 1343
    .line 1344
    invoke-virtual {v5, v0}, Ljava/lang/String;->charAt(I)C

    .line 1345
    .line 1346
    .line 1347
    move-result v6

    .line 1348
    move/from16 v16, v9

    .line 1349
    .line 1350
    invoke-virtual {v7, v15}, Ljava/lang/String;->charAt(I)C

    .line 1351
    .line 1352
    .line 1353
    move-result v9

    .line 1354
    if-eq v6, v9, :cond_46

    .line 1355
    .line 1356
    goto :goto_29

    .line 1357
    :cond_46
    add-int/lit8 v0, v0, -0x1

    .line 1358
    .line 1359
    add-int/lit8 v15, v15, -0x1

    .line 1360
    .line 1361
    move/from16 v9, v16

    .line 1362
    .line 1363
    const/4 v6, 0x4

    .line 1364
    goto :goto_28

    .line 1365
    :cond_47
    move/from16 v16, v9

    .line 1366
    .line 1367
    :goto_29
    sub-int/2addr v0, v14

    .line 1368
    add-int/lit8 v0, v0, 0x1

    .line 1369
    .line 1370
    invoke-virtual {v8, v0}, Landroid/view/accessibility/AccessibilityRecord;->setRemovedCount(I)V

    .line 1371
    .line 1372
    .line 1373
    sub-int/2addr v15, v14

    .line 1374
    add-int/lit8 v15, v15, 0x1

    .line 1375
    .line 1376
    invoke-virtual {v8, v15}, Landroid/view/accessibility/AccessibilityRecord;->setAddedCount(I)V

    .line 1377
    .line 1378
    .line 1379
    :goto_2a
    if-eqz v8, :cond_48

    .line 1380
    .line 1381
    invoke-virtual {v2, v8}, Lio/flutter/view/l;->h(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 1382
    .line 1383
    .line 1384
    :cond_48
    iget v0, v3, Lio/flutter/view/h;->F:I

    .line 1385
    .line 1386
    iget v5, v3, Lio/flutter/view/h;->g:I

    .line 1387
    .line 1388
    if-ne v0, v5, :cond_49

    .line 1389
    .line 1390
    iget v0, v3, Lio/flutter/view/h;->G:I

    .line 1391
    .line 1392
    iget v5, v3, Lio/flutter/view/h;->h:I

    .line 1393
    .line 1394
    if-eq v0, v5, :cond_4a

    .line 1395
    .line 1396
    :cond_49
    iget v0, v3, Lio/flutter/view/h;->b:I

    .line 1397
    .line 1398
    const/16 v5, 0x2000

    .line 1399
    .line 1400
    invoke-virtual {v2, v0, v5}, Lio/flutter/view/l;->d(II)Landroid/view/accessibility/AccessibilityEvent;

    .line 1401
    .line 1402
    .line 1403
    move-result-object v0

    .line 1404
    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityRecord;->getText()Ljava/util/List;

    .line 1405
    .line 1406
    .line 1407
    move-result-object v5

    .line 1408
    invoke-interface {v5, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1409
    .line 1410
    .line 1411
    iget v5, v3, Lio/flutter/view/h;->g:I

    .line 1412
    .line 1413
    invoke-virtual {v0, v5}, Landroid/view/accessibility/AccessibilityRecord;->setFromIndex(I)V

    .line 1414
    .line 1415
    .line 1416
    iget v3, v3, Lio/flutter/view/h;->h:I

    .line 1417
    .line 1418
    invoke-virtual {v0, v3}, Landroid/view/accessibility/AccessibilityRecord;->setToIndex(I)V

    .line 1419
    .line 1420
    .line 1421
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 1422
    .line 1423
    .line 1424
    move-result v3

    .line 1425
    invoke-virtual {v0, v3}, Landroid/view/accessibility/AccessibilityRecord;->setItemCount(I)V

    .line 1426
    .line 1427
    .line 1428
    invoke-virtual {v2, v0}, Lio/flutter/view/l;->h(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 1429
    .line 1430
    .line 1431
    :cond_4a
    :goto_2b
    move/from16 v9, v16

    .line 1432
    .line 1433
    const/16 v0, 0x800

    .line 1434
    .line 1435
    const/4 v6, 0x4

    .line 1436
    goto/16 :goto_18

    .line 1437
    .line 1438
    :cond_4b
    return-void
.end method
