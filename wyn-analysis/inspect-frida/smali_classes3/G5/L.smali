.class public final LG5/L;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public b:I

.field public c:Ljava/lang/String;

.field public d:I

.field public e:I

.field public f:I

.field public g:I

.field public h:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, LG5/L;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I)Z
    .locals 8

    .line 1
    iget v0, p0, LG5/L;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/high16 v0, -0x200000

    .line 7
    .line 8
    and-int v1, p1, v0

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    const/4 v3, 0x1

    .line 12
    if-ne v1, v0, :cond_0

    .line 13
    .line 14
    move v0, v3

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move v0, v2

    .line 17
    :goto_0
    if-nez v0, :cond_1

    .line 18
    .line 19
    goto/16 :goto_6

    .line 20
    .line 21
    :cond_1
    ushr-int/lit8 v0, p1, 0x13

    .line 22
    .line 23
    const/4 v1, 0x3

    .line 24
    and-int/2addr v0, v1

    .line 25
    if-ne v0, v3, :cond_2

    .line 26
    .line 27
    goto/16 :goto_6

    .line 28
    .line 29
    :cond_2
    ushr-int/lit8 v4, p1, 0x11

    .line 30
    .line 31
    and-int/2addr v4, v1

    .line 32
    if-nez v4, :cond_3

    .line 33
    .line 34
    goto/16 :goto_6

    .line 35
    .line 36
    :cond_3
    ushr-int/lit8 v5, p1, 0xc

    .line 37
    .line 38
    const/16 v6, 0xf

    .line 39
    .line 40
    and-int/2addr v5, v6

    .line 41
    if-eqz v5, :cond_12

    .line 42
    .line 43
    if-ne v5, v6, :cond_4

    .line 44
    .line 45
    goto/16 :goto_6

    .line 46
    .line 47
    :cond_4
    ushr-int/lit8 v6, p1, 0xa

    .line 48
    .line 49
    and-int/2addr v6, v1

    .line 50
    if-ne v6, v1, :cond_5

    .line 51
    .line 52
    goto/16 :goto_6

    .line 53
    .line 54
    :cond_5
    iput v0, p0, LG5/L;->b:I

    .line 55
    .line 56
    sget-object v2, Ls2/a;->s:[Ljava/lang/String;

    .line 57
    .line 58
    rsub-int/lit8 v7, v4, 0x3

    .line 59
    .line 60
    aget-object v2, v2, v7

    .line 61
    .line 62
    iput-object v2, p0, LG5/L;->c:Ljava/lang/String;

    .line 63
    .line 64
    sget-object v2, Ls2/a;->t:[I

    .line 65
    .line 66
    aget v2, v2, v6

    .line 67
    .line 68
    iput v2, p0, LG5/L;->e:I

    .line 69
    .line 70
    const/4 v6, 0x2

    .line 71
    if-ne v0, v6, :cond_6

    .line 72
    .line 73
    div-int/2addr v2, v6

    .line 74
    iput v2, p0, LG5/L;->e:I

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_6
    if-nez v0, :cond_7

    .line 78
    .line 79
    div-int/lit8 v2, v2, 0x4

    .line 80
    .line 81
    iput v2, p0, LG5/L;->e:I

    .line 82
    .line 83
    :cond_7
    :goto_1
    ushr-int/lit8 v2, p1, 0x9

    .line 84
    .line 85
    and-int/2addr v2, v3

    .line 86
    const/16 v7, 0x480

    .line 87
    .line 88
    if-eq v4, v3, :cond_9

    .line 89
    .line 90
    if-eq v4, v6, :cond_b

    .line 91
    .line 92
    if-ne v4, v1, :cond_8

    .line 93
    .line 94
    const/16 v7, 0x180

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_8
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 98
    .line 99
    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 100
    .line 101
    .line 102
    throw p1

    .line 103
    :cond_9
    if-ne v0, v1, :cond_a

    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_a
    const/16 v7, 0x240

    .line 107
    .line 108
    :cond_b
    :goto_2
    iput v7, p0, LG5/L;->h:I

    .line 109
    .line 110
    if-ne v4, v1, :cond_d

    .line 111
    .line 112
    if-ne v0, v1, :cond_c

    .line 113
    .line 114
    sget-object v0, Ls2/a;->u:[I

    .line 115
    .line 116
    sub-int/2addr v5, v3

    .line 117
    aget v0, v0, v5

    .line 118
    .line 119
    goto :goto_3

    .line 120
    :cond_c
    sget-object v0, Ls2/a;->v:[I

    .line 121
    .line 122
    sub-int/2addr v5, v3

    .line 123
    aget v0, v0, v5

    .line 124
    .line 125
    :goto_3
    iput v0, p0, LG5/L;->g:I

    .line 126
    .line 127
    mul-int/lit8 v0, v0, 0xc

    .line 128
    .line 129
    iget v4, p0, LG5/L;->e:I

    .line 130
    .line 131
    div-int/2addr v0, v4

    .line 132
    add-int/2addr v0, v2

    .line 133
    mul-int/lit8 v0, v0, 0x4

    .line 134
    .line 135
    iput v0, p0, LG5/L;->d:I

    .line 136
    .line 137
    goto :goto_5

    .line 138
    :cond_d
    const/16 v7, 0x90

    .line 139
    .line 140
    if-ne v0, v1, :cond_f

    .line 141
    .line 142
    if-ne v4, v6, :cond_e

    .line 143
    .line 144
    sget-object v0, Ls2/a;->w:[I

    .line 145
    .line 146
    sub-int/2addr v5, v3

    .line 147
    aget v0, v0, v5

    .line 148
    .line 149
    goto :goto_4

    .line 150
    :cond_e
    sget-object v0, Ls2/a;->x:[I

    .line 151
    .line 152
    sub-int/2addr v5, v3

    .line 153
    aget v0, v0, v5

    .line 154
    .line 155
    :goto_4
    iput v0, p0, LG5/L;->g:I

    .line 156
    .line 157
    mul-int/2addr v0, v7

    .line 158
    iget v4, p0, LG5/L;->e:I

    .line 159
    .line 160
    div-int/2addr v0, v4

    .line 161
    add-int/2addr v0, v2

    .line 162
    iput v0, p0, LG5/L;->d:I

    .line 163
    .line 164
    goto :goto_5

    .line 165
    :cond_f
    sget-object v0, Ls2/a;->y:[I

    .line 166
    .line 167
    sub-int/2addr v5, v3

    .line 168
    aget v0, v0, v5

    .line 169
    .line 170
    iput v0, p0, LG5/L;->g:I

    .line 171
    .line 172
    if-ne v4, v3, :cond_10

    .line 173
    .line 174
    const/16 v7, 0x48

    .line 175
    .line 176
    :cond_10
    mul-int/2addr v7, v0

    .line 177
    iget v0, p0, LG5/L;->e:I

    .line 178
    .line 179
    div-int/2addr v7, v0

    .line 180
    add-int/2addr v7, v2

    .line 181
    iput v7, p0, LG5/L;->d:I

    .line 182
    .line 183
    :goto_5
    shr-int/lit8 p1, p1, 0x6

    .line 184
    .line 185
    and-int/2addr p1, v1

    .line 186
    if-ne p1, v1, :cond_11

    .line 187
    .line 188
    move v6, v3

    .line 189
    :cond_11
    iput v6, p0, LG5/L;->f:I

    .line 190
    .line 191
    move v2, v3

    .line 192
    :cond_12
    :goto_6
    return v2

    .line 193
    :pswitch_0
    const/high16 v0, -0x200000

    .line 194
    .line 195
    and-int v1, p1, v0

    .line 196
    .line 197
    const/4 v2, 0x0

    .line 198
    const/4 v3, 0x1

    .line 199
    if-ne v1, v0, :cond_13

    .line 200
    .line 201
    move v0, v3

    .line 202
    goto :goto_7

    .line 203
    :cond_13
    move v0, v2

    .line 204
    :goto_7
    if-nez v0, :cond_14

    .line 205
    .line 206
    goto/16 :goto_d

    .line 207
    .line 208
    :cond_14
    ushr-int/lit8 v0, p1, 0x13

    .line 209
    .line 210
    const/4 v1, 0x3

    .line 211
    and-int/2addr v0, v1

    .line 212
    if-ne v0, v3, :cond_15

    .line 213
    .line 214
    goto/16 :goto_d

    .line 215
    .line 216
    :cond_15
    ushr-int/lit8 v4, p1, 0x11

    .line 217
    .line 218
    and-int/2addr v4, v1

    .line 219
    if-nez v4, :cond_16

    .line 220
    .line 221
    goto/16 :goto_d

    .line 222
    .line 223
    :cond_16
    ushr-int/lit8 v5, p1, 0xc

    .line 224
    .line 225
    const/16 v6, 0xf

    .line 226
    .line 227
    and-int/2addr v5, v6

    .line 228
    if-eqz v5, :cond_25

    .line 229
    .line 230
    if-ne v5, v6, :cond_17

    .line 231
    .line 232
    goto/16 :goto_d

    .line 233
    .line 234
    :cond_17
    ushr-int/lit8 v6, p1, 0xa

    .line 235
    .line 236
    and-int/2addr v6, v1

    .line 237
    if-ne v6, v1, :cond_18

    .line 238
    .line 239
    goto/16 :goto_d

    .line 240
    .line 241
    :cond_18
    iput v0, p0, LG5/L;->b:I

    .line 242
    .line 243
    sget-object v2, LG5/b;->m:[Ljava/lang/String;

    .line 244
    .line 245
    rsub-int/lit8 v7, v4, 0x3

    .line 246
    .line 247
    aget-object v2, v2, v7

    .line 248
    .line 249
    iput-object v2, p0, LG5/L;->c:Ljava/lang/String;

    .line 250
    .line 251
    sget-object v2, LG5/b;->n:[I

    .line 252
    .line 253
    aget v2, v2, v6

    .line 254
    .line 255
    iput v2, p0, LG5/L;->e:I

    .line 256
    .line 257
    const/4 v6, 0x2

    .line 258
    if-ne v0, v6, :cond_19

    .line 259
    .line 260
    div-int/2addr v2, v6

    .line 261
    iput v2, p0, LG5/L;->e:I

    .line 262
    .line 263
    goto :goto_8

    .line 264
    :cond_19
    if-nez v0, :cond_1a

    .line 265
    .line 266
    div-int/lit8 v2, v2, 0x4

    .line 267
    .line 268
    iput v2, p0, LG5/L;->e:I

    .line 269
    .line 270
    :cond_1a
    :goto_8
    ushr-int/lit8 v2, p1, 0x9

    .line 271
    .line 272
    and-int/2addr v2, v3

    .line 273
    const/16 v7, 0x480

    .line 274
    .line 275
    if-eq v4, v3, :cond_1c

    .line 276
    .line 277
    if-eq v4, v6, :cond_1e

    .line 278
    .line 279
    if-ne v4, v1, :cond_1b

    .line 280
    .line 281
    const/16 v7, 0x180

    .line 282
    .line 283
    goto :goto_9

    .line 284
    :cond_1b
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 285
    .line 286
    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 287
    .line 288
    .line 289
    throw p1

    .line 290
    :cond_1c
    if-ne v0, v1, :cond_1d

    .line 291
    .line 292
    goto :goto_9

    .line 293
    :cond_1d
    const/16 v7, 0x240

    .line 294
    .line 295
    :cond_1e
    :goto_9
    iput v7, p0, LG5/L;->h:I

    .line 296
    .line 297
    if-ne v4, v1, :cond_20

    .line 298
    .line 299
    if-ne v0, v1, :cond_1f

    .line 300
    .line 301
    sget-object v0, LG5/b;->o:[I

    .line 302
    .line 303
    sub-int/2addr v5, v3

    .line 304
    aget v0, v0, v5

    .line 305
    .line 306
    goto :goto_a

    .line 307
    :cond_1f
    sget-object v0, LG5/b;->p:[I

    .line 308
    .line 309
    sub-int/2addr v5, v3

    .line 310
    aget v0, v0, v5

    .line 311
    .line 312
    :goto_a
    iput v0, p0, LG5/L;->g:I

    .line 313
    .line 314
    mul-int/lit8 v0, v0, 0xc

    .line 315
    .line 316
    iget v4, p0, LG5/L;->e:I

    .line 317
    .line 318
    div-int/2addr v0, v4

    .line 319
    add-int/2addr v0, v2

    .line 320
    mul-int/lit8 v0, v0, 0x4

    .line 321
    .line 322
    iput v0, p0, LG5/L;->d:I

    .line 323
    .line 324
    goto :goto_c

    .line 325
    :cond_20
    const/16 v7, 0x90

    .line 326
    .line 327
    if-ne v0, v1, :cond_22

    .line 328
    .line 329
    if-ne v4, v6, :cond_21

    .line 330
    .line 331
    sget-object v0, LG5/b;->q:[I

    .line 332
    .line 333
    sub-int/2addr v5, v3

    .line 334
    aget v0, v0, v5

    .line 335
    .line 336
    goto :goto_b

    .line 337
    :cond_21
    sget-object v0, LG5/b;->r:[I

    .line 338
    .line 339
    sub-int/2addr v5, v3

    .line 340
    aget v0, v0, v5

    .line 341
    .line 342
    :goto_b
    iput v0, p0, LG5/L;->g:I

    .line 343
    .line 344
    mul-int/2addr v0, v7

    .line 345
    iget v4, p0, LG5/L;->e:I

    .line 346
    .line 347
    div-int/2addr v0, v4

    .line 348
    add-int/2addr v0, v2

    .line 349
    iput v0, p0, LG5/L;->d:I

    .line 350
    .line 351
    goto :goto_c

    .line 352
    :cond_22
    sget-object v0, LG5/b;->s:[I

    .line 353
    .line 354
    sub-int/2addr v5, v3

    .line 355
    aget v0, v0, v5

    .line 356
    .line 357
    iput v0, p0, LG5/L;->g:I

    .line 358
    .line 359
    if-ne v4, v3, :cond_23

    .line 360
    .line 361
    const/16 v7, 0x48

    .line 362
    .line 363
    :cond_23
    mul-int/2addr v7, v0

    .line 364
    iget v0, p0, LG5/L;->e:I

    .line 365
    .line 366
    div-int/2addr v7, v0

    .line 367
    add-int/2addr v7, v2

    .line 368
    iput v7, p0, LG5/L;->d:I

    .line 369
    .line 370
    :goto_c
    shr-int/lit8 p1, p1, 0x6

    .line 371
    .line 372
    and-int/2addr p1, v1

    .line 373
    if-ne p1, v1, :cond_24

    .line 374
    .line 375
    move v6, v3

    .line 376
    :cond_24
    iput v6, p0, LG5/L;->f:I

    .line 377
    .line 378
    move v2, v3

    .line 379
    :cond_25
    :goto_d
    return v2

    .line 380
    nop

    .line 381
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
