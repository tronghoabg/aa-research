.class public final Li0/D;
.super Li0/B;
.source "SourceFile"


# instance fields
.field public final b:Li0/a;

.field public c:Z

.field public final d:LA7/S;

.field public e:Lkotlin/jvm/internal/n;

.field public final f:LN/Y;

.field public g:F

.field public h:F

.field public i:J

.field public final j:LB/F;


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Li0/a;

    .line 5
    .line 6
    invoke-direct {v0}, Li0/a;-><init>()V

    .line 7
    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    iput v1, v0, Li0/a;->k:F

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    iput-boolean v2, v0, Li0/a;->q:Z

    .line 14
    .line 15
    invoke-virtual {v0}, Li0/B;->c()V

    .line 16
    .line 17
    .line 18
    iput v1, v0, Li0/a;->l:F

    .line 19
    .line 20
    iput-boolean v2, v0, Li0/a;->q:Z

    .line 21
    .line 22
    invoke-virtual {v0}, Li0/B;->c()V

    .line 23
    .line 24
    .line 25
    new-instance v1, LA0/p;

    .line 26
    .line 27
    const/16 v3, 0x16

    .line 28
    .line 29
    invoke-direct {v1, p0, v3}, LA0/p;-><init>(Ljava/lang/Object;I)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v1}, Li0/a;->d(LA0/p;)V

    .line 33
    .line 34
    .line 35
    iput-object v0, p0, Li0/D;->b:Li0/a;

    .line 36
    .line 37
    iput-boolean v2, p0, Li0/D;->c:Z

    .line 38
    .line 39
    new-instance v0, LA7/S;

    .line 40
    .line 41
    const/4 v1, 0x2

    .line 42
    invoke-direct {v0, v1}, LA7/S;-><init>(I)V

    .line 43
    .line 44
    .line 45
    iput-object v0, p0, Li0/D;->d:LA7/S;

    .line 46
    .line 47
    sget-object v0, Li0/e;->k:Li0/e;

    .line 48
    .line 49
    iput-object v0, p0, Li0/D;->e:Lkotlin/jvm/internal/n;

    .line 50
    .line 51
    sget-object v0, LN/P;->f:LN/P;

    .line 52
    .line 53
    const/4 v1, 0x0

    .line 54
    invoke-static {v1, v0}, LN/d;->G(Ljava/lang/Object;LN/A0;)LN/Y;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    iput-object v0, p0, Li0/D;->f:LN/Y;

    .line 59
    .line 60
    sget-wide v0, Ld0/f;->c:J

    .line 61
    .line 62
    iput-wide v0, p0, Li0/D;->i:J

    .line 63
    .line 64
    new-instance v0, LB/F;

    .line 65
    .line 66
    const/16 v1, 0xf

    .line 67
    .line 68
    invoke-direct {v0, p0, v1}, LB/F;-><init>(Ljava/lang/Object;I)V

    .line 69
    .line 70
    .line 71
    iput-object v0, p0, Li0/D;->j:LB/F;

    .line 72
    .line 73
    return-void
.end method


