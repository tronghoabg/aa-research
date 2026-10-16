.class public abstract Li0/I;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic a:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget v0, Le0/q;->j:I

    .line 2
    .line 3
    return-void
.end method

.method public static final a(Ljava/lang/String;)Ljava/util/List;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lff/v;->a:Lff/v;

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    new-instance v1, LC8/i;

    .line 9
    .line 10
    const/16 v2, 0xd

    .line 11
    .line 12
    invoke-direct {v1, v2}, LC8/i;-><init>(I)V

    .line 13
    .line 14
    .line 15
    iget-object v2, v1, LC8/i;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v2, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 20
    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    const/4 v4, 0x1

    .line 24
    move v6, v3

    .line 25
    move v5, v4

    .line 26
    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 27
    .line 28
    .line 29
    move-result v7

    .line 30
    if-ge v5, v7, :cond_1b

    .line 31
    .line 32
    :goto_1
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 33
    .line 34
    .line 35
    move-result v7

    .line 36
    const/16 v8, 0x45

    .line 37
    .line 38
    const/16 v9, 0x65

    .line 39
    .line 40
    if-ge v5, v7, :cond_3

    .line 41
    .line 42
    invoke-virtual {v0, v5}, Ljava/lang/String;->charAt(I)C

    .line 43
    .line 44
    .line 45
    move-result v7

    .line 46
    add-int/lit8 v10, v7, -0x41

    .line 47
    .line 48
    add-int/lit8 v11, v7, -0x5a

    .line 49
    .line 50
    mul-int/2addr v11, v10

    .line 51
    if-lez v11, :cond_1

    .line 52
    .line 53
    add-int/lit8 v10, v7, -0x61

    .line 54
    .line 55
    add-int/lit8 v11, v7, -0x7a

    .line 56
    .line 57
    mul-int/2addr v11, v10

    .line 58
    if-gtz v11, :cond_2

    .line 59
    .line 60
    :cond_1
    if-eq v7, v9, :cond_2

    .line 61
    .line 62
    if-eq v7, v8, :cond_2

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_2
    add-int/lit8 v5, v5, 0x1

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_3
    :goto_2
    invoke-virtual {v0, v6, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    const-string v7, "this as java.lang.String\u2026ing(startIndex, endIndex)"

    .line 73
    .line 74
    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 78
    .line 79
    .line 80
    move-result v10

    .line 81
    sub-int/2addr v10, v4

    .line 82
    move v11, v3

    .line 83
    move v12, v11

    .line 84
    :goto_3
    const/16 v13, 0x20

    .line 85
    .line 86
    if-gt v11, v10, :cond_9

    .line 87
    .line 88
    if-nez v12, :cond_4

    .line 89
    .line 90
    move v14, v11

    .line 91
    goto :goto_4

    .line 92
    :cond_4
    move v14, v10

    .line 93
    :goto_4
    invoke-virtual {v6, v14}, Ljava/lang/String;->charAt(I)C

    .line 94
    .line 95
    .line 96
    move-result v14

    .line 97
    invoke-static {v14, v13}, Lkotlin/jvm/internal/k;->g(II)I

    .line 98
    .line 99
    .line 100
    move-result v14

    .line 101
    if-gtz v14, :cond_5

    .line 102
    .line 103
    move v14, v4

    .line 104
    goto :goto_5

    .line 105
    :cond_5
    move v14, v3

    .line 106
    :goto_5
    if-nez v12, :cond_7

    .line 107
    .line 108
    if-nez v14, :cond_6

    .line 109
    .line 110
    move v12, v4

    .line 111
    goto :goto_3

    .line 112
    :cond_6
    add-int/lit8 v11, v11, 0x1

    .line 113
    .line 114
    goto :goto_3

    .line 115
    :cond_7
    if-nez v14, :cond_8

    .line 116
    .line 117
    goto :goto_6

    .line 118
    :cond_8
    add-int/lit8 v10, v10, -0x1

    .line 119
    .line 120
    goto :goto_3

    .line 121
    :cond_9
    :goto_6
    add-int/lit8 v10, v10, 0x1

    .line 122
    .line 123
    invoke-virtual {v6, v11, v10}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;

    .line 124
    .line 125
    .line 126
    move-result-object v6

    .line 127
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v6

    .line 131
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 132
    .line 133
    .line 134
    move-result v10

    .line 135
    if-lez v10, :cond_1a

    .line 136
    .line 137
    invoke-virtual {v6, v3}, Ljava/lang/String;->charAt(I)C

    .line 138
    .line 139
    .line 140
    move-result v10

    .line 141
    const/16 v11, 0x7a

    .line 142
    .line 143
    if-eq v10, v11, :cond_a

    .line 144
    .line 145
    invoke-virtual {v6, v3}, Ljava/lang/String;->charAt(I)C

    .line 146
    .line 147
    .line 148
    move-result v10

    .line 149
    const/16 v11, 0x5a

    .line 150
    .line 151
    if-ne v10, v11, :cond_b

    .line 152
    .line 153
    :cond_a
    move v7, v3

    .line 154
    goto/16 :goto_e

    .line 155
    .line 156
    :cond_b
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 157
    .line 158
    .line 159
    move-result v10

    .line 160
    new-array v11, v10, [F

    .line 161
    .line 162
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 163
    .line 164
    .line 165
    move-result v12

    .line 166
    move v15, v3

    .line 167
    move v14, v4

    .line 168
    :goto_7
    if-ge v14, v12, :cond_17

    .line 169
    .line 170
    move/from16 v16, v3

    .line 171
    .line 172
    move/from16 v17, v16

    .line 173
    .line 174
    move/from16 v18, v17

    .line 175
    .line 176
    move/from16 v19, v18

    .line 177
    .line 178
    move v4, v14

    .line 179
    :goto_8
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 180
    .line 181
    .line 182
    move-result v3

    .line 183
    if-ge v4, v3, :cond_14

    .line 184
    .line 185
    invoke-virtual {v6, v4}, Ljava/lang/String;->charAt(I)C

    .line 186
    .line 187
    .line 188
    move-result v3

    .line 189
    if-ne v3, v13, :cond_c

    .line 190
    .line 191
    goto :goto_9

    .line 192
    :cond_c
    const/16 v13, 0x2c

    .line 193
    .line 194
    if-ne v3, v13, :cond_d

    .line 195
    .line 196
    :goto_9
    const/16 v16, 0x0

    .line 197
    .line 198
    const/16 v18, 0x1

    .line 199
    .line 200
    goto :goto_b

    .line 201
    :cond_d
    const/16 v13, 0x2d

    .line 202
    .line 203
    if-ne v3, v13, :cond_f

    .line 204
    .line 205
    if-eq v4, v14, :cond_12

    .line 206
    .line 207
    if-nez v16, :cond_12

    .line 208
    .line 209
    :cond_e
    const/16 v16, 0x0

    .line 210
    .line 211
    const/16 v18, 0x1

    .line 212
    .line 213
    const/16 v19, 0x1

    .line 214
    .line 215
    goto :goto_b

    .line 216
    :cond_f
    const/16 v13, 0x2e

    .line 217
    .line 218
    if-ne v3, v13, :cond_10

    .line 219
    .line 220
    if-nez v17, :cond_e

    .line 221
    .line 222
    const/16 v16, 0x0

    .line 223
    .line 224
    const/16 v17, 0x1

    .line 225
    .line 226
    goto :goto_b

    .line 227
    :cond_10
    if-ne v3, v9, :cond_11

    .line 228
    .line 229
    goto :goto_a

    .line 230
    :cond_11
    if-ne v3, v8, :cond_12

    .line 231
    .line 232
    :goto_a
    const/16 v16, 0x1

    .line 233
    .line 234
    goto :goto_b

    .line 235
    :cond_12
    const/16 v16, 0x0

    .line 236
    .line 237
    :goto_b
    if-eqz v18, :cond_13

    .line 238
    .line 239
    goto :goto_c

    .line 240
    :cond_13
    add-int/lit8 v4, v4, 0x1

    .line 241
    .line 242
    const/16 v13, 0x20

    .line 243
    .line 244
    goto :goto_8

    .line 245
    :cond_14
    :goto_c
    if-ge v14, v4, :cond_15

    .line 246
    .line 247
    add-int/lit8 v3, v15, 0x1

    .line 248
    .line 249
    invoke-virtual {v6, v14, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v13

    .line 253
    invoke-static {v13, v7}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    invoke-static {v13}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 257
    .line 258
    .line 259
    move-result v13

    .line 260
    aput v13, v11, v15

    .line 261
    .line 262
    move v15, v3

    .line 263
    :cond_15
    if-eqz v19, :cond_16

    .line 264
    .line 265
    move v14, v4

    .line 266
    :goto_d
    const/4 v3, 0x0

    .line 267
    const/4 v4, 0x1

    .line 268
    const/16 v13, 0x20

    .line 269
    .line 270
    goto :goto_7

    .line 271
    :cond_16
    add-int/lit8 v14, v4, 0x1

    .line 272
    .line 273
    goto :goto_d

    .line 274
    :cond_17
    if-ltz v15, :cond_19

    .line 275
    .line 276
    if-ltz v10, :cond_18

    .line 277
    .line 278
    invoke-static {v15, v10}, Ljava/lang/Math;->min(II)I

    .line 279
    .line 280
    .line 281
    move-result v3

    .line 282
    new-array v4, v15, [F

    .line 283
    .line 284
    const/4 v7, 0x0

    .line 285
    invoke-static {v11, v7, v4, v7, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 286
    .line 287
    .line 288
    goto :goto_f

    .line 289
    :cond_18
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    .line 290
    .line 291
    invoke-direct {v0}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    .line 292
    .line 293
    .line 294
    throw v0

    .line 295
    :cond_19
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 296
    .line 297
    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 298
    .line 299
    .line 300
    throw v0

    .line 301
    :goto_e
    new-array v4, v7, [F

    .line 302
    .line 303
    :goto_f
    invoke-virtual {v6, v7}, Ljava/lang/String;->charAt(I)C

    .line 304
    .line 305
    .line 306
    move-result v3

    .line 307
    invoke-virtual {v1, v3, v4}, LC8/i;->i(C[F)V

    .line 308
    .line 309
    .line 310
    :cond_1a
    add-int/lit8 v3, v5, 0x1

    .line 311
    .line 312
    move v6, v5

    .line 313
    const/4 v4, 0x1

    .line 314
    move v5, v3

    .line 315
    const/4 v3, 0x0

    .line 316
    goto/16 :goto_0

    .line 317
    .line 318
    :cond_1b
    sub-int/2addr v5, v6

    .line 319
    const/4 v3, 0x1

    .line 320
    if-ne v5, v3, :cond_1c

    .line 321
    .line 322
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 323
    .line 324
    .line 325
    move-result v3

    .line 326
    if-ge v6, v3, :cond_1c

    .line 327
    .line 328
    invoke-virtual {v0, v6}, Ljava/lang/String;->charAt(I)C

    .line 329
    .line 330
    .line 331
    move-result v0

    .line 332
    const/4 v7, 0x0

    .line 333
    new-array v3, v7, [F

    .line 334
    .line 335
    invoke-virtual {v1, v0, v3}, LC8/i;->i(C[F)V

    .line 336
    .line 337
    .line 338
    :cond_1c
    return-object v2
.end method
