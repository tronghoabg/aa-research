.class public final Lad/a;
.super Luc/w;
.source "SourceFile"


# instance fields
.field public d:Landroid/content/Context;

.field public final e:Lad/r;

.field public final f:LY1/t;


# direct methods
.method public constructor <init>(Landroid/content/Context;LY1/t;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lad/a;->d:Landroid/content/Context;

    .line 5
    .line 6
    new-instance p1, Lad/r;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lad/a;->e:Lad/r;

    .line 12
    .line 13
    iput-object p2, p0, Lad/a;->f:LY1/t;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    const-string v2, "FlutterMediationExtras"

    .line 6
    .line 7
    iget-object v3, v0, Lad/a;->f:LY1/t;

    .line 8
    .line 9
    iget-object v5, v0, Lad/a;->e:Lad/r;

    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    packed-switch p1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    :pswitch_0
    invoke-super/range {p0 .. p2}, Luc/w;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    return-object v1

    .line 20
    :pswitch_1
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    invoke-virtual {v0, v3, v1}, Lad/a;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    check-cast v3, Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    invoke-virtual {v0, v5, v1}, Lad/a;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, Ljava/util/Map;

    .line 39
    .line 40
    :try_start_0
    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    const/4 v5, 0x0

    .line 45
    new-array v6, v5, [Ljava/lang/Class;

    .line 46
    .line 47
    invoke-virtual {v1, v6}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    new-array v5, v5, [Ljava/lang/Object;

    .line 52
    .line 53
    invoke-virtual {v1, v5}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-static {v1}, LVa/M6;->z(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 58
    .line 59
    .line 60
    throw v4

    .line 61
    :catch_0
    const-string v1, "Unable to instantiate class "

    .line 62
    .line 63
    invoke-static {v1, v3, v2}, Lcb/a;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :catch_1
    const-string v1, "Illegal Access to "

    .line 68
    .line 69
    invoke-static {v1, v3, v2}, Lcb/a;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :catch_2
    const-string v1, "Invocation Target Exception for: "

    .line 74
    .line 75
    invoke-static {v1, v3, v2}, Lcb/a;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :catch_3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 80
    .line 81
    const-string v5, "No such method found: "

    .line 82
    .line 83
    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    const-string v3, ".getDeclaredConstructor()"

    .line 90
    .line 91
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    invoke-static {v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 99
    .line 100
    .line 101
    goto :goto_0

    .line 102
    :catch_4
    const-string v1, "Class not found: "

    .line 103
    .line 104
    invoke-static {v1, v3, v2}, Lcb/a;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    :goto_0
    return-object v4

    .line 108
    :pswitch_2
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 109
    .line 110
    .line 111
    move-result v2

    .line 112
    invoke-virtual {v0, v2, v1}, Lad/a;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    check-cast v2, Ljava/lang/Integer;

    .line 117
    .line 118
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 119
    .line 120
    .line 121
    move-result v3

    .line 122
    invoke-virtual {v0, v3, v1}, Lad/a;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    check-cast v3, Ljava/lang/Integer;

    .line 127
    .line 128
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 129
    .line 130
    .line 131
    move-result v4

    .line 132
    invoke-virtual {v0, v4, v1}, Lad/a;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v4

    .line 136
    check-cast v4, Ljava/lang/Integer;

    .line 137
    .line 138
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 139
    .line 140
    .line 141
    move-result v5

    .line 142
    invoke-virtual {v0, v5, v1}, Lad/a;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    check-cast v1, Ljava/lang/Integer;

    .line 147
    .line 148
    new-instance v5, Landroid/graphics/drawable/ColorDrawable;

    .line 149
    .line 150
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 151
    .line 152
    .line 153
    move-result v2

    .line 154
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 155
    .line 156
    .line 157
    move-result v3

    .line 158
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 159
    .line 160
    .line 161
    move-result v4

    .line 162
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 163
    .line 164
    .line 165
    move-result v1

    .line 166
    invoke-static {v2, v3, v4, v1}, Landroid/graphics/Color;->argb(IIII)I

    .line 167
    .line 168
    .line 169
    move-result v1

    .line 170
    invoke-direct {v5, v1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 171
    .line 172
    .line 173
    return-object v5

    .line 174
    :pswitch_3
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 175
    .line 176
    .line 177
    move-result v2

    .line 178
    invoke-virtual {v0, v2, v1}, Lad/a;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    check-cast v1, Ljava/lang/Integer;

    .line 183
    .line 184
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 185
    .line 186
    .line 187
    move-result v1

    .line 188
    if-ltz v1, :cond_0

    .line 189
    .line 190
    invoke-static {}, Lbd/d;->values()[Lbd/d;

    .line 191
    .line 192
    .line 193
    move-result-object v2

    .line 194
    array-length v2, v2

    .line 195
    if-ge v1, v2, :cond_0

    .line 196
    .line 197
    invoke-static {}, Lbd/d;->values()[Lbd/d;

    .line 198
    .line 199
    .line 200
    move-result-object v2

    .line 201
    aget-object v1, v2, v1

    .line 202
    .line 203
    return-object v1

    .line 204
    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    .line 205
    .line 206
    const-string v3, "Invalid template type index: "

    .line 207
    .line 208
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 212
    .line 213
    .line 214
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v1

    .line 218
    const-string v2, "NativeTemplateType"

    .line 219
    .line 220
    invoke-static {v2, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 221
    .line 222
    .line 223
    sget-object v1, Lbd/d;->b:Lbd/d;

    .line 224
    .line 225
    return-object v1

    .line 226
    :pswitch_4
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 227
    .line 228
    .line 229
    move-result v2

    .line 230
    invoke-virtual {v0, v2, v1}, Lad/a;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v1

    .line 234
    check-cast v1, Ljava/lang/Integer;

    .line 235
    .line 236
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 237
    .line 238
    .line 239
    move-result v1

    .line 240
    if-ltz v1, :cond_1

    .line 241
    .line 242
    invoke-static {}, Lbd/a;->values()[Lbd/a;

    .line 243
    .line 244
    .line 245
    move-result-object v2

    .line 246
    array-length v2, v2

    .line 247
    if-ge v1, v2, :cond_1

    .line 248
    .line 249
    invoke-static {}, Lbd/a;->values()[Lbd/a;

    .line 250
    .line 251
    .line 252
    move-result-object v2

    .line 253
    aget-object v1, v2, v1

    .line 254
    .line 255
    return-object v1

    .line 256
    :cond_1
    new-instance v2, Ljava/lang/StringBuilder;

    .line 257
    .line 258
    const-string v3, "Invalid index for NativeTemplateFontStyle: "

    .line 259
    .line 260
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 261
    .line 262
    .line 263
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 264
    .line 265
    .line 266
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v1

    .line 270
    const-string v2, "NativeTemplateFontStyle"

    .line 271
    .line 272
    invoke-static {v2, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 273
    .line 274
    .line 275
    sget-object v1, Lbd/a;->a:Lbd/a;

    .line 276
    .line 277
    return-object v1

    .line 278
    :pswitch_5
    new-instance v2, Lbd/c;

    .line 279
    .line 280
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 281
    .line 282
    .line 283
    move-result v3

    .line 284
    invoke-virtual {v0, v3, v1}, Lad/a;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object v3

    .line 288
    check-cast v3, Landroid/graphics/drawable/ColorDrawable;

    .line 289
    .line 290
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 291
    .line 292
    .line 293
    move-result v4

    .line 294
    invoke-virtual {v0, v4, v1}, Lad/a;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object v4

    .line 298
    check-cast v4, Landroid/graphics/drawable/ColorDrawable;

    .line 299
    .line 300
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 301
    .line 302
    .line 303
    move-result v5

    .line 304
    invoke-virtual {v0, v5, v1}, Lad/a;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    move-result-object v5

    .line 308
    check-cast v5, Lbd/a;

    .line 309
    .line 310
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 311
    .line 312
    .line 313
    move-result v6

    .line 314
    invoke-virtual {v0, v6, v1}, Lad/a;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object v1

    .line 318
    check-cast v1, Ljava/lang/Double;

    .line 319
    .line 320
    invoke-direct {v2, v3, v4, v5, v1}, Lbd/c;-><init>(Landroid/graphics/drawable/ColorDrawable;Landroid/graphics/drawable/ColorDrawable;Lbd/a;Ljava/lang/Double;)V

    .line 321
    .line 322
    .line 323
    return-object v2

    .line 324
    :pswitch_6
    new-instance v6, Lbd/b;

    .line 325
    .line 326
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 327
    .line 328
    .line 329
    move-result v2

    .line 330
    invoke-virtual {v0, v2, v1}, Lad/a;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    move-result-object v2

    .line 334
    move-object v7, v2

    .line 335
    check-cast v7, Lbd/d;

    .line 336
    .line 337
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 338
    .line 339
    .line 340
    move-result v2

    .line 341
    invoke-virtual {v0, v2, v1}, Lad/a;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 342
    .line 343
    .line 344
    move-result-object v2

    .line 345
    move-object v8, v2

    .line 346
    check-cast v8, Landroid/graphics/drawable/ColorDrawable;

    .line 347
    .line 348
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 349
    .line 350
    .line 351
    move-result v2

    .line 352
    invoke-virtual {v0, v2, v1}, Lad/a;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    move-result-object v2

    .line 356
    move-object v9, v2

    .line 357
    check-cast v9, Lbd/c;

    .line 358
    .line 359
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 360
    .line 361
    .line 362
    move-result v2

    .line 363
    invoke-virtual {v0, v2, v1}, Lad/a;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 364
    .line 365
    .line 366
    move-result-object v2

    .line 367
    move-object v10, v2

    .line 368
    check-cast v10, Lbd/c;

    .line 369
    .line 370
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 371
    .line 372
    .line 373
    move-result v2

    .line 374
    invoke-virtual {v0, v2, v1}, Lad/a;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 375
    .line 376
    .line 377
    move-result-object v2

    .line 378
    move-object v11, v2

    .line 379
    check-cast v11, Lbd/c;

    .line 380
    .line 381
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 382
    .line 383
    .line 384
    move-result v2

    .line 385
    invoke-virtual {v0, v2, v1}, Lad/a;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 386
    .line 387
    .line 388
    move-result-object v1

    .line 389
    move-object v12, v1

    .line 390
    check-cast v12, Lbd/c;

    .line 391
    .line 392
    invoke-direct/range {v6 .. v12}, Lbd/b;-><init>(Lbd/d;Landroid/graphics/drawable/ColorDrawable;Lbd/c;Lbd/c;Lbd/c;Lbd/c;)V

    .line 393
    .line 394
    .line 395
    return-object v6

    .line 396
    :pswitch_7
    new-instance v2, Lrd/d;

    .line 397
    .line 398
    invoke-direct {v2}, Lrd/d;-><init>()V

    .line 399
    .line 400
    .line 401
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 402
    .line 403
    .line 404
    move-result v3

    .line 405
    invoke-virtual {v0, v3, v1}, Lad/a;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 406
    .line 407
    .line 408
    move-result-object v3

    .line 409
    check-cast v3, Ljava/lang/String;

    .line 410
    .line 411
    invoke-virtual {v2, v3}, Lrd/d;->b(Ljava/lang/String;)V

    .line 412
    .line 413
    .line 414
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 415
    .line 416
    .line 417
    move-result v3

    .line 418
    invoke-virtual {v0, v3, v1}, Lad/a;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 419
    .line 420
    .line 421
    move-result-object v3

    .line 422
    check-cast v3, Ljava/lang/Integer;

    .line 423
    .line 424
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 425
    .line 426
    .line 427
    move-result v3

    .line 428
    invoke-virtual {v2, v3}, Lrd/d;->c(I)V

    .line 429
    .line 430
    .line 431
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 432
    .line 433
    .line 434
    move-result v3

    .line 435
    invoke-virtual {v0, v3, v1}, Lad/a;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 436
    .line 437
    .line 438
    move-result-object v3

    .line 439
    check-cast v3, Ljava/lang/Integer;

    .line 440
    .line 441
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 442
    .line 443
    .line 444
    move-result v3

    .line 445
    invoke-virtual {v2, v3}, Lrd/d;->d(I)V

    .line 446
    .line 447
    .line 448
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 449
    .line 450
    .line 451
    move-result v3

    .line 452
    invoke-virtual {v0, v3, v1}, Lad/a;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 453
    .line 454
    .line 455
    move-result-object v1

    .line 456
    check-cast v1, Ljava/util/List;

    .line 457
    .line 458
    iget-object v3, v2, Lrd/d;->e:Ljava/lang/Object;

    .line 459
    .line 460
    move-object v8, v3

    .line 461
    check-cast v8, Ljava/util/ArrayList;

    .line 462
    .line 463
    invoke-virtual {v8}, Ljava/util/ArrayList;->clear()V

    .line 464
    .line 465
    .line 466
    if-eqz v1, :cond_2

    .line 467
    .line 468
    invoke-virtual {v8, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 469
    .line 470
    .line 471
    :cond_2
    new-instance v4, Lx6/s;

    .line 472
    .line 473
    iget v5, v2, Lrd/d;->a:I

    .line 474
    .line 475
    iget v6, v2, Lrd/d;->b:I

    .line 476
    .line 477
    iget-object v1, v2, Lrd/d;->d:Ljava/lang/Object;

    .line 478
    .line 479
    move-object v7, v1

    .line 480
    check-cast v7, Ljava/lang/String;

    .line 481
    .line 482
    iget v9, v2, Lrd/d;->c:I

    .line 483
    .line 484
    invoke-direct/range {v4 .. v9}, Lx6/s;-><init>(IILjava/lang/String;Ljava/util/ArrayList;I)V

    .line 485
    .line 486
    .line 487
    return-object v4

    .line 488
    :pswitch_8
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 489
    .line 490
    .line 491
    move-result v2

    .line 492
    invoke-virtual {v0, v2, v1}, Lad/a;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 493
    .line 494
    .line 495
    move-result-object v2

    .line 496
    check-cast v2, Ljava/lang/Integer;

    .line 497
    .line 498
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 499
    .line 500
    .line 501
    move-result v3

    .line 502
    invoke-virtual {v0, v3, v1}, Lad/a;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 503
    .line 504
    .line 505
    move-result-object v3

    .line 506
    move-object v9, v3

    .line 507
    check-cast v9, Ljava/lang/Integer;

    .line 508
    .line 509
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 510
    .line 511
    .line 512
    move-result v3

    .line 513
    invoke-virtual {v0, v3, v1}, Lad/a;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 514
    .line 515
    .line 516
    move-result-object v1

    .line 517
    move-object v8, v1

    .line 518
    check-cast v8, Ljava/lang/Integer;

    .line 519
    .line 520
    new-instance v4, Lad/u;

    .line 521
    .line 522
    iget-object v6, v0, Lad/a;->d:Landroid/content/Context;

    .line 523
    .line 524
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 525
    .line 526
    .line 527
    move-result v7

    .line 528
    invoke-direct/range {v4 .. v9}, Lad/u;-><init>(Lad/r;Landroid/content/Context;ILjava/lang/Integer;Ljava/lang/Integer;)V

    .line 529
    .line 530
    .line 531
    return-object v4

    .line 532
    :pswitch_9
    new-instance v2, Lad/V;

    .line 533
    .line 534
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 535
    .line 536
    .line 537
    move-result v3

    .line 538
    invoke-virtual {v0, v3, v1}, Lad/a;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 539
    .line 540
    .line 541
    move-result-object v3

    .line 542
    check-cast v3, Ljava/lang/Boolean;

    .line 543
    .line 544
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 545
    .line 546
    .line 547
    move-result v4

    .line 548
    invoke-virtual {v0, v4, v1}, Lad/a;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 549
    .line 550
    .line 551
    move-result-object v4

    .line 552
    check-cast v4, Ljava/lang/Boolean;

    .line 553
    .line 554
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 555
    .line 556
    .line 557
    move-result v5

    .line 558
    invoke-virtual {v0, v5, v1}, Lad/a;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 559
    .line 560
    .line 561
    move-result-object v1

    .line 562
    check-cast v1, Ljava/lang/Boolean;

    .line 563
    .line 564
    invoke-direct {v2, v3, v4, v1}, Lad/V;-><init>(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    .line 565
    .line 566
    .line 567
    return-object v2

    .line 568
    :pswitch_a
    new-instance v5, Lad/M;

    .line 569
    .line 570
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 571
    .line 572
    .line 573
    move-result v2

    .line 574
    invoke-virtual {v0, v2, v1}, Lad/a;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 575
    .line 576
    .line 577
    move-result-object v2

    .line 578
    move-object v6, v2

    .line 579
    check-cast v6, Ljava/lang/Integer;

    .line 580
    .line 581
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 582
    .line 583
    .line 584
    move-result v2

    .line 585
    invoke-virtual {v0, v2, v1}, Lad/a;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 586
    .line 587
    .line 588
    move-result-object v2

    .line 589
    move-object v7, v2

    .line 590
    check-cast v7, Ljava/lang/Integer;

    .line 591
    .line 592
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 593
    .line 594
    .line 595
    move-result v2

    .line 596
    invoke-virtual {v0, v2, v1}, Lad/a;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 597
    .line 598
    .line 599
    move-result-object v2

    .line 600
    move-object v8, v2

    .line 601
    check-cast v8, Lad/V;

    .line 602
    .line 603
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 604
    .line 605
    .line 606
    move-result v2

    .line 607
    invoke-virtual {v0, v2, v1}, Lad/a;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 608
    .line 609
    .line 610
    move-result-object v2

    .line 611
    move-object v9, v2

    .line 612
    check-cast v9, Ljava/lang/Boolean;

    .line 613
    .line 614
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 615
    .line 616
    .line 617
    move-result v2

    .line 618
    invoke-virtual {v0, v2, v1}, Lad/a;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 619
    .line 620
    .line 621
    move-result-object v2

    .line 622
    move-object v10, v2

    .line 623
    check-cast v10, Ljava/lang/Boolean;

    .line 624
    .line 625
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 626
    .line 627
    .line 628
    move-result v2

    .line 629
    invoke-virtual {v0, v2, v1}, Lad/a;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 630
    .line 631
    .line 632
    move-result-object v1

    .line 633
    move-object v11, v1

    .line 634
    check-cast v11, Ljava/lang/Boolean;

    .line 635
    .line 636
    invoke-direct/range {v5 .. v11}, Lad/M;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;Lad/V;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    .line 637
    .line 638
    .line 639
    return-object v5

    .line 640
    :pswitch_b
    new-instance v1, Lad/v;

    .line 641
    .line 642
    sget-object v2, Lcom/google/android/gms/ads/AdSize;->l:Lcom/google/android/gms/ads/AdSize;

    .line 643
    .line 644
    invoke-direct {v1, v2}, Lad/w;-><init>(Lcom/google/android/gms/ads/AdSize;)V

    .line 645
    .line 646
    .line 647
    return-object v1

    .line 648
    :pswitch_c
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 649
    .line 650
    .line 651
    move-result v2

    .line 652
    invoke-virtual {v0, v2, v1}, Lad/a;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 653
    .line 654
    .line 655
    move-result-object v2

    .line 656
    check-cast v2, Ljava/lang/String;

    .line 657
    .line 658
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 659
    .line 660
    .line 661
    move-result v3

    .line 662
    invoke-virtual {v0, v3, v1}, Lad/a;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 663
    .line 664
    .line 665
    move-result-object v1

    .line 666
    check-cast v1, Ljava/lang/Integer;

    .line 667
    .line 668
    new-instance v3, Lad/s;

    .line 669
    .line 670
    iget-object v4, v0, Lad/a;->d:Landroid/content/Context;

    .line 671
    .line 672
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 673
    .line 674
    .line 675
    move-result v1

    .line 676
    invoke-direct {v3, v4, v5, v2, v1}, Lad/s;-><init>(Landroid/content/Context;Lad/r;Ljava/lang/String;I)V

    .line 677
    .line 678
    .line 679
    return-object v3

    .line 680
    :pswitch_d
    new-instance v6, Lad/e;

    .line 681
    .line 682
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 683
    .line 684
    .line 685
    move-result v2

    .line 686
    invoke-virtual {v0, v2, v1}, Lad/a;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 687
    .line 688
    .line 689
    move-result-object v2

    .line 690
    move-object v7, v2

    .line 691
    check-cast v7, Ljava/lang/String;

    .line 692
    .line 693
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 694
    .line 695
    .line 696
    move-result v2

    .line 697
    invoke-virtual {v0, v2, v1}, Lad/a;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 698
    .line 699
    .line 700
    move-result-object v2

    .line 701
    check-cast v2, Ljava/lang/Long;

    .line 702
    .line 703
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 704
    .line 705
    .line 706
    move-result-wide v8

    .line 707
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 708
    .line 709
    .line 710
    move-result v2

    .line 711
    invoke-virtual {v0, v2, v1}, Lad/a;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 712
    .line 713
    .line 714
    move-result-object v2

    .line 715
    move-object v10, v2

    .line 716
    check-cast v10, Ljava/lang/String;

    .line 717
    .line 718
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 719
    .line 720
    .line 721
    move-result v2

    .line 722
    invoke-virtual {v0, v2, v1}, Lad/a;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 723
    .line 724
    .line 725
    move-result-object v2

    .line 726
    move-object v11, v2

    .line 727
    check-cast v11, Ljava/util/Map;

    .line 728
    .line 729
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 730
    .line 731
    .line 732
    move-result v2

    .line 733
    invoke-virtual {v0, v2, v1}, Lad/a;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 734
    .line 735
    .line 736
    move-result-object v2

    .line 737
    move-object v12, v2

    .line 738
    check-cast v12, Lad/d;

    .line 739
    .line 740
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 741
    .line 742
    .line 743
    move-result v2

    .line 744
    invoke-virtual {v0, v2, v1}, Lad/a;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 745
    .line 746
    .line 747
    move-result-object v2

    .line 748
    move-object v13, v2

    .line 749
    check-cast v13, Ljava/lang/String;

    .line 750
    .line 751
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 752
    .line 753
    .line 754
    move-result v2

    .line 755
    invoke-virtual {v0, v2, v1}, Lad/a;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 756
    .line 757
    .line 758
    move-result-object v2

    .line 759
    move-object v14, v2

    .line 760
    check-cast v14, Ljava/lang/String;

    .line 761
    .line 762
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 763
    .line 764
    .line 765
    move-result v2

    .line 766
    invoke-virtual {v0, v2, v1}, Lad/a;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 767
    .line 768
    .line 769
    move-result-object v2

    .line 770
    move-object v15, v2

    .line 771
    check-cast v15, Ljava/lang/String;

    .line 772
    .line 773
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 774
    .line 775
    .line 776
    move-result v2

    .line 777
    invoke-virtual {v0, v2, v1}, Lad/a;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 778
    .line 779
    .line 780
    move-result-object v1

    .line 781
    move-object/from16 v16, v1

    .line 782
    .line 783
    check-cast v16, Ljava/lang/String;

    .line 784
    .line 785
    invoke-direct/range {v6 .. v16}, Lad/e;-><init>(Ljava/lang/String;JLjava/lang/String;Ljava/util/Map;Lad/d;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 786
    .line 787
    .line 788
    return-object v6

    .line 789
    :pswitch_e
    new-instance v7, Lad/h;

    .line 790
    .line 791
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 792
    .line 793
    .line 794
    move-result v2

    .line 795
    invoke-virtual {v0, v2, v1}, Lad/a;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 796
    .line 797
    .line 798
    move-result-object v2

    .line 799
    move-object v8, v2

    .line 800
    check-cast v8, Ljava/lang/String;

    .line 801
    .line 802
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 803
    .line 804
    .line 805
    move-result v2

    .line 806
    invoke-virtual {v0, v2, v1}, Lad/a;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 807
    .line 808
    .line 809
    move-result-object v2

    .line 810
    move-object v9, v2

    .line 811
    check-cast v9, Ljava/lang/String;

    .line 812
    .line 813
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 814
    .line 815
    .line 816
    move-result v2

    .line 817
    invoke-virtual {v0, v2, v1}, Lad/a;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 818
    .line 819
    .line 820
    move-result-object v2

    .line 821
    move-object v10, v2

    .line 822
    check-cast v10, Ljava/util/List;

    .line 823
    .line 824
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 825
    .line 826
    .line 827
    move-result v2

    .line 828
    invoke-virtual {v0, v2, v1}, Lad/a;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 829
    .line 830
    .line 831
    move-result-object v2

    .line 832
    move-object v11, v2

    .line 833
    check-cast v11, Lad/e;

    .line 834
    .line 835
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 836
    .line 837
    .line 838
    move-result v2

    .line 839
    invoke-virtual {v0, v2, v1}, Lad/a;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 840
    .line 841
    .line 842
    move-result-object v1

    .line 843
    move-object v12, v1

    .line 844
    check-cast v12, Ljava/util/Map;

    .line 845
    .line 846
    invoke-direct/range {v7 .. v12}, Lad/h;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lad/e;Ljava/util/Map;)V

    .line 847
    .line 848
    .line 849
    return-object v7

    .line 850
    :pswitch_f
    new-instance v2, Lad/d;

    .line 851
    .line 852
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 853
    .line 854
    .line 855
    move-result v3

    .line 856
    invoke-virtual {v0, v3, v1}, Lad/a;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 857
    .line 858
    .line 859
    move-result-object v3

    .line 860
    check-cast v3, Ljava/lang/Integer;

    .line 861
    .line 862
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 863
    .line 864
    .line 865
    move-result v3

    .line 866
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 867
    .line 868
    .line 869
    move-result v4

    .line 870
    invoke-virtual {v0, v4, v1}, Lad/a;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 871
    .line 872
    .line 873
    move-result-object v4

    .line 874
    check-cast v4, Ljava/lang/String;

    .line 875
    .line 876
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 877
    .line 878
    .line 879
    move-result v5

    .line 880
    invoke-virtual {v0, v5, v1}, Lad/a;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 881
    .line 882
    .line 883
    move-result-object v1

    .line 884
    check-cast v1, Ljava/lang/String;

    .line 885
    .line 886
    invoke-direct {v2, v3, v4, v1}, Lad/d;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 887
    .line 888
    .line 889
    return-object v2

    .line 890
    :pswitch_10
    new-instance v2, Lad/U;

    .line 891
    .line 892
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 893
    .line 894
    .line 895
    move-result v3

    .line 896
    invoke-virtual {v0, v3, v1}, Lad/a;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 897
    .line 898
    .line 899
    move-result-object v3

    .line 900
    check-cast v3, Ljava/lang/String;

    .line 901
    .line 902
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 903
    .line 904
    .line 905
    move-result v4

    .line 906
    invoke-virtual {v0, v4, v1}, Lad/a;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 907
    .line 908
    .line 909
    move-result-object v1

    .line 910
    check-cast v1, Ljava/lang/String;

    .line 911
    .line 912
    invoke-direct {v2, v3, v1}, Lad/U;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 913
    .line 914
    .line 915
    return-object v2

    .line 916
    :pswitch_11
    new-instance v2, Lad/F;

    .line 917
    .line 918
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 919
    .line 920
    .line 921
    move-result v3

    .line 922
    invoke-virtual {v0, v3, v1}, Lad/a;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 923
    .line 924
    .line 925
    move-result-object v1

    .line 926
    check-cast v1, Ljava/util/Map;

    .line 927
    .line 928
    invoke-direct {v2, v1}, Lad/F;-><init>(Ljava/util/Map;)V

    .line 929
    .line 930
    .line 931
    return-object v2

    .line 932
    :pswitch_12
    new-instance v2, Lad/z;

    .line 933
    .line 934
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 935
    .line 936
    .line 937
    move-result v3

    .line 938
    invoke-virtual {v0, v3, v1}, Lad/a;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 939
    .line 940
    .line 941
    move-result-object v3

    .line 942
    check-cast v3, Lad/y;

    .line 943
    .line 944
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 945
    .line 946
    .line 947
    move-result v4

    .line 948
    invoke-virtual {v0, v4, v1}, Lad/a;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 949
    .line 950
    .line 951
    move-result-object v4

    .line 952
    check-cast v4, Ljava/lang/String;

    .line 953
    .line 954
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 955
    .line 956
    .line 957
    move-result v5

    .line 958
    invoke-virtual {v0, v5, v1}, Lad/a;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 959
    .line 960
    .line 961
    move-result-object v1

    .line 962
    check-cast v1, Ljava/lang/Number;

    .line 963
    .line 964
    invoke-direct {v2, v3, v4, v1}, Lad/z;-><init>(Lad/y;Ljava/lang/String;Ljava/lang/Number;)V

    .line 965
    .line 966
    .line 967
    return-object v2

    .line 968
    :pswitch_13
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 969
    .line 970
    .line 971
    move-result v2

    .line 972
    invoke-virtual {v0, v2, v1}, Lad/a;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 973
    .line 974
    .line 975
    move-result-object v1

    .line 976
    check-cast v1, Ljava/lang/String;

    .line 977
    .line 978
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 979
    .line 980
    .line 981
    const-string v2, "ready"

    .line 982
    .line 983
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 984
    .line 985
    .line 986
    move-result v2

    .line 987
    if-nez v2, :cond_4

    .line 988
    .line 989
    const-string v2, "notReady"

    .line 990
    .line 991
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 992
    .line 993
    .line 994
    move-result v2

    .line 995
    if-eqz v2, :cond_3

    .line 996
    .line 997
    sget-object v1, Lad/y;->a:Lad/y;

    .line 998
    .line 999
    return-object v1

    .line 1000
    :cond_3
    const-string v2, "Unable to handle state: "

    .line 1001
    .line 1002
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1003
    .line 1004
    .line 1005
    move-result-object v1

    .line 1006
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 1007
    .line 1008
    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 1009
    .line 1010
    .line 1011
    throw v2

    .line 1012
    :cond_4
    sget-object v1, Lad/y;->b:Lad/y;

    .line 1013
    .line 1014
    return-object v1

    .line 1015
    :pswitch_14
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 1016
    .line 1017
    .line 1018
    move-result v2

    .line 1019
    invoke-virtual {v0, v2, v1}, Lad/a;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 1020
    .line 1021
    .line 1022
    move-result-object v2

    .line 1023
    move-object v5, v2

    .line 1024
    check-cast v5, Ljava/util/List;

    .line 1025
    .line 1026
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 1027
    .line 1028
    .line 1029
    move-result v2

    .line 1030
    invoke-virtual {v0, v2, v1}, Lad/a;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 1031
    .line 1032
    .line 1033
    move-result-object v2

    .line 1034
    move-object v6, v2

    .line 1035
    check-cast v6, Ljava/lang/String;

    .line 1036
    .line 1037
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 1038
    .line 1039
    .line 1040
    move-result v2

    .line 1041
    invoke-virtual {v0, v2, v1}, Lad/a;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 1042
    .line 1043
    .line 1044
    move-result-object v2

    .line 1045
    move-object v7, v2

    .line 1046
    check-cast v7, Ljava/util/Map;

    .line 1047
    .line 1048
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 1049
    .line 1050
    .line 1051
    move-result v2

    .line 1052
    invoke-virtual {v0, v2, v1}, Lad/a;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 1053
    .line 1054
    .line 1055
    move-result-object v2

    .line 1056
    move-object v8, v2

    .line 1057
    check-cast v8, Ljava/util/Map;

    .line 1058
    .line 1059
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 1060
    .line 1061
    .line 1062
    move-result v2

    .line 1063
    invoke-virtual {v0, v2, v1}, Lad/a;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 1064
    .line 1065
    .line 1066
    move-result-object v2

    .line 1067
    move-object v9, v2

    .line 1068
    check-cast v9, Ljava/lang/Boolean;

    .line 1069
    .line 1070
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 1071
    .line 1072
    .line 1073
    move-result v2

    .line 1074
    invoke-virtual {v0, v2, v1}, Lad/a;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 1075
    .line 1076
    .line 1077
    move-result-object v2

    .line 1078
    move-object v10, v2

    .line 1079
    check-cast v10, Ljava/util/List;

    .line 1080
    .line 1081
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 1082
    .line 1083
    .line 1084
    move-result v2

    .line 1085
    invoke-virtual {v0, v2, v1}, Lad/a;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 1086
    .line 1087
    .line 1088
    move-result-object v2

    .line 1089
    move-object v11, v2

    .line 1090
    check-cast v11, Ljava/lang/Integer;

    .line 1091
    .line 1092
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 1093
    .line 1094
    .line 1095
    move-result v2

    .line 1096
    invoke-virtual {v0, v2, v1}, Lad/a;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 1097
    .line 1098
    .line 1099
    move-result-object v2

    .line 1100
    move-object v12, v2

    .line 1101
    check-cast v12, Ljava/lang/String;

    .line 1102
    .line 1103
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 1104
    .line 1105
    .line 1106
    move-result v2

    .line 1107
    invoke-virtual {v0, v2, v1}, Lad/a;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 1108
    .line 1109
    .line 1110
    move-result-object v2

    .line 1111
    move-object v13, v2

    .line 1112
    check-cast v13, Ljava/lang/String;

    .line 1113
    .line 1114
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 1115
    .line 1116
    .line 1117
    move-result v2

    .line 1118
    invoke-virtual {v0, v2, v1}, Lad/a;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 1119
    .line 1120
    .line 1121
    move-result-object v2

    .line 1122
    move-object v14, v2

    .line 1123
    check-cast v14, Ljava/util/Map;

    .line 1124
    .line 1125
    invoke-virtual {v3}, LY1/t;->a()Ljava/lang/String;

    .line 1126
    .line 1127
    .line 1128
    move-result-object v15

    .line 1129
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 1130
    .line 1131
    .line 1132
    move-result v2

    .line 1133
    invoke-virtual {v0, v2, v1}, Lad/a;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 1134
    .line 1135
    .line 1136
    move-result-object v1

    .line 1137
    move-object/from16 v16, v1

    .line 1138
    .line 1139
    check-cast v16, Ljava/util/List;

    .line 1140
    .line 1141
    new-instance v4, Lad/l;

    .line 1142
    .line 1143
    invoke-direct/range {v4 .. v16}, Lad/l;-><init>(Ljava/util/List;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/util/List;)V

    .line 1144
    .line 1145
    .line 1146
    return-object v4

    .line 1147
    :pswitch_15
    new-instance v2, Lad/f;

    .line 1148
    .line 1149
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 1150
    .line 1151
    .line 1152
    move-result v3

    .line 1153
    invoke-virtual {v0, v3, v1}, Lad/a;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 1154
    .line 1155
    .line 1156
    move-result-object v3

    .line 1157
    check-cast v3, Ljava/lang/Integer;

    .line 1158
    .line 1159
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 1160
    .line 1161
    .line 1162
    move-result v3

    .line 1163
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 1164
    .line 1165
    .line 1166
    move-result v4

    .line 1167
    invoke-virtual {v0, v4, v1}, Lad/a;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 1168
    .line 1169
    .line 1170
    move-result-object v4

    .line 1171
    check-cast v4, Ljava/lang/String;

    .line 1172
    .line 1173
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 1174
    .line 1175
    .line 1176
    move-result v5

    .line 1177
    invoke-virtual {v0, v5, v1}, Lad/a;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 1178
    .line 1179
    .line 1180
    move-result-object v5

    .line 1181
    check-cast v5, Ljava/lang/String;

    .line 1182
    .line 1183
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 1184
    .line 1185
    .line 1186
    move-result v6

    .line 1187
    invoke-virtual {v0, v6, v1}, Lad/a;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 1188
    .line 1189
    .line 1190
    move-result-object v1

    .line 1191
    check-cast v1, Lad/h;

    .line 1192
    .line 1193
    invoke-direct {v2, v3, v4, v5, v1}, Lad/f;-><init>(ILjava/lang/String;Ljava/lang/String;Lad/h;)V

    .line 1194
    .line 1195
    .line 1196
    return-object v2

    .line 1197
    :pswitch_16
    new-instance v2, Lad/P;

    .line 1198
    .line 1199
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 1200
    .line 1201
    .line 1202
    move-result v3

    .line 1203
    invoke-virtual {v0, v3, v1}, Lad/a;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 1204
    .line 1205
    .line 1206
    move-result-object v3

    .line 1207
    check-cast v3, Ljava/lang/Integer;

    .line 1208
    .line 1209
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 1210
    .line 1211
    .line 1212
    move-result v4

    .line 1213
    invoke-virtual {v0, v4, v1}, Lad/a;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 1214
    .line 1215
    .line 1216
    move-result-object v1

    .line 1217
    check-cast v1, Ljava/lang/String;

    .line 1218
    .line 1219
    invoke-direct {v2, v3, v1}, Lad/P;-><init>(Ljava/lang/Integer;Ljava/lang/String;)V

    .line 1220
    .line 1221
    .line 1222
    return-object v2

    .line 1223
    :pswitch_17
    new-instance v1, Lad/t;

    .line 1224
    .line 1225
    sget-object v2, Lcom/google/android/gms/ads/AdSize;->m:Lcom/google/android/gms/ads/AdSize;

    .line 1226
    .line 1227
    invoke-direct {v1, v2}, Lad/w;-><init>(Lcom/google/android/gms/ads/AdSize;)V

    .line 1228
    .line 1229
    .line 1230
    return-object v1

    .line 1231
    :pswitch_18
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 1232
    .line 1233
    .line 1234
    move-result v2

    .line 1235
    invoke-virtual {v0, v2, v1}, Lad/a;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 1236
    .line 1237
    .line 1238
    move-result-object v2

    .line 1239
    move-object v6, v2

    .line 1240
    check-cast v6, Ljava/util/List;

    .line 1241
    .line 1242
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 1243
    .line 1244
    .line 1245
    move-result v2

    .line 1246
    invoke-virtual {v0, v2, v1}, Lad/a;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 1247
    .line 1248
    .line 1249
    move-result-object v2

    .line 1250
    move-object v7, v2

    .line 1251
    check-cast v7, Ljava/lang/String;

    .line 1252
    .line 1253
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 1254
    .line 1255
    .line 1256
    move-result v2

    .line 1257
    invoke-virtual {v0, v2, v1}, Lad/a;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 1258
    .line 1259
    .line 1260
    move-result-object v2

    .line 1261
    if-nez v2, :cond_5

    .line 1262
    .line 1263
    :goto_1
    move-object v8, v4

    .line 1264
    goto :goto_2

    .line 1265
    :cond_5
    move-object v4, v2

    .line 1266
    check-cast v4, Ljava/lang/Boolean;

    .line 1267
    .line 1268
    goto :goto_1

    .line 1269
    :goto_2
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 1270
    .line 1271
    .line 1272
    move-result v2

    .line 1273
    invoke-virtual {v0, v2, v1}, Lad/a;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 1274
    .line 1275
    .line 1276
    move-result-object v2

    .line 1277
    move-object v9, v2

    .line 1278
    check-cast v9, Ljava/util/List;

    .line 1279
    .line 1280
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 1281
    .line 1282
    .line 1283
    move-result v2

    .line 1284
    invoke-virtual {v0, v2, v1}, Lad/a;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 1285
    .line 1286
    .line 1287
    move-result-object v2

    .line 1288
    move-object v10, v2

    .line 1289
    check-cast v10, Ljava/lang/Integer;

    .line 1290
    .line 1291
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 1292
    .line 1293
    .line 1294
    move-result v2

    .line 1295
    invoke-virtual {v0, v2, v1}, Lad/a;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 1296
    .line 1297
    .line 1298
    move-result-object v2

    .line 1299
    move-object v11, v2

    .line 1300
    check-cast v11, Ljava/lang/String;

    .line 1301
    .line 1302
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 1303
    .line 1304
    .line 1305
    move-result v2

    .line 1306
    invoke-virtual {v0, v2, v1}, Lad/a;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 1307
    .line 1308
    .line 1309
    move-result-object v2

    .line 1310
    move-object v12, v2

    .line 1311
    check-cast v12, Ljava/util/Map;

    .line 1312
    .line 1313
    invoke-virtual {v3}, LY1/t;->a()Ljava/lang/String;

    .line 1314
    .line 1315
    .line 1316
    move-result-object v13

    .line 1317
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 1318
    .line 1319
    .line 1320
    move-result v2

    .line 1321
    invoke-virtual {v0, v2, v1}, Lad/a;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 1322
    .line 1323
    .line 1324
    move-result-object v1

    .line 1325
    move-object v14, v1

    .line 1326
    check-cast v14, Ljava/util/List;

    .line 1327
    .line 1328
    new-instance v5, Lad/q;

    .line 1329
    .line 1330
    invoke-direct/range {v5 .. v14}, Lad/q;-><init>(Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/util/List;)V

    .line 1331
    .line 1332
    .line 1333
    return-object v5

    .line 1334
    :pswitch_19
    new-instance v2, Lad/w;

    .line 1335
    .line 1336
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 1337
    .line 1338
    .line 1339
    move-result v3

    .line 1340
    invoke-virtual {v0, v3, v1}, Lad/a;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 1341
    .line 1342
    .line 1343
    move-result-object v3

    .line 1344
    check-cast v3, Ljava/lang/Integer;

    .line 1345
    .line 1346
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 1347
    .line 1348
    .line 1349
    move-result v3

    .line 1350
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->get()B

    .line 1351
    .line 1352
    .line 1353
    move-result v4

    .line 1354
    invoke-virtual {v0, v4, v1}, Lad/a;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 1355
    .line 1356
    .line 1357
    move-result-object v1

    .line 1358
    check-cast v1, Ljava/lang/Integer;

    .line 1359
    .line 1360
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1361
    .line 1362
    .line 1363
    move-result v1

    .line 1364
    new-instance v4, Lcom/google/android/gms/ads/AdSize;

    .line 1365
    .line 1366
    invoke-direct {v4, v3, v1}, Lcom/google/android/gms/ads/AdSize;-><init>(II)V

    .line 1367
    .line 1368
    .line 1369
    invoke-direct {v2, v4}, Lad/w;-><init>(Lcom/google/android/gms/ads/AdSize;)V

    .line 1370
    .line 1371
    .line 1372
    return-object v2

    .line 1373
    :pswitch_data_0
    .packed-switch -0x80
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_0
        :pswitch_16
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
        :pswitch_0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public final k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V
    .locals 2

    .line 1
    instance-of v0, p2, Lad/w;

    .line 2
    .line 3
    if-eqz v0, :cond_4

    .line 4
    .line 5
    check-cast p2, Lad/w;

    .line 6
    .line 7
    instance-of v0, p2, Lad/u;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    check-cast p2, Lad/u;

    .line 12
    .line 13
    const/16 v0, -0x6e

    .line 14
    .line 15
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 16
    .line 17
    .line 18
    iget v0, p2, Lad/w;->b:I

    .line 19
    .line 20
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {p0, p1, v0}, Lad/a;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object v0, p2, Lad/u;->e:Ljava/lang/Integer;

    .line 28
    .line 29
    invoke-virtual {p0, p1, v0}, Lad/a;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iget-object p2, p2, Lad/u;->d:Ljava/lang/Integer;

    .line 33
    .line 34
    invoke-virtual {p0, p1, p2}, Lad/a;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_0
    instance-of v0, p2, Lad/s;

    .line 39
    .line 40
    if-eqz v0, :cond_1

    .line 41
    .line 42
    const/16 v0, -0x72

    .line 43
    .line 44
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 45
    .line 46
    .line 47
    check-cast p2, Lad/s;

    .line 48
    .line 49
    iget-object v0, p2, Lad/s;->d:Ljava/lang/String;

    .line 50
    .line 51
    invoke-virtual {p0, p1, v0}, Lad/a;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    iget p2, p2, Lad/w;->b:I

    .line 55
    .line 56
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    invoke-virtual {p0, p1, p2}, Lad/a;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :cond_1
    instance-of v0, p2, Lad/v;

    .line 65
    .line 66
    if-eqz v0, :cond_2

    .line 67
    .line 68
    const/16 p2, -0x71

    .line 69
    .line 70
    invoke-virtual {p1, p2}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    :cond_2
    instance-of v0, p2, Lad/t;

    .line 75
    .line 76
    if-eqz v0, :cond_3

    .line 77
    .line 78
    const/16 p2, -0x7e

    .line 79
    .line 80
    invoke-virtual {p1, p2}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 81
    .line 82
    .line 83
    return-void

    .line 84
    :cond_3
    const/16 v0, -0x80

    .line 85
    .line 86
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 87
    .line 88
    .line 89
    iget v0, p2, Lad/w;->b:I

    .line 90
    .line 91
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-virtual {p0, p1, v0}, Lad/a;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    iget p2, p2, Lad/w;->c:I

    .line 99
    .line 100
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 101
    .line 102
    .line 103
    move-result-object p2

    .line 104
    invoke-virtual {p0, p1, p2}, Lad/a;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    return-void

    .line 108
    :cond_4
    instance-of v0, p2, Lad/l;

    .line 109
    .line 110
    if-eqz v0, :cond_5

    .line 111
    .line 112
    const/16 v0, -0x7a

    .line 113
    .line 114
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 115
    .line 116
    .line 117
    check-cast p2, Lad/l;

    .line 118
    .line 119
    iget-object v0, p2, Lad/q;->a:Ljava/util/List;

    .line 120
    .line 121
    invoke-virtual {p0, p1, v0}, Lad/a;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    iget-object v0, p2, Lad/q;->b:Ljava/lang/String;

    .line 125
    .line 126
    invoke-virtual {p0, p1, v0}, Lad/a;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    iget-object v0, p2, Lad/l;->j:Ljava/util/Map;

    .line 130
    .line 131
    invoke-virtual {p0, p1, v0}, Lad/a;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    iget-object v0, p2, Lad/l;->k:Ljava/util/Map;

    .line 135
    .line 136
    invoke-virtual {p0, p1, v0}, Lad/a;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    iget-object v0, p2, Lad/q;->c:Ljava/lang/Boolean;

    .line 140
    .line 141
    invoke-virtual {p0, p1, v0}, Lad/a;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    iget-object v0, p2, Lad/q;->d:Ljava/util/List;

    .line 145
    .line 146
    invoke-virtual {p0, p1, v0}, Lad/a;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    iget-object v0, p2, Lad/q;->e:Ljava/lang/Integer;

    .line 150
    .line 151
    invoke-virtual {p0, p1, v0}, Lad/a;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    iget-object v0, p2, Lad/l;->l:Ljava/lang/String;

    .line 155
    .line 156
    invoke-virtual {p0, p1, v0}, Lad/a;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    iget-object v0, p2, Lad/q;->f:Ljava/lang/String;

    .line 160
    .line 161
    invoke-virtual {p0, p1, v0}, Lad/a;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    iget-object v0, p2, Lad/q;->g:Ljava/util/Map;

    .line 165
    .line 166
    invoke-virtual {p0, p1, v0}, Lad/a;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 167
    .line 168
    .line 169
    iget-object p2, p2, Lad/q;->i:Ljava/util/List;

    .line 170
    .line 171
    invoke-virtual {p0, p1, p2}, Lad/a;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    return-void

    .line 175
    :cond_5
    instance-of v0, p2, Lad/q;

    .line 176
    .line 177
    if-eqz v0, :cond_6

    .line 178
    .line 179
    const/16 v0, -0x7f

    .line 180
    .line 181
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 182
    .line 183
    .line 184
    check-cast p2, Lad/q;

    .line 185
    .line 186
    iget-object v0, p2, Lad/q;->a:Ljava/util/List;

    .line 187
    .line 188
    invoke-virtual {p0, p1, v0}, Lad/a;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    iget-object v0, p2, Lad/q;->b:Ljava/lang/String;

    .line 192
    .line 193
    invoke-virtual {p0, p1, v0}, Lad/a;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 194
    .line 195
    .line 196
    iget-object v0, p2, Lad/q;->c:Ljava/lang/Boolean;

    .line 197
    .line 198
    invoke-virtual {p0, p1, v0}, Lad/a;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 199
    .line 200
    .line 201
    iget-object v0, p2, Lad/q;->d:Ljava/util/List;

    .line 202
    .line 203
    invoke-virtual {p0, p1, v0}, Lad/a;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 204
    .line 205
    .line 206
    iget-object v0, p2, Lad/q;->e:Ljava/lang/Integer;

    .line 207
    .line 208
    invoke-virtual {p0, p1, v0}, Lad/a;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 209
    .line 210
    .line 211
    iget-object v0, p2, Lad/q;->f:Ljava/lang/String;

    .line 212
    .line 213
    invoke-virtual {p0, p1, v0}, Lad/a;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 214
    .line 215
    .line 216
    iget-object v0, p2, Lad/q;->g:Ljava/util/Map;

    .line 217
    .line 218
    invoke-virtual {p0, p1, v0}, Lad/a;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 219
    .line 220
    .line 221
    iget-object p2, p2, Lad/q;->i:Ljava/util/List;

    .line 222
    .line 223
    invoke-virtual {p0, p1, p2}, Lad/a;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 224
    .line 225
    .line 226
    return-void

    .line 227
    :cond_6
    instance-of v0, p2, Lad/P;

    .line 228
    .line 229
    if-eqz v0, :cond_7

    .line 230
    .line 231
    const/16 v0, -0x7c

    .line 232
    .line 233
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 234
    .line 235
    .line 236
    check-cast p2, Lad/P;

    .line 237
    .line 238
    iget-object v0, p2, Lad/P;->a:Ljava/lang/Integer;

    .line 239
    .line 240
    invoke-virtual {p0, p1, v0}, Lad/a;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 241
    .line 242
    .line 243
    iget-object p2, p2, Lad/P;->b:Ljava/lang/String;

    .line 244
    .line 245
    invoke-virtual {p0, p1, p2}, Lad/a;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 246
    .line 247
    .line 248
    return-void

    .line 249
    :cond_7
    instance-of v0, p2, Lad/e;

    .line 250
    .line 251
    if-eqz v0, :cond_8

    .line 252
    .line 253
    const/16 v0, -0x73

    .line 254
    .line 255
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 256
    .line 257
    .line 258
    check-cast p2, Lad/e;

    .line 259
    .line 260
    iget-object v0, p2, Lad/e;->a:Ljava/lang/String;

    .line 261
    .line 262
    invoke-virtual {p0, p1, v0}, Lad/a;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 263
    .line 264
    .line 265
    iget-wide v0, p2, Lad/e;->b:J

    .line 266
    .line 267
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 268
    .line 269
    .line 270
    move-result-object v0

    .line 271
    invoke-virtual {p0, p1, v0}, Lad/a;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 272
    .line 273
    .line 274
    iget-object v0, p2, Lad/e;->c:Ljava/lang/String;

    .line 275
    .line 276
    invoke-virtual {p0, p1, v0}, Lad/a;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 277
    .line 278
    .line 279
    iget-object v0, p2, Lad/e;->d:Ljava/util/Map;

    .line 280
    .line 281
    invoke-virtual {p0, p1, v0}, Lad/a;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 282
    .line 283
    .line 284
    iget-object v0, p2, Lad/e;->e:Lad/d;

    .line 285
    .line 286
    invoke-virtual {p0, p1, v0}, Lad/a;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 287
    .line 288
    .line 289
    iget-object v0, p2, Lad/e;->f:Ljava/lang/String;

    .line 290
    .line 291
    invoke-virtual {p0, p1, v0}, Lad/a;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 292
    .line 293
    .line 294
    iget-object v0, p2, Lad/e;->g:Ljava/lang/String;

    .line 295
    .line 296
    invoke-virtual {p0, p1, v0}, Lad/a;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 297
    .line 298
    .line 299
    iget-object v0, p2, Lad/e;->h:Ljava/lang/String;

    .line 300
    .line 301
    invoke-virtual {p0, p1, v0}, Lad/a;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 302
    .line 303
    .line 304
    iget-object p2, p2, Lad/e;->i:Ljava/lang/String;

    .line 305
    .line 306
    invoke-virtual {p0, p1, p2}, Lad/a;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 307
    .line 308
    .line 309
    return-void

    .line 310
    :cond_8
    instance-of v0, p2, Lad/h;

    .line 311
    .line 312
    if-eqz v0, :cond_9

    .line 313
    .line 314
    const/16 v0, -0x74

    .line 315
    .line 316
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 317
    .line 318
    .line 319
    check-cast p2, Lad/h;

    .line 320
    .line 321
    iget-object v0, p2, Lad/h;->a:Ljava/lang/String;

    .line 322
    .line 323
    invoke-virtual {p0, p1, v0}, Lad/a;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 324
    .line 325
    .line 326
    iget-object v0, p2, Lad/h;->b:Ljava/lang/String;

    .line 327
    .line 328
    invoke-virtual {p0, p1, v0}, Lad/a;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 329
    .line 330
    .line 331
    iget-object v0, p2, Lad/h;->c:Ljava/util/List;

    .line 332
    .line 333
    invoke-virtual {p0, p1, v0}, Lad/a;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 334
    .line 335
    .line 336
    iget-object v0, p2, Lad/h;->d:Lad/e;

    .line 337
    .line 338
    invoke-virtual {p0, p1, v0}, Lad/a;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 339
    .line 340
    .line 341
    iget-object p2, p2, Lad/h;->e:Ljava/util/Map;

    .line 342
    .line 343
    invoke-virtual {p0, p1, p2}, Lad/a;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 344
    .line 345
    .line 346
    return-void

    .line 347
    :cond_9
    instance-of v0, p2, Lad/f;

    .line 348
    .line 349
    if-eqz v0, :cond_a

    .line 350
    .line 351
    const/16 v0, -0x7b

    .line 352
    .line 353
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 354
    .line 355
    .line 356
    check-cast p2, Lad/f;

    .line 357
    .line 358
    iget v0, p2, Lad/f;->a:I

    .line 359
    .line 360
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 361
    .line 362
    .line 363
    move-result-object v0

    .line 364
    invoke-virtual {p0, p1, v0}, Lad/a;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 365
    .line 366
    .line 367
    iget-object v0, p2, Lad/f;->b:Ljava/lang/String;

    .line 368
    .line 369
    invoke-virtual {p0, p1, v0}, Lad/a;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 370
    .line 371
    .line 372
    iget-object v0, p2, Lad/f;->c:Ljava/lang/String;

    .line 373
    .line 374
    invoke-virtual {p0, p1, v0}, Lad/a;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 375
    .line 376
    .line 377
    iget-object p2, p2, Lad/f;->d:Lad/h;

    .line 378
    .line 379
    invoke-virtual {p0, p1, p2}, Lad/a;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 380
    .line 381
    .line 382
    return-void

    .line 383
    :cond_a
    instance-of v0, p2, Lad/d;

    .line 384
    .line 385
    if-eqz v0, :cond_b

    .line 386
    .line 387
    const/16 v0, -0x75

    .line 388
    .line 389
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 390
    .line 391
    .line 392
    check-cast p2, Lad/d;

    .line 393
    .line 394
    iget v0, p2, Lad/d;->a:I

    .line 395
    .line 396
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 397
    .line 398
    .line 399
    move-result-object v0

    .line 400
    invoke-virtual {p0, p1, v0}, Lad/a;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 401
    .line 402
    .line 403
    iget-object v0, p2, Lad/d;->b:Ljava/lang/String;

    .line 404
    .line 405
    invoke-virtual {p0, p1, v0}, Lad/a;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 406
    .line 407
    .line 408
    iget-object p2, p2, Lad/d;->c:Ljava/lang/String;

    .line 409
    .line 410
    invoke-virtual {p0, p1, p2}, Lad/a;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 411
    .line 412
    .line 413
    return-void

    .line 414
    :cond_b
    instance-of v0, p2, Lad/y;

    .line 415
    .line 416
    if-eqz v0, :cond_e

    .line 417
    .line 418
    const/16 v0, -0x79

    .line 419
    .line 420
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 421
    .line 422
    .line 423
    check-cast p2, Lad/y;

    .line 424
    .line 425
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 426
    .line 427
    .line 428
    move-result v0

    .line 429
    if-eqz v0, :cond_d

    .line 430
    .line 431
    const/4 v1, 0x1

    .line 432
    if-ne v0, v1, :cond_c

    .line 433
    .line 434
    const-string p2, "ready"

    .line 435
    .line 436
    invoke-virtual {p0, p1, p2}, Lad/a;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 437
    .line 438
    .line 439
    return-void

    .line 440
    :cond_c
    new-instance p1, Ljava/lang/StringBuilder;

    .line 441
    .line 442
    const-string v0, "Unable to handle state: "

    .line 443
    .line 444
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 445
    .line 446
    .line 447
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 448
    .line 449
    .line 450
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 451
    .line 452
    .line 453
    move-result-object p1

    .line 454
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 455
    .line 456
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 457
    .line 458
    .line 459
    throw p2

    .line 460
    :cond_d
    const-string p2, "notReady"

    .line 461
    .line 462
    invoke-virtual {p0, p1, p2}, Lad/a;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 463
    .line 464
    .line 465
    return-void

    .line 466
    :cond_e
    instance-of v0, p2, Lad/z;

    .line 467
    .line 468
    if-eqz v0, :cond_f

    .line 469
    .line 470
    const/16 v0, -0x78

    .line 471
    .line 472
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 473
    .line 474
    .line 475
    check-cast p2, Lad/z;

    .line 476
    .line 477
    iget-object v0, p2, Lad/z;->a:Lad/y;

    .line 478
    .line 479
    invoke-virtual {p0, p1, v0}, Lad/a;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 480
    .line 481
    .line 482
    iget-object v0, p2, Lad/z;->b:Ljava/lang/String;

    .line 483
    .line 484
    invoke-virtual {p0, p1, v0}, Lad/a;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 485
    .line 486
    .line 487
    iget-object p2, p2, Lad/z;->c:Ljava/lang/Number;

    .line 488
    .line 489
    invoke-virtual {p0, p1, p2}, Lad/a;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 490
    .line 491
    .line 492
    return-void

    .line 493
    :cond_f
    instance-of v0, p2, Lad/F;

    .line 494
    .line 495
    if-eqz v0, :cond_10

    .line 496
    .line 497
    const/16 v0, -0x77

    .line 498
    .line 499
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 500
    .line 501
    .line 502
    check-cast p2, Lad/F;

    .line 503
    .line 504
    iget-object p2, p2, Lad/F;->a:Ljava/util/Map;

    .line 505
    .line 506
    invoke-virtual {p0, p1, p2}, Lad/a;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 507
    .line 508
    .line 509
    return-void

    .line 510
    :cond_10
    instance-of v0, p2, Lad/U;

    .line 511
    .line 512
    if-eqz v0, :cond_11

    .line 513
    .line 514
    const/16 v0, -0x76

    .line 515
    .line 516
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 517
    .line 518
    .line 519
    check-cast p2, Lad/U;

    .line 520
    .line 521
    iget-object v0, p2, Lad/U;->a:Ljava/lang/String;

    .line 522
    .line 523
    invoke-virtual {p0, p1, v0}, Lad/a;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 524
    .line 525
    .line 526
    iget-object p2, p2, Lad/U;->b:Ljava/lang/String;

    .line 527
    .line 528
    invoke-virtual {p0, p1, p2}, Lad/a;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 529
    .line 530
    .line 531
    return-void

    .line 532
    :cond_11
    instance-of v0, p2, Lad/M;

    .line 533
    .line 534
    if-eqz v0, :cond_12

    .line 535
    .line 536
    const/16 v0, -0x70

    .line 537
    .line 538
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 539
    .line 540
    .line 541
    check-cast p2, Lad/M;

    .line 542
    .line 543
    iget-object v0, p2, Lad/M;->a:Ljava/lang/Integer;

    .line 544
    .line 545
    invoke-virtual {p0, p1, v0}, Lad/a;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 546
    .line 547
    .line 548
    iget-object v0, p2, Lad/M;->b:Ljava/lang/Integer;

    .line 549
    .line 550
    invoke-virtual {p0, p1, v0}, Lad/a;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 551
    .line 552
    .line 553
    iget-object v0, p2, Lad/M;->c:Lad/V;

    .line 554
    .line 555
    invoke-virtual {p0, p1, v0}, Lad/a;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 556
    .line 557
    .line 558
    iget-object v0, p2, Lad/M;->d:Ljava/lang/Boolean;

    .line 559
    .line 560
    invoke-virtual {p0, p1, v0}, Lad/a;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 561
    .line 562
    .line 563
    iget-object v0, p2, Lad/M;->e:Ljava/lang/Boolean;

    .line 564
    .line 565
    invoke-virtual {p0, p1, v0}, Lad/a;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 566
    .line 567
    .line 568
    iget-object p2, p2, Lad/M;->f:Ljava/lang/Boolean;

    .line 569
    .line 570
    invoke-virtual {p0, p1, p2}, Lad/a;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 571
    .line 572
    .line 573
    return-void

    .line 574
    :cond_12
    instance-of v0, p2, Lx6/s;

    .line 575
    .line 576
    if-eqz v0, :cond_14

    .line 577
    .line 578
    const/16 v0, -0x6c

    .line 579
    .line 580
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 581
    .line 582
    .line 583
    check-cast p2, Lx6/s;

    .line 584
    .line 585
    iget-object v0, p2, Lx6/s;->c:Ljava/lang/String;

    .line 586
    .line 587
    if-nez v0, :cond_13

    .line 588
    .line 589
    const-string v0, ""

    .line 590
    .line 591
    :cond_13
    invoke-virtual {p0, p1, v0}, Lad/a;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 592
    .line 593
    .line 594
    iget v0, p2, Lx6/s;->a:I

    .line 595
    .line 596
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 597
    .line 598
    .line 599
    move-result-object v0

    .line 600
    invoke-virtual {p0, p1, v0}, Lad/a;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 601
    .line 602
    .line 603
    iget v0, p2, Lx6/s;->b:I

    .line 604
    .line 605
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 606
    .line 607
    .line 608
    move-result-object v0

    .line 609
    invoke-virtual {p0, p1, v0}, Lad/a;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 610
    .line 611
    .line 612
    new-instance v0, Ljava/util/ArrayList;

    .line 613
    .line 614
    iget-object p2, p2, Lx6/s;->d:Ljava/util/ArrayList;

    .line 615
    .line 616
    invoke-direct {v0, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 617
    .line 618
    .line 619
    invoke-virtual {p0, p1, v0}, Lad/a;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 620
    .line 621
    .line 622
    return-void

    .line 623
    :cond_14
    instance-of v0, p2, Lad/V;

    .line 624
    .line 625
    if-eqz v0, :cond_15

    .line 626
    .line 627
    const/16 v0, -0x6f

    .line 628
    .line 629
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 630
    .line 631
    .line 632
    check-cast p2, Lad/V;

    .line 633
    .line 634
    iget-object v0, p2, Lad/V;->a:Ljava/lang/Boolean;

    .line 635
    .line 636
    invoke-virtual {p0, p1, v0}, Lad/a;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 637
    .line 638
    .line 639
    iget-object v0, p2, Lad/V;->b:Ljava/lang/Boolean;

    .line 640
    .line 641
    invoke-virtual {p0, p1, v0}, Lad/a;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 642
    .line 643
    .line 644
    iget-object p2, p2, Lad/V;->c:Ljava/lang/Boolean;

    .line 645
    .line 646
    invoke-virtual {p0, p1, p2}, Lad/a;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 647
    .line 648
    .line 649
    return-void

    .line 650
    :cond_15
    instance-of v0, p2, Lbd/b;

    .line 651
    .line 652
    if-eqz v0, :cond_16

    .line 653
    .line 654
    const/16 v0, -0x6b

    .line 655
    .line 656
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 657
    .line 658
    .line 659
    check-cast p2, Lbd/b;

    .line 660
    .line 661
    iget-object v0, p2, Lbd/b;->a:Lbd/d;

    .line 662
    .line 663
    invoke-virtual {p0, p1, v0}, Lad/a;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 664
    .line 665
    .line 666
    iget-object v0, p2, Lbd/b;->b:Landroid/graphics/drawable/ColorDrawable;

    .line 667
    .line 668
    invoke-virtual {p0, p1, v0}, Lad/a;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 669
    .line 670
    .line 671
    iget-object v0, p2, Lbd/b;->c:Lbd/c;

    .line 672
    .line 673
    invoke-virtual {p0, p1, v0}, Lad/a;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 674
    .line 675
    .line 676
    iget-object v0, p2, Lbd/b;->d:Lbd/c;

    .line 677
    .line 678
    invoke-virtual {p0, p1, v0}, Lad/a;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 679
    .line 680
    .line 681
    iget-object v0, p2, Lbd/b;->e:Lbd/c;

    .line 682
    .line 683
    invoke-virtual {p0, p1, v0}, Lad/a;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 684
    .line 685
    .line 686
    iget-object p2, p2, Lbd/b;->f:Lbd/c;

    .line 687
    .line 688
    invoke-virtual {p0, p1, p2}, Lad/a;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 689
    .line 690
    .line 691
    return-void

    .line 692
    :cond_16
    instance-of v0, p2, Lbd/a;

    .line 693
    .line 694
    if-eqz v0, :cond_17

    .line 695
    .line 696
    const/16 v0, -0x69

    .line 697
    .line 698
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 699
    .line 700
    .line 701
    check-cast p2, Lbd/a;

    .line 702
    .line 703
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 704
    .line 705
    .line 706
    move-result p2

    .line 707
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 708
    .line 709
    .line 710
    move-result-object p2

    .line 711
    invoke-virtual {p0, p1, p2}, Lad/a;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 712
    .line 713
    .line 714
    return-void

    .line 715
    :cond_17
    instance-of v0, p2, Lbd/d;

    .line 716
    .line 717
    if-eqz v0, :cond_18

    .line 718
    .line 719
    const/16 v0, -0x68

    .line 720
    .line 721
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 722
    .line 723
    .line 724
    check-cast p2, Lbd/d;

    .line 725
    .line 726
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 727
    .line 728
    .line 729
    move-result p2

    .line 730
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 731
    .line 732
    .line 733
    move-result-object p2

    .line 734
    invoke-virtual {p0, p1, p2}, Lad/a;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 735
    .line 736
    .line 737
    return-void

    .line 738
    :cond_18
    instance-of v0, p2, Lbd/c;

    .line 739
    .line 740
    if-eqz v0, :cond_19

    .line 741
    .line 742
    const/16 v0, -0x6a

    .line 743
    .line 744
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 745
    .line 746
    .line 747
    check-cast p2, Lbd/c;

    .line 748
    .line 749
    iget-object v0, p2, Lbd/c;->a:Landroid/graphics/drawable/ColorDrawable;

    .line 750
    .line 751
    invoke-virtual {p0, p1, v0}, Lad/a;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 752
    .line 753
    .line 754
    iget-object v0, p2, Lbd/c;->b:Landroid/graphics/drawable/ColorDrawable;

    .line 755
    .line 756
    invoke-virtual {p0, p1, v0}, Lad/a;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 757
    .line 758
    .line 759
    iget-object v0, p2, Lbd/c;->c:Lbd/a;

    .line 760
    .line 761
    invoke-virtual {p0, p1, v0}, Lad/a;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 762
    .line 763
    .line 764
    invoke-virtual {p2}, Lbd/c;->a()Ljava/lang/Float;

    .line 765
    .line 766
    .line 767
    move-result-object p2

    .line 768
    invoke-virtual {p0, p1, p2}, Lad/a;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 769
    .line 770
    .line 771
    return-void

    .line 772
    :cond_19
    instance-of v0, p2, Landroid/graphics/drawable/ColorDrawable;

    .line 773
    .line 774
    if-eqz v0, :cond_1a

    .line 775
    .line 776
    const/16 v0, -0x67

    .line 777
    .line 778
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 779
    .line 780
    .line 781
    check-cast p2, Landroid/graphics/drawable/ColorDrawable;

    .line 782
    .line 783
    invoke-virtual {p2}, Landroid/graphics/drawable/ColorDrawable;->getColor()I

    .line 784
    .line 785
    .line 786
    move-result p2

    .line 787
    invoke-static {p2}, Landroid/graphics/Color;->alpha(I)I

    .line 788
    .line 789
    .line 790
    move-result v0

    .line 791
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 792
    .line 793
    .line 794
    move-result-object v0

    .line 795
    invoke-virtual {p0, p1, v0}, Lad/a;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 796
    .line 797
    .line 798
    invoke-static {p2}, Landroid/graphics/Color;->red(I)I

    .line 799
    .line 800
    .line 801
    move-result v0

    .line 802
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 803
    .line 804
    .line 805
    move-result-object v0

    .line 806
    invoke-virtual {p0, p1, v0}, Lad/a;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 807
    .line 808
    .line 809
    invoke-static {p2}, Landroid/graphics/Color;->green(I)I

    .line 810
    .line 811
    .line 812
    move-result v0

    .line 813
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 814
    .line 815
    .line 816
    move-result-object v0

    .line 817
    invoke-virtual {p0, p1, v0}, Lad/a;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 818
    .line 819
    .line 820
    invoke-static {p2}, Landroid/graphics/Color;->blue(I)I

    .line 821
    .line 822
    .line 823
    move-result p2

    .line 824
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 825
    .line 826
    .line 827
    move-result-object p2

    .line 828
    :try_start_0
    invoke-virtual {p0, p1, p2}, Lad/a;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 829
    .line 830
    .line 831
    return-void

    .line 832
    :catchall_0
    move-exception p1

    .line 833
    throw p1

    .line 834
    :cond_1a
    invoke-super {p0, p1, p2}, Luc/w;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 835
    .line 836
    .line 837
    return-void
.end method
