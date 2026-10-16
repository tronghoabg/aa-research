.class public abstract Lrd/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcg/j;

.field public static final b:[Lrd/b;

.field public static final c:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 65

    .line 1
    sget-object v3, Lcg/j;->d:Lcg/j;

    .line 2
    .line 3
    const-string v3, ":"

    .line 4
    .line 5
    invoke-static {v3}, Lab/b;->c(Ljava/lang/String;)Lcg/j;

    .line 6
    .line 7
    .line 8
    move-result-object v3

    .line 9
    sput-object v3, Lrd/e;->a:Lcg/j;

    .line 10
    .line 11
    new-instance v3, Lrd/b;

    .line 12
    .line 13
    sget-object v4, Lrd/b;->h:Lcg/j;

    .line 14
    .line 15
    const-string v5, ""

    .line 16
    .line 17
    invoke-direct {v3, v4, v5}, Lrd/b;-><init>(Lcg/j;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    new-instance v4, Lrd/b;

    .line 21
    .line 22
    sget-object v6, Lrd/b;->e:Lcg/j;

    .line 23
    .line 24
    const-string v7, "GET"

    .line 25
    .line 26
    invoke-direct {v4, v6, v7}, Lrd/b;-><init>(Lcg/j;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    new-instance v7, Lrd/b;

    .line 30
    .line 31
    const-string v8, "POST"

    .line 32
    .line 33
    invoke-direct {v7, v6, v8}, Lrd/b;-><init>(Lcg/j;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    new-instance v6, Lrd/b;

    .line 37
    .line 38
    sget-object v8, Lrd/b;->f:Lcg/j;

    .line 39
    .line 40
    const-string v9, "/"

    .line 41
    .line 42
    invoke-direct {v6, v8, v9}, Lrd/b;-><init>(Lcg/j;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    new-instance v9, Lrd/b;

    .line 46
    .line 47
    const-string v10, "/index.html"

    .line 48
    .line 49
    invoke-direct {v9, v8, v10}, Lrd/b;-><init>(Lcg/j;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    new-instance v8, Lrd/b;

    .line 53
    .line 54
    sget-object v10, Lrd/b;->g:Lcg/j;

    .line 55
    .line 56
    const-string v11, "http"

    .line 57
    .line 58
    invoke-direct {v8, v10, v11}, Lrd/b;-><init>(Lcg/j;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    new-instance v11, Lrd/b;

    .line 62
    .line 63
    const-string v12, "https"

    .line 64
    .line 65
    invoke-direct {v11, v10, v12}, Lrd/b;-><init>(Lcg/j;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    new-instance v10, Lrd/b;

    .line 69
    .line 70
    sget-object v12, Lrd/b;->d:Lcg/j;

    .line 71
    .line 72
    const-string v13, "200"

    .line 73
    .line 74
    invoke-direct {v10, v12, v13}, Lrd/b;-><init>(Lcg/j;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    new-instance v13, Lrd/b;

    .line 78
    .line 79
    const-string v14, "204"

    .line 80
    .line 81
    invoke-direct {v13, v12, v14}, Lrd/b;-><init>(Lcg/j;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    new-instance v14, Lrd/b;

    .line 85
    .line 86
    const-string v15, "206"

    .line 87
    .line 88
    invoke-direct {v14, v12, v15}, Lrd/b;-><init>(Lcg/j;Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    new-instance v15, Lrd/b;

    .line 92
    .line 93
    const/16 v16, 0x1

    .line 94
    .line 95
    const-string v0, "304"

    .line 96
    .line 97
    invoke-direct {v15, v12, v0}, Lrd/b;-><init>(Lcg/j;Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    new-instance v0, Lrd/b;

    .line 101
    .line 102
    const/16 v17, 0x0

    .line 103
    .line 104
    const-string v1, "400"

    .line 105
    .line 106
    invoke-direct {v0, v12, v1}, Lrd/b;-><init>(Lcg/j;Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    new-instance v1, Lrd/b;

    .line 110
    .line 111
    const-string v2, "404"

    .line 112
    .line 113
    invoke-direct {v1, v12, v2}, Lrd/b;-><init>(Lcg/j;Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    new-instance v2, Lrd/b;

    .line 117
    .line 118
    move-object/from16 v18, v0

    .line 119
    .line 120
    const-string v0, "500"

    .line 121
    .line 122
    invoke-direct {v2, v12, v0}, Lrd/b;-><init>(Lcg/j;Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    new-instance v0, Lrd/b;

    .line 126
    .line 127
    const-string v12, "accept-charset"

    .line 128
    .line 129
    invoke-direct {v0, v12, v5}, Lrd/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    new-instance v12, Lrd/b;

    .line 133
    .line 134
    move-object/from16 v19, v0

    .line 135
    .line 136
    const-string v0, "accept-encoding"

    .line 137
    .line 138
    move-object/from16 v20, v1

    .line 139
    .line 140
    const-string v1, "gzip, deflate"

    .line 141
    .line 142
    invoke-direct {v12, v0, v1}, Lrd/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    new-instance v0, Lrd/b;

    .line 146
    .line 147
    const-string v1, "accept-language"

    .line 148
    .line 149
    invoke-direct {v0, v1, v5}, Lrd/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    new-instance v1, Lrd/b;

    .line 153
    .line 154
    move-object/from16 v21, v0

    .line 155
    .line 156
    const-string v0, "accept-ranges"

    .line 157
    .line 158
    invoke-direct {v1, v0, v5}, Lrd/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    new-instance v0, Lrd/b;

    .line 162
    .line 163
    move-object/from16 v22, v1

    .line 164
    .line 165
    const-string v1, "accept"

    .line 166
    .line 167
    invoke-direct {v0, v1, v5}, Lrd/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    new-instance v1, Lrd/b;

    .line 171
    .line 172
    move-object/from16 v23, v0

    .line 173
    .line 174
    const-string v0, "access-control-allow-origin"

    .line 175
    .line 176
    invoke-direct {v1, v0, v5}, Lrd/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    new-instance v0, Lrd/b;

    .line 180
    .line 181
    move-object/from16 v24, v1

    .line 182
    .line 183
    const-string v1, "age"

    .line 184
    .line 185
    invoke-direct {v0, v1, v5}, Lrd/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    new-instance v1, Lrd/b;

    .line 189
    .line 190
    move-object/from16 v25, v0

    .line 191
    .line 192
    const-string v0, "allow"

    .line 193
    .line 194
    invoke-direct {v1, v0, v5}, Lrd/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    new-instance v0, Lrd/b;

    .line 198
    .line 199
    move-object/from16 v26, v1

    .line 200
    .line 201
    const-string v1, "authorization"

    .line 202
    .line 203
    invoke-direct {v0, v1, v5}, Lrd/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    new-instance v1, Lrd/b;

    .line 207
    .line 208
    move-object/from16 v27, v0

    .line 209
    .line 210
    const-string v0, "cache-control"

    .line 211
    .line 212
    invoke-direct {v1, v0, v5}, Lrd/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    new-instance v0, Lrd/b;

    .line 216
    .line 217
    move-object/from16 v28, v1

    .line 218
    .line 219
    const-string v1, "content-disposition"

    .line 220
    .line 221
    invoke-direct {v0, v1, v5}, Lrd/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    new-instance v1, Lrd/b;

    .line 225
    .line 226
    move-object/from16 v29, v0

    .line 227
    .line 228
    const-string v0, "content-encoding"

    .line 229
    .line 230
    invoke-direct {v1, v0, v5}, Lrd/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    new-instance v0, Lrd/b;

    .line 234
    .line 235
    move-object/from16 v30, v1

    .line 236
    .line 237
    const-string v1, "content-language"

    .line 238
    .line 239
    invoke-direct {v0, v1, v5}, Lrd/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 240
    .line 241
    .line 242
    new-instance v1, Lrd/b;

    .line 243
    .line 244
    move-object/from16 v31, v0

    .line 245
    .line 246
    const-string v0, "content-length"

    .line 247
    .line 248
    invoke-direct {v1, v0, v5}, Lrd/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 249
    .line 250
    .line 251
    new-instance v0, Lrd/b;

    .line 252
    .line 253
    move-object/from16 v32, v1

    .line 254
    .line 255
    const-string v1, "content-location"

    .line 256
    .line 257
    invoke-direct {v0, v1, v5}, Lrd/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 258
    .line 259
    .line 260
    new-instance v1, Lrd/b;

    .line 261
    .line 262
    move-object/from16 v33, v0

    .line 263
    .line 264
    const-string v0, "content-range"

    .line 265
    .line 266
    invoke-direct {v1, v0, v5}, Lrd/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 267
    .line 268
    .line 269
    new-instance v0, Lrd/b;

    .line 270
    .line 271
    move-object/from16 v34, v1

    .line 272
    .line 273
    const-string v1, "content-type"

    .line 274
    .line 275
    invoke-direct {v0, v1, v5}, Lrd/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 276
    .line 277
    .line 278
    new-instance v1, Lrd/b;

    .line 279
    .line 280
    move-object/from16 v35, v0

    .line 281
    .line 282
    const-string v0, "cookie"

    .line 283
    .line 284
    invoke-direct {v1, v0, v5}, Lrd/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    new-instance v0, Lrd/b;

    .line 288
    .line 289
    move-object/from16 v36, v1

    .line 290
    .line 291
    const-string v1, "date"

    .line 292
    .line 293
    invoke-direct {v0, v1, v5}, Lrd/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 294
    .line 295
    .line 296
    new-instance v1, Lrd/b;

    .line 297
    .line 298
    move-object/from16 v37, v0

    .line 299
    .line 300
    const-string v0, "etag"

    .line 301
    .line 302
    invoke-direct {v1, v0, v5}, Lrd/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 303
    .line 304
    .line 305
    new-instance v0, Lrd/b;

    .line 306
    .line 307
    move-object/from16 v38, v1

    .line 308
    .line 309
    const-string v1, "expect"

    .line 310
    .line 311
    invoke-direct {v0, v1, v5}, Lrd/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 312
    .line 313
    .line 314
    new-instance v1, Lrd/b;

    .line 315
    .line 316
    move-object/from16 v39, v0

    .line 317
    .line 318
    const-string v0, "expires"

    .line 319
    .line 320
    invoke-direct {v1, v0, v5}, Lrd/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 321
    .line 322
    .line 323
    new-instance v0, Lrd/b;

    .line 324
    .line 325
    move-object/from16 v40, v1

    .line 326
    .line 327
    const-string v1, "from"

    .line 328
    .line 329
    invoke-direct {v0, v1, v5}, Lrd/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 330
    .line 331
    .line 332
    new-instance v1, Lrd/b;

    .line 333
    .line 334
    move-object/from16 v41, v0

    .line 335
    .line 336
    const-string v0, "host"

    .line 337
    .line 338
    invoke-direct {v1, v0, v5}, Lrd/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 339
    .line 340
    .line 341
    new-instance v0, Lrd/b;

    .line 342
    .line 343
    move-object/from16 v42, v1

    .line 344
    .line 345
    const-string v1, "if-match"

    .line 346
    .line 347
    invoke-direct {v0, v1, v5}, Lrd/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 348
    .line 349
    .line 350
    new-instance v1, Lrd/b;

    .line 351
    .line 352
    move-object/from16 v43, v0

    .line 353
    .line 354
    const-string v0, "if-modified-since"

    .line 355
    .line 356
    invoke-direct {v1, v0, v5}, Lrd/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 357
    .line 358
    .line 359
    new-instance v0, Lrd/b;

    .line 360
    .line 361
    move-object/from16 v44, v1

    .line 362
    .line 363
    const-string v1, "if-none-match"

    .line 364
    .line 365
    invoke-direct {v0, v1, v5}, Lrd/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 366
    .line 367
    .line 368
    new-instance v1, Lrd/b;

    .line 369
    .line 370
    move-object/from16 v45, v0

    .line 371
    .line 372
    const-string v0, "if-range"

    .line 373
    .line 374
    invoke-direct {v1, v0, v5}, Lrd/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 375
    .line 376
    .line 377
    new-instance v0, Lrd/b;

    .line 378
    .line 379
    move-object/from16 v46, v1

    .line 380
    .line 381
    const-string v1, "if-unmodified-since"

    .line 382
    .line 383
    invoke-direct {v0, v1, v5}, Lrd/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 384
    .line 385
    .line 386
    new-instance v1, Lrd/b;

    .line 387
    .line 388
    move-object/from16 v47, v0

    .line 389
    .line 390
    const-string v0, "last-modified"

    .line 391
    .line 392
    invoke-direct {v1, v0, v5}, Lrd/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 393
    .line 394
    .line 395
    new-instance v0, Lrd/b;

    .line 396
    .line 397
    move-object/from16 v48, v1

    .line 398
    .line 399
    const-string v1, "link"

    .line 400
    .line 401
    invoke-direct {v0, v1, v5}, Lrd/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 402
    .line 403
    .line 404
    new-instance v1, Lrd/b;

    .line 405
    .line 406
    move-object/from16 v49, v0

    .line 407
    .line 408
    const-string v0, "location"

    .line 409
    .line 410
    invoke-direct {v1, v0, v5}, Lrd/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 411
    .line 412
    .line 413
    new-instance v0, Lrd/b;

    .line 414
    .line 415
    move-object/from16 v50, v1

    .line 416
    .line 417
    const-string v1, "max-forwards"

    .line 418
    .line 419
    invoke-direct {v0, v1, v5}, Lrd/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 420
    .line 421
    .line 422
    new-instance v1, Lrd/b;

    .line 423
    .line 424
    move-object/from16 v51, v0

    .line 425
    .line 426
    const-string v0, "proxy-authenticate"

    .line 427
    .line 428
    invoke-direct {v1, v0, v5}, Lrd/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 429
    .line 430
    .line 431
    new-instance v0, Lrd/b;

    .line 432
    .line 433
    move-object/from16 v52, v1

    .line 434
    .line 435
    const-string v1, "proxy-authorization"

    .line 436
    .line 437
    invoke-direct {v0, v1, v5}, Lrd/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 438
    .line 439
    .line 440
    new-instance v1, Lrd/b;

    .line 441
    .line 442
    move-object/from16 v53, v0

    .line 443
    .line 444
    const-string v0, "range"

    .line 445
    .line 446
    invoke-direct {v1, v0, v5}, Lrd/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 447
    .line 448
    .line 449
    new-instance v0, Lrd/b;

    .line 450
    .line 451
    move-object/from16 v54, v1

    .line 452
    .line 453
    const-string v1, "referer"

    .line 454
    .line 455
    invoke-direct {v0, v1, v5}, Lrd/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 456
    .line 457
    .line 458
    new-instance v1, Lrd/b;

    .line 459
    .line 460
    move-object/from16 v55, v0

    .line 461
    .line 462
    const-string v0, "refresh"

    .line 463
    .line 464
    invoke-direct {v1, v0, v5}, Lrd/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 465
    .line 466
    .line 467
    new-instance v0, Lrd/b;

    .line 468
    .line 469
    move-object/from16 v56, v1

    .line 470
    .line 471
    const-string v1, "retry-after"

    .line 472
    .line 473
    invoke-direct {v0, v1, v5}, Lrd/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 474
    .line 475
    .line 476
    new-instance v1, Lrd/b;

    .line 477
    .line 478
    move-object/from16 v57, v0

    .line 479
    .line 480
    const-string v0, "server"

    .line 481
    .line 482
    invoke-direct {v1, v0, v5}, Lrd/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 483
    .line 484
    .line 485
    new-instance v0, Lrd/b;

    .line 486
    .line 487
    move-object/from16 v58, v1

    .line 488
    .line 489
    const-string v1, "set-cookie"

    .line 490
    .line 491
    invoke-direct {v0, v1, v5}, Lrd/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 492
    .line 493
    .line 494
    new-instance v1, Lrd/b;

    .line 495
    .line 496
    move-object/from16 v59, v0

    .line 497
    .line 498
    const-string v0, "strict-transport-security"

    .line 499
    .line 500
    invoke-direct {v1, v0, v5}, Lrd/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 501
    .line 502
    .line 503
    new-instance v0, Lrd/b;

    .line 504
    .line 505
    move-object/from16 v60, v1

    .line 506
    .line 507
    const-string v1, "transfer-encoding"

    .line 508
    .line 509
    invoke-direct {v0, v1, v5}, Lrd/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 510
    .line 511
    .line 512
    new-instance v1, Lrd/b;

    .line 513
    .line 514
    move-object/from16 v61, v0

    .line 515
    .line 516
    const-string v0, "user-agent"

    .line 517
    .line 518
    invoke-direct {v1, v0, v5}, Lrd/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 519
    .line 520
    .line 521
    new-instance v0, Lrd/b;

    .line 522
    .line 523
    move-object/from16 v62, v1

    .line 524
    .line 525
    const-string v1, "vary"

    .line 526
    .line 527
    invoke-direct {v0, v1, v5}, Lrd/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 528
    .line 529
    .line 530
    new-instance v1, Lrd/b;

    .line 531
    .line 532
    move-object/from16 v63, v0

    .line 533
    .line 534
    const-string v0, "via"

    .line 535
    .line 536
    invoke-direct {v1, v0, v5}, Lrd/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 537
    .line 538
    .line 539
    new-instance v0, Lrd/b;

    .line 540
    .line 541
    move-object/from16 v64, v1

    .line 542
    .line 543
    const-string v1, "www-authenticate"

    .line 544
    .line 545
    invoke-direct {v0, v1, v5}, Lrd/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 546
    .line 547
    .line 548
    const/16 v1, 0x3d

    .line 549
    .line 550
    new-array v5, v1, [Lrd/b;

    .line 551
    .line 552
    aput-object v3, v5, v17

    .line 553
    .line 554
    aput-object v4, v5, v16

    .line 555
    .line 556
    const/4 v1, 0x2

    .line 557
    aput-object v7, v5, v1

    .line 558
    .line 559
    const/4 v1, 0x3

    .line 560
    aput-object v6, v5, v1

    .line 561
    .line 562
    const/4 v1, 0x4

    .line 563
    aput-object v9, v5, v1

    .line 564
    .line 565
    const/4 v1, 0x5

    .line 566
    aput-object v8, v5, v1

    .line 567
    .line 568
    const/4 v1, 0x6

    .line 569
    aput-object v11, v5, v1

    .line 570
    .line 571
    const/4 v1, 0x7

    .line 572
    aput-object v10, v5, v1

    .line 573
    .line 574
    const/16 v1, 0x8

    .line 575
    .line 576
    aput-object v13, v5, v1

    .line 577
    .line 578
    const/16 v1, 0x9

    .line 579
    .line 580
    aput-object v14, v5, v1

    .line 581
    .line 582
    const/16 v1, 0xa

    .line 583
    .line 584
    aput-object v15, v5, v1

    .line 585
    .line 586
    const/16 v1, 0xb

    .line 587
    .line 588
    aput-object v18, v5, v1

    .line 589
    .line 590
    const/16 v1, 0xc

    .line 591
    .line 592
    aput-object v20, v5, v1

    .line 593
    .line 594
    const/16 v1, 0xd

    .line 595
    .line 596
    aput-object v2, v5, v1

    .line 597
    .line 598
    const/16 v1, 0xe

    .line 599
    .line 600
    aput-object v19, v5, v1

    .line 601
    .line 602
    const/16 v1, 0xf

    .line 603
    .line 604
    aput-object v12, v5, v1

    .line 605
    .line 606
    const/16 v1, 0x10

    .line 607
    .line 608
    aput-object v21, v5, v1

    .line 609
    .line 610
    const/16 v1, 0x11

    .line 611
    .line 612
    aput-object v22, v5, v1

    .line 613
    .line 614
    const/16 v1, 0x12

    .line 615
    .line 616
    aput-object v23, v5, v1

    .line 617
    .line 618
    const/16 v1, 0x13

    .line 619
    .line 620
    aput-object v24, v5, v1

    .line 621
    .line 622
    const/16 v1, 0x14

    .line 623
    .line 624
    aput-object v25, v5, v1

    .line 625
    .line 626
    const/16 v1, 0x15

    .line 627
    .line 628
    aput-object v26, v5, v1

    .line 629
    .line 630
    const/16 v1, 0x16

    .line 631
    .line 632
    aput-object v27, v5, v1

    .line 633
    .line 634
    const/16 v1, 0x17

    .line 635
    .line 636
    aput-object v28, v5, v1

    .line 637
    .line 638
    const/16 v1, 0x18

    .line 639
    .line 640
    aput-object v29, v5, v1

    .line 641
    .line 642
    const/16 v1, 0x19

    .line 643
    .line 644
    aput-object v30, v5, v1

    .line 645
    .line 646
    const/16 v1, 0x1a

    .line 647
    .line 648
    aput-object v31, v5, v1

    .line 649
    .line 650
    const/16 v1, 0x1b

    .line 651
    .line 652
    aput-object v32, v5, v1

    .line 653
    .line 654
    const/16 v1, 0x1c

    .line 655
    .line 656
    aput-object v33, v5, v1

    .line 657
    .line 658
    const/16 v1, 0x1d

    .line 659
    .line 660
    aput-object v34, v5, v1

    .line 661
    .line 662
    const/16 v1, 0x1e

    .line 663
    .line 664
    aput-object v35, v5, v1

    .line 665
    .line 666
    const/16 v1, 0x1f

    .line 667
    .line 668
    aput-object v36, v5, v1

    .line 669
    .line 670
    const/16 v1, 0x20

    .line 671
    .line 672
    aput-object v37, v5, v1

    .line 673
    .line 674
    const/16 v1, 0x21

    .line 675
    .line 676
    aput-object v38, v5, v1

    .line 677
    .line 678
    const/16 v1, 0x22

    .line 679
    .line 680
    aput-object v39, v5, v1

    .line 681
    .line 682
    const/16 v1, 0x23

    .line 683
    .line 684
    aput-object v40, v5, v1

    .line 685
    .line 686
    const/16 v1, 0x24

    .line 687
    .line 688
    aput-object v41, v5, v1

    .line 689
    .line 690
    const/16 v1, 0x25

    .line 691
    .line 692
    aput-object v42, v5, v1

    .line 693
    .line 694
    const/16 v1, 0x26

    .line 695
    .line 696
    aput-object v43, v5, v1

    .line 697
    .line 698
    const/16 v1, 0x27

    .line 699
    .line 700
    aput-object v44, v5, v1

    .line 701
    .line 702
    const/16 v1, 0x28

    .line 703
    .line 704
    aput-object v45, v5, v1

    .line 705
    .line 706
    const/16 v1, 0x29

    .line 707
    .line 708
    aput-object v46, v5, v1

    .line 709
    .line 710
    const/16 v1, 0x2a

    .line 711
    .line 712
    aput-object v47, v5, v1

    .line 713
    .line 714
    const/16 v1, 0x2b

    .line 715
    .line 716
    aput-object v48, v5, v1

    .line 717
    .line 718
    const/16 v1, 0x2c

    .line 719
    .line 720
    aput-object v49, v5, v1

    .line 721
    .line 722
    const/16 v1, 0x2d

    .line 723
    .line 724
    aput-object v50, v5, v1

    .line 725
    .line 726
    const/16 v1, 0x2e

    .line 727
    .line 728
    aput-object v51, v5, v1

    .line 729
    .line 730
    const/16 v1, 0x2f

    .line 731
    .line 732
    aput-object v52, v5, v1

    .line 733
    .line 734
    const/16 v1, 0x30

    .line 735
    .line 736
    aput-object v53, v5, v1

    .line 737
    .line 738
    const/16 v1, 0x31

    .line 739
    .line 740
    aput-object v54, v5, v1

    .line 741
    .line 742
    const/16 v1, 0x32

    .line 743
    .line 744
    aput-object v55, v5, v1

    .line 745
    .line 746
    const/16 v1, 0x33

    .line 747
    .line 748
    aput-object v56, v5, v1

    .line 749
    .line 750
    const/16 v1, 0x34

    .line 751
    .line 752
    aput-object v57, v5, v1

    .line 753
    .line 754
    const/16 v1, 0x35

    .line 755
    .line 756
    aput-object v58, v5, v1

    .line 757
    .line 758
    const/16 v1, 0x36

    .line 759
    .line 760
    aput-object v59, v5, v1

    .line 761
    .line 762
    const/16 v1, 0x37

    .line 763
    .line 764
    aput-object v60, v5, v1

    .line 765
    .line 766
    const/16 v1, 0x38

    .line 767
    .line 768
    aput-object v61, v5, v1

    .line 769
    .line 770
    const/16 v1, 0x39

    .line 771
    .line 772
    aput-object v62, v5, v1

    .line 773
    .line 774
    const/16 v1, 0x3a

    .line 775
    .line 776
    aput-object v63, v5, v1

    .line 777
    .line 778
    const/16 v1, 0x3b

    .line 779
    .line 780
    aput-object v64, v5, v1

    .line 781
    .line 782
    const/16 v1, 0x3c

    .line 783
    .line 784
    aput-object v0, v5, v1

    .line 785
    .line 786
    sput-object v5, Lrd/e;->b:[Lrd/b;

    .line 787
    .line 788
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 789
    .line 790
    const/16 v1, 0x3d

    .line 791
    .line 792
    invoke-direct {v0, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 793
    .line 794
    .line 795
    move/from16 v2, v17

    .line 796
    .line 797
    :goto_0
    if-ge v2, v1, :cond_1

    .line 798
    .line 799
    aget-object v3, v5, v2

    .line 800
    .line 801
    iget-object v3, v3, Lrd/b;->a:Lcg/j;

    .line 802
    .line 803
    invoke-interface {v0, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 804
    .line 805
    .line 806
    move-result v3

    .line 807
    if-nez v3, :cond_0

    .line 808
    .line 809
    aget-object v3, v5, v2

    .line 810
    .line 811
    iget-object v3, v3, Lrd/b;->a:Lcg/j;

    .line 812
    .line 813
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 814
    .line 815
    .line 816
    move-result-object v4

    .line 817
    invoke-interface {v0, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 818
    .line 819
    .line 820
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 821
    .line 822
    goto :goto_0

    .line 823
    :cond_1
    invoke-static {v0}, Lj$/util/DesugarCollections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 824
    .line 825
    .line 826
    move-result-object v0

    .line 827
    sput-object v0, Lrd/e;->c:Ljava/util/Map;

    .line 828
    .line 829
    return-void
.end method

.method public static a(Lcg/j;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcg/j;->d()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    :goto_0
    if-ge v1, v0, :cond_2

    .line 7
    .line 8
    invoke-virtual {p0, v1}, Lcg/j;->i(I)B

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    const/16 v3, 0x41

    .line 13
    .line 14
    if-lt v2, v3, :cond_1

    .line 15
    .line 16
    const/16 v3, 0x5a

    .line 17
    .line 18
    if-le v2, v3, :cond_0

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, Ljava/io/IOException;

    .line 22
    .line 23
    invoke-virtual {p0}, Lcg/j;->t()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    const-string v1, "PROTOCOL_ERROR response malformed: mixed case name: "

    .line 28
    .line 29
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw v0

    .line 37
    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_2
    return-void
.end method
