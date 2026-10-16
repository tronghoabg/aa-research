.class public final Ls6/b;
.super Landroid/view/View;
.source "SourceFile"

# interfaces
.implements Ls6/E;


# instance fields
.field public final a:Ljava/util/ArrayList;

.field public b:Ljava/util/List;

.field public c:F

.field public d:Ls6/c;

.field public e:F


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, v0}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 3
    .line 4
    .line 5
    new-instance p1, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Ls6/b;->a:Ljava/util/ArrayList;

    .line 11
    .line 12
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 13
    .line 14
    iput-object p1, p0, Ls6/b;->b:Ljava/util/List;

    .line 15
    .line 16
    const p1, 0x3d5a511a    # 0.0533f

    .line 17
    .line 18
    .line 19
    iput p1, p0, Ls6/b;->c:F

    .line 20
    .line 21
    sget-object p1, Ls6/c;->g:Ls6/c;

    .line 22
    .line 23
    iput-object p1, p0, Ls6/b;->d:Ls6/c;

    .line 24
    .line 25
    const p1, 0x3da3d70a    # 0.08f

    .line 26
    .line 27
    .line 28
    iput p1, p0, Ls6/b;->e:F

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;Ls6/c;FF)V
    .locals 0

    .line 1
    iput-object p1, p0, Ls6/b;->b:Ljava/util/List;

    .line 2
    .line 3
    iput-object p2, p0, Ls6/b;->d:Ls6/c;

    .line 4
    .line 5
    iput p3, p0, Ls6/b;->c:F

    .line 6
    .line 7
    iput p4, p0, Ls6/b;->e:F

    .line 8
    .line 9
    :goto_0
    iget-object p2, p0, Ls6/b;->a:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 12
    .line 13
    .line 14
    move-result p3

    .line 15
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 16
    .line 17
    .line 18
    move-result p4

    .line 19
    if-ge p3, p4, :cond_0

    .line 20
    .line 21
    new-instance p3, Ls6/D;

    .line 22
    .line 23
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 24
    .line 25
    .line 26
    move-result-object p4

    .line 27
    invoke-direct {p3, p4}, Ls6/D;-><init>(Landroid/content/Context;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public final dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 36

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Ls6/b;->b:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    if-eqz v3, :cond_0

    .line 12
    .line 13
    goto/16 :goto_1f

    .line 14
    .line 15
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 28
    .line 29
    .line 30
    move-result v6

    .line 31
    invoke-virtual {v0}, Landroid/view/View;->getPaddingRight()I

    .line 32
    .line 33
    .line 34
    move-result v7

    .line 35
    sub-int/2addr v6, v7

    .line 36
    invoke-virtual {v0}, Landroid/view/View;->getPaddingBottom()I

    .line 37
    .line 38
    .line 39
    move-result v7

    .line 40
    sub-int v7, v3, v7

    .line 41
    .line 42
    if-le v7, v5, :cond_2a

    .line 43
    .line 44
    if-gt v6, v4, :cond_1

    .line 45
    .line 46
    goto/16 :goto_1f

    .line 47
    .line 48
    :cond_1
    sub-int v8, v7, v5

    .line 49
    .line 50
    iget v9, v0, Ls6/b;->c:F

    .line 51
    .line 52
    const/4 v10, 0x0

    .line 53
    invoke-static {v10, v9, v3, v8}, Lxg/g;->O(IFII)F

    .line 54
    .line 55
    .line 56
    move-result v9

    .line 57
    const/4 v11, 0x0

    .line 58
    cmpg-float v12, v9, v11

    .line 59
    .line 60
    if-gtz v12, :cond_2

    .line 61
    .line 62
    goto/16 :goto_1f

    .line 63
    .line 64
    :cond_2
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 65
    .line 66
    .line 67
    move-result v12

    .line 68
    move v13, v10

    .line 69
    :goto_0
    if-ge v13, v12, :cond_2a

    .line 70
    .line 71
    invoke-interface {v2, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v14

    .line 75
    check-cast v14, Lh6/b;

    .line 76
    .line 77
    iget v15, v14, Lh6/b;->p:I

    .line 78
    .line 79
    move/from16 v16, v11

    .line 80
    .line 81
    const/high16 v17, 0x3f800000    # 1.0f

    .line 82
    .line 83
    const v11, -0x800001

    .line 84
    .line 85
    .line 86
    const/high16 v10, -0x80000000

    .line 87
    .line 88
    if-eq v15, v10, :cond_6

    .line 89
    .line 90
    invoke-virtual {v14}, Lh6/b;->a()Lh6/a;

    .line 91
    .line 92
    .line 93
    move-result-object v15

    .line 94
    iput v11, v15, Lh6/a;->h:F

    .line 95
    .line 96
    iput v10, v15, Lh6/a;->i:I

    .line 97
    .line 98
    const/4 v10, 0x0

    .line 99
    iput-object v10, v15, Lh6/a;->c:Landroid/text/Layout$Alignment;

    .line 100
    .line 101
    iget v10, v14, Lh6/b;->f:I

    .line 102
    .line 103
    move/from16 v18, v11

    .line 104
    .line 105
    iget v11, v14, Lh6/b;->e:F

    .line 106
    .line 107
    if-nez v10, :cond_3

    .line 108
    .line 109
    sub-float v10, v17, v11

    .line 110
    .line 111
    iput v10, v15, Lh6/a;->e:F

    .line 112
    .line 113
    const/4 v10, 0x0

    .line 114
    iput v10, v15, Lh6/a;->f:I

    .line 115
    .line 116
    goto :goto_1

    .line 117
    :cond_3
    neg-float v10, v11

    .line 118
    sub-float v10, v10, v17

    .line 119
    .line 120
    iput v10, v15, Lh6/a;->e:F

    .line 121
    .line 122
    const/4 v10, 0x1

    .line 123
    iput v10, v15, Lh6/a;->f:I

    .line 124
    .line 125
    :goto_1
    iget v10, v14, Lh6/b;->g:I

    .line 126
    .line 127
    if-eqz v10, :cond_5

    .line 128
    .line 129
    const/4 v11, 0x2

    .line 130
    if-eq v10, v11, :cond_4

    .line 131
    .line 132
    goto :goto_2

    .line 133
    :cond_4
    const/4 v10, 0x0

    .line 134
    iput v10, v15, Lh6/a;->g:I

    .line 135
    .line 136
    goto :goto_2

    .line 137
    :cond_5
    const/4 v11, 0x2

    .line 138
    iput v11, v15, Lh6/a;->g:I

    .line 139
    .line 140
    :goto_2
    invoke-virtual {v15}, Lh6/a;->a()Lh6/b;

    .line 141
    .line 142
    .line 143
    move-result-object v14

    .line 144
    goto :goto_3

    .line 145
    :cond_6
    move/from16 v18, v11

    .line 146
    .line 147
    :goto_3
    iget v10, v14, Lh6/b;->n:I

    .line 148
    .line 149
    iget v11, v14, Lh6/b;->o:F

    .line 150
    .line 151
    invoke-static {v10, v11, v3, v8}, Lxg/g;->O(IFII)F

    .line 152
    .line 153
    .line 154
    move-result v10

    .line 155
    iget-object v11, v0, Ls6/b;->a:Ljava/util/ArrayList;

    .line 156
    .line 157
    invoke-virtual {v11, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v11

    .line 161
    check-cast v11, Ls6/D;

    .line 162
    .line 163
    iget-object v15, v0, Ls6/b;->d:Ls6/c;

    .line 164
    .line 165
    move-object/from16 v19, v2

    .line 166
    .line 167
    iget v2, v0, Ls6/b;->e:F

    .line 168
    .line 169
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 170
    .line 171
    .line 172
    iget-object v0, v14, Lh6/b;->d:Landroid/graphics/Bitmap;

    .line 173
    .line 174
    move/from16 v20, v3

    .line 175
    .line 176
    if-nez v0, :cond_7

    .line 177
    .line 178
    const/4 v3, 0x1

    .line 179
    :goto_4
    move/from16 v21, v8

    .line 180
    .line 181
    goto :goto_5

    .line 182
    :cond_7
    const/4 v3, 0x0

    .line 183
    goto :goto_4

    .line 184
    :goto_5
    iget-object v8, v14, Lh6/b;->a:Ljava/lang/CharSequence;

    .line 185
    .line 186
    if-eqz v3, :cond_a

    .line 187
    .line 188
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 189
    .line 190
    .line 191
    move-result v22

    .line 192
    if-eqz v22, :cond_8

    .line 193
    .line 194
    move/from16 v33, v4

    .line 195
    .line 196
    move/from16 v34, v5

    .line 197
    .line 198
    move/from16 v32, v9

    .line 199
    .line 200
    move/from16 v22, v12

    .line 201
    .line 202
    move/from16 v23, v13

    .line 203
    .line 204
    :goto_6
    const/4 v15, 0x0

    .line 205
    goto/16 :goto_1e

    .line 206
    .line 207
    :cond_8
    move/from16 v22, v12

    .line 208
    .line 209
    iget-boolean v12, v14, Lh6/b;->l:Z

    .line 210
    .line 211
    if-eqz v12, :cond_9

    .line 212
    .line 213
    iget v12, v14, Lh6/b;->m:I

    .line 214
    .line 215
    goto :goto_7

    .line 216
    :cond_9
    iget v12, v15, Ls6/c;->c:I

    .line 217
    .line 218
    :goto_7
    move/from16 v23, v13

    .line 219
    .line 220
    goto :goto_8

    .line 221
    :cond_a
    move/from16 v22, v12

    .line 222
    .line 223
    const/high16 v12, -0x1000000

    .line 224
    .line 225
    goto :goto_7

    .line 226
    :goto_8
    iget-object v13, v11, Ls6/D;->i:Ljava/lang/CharSequence;

    .line 227
    .line 228
    move/from16 v24, v2

    .line 229
    .line 230
    iget-object v2, v11, Ls6/D;->f:Landroid/text/TextPaint;

    .line 231
    .line 232
    move/from16 v25, v10

    .line 233
    .line 234
    iget v10, v14, Lh6/b;->k:F

    .line 235
    .line 236
    move/from16 v32, v9

    .line 237
    .line 238
    iget v9, v14, Lh6/b;->j:F

    .line 239
    .line 240
    move-object/from16 v26, v2

    .line 241
    .line 242
    iget v2, v14, Lh6/b;->i:I

    .line 243
    .line 244
    move/from16 v27, v10

    .line 245
    .line 246
    iget v10, v14, Lh6/b;->h:F

    .line 247
    .line 248
    move/from16 v28, v9

    .line 249
    .line 250
    iget v9, v14, Lh6/b;->g:I

    .line 251
    .line 252
    move/from16 v29, v2

    .line 253
    .line 254
    iget v2, v14, Lh6/b;->f:I

    .line 255
    .line 256
    move/from16 v30, v10

    .line 257
    .line 258
    iget v10, v14, Lh6/b;->e:F

    .line 259
    .line 260
    iget-object v14, v14, Lh6/b;->b:Landroid/text/Layout$Alignment;

    .line 261
    .line 262
    if-eq v13, v8, :cond_c

    .line 263
    .line 264
    if-eqz v13, :cond_b

    .line 265
    .line 266
    invoke-virtual {v13, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 267
    .line 268
    .line 269
    move-result v13

    .line 270
    if-eqz v13, :cond_b

    .line 271
    .line 272
    goto :goto_9

    .line 273
    :cond_b
    move/from16 v31, v9

    .line 274
    .line 275
    goto/16 :goto_a

    .line 276
    .line 277
    :cond_c
    :goto_9
    iget-object v13, v11, Ls6/D;->j:Landroid/text/Layout$Alignment;

    .line 278
    .line 279
    invoke-static {v13, v14}, Lu6/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 280
    .line 281
    .line 282
    move-result v13

    .line 283
    if-eqz v13, :cond_b

    .line 284
    .line 285
    iget-object v13, v11, Ls6/D;->k:Landroid/graphics/Bitmap;

    .line 286
    .line 287
    if-ne v13, v0, :cond_b

    .line 288
    .line 289
    iget v13, v11, Ls6/D;->l:F

    .line 290
    .line 291
    cmpl-float v13, v13, v10

    .line 292
    .line 293
    if-nez v13, :cond_b

    .line 294
    .line 295
    iget v13, v11, Ls6/D;->m:I

    .line 296
    .line 297
    if-ne v13, v2, :cond_b

    .line 298
    .line 299
    iget v13, v11, Ls6/D;->n:I

    .line 300
    .line 301
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 302
    .line 303
    .line 304
    move-result-object v13

    .line 305
    move/from16 v31, v9

    .line 306
    .line 307
    invoke-static/range {v31 .. v31}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 308
    .line 309
    .line 310
    move-result-object v9

    .line 311
    invoke-virtual {v13, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 312
    .line 313
    .line 314
    move-result v9

    .line 315
    if-eqz v9, :cond_d

    .line 316
    .line 317
    iget v9, v11, Ls6/D;->o:F

    .line 318
    .line 319
    cmpl-float v9, v9, v30

    .line 320
    .line 321
    if-nez v9, :cond_d

    .line 322
    .line 323
    iget v9, v11, Ls6/D;->p:I

    .line 324
    .line 325
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 326
    .line 327
    .line 328
    move-result-object v9

    .line 329
    invoke-static/range {v29 .. v29}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 330
    .line 331
    .line 332
    move-result-object v13

    .line 333
    invoke-virtual {v9, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 334
    .line 335
    .line 336
    move-result v9

    .line 337
    if-eqz v9, :cond_d

    .line 338
    .line 339
    iget v9, v11, Ls6/D;->q:F

    .line 340
    .line 341
    cmpl-float v9, v9, v28

    .line 342
    .line 343
    if-nez v9, :cond_d

    .line 344
    .line 345
    iget v9, v11, Ls6/D;->r:F

    .line 346
    .line 347
    cmpl-float v9, v9, v27

    .line 348
    .line 349
    if-nez v9, :cond_d

    .line 350
    .line 351
    iget v9, v11, Ls6/D;->s:I

    .line 352
    .line 353
    iget v13, v15, Ls6/c;->a:I

    .line 354
    .line 355
    if-ne v9, v13, :cond_d

    .line 356
    .line 357
    iget v9, v11, Ls6/D;->t:I

    .line 358
    .line 359
    iget v13, v15, Ls6/c;->b:I

    .line 360
    .line 361
    if-ne v9, v13, :cond_d

    .line 362
    .line 363
    iget v9, v11, Ls6/D;->u:I

    .line 364
    .line 365
    if-ne v9, v12, :cond_d

    .line 366
    .line 367
    iget v9, v11, Ls6/D;->w:I

    .line 368
    .line 369
    iget v13, v15, Ls6/c;->d:I

    .line 370
    .line 371
    if-ne v9, v13, :cond_d

    .line 372
    .line 373
    iget v9, v11, Ls6/D;->v:I

    .line 374
    .line 375
    iget v13, v15, Ls6/c;->e:I

    .line 376
    .line 377
    if-ne v9, v13, :cond_d

    .line 378
    .line 379
    invoke-virtual/range {v26 .. v26}, Landroid/graphics/Paint;->getTypeface()Landroid/graphics/Typeface;

    .line 380
    .line 381
    .line 382
    move-result-object v9

    .line 383
    iget-object v13, v15, Ls6/c;->f:Landroid/graphics/Typeface;

    .line 384
    .line 385
    invoke-static {v9, v13}, Lu6/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 386
    .line 387
    .line 388
    move-result v9

    .line 389
    if-eqz v9, :cond_d

    .line 390
    .line 391
    iget v9, v11, Ls6/D;->x:F

    .line 392
    .line 393
    cmpl-float v9, v9, v32

    .line 394
    .line 395
    if-nez v9, :cond_d

    .line 396
    .line 397
    iget v9, v11, Ls6/D;->y:F

    .line 398
    .line 399
    cmpl-float v9, v9, v25

    .line 400
    .line 401
    if-nez v9, :cond_d

    .line 402
    .line 403
    iget v9, v11, Ls6/D;->z:F

    .line 404
    .line 405
    cmpl-float v9, v9, v24

    .line 406
    .line 407
    if-nez v9, :cond_d

    .line 408
    .line 409
    iget v9, v11, Ls6/D;->A:I

    .line 410
    .line 411
    if-ne v9, v4, :cond_d

    .line 412
    .line 413
    iget v9, v11, Ls6/D;->B:I

    .line 414
    .line 415
    if-ne v9, v5, :cond_d

    .line 416
    .line 417
    iget v9, v11, Ls6/D;->C:I

    .line 418
    .line 419
    if-ne v9, v6, :cond_d

    .line 420
    .line 421
    iget v9, v11, Ls6/D;->D:I

    .line 422
    .line 423
    if-ne v9, v7, :cond_d

    .line 424
    .line 425
    invoke-virtual {v11, v1, v3}, Ls6/D;->a(Landroid/graphics/Canvas;Z)V

    .line 426
    .line 427
    .line 428
    move/from16 v33, v4

    .line 429
    .line 430
    move/from16 v34, v5

    .line 431
    .line 432
    goto/16 :goto_6

    .line 433
    .line 434
    :cond_d
    :goto_a
    iput-object v8, v11, Ls6/D;->i:Ljava/lang/CharSequence;

    .line 435
    .line 436
    iput-object v14, v11, Ls6/D;->j:Landroid/text/Layout$Alignment;

    .line 437
    .line 438
    iput-object v0, v11, Ls6/D;->k:Landroid/graphics/Bitmap;

    .line 439
    .line 440
    iput v10, v11, Ls6/D;->l:F

    .line 441
    .line 442
    iput v2, v11, Ls6/D;->m:I

    .line 443
    .line 444
    move/from16 v0, v31

    .line 445
    .line 446
    iput v0, v11, Ls6/D;->n:I

    .line 447
    .line 448
    move/from16 v0, v30

    .line 449
    .line 450
    iput v0, v11, Ls6/D;->o:F

    .line 451
    .line 452
    move/from16 v0, v29

    .line 453
    .line 454
    iput v0, v11, Ls6/D;->p:I

    .line 455
    .line 456
    move/from16 v0, v28

    .line 457
    .line 458
    iput v0, v11, Ls6/D;->q:F

    .line 459
    .line 460
    move/from16 v0, v27

    .line 461
    .line 462
    iput v0, v11, Ls6/D;->r:F

    .line 463
    .line 464
    iget v0, v15, Ls6/c;->a:I

    .line 465
    .line 466
    iput v0, v11, Ls6/D;->s:I

    .line 467
    .line 468
    iget v0, v15, Ls6/c;->b:I

    .line 469
    .line 470
    iput v0, v11, Ls6/D;->t:I

    .line 471
    .line 472
    iput v12, v11, Ls6/D;->u:I

    .line 473
    .line 474
    iget v0, v15, Ls6/c;->d:I

    .line 475
    .line 476
    iput v0, v11, Ls6/D;->w:I

    .line 477
    .line 478
    iget v0, v15, Ls6/c;->e:I

    .line 479
    .line 480
    iput v0, v11, Ls6/D;->v:I

    .line 481
    .line 482
    iget-object v0, v15, Ls6/c;->f:Landroid/graphics/Typeface;

    .line 483
    .line 484
    move-object/from16 v2, v26

    .line 485
    .line 486
    invoke-virtual {v2, v0}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 487
    .line 488
    .line 489
    move/from16 v0, v32

    .line 490
    .line 491
    iput v0, v11, Ls6/D;->x:F

    .line 492
    .line 493
    move/from16 v8, v25

    .line 494
    .line 495
    iput v8, v11, Ls6/D;->y:F

    .line 496
    .line 497
    move/from16 v8, v24

    .line 498
    .line 499
    iput v8, v11, Ls6/D;->z:F

    .line 500
    .line 501
    iput v4, v11, Ls6/D;->A:I

    .line 502
    .line 503
    iput v5, v11, Ls6/D;->B:I

    .line 504
    .line 505
    iput v6, v11, Ls6/D;->C:I

    .line 506
    .line 507
    iput v7, v11, Ls6/D;->D:I

    .line 508
    .line 509
    if-eqz v3, :cond_24

    .line 510
    .line 511
    iget-object v8, v11, Ls6/D;->i:Ljava/lang/CharSequence;

    .line 512
    .line 513
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 514
    .line 515
    .line 516
    iget-object v8, v11, Ls6/D;->i:Ljava/lang/CharSequence;

    .line 517
    .line 518
    instance-of v9, v8, Landroid/text/SpannableStringBuilder;

    .line 519
    .line 520
    if-eqz v9, :cond_e

    .line 521
    .line 522
    check-cast v8, Landroid/text/SpannableStringBuilder;

    .line 523
    .line 524
    goto :goto_b

    .line 525
    :cond_e
    new-instance v8, Landroid/text/SpannableStringBuilder;

    .line 526
    .line 527
    iget-object v9, v11, Ls6/D;->i:Ljava/lang/CharSequence;

    .line 528
    .line 529
    invoke-direct {v8, v9}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 530
    .line 531
    .line 532
    :goto_b
    iget v9, v11, Ls6/D;->C:I

    .line 533
    .line 534
    iget v10, v11, Ls6/D;->A:I

    .line 535
    .line 536
    sub-int/2addr v9, v10

    .line 537
    iget v10, v11, Ls6/D;->D:I

    .line 538
    .line 539
    iget v12, v11, Ls6/D;->B:I

    .line 540
    .line 541
    sub-int/2addr v10, v12

    .line 542
    iget v12, v11, Ls6/D;->x:F

    .line 543
    .line 544
    invoke-virtual {v2, v12}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 545
    .line 546
    .line 547
    iget v12, v11, Ls6/D;->x:F

    .line 548
    .line 549
    const/high16 v13, 0x3e000000    # 0.125f

    .line 550
    .line 551
    mul-float/2addr v12, v13

    .line 552
    const/high16 v13, 0x3f000000    # 0.5f

    .line 553
    .line 554
    add-float/2addr v12, v13

    .line 555
    float-to-int v12, v12

    .line 556
    mul-int/lit8 v13, v12, 0x2

    .line 557
    .line 558
    sub-int v14, v9, v13

    .line 559
    .line 560
    iget v15, v11, Ls6/D;->q:F

    .line 561
    .line 562
    cmpl-float v24, v15, v18

    .line 563
    .line 564
    if-eqz v24, :cond_f

    .line 565
    .line 566
    int-to-float v14, v14

    .line 567
    mul-float/2addr v14, v15

    .line 568
    float-to-int v14, v14

    .line 569
    :cond_f
    move/from16 v27, v14

    .line 570
    .line 571
    const-string v14, "SubtitlePainter"

    .line 572
    .line 573
    if-gtz v27, :cond_10

    .line 574
    .line 575
    const-string v2, "Skipped drawing subtitle cue (insufficient space)"

    .line 576
    .line 577
    invoke-static {v14, v2}, Lu6/a;->E(Ljava/lang/String;Ljava/lang/String;)V

    .line 578
    .line 579
    .line 580
    move/from16 v32, v0

    .line 581
    .line 582
    move/from16 v33, v4

    .line 583
    .line 584
    move/from16 v34, v5

    .line 585
    .line 586
    :goto_c
    const/4 v15, 0x0

    .line 587
    goto/16 :goto_1d

    .line 588
    .line 589
    :cond_10
    iget v15, v11, Ls6/D;->y:F

    .line 590
    .line 591
    cmpl-float v15, v15, v16

    .line 592
    .line 593
    move/from16 v32, v0

    .line 594
    .line 595
    if-lez v15, :cond_11

    .line 596
    .line 597
    new-instance v15, Landroid/text/style/AbsoluteSizeSpan;

    .line 598
    .line 599
    iget v0, v11, Ls6/D;->y:F

    .line 600
    .line 601
    float-to-int v0, v0

    .line 602
    invoke-direct {v15, v0}, Landroid/text/style/AbsoluteSizeSpan;-><init>(I)V

    .line 603
    .line 604
    .line 605
    invoke-virtual {v8}, Landroid/text/SpannableStringBuilder;->length()I

    .line 606
    .line 607
    .line 608
    move-result v0

    .line 609
    move-object/from16 v26, v2

    .line 610
    .line 611
    move/from16 v33, v4

    .line 612
    .line 613
    const/4 v2, 0x0

    .line 614
    const/high16 v4, 0xff0000

    .line 615
    .line 616
    invoke-virtual {v8, v15, v2, v0, v4}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 617
    .line 618
    .line 619
    goto :goto_d

    .line 620
    :cond_11
    move-object/from16 v26, v2

    .line 621
    .line 622
    move/from16 v33, v4

    .line 623
    .line 624
    const/4 v2, 0x0

    .line 625
    :goto_d
    new-instance v0, Landroid/text/SpannableStringBuilder;

    .line 626
    .line 627
    invoke-direct {v0, v8}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 628
    .line 629
    .line 630
    iget v4, v11, Ls6/D;->w:I

    .line 631
    .line 632
    const/4 v15, 0x1

    .line 633
    if-ne v4, v15, :cond_12

    .line 634
    .line 635
    invoke-virtual {v0}, Landroid/text/SpannableStringBuilder;->length()I

    .line 636
    .line 637
    .line 638
    move-result v4

    .line 639
    const-class v15, Landroid/text/style/ForegroundColorSpan;

    .line 640
    .line 641
    invoke-virtual {v0, v2, v4, v15}, Landroid/text/SpannableStringBuilder;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 642
    .line 643
    .line 644
    move-result-object v4

    .line 645
    check-cast v4, [Landroid/text/style/ForegroundColorSpan;

    .line 646
    .line 647
    array-length v2, v4

    .line 648
    const/4 v15, 0x0

    .line 649
    :goto_e
    if-ge v15, v2, :cond_12

    .line 650
    .line 651
    move/from16 v25, v2

    .line 652
    .line 653
    aget-object v2, v4, v15

    .line 654
    .line 655
    invoke-virtual {v0, v2}, Landroid/text/SpannableStringBuilder;->removeSpan(Ljava/lang/Object;)V

    .line 656
    .line 657
    .line 658
    add-int/lit8 v15, v15, 0x1

    .line 659
    .line 660
    move/from16 v2, v25

    .line 661
    .line 662
    goto :goto_e

    .line 663
    :cond_12
    iget v2, v11, Ls6/D;->t:I

    .line 664
    .line 665
    invoke-static {v2}, Landroid/graphics/Color;->alpha(I)I

    .line 666
    .line 667
    .line 668
    move-result v2

    .line 669
    if-lez v2, :cond_15

    .line 670
    .line 671
    iget v2, v11, Ls6/D;->w:I

    .line 672
    .line 673
    if-eqz v2, :cond_13

    .line 674
    .line 675
    const/4 v4, 0x2

    .line 676
    if-ne v2, v4, :cond_14

    .line 677
    .line 678
    :cond_13
    move/from16 v34, v5

    .line 679
    .line 680
    const/high16 v5, 0xff0000

    .line 681
    .line 682
    const/4 v15, 0x0

    .line 683
    goto :goto_f

    .line 684
    :cond_14
    new-instance v2, Landroid/text/style/BackgroundColorSpan;

    .line 685
    .line 686
    iget v4, v11, Ls6/D;->t:I

    .line 687
    .line 688
    invoke-direct {v2, v4}, Landroid/text/style/BackgroundColorSpan;-><init>(I)V

    .line 689
    .line 690
    .line 691
    invoke-virtual {v0}, Landroid/text/SpannableStringBuilder;->length()I

    .line 692
    .line 693
    .line 694
    move-result v4

    .line 695
    move/from16 v34, v5

    .line 696
    .line 697
    const/high16 v5, 0xff0000

    .line 698
    .line 699
    const/4 v15, 0x0

    .line 700
    invoke-virtual {v0, v2, v15, v4, v5}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 701
    .line 702
    .line 703
    goto :goto_10

    .line 704
    :goto_f
    new-instance v2, Landroid/text/style/BackgroundColorSpan;

    .line 705
    .line 706
    iget v4, v11, Ls6/D;->t:I

    .line 707
    .line 708
    invoke-direct {v2, v4}, Landroid/text/style/BackgroundColorSpan;-><init>(I)V

    .line 709
    .line 710
    .line 711
    invoke-virtual {v8}, Landroid/text/SpannableStringBuilder;->length()I

    .line 712
    .line 713
    .line 714
    move-result v4

    .line 715
    invoke-virtual {v8, v2, v15, v4, v5}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 716
    .line 717
    .line 718
    goto :goto_10

    .line 719
    :cond_15
    move/from16 v34, v5

    .line 720
    .line 721
    :goto_10
    iget-object v2, v11, Ls6/D;->j:Landroid/text/Layout$Alignment;

    .line 722
    .line 723
    if-nez v2, :cond_16

    .line 724
    .line 725
    sget-object v2, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;

    .line 726
    .line 727
    :cond_16
    move-object/from16 v28, v2

    .line 728
    .line 729
    new-instance v24, Landroid/text/StaticLayout;

    .line 730
    .line 731
    iget v2, v11, Ls6/D;->e:F

    .line 732
    .line 733
    const/16 v31, 0x1

    .line 734
    .line 735
    iget v4, v11, Ls6/D;->d:F

    .line 736
    .line 737
    move/from16 v30, v2

    .line 738
    .line 739
    move/from16 v29, v4

    .line 740
    .line 741
    move-object/from16 v25, v8

    .line 742
    .line 743
    invoke-direct/range {v24 .. v31}, Landroid/text/StaticLayout;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFZ)V

    .line 744
    .line 745
    .line 746
    move-object/from16 v4, v24

    .line 747
    .line 748
    move/from16 v2, v27

    .line 749
    .line 750
    iput-object v4, v11, Ls6/D;->E:Landroid/text/StaticLayout;

    .line 751
    .line 752
    invoke-virtual {v4}, Landroid/text/Layout;->getHeight()I

    .line 753
    .line 754
    .line 755
    move-result v4

    .line 756
    iget-object v5, v11, Ls6/D;->E:Landroid/text/StaticLayout;

    .line 757
    .line 758
    invoke-virtual {v5}, Landroid/text/StaticLayout;->getLineCount()I

    .line 759
    .line 760
    .line 761
    move-result v5

    .line 762
    const/4 v8, 0x0

    .line 763
    const/4 v15, 0x0

    .line 764
    :goto_11
    if-ge v8, v5, :cond_17

    .line 765
    .line 766
    move-object/from16 v35, v0

    .line 767
    .line 768
    iget-object v0, v11, Ls6/D;->E:Landroid/text/StaticLayout;

    .line 769
    .line 770
    invoke-virtual {v0, v8}, Landroid/text/Layout;->getLineWidth(I)F

    .line 771
    .line 772
    .line 773
    move-result v0

    .line 774
    move/from16 v24, v4

    .line 775
    .line 776
    move/from16 v27, v5

    .line 777
    .line 778
    float-to-double v4, v0

    .line 779
    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    .line 780
    .line 781
    .line 782
    move-result-wide v4

    .line 783
    double-to-int v0, v4

    .line 784
    invoke-static {v0, v15}, Ljava/lang/Math;->max(II)I

    .line 785
    .line 786
    .line 787
    move-result v15

    .line 788
    add-int/lit8 v8, v8, 0x1

    .line 789
    .line 790
    move/from16 v4, v24

    .line 791
    .line 792
    move/from16 v5, v27

    .line 793
    .line 794
    move-object/from16 v0, v35

    .line 795
    .line 796
    goto :goto_11

    .line 797
    :cond_17
    move-object/from16 v35, v0

    .line 798
    .line 799
    move/from16 v24, v4

    .line 800
    .line 801
    iget v0, v11, Ls6/D;->q:F

    .line 802
    .line 803
    cmpl-float v0, v0, v18

    .line 804
    .line 805
    if-eqz v0, :cond_18

    .line 806
    .line 807
    if-ge v15, v2, :cond_18

    .line 808
    .line 809
    move/from16 v27, v2

    .line 810
    .line 811
    goto :goto_12

    .line 812
    :cond_18
    move/from16 v27, v15

    .line 813
    .line 814
    :goto_12
    add-int v27, v27, v13

    .line 815
    .line 816
    iget v0, v11, Ls6/D;->o:F

    .line 817
    .line 818
    cmpl-float v2, v0, v18

    .line 819
    .line 820
    if-eqz v2, :cond_1b

    .line 821
    .line 822
    int-to-float v2, v9

    .line 823
    mul-float/2addr v2, v0

    .line 824
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    .line 825
    .line 826
    .line 827
    move-result v0

    .line 828
    iget v2, v11, Ls6/D;->A:I

    .line 829
    .line 830
    add-int/2addr v0, v2

    .line 831
    iget v4, v11, Ls6/D;->p:I

    .line 832
    .line 833
    const/4 v15, 0x1

    .line 834
    if-eq v4, v15, :cond_1a

    .line 835
    .line 836
    const/4 v5, 0x2

    .line 837
    if-eq v4, v5, :cond_19

    .line 838
    .line 839
    goto :goto_13

    .line 840
    :cond_19
    sub-int v0, v0, v27

    .line 841
    .line 842
    goto :goto_13

    .line 843
    :cond_1a
    const/4 v5, 0x2

    .line 844
    mul-int/lit8 v0, v0, 0x2

    .line 845
    .line 846
    sub-int v0, v0, v27

    .line 847
    .line 848
    div-int/2addr v0, v5

    .line 849
    :goto_13
    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    .line 850
    .line 851
    .line 852
    move-result v0

    .line 853
    add-int v2, v0, v27

    .line 854
    .line 855
    iget v4, v11, Ls6/D;->C:I

    .line 856
    .line 857
    invoke-static {v2, v4}, Ljava/lang/Math;->min(II)I

    .line 858
    .line 859
    .line 860
    move-result v2

    .line 861
    goto :goto_14

    .line 862
    :cond_1b
    const/4 v5, 0x2

    .line 863
    sub-int v9, v9, v27

    .line 864
    .line 865
    div-int/2addr v9, v5

    .line 866
    iget v0, v11, Ls6/D;->A:I

    .line 867
    .line 868
    add-int/2addr v0, v9

    .line 869
    add-int v2, v0, v27

    .line 870
    .line 871
    :goto_14
    sub-int v27, v2, v0

    .line 872
    .line 873
    if-gtz v27, :cond_1c

    .line 874
    .line 875
    const-string v0, "Skipped drawing subtitle cue (invalid horizontal positioning)"

    .line 876
    .line 877
    invoke-static {v14, v0}, Lu6/a;->E(Ljava/lang/String;Ljava/lang/String;)V

    .line 878
    .line 879
    .line 880
    goto/16 :goto_c

    .line 881
    .line 882
    :cond_1c
    iget v2, v11, Ls6/D;->l:F

    .line 883
    .line 884
    cmpl-float v4, v2, v18

    .line 885
    .line 886
    if-eqz v4, :cond_22

    .line 887
    .line 888
    iget v4, v11, Ls6/D;->m:I

    .line 889
    .line 890
    if-nez v4, :cond_1f

    .line 891
    .line 892
    int-to-float v4, v10

    .line 893
    mul-float/2addr v4, v2

    .line 894
    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    .line 895
    .line 896
    .line 897
    move-result v2

    .line 898
    iget v4, v11, Ls6/D;->B:I

    .line 899
    .line 900
    add-int/2addr v2, v4

    .line 901
    iget v4, v11, Ls6/D;->n:I

    .line 902
    .line 903
    const/4 v5, 0x2

    .line 904
    if-ne v4, v5, :cond_1d

    .line 905
    .line 906
    sub-int v2, v2, v24

    .line 907
    .line 908
    goto :goto_15

    .line 909
    :cond_1d
    const/4 v15, 0x1

    .line 910
    if-ne v4, v15, :cond_1e

    .line 911
    .line 912
    mul-int/lit8 v2, v2, 0x2

    .line 913
    .line 914
    sub-int v2, v2, v24

    .line 915
    .line 916
    div-int/2addr v2, v5

    .line 917
    :cond_1e
    :goto_15
    const/4 v15, 0x0

    .line 918
    goto :goto_16

    .line 919
    :cond_1f
    iget-object v2, v11, Ls6/D;->E:Landroid/text/StaticLayout;

    .line 920
    .line 921
    const/4 v15, 0x0

    .line 922
    invoke-virtual {v2, v15}, Landroid/text/Layout;->getLineBottom(I)I

    .line 923
    .line 924
    .line 925
    move-result v2

    .line 926
    iget-object v4, v11, Ls6/D;->E:Landroid/text/StaticLayout;

    .line 927
    .line 928
    invoke-virtual {v4, v15}, Landroid/text/StaticLayout;->getLineTop(I)I

    .line 929
    .line 930
    .line 931
    move-result v4

    .line 932
    sub-int/2addr v2, v4

    .line 933
    iget v4, v11, Ls6/D;->l:F

    .line 934
    .line 935
    cmpl-float v5, v4, v16

    .line 936
    .line 937
    if-ltz v5, :cond_20

    .line 938
    .line 939
    int-to-float v2, v2

    .line 940
    mul-float/2addr v4, v2

    .line 941
    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    .line 942
    .line 943
    .line 944
    move-result v2

    .line 945
    iget v4, v11, Ls6/D;->B:I

    .line 946
    .line 947
    add-int/2addr v2, v4

    .line 948
    goto :goto_16

    .line 949
    :cond_20
    add-float v4, v4, v17

    .line 950
    .line 951
    int-to-float v2, v2

    .line 952
    mul-float/2addr v4, v2

    .line 953
    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    .line 954
    .line 955
    .line 956
    move-result v2

    .line 957
    iget v4, v11, Ls6/D;->D:I

    .line 958
    .line 959
    add-int/2addr v2, v4

    .line 960
    sub-int v2, v2, v24

    .line 961
    .line 962
    :goto_16
    add-int v4, v2, v24

    .line 963
    .line 964
    iget v5, v11, Ls6/D;->D:I

    .line 965
    .line 966
    if-le v4, v5, :cond_21

    .line 967
    .line 968
    sub-int v2, v5, v24

    .line 969
    .line 970
    goto :goto_17

    .line 971
    :cond_21
    iget v4, v11, Ls6/D;->B:I

    .line 972
    .line 973
    if-ge v2, v4, :cond_23

    .line 974
    .line 975
    move v2, v4

    .line 976
    goto :goto_17

    .line 977
    :cond_22
    const/4 v15, 0x0

    .line 978
    iget v2, v11, Ls6/D;->D:I

    .line 979
    .line 980
    sub-int v2, v2, v24

    .line 981
    .line 982
    int-to-float v4, v10

    .line 983
    iget v5, v11, Ls6/D;->z:F

    .line 984
    .line 985
    mul-float/2addr v4, v5

    .line 986
    float-to-int v4, v4

    .line 987
    sub-int/2addr v2, v4

    .line 988
    :cond_23
    :goto_17
    new-instance v24, Landroid/text/StaticLayout;

    .line 989
    .line 990
    iget v4, v11, Ls6/D;->e:F

    .line 991
    .line 992
    const/16 v31, 0x1

    .line 993
    .line 994
    iget v5, v11, Ls6/D;->d:F

    .line 995
    .line 996
    move/from16 v30, v4

    .line 997
    .line 998
    move/from16 v29, v5

    .line 999
    .line 1000
    invoke-direct/range {v24 .. v31}, Landroid/text/StaticLayout;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFZ)V

    .line 1001
    .line 1002
    .line 1003
    move-object/from16 v4, v24

    .line 1004
    .line 1005
    iput-object v4, v11, Ls6/D;->E:Landroid/text/StaticLayout;

    .line 1006
    .line 1007
    new-instance v24, Landroid/text/StaticLayout;

    .line 1008
    .line 1009
    iget v4, v11, Ls6/D;->e:F

    .line 1010
    .line 1011
    iget v5, v11, Ls6/D;->d:F

    .line 1012
    .line 1013
    move/from16 v30, v4

    .line 1014
    .line 1015
    move/from16 v29, v5

    .line 1016
    .line 1017
    move-object/from16 v25, v35

    .line 1018
    .line 1019
    invoke-direct/range {v24 .. v31}, Landroid/text/StaticLayout;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFZ)V

    .line 1020
    .line 1021
    .line 1022
    move-object/from16 v4, v24

    .line 1023
    .line 1024
    iput-object v4, v11, Ls6/D;->F:Landroid/text/StaticLayout;

    .line 1025
    .line 1026
    iput v0, v11, Ls6/D;->G:I

    .line 1027
    .line 1028
    iput v2, v11, Ls6/D;->H:I

    .line 1029
    .line 1030
    iput v12, v11, Ls6/D;->I:I

    .line 1031
    .line 1032
    goto/16 :goto_1d

    .line 1033
    .line 1034
    :cond_24
    move/from16 v32, v0

    .line 1035
    .line 1036
    move/from16 v33, v4

    .line 1037
    .line 1038
    move/from16 v34, v5

    .line 1039
    .line 1040
    const/4 v15, 0x0

    .line 1041
    iget-object v0, v11, Ls6/D;->k:Landroid/graphics/Bitmap;

    .line 1042
    .line 1043
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1044
    .line 1045
    .line 1046
    iget-object v0, v11, Ls6/D;->k:Landroid/graphics/Bitmap;

    .line 1047
    .line 1048
    iget v2, v11, Ls6/D;->C:I

    .line 1049
    .line 1050
    iget v4, v11, Ls6/D;->A:I

    .line 1051
    .line 1052
    sub-int/2addr v2, v4

    .line 1053
    iget v5, v11, Ls6/D;->D:I

    .line 1054
    .line 1055
    iget v8, v11, Ls6/D;->B:I

    .line 1056
    .line 1057
    sub-int/2addr v5, v8

    .line 1058
    int-to-float v4, v4

    .line 1059
    int-to-float v2, v2

    .line 1060
    iget v9, v11, Ls6/D;->o:F

    .line 1061
    .line 1062
    mul-float/2addr v9, v2

    .line 1063
    add-float/2addr v9, v4

    .line 1064
    int-to-float v4, v8

    .line 1065
    int-to-float v5, v5

    .line 1066
    iget v8, v11, Ls6/D;->l:F

    .line 1067
    .line 1068
    mul-float/2addr v8, v5

    .line 1069
    add-float/2addr v8, v4

    .line 1070
    iget v4, v11, Ls6/D;->q:F

    .line 1071
    .line 1072
    mul-float/2addr v2, v4

    .line 1073
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    .line 1074
    .line 1075
    .line 1076
    move-result v2

    .line 1077
    iget v4, v11, Ls6/D;->r:F

    .line 1078
    .line 1079
    cmpl-float v10, v4, v18

    .line 1080
    .line 1081
    if-eqz v10, :cond_25

    .line 1082
    .line 1083
    mul-float/2addr v5, v4

    .line 1084
    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    .line 1085
    .line 1086
    .line 1087
    move-result v0

    .line 1088
    goto :goto_18

    .line 1089
    :cond_25
    int-to-float v4, v2

    .line 1090
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 1091
    .line 1092
    .line 1093
    move-result v5

    .line 1094
    int-to-float v5, v5

    .line 1095
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 1096
    .line 1097
    .line 1098
    move-result v0

    .line 1099
    int-to-float v0, v0

    .line 1100
    div-float/2addr v5, v0

    .line 1101
    mul-float/2addr v5, v4

    .line 1102
    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    .line 1103
    .line 1104
    .line 1105
    move-result v0

    .line 1106
    :goto_18
    iget v4, v11, Ls6/D;->p:I

    .line 1107
    .line 1108
    const/4 v5, 0x2

    .line 1109
    if-ne v4, v5, :cond_26

    .line 1110
    .line 1111
    int-to-float v4, v2

    .line 1112
    :goto_19
    sub-float/2addr v9, v4

    .line 1113
    goto :goto_1a

    .line 1114
    :cond_26
    const/4 v10, 0x1

    .line 1115
    if-ne v4, v10, :cond_27

    .line 1116
    .line 1117
    div-int/lit8 v4, v2, 0x2

    .line 1118
    .line 1119
    int-to-float v4, v4

    .line 1120
    goto :goto_19

    .line 1121
    :cond_27
    :goto_1a
    invoke-static {v9}, Ljava/lang/Math;->round(F)I

    .line 1122
    .line 1123
    .line 1124
    move-result v4

    .line 1125
    iget v5, v11, Ls6/D;->n:I

    .line 1126
    .line 1127
    const/4 v9, 0x2

    .line 1128
    if-ne v5, v9, :cond_28

    .line 1129
    .line 1130
    int-to-float v5, v0

    .line 1131
    :goto_1b
    sub-float/2addr v8, v5

    .line 1132
    goto :goto_1c

    .line 1133
    :cond_28
    const/4 v10, 0x1

    .line 1134
    if-ne v5, v10, :cond_29

    .line 1135
    .line 1136
    div-int/lit8 v5, v0, 0x2

    .line 1137
    .line 1138
    int-to-float v5, v5

    .line 1139
    goto :goto_1b

    .line 1140
    :cond_29
    :goto_1c
    invoke-static {v8}, Ljava/lang/Math;->round(F)I

    .line 1141
    .line 1142
    .line 1143
    move-result v5

    .line 1144
    new-instance v8, Landroid/graphics/Rect;

    .line 1145
    .line 1146
    add-int/2addr v2, v4

    .line 1147
    add-int/2addr v0, v5

    .line 1148
    invoke-direct {v8, v4, v5, v2, v0}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 1149
    .line 1150
    .line 1151
    iput-object v8, v11, Ls6/D;->J:Landroid/graphics/Rect;

    .line 1152
    .line 1153
    :goto_1d
    invoke-virtual {v11, v1, v3}, Ls6/D;->a(Landroid/graphics/Canvas;Z)V

    .line 1154
    .line 1155
    .line 1156
    :goto_1e
    add-int/lit8 v13, v23, 0x1

    .line 1157
    .line 1158
    move-object/from16 v0, p0

    .line 1159
    .line 1160
    move v10, v15

    .line 1161
    move/from16 v11, v16

    .line 1162
    .line 1163
    move-object/from16 v2, v19

    .line 1164
    .line 1165
    move/from16 v3, v20

    .line 1166
    .line 1167
    move/from16 v8, v21

    .line 1168
    .line 1169
    move/from16 v12, v22

    .line 1170
    .line 1171
    move/from16 v9, v32

    .line 1172
    .line 1173
    move/from16 v4, v33

    .line 1174
    .line 1175
    move/from16 v5, v34

    .line 1176
    .line 1177
    goto/16 :goto_0

    .line 1178
    .line 1179
    :cond_2a
    :goto_1f
    return-void
.end method
