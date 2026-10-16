.class public final Lz5/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lu5/e;

.field public final c:LA5/d;

.field public final d:Lz5/c;

.field public final e:Ljava/util/concurrent/Executor;

.field public final f:LB5/c;

.field public final g:LC5/a;

.field public final h:LC5/a;

.field public final i:LA5/c;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lu5/e;LA5/d;Lz5/c;Ljava/util/concurrent/Executor;LB5/c;LC5/a;LC5/a;LA5/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lz5/f;->a:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, Lz5/f;->b:Lu5/e;

    .line 7
    .line 8
    iput-object p3, p0, Lz5/f;->c:LA5/d;

    .line 9
    .line 10
    iput-object p4, p0, Lz5/f;->d:Lz5/c;

    .line 11
    .line 12
    iput-object p5, p0, Lz5/f;->e:Ljava/util/concurrent/Executor;

    .line 13
    .line 14
    iput-object p6, p0, Lz5/f;->f:LB5/c;

    .line 15
    .line 16
    iput-object p7, p0, Lz5/f;->g:LC5/a;

    .line 17
    .line 18
    iput-object p8, p0, Lz5/f;->h:LC5/a;

    .line 19
    .line 20
    iput-object p9, p0, Lz5/f;->i:LA5/c;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final a(Lt5/i;I)V
    .locals 45

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v3, p1

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    const/4 v6, 0x1

    .line 7
    const/4 v4, 0x0

    .line 8
    iget-object v0, v1, Lz5/f;->b:Lu5/e;

    .line 9
    .line 10
    iget-object v5, v3, Lt5/i;->a:Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {v0, v5}, Lu5/e;->a(Ljava/lang/String;)Lu5/f;

    .line 13
    .line 14
    .line 15
    move-result-object v5

    .line 16
    const-wide/16 v9, 0x0

    .line 17
    .line 18
    :goto_0
    new-instance v0, Lz5/e;

    .line 19
    .line 20
    invoke-direct {v0, v1, v3, v4}, Lz5/e;-><init>(Lz5/f;Lt5/i;I)V

    .line 21
    .line 22
    .line 23
    iget-object v11, v1, Lz5/f;->f:LB5/c;

    .line 24
    .line 25
    check-cast v11, LA5/m;

    .line 26
    .line 27
    invoke-virtual {v11, v0}, LA5/m;->o(LB5/b;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Ljava/lang/Boolean;

    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_26

    .line 38
    .line 39
    new-instance v0, Lz5/e;

    .line 40
    .line 41
    invoke-direct {v0, v1, v3, v6}, Lz5/e;-><init>(Lz5/f;Lt5/i;I)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v11, v0}, LA5/m;->o(LB5/b;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    move-object v12, v0

    .line 49
    check-cast v12, Ljava/lang/Iterable;

    .line 50
    .line 51
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-nez v0, :cond_0

    .line 60
    .line 61
    return-void

    .line 62
    :cond_0
    const-wide/16 v14, -0x1

    .line 63
    .line 64
    iget-object v7, v3, Lt5/i;->b:[B

    .line 65
    .line 66
    if-nez v5, :cond_1

    .line 67
    .line 68
    const-string v0, "Uploader"

    .line 69
    .line 70
    const-string v13, "Unknown backend for %s, deleting event batch for it..."

    .line 71
    .line 72
    invoke-static {v0, v13, v3}, Lic/d;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    new-instance v0, Lu5/a;

    .line 76
    .line 77
    invoke-direct {v0, v2, v14, v15}, Lu5/a;-><init>(IJ)V

    .line 78
    .line 79
    .line 80
    move v4, v2

    .line 81
    move-object/from16 v31, v5

    .line 82
    .line 83
    :goto_1
    const/4 v1, 0x2

    .line 84
    goto/16 :goto_16

    .line 85
    .line 86
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    .line 87
    .line 88
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 89
    .line 90
    .line 91
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 92
    .line 93
    .line 94
    move-result-object v13

    .line 95
    :goto_2
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 96
    .line 97
    .line 98
    move-result v16

    .line 99
    if-eqz v16, :cond_2

    .line 100
    .line 101
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v16

    .line 105
    move-object/from16 v8, v16

    .line 106
    .line 107
    check-cast v8, LA5/b;

    .line 108
    .line 109
    iget-object v8, v8, LA5/b;->c:Lt5/h;

    .line 110
    .line 111
    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    goto :goto_2

    .line 115
    :cond_2
    if-eqz v7, :cond_3

    .line 116
    .line 117
    move v8, v6

    .line 118
    goto :goto_3

    .line 119
    :cond_3
    move v8, v4

    .line 120
    :goto_3
    const-string v13, "proto"

    .line 121
    .line 122
    if-eqz v8, :cond_4

    .line 123
    .line 124
    iget-object v8, v1, Lz5/f;->i:LA5/c;

    .line 125
    .line 126
    invoke-static {v8}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    new-instance v6, Lo1/c;

    .line 130
    .line 131
    const/16 v2, 0x16

    .line 132
    .line 133
    invoke-direct {v6, v8, v2}, Lo1/c;-><init>(Ljava/lang/Object;I)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v11, v6}, LA5/m;->o(LB5/b;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    check-cast v2, Lw5/a;

    .line 141
    .line 142
    new-instance v6, Lcom/bumptech/glide/f;

    .line 143
    .line 144
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 145
    .line 146
    .line 147
    new-instance v8, Ljava/util/HashMap;

    .line 148
    .line 149
    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    .line 150
    .line 151
    .line 152
    iput-object v8, v6, Lcom/bumptech/glide/f;->f:Ljava/lang/Object;

    .line 153
    .line 154
    iget-object v8, v1, Lz5/f;->g:LC5/a;

    .line 155
    .line 156
    invoke-interface {v8}, LC5/a;->c()J

    .line 157
    .line 158
    .line 159
    move-result-wide v17

    .line 160
    invoke-static/range {v17 .. v18}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 161
    .line 162
    .line 163
    move-result-object v8

    .line 164
    iput-object v8, v6, Lcom/bumptech/glide/f;->d:Ljava/lang/Object;

    .line 165
    .line 166
    iget-object v8, v1, Lz5/f;->h:LC5/a;

    .line 167
    .line 168
    invoke-interface {v8}, LC5/a;->c()J

    .line 169
    .line 170
    .line 171
    move-result-wide v17

    .line 172
    invoke-static/range {v17 .. v18}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 173
    .line 174
    .line 175
    move-result-object v8

    .line 176
    iput-object v8, v6, Lcom/bumptech/glide/f;->e:Ljava/lang/Object;

    .line 177
    .line 178
    const-string v8, "GDT_CLIENT_METRICS"

    .line 179
    .line 180
    iput-object v8, v6, Lcom/bumptech/glide/f;->a:Ljava/lang/Object;

    .line 181
    .line 182
    new-instance v8, Lt5/l;

    .line 183
    .line 184
    new-instance v14, Lq5/c;

    .line 185
    .line 186
    invoke-direct {v14, v13}, Lq5/c;-><init>(Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 190
    .line 191
    .line 192
    sget-object v15, Lt5/o;->a:Lb7/k;

    .line 193
    .line 194
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 195
    .line 196
    .line 197
    new-instance v4, Ljava/io/ByteArrayOutputStream;

    .line 198
    .line 199
    invoke-direct {v4}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 200
    .line 201
    .line 202
    :try_start_0
    invoke-virtual {v15, v4, v2}, Lb7/k;->s(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 203
    .line 204
    .line 205
    :catch_0
    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 206
    .line 207
    .line 208
    move-result-object v2

    .line 209
    invoke-direct {v8, v14, v2}, Lt5/l;-><init>(Lq5/c;[B)V

    .line 210
    .line 211
    .line 212
    iput-object v8, v6, Lcom/bumptech/glide/f;->c:Ljava/lang/Object;

    .line 213
    .line 214
    invoke-virtual {v6}, Lcom/bumptech/glide/f;->f()Lt5/h;

    .line 215
    .line 216
    .line 217
    move-result-object v2

    .line 218
    move-object v4, v5

    .line 219
    check-cast v4, Lr5/b;

    .line 220
    .line 221
    invoke-virtual {v4, v2}, Lr5/b;->a(Lt5/h;)Lt5/h;

    .line 222
    .line 223
    .line 224
    move-result-object v2

    .line 225
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 226
    .line 227
    .line 228
    :cond_4
    move-object v2, v5

    .line 229
    check-cast v2, Lr5/b;

    .line 230
    .line 231
    new-instance v4, Ljava/util/HashMap;

    .line 232
    .line 233
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 234
    .line 235
    .line 236
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 237
    .line 238
    .line 239
    move-result-object v0

    .line 240
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 241
    .line 242
    .line 243
    move-result v6

    .line 244
    if-eqz v6, :cond_6

    .line 245
    .line 246
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v6

    .line 250
    check-cast v6, Lt5/h;

    .line 251
    .line 252
    iget-object v8, v6, Lt5/h;->a:Ljava/lang/String;

    .line 253
    .line 254
    invoke-virtual {v4, v8}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 255
    .line 256
    .line 257
    move-result v14

    .line 258
    if-nez v14, :cond_5

    .line 259
    .line 260
    new-instance v14, Ljava/util/ArrayList;

    .line 261
    .line 262
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 263
    .line 264
    .line 265
    invoke-virtual {v14, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 266
    .line 267
    .line 268
    invoke-virtual {v4, v8, v14}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    goto :goto_4

    .line 272
    :cond_5
    invoke-virtual {v4, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object v8

    .line 276
    check-cast v8, Ljava/util/List;

    .line 277
    .line 278
    invoke-interface {v8, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 279
    .line 280
    .line 281
    goto :goto_4

    .line 282
    :cond_6
    new-instance v0, Ljava/util/ArrayList;

    .line 283
    .line 284
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v4}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 288
    .line 289
    .line 290
    move-result-object v4

    .line 291
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 292
    .line 293
    .line 294
    move-result-object v4

    .line 295
    :goto_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 296
    .line 297
    .line 298
    move-result v6

    .line 299
    const-string v15, "CctTransportBackend"

    .line 300
    .line 301
    if-eqz v6, :cond_16

    .line 302
    .line 303
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    move-result-object v6

    .line 307
    check-cast v6, Ljava/util/Map$Entry;

    .line 308
    .line 309
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    move-result-object v20

    .line 313
    move-object/from16 v14, v20

    .line 314
    .line 315
    check-cast v14, Ljava/util/List;

    .line 316
    .line 317
    const/4 v8, 0x0

    .line 318
    invoke-interface {v14, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    move-result-object v14

    .line 322
    check-cast v14, Lt5/h;

    .line 323
    .line 324
    sget-object v19, Ls5/K;->a:Ls5/K;

    .line 325
    .line 326
    iget-object v8, v2, Lr5/b;->f:LC5/a;

    .line 327
    .line 328
    invoke-interface {v8}, LC5/a;->c()J

    .line 329
    .line 330
    .line 331
    move-result-wide v22

    .line 332
    iget-object v8, v2, Lr5/b;->e:LC5/a;

    .line 333
    .line 334
    invoke-interface {v8}, LC5/a;->c()J

    .line 335
    .line 336
    .line 337
    move-result-wide v24

    .line 338
    const-string v8, "sdk-version"

    .line 339
    .line 340
    invoke-virtual {v14, v8}, Lt5/h;->b(Ljava/lang/String;)I

    .line 341
    .line 342
    .line 343
    move-result v8

    .line 344
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 345
    .line 346
    .line 347
    move-result-object v27

    .line 348
    const-string v8, "model"

    .line 349
    .line 350
    invoke-virtual {v14, v8}, Lt5/h;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 351
    .line 352
    .line 353
    move-result-object v28

    .line 354
    const-string v8, "hardware"

    .line 355
    .line 356
    invoke-virtual {v14, v8}, Lt5/h;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 357
    .line 358
    .line 359
    move-result-object v29

    .line 360
    const-string v8, "device"

    .line 361
    .line 362
    invoke-virtual {v14, v8}, Lt5/h;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 363
    .line 364
    .line 365
    move-result-object v30

    .line 366
    const-string v8, "product"

    .line 367
    .line 368
    invoke-virtual {v14, v8}, Lt5/h;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 369
    .line 370
    .line 371
    move-result-object v31

    .line 372
    const-string v8, "os-uild"

    .line 373
    .line 374
    invoke-virtual {v14, v8}, Lt5/h;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 375
    .line 376
    .line 377
    move-result-object v32

    .line 378
    const-string v8, "manufacturer"

    .line 379
    .line 380
    invoke-virtual {v14, v8}, Lt5/h;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 381
    .line 382
    .line 383
    move-result-object v33

    .line 384
    const-string v8, "fingerprint"

    .line 385
    .line 386
    invoke-virtual {v14, v8}, Lt5/h;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 387
    .line 388
    .line 389
    move-result-object v34

    .line 390
    const-string v8, "country"

    .line 391
    .line 392
    invoke-virtual {v14, v8}, Lt5/h;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 393
    .line 394
    .line 395
    move-result-object v36

    .line 396
    const-string v8, "locale"

    .line 397
    .line 398
    invoke-virtual {v14, v8}, Lt5/h;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 399
    .line 400
    .line 401
    move-result-object v35

    .line 402
    const-string v8, "mcc_mnc"

    .line 403
    .line 404
    invoke-virtual {v14, v8}, Lt5/h;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 405
    .line 406
    .line 407
    move-result-object v37

    .line 408
    const-string v8, "application_build"

    .line 409
    .line 410
    invoke-virtual {v14, v8}, Lt5/h;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 411
    .line 412
    .line 413
    move-result-object v38

    .line 414
    new-instance v26, Ls5/m;

    .line 415
    .line 416
    invoke-direct/range {v26 .. v38}, Ls5/m;-><init>(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 417
    .line 418
    .line 419
    move-object/from16 v8, v26

    .line 420
    .line 421
    new-instance v14, Ls5/o;

    .line 422
    .line 423
    invoke-direct {v14, v8}, Ls5/o;-><init>(Ls5/m;)V

    .line 424
    .line 425
    .line 426
    :try_start_1
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 427
    .line 428
    .line 429
    move-result-object v8

    .line 430
    check-cast v8, Ljava/lang/String;

    .line 431
    .line 432
    invoke-static {v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 433
    .line 434
    .line 435
    move-result v8

    .line 436
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 437
    .line 438
    .line 439
    move-result-object v8
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    .line 440
    move-object/from16 v27, v8

    .line 441
    .line 442
    const/16 v28, 0x0

    .line 443
    .line 444
    goto :goto_6

    .line 445
    :catch_1
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 446
    .line 447
    .line 448
    move-result-object v8

    .line 449
    check-cast v8, Ljava/lang/String;

    .line 450
    .line 451
    move-object/from16 v28, v8

    .line 452
    .line 453
    const/16 v27, 0x0

    .line 454
    .line 455
    :goto_6
    new-instance v8, Ljava/util/ArrayList;

    .line 456
    .line 457
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 458
    .line 459
    .line 460
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 461
    .line 462
    .line 463
    move-result-object v6

    .line 464
    check-cast v6, Ljava/util/List;

    .line 465
    .line 466
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 467
    .line 468
    .line 469
    move-result-object v6

    .line 470
    :goto_7
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 471
    .line 472
    .line 473
    move-result v21

    .line 474
    if-eqz v21, :cond_15

    .line 475
    .line 476
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 477
    .line 478
    .line 479
    move-result-object v21

    .line 480
    move-object/from16 v1, v21

    .line 481
    .line 482
    check-cast v1, Lt5/h;

    .line 483
    .line 484
    iget-object v3, v1, Lt5/h;->c:Lt5/l;

    .line 485
    .line 486
    move-object/from16 v30, v4

    .line 487
    .line 488
    iget-object v4, v3, Lt5/l;->a:Lq5/c;

    .line 489
    .line 490
    move-object/from16 v31, v5

    .line 491
    .line 492
    new-instance v5, Lq5/c;

    .line 493
    .line 494
    invoke-direct {v5, v13}, Lq5/c;-><init>(Ljava/lang/String;)V

    .line 495
    .line 496
    .line 497
    invoke-virtual {v4, v5}, Lq5/c;->equals(Ljava/lang/Object;)Z

    .line 498
    .line 499
    .line 500
    move-result v5

    .line 501
    iget-object v3, v3, Lt5/l;->b:[B

    .line 502
    .line 503
    if-eqz v5, :cond_7

    .line 504
    .line 505
    new-instance v4, LK3/r;

    .line 506
    .line 507
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 508
    .line 509
    .line 510
    iput-object v3, v4, LK3/r;->e:Ljava/lang/Object;

    .line 511
    .line 512
    move-object/from16 v21, v6

    .line 513
    .line 514
    goto :goto_8

    .line 515
    :cond_7
    new-instance v5, Lq5/c;

    .line 516
    .line 517
    move-object/from16 v21, v6

    .line 518
    .line 519
    const-string v6, "json"

    .line 520
    .line 521
    invoke-direct {v5, v6}, Lq5/c;-><init>(Ljava/lang/String;)V

    .line 522
    .line 523
    .line 524
    invoke-virtual {v4, v5}, Lq5/c;->equals(Ljava/lang/Object;)Z

    .line 525
    .line 526
    .line 527
    move-result v5

    .line 528
    if-eqz v5, :cond_14

    .line 529
    .line 530
    new-instance v4, Ljava/lang/String;

    .line 531
    .line 532
    const-string v5, "UTF-8"

    .line 533
    .line 534
    invoke-static {v5}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 535
    .line 536
    .line 537
    move-result-object v5

    .line 538
    invoke-direct {v4, v3, v5}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 539
    .line 540
    .line 541
    new-instance v3, LK3/r;

    .line 542
    .line 543
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 544
    .line 545
    .line 546
    iput-object v4, v3, LK3/r;->f:Ljava/lang/Object;

    .line 547
    .line 548
    move-object v4, v3

    .line 549
    :goto_8
    iget-wide v5, v1, Lt5/h;->d:J

    .line 550
    .line 551
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 552
    .line 553
    .line 554
    move-result-object v3

    .line 555
    iput-object v3, v4, LK3/r;->a:Ljava/lang/Object;

    .line 556
    .line 557
    iget-wide v5, v1, Lt5/h;->e:J

    .line 558
    .line 559
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 560
    .line 561
    .line 562
    move-result-object v3

    .line 563
    iput-object v3, v4, LK3/r;->d:Ljava/lang/Object;

    .line 564
    .line 565
    iget-object v3, v1, Lt5/h;->f:Ljava/util/HashMap;

    .line 566
    .line 567
    const-string v5, "tz-offset"

    .line 568
    .line 569
    invoke-virtual {v3, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 570
    .line 571
    .line 572
    move-result-object v3

    .line 573
    check-cast v3, Ljava/lang/String;

    .line 574
    .line 575
    if-nez v3, :cond_8

    .line 576
    .line 577
    const-wide/16 v5, 0x0

    .line 578
    .line 579
    goto :goto_9

    .line 580
    :cond_8
    invoke-static {v3}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    .line 581
    .line 582
    .line 583
    move-result-object v3

    .line 584
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 585
    .line 586
    .line 587
    move-result-wide v5

    .line 588
    :goto_9
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 589
    .line 590
    .line 591
    move-result-object v3

    .line 592
    iput-object v3, v4, LK3/r;->g:Ljava/lang/Object;

    .line 593
    .line 594
    const-string v3, "net-type"

    .line 595
    .line 596
    invoke-virtual {v1, v3}, Lt5/h;->b(Ljava/lang/String;)I

    .line 597
    .line 598
    .line 599
    move-result v3

    .line 600
    sget-object v5, Ls5/I;->a:Landroid/util/SparseArray;

    .line 601
    .line 602
    invoke-virtual {v5, v3}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 603
    .line 604
    .line 605
    move-result-object v3

    .line 606
    check-cast v3, Ls5/I;

    .line 607
    .line 608
    const-string v5, "mobile-subtype"

    .line 609
    .line 610
    invoke-virtual {v1, v5}, Lt5/h;->b(Ljava/lang/String;)I

    .line 611
    .line 612
    .line 613
    move-result v5

    .line 614
    sget-object v6, Ls5/H;->a:Landroid/util/SparseArray;

    .line 615
    .line 616
    invoke-virtual {v6, v5}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 617
    .line 618
    .line 619
    move-result-object v5

    .line 620
    check-cast v5, Ls5/H;

    .line 621
    .line 622
    new-instance v6, Ls5/w;

    .line 623
    .line 624
    invoke-direct {v6, v3, v5}, Ls5/w;-><init>(Ls5/I;Ls5/H;)V

    .line 625
    .line 626
    .line 627
    iput-object v6, v4, LK3/r;->h:Ljava/lang/Object;

    .line 628
    .line 629
    iget-object v3, v1, Lt5/h;->b:Ljava/lang/Integer;

    .line 630
    .line 631
    if-eqz v3, :cond_9

    .line 632
    .line 633
    iput-object v3, v4, LK3/r;->b:Ljava/lang/Object;

    .line 634
    .line 635
    :cond_9
    iget-object v3, v1, Lt5/h;->g:Ljava/lang/Integer;

    .line 636
    .line 637
    if-eqz v3, :cond_a

    .line 638
    .line 639
    new-instance v5, Ls5/r;

    .line 640
    .line 641
    invoke-direct {v5, v3}, Ls5/r;-><init>(Ljava/lang/Integer;)V

    .line 642
    .line 643
    .line 644
    new-instance v3, Ls5/s;

    .line 645
    .line 646
    invoke-direct {v3, v5}, Ls5/s;-><init>(Ls5/r;)V

    .line 647
    .line 648
    .line 649
    sget-object v5, Ls5/A;->a:Ls5/A;

    .line 650
    .line 651
    new-instance v5, Ls5/p;

    .line 652
    .line 653
    invoke-direct {v5, v3}, Ls5/p;-><init>(Ls5/s;)V

    .line 654
    .line 655
    .line 656
    iput-object v5, v4, LK3/r;->c:Ljava/lang/Object;

    .line 657
    .line 658
    :cond_a
    iget-object v3, v1, Lt5/h;->j:[B

    .line 659
    .line 660
    iget-object v1, v1, Lt5/h;->i:[B

    .line 661
    .line 662
    if-nez v1, :cond_b

    .line 663
    .line 664
    if-eqz v3, :cond_e

    .line 665
    .line 666
    :cond_b
    if-eqz v1, :cond_c

    .line 667
    .line 668
    goto :goto_a

    .line 669
    :cond_c
    const/4 v1, 0x0

    .line 670
    :goto_a
    if-eqz v3, :cond_d

    .line 671
    .line 672
    goto :goto_b

    .line 673
    :cond_d
    const/4 v3, 0x0

    .line 674
    :goto_b
    new-instance v5, Ls5/q;

    .line 675
    .line 676
    invoke-direct {v5, v1, v3}, Ls5/q;-><init>([B[B)V

    .line 677
    .line 678
    .line 679
    iput-object v5, v4, LK3/r;->i:Ljava/lang/Object;

    .line 680
    .line 681
    :cond_e
    iget-object v1, v4, LK3/r;->a:Ljava/lang/Object;

    .line 682
    .line 683
    check-cast v1, Ljava/lang/Long;

    .line 684
    .line 685
    if-nez v1, :cond_f

    .line 686
    .line 687
    const-string v1, " eventTimeMs"

    .line 688
    .line 689
    goto :goto_c

    .line 690
    :cond_f
    const-string v1, ""

    .line 691
    .line 692
    :goto_c
    iget-object v3, v4, LK3/r;->d:Ljava/lang/Object;

    .line 693
    .line 694
    check-cast v3, Ljava/lang/Long;

    .line 695
    .line 696
    if-nez v3, :cond_10

    .line 697
    .line 698
    const-string v3, " eventUptimeMs"

    .line 699
    .line 700
    invoke-virtual {v1, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 701
    .line 702
    .line 703
    move-result-object v1

    .line 704
    :cond_10
    iget-object v3, v4, LK3/r;->g:Ljava/lang/Object;

    .line 705
    .line 706
    check-cast v3, Ljava/lang/Long;

    .line 707
    .line 708
    if-nez v3, :cond_11

    .line 709
    .line 710
    const-string v3, " timezoneOffsetSeconds"

    .line 711
    .line 712
    invoke-static {v1, v3}, LN0/a;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 713
    .line 714
    .line 715
    move-result-object v1

    .line 716
    :cond_11
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 717
    .line 718
    .line 719
    move-result v3

    .line 720
    if-eqz v3, :cond_13

    .line 721
    .line 722
    new-instance v32, Ls5/t;

    .line 723
    .line 724
    iget-object v1, v4, LK3/r;->a:Ljava/lang/Object;

    .line 725
    .line 726
    check-cast v1, Ljava/lang/Long;

    .line 727
    .line 728
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 729
    .line 730
    .line 731
    move-result-wide v33

    .line 732
    iget-object v1, v4, LK3/r;->b:Ljava/lang/Object;

    .line 733
    .line 734
    move-object/from16 v35, v1

    .line 735
    .line 736
    check-cast v35, Ljava/lang/Integer;

    .line 737
    .line 738
    iget-object v1, v4, LK3/r;->c:Ljava/lang/Object;

    .line 739
    .line 740
    move-object/from16 v36, v1

    .line 741
    .line 742
    check-cast v36, Ls5/p;

    .line 743
    .line 744
    iget-object v1, v4, LK3/r;->d:Ljava/lang/Object;

    .line 745
    .line 746
    check-cast v1, Ljava/lang/Long;

    .line 747
    .line 748
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 749
    .line 750
    .line 751
    move-result-wide v37

    .line 752
    iget-object v1, v4, LK3/r;->e:Ljava/lang/Object;

    .line 753
    .line 754
    move-object/from16 v39, v1

    .line 755
    .line 756
    check-cast v39, [B

    .line 757
    .line 758
    iget-object v1, v4, LK3/r;->f:Ljava/lang/Object;

    .line 759
    .line 760
    move-object/from16 v40, v1

    .line 761
    .line 762
    check-cast v40, Ljava/lang/String;

    .line 763
    .line 764
    iget-object v1, v4, LK3/r;->g:Ljava/lang/Object;

    .line 765
    .line 766
    check-cast v1, Ljava/lang/Long;

    .line 767
    .line 768
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 769
    .line 770
    .line 771
    move-result-wide v41

    .line 772
    iget-object v1, v4, LK3/r;->h:Ljava/lang/Object;

    .line 773
    .line 774
    move-object/from16 v43, v1

    .line 775
    .line 776
    check-cast v43, Ls5/w;

    .line 777
    .line 778
    iget-object v1, v4, LK3/r;->i:Ljava/lang/Object;

    .line 779
    .line 780
    move-object/from16 v44, v1

    .line 781
    .line 782
    check-cast v44, Ls5/q;

    .line 783
    .line 784
    invoke-direct/range {v32 .. v44}, Ls5/t;-><init>(JLjava/lang/Integer;Ls5/p;J[BLjava/lang/String;JLs5/w;Ls5/q;)V

    .line 785
    .line 786
    .line 787
    move-object/from16 v1, v32

    .line 788
    .line 789
    invoke-virtual {v8, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 790
    .line 791
    .line 792
    :cond_12
    :goto_d
    move-object/from16 v1, p0

    .line 793
    .line 794
    move-object/from16 v3, p1

    .line 795
    .line 796
    move-object/from16 v6, v21

    .line 797
    .line 798
    move-object/from16 v4, v30

    .line 799
    .line 800
    move-object/from16 v5, v31

    .line 801
    .line 802
    goto/16 :goto_7

    .line 803
    .line 804
    :cond_13
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 805
    .line 806
    const-string v2, "Missing required properties:"

    .line 807
    .line 808
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 809
    .line 810
    .line 811
    move-result-object v1

    .line 812
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 813
    .line 814
    .line 815
    throw v0

    .line 816
    :cond_14
    invoke-static {v15}, Lic/d;->B(Ljava/lang/String;)Ljava/lang/String;

    .line 817
    .line 818
    .line 819
    move-result-object v1

    .line 820
    const/4 v3, 0x5

    .line 821
    invoke-static {v1, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 822
    .line 823
    .line 824
    move-result v5

    .line 825
    if-eqz v5, :cond_12

    .line 826
    .line 827
    new-instance v5, Ljava/lang/StringBuilder;

    .line 828
    .line 829
    const-string v6, "Received event of unsupported encoding "

    .line 830
    .line 831
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 832
    .line 833
    .line 834
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 835
    .line 836
    .line 837
    const-string v4, ". Skipping..."

    .line 838
    .line 839
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 840
    .line 841
    .line 842
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 843
    .line 844
    .line 845
    move-result-object v4

    .line 846
    invoke-static {v1, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 847
    .line 848
    .line 849
    goto :goto_d

    .line 850
    :cond_15
    move-object/from16 v30, v4

    .line 851
    .line 852
    move-object/from16 v31, v5

    .line 853
    .line 854
    new-instance v21, Ls5/u;

    .line 855
    .line 856
    move-object/from16 v29, v8

    .line 857
    .line 858
    move-object/from16 v26, v14

    .line 859
    .line 860
    invoke-direct/range {v21 .. v29}, Ls5/u;-><init>(JJLs5/o;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 861
    .line 862
    .line 863
    move-object/from16 v1, v21

    .line 864
    .line 865
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 866
    .line 867
    .line 868
    move-object/from16 v1, p0

    .line 869
    .line 870
    move-object/from16 v3, p1

    .line 871
    .line 872
    move-object/from16 v4, v30

    .line 873
    .line 874
    move-object/from16 v5, v31

    .line 875
    .line 876
    goto/16 :goto_5

    .line 877
    .line 878
    :cond_16
    move-object/from16 v31, v5

    .line 879
    .line 880
    const/4 v3, 0x5

    .line 881
    new-instance v1, Ls5/n;

    .line 882
    .line 883
    invoke-direct {v1, v0}, Ls5/n;-><init>(Ljava/util/ArrayList;)V

    .line 884
    .line 885
    .line 886
    iget-object v0, v2, Lr5/b;->d:Ljava/net/URL;

    .line 887
    .line 888
    if-eqz v7, :cond_19

    .line 889
    .line 890
    :try_start_2
    invoke-static {v7}, Lr5/a;->a([B)Lr5/a;

    .line 891
    .line 892
    .line 893
    move-result-object v4

    .line 894
    iget-object v5, v4, Lr5/a;->b:Ljava/lang/String;

    .line 895
    .line 896
    if-eqz v5, :cond_17

    .line 897
    .line 898
    goto :goto_e

    .line 899
    :cond_17
    const/4 v5, 0x0

    .line 900
    :goto_e
    iget-object v4, v4, Lr5/a;->a:Ljava/lang/String;

    .line 901
    .line 902
    if-eqz v4, :cond_18

    .line 903
    .line 904
    invoke-static {v4}, Lr5/b;->b(Ljava/lang/String;)Ljava/net/URL;

    .line 905
    .line 906
    .line 907
    move-result-object v0
    :try_end_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_2

    .line 908
    :cond_18
    :goto_f
    const/4 v4, 0x3

    .line 909
    goto :goto_10

    .line 910
    :catch_2
    new-instance v0, Lu5/a;

    .line 911
    .line 912
    const-wide/16 v1, -0x1

    .line 913
    .line 914
    const/4 v4, 0x3

    .line 915
    invoke-direct {v0, v4, v1, v2}, Lu5/a;-><init>(IJ)V

    .line 916
    .line 917
    .line 918
    goto/16 :goto_1

    .line 919
    .line 920
    :cond_19
    const/4 v5, 0x0

    .line 921
    goto :goto_f

    .line 922
    :goto_10
    :try_start_3
    new-instance v6, Lmd/J;

    .line 923
    .line 924
    invoke-direct {v6, v0, v1, v5}, Lmd/J;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 925
    .line 926
    .line 927
    new-instance v0, Lo1/c;

    .line 928
    .line 929
    invoke-direct {v0, v2, v4}, Lo1/c;-><init>(Ljava/lang/Object;I)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_5

    .line 930
    .line 931
    .line 932
    move v8, v3

    .line 933
    :cond_1a
    :try_start_4
    invoke-virtual {v0, v6}, Lo1/c;->b(Lmd/J;)Lc2/g;

    .line 934
    .line 935
    .line 936
    move-result-object v1

    .line 937
    iget-object v2, v1, Lc2/g;->c:Ljava/lang/Object;

    .line 938
    .line 939
    check-cast v2, Ljava/net/URL;

    .line 940
    .line 941
    if-eqz v2, :cond_1b

    .line 942
    .line 943
    const-string v3, "Following redirect to: %s"

    .line 944
    .line 945
    invoke-static {v15, v3, v2}, Lic/d;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 946
    .line 947
    .line 948
    new-instance v3, Lmd/J;

    .line 949
    .line 950
    iget-object v4, v6, Lmd/J;->b:Ljava/lang/Object;

    .line 951
    .line 952
    check-cast v4, Ls5/n;

    .line 953
    .line 954
    iget-object v5, v6, Lmd/J;->c:Ljava/lang/Object;

    .line 955
    .line 956
    check-cast v5, Ljava/lang/String;

    .line 957
    .line 958
    invoke-direct {v3, v2, v4, v5}, Lmd/J;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 959
    .line 960
    .line 961
    move-object v6, v3

    .line 962
    goto :goto_11

    .line 963
    :cond_1b
    const/4 v6, 0x0

    .line 964
    :goto_11
    if-eqz v6, :cond_1c

    .line 965
    .line 966
    add-int/lit8 v8, v8, -0x1

    .line 967
    .line 968
    const/4 v2, 0x1

    .line 969
    if-ge v8, v2, :cond_1a

    .line 970
    .line 971
    :cond_1c
    iget v0, v1, Lc2/g;->a:I

    .line 972
    .line 973
    const/16 v2, 0xc8

    .line 974
    .line 975
    if-ne v0, v2, :cond_1d

    .line 976
    .line 977
    iget-wide v0, v1, Lc2/g;->b:J

    .line 978
    .line 979
    new-instance v2, Lu5/a;

    .line 980
    .line 981
    const/4 v3, 0x1

    .line 982
    invoke-direct {v2, v3, v0, v1}, Lu5/a;-><init>(IJ)V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 983
    .line 984
    .line 985
    move-object v0, v2

    .line 986
    :goto_12
    const/4 v1, 0x2

    .line 987
    const/4 v4, 0x3

    .line 988
    goto :goto_16

    .line 989
    :goto_13
    const/4 v4, 0x3

    .line 990
    goto :goto_15

    .line 991
    :catch_3
    move-exception v0

    .line 992
    goto :goto_13

    .line 993
    :cond_1d
    const/16 v1, 0x1f4

    .line 994
    .line 995
    if-ge v0, v1, :cond_1e

    .line 996
    .line 997
    const/16 v1, 0x194

    .line 998
    .line 999
    if-ne v0, v1, :cond_1f

    .line 1000
    .line 1001
    :cond_1e
    const/4 v4, 0x3

    .line 1002
    goto :goto_14

    .line 1003
    :cond_1f
    const/16 v1, 0x190

    .line 1004
    .line 1005
    if-ne v0, v1, :cond_20

    .line 1006
    .line 1007
    :try_start_5
    new-instance v0, Lu5/a;
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4

    .line 1008
    .line 1009
    const-wide/16 v1, -0x1

    .line 1010
    .line 1011
    const/4 v3, 0x4

    .line 1012
    :try_start_6
    invoke-direct {v0, v3, v1, v2}, Lu5/a;-><init>(IJ)V

    .line 1013
    .line 1014
    .line 1015
    goto :goto_12

    .line 1016
    :catch_4
    move-exception v0

    .line 1017
    const-wide/16 v1, -0x1

    .line 1018
    .line 1019
    goto :goto_13

    .line 1020
    :cond_20
    const-wide/16 v1, -0x1

    .line 1021
    .line 1022
    new-instance v0, Lu5/a;
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_3

    .line 1023
    .line 1024
    const/4 v4, 0x3

    .line 1025
    :try_start_7
    invoke-direct {v0, v4, v1, v2}, Lu5/a;-><init>(IJ)V

    .line 1026
    .line 1027
    .line 1028
    goto/16 :goto_1

    .line 1029
    .line 1030
    :goto_14
    new-instance v0, Lu5/a;

    .line 1031
    .line 1032
    const/4 v1, 0x2

    .line 1033
    const-wide/16 v2, -0x1

    .line 1034
    .line 1035
    invoke-direct {v0, v1, v2, v3}, Lu5/a;-><init>(IJ)V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_5

    .line 1036
    .line 1037
    .line 1038
    goto/16 :goto_1

    .line 1039
    .line 1040
    :catch_5
    move-exception v0

    .line 1041
    :goto_15
    const-string v1, "Could not make request to the backend"

    .line 1042
    .line 1043
    invoke-static {v0, v15, v1}, Lic/d;->s(Ljava/lang/Exception;Ljava/lang/String;Ljava/lang/String;)V

    .line 1044
    .line 1045
    .line 1046
    new-instance v0, Lu5/a;

    .line 1047
    .line 1048
    const/4 v1, 0x2

    .line 1049
    const-wide/16 v2, -0x1

    .line 1050
    .line 1051
    invoke-direct {v0, v1, v2, v3}, Lu5/a;-><init>(IJ)V

    .line 1052
    .line 1053
    .line 1054
    :goto_16
    iget v2, v0, Lu5/a;->a:I

    .line 1055
    .line 1056
    if-ne v2, v1, :cond_21

    .line 1057
    .line 1058
    new-instance v0, LM8/b;

    .line 1059
    .line 1060
    move-object/from16 v1, p0

    .line 1061
    .line 1062
    move-object/from16 v3, p1

    .line 1063
    .line 1064
    move-wide v4, v9

    .line 1065
    move-object v2, v12

    .line 1066
    invoke-direct/range {v0 .. v5}, LM8/b;-><init>(Lz5/f;Ljava/lang/Iterable;Lt5/i;J)V

    .line 1067
    .line 1068
    .line 1069
    invoke-virtual {v11, v0}, LA5/m;->o(LB5/b;)Ljava/lang/Object;

    .line 1070
    .line 1071
    .line 1072
    const/4 v5, 0x1

    .line 1073
    add-int/lit8 v0, p2, 0x1

    .line 1074
    .line 1075
    iget-object v2, v1, Lz5/f;->d:Lz5/c;

    .line 1076
    .line 1077
    invoke-virtual {v2, v3, v0, v5}, Lz5/c;->a(Lt5/i;IZ)V

    .line 1078
    .line 1079
    .line 1080
    return-void

    .line 1081
    :cond_21
    const/4 v5, 0x1

    .line 1082
    move-object/from16 v1, p0

    .line 1083
    .line 1084
    move-object/from16 v3, p1

    .line 1085
    .line 1086
    move-object v6, v12

    .line 1087
    new-instance v8, Laa/f;

    .line 1088
    .line 1089
    const/16 v12, 0x1c

    .line 1090
    .line 1091
    invoke-direct {v8, v12, v1, v6}, Laa/f;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 1092
    .line 1093
    .line 1094
    invoke-virtual {v11, v8}, LA5/m;->o(LB5/b;)Ljava/lang/Object;

    .line 1095
    .line 1096
    .line 1097
    if-ne v2, v5, :cond_23

    .line 1098
    .line 1099
    iget-wide v5, v0, Lu5/a;->b:J

    .line 1100
    .line 1101
    invoke-static {v9, v10, v5, v6}, Ljava/lang/Math;->max(JJ)J

    .line 1102
    .line 1103
    .line 1104
    move-result-wide v9

    .line 1105
    if-eqz v7, :cond_22

    .line 1106
    .line 1107
    new-instance v0, Lo1/c;

    .line 1108
    .line 1109
    const/16 v2, 0x18

    .line 1110
    .line 1111
    invoke-direct {v0, v1, v2}, Lo1/c;-><init>(Ljava/lang/Object;I)V

    .line 1112
    .line 1113
    .line 1114
    invoke-virtual {v11, v0}, LA5/m;->o(LB5/b;)Ljava/lang/Object;

    .line 1115
    .line 1116
    .line 1117
    :cond_22
    const/16 v16, 0x1

    .line 1118
    .line 1119
    goto :goto_18

    .line 1120
    :cond_23
    const/4 v5, 0x4

    .line 1121
    if-ne v2, v5, :cond_22

    .line 1122
    .line 1123
    new-instance v0, Ljava/util/HashMap;

    .line 1124
    .line 1125
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 1126
    .line 1127
    .line 1128
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1129
    .line 1130
    .line 1131
    move-result-object v2

    .line 1132
    :goto_17
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1133
    .line 1134
    .line 1135
    move-result v5

    .line 1136
    if-eqz v5, :cond_25

    .line 1137
    .line 1138
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1139
    .line 1140
    .line 1141
    move-result-object v5

    .line 1142
    check-cast v5, LA5/b;

    .line 1143
    .line 1144
    iget-object v5, v5, LA5/b;->c:Lt5/h;

    .line 1145
    .line 1146
    iget-object v5, v5, Lt5/h;->a:Ljava/lang/String;

    .line 1147
    .line 1148
    invoke-virtual {v0, v5}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 1149
    .line 1150
    .line 1151
    move-result v6

    .line 1152
    if-nez v6, :cond_24

    .line 1153
    .line 1154
    const/16 v16, 0x1

    .line 1155
    .line 1156
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1157
    .line 1158
    .line 1159
    move-result-object v6

    .line 1160
    invoke-virtual {v0, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1161
    .line 1162
    .line 1163
    goto :goto_17

    .line 1164
    :cond_24
    const/16 v16, 0x1

    .line 1165
    .line 1166
    invoke-virtual {v0, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1167
    .line 1168
    .line 1169
    move-result-object v6

    .line 1170
    check-cast v6, Ljava/lang/Integer;

    .line 1171
    .line 1172
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 1173
    .line 1174
    .line 1175
    move-result v6

    .line 1176
    add-int/lit8 v6, v6, 0x1

    .line 1177
    .line 1178
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1179
    .line 1180
    .line 1181
    move-result-object v6

    .line 1182
    invoke-virtual {v0, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1183
    .line 1184
    .line 1185
    goto :goto_17

    .line 1186
    :cond_25
    const/16 v16, 0x1

    .line 1187
    .line 1188
    new-instance v2, Laa/f;

    .line 1189
    .line 1190
    const/16 v5, 0x1d

    .line 1191
    .line 1192
    invoke-direct {v2, v5, v1, v0}, Laa/f;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 1193
    .line 1194
    .line 1195
    invoke-virtual {v11, v2}, LA5/m;->o(LB5/b;)Ljava/lang/Object;

    .line 1196
    .line 1197
    .line 1198
    :goto_18
    move v2, v4

    .line 1199
    move/from16 v6, v16

    .line 1200
    .line 1201
    move-object/from16 v5, v31

    .line 1202
    .line 1203
    const/4 v4, 0x0

    .line 1204
    goto/16 :goto_0

    .line 1205
    .line 1206
    :cond_26
    new-instance v0, LA5/j;

    .line 1207
    .line 1208
    invoke-direct {v0, v1, v3, v9, v10}, LA5/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;J)V

    .line 1209
    .line 1210
    .line 1211
    invoke-virtual {v11, v0}, LA5/m;->o(LB5/b;)Ljava/lang/Object;

    .line 1212
    .line 1213
    .line 1214
    return-void
.end method
