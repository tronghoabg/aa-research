.class public abstract Lxg/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Lxg/f; = null

.field public static b:Z = false

.field public static c:Ljava/lang/Class;

.field public static d:Ljava/lang/reflect/Method;


# direct methods
.method public static final A(Lc0/g;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lc0/g;->d:Lc0/r;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_3

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    if-eq v0, v1, :cond_3

    .line 11
    .line 12
    const/4 v1, 0x2

    .line 13
    if-eq v0, v1, :cond_2

    .line 14
    .line 15
    const/4 v1, 0x3

    .line 16
    if-eq v0, v1, :cond_1

    .line 17
    .line 18
    const/4 v1, 0x4

    .line 19
    if-eq v0, v1, :cond_1

    .line 20
    .line 21
    const/4 v1, 0x5

    .line 22
    if-ne v0, v1, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    new-instance p0, LE5/Q;

    .line 26
    .line 27
    const/16 v0, 0x9

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    invoke-direct {p0, v1, v0}, LE5/Q;-><init>(BI)V

    .line 31
    .line 32
    .line 33
    throw p0

    .line 34
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 35
    .line 36
    const-string v0, "Granting focus to a deactivated node."

    .line 37
    .line 38
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    throw p0

    .line 42
    :cond_2
    sget-object v0, Lc0/r;->c:Lc0/r;

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_3
    :goto_0
    sget-object v0, Lc0/r;->a:Lc0/r;

    .line 46
    .line 47
    :goto_1
    invoke-virtual {p0, v0}, Lc0/g;->e0(Lc0/r;)V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public static B(D)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ljava/lang/Math;->getExponent(D)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/16 p1, 0x3ff

    .line 6
    .line 7
    if-gt p0, p1, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method public static final C(IIJ)J
    .locals 4

    .line 1
    invoke-static {p2, p3}, LL0/a;->g(J)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    add-int/2addr v0, p0

    .line 6
    const/4 v1, 0x0

    .line 7
    if-gez v0, :cond_0

    .line 8
    .line 9
    move v0, v1

    .line 10
    :cond_0
    invoke-static {p2, p3}, LL0/a;->e(J)I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    const v3, 0x7fffffff

    .line 15
    .line 16
    .line 17
    if-ne v2, v3, :cond_1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    add-int/2addr v2, p0

    .line 21
    if-gez v2, :cond_2

    .line 22
    .line 23
    move v2, v1

    .line 24
    :cond_2
    :goto_0
    invoke-static {p2, p3}, LL0/a;->f(J)I

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    add-int/2addr p0, p1

    .line 29
    if-gez p0, :cond_3

    .line 30
    .line 31
    move p0, v1

    .line 32
    :cond_3
    invoke-static {p2, p3}, LL0/a;->d(J)I

    .line 33
    .line 34
    .line 35
    move-result p2

    .line 36
    if-ne p2, v3, :cond_5

    .line 37
    .line 38
    :cond_4
    move v1, p2

    .line 39
    goto :goto_1

    .line 40
    :cond_5
    add-int/2addr p2, p1

    .line 41
    if-gez p2, :cond_4

    .line 42
    .line 43
    :goto_1
    invoke-static {v0, v2, p0, v1}, Lxg/g;->a(IIII)J

    .line 44
    .line 45
    .line 46
    move-result-wide p0

    .line 47
    return-wide p0
.end method

.method public static D(Ljava/util/List;)Ljava/util/ArrayList;
    .locals 3

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 8
    .line 9
    .line 10
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Ljava/util/List;

    .line 25
    .line 26
    const/4 v2, 0x0

    .line 27
    new-array v2, v2, [Ljava/lang/String;

    .line 28
    .line 29
    invoke-interface {v1, v2}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    check-cast v1, [Ljava/lang/String;

    .line 34
    .line 35
    invoke-static {v1}, Lm9/r;->b([Ljava/lang/String;)Lm9/r;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    return-object v0
.end method

.method public static E(I)I
    .locals 2

    .line 1
    invoke-static {p0}, LA/f;->f(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_3

    .line 7
    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    const/4 p0, 0x2

    .line 11
    return p0

    .line 12
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    if-eq p0, v1, :cond_2

    .line 16
    .line 17
    const/4 v1, 0x2

    .line 18
    if-eq p0, v1, :cond_1

    .line 19
    .line 20
    const-string p0, "null"

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    const-string p0, "CACHE"

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_2
    const-string p0, "DEFAULT_SOURCE"

    .line 27
    .line 28
    :goto_0
    const-string v1, "Unknown ListenSource value: "

    .line 29
    .line 30
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw v0

    .line 38
    :cond_3
    return v1
.end method

.method public static F(LY4/b;)Ljava/util/ArrayList;
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, LY4/b;->q()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    :cond_0
    :goto_0
    move-object/from16 v20, v2

    .line 11
    .line 12
    goto/16 :goto_d

    .line 13
    .line 14
    :cond_1
    const/4 v1, 0x7

    .line 15
    invoke-virtual {v0, v1}, LY4/b;->B(I)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, LY4/b;->d()I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    const v4, 0x64666c38

    .line 23
    .line 24
    .line 25
    const/4 v5, 0x1

    .line 26
    if-ne v3, v4, :cond_3

    .line 27
    .line 28
    new-instance v3, LY4/b;

    .line 29
    .line 30
    invoke-direct {v3}, LY4/b;-><init>()V

    .line 31
    .line 32
    .line 33
    new-instance v4, Ljava/util/zip/Inflater;

    .line 34
    .line 35
    invoke-direct {v4, v5}, Ljava/util/zip/Inflater;-><init>(Z)V

    .line 36
    .line 37
    .line 38
    :try_start_0
    invoke-static {v0, v3, v4}, Lu6/v;->v(LY4/b;LY4/b;Ljava/util/zip/Inflater;)Z

    .line 39
    .line 40
    .line 41
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    if-nez v0, :cond_2

    .line 43
    .line 44
    invoke-virtual {v4}, Ljava/util/zip/Inflater;->end()V

    .line 45
    .line 46
    .line 47
    return-object v2

    .line 48
    :cond_2
    invoke-virtual {v4}, Ljava/util/zip/Inflater;->end()V

    .line 49
    .line 50
    .line 51
    move-object v0, v3

    .line 52
    goto :goto_1

    .line 53
    :catchall_0
    move-exception v0

    .line 54
    invoke-virtual {v4}, Ljava/util/zip/Inflater;->end()V

    .line 55
    .line 56
    .line 57
    throw v0

    .line 58
    :cond_3
    const v4, 0x72617720

    .line 59
    .line 60
    .line 61
    if-eq v3, v4, :cond_4

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_4
    :goto_1
    new-instance v3, Ljava/util/ArrayList;

    .line 65
    .line 66
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 67
    .line 68
    .line 69
    iget v4, v0, LY4/b;->b:I

    .line 70
    .line 71
    iget v6, v0, LY4/b;->c:I

    .line 72
    .line 73
    :goto_2
    if-ge v4, v6, :cond_14

    .line 74
    .line 75
    invoke-virtual {v0}, LY4/b;->d()I

    .line 76
    .line 77
    .line 78
    move-result v7

    .line 79
    add-int/2addr v7, v4

    .line 80
    if-le v7, v4, :cond_0

    .line 81
    .line 82
    if-le v7, v6, :cond_5

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_5
    invoke-virtual {v0}, LY4/b;->d()I

    .line 86
    .line 87
    .line 88
    move-result v4

    .line 89
    const v8, 0x6d657368

    .line 90
    .line 91
    .line 92
    if-ne v4, v8, :cond_13

    .line 93
    .line 94
    invoke-virtual {v0}, LY4/b;->d()I

    .line 95
    .line 96
    .line 97
    move-result v4

    .line 98
    const/16 v8, 0x2710

    .line 99
    .line 100
    if-le v4, v8, :cond_6

    .line 101
    .line 102
    :goto_3
    move/from16 v16, v1

    .line 103
    .line 104
    move-object v1, v2

    .line 105
    move-object/from16 v20, v1

    .line 106
    .line 107
    move/from16 v17, v5

    .line 108
    .line 109
    move/from16 v24, v6

    .line 110
    .line 111
    goto/16 :goto_b

    .line 112
    .line 113
    :cond_6
    new-array v8, v4, [F

    .line 114
    .line 115
    const/4 v10, 0x0

    .line 116
    :goto_4
    if-ge v10, v4, :cond_7

    .line 117
    .line 118
    invoke-virtual {v0}, LY4/b;->d()I

    .line 119
    .line 120
    .line 121
    move-result v11

    .line 122
    invoke-static {v11}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 123
    .line 124
    .line 125
    move-result v11

    .line 126
    aput v11, v8, v10

    .line 127
    .line 128
    add-int/lit8 v10, v10, 0x1

    .line 129
    .line 130
    goto :goto_4

    .line 131
    :cond_7
    invoke-virtual {v0}, LY4/b;->d()I

    .line 132
    .line 133
    .line 134
    move-result v10

    .line 135
    const/16 v11, 0x7d00

    .line 136
    .line 137
    if-le v10, v11, :cond_8

    .line 138
    .line 139
    goto :goto_3

    .line 140
    :cond_8
    const-wide/high16 v11, 0x4000000000000000L    # 2.0

    .line 141
    .line 142
    invoke-static {v11, v12}, Ljava/lang/Math;->log(D)D

    .line 143
    .line 144
    .line 145
    move-result-wide v13

    .line 146
    move/from16 v16, v1

    .line 147
    .line 148
    move-object v15, v2

    .line 149
    int-to-double v1, v4

    .line 150
    mul-double/2addr v1, v11

    .line 151
    invoke-static {v1, v2}, Ljava/lang/Math;->log(D)D

    .line 152
    .line 153
    .line 154
    move-result-wide v1

    .line 155
    div-double/2addr v1, v13

    .line 156
    invoke-static {v1, v2}, Ljava/lang/Math;->ceil(D)D

    .line 157
    .line 158
    .line 159
    move-result-wide v1

    .line 160
    double-to-int v1, v1

    .line 161
    new-instance v2, LJ5/y;

    .line 162
    .line 163
    move/from16 v17, v5

    .line 164
    .line 165
    iget-object v5, v0, LY4/b;->a:[B

    .line 166
    .line 167
    array-length v9, v5

    .line 168
    move-wide/from16 v18, v11

    .line 169
    .line 170
    const/4 v11, 0x6

    .line 171
    const/4 v12, 0x0

    .line 172
    invoke-direct {v2, v5, v9, v11, v12}, LJ5/y;-><init>([BIIB)V

    .line 173
    .line 174
    .line 175
    iget v5, v0, LY4/b;->b:I

    .line 176
    .line 177
    const/16 v9, 0x8

    .line 178
    .line 179
    mul-int/2addr v5, v9

    .line 180
    invoke-virtual {v2, v5}, LJ5/y;->q(I)V

    .line 181
    .line 182
    .line 183
    mul-int/lit8 v5, v10, 0x5

    .line 184
    .line 185
    new-array v5, v5, [F

    .line 186
    .line 187
    const/4 v11, 0x5

    .line 188
    new-array v12, v11, [I

    .line 189
    .line 190
    move-object/from16 v20, v15

    .line 191
    .line 192
    const/4 v15, 0x0

    .line 193
    const/16 v21, 0x0

    .line 194
    .line 195
    :goto_5
    if-ge v15, v10, :cond_d

    .line 196
    .line 197
    const/4 v9, 0x0

    .line 198
    :goto_6
    if-ge v9, v11, :cond_c

    .line 199
    .line 200
    aget v22, v12, v9

    .line 201
    .line 202
    invoke-virtual {v2, v1}, LJ5/y;->i(I)I

    .line 203
    .line 204
    .line 205
    move-result v23

    .line 206
    shr-int/lit8 v24, v23, 0x1

    .line 207
    .line 208
    and-int/lit8 v11, v23, 0x1

    .line 209
    .line 210
    neg-int v11, v11

    .line 211
    xor-int v11, v24, v11

    .line 212
    .line 213
    add-int v11, v11, v22

    .line 214
    .line 215
    if-ge v11, v4, :cond_a

    .line 216
    .line 217
    if-gez v11, :cond_9

    .line 218
    .line 219
    goto :goto_7

    .line 220
    :cond_9
    add-int/lit8 v22, v21, 0x1

    .line 221
    .line 222
    aget v23, v8, v11

    .line 223
    .line 224
    aput v23, v5, v21

    .line 225
    .line 226
    aput v11, v12, v9

    .line 227
    .line 228
    add-int/lit8 v9, v9, 0x1

    .line 229
    .line 230
    move/from16 v21, v22

    .line 231
    .line 232
    const/4 v11, 0x5

    .line 233
    goto :goto_6

    .line 234
    :cond_a
    :goto_7
    move/from16 v24, v6

    .line 235
    .line 236
    :cond_b
    :goto_8
    move-object/from16 v1, v20

    .line 237
    .line 238
    goto/16 :goto_b

    .line 239
    .line 240
    :cond_c
    add-int/lit8 v15, v15, 0x1

    .line 241
    .line 242
    const/16 v9, 0x8

    .line 243
    .line 244
    const/4 v11, 0x5

    .line 245
    goto :goto_5

    .line 246
    :cond_d
    invoke-virtual {v2}, LJ5/y;->g()I

    .line 247
    .line 248
    .line 249
    move-result v1

    .line 250
    add-int/lit8 v1, v1, 0x7

    .line 251
    .line 252
    and-int/lit8 v1, v1, -0x8

    .line 253
    .line 254
    invoke-virtual {v2, v1}, LJ5/y;->q(I)V

    .line 255
    .line 256
    .line 257
    const/16 v1, 0x20

    .line 258
    .line 259
    invoke-virtual {v2, v1}, LJ5/y;->i(I)I

    .line 260
    .line 261
    .line 262
    move-result v4

    .line 263
    new-array v8, v4, [LM2/d;

    .line 264
    .line 265
    const/4 v9, 0x0

    .line 266
    :goto_9
    if-ge v9, v4, :cond_11

    .line 267
    .line 268
    const/16 v11, 0x8

    .line 269
    .line 270
    invoke-virtual {v2, v11}, LJ5/y;->i(I)I

    .line 271
    .line 272
    .line 273
    move-result v12

    .line 274
    invoke-virtual {v2, v11}, LJ5/y;->i(I)I

    .line 275
    .line 276
    .line 277
    move-result v15

    .line 278
    invoke-virtual {v2, v1}, LJ5/y;->i(I)I

    .line 279
    .line 280
    .line 281
    move-result v11

    .line 282
    const v1, 0x1f400

    .line 283
    .line 284
    .line 285
    if-le v11, v1, :cond_e

    .line 286
    .line 287
    goto :goto_7

    .line 288
    :cond_e
    move/from16 v22, v4

    .line 289
    .line 290
    move-object v1, v5

    .line 291
    int-to-double v4, v10

    .line 292
    mul-double v4, v4, v18

    .line 293
    .line 294
    invoke-static {v4, v5}, Ljava/lang/Math;->log(D)D

    .line 295
    .line 296
    .line 297
    move-result-wide v4

    .line 298
    div-double/2addr v4, v13

    .line 299
    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    .line 300
    .line 301
    .line 302
    move-result-wide v4

    .line 303
    double-to-int v4, v4

    .line 304
    mul-int/lit8 v5, v11, 0x3

    .line 305
    .line 306
    new-array v5, v5, [F

    .line 307
    .line 308
    move-object/from16 v23, v1

    .line 309
    .line 310
    mul-int/lit8 v1, v11, 0x2

    .line 311
    .line 312
    new-array v1, v1, [F

    .line 313
    .line 314
    move/from16 v24, v6

    .line 315
    .line 316
    const/4 v6, 0x0

    .line 317
    const/16 v25, 0x0

    .line 318
    .line 319
    :goto_a
    if-ge v6, v11, :cond_10

    .line 320
    .line 321
    invoke-virtual {v2, v4}, LJ5/y;->i(I)I

    .line 322
    .line 323
    .line 324
    move-result v26

    .line 325
    shr-int/lit8 v27, v26, 0x1

    .line 326
    .line 327
    move-object/from16 v28, v2

    .line 328
    .line 329
    and-int/lit8 v2, v26, 0x1

    .line 330
    .line 331
    neg-int v2, v2

    .line 332
    xor-int v2, v27, v2

    .line 333
    .line 334
    add-int v2, v2, v25

    .line 335
    .line 336
    if-ltz v2, :cond_b

    .line 337
    .line 338
    if-lt v2, v10, :cond_f

    .line 339
    .line 340
    goto :goto_8

    .line 341
    :cond_f
    mul-int/lit8 v25, v6, 0x3

    .line 342
    .line 343
    mul-int/lit8 v26, v2, 0x5

    .line 344
    .line 345
    aget v27, v23, v26

    .line 346
    .line 347
    aput v27, v5, v25

    .line 348
    .line 349
    add-int/lit8 v27, v25, 0x1

    .line 350
    .line 351
    add-int/lit8 v29, v26, 0x1

    .line 352
    .line 353
    aget v29, v23, v29

    .line 354
    .line 355
    aput v29, v5, v27

    .line 356
    .line 357
    add-int/lit8 v25, v25, 0x2

    .line 358
    .line 359
    add-int/lit8 v27, v26, 0x2

    .line 360
    .line 361
    aget v27, v23, v27

    .line 362
    .line 363
    aput v27, v5, v25

    .line 364
    .line 365
    mul-int/lit8 v25, v6, 0x2

    .line 366
    .line 367
    add-int/lit8 v27, v26, 0x3

    .line 368
    .line 369
    aget v27, v23, v27

    .line 370
    .line 371
    aput v27, v1, v25

    .line 372
    .line 373
    add-int/lit8 v25, v25, 0x1

    .line 374
    .line 375
    add-int/lit8 v26, v26, 0x4

    .line 376
    .line 377
    aget v26, v23, v26

    .line 378
    .line 379
    aput v26, v1, v25

    .line 380
    .line 381
    add-int/lit8 v6, v6, 0x1

    .line 382
    .line 383
    move/from16 v25, v2

    .line 384
    .line 385
    move-object/from16 v2, v28

    .line 386
    .line 387
    goto :goto_a

    .line 388
    :cond_10
    move-object/from16 v28, v2

    .line 389
    .line 390
    new-instance v2, LM2/d;

    .line 391
    .line 392
    invoke-direct {v2, v12, v15, v5, v1}, LM2/d;-><init>(II[F[F)V

    .line 393
    .line 394
    .line 395
    aput-object v2, v8, v9

    .line 396
    .line 397
    add-int/lit8 v9, v9, 0x1

    .line 398
    .line 399
    move/from16 v4, v22

    .line 400
    .line 401
    move-object/from16 v5, v23

    .line 402
    .line 403
    move/from16 v6, v24

    .line 404
    .line 405
    move-object/from16 v2, v28

    .line 406
    .line 407
    const/16 v1, 0x20

    .line 408
    .line 409
    goto/16 :goto_9

    .line 410
    .line 411
    :cond_11
    move/from16 v24, v6

    .line 412
    .line 413
    new-instance v1, Lw6/e;

    .line 414
    .line 415
    invoke-direct {v1, v8}, Lw6/e;-><init>([LM2/d;)V

    .line 416
    .line 417
    .line 418
    :goto_b
    if-nez v1, :cond_12

    .line 419
    .line 420
    goto :goto_d

    .line 421
    :cond_12
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 422
    .line 423
    .line 424
    goto :goto_c

    .line 425
    :cond_13
    move/from16 v16, v1

    .line 426
    .line 427
    move-object/from16 v20, v2

    .line 428
    .line 429
    move/from16 v17, v5

    .line 430
    .line 431
    move/from16 v24, v6

    .line 432
    .line 433
    :goto_c
    invoke-virtual {v0, v7}, LY4/b;->A(I)V

    .line 434
    .line 435
    .line 436
    move v4, v7

    .line 437
    move/from16 v1, v16

    .line 438
    .line 439
    move/from16 v5, v17

    .line 440
    .line 441
    move-object/from16 v2, v20

    .line 442
    .line 443
    move/from16 v6, v24

    .line 444
    .line 445
    goto/16 :goto_2

    .line 446
    .line 447
    :goto_d
    return-object v20

    .line 448
    :cond_14
    return-object v3
.end method

.method public static G(I)Lm9/n;
    .locals 2

    .line 1
    sget-object v0, Lm9/n;->a:Lm9/n;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    invoke-static {p0}, LA/f;->f(I)I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_6

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    if-eq v1, v0, :cond_5

    .line 14
    .line 15
    const/4 v0, 0x2

    .line 16
    if-ne v1, v0, :cond_1

    .line 17
    .line 18
    sget-object p0, Lm9/n;->c:Lm9/n;

    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 22
    .line 23
    const/4 v1, 0x1

    .line 24
    if-eq p0, v1, :cond_4

    .line 25
    .line 26
    const/4 v1, 0x2

    .line 27
    if-eq p0, v1, :cond_3

    .line 28
    .line 29
    const/4 v1, 0x3

    .line 30
    if-eq p0, v1, :cond_2

    .line 31
    .line 32
    const-string p0, "null"

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    const-string p0, "PREVIOUS"

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_3
    const-string p0, "ESTIMATE"

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_4
    const-string p0, "NONE"

    .line 42
    .line 43
    :goto_0
    const-string v1, "Unknown server timestamp behavior: "

    .line 44
    .line 45
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw v0

    .line 53
    :cond_5
    sget-object p0, Lm9/n;->b:Lm9/n;

    .line 54
    .line 55
    return-object p0

    .line 56
    :cond_6
    :goto_1
    return-object v0
.end method

.method public static H(I)I
    .locals 3

    .line 1
    invoke-static {p0}, LA/f;->f(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_5

    .line 7
    .line 8
    const/4 v2, 0x2

    .line 9
    if-eq v0, v1, :cond_4

    .line 10
    .line 11
    if-ne v0, v2, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x3

    .line 14
    return p0

    .line 15
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    if-eq p0, v1, :cond_3

    .line 19
    .line 20
    const/4 v1, 0x2

    .line 21
    if-eq p0, v1, :cond_2

    .line 22
    .line 23
    const/4 v1, 0x3

    .line 24
    if-eq p0, v1, :cond_1

    .line 25
    .line 26
    const-string p0, "null"

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    const-string p0, "CACHE"

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_2
    const-string p0, "SERVER"

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_3
    const-string p0, "SERVER_AND_CACHE"

    .line 36
    .line 37
    :goto_0
    const-string v1, "Unknown source: "

    .line 38
    .line 39
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    throw v0

    .line 47
    :cond_4
    return v2

    .line 48
    :cond_5
    return v1
.end method

.method public static I(Lcom/google/firebase/firestore/FirebaseFirestore;Ljava/lang/String;ZLUc/u;)Lm9/W;
    .locals 18

    move-object/from16 v0, p3

    .line 1
    const-string v1, "FLTFirestoreMsgCodec"

    if-eqz p2, :cond_0

    .line 2
    :try_start_0
    invoke-virtual/range {p0 .. p1}, Lcom/google/firebase/firestore/FirebaseFirestore;->c(Ljava/lang/String;)Lm9/W;

    move-result-object v2

    goto :goto_0

    :catch_0
    move-exception v0

    goto/16 :goto_4

    .line 3
    :cond_0
    invoke-virtual/range {p0 .. p1}, Lcom/google/firebase/firestore/FirebaseFirestore;->b(Ljava/lang/String;)Lm9/h;

    move-result-object v2

    :goto_0
    if-nez v0, :cond_1

    return-object v2

    .line 4
    :cond_1
    iget-object v3, v0, LUc/u;->i:Ljava/util/Map;

    if-eqz v3, :cond_2

    .line 5
    invoke-static {v3}, Lxg/g;->y(Ljava/util/Map;)Lm9/A;

    move-result-object v3

    .line 6
    invoke-virtual {v2, v3}, Lm9/W;->j(Lm9/A;)Lm9/W;

    move-result-object v2

    .line 7
    :cond_2
    iget-object v3, v0, LUc/u;->a:Ljava/util/List;

    .line 8
    invoke-static {v3}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v3, Ljava/util/List;

    .line 9
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eqz v4, :cond_d

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    .line 10
    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lm9/r;

    .line 11
    invoke-interface {v4, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    .line 12
    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    .line 13
    const-string v5, "=="

    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    .line 14
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    new-instance v5, Lm9/z;

    sget-object v7, Lp9/i;->d:Lp9/i;

    invoke-direct {v5, v6, v7, v4}, Lm9/z;-><init>(Lm9/r;Lp9/i;Ljava/lang/Object;)V

    .line 16
    invoke-virtual {v2, v5}, Lm9/W;->j(Lm9/A;)Lm9/W;

    move-result-object v2

    goto :goto_1

    .line 17
    :cond_3
    const-string v5, "!="

    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    .line 18
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    new-instance v5, Lm9/z;

    sget-object v7, Lp9/i;->e:Lp9/i;

    invoke-direct {v5, v6, v7, v4}, Lm9/z;-><init>(Lm9/r;Lp9/i;Ljava/lang/Object;)V

    .line 20
    invoke-virtual {v2, v5}, Lm9/W;->j(Lm9/A;)Lm9/W;

    move-result-object v2

    goto :goto_1

    .line 21
    :cond_4
    const-string v5, "<"

    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    .line 22
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    new-instance v5, Lm9/z;

    sget-object v7, Lp9/i;->b:Lp9/i;

    invoke-direct {v5, v6, v7, v4}, Lm9/z;-><init>(Lm9/r;Lp9/i;Ljava/lang/Object;)V

    .line 24
    invoke-virtual {v2, v5}, Lm9/W;->j(Lm9/A;)Lm9/W;

    move-result-object v2

    goto :goto_1

    .line 25
    :cond_5
    const-string v5, "<="

    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_6

    .line 26
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    new-instance v5, Lm9/z;

    sget-object v7, Lp9/i;->c:Lp9/i;

    invoke-direct {v5, v6, v7, v4}, Lm9/z;-><init>(Lm9/r;Lp9/i;Ljava/lang/Object;)V

    .line 28
    invoke-virtual {v2, v5}, Lm9/W;->j(Lm9/A;)Lm9/W;

    move-result-object v2

    goto :goto_1

    .line 29
    :cond_6
    const-string v5, ">"

    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_7

    .line 30
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    new-instance v5, Lm9/z;

    sget-object v7, Lp9/i;->f:Lp9/i;

    invoke-direct {v5, v6, v7, v4}, Lm9/z;-><init>(Lm9/r;Lp9/i;Ljava/lang/Object;)V

    .line 32
    invoke-virtual {v2, v5}, Lm9/W;->j(Lm9/A;)Lm9/W;

    move-result-object v2

    goto/16 :goto_1

    .line 33
    :cond_7
    const-string v5, ">="

    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_8

    .line 34
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    new-instance v5, Lm9/z;

    sget-object v7, Lp9/i;->g:Lp9/i;

    invoke-direct {v5, v6, v7, v4}, Lm9/z;-><init>(Lm9/r;Lp9/i;Ljava/lang/Object;)V

    .line 36
    invoke-virtual {v2, v5}, Lm9/W;->j(Lm9/A;)Lm9/W;

    move-result-object v2

    goto/16 :goto_1

    .line 37
    :cond_8
    const-string v5, "array-contains"

    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_9

    .line 38
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    new-instance v5, Lm9/z;

    sget-object v7, Lp9/i;->h:Lp9/i;

    invoke-direct {v5, v6, v7, v4}, Lm9/z;-><init>(Lm9/r;Lp9/i;Ljava/lang/Object;)V

    .line 40
    invoke-virtual {v2, v5}, Lm9/W;->j(Lm9/A;)Lm9/W;

    move-result-object v2

    goto/16 :goto_1

    .line 41
    :cond_9
    const-string v5, "array-contains-any"

    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_a

    .line 42
    check-cast v4, Ljava/util/List;

    .line 43
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    new-instance v5, Lm9/z;

    sget-object v7, Lp9/i;->i:Lp9/i;

    invoke-direct {v5, v6, v7, v4}, Lm9/z;-><init>(Lm9/r;Lp9/i;Ljava/lang/Object;)V

    .line 45
    invoke-virtual {v2, v5}, Lm9/W;->j(Lm9/A;)Lm9/W;

    move-result-object v2

    goto/16 :goto_1

    .line 46
    :cond_a
    const-string v5, "in"

    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_b

    .line 47
    check-cast v4, Ljava/util/List;

    .line 48
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    new-instance v5, Lm9/z;

    sget-object v7, Lp9/i;->j:Lp9/i;

    invoke-direct {v5, v6, v7, v4}, Lm9/z;-><init>(Lm9/r;Lp9/i;Ljava/lang/Object;)V

    .line 50
    invoke-virtual {v2, v5}, Lm9/W;->j(Lm9/A;)Lm9/W;

    move-result-object v2

    goto/16 :goto_1

    .line 51
    :cond_b
    const-string v5, "not-in"

    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_c

    .line 52
    check-cast v4, Ljava/util/List;

    .line 53
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    new-instance v5, Lm9/z;

    sget-object v7, Lp9/i;->k:Lp9/i;

    invoke-direct {v5, v6, v7, v4}, Lm9/z;-><init>(Lm9/r;Lp9/i;Ljava/lang/Object;)V

    .line 55
    invoke-virtual {v2, v5}, Lm9/W;->j(Lm9/A;)Lm9/W;

    move-result-object v2

    goto/16 :goto_1

    .line 56
    :cond_c
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "An invalid query operator "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " was received but not handled."

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_1

    .line 57
    :cond_d
    iget-object v3, v0, LUc/u;->c:Ljava/lang/Long;

    if-eqz v3, :cond_e

    .line 58
    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Lm9/W;->d(J)Lm9/W;

    move-result-object v2

    .line 59
    :cond_e
    iget-object v3, v0, LUc/u;->d:Ljava/lang/Long;

    if-eqz v3, :cond_f

    .line 60
    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Lm9/W;->e(J)Lm9/W;

    move-result-object v2

    .line 61
    :cond_f
    iget-object v3, v0, LUc/u;->b:Ljava/util/List;

    if-nez v3, :cond_10

    return-object v2

    .line 62
    :cond_10
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_12

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    .line 63
    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lm9/r;

    .line 64
    invoke-interface {v4, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-eqz v4, :cond_11

    move v4, v5

    goto :goto_3

    :cond_11
    move v4, v7

    .line 65
    :goto_3
    invoke-virtual {v2, v8, v4}, Lm9/W;->f(Lm9/r;I)Lm9/W;

    move-result-object v2

    goto :goto_2

    .line 66
    :cond_12
    iget-object v3, v0, LUc/u;->e:Ljava/util/List;

    if-eqz v3, :cond_13

    .line 67
    invoke-interface {v3}, Ljava/util/List;->toArray()[Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    const-string v4, "startAt"

    .line 69
    invoke-virtual {v2, v7, v4, v3}, Lm9/W;->b(ZLjava/lang/String;[Ljava/lang/Object;)Lp9/c;

    move-result-object v16

    .line 70
    new-instance v3, Lm9/W;

    iget-object v4, v2, Lm9/W;->a:Lp9/u;

    .line 71
    new-instance v8, Lp9/u;

    iget v15, v4, Lp9/u;->i:I

    iget-object v5, v4, Lp9/u;->k:Lp9/c;

    iget-object v9, v4, Lp9/u;->f:Ls9/m;

    iget-object v10, v4, Lp9/u;->g:Ljava/lang/String;

    iget-object v11, v4, Lp9/u;->e:Ljava/util/List;

    iget-object v12, v4, Lp9/u;->a:Ljava/util/List;

    iget-wide v13, v4, Lp9/u;->h:J

    move-object/from16 v17, v5

    invoke-direct/range {v8 .. v17}, Lp9/u;-><init>(Ls9/m;Ljava/lang/String;Ljava/util/List;Ljava/util/List;JILp9/c;Lp9/c;)V

    .line 72
    iget-object v2, v2, Lm9/W;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    invoke-direct {v3, v8, v2}, Lm9/W;-><init>(Lp9/u;Lcom/google/firebase/firestore/FirebaseFirestore;)V

    move-object v2, v3

    .line 73
    :cond_13
    iget-object v3, v0, LUc/u;->f:Ljava/util/List;

    if-eqz v3, :cond_14

    .line 74
    invoke-interface {v3}, Ljava/util/List;->toArray()[Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    const-string v4, "startAfter"

    .line 76
    invoke-virtual {v2, v6, v4, v3}, Lm9/W;->b(ZLjava/lang/String;[Ljava/lang/Object;)Lp9/c;

    move-result-object v16

    .line 77
    new-instance v3, Lm9/W;

    iget-object v4, v2, Lm9/W;->a:Lp9/u;

    .line 78
    new-instance v8, Lp9/u;

    iget v15, v4, Lp9/u;->i:I

    iget-object v5, v4, Lp9/u;->k:Lp9/c;

    iget-object v9, v4, Lp9/u;->f:Ls9/m;

    iget-object v10, v4, Lp9/u;->g:Ljava/lang/String;

    iget-object v11, v4, Lp9/u;->e:Ljava/util/List;

    iget-object v12, v4, Lp9/u;->a:Ljava/util/List;

    iget-wide v13, v4, Lp9/u;->h:J

    move-object/from16 v17, v5

    invoke-direct/range {v8 .. v17}, Lp9/u;-><init>(Ls9/m;Ljava/lang/String;Ljava/util/List;Ljava/util/List;JILp9/c;Lp9/c;)V

    .line 79
    iget-object v2, v2, Lm9/W;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    invoke-direct {v3, v8, v2}, Lm9/W;-><init>(Lp9/u;Lcom/google/firebase/firestore/FirebaseFirestore;)V

    move-object v2, v3

    .line 80
    :cond_14
    iget-object v3, v0, LUc/u;->g:Ljava/util/List;

    if-eqz v3, :cond_15

    .line 81
    invoke-interface {v3}, Ljava/util/List;->toArray()[Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    const-string v4, "endAt"

    .line 83
    invoke-virtual {v2, v7, v4, v3}, Lm9/W;->b(ZLjava/lang/String;[Ljava/lang/Object;)Lp9/c;

    move-result-object v17

    .line 84
    new-instance v3, Lm9/W;

    iget-object v4, v2, Lm9/W;->a:Lp9/u;

    .line 85
    new-instance v8, Lp9/u;

    iget v15, v4, Lp9/u;->i:I

    iget-object v5, v4, Lp9/u;->j:Lp9/c;

    iget-object v9, v4, Lp9/u;->f:Ls9/m;

    iget-object v10, v4, Lp9/u;->g:Ljava/lang/String;

    iget-object v11, v4, Lp9/u;->e:Ljava/util/List;

    iget-object v12, v4, Lp9/u;->a:Ljava/util/List;

    iget-wide v13, v4, Lp9/u;->h:J

    move-object/from16 v16, v5

    invoke-direct/range {v8 .. v17}, Lp9/u;-><init>(Ls9/m;Ljava/lang/String;Ljava/util/List;Ljava/util/List;JILp9/c;Lp9/c;)V

    .line 86
    iget-object v2, v2, Lm9/W;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    invoke-direct {v3, v8, v2}, Lm9/W;-><init>(Lp9/u;Lcom/google/firebase/firestore/FirebaseFirestore;)V

    move-object v2, v3

    .line 87
    :cond_15
    iget-object v0, v0, LUc/u;->h:Ljava/util/List;

    if-eqz v0, :cond_16

    .line 88
    invoke-interface {v0}, Ljava/util/List;->toArray()[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    const-string v3, "endBefore"

    .line 90
    invoke-virtual {v2, v6, v3, v0}, Lm9/W;->b(ZLjava/lang/String;[Ljava/lang/Object;)Lp9/c;

    move-result-object v16

    .line 91
    new-instance v0, Lm9/W;

    iget-object v3, v2, Lm9/W;->a:Lp9/u;

    .line 92
    new-instance v7, Lp9/u;

    iget v14, v3, Lp9/u;->i:I

    iget-object v15, v3, Lp9/u;->j:Lp9/c;

    iget-object v8, v3, Lp9/u;->f:Ls9/m;

    iget-object v9, v3, Lp9/u;->g:Ljava/lang/String;

    iget-object v10, v3, Lp9/u;->e:Ljava/util/List;

    iget-object v11, v3, Lp9/u;->a:Ljava/util/List;

    iget-wide v12, v3, Lp9/u;->h:J

    invoke-direct/range {v7 .. v16}, Lp9/u;-><init>(Ls9/m;Ljava/lang/String;Ljava/util/List;Ljava/util/List;JILp9/c;Lp9/c;)V

    .line 93
    iget-object v2, v2, Lm9/W;->b:Lcom/google/firebase/firestore/FirebaseFirestore;

    invoke-direct {v0, v7, v2}, Lm9/W;-><init>(Lp9/u;Lcom/google/firebase/firestore/FirebaseFirestore;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :cond_16
    return-object v2

    .line 94
    :goto_4
    const-string v2, "An error occurred while parsing query arguments, this is most likely an error with this SDK."

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const/4 v0, 0x0

    return-object v0
.end method

.method public static L(Lh6/a;)V
    .locals 5

    .line 1
    const v0, -0x800001

    .line 2
    .line 3
    .line 4
    iput v0, p0, Lh6/a;->k:F

    .line 5
    .line 6
    const/high16 v0, -0x80000000

    .line 7
    .line 8
    iput v0, p0, Lh6/a;->j:I

    .line 9
    .line 10
    iget-object v0, p0, Lh6/a;->a:Ljava/lang/CharSequence;

    .line 11
    .line 12
    instance-of v1, v0, Landroid/text/Spanned;

    .line 13
    .line 14
    if-eqz v1, :cond_3

    .line 15
    .line 16
    instance-of v1, v0, Landroid/text/Spannable;

    .line 17
    .line 18
    if-nez v1, :cond_0

    .line 19
    .line 20
    invoke-static {v0}, Landroid/text/SpannableString;->valueOf(Ljava/lang/CharSequence;)Landroid/text/SpannableString;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iput-object v0, p0, Lh6/a;->a:Ljava/lang/CharSequence;

    .line 25
    .line 26
    :cond_0
    iget-object p0, p0, Lh6/a;->a:Ljava/lang/CharSequence;

    .line 27
    .line 28
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    check-cast p0, Landroid/text/Spannable;

    .line 32
    .line 33
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    const/4 v1, 0x0

    .line 38
    const-class v2, Ljava/lang/Object;

    .line 39
    .line 40
    invoke-interface {p0, v1, v0, v2}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    array-length v2, v0

    .line 45
    :goto_0
    if-ge v1, v2, :cond_3

    .line 46
    .line 47
    aget-object v3, v0, v1

    .line 48
    .line 49
    instance-of v4, v3, Landroid/text/style/AbsoluteSizeSpan;

    .line 50
    .line 51
    if-nez v4, :cond_1

    .line 52
    .line 53
    instance-of v4, v3, Landroid/text/style/RelativeSizeSpan;

    .line 54
    .line 55
    if-eqz v4, :cond_2

    .line 56
    .line 57
    :cond_1
    invoke-interface {p0, v3}, Landroid/text/Spannable;->removeSpan(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_3
    return-void
.end method

.method public static final M(Lc0/g;)V
    .locals 2

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lc0/g;->k:Lt0/y;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, v0, Lt0/y;->e:Lt0/t;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object v0, v0, Lt0/t;->g:Lu0/n;

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    :goto_0
    const/4 v1, 0x1

    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    iput-boolean v1, p0, Lc0/g;->l:Z

    .line 22
    .line 23
    return-void

    .line 24
    :cond_1
    iget-object v0, p0, Lc0/g;->d:Lc0/r;

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_6

    .line 31
    .line 32
    if-eq v0, v1, :cond_5

    .line 33
    .line 34
    const/4 v1, 0x2

    .line 35
    if-eq v0, v1, :cond_6

    .line 36
    .line 37
    const/4 v1, 0x3

    .line 38
    if-eq v0, v1, :cond_6

    .line 39
    .line 40
    const/4 v1, 0x4

    .line 41
    if-eq v0, v1, :cond_6

    .line 42
    .line 43
    const/4 v1, 0x5

    .line 44
    if-eq v0, v1, :cond_2

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_2
    iget-object v0, p0, Lc0/g;->b:Lc0/g;

    .line 48
    .line 49
    if-eqz v0, :cond_3

    .line 50
    .line 51
    invoke-static {v0, p0}, Lxg/g;->N(Lc0/g;Lc0/g;)Z

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_3
    iget-object v0, p0, Lc0/g;->k:Lt0/y;

    .line 56
    .line 57
    if-eqz v0, :cond_4

    .line 58
    .line 59
    iget-object v0, v0, Lt0/y;->e:Lt0/t;

    .line 60
    .line 61
    if-eqz v0, :cond_4

    .line 62
    .line 63
    iget-object v0, v0, Lt0/t;->g:Lu0/n;

    .line 64
    .line 65
    if-eqz v0, :cond_4

    .line 66
    .line 67
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-eqz v0, :cond_7

    .line 72
    .line 73
    invoke-static {p0}, Lxg/g;->A(Lc0/g;)V

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :cond_4
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 78
    .line 79
    const-string v0, "Owner not initialized."

    .line 80
    .line 81
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    throw p0

    .line 85
    :cond_5
    invoke-static {p0}, Lxg/g;->p(Lc0/g;)Z

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    if-eqz v0, :cond_7

    .line 90
    .line 91
    invoke-static {p0}, Lxg/g;->A(Lc0/g;)V

    .line 92
    .line 93
    .line 94
    return-void

    .line 95
    :cond_6
    iget-object p0, p0, Lc0/g;->f:Lc0/d;

    .line 96
    .line 97
    if-eqz p0, :cond_7

    .line 98
    .line 99
    invoke-virtual {p0}, Lc0/d;->c()V

    .line 100
    .line 101
    .line 102
    :cond_7
    :goto_1
    return-void
.end method

.method public static final N(Lc0/g;Lc0/g;)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lc0/g;->c:LP/d;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LP/d;->f(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_9

    .line 8
    .line 9
    iget-object v0, p0, Lc0/g;->d:Lc0/r;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x1

    .line 16
    if-eqz v0, :cond_8

    .line 17
    .line 18
    if-eq v0, v1, :cond_6

    .line 19
    .line 20
    const/4 v2, 0x2

    .line 21
    if-eq v0, v2, :cond_7

    .line 22
    .line 23
    const/4 v2, 0x3

    .line 24
    if-eq v0, v2, :cond_5

    .line 25
    .line 26
    const/4 v2, 0x4

    .line 27
    if-eq v0, v2, :cond_3

    .line 28
    .line 29
    const/4 v1, 0x5

    .line 30
    if-ne v0, v1, :cond_2

    .line 31
    .line 32
    iget-object v0, p0, Lc0/g;->b:Lc0/g;

    .line 33
    .line 34
    if-nez v0, :cond_1

    .line 35
    .line 36
    iget-object v1, p0, Lc0/g;->k:Lt0/y;

    .line 37
    .line 38
    if-eqz v1, :cond_0

    .line 39
    .line 40
    iget-object v1, v1, Lt0/y;->e:Lt0/t;

    .line 41
    .line 42
    if-eqz v1, :cond_0

    .line 43
    .line 44
    iget-object v1, v1, Lt0/t;->g:Lu0/n;

    .line 45
    .line 46
    if-eqz v1, :cond_0

    .line 47
    .line 48
    invoke-virtual {v1}, Landroid/view/View;->requestFocus()Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eqz v1, :cond_1

    .line 53
    .line 54
    sget-object v0, Lc0/r;->a:Lc0/r;

    .line 55
    .line 56
    invoke-virtual {p0, v0}, Lc0/g;->e0(Lc0/r;)V

    .line 57
    .line 58
    .line 59
    invoke-static {p0, p1}, Lxg/g;->N(Lc0/g;Lc0/g;)Z

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    return p0

    .line 64
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 65
    .line 66
    const-string p1, "Owner not initialized."

    .line 67
    .line 68
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    throw p0

    .line 72
    :cond_1
    if-eqz v0, :cond_7

    .line 73
    .line 74
    invoke-static {v0, p0}, Lxg/g;->N(Lc0/g;Lc0/g;)Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-eqz v0, :cond_7

    .line 79
    .line 80
    invoke-static {p0, p1}, Lxg/g;->N(Lc0/g;Lc0/g;)Z

    .line 81
    .line 82
    .line 83
    move-result p0

    .line 84
    return p0

    .line 85
    :cond_2
    new-instance p0, LE5/Q;

    .line 86
    .line 87
    const/16 p1, 0x9

    .line 88
    .line 89
    const/4 v0, 0x0

    .line 90
    invoke-direct {p0, v0, p1}, LE5/Q;-><init>(BI)V

    .line 91
    .line 92
    .line 93
    throw p0

    .line 94
    :cond_3
    iget-object v0, p0, Lc0/g;->e:Lc0/g;

    .line 95
    .line 96
    if-nez v0, :cond_4

    .line 97
    .line 98
    iput-object p1, p0, Lc0/g;->e:Lc0/g;

    .line 99
    .line 100
    invoke-static {p1}, Lxg/g;->A(Lc0/g;)V

    .line 101
    .line 102
    .line 103
    return v1

    .line 104
    :cond_4
    invoke-static {p0}, Lxg/g;->p(Lc0/g;)Z

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    if-eqz v0, :cond_7

    .line 109
    .line 110
    iput-object p1, p0, Lc0/g;->e:Lc0/g;

    .line 111
    .line 112
    invoke-static {p1}, Lxg/g;->A(Lc0/g;)V

    .line 113
    .line 114
    .line 115
    return v1

    .line 116
    :cond_5
    invoke-static {p0}, Lxg/g;->i(Lc0/g;)V

    .line 117
    .line 118
    .line 119
    invoke-static {p0, p1}, Lxg/g;->N(Lc0/g;Lc0/g;)Z

    .line 120
    .line 121
    .line 122
    move-result p1

    .line 123
    invoke-static {p0}, Lxg/g;->w(Lc0/g;)V

    .line 124
    .line 125
    .line 126
    return p1

    .line 127
    :cond_6
    invoke-static {p0}, Lxg/g;->p(Lc0/g;)Z

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    if-eqz v0, :cond_7

    .line 132
    .line 133
    iput-object p1, p0, Lc0/g;->e:Lc0/g;

    .line 134
    .line 135
    invoke-static {p1}, Lxg/g;->A(Lc0/g;)V

    .line 136
    .line 137
    .line 138
    return v1

    .line 139
    :cond_7
    const/4 p0, 0x0

    .line 140
    return p0

    .line 141
    :cond_8
    sget-object v0, Lc0/r;->b:Lc0/r;

    .line 142
    .line 143
    invoke-virtual {p0, v0}, Lc0/g;->e0(Lc0/r;)V

    .line 144
    .line 145
    .line 146
    iput-object p1, p0, Lc0/g;->e:Lc0/g;

    .line 147
    .line 148
    invoke-static {p1}, Lxg/g;->A(Lc0/g;)V

    .line 149
    .line 150
    .line 151
    return v1

    .line 152
    :cond_9
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 153
    .line 154
    const-string p1, "Non child node cannot request focus."

    .line 155
    .line 156
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    throw p0
.end method

.method public static O(IFII)F
    .locals 2

    .line 1
    const v0, -0x800001

    .line 2
    .line 3
    .line 4
    cmpl-float v1, p1, v0

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    return v0

    .line 9
    :cond_0
    if-eqz p0, :cond_3

    .line 10
    .line 11
    const/4 p3, 0x1

    .line 12
    if-eq p0, p3, :cond_2

    .line 13
    .line 14
    const/4 p2, 0x2

    .line 15
    if-eq p0, p2, :cond_1

    .line 16
    .line 17
    return v0

    .line 18
    :cond_1
    return p1

    .line 19
    :cond_2
    int-to-float p0, p2

    .line 20
    :goto_0
    mul-float/2addr p1, p0

    .line 21
    return p1

    .line 22
    :cond_3
    int-to-float p0, p3

    .line 23
    goto :goto_0
.end method

.method public static final P(Landroid/text/SpannableString;JII)V
    .locals 2

    .line 1
    sget-wide v0, Le0/q;->i:J

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Landroid/text/style/ForegroundColorSpan;

    .line 8
    .line 9
    invoke-static {p1, p2}, Le0/z;->s(J)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-direct {v0, p1}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 14
    .line 15
    .line 16
    invoke-static {p0, v0, p3, p4}, Lxg/g;->S(Landroid/text/Spannable;Ljava/lang/Object;II)V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public static final Q(Landroid/text/SpannableString;JLL0/b;II)V
    .locals 4

    .line 1
    const-string v0, "density"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1, p2}, LL0/j;->b(J)J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    const-wide v2, 0x100000000L

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    invoke-static {v0, v1, v2, v3}, LL0/k;->a(JJ)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    new-instance v0, Landroid/text/style/AbsoluteSizeSpan;

    .line 22
    .line 23
    invoke-interface {p3, p1, p2}, LL0/b;->l(J)F

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    invoke-static {p1}, Lvf/a;->H(F)I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    const/4 p2, 0x0

    .line 32
    invoke-direct {v0, p1, p2}, Landroid/text/style/AbsoluteSizeSpan;-><init>(IZ)V

    .line 33
    .line 34
    .line 35
    invoke-static {p0, v0, p4, p5}, Lxg/g;->S(Landroid/text/Spannable;Ljava/lang/Object;II)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_0
    const-wide v2, 0x200000000L

    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    invoke-static {v0, v1, v2, v3}, LL0/k;->a(JJ)Z

    .line 45
    .line 46
    .line 47
    move-result p3

    .line 48
    if-eqz p3, :cond_1

    .line 49
    .line 50
    new-instance p3, Landroid/text/style/RelativeSizeSpan;

    .line 51
    .line 52
    invoke-static {p1, p2}, LL0/j;->c(J)F

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    invoke-direct {p3, p1}, Landroid/text/style/RelativeSizeSpan;-><init>(F)V

    .line 57
    .line 58
    .line 59
    invoke-static {p0, p3, p4, p5}, Lxg/g;->S(Landroid/text/Spannable;Ljava/lang/Object;II)V

    .line 60
    .line 61
    .line 62
    :cond_1
    return-void
.end method

.method public static final R(Landroid/text/SpannableString;LG0/c;II)V
    .locals 2

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 4
    .line 5
    const/16 v1, 0x18

    .line 6
    .line 7
    if-lt v0, v1, :cond_0

    .line 8
    .line 9
    sget-object v0, LI0/a;->a:LI0/a;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, LI0/a;->a(LG0/c;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    goto :goto_1

    .line 16
    :cond_0
    iget-object p1, p1, LG0/c;->a:Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/4 v1, 0x0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    new-instance p1, LG0/b;

    .line 26
    .line 27
    sget-object v0, LG0/e;->a:LG0/d;

    .line 28
    .line 29
    invoke-interface {v0}, LG0/d;->b()Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    check-cast v0, LG0/a;

    .line 38
    .line 39
    invoke-direct {p1, v0}, LG0/b;-><init>(LG0/a;)V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    check-cast p1, LG0/b;

    .line 48
    .line 49
    :goto_0
    new-instance v0, Landroid/text/style/LocaleSpan;

    .line 50
    .line 51
    const-string v1, "<this>"

    .line 52
    .line 53
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    iget-object p1, p1, LG0/b;->a:LG0/a;

    .line 57
    .line 58
    iget-object p1, p1, LG0/a;->a:Ljava/util/Locale;

    .line 59
    .line 60
    invoke-direct {v0, p1}, Landroid/text/style/LocaleSpan;-><init>(Ljava/util/Locale;)V

    .line 61
    .line 62
    .line 63
    move-object p1, v0

    .line 64
    :goto_1
    invoke-static {p0, p1, p2, p3}, Lxg/g;->S(Landroid/text/Spannable;Ljava/lang/Object;II)V

    .line 65
    .line 66
    .line 67
    :cond_2
    return-void
.end method

.method public static final S(Landroid/text/Spannable;Ljava/lang/Object;II)V
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "span"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/16 v0, 0x21

    .line 12
    .line 13
    invoke-interface {p0, p1, p2, p3, v0}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public static T(Luc/f;Lkd/l;)V
    .locals 5

    .line 1
    const-string v0, "binaryMessenger"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    iget-object v0, p1, Lkd/l;->a:LC8/i;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, LC8/i;->q()Luc/n;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    new-instance v0, Lkd/b;

    .line 18
    .line 19
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    :goto_0
    new-instance v1, LVa/X7;

    .line 23
    .line 24
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setDomStorageEnabled"

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    invoke-direct {v1, p0, v0, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    if-eqz p1, :cond_1

    .line 31
    .line 32
    new-instance v2, Lkd/H;

    .line 33
    .line 34
    const/4 v4, 0x0

    .line 35
    invoke-direct {v2, p1, v4}, Lkd/H;-><init>(Lkd/l;I)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1, v2}, LVa/X7;->n(Luc/b;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    invoke-virtual {v1, v3}, LVa/X7;->n(Luc/b;)V

    .line 43
    .line 44
    .line 45
    :goto_1
    new-instance v1, LVa/X7;

    .line 46
    .line 47
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setJavaScriptCanOpenWindowsAutomatically"

    .line 48
    .line 49
    invoke-direct {v1, p0, v0, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    if-eqz p1, :cond_2

    .line 53
    .line 54
    new-instance v2, Lkd/H;

    .line 55
    .line 56
    const/16 v4, 0xf

    .line 57
    .line 58
    invoke-direct {v2, p1, v4}, Lkd/H;-><init>(Lkd/l;I)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1, v2}, LVa/X7;->n(Luc/b;)V

    .line 62
    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_2
    invoke-virtual {v1, v3}, LVa/X7;->n(Luc/b;)V

    .line 66
    .line 67
    .line 68
    :goto_2
    new-instance v1, LVa/X7;

    .line 69
    .line 70
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setSupportMultipleWindows"

    .line 71
    .line 72
    invoke-direct {v1, p0, v0, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    if-eqz p1, :cond_3

    .line 76
    .line 77
    new-instance v2, Lkd/H;

    .line 78
    .line 79
    const/16 v4, 0x10

    .line 80
    .line 81
    invoke-direct {v2, p1, v4}, Lkd/H;-><init>(Lkd/l;I)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1, v2}, LVa/X7;->n(Luc/b;)V

    .line 85
    .line 86
    .line 87
    goto :goto_3

    .line 88
    :cond_3
    invoke-virtual {v1, v3}, LVa/X7;->n(Luc/b;)V

    .line 89
    .line 90
    .line 91
    :goto_3
    new-instance v1, LVa/X7;

    .line 92
    .line 93
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setJavaScriptEnabled"

    .line 94
    .line 95
    invoke-direct {v1, p0, v0, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    if-eqz p1, :cond_4

    .line 99
    .line 100
    new-instance v2, Lkd/H;

    .line 101
    .line 102
    const/4 v4, 0x1

    .line 103
    invoke-direct {v2, p1, v4}, Lkd/H;-><init>(Lkd/l;I)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v1, v2}, LVa/X7;->n(Luc/b;)V

    .line 107
    .line 108
    .line 109
    goto :goto_4

    .line 110
    :cond_4
    invoke-virtual {v1, v3}, LVa/X7;->n(Luc/b;)V

    .line 111
    .line 112
    .line 113
    :goto_4
    new-instance v1, LVa/X7;

    .line 114
    .line 115
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setUserAgentString"

    .line 116
    .line 117
    invoke-direct {v1, p0, v0, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    if-eqz p1, :cond_5

    .line 121
    .line 122
    new-instance v2, Lkd/H;

    .line 123
    .line 124
    const/4 v4, 0x2

    .line 125
    invoke-direct {v2, p1, v4}, Lkd/H;-><init>(Lkd/l;I)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v1, v2}, LVa/X7;->n(Luc/b;)V

    .line 129
    .line 130
    .line 131
    goto :goto_5

    .line 132
    :cond_5
    invoke-virtual {v1, v3}, LVa/X7;->n(Luc/b;)V

    .line 133
    .line 134
    .line 135
    :goto_5
    new-instance v1, LVa/X7;

    .line 136
    .line 137
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setMediaPlaybackRequiresUserGesture"

    .line 138
    .line 139
    invoke-direct {v1, p0, v0, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    if-eqz p1, :cond_6

    .line 143
    .line 144
    new-instance v2, Lkd/H;

    .line 145
    .line 146
    const/4 v4, 0x3

    .line 147
    invoke-direct {v2, p1, v4}, Lkd/H;-><init>(Lkd/l;I)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v1, v2}, LVa/X7;->n(Luc/b;)V

    .line 151
    .line 152
    .line 153
    goto :goto_6

    .line 154
    :cond_6
    invoke-virtual {v1, v3}, LVa/X7;->n(Luc/b;)V

    .line 155
    .line 156
    .line 157
    :goto_6
    new-instance v1, LVa/X7;

    .line 158
    .line 159
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setSupportZoom"

    .line 160
    .line 161
    invoke-direct {v1, p0, v0, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    if-eqz p1, :cond_7

    .line 165
    .line 166
    new-instance v2, Lkd/H;

    .line 167
    .line 168
    const/4 v4, 0x4

    .line 169
    invoke-direct {v2, p1, v4}, Lkd/H;-><init>(Lkd/l;I)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v1, v2}, LVa/X7;->n(Luc/b;)V

    .line 173
    .line 174
    .line 175
    goto :goto_7

    .line 176
    :cond_7
    invoke-virtual {v1, v3}, LVa/X7;->n(Luc/b;)V

    .line 177
    .line 178
    .line 179
    :goto_7
    new-instance v1, LVa/X7;

    .line 180
    .line 181
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setLoadWithOverviewMode"

    .line 182
    .line 183
    invoke-direct {v1, p0, v0, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    if-eqz p1, :cond_8

    .line 187
    .line 188
    new-instance v2, Lkd/H;

    .line 189
    .line 190
    const/4 v4, 0x5

    .line 191
    invoke-direct {v2, p1, v4}, Lkd/H;-><init>(Lkd/l;I)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v1, v2}, LVa/X7;->n(Luc/b;)V

    .line 195
    .line 196
    .line 197
    goto :goto_8

    .line 198
    :cond_8
    invoke-virtual {v1, v3}, LVa/X7;->n(Luc/b;)V

    .line 199
    .line 200
    .line 201
    :goto_8
    new-instance v1, LVa/X7;

    .line 202
    .line 203
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setUseWideViewPort"

    .line 204
    .line 205
    invoke-direct {v1, p0, v0, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    if-eqz p1, :cond_9

    .line 209
    .line 210
    new-instance v2, Lkd/H;

    .line 211
    .line 212
    const/4 v4, 0x6

    .line 213
    invoke-direct {v2, p1, v4}, Lkd/H;-><init>(Lkd/l;I)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v1, v2}, LVa/X7;->n(Luc/b;)V

    .line 217
    .line 218
    .line 219
    goto :goto_9

    .line 220
    :cond_9
    invoke-virtual {v1, v3}, LVa/X7;->n(Luc/b;)V

    .line 221
    .line 222
    .line 223
    :goto_9
    new-instance v1, LVa/X7;

    .line 224
    .line 225
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setDisplayZoomControls"

    .line 226
    .line 227
    invoke-direct {v1, p0, v0, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    if-eqz p1, :cond_a

    .line 231
    .line 232
    new-instance v2, Lkd/H;

    .line 233
    .line 234
    const/4 v4, 0x7

    .line 235
    invoke-direct {v2, p1, v4}, Lkd/H;-><init>(Lkd/l;I)V

    .line 236
    .line 237
    .line 238
    invoke-virtual {v1, v2}, LVa/X7;->n(Luc/b;)V

    .line 239
    .line 240
    .line 241
    goto :goto_a

    .line 242
    :cond_a
    invoke-virtual {v1, v3}, LVa/X7;->n(Luc/b;)V

    .line 243
    .line 244
    .line 245
    :goto_a
    new-instance v1, LVa/X7;

    .line 246
    .line 247
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setBuiltInZoomControls"

    .line 248
    .line 249
    invoke-direct {v1, p0, v0, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 250
    .line 251
    .line 252
    if-eqz p1, :cond_b

    .line 253
    .line 254
    new-instance v2, Lkd/H;

    .line 255
    .line 256
    const/16 v4, 0x8

    .line 257
    .line 258
    invoke-direct {v2, p1, v4}, Lkd/H;-><init>(Lkd/l;I)V

    .line 259
    .line 260
    .line 261
    invoke-virtual {v1, v2}, LVa/X7;->n(Luc/b;)V

    .line 262
    .line 263
    .line 264
    goto :goto_b

    .line 265
    :cond_b
    invoke-virtual {v1, v3}, LVa/X7;->n(Luc/b;)V

    .line 266
    .line 267
    .line 268
    :goto_b
    new-instance v1, LVa/X7;

    .line 269
    .line 270
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setAllowFileAccess"

    .line 271
    .line 272
    invoke-direct {v1, p0, v0, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 273
    .line 274
    .line 275
    if-eqz p1, :cond_c

    .line 276
    .line 277
    new-instance v2, Lkd/H;

    .line 278
    .line 279
    const/16 v4, 0x9

    .line 280
    .line 281
    invoke-direct {v2, p1, v4}, Lkd/H;-><init>(Lkd/l;I)V

    .line 282
    .line 283
    .line 284
    invoke-virtual {v1, v2}, LVa/X7;->n(Luc/b;)V

    .line 285
    .line 286
    .line 287
    goto :goto_c

    .line 288
    :cond_c
    invoke-virtual {v1, v3}, LVa/X7;->n(Luc/b;)V

    .line 289
    .line 290
    .line 291
    :goto_c
    new-instance v1, LVa/X7;

    .line 292
    .line 293
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setAllowContentAccess"

    .line 294
    .line 295
    invoke-direct {v1, p0, v0, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 296
    .line 297
    .line 298
    if-eqz p1, :cond_d

    .line 299
    .line 300
    new-instance v2, Lkd/H;

    .line 301
    .line 302
    const/16 v4, 0xa

    .line 303
    .line 304
    invoke-direct {v2, p1, v4}, Lkd/H;-><init>(Lkd/l;I)V

    .line 305
    .line 306
    .line 307
    invoke-virtual {v1, v2}, LVa/X7;->n(Luc/b;)V

    .line 308
    .line 309
    .line 310
    goto :goto_d

    .line 311
    :cond_d
    invoke-virtual {v1, v3}, LVa/X7;->n(Luc/b;)V

    .line 312
    .line 313
    .line 314
    :goto_d
    new-instance v1, LVa/X7;

    .line 315
    .line 316
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setGeolocationEnabled"

    .line 317
    .line 318
    invoke-direct {v1, p0, v0, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 319
    .line 320
    .line 321
    if-eqz p1, :cond_e

    .line 322
    .line 323
    new-instance v2, Lkd/H;

    .line 324
    .line 325
    const/16 v4, 0xb

    .line 326
    .line 327
    invoke-direct {v2, p1, v4}, Lkd/H;-><init>(Lkd/l;I)V

    .line 328
    .line 329
    .line 330
    invoke-virtual {v1, v2}, LVa/X7;->n(Luc/b;)V

    .line 331
    .line 332
    .line 333
    goto :goto_e

    .line 334
    :cond_e
    invoke-virtual {v1, v3}, LVa/X7;->n(Luc/b;)V

    .line 335
    .line 336
    .line 337
    :goto_e
    new-instance v1, LVa/X7;

    .line 338
    .line 339
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setTextZoom"

    .line 340
    .line 341
    invoke-direct {v1, p0, v0, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 342
    .line 343
    .line 344
    if-eqz p1, :cond_f

    .line 345
    .line 346
    new-instance v2, Lkd/H;

    .line 347
    .line 348
    const/16 v4, 0xc

    .line 349
    .line 350
    invoke-direct {v2, p1, v4}, Lkd/H;-><init>(Lkd/l;I)V

    .line 351
    .line 352
    .line 353
    invoke-virtual {v1, v2}, LVa/X7;->n(Luc/b;)V

    .line 354
    .line 355
    .line 356
    goto :goto_f

    .line 357
    :cond_f
    invoke-virtual {v1, v3}, LVa/X7;->n(Luc/b;)V

    .line 358
    .line 359
    .line 360
    :goto_f
    new-instance v1, LVa/X7;

    .line 361
    .line 362
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebSettings.getUserAgentString"

    .line 363
    .line 364
    invoke-direct {v1, p0, v0, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 365
    .line 366
    .line 367
    if-eqz p1, :cond_10

    .line 368
    .line 369
    new-instance v2, Lkd/H;

    .line 370
    .line 371
    const/16 v4, 0xd

    .line 372
    .line 373
    invoke-direct {v2, p1, v4}, Lkd/H;-><init>(Lkd/l;I)V

    .line 374
    .line 375
    .line 376
    invoke-virtual {v1, v2}, LVa/X7;->n(Luc/b;)V

    .line 377
    .line 378
    .line 379
    goto :goto_10

    .line 380
    :cond_10
    invoke-virtual {v1, v3}, LVa/X7;->n(Luc/b;)V

    .line 381
    .line 382
    .line 383
    :goto_10
    new-instance v1, LVa/X7;

    .line 384
    .line 385
    const-string v2, "dev.flutter.pigeon.webview_flutter_android.WebSettings.setMixedContentMode"

    .line 386
    .line 387
    invoke-direct {v1, p0, v0, v3, v2}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 388
    .line 389
    .line 390
    if-eqz p1, :cond_11

    .line 391
    .line 392
    new-instance p0, Lkd/H;

    .line 393
    .line 394
    const/16 v0, 0xe

    .line 395
    .line 396
    invoke-direct {p0, p1, v0}, Lkd/H;-><init>(Lkd/l;I)V

    .line 397
    .line 398
    .line 399
    invoke-virtual {v1, p0}, LVa/X7;->n(Luc/b;)V

    .line 400
    .line 401
    .line 402
    return-void

    .line 403
    :cond_11
    invoke-virtual {v1, v3}, LVa/X7;->n(Luc/b;)V

    .line 404
    .line 405
    .line 406
    return-void
.end method

.method public static final U(LJd/B;LJd/B;)V
    .locals 3

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "url"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p1, LJd/B;->d:LJd/D;

    .line 12
    .line 13
    iput-object v0, p0, LJd/B;->d:LJd/D;

    .line 14
    .line 15
    iget-object v0, p1, LJd/B;->a:Ljava/lang/String;

    .line 16
    .line 17
    const-string v1, "<set-?>"

    .line 18
    .line 19
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, LJd/B;->a:Ljava/lang/String;

    .line 23
    .line 24
    iget v0, p1, LJd/B;->c:I

    .line 25
    .line 26
    invoke-virtual {p0, v0}, LJd/B;->d(I)V

    .line 27
    .line 28
    .line 29
    iget-object v0, p1, LJd/B;->h:Ljava/util/List;

    .line 30
    .line 31
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    iput-object v0, p0, LJd/B;->h:Ljava/util/List;

    .line 35
    .line 36
    iget-object v0, p1, LJd/B;->e:Ljava/lang/String;

    .line 37
    .line 38
    iput-object v0, p0, LJd/B;->e:Ljava/lang/String;

    .line 39
    .line 40
    iget-object v0, p1, LJd/B;->f:Ljava/lang/String;

    .line 41
    .line 42
    iput-object v0, p0, LJd/B;->f:Ljava/lang/String;

    .line 43
    .line 44
    new-instance v0, LJd/z;

    .line 45
    .line 46
    const/16 v2, 0x8

    .line 47
    .line 48
    invoke-direct {v0, v2}, LA7/B0;-><init>(I)V

    .line 49
    .line 50
    .line 51
    iget-object v2, p1, LJd/B;->i:LJd/z;

    .line 52
    .line 53
    invoke-static {v0, v2}, Lxg/g;->l(LNd/k;LNd/k;)V

    .line 54
    .line 55
    .line 56
    iput-object v0, p0, LJd/B;->i:LJd/z;

    .line 57
    .line 58
    new-instance v2, LS3/l;

    .line 59
    .line 60
    invoke-direct {v2, v0}, LS3/l;-><init>(LJd/z;)V

    .line 61
    .line 62
    .line 63
    iput-object v2, p0, LJd/B;->j:LS3/l;

    .line 64
    .line 65
    iget-object v0, p1, LJd/B;->g:Ljava/lang/String;

    .line 66
    .line 67
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    iput-object v0, p0, LJd/B;->g:Ljava/lang/String;

    .line 71
    .line 72
    iget-boolean p1, p1, LJd/B;->b:Z

    .line 73
    .line 74
    iput-boolean p1, p0, LJd/B;->b:Z

    .line 75
    .line 76
    return-void
.end method

.method public static V(Lm9/i;Lm9/n;)LUc/p;
    .locals 5

    .line 1
    iget v0, p0, Lm9/i;->a:I

    .line 2
    .line 3
    invoke-static {v0}, LA/f;->f(I)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x1

    .line 8
    if-eqz v1, :cond_5

    .line 9
    .line 10
    const/4 v3, 0x2

    .line 11
    if-eq v1, v2, :cond_4

    .line 12
    .line 13
    if-ne v1, v3, :cond_0

    .line 14
    .line 15
    const/4 v2, 0x3

    .line 16
    goto :goto_1

    .line 17
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    if-eq v0, p1, :cond_3

    .line 21
    .line 22
    const/4 p1, 0x2

    .line 23
    if-eq v0, p1, :cond_2

    .line 24
    .line 25
    const/4 p1, 0x3

    .line 26
    if-eq v0, p1, :cond_1

    .line 27
    .line 28
    const-string p1, "null"

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    const-string p1, "REMOVED"

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_2
    const-string p1, "MODIFIED"

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_3
    const-string p1, "ADDED"

    .line 38
    .line 39
    :goto_0
    const-string v0, "Unknown change type: "

    .line 40
    .line 41
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw p0

    .line 49
    :cond_4
    move v2, v3

    .line 50
    :cond_5
    :goto_1
    iget v0, p0, Lm9/i;->c:I

    .line 51
    .line 52
    int-to-long v0, v0

    .line 53
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    iget v1, p0, Lm9/i;->d:I

    .line 58
    .line 59
    int-to-long v3, v1

    .line 60
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    iget-object p0, p0, Lm9/i;->b:Lm9/X;

    .line 65
    .line 66
    invoke-static {p0, p1}, Lxg/g;->W(Lm9/o;Lm9/n;)LUc/r;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    new-instance p1, LUc/p;

    .line 71
    .line 72
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 73
    .line 74
    .line 75
    if-eqz v2, :cond_6

    .line 76
    .line 77
    iput v2, p1, LUc/p;->a:I

    .line 78
    .line 79
    iput-object p0, p1, LUc/p;->b:LUc/r;

    .line 80
    .line 81
    iput-object v0, p1, LUc/p;->c:Ljava/lang/Long;

    .line 82
    .line 83
    iput-object v1, p1, LUc/p;->d:Ljava/lang/Long;

    .line 84
    .line 85
    return-object p1

    .line 86
    :cond_6
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 87
    .line 88
    const-string p1, "Nonnull field \"type\" is null."

    .line 89
    .line 90
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    throw p0
.end method

.method public static W(Lm9/o;Lm9/n;)LUc/r;
    .locals 2

    .line 1
    iget-object v0, p0, Lm9/o;->d:Lm9/b0;

    .line 2
    .line 3
    invoke-static {v0}, Lxg/g;->Y(Lm9/b0;)LUc/w;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p0, p1}, Lm9/o;->a(Lm9/n;)Ljava/util/HashMap;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iget-object p0, p0, Lm9/o;->b:Ls9/h;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    iget-object p0, p0, Ls9/h;->a:Ls9/m;

    .line 17
    .line 18
    invoke-virtual {p0}, Ls9/m;->c()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    new-instance v1, LUc/r;

    .line 23
    .line 24
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 25
    .line 26
    .line 27
    if-eqz p0, :cond_0

    .line 28
    .line 29
    iput-object p0, v1, LUc/r;->a:Ljava/lang/String;

    .line 30
    .line 31
    iput-object p1, v1, LUc/r;->b:Ljava/util/Map;

    .line 32
    .line 33
    iput-object v0, v1, LUc/r;->c:LUc/w;

    .line 34
    .line 35
    return-object v1

    .line 36
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 37
    .line 38
    const-string p1, "Nonnull field \"path\" is null."

    .line 39
    .line 40
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    throw p0
.end method

.method public static X(Lm9/Y;Lm9/n;)LUc/v;
    .locals 4

    .line 1
    iget-object v0, p0, Lm9/Y;->f:Lm9/b0;

    .line 2
    .line 3
    invoke-static {v0}, Lxg/g;->Y(Lm9/b0;)LUc/w;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p0}, Lm9/Y;->a()Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    new-instance v2, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 18
    .line 19
    .line 20
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-eqz v3, :cond_0

    .line 29
    .line 30
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    check-cast v3, Lm9/i;

    .line 35
    .line 36
    invoke-static {v3, p1}, Lxg/g;->V(Lm9/i;Lm9/n;)LUc/p;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    invoke-virtual {p0}, Lm9/Y;->b()Ljava/util/ArrayList;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    new-instance v1, Ljava/util/ArrayList;

    .line 49
    .line 50
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    if-eqz v3, :cond_1

    .line 66
    .line 67
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    check-cast v3, Lm9/o;

    .line 72
    .line 73
    invoke-static {v3, p1}, Lxg/g;->W(Lm9/o;Lm9/n;)LUc/r;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_1
    new-instance p0, LUc/v;

    .line 82
    .line 83
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 84
    .line 85
    .line 86
    iput-object v1, p0, LUc/v;->a:Ljava/util/List;

    .line 87
    .line 88
    iput-object v2, p0, LUc/v;->b:Ljava/util/List;

    .line 89
    .line 90
    iput-object v0, p0, LUc/v;->c:LUc/w;

    .line 91
    .line 92
    return-object p0
.end method

.method public static Y(Lm9/b0;)LUc/w;
    .locals 2

    .line 1
    iget-boolean v0, p0, Lm9/b0;->a:Z

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-boolean p0, p0, Lm9/b0;->b:Z

    .line 8
    .line 9
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    new-instance v1, LUc/w;

    .line 14
    .line 15
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v0, v1, LUc/w;->a:Ljava/lang/Boolean;

    .line 19
    .line 20
    iput-object p0, v1, LUc/w;->b:Ljava/lang/Boolean;

    .line 21
    .line 22
    return-object v1
.end method

.method public static final Z(Ljava/lang/String;)Lef/u;
    .locals 15

    .line 1
    const/16 v0, 0xa

    .line 2
    .line 3
    invoke-static {v0}, Ltg/b;->t(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    goto :goto_1

    .line 13
    :cond_0
    const/4 v2, 0x0

    .line 14
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    const/16 v4, 0x30

    .line 19
    .line 20
    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->g(II)I

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    if-gez v4, :cond_1

    .line 25
    .line 26
    const/4 v4, 0x1

    .line 27
    if-eq v1, v4, :cond_5

    .line 28
    .line 29
    const/16 v5, 0x2b

    .line 30
    .line 31
    if-eq v3, v5, :cond_2

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    move v4, v2

    .line 35
    :cond_2
    const v3, 0x71c71c7

    .line 36
    .line 37
    .line 38
    move v5, v3

    .line 39
    :goto_0
    if-ge v4, v1, :cond_7

    .line 40
    .line 41
    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    .line 42
    .line 43
    .line 44
    move-result v6

    .line 45
    invoke-static {v6, v0}, Ljava/lang/Character;->digit(II)I

    .line 46
    .line 47
    .line 48
    move-result v6

    .line 49
    if-gez v6, :cond_3

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_3
    const/high16 v7, -0x80000000

    .line 53
    .line 54
    xor-int v8, v2, v7

    .line 55
    .line 56
    xor-int v9, v5, v7

    .line 57
    .line 58
    invoke-static {v8, v9}, Ljava/lang/Integer;->compare(II)I

    .line 59
    .line 60
    .line 61
    move-result v9

    .line 62
    if-lez v9, :cond_4

    .line 63
    .line 64
    if-ne v5, v3, :cond_5

    .line 65
    .line 66
    const/4 v5, -0x1

    .line 67
    int-to-long v9, v5

    .line 68
    const-wide v11, 0xffffffffL

    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    and-long/2addr v9, v11

    .line 74
    int-to-long v13, v0

    .line 75
    and-long/2addr v11, v13

    .line 76
    div-long/2addr v9, v11

    .line 77
    long-to-int v5, v9

    .line 78
    xor-int v9, v5, v7

    .line 79
    .line 80
    invoke-static {v8, v9}, Ljava/lang/Integer;->compare(II)I

    .line 81
    .line 82
    .line 83
    move-result v8

    .line 84
    if-lez v8, :cond_4

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_4
    mul-int/lit8 v2, v2, 0xa

    .line 88
    .line 89
    add-int/2addr v6, v2

    .line 90
    xor-int v8, v6, v7

    .line 91
    .line 92
    xor-int/2addr v2, v7

    .line 93
    invoke-static {v8, v2}, Ljava/lang/Integer;->compare(II)I

    .line 94
    .line 95
    .line 96
    move-result v2

    .line 97
    if-gez v2, :cond_6

    .line 98
    .line 99
    :cond_5
    :goto_1
    const/4 p0, 0x0

    .line 100
    return-object p0

    .line 101
    :cond_6
    add-int/lit8 v4, v4, 0x1

    .line 102
    .line 103
    move v2, v6

    .line 104
    goto :goto_0

    .line 105
    :cond_7
    new-instance p0, Lef/u;

    .line 106
    .line 107
    invoke-direct {p0, v2}, Lef/u;-><init>(I)V

    .line 108
    .line 109
    .line 110
    return-object p0
.end method

.method public static final a(IIII)J
    .locals 1

    .line 1
    const/16 v0, 0x29

    .line 2
    .line 3
    if-lt p1, p0, :cond_2

    .line 4
    .line 5
    if-lt p3, p2, :cond_1

    .line 6
    .line 7
    if-ltz p0, :cond_0

    .line 8
    .line 9
    if-ltz p2, :cond_0

    .line 10
    .line 11
    invoke-static {p0, p1, p2, p3}, Lvf/a;->m(IIII)J

    .line 12
    .line 13
    .line 14
    move-result-wide p0

    .line 15
    return-wide p0

    .line 16
    :cond_0
    const-string p1, "minWidth("

    .line 17
    .line 18
    const-string p3, ") and minHeight("

    .line 19
    .line 20
    const-string v0, ") must be >= 0"

    .line 21
    .line 22
    invoke-static {p1, p0, p3, p2, v0}, LN0/a;->e(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 27
    .line 28
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw p1

    .line 36
    :cond_1
    new-instance p0, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    const-string p1, "maxHeight("

    .line 39
    .line 40
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string p1, ") must be >= than minHeight("

    .line 47
    .line 48
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 62
    .line 63
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    throw p1

    .line 71
    :cond_2
    new-instance p2, Ljava/lang/StringBuilder;

    .line 72
    .line 73
    const-string p3, "maxWidth("

    .line 74
    .line 75
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    const-string p1, ") must be >= than minWidth("

    .line 82
    .line 83
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 97
    .line 98
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    throw p1
.end method

.method public static final a0(Ljava/lang/String;)Lef/w;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-string v1, "<this>"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const/16 v1, 0xa

    .line 9
    .line 10
    invoke-static {v1}, Ltg/b;->t(I)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-nez v2, :cond_0

    .line 18
    .line 19
    goto/16 :goto_5

    .line 20
    .line 21
    :cond_0
    const/4 v3, 0x0

    .line 22
    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    const/16 v5, 0x30

    .line 27
    .line 28
    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->g(II)I

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    const/4 v6, 0x1

    .line 33
    if-gez v5, :cond_2

    .line 34
    .line 35
    if-eq v2, v6, :cond_9

    .line 36
    .line 37
    const/16 v5, 0x2b

    .line 38
    .line 39
    if-eq v4, v5, :cond_1

    .line 40
    .line 41
    goto/16 :goto_5

    .line 42
    .line 43
    :cond_1
    move v4, v6

    .line 44
    goto :goto_0

    .line 45
    :cond_2
    move v4, v3

    .line 46
    :goto_0
    int-to-long v7, v1

    .line 47
    const-wide/16 v9, 0x0

    .line 48
    .line 49
    const-wide v11, 0x71c71c71c71c71cL

    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    move-wide v13, v9

    .line 55
    move-wide v15, v11

    .line 56
    :goto_1
    if-ge v4, v2, :cond_b

    .line 57
    .line 58
    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    invoke-static {v5, v1}, Ljava/lang/Character;->digit(II)I

    .line 63
    .line 64
    .line 65
    move-result v5

    .line 66
    if-gez v5, :cond_3

    .line 67
    .line 68
    goto/16 :goto_5

    .line 69
    .line 70
    :cond_3
    const-wide/high16 v17, -0x8000000000000000L

    .line 71
    .line 72
    move/from16 v19, v2

    .line 73
    .line 74
    xor-long v1, v13, v17

    .line 75
    .line 76
    move/from16 v20, v4

    .line 77
    .line 78
    xor-long v3, v15, v17

    .line 79
    .line 80
    invoke-static {v1, v2, v3, v4}, Ljava/lang/Long;->compare(JJ)I

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    if-lez v3, :cond_7

    .line 85
    .line 86
    cmp-long v3, v15, v11

    .line 87
    .line 88
    if-nez v3, :cond_9

    .line 89
    .line 90
    cmp-long v3, v7, v9

    .line 91
    .line 92
    const-wide v15, 0x7fffffffffffffffL

    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    if-gez v3, :cond_5

    .line 98
    .line 99
    xor-long v3, v7, v17

    .line 100
    .line 101
    cmp-long v3, v15, v3

    .line 102
    .line 103
    if-gez v3, :cond_4

    .line 104
    .line 105
    move-wide/from16 v22, v7

    .line 106
    .line 107
    move-wide v15, v9

    .line 108
    goto :goto_4

    .line 109
    :cond_4
    const-wide/16 v3, 0x1

    .line 110
    .line 111
    move-wide v15, v3

    .line 112
    move-wide/from16 v22, v7

    .line 113
    .line 114
    goto :goto_4

    .line 115
    :cond_5
    div-long/2addr v15, v7

    .line 116
    shl-long v3, v15, v6

    .line 117
    .line 118
    mul-long v15, v3, v7

    .line 119
    .line 120
    const-wide/16 v21, -0x1

    .line 121
    .line 122
    sub-long v21, v21, v15

    .line 123
    .line 124
    xor-long v15, v21, v17

    .line 125
    .line 126
    xor-long v21, v7, v17

    .line 127
    .line 128
    cmp-long v15, v15, v21

    .line 129
    .line 130
    if-ltz v15, :cond_6

    .line 131
    .line 132
    move v15, v6

    .line 133
    :goto_2
    move-wide/from16 v22, v7

    .line 134
    .line 135
    goto :goto_3

    .line 136
    :cond_6
    const/4 v15, 0x0

    .line 137
    goto :goto_2

    .line 138
    :goto_3
    int-to-long v6, v15

    .line 139
    add-long/2addr v3, v6

    .line 140
    move-wide v15, v3

    .line 141
    :goto_4
    xor-long v3, v15, v17

    .line 142
    .line 143
    invoke-static {v1, v2, v3, v4}, Ljava/lang/Long;->compare(JJ)I

    .line 144
    .line 145
    .line 146
    move-result v1

    .line 147
    if-lez v1, :cond_8

    .line 148
    .line 149
    goto :goto_5

    .line 150
    :cond_7
    move-wide/from16 v22, v7

    .line 151
    .line 152
    :cond_8
    mul-long v13, v13, v22

    .line 153
    .line 154
    int-to-long v1, v5

    .line 155
    const-wide v3, 0xffffffffL

    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    and-long/2addr v1, v3

    .line 161
    add-long/2addr v1, v13

    .line 162
    xor-long v3, v1, v17

    .line 163
    .line 164
    xor-long v5, v13, v17

    .line 165
    .line 166
    invoke-static {v3, v4, v5, v6}, Ljava/lang/Long;->compare(JJ)I

    .line 167
    .line 168
    .line 169
    move-result v3

    .line 170
    if-gez v3, :cond_a

    .line 171
    .line 172
    :cond_9
    :goto_5
    const/4 v0, 0x0

    .line 173
    return-object v0

    .line 174
    :cond_a
    add-int/lit8 v4, v20, 0x1

    .line 175
    .line 176
    move-wide v13, v1

    .line 177
    move/from16 v2, v19

    .line 178
    .line 179
    move-wide/from16 v7, v22

    .line 180
    .line 181
    const/16 v1, 0xa

    .line 182
    .line 183
    const/4 v3, 0x0

    .line 184
    const/4 v6, 0x1

    .line 185
    goto/16 :goto_1

    .line 186
    .line 187
    :cond_b
    new-instance v0, Lef/w;

    .line 188
    .line 189
    invoke-direct {v0, v13, v14}, Lef/w;-><init>(J)V

    .line 190
    .line 191
    .line 192
    return-object v0
.end method

.method public static synthetic b(III)J
    .locals 2

    .line 1
    and-int/lit8 v0, p2, 0x2

    .line 2
    .line 3
    const v1, 0x7fffffff

    .line 4
    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    move p0, v1

    .line 9
    :cond_0
    and-int/lit8 p2, p2, 0x8

    .line 10
    .line 11
    if-eqz p2, :cond_1

    .line 12
    .line 13
    move p1, v1

    .line 14
    :cond_1
    const/4 p2, 0x0

    .line 15
    invoke-static {p2, p0, p2, p1}, Lxg/g;->a(IIII)J

    .line 16
    .line 17
    .line 18
    move-result-wide p0

    .line 19
    return-wide p0
.end method

.method public static b0(Lug/a;LHe/f;LLe/c;)Z
    .locals 1

    .line 1
    instance-of v0, p0, Ljava/util/concurrent/Callable;

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    :try_start_0
    check-cast p0, Ljava/util/concurrent/Callable;

    .line 7
    .line 8
    invoke-interface {p0}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 12
    if-nez p0, :cond_0

    .line 13
    .line 14
    invoke-static {p1}, LYe/d;->a(LHe/f;)V

    .line 15
    .line 16
    .line 17
    return v0

    .line 18
    :cond_0
    :try_start_1
    invoke-interface {p2, p0}, LLe/c;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    const-string p2, "The mapper returned a null Publisher"

    .line 23
    .line 24
    invoke-static {p0, p2}, LNe/b;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    check-cast p0, Lug/a;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 28
    .line 29
    instance-of p2, p0, Ljava/util/concurrent/Callable;

    .line 30
    .line 31
    if-eqz p2, :cond_2

    .line 32
    .line 33
    :try_start_2
    check-cast p0, Ljava/util/concurrent/Callable;

    .line 34
    .line 35
    invoke-interface {p0}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 39
    if-nez p0, :cond_1

    .line 40
    .line 41
    invoke-static {p1}, LYe/d;->a(LHe/f;)V

    .line 42
    .line 43
    .line 44
    return v0

    .line 45
    :cond_1
    new-instance p2, LYe/e;

    .line 46
    .line 47
    invoke-direct {p2, p1, p0}, LYe/e;-><init>(LHe/f;Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    invoke-interface {p1, p2}, LHe/f;->e(Lug/b;)V

    .line 51
    .line 52
    .line 53
    return v0

    .line 54
    :catchall_0
    move-exception p0

    .line 55
    invoke-static {p0}, Lp7/b;->U(Ljava/lang/Throwable;)V

    .line 56
    .line 57
    .line 58
    invoke-static {p0, p1}, LYe/d;->b(Ljava/lang/Throwable;LHe/f;)V

    .line 59
    .line 60
    .line 61
    return v0

    .line 62
    :cond_2
    invoke-interface {p0, p1}, Lug/a;->a(LHe/f;)V

    .line 63
    .line 64
    .line 65
    return v0

    .line 66
    :catchall_1
    move-exception p0

    .line 67
    invoke-static {p0}, Lp7/b;->U(Ljava/lang/Throwable;)V

    .line 68
    .line 69
    .line 70
    invoke-static {p0, p1}, LYe/d;->b(Ljava/lang/Throwable;LHe/f;)V

    .line 71
    .line 72
    .line 73
    return v0

    .line 74
    :catchall_2
    move-exception p0

    .line 75
    invoke-static {p0}, Lp7/b;->U(Ljava/lang/Throwable;)V

    .line 76
    .line 77
    .line 78
    invoke-static {p0, p1}, LYe/d;->b(Ljava/lang/Throwable;LHe/f;)V

    .line 79
    .line 80
    .line 81
    return v0

    .line 82
    :cond_3
    const/4 p0, 0x0

    .line 83
    return p0
.end method

.method public static final c(Ljava/lang/String;)LJd/H;
    .locals 1

    .line 1
    const-string v0, "urlString"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, LJd/B;

    .line 7
    .line 8
    invoke-direct {v0}, LJd/B;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-static {v0, p0}, LJd/C;->b(LJd/B;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, LJd/B;->b()LJd/H;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method

.method public static c0(Lka/C1;Lvf/a;)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Lka/C1;->v()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, LA/f;->f(I)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/16 v1, 0x19

    .line 10
    .line 11
    const/4 v2, 0x5

    .line 12
    const/16 v3, 0xf

    .line 13
    .line 14
    const-wide/16 v4, 0x2

    .line 15
    .line 16
    packed-switch v0, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 20
    .line 21
    invoke-virtual {p0}, Lka/C1;->v()I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    invoke-static {p0}, Lka/n;->t(I)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    const-string v0, "unknown index value type "

    .line 30
    .line 31
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw p1

    .line 39
    :pswitch_0
    sget-object v0, Ls9/p;->a:Lka/C1;

    .line 40
    .line 41
    invoke-virtual {p0}, Lka/C1;->s()Lka/p0;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {v0}, Lka/p0;->getFieldsMap()Ljava/util/Map;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    const-string v2, "__type__"

    .line 50
    .line 51
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    sget-object v2, Ls9/p;->d:Lka/C1;

    .line 56
    .line 57
    invoke-virtual {v2, v0}, Lcom/google/protobuf/GeneratedMessageLite;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-eqz v0, :cond_0

    .line 62
    .line 63
    const p0, 0x7fffffff

    .line 64
    .line 65
    .line 66
    int-to-long v0, p0

    .line 67
    invoke-virtual {p1, v0, v1}, Lvf/a;->T(J)V

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :cond_0
    invoke-static {p0}, Ls9/p;->j(Lka/C1;)Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-eqz v0, :cond_1

    .line 76
    .line 77
    invoke-virtual {p0}, Lka/C1;->s()Lka/p0;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    invoke-virtual {p0}, Lka/p0;->getFieldsMap()Ljava/util/Map;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    const/16 v0, 0x35

    .line 86
    .line 87
    int-to-long v4, v0

    .line 88
    invoke-virtual {p1, v4, v5}, Lvf/a;->T(J)V

    .line 89
    .line 90
    .line 91
    const-string v0, "value"

    .line 92
    .line 93
    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    check-cast v2, Lka/C1;

    .line 98
    .line 99
    invoke-virtual {v2}, Lka/C1;->m()Lka/g;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    invoke-virtual {v2}, Lka/g;->getValuesCount()I

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    int-to-long v3, v3

    .line 108
    invoke-virtual {p1, v3, v4}, Lvf/a;->T(J)V

    .line 109
    .line 110
    .line 111
    int-to-long v2, v2

    .line 112
    invoke-virtual {p1, v2, v3}, Lvf/a;->T(J)V

    .line 113
    .line 114
    .line 115
    int-to-long v1, v1

    .line 116
    invoke-virtual {p1, v1, v2}, Lvf/a;->T(J)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {p1, v0}, Lvf/a;->U(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    check-cast p0, Lka/C1;

    .line 127
    .line 128
    invoke-static {p0, p1}, Lxg/g;->c0(Lka/C1;Lvf/a;)V

    .line 129
    .line 130
    .line 131
    return-void

    .line 132
    :cond_1
    invoke-virtual {p0}, Lka/C1;->s()Lka/p0;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    const/16 v0, 0x37

    .line 137
    .line 138
    int-to-long v2, v0

    .line 139
    invoke-virtual {p1, v2, v3}, Lvf/a;->T(J)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {p0}, Lka/p0;->getFieldsMap()Ljava/util/Map;

    .line 143
    .line 144
    .line 145
    move-result-object p0

    .line 146
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 155
    .line 156
    .line 157
    move-result v0

    .line 158
    if-eqz v0, :cond_2

    .line 159
    .line 160
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    check-cast v0, Ljava/util/Map$Entry;

    .line 165
    .line 166
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    check-cast v2, Ljava/lang/String;

    .line 171
    .line 172
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    check-cast v0, Lka/C1;

    .line 177
    .line 178
    int-to-long v6, v1

    .line 179
    invoke-virtual {p1, v6, v7}, Lvf/a;->T(J)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {p1, v2}, Lvf/a;->U(Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    invoke-static {v0, p1}, Lxg/g;->c0(Lka/C1;Lvf/a;)V

    .line 186
    .line 187
    .line 188
    goto :goto_0

    .line 189
    :cond_2
    invoke-virtual {p1, v4, v5}, Lvf/a;->T(J)V

    .line 190
    .line 191
    .line 192
    return-void

    .line 193
    :pswitch_1
    invoke-virtual {p0}, Lka/C1;->m()Lka/g;

    .line 194
    .line 195
    .line 196
    move-result-object p0

    .line 197
    const/16 v0, 0x32

    .line 198
    .line 199
    int-to-long v0, v0

    .line 200
    invoke-virtual {p1, v0, v1}, Lvf/a;->T(J)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {p0}, Lka/g;->getValuesList()Ljava/util/List;

    .line 204
    .line 205
    .line 206
    move-result-object p0

    .line 207
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 208
    .line 209
    .line 210
    move-result-object p0

    .line 211
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 212
    .line 213
    .line 214
    move-result v0

    .line 215
    if-eqz v0, :cond_3

    .line 216
    .line 217
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    check-cast v0, Lka/C1;

    .line 222
    .line 223
    invoke-static {v0, p1}, Lxg/g;->c0(Lka/C1;Lvf/a;)V

    .line 224
    .line 225
    .line 226
    goto :goto_1

    .line 227
    :cond_3
    invoke-virtual {p1, v4, v5}, Lvf/a;->T(J)V

    .line 228
    .line 229
    .line 230
    return-void

    .line 231
    :pswitch_2
    invoke-virtual {p0}, Lka/C1;->q()LIa/c;

    .line 232
    .line 233
    .line 234
    move-result-object p0

    .line 235
    const/16 v0, 0x2d

    .line 236
    .line 237
    int-to-long v0, v0

    .line 238
    invoke-virtual {p1, v0, v1}, Lvf/a;->T(J)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {p0}, LIa/c;->e()D

    .line 242
    .line 243
    .line 244
    move-result-wide v0

    .line 245
    invoke-virtual {p1, v0, v1}, Lvf/a;->R(D)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {p0}, LIa/c;->f()D

    .line 249
    .line 250
    .line 251
    move-result-wide v0

    .line 252
    invoke-virtual {p1, v0, v1}, Lvf/a;->R(D)V

    .line 253
    .line 254
    .line 255
    return-void

    .line 256
    :pswitch_3
    invoke-virtual {p0}, Lka/C1;->t()Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object p0

    .line 260
    const/16 v0, 0x25

    .line 261
    .line 262
    int-to-long v0, v0

    .line 263
    invoke-virtual {p1, v0, v1}, Lvf/a;->T(J)V

    .line 264
    .line 265
    .line 266
    invoke-static {p0}, Ls9/m;->l(Ljava/lang/String;)Ls9/m;

    .line 267
    .line 268
    .line 269
    move-result-object p0

    .line 270
    iget-object v0, p0, Ls9/e;->a:Ljava/util/List;

    .line 271
    .line 272
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 273
    .line 274
    .line 275
    move-result v0

    .line 276
    :goto_2
    if-ge v2, v0, :cond_4

    .line 277
    .line 278
    invoke-virtual {p0, v2}, Ls9/e;->g(I)Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object v1

    .line 282
    const/16 v3, 0x3c

    .line 283
    .line 284
    int-to-long v3, v3

    .line 285
    invoke-virtual {p1, v3, v4}, Lvf/a;->T(J)V

    .line 286
    .line 287
    .line 288
    invoke-virtual {p1, v1}, Lvf/a;->U(Ljava/lang/String;)V

    .line 289
    .line 290
    .line 291
    add-int/lit8 v2, v2, 0x1

    .line 292
    .line 293
    goto :goto_2

    .line 294
    :cond_4
    return-void

    .line 295
    :pswitch_4
    const/16 v0, 0x1e

    .line 296
    .line 297
    int-to-long v0, v0

    .line 298
    invoke-virtual {p1, v0, v1}, Lvf/a;->T(J)V

    .line 299
    .line 300
    .line 301
    invoke-virtual {p0}, Lka/C1;->o()Lcom/google/protobuf/ByteString;

    .line 302
    .line 303
    .line 304
    move-result-object p0

    .line 305
    invoke-virtual {p1, p0}, Lvf/a;->Q(Lcom/google/protobuf/ByteString;)V

    .line 306
    .line 307
    .line 308
    invoke-virtual {p1, v4, v5}, Lvf/a;->T(J)V

    .line 309
    .line 310
    .line 311
    return-void

    .line 312
    :pswitch_5
    invoke-virtual {p0}, Lka/C1;->getStringValue()Ljava/lang/String;

    .line 313
    .line 314
    .line 315
    move-result-object p0

    .line 316
    int-to-long v0, v1

    .line 317
    invoke-virtual {p1, v0, v1}, Lvf/a;->T(J)V

    .line 318
    .line 319
    .line 320
    invoke-virtual {p1, p0}, Lvf/a;->U(Ljava/lang/String;)V

    .line 321
    .line 322
    .line 323
    invoke-virtual {p1, v4, v5}, Lvf/a;->T(J)V

    .line 324
    .line 325
    .line 326
    return-void

    .line 327
    :pswitch_6
    invoke-virtual {p0}, Lka/C1;->u()Lcom/google/protobuf/Timestamp;

    .line 328
    .line 329
    .line 330
    move-result-object p0

    .line 331
    const/16 v0, 0x14

    .line 332
    .line 333
    int-to-long v0, v0

    .line 334
    invoke-virtual {p1, v0, v1}, Lvf/a;->T(J)V

    .line 335
    .line 336
    .line 337
    invoke-virtual {p0}, Lcom/google/protobuf/Timestamp;->getSeconds()J

    .line 338
    .line 339
    .line 340
    move-result-wide v0

    .line 341
    invoke-virtual {p1, v0, v1}, Lvf/a;->T(J)V

    .line 342
    .line 343
    .line 344
    invoke-virtual {p0}, Lcom/google/protobuf/Timestamp;->getNanos()I

    .line 345
    .line 346
    .line 347
    move-result p0

    .line 348
    int-to-long v0, p0

    .line 349
    invoke-virtual {p1, v0, v1}, Lvf/a;->T(J)V

    .line 350
    .line 351
    .line 352
    return-void

    .line 353
    :pswitch_7
    invoke-virtual {p0}, Lka/C1;->getDoubleValue()D

    .line 354
    .line 355
    .line 356
    move-result-wide v0

    .line 357
    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    .line 358
    .line 359
    .line 360
    move-result p0

    .line 361
    if-eqz p0, :cond_5

    .line 362
    .line 363
    const/16 p0, 0xd

    .line 364
    .line 365
    int-to-long v0, p0

    .line 366
    invoke-virtual {p1, v0, v1}, Lvf/a;->T(J)V

    .line 367
    .line 368
    .line 369
    return-void

    .line 370
    :cond_5
    int-to-long v2, v3

    .line 371
    invoke-virtual {p1, v2, v3}, Lvf/a;->T(J)V

    .line 372
    .line 373
    .line 374
    const-wide/high16 v2, -0x8000000000000000L

    .line 375
    .line 376
    cmpl-double p0, v0, v2

    .line 377
    .line 378
    if-nez p0, :cond_6

    .line 379
    .line 380
    const-wide/16 v0, 0x0

    .line 381
    .line 382
    invoke-virtual {p1, v0, v1}, Lvf/a;->R(D)V

    .line 383
    .line 384
    .line 385
    return-void

    .line 386
    :cond_6
    invoke-virtual {p1, v0, v1}, Lvf/a;->R(D)V

    .line 387
    .line 388
    .line 389
    return-void

    .line 390
    :pswitch_8
    int-to-long v0, v3

    .line 391
    invoke-virtual {p1, v0, v1}, Lvf/a;->T(J)V

    .line 392
    .line 393
    .line 394
    invoke-virtual {p0}, Lka/C1;->r()J

    .line 395
    .line 396
    .line 397
    move-result-wide v0

    .line 398
    long-to-double v0, v0

    .line 399
    invoke-virtual {p1, v0, v1}, Lvf/a;->R(D)V

    .line 400
    .line 401
    .line 402
    return-void

    .line 403
    :pswitch_9
    const/16 v0, 0xa

    .line 404
    .line 405
    int-to-long v0, v0

    .line 406
    invoke-virtual {p1, v0, v1}, Lvf/a;->T(J)V

    .line 407
    .line 408
    .line 409
    invoke-virtual {p0}, Lka/C1;->n()Z

    .line 410
    .line 411
    .line 412
    move-result p0

    .line 413
    if-eqz p0, :cond_7

    .line 414
    .line 415
    const-wide/16 v0, 0x1

    .line 416
    .line 417
    goto :goto_3

    .line 418
    :cond_7
    const-wide/16 v0, 0x0

    .line 419
    .line 420
    :goto_3
    invoke-virtual {p1, v0, v1}, Lvf/a;->T(J)V

    .line 421
    .line 422
    .line 423
    return-void

    .line 424
    :pswitch_a
    int-to-long v0, v2

    .line 425
    invoke-virtual {p1, v0, v1}, Lvf/a;->T(J)V

    .line 426
    .line 427
    .line 428
    return-void

    .line 429
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static final d(II)F
    .locals 8

    .line 1
    const/high16 v0, -0x80000000

    .line 2
    .line 3
    xor-int/2addr v0, p1

    .line 4
    const v1, -0x7fffffff

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1}, Ljava/lang/Integer;->compare(II)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/high16 v1, 0x3f800000    # 1.0f

    .line 12
    .line 13
    if-gtz v0, :cond_1

    .line 14
    .line 15
    if-nez p0, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    return p0

    .line 19
    :cond_0
    return v1

    .line 20
    :cond_1
    const v0, 0x7fffffff

    .line 21
    .line 22
    .line 23
    and-int v2, p0, v0

    .line 24
    .line 25
    int-to-double v2, v2

    .line 26
    ushr-int/lit8 p0, p0, 0x1f

    .line 27
    .line 28
    shl-int/lit8 p0, p0, 0x1e

    .line 29
    .line 30
    int-to-double v4, p0

    .line 31
    const/4 p0, 0x2

    .line 32
    int-to-double v6, p0

    .line 33
    mul-double/2addr v4, v6

    .line 34
    add-double/2addr v4, v2

    .line 35
    double-to-float p0, v4

    .line 36
    sub-float/2addr p0, v1

    .line 37
    and-int/2addr v0, p1

    .line 38
    int-to-double v2, v0

    .line 39
    ushr-int/lit8 p1, p1, 0x1f

    .line 40
    .line 41
    shl-int/lit8 p1, p1, 0x1e

    .line 42
    .line 43
    int-to-double v4, p1

    .line 44
    mul-double/2addr v4, v6

    .line 45
    add-double/2addr v4, v2

    .line 46
    double-to-float p1, v4

    .line 47
    sub-float/2addr p1, v1

    .line 48
    div-float/2addr p0, p1

    .line 49
    return p0
.end method

.method public static final e(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/I;Landroid/content/Context;Lcom/moloco/sdk/internal/services/events/c;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G0;IILtf/a;Ltf/l;ZLcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/inlineInstall/k;Llf/c;)Ljava/lang/Object;
    .locals 27

    move-object/from16 v0, p0

    move-object/from16 v1, p10

    const/4 v4, 0x0

    instance-of v5, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/u;

    if-eqz v5, :cond_0

    move-object v5, v1

    check-cast v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/u;

    iget v6, v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/u;->k:I

    const/high16 v7, -0x80000000

    and-int v8, v6, v7

    if-eqz v8, :cond_0

    sub-int/2addr v6, v7

    iput v6, v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/u;->k:I

    goto :goto_0

    :cond_0
    new-instance v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/u;

    .line 1
    invoke-direct {v5, v1}, Llf/c;-><init>(Ljf/c;)V

    .line 2
    :goto_0
    iget-object v1, v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/u;->j:Ljava/lang/Object;

    sget-object v6, Lkf/a;->a:Lkf/a;

    .line 3
    iget v7, v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/u;->k:I

    const/4 v8, 0x0

    const/4 v9, 0x2

    const/4 v10, 0x1

    if-eqz v7, :cond_3

    if-eq v7, v10, :cond_2

    if-ne v7, v9, :cond_1

    iget-object v0, v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/u;->c:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/G;

    iget-object v2, v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/u;->b:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/internal/G;

    iget-object v3, v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/u;->a:Ljava/lang/Object;

    check-cast v3, Lkotlin/jvm/internal/G;

    invoke-static {v1}, LFe/e;->U(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-boolean v0, v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/u;->i:Z

    iget-object v7, v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/u;->h:Lkotlin/jvm/internal/G;

    iget-object v11, v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/u;->g:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/inlineInstall/k;

    iget-object v12, v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/u;->f:Ltf/l;

    iget-object v13, v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/u;->e:Ltf/a;

    iget-object v14, v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/u;->d:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G0;

    iget-object v15, v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/u;->c:Ljava/lang/Object;

    check-cast v15, Lcom/moloco/sdk/internal/services/events/c;

    iget-object v2, v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/u;->b:Ljava/lang/Object;

    check-cast v2, Landroid/content/Context;

    iget-object v3, v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/u;->a:Ljava/lang/Object;

    check-cast v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/I;

    invoke-static {v1}, LFe/e;->U(Ljava/lang/Object;)V

    move-object v9, v14

    move-object v14, v12

    move-object v12, v9

    move v9, v0

    move-object v0, v3

    move-object/from16 v25, v11

    move-object v11, v15

    goto :goto_2

    :cond_3
    invoke-static {v1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 4
    const-string v1, "<this>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    instance-of v1, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/H;

    if-eqz v1, :cond_4

    move-object v1, v0

    check-cast v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/H;

    .line 6
    iget-object v1, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/H;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/A;

    .line 7
    sget-object v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/n;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/n;

    iget-object v3, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/A;->b:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/n;

    if-ne v3, v2, :cond_4

    .line 8
    new-instance v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/r;

    iget-object v1, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/A;->a:Ljava/lang/String;

    move/from16 v3, p4

    move/from16 v7, p5

    invoke-direct {v2, v1, v3, v7}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/r;-><init>(Ljava/lang/String;II)V

    goto :goto_1

    :cond_4
    move-object v2, v8

    :goto_1
    if-eqz v2, :cond_5

    .line 9
    new-instance v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/t;

    invoke-direct {v0, v2, v8}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/t;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/s;LVa/Za;)V

    return-object v0

    .line 10
    :cond_5
    new-instance v7, Lkotlin/jvm/internal/G;

    .line 11
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 12
    sget-object v1, LEf/S;->a:LLf/e;

    .line 13
    new-instance v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/v;

    invoke-direct {v2, v7, v0, v8}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/v;-><init>(Lkotlin/jvm/internal/G;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/I;Ljf/c;)V

    iput-object v0, v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/u;->a:Ljava/lang/Object;

    move-object/from16 v3, p1

    iput-object v3, v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/u;->b:Ljava/lang/Object;

    move-object/from16 v11, p2

    iput-object v11, v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/u;->c:Ljava/lang/Object;

    move-object/from16 v12, p3

    iput-object v12, v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/u;->d:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G0;

    move-object/from16 v13, p6

    iput-object v13, v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/u;->e:Ltf/a;

    move-object/from16 v14, p7

    iput-object v14, v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/u;->f:Ltf/l;

    move-object/from16 v15, p9

    iput-object v15, v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/u;->g:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/inlineInstall/k;

    iput-object v7, v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/u;->h:Lkotlin/jvm/internal/G;

    move/from16 v9, p8

    iput-boolean v9, v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/u;->i:Z

    iput v10, v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/u;->k:I

    invoke-static {v1, v2, v5}, LEf/H;->P(Ljf/h;Ltf/p;Ljf/c;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v6, :cond_6

    goto/16 :goto_5

    :cond_6
    move-object v2, v3

    move-object/from16 v25, v15

    .line 14
    :goto_2
    new-instance v3, Lkotlin/jvm/internal/G;

    .line 15
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 16
    new-instance v1, Lkotlin/jvm/internal/G;

    .line 17
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 18
    new-instance v15, Lkotlin/jvm/internal/G;

    .line 19
    invoke-direct {v15}, Ljava/lang/Object;-><init>()V

    .line 20
    iget-object v7, v7, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    move-object/from16 v18, v7

    check-cast v18, Ljava/lang/String;

    if-nez v18, :cond_c

    .line 21
    new-instance v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/staticrenderer/g;

    .line 22
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    const-string v6, "getApplicationContext(...)"

    invoke-static {v2, v6}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    new-instance v6, Lcom/moloco/sdk/internal/services/B;

    invoke-direct {v6, v12, v11}, Lcom/moloco/sdk/internal/services/B;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G0;Lcom/moloco/sdk/internal/services/events/c;)V

    .line 24
    new-instance v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/s;

    invoke-direct {v7}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/s;-><init>()V

    const/16 v9, 0x32

    const/4 v11, 0x0

    move-object/from16 p1, v2

    move-object/from16 p0, v5

    move-object/from16 p2, v6

    move-object/from16 p3, v7

    move/from16 p5, v9

    move/from16 p4, v11

    .line 25
    invoke-direct/range {p0 .. p5}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/staticrenderer/g;-><init>(Landroid/content/Context;Lcom/moloco/sdk/internal/services/B;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/s;ZI)V

    .line 26
    iput-object v5, v1, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 27
    sget-object v2, LEf/S;->a:LLf/e;

    .line 28
    sget-object v2, LJf/n;->a:LFf/e;

    .line 29
    invoke-static {v2}, LEf/H;->c(Ljf/h;)LKd/a;

    move-result-object v2

    .line 30
    iput-object v2, v15, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 31
    invoke-virtual {v5}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/staticrenderer/g;->getClickthroughEvent()LHf/g0;

    move-result-object v6

    .line 32
    new-instance v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/w;

    invoke-direct {v7, v13, v8}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/w;-><init>(Ltf/a;Ljf/c;)V

    .line 33
    new-instance v9, LHf/Z;

    invoke-direct {v9, v6, v7, v4}, LHf/Z;-><init>(LHf/l;Ljava/lang/Object;I)V

    .line 34
    invoke-static {v9, v2}, LHf/k0;->u(LHf/l;LEf/E;)LEf/H0;

    .line 35
    new-instance v6, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/y;

    invoke-direct {v6, v5, v14, v8}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/y;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/staticrenderer/g;Ltf/l;Ljf/c;)V

    const/4 v7, 0x3

    invoke-static {v2, v8, v6, v7}, LEf/H;->D(LEf/E;Ljf/h;Ltf/p;I)LEf/H0;

    .line 36
    const-string v2, "vastResource"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    instance-of v2, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/H;

    if-eqz v2, :cond_9

    .line 38
    check-cast v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/H;

    .line 39
    iget-object v0, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/H;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/A;

    .line 40
    sget-object v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/C;->a:[I

    iget-object v6, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/A;->b:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/n;

    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    aget v2, v2, v6

    iget-object v0, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/A;->a:Ljava/lang/String;

    if-eq v2, v10, :cond_8

    const/4 v6, 0x2

    if-ne v2, v6, :cond_7

    .line 41
    const-string v2, "<script src=\""

    const-string v4, "\"></script>"

    .line 42
    :goto_3
    invoke-static {v2, v0, v4}, LA7/p0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_4

    .line 43
    :cond_7
    new-instance v0, LE5/Q;

    const/16 v1, 0x9

    .line 44
    invoke-direct {v0, v4, v1}, LE5/Q;-><init>(BI)V

    .line 45
    throw v0

    .line 46
    :cond_8
    const-string v2, "<html><head></head><body style=\"margin:0;padding:0\"><img src=\""

    .line 47
    const-string v4, "\" width=\"100%\" style=\"max-width:100%;max-height:100%;\" /></body></html>"

    goto :goto_3

    .line 48
    :cond_9
    instance-of v2, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/F;

    if-eqz v2, :cond_a

    .line 49
    check-cast v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/F;

    .line 50
    iget-object v0, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/F;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/o;

    iget-object v0, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/o;->a:Ljava/lang/String;

    goto :goto_4

    .line 51
    :cond_a
    instance-of v2, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/G;

    if-eqz v2, :cond_b

    .line 52
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "<iframe frameborder=\"0\" scrolling=\"no\" marginheight=\"0\" marginwidth=\"0\" style=\"border: 0px; margin: 0px;\" width=100% height=100% src=\""

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 53
    check-cast v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/G;

    .line 54
    iget-object v0, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/G;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/p;

    iget-object v0, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/p;->a:Ljava/lang/String;

    .line 55
    const-string v4, "\"></iframe>"

    .line 56
    invoke-static {v2, v0, v4}, Lwg/b;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 57
    :goto_4
    :try_start_0
    invoke-virtual {v5}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/t0;->getHtmlCssFixer()Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/l;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v2, "toHtml"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    const-string v2, "\n        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, user-scalable=no\"> \n        <style> body { margin:0; padding:0; overflow:hidden; } </style>\n        "

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 59
    invoke-static {v5, v0}, Lcom/moloco/sdk/internal/publisher/H;->L(Landroid/webkit/WebView;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_7

    :catch_0
    move-exception v0

    .line 60
    sget-object v2, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    const/16 v6, 0x8

    const/4 v7, 0x0

    const-string v9, "BaseWebView"

    const/4 v10, 0x0

    move-object/from16 p3, v0

    move-object/from16 p0, v2

    move-object/from16 p2, v4

    move/from16 p5, v6

    move-object/from16 p6, v7

    move-object/from16 p1, v9

    move/from16 p4, v10

    invoke-static/range {p0 .. p6}, Lcom/moloco/sdk/internal/MolocoLogger;->error$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    goto/16 :goto_7

    .line 61
    :cond_b
    new-instance v0, LE5/Q;

    const/16 v1, 0x9

    .line 62
    invoke-direct {v0, v4, v1}, LE5/Q;-><init>(BI)V

    .line 63
    throw v0

    .line 64
    :cond_c
    new-instance v16, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/w;

    .line 65
    new-instance v0, Lcom/moloco/sdk/service_locator/h;

    const/16 v4, 0xe

    invoke-direct {v0, v4}, Lcom/moloco/sdk/service_locator/h;-><init>(I)V

    new-instance v7, Lcom/moloco/sdk/service_locator/h;

    invoke-direct {v7, v4}, Lcom/moloco/sdk/service_locator/h;-><init>(I)V

    .line 66
    sget-object v4, LEf/S;->a:LLf/e;

    .line 67
    sget-object v4, LJf/n;->a:LFf/e;

    .line 68
    invoke-static {v4}, LEf/H;->c(Ljf/h;)LKd/a;

    move-result-object v4

    .line 69
    const-string v10, "context"

    invoke-static {v2, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 70
    new-instance v10, LK8/H;

    invoke-direct {v10, v2, v4, v9}, LK8/H;-><init>(Landroid/content/Context;LKd/a;Z)V

    const/16 v26, 0x400

    move-object/from16 v19, v0

    move-object/from16 v17, v2

    move-object/from16 v20, v7

    move-object/from16 v24, v10

    move-object/from16 v23, v12

    move-object/from16 v21, v13

    move-object/from16 v22, v14

    .line 71
    invoke-direct/range {v16 .. v26}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/w;-><init>(Landroid/content/Context;Ljava/lang/String;Ltf/a;Ltf/a;Ltf/a;Ltf/l;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G0;LK8/H;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/inlineInstall/k;I)V

    move-object/from16 v0, v16

    iput-object v0, v3, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 72
    iput-object v3, v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/u;->a:Ljava/lang/Object;

    iput-object v1, v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/u;->b:Ljava/lang/Object;

    iput-object v15, v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/u;->c:Ljava/lang/Object;

    iput-object v8, v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/u;->d:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G0;

    iput-object v8, v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/u;->e:Ltf/a;

    iput-object v8, v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/u;->f:Ltf/l;

    iput-object v8, v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/u;->g:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/inlineInstall/k;

    iput-object v8, v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/u;->h:Lkotlin/jvm/internal/G;

    const/4 v2, 0x2

    iput v2, v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/u;->k:I

    invoke-virtual {v0, v5}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/w;->e(Llf/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v6, :cond_d

    :goto_5
    return-object v6

    :cond_d
    move-object v2, v1

    move-object v1, v0

    move-object v0, v15

    .line 73
    :goto_6
    instance-of v4, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/t0;

    if-eqz v4, :cond_e

    move-object v5, v1

    check-cast v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/t0;

    move-object v15, v0

    move-object v1, v2

    goto :goto_7

    :cond_e
    move-object v15, v0

    move-object v1, v2

    move-object v5, v8

    :goto_7
    if-eqz v5, :cond_f

    .line 74
    sget-object v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/Z;->a:Ljava/util/LinkedHashMap;

    .line 75
    invoke-virtual {v5}, Ljava/lang/Object;->hashCode()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    .line 76
    sget-object v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/Z;->a:Ljava/util/LinkedHashMap;

    invoke-interface {v4, v2, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    new-instance v2, Ljava/lang/Integer;

    invoke-direct {v2, v0}, Ljava/lang/Integer;-><init>(I)V

    goto :goto_8

    :cond_f
    move-object v2, v8

    .line 78
    :goto_8
    new-instance v0, LVa/Za;

    invoke-direct {v0, v2, v3, v1, v15}, LVa/Za;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    if-eqz v2, :cond_10

    .line 79
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v1

    .line 80
    new-instance v8, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/t;

    .line 81
    new-instance v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/q;

    invoke-direct {v2, v1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/q;-><init>(I)V

    .line 82
    invoke-direct {v8, v2, v0}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/t;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/s;LVa/Za;)V

    :cond_10
    return-object v8
.end method

.method public static final f(Ltf/a;)Ljava/lang/String;
    .locals 2

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    invoke-interface {p0}, Ltf/a;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/l;

    .line 8
    .line 9
    const-string v0, "toLowerCase(...)"

    .line 10
    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 20
    .line 21
    invoke-virtual {p0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    :goto_0
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    return-object p0

    .line 29
    :cond_0
    sget-object p0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 30
    .line 31
    const-string v1, "UNKNOWN"

    .line 32
    .line 33
    invoke-virtual {v1, p0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    const/4 p0, 0x0

    .line 39
    return-object p0
.end method

.method public static final g(Lcom/moloco/sdk/acm/h;Ltf/a;)V
    .locals 1

    .line 1
    invoke-static {p1}, Lxg/g;->f(Ltf/a;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    sget-object v0, Lcom/moloco/sdk/internal/client_metrics_data/b;->a:[Lcom/moloco/sdk/internal/client_metrics_data/b;

    .line 8
    .line 9
    const-string v0, "creative_type"

    .line 10
    .line 11
    invoke-virtual {p0, v0, p1}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public static final h(Lcom/moloco/sdk/internal/ortb/model/D;IILtf/a;LN/o;I)V
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v9, p3

    .line 4
    .line 5
    move-object/from16 v13, p4

    .line 6
    .line 7
    move/from16 v0, p5

    .line 8
    .line 9
    const-string v2, "countDownTimer"

    .line 10
    .line 11
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-string v2, "onTimerFinish"

    .line 15
    .line 16
    invoke-static {v9, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const v2, -0x5f5cb83b

    .line 20
    .line 21
    .line 22
    invoke-virtual {v13, v2}, LN/o;->N(I)LN/o;

    .line 23
    .line 24
    .line 25
    and-int/lit8 v2, v0, 0x6

    .line 26
    .line 27
    if-nez v2, :cond_1

    .line 28
    .line 29
    invoke-virtual {v13, v1}, LN/o;->e(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_0

    .line 34
    .line 35
    const/4 v2, 0x4

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    const/4 v2, 0x2

    .line 38
    :goto_0
    or-int/2addr v2, v0

    .line 39
    goto :goto_1

    .line 40
    :cond_1
    move v2, v0

    .line 41
    :goto_1
    and-int/lit8 v3, v0, 0x30

    .line 42
    .line 43
    move/from16 v11, p1

    .line 44
    .line 45
    if-nez v3, :cond_3

    .line 46
    .line 47
    invoke-virtual {v13, v11}, LN/o;->c(I)Z

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    if-eqz v3, :cond_2

    .line 52
    .line 53
    const/16 v3, 0x20

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_2
    const/16 v3, 0x10

    .line 57
    .line 58
    :goto_2
    or-int/2addr v2, v3

    .line 59
    :cond_3
    and-int/lit16 v3, v0, 0x180

    .line 60
    .line 61
    move/from16 v12, p2

    .line 62
    .line 63
    if-nez v3, :cond_5

    .line 64
    .line 65
    invoke-virtual {v13, v12}, LN/o;->c(I)Z

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    if-eqz v3, :cond_4

    .line 70
    .line 71
    const/16 v3, 0x100

    .line 72
    .line 73
    goto :goto_3

    .line 74
    :cond_4
    const/16 v3, 0x80

    .line 75
    .line 76
    :goto_3
    or-int/2addr v2, v3

    .line 77
    :cond_5
    and-int/lit16 v3, v0, 0xc00

    .line 78
    .line 79
    if-nez v3, :cond_7

    .line 80
    .line 81
    invoke-virtual {v13, v9}, LN/o;->e(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    if-eqz v3, :cond_6

    .line 86
    .line 87
    const/16 v3, 0x800

    .line 88
    .line 89
    goto :goto_4

    .line 90
    :cond_6
    const/16 v3, 0x400

    .line 91
    .line 92
    :goto_4
    or-int/2addr v2, v3

    .line 93
    :cond_7
    and-int/lit16 v3, v2, 0x493

    .line 94
    .line 95
    const/16 v4, 0x492

    .line 96
    .line 97
    if-ne v3, v4, :cond_9

    .line 98
    .line 99
    invoke-virtual {v13}, LN/o;->x()Z

    .line 100
    .line 101
    .line 102
    move-result v3

    .line 103
    if-nez v3, :cond_8

    .line 104
    .line 105
    goto :goto_5

    .line 106
    :cond_8
    invoke-virtual {v13}, LN/o;->I()V

    .line 107
    .line 108
    .line 109
    goto/16 :goto_9

    .line 110
    .line 111
    :cond_9
    :goto_5
    iget v3, v1, Lcom/moloco/sdk/internal/ortb/model/D;->c:I

    .line 112
    .line 113
    int-to-float v3, v3

    .line 114
    invoke-static {v3, v3}, LA6/c;->b(FF)J

    .line 115
    .line 116
    .line 117
    move-result-wide v3

    .line 118
    iget-object v5, v1, Lcom/moloco/sdk/internal/ortb/model/D;->e:Lcom/moloco/sdk/internal/ortb/model/X;

    .line 119
    .line 120
    iget-object v6, v1, Lcom/moloco/sdk/internal/ortb/model/D;->f:Lcom/moloco/sdk/internal/ortb/model/k;

    .line 121
    .line 122
    invoke-static {v5, v6}, Lcom/moloco/sdk/internal/i;->b(Lcom/moloco/sdk/internal/ortb/model/X;Lcom/moloco/sdk/internal/ortb/model/k;)LZ/d;

    .line 123
    .line 124
    .line 125
    move-result-object v5

    .line 126
    sget-object v6, LZ/i;->a:LZ/i;

    .line 127
    .line 128
    invoke-static {v6}, LE/L;->a(LZ/k;)LZ/k;

    .line 129
    .line 130
    .line 131
    move-result-object v7

    .line 132
    const v8, 0x2bb5b5d7

    .line 133
    .line 134
    .line 135
    invoke-virtual {v13, v8}, LN/o;->M(I)V

    .line 136
    .line 137
    .line 138
    const/4 v15, 0x0

    .line 139
    invoke-static {v5, v15, v13}, LE/p;->c(LZ/d;ZLN/o;)Lr0/n;

    .line 140
    .line 141
    .line 142
    move-result-object v5

    .line 143
    const v8, -0x4ee9b9da

    .line 144
    .line 145
    .line 146
    invoke-virtual {v13, v8}, LN/o;->M(I)V

    .line 147
    .line 148
    .line 149
    sget-object v8, Lu0/M;->e:LN/L0;

    .line 150
    .line 151
    invoke-virtual {v13, v8}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v8

    .line 155
    check-cast v8, LL0/b;

    .line 156
    .line 157
    sget-object v10, Lu0/M;->k:LN/L0;

    .line 158
    .line 159
    invoke-virtual {v13, v10}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v10

    .line 163
    check-cast v10, LL0/i;

    .line 164
    .line 165
    sget-object v14, Lu0/M;->o:LN/L0;

    .line 166
    .line 167
    invoke-virtual {v13, v14}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v14

    .line 171
    check-cast v14, Lu0/p0;

    .line 172
    .line 173
    sget-object v16, Lt0/c;->g9:Lt0/b;

    .line 174
    .line 175
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    sget-object v15, Lt0/b;->b:Lt0/d;

    .line 179
    .line 180
    invoke-static {v7}, LS3/f;->y(LZ/k;)LV/d;

    .line 181
    .line 182
    .line 183
    move-result-object v7

    .line 184
    invoke-virtual {v13}, LN/o;->O()V

    .line 185
    .line 186
    .line 187
    iget-boolean v0, v13, LN/o;->O:Z

    .line 188
    .line 189
    if-eqz v0, :cond_a

    .line 190
    .line 191
    invoke-virtual {v13, v15}, LN/o;->k(Ltf/a;)V

    .line 192
    .line 193
    .line 194
    :goto_6
    const/4 v0, 0x0

    .line 195
    goto :goto_7

    .line 196
    :cond_a
    invoke-virtual {v13}, LN/o;->X()V

    .line 197
    .line 198
    .line 199
    goto :goto_6

    .line 200
    :goto_7
    iput-boolean v0, v13, LN/o;->x:Z

    .line 201
    .line 202
    sget-object v0, Lt0/b;->e:Lt0/a;

    .line 203
    .line 204
    invoke-static {v13, v5, v0}, LN/d;->M(LN/o;Ljava/lang/Object;Ltf/p;)V

    .line 205
    .line 206
    .line 207
    sget-object v0, Lt0/b;->d:Lt0/a;

    .line 208
    .line 209
    invoke-static {v13, v8, v0}, LN/d;->M(LN/o;Ljava/lang/Object;Ltf/p;)V

    .line 210
    .line 211
    .line 212
    sget-object v0, Lt0/b;->f:Lt0/a;

    .line 213
    .line 214
    invoke-static {v13, v10, v0}, LN/d;->M(LN/o;Ljava/lang/Object;Ltf/p;)V

    .line 215
    .line 216
    .line 217
    sget-object v0, Lt0/b;->g:Lt0/a;

    .line 218
    .line 219
    invoke-static {v13, v14, v0, v13}, Lwg/b;->b(LN/o;Lu0/p0;Lt0/a;LN/o;)LN/u0;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    const v5, 0x7ab4aae9

    .line 224
    .line 225
    .line 226
    const/4 v8, 0x0

    .line 227
    invoke-static {v8, v7, v0, v13, v5}, Lwg/b;->d(ILV/d;LN/u0;LN/o;I)V

    .line 228
    .line 229
    .line 230
    const v0, -0x7f65a980

    .line 231
    .line 232
    .line 233
    invoke-virtual {v13, v0}, LN/o;->M(I)V

    .line 234
    .line 235
    .line 236
    sget-object v0, LN/k;->a:LN/P;

    .line 237
    .line 238
    iget-boolean v5, v1, Lcom/moloco/sdk/internal/ortb/model/D;->b:Z

    .line 239
    .line 240
    move-wide v14, v3

    .line 241
    move v4, v2

    .line 242
    iget-wide v2, v1, Lcom/moloco/sdk/internal/ortb/model/D;->h:J

    .line 243
    .line 244
    move v10, v4

    .line 245
    move/from16 v17, v5

    .line 246
    .line 247
    iget-wide v4, v1, Lcom/moloco/sdk/internal/ortb/model/D;->g:J

    .line 248
    .line 249
    if-eqz v17, :cond_d

    .line 250
    .line 251
    const/high16 v17, 0xe000000

    .line 252
    .line 253
    const v7, 0x7b3e17f5

    .line 254
    .line 255
    .line 256
    invoke-virtual {v13, v7}, LN/o;->M(I)V

    .line 257
    .line 258
    .line 259
    const v7, -0xc8a3814

    .line 260
    .line 261
    .line 262
    invoke-virtual {v13, v7}, LN/o;->M(I)V

    .line 263
    .line 264
    .line 265
    const-string v7, "rewarded_countdown_timer"

    .line 266
    .line 267
    invoke-virtual {v13, v7}, LN/o;->e(Ljava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    move-result v7

    .line 271
    const/high16 v18, 0x70000

    .line 272
    .line 273
    invoke-virtual {v13}, LN/o;->F()Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object v8

    .line 277
    if-nez v7, :cond_b

    .line 278
    .line 279
    if-ne v8, v0, :cond_c

    .line 280
    .line 281
    :cond_b
    new-instance v8, Lcom/moloco/sdk/internal/publisher/d;

    .line 282
    .line 283
    const/16 v0, 0xb

    .line 284
    .line 285
    invoke-direct {v8, v0}, Lcom/moloco/sdk/internal/publisher/d;-><init>(I)V

    .line 286
    .line 287
    .line 288
    invoke-virtual {v13, v8}, LN/o;->U(Ljava/lang/Object;)V

    .line 289
    .line 290
    .line 291
    :cond_c
    check-cast v8, Ltf/l;

    .line 292
    .line 293
    const/4 v0, 0x0

    .line 294
    invoke-virtual {v13, v0}, LN/o;->p(Z)V

    .line 295
    .line 296
    .line 297
    invoke-static {v6, v0, v8}, LFe/g;->J(LZ/k;ZLtf/l;)LZ/k;

    .line 298
    .line 299
    .line 300
    move-result-object v6

    .line 301
    invoke-static {v14, v15}, LL0/f;->b(J)F

    .line 302
    .line 303
    .line 304
    move-result v8

    .line 305
    shl-int/lit8 v0, v10, 0x6

    .line 306
    .line 307
    and-int v0, v0, v18

    .line 308
    .line 309
    shl-int/lit8 v7, v10, 0x12

    .line 310
    .line 311
    const/high16 v10, 0x1c00000

    .line 312
    .line 313
    and-int/2addr v10, v7

    .line 314
    or-int/2addr v0, v10

    .line 315
    and-int v7, v7, v17

    .line 316
    .line 317
    or-int v14, v0, v7

    .line 318
    .line 319
    const/4 v10, 0x0

    .line 320
    const/4 v7, 0x0

    .line 321
    invoke-static/range {v2 .. v14}, LA6/h;->c(JJLZ/k;FFLtf/a;Landroidx/lifecycle/v;IILN/o;I)V

    .line 322
    .line 323
    .line 324
    const/4 v0, 0x0

    .line 325
    invoke-virtual {v13, v0}, LN/o;->p(Z)V

    .line 326
    .line 327
    .line 328
    const/4 v0, 0x0

    .line 329
    goto :goto_8

    .line 330
    :cond_d
    const/high16 v17, 0xe000000

    .line 331
    .line 332
    const/high16 v18, 0x70000

    .line 333
    .line 334
    iget-object v7, v1, Lcom/moloco/sdk/internal/ortb/model/D;->a:Ljava/lang/String;

    .line 335
    .line 336
    if-eqz v7, :cond_10

    .line 337
    .line 338
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 339
    .line 340
    .line 341
    move-result v7

    .line 342
    if-lez v7, :cond_10

    .line 343
    .line 344
    const v7, 0x7b4a160c

    .line 345
    .line 346
    .line 347
    invoke-virtual {v13, v7}, LN/o;->M(I)V

    .line 348
    .line 349
    .line 350
    const v7, -0xc89cc34

    .line 351
    .line 352
    .line 353
    invoke-virtual {v13, v7}, LN/o;->M(I)V

    .line 354
    .line 355
    .line 356
    const-string v7, "rewarded_countdown_timer_custom"

    .line 357
    .line 358
    invoke-virtual {v13, v7}, LN/o;->e(Ljava/lang/Object;)Z

    .line 359
    .line 360
    .line 361
    move-result v7

    .line 362
    invoke-virtual {v13}, LN/o;->F()Ljava/lang/Object;

    .line 363
    .line 364
    .line 365
    move-result-object v8

    .line 366
    if-nez v7, :cond_e

    .line 367
    .line 368
    if-ne v8, v0, :cond_f

    .line 369
    .line 370
    :cond_e
    new-instance v8, Lcom/moloco/sdk/internal/publisher/d;

    .line 371
    .line 372
    const/16 v0, 0xc

    .line 373
    .line 374
    invoke-direct {v8, v0}, Lcom/moloco/sdk/internal/publisher/d;-><init>(I)V

    .line 375
    .line 376
    .line 377
    invoke-virtual {v13, v8}, LN/o;->U(Ljava/lang/Object;)V

    .line 378
    .line 379
    .line 380
    :cond_f
    check-cast v8, Ltf/l;

    .line 381
    .line 382
    const/4 v0, 0x0

    .line 383
    invoke-virtual {v13, v0}, LN/o;->p(Z)V

    .line 384
    .line 385
    .line 386
    invoke-static {v6, v0, v8}, LFe/g;->J(LZ/k;ZLtf/l;)LZ/k;

    .line 387
    .line 388
    .line 389
    move-result-object v6

    .line 390
    invoke-static {v14, v15}, LL0/f;->b(J)F

    .line 391
    .line 392
    .line 393
    move-result v8

    .line 394
    shl-int/lit8 v7, v10, 0x6

    .line 395
    .line 396
    and-int v7, v7, v18

    .line 397
    .line 398
    shl-int/lit8 v9, v10, 0x15

    .line 399
    .line 400
    and-int v10, v9, v17

    .line 401
    .line 402
    or-int/2addr v7, v10

    .line 403
    const/high16 v10, 0x70000000

    .line 404
    .line 405
    and-int/2addr v9, v10

    .line 406
    or-int v15, v7, v9

    .line 407
    .line 408
    const/4 v7, 0x0

    .line 409
    iget-object v10, v1, Lcom/moloco/sdk/internal/ortb/model/D;->a:Ljava/lang/String;

    .line 410
    .line 411
    const/4 v11, 0x0

    .line 412
    move/from16 v12, p1

    .line 413
    .line 414
    move-object/from16 v9, p3

    .line 415
    .line 416
    move-object v14, v13

    .line 417
    move/from16 v13, p2

    .line 418
    .line 419
    invoke-static/range {v2 .. v15}, LA6/c;->e(JJLZ/k;FFLtf/a;Ljava/lang/String;Landroidx/lifecycle/v;IILN/o;I)V

    .line 420
    .line 421
    .line 422
    move-object v13, v14

    .line 423
    invoke-virtual {v13, v0}, LN/o;->p(Z)V

    .line 424
    .line 425
    .line 426
    goto :goto_8

    .line 427
    :cond_10
    const/4 v0, 0x0

    .line 428
    const v2, 0x7b55cd6b

    .line 429
    .line 430
    .line 431
    invoke-virtual {v13, v2}, LN/o;->M(I)V

    .line 432
    .line 433
    .line 434
    invoke-virtual {v13, v0}, LN/o;->p(Z)V

    .line 435
    .line 436
    .line 437
    :goto_8
    const/4 v2, 0x1

    .line 438
    invoke-static {v13, v0, v0, v2, v0}, Lwg/b;->e(LN/o;ZZZZ)V

    .line 439
    .line 440
    .line 441
    invoke-virtual {v13, v0}, LN/o;->p(Z)V

    .line 442
    .line 443
    .line 444
    :goto_9
    invoke-virtual {v13}, LN/o;->r()LN/i0;

    .line 445
    .line 446
    .line 447
    move-result-object v6

    .line 448
    if-eqz v6, :cond_11

    .line 449
    .line 450
    new-instance v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/rewardedcountdowntimer/a;

    .line 451
    .line 452
    move/from16 v2, p1

    .line 453
    .line 454
    move/from16 v3, p2

    .line 455
    .line 456
    move-object/from16 v4, p3

    .line 457
    .line 458
    move/from16 v5, p5

    .line 459
    .line 460
    invoke-direct/range {v0 .. v5}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/rewardedcountdowntimer/a;-><init>(Lcom/moloco/sdk/internal/ortb/model/D;IILtf/a;I)V

    .line 461
    .line 462
    .line 463
    iput-object v0, v6, LN/i0;->d:Ltf/p;

    .line 464
    .line 465
    :cond_11
    return-void
.end method

.method public static final i(Lc0/g;)V
    .locals 2

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lc0/g;->d:Lc0/r;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x3

    .line 13
    if-eq v0, v1, :cond_1

    .line 14
    .line 15
    const/4 v1, 0x4

    .line 16
    if-eq v0, v1, :cond_0

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    sget-object v0, Lc0/r;->b:Lc0/r;

    .line 20
    .line 21
    invoke-virtual {p0, v0}, Lc0/g;->e0(Lc0/r;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    sget-object v0, Lc0/r;->f:Lc0/r;

    .line 26
    .line 27
    invoke-virtual {p0, v0}, Lc0/g;->e0(Lc0/r;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public static final l(LNd/k;LNd/k;)V
    .locals 2

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "builder"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p1}, LNd/k;->b()Ljava/util/Set;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Ljava/lang/Iterable;

    .line 16
    .line 17
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Ljava/util/Map$Entry;

    .line 32
    .line 33
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    check-cast v1, Ljava/lang/String;

    .line 38
    .line 39
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    check-cast v0, Ljava/util/List;

    .line 44
    .line 45
    check-cast v0, Ljava/lang/Iterable;

    .line 46
    .line 47
    invoke-interface {p0, v1, v0}, LNd/k;->f(Ljava/lang/String;Ljava/lang/Iterable;)V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    return-void
.end method

.method public static final p(Lc0/g;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lc0/g;->e:Lc0/g;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-static {v0, v1}, Lxg/g;->q(Lc0/g;Z)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    iput-object v0, p0, Lc0/g;->e:Lc0/g;

    .line 14
    .line 15
    const/4 p0, 0x1

    .line 16
    return p0

    .line 17
    :cond_0
    return v1

    .line 18
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 19
    .line 20
    const-string v0, "Required value was null."

    .line 21
    .line 22
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw p0
.end method

.method public static final q(Lc0/g;Z)Z
    .locals 4

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lc0/g;->d:Lc0/r;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    sget-object v1, Lc0/r;->f:Lc0/r;

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    if-eqz v0, :cond_7

    .line 16
    .line 17
    if-eq v0, v2, :cond_5

    .line 18
    .line 19
    const/4 v3, 0x2

    .line 20
    if-eq v0, v3, :cond_3

    .line 21
    .line 22
    const/4 p1, 0x3

    .line 23
    if-eq v0, p1, :cond_2

    .line 24
    .line 25
    const/4 p1, 0x4

    .line 26
    if-eq v0, p1, :cond_1

    .line 27
    .line 28
    const/4 p0, 0x5

    .line 29
    if-ne v0, p0, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    new-instance p0, LE5/Q;

    .line 33
    .line 34
    const/16 p1, 0x9

    .line 35
    .line 36
    const/4 v0, 0x0

    .line 37
    invoke-direct {p0, v0, p1}, LE5/Q;-><init>(BI)V

    .line 38
    .line 39
    .line 40
    throw p0

    .line 41
    :cond_1
    invoke-static {p0}, Lxg/g;->p(Lc0/g;)Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    if-eqz p1, :cond_6

    .line 46
    .line 47
    sget-object p1, Lc0/r;->d:Lc0/r;

    .line 48
    .line 49
    invoke-virtual {p0, p1}, Lc0/g;->e0(Lc0/r;)V

    .line 50
    .line 51
    .line 52
    :cond_2
    :goto_0
    return v2

    .line 53
    :cond_3
    if-eqz p1, :cond_4

    .line 54
    .line 55
    invoke-virtual {p0, v1}, Lc0/g;->e0(Lc0/r;)V

    .line 56
    .line 57
    .line 58
    :cond_4
    return p1

    .line 59
    :cond_5
    invoke-static {p0}, Lxg/g;->p(Lc0/g;)Z

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    if-eqz p1, :cond_6

    .line 64
    .line 65
    invoke-virtual {p0, v1}, Lc0/g;->e0(Lc0/r;)V

    .line 66
    .line 67
    .line 68
    return v2

    .line 69
    :cond_6
    const/4 p0, 0x0

    .line 70
    return p0

    .line 71
    :cond_7
    invoke-virtual {p0, v1}, Lc0/g;->e0(Lc0/r;)V

    .line 72
    .line 73
    .line 74
    return v2
.end method

.method public static final r(IIIII)D
    .locals 4

    .line 1
    int-to-double v0, p2

    .line 2
    int-to-double v2, p0

    .line 3
    div-double/2addr v0, v2

    .line 4
    int-to-double p2, p3

    .line 5
    int-to-double p0, p1

    .line 6
    div-double/2addr p2, p0

    .line 7
    invoke-static {p4}, LA/f;->f(I)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-eqz p0, :cond_1

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    if-ne p0, p1, :cond_0

    .line 15
    .line 16
    invoke-static {v0, v1, p2, p3}, Ljava/lang/Math;->min(DD)D

    .line 17
    .line 18
    .line 19
    move-result-wide p0

    .line 20
    return-wide p0

    .line 21
    :cond_0
    new-instance p0, LE5/Q;

    .line 22
    .line 23
    const/16 p1, 0x9

    .line 24
    .line 25
    const/4 p2, 0x0

    .line 26
    invoke-direct {p0, p2, p1}, LE5/Q;-><init>(BI)V

    .line 27
    .line 28
    .line 29
    throw p0

    .line 30
    :cond_1
    invoke-static {v0, v1, p2, p3}, Ljava/lang/Math;->max(DD)D

    .line 31
    .line 32
    .line 33
    move-result-wide p0

    .line 34
    return-wide p0
.end method

.method public static final s(JJ)J
    .locals 3

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    shr-long v0, p2, v0

    .line 4
    .line 5
    long-to-int v0, v0

    .line 6
    invoke-static {p0, p1}, LL0/a;->g(J)I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    invoke-static {p0, p1}, LL0/a;->e(J)I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    invoke-static {v0, v1, v2}, Landroid/support/v4/media/session/b;->S(III)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const-wide v1, 0xffffffffL

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    and-long/2addr p2, v1

    .line 24
    long-to-int p2, p2

    .line 25
    invoke-static {p0, p1}, LL0/a;->f(J)I

    .line 26
    .line 27
    .line 28
    move-result p3

    .line 29
    invoke-static {p0, p1}, LL0/a;->d(J)I

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    invoke-static {p2, p3, p0}, Landroid/support/v4/media/session/b;->S(III)I

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    invoke-static {v0, p0}, LBa/c;->a(II)J

    .line 38
    .line 39
    .line 40
    move-result-wide p0

    .line 41
    return-wide p0
.end method

.method public static final t(IJ)I
    .locals 1

    .line 1
    invoke-static {p1, p2}, LL0/a;->f(J)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p1, p2}, LL0/a;->d(J)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    invoke-static {p0, v0, p1}, Landroid/support/v4/media/session/b;->S(III)I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public static final u(IJ)I
    .locals 1

    .line 1
    invoke-static {p1, p2}, LL0/a;->g(J)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p1, p2}, LL0/a;->e(J)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    invoke-static {p0, v0, p1}, Landroid/support/v4/media/session/b;->S(III)I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public static v(Landroid/os/Looper;)Landroid/os/Handler;
    .locals 7

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x1

    .line 3
    const/4 v2, 0x0

    .line 4
    const/4 v3, 0x3

    .line 5
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 6
    .line 7
    const/16 v5, 0x1c

    .line 8
    .line 9
    if-lt v4, v5, :cond_0

    .line 10
    .line 11
    invoke-static {p0}, LY0/c;->a(Landroid/os/Looper;)Landroid/os/Handler;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :cond_0
    :try_start_0
    const-class v4, Landroid/os/Handler;

    .line 17
    .line 18
    new-array v5, v3, [Ljava/lang/Class;

    .line 19
    .line 20
    const-class v6, Landroid/os/Looper;

    .line 21
    .line 22
    aput-object v6, v5, v2

    .line 23
    .line 24
    const-class v6, Landroid/os/Handler$Callback;

    .line 25
    .line 26
    aput-object v6, v5, v1

    .line 27
    .line 28
    sget-object v6, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 29
    .line 30
    aput-object v6, v5, v0

    .line 31
    .line 32
    invoke-virtual {v4, v5}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    new-array v3, v3, [Ljava/lang/Object;

    .line 37
    .line 38
    aput-object p0, v3, v2

    .line 39
    .line 40
    const/4 v2, 0x0

    .line 41
    aput-object v2, v3, v1

    .line 42
    .line 43
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 44
    .line 45
    aput-object v1, v3, v0

    .line 46
    .line 47
    invoke-virtual {v4, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    check-cast v0, Landroid/os/Handler;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_3

    .line 52
    .line 53
    return-object v0

    .line 54
    :catch_0
    move-exception v0

    .line 55
    goto :goto_0

    .line 56
    :catch_1
    move-exception v0

    .line 57
    goto :goto_0

    .line 58
    :catch_2
    move-exception v0

    .line 59
    goto :goto_0

    .line 60
    :catch_3
    move-exception p0

    .line 61
    invoke-virtual {p0}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    instance-of v0, p0, Ljava/lang/RuntimeException;

    .line 66
    .line 67
    if-nez v0, :cond_2

    .line 68
    .line 69
    instance-of v0, p0, Ljava/lang/Error;

    .line 70
    .line 71
    if-eqz v0, :cond_1

    .line 72
    .line 73
    check-cast p0, Ljava/lang/Error;

    .line 74
    .line 75
    throw p0

    .line 76
    :cond_1
    new-instance v0, Ljava/lang/RuntimeException;

    .line 77
    .line 78
    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 79
    .line 80
    .line 81
    throw v0

    .line 82
    :cond_2
    check-cast p0, Ljava/lang/RuntimeException;

    .line 83
    .line 84
    throw p0

    .line 85
    :goto_0
    const-string v1, "HandlerCompat"

    .line 86
    .line 87
    const-string v2, "Unable to invoke Handler(Looper, Callback, boolean) constructor"

    .line 88
    .line 89
    invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 90
    .line 91
    .line 92
    new-instance v0, Landroid/os/Handler;

    .line 93
    .line 94
    invoke-direct {v0, p0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 95
    .line 96
    .line 97
    return-object v0
.end method

.method public static final w(Lc0/g;)V
    .locals 4

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lc0/g;->d:Lc0/r;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    sget-object v1, Lc0/r;->d:Lc0/r;

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    if-eq v0, v2, :cond_1

    .line 18
    .line 19
    const/4 v3, 0x2

    .line 20
    if-eq v0, v3, :cond_2

    .line 21
    .line 22
    const/4 v2, 0x5

    .line 23
    if-eq v0, v2, :cond_0

    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    invoke-virtual {p0, v1}, Lc0/g;->e0(Lc0/r;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    sget-object v0, Lc0/r;->e:Lc0/r;

    .line 31
    .line 32
    invoke-virtual {p0, v0}, Lc0/g;->e0(Lc0/r;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_2
    iget-object v0, p0, Lc0/g;->k:Lt0/y;

    .line 37
    .line 38
    if-eqz v0, :cond_3

    .line 39
    .line 40
    iget-object v0, v0, Lt0/y;->e:Lt0/t;

    .line 41
    .line 42
    if-eqz v0, :cond_3

    .line 43
    .line 44
    iget-object v0, v0, Lt0/t;->g:Lu0/n;

    .line 45
    .line 46
    if-eqz v0, :cond_3

    .line 47
    .line 48
    invoke-virtual {v0}, Lu0/n;->getFocusManager()Lc0/e;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    if-eqz v0, :cond_3

    .line 53
    .line 54
    check-cast v0, Lb7/k;

    .line 55
    .line 56
    invoke-virtual {v0, v2}, Lb7/k;->p(Z)V

    .line 57
    .line 58
    .line 59
    :cond_3
    invoke-virtual {p0, v1}, Lc0/g;->e0(Lc0/r;)V

    .line 60
    .line 61
    .line 62
    return-void
.end method

.method public static x()Ljava/lang/reflect/InvocationHandler;
    .locals 5

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1c

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    if-lt v0, v1, :cond_0

    .line 8
    .line 9
    invoke-static {}, Llc/f;->h()Ljava/lang/ClassLoader;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    :try_start_0
    const-class v0, Landroid/webkit/WebView;

    .line 15
    .line 16
    const-string v1, "getFactory"

    .line 17
    .line 18
    new-array v4, v3, [Ljava/lang/Class;

    .line 19
    .line 20
    invoke-virtual {v0, v1, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const/4 v1, 0x1

    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 26
    .line 27
    .line 28
    new-array v1, v3, [Ljava/lang/Object;

    .line 29
    .line 30
    invoke-virtual {v0, v2, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 34
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    :goto_0
    const-string v1, "org.chromium.support_lib_glue.SupportLibReflectionUtil"

    .line 43
    .line 44
    invoke-static {v1, v3, v0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    const-string v1, "createWebViewProviderFactory"

    .line 49
    .line 50
    new-array v4, v3, [Ljava/lang/Class;

    .line 51
    .line 52
    invoke-virtual {v0, v1, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    new-array v1, v3, [Ljava/lang/Object;

    .line 57
    .line 58
    invoke-virtual {v0, v2, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    check-cast v0, Ljava/lang/reflect/InvocationHandler;

    .line 63
    .line 64
    return-object v0

    .line 65
    :catch_0
    move-exception v0

    .line 66
    new-instance v1, Ljava/lang/RuntimeException;

    .line 67
    .line 68
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 69
    .line 70
    .line 71
    throw v1
.end method

.method public static y(Ljava/util/Map;)Lm9/A;
    .locals 8

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x1

    .line 3
    const/4 v2, 0x0

    .line 4
    const-string v3, "fieldPath"

    .line 5
    .line 6
    invoke-interface {p0, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v4

    .line 10
    const-string v5, "Invalid operator"

    .line 11
    .line 12
    const-string v6, "op"

    .line 13
    .line 14
    if-eqz v4, :cond_a

    .line 15
    .line 16
    invoke-interface {p0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    check-cast v4, Ljava/lang/String;

    .line 21
    .line 22
    invoke-interface {p0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    check-cast v3, Lm9/r;

    .line 27
    .line 28
    const-string v6, "value"

    .line 29
    .line 30
    invoke-interface {p0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    const/4 v6, -0x1

    .line 38
    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    .line 39
    .line 40
    .line 41
    move-result v7

    .line 42
    sparse-switch v7, :sswitch_data_0

    .line 43
    .line 44
    .line 45
    :goto_0
    move v0, v6

    .line 46
    goto/16 :goto_1

    .line 47
    .line 48
    :sswitch_0
    const-string v0, "array-contains-any"

    .line 49
    .line 50
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-nez v0, :cond_0

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    const/16 v0, 0x9

    .line 58
    .line 59
    goto/16 :goto_1

    .line 60
    .line 61
    :sswitch_1
    const-string v0, "array-contains"

    .line 62
    .line 63
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-nez v0, :cond_1

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_1
    const/16 v0, 0x8

    .line 71
    .line 72
    goto/16 :goto_1

    .line 73
    .line 74
    :sswitch_2
    const-string v0, "in"

    .line 75
    .line 76
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-nez v0, :cond_2

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_2
    const/4 v0, 0x7

    .line 84
    goto :goto_1

    .line 85
    :sswitch_3
    const-string v0, ">="

    .line 86
    .line 87
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    if-nez v0, :cond_3

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_3
    const/4 v0, 0x6

    .line 95
    goto :goto_1

    .line 96
    :sswitch_4
    const-string v0, "=="

    .line 97
    .line 98
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    if-nez v0, :cond_4

    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_4
    const/4 v0, 0x5

    .line 106
    goto :goto_1

    .line 107
    :sswitch_5
    const-string v0, "<="

    .line 108
    .line 109
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    if-nez v0, :cond_5

    .line 114
    .line 115
    goto :goto_0

    .line 116
    :cond_5
    const/4 v0, 0x4

    .line 117
    goto :goto_1

    .line 118
    :sswitch_6
    const-string v0, "!="

    .line 119
    .line 120
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    if-nez v0, :cond_6

    .line 125
    .line 126
    goto :goto_0

    .line 127
    :cond_6
    const/4 v0, 0x3

    .line 128
    goto :goto_1

    .line 129
    :sswitch_7
    const-string v1, ">"

    .line 130
    .line 131
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    if-nez v1, :cond_9

    .line 136
    .line 137
    goto :goto_0

    .line 138
    :sswitch_8
    const-string v0, "<"

    .line 139
    .line 140
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result v0

    .line 144
    if-nez v0, :cond_7

    .line 145
    .line 146
    goto :goto_0

    .line 147
    :cond_7
    move v0, v1

    .line 148
    goto :goto_1

    .line 149
    :sswitch_9
    const-string v0, "not-in"

    .line 150
    .line 151
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result v0

    .line 155
    if-nez v0, :cond_8

    .line 156
    .line 157
    goto :goto_0

    .line 158
    :cond_8
    move v0, v2

    .line 159
    :cond_9
    :goto_1
    packed-switch v0, :pswitch_data_0

    .line 160
    .line 161
    .line 162
    new-instance p0, Ljava/lang/Error;

    .line 163
    .line 164
    invoke-direct {p0, v5}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    throw p0

    .line 168
    :pswitch_0
    check-cast p0, Ljava/util/List;

    .line 169
    .line 170
    new-instance v0, Lm9/z;

    .line 171
    .line 172
    sget-object v1, Lp9/i;->i:Lp9/i;

    .line 173
    .line 174
    invoke-direct {v0, v3, v1, p0}, Lm9/z;-><init>(Lm9/r;Lp9/i;Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    return-object v0

    .line 178
    :pswitch_1
    new-instance v0, Lm9/z;

    .line 179
    .line 180
    sget-object v1, Lp9/i;->h:Lp9/i;

    .line 181
    .line 182
    invoke-direct {v0, v3, v1, p0}, Lm9/z;-><init>(Lm9/r;Lp9/i;Ljava/lang/Object;)V

    .line 183
    .line 184
    .line 185
    return-object v0

    .line 186
    :pswitch_2
    check-cast p0, Ljava/util/List;

    .line 187
    .line 188
    new-instance v0, Lm9/z;

    .line 189
    .line 190
    sget-object v1, Lp9/i;->j:Lp9/i;

    .line 191
    .line 192
    invoke-direct {v0, v3, v1, p0}, Lm9/z;-><init>(Lm9/r;Lp9/i;Ljava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    return-object v0

    .line 196
    :pswitch_3
    new-instance v0, Lm9/z;

    .line 197
    .line 198
    sget-object v1, Lp9/i;->g:Lp9/i;

    .line 199
    .line 200
    invoke-direct {v0, v3, v1, p0}, Lm9/z;-><init>(Lm9/r;Lp9/i;Ljava/lang/Object;)V

    .line 201
    .line 202
    .line 203
    return-object v0

    .line 204
    :pswitch_4
    new-instance v0, Lm9/z;

    .line 205
    .line 206
    sget-object v1, Lp9/i;->d:Lp9/i;

    .line 207
    .line 208
    invoke-direct {v0, v3, v1, p0}, Lm9/z;-><init>(Lm9/r;Lp9/i;Ljava/lang/Object;)V

    .line 209
    .line 210
    .line 211
    return-object v0

    .line 212
    :pswitch_5
    new-instance v0, Lm9/z;

    .line 213
    .line 214
    sget-object v1, Lp9/i;->c:Lp9/i;

    .line 215
    .line 216
    invoke-direct {v0, v3, v1, p0}, Lm9/z;-><init>(Lm9/r;Lp9/i;Ljava/lang/Object;)V

    .line 217
    .line 218
    .line 219
    return-object v0

    .line 220
    :pswitch_6
    new-instance v0, Lm9/z;

    .line 221
    .line 222
    sget-object v1, Lp9/i;->e:Lp9/i;

    .line 223
    .line 224
    invoke-direct {v0, v3, v1, p0}, Lm9/z;-><init>(Lm9/r;Lp9/i;Ljava/lang/Object;)V

    .line 225
    .line 226
    .line 227
    return-object v0

    .line 228
    :pswitch_7
    new-instance v0, Lm9/z;

    .line 229
    .line 230
    sget-object v1, Lp9/i;->f:Lp9/i;

    .line 231
    .line 232
    invoke-direct {v0, v3, v1, p0}, Lm9/z;-><init>(Lm9/r;Lp9/i;Ljava/lang/Object;)V

    .line 233
    .line 234
    .line 235
    return-object v0

    .line 236
    :pswitch_8
    new-instance v0, Lm9/z;

    .line 237
    .line 238
    sget-object v1, Lp9/i;->b:Lp9/i;

    .line 239
    .line 240
    invoke-direct {v0, v3, v1, p0}, Lm9/z;-><init>(Lm9/r;Lp9/i;Ljava/lang/Object;)V

    .line 241
    .line 242
    .line 243
    return-object v0

    .line 244
    :pswitch_9
    check-cast p0, Ljava/util/List;

    .line 245
    .line 246
    new-instance v0, Lm9/z;

    .line 247
    .line 248
    sget-object v1, Lp9/i;->k:Lp9/i;

    .line 249
    .line 250
    invoke-direct {v0, v3, v1, p0}, Lm9/z;-><init>(Lm9/r;Lp9/i;Ljava/lang/Object;)V

    .line 251
    .line 252
    .line 253
    return-object v0

    .line 254
    :cond_a
    invoke-interface {p0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v3

    .line 258
    check-cast v3, Ljava/lang/String;

    .line 259
    .line 260
    const-string v4, "queries"

    .line 261
    .line 262
    invoke-interface {p0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object p0

    .line 266
    check-cast p0, Ljava/util/List;

    .line 267
    .line 268
    new-instance v4, Ljava/util/ArrayList;

    .line 269
    .line 270
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 271
    .line 272
    .line 273
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 274
    .line 275
    .line 276
    move-result-object p0

    .line 277
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 278
    .line 279
    .line 280
    move-result v6

    .line 281
    if-eqz v6, :cond_b

    .line 282
    .line 283
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    move-result-object v6

    .line 287
    check-cast v6, Ljava/util/Map;

    .line 288
    .line 289
    invoke-static {v6}, Lxg/g;->y(Ljava/util/Map;)Lm9/A;

    .line 290
    .line 291
    .line 292
    move-result-object v6

    .line 293
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 294
    .line 295
    .line 296
    goto :goto_2

    .line 297
    :cond_b
    const-string p0, "OR"

    .line 298
    .line 299
    invoke-virtual {v3, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 300
    .line 301
    .line 302
    move-result p0

    .line 303
    if-eqz p0, :cond_c

    .line 304
    .line 305
    new-array p0, v2, [Lm9/A;

    .line 306
    .line 307
    invoke-virtual {v4, p0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object p0

    .line 311
    check-cast p0, [Lm9/A;

    .line 312
    .line 313
    new-instance v1, Lm9/y;

    .line 314
    .line 315
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 316
    .line 317
    .line 318
    move-result-object p0

    .line 319
    invoke-direct {v1, v0, p0}, Lm9/y;-><init>(ILjava/util/List;)V

    .line 320
    .line 321
    .line 322
    return-object v1

    .line 323
    :cond_c
    const-string p0, "AND"

    .line 324
    .line 325
    invoke-virtual {v3, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 326
    .line 327
    .line 328
    move-result p0

    .line 329
    if-eqz p0, :cond_d

    .line 330
    .line 331
    new-array p0, v2, [Lm9/A;

    .line 332
    .line 333
    invoke-virtual {v4, p0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    move-result-object p0

    .line 337
    check-cast p0, [Lm9/A;

    .line 338
    .line 339
    new-instance v0, Lm9/y;

    .line 340
    .line 341
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 342
    .line 343
    .line 344
    move-result-object p0

    .line 345
    invoke-direct {v0, v1, p0}, Lm9/y;-><init>(ILjava/util/List;)V

    .line 346
    .line 347
    .line 348
    return-object v0

    .line 349
    :cond_d
    new-instance p0, Ljava/lang/Error;

    .line 350
    .line 351
    invoke-direct {p0, v5}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    .line 352
    .line 353
    .line 354
    throw p0

    .line 355
    :sswitch_data_0
    .sparse-switch
        -0x3df949a1 -> :sswitch_9
        0x3c -> :sswitch_8
        0x3e -> :sswitch_7
        0x43c -> :sswitch_6
        0x781 -> :sswitch_5
        0x7a0 -> :sswitch_4
        0x7bf -> :sswitch_3
        0xd25 -> :sswitch_2
        0x8111b13 -> :sswitch_1
        0x152d4832 -> :sswitch_0
    .end sparse-switch

    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static z(D)J
    .locals 3

    .line 1
    invoke-static {p0, p1}, Lxg/g;->B(D)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-string v1, "not a normal value"

    .line 6
    .line 7
    invoke-static {v1, v0}, LFe/e;->p(Ljava/lang/String;Z)V

    .line 8
    .line 9
    .line 10
    invoke-static {p0, p1}, Ljava/lang/Math;->getExponent(D)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    invoke-static {p0, p1}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    .line 15
    .line 16
    .line 17
    move-result-wide p0

    .line 18
    const-wide v1, 0xfffffffffffffL

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    and-long/2addr p0, v1

    .line 24
    const/16 v1, -0x3ff

    .line 25
    .line 26
    if-ne v0, v1, :cond_0

    .line 27
    .line 28
    const/4 v0, 0x1

    .line 29
    shl-long/2addr p0, v0

    .line 30
    return-wide p0

    .line 31
    :cond_0
    const-wide/high16 v0, 0x10000000000000L

    .line 32
    .line 33
    or-long/2addr p0, v0

    .line 34
    return-wide p0
.end method


# virtual methods
.method public abstract J(LU3/g;LU3/g;)V
.end method

.method public abstract K(LU3/g;Ljava/lang/Thread;)V
.end method

.method public abstract j(Li4/f;)Z
.end method

.method public abstract k()Z
.end method

.method public abstract m(LU3/h;LU3/c;LU3/c;)Z
.end method

.method public abstract n(LU3/h;Ljava/lang/Object;Ljava/lang/Object;)Z
.end method

.method public abstract o(LU3/h;LU3/g;LU3/g;)Z
.end method
