.class public final LB/c;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/l;


# instance fields
.field public final synthetic i:F

.field public final synthetic j:Le0/E;

.field public final synthetic k:Lt0/M;

.field public final synthetic l:Le0/m;


# direct methods
.method public constructor <init>(FLe0/E;Lt0/M;Le0/m;)V
    .locals 0

    .line 1
    iput p1, p0, LB/c;->i:F

    .line 2
    .line 3
    iput-object p2, p0, LB/c;->j:Le0/E;

    .line 4
    .line 5
    iput-object p3, p0, LB/c;->k:Lt0/M;

    .line 6
    .line 7
    iput-object p4, p0, LB/c;->l:Le0/m;

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, Lb0/b;

    .line 6
    .line 7
    const-string v2, "$this$drawWithCache"

    .line 8
    .line 9
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1}, Lb0/b;->b()F

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    iget v3, v0, LB/c;->i:F

    .line 17
    .line 18
    mul-float/2addr v2, v3

    .line 19
    const/4 v4, 0x0

    .line 20
    cmpl-float v2, v2, v4

    .line 21
    .line 22
    if-ltz v2, :cond_b

    .line 23
    .line 24
    iget-object v2, v1, Lb0/b;->a:Lb0/a;

    .line 25
    .line 26
    invoke-interface {v2}, Lb0/a;->c()J

    .line 27
    .line 28
    .line 29
    move-result-wide v5

    .line 30
    invoke-static {v5, v6}, Ld0/f;->c(J)F

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    cmpl-float v2, v2, v4

    .line 35
    .line 36
    if-lez v2, :cond_b

    .line 37
    .line 38
    invoke-static {v3, v4}, LL0/d;->a(FF)Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-eqz v2, :cond_0

    .line 43
    .line 44
    const/high16 v2, 0x3f800000    # 1.0f

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    invoke-virtual {v1}, Lb0/b;->b()F

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    mul-float/2addr v2, v3

    .line 52
    float-to-double v2, v2

    .line 53
    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    .line 54
    .line 55
    .line 56
    move-result-wide v2

    .line 57
    double-to-float v2, v2

    .line 58
    :goto_0
    iget-object v3, v1, Lb0/b;->a:Lb0/a;

    .line 59
    .line 60
    invoke-interface {v3}, Lb0/a;->c()J

    .line 61
    .line 62
    .line 63
    move-result-wide v3

    .line 64
    invoke-static {v3, v4}, Ld0/f;->c(J)F

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    const/4 v4, 0x2

    .line 69
    int-to-float v4, v4

    .line 70
    div-float/2addr v3, v4

    .line 71
    float-to-double v5, v3

    .line 72
    invoke-static {v5, v6}, Ljava/lang/Math;->ceil(D)D

    .line 73
    .line 74
    .line 75
    move-result-wide v5

    .line 76
    double-to-float v3, v5

    .line 77
    invoke-static {v2, v3}, Ljava/lang/Math;->min(FF)F

    .line 78
    .line 79
    .line 80
    move-result v6

    .line 81
    div-float v2, v6, v4

    .line 82
    .line 83
    invoke-static {v2, v2}, LU8/v0;->f(FF)J

    .line 84
    .line 85
    .line 86
    move-result-wide v12

    .line 87
    iget-object v3, v1, Lb0/b;->a:Lb0/a;

    .line 88
    .line 89
    invoke-interface {v3}, Lb0/a;->c()J

    .line 90
    .line 91
    .line 92
    move-result-wide v7

    .line 93
    invoke-static {v7, v8}, Ld0/f;->d(J)F

    .line 94
    .line 95
    .line 96
    move-result v3

    .line 97
    sub-float/2addr v3, v6

    .line 98
    iget-object v5, v1, Lb0/b;->a:Lb0/a;

    .line 99
    .line 100
    invoke-interface {v5}, Lb0/a;->c()J

    .line 101
    .line 102
    .line 103
    move-result-wide v7

    .line 104
    invoke-static {v7, v8}, Ld0/f;->b(J)F

    .line 105
    .line 106
    .line 107
    move-result v5

    .line 108
    sub-float/2addr v5, v6

    .line 109
    invoke-static {v3, v5}, Lcom/moloco/sdk/internal/publisher/H;->I(FF)J

    .line 110
    .line 111
    .line 112
    move-result-wide v14

    .line 113
    mul-float/2addr v4, v6

    .line 114
    iget-object v3, v1, Lb0/b;->a:Lb0/a;

    .line 115
    .line 116
    invoke-interface {v3}, Lb0/a;->c()J

    .line 117
    .line 118
    .line 119
    move-result-wide v7

    .line 120
    invoke-static {v7, v8}, Ld0/f;->c(J)F

    .line 121
    .line 122
    .line 123
    move-result v3

    .line 124
    cmpl-float v3, v4, v3

    .line 125
    .line 126
    const/4 v4, 0x0

    .line 127
    if-lez v3, :cond_1

    .line 128
    .line 129
    const/4 v3, 0x1

    .line 130
    goto :goto_1

    .line 131
    :cond_1
    move v3, v4

    .line 132
    :goto_1
    iget-object v5, v1, Lb0/b;->a:Lb0/a;

    .line 133
    .line 134
    invoke-interface {v5}, Lb0/a;->c()J

    .line 135
    .line 136
    .line 137
    move-result-wide v7

    .line 138
    iget-object v5, v1, Lb0/b;->a:Lb0/a;

    .line 139
    .line 140
    invoke-interface {v5}, Lb0/a;->getLayoutDirection()LL0/i;

    .line 141
    .line 142
    .line 143
    move-result-object v5

    .line 144
    iget-object v9, v0, LB/c;->j:Le0/E;

    .line 145
    .line 146
    invoke-interface {v9, v7, v8, v5, v1}, Le0/E;->b(JLL0/i;LL0/b;)Le0/z;

    .line 147
    .line 148
    .line 149
    move-result-object v5

    .line 150
    instance-of v7, v5, Le0/w;

    .line 151
    .line 152
    iget-object v11, v0, LB/c;->l:Le0/m;

    .line 153
    .line 154
    if-eqz v7, :cond_6

    .line 155
    .line 156
    check-cast v5, Le0/w;

    .line 157
    .line 158
    iget-object v5, v5, Le0/w;->e:Ld0/e;

    .line 159
    .line 160
    invoke-static {v5}, Landroid/support/v4/media/session/b;->l0(Ld0/e;)Z

    .line 161
    .line 162
    .line 163
    move-result v7

    .line 164
    if-eqz v7, :cond_2

    .line 165
    .line 166
    new-instance v16, Lg0/g;

    .line 167
    .line 168
    const/4 v8, 0x0

    .line 169
    const/16 v10, 0x1e

    .line 170
    .line 171
    const/4 v7, 0x0

    .line 172
    const/4 v9, 0x0

    .line 173
    move-object v4, v5

    .line 174
    move-object/from16 v5, v16

    .line 175
    .line 176
    invoke-direct/range {v5 .. v10}, Lg0/g;-><init>(FFIII)V

    .line 177
    .line 178
    .line 179
    new-instance v5, LB/g;

    .line 180
    .line 181
    iget-wide v8, v4, Ld0/e;->e:J

    .line 182
    .line 183
    move v10, v2

    .line 184
    move-object v7, v11

    .line 185
    move v11, v6

    .line 186
    move v6, v3

    .line 187
    invoke-direct/range {v5 .. v16}, LB/g;-><init>(ZLe0/m;JFFJJLg0/g;)V

    .line 188
    .line 189
    .line 190
    new-instance v2, LA/e0;

    .line 191
    .line 192
    const/16 v3, 0x1c

    .line 193
    .line 194
    const/4 v4, 0x0

    .line 195
    invoke-direct {v2, v3, v4}, LA/e0;-><init>(IZ)V

    .line 196
    .line 197
    .line 198
    iput-object v5, v2, LA/e0;->b:Ljava/lang/Object;

    .line 199
    .line 200
    iput-object v2, v1, Lb0/b;->b:LA/e0;

    .line 201
    .line 202
    return-object v2

    .line 203
    :cond_2
    move-object v2, v11

    .line 204
    iget-object v7, v0, LB/c;->k:Lt0/M;

    .line 205
    .line 206
    iget-object v8, v7, Lt0/M;->a:Ljava/lang/Object;

    .line 207
    .line 208
    check-cast v8, LB/b;

    .line 209
    .line 210
    if-nez v8, :cond_3

    .line 211
    .line 212
    new-instance v8, LB/b;

    .line 213
    .line 214
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 215
    .line 216
    .line 217
    const/4 v9, 0x0

    .line 218
    iput-object v9, v8, LB/b;->a:Le0/f;

    .line 219
    .line 220
    iput-object v8, v7, Lt0/M;->a:Ljava/lang/Object;

    .line 221
    .line 222
    :cond_3
    iget-object v7, v8, LB/b;->a:Le0/f;

    .line 223
    .line 224
    if-nez v7, :cond_4

    .line 225
    .line 226
    invoke-static {}, Le0/z;->e()Le0/f;

    .line 227
    .line 228
    .line 229
    move-result-object v7

    .line 230
    iput-object v7, v8, LB/b;->a:Le0/f;

    .line 231
    .line 232
    :cond_4
    invoke-virtual {v7}, Le0/f;->c()V

    .line 233
    .line 234
    .line 235
    invoke-virtual {v7, v5}, Le0/f;->a(Ld0/e;)V

    .line 236
    .line 237
    .line 238
    if-nez v3, :cond_5

    .line 239
    .line 240
    invoke-static {}, Le0/z;->e()Le0/f;

    .line 241
    .line 242
    .line 243
    move-result-object v3

    .line 244
    invoke-virtual {v5}, Ld0/e;->b()F

    .line 245
    .line 246
    .line 247
    move-result v8

    .line 248
    sub-float/2addr v8, v6

    .line 249
    invoke-virtual {v5}, Ld0/e;->a()F

    .line 250
    .line 251
    .line 252
    move-result v9

    .line 253
    sub-float/2addr v9, v6

    .line 254
    iget-wide v10, v5, Ld0/e;->e:J

    .line 255
    .line 256
    invoke-static {v10, v11, v6}, La/a;->K(JF)J

    .line 257
    .line 258
    .line 259
    move-result-wide v10

    .line 260
    iget-wide v12, v5, Ld0/e;->f:J

    .line 261
    .line 262
    invoke-static {v12, v13, v6}, La/a;->K(JF)J

    .line 263
    .line 264
    .line 265
    move-result-wide v12

    .line 266
    iget-wide v14, v5, Ld0/e;->h:J

    .line 267
    .line 268
    invoke-static {v14, v15, v6}, La/a;->K(JF)J

    .line 269
    .line 270
    .line 271
    move-result-wide v16

    .line 272
    iget-wide v14, v5, Ld0/e;->g:J

    .line 273
    .line 274
    invoke-static {v14, v15, v6}, La/a;->K(JF)J

    .line 275
    .line 276
    .line 277
    move-result-wide v14

    .line 278
    new-instance v5, Ld0/e;

    .line 279
    .line 280
    move-object/from16 v18, v7

    .line 281
    .line 282
    move v7, v6

    .line 283
    move-object/from16 v0, v18

    .line 284
    .line 285
    invoke-direct/range {v5 .. v17}, Ld0/e;-><init>(FFFFJJJJ)V

    .line 286
    .line 287
    .line 288
    invoke-virtual {v3, v5}, Le0/f;->a(Ld0/e;)V

    .line 289
    .line 290
    .line 291
    invoke-virtual {v0, v0, v3, v4}, Le0/f;->b(Le0/x;Le0/x;I)Z

    .line 292
    .line 293
    .line 294
    goto :goto_2

    .line 295
    :cond_5
    move-object v0, v7

    .line 296
    :goto_2
    new-instance v3, LA/W;

    .line 297
    .line 298
    const/4 v4, 0x3

    .line 299
    invoke-direct {v3, v4, v0, v2}, LA/W;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 300
    .line 301
    .line 302
    new-instance v0, LA/e0;

    .line 303
    .line 304
    const/16 v2, 0x1c

    .line 305
    .line 306
    const/4 v4, 0x0

    .line 307
    invoke-direct {v0, v2, v4}, LA/e0;-><init>(IZ)V

    .line 308
    .line 309
    .line 310
    iput-object v3, v0, LA/e0;->b:Ljava/lang/Object;

    .line 311
    .line 312
    iput-object v0, v1, Lb0/b;->b:LA/e0;

    .line 313
    .line 314
    return-object v0

    .line 315
    :cond_6
    move-object v2, v11

    .line 316
    instance-of v0, v5, Le0/v;

    .line 317
    .line 318
    if-eqz v0, :cond_a

    .line 319
    .line 320
    if-eqz v3, :cond_7

    .line 321
    .line 322
    sget-wide v12, Ld0/c;->b:J

    .line 323
    .line 324
    :cond_7
    move-wide/from16 v18, v12

    .line 325
    .line 326
    if-eqz v3, :cond_8

    .line 327
    .line 328
    iget-object v0, v1, Lb0/b;->a:Lb0/a;

    .line 329
    .line 330
    invoke-interface {v0}, Lb0/a;->c()J

    .line 331
    .line 332
    .line 333
    move-result-wide v14

    .line 334
    :cond_8
    move-wide/from16 v20, v14

    .line 335
    .line 336
    if-eqz v3, :cond_9

    .line 337
    .line 338
    sget-object v0, Lg0/f;->b:Lg0/f;

    .line 339
    .line 340
    move-object/from16 v22, v0

    .line 341
    .line 342
    goto :goto_3

    .line 343
    :cond_9
    new-instance v5, Lg0/g;

    .line 344
    .line 345
    const/4 v8, 0x0

    .line 346
    const/16 v10, 0x1e

    .line 347
    .line 348
    const/4 v7, 0x0

    .line 349
    const/4 v9, 0x0

    .line 350
    invoke-direct/range {v5 .. v10}, Lg0/g;-><init>(FFIII)V

    .line 351
    .line 352
    .line 353
    move-object/from16 v22, v5

    .line 354
    .line 355
    :goto_3
    new-instance v16, LB/f;

    .line 356
    .line 357
    move-object/from16 v17, v2

    .line 358
    .line 359
    invoke-direct/range {v16 .. v22}, LB/f;-><init>(Le0/m;JJLg0/c;)V

    .line 360
    .line 361
    .line 362
    move-object/from16 v0, v16

    .line 363
    .line 364
    new-instance v2, LA/e0;

    .line 365
    .line 366
    const/16 v3, 0x1c

    .line 367
    .line 368
    const/4 v4, 0x0

    .line 369
    invoke-direct {v2, v3, v4}, LA/e0;-><init>(IZ)V

    .line 370
    .line 371
    .line 372
    iput-object v0, v2, LA/e0;->b:Ljava/lang/Object;

    .line 373
    .line 374
    iput-object v2, v1, Lb0/b;->b:LA/e0;

    .line 375
    .line 376
    return-object v2

    .line 377
    :cond_a
    new-instance v0, LE5/Q;

    .line 378
    .line 379
    const/16 v1, 0x9

    .line 380
    .line 381
    const/4 v2, 0x0

    .line 382
    invoke-direct {v0, v2, v1}, LE5/Q;-><init>(BI)V

    .line 383
    .line 384
    .line 385
    throw v0

    .line 386
    :cond_b
    sget-object v0, LB/e;->i:LB/e;

    .line 387
    .line 388
    new-instance v2, LA/e0;

    .line 389
    .line 390
    const/16 v3, 0x1c

    .line 391
    .line 392
    const/4 v4, 0x0

    .line 393
    invoke-direct {v2, v3, v4}, LA/e0;-><init>(IZ)V

    .line 394
    .line 395
    .line 396
    iput-object v0, v2, LA/e0;->b:Ljava/lang/Object;

    .line 397
    .line 398
    iput-object v2, v1, Lb0/b;->b:LA/e0;

    .line 399
    .line 400
    return-object v2
.end method
