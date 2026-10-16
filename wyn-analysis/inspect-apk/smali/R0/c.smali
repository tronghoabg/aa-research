.class public final LR0/c;
.super LR0/o;
.source "SourceFile"


# instance fields
.field public final k:Ljava/util/ArrayList;

.field public l:I


# direct methods
.method public constructor <init>(LQ0/d;I)V
    .locals 4

    .line 1
    invoke-direct {p0, p1}, LR0/o;-><init>(LQ0/d;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, LR0/c;->k:Ljava/util/ArrayList;

    .line 10
    .line 11
    iput p2, p0, LR0/o;->f:I

    .line 12
    .line 13
    iget-object p1, p0, LR0/o;->b:LQ0/d;

    .line 14
    .line 15
    invoke-virtual {p1, p2}, LQ0/d;->m(I)LQ0/d;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    :goto_0
    move-object v3, p2

    .line 20
    move-object p2, p1

    .line 21
    move-object p1, v3

    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    iget p2, p0, LR0/o;->f:I

    .line 25
    .line 26
    invoke-virtual {p1, p2}, LQ0/d;->m(I)LQ0/d;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    iput-object p2, p0, LR0/o;->b:LQ0/d;

    .line 32
    .line 33
    iget p1, p0, LR0/o;->f:I

    .line 34
    .line 35
    const/4 v0, 0x0

    .line 36
    const/4 v1, 0x1

    .line 37
    if-nez p1, :cond_1

    .line 38
    .line 39
    iget-object p1, p2, LQ0/d;->d:LR0/k;

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    if-ne p1, v1, :cond_2

    .line 43
    .line 44
    iget-object p1, p2, LQ0/d;->e:LR0/m;

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_2
    move-object p1, v0

    .line 48
    :goto_1
    iget-object v2, p0, LR0/c;->k:Ljava/util/ArrayList;

    .line 49
    .line 50
    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    iget p1, p0, LR0/o;->f:I

    .line 54
    .line 55
    invoke-virtual {p2, p1}, LQ0/d;->l(I)LQ0/d;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    :goto_2
    if-eqz p1, :cond_5

    .line 60
    .line 61
    iget p2, p0, LR0/o;->f:I

    .line 62
    .line 63
    if-nez p2, :cond_3

    .line 64
    .line 65
    iget-object p2, p1, LQ0/d;->d:LR0/k;

    .line 66
    .line 67
    goto :goto_3

    .line 68
    :cond_3
    if-ne p2, v1, :cond_4

    .line 69
    .line 70
    iget-object p2, p1, LQ0/d;->e:LR0/m;

    .line 71
    .line 72
    goto :goto_3

    .line 73
    :cond_4
    move-object p2, v0

    .line 74
    :goto_3
    invoke-virtual {v2, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    iget p2, p0, LR0/o;->f:I

    .line 78
    .line 79
    invoke-virtual {p1, p2}, LQ0/d;->l(I)LQ0/d;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    goto :goto_2

    .line 84
    :cond_5
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    :cond_6
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 89
    .line 90
    .line 91
    move-result p2

    .line 92
    if-eqz p2, :cond_8

    .line 93
    .line 94
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p2

    .line 98
    check-cast p2, LR0/o;

    .line 99
    .line 100
    iget v0, p0, LR0/o;->f:I

    .line 101
    .line 102
    if-nez v0, :cond_7

    .line 103
    .line 104
    iget-object p2, p2, LR0/o;->b:LQ0/d;

    .line 105
    .line 106
    iput-object p0, p2, LQ0/d;->b:LR0/c;

    .line 107
    .line 108
    goto :goto_4

    .line 109
    :cond_7
    if-ne v0, v1, :cond_6

    .line 110
    .line 111
    iget-object p2, p2, LR0/o;->b:LQ0/d;

    .line 112
    .line 113
    iput-object p0, p2, LQ0/d;->c:LR0/c;

    .line 114
    .line 115
    goto :goto_4

    .line 116
    :cond_8
    iget p1, p0, LR0/o;->f:I

    .line 117
    .line 118
    if-nez p1, :cond_9

    .line 119
    .line 120
    iget-object p1, p0, LR0/o;->b:LQ0/d;

    .line 121
    .line 122
    iget-object p1, p1, LQ0/d;->T:LQ0/d;

    .line 123
    .line 124
    check-cast p1, LQ0/e;

    .line 125
    .line 126
    iget-boolean p1, p1, LQ0/e;->v0:Z

    .line 127
    .line 128
    if-eqz p1, :cond_9

    .line 129
    .line 130
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 131
    .line 132
    .line 133
    move-result p1

    .line 134
    if-le p1, v1, :cond_9

    .line 135
    .line 136
    invoke-static {v2, v1}, Lka/n;->e(Ljava/util/ArrayList;I)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    check-cast p1, LR0/o;

    .line 141
    .line 142
    iget-object p1, p1, LR0/o;->b:LQ0/d;

    .line 143
    .line 144
    iput-object p1, p0, LR0/o;->b:LQ0/d;

    .line 145
    .line 146
    :cond_9
    iget p1, p0, LR0/o;->f:I

    .line 147
    .line 148
    if-nez p1, :cond_a

    .line 149
    .line 150
    iget-object p1, p0, LR0/o;->b:LQ0/d;

    .line 151
    .line 152
    iget p1, p1, LQ0/d;->i0:I

    .line 153
    .line 154
    goto :goto_5

    .line 155
    :cond_a
    iget-object p1, p0, LR0/o;->b:LQ0/d;

    .line 156
    .line 157
    iget p1, p1, LQ0/d;->j0:I

    .line 158
    .line 159
    :goto_5
    iput p1, p0, LR0/c;->l:I

    .line 160
    .line 161
    return-void
.end method


# virtual methods
.method public final a(LR0/d;)V
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, LR0/o;->h:LR0/f;

    .line 4
    .line 5
    iget-boolean v2, v1, LR0/f;->j:Z

    .line 6
    .line 7
    if-eqz v2, :cond_56

    .line 8
    .line 9
    iget-object v2, v0, LR0/o;->i:LR0/f;

    .line 10
    .line 11
    iget-boolean v3, v2, LR0/f;->j:Z

    .line 12
    .line 13
    if-nez v3, :cond_0

    .line 14
    .line 15
    goto/16 :goto_32

    .line 16
    .line 17
    :cond_0
    iget-object v3, v0, LR0/o;->b:LQ0/d;

    .line 18
    .line 19
    iget-object v3, v3, LQ0/d;->T:LQ0/d;

    .line 20
    .line 21
    instance-of v4, v3, LQ0/e;

    .line 22
    .line 23
    if-eqz v4, :cond_1

    .line 24
    .line 25
    check-cast v3, LQ0/e;

    .line 26
    .line 27
    iget-boolean v3, v3, LQ0/e;->v0:Z

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    const/4 v3, 0x0

    .line 31
    :goto_0
    iget v4, v2, LR0/f;->g:I

    .line 32
    .line 33
    iget v6, v1, LR0/f;->g:I

    .line 34
    .line 35
    sub-int/2addr v4, v6

    .line 36
    iget-object v6, v0, LR0/c;->k:Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 39
    .line 40
    .line 41
    move-result v7

    .line 42
    const/4 v8, 0x0

    .line 43
    :goto_1
    const/4 v9, -0x1

    .line 44
    const/16 v10, 0x8

    .line 45
    .line 46
    if-ge v8, v7, :cond_2

    .line 47
    .line 48
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v11

    .line 52
    check-cast v11, LR0/o;

    .line 53
    .line 54
    iget-object v11, v11, LR0/o;->b:LQ0/d;

    .line 55
    .line 56
    iget v11, v11, LQ0/d;->g0:I

    .line 57
    .line 58
    if-ne v11, v10, :cond_3

    .line 59
    .line 60
    add-int/lit8 v8, v8, 0x1

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_2
    move v8, v9

    .line 64
    :cond_3
    add-int/lit8 v11, v7, -0x1

    .line 65
    .line 66
    move v12, v11

    .line 67
    :goto_2
    if-ltz v12, :cond_5

    .line 68
    .line 69
    invoke-virtual {v6, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v13

    .line 73
    check-cast v13, LR0/o;

    .line 74
    .line 75
    iget-object v13, v13, LR0/o;->b:LQ0/d;

    .line 76
    .line 77
    iget v13, v13, LQ0/d;->g0:I

    .line 78
    .line 79
    if-ne v13, v10, :cond_4

    .line 80
    .line 81
    add-int/lit8 v12, v12, -0x1

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_4
    move v9, v12

    .line 85
    :cond_5
    const/4 v12, 0x0

    .line 86
    :goto_3
    const/16 p1, 0x0

    .line 87
    .line 88
    const/4 v14, 0x2

    .line 89
    if-ge v12, v14, :cond_14

    .line 90
    .line 91
    move/from16 v19, p1

    .line 92
    .line 93
    const/4 v5, 0x0

    .line 94
    const/4 v14, 0x0

    .line 95
    const/16 v17, 0x0

    .line 96
    .line 97
    const/16 v18, 0x0

    .line 98
    .line 99
    :goto_4
    if-ge v5, v7, :cond_11

    .line 100
    .line 101
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v20

    .line 105
    move-object/from16 v13, v20

    .line 106
    .line 107
    check-cast v13, LR0/o;

    .line 108
    .line 109
    iget-object v15, v13, LR0/o;->b:LQ0/d;

    .line 110
    .line 111
    move/from16 v22, v3

    .line 112
    .line 113
    iget v3, v15, LQ0/d;->g0:I

    .line 114
    .line 115
    if-ne v3, v10, :cond_6

    .line 116
    .line 117
    move/from16 v24, v12

    .line 118
    .line 119
    goto/16 :goto_a

    .line 120
    .line 121
    :cond_6
    add-int/lit8 v18, v18, 0x1

    .line 122
    .line 123
    if-lez v5, :cond_7

    .line 124
    .line 125
    if-lt v5, v8, :cond_7

    .line 126
    .line 127
    iget-object v3, v13, LR0/o;->h:LR0/f;

    .line 128
    .line 129
    iget v3, v3, LR0/f;->f:I

    .line 130
    .line 131
    add-int/2addr v14, v3

    .line 132
    :cond_7
    iget-object v3, v13, LR0/o;->e:LR0/g;

    .line 133
    .line 134
    iget v10, v3, LR0/f;->g:I

    .line 135
    .line 136
    move/from16 v23, v10

    .line 137
    .line 138
    iget v10, v13, LR0/o;->d:I

    .line 139
    .line 140
    move/from16 v24, v12

    .line 141
    .line 142
    const/4 v12, 0x3

    .line 143
    if-eq v10, v12, :cond_8

    .line 144
    .line 145
    const/4 v10, 0x1

    .line 146
    goto :goto_5

    .line 147
    :cond_8
    const/4 v10, 0x0

    .line 148
    :goto_5
    if-eqz v10, :cond_b

    .line 149
    .line 150
    iget v3, v0, LR0/o;->f:I

    .line 151
    .line 152
    if-nez v3, :cond_9

    .line 153
    .line 154
    iget-object v12, v15, LQ0/d;->d:LR0/k;

    .line 155
    .line 156
    iget-object v12, v12, LR0/o;->e:LR0/g;

    .line 157
    .line 158
    iget-boolean v12, v12, LR0/f;->j:Z

    .line 159
    .line 160
    if-nez v12, :cond_9

    .line 161
    .line 162
    goto/16 :goto_32

    .line 163
    .line 164
    :cond_9
    const/4 v12, 0x1

    .line 165
    if-ne v3, v12, :cond_a

    .line 166
    .line 167
    iget-object v3, v15, LQ0/d;->e:LR0/m;

    .line 168
    .line 169
    iget-object v3, v3, LR0/o;->e:LR0/g;

    .line 170
    .line 171
    iget-boolean v3, v3, LR0/f;->j:Z

    .line 172
    .line 173
    if-nez v3, :cond_a

    .line 174
    .line 175
    goto/16 :goto_32

    .line 176
    .line 177
    :cond_a
    move/from16 v25, v10

    .line 178
    .line 179
    goto :goto_7

    .line 180
    :cond_b
    move/from16 v25, v10

    .line 181
    .line 182
    const/4 v12, 0x1

    .line 183
    iget v10, v13, LR0/o;->a:I

    .line 184
    .line 185
    if-ne v10, v12, :cond_c

    .line 186
    .line 187
    if-nez v24, :cond_c

    .line 188
    .line 189
    iget v10, v3, LR0/g;->m:I

    .line 190
    .line 191
    add-int/lit8 v17, v17, 0x1

    .line 192
    .line 193
    :goto_6
    const/16 v25, 0x1

    .line 194
    .line 195
    goto :goto_8

    .line 196
    :cond_c
    iget-boolean v3, v3, LR0/f;->j:Z

    .line 197
    .line 198
    if-eqz v3, :cond_d

    .line 199
    .line 200
    move/from16 v10, v23

    .line 201
    .line 202
    goto :goto_6

    .line 203
    :cond_d
    :goto_7
    move/from16 v10, v23

    .line 204
    .line 205
    :goto_8
    if-nez v25, :cond_e

    .line 206
    .line 207
    add-int/lit8 v17, v17, 0x1

    .line 208
    .line 209
    iget-object v3, v15, LQ0/d;->k0:[F

    .line 210
    .line 211
    iget v10, v0, LR0/o;->f:I

    .line 212
    .line 213
    aget v3, v3, v10

    .line 214
    .line 215
    cmpl-float v10, v3, p1

    .line 216
    .line 217
    if-ltz v10, :cond_f

    .line 218
    .line 219
    add-float v19, v19, v3

    .line 220
    .line 221
    goto :goto_9

    .line 222
    :cond_e
    add-int/2addr v14, v10

    .line 223
    :cond_f
    :goto_9
    if-ge v5, v11, :cond_10

    .line 224
    .line 225
    if-ge v5, v9, :cond_10

    .line 226
    .line 227
    iget-object v3, v13, LR0/o;->i:LR0/f;

    .line 228
    .line 229
    iget v3, v3, LR0/f;->f:I

    .line 230
    .line 231
    neg-int v3, v3

    .line 232
    add-int/2addr v14, v3

    .line 233
    :cond_10
    :goto_a
    add-int/lit8 v5, v5, 0x1

    .line 234
    .line 235
    move/from16 v3, v22

    .line 236
    .line 237
    move/from16 v12, v24

    .line 238
    .line 239
    const/16 v10, 0x8

    .line 240
    .line 241
    goto/16 :goto_4

    .line 242
    .line 243
    :cond_11
    move/from16 v22, v3

    .line 244
    .line 245
    move/from16 v24, v12

    .line 246
    .line 247
    if-lt v14, v4, :cond_13

    .line 248
    .line 249
    if-nez v17, :cond_12

    .line 250
    .line 251
    goto :goto_b

    .line 252
    :cond_12
    add-int/lit8 v12, v24, 0x1

    .line 253
    .line 254
    move/from16 v3, v22

    .line 255
    .line 256
    const/16 v10, 0x8

    .line 257
    .line 258
    goto/16 :goto_3

    .line 259
    .line 260
    :cond_13
    :goto_b
    move/from16 v3, v17

    .line 261
    .line 262
    move/from16 v5, v18

    .line 263
    .line 264
    goto :goto_c

    .line 265
    :cond_14
    move/from16 v22, v3

    .line 266
    .line 267
    move/from16 v19, p1

    .line 268
    .line 269
    const/4 v3, 0x0

    .line 270
    const/4 v5, 0x0

    .line 271
    const/4 v14, 0x0

    .line 272
    :goto_c
    iget v1, v1, LR0/f;->g:I

    .line 273
    .line 274
    if-eqz v22, :cond_15

    .line 275
    .line 276
    iget v1, v2, LR0/f;->g:I

    .line 277
    .line 278
    :cond_15
    const/high16 v2, 0x3f000000    # 0.5f

    .line 279
    .line 280
    if-le v14, v4, :cond_17

    .line 281
    .line 282
    const/high16 v10, 0x40000000    # 2.0f

    .line 283
    .line 284
    if-eqz v22, :cond_16

    .line 285
    .line 286
    sub-int v12, v14, v4

    .line 287
    .line 288
    int-to-float v12, v12

    .line 289
    div-float/2addr v12, v10

    .line 290
    add-float/2addr v12, v2

    .line 291
    float-to-int v10, v12

    .line 292
    add-int/2addr v1, v10

    .line 293
    goto :goto_d

    .line 294
    :cond_16
    sub-int v12, v14, v4

    .line 295
    .line 296
    int-to-float v12, v12

    .line 297
    div-float/2addr v12, v10

    .line 298
    add-float/2addr v12, v2

    .line 299
    float-to-int v10, v12

    .line 300
    sub-int/2addr v1, v10

    .line 301
    :cond_17
    :goto_d
    if-lez v3, :cond_26

    .line 302
    .line 303
    sub-int v10, v4, v14

    .line 304
    .line 305
    int-to-float v10, v10

    .line 306
    int-to-float v12, v3

    .line 307
    div-float v12, v10, v12

    .line 308
    .line 309
    add-float/2addr v12, v2

    .line 310
    float-to-int v12, v12

    .line 311
    const/4 v13, 0x0

    .line 312
    const/4 v15, 0x0

    .line 313
    :goto_e
    if-ge v13, v7, :cond_1f

    .line 314
    .line 315
    invoke-virtual {v6, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    move-result-object v17

    .line 319
    move/from16 v18, v2

    .line 320
    .line 321
    move-object/from16 v2, v17

    .line 322
    .line 323
    check-cast v2, LR0/o;

    .line 324
    .line 325
    move/from16 v17, v1

    .line 326
    .line 327
    iget-object v1, v2, LR0/o;->b:LQ0/d;

    .line 328
    .line 329
    move/from16 v23, v3

    .line 330
    .line 331
    iget v3, v1, LQ0/d;->g0:I

    .line 332
    .line 333
    move/from16 v24, v10

    .line 334
    .line 335
    const/16 v10, 0x8

    .line 336
    .line 337
    if-ne v3, v10, :cond_19

    .line 338
    .line 339
    :cond_18
    move/from16 v25, v12

    .line 340
    .line 341
    move/from16 v26, v13

    .line 342
    .line 343
    goto :goto_12

    .line 344
    :cond_19
    iget v3, v2, LR0/o;->d:I

    .line 345
    .line 346
    const/4 v10, 0x3

    .line 347
    if-ne v3, v10, :cond_18

    .line 348
    .line 349
    iget-object v3, v2, LR0/o;->e:LR0/g;

    .line 350
    .line 351
    iget-boolean v10, v3, LR0/f;->j:Z

    .line 352
    .line 353
    if-nez v10, :cond_18

    .line 354
    .line 355
    cmpl-float v10, v19, p1

    .line 356
    .line 357
    if-lez v10, :cond_1a

    .line 358
    .line 359
    iget-object v10, v1, LQ0/d;->k0:[F

    .line 360
    .line 361
    move-object/from16 v25, v10

    .line 362
    .line 363
    iget v10, v0, LR0/o;->f:I

    .line 364
    .line 365
    aget v10, v25, v10

    .line 366
    .line 367
    mul-float v10, v10, v24

    .line 368
    .line 369
    div-float v10, v10, v19

    .line 370
    .line 371
    add-float v10, v10, v18

    .line 372
    .line 373
    float-to-int v10, v10

    .line 374
    move/from16 v25, v12

    .line 375
    .line 376
    goto :goto_f

    .line 377
    :cond_1a
    move v10, v12

    .line 378
    move/from16 v25, v10

    .line 379
    .line 380
    :goto_f
    iget v12, v0, LR0/o;->f:I

    .line 381
    .line 382
    if-nez v12, :cond_1b

    .line 383
    .line 384
    iget v12, v1, LQ0/d;->v:I

    .line 385
    .line 386
    iget v1, v1, LQ0/d;->u:I

    .line 387
    .line 388
    goto :goto_10

    .line 389
    :cond_1b
    iget v12, v1, LQ0/d;->y:I

    .line 390
    .line 391
    iget v1, v1, LQ0/d;->x:I

    .line 392
    .line 393
    :goto_10
    iget v2, v2, LR0/o;->a:I

    .line 394
    .line 395
    move/from16 v26, v13

    .line 396
    .line 397
    const/4 v13, 0x1

    .line 398
    if-ne v2, v13, :cond_1c

    .line 399
    .line 400
    iget v2, v3, LR0/g;->m:I

    .line 401
    .line 402
    invoke-static {v10, v2}, Ljava/lang/Math;->min(II)I

    .line 403
    .line 404
    .line 405
    move-result v2

    .line 406
    goto :goto_11

    .line 407
    :cond_1c
    move v2, v10

    .line 408
    :goto_11
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    .line 409
    .line 410
    .line 411
    move-result v1

    .line 412
    if-lez v12, :cond_1d

    .line 413
    .line 414
    invoke-static {v12, v1}, Ljava/lang/Math;->min(II)I

    .line 415
    .line 416
    .line 417
    move-result v1

    .line 418
    :cond_1d
    if-eq v1, v10, :cond_1e

    .line 419
    .line 420
    add-int/lit8 v15, v15, 0x1

    .line 421
    .line 422
    move v10, v1

    .line 423
    :cond_1e
    invoke-virtual {v3, v10}, LR0/g;->d(I)V

    .line 424
    .line 425
    .line 426
    :goto_12
    add-int/lit8 v13, v26, 0x1

    .line 427
    .line 428
    move/from16 v1, v17

    .line 429
    .line 430
    move/from16 v2, v18

    .line 431
    .line 432
    move/from16 v3, v23

    .line 433
    .line 434
    move/from16 v10, v24

    .line 435
    .line 436
    move/from16 v12, v25

    .line 437
    .line 438
    goto :goto_e

    .line 439
    :cond_1f
    move/from16 v17, v1

    .line 440
    .line 441
    move/from16 v18, v2

    .line 442
    .line 443
    move/from16 v23, v3

    .line 444
    .line 445
    if-lez v15, :cond_23

    .line 446
    .line 447
    sub-int v3, v23, v15

    .line 448
    .line 449
    const/4 v1, 0x0

    .line 450
    const/4 v14, 0x0

    .line 451
    :goto_13
    if-ge v1, v7, :cond_24

    .line 452
    .line 453
    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 454
    .line 455
    .line 456
    move-result-object v2

    .line 457
    check-cast v2, LR0/o;

    .line 458
    .line 459
    iget-object v10, v2, LR0/o;->b:LQ0/d;

    .line 460
    .line 461
    iget v10, v10, LQ0/d;->g0:I

    .line 462
    .line 463
    const/16 v12, 0x8

    .line 464
    .line 465
    if-ne v10, v12, :cond_20

    .line 466
    .line 467
    goto :goto_14

    .line 468
    :cond_20
    if-lez v1, :cond_21

    .line 469
    .line 470
    if-lt v1, v8, :cond_21

    .line 471
    .line 472
    iget-object v10, v2, LR0/o;->h:LR0/f;

    .line 473
    .line 474
    iget v10, v10, LR0/f;->f:I

    .line 475
    .line 476
    add-int/2addr v14, v10

    .line 477
    :cond_21
    iget-object v10, v2, LR0/o;->e:LR0/g;

    .line 478
    .line 479
    iget v10, v10, LR0/f;->g:I

    .line 480
    .line 481
    add-int/2addr v14, v10

    .line 482
    if-ge v1, v11, :cond_22

    .line 483
    .line 484
    if-ge v1, v9, :cond_22

    .line 485
    .line 486
    iget-object v2, v2, LR0/o;->i:LR0/f;

    .line 487
    .line 488
    iget v2, v2, LR0/f;->f:I

    .line 489
    .line 490
    neg-int v2, v2

    .line 491
    add-int/2addr v14, v2

    .line 492
    :cond_22
    :goto_14
    add-int/lit8 v1, v1, 0x1

    .line 493
    .line 494
    goto :goto_13

    .line 495
    :cond_23
    move/from16 v3, v23

    .line 496
    .line 497
    :cond_24
    iget v1, v0, LR0/c;->l:I

    .line 498
    .line 499
    const/4 v2, 0x2

    .line 500
    if-ne v1, v2, :cond_25

    .line 501
    .line 502
    if-nez v15, :cond_25

    .line 503
    .line 504
    const/4 v1, 0x0

    .line 505
    iput v1, v0, LR0/c;->l:I

    .line 506
    .line 507
    goto :goto_15

    .line 508
    :cond_25
    const/4 v1, 0x0

    .line 509
    goto :goto_15

    .line 510
    :cond_26
    move/from16 v17, v1

    .line 511
    .line 512
    move/from16 v18, v2

    .line 513
    .line 514
    move/from16 v23, v3

    .line 515
    .line 516
    const/4 v1, 0x0

    .line 517
    const/4 v2, 0x2

    .line 518
    :goto_15
    if-le v14, v4, :cond_27

    .line 519
    .line 520
    iput v2, v0, LR0/c;->l:I

    .line 521
    .line 522
    :cond_27
    if-lez v5, :cond_28

    .line 523
    .line 524
    if-nez v3, :cond_28

    .line 525
    .line 526
    if-ne v8, v9, :cond_28

    .line 527
    .line 528
    iput v2, v0, LR0/c;->l:I

    .line 529
    .line 530
    :cond_28
    iget v2, v0, LR0/c;->l:I

    .line 531
    .line 532
    const/4 v12, 0x1

    .line 533
    if-ne v2, v12, :cond_38

    .line 534
    .line 535
    if-le v5, v12, :cond_29

    .line 536
    .line 537
    sub-int/2addr v4, v14

    .line 538
    sub-int/2addr v5, v12

    .line 539
    div-int/2addr v4, v5

    .line 540
    goto :goto_16

    .line 541
    :cond_29
    if-ne v5, v12, :cond_2a

    .line 542
    .line 543
    sub-int/2addr v4, v14

    .line 544
    const/16 v16, 0x2

    .line 545
    .line 546
    div-int/lit8 v4, v4, 0x2

    .line 547
    .line 548
    goto :goto_16

    .line 549
    :cond_2a
    move v4, v1

    .line 550
    :goto_16
    if-lez v3, :cond_2b

    .line 551
    .line 552
    move v4, v1

    .line 553
    :cond_2b
    move v5, v1

    .line 554
    move/from16 v1, v17

    .line 555
    .line 556
    :goto_17
    if-ge v5, v7, :cond_56

    .line 557
    .line 558
    if-eqz v22, :cond_2c

    .line 559
    .line 560
    add-int/lit8 v2, v5, 0x1

    .line 561
    .line 562
    sub-int v2, v7, v2

    .line 563
    .line 564
    goto :goto_18

    .line 565
    :cond_2c
    move v2, v5

    .line 566
    :goto_18
    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 567
    .line 568
    .line 569
    move-result-object v2

    .line 570
    check-cast v2, LR0/o;

    .line 571
    .line 572
    iget-object v3, v2, LR0/o;->b:LQ0/d;

    .line 573
    .line 574
    iget v3, v3, LQ0/d;->g0:I

    .line 575
    .line 576
    iget-object v10, v2, LR0/o;->i:LR0/f;

    .line 577
    .line 578
    iget-object v12, v2, LR0/o;->h:LR0/f;

    .line 579
    .line 580
    const/16 v13, 0x8

    .line 581
    .line 582
    if-ne v3, v13, :cond_2d

    .line 583
    .line 584
    invoke-virtual {v12, v1}, LR0/f;->d(I)V

    .line 585
    .line 586
    .line 587
    invoke-virtual {v10, v1}, LR0/f;->d(I)V

    .line 588
    .line 589
    .line 590
    goto :goto_1f

    .line 591
    :cond_2d
    if-lez v5, :cond_2f

    .line 592
    .line 593
    if-eqz v22, :cond_2e

    .line 594
    .line 595
    sub-int/2addr v1, v4

    .line 596
    goto :goto_19

    .line 597
    :cond_2e
    add-int/2addr v1, v4

    .line 598
    :cond_2f
    :goto_19
    if-lez v5, :cond_31

    .line 599
    .line 600
    if-lt v5, v8, :cond_31

    .line 601
    .line 602
    if-eqz v22, :cond_30

    .line 603
    .line 604
    iget v3, v12, LR0/f;->f:I

    .line 605
    .line 606
    sub-int/2addr v1, v3

    .line 607
    goto :goto_1a

    .line 608
    :cond_30
    iget v3, v12, LR0/f;->f:I

    .line 609
    .line 610
    add-int/2addr v1, v3

    .line 611
    :cond_31
    :goto_1a
    if-eqz v22, :cond_32

    .line 612
    .line 613
    invoke-virtual {v10, v1}, LR0/f;->d(I)V

    .line 614
    .line 615
    .line 616
    goto :goto_1b

    .line 617
    :cond_32
    invoke-virtual {v12, v1}, LR0/f;->d(I)V

    .line 618
    .line 619
    .line 620
    :goto_1b
    iget-object v3, v2, LR0/o;->e:LR0/g;

    .line 621
    .line 622
    iget v13, v3, LR0/f;->g:I

    .line 623
    .line 624
    iget v14, v2, LR0/o;->d:I

    .line 625
    .line 626
    const/4 v15, 0x3

    .line 627
    if-ne v14, v15, :cond_33

    .line 628
    .line 629
    iget v14, v2, LR0/o;->a:I

    .line 630
    .line 631
    const/4 v15, 0x1

    .line 632
    if-ne v14, v15, :cond_33

    .line 633
    .line 634
    iget v13, v3, LR0/g;->m:I

    .line 635
    .line 636
    :cond_33
    if-eqz v22, :cond_34

    .line 637
    .line 638
    sub-int/2addr v1, v13

    .line 639
    goto :goto_1c

    .line 640
    :cond_34
    add-int/2addr v1, v13

    .line 641
    :goto_1c
    if-eqz v22, :cond_35

    .line 642
    .line 643
    invoke-virtual {v12, v1}, LR0/f;->d(I)V

    .line 644
    .line 645
    .line 646
    :goto_1d
    const/4 v12, 0x1

    .line 647
    goto :goto_1e

    .line 648
    :cond_35
    invoke-virtual {v10, v1}, LR0/f;->d(I)V

    .line 649
    .line 650
    .line 651
    goto :goto_1d

    .line 652
    :goto_1e
    iput-boolean v12, v2, LR0/o;->g:Z

    .line 653
    .line 654
    if-ge v5, v11, :cond_37

    .line 655
    .line 656
    if-ge v5, v9, :cond_37

    .line 657
    .line 658
    if-eqz v22, :cond_36

    .line 659
    .line 660
    iget v2, v10, LR0/f;->f:I

    .line 661
    .line 662
    neg-int v2, v2

    .line 663
    sub-int/2addr v1, v2

    .line 664
    goto :goto_1f

    .line 665
    :cond_36
    iget v2, v10, LR0/f;->f:I

    .line 666
    .line 667
    neg-int v2, v2

    .line 668
    add-int/2addr v1, v2

    .line 669
    :cond_37
    :goto_1f
    add-int/lit8 v5, v5, 0x1

    .line 670
    .line 671
    goto :goto_17

    .line 672
    :cond_38
    if-nez v2, :cond_45

    .line 673
    .line 674
    sub-int/2addr v4, v14

    .line 675
    const/16 v21, 0x1

    .line 676
    .line 677
    add-int/lit8 v5, v5, 0x1

    .line 678
    .line 679
    div-int/2addr v4, v5

    .line 680
    if-lez v3, :cond_39

    .line 681
    .line 682
    move v4, v1

    .line 683
    :cond_39
    move v5, v1

    .line 684
    move/from16 v1, v17

    .line 685
    .line 686
    :goto_20
    if-ge v5, v7, :cond_56

    .line 687
    .line 688
    if-eqz v22, :cond_3a

    .line 689
    .line 690
    add-int/lit8 v2, v5, 0x1

    .line 691
    .line 692
    sub-int v2, v7, v2

    .line 693
    .line 694
    goto :goto_21

    .line 695
    :cond_3a
    move v2, v5

    .line 696
    :goto_21
    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 697
    .line 698
    .line 699
    move-result-object v2

    .line 700
    check-cast v2, LR0/o;

    .line 701
    .line 702
    iget-object v3, v2, LR0/o;->b:LQ0/d;

    .line 703
    .line 704
    iget v3, v3, LQ0/d;->g0:I

    .line 705
    .line 706
    iget-object v10, v2, LR0/o;->i:LR0/f;

    .line 707
    .line 708
    iget-object v12, v2, LR0/o;->h:LR0/f;

    .line 709
    .line 710
    const/16 v13, 0x8

    .line 711
    .line 712
    if-ne v3, v13, :cond_3b

    .line 713
    .line 714
    invoke-virtual {v12, v1}, LR0/f;->d(I)V

    .line 715
    .line 716
    .line 717
    invoke-virtual {v10, v1}, LR0/f;->d(I)V

    .line 718
    .line 719
    .line 720
    goto :goto_27

    .line 721
    :cond_3b
    if-eqz v22, :cond_3c

    .line 722
    .line 723
    sub-int/2addr v1, v4

    .line 724
    goto :goto_22

    .line 725
    :cond_3c
    add-int/2addr v1, v4

    .line 726
    :goto_22
    if-lez v5, :cond_3e

    .line 727
    .line 728
    if-lt v5, v8, :cond_3e

    .line 729
    .line 730
    if-eqz v22, :cond_3d

    .line 731
    .line 732
    iget v3, v12, LR0/f;->f:I

    .line 733
    .line 734
    sub-int/2addr v1, v3

    .line 735
    goto :goto_23

    .line 736
    :cond_3d
    iget v3, v12, LR0/f;->f:I

    .line 737
    .line 738
    add-int/2addr v1, v3

    .line 739
    :cond_3e
    :goto_23
    if-eqz v22, :cond_3f

    .line 740
    .line 741
    invoke-virtual {v10, v1}, LR0/f;->d(I)V

    .line 742
    .line 743
    .line 744
    goto :goto_24

    .line 745
    :cond_3f
    invoke-virtual {v12, v1}, LR0/f;->d(I)V

    .line 746
    .line 747
    .line 748
    :goto_24
    iget-object v3, v2, LR0/o;->e:LR0/g;

    .line 749
    .line 750
    iget v13, v3, LR0/f;->g:I

    .line 751
    .line 752
    iget v14, v2, LR0/o;->d:I

    .line 753
    .line 754
    const/4 v15, 0x3

    .line 755
    if-ne v14, v15, :cond_40

    .line 756
    .line 757
    iget v2, v2, LR0/o;->a:I

    .line 758
    .line 759
    const/4 v15, 0x1

    .line 760
    if-ne v2, v15, :cond_40

    .line 761
    .line 762
    iget v2, v3, LR0/g;->m:I

    .line 763
    .line 764
    invoke-static {v13, v2}, Ljava/lang/Math;->min(II)I

    .line 765
    .line 766
    .line 767
    move-result v13

    .line 768
    :cond_40
    if-eqz v22, :cond_41

    .line 769
    .line 770
    sub-int/2addr v1, v13

    .line 771
    goto :goto_25

    .line 772
    :cond_41
    add-int/2addr v1, v13

    .line 773
    :goto_25
    if-eqz v22, :cond_42

    .line 774
    .line 775
    invoke-virtual {v12, v1}, LR0/f;->d(I)V

    .line 776
    .line 777
    .line 778
    goto :goto_26

    .line 779
    :cond_42
    invoke-virtual {v10, v1}, LR0/f;->d(I)V

    .line 780
    .line 781
    .line 782
    :goto_26
    if-ge v5, v11, :cond_44

    .line 783
    .line 784
    if-ge v5, v9, :cond_44

    .line 785
    .line 786
    if-eqz v22, :cond_43

    .line 787
    .line 788
    iget v2, v10, LR0/f;->f:I

    .line 789
    .line 790
    neg-int v2, v2

    .line 791
    sub-int/2addr v1, v2

    .line 792
    goto :goto_27

    .line 793
    :cond_43
    iget v2, v10, LR0/f;->f:I

    .line 794
    .line 795
    neg-int v2, v2

    .line 796
    add-int/2addr v1, v2

    .line 797
    :cond_44
    :goto_27
    add-int/lit8 v5, v5, 0x1

    .line 798
    .line 799
    goto :goto_20

    .line 800
    :cond_45
    const/4 v5, 0x2

    .line 801
    if-ne v2, v5, :cond_56

    .line 802
    .line 803
    iget v2, v0, LR0/o;->f:I

    .line 804
    .line 805
    if-nez v2, :cond_46

    .line 806
    .line 807
    iget-object v2, v0, LR0/o;->b:LQ0/d;

    .line 808
    .line 809
    iget v2, v2, LQ0/d;->d0:F

    .line 810
    .line 811
    goto :goto_28

    .line 812
    :cond_46
    iget-object v2, v0, LR0/o;->b:LQ0/d;

    .line 813
    .line 814
    iget v2, v2, LQ0/d;->e0:F

    .line 815
    .line 816
    :goto_28
    if-eqz v22, :cond_47

    .line 817
    .line 818
    const/high16 v5, 0x3f800000    # 1.0f

    .line 819
    .line 820
    sub-float v2, v5, v2

    .line 821
    .line 822
    :cond_47
    sub-int/2addr v4, v14

    .line 823
    int-to-float v4, v4

    .line 824
    mul-float/2addr v4, v2

    .line 825
    add-float v4, v4, v18

    .line 826
    .line 827
    float-to-int v2, v4

    .line 828
    if-ltz v2, :cond_48

    .line 829
    .line 830
    if-lez v3, :cond_49

    .line 831
    .line 832
    :cond_48
    move v2, v1

    .line 833
    :cond_49
    if-eqz v22, :cond_4a

    .line 834
    .line 835
    sub-int v2, v17, v2

    .line 836
    .line 837
    goto :goto_29

    .line 838
    :cond_4a
    add-int v2, v17, v2

    .line 839
    .line 840
    :goto_29
    move v5, v1

    .line 841
    :goto_2a
    if-ge v5, v7, :cond_56

    .line 842
    .line 843
    if-eqz v22, :cond_4b

    .line 844
    .line 845
    add-int/lit8 v1, v5, 0x1

    .line 846
    .line 847
    sub-int v1, v7, v1

    .line 848
    .line 849
    goto :goto_2b

    .line 850
    :cond_4b
    move v1, v5

    .line 851
    :goto_2b
    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 852
    .line 853
    .line 854
    move-result-object v1

    .line 855
    check-cast v1, LR0/o;

    .line 856
    .line 857
    iget-object v3, v1, LR0/o;->b:LQ0/d;

    .line 858
    .line 859
    iget v3, v3, LQ0/d;->g0:I

    .line 860
    .line 861
    iget-object v4, v1, LR0/o;->i:LR0/f;

    .line 862
    .line 863
    iget-object v10, v1, LR0/o;->h:LR0/f;

    .line 864
    .line 865
    const/16 v13, 0x8

    .line 866
    .line 867
    if-ne v3, v13, :cond_4c

    .line 868
    .line 869
    invoke-virtual {v10, v2}, LR0/f;->d(I)V

    .line 870
    .line 871
    .line 872
    invoke-virtual {v4, v2}, LR0/f;->d(I)V

    .line 873
    .line 874
    .line 875
    const/4 v14, 0x1

    .line 876
    const/4 v15, 0x3

    .line 877
    goto :goto_31

    .line 878
    :cond_4c
    if-lez v5, :cond_4e

    .line 879
    .line 880
    if-lt v5, v8, :cond_4e

    .line 881
    .line 882
    if-eqz v22, :cond_4d

    .line 883
    .line 884
    iget v3, v10, LR0/f;->f:I

    .line 885
    .line 886
    sub-int/2addr v2, v3

    .line 887
    goto :goto_2c

    .line 888
    :cond_4d
    iget v3, v10, LR0/f;->f:I

    .line 889
    .line 890
    add-int/2addr v2, v3

    .line 891
    :cond_4e
    :goto_2c
    if-eqz v22, :cond_4f

    .line 892
    .line 893
    invoke-virtual {v4, v2}, LR0/f;->d(I)V

    .line 894
    .line 895
    .line 896
    goto :goto_2d

    .line 897
    :cond_4f
    invoke-virtual {v10, v2}, LR0/f;->d(I)V

    .line 898
    .line 899
    .line 900
    :goto_2d
    iget-object v3, v1, LR0/o;->e:LR0/g;

    .line 901
    .line 902
    iget v12, v3, LR0/f;->g:I

    .line 903
    .line 904
    iget v14, v1, LR0/o;->d:I

    .line 905
    .line 906
    const/4 v15, 0x3

    .line 907
    if-ne v14, v15, :cond_50

    .line 908
    .line 909
    iget v1, v1, LR0/o;->a:I

    .line 910
    .line 911
    const/4 v14, 0x1

    .line 912
    if-ne v1, v14, :cond_51

    .line 913
    .line 914
    iget v12, v3, LR0/g;->m:I

    .line 915
    .line 916
    goto :goto_2e

    .line 917
    :cond_50
    const/4 v14, 0x1

    .line 918
    :cond_51
    :goto_2e
    if-eqz v22, :cond_52

    .line 919
    .line 920
    sub-int/2addr v2, v12

    .line 921
    goto :goto_2f

    .line 922
    :cond_52
    add-int/2addr v2, v12

    .line 923
    :goto_2f
    if-eqz v22, :cond_53

    .line 924
    .line 925
    invoke-virtual {v10, v2}, LR0/f;->d(I)V

    .line 926
    .line 927
    .line 928
    goto :goto_30

    .line 929
    :cond_53
    invoke-virtual {v4, v2}, LR0/f;->d(I)V

    .line 930
    .line 931
    .line 932
    :goto_30
    if-ge v5, v11, :cond_55

    .line 933
    .line 934
    if-ge v5, v9, :cond_55

    .line 935
    .line 936
    if-eqz v22, :cond_54

    .line 937
    .line 938
    iget v1, v4, LR0/f;->f:I

    .line 939
    .line 940
    neg-int v1, v1

    .line 941
    sub-int/2addr v2, v1

    .line 942
    goto :goto_31

    .line 943
    :cond_54
    iget v1, v4, LR0/f;->f:I

    .line 944
    .line 945
    neg-int v1, v1

    .line 946
    add-int/2addr v2, v1

    .line 947
    :cond_55
    :goto_31
    add-int/lit8 v5, v5, 0x1

    .line 948
    .line 949
    goto :goto_2a

    .line 950
    :cond_56
    :goto_32
    return-void
.end method

.method public final d()V
    .locals 7

    .line 1
    iget-object v0, p0, LR0/c;->k:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    check-cast v2, LR0/o;

    .line 18
    .line 19
    invoke-virtual {v2}, LR0/o;->d()V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    const/4 v2, 0x1

    .line 28
    if-ge v1, v2, :cond_1

    .line 29
    .line 30
    return-void

    .line 31
    :cond_1
    const/4 v3, 0x0

    .line 32
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    check-cast v4, LR0/o;

    .line 37
    .line 38
    iget-object v4, v4, LR0/o;->b:LQ0/d;

    .line 39
    .line 40
    sub-int/2addr v1, v2

    .line 41
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    check-cast v0, LR0/o;

    .line 46
    .line 47
    iget-object v0, v0, LR0/o;->b:LQ0/d;

    .line 48
    .line 49
    iget v1, p0, LR0/o;->f:I

    .line 50
    .line 51
    iget-object v5, p0, LR0/o;->i:LR0/f;

    .line 52
    .line 53
    iget-object v6, p0, LR0/o;->h:LR0/f;

    .line 54
    .line 55
    if-nez v1, :cond_5

    .line 56
    .line 57
    iget-object v1, v4, LQ0/d;->I:LQ0/c;

    .line 58
    .line 59
    iget-object v0, v0, LQ0/d;->K:LQ0/c;

    .line 60
    .line 61
    invoke-static {v1, v3}, LR0/o;->i(LQ0/c;I)LR0/f;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    invoke-virtual {v1}, LQ0/c;->e()I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    invoke-virtual {p0}, LR0/c;->m()LQ0/d;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    if-eqz v4, :cond_2

    .line 74
    .line 75
    iget-object v1, v4, LQ0/d;->I:LQ0/c;

    .line 76
    .line 77
    invoke-virtual {v1}, LQ0/c;->e()I

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    :cond_2
    if-eqz v2, :cond_3

    .line 82
    .line 83
    invoke-static {v6, v2, v1}, LR0/o;->b(LR0/f;LR0/f;I)V

    .line 84
    .line 85
    .line 86
    :cond_3
    invoke-static {v0, v3}, LR0/o;->i(LQ0/c;I)LR0/f;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-virtual {v0}, LQ0/c;->e()I

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    invoke-virtual {p0}, LR0/c;->n()LQ0/d;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    if-eqz v2, :cond_4

    .line 99
    .line 100
    iget-object v0, v2, LQ0/d;->K:LQ0/c;

    .line 101
    .line 102
    invoke-virtual {v0}, LQ0/c;->e()I

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    :cond_4
    if-eqz v1, :cond_9

    .line 107
    .line 108
    neg-int v0, v0

    .line 109
    invoke-static {v5, v1, v0}, LR0/o;->b(LR0/f;LR0/f;I)V

    .line 110
    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_5
    iget-object v1, v4, LQ0/d;->J:LQ0/c;

    .line 114
    .line 115
    iget-object v0, v0, LQ0/d;->L:LQ0/c;

    .line 116
    .line 117
    invoke-static {v1, v2}, LR0/o;->i(LQ0/c;I)LR0/f;

    .line 118
    .line 119
    .line 120
    move-result-object v3

    .line 121
    invoke-virtual {v1}, LQ0/c;->e()I

    .line 122
    .line 123
    .line 124
    move-result v1

    .line 125
    invoke-virtual {p0}, LR0/c;->m()LQ0/d;

    .line 126
    .line 127
    .line 128
    move-result-object v4

    .line 129
    if-eqz v4, :cond_6

    .line 130
    .line 131
    iget-object v1, v4, LQ0/d;->J:LQ0/c;

    .line 132
    .line 133
    invoke-virtual {v1}, LQ0/c;->e()I

    .line 134
    .line 135
    .line 136
    move-result v1

    .line 137
    :cond_6
    if-eqz v3, :cond_7

    .line 138
    .line 139
    invoke-static {v6, v3, v1}, LR0/o;->b(LR0/f;LR0/f;I)V

    .line 140
    .line 141
    .line 142
    :cond_7
    invoke-static {v0, v2}, LR0/o;->i(LQ0/c;I)LR0/f;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    invoke-virtual {v0}, LQ0/c;->e()I

    .line 147
    .line 148
    .line 149
    move-result v0

    .line 150
    invoke-virtual {p0}, LR0/c;->n()LQ0/d;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    if-eqz v2, :cond_8

    .line 155
    .line 156
    iget-object v0, v2, LQ0/d;->L:LQ0/c;

    .line 157
    .line 158
    invoke-virtual {v0}, LQ0/c;->e()I

    .line 159
    .line 160
    .line 161
    move-result v0

    .line 162
    :cond_8
    if-eqz v1, :cond_9

    .line 163
    .line 164
    neg-int v0, v0

    .line 165
    invoke-static {v5, v1, v0}, LR0/o;->b(LR0/f;LR0/f;I)V

    .line 166
    .line 167
    .line 168
    :cond_9
    :goto_1
    iput-object p0, v6, LR0/f;->a:LR0/o;

    .line 169
    .line 170
    iput-object p0, v5, LR0/f;->a:LR0/o;

    .line 171
    .line 172
    return-void
.end method

.method public final e()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, LR0/c;->k:Ljava/util/ArrayList;

    .line 3
    .line 4
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 5
    .line 6
    .line 7
    move-result v2

    .line 8
    if-ge v0, v2, :cond_0

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    check-cast v1, LR0/o;

    .line 15
    .line 16
    invoke-virtual {v1}, LR0/o;->e()V

    .line 17
    .line 18
    .line 19
    add-int/lit8 v0, v0, 0x1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    return-void
.end method

.method public final f()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, LR0/o;->c:LR0/l;

    .line 3
    .line 4
    iget-object v0, p0, LR0/c;->k:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, LR0/o;

    .line 21
    .line 22
    invoke-virtual {v1}, LR0/o;->f()V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    return-void
.end method

.method public final j()J
    .locals 8

    .line 1
    iget-object v0, p0, LR0/c;->k:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const-wide/16 v2, 0x0

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    :goto_0
    if-ge v4, v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v5

    .line 16
    check-cast v5, LR0/o;

    .line 17
    .line 18
    iget-object v6, v5, LR0/o;->h:LR0/f;

    .line 19
    .line 20
    iget v6, v6, LR0/f;->f:I

    .line 21
    .line 22
    int-to-long v6, v6

    .line 23
    add-long/2addr v2, v6

    .line 24
    invoke-virtual {v5}, LR0/o;->j()J

    .line 25
    .line 26
    .line 27
    move-result-wide v6

    .line 28
    add-long/2addr v6, v2

    .line 29
    iget-object v2, v5, LR0/o;->i:LR0/f;

    .line 30
    .line 31
    iget v2, v2, LR0/f;->f:I

    .line 32
    .line 33
    int-to-long v2, v2

    .line 34
    add-long/2addr v2, v6

    .line 35
    add-int/lit8 v4, v4, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    return-wide v2
.end method

.method public final k()Z
    .locals 5

    .line 1
    iget-object v0, p0, LR0/c;->k:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    move v3, v2

    .line 9
    :goto_0
    if-ge v3, v1, :cond_1

    .line 10
    .line 11
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    check-cast v4, LR0/o;

    .line 16
    .line 17
    invoke-virtual {v4}, LR0/o;->k()Z

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    if-nez v4, :cond_0

    .line 22
    .line 23
    return v2

    .line 24
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    const/4 v0, 0x1

    .line 28
    return v0
.end method

.method public final m()LQ0/d;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, LR0/c;->k:Ljava/util/ArrayList;

    .line 3
    .line 4
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 5
    .line 6
    .line 7
    move-result v2

    .line 8
    if-ge v0, v2, :cond_1

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    check-cast v1, LR0/o;

    .line 15
    .line 16
    iget-object v1, v1, LR0/o;->b:LQ0/d;

    .line 17
    .line 18
    iget v2, v1, LQ0/d;->g0:I

    .line 19
    .line 20
    const/16 v3, 0x8

    .line 21
    .line 22
    if-eq v2, v3, :cond_0

    .line 23
    .line 24
    return-object v1

    .line 25
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    const/4 v0, 0x0

    .line 29
    return-object v0
.end method

.method public final n()LQ0/d;
    .locals 5

    .line 1
    iget-object v0, p0, LR0/c;->k:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    add-int/lit8 v1, v1, -0x1

    .line 8
    .line 9
    :goto_0
    if-ltz v1, :cond_1

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    check-cast v2, LR0/o;

    .line 16
    .line 17
    iget-object v2, v2, LR0/o;->b:LQ0/d;

    .line 18
    .line 19
    iget v3, v2, LQ0/d;->g0:I

    .line 20
    .line 21
    const/16 v4, 0x8

    .line 22
    .line 23
    if-eq v3, v4, :cond_0

    .line 24
    .line 25
    return-object v2

    .line 26
    :cond_0
    add-int/lit8 v1, v1, -0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    const/4 v0, 0x0

    .line 30
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "ChainRun "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget v1, p0, LR0/o;->f:I

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    const-string v1, "horizontal : "

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const-string v1, "vertical : "

    .line 16
    .line 17
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, LR0/c;->k:Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    check-cast v2, LR0/o;

    .line 37
    .line 38
    const-string v3, "<"

    .line 39
    .line 40
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string v2, "> "

    .line 47
    .line 48
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    return-object v0
.end method
