.class public final Lcom/moloco/sdk/internal/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/moloco/sdk/internal/ortb/model/h0;


# direct methods
.method public synthetic constructor <init>(Lcom/moloco/sdk/internal/ortb/model/h0;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/moloco/sdk/internal/h;->a:I

    iput-object p1, p0, Lcom/moloco/sdk/internal/h;->b:Lcom/moloco/sdk/internal/ortb/model/h0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lcom/moloco/sdk/internal/h;->a:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p1

    .line 9
    .line 10
    check-cast v1, LN/o;

    .line 11
    .line 12
    move-object/from16 v2, p2

    .line 13
    .line 14
    check-cast v2, Ljava/lang/Number;

    .line 15
    .line 16
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 17
    .line 18
    .line 19
    const v2, 0x1762e1d1

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, v2}, LN/o;->M(I)V

    .line 23
    .line 24
    .line 25
    iget-object v2, v0, Lcom/moloco/sdk/internal/h;->b:Lcom/moloco/sdk/internal/ortb/model/h0;

    .line 26
    .line 27
    iget-object v2, v2, Lcom/moloco/sdk/internal/ortb/model/h0;->h:Lcom/moloco/sdk/internal/ortb/model/j;

    .line 28
    .line 29
    const v3, -0x43b1a30f

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, v3}, LN/o;->M(I)V

    .line 33
    .line 34
    .line 35
    const/4 v3, 0x0

    .line 36
    const/4 v4, 0x0

    .line 37
    if-nez v2, :cond_0

    .line 38
    .line 39
    move-object v2, v3

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    iget-object v5, v2, Lcom/moloco/sdk/internal/ortb/model/j;->b:Lcom/moloco/sdk/internal/ortb/model/X;

    .line 42
    .line 43
    iget-object v6, v2, Lcom/moloco/sdk/internal/ortb/model/j;->c:Lcom/moloco/sdk/internal/ortb/model/k;

    .line 44
    .line 45
    invoke-static {v5, v6}, Lcom/moloco/sdk/internal/i;->b(Lcom/moloco/sdk/internal/ortb/model/X;Lcom/moloco/sdk/internal/ortb/model/k;)LZ/d;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    iget v2, v2, Lcom/moloco/sdk/internal/ortb/model/j;->a:I

    .line 50
    .line 51
    int-to-float v2, v2

    .line 52
    new-instance v6, LE/F;

    .line 53
    .line 54
    invoke-direct {v6, v2, v2, v2, v2}, LE/F;-><init>(FFFF)V

    .line 55
    .line 56
    .line 57
    invoke-static {v5, v6, v1, v4}, Lka/e0;->c(LZ/d;LE/F;LN/o;I)LV/d;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    :goto_0
    invoke-virtual {v1, v4}, LN/o;->p(Z)V

    .line 62
    .line 63
    .line 64
    if-nez v2, :cond_1

    .line 65
    .line 66
    const/4 v2, 0x3

    .line 67
    invoke-static {v3, v3, v1, v2}, Lka/e0;->c(LZ/d;LE/F;LN/o;I)LV/d;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    :cond_1
    invoke-virtual {v1, v4}, LN/o;->p(Z)V

    .line 72
    .line 73
    .line 74
    return-object v2

    .line 75
    :pswitch_0
    move-object/from16 v9, p1

    .line 76
    .line 77
    check-cast v9, LN/o;

    .line 78
    .line 79
    move-object/from16 v1, p2

    .line 80
    .line 81
    check-cast v1, Ljava/lang/Number;

    .line 82
    .line 83
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 84
    .line 85
    .line 86
    const v1, 0x317d9853

    .line 87
    .line 88
    .line 89
    invoke-virtual {v9, v1}, LN/o;->M(I)V

    .line 90
    .line 91
    .line 92
    iget-object v1, v0, Lcom/moloco/sdk/internal/h;->b:Lcom/moloco/sdk/internal/ortb/model/h0;

    .line 93
    .line 94
    iget-object v1, v1, Lcom/moloco/sdk/internal/ortb/model/h0;->c:Lcom/moloco/sdk/internal/ortb/model/b;

    .line 95
    .line 96
    if-nez v1, :cond_2

    .line 97
    .line 98
    const/4 v1, 0x0

    .line 99
    goto :goto_1

    .line 100
    :cond_2
    iget-object v2, v1, Lcom/moloco/sdk/internal/ortb/model/b;->b:Lcom/moloco/sdk/internal/ortb/model/X;

    .line 101
    .line 102
    iget-object v3, v1, Lcom/moloco/sdk/internal/ortb/model/b;->c:Lcom/moloco/sdk/internal/ortb/model/k;

    .line 103
    .line 104
    invoke-static {v2, v3}, Lcom/moloco/sdk/internal/i;->b(Lcom/moloco/sdk/internal/ortb/model/X;Lcom/moloco/sdk/internal/ortb/model/k;)LZ/d;

    .line 105
    .line 106
    .line 107
    move-result-object v5

    .line 108
    iget v2, v1, Lcom/moloco/sdk/internal/ortb/model/b;->a:I

    .line 109
    .line 110
    int-to-float v2, v2

    .line 111
    new-instance v6, LE/F;

    .line 112
    .line 113
    invoke-direct {v6, v2, v2, v2, v2}, LE/F;-><init>(FFFF)V

    .line 114
    .line 115
    .line 116
    const/4 v10, 0x0

    .line 117
    iget-wide v7, v1, Lcom/moloco/sdk/internal/ortb/model/b;->d:J

    .line 118
    .line 119
    invoke-static/range {v5 .. v10}, Lr7/e;->c(LZ/d;LE/F;JLN/o;I)LV/d;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    :goto_1
    const/4 v2, 0x0

    .line 124
    invoke-virtual {v9, v2}, LN/o;->p(Z)V

    .line 125
    .line 126
    .line 127
    return-object v1

    .line 128
    :pswitch_1
    move-object/from16 v15, p1

    .line 129
    .line 130
    check-cast v15, LN/o;

    .line 131
    .line 132
    move-object/from16 v1, p2

    .line 133
    .line 134
    check-cast v1, Ljava/lang/Number;

    .line 135
    .line 136
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 137
    .line 138
    .line 139
    const v1, -0x2426c810

    .line 140
    .line 141
    .line 142
    invoke-virtual {v15, v1}, LN/o;->M(I)V

    .line 143
    .line 144
    .line 145
    iget-object v1, v0, Lcom/moloco/sdk/internal/h;->b:Lcom/moloco/sdk/internal/ortb/model/h0;

    .line 146
    .line 147
    iget-object v2, v1, Lcom/moloco/sdk/internal/ortb/model/h0;->a:Lcom/moloco/sdk/internal/ortb/model/h;

    .line 148
    .line 149
    if-nez v2, :cond_3

    .line 150
    .line 151
    const/4 v1, 0x0

    .line 152
    goto :goto_3

    .line 153
    :cond_3
    iget v3, v2, Lcom/moloco/sdk/internal/ortb/model/h;->c:I

    .line 154
    .line 155
    int-to-float v4, v3

    .line 156
    invoke-static {v4, v4}, LA6/c;->b(FF)J

    .line 157
    .line 158
    .line 159
    move-result-wide v4

    .line 160
    iget-object v6, v2, Lcom/moloco/sdk/internal/ortb/model/h;->d:Lcom/moloco/sdk/internal/ortb/model/X;

    .line 161
    .line 162
    iget-object v7, v2, Lcom/moloco/sdk/internal/ortb/model/h;->e:Lcom/moloco/sdk/internal/ortb/model/k;

    .line 163
    .line 164
    invoke-static {v6, v7}, Lcom/moloco/sdk/internal/i;->b(Lcom/moloco/sdk/internal/ortb/model/X;Lcom/moloco/sdk/internal/ortb/model/k;)LZ/d;

    .line 165
    .line 166
    .line 167
    move-result-object v6

    .line 168
    iget v7, v2, Lcom/moloco/sdk/internal/ortb/model/h;->b:I

    .line 169
    .line 170
    int-to-float v7, v7

    .line 171
    new-instance v8, LE/F;

    .line 172
    .line 173
    invoke-direct {v8, v7, v7, v7, v7}, LE/F;-><init>(FFFF)V

    .line 174
    .line 175
    .line 176
    invoke-static {v3}, LFe/b;->E(I)J

    .line 177
    .line 178
    .line 179
    move-result-wide v9

    .line 180
    invoke-static {v9, v10}, LFe/b;->j(J)V

    .line 181
    .line 182
    .line 183
    const-wide v11, 0xff00000000L

    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    and-long/2addr v11, v9

    .line 189
    invoke-static {v9, v10}, LL0/j;->c(J)F

    .line 190
    .line 191
    .line 192
    move-result v3

    .line 193
    const/4 v7, 0x2

    .line 194
    int-to-float v7, v7

    .line 195
    div-float/2addr v3, v7

    .line 196
    invoke-static {v11, v12, v3}, LFe/b;->M(JF)J

    .line 197
    .line 198
    .line 199
    move-result-wide v17

    .line 200
    const v3, 0x7f08017e

    .line 201
    .line 202
    .line 203
    invoke-static {v3, v15}, Lff/B;->H(ILN/o;)Lh0/c;

    .line 204
    .line 205
    .line 206
    move-result-object v10

    .line 207
    const v3, 0x3ecccccd    # 0.4f

    .line 208
    .line 209
    .line 210
    invoke-static {v4, v5, v3}, LL0/f;->c(JF)J

    .line 211
    .line 212
    .line 213
    move-result-wide v11

    .line 214
    iget-object v3, v2, Lcom/moloco/sdk/internal/ortb/model/h;->g:Le0/q;

    .line 215
    .line 216
    if-eqz v3, :cond_4

    .line 217
    .line 218
    iget-wide v13, v3, Le0/q;->a:J

    .line 219
    .line 220
    goto :goto_2

    .line 221
    :cond_4
    sget-wide v13, Lcom/moloco/sdk/internal/i;->b:J

    .line 222
    .line 223
    :goto_2
    const/16 v16, 0x4

    .line 224
    .line 225
    invoke-static/range {v10 .. v16}, Lic/d;->f(Lh0/c;JJLN/o;I)Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/x;

    .line 226
    .line 227
    .line 228
    move-result-object v3

    .line 229
    iget-object v1, v1, Lcom/moloco/sdk/internal/ortb/model/h0;->j:Lcom/moloco/sdk/internal/ortb/model/D;

    .line 230
    .line 231
    const/16 v21, 0x40

    .line 232
    .line 233
    iget-wide v12, v2, Lcom/moloco/sdk/internal/ortb/model/h;->f:J

    .line 234
    .line 235
    move-object/from16 v19, v1

    .line 236
    .line 237
    move-object v10, v6

    .line 238
    move-object v11, v8

    .line 239
    move-object/from16 v20, v15

    .line 240
    .line 241
    move-wide/from16 v16, v17

    .line 242
    .line 243
    move-object/from16 v18, v3

    .line 244
    .line 245
    move-wide v14, v4

    .line 246
    invoke-static/range {v10 .. v21}, Lic/d;->d(LZ/d;LE/F;JJJLcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/z;Lcom/moloco/sdk/internal/ortb/model/D;LN/o;I)LV/d;

    .line 247
    .line 248
    .line 249
    move-result-object v1

    .line 250
    move-object/from16 v15, v20

    .line 251
    .line 252
    :goto_3
    const/4 v2, 0x0

    .line 253
    invoke-virtual {v15, v2}, LN/o;->p(Z)V

    .line 254
    .line 255
    .line 256
    return-object v1

    .line 257
    :pswitch_2
    move-object/from16 v13, p1

    .line 258
    .line 259
    check-cast v13, LN/o;

    .line 260
    .line 261
    move-object/from16 v1, p2

    .line 262
    .line 263
    check-cast v1, Ljava/lang/Number;

    .line 264
    .line 265
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 266
    .line 267
    .line 268
    const v1, -0x1c43ae6f

    .line 269
    .line 270
    .line 271
    invoke-virtual {v13, v1}, LN/o;->M(I)V

    .line 272
    .line 273
    .line 274
    iget-object v1, v0, Lcom/moloco/sdk/internal/h;->b:Lcom/moloco/sdk/internal/ortb/model/h0;

    .line 275
    .line 276
    iget-object v2, v1, Lcom/moloco/sdk/internal/ortb/model/h0;->a:Lcom/moloco/sdk/internal/ortb/model/h;

    .line 277
    .line 278
    if-nez v2, :cond_5

    .line 279
    .line 280
    const/4 v1, 0x0

    .line 281
    goto/16 :goto_7

    .line 282
    .line 283
    :cond_5
    iget v3, v2, Lcom/moloco/sdk/internal/ortb/model/h;->c:I

    .line 284
    .line 285
    int-to-float v4, v3

    .line 286
    invoke-static {v4, v4}, LA6/c;->b(FF)J

    .line 287
    .line 288
    .line 289
    move-result-wide v11

    .line 290
    iget-object v4, v1, Lcom/moloco/sdk/internal/ortb/model/h0;->m:Lcom/moloco/sdk/internal/ortb/model/Z;

    .line 291
    .line 292
    if-eqz v4, :cond_6

    .line 293
    .line 294
    iget-object v4, v4, Lcom/moloco/sdk/internal/ortb/model/Z;->d:Le0/q;

    .line 295
    .line 296
    if-eqz v4, :cond_6

    .line 297
    .line 298
    iget-wide v4, v4, Le0/q;->a:J

    .line 299
    .line 300
    :goto_4
    move-wide v5, v4

    .line 301
    goto :goto_5

    .line 302
    :cond_6
    iget-wide v4, v2, Lcom/moloco/sdk/internal/ortb/model/h;->f:J

    .line 303
    .line 304
    goto :goto_4

    .line 305
    :goto_5
    iget-object v4, v2, Lcom/moloco/sdk/internal/ortb/model/h;->d:Lcom/moloco/sdk/internal/ortb/model/X;

    .line 306
    .line 307
    iget-object v7, v2, Lcom/moloco/sdk/internal/ortb/model/h;->e:Lcom/moloco/sdk/internal/ortb/model/k;

    .line 308
    .line 309
    invoke-static {v4, v7}, Lcom/moloco/sdk/internal/i;->b(Lcom/moloco/sdk/internal/ortb/model/X;Lcom/moloco/sdk/internal/ortb/model/k;)LZ/d;

    .line 310
    .line 311
    .line 312
    move-result-object v14

    .line 313
    iget v4, v2, Lcom/moloco/sdk/internal/ortb/model/h;->b:I

    .line 314
    .line 315
    int-to-float v4, v4

    .line 316
    new-instance v15, LE/F;

    .line 317
    .line 318
    invoke-direct {v15, v4, v4, v4, v4}, LE/F;-><init>(FFFF)V

    .line 319
    .line 320
    .line 321
    invoke-static {v3}, LFe/b;->E(I)J

    .line 322
    .line 323
    .line 324
    move-result-wide v3

    .line 325
    invoke-static {v3, v4}, LFe/b;->j(J)V

    .line 326
    .line 327
    .line 328
    const-wide v7, 0xff00000000L

    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    and-long/2addr v7, v3

    .line 334
    invoke-static {v3, v4}, LL0/j;->c(J)F

    .line 335
    .line 336
    .line 337
    move-result v3

    .line 338
    const/4 v4, 0x2

    .line 339
    int-to-float v4, v4

    .line 340
    div-float/2addr v3, v4

    .line 341
    invoke-static {v7, v8, v3}, LFe/b;->M(JF)J

    .line 342
    .line 343
    .line 344
    move-result-wide v16

    .line 345
    const v3, 0x3ecccccd    # 0.4f

    .line 346
    .line 347
    .line 348
    invoke-static {v11, v12, v3}, LL0/f;->c(JF)J

    .line 349
    .line 350
    .line 351
    move-result-wide v3

    .line 352
    iget-object v2, v2, Lcom/moloco/sdk/internal/ortb/model/h;->g:Le0/q;

    .line 353
    .line 354
    if-eqz v2, :cond_7

    .line 355
    .line 356
    iget-wide v7, v2, Le0/q;->a:J

    .line 357
    .line 358
    goto :goto_6

    .line 359
    :cond_7
    sget-wide v7, Lcom/moloco/sdk/internal/i;->b:J

    .line 360
    .line 361
    :goto_6
    iget-object v9, v1, Lcom/moloco/sdk/internal/ortb/model/h0;->m:Lcom/moloco/sdk/internal/ortb/model/Z;

    .line 362
    .line 363
    move-wide/from16 v28, v7

    .line 364
    .line 365
    move-wide v7, v5

    .line 366
    move-wide/from16 v5, v28

    .line 367
    .line 368
    move-object v10, v13

    .line 369
    invoke-static/range {v3 .. v10}, Lcom/moloco/sdk/internal/i;->c(JJJLcom/moloco/sdk/internal/ortb/model/Z;LN/o;)Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/z;

    .line 370
    .line 371
    .line 372
    move-result-object v2

    .line 373
    move-wide v5, v7

    .line 374
    iget-object v1, v1, Lcom/moloco/sdk/internal/ortb/model/h0;->j:Lcom/moloco/sdk/internal/ortb/model/D;

    .line 375
    .line 376
    move-object v3, v14

    .line 377
    const/16 v14, 0x40

    .line 378
    .line 379
    move-wide v7, v11

    .line 380
    move-object v4, v15

    .line 381
    move-wide/from16 v9, v16

    .line 382
    .line 383
    move-object v12, v1

    .line 384
    move-object v11, v2

    .line 385
    invoke-static/range {v3 .. v14}, Lic/d;->d(LZ/d;LE/F;JJJLcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/z;Lcom/moloco/sdk/internal/ortb/model/D;LN/o;I)LV/d;

    .line 386
    .line 387
    .line 388
    move-result-object v1

    .line 389
    :goto_7
    const/4 v2, 0x0

    .line 390
    invoke-virtual {v13, v2}, LN/o;->p(Z)V

    .line 391
    .line 392
    .line 393
    return-object v1

    .line 394
    :pswitch_3
    move-object/from16 v1, p1

    .line 395
    .line 396
    check-cast v1, LN/o;

    .line 397
    .line 398
    move-object/from16 v2, p2

    .line 399
    .line 400
    check-cast v2, Ljava/lang/Number;

    .line 401
    .line 402
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 403
    .line 404
    .line 405
    const v2, 0x3c60f857

    .line 406
    .line 407
    .line 408
    invoke-virtual {v1, v2}, LN/o;->M(I)V

    .line 409
    .line 410
    .line 411
    iget-object v2, v0, Lcom/moloco/sdk/internal/h;->b:Lcom/moloco/sdk/internal/ortb/model/h0;

    .line 412
    .line 413
    iget-object v3, v2, Lcom/moloco/sdk/internal/ortb/model/h0;->d:Lcom/moloco/sdk/internal/ortb/model/f0;

    .line 414
    .line 415
    iget-object v3, v3, Lcom/moloco/sdk/internal/ortb/model/f0;->f:Lef/u;

    .line 416
    .line 417
    if-eqz v3, :cond_8

    .line 418
    .line 419
    iget v3, v3, Lef/u;->a:I

    .line 420
    .line 421
    int-to-float v3, v3

    .line 422
    invoke-static {v3, v3}, LA6/c;->b(FF)J

    .line 423
    .line 424
    .line 425
    move-result-wide v3

    .line 426
    :goto_8
    move-wide v14, v3

    .line 427
    goto :goto_9

    .line 428
    :cond_8
    sget-wide v3, Lcom/moloco/sdk/internal/i;->d:J

    .line 429
    .line 430
    goto :goto_8

    .line 431
    :goto_9
    iget-object v2, v2, Lcom/moloco/sdk/internal/ortb/model/h0;->d:Lcom/moloco/sdk/internal/ortb/model/f0;

    .line 432
    .line 433
    iget-object v3, v2, Lcom/moloco/sdk/internal/ortb/model/f0;->c:Lcom/moloco/sdk/internal/ortb/model/X;

    .line 434
    .line 435
    iget-object v4, v2, Lcom/moloco/sdk/internal/ortb/model/f0;->d:Lcom/moloco/sdk/internal/ortb/model/k;

    .line 436
    .line 437
    invoke-static {v3, v4}, Lcom/moloco/sdk/internal/i;->b(Lcom/moloco/sdk/internal/ortb/model/X;Lcom/moloco/sdk/internal/ortb/model/k;)LZ/d;

    .line 438
    .line 439
    .line 440
    move-result-object v20

    .line 441
    iget v3, v2, Lcom/moloco/sdk/internal/ortb/model/f0;->b:I

    .line 442
    .line 443
    int-to-float v3, v3

    .line 444
    new-instance v4, LE/F;

    .line 445
    .line 446
    invoke-direct {v4, v3, v3, v3, v3}, LE/F;-><init>(FFFF)V

    .line 447
    .line 448
    .line 449
    const v3, 0x3f19999a    # 0.6f

    .line 450
    .line 451
    .line 452
    invoke-static {v14, v15, v3}, LL0/f;->c(JF)J

    .line 453
    .line 454
    .line 455
    move-result-wide v16

    .line 456
    iget-object v3, v2, Lcom/moloco/sdk/internal/ortb/model/f0;->g:Le0/q;

    .line 457
    .line 458
    if-eqz v3, :cond_9

    .line 459
    .line 460
    iget-wide v5, v3, Le0/q;->a:J

    .line 461
    .line 462
    :goto_a
    move-wide/from16 v18, v5

    .line 463
    .line 464
    goto :goto_b

    .line 465
    :cond_9
    sget-wide v5, Lcom/moloco/sdk/internal/i;->b:J

    .line 466
    .line 467
    goto :goto_a

    .line 468
    :goto_b
    const v3, 0x7f080184

    .line 469
    .line 470
    .line 471
    invoke-static {v3, v1}, Lff/B;->H(ILN/o;)Lh0/c;

    .line 472
    .line 473
    .line 474
    move-result-object v24

    .line 475
    const v3, 0x7f080185

    .line 476
    .line 477
    .line 478
    invoke-static {v3, v1}, Lff/B;->H(ILN/o;)Lh0/c;

    .line 479
    .line 480
    .line 481
    move-result-object v25

    .line 482
    const/16 v27, 0x204

    .line 483
    .line 484
    iget-wide v2, v2, Lcom/moloco/sdk/internal/ortb/model/f0;->e:J

    .line 485
    .line 486
    move-object/from16 v26, v1

    .line 487
    .line 488
    move-wide/from16 v22, v2

    .line 489
    .line 490
    move-object/from16 v21, v4

    .line 491
    .line 492
    invoke-static/range {v14 .. v27}, Lr7/e;->b(JJJLZ/d;LE/F;JLh0/c;Lh0/c;LN/o;I)LV/d;

    .line 493
    .line 494
    .line 495
    move-result-object v1

    .line 496
    move-object/from16 v2, v26

    .line 497
    .line 498
    const/4 v3, 0x0

    .line 499
    invoke-virtual {v2, v3}, LN/o;->p(Z)V

    .line 500
    .line 501
    .line 502
    return-object v1

    .line 503
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
