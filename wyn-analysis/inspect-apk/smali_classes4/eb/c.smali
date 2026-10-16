.class public final Leb/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luc/p;
.implements LN1/H;


# static fields
.field public static final F:Ljava/util/Random;


# instance fields
.field public A:Ljava/lang/String;

.field public B:Ljava/lang/Integer;

.field public final C:Landroid/os/Handler;

.field public final D:LA7/V;

.field public E:I

.field public final a:Landroid/content/Context;

.field public final b:Leb/d;

.field public final c:Leb/d;

.field public d:J

.field public e:J

.field public f:J

.field public g:Ljava/lang/Long;

.field public h:Ltc/g;

.field public i:Ltc/g;

.field public j:Ltc/g;

.field public final k:Ljava/util/HashMap;

.field public l:LF2/c;

.field public m:LF2/b;

.field public n:LN1/c;

.field public final o:LU1/h;

.field public final p:LN1/Q;

.field public final q:Z

.field public final r:LU1/f;

.field public final s:Ljava/util/List;

.field public final t:Ljava/util/ArrayList;

.field public final u:Ljava/util/HashMap;

.field public v:I

.field public w:Ljava/util/HashMap;

.field public x:LU1/u;

.field public y:Ljava/lang/Integer;

.field public z:Ljava/lang/Integer;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/Random;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Leb/c;->F:Ljava/util/Random;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Luc/f;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Ljava/util/Map;Ljava/lang/Boolean;Z)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    move-object/from16 v3, p4

    .line 8
    .line 9
    move-object/from16 v4, p6

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    new-instance v5, Ljava/util/HashMap;

    .line 15
    .line 16
    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object v5, v0, Leb/c;->k:Ljava/util/HashMap;

    .line 20
    .line 21
    new-instance v5, Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object v5, v0, Leb/c;->t:Ljava/util/ArrayList;

    .line 27
    .line 28
    new-instance v5, Ljava/util/HashMap;

    .line 29
    .line 30
    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object v5, v0, Leb/c;->u:Ljava/util/HashMap;

    .line 34
    .line 35
    const/4 v5, 0x0

    .line 36
    iput v5, v0, Leb/c;->v:I

    .line 37
    .line 38
    new-instance v6, Landroid/os/Handler;

    .line 39
    .line 40
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 41
    .line 42
    .line 43
    move-result-object v7

    .line 44
    invoke-direct {v6, v7}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 45
    .line 46
    .line 47
    iput-object v6, v0, Leb/c;->C:Landroid/os/Handler;

    .line 48
    .line 49
    new-instance v6, LA7/V;

    .line 50
    .line 51
    const/16 v7, 0x1d

    .line 52
    .line 53
    invoke-direct {v6, v0, v7}, LA7/V;-><init>(Ljava/lang/Object;I)V

    .line 54
    .line 55
    .line 56
    iput-object v6, v0, Leb/c;->D:LA7/V;

    .line 57
    .line 58
    move-object/from16 v6, p1

    .line 59
    .line 60
    iput-object v6, v0, Leb/c;->a:Landroid/content/Context;

    .line 61
    .line 62
    move-object/from16 v6, p5

    .line 63
    .line 64
    iput-object v6, v0, Leb/c;->s:Ljava/util/List;

    .line 65
    .line 66
    move/from16 v6, p8

    .line 67
    .line 68
    iput-boolean v6, v0, Leb/c;->q:Z

    .line 69
    .line 70
    const/4 v6, 0x1

    .line 71
    if-eqz v4, :cond_0

    .line 72
    .line 73
    new-instance v7, LN1/P;

    .line 74
    .line 75
    invoke-direct {v7}, LN1/P;-><init>()V

    .line 76
    .line 77
    .line 78
    const-string v8, "isGaplessSupportRequired"

    .line 79
    .line 80
    invoke-interface {v4, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v8

    .line 84
    check-cast v8, Ljava/lang/Boolean;

    .line 85
    .line 86
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 87
    .line 88
    .line 89
    move-result v8

    .line 90
    iput-boolean v8, v7, LN1/P;->b:Z

    .line 91
    .line 92
    const-string v8, "isSpeedChangeSupportRequired"

    .line 93
    .line 94
    invoke-interface {v4, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v8

    .line 98
    check-cast v8, Ljava/lang/Boolean;

    .line 99
    .line 100
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 101
    .line 102
    .line 103
    move-result v8

    .line 104
    iput-boolean v8, v7, LN1/P;->c:Z

    .line 105
    .line 106
    const-string v8, "audioOffloadMode"

    .line 107
    .line 108
    invoke-interface {v4, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v4

    .line 112
    check-cast v4, Ljava/lang/Integer;

    .line 113
    .line 114
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 115
    .line 116
    .line 117
    move-result v4

    .line 118
    iput v4, v7, LN1/P;->a:I

    .line 119
    .line 120
    new-instance v4, LN1/Q;

    .line 121
    .line 122
    invoke-direct {v4, v7}, LN1/Q;-><init>(LN1/P;)V

    .line 123
    .line 124
    .line 125
    iput-object v4, v0, Leb/c;->p:LN1/Q;

    .line 126
    .line 127
    goto :goto_0

    .line 128
    :cond_0
    invoke-virtual/range {p7 .. p7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 129
    .line 130
    .line 131
    move-result v4

    .line 132
    new-instance v7, LN1/P;

    .line 133
    .line 134
    invoke-direct {v7}, LN1/P;-><init>()V

    .line 135
    .line 136
    .line 137
    invoke-virtual/range {p7 .. p7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 138
    .line 139
    .line 140
    move-result v8

    .line 141
    xor-int/2addr v8, v6

    .line 142
    iput-boolean v8, v7, LN1/P;->b:Z

    .line 143
    .line 144
    invoke-virtual/range {p7 .. p7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 145
    .line 146
    .line 147
    move-result v8

    .line 148
    xor-int/2addr v8, v6

    .line 149
    iput-boolean v8, v7, LN1/P;->c:Z

    .line 150
    .line 151
    iput v4, v7, LN1/P;->a:I

    .line 152
    .line 153
    new-instance v4, LN1/Q;

    .line 154
    .line 155
    invoke-direct {v4, v7}, LN1/Q;-><init>(LN1/P;)V

    .line 156
    .line 157
    .line 158
    iput-object v4, v0, Leb/c;->p:LN1/Q;

    .line 159
    .line 160
    :goto_0
    new-instance v4, Luc/r;

    .line 161
    .line 162
    const-string v7, "com.ryanheise.just_audio.methods."

    .line 163
    .line 164
    invoke-static {v7, v2}, LR8/v;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v7

    .line 168
    invoke-direct {v4, v1, v7}, Luc/r;-><init>(Luc/f;Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v4, v0}, Luc/r;->b(Luc/p;)V

    .line 172
    .line 173
    .line 174
    new-instance v4, Leb/d;

    .line 175
    .line 176
    const-string v7, "com.ryanheise.just_audio.events."

    .line 177
    .line 178
    invoke-static {v7, v2}, LR8/v;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v7

    .line 182
    invoke-direct {v4, v1, v7}, Leb/d;-><init>(Luc/f;Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    iput-object v4, v0, Leb/c;->b:Leb/d;

    .line 186
    .line 187
    new-instance v4, Leb/d;

    .line 188
    .line 189
    const-string v7, "com.ryanheise.just_audio.data."

    .line 190
    .line 191
    invoke-static {v7, v2}, LR8/v;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v2

    .line 195
    invoke-direct {v4, v1, v2}, Leb/d;-><init>(Luc/f;Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    iput-object v4, v0, Leb/c;->c:Leb/d;

    .line 199
    .line 200
    iput v6, v0, Leb/c;->E:I

    .line 201
    .line 202
    if-eqz v3, :cond_a

    .line 203
    .line 204
    const-string v1, "androidLoadControl"

    .line 205
    .line 206
    invoke-interface {v3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v1

    .line 210
    check-cast v1, Ljava/util/Map;

    .line 211
    .line 212
    const-wide/16 v7, 0x3e8

    .line 213
    .line 214
    if-eqz v1, :cond_2

    .line 215
    .line 216
    const-string v2, "minBufferDuration"

    .line 217
    .line 218
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v2

    .line 222
    invoke-static {v2}, Leb/c;->Q(Ljava/lang/Object;)Ljava/lang/Long;

    .line 223
    .line 224
    .line 225
    move-result-object v2

    .line 226
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 227
    .line 228
    .line 229
    move-result-wide v9

    .line 230
    div-long/2addr v9, v7

    .line 231
    long-to-int v13, v9

    .line 232
    const-string v2, "maxBufferDuration"

    .line 233
    .line 234
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v2

    .line 238
    invoke-static {v2}, Leb/c;->Q(Ljava/lang/Object;)Ljava/lang/Long;

    .line 239
    .line 240
    .line 241
    move-result-object v2

    .line 242
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 243
    .line 244
    .line 245
    move-result-wide v9

    .line 246
    div-long/2addr v9, v7

    .line 247
    long-to-int v14, v9

    .line 248
    const-string v2, "bufferForPlaybackDuration"

    .line 249
    .line 250
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v2

    .line 254
    invoke-static {v2}, Leb/c;->Q(Ljava/lang/Object;)Ljava/lang/Long;

    .line 255
    .line 256
    .line 257
    move-result-object v2

    .line 258
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 259
    .line 260
    .line 261
    move-result-wide v9

    .line 262
    div-long/2addr v9, v7

    .line 263
    long-to-int v15, v9

    .line 264
    const-string v2, "bufferForPlaybackAfterRebufferDuration"

    .line 265
    .line 266
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object v2

    .line 270
    invoke-static {v2}, Leb/c;->Q(Ljava/lang/Object;)Ljava/lang/Long;

    .line 271
    .line 272
    .line 273
    move-result-object v2

    .line 274
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 275
    .line 276
    .line 277
    move-result-wide v9

    .line 278
    div-long/2addr v9, v7

    .line 279
    long-to-int v2, v9

    .line 280
    const-string v4, "bufferForPlaybackMs"

    .line 281
    .line 282
    const-string v9, "0"

    .line 283
    .line 284
    invoke-static {v15, v5, v4, v9}, LU1/h;->a(IILjava/lang/String;Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    const-string v10, "bufferForPlaybackAfterRebufferMs"

    .line 288
    .line 289
    invoke-static {v2, v5, v10, v9}, LU1/h;->a(IILjava/lang/String;Ljava/lang/String;)V

    .line 290
    .line 291
    .line 292
    const-string v11, "minBufferMs"

    .line 293
    .line 294
    invoke-static {v13, v15, v11, v4}, LU1/h;->a(IILjava/lang/String;Ljava/lang/String;)V

    .line 295
    .line 296
    .line 297
    invoke-static {v13, v2, v11, v10}, LU1/h;->a(IILjava/lang/String;Ljava/lang/String;)V

    .line 298
    .line 299
    .line 300
    const-string v4, "maxBufferMs"

    .line 301
    .line 302
    invoke-static {v14, v13, v4, v11}, LU1/h;->a(IILjava/lang/String;Ljava/lang/String;)V

    .line 303
    .line 304
    .line 305
    const-string v4, "prioritizeTimeOverSizeThresholds"

    .line 306
    .line 307
    invoke-interface {v1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v4

    .line 311
    check-cast v4, Ljava/lang/Boolean;

    .line 312
    .line 313
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 314
    .line 315
    .line 316
    move-result v18

    .line 317
    const-string v4, "backBufferDuration"

    .line 318
    .line 319
    invoke-interface {v1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    move-result-object v4

    .line 323
    invoke-static {v4}, Leb/c;->Q(Ljava/lang/Object;)Ljava/lang/Long;

    .line 324
    .line 325
    .line 326
    move-result-object v4

    .line 327
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 328
    .line 329
    .line 330
    move-result-wide v10

    .line 331
    div-long/2addr v10, v7

    .line 332
    long-to-int v4, v10

    .line 333
    const-string v10, "backBufferDurationMs"

    .line 334
    .line 335
    invoke-static {v4, v5, v10, v9}, LU1/h;->a(IILjava/lang/String;Ljava/lang/String;)V

    .line 336
    .line 337
    .line 338
    const-string v9, "targetBufferBytes"

    .line 339
    .line 340
    invoke-interface {v1, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 341
    .line 342
    .line 343
    move-result-object v10

    .line 344
    if-eqz v10, :cond_1

    .line 345
    .line 346
    invoke-interface {v1, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 347
    .line 348
    .line 349
    move-result-object v1

    .line 350
    check-cast v1, Ljava/lang/Integer;

    .line 351
    .line 352
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 353
    .line 354
    .line 355
    move-result v1

    .line 356
    :goto_1
    move/from16 v17, v1

    .line 357
    .line 358
    goto :goto_2

    .line 359
    :cond_1
    const/4 v1, -0x1

    .line 360
    goto :goto_1

    .line 361
    :goto_2
    new-instance v12, Lo2/e;

    .line 362
    .line 363
    invoke-direct {v12, v5}, Lo2/e;-><init>(I)V

    .line 364
    .line 365
    .line 366
    new-instance v11, LU1/h;

    .line 367
    .line 368
    move/from16 v16, v2

    .line 369
    .line 370
    move/from16 v19, v4

    .line 371
    .line 372
    invoke-direct/range {v11 .. v19}, LU1/h;-><init>(Lo2/e;IIIIIZI)V

    .line 373
    .line 374
    .line 375
    iput-object v11, v0, Leb/c;->o:LU1/h;

    .line 376
    .line 377
    :cond_2
    const-string v1, "androidLivePlaybackSpeedControl"

    .line 378
    .line 379
    invoke-interface {v3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 380
    .line 381
    .line 382
    move-result-object v1

    .line 383
    check-cast v1, Ljava/util/Map;

    .line 384
    .line 385
    if-eqz v1, :cond_a

    .line 386
    .line 387
    sget v2, LQ1/x;->a:I

    .line 388
    .line 389
    const-string v2, "fallbackMinPlaybackSpeed"

    .line 390
    .line 391
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 392
    .line 393
    .line 394
    move-result-object v2

    .line 395
    check-cast v2, Ljava/lang/Double;

    .line 396
    .line 397
    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    .line 398
    .line 399
    .line 400
    move-result-wide v2

    .line 401
    double-to-float v10, v2

    .line 402
    const/4 v2, 0x0

    .line 403
    cmpg-float v3, v2, v10

    .line 404
    .line 405
    const/high16 v4, 0x3f800000    # 1.0f

    .line 406
    .line 407
    if-gez v3, :cond_3

    .line 408
    .line 409
    cmpg-float v3, v10, v4

    .line 410
    .line 411
    if-gtz v3, :cond_3

    .line 412
    .line 413
    move v3, v6

    .line 414
    goto :goto_3

    .line 415
    :cond_3
    move v3, v5

    .line 416
    :goto_3
    invoke-static {v3}, LQ1/k;->c(Z)V

    .line 417
    .line 418
    .line 419
    const-string v3, "fallbackMaxPlaybackSpeed"

    .line 420
    .line 421
    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 422
    .line 423
    .line 424
    move-result-object v3

    .line 425
    check-cast v3, Ljava/lang/Double;

    .line 426
    .line 427
    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    .line 428
    .line 429
    .line 430
    move-result-wide v11

    .line 431
    double-to-float v11, v11

    .line 432
    cmpl-float v3, v11, v4

    .line 433
    .line 434
    if-ltz v3, :cond_4

    .line 435
    .line 436
    move v3, v6

    .line 437
    goto :goto_4

    .line 438
    :cond_4
    move v3, v5

    .line 439
    :goto_4
    invoke-static {v3}, LQ1/k;->c(Z)V

    .line 440
    .line 441
    .line 442
    const-string v3, "minUpdateInterval"

    .line 443
    .line 444
    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 445
    .line 446
    .line 447
    move-result-object v3

    .line 448
    invoke-static {v3}, Leb/c;->Q(Ljava/lang/Object;)Ljava/lang/Long;

    .line 449
    .line 450
    .line 451
    move-result-object v3

    .line 452
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 453
    .line 454
    .line 455
    move-result-wide v12

    .line 456
    div-long/2addr v12, v7

    .line 457
    const-wide/16 v14, 0x0

    .line 458
    .line 459
    cmp-long v3, v12, v14

    .line 460
    .line 461
    if-lez v3, :cond_5

    .line 462
    .line 463
    move v3, v6

    .line 464
    goto :goto_5

    .line 465
    :cond_5
    move v3, v5

    .line 466
    :goto_5
    invoke-static {v3}, LQ1/k;->c(Z)V

    .line 467
    .line 468
    .line 469
    const-string v3, "proportionalControlFactor"

    .line 470
    .line 471
    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 472
    .line 473
    .line 474
    move-result-object v3

    .line 475
    check-cast v3, Ljava/lang/Double;

    .line 476
    .line 477
    move/from16 p1, v2

    .line 478
    .line 479
    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    .line 480
    .line 481
    .line 482
    move-result-wide v2

    .line 483
    double-to-float v2, v2

    .line 484
    cmpl-float v3, v2, p1

    .line 485
    .line 486
    if-lez v3, :cond_6

    .line 487
    .line 488
    move v3, v6

    .line 489
    goto :goto_6

    .line 490
    :cond_6
    move v3, v5

    .line 491
    :goto_6
    invoke-static {v3}, LQ1/k;->c(Z)V

    .line 492
    .line 493
    .line 494
    const v3, 0x49742400    # 1000000.0f

    .line 495
    .line 496
    .line 497
    div-float/2addr v2, v3

    .line 498
    const-string v3, "maxLiveOffsetErrorForUnitSpeed"

    .line 499
    .line 500
    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 501
    .line 502
    .line 503
    move-result-object v3

    .line 504
    invoke-static {v3}, Leb/c;->Q(Ljava/lang/Object;)Ljava/lang/Long;

    .line 505
    .line 506
    .line 507
    move-result-object v3

    .line 508
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 509
    .line 510
    .line 511
    move-result-wide v16

    .line 512
    div-long v16, v16, v7

    .line 513
    .line 514
    cmp-long v3, v16, v14

    .line 515
    .line 516
    if-lez v3, :cond_7

    .line 517
    .line 518
    move v3, v6

    .line 519
    goto :goto_7

    .line 520
    :cond_7
    move v3, v5

    .line 521
    :goto_7
    invoke-static {v3}, LQ1/k;->c(Z)V

    .line 522
    .line 523
    .line 524
    invoke-static/range {v16 .. v17}, LQ1/x;->K(J)J

    .line 525
    .line 526
    .line 527
    move-result-wide v16

    .line 528
    const-string v3, "targetLiveOffsetIncrementOnRebuffer"

    .line 529
    .line 530
    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 531
    .line 532
    .line 533
    move-result-object v3

    .line 534
    invoke-static {v3}, Leb/c;->Q(Ljava/lang/Object;)Ljava/lang/Long;

    .line 535
    .line 536
    .line 537
    move-result-object v3

    .line 538
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 539
    .line 540
    .line 541
    move-result-wide v18

    .line 542
    div-long v18, v18, v7

    .line 543
    .line 544
    cmp-long v3, v18, v14

    .line 545
    .line 546
    if-ltz v3, :cond_8

    .line 547
    .line 548
    move v3, v6

    .line 549
    goto :goto_8

    .line 550
    :cond_8
    move v3, v5

    .line 551
    :goto_8
    invoke-static {v3}, LQ1/k;->c(Z)V

    .line 552
    .line 553
    .line 554
    invoke-static/range {v18 .. v19}, LQ1/x;->K(J)J

    .line 555
    .line 556
    .line 557
    move-result-wide v7

    .line 558
    const-string v3, "minPossibleLiveOffsetSmoothingFactor"

    .line 559
    .line 560
    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 561
    .line 562
    .line 563
    move-result-object v1

    .line 564
    check-cast v1, Ljava/lang/Double;

    .line 565
    .line 566
    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    .line 567
    .line 568
    .line 569
    move-result-wide v14

    .line 570
    double-to-float v1, v14

    .line 571
    cmpl-float v3, v1, p1

    .line 572
    .line 573
    if-ltz v3, :cond_9

    .line 574
    .line 575
    cmpg-float v3, v1, v4

    .line 576
    .line 577
    if-gez v3, :cond_9

    .line 578
    .line 579
    move v5, v6

    .line 580
    :cond_9
    invoke-static {v5}, LQ1/k;->c(Z)V

    .line 581
    .line 582
    .line 583
    new-instance v9, LU1/f;

    .line 584
    .line 585
    move/from16 v19, v1

    .line 586
    .line 587
    move v14, v2

    .line 588
    move-wide/from16 v15, v16

    .line 589
    .line 590
    move-wide/from16 v17, v7

    .line 591
    .line 592
    invoke-direct/range {v9 .. v19}, LU1/f;-><init>(FFJFJJF)V

    .line 593
    .line 594
    .line 595
    iput-object v9, v0, Leb/c;->r:LU1/f;

    .line 596
    .line 597
    :cond_a
    return-void
.end method

.method public static G(Ljava/util/List;)Lk2/g0;
    .locals 4

    .line 1
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    new-array v1, v0, [I

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    :goto_0
    if-ge v2, v0, :cond_0

    .line 9
    .line 10
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    check-cast v3, Ljava/lang/Integer;

    .line 15
    .line 16
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    aput v3, v1, v2

    .line 21
    .line 22
    add-int/lit8 v2, v2, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    new-instance p0, Lk2/g0;

    .line 26
    .line 27
    sget-object v2, Leb/c;->F:Ljava/util/Random;

    .line 28
    .line 29
    invoke-virtual {v2}, Ljava/util/Random;->nextLong()J

    .line 30
    .line 31
    .line 32
    move-result-wide v2

    .line 33
    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([II)[I

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    new-instance v1, Ljava/util/Random;

    .line 38
    .line 39
    invoke-direct {v1, v2, v3}, Ljava/util/Random;-><init>(J)V

    .line 40
    .line 41
    .line 42
    invoke-direct {p0, v0, v1}, Lk2/g0;-><init>([ILjava/util/Random;)V

    .line 43
    .line 44
    .line 45
    return-object p0
.end method

.method public static Q(Ljava/lang/Object;)Ljava/lang/Long;
    .locals 2

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    instance-of v0, p0, Ljava/lang/Long;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    check-cast p0, Ljava/lang/Integer;

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    int-to-long v0, p0

    .line 15
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    :cond_1
    :goto_0
    check-cast p0, Ljava/lang/Long;

    .line 21
    .line 22
    return-object p0
.end method

.method public static T(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .line 1
    instance-of v0, p0, Ljava/util/Map;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Ljava/util/Map;

    .line 6
    .line 7
    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return-object p0
.end method

.method public static varargs U([Ljava/lang/Object;)Ljava/util/HashMap;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    :goto_0
    array-length v2, p0

    .line 8
    if-ge v1, v2, :cond_0

    .line 9
    .line 10
    aget-object v2, p0, v1

    .line 11
    .line 12
    check-cast v2, Ljava/lang/String;

    .line 13
    .line 14
    add-int/lit8 v3, v1, 0x1

    .line 15
    .line 16
    aget-object v3, p0, v3

    .line 17
    .line 18
    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    add-int/lit8 v1, v1, 0x2

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    return-object v0
.end method


# virtual methods
.method public final synthetic A(LN1/F;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final B()V
    .locals 2

    .line 1
    iget-object v0, p0, Leb/c;->t:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Landroid/media/audiofx/AudioEffect;

    .line 18
    .line 19
    invoke-virtual {v1}, Landroid/media/audiofx/AudioEffect;->release()V

    .line 20
    .line 21
    .line 22
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    iget-object v0, p0, Leb/c;->u:Ljava/util/HashMap;

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public final C(LN1/E;)V
    .locals 9

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x0

    .line 3
    instance-of v2, p1, LU1/j;

    .line 4
    .line 5
    const-string v3, "index"

    .line 6
    .line 7
    const-string v4, "AudioPlayer"

    .line 8
    .line 9
    const/4 v5, 0x1

    .line 10
    if-eqz v2, :cond_7

    .line 11
    .line 12
    check-cast p1, LU1/j;

    .line 13
    .line 14
    iget v2, p1, LU1/j;->c:I

    .line 15
    .line 16
    if-eqz v2, :cond_5

    .line 17
    .line 18
    if-eq v2, v5, :cond_3

    .line 19
    .line 20
    iget v6, p1, LU1/j;->c:I

    .line 21
    .line 22
    if-eq v2, v0, :cond_1

    .line 23
    .line 24
    new-instance v7, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    const-string v8, "default ExoPlaybackException: "

    .line 27
    .line 28
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    if-ne v6, v0, :cond_0

    .line 32
    .line 33
    move v6, v5

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move v6, v1

    .line 36
    :goto_0
    invoke-static {v6}, LQ1/k;->g(Z)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    check-cast v6, Ljava/lang/RuntimeException;

    .line 47
    .line 48
    invoke-virtual {v6}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v6

    .line 52
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    invoke-static {v4, v6}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 60
    .line 61
    .line 62
    goto/16 :goto_4

    .line 63
    .line 64
    :cond_1
    new-instance v7, Ljava/lang/StringBuilder;

    .line 65
    .line 66
    const-string v8, "TYPE_UNEXPECTED: "

    .line 67
    .line 68
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    if-ne v6, v0, :cond_2

    .line 72
    .line 73
    move v6, v5

    .line 74
    goto :goto_1

    .line 75
    :cond_2
    move v6, v1

    .line 76
    :goto_1
    invoke-static {v6}, LQ1/k;->g(Z)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 80
    .line 81
    .line 82
    move-result-object v6

    .line 83
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    check-cast v6, Ljava/lang/RuntimeException;

    .line 87
    .line 88
    invoke-virtual {v6}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v6

    .line 92
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v6

    .line 99
    invoke-static {v4, v6}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 100
    .line 101
    .line 102
    goto :goto_4

    .line 103
    :cond_3
    new-instance v6, Ljava/lang/StringBuilder;

    .line 104
    .line 105
    const-string v7, "TYPE_RENDERER: "

    .line 106
    .line 107
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    if-ne v2, v5, :cond_4

    .line 111
    .line 112
    move v7, v5

    .line 113
    goto :goto_2

    .line 114
    :cond_4
    move v7, v1

    .line 115
    :goto_2
    invoke-static {v7}, LQ1/k;->g(Z)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 119
    .line 120
    .line 121
    move-result-object v7

    .line 122
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    check-cast v7, Ljava/lang/Exception;

    .line 126
    .line 127
    invoke-virtual {v7}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v7

    .line 131
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v6

    .line 138
    invoke-static {v4, v6}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 139
    .line 140
    .line 141
    goto :goto_4

    .line 142
    :cond_5
    new-instance v6, Ljava/lang/StringBuilder;

    .line 143
    .line 144
    const-string v7, "TYPE_SOURCE: "

    .line 145
    .line 146
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    if-nez v2, :cond_6

    .line 150
    .line 151
    move v7, v5

    .line 152
    goto :goto_3

    .line 153
    :cond_6
    move v7, v1

    .line 154
    :goto_3
    invoke-static {v7}, LQ1/k;->g(Z)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 158
    .line 159
    .line 160
    move-result-object v7

    .line 161
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    check-cast v7, Ljava/io/IOException;

    .line 165
    .line 166
    invoke-virtual {v7}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v7

    .line 170
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v6

    .line 177
    invoke-static {v4, v6}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 178
    .line 179
    .line 180
    :goto_4
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    iget-object v4, p0, Leb/c;->B:Ljava/lang/Integer;

    .line 185
    .line 186
    new-array v0, v0, [Ljava/lang/Object;

    .line 187
    .line 188
    aput-object v3, v0, v1

    .line 189
    .line 190
    aput-object v4, v0, v5

    .line 191
    .line 192
    invoke-static {v0}, Leb/c;->U([Ljava/lang/Object;)Ljava/util/HashMap;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    invoke-virtual {p0, v2, p1, v0, v5}, Leb/c;->Y(ILjava/lang/String;Ljava/util/HashMap;Z)V

    .line 197
    .line 198
    .line 199
    return-void

    .line 200
    :cond_7
    new-instance v2, Ljava/lang/StringBuilder;

    .line 201
    .line 202
    const-string v6, "default PlaybackException: "

    .line 203
    .line 204
    invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v6

    .line 211
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 212
    .line 213
    .line 214
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v2

    .line 218
    invoke-static {v4, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 219
    .line 220
    .line 221
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v2

    .line 225
    iget-object v4, p0, Leb/c;->B:Ljava/lang/Integer;

    .line 226
    .line 227
    new-array v0, v0, [Ljava/lang/Object;

    .line 228
    .line 229
    aput-object v3, v0, v1

    .line 230
    .line 231
    aput-object v4, v0, v5

    .line 232
    .line 233
    invoke-static {v0}, Leb/c;->U([Ljava/lang/Object;)Ljava/util/HashMap;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    iget p1, p1, LN1/E;->a:I

    .line 238
    .line 239
    invoke-virtual {p0, p1, v2, v0, v5}, Leb/c;->Y(ILjava/lang/String;Ljava/util/HashMap;Z)V

    .line 240
    .line 241
    .line 242
    return-void
.end method

.method public final D(Ljava/lang/Object;)Lk2/t;
    .locals 1

    .line 1
    iget-object v0, p0, Leb/c;->k:Ljava/util/HashMap;

    .line 2
    .line 3
    check-cast p1, Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lk2/t;

    .line 10
    .line 11
    return-object p1
.end method

.method public final synthetic E(LN1/G;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final F(LN1/V;)V
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    iget-object v2, p1, LN1/V;->a:Ll8/K;

    .line 4
    .line 5
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->size()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-ge v1, v2, :cond_3

    .line 10
    .line 11
    iget-object v2, p1, LN1/V;->a:Ll8/K;

    .line 12
    .line 13
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    check-cast v2, LN1/U;

    .line 18
    .line 19
    iget-object v2, v2, LN1/U;->b:LN1/O;

    .line 20
    .line 21
    move v3, v0

    .line 22
    :goto_1
    iget v4, v2, LN1/O;->a:I

    .line 23
    .line 24
    if-ge v3, v4, :cond_2

    .line 25
    .line 26
    iget-object v4, v2, LN1/O;->d:[LN1/n;

    .line 27
    .line 28
    aget-object v4, v4, v3

    .line 29
    .line 30
    iget-object v4, v4, LN1/n;->l:LN1/B;

    .line 31
    .line 32
    if-eqz v4, :cond_1

    .line 33
    .line 34
    move v5, v0

    .line 35
    :goto_2
    iget-object v6, v4, LN1/B;->a:[LN1/A;

    .line 36
    .line 37
    array-length v7, v6

    .line 38
    if-ge v5, v7, :cond_1

    .line 39
    .line 40
    aget-object v6, v6, v5

    .line 41
    .line 42
    instance-of v7, v6, LF2/b;

    .line 43
    .line 44
    if-eqz v7, :cond_0

    .line 45
    .line 46
    check-cast v6, LF2/b;

    .line 47
    .line 48
    iput-object v6, p0, Leb/c;->m:LF2/b;

    .line 49
    .line 50
    invoke-virtual {p0}, Leb/c;->r()V

    .line 51
    .line 52
    .line 53
    :cond_0
    add-int/lit8 v5, v5, 0x1

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_3
    return-void
.end method

.method public final H()V
    .locals 4

    .line 1
    iget v0, p0, Leb/c;->E:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x1

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    const v0, 0x989680

    .line 9
    .line 10
    .line 11
    const-string v1, "Connection aborted"

    .line 12
    .line 13
    invoke-virtual {p0, v0, v1, v2, v3}, Leb/c;->Y(ILjava/lang/String;Ljava/util/HashMap;Z)V

    .line 14
    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, Leb/c;->i:Ltc/g;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    new-instance v1, Ljava/util/HashMap;

    .line 21
    .line 22
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iput-object v2, p0, Leb/c;->i:Ltc/g;

    .line 29
    .line 30
    :cond_1
    iget-object v0, p0, Leb/c;->k:Ljava/util/HashMap;

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Leb/c;->B()V

    .line 36
    .line 37
    .line 38
    iget-object v0, p0, Leb/c;->x:LU1/u;

    .line 39
    .line 40
    if-eqz v0, :cond_2

    .line 41
    .line 42
    invoke-virtual {v0}, LU1/u;->A0()V

    .line 43
    .line 44
    .line 45
    iput-object v2, p0, Leb/c;->x:LU1/u;

    .line 46
    .line 47
    iput v3, p0, Leb/c;->E:I

    .line 48
    .line 49
    invoke-virtual {p0}, Leb/c;->r()V

    .line 50
    .line 51
    .line 52
    :cond_2
    iget-object v0, p0, Leb/c;->b:Leb/d;

    .line 53
    .line 54
    invoke-virtual {v0}, Leb/d;->b()V

    .line 55
    .line 56
    .line 57
    iget-object v0, p0, Leb/c;->c:Leb/d;

    .line 58
    .line 59
    invoke-virtual {v0}, Leb/d;->b()V

    .line 60
    .line 61
    .line 62
    return-void
.end method

.method public final I()V
    .locals 8

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Leb/c;->P()J

    .line 7
    .line 8
    .line 9
    move-result-wide v1

    .line 10
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    cmp-long v1, v1, v3

    .line 16
    .line 17
    const-wide/16 v2, 0x3e8

    .line 18
    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {p0}, Leb/c;->P()J

    .line 24
    .line 25
    .line 26
    move-result-wide v4

    .line 27
    mul-long/2addr v4, v2

    .line 28
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    :goto_0
    iget-object v4, p0, Leb/c;->x:LU1/u;

    .line 33
    .line 34
    if-eqz v4, :cond_1

    .line 35
    .line 36
    invoke-virtual {v4}, LU1/u;->h0()J

    .line 37
    .line 38
    .line 39
    move-result-wide v4

    .line 40
    goto :goto_1

    .line 41
    :cond_1
    const-wide/16 v4, 0x0

    .line 42
    .line 43
    :goto_1
    iput-wide v4, p0, Leb/c;->f:J

    .line 44
    .line 45
    iget v4, p0, Leb/c;->E:I

    .line 46
    .line 47
    invoke-static {v4}, LA/f;->f(I)I

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    const-string v5, "processingState"

    .line 56
    .line 57
    invoke-virtual {v0, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    iget-wide v4, p0, Leb/c;->d:J

    .line 61
    .line 62
    mul-long/2addr v4, v2

    .line 63
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    const-string v5, "updatePosition"

    .line 68
    .line 69
    invoke-virtual {v0, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    iget-wide v4, p0, Leb/c;->e:J

    .line 73
    .line 74
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    const-string v5, "updateTime"

    .line 79
    .line 80
    invoke-virtual {v0, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    iget-wide v4, p0, Leb/c;->d:J

    .line 84
    .line 85
    iget-wide v6, p0, Leb/c;->f:J

    .line 86
    .line 87
    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->max(JJ)J

    .line 88
    .line 89
    .line 90
    move-result-wide v4

    .line 91
    mul-long/2addr v4, v2

    .line 92
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    const-string v3, "bufferedPosition"

    .line 97
    .line 98
    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    new-instance v2, Ljava/util/HashMap;

    .line 102
    .line 103
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 104
    .line 105
    .line 106
    iget-object v3, p0, Leb/c;->l:LF2/c;

    .line 107
    .line 108
    const-string v4, "url"

    .line 109
    .line 110
    if-eqz v3, :cond_2

    .line 111
    .line 112
    new-instance v3, Ljava/util/HashMap;

    .line 113
    .line 114
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 115
    .line 116
    .line 117
    iget-object v5, p0, Leb/c;->l:LF2/c;

    .line 118
    .line 119
    iget-object v5, v5, LF2/c;->b:Ljava/lang/String;

    .line 120
    .line 121
    const-string v6, "title"

    .line 122
    .line 123
    invoke-virtual {v3, v6, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    iget-object v5, p0, Leb/c;->l:LF2/c;

    .line 127
    .line 128
    iget-object v5, v5, LF2/c;->c:Ljava/lang/String;

    .line 129
    .line 130
    invoke-virtual {v3, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    const-string v5, "info"

    .line 134
    .line 135
    invoke-virtual {v2, v5, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    :cond_2
    iget-object v3, p0, Leb/c;->m:LF2/b;

    .line 139
    .line 140
    if-eqz v3, :cond_3

    .line 141
    .line 142
    new-instance v3, Ljava/util/HashMap;

    .line 143
    .line 144
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 145
    .line 146
    .line 147
    iget-object v5, p0, Leb/c;->m:LF2/b;

    .line 148
    .line 149
    iget v5, v5, LF2/b;->a:I

    .line 150
    .line 151
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 152
    .line 153
    .line 154
    move-result-object v5

    .line 155
    const-string v6, "bitrate"

    .line 156
    .line 157
    invoke-virtual {v3, v6, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    iget-object v5, p0, Leb/c;->m:LF2/b;

    .line 161
    .line 162
    iget-object v5, v5, LF2/b;->b:Ljava/lang/String;

    .line 163
    .line 164
    const-string v6, "genre"

    .line 165
    .line 166
    invoke-virtual {v3, v6, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    iget-object v5, p0, Leb/c;->m:LF2/b;

    .line 170
    .line 171
    iget-object v5, v5, LF2/b;->c:Ljava/lang/String;

    .line 172
    .line 173
    const-string v6, "name"

    .line 174
    .line 175
    invoke-virtual {v3, v6, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    iget-object v5, p0, Leb/c;->m:LF2/b;

    .line 179
    .line 180
    iget v5, v5, LF2/b;->f:I

    .line 181
    .line 182
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 183
    .line 184
    .line 185
    move-result-object v5

    .line 186
    const-string v6, "metadataInterval"

    .line 187
    .line 188
    invoke-virtual {v3, v6, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    iget-object v5, p0, Leb/c;->m:LF2/b;

    .line 192
    .line 193
    iget-object v5, v5, LF2/b;->d:Ljava/lang/String;

    .line 194
    .line 195
    invoke-virtual {v3, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    iget-object v4, p0, Leb/c;->m:LF2/b;

    .line 199
    .line 200
    iget-boolean v4, v4, LF2/b;->e:Z

    .line 201
    .line 202
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 203
    .line 204
    .line 205
    move-result-object v4

    .line 206
    const-string v5, "isPublic"

    .line 207
    .line 208
    invoke-virtual {v3, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    const-string v4, "headers"

    .line 212
    .line 213
    invoke-virtual {v2, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    :cond_3
    const-string v3, "icyMetadata"

    .line 217
    .line 218
    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    const-string v2, "duration"

    .line 222
    .line 223
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    const-string v1, "currentIndex"

    .line 227
    .line 228
    iget-object v2, p0, Leb/c;->B:Ljava/lang/Integer;

    .line 229
    .line 230
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    const-string v1, "androidAudioSessionId"

    .line 234
    .line 235
    iget-object v2, p0, Leb/c;->y:Ljava/lang/Integer;

    .line 236
    .line 237
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    const-string v1, "errorCode"

    .line 241
    .line 242
    iget-object v2, p0, Leb/c;->z:Ljava/lang/Integer;

    .line 243
    .line 244
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    const-string v1, "errorMessage"

    .line 248
    .line 249
    iget-object v2, p0, Leb/c;->A:Ljava/lang/String;

    .line 250
    .line 251
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    iput-object v0, p0, Leb/c;->w:Ljava/util/HashMap;

    .line 255
    .line 256
    return-void
.end method

.method public final J()V
    .locals 9

    .line 1
    const/4 v0, 0x1

    .line 2
    iget-object v1, p0, Leb/c;->x:LU1/u;

    .line 3
    .line 4
    if-nez v1, :cond_8

    .line 5
    .line 6
    new-instance v1, Leb/a;

    .line 7
    .line 8
    invoke-direct {v1, p0}, Leb/a;-><init>(Leb/c;)V

    .line 9
    .line 10
    .line 11
    new-instance v2, LU1/k;

    .line 12
    .line 13
    new-instance v3, LE5/J;

    .line 14
    .line 15
    const/4 v4, 0x2

    .line 16
    invoke-direct {v3, v1, v4}, LE5/J;-><init>(Ljava/lang/Object;I)V

    .line 17
    .line 18
    .line 19
    new-instance v1, LE5/p;

    .line 20
    .line 21
    iget-object v4, p0, Leb/c;->a:Landroid/content/Context;

    .line 22
    .line 23
    const/4 v5, 0x5

    .line 24
    invoke-direct {v1, v4, v5}, LE5/p;-><init>(Landroid/content/Context;I)V

    .line 25
    .line 26
    .line 27
    invoke-direct {v2, v4, v3, v1}, LU1/k;-><init>(Landroid/content/Context;Lk8/p;Lk8/p;)V

    .line 28
    .line 29
    .line 30
    iget-boolean v1, v2, LU1/k;->s:Z

    .line 31
    .line 32
    xor-int/2addr v1, v0

    .line 33
    invoke-static {v1}, LQ1/k;->g(Z)V

    .line 34
    .line 35
    .line 36
    iget-boolean v1, p0, Leb/c;->q:Z

    .line 37
    .line 38
    iput-boolean v1, v2, LU1/k;->m:Z

    .line 39
    .line 40
    iget-object v1, p0, Leb/c;->o:LU1/h;

    .line 41
    .line 42
    if-eqz v1, :cond_0

    .line 43
    .line 44
    iget-boolean v3, v2, LU1/k;->s:Z

    .line 45
    .line 46
    xor-int/2addr v3, v0

    .line 47
    invoke-static {v3}, LQ1/k;->g(Z)V

    .line 48
    .line 49
    .line 50
    new-instance v3, LE5/J;

    .line 51
    .line 52
    invoke-direct {v3, v1, v0}, LE5/J;-><init>(Ljava/lang/Object;I)V

    .line 53
    .line 54
    .line 55
    iput-object v3, v2, LU1/k;->f:Lk8/p;

    .line 56
    .line 57
    :cond_0
    iget-object v1, p0, Leb/c;->r:LU1/f;

    .line 58
    .line 59
    if-eqz v1, :cond_1

    .line 60
    .line 61
    iget-boolean v3, v2, LU1/k;->s:Z

    .line 62
    .line 63
    xor-int/2addr v3, v0

    .line 64
    invoke-static {v3}, LQ1/k;->g(Z)V

    .line 65
    .line 66
    .line 67
    iput-object v1, v2, LU1/k;->o:LU1/f;

    .line 68
    .line 69
    :cond_1
    invoke-virtual {v2}, LU1/k;->a()LU1/u;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    iput-object v1, p0, Leb/c;->x:LU1/u;

    .line 74
    .line 75
    invoke-virtual {v1}, LU1/u;->S0()V

    .line 76
    .line 77
    .line 78
    iget-object v2, v1, LU1/u;->h:Ln2/s;

    .line 79
    .line 80
    move-object v3, v2

    .line 81
    check-cast v3, Ln2/o;

    .line 82
    .line 83
    invoke-virtual {v3}, Ln2/o;->d()Ln2/i;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    new-instance v4, Ln2/h;

    .line 91
    .line 92
    invoke-direct {v4, v3}, Ln2/h;-><init>(Ln2/i;)V

    .line 93
    .line 94
    .line 95
    iget-object v3, p0, Leb/c;->p:LN1/Q;

    .line 96
    .line 97
    iput-object v3, v4, LN1/S;->m:LN1/Q;

    .line 98
    .line 99
    new-instance v3, Ln2/i;

    .line 100
    .line 101
    invoke-direct {v3, v4}, Ln2/i;-><init>(Ln2/h;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v1}, LU1/u;->S0()V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    check-cast v2, Ln2/o;

    .line 111
    .line 112
    invoke-virtual {v2}, Ln2/o;->d()Ln2/i;

    .line 113
    .line 114
    .line 115
    move-result-object v4

    .line 116
    invoke-virtual {v3, v4}, Ln2/i;->equals(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result v4

    .line 120
    if-eqz v4, :cond_2

    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_2
    invoke-virtual {v2, v3}, Ln2/o;->j(Ln2/i;)V

    .line 124
    .line 125
    .line 126
    new-instance v4, Ln2/h;

    .line 127
    .line 128
    invoke-virtual {v2}, Ln2/o;->d()Ln2/i;

    .line 129
    .line 130
    .line 131
    move-result-object v5

    .line 132
    invoke-direct {v4, v5}, Ln2/h;-><init>(Ln2/i;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v4, v3}, LN1/S;->a(Ln2/i;)V

    .line 136
    .line 137
    .line 138
    new-instance v5, Ln2/i;

    .line 139
    .line 140
    invoke-direct {v5, v4}, Ln2/i;-><init>(Ln2/h;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v2, v5}, Ln2/o;->j(Ln2/i;)V

    .line 144
    .line 145
    .line 146
    new-instance v2, LU1/p;

    .line 147
    .line 148
    invoke-direct {v2, v3}, LU1/p;-><init>(Ln2/i;)V

    .line 149
    .line 150
    .line 151
    iget-object v1, v1, LU1/u;->l:LQ1/j;

    .line 152
    .line 153
    const/16 v3, 0x13

    .line 154
    .line 155
    invoke-virtual {v1, v3, v2}, LQ1/j;->e(ILQ1/g;)V

    .line 156
    .line 157
    .line 158
    :goto_0
    iget-object v1, p0, Leb/c;->x:LU1/u;

    .line 159
    .line 160
    invoke-virtual {v1}, LU1/u;->S0()V

    .line 161
    .line 162
    .line 163
    iget v1, v1, LU1/u;->T:I

    .line 164
    .line 165
    if-nez v1, :cond_3

    .line 166
    .line 167
    const/4 v1, 0x0

    .line 168
    iput-object v1, p0, Leb/c;->y:Ljava/lang/Integer;

    .line 169
    .line 170
    goto :goto_1

    .line 171
    :cond_3
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 172
    .line 173
    .line 174
    move-result-object v1

    .line 175
    iput-object v1, p0, Leb/c;->y:Ljava/lang/Integer;

    .line 176
    .line 177
    :goto_1
    invoke-virtual {p0}, Leb/c;->B()V

    .line 178
    .line 179
    .line 180
    iget-object v1, p0, Leb/c;->y:Ljava/lang/Integer;

    .line 181
    .line 182
    if-eqz v1, :cond_7

    .line 183
    .line 184
    iget-object v1, p0, Leb/c;->s:Ljava/util/List;

    .line 185
    .line 186
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 191
    .line 192
    .line 193
    move-result v2

    .line 194
    if-eqz v2, :cond_7

    .line 195
    .line 196
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v2

    .line 200
    check-cast v2, Ljava/util/Map;

    .line 201
    .line 202
    iget-object v3, p0, Leb/c;->y:Ljava/lang/Integer;

    .line 203
    .line 204
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 205
    .line 206
    .line 207
    move-result v3

    .line 208
    const-string v4, "type"

    .line 209
    .line 210
    invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v5

    .line 214
    check-cast v5, Ljava/lang/String;

    .line 215
    .line 216
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 217
    .line 218
    .line 219
    const-string v6, "AndroidEqualizer"

    .line 220
    .line 221
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    move-result v6

    .line 225
    if-nez v6, :cond_5

    .line 226
    .line 227
    const-string v6, "AndroidLoudnessEnhancer"

    .line 228
    .line 229
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 230
    .line 231
    .line 232
    move-result v5

    .line 233
    if-eqz v5, :cond_4

    .line 234
    .line 235
    const-string v5, "targetGain"

    .line 236
    .line 237
    invoke-interface {v2, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v5

    .line 241
    check-cast v5, Ljava/lang/Double;

    .line 242
    .line 243
    invoke-virtual {v5}, Ljava/lang/Double;->doubleValue()D

    .line 244
    .line 245
    .line 246
    move-result-wide v5

    .line 247
    const-wide/high16 v7, 0x4059000000000000L    # 100.0

    .line 248
    .line 249
    mul-double/2addr v5, v7

    .line 250
    invoke-static {v5, v6}, Ljava/lang/Math;->round(D)J

    .line 251
    .line 252
    .line 253
    move-result-wide v5

    .line 254
    long-to-int v5, v5

    .line 255
    new-instance v6, Landroid/media/audiofx/LoudnessEnhancer;

    .line 256
    .line 257
    invoke-direct {v6, v3}, Landroid/media/audiofx/LoudnessEnhancer;-><init>(I)V

    .line 258
    .line 259
    .line 260
    invoke-virtual {v6, v5}, Landroid/media/audiofx/LoudnessEnhancer;->setTargetGain(I)V

    .line 261
    .line 262
    .line 263
    goto :goto_3

    .line 264
    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 265
    .line 266
    new-instance v1, Ljava/lang/StringBuilder;

    .line 267
    .line 268
    const-string v3, "Unknown AudioEffect type: "

    .line 269
    .line 270
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 271
    .line 272
    .line 273
    invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object v2

    .line 277
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 278
    .line 279
    .line 280
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v1

    .line 284
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    throw v0

    .line 288
    :cond_5
    new-instance v6, Landroid/media/audiofx/Equalizer;

    .line 289
    .line 290
    const/4 v5, 0x0

    .line 291
    invoke-direct {v6, v5, v3}, Landroid/media/audiofx/Equalizer;-><init>(II)V

    .line 292
    .line 293
    .line 294
    :goto_3
    const-string v3, "enabled"

    .line 295
    .line 296
    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v3

    .line 300
    check-cast v3, Ljava/lang/Boolean;

    .line 301
    .line 302
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 303
    .line 304
    .line 305
    move-result v3

    .line 306
    if-eqz v3, :cond_6

    .line 307
    .line 308
    invoke-virtual {v6, v0}, Landroid/media/audiofx/AudioEffect;->setEnabled(Z)I

    .line 309
    .line 310
    .line 311
    :cond_6
    iget-object v3, p0, Leb/c;->t:Ljava/util/ArrayList;

    .line 312
    .line 313
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 314
    .line 315
    .line 316
    iget-object v3, p0, Leb/c;->u:Ljava/util/HashMap;

    .line 317
    .line 318
    invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    move-result-object v2

    .line 322
    check-cast v2, Ljava/lang/String;

    .line 323
    .line 324
    invoke-virtual {v3, v2, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 325
    .line 326
    .line 327
    goto/16 :goto_2

    .line 328
    .line 329
    :cond_7
    invoke-virtual {p0}, Leb/c;->I()V

    .line 330
    .line 331
    .line 332
    iget-object v0, p0, Leb/c;->x:LU1/u;

    .line 333
    .line 334
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 335
    .line 336
    .line 337
    iget-object v0, v0, LU1/u;->l:LQ1/j;

    .line 338
    .line 339
    invoke-virtual {v0, p0}, LQ1/j;->a(Ljava/lang/Object;)V

    .line 340
    .line 341
    .line 342
    :cond_8
    return-void
.end method

.method public final K()Ljava/util/HashMap;
    .locals 20

    .line 1
    const/4 v0, 0x6

    .line 2
    const/4 v3, 0x3

    .line 3
    const/4 v4, 0x2

    .line 4
    const/4 v5, 0x1

    .line 5
    move-object/from16 v6, p0

    .line 6
    .line 7
    iget-object v7, v6, Leb/c;->u:Ljava/util/HashMap;

    .line 8
    .line 9
    const-string v8, "AndroidEqualizer"

    .line 10
    .line 11
    invoke-virtual {v7, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v7

    .line 15
    check-cast v7, Landroid/media/audiofx/Equalizer;

    .line 16
    .line 17
    new-instance v8, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 20
    .line 21
    .line 22
    const/4 v9, 0x0

    .line 23
    move v10, v9

    .line 24
    :goto_0
    invoke-virtual {v7}, Landroid/media/audiofx/Equalizer;->getNumberOfBands()S

    .line 25
    .line 26
    .line 27
    move-result v11

    .line 28
    const-wide/high16 v12, 0x4059000000000000L    # 100.0

    .line 29
    .line 30
    if-ge v10, v11, :cond_0

    .line 31
    .line 32
    invoke-static {v10}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 33
    .line 34
    .line 35
    move-result-object v11

    .line 36
    invoke-virtual {v7, v10}, Landroid/media/audiofx/Equalizer;->getBandFreqRange(S)[I

    .line 37
    .line 38
    .line 39
    move-result-object v14

    .line 40
    aget v14, v14, v9

    .line 41
    .line 42
    int-to-double v14, v14

    .line 43
    const-wide v16, 0x408f400000000000L    # 1000.0

    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    div-double v14, v14, v16

    .line 49
    .line 50
    invoke-static {v14, v15}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 51
    .line 52
    .line 53
    move-result-object v14

    .line 54
    invoke-virtual {v7, v10}, Landroid/media/audiofx/Equalizer;->getBandFreqRange(S)[I

    .line 55
    .line 56
    .line 57
    move-result-object v15

    .line 58
    aget v15, v15, v5

    .line 59
    .line 60
    const/16 v18, 0x5

    .line 61
    .line 62
    const/16 v19, 0x4

    .line 63
    .line 64
    int-to-double v1, v15

    .line 65
    div-double v1, v1, v16

    .line 66
    .line 67
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-virtual {v7, v10}, Landroid/media/audiofx/Equalizer;->getCenterFreq(S)I

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    move v15, v5

    .line 76
    int-to-double v5, v2

    .line 77
    div-double v5, v5, v16

    .line 78
    .line 79
    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    invoke-virtual {v7, v10}, Landroid/media/audiofx/Equalizer;->getBandLevel(S)S

    .line 84
    .line 85
    .line 86
    move-result v5

    .line 87
    int-to-double v5, v5

    .line 88
    div-double/2addr v5, v12

    .line 89
    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    const/16 v6, 0xa

    .line 94
    .line 95
    new-array v6, v6, [Ljava/lang/Object;

    .line 96
    .line 97
    const-string v12, "index"

    .line 98
    .line 99
    aput-object v12, v6, v9

    .line 100
    .line 101
    aput-object v11, v6, v15

    .line 102
    .line 103
    const-string v11, "lowerFrequency"

    .line 104
    .line 105
    aput-object v11, v6, v4

    .line 106
    .line 107
    aput-object v14, v6, v3

    .line 108
    .line 109
    const-string v11, "upperFrequency"

    .line 110
    .line 111
    aput-object v11, v6, v19

    .line 112
    .line 113
    aput-object v1, v6, v18

    .line 114
    .line 115
    const-string v1, "centerFrequency"

    .line 116
    .line 117
    aput-object v1, v6, v0

    .line 118
    .line 119
    const/4 v1, 0x7

    .line 120
    aput-object v2, v6, v1

    .line 121
    .line 122
    const-string v1, "gain"

    .line 123
    .line 124
    const/16 v2, 0x8

    .line 125
    .line 126
    aput-object v1, v6, v2

    .line 127
    .line 128
    const/16 v1, 0x9

    .line 129
    .line 130
    aput-object v5, v6, v1

    .line 131
    .line 132
    invoke-static {v6}, Leb/c;->U([Ljava/lang/Object;)Ljava/util/HashMap;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    invoke-virtual {v8, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    add-int/2addr v10, v15

    .line 140
    int-to-short v10, v10

    .line 141
    move-object/from16 v6, p0

    .line 142
    .line 143
    move v5, v15

    .line 144
    goto :goto_0

    .line 145
    :cond_0
    move v15, v5

    .line 146
    const/16 v18, 0x5

    .line 147
    .line 148
    const/16 v19, 0x4

    .line 149
    .line 150
    invoke-virtual {v7}, Landroid/media/audiofx/Equalizer;->getBandLevelRange()[S

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    aget-short v1, v1, v9

    .line 155
    .line 156
    int-to-double v1, v1

    .line 157
    div-double/2addr v1, v12

    .line 158
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    invoke-virtual {v7}, Landroid/media/audiofx/Equalizer;->getBandLevelRange()[S

    .line 163
    .line 164
    .line 165
    move-result-object v2

    .line 166
    aget-short v2, v2, v15

    .line 167
    .line 168
    int-to-double v5, v2

    .line 169
    div-double/2addr v5, v12

    .line 170
    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 171
    .line 172
    .line 173
    move-result-object v2

    .line 174
    new-array v0, v0, [Ljava/lang/Object;

    .line 175
    .line 176
    const-string v5, "minDecibels"

    .line 177
    .line 178
    aput-object v5, v0, v9

    .line 179
    .line 180
    aput-object v1, v0, v15

    .line 181
    .line 182
    const-string v1, "maxDecibels"

    .line 183
    .line 184
    aput-object v1, v0, v4

    .line 185
    .line 186
    aput-object v2, v0, v3

    .line 187
    .line 188
    const-string v1, "bands"

    .line 189
    .line 190
    aput-object v1, v0, v19

    .line 191
    .line 192
    aput-object v8, v0, v18

    .line 193
    .line 194
    invoke-static {v0}, Leb/c;->U([Ljava/lang/Object;)Ljava/util/HashMap;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    new-array v1, v4, [Ljava/lang/Object;

    .line 199
    .line 200
    const-string v2, "parameters"

    .line 201
    .line 202
    aput-object v2, v1, v9

    .line 203
    .line 204
    aput-object v0, v1, v15

    .line 205
    .line 206
    invoke-static {v1}, Leb/c;->U([Ljava/lang/Object;)Ljava/util/HashMap;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    return-object v0
.end method

.method public final L(DI)V
    .locals 3

    .line 1
    iget-object v0, p0, Leb/c;->u:Ljava/util/HashMap;

    .line 2
    .line 3
    const-string v1, "AndroidEqualizer"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Landroid/media/audiofx/Equalizer;

    .line 10
    .line 11
    int-to-short p3, p3

    .line 12
    const-wide/high16 v1, 0x4059000000000000L    # 100.0

    .line 13
    .line 14
    mul-double/2addr p1, v1

    .line 15
    invoke-static {p1, p2}, Ljava/lang/Math;->round(D)J

    .line 16
    .line 17
    .line 18
    move-result-wide p1

    .line 19
    long-to-int p1, p1

    .line 20
    int-to-short p1, p1

    .line 21
    invoke-virtual {v0, p3, p1}, Landroid/media/audiofx/Equalizer;->setBandLevel(SS)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public final M(Ljava/lang/Object;)Lk2/a;
    .locals 25

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x3

    .line 6
    move-object/from16 v4, p1

    .line 7
    .line 8
    check-cast v4, Ljava/util/Map;

    .line 9
    .line 10
    const-string v5, "id"

    .line 11
    .line 12
    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v5

    .line 16
    check-cast v5, Ljava/lang/String;

    .line 17
    .line 18
    iget-object v6, v1, Leb/c;->k:Ljava/util/HashMap;

    .line 19
    .line 20
    invoke-virtual {v6, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v7

    .line 24
    check-cast v7, Lk2/a;

    .line 25
    .line 26
    if-nez v7, :cond_f

    .line 27
    .line 28
    check-cast v4, Ljava/util/Map;

    .line 29
    .line 30
    const-string v7, "id"

    .line 31
    .line 32
    invoke-interface {v4, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v7

    .line 36
    move-object v14, v7

    .line 37
    check-cast v14, Ljava/lang/String;

    .line 38
    .line 39
    const-string v7, "type"

    .line 40
    .line 41
    invoke-interface {v4, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v7

    .line 45
    check-cast v7, Ljava/lang/String;

    .line 46
    .line 47
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    const-wide/16 v8, 0x0

    .line 51
    .line 52
    const/4 v11, 0x0

    .line 53
    const/4 v10, -0x1

    .line 54
    invoke-virtual {v7}, Ljava/lang/String;->hashCode()I

    .line 55
    .line 56
    .line 57
    move-result v12

    .line 58
    sparse-switch v12, :sswitch_data_0

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :sswitch_0
    const-string v12, "silence"

    .line 63
    .line 64
    invoke-virtual {v7, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v7

    .line 68
    if-nez v7, :cond_0

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_0
    const/4 v10, 0x6

    .line 72
    goto :goto_0

    .line 73
    :sswitch_1
    const-string v12, "progressive"

    .line 74
    .line 75
    invoke-virtual {v7, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v7

    .line 79
    if-nez v7, :cond_1

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_1
    const/4 v10, 0x5

    .line 83
    goto :goto_0

    .line 84
    :sswitch_2
    const-string v12, "clipping"

    .line 85
    .line 86
    invoke-virtual {v7, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v7

    .line 90
    if-nez v7, :cond_2

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_2
    const/4 v10, 0x4

    .line 94
    goto :goto_0

    .line 95
    :sswitch_3
    const-string v12, "looping"

    .line 96
    .line 97
    invoke-virtual {v7, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v7

    .line 101
    if-nez v7, :cond_3

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_3
    move v10, v3

    .line 105
    goto :goto_0

    .line 106
    :sswitch_4
    const-string v12, "dash"

    .line 107
    .line 108
    invoke-virtual {v7, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v7

    .line 112
    if-nez v7, :cond_4

    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_4
    const/4 v10, 0x2

    .line 116
    goto :goto_0

    .line 117
    :sswitch_5
    const-string v12, "hls"

    .line 118
    .line 119
    invoke-virtual {v7, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v7

    .line 123
    if-nez v7, :cond_5

    .line 124
    .line 125
    goto :goto_0

    .line 126
    :cond_5
    move v10, v2

    .line 127
    goto :goto_0

    .line 128
    :sswitch_6
    const-string v12, "concatenating"

    .line 129
    .line 130
    invoke-virtual {v7, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result v7

    .line 134
    if-nez v7, :cond_6

    .line 135
    .line 136
    goto :goto_0

    .line 137
    :cond_6
    move v10, v0

    .line 138
    :goto_0
    packed-switch v10, :pswitch_data_0

    .line 139
    .line 140
    .line 141
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 142
    .line 143
    new-instance v2, Ljava/lang/StringBuilder;

    .line 144
    .line 145
    const-string v3, "Unknown AudioSource type: "

    .line 146
    .line 147
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    const-string v3, "type"

    .line 151
    .line 152
    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v3

    .line 156
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    throw v0

    .line 167
    :pswitch_0
    const-string v3, "duration"

    .line 168
    .line 169
    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v3

    .line 173
    invoke-static {v3}, Leb/c;->Q(Ljava/lang/Object;)Ljava/lang/Long;

    .line 174
    .line 175
    .line 176
    move-result-object v3

    .line 177
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 178
    .line 179
    .line 180
    move-result-wide v3

    .line 181
    cmp-long v7, v3, v8

    .line 182
    .line 183
    if-lez v7, :cond_7

    .line 184
    .line 185
    move v0, v2

    .line 186
    :cond_7
    invoke-static {v0}, LQ1/k;->g(Z)V

    .line 187
    .line 188
    .line 189
    new-instance v0, Lk2/j0;

    .line 190
    .line 191
    sget-object v2, Lk2/j0;->k:LN1/w;

    .line 192
    .line 193
    invoke-virtual {v2}, LN1/w;->a()LN1/p;

    .line 194
    .line 195
    .line 196
    move-result-object v2

    .line 197
    iput-object v14, v2, LN1/p;->h:Ljava/lang/String;

    .line 198
    .line 199
    invoke-virtual {v2}, LN1/p;->a()LN1/w;

    .line 200
    .line 201
    .line 202
    move-result-object v2

    .line 203
    invoke-direct {v0, v3, v4, v2}, Lk2/j0;-><init>(JLN1/w;)V

    .line 204
    .line 205
    .line 206
    goto/16 :goto_8

    .line 207
    .line 208
    :pswitch_1
    const-string v7, "headers"

    .line 209
    .line 210
    invoke-static {v4, v7}, Leb/c;->T(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v7

    .line 214
    check-cast v7, Ljava/util/Map;

    .line 215
    .line 216
    invoke-virtual {v1, v7}, Leb/c;->y(Ljava/util/Map;)LS3/c;

    .line 217
    .line 218
    .line 219
    move-result-object v17

    .line 220
    const-string v7, "options"

    .line 221
    .line 222
    invoke-static {v4, v7}, Leb/c;->T(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v7

    .line 226
    check-cast v7, Ljava/util/Map;

    .line 227
    .line 228
    new-instance v10, Ls2/k;

    .line 229
    .line 230
    invoke-direct {v10}, Ls2/k;-><init>()V

    .line 231
    .line 232
    .line 233
    if-eqz v7, :cond_8

    .line 234
    .line 235
    const-string v8, "androidExtractorOptions"

    .line 236
    .line 237
    invoke-interface {v7, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v7

    .line 241
    check-cast v7, Ljava/util/Map;

    .line 242
    .line 243
    if-eqz v7, :cond_8

    .line 244
    .line 245
    const-string v0, "constantBitrateSeekingEnabled"

    .line 246
    .line 247
    invoke-interface {v7, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    check-cast v0, Ljava/lang/Boolean;

    .line 252
    .line 253
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 254
    .line 255
    .line 256
    move-result v2

    .line 257
    const-string v0, "constantBitrateSeekingAlwaysEnabled"

    .line 258
    .line 259
    invoke-interface {v7, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    check-cast v0, Ljava/lang/Boolean;

    .line 264
    .line 265
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 266
    .line 267
    .line 268
    move-result v0

    .line 269
    const-string v8, "mp3Flags"

    .line 270
    .line 271
    invoke-interface {v7, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v7

    .line 275
    check-cast v7, Ljava/lang/Integer;

    .line 276
    .line 277
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 278
    .line 279
    .line 280
    move-result v7

    .line 281
    goto :goto_1

    .line 282
    :cond_8
    move v7, v0

    .line 283
    :goto_1
    monitor-enter v10

    .line 284
    :try_start_0
    iput-boolean v2, v10, Ls2/k;->a:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 285
    .line 286
    monitor-exit v10

    .line 287
    invoke-virtual {v10, v0}, Ls2/k;->c(Z)V

    .line 288
    .line 289
    .line 290
    invoke-virtual {v10, v7}, Ls2/k;->d(I)V

    .line 291
    .line 292
    .line 293
    new-instance v0, Lcom/unity3d/services/core/webview/b;

    .line 294
    .line 295
    const/16 v2, 0xb

    .line 296
    .line 297
    invoke-direct {v0, v10, v2}, Lcom/unity3d/services/core/webview/b;-><init>(Ljava/lang/Object;I)V

    .line 298
    .line 299
    .line 300
    new-instance v2, LMf/d;

    .line 301
    .line 302
    invoke-direct {v2}, LMf/d;-><init>()V

    .line 303
    .line 304
    .line 305
    new-instance v7, Lae/d;

    .line 306
    .line 307
    const/16 v8, 0xa

    .line 308
    .line 309
    invoke-direct {v7, v8}, Lae/d;-><init>(I)V

    .line 310
    .line 311
    .line 312
    new-instance v8, LJ5/n;

    .line 313
    .line 314
    invoke-direct {v8, v3}, LJ5/n;-><init>(I)V

    .line 315
    .line 316
    .line 317
    sget-object v3, Ll8/K;->b:Ll8/I;

    .line 318
    .line 319
    sget-object v3, Ll8/e0;->e:Ll8/e0;

    .line 320
    .line 321
    sget-object v12, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 322
    .line 323
    sget-object v13, Ll8/e0;->e:Ll8/e0;

    .line 324
    .line 325
    new-instance v3, LE5/Y;

    .line 326
    .line 327
    invoke-direct {v3}, LE5/Y;-><init>()V

    .line 328
    .line 329
    .line 330
    sget-object v24, LN1/u;->a:LN1/u;

    .line 331
    .line 332
    const-string v9, "uri"

    .line 333
    .line 334
    invoke-interface {v4, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    move-result-object v4

    .line 338
    check-cast v4, Ljava/lang/String;

    .line 339
    .line 340
    invoke-static {v4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 341
    .line 342
    .line 343
    move-result-object v9

    .line 344
    move-object v4, v8

    .line 345
    if-eqz v9, :cond_9

    .line 346
    .line 347
    new-instance v8, LN1/t;

    .line 348
    .line 349
    const/4 v10, 0x0

    .line 350
    const-wide v15, -0x7fffffffffffffffL    # -4.9E-324

    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    invoke-direct/range {v8 .. v16}, LN1/t;-><init>(Landroid/net/Uri;Ljava/lang/String;Lic/d;Ljava/util/List;Ll8/K;Ljava/lang/String;J)V

    .line 356
    .line 357
    .line 358
    move-object/from16 v21, v8

    .line 359
    .line 360
    goto :goto_2

    .line 361
    :cond_9
    move-object/from16 v21, v11

    .line 362
    .line 363
    :goto_2
    new-instance v16, LN1/w;

    .line 364
    .line 365
    const-string v19, ""

    .line 366
    .line 367
    new-instance v8, LN1/r;

    .line 368
    .line 369
    invoke-direct {v8, v4}, LN1/q;-><init>(LJ5/n;)V

    .line 370
    .line 371
    .line 372
    new-instance v4, LN1/s;

    .line 373
    .line 374
    invoke-direct {v4, v3}, LN1/s;-><init>(LE5/Y;)V

    .line 375
    .line 376
    .line 377
    sget-object v23, LN1/z;->B:LN1/z;

    .line 378
    .line 379
    move-object/from16 v22, v4

    .line 380
    .line 381
    move-object/from16 v20, v8

    .line 382
    .line 383
    move-object/from16 v18, v16

    .line 384
    .line 385
    invoke-direct/range {v18 .. v24}, LN1/w;-><init>(Ljava/lang/String;LN1/r;LN1/t;LN1/s;LN1/z;LN1/u;)V

    .line 386
    .line 387
    .line 388
    move-object/from16 v3, v18

    .line 389
    .line 390
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 391
    .line 392
    .line 393
    new-instance v15, Lk2/Z;

    .line 394
    .line 395
    invoke-virtual {v2, v3}, LMf/d;->b(LN1/w;)LZ1/g;

    .line 396
    .line 397
    .line 398
    move-result-object v19

    .line 399
    const/high16 v21, 0x100000

    .line 400
    .line 401
    const/16 v22, 0x0

    .line 402
    .line 403
    move-object/from16 v18, v0

    .line 404
    .line 405
    move-object/from16 v16, v3

    .line 406
    .line 407
    move-object/from16 v20, v7

    .line 408
    .line 409
    invoke-direct/range {v15 .. v22}, Lk2/Z;-><init>(LN1/w;LS3/c;Lcom/unity3d/services/core/webview/b;LZ1/g;Lae/d;IZ)V

    .line 410
    .line 411
    .line 412
    move-object v0, v15

    .line 413
    goto/16 :goto_8

    .line 414
    .line 415
    :catchall_0
    move-exception v0

    .line 416
    :try_start_1
    monitor-exit v10
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 417
    throw v0

    .line 418
    :pswitch_2
    const-string v0, "start"

    .line 419
    .line 420
    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 421
    .line 422
    .line 423
    move-result-object v0

    .line 424
    invoke-static {v0}, Leb/c;->Q(Ljava/lang/Object;)Ljava/lang/Long;

    .line 425
    .line 426
    .line 427
    move-result-object v0

    .line 428
    const-string v2, "end"

    .line 429
    .line 430
    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 431
    .line 432
    .line 433
    move-result-object v2

    .line 434
    invoke-static {v2}, Leb/c;->Q(Ljava/lang/Object;)Ljava/lang/Long;

    .line 435
    .line 436
    .line 437
    move-result-object v2

    .line 438
    new-instance v10, Lk2/h;

    .line 439
    .line 440
    const-string v3, "child"

    .line 441
    .line 442
    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 443
    .line 444
    .line 445
    move-result-object v3

    .line 446
    invoke-virtual {v1, v3}, Leb/c;->M(Ljava/lang/Object;)Lk2/a;

    .line 447
    .line 448
    .line 449
    move-result-object v11

    .line 450
    if-eqz v0, :cond_a

    .line 451
    .line 452
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 453
    .line 454
    .line 455
    move-result-wide v8

    .line 456
    :cond_a
    move-wide v12, v8

    .line 457
    if-eqz v2, :cond_b

    .line 458
    .line 459
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 460
    .line 461
    .line 462
    move-result-wide v2

    .line 463
    :goto_3
    move-wide v14, v2

    .line 464
    goto :goto_4

    .line 465
    :cond_b
    const-wide/high16 v2, -0x8000000000000000L

    .line 466
    .line 467
    goto :goto_3

    .line 468
    :goto_4
    const/16 v16, 0x1

    .line 469
    .line 470
    invoke-direct/range {v10 .. v16}, Lk2/h;-><init>(Lk2/a;JJZ)V

    .line 471
    .line 472
    .line 473
    move-object v0, v10

    .line 474
    goto/16 :goto_8

    .line 475
    .line 476
    :pswitch_3
    const-string v3, "count"

    .line 477
    .line 478
    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 479
    .line 480
    .line 481
    move-result-object v3

    .line 482
    check-cast v3, Ljava/lang/Integer;

    .line 483
    .line 484
    const-string v7, "child"

    .line 485
    .line 486
    invoke-interface {v4, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 487
    .line 488
    .line 489
    move-result-object v4

    .line 490
    invoke-virtual {v1, v4}, Leb/c;->M(Ljava/lang/Object;)Lk2/a;

    .line 491
    .line 492
    .line 493
    move-result-object v4

    .line 494
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 495
    .line 496
    .line 497
    move-result v3

    .line 498
    new-array v7, v3, [Lk2/a;

    .line 499
    .line 500
    move v8, v0

    .line 501
    :goto_5
    if-ge v8, v3, :cond_c

    .line 502
    .line 503
    aput-object v4, v7, v8

    .line 504
    .line 505
    add-int/2addr v8, v2

    .line 506
    goto :goto_5

    .line 507
    :cond_c
    new-instance v2, Lk2/t;

    .line 508
    .line 509
    new-instance v3, Lk2/g0;

    .line 510
    .line 511
    invoke-direct {v3}, Lk2/g0;-><init>()V

    .line 512
    .line 513
    .line 514
    invoke-direct {v2, v0, v3, v7}, Lk2/t;-><init>(ZLk2/g0;[Lk2/a;)V

    .line 515
    .line 516
    .line 517
    move-object v0, v2

    .line 518
    goto/16 :goto_8

    .line 519
    .line 520
    :pswitch_4
    new-instance v0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;

    .line 521
    .line 522
    const-string v2, "headers"

    .line 523
    .line 524
    invoke-static {v4, v2}, Leb/c;->T(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 525
    .line 526
    .line 527
    move-result-object v2

    .line 528
    check-cast v2, Ljava/util/Map;

    .line 529
    .line 530
    invoke-virtual {v1, v2}, Leb/c;->y(Ljava/util/Map;)LS3/c;

    .line 531
    .line 532
    .line 533
    move-result-object v2

    .line 534
    invoke-direct {v0, v2}, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;-><init>(LS1/g;)V

    .line 535
    .line 536
    .line 537
    new-instance v2, LJ5/n;

    .line 538
    .line 539
    invoke-direct {v2, v3}, LJ5/n;-><init>(I)V

    .line 540
    .line 541
    .line 542
    sget-object v3, Ll8/K;->b:Ll8/I;

    .line 543
    .line 544
    sget-object v3, Ll8/e0;->e:Ll8/e0;

    .line 545
    .line 546
    sget-object v12, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 547
    .line 548
    sget-object v13, Ll8/e0;->e:Ll8/e0;

    .line 549
    .line 550
    new-instance v3, LE5/Y;

    .line 551
    .line 552
    invoke-direct {v3}, LE5/Y;-><init>()V

    .line 553
    .line 554
    .line 555
    sget-object v21, LN1/u;->a:LN1/u;

    .line 556
    .line 557
    const-string v7, "uri"

    .line 558
    .line 559
    invoke-interface {v4, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 560
    .line 561
    .line 562
    move-result-object v4

    .line 563
    check-cast v4, Ljava/lang/String;

    .line 564
    .line 565
    invoke-static {v4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 566
    .line 567
    .line 568
    move-result-object v9

    .line 569
    const-string v10, "application/dash+xml"

    .line 570
    .line 571
    if-eqz v9, :cond_d

    .line 572
    .line 573
    new-instance v8, LN1/t;

    .line 574
    .line 575
    const-wide v15, -0x7fffffffffffffffL    # -4.9E-324

    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    invoke-direct/range {v8 .. v16}, LN1/t;-><init>(Landroid/net/Uri;Ljava/lang/String;Lic/d;Ljava/util/List;Ll8/K;Ljava/lang/String;J)V

    .line 581
    .line 582
    .line 583
    move-object/from16 v18, v8

    .line 584
    .line 585
    goto :goto_6

    .line 586
    :cond_d
    move-object/from16 v18, v11

    .line 587
    .line 588
    :goto_6
    new-instance v15, LN1/w;

    .line 589
    .line 590
    const-string v16, ""

    .line 591
    .line 592
    new-instance v4, LN1/r;

    .line 593
    .line 594
    invoke-direct {v4, v2}, LN1/q;-><init>(LJ5/n;)V

    .line 595
    .line 596
    .line 597
    new-instance v2, LN1/s;

    .line 598
    .line 599
    invoke-direct {v2, v3}, LN1/s;-><init>(LE5/Y;)V

    .line 600
    .line 601
    .line 602
    sget-object v20, LN1/z;->B:LN1/z;

    .line 603
    .line 604
    move-object/from16 v19, v2

    .line 605
    .line 606
    move-object/from16 v17, v4

    .line 607
    .line 608
    invoke-direct/range {v15 .. v21}, LN1/w;-><init>(Ljava/lang/String;LN1/r;LN1/t;LN1/s;LN1/z;LN1/u;)V

    .line 609
    .line 610
    .line 611
    invoke-virtual {v0, v15}, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->d(LN1/w;)LX1/f;

    .line 612
    .line 613
    .line 614
    move-result-object v0

    .line 615
    goto/16 :goto_8

    .line 616
    .line 617
    :pswitch_5
    new-instance v0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;

    .line 618
    .line 619
    const-string v2, "headers"

    .line 620
    .line 621
    invoke-static {v4, v2}, Leb/c;->T(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 622
    .line 623
    .line 624
    move-result-object v2

    .line 625
    check-cast v2, Ljava/util/Map;

    .line 626
    .line 627
    invoke-virtual {v1, v2}, Leb/c;->y(Ljava/util/Map;)LS3/c;

    .line 628
    .line 629
    .line 630
    move-result-object v2

    .line 631
    invoke-direct {v0, v2}, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;-><init>(LS1/g;)V

    .line 632
    .line 633
    .line 634
    new-instance v2, LJ5/n;

    .line 635
    .line 636
    invoke-direct {v2, v3}, LJ5/n;-><init>(I)V

    .line 637
    .line 638
    .line 639
    sget-object v3, Ll8/K;->b:Ll8/I;

    .line 640
    .line 641
    sget-object v3, Ll8/e0;->e:Ll8/e0;

    .line 642
    .line 643
    sget-object v19, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 644
    .line 645
    sget-object v20, Ll8/e0;->e:Ll8/e0;

    .line 646
    .line 647
    new-instance v3, LE5/Y;

    .line 648
    .line 649
    invoke-direct {v3}, LE5/Y;-><init>()V

    .line 650
    .line 651
    .line 652
    sget-object v7, LN1/u;->a:LN1/u;

    .line 653
    .line 654
    const-string v8, "uri"

    .line 655
    .line 656
    invoke-interface {v4, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 657
    .line 658
    .line 659
    move-result-object v4

    .line 660
    check-cast v4, Ljava/lang/String;

    .line 661
    .line 662
    invoke-static {v4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 663
    .line 664
    .line 665
    move-result-object v16

    .line 666
    const-string v17, "application/x-mpegURL"

    .line 667
    .line 668
    if-eqz v16, :cond_e

    .line 669
    .line 670
    new-instance v15, LN1/t;

    .line 671
    .line 672
    const/16 v21, 0x0

    .line 673
    .line 674
    const-wide v22, -0x7fffffffffffffffL    # -4.9E-324

    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    move-object/from16 v18, v11

    .line 680
    .line 681
    invoke-direct/range {v15 .. v23}, LN1/t;-><init>(Landroid/net/Uri;Ljava/lang/String;Lic/d;Ljava/util/List;Ll8/K;Ljava/lang/String;J)V

    .line 682
    .line 683
    .line 684
    goto :goto_7

    .line 685
    :cond_e
    move-object v15, v11

    .line 686
    :goto_7
    new-instance v12, LN1/w;

    .line 687
    .line 688
    const-string v13, ""

    .line 689
    .line 690
    new-instance v14, LN1/r;

    .line 691
    .line 692
    invoke-direct {v14, v2}, LN1/q;-><init>(LJ5/n;)V

    .line 693
    .line 694
    .line 695
    new-instance v2, LN1/s;

    .line 696
    .line 697
    invoke-direct {v2, v3}, LN1/s;-><init>(LE5/Y;)V

    .line 698
    .line 699
    .line 700
    sget-object v17, LN1/z;->B:LN1/z;

    .line 701
    .line 702
    move-object/from16 v16, v2

    .line 703
    .line 704
    move-object/from16 v18, v7

    .line 705
    .line 706
    invoke-direct/range {v12 .. v18}, LN1/w;-><init>(Ljava/lang/String;LN1/r;LN1/t;LN1/s;LN1/z;LN1/u;)V

    .line 707
    .line 708
    .line 709
    invoke-virtual {v0, v12}, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->d(LN1/w;)La2/n;

    .line 710
    .line 711
    .line 712
    move-result-object v0

    .line 713
    goto :goto_8

    .line 714
    :pswitch_6
    new-instance v0, Lk2/t;

    .line 715
    .line 716
    const-string v2, "useLazyPreparation"

    .line 717
    .line 718
    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 719
    .line 720
    .line 721
    move-result-object v2

    .line 722
    check-cast v2, Ljava/lang/Boolean;

    .line 723
    .line 724
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 725
    .line 726
    .line 727
    move-result v2

    .line 728
    const-string v3, "shuffleOrder"

    .line 729
    .line 730
    invoke-static {v4, v3}, Leb/c;->T(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 731
    .line 732
    .line 733
    move-result-object v3

    .line 734
    check-cast v3, Ljava/util/List;

    .line 735
    .line 736
    invoke-static {v3}, Leb/c;->G(Ljava/util/List;)Lk2/g0;

    .line 737
    .line 738
    .line 739
    move-result-object v3

    .line 740
    const-string v7, "children"

    .line 741
    .line 742
    invoke-interface {v4, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 743
    .line 744
    .line 745
    move-result-object v4

    .line 746
    invoke-virtual {v1, v4}, Leb/c;->N(Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 747
    .line 748
    .line 749
    move-result-object v4

    .line 750
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 751
    .line 752
    .line 753
    move-result v7

    .line 754
    new-array v7, v7, [Lk2/a;

    .line 755
    .line 756
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 757
    .line 758
    .line 759
    invoke-direct {v0, v2, v3, v7}, Lk2/t;-><init>(ZLk2/g0;[Lk2/a;)V

    .line 760
    .line 761
    .line 762
    :goto_8
    invoke-virtual {v6, v5, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 763
    .line 764
    .line 765
    return-object v0

    .line 766
    :cond_f
    return-object v7

    .line 767
    :sswitch_data_0
    .sparse-switch
        -0x1a9425ce -> :sswitch_6
        0x193ef -> :sswitch_5
        0x2eef92 -> :sswitch_4
        0x14db9ebe -> :sswitch_3
        0x36c0fcc2 -> :sswitch_2
        0x43720b8b -> :sswitch_1
        0x7cbaf4a1 -> :sswitch_0
    .end sparse-switch

    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final N(Ljava/lang/Object;)Ljava/util/ArrayList;
    .locals 3

    .line 1
    instance-of v0, p1, Ljava/util/List;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    check-cast p1, Ljava/util/List;

    .line 6
    .line 7
    new-instance v0, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-ge v1, v2, :cond_0

    .line 18
    .line 19
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {p0, v2}, Leb/c;->M(Ljava/lang/Object;)Lk2/a;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    add-int/lit8 v1, v1, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    return-object v0

    .line 34
    :cond_1
    new-instance v0, Ljava/lang/RuntimeException;

    .line 35
    .line 36
    new-instance v1, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    const-string v2, "List expected: "

    .line 39
    .line 40
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw v0
.end method

.method public final O()J
    .locals 5

    .line 1
    iget v0, p0, Leb/c;->E:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eq v0, v1, :cond_2

    .line 5
    .line 6
    const/4 v1, 0x2

    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-object v0, p0, Leb/c;->g:Ljava/lang/Long;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    cmp-long v0, v0, v2

    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    iget-object v0, p0, Leb/c;->g:Ljava/lang/Long;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 30
    .line 31
    .line 32
    move-result-wide v0

    .line 33
    return-wide v0

    .line 34
    :cond_1
    iget-object v0, p0, Leb/c;->x:LU1/u;

    .line 35
    .line 36
    invoke-virtual {v0}, LU1/u;->m0()J

    .line 37
    .line 38
    .line 39
    move-result-wide v0

    .line 40
    return-wide v0

    .line 41
    :cond_2
    :goto_0
    iget-object v0, p0, Leb/c;->x:LU1/u;

    .line 42
    .line 43
    invoke-virtual {v0}, LU1/u;->m0()J

    .line 44
    .line 45
    .line 46
    move-result-wide v0

    .line 47
    const-wide/16 v2, 0x0

    .line 48
    .line 49
    cmp-long v4, v0, v2

    .line 50
    .line 51
    if-gez v4, :cond_3

    .line 52
    .line 53
    return-wide v2

    .line 54
    :cond_3
    return-wide v0
.end method

.method public final P()J
    .locals 2

    .line 1
    iget v0, p0, Leb/c;->E:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eq v0, v1, :cond_1

    .line 5
    .line 6
    const/4 v1, 0x2

    .line 7
    if-eq v0, v1, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Leb/c;->x:LU1/u;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {v0}, LU1/u;->q0()J

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    return-wide v0

    .line 19
    :cond_1
    :goto_0
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    return-wide v0
.end method

.method public final R(Ljava/util/List;Lk2/g0;JLjava/lang/Integer;Ltc/g;)V
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p5, :cond_0

    .line 3
    .line 4
    invoke-virtual {p5}, Ljava/lang/Integer;->intValue()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v1, v0

    .line 10
    :goto_0
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    iput-object v1, p0, Leb/c;->B:Ljava/lang/Integer;

    .line 15
    .line 16
    iget v1, p0, Leb/c;->E:I

    .line 17
    .line 18
    invoke-static {v1}, LA/f;->f(I)I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    const/4 v2, 0x0

    .line 23
    if-eqz v1, :cond_2

    .line 24
    .line 25
    const/4 v3, 0x1

    .line 26
    if-eq v1, v3, :cond_1

    .line 27
    .line 28
    iget-object v1, p0, Leb/c;->x:LU1/u;

    .line 29
    .line 30
    invoke-virtual {v1}, LU1/u;->S0()V

    .line 31
    .line 32
    .line 33
    iget-object v4, v1, LU1/u;->y:LU1/c;

    .line 34
    .line 35
    invoke-virtual {v1}, LU1/u;->s0()Z

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    invoke-virtual {v4, v3, v5}, LU1/c;->d(IZ)I

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1, v2}, LU1/u;->N0(LU1/j;)V

    .line 43
    .line 44
    .line 45
    new-instance v3, LP1/c;

    .line 46
    .line 47
    sget-object v4, Ll8/e0;->e:Ll8/e0;

    .line 48
    .line 49
    iget-object v1, v1, LU1/u;->d0:LU1/P;

    .line 50
    .line 51
    iget-wide v5, v1, LU1/P;->s:J

    .line 52
    .line 53
    invoke-direct {v3, v4}, LP1/c;-><init>(Ljava/util/List;)V

    .line 54
    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_1
    const v1, 0x989680

    .line 58
    .line 59
    .line 60
    const-string v4, "Connection aborted"

    .line 61
    .line 62
    invoke-virtual {p0, v1, v4, v2, v0}, Leb/c;->Y(ILjava/lang/String;Ljava/util/HashMap;Z)V

    .line 63
    .line 64
    .line 65
    iget-object v1, p0, Leb/c;->x:LU1/u;

    .line 66
    .line 67
    invoke-virtual {v1}, LU1/u;->S0()V

    .line 68
    .line 69
    .line 70
    iget-object v4, v1, LU1/u;->y:LU1/c;

    .line 71
    .line 72
    invoke-virtual {v1}, LU1/u;->s0()Z

    .line 73
    .line 74
    .line 75
    move-result v5

    .line 76
    invoke-virtual {v4, v3, v5}, LU1/c;->d(IZ)I

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1, v2}, LU1/u;->N0(LU1/j;)V

    .line 80
    .line 81
    .line 82
    new-instance v3, LP1/c;

    .line 83
    .line 84
    sget-object v4, Ll8/e0;->e:Ll8/e0;

    .line 85
    .line 86
    iget-object v1, v1, LU1/u;->d0:LU1/P;

    .line 87
    .line 88
    iget-wide v5, v1, LU1/P;->s:J

    .line 89
    .line 90
    invoke-direct {v3, v4}, LP1/c;-><init>(Ljava/util/List;)V

    .line 91
    .line 92
    .line 93
    :cond_2
    :goto_1
    iput-object p6, p0, Leb/c;->h:Ltc/g;

    .line 94
    .line 95
    invoke-virtual {p0}, Leb/c;->h0()V

    .line 96
    .line 97
    .line 98
    const/4 p6, 0x2

    .line 99
    iput p6, p0, Leb/c;->E:I

    .line 100
    .line 101
    iput-object v2, p0, Leb/c;->z:Ljava/lang/Integer;

    .line 102
    .line 103
    iput-object v2, p0, Leb/c;->A:Ljava/lang/String;

    .line 104
    .line 105
    invoke-virtual {p0}, Leb/c;->I()V

    .line 106
    .line 107
    .line 108
    if-eqz p5, :cond_3

    .line 109
    .line 110
    invoke-virtual {p5}, Ljava/lang/Integer;->intValue()I

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    :cond_3
    move v6, v0

    .line 115
    iget-object v1, p0, Leb/c;->x:LU1/u;

    .line 116
    .line 117
    invoke-virtual {v1}, LU1/u;->S0()V

    .line 118
    .line 119
    .line 120
    const/4 v3, 0x0

    .line 121
    move-object v2, p1

    .line 122
    move-wide v4, p3

    .line 123
    invoke-virtual/range {v1 .. v6}, LU1/u;->F0(Ljava/util/List;ZJI)V

    .line 124
    .line 125
    .line 126
    iget-object p1, p0, Leb/c;->x:LU1/u;

    .line 127
    .line 128
    invoke-virtual {p1, p2}, LU1/u;->J0(Lk2/g0;)V

    .line 129
    .line 130
    .line 131
    iget-object p1, p0, Leb/c;->x:LU1/u;

    .line 132
    .line 133
    invoke-virtual {p1}, LU1/u;->z0()V

    .line 134
    .line 135
    .line 136
    return-void
.end method

.method public final S(D)V
    .locals 2

    .line 1
    const-wide/high16 v0, 0x4059000000000000L    # 100.0

    .line 2
    .line 3
    mul-double/2addr p1, v0

    .line 4
    invoke-static {p1, p2}, Ljava/lang/Math;->round(D)J

    .line 5
    .line 6
    .line 7
    move-result-wide p1

    .line 8
    long-to-int p1, p1

    .line 9
    iget-object p2, p0, Leb/c;->u:Ljava/util/HashMap;

    .line 10
    .line 11
    const-string v0, "AndroidLoudnessEnhancer"

    .line 12
    .line 13
    invoke-virtual {p2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    check-cast p2, Landroid/media/audiofx/LoudnessEnhancer;

    .line 18
    .line 19
    invoke-virtual {p2, p1}, Landroid/media/audiofx/LoudnessEnhancer;->setTargetGain(I)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final V()V
    .locals 2

    .line 1
    iget-object v0, p0, Leb/c;->x:LU1/u;

    .line 2
    .line 3
    invoke-virtual {v0}, LU1/u;->s0()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-object v0, p0, Leb/c;->x:LU1/u;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-virtual {v0, v1}, LU1/u;->G0(Z)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Leb/c;->h0()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Leb/c;->I()V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Leb/c;->i:Ltc/g;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    new-instance v1, Ljava/util/HashMap;

    .line 27
    .line 28
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    const/4 v0, 0x0

    .line 35
    iput-object v0, p0, Leb/c;->i:Ltc/g;

    .line 36
    .line 37
    :cond_1
    :goto_0
    return-void
.end method

.method public final W(Ltc/g;)V
    .locals 2

    .line 1
    iget-object v0, p0, Leb/c;->x:LU1/u;

    .line 2
    .line 3
    invoke-virtual {v0}, LU1/u;->s0()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance v0, Ljava/util/HashMap;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, v0}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iget-object v0, p0, Leb/c;->i:Ltc/g;

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    new-instance v1, Ljava/util/HashMap;

    .line 23
    .line 24
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    :cond_1
    iput-object p1, p0, Leb/c;->i:Ltc/g;

    .line 31
    .line 32
    iget-object p1, p0, Leb/c;->x:LU1/u;

    .line 33
    .line 34
    const/4 v0, 0x1

    .line 35
    invoke-virtual {p1, v0}, LU1/u;->G0(Z)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Leb/c;->h0()V

    .line 39
    .line 40
    .line 41
    iget p1, p0, Leb/c;->E:I

    .line 42
    .line 43
    const/4 v0, 0x5

    .line 44
    if-ne p1, v0, :cond_2

    .line 45
    .line 46
    iget-object p1, p0, Leb/c;->i:Ltc/g;

    .line 47
    .line 48
    if-eqz p1, :cond_2

    .line 49
    .line 50
    new-instance v0, Ljava/util/HashMap;

    .line 51
    .line 52
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1, v0}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    const/4 p1, 0x0

    .line 59
    iput-object p1, p0, Leb/c;->i:Ltc/g;

    .line 60
    .line 61
    :cond_2
    return-void
.end method

.method public final X(JLjava/lang/Integer;Ltc/g;)V
    .locals 3

    .line 1
    iget v0, p0, Leb/c;->E:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eq v0, v1, :cond_3

    .line 5
    .line 6
    const/4 v1, 0x2

    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    goto :goto_2

    .line 10
    :cond_0
    iget-object v0, p0, Leb/c;->j:Ltc/g;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    :try_start_0
    new-instance v2, Ljava/util/HashMap;

    .line 16
    .line 17
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v2}, Ltc/g;->a(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    .line 22
    .line 23
    :catch_0
    iput-object v1, p0, Leb/c;->j:Ltc/g;

    .line 24
    .line 25
    iput-object v1, p0, Leb/c;->g:Ljava/lang/Long;

    .line 26
    .line 27
    :cond_1
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iput-object v0, p0, Leb/c;->g:Ljava/lang/Long;

    .line 32
    .line 33
    iput-object p4, p0, Leb/c;->j:Ltc/g;

    .line 34
    .line 35
    if-eqz p3, :cond_2

    .line 36
    .line 37
    :try_start_1
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 38
    .line 39
    .line 40
    move-result p3

    .line 41
    goto :goto_0

    .line 42
    :catch_1
    move-exception p1

    .line 43
    goto :goto_1

    .line 44
    :cond_2
    iget-object p3, p0, Leb/c;->x:LU1/u;

    .line 45
    .line 46
    invoke-virtual {p3}, LU1/u;->l0()I

    .line 47
    .line 48
    .line 49
    move-result p3

    .line 50
    :goto_0
    iget-object p4, p0, Leb/c;->x:LU1/u;

    .line 51
    .line 52
    const/4 v0, 0x0

    .line 53
    invoke-virtual {p4, p1, p2, p3, v0}, LA7/B0;->O(JIZ)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :goto_1
    iput-object v1, p0, Leb/c;->j:Ltc/g;

    .line 58
    .line 59
    iput-object v1, p0, Leb/c;->g:Ljava/lang/Long;

    .line 60
    .line 61
    throw p1

    .line 62
    :cond_3
    :goto_2
    new-instance p1, Ljava/util/HashMap;

    .line 63
    .line 64
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p4, p1}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    return-void
.end method

.method public final Y(ILjava/lang/String;Ljava/util/HashMap;Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Leb/c;->b:Leb/d;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v0, v0, Leb/d;->a:Luc/h;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0, v1, p2, p3}, Luc/h;->c(Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iput-object v0, p0, Leb/c;->z:Ljava/lang/Integer;

    .line 19
    .line 20
    iput-object p2, p0, Leb/c;->A:Ljava/lang/String;

    .line 21
    .line 22
    if-eqz p4, :cond_1

    .line 23
    .line 24
    const/4 p4, 0x1

    .line 25
    iput p4, p0, Leb/c;->E:I

    .line 26
    .line 27
    :cond_1
    invoke-virtual {p0}, Leb/c;->r()V

    .line 28
    .line 29
    .line 30
    iget-object p4, p0, Leb/c;->h:Ltc/g;

    .line 31
    .line 32
    if-eqz p4, :cond_2

    .line 33
    .line 34
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p4, p1, p2, p3}, Ltc/g;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    const/4 p1, 0x0

    .line 42
    iput-object p1, p0, Leb/c;->h:Ltc/g;

    .line 43
    .line 44
    :cond_2
    return-void
.end method

.method public final Z(III)V
    .locals 1

    .line 1
    new-instance v0, LN1/c;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2, p3}, LN1/c;-><init>(III)V

    .line 4
    .line 5
    .line 6
    iget p1, p0, Leb/c;->E:I

    .line 7
    .line 8
    const/4 p2, 0x2

    .line 9
    if-ne p1, p2, :cond_0

    .line 10
    .line 11
    iput-object v0, p0, Leb/c;->n:LN1/c;

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget-object p1, p0, Leb/c;->x:LU1/u;

    .line 15
    .line 16
    const/4 p2, 0x0

    .line 17
    invoke-virtual {p1, v0, p2}, LU1/u;->E0(LN1/c;Z)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final synthetic a(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public final a0(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Leb/c;->x:LU1/u;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LU1/u;->I0(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final b(I)V
    .locals 9

    .line 1
    const/4 v0, 0x3

    .line 2
    const/4 v1, 0x2

    .line 3
    const/4 v2, 0x0

    .line 4
    if-eq p1, v1, :cond_9

    .line 5
    .line 6
    const/4 v1, 0x4

    .line 7
    const/4 v3, 0x0

    .line 8
    const-wide/16 v4, 0x3e8

    .line 9
    .line 10
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    const-string v8, "duration"

    .line 16
    .line 17
    if-eq p1, v0, :cond_4

    .line 18
    .line 19
    if-eq p1, v1, :cond_0

    .line 20
    .line 21
    goto/16 :goto_2

    .line 22
    .line 23
    :cond_0
    iget p1, p0, Leb/c;->E:I

    .line 24
    .line 25
    const/4 v0, 0x5

    .line 26
    if-eq p1, v0, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0}, Leb/c;->h0()V

    .line 29
    .line 30
    .line 31
    iput v0, p0, Leb/c;->E:I

    .line 32
    .line 33
    iput-object v2, p0, Leb/c;->z:Ljava/lang/Integer;

    .line 34
    .line 35
    iput-object v2, p0, Leb/c;->A:Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {p0}, Leb/c;->r()V

    .line 38
    .line 39
    .line 40
    :cond_1
    iget-object p1, p0, Leb/c;->h:Ltc/g;

    .line 41
    .line 42
    if-eqz p1, :cond_3

    .line 43
    .line 44
    new-instance p1, Ljava/util/HashMap;

    .line 45
    .line 46
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Leb/c;->P()J

    .line 50
    .line 51
    .line 52
    move-result-wide v0

    .line 53
    cmp-long v0, v0, v6

    .line 54
    .line 55
    if-nez v0, :cond_2

    .line 56
    .line 57
    move-object v0, v2

    .line 58
    goto :goto_0

    .line 59
    :cond_2
    invoke-virtual {p0}, Leb/c;->P()J

    .line 60
    .line 61
    .line 62
    move-result-wide v0

    .line 63
    mul-long/2addr v0, v4

    .line 64
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    :goto_0
    invoke-virtual {p1, v8, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    iget-object v0, p0, Leb/c;->h:Ltc/g;

    .line 72
    .line 73
    invoke-virtual {v0, p1}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    iput-object v2, p0, Leb/c;->h:Ltc/g;

    .line 77
    .line 78
    iget-object p1, p0, Leb/c;->n:LN1/c;

    .line 79
    .line 80
    if-eqz p1, :cond_3

    .line 81
    .line 82
    iget-object v0, p0, Leb/c;->x:LU1/u;

    .line 83
    .line 84
    invoke-virtual {v0, p1, v3}, LU1/u;->E0(LN1/c;Z)V

    .line 85
    .line 86
    .line 87
    iput-object v2, p0, Leb/c;->n:LN1/c;

    .line 88
    .line 89
    :cond_3
    iget-object p1, p0, Leb/c;->i:Ltc/g;

    .line 90
    .line 91
    if-eqz p1, :cond_8

    .line 92
    .line 93
    new-instance v0, Ljava/util/HashMap;

    .line 94
    .line 95
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p1, v0}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    iput-object v2, p0, Leb/c;->i:Ltc/g;

    .line 102
    .line 103
    return-void

    .line 104
    :cond_4
    iget-object p1, p0, Leb/c;->x:LU1/u;

    .line 105
    .line 106
    invoke-virtual {p1}, LU1/u;->s0()Z

    .line 107
    .line 108
    .line 109
    move-result p1

    .line 110
    if-eqz p1, :cond_5

    .line 111
    .line 112
    invoke-virtual {p0}, Leb/c;->h0()V

    .line 113
    .line 114
    .line 115
    :cond_5
    iput v1, p0, Leb/c;->E:I

    .line 116
    .line 117
    iput-object v2, p0, Leb/c;->z:Ljava/lang/Integer;

    .line 118
    .line 119
    iput-object v2, p0, Leb/c;->A:Ljava/lang/String;

    .line 120
    .line 121
    invoke-virtual {p0}, Leb/c;->r()V

    .line 122
    .line 123
    .line 124
    iget-object p1, p0, Leb/c;->h:Ltc/g;

    .line 125
    .line 126
    if-eqz p1, :cond_7

    .line 127
    .line 128
    new-instance p1, Ljava/util/HashMap;

    .line 129
    .line 130
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 131
    .line 132
    .line 133
    invoke-virtual {p0}, Leb/c;->P()J

    .line 134
    .line 135
    .line 136
    move-result-wide v0

    .line 137
    cmp-long v0, v0, v6

    .line 138
    .line 139
    if-nez v0, :cond_6

    .line 140
    .line 141
    move-object v0, v2

    .line 142
    goto :goto_1

    .line 143
    :cond_6
    invoke-virtual {p0}, Leb/c;->P()J

    .line 144
    .line 145
    .line 146
    move-result-wide v0

    .line 147
    mul-long/2addr v0, v4

    .line 148
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    :goto_1
    invoke-virtual {p1, v8, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    iget-object v0, p0, Leb/c;->h:Ltc/g;

    .line 156
    .line 157
    invoke-virtual {v0, p1}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    iput-object v2, p0, Leb/c;->h:Ltc/g;

    .line 161
    .line 162
    iget-object p1, p0, Leb/c;->n:LN1/c;

    .line 163
    .line 164
    if-eqz p1, :cond_7

    .line 165
    .line 166
    iget-object v0, p0, Leb/c;->x:LU1/u;

    .line 167
    .line 168
    invoke-virtual {v0, p1, v3}, LU1/u;->E0(LN1/c;Z)V

    .line 169
    .line 170
    .line 171
    iput-object v2, p0, Leb/c;->n:LN1/c;

    .line 172
    .line 173
    :cond_7
    iget-object p1, p0, Leb/c;->j:Ltc/g;

    .line 174
    .line 175
    if-eqz p1, :cond_8

    .line 176
    .line 177
    iput-object v2, p0, Leb/c;->g:Ljava/lang/Long;

    .line 178
    .line 179
    new-instance v0, Ljava/util/HashMap;

    .line 180
    .line 181
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 182
    .line 183
    .line 184
    invoke-virtual {p1, v0}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    iput-object v2, p0, Leb/c;->j:Ltc/g;

    .line 188
    .line 189
    :cond_8
    :goto_2
    return-void

    .line 190
    :cond_9
    invoke-virtual {p0}, Leb/c;->i0()Z

    .line 191
    .line 192
    .line 193
    iget p1, p0, Leb/c;->E:I

    .line 194
    .line 195
    if-eq p1, v0, :cond_a

    .line 196
    .line 197
    if-eq p1, v1, :cond_a

    .line 198
    .line 199
    iput v0, p0, Leb/c;->E:I

    .line 200
    .line 201
    iput-object v2, p0, Leb/c;->z:Ljava/lang/Integer;

    .line 202
    .line 203
    iput-object v2, p0, Leb/c;->A:Ljava/lang/String;

    .line 204
    .line 205
    invoke-virtual {p0}, Leb/c;->r()V

    .line 206
    .line 207
    .line 208
    :cond_a
    iget-object p1, p0, Leb/c;->C:Landroid/os/Handler;

    .line 209
    .line 210
    iget-object v0, p0, Leb/c;->D:LA7/V;

    .line 211
    .line 212
    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 216
    .line 217
    .line 218
    return-void
.end method

.method public final b0(F)V
    .locals 3

    .line 1
    iget-object v0, p0, Leb/c;->x:LU1/u;

    .line 2
    .line 3
    invoke-virtual {v0}, LU1/u;->S0()V

    .line 4
    .line 5
    .line 6
    iget-object v0, v0, LU1/u;->d0:LU1/P;

    .line 7
    .line 8
    iget-object v0, v0, LU1/P;->o:LN1/F;

    .line 9
    .line 10
    iget v1, v0, LN1/F;->b:F

    .line 11
    .line 12
    cmpl-float v1, v1, p1

    .line 13
    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    iget-object v1, p0, Leb/c;->x:LU1/u;

    .line 18
    .line 19
    new-instance v2, LN1/F;

    .line 20
    .line 21
    iget v0, v0, LN1/F;->a:F

    .line 22
    .line 23
    invoke-direct {v2, v0, p1}, LN1/F;-><init>(FF)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, v2}, LU1/u;->H0(LN1/F;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Leb/c;->I()V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final synthetic c(Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public final c0(Z)V
    .locals 5

    .line 1
    iget-object v0, p0, Leb/c;->x:LU1/u;

    .line 2
    .line 3
    invoke-virtual {v0}, LU1/u;->S0()V

    .line 4
    .line 5
    .line 6
    iget-boolean v1, v0, LU1/u;->D:Z

    .line 7
    .line 8
    if-eq v1, p1, :cond_0

    .line 9
    .line 10
    iput-boolean p1, v0, LU1/u;->D:Z

    .line 11
    .line 12
    iget-object v1, v0, LU1/u;->k:LU1/z;

    .line 13
    .line 14
    iget-object v1, v1, LU1/z;->i:LQ1/s;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-static {}, LQ1/s;->b()LQ1/r;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    iget-object v1, v1, LQ1/s;->a:Landroid/os/Handler;

    .line 24
    .line 25
    const/16 v3, 0xc

    .line 26
    .line 27
    const/4 v4, 0x0

    .line 28
    invoke-virtual {v1, v3, p1, v4}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    iput-object v1, v2, LQ1/r;->a:Landroid/os/Message;

    .line 33
    .line 34
    invoke-virtual {v2}, LQ1/r;->b()V

    .line 35
    .line 36
    .line 37
    new-instance v1, LE5/y;

    .line 38
    .line 39
    const/4 v2, 0x3

    .line 40
    invoke-direct {v1, p1, v2}, LE5/y;-><init>(ZI)V

    .line 41
    .line 42
    .line 43
    iget-object p1, v0, LU1/u;->l:LQ1/j;

    .line 44
    .line 45
    const/16 v2, 0x9

    .line 46
    .line 47
    invoke-virtual {p1, v2, v1}, LQ1/j;->c(ILQ1/g;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, LU1/u;->O0()V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1}, LQ1/j;->b()V

    .line 54
    .line 55
    .line 56
    :cond_0
    return-void
.end method

.method public final d(I)V
    .locals 7

    .line 1
    iget-object p1, p0, Leb/c;->x:LU1/u;

    .line 2
    .line 3
    invoke-virtual {p1}, LU1/u;->l0()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iget-object v0, p0, Leb/c;->B:Ljava/lang/Integer;

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    iput-object p1, p0, Leb/c;->B:Ljava/lang/Integer;

    .line 20
    .line 21
    invoke-virtual {p0}, Leb/c;->r()V

    .line 22
    .line 23
    .line 24
    :cond_0
    iget-object p1, p0, Leb/c;->x:LU1/u;

    .line 25
    .line 26
    invoke-virtual {p1}, LU1/u;->t0()I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    const/4 v0, 0x4

    .line 31
    if-ne p1, v0, :cond_a

    .line 32
    .line 33
    :try_start_0
    iget-object p1, p0, Leb/c;->x:LU1/u;

    .line 34
    .line 35
    invoke-virtual {p1}, LU1/u;->s0()Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    const/4 v0, 0x0

    .line 40
    const-wide/16 v1, 0x0

    .line 41
    .line 42
    if-eqz p1, :cond_9

    .line 43
    .line 44
    iget p1, p0, Leb/c;->v:I

    .line 45
    .line 46
    if-nez p1, :cond_1

    .line 47
    .line 48
    iget-object p1, p0, Leb/c;->x:LU1/u;

    .line 49
    .line 50
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1}, LU1/u;->o0()LN1/N;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-virtual {p1}, LN1/N;->o()I

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    if-lez p1, :cond_1

    .line 62
    .line 63
    iget-object p1, p0, Leb/c;->x:LU1/u;

    .line 64
    .line 65
    invoke-virtual {p1, v1, v2, v0, v0}, LA7/B0;->O(JIZ)V

    .line 66
    .line 67
    .line 68
    goto/16 :goto_4

    .line 69
    .line 70
    :catch_0
    move-exception p1

    .line 71
    goto/16 :goto_3

    .line 72
    .line 73
    :cond_1
    iget-object p1, p0, Leb/c;->x:LU1/u;

    .line 74
    .line 75
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1}, LU1/u;->o0()LN1/N;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-virtual {v1}, LN1/N;->p()Z

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    const/4 v3, -0x1

    .line 87
    const/4 v4, 0x1

    .line 88
    if-eqz v2, :cond_2

    .line 89
    .line 90
    move p1, v3

    .line 91
    goto :goto_0

    .line 92
    :cond_2
    invoke-virtual {p1}, LU1/u;->l0()I

    .line 93
    .line 94
    .line 95
    move-result v2

    .line 96
    invoke-virtual {p1}, LU1/u;->S0()V

    .line 97
    .line 98
    .line 99
    iget v5, p1, LU1/u;->C:I

    .line 100
    .line 101
    if-ne v5, v4, :cond_3

    .line 102
    .line 103
    move v5, v0

    .line 104
    :cond_3
    invoke-virtual {p1}, LU1/u;->S0()V

    .line 105
    .line 106
    .line 107
    iget-boolean p1, p1, LU1/u;->D:Z

    .line 108
    .line 109
    invoke-virtual {v1, v2, v5, p1}, LN1/N;->e(IIZ)I

    .line 110
    .line 111
    .line 112
    move-result p1

    .line 113
    :goto_0
    if-eq p1, v3, :cond_4

    .line 114
    .line 115
    move p1, v4

    .line 116
    goto :goto_1

    .line 117
    :cond_4
    move p1, v0

    .line 118
    :goto_1
    if-eqz p1, :cond_a

    .line 119
    .line 120
    iget-object p1, p0, Leb/c;->x:LU1/u;

    .line 121
    .line 122
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    invoke-virtual {p1}, LU1/u;->o0()LN1/N;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    invoke-virtual {v1}, LN1/N;->p()Z

    .line 130
    .line 131
    .line 132
    move-result v2

    .line 133
    if-eqz v2, :cond_5

    .line 134
    .line 135
    move v1, v3

    .line 136
    goto :goto_2

    .line 137
    :cond_5
    invoke-virtual {p1}, LU1/u;->l0()I

    .line 138
    .line 139
    .line 140
    move-result v2

    .line 141
    invoke-virtual {p1}, LU1/u;->S0()V

    .line 142
    .line 143
    .line 144
    iget v5, p1, LU1/u;->C:I

    .line 145
    .line 146
    if-ne v5, v4, :cond_6

    .line 147
    .line 148
    move v5, v0

    .line 149
    :cond_6
    invoke-virtual {p1}, LU1/u;->S0()V

    .line 150
    .line 151
    .line 152
    iget-boolean v6, p1, LU1/u;->D:Z

    .line 153
    .line 154
    invoke-virtual {v1, v2, v5, v6}, LN1/N;->e(IIZ)I

    .line 155
    .line 156
    .line 157
    move-result v1

    .line 158
    :goto_2
    if-ne v1, v3, :cond_7

    .line 159
    .line 160
    invoke-virtual {p1}, LU1/u;->S0()V

    .line 161
    .line 162
    .line 163
    goto :goto_4

    .line 164
    :cond_7
    invoke-virtual {p1}, LU1/u;->l0()I

    .line 165
    .line 166
    .line 167
    move-result v2

    .line 168
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    if-ne v1, v2, :cond_8

    .line 174
    .line 175
    invoke-virtual {p1}, LU1/u;->l0()I

    .line 176
    .line 177
    .line 178
    move-result v0

    .line 179
    invoke-virtual {p1, v5, v6, v0, v4}, LA7/B0;->O(JIZ)V

    .line 180
    .line 181
    .line 182
    goto :goto_4

    .line 183
    :cond_8
    invoke-virtual {p1, v5, v6, v1, v0}, LA7/B0;->O(JIZ)V

    .line 184
    .line 185
    .line 186
    goto :goto_4

    .line 187
    :cond_9
    iget-object p1, p0, Leb/c;->x:LU1/u;

    .line 188
    .line 189
    invoke-virtual {p1}, LU1/u;->l0()I

    .line 190
    .line 191
    .line 192
    move-result p1

    .line 193
    iget-object v3, p0, Leb/c;->x:LU1/u;

    .line 194
    .line 195
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v3}, LU1/u;->o0()LN1/N;

    .line 199
    .line 200
    .line 201
    move-result-object v3

    .line 202
    invoke-virtual {v3}, LN1/N;->o()I

    .line 203
    .line 204
    .line 205
    move-result v3

    .line 206
    if-ge p1, v3, :cond_a

    .line 207
    .line 208
    iget-object p1, p0, Leb/c;->x:LU1/u;

    .line 209
    .line 210
    invoke-virtual {p1}, LU1/u;->l0()I

    .line 211
    .line 212
    .line 213
    move-result v3

    .line 214
    invoke-virtual {p1, v1, v2, v3, v0}, LA7/B0;->O(JIZ)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 215
    .line 216
    .line 217
    goto :goto_4

    .line 218
    :goto_3
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 219
    .line 220
    .line 221
    :cond_a
    :goto_4
    iget-object p1, p0, Leb/c;->x:LU1/u;

    .line 222
    .line 223
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 224
    .line 225
    .line 226
    invoke-virtual {p1}, LU1/u;->o0()LN1/N;

    .line 227
    .line 228
    .line 229
    move-result-object p1

    .line 230
    invoke-virtual {p1}, LN1/N;->o()I

    .line 231
    .line 232
    .line 233
    move-result p1

    .line 234
    iput p1, p0, Leb/c;->v:I

    .line 235
    .line 236
    return-void
.end method

.method public final d0(Ljava/lang/Object;)V
    .locals 3

    .line 1
    check-cast p1, Ljava/util/Map;

    .line 2
    .line 3
    const-string v0, "id"

    .line 4
    .line 5
    invoke-static {p1, v0}, Leb/c;->T(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ljava/lang/String;

    .line 10
    .line 11
    iget-object v1, p0, Leb/c;->k:Ljava/util/HashMap;

    .line 12
    .line 13
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Lk2/a;

    .line 18
    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    const-string v1, "type"

    .line 23
    .line 24
    invoke-static {p1, v1}, Leb/c;->T(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    const-string v2, "concatenating"

    .line 34
    .line 35
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-nez v2, :cond_2

    .line 40
    .line 41
    const-string v0, "looping"

    .line 42
    .line 43
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-nez v0, :cond_1

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    const-string v0, "child"

    .line 51
    .line 52
    invoke-static {p1, v0}, Leb/c;->T(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-virtual {p0, p1}, Leb/c;->d0(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_2
    check-cast v0, Lk2/t;

    .line 61
    .line 62
    const-string v1, "shuffleOrder"

    .line 63
    .line 64
    invoke-static {p1, v1}, Leb/c;->T(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    check-cast v1, Ljava/util/List;

    .line 69
    .line 70
    invoke-static {v1}, Leb/c;->G(Ljava/util/List;)Lk2/g0;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-virtual {v0, v1}, Lk2/t;->M(Lk2/g0;)V

    .line 75
    .line 76
    .line 77
    const-string v0, "children"

    .line 78
    .line 79
    invoke-static {p1, v0}, Leb/c;->T(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    check-cast p1, Ljava/util/List;

    .line 84
    .line 85
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    if-eqz v0, :cond_3

    .line 94
    .line 95
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-virtual {p0, v0}, Leb/c;->d0(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_3
    :goto_1
    return-void
.end method

.method public final synthetic e(Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public final e0(Z)V
    .locals 4

    .line 1
    iget-object v0, p0, Leb/c;->x:LU1/u;

    .line 2
    .line 3
    invoke-virtual {v0}, LU1/u;->S0()V

    .line 4
    .line 5
    .line 6
    iget-boolean v1, v0, LU1/u;->W:Z

    .line 7
    .line 8
    if-ne v1, p1, :cond_0

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    iput-boolean p1, v0, LU1/u;->W:Z

    .line 12
    .line 13
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const/4 v2, 0x1

    .line 18
    const/16 v3, 0x9

    .line 19
    .line 20
    invoke-virtual {v0, v2, v3, v1}, LU1/u;->D0(IILjava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    new-instance v1, LE5/y;

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    invoke-direct {v1, p1, v2}, LE5/y;-><init>(ZI)V

    .line 27
    .line 28
    .line 29
    iget-object p1, v0, LU1/u;->l:LQ1/j;

    .line 30
    .line 31
    const/16 v0, 0x17

    .line 32
    .line 33
    invoke-virtual {p1, v0, v1}, LQ1/j;->e(ILQ1/g;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public final synthetic f(Ljava/util/List;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final f0(F)V
    .locals 3

    .line 1
    iget-object v0, p0, Leb/c;->x:LU1/u;

    .line 2
    .line 3
    invoke-virtual {v0}, LU1/u;->S0()V

    .line 4
    .line 5
    .line 6
    iget-object v0, v0, LU1/u;->d0:LU1/P;

    .line 7
    .line 8
    iget-object v0, v0, LU1/P;->o:LN1/F;

    .line 9
    .line 10
    iget v1, v0, LN1/F;->a:F

    .line 11
    .line 12
    cmpl-float v1, v1, p1

    .line 13
    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    iget-object v1, p0, Leb/c;->x:LU1/u;

    .line 18
    .line 19
    new-instance v2, LN1/F;

    .line 20
    .line 21
    iget v0, v0, LN1/F;->b:F

    .line 22
    .line 23
    invoke-direct {v2, p1, v0}, LN1/F;-><init>(FF)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, v2}, LU1/u;->H0(LN1/F;)V

    .line 27
    .line 28
    .line 29
    iget-object p1, p0, Leb/c;->x:LU1/u;

    .line 30
    .line 31
    invoke-virtual {p1}, LU1/u;->s0()Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-eqz p1, :cond_1

    .line 36
    .line 37
    invoke-virtual {p0}, Leb/c;->h0()V

    .line 38
    .line 39
    .line 40
    :cond_1
    invoke-virtual {p0}, Leb/c;->I()V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public final synthetic g(II)V
    .locals 0

    .line 1
    return-void
.end method

.method public final g0(F)V
    .locals 1

    .line 1
    iget-object v0, p0, Leb/c;->x:LU1/u;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LU1/u;->M0(F)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final synthetic h(Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public final h0()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Leb/c;->O()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iput-wide v0, p0, Leb/c;->d:J

    .line 6
    .line 7
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    iput-wide v0, p0, Leb/c;->e:J

    .line 12
    .line 13
    return-void
.end method

.method public final synthetic i(IZ)V
    .locals 0

    .line 1
    return-void
.end method

.method public final i0()Z
    .locals 4

    .line 1
    iget-object v0, p0, Leb/c;->x:LU1/u;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {v0}, LU1/u;->s0()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget v0, p0, Leb/c;->E:I

    .line 13
    .line 14
    const/4 v1, 0x4

    .line 15
    if-eq v0, v1, :cond_2

    .line 16
    .line 17
    :cond_1
    invoke-virtual {p0}, Leb/c;->O()J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    iget-wide v2, p0, Leb/c;->d:J

    .line 22
    .line 23
    cmp-long v0, v0, v2

    .line 24
    .line 25
    if-nez v0, :cond_2

    .line 26
    .line 27
    :goto_0
    const/4 v0, 0x0

    .line 28
    return v0

    .line 29
    :cond_2
    invoke-virtual {p0}, Leb/c;->O()J

    .line 30
    .line 31
    .line 32
    move-result-wide v0

    .line 33
    iput-wide v0, p0, Leb/c;->d:J

    .line 34
    .line 35
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 36
    .line 37
    .line 38
    move-result-wide v0

    .line 39
    iput-wide v0, p0, Leb/c;->e:J

    .line 40
    .line 41
    const/4 v0, 0x1

    .line 42
    return v0
.end method

.method public final synthetic j(F)V
    .locals 0

    .line 1
    return-void
.end method

.method public final synthetic k(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public final synthetic l(IZ)V
    .locals 0

    .line 1
    return-void
.end method

.method public final synthetic m(Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public final synthetic n(Ln2/i;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final o(LN1/B;)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p1, LN1/B;->a:[LN1/A;

    .line 3
    .line 4
    array-length v2, v1

    .line 5
    if-ge v0, v2, :cond_1

    .line 6
    .line 7
    aget-object v1, v1, v0

    .line 8
    .line 9
    instance-of v2, v1, LF2/c;

    .line 10
    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    check-cast v1, LF2/c;

    .line 14
    .line 15
    iput-object v1, p0, Leb/c;->l:LF2/c;

    .line 16
    .line 17
    invoke-virtual {p0}, Leb/c;->r()V

    .line 18
    .line 19
    .line 20
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    return-void
.end method

.method public final onMethodCall(Luc/o;Luc/q;)V
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    const-string v8, "Illegal state: "

    .line 6
    .line 7
    const-string v9, "Error: "

    .line 8
    .line 9
    invoke-virtual {v1}, Leb/c;->J()V

    .line 10
    .line 11
    .line 12
    const/4 v10, 0x0

    .line 13
    :try_start_0
    iget-object v2, v0, Luc/o;->a:Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    const/4 v5, 0x1

    .line 20
    sparse-switch v3, :sswitch_data_0

    .line 21
    .line 22
    .line 23
    goto/16 :goto_0

    .line 24
    .line 25
    :sswitch_0
    const-string v3, "audioEffectSetEnabled"

    .line 26
    .line 27
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_0

    .line 32
    .line 33
    const/16 v2, 0x12

    .line 34
    .line 35
    goto/16 :goto_1

    .line 36
    .line 37
    :catchall_0
    move-exception v0

    .line 38
    goto/16 :goto_a

    .line 39
    .line 40
    :catch_0
    move-exception v0

    .line 41
    goto/16 :goto_6

    .line 42
    .line 43
    :catch_1
    move-exception v0

    .line 44
    goto/16 :goto_8

    .line 45
    .line 46
    :sswitch_1
    const-string v3, "setAutomaticallyWaitsToMinimizeStalling"

    .line 47
    .line 48
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-eqz v2, :cond_0

    .line 53
    .line 54
    const/16 v2, 0xa

    .line 55
    .line 56
    goto/16 :goto_1

    .line 57
    .line 58
    :sswitch_2
    const-string v3, "androidEqualizerGetParameters"

    .line 59
    .line 60
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-eqz v2, :cond_0

    .line 65
    .line 66
    const/16 v2, 0x14

    .line 67
    .line 68
    goto/16 :goto_1

    .line 69
    .line 70
    :sswitch_3
    const-string v3, "setPreferredPeakBitRate"

    .line 71
    .line 72
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    if-eqz v2, :cond_0

    .line 77
    .line 78
    const/16 v2, 0xc

    .line 79
    .line 80
    goto/16 :goto_1

    .line 81
    .line 82
    :sswitch_4
    const-string v3, "setSpeed"

    .line 83
    .line 84
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    if-eqz v2, :cond_0

    .line 89
    .line 90
    const/4 v2, 0x4

    .line 91
    goto/16 :goto_1

    .line 92
    .line 93
    :sswitch_5
    const-string v3, "setPitch"

    .line 94
    .line 95
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v2

    .line 99
    if-eqz v2, :cond_0

    .line 100
    .line 101
    const/4 v2, 0x5

    .line 102
    goto/16 :goto_1

    .line 103
    .line 104
    :sswitch_6
    const-string v3, "concatenatingMove"

    .line 105
    .line 106
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v2

    .line 110
    if-eqz v2, :cond_0

    .line 111
    .line 112
    const/16 v2, 0x10

    .line 113
    .line 114
    goto/16 :goto_1

    .line 115
    .line 116
    :sswitch_7
    const-string v3, "concatenatingRemoveRange"

    .line 117
    .line 118
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result v2

    .line 122
    if-eqz v2, :cond_0

    .line 123
    .line 124
    const/16 v2, 0xf

    .line 125
    .line 126
    goto/16 :goto_1

    .line 127
    .line 128
    :sswitch_8
    const-string v3, "setVolume"

    .line 129
    .line 130
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result v2

    .line 134
    if-eqz v2, :cond_0

    .line 135
    .line 136
    const/4 v2, 0x3

    .line 137
    goto/16 :goto_1

    .line 138
    .line 139
    :sswitch_9
    const-string v3, "pause"

    .line 140
    .line 141
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v2

    .line 145
    if-eqz v2, :cond_0

    .line 146
    .line 147
    const/4 v2, 0x2

    .line 148
    goto/16 :goto_1

    .line 149
    .line 150
    :sswitch_a
    const-string v3, "seek"

    .line 151
    .line 152
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result v2

    .line 156
    if-eqz v2, :cond_0

    .line 157
    .line 158
    const/16 v2, 0xd

    .line 159
    .line 160
    goto/16 :goto_1

    .line 161
    .line 162
    :sswitch_b
    const-string v3, "play"

    .line 163
    .line 164
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move-result v2

    .line 168
    if-eqz v2, :cond_0

    .line 169
    .line 170
    move v2, v5

    .line 171
    goto/16 :goto_1

    .line 172
    .line 173
    :sswitch_c
    const-string v3, "load"

    .line 174
    .line 175
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    move-result v2

    .line 179
    if-eqz v2, :cond_0

    .line 180
    .line 181
    const/4 v2, 0x0

    .line 182
    goto/16 :goto_1

    .line 183
    .line 184
    :sswitch_d
    const-string v3, "setLoopMode"

    .line 185
    .line 186
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    move-result v2

    .line 190
    if-eqz v2, :cond_0

    .line 191
    .line 192
    const/4 v2, 0x7

    .line 193
    goto :goto_1

    .line 194
    :sswitch_e
    const-string v3, "setAndroidAudioAttributes"

    .line 195
    .line 196
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 197
    .line 198
    .line 199
    move-result v2

    .line 200
    if-eqz v2, :cond_0

    .line 201
    .line 202
    const/16 v2, 0x11

    .line 203
    .line 204
    goto :goto_1

    .line 205
    :sswitch_f
    const-string v3, "androidLoudnessEnhancerSetTargetGain"

    .line 206
    .line 207
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 208
    .line 209
    .line 210
    move-result v2

    .line 211
    if-eqz v2, :cond_0

    .line 212
    .line 213
    const/16 v2, 0x13

    .line 214
    .line 215
    goto :goto_1

    .line 216
    :sswitch_10
    const-string v3, "setCanUseNetworkResourcesForLiveStreamingWhilePaused"

    .line 217
    .line 218
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 219
    .line 220
    .line 221
    move-result v2

    .line 222
    if-eqz v2, :cond_0

    .line 223
    .line 224
    const/16 v2, 0xb

    .line 225
    .line 226
    goto :goto_1

    .line 227
    :sswitch_11
    const-string v3, "setShuffleOrder"

    .line 228
    .line 229
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 230
    .line 231
    .line 232
    move-result v2

    .line 233
    if-eqz v2, :cond_0

    .line 234
    .line 235
    const/16 v2, 0x9

    .line 236
    .line 237
    goto :goto_1

    .line 238
    :sswitch_12
    const-string v3, "concatenatingInsertAll"

    .line 239
    .line 240
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 241
    .line 242
    .line 243
    move-result v2

    .line 244
    if-eqz v2, :cond_0

    .line 245
    .line 246
    const/16 v2, 0xe

    .line 247
    .line 248
    goto :goto_1

    .line 249
    :sswitch_13
    const-string v3, "setSkipSilence"

    .line 250
    .line 251
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 252
    .line 253
    .line 254
    move-result v2

    .line 255
    if-eqz v2, :cond_0

    .line 256
    .line 257
    const/4 v2, 0x6

    .line 258
    goto :goto_1

    .line 259
    :sswitch_14
    const-string v3, "setShuffleMode"

    .line 260
    .line 261
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 262
    .line 263
    .line 264
    move-result v2

    .line 265
    if-eqz v2, :cond_0

    .line 266
    .line 267
    const/16 v2, 0x8

    .line 268
    .line 269
    goto :goto_1

    .line 270
    :sswitch_15
    const-string v3, "androidEqualizerBandSetGain"

    .line 271
    .line 272
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 273
    .line 274
    .line 275
    move-result v2
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 276
    if-eqz v2, :cond_0

    .line 277
    .line 278
    const/16 v2, 0x15

    .line 279
    .line 280
    goto :goto_1

    .line 281
    :cond_0
    :goto_0
    const/4 v2, -0x1

    .line 282
    :goto_1
    iget-object v3, v1, Leb/c;->C:Landroid/os/Handler;

    .line 283
    .line 284
    const-string v6, "audioSource"

    .line 285
    .line 286
    const-wide v13, -0x7fffffffffffffffL    # -4.9E-324

    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    const-string v7, "enabled"

    .line 292
    .line 293
    const-string v15, "children"

    .line 294
    .line 295
    const-string v4, "index"

    .line 296
    .line 297
    const-wide/16 v16, 0x3e8

    .line 298
    .line 299
    const-string v11, "shuffleOrder"

    .line 300
    .line 301
    const-string v12, "id"

    .line 302
    .line 303
    packed-switch v2, :pswitch_data_0

    .line 304
    .line 305
    .line 306
    :try_start_1
    move-object/from16 v0, p2

    .line 307
    .line 308
    check-cast v0, Ltc/g;

    .line 309
    .line 310
    invoke-virtual {v0}, Ltc/g;->c()V

    .line 311
    .line 312
    .line 313
    goto/16 :goto_5

    .line 314
    .line 315
    :pswitch_0
    const-string v2, "bandIndex"

    .line 316
    .line 317
    invoke-virtual {v0, v2}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    move-result-object v2

    .line 321
    check-cast v2, Ljava/lang/Integer;

    .line 322
    .line 323
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 324
    .line 325
    .line 326
    move-result v2

    .line 327
    const-string v3, "gain"

    .line 328
    .line 329
    invoke-virtual {v0, v3}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 330
    .line 331
    .line 332
    move-result-object v0

    .line 333
    check-cast v0, Ljava/lang/Double;

    .line 334
    .line 335
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    .line 336
    .line 337
    .line 338
    move-result-wide v3

    .line 339
    invoke-virtual {v1, v3, v4, v2}, Leb/c;->L(DI)V

    .line 340
    .line 341
    .line 342
    new-instance v0, Ljava/util/HashMap;

    .line 343
    .line 344
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 345
    .line 346
    .line 347
    move-object/from16 v2, p2

    .line 348
    .line 349
    check-cast v2, Ltc/g;

    .line 350
    .line 351
    invoke-virtual {v2, v0}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 352
    .line 353
    .line 354
    goto/16 :goto_5

    .line 355
    .line 356
    :pswitch_1
    invoke-virtual {v1}, Leb/c;->K()Ljava/util/HashMap;

    .line 357
    .line 358
    .line 359
    move-result-object v0

    .line 360
    move-object/from16 v2, p2

    .line 361
    .line 362
    check-cast v2, Ltc/g;

    .line 363
    .line 364
    invoke-virtual {v2, v0}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 365
    .line 366
    .line 367
    goto/16 :goto_5

    .line 368
    .line 369
    :pswitch_2
    const-string v2, "targetGain"

    .line 370
    .line 371
    invoke-virtual {v0, v2}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 372
    .line 373
    .line 374
    move-result-object v0

    .line 375
    check-cast v0, Ljava/lang/Double;

    .line 376
    .line 377
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    .line 378
    .line 379
    .line 380
    move-result-wide v2

    .line 381
    invoke-virtual {v1, v2, v3}, Leb/c;->S(D)V

    .line 382
    .line 383
    .line 384
    new-instance v0, Ljava/util/HashMap;

    .line 385
    .line 386
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 387
    .line 388
    .line 389
    move-object/from16 v2, p2

    .line 390
    .line 391
    check-cast v2, Ltc/g;

    .line 392
    .line 393
    invoke-virtual {v2, v0}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 394
    .line 395
    .line 396
    goto/16 :goto_5

    .line 397
    .line 398
    :pswitch_3
    const-string v2, "type"

    .line 399
    .line 400
    invoke-virtual {v0, v2}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 401
    .line 402
    .line 403
    move-result-object v2

    .line 404
    check-cast v2, Ljava/lang/String;

    .line 405
    .line 406
    invoke-virtual {v0, v7}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 407
    .line 408
    .line 409
    move-result-object v0

    .line 410
    check-cast v0, Ljava/lang/Boolean;

    .line 411
    .line 412
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 413
    .line 414
    .line 415
    move-result v0

    .line 416
    invoke-virtual {v1, v2, v0}, Leb/c;->q(Ljava/lang/String;Z)V

    .line 417
    .line 418
    .line 419
    new-instance v0, Ljava/util/HashMap;

    .line 420
    .line 421
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 422
    .line 423
    .line 424
    move-object/from16 v2, p2

    .line 425
    .line 426
    check-cast v2, Ltc/g;

    .line 427
    .line 428
    invoke-virtual {v2, v0}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 429
    .line 430
    .line 431
    goto/16 :goto_5

    .line 432
    .line 433
    :pswitch_4
    const-string v2, "contentType"

    .line 434
    .line 435
    invoke-virtual {v0, v2}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 436
    .line 437
    .line 438
    move-result-object v2

    .line 439
    check-cast v2, Ljava/lang/Integer;

    .line 440
    .line 441
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 442
    .line 443
    .line 444
    move-result v2

    .line 445
    const-string v3, "flags"

    .line 446
    .line 447
    invoke-virtual {v0, v3}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 448
    .line 449
    .line 450
    move-result-object v3

    .line 451
    check-cast v3, Ljava/lang/Integer;

    .line 452
    .line 453
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 454
    .line 455
    .line 456
    move-result v3

    .line 457
    const-string v4, "usage"

    .line 458
    .line 459
    invoke-virtual {v0, v4}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 460
    .line 461
    .line 462
    move-result-object v0

    .line 463
    check-cast v0, Ljava/lang/Integer;

    .line 464
    .line 465
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 466
    .line 467
    .line 468
    move-result v0

    .line 469
    invoke-virtual {v1, v2, v3, v0}, Leb/c;->Z(III)V

    .line 470
    .line 471
    .line 472
    new-instance v0, Ljava/util/HashMap;

    .line 473
    .line 474
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 475
    .line 476
    .line 477
    move-object/from16 v2, p2

    .line 478
    .line 479
    check-cast v2, Ltc/g;

    .line 480
    .line 481
    invoke-virtual {v2, v0}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 482
    .line 483
    .line 484
    goto/16 :goto_5

    .line 485
    .line 486
    :pswitch_5
    invoke-virtual {v0, v12}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 487
    .line 488
    .line 489
    move-result-object v2

    .line 490
    check-cast v2, Ljava/lang/String;

    .line 491
    .line 492
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 493
    .line 494
    .line 495
    move-result v2
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 496
    const-string v4, "newIndex"

    .line 497
    .line 498
    const-string v5, "currentIndex"

    .line 499
    .line 500
    if-nez v2, :cond_1

    .line 501
    .line 502
    :try_start_2
    iget-object v2, v1, Leb/c;->x:LU1/u;

    .line 503
    .line 504
    invoke-virtual {v0, v5}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 505
    .line 506
    .line 507
    move-result-object v3

    .line 508
    check-cast v3, Ljava/lang/Integer;

    .line 509
    .line 510
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 511
    .line 512
    .line 513
    move-result v3

    .line 514
    invoke-virtual {v0, v4}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 515
    .line 516
    .line 517
    move-result-object v4

    .line 518
    check-cast v4, Ljava/lang/Integer;

    .line 519
    .line 520
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 521
    .line 522
    .line 523
    move-result v4

    .line 524
    invoke-virtual {v2, v3, v4}, LA7/B0;->L(II)V

    .line 525
    .line 526
    .line 527
    iget-object v2, v1, Leb/c;->x:LU1/u;

    .line 528
    .line 529
    invoke-virtual {v0, v11}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 530
    .line 531
    .line 532
    move-result-object v0

    .line 533
    check-cast v0, Ljava/util/List;

    .line 534
    .line 535
    invoke-static {v0}, Leb/c;->G(Ljava/util/List;)Lk2/g0;

    .line 536
    .line 537
    .line 538
    move-result-object v0

    .line 539
    invoke-virtual {v2, v0}, LU1/u;->J0(Lk2/g0;)V

    .line 540
    .line 541
    .line 542
    new-instance v0, Ljava/util/HashMap;

    .line 543
    .line 544
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 545
    .line 546
    .line 547
    move-object/from16 v2, p2

    .line 548
    .line 549
    check-cast v2, Ltc/g;

    .line 550
    .line 551
    invoke-virtual {v2, v0}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 552
    .line 553
    .line 554
    goto/16 :goto_5

    .line 555
    .line 556
    :cond_1
    invoke-virtual {v0, v12}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 557
    .line 558
    .line 559
    move-result-object v2

    .line 560
    invoke-virtual {v1, v2}, Leb/c;->D(Ljava/lang/Object;)Lk2/t;

    .line 561
    .line 562
    .line 563
    move-result-object v2

    .line 564
    invoke-virtual {v0, v5}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 565
    .line 566
    .line 567
    move-result-object v5

    .line 568
    check-cast v5, Ljava/lang/Integer;

    .line 569
    .line 570
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 571
    .line 572
    .line 573
    move-result v5

    .line 574
    invoke-virtual {v0, v4}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 575
    .line 576
    .line 577
    move-result-object v4

    .line 578
    check-cast v4, Ljava/lang/Integer;

    .line 579
    .line 580
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 581
    .line 582
    .line 583
    move-result v4

    .line 584
    new-instance v6, LCg/b;

    .line 585
    .line 586
    move-object/from16 v7, p2

    .line 587
    .line 588
    check-cast v7, Ltc/g;

    .line 589
    .line 590
    const/4 v13, 0x5

    .line 591
    invoke-direct {v6, v7, v13}, LCg/b;-><init>(Ltc/g;I)V

    .line 592
    .line 593
    .line 594
    invoke-virtual {v2, v5, v4, v3, v6}, Lk2/t;->I(IILandroid/os/Handler;LCg/b;)V

    .line 595
    .line 596
    .line 597
    invoke-virtual {v0, v12}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 598
    .line 599
    .line 600
    move-result-object v2

    .line 601
    invoke-virtual {v1, v2}, Leb/c;->D(Ljava/lang/Object;)Lk2/t;

    .line 602
    .line 603
    .line 604
    move-result-object v2

    .line 605
    invoke-virtual {v0, v11}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 606
    .line 607
    .line 608
    move-result-object v0

    .line 609
    check-cast v0, Ljava/util/List;

    .line 610
    .line 611
    invoke-static {v0}, Leb/c;->G(Ljava/util/List;)Lk2/g0;

    .line 612
    .line 613
    .line 614
    move-result-object v0

    .line 615
    invoke-virtual {v2, v0}, Lk2/t;->M(Lk2/g0;)V

    .line 616
    .line 617
    .line 618
    goto/16 :goto_5

    .line 619
    .line 620
    :pswitch_6
    invoke-virtual {v0, v12}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 621
    .line 622
    .line 623
    move-result-object v2

    .line 624
    check-cast v2, Ljava/lang/String;

    .line 625
    .line 626
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 627
    .line 628
    .line 629
    move-result v2
    :try_end_2
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 630
    const-string v4, "endIndex"

    .line 631
    .line 632
    const-string v5, "startIndex"

    .line 633
    .line 634
    if-nez v2, :cond_2

    .line 635
    .line 636
    :try_start_3
    iget-object v2, v1, Leb/c;->x:LU1/u;

    .line 637
    .line 638
    invoke-virtual {v0, v5}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 639
    .line 640
    .line 641
    move-result-object v3

    .line 642
    check-cast v3, Ljava/lang/Integer;

    .line 643
    .line 644
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 645
    .line 646
    .line 647
    move-result v3

    .line 648
    invoke-virtual {v0, v4}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 649
    .line 650
    .line 651
    move-result-object v4

    .line 652
    check-cast v4, Ljava/lang/Integer;

    .line 653
    .line 654
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 655
    .line 656
    .line 657
    move-result v4

    .line 658
    invoke-virtual {v2, v3, v4}, LU1/u;->B0(II)V

    .line 659
    .line 660
    .line 661
    iget-object v2, v1, Leb/c;->x:LU1/u;

    .line 662
    .line 663
    invoke-virtual {v0, v11}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 664
    .line 665
    .line 666
    move-result-object v0

    .line 667
    check-cast v0, Ljava/util/List;

    .line 668
    .line 669
    invoke-static {v0}, Leb/c;->G(Ljava/util/List;)Lk2/g0;

    .line 670
    .line 671
    .line 672
    move-result-object v0

    .line 673
    invoke-virtual {v2, v0}, LU1/u;->J0(Lk2/g0;)V

    .line 674
    .line 675
    .line 676
    new-instance v0, Ljava/util/HashMap;

    .line 677
    .line 678
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 679
    .line 680
    .line 681
    move-object/from16 v2, p2

    .line 682
    .line 683
    check-cast v2, Ltc/g;

    .line 684
    .line 685
    invoke-virtual {v2, v0}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 686
    .line 687
    .line 688
    goto/16 :goto_5

    .line 689
    .line 690
    :cond_2
    invoke-virtual {v0, v12}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 691
    .line 692
    .line 693
    move-result-object v2

    .line 694
    invoke-virtual {v1, v2}, Leb/c;->D(Ljava/lang/Object;)Lk2/t;

    .line 695
    .line 696
    .line 697
    move-result-object v2

    .line 698
    invoke-virtual {v0, v5}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 699
    .line 700
    .line 701
    move-result-object v5

    .line 702
    check-cast v5, Ljava/lang/Integer;

    .line 703
    .line 704
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 705
    .line 706
    .line 707
    move-result v5

    .line 708
    invoke-virtual {v0, v4}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 709
    .line 710
    .line 711
    move-result-object v4

    .line 712
    check-cast v4, Ljava/lang/Integer;

    .line 713
    .line 714
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 715
    .line 716
    .line 717
    move-result v4

    .line 718
    new-instance v6, LCg/b;

    .line 719
    .line 720
    move-object/from16 v7, p2

    .line 721
    .line 722
    check-cast v7, Ltc/g;

    .line 723
    .line 724
    const/4 v13, 0x4

    .line 725
    invoke-direct {v6, v7, v13}, LCg/b;-><init>(Ltc/g;I)V

    .line 726
    .line 727
    .line 728
    invoke-virtual {v2, v5, v4, v3, v6}, Lk2/t;->J(IILandroid/os/Handler;LCg/b;)V

    .line 729
    .line 730
    .line 731
    invoke-virtual {v0, v12}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 732
    .line 733
    .line 734
    move-result-object v2

    .line 735
    invoke-virtual {v1, v2}, Leb/c;->D(Ljava/lang/Object;)Lk2/t;

    .line 736
    .line 737
    .line 738
    move-result-object v2

    .line 739
    invoke-virtual {v0, v11}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 740
    .line 741
    .line 742
    move-result-object v0

    .line 743
    check-cast v0, Ljava/util/List;

    .line 744
    .line 745
    invoke-static {v0}, Leb/c;->G(Ljava/util/List;)Lk2/g0;

    .line 746
    .line 747
    .line 748
    move-result-object v0

    .line 749
    invoke-virtual {v2, v0}, Lk2/t;->M(Lk2/g0;)V

    .line 750
    .line 751
    .line 752
    goto/16 :goto_5

    .line 753
    .line 754
    :pswitch_7
    invoke-virtual {v0, v12}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 755
    .line 756
    .line 757
    move-result-object v2

    .line 758
    check-cast v2, Ljava/lang/String;

    .line 759
    .line 760
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 761
    .line 762
    .line 763
    move-result v2

    .line 764
    if-nez v2, :cond_3

    .line 765
    .line 766
    iget-object v2, v1, Leb/c;->x:LU1/u;

    .line 767
    .line 768
    invoke-virtual {v0, v4}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 769
    .line 770
    .line 771
    move-result-object v3

    .line 772
    check-cast v3, Ljava/lang/Integer;

    .line 773
    .line 774
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 775
    .line 776
    .line 777
    move-result v3

    .line 778
    invoke-virtual {v0, v15}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 779
    .line 780
    .line 781
    move-result-object v4

    .line 782
    invoke-virtual {v1, v4}, Leb/c;->N(Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 783
    .line 784
    .line 785
    move-result-object v4

    .line 786
    invoke-virtual {v2, v4, v3}, LU1/u;->f0(Ljava/util/ArrayList;I)V

    .line 787
    .line 788
    .line 789
    iget-object v2, v1, Leb/c;->x:LU1/u;

    .line 790
    .line 791
    invoke-virtual {v0, v11}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 792
    .line 793
    .line 794
    move-result-object v0

    .line 795
    check-cast v0, Ljava/util/List;

    .line 796
    .line 797
    invoke-static {v0}, Leb/c;->G(Ljava/util/List;)Lk2/g0;

    .line 798
    .line 799
    .line 800
    move-result-object v0

    .line 801
    invoke-virtual {v2, v0}, LU1/u;->J0(Lk2/g0;)V

    .line 802
    .line 803
    .line 804
    new-instance v0, Ljava/util/HashMap;

    .line 805
    .line 806
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 807
    .line 808
    .line 809
    move-object/from16 v2, p2

    .line 810
    .line 811
    check-cast v2, Ltc/g;

    .line 812
    .line 813
    invoke-virtual {v2, v0}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 814
    .line 815
    .line 816
    goto/16 :goto_5

    .line 817
    .line 818
    :cond_3
    invoke-virtual {v0, v12}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 819
    .line 820
    .line 821
    move-result-object v2

    .line 822
    invoke-virtual {v1, v2}, Leb/c;->D(Ljava/lang/Object;)Lk2/t;

    .line 823
    .line 824
    .line 825
    move-result-object v2

    .line 826
    invoke-virtual {v0, v4}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 827
    .line 828
    .line 829
    move-result-object v4

    .line 830
    check-cast v4, Ljava/lang/Integer;

    .line 831
    .line 832
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 833
    .line 834
    .line 835
    move-result v4

    .line 836
    invoke-virtual {v0, v15}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 837
    .line 838
    .line 839
    move-result-object v5

    .line 840
    invoke-virtual {v1, v5}, Leb/c;->N(Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 841
    .line 842
    .line 843
    move-result-object v5

    .line 844
    new-instance v6, LCg/b;

    .line 845
    .line 846
    move-object/from16 v7, p2

    .line 847
    .line 848
    check-cast v7, Ltc/g;

    .line 849
    .line 850
    const/4 v13, 0x3

    .line 851
    invoke-direct {v6, v7, v13}, LCg/b;-><init>(Ltc/g;I)V

    .line 852
    .line 853
    .line 854
    invoke-virtual {v2, v4, v5, v3, v6}, Lk2/t;->z(ILjava/util/ArrayList;Landroid/os/Handler;LCg/b;)V

    .line 855
    .line 856
    .line 857
    invoke-virtual {v0, v12}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 858
    .line 859
    .line 860
    move-result-object v2

    .line 861
    invoke-virtual {v1, v2}, Leb/c;->D(Ljava/lang/Object;)Lk2/t;

    .line 862
    .line 863
    .line 864
    move-result-object v2

    .line 865
    invoke-virtual {v0, v11}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 866
    .line 867
    .line 868
    move-result-object v0

    .line 869
    check-cast v0, Ljava/util/List;

    .line 870
    .line 871
    invoke-static {v0}, Leb/c;->G(Ljava/util/List;)Lk2/g0;

    .line 872
    .line 873
    .line 874
    move-result-object v0

    .line 875
    invoke-virtual {v2, v0}, Lk2/t;->M(Lk2/g0;)V

    .line 876
    .line 877
    .line 878
    goto/16 :goto_5

    .line 879
    .line 880
    :pswitch_8
    const-string v2, "position"

    .line 881
    .line 882
    invoke-virtual {v0, v2}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 883
    .line 884
    .line 885
    move-result-object v2

    .line 886
    invoke-static {v2}, Leb/c;->Q(Ljava/lang/Object;)Ljava/lang/Long;

    .line 887
    .line 888
    .line 889
    move-result-object v2

    .line 890
    invoke-virtual {v0, v4}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 891
    .line 892
    .line 893
    move-result-object v0

    .line 894
    check-cast v0, Ljava/lang/Integer;

    .line 895
    .line 896
    if-nez v2, :cond_4

    .line 897
    .line 898
    goto :goto_2

    .line 899
    :cond_4
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 900
    .line 901
    .line 902
    move-result-wide v2

    .line 903
    div-long v13, v2, v16

    .line 904
    .line 905
    :goto_2
    move-object/from16 v2, p2

    .line 906
    .line 907
    check-cast v2, Ltc/g;

    .line 908
    .line 909
    invoke-virtual {v1, v13, v14, v0, v2}, Leb/c;->X(JLjava/lang/Integer;Ltc/g;)V

    .line 910
    .line 911
    .line 912
    goto/16 :goto_5

    .line 913
    .line 914
    :pswitch_9
    new-instance v0, Ljava/util/HashMap;

    .line 915
    .line 916
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 917
    .line 918
    .line 919
    move-object/from16 v2, p2

    .line 920
    .line 921
    check-cast v2, Ltc/g;

    .line 922
    .line 923
    invoke-virtual {v2, v0}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 924
    .line 925
    .line 926
    goto/16 :goto_5

    .line 927
    .line 928
    :pswitch_a
    new-instance v0, Ljava/util/HashMap;

    .line 929
    .line 930
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 931
    .line 932
    .line 933
    move-object/from16 v2, p2

    .line 934
    .line 935
    check-cast v2, Ltc/g;

    .line 936
    .line 937
    invoke-virtual {v2, v0}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 938
    .line 939
    .line 940
    goto/16 :goto_5

    .line 941
    .line 942
    :pswitch_b
    new-instance v0, Ljava/util/HashMap;

    .line 943
    .line 944
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 945
    .line 946
    .line 947
    move-object/from16 v2, p2

    .line 948
    .line 949
    check-cast v2, Ltc/g;

    .line 950
    .line 951
    invoke-virtual {v2, v0}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 952
    .line 953
    .line 954
    goto/16 :goto_5

    .line 955
    .line 956
    :pswitch_c
    invoke-virtual {v0, v6}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 957
    .line 958
    .line 959
    move-result-object v0

    .line 960
    invoke-virtual {v1, v0}, Leb/c;->d0(Ljava/lang/Object;)V

    .line 961
    .line 962
    .line 963
    new-instance v0, Ljava/util/HashMap;

    .line 964
    .line 965
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 966
    .line 967
    .line 968
    move-object/from16 v2, p2

    .line 969
    .line 970
    check-cast v2, Ltc/g;

    .line 971
    .line 972
    invoke-virtual {v2, v0}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 973
    .line 974
    .line 975
    goto/16 :goto_5

    .line 976
    .line 977
    :pswitch_d
    const-string v2, "shuffleMode"

    .line 978
    .line 979
    invoke-virtual {v0, v2}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 980
    .line 981
    .line 982
    move-result-object v0

    .line 983
    check-cast v0, Ljava/lang/Integer;

    .line 984
    .line 985
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 986
    .line 987
    .line 988
    move-result v0

    .line 989
    if-ne v0, v5, :cond_5

    .line 990
    .line 991
    move v4, v5

    .line 992
    goto :goto_3

    .line 993
    :cond_5
    const/4 v4, 0x0

    .line 994
    :goto_3
    invoke-virtual {v1, v4}, Leb/c;->c0(Z)V

    .line 995
    .line 996
    .line 997
    new-instance v0, Ljava/util/HashMap;

    .line 998
    .line 999
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 1000
    .line 1001
    .line 1002
    move-object/from16 v2, p2

    .line 1003
    .line 1004
    check-cast v2, Ltc/g;

    .line 1005
    .line 1006
    invoke-virtual {v2, v0}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 1007
    .line 1008
    .line 1009
    goto/16 :goto_5

    .line 1010
    .line 1011
    :pswitch_e
    const-string v2, "loopMode"

    .line 1012
    .line 1013
    invoke-virtual {v0, v2}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 1014
    .line 1015
    .line 1016
    move-result-object v0

    .line 1017
    check-cast v0, Ljava/lang/Integer;

    .line 1018
    .line 1019
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 1020
    .line 1021
    .line 1022
    move-result v0

    .line 1023
    invoke-virtual {v1, v0}, Leb/c;->a0(I)V

    .line 1024
    .line 1025
    .line 1026
    new-instance v0, Ljava/util/HashMap;

    .line 1027
    .line 1028
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 1029
    .line 1030
    .line 1031
    move-object/from16 v2, p2

    .line 1032
    .line 1033
    check-cast v2, Ltc/g;

    .line 1034
    .line 1035
    invoke-virtual {v2, v0}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 1036
    .line 1037
    .line 1038
    goto/16 :goto_5

    .line 1039
    .line 1040
    :pswitch_f
    invoke-virtual {v0, v7}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 1041
    .line 1042
    .line 1043
    move-result-object v0

    .line 1044
    check-cast v0, Ljava/lang/Boolean;

    .line 1045
    .line 1046
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1047
    .line 1048
    .line 1049
    move-result v0

    .line 1050
    invoke-virtual {v1, v0}, Leb/c;->e0(Z)V

    .line 1051
    .line 1052
    .line 1053
    new-instance v0, Ljava/util/HashMap;

    .line 1054
    .line 1055
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 1056
    .line 1057
    .line 1058
    move-object/from16 v2, p2

    .line 1059
    .line 1060
    check-cast v2, Ltc/g;

    .line 1061
    .line 1062
    invoke-virtual {v2, v0}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 1063
    .line 1064
    .line 1065
    goto/16 :goto_5

    .line 1066
    .line 1067
    :pswitch_10
    const-string v2, "pitch"

    .line 1068
    .line 1069
    invoke-virtual {v0, v2}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 1070
    .line 1071
    .line 1072
    move-result-object v0

    .line 1073
    check-cast v0, Ljava/lang/Double;

    .line 1074
    .line 1075
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    .line 1076
    .line 1077
    .line 1078
    move-result-wide v2

    .line 1079
    double-to-float v0, v2

    .line 1080
    invoke-virtual {v1, v0}, Leb/c;->b0(F)V

    .line 1081
    .line 1082
    .line 1083
    new-instance v0, Ljava/util/HashMap;

    .line 1084
    .line 1085
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 1086
    .line 1087
    .line 1088
    move-object/from16 v2, p2

    .line 1089
    .line 1090
    check-cast v2, Ltc/g;

    .line 1091
    .line 1092
    invoke-virtual {v2, v0}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 1093
    .line 1094
    .line 1095
    goto/16 :goto_5

    .line 1096
    .line 1097
    :pswitch_11
    const-string v2, "speed"

    .line 1098
    .line 1099
    invoke-virtual {v0, v2}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 1100
    .line 1101
    .line 1102
    move-result-object v0

    .line 1103
    check-cast v0, Ljava/lang/Double;

    .line 1104
    .line 1105
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    .line 1106
    .line 1107
    .line 1108
    move-result-wide v2

    .line 1109
    double-to-float v0, v2

    .line 1110
    invoke-virtual {v1, v0}, Leb/c;->f0(F)V

    .line 1111
    .line 1112
    .line 1113
    new-instance v0, Ljava/util/HashMap;

    .line 1114
    .line 1115
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 1116
    .line 1117
    .line 1118
    move-object/from16 v2, p2

    .line 1119
    .line 1120
    check-cast v2, Ltc/g;

    .line 1121
    .line 1122
    invoke-virtual {v2, v0}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 1123
    .line 1124
    .line 1125
    goto/16 :goto_5

    .line 1126
    .line 1127
    :pswitch_12
    const-string v2, "volume"

    .line 1128
    .line 1129
    invoke-virtual {v0, v2}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 1130
    .line 1131
    .line 1132
    move-result-object v0

    .line 1133
    check-cast v0, Ljava/lang/Double;

    .line 1134
    .line 1135
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    .line 1136
    .line 1137
    .line 1138
    move-result-wide v2

    .line 1139
    double-to-float v0, v2

    .line 1140
    invoke-virtual {v1, v0}, Leb/c;->g0(F)V

    .line 1141
    .line 1142
    .line 1143
    new-instance v0, Ljava/util/HashMap;

    .line 1144
    .line 1145
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 1146
    .line 1147
    .line 1148
    move-object/from16 v2, p2

    .line 1149
    .line 1150
    check-cast v2, Ltc/g;

    .line 1151
    .line 1152
    invoke-virtual {v2, v0}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 1153
    .line 1154
    .line 1155
    goto :goto_5

    .line 1156
    :pswitch_13
    invoke-virtual {v1}, Leb/c;->V()V

    .line 1157
    .line 1158
    .line 1159
    new-instance v0, Ljava/util/HashMap;

    .line 1160
    .line 1161
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 1162
    .line 1163
    .line 1164
    move-object/from16 v2, p2

    .line 1165
    .line 1166
    check-cast v2, Ltc/g;

    .line 1167
    .line 1168
    invoke-virtual {v2, v0}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 1169
    .line 1170
    .line 1171
    goto :goto_5

    .line 1172
    :pswitch_14
    move-object/from16 v0, p2

    .line 1173
    .line 1174
    check-cast v0, Ltc/g;

    .line 1175
    .line 1176
    invoke-virtual {v1, v0}, Leb/c;->W(Ltc/g;)V

    .line 1177
    .line 1178
    .line 1179
    goto :goto_5

    .line 1180
    :pswitch_15
    const-string v2, "initialPosition"

    .line 1181
    .line 1182
    invoke-virtual {v0, v2}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 1183
    .line 1184
    .line 1185
    move-result-object v2

    .line 1186
    invoke-static {v2}, Leb/c;->Q(Ljava/lang/Object;)Ljava/lang/Long;

    .line 1187
    .line 1188
    .line 1189
    move-result-object v2

    .line 1190
    const-string v3, "initialIndex"

    .line 1191
    .line 1192
    invoke-virtual {v0, v3}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 1193
    .line 1194
    .line 1195
    move-result-object v3

    .line 1196
    check-cast v3, Ljava/lang/Integer;

    .line 1197
    .line 1198
    invoke-virtual {v0, v6}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 1199
    .line 1200
    .line 1201
    move-result-object v0

    .line 1202
    check-cast v0, Ljava/util/Map;

    .line 1203
    .line 1204
    invoke-interface {v0, v15}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1205
    .line 1206
    .line 1207
    move-result-object v4

    .line 1208
    invoke-virtual {v1, v4}, Leb/c;->N(Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 1209
    .line 1210
    .line 1211
    move-result-object v4

    .line 1212
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 1213
    .line 1214
    .line 1215
    move-result v5

    .line 1216
    new-array v5, v5, [Lk2/a;

    .line 1217
    .line 1218
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 1219
    .line 1220
    .line 1221
    invoke-static {v0, v11}, Leb/c;->T(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 1222
    .line 1223
    .line 1224
    move-result-object v0

    .line 1225
    check-cast v0, Ljava/util/List;

    .line 1226
    .line 1227
    invoke-static {v0}, Leb/c;->G(Ljava/util/List;)Lk2/g0;

    .line 1228
    .line 1229
    .line 1230
    move-result-object v0

    .line 1231
    invoke-static {v5}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 1232
    .line 1233
    .line 1234
    move-result-object v4

    .line 1235
    if-nez v2, :cond_6

    .line 1236
    .line 1237
    goto :goto_4

    .line 1238
    :cond_6
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 1239
    .line 1240
    .line 1241
    move-result-wide v5

    .line 1242
    div-long v13, v5, v16

    .line 1243
    .line 1244
    :goto_4
    move-object/from16 v7, p2

    .line 1245
    .line 1246
    check-cast v7, Ltc/g;

    .line 1247
    .line 1248
    move-object v6, v3

    .line 1249
    move-object v2, v4

    .line 1250
    move-wide v4, v13

    .line 1251
    move-object v3, v0

    .line 1252
    invoke-virtual/range {v1 .. v7}, Leb/c;->R(Ljava/util/List;Lk2/g0;JLjava/lang/Integer;Ltc/g;)V
    :try_end_3
    .catch Ljava/lang/IllegalStateException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 1253
    .line 1254
    .line 1255
    :goto_5
    invoke-virtual/range {p0 .. p0}, Leb/c;->s()V

    .line 1256
    .line 1257
    .line 1258
    return-void

    .line 1259
    :goto_6
    :try_start_4
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 1260
    .line 1261
    .line 1262
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1263
    .line 1264
    invoke-direct {v1, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1265
    .line 1266
    .line 1267
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1268
    .line 1269
    .line 1270
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1271
    .line 1272
    .line 1273
    move-result-object v1

    .line 1274
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1275
    .line 1276
    .line 1277
    move-result-object v0

    .line 1278
    move-object/from16 v2, p2

    .line 1279
    .line 1280
    check-cast v2, Ltc/g;

    .line 1281
    .line 1282
    invoke-virtual {v2, v1, v0, v10}, Ltc/g;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 1283
    .line 1284
    .line 1285
    :goto_7
    invoke-virtual/range {p0 .. p0}, Leb/c;->s()V

    .line 1286
    .line 1287
    .line 1288
    goto :goto_9

    .line 1289
    :goto_8
    :try_start_5
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 1290
    .line 1291
    .line 1292
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1293
    .line 1294
    invoke-direct {v1, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1295
    .line 1296
    .line 1297
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1298
    .line 1299
    .line 1300
    move-result-object v2

    .line 1301
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1302
    .line 1303
    .line 1304
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1305
    .line 1306
    .line 1307
    move-result-object v1

    .line 1308
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1309
    .line 1310
    .line 1311
    move-result-object v0

    .line 1312
    move-object/from16 v2, p2

    .line 1313
    .line 1314
    check-cast v2, Ltc/g;

    .line 1315
    .line 1316
    invoke-virtual {v2, v1, v0, v10}, Ltc/g;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 1317
    .line 1318
    .line 1319
    goto :goto_7

    .line 1320
    :goto_9
    return-void

    .line 1321
    :goto_a
    invoke-virtual/range {p0 .. p0}, Leb/c;->s()V

    .line 1322
    .line 1323
    .line 1324
    throw v0

    .line 1325
    :sswitch_data_0
    .sparse-switch
        -0x7aad3a17 -> :sswitch_15
        -0x76787586 -> :sswitch_14
        -0x6fccfba0 -> :sswitch_13
        -0x5bd749ea -> :sswitch_12
        -0x5878aea9 -> :sswitch_11
        -0x29f8037e -> :sswitch_10
        -0x1494f7ca -> :sswitch_f
        -0x64229a0 -> :sswitch_e
        -0x2e1df17 -> :sswitch_d
        0x32c4e6 -> :sswitch_c
        0x348b34 -> :sswitch_b
        0x35ce78 -> :sswitch_a
        0x65825f6 -> :sswitch_9
        0x27f73e1c -> :sswitch_8
        0x3264dd87 -> :sswitch_7
        0x3ad42123 -> :sswitch_6
        0x538783fe -> :sswitch_5
        0x53b4c105 -> :sswitch_4
        0x56b389ef -> :sswitch_3
        0x60da657d -> :sswitch_2
        0x613a0038 -> :sswitch_1
        0x7e381ce6 -> :sswitch_0
    .end sparse-switch

    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
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

.method public final synthetic p(LN1/Y;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final q(Ljava/lang/String;Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Leb/c;->u:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Landroid/media/audiofx/AudioEffect;

    .line 8
    .line 9
    invoke-virtual {p1, p2}, Landroid/media/audiofx/AudioEffect;->setEnabled(Z)I

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final r()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Leb/c;->I()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Leb/c;->s()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final s()V
    .locals 2

    .line 1
    iget-object v0, p0, Leb/c;->w:Ljava/util/HashMap;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Leb/c;->b:Leb/d;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Leb/d;->a(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    iput-object v0, p0, Leb/c;->w:Ljava/util/HashMap;

    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public final t(LN1/I;LN1/I;I)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Leb/c;->h0()V

    .line 2
    .line 3
    .line 4
    if-eqz p3, :cond_0

    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    if-eq p3, p1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-object p1, p0, Leb/c;->x:LU1/u;

    .line 11
    .line 12
    invoke-virtual {p1}, LU1/u;->l0()I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iget-object p2, p0, Leb/c;->B:Ljava/lang/Integer;

    .line 21
    .line 22
    invoke-virtual {p1, p2}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    if-nez p2, :cond_1

    .line 27
    .line 28
    iput-object p1, p0, Leb/c;->B:Ljava/lang/Integer;

    .line 29
    .line 30
    :cond_1
    :goto_0
    invoke-virtual {p0}, Leb/c;->r()V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public final synthetic u(LP1/c;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final synthetic v(LN1/c;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final synthetic w(LN1/z;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final synthetic x(LN1/E;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final y(Ljava/util/Map;)LS3/c;
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    move-object v2, v1

    .line 6
    goto :goto_1

    .line 7
    :cond_0
    new-instance v2, Ljava/util/HashMap;

    .line 8
    .line 9
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    if-eqz v4, :cond_1

    .line 25
    .line 26
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    move-object v5, v4

    .line 31
    check-cast v5, Ljava/lang/String;

    .line 32
    .line 33
    invoke-interface {p1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    check-cast v4, Ljava/lang/String;

    .line 38
    .line 39
    invoke-virtual {v2, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    :goto_1
    if-eqz v2, :cond_2

    .line 44
    .line 45
    const-string p1, "User-Agent"

    .line 46
    .line 47
    invoke-interface {v2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    move-object v1, p1

    .line 52
    check-cast v1, Ljava/lang/String;

    .line 53
    .line 54
    if-nez v1, :cond_2

    .line 55
    .line 56
    const-string p1, "user-agent"

    .line 57
    .line 58
    invoke-interface {v2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    move-object v1, p1

    .line 63
    check-cast v1, Ljava/lang/String;

    .line 64
    .line 65
    :cond_2
    iget-object p1, p0, Leb/c;->a:Landroid/content/Context;

    .line 66
    .line 67
    if-nez v1, :cond_3

    .line 68
    .line 69
    sget v1, LQ1/x;->a:I

    .line 70
    .line 71
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    const/4 v4, 0x0

    .line 80
    invoke-virtual {v3, v1, v4}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    iget-object v1, v1, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :catch_0
    const-string v1, "?"

    .line 88
    .line 89
    :goto_2
    const-string v3, "just_audio/"

    .line 90
    .line 91
    const-string v4, " (Linux;Android "

    .line 92
    .line 93
    invoke-static {v3, v1, v4}, Lcom/google/android/gms/internal/consent_sdk/a;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    sget-object v3, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 98
    .line 99
    const-string v4, ") AndroidXMedia3/1.5.1"

    .line 100
    .line 101
    invoke-static {v1, v3, v4}, Lwg/b;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    :cond_3
    new-instance v3, LN2/e;

    .line 106
    .line 107
    invoke-direct {v3, v0}, LN2/e;-><init>(I)V

    .line 108
    .line 109
    .line 110
    iput-object v1, v3, LN2/e;->f:Ljava/lang/Object;

    .line 111
    .line 112
    iput-boolean v0, v3, LN2/e;->d:Z

    .line 113
    .line 114
    if-eqz v2, :cond_4

    .line 115
    .line 116
    invoke-interface {v2}, Ljava/util/Map;->size()I

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    if-lez v0, :cond_4

    .line 121
    .line 122
    invoke-virtual {v3, v2}, LN2/e;->e(Ljava/util/HashMap;)V

    .line 123
    .line 124
    .line 125
    :cond_4
    new-instance v0, LS3/c;

    .line 126
    .line 127
    invoke-direct {v0, p1, v3}, LS3/c;-><init>(Landroid/content/Context;LN2/e;)V

    .line 128
    .line 129
    .line 130
    return-object v0
.end method

.method public final synthetic z(LN1/w;I)V
    .locals 0

    .line 1
    return-void
.end method
