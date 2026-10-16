.class public final Lr6/k;
.super Lr6/j;
.source "SourceFile"


# instance fields
.field public final e:Z

.field public final f:Lr6/f;

.field public final g:Z

.field public final h:Z

.field public final i:I

.field public final j:I

.field public final k:I

.field public final l:I

.field public final m:Z

.field public final n:Z

.field public final o:I

.field public final p:Z

.field public final q:Z

.field public final r:I


# direct methods
.method public constructor <init>(ILf6/Z;ILr6/f;IIZ)V
    .locals 8

    .line 1
    const/4 v0, 0x4

    .line 2
    const/4 v1, 0x3

    .line 3
    const/4 v2, 0x2

    .line 4
    const/16 v3, 0x40

    .line 5
    .line 6
    const/4 v4, -0x1

    .line 7
    const/4 v5, 0x0

    .line 8
    const/4 v6, 0x1

    .line 9
    invoke-direct {p0, p1, p2, p3}, Lr6/j;-><init>(ILf6/Z;I)V

    .line 10
    .line 11
    .line 12
    iput-object p4, p0, Lr6/k;->f:Lr6/f;

    .line 13
    .line 14
    iget-boolean p1, p4, Lr6/f;->C:Z

    .line 15
    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    const/16 p1, 0x18

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/16 p1, 0x10

    .line 22
    .line 23
    :goto_0
    iget-boolean p2, p4, Lr6/f;->B:Z

    .line 24
    .line 25
    if-eqz p2, :cond_1

    .line 26
    .line 27
    and-int p2, p6, p1

    .line 28
    .line 29
    if-eqz p2, :cond_1

    .line 30
    .line 31
    move p2, v6

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    move p2, v5

    .line 34
    :goto_1
    iput-boolean p2, p0, Lr6/k;->n:Z

    .line 35
    .line 36
    const/high16 p2, -0x40800000    # -1.0f

    .line 37
    .line 38
    if-eqz p7, :cond_6

    .line 39
    .line 40
    iget-object p3, p0, Lr6/j;->d:LE5/T;

    .line 41
    .line 42
    iget p6, p3, LE5/T;->q:I

    .line 43
    .line 44
    if-eq p6, v4, :cond_2

    .line 45
    .line 46
    iget v7, p4, Lr6/r;->a:I

    .line 47
    .line 48
    if-gt p6, v7, :cond_6

    .line 49
    .line 50
    :cond_2
    iget p6, p3, LE5/T;->r:I

    .line 51
    .line 52
    if-eq p6, v4, :cond_3

    .line 53
    .line 54
    iget v7, p4, Lr6/r;->b:I

    .line 55
    .line 56
    if-gt p6, v7, :cond_6

    .line 57
    .line 58
    :cond_3
    iget p6, p3, LE5/T;->s:F

    .line 59
    .line 60
    cmpl-float v7, p6, p2

    .line 61
    .line 62
    if-eqz v7, :cond_4

    .line 63
    .line 64
    iget v7, p4, Lr6/r;->c:I

    .line 65
    .line 66
    int-to-float v7, v7

    .line 67
    cmpg-float p6, p6, v7

    .line 68
    .line 69
    if-gtz p6, :cond_6

    .line 70
    .line 71
    :cond_4
    iget p3, p3, LE5/T;->h:I

    .line 72
    .line 73
    if-eq p3, v4, :cond_5

    .line 74
    .line 75
    iget p6, p4, Lr6/r;->d:I

    .line 76
    .line 77
    if-gt p3, p6, :cond_6

    .line 78
    .line 79
    :cond_5
    move p3, v6

    .line 80
    goto :goto_2

    .line 81
    :cond_6
    move p3, v5

    .line 82
    :goto_2
    iput-boolean p3, p0, Lr6/k;->e:Z

    .line 83
    .line 84
    if-eqz p7, :cond_b

    .line 85
    .line 86
    iget-object p3, p0, Lr6/j;->d:LE5/T;

    .line 87
    .line 88
    iget p6, p3, LE5/T;->q:I

    .line 89
    .line 90
    if-eq p6, v4, :cond_7

    .line 91
    .line 92
    iget p7, p4, Lr6/r;->e:I

    .line 93
    .line 94
    if-lt p6, p7, :cond_b

    .line 95
    .line 96
    :cond_7
    iget p6, p3, LE5/T;->r:I

    .line 97
    .line 98
    if-eq p6, v4, :cond_8

    .line 99
    .line 100
    iget p7, p4, Lr6/r;->f:I

    .line 101
    .line 102
    if-lt p6, p7, :cond_b

    .line 103
    .line 104
    :cond_8
    iget p6, p3, LE5/T;->s:F

    .line 105
    .line 106
    cmpl-float p2, p6, p2

    .line 107
    .line 108
    if-eqz p2, :cond_9

    .line 109
    .line 110
    iget p2, p4, Lr6/r;->g:I

    .line 111
    .line 112
    int-to-float p2, p2

    .line 113
    cmpl-float p2, p6, p2

    .line 114
    .line 115
    if-ltz p2, :cond_b

    .line 116
    .line 117
    :cond_9
    iget p2, p3, LE5/T;->h:I

    .line 118
    .line 119
    if-eq p2, v4, :cond_a

    .line 120
    .line 121
    iget p3, p4, Lr6/r;->h:I

    .line 122
    .line 123
    if-lt p2, p3, :cond_b

    .line 124
    .line 125
    :cond_a
    move p2, v6

    .line 126
    goto :goto_3

    .line 127
    :cond_b
    move p2, v5

    .line 128
    :goto_3
    iput-boolean p2, p0, Lr6/k;->g:Z

    .line 129
    .line 130
    invoke-static {p5, v5}, Lr6/l;->e(IZ)Z

    .line 131
    .line 132
    .line 133
    move-result p2

    .line 134
    iput-boolean p2, p0, Lr6/k;->h:Z

    .line 135
    .line 136
    iget-object p2, p0, Lr6/j;->d:LE5/T;

    .line 137
    .line 138
    iget p3, p2, LE5/T;->h:I

    .line 139
    .line 140
    iput p3, p0, Lr6/k;->i:I

    .line 141
    .line 142
    iget p3, p2, LE5/T;->q:I

    .line 143
    .line 144
    if-eq p3, v4, :cond_d

    .line 145
    .line 146
    iget p6, p2, LE5/T;->r:I

    .line 147
    .line 148
    if-ne p6, v4, :cond_c

    .line 149
    .line 150
    goto :goto_4

    .line 151
    :cond_c
    mul-int/2addr p3, p6

    .line 152
    goto :goto_5

    .line 153
    :cond_d
    :goto_4
    move p3, v4

    .line 154
    :goto_5
    iput p3, p0, Lr6/k;->j:I

    .line 155
    .line 156
    iget p2, p2, LE5/T;->e:I

    .line 157
    .line 158
    const p3, 0x7fffffff

    .line 159
    .line 160
    .line 161
    iget p6, p4, Lr6/r;->m:I

    .line 162
    .line 163
    if-eqz p2, :cond_e

    .line 164
    .line 165
    if-ne p2, p6, :cond_e

    .line 166
    .line 167
    move p2, p3

    .line 168
    goto :goto_6

    .line 169
    :cond_e
    and-int/2addr p2, p6

    .line 170
    invoke-static {p2}, Ljava/lang/Integer;->bitCount(I)I

    .line 171
    .line 172
    .line 173
    move-result p2

    .line 174
    :goto_6
    iput p2, p0, Lr6/k;->l:I

    .line 175
    .line 176
    iget-object p2, p0, Lr6/j;->d:LE5/T;

    .line 177
    .line 178
    iget p2, p2, LE5/T;->e:I

    .line 179
    .line 180
    if-eqz p2, :cond_10

    .line 181
    .line 182
    and-int/2addr p2, v6

    .line 183
    if-eqz p2, :cond_f

    .line 184
    .line 185
    goto :goto_7

    .line 186
    :cond_f
    move p2, v5

    .line 187
    goto :goto_8

    .line 188
    :cond_10
    :goto_7
    move p2, v6

    .line 189
    :goto_8
    iput-boolean p2, p0, Lr6/k;->m:Z

    .line 190
    .line 191
    move p2, v5

    .line 192
    :goto_9
    iget-object p6, p4, Lr6/r;->l:Ll8/e0;

    .line 193
    .line 194
    iget p7, p6, Ll8/e0;->d:I

    .line 195
    .line 196
    if-ge p2, p7, :cond_12

    .line 197
    .line 198
    iget-object p7, p0, Lr6/j;->d:LE5/T;

    .line 199
    .line 200
    iget-object p7, p7, LE5/T;->l:Ljava/lang/String;

    .line 201
    .line 202
    if-eqz p7, :cond_11

    .line 203
    .line 204
    invoke-virtual {p6, p2}, Ll8/e0;->get(I)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object p6

    .line 208
    invoke-virtual {p7, p6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    move-result p6

    .line 212
    if-eqz p6, :cond_11

    .line 213
    .line 214
    move p3, p2

    .line 215
    goto :goto_a

    .line 216
    :cond_11
    add-int/2addr p2, v6

    .line 217
    goto :goto_9

    .line 218
    :cond_12
    :goto_a
    iput p3, p0, Lr6/k;->k:I

    .line 219
    .line 220
    and-int/lit16 p2, p5, 0x180

    .line 221
    .line 222
    const/16 p3, 0x80

    .line 223
    .line 224
    if-ne p2, p3, :cond_13

    .line 225
    .line 226
    move p2, v6

    .line 227
    goto :goto_b

    .line 228
    :cond_13
    move p2, v5

    .line 229
    :goto_b
    iput-boolean p2, p0, Lr6/k;->p:Z

    .line 230
    .line 231
    and-int/lit8 p2, p5, 0x40

    .line 232
    .line 233
    if-ne p2, v3, :cond_14

    .line 234
    .line 235
    move p2, v6

    .line 236
    goto :goto_c

    .line 237
    :cond_14
    move p2, v5

    .line 238
    :goto_c
    iput-boolean p2, p0, Lr6/k;->q:Z

    .line 239
    .line 240
    iget-object p2, p0, Lr6/j;->d:LE5/T;

    .line 241
    .line 242
    iget-object p3, p2, LE5/T;->l:Ljava/lang/String;

    .line 243
    .line 244
    if-nez p3, :cond_15

    .line 245
    .line 246
    goto :goto_f

    .line 247
    :cond_15
    invoke-virtual {p3}, Ljava/lang/String;->hashCode()I

    .line 248
    .line 249
    .line 250
    move-result p4

    .line 251
    sparse-switch p4, :sswitch_data_0

    .line 252
    .line 253
    .line 254
    :goto_d
    move p3, v4

    .line 255
    goto :goto_e

    .line 256
    :sswitch_0
    const-string p4, "video/x-vnd.on2.vp9"

    .line 257
    .line 258
    invoke-virtual {p3, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 259
    .line 260
    .line 261
    move-result p3

    .line 262
    if-nez p3, :cond_16

    .line 263
    .line 264
    goto :goto_d

    .line 265
    :cond_16
    move p3, v0

    .line 266
    goto :goto_e

    .line 267
    :sswitch_1
    const-string p4, "video/avc"

    .line 268
    .line 269
    invoke-virtual {p3, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 270
    .line 271
    .line 272
    move-result p3

    .line 273
    if-nez p3, :cond_17

    .line 274
    .line 275
    goto :goto_d

    .line 276
    :cond_17
    move p3, v1

    .line 277
    goto :goto_e

    .line 278
    :sswitch_2
    const-string p4, "video/hevc"

    .line 279
    .line 280
    invoke-virtual {p3, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 281
    .line 282
    .line 283
    move-result p3

    .line 284
    if-nez p3, :cond_18

    .line 285
    .line 286
    goto :goto_d

    .line 287
    :cond_18
    move p3, v2

    .line 288
    goto :goto_e

    .line 289
    :sswitch_3
    const-string p4, "video/av01"

    .line 290
    .line 291
    invoke-virtual {p3, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 292
    .line 293
    .line 294
    move-result p3

    .line 295
    if-nez p3, :cond_19

    .line 296
    .line 297
    goto :goto_d

    .line 298
    :cond_19
    move p3, v6

    .line 299
    goto :goto_e

    .line 300
    :sswitch_4
    const-string p4, "video/dolby-vision"

    .line 301
    .line 302
    invoke-virtual {p3, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 303
    .line 304
    .line 305
    move-result p3

    .line 306
    if-nez p3, :cond_1a

    .line 307
    .line 308
    goto :goto_d

    .line 309
    :cond_1a
    move p3, v5

    .line 310
    :goto_e
    packed-switch p3, :pswitch_data_0

    .line 311
    .line 312
    .line 313
    :goto_f
    move v0, v5

    .line 314
    goto :goto_10

    .line 315
    :pswitch_0
    move v0, v2

    .line 316
    goto :goto_10

    .line 317
    :pswitch_1
    move v0, v6

    .line 318
    goto :goto_10

    .line 319
    :pswitch_2
    move v0, v1

    .line 320
    goto :goto_10

    .line 321
    :pswitch_3
    const/4 v0, 0x5

    .line 322
    :goto_10
    :pswitch_4
    iput v0, p0, Lr6/k;->r:I

    .line 323
    .line 324
    iget p3, p2, LE5/T;->e:I

    .line 325
    .line 326
    and-int/lit16 p3, p3, 0x4000

    .line 327
    .line 328
    if-eqz p3, :cond_1b

    .line 329
    .line 330
    :goto_11
    move v2, v5

    .line 331
    goto :goto_12

    .line 332
    :cond_1b
    iget-object p3, p0, Lr6/k;->f:Lr6/f;

    .line 333
    .line 334
    iget-boolean p4, p3, Lr6/f;->K:Z

    .line 335
    .line 336
    invoke-static {p5, p4}, Lr6/l;->e(IZ)Z

    .line 337
    .line 338
    .line 339
    move-result p4

    .line 340
    if-nez p4, :cond_1c

    .line 341
    .line 342
    goto :goto_11

    .line 343
    :cond_1c
    iget-boolean p4, p0, Lr6/k;->e:Z

    .line 344
    .line 345
    if-nez p4, :cond_1d

    .line 346
    .line 347
    iget-boolean p6, p3, Lr6/f;->A:Z

    .line 348
    .line 349
    if-nez p6, :cond_1d

    .line 350
    .line 351
    goto :goto_11

    .line 352
    :cond_1d
    invoke-static {p5, v5}, Lr6/l;->e(IZ)Z

    .line 353
    .line 354
    .line 355
    move-result p6

    .line 356
    if-eqz p6, :cond_1e

    .line 357
    .line 358
    iget-boolean p6, p0, Lr6/k;->g:Z

    .line 359
    .line 360
    if-eqz p6, :cond_1e

    .line 361
    .line 362
    if-eqz p4, :cond_1e

    .line 363
    .line 364
    iget p2, p2, LE5/T;->h:I

    .line 365
    .line 366
    if-eq p2, v4, :cond_1e

    .line 367
    .line 368
    iget-boolean p2, p3, Lr6/r;->x:Z

    .line 369
    .line 370
    if-nez p2, :cond_1e

    .line 371
    .line 372
    iget-boolean p2, p3, Lr6/r;->w:Z

    .line 373
    .line 374
    if-nez p2, :cond_1e

    .line 375
    .line 376
    and-int/2addr p1, p5

    .line 377
    if-eqz p1, :cond_1e

    .line 378
    .line 379
    goto :goto_12

    .line 380
    :cond_1e
    move v2, v6

    .line 381
    :goto_12
    iput v2, p0, Lr6/k;->o:I

    .line 382
    .line 383
    return-void

    .line 384
    nop

    .line 385
    :sswitch_data_0
    .sparse-switch
        -0x6e5534ef -> :sswitch_4
        -0x631b55f6 -> :sswitch_3
        -0x63185e82 -> :sswitch_2
        0x4f62373a -> :sswitch_1
        0x5f50bed9 -> :sswitch_0
    .end sparse-switch

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
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_4
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static c(Lr6/k;Lr6/k;)I
    .locals 4

    .line 1
    sget-object v0, Ll8/A;->a:Ll8/y;

    .line 2
    .line 3
    iget-boolean v1, p0, Lr6/k;->h:Z

    .line 4
    .line 5
    iget-boolean v2, p1, Lr6/k;->h:Z

    .line 6
    .line 7
    invoke-virtual {v0, v1, v2}, Ll8/y;->c(ZZ)Ll8/A;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget v1, p0, Lr6/k;->l:I

    .line 12
    .line 13
    iget v2, p1, Lr6/k;->l:I

    .line 14
    .line 15
    invoke-virtual {v0, v1, v2}, Ll8/A;->a(II)Ll8/A;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-boolean v1, p0, Lr6/k;->m:Z

    .line 20
    .line 21
    iget-boolean v2, p1, Lr6/k;->m:Z

    .line 22
    .line 23
    invoke-virtual {v0, v1, v2}, Ll8/A;->c(ZZ)Ll8/A;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iget-boolean v1, p0, Lr6/k;->e:Z

    .line 28
    .line 29
    iget-boolean v2, p1, Lr6/k;->e:Z

    .line 30
    .line 31
    invoke-virtual {v0, v1, v2}, Ll8/A;->c(ZZ)Ll8/A;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iget-boolean v1, p0, Lr6/k;->g:Z

    .line 36
    .line 37
    iget-boolean v2, p1, Lr6/k;->g:Z

    .line 38
    .line 39
    invoke-virtual {v0, v1, v2}, Ll8/A;->c(ZZ)Ll8/A;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iget v1, p0, Lr6/k;->k:I

    .line 44
    .line 45
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    iget v2, p1, Lr6/k;->k:I

    .line 50
    .line 51
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    sget-object v3, Ll8/c0;->c:Ll8/c0;

    .line 56
    .line 57
    invoke-virtual {v0, v1, v2, v3}, Ll8/A;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Ll8/A;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    iget-boolean v1, p1, Lr6/k;->p:Z

    .line 62
    .line 63
    iget-boolean v2, p0, Lr6/k;->p:Z

    .line 64
    .line 65
    invoke-virtual {v0, v2, v1}, Ll8/A;->c(ZZ)Ll8/A;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    iget-boolean v1, p1, Lr6/k;->q:Z

    .line 70
    .line 71
    iget-boolean v3, p0, Lr6/k;->q:Z

    .line 72
    .line 73
    invoke-virtual {v0, v3, v1}, Ll8/A;->c(ZZ)Ll8/A;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    if-eqz v2, :cond_0

    .line 78
    .line 79
    if-eqz v3, :cond_0

    .line 80
    .line 81
    iget p0, p0, Lr6/k;->r:I

    .line 82
    .line 83
    iget p1, p1, Lr6/k;->r:I

    .line 84
    .line 85
    invoke-virtual {v0, p0, p1}, Ll8/A;->a(II)Ll8/A;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    :cond_0
    invoke-virtual {v0}, Ll8/A;->e()I

    .line 90
    .line 91
    .line 92
    move-result p0

    .line 93
    return p0
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    iget v0, p0, Lr6/k;->o:I

    .line 2
    .line 3
    return v0
.end method

.method public final b(Lr6/j;)Z
    .locals 2

    .line 1
    check-cast p1, Lr6/k;

    .line 2
    .line 3
    iget-boolean v0, p0, Lr6/k;->n:Z

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lr6/j;->d:LE5/T;

    .line 8
    .line 9
    iget-object v0, v0, LE5/T;->l:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v1, p1, Lr6/j;->d:LE5/T;

    .line 12
    .line 13
    iget-object v1, v1, LE5/T;->l:Ljava/lang/String;

    .line 14
    .line 15
    invoke-static {v0, v1}, Lu6/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    :cond_0
    iget-object v0, p0, Lr6/k;->f:Lr6/f;

    .line 22
    .line 23
    iget-boolean v0, v0, Lr6/f;->D:Z

    .line 24
    .line 25
    if-nez v0, :cond_2

    .line 26
    .line 27
    iget-boolean v0, p1, Lr6/k;->p:Z

    .line 28
    .line 29
    iget-boolean v1, p0, Lr6/k;->p:Z

    .line 30
    .line 31
    if-ne v1, v0, :cond_1

    .line 32
    .line 33
    iget-boolean v0, p0, Lr6/k;->q:Z

    .line 34
    .line 35
    iget-boolean p1, p1, Lr6/k;->q:Z

    .line 36
    .line 37
    if-ne v0, p1, :cond_1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    const/4 p1, 0x0

    .line 41
    return p1

    .line 42
    :cond_2
    :goto_0
    const/4 p1, 0x1

    .line 43
    return p1
.end method
