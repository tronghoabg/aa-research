.class public final Lh2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh2/i;


# instance fields
.field public final synthetic a:I

.field public final b:Lg2/l;

.field public c:Ls2/C;

.field public d:J

.field public e:J

.field public f:I

.field public g:I

.field public h:J

.field public i:I

.field public j:I

.field public k:Z

.field public l:Z

.field public m:Z


# direct methods
.method public constructor <init>(Lg2/l;I)V
    .locals 1

    .line 1
    iput p2, p0, Lh2/d;->a:I

    .line 2
    .line 3
    packed-switch p2, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lh2/d;->b:Lg2/l;

    .line 10
    .line 11
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    iput-wide p1, p0, Lh2/d;->d:J

    .line 17
    .line 18
    const/4 p1, -0x1

    .line 19
    iput p1, p0, Lh2/d;->g:I

    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, Lh2/d;->b:Lg2/l;

    .line 26
    .line 27
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    iput-wide p1, p0, Lh2/d;->d:J

    .line 33
    .line 34
    const/4 v0, -0x1

    .line 35
    iput v0, p0, Lh2/d;->g:I

    .line 36
    .line 37
    iput-wide p1, p0, Lh2/d;->h:J

    .line 38
    .line 39
    const-wide/16 p1, 0x0

    .line 40
    .line 41
    iput-wide p1, p0, Lh2/d;->e:J

    .line 42
    .line 43
    iput v0, p0, Lh2/d;->f:I

    .line 44
    .line 45
    iput v0, p0, Lh2/d;->i:I

    .line 46
    .line 47
    iput v0, p0, Lh2/d;->j:I

    .line 48
    .line 49
    return-void

    .line 50
    nop

    .line 51
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final a(JJ)V
    .locals 1

    .line 1
    iget v0, p0, Lh2/d;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iput-wide p1, p0, Lh2/d;->d:J

    .line 7
    .line 8
    const/4 p1, -0x1

    .line 9
    iput p1, p0, Lh2/d;->g:I

    .line 10
    .line 11
    iput-wide p3, p0, Lh2/d;->e:J

    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    iput-wide p1, p0, Lh2/d;->d:J

    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    iput p1, p0, Lh2/d;->f:I

    .line 18
    .line 19
    iput-wide p3, p0, Lh2/d;->e:J

    .line 20
    .line 21
    return-void

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b(LQ1/o;JIZ)V
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p4

    .line 6
    .line 7
    iget-object v3, v0, Lh2/d;->b:Lg2/l;

    .line 8
    .line 9
    const-string v4, ". Dropping packet."

    .line 10
    .line 11
    const-string v5, "; received: "

    .line 12
    .line 13
    const-string v6, "Received RTP packet with unexpected sequence number. Expected: "

    .line 14
    .line 15
    const/4 v7, 0x0

    .line 16
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    const/16 v10, 0x8

    .line 22
    .line 23
    const/16 v11, 0x80

    .line 24
    .line 25
    const/4 v12, 0x1

    .line 26
    iget v13, v0, Lh2/d;->a:I

    .line 27
    .line 28
    packed-switch v13, :pswitch_data_0

    .line 29
    .line 30
    .line 31
    iget-object v13, v0, Lh2/d;->c:Ls2/C;

    .line 32
    .line 33
    invoke-static {v13}, LQ1/k;->h(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1}, LQ1/o;->u()I

    .line 37
    .line 38
    .line 39
    move-result v13

    .line 40
    and-int/lit8 v14, v13, 0x8

    .line 41
    .line 42
    const/4 v15, -0x1

    .line 43
    if-ne v14, v10, :cond_1

    .line 44
    .line 45
    iget-boolean v4, v0, Lh2/d;->k:Z

    .line 46
    .line 47
    if-eqz v4, :cond_0

    .line 48
    .line 49
    iget v4, v0, Lh2/d;->g:I

    .line 50
    .line 51
    if-lez v4, :cond_0

    .line 52
    .line 53
    iget-object v4, v0, Lh2/d;->c:Ls2/C;

    .line 54
    .line 55
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    iget-wide v5, v0, Lh2/d;->h:J

    .line 59
    .line 60
    iget-boolean v14, v0, Lh2/d;->m:Z

    .line 61
    .line 62
    move/from16 v23, v10

    .line 63
    .line 64
    iget v10, v0, Lh2/d;->g:I

    .line 65
    .line 66
    const/16 v21, 0x0

    .line 67
    .line 68
    const/16 v22, 0x0

    .line 69
    .line 70
    move-object/from16 v16, v4

    .line 71
    .line 72
    move-wide/from16 v17, v5

    .line 73
    .line 74
    move/from16 v20, v10

    .line 75
    .line 76
    move/from16 v19, v14

    .line 77
    .line 78
    invoke-interface/range {v16 .. v22}, Ls2/C;->a(JIIILs2/B;)V

    .line 79
    .line 80
    .line 81
    iput v15, v0, Lh2/d;->g:I

    .line 82
    .line 83
    iput-wide v8, v0, Lh2/d;->h:J

    .line 84
    .line 85
    iput-boolean v7, v0, Lh2/d;->k:Z

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_0
    move/from16 v23, v10

    .line 89
    .line 90
    :goto_0
    iput-boolean v12, v0, Lh2/d;->k:Z

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_1
    move/from16 v23, v10

    .line 94
    .line 95
    iget-boolean v10, v0, Lh2/d;->k:Z

    .line 96
    .line 97
    const-string v14, "RtpVp9Reader"

    .line 98
    .line 99
    if-eqz v10, :cond_13

    .line 100
    .line 101
    iget v10, v0, Lh2/d;->f:I

    .line 102
    .line 103
    invoke-static {v10}, Lg2/i;->a(I)I

    .line 104
    .line 105
    .line 106
    move-result v10

    .line 107
    if-ge v2, v10, :cond_2

    .line 108
    .line 109
    sget v1, LQ1/x;->a:I

    .line 110
    .line 111
    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 112
    .line 113
    invoke-static {v6, v10, v5, v2, v4}, LN0/a;->e(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    invoke-static {v14, v1}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    goto/16 :goto_7

    .line 121
    .line 122
    :cond_2
    :goto_1
    and-int/lit16 v4, v13, 0x80

    .line 123
    .line 124
    if-eqz v4, :cond_3

    .line 125
    .line 126
    invoke-virtual {v1}, LQ1/o;->u()I

    .line 127
    .line 128
    .line 129
    move-result v4

    .line 130
    and-int/2addr v4, v11

    .line 131
    if-eqz v4, :cond_3

    .line 132
    .line 133
    invoke-virtual {v1}, LQ1/o;->a()I

    .line 134
    .line 135
    .line 136
    move-result v4

    .line 137
    if-ge v4, v12, :cond_3

    .line 138
    .line 139
    goto/16 :goto_7

    .line 140
    .line 141
    :cond_3
    and-int/lit8 v4, v13, 0x10

    .line 142
    .line 143
    if-nez v4, :cond_4

    .line 144
    .line 145
    move v5, v12

    .line 146
    goto :goto_2

    .line 147
    :cond_4
    move v5, v7

    .line 148
    :goto_2
    const-string v6, "VP9 flexible mode is not supported."

    .line 149
    .line 150
    invoke-static {v6, v5}, LQ1/k;->b(Ljava/lang/String;Z)V

    .line 151
    .line 152
    .line 153
    and-int/lit8 v5, v13, 0x20

    .line 154
    .line 155
    if-eqz v5, :cond_6

    .line 156
    .line 157
    invoke-virtual {v1, v12}, LQ1/o;->H(I)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v1}, LQ1/o;->a()I

    .line 161
    .line 162
    .line 163
    move-result v5

    .line 164
    if-ge v5, v12, :cond_5

    .line 165
    .line 166
    goto/16 :goto_7

    .line 167
    .line 168
    :cond_5
    if-nez v4, :cond_6

    .line 169
    .line 170
    invoke-virtual {v1, v12}, LQ1/o;->H(I)V

    .line 171
    .line 172
    .line 173
    :cond_6
    and-int/lit8 v4, v13, 0x2

    .line 174
    .line 175
    if-eqz v4, :cond_b

    .line 176
    .line 177
    invoke-virtual {v1}, LQ1/o;->u()I

    .line 178
    .line 179
    .line 180
    move-result v4

    .line 181
    shr-int/lit8 v5, v4, 0x5

    .line 182
    .line 183
    and-int/lit8 v5, v5, 0x7

    .line 184
    .line 185
    and-int/lit8 v6, v4, 0x10

    .line 186
    .line 187
    if-eqz v6, :cond_8

    .line 188
    .line 189
    add-int/2addr v5, v12

    .line 190
    invoke-virtual {v1}, LQ1/o;->a()I

    .line 191
    .line 192
    .line 193
    move-result v6

    .line 194
    mul-int/lit8 v10, v5, 0x4

    .line 195
    .line 196
    if-ge v6, v10, :cond_7

    .line 197
    .line 198
    goto/16 :goto_7

    .line 199
    .line 200
    :cond_7
    move v6, v7

    .line 201
    :goto_3
    if-ge v6, v5, :cond_8

    .line 202
    .line 203
    invoke-virtual {v1}, LQ1/o;->A()I

    .line 204
    .line 205
    .line 206
    move-result v10

    .line 207
    iput v10, v0, Lh2/d;->i:I

    .line 208
    .line 209
    invoke-virtual {v1}, LQ1/o;->A()I

    .line 210
    .line 211
    .line 212
    move-result v10

    .line 213
    iput v10, v0, Lh2/d;->j:I

    .line 214
    .line 215
    add-int/2addr v6, v12

    .line 216
    goto :goto_3

    .line 217
    :cond_8
    and-int/lit8 v4, v4, 0x8

    .line 218
    .line 219
    if-eqz v4, :cond_b

    .line 220
    .line 221
    invoke-virtual {v1}, LQ1/o;->u()I

    .line 222
    .line 223
    .line 224
    move-result v4

    .line 225
    invoke-virtual {v1}, LQ1/o;->a()I

    .line 226
    .line 227
    .line 228
    move-result v5

    .line 229
    if-ge v5, v4, :cond_9

    .line 230
    .line 231
    goto/16 :goto_7

    .line 232
    .line 233
    :cond_9
    move v5, v7

    .line 234
    :goto_4
    if-ge v5, v4, :cond_b

    .line 235
    .line 236
    invoke-virtual {v1}, LQ1/o;->A()I

    .line 237
    .line 238
    .line 239
    move-result v6

    .line 240
    and-int/lit8 v6, v6, 0xc

    .line 241
    .line 242
    shr-int/lit8 v6, v6, 0x2

    .line 243
    .line 244
    invoke-virtual {v1}, LQ1/o;->a()I

    .line 245
    .line 246
    .line 247
    move-result v10

    .line 248
    if-ge v10, v6, :cond_a

    .line 249
    .line 250
    goto/16 :goto_7

    .line 251
    .line 252
    :cond_a
    invoke-virtual {v1, v6}, LQ1/o;->H(I)V

    .line 253
    .line 254
    .line 255
    add-int/2addr v5, v12

    .line 256
    goto :goto_4

    .line 257
    :cond_b
    iget v4, v0, Lh2/d;->g:I

    .line 258
    .line 259
    if-ne v4, v15, :cond_d

    .line 260
    .line 261
    iget-boolean v4, v0, Lh2/d;->k:Z

    .line 262
    .line 263
    if-eqz v4, :cond_d

    .line 264
    .line 265
    invoke-virtual {v1}, LQ1/o;->e()I

    .line 266
    .line 267
    .line 268
    move-result v4

    .line 269
    and-int/lit8 v4, v4, 0x4

    .line 270
    .line 271
    if-nez v4, :cond_c

    .line 272
    .line 273
    move v4, v12

    .line 274
    goto :goto_5

    .line 275
    :cond_c
    move v4, v7

    .line 276
    :goto_5
    iput-boolean v4, v0, Lh2/d;->m:Z

    .line 277
    .line 278
    :cond_d
    iget-boolean v4, v0, Lh2/d;->l:Z

    .line 279
    .line 280
    if-nez v4, :cond_10

    .line 281
    .line 282
    iget v4, v0, Lh2/d;->i:I

    .line 283
    .line 284
    if-eq v4, v15, :cond_10

    .line 285
    .line 286
    iget v5, v0, Lh2/d;->j:I

    .line 287
    .line 288
    if-eq v5, v15, :cond_10

    .line 289
    .line 290
    iget-object v3, v3, Lg2/l;->c:LN1/n;

    .line 291
    .line 292
    iget v6, v3, LN1/n;->u:I

    .line 293
    .line 294
    if-ne v4, v6, :cond_e

    .line 295
    .line 296
    iget v4, v3, LN1/n;->v:I

    .line 297
    .line 298
    if-eq v5, v4, :cond_f

    .line 299
    .line 300
    :cond_e
    iget-object v4, v0, Lh2/d;->c:Ls2/C;

    .line 301
    .line 302
    invoke-virtual {v3}, LN1/n;->a()LN1/m;

    .line 303
    .line 304
    .line 305
    move-result-object v3

    .line 306
    iget v5, v0, Lh2/d;->i:I

    .line 307
    .line 308
    iput v5, v3, LN1/m;->t:I

    .line 309
    .line 310
    iget v5, v0, Lh2/d;->j:I

    .line 311
    .line 312
    iput v5, v3, LN1/m;->u:I

    .line 313
    .line 314
    invoke-static {v3, v4}, LVa/M6;->y(LN1/m;Ls2/C;)V

    .line 315
    .line 316
    .line 317
    :cond_f
    iput-boolean v12, v0, Lh2/d;->l:Z

    .line 318
    .line 319
    :cond_10
    invoke-virtual {v1}, LQ1/o;->a()I

    .line 320
    .line 321
    .line 322
    move-result v3

    .line 323
    iget-object v4, v0, Lh2/d;->c:Ls2/C;

    .line 324
    .line 325
    invoke-interface {v4, v3, v1}, Ls2/C;->e(ILQ1/o;)V

    .line 326
    .line 327
    .line 328
    iget v1, v0, Lh2/d;->g:I

    .line 329
    .line 330
    if-ne v1, v15, :cond_11

    .line 331
    .line 332
    iput v3, v0, Lh2/d;->g:I

    .line 333
    .line 334
    goto :goto_6

    .line 335
    :cond_11
    add-int/2addr v1, v3

    .line 336
    iput v1, v0, Lh2/d;->g:I

    .line 337
    .line 338
    :goto_6
    iget-wide v3, v0, Lh2/d;->e:J

    .line 339
    .line 340
    iget-wide v5, v0, Lh2/d;->d:J

    .line 341
    .line 342
    const v20, 0x15f90

    .line 343
    .line 344
    .line 345
    move-wide/from16 v18, p2

    .line 346
    .line 347
    move-wide/from16 v16, v3

    .line 348
    .line 349
    move-wide/from16 v21, v5

    .line 350
    .line 351
    invoke-static/range {v16 .. v22}, LS3/f;->N(JJIJ)J

    .line 352
    .line 353
    .line 354
    move-result-wide v3

    .line 355
    iput-wide v3, v0, Lh2/d;->h:J

    .line 356
    .line 357
    if-eqz p5, :cond_12

    .line 358
    .line 359
    iget-object v1, v0, Lh2/d;->c:Ls2/C;

    .line 360
    .line 361
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 362
    .line 363
    .line 364
    iget-wide v3, v0, Lh2/d;->h:J

    .line 365
    .line 366
    iget-boolean v5, v0, Lh2/d;->m:Z

    .line 367
    .line 368
    iget v6, v0, Lh2/d;->g:I

    .line 369
    .line 370
    const/16 v21, 0x0

    .line 371
    .line 372
    const/16 v22, 0x0

    .line 373
    .line 374
    move-object/from16 v16, v1

    .line 375
    .line 376
    move-wide/from16 v17, v3

    .line 377
    .line 378
    move/from16 v19, v5

    .line 379
    .line 380
    move/from16 v20, v6

    .line 381
    .line 382
    invoke-interface/range {v16 .. v22}, Ls2/C;->a(JIIILs2/B;)V

    .line 383
    .line 384
    .line 385
    iput v15, v0, Lh2/d;->g:I

    .line 386
    .line 387
    iput-wide v8, v0, Lh2/d;->h:J

    .line 388
    .line 389
    iput-boolean v7, v0, Lh2/d;->k:Z

    .line 390
    .line 391
    :cond_12
    iput v2, v0, Lh2/d;->f:I

    .line 392
    .line 393
    goto :goto_7

    .line 394
    :cond_13
    const-string v1, "First payload octet of the RTP packet is not the beginning of a new VP9 partition, Dropping current packet."

    .line 395
    .line 396
    invoke-static {v14, v1}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 397
    .line 398
    .line 399
    :goto_7
    return-void

    .line 400
    :pswitch_0
    iget-object v10, v0, Lh2/d;->c:Ls2/C;

    .line 401
    .line 402
    invoke-static {v10}, LQ1/k;->h(Ljava/lang/Object;)V

    .line 403
    .line 404
    .line 405
    iget v10, v1, LQ1/o;->b:I

    .line 406
    .line 407
    invoke-virtual {v1}, LQ1/o;->A()I

    .line 408
    .line 409
    .line 410
    move-result v13

    .line 411
    and-int/lit16 v14, v13, 0x400

    .line 412
    .line 413
    if-lez v14, :cond_14

    .line 414
    .line 415
    move v14, v12

    .line 416
    goto :goto_8

    .line 417
    :cond_14
    move v14, v7

    .line 418
    :goto_8
    and-int/lit16 v15, v13, 0x200

    .line 419
    .line 420
    const-string v11, "RtpH263Reader"

    .line 421
    .line 422
    if-nez v15, :cond_23

    .line 423
    .line 424
    and-int/lit16 v15, v13, 0x1f8

    .line 425
    .line 426
    if-nez v15, :cond_23

    .line 427
    .line 428
    and-int/lit8 v13, v13, 0x7

    .line 429
    .line 430
    if-eqz v13, :cond_15

    .line 431
    .line 432
    goto/16 :goto_d

    .line 433
    .line 434
    :cond_15
    if-eqz v14, :cond_18

    .line 435
    .line 436
    iget-boolean v4, v0, Lh2/d;->m:Z

    .line 437
    .line 438
    if-eqz v4, :cond_16

    .line 439
    .line 440
    iget v4, v0, Lh2/d;->f:I

    .line 441
    .line 442
    if-lez v4, :cond_16

    .line 443
    .line 444
    iget-object v4, v0, Lh2/d;->c:Ls2/C;

    .line 445
    .line 446
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 447
    .line 448
    .line 449
    iget-wide v5, v0, Lh2/d;->h:J

    .line 450
    .line 451
    iget-boolean v13, v0, Lh2/d;->k:Z

    .line 452
    .line 453
    iget v14, v0, Lh2/d;->f:I

    .line 454
    .line 455
    const/16 v22, 0x0

    .line 456
    .line 457
    const/16 v23, 0x0

    .line 458
    .line 459
    move-object/from16 v17, v4

    .line 460
    .line 461
    move-wide/from16 v18, v5

    .line 462
    .line 463
    move/from16 v20, v13

    .line 464
    .line 465
    move/from16 v21, v14

    .line 466
    .line 467
    invoke-interface/range {v17 .. v23}, Ls2/C;->a(JIIILs2/B;)V

    .line 468
    .line 469
    .line 470
    iput v7, v0, Lh2/d;->f:I

    .line 471
    .line 472
    iput-wide v8, v0, Lh2/d;->h:J

    .line 473
    .line 474
    iput-boolean v7, v0, Lh2/d;->k:Z

    .line 475
    .line 476
    iput-boolean v7, v0, Lh2/d;->m:Z

    .line 477
    .line 478
    :cond_16
    iput-boolean v12, v0, Lh2/d;->m:Z

    .line 479
    .line 480
    invoke-virtual {v1}, LQ1/o;->e()I

    .line 481
    .line 482
    .line 483
    move-result v4

    .line 484
    and-int/lit16 v4, v4, 0xfc

    .line 485
    .line 486
    const/16 v5, 0x80

    .line 487
    .line 488
    if-ge v4, v5, :cond_17

    .line 489
    .line 490
    const-string v1, "Picture start Code (PSC) missing, dropping packet."

    .line 491
    .line 492
    invoke-static {v11, v1}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 493
    .line 494
    .line 495
    goto/16 :goto_e

    .line 496
    .line 497
    :cond_17
    iget-object v4, v1, LQ1/o;->a:[B

    .line 498
    .line 499
    aput-byte v7, v4, v10

    .line 500
    .line 501
    add-int/lit8 v5, v10, 0x1

    .line 502
    .line 503
    aput-byte v7, v4, v5

    .line 504
    .line 505
    invoke-virtual {v1, v10}, LQ1/o;->G(I)V

    .line 506
    .line 507
    .line 508
    goto :goto_9

    .line 509
    :cond_18
    iget-boolean v10, v0, Lh2/d;->m:Z

    .line 510
    .line 511
    if-eqz v10, :cond_22

    .line 512
    .line 513
    iget v10, v0, Lh2/d;->g:I

    .line 514
    .line 515
    invoke-static {v10}, Lg2/i;->a(I)I

    .line 516
    .line 517
    .line 518
    move-result v10

    .line 519
    if-ge v2, v10, :cond_19

    .line 520
    .line 521
    sget v1, LQ1/x;->a:I

    .line 522
    .line 523
    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 524
    .line 525
    invoke-static {v6, v10, v5, v2, v4}, LN0/a;->e(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 526
    .line 527
    .line 528
    move-result-object v1

    .line 529
    invoke-static {v11, v1}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 530
    .line 531
    .line 532
    goto/16 :goto_e

    .line 533
    .line 534
    :cond_19
    :goto_9
    iget v4, v0, Lh2/d;->f:I

    .line 535
    .line 536
    if-nez v4, :cond_20

    .line 537
    .line 538
    iget-boolean v4, v0, Lh2/d;->l:Z

    .line 539
    .line 540
    iget v5, v1, LQ1/o;->b:I

    .line 541
    .line 542
    invoke-virtual {v1}, LQ1/o;->w()J

    .line 543
    .line 544
    .line 545
    move-result-wide v10

    .line 546
    const/16 v6, 0xa

    .line 547
    .line 548
    shr-long/2addr v10, v6

    .line 549
    const-wide/16 v13, 0x3f

    .line 550
    .line 551
    and-long/2addr v10, v13

    .line 552
    const-wide/16 v13, 0x20

    .line 553
    .line 554
    cmp-long v6, v10, v13

    .line 555
    .line 556
    if-nez v6, :cond_1d

    .line 557
    .line 558
    invoke-virtual {v1}, LQ1/o;->e()I

    .line 559
    .line 560
    .line 561
    move-result v6

    .line 562
    shr-int/lit8 v10, v6, 0x1

    .line 563
    .line 564
    and-int/2addr v10, v12

    .line 565
    if-nez v4, :cond_1b

    .line 566
    .line 567
    if-nez v10, :cond_1b

    .line 568
    .line 569
    shr-int/lit8 v4, v6, 0x2

    .line 570
    .line 571
    and-int/lit8 v4, v4, 0x7

    .line 572
    .line 573
    if-ne v4, v12, :cond_1a

    .line 574
    .line 575
    const/16 v6, 0x80

    .line 576
    .line 577
    iput v6, v0, Lh2/d;->i:I

    .line 578
    .line 579
    const/16 v4, 0x60

    .line 580
    .line 581
    iput v4, v0, Lh2/d;->j:I

    .line 582
    .line 583
    goto :goto_a

    .line 584
    :cond_1a
    add-int/lit8 v4, v4, -0x2

    .line 585
    .line 586
    const/16 v6, 0xb0

    .line 587
    .line 588
    shl-int/2addr v6, v4

    .line 589
    iput v6, v0, Lh2/d;->i:I

    .line 590
    .line 591
    const/16 v6, 0x90

    .line 592
    .line 593
    shl-int v4, v6, v4

    .line 594
    .line 595
    iput v4, v0, Lh2/d;->j:I

    .line 596
    .line 597
    :cond_1b
    :goto_a
    invoke-virtual {v1, v5}, LQ1/o;->G(I)V

    .line 598
    .line 599
    .line 600
    if-nez v10, :cond_1c

    .line 601
    .line 602
    move v4, v12

    .line 603
    goto :goto_b

    .line 604
    :cond_1c
    move v4, v7

    .line 605
    :goto_b
    iput-boolean v4, v0, Lh2/d;->k:Z

    .line 606
    .line 607
    goto :goto_c

    .line 608
    :cond_1d
    invoke-virtual {v1, v5}, LQ1/o;->G(I)V

    .line 609
    .line 610
    .line 611
    iput-boolean v7, v0, Lh2/d;->k:Z

    .line 612
    .line 613
    :goto_c
    iget-boolean v4, v0, Lh2/d;->l:Z

    .line 614
    .line 615
    if-nez v4, :cond_20

    .line 616
    .line 617
    iget-boolean v4, v0, Lh2/d;->k:Z

    .line 618
    .line 619
    if-eqz v4, :cond_20

    .line 620
    .line 621
    iget v4, v0, Lh2/d;->i:I

    .line 622
    .line 623
    iget-object v3, v3, Lg2/l;->c:LN1/n;

    .line 624
    .line 625
    iget v5, v3, LN1/n;->u:I

    .line 626
    .line 627
    if-ne v4, v5, :cond_1e

    .line 628
    .line 629
    iget v4, v0, Lh2/d;->j:I

    .line 630
    .line 631
    iget v5, v3, LN1/n;->v:I

    .line 632
    .line 633
    if-eq v4, v5, :cond_1f

    .line 634
    .line 635
    :cond_1e
    iget-object v4, v0, Lh2/d;->c:Ls2/C;

    .line 636
    .line 637
    invoke-virtual {v3}, LN1/n;->a()LN1/m;

    .line 638
    .line 639
    .line 640
    move-result-object v3

    .line 641
    iget v5, v0, Lh2/d;->i:I

    .line 642
    .line 643
    iput v5, v3, LN1/m;->t:I

    .line 644
    .line 645
    iget v5, v0, Lh2/d;->j:I

    .line 646
    .line 647
    iput v5, v3, LN1/m;->u:I

    .line 648
    .line 649
    invoke-static {v3, v4}, LVa/M6;->y(LN1/m;Ls2/C;)V

    .line 650
    .line 651
    .line 652
    :cond_1f
    iput-boolean v12, v0, Lh2/d;->l:Z

    .line 653
    .line 654
    :cond_20
    invoke-virtual {v1}, LQ1/o;->a()I

    .line 655
    .line 656
    .line 657
    move-result v3

    .line 658
    iget-object v4, v0, Lh2/d;->c:Ls2/C;

    .line 659
    .line 660
    invoke-interface {v4, v3, v1}, Ls2/C;->e(ILQ1/o;)V

    .line 661
    .line 662
    .line 663
    iget v1, v0, Lh2/d;->f:I

    .line 664
    .line 665
    add-int/2addr v1, v3

    .line 666
    iput v1, v0, Lh2/d;->f:I

    .line 667
    .line 668
    iget-wide v3, v0, Lh2/d;->e:J

    .line 669
    .line 670
    iget-wide v5, v0, Lh2/d;->d:J

    .line 671
    .line 672
    const v19, 0x15f90

    .line 673
    .line 674
    .line 675
    move-wide/from16 v17, p2

    .line 676
    .line 677
    move-wide v15, v3

    .line 678
    move-wide/from16 v20, v5

    .line 679
    .line 680
    invoke-static/range {v15 .. v21}, LS3/f;->N(JJIJ)J

    .line 681
    .line 682
    .line 683
    move-result-wide v3

    .line 684
    iput-wide v3, v0, Lh2/d;->h:J

    .line 685
    .line 686
    if-eqz p5, :cond_21

    .line 687
    .line 688
    iget-object v10, v0, Lh2/d;->c:Ls2/C;

    .line 689
    .line 690
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 691
    .line 692
    .line 693
    iget-wide v11, v0, Lh2/d;->h:J

    .line 694
    .line 695
    iget-boolean v13, v0, Lh2/d;->k:Z

    .line 696
    .line 697
    iget v14, v0, Lh2/d;->f:I

    .line 698
    .line 699
    const/4 v15, 0x0

    .line 700
    const/16 v16, 0x0

    .line 701
    .line 702
    invoke-interface/range {v10 .. v16}, Ls2/C;->a(JIIILs2/B;)V

    .line 703
    .line 704
    .line 705
    iput v7, v0, Lh2/d;->f:I

    .line 706
    .line 707
    iput-wide v8, v0, Lh2/d;->h:J

    .line 708
    .line 709
    iput-boolean v7, v0, Lh2/d;->k:Z

    .line 710
    .line 711
    iput-boolean v7, v0, Lh2/d;->m:Z

    .line 712
    .line 713
    :cond_21
    iput v2, v0, Lh2/d;->g:I

    .line 714
    .line 715
    goto :goto_e

    .line 716
    :cond_22
    const-string v1, "First payload octet of the H263 packet is not the beginning of a new H263 partition, Dropping current packet."

    .line 717
    .line 718
    invoke-static {v11, v1}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 719
    .line 720
    .line 721
    goto :goto_e

    .line 722
    :cond_23
    :goto_d
    const-string v1, "Dropping packet: video reduncancy coding is not supported, packet header VRC, or PLEN or PEBIT is non-zero"

    .line 723
    .line 724
    invoke-static {v11, v1}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 725
    .line 726
    .line 727
    :goto_e
    return-void

    .line 728
    nop

    .line 729
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final c(Ls2/o;I)V
    .locals 1

    .line 1
    iget v0, p0, Lh2/d;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    invoke-interface {p1, p2, v0}, Ls2/o;->m(II)Ls2/C;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iput-object p1, p0, Lh2/d;->c:Ls2/C;

    .line 12
    .line 13
    iget-object p2, p0, Lh2/d;->b:Lg2/l;

    .line 14
    .line 15
    iget-object p2, p2, Lg2/l;->c:LN1/n;

    .line 16
    .line 17
    invoke-interface {p1, p2}, Ls2/C;->c(LN1/n;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_0
    const/4 v0, 0x2

    .line 22
    invoke-interface {p1, p2, v0}, Ls2/o;->m(II)Ls2/C;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iput-object p1, p0, Lh2/d;->c:Ls2/C;

    .line 27
    .line 28
    iget-object p2, p0, Lh2/d;->b:Lg2/l;

    .line 29
    .line 30
    iget-object p2, p2, Lg2/l;->c:LN1/n;

    .line 31
    .line 32
    invoke-interface {p1, p2}, Ls2/C;->c(LN1/n;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final d(J)V
    .locals 4

    .line 1
    iget v0, p0, Lh2/d;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-wide v0, p0, Lh2/d;->d:J

    .line 7
    .line 8
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    cmp-long v0, v0, v2

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    :goto_0
    invoke-static {v0}, LQ1/k;->g(Z)V

    .line 21
    .line 22
    .line 23
    iput-wide p1, p0, Lh2/d;->d:J

    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_0
    iget-wide v0, p0, Lh2/d;->d:J

    .line 27
    .line 28
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    cmp-long v0, v0, v2

    .line 34
    .line 35
    if-nez v0, :cond_1

    .line 36
    .line 37
    const/4 v0, 0x1

    .line 38
    goto :goto_1

    .line 39
    :cond_1
    const/4 v0, 0x0

    .line 40
    :goto_1
    invoke-static {v0}, LQ1/k;->g(Z)V

    .line 41
    .line 42
    .line 43
    iput-wide p1, p0, Lh2/d;->d:J

    .line 44
    .line 45
    return-void

    .line 46
    nop

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
