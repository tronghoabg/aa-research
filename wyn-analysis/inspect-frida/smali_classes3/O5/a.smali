.class public final LO5/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LJ5/k;


# instance fields
.field public final a:LY4/b;

.field public b:Lf6/N;

.field public c:I

.field public d:I

.field public e:I

.field public f:J

.field public g:Lc6/c;

.field public h:LJ5/h;

.field public i:LA2/d;

.field public j:LR5/k;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LY4/b;

    .line 5
    .line 6
    const/4 v1, 0x6

    .line 7
    invoke-direct {v0, v1}, LY4/b;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, LO5/a;->a:LY4/b;

    .line 11
    .line 12
    const-wide/16 v0, -0x1

    .line 13
    .line 14
    iput-wide v0, p0, LO5/a;->f:J

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final a(JJ)V
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    iput p1, p0, LO5/a;->c:I

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    iput-object p1, p0, LO5/a;->j:LR5/k;

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget v0, p0, LO5/a;->c:I

    .line 15
    .line 16
    const/4 v1, 0x5

    .line 17
    if-ne v0, v1, :cond_1

    .line 18
    .line 19
    iget-object v0, p0, LO5/a;->j:LR5/k;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p1, p2, p3, p4}, LR5/k;->a(JJ)V

    .line 25
    .line 26
    .line 27
    :cond_1
    return-void
.end method

