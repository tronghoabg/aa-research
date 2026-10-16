.class public final Lf0/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:[F

.field public static final b:[F

.field public static final c:Lf0/n;

.field public static final d:Lf0/n;

.field public static final e:Lf0/n;

.field public static final f:Lf0/n;

.field public static final g:Lf0/n;

.field public static final h:Lf0/n;

.field public static final i:Lf0/n;

.field public static final j:Lf0/n;

.field public static final k:Lf0/n;

.field public static final l:Lf0/n;

.field public static final m:Lf0/n;

.field public static final n:Lf0/n;

.field public static final o:Lf0/n;

.field public static final p:Lf0/n;

.field public static final q:Lf0/i;

.field public static final r:Lf0/i;

.field public static final s:Lf0/n;

.field public static final t:[Lf0/c;


# direct methods
.method static constructor <clinit>()V
    .locals 43

    .line 1
    const/16 v0, 0x11

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    new-array v4, v1, [F

    .line 5
    .line 6
    fill-array-data v4, :array_0

    .line 7
    .line 8
    .line 9
    sput-object v4, Lf0/e;->a:[F

    .line 10
    .line 11
    new-array v13, v1, [F

    .line 12
    .line 13
    fill-array-data v13, :array_1

    .line 14
    .line 15
    .line 16
    sput-object v13, Lf0/e;->b:[F

    .line 17
    .line 18
    new-instance v6, Lf0/o;

    .line 19
    .line 20
    const-wide v21, 0x3fb3d0722149b580L    # 0.07739938080495357

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    const-wide v23, 0x3fa4b5dcc63f1412L    # 0.04045

    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    const-wide v15, 0x4003333333333333L    # 2.4

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    const-wide v17, 0x3fee54edcd0aeb60L    # 0.9478672985781991

    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    const-wide v19, 0x3faab1232f514a03L    # 0.05213270142180095

    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    move-object v14, v6

    .line 46
    invoke-direct/range {v14 .. v24}, Lf0/o;-><init>(DDDDD)V

    .line 47
    .line 48
    .line 49
    new-instance v14, Lf0/o;

    .line 50
    .line 51
    const-wide v15, 0x400199999999999aL    # 2.2

    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    invoke-direct/range {v14 .. v24}, Lf0/o;-><init>(DDDDD)V

    .line 57
    .line 58
    .line 59
    new-instance v2, Lf0/n;

    .line 60
    .line 61
    sget-object v5, Lf0/h;->d:Lf0/p;

    .line 62
    .line 63
    const/4 v7, 0x0

    .line 64
    const-string v3, "sRGB IEC61966-2.1"

    .line 65
    .line 66
    invoke-direct/range {v2 .. v7}, Lf0/n;-><init>(Ljava/lang/String;[FLf0/p;Lf0/o;I)V

    .line 67
    .line 68
    .line 69
    move-object/from16 v24, v2

    .line 70
    .line 71
    move-object v11, v6

    .line 72
    sput-object v24, Lf0/e;->c:Lf0/n;

    .line 73
    .line 74
    new-instance v2, Lf0/n;

    .line 75
    .line 76
    const/4 v8, 0x0

    .line 77
    const-string v3, "sRGB IEC61966-2.1 (Linear)"

    .line 78
    .line 79
    const/high16 v9, 0x3f800000    # 1.0f

    .line 80
    .line 81
    const/4 v10, 0x1

    .line 82
    const-wide/high16 v6, 0x3ff0000000000000L    # 1.0

    .line 83
    .line 84
    invoke-direct/range {v2 .. v10}, Lf0/n;-><init>(Ljava/lang/String;[FLf0/p;DFFI)V

    .line 85
    .line 86
    .line 87
    move-object/from16 v25, v2

    .line 88
    .line 89
    sput-object v25, Lf0/e;->d:Lf0/n;

    .line 90
    .line 91
    new-instance v2, Lf0/n;

    .line 92
    .line 93
    sget-object v7, Lf0/d;->j:Lf0/d;

    .line 94
    .line 95
    sget-object v8, Lf0/d;->k:Lf0/d;

    .line 96
    .line 97
    const v9, -0x40b374bc    # -0.799f

    .line 98
    .line 99
    .line 100
    const-string v3, "scRGB-nl IEC 61966-2-2:2003"

    .line 101
    .line 102
    const v10, 0x40198937    # 2.399f

    .line 103
    .line 104
    .line 105
    const/4 v12, 0x2

    .line 106
    const/4 v6, 0x0

    .line 107
    invoke-direct/range {v2 .. v12}, Lf0/n;-><init>(Ljava/lang/String;[FLf0/p;[FLtf/l;Ltf/l;FFLf0/o;I)V

    .line 108
    .line 109
    .line 110
    move-object/from16 v26, v2

    .line 111
    .line 112
    move-object v15, v11

    .line 113
    sput-object v26, Lf0/e;->e:Lf0/n;

    .line 114
    .line 115
    new-instance v2, Lf0/n;

    .line 116
    .line 117
    const/high16 v8, -0x41000000    # -0.5f

    .line 118
    .line 119
    const-string v3, "scRGB IEC 61966-2-2:2003"

    .line 120
    .line 121
    const v9, 0x40eff7cf    # 7.499f

    .line 122
    .line 123
    .line 124
    const/4 v10, 0x3

    .line 125
    const-wide/high16 v6, 0x3ff0000000000000L    # 1.0

    .line 126
    .line 127
    invoke-direct/range {v2 .. v10}, Lf0/n;-><init>(Ljava/lang/String;[FLf0/p;DFFI)V

    .line 128
    .line 129
    .line 130
    move-object/from16 v27, v2

    .line 131
    .line 132
    sput-object v27, Lf0/e;->f:Lf0/n;

    .line 133
    .line 134
    new-instance v7, Lf0/n;

    .line 135
    .line 136
    new-array v9, v1, [F

    .line 137
    .line 138
    fill-array-data v9, :array_2

    .line 139
    .line 140
    .line 141
    new-instance v11, Lf0/o;

    .line 142
    .line 143
    const-wide v35, 0x3fcc71c71c71c71cL    # 0.2222222222222222

    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    const-wide v37, 0x3fb4bc6a7ef9db23L    # 0.081

    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    const-wide v29, 0x4001c71c71c71c72L    # 2.2222222222222223

    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    const-wide v31, 0x3fed1e0c942633b7L    # 0.9099181073703367

    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    const-wide v33, 0x3fb70f9b5ece624dL    # 0.09008189262966333

    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    move-object/from16 v28, v11

    .line 169
    .line 170
    invoke-direct/range {v28 .. v38}, Lf0/o;-><init>(DDDDD)V

    .line 171
    .line 172
    .line 173
    const/4 v12, 0x4

    .line 174
    const-string v8, "Rec. ITU-R BT.709-5"

    .line 175
    .line 176
    move-object v10, v5

    .line 177
    invoke-direct/range {v7 .. v12}, Lf0/n;-><init>(Ljava/lang/String;[FLf0/p;Lf0/o;I)V

    .line 178
    .line 179
    .line 180
    move-object/from16 v28, v7

    .line 181
    .line 182
    sput-object v28, Lf0/e;->g:Lf0/n;

    .line 183
    .line 184
    new-instance v7, Lf0/n;

    .line 185
    .line 186
    new-array v9, v1, [F

    .line 187
    .line 188
    fill-array-data v9, :array_3

    .line 189
    .line 190
    .line 191
    new-instance v11, Lf0/o;

    .line 192
    .line 193
    const-wide v36, 0x3fcc71c71c71c71cL    # 0.2222222222222222

    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    const-wide v38, 0x3fb4d9e83e425aeeL    # 0.08145

    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    const-wide v30, 0x4001c71c71c71c72L    # 2.2222222222222223

    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    const-wide v32, 0x3fed1c03d1b450c3L    # 0.9096697898662786

    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    const-wide v34, 0x3fb71fe1725d79e9L    # 0.09033021013372146

    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    move-object/from16 v29, v11

    .line 219
    .line 220
    invoke-direct/range {v29 .. v39}, Lf0/o;-><init>(DDDDD)V

    .line 221
    .line 222
    .line 223
    const/4 v12, 0x5

    .line 224
    const-string v8, "Rec. ITU-R BT.2020-1"

    .line 225
    .line 226
    invoke-direct/range {v7 .. v12}, Lf0/n;-><init>(Ljava/lang/String;[FLf0/p;Lf0/o;I)V

    .line 227
    .line 228
    .line 229
    move-object/from16 v29, v7

    .line 230
    .line 231
    sput-object v29, Lf0/e;->h:Lf0/n;

    .line 232
    .line 233
    new-instance v30, Lf0/n;

    .line 234
    .line 235
    new-array v2, v1, [F

    .line 236
    .line 237
    fill-array-data v2, :array_4

    .line 238
    .line 239
    .line 240
    new-instance v3, Lf0/p;

    .line 241
    .line 242
    const v6, 0x3ea0c49c    # 0.314f

    .line 243
    .line 244
    .line 245
    const v7, 0x3eb3b646    # 0.351f

    .line 246
    .line 247
    .line 248
    invoke-direct {v3, v6, v7}, Lf0/p;-><init>(FF)V

    .line 249
    .line 250
    .line 251
    const/16 v36, 0x0

    .line 252
    .line 253
    const-string v31, "SMPTE RP 431-2-2007 DCI (P3)"

    .line 254
    .line 255
    const/high16 v37, 0x3f800000    # 1.0f

    .line 256
    .line 257
    const/16 v38, 0x6

    .line 258
    .line 259
    const-wide v34, 0x4004cccccccccccdL    # 2.6

    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    move-object/from16 v32, v2

    .line 265
    .line 266
    move-object/from16 v33, v3

    .line 267
    .line 268
    invoke-direct/range {v30 .. v38}, Lf0/n;-><init>(Ljava/lang/String;[FLf0/p;DFFI)V

    .line 269
    .line 270
    .line 271
    sput-object v30, Lf0/e;->i:Lf0/n;

    .line 272
    .line 273
    new-instance v5, Lf0/n;

    .line 274
    .line 275
    new-array v7, v1, [F

    .line 276
    .line 277
    fill-array-data v7, :array_5

    .line 278
    .line 279
    .line 280
    move-object/from16 v18, v10

    .line 281
    .line 282
    const/4 v10, 0x7

    .line 283
    const-string v6, "Display P3"

    .line 284
    .line 285
    move-object v9, v15

    .line 286
    move-object/from16 v8, v18

    .line 287
    .line 288
    invoke-direct/range {v5 .. v10}, Lf0/n;-><init>(Ljava/lang/String;[FLf0/p;Lf0/o;I)V

    .line 289
    .line 290
    .line 291
    move-object/from16 v31, v5

    .line 292
    .line 293
    sput-object v31, Lf0/e;->j:Lf0/n;

    .line 294
    .line 295
    new-instance v5, Lf0/n;

    .line 296
    .line 297
    sget-object v8, Lf0/h;->a:Lf0/p;

    .line 298
    .line 299
    new-instance v32, Lf0/o;

    .line 300
    .line 301
    const-wide v39, 0x3fcc71c71c71c71cL    # 0.2222222222222222

    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    const-wide v41, 0x3fb4bc6a7ef9db23L    # 0.081

    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    const-wide v33, 0x4001c71c71c71c72L    # 2.2222222222222223

    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    const-wide v35, 0x3fed1e0c942633b7L    # 0.9099181073703367

    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    const-wide v37, 0x3fb70f9b5ece624dL    # 0.09008189262966333

    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    invoke-direct/range {v32 .. v42}, Lf0/o;-><init>(DDDDD)V

    .line 327
    .line 328
    .line 329
    const/16 v10, 0x8

    .line 330
    .line 331
    const-string v6, "NTSC (1953)"

    .line 332
    .line 333
    move-object v7, v13

    .line 334
    move-object/from16 v9, v32

    .line 335
    .line 336
    invoke-direct/range {v5 .. v10}, Lf0/n;-><init>(Ljava/lang/String;[FLf0/p;Lf0/o;I)V

    .line 337
    .line 338
    .line 339
    move-object v13, v5

    .line 340
    sput-object v13, Lf0/e;->k:Lf0/n;

    .line 341
    .line 342
    new-instance v7, Lf0/n;

    .line 343
    .line 344
    new-array v9, v1, [F

    .line 345
    .line 346
    fill-array-data v9, :array_6

    .line 347
    .line 348
    .line 349
    new-instance v32, Lf0/o;

    .line 350
    .line 351
    invoke-direct/range {v32 .. v42}, Lf0/o;-><init>(DDDDD)V

    .line 352
    .line 353
    .line 354
    const/16 v12, 0x9

    .line 355
    .line 356
    const-string v8, "SMPTE-C RGB"

    .line 357
    .line 358
    move-object/from16 v10, v18

    .line 359
    .line 360
    move-object/from16 v11, v32

    .line 361
    .line 362
    invoke-direct/range {v7 .. v12}, Lf0/n;-><init>(Ljava/lang/String;[FLf0/p;Lf0/o;I)V

    .line 363
    .line 364
    .line 365
    move-object v8, v7

    .line 366
    move-object v5, v10

    .line 367
    sput-object v8, Lf0/e;->l:Lf0/n;

    .line 368
    .line 369
    new-instance v15, Lf0/n;

    .line 370
    .line 371
    new-array v2, v1, [F

    .line 372
    .line 373
    fill-array-data v2, :array_7

    .line 374
    .line 375
    .line 376
    const/16 v21, 0x0

    .line 377
    .line 378
    const-string v16, "Adobe RGB (1998)"

    .line 379
    .line 380
    const/high16 v22, 0x3f800000    # 1.0f

    .line 381
    .line 382
    const/16 v23, 0xa

    .line 383
    .line 384
    const-wide v19, 0x400199999999999aL    # 2.2

    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    move-object/from16 v17, v2

    .line 390
    .line 391
    move-object/from16 v18, v5

    .line 392
    .line 393
    invoke-direct/range {v15 .. v23}, Lf0/n;-><init>(Ljava/lang/String;[FLf0/p;DFFI)V

    .line 394
    .line 395
    .line 396
    sput-object v15, Lf0/e;->m:Lf0/n;

    .line 397
    .line 398
    new-instance v16, Lf0/n;

    .line 399
    .line 400
    new-array v2, v1, [F

    .line 401
    .line 402
    fill-array-data v2, :array_8

    .line 403
    .line 404
    .line 405
    sget-object v19, Lf0/h;->b:Lf0/p;

    .line 406
    .line 407
    new-instance v32, Lf0/o;

    .line 408
    .line 409
    const-wide/high16 v39, 0x3fb0000000000000L    # 0.0625

    .line 410
    .line 411
    const-wide v41, 0x3f9fff79c842fa51L    # 0.031248

    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    const-wide v33, 0x3ffccccccccccccdL    # 1.8

    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    const-wide/high16 v35, 0x3ff0000000000000L    # 1.0

    .line 422
    .line 423
    const-wide/16 v37, 0x0

    .line 424
    .line 425
    invoke-direct/range {v32 .. v42}, Lf0/o;-><init>(DDDDD)V

    .line 426
    .line 427
    .line 428
    const/16 v21, 0xb

    .line 429
    .line 430
    const-string v17, "ROMM RGB ISO 22028-2:2013"

    .line 431
    .line 432
    move-object/from16 v18, v2

    .line 433
    .line 434
    move-object/from16 v20, v32

    .line 435
    .line 436
    invoke-direct/range {v16 .. v21}, Lf0/n;-><init>(Ljava/lang/String;[FLf0/p;Lf0/o;I)V

    .line 437
    .line 438
    .line 439
    sput-object v16, Lf0/e;->n:Lf0/n;

    .line 440
    .line 441
    new-instance v32, Lf0/n;

    .line 442
    .line 443
    new-array v2, v1, [F

    .line 444
    .line 445
    fill-array-data v2, :array_9

    .line 446
    .line 447
    .line 448
    sget-object v35, Lf0/h;->c:Lf0/p;

    .line 449
    .line 450
    const v38, -0x38802000    # -65504.0f

    .line 451
    .line 452
    .line 453
    const-string v33, "SMPTE ST 2065-1:2012 ACES"

    .line 454
    .line 455
    const v39, 0x477fe000    # 65504.0f

    .line 456
    .line 457
    .line 458
    const/16 v40, 0xc

    .line 459
    .line 460
    const-wide/high16 v36, 0x3ff0000000000000L    # 1.0

    .line 461
    .line 462
    move-object/from16 v34, v2

    .line 463
    .line 464
    invoke-direct/range {v32 .. v40}, Lf0/n;-><init>(Ljava/lang/String;[FLf0/p;DFFI)V

    .line 465
    .line 466
    .line 467
    sput-object v32, Lf0/e;->o:Lf0/n;

    .line 468
    .line 469
    new-instance v33, Lf0/n;

    .line 470
    .line 471
    new-array v2, v1, [F

    .line 472
    .line 473
    fill-array-data v2, :array_a

    .line 474
    .line 475
    .line 476
    const v39, -0x38802000    # -65504.0f

    .line 477
    .line 478
    .line 479
    const-string v34, "Academy S-2014-004 ACEScg"

    .line 480
    .line 481
    const v40, 0x477fe000    # 65504.0f

    .line 482
    .line 483
    .line 484
    const/16 v41, 0xd

    .line 485
    .line 486
    const-wide/high16 v37, 0x3ff0000000000000L    # 1.0

    .line 487
    .line 488
    move-object/from16 v36, v35

    .line 489
    .line 490
    move-object/from16 v35, v2

    .line 491
    .line 492
    invoke-direct/range {v33 .. v41}, Lf0/n;-><init>(Ljava/lang/String;[FLf0/p;DFFI)V

    .line 493
    .line 494
    .line 495
    sput-object v33, Lf0/e;->p:Lf0/n;

    .line 496
    .line 497
    new-instance v17, Lf0/i;

    .line 498
    .line 499
    sget-wide v19, Lf0/b;->b:J

    .line 500
    .line 501
    const-string v22, "Generic XYZ"

    .line 502
    .line 503
    const/16 v18, 0xe

    .line 504
    .line 505
    const/16 v21, 0x1

    .line 506
    .line 507
    invoke-direct/range {v17 .. v22}, Lf0/i;-><init>(IJILjava/lang/String;)V

    .line 508
    .line 509
    .line 510
    sput-object v17, Lf0/e;->q:Lf0/i;

    .line 511
    .line 512
    new-instance v18, Lf0/i;

    .line 513
    .line 514
    sget-wide v20, Lf0/b;->c:J

    .line 515
    .line 516
    const-string v23, "Generic L*a*b*"

    .line 517
    .line 518
    const/16 v19, 0xf

    .line 519
    .line 520
    const/16 v22, 0x0

    .line 521
    .line 522
    invoke-direct/range {v18 .. v23}, Lf0/i;-><init>(IJILjava/lang/String;)V

    .line 523
    .line 524
    .line 525
    move-wide/from16 v9, v20

    .line 526
    .line 527
    sput-object v18, Lf0/e;->r:Lf0/i;

    .line 528
    .line 529
    new-instance v2, Lf0/n;

    .line 530
    .line 531
    const/16 v7, 0x10

    .line 532
    .line 533
    const-string v3, "None"

    .line 534
    .line 535
    move-object v6, v14

    .line 536
    invoke-direct/range {v2 .. v7}, Lf0/n;-><init>(Ljava/lang/String;[FLf0/p;Lf0/o;I)V

    .line 537
    .line 538
    .line 539
    sput-object v2, Lf0/e;->s:Lf0/n;

    .line 540
    .line 541
    new-instance v3, Lf0/j;

    .line 542
    .line 543
    const-string v4, "Oklab"

    .line 544
    .line 545
    invoke-direct {v3, v4, v9, v10, v0}, Lf0/c;-><init>(Ljava/lang/String;JI)V

    .line 546
    .line 547
    .line 548
    const/16 v4, 0x12

    .line 549
    .line 550
    new-array v4, v4, [Lf0/c;

    .line 551
    .line 552
    const/4 v5, 0x0

    .line 553
    aput-object v24, v4, v5

    .line 554
    .line 555
    const/4 v5, 0x1

    .line 556
    aput-object v25, v4, v5

    .line 557
    .line 558
    const/4 v5, 0x2

    .line 559
    aput-object v26, v4, v5

    .line 560
    .line 561
    const/4 v5, 0x3

    .line 562
    aput-object v27, v4, v5

    .line 563
    .line 564
    const/4 v5, 0x4

    .line 565
    aput-object v28, v4, v5

    .line 566
    .line 567
    const/4 v5, 0x5

    .line 568
    aput-object v29, v4, v5

    .line 569
    .line 570
    aput-object v30, v4, v1

    .line 571
    .line 572
    const/4 v1, 0x7

    .line 573
    aput-object v31, v4, v1

    .line 574
    .line 575
    const/16 v1, 0x8

    .line 576
    .line 577
    aput-object v13, v4, v1

    .line 578
    .line 579
    const/16 v1, 0x9

    .line 580
    .line 581
    aput-object v8, v4, v1

    .line 582
    .line 583
    const/16 v1, 0xa

    .line 584
    .line 585
    aput-object v15, v4, v1

    .line 586
    .line 587
    const/16 v1, 0xb

    .line 588
    .line 589
    aput-object v16, v4, v1

    .line 590
    .line 591
    const/16 v1, 0xc

    .line 592
    .line 593
    aput-object v32, v4, v1

    .line 594
    .line 595
    const/16 v1, 0xd

    .line 596
    .line 597
    aput-object v33, v4, v1

    .line 598
    .line 599
    const/16 v1, 0xe

    .line 600
    .line 601
    aput-object v17, v4, v1

    .line 602
    .line 603
    const/16 v1, 0xf

    .line 604
    .line 605
    aput-object v18, v4, v1

    .line 606
    .line 607
    const/16 v1, 0x10

    .line 608
    .line 609
    aput-object v2, v4, v1

    .line 610
    .line 611
    aput-object v3, v4, v0

    .line 612
    .line 613
    sput-object v4, Lf0/e;->t:[Lf0/c;

    .line 614
    .line 615
    return-void

    .line 616
    nop

    .line 617
    :array_0
    .array-data 4
        0x3f23d70a    # 0.64f
        0x3ea8f5c3    # 0.33f
        0x3e99999a    # 0.3f
        0x3f19999a    # 0.6f
        0x3e19999a    # 0.15f
        0x3d75c28f    # 0.06f
    .end array-data

    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    :array_1
    .array-data 4
        0x3f2b851f    # 0.67f
        0x3ea8f5c3    # 0.33f
        0x3e570a3d    # 0.21f
        0x3f35c28f    # 0.71f
        0x3e0f5c29    # 0.14f
        0x3da3d70a    # 0.08f
    .end array-data

    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    :array_2
    .array-data 4
        0x3f23d70a    # 0.64f
        0x3ea8f5c3    # 0.33f
        0x3e99999a    # 0.3f
        0x3f19999a    # 0.6f
        0x3e19999a    # 0.15f
        0x3d75c28f    # 0.06f
    .end array-data

    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    :array_3
    .array-data 4
        0x3f353f7d    # 0.708f
        0x3e958106    # 0.292f
        0x3e2e147b    # 0.17f
        0x3f4c0831    # 0.797f
        0x3e0624dd    # 0.131f
        0x3d3c6a7f    # 0.046f
    .end array-data

    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    :array_4
    .array-data 4
        0x3f2e147b    # 0.68f
        0x3ea3d70a    # 0.32f
        0x3e87ae14    # 0.265f
        0x3f30a3d7    # 0.69f
        0x3e19999a    # 0.15f
        0x3d75c28f    # 0.06f
    .end array-data

    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    :array_5
    .array-data 4
        0x3f2e147b    # 0.68f
        0x3ea3d70a    # 0.32f
        0x3e87ae14    # 0.265f
        0x3f30a3d7    # 0.69f
        0x3e19999a    # 0.15f
        0x3d75c28f    # 0.06f
    .end array-data

    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    :array_6
    .array-data 4
        0x3f2147ae    # 0.63f
        0x3eae147b    # 0.34f
        0x3e9eb852    # 0.31f
        0x3f1851ec    # 0.595f
        0x3e1eb852    # 0.155f
        0x3d8f5c29    # 0.07f
    .end array-data

    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    :array_7
    .array-data 4
        0x3f23d70a    # 0.64f
        0x3ea8f5c3    # 0.33f
        0x3e570a3d    # 0.21f
        0x3f35c28f    # 0.71f
        0x3e19999a    # 0.15f
        0x3d75c28f    # 0.06f
    .end array-data

    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    :array_8
    .array-data 4
        0x3f3c154d    # 0.7347f
        0x3e87d567    # 0.2653f
        0x3e236e2f    # 0.1596f
        0x3f572474    # 0.8404f
        0x3d15e9e2    # 0.0366f
        0x38d1b717    # 1.0E-4f
    .end array-data

    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    :array_9
    .array-data 4
        0x3f3c154d    # 0.7347f
        0x3e87d567    # 0.2653f
        0x0
        0x3f800000    # 1.0f
        0x38d1b717    # 1.0E-4f
        -0x42624dd3    # -0.077f
    .end array-data

    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
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
    :array_a
    .array-data 4
        0x3f36872b    # 0.713f
        0x3e960419    # 0.293f
        0x3e28f5c3    # 0.165f
        0x3f547ae1    # 0.83f
        0x3e03126f    # 0.128f
        0x3d343958    # 0.044f
    .end array-data
.end method
