.class public final Lyc/p;
.super Luc/w;
.source "SourceFile"


# static fields
.field public static final d:Lyc/p;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lyc/p;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lyc/p;->d:Lyc/p;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;
    .locals 5

    .line 1
    const/4 v0, 0x4

    .line 2
    const/4 v1, 0x3

    .line 3
    const/4 v2, 0x2

    .line 4
    const/4 v3, 0x1

    .line 5
    const/4 v4, 0x0

    .line 6
    packed-switch p1, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    invoke-super {p0, p1, p2}, Luc/w;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    :pswitch_0
    invoke-virtual {p0, p2}, Luc/w;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Ljava/util/ArrayList;

    .line 19
    .line 20
    new-instance p2, Lyc/y;

    .line 21
    .line 22
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    check-cast v4, Lyc/A;

    .line 30
    .line 31
    if-eqz v4, :cond_1

    .line 32
    .line 33
    iput-object v4, p2, Lyc/y;->a:Lyc/A;

    .line 34
    .line 35
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    check-cast v3, Ljava/lang/Long;

    .line 40
    .line 41
    iput-object v3, p2, Lyc/y;->b:Ljava/lang/Long;

    .line 42
    .line 43
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    check-cast v2, Ljava/lang/Long;

    .line 48
    .line 49
    iput-object v2, p2, Lyc/y;->c:Ljava/lang/Long;

    .line 50
    .line 51
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    check-cast v1, Ljava/lang/Long;

    .line 56
    .line 57
    iput-object v1, p2, Lyc/y;->d:Ljava/lang/Long;

    .line 58
    .line 59
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    check-cast p1, Ljava/lang/Boolean;

    .line 64
    .line 65
    if-eqz p1, :cond_0

    .line 66
    .line 67
    iput-object p1, p2, Lyc/y;->e:Ljava/lang/Boolean;

    .line 68
    .line 69
    return-object p2

    .line 70
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 71
    .line 72
    const-string p2, "Nonnull field \"enableAudio\" is null."

    .line 73
    .line 74
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    throw p1

    .line 78
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 79
    .line 80
    const-string p2, "Nonnull field \"resolutionPreset\" is null."

    .line 81
    .line 82
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    throw p1

    .line 86
    :pswitch_1
    invoke-virtual {p0, p2}, Luc/w;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    check-cast p1, Ljava/util/ArrayList;

    .line 91
    .line 92
    new-instance p2, Lyc/z;

    .line 93
    .line 94
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    check-cast v0, Ljava/lang/Double;

    .line 102
    .line 103
    if-eqz v0, :cond_3

    .line 104
    .line 105
    iput-object v0, p2, Lyc/z;->a:Ljava/lang/Double;

    .line 106
    .line 107
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    check-cast p1, Ljava/lang/Double;

    .line 112
    .line 113
    if-eqz p1, :cond_2

    .line 114
    .line 115
    iput-object p1, p2, Lyc/z;->b:Ljava/lang/Double;

    .line 116
    .line 117
    return-object p2

    .line 118
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 119
    .line 120
    const-string p2, "Nonnull field \"y\" is null."

    .line 121
    .line 122
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    throw p1

    .line 126
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 127
    .line 128
    const-string p2, "Nonnull field \"x\" is null."

    .line 129
    .line 130
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    throw p1

    .line 134
    :pswitch_2
    invoke-virtual {p0, p2}, Luc/w;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    check-cast p1, Ljava/util/ArrayList;

    .line 139
    .line 140
    new-instance p2, Lyc/B;

    .line 141
    .line 142
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 143
    .line 144
    .line 145
    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    check-cast v0, Ljava/lang/Double;

    .line 150
    .line 151
    if-eqz v0, :cond_5

    .line 152
    .line 153
    iput-object v0, p2, Lyc/B;->a:Ljava/lang/Double;

    .line 154
    .line 155
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    check-cast p1, Ljava/lang/Double;

    .line 160
    .line 161
    if-eqz p1, :cond_4

    .line 162
    .line 163
    iput-object p1, p2, Lyc/B;->b:Ljava/lang/Double;

    .line 164
    .line 165
    return-object p2

    .line 166
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 167
    .line 168
    const-string p2, "Nonnull field \"height\" is null."

    .line 169
    .line 170
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    throw p1

    .line 174
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 175
    .line 176
    const-string p2, "Nonnull field \"width\" is null."

    .line 177
    .line 178
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    throw p1

    .line 182
    :pswitch_3
    invoke-virtual {p0, p2}, Luc/w;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    check-cast p1, Ljava/util/ArrayList;

    .line 187
    .line 188
    new-instance p2, Lyc/s;

    .line 189
    .line 190
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 191
    .line 192
    .line 193
    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v4

    .line 197
    check-cast v4, Lyc/B;

    .line 198
    .line 199
    if-eqz v4, :cond_a

    .line 200
    .line 201
    iput-object v4, p2, Lyc/s;->a:Lyc/B;

    .line 202
    .line 203
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v3

    .line 207
    check-cast v3, Lyc/u;

    .line 208
    .line 209
    if-eqz v3, :cond_9

    .line 210
    .line 211
    iput-object v3, p2, Lyc/s;->b:Lyc/u;

    .line 212
    .line 213
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v2

    .line 217
    check-cast v2, Lyc/w;

    .line 218
    .line 219
    if-eqz v2, :cond_8

    .line 220
    .line 221
    iput-object v2, p2, Lyc/s;->c:Lyc/w;

    .line 222
    .line 223
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v1

    .line 227
    check-cast v1, Ljava/lang/Boolean;

    .line 228
    .line 229
    if-eqz v1, :cond_7

    .line 230
    .line 231
    iput-object v1, p2, Lyc/s;->d:Ljava/lang/Boolean;

    .line 232
    .line 233
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object p1

    .line 237
    check-cast p1, Ljava/lang/Boolean;

    .line 238
    .line 239
    if-eqz p1, :cond_6

    .line 240
    .line 241
    iput-object p1, p2, Lyc/s;->e:Ljava/lang/Boolean;

    .line 242
    .line 243
    return-object p2

    .line 244
    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 245
    .line 246
    const-string p2, "Nonnull field \"focusPointSupported\" is null."

    .line 247
    .line 248
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 249
    .line 250
    .line 251
    throw p1

    .line 252
    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 253
    .line 254
    const-string p2, "Nonnull field \"exposurePointSupported\" is null."

    .line 255
    .line 256
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    throw p1

    .line 260
    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 261
    .line 262
    const-string p2, "Nonnull field \"focusMode\" is null."

    .line 263
    .line 264
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    throw p1

    .line 268
    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 269
    .line 270
    const-string p2, "Nonnull field \"exposureMode\" is null."

    .line 271
    .line 272
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 273
    .line 274
    .line 275
    throw p1

    .line 276
    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 277
    .line 278
    const-string p2, "Nonnull field \"previewSize\" is null."

    .line 279
    .line 280
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 281
    .line 282
    .line 283
    throw p1

    .line 284
    :pswitch_4
    invoke-virtual {p0, p2}, Luc/w;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object p1

    .line 288
    check-cast p1, Ljava/util/ArrayList;

    .line 289
    .line 290
    new-instance p2, Lyc/q;

    .line 291
    .line 292
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 293
    .line 294
    .line 295
    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object v0

    .line 299
    check-cast v0, Ljava/lang/String;

    .line 300
    .line 301
    if-eqz v0, :cond_d

    .line 302
    .line 303
    iput-object v0, p2, Lyc/q;->a:Ljava/lang/String;

    .line 304
    .line 305
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 306
    .line 307
    .line 308
    move-result-object v0

    .line 309
    check-cast v0, Lyc/r;

    .line 310
    .line 311
    if-eqz v0, :cond_c

    .line 312
    .line 313
    iput-object v0, p2, Lyc/q;->b:Lyc/r;

    .line 314
    .line 315
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    move-result-object p1

    .line 319
    check-cast p1, Ljava/lang/Long;

    .line 320
    .line 321
    if-eqz p1, :cond_b

    .line 322
    .line 323
    iput-object p1, p2, Lyc/q;->c:Ljava/lang/Long;

    .line 324
    .line 325
    return-object p2

    .line 326
    :cond_b
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 327
    .line 328
    const-string p2, "Nonnull field \"sensorOrientation\" is null."

    .line 329
    .line 330
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 331
    .line 332
    .line 333
    throw p1

    .line 334
    :cond_c
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 335
    .line 336
    const-string p2, "Nonnull field \"lensDirection\" is null."

    .line 337
    .line 338
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 339
    .line 340
    .line 341
    throw p1

    .line 342
    :cond_d
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 343
    .line 344
    const-string p2, "Nonnull field \"name\" is null."

    .line 345
    .line 346
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 347
    .line 348
    .line 349
    throw p1

    .line 350
    :pswitch_5
    invoke-virtual {p0, p2}, Luc/w;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 351
    .line 352
    .line 353
    move-result-object p1

    .line 354
    if-nez p1, :cond_e

    .line 355
    .line 356
    goto/16 :goto_0

    .line 357
    .line 358
    :cond_e
    invoke-static {}, Lyc/v;->values()[Lyc/v;

    .line 359
    .line 360
    .line 361
    move-result-object p2

    .line 362
    check-cast p1, Ljava/lang/Long;

    .line 363
    .line 364
    invoke-virtual {p1}, Ljava/lang/Long;->intValue()I

    .line 365
    .line 366
    .line 367
    move-result p1

    .line 368
    aget-object p1, p2, p1

    .line 369
    .line 370
    return-object p1

    .line 371
    :pswitch_6
    invoke-virtual {p0, p2}, Luc/w;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 372
    .line 373
    .line 374
    move-result-object p1

    .line 375
    if-nez p1, :cond_f

    .line 376
    .line 377
    goto :goto_0

    .line 378
    :cond_f
    invoke-static {}, Lyc/x;->values()[Lyc/x;

    .line 379
    .line 380
    .line 381
    move-result-object p2

    .line 382
    check-cast p1, Ljava/lang/Long;

    .line 383
    .line 384
    invoke-virtual {p1}, Ljava/lang/Long;->intValue()I

    .line 385
    .line 386
    .line 387
    move-result p1

    .line 388
    aget-object p1, p2, p1

    .line 389
    .line 390
    return-object p1

    .line 391
    :pswitch_7
    invoke-virtual {p0, p2}, Luc/w;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 392
    .line 393
    .line 394
    move-result-object p1

    .line 395
    if-nez p1, :cond_10

    .line 396
    .line 397
    goto :goto_0

    .line 398
    :cond_10
    invoke-static {}, Lyc/A;->values()[Lyc/A;

    .line 399
    .line 400
    .line 401
    move-result-object p2

    .line 402
    check-cast p1, Ljava/lang/Long;

    .line 403
    .line 404
    invoke-virtual {p1}, Ljava/lang/Long;->intValue()I

    .line 405
    .line 406
    .line 407
    move-result p1

    .line 408
    aget-object p1, p2, p1

    .line 409
    .line 410
    return-object p1

    .line 411
    :pswitch_8
    invoke-virtual {p0, p2}, Luc/w;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 412
    .line 413
    .line 414
    move-result-object p1

    .line 415
    if-nez p1, :cond_11

    .line 416
    .line 417
    goto :goto_0

    .line 418
    :cond_11
    invoke-static {}, Lyc/w;->values()[Lyc/w;

    .line 419
    .line 420
    .line 421
    move-result-object p2

    .line 422
    check-cast p1, Ljava/lang/Long;

    .line 423
    .line 424
    invoke-virtual {p1}, Ljava/lang/Long;->intValue()I

    .line 425
    .line 426
    .line 427
    move-result p1

    .line 428
    aget-object p1, p2, p1

    .line 429
    .line 430
    return-object p1

    .line 431
    :pswitch_9
    invoke-virtual {p0, p2}, Luc/w;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 432
    .line 433
    .line 434
    move-result-object p1

    .line 435
    if-nez p1, :cond_12

    .line 436
    .line 437
    goto :goto_0

    .line 438
    :cond_12
    invoke-static {}, Lyc/u;->values()[Lyc/u;

    .line 439
    .line 440
    .line 441
    move-result-object p2

    .line 442
    check-cast p1, Ljava/lang/Long;

    .line 443
    .line 444
    invoke-virtual {p1}, Ljava/lang/Long;->intValue()I

    .line 445
    .line 446
    .line 447
    move-result p1

    .line 448
    aget-object p1, p2, p1

    .line 449
    .line 450
    return-object p1

    .line 451
    :pswitch_a
    invoke-virtual {p0, p2}, Luc/w;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 452
    .line 453
    .line 454
    move-result-object p1

    .line 455
    if-nez p1, :cond_13

    .line 456
    .line 457
    goto :goto_0

    .line 458
    :cond_13
    invoke-static {}, Lyc/t;->values()[Lyc/t;

    .line 459
    .line 460
    .line 461
    move-result-object p2

    .line 462
    check-cast p1, Ljava/lang/Long;

    .line 463
    .line 464
    invoke-virtual {p1}, Ljava/lang/Long;->intValue()I

    .line 465
    .line 466
    .line 467
    move-result p1

    .line 468
    aget-object p1, p2, p1

    .line 469
    .line 470
    return-object p1

    .line 471
    :pswitch_b
    invoke-virtual {p0, p2}, Luc/w;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 472
    .line 473
    .line 474
    move-result-object p1

    .line 475
    if-nez p1, :cond_14

    .line 476
    .line 477
    :goto_0
    const/4 p1, 0x0

    .line 478
    return-object p1

    .line 479
    :cond_14
    invoke-static {}, Lyc/r;->values()[Lyc/r;

    .line 480
    .line 481
    .line 482
    move-result-object p2

    .line 483
    check-cast p1, Ljava/lang/Long;

    .line 484
    .line 485
    invoke-virtual {p1}, Ljava/lang/Long;->intValue()I

    .line 486
    .line 487
    .line 488
    move-result p1

    .line 489
    aget-object p1, p2, p1

    .line 490
    .line 491
    return-object p1

    .line 492
    nop

    .line 493
    :pswitch_data_0
    .packed-switch -0x7f
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

.method public final k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V
    .locals 3

    .line 1
    instance-of v0, p2, Lyc/r;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    const/16 v0, 0x81

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 9
    .line 10
    .line 11
    if-nez p2, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    check-cast p2, Lyc/r;

    .line 15
    .line 16
    iget p2, p2, Lyc/r;->a:I

    .line 17
    .line 18
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    :goto_0
    invoke-virtual {p0, p1, v1}, Lyc/p;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_1
    instance-of v0, p2, Lyc/t;

    .line 27
    .line 28
    if-eqz v0, :cond_3

    .line 29
    .line 30
    const/16 v0, 0x82

    .line 31
    .line 32
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 33
    .line 34
    .line 35
    if-nez p2, :cond_2

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_2
    check-cast p2, Lyc/t;

    .line 39
    .line 40
    iget p2, p2, Lyc/t;->a:I

    .line 41
    .line 42
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    :goto_1
    invoke-virtual {p0, p1, v1}, Lyc/p;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :cond_3
    instance-of v0, p2, Lyc/u;

    .line 51
    .line 52
    if-eqz v0, :cond_5

    .line 53
    .line 54
    const/16 v0, 0x83

    .line 55
    .line 56
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 57
    .line 58
    .line 59
    if-nez p2, :cond_4

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_4
    check-cast p2, Lyc/u;

    .line 63
    .line 64
    iget p2, p2, Lyc/u;->a:I

    .line 65
    .line 66
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    :goto_2
    invoke-virtual {p0, p1, v1}, Lyc/p;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    :cond_5
    instance-of v0, p2, Lyc/w;

    .line 75
    .line 76
    if-eqz v0, :cond_7

    .line 77
    .line 78
    const/16 v0, 0x84

    .line 79
    .line 80
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 81
    .line 82
    .line 83
    if-nez p2, :cond_6

    .line 84
    .line 85
    goto :goto_3

    .line 86
    :cond_6
    check-cast p2, Lyc/w;

    .line 87
    .line 88
    iget p2, p2, Lyc/w;->a:I

    .line 89
    .line 90
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    :goto_3
    invoke-virtual {p0, p1, v1}, Lyc/p;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    return-void

    .line 98
    :cond_7
    instance-of v0, p2, Lyc/A;

    .line 99
    .line 100
    if-eqz v0, :cond_9

    .line 101
    .line 102
    const/16 v0, 0x85

    .line 103
    .line 104
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 105
    .line 106
    .line 107
    if-nez p2, :cond_8

    .line 108
    .line 109
    goto :goto_4

    .line 110
    :cond_8
    check-cast p2, Lyc/A;

    .line 111
    .line 112
    iget p2, p2, Lyc/A;->a:I

    .line 113
    .line 114
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    :goto_4
    invoke-virtual {p0, p1, v1}, Lyc/p;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    return-void

    .line 122
    :cond_9
    instance-of v0, p2, Lyc/x;

    .line 123
    .line 124
    if-eqz v0, :cond_b

    .line 125
    .line 126
    const/16 v0, 0x86

    .line 127
    .line 128
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 129
    .line 130
    .line 131
    if-nez p2, :cond_a

    .line 132
    .line 133
    goto :goto_5

    .line 134
    :cond_a
    check-cast p2, Lyc/x;

    .line 135
    .line 136
    iget p2, p2, Lyc/x;->a:I

    .line 137
    .line 138
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    :goto_5
    invoke-virtual {p0, p1, v1}, Lyc/p;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    return-void

    .line 146
    :cond_b
    instance-of v0, p2, Lyc/v;

    .line 147
    .line 148
    if-eqz v0, :cond_d

    .line 149
    .line 150
    const/16 v0, 0x87

    .line 151
    .line 152
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 153
    .line 154
    .line 155
    if-nez p2, :cond_c

    .line 156
    .line 157
    goto :goto_6

    .line 158
    :cond_c
    check-cast p2, Lyc/v;

    .line 159
    .line 160
    iget p2, p2, Lyc/v;->a:I

    .line 161
    .line 162
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    :goto_6
    invoke-virtual {p0, p1, v1}, Lyc/p;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 167
    .line 168
    .line 169
    return-void

    .line 170
    :cond_d
    instance-of v0, p2, Lyc/q;

    .line 171
    .line 172
    if-eqz v0, :cond_e

    .line 173
    .line 174
    const/16 v0, 0x88

    .line 175
    .line 176
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 177
    .line 178
    .line 179
    check-cast p2, Lyc/q;

    .line 180
    .line 181
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 182
    .line 183
    .line 184
    new-instance v0, Ljava/util/ArrayList;

    .line 185
    .line 186
    const/4 v1, 0x3

    .line 187
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 188
    .line 189
    .line 190
    iget-object v1, p2, Lyc/q;->a:Ljava/lang/String;

    .line 191
    .line 192
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    iget-object v1, p2, Lyc/q;->b:Lyc/r;

    .line 196
    .line 197
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    iget-object p2, p2, Lyc/q;->c:Ljava/lang/Long;

    .line 201
    .line 202
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    invoke-virtual {p0, p1, v0}, Lyc/p;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 206
    .line 207
    .line 208
    return-void

    .line 209
    :cond_e
    instance-of v0, p2, Lyc/s;

    .line 210
    .line 211
    const/4 v1, 0x5

    .line 212
    if-eqz v0, :cond_f

    .line 213
    .line 214
    const/16 v0, 0x89

    .line 215
    .line 216
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 217
    .line 218
    .line 219
    check-cast p2, Lyc/s;

    .line 220
    .line 221
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 222
    .line 223
    .line 224
    new-instance v0, Ljava/util/ArrayList;

    .line 225
    .line 226
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 227
    .line 228
    .line 229
    iget-object v1, p2, Lyc/s;->a:Lyc/B;

    .line 230
    .line 231
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 232
    .line 233
    .line 234
    iget-object v1, p2, Lyc/s;->b:Lyc/u;

    .line 235
    .line 236
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 237
    .line 238
    .line 239
    iget-object v1, p2, Lyc/s;->c:Lyc/w;

    .line 240
    .line 241
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 242
    .line 243
    .line 244
    iget-object v1, p2, Lyc/s;->d:Ljava/lang/Boolean;

    .line 245
    .line 246
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 247
    .line 248
    .line 249
    iget-object p2, p2, Lyc/s;->e:Ljava/lang/Boolean;

    .line 250
    .line 251
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 252
    .line 253
    .line 254
    invoke-virtual {p0, p1, v0}, Lyc/p;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 255
    .line 256
    .line 257
    return-void

    .line 258
    :cond_f
    instance-of v0, p2, Lyc/B;

    .line 259
    .line 260
    const/4 v2, 0x2

    .line 261
    if-eqz v0, :cond_10

    .line 262
    .line 263
    const/16 v0, 0x8a

    .line 264
    .line 265
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 266
    .line 267
    .line 268
    check-cast p2, Lyc/B;

    .line 269
    .line 270
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 271
    .line 272
    .line 273
    new-instance v0, Ljava/util/ArrayList;

    .line 274
    .line 275
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 276
    .line 277
    .line 278
    iget-object v1, p2, Lyc/B;->a:Ljava/lang/Double;

    .line 279
    .line 280
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 281
    .line 282
    .line 283
    iget-object p2, p2, Lyc/B;->b:Ljava/lang/Double;

    .line 284
    .line 285
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 286
    .line 287
    .line 288
    invoke-virtual {p0, p1, v0}, Lyc/p;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 289
    .line 290
    .line 291
    return-void

    .line 292
    :cond_10
    instance-of v0, p2, Lyc/z;

    .line 293
    .line 294
    if-eqz v0, :cond_11

    .line 295
    .line 296
    const/16 v0, 0x8b

    .line 297
    .line 298
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 299
    .line 300
    .line 301
    check-cast p2, Lyc/z;

    .line 302
    .line 303
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 304
    .line 305
    .line 306
    new-instance v0, Ljava/util/ArrayList;

    .line 307
    .line 308
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 309
    .line 310
    .line 311
    iget-object v1, p2, Lyc/z;->a:Ljava/lang/Double;

    .line 312
    .line 313
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 314
    .line 315
    .line 316
    iget-object p2, p2, Lyc/z;->b:Ljava/lang/Double;

    .line 317
    .line 318
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 319
    .line 320
    .line 321
    invoke-virtual {p0, p1, v0}, Lyc/p;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 322
    .line 323
    .line 324
    return-void

    .line 325
    :cond_11
    instance-of v0, p2, Lyc/y;

    .line 326
    .line 327
    if-eqz v0, :cond_12

    .line 328
    .line 329
    const/16 v0, 0x8c

    .line 330
    .line 331
    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 332
    .line 333
    .line 334
    check-cast p2, Lyc/y;

    .line 335
    .line 336
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 337
    .line 338
    .line 339
    new-instance v0, Ljava/util/ArrayList;

    .line 340
    .line 341
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 342
    .line 343
    .line 344
    iget-object v1, p2, Lyc/y;->a:Lyc/A;

    .line 345
    .line 346
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 347
    .line 348
    .line 349
    iget-object v1, p2, Lyc/y;->b:Ljava/lang/Long;

    .line 350
    .line 351
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 352
    .line 353
    .line 354
    iget-object v1, p2, Lyc/y;->c:Ljava/lang/Long;

    .line 355
    .line 356
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 357
    .line 358
    .line 359
    iget-object v1, p2, Lyc/y;->d:Ljava/lang/Long;

    .line 360
    .line 361
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 362
    .line 363
    .line 364
    iget-object p2, p2, Lyc/y;->e:Ljava/lang/Boolean;

    .line 365
    .line 366
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 367
    .line 368
    .line 369
    :try_start_0
    invoke-virtual {p0, p1, v0}, Lyc/p;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 370
    .line 371
    .line 372
    return-void

    .line 373
    :catchall_0
    move-exception p1

    .line 374
    throw p1

    .line 375
    :cond_12
    invoke-super {p0, p1, p2}, Luc/w;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 376
    .line 377
    .line 378
    return-void
.end method
