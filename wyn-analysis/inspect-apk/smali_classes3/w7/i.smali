.class public final Lw7/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lw7/i;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 41

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget v2, v1, Lw7/i;->a:I

    .line 6
    .line 7
    packed-switch v2, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    const/4 v3, 0x0

    .line 15
    const/4 v4, 0x0

    .line 16
    move v5, v4

    .line 17
    move-object v4, v3

    .line 18
    :goto_0
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    .line 19
    .line 20
    .line 21
    move-result v6

    .line 22
    if-ge v6, v2, :cond_3

    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 25
    .line 26
    .line 27
    move-result v6

    .line 28
    int-to-char v7, v6

    .line 29
    const/4 v8, 0x1

    .line 30
    if-eq v7, v8, :cond_2

    .line 31
    .line 32
    const/4 v8, 0x2

    .line 33
    if-eq v7, v8, :cond_1

    .line 34
    .line 35
    const/4 v8, 0x4

    .line 36
    if-eq v7, v8, :cond_0

    .line 37
    .line 38
    invoke-static {v6, v0}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    invoke-static {v6, v0}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    goto :goto_0

    .line 47
    :cond_1
    invoke-static {v6, v0}, LU8/v0;->f0(ILandroid/os/Parcel;)I

    .line 48
    .line 49
    .line 50
    move-result v5

    .line 51
    goto :goto_0

    .line 52
    :cond_2
    sget-object v3, Lcom/google/android/gms/internal/location/zzek;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 53
    .line 54
    invoke-static {v0, v6, v3}, LU8/v0;->C(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    goto :goto_0

    .line 59
    :cond_3
    invoke-static {v2, v0}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 60
    .line 61
    .line 62
    new-instance v0, Lx7/j;

    .line 63
    .line 64
    invoke-direct {v0, v5, v4, v3}, Lx7/j;-><init>(ILjava/lang/String;Ljava/util/ArrayList;)V

    .line 65
    .line 66
    .line 67
    return-object v0

    .line 68
    :pswitch_0
    invoke-static {v0}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    const/4 v3, 0x0

    .line 73
    const-wide/16 v4, 0x0

    .line 74
    .line 75
    :goto_1
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    .line 76
    .line 77
    .line 78
    move-result v6

    .line 79
    if-ge v6, v2, :cond_6

    .line 80
    .line 81
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 82
    .line 83
    .line 84
    move-result v6

    .line 85
    int-to-char v7, v6

    .line 86
    const/4 v8, 0x2

    .line 87
    if-eq v7, v8, :cond_5

    .line 88
    .line 89
    const/4 v8, 0x6

    .line 90
    if-eq v7, v8, :cond_4

    .line 91
    .line 92
    invoke-static {v6, v0}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 93
    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_4
    invoke-static {v6, v0}, LU8/v0;->Z(ILandroid/os/Parcel;)Z

    .line 97
    .line 98
    .line 99
    move-result v3

    .line 100
    goto :goto_1

    .line 101
    :cond_5
    invoke-static {v6, v0}, LU8/v0;->h0(ILandroid/os/Parcel;)J

    .line 102
    .line 103
    .line 104
    move-result-wide v4

    .line 105
    goto :goto_1

    .line 106
    :cond_6
    invoke-static {v2, v0}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 107
    .line 108
    .line 109
    new-instance v0, Lx7/g;

    .line 110
    .line 111
    invoke-direct {v0, v4, v5, v3}, Lx7/g;-><init>(JZ)V

    .line 112
    .line 113
    .line 114
    return-object v0

    .line 115
    :pswitch_1
    invoke-static {v0}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 116
    .line 117
    .line 118
    move-result v2

    .line 119
    const/4 v3, 0x0

    .line 120
    const/4 v4, 0x0

    .line 121
    const-wide/16 v5, 0x0

    .line 122
    .line 123
    const/4 v7, 0x0

    .line 124
    move v10, v3

    .line 125
    move v11, v10

    .line 126
    move v15, v11

    .line 127
    move/from16 v16, v15

    .line 128
    .line 129
    move v14, v4

    .line 130
    move-wide v12, v5

    .line 131
    :goto_2
    move-object v9, v7

    .line 132
    :goto_3
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    .line 133
    .line 134
    .line 135
    move-result v3

    .line 136
    if-ge v3, v2, :cond_9

    .line 137
    .line 138
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 139
    .line 140
    .line 141
    move-result v3

    .line 142
    int-to-char v4, v3

    .line 143
    const/4 v5, 0x1

    .line 144
    if-eq v4, v5, :cond_7

    .line 145
    .line 146
    packed-switch v4, :pswitch_data_1

    .line 147
    .line 148
    .line 149
    invoke-static {v3, v0}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 150
    .line 151
    .line 152
    goto :goto_3

    .line 153
    :pswitch_2
    invoke-static {v3, v0}, LU8/v0;->c0(ILandroid/os/Parcel;)F

    .line 154
    .line 155
    .line 156
    move-result v3

    .line 157
    move/from16 v16, v3

    .line 158
    .line 159
    goto :goto_3

    .line 160
    :pswitch_3
    invoke-static {v3, v0}, LU8/v0;->c0(ILandroid/os/Parcel;)F

    .line 161
    .line 162
    .line 163
    move-result v3

    .line 164
    move v15, v3

    .line 165
    goto :goto_3

    .line 166
    :pswitch_4
    const/4 v4, 0x4

    .line 167
    invoke-static {v0, v3, v4}, LU8/v0;->r0(Landroid/os/Parcel;II)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 171
    .line 172
    .line 173
    move-result v3

    .line 174
    int-to-byte v3, v3

    .line 175
    move v14, v3

    .line 176
    goto :goto_3

    .line 177
    :pswitch_5
    invoke-static {v3, v0}, LU8/v0;->h0(ILandroid/os/Parcel;)J

    .line 178
    .line 179
    .line 180
    move-result-wide v3

    .line 181
    move-wide v12, v3

    .line 182
    goto :goto_3

    .line 183
    :pswitch_6
    invoke-static {v3, v0}, LU8/v0;->c0(ILandroid/os/Parcel;)F

    .line 184
    .line 185
    .line 186
    move-result v3

    .line 187
    move v11, v3

    .line 188
    goto :goto_3

    .line 189
    :pswitch_7
    invoke-static {v3, v0}, LU8/v0;->c0(ILandroid/os/Parcel;)F

    .line 190
    .line 191
    .line 192
    move-result v3

    .line 193
    move v10, v3

    .line 194
    goto :goto_3

    .line 195
    :cond_7
    invoke-static {v3, v0}, LU8/v0;->k0(ILandroid/os/Parcel;)I

    .line 196
    .line 197
    .line 198
    move-result v3

    .line 199
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    .line 200
    .line 201
    .line 202
    move-result v4

    .line 203
    if-nez v3, :cond_8

    .line 204
    .line 205
    goto :goto_2

    .line 206
    :cond_8
    invoke-virtual {v0}, Landroid/os/Parcel;->createFloatArray()[F

    .line 207
    .line 208
    .line 209
    move-result-object v5

    .line 210
    add-int/2addr v4, v3

    .line 211
    invoke-virtual {v0, v4}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 212
    .line 213
    .line 214
    move-object v9, v5

    .line 215
    goto :goto_3

    .line 216
    :cond_9
    invoke-static {v2, v0}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 217
    .line 218
    .line 219
    new-instance v8, Lx7/e;

    .line 220
    .line 221
    invoke-direct/range {v8 .. v16}, Lx7/e;-><init>([FFFJBFF)V

    .line 222
    .line 223
    .line 224
    return-object v8

    .line 225
    :pswitch_8
    invoke-static {v0}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 226
    .line 227
    .line 228
    move-result v2

    .line 229
    new-instance v3, Landroid/os/WorkSource;

    .line 230
    .line 231
    invoke-direct {v3}, Landroid/os/WorkSource;-><init>()V

    .line 232
    .line 233
    .line 234
    const/4 v4, 0x0

    .line 235
    const/4 v5, 0x0

    .line 236
    const-wide v6, 0x7fffffffffffffffL

    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    const/16 v8, 0x66

    .line 242
    .line 243
    move-object/from16 v18, v3

    .line 244
    .line 245
    move-object/from16 v19, v4

    .line 246
    .line 247
    move v12, v5

    .line 248
    move/from16 v16, v12

    .line 249
    .line 250
    move/from16 v17, v16

    .line 251
    .line 252
    move-wide v10, v6

    .line 253
    move-wide v14, v10

    .line 254
    move v13, v8

    .line 255
    :goto_4
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    .line 256
    .line 257
    .line 258
    move-result v3

    .line 259
    if-ge v3, v2, :cond_a

    .line 260
    .line 261
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 262
    .line 263
    .line 264
    move-result v3

    .line 265
    int-to-char v4, v3

    .line 266
    packed-switch v4, :pswitch_data_2

    .line 267
    .line 268
    .line 269
    :pswitch_9
    invoke-static {v3, v0}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 270
    .line 271
    .line 272
    goto :goto_4

    .line 273
    :pswitch_a
    sget-object v4, Lcom/google/android/gms/internal/location/zze;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 274
    .line 275
    invoke-static {v0, v3, v4}, LU8/v0;->x(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 276
    .line 277
    .line 278
    move-result-object v3

    .line 279
    check-cast v3, Lcom/google/android/gms/internal/location/zze;

    .line 280
    .line 281
    move-object/from16 v19, v3

    .line 282
    .line 283
    goto :goto_4

    .line 284
    :pswitch_b
    invoke-static {v3, v0}, LU8/v0;->f0(ILandroid/os/Parcel;)I

    .line 285
    .line 286
    .line 287
    move-result v3

    .line 288
    move/from16 v17, v3

    .line 289
    .line 290
    goto :goto_4

    .line 291
    :pswitch_c
    sget-object v4, Landroid/os/WorkSource;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 292
    .line 293
    invoke-static {v0, v3, v4}, LU8/v0;->x(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 294
    .line 295
    .line 296
    move-result-object v3

    .line 297
    check-cast v3, Landroid/os/WorkSource;

    .line 298
    .line 299
    move-object/from16 v18, v3

    .line 300
    .line 301
    goto :goto_4

    .line 302
    :pswitch_d
    invoke-static {v3, v0}, LU8/v0;->Z(ILandroid/os/Parcel;)Z

    .line 303
    .line 304
    .line 305
    move-result v3

    .line 306
    move/from16 v16, v3

    .line 307
    .line 308
    goto :goto_4

    .line 309
    :pswitch_e
    invoke-static {v3, v0}, LU8/v0;->h0(ILandroid/os/Parcel;)J

    .line 310
    .line 311
    .line 312
    move-result-wide v3

    .line 313
    move-wide v14, v3

    .line 314
    goto :goto_4

    .line 315
    :pswitch_f
    invoke-static {v3, v0}, LU8/v0;->f0(ILandroid/os/Parcel;)I

    .line 316
    .line 317
    .line 318
    move-result v3

    .line 319
    move v13, v3

    .line 320
    goto :goto_4

    .line 321
    :pswitch_10
    invoke-static {v3, v0}, LU8/v0;->f0(ILandroid/os/Parcel;)I

    .line 322
    .line 323
    .line 324
    move-result v3

    .line 325
    move v12, v3

    .line 326
    goto :goto_4

    .line 327
    :pswitch_11
    invoke-static {v3, v0}, LU8/v0;->h0(ILandroid/os/Parcel;)J

    .line 328
    .line 329
    .line 330
    move-result-wide v3

    .line 331
    move-wide v10, v3

    .line 332
    goto :goto_4

    .line 333
    :cond_a
    invoke-static {v2, v0}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 334
    .line 335
    .line 336
    new-instance v9, Lx7/d;

    .line 337
    .line 338
    invoke-direct/range {v9 .. v19}, Lx7/d;-><init>(JIIJZILandroid/os/WorkSource;Lcom/google/android/gms/internal/location/zze;)V

    .line 339
    .line 340
    .line 341
    return-object v9

    .line 342
    :pswitch_12
    invoke-static {v0}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 343
    .line 344
    .line 345
    move-result v2

    .line 346
    const/4 v3, 0x0

    .line 347
    move-object v4, v3

    .line 348
    move-object v5, v4

    .line 349
    move-object v6, v5

    .line 350
    :goto_5
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    .line 351
    .line 352
    .line 353
    move-result v7

    .line 354
    if-ge v7, v2, :cond_f

    .line 355
    .line 356
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 357
    .line 358
    .line 359
    move-result v7

    .line 360
    int-to-char v8, v7

    .line 361
    const/4 v9, 0x1

    .line 362
    if-eq v8, v9, :cond_e

    .line 363
    .line 364
    const/4 v9, 0x2

    .line 365
    if-eq v8, v9, :cond_d

    .line 366
    .line 367
    const/4 v9, 0x3

    .line 368
    if-eq v8, v9, :cond_c

    .line 369
    .line 370
    const/4 v9, 0x4

    .line 371
    if-eq v8, v9, :cond_b

    .line 372
    .line 373
    invoke-static {v7, v0}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 374
    .line 375
    .line 376
    goto :goto_5

    .line 377
    :cond_b
    invoke-static {v7, v0}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 378
    .line 379
    .line 380
    move-result-object v6

    .line 381
    goto :goto_5

    .line 382
    :cond_c
    sget-object v5, Lcom/google/android/gms/common/internal/g;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 383
    .line 384
    invoke-static {v0, v7, v5}, LU8/v0;->C(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 385
    .line 386
    .line 387
    move-result-object v5

    .line 388
    goto :goto_5

    .line 389
    :cond_d
    invoke-static {v7, v0}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 390
    .line 391
    .line 392
    move-result-object v4

    .line 393
    goto :goto_5

    .line 394
    :cond_e
    sget-object v3, Lx7/b;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 395
    .line 396
    invoke-static {v0, v7, v3}, LU8/v0;->C(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 397
    .line 398
    .line 399
    move-result-object v3

    .line 400
    goto :goto_5

    .line 401
    :cond_f
    invoke-static {v2, v0}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 402
    .line 403
    .line 404
    new-instance v0, Lx7/c;

    .line 405
    .line 406
    invoke-direct {v0, v3, v4, v5, v6}, Lx7/c;-><init>(Ljava/util/ArrayList;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;)V

    .line 407
    .line 408
    .line 409
    return-object v0

    .line 410
    :pswitch_13
    invoke-static {v0}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 411
    .line 412
    .line 413
    move-result v2

    .line 414
    const/4 v3, 0x0

    .line 415
    move v4, v3

    .line 416
    :goto_6
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    .line 417
    .line 418
    .line 419
    move-result v5

    .line 420
    if-ge v5, v2, :cond_12

    .line 421
    .line 422
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 423
    .line 424
    .line 425
    move-result v5

    .line 426
    int-to-char v6, v5

    .line 427
    const/4 v7, 0x1

    .line 428
    if-eq v6, v7, :cond_11

    .line 429
    .line 430
    const/4 v7, 0x2

    .line 431
    if-eq v6, v7, :cond_10

    .line 432
    .line 433
    invoke-static {v5, v0}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 434
    .line 435
    .line 436
    goto :goto_6

    .line 437
    :cond_10
    invoke-static {v5, v0}, LU8/v0;->f0(ILandroid/os/Parcel;)I

    .line 438
    .line 439
    .line 440
    move-result v4

    .line 441
    goto :goto_6

    .line 442
    :cond_11
    invoke-static {v5, v0}, LU8/v0;->f0(ILandroid/os/Parcel;)I

    .line 443
    .line 444
    .line 445
    move-result v3

    .line 446
    goto :goto_6

    .line 447
    :cond_12
    invoke-static {v2, v0}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 448
    .line 449
    .line 450
    new-instance v0, Lx7/b;

    .line 451
    .line 452
    invoke-direct {v0, v3, v4}, Lx7/b;-><init>(II)V

    .line 453
    .line 454
    .line 455
    return-object v0

    .line 456
    :pswitch_14
    invoke-static {v0}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 457
    .line 458
    .line 459
    move-result v2

    .line 460
    const/4 v3, 0x0

    .line 461
    const-wide/16 v4, 0x0

    .line 462
    .line 463
    const/4 v6, 0x0

    .line 464
    move-object v11, v3

    .line 465
    move-object v12, v11

    .line 466
    move-object v13, v12

    .line 467
    move-object v15, v13

    .line 468
    move-object/from16 v18, v15

    .line 469
    .line 470
    move-wide v8, v4

    .line 471
    move-wide/from16 v16, v8

    .line 472
    .line 473
    move v10, v6

    .line 474
    move v14, v10

    .line 475
    :goto_7
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    .line 476
    .line 477
    .line 478
    move-result v3

    .line 479
    if-ge v3, v2, :cond_13

    .line 480
    .line 481
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 482
    .line 483
    .line 484
    move-result v3

    .line 485
    int-to-char v4, v3

    .line 486
    packed-switch v4, :pswitch_data_3

    .line 487
    .line 488
    .line 489
    invoke-static {v3, v0}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 490
    .line 491
    .line 492
    goto :goto_7

    .line 493
    :pswitch_15
    invoke-static {v3, v0}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 494
    .line 495
    .line 496
    move-result-object v3

    .line 497
    move-object/from16 v18, v3

    .line 498
    .line 499
    goto :goto_7

    .line 500
    :pswitch_16
    invoke-static {v3, v0}, LU8/v0;->h0(ILandroid/os/Parcel;)J

    .line 501
    .line 502
    .line 503
    move-result-wide v3

    .line 504
    move-wide/from16 v16, v3

    .line 505
    .line 506
    goto :goto_7

    .line 507
    :pswitch_17
    invoke-static {v3, v0}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 508
    .line 509
    .line 510
    move-result-object v3

    .line 511
    move-object v15, v3

    .line 512
    goto :goto_7

    .line 513
    :pswitch_18
    invoke-static {v3, v0}, LU8/v0;->Z(ILandroid/os/Parcel;)Z

    .line 514
    .line 515
    .line 516
    move-result v3

    .line 517
    move v14, v3

    .line 518
    goto :goto_7

    .line 519
    :pswitch_19
    invoke-static {v3, v0}, LU8/v0;->t(ILandroid/os/Parcel;)[I

    .line 520
    .line 521
    .line 522
    move-result-object v3

    .line 523
    move-object v13, v3

    .line 524
    goto :goto_7

    .line 525
    :pswitch_1a
    invoke-static {v3, v0}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 526
    .line 527
    .line 528
    move-result-object v3

    .line 529
    move-object v12, v3

    .line 530
    goto :goto_7

    .line 531
    :pswitch_1b
    sget-object v4, Landroid/os/WorkSource;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 532
    .line 533
    invoke-static {v0, v3, v4}, LU8/v0;->x(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 534
    .line 535
    .line 536
    move-result-object v3

    .line 537
    check-cast v3, Landroid/os/WorkSource;

    .line 538
    .line 539
    move-object v11, v3

    .line 540
    goto :goto_7

    .line 541
    :pswitch_1c
    invoke-static {v3, v0}, LU8/v0;->Z(ILandroid/os/Parcel;)Z

    .line 542
    .line 543
    .line 544
    move-result v3

    .line 545
    move v10, v3

    .line 546
    goto :goto_7

    .line 547
    :pswitch_1d
    invoke-static {v3, v0}, LU8/v0;->h0(ILandroid/os/Parcel;)J

    .line 548
    .line 549
    .line 550
    move-result-wide v3

    .line 551
    move-wide v8, v3

    .line 552
    goto :goto_7

    .line 553
    :cond_13
    invoke-static {v2, v0}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 554
    .line 555
    .line 556
    new-instance v7, Lx7/y;

    .line 557
    .line 558
    invoke-direct/range {v7 .. v18}, Lx7/y;-><init>(JZLandroid/os/WorkSource;Ljava/lang/String;[IZLjava/lang/String;JLjava/lang/String;)V

    .line 559
    .line 560
    .line 561
    return-object v7

    .line 562
    :pswitch_1e
    invoke-static {v0}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 563
    .line 564
    .line 565
    move-result v2

    .line 566
    const/4 v3, 0x0

    .line 567
    move v4, v3

    .line 568
    move v5, v4

    .line 569
    move v6, v5

    .line 570
    :goto_8
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    .line 571
    .line 572
    .line 573
    move-result v7

    .line 574
    if-ge v7, v2, :cond_18

    .line 575
    .line 576
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 577
    .line 578
    .line 579
    move-result v7

    .line 580
    int-to-char v8, v7

    .line 581
    const/4 v9, 0x1

    .line 582
    if-eq v8, v9, :cond_17

    .line 583
    .line 584
    const/4 v9, 0x2

    .line 585
    if-eq v8, v9, :cond_16

    .line 586
    .line 587
    const/4 v9, 0x3

    .line 588
    if-eq v8, v9, :cond_15

    .line 589
    .line 590
    const/4 v9, 0x4

    .line 591
    if-eq v8, v9, :cond_14

    .line 592
    .line 593
    invoke-static {v7, v0}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 594
    .line 595
    .line 596
    goto :goto_8

    .line 597
    :cond_14
    invoke-static {v7, v0}, LU8/v0;->f0(ILandroid/os/Parcel;)I

    .line 598
    .line 599
    .line 600
    move-result v6

    .line 601
    goto :goto_8

    .line 602
    :cond_15
    invoke-static {v7, v0}, LU8/v0;->f0(ILandroid/os/Parcel;)I

    .line 603
    .line 604
    .line 605
    move-result v5

    .line 606
    goto :goto_8

    .line 607
    :cond_16
    invoke-static {v7, v0}, LU8/v0;->f0(ILandroid/os/Parcel;)I

    .line 608
    .line 609
    .line 610
    move-result v4

    .line 611
    goto :goto_8

    .line 612
    :cond_17
    invoke-static {v7, v0}, LU8/v0;->f0(ILandroid/os/Parcel;)I

    .line 613
    .line 614
    .line 615
    move-result v3

    .line 616
    goto :goto_8

    .line 617
    :cond_18
    invoke-static {v2, v0}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 618
    .line 619
    .line 620
    new-instance v0, Lx7/x;

    .line 621
    .line 622
    invoke-direct {v0, v3, v4, v5, v6}, Lx7/x;-><init>(IIII)V

    .line 623
    .line 624
    .line 625
    return-object v0

    .line 626
    :pswitch_1f
    invoke-static {v0}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 627
    .line 628
    .line 629
    move-result v2

    .line 630
    const/4 v3, 0x0

    .line 631
    const/4 v4, 0x0

    .line 632
    :goto_9
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    .line 633
    .line 634
    .line 635
    move-result v5

    .line 636
    if-ge v5, v2, :cond_1b

    .line 637
    .line 638
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 639
    .line 640
    .line 641
    move-result v5

    .line 642
    int-to-char v6, v5

    .line 643
    const/4 v7, 0x1

    .line 644
    if-eq v6, v7, :cond_1a

    .line 645
    .line 646
    const/4 v7, 0x2

    .line 647
    if-eq v6, v7, :cond_19

    .line 648
    .line 649
    invoke-static {v5, v0}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 650
    .line 651
    .line 652
    goto :goto_9

    .line 653
    :cond_19
    invoke-static {v5, v0}, LU8/v0;->f0(ILandroid/os/Parcel;)I

    .line 654
    .line 655
    .line 656
    move-result v3

    .line 657
    goto :goto_9

    .line 658
    :cond_1a
    sget-object v4, Lx7/x;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 659
    .line 660
    invoke-static {v0, v5, v4}, LU8/v0;->C(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 661
    .line 662
    .line 663
    move-result-object v4

    .line 664
    goto :goto_9

    .line 665
    :cond_1b
    invoke-static {v2, v0}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 666
    .line 667
    .line 668
    new-instance v0, Lx7/t;

    .line 669
    .line 670
    invoke-direct {v0, v4, v3}, Lx7/t;-><init>(Ljava/util/ArrayList;I)V

    .line 671
    .line 672
    .line 673
    return-object v0

    .line 674
    :pswitch_20
    invoke-static {v0}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 675
    .line 676
    .line 677
    move-result v2

    .line 678
    const-wide/16 v3, -0x1

    .line 679
    .line 680
    const/4 v5, 0x1

    .line 681
    move-wide v9, v3

    .line 682
    move-wide v11, v9

    .line 683
    move v7, v5

    .line 684
    move v8, v7

    .line 685
    :goto_a
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    .line 686
    .line 687
    .line 688
    move-result v3

    .line 689
    if-ge v3, v2, :cond_20

    .line 690
    .line 691
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 692
    .line 693
    .line 694
    move-result v3

    .line 695
    int-to-char v4, v3

    .line 696
    if-eq v4, v5, :cond_1f

    .line 697
    .line 698
    const/4 v6, 0x2

    .line 699
    if-eq v4, v6, :cond_1e

    .line 700
    .line 701
    const/4 v6, 0x3

    .line 702
    if-eq v4, v6, :cond_1d

    .line 703
    .line 704
    const/4 v6, 0x4

    .line 705
    if-eq v4, v6, :cond_1c

    .line 706
    .line 707
    invoke-static {v3, v0}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 708
    .line 709
    .line 710
    goto :goto_a

    .line 711
    :cond_1c
    invoke-static {v3, v0}, LU8/v0;->h0(ILandroid/os/Parcel;)J

    .line 712
    .line 713
    .line 714
    move-result-wide v3

    .line 715
    move-wide v11, v3

    .line 716
    goto :goto_a

    .line 717
    :cond_1d
    invoke-static {v3, v0}, LU8/v0;->h0(ILandroid/os/Parcel;)J

    .line 718
    .line 719
    .line 720
    move-result-wide v3

    .line 721
    move-wide v9, v3

    .line 722
    goto :goto_a

    .line 723
    :cond_1e
    invoke-static {v3, v0}, LU8/v0;->f0(ILandroid/os/Parcel;)I

    .line 724
    .line 725
    .line 726
    move-result v8

    .line 727
    goto :goto_a

    .line 728
    :cond_1f
    invoke-static {v3, v0}, LU8/v0;->f0(ILandroid/os/Parcel;)I

    .line 729
    .line 730
    .line 731
    move-result v7

    .line 732
    goto :goto_a

    .line 733
    :cond_20
    invoke-static {v2, v0}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 734
    .line 735
    .line 736
    new-instance v6, Lx7/w;

    .line 737
    .line 738
    invoke-direct/range {v6 .. v12}, Lx7/w;-><init>(IIJJ)V

    .line 739
    .line 740
    .line 741
    return-object v6

    .line 742
    :pswitch_21
    invoke-static {v0}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 743
    .line 744
    .line 745
    move-result v2

    .line 746
    const/4 v3, 0x0

    .line 747
    move v5, v3

    .line 748
    move v6, v5

    .line 749
    move v7, v6

    .line 750
    move v8, v7

    .line 751
    move v9, v8

    .line 752
    move v10, v9

    .line 753
    :goto_b
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    .line 754
    .line 755
    .line 756
    move-result v3

    .line 757
    if-ge v3, v2, :cond_21

    .line 758
    .line 759
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 760
    .line 761
    .line 762
    move-result v3

    .line 763
    int-to-char v4, v3

    .line 764
    packed-switch v4, :pswitch_data_4

    .line 765
    .line 766
    .line 767
    invoke-static {v3, v0}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 768
    .line 769
    .line 770
    goto :goto_b

    .line 771
    :pswitch_22
    invoke-static {v3, v0}, LU8/v0;->Z(ILandroid/os/Parcel;)Z

    .line 772
    .line 773
    .line 774
    move-result v10

    .line 775
    goto :goto_b

    .line 776
    :pswitch_23
    invoke-static {v3, v0}, LU8/v0;->Z(ILandroid/os/Parcel;)Z

    .line 777
    .line 778
    .line 779
    move-result v9

    .line 780
    goto :goto_b

    .line 781
    :pswitch_24
    invoke-static {v3, v0}, LU8/v0;->Z(ILandroid/os/Parcel;)Z

    .line 782
    .line 783
    .line 784
    move-result v8

    .line 785
    goto :goto_b

    .line 786
    :pswitch_25
    invoke-static {v3, v0}, LU8/v0;->Z(ILandroid/os/Parcel;)Z

    .line 787
    .line 788
    .line 789
    move-result v7

    .line 790
    goto :goto_b

    .line 791
    :pswitch_26
    invoke-static {v3, v0}, LU8/v0;->Z(ILandroid/os/Parcel;)Z

    .line 792
    .line 793
    .line 794
    move-result v6

    .line 795
    goto :goto_b

    .line 796
    :pswitch_27
    invoke-static {v3, v0}, LU8/v0;->Z(ILandroid/os/Parcel;)Z

    .line 797
    .line 798
    .line 799
    move-result v5

    .line 800
    goto :goto_b

    .line 801
    :cond_21
    invoke-static {v2, v0}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 802
    .line 803
    .line 804
    new-instance v4, Lx7/s;

    .line 805
    .line 806
    invoke-direct/range {v4 .. v10}, Lx7/s;-><init>(ZZZZZZ)V

    .line 807
    .line 808
    .line 809
    return-object v4

    .line 810
    :pswitch_28
    invoke-static {v0}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 811
    .line 812
    .line 813
    move-result v2

    .line 814
    const/4 v3, 0x0

    .line 815
    move-object v4, v3

    .line 816
    :goto_c
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    .line 817
    .line 818
    .line 819
    move-result v5

    .line 820
    if-ge v5, v2, :cond_24

    .line 821
    .line 822
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 823
    .line 824
    .line 825
    move-result v5

    .line 826
    int-to-char v6, v5

    .line 827
    const/4 v7, 0x1

    .line 828
    if-eq v6, v7, :cond_23

    .line 829
    .line 830
    const/4 v7, 0x2

    .line 831
    if-eq v6, v7, :cond_22

    .line 832
    .line 833
    invoke-static {v5, v0}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 834
    .line 835
    .line 836
    goto :goto_c

    .line 837
    :cond_22
    sget-object v4, Lx7/s;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 838
    .line 839
    invoke-static {v0, v5, v4}, LU8/v0;->x(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 840
    .line 841
    .line 842
    move-result-object v4

    .line 843
    check-cast v4, Lx7/s;

    .line 844
    .line 845
    goto :goto_c

    .line 846
    :cond_23
    sget-object v3, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 847
    .line 848
    invoke-static {v0, v5, v3}, LU8/v0;->x(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 849
    .line 850
    .line 851
    move-result-object v3

    .line 852
    check-cast v3, Lcom/google/android/gms/common/api/Status;

    .line 853
    .line 854
    goto :goto_c

    .line 855
    :cond_24
    invoke-static {v2, v0}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 856
    .line 857
    .line 858
    new-instance v0, Lx7/r;

    .line 859
    .line 860
    invoke-direct {v0, v3, v4}, Lx7/r;-><init>(Lcom/google/android/gms/common/api/Status;Lx7/s;)V

    .line 861
    .line 862
    .line 863
    return-object v0

    .line 864
    :pswitch_29
    invoke-static {v0}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 865
    .line 866
    .line 867
    move-result v2

    .line 868
    const/4 v3, 0x0

    .line 869
    const/4 v4, 0x0

    .line 870
    move-object v5, v4

    .line 871
    move v4, v3

    .line 872
    :goto_d
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    .line 873
    .line 874
    .line 875
    move-result v6

    .line 876
    if-ge v6, v2, :cond_28

    .line 877
    .line 878
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 879
    .line 880
    .line 881
    move-result v6

    .line 882
    int-to-char v7, v6

    .line 883
    const/4 v8, 0x1

    .line 884
    if-eq v7, v8, :cond_27

    .line 885
    .line 886
    const/4 v8, 0x2

    .line 887
    if-eq v7, v8, :cond_26

    .line 888
    .line 889
    const/4 v8, 0x3

    .line 890
    if-eq v7, v8, :cond_25

    .line 891
    .line 892
    invoke-static {v6, v0}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 893
    .line 894
    .line 895
    goto :goto_d

    .line 896
    :cond_25
    invoke-static {v6, v0}, LU8/v0;->Z(ILandroid/os/Parcel;)Z

    .line 897
    .line 898
    .line 899
    move-result v4

    .line 900
    goto :goto_d

    .line 901
    :cond_26
    invoke-static {v6, v0}, LU8/v0;->Z(ILandroid/os/Parcel;)Z

    .line 902
    .line 903
    .line 904
    move-result v3

    .line 905
    goto :goto_d

    .line 906
    :cond_27
    sget-object v5, Lcom/google/android/gms/location/LocationRequest;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 907
    .line 908
    invoke-static {v0, v6, v5}, LU8/v0;->C(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 909
    .line 910
    .line 911
    move-result-object v5

    .line 912
    goto :goto_d

    .line 913
    :cond_28
    invoke-static {v2, v0}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 914
    .line 915
    .line 916
    new-instance v0, Lx7/p;

    .line 917
    .line 918
    invoke-direct {v0, v5, v3, v4}, Lx7/p;-><init>(Ljava/util/ArrayList;ZZ)V

    .line 919
    .line 920
    .line 921
    return-object v0

    .line 922
    :pswitch_2a
    invoke-static {v0}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 923
    .line 924
    .line 925
    move-result v2

    .line 926
    sget-object v3, Lcom/google/android/gms/location/LocationResult;->b:Ljava/util/List;

    .line 927
    .line 928
    :goto_e
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    .line 929
    .line 930
    .line 931
    move-result v4

    .line 932
    if-ge v4, v2, :cond_2a

    .line 933
    .line 934
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 935
    .line 936
    .line 937
    move-result v4

    .line 938
    int-to-char v5, v4

    .line 939
    const/4 v6, 0x1

    .line 940
    if-eq v5, v6, :cond_29

    .line 941
    .line 942
    invoke-static {v4, v0}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 943
    .line 944
    .line 945
    goto :goto_e

    .line 946
    :cond_29
    sget-object v3, Landroid/location/Location;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 947
    .line 948
    invoke-static {v0, v4, v3}, LU8/v0;->C(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 949
    .line 950
    .line 951
    move-result-object v3

    .line 952
    goto :goto_e

    .line 953
    :cond_2a
    invoke-static {v2, v0}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 954
    .line 955
    .line 956
    new-instance v0, Lcom/google/android/gms/location/LocationResult;

    .line 957
    .line 958
    invoke-direct {v0, v3}, Lcom/google/android/gms/location/LocationResult;-><init>(Ljava/util/List;)V

    .line 959
    .line 960
    .line 961
    return-object v0

    .line 962
    :pswitch_2b
    invoke-static {v0}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 963
    .line 964
    .line 965
    move-result v2

    .line 966
    new-instance v3, Landroid/os/WorkSource;

    .line 967
    .line 968
    invoke-direct {v3}, Landroid/os/WorkSource;-><init>()V

    .line 969
    .line 970
    .line 971
    const/4 v4, 0x0

    .line 972
    const/4 v5, 0x0

    .line 973
    const-wide/16 v6, -0x1

    .line 974
    .line 975
    const/4 v8, 0x0

    .line 976
    const v9, 0x7fffffff

    .line 977
    .line 978
    .line 979
    const-wide v10, 0x7fffffffffffffffL

    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    const-wide/16 v12, 0x0

    .line 985
    .line 986
    const-wide/32 v14, 0x927c0

    .line 987
    .line 988
    .line 989
    const-wide/32 v16, 0x36ee80

    .line 990
    .line 991
    .line 992
    const/16 v18, 0x66

    .line 993
    .line 994
    move-object/from16 v39, v3

    .line 995
    .line 996
    move-object/from16 v40, v4

    .line 997
    .line 998
    move/from16 v33, v5

    .line 999
    .line 1000
    move/from16 v36, v33

    .line 1001
    .line 1002
    move/from16 v37, v36

    .line 1003
    .line 1004
    move/from16 v38, v37

    .line 1005
    .line 1006
    move-wide/from16 v34, v6

    .line 1007
    .line 1008
    move/from16 v32, v8

    .line 1009
    .line 1010
    move/from16 v31, v9

    .line 1011
    .line 1012
    move-wide/from16 v27, v10

    .line 1013
    .line 1014
    move-wide/from16 v29, v27

    .line 1015
    .line 1016
    move-wide/from16 v25, v12

    .line 1017
    .line 1018
    move-wide/from16 v23, v14

    .line 1019
    .line 1020
    move-wide/from16 v21, v16

    .line 1021
    .line 1022
    move/from16 v20, v18

    .line 1023
    .line 1024
    :goto_f
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    .line 1025
    .line 1026
    .line 1027
    move-result v3

    .line 1028
    if-ge v3, v2, :cond_2b

    .line 1029
    .line 1030
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 1031
    .line 1032
    .line 1033
    move-result v3

    .line 1034
    int-to-char v4, v3

    .line 1035
    packed-switch v4, :pswitch_data_5

    .line 1036
    .line 1037
    .line 1038
    :pswitch_2c
    invoke-static {v3, v0}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 1039
    .line 1040
    .line 1041
    goto :goto_f

    .line 1042
    :pswitch_2d
    sget-object v4, Lcom/google/android/gms/internal/location/zze;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1043
    .line 1044
    invoke-static {v0, v3, v4}, LU8/v0;->x(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1045
    .line 1046
    .line 1047
    move-result-object v3

    .line 1048
    check-cast v3, Lcom/google/android/gms/internal/location/zze;

    .line 1049
    .line 1050
    move-object/from16 v40, v3

    .line 1051
    .line 1052
    goto :goto_f

    .line 1053
    :pswitch_2e
    sget-object v4, Landroid/os/WorkSource;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1054
    .line 1055
    invoke-static {v0, v3, v4}, LU8/v0;->x(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1056
    .line 1057
    .line 1058
    move-result-object v3

    .line 1059
    check-cast v3, Landroid/os/WorkSource;

    .line 1060
    .line 1061
    move-object/from16 v39, v3

    .line 1062
    .line 1063
    goto :goto_f

    .line 1064
    :pswitch_2f
    invoke-static {v3, v0}, LU8/v0;->Z(ILandroid/os/Parcel;)Z

    .line 1065
    .line 1066
    .line 1067
    move-result v3

    .line 1068
    move/from16 v38, v3

    .line 1069
    .line 1070
    goto :goto_f

    .line 1071
    :pswitch_30
    invoke-static {v3, v0}, LU8/v0;->f0(ILandroid/os/Parcel;)I

    .line 1072
    .line 1073
    .line 1074
    move-result v3

    .line 1075
    move/from16 v37, v3

    .line 1076
    .line 1077
    goto :goto_f

    .line 1078
    :pswitch_31
    invoke-static {v3, v0}, LU8/v0;->f0(ILandroid/os/Parcel;)I

    .line 1079
    .line 1080
    .line 1081
    move-result v3

    .line 1082
    move/from16 v36, v3

    .line 1083
    .line 1084
    goto :goto_f

    .line 1085
    :pswitch_32
    invoke-static {v3, v0}, LU8/v0;->h0(ILandroid/os/Parcel;)J

    .line 1086
    .line 1087
    .line 1088
    move-result-wide v3

    .line 1089
    move-wide/from16 v34, v3

    .line 1090
    .line 1091
    goto :goto_f

    .line 1092
    :pswitch_33
    invoke-static {v3, v0}, LU8/v0;->h0(ILandroid/os/Parcel;)J

    .line 1093
    .line 1094
    .line 1095
    move-result-wide v3

    .line 1096
    move-wide/from16 v29, v3

    .line 1097
    .line 1098
    goto :goto_f

    .line 1099
    :pswitch_34
    invoke-static {v3, v0}, LU8/v0;->Z(ILandroid/os/Parcel;)Z

    .line 1100
    .line 1101
    .line 1102
    move-result v3

    .line 1103
    move/from16 v33, v3

    .line 1104
    .line 1105
    goto :goto_f

    .line 1106
    :pswitch_35
    invoke-static {v3, v0}, LU8/v0;->h0(ILandroid/os/Parcel;)J

    .line 1107
    .line 1108
    .line 1109
    move-result-wide v3

    .line 1110
    move-wide/from16 v25, v3

    .line 1111
    .line 1112
    goto :goto_f

    .line 1113
    :pswitch_36
    invoke-static {v3, v0}, LU8/v0;->c0(ILandroid/os/Parcel;)F

    .line 1114
    .line 1115
    .line 1116
    move-result v3

    .line 1117
    move/from16 v32, v3

    .line 1118
    .line 1119
    goto :goto_f

    .line 1120
    :pswitch_37
    invoke-static {v3, v0}, LU8/v0;->f0(ILandroid/os/Parcel;)I

    .line 1121
    .line 1122
    .line 1123
    move-result v3

    .line 1124
    move/from16 v31, v3

    .line 1125
    .line 1126
    goto :goto_f

    .line 1127
    :pswitch_38
    invoke-static {v3, v0}, LU8/v0;->h0(ILandroid/os/Parcel;)J

    .line 1128
    .line 1129
    .line 1130
    move-result-wide v3

    .line 1131
    move-wide/from16 v27, v3

    .line 1132
    .line 1133
    goto :goto_f

    .line 1134
    :pswitch_39
    invoke-static {v3, v0}, LU8/v0;->h0(ILandroid/os/Parcel;)J

    .line 1135
    .line 1136
    .line 1137
    move-result-wide v3

    .line 1138
    move-wide/from16 v23, v3

    .line 1139
    .line 1140
    goto :goto_f

    .line 1141
    :pswitch_3a
    invoke-static {v3, v0}, LU8/v0;->h0(ILandroid/os/Parcel;)J

    .line 1142
    .line 1143
    .line 1144
    move-result-wide v3

    .line 1145
    move-wide/from16 v21, v3

    .line 1146
    .line 1147
    goto :goto_f

    .line 1148
    :pswitch_3b
    invoke-static {v3, v0}, LU8/v0;->f0(ILandroid/os/Parcel;)I

    .line 1149
    .line 1150
    .line 1151
    move-result v3

    .line 1152
    move/from16 v20, v3

    .line 1153
    .line 1154
    goto/16 :goto_f

    .line 1155
    .line 1156
    :cond_2b
    invoke-static {v2, v0}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 1157
    .line 1158
    .line 1159
    new-instance v19, Lcom/google/android/gms/location/LocationRequest;

    .line 1160
    .line 1161
    invoke-direct/range {v19 .. v40}, Lcom/google/android/gms/location/LocationRequest;-><init>(IJJJJJIFZJIIZLandroid/os/WorkSource;Lcom/google/android/gms/internal/location/zze;)V

    .line 1162
    .line 1163
    .line 1164
    return-object v19

    .line 1165
    :pswitch_3c
    invoke-static {v0}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 1166
    .line 1167
    .line 1168
    move-result v2

    .line 1169
    const/4 v3, 0x0

    .line 1170
    const/4 v4, 0x0

    .line 1171
    :goto_10
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    .line 1172
    .line 1173
    .line 1174
    move-result v5

    .line 1175
    if-ge v5, v2, :cond_2e

    .line 1176
    .line 1177
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 1178
    .line 1179
    .line 1180
    move-result v5

    .line 1181
    int-to-char v6, v5

    .line 1182
    const/4 v7, 0x1

    .line 1183
    if-eq v6, v7, :cond_2d

    .line 1184
    .line 1185
    const/4 v7, 0x2

    .line 1186
    if-eq v6, v7, :cond_2c

    .line 1187
    .line 1188
    invoke-static {v5, v0}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 1189
    .line 1190
    .line 1191
    goto :goto_10

    .line 1192
    :cond_2c
    sget-object v3, Lcom/google/android/gms/internal/location/zze;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1193
    .line 1194
    invoke-static {v0, v5, v3}, LU8/v0;->x(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1195
    .line 1196
    .line 1197
    move-result-object v3

    .line 1198
    check-cast v3, Lcom/google/android/gms/internal/location/zze;

    .line 1199
    .line 1200
    goto :goto_10

    .line 1201
    :cond_2d
    invoke-static {v5, v0}, LU8/v0;->Z(ILandroid/os/Parcel;)Z

    .line 1202
    .line 1203
    .line 1204
    move-result v4

    .line 1205
    goto :goto_10

    .line 1206
    :cond_2e
    invoke-static {v2, v0}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 1207
    .line 1208
    .line 1209
    new-instance v0, Lx7/u;

    .line 1210
    .line 1211
    invoke-direct {v0, v4, v3}, Lx7/u;-><init>(ZLcom/google/android/gms/internal/location/zze;)V

    .line 1212
    .line 1213
    .line 1214
    return-object v0

    .line 1215
    :pswitch_3d
    invoke-static {v0}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 1216
    .line 1217
    .line 1218
    move-result v2

    .line 1219
    const/4 v3, 0x0

    .line 1220
    const-wide/16 v4, 0x0

    .line 1221
    .line 1222
    const/4 v6, 0x1

    .line 1223
    const/16 v7, 0x3e8

    .line 1224
    .line 1225
    move-object v14, v3

    .line 1226
    move-wide v12, v4

    .line 1227
    move v10, v6

    .line 1228
    move v11, v10

    .line 1229
    move v9, v7

    .line 1230
    :goto_11
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    .line 1231
    .line 1232
    .line 1233
    move-result v3

    .line 1234
    if-ge v3, v2, :cond_2f

    .line 1235
    .line 1236
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 1237
    .line 1238
    .line 1239
    move-result v3

    .line 1240
    int-to-char v4, v3

    .line 1241
    packed-switch v4, :pswitch_data_6

    .line 1242
    .line 1243
    .line 1244
    invoke-static {v3, v0}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 1245
    .line 1246
    .line 1247
    goto :goto_11

    .line 1248
    :pswitch_3e
    invoke-static {v3, v0}, LU8/v0;->Z(ILandroid/os/Parcel;)Z

    .line 1249
    .line 1250
    .line 1251
    goto :goto_11

    .line 1252
    :pswitch_3f
    sget-object v4, Lx7/w;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1253
    .line 1254
    invoke-static {v0, v3, v4}, LU8/v0;->B(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    .line 1255
    .line 1256
    .line 1257
    move-result-object v3

    .line 1258
    check-cast v3, [Lx7/w;

    .line 1259
    .line 1260
    move-object v14, v3

    .line 1261
    goto :goto_11

    .line 1262
    :pswitch_40
    invoke-static {v3, v0}, LU8/v0;->f0(ILandroid/os/Parcel;)I

    .line 1263
    .line 1264
    .line 1265
    move-result v3

    .line 1266
    move v9, v3

    .line 1267
    goto :goto_11

    .line 1268
    :pswitch_41
    invoke-static {v3, v0}, LU8/v0;->h0(ILandroid/os/Parcel;)J

    .line 1269
    .line 1270
    .line 1271
    move-result-wide v3

    .line 1272
    move-wide v12, v3

    .line 1273
    goto :goto_11

    .line 1274
    :pswitch_42
    invoke-static {v3, v0}, LU8/v0;->f0(ILandroid/os/Parcel;)I

    .line 1275
    .line 1276
    .line 1277
    move-result v3

    .line 1278
    move v11, v3

    .line 1279
    goto :goto_11

    .line 1280
    :pswitch_43
    invoke-static {v3, v0}, LU8/v0;->f0(ILandroid/os/Parcel;)I

    .line 1281
    .line 1282
    .line 1283
    move-result v3

    .line 1284
    move v10, v3

    .line 1285
    goto :goto_11

    .line 1286
    :cond_2f
    invoke-static {v2, v0}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 1287
    .line 1288
    .line 1289
    new-instance v8, Lcom/google/android/gms/location/LocationAvailability;

    .line 1290
    .line 1291
    invoke-direct/range {v8 .. v14}, Lcom/google/android/gms/location/LocationAvailability;-><init>(IIIJ[Lx7/w;)V

    .line 1292
    .line 1293
    .line 1294
    return-object v8

    .line 1295
    :pswitch_44
    invoke-static {v0}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 1296
    .line 1297
    .line 1298
    move-result v2

    .line 1299
    const/4 v3, 0x0

    .line 1300
    const/4 v4, 0x0

    .line 1301
    const-wide v5, 0x7fffffffffffffffL

    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    move-object v12, v3

    .line 1307
    move v10, v4

    .line 1308
    move v11, v10

    .line 1309
    move-wide v8, v5

    .line 1310
    :goto_12
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    .line 1311
    .line 1312
    .line 1313
    move-result v3

    .line 1314
    if-ge v3, v2, :cond_34

    .line 1315
    .line 1316
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 1317
    .line 1318
    .line 1319
    move-result v3

    .line 1320
    int-to-char v4, v3

    .line 1321
    const/4 v5, 0x1

    .line 1322
    if-eq v4, v5, :cond_33

    .line 1323
    .line 1324
    const/4 v5, 0x2

    .line 1325
    if-eq v4, v5, :cond_32

    .line 1326
    .line 1327
    const/4 v5, 0x3

    .line 1328
    if-eq v4, v5, :cond_31

    .line 1329
    .line 1330
    const/4 v5, 0x5

    .line 1331
    if-eq v4, v5, :cond_30

    .line 1332
    .line 1333
    invoke-static {v3, v0}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 1334
    .line 1335
    .line 1336
    goto :goto_12

    .line 1337
    :cond_30
    sget-object v4, Lcom/google/android/gms/internal/location/zze;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1338
    .line 1339
    invoke-static {v0, v3, v4}, LU8/v0;->x(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1340
    .line 1341
    .line 1342
    move-result-object v3

    .line 1343
    check-cast v3, Lcom/google/android/gms/internal/location/zze;

    .line 1344
    .line 1345
    move-object v12, v3

    .line 1346
    goto :goto_12

    .line 1347
    :cond_31
    invoke-static {v3, v0}, LU8/v0;->Z(ILandroid/os/Parcel;)Z

    .line 1348
    .line 1349
    .line 1350
    move-result v3

    .line 1351
    move v11, v3

    .line 1352
    goto :goto_12

    .line 1353
    :cond_32
    invoke-static {v3, v0}, LU8/v0;->f0(ILandroid/os/Parcel;)I

    .line 1354
    .line 1355
    .line 1356
    move-result v3

    .line 1357
    move v10, v3

    .line 1358
    goto :goto_12

    .line 1359
    :cond_33
    invoke-static {v3, v0}, LU8/v0;->h0(ILandroid/os/Parcel;)J

    .line 1360
    .line 1361
    .line 1362
    move-result-wide v3

    .line 1363
    move-wide v8, v3

    .line 1364
    goto :goto_12

    .line 1365
    :cond_34
    invoke-static {v2, v0}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 1366
    .line 1367
    .line 1368
    new-instance v7, Lx7/k;

    .line 1369
    .line 1370
    invoke-direct/range {v7 .. v12}, Lx7/k;-><init>(JIZLcom/google/android/gms/internal/location/zze;)V

    .line 1371
    .line 1372
    .line 1373
    return-object v7

    .line 1374
    :pswitch_45
    invoke-static {v0}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 1375
    .line 1376
    .line 1377
    move-result v2

    .line 1378
    const/4 v3, 0x0

    .line 1379
    move-object v5, v3

    .line 1380
    move-object v6, v5

    .line 1381
    move-object v7, v6

    .line 1382
    move-object v8, v7

    .line 1383
    move-object v9, v8

    .line 1384
    move-object v10, v9

    .line 1385
    move-object v11, v10

    .line 1386
    :goto_13
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    .line 1387
    .line 1388
    .line 1389
    move-result v3

    .line 1390
    if-ge v3, v2, :cond_35

    .line 1391
    .line 1392
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 1393
    .line 1394
    .line 1395
    move-result v3

    .line 1396
    int-to-char v4, v3

    .line 1397
    packed-switch v4, :pswitch_data_7

    .line 1398
    .line 1399
    .line 1400
    invoke-static {v3, v0}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 1401
    .line 1402
    .line 1403
    goto :goto_13

    .line 1404
    :pswitch_46
    invoke-static {v3, v0}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1405
    .line 1406
    .line 1407
    move-result-object v11

    .line 1408
    goto :goto_13

    .line 1409
    :pswitch_47
    sget-object v4, Lw7/c;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1410
    .line 1411
    invoke-static {v0, v3, v4}, LU8/v0;->x(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1412
    .line 1413
    .line 1414
    move-result-object v3

    .line 1415
    move-object v10, v3

    .line 1416
    check-cast v10, Lw7/c;

    .line 1417
    .line 1418
    goto :goto_13

    .line 1419
    :pswitch_48
    sget-object v4, Lw7/h;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1420
    .line 1421
    invoke-static {v0, v3, v4}, LU8/v0;->C(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 1422
    .line 1423
    .line 1424
    move-result-object v9

    .line 1425
    goto :goto_13

    .line 1426
    :pswitch_49
    invoke-static {v3, v0}, LU8/v0;->r(ILandroid/os/Parcel;)[B

    .line 1427
    .line 1428
    .line 1429
    move-result-object v8

    .line 1430
    goto :goto_13

    .line 1431
    :pswitch_4a
    sget-object v4, Landroid/net/Uri;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1432
    .line 1433
    invoke-static {v0, v3, v4}, LU8/v0;->x(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1434
    .line 1435
    .line 1436
    move-result-object v3

    .line 1437
    move-object v7, v3

    .line 1438
    check-cast v7, Landroid/net/Uri;

    .line 1439
    .line 1440
    goto :goto_13

    .line 1441
    :pswitch_4b
    invoke-static {v3, v0}, LU8/v0;->b0(ILandroid/os/Parcel;)Ljava/lang/Double;

    .line 1442
    .line 1443
    .line 1444
    move-result-object v6

    .line 1445
    goto :goto_13

    .line 1446
    :pswitch_4c
    invoke-static {v3, v0}, LU8/v0;->g0(ILandroid/os/Parcel;)Ljava/lang/Integer;

    .line 1447
    .line 1448
    .line 1449
    move-result-object v5

    .line 1450
    goto :goto_13

    .line 1451
    :cond_35
    invoke-static {v2, v0}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 1452
    .line 1453
    .line 1454
    new-instance v4, Lcom/google/android/gms/fido/u2f/api/common/SignRequestParams;

    .line 1455
    .line 1456
    invoke-direct/range {v4 .. v11}, Lcom/google/android/gms/fido/u2f/api/common/SignRequestParams;-><init>(Ljava/lang/Integer;Ljava/lang/Double;Landroid/net/Uri;[BLjava/util/ArrayList;Lw7/c;Ljava/lang/String;)V

    .line 1457
    .line 1458
    .line 1459
    return-object v4

    .line 1460
    :pswitch_4d
    invoke-static {v0}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 1461
    .line 1462
    .line 1463
    move-result v2

    .line 1464
    const/4 v3, 0x0

    .line 1465
    move-object v4, v3

    .line 1466
    move-object v5, v4

    .line 1467
    :goto_14
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    .line 1468
    .line 1469
    .line 1470
    move-result v6

    .line 1471
    if-ge v6, v2, :cond_39

    .line 1472
    .line 1473
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 1474
    .line 1475
    .line 1476
    move-result v6

    .line 1477
    int-to-char v7, v6

    .line 1478
    const/4 v8, 0x2

    .line 1479
    if-eq v7, v8, :cond_38

    .line 1480
    .line 1481
    const/4 v8, 0x3

    .line 1482
    if-eq v7, v8, :cond_37

    .line 1483
    .line 1484
    const/4 v8, 0x4

    .line 1485
    if-eq v7, v8, :cond_36

    .line 1486
    .line 1487
    invoke-static {v6, v0}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 1488
    .line 1489
    .line 1490
    goto :goto_14

    .line 1491
    :cond_36
    invoke-static {v6, v0}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1492
    .line 1493
    .line 1494
    move-result-object v5

    .line 1495
    goto :goto_14

    .line 1496
    :cond_37
    invoke-static {v6, v0}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1497
    .line 1498
    .line 1499
    move-result-object v4

    .line 1500
    goto :goto_14

    .line 1501
    :cond_38
    sget-object v3, Lw7/d;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1502
    .line 1503
    invoke-static {v0, v6, v3}, LU8/v0;->x(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1504
    .line 1505
    .line 1506
    move-result-object v3

    .line 1507
    check-cast v3, Lw7/d;

    .line 1508
    .line 1509
    goto :goto_14

    .line 1510
    :cond_39
    invoke-static {v2, v0}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 1511
    .line 1512
    .line 1513
    new-instance v0, Lw7/h;

    .line 1514
    .line 1515
    invoke-direct {v0, v3, v4, v5}, Lw7/h;-><init>(Lw7/d;Ljava/lang/String;Ljava/lang/String;)V

    .line 1516
    .line 1517
    .line 1518
    return-object v0

    .line 1519
    :pswitch_4e
    invoke-static {v0}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 1520
    .line 1521
    .line 1522
    move-result v2

    .line 1523
    const/4 v3, 0x0

    .line 1524
    move-object v5, v3

    .line 1525
    move-object v6, v5

    .line 1526
    move-object v7, v6

    .line 1527
    move-object v8, v7

    .line 1528
    move-object v9, v8

    .line 1529
    move-object v10, v9

    .line 1530
    move-object v11, v10

    .line 1531
    :goto_15
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    .line 1532
    .line 1533
    .line 1534
    move-result v3

    .line 1535
    if-ge v3, v2, :cond_3a

    .line 1536
    .line 1537
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 1538
    .line 1539
    .line 1540
    move-result v3

    .line 1541
    int-to-char v4, v3

    .line 1542
    packed-switch v4, :pswitch_data_8

    .line 1543
    .line 1544
    .line 1545
    invoke-static {v3, v0}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 1546
    .line 1547
    .line 1548
    goto :goto_15

    .line 1549
    :pswitch_4f
    invoke-static {v3, v0}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1550
    .line 1551
    .line 1552
    move-result-object v11

    .line 1553
    goto :goto_15

    .line 1554
    :pswitch_50
    sget-object v4, Lw7/c;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1555
    .line 1556
    invoke-static {v0, v3, v4}, LU8/v0;->x(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1557
    .line 1558
    .line 1559
    move-result-object v3

    .line 1560
    move-object v10, v3

    .line 1561
    check-cast v10, Lw7/c;

    .line 1562
    .line 1563
    goto :goto_15

    .line 1564
    :pswitch_51
    sget-object v4, Lw7/h;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1565
    .line 1566
    invoke-static {v0, v3, v4}, LU8/v0;->C(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 1567
    .line 1568
    .line 1569
    move-result-object v9

    .line 1570
    goto :goto_15

    .line 1571
    :pswitch_52
    sget-object v4, Lw7/g;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1572
    .line 1573
    invoke-static {v0, v3, v4}, LU8/v0;->C(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 1574
    .line 1575
    .line 1576
    move-result-object v8

    .line 1577
    goto :goto_15

    .line 1578
    :pswitch_53
    sget-object v4, Landroid/net/Uri;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1579
    .line 1580
    invoke-static {v0, v3, v4}, LU8/v0;->x(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1581
    .line 1582
    .line 1583
    move-result-object v3

    .line 1584
    move-object v7, v3

    .line 1585
    check-cast v7, Landroid/net/Uri;

    .line 1586
    .line 1587
    goto :goto_15

    .line 1588
    :pswitch_54
    invoke-static {v3, v0}, LU8/v0;->b0(ILandroid/os/Parcel;)Ljava/lang/Double;

    .line 1589
    .line 1590
    .line 1591
    move-result-object v6

    .line 1592
    goto :goto_15

    .line 1593
    :pswitch_55
    invoke-static {v3, v0}, LU8/v0;->g0(ILandroid/os/Parcel;)Ljava/lang/Integer;

    .line 1594
    .line 1595
    .line 1596
    move-result-object v5

    .line 1597
    goto :goto_15

    .line 1598
    :cond_3a
    invoke-static {v2, v0}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 1599
    .line 1600
    .line 1601
    new-instance v4, Lcom/google/android/gms/fido/u2f/api/common/RegisterRequestParams;

    .line 1602
    .line 1603
    invoke-direct/range {v4 .. v11}, Lcom/google/android/gms/fido/u2f/api/common/RegisterRequestParams;-><init>(Ljava/lang/Integer;Ljava/lang/Double;Landroid/net/Uri;Ljava/util/ArrayList;Ljava/util/ArrayList;Lw7/c;Ljava/lang/String;)V

    .line 1604
    .line 1605
    .line 1606
    return-object v4

    .line 1607
    :pswitch_56
    invoke-static {v0}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 1608
    .line 1609
    .line 1610
    move-result v2

    .line 1611
    const/4 v3, 0x0

    .line 1612
    const/4 v4, 0x0

    .line 1613
    move-object v5, v3

    .line 1614
    move v6, v4

    .line 1615
    move-object v4, v5

    .line 1616
    :goto_16
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    .line 1617
    .line 1618
    .line 1619
    move-result v7

    .line 1620
    if-ge v7, v2, :cond_3f

    .line 1621
    .line 1622
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 1623
    .line 1624
    .line 1625
    move-result v7

    .line 1626
    int-to-char v8, v7

    .line 1627
    const/4 v9, 0x1

    .line 1628
    if-eq v8, v9, :cond_3e

    .line 1629
    .line 1630
    const/4 v9, 0x2

    .line 1631
    if-eq v8, v9, :cond_3d

    .line 1632
    .line 1633
    const/4 v9, 0x3

    .line 1634
    if-eq v8, v9, :cond_3c

    .line 1635
    .line 1636
    const/4 v9, 0x4

    .line 1637
    if-eq v8, v9, :cond_3b

    .line 1638
    .line 1639
    invoke-static {v7, v0}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 1640
    .line 1641
    .line 1642
    goto :goto_16

    .line 1643
    :cond_3b
    invoke-static {v7, v0}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1644
    .line 1645
    .line 1646
    move-result-object v5

    .line 1647
    goto :goto_16

    .line 1648
    :cond_3c
    invoke-static {v7, v0}, LU8/v0;->r(ILandroid/os/Parcel;)[B

    .line 1649
    .line 1650
    .line 1651
    move-result-object v4

    .line 1652
    goto :goto_16

    .line 1653
    :cond_3d
    invoke-static {v7, v0}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1654
    .line 1655
    .line 1656
    move-result-object v3

    .line 1657
    goto :goto_16

    .line 1658
    :cond_3e
    invoke-static {v7, v0}, LU8/v0;->f0(ILandroid/os/Parcel;)I

    .line 1659
    .line 1660
    .line 1661
    move-result v6

    .line 1662
    goto :goto_16

    .line 1663
    :cond_3f
    invoke-static {v2, v0}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 1664
    .line 1665
    .line 1666
    new-instance v0, Lw7/g;

    .line 1667
    .line 1668
    invoke-direct {v0, v3, v5, v6, v4}, Lw7/g;-><init>(Ljava/lang/String;Ljava/lang/String;I[B)V

    .line 1669
    .line 1670
    .line 1671
    return-object v0

    .line 1672
    :pswitch_57
    invoke-virtual {v0}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1673
    .line 1674
    .line 1675
    move-result-object v0

    .line 1676
    :try_start_0
    invoke-static {v0}, Lw7/f;->c(Ljava/lang/String;)Lw7/f;

    .line 1677
    .line 1678
    .line 1679
    move-result-object v0
    :try_end_0
    .catch Lw7/e; {:try_start_0 .. :try_end_0} :catch_0

    .line 1680
    return-object v0

    .line 1681
    :catch_0
    move-exception v0

    .line 1682
    new-instance v2, Ljava/lang/RuntimeException;

    .line 1683
    .line 1684
    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 1685
    .line 1686
    .line 1687
    throw v2

    .line 1688
    :pswitch_58
    invoke-static {v0}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 1689
    .line 1690
    .line 1691
    move-result v2

    .line 1692
    const/4 v3, 0x0

    .line 1693
    const/4 v4, 0x0

    .line 1694
    move-object v5, v3

    .line 1695
    move v6, v4

    .line 1696
    move-object v4, v5

    .line 1697
    :goto_17
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    .line 1698
    .line 1699
    .line 1700
    move-result v7

    .line 1701
    if-ge v7, v2, :cond_44

    .line 1702
    .line 1703
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 1704
    .line 1705
    .line 1706
    move-result v7

    .line 1707
    int-to-char v8, v7

    .line 1708
    const/4 v9, 0x1

    .line 1709
    if-eq v8, v9, :cond_43

    .line 1710
    .line 1711
    const/4 v9, 0x2

    .line 1712
    if-eq v8, v9, :cond_42

    .line 1713
    .line 1714
    const/4 v9, 0x3

    .line 1715
    if-eq v8, v9, :cond_41

    .line 1716
    .line 1717
    const/4 v9, 0x4

    .line 1718
    if-eq v8, v9, :cond_40

    .line 1719
    .line 1720
    invoke-static {v7, v0}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 1721
    .line 1722
    .line 1723
    goto :goto_17

    .line 1724
    :cond_40
    sget-object v5, Lcom/google/android/gms/fido/common/Transport;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1725
    .line 1726
    invoke-static {v0, v7, v5}, LU8/v0;->C(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 1727
    .line 1728
    .line 1729
    move-result-object v5

    .line 1730
    goto :goto_17

    .line 1731
    :cond_41
    invoke-static {v7, v0}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1732
    .line 1733
    .line 1734
    move-result-object v4

    .line 1735
    goto :goto_17

    .line 1736
    :cond_42
    invoke-static {v7, v0}, LU8/v0;->r(ILandroid/os/Parcel;)[B

    .line 1737
    .line 1738
    .line 1739
    move-result-object v3

    .line 1740
    goto :goto_17

    .line 1741
    :cond_43
    invoke-static {v7, v0}, LU8/v0;->f0(ILandroid/os/Parcel;)I

    .line 1742
    .line 1743
    .line 1744
    move-result v6

    .line 1745
    goto :goto_17

    .line 1746
    :cond_44
    invoke-static {v2, v0}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 1747
    .line 1748
    .line 1749
    new-instance v0, Lw7/d;

    .line 1750
    .line 1751
    invoke-direct {v0, v6, v4, v5, v3}, Lw7/d;-><init>(ILjava/lang/String;Ljava/util/ArrayList;[B)V

    .line 1752
    .line 1753
    .line 1754
    return-object v0

    .line 1755
    :pswitch_59
    invoke-static {v0}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 1756
    .line 1757
    .line 1758
    move-result v2

    .line 1759
    const/4 v3, 0x0

    .line 1760
    const/4 v4, 0x0

    .line 1761
    move v5, v4

    .line 1762
    move-object v4, v3

    .line 1763
    :goto_18
    invoke-virtual {v0}, Landroid/os/Parcel;->dataPosition()I

    .line 1764
    .line 1765
    .line 1766
    move-result v6

    .line 1767
    if-ge v6, v2, :cond_48

    .line 1768
    .line 1769
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 1770
    .line 1771
    .line 1772
    move-result v6

    .line 1773
    int-to-char v7, v6

    .line 1774
    const/4 v8, 0x2

    .line 1775
    if-eq v7, v8, :cond_47

    .line 1776
    .line 1777
    const/4 v8, 0x3

    .line 1778
    if-eq v7, v8, :cond_46

    .line 1779
    .line 1780
    const/4 v8, 0x4

    .line 1781
    if-eq v7, v8, :cond_45

    .line 1782
    .line 1783
    invoke-static {v6, v0}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 1784
    .line 1785
    .line 1786
    goto :goto_18

    .line 1787
    :cond_45
    invoke-static {v6, v0}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1788
    .line 1789
    .line 1790
    move-result-object v4

    .line 1791
    goto :goto_18

    .line 1792
    :cond_46
    invoke-static {v6, v0}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1793
    .line 1794
    .line 1795
    move-result-object v3

    .line 1796
    goto :goto_18

    .line 1797
    :cond_47
    invoke-static {v6, v0}, LU8/v0;->f0(ILandroid/os/Parcel;)I

    .line 1798
    .line 1799
    .line 1800
    move-result v5

    .line 1801
    goto :goto_18

    .line 1802
    :cond_48
    invoke-static {v2, v0}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 1803
    .line 1804
    .line 1805
    new-instance v0, Lw7/c;

    .line 1806
    .line 1807
    invoke-direct {v0, v5, v3, v4}, Lw7/c;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 1808
    .line 1809
    .line 1810
    return-object v0

    .line 1811
    :pswitch_5a
    invoke-virtual {v0}, Landroid/os/Parcel;->readInt()I

    .line 1812
    .line 1813
    .line 1814
    move-result v0

    .line 1815
    :try_start_1
    invoke-static {v0}, Lw7/c;->V(I)Lw7/a;

    .line 1816
    .line 1817
    .line 1818
    move-result-object v0
    :try_end_1
    .catch Lw7/b; {:try_start_1 .. :try_end_1} :catch_1

    .line 1819
    return-object v0

    .line 1820
    :catch_1
    move-exception v0

    .line 1821
    new-instance v2, Ljava/lang/RuntimeException;

    .line 1822
    .line 1823
    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 1824
    .line 1825
    .line 1826
    throw v2

    .line 1827
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5a
        :pswitch_59
        :pswitch_58
        :pswitch_57
        :pswitch_56
        :pswitch_4e
        :pswitch_4d
        :pswitch_45
        :pswitch_44
        :pswitch_3d
        :pswitch_3c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_8
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    :pswitch_data_1
    .packed-switch 0x4
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
    .end packed-switch

    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_9
        :pswitch_a
    .end packed-switch

    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    :pswitch_data_3
    .packed-switch 0x1
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
    .end packed-switch

    .line 1920
    .line 1921
    .line 1922
    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    .line 1930
    .line 1931
    .line 1932
    .line 1933
    .line 1934
    .line 1935
    .line 1936
    .line 1937
    .line 1938
    .line 1939
    .line 1940
    .line 1941
    :pswitch_data_4
    .packed-switch 0x1
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
    .end packed-switch

    .line 1942
    .line 1943
    .line 1944
    .line 1945
    .line 1946
    .line 1947
    .line 1948
    .line 1949
    .line 1950
    .line 1951
    .line 1952
    .line 1953
    .line 1954
    .line 1955
    .line 1956
    .line 1957
    :pswitch_data_5
    .packed-switch 0x1
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_2c
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2c
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
    .end packed-switch

    .line 1958
    .line 1959
    .line 1960
    .line 1961
    .line 1962
    .line 1963
    .line 1964
    .line 1965
    .line 1966
    .line 1967
    .line 1968
    .line 1969
    .line 1970
    .line 1971
    .line 1972
    .line 1973
    .line 1974
    .line 1975
    .line 1976
    .line 1977
    .line 1978
    .line 1979
    .line 1980
    .line 1981
    .line 1982
    .line 1983
    .line 1984
    .line 1985
    .line 1986
    .line 1987
    .line 1988
    .line 1989
    .line 1990
    .line 1991
    .line 1992
    .line 1993
    .line 1994
    .line 1995
    :pswitch_data_6
    .packed-switch 0x1
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
    .end packed-switch

    .line 1996
    .line 1997
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    .line 2002
    .line 2003
    .line 2004
    .line 2005
    .line 2006
    .line 2007
    .line 2008
    .line 2009
    .line 2010
    .line 2011
    :pswitch_data_7
    .packed-switch 0x2
        :pswitch_4c
        :pswitch_4b
        :pswitch_4a
        :pswitch_49
        :pswitch_48
        :pswitch_47
        :pswitch_46
    .end packed-switch

    .line 2012
    .line 2013
    .line 2014
    .line 2015
    .line 2016
    .line 2017
    .line 2018
    .line 2019
    .line 2020
    .line 2021
    .line 2022
    .line 2023
    .line 2024
    .line 2025
    .line 2026
    .line 2027
    .line 2028
    .line 2029
    :pswitch_data_8
    .packed-switch 0x2
        :pswitch_55
        :pswitch_54
        :pswitch_53
        :pswitch_52
        :pswitch_51
        :pswitch_50
        :pswitch_4f
    .end packed-switch
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lw7/i;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-array p1, p1, [Lx7/j;

    .line 7
    .line 8
    return-object p1

    .line 9
    :pswitch_0
    new-array p1, p1, [Lx7/g;

    .line 10
    .line 11
    return-object p1

    .line 12
    :pswitch_1
    new-array p1, p1, [Lx7/e;

    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_2
    new-array p1, p1, [Lx7/d;

    .line 16
    .line 17
    return-object p1

    .line 18
    :pswitch_3
    new-array p1, p1, [Lx7/c;

    .line 19
    .line 20
    return-object p1

    .line 21
    :pswitch_4
    new-array p1, p1, [Lx7/b;

    .line 22
    .line 23
    return-object p1

    .line 24
    :pswitch_5
    new-array p1, p1, [Lx7/y;

    .line 25
    .line 26
    return-object p1

    .line 27
    :pswitch_6
    new-array p1, p1, [Lx7/x;

    .line 28
    .line 29
    return-object p1

    .line 30
    :pswitch_7
    new-array p1, p1, [Lx7/t;

    .line 31
    .line 32
    return-object p1

    .line 33
    :pswitch_8
    new-array p1, p1, [Lx7/w;

    .line 34
    .line 35
    return-object p1

    .line 36
    :pswitch_9
    new-array p1, p1, [Lx7/s;

    .line 37
    .line 38
    return-object p1

    .line 39
    :pswitch_a
    new-array p1, p1, [Lx7/r;

    .line 40
    .line 41
    return-object p1

    .line 42
    :pswitch_b
    new-array p1, p1, [Lx7/p;

    .line 43
    .line 44
    return-object p1

    .line 45
    :pswitch_c
    new-array p1, p1, [Lcom/google/android/gms/location/LocationResult;

    .line 46
    .line 47
    return-object p1

    .line 48
    :pswitch_d
    new-array p1, p1, [Lcom/google/android/gms/location/LocationRequest;

    .line 49
    .line 50
    return-object p1

    .line 51
    :pswitch_e
    new-array p1, p1, [Lx7/u;

    .line 52
    .line 53
    return-object p1

    .line 54
    :pswitch_f
    new-array p1, p1, [Lcom/google/android/gms/location/LocationAvailability;

    .line 55
    .line 56
    return-object p1

    .line 57
    :pswitch_10
    new-array p1, p1, [Lx7/k;

    .line 58
    .line 59
    return-object p1

    .line 60
    :pswitch_11
    new-array p1, p1, [Lcom/google/android/gms/fido/u2f/api/common/SignRequestParams;

    .line 61
    .line 62
    return-object p1

    .line 63
    :pswitch_12
    new-array p1, p1, [Lw7/h;

    .line 64
    .line 65
    return-object p1

    .line 66
    :pswitch_13
    new-array p1, p1, [Lcom/google/android/gms/fido/u2f/api/common/RegisterRequestParams;

    .line 67
    .line 68
    return-object p1

    .line 69
    :pswitch_14
    new-array p1, p1, [Lw7/g;

    .line 70
    .line 71
    return-object p1

    .line 72
    :pswitch_15
    new-array p1, p1, [Lw7/f;

    .line 73
    .line 74
    return-object p1

    .line 75
    :pswitch_16
    new-array p1, p1, [Lw7/d;

    .line 76
    .line 77
    return-object p1

    .line 78
    :pswitch_17
    new-array p1, p1, [Lw7/c;

    .line 79
    .line 80
    return-object p1

    .line 81
    :pswitch_18
    new-array p1, p1, [Lw7/a;

    .line 82
    .line 83
    return-object p1

    .line 84
    nop

    .line 85
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_18
        :pswitch_17
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
