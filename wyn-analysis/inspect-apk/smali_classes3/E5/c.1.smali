.class public final synthetic LE5/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(LU1/z;IZ)V
    .locals 0

    .line 1
    const/4 p3, 0x2

    iput p3, p0, LE5/c;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LE5/c;->c:Ljava/lang/Object;

    iput p2, p0, LE5/c;->b:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;II)V
    .locals 0

    .line 2
    iput p3, p0, LE5/c;->a:I

    iput-object p1, p0, LE5/c;->c:Ljava/lang/Object;

    iput p2, p0, LE5/c;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 14

    .line 1
    const-string v0, "AudioFocusManager"

    .line 2
    .line 3
    const-string v1, "Unknown focus change type: "

    .line 4
    .line 5
    const/4 v2, -0x1

    .line 6
    const/4 v3, -0x2

    .line 7
    const/4 v4, -0x3

    .line 8
    const/4 v5, 0x4

    .line 9
    const/4 v6, 0x0

    .line 10
    const/4 v7, 0x3

    .line 11
    const/4 v8, 0x2

    .line 12
    const/4 v9, 0x0

    .line 13
    const/4 v10, 0x1

    .line 14
    iget v11, p0, LE5/c;->b:I

    .line 15
    .line 16
    iget-object v12, p0, LE5/c;->c:Ljava/lang/Object;

    .line 17
    .line 18
    iget v13, p0, LE5/c;->a:I

    .line 19
    .line 20
    packed-switch v13, :pswitch_data_0

    .line 21
    .line 22
    .line 23
    check-cast v12, Lmd/J;

    .line 24
    .line 25
    invoke-static {v11}, LA/f;->f(I)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    sget-object v1, Lyc/t;->b:Lyc/t;

    .line 30
    .line 31
    if-eqz v0, :cond_3

    .line 32
    .line 33
    if-eq v0, v10, :cond_2

    .line 34
    .line 35
    if-eq v0, v8, :cond_1

    .line 36
    .line 37
    if-eq v0, v7, :cond_0

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    sget-object v1, Lyc/t;->e:Lyc/t;

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    sget-object v1, Lyc/t;->d:Lyc/t;

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    sget-object v1, Lyc/t;->c:Lyc/t;

    .line 47
    .line 48
    :cond_3
    :goto_0
    new-instance v0, La2/k;

    .line 49
    .line 50
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 51
    .line 52
    .line 53
    iget-object v2, v12, Lmd/J;->b:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v2, Lcom/google/android/gms/ads/nativead/l;

    .line 56
    .line 57
    new-instance v3, LVa/X7;

    .line 58
    .line 59
    sget-object v4, Lyc/p;->d:Lyc/p;

    .line 60
    .line 61
    const-string v5, "dev.flutter.pigeon.camera_android.CameraGlobalEventApi.deviceOrientationChanged"

    .line 62
    .line 63
    iget-object v2, v2, Lcom/google/android/gms/ads/nativead/l;->b:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v2, Luc/f;

    .line 66
    .line 67
    invoke-direct {v3, v2, v4, v6, v5}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    new-instance v2, Ljava/util/ArrayList;

    .line 71
    .line 72
    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 77
    .line 78
    .line 79
    new-instance v1, Lm9/B;

    .line 80
    .line 81
    invoke-direct {v1, v0}, Lm9/B;-><init>(La2/k;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v3, v2, v1}, LVa/X7;->m(Ljava/lang/Object;Luc/c;)V

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    :pswitch_0
    check-cast v12, Lr9/l;

    .line 89
    .line 90
    iget-object v0, v12, Lr9/l;->k:Landroid/util/SparseArray;

    .line 91
    .line 92
    invoke-virtual {v0, v11}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    check-cast v1, Lr9/S;

    .line 97
    .line 98
    if-eqz v1, :cond_4

    .line 99
    .line 100
    move v2, v10

    .line 101
    goto :goto_1

    .line 102
    :cond_4
    move v2, v9

    .line 103
    :goto_1
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    new-array v4, v10, [Ljava/lang/Object;

    .line 108
    .line 109
    aput-object v3, v4, v9

    .line 110
    .line 111
    const-string v3, "Tried to release nonexistent target: %s"

    .line 112
    .line 113
    invoke-static {v2, v3, v4}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    iget-object v2, v12, Lr9/l;->h:LY2/B;

    .line 117
    .line 118
    invoke-virtual {v2, v11}, LY2/B;->C(I)Lc9/d;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    invoke-virtual {v2}, Lc9/d;->iterator()Ljava/util/Iterator;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    :goto_2
    move-object v3, v2

    .line 127
    check-cast v3, LA7/v;

    .line 128
    .line 129
    iget-object v4, v3, LA7/v;->b:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast v4, Ljava/util/Iterator;

    .line 132
    .line 133
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 134
    .line 135
    .line 136
    move-result v4

    .line 137
    iget-object v5, v12, Lr9/l;->a:Lp7/b;

    .line 138
    .line 139
    if-eqz v4, :cond_5

    .line 140
    .line 141
    invoke-virtual {v3}, LA7/v;->next()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v3

    .line 145
    check-cast v3, Ls9/h;

    .line 146
    .line 147
    invoke-virtual {v5}, Lp7/b;->D()Lr9/z;

    .line 148
    .line 149
    .line 150
    move-result-object v4

    .line 151
    invoke-interface {v4, v3}, Lr9/z;->g(Ls9/h;)V

    .line 152
    .line 153
    .line 154
    goto :goto_2

    .line 155
    :cond_5
    invoke-virtual {v5}, Lp7/b;->D()Lr9/z;

    .line 156
    .line 157
    .line 158
    move-result-object v2

    .line 159
    invoke-interface {v2, v1}, Lr9/z;->l(Lr9/S;)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v0, v11}, Landroid/util/SparseArray;->remove(I)V

    .line 163
    .line 164
    .line 165
    iget-object v0, v12, Lr9/l;->l:Ljava/util/HashMap;

    .line 166
    .line 167
    iget-object v1, v1, Lr9/S;->a:Lp9/A;

    .line 168
    .line 169
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    return-void

    .line 173
    :pswitch_1
    and-int/lit8 v0, v11, 0x4

    .line 174
    .line 175
    check-cast v12, Lio/flutter/plugin/platform/d;

    .line 176
    .line 177
    const-string v1, "SystemChrome.systemUIChange"

    .line 178
    .line 179
    iget-object v2, v12, Lio/flutter/plugin/platform/d;->b:LN2/j;

    .line 180
    .line 181
    if-nez v0, :cond_6

    .line 182
    .line 183
    iget-object v0, v2, LN2/j;->d:Ljava/lang/Object;

    .line 184
    .line 185
    check-cast v0, Lba/a;

    .line 186
    .line 187
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 188
    .line 189
    .line 190
    new-array v2, v10, [Ljava/lang/Boolean;

    .line 191
    .line 192
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 193
    .line 194
    aput-object v3, v2, v9

    .line 195
    .line 196
    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 197
    .line 198
    .line 199
    move-result-object v2

    .line 200
    iget-object v0, v0, Lba/a;->b:Ljava/lang/Object;

    .line 201
    .line 202
    check-cast v0, Luc/r;

    .line 203
    .line 204
    invoke-virtual {v0, v1, v2, v6}, Luc/r;->a(Ljava/lang/String;Ljava/lang/Object;Luc/q;)V

    .line 205
    .line 206
    .line 207
    goto :goto_3

    .line 208
    :cond_6
    iget-object v0, v2, LN2/j;->d:Ljava/lang/Object;

    .line 209
    .line 210
    check-cast v0, Lba/a;

    .line 211
    .line 212
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 213
    .line 214
    .line 215
    new-array v2, v10, [Ljava/lang/Boolean;

    .line 216
    .line 217
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 218
    .line 219
    aput-object v3, v2, v9

    .line 220
    .line 221
    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 222
    .line 223
    .line 224
    move-result-object v2

    .line 225
    iget-object v0, v0, Lba/a;->b:Ljava/lang/Object;

    .line 226
    .line 227
    check-cast v0, Luc/r;

    .line 228
    .line 229
    invoke-virtual {v0, v1, v2, v6}, Luc/r;->a(Ljava/lang/String;Ljava/lang/Object;Luc/q;)V

    .line 230
    .line 231
    .line 232
    :goto_3
    return-void

    .line 233
    :pswitch_2
    check-cast v12, Lcom/google/android/material/sidesheet/SideSheetBehavior;

    .line 234
    .line 235
    iget-object v0, v12, Lcom/google/android/material/sidesheet/SideSheetBehavior;->o:Ljava/lang/ref/WeakReference;

    .line 236
    .line 237
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    check-cast v0, Landroid/view/View;

    .line 242
    .line 243
    if-eqz v0, :cond_7

    .line 244
    .line 245
    invoke-virtual {v12, v0, v11, v9}, Lcom/google/android/material/sidesheet/SideSheetBehavior;->t(Landroid/view/View;IZ)V

    .line 246
    .line 247
    .line 248
    :cond_7
    return-void

    .line 249
    :pswitch_3
    check-cast v12, Lcom/applovin/mediation/nativeAds/adPlacer/MaxAdPlacer;

    .line 250
    .line 251
    invoke-static {v12, v11}, Lcom/applovin/mediation/nativeAds/adPlacer/MaxAdPlacer;->a(Lcom/applovin/mediation/nativeAds/adPlacer/MaxAdPlacer;I)V

    .line 252
    .line 253
    .line 254
    return-void

    .line 255
    :pswitch_4
    check-cast v12, Lcom/applovin/impl/sdk/i$a;

    .line 256
    .line 257
    invoke-static {v12, v11}, Lcom/applovin/impl/sdk/i;->b(Lcom/applovin/impl/sdk/i$a;I)V

    .line 258
    .line 259
    .line 260
    return-void

    .line 261
    :pswitch_5
    check-cast v12, Lcom/applovin/impl/adview/a;

    .line 262
    .line 263
    invoke-static {v12, v11}, Lcom/applovin/impl/adview/a;->r(Lcom/applovin/impl/adview/a;I)V

    .line 264
    .line 265
    .line 266
    return-void

    .line 267
    :pswitch_6
    check-cast v12, La1/b;

    .line 268
    .line 269
    invoke-virtual {v12, v11}, La1/b;->j(I)V

    .line 270
    .line 271
    .line 272
    return-void

    .line 273
    :pswitch_7
    check-cast v12, LU1/z;

    .line 274
    .line 275
    iget-object v0, v12, LU1/z;->a:[LU1/W;

    .line 276
    .line 277
    aget-object v0, v0, v11

    .line 278
    .line 279
    invoke-interface {v0}, LU1/W;->f()I

    .line 280
    .line 281
    .line 282
    iget-object v0, v12, LU1/z;->x:LV1/d;

    .line 283
    .line 284
    invoke-virtual {v0}, LV1/d;->K()LV1/a;

    .line 285
    .line 286
    .line 287
    move-result-object v1

    .line 288
    new-instance v2, LV1/b;

    .line 289
    .line 290
    invoke-direct {v2, v8}, LV1/b;-><init>(I)V

    .line 291
    .line 292
    .line 293
    const/16 v3, 0x409

    .line 294
    .line 295
    invoke-virtual {v0, v1, v3, v2}, LV1/d;->L(LV1/a;ILQ1/g;)V

    .line 296
    .line 297
    .line 298
    return-void

    .line 299
    :pswitch_8
    check-cast v12, LE5/d;

    .line 300
    .line 301
    iget-object v6, v12, LE5/d;->c:Ljava/lang/Object;

    .line 302
    .line 303
    check-cast v6, LU1/c;

    .line 304
    .line 305
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 306
    .line 307
    .line 308
    if-eq v11, v4, :cond_b

    .line 309
    .line 310
    if-eq v11, v3, :cond_b

    .line 311
    .line 312
    if-eq v11, v2, :cond_9

    .line 313
    .line 314
    if-eq v11, v10, :cond_8

    .line 315
    .line 316
    invoke-static {v11, v1, v0}, LN0/a;->o(ILjava/lang/String;Ljava/lang/String;)V

    .line 317
    .line 318
    .line 319
    goto :goto_6

    .line 320
    :cond_8
    invoke-virtual {v6, v8}, LU1/c;->c(I)V

    .line 321
    .line 322
    .line 323
    iget-object v0, v6, LU1/c;->c:LU1/r;

    .line 324
    .line 325
    if-eqz v0, :cond_10

    .line 326
    .line 327
    iget-object v0, v0, LU1/r;->a:LU1/u;

    .line 328
    .line 329
    invoke-virtual {v0}, LU1/u;->s0()Z

    .line 330
    .line 331
    .line 332
    move-result v1

    .line 333
    invoke-virtual {v0, v10, v10, v1}, LU1/u;->P0(IIZ)V

    .line 334
    .line 335
    .line 336
    goto :goto_6

    .line 337
    :cond_9
    iget-object v0, v6, LU1/c;->c:LU1/r;

    .line 338
    .line 339
    if-eqz v0, :cond_a

    .line 340
    .line 341
    iget-object v0, v0, LU1/r;->a:LU1/u;

    .line 342
    .line 343
    invoke-virtual {v0}, LU1/u;->s0()Z

    .line 344
    .line 345
    .line 346
    move-result v1

    .line 347
    invoke-virtual {v0, v2, v8, v1}, LU1/u;->P0(IIZ)V

    .line 348
    .line 349
    .line 350
    :cond_a
    invoke-virtual {v6}, LU1/c;->a()V

    .line 351
    .line 352
    .line 353
    invoke-virtual {v6, v10}, LU1/c;->c(I)V

    .line 354
    .line 355
    .line 356
    goto :goto_6

    .line 357
    :cond_b
    if-eq v11, v3, :cond_e

    .line 358
    .line 359
    iget-object v0, v6, LU1/c;->d:LN1/c;

    .line 360
    .line 361
    if-eqz v0, :cond_c

    .line 362
    .line 363
    iget v0, v0, LN1/c;->a:I

    .line 364
    .line 365
    if-ne v0, v10, :cond_c

    .line 366
    .line 367
    move v0, v10

    .line 368
    goto :goto_4

    .line 369
    :cond_c
    move v0, v9

    .line 370
    :goto_4
    if-eqz v0, :cond_d

    .line 371
    .line 372
    goto :goto_5

    .line 373
    :cond_d
    invoke-virtual {v6, v5}, LU1/c;->c(I)V

    .line 374
    .line 375
    .line 376
    goto :goto_6

    .line 377
    :cond_e
    :goto_5
    iget-object v0, v6, LU1/c;->c:LU1/r;

    .line 378
    .line 379
    if-eqz v0, :cond_f

    .line 380
    .line 381
    iget-object v0, v0, LU1/r;->a:LU1/u;

    .line 382
    .line 383
    invoke-virtual {v0}, LU1/u;->s0()Z

    .line 384
    .line 385
    .line 386
    move-result v1

    .line 387
    invoke-virtual {v0, v9, v10, v1}, LU1/u;->P0(IIZ)V

    .line 388
    .line 389
    .line 390
    :cond_f
    invoke-virtual {v6, v7}, LU1/c;->c(I)V

    .line 391
    .line 392
    .line 393
    :cond_10
    :goto_6
    return-void

    .line 394
    :pswitch_9
    check-cast v12, LE5/d;

    .line 395
    .line 396
    iget-object v5, v12, LE5/d;->c:Ljava/lang/Object;

    .line 397
    .line 398
    check-cast v5, LE5/e;

    .line 399
    .line 400
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 401
    .line 402
    .line 403
    if-eq v11, v4, :cond_15

    .line 404
    .line 405
    if-eq v11, v3, :cond_15

    .line 406
    .line 407
    if-eq v11, v2, :cond_12

    .line 408
    .line 409
    if-eq v11, v10, :cond_11

    .line 410
    .line 411
    invoke-static {v11, v1, v0}, LA7/p0;->u(ILjava/lang/String;Ljava/lang/String;)V

    .line 412
    .line 413
    .line 414
    goto :goto_8

    .line 415
    :cond_11
    invoke-virtual {v5, v10}, LE5/e;->b(I)V

    .line 416
    .line 417
    .line 418
    iget-object v0, v5, LE5/e;->c:LE5/F;

    .line 419
    .line 420
    if-eqz v0, :cond_19

    .line 421
    .line 422
    iget-object v0, v0, LE5/F;->a:LE5/I;

    .line 423
    .line 424
    invoke-virtual {v0}, LE5/I;->s0()Z

    .line 425
    .line 426
    .line 427
    move-result v1

    .line 428
    invoke-virtual {v0, v10, v10, v1}, LE5/I;->N0(IIZ)V

    .line 429
    .line 430
    .line 431
    goto :goto_8

    .line 432
    :cond_12
    iget-object v0, v5, LE5/e;->c:LE5/F;

    .line 433
    .line 434
    if-eqz v0, :cond_14

    .line 435
    .line 436
    iget-object v0, v0, LE5/F;->a:LE5/I;

    .line 437
    .line 438
    invoke-virtual {v0}, LE5/I;->s0()Z

    .line 439
    .line 440
    .line 441
    move-result v1

    .line 442
    if-eqz v1, :cond_13

    .line 443
    .line 444
    goto :goto_7

    .line 445
    :cond_13
    move v8, v10

    .line 446
    :goto_7
    invoke-virtual {v0, v2, v8, v1}, LE5/I;->N0(IIZ)V

    .line 447
    .line 448
    .line 449
    :cond_14
    invoke-virtual {v5}, LE5/e;->a()V

    .line 450
    .line 451
    .line 452
    goto :goto_8

    .line 453
    :cond_15
    if-eq v11, v3, :cond_16

    .line 454
    .line 455
    invoke-virtual {v5, v7}, LE5/e;->b(I)V

    .line 456
    .line 457
    .line 458
    goto :goto_8

    .line 459
    :cond_16
    iget-object v0, v5, LE5/e;->c:LE5/F;

    .line 460
    .line 461
    if-eqz v0, :cond_18

    .line 462
    .line 463
    iget-object v0, v0, LE5/F;->a:LE5/I;

    .line 464
    .line 465
    invoke-virtual {v0}, LE5/I;->s0()Z

    .line 466
    .line 467
    .line 468
    move-result v1

    .line 469
    if-eqz v1, :cond_17

    .line 470
    .line 471
    move v10, v8

    .line 472
    :cond_17
    invoke-virtual {v0, v9, v10, v1}, LE5/I;->N0(IIZ)V

    .line 473
    .line 474
    .line 475
    :cond_18
    invoke-virtual {v5, v8}, LE5/e;->b(I)V

    .line 476
    .line 477
    .line 478
    :cond_19
    :goto_8
    return-void

    .line 479
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
