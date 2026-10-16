.class public abstract Lu6/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:[B

.field public static final b:[Ljava/lang/String;

.field public static final c:Ljava/lang/Object;

.field public static final d:[B

.field public static final e:[F

.field public static final f:Ljava/lang/Object;

.field public static g:[I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 5

    .line 1
    const/4 v0, 0x4

    .line 2
    new-array v1, v0, [B

    .line 3
    .line 4
    fill-array-data v1, :array_0

    .line 5
    .line 6
    .line 7
    sput-object v1, Lu6/a;->a:[B

    .line 8
    .line 9
    const-string v1, "B"

    .line 10
    .line 11
    const-string v2, "C"

    .line 12
    .line 13
    const-string v3, ""

    .line 14
    .line 15
    const-string v4, "A"

    .line 16
    .line 17
    filled-new-array {v3, v4, v1, v2}, [Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    sput-object v1, Lu6/a;->b:[Ljava/lang/String;

    .line 22
    .line 23
    new-instance v1, Ljava/lang/Object;

    .line 24
    .line 25
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 26
    .line 27
    .line 28
    sput-object v1, Lu6/a;->c:Ljava/lang/Object;

    .line 29
    .line 30
    new-array v0, v0, [B

    .line 31
    .line 32
    fill-array-data v0, :array_1

    .line 33
    .line 34
    .line 35
    sput-object v0, Lu6/a;->d:[B

    .line 36
    .line 37
    const/16 v0, 0x11

    .line 38
    .line 39
    new-array v0, v0, [F

    .line 40
    .line 41
    fill-array-data v0, :array_2

    .line 42
    .line 43
    .line 44
    sput-object v0, Lu6/a;->e:[F

    .line 45
    .line 46
    new-instance v0, Ljava/lang/Object;

    .line 47
    .line 48
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 49
    .line 50
    .line 51
    sput-object v0, Lu6/a;->f:Ljava/lang/Object;

    .line 52
    .line 53
    const/16 v0, 0xa

    .line 54
    .line 55
    new-array v0, v0, [I

    .line 56
    .line 57
    sput-object v0, Lu6/a;->g:[I

    .line 58
    .line 59
    return-void

    .line 60
    nop

    .line 61
    :array_0
    .array-data 1
        0x0t
        0x0t
        0x0t
        0x1t
    .end array-data

    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    :array_1
    .array-data 1
        0x0t
        0x0t
        0x0t
        0x1t
    .end array-data

    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    :array_2
    .array-data 4
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f8ba2e9
        0x3f68ba2f
        0x3fba2e8c
        0x3f9b26ca
        0x400ba2e9
        0x3fe8ba2f
        0x403a2e8c
        0x401b26ca
        0x3fd1745d
        0x3fae8ba3
        0x3ff83e10
        0x3fcede62
        0x3faaaaab
        0x3fc00000    # 1.5f
        0x40000000    # 2.0f
    .end array-data
.end method

.method public static A(II[B)Lu6/n;
    .locals 23

    .line 1
    const/4 v0, 0x1

    .line 2
    add-int/lit8 v1, p0, 0x1

    .line 3
    .line 4
    new-instance v2, LJ5/y;

    .line 5
    .line 6
    const/4 v3, 0x7

    .line 7
    move/from16 v4, p1

    .line 8
    .line 9
    move-object/from16 v5, p2

    .line 10
    .line 11
    invoke-direct {v2, v1, v5, v4, v3}, LJ5/y;-><init>(I[BII)V

    .line 12
    .line 13
    .line 14
    const/16 v1, 0x8

    .line 15
    .line 16
    invoke-virtual {v2, v1}, LJ5/y;->i(I)I

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    invoke-virtual {v2, v1}, LJ5/y;->i(I)I

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    invoke-virtual {v2, v1}, LJ5/y;->i(I)I

    .line 25
    .line 26
    .line 27
    move-result v6

    .line 28
    invoke-virtual {v2}, LJ5/y;->m()I

    .line 29
    .line 30
    .line 31
    move-result v7

    .line 32
    const/16 v3, 0x64

    .line 33
    .line 34
    const/4 v8, 0x3

    .line 35
    if-eq v4, v3, :cond_1

    .line 36
    .line 37
    const/16 v3, 0x6e

    .line 38
    .line 39
    if-eq v4, v3, :cond_1

    .line 40
    .line 41
    const/16 v3, 0x7a

    .line 42
    .line 43
    if-eq v4, v3, :cond_1

    .line 44
    .line 45
    const/16 v3, 0xf4

    .line 46
    .line 47
    if-eq v4, v3, :cond_1

    .line 48
    .line 49
    const/16 v3, 0x2c

    .line 50
    .line 51
    if-eq v4, v3, :cond_1

    .line 52
    .line 53
    const/16 v3, 0x53

    .line 54
    .line 55
    if-eq v4, v3, :cond_1

    .line 56
    .line 57
    const/16 v3, 0x56

    .line 58
    .line 59
    if-eq v4, v3, :cond_1

    .line 60
    .line 61
    const/16 v3, 0x76

    .line 62
    .line 63
    if-eq v4, v3, :cond_1

    .line 64
    .line 65
    const/16 v3, 0x80

    .line 66
    .line 67
    if-eq v4, v3, :cond_1

    .line 68
    .line 69
    const/16 v3, 0x8a

    .line 70
    .line 71
    if-ne v4, v3, :cond_0

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_0
    move v3, v0

    .line 75
    const/4 v11, 0x0

    .line 76
    goto :goto_7

    .line 77
    :cond_1
    :goto_0
    invoke-virtual {v2}, LJ5/y;->m()I

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    if-ne v3, v8, :cond_2

    .line 82
    .line 83
    invoke-virtual {v2}, LJ5/y;->h()Z

    .line 84
    .line 85
    .line 86
    move-result v11

    .line 87
    goto :goto_1

    .line 88
    :cond_2
    const/4 v11, 0x0

    .line 89
    :goto_1
    invoke-virtual {v2}, LJ5/y;->m()I

    .line 90
    .line 91
    .line 92
    invoke-virtual {v2}, LJ5/y;->m()I

    .line 93
    .line 94
    .line 95
    invoke-virtual {v2}, LJ5/y;->s()V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v2}, LJ5/y;->h()Z

    .line 99
    .line 100
    .line 101
    move-result v12

    .line 102
    if-eqz v12, :cond_8

    .line 103
    .line 104
    if-eq v3, v8, :cond_3

    .line 105
    .line 106
    move v12, v1

    .line 107
    goto :goto_2

    .line 108
    :cond_3
    const/16 v12, 0xc

    .line 109
    .line 110
    :goto_2
    const/4 v13, 0x0

    .line 111
    :goto_3
    if-ge v13, v12, :cond_8

    .line 112
    .line 113
    invoke-virtual {v2}, LJ5/y;->h()Z

    .line 114
    .line 115
    .line 116
    move-result v14

    .line 117
    if-eqz v14, :cond_7

    .line 118
    .line 119
    const/4 v14, 0x6

    .line 120
    if-ge v13, v14, :cond_4

    .line 121
    .line 122
    const/16 v14, 0x10

    .line 123
    .line 124
    goto :goto_4

    .line 125
    :cond_4
    const/16 v14, 0x40

    .line 126
    .line 127
    :goto_4
    move/from16 v16, v1

    .line 128
    .line 129
    move/from16 v17, v16

    .line 130
    .line 131
    const/4 v15, 0x0

    .line 132
    :goto_5
    if-ge v15, v14, :cond_7

    .line 133
    .line 134
    if-eqz v16, :cond_5

    .line 135
    .line 136
    invoke-virtual {v2}, LJ5/y;->n()I

    .line 137
    .line 138
    .line 139
    move-result v16

    .line 140
    add-int v10, v16, v17

    .line 141
    .line 142
    add-int/lit16 v10, v10, 0x100

    .line 143
    .line 144
    rem-int/lit16 v10, v10, 0x100

    .line 145
    .line 146
    move/from16 v16, v10

    .line 147
    .line 148
    :cond_5
    if-nez v16, :cond_6

    .line 149
    .line 150
    goto :goto_6

    .line 151
    :cond_6
    move/from16 v17, v16

    .line 152
    .line 153
    :goto_6
    add-int/lit8 v15, v15, 0x1

    .line 154
    .line 155
    goto :goto_5

    .line 156
    :cond_7
    add-int/lit8 v13, v13, 0x1

    .line 157
    .line 158
    goto :goto_3

    .line 159
    :cond_8
    :goto_7
    invoke-virtual {v2}, LJ5/y;->m()I

    .line 160
    .line 161
    .line 162
    move-result v10

    .line 163
    add-int/lit8 v13, v10, 0x4

    .line 164
    .line 165
    invoke-virtual {v2}, LJ5/y;->m()I

    .line 166
    .line 167
    .line 168
    move-result v14

    .line 169
    if-nez v14, :cond_9

    .line 170
    .line 171
    invoke-virtual {v2}, LJ5/y;->m()I

    .line 172
    .line 173
    .line 174
    move-result v10

    .line 175
    add-int/lit8 v10, v10, 0x4

    .line 176
    .line 177
    move-object v15, v2

    .line 178
    const/16 p1, 0x10

    .line 179
    .line 180
    :goto_8
    const/16 v16, 0x0

    .line 181
    .line 182
    goto :goto_a

    .line 183
    :cond_9
    if-ne v14, v0, :cond_b

    .line 184
    .line 185
    invoke-virtual {v2}, LJ5/y;->h()Z

    .line 186
    .line 187
    .line 188
    move-result v10

    .line 189
    invoke-virtual {v2}, LJ5/y;->n()I

    .line 190
    .line 191
    .line 192
    invoke-virtual {v2}, LJ5/y;->n()I

    .line 193
    .line 194
    .line 195
    invoke-virtual {v2}, LJ5/y;->m()I

    .line 196
    .line 197
    .line 198
    move-result v12

    .line 199
    move/from16 p2, v10

    .line 200
    .line 201
    const/16 p1, 0x10

    .line 202
    .line 203
    int-to-long v9, v12

    .line 204
    move-object v15, v2

    .line 205
    const/4 v12, 0x0

    .line 206
    :goto_9
    int-to-long v1, v12

    .line 207
    cmp-long v1, v1, v9

    .line 208
    .line 209
    if-gez v1, :cond_a

    .line 210
    .line 211
    invoke-virtual {v15}, LJ5/y;->m()I

    .line 212
    .line 213
    .line 214
    add-int/lit8 v12, v12, 0x1

    .line 215
    .line 216
    goto :goto_9

    .line 217
    :cond_a
    move/from16 v16, p2

    .line 218
    .line 219
    const/16 v1, 0x8

    .line 220
    .line 221
    const/4 v10, 0x0

    .line 222
    goto :goto_a

    .line 223
    :cond_b
    move-object v15, v2

    .line 224
    const/16 p1, 0x10

    .line 225
    .line 226
    const/4 v10, 0x0

    .line 227
    goto :goto_8

    .line 228
    :goto_a
    invoke-virtual {v15}, LJ5/y;->m()I

    .line 229
    .line 230
    .line 231
    invoke-virtual {v15}, LJ5/y;->s()V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v15}, LJ5/y;->m()I

    .line 235
    .line 236
    .line 237
    move-result v2

    .line 238
    add-int/2addr v2, v0

    .line 239
    invoke-virtual {v15}, LJ5/y;->m()I

    .line 240
    .line 241
    .line 242
    move-result v9

    .line 243
    add-int/2addr v9, v0

    .line 244
    invoke-virtual {v15}, LJ5/y;->h()Z

    .line 245
    .line 246
    .line 247
    move-result v12

    .line 248
    rsub-int/lit8 v17, v12, 0x2

    .line 249
    .line 250
    mul-int v9, v9, v17

    .line 251
    .line 252
    if-nez v12, :cond_c

    .line 253
    .line 254
    invoke-virtual {v15}, LJ5/y;->s()V

    .line 255
    .line 256
    .line 257
    :cond_c
    invoke-virtual {v15}, LJ5/y;->s()V

    .line 258
    .line 259
    .line 260
    mul-int/lit8 v2, v2, 0x10

    .line 261
    .line 262
    mul-int/lit8 v9, v9, 0x10

    .line 263
    .line 264
    invoke-virtual {v15}, LJ5/y;->h()Z

    .line 265
    .line 266
    .line 267
    move-result v18

    .line 268
    if-eqz v18, :cond_10

    .line 269
    .line 270
    invoke-virtual {v15}, LJ5/y;->m()I

    .line 271
    .line 272
    .line 273
    move-result v18

    .line 274
    invoke-virtual {v15}, LJ5/y;->m()I

    .line 275
    .line 276
    .line 277
    move-result v19

    .line 278
    invoke-virtual {v15}, LJ5/y;->m()I

    .line 279
    .line 280
    .line 281
    move-result v20

    .line 282
    invoke-virtual {v15}, LJ5/y;->m()I

    .line 283
    .line 284
    .line 285
    move-result v21

    .line 286
    if-nez v3, :cond_d

    .line 287
    .line 288
    goto :goto_c

    .line 289
    :cond_d
    const/16 v22, 0x2

    .line 290
    .line 291
    if-ne v3, v8, :cond_e

    .line 292
    .line 293
    move v8, v0

    .line 294
    goto :goto_b

    .line 295
    :cond_e
    move/from16 v8, v22

    .line 296
    .line 297
    :goto_b
    if-ne v3, v0, :cond_f

    .line 298
    .line 299
    move/from16 v0, v22

    .line 300
    .line 301
    :cond_f
    mul-int v17, v17, v0

    .line 302
    .line 303
    move v0, v8

    .line 304
    :goto_c
    add-int v18, v18, v19

    .line 305
    .line 306
    mul-int v18, v18, v0

    .line 307
    .line 308
    sub-int v2, v2, v18

    .line 309
    .line 310
    add-int v20, v20, v21

    .line 311
    .line 312
    mul-int v20, v20, v17

    .line 313
    .line 314
    sub-int v9, v9, v20

    .line 315
    .line 316
    :cond_10
    move v8, v2

    .line 317
    invoke-virtual {v15}, LJ5/y;->h()Z

    .line 318
    .line 319
    .line 320
    move-result v0

    .line 321
    const/high16 v2, 0x3f800000    # 1.0f

    .line 322
    .line 323
    if-eqz v0, :cond_13

    .line 324
    .line 325
    invoke-virtual {v15}, LJ5/y;->h()Z

    .line 326
    .line 327
    .line 328
    move-result v0

    .line 329
    if-eqz v0, :cond_13

    .line 330
    .line 331
    invoke-virtual {v15, v1}, LJ5/y;->i(I)I

    .line 332
    .line 333
    .line 334
    move-result v0

    .line 335
    const/16 v1, 0xff

    .line 336
    .line 337
    if-ne v0, v1, :cond_11

    .line 338
    .line 339
    move/from16 v1, p1

    .line 340
    .line 341
    invoke-virtual {v15, v1}, LJ5/y;->i(I)I

    .line 342
    .line 343
    .line 344
    move-result v0

    .line 345
    invoke-virtual {v15, v1}, LJ5/y;->i(I)I

    .line 346
    .line 347
    .line 348
    move-result v1

    .line 349
    if-eqz v0, :cond_13

    .line 350
    .line 351
    if-eqz v1, :cond_13

    .line 352
    .line 353
    int-to-float v0, v0

    .line 354
    int-to-float v1, v1

    .line 355
    div-float v2, v0, v1

    .line 356
    .line 357
    goto :goto_d

    .line 358
    :cond_11
    const/16 v1, 0x11

    .line 359
    .line 360
    if-ge v0, v1, :cond_12

    .line 361
    .line 362
    sget-object v1, Lu6/a;->e:[F

    .line 363
    .line 364
    aget v2, v1, v0

    .line 365
    .line 366
    goto :goto_d

    .line 367
    :cond_12
    const-string v1, "Unexpected aspect_ratio_idc value: "

    .line 368
    .line 369
    const-string v3, "NalUnitUtil"

    .line 370
    .line 371
    invoke-static {v0, v1, v3}, LA7/p0;->u(ILjava/lang/String;Ljava/lang/String;)V

    .line 372
    .line 373
    .line 374
    :cond_13
    :goto_d
    new-instance v3, Lu6/n;

    .line 375
    .line 376
    move v15, v10

    .line 377
    move v10, v2

    .line 378
    invoke-direct/range {v3 .. v16}, Lu6/n;-><init>(IIIIIIFZZIIIZ)V

    .line 379
    .line 380
    .line 381
    return-object v3
.end method

.method public static B(Landroid/media/MediaFormat;Ljava/util/List;)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-ge v0, v1, :cond_0

    .line 7
    .line 8
    const-string v1, "csd-"

    .line 9
    .line 10
    invoke-static {v0, v1}, Lka/n;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    check-cast v2, [B

    .line 19
    .line 20
    invoke-static {v2}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {p0, v1, v2}, Landroid/media/MediaFormat;->setByteBuffer(Ljava/lang/String;Ljava/nio/ByteBuffer;)V

    .line 25
    .line 26
    .line 27
    add-int/lit8 v0, v0, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    return-void
.end method

.method public static C(I[B)I
    .locals 8

    .line 1
    sget-object v0, Lu6/a;->f:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x0

    .line 5
    move v2, v1

    .line 6
    move v3, v2

    .line 7
    :cond_0
    :goto_0
    if-ge v2, p0, :cond_4

    .line 8
    .line 9
    :goto_1
    add-int/lit8 v4, p0, -0x2

    .line 10
    .line 11
    if-ge v2, v4, :cond_2

    .line 12
    .line 13
    :try_start_0
    aget-byte v4, p1, v2

    .line 14
    .line 15
    if-nez v4, :cond_1

    .line 16
    .line 17
    add-int/lit8 v4, v2, 0x1

    .line 18
    .line 19
    aget-byte v4, p1, v4

    .line 20
    .line 21
    if-nez v4, :cond_1

    .line 22
    .line 23
    add-int/lit8 v4, v2, 0x2

    .line 24
    .line 25
    aget-byte v4, p1, v4

    .line 26
    .line 27
    const/4 v5, 0x3

    .line 28
    if-ne v4, v5, :cond_1

    .line 29
    .line 30
    goto :goto_2

    .line 31
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_2
    move v2, p0

    .line 35
    :goto_2
    if-ge v2, p0, :cond_0

    .line 36
    .line 37
    sget-object v4, Lu6/a;->g:[I

    .line 38
    .line 39
    array-length v5, v4

    .line 40
    if-gt v5, v3, :cond_3

    .line 41
    .line 42
    array-length v5, v4

    .line 43
    mul-int/lit8 v5, v5, 0x2

    .line 44
    .line 45
    invoke-static {v4, v5}, Ljava/util/Arrays;->copyOf([II)[I

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    sput-object v4, Lu6/a;->g:[I

    .line 50
    .line 51
    goto :goto_3

    .line 52
    :catchall_0
    move-exception p0

    .line 53
    goto :goto_5

    .line 54
    :cond_3
    :goto_3
    sget-object v4, Lu6/a;->g:[I

    .line 55
    .line 56
    add-int/lit8 v5, v3, 0x1

    .line 57
    .line 58
    aput v2, v4, v3

    .line 59
    .line 60
    add-int/lit8 v2, v2, 0x3

    .line 61
    .line 62
    move v3, v5

    .line 63
    goto :goto_0

    .line 64
    :cond_4
    sub-int/2addr p0, v3

    .line 65
    move v2, v1

    .line 66
    move v4, v2

    .line 67
    move v5, v4

    .line 68
    :goto_4
    if-ge v2, v3, :cond_5

    .line 69
    .line 70
    sget-object v6, Lu6/a;->g:[I

    .line 71
    .line 72
    aget v6, v6, v2

    .line 73
    .line 74
    sub-int/2addr v6, v5

    .line 75
    invoke-static {p1, v5, p1, v4, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 76
    .line 77
    .line 78
    add-int/2addr v4, v6

    .line 79
    add-int/lit8 v7, v4, 0x1

    .line 80
    .line 81
    aput-byte v1, p1, v4

    .line 82
    .line 83
    add-int/lit8 v4, v4, 0x2

    .line 84
    .line 85
    aput-byte v1, p1, v7

    .line 86
    .line 87
    add-int/lit8 v6, v6, 0x3

    .line 88
    .line 89
    add-int/2addr v5, v6

    .line 90
    add-int/lit8 v2, v2, 0x1

    .line 91
    .line 92
    goto :goto_4

    .line 93
    :cond_5
    sub-int v1, p0, v4

    .line 94
    .line 95
    invoke-static {p1, v5, p1, v4, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 96
    .line 97
    .line 98
    monitor-exit v0

    .line 99
    return p0

    .line 100
    :goto_5
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 101
    throw p0
.end method

.method public static D(Ljava/lang/Exception;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p2, p0}, Lu6/a;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p1, p0}, Lu6/a;->E(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static E(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    sget-object v0, Lu6/a;->c:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-static {p0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 5
    .line 6
    .line 7
    monitor-exit v0

    .line 8
    return-void

    .line 9
    :catchall_0
    move-exception p0

    .line 10
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    throw p0
.end method

.method public static a(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;
    .locals 3

    .line 1
    sget-object v0, Lu6/a;->c:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    :try_start_0
    monitor-exit v0

    .line 7
    const/4 p1, 0x0

    .line 8
    goto :goto_1

    .line 9
    :catchall_0
    move-exception p0

    .line 10
    goto :goto_2

    .line 11
    :cond_0
    move-object v1, p1

    .line 12
    :goto_0
    if-eqz v1, :cond_2

    .line 13
    .line 14
    instance-of v2, v1, Ljava/net/UnknownHostException;

    .line 15
    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    const-string p1, "UnknownHostException (no network)"

    .line 19
    .line 20
    monitor-exit v0

    .line 21
    goto :goto_1

    .line 22
    :cond_1
    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    goto :goto_0

    .line 27
    :cond_2
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    const-string v1, "\t"

    .line 36
    .line 37
    const-string v2, "    "

    .line 38
    .line 39
    invoke-virtual {p1, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    :goto_1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-nez v0, :cond_3

    .line 49
    .line 50
    const-string v0, "\n  "

    .line 51
    .line 52
    invoke-static {p0, v0}, LA7/p0;->q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    const-string v0, "\n"

    .line 57
    .line 58
    const-string v1, "\n  "

    .line 59
    .line 60
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    const/16 p1, 0xa

    .line 68
    .line 69
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    :cond_3
    return-object p0

    .line 77
    :goto_2
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 78
    throw p0
.end method

.method public static b(Ljava/lang/String;)V
    .locals 2

    .line 1
    sget v0, Lu6/v;->a:I

    .line 2
    .line 3
    const/16 v1, 0x12

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    invoke-static {p0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public static c(IZII[II)Ljava/lang/String;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    new-instance v2, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    sget-object v3, Lu6/a;->b:[Ljava/lang/String;

    .line 6
    .line 7
    aget-object p0, v3, p0

    .line 8
    .line 9
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 14
    .line 15
    .line 16
    move-result-object p3

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    const/16 p1, 0x48

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/16 p1, 0x4c

    .line 23
    .line 24
    :goto_0
    invoke-static {p1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 29
    .line 30
    .line 31
    move-result-object p5

    .line 32
    const/4 v3, 0x5

    .line 33
    new-array v3, v3, [Ljava/lang/Object;

    .line 34
    .line 35
    aput-object p0, v3, v0

    .line 36
    .line 37
    aput-object p2, v3, v1

    .line 38
    .line 39
    const/4 p0, 0x2

    .line 40
    aput-object p3, v3, p0

    .line 41
    .line 42
    const/4 p0, 0x3

    .line 43
    aput-object p1, v3, p0

    .line 44
    .line 45
    const/4 p0, 0x4

    .line 46
    aput-object p5, v3, p0

    .line 47
    .line 48
    sget p0, Lu6/v;->a:I

    .line 49
    .line 50
    sget-object p0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 51
    .line 52
    const-string p1, "hvc1.%s%d.%X.%c%d"

    .line 53
    .line 54
    invoke-static {p0, p1, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-direct {v2, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    array-length p0, p4

    .line 62
    :goto_1
    if-lez p0, :cond_1

    .line 63
    .line 64
    add-int/lit8 p1, p0, -0x1

    .line 65
    .line 66
    aget p1, p4, p1

    .line 67
    .line 68
    if-nez p1, :cond_1

    .line 69
    .line 70
    add-int/lit8 p0, p0, -0x1

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_1
    move p1, v0

    .line 74
    :goto_2
    if-ge p1, p0, :cond_2

    .line 75
    .line 76
    aget p2, p4, p1

    .line 77
    .line 78
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 79
    .line 80
    .line 81
    move-result-object p2

    .line 82
    new-array p3, v1, [Ljava/lang/Object;

    .line 83
    .line 84
    aput-object p2, p3, v0

    .line 85
    .line 86
    const-string p2, ".%02X"

    .line 87
    .line 88
    invoke-static {p2, p3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p2

    .line 92
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    add-int/2addr p1, v1

    .line 96
    goto :goto_2

    .line 97
    :cond_2
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    return-object p0
.end method

.method public static d(Ljava/lang/String;Z)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 5
    .line 6
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw p1
.end method

.method public static e(Z)V
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 7
    .line 8
    .line 9
    throw p0
.end method

.method public static f()V
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    :goto_0
    invoke-static {}, Landroid/opengl/GLES20;->glGetError()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-eqz v2, :cond_1

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    const/16 v1, 0xa

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    :cond_0
    const-string v1, "glError: "

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-static {v2}, Landroid/opengl/GLU;->gluErrorString(I)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const/4 v1, 0x1

    .line 33
    goto :goto_0

    .line 34
    :cond_1
    if-nez v1, :cond_2

    .line 35
    .line 36
    return-void

    .line 37
    :cond_2
    new-instance v1, Lu6/f;

    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-direct {v1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    throw v1
.end method

.method public static g(Ljava/lang/String;Z)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    new-instance p1, Lu6/f;

    .line 5
    .line 6
    invoke-direct {p1, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    throw p1
.end method

.method public static h(II)V
    .locals 0

    .line 1
    if-ltz p0, :cond_0

    .line 2
    .line 3
    if-ge p0, p1, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance p0, Ljava/lang/IndexOutOfBoundsException;

    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    .line 9
    .line 10
    .line 11
    throw p0
.end method

.method public static i(Z)V
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 7
    .line 8
    .line 9
    throw p0
.end method

.method public static j(Ljava/lang/Object;)V
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 7
    .line 8
    .line 9
    throw p0
.end method

.method public static k(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 5
    .line 6
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw p0
.end method

.method public static l([Z)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    aput-boolean v0, p0, v0

    .line 3
    .line 4
    const/4 v1, 0x1

    .line 5
    aput-boolean v0, p0, v1

    .line 6
    .line 7
    const/4 v1, 0x2

    .line 8
    aput-boolean v0, p0, v1

    .line 9
    .line 10
    return-void
.end method

.method public static m([F)Ljava/nio/FloatBuffer;
    .locals 2

    .line 1
    array-length v0, p0

    .line 2
    mul-int/lit8 v0, v0, 0x4

    .line 3
    .line 4
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->asFloatBuffer()Ljava/nio/FloatBuffer;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0, p0}, Ljava/nio/FloatBuffer;->put([F)Ljava/nio/FloatBuffer;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-virtual {p0}, Ljava/nio/FloatBuffer;->flip()Ljava/nio/Buffer;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    check-cast p0, Ljava/nio/FloatBuffer;

    .line 29
    .line 30
    return-object p0
.end method

.method public static n(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    sget-object v0, Lu6/a;->c:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-static {p0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 5
    .line 6
    .line 7
    monitor-exit v0

    .line 8
    return-void

    .line 9
    :catchall_0
    move-exception p0

    .line 10
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    throw p0
.end method

.method public static o(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    sget-object v0, Lu6/a;->c:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 5
    .line 6
    .line 7
    monitor-exit v0

    .line 8
    return-void

    .line 9
    :catchall_0
    move-exception p0

    .line 10
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    throw p0
.end method

.method public static p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    invoke-static {p1, p2}, Lu6/a;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p0, p1}, Lu6/a;->o(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static q()V
    .locals 2

    .line 1
    sget v0, Lu6/v;->a:I

    .line 2
    .line 3
    const/16 v1, 0x12

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public static r([BII[Z)I
    .locals 8

    .line 1
    sub-int v0, p2, p1

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-ltz v0, :cond_0

    .line 6
    .line 7
    move v3, v2

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v3, v1

    .line 10
    :goto_0
    invoke-static {v3}, Lu6/a;->i(Z)V

    .line 11
    .line 12
    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    return p2

    .line 16
    :cond_1
    aget-boolean v3, p3, v1

    .line 17
    .line 18
    if-eqz v3, :cond_2

    .line 19
    .line 20
    invoke-static {p3}, Lu6/a;->l([Z)V

    .line 21
    .line 22
    .line 23
    add-int/lit8 p1, p1, -0x3

    .line 24
    .line 25
    return p1

    .line 26
    :cond_2
    const/4 v3, 0x2

    .line 27
    if-le v0, v2, :cond_3

    .line 28
    .line 29
    aget-boolean v4, p3, v2

    .line 30
    .line 31
    if-eqz v4, :cond_3

    .line 32
    .line 33
    aget-byte v4, p0, p1

    .line 34
    .line 35
    if-ne v4, v2, :cond_3

    .line 36
    .line 37
    invoke-static {p3}, Lu6/a;->l([Z)V

    .line 38
    .line 39
    .line 40
    sub-int/2addr p1, v3

    .line 41
    return p1

    .line 42
    :cond_3
    if-le v0, v3, :cond_4

    .line 43
    .line 44
    aget-boolean v4, p3, v3

    .line 45
    .line 46
    if-eqz v4, :cond_4

    .line 47
    .line 48
    aget-byte v4, p0, p1

    .line 49
    .line 50
    if-nez v4, :cond_4

    .line 51
    .line 52
    add-int/lit8 v4, p1, 0x1

    .line 53
    .line 54
    aget-byte v4, p0, v4

    .line 55
    .line 56
    if-ne v4, v2, :cond_4

    .line 57
    .line 58
    invoke-static {p3}, Lu6/a;->l([Z)V

    .line 59
    .line 60
    .line 61
    sub-int/2addr p1, v2

    .line 62
    return p1

    .line 63
    :cond_4
    add-int/lit8 v4, p2, -0x1

    .line 64
    .line 65
    add-int/2addr p1, v3

    .line 66
    :goto_1
    if-ge p1, v4, :cond_7

    .line 67
    .line 68
    aget-byte v5, p0, p1

    .line 69
    .line 70
    and-int/lit16 v6, v5, 0xfe

    .line 71
    .line 72
    if-eqz v6, :cond_5

    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_5
    add-int/lit8 v6, p1, -0x2

    .line 76
    .line 77
    aget-byte v7, p0, v6

    .line 78
    .line 79
    if-nez v7, :cond_6

    .line 80
    .line 81
    add-int/lit8 v7, p1, -0x1

    .line 82
    .line 83
    aget-byte v7, p0, v7

    .line 84
    .line 85
    if-nez v7, :cond_6

    .line 86
    .line 87
    if-ne v5, v2, :cond_6

    .line 88
    .line 89
    invoke-static {p3}, Lu6/a;->l([Z)V

    .line 90
    .line 91
    .line 92
    return v6

    .line 93
    :cond_6
    add-int/lit8 p1, p1, -0x2

    .line 94
    .line 95
    :goto_2
    add-int/lit8 p1, p1, 0x3

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_7
    if-le v0, v3, :cond_9

    .line 99
    .line 100
    add-int/lit8 p1, p2, -0x3

    .line 101
    .line 102
    aget-byte p1, p0, p1

    .line 103
    .line 104
    if-nez p1, :cond_8

    .line 105
    .line 106
    add-int/lit8 p1, p2, -0x2

    .line 107
    .line 108
    aget-byte p1, p0, p1

    .line 109
    .line 110
    if-nez p1, :cond_8

    .line 111
    .line 112
    aget-byte p1, p0, v4

    .line 113
    .line 114
    if-ne p1, v2, :cond_8

    .line 115
    .line 116
    :goto_3
    move p1, v2

    .line 117
    goto :goto_4

    .line 118
    :cond_8
    move p1, v1

    .line 119
    goto :goto_4

    .line 120
    :cond_9
    if-ne v0, v3, :cond_a

    .line 121
    .line 122
    aget-boolean p1, p3, v3

    .line 123
    .line 124
    if-eqz p1, :cond_8

    .line 125
    .line 126
    add-int/lit8 p1, p2, -0x2

    .line 127
    .line 128
    aget-byte p1, p0, p1

    .line 129
    .line 130
    if-nez p1, :cond_8

    .line 131
    .line 132
    aget-byte p1, p0, v4

    .line 133
    .line 134
    if-ne p1, v2, :cond_8

    .line 135
    .line 136
    goto :goto_3

    .line 137
    :cond_a
    aget-boolean p1, p3, v2

    .line 138
    .line 139
    if-eqz p1, :cond_8

    .line 140
    .line 141
    aget-byte p1, p0, v4

    .line 142
    .line 143
    if-ne p1, v2, :cond_8

    .line 144
    .line 145
    goto :goto_3

    .line 146
    :goto_4
    aput-boolean p1, p3, v1

    .line 147
    .line 148
    if-le v0, v2, :cond_c

    .line 149
    .line 150
    add-int/lit8 p1, p2, -0x2

    .line 151
    .line 152
    aget-byte p1, p0, p1

    .line 153
    .line 154
    if-nez p1, :cond_b

    .line 155
    .line 156
    aget-byte p1, p0, v4

    .line 157
    .line 158
    if-nez p1, :cond_b

    .line 159
    .line 160
    :goto_5
    move p1, v2

    .line 161
    goto :goto_6

    .line 162
    :cond_b
    move p1, v1

    .line 163
    goto :goto_6

    .line 164
    :cond_c
    aget-boolean p1, p3, v3

    .line 165
    .line 166
    if-eqz p1, :cond_b

    .line 167
    .line 168
    aget-byte p1, p0, v4

    .line 169
    .line 170
    if-nez p1, :cond_b

    .line 171
    .line 172
    goto :goto_5

    .line 173
    :goto_6
    aput-boolean p1, p3, v2

    .line 174
    .line 175
    aget-byte p0, p0, v4

    .line 176
    .line 177
    if-nez p0, :cond_d

    .line 178
    .line 179
    move v1, v2

    .line 180
    :cond_d
    aput-boolean v1, p3, v3

    .line 181
    .line 182
    return p2
.end method

.method public static s(LE5/g;Ljava/util/ArrayList;)Ll8/e0;
    .locals 3

    .line 1
    invoke-static {}, Ll8/K;->i()Ll8/H;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    if-ge v1, v2, :cond_0

    .line 11
    .line 12
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    check-cast v2, Landroid/os/Bundle;

    .line 17
    .line 18
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-interface {p0, v2}, LE5/g;->e(Landroid/os/Bundle;)LE5/h;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v0, v2}, Ll8/E;->a(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    add-int/lit8 v1, v1, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-virtual {v0}, Ll8/H;->g()Ll8/e0;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0
.end method

.method public static t(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    :goto_0
    if-ge v1, v0, :cond_1

    .line 7
    .line 8
    invoke-interface {p0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeName(I)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    invoke-interface {p0, v1}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(I)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    const/4 p0, 0x0

    .line 27
    return-object p0
.end method

.method public static u(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    sget-object v0, Lu6/a;->c:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-static {p0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 5
    .line 6
    .line 7
    monitor-exit v0

    .line 8
    return-void

    .line 9
    :catchall_0
    move-exception p0

    .line 10
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    throw p0
.end method

.method public static v(Landroid/net/Uri;)I
    .locals 6

    .line 1
    invoke-virtual {p0}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, -0x1

    .line 6
    if-nez p0, :cond_0

    .line 7
    .line 8
    return v0

    .line 9
    :cond_0
    const-string v1, ".ac3"

    .line 10
    .line 11
    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_1c

    .line 16
    .line 17
    const-string v1, ".ec3"

    .line 18
    .line 19
    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    goto/16 :goto_a

    .line 26
    .line 27
    :cond_1
    const-string v1, ".ac4"

    .line 28
    .line 29
    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_2

    .line 34
    .line 35
    const/4 p0, 0x1

    .line 36
    return p0

    .line 37
    :cond_2
    const-string v1, ".adts"

    .line 38
    .line 39
    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-nez v1, :cond_1b

    .line 44
    .line 45
    const-string v1, ".aac"

    .line 46
    .line 47
    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-eqz v1, :cond_3

    .line 52
    .line 53
    goto/16 :goto_9

    .line 54
    .line 55
    :cond_3
    const-string v1, ".amr"

    .line 56
    .line 57
    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-eqz v1, :cond_4

    .line 62
    .line 63
    const/4 p0, 0x3

    .line 64
    return p0

    .line 65
    :cond_4
    const-string v1, ".flac"

    .line 66
    .line 67
    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    const/4 v2, 0x4

    .line 72
    if-eqz v1, :cond_5

    .line 73
    .line 74
    return v2

    .line 75
    :cond_5
    const-string v1, ".flv"

    .line 76
    .line 77
    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    const/4 v3, 0x5

    .line 82
    if-eqz v1, :cond_6

    .line 83
    .line 84
    return v3

    .line 85
    :cond_6
    const-string v1, ".mid"

    .line 86
    .line 87
    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    if-nez v1, :cond_1a

    .line 92
    .line 93
    const-string v1, ".midi"

    .line 94
    .line 95
    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    if-nez v1, :cond_1a

    .line 100
    .line 101
    const-string v1, ".smf"

    .line 102
    .line 103
    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    if-eqz v1, :cond_7

    .line 108
    .line 109
    goto/16 :goto_8

    .line 110
    .line 111
    :cond_7
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 112
    .line 113
    .line 114
    move-result v1

    .line 115
    sub-int/2addr v1, v2

    .line 116
    const-string v4, ".mk"

    .line 117
    .line 118
    invoke-virtual {p0, v4, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;I)Z

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    if-nez v1, :cond_19

    .line 123
    .line 124
    const-string v1, ".webm"

    .line 125
    .line 126
    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 127
    .line 128
    .line 129
    move-result v1

    .line 130
    if-eqz v1, :cond_8

    .line 131
    .line 132
    goto/16 :goto_7

    .line 133
    .line 134
    :cond_8
    const-string v1, ".mp3"

    .line 135
    .line 136
    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 137
    .line 138
    .line 139
    move-result v1

    .line 140
    if-eqz v1, :cond_9

    .line 141
    .line 142
    const/4 p0, 0x7

    .line 143
    return p0

    .line 144
    :cond_9
    const-string v1, ".mp4"

    .line 145
    .line 146
    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 147
    .line 148
    .line 149
    move-result v4

    .line 150
    if-nez v4, :cond_18

    .line 151
    .line 152
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 153
    .line 154
    .line 155
    move-result v4

    .line 156
    sub-int/2addr v4, v2

    .line 157
    const-string v5, ".m4"

    .line 158
    .line 159
    invoke-virtual {p0, v5, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;I)Z

    .line 160
    .line 161
    .line 162
    move-result v4

    .line 163
    if-nez v4, :cond_18

    .line 164
    .line 165
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 166
    .line 167
    .line 168
    move-result v4

    .line 169
    sub-int/2addr v4, v3

    .line 170
    invoke-virtual {p0, v1, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;I)Z

    .line 171
    .line 172
    .line 173
    move-result v1

    .line 174
    if-nez v1, :cond_18

    .line 175
    .line 176
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 177
    .line 178
    .line 179
    move-result v1

    .line 180
    sub-int/2addr v1, v3

    .line 181
    const-string v3, ".cmf"

    .line 182
    .line 183
    invoke-virtual {p0, v3, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;I)Z

    .line 184
    .line 185
    .line 186
    move-result v1

    .line 187
    if-eqz v1, :cond_a

    .line 188
    .line 189
    goto/16 :goto_6

    .line 190
    .line 191
    :cond_a
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 192
    .line 193
    .line 194
    move-result v1

    .line 195
    sub-int/2addr v1, v2

    .line 196
    const-string v3, ".og"

    .line 197
    .line 198
    invoke-virtual {p0, v3, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;I)Z

    .line 199
    .line 200
    .line 201
    move-result v1

    .line 202
    if-nez v1, :cond_17

    .line 203
    .line 204
    const-string v1, ".opus"

    .line 205
    .line 206
    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 207
    .line 208
    .line 209
    move-result v1

    .line 210
    if-eqz v1, :cond_b

    .line 211
    .line 212
    goto/16 :goto_5

    .line 213
    .line 214
    :cond_b
    const-string v1, ".ps"

    .line 215
    .line 216
    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 217
    .line 218
    .line 219
    move-result v1

    .line 220
    if-nez v1, :cond_16

    .line 221
    .line 222
    const-string v1, ".mpeg"

    .line 223
    .line 224
    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 225
    .line 226
    .line 227
    move-result v1

    .line 228
    if-nez v1, :cond_16

    .line 229
    .line 230
    const-string v1, ".mpg"

    .line 231
    .line 232
    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 233
    .line 234
    .line 235
    move-result v1

    .line 236
    if-nez v1, :cond_16

    .line 237
    .line 238
    const-string v1, ".m2p"

    .line 239
    .line 240
    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 241
    .line 242
    .line 243
    move-result v1

    .line 244
    if-eqz v1, :cond_c

    .line 245
    .line 246
    goto :goto_4

    .line 247
    :cond_c
    const-string v1, ".ts"

    .line 248
    .line 249
    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 250
    .line 251
    .line 252
    move-result v3

    .line 253
    if-nez v3, :cond_15

    .line 254
    .line 255
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 256
    .line 257
    .line 258
    move-result v3

    .line 259
    sub-int/2addr v3, v2

    .line 260
    invoke-virtual {p0, v1, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;I)Z

    .line 261
    .line 262
    .line 263
    move-result v1

    .line 264
    if-eqz v1, :cond_d

    .line 265
    .line 266
    goto :goto_3

    .line 267
    :cond_d
    const-string v1, ".wav"

    .line 268
    .line 269
    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 270
    .line 271
    .line 272
    move-result v1

    .line 273
    if-nez v1, :cond_14

    .line 274
    .line 275
    const-string v1, ".wave"

    .line 276
    .line 277
    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 278
    .line 279
    .line 280
    move-result v1

    .line 281
    if-eqz v1, :cond_e

    .line 282
    .line 283
    goto :goto_2

    .line 284
    :cond_e
    const-string v1, ".vtt"

    .line 285
    .line 286
    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 287
    .line 288
    .line 289
    move-result v1

    .line 290
    if-nez v1, :cond_13

    .line 291
    .line 292
    const-string v1, ".webvtt"

    .line 293
    .line 294
    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 295
    .line 296
    .line 297
    move-result v1

    .line 298
    if-eqz v1, :cond_f

    .line 299
    .line 300
    goto :goto_1

    .line 301
    :cond_f
    const-string v1, ".jpg"

    .line 302
    .line 303
    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 304
    .line 305
    .line 306
    move-result v1

    .line 307
    if-nez v1, :cond_12

    .line 308
    .line 309
    const-string v1, ".jpeg"

    .line 310
    .line 311
    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 312
    .line 313
    .line 314
    move-result v1

    .line 315
    if-eqz v1, :cond_10

    .line 316
    .line 317
    goto :goto_0

    .line 318
    :cond_10
    const-string v1, ".avi"

    .line 319
    .line 320
    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 321
    .line 322
    .line 323
    move-result p0

    .line 324
    if-eqz p0, :cond_11

    .line 325
    .line 326
    const/16 p0, 0x10

    .line 327
    .line 328
    return p0

    .line 329
    :cond_11
    return v0

    .line 330
    :cond_12
    :goto_0
    const/16 p0, 0xe

    .line 331
    .line 332
    return p0

    .line 333
    :cond_13
    :goto_1
    const/16 p0, 0xd

    .line 334
    .line 335
    return p0

    .line 336
    :cond_14
    :goto_2
    const/16 p0, 0xc

    .line 337
    .line 338
    return p0

    .line 339
    :cond_15
    :goto_3
    const/16 p0, 0xb

    .line 340
    .line 341
    return p0

    .line 342
    :cond_16
    :goto_4
    const/16 p0, 0xa

    .line 343
    .line 344
    return p0

    .line 345
    :cond_17
    :goto_5
    const/16 p0, 0x9

    .line 346
    .line 347
    return p0

    .line 348
    :cond_18
    :goto_6
    const/16 p0, 0x8

    .line 349
    .line 350
    return p0

    .line 351
    :cond_19
    :goto_7
    const/4 p0, 0x6

    .line 352
    return p0

    .line 353
    :cond_1a
    :goto_8
    const/16 p0, 0xf

    .line 354
    .line 355
    return p0

    .line 356
    :cond_1b
    :goto_9
    const/4 p0, 0x2

    .line 357
    return p0

    .line 358
    :cond_1c
    :goto_a
    const/4 p0, 0x0

    .line 359
    return p0
.end method

.method public static w(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z
    .locals 2

    .line 1
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x3

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    const/4 p0, 0x1

    .line 19
    return p0

    .line 20
    :cond_0
    const/4 p0, 0x0

    .line 21
    return p0
.end method

.method public static x(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z
    .locals 2

    .line 1
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x2

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    const/4 p0, 0x1

    .line 19
    return p0

    .line 20
    :cond_0
    const/4 p0, 0x0

    .line 21
    return p0
.end method

.method public static y(Landroid/media/MediaFormat;Ljava/lang/String;I)V
    .locals 1

    .line 1
    const/4 v0, -0x1

    .line 2
    if-eq p2, v0, :cond_0

    .line 3
    .line 4
    invoke-virtual {p0, p1, p2}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    .line 5
    .line 6
    .line 7
    :cond_0
    return-void
.end method

.method public static z(II[B)Lu6/l;
    .locals 29

    .line 1
    const/4 v0, 0x2

    .line 2
    add-int/lit8 v1, p0, 0x2

    .line 3
    .line 4
    new-instance v2, LJ5/y;

    .line 5
    .line 6
    const/4 v3, 0x7

    .line 7
    move/from16 v4, p1

    .line 8
    .line 9
    move-object/from16 v5, p2

    .line 10
    .line 11
    invoke-direct {v2, v1, v5, v4, v3}, LJ5/y;-><init>(I[BII)V

    .line 12
    .line 13
    .line 14
    const/4 v1, 0x4

    .line 15
    invoke-virtual {v2, v1}, LJ5/y;->t(I)V

    .line 16
    .line 17
    .line 18
    const/4 v3, 0x3

    .line 19
    invoke-virtual {v2, v3}, LJ5/y;->i(I)I

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    invoke-virtual {v2}, LJ5/y;->s()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v2, v0}, LJ5/y;->i(I)I

    .line 27
    .line 28
    .line 29
    move-result v6

    .line 30
    invoke-virtual {v2}, LJ5/y;->h()Z

    .line 31
    .line 32
    .line 33
    move-result v7

    .line 34
    const/4 v5, 0x5

    .line 35
    invoke-virtual {v2, v5}, LJ5/y;->i(I)I

    .line 36
    .line 37
    .line 38
    move-result v8

    .line 39
    const/4 v10, 0x0

    .line 40
    const/4 v11, 0x0

    .line 41
    :goto_0
    const/16 v12, 0x20

    .line 42
    .line 43
    const/4 v13, 0x1

    .line 44
    if-ge v10, v12, :cond_1

    .line 45
    .line 46
    invoke-virtual {v2}, LJ5/y;->h()Z

    .line 47
    .line 48
    .line 49
    move-result v12

    .line 50
    if-eqz v12, :cond_0

    .line 51
    .line 52
    shl-int v12, v13, v10

    .line 53
    .line 54
    or-int/2addr v11, v12

    .line 55
    :cond_0
    add-int/lit8 v10, v10, 0x1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    const/4 v10, 0x6

    .line 59
    new-array v12, v10, [I

    .line 60
    .line 61
    const/4 v14, 0x0

    .line 62
    :goto_1
    const/16 v15, 0x8

    .line 63
    .line 64
    if-ge v14, v10, :cond_2

    .line 65
    .line 66
    invoke-virtual {v2, v15}, LJ5/y;->i(I)I

    .line 67
    .line 68
    .line 69
    move-result v15

    .line 70
    aput v15, v12, v14

    .line 71
    .line 72
    add-int/lit8 v14, v14, 0x1

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_2
    move v14, v11

    .line 76
    invoke-virtual {v2, v15}, LJ5/y;->i(I)I

    .line 77
    .line 78
    .line 79
    move-result v11

    .line 80
    move/from16 p0, v5

    .line 81
    .line 82
    const/4 v5, 0x0

    .line 83
    const/4 v9, 0x0

    .line 84
    :goto_2
    if-ge v5, v4, :cond_5

    .line 85
    .line 86
    invoke-virtual {v2}, LJ5/y;->h()Z

    .line 87
    .line 88
    .line 89
    move-result v16

    .line 90
    if-eqz v16, :cond_3

    .line 91
    .line 92
    add-int/lit8 v9, v9, 0x59

    .line 93
    .line 94
    :cond_3
    invoke-virtual {v2}, LJ5/y;->h()Z

    .line 95
    .line 96
    .line 97
    move-result v16

    .line 98
    if-eqz v16, :cond_4

    .line 99
    .line 100
    add-int/lit8 v9, v9, 0x8

    .line 101
    .line 102
    :cond_4
    add-int/lit8 v5, v5, 0x1

    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_5
    invoke-virtual {v2, v9}, LJ5/y;->t(I)V

    .line 106
    .line 107
    .line 108
    if-lez v4, :cond_6

    .line 109
    .line 110
    rsub-int/lit8 v5, v4, 0x8

    .line 111
    .line 112
    mul-int/2addr v5, v0

    .line 113
    invoke-virtual {v2, v5}, LJ5/y;->t(I)V

    .line 114
    .line 115
    .line 116
    :cond_6
    invoke-virtual {v2}, LJ5/y;->m()I

    .line 117
    .line 118
    .line 119
    invoke-virtual {v2}, LJ5/y;->m()I

    .line 120
    .line 121
    .line 122
    move-result v5

    .line 123
    if-ne v5, v3, :cond_7

    .line 124
    .line 125
    invoke-virtual {v2}, LJ5/y;->s()V

    .line 126
    .line 127
    .line 128
    :cond_7
    invoke-virtual {v2}, LJ5/y;->m()I

    .line 129
    .line 130
    .line 131
    move-result v9

    .line 132
    invoke-virtual {v2}, LJ5/y;->m()I

    .line 133
    .line 134
    .line 135
    move-result v16

    .line 136
    invoke-virtual {v2}, LJ5/y;->h()Z

    .line 137
    .line 138
    .line 139
    move-result v17

    .line 140
    if-eqz v17, :cond_b

    .line 141
    .line 142
    invoke-virtual {v2}, LJ5/y;->m()I

    .line 143
    .line 144
    .line 145
    move-result v17

    .line 146
    invoke-virtual {v2}, LJ5/y;->m()I

    .line 147
    .line 148
    .line 149
    move-result v18

    .line 150
    invoke-virtual {v2}, LJ5/y;->m()I

    .line 151
    .line 152
    .line 153
    move-result v19

    .line 154
    invoke-virtual {v2}, LJ5/y;->m()I

    .line 155
    .line 156
    .line 157
    move-result v20

    .line 158
    if-eq v5, v13, :cond_9

    .line 159
    .line 160
    if-ne v5, v0, :cond_8

    .line 161
    .line 162
    goto :goto_3

    .line 163
    :cond_8
    move/from16 v21, v13

    .line 164
    .line 165
    goto :goto_4

    .line 166
    :cond_9
    :goto_3
    move/from16 v21, v0

    .line 167
    .line 168
    :goto_4
    if-ne v5, v13, :cond_a

    .line 169
    .line 170
    move v5, v0

    .line 171
    goto :goto_5

    .line 172
    :cond_a
    move v5, v13

    .line 173
    :goto_5
    add-int v17, v17, v18

    .line 174
    .line 175
    mul-int v17, v17, v21

    .line 176
    .line 177
    sub-int v9, v9, v17

    .line 178
    .line 179
    add-int v19, v19, v20

    .line 180
    .line 181
    mul-int v19, v19, v5

    .line 182
    .line 183
    sub-int v16, v16, v19

    .line 184
    .line 185
    :cond_b
    invoke-virtual {v2}, LJ5/y;->m()I

    .line 186
    .line 187
    .line 188
    invoke-virtual {v2}, LJ5/y;->m()I

    .line 189
    .line 190
    .line 191
    invoke-virtual {v2}, LJ5/y;->m()I

    .line 192
    .line 193
    .line 194
    move-result v5

    .line 195
    invoke-virtual {v2}, LJ5/y;->h()Z

    .line 196
    .line 197
    .line 198
    move-result v17

    .line 199
    if-eqz v17, :cond_c

    .line 200
    .line 201
    const/16 v17, 0x0

    .line 202
    .line 203
    goto :goto_6

    .line 204
    :cond_c
    move/from16 v17, v4

    .line 205
    .line 206
    :goto_6
    move/from16 v15, v17

    .line 207
    .line 208
    :goto_7
    if-gt v15, v4, :cond_d

    .line 209
    .line 210
    invoke-virtual {v2}, LJ5/y;->m()I

    .line 211
    .line 212
    .line 213
    invoke-virtual {v2}, LJ5/y;->m()I

    .line 214
    .line 215
    .line 216
    invoke-virtual {v2}, LJ5/y;->m()I

    .line 217
    .line 218
    .line 219
    add-int/lit8 v15, v15, 0x1

    .line 220
    .line 221
    goto :goto_7

    .line 222
    :cond_d
    invoke-virtual {v2}, LJ5/y;->m()I

    .line 223
    .line 224
    .line 225
    invoke-virtual {v2}, LJ5/y;->m()I

    .line 226
    .line 227
    .line 228
    invoke-virtual {v2}, LJ5/y;->m()I

    .line 229
    .line 230
    .line 231
    invoke-virtual {v2}, LJ5/y;->m()I

    .line 232
    .line 233
    .line 234
    invoke-virtual {v2}, LJ5/y;->m()I

    .line 235
    .line 236
    .line 237
    invoke-virtual {v2}, LJ5/y;->m()I

    .line 238
    .line 239
    .line 240
    invoke-virtual {v2}, LJ5/y;->h()Z

    .line 241
    .line 242
    .line 243
    move-result v4

    .line 244
    if-eqz v4, :cond_13

    .line 245
    .line 246
    invoke-virtual {v2}, LJ5/y;->h()Z

    .line 247
    .line 248
    .line 249
    move-result v4

    .line 250
    if-eqz v4, :cond_13

    .line 251
    .line 252
    const/4 v4, 0x0

    .line 253
    :goto_8
    if-ge v4, v1, :cond_13

    .line 254
    .line 255
    const/4 v15, 0x0

    .line 256
    :goto_9
    if-ge v15, v10, :cond_12

    .line 257
    .line 258
    invoke-virtual {v2}, LJ5/y;->h()Z

    .line 259
    .line 260
    .line 261
    move-result v17

    .line 262
    if-nez v17, :cond_e

    .line 263
    .line 264
    invoke-virtual {v2}, LJ5/y;->m()I

    .line 265
    .line 266
    .line 267
    goto :goto_b

    .line 268
    :cond_e
    shl-int/lit8 v17, v4, 0x1

    .line 269
    .line 270
    add-int/lit8 v17, v17, 0x4

    .line 271
    .line 272
    shl-int v10, v13, v17

    .line 273
    .line 274
    const/16 v1, 0x40

    .line 275
    .line 276
    invoke-static {v1, v10}, Ljava/lang/Math;->min(II)I

    .line 277
    .line 278
    .line 279
    move-result v1

    .line 280
    if-le v4, v13, :cond_f

    .line 281
    .line 282
    invoke-virtual {v2}, LJ5/y;->n()I

    .line 283
    .line 284
    .line 285
    :cond_f
    const/4 v10, 0x0

    .line 286
    :goto_a
    if-ge v10, v1, :cond_10

    .line 287
    .line 288
    invoke-virtual {v2}, LJ5/y;->n()I

    .line 289
    .line 290
    .line 291
    add-int/lit8 v10, v10, 0x1

    .line 292
    .line 293
    goto :goto_a

    .line 294
    :cond_10
    :goto_b
    if-ne v4, v3, :cond_11

    .line 295
    .line 296
    move v1, v3

    .line 297
    goto :goto_c

    .line 298
    :cond_11
    move v1, v13

    .line 299
    :goto_c
    add-int/2addr v15, v1

    .line 300
    const/4 v1, 0x4

    .line 301
    const/4 v10, 0x6

    .line 302
    goto :goto_9

    .line 303
    :cond_12
    add-int/lit8 v4, v4, 0x1

    .line 304
    .line 305
    const/4 v1, 0x4

    .line 306
    const/4 v10, 0x6

    .line 307
    goto :goto_8

    .line 308
    :cond_13
    invoke-virtual {v2, v0}, LJ5/y;->t(I)V

    .line 309
    .line 310
    .line 311
    invoke-virtual {v2}, LJ5/y;->h()Z

    .line 312
    .line 313
    .line 314
    move-result v1

    .line 315
    if-eqz v1, :cond_14

    .line 316
    .line 317
    const/16 v1, 0x8

    .line 318
    .line 319
    invoke-virtual {v2, v1}, LJ5/y;->t(I)V

    .line 320
    .line 321
    .line 322
    invoke-virtual {v2}, LJ5/y;->m()I

    .line 323
    .line 324
    .line 325
    invoke-virtual {v2}, LJ5/y;->m()I

    .line 326
    .line 327
    .line 328
    invoke-virtual {v2}, LJ5/y;->s()V

    .line 329
    .line 330
    .line 331
    :cond_14
    invoke-virtual {v2}, LJ5/y;->m()I

    .line 332
    .line 333
    .line 334
    move-result v1

    .line 335
    const/4 v3, 0x0

    .line 336
    new-array v4, v3, [I

    .line 337
    .line 338
    new-array v10, v3, [I

    .line 339
    .line 340
    const/4 v15, -0x1

    .line 341
    move/from16 v18, v13

    .line 342
    .line 343
    move v13, v3

    .line 344
    move v3, v15

    .line 345
    :goto_d
    if-ge v13, v1, :cond_24

    .line 346
    .line 347
    if-eqz v13, :cond_21

    .line 348
    .line 349
    invoke-virtual {v2}, LJ5/y;->h()Z

    .line 350
    .line 351
    .line 352
    move-result v19

    .line 353
    if-eqz v19, :cond_21

    .line 354
    .line 355
    move/from16 v19, v0

    .line 356
    .line 357
    add-int v0, v15, v3

    .line 358
    .line 359
    invoke-virtual {v2}, LJ5/y;->h()Z

    .line 360
    .line 361
    .line 362
    move-result v20

    .line 363
    invoke-virtual {v2}, LJ5/y;->m()I

    .line 364
    .line 365
    .line 366
    move-result v21

    .line 367
    add-int/lit8 v21, v21, 0x1

    .line 368
    .line 369
    mul-int/lit8 v20, v20, 0x2

    .line 370
    .line 371
    rsub-int/lit8 v20, v20, 0x1

    .line 372
    .line 373
    mul-int v20, v20, v21

    .line 374
    .line 375
    move/from16 v21, v1

    .line 376
    .line 377
    add-int/lit8 v1, v0, 0x1

    .line 378
    .line 379
    move-object/from16 v22, v4

    .line 380
    .line 381
    new-array v4, v1, [Z

    .line 382
    .line 383
    move-object/from16 v23, v4

    .line 384
    .line 385
    const/4 v4, 0x0

    .line 386
    :goto_e
    if-gt v4, v0, :cond_16

    .line 387
    .line 388
    invoke-virtual {v2}, LJ5/y;->h()Z

    .line 389
    .line 390
    .line 391
    move-result v24

    .line 392
    if-nez v24, :cond_15

    .line 393
    .line 394
    invoke-virtual {v2}, LJ5/y;->h()Z

    .line 395
    .line 396
    .line 397
    move-result v24

    .line 398
    aput-boolean v24, v23, v4

    .line 399
    .line 400
    goto :goto_f

    .line 401
    :cond_15
    aput-boolean v18, v23, v4

    .line 402
    .line 403
    :goto_f
    add-int/lit8 v4, v4, 0x1

    .line 404
    .line 405
    goto :goto_e

    .line 406
    :cond_16
    new-array v4, v1, [I

    .line 407
    .line 408
    new-array v1, v1, [I

    .line 409
    .line 410
    add-int/lit8 v24, v3, -0x1

    .line 411
    .line 412
    const/16 v25, 0x0

    .line 413
    .line 414
    :goto_10
    if-ltz v24, :cond_18

    .line 415
    .line 416
    aget v26, v10, v24

    .line 417
    .line 418
    add-int v26, v26, v20

    .line 419
    .line 420
    if-gez v26, :cond_17

    .line 421
    .line 422
    add-int v27, v15, v24

    .line 423
    .line 424
    aget-boolean v27, v23, v27

    .line 425
    .line 426
    if-eqz v27, :cond_17

    .line 427
    .line 428
    add-int/lit8 v27, v25, 0x1

    .line 429
    .line 430
    aput v26, v4, v25

    .line 431
    .line 432
    move/from16 v25, v27

    .line 433
    .line 434
    :cond_17
    add-int/lit8 v24, v24, -0x1

    .line 435
    .line 436
    goto :goto_10

    .line 437
    :cond_18
    if-gez v20, :cond_19

    .line 438
    .line 439
    aget-boolean v24, v23, v0

    .line 440
    .line 441
    if-eqz v24, :cond_19

    .line 442
    .line 443
    add-int/lit8 v24, v25, 0x1

    .line 444
    .line 445
    aput v20, v4, v25

    .line 446
    .line 447
    move/from16 v25, v24

    .line 448
    .line 449
    :cond_19
    move/from16 v24, v0

    .line 450
    .line 451
    move/from16 v0, v25

    .line 452
    .line 453
    move/from16 v25, v5

    .line 454
    .line 455
    const/4 v5, 0x0

    .line 456
    :goto_11
    if-ge v5, v15, :cond_1b

    .line 457
    .line 458
    aget v26, v22, v5

    .line 459
    .line 460
    add-int v26, v26, v20

    .line 461
    .line 462
    if-gez v26, :cond_1a

    .line 463
    .line 464
    aget-boolean v27, v23, v5

    .line 465
    .line 466
    if-eqz v27, :cond_1a

    .line 467
    .line 468
    add-int/lit8 v27, v0, 0x1

    .line 469
    .line 470
    aput v26, v4, v0

    .line 471
    .line 472
    move/from16 v0, v27

    .line 473
    .line 474
    :cond_1a
    add-int/lit8 v5, v5, 0x1

    .line 475
    .line 476
    goto :goto_11

    .line 477
    :cond_1b
    invoke-static {v4, v0}, Ljava/util/Arrays;->copyOf([II)[I

    .line 478
    .line 479
    .line 480
    move-result-object v4

    .line 481
    add-int/lit8 v5, v15, -0x1

    .line 482
    .line 483
    const/16 v26, 0x0

    .line 484
    .line 485
    :goto_12
    if-ltz v5, :cond_1d

    .line 486
    .line 487
    aget v27, v22, v5

    .line 488
    .line 489
    add-int v27, v27, v20

    .line 490
    .line 491
    if-lez v27, :cond_1c

    .line 492
    .line 493
    aget-boolean v28, v23, v5

    .line 494
    .line 495
    if-eqz v28, :cond_1c

    .line 496
    .line 497
    add-int/lit8 v28, v26, 0x1

    .line 498
    .line 499
    aput v27, v1, v26

    .line 500
    .line 501
    move/from16 v26, v28

    .line 502
    .line 503
    :cond_1c
    add-int/lit8 v5, v5, -0x1

    .line 504
    .line 505
    goto :goto_12

    .line 506
    :cond_1d
    if-lez v20, :cond_1e

    .line 507
    .line 508
    aget-boolean v5, v23, v24

    .line 509
    .line 510
    if-eqz v5, :cond_1e

    .line 511
    .line 512
    add-int/lit8 v5, v26, 0x1

    .line 513
    .line 514
    aput v20, v1, v26

    .line 515
    .line 516
    move/from16 v26, v5

    .line 517
    .line 518
    :cond_1e
    move/from16 v22, v0

    .line 519
    .line 520
    move/from16 v5, v26

    .line 521
    .line 522
    const/4 v0, 0x0

    .line 523
    :goto_13
    if-ge v0, v3, :cond_20

    .line 524
    .line 525
    aget v24, v10, v0

    .line 526
    .line 527
    add-int v24, v24, v20

    .line 528
    .line 529
    if-lez v24, :cond_1f

    .line 530
    .line 531
    add-int v26, v15, v0

    .line 532
    .line 533
    aget-boolean v26, v23, v26

    .line 534
    .line 535
    if-eqz v26, :cond_1f

    .line 536
    .line 537
    add-int/lit8 v26, v5, 0x1

    .line 538
    .line 539
    aput v24, v1, v5

    .line 540
    .line 541
    move/from16 v5, v26

    .line 542
    .line 543
    :cond_1f
    add-int/lit8 v0, v0, 0x1

    .line 544
    .line 545
    goto :goto_13

    .line 546
    :cond_20
    invoke-static {v1, v5}, Ljava/util/Arrays;->copyOf([II)[I

    .line 547
    .line 548
    .line 549
    move-result-object v0

    .line 550
    move-object v10, v0

    .line 551
    move v3, v5

    .line 552
    move/from16 v15, v22

    .line 553
    .line 554
    goto :goto_16

    .line 555
    :cond_21
    move/from16 v19, v0

    .line 556
    .line 557
    move/from16 v21, v1

    .line 558
    .line 559
    move/from16 v25, v5

    .line 560
    .line 561
    invoke-virtual {v2}, LJ5/y;->m()I

    .line 562
    .line 563
    .line 564
    move-result v0

    .line 565
    invoke-virtual {v2}, LJ5/y;->m()I

    .line 566
    .line 567
    .line 568
    move-result v1

    .line 569
    new-array v3, v0, [I

    .line 570
    .line 571
    const/4 v4, 0x0

    .line 572
    :goto_14
    if-ge v4, v0, :cond_22

    .line 573
    .line 574
    invoke-virtual {v2}, LJ5/y;->m()I

    .line 575
    .line 576
    .line 577
    move-result v5

    .line 578
    add-int/lit8 v5, v5, 0x1

    .line 579
    .line 580
    aput v5, v3, v4

    .line 581
    .line 582
    invoke-virtual {v2}, LJ5/y;->s()V

    .line 583
    .line 584
    .line 585
    add-int/lit8 v4, v4, 0x1

    .line 586
    .line 587
    goto :goto_14

    .line 588
    :cond_22
    new-array v4, v1, [I

    .line 589
    .line 590
    const/4 v5, 0x0

    .line 591
    :goto_15
    if-ge v5, v1, :cond_23

    .line 592
    .line 593
    invoke-virtual {v2}, LJ5/y;->m()I

    .line 594
    .line 595
    .line 596
    move-result v10

    .line 597
    add-int/lit8 v10, v10, 0x1

    .line 598
    .line 599
    aput v10, v4, v5

    .line 600
    .line 601
    invoke-virtual {v2}, LJ5/y;->s()V

    .line 602
    .line 603
    .line 604
    add-int/lit8 v5, v5, 0x1

    .line 605
    .line 606
    goto :goto_15

    .line 607
    :cond_23
    move v15, v0

    .line 608
    move-object v10, v4

    .line 609
    move-object v4, v3

    .line 610
    move v3, v1

    .line 611
    :goto_16
    add-int/lit8 v13, v13, 0x1

    .line 612
    .line 613
    move/from16 v0, v19

    .line 614
    .line 615
    move/from16 v1, v21

    .line 616
    .line 617
    move/from16 v5, v25

    .line 618
    .line 619
    goto/16 :goto_d

    .line 620
    .line 621
    :cond_24
    move/from16 v19, v0

    .line 622
    .line 623
    move/from16 v25, v5

    .line 624
    .line 625
    invoke-virtual {v2}, LJ5/y;->h()Z

    .line 626
    .line 627
    .line 628
    move-result v0

    .line 629
    if-eqz v0, :cond_25

    .line 630
    .line 631
    const/4 v0, 0x0

    .line 632
    :goto_17
    invoke-virtual {v2}, LJ5/y;->m()I

    .line 633
    .line 634
    .line 635
    move-result v1

    .line 636
    if-ge v0, v1, :cond_25

    .line 637
    .line 638
    add-int/lit8 v5, v25, 0x5

    .line 639
    .line 640
    invoke-virtual {v2, v5}, LJ5/y;->t(I)V

    .line 641
    .line 642
    .line 643
    add-int/lit8 v0, v0, 0x1

    .line 644
    .line 645
    goto :goto_17

    .line 646
    :cond_25
    move/from16 v0, v19

    .line 647
    .line 648
    invoke-virtual {v2, v0}, LJ5/y;->t(I)V

    .line 649
    .line 650
    .line 651
    invoke-virtual {v2}, LJ5/y;->h()Z

    .line 652
    .line 653
    .line 654
    move-result v0

    .line 655
    const/high16 v1, 0x3f800000    # 1.0f

    .line 656
    .line 657
    if-eqz v0, :cond_2c

    .line 658
    .line 659
    invoke-virtual {v2}, LJ5/y;->h()Z

    .line 660
    .line 661
    .line 662
    move-result v0

    .line 663
    if-eqz v0, :cond_28

    .line 664
    .line 665
    const/16 v0, 0x8

    .line 666
    .line 667
    invoke-virtual {v2, v0}, LJ5/y;->i(I)I

    .line 668
    .line 669
    .line 670
    move-result v0

    .line 671
    const/16 v3, 0xff

    .line 672
    .line 673
    if-ne v0, v3, :cond_26

    .line 674
    .line 675
    const/16 v0, 0x10

    .line 676
    .line 677
    invoke-virtual {v2, v0}, LJ5/y;->i(I)I

    .line 678
    .line 679
    .line 680
    move-result v3

    .line 681
    invoke-virtual {v2, v0}, LJ5/y;->i(I)I

    .line 682
    .line 683
    .line 684
    move-result v0

    .line 685
    if-eqz v3, :cond_28

    .line 686
    .line 687
    if-eqz v0, :cond_28

    .line 688
    .line 689
    int-to-float v1, v3

    .line 690
    int-to-float v0, v0

    .line 691
    div-float/2addr v1, v0

    .line 692
    goto :goto_18

    .line 693
    :cond_26
    const/16 v3, 0x11

    .line 694
    .line 695
    if-ge v0, v3, :cond_27

    .line 696
    .line 697
    sget-object v1, Lu6/a;->e:[F

    .line 698
    .line 699
    aget v1, v1, v0

    .line 700
    .line 701
    goto :goto_18

    .line 702
    :cond_27
    const-string v3, "Unexpected aspect_ratio_idc value: "

    .line 703
    .line 704
    const-string v4, "NalUnitUtil"

    .line 705
    .line 706
    invoke-static {v0, v3, v4}, LA7/p0;->u(ILjava/lang/String;Ljava/lang/String;)V

    .line 707
    .line 708
    .line 709
    :cond_28
    :goto_18
    invoke-virtual {v2}, LJ5/y;->h()Z

    .line 710
    .line 711
    .line 712
    move-result v0

    .line 713
    if-eqz v0, :cond_29

    .line 714
    .line 715
    invoke-virtual {v2}, LJ5/y;->s()V

    .line 716
    .line 717
    .line 718
    :cond_29
    invoke-virtual {v2}, LJ5/y;->h()Z

    .line 719
    .line 720
    .line 721
    move-result v0

    .line 722
    if-eqz v0, :cond_2a

    .line 723
    .line 724
    const/4 v0, 0x4

    .line 725
    invoke-virtual {v2, v0}, LJ5/y;->t(I)V

    .line 726
    .line 727
    .line 728
    invoke-virtual {v2}, LJ5/y;->h()Z

    .line 729
    .line 730
    .line 731
    move-result v0

    .line 732
    if-eqz v0, :cond_2a

    .line 733
    .line 734
    const/16 v0, 0x18

    .line 735
    .line 736
    invoke-virtual {v2, v0}, LJ5/y;->t(I)V

    .line 737
    .line 738
    .line 739
    :cond_2a
    invoke-virtual {v2}, LJ5/y;->h()Z

    .line 740
    .line 741
    .line 742
    move-result v0

    .line 743
    if-eqz v0, :cond_2b

    .line 744
    .line 745
    invoke-virtual {v2}, LJ5/y;->m()I

    .line 746
    .line 747
    .line 748
    invoke-virtual {v2}, LJ5/y;->m()I

    .line 749
    .line 750
    .line 751
    :cond_2b
    invoke-virtual {v2}, LJ5/y;->s()V

    .line 752
    .line 753
    .line 754
    invoke-virtual {v2}, LJ5/y;->h()Z

    .line 755
    .line 756
    .line 757
    move-result v0

    .line 758
    if-eqz v0, :cond_2c

    .line 759
    .line 760
    mul-int/lit8 v16, v16, 0x2

    .line 761
    .line 762
    :cond_2c
    move/from16 v13, v16

    .line 763
    .line 764
    new-instance v5, Lu6/l;

    .line 765
    .line 766
    move-object v10, v12

    .line 767
    move v12, v9

    .line 768
    move v9, v14

    .line 769
    move v14, v1

    .line 770
    invoke-direct/range {v5 .. v14}, Lu6/l;-><init>(IZII[IIIIF)V

    .line 771
    .line 772
    .line 773
    return-object v5
.end method
