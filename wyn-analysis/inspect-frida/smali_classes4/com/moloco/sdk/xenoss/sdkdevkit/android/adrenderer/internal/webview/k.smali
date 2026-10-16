.class public abstract Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/k;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0xc

    .line 2
    .line 3
    int-to-float v0, v0

    .line 4
    sput v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/k;->a:F

    .line 5
    .line 6
    return-void
.end method

.method public static final a(Landroid/app/Activity;Landroid/webkit/WebView;ILtf/l;Ltf/a;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/f;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/v;Ltf/a;LN/o;I)V
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move/from16 v3, p2

    .line 6
    .line 7
    move-object/from16 v7, p3

    .line 8
    .line 9
    move-object/from16 v10, p4

    .line 10
    .line 11
    move-object/from16 v6, p5

    .line 12
    .line 13
    move-object/from16 v9, p6

    .line 14
    .line 15
    move-object/from16 v8, p7

    .line 16
    .line 17
    move-object/from16 v0, p8

    .line 18
    .line 19
    const-string v4, "webView"

    .line 20
    .line 21
    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const-string v4, "onButtonRendered"

    .line 25
    .line 26
    invoke-static {v7, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const-string v4, "onClose"

    .line 30
    .line 31
    invoke-static {v10, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    const-string v4, "adWebViewRenderer"

    .line 35
    .line 36
    invoke-static {v6, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const-string v4, "onCloseOrSkipButtonShown"

    .line 40
    .line 41
    invoke-static {v8, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    const v4, -0xc3518d8

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v4}, LN/o;->N(I)LN/o;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v1}, LN/o;->e(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    if-eqz v4, :cond_0

    .line 55
    .line 56
    const/4 v4, 0x4

    .line 57
    goto :goto_0

    .line 58
    :cond_0
    const/4 v4, 0x2

    .line 59
    :goto_0
    or-int v4, p9, v4

    .line 60
    .line 61
    invoke-virtual {v0, v2}, LN/o;->e(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v5

    .line 65
    if-eqz v5, :cond_1

    .line 66
    .line 67
    const/16 v5, 0x20

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_1
    const/16 v5, 0x10

    .line 71
    .line 72
    :goto_1
    or-int/2addr v4, v5

    .line 73
    invoke-virtual {v0, v3}, LN/o;->c(I)Z

    .line 74
    .line 75
    .line 76
    move-result v5

    .line 77
    if-eqz v5, :cond_2

    .line 78
    .line 79
    const/16 v5, 0x100

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_2
    const/16 v5, 0x80

    .line 83
    .line 84
    :goto_2
    or-int/2addr v4, v5

    .line 85
    invoke-virtual {v0, v7}, LN/o;->e(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v5

    .line 89
    if-eqz v5, :cond_3

    .line 90
    .line 91
    const/16 v5, 0x800

    .line 92
    .line 93
    goto :goto_3

    .line 94
    :cond_3
    const/16 v5, 0x400

    .line 95
    .line 96
    :goto_3
    or-int/2addr v4, v5

    .line 97
    invoke-virtual {v0, v10}, LN/o;->e(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v5

    .line 101
    if-eqz v5, :cond_4

    .line 102
    .line 103
    const/16 v5, 0x4000

    .line 104
    .line 105
    goto :goto_4

    .line 106
    :cond_4
    const/16 v5, 0x2000

    .line 107
    .line 108
    :goto_4
    or-int/2addr v4, v5

    .line 109
    invoke-virtual {v0, v6}, LN/o;->e(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v5

    .line 113
    if-eqz v5, :cond_5

    .line 114
    .line 115
    const/high16 v5, 0x20000

    .line 116
    .line 117
    goto :goto_5

    .line 118
    :cond_5
    const/high16 v5, 0x10000

    .line 119
    .line 120
    :goto_5
    or-int/2addr v4, v5

    .line 121
    invoke-virtual {v0, v9}, LN/o;->e(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v5

    .line 125
    if-eqz v5, :cond_6

    .line 126
    .line 127
    const/high16 v5, 0x100000

    .line 128
    .line 129
    goto :goto_6

    .line 130
    :cond_6
    const/high16 v5, 0x80000

    .line 131
    .line 132
    :goto_6
    or-int v11, v4, v5

    .line 133
    .line 134
    const v4, 0x492493

    .line 135
    .line 136
    .line 137
    and-int/2addr v4, v11

    .line 138
    const v5, 0x492492

    .line 139
    .line 140
    .line 141
    if-ne v4, v5, :cond_8

    .line 142
    .line 143
    invoke-virtual {v0}, LN/o;->x()Z

    .line 144
    .line 145
    .line 146
    move-result v4

    .line 147
    if-nez v4, :cond_7

    .line 148
    .line 149
    goto :goto_7

    .line 150
    :cond_7
    invoke-virtual {v0}, LN/o;->I()V

    .line 151
    .line 152
    .line 153
    goto/16 :goto_d

    .line 154
    .line 155
    :cond_8
    :goto_7
    sget-object v4, LZ/i;->a:LZ/i;

    .line 156
    .line 157
    invoke-static {v4}, LE/L;->a(LZ/k;)LZ/k;

    .line 158
    .line 159
    .line 160
    move-result-object v4

    .line 161
    sget-wide v12, Le0/q;->b:J

    .line 162
    .line 163
    sget-object v5, Le0/z;->a:Lad/I;

    .line 164
    .line 165
    invoke-static {v4, v12, v13, v5}, LU8/v0;->l(LZ/k;JLe0/E;)LZ/k;

    .line 166
    .line 167
    .line 168
    move-result-object v4

    .line 169
    const v5, 0x2bb5b5d7

    .line 170
    .line 171
    .line 172
    invoke-virtual {v0, v5}, LN/o;->M(I)V

    .line 173
    .line 174
    .line 175
    sget-object v5, LZ/a;->a:LZ/d;

    .line 176
    .line 177
    const/4 v12, 0x0

    .line 178
    invoke-static {v5, v12, v0}, LE/p;->c(LZ/d;ZLN/o;)Lr0/n;

    .line 179
    .line 180
    .line 181
    move-result-object v5

    .line 182
    const v13, -0x4ee9b9da

    .line 183
    .line 184
    .line 185
    invoke-virtual {v0, v13}, LN/o;->M(I)V

    .line 186
    .line 187
    .line 188
    sget-object v13, Lu0/M;->e:LN/L0;

    .line 189
    .line 190
    invoke-virtual {v0, v13}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v13

    .line 194
    check-cast v13, LL0/b;

    .line 195
    .line 196
    sget-object v14, Lu0/M;->k:LN/L0;

    .line 197
    .line 198
    invoke-virtual {v0, v14}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v14

    .line 202
    check-cast v14, LL0/i;

    .line 203
    .line 204
    sget-object v15, Lu0/M;->o:LN/L0;

    .line 205
    .line 206
    invoke-virtual {v0, v15}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v15

    .line 210
    check-cast v15, Lu0/p0;

    .line 211
    .line 212
    sget-object v16, Lt0/c;->g9:Lt0/b;

    .line 213
    .line 214
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 215
    .line 216
    .line 217
    sget-object v12, Lt0/b;->b:Lt0/d;

    .line 218
    .line 219
    invoke-static {v4}, LS3/f;->y(LZ/k;)LV/d;

    .line 220
    .line 221
    .line 222
    move-result-object v4

    .line 223
    invoke-virtual {v0}, LN/o;->O()V

    .line 224
    .line 225
    .line 226
    move/from16 v17, v11

    .line 227
    .line 228
    iget-boolean v11, v0, LN/o;->O:Z

    .line 229
    .line 230
    if-eqz v11, :cond_9

    .line 231
    .line 232
    invoke-virtual {v0, v12}, LN/o;->k(Ltf/a;)V

    .line 233
    .line 234
    .line 235
    :goto_8
    const/4 v11, 0x0

    .line 236
    goto :goto_9

    .line 237
    :cond_9
    invoke-virtual {v0}, LN/o;->X()V

    .line 238
    .line 239
    .line 240
    goto :goto_8

    .line 241
    :goto_9
    iput-boolean v11, v0, LN/o;->x:Z

    .line 242
    .line 243
    sget-object v11, Lt0/b;->e:Lt0/a;

    .line 244
    .line 245
    invoke-static {v0, v5, v11}, LN/d;->M(LN/o;Ljava/lang/Object;Ltf/p;)V

    .line 246
    .line 247
    .line 248
    sget-object v5, Lt0/b;->d:Lt0/a;

    .line 249
    .line 250
    invoke-static {v0, v13, v5}, LN/d;->M(LN/o;Ljava/lang/Object;Ltf/p;)V

    .line 251
    .line 252
    .line 253
    sget-object v5, Lt0/b;->f:Lt0/a;

    .line 254
    .line 255
    invoke-static {v0, v14, v5}, LN/d;->M(LN/o;Ljava/lang/Object;Ltf/p;)V

    .line 256
    .line 257
    .line 258
    sget-object v5, Lt0/b;->g:Lt0/a;

    .line 259
    .line 260
    invoke-static {v0, v15, v5, v0}, Lwg/b;->b(LN/o;Lu0/p0;Lt0/a;LN/o;)LN/u0;

    .line 261
    .line 262
    .line 263
    move-result-object v5

    .line 264
    const v11, 0x7ab4aae9

    .line 265
    .line 266
    .line 267
    const/4 v12, 0x0

    .line 268
    invoke-static {v12, v4, v5, v0, v11}, Lwg/b;->d(ILV/d;LN/u0;LN/o;I)V

    .line 269
    .line 270
    .line 271
    const v4, -0x7f65a980

    .line 272
    .line 273
    .line 274
    invoke-virtual {v0, v4}, LN/o;->M(I)V

    .line 275
    .line 276
    .line 277
    const v4, 0x5ff5bd23

    .line 278
    .line 279
    .line 280
    invoke-virtual {v0, v4}, LN/o;->M(I)V

    .line 281
    .line 282
    .line 283
    invoke-virtual {v0, v3}, LN/o;->c(I)Z

    .line 284
    .line 285
    .line 286
    move-result v4

    .line 287
    invoke-virtual {v0}, LN/o;->F()Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v5

    .line 291
    sget-object v11, LN/k;->a:LN/P;

    .line 292
    .line 293
    const/4 v12, 0x1

    .line 294
    if-nez v4, :cond_a

    .line 295
    .line 296
    if-ne v5, v11, :cond_c

    .line 297
    .line 298
    :cond_a
    if-nez v3, :cond_b

    .line 299
    .line 300
    move v4, v12

    .line 301
    goto :goto_a

    .line 302
    :cond_b
    const/4 v4, 0x0

    .line 303
    :goto_a
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 304
    .line 305
    .line 306
    move-result-object v4

    .line 307
    invoke-static {v4}, LHf/k0;->c(Ljava/lang/Object;)LHf/x0;

    .line 308
    .line 309
    .line 310
    move-result-object v5

    .line 311
    invoke-virtual {v0, v5}, LN/o;->U(Ljava/lang/Object;)V

    .line 312
    .line 313
    .line 314
    :cond_c
    check-cast v5, LHf/c0;

    .line 315
    .line 316
    const/4 v4, 0x0

    .line 317
    invoke-virtual {v0, v4}, LN/o;->p(Z)V

    .line 318
    .line 319
    .line 320
    const v4, 0x5ff5dac8

    .line 321
    .line 322
    .line 323
    invoke-virtual {v0, v4}, LN/o;->M(I)V

    .line 324
    .line 325
    .line 326
    invoke-virtual {v0, v6}, LN/o;->e(Ljava/lang/Object;)Z

    .line 327
    .line 328
    .line 329
    move-result v4

    .line 330
    invoke-virtual {v0, v2}, LN/o;->e(Ljava/lang/Object;)Z

    .line 331
    .line 332
    .line 333
    move-result v13

    .line 334
    or-int/2addr v4, v13

    .line 335
    invoke-virtual {v0, v3}, LN/o;->c(I)Z

    .line 336
    .line 337
    .line 338
    move-result v13

    .line 339
    or-int/2addr v4, v13

    .line 340
    invoke-virtual {v0, v5}, LN/o;->e(Ljava/lang/Object;)Z

    .line 341
    .line 342
    .line 343
    move-result v13

    .line 344
    or-int/2addr v4, v13

    .line 345
    invoke-virtual {v0, v7}, LN/o;->e(Ljava/lang/Object;)Z

    .line 346
    .line 347
    .line 348
    move-result v13

    .line 349
    or-int/2addr v4, v13

    .line 350
    invoke-virtual {v0, v10}, LN/o;->e(Ljava/lang/Object;)Z

    .line 351
    .line 352
    .line 353
    move-result v13

    .line 354
    or-int/2addr v4, v13

    .line 355
    invoke-virtual {v0, v8}, LN/o;->e(Ljava/lang/Object;)Z

    .line 356
    .line 357
    .line 358
    move-result v13

    .line 359
    or-int/2addr v4, v13

    .line 360
    invoke-virtual {v0, v9}, LN/o;->e(Ljava/lang/Object;)Z

    .line 361
    .line 362
    .line 363
    move-result v13

    .line 364
    or-int/2addr v4, v13

    .line 365
    invoke-virtual {v0}, LN/o;->F()Ljava/lang/Object;

    .line 366
    .line 367
    .line 368
    move-result-object v13

    .line 369
    if-nez v4, :cond_e

    .line 370
    .line 371
    if-ne v13, v11, :cond_d

    .line 372
    .line 373
    goto :goto_b

    .line 374
    :cond_d
    move-object v8, v5

    .line 375
    goto :goto_c

    .line 376
    :cond_e
    :goto_b
    new-instance v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/b;

    .line 377
    .line 378
    move-object v4, v5

    .line 379
    move v5, v3

    .line 380
    move-object v3, v6

    .line 381
    move-object v6, v4

    .line 382
    move-object/from16 v4, p1

    .line 383
    .line 384
    invoke-direct/range {v2 .. v10}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/b;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/f;Landroid/webkit/WebView;ILHf/c0;Ltf/l;Ltf/a;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/v;Ltf/a;)V

    .line 385
    .line 386
    .line 387
    move-object v8, v6

    .line 388
    invoke-virtual {v0, v2}, LN/o;->U(Ljava/lang/Object;)V

    .line 389
    .line 390
    .line 391
    move-object v13, v2

    .line 392
    :goto_c
    move-object v2, v13

    .line 393
    check-cast v2, Ltf/l;

    .line 394
    .line 395
    const/4 v4, 0x0

    .line 396
    invoke-virtual {v0, v4}, LN/o;->p(Z)V

    .line 397
    .line 398
    .line 399
    const/4 v3, 0x0

    .line 400
    const/4 v4, 0x0

    .line 401
    const/4 v6, 0x0

    .line 402
    const/4 v7, 0x6

    .line 403
    move-object v5, v0

    .line 404
    invoke-static/range {v2 .. v7}, La/a;->c(Ltf/l;LZ/k;LM0/m;LN/o;II)V

    .line 405
    .line 406
    .line 407
    const v2, 0x5ff61158    # 3.54621E19f

    .line 408
    .line 409
    .line 410
    invoke-virtual {v0, v2}, LN/o;->M(I)V

    .line 411
    .line 412
    .line 413
    invoke-virtual {v0, v8}, LN/o;->e(Ljava/lang/Object;)Z

    .line 414
    .line 415
    .line 416
    move-result v2

    .line 417
    invoke-virtual {v0, v10}, LN/o;->e(Ljava/lang/Object;)Z

    .line 418
    .line 419
    .line 420
    move-result v3

    .line 421
    or-int/2addr v2, v3

    .line 422
    invoke-virtual {v0}, LN/o;->F()Ljava/lang/Object;

    .line 423
    .line 424
    .line 425
    move-result-object v3

    .line 426
    if-nez v2, :cond_f

    .line 427
    .line 428
    if-ne v3, v11, :cond_10

    .line 429
    .line 430
    :cond_f
    new-instance v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/c;

    .line 431
    .line 432
    const/4 v2, 0x0

    .line 433
    invoke-direct {v3, v8, v10, v2}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/c;-><init>(LHf/c0;Ltf/a;I)V

    .line 434
    .line 435
    .line 436
    invoke-virtual {v0, v3}, LN/o;->U(Ljava/lang/Object;)V

    .line 437
    .line 438
    .line 439
    :cond_10
    check-cast v3, Ltf/a;

    .line 440
    .line 441
    const/4 v4, 0x0

    .line 442
    invoke-virtual {v0, v4}, LN/o;->p(Z)V

    .line 443
    .line 444
    .line 445
    invoke-static {v4, v3, v0, v4}, Lvf/a;->a(ZLtf/a;LN/o;I)V

    .line 446
    .line 447
    .line 448
    and-int/lit8 v2, v17, 0xe

    .line 449
    .line 450
    invoke-static {v1, v0, v2}, LFe/c;->g(Landroid/app/Activity;LN/o;I)V

    .line 451
    .line 452
    .line 453
    invoke-virtual {v0, v4}, LN/o;->p(Z)V

    .line 454
    .line 455
    .line 456
    invoke-virtual {v0, v4}, LN/o;->p(Z)V

    .line 457
    .line 458
    .line 459
    invoke-virtual {v0, v12}, LN/o;->p(Z)V

    .line 460
    .line 461
    .line 462
    invoke-virtual {v0, v4}, LN/o;->p(Z)V

    .line 463
    .line 464
    .line 465
    invoke-virtual {v0, v4}, LN/o;->p(Z)V

    .line 466
    .line 467
    .line 468
    :goto_d
    invoke-virtual {v0}, LN/o;->r()LN/i0;

    .line 469
    .line 470
    .line 471
    move-result-object v11

    .line 472
    if-eqz v11, :cond_11

    .line 473
    .line 474
    new-instance v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/d;

    .line 475
    .line 476
    move-object/from16 v2, p1

    .line 477
    .line 478
    move/from16 v3, p2

    .line 479
    .line 480
    move-object/from16 v4, p3

    .line 481
    .line 482
    move-object/from16 v6, p5

    .line 483
    .line 484
    move-object/from16 v7, p6

    .line 485
    .line 486
    move-object/from16 v8, p7

    .line 487
    .line 488
    move/from16 v9, p9

    .line 489
    .line 490
    move-object v5, v10

    .line 491
    invoke-direct/range {v0 .. v9}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/d;-><init>(Landroid/app/Activity;Landroid/webkit/WebView;ILtf/l;Ltf/a;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/f;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/v;Ltf/a;I)V

    .line 492
    .line 493
    .line 494
    iput-object v0, v11, LN/i0;->d:Ltf/p;

    .line 495
    .line 496
    :cond_11
    return-void
.end method

.method public static final b(Landroid/app/Activity;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/q;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/O;ILtf/l;Ltf/a;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/f;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/v;Ltf/c;LV/d;Ltf/a;LN/o;I)V
    .locals 18

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p3

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v0, p11

    const-string v5, "webView"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "onButtonRendered"

    move-object/from16 v11, p4

    invoke-static {v11, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "onClose"

    invoke-static {v6, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "adWebViewRenderer"

    invoke-static {v7, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "onCloseOrSkipButtonShown"

    move-object/from16 v10, p10

    invoke-static {v10, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const v5, 0x2e09f62e

    .line 1
    invoke-virtual {v0, v5}, LN/o;->N(I)LN/o;

    invoke-virtual {v0, v1}, LN/o;->e(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 v5, 0x4

    goto :goto_0

    :cond_0
    const/4 v5, 0x2

    :goto_0
    or-int v5, p12, v5

    invoke-virtual {v0, v2}, LN/o;->e(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1

    const/16 v8, 0x20

    goto :goto_1

    :cond_1
    const/16 v8, 0x10

    :goto_1
    or-int/2addr v5, v8

    invoke-virtual {v0, v3}, LN/o;->e(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2

    const/16 v8, 0x100

    goto :goto_2

    :cond_2
    const/16 v8, 0x80

    :goto_2
    or-int/2addr v5, v8

    invoke-virtual {v0, v4}, LN/o;->c(I)Z

    move-result v8

    if-eqz v8, :cond_3

    const/16 v8, 0x800

    goto :goto_3

    :cond_3
    const/16 v8, 0x400

    :goto_3
    or-int/2addr v5, v8

    invoke-virtual {v0, v6}, LN/o;->e(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    const/high16 v8, 0x20000

    goto :goto_4

    :cond_4
    const/high16 v8, 0x10000

    :goto_4
    or-int/2addr v5, v8

    invoke-virtual {v0, v7}, LN/o;->e(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_5

    const/high16 v8, 0x100000

    goto :goto_5

    :cond_5
    const/high16 v8, 0x80000

    :goto_5
    or-int/2addr v5, v8

    move-object/from16 v8, p7

    invoke-virtual {v0, v8}, LN/o;->e(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_6

    const/high16 v9, 0x800000

    goto :goto_6

    :cond_6
    const/high16 v9, 0x400000

    :goto_6
    or-int/2addr v5, v9

    move-object/from16 v12, p8

    invoke-virtual {v0, v12}, LN/o;->e(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    const/high16 v9, 0x4000000

    goto :goto_7

    :cond_7
    const/high16 v9, 0x2000000

    :goto_7
    or-int/2addr v5, v9

    move-object/from16 v13, p9

    invoke-virtual {v0, v13}, LN/o;->e(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_8

    const/high16 v9, 0x20000000

    goto :goto_8

    :cond_8
    const/high16 v9, 0x10000000

    :goto_8
    or-int v14, v5, v9

    const v5, 0x12492493

    and-int/2addr v5, v14

    const v9, 0x12492492

    if-ne v5, v9, :cond_a

    invoke-virtual {v0}, LN/o;->x()Z

    move-result v5

    if-nez v5, :cond_9

    goto :goto_9

    .line 2
    :cond_9
    invoke-virtual {v0}, LN/o;->I()V

    move-object v7, v0

    move-object v10, v6

    goto/16 :goto_d

    .line 3
    :cond_a
    :goto_9
    sget-object v5, LZ/i;->a:LZ/i;

    .line 4
    invoke-static {v5}, LE/L;->a(LZ/k;)LZ/k;

    move-result-object v5

    .line 5
    sget-wide v6, Le0/q;->b:J

    .line 6
    sget-object v9, Le0/z;->a:Lad/I;

    .line 7
    invoke-static {v5, v6, v7, v9}, LU8/v0;->l(LZ/k;JLe0/E;)LZ/k;

    move-result-object v5

    .line 8
    const-string v6, "<this>"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    new-instance v6, LK/s;

    const-string v7, "MraidAdContainerScreen"

    const/4 v9, 0x1

    invoke-direct {v6, v7, v9}, LK/s;-><init>(Ljava/lang/String;I)V

    const/4 v15, 0x0

    .line 10
    invoke-static {v5, v15, v6}, LFe/g;->J(LZ/k;ZLtf/l;)LZ/k;

    move-result-object v5

    const v6, 0x2bb5b5d7

    .line 11
    invoke-virtual {v0, v6}, LN/o;->M(I)V

    .line 12
    sget-object v6, LZ/a;->a:LZ/d;

    .line 13
    invoke-static {v6, v15, v0}, LE/p;->c(LZ/d;ZLN/o;)Lr0/n;

    move-result-object v6

    const v7, -0x4ee9b9da

    .line 14
    invoke-virtual {v0, v7}, LN/o;->M(I)V

    .line 15
    sget-object v7, Lu0/M;->e:LN/L0;

    .line 16
    invoke-virtual {v0, v7}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    move-result-object v7

    .line 17
    check-cast v7, LL0/b;

    .line 18
    sget-object v9, Lu0/M;->k:LN/L0;

    .line 19
    invoke-virtual {v0, v9}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    move-result-object v9

    .line 20
    check-cast v9, LL0/i;

    .line 21
    sget-object v15, Lu0/M;->o:LN/L0;

    .line 22
    invoke-virtual {v0, v15}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    move-result-object v15

    .line 23
    check-cast v15, Lu0/p0;

    .line 24
    sget-object v16, Lt0/c;->g9:Lt0/b;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    sget-object v3, Lt0/b;->b:Lt0/d;

    .line 26
    invoke-static {v5}, LS3/f;->y(LZ/k;)LV/d;

    move-result-object v5

    .line 27
    invoke-virtual {v0}, LN/o;->O()V

    .line 28
    iget-boolean v8, v0, LN/o;->O:Z

    if-eqz v8, :cond_b

    .line 29
    invoke-virtual {v0, v3}, LN/o;->k(Ltf/a;)V

    :goto_a
    const/4 v3, 0x0

    goto :goto_b

    .line 30
    :cond_b
    invoke-virtual {v0}, LN/o;->X()V

    goto :goto_a

    .line 31
    :goto_b
    iput-boolean v3, v0, LN/o;->x:Z

    .line 32
    sget-object v3, Lt0/b;->e:Lt0/a;

    .line 33
    invoke-static {v0, v6, v3}, LN/d;->M(LN/o;Ljava/lang/Object;Ltf/p;)V

    .line 34
    sget-object v3, Lt0/b;->d:Lt0/a;

    .line 35
    invoke-static {v0, v7, v3}, LN/d;->M(LN/o;Ljava/lang/Object;Ltf/p;)V

    .line 36
    sget-object v3, Lt0/b;->f:Lt0/a;

    .line 37
    invoke-static {v0, v9, v3}, LN/d;->M(LN/o;Ljava/lang/Object;Ltf/p;)V

    .line 38
    sget-object v3, Lt0/b;->g:Lt0/a;

    .line 39
    invoke-static {v0, v15, v3, v0}, Lwg/b;->b(LN/o;Lu0/p0;Lt0/a;LN/o;)LN/u0;

    move-result-object v3

    const v6, 0x7ab4aae9

    const/4 v7, 0x0

    invoke-static {v7, v5, v3, v0, v6}, Lwg/b;->d(ILV/d;LN/u0;LN/o;I)V

    const v3, -0x7f65a980

    .line 40
    invoke-virtual {v0, v3}, LN/o;->M(I)V

    const v3, 0x47cc53fa

    .line 41
    invoke-virtual {v0, v3}, LN/o;->M(I)V

    .line 42
    invoke-virtual {v0, v4}, LN/o;->c(I)Z

    move-result v3

    .line 43
    invoke-virtual {v0}, LN/o;->F()Ljava/lang/Object;

    move-result-object v5

    sget-object v15, LN/k;->a:LN/P;

    const/4 v6, 0x1

    if-nez v3, :cond_c

    if-ne v5, v15, :cond_e

    :cond_c
    if-nez v4, :cond_d

    move v3, v6

    goto :goto_c

    :cond_d
    const/4 v3, 0x0

    .line 44
    :goto_c
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-static {v3}, LHf/k0;->c(Ljava/lang/Object;)LHf/x0;

    move-result-object v5

    .line 45
    invoke-virtual {v0, v5}, LN/o;->U(Ljava/lang/Object;)V

    .line 46
    :cond_e
    check-cast v5, LHf/c0;

    const/4 v3, 0x0

    .line 47
    invoke-virtual {v0, v3}, LN/o;->p(Z)V

    .line 48
    iget-object v7, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/q;->e:LHf/e0;

    invoke-static {v7, v0, v3}, LN/d;->u(LHf/v0;LN/o;I)LN/V;

    move-result-object v16

    .line 49
    invoke-interface/range {v16 .. v16}, LN/K0;->getValue()Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v17, v3

    check-cast v17, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/x;

    .line 50
    new-instance v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/h;

    move-object/from16 v9, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move v12, v6

    move-object/from16 v6, p2

    invoke-direct/range {v3 .. v11}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/h;-><init>(ILHf/c0;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/O;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/f;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/v;Ltf/a;Ltf/a;Ltf/l;)V

    move-object v11, v5

    move-object v10, v9

    const v4, -0x1ac17a88

    invoke-static {v0, v4, v3}, LV/e;->b(LN/o;ILef/e;)LV/d;

    move-result-object v6

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v8, 0xc00

    const/4 v9, 0x6

    move-object v7, v0

    move-object/from16 v3, v17

    invoke-static/range {v3 .. v9}, LFe/g;->c(Ljava/lang/Object;LZ/k;LA/Z;LV/d;LN/o;II)V

    .line 51
    invoke-interface/range {v16 .. v16}, LN/K0;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/x;

    and-int/lit8 v0, v14, 0x70

    or-int/lit8 v0, v0, 0x6

    shr-int/lit8 v4, v14, 0x12

    and-int/lit16 v4, v4, 0x1c00

    or-int/2addr v0, v4

    shr-int/lit8 v4, v14, 0xc

    const v5, 0xe000

    and-int/2addr v4, v5

    or-int v8, v0, v4

    const/4 v6, 0x0

    const/16 v9, 0x10

    move-object/from16 v5, p8

    move-object/from16 v7, p11

    move-object v4, v13

    .line 52
    invoke-static/range {v2 .. v9}, Ltg/b;->c(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/y;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/x;Ltf/c;Ltf/c;Ltf/c;LN/o;II)V

    const v0, 0x47cd53af

    invoke-virtual {v7, v0}, LN/o;->M(I)V

    invoke-virtual {v7, v11}, LN/o;->e(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v7, v10}, LN/o;->e(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v0, v2

    .line 53
    invoke-virtual {v7}, LN/o;->F()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_f

    if-ne v2, v15, :cond_10

    .line 54
    :cond_f
    new-instance v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/c;

    const/4 v0, 0x1

    invoke-direct {v2, v11, v10, v0}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/c;-><init>(LHf/c0;Ltf/a;I)V

    .line 55
    invoke-virtual {v7, v2}, LN/o;->U(Ljava/lang/Object;)V

    .line 56
    :cond_10
    check-cast v2, Ltf/a;

    const/4 v3, 0x0

    .line 57
    invoke-virtual {v7, v3}, LN/o;->p(Z)V

    .line 58
    invoke-static {v3, v2, v7, v3}, Lvf/a;->a(ZLtf/a;LN/o;I)V

    and-int/lit8 v0, v14, 0xe

    .line 59
    invoke-static {v1, v7, v0}, LFe/c;->g(Landroid/app/Activity;LN/o;I)V

    .line 60
    invoke-virtual {v7, v3}, LN/o;->p(Z)V

    .line 61
    invoke-virtual {v7, v3}, LN/o;->p(Z)V

    .line 62
    invoke-virtual {v7, v12}, LN/o;->p(Z)V

    .line 63
    invoke-virtual {v7, v3}, LN/o;->p(Z)V

    .line 64
    invoke-virtual {v7, v3}, LN/o;->p(Z)V

    .line 65
    :goto_d
    invoke-virtual {v7}, LN/o;->r()LN/i0;

    move-result-object v13

    if-eqz v13, :cond_11

    new-instance v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/e;

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v11, p10

    move/from16 v12, p12

    move-object v6, v10

    move-object/from16 v10, p9

    invoke-direct/range {v0 .. v12}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/e;-><init>(Landroid/app/Activity;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/q;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/O;ILtf/l;Ltf/a;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/f;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/v;Ltf/c;LV/d;Ltf/a;I)V

    .line 66
    iput-object v0, v13, LN/i0;->d:Ltf/p;

    :cond_11
    return-void
.end method

.method public static final c(Landroid/webkit/WebView;ILN/V;Ltf/l;Ltf/a;Ltf/a;LZ/k;JLtf/c;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/t;FZLHf/l;LN/o;I)V
    .locals 21

    move-object/from16 v1, p0

    move/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v0, p5

    move-wide/from16 v14, p7

    move-object/from16 v9, p9

    move-object/from16 v5, p10

    move/from16 v6, p11

    move-object/from16 v12, p14

    const v7, -0x5120493d

    .line 1
    invoke-virtual {v12, v7}, LN/o;->N(I)LN/o;

    invoke-virtual {v12, v1}, LN/o;->e(Ljava/lang/Object;)Z

    move-result v7

    const/4 v8, 0x2

    const/4 v10, 0x4

    if-eqz v7, :cond_0

    move v7, v10

    goto :goto_0

    :cond_0
    move v7, v8

    :goto_0
    or-int v7, p15, v7

    invoke-virtual {v12, v2}, LN/o;->c(I)Z

    move-result v11

    const/16 v13, 0x10

    const/16 v16, 0x20

    if-eqz v11, :cond_1

    move/from16 v11, v16

    goto :goto_1

    :cond_1
    move v11, v13

    :goto_1
    or-int/2addr v7, v11

    invoke-virtual {v12, v4}, LN/o;->e(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_2

    const/16 v11, 0x800

    goto :goto_2

    :cond_2
    const/16 v11, 0x400

    :goto_2
    or-int/2addr v7, v11

    move-object/from16 v11, p4

    invoke-virtual {v12, v11}, LN/o;->e(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_3

    const/16 v17, 0x4000

    goto :goto_3

    :cond_3
    const/16 v17, 0x2000

    :goto_3
    or-int v7, v7, v17

    invoke-virtual {v12, v0}, LN/o;->e(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_4

    const/high16 v17, 0x20000

    goto :goto_4

    :cond_4
    const/high16 v17, 0x10000

    :goto_4
    or-int v7, v7, v17

    const/high16 v17, 0x180000

    or-int v7, v7, v17

    invoke-virtual {v12, v14, v15}, LN/o;->d(J)Z

    move-result v17

    if-eqz v17, :cond_5

    const/high16 v17, 0x800000

    goto :goto_5

    :cond_5
    const/high16 v17, 0x400000

    :goto_5
    or-int v7, v7, v17

    invoke-virtual {v12, v9}, LN/o;->e(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_6

    const/high16 v17, 0x4000000

    goto :goto_6

    :cond_6
    const/high16 v17, 0x2000000

    :goto_6
    or-int v7, v7, v17

    invoke-virtual {v12, v5}, LN/o;->e(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_7

    const/high16 v17, 0x20000000

    goto :goto_7

    :cond_7
    const/high16 v17, 0x10000000

    :goto_7
    or-int v17, v7, v17

    invoke-virtual {v12, v6}, LN/o;->b(F)Z

    move-result v7

    if-eqz v7, :cond_8

    move v8, v10

    :cond_8
    move/from16 v10, p12

    invoke-virtual {v12, v10}, LN/o;->f(Z)Z

    move-result v7

    if-eqz v7, :cond_9

    move/from16 v13, v16

    :cond_9
    or-int v7, v8, v13

    move-object/from16 v8, p13

    invoke-virtual {v12, v8}, LN/o;->e(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_a

    const/16 v13, 0x100

    goto :goto_8

    :cond_a
    const/16 v13, 0x80

    :goto_8
    or-int/2addr v7, v13

    const v13, 0x12492493

    and-int v13, v17, v13

    const v4, 0x12492492

    if-ne v13, v4, :cond_c

    and-int/lit16 v4, v7, 0x93

    const/16 v13, 0x92

    if-ne v4, v13, :cond_c

    invoke-virtual {v12}, LN/o;->x()Z

    move-result v4

    if-nez v4, :cond_b

    goto :goto_9

    .line 2
    :cond_b
    invoke-virtual {v12}, LN/o;->I()V

    move-object/from16 v4, p3

    move-object/from16 v7, p6

    move v0, v6

    goto/16 :goto_11

    .line 3
    :cond_c
    :goto_9
    invoke-virtual {v12}, LN/o;->K()V

    and-int/lit8 v4, p15, 0x1

    sget-object v13, LZ/i;->a:LZ/i;

    if-eqz v4, :cond_e

    invoke-virtual {v12}, LN/o;->w()Z

    move-result v4

    if-eqz v4, :cond_d

    goto :goto_a

    .line 4
    :cond_d
    invoke-virtual {v12}, LN/o;->I()V

    move-object/from16 v16, p6

    goto :goto_b

    :cond_e
    :goto_a
    move-object/from16 v16, v13

    .line 5
    :goto_b
    invoke-virtual {v12}, LN/o;->q()V

    .line 6
    invoke-static/range {v16 .. v16}, LE/L;->a(LZ/k;)LZ/k;

    move-result-object v4

    .line 7
    sget-object v6, Le0/z;->a:Lad/I;

    .line 8
    invoke-static {v4, v14, v15, v6}, LU8/v0;->l(LZ/k;JLe0/E;)LZ/k;

    move-result-object v4

    const v6, 0x2bb5b5d7

    .line 9
    invoke-virtual {v12, v6}, LN/o;->M(I)V

    .line 10
    sget-object v6, LZ/a;->a:LZ/d;

    const/4 v14, 0x0

    .line 11
    invoke-static {v6, v14, v12}, LE/p;->c(LZ/d;ZLN/o;)Lr0/n;

    move-result-object v6

    const v15, -0x4ee9b9da

    .line 12
    invoke-virtual {v12, v15}, LN/o;->M(I)V

    .line 13
    sget-object v15, Lu0/M;->e:LN/L0;

    .line 14
    invoke-virtual {v12, v15}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    move-result-object v15

    .line 15
    check-cast v15, LL0/b;

    .line 16
    sget-object v14, Lu0/M;->k:LN/L0;

    .line 17
    invoke-virtual {v12, v14}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    move-result-object v14

    .line 18
    check-cast v14, LL0/i;

    move-object/from16 v18, v4

    .line 19
    sget-object v4, Lu0/M;->o:LN/L0;

    .line 20
    invoke-virtual {v12, v4}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    move-result-object v4

    .line 21
    check-cast v4, Lu0/p0;

    .line 22
    sget-object v19, Lt0/c;->g9:Lt0/b;

    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move/from16 v19, v7

    .line 23
    sget-object v7, Lt0/b;->b:Lt0/d;

    .line 24
    invoke-static/range {v18 .. v18}, LS3/f;->y(LZ/k;)LV/d;

    move-result-object v8

    .line 25
    invoke-virtual {v12}, LN/o;->O()V

    .line 26
    iget-boolean v9, v12, LN/o;->O:Z

    if-eqz v9, :cond_f

    .line 27
    invoke-virtual {v12, v7}, LN/o;->k(Ltf/a;)V

    :goto_c
    const/4 v7, 0x0

    goto :goto_d

    .line 28
    :cond_f
    invoke-virtual {v12}, LN/o;->X()V

    goto :goto_c

    .line 29
    :goto_d
    iput-boolean v7, v12, LN/o;->x:Z

    .line 30
    sget-object v7, Lt0/b;->e:Lt0/a;

    .line 31
    invoke-static {v12, v6, v7}, LN/d;->M(LN/o;Ljava/lang/Object;Ltf/p;)V

    .line 32
    sget-object v6, Lt0/b;->d:Lt0/a;

    .line 33
    invoke-static {v12, v15, v6}, LN/d;->M(LN/o;Ljava/lang/Object;Ltf/p;)V

    .line 34
    sget-object v6, Lt0/b;->f:Lt0/a;

    .line 35
    invoke-static {v12, v14, v6}, LN/d;->M(LN/o;Ljava/lang/Object;Ltf/p;)V

    .line 36
    sget-object v6, Lt0/b;->g:Lt0/a;

    .line 37
    invoke-static {v12, v4, v6, v12}, Lwg/b;->b(LN/o;Lu0/p0;Lt0/a;LN/o;)LN/u0;

    move-result-object v4

    const v6, 0x7ab4aae9

    const/4 v7, 0x0

    invoke-static {v7, v8, v4, v12, v6}, Lwg/b;->d(ILV/d;LN/u0;LN/o;I)V

    const v4, -0x7f65a980

    .line 38
    invoke-virtual {v12, v4}, LN/o;->M(I)V

    .line 39
    sget-object v14, LE/q;->a:LE/q;

    .line 40
    invoke-static {v13}, LE/L;->a(LZ/k;)LZ/k;

    move-result-object v4

    and-int/lit8 v6, v17, 0xe

    or-int/lit8 v6, v6, 0x30

    shr-int/lit8 v7, v17, 0x15

    and-int/lit16 v7, v7, 0x380

    or-int/2addr v6, v7

    invoke-static {v1, v4, v5, v12, v6}, LA6/c;->f(Landroid/webkit/WebView;LZ/k;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/t;LN/o;I)V

    const v4, -0x54d058b5

    invoke-virtual {v12, v4}, LN/o;->M(I)V

    sget-object v15, LN/k;->a:LN/P;

    if-nez p9, :cond_10

    move-object/from16 v4, p3

    move/from16 v0, p11

    move-object v1, v13

    :goto_e
    const/4 v7, 0x0

    goto/16 :goto_10

    :cond_10
    const v4, 0x588cc235

    .line 41
    invoke-virtual {v12, v4}, LN/o;->M(I)V

    .line 42
    invoke-virtual {v12, v2}, LN/o;->c(I)Z

    move-result v4

    .line 43
    invoke-virtual {v12}, LN/o;->F()Ljava/lang/Object;

    move-result-object v6

    if-nez v4, :cond_11

    if-ne v6, v15, :cond_13

    .line 44
    :cond_11
    new-instance v6, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/z;

    if-gez v2, :cond_12

    const/4 v4, 0x0

    goto :goto_f

    :cond_12
    move v4, v2

    .line 45
    :goto_f
    new-instance v7, Lef/u;

    invoke-direct {v7, v4}, Lef/u;-><init>(I)V

    .line 46
    invoke-direct {v6, v7}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/z;-><init>(Ljava/lang/Comparable;)V

    .line 47
    invoke-virtual {v12, v6}, LN/o;->U(Ljava/lang/Object;)V

    .line 48
    :cond_13
    move-object v4, v6

    check-cast v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/z;

    const/4 v7, 0x0

    .line 49
    invoke-virtual {v12, v7}, LN/o;->p(Z)V

    .line 50
    invoke-interface {v3}, LN/K0;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Boolean;

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    const v7, 0x588cf4ac

    .line 51
    invoke-virtual {v12, v7}, LN/o;->M(I)V

    invoke-virtual {v12, v3}, LN/o;->e(Ljava/lang/Object;)Z

    move-result v7

    invoke-virtual {v12, v0}, LN/o;->e(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v7, v8

    .line 52
    invoke-virtual {v12}, LN/o;->F()Ljava/lang/Object;

    move-result-object v8

    if-nez v7, :cond_14

    if-ne v8, v15, :cond_15

    .line 53
    :cond_14
    new-instance v8, LBf/g;

    const/16 v7, 0xb

    invoke-direct {v8, v7, v3, v0}, LBf/g;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 54
    invoke-virtual {v12, v8}, LN/o;->U(Ljava/lang/Object;)V

    .line 55
    :cond_15
    check-cast v8, Ltf/a;

    const/4 v7, 0x0

    .line 56
    invoke-virtual {v12, v7}, LN/o;->p(Z)V

    shl-int/lit8 v7, v17, 0x3

    const/high16 v9, 0x70000

    and-int/2addr v7, v9

    or-int/lit16 v7, v7, 0x186

    shl-int/lit8 v9, v17, 0x9

    const/high16 v18, 0x380000

    and-int v9, v9, v18

    or-int/2addr v7, v9

    shl-int/lit8 v9, v19, 0x15

    const/high16 v18, 0xe000000

    and-int v18, v9, v18

    or-int v7, v7, v18

    const/high16 v18, 0x70000000

    and-int v9, v9, v18

    or-int/2addr v7, v9

    move-object/from16 v9, p9

    move/from16 v0, p11

    move v5, v6

    move-object v6, v8

    move-object v1, v13

    move-object/from16 v8, p3

    move v13, v7

    move-object v7, v11

    move-object/from16 v11, p13

    .line 57
    invoke-static/range {v4 .. v13}, LFe/g;->h(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/z;ZLtf/a;Ltf/a;Ltf/l;Ltf/c;ZLHf/l;LN/o;I)V

    move-object v4, v8

    goto/16 :goto_e

    .line 58
    :goto_10
    invoke-virtual {v12, v7}, LN/o;->p(Z)V

    .line 59
    sget-object v5, LZ/a;->g:LZ/d;

    invoke-virtual {v14, v1, v5}, LE/q;->a(LZ/k;LZ/d;)LZ/k;

    move-result-object v1

    .line 60
    invoke-static {v1, v0}, Lcom/moloco/sdk/internal/publisher/H;->f0(LZ/k;F)LZ/k;

    move-result-object v1

    const v5, -0x6bb36fee

    .line 61
    invoke-virtual {v12, v5}, LN/o;->M(I)V

    .line 62
    invoke-static {}, Lcom/moloco/sdk/service_locator/i;->a()Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G0;

    move-result-object v5

    const v6, -0x2d86973a

    .line 63
    invoke-virtual {v12, v6}, LN/o;->M(I)V

    invoke-virtual {v12, v5}, LN/o;->e(Ljava/lang/Object;)Z

    move-result v6

    const-string v7, "https://cdn-f.adsmoloco.com/moloco-cdn/privacy.html"

    invoke-virtual {v12, v7}, LN/o;->e(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v6, v7

    .line 64
    invoke-virtual {v12}, LN/o;->F()Ljava/lang/Object;

    move-result-object v7

    if-nez v6, :cond_16

    if-ne v7, v15, :cond_17

    .line 65
    :cond_16
    new-instance v7, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/a;

    const/4 v6, 0x1

    invoke-direct {v7, v5, v6}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/a;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/G0;I)V

    .line 66
    invoke-virtual {v12, v7}, LN/o;->U(Ljava/lang/Object;)V

    .line 67
    :cond_17
    check-cast v7, Ltf/l;

    const/4 v5, 0x0

    .line 68
    invoke-virtual {v12, v5}, LN/o;->p(Z)V

    .line 69
    new-instance v6, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/f;

    invoke-direct {v6, v1, v7}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/f;-><init>(LZ/k;Ltf/l;)V

    const v1, -0x26e4e357

    invoke-static {v12, v1, v6}, LV/e;->b(LN/o;ILef/e;)LV/d;

    move-result-object v1

    .line 70
    invoke-virtual {v12, v5}, LN/o;->p(Z)V

    shr-int/lit8 v5, v17, 0x6

    and-int/lit8 v5, v5, 0x70

    or-int/lit8 v5, v5, 0x6

    .line 71
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    .line 72
    invoke-virtual {v1, v14, v4, v12, v5}, LV/d;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v1, 0x1

    const/4 v7, 0x0

    .line 73
    invoke-static {v12, v7, v7, v1, v7}, Lwg/b;->e(LN/o;ZZZZ)V

    .line 74
    invoke-virtual {v12, v7}, LN/o;->p(Z)V

    move-object/from16 v7, v16

    .line 75
    :goto_11
    invoke-virtual {v12}, LN/o;->r()LN/i0;

    move-result-object v1

    if-eqz v1, :cond_18

    new-instance v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/g;

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-wide/from16 v8, p7

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move/from16 v12, p11

    move/from16 v13, p12

    move-object/from16 v14, p13

    move/from16 v15, p15

    move-object/from16 v20, v1

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v15}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/webview/g;-><init>(Landroid/webkit/WebView;ILN/V;Ltf/l;Ltf/a;Ltf/a;LZ/k;JLtf/c;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/t;FZLHf/l;I)V

    move-object/from16 v1, v20

    .line 76
    iput-object v0, v1, LN/i0;->d:Ltf/p;

    :cond_18
    return-void
.end method
