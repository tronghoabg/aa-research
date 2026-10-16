.class public final LI2/d;
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
    iput p1, p0, LI2/d;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v2, v0, LI2/d;->a:I

    .line 6
    .line 7
    packed-switch v2, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-static {v1}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    const/4 v3, 0x0

    .line 15
    const/4 v4, 0x0

    .line 16
    const-wide/16 v5, 0x0

    .line 17
    .line 18
    move-object v11, v3

    .line 19
    move-object v14, v11

    .line 20
    move v8, v4

    .line 21
    move v12, v8

    .line 22
    move v13, v12

    .line 23
    move-wide v9, v5

    .line 24
    :goto_0
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-ge v3, v2, :cond_0

    .line 29
    .line 30
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    int-to-char v4, v3

    .line 35
    packed-switch v4, :pswitch_data_1

    .line 36
    .line 37
    .line 38
    invoke-static {v3, v1}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :pswitch_0
    invoke-static {v3, v1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    move-object v14, v3

    .line 47
    goto :goto_0

    .line 48
    :pswitch_1
    invoke-static {v3, v1}, LU8/v0;->f0(ILandroid/os/Parcel;)I

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    move v13, v3

    .line 53
    goto :goto_0

    .line 54
    :pswitch_2
    invoke-static {v3, v1}, LU8/v0;->f0(ILandroid/os/Parcel;)I

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    move v12, v3

    .line 59
    goto :goto_0

    .line 60
    :pswitch_3
    invoke-static {v3, v1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    move-object v11, v3

    .line 65
    goto :goto_0

    .line 66
    :pswitch_4
    invoke-static {v3, v1}, LU8/v0;->h0(ILandroid/os/Parcel;)J

    .line 67
    .line 68
    .line 69
    move-result-wide v3

    .line 70
    move-wide v9, v3

    .line 71
    goto :goto_0

    .line 72
    :pswitch_5
    invoke-static {v3, v1}, LU8/v0;->f0(ILandroid/os/Parcel;)I

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    move v8, v3

    .line 77
    goto :goto_0

    .line 78
    :cond_0
    invoke-static {v2, v1}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 79
    .line 80
    .line 81
    new-instance v7, LT6/a;

    .line 82
    .line 83
    invoke-direct/range {v7 .. v14}, LT6/a;-><init>(IJLjava/lang/String;IILjava/lang/String;)V

    .line 84
    .line 85
    .line 86
    return-object v7

    .line 87
    :pswitch_6
    new-instance v2, LR1/e;

    .line 88
    .line 89
    invoke-direct {v2, v1}, LR1/e;-><init>(Landroid/os/Parcel;)V

    .line 90
    .line 91
    .line 92
    return-object v2

    .line 93
    :pswitch_7
    new-instance v2, LR1/d;

    .line 94
    .line 95
    invoke-direct {v2, v1}, LR1/d;-><init>(Landroid/os/Parcel;)V

    .line 96
    .line 97
    .line 98
    return-object v2

    .line 99
    :pswitch_8
    new-instance v2, LR1/a;

    .line 100
    .line 101
    invoke-direct {v2, v1}, LR1/a;-><init>(Landroid/os/Parcel;)V

    .line 102
    .line 103
    .line 104
    return-object v2

    .line 105
    :pswitch_9
    new-instance v2, LQ7/b;

    .line 106
    .line 107
    invoke-direct {v2, v1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;)V

    .line 108
    .line 109
    .line 110
    const-class v3, LQ7/b;

    .line 111
    .line 112
    invoke-virtual {v3}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    invoke-virtual {v1, v3}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    check-cast v1, Ljava/lang/Integer;

    .line 121
    .line 122
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 123
    .line 124
    .line 125
    move-result v1

    .line 126
    iput v1, v2, LQ7/b;->a:I

    .line 127
    .line 128
    return-object v2

    .line 129
    :pswitch_a
    new-instance v2, LN1/J;

    .line 130
    .line 131
    invoke-direct {v2, v1}, LN1/J;-><init>(Landroid/os/Parcel;)V

    .line 132
    .line 133
    .line 134
    return-object v2

    .line 135
    :pswitch_b
    new-instance v2, LN1/B;

    .line 136
    .line 137
    invoke-direct {v2, v1}, LN1/B;-><init>(Landroid/os/Parcel;)V

    .line 138
    .line 139
    .line 140
    return-object v2

    .line 141
    :pswitch_c
    new-instance v2, LN1/i;

    .line 142
    .line 143
    invoke-direct {v2, v1}, LN1/i;-><init>(Landroid/os/Parcel;)V

    .line 144
    .line 145
    .line 146
    return-object v2

    .line 147
    :pswitch_d
    new-instance v2, LN1/j;

    .line 148
    .line 149
    invoke-direct {v2, v1}, LN1/j;-><init>(Landroid/os/Parcel;)V

    .line 150
    .line 151
    .line 152
    return-object v2

    .line 153
    :pswitch_e
    invoke-static {v1}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 154
    .line 155
    .line 156
    move-result v2

    .line 157
    const/4 v3, 0x0

    .line 158
    :goto_1
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 159
    .line 160
    .line 161
    move-result v4

    .line 162
    if-ge v4, v2, :cond_2

    .line 163
    .line 164
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 165
    .line 166
    .line 167
    move-result v4

    .line 168
    int-to-char v5, v4

    .line 169
    const/4 v6, 0x1

    .line 170
    if-eq v5, v6, :cond_1

    .line 171
    .line 172
    invoke-static {v4, v1}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 173
    .line 174
    .line 175
    goto :goto_1

    .line 176
    :cond_1
    invoke-static {v4, v1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v3

    .line 180
    goto :goto_1

    .line 181
    :cond_2
    invoke-static {v2, v1}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 182
    .line 183
    .line 184
    new-instance v1, LJ8/f;

    .line 185
    .line 186
    invoke-direct {v1, v3}, LJ8/f;-><init>(Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    return-object v1

    .line 190
    :pswitch_f
    invoke-static {v1}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 191
    .line 192
    .line 193
    move-result v2

    .line 194
    const/4 v3, 0x0

    .line 195
    const/4 v4, 0x0

    .line 196
    move-object v7, v3

    .line 197
    move-object v8, v7

    .line 198
    move-object v9, v8

    .line 199
    move-object v10, v9

    .line 200
    move v6, v4

    .line 201
    :goto_2
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 202
    .line 203
    .line 204
    move-result v3

    .line 205
    if-ge v3, v2, :cond_8

    .line 206
    .line 207
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 208
    .line 209
    .line 210
    move-result v3

    .line 211
    int-to-char v4, v3

    .line 212
    const/4 v5, 0x1

    .line 213
    if-eq v4, v5, :cond_7

    .line 214
    .line 215
    const/4 v5, 0x2

    .line 216
    if-eq v4, v5, :cond_6

    .line 217
    .line 218
    const/4 v5, 0x3

    .line 219
    if-eq v4, v5, :cond_5

    .line 220
    .line 221
    const/4 v5, 0x4

    .line 222
    if-eq v4, v5, :cond_4

    .line 223
    .line 224
    const/4 v5, 0x5

    .line 225
    if-eq v4, v5, :cond_3

    .line 226
    .line 227
    invoke-static {v3, v1}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 228
    .line 229
    .line 230
    goto :goto_2

    .line 231
    :cond_3
    invoke-static {v3, v1}, LU8/v0;->Z(ILandroid/os/Parcel;)Z

    .line 232
    .line 233
    .line 234
    move-result v6

    .line 235
    goto :goto_2

    .line 236
    :cond_4
    invoke-static {v3, v1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object v10

    .line 240
    goto :goto_2

    .line 241
    :cond_5
    invoke-static {v3, v1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object v9

    .line 245
    goto :goto_2

    .line 246
    :cond_6
    invoke-static {v3, v1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v8

    .line 250
    goto :goto_2

    .line 251
    :cond_7
    invoke-static {v3, v1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object v7

    .line 255
    goto :goto_2

    .line 256
    :cond_8
    invoke-static {v2, v1}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 257
    .line 258
    .line 259
    new-instance v5, LJ8/e;

    .line 260
    .line 261
    invoke-direct/range {v5 .. v10}, LJ8/e;-><init>(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    return-object v5

    .line 265
    :pswitch_10
    invoke-static {v1}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 266
    .line 267
    .line 268
    move-result v2

    .line 269
    const/4 v3, 0x0

    .line 270
    move-object v5, v3

    .line 271
    move-object v6, v5

    .line 272
    move-object v7, v6

    .line 273
    move-object v8, v7

    .line 274
    move-object v9, v8

    .line 275
    move-object v10, v9

    .line 276
    move-object v11, v10

    .line 277
    :goto_3
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 278
    .line 279
    .line 280
    move-result v3

    .line 281
    if-ge v3, v2, :cond_9

    .line 282
    .line 283
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 284
    .line 285
    .line 286
    move-result v3

    .line 287
    int-to-char v4, v3

    .line 288
    packed-switch v4, :pswitch_data_2

    .line 289
    .line 290
    .line 291
    invoke-static {v3, v1}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 292
    .line 293
    .line 294
    goto :goto_3

    .line 295
    :pswitch_11
    invoke-static {v3, v1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object v11

    .line 299
    goto :goto_3

    .line 300
    :pswitch_12
    invoke-static {v3, v1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 301
    .line 302
    .line 303
    move-result-object v10

    .line 304
    goto :goto_3

    .line 305
    :pswitch_13
    invoke-static {v3, v1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object v9

    .line 309
    goto :goto_3

    .line 310
    :pswitch_14
    sget-object v4, Lcom/google/android/gms/internal/firebase-auth-api/zzahr;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 311
    .line 312
    invoke-static {v1, v3, v4}, LU8/v0;->x(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 313
    .line 314
    .line 315
    move-result-object v3

    .line 316
    move-object v8, v3

    .line 317
    check-cast v8, Lcom/google/android/gms/internal/firebase-auth-api/zzahr;

    .line 318
    .line 319
    goto :goto_3

    .line 320
    :pswitch_15
    invoke-static {v3, v1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object v7

    .line 324
    goto :goto_3

    .line 325
    :pswitch_16
    invoke-static {v3, v1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 326
    .line 327
    .line 328
    move-result-object v6

    .line 329
    goto :goto_3

    .line 330
    :pswitch_17
    invoke-static {v3, v1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 331
    .line 332
    .line 333
    move-result-object v5

    .line 334
    goto :goto_3

    .line 335
    :cond_9
    invoke-static {v2, v1}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 336
    .line 337
    .line 338
    new-instance v4, LJ8/I;

    .line 339
    .line 340
    invoke-direct/range {v4 .. v11}, LJ8/I;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/zzahr;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 341
    .line 342
    .line 343
    return-object v4

    .line 344
    :pswitch_18
    invoke-static {v1}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 345
    .line 346
    .line 347
    move-result v2

    .line 348
    :goto_4
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 349
    .line 350
    .line 351
    move-result v3

    .line 352
    if-ge v3, v2, :cond_a

    .line 353
    .line 354
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 355
    .line 356
    .line 357
    move-result v3

    .line 358
    invoke-static {v3, v1}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 359
    .line 360
    .line 361
    goto :goto_4

    .line 362
    :cond_a
    invoke-static {v2, v1}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 363
    .line 364
    .line 365
    new-instance v1, LJ8/w;

    .line 366
    .line 367
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 368
    .line 369
    .line 370
    return-object v1

    .line 371
    :pswitch_19
    invoke-static {v1}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 372
    .line 373
    .line 374
    move-result v2

    .line 375
    const/4 v3, 0x0

    .line 376
    const/4 v4, 0x0

    .line 377
    move v5, v4

    .line 378
    move v6, v5

    .line 379
    move-object v4, v3

    .line 380
    :goto_5
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 381
    .line 382
    .line 383
    move-result v7

    .line 384
    if-ge v7, v2, :cond_f

    .line 385
    .line 386
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 387
    .line 388
    .line 389
    move-result v7

    .line 390
    int-to-char v8, v7

    .line 391
    const/4 v9, 0x2

    .line 392
    if-eq v8, v9, :cond_e

    .line 393
    .line 394
    const/4 v9, 0x3

    .line 395
    if-eq v8, v9, :cond_d

    .line 396
    .line 397
    const/4 v9, 0x4

    .line 398
    if-eq v8, v9, :cond_c

    .line 399
    .line 400
    const/4 v9, 0x5

    .line 401
    if-eq v8, v9, :cond_b

    .line 402
    .line 403
    invoke-static {v7, v1}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 404
    .line 405
    .line 406
    goto :goto_5

    .line 407
    :cond_b
    invoke-static {v7, v1}, LU8/v0;->Z(ILandroid/os/Parcel;)Z

    .line 408
    .line 409
    .line 410
    move-result v6

    .line 411
    goto :goto_5

    .line 412
    :cond_c
    invoke-static {v7, v1}, LU8/v0;->Z(ILandroid/os/Parcel;)Z

    .line 413
    .line 414
    .line 415
    move-result v5

    .line 416
    goto :goto_5

    .line 417
    :cond_d
    invoke-static {v7, v1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 418
    .line 419
    .line 420
    move-result-object v4

    .line 421
    goto :goto_5

    .line 422
    :cond_e
    invoke-static {v7, v1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 423
    .line 424
    .line 425
    move-result-object v3

    .line 426
    goto :goto_5

    .line 427
    :cond_f
    invoke-static {v2, v1}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 428
    .line 429
    .line 430
    new-instance v1, LJ8/F;

    .line 431
    .line 432
    invoke-direct {v1, v3, v4, v5, v6}, LJ8/F;-><init>(Ljava/lang/String;Ljava/lang/String;ZZ)V

    .line 433
    .line 434
    .line 435
    return-object v1

    .line 436
    :pswitch_1a
    invoke-static {v1}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 437
    .line 438
    .line 439
    move-result v2

    .line 440
    const/4 v3, 0x0

    .line 441
    move-object v4, v3

    .line 442
    :goto_6
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 443
    .line 444
    .line 445
    move-result v5

    .line 446
    if-ge v5, v2, :cond_12

    .line 447
    .line 448
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 449
    .line 450
    .line 451
    move-result v5

    .line 452
    int-to-char v6, v5

    .line 453
    const/4 v7, 0x1

    .line 454
    if-eq v6, v7, :cond_11

    .line 455
    .line 456
    const/4 v7, 0x2

    .line 457
    if-eq v6, v7, :cond_10

    .line 458
    .line 459
    invoke-static {v5, v1}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 460
    .line 461
    .line 462
    goto :goto_6

    .line 463
    :cond_10
    invoke-static {v5, v1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 464
    .line 465
    .line 466
    move-result-object v4

    .line 467
    goto :goto_6

    .line 468
    :cond_11
    invoke-static {v5, v1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 469
    .line 470
    .line 471
    move-result-object v3

    .line 472
    goto :goto_6

    .line 473
    :cond_12
    invoke-static {v2, v1}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 474
    .line 475
    .line 476
    new-instance v1, LJ8/D;

    .line 477
    .line 478
    invoke-direct {v1, v3, v4}, LJ8/D;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 479
    .line 480
    .line 481
    return-object v1

    .line 482
    :pswitch_1b
    invoke-static {v1}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 483
    .line 484
    .line 485
    move-result v2

    .line 486
    const/4 v3, 0x0

    .line 487
    const-wide/16 v4, 0x0

    .line 488
    .line 489
    move-object v7, v3

    .line 490
    move-object v8, v7

    .line 491
    move-object v11, v8

    .line 492
    move-wide v9, v4

    .line 493
    :goto_7
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 494
    .line 495
    .line 496
    move-result v3

    .line 497
    if-ge v3, v2, :cond_17

    .line 498
    .line 499
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 500
    .line 501
    .line 502
    move-result v3

    .line 503
    int-to-char v4, v3

    .line 504
    const/4 v5, 0x1

    .line 505
    if-eq v4, v5, :cond_16

    .line 506
    .line 507
    const/4 v5, 0x2

    .line 508
    if-eq v4, v5, :cond_15

    .line 509
    .line 510
    const/4 v5, 0x3

    .line 511
    if-eq v4, v5, :cond_14

    .line 512
    .line 513
    const/4 v5, 0x4

    .line 514
    if-eq v4, v5, :cond_13

    .line 515
    .line 516
    invoke-static {v3, v1}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 517
    .line 518
    .line 519
    goto :goto_7

    .line 520
    :cond_13
    sget-object v4, Lcom/google/android/gms/internal/firebase-auth-api/zzahp;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 521
    .line 522
    invoke-static {v1, v3, v4}, LU8/v0;->x(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 523
    .line 524
    .line 525
    move-result-object v3

    .line 526
    move-object v11, v3

    .line 527
    check-cast v11, Lcom/google/android/gms/internal/firebase-auth-api/zzahp;

    .line 528
    .line 529
    goto :goto_7

    .line 530
    :cond_14
    invoke-static {v3, v1}, LU8/v0;->h0(ILandroid/os/Parcel;)J

    .line 531
    .line 532
    .line 533
    move-result-wide v9

    .line 534
    goto :goto_7

    .line 535
    :cond_15
    invoke-static {v3, v1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 536
    .line 537
    .line 538
    move-result-object v8

    .line 539
    goto :goto_7

    .line 540
    :cond_16
    invoke-static {v3, v1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 541
    .line 542
    .line 543
    move-result-object v7

    .line 544
    goto :goto_7

    .line 545
    :cond_17
    invoke-static {v2, v1}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 546
    .line 547
    .line 548
    new-instance v6, LJ8/C;

    .line 549
    .line 550
    invoke-direct/range {v6 .. v11}, LJ8/C;-><init>(Ljava/lang/String;Ljava/lang/String;JLcom/google/android/gms/internal/firebase-auth-api/zzahp;)V

    .line 551
    .line 552
    .line 553
    return-object v6

    .line 554
    :pswitch_1c
    invoke-static {v1}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 555
    .line 556
    .line 557
    move-result v2

    .line 558
    const/4 v3, 0x0

    .line 559
    :goto_8
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 560
    .line 561
    .line 562
    move-result v4

    .line 563
    if-ge v4, v2, :cond_19

    .line 564
    .line 565
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 566
    .line 567
    .line 568
    move-result v4

    .line 569
    int-to-char v5, v4

    .line 570
    const/4 v6, 0x1

    .line 571
    if-eq v5, v6, :cond_18

    .line 572
    .line 573
    invoke-static {v4, v1}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 574
    .line 575
    .line 576
    goto :goto_8

    .line 577
    :cond_18
    invoke-static {v4, v1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 578
    .line 579
    .line 580
    move-result-object v3

    .line 581
    goto :goto_8

    .line 582
    :cond_19
    invoke-static {v2, v1}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 583
    .line 584
    .line 585
    new-instance v1, LJ8/A;

    .line 586
    .line 587
    invoke-direct {v1, v3}, LJ8/A;-><init>(Ljava/lang/String;)V

    .line 588
    .line 589
    .line 590
    return-object v1

    .line 591
    :pswitch_1d
    invoke-static {v1}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 592
    .line 593
    .line 594
    move-result v2

    .line 595
    const/4 v3, 0x0

    .line 596
    const-wide/16 v4, 0x0

    .line 597
    .line 598
    move-object v9, v3

    .line 599
    move-object v10, v9

    .line 600
    move-object v11, v10

    .line 601
    move-wide v7, v4

    .line 602
    :goto_9
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 603
    .line 604
    .line 605
    move-result v3

    .line 606
    if-ge v3, v2, :cond_1e

    .line 607
    .line 608
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 609
    .line 610
    .line 611
    move-result v3

    .line 612
    int-to-char v4, v3

    .line 613
    const/4 v5, 0x1

    .line 614
    if-eq v4, v5, :cond_1d

    .line 615
    .line 616
    const/4 v5, 0x2

    .line 617
    if-eq v4, v5, :cond_1c

    .line 618
    .line 619
    const/4 v5, 0x3

    .line 620
    if-eq v4, v5, :cond_1b

    .line 621
    .line 622
    const/4 v5, 0x4

    .line 623
    if-eq v4, v5, :cond_1a

    .line 624
    .line 625
    invoke-static {v3, v1}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 626
    .line 627
    .line 628
    goto :goto_9

    .line 629
    :cond_1a
    invoke-static {v3, v1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 630
    .line 631
    .line 632
    move-result-object v11

    .line 633
    goto :goto_9

    .line 634
    :cond_1b
    invoke-static {v3, v1}, LU8/v0;->h0(ILandroid/os/Parcel;)J

    .line 635
    .line 636
    .line 637
    move-result-wide v7

    .line 638
    goto :goto_9

    .line 639
    :cond_1c
    invoke-static {v3, v1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 640
    .line 641
    .line 642
    move-result-object v10

    .line 643
    goto :goto_9

    .line 644
    :cond_1d
    invoke-static {v3, v1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 645
    .line 646
    .line 647
    move-result-object v9

    .line 648
    goto :goto_9

    .line 649
    :cond_1e
    invoke-static {v2, v1}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 650
    .line 651
    .line 652
    new-instance v6, LJ8/z;

    .line 653
    .line 654
    invoke-direct/range {v6 .. v11}, LJ8/z;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 655
    .line 656
    .line 657
    return-object v6

    .line 658
    :pswitch_1e
    invoke-static {v1}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 659
    .line 660
    .line 661
    move-result v2

    .line 662
    const/4 v3, 0x0

    .line 663
    const/4 v4, 0x0

    .line 664
    move-object v7, v3

    .line 665
    move-object v8, v7

    .line 666
    move-object v9, v8

    .line 667
    move-object v10, v9

    .line 668
    move v6, v4

    .line 669
    :goto_a
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 670
    .line 671
    .line 672
    move-result v3

    .line 673
    if-ge v3, v2, :cond_24

    .line 674
    .line 675
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 676
    .line 677
    .line 678
    move-result v3

    .line 679
    int-to-char v4, v3

    .line 680
    const/4 v5, 0x1

    .line 681
    if-eq v4, v5, :cond_23

    .line 682
    .line 683
    const/4 v5, 0x2

    .line 684
    if-eq v4, v5, :cond_22

    .line 685
    .line 686
    const/4 v5, 0x4

    .line 687
    if-eq v4, v5, :cond_21

    .line 688
    .line 689
    const/4 v5, 0x5

    .line 690
    if-eq v4, v5, :cond_20

    .line 691
    .line 692
    const/4 v5, 0x6

    .line 693
    if-eq v4, v5, :cond_1f

    .line 694
    .line 695
    invoke-static {v3, v1}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 696
    .line 697
    .line 698
    goto :goto_a

    .line 699
    :cond_1f
    invoke-static {v3, v1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 700
    .line 701
    .line 702
    move-result-object v10

    .line 703
    goto :goto_a

    .line 704
    :cond_20
    invoke-static {v3, v1}, LU8/v0;->Z(ILandroid/os/Parcel;)Z

    .line 705
    .line 706
    .line 707
    move-result v6

    .line 708
    goto :goto_a

    .line 709
    :cond_21
    invoke-static {v3, v1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 710
    .line 711
    .line 712
    move-result-object v9

    .line 713
    goto :goto_a

    .line 714
    :cond_22
    invoke-static {v3, v1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 715
    .line 716
    .line 717
    move-result-object v8

    .line 718
    goto :goto_a

    .line 719
    :cond_23
    invoke-static {v3, v1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 720
    .line 721
    .line 722
    move-result-object v7

    .line 723
    goto :goto_a

    .line 724
    :cond_24
    invoke-static {v2, v1}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 725
    .line 726
    .line 727
    new-instance v5, LJ8/u;

    .line 728
    .line 729
    invoke-direct/range {v5 .. v10}, LJ8/u;-><init>(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 730
    .line 731
    .line 732
    return-object v5

    .line 733
    :pswitch_1f
    invoke-static {v1}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 734
    .line 735
    .line 736
    move-result v2

    .line 737
    const/4 v3, 0x0

    .line 738
    move-object v4, v3

    .line 739
    move-object v5, v4

    .line 740
    :goto_b
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 741
    .line 742
    .line 743
    move-result v6

    .line 744
    if-ge v6, v2, :cond_28

    .line 745
    .line 746
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 747
    .line 748
    .line 749
    move-result v6

    .line 750
    int-to-char v7, v6

    .line 751
    const/4 v8, 0x1

    .line 752
    if-eq v7, v8, :cond_27

    .line 753
    .line 754
    const/4 v8, 0x2

    .line 755
    if-eq v7, v8, :cond_26

    .line 756
    .line 757
    const/4 v8, 0x3

    .line 758
    if-eq v7, v8, :cond_25

    .line 759
    .line 760
    invoke-static {v6, v1}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 761
    .line 762
    .line 763
    goto :goto_b

    .line 764
    :cond_25
    invoke-static {v6, v1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 765
    .line 766
    .line 767
    move-result-object v5

    .line 768
    goto :goto_b

    .line 769
    :cond_26
    invoke-static {v6, v1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 770
    .line 771
    .line 772
    move-result-object v4

    .line 773
    goto :goto_b

    .line 774
    :cond_27
    invoke-static {v6, v1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 775
    .line 776
    .line 777
    move-result-object v3

    .line 778
    goto :goto_b

    .line 779
    :cond_28
    invoke-static {v2, v1}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 780
    .line 781
    .line 782
    new-instance v1, LJ8/H;

    .line 783
    .line 784
    invoke-direct {v1, v3, v4, v5}, LJ8/H;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 785
    .line 786
    .line 787
    return-object v1

    .line 788
    :pswitch_20
    invoke-static {v1}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 789
    .line 790
    .line 791
    move-result v2

    .line 792
    const/4 v3, 0x0

    .line 793
    move-object v4, v3

    .line 794
    :goto_c
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 795
    .line 796
    .line 797
    move-result v5

    .line 798
    if-ge v5, v2, :cond_2b

    .line 799
    .line 800
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 801
    .line 802
    .line 803
    move-result v5

    .line 804
    int-to-char v6, v5

    .line 805
    const/4 v7, 0x1

    .line 806
    if-eq v6, v7, :cond_2a

    .line 807
    .line 808
    const/4 v7, 0x2

    .line 809
    if-eq v6, v7, :cond_29

    .line 810
    .line 811
    invoke-static {v5, v1}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 812
    .line 813
    .line 814
    goto :goto_c

    .line 815
    :cond_29
    invoke-static {v5, v1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 816
    .line 817
    .line 818
    move-result-object v4

    .line 819
    goto :goto_c

    .line 820
    :cond_2a
    invoke-static {v5, v1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 821
    .line 822
    .line 823
    move-result-object v3

    .line 824
    goto :goto_c

    .line 825
    :cond_2b
    invoke-static {v2, v1}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 826
    .line 827
    .line 828
    new-instance v1, LJ8/r;

    .line 829
    .line 830
    invoke-direct {v1, v3, v4}, LJ8/r;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 831
    .line 832
    .line 833
    return-object v1

    .line 834
    :pswitch_21
    invoke-static {v1}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 835
    .line 836
    .line 837
    move-result v2

    .line 838
    const/4 v3, 0x0

    .line 839
    :goto_d
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 840
    .line 841
    .line 842
    move-result v4

    .line 843
    if-ge v4, v2, :cond_2d

    .line 844
    .line 845
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 846
    .line 847
    .line 848
    move-result v4

    .line 849
    int-to-char v5, v4

    .line 850
    const/4 v6, 0x1

    .line 851
    if-eq v5, v6, :cond_2c

    .line 852
    .line 853
    invoke-static {v4, v1}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 854
    .line 855
    .line 856
    goto :goto_d

    .line 857
    :cond_2c
    invoke-static {v4, v1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 858
    .line 859
    .line 860
    move-result-object v3

    .line 861
    goto :goto_d

    .line 862
    :cond_2d
    invoke-static {v2, v1}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 863
    .line 864
    .line 865
    new-instance v1, LJ8/q;

    .line 866
    .line 867
    invoke-direct {v1, v3}, LJ8/q;-><init>(Ljava/lang/String;)V

    .line 868
    .line 869
    .line 870
    return-object v1

    .line 871
    :pswitch_22
    invoke-static {v1}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 872
    .line 873
    .line 874
    move-result v2

    .line 875
    const/4 v3, 0x0

    .line 876
    const/4 v4, 0x0

    .line 877
    move-object v6, v3

    .line 878
    move-object v7, v6

    .line 879
    move-object v8, v7

    .line 880
    move-object v9, v8

    .line 881
    move-object v11, v9

    .line 882
    move-object v13, v11

    .line 883
    move-object v15, v13

    .line 884
    move-object/from16 v16, v15

    .line 885
    .line 886
    move v10, v4

    .line 887
    move v12, v10

    .line 888
    move v14, v12

    .line 889
    :goto_e
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 890
    .line 891
    .line 892
    move-result v3

    .line 893
    if-ge v3, v2, :cond_2e

    .line 894
    .line 895
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 896
    .line 897
    .line 898
    move-result v3

    .line 899
    int-to-char v4, v3

    .line 900
    packed-switch v4, :pswitch_data_3

    .line 901
    .line 902
    .line 903
    invoke-static {v3, v1}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 904
    .line 905
    .line 906
    goto :goto_e

    .line 907
    :pswitch_23
    invoke-static {v3, v1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 908
    .line 909
    .line 910
    move-result-object v16

    .line 911
    goto :goto_e

    .line 912
    :pswitch_24
    invoke-static {v3, v1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 913
    .line 914
    .line 915
    move-result-object v15

    .line 916
    goto :goto_e

    .line 917
    :pswitch_25
    invoke-static {v3, v1}, LU8/v0;->f0(ILandroid/os/Parcel;)I

    .line 918
    .line 919
    .line 920
    move-result v14

    .line 921
    goto :goto_e

    .line 922
    :pswitch_26
    invoke-static {v3, v1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 923
    .line 924
    .line 925
    move-result-object v13

    .line 926
    goto :goto_e

    .line 927
    :pswitch_27
    invoke-static {v3, v1}, LU8/v0;->Z(ILandroid/os/Parcel;)Z

    .line 928
    .line 929
    .line 930
    move-result v12

    .line 931
    goto :goto_e

    .line 932
    :pswitch_28
    invoke-static {v3, v1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 933
    .line 934
    .line 935
    move-result-object v11

    .line 936
    goto :goto_e

    .line 937
    :pswitch_29
    invoke-static {v3, v1}, LU8/v0;->Z(ILandroid/os/Parcel;)Z

    .line 938
    .line 939
    .line 940
    move-result v10

    .line 941
    goto :goto_e

    .line 942
    :pswitch_2a
    invoke-static {v3, v1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 943
    .line 944
    .line 945
    move-result-object v9

    .line 946
    goto :goto_e

    .line 947
    :pswitch_2b
    invoke-static {v3, v1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 948
    .line 949
    .line 950
    move-result-object v8

    .line 951
    goto :goto_e

    .line 952
    :pswitch_2c
    invoke-static {v3, v1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 953
    .line 954
    .line 955
    move-result-object v7

    .line 956
    goto :goto_e

    .line 957
    :pswitch_2d
    invoke-static {v3, v1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 958
    .line 959
    .line 960
    move-result-object v6

    .line 961
    goto :goto_e

    .line 962
    :cond_2e
    invoke-static {v2, v1}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 963
    .line 964
    .line 965
    new-instance v5, LJ8/b;

    .line 966
    .line 967
    invoke-direct/range {v5 .. v16}, LJ8/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    .line 968
    .line 969
    .line 970
    return-object v5

    .line 971
    :pswitch_2e
    new-instance v2, LJ2/a;

    .line 972
    .line 973
    invoke-direct {v2, v1}, LE2/b;-><init>(Landroid/os/Parcel;)V

    .line 974
    .line 975
    .line 976
    return-object v2

    .line 977
    :pswitch_2f
    new-instance v2, LI5/b;

    .line 978
    .line 979
    invoke-direct {v2, v1}, LI5/b;-><init>(Landroid/os/Parcel;)V

    .line 980
    .line 981
    .line 982
    return-object v2

    .line 983
    :pswitch_30
    new-instance v2, LI5/c;

    .line 984
    .line 985
    invoke-direct {v2, v1}, LI5/c;-><init>(Landroid/os/Parcel;)V

    .line 986
    .line 987
    .line 988
    return-object v2

    .line 989
    :pswitch_31
    new-instance v2, LI2/k;

    .line 990
    .line 991
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 992
    .line 993
    .line 994
    move-result-wide v3

    .line 995
    invoke-virtual {v1}, Landroid/os/Parcel;->readLong()J

    .line 996
    .line 997
    .line 998
    move-result-wide v5

    .line 999
    invoke-direct {v2, v3, v4, v5, v6}, LI2/k;-><init>(JJ)V

    .line 1000
    .line 1001
    .line 1002
    return-object v2

    .line 1003
    :pswitch_32
    new-instance v2, LI2/j;

    .line 1004
    .line 1005
    invoke-direct {v2, v1}, LI2/j;-><init>(Landroid/os/Parcel;)V

    .line 1006
    .line 1007
    .line 1008
    return-object v2

    .line 1009
    :pswitch_33
    new-instance v1, LI2/g;

    .line 1010
    .line 1011
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 1012
    .line 1013
    .line 1014
    return-object v1

    .line 1015
    :pswitch_34
    new-instance v2, LI2/f;

    .line 1016
    .line 1017
    invoke-direct {v2, v1}, LI2/f;-><init>(Landroid/os/Parcel;)V

    .line 1018
    .line 1019
    .line 1020
    return-object v2

    .line 1021
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
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
    .end packed-switch

    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
    .end packed-switch

    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    :pswitch_data_3
    .packed-switch 0x1
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
    .end packed-switch
.end method

.method public final newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, LI2/d;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-array p1, p1, [LT6/a;

    .line 7
    .line 8
    return-object p1

    .line 9
    :pswitch_0
    new-array p1, p1, [LR1/e;

    .line 10
    .line 11
    return-object p1

    .line 12
    :pswitch_1
    new-array p1, p1, [LR1/d;

    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_2
    new-array p1, p1, [LR1/a;

    .line 16
    .line 17
    return-object p1

    .line 18
    :pswitch_3
    new-array p1, p1, [LQ7/b;

    .line 19
    .line 20
    return-object p1

    .line 21
    :pswitch_4
    new-array p1, p1, [LN1/J;

    .line 22
    .line 23
    return-object p1

    .line 24
    :pswitch_5
    new-array p1, p1, [LN1/B;

    .line 25
    .line 26
    return-object p1

    .line 27
    :pswitch_6
    new-array p1, p1, [LN1/i;

    .line 28
    .line 29
    return-object p1

    .line 30
    :pswitch_7
    new-array p1, p1, [LN1/j;

    .line 31
    .line 32
    return-object p1

    .line 33
    :pswitch_8
    new-array p1, p1, [LJ8/f;

    .line 34
    .line 35
    return-object p1

    .line 36
    :pswitch_9
    new-array p1, p1, [LJ8/e;

    .line 37
    .line 38
    return-object p1

    .line 39
    :pswitch_a
    new-array p1, p1, [LJ8/I;

    .line 40
    .line 41
    return-object p1

    .line 42
    :pswitch_b
    new-array p1, p1, [LJ8/w;

    .line 43
    .line 44
    return-object p1

    .line 45
    :pswitch_c
    new-array p1, p1, [LJ8/F;

    .line 46
    .line 47
    return-object p1

    .line 48
    :pswitch_d
    new-array p1, p1, [LJ8/D;

    .line 49
    .line 50
    return-object p1

    .line 51
    :pswitch_e
    new-array p1, p1, [LJ8/C;

    .line 52
    .line 53
    return-object p1

    .line 54
    :pswitch_f
    new-array p1, p1, [LJ8/A;

    .line 55
    .line 56
    return-object p1

    .line 57
    :pswitch_10
    new-array p1, p1, [LJ8/z;

    .line 58
    .line 59
    return-object p1

    .line 60
    :pswitch_11
    new-array p1, p1, [LJ8/u;

    .line 61
    .line 62
    return-object p1

    .line 63
    :pswitch_12
    new-array p1, p1, [LJ8/H;

    .line 64
    .line 65
    return-object p1

    .line 66
    :pswitch_13
    new-array p1, p1, [LJ8/r;

    .line 67
    .line 68
    return-object p1

    .line 69
    :pswitch_14
    new-array p1, p1, [LJ8/q;

    .line 70
    .line 71
    return-object p1

    .line 72
    :pswitch_15
    new-array p1, p1, [LJ8/b;

    .line 73
    .line 74
    return-object p1

    .line 75
    :pswitch_16
    new-array p1, p1, [LJ2/a;

    .line 76
    .line 77
    return-object p1

    .line 78
    :pswitch_17
    new-array p1, p1, [LI5/b;

    .line 79
    .line 80
    return-object p1

    .line 81
    :pswitch_18
    new-array p1, p1, [LI5/c;

    .line 82
    .line 83
    return-object p1

    .line 84
    :pswitch_19
    new-array p1, p1, [LI2/k;

    .line 85
    .line 86
    return-object p1

    .line 87
    :pswitch_1a
    new-array p1, p1, [LI2/j;

    .line 88
    .line 89
    return-object p1

    .line 90
    :pswitch_1b
    new-array p1, p1, [LI2/g;

    .line 91
    .line 92
    return-object p1

    .line 93
    :pswitch_1c
    new-array p1, p1, [LI2/f;

    .line 94
    .line 95
    return-object p1

    .line 96
    nop

    .line 97
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
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
