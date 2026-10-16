.class public final Lpb/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)V
    .locals 0

    .line 1
    iput p1, p0, Lpb/a;->a:I

    iput-object p2, p0, Lpb/a;->d:Ljava/lang/Object;

    iput-object p3, p0, Lpb/a;->b:Ljava/lang/Object;

    iput-object p4, p0, Lpb/a;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p4, p0, Lpb/a;->a:I

    iput-object p1, p0, Lpb/a;->c:Ljava/lang/Object;

    iput-object p2, p0, Lpb/a;->d:Ljava/lang/Object;

    iput-object p3, p0, Lpb/a;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 24

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const/16 v0, 0x15

    .line 4
    .line 5
    const/4 v3, 0x2

    .line 6
    const/4 v4, 0x0

    .line 7
    const/4 v5, 0x0

    .line 8
    const/4 v6, 0x1

    .line 9
    iget v7, v1, Lpb/a;->a:I

    .line 10
    .line 11
    packed-switch v7, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    iget-object v0, v1, Lpb/a;->b:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Ljava/io/File;

    .line 17
    .line 18
    const-string v2, "cameraAccess"

    .line 19
    .line 20
    iget-object v6, v1, Lpb/a;->c:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v6, Lac/a;

    .line 23
    .line 24
    iget-object v6, v6, Lac/a;->b:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v6, Lyc/g;

    .line 27
    .line 28
    iget-object v7, v1, Lpb/a;->d:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v7, Landroid/media/Image;

    .line 31
    .line 32
    invoke-virtual {v7}, Landroid/media/Image;->getPlanes()[Landroid/media/Image$Plane;

    .line 33
    .line 34
    .line 35
    move-result-object v8

    .line 36
    aget-object v5, v8, v5

    .line 37
    .line 38
    invoke-virtual {v5}, Landroid/media/Image$Plane;->getBuffer()Ljava/nio/ByteBuffer;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    invoke-virtual {v5}, Ljava/nio/Buffer;->remaining()I

    .line 43
    .line 44
    .line 45
    move-result v8

    .line 46
    new-array v8, v8, [B

    .line 47
    .line 48
    invoke-virtual {v5, v8}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 49
    .line 50
    .line 51
    :try_start_0
    new-instance v5, Ljava/io/FileOutputStream;

    .line 52
    .line 53
    invoke-direct {v5, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 54
    .line 55
    .line 56
    :try_start_1
    invoke-virtual {v5, v8}, Ljava/io/FileOutputStream;->write([B)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    iget-object v4, v6, Lyc/g;->h:Lmd/J;

    .line 64
    .line 65
    iget-object v8, v6, Lyc/g;->z:LPc/q;

    .line 66
    .line 67
    new-instance v9, Lyc/b;

    .line 68
    .line 69
    invoke-direct {v9, v3, v8, v0}, Lyc/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    iget-object v0, v4, Lmd/J;->a:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v0, Landroid/os/Handler;

    .line 75
    .line 76
    invoke-virtual {v0, v9}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 77
    .line 78
    .line 79
    invoke-virtual {v7}, Landroid/media/Image;->close()V

    .line 80
    .line 81
    .line 82
    :try_start_2
    invoke-virtual {v5}, Ljava/io/FileOutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 83
    .line 84
    .line 85
    goto :goto_4

    .line 86
    :catch_0
    move-exception v0

    .line 87
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    iget-object v3, v6, Lyc/g;->h:Lmd/J;

    .line 92
    .line 93
    iget-object v4, v6, Lyc/g;->z:LPc/q;

    .line 94
    .line 95
    invoke-virtual {v3, v4, v2, v0}, Lmd/J;->l(Lyc/C;Ljava/lang/String;Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    goto :goto_4

    .line 99
    :goto_1
    move-object v3, v0

    .line 100
    move-object v4, v5

    .line 101
    goto :goto_5

    .line 102
    :catch_1
    move-object v4, v5

    .line 103
    goto :goto_3

    .line 104
    :catchall_0
    move-exception v0

    .line 105
    goto :goto_1

    .line 106
    :goto_2
    move-object v3, v0

    .line 107
    goto :goto_5

    .line 108
    :catch_2
    :goto_3
    :try_start_3
    const-string v0, "IOError"

    .line 109
    .line 110
    const-string v3, "Failed saving image"

    .line 111
    .line 112
    iget-object v5, v6, Lyc/g;->h:Lmd/J;

    .line 113
    .line 114
    iget-object v8, v6, Lyc/g;->z:LPc/q;

    .line 115
    .line 116
    invoke-virtual {v5, v8, v0, v3}, Lmd/J;->l(Lyc/C;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 117
    .line 118
    .line 119
    invoke-virtual {v7}, Landroid/media/Image;->close()V

    .line 120
    .line 121
    .line 122
    if-eqz v4, :cond_0

    .line 123
    .line 124
    :try_start_4
    invoke-virtual {v4}, Ljava/io/FileOutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 125
    .line 126
    .line 127
    goto :goto_4

    .line 128
    :catch_3
    move-exception v0

    .line 129
    goto :goto_0

    .line 130
    :cond_0
    :goto_4
    return-void

    .line 131
    :catchall_1
    move-exception v0

    .line 132
    goto :goto_2

    .line 133
    :goto_5
    invoke-virtual {v7}, Landroid/media/Image;->close()V

    .line 134
    .line 135
    .line 136
    if-eqz v4, :cond_1

    .line 137
    .line 138
    :try_start_5
    invoke-virtual {v4}, Ljava/io/FileOutputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4

    .line 139
    .line 140
    .line 141
    goto :goto_6

    .line 142
    :catch_4
    move-exception v0

    .line 143
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    iget-object v4, v6, Lyc/g;->h:Lmd/J;

    .line 148
    .line 149
    iget-object v5, v6, Lyc/g;->z:LPc/q;

    .line 150
    .line 151
    invoke-virtual {v4, v5, v2, v0}, Lmd/J;->l(Lyc/C;Ljava/lang/String;Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    :cond_1
    :goto_6
    throw v3

    .line 155
    :pswitch_0
    iget-object v0, v1, Lpb/a;->c:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast v0, Lvd/r;

    .line 158
    .line 159
    iget-object v4, v0, Lvd/r;->i:Lod/Y1;

    .line 160
    .line 161
    invoke-virtual {v4}, Lod/Y1;->d()J

    .line 162
    .line 163
    .line 164
    move-result-wide v7

    .line 165
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 166
    .line 167
    .line 168
    move-result-object v4

    .line 169
    iput-object v4, v0, Lvd/r;->l:Ljava/lang/Long;

    .line 170
    .line 171
    iget-object v0, v1, Lpb/a;->c:Ljava/lang/Object;

    .line 172
    .line 173
    check-cast v0, Lvd/r;

    .line 174
    .line 175
    iget-object v0, v0, Lvd/r;->f:LS1/n;

    .line 176
    .line 177
    iget-object v0, v0, LS1/n;->b:Ljava/util/Map;

    .line 178
    .line 179
    check-cast v0, Ljava/util/HashMap;

    .line 180
    .line 181
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 190
    .line 191
    .line 192
    move-result v4

    .line 193
    if-eqz v4, :cond_2

    .line 194
    .line 195
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v4

    .line 199
    check-cast v4, Lvd/k;

    .line 200
    .line 201
    iget-object v7, v4, Lvd/k;->c:Lt6/q;

    .line 202
    .line 203
    iget-object v8, v7, Lt6/q;->a:Ljava/lang/Object;

    .line 204
    .line 205
    check-cast v8, Ljava/util/concurrent/atomic/AtomicLong;

    .line 206
    .line 207
    const-wide/16 v9, 0x0

    .line 208
    .line 209
    invoke-virtual {v8, v9, v10}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    .line 210
    .line 211
    .line 212
    iget-object v7, v7, Lt6/q;->b:Ljava/lang/Object;

    .line 213
    .line 214
    check-cast v7, Ljava/util/concurrent/atomic/AtomicLong;

    .line 215
    .line 216
    invoke-virtual {v7, v9, v10}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    .line 217
    .line 218
    .line 219
    iget-object v7, v4, Lvd/k;->b:Lt6/q;

    .line 220
    .line 221
    iget-object v8, v4, Lvd/k;->c:Lt6/q;

    .line 222
    .line 223
    iput-object v8, v4, Lvd/k;->b:Lt6/q;

    .line 224
    .line 225
    iput-object v7, v4, Lvd/k;->c:Lt6/q;

    .line 226
    .line 227
    goto :goto_7

    .line 228
    :cond_2
    iget-object v0, v1, Lpb/a;->d:Ljava/lang/Object;

    .line 229
    .line 230
    check-cast v0, Lvd/m;

    .line 231
    .line 232
    iget-object v4, v1, Lpb/a;->b:Ljava/lang/Object;

    .line 233
    .line 234
    check-cast v4, Lmd/e;

    .line 235
    .line 236
    invoke-static {}, Ll8/K;->i()Ll8/H;

    .line 237
    .line 238
    .line 239
    move-result-object v7

    .line 240
    iget-object v8, v0, Lvd/m;->e:LS3/i;

    .line 241
    .line 242
    if-eqz v8, :cond_3

    .line 243
    .line 244
    new-instance v8, Lvd/l;

    .line 245
    .line 246
    invoke-direct {v8, v0, v4, v6}, Lvd/l;-><init>(Lvd/m;Lmd/e;I)V

    .line 247
    .line 248
    .line 249
    invoke-virtual {v7, v8}, Ll8/E;->a(Ljava/lang/Object;)V

    .line 250
    .line 251
    .line 252
    :cond_3
    iget-object v8, v0, Lvd/m;->f:LW9/u;

    .line 253
    .line 254
    if-eqz v8, :cond_4

    .line 255
    .line 256
    new-instance v8, Lvd/l;

    .line 257
    .line 258
    invoke-direct {v8, v0, v4, v5}, Lvd/l;-><init>(Lvd/m;Lmd/e;I)V

    .line 259
    .line 260
    .line 261
    invoke-virtual {v7, v8}, Ll8/E;->a(Ljava/lang/Object;)V

    .line 262
    .line 263
    .line 264
    :cond_4
    invoke-virtual {v7}, Ll8/H;->g()Ll8/e0;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    invoke-virtual {v0, v5}, Ll8/K;->l(I)Ll8/I;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    :goto_8
    invoke-virtual {v0}, Ll8/I;->hasNext()Z

    .line 273
    .line 274
    .line 275
    move-result v4

    .line 276
    if-eqz v4, :cond_14

    .line 277
    .line 278
    invoke-virtual {v0}, Ll8/I;->next()Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v4

    .line 282
    check-cast v4, Lvd/l;

    .line 283
    .line 284
    iget-object v7, v1, Lpb/a;->c:Ljava/lang/Object;

    .line 285
    .line 286
    check-cast v7, Lvd/r;

    .line 287
    .line 288
    iget-object v8, v7, Lvd/r;->f:LS1/n;

    .line 289
    .line 290
    iget-object v7, v7, Lvd/r;->l:Ljava/lang/Long;

    .line 291
    .line 292
    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    .line 293
    .line 294
    .line 295
    move-result-wide v9

    .line 296
    iget v7, v4, Lvd/l;->a:I

    .line 297
    .line 298
    packed-switch v7, :pswitch_data_1

    .line 299
    .line 300
    .line 301
    iget-object v7, v4, Lvd/l;->b:Lvd/m;

    .line 302
    .line 303
    iget-object v11, v7, Lvd/m;->e:LS3/i;

    .line 304
    .line 305
    iget-object v11, v11, LS3/i;->d:Ljava/lang/Object;

    .line 306
    .line 307
    check-cast v11, Ljava/lang/Integer;

    .line 308
    .line 309
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    .line 310
    .line 311
    .line 312
    move-result v11

    .line 313
    invoke-static {v8, v11}, Lvd/r;->h(LS1/n;I)Ljava/util/ArrayList;

    .line 314
    .line 315
    .line 316
    move-result-object v11

    .line 317
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 318
    .line 319
    .line 320
    move-result v12

    .line 321
    iget-object v13, v7, Lvd/m;->e:LS3/i;

    .line 322
    .line 323
    iget-object v14, v13, LS3/i;->c:Ljava/lang/Object;

    .line 324
    .line 325
    check-cast v14, Ljava/lang/Integer;

    .line 326
    .line 327
    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    .line 328
    .line 329
    .line 330
    move-result v14

    .line 331
    if-lt v12, v14, :cond_5

    .line 332
    .line 333
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 334
    .line 335
    .line 336
    move-result v12

    .line 337
    if-nez v12, :cond_6

    .line 338
    .line 339
    :cond_5
    move-object/from16 v18, v0

    .line 340
    .line 341
    move/from16 v17, v3

    .line 342
    .line 343
    move/from16 v16, v5

    .line 344
    .line 345
    goto/16 :goto_e

    .line 346
    .line 347
    :cond_6
    new-instance v12, Ljava/util/ArrayList;

    .line 348
    .line 349
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 350
    .line 351
    .line 352
    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 353
    .line 354
    .line 355
    move-result-object v14

    .line 356
    :goto_9
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 357
    .line 358
    .line 359
    move-result v15

    .line 360
    if-eqz v15, :cond_7

    .line 361
    .line 362
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 363
    .line 364
    .line 365
    move-result-object v15

    .line 366
    check-cast v15, Lvd/k;

    .line 367
    .line 368
    move/from16 v16, v5

    .line 369
    .line 370
    iget-object v5, v15, Lvd/k;->c:Lt6/q;

    .line 371
    .line 372
    iget-object v5, v5, Lt6/q;->a:Ljava/lang/Object;

    .line 373
    .line 374
    check-cast v5, Ljava/util/concurrent/atomic/AtomicLong;

    .line 375
    .line 376
    move/from16 v17, v3

    .line 377
    .line 378
    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 379
    .line 380
    .line 381
    move-result-wide v2

    .line 382
    long-to-double v2, v2

    .line 383
    move v5, v6

    .line 384
    move-object/from16 v18, v7

    .line 385
    .line 386
    invoke-virtual {v15}, Lvd/k;->c()J

    .line 387
    .line 388
    .line 389
    move-result-wide v6

    .line 390
    long-to-double v6, v6

    .line 391
    div-double/2addr v2, v6

    .line 392
    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 393
    .line 394
    .line 395
    move-result-object v2

    .line 396
    invoke-virtual {v12, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 397
    .line 398
    .line 399
    move v6, v5

    .line 400
    move/from16 v5, v16

    .line 401
    .line 402
    move/from16 v3, v17

    .line 403
    .line 404
    move-object/from16 v7, v18

    .line 405
    .line 406
    goto :goto_9

    .line 407
    :cond_7
    move/from16 v17, v3

    .line 408
    .line 409
    move/from16 v16, v5

    .line 410
    .line 411
    move v5, v6

    .line 412
    move-object/from16 v18, v7

    .line 413
    .line 414
    invoke-virtual {v12}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 415
    .line 416
    .line 417
    move-result-object v2

    .line 418
    const-wide/16 v6, 0x0

    .line 419
    .line 420
    move-wide v14, v6

    .line 421
    :goto_a
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 422
    .line 423
    .line 424
    move-result v3

    .line 425
    if-eqz v3, :cond_8

    .line 426
    .line 427
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 428
    .line 429
    .line 430
    move-result-object v3

    .line 431
    check-cast v3, Ljava/lang/Double;

    .line 432
    .line 433
    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    .line 434
    .line 435
    .line 436
    move-result-wide v19

    .line 437
    add-double v14, v19, v14

    .line 438
    .line 439
    goto :goto_a

    .line 440
    :cond_8
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 441
    .line 442
    .line 443
    move-result v2

    .line 444
    int-to-double v2, v2

    .line 445
    div-double/2addr v14, v2

    .line 446
    invoke-virtual {v12}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 447
    .line 448
    .line 449
    move-result-object v2

    .line 450
    :goto_b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 451
    .line 452
    .line 453
    move-result v3

    .line 454
    if-eqz v3, :cond_9

    .line 455
    .line 456
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 457
    .line 458
    .line 459
    move-result-object v3

    .line 460
    check-cast v3, Ljava/lang/Double;

    .line 461
    .line 462
    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    .line 463
    .line 464
    .line 465
    move-result-wide v19

    .line 466
    sub-double v19, v19, v14

    .line 467
    .line 468
    mul-double v19, v19, v19

    .line 469
    .line 470
    add-double v6, v19, v6

    .line 471
    .line 472
    goto :goto_b

    .line 473
    :cond_9
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 474
    .line 475
    .line 476
    move-result v2

    .line 477
    int-to-double v2, v2

    .line 478
    div-double/2addr v6, v2

    .line 479
    invoke-static {v6, v7}, Ljava/lang/Math;->sqrt(D)D

    .line 480
    .line 481
    .line 482
    move-result-wide v2

    .line 483
    iget-object v6, v13, LS3/i;->a:Ljava/lang/Object;

    .line 484
    .line 485
    check-cast v6, Ljava/lang/Integer;

    .line 486
    .line 487
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 488
    .line 489
    .line 490
    move-result v6

    .line 491
    int-to-float v6, v6

    .line 492
    const/high16 v7, 0x447a0000    # 1000.0f

    .line 493
    .line 494
    div-float/2addr v6, v7

    .line 495
    float-to-double v6, v6

    .line 496
    mul-double/2addr v6, v2

    .line 497
    sub-double v6, v14, v6

    .line 498
    .line 499
    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 500
    .line 501
    .line 502
    move-result-object v11

    .line 503
    :goto_c
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 504
    .line 505
    .line 506
    move-result v12

    .line 507
    if-eqz v12, :cond_d

    .line 508
    .line 509
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 510
    .line 511
    .line 512
    move-result-object v12

    .line 513
    check-cast v12, Lvd/k;

    .line 514
    .line 515
    invoke-virtual {v8}, LS1/n;->e()D

    .line 516
    .line 517
    .line 518
    move-result-wide v19

    .line 519
    move/from16 v21, v5

    .line 520
    .line 521
    move-object/from16 v5, v18

    .line 522
    .line 523
    move-object/from16 v18, v0

    .line 524
    .line 525
    iget-object v0, v5, Lvd/m;->d:Ljava/lang/Integer;

    .line 526
    .line 527
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 528
    .line 529
    .line 530
    move-result v0

    .line 531
    move-wide/from16 v22, v2

    .line 532
    .line 533
    int-to-double v2, v0

    .line 534
    cmpl-double v0, v19, v2

    .line 535
    .line 536
    if-ltz v0, :cond_a

    .line 537
    .line 538
    goto/16 :goto_e

    .line 539
    .line 540
    :cond_a
    iget-object v0, v12, Lvd/k;->c:Lt6/q;

    .line 541
    .line 542
    iget-object v0, v0, Lt6/q;->a:Ljava/lang/Object;

    .line 543
    .line 544
    check-cast v0, Ljava/util/concurrent/atomic/AtomicLong;

    .line 545
    .line 546
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 547
    .line 548
    .line 549
    move-result-wide v2

    .line 550
    long-to-double v2, v2

    .line 551
    move-wide/from16 v19, v2

    .line 552
    .line 553
    invoke-virtual {v12}, Lvd/k;->c()J

    .line 554
    .line 555
    .line 556
    move-result-wide v2

    .line 557
    long-to-double v2, v2

    .line 558
    div-double v2, v19, v2

    .line 559
    .line 560
    cmpg-double v0, v2, v6

    .line 561
    .line 562
    if-gez v0, :cond_b

    .line 563
    .line 564
    iget-object v0, v12, Lvd/k;->c:Lt6/q;

    .line 565
    .line 566
    iget-object v0, v0, Lt6/q;->a:Ljava/lang/Object;

    .line 567
    .line 568
    check-cast v0, Ljava/util/concurrent/atomic/AtomicLong;

    .line 569
    .line 570
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 571
    .line 572
    .line 573
    move-result-wide v2

    .line 574
    long-to-double v2, v2

    .line 575
    move-wide/from16 v19, v2

    .line 576
    .line 577
    invoke-virtual {v12}, Lvd/k;->c()J

    .line 578
    .line 579
    .line 580
    move-result-wide v2

    .line 581
    long-to-double v2, v2

    .line 582
    div-double v2, v19, v2

    .line 583
    .line 584
    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 585
    .line 586
    .line 587
    move-result-object v0

    .line 588
    invoke-static {v14, v15}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 589
    .line 590
    .line 591
    move-result-object v2

    .line 592
    invoke-static/range {v22 .. v23}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 593
    .line 594
    .line 595
    move-result-object v3

    .line 596
    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 597
    .line 598
    .line 599
    move-result-object v19

    .line 600
    move-object/from16 v20, v0

    .line 601
    .line 602
    const/4 v0, 0x5

    .line 603
    new-array v0, v0, [Ljava/lang/Object;

    .line 604
    .line 605
    aput-object v12, v0, v16

    .line 606
    .line 607
    aput-object v20, v0, v21

    .line 608
    .line 609
    aput-object v2, v0, v17

    .line 610
    .line 611
    const/4 v2, 0x3

    .line 612
    aput-object v3, v0, v2

    .line 613
    .line 614
    const/4 v2, 0x4

    .line 615
    aput-object v19, v0, v2

    .line 616
    .line 617
    iget-object v2, v4, Lvd/l;->c:Lmd/e;

    .line 618
    .line 619
    const-string v3, "SuccessRate algorithm detected outlier: {0}. Parameters: successRate={1}, mean={2}, stdev={3}, requiredSuccessRate={4}"

    .line 620
    .line 621
    move-object/from16 v19, v5

    .line 622
    .line 623
    move/from16 v5, v21

    .line 624
    .line 625
    invoke-virtual {v2, v5, v3, v0}, Lmd/e;->h(ILjava/lang/String;[Ljava/lang/Object;)V

    .line 626
    .line 627
    .line 628
    new-instance v0, Ljava/util/Random;

    .line 629
    .line 630
    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    .line 631
    .line 632
    .line 633
    const/16 v2, 0x64

    .line 634
    .line 635
    invoke-virtual {v0, v2}, Ljava/util/Random;->nextInt(I)I

    .line 636
    .line 637
    .line 638
    move-result v0

    .line 639
    iget-object v2, v13, LS3/i;->b:Ljava/lang/Object;

    .line 640
    .line 641
    check-cast v2, Ljava/lang/Integer;

    .line 642
    .line 643
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 644
    .line 645
    .line 646
    move-result v2

    .line 647
    if-ge v0, v2, :cond_c

    .line 648
    .line 649
    invoke-virtual {v12, v9, v10}, Lvd/k;->b(J)V

    .line 650
    .line 651
    .line 652
    goto :goto_d

    .line 653
    :cond_b
    move-object/from16 v19, v5

    .line 654
    .line 655
    :cond_c
    :goto_d
    move-object/from16 v0, v18

    .line 656
    .line 657
    move-object/from16 v18, v19

    .line 658
    .line 659
    move-wide/from16 v2, v22

    .line 660
    .line 661
    const/4 v5, 0x1

    .line 662
    goto/16 :goto_c

    .line 663
    .line 664
    :cond_d
    move-object/from16 v18, v0

    .line 665
    .line 666
    :cond_e
    :goto_e
    move/from16 v6, v17

    .line 667
    .line 668
    const/16 v12, 0x64

    .line 669
    .line 670
    goto/16 :goto_11

    .line 671
    .line 672
    :pswitch_1
    move-object/from16 v18, v0

    .line 673
    .line 674
    move/from16 v17, v3

    .line 675
    .line 676
    move/from16 v16, v5

    .line 677
    .line 678
    iget-object v0, v4, Lvd/l;->b:Lvd/m;

    .line 679
    .line 680
    iget-object v2, v0, Lvd/m;->f:LW9/u;

    .line 681
    .line 682
    iget-object v2, v2, LW9/u;->d:Ljava/lang/Object;

    .line 683
    .line 684
    check-cast v2, Ljava/lang/Integer;

    .line 685
    .line 686
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 687
    .line 688
    .line 689
    move-result v2

    .line 690
    invoke-static {v8, v2}, Lvd/r;->h(LS1/n;I)Ljava/util/ArrayList;

    .line 691
    .line 692
    .line 693
    move-result-object v2

    .line 694
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 695
    .line 696
    .line 697
    move-result v3

    .line 698
    iget-object v6, v0, Lvd/m;->f:LW9/u;

    .line 699
    .line 700
    iget-object v7, v6, LW9/u;->c:Ljava/lang/Object;

    .line 701
    .line 702
    check-cast v7, Ljava/lang/Integer;

    .line 703
    .line 704
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 705
    .line 706
    .line 707
    move-result v7

    .line 708
    if-lt v3, v7, :cond_e

    .line 709
    .line 710
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 711
    .line 712
    .line 713
    move-result v3

    .line 714
    if-nez v3, :cond_f

    .line 715
    .line 716
    goto :goto_e

    .line 717
    :cond_f
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 718
    .line 719
    .line 720
    move-result-object v2

    .line 721
    :goto_f
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 722
    .line 723
    .line 724
    move-result v3

    .line 725
    if-eqz v3, :cond_e

    .line 726
    .line 727
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 728
    .line 729
    .line 730
    move-result-object v3

    .line 731
    check-cast v3, Lvd/k;

    .line 732
    .line 733
    invoke-virtual {v8}, LS1/n;->e()D

    .line 734
    .line 735
    .line 736
    move-result-wide v11

    .line 737
    iget-object v7, v0, Lvd/m;->d:Ljava/lang/Integer;

    .line 738
    .line 739
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 740
    .line 741
    .line 742
    move-result v7

    .line 743
    int-to-double v13, v7

    .line 744
    cmpl-double v7, v11, v13

    .line 745
    .line 746
    if-ltz v7, :cond_10

    .line 747
    .line 748
    goto :goto_e

    .line 749
    :cond_10
    invoke-virtual {v3}, Lvd/k;->c()J

    .line 750
    .line 751
    .line 752
    move-result-wide v11

    .line 753
    iget-object v7, v6, LW9/u;->d:Ljava/lang/Object;

    .line 754
    .line 755
    check-cast v7, Ljava/lang/Integer;

    .line 756
    .line 757
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 758
    .line 759
    .line 760
    move-result v7

    .line 761
    int-to-long v13, v7

    .line 762
    cmp-long v7, v11, v13

    .line 763
    .line 764
    if-gez v7, :cond_11

    .line 765
    .line 766
    goto :goto_f

    .line 767
    :cond_11
    iget-object v7, v6, LW9/u;->a:Ljava/lang/Object;

    .line 768
    .line 769
    check-cast v7, Ljava/lang/Integer;

    .line 770
    .line 771
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 772
    .line 773
    .line 774
    move-result v7

    .line 775
    int-to-double v11, v7

    .line 776
    const-wide/high16 v13, 0x4059000000000000L    # 100.0

    .line 777
    .line 778
    div-double/2addr v11, v13

    .line 779
    iget-object v7, v3, Lvd/k;->c:Lt6/q;

    .line 780
    .line 781
    iget-object v7, v7, Lt6/q;->b:Ljava/lang/Object;

    .line 782
    .line 783
    check-cast v7, Ljava/util/concurrent/atomic/AtomicLong;

    .line 784
    .line 785
    invoke-virtual {v7}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 786
    .line 787
    .line 788
    move-result-wide v13

    .line 789
    long-to-double v13, v13

    .line 790
    move-object v7, v6

    .line 791
    invoke-virtual {v3}, Lvd/k;->c()J

    .line 792
    .line 793
    .line 794
    move-result-wide v5

    .line 795
    long-to-double v5, v5

    .line 796
    div-double/2addr v13, v5

    .line 797
    cmpl-double v5, v13, v11

    .line 798
    .line 799
    if-lez v5, :cond_12

    .line 800
    .line 801
    iget-object v5, v3, Lvd/k;->c:Lt6/q;

    .line 802
    .line 803
    iget-object v5, v5, Lt6/q;->b:Ljava/lang/Object;

    .line 804
    .line 805
    check-cast v5, Ljava/util/concurrent/atomic/AtomicLong;

    .line 806
    .line 807
    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 808
    .line 809
    .line 810
    move-result-wide v5

    .line 811
    long-to-double v5, v5

    .line 812
    invoke-virtual {v3}, Lvd/k;->c()J

    .line 813
    .line 814
    .line 815
    move-result-wide v11

    .line 816
    long-to-double v11, v11

    .line 817
    div-double/2addr v5, v11

    .line 818
    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 819
    .line 820
    .line 821
    move-result-object v5

    .line 822
    move/from16 v6, v17

    .line 823
    .line 824
    new-array v11, v6, [Ljava/lang/Object;

    .line 825
    .line 826
    aput-object v3, v11, v16

    .line 827
    .line 828
    const/4 v12, 0x1

    .line 829
    aput-object v5, v11, v12

    .line 830
    .line 831
    iget-object v5, v4, Lvd/l;->c:Lmd/e;

    .line 832
    .line 833
    const-string v13, "FailurePercentage algorithm detected outlier: {0}, failureRate={1}"

    .line 834
    .line 835
    invoke-virtual {v5, v12, v13, v11}, Lmd/e;->h(ILjava/lang/String;[Ljava/lang/Object;)V

    .line 836
    .line 837
    .line 838
    new-instance v11, Ljava/util/Random;

    .line 839
    .line 840
    invoke-direct {v11}, Ljava/util/Random;-><init>()V

    .line 841
    .line 842
    .line 843
    const/16 v12, 0x64

    .line 844
    .line 845
    invoke-virtual {v11, v12}, Ljava/util/Random;->nextInt(I)I

    .line 846
    .line 847
    .line 848
    move-result v11

    .line 849
    iget-object v13, v7, LW9/u;->b:Ljava/lang/Object;

    .line 850
    .line 851
    check-cast v13, Ljava/lang/Integer;

    .line 852
    .line 853
    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    .line 854
    .line 855
    .line 856
    move-result v13

    .line 857
    if-ge v11, v13, :cond_13

    .line 858
    .line 859
    invoke-virtual {v3, v9, v10}, Lvd/k;->b(J)V

    .line 860
    .line 861
    .line 862
    goto :goto_10

    .line 863
    :cond_12
    move/from16 v6, v17

    .line 864
    .line 865
    const/16 v12, 0x64

    .line 866
    .line 867
    :cond_13
    :goto_10
    move/from16 v17, v6

    .line 868
    .line 869
    move-object v6, v7

    .line 870
    goto/16 :goto_f

    .line 871
    .line 872
    :goto_11
    move v3, v6

    .line 873
    move/from16 v5, v16

    .line 874
    .line 875
    move-object/from16 v0, v18

    .line 876
    .line 877
    const/4 v6, 0x1

    .line 878
    goto/16 :goto_8

    .line 879
    .line 880
    :cond_14
    move/from16 v16, v5

    .line 881
    .line 882
    iget-object v0, v1, Lpb/a;->c:Ljava/lang/Object;

    .line 883
    .line 884
    check-cast v0, Lvd/r;

    .line 885
    .line 886
    iget-object v2, v0, Lvd/r;->f:LS1/n;

    .line 887
    .line 888
    iget-object v0, v0, Lvd/r;->l:Ljava/lang/Long;

    .line 889
    .line 890
    iget-object v2, v2, LS1/n;->b:Ljava/util/Map;

    .line 891
    .line 892
    check-cast v2, Ljava/util/HashMap;

    .line 893
    .line 894
    invoke-virtual {v2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 895
    .line 896
    .line 897
    move-result-object v2

    .line 898
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 899
    .line 900
    .line 901
    move-result-object v2

    .line 902
    :cond_15
    :goto_12
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 903
    .line 904
    .line 905
    move-result v3

    .line 906
    if-eqz v3, :cond_18

    .line 907
    .line 908
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 909
    .line 910
    .line 911
    move-result-object v3

    .line 912
    check-cast v3, Lvd/k;

    .line 913
    .line 914
    invoke-virtual {v3}, Lvd/k;->d()Z

    .line 915
    .line 916
    .line 917
    move-result v4

    .line 918
    if-nez v4, :cond_17

    .line 919
    .line 920
    iget v4, v3, Lvd/k;->e:I

    .line 921
    .line 922
    if-nez v4, :cond_16

    .line 923
    .line 924
    move/from16 v4, v16

    .line 925
    .line 926
    goto :goto_13

    .line 927
    :cond_16
    const/4 v5, 0x1

    .line 928
    sub-int/2addr v4, v5

    .line 929
    :goto_13
    iput v4, v3, Lvd/k;->e:I

    .line 930
    .line 931
    :cond_17
    invoke-virtual {v3}, Lvd/k;->d()Z

    .line 932
    .line 933
    .line 934
    move-result v4

    .line 935
    if-eqz v4, :cond_15

    .line 936
    .line 937
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 938
    .line 939
    .line 940
    move-result-wide v6

    .line 941
    iget-object v4, v3, Lvd/k;->a:Lvd/m;

    .line 942
    .line 943
    iget-object v4, v4, Lvd/m;->b:Ljava/lang/Long;

    .line 944
    .line 945
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 946
    .line 947
    .line 948
    move-result-wide v8

    .line 949
    iget-object v4, v3, Lvd/k;->a:Lvd/m;

    .line 950
    .line 951
    iget-object v4, v4, Lvd/m;->c:Ljava/lang/Long;

    .line 952
    .line 953
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 954
    .line 955
    .line 956
    move-result-wide v10

    .line 957
    invoke-static {v8, v9, v10, v11}, Ljava/lang/Math;->max(JJ)J

    .line 958
    .line 959
    .line 960
    move-result-wide v8

    .line 961
    iget-object v4, v3, Lvd/k;->d:Ljava/lang/Long;

    .line 962
    .line 963
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 964
    .line 965
    .line 966
    move-result-wide v10

    .line 967
    iget-object v4, v3, Lvd/k;->a:Lvd/m;

    .line 968
    .line 969
    iget-object v4, v4, Lvd/m;->b:Ljava/lang/Long;

    .line 970
    .line 971
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 972
    .line 973
    .line 974
    move-result-wide v12

    .line 975
    iget v4, v3, Lvd/k;->e:I

    .line 976
    .line 977
    int-to-long v14, v4

    .line 978
    mul-long/2addr v12, v14

    .line 979
    invoke-static {v12, v13, v8, v9}, Ljava/lang/Math;->min(JJ)J

    .line 980
    .line 981
    .line 982
    move-result-wide v8

    .line 983
    add-long/2addr v8, v10

    .line 984
    cmp-long v4, v6, v8

    .line 985
    .line 986
    if-lez v4, :cond_15

    .line 987
    .line 988
    invoke-virtual {v3}, Lvd/k;->e()V

    .line 989
    .line 990
    .line 991
    goto :goto_12

    .line 992
    :cond_18
    return-void

    .line 993
    :pswitch_2
    new-instance v2, Lcom/google/android/gms/ads/nativead/l;

    .line 994
    .line 995
    invoke-direct {v2, v1, v0}, Lcom/google/android/gms/ads/nativead/l;-><init>(Ljava/lang/Object;I)V

    .line 996
    .line 997
    .line 998
    iget-object v0, v1, Lpb/a;->d:Ljava/lang/Object;

    .line 999
    .line 1000
    check-cast v0, Lvb/c;

    .line 1001
    .line 1002
    invoke-virtual {v0, v2}, Lrb/a;->b(Lnb/b;)V

    .line 1003
    .line 1004
    .line 1005
    return-void

    .line 1006
    :pswitch_3
    new-instance v2, Lac/a;

    .line 1007
    .line 1008
    invoke-direct {v2, v1, v0}, Lac/a;-><init>(Ljava/lang/Object;I)V

    .line 1009
    .line 1010
    .line 1011
    iget-object v0, v1, Lpb/a;->d:Ljava/lang/Object;

    .line 1012
    .line 1013
    check-cast v0, Lvb/c;

    .line 1014
    .line 1015
    invoke-virtual {v0, v2}, Lrb/a;->b(Lnb/b;)V

    .line 1016
    .line 1017
    .line 1018
    return-void

    .line 1019
    :pswitch_4
    iget-object v0, v1, Lpb/a;->d:Ljava/lang/Object;

    .line 1020
    .line 1021
    check-cast v0, Lr4/d;

    .line 1022
    .line 1023
    invoke-static {v0}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->f(Lr4/d;)V

    .line 1024
    .line 1025
    .line 1026
    iget-object v0, v1, Lpb/a;->c:Ljava/lang/Object;

    .line 1027
    .line 1028
    check-cast v0, Ltc/g;

    .line 1029
    .line 1030
    iget-object v2, v1, Lpb/a;->b:Ljava/lang/Object;

    .line 1031
    .line 1032
    check-cast v2, Lcom/google/android/gms/ads/nativead/l;

    .line 1033
    .line 1034
    invoke-virtual {v2, v0, v4}, Lcom/google/android/gms/ads/nativead/l;->l(Luc/q;Ljava/io/Serializable;)V

    .line 1035
    .line 1036
    .line 1037
    return-void

    .line 1038
    :pswitch_5
    iget-object v0, v1, Lpb/a;->d:Ljava/lang/Object;

    .line 1039
    .line 1040
    check-cast v0, Lr4/c;

    .line 1041
    .line 1042
    invoke-static {v0}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->e(Lr4/c;)V

    .line 1043
    .line 1044
    .line 1045
    iget-object v0, v1, Lpb/a;->c:Ljava/lang/Object;

    .line 1046
    .line 1047
    check-cast v0, Ltc/g;

    .line 1048
    .line 1049
    iget-object v2, v1, Lpb/a;->b:Ljava/lang/Object;

    .line 1050
    .line 1051
    check-cast v2, Lcom/google/android/gms/ads/nativead/l;

    .line 1052
    .line 1053
    invoke-virtual {v2, v0, v4}, Lcom/google/android/gms/ads/nativead/l;->l(Luc/q;Ljava/io/Serializable;)V

    .line 1054
    .line 1055
    .line 1056
    return-void

    .line 1057
    :pswitch_6
    move/from16 v16, v5

    .line 1058
    .line 1059
    const-string v0, "Unsupported SocketAddress implementation "

    .line 1060
    .line 1061
    :try_start_6
    iget-object v2, v1, Lpb/a;->d:Ljava/lang/Object;

    .line 1062
    .line 1063
    check-cast v2, Ljava/util/concurrent/CountDownLatch;

    .line 1064
    .line 1065
    invoke-virtual {v2}, Ljava/util/concurrent/CountDownLatch;->await()V
    :try_end_6
    .catch Ljava/lang/InterruptedException; {:try_start_6 .. :try_end_6} :catch_5

    .line 1066
    .line 1067
    .line 1068
    goto :goto_14

    .line 1069
    :catch_5
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 1070
    .line 1071
    .line 1072
    move-result-object v2

    .line 1073
    invoke-virtual {v2}, Ljava/lang/Thread;->interrupt()V

    .line 1074
    .line 1075
    .line 1076
    :goto_14
    new-instance v2, Lpd/l;

    .line 1077
    .line 1078
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 1079
    .line 1080
    .line 1081
    invoke-static {v2}, Lcg/b;->d(Lcg/H;)Lcg/B;

    .line 1082
    .line 1083
    .line 1084
    move-result-object v2

    .line 1085
    :try_start_7
    iget-object v3, v1, Lpb/a;->c:Ljava/lang/Object;

    .line 1086
    .line 1087
    check-cast v3, Lpd/m;

    .line 1088
    .line 1089
    iget-object v6, v3, Lpd/m;->N:Lmd/z;

    .line 1090
    .line 1091
    if-nez v6, :cond_19

    .line 1092
    .line 1093
    iget-object v0, v3, Lpd/m;->A:Ljavax/net/SocketFactory;

    .line 1094
    .line 1095
    iget-object v3, v3, Lpd/m;->a:Ljava/net/InetSocketAddress;

    .line 1096
    .line 1097
    invoke-virtual {v3}, Ljava/net/InetSocketAddress;->getAddress()Ljava/net/InetAddress;

    .line 1098
    .line 1099
    .line 1100
    move-result-object v3

    .line 1101
    iget-object v6, v1, Lpb/a;->c:Ljava/lang/Object;

    .line 1102
    .line 1103
    check-cast v6, Lpd/m;

    .line 1104
    .line 1105
    iget-object v6, v6, Lpd/m;->a:Ljava/net/InetSocketAddress;

    .line 1106
    .line 1107
    invoke-virtual {v6}, Ljava/net/InetSocketAddress;->getPort()I

    .line 1108
    .line 1109
    .line 1110
    move-result v6

    .line 1111
    invoke-virtual {v0, v3, v6}, Ljavax/net/SocketFactory;->createSocket(Ljava/net/InetAddress;I)Ljava/net/Socket;

    .line 1112
    .line 1113
    .line 1114
    move-result-object v0

    .line 1115
    goto :goto_15

    .line 1116
    :catchall_2
    move-exception v0

    .line 1117
    goto/16 :goto_1d

    .line 1118
    .line 1119
    :catch_6
    move-exception v0

    .line 1120
    goto/16 :goto_19

    .line 1121
    .line 1122
    :catch_7
    move-exception v0

    .line 1123
    goto/16 :goto_1b

    .line 1124
    .line 1125
    :cond_19
    iget-object v7, v6, Lmd/z;->a:Ljava/net/InetSocketAddress;

    .line 1126
    .line 1127
    instance-of v8, v7, Ljava/net/InetSocketAddress;

    .line 1128
    .line 1129
    if-eqz v8, :cond_1e

    .line 1130
    .line 1131
    iget-object v0, v6, Lmd/z;->b:Ljava/net/InetSocketAddress;

    .line 1132
    .line 1133
    iget-object v8, v6, Lmd/z;->c:Ljava/lang/String;

    .line 1134
    .line 1135
    iget-object v6, v6, Lmd/z;->d:Ljava/lang/String;

    .line 1136
    .line 1137
    invoke-static {v3, v0, v7, v8, v6}, Lpd/m;->h(Lpd/m;Ljava/net/InetSocketAddress;Ljava/net/InetSocketAddress;Ljava/lang/String;Ljava/lang/String;)Ljava/net/Socket;

    .line 1138
    .line 1139
    .line 1140
    move-result-object v0

    .line 1141
    :goto_15
    iget-object v3, v1, Lpb/a;->c:Ljava/lang/Object;

    .line 1142
    .line 1143
    check-cast v3, Lpd/m;

    .line 1144
    .line 1145
    iget-object v6, v3, Lpd/m;->B:Ljavax/net/ssl/SSLSocketFactory;

    .line 1146
    .line 1147
    if-eqz v6, :cond_1b

    .line 1148
    .line 1149
    iget-object v3, v3, Lpd/m;->b:Ljava/lang/String;

    .line 1150
    .line 1151
    invoke-static {v3}, Lod/a0;->a(Ljava/lang/String;)Ljava/net/URI;

    .line 1152
    .line 1153
    .line 1154
    move-result-object v4

    .line 1155
    invoke-virtual {v4}, Ljava/net/URI;->getHost()Ljava/lang/String;

    .line 1156
    .line 1157
    .line 1158
    move-result-object v7

    .line 1159
    if-eqz v7, :cond_1a

    .line 1160
    .line 1161
    invoke-virtual {v4}, Ljava/net/URI;->getHost()Ljava/lang/String;

    .line 1162
    .line 1163
    .line 1164
    move-result-object v3

    .line 1165
    :cond_1a
    iget-object v4, v1, Lpb/a;->c:Ljava/lang/Object;

    .line 1166
    .line 1167
    check-cast v4, Lpd/m;

    .line 1168
    .line 1169
    invoke-virtual {v4}, Lpd/m;->l()I

    .line 1170
    .line 1171
    .line 1172
    move-result v4

    .line 1173
    iget-object v7, v1, Lpb/a;->c:Ljava/lang/Object;

    .line 1174
    .line 1175
    check-cast v7, Lpd/m;

    .line 1176
    .line 1177
    iget-object v7, v7, Lpd/m;->E:Lqd/b;

    .line 1178
    .line 1179
    invoke-static {v6, v0, v3, v4, v7}, Lpd/s;->a(Ljavax/net/ssl/SSLSocketFactory;Ljava/net/Socket;Ljava/lang/String;ILqd/b;)Ljavax/net/ssl/SSLSocket;

    .line 1180
    .line 1181
    .line 1182
    move-result-object v0

    .line 1183
    invoke-virtual {v0}, Ljavax/net/ssl/SSLSocket;->getSession()Ljavax/net/ssl/SSLSession;

    .line 1184
    .line 1185
    .line 1186
    move-result-object v4

    .line 1187
    :cond_1b
    const/4 v5, 0x1

    .line 1188
    invoke-virtual {v0, v5}, Ljava/net/Socket;->setTcpNoDelay(Z)V

    .line 1189
    .line 1190
    .line 1191
    invoke-static {v0}, Lcg/b;->n(Ljava/net/Socket;)Lcg/d;

    .line 1192
    .line 1193
    .line 1194
    move-result-object v3

    .line 1195
    invoke-static {v3}, Lcg/b;->d(Lcg/H;)Lcg/B;

    .line 1196
    .line 1197
    .line 1198
    move-result-object v2

    .line 1199
    iget-object v3, v1, Lpb/a;->b:Ljava/lang/Object;

    .line 1200
    .line 1201
    check-cast v3, Lpd/c;

    .line 1202
    .line 1203
    invoke-static {v0}, Lcg/b;->j(Ljava/net/Socket;)Lcg/c;

    .line 1204
    .line 1205
    .line 1206
    move-result-object v5

    .line 1207
    invoke-virtual {v3, v5, v0}, Lpd/c;->a(Lcg/c;Ljava/net/Socket;)V

    .line 1208
    .line 1209
    .line 1210
    iget-object v3, v1, Lpb/a;->c:Ljava/lang/Object;

    .line 1211
    .line 1212
    check-cast v3, Lpd/m;

    .line 1213
    .line 1214
    iget-object v5, v3, Lpd/m;->u:Lmd/b;

    .line 1215
    .line 1216
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1217
    .line 1218
    .line 1219
    new-instance v6, LY2/B;

    .line 1220
    .line 1221
    invoke-direct {v6, v5}, LY2/B;-><init>(Lmd/b;)V

    .line 1222
    .line 1223
    .line 1224
    sget-object v5, Lmd/e;->a:Lmd/a;

    .line 1225
    .line 1226
    invoke-virtual {v0}, Ljava/net/Socket;->getRemoteSocketAddress()Ljava/net/SocketAddress;

    .line 1227
    .line 1228
    .line 1229
    move-result-object v7

    .line 1230
    invoke-virtual {v6, v5, v7}, LY2/B;->D(Lmd/a;Ljava/lang/Object;)V

    .line 1231
    .line 1232
    .line 1233
    sget-object v5, Lmd/e;->b:Lmd/a;

    .line 1234
    .line 1235
    invoke-virtual {v0}, Ljava/net/Socket;->getLocalSocketAddress()Ljava/net/SocketAddress;

    .line 1236
    .line 1237
    .line 1238
    move-result-object v0

    .line 1239
    invoke-virtual {v6, v5, v0}, LY2/B;->D(Lmd/a;Ljava/lang/Object;)V

    .line 1240
    .line 1241
    .line 1242
    sget-object v0, Lmd/e;->c:Lmd/a;

    .line 1243
    .line 1244
    invoke-virtual {v6, v0, v4}, LY2/B;->D(Lmd/a;Ljava/lang/Object;)V

    .line 1245
    .line 1246
    .line 1247
    sget-object v0, Lod/S1;->a:Lmd/a;

    .line 1248
    .line 1249
    if-nez v4, :cond_1c

    .line 1250
    .line 1251
    sget-object v5, Lmd/h0;->a:Lmd/h0;

    .line 1252
    .line 1253
    goto :goto_16

    .line 1254
    :cond_1c
    sget-object v5, Lmd/h0;->b:Lmd/h0;

    .line 1255
    .line 1256
    :goto_16
    invoke-virtual {v6, v0, v5}, LY2/B;->D(Lmd/a;Ljava/lang/Object;)V

    .line 1257
    .line 1258
    .line 1259
    invoke-virtual {v6}, LY2/B;->i()Lmd/b;

    .line 1260
    .line 1261
    .line 1262
    move-result-object v0

    .line 1263
    iput-object v0, v3, Lpd/m;->u:Lmd/b;
    :try_end_7
    .catch Lmd/l0; {:try_start_7 .. :try_end_7} :catch_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_6
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 1264
    .line 1265
    iget-object v0, v1, Lpb/a;->c:Ljava/lang/Object;

    .line 1266
    .line 1267
    check-cast v0, Lpd/m;

    .line 1268
    .line 1269
    new-instance v3, LA7/p1;

    .line 1270
    .line 1271
    iget-object v5, v0, Lpd/m;->g:Lrd/j;

    .line 1272
    .line 1273
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1274
    .line 1275
    .line 1276
    new-instance v5, Lrd/h;

    .line 1277
    .line 1278
    invoke-direct {v5, v2}, Lrd/h;-><init>(Lcg/B;)V

    .line 1279
    .line 1280
    .line 1281
    invoke-direct {v3, v0, v5}, LA7/p1;-><init>(Lpd/m;Lrd/h;)V

    .line 1282
    .line 1283
    .line 1284
    iput-object v3, v0, Lpd/m;->t:LA7/p1;

    .line 1285
    .line 1286
    iget-object v0, v1, Lpb/a;->c:Ljava/lang/Object;

    .line 1287
    .line 1288
    check-cast v0, Lpd/m;

    .line 1289
    .line 1290
    iget-object v3, v0, Lpd/m;->k:Ljava/lang/Object;

    .line 1291
    .line 1292
    monitor-enter v3

    .line 1293
    :try_start_8
    iget-object v0, v1, Lpb/a;->c:Ljava/lang/Object;

    .line 1294
    .line 1295
    check-cast v0, Lpd/m;

    .line 1296
    .line 1297
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1298
    .line 1299
    .line 1300
    if-eqz v4, :cond_1d

    .line 1301
    .line 1302
    iget-object v0, v1, Lpb/a;->c:Ljava/lang/Object;

    .line 1303
    .line 1304
    check-cast v0, Lpd/m;

    .line 1305
    .line 1306
    new-instance v2, Lmd/j;

    .line 1307
    .line 1308
    invoke-direct {v2, v4}, Lmd/j;-><init>(Ljavax/net/ssl/SSLSession;)V

    .line 1309
    .line 1310
    .line 1311
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1312
    .line 1313
    .line 1314
    goto :goto_17

    .line 1315
    :catchall_3
    move-exception v0

    .line 1316
    goto :goto_18

    .line 1317
    :cond_1d
    :goto_17
    monitor-exit v3

    .line 1318
    goto :goto_1c

    .line 1319
    :goto_18
    monitor-exit v3
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 1320
    throw v0

    .line 1321
    :cond_1e
    :try_start_9
    sget-object v3, Lmd/k0;->m:Lmd/k0;

    .line 1322
    .line 1323
    new-instance v4, Ljava/lang/StringBuilder;

    .line 1324
    .line 1325
    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1326
    .line 1327
    .line 1328
    iget-object v0, v1, Lpb/a;->c:Ljava/lang/Object;

    .line 1329
    .line 1330
    check-cast v0, Lpd/m;

    .line 1331
    .line 1332
    iget-object v0, v0, Lpd/m;->N:Lmd/z;

    .line 1333
    .line 1334
    iget-object v0, v0, Lmd/z;->a:Ljava/net/InetSocketAddress;

    .line 1335
    .line 1336
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1337
    .line 1338
    .line 1339
    move-result-object v0

    .line 1340
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1341
    .line 1342
    .line 1343
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1344
    .line 1345
    .line 1346
    move-result-object v0

    .line 1347
    invoke-virtual {v3, v0}, Lmd/k0;->h(Ljava/lang/String;)Lmd/k0;

    .line 1348
    .line 1349
    .line 1350
    move-result-object v0

    .line 1351
    new-instance v3, Lmd/l0;

    .line 1352
    .line 1353
    invoke-direct {v3, v0}, Lmd/l0;-><init>(Lmd/k0;)V

    .line 1354
    .line 1355
    .line 1356
    throw v3
    :try_end_9
    .catch Lmd/l0; {:try_start_9 .. :try_end_9} :catch_7
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_6
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 1357
    :goto_19
    :try_start_a
    iget-object v3, v1, Lpb/a;->c:Ljava/lang/Object;

    .line 1358
    .line 1359
    check-cast v3, Lpd/m;

    .line 1360
    .line 1361
    invoke-virtual {v3, v0}, Lpd/m;->q(Ljava/lang/Exception;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    .line 1362
    .line 1363
    .line 1364
    iget-object v0, v1, Lpb/a;->c:Ljava/lang/Object;

    .line 1365
    .line 1366
    check-cast v0, Lpd/m;

    .line 1367
    .line 1368
    new-instance v3, LA7/p1;

    .line 1369
    .line 1370
    iget-object v4, v0, Lpd/m;->g:Lrd/j;

    .line 1371
    .line 1372
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1373
    .line 1374
    .line 1375
    new-instance v4, Lrd/h;

    .line 1376
    .line 1377
    invoke-direct {v4, v2}, Lrd/h;-><init>(Lcg/B;)V

    .line 1378
    .line 1379
    .line 1380
    invoke-direct {v3, v0, v4}, LA7/p1;-><init>(Lpd/m;Lrd/h;)V

    .line 1381
    .line 1382
    .line 1383
    :goto_1a
    iput-object v3, v0, Lpd/m;->t:LA7/p1;

    .line 1384
    .line 1385
    goto :goto_1c

    .line 1386
    :goto_1b
    :try_start_b
    iget-object v3, v1, Lpb/a;->c:Ljava/lang/Object;

    .line 1387
    .line 1388
    check-cast v3, Lpd/m;

    .line 1389
    .line 1390
    sget-object v4, Lrd/a;->d:Lrd/a;

    .line 1391
    .line 1392
    iget-object v0, v0, Lmd/l0;->a:Lmd/k0;

    .line 1393
    .line 1394
    move/from16 v5, v16

    .line 1395
    .line 1396
    invoke-virtual {v3, v5, v4, v0}, Lpd/m;->u(ILrd/a;Lmd/k0;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    .line 1397
    .line 1398
    .line 1399
    iget-object v0, v1, Lpb/a;->c:Ljava/lang/Object;

    .line 1400
    .line 1401
    check-cast v0, Lpd/m;

    .line 1402
    .line 1403
    new-instance v3, LA7/p1;

    .line 1404
    .line 1405
    iget-object v4, v0, Lpd/m;->g:Lrd/j;

    .line 1406
    .line 1407
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1408
    .line 1409
    .line 1410
    new-instance v4, Lrd/h;

    .line 1411
    .line 1412
    invoke-direct {v4, v2}, Lrd/h;-><init>(Lcg/B;)V

    .line 1413
    .line 1414
    .line 1415
    invoke-direct {v3, v0, v4}, LA7/p1;-><init>(Lpd/m;Lrd/h;)V

    .line 1416
    .line 1417
    .line 1418
    goto :goto_1a

    .line 1419
    :goto_1c
    return-void

    .line 1420
    :goto_1d
    iget-object v3, v1, Lpb/a;->c:Ljava/lang/Object;

    .line 1421
    .line 1422
    check-cast v3, Lpd/m;

    .line 1423
    .line 1424
    new-instance v4, LA7/p1;

    .line 1425
    .line 1426
    iget-object v5, v3, Lpd/m;->g:Lrd/j;

    .line 1427
    .line 1428
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1429
    .line 1430
    .line 1431
    new-instance v5, Lrd/h;

    .line 1432
    .line 1433
    invoke-direct {v5, v2}, Lrd/h;-><init>(Lcg/B;)V

    .line 1434
    .line 1435
    .line 1436
    invoke-direct {v4, v3, v5}, LA7/p1;-><init>(Lpd/m;Lrd/h;)V

    .line 1437
    .line 1438
    .line 1439
    iput-object v4, v3, Lpd/m;->t:LA7/p1;

    .line 1440
    .line 1441
    throw v0

    .line 1442
    :pswitch_7
    new-instance v0, Lac/a;

    .line 1443
    .line 1444
    const/16 v2, 0x10

    .line 1445
    .line 1446
    invoke-direct {v0, v1, v2}, Lac/a;-><init>(Ljava/lang/Object;I)V

    .line 1447
    .line 1448
    .line 1449
    iget-object v2, v1, Lpb/a;->d:Ljava/lang/Object;

    .line 1450
    .line 1451
    check-cast v2, Lrb/f;

    .line 1452
    .line 1453
    invoke-virtual {v2, v0}, Lrb/a;->b(Lnb/b;)V

    .line 1454
    .line 1455
    .line 1456
    return-void

    .line 1457
    :pswitch_8
    new-instance v0, La2/c;

    .line 1458
    .line 1459
    const/16 v2, 0x16

    .line 1460
    .line 1461
    invoke-direct {v0, v1, v2}, La2/c;-><init>(Ljava/lang/Object;I)V

    .line 1462
    .line 1463
    .line 1464
    iget-object v2, v1, Lpb/a;->d:Ljava/lang/Object;

    .line 1465
    .line 1466
    check-cast v2, Lrb/f;

    .line 1467
    .line 1468
    invoke-virtual {v2, v0}, Lrb/a;->b(Lnb/b;)V

    .line 1469
    .line 1470
    .line 1471
    return-void

    .line 1472
    nop

    .line 1473
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_0
    .end packed-switch

    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_1
    .end packed-switch
.end method