# virtual methods
.method public final a(Lg0/d;)V
    .locals 2

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/high16 v0, 0x3f800000    # 1.0f

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-virtual {p0, p1, v0, v1}, Li0/D;->e(Lg0/d;FLe0/r;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final e(Lg0/d;FLe0/r;)V
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const-string v2, "<this>"

    .line 6
    .line 7
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    if-eqz p3, :cond_0

    .line 11
    .line 12
    move-object/from16 v10, p3

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget-object v2, v0, Li0/D;->f:LN/Y;

    .line 16
    .line 17
    invoke-virtual {v2}, LN/Y;->getValue()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, Le0/r;

    .line 22
    .line 23
    move-object v10, v2

    .line 24
    :goto_0
    iget-boolean v2, v0, Li0/D;->c:Z

    .line 25
    .line 26
    iget-object v3, v0, Li0/D;->d:LA7/S;

    .line 27
    .line 28
    if-nez v2, :cond_2

    .line 29
    .line 30
    iget-wide v4, v0, Li0/D;->i:J

    .line 31
    .line 32
    invoke-interface {v1}, Lg0/d;->c()J

    .line 33
    .line 34
    .line 35
    move-result-wide v6

    .line 36
    invoke-static {v4, v5, v6, v7}, Ld0/f;->a(JJ)Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-nez v2, :cond_1

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    move-object v12, v3

    .line 44
    move-object/from16 v21, v10

    .line 45
    .line 46
    goto/16 :goto_4

    .line 47
    .line 48
    :cond_2
    :goto_1
    invoke-interface {v1}, Lg0/d;->c()J

    .line 49
    .line 50
    .line 51
    move-result-wide v4

    .line 52
    invoke-static {v4, v5}, Ld0/f;->d(J)F

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    iget v4, v0, Li0/D;->g:F

    .line 57
    .line 58
    div-float/2addr v2, v4

    .line 59
    iget-object v4, v0, Li0/D;->b:Li0/a;

    .line 60
    .line 61
    iput v2, v4, Li0/a;->m:F

    .line 62
    .line 63
    const/4 v2, 0x1

    .line 64
    iput-boolean v2, v4, Li0/a;->q:Z

    .line 65
    .line 66
    invoke-virtual {v4}, Li0/B;->c()V

    .line 67
    .line 68
    .line 69
    invoke-interface {v1}, Lg0/d;->c()J

    .line 70
    .line 71
    .line 72
    move-result-wide v5

    .line 73
    invoke-static {v5, v6}, Ld0/f;->b(J)F

    .line 74
    .line 75
    .line 76
    move-result v5

    .line 77
    iget v6, v0, Li0/D;->h:F

    .line 78
    .line 79
    div-float/2addr v5, v6

    .line 80
    iput v5, v4, Li0/a;->n:F

    .line 81
    .line 82
    iput-boolean v2, v4, Li0/a;->q:Z

    .line 83
    .line 84
    invoke-virtual {v4}, Li0/B;->c()V

    .line 85
    .line 86
    .line 87
    invoke-interface {v1}, Lg0/d;->c()J

    .line 88
    .line 89
    .line 90
    move-result-wide v4

    .line 91
    invoke-static {v4, v5}, Ld0/f;->d(J)F

    .line 92
    .line 93
    .line 94
    move-result v4

    .line 95
    float-to-double v4, v4

    .line 96
    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    .line 97
    .line 98
    .line 99
    move-result-wide v4

    .line 100
    double-to-float v4, v4

    .line 101
    float-to-int v4, v4

    .line 102
    invoke-interface {v1}, Lg0/d;->c()J

    .line 103
    .line 104
    .line 105
    move-result-wide v5

    .line 106
    invoke-static {v5, v6}, Ld0/f;->b(J)F

    .line 107
    .line 108
    .line 109
    move-result v5

    .line 110
    float-to-double v5, v5

    .line 111
    invoke-static {v5, v6}, Ljava/lang/Math;->ceil(D)D

    .line 112
    .line 113
    .line 114
    move-result-wide v5

    .line 115
    double-to-float v5, v5

    .line 116
    float-to-int v5, v5

    .line 117
    invoke-static {v4, v5}, LBa/c;->a(II)J

    .line 118
    .line 119
    .line 120
    move-result-wide v4

    .line 121
    invoke-interface {v1}, Lg0/d;->getLayoutDirection()LL0/i;

    .line 122
    .line 123
    .line 124
    move-result-object v6

    .line 125
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    const-string v7, "layoutDirection"

    .line 129
    .line 130
    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    const-string v7, "block"

    .line 134
    .line 135
    iget-object v8, v0, Li0/D;->j:LB/F;

    .line 136
    .line 137
    invoke-static {v8, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    iget-object v7, v3, LA7/S;->c:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast v7, Le0/d;

    .line 143
    .line 144
    iget-object v9, v3, LA7/S;->d:Ljava/lang/Object;

    .line 145
    .line 146
    check-cast v9, Le0/b;

    .line 147
    .line 148
    const/16 v14, 0x20

    .line 149
    .line 150
    if-eqz v7, :cond_4

    .line 151
    .line 152
    if-eqz v9, :cond_4

    .line 153
    .line 154
    const-wide v15, 0xffffffffL

    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    shr-long v12, v4, v14

    .line 160
    .line 161
    long-to-int v12, v12

    .line 162
    iget-object v13, v7, Le0/d;->a:Landroid/graphics/Bitmap;

    .line 163
    .line 164
    move/from16 p3, v14

    .line 165
    .line 166
    invoke-virtual {v13}, Landroid/graphics/Bitmap;->getWidth()I

    .line 167
    .line 168
    .line 169
    move-result v14

    .line 170
    if-gt v12, v14, :cond_3

    .line 171
    .line 172
    move-object v12, v3

    .line 173
    and-long v2, v4, v15

    .line 174
    .line 175
    long-to-int v2, v2

    .line 176
    invoke-virtual {v13}, Landroid/graphics/Bitmap;->getHeight()I

    .line 177
    .line 178
    .line 179
    move-result v3

    .line 180
    if-le v2, v3, :cond_6

    .line 181
    .line 182
    goto :goto_2

    .line 183
    :cond_3
    move-object v12, v3

    .line 184
    goto :goto_2

    .line 185
    :cond_4
    move-object v12, v3

    .line 186
    move/from16 p3, v14

    .line 187
    .line 188
    const-wide v15, 0xffffffffL

    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    :goto_2
    shr-long v2, v4, p3

    .line 194
    .line 195
    long-to-int v2, v2

    .line 196
    move-object v3, v12

    .line 197
    const/16 p3, 0x0

    .line 198
    .line 199
    and-long v11, v4, v15

    .line 200
    .line 201
    long-to-int v7, v11

    .line 202
    sget-object v9, Lf0/e;->c:Lf0/n;

    .line 203
    .line 204
    const-string v11, "colorSpace"

    .line 205
    .line 206
    invoke-static {v9, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    invoke-static/range {p3 .. p3}, Le0/z;->t(I)Landroid/graphics/Bitmap$Config;

    .line 210
    .line 211
    .line 212
    move-result-object v11

    .line 213
    sget v12, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 214
    .line 215
    const/16 v13, 0x1a

    .line 216
    .line 217
    if-lt v12, v13, :cond_5

    .line 218
    .line 219
    move/from16 v12, p3

    .line 220
    .line 221
    const/4 v14, 0x1

    .line 222
    invoke-static {v2, v7, v12, v14, v9}, Le0/i;->c(IIIZLf0/c;)Landroid/graphics/Bitmap;

    .line 223
    .line 224
    .line 225
    move-result-object v2

    .line 226
    goto :goto_3

    .line 227
    :cond_5
    const/4 v14, 0x1

    .line 228
    const/4 v9, 0x0

    .line 229
    invoke-static {v9, v2, v7, v11}, Landroid/graphics/Bitmap;->createBitmap(Landroid/util/DisplayMetrics;IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 230
    .line 231
    .line 232
    move-result-object v2

    .line 233
    const-string v7, "createBitmap(\n          \u2026   bitmapConfig\n        )"

    .line 234
    .line 235
    invoke-static {v2, v7}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 236
    .line 237
    .line 238
    invoke-virtual {v2, v14}, Landroid/graphics/Bitmap;->setHasAlpha(Z)V

    .line 239
    .line 240
    .line 241
    :goto_3
    new-instance v7, Le0/d;

    .line 242
    .line 243
    invoke-direct {v7, v2}, Le0/d;-><init>(Landroid/graphics/Bitmap;)V

    .line 244
    .line 245
    .line 246
    sget-object v2, Le0/c;->a:Landroid/graphics/Canvas;

    .line 247
    .line 248
    new-instance v9, Le0/b;

    .line 249
    .line 250
    invoke-direct {v9}, Le0/b;-><init>()V

    .line 251
    .line 252
    .line 253
    new-instance v2, Landroid/graphics/Canvas;

    .line 254
    .line 255
    invoke-static {v7}, Le0/z;->f(Le0/d;)Landroid/graphics/Bitmap;

    .line 256
    .line 257
    .line 258
    move-result-object v11

    .line 259
    invoke-direct {v2, v11}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 260
    .line 261
    .line 262
    iput-object v2, v9, Le0/b;->a:Landroid/graphics/Canvas;

    .line 263
    .line 264
    move-object v12, v3

    .line 265
    iput-object v7, v12, LA7/S;->c:Ljava/lang/Object;

    .line 266
    .line 267
    iput-object v9, v12, LA7/S;->d:Ljava/lang/Object;

    .line 268
    .line 269
    :cond_6
    iput-wide v4, v12, LA7/S;->b:J

    .line 270
    .line 271
    invoke-static {v4, v5}, LBa/c;->R(J)J

    .line 272
    .line 273
    .line 274
    move-result-wide v2

    .line 275
    iget-object v4, v12, LA7/S;->e:Ljava/lang/Object;

    .line 276
    .line 277
    move-object v13, v4

    .line 278
    check-cast v13, Lg0/b;

    .line 279
    .line 280
    iget-object v4, v13, Lg0/b;->a:Lg0/a;

    .line 281
    .line 282
    iget-object v5, v4, Lg0/a;->a:LL0/b;

    .line 283
    .line 284
    iget-object v11, v4, Lg0/a;->b:LL0/i;

    .line 285
    .line 286
    iget-object v14, v4, Lg0/a;->c:Le0/o;

    .line 287
    .line 288
    move-object/from16 v21, v10

    .line 289
    .line 290
    move-object/from16 v22, v11

    .line 291
    .line 292
    iget-wide v10, v4, Lg0/a;->d:J

    .line 293
    .line 294
    iput-object v1, v4, Lg0/a;->a:LL0/b;

    .line 295
    .line 296
    iput-object v6, v4, Lg0/a;->b:LL0/i;

    .line 297
    .line 298
    iput-object v9, v4, Lg0/a;->c:Le0/o;

    .line 299
    .line 300
    iput-wide v2, v4, Lg0/a;->d:J

    .line 301
    .line 302
    invoke-virtual {v9}, Le0/b;->m()V

    .line 303
    .line 304
    .line 305
    move-object v2, v14

    .line 306
    sget-wide v14, Le0/q;->b:J

    .line 307
    .line 308
    const/16 v18, 0x0

    .line 309
    .line 310
    const/16 v19, 0x0

    .line 311
    .line 312
    const-wide/16 v16, 0x0

    .line 313
    .line 314
    const/16 v20, 0x3e

    .line 315
    .line 316
    invoke-static/range {v13 .. v20}, Lcom/google/android/gms/internal/consent_sdk/a;->g(Lg0/d;JJFLe0/r;I)V

    .line 317
    .line 318
    .line 319
    invoke-virtual {v8, v13}, LB/F;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    invoke-virtual {v9}, Le0/b;->restore()V

    .line 323
    .line 324
    .line 325
    iget-object v3, v13, Lg0/b;->a:Lg0/a;

    .line 326
    .line 327
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 328
    .line 329
    .line 330
    const-string v4, "<set-?>"

    .line 331
    .line 332
    invoke-static {v5, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 333
    .line 334
    .line 335
    iput-object v5, v3, Lg0/a;->a:LL0/b;

    .line 336
    .line 337
    move-object/from16 v5, v22

    .line 338
    .line 339
    invoke-static {v5, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 340
    .line 341
    .line 342
    iput-object v5, v3, Lg0/a;->b:LL0/i;

    .line 343
    .line 344
    iput-object v2, v3, Lg0/a;->c:Le0/o;

    .line 345
    .line 346
    iput-wide v10, v3, Lg0/a;->d:J

    .line 347
    .line 348
    iget-object v2, v7, Le0/d;->a:Landroid/graphics/Bitmap;

    .line 349
    .line 350
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->prepareToDraw()V

    .line 351
    .line 352
    .line 353
    const/4 v2, 0x0

    .line 354
    iput-boolean v2, v0, Li0/D;->c:Z

    .line 355
    .line 356
    invoke-interface {v1}, Lg0/d;->c()J

    .line 357
    .line 358
    .line 359
    move-result-wide v2

    .line 360
    iput-wide v2, v0, Li0/D;->i:J

    .line 361
    .line 362
    :goto_4
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 363
    .line 364
    .line 365
    iget-object v2, v12, LA7/S;->c:Ljava/lang/Object;

    .line 366
    .line 367
    check-cast v2, Le0/d;

    .line 368
    .line 369
    if-eqz v2, :cond_7

    .line 370
    .line 371
    iget-wide v5, v12, LA7/S;->b:J

    .line 372
    .line 373
    const-wide/16 v7, 0x0

    .line 374
    .line 375
    const/16 v12, 0x35a

    .line 376
    .line 377
    const-wide/16 v3, 0x0

    .line 378
    .line 379
    const/4 v11, 0x0

    .line 380
    move/from16 v9, p2

    .line 381
    .line 382
    move-object/from16 v10, v21

    .line 383
    .line 384
    invoke-static/range {v1 .. v12}, Lcom/google/android/gms/internal/consent_sdk/a;->d(Lg0/d;Le0/d;JJJFLe0/r;II)V

    .line 385
    .line 386
    .line 387
    return-void

    .line 388
    :cond_7
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 389
    .line 390
    const-string v2, "drawCachedImage must be invoked first before attempting to draw the result into another destination"

    .line 391
    .line 392
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 393
    .line 394
    .line 395
    throw v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Params: \tname: "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Li0/D;->b:Li0/a;

    .line 9
    .line 10
    iget-object v1, v1, Li0/a;->i:Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string v1, "\n\tviewportWidth: "

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    iget v1, p0, Li0/D;->g:F

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v1, "\n\tviewportHeight: "

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    iget v1, p0, Li0/D;->h:F

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string v1, "\n"

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    const-string v1, "StringBuilder().apply(builderAction).toString()"

    .line 45
    .line 46
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    return-object v0
.end method
