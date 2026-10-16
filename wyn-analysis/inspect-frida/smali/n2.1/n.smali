.class public final Ln2/n;
.super Ln2/m;
.source "SourceFile"


# instance fields
.field public final e:Z

.field public final f:Ln2/i;

.field public final g:Z

.field public final h:Z

.field public final i:Z

.field public final j:I

.field public final k:I

.field public final l:I

.field public final m:I

.field public final n:Z

.field public final o:Z

.field public final p:I

.field public final q:Z

.field public final r:Z

.field public final s:I


# direct methods
.method public constructor <init>(ILN1/O;ILn2/i;IIZ)V
    .locals 8

    .line 1
    const/4 p6, 0x4

    .line 2
    const/4 v0, 0x3

    .line 3
    const/4 v1, 0x2

    .line 4
    const/16 v2, 0x40

    .line 5
    .line 6
    const/4 v3, -0x1

    .line 7
    const/4 v4, 0x0

    .line 8
    const/4 v5, 0x1

    .line 9
    invoke-direct {p0, p1, p2, p3}, Ln2/m;-><init>(ILN1/O;I)V

    .line 10
    .line 11
    .line 12
    iput-object p4, p0, Ln2/n;->f:Ln2/i;

    .line 13
    .line 14
    iget-boolean p1, p4, Ln2/i;->s:Z

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
    iput-boolean v4, p0, Ln2/n;->o:Z

    .line 24
    .line 25
    const/high16 p2, -0x40800000    # -1.0f

    .line 26
    .line 27
    if-eqz p7, :cond_5

    .line 28
    .line 29
    iget-object p3, p0, Ln2/m;->d:LN1/n;

    .line 30
    .line 31
    iget v6, p3, LN1/n;->u:I

    .line 32
    .line 33
    if-eq v6, v3, :cond_1

    .line 34
    .line 35
    iget v7, p4, LN1/T;->a:I

    .line 36
    .line 37
    if-gt v6, v7, :cond_5

    .line 38
    .line 39
    :cond_1
    iget v6, p3, LN1/n;->v:I

    .line 40
    .line 41
    if-eq v6, v3, :cond_2

    .line 42
    .line 43
    iget v7, p4, LN1/T;->b:I

    .line 44
    .line 45
    if-gt v6, v7, :cond_5

    .line 46
    .line 47
    :cond_2
    iget v6, p3, LN1/n;->w:F

    .line 48
    .line 49
    cmpl-float v7, v6, p2

    .line 50
    .line 51
    if-eqz v7, :cond_3

    .line 52
    .line 53
    iget v7, p4, LN1/T;->c:I

    .line 54
    .line 55
    int-to-float v7, v7

    .line 56
    cmpg-float v6, v6, v7

    .line 57
    .line 58
    if-gtz v6, :cond_5

    .line 59
    .line 60
    :cond_3
    iget p3, p3, LN1/n;->j:I

    .line 61
    .line 62
    if-eq p3, v3, :cond_4

    .line 63
    .line 64
    iget v6, p4, LN1/T;->d:I

    .line 65
    .line 66
    if-gt p3, v6, :cond_5

    .line 67
    .line 68
    :cond_4
    move p3, v5

    .line 69
    goto :goto_1

    .line 70
    :cond_5
    move p3, v4

    .line 71
    :goto_1
    iput-boolean p3, p0, Ln2/n;->e:Z

    .line 72
    .line 73
    if-eqz p7, :cond_a

    .line 74
    .line 75
    iget-object p3, p0, Ln2/m;->d:LN1/n;

    .line 76
    .line 77
    iget p7, p3, LN1/n;->u:I

    .line 78
    .line 79
    if-eq p7, v3, :cond_6

    .line 80
    .line 81
    if-ltz p7, :cond_a

    .line 82
    .line 83
    :cond_6
    iget p7, p3, LN1/n;->v:I

    .line 84
    .line 85
    if-eq p7, v3, :cond_7

    .line 86
    .line 87
    if-ltz p7, :cond_a

    .line 88
    .line 89
    :cond_7
    iget p7, p3, LN1/n;->w:F

    .line 90
    .line 91
    cmpl-float v6, p7, p2

    .line 92
    .line 93
    if-eqz v6, :cond_8

    .line 94
    .line 95
    int-to-float v6, v4

    .line 96
    cmpl-float p7, p7, v6

    .line 97
    .line 98
    if-ltz p7, :cond_a

    .line 99
    .line 100
    :cond_8
    iget p3, p3, LN1/n;->j:I

    .line 101
    .line 102
    if-eq p3, v3, :cond_9

    .line 103
    .line 104
    if-ltz p3, :cond_a

    .line 105
    .line 106
    :cond_9
    move p3, v5

    .line 107
    goto :goto_2

    .line 108
    :cond_a
    move p3, v4

    .line 109
    :goto_2
    iput-boolean p3, p0, Ln2/n;->g:Z

    .line 110
    .line 111
    invoke-static {p5, v4}, LR8/v;->c(IZ)Z

    .line 112
    .line 113
    .line 114
    move-result p3

    .line 115
    iput-boolean p3, p0, Ln2/n;->h:Z

    .line 116
    .line 117
    iget-object p3, p0, Ln2/m;->d:LN1/n;

    .line 118
    .line 119
    iget p7, p3, LN1/n;->w:F

    .line 120
    .line 121
    cmpl-float p2, p7, p2

    .line 122
    .line 123
    if-eqz p2, :cond_b

    .line 124
    .line 125
    const/high16 p2, 0x41200000    # 10.0f

    .line 126
    .line 127
    cmpl-float p2, p7, p2

    .line 128
    .line 129
    if-ltz p2, :cond_b

    .line 130
    .line 131
    move p2, v5

    .line 132
    goto :goto_3

    .line 133
    :cond_b
    move p2, v4

    .line 134
    :goto_3
    iput-boolean p2, p0, Ln2/n;->i:Z

    .line 135
    .line 136
    iget p2, p3, LN1/n;->j:I

    .line 137
    .line 138
    iput p2, p0, Ln2/n;->j:I

    .line 139
    .line 140
    iget p2, p3, LN1/n;->u:I

    .line 141
    .line 142
    if-eq p2, v3, :cond_d

    .line 143
    .line 144
    iget p7, p3, LN1/n;->v:I

    .line 145
    .line 146
    if-ne p7, v3, :cond_c

    .line 147
    .line 148
    goto :goto_4

    .line 149
    :cond_c
    mul-int/2addr p2, p7

    .line 150
    goto :goto_5

    .line 151
    :cond_d
    :goto_4
    move p2, v3

    .line 152
    :goto_5
    iput p2, p0, Ln2/n;->k:I

    .line 153
    .line 154
    iget p2, p3, LN1/n;->f:I

    .line 155
    .line 156
    sget-object p3, Ln2/o;->j:Ll8/d0;

    .line 157
    .line 158
    const p3, 0x7fffffff

    .line 159
    .line 160
    .line 161
    if-eqz p2, :cond_e

    .line 162
    .line 163
    if-nez p2, :cond_e

    .line 164
    .line 165
    move p2, p3

    .line 166
    goto :goto_6

    .line 167
    :cond_e
    invoke-static {v4}, Ljava/lang/Integer;->bitCount(I)I

    .line 168
    .line 169
    .line 170
    move-result p2

    .line 171
    :goto_6
    iput p2, p0, Ln2/n;->m:I

    .line 172
    .line 173
    iget-object p2, p0, Ln2/m;->d:LN1/n;

    .line 174
    .line 175
    iget p2, p2, LN1/n;->f:I

    .line 176
    .line 177
    if-eqz p2, :cond_10

    .line 178
    .line 179
    and-int/2addr p2, v5

    .line 180
    if-eqz p2, :cond_f

    .line 181
    .line 182
    goto :goto_7

    .line 183
    :cond_f
    move p2, v4

    .line 184
    goto :goto_8

    .line 185
    :cond_10
    :goto_7
    move p2, v5

    .line 186
    :goto_8
    iput-boolean p2, p0, Ln2/n;->n:Z

    .line 187
    .line 188
    move p2, v4

    .line 189
    :goto_9
    iget-object p7, p4, LN1/T;->h:Ll8/e0;

    .line 190
    .line 191
    iget v6, p7, Ll8/e0;->d:I

    .line 192
    .line 193
    if-ge p2, v6, :cond_12

    .line 194
    .line 195
    iget-object v6, p0, Ln2/m;->d:LN1/n;

    .line 196
    .line 197
    iget-object v6, v6, LN1/n;->n:Ljava/lang/String;

    .line 198
    .line 199
    if-eqz v6, :cond_11

    .line 200
    .line 201
    invoke-virtual {p7, p2}, Ll8/e0;->get(I)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object p7

    .line 205
    invoke-virtual {v6, p7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    move-result p7

    .line 209
    if-eqz p7, :cond_11

    .line 210
    .line 211
    move p3, p2

    .line 212
    goto :goto_a

    .line 213
    :cond_11
    add-int/2addr p2, v5

    .line 214
    goto :goto_9

    .line 215
    :cond_12
    :goto_a
    iput p3, p0, Ln2/n;->l:I

    .line 216
    .line 217
    and-int/lit16 p2, p5, 0x180

    .line 218
    .line 219
    const/16 p3, 0x80

    .line 220
    .line 221
    if-ne p2, p3, :cond_13

    .line 222
    .line 223
    move p2, v5

    .line 224
    goto :goto_b

    .line 225
    :cond_13
    move p2, v4

    .line 226
    :goto_b
    iput-boolean p2, p0, Ln2/n;->q:Z

    .line 227
    .line 228
    and-int/lit8 p2, p5, 0x40

    .line 229
    .line 230
    if-ne p2, v2, :cond_14

    .line 231
    .line 232
    move p2, v5

    .line 233
    goto :goto_c

    .line 234
    :cond_14
    move p2, v4

    .line 235
    :goto_c
    iput-boolean p2, p0, Ln2/n;->r:Z

    .line 236
    .line 237
    iget-object p2, p0, Ln2/m;->d:LN1/n;

    .line 238
    .line 239
    iget-object p3, p2, LN1/n;->n:Ljava/lang/String;

    .line 240
    .line 241
    if-nez p3, :cond_15

    .line 242
    .line 243
    goto :goto_f

    .line 244
    :cond_15
    invoke-virtual {p3}, Ljava/lang/String;->hashCode()I

    .line 245
    .line 246
    .line 247
    move-result p4

    .line 248
    sparse-switch p4, :sswitch_data_0

    .line 249
    .line 250
    .line 251
    :goto_d
    move p3, v3

    .line 252
    goto :goto_e

    .line 253
    :sswitch_0
    const-string p4, "video/x-vnd.on2.vp9"

    .line 254
    .line 255
    invoke-virtual {p3, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 256
    .line 257
    .line 258
    move-result p3

    .line 259
    if-nez p3, :cond_16

    .line 260
    .line 261
    goto :goto_d

    .line 262
    :cond_16
    move p3, p6

    .line 263
    goto :goto_e

    .line 264
    :sswitch_1
    const-string p4, "video/avc"

    .line 265
    .line 266
    invoke-virtual {p3, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 267
    .line 268
    .line 269
    move-result p3

    .line 270
    if-nez p3, :cond_17

    .line 271
    .line 272
    goto :goto_d

    .line 273
    :cond_17
    move p3, v0

    .line 274
    goto :goto_e

    .line 275
    :sswitch_2
    const-string p4, "video/hevc"

    .line 276
    .line 277
    invoke-virtual {p3, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 278
    .line 279
    .line 280
    move-result p3

    .line 281
    if-nez p3, :cond_18

    .line 282
    .line 283
    goto :goto_d

    .line 284
    :cond_18
    move p3, v1

    .line 285
    goto :goto_e

    .line 286
    :sswitch_3
    const-string p4, "video/av01"

    .line 287
    .line 288
    invoke-virtual {p3, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 289
    .line 290
    .line 291
    move-result p3

    .line 292
    if-nez p3, :cond_19

    .line 293
    .line 294
    goto :goto_d

    .line 295
    :cond_19
    move p3, v5

    .line 296
    goto :goto_e

    .line 297
    :sswitch_4
    const-string p4, "video/dolby-vision"

    .line 298
    .line 299
    invoke-virtual {p3, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 300
    .line 301
    .line 302
    move-result p3

    .line 303
    if-nez p3, :cond_1a

    .line 304
    .line 305
    goto :goto_d

    .line 306
    :cond_1a
    move p3, v4

    .line 307
    :goto_e
    packed-switch p3, :pswitch_data_0

    .line 308
    .line 309
    .line 310
    :goto_f
    move p6, v4

    .line 311
    goto :goto_10

    .line 312
    :pswitch_0
    move p6, v1

    .line 313
    goto :goto_10

    .line 314
    :pswitch_1
    move p6, v5

    .line 315
    goto :goto_10

    .line 316
    :pswitch_2
    move p6, v0

    .line 317
    goto :goto_10

    .line 318
    :pswitch_3
    const/4 p6, 0x5

    .line 319
    :goto_10
    :pswitch_4
    iput p6, p0, Ln2/n;->s:I

    .line 320
    .line 321
    iget p3, p2, LN1/n;->f:I

    .line 322
    .line 323
    and-int/lit16 p3, p3, 0x4000

    .line 324
    .line 325
    if-eqz p3, :cond_1b

    .line 326
    .line 327
    :goto_11
    move v1, v4

    .line 328
    goto :goto_12

    .line 329
    :cond_1b
    iget-object p3, p0, Ln2/n;->f:Ln2/i;

    .line 330
    .line 331
    iget-boolean p4, p3, Ln2/i;->w:Z

    .line 332
    .line 333
    invoke-static {p5, p4}, LR8/v;->c(IZ)Z

    .line 334
    .line 335
    .line 336
    move-result p4

    .line 337
    if-nez p4, :cond_1c

    .line 338
    .line 339
    goto :goto_11

    .line 340
    :cond_1c
    iget-boolean p4, p0, Ln2/n;->e:Z

    .line 341
    .line 342
    if-nez p4, :cond_1d

    .line 343
    .line 344
    iget-boolean p3, p3, Ln2/i;->r:Z

    .line 345
    .line 346
    if-nez p3, :cond_1d

    .line 347
    .line 348
    goto :goto_11

    .line 349
    :cond_1d
    invoke-static {p5, v4}, LR8/v;->c(IZ)Z

    .line 350
    .line 351
    .line 352
    move-result p3

    .line 353
    if-eqz p3, :cond_1e

    .line 354
    .line 355
    iget-boolean p3, p0, Ln2/n;->g:Z

    .line 356
    .line 357
    if-eqz p3, :cond_1e

    .line 358
    .line 359
    if-eqz p4, :cond_1e

    .line 360
    .line 361
    iget p2, p2, LN1/n;->j:I

    .line 362
    .line 363
    if-eq p2, v3, :cond_1e

    .line 364
    .line 365
    and-int/2addr p1, p5

    .line 366
    if-eqz p1, :cond_1e

    .line 367
    .line 368
    goto :goto_12

    .line 369
    :cond_1e
    move v1, v5

    .line 370
    :goto_12
    iput v1, p0, Ln2/n;->p:I

    .line 371
    .line 372
    return-void

    .line 373
    :sswitch_data_0
    .sparse-switch
        -0x6e5534ef -> :sswitch_4
        -0x631b55f6 -> :sswitch_3
        -0x63185e82 -> :sswitch_2
        0x4f62373a -> :sswitch_1
        0x5f50bed9 -> :sswitch_0
    .end sparse-switch

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
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_4
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static c(Ln2/n;Ln2/n;)I
    .locals 4

    .line 1
    sget-object v0, Ll8/A;->a:Ll8/y;

    .line 2
    .line 3
    iget-boolean v1, p0, Ln2/n;->h:Z

    .line 4
    .line 5
    iget-boolean v2, p1, Ln2/n;->h:Z

    .line 6
    .line 7
    invoke-virtual {v0, v1, v2}, Ll8/y;->c(ZZ)Ll8/A;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget v1, p0, Ln2/n;->m:I

    .line 12
    .line 13
    iget v2, p1, Ln2/n;->m:I

    .line 14
    .line 15
    invoke-virtual {v0, v1, v2}, Ll8/A;->a(II)Ll8/A;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-boolean v1, p0, Ln2/n;->n:Z

    .line 20
    .line 21
    iget-boolean v2, p1, Ln2/n;->n:Z

    .line 22
    .line 23
    invoke-virtual {v0, v1, v2}, Ll8/A;->c(ZZ)Ll8/A;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iget-boolean v1, p0, Ln2/n;->i:Z

    .line 28
    .line 29
    iget-boolean v2, p1, Ln2/n;->i:Z

    .line 30
    .line 31
    invoke-virtual {v0, v1, v2}, Ll8/A;->c(ZZ)Ll8/A;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iget-boolean v1, p0, Ln2/n;->e:Z

    .line 36
    .line 37
    iget-boolean v2, p1, Ln2/n;->e:Z

    .line 38
    .line 39
    invoke-virtual {v0, v1, v2}, Ll8/A;->c(ZZ)Ll8/A;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iget-boolean v1, p0, Ln2/n;->g:Z

    .line 44
    .line 45
    iget-boolean v2, p1, Ln2/n;->g:Z

    .line 46
    .line 47
    invoke-virtual {v0, v1, v2}, Ll8/A;->c(ZZ)Ll8/A;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    iget v1, p0, Ln2/n;->l:I

    .line 52
    .line 53
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    iget v2, p1, Ln2/n;->l:I

    .line 58
    .line 59
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    sget-object v3, Ll8/c0;->c:Ll8/c0;

    .line 64
    .line 65
    invoke-virtual {v0, v1, v2, v3}, Ll8/A;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Ll8/A;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    iget-boolean v1, p1, Ln2/n;->q:Z

    .line 70
    .line 71
    iget-boolean v2, p0, Ln2/n;->q:Z

    .line 72
    .line 73
    invoke-virtual {v0, v2, v1}, Ll8/A;->c(ZZ)Ll8/A;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    iget-boolean v1, p1, Ln2/n;->r:Z

    .line 78
    .line 79
    iget-boolean v3, p0, Ln2/n;->r:Z

    .line 80
    .line 81
    invoke-virtual {v0, v3, v1}, Ll8/A;->c(ZZ)Ll8/A;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    if-eqz v2, :cond_0

    .line 86
    .line 87
    if-eqz v3, :cond_0

    .line 88
    .line 89
    iget p0, p0, Ln2/n;->s:I

    .line 90
    .line 91
    iget p1, p1, Ln2/n;->s:I

    .line 92
    .line 93
    invoke-virtual {v0, p0, p1}, Ll8/A;->a(II)Ll8/A;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    :cond_0
    invoke-virtual {v0}, Ll8/A;->e()I

    .line 98
    .line 99
    .line 100
    move-result p0

    .line 101
    return p0
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    iget v0, p0, Ln2/n;->p:I

    .line 2
    .line 3
    return v0
.end method

.method public final b(Ln2/m;)Z
    .locals 2

    .line 1
    check-cast p1, Ln2/n;

    .line 2
    .line 3
    iget-boolean v0, p0, Ln2/n;->o:Z

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Ln2/m;->d:LN1/n;

    .line 8
    .line 9
    iget-object v0, v0, LN1/n;->n:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v1, p1, Ln2/m;->d:LN1/n;

    .line 12
    .line 13
    iget-object v1, v1, LN1/n;->n:Ljava/lang/String;

    .line 14
    .line 15
    invoke-static {v0, v1}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    :cond_0
    iget-object v0, p0, Ln2/n;->f:Ln2/i;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    iget-boolean v0, p1, Ln2/n;->q:Z

    .line 27
    .line 28
    iget-boolean v1, p0, Ln2/n;->q:Z

    .line 29
    .line 30
    if-ne v1, v0, :cond_1

    .line 31
    .line 32
    iget-boolean v0, p0, Ln2/n;->r:Z

    .line 33
    .line 34
    iget-boolean p1, p1, Ln2/n;->r:Z

    .line 35
    .line 36
    if-ne v0, p1, :cond_1

    .line 37
    .line 38
    const/4 p1, 0x1

    .line 39
    return p1

    .line 40
    :cond_1
    const/4 p1, 0x0

    .line 41
    return p1
.end method
