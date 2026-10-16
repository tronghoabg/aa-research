.class public Lorg/apache/tika/sax/CleanPhoneText;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final cleanPhoneRegex:Ljava/lang/String; = "([2-9]\\d{2}[2-9]\\d{6})"

.field public static final cleanSubstitutions:[[[Ljava/lang/String;

.field static final phoneRegex:Ljava/lang/String; = "([{(<]{0,3}[2-9][\\W_]{0,3}\\d[\\W_]{0,3}\\d[\\W_]{0,6}[2-9][\\W_]{0,3}\\d[\\W_]{0,3}\\d[\\W_]{0,6}\\d[\\W_]{0,3}\\d[\\W_]{0,3}\\d[\\W_]{0,3}\\d)"


# direct methods
.method static constructor <clinit>()V
    .locals 30

    .line 1
    const/4 v0, 0x1

    .line 2
    new-array v1, v0, [[Ljava/lang/String;

    .line 3
    .line 4
    const-string v2, "&#\\d{1,3};"

    .line 5
    .line 6
    const-string v3, ""

    .line 7
    .line 8
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    const/4 v3, 0x0

    .line 13
    aput-object v2, v1, v3

    .line 14
    .line 15
    const/16 v2, 0x17

    .line 16
    .line 17
    new-array v4, v2, [[Ljava/lang/String;

    .line 18
    .line 19
    const-string v5, "th0usand"

    .line 20
    .line 21
    const-string v6, "thousand"

    .line 22
    .line 23
    filled-new-array {v5, v6}, [Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    aput-object v5, v4, v3

    .line 28
    .line 29
    const-string v5, "th1rteen"

    .line 30
    .line 31
    const-string v6, "thirteen"

    .line 32
    .line 33
    filled-new-array {v5, v6}, [Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    aput-object v5, v4, v0

    .line 38
    .line 39
    const-string v5, "f0urteen"

    .line 40
    .line 41
    const-string v6, "fourteen"

    .line 42
    .line 43
    filled-new-array {v5, v6}, [Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    const/4 v6, 0x2

    .line 48
    aput-object v5, v4, v6

    .line 49
    .line 50
    const-string v5, "e1ghteen"

    .line 51
    .line 52
    const-string v7, "eighteen"

    .line 53
    .line 54
    filled-new-array {v5, v7}, [Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    const/4 v7, 0x3

    .line 59
    aput-object v5, v4, v7

    .line 60
    .line 61
    const-string v5, "n1neteen"

    .line 62
    .line 63
    const-string v8, "nineteen"

    .line 64
    .line 65
    filled-new-array {v5, v8}, [Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    const/4 v8, 0x4

    .line 70
    aput-object v5, v4, v8

    .line 71
    .line 72
    const-string v5, "f1fteen"

    .line 73
    .line 74
    const-string v9, "fifteen"

    .line 75
    .line 76
    filled-new-array {v5, v9}, [Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    const/4 v9, 0x5

    .line 81
    aput-object v5, v4, v9

    .line 82
    .line 83
    const-string v5, "s1xteen"

    .line 84
    .line 85
    const-string v10, "sixteen"

    .line 86
    .line 87
    filled-new-array {v5, v10}, [Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v5

    .line 91
    const/4 v10, 0x6

    .line 92
    aput-object v5, v4, v10

    .line 93
    .line 94
    const-string v5, "th1rty"

    .line 95
    .line 96
    const-string v11, "thirty"

    .line 97
    .line 98
    filled-new-array {v5, v11}, [Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v5

    .line 102
    const/4 v11, 0x7

    .line 103
    aput-object v5, v4, v11

    .line 104
    .line 105
    const-string v5, "e1ghty"

    .line 106
    .line 107
    const-string v12, "eighty"

    .line 108
    .line 109
    filled-new-array {v5, v12}, [Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v5

    .line 113
    const/16 v12, 0x8

    .line 114
    .line 115
    aput-object v5, v4, v12

    .line 116
    .line 117
    const-string v5, "n1nety"

    .line 118
    .line 119
    const-string v13, "ninety"

    .line 120
    .line 121
    filled-new-array {v5, v13}, [Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v5

    .line 125
    const/16 v13, 0x9

    .line 126
    .line 127
    aput-object v5, v4, v13

    .line 128
    .line 129
    const-string v5, "fourty"

    .line 130
    .line 131
    const-string v14, "forty"

    .line 132
    .line 133
    filled-new-array {v5, v14}, [Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v5

    .line 137
    const/16 v15, 0xa

    .line 138
    .line 139
    aput-object v5, v4, v15

    .line 140
    .line 141
    const-string v5, "f0urty"

    .line 142
    .line 143
    filled-new-array {v5, v14}, [Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v5

    .line 147
    const/16 v16, 0xb

    .line 148
    .line 149
    aput-object v5, v4, v16

    .line 150
    .line 151
    const-string v5, "e1ght"

    .line 152
    .line 153
    move/from16 v17, v0

    .line 154
    .line 155
    const-string v0, "eight"

    .line 156
    .line 157
    filled-new-array {v5, v0}, [Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    const/16 v5, 0xc

    .line 162
    .line 163
    aput-object v0, v4, v5

    .line 164
    .line 165
    const-string v0, "f0rty"

    .line 166
    .line 167
    filled-new-array {v0, v14}, [Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    const/16 v18, 0xd

    .line 172
    .line 173
    aput-object v0, v4, v18

    .line 174
    .line 175
    const-string v0, "f1fty"

    .line 176
    .line 177
    move/from16 v19, v2

    .line 178
    .line 179
    const-string v2, "fifty"

    .line 180
    .line 181
    filled-new-array {v0, v2}, [Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    const/16 v2, 0xe

    .line 186
    .line 187
    aput-object v0, v4, v2

    .line 188
    .line 189
    const-string v0, "s1xty"

    .line 190
    .line 191
    move/from16 v20, v2

    .line 192
    .line 193
    const-string v2, "sixty"

    .line 194
    .line 195
    filled-new-array {v0, v2}, [Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    const/16 v2, 0xf

    .line 200
    .line 201
    aput-object v0, v4, v2

    .line 202
    .line 203
    const-string v0, "zer0"

    .line 204
    .line 205
    move/from16 v21, v2

    .line 206
    .line 207
    const-string v2, "zero"

    .line 208
    .line 209
    filled-new-array {v0, v2}, [Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    const/16 v2, 0x10

    .line 214
    .line 215
    aput-object v0, v4, v2

    .line 216
    .line 217
    const-string v0, "f0ur"

    .line 218
    .line 219
    move/from16 v22, v2

    .line 220
    .line 221
    const-string v2, "four"

    .line 222
    .line 223
    filled-new-array {v0, v2}, [Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    const/16 v2, 0x11

    .line 228
    .line 229
    aput-object v0, v4, v2

    .line 230
    .line 231
    const-string v0, "f1ve"

    .line 232
    .line 233
    move/from16 v23, v2

    .line 234
    .line 235
    const-string v2, "five"

    .line 236
    .line 237
    filled-new-array {v0, v2}, [Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    const/16 v2, 0x12

    .line 242
    .line 243
    aput-object v0, v4, v2

    .line 244
    .line 245
    const-string v0, "n1ne"

    .line 246
    .line 247
    move/from16 v24, v2

    .line 248
    .line 249
    const-string v2, "nine"

    .line 250
    .line 251
    filled-new-array {v0, v2}, [Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    const/16 v2, 0x13

    .line 256
    .line 257
    aput-object v0, v4, v2

    .line 258
    .line 259
    const-string v0, "0ne"

    .line 260
    .line 261
    move/from16 v25, v2

    .line 262
    .line 263
    const-string v2, "one"

    .line 264
    .line 265
    filled-new-array {v0, v2}, [Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object v0

    .line 269
    const/16 v2, 0x14

    .line 270
    .line 271
    aput-object v0, v4, v2

    .line 272
    .line 273
    const-string v0, "tw0"

    .line 274
    .line 275
    const-string v2, "two"

    .line 276
    .line 277
    filled-new-array {v0, v2}, [Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object v0

    .line 281
    const/16 v2, 0x15

    .line 282
    .line 283
    aput-object v0, v4, v2

    .line 284
    .line 285
    const-string v0, "s1x"

    .line 286
    .line 287
    const-string v2, "six"

    .line 288
    .line 289
    filled-new-array {v0, v2}, [Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object v0

    .line 293
    const/16 v2, 0x16

    .line 294
    .line 295
    aput-object v0, v4, v2

    .line 296
    .line 297
    const/16 v0, 0x48

    .line 298
    .line 299
    new-array v0, v0, [[Ljava/lang/String;

    .line 300
    .line 301
    const-string v2, "twenty[\\W_]{0,3}1"

    .line 302
    .line 303
    move/from16 v26, v3

    .line 304
    .line 305
    const-string v3, "twenty-one"

    .line 306
    .line 307
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    move-result-object v2

    .line 311
    aput-object v2, v0, v26

    .line 312
    .line 313
    const-string v2, "twenty[\\W_]{0,3}2"

    .line 314
    .line 315
    const-string v3, "twenty-two"

    .line 316
    .line 317
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 318
    .line 319
    .line 320
    move-result-object v2

    .line 321
    aput-object v2, v0, v17

    .line 322
    .line 323
    const-string v2, "twenty[\\W_]{0,3}3"

    .line 324
    .line 325
    const-string v3, "twenty-three"

    .line 326
    .line 327
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 328
    .line 329
    .line 330
    move-result-object v2

    .line 331
    aput-object v2, v0, v6

    .line 332
    .line 333
    const-string v2, "twenty[\\W_]{0,3}4"

    .line 334
    .line 335
    const-string v3, "twenty-four"

    .line 336
    .line 337
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 338
    .line 339
    .line 340
    move-result-object v2

    .line 341
    aput-object v2, v0, v7

    .line 342
    .line 343
    const-string v2, "twenty[\\W_]{0,3}5"

    .line 344
    .line 345
    const-string v3, "twenty-five"

    .line 346
    .line 347
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 348
    .line 349
    .line 350
    move-result-object v2

    .line 351
    aput-object v2, v0, v8

    .line 352
    .line 353
    const-string v2, "twenty[\\W_]{0,3}6"

    .line 354
    .line 355
    const-string v3, "twenty-six"

    .line 356
    .line 357
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 358
    .line 359
    .line 360
    move-result-object v2

    .line 361
    aput-object v2, v0, v9

    .line 362
    .line 363
    const-string v2, "twenty[\\W_]{0,3}7"

    .line 364
    .line 365
    const-string v3, "twenty-seven"

    .line 366
    .line 367
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 368
    .line 369
    .line 370
    move-result-object v2

    .line 371
    aput-object v2, v0, v10

    .line 372
    .line 373
    const-string v2, "twenty[\\W_]{0,3}8"

    .line 374
    .line 375
    const-string v3, "twenty-eight"

    .line 376
    .line 377
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 378
    .line 379
    .line 380
    move-result-object v2

    .line 381
    aput-object v2, v0, v11

    .line 382
    .line 383
    const-string v2, "twenty[\\W_]{0,3}9"

    .line 384
    .line 385
    const-string v3, "twenty-nine"

    .line 386
    .line 387
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 388
    .line 389
    .line 390
    move-result-object v2

    .line 391
    aput-object v2, v0, v12

    .line 392
    .line 393
    const-string v2, "thirty[\\W_]{0,3}1"

    .line 394
    .line 395
    const-string v3, "thirty-one"

    .line 396
    .line 397
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 398
    .line 399
    .line 400
    move-result-object v2

    .line 401
    aput-object v2, v0, v13

    .line 402
    .line 403
    const-string v2, "thirty[\\W_]{0,3}2"

    .line 404
    .line 405
    const-string v3, "thirty-two"

    .line 406
    .line 407
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 408
    .line 409
    .line 410
    move-result-object v2

    .line 411
    aput-object v2, v0, v15

    .line 412
    .line 413
    const-string v2, "thirty[\\W_]{0,3}3"

    .line 414
    .line 415
    const-string v3, "thirty-three"

    .line 416
    .line 417
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 418
    .line 419
    .line 420
    move-result-object v2

    .line 421
    aput-object v2, v0, v16

    .line 422
    .line 423
    const-string v2, "thirty[\\W_]{0,3}4"

    .line 424
    .line 425
    const-string v3, "thirty-four"

    .line 426
    .line 427
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 428
    .line 429
    .line 430
    move-result-object v2

    .line 431
    aput-object v2, v0, v5

    .line 432
    .line 433
    const-string v2, "thirty[\\W_]{0,3}5"

    .line 434
    .line 435
    const-string v3, "thirty-five"

    .line 436
    .line 437
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 438
    .line 439
    .line 440
    move-result-object v2

    .line 441
    aput-object v2, v0, v18

    .line 442
    .line 443
    const-string v2, "thirty[\\W_]{0,3}6"

    .line 444
    .line 445
    const-string v3, "thirty-six"

    .line 446
    .line 447
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 448
    .line 449
    .line 450
    move-result-object v2

    .line 451
    aput-object v2, v0, v20

    .line 452
    .line 453
    const-string v2, "thirty[\\W_]{0,3}7"

    .line 454
    .line 455
    const-string v3, "thirty-seven"

    .line 456
    .line 457
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 458
    .line 459
    .line 460
    move-result-object v2

    .line 461
    aput-object v2, v0, v21

    .line 462
    .line 463
    const-string v2, "thirty[\\W_]{0,3}8"

    .line 464
    .line 465
    const-string v3, "thirty-eight"

    .line 466
    .line 467
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 468
    .line 469
    .line 470
    move-result-object v2

    .line 471
    aput-object v2, v0, v22

    .line 472
    .line 473
    const-string v2, "thirty[\\W_]{0,3}9"

    .line 474
    .line 475
    const-string v3, "thirty-nine"

    .line 476
    .line 477
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 478
    .line 479
    .line 480
    move-result-object v2

    .line 481
    aput-object v2, v0, v23

    .line 482
    .line 483
    const-string v2, "forty[\\W_]{0,3}1"

    .line 484
    .line 485
    const-string v3, "forty-one"

    .line 486
    .line 487
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 488
    .line 489
    .line 490
    move-result-object v2

    .line 491
    aput-object v2, v0, v24

    .line 492
    .line 493
    const-string v2, "forty[\\W_]{0,3}2"

    .line 494
    .line 495
    const-string v3, "forty-two"

    .line 496
    .line 497
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 498
    .line 499
    .line 500
    move-result-object v2

    .line 501
    aput-object v2, v0, v25

    .line 502
    .line 503
    const-string v2, "forty[\\W_]{0,3}3"

    .line 504
    .line 505
    const-string v3, "forty-three"

    .line 506
    .line 507
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 508
    .line 509
    .line 510
    move-result-object v2

    .line 511
    const/16 v3, 0x14

    .line 512
    .line 513
    aput-object v2, v0, v3

    .line 514
    .line 515
    const-string v2, "forty[\\W_]{0,3}4"

    .line 516
    .line 517
    const-string v3, "forty-four"

    .line 518
    .line 519
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 520
    .line 521
    .line 522
    move-result-object v2

    .line 523
    const/16 v3, 0x15

    .line 524
    .line 525
    aput-object v2, v0, v3

    .line 526
    .line 527
    const-string v2, "forty[\\W_]{0,3}5"

    .line 528
    .line 529
    const-string v3, "forty-five"

    .line 530
    .line 531
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 532
    .line 533
    .line 534
    move-result-object v2

    .line 535
    const/16 v3, 0x16

    .line 536
    .line 537
    aput-object v2, v0, v3

    .line 538
    .line 539
    const-string v2, "forty[\\W_]{0,3}6"

    .line 540
    .line 541
    const-string v3, "forty-six"

    .line 542
    .line 543
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 544
    .line 545
    .line 546
    move-result-object v2

    .line 547
    aput-object v2, v0, v19

    .line 548
    .line 549
    const-string v2, "forty[\\W_]{0,3}7"

    .line 550
    .line 551
    const-string v3, "forty-seven"

    .line 552
    .line 553
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 554
    .line 555
    .line 556
    move-result-object v2

    .line 557
    const/16 v3, 0x18

    .line 558
    .line 559
    aput-object v2, v0, v3

    .line 560
    .line 561
    const-string v2, "forty[\\W_]{0,3}8"

    .line 562
    .line 563
    const-string v3, "forty-eight"

    .line 564
    .line 565
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 566
    .line 567
    .line 568
    move-result-object v2

    .line 569
    const/16 v3, 0x19

    .line 570
    .line 571
    aput-object v2, v0, v3

    .line 572
    .line 573
    const-string v2, "forty[\\W_]{0,3}9"

    .line 574
    .line 575
    const-string v3, "forty-nine"

    .line 576
    .line 577
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 578
    .line 579
    .line 580
    move-result-object v2

    .line 581
    const/16 v3, 0x1a

    .line 582
    .line 583
    aput-object v2, v0, v3

    .line 584
    .line 585
    const-string v2, "fifty[\\W_]{0,3}1"

    .line 586
    .line 587
    const-string v3, "fifty-one"

    .line 588
    .line 589
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 590
    .line 591
    .line 592
    move-result-object v2

    .line 593
    const/16 v3, 0x1b

    .line 594
    .line 595
    aput-object v2, v0, v3

    .line 596
    .line 597
    const-string v2, "fifty[\\W_]{0,3}2"

    .line 598
    .line 599
    const-string v3, "fifty-two"

    .line 600
    .line 601
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 602
    .line 603
    .line 604
    move-result-object v2

    .line 605
    const/16 v3, 0x1c

    .line 606
    .line 607
    aput-object v2, v0, v3

    .line 608
    .line 609
    const-string v2, "fifty[\\W_]{0,3}3"

    .line 610
    .line 611
    const-string v3, "fifty-three"

    .line 612
    .line 613
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 614
    .line 615
    .line 616
    move-result-object v2

    .line 617
    const/16 v3, 0x1d

    .line 618
    .line 619
    aput-object v2, v0, v3

    .line 620
    .line 621
    const-string v2, "fifty[\\W_]{0,3}4"

    .line 622
    .line 623
    const-string v3, "fifty-four"

    .line 624
    .line 625
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 626
    .line 627
    .line 628
    move-result-object v2

    .line 629
    const/16 v3, 0x1e

    .line 630
    .line 631
    aput-object v2, v0, v3

    .line 632
    .line 633
    const-string v2, "fifty[\\W_]{0,3}5"

    .line 634
    .line 635
    const-string v3, "fifty-five"

    .line 636
    .line 637
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 638
    .line 639
    .line 640
    move-result-object v2

    .line 641
    const/16 v3, 0x1f

    .line 642
    .line 643
    aput-object v2, v0, v3

    .line 644
    .line 645
    const-string v2, "fifty[\\W_]{0,3}6"

    .line 646
    .line 647
    const-string v3, "fifty-six"

    .line 648
    .line 649
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 650
    .line 651
    .line 652
    move-result-object v2

    .line 653
    const/16 v3, 0x20

    .line 654
    .line 655
    aput-object v2, v0, v3

    .line 656
    .line 657
    const-string v2, "fifty[\\W_]{0,3}7"

    .line 658
    .line 659
    const-string v3, "fifty-seven"

    .line 660
    .line 661
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 662
    .line 663
    .line 664
    move-result-object v2

    .line 665
    const/16 v3, 0x21

    .line 666
    .line 667
    aput-object v2, v0, v3

    .line 668
    .line 669
    const-string v2, "fifty[\\W_]{0,3}8"

    .line 670
    .line 671
    const-string v3, "fifty-eight"

    .line 672
    .line 673
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 674
    .line 675
    .line 676
    move-result-object v2

    .line 677
    const/16 v3, 0x22

    .line 678
    .line 679
    aput-object v2, v0, v3

    .line 680
    .line 681
    const-string v2, "fifty[\\W_]{0,3}9"

    .line 682
    .line 683
    const-string v3, "fifty-nine"

    .line 684
    .line 685
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 686
    .line 687
    .line 688
    move-result-object v2

    .line 689
    const/16 v3, 0x23

    .line 690
    .line 691
    aput-object v2, v0, v3

    .line 692
    .line 693
    const-string v2, "sixty[\\W_]{0,3}1"

    .line 694
    .line 695
    const-string v3, "sixty-one"

    .line 696
    .line 697
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 698
    .line 699
    .line 700
    move-result-object v2

    .line 701
    const/16 v3, 0x24

    .line 702
    .line 703
    aput-object v2, v0, v3

    .line 704
    .line 705
    const-string v2, "sixty[\\W_]{0,3}2"

    .line 706
    .line 707
    const-string v3, "sixty-two"

    .line 708
    .line 709
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 710
    .line 711
    .line 712
    move-result-object v2

    .line 713
    const/16 v3, 0x25

    .line 714
    .line 715
    aput-object v2, v0, v3

    .line 716
    .line 717
    const-string v2, "sixty[\\W_]{0,3}3"

    .line 718
    .line 719
    const-string v3, "sixty-three"

    .line 720
    .line 721
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 722
    .line 723
    .line 724
    move-result-object v2

    .line 725
    const/16 v3, 0x26

    .line 726
    .line 727
    aput-object v2, v0, v3

    .line 728
    .line 729
    const-string v2, "sixty[\\W_]{0,3}4"

    .line 730
    .line 731
    const-string v3, "sixty-four"

    .line 732
    .line 733
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 734
    .line 735
    .line 736
    move-result-object v2

    .line 737
    const/16 v3, 0x27

    .line 738
    .line 739
    aput-object v2, v0, v3

    .line 740
    .line 741
    const-string v2, "sixty[\\W_]{0,3}5"

    .line 742
    .line 743
    const-string v3, "sixty-five"

    .line 744
    .line 745
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 746
    .line 747
    .line 748
    move-result-object v2

    .line 749
    const/16 v3, 0x28

    .line 750
    .line 751
    aput-object v2, v0, v3

    .line 752
    .line 753
    const-string v2, "sixty[\\W_]{0,3}6"

    .line 754
    .line 755
    const-string v3, "sixty-six"

    .line 756
    .line 757
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 758
    .line 759
    .line 760
    move-result-object v2

    .line 761
    const/16 v3, 0x29

    .line 762
    .line 763
    aput-object v2, v0, v3

    .line 764
    .line 765
    const-string v2, "sixty[\\W_]{0,3}7"

    .line 766
    .line 767
    const-string v3, "sixty-seven"

    .line 768
    .line 769
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 770
    .line 771
    .line 772
    move-result-object v2

    .line 773
    const/16 v3, 0x2a

    .line 774
    .line 775
    aput-object v2, v0, v3

    .line 776
    .line 777
    const-string v2, "sixty[\\W_]{0,3}8"

    .line 778
    .line 779
    const-string v3, "sixty-eight"

    .line 780
    .line 781
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 782
    .line 783
    .line 784
    move-result-object v2

    .line 785
    const/16 v3, 0x2b

    .line 786
    .line 787
    aput-object v2, v0, v3

    .line 788
    .line 789
    const-string v2, "sixty[\\W_]{0,3}9"

    .line 790
    .line 791
    const-string v3, "sixty-nine"

    .line 792
    .line 793
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 794
    .line 795
    .line 796
    move-result-object v2

    .line 797
    const/16 v3, 0x2c

    .line 798
    .line 799
    aput-object v2, v0, v3

    .line 800
    .line 801
    const-string v2, "seventy[\\W_]{0,3}1"

    .line 802
    .line 803
    const-string v3, "seventy-one"

    .line 804
    .line 805
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 806
    .line 807
    .line 808
    move-result-object v2

    .line 809
    const/16 v3, 0x2d

    .line 810
    .line 811
    aput-object v2, v0, v3

    .line 812
    .line 813
    const-string v2, "seventy[\\W_]{0,3}2"

    .line 814
    .line 815
    const-string v3, "seventy-two"

    .line 816
    .line 817
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 818
    .line 819
    .line 820
    move-result-object v2

    .line 821
    const/16 v3, 0x2e

    .line 822
    .line 823
    aput-object v2, v0, v3

    .line 824
    .line 825
    const-string v2, "seventy[\\W_]{0,3}3"

    .line 826
    .line 827
    const-string v3, "seventy-three"

    .line 828
    .line 829
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 830
    .line 831
    .line 832
    move-result-object v2

    .line 833
    const/16 v3, 0x2f

    .line 834
    .line 835
    aput-object v2, v0, v3

    .line 836
    .line 837
    const-string v2, "seventy[\\W_]{0,3}4"

    .line 838
    .line 839
    const-string v3, "seventy-four"

    .line 840
    .line 841
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 842
    .line 843
    .line 844
    move-result-object v2

    .line 845
    const/16 v3, 0x30

    .line 846
    .line 847
    aput-object v2, v0, v3

    .line 848
    .line 849
    const-string v2, "seventy[\\W_]{0,3}5"

    .line 850
    .line 851
    const-string v3, "seventy-five"

    .line 852
    .line 853
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 854
    .line 855
    .line 856
    move-result-object v2

    .line 857
    const/16 v3, 0x31

    .line 858
    .line 859
    aput-object v2, v0, v3

    .line 860
    .line 861
    const-string v2, "seventy[\\W_]{0,3}6"

    .line 862
    .line 863
    const-string v3, "seventy-six"

    .line 864
    .line 865
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 866
    .line 867
    .line 868
    move-result-object v2

    .line 869
    const/16 v3, 0x32

    .line 870
    .line 871
    aput-object v2, v0, v3

    .line 872
    .line 873
    const-string v2, "seventy[\\W_]{0,3}7"

    .line 874
    .line 875
    const-string v3, "seventy-seven"

    .line 876
    .line 877
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 878
    .line 879
    .line 880
    move-result-object v2

    .line 881
    const/16 v3, 0x33

    .line 882
    .line 883
    aput-object v2, v0, v3

    .line 884
    .line 885
    const-string v2, "seventy[\\W_]{0,3}8"

    .line 886
    .line 887
    const-string v3, "seventy-eight"

    .line 888
    .line 889
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 890
    .line 891
    .line 892
    move-result-object v2

    .line 893
    const/16 v3, 0x34

    .line 894
    .line 895
    aput-object v2, v0, v3

    .line 896
    .line 897
    const-string v2, "seventy[\\W_]{0,3}9"

    .line 898
    .line 899
    const-string v3, "seventy-nine"

    .line 900
    .line 901
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 902
    .line 903
    .line 904
    move-result-object v2

    .line 905
    const/16 v3, 0x35

    .line 906
    .line 907
    aput-object v2, v0, v3

    .line 908
    .line 909
    const-string v2, "eighty[\\W_]{0,3}1"

    .line 910
    .line 911
    const-string v3, "eighty-one"

    .line 912
    .line 913
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 914
    .line 915
    .line 916
    move-result-object v2

    .line 917
    const/16 v3, 0x36

    .line 918
    .line 919
    aput-object v2, v0, v3

    .line 920
    .line 921
    const-string v2, "eighty[\\W_]{0,3}2"

    .line 922
    .line 923
    const-string v3, "eighty-two"

    .line 924
    .line 925
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 926
    .line 927
    .line 928
    move-result-object v2

    .line 929
    const/16 v3, 0x37

    .line 930
    .line 931
    aput-object v2, v0, v3

    .line 932
    .line 933
    const-string v2, "eighty[\\W_]{0,3}3"

    .line 934
    .line 935
    const-string v3, "eighty-three"

    .line 936
    .line 937
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 938
    .line 939
    .line 940
    move-result-object v2

    .line 941
    const/16 v3, 0x38

    .line 942
    .line 943
    aput-object v2, v0, v3

    .line 944
    .line 945
    const-string v2, "eighty[\\W_]{0,3}4"

    .line 946
    .line 947
    const-string v3, "eighty-four"

    .line 948
    .line 949
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 950
    .line 951
    .line 952
    move-result-object v2

    .line 953
    const/16 v3, 0x39

    .line 954
    .line 955
    aput-object v2, v0, v3

    .line 956
    .line 957
    const-string v2, "eighty[\\W_]{0,3}5"

    .line 958
    .line 959
    const-string v3, "eighty-five"

    .line 960
    .line 961
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 962
    .line 963
    .line 964
    move-result-object v2

    .line 965
    const/16 v3, 0x3a

    .line 966
    .line 967
    aput-object v2, v0, v3

    .line 968
    .line 969
    const-string v2, "eighty[\\W_]{0,3}6"

    .line 970
    .line 971
    const-string v3, "eighty-six"

    .line 972
    .line 973
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 974
    .line 975
    .line 976
    move-result-object v2

    .line 977
    const/16 v3, 0x3b

    .line 978
    .line 979
    aput-object v2, v0, v3

    .line 980
    .line 981
    const-string v2, "eighty[\\W_]{0,3}7"

    .line 982
    .line 983
    const-string v3, "eighty-seven"

    .line 984
    .line 985
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 986
    .line 987
    .line 988
    move-result-object v2

    .line 989
    const/16 v3, 0x3c

    .line 990
    .line 991
    aput-object v2, v0, v3

    .line 992
    .line 993
    const-string v2, "eighty[\\W_]{0,3}8"

    .line 994
    .line 995
    const-string v3, "eighty-eight"

    .line 996
    .line 997
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 998
    .line 999
    .line 1000
    move-result-object v2

    .line 1001
    const/16 v3, 0x3d

    .line 1002
    .line 1003
    aput-object v2, v0, v3

    .line 1004
    .line 1005
    const-string v2, "eighty[\\W_]{0,3}9"

    .line 1006
    .line 1007
    const-string v3, "eighty-nine"

    .line 1008
    .line 1009
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 1010
    .line 1011
    .line 1012
    move-result-object v2

    .line 1013
    const/16 v3, 0x3e

    .line 1014
    .line 1015
    aput-object v2, v0, v3

    .line 1016
    .line 1017
    const-string v2, "ninety[\\W_]{0,3}1"

    .line 1018
    .line 1019
    const-string v3, "ninety-one"

    .line 1020
    .line 1021
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 1022
    .line 1023
    .line 1024
    move-result-object v2

    .line 1025
    const/16 v3, 0x3f

    .line 1026
    .line 1027
    aput-object v2, v0, v3

    .line 1028
    .line 1029
    const-string v2, "ninety[\\W_]{0,3}2"

    .line 1030
    .line 1031
    const-string v3, "ninety-two"

    .line 1032
    .line 1033
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 1034
    .line 1035
    .line 1036
    move-result-object v2

    .line 1037
    const/16 v3, 0x40

    .line 1038
    .line 1039
    aput-object v2, v0, v3

    .line 1040
    .line 1041
    const-string v2, "ninety[\\W_]{0,3}3"

    .line 1042
    .line 1043
    const-string v3, "ninety-three"

    .line 1044
    .line 1045
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 1046
    .line 1047
    .line 1048
    move-result-object v2

    .line 1049
    const/16 v3, 0x41

    .line 1050
    .line 1051
    aput-object v2, v0, v3

    .line 1052
    .line 1053
    const-string v2, "ninety[\\W_]{0,3}4"

    .line 1054
    .line 1055
    const-string v3, "ninety-four"

    .line 1056
    .line 1057
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 1058
    .line 1059
    .line 1060
    move-result-object v2

    .line 1061
    const/16 v3, 0x42

    .line 1062
    .line 1063
    aput-object v2, v0, v3

    .line 1064
    .line 1065
    const-string v2, "ninety[\\W_]{0,3}5"

    .line 1066
    .line 1067
    const-string v3, "ninety-five"

    .line 1068
    .line 1069
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 1070
    .line 1071
    .line 1072
    move-result-object v2

    .line 1073
    const/16 v3, 0x43

    .line 1074
    .line 1075
    aput-object v2, v0, v3

    .line 1076
    .line 1077
    const-string v2, "ninety[\\W_]{0,3}6"

    .line 1078
    .line 1079
    const-string v3, "ninety-six"

    .line 1080
    .line 1081
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 1082
    .line 1083
    .line 1084
    move-result-object v2

    .line 1085
    const/16 v3, 0x44

    .line 1086
    .line 1087
    aput-object v2, v0, v3

    .line 1088
    .line 1089
    const-string v2, "ninety[\\W_]{0,3}7"

    .line 1090
    .line 1091
    const-string v3, "ninety-seven"

    .line 1092
    .line 1093
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 1094
    .line 1095
    .line 1096
    move-result-object v2

    .line 1097
    const/16 v3, 0x45

    .line 1098
    .line 1099
    aput-object v2, v0, v3

    .line 1100
    .line 1101
    const-string v2, "ninety[\\W_]{0,3}8"

    .line 1102
    .line 1103
    const-string v3, "ninety-eight"

    .line 1104
    .line 1105
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 1106
    .line 1107
    .line 1108
    move-result-object v2

    .line 1109
    const/16 v3, 0x46

    .line 1110
    .line 1111
    aput-object v2, v0, v3

    .line 1112
    .line 1113
    const-string v2, "ninety[\\W_]{0,3}9"

    .line 1114
    .line 1115
    const-string v3, "ninety-nine"

    .line 1116
    .line 1117
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 1118
    .line 1119
    .line 1120
    move-result-object v2

    .line 1121
    const/16 v3, 0x47

    .line 1122
    .line 1123
    aput-object v2, v0, v3

    .line 1124
    .line 1125
    const/16 v2, 0x48

    .line 1126
    .line 1127
    new-array v2, v2, [[Ljava/lang/String;

    .line 1128
    .line 1129
    const-string v3, "twenty-one"

    .line 1130
    .line 1131
    move/from16 v27, v5

    .line 1132
    .line 1133
    const-string v5, "21"

    .line 1134
    .line 1135
    filled-new-array {v3, v5}, [Ljava/lang/String;

    .line 1136
    .line 1137
    .line 1138
    move-result-object v3

    .line 1139
    aput-object v3, v2, v26

    .line 1140
    .line 1141
    const-string v3, "twenty-two"

    .line 1142
    .line 1143
    const-string v5, "22"

    .line 1144
    .line 1145
    filled-new-array {v3, v5}, [Ljava/lang/String;

    .line 1146
    .line 1147
    .line 1148
    move-result-object v3

    .line 1149
    aput-object v3, v2, v17

    .line 1150
    .line 1151
    const-string v3, "twenty-three"

    .line 1152
    .line 1153
    const-string v5, "23"

    .line 1154
    .line 1155
    filled-new-array {v3, v5}, [Ljava/lang/String;

    .line 1156
    .line 1157
    .line 1158
    move-result-object v3

    .line 1159
    aput-object v3, v2, v6

    .line 1160
    .line 1161
    const-string v3, "twenty-four"

    .line 1162
    .line 1163
    const-string v5, "24"

    .line 1164
    .line 1165
    filled-new-array {v3, v5}, [Ljava/lang/String;

    .line 1166
    .line 1167
    .line 1168
    move-result-object v3

    .line 1169
    aput-object v3, v2, v7

    .line 1170
    .line 1171
    const-string v3, "twenty-five"

    .line 1172
    .line 1173
    const-string v5, "25"

    .line 1174
    .line 1175
    filled-new-array {v3, v5}, [Ljava/lang/String;

    .line 1176
    .line 1177
    .line 1178
    move-result-object v3

    .line 1179
    aput-object v3, v2, v8

    .line 1180
    .line 1181
    const-string v3, "twenty-six"

    .line 1182
    .line 1183
    const-string v5, "26"

    .line 1184
    .line 1185
    filled-new-array {v3, v5}, [Ljava/lang/String;

    .line 1186
    .line 1187
    .line 1188
    move-result-object v3

    .line 1189
    aput-object v3, v2, v9

    .line 1190
    .line 1191
    const-string v3, "twenty-seven"

    .line 1192
    .line 1193
    const-string v5, "27"

    .line 1194
    .line 1195
    filled-new-array {v3, v5}, [Ljava/lang/String;

    .line 1196
    .line 1197
    .line 1198
    move-result-object v3

    .line 1199
    aput-object v3, v2, v10

    .line 1200
    .line 1201
    const-string v3, "twenty-eight"

    .line 1202
    .line 1203
    const-string v5, "28"

    .line 1204
    .line 1205
    filled-new-array {v3, v5}, [Ljava/lang/String;

    .line 1206
    .line 1207
    .line 1208
    move-result-object v3

    .line 1209
    aput-object v3, v2, v11

    .line 1210
    .line 1211
    const-string v3, "twenty-nine"

    .line 1212
    .line 1213
    const-string v5, "29"

    .line 1214
    .line 1215
    filled-new-array {v3, v5}, [Ljava/lang/String;

    .line 1216
    .line 1217
    .line 1218
    move-result-object v3

    .line 1219
    aput-object v3, v2, v12

    .line 1220
    .line 1221
    const-string v3, "thirty-one"

    .line 1222
    .line 1223
    const-string v5, "31"

    .line 1224
    .line 1225
    filled-new-array {v3, v5}, [Ljava/lang/String;

    .line 1226
    .line 1227
    .line 1228
    move-result-object v3

    .line 1229
    aput-object v3, v2, v13

    .line 1230
    .line 1231
    const-string v3, "thirty-two"

    .line 1232
    .line 1233
    const-string v5, "32"

    .line 1234
    .line 1235
    filled-new-array {v3, v5}, [Ljava/lang/String;

    .line 1236
    .line 1237
    .line 1238
    move-result-object v3

    .line 1239
    aput-object v3, v2, v15

    .line 1240
    .line 1241
    const-string v3, "thirty-three"

    .line 1242
    .line 1243
    const-string v5, "33"

    .line 1244
    .line 1245
    filled-new-array {v3, v5}, [Ljava/lang/String;

    .line 1246
    .line 1247
    .line 1248
    move-result-object v3

    .line 1249
    aput-object v3, v2, v16

    .line 1250
    .line 1251
    const-string v3, "thirty-four"

    .line 1252
    .line 1253
    const-string v5, "34"

    .line 1254
    .line 1255
    filled-new-array {v3, v5}, [Ljava/lang/String;

    .line 1256
    .line 1257
    .line 1258
    move-result-object v3

    .line 1259
    aput-object v3, v2, v27

    .line 1260
    .line 1261
    const-string v3, "thirty-five"

    .line 1262
    .line 1263
    const-string v5, "35"

    .line 1264
    .line 1265
    filled-new-array {v3, v5}, [Ljava/lang/String;

    .line 1266
    .line 1267
    .line 1268
    move-result-object v3

    .line 1269
    aput-object v3, v2, v18

    .line 1270
    .line 1271
    const-string v3, "thirty-six"

    .line 1272
    .line 1273
    const-string v5, "36"

    .line 1274
    .line 1275
    filled-new-array {v3, v5}, [Ljava/lang/String;

    .line 1276
    .line 1277
    .line 1278
    move-result-object v3

    .line 1279
    aput-object v3, v2, v20

    .line 1280
    .line 1281
    const-string v3, "thirty-seven"

    .line 1282
    .line 1283
    const-string v5, "37"

    .line 1284
    .line 1285
    filled-new-array {v3, v5}, [Ljava/lang/String;

    .line 1286
    .line 1287
    .line 1288
    move-result-object v3

    .line 1289
    aput-object v3, v2, v21

    .line 1290
    .line 1291
    const-string v3, "thirty-eight"

    .line 1292
    .line 1293
    const-string v5, "38"

    .line 1294
    .line 1295
    filled-new-array {v3, v5}, [Ljava/lang/String;

    .line 1296
    .line 1297
    .line 1298
    move-result-object v3

    .line 1299
    aput-object v3, v2, v22

    .line 1300
    .line 1301
    const-string v3, "thirty-nine"

    .line 1302
    .line 1303
    const-string v5, "39"

    .line 1304
    .line 1305
    filled-new-array {v3, v5}, [Ljava/lang/String;

    .line 1306
    .line 1307
    .line 1308
    move-result-object v3

    .line 1309
    aput-object v3, v2, v23

    .line 1310
    .line 1311
    const-string v3, "forty-one"

    .line 1312
    .line 1313
    const-string v5, "41"

    .line 1314
    .line 1315
    filled-new-array {v3, v5}, [Ljava/lang/String;

    .line 1316
    .line 1317
    .line 1318
    move-result-object v3

    .line 1319
    aput-object v3, v2, v24

    .line 1320
    .line 1321
    const-string v3, "forty-two"

    .line 1322
    .line 1323
    const-string v5, "42"

    .line 1324
    .line 1325
    filled-new-array {v3, v5}, [Ljava/lang/String;

    .line 1326
    .line 1327
    .line 1328
    move-result-object v3

    .line 1329
    aput-object v3, v2, v25

    .line 1330
    .line 1331
    const-string v3, "forty-three"

    .line 1332
    .line 1333
    const-string v5, "43"

    .line 1334
    .line 1335
    filled-new-array {v3, v5}, [Ljava/lang/String;

    .line 1336
    .line 1337
    .line 1338
    move-result-object v3

    .line 1339
    const/16 v5, 0x14

    .line 1340
    .line 1341
    aput-object v3, v2, v5

    .line 1342
    .line 1343
    const-string v3, "forty-four"

    .line 1344
    .line 1345
    const-string v5, "44"

    .line 1346
    .line 1347
    filled-new-array {v3, v5}, [Ljava/lang/String;

    .line 1348
    .line 1349
    .line 1350
    move-result-object v3

    .line 1351
    const/16 v5, 0x15

    .line 1352
    .line 1353
    aput-object v3, v2, v5

    .line 1354
    .line 1355
    const-string v3, "forty-five"

    .line 1356
    .line 1357
    const-string v5, "45"

    .line 1358
    .line 1359
    filled-new-array {v3, v5}, [Ljava/lang/String;

    .line 1360
    .line 1361
    .line 1362
    move-result-object v3

    .line 1363
    const/16 v5, 0x16

    .line 1364
    .line 1365
    aput-object v3, v2, v5

    .line 1366
    .line 1367
    const-string v3, "forty-six"

    .line 1368
    .line 1369
    const-string v5, "46"

    .line 1370
    .line 1371
    filled-new-array {v3, v5}, [Ljava/lang/String;

    .line 1372
    .line 1373
    .line 1374
    move-result-object v3

    .line 1375
    aput-object v3, v2, v19

    .line 1376
    .line 1377
    const-string v3, "forty-seven"

    .line 1378
    .line 1379
    const-string v5, "47"

    .line 1380
    .line 1381
    filled-new-array {v3, v5}, [Ljava/lang/String;

    .line 1382
    .line 1383
    .line 1384
    move-result-object v3

    .line 1385
    const/16 v5, 0x18

    .line 1386
    .line 1387
    aput-object v3, v2, v5

    .line 1388
    .line 1389
    const-string v3, "forty-eight"

    .line 1390
    .line 1391
    const-string v5, "48"

    .line 1392
    .line 1393
    filled-new-array {v3, v5}, [Ljava/lang/String;

    .line 1394
    .line 1395
    .line 1396
    move-result-object v3

    .line 1397
    const/16 v5, 0x19

    .line 1398
    .line 1399
    aput-object v3, v2, v5

    .line 1400
    .line 1401
    const-string v3, "forty-nine"

    .line 1402
    .line 1403
    const-string v5, "49"

    .line 1404
    .line 1405
    filled-new-array {v3, v5}, [Ljava/lang/String;

    .line 1406
    .line 1407
    .line 1408
    move-result-object v3

    .line 1409
    const/16 v5, 0x1a

    .line 1410
    .line 1411
    aput-object v3, v2, v5

    .line 1412
    .line 1413
    const-string v3, "fifty-one"

    .line 1414
    .line 1415
    const-string v5, "51"

    .line 1416
    .line 1417
    filled-new-array {v3, v5}, [Ljava/lang/String;

    .line 1418
    .line 1419
    .line 1420
    move-result-object v3

    .line 1421
    const/16 v5, 0x1b

    .line 1422
    .line 1423
    aput-object v3, v2, v5

    .line 1424
    .line 1425
    const-string v3, "fifty-two"

    .line 1426
    .line 1427
    const-string v5, "52"

    .line 1428
    .line 1429
    filled-new-array {v3, v5}, [Ljava/lang/String;

    .line 1430
    .line 1431
    .line 1432
    move-result-object v3

    .line 1433
    const/16 v5, 0x1c

    .line 1434
    .line 1435
    aput-object v3, v2, v5

    .line 1436
    .line 1437
    const-string v3, "fifty-three"

    .line 1438
    .line 1439
    const-string v5, "53"

    .line 1440
    .line 1441
    filled-new-array {v3, v5}, [Ljava/lang/String;

    .line 1442
    .line 1443
    .line 1444
    move-result-object v3

    .line 1445
    const/16 v5, 0x1d

    .line 1446
    .line 1447
    aput-object v3, v2, v5

    .line 1448
    .line 1449
    const-string v3, "fifty-four"

    .line 1450
    .line 1451
    const-string v5, "54"

    .line 1452
    .line 1453
    filled-new-array {v3, v5}, [Ljava/lang/String;

    .line 1454
    .line 1455
    .line 1456
    move-result-object v3

    .line 1457
    const/16 v5, 0x1e

    .line 1458
    .line 1459
    aput-object v3, v2, v5

    .line 1460
    .line 1461
    const-string v3, "fifty-five"

    .line 1462
    .line 1463
    const-string v5, "55"

    .line 1464
    .line 1465
    filled-new-array {v3, v5}, [Ljava/lang/String;

    .line 1466
    .line 1467
    .line 1468
    move-result-object v3

    .line 1469
    const/16 v5, 0x1f

    .line 1470
    .line 1471
    aput-object v3, v2, v5

    .line 1472
    .line 1473
    const-string v3, "fifty-six"

    .line 1474
    .line 1475
    const-string v5, "56"

    .line 1476
    .line 1477
    filled-new-array {v3, v5}, [Ljava/lang/String;

    .line 1478
    .line 1479
    .line 1480
    move-result-object v3

    .line 1481
    const/16 v5, 0x20

    .line 1482
    .line 1483
    aput-object v3, v2, v5

    .line 1484
    .line 1485
    const-string v3, "fifty-seven"

    .line 1486
    .line 1487
    const-string v5, "57"

    .line 1488
    .line 1489
    filled-new-array {v3, v5}, [Ljava/lang/String;

    .line 1490
    .line 1491
    .line 1492
    move-result-object v3

    .line 1493
    const/16 v5, 0x21

    .line 1494
    .line 1495
    aput-object v3, v2, v5

    .line 1496
    .line 1497
    const-string v3, "fifty-eight"

    .line 1498
    .line 1499
    const-string v5, "58"

    .line 1500
    .line 1501
    filled-new-array {v3, v5}, [Ljava/lang/String;

    .line 1502
    .line 1503
    .line 1504
    move-result-object v3

    .line 1505
    const/16 v5, 0x22

    .line 1506
    .line 1507
    aput-object v3, v2, v5

    .line 1508
    .line 1509
    const-string v3, "fifty-nine"

    .line 1510
    .line 1511
    const-string v5, "59"

    .line 1512
    .line 1513
    filled-new-array {v3, v5}, [Ljava/lang/String;

    .line 1514
    .line 1515
    .line 1516
    move-result-object v3

    .line 1517
    const/16 v5, 0x23

    .line 1518
    .line 1519
    aput-object v3, v2, v5

    .line 1520
    .line 1521
    const-string v3, "sixty-one"

    .line 1522
    .line 1523
    const-string v5, "61"

    .line 1524
    .line 1525
    filled-new-array {v3, v5}, [Ljava/lang/String;

    .line 1526
    .line 1527
    .line 1528
    move-result-object v3

    .line 1529
    const/16 v5, 0x24

    .line 1530
    .line 1531
    aput-object v3, v2, v5

    .line 1532
    .line 1533
    const-string v3, "sixty-two"

    .line 1534
    .line 1535
    const-string v5, "62"

    .line 1536
    .line 1537
    filled-new-array {v3, v5}, [Ljava/lang/String;

    .line 1538
    .line 1539
    .line 1540
    move-result-object v3

    .line 1541
    const/16 v5, 0x25

    .line 1542
    .line 1543
    aput-object v3, v2, v5

    .line 1544
    .line 1545
    const-string v3, "sixty-three"

    .line 1546
    .line 1547
    const-string v5, "63"

    .line 1548
    .line 1549
    filled-new-array {v3, v5}, [Ljava/lang/String;

    .line 1550
    .line 1551
    .line 1552
    move-result-object v3

    .line 1553
    const/16 v5, 0x26

    .line 1554
    .line 1555
    aput-object v3, v2, v5

    .line 1556
    .line 1557
    const-string v3, "sixty-four"

    .line 1558
    .line 1559
    const-string v5, "64"

    .line 1560
    .line 1561
    filled-new-array {v3, v5}, [Ljava/lang/String;

    .line 1562
    .line 1563
    .line 1564
    move-result-object v3

    .line 1565
    const/16 v5, 0x27

    .line 1566
    .line 1567
    aput-object v3, v2, v5

    .line 1568
    .line 1569
    const-string v3, "sixty-five"

    .line 1570
    .line 1571
    const-string v5, "65"

    .line 1572
    .line 1573
    filled-new-array {v3, v5}, [Ljava/lang/String;

    .line 1574
    .line 1575
    .line 1576
    move-result-object v3

    .line 1577
    const/16 v5, 0x28

    .line 1578
    .line 1579
    aput-object v3, v2, v5

    .line 1580
    .line 1581
    const-string v3, "sixty-six"

    .line 1582
    .line 1583
    const-string v5, "66"

    .line 1584
    .line 1585
    filled-new-array {v3, v5}, [Ljava/lang/String;

    .line 1586
    .line 1587
    .line 1588
    move-result-object v3

    .line 1589
    const/16 v5, 0x29

    .line 1590
    .line 1591
    aput-object v3, v2, v5

    .line 1592
    .line 1593
    const-string v3, "sixty-seven"

    .line 1594
    .line 1595
    const-string v5, "67"

    .line 1596
    .line 1597
    filled-new-array {v3, v5}, [Ljava/lang/String;

    .line 1598
    .line 1599
    .line 1600
    move-result-object v3

    .line 1601
    const/16 v5, 0x2a

    .line 1602
    .line 1603
    aput-object v3, v2, v5

    .line 1604
    .line 1605
    const-string v3, "sixty-eight"

    .line 1606
    .line 1607
    const-string v5, "68"

    .line 1608
    .line 1609
    filled-new-array {v3, v5}, [Ljava/lang/String;

    .line 1610
    .line 1611
    .line 1612
    move-result-object v3

    .line 1613
    const/16 v5, 0x2b

    .line 1614
    .line 1615
    aput-object v3, v2, v5

    .line 1616
    .line 1617
    const-string v3, "sixty-nine"

    .line 1618
    .line 1619
    const-string v5, "69"

    .line 1620
    .line 1621
    filled-new-array {v3, v5}, [Ljava/lang/String;

    .line 1622
    .line 1623
    .line 1624
    move-result-object v3

    .line 1625
    const/16 v5, 0x2c

    .line 1626
    .line 1627
    aput-object v3, v2, v5

    .line 1628
    .line 1629
    const-string v3, "seventy-one"

    .line 1630
    .line 1631
    const-string v5, "71"

    .line 1632
    .line 1633
    filled-new-array {v3, v5}, [Ljava/lang/String;

    .line 1634
    .line 1635
    .line 1636
    move-result-object v3

    .line 1637
    const/16 v5, 0x2d

    .line 1638
    .line 1639
    aput-object v3, v2, v5

    .line 1640
    .line 1641
    const-string v3, "seventy-two"

    .line 1642
    .line 1643
    const-string v5, "72"

    .line 1644
    .line 1645
    filled-new-array {v3, v5}, [Ljava/lang/String;

    .line 1646
    .line 1647
    .line 1648
    move-result-object v3

    .line 1649
    const/16 v5, 0x2e

    .line 1650
    .line 1651
    aput-object v3, v2, v5

    .line 1652
    .line 1653
    const-string v3, "seventy-three"

    .line 1654
    .line 1655
    const-string v5, "73"

    .line 1656
    .line 1657
    filled-new-array {v3, v5}, [Ljava/lang/String;

    .line 1658
    .line 1659
    .line 1660
    move-result-object v3

    .line 1661
    const/16 v5, 0x2f

    .line 1662
    .line 1663
    aput-object v3, v2, v5

    .line 1664
    .line 1665
    const-string v3, "seventy-four"

    .line 1666
    .line 1667
    const-string v5, "74"

    .line 1668
    .line 1669
    filled-new-array {v3, v5}, [Ljava/lang/String;

    .line 1670
    .line 1671
    .line 1672
    move-result-object v3

    .line 1673
    const/16 v5, 0x30

    .line 1674
    .line 1675
    aput-object v3, v2, v5

    .line 1676
    .line 1677
    const-string v3, "seventy-five"

    .line 1678
    .line 1679
    const-string v5, "75"

    .line 1680
    .line 1681
    filled-new-array {v3, v5}, [Ljava/lang/String;

    .line 1682
    .line 1683
    .line 1684
    move-result-object v3

    .line 1685
    const/16 v5, 0x31

    .line 1686
    .line 1687
    aput-object v3, v2, v5

    .line 1688
    .line 1689
    const-string v3, "seventy-six"

    .line 1690
    .line 1691
    const-string v5, "76"

    .line 1692
    .line 1693
    filled-new-array {v3, v5}, [Ljava/lang/String;

    .line 1694
    .line 1695
    .line 1696
    move-result-object v3

    .line 1697
    const/16 v5, 0x32

    .line 1698
    .line 1699
    aput-object v3, v2, v5

    .line 1700
    .line 1701
    const-string v3, "seventy-seven"

    .line 1702
    .line 1703
    const-string v5, "77"

    .line 1704
    .line 1705
    filled-new-array {v3, v5}, [Ljava/lang/String;

    .line 1706
    .line 1707
    .line 1708
    move-result-object v3

    .line 1709
    const/16 v5, 0x33

    .line 1710
    .line 1711
    aput-object v3, v2, v5

    .line 1712
    .line 1713
    const-string v3, "seventy-eight"

    .line 1714
    .line 1715
    const-string v5, "78"

    .line 1716
    .line 1717
    filled-new-array {v3, v5}, [Ljava/lang/String;

    .line 1718
    .line 1719
    .line 1720
    move-result-object v3

    .line 1721
    const/16 v5, 0x34

    .line 1722
    .line 1723
    aput-object v3, v2, v5

    .line 1724
    .line 1725
    const-string v3, "seventy-nine"

    .line 1726
    .line 1727
    const-string v5, "79"

    .line 1728
    .line 1729
    filled-new-array {v3, v5}, [Ljava/lang/String;

    .line 1730
    .line 1731
    .line 1732
    move-result-object v3

    .line 1733
    const/16 v5, 0x35

    .line 1734
    .line 1735
    aput-object v3, v2, v5

    .line 1736
    .line 1737
    const-string v3, "eighty-one"

    .line 1738
    .line 1739
    const-string v5, "81"

    .line 1740
    .line 1741
    filled-new-array {v3, v5}, [Ljava/lang/String;

    .line 1742
    .line 1743
    .line 1744
    move-result-object v3

    .line 1745
    const/16 v5, 0x36

    .line 1746
    .line 1747
    aput-object v3, v2, v5

    .line 1748
    .line 1749
    const-string v3, "eighty-two"

    .line 1750
    .line 1751
    const-string v5, "82"

    .line 1752
    .line 1753
    filled-new-array {v3, v5}, [Ljava/lang/String;

    .line 1754
    .line 1755
    .line 1756
    move-result-object v3

    .line 1757
    const/16 v5, 0x37

    .line 1758
    .line 1759
    aput-object v3, v2, v5

    .line 1760
    .line 1761
    const-string v3, "eighty-three"

    .line 1762
    .line 1763
    const-string v5, "83"

    .line 1764
    .line 1765
    filled-new-array {v3, v5}, [Ljava/lang/String;

    .line 1766
    .line 1767
    .line 1768
    move-result-object v3

    .line 1769
    const/16 v5, 0x38

    .line 1770
    .line 1771
    aput-object v3, v2, v5

    .line 1772
    .line 1773
    const-string v3, "eighty-four"

    .line 1774
    .line 1775
    const-string v5, "84"

    .line 1776
    .line 1777
    filled-new-array {v3, v5}, [Ljava/lang/String;

    .line 1778
    .line 1779
    .line 1780
    move-result-object v3

    .line 1781
    const/16 v5, 0x39

    .line 1782
    .line 1783
    aput-object v3, v2, v5

    .line 1784
    .line 1785
    const-string v3, "eighty-five"

    .line 1786
    .line 1787
    const-string v5, "85"

    .line 1788
    .line 1789
    filled-new-array {v3, v5}, [Ljava/lang/String;

    .line 1790
    .line 1791
    .line 1792
    move-result-object v3

    .line 1793
    const/16 v5, 0x3a

    .line 1794
    .line 1795
    aput-object v3, v2, v5

    .line 1796
    .line 1797
    const-string v3, "eighty-six"

    .line 1798
    .line 1799
    const-string v5, "86"

    .line 1800
    .line 1801
    filled-new-array {v3, v5}, [Ljava/lang/String;

    .line 1802
    .line 1803
    .line 1804
    move-result-object v3

    .line 1805
    const/16 v5, 0x3b

    .line 1806
    .line 1807
    aput-object v3, v2, v5

    .line 1808
    .line 1809
    const-string v3, "eighty-seven"

    .line 1810
    .line 1811
    const-string v5, "87"

    .line 1812
    .line 1813
    filled-new-array {v3, v5}, [Ljava/lang/String;

    .line 1814
    .line 1815
    .line 1816
    move-result-object v3

    .line 1817
    const/16 v5, 0x3c

    .line 1818
    .line 1819
    aput-object v3, v2, v5

    .line 1820
    .line 1821
    const-string v3, "eighty-eight"

    .line 1822
    .line 1823
    const-string v5, "88"

    .line 1824
    .line 1825
    filled-new-array {v3, v5}, [Ljava/lang/String;

    .line 1826
    .line 1827
    .line 1828
    move-result-object v3

    .line 1829
    const/16 v5, 0x3d

    .line 1830
    .line 1831
    aput-object v3, v2, v5

    .line 1832
    .line 1833
    const-string v3, "eighty-nine"

    .line 1834
    .line 1835
    const-string v5, "89"

    .line 1836
    .line 1837
    filled-new-array {v3, v5}, [Ljava/lang/String;

    .line 1838
    .line 1839
    .line 1840
    move-result-object v3

    .line 1841
    const/16 v5, 0x3e

    .line 1842
    .line 1843
    aput-object v3, v2, v5

    .line 1844
    .line 1845
    const-string v3, "ninety-one"

    .line 1846
    .line 1847
    const-string v5, "91"

    .line 1848
    .line 1849
    filled-new-array {v3, v5}, [Ljava/lang/String;

    .line 1850
    .line 1851
    .line 1852
    move-result-object v3

    .line 1853
    const/16 v5, 0x3f

    .line 1854
    .line 1855
    aput-object v3, v2, v5

    .line 1856
    .line 1857
    const-string v3, "ninety-two"

    .line 1858
    .line 1859
    const-string v5, "92"

    .line 1860
    .line 1861
    filled-new-array {v3, v5}, [Ljava/lang/String;

    .line 1862
    .line 1863
    .line 1864
    move-result-object v3

    .line 1865
    const/16 v5, 0x40

    .line 1866
    .line 1867
    aput-object v3, v2, v5

    .line 1868
    .line 1869
    const-string v3, "ninety-three"

    .line 1870
    .line 1871
    const-string v5, "93"

    .line 1872
    .line 1873
    filled-new-array {v3, v5}, [Ljava/lang/String;

    .line 1874
    .line 1875
    .line 1876
    move-result-object v3

    .line 1877
    const/16 v5, 0x41

    .line 1878
    .line 1879
    aput-object v3, v2, v5

    .line 1880
    .line 1881
    const-string v3, "ninety-four"

    .line 1882
    .line 1883
    const-string v5, "94"

    .line 1884
    .line 1885
    filled-new-array {v3, v5}, [Ljava/lang/String;

    .line 1886
    .line 1887
    .line 1888
    move-result-object v3

    .line 1889
    const/16 v5, 0x42

    .line 1890
    .line 1891
    aput-object v3, v2, v5

    .line 1892
    .line 1893
    const-string v3, "ninety-five"

    .line 1894
    .line 1895
    const-string v5, "95"

    .line 1896
    .line 1897
    filled-new-array {v3, v5}, [Ljava/lang/String;

    .line 1898
    .line 1899
    .line 1900
    move-result-object v3

    .line 1901
    const/16 v5, 0x43

    .line 1902
    .line 1903
    aput-object v3, v2, v5

    .line 1904
    .line 1905
    const-string v3, "ninety-six"

    .line 1906
    .line 1907
    const-string v5, "96"

    .line 1908
    .line 1909
    filled-new-array {v3, v5}, [Ljava/lang/String;

    .line 1910
    .line 1911
    .line 1912
    move-result-object v3

    .line 1913
    const/16 v5, 0x44

    .line 1914
    .line 1915
    aput-object v3, v2, v5

    .line 1916
    .line 1917
    const-string v3, "ninety-seven"

    .line 1918
    .line 1919
    const-string v5, "97"

    .line 1920
    .line 1921
    filled-new-array {v3, v5}, [Ljava/lang/String;

    .line 1922
    .line 1923
    .line 1924
    move-result-object v3

    .line 1925
    const/16 v5, 0x45

    .line 1926
    .line 1927
    aput-object v3, v2, v5

    .line 1928
    .line 1929
    const-string v3, "ninety-eight"

    .line 1930
    .line 1931
    const-string v5, "98"

    .line 1932
    .line 1933
    filled-new-array {v3, v5}, [Ljava/lang/String;

    .line 1934
    .line 1935
    .line 1936
    move-result-object v3

    .line 1937
    const/16 v5, 0x46

    .line 1938
    .line 1939
    aput-object v3, v2, v5

    .line 1940
    .line 1941
    const-string v3, "ninety-nine"

    .line 1942
    .line 1943
    const-string v5, "99"

    .line 1944
    .line 1945
    filled-new-array {v3, v5}, [Ljava/lang/String;

    .line 1946
    .line 1947
    .line 1948
    move-result-object v3

    .line 1949
    const/16 v5, 0x47

    .line 1950
    .line 1951
    aput-object v3, v2, v5

    .line 1952
    .line 1953
    new-array v3, v6, [[Ljava/lang/String;

    .line 1954
    .line 1955
    const-string v5, "hundred"

    .line 1956
    .line 1957
    move/from16 v28, v6

    .line 1958
    .line 1959
    const-string v6, "00"

    .line 1960
    .line 1961
    filled-new-array {v5, v6}, [Ljava/lang/String;

    .line 1962
    .line 1963
    .line 1964
    move-result-object v5

    .line 1965
    aput-object v5, v3, v26

    .line 1966
    .line 1967
    const-string v5, "thousand"

    .line 1968
    .line 1969
    const-string v6, "000"

    .line 1970
    .line 1971
    filled-new-array {v5, v6}, [Ljava/lang/String;

    .line 1972
    .line 1973
    .line 1974
    move-result-object v5

    .line 1975
    aput-object v5, v3, v17

    .line 1976
    .line 1977
    const/16 v5, 0x1c

    .line 1978
    .line 1979
    new-array v5, v5, [[Ljava/lang/String;

    .line 1980
    .line 1981
    const-string v6, "seventeen"

    .line 1982
    .line 1983
    move/from16 v29, v7

    .line 1984
    .line 1985
    const-string v7, "17"

    .line 1986
    .line 1987
    filled-new-array {v6, v7}, [Ljava/lang/String;

    .line 1988
    .line 1989
    .line 1990
    move-result-object v6

    .line 1991
    aput-object v6, v5, v26

    .line 1992
    .line 1993
    const-string v6, "thirteen"

    .line 1994
    .line 1995
    const-string v7, "13"

    .line 1996
    .line 1997
    filled-new-array {v6, v7}, [Ljava/lang/String;

    .line 1998
    .line 1999
    .line 2000
    move-result-object v6

    .line 2001
    aput-object v6, v5, v17

    .line 2002
    .line 2003
    const-string v6, "fourteen"

    .line 2004
    .line 2005
    const-string v7, "14"

    .line 2006
    .line 2007
    filled-new-array {v6, v7}, [Ljava/lang/String;

    .line 2008
    .line 2009
    .line 2010
    move-result-object v6

    .line 2011
    aput-object v6, v5, v28

    .line 2012
    .line 2013
    const-string v6, "eighteen"

    .line 2014
    .line 2015
    const-string v7, "18"

    .line 2016
    .line 2017
    filled-new-array {v6, v7}, [Ljava/lang/String;

    .line 2018
    .line 2019
    .line 2020
    move-result-object v6

    .line 2021
    aput-object v6, v5, v29

    .line 2022
    .line 2023
    const-string v6, "nineteen"

    .line 2024
    .line 2025
    const-string v7, "19"

    .line 2026
    .line 2027
    filled-new-array {v6, v7}, [Ljava/lang/String;

    .line 2028
    .line 2029
    .line 2030
    move-result-object v6

    .line 2031
    aput-object v6, v5, v8

    .line 2032
    .line 2033
    const-string v6, "fifteen"

    .line 2034
    .line 2035
    const-string v7, "15"

    .line 2036
    .line 2037
    filled-new-array {v6, v7}, [Ljava/lang/String;

    .line 2038
    .line 2039
    .line 2040
    move-result-object v6

    .line 2041
    aput-object v6, v5, v9

    .line 2042
    .line 2043
    const-string v6, "sixteen"

    .line 2044
    .line 2045
    const-string v7, "16"

    .line 2046
    .line 2047
    filled-new-array {v6, v7}, [Ljava/lang/String;

    .line 2048
    .line 2049
    .line 2050
    move-result-object v6

    .line 2051
    aput-object v6, v5, v10

    .line 2052
    .line 2053
    const-string v6, "seventy"

    .line 2054
    .line 2055
    const-string v7, "70"

    .line 2056
    .line 2057
    filled-new-array {v6, v7}, [Ljava/lang/String;

    .line 2058
    .line 2059
    .line 2060
    move-result-object v6

    .line 2061
    aput-object v6, v5, v11

    .line 2062
    .line 2063
    const-string v6, "eleven"

    .line 2064
    .line 2065
    const-string v7, "11"

    .line 2066
    .line 2067
    filled-new-array {v6, v7}, [Ljava/lang/String;

    .line 2068
    .line 2069
    .line 2070
    move-result-object v6

    .line 2071
    aput-object v6, v5, v12

    .line 2072
    .line 2073
    const-string v6, "twelve"

    .line 2074
    .line 2075
    const-string v7, "12"

    .line 2076
    .line 2077
    filled-new-array {v6, v7}, [Ljava/lang/String;

    .line 2078
    .line 2079
    .line 2080
    move-result-object v6

    .line 2081
    aput-object v6, v5, v13

    .line 2082
    .line 2083
    const-string v6, "twenty"

    .line 2084
    .line 2085
    const-string v7, "20"

    .line 2086
    .line 2087
    filled-new-array {v6, v7}, [Ljava/lang/String;

    .line 2088
    .line 2089
    .line 2090
    move-result-object v6

    .line 2091
    aput-object v6, v5, v15

    .line 2092
    .line 2093
    const-string v6, "thirty"

    .line 2094
    .line 2095
    const-string v7, "30"

    .line 2096
    .line 2097
    filled-new-array {v6, v7}, [Ljava/lang/String;

    .line 2098
    .line 2099
    .line 2100
    move-result-object v6

    .line 2101
    aput-object v6, v5, v16

    .line 2102
    .line 2103
    const-string v6, "eighty"

    .line 2104
    .line 2105
    const-string v7, "80"

    .line 2106
    .line 2107
    filled-new-array {v6, v7}, [Ljava/lang/String;

    .line 2108
    .line 2109
    .line 2110
    move-result-object v6

    .line 2111
    aput-object v6, v5, v27

    .line 2112
    .line 2113
    const-string v6, "ninety"

    .line 2114
    .line 2115
    const-string v7, "90"

    .line 2116
    .line 2117
    filled-new-array {v6, v7}, [Ljava/lang/String;

    .line 2118
    .line 2119
    .line 2120
    move-result-object v6

    .line 2121
    aput-object v6, v5, v18

    .line 2122
    .line 2123
    const-string v6, "three"

    .line 2124
    .line 2125
    const-string v7, "3"

    .line 2126
    .line 2127
    filled-new-array {v6, v7}, [Ljava/lang/String;

    .line 2128
    .line 2129
    .line 2130
    move-result-object v6

    .line 2131
    aput-object v6, v5, v20

    .line 2132
    .line 2133
    const-string v6, "seven"

    .line 2134
    .line 2135
    const-string v7, "7"

    .line 2136
    .line 2137
    filled-new-array {v6, v7}, [Ljava/lang/String;

    .line 2138
    .line 2139
    .line 2140
    move-result-object v6

    .line 2141
    aput-object v6, v5, v21

    .line 2142
    .line 2143
    const-string v6, "eight"

    .line 2144
    .line 2145
    const-string v7, "8"

    .line 2146
    .line 2147
    filled-new-array {v6, v7}, [Ljava/lang/String;

    .line 2148
    .line 2149
    .line 2150
    move-result-object v6

    .line 2151
    aput-object v6, v5, v22

    .line 2152
    .line 2153
    const-string v6, "40"

    .line 2154
    .line 2155
    filled-new-array {v14, v6}, [Ljava/lang/String;

    .line 2156
    .line 2157
    .line 2158
    move-result-object v6

    .line 2159
    aput-object v6, v5, v23

    .line 2160
    .line 2161
    const-string v6, "fifty"

    .line 2162
    .line 2163
    const-string v7, "50"

    .line 2164
    .line 2165
    filled-new-array {v6, v7}, [Ljava/lang/String;

    .line 2166
    .line 2167
    .line 2168
    move-result-object v6

    .line 2169
    aput-object v6, v5, v24

    .line 2170
    .line 2171
    const-string v6, "sixty"

    .line 2172
    .line 2173
    const-string v7, "60"

    .line 2174
    .line 2175
    filled-new-array {v6, v7}, [Ljava/lang/String;

    .line 2176
    .line 2177
    .line 2178
    move-result-object v6

    .line 2179
    aput-object v6, v5, v25

    .line 2180
    .line 2181
    const-string v6, "zero"

    .line 2182
    .line 2183
    const-string v7, "0"

    .line 2184
    .line 2185
    filled-new-array {v6, v7}, [Ljava/lang/String;

    .line 2186
    .line 2187
    .line 2188
    move-result-object v6

    .line 2189
    const/16 v7, 0x14

    .line 2190
    .line 2191
    aput-object v6, v5, v7

    .line 2192
    .line 2193
    const-string v6, "four"

    .line 2194
    .line 2195
    const-string v7, "4"

    .line 2196
    .line 2197
    filled-new-array {v6, v7}, [Ljava/lang/String;

    .line 2198
    .line 2199
    .line 2200
    move-result-object v6

    .line 2201
    const/16 v7, 0x15

    .line 2202
    .line 2203
    aput-object v6, v5, v7

    .line 2204
    .line 2205
    const-string v6, "five"

    .line 2206
    .line 2207
    const-string v7, "5"

    .line 2208
    .line 2209
    filled-new-array {v6, v7}, [Ljava/lang/String;

    .line 2210
    .line 2211
    .line 2212
    move-result-object v6

    .line 2213
    const/16 v7, 0x16

    .line 2214
    .line 2215
    aput-object v6, v5, v7

    .line 2216
    .line 2217
    const-string v6, "nine"

    .line 2218
    .line 2219
    const-string v7, "9"

    .line 2220
    .line 2221
    filled-new-array {v6, v7}, [Ljava/lang/String;

    .line 2222
    .line 2223
    .line 2224
    move-result-object v6

    .line 2225
    aput-object v6, v5, v19

    .line 2226
    .line 2227
    const-string v6, "one"

    .line 2228
    .line 2229
    const-string v7, "1"

    .line 2230
    .line 2231
    filled-new-array {v6, v7}, [Ljava/lang/String;

    .line 2232
    .line 2233
    .line 2234
    move-result-object v6

    .line 2235
    const/16 v7, 0x18

    .line 2236
    .line 2237
    aput-object v6, v5, v7

    .line 2238
    .line 2239
    const-string v6, "two"

    .line 2240
    .line 2241
    const-string v7, "2"

    .line 2242
    .line 2243
    filled-new-array {v6, v7}, [Ljava/lang/String;

    .line 2244
    .line 2245
    .line 2246
    move-result-object v6

    .line 2247
    const/16 v7, 0x19

    .line 2248
    .line 2249
    aput-object v6, v5, v7

    .line 2250
    .line 2251
    const-string v6, "six"

    .line 2252
    .line 2253
    const-string v7, "6"

    .line 2254
    .line 2255
    filled-new-array {v6, v7}, [Ljava/lang/String;

    .line 2256
    .line 2257
    .line 2258
    move-result-object v6

    .line 2259
    const/16 v7, 0x1a

    .line 2260
    .line 2261
    aput-object v6, v5, v7

    .line 2262
    .line 2263
    const-string v6, "ten"

    .line 2264
    .line 2265
    const-string v7, "10"

    .line 2266
    .line 2267
    filled-new-array {v6, v7}, [Ljava/lang/String;

    .line 2268
    .line 2269
    .line 2270
    move-result-object v6

    .line 2271
    const/16 v7, 0x1b

    .line 2272
    .line 2273
    aput-object v6, v5, v7

    .line 2274
    .line 2275
    new-array v6, v8, [[Ljava/lang/String;

    .line 2276
    .line 2277
    const-string v7, "oh"

    .line 2278
    .line 2279
    const-string v12, "0"

    .line 2280
    .line 2281
    filled-new-array {v7, v12}, [Ljava/lang/String;

    .line 2282
    .line 2283
    .line 2284
    move-result-object v7

    .line 2285
    aput-object v7, v6, v26

    .line 2286
    .line 2287
    const-string v7, "o"

    .line 2288
    .line 2289
    const-string v12, "0"

    .line 2290
    .line 2291
    filled-new-array {v7, v12}, [Ljava/lang/String;

    .line 2292
    .line 2293
    .line 2294
    move-result-object v7

    .line 2295
    aput-object v7, v6, v17

    .line 2296
    .line 2297
    const-string v7, "i"

    .line 2298
    .line 2299
    const-string v12, "1"

    .line 2300
    .line 2301
    filled-new-array {v7, v12}, [Ljava/lang/String;

    .line 2302
    .line 2303
    .line 2304
    move-result-object v7

    .line 2305
    aput-object v7, v6, v28

    .line 2306
    .line 2307
    const-string v7, "l"

    .line 2308
    .line 2309
    const-string v12, "1"

    .line 2310
    .line 2311
    filled-new-array {v7, v12}, [Ljava/lang/String;

    .line 2312
    .line 2313
    .line 2314
    move-result-object v7

    .line 2315
    aput-object v7, v6, v29

    .line 2316
    .line 2317
    new-array v7, v11, [[[Ljava/lang/String;

    .line 2318
    .line 2319
    aput-object v1, v7, v26

    .line 2320
    .line 2321
    aput-object v4, v7, v17

    .line 2322
    .line 2323
    aput-object v0, v7, v28

    .line 2324
    .line 2325
    aput-object v2, v7, v29

    .line 2326
    .line 2327
    aput-object v3, v7, v8

    .line 2328
    .line 2329
    aput-object v5, v7, v9

    .line 2330
    .line 2331
    aput-object v6, v7, v10

    .line 2332
    .line 2333
    sput-object v7, Lorg/apache/tika/sax/CleanPhoneText;->cleanSubstitutions:[[[Ljava/lang/String;

    .line 2334
    .line 2335
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static clean(Ljava/lang/String;)Ljava/lang/String;
    .locals 10

    .line 1
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    sget-object v0, Lorg/apache/tika/sax/CleanPhoneText;->cleanSubstitutions:[[[Ljava/lang/String;

    .line 8
    .line 9
    array-length v1, v0

    .line 10
    const/4 v2, 0x0

    .line 11
    move v3, v2

    .line 12
    :goto_0
    if-ge v3, v1, :cond_1

    .line 13
    .line 14
    aget-object v4, v0, v3

    .line 15
    .line 16
    array-length v5, v4

    .line 17
    move v6, v2

    .line 18
    :goto_1
    if-ge v6, v5, :cond_0

    .line 19
    .line 20
    aget-object v7, v4, v6

    .line 21
    .line 22
    aget-object v8, v7, v2

    .line 23
    .line 24
    const/4 v9, 0x1

    .line 25
    aget-object v7, v7, v9

    .line 26
    .line 27
    invoke-virtual {p0, v8, v7}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    add-int/lit8 v6, v6, 0x1

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    const-string v0, "[\\D+\\s]"

    .line 38
    .line 39
    const-string v1, ""

    .line 40
    .line 41
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0
.end method

.method public static extractPhoneNumbers(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-static {p0}, Lorg/apache/tika/sax/CleanPhoneText;->clean(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-string v0, "([2-9]\\d{2}[2-9]\\d{6})"

    .line 6
    .line 7
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 18
    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    :goto_0
    invoke-virtual {v0, v2}, Ljava/util/regex/Matcher;->find(I)Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-eqz v3, :cond_2

    .line 26
    .line 27
    const/4 v3, 0x1

    .line 28
    invoke-virtual {v0, v3}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    invoke-virtual {v0, v3}, Ljava/util/regex/Matcher;->start(I)I

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    invoke-virtual {v0, v3}, Ljava/util/regex/Matcher;->end(I)I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-lez v5, :cond_0

    .line 41
    .line 42
    add-int/lit8 v6, v5, -0x1

    .line 43
    .line 44
    invoke-virtual {p0, v6, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    goto :goto_1

    .line 49
    :cond_0
    const-string v5, ""

    .line 50
    .line 51
    :goto_1
    const-string v6, "82"

    .line 52
    .line 53
    invoke-virtual {v4, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 54
    .line 55
    .line 56
    move-result v6

    .line 57
    if-eqz v6, :cond_1

    .line 58
    .line 59
    const-string v6, "*"

    .line 60
    .line 61
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v5

    .line 65
    if-eqz v5, :cond_1

    .line 66
    .line 67
    add-int/lit8 v2, v2, 0x2

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_1
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move v2, v3

    .line 74
    goto :goto_0

    .line 75
    :cond_2
    return-object v1
.end method
