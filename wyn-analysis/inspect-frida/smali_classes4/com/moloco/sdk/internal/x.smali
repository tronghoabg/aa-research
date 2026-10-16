.class public abstract Lcom/moloco/sdk/internal/x;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-wide v0, 0xff0280fbL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Le0/z;->c(J)J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    sput-wide v0, Lcom/moloco/sdk/internal/x;->a:J

    .line 11
    .line 12
    return-void
.end method

.method public static final a(LZ/k;Ljava/lang/String;Ljava/lang/String;JJLtf/a;LN/o;I)V
    .locals 31

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-wide/from16 v6, p5

    .line 6
    .line 7
    move-object/from16 v8, p7

    .line 8
    .line 9
    move-object/from16 v0, p8

    .line 10
    .line 11
    move/from16 v3, p9

    .line 12
    .line 13
    const v4, 0x7950d3f0

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v4}, LN/o;->N(I)LN/o;

    .line 17
    .line 18
    .line 19
    and-int/lit8 v4, v3, 0x6

    .line 20
    .line 21
    const/4 v5, 0x4

    .line 22
    if-nez v4, :cond_1

    .line 23
    .line 24
    invoke-virtual {v0, v1}, LN/o;->e(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    if-eqz v4, :cond_0

    .line 29
    .line 30
    move v4, v5

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const/4 v4, 0x2

    .line 33
    :goto_0
    or-int/2addr v4, v3

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    move v4, v3

    .line 36
    :goto_1
    and-int/lit8 v9, v3, 0x30

    .line 37
    .line 38
    if-nez v9, :cond_3

    .line 39
    .line 40
    invoke-virtual {v0, v2}, LN/o;->e(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v9

    .line 44
    if-eqz v9, :cond_2

    .line 45
    .line 46
    const/16 v9, 0x20

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_2
    const/16 v9, 0x10

    .line 50
    .line 51
    :goto_2
    or-int/2addr v4, v9

    .line 52
    :cond_3
    and-int/lit16 v9, v3, 0x180

    .line 53
    .line 54
    if-nez v9, :cond_5

    .line 55
    .line 56
    move-object/from16 v9, p2

    .line 57
    .line 58
    invoke-virtual {v0, v9}, LN/o;->e(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v10

    .line 62
    if-eqz v10, :cond_4

    .line 63
    .line 64
    const/16 v10, 0x100

    .line 65
    .line 66
    goto :goto_3

    .line 67
    :cond_4
    const/16 v10, 0x80

    .line 68
    .line 69
    :goto_3
    or-int/2addr v4, v10

    .line 70
    goto :goto_4

    .line 71
    :cond_5
    move-object/from16 v9, p2

    .line 72
    .line 73
    :goto_4
    and-int/lit16 v10, v3, 0xc00

    .line 74
    .line 75
    move-wide/from16 v11, p3

    .line 76
    .line 77
    if-nez v10, :cond_7

    .line 78
    .line 79
    invoke-virtual {v0, v11, v12}, LN/o;->d(J)Z

    .line 80
    .line 81
    .line 82
    move-result v10

    .line 83
    if-eqz v10, :cond_6

    .line 84
    .line 85
    const/16 v10, 0x800

    .line 86
    .line 87
    goto :goto_5

    .line 88
    :cond_6
    const/16 v10, 0x400

    .line 89
    .line 90
    :goto_5
    or-int/2addr v4, v10

    .line 91
    :cond_7
    and-int/lit16 v10, v3, 0x6000

    .line 92
    .line 93
    if-nez v10, :cond_9

    .line 94
    .line 95
    invoke-virtual {v0, v6, v7}, LN/o;->d(J)Z

    .line 96
    .line 97
    .line 98
    move-result v10

    .line 99
    if-eqz v10, :cond_8

    .line 100
    .line 101
    const/16 v10, 0x4000

    .line 102
    .line 103
    goto :goto_6

    .line 104
    :cond_8
    const/16 v10, 0x2000

    .line 105
    .line 106
    :goto_6
    or-int/2addr v4, v10

    .line 107
    :cond_9
    const/high16 v10, 0x30000

    .line 108
    .line 109
    and-int/2addr v10, v3

    .line 110
    if-nez v10, :cond_b

    .line 111
    .line 112
    invoke-virtual {v0, v8}, LN/o;->e(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v10

    .line 116
    if-eqz v10, :cond_a

    .line 117
    .line 118
    const/high16 v10, 0x20000

    .line 119
    .line 120
    goto :goto_7

    .line 121
    :cond_a
    const/high16 v10, 0x10000

    .line 122
    .line 123
    :goto_7
    or-int/2addr v4, v10

    .line 124
    :cond_b
    const v10, 0x12493

    .line 125
    .line 126
    .line 127
    and-int/2addr v10, v4

    .line 128
    const v13, 0x12492

    .line 129
    .line 130
    .line 131
    if-ne v10, v13, :cond_d

    .line 132
    .line 133
    invoke-virtual {v0}, LN/o;->x()Z

    .line 134
    .line 135
    .line 136
    move-result v10

    .line 137
    if-nez v10, :cond_c

    .line 138
    .line 139
    goto :goto_8

    .line 140
    :cond_c
    invoke-virtual {v0}, LN/o;->I()V

    .line 141
    .line 142
    .line 143
    goto/16 :goto_d

    .line 144
    .line 145
    :cond_d
    :goto_8
    sget-object v10, LZ/i;->a:LZ/i;

    .line 146
    .line 147
    int-to-float v5, v5

    .line 148
    invoke-static {v5}, LH/e;->a(F)LH/d;

    .line 149
    .line 150
    .line 151
    move-result-object v13

    .line 152
    const/16 v14, 0xa4

    .line 153
    .line 154
    int-to-float v14, v14

    .line 155
    invoke-static {v1, v14}, LE/L;->g(LZ/k;F)LZ/k;

    .line 156
    .line 157
    .line 158
    move-result-object v14

    .line 159
    invoke-static {v14, v13}, Lic/d;->k(LZ/k;Le0/E;)LZ/k;

    .line 160
    .line 161
    .line 162
    move-result-object v14

    .line 163
    sget-object v15, Le0/z;->a:Lad/I;

    .line 164
    .line 165
    invoke-static {v14, v6, v7, v15}, LU8/v0;->l(LZ/k;JLe0/E;)LZ/k;

    .line 166
    .line 167
    .line 168
    move-result-object v14

    .line 169
    invoke-static {v14}, LFe/e;->j(LZ/k;)LZ/k;

    .line 170
    .line 171
    .line 172
    move-result-object v14

    .line 173
    new-instance v15, Lx0/e;

    .line 174
    .line 175
    const/4 v1, 0x0

    .line 176
    invoke-direct {v15, v1}, Lx0/e;-><init>(I)V

    .line 177
    .line 178
    .line 179
    const/4 v1, 0x1

    .line 180
    invoke-static {v14, v15, v8, v1}, Lcom/moloco/sdk/internal/publisher/H;->R(LZ/k;Lx0/e;Ltf/a;I)LZ/k;

    .line 181
    .line 182
    .line 183
    move-result-object v14

    .line 184
    sget-object v15, LE/i;->c:LE/b;

    .line 185
    .line 186
    const v1, 0x2952b718

    .line 187
    .line 188
    .line 189
    invoke-virtual {v0, v1}, LN/o;->M(I)V

    .line 190
    .line 191
    .line 192
    invoke-static {v15, v0}, LE/J;->a(LE/c;LN/o;)Lr0/n;

    .line 193
    .line 194
    .line 195
    move-result-object v1

    .line 196
    const v15, -0x4ee9b9da

    .line 197
    .line 198
    .line 199
    invoke-virtual {v0, v15}, LN/o;->M(I)V

    .line 200
    .line 201
    .line 202
    sget-object v15, Lu0/M;->e:LN/L0;

    .line 203
    .line 204
    invoke-virtual {v0, v15}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v15

    .line 208
    check-cast v15, LL0/b;

    .line 209
    .line 210
    sget-object v3, Lu0/M;->k:LN/L0;

    .line 211
    .line 212
    invoke-virtual {v0, v3}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v3

    .line 216
    check-cast v3, LL0/i;

    .line 217
    .line 218
    move/from16 v16, v4

    .line 219
    .line 220
    sget-object v4, Lu0/M;->o:LN/L0;

    .line 221
    .line 222
    invoke-virtual {v0, v4}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v4

    .line 226
    check-cast v4, Lu0/p0;

    .line 227
    .line 228
    sget-object v17, Lt0/c;->g9:Lt0/b;

    .line 229
    .line 230
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 231
    .line 232
    .line 233
    move/from16 v17, v5

    .line 234
    .line 235
    sget-object v5, Lt0/b;->b:Lt0/d;

    .line 236
    .line 237
    invoke-static {v14}, LS3/f;->y(LZ/k;)LV/d;

    .line 238
    .line 239
    .line 240
    move-result-object v14

    .line 241
    invoke-virtual {v0}, LN/o;->O()V

    .line 242
    .line 243
    .line 244
    iget-boolean v6, v0, LN/o;->O:Z

    .line 245
    .line 246
    if-eqz v6, :cond_e

    .line 247
    .line 248
    invoke-virtual {v0, v5}, LN/o;->k(Ltf/a;)V

    .line 249
    .line 250
    .line 251
    :goto_9
    const/4 v5, 0x0

    .line 252
    goto :goto_a

    .line 253
    :cond_e
    invoke-virtual {v0}, LN/o;->X()V

    .line 254
    .line 255
    .line 256
    goto :goto_9

    .line 257
    :goto_a
    iput-boolean v5, v0, LN/o;->x:Z

    .line 258
    .line 259
    sget-object v5, Lt0/b;->e:Lt0/a;

    .line 260
    .line 261
    invoke-static {v0, v1, v5}, LN/d;->M(LN/o;Ljava/lang/Object;Ltf/p;)V

    .line 262
    .line 263
    .line 264
    sget-object v1, Lt0/b;->d:Lt0/a;

    .line 265
    .line 266
    invoke-static {v0, v15, v1}, LN/d;->M(LN/o;Ljava/lang/Object;Ltf/p;)V

    .line 267
    .line 268
    .line 269
    sget-object v1, Lt0/b;->f:Lt0/a;

    .line 270
    .line 271
    invoke-static {v0, v3, v1}, LN/d;->M(LN/o;Ljava/lang/Object;Ltf/p;)V

    .line 272
    .line 273
    .line 274
    sget-object v1, Lt0/b;->g:Lt0/a;

    .line 275
    .line 276
    invoke-static {v0, v4, v1, v0}, Lwg/b;->b(LN/o;Lu0/p0;Lt0/a;LN/o;)LN/u0;

    .line 277
    .line 278
    .line 279
    move-result-object v1

    .line 280
    const v3, 0x7ab4aae9

    .line 281
    .line 282
    .line 283
    const/4 v5, 0x0

    .line 284
    invoke-static {v5, v14, v1, v0, v3}, Lwg/b;->d(ILV/d;LN/u0;LN/o;I)V

    .line 285
    .line 286
    .line 287
    const v1, -0x286e2e7f

    .line 288
    .line 289
    .line 290
    invoke-virtual {v0, v1}, LN/o;->M(I)V

    .line 291
    .line 292
    .line 293
    const v1, -0x7160953

    .line 294
    .line 295
    .line 296
    invoke-virtual {v0, v1}, LN/o;->M(I)V

    .line 297
    .line 298
    .line 299
    if-nez v2, :cond_f

    .line 300
    .line 301
    :goto_b
    const/4 v5, 0x0

    .line 302
    goto :goto_c

    .line 303
    :cond_f
    invoke-static/range {v17 .. v17}, LE/L;->f(F)LZ/k;

    .line 304
    .line 305
    .line 306
    move-result-object v1

    .line 307
    invoke-static {v0, v1}, Lka/e0;->b(LN/o;LZ/k;)V

    .line 308
    .line 309
    .line 310
    sget-object v1, Lr0/g;->b:Lr0/f;

    .line 311
    .line 312
    const/16 v3, 0x24

    .line 313
    .line 314
    int-to-float v3, v3

    .line 315
    invoke-static {v10, v3}, LE/L;->c(LZ/k;F)LZ/k;

    .line 316
    .line 317
    .line 318
    move-result-object v3

    .line 319
    invoke-static {v3, v13}, Lic/d;->k(LZ/k;Le0/E;)LZ/k;

    .line 320
    .line 321
    .line 322
    move-result-object v3

    .line 323
    shr-int/lit8 v4, v16, 0x3

    .line 324
    .line 325
    and-int/lit8 v4, v4, 0xe

    .line 326
    .line 327
    or-int/lit8 v4, v4, 0x30

    .line 328
    .line 329
    invoke-static {v2, v1, v3, v0, v4}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/t;->a(Ljava/lang/String;Lr0/h;LZ/k;LN/o;I)V

    .line 330
    .line 331
    .line 332
    goto :goto_b

    .line 333
    :goto_c
    invoke-virtual {v0, v5}, LN/o;->p(Z)V

    .line 334
    .line 335
    .line 336
    const/16 v1, 0xf

    .line 337
    .line 338
    int-to-float v1, v1

    .line 339
    const/16 v3, 0xc

    .line 340
    .line 341
    int-to-float v3, v3

    .line 342
    new-instance v4, LE/E;

    .line 343
    .line 344
    invoke-direct {v4, v1, v3, v1, v3}, LE/E;-><init>(FFFF)V

    .line 345
    .line 346
    .line 347
    invoke-virtual {v10, v4}, LZ/i;->g(LZ/k;)LZ/k;

    .line 348
    .line 349
    .line 350
    move/from16 v1, v16

    .line 351
    .line 352
    sget-object v16, LE0/o;->a:LE0/c;

    .line 353
    .line 354
    sget-object v15, LE0/l;->f:LE0/l;

    .line 355
    .line 356
    shr-int/lit8 v3, v1, 0x6

    .line 357
    .line 358
    and-int/lit8 v3, v3, 0xe

    .line 359
    .line 360
    const v5, 0x30030

    .line 361
    .line 362
    .line 363
    or-int/2addr v3, v5

    .line 364
    shr-int/lit8 v1, v1, 0x3

    .line 365
    .line 366
    and-int/lit16 v1, v1, 0x380

    .line 367
    .line 368
    or-int v28, v3, v1

    .line 369
    .line 370
    const/16 v25, 0x0

    .line 371
    .line 372
    const/16 v26, 0x0

    .line 373
    .line 374
    const-wide/16 v13, 0x0

    .line 375
    .line 376
    const-wide/16 v17, 0x0

    .line 377
    .line 378
    const/16 v19, 0x0

    .line 379
    .line 380
    const-wide/16 v20, 0x0

    .line 381
    .line 382
    const/16 v22, 0x0

    .line 383
    .line 384
    const/16 v23, 0x0

    .line 385
    .line 386
    const/16 v24, 0x1

    .line 387
    .line 388
    const/16 v29, 0xc00

    .line 389
    .line 390
    const v30, 0xdf98

    .line 391
    .line 392
    .line 393
    move-object/from16 v27, v0

    .line 394
    .line 395
    move-object v10, v4

    .line 396
    invoke-static/range {v9 .. v30}, LK/I;->b(Ljava/lang/String;LZ/k;JJLE0/l;LE0/o;JLK0/c;JIZILK/B;Lz0/p;LN/o;III)V

    .line 397
    .line 398
    .line 399
    const/4 v1, 0x1

    .line 400
    const/4 v5, 0x0

    .line 401
    invoke-static {v0, v5, v5, v1, v5}, Lwg/b;->e(LN/o;ZZZZ)V

    .line 402
    .line 403
    .line 404
    invoke-virtual {v0, v5}, LN/o;->p(Z)V

    .line 405
    .line 406
    .line 407
    :goto_d
    invoke-virtual {v0}, LN/o;->r()LN/i0;

    .line 408
    .line 409
    .line 410
    move-result-object v10

    .line 411
    if-eqz v10, :cond_10

    .line 412
    .line 413
    new-instance v0, Lcom/moloco/sdk/internal/t;

    .line 414
    .line 415
    move-object/from16 v1, p0

    .line 416
    .line 417
    move-object/from16 v3, p2

    .line 418
    .line 419
    move-wide/from16 v4, p3

    .line 420
    .line 421
    move-wide/from16 v6, p5

    .line 422
    .line 423
    move/from16 v9, p9

    .line 424
    .line 425
    invoke-direct/range {v0 .. v9}, Lcom/moloco/sdk/internal/t;-><init>(LZ/k;Ljava/lang/String;Ljava/lang/String;JJLtf/a;I)V

    .line 426
    .line 427
    .line 428
    iput-object v0, v10, LN/i0;->d:Ltf/p;

    .line 429
    .line 430
    :cond_10
    return-void
.end method
