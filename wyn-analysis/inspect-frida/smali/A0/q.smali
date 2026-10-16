.class public final LA0/q;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Z

.field public final b:Landroid/text/Layout;

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/CharSequence;FLandroid/text/TextPaint;ILandroid/text/TextUtils$TruncateAt;IIILDd/c;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move/from16 v1, p2

    .line 6
    .line 7
    move/from16 v3, p4

    .line 8
    .line 9
    move-object/from16 v4, p9

    .line 10
    .line 11
    const/4 v12, 0x0

    .line 12
    const/4 v13, 0x1

    .line 13
    const-string v5, "charSequence"

    .line 14
    .line 15
    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const-string v5, "textPaint"

    .line 19
    .line 20
    move-object/from16 v6, p3

    .line 21
    .line 22
    invoke-static {v6, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const-string v5, "layoutIntrinsics"

    .line 26
    .line 27
    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    invoke-static/range {p6 .. p6}, LA0/l;->a(I)Landroid/text/TextDirectionHeuristic;

    .line 38
    .line 39
    .line 40
    move-result-object v7

    .line 41
    sget-object v8, LA0/o;->a:Landroid/text/Layout$Alignment;

    .line 42
    .line 43
    if-eqz v3, :cond_4

    .line 44
    .line 45
    if-eq v3, v13, :cond_3

    .line 46
    .line 47
    const/4 v8, 0x2

    .line 48
    if-eq v3, v8, :cond_2

    .line 49
    .line 50
    const/4 v8, 0x3

    .line 51
    if-eq v3, v8, :cond_1

    .line 52
    .line 53
    const/4 v8, 0x4

    .line 54
    if-eq v3, v8, :cond_0

    .line 55
    .line 56
    sget-object v3, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    sget-object v3, LA0/o;->b:Landroid/text/Layout$Alignment;

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    sget-object v3, LA0/o;->a:Landroid/text/Layout$Alignment;

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_2
    sget-object v3, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_3
    sget-object v3, Landroid/text/Layout$Alignment;->ALIGN_OPPOSITE:Landroid/text/Layout$Alignment;

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_4
    sget-object v3, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    .line 72
    .line 73
    :goto_0
    instance-of v8, v2, Landroid/text/Spanned;

    .line 74
    .line 75
    if-eqz v8, :cond_5

    .line 76
    .line 77
    move-object v8, v2

    .line 78
    check-cast v8, Landroid/text/Spanned;

    .line 79
    .line 80
    const/4 v9, -0x1

    .line 81
    const-class v10, LC0/a;

    .line 82
    .line 83
    invoke-interface {v8, v9, v5, v10}, Landroid/text/Spanned;->nextSpanTransition(IILjava/lang/Class;)I

    .line 84
    .line 85
    .line 86
    move-result v8

    .line 87
    if-ge v8, v5, :cond_5

    .line 88
    .line 89
    move v5, v13

    .line 90
    goto :goto_1

    .line 91
    :cond_5
    move v5, v12

    .line 92
    :goto_1
    iget-object v8, v4, LDd/c;->b:Ljava/lang/Object;

    .line 93
    .line 94
    invoke-interface {v8}, Lef/i;->getValue()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v8

    .line 98
    check-cast v8, Landroid/text/BoringLayout$Metrics;

    .line 99
    .line 100
    float-to-double v9, v1

    .line 101
    invoke-static {v9, v10}, Ljava/lang/Math;->ceil(D)D

    .line 102
    .line 103
    .line 104
    move-result-wide v14

    .line 105
    double-to-float v11, v14

    .line 106
    float-to-int v11, v11

    .line 107
    const-string v14, "alignment"

    .line 108
    .line 109
    if-eqz v8, :cond_9

    .line 110
    .line 111
    iget-object v4, v4, LDd/c;->d:Ljava/lang/Object;

    .line 112
    .line 113
    invoke-interface {v4}, Lef/i;->getValue()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v4

    .line 117
    check-cast v4, Ljava/lang/Number;

    .line 118
    .line 119
    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    .line 120
    .line 121
    .line 122
    move-result v4

    .line 123
    cmpg-float v1, v4, v1

    .line 124
    .line 125
    if-gtz v1, :cond_9

    .line 126
    .line 127
    if-nez v5, :cond_9

    .line 128
    .line 129
    invoke-static {v3, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    const-string v1, "Failed requirement."

    .line 133
    .line 134
    if-ltz v11, :cond_8

    .line 135
    .line 136
    if-ltz v11, :cond_7

    .line 137
    .line 138
    const/4 v9, 0x1

    .line 139
    if-nez p5, :cond_6

    .line 140
    .line 141
    new-instance v1, Landroid/text/BoringLayout;

    .line 142
    .line 143
    const/high16 v6, 0x3f800000    # 1.0f

    .line 144
    .line 145
    const/4 v7, 0x0

    .line 146
    move-object v5, v3

    .line 147
    move v4, v11

    .line 148
    move-object/from16 v3, p3

    .line 149
    .line 150
    invoke-direct/range {v1 .. v9}, Landroid/text/BoringLayout;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFLandroid/text/BoringLayout$Metrics;Z)V

    .line 151
    .line 152
    .line 153
    goto :goto_2

    .line 154
    :cond_6
    move-object v5, v3

    .line 155
    move v4, v11

    .line 156
    new-instance v1, Landroid/text/BoringLayout;

    .line 157
    .line 158
    const/high16 v6, 0x3f800000    # 1.0f

    .line 159
    .line 160
    const/4 v7, 0x0

    .line 161
    move-object/from16 v2, p1

    .line 162
    .line 163
    move-object/from16 v3, p3

    .line 164
    .line 165
    move-object/from16 v10, p5

    .line 166
    .line 167
    invoke-direct/range {v1 .. v11}, Landroid/text/BoringLayout;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFLandroid/text/BoringLayout$Metrics;ZLandroid/text/TextUtils$TruncateAt;I)V

    .line 168
    .line 169
    .line 170
    :goto_2
    move/from16 v8, p7

    .line 171
    .line 172
    goto :goto_3

    .line 173
    :cond_7
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 174
    .line 175
    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    throw v2

    .line 179
    :cond_8
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 180
    .line 181
    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    throw v2

    .line 185
    :cond_9
    move-object v5, v3

    .line 186
    move v4, v11

    .line 187
    invoke-interface/range {p1 .. p1}, Ljava/lang/CharSequence;->length()I

    .line 188
    .line 189
    .line 190
    move-result v3

    .line 191
    invoke-static {v9, v10}, Ljava/lang/Math;->ceil(D)D

    .line 192
    .line 193
    .line 194
    move-result-wide v1

    .line 195
    double-to-float v1, v1

    .line 196
    float-to-int v10, v1

    .line 197
    invoke-static {v5, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    sget-object v14, LA0/l;->a:LA0/g;

    .line 201
    .line 202
    new-instance v1, LA0/n;

    .line 203
    .line 204
    move-object/from16 v2, p1

    .line 205
    .line 206
    move-object/from16 v9, p5

    .line 207
    .line 208
    move/from16 v8, p7

    .line 209
    .line 210
    move/from16 v11, p8

    .line 211
    .line 212
    move-object v6, v7

    .line 213
    move-object v7, v5

    .line 214
    move v5, v4

    .line 215
    move-object/from16 v4, p3

    .line 216
    .line 217
    invoke-direct/range {v1 .. v11}, LA0/n;-><init>(Ljava/lang/CharSequence;ILandroid/text/TextPaint;ILandroid/text/TextDirectionHeuristic;Landroid/text/Layout$Alignment;ILandroid/text/TextUtils$TruncateAt;II)V

    .line 218
    .line 219
    .line 220
    invoke-interface {v14, v1}, LA0/m;->a(LA0/n;)Landroid/text/StaticLayout;

    .line 221
    .line 222
    .line 223
    move-result-object v1

    .line 224
    :goto_3
    iput-object v1, v0, LA0/q;->b:Landroid/text/Layout;

    .line 225
    .line 226
    invoke-virtual {v1}, Landroid/text/Layout;->getLineCount()I

    .line 227
    .line 228
    .line 229
    move-result v2

    .line 230
    invoke-static {v2, v8}, Ljava/lang/Math;->min(II)I

    .line 231
    .line 232
    .line 233
    move-result v2

    .line 234
    iput v2, v0, LA0/q;->c:I

    .line 235
    .line 236
    if-ge v2, v8, :cond_b

    .line 237
    .line 238
    :cond_a
    move v1, v12

    .line 239
    goto :goto_4

    .line 240
    :cond_b
    sub-int/2addr v2, v13

    .line 241
    invoke-virtual {v1, v2}, Landroid/text/Layout;->getEllipsisCount(I)I

    .line 242
    .line 243
    .line 244
    move-result v3

    .line 245
    if-gtz v3, :cond_c

    .line 246
    .line 247
    invoke-virtual {v1, v2}, Landroid/text/Layout;->getLineEnd(I)I

    .line 248
    .line 249
    .line 250
    move-result v1

    .line 251
    invoke-interface/range {p1 .. p1}, Ljava/lang/CharSequence;->length()I

    .line 252
    .line 253
    .line 254
    move-result v2

    .line 255
    if-eq v1, v2, :cond_a

    .line 256
    .line 257
    :cond_c
    move v1, v13

    .line 258
    :goto_4
    iput-boolean v1, v0, LA0/q;->a:Z

    .line 259
    .line 260
    sget-object v1, LA0/l;->b:Lef/k;

    .line 261
    .line 262
    invoke-virtual {v0}, LA0/q;->d()Ljava/lang/CharSequence;

    .line 263
    .line 264
    .line 265
    move-result-object v2

    .line 266
    instance-of v2, v2, Landroid/text/Spanned;

    .line 267
    .line 268
    if-nez v2, :cond_d

    .line 269
    .line 270
    new-array v2, v12, [LC0/f;

    .line 271
    .line 272
    goto :goto_5

    .line 273
    :cond_d
    invoke-virtual {v0}, LA0/q;->d()Ljava/lang/CharSequence;

    .line 274
    .line 275
    .line 276
    move-result-object v2

    .line 277
    check-cast v2, Landroid/text/Spanned;

    .line 278
    .line 279
    invoke-virtual {v0}, LA0/q;->d()Ljava/lang/CharSequence;

    .line 280
    .line 281
    .line 282
    move-result-object v3

    .line 283
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    .line 284
    .line 285
    .line 286
    move-result v3

    .line 287
    const-class v4, LC0/f;

    .line 288
    .line 289
    invoke-interface {v2, v12, v3, v4}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object v2

    .line 293
    check-cast v2, [LC0/f;

    .line 294
    .line 295
    const-string v3, "lineHeightStyleSpans"

    .line 296
    .line 297
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 298
    .line 299
    .line 300
    array-length v3, v2

    .line 301
    if-nez v3, :cond_e

    .line 302
    .line 303
    new-array v2, v12, [LC0/f;

    .line 304
    .line 305
    :cond_e
    :goto_5
    array-length v3, v2

    .line 306
    move v4, v12

    .line 307
    move v5, v4

    .line 308
    move v6, v5

    .line 309
    :goto_6
    if-ge v4, v3, :cond_11

    .line 310
    .line 311
    aget-object v7, v2, v4

    .line 312
    .line 313
    iget v8, v7, LC0/f;->h:I

    .line 314
    .line 315
    if-gez v8, :cond_f

    .line 316
    .line 317
    invoke-static {v8}, Ljava/lang/Math;->abs(I)I

    .line 318
    .line 319
    .line 320
    move-result v8

    .line 321
    invoke-static {v5, v8}, Ljava/lang/Math;->max(II)I

    .line 322
    .line 323
    .line 324
    move-result v5

    .line 325
    :cond_f
    iget v7, v7, LC0/f;->i:I

    .line 326
    .line 327
    if-gez v7, :cond_10

    .line 328
    .line 329
    invoke-static {v7}, Ljava/lang/Math;->abs(I)I

    .line 330
    .line 331
    .line 332
    move-result v6

    .line 333
    invoke-static {v5, v6}, Ljava/lang/Math;->max(II)I

    .line 334
    .line 335
    .line 336
    move-result v6

    .line 337
    :cond_10
    add-int/2addr v4, v13

    .line 338
    goto :goto_6

    .line 339
    :cond_11
    if-nez v5, :cond_12

    .line 340
    .line 341
    if-nez v6, :cond_12

    .line 342
    .line 343
    goto :goto_7

    .line 344
    :cond_12
    new-instance v1, Lef/k;

    .line 345
    .line 346
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 347
    .line 348
    .line 349
    move-result-object v2

    .line 350
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 351
    .line 352
    .line 353
    move-result-object v3

    .line 354
    invoke-direct {v1, v2, v3}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 355
    .line 356
    .line 357
    :goto_7
    iget-object v2, v1, Lef/k;->a:Ljava/lang/Object;

    .line 358
    .line 359
    check-cast v2, Ljava/lang/Number;

    .line 360
    .line 361
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 362
    .line 363
    .line 364
    move-result v2

    .line 365
    invoke-static {v12, v2}, Ljava/lang/Math;->max(II)I

    .line 366
    .line 367
    .line 368
    move-result v2

    .line 369
    iput v2, v0, LA0/q;->d:I

    .line 370
    .line 371
    iget-object v1, v1, Lef/k;->b:Ljava/lang/Object;

    .line 372
    .line 373
    check-cast v1, Ljava/lang/Number;

    .line 374
    .line 375
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 376
    .line 377
    .line 378
    move-result v1

    .line 379
    invoke-static {v12, v1}, Ljava/lang/Math;->max(II)I

    .line 380
    .line 381
    .line 382
    move-result v1

    .line 383
    iput v1, v0, LA0/q;->e:I

    .line 384
    .line 385
    sget-object v1, Lef/j;->c:Lef/j;

    .line 386
    .line 387
    new-instance v2, LA0/p;

    .line 388
    .line 389
    invoke-direct {v2, v0, v12}, LA0/p;-><init>(Ljava/lang/Object;I)V

    .line 390
    .line 391
    .line 392
    invoke-static {v1, v2}, LFe/c;->y(Lef/j;Ltf/a;)Lef/i;

    .line 393
    .line 394
    .line 395
    move-result-object v1

    .line 396
    iput-object v1, v0, LA0/q;->f:Ljava/lang/Object;

    .line 397
    .line 398
    return-void
.end method


# virtual methods
.method public final a(I)F
    .locals 2

    .line 1
    iget v0, p0, LA0/q;->d:I

    .line 2
    .line 3
    int-to-float v0, v0

    .line 4
    iget-object v1, p0, LA0/q;->b:Landroid/text/Layout;

    .line 5
    .line 6
    invoke-virtual {v1, p1}, Landroid/text/Layout;->getLineBaseline(I)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    int-to-float p1, p1

    .line 11
    add-float/2addr v0, p1

    .line 12
    return v0
.end method

.method public final b(I)F
    .locals 2

    .line 1
    iget v0, p0, LA0/q;->d:I

    .line 2
    .line 3
    int-to-float v0, v0

    .line 4
    iget-object v1, p0, LA0/q;->b:Landroid/text/Layout;

    .line 5
    .line 6
    invoke-virtual {v1, p1}, Landroid/text/Layout;->getLineBottom(I)I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    int-to-float v1, v1

    .line 11
    add-float/2addr v0, v1

    .line 12
    iget v1, p0, LA0/q;->c:I

    .line 13
    .line 14
    add-int/lit8 v1, v1, -0x1

    .line 15
    .line 16
    if-ne p1, v1, :cond_0

    .line 17
    .line 18
    iget p1, p0, LA0/q;->e:I

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 p1, 0x0

    .line 22
    :goto_0
    int-to-float p1, p1

    .line 23
    add-float/2addr v0, p1

    .line 24
    return v0
.end method

.method public final c(I)F
    .locals 1

    .line 1
    iget-object v0, p0, LA0/q;->b:Landroid/text/Layout;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/text/Layout;->getLineTop(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    int-to-float v0, v0

    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget p1, p0, LA0/q;->d:I

    .line 13
    .line 14
    :goto_0
    int-to-float p1, p1

    .line 15
    add-float/2addr v0, p1

    .line 16
    return v0
.end method

.method public final d()Ljava/lang/CharSequence;
    .locals 2

    .line 1
    iget-object v0, p0, LA0/q;->b:Landroid/text/Layout;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "layout.text"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method