.method public final b()V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [LW5/b;

    .line 3
    .line 4
    invoke-virtual {p0, v0}, LO5/a;->c([LW5/b;)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, LO5/a;->b:Lf6/N;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Lf6/N;->l()V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, LO5/a;->b:Lf6/N;

    .line 16
    .line 17
    new-instance v1, LJ5/o;

    .line 18
    .line 19
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    invoke-direct {v1, v2, v3}, LJ5/o;-><init>(J)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1}, Lf6/N;->x(LJ5/t;)V

    .line 28
    .line 29
    .line 30
    const/4 v0, 0x6

    .line 31
    iput v0, p0, LO5/a;->c:I

    .line 32
    .line 33
    return-void
.end method

.method public final varargs c([LW5/b;)V
    .locals 3

    .line 1
    iget-object v0, p0, LO5/a;->b:Lf6/N;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const/16 v1, 0x400

    .line 7
    .line 8
    const/4 v2, 0x4

    .line 9
    invoke-virtual {v0, v1, v2}, Lf6/N;->m(II)LJ5/w;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    new-instance v1, LE5/S;

    .line 14
    .line 15
    invoke-direct {v1}, LE5/S;-><init>()V

    .line 16
    .line 17
    .line 18
    const-string v2, "image/jpeg"

    .line 19
    .line 20
    iput-object v2, v1, LE5/S;->j:Ljava/lang/String;

    .line 21
    .line 22
    new-instance v2, LW5/c;

    .line 23
    .line 24
    invoke-direct {v2, p1}, LW5/c;-><init>([LW5/b;)V

    .line 25
    .line 26
    .line 27
    iput-object v2, v1, LE5/S;->i:LW5/c;

    .line 28
    .line 29
    new-instance p1, LE5/T;

    .line 30
    .line 31
    invoke-direct {p1, v1}, LE5/T;-><init>(LE5/S;)V

    .line 32
    .line 33
    .line 34
    check-cast v0, Lf6/U;

    .line 35
    .line 36
    invoke-virtual {v0, p1}, Lf6/U;->a(LE5/T;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public final g(LJ5/l;LJ5/n;)I
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    const/4 v3, -0x1

    .line 8
    const/4 v4, 0x1

    .line 9
    const/4 v5, 0x0

    .line 10
    iget v6, v0, LO5/a;->c:I

    .line 11
    .line 12
    iget-object v7, v0, LO5/a;->a:LY4/b;

    .line 13
    .line 14
    const-wide/16 v8, -0x1

    .line 15
    .line 16
    const/4 v10, 0x4

    .line 17
    const/4 v11, 0x2

    .line 18
    if-eqz v6, :cond_17

    .line 19
    .line 20
    if-eq v6, v4, :cond_16

    .line 21
    .line 22
    if-eq v6, v11, :cond_a

    .line 23
    .line 24
    const/4 v8, 0x5

    .line 25
    if-eq v6, v10, :cond_5

    .line 26
    .line 27
    if-eq v6, v8, :cond_1

    .line 28
    .line 29
    const/4 v1, 0x6

    .line 30
    if-ne v6, v1, :cond_0

    .line 31
    .line 32
    return v3

    .line 33
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 34
    .line 35
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 36
    .line 37
    .line 38
    throw v1

    .line 39
    :cond_1
    iget-object v3, v0, LO5/a;->i:LA2/d;

    .line 40
    .line 41
    if-eqz v3, :cond_2

    .line 42
    .line 43
    iget-object v3, v0, LO5/a;->h:LJ5/h;

    .line 44
    .line 45
    if-eq v1, v3, :cond_3

    .line 46
    .line 47
    :cond_2
    check-cast v1, LJ5/h;

    .line 48
    .line 49
    iput-object v1, v0, LO5/a;->h:LJ5/h;

    .line 50
    .line 51
    new-instance v3, LA2/d;

    .line 52
    .line 53
    iget-wide v5, v0, LO5/a;->f:J

    .line 54
    .line 55
    invoke-direct {v3, v1, v5, v6}, LA2/d;-><init>(LJ5/h;J)V

    .line 56
    .line 57
    .line 58
    iput-object v3, v0, LO5/a;->i:LA2/d;

    .line 59
    .line 60
    :cond_3
    iget-object v1, v0, LO5/a;->j:LR5/k;

    .line 61
    .line 62
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    iget-object v3, v0, LO5/a;->i:LA2/d;

    .line 66
    .line 67
    invoke-virtual {v1, v3, v2}, LR5/k;->g(LJ5/l;LJ5/n;)I

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-ne v1, v4, :cond_4

    .line 72
    .line 73
    iget-wide v3, v2, LJ5/n;->a:J

    .line 74
    .line 75
    iget-wide v5, v0, LO5/a;->f:J

    .line 76
    .line 77
    add-long/2addr v3, v5

    .line 78
    iput-wide v3, v2, LJ5/n;->a:J

    .line 79
    .line 80
    :cond_4
    return v1

    .line 81
    :cond_5
    move-object v3, v1

    .line 82
    check-cast v3, LJ5/h;

    .line 83
    .line 84
    iget-wide v9, v3, LJ5/h;->d:J

    .line 85
    .line 86
    iget-wide v11, v0, LO5/a;->f:J

    .line 87
    .line 88
    cmp-long v3, v9, v11

    .line 89
    .line 90
    if-eqz v3, :cond_6

    .line 91
    .line 92
    iput-wide v11, v2, LJ5/n;->a:J

    .line 93
    .line 94
    return v4

    .line 95
    :cond_6
    iget-object v2, v7, LY4/b;->a:[B

    .line 96
    .line 97
    check-cast v1, LJ5/h;

    .line 98
    .line 99
    invoke-virtual {v1, v2, v5, v4, v4}, LJ5/h;->c([BIIZ)Z

    .line 100
    .line 101
    .line 102
    move-result v2

    .line 103
    if-nez v2, :cond_7

    .line 104
    .line 105
    invoke-virtual {v0}, LO5/a;->b()V

    .line 106
    .line 107
    .line 108
    return v5

    .line 109
    :cond_7
    iput v5, v1, LJ5/h;->f:I

    .line 110
    .line 111
    iget-object v2, v0, LO5/a;->j:LR5/k;

    .line 112
    .line 113
    if-nez v2, :cond_8

    .line 114
    .line 115
    new-instance v2, LR5/k;

    .line 116
    .line 117
    invoke-direct {v2}, LR5/k;-><init>()V

    .line 118
    .line 119
    .line 120
    iput-object v2, v0, LO5/a;->j:LR5/k;

    .line 121
    .line 122
    :cond_8
    new-instance v2, LA2/d;

    .line 123
    .line 124
    iget-wide v6, v0, LO5/a;->f:J

    .line 125
    .line 126
    invoke-direct {v2, v1, v6, v7}, LA2/d;-><init>(LJ5/h;J)V

    .line 127
    .line 128
    .line 129
    iput-object v2, v0, LO5/a;->i:LA2/d;

    .line 130
    .line 131
    iget-object v1, v0, LO5/a;->j:LR5/k;

    .line 132
    .line 133
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    invoke-static {v2, v5, v5}, LR5/i;->h(LJ5/l;ZZ)Z

    .line 137
    .line 138
    .line 139
    move-result v1

    .line 140
    if-eqz v1, :cond_9

    .line 141
    .line 142
    iget-object v1, v0, LO5/a;->j:LR5/k;

    .line 143
    .line 144
    new-instance v2, LA2/d;

    .line 145
    .line 146
    iget-wide v6, v0, LO5/a;->f:J

    .line 147
    .line 148
    iget-object v3, v0, LO5/a;->b:Lf6/N;

    .line 149
    .line 150
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    const/4 v9, 0x7

    .line 154
    invoke-direct {v2, v6, v7, v3, v9}, LA2/d;-><init>(JLjava/lang/Object;I)V

    .line 155
    .line 156
    .line 157
    iput-object v2, v1, LR5/k;->q:LJ5/m;

    .line 158
    .line 159
    iget-object v1, v0, LO5/a;->g:Lc6/c;

    .line 160
    .line 161
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    new-array v2, v4, [LW5/b;

    .line 165
    .line 166
    aput-object v1, v2, v5

    .line 167
    .line 168
    invoke-virtual {v0, v2}, LO5/a;->c([LW5/b;)V

    .line 169
    .line 170
    .line 171
    iput v8, v0, LO5/a;->c:I

    .line 172
    .line 173
    return v5

    .line 174
    :cond_9
    invoke-virtual {v0}, LO5/a;->b()V

    .line 175
    .line 176
    .line 177
    return v5

    .line 178
    :cond_a
    iget v2, v0, LO5/a;->d:I

    .line 179
    .line 180
    const v6, 0xffe1

    .line 181
    .line 182
    .line 183
    if-ne v2, v6, :cond_14

    .line 184
    .line 185
    new-instance v2, LY4/b;

    .line 186
    .line 187
    iget v6, v0, LO5/a;->e:I

    .line 188
    .line 189
    invoke-direct {v2, v6}, LY4/b;-><init>(I)V

    .line 190
    .line 191
    .line 192
    iget-object v6, v2, LY4/b;->a:[B

    .line 193
    .line 194
    iget v7, v0, LO5/a;->e:I

    .line 195
    .line 196
    move-object v10, v1

    .line 197
    check-cast v10, LJ5/h;

    .line 198
    .line 199
    invoke-virtual {v10, v6, v5, v7, v5}, LJ5/h;->f([BIIZ)Z

    .line 200
    .line 201
    .line 202
    iget-object v6, v0, LO5/a;->g:Lc6/c;

    .line 203
    .line 204
    if-nez v6, :cond_15

    .line 205
    .line 206
    const-string v6, "http://ns.adobe.com/xap/1.0/"

    .line 207
    .line 208
    invoke-virtual {v2}, LY4/b;->l()Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v7

    .line 212
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 213
    .line 214
    .line 215
    move-result v6

    .line 216
    if-eqz v6, :cond_15

    .line 217
    .line 218
    invoke-virtual {v2}, LY4/b;->l()Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v2

    .line 222
    if-eqz v2, :cond_15

    .line 223
    .line 224
    check-cast v1, LJ5/h;

    .line 225
    .line 226
    iget-wide v6, v1, LJ5/h;->c:J

    .line 227
    .line 228
    cmp-long v1, v6, v8

    .line 229
    .line 230
    const/4 v10, 0x0

    .line 231
    if-nez v1, :cond_b

    .line 232
    .line 233
    goto/16 :goto_5

    .line 234
    .line 235
    :cond_b
    :try_start_0
    invoke-static {v2}, LO5/d;->a(Ljava/lang/String;)LA2/c;

    .line 236
    .line 237
    .line 238
    move-result-object v1
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_0
    .catch LE5/o0; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 239
    goto :goto_0

    .line 240
    :catch_0
    const-string v1, "MotionPhotoXmpParser"

    .line 241
    .line 242
    const-string v2, "Ignoring unexpected XMP metadata"

    .line 243
    .line 244
    invoke-static {v1, v2}, Lu6/a;->E(Ljava/lang/String;Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    move-object v1, v10

    .line 248
    :goto_0
    if-nez v1, :cond_c

    .line 249
    .line 250
    goto/16 :goto_5

    .line 251
    .line 252
    :cond_c
    iget-object v2, v1, LA2/c;->b:Ll8/e0;

    .line 253
    .line 254
    iget v12, v2, Ll8/e0;->d:I

    .line 255
    .line 256
    if-ge v12, v11, :cond_d

    .line 257
    .line 258
    goto/16 :goto_5

    .line 259
    .line 260
    :cond_d
    sub-int/2addr v12, v4

    .line 261
    move v4, v5

    .line 262
    move-wide v14, v8

    .line 263
    move-wide/from16 v16, v14

    .line 264
    .line 265
    move-wide/from16 v20, v16

    .line 266
    .line 267
    move-wide/from16 v22, v20

    .line 268
    .line 269
    :goto_1
    if-ltz v12, :cond_11

    .line 270
    .line 271
    invoke-virtual {v2, v12}, Ll8/e0;->get(I)Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v11

    .line 275
    check-cast v11, LO5/b;

    .line 276
    .line 277
    iget-object v13, v11, LO5/b;->a:Ljava/lang/String;

    .line 278
    .line 279
    move/from16 v18, v3

    .line 280
    .line 281
    const-string v3, "video/mp4"

    .line 282
    .line 283
    invoke-virtual {v3, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 284
    .line 285
    .line 286
    move-result v3

    .line 287
    or-int/2addr v3, v4

    .line 288
    if-nez v12, :cond_e

    .line 289
    .line 290
    move-wide/from16 v24, v8

    .line 291
    .line 292
    iget-wide v8, v11, LO5/b;->c:J

    .line 293
    .line 294
    sub-long/2addr v6, v8

    .line 295
    const-wide/16 v8, 0x0

    .line 296
    .line 297
    :goto_2
    move-wide/from16 v26, v8

    .line 298
    .line 299
    move-wide v8, v6

    .line 300
    move-wide/from16 v6, v26

    .line 301
    .line 302
    goto :goto_3

    .line 303
    :cond_e
    move-wide/from16 v24, v8

    .line 304
    .line 305
    iget-wide v8, v11, LO5/b;->b:J

    .line 306
    .line 307
    sub-long v8, v6, v8

    .line 308
    .line 309
    goto :goto_2

    .line 310
    :goto_3
    if-eqz v3, :cond_f

    .line 311
    .line 312
    cmp-long v4, v6, v8

    .line 313
    .line 314
    if-eqz v4, :cond_f

    .line 315
    .line 316
    sub-long v22, v8, v6

    .line 317
    .line 318
    move v4, v5

    .line 319
    move-wide/from16 v20, v6

    .line 320
    .line 321
    goto :goto_4

    .line 322
    :cond_f
    move v4, v3

    .line 323
    :goto_4
    if-nez v12, :cond_10

    .line 324
    .line 325
    move-wide v14, v6

    .line 326
    move-wide/from16 v16, v8

    .line 327
    .line 328
    :cond_10
    add-int/lit8 v12, v12, -0x1

    .line 329
    .line 330
    move/from16 v3, v18

    .line 331
    .line 332
    move-wide/from16 v8, v24

    .line 333
    .line 334
    goto :goto_1

    .line 335
    :cond_11
    move-wide/from16 v24, v8

    .line 336
    .line 337
    cmp-long v2, v20, v24

    .line 338
    .line 339
    if-eqz v2, :cond_13

    .line 340
    .line 341
    cmp-long v2, v22, v24

    .line 342
    .line 343
    if-eqz v2, :cond_13

    .line 344
    .line 345
    cmp-long v2, v14, v24

    .line 346
    .line 347
    if-eqz v2, :cond_13

    .line 348
    .line 349
    cmp-long v2, v16, v24

    .line 350
    .line 351
    if-nez v2, :cond_12

    .line 352
    .line 353
    goto :goto_5

    .line 354
    :cond_12
    new-instance v13, Lc6/c;

    .line 355
    .line 356
    iget-wide v1, v1, LA2/c;->a:J

    .line 357
    .line 358
    move-wide/from16 v18, v1

    .line 359
    .line 360
    invoke-direct/range {v13 .. v23}, Lc6/c;-><init>(JJJJJ)V

    .line 361
    .line 362
    .line 363
    move-object v10, v13

    .line 364
    :cond_13
    :goto_5
    iput-object v10, v0, LO5/a;->g:Lc6/c;

    .line 365
    .line 366
    if-eqz v10, :cond_15

    .line 367
    .line 368
    iget-wide v1, v10, Lc6/c;->d:J

    .line 369
    .line 370
    iput-wide v1, v0, LO5/a;->f:J

    .line 371
    .line 372
    goto :goto_6

    .line 373
    :cond_14
    iget v2, v0, LO5/a;->e:I

    .line 374
    .line 375
    check-cast v1, LJ5/h;

    .line 376
    .line 377
    invoke-virtual {v1, v2}, LJ5/h;->j(I)V

    .line 378
    .line 379
    .line 380
    :cond_15
    :goto_6
    iput v5, v0, LO5/a;->c:I

    .line 381
    .line 382
    goto :goto_7

    .line 383
    :cond_16
    invoke-virtual {v7, v11}, LY4/b;->x(I)V

    .line 384
    .line 385
    .line 386
    iget-object v2, v7, LY4/b;->a:[B

    .line 387
    .line 388
    check-cast v1, LJ5/h;

    .line 389
    .line 390
    invoke-virtual {v1, v2, v5, v11, v5}, LJ5/h;->f([BIIZ)Z

    .line 391
    .line 392
    .line 393
    invoke-virtual {v7}, LY4/b;->v()I

    .line 394
    .line 395
    .line 396
    move-result v1

    .line 397
    sub-int/2addr v1, v11

    .line 398
    iput v1, v0, LO5/a;->e:I

    .line 399
    .line 400
    iput v11, v0, LO5/a;->c:I

    .line 401
    .line 402
    return v5

    .line 403
    :cond_17
    move-wide/from16 v24, v8

    .line 404
    .line 405
    invoke-virtual {v7, v11}, LY4/b;->x(I)V

    .line 406
    .line 407
    .line 408
    iget-object v2, v7, LY4/b;->a:[B

    .line 409
    .line 410
    check-cast v1, LJ5/h;

    .line 411
    .line 412
    invoke-virtual {v1, v2, v5, v11, v5}, LJ5/h;->f([BIIZ)Z

    .line 413
    .line 414
    .line 415
    invoke-virtual {v7}, LY4/b;->v()I

    .line 416
    .line 417
    .line 418
    move-result v1

    .line 419
    iput v1, v0, LO5/a;->d:I

    .line 420
    .line 421
    const v2, 0xffda

    .line 422
    .line 423
    .line 424
    if-ne v1, v2, :cond_19

    .line 425
    .line 426
    iget-wide v1, v0, LO5/a;->f:J

    .line 427
    .line 428
    cmp-long v1, v1, v24

    .line 429
    .line 430
    if-eqz v1, :cond_18

    .line 431
    .line 432
    iput v10, v0, LO5/a;->c:I

    .line 433
    .line 434
    return v5

    .line 435
    :cond_18
    invoke-virtual {v0}, LO5/a;->b()V

    .line 436
    .line 437
    .line 438
    return v5

    .line 439
    :cond_19
    const v2, 0xffd0

    .line 440
    .line 441
    .line 442
    if-lt v1, v2, :cond_1a

    .line 443
    .line 444
    const v2, 0xffd9

    .line 445
    .line 446
    .line 447
    if-le v1, v2, :cond_1b

    .line 448
    .line 449
    :cond_1a
    const v2, 0xff01

    .line 450
    .line 451
    .line 452
    if-eq v1, v2, :cond_1b

    .line 453
    .line 454
    iput v4, v0, LO5/a;->c:I

    .line 455
    .line 456
    :cond_1b
    :goto_7
    return v5
.end method

.method public final h(Lf6/N;)V
    .locals 0

    .line 1
    iput-object p1, p0, LO5/a;->b:Lf6/N;

    .line 2
    .line 3
    return-void
.end method

.method public final i(LJ5/l;)Z
    .locals 6

    .line 1
    check-cast p1, LJ5/h;

    .line 2
    .line 3
    iget-object v0, p0, LO5/a;->a:LY4/b;

    .line 4
    .line 5
    const/4 v1, 0x2

    .line 6
    invoke-virtual {v0, v1}, LY4/b;->x(I)V

    .line 7
    .line 8
    .line 9
    iget-object v2, v0, LY4/b;->a:[B

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    invoke-virtual {p1, v2, v3, v1, v3}, LJ5/h;->c([BIIZ)Z

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, LY4/b;->v()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    const v4, 0xffd8

    .line 20
    .line 21
    .line 22
    if-eq v2, v4, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual {v0, v1}, LY4/b;->x(I)V

    .line 26
    .line 27
    .line 28
    iget-object v2, v0, LY4/b;->a:[B

    .line 29
    .line 30
    invoke-virtual {p1, v2, v3, v1, v3}, LJ5/h;->c([BIIZ)Z

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, LY4/b;->v()I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    iput v2, p0, LO5/a;->d:I

    .line 38
    .line 39
    const v4, 0xffe0

    .line 40
    .line 41
    .line 42
    if-ne v2, v4, :cond_1

    .line 43
    .line 44
    invoke-virtual {v0, v1}, LY4/b;->x(I)V

    .line 45
    .line 46
    .line 47
    iget-object v2, v0, LY4/b;->a:[B

    .line 48
    .line 49
    invoke-virtual {p1, v2, v3, v1, v3}, LJ5/h;->c([BIIZ)Z

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, LY4/b;->v()I

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    sub-int/2addr v2, v1

    .line 57
    invoke-virtual {p1, v2, v3}, LJ5/h;->b(IZ)Z

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, v1}, LY4/b;->x(I)V

    .line 61
    .line 62
    .line 63
    iget-object v2, v0, LY4/b;->a:[B

    .line 64
    .line 65
    invoke-virtual {p1, v2, v3, v1, v3}, LJ5/h;->c([BIIZ)Z

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, LY4/b;->v()I

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    iput v2, p0, LO5/a;->d:I

    .line 73
    .line 74
    :cond_1
    iget v2, p0, LO5/a;->d:I

    .line 75
    .line 76
    const v4, 0xffe1

    .line 77
    .line 78
    .line 79
    if-eq v2, v4, :cond_2

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_2
    invoke-virtual {p1, v1, v3}, LJ5/h;->b(IZ)Z

    .line 83
    .line 84
    .line 85
    const/4 v1, 0x6

    .line 86
    invoke-virtual {v0, v1}, LY4/b;->x(I)V

    .line 87
    .line 88
    .line 89
    iget-object v2, v0, LY4/b;->a:[B

    .line 90
    .line 91
    invoke-virtual {p1, v2, v3, v1, v3}, LJ5/h;->c([BIIZ)Z

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0}, LY4/b;->r()J

    .line 95
    .line 96
    .line 97
    move-result-wide v1

    .line 98
    const-wide/32 v4, 0x45786966    # 5.758429993E-315

    .line 99
    .line 100
    .line 101
    cmp-long p1, v1, v4

    .line 102
    .line 103
    if-nez p1, :cond_3

    .line 104
    .line 105
    invoke-virtual {v0}, LY4/b;->v()I

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    if-nez p1, :cond_3

    .line 110
    .line 111
    const/4 p1, 0x1

    .line 112
    return p1

    .line 113
    :cond_3
    :goto_0
    return v3
.end method

.method public final release()V
    .locals 1

    .line 1
    iget-object v0, p0, LO5/a;->j:LR5/k;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method
