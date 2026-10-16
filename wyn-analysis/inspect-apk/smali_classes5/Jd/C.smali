.class public abstract LJd/C;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    invoke-static {v0}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, LJd/C;->a:Ljava/util/List;

    .line 8
    .line 9
    return-void
.end method

.method public static final a(IILjava/lang/String;)I
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    if-ge p0, p1, :cond_4

    .line 4
    .line 5
    invoke-virtual {p2, p0}, Ljava/lang/String;->charAt(I)C

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/16 v3, 0x3a

    .line 10
    .line 11
    if-eq v2, v3, :cond_2

    .line 12
    .line 13
    const/16 v3, 0x5b

    .line 14
    .line 15
    if-eq v2, v3, :cond_1

    .line 16
    .line 17
    const/16 v3, 0x5d

    .line 18
    .line 19
    if-eq v2, v3, :cond_0

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    move v1, v0

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    const/4 v1, 0x1

    .line 25
    goto :goto_1

    .line 26
    :cond_2
    if-nez v1, :cond_3

    .line 27
    .line 28
    return p0

    .line 29
    :cond_3
    :goto_1
    add-int/lit8 p0, p0, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_4
    const/4 p0, -0x1

    .line 33
    return p0
.end method

.method public static final b(LJd/B;Ljava/lang/String;)V
    .locals 2

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "urlString"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p1}, LBf/k;->y0(Ljava/lang/CharSequence;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    :try_start_0
    invoke-static {p0, p1}, LJd/C;->c(LJd/B;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :catchall_0
    move-exception p0

    .line 23
    new-instance v0, LCd/s0;

    .line 24
    .line 25
    const-string v1, "Fail to parse url: "

    .line 26
    .line 27
    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    const/4 v1, 0x4

    .line 32
    invoke-direct {v0, p1, p0, v1}, LCd/s0;-><init>(Ljava/lang/String;Ljava/lang/Throwable;I)V

    .line 33
    .line 34
    .line 35
    throw v0
.end method

.method public static final c(LJd/B;Ljava/lang/String;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/4 v3, -0x1

    .line 6
    const/4 v4, 0x1

    .line 7
    const-string v5, "<this>"

    .line 8
    .line 9
    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v5, "urlString"

    .line 13
    .line 14
    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 18
    .line 19
    .line 20
    move-result v5

    .line 21
    const/4 v7, 0x0

    .line 22
    :goto_0
    if-ge v7, v5, :cond_1

    .line 23
    .line 24
    invoke-virtual {v1, v7}, Ljava/lang/String;->charAt(I)C

    .line 25
    .line 26
    .line 27
    move-result v8

    .line 28
    invoke-static {v8}, Ltg/b;->I(C)Z

    .line 29
    .line 30
    .line 31
    move-result v8

    .line 32
    if-nez v8, :cond_0

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_0
    add-int/2addr v7, v4

    .line 36
    goto :goto_0

    .line 37
    :cond_1
    move v7, v3

    .line 38
    :goto_1
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    add-int/2addr v5, v3

    .line 43
    if-ltz v5, :cond_4

    .line 44
    .line 45
    :goto_2
    add-int/lit8 v8, v5, -0x1

    .line 46
    .line 47
    invoke-virtual {v1, v5}, Ljava/lang/String;->charAt(I)C

    .line 48
    .line 49
    .line 50
    move-result v9

    .line 51
    invoke-static {v9}, Ltg/b;->I(C)Z

    .line 52
    .line 53
    .line 54
    move-result v9

    .line 55
    if-nez v9, :cond_2

    .line 56
    .line 57
    goto :goto_4

    .line 58
    :cond_2
    if-gez v8, :cond_3

    .line 59
    .line 60
    goto :goto_3

    .line 61
    :cond_3
    move v5, v8

    .line 62
    goto :goto_2

    .line 63
    :cond_4
    :goto_3
    move v5, v3

    .line 64
    :goto_4
    add-int/lit8 v8, v5, 0x1

    .line 65
    .line 66
    invoke-virtual {v1, v7}, Ljava/lang/String;->charAt(I)C

    .line 67
    .line 68
    .line 69
    move-result v9

    .line 70
    const/16 v10, 0x41

    .line 71
    .line 72
    const/16 v11, 0x5b

    .line 73
    .line 74
    const/16 v12, 0x7b

    .line 75
    .line 76
    const/16 v13, 0x61

    .line 77
    .line 78
    if-gt v13, v9, :cond_5

    .line 79
    .line 80
    if-ge v9, v12, :cond_5

    .line 81
    .line 82
    goto :goto_5

    .line 83
    :cond_5
    if-gt v10, v9, :cond_6

    .line 84
    .line 85
    if-ge v9, v11, :cond_6

    .line 86
    .line 87
    :goto_5
    move v14, v3

    .line 88
    move v9, v7

    .line 89
    goto :goto_6

    .line 90
    :cond_6
    move v9, v7

    .line 91
    move v14, v9

    .line 92
    :goto_6
    const/16 v15, 0x2f

    .line 93
    .line 94
    const/16 v2, 0x23

    .line 95
    .line 96
    move/from16 v16, v4

    .line 97
    .line 98
    const/16 v4, 0x3f

    .line 99
    .line 100
    if-ge v9, v8, :cond_d

    .line 101
    .line 102
    invoke-virtual {v1, v9}, Ljava/lang/String;->charAt(I)C

    .line 103
    .line 104
    .line 105
    move-result v6

    .line 106
    const/16 v11, 0x3a

    .line 107
    .line 108
    if-ne v6, v11, :cond_8

    .line 109
    .line 110
    if-ne v14, v3, :cond_7

    .line 111
    .line 112
    sub-int/2addr v9, v7

    .line 113
    goto :goto_8

    .line 114
    :cond_7
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 115
    .line 116
    const-string v1, "Illegal character in scheme at position "

    .line 117
    .line 118
    invoke-static {v14, v1}, Lka/n;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    throw v0

    .line 126
    :cond_8
    if-eq v6, v2, :cond_d

    .line 127
    .line 128
    if-eq v6, v15, :cond_d

    .line 129
    .line 130
    if-eq v6, v4, :cond_d

    .line 131
    .line 132
    if-ne v14, v3, :cond_c

    .line 133
    .line 134
    if-gt v13, v6, :cond_9

    .line 135
    .line 136
    if-ge v6, v12, :cond_9

    .line 137
    .line 138
    goto :goto_7

    .line 139
    :cond_9
    if-gt v10, v6, :cond_a

    .line 140
    .line 141
    const/16 v2, 0x5b

    .line 142
    .line 143
    if-ge v6, v2, :cond_a

    .line 144
    .line 145
    goto :goto_7

    .line 146
    :cond_a
    const/16 v2, 0x30

    .line 147
    .line 148
    if-gt v2, v6, :cond_b

    .line 149
    .line 150
    if-ge v6, v11, :cond_b

    .line 151
    .line 152
    goto :goto_7

    .line 153
    :cond_b
    const/16 v2, 0x2e

    .line 154
    .line 155
    if-eq v6, v2, :cond_c

    .line 156
    .line 157
    const/16 v2, 0x2b

    .line 158
    .line 159
    if-eq v6, v2, :cond_c

    .line 160
    .line 161
    const/16 v2, 0x2d

    .line 162
    .line 163
    if-eq v6, v2, :cond_c

    .line 164
    .line 165
    move v14, v9

    .line 166
    :cond_c
    :goto_7
    add-int/lit8 v9, v9, 0x1

    .line 167
    .line 168
    move/from16 v4, v16

    .line 169
    .line 170
    const/16 v11, 0x5b

    .line 171
    .line 172
    goto :goto_6

    .line 173
    :cond_d
    move v9, v3

    .line 174
    :goto_8
    const-string v6, "substring(...)"

    .line 175
    .line 176
    if-lez v9, :cond_18

    .line 177
    .line 178
    add-int v11, v7, v9

    .line 179
    .line 180
    invoke-virtual {v1, v7, v11}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v11

    .line 184
    invoke-static {v11, v6}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    sget-object v12, LJd/D;->c:LJd/D;

    .line 188
    .line 189
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 190
    .line 191
    .line 192
    move-result v12

    .line 193
    const/4 v13, 0x0

    .line 194
    :goto_9
    const/16 v14, 0x80

    .line 195
    .line 196
    if-ge v13, v12, :cond_11

    .line 197
    .line 198
    invoke-virtual {v11, v13}, Ljava/lang/String;->charAt(I)C

    .line 199
    .line 200
    .line 201
    move-result v2

    .line 202
    if-gt v10, v2, :cond_e

    .line 203
    .line 204
    const/16 v4, 0x5b

    .line 205
    .line 206
    if-ge v2, v4, :cond_e

    .line 207
    .line 208
    add-int/lit8 v4, v2, 0x20

    .line 209
    .line 210
    int-to-char v4, v4

    .line 211
    goto :goto_a

    .line 212
    :cond_e
    if-ltz v2, :cond_f

    .line 213
    .line 214
    if-ge v2, v14, :cond_f

    .line 215
    .line 216
    move v4, v2

    .line 217
    goto :goto_a

    .line 218
    :cond_f
    invoke-static {v2}, Ljava/lang/Character;->toLowerCase(C)C

    .line 219
    .line 220
    .line 221
    move-result v4

    .line 222
    :goto_a
    if-eq v4, v2, :cond_10

    .line 223
    .line 224
    goto :goto_b

    .line 225
    :cond_10
    add-int/lit8 v13, v13, 0x1

    .line 226
    .line 227
    const/16 v2, 0x23

    .line 228
    .line 229
    const/16 v4, 0x3f

    .line 230
    .line 231
    goto :goto_9

    .line 232
    :cond_11
    move v13, v3

    .line 233
    :goto_b
    if-ne v13, v3, :cond_12

    .line 234
    .line 235
    goto :goto_e

    .line 236
    :cond_12
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 237
    .line 238
    .line 239
    move-result v2

    .line 240
    new-instance v4, Ljava/lang/StringBuilder;

    .line 241
    .line 242
    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 243
    .line 244
    .line 245
    const/4 v2, 0x0

    .line 246
    invoke-virtual {v4, v11, v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 247
    .line 248
    .line 249
    invoke-static {v11}, LBf/k;->s0(Ljava/lang/CharSequence;)I

    .line 250
    .line 251
    .line 252
    move-result v2

    .line 253
    if-gt v13, v2, :cond_16

    .line 254
    .line 255
    :goto_c
    invoke-virtual {v11, v13}, Ljava/lang/String;->charAt(I)C

    .line 256
    .line 257
    .line 258
    move-result v12

    .line 259
    if-gt v10, v12, :cond_13

    .line 260
    .line 261
    const/16 v10, 0x5b

    .line 262
    .line 263
    if-ge v12, v10, :cond_14

    .line 264
    .line 265
    add-int/lit8 v12, v12, 0x20

    .line 266
    .line 267
    int-to-char v12, v12

    .line 268
    goto :goto_d

    .line 269
    :cond_13
    const/16 v10, 0x5b

    .line 270
    .line 271
    :cond_14
    if-ltz v12, :cond_15

    .line 272
    .line 273
    if-ge v12, v14, :cond_15

    .line 274
    .line 275
    goto :goto_d

    .line 276
    :cond_15
    invoke-static {v12}, Ljava/lang/Character;->toLowerCase(C)C

    .line 277
    .line 278
    .line 279
    move-result v12

    .line 280
    :goto_d
    invoke-virtual {v4, v12}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 281
    .line 282
    .line 283
    if-eq v13, v2, :cond_16

    .line 284
    .line 285
    add-int/lit8 v13, v13, 0x1

    .line 286
    .line 287
    const/16 v10, 0x41

    .line 288
    .line 289
    goto :goto_c

    .line 290
    :cond_16
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 291
    .line 292
    .line 293
    move-result-object v11

    .line 294
    :goto_e
    sget-object v2, LJd/D;->d:Ljava/util/LinkedHashMap;

    .line 295
    .line 296
    invoke-virtual {v2, v11}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v2

    .line 300
    check-cast v2, LJd/D;

    .line 301
    .line 302
    if-nez v2, :cond_17

    .line 303
    .line 304
    new-instance v2, LJd/D;

    .line 305
    .line 306
    const/4 v4, 0x0

    .line 307
    invoke-direct {v2, v11, v4}, LJd/D;-><init>(Ljava/lang/String;I)V

    .line 308
    .line 309
    .line 310
    :cond_17
    iput-object v2, v0, LJd/B;->d:LJd/D;

    .line 311
    .line 312
    add-int/lit8 v9, v9, 0x1

    .line 313
    .line 314
    add-int/2addr v7, v9

    .line 315
    :cond_18
    invoke-virtual {v0}, LJd/B;->c()LJd/D;

    .line 316
    .line 317
    .line 318
    move-result-object v2

    .line 319
    iget-object v2, v2, LJd/D;->a:Ljava/lang/String;

    .line 320
    .line 321
    const-string v4, "data"

    .line 322
    .line 323
    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 324
    .line 325
    .line 326
    move-result v2

    .line 327
    if-eqz v2, :cond_19

    .line 328
    .line 329
    invoke-virtual {v1, v7, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 330
    .line 331
    .line 332
    move-result-object v1

    .line 333
    invoke-static {v1, v6}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 334
    .line 335
    .line 336
    iput-object v1, v0, LJd/B;->a:Ljava/lang/String;

    .line 337
    .line 338
    return-void

    .line 339
    :cond_19
    const/4 v2, 0x0

    .line 340
    :goto_f
    add-int v4, v7, v2

    .line 341
    .line 342
    if-ge v4, v8, :cond_1a

    .line 343
    .line 344
    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    .line 345
    .line 346
    .line 347
    move-result v9

    .line 348
    if-ne v9, v15, :cond_1a

    .line 349
    .line 350
    add-int/lit8 v2, v2, 0x1

    .line 351
    .line 352
    goto :goto_f

    .line 353
    :cond_1a
    invoke-virtual {v0}, LJd/B;->c()LJd/D;

    .line 354
    .line 355
    .line 356
    move-result-object v7

    .line 357
    iget-object v7, v7, LJd/D;->a:Ljava/lang/String;

    .line 358
    .line 359
    const-string v9, "file"

    .line 360
    .line 361
    invoke-static {v7, v9}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 362
    .line 363
    .line 364
    move-result v7

    .line 365
    const/4 v9, 0x2

    .line 366
    const/4 v10, 0x4

    .line 367
    const-string v11, "/"

    .line 368
    .line 369
    if-eqz v7, :cond_20

    .line 370
    .line 371
    const-string v5, ""

    .line 372
    .line 373
    move/from16 v7, v16

    .line 374
    .line 375
    if-eq v2, v7, :cond_1f

    .line 376
    .line 377
    if-eq v2, v9, :cond_1c

    .line 378
    .line 379
    const/4 v3, 0x3

    .line 380
    if-ne v2, v3, :cond_1b

    .line 381
    .line 382
    iput-object v5, v0, LJd/B;->a:Ljava/lang/String;

    .line 383
    .line 384
    invoke-virtual {v1, v4, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 385
    .line 386
    .line 387
    move-result-object v1

    .line 388
    invoke-static {v1, v6}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 389
    .line 390
    .line 391
    invoke-virtual {v11, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 392
    .line 393
    .line 394
    move-result-object v1

    .line 395
    invoke-static {v0, v1}, Lvf/a;->L(LJd/B;Ljava/lang/String;)V

    .line 396
    .line 397
    .line 398
    return-void

    .line 399
    :cond_1b
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 400
    .line 401
    const-string v2, "Invalid file url: "

    .line 402
    .line 403
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 404
    .line 405
    .line 406
    move-result-object v1

    .line 407
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 408
    .line 409
    .line 410
    throw v0

    .line 411
    :cond_1c
    invoke-static {v1, v15, v4, v10}, LBf/k;->v0(Ljava/lang/CharSequence;CII)I

    .line 412
    .line 413
    .line 414
    move-result v2

    .line 415
    if-eq v2, v3, :cond_1e

    .line 416
    .line 417
    if-ne v2, v8, :cond_1d

    .line 418
    .line 419
    goto :goto_10

    .line 420
    :cond_1d
    invoke-virtual {v1, v4, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 421
    .line 422
    .line 423
    move-result-object v3

    .line 424
    invoke-static {v3, v6}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 425
    .line 426
    .line 427
    iput-object v3, v0, LJd/B;->a:Ljava/lang/String;

    .line 428
    .line 429
    invoke-virtual {v1, v2, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 430
    .line 431
    .line 432
    move-result-object v1

    .line 433
    invoke-static {v1, v6}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 434
    .line 435
    .line 436
    invoke-static {v0, v1}, Lvf/a;->L(LJd/B;Ljava/lang/String;)V

    .line 437
    .line 438
    .line 439
    return-void

    .line 440
    :cond_1e
    :goto_10
    invoke-virtual {v1, v4, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 441
    .line 442
    .line 443
    move-result-object v1

    .line 444
    invoke-static {v1, v6}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 445
    .line 446
    .line 447
    iput-object v1, v0, LJd/B;->a:Ljava/lang/String;

    .line 448
    .line 449
    return-void

    .line 450
    :cond_1f
    iput-object v5, v0, LJd/B;->a:Ljava/lang/String;

    .line 451
    .line 452
    invoke-virtual {v1, v4, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 453
    .line 454
    .line 455
    move-result-object v1

    .line 456
    invoke-static {v1, v6}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 457
    .line 458
    .line 459
    invoke-static {v0, v1}, Lvf/a;->L(LJd/B;Ljava/lang/String;)V

    .line 460
    .line 461
    .line 462
    return-void

    .line 463
    :cond_20
    invoke-virtual {v0}, LJd/B;->c()LJd/D;

    .line 464
    .line 465
    .line 466
    move-result-object v7

    .line 467
    iget-object v7, v7, LJd/D;->a:Ljava/lang/String;

    .line 468
    .line 469
    const-string v12, "mailto"

    .line 470
    .line 471
    invoke-static {v7, v12}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 472
    .line 473
    .line 474
    move-result v7

    .line 475
    const-string v12, "Failed requirement."

    .line 476
    .line 477
    const/4 v13, 0x0

    .line 478
    if-eqz v7, :cond_24

    .line 479
    .line 480
    if-nez v2, :cond_23

    .line 481
    .line 482
    const-string v2, "@"

    .line 483
    .line 484
    const/4 v5, 0x0

    .line 485
    invoke-static {v1, v2, v4, v5, v10}, LBf/k;->w0(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 486
    .line 487
    .line 488
    move-result v2

    .line 489
    if-eq v2, v3, :cond_22

    .line 490
    .line 491
    invoke-virtual {v1, v4, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 492
    .line 493
    .line 494
    move-result-object v3

    .line 495
    invoke-static {v3, v6}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 496
    .line 497
    .line 498
    invoke-static {v3}, LJd/b;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 499
    .line 500
    .line 501
    move-result-object v3

    .line 502
    if-eqz v3, :cond_21

    .line 503
    .line 504
    invoke-static {v3, v5}, LJd/b;->e(Ljava/lang/String;Z)Ljava/lang/String;

    .line 505
    .line 506
    .line 507
    move-result-object v13

    .line 508
    :cond_21
    iput-object v13, v0, LJd/B;->e:Ljava/lang/String;

    .line 509
    .line 510
    const/16 v16, 0x1

    .line 511
    .line 512
    add-int/lit8 v2, v2, 0x1

    .line 513
    .line 514
    invoke-virtual {v1, v2, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 515
    .line 516
    .line 517
    move-result-object v1

    .line 518
    invoke-static {v1, v6}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 519
    .line 520
    .line 521
    iput-object v1, v0, LJd/B;->a:Ljava/lang/String;

    .line 522
    .line 523
    return-void

    .line 524
    :cond_22
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 525
    .line 526
    const-string v2, "Invalid mailto url: "

    .line 527
    .line 528
    const-string v3, ", it should contain \'@\'."

    .line 529
    .line 530
    invoke-static {v2, v1, v3}, LA7/p0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 531
    .line 532
    .line 533
    move-result-object v1

    .line 534
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 535
    .line 536
    .line 537
    throw v0

    .line 538
    :cond_23
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 539
    .line 540
    invoke-direct {v0, v12}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 541
    .line 542
    .line 543
    throw v0

    .line 544
    :cond_24
    invoke-virtual {v0}, LJd/B;->c()LJd/D;

    .line 545
    .line 546
    .line 547
    move-result-object v7

    .line 548
    iget-object v7, v7, LJd/D;->a:Ljava/lang/String;

    .line 549
    .line 550
    const-string v14, "about"

    .line 551
    .line 552
    invoke-static {v7, v14}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 553
    .line 554
    .line 555
    move-result v7

    .line 556
    if-eqz v7, :cond_26

    .line 557
    .line 558
    if-nez v2, :cond_25

    .line 559
    .line 560
    invoke-virtual {v1, v4, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 561
    .line 562
    .line 563
    move-result-object v1

    .line 564
    invoke-static {v1, v6}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 565
    .line 566
    .line 567
    iput-object v1, v0, LJd/B;->a:Ljava/lang/String;

    .line 568
    .line 569
    return-void

    .line 570
    :cond_25
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 571
    .line 572
    invoke-direct {v0, v12}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 573
    .line 574
    .line 575
    throw v0

    .line 576
    :cond_26
    invoke-virtual {v0}, LJd/B;->c()LJd/D;

    .line 577
    .line 578
    .line 579
    move-result-object v7

    .line 580
    iget-object v7, v7, LJd/D;->a:Ljava/lang/String;

    .line 581
    .line 582
    const-string v14, "tel"

    .line 583
    .line 584
    invoke-static {v7, v14}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 585
    .line 586
    .line 587
    move-result v7

    .line 588
    if-eqz v7, :cond_28

    .line 589
    .line 590
    if-nez v2, :cond_27

    .line 591
    .line 592
    invoke-virtual {v1, v4, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 593
    .line 594
    .line 595
    move-result-object v1

    .line 596
    invoke-static {v1, v6}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 597
    .line 598
    .line 599
    iput-object v1, v0, LJd/B;->a:Ljava/lang/String;

    .line 600
    .line 601
    return-void

    .line 602
    :cond_27
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 603
    .line 604
    invoke-direct {v0, v12}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 605
    .line 606
    .line 607
    throw v0

    .line 608
    :cond_28
    if-lt v2, v9, :cond_31

    .line 609
    .line 610
    :goto_11
    const/4 v7, 0x5

    .line 611
    new-array v12, v7, [C

    .line 612
    .line 613
    const/4 v14, 0x0

    .line 614
    :goto_12
    if-ge v14, v7, :cond_29

    .line 615
    .line 616
    const-string v7, "@/\\?#"

    .line 617
    .line 618
    invoke-virtual {v7, v14}, Ljava/lang/String;->charAt(I)C

    .line 619
    .line 620
    .line 621
    move-result v7

    .line 622
    aput-char v7, v12, v14

    .line 623
    .line 624
    const/16 v16, 0x1

    .line 625
    .line 626
    add-int/lit8 v14, v14, 0x1

    .line 627
    .line 628
    const/4 v7, 0x5

    .line 629
    goto :goto_12

    .line 630
    :cond_29
    const/4 v7, 0x0

    .line 631
    invoke-static {v1, v12, v4, v7}, LBf/k;->x0(Ljava/lang/CharSequence;[CIZ)I

    .line 632
    .line 633
    .line 634
    move-result v12

    .line 635
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 636
    .line 637
    .line 638
    move-result-object v7

    .line 639
    if-lez v12, :cond_2a

    .line 640
    .line 641
    goto :goto_13

    .line 642
    :cond_2a
    move-object v7, v13

    .line 643
    :goto_13
    if-eqz v7, :cond_2b

    .line 644
    .line 645
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 646
    .line 647
    .line 648
    move-result v7

    .line 649
    goto :goto_14

    .line 650
    :cond_2b
    move v7, v8

    .line 651
    :goto_14
    if-ge v7, v8, :cond_2d

    .line 652
    .line 653
    invoke-virtual {v1, v7}, Ljava/lang/String;->charAt(I)C

    .line 654
    .line 655
    .line 656
    move-result v12

    .line 657
    const/16 v14, 0x40

    .line 658
    .line 659
    if-ne v12, v14, :cond_2d

    .line 660
    .line 661
    invoke-static {v4, v7, v1}, LJd/C;->a(IILjava/lang/String;)I

    .line 662
    .line 663
    .line 664
    move-result v12

    .line 665
    if-eq v12, v3, :cond_2c

    .line 666
    .line 667
    invoke-virtual {v1, v4, v12}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 668
    .line 669
    .line 670
    move-result-object v4

    .line 671
    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 672
    .line 673
    .line 674
    iput-object v4, v0, LJd/B;->e:Ljava/lang/String;

    .line 675
    .line 676
    const/16 v16, 0x1

    .line 677
    .line 678
    add-int/lit8 v12, v12, 0x1

    .line 679
    .line 680
    invoke-virtual {v1, v12, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 681
    .line 682
    .line 683
    move-result-object v4

    .line 684
    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 685
    .line 686
    .line 687
    iput-object v4, v0, LJd/B;->f:Ljava/lang/String;

    .line 688
    .line 689
    :goto_15
    const/16 v16, 0x1

    .line 690
    .line 691
    goto :goto_16

    .line 692
    :cond_2c
    invoke-virtual {v1, v4, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 693
    .line 694
    .line 695
    move-result-object v4

    .line 696
    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 697
    .line 698
    .line 699
    iput-object v4, v0, LJd/B;->e:Ljava/lang/String;

    .line 700
    .line 701
    goto :goto_15

    .line 702
    :goto_16
    add-int/lit8 v4, v7, 0x1

    .line 703
    .line 704
    goto :goto_11

    .line 705
    :cond_2d
    invoke-static {v4, v7, v1}, LJd/C;->a(IILjava/lang/String;)I

    .line 706
    .line 707
    .line 708
    move-result v3

    .line 709
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 710
    .line 711
    .line 712
    move-result-object v12

    .line 713
    if-lez v3, :cond_2e

    .line 714
    .line 715
    goto :goto_17

    .line 716
    :cond_2e
    move-object v12, v13

    .line 717
    :goto_17
    if-eqz v12, :cond_2f

    .line 718
    .line 719
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    .line 720
    .line 721
    .line 722
    move-result v3

    .line 723
    goto :goto_18

    .line 724
    :cond_2f
    move v3, v7

    .line 725
    :goto_18
    invoke-virtual {v1, v4, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 726
    .line 727
    .line 728
    move-result-object v4

    .line 729
    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 730
    .line 731
    .line 732
    iput-object v4, v0, LJd/B;->a:Ljava/lang/String;

    .line 733
    .line 734
    const/16 v16, 0x1

    .line 735
    .line 736
    add-int/lit8 v3, v3, 0x1

    .line 737
    .line 738
    if-ge v3, v7, :cond_30

    .line 739
    .line 740
    invoke-virtual {v1, v3, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 741
    .line 742
    .line 743
    move-result-object v3

    .line 744
    invoke-static {v3, v6}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 745
    .line 746
    .line 747
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 748
    .line 749
    .line 750
    move-result v3

    .line 751
    goto :goto_19

    .line 752
    :cond_30
    const/4 v3, 0x0

    .line 753
    :goto_19
    invoke-virtual {v0, v3}, LJd/B;->d(I)V

    .line 754
    .line 755
    .line 756
    move v4, v7

    .line 757
    :cond_31
    sget-object v3, Lff/v;->a:Lff/v;

    .line 758
    .line 759
    sget-object v7, LJd/C;->a:Ljava/util/List;

    .line 760
    .line 761
    if-lt v4, v8, :cond_33

    .line 762
    .line 763
    invoke-virtual {v1, v5}, Ljava/lang/String;->charAt(I)C

    .line 764
    .line 765
    .line 766
    move-result v1

    .line 767
    if-ne v1, v15, :cond_32

    .line 768
    .line 769
    move-object v3, v7

    .line 770
    :cond_32
    const-string v1, "<set-?>"

    .line 771
    .line 772
    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 773
    .line 774
    .line 775
    iput-object v3, v0, LJd/B;->h:Ljava/util/List;

    .line 776
    .line 777
    return-void

    .line 778
    :cond_33
    if-nez v2, :cond_34

    .line 779
    .line 780
    iget-object v5, v0, LJd/B;->h:Ljava/util/List;

    .line 781
    .line 782
    invoke-static {v5}, Lff/o;->m0(Ljava/util/List;)Ljava/util/List;

    .line 783
    .line 784
    .line 785
    move-result-object v5

    .line 786
    goto :goto_1a

    .line 787
    :cond_34
    move-object v5, v3

    .line 788
    :goto_1a
    iput-object v5, v0, LJd/B;->h:Ljava/util/List;

    .line 789
    .line 790
    new-array v5, v9, [C

    .line 791
    .line 792
    const/4 v12, 0x0

    .line 793
    :goto_1b
    if-ge v12, v9, :cond_35

    .line 794
    .line 795
    const-string v14, "?#"

    .line 796
    .line 797
    invoke-virtual {v14, v12}, Ljava/lang/String;->charAt(I)C

    .line 798
    .line 799
    .line 800
    move-result v14

    .line 801
    aput-char v14, v5, v12

    .line 802
    .line 803
    const/16 v16, 0x1

    .line 804
    .line 805
    add-int/lit8 v12, v12, 0x1

    .line 806
    .line 807
    goto :goto_1b

    .line 808
    :cond_35
    const/4 v12, 0x0

    .line 809
    invoke-static {v1, v5, v4, v12}, LBf/k;->x0(Ljava/lang/CharSequence;[CIZ)I

    .line 810
    .line 811
    .line 812
    move-result v5

    .line 813
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 814
    .line 815
    .line 816
    move-result-object v9

    .line 817
    if-lez v5, :cond_36

    .line 818
    .line 819
    goto :goto_1c

    .line 820
    :cond_36
    move-object v9, v13

    .line 821
    :goto_1c
    if-eqz v9, :cond_37

    .line 822
    .line 823
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 824
    .line 825
    .line 826
    move-result v5

    .line 827
    goto :goto_1d

    .line 828
    :cond_37
    move v5, v8

    .line 829
    :goto_1d
    if-le v5, v4, :cond_3b

    .line 830
    .line 831
    invoke-virtual {v1, v4, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 832
    .line 833
    .line 834
    move-result-object v4

    .line 835
    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 836
    .line 837
    .line 838
    iget-object v9, v0, LJd/B;->h:Ljava/util/List;

    .line 839
    .line 840
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 841
    .line 842
    .line 843
    move-result v9

    .line 844
    const/4 v12, 0x1

    .line 845
    if-ne v9, v12, :cond_38

    .line 846
    .line 847
    iget-object v9, v0, LJd/B;->h:Ljava/util/List;

    .line 848
    .line 849
    invoke-static {v9}, Lff/o;->q0(Ljava/util/List;)Ljava/lang/Object;

    .line 850
    .line 851
    .line 852
    move-result-object v9

    .line 853
    check-cast v9, Ljava/lang/CharSequence;

    .line 854
    .line 855
    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    .line 856
    .line 857
    .line 858
    move-result v9

    .line 859
    if-nez v9, :cond_38

    .line 860
    .line 861
    move-object v9, v3

    .line 862
    goto :goto_1e

    .line 863
    :cond_38
    iget-object v9, v0, LJd/B;->h:Ljava/util/List;

    .line 864
    .line 865
    :goto_1e
    invoke-virtual {v4, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 866
    .line 867
    .line 868
    move-result v11

    .line 869
    if-eqz v11, :cond_39

    .line 870
    .line 871
    move-object v4, v7

    .line 872
    const/4 v12, 0x1

    .line 873
    goto :goto_1f

    .line 874
    :cond_39
    const/4 v12, 0x1

    .line 875
    new-array v11, v12, [C

    .line 876
    .line 877
    const/16 v17, 0x0

    .line 878
    .line 879
    aput-char v15, v11, v17

    .line 880
    .line 881
    invoke-static {v4, v11}, LBf/k;->H0(Ljava/lang/CharSequence;[C)Ljava/util/List;

    .line 882
    .line 883
    .line 884
    move-result-object v4

    .line 885
    :goto_1f
    if-ne v2, v12, :cond_3a

    .line 886
    .line 887
    move-object v3, v7

    .line 888
    :cond_3a
    check-cast v3, Ljava/util/Collection;

    .line 889
    .line 890
    check-cast v4, Ljava/lang/Iterable;

    .line 891
    .line 892
    invoke-static {v4, v3}, Lff/o;->E0(Ljava/lang/Iterable;Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 893
    .line 894
    .line 895
    move-result-object v2

    .line 896
    check-cast v9, Ljava/util/Collection;

    .line 897
    .line 898
    invoke-static {v2, v9}, Lff/o;->E0(Ljava/lang/Iterable;Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 899
    .line 900
    .line 901
    move-result-object v2

    .line 902
    iput-object v2, v0, LJd/B;->h:Ljava/util/List;

    .line 903
    .line 904
    move v4, v5

    .line 905
    :cond_3b
    if-ge v4, v8, :cond_3f

    .line 906
    .line 907
    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    .line 908
    .line 909
    .line 910
    move-result v2

    .line 911
    const/16 v3, 0x3f

    .line 912
    .line 913
    if-ne v2, v3, :cond_3f

    .line 914
    .line 915
    const/4 v12, 0x1

    .line 916
    add-int/2addr v4, v12

    .line 917
    if-ne v4, v8, :cond_3c

    .line 918
    .line 919
    iput-boolean v12, v0, LJd/B;->b:Z

    .line 920
    .line 921
    move v4, v8

    .line 922
    goto :goto_21

    .line 923
    :cond_3c
    const/16 v2, 0x23

    .line 924
    .line 925
    invoke-static {v1, v2, v4, v10}, LBf/k;->v0(Ljava/lang/CharSequence;CII)I

    .line 926
    .line 927
    .line 928
    move-result v3

    .line 929
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 930
    .line 931
    .line 932
    move-result-object v2

    .line 933
    if-lez v3, :cond_3d

    .line 934
    .line 935
    move-object v13, v2

    .line 936
    :cond_3d
    if-eqz v13, :cond_3e

    .line 937
    .line 938
    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    .line 939
    .line 940
    .line 941
    move-result v2

    .line 942
    goto :goto_20

    .line 943
    :cond_3e
    move v2, v8

    .line 944
    :goto_20
    invoke-virtual {v1, v4, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 945
    .line 946
    .line 947
    move-result-object v3

    .line 948
    invoke-static {v3, v6}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 949
    .line 950
    .line 951
    invoke-static {v3}, Ltg/b;->L(Ljava/lang/String;)LJd/x;

    .line 952
    .line 953
    .line 954
    move-result-object v3

    .line 955
    new-instance v4, LBf/s;

    .line 956
    .line 957
    const/4 v7, 0x5

    .line 958
    invoke-direct {v4, v0, v7}, LBf/s;-><init>(Ljava/lang/Object;I)V

    .line 959
    .line 960
    .line 961
    invoke-interface {v3, v4}, LNd/j;->d(Ltf/p;)V

    .line 962
    .line 963
    .line 964
    move v4, v2

    .line 965
    :cond_3f
    :goto_21
    if-ge v4, v8, :cond_40

    .line 966
    .line 967
    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    .line 968
    .line 969
    .line 970
    move-result v2

    .line 971
    const/16 v3, 0x23

    .line 972
    .line 973
    if-ne v2, v3, :cond_40

    .line 974
    .line 975
    const/16 v16, 0x1

    .line 976
    .line 977
    add-int/lit8 v4, v4, 0x1

    .line 978
    .line 979
    invoke-virtual {v1, v4, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 980
    .line 981
    .line 982
    move-result-object v1

    .line 983
    invoke-static {v1, v6}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 984
    .line 985
    .line 986
    iput-object v1, v0, LJd/B;->g:Ljava/lang/String;

    .line 987
    .line 988
    :cond_40
    return-void
.end method
