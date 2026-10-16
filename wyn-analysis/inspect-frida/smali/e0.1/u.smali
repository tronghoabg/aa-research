.class public final Le0/u;
.super Le0/C;
.source "SourceFile"


# instance fields
.field public final c:Ljava/util/List;

.field public final d:J

.field public final e:J


# direct methods
.method public constructor <init>(Ljava/util/List;JJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Le0/C;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Le0/u;->c:Ljava/util/List;

    .line 5
    .line 6
    iput-wide p2, p0, Le0/u;->d:J

    .line 7
    .line 8
    iput-wide p4, p0, Le0/u;->e:J

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final b(J)Landroid/graphics/Shader;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-wide v1, v0, Le0/u;->d:J

    .line 4
    .line 5
    invoke-static {v1, v2}, Ld0/c;->b(J)F

    .line 6
    .line 7
    .line 8
    move-result v3

    .line 9
    const/high16 v4, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 10
    .line 11
    cmpg-float v3, v3, v4

    .line 12
    .line 13
    if-nez v3, :cond_0

    .line 14
    .line 15
    invoke-static/range {p1 .. p2}, Ld0/f;->d(J)F

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-static {v1, v2}, Ld0/c;->b(J)F

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    :goto_0
    invoke-static {v1, v2}, Ld0/c;->c(J)F

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    cmpg-float v5, v5, v4

    .line 29
    .line 30
    if-nez v5, :cond_1

    .line 31
    .line 32
    invoke-static/range {p1 .. p2}, Ld0/f;->b(J)F

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    goto :goto_1

    .line 37
    :cond_1
    invoke-static {v1, v2}, Ld0/c;->c(J)F

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    :goto_1
    iget-wide v5, v0, Le0/u;->e:J

    .line 42
    .line 43
    invoke-static {v5, v6}, Ld0/c;->b(J)F

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    cmpg-float v2, v2, v4

    .line 48
    .line 49
    if-nez v2, :cond_2

    .line 50
    .line 51
    invoke-static/range {p1 .. p2}, Ld0/f;->d(J)F

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    goto :goto_2

    .line 56
    :cond_2
    invoke-static {v5, v6}, Ld0/c;->b(J)F

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    :goto_2
    invoke-static {v5, v6}, Ld0/c;->c(J)F

    .line 61
    .line 62
    .line 63
    move-result v7

    .line 64
    cmpg-float v4, v7, v4

    .line 65
    .line 66
    if-nez v4, :cond_3

    .line 67
    .line 68
    invoke-static/range {p1 .. p2}, Ld0/f;->b(J)F

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    goto :goto_3

    .line 73
    :cond_3
    invoke-static {v5, v6}, Ld0/c;->c(J)F

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    :goto_3
    invoke-static {v3, v1}, LU8/v0;->f(FF)J

    .line 78
    .line 79
    .line 80
    move-result-wide v5

    .line 81
    invoke-static {v2, v4}, LU8/v0;->f(FF)J

    .line 82
    .line 83
    .line 84
    move-result-wide v1

    .line 85
    iget-object v3, v0, Le0/u;->c:Ljava/util/List;

    .line 86
    .line 87
    const-string v4, "colors"

    .line 88
    .line 89
    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 93
    .line 94
    .line 95
    move-result v4

    .line 96
    const/4 v7, 0x2

    .line 97
    if-lt v4, v7, :cond_10

    .line 98
    .line 99
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 100
    .line 101
    const/4 v7, 0x0

    .line 102
    const/4 v8, 0x1

    .line 103
    const/16 v9, 0x1a

    .line 104
    .line 105
    if-lt v4, v9, :cond_4

    .line 106
    .line 107
    const/4 v12, 0x0

    .line 108
    goto :goto_5

    .line 109
    :cond_4
    invoke-static {v3}, Lr7/e;->z(Ljava/util/List;)I

    .line 110
    .line 111
    .line 112
    move-result v4

    .line 113
    move v11, v8

    .line 114
    const/4 v12, 0x0

    .line 115
    :goto_4
    if-ge v11, v4, :cond_6

    .line 116
    .line 117
    invoke-interface {v3, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v13

    .line 121
    check-cast v13, Le0/q;

    .line 122
    .line 123
    iget-wide v13, v13, Le0/q;->a:J

    .line 124
    .line 125
    invoke-static {v13, v14}, Le0/q;->c(J)F

    .line 126
    .line 127
    .line 128
    move-result v13

    .line 129
    cmpg-float v13, v13, v7

    .line 130
    .line 131
    if-nez v13, :cond_5

    .line 132
    .line 133
    add-int/lit8 v12, v12, 0x1

    .line 134
    .line 135
    :cond_5
    add-int/lit8 v11, v11, 0x1

    .line 136
    .line 137
    goto :goto_4

    .line 138
    :cond_6
    :goto_5
    new-instance v13, Landroid/graphics/LinearGradient;

    .line 139
    .line 140
    invoke-static {v5, v6}, Ld0/c;->b(J)F

    .line 141
    .line 142
    .line 143
    move-result v14

    .line 144
    invoke-static {v5, v6}, Ld0/c;->c(J)F

    .line 145
    .line 146
    .line 147
    move-result v15

    .line 148
    invoke-static {v1, v2}, Ld0/c;->b(J)F

    .line 149
    .line 150
    .line 151
    move-result v16

    .line 152
    invoke-static {v1, v2}, Ld0/c;->c(J)F

    .line 153
    .line 154
    .line 155
    move-result v17

    .line 156
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 157
    .line 158
    if-lt v1, v9, :cond_8

    .line 159
    .line 160
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 161
    .line 162
    .line 163
    move-result v1

    .line 164
    new-array v2, v1, [I

    .line 165
    .line 166
    const/4 v4, 0x0

    .line 167
    :goto_6
    if-ge v4, v1, :cond_7

    .line 168
    .line 169
    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v5

    .line 173
    check-cast v5, Le0/q;

    .line 174
    .line 175
    iget-wide v5, v5, Le0/q;->a:J

    .line 176
    .line 177
    invoke-static {v5, v6}, Le0/z;->s(J)I

    .line 178
    .line 179
    .line 180
    move-result v5

    .line 181
    aput v5, v2, v4

    .line 182
    .line 183
    add-int/lit8 v4, v4, 0x1

    .line 184
    .line 185
    goto :goto_6

    .line 186
    :cond_7
    move-object/from16 v18, v2

    .line 187
    .line 188
    const/16 p1, 0x0

    .line 189
    .line 190
    goto/16 :goto_a

    .line 191
    .line 192
    :cond_8
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 193
    .line 194
    .line 195
    move-result v1

    .line 196
    add-int/2addr v1, v12

    .line 197
    new-array v2, v1, [I

    .line 198
    .line 199
    invoke-static {v3}, Lr7/e;->z(Ljava/util/List;)I

    .line 200
    .line 201
    .line 202
    move-result v1

    .line 203
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 204
    .line 205
    .line 206
    move-result v4

    .line 207
    const/4 v5, 0x0

    .line 208
    const/4 v6, 0x0

    .line 209
    :goto_7
    if-ge v5, v4, :cond_c

    .line 210
    .line 211
    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v9

    .line 215
    check-cast v9, Le0/q;

    .line 216
    .line 217
    const/16 p1, 0x0

    .line 218
    .line 219
    iget-wide v10, v9, Le0/q;->a:J

    .line 220
    .line 221
    invoke-static {v10, v11}, Le0/q;->c(J)F

    .line 222
    .line 223
    .line 224
    move-result v9

    .line 225
    cmpg-float v9, v9, v7

    .line 226
    .line 227
    if-nez v9, :cond_b

    .line 228
    .line 229
    if-nez v5, :cond_9

    .line 230
    .line 231
    add-int/lit8 v9, v6, 0x1

    .line 232
    .line 233
    invoke-interface {v3, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v10

    .line 237
    check-cast v10, Le0/q;

    .line 238
    .line 239
    iget-wide v10, v10, Le0/q;->a:J

    .line 240
    .line 241
    invoke-static {v10, v11, v7}, Le0/q;->a(JF)J

    .line 242
    .line 243
    .line 244
    move-result-wide v10

    .line 245
    invoke-static {v10, v11}, Le0/z;->s(J)I

    .line 246
    .line 247
    .line 248
    move-result v10

    .line 249
    aput v10, v2, v6

    .line 250
    .line 251
    :goto_8
    move v6, v9

    .line 252
    goto :goto_9

    .line 253
    :cond_9
    if-ne v5, v1, :cond_a

    .line 254
    .line 255
    add-int/lit8 v9, v6, 0x1

    .line 256
    .line 257
    add-int/lit8 v10, v5, -0x1

    .line 258
    .line 259
    invoke-interface {v3, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object v10

    .line 263
    check-cast v10, Le0/q;

    .line 264
    .line 265
    iget-wide v10, v10, Le0/q;->a:J

    .line 266
    .line 267
    invoke-static {v10, v11, v7}, Le0/q;->a(JF)J

    .line 268
    .line 269
    .line 270
    move-result-wide v10

    .line 271
    invoke-static {v10, v11}, Le0/z;->s(J)I

    .line 272
    .line 273
    .line 274
    move-result v10

    .line 275
    aput v10, v2, v6

    .line 276
    .line 277
    goto :goto_8

    .line 278
    :cond_a
    add-int/lit8 v9, v5, -0x1

    .line 279
    .line 280
    invoke-interface {v3, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object v9

    .line 284
    check-cast v9, Le0/q;

    .line 285
    .line 286
    iget-wide v9, v9, Le0/q;->a:J

    .line 287
    .line 288
    add-int/lit8 v11, v6, 0x1

    .line 289
    .line 290
    invoke-static {v9, v10, v7}, Le0/q;->a(JF)J

    .line 291
    .line 292
    .line 293
    move-result-wide v9

    .line 294
    invoke-static {v9, v10}, Le0/z;->s(J)I

    .line 295
    .line 296
    .line 297
    move-result v9

    .line 298
    aput v9, v2, v6

    .line 299
    .line 300
    add-int/lit8 v9, v5, 0x1

    .line 301
    .line 302
    invoke-interface {v3, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object v9

    .line 306
    check-cast v9, Le0/q;

    .line 307
    .line 308
    iget-wide v9, v9, Le0/q;->a:J

    .line 309
    .line 310
    add-int/lit8 v6, v6, 0x2

    .line 311
    .line 312
    invoke-static {v9, v10, v7}, Le0/q;->a(JF)J

    .line 313
    .line 314
    .line 315
    move-result-wide v9

    .line 316
    invoke-static {v9, v10}, Le0/z;->s(J)I

    .line 317
    .line 318
    .line 319
    move-result v9

    .line 320
    aput v9, v2, v11

    .line 321
    .line 322
    goto :goto_9

    .line 323
    :cond_b
    add-int/lit8 v9, v6, 0x1

    .line 324
    .line 325
    invoke-static {v10, v11}, Le0/z;->s(J)I

    .line 326
    .line 327
    .line 328
    move-result v10

    .line 329
    aput v10, v2, v6

    .line 330
    .line 331
    goto :goto_8

    .line 332
    :goto_9
    add-int/lit8 v5, v5, 0x1

    .line 333
    .line 334
    goto :goto_7

    .line 335
    :cond_c
    const/16 p1, 0x0

    .line 336
    .line 337
    move-object/from16 v18, v2

    .line 338
    .line 339
    :goto_a
    if-nez v12, :cond_d

    .line 340
    .line 341
    const/4 v1, 0x0

    .line 342
    :goto_b
    move-object/from16 v19, v1

    .line 343
    .line 344
    goto :goto_e

    .line 345
    :cond_d
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 346
    .line 347
    .line 348
    move-result v1

    .line 349
    add-int/2addr v1, v12

    .line 350
    new-array v1, v1, [F

    .line 351
    .line 352
    aput v7, v1, p1

    .line 353
    .line 354
    invoke-static {v3}, Lr7/e;->z(Ljava/util/List;)I

    .line 355
    .line 356
    .line 357
    move-result v2

    .line 358
    move v4, v8

    .line 359
    :goto_c
    if-ge v8, v2, :cond_f

    .line 360
    .line 361
    invoke-interface {v3, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 362
    .line 363
    .line 364
    move-result-object v5

    .line 365
    check-cast v5, Le0/q;

    .line 366
    .line 367
    iget-wide v5, v5, Le0/q;->a:J

    .line 368
    .line 369
    int-to-float v9, v8

    .line 370
    invoke-static {v3}, Lr7/e;->z(Ljava/util/List;)I

    .line 371
    .line 372
    .line 373
    move-result v10

    .line 374
    int-to-float v10, v10

    .line 375
    div-float/2addr v9, v10

    .line 376
    add-int/lit8 v10, v4, 0x1

    .line 377
    .line 378
    aput v9, v1, v4

    .line 379
    .line 380
    invoke-static {v5, v6}, Le0/q;->c(J)F

    .line 381
    .line 382
    .line 383
    move-result v5

    .line 384
    cmpg-float v5, v5, v7

    .line 385
    .line 386
    if-nez v5, :cond_e

    .line 387
    .line 388
    add-int/lit8 v4, v4, 0x2

    .line 389
    .line 390
    aput v9, v1, v10

    .line 391
    .line 392
    goto :goto_d

    .line 393
    :cond_e
    move v4, v10

    .line 394
    :goto_d
    add-int/lit8 v8, v8, 0x1

    .line 395
    .line 396
    goto :goto_c

    .line 397
    :cond_f
    const/high16 v2, 0x3f800000    # 1.0f

    .line 398
    .line 399
    aput v2, v1, v4

    .line 400
    .line 401
    goto :goto_b

    .line 402
    :goto_e
    sget-object v20, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    .line 403
    .line 404
    invoke-direct/range {v13 .. v20}, Landroid/graphics/LinearGradient;-><init>(FFFF[I[FLandroid/graphics/Shader$TileMode;)V

    .line 405
    .line 406
    .line 407
    return-object v13

    .line 408
    :cond_10
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 409
    .line 410
    const-string v2, "colors must have length of at least 2 if colorStops is omitted."

    .line 411
    .line 412
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 413
    .line 414
    .line 415
    throw v1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Le0/u;

    .line 6
    .line 7
    if-nez v1, :cond_1

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_1
    check-cast p1, Le0/u;

    .line 11
    .line 12
    iget-object v1, p1, Le0/u;->c:Ljava/util/List;

    .line 13
    .line 14
    iget-object v2, p0, Le0/u;->c:Ljava/util/List;

    .line 15
    .line 16
    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-nez v1, :cond_2

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_2
    iget-wide v1, p0, Le0/u;->d:J

    .line 24
    .line 25
    iget-wide v3, p1, Le0/u;->d:J

    .line 26
    .line 27
    invoke-static {v1, v2, v3, v4}, Ld0/c;->a(JJ)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-nez v1, :cond_3

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_3
    iget-wide v1, p0, Le0/u;->e:J

    .line 35
    .line 36
    iget-wide v3, p1, Le0/u;->e:J

    .line 37
    .line 38
    invoke-static {v1, v2, v3, v4}, Ld0/c;->a(JJ)Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    if-nez p1, :cond_4

    .line 43
    .line 44
    :goto_0
    const/4 p1, 0x0

    .line 45
    return p1

    .line 46
    :cond_4
    return v0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, Le0/u;->c:Ljava/util/List;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit16 v0, v0, 0x3c1

    .line 8
    .line 9
    iget-wide v1, p0, Le0/u;->d:J

    .line 10
    .line 11
    invoke-static {v1, v2}, Ld0/c;->d(J)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/2addr v1, v0

    .line 16
    mul-int/lit8 v1, v1, 0x1f

    .line 17
    .line 18
    iget-wide v2, p0, Le0/u;->e:J

    .line 19
    .line 20
    invoke-static {v2, v3}, Ld0/c;->d(J)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    add-int/2addr v0, v1

    .line 25
    mul-int/lit8 v0, v0, 0x1f

    .line 26
    .line 27
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    .line 1
    iget-wide v0, p0, Le0/u;->d:J

    .line 2
    .line 3
    invoke-static {v0, v1}, LU8/v0;->R(J)Z

    .line 4
    .line 5
    .line 6
    move-result v2

    .line 7
    const-string v3, ""

    .line 8
    .line 9
    const-string v4, ", "

    .line 10
    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    new-instance v2, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v5, "start="

    .line 16
    .line 17
    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-static {v0, v1}, Ld0/c;->g(J)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move-object v0, v3

    .line 36
    :goto_0
    iget-wide v1, p0, Le0/u;->e:J

    .line 37
    .line 38
    invoke-static {v1, v2}, LU8/v0;->R(J)Z

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    if-eqz v5, :cond_1

    .line 43
    .line 44
    new-instance v3, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    const-string v5, "end="

    .line 47
    .line 48
    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-static {v1, v2}, Ld0/c;->g(J)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    .line 66
    .line 67
    const-string v2, "LinearGradient(colors="

    .line 68
    .line 69
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    iget-object v2, p0, Le0/u;->c:Ljava/util/List;

    .line 73
    .line 74
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    const-string v2, ", stops=null, "

    .line 78
    .line 79
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    const-string v0, "tileMode="

    .line 89
    .line 90
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    const-string v0, "Clamp"

    .line 94
    .line 95
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    const/16 v0, 0x29

    .line 99
    .line 100
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    return-object v0
.end method
