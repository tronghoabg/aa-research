.class public final Lv7/U;
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
    iput p1, p0, Lv7/U;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget v0, p0, Lv7/U;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x0

    .line 11
    :goto_0
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-ge v2, v0, :cond_1

    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    int-to-char v3, v2

    .line 22
    const/4 v4, 0x2

    .line 23
    if-eq v3, v4, :cond_0

    .line 24
    .line 25
    invoke-static {v2, p1}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-static {v2, p1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    goto :goto_0

    .line 34
    :cond_1
    invoke-static {v0, p1}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 35
    .line 36
    .line 37
    new-instance p1, Lv7/v;

    .line 38
    .line 39
    invoke-direct {p1, v1}, Lv7/v;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    return-object p1

    .line 43
    :pswitch_0
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    :try_start_0
    invoke-static {p1}, Lv7/u;->c(I)Lv7/u;

    .line 48
    .line 49
    .line 50
    move-result-object p1
    :try_end_0
    .catch Lv7/t; {:try_start_0 .. :try_end_0} :catch_0

    .line 51
    return-object p1

    .line 52
    :catch_0
    move-exception v0

    .line 53
    move-object p1, v0

    .line 54
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 55
    .line 56
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    .line 57
    .line 58
    .line 59
    throw v0

    .line 60
    :pswitch_1
    invoke-static {p1}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    const/4 v1, 0x0

    .line 65
    :goto_1
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    if-ge v2, v0, :cond_3

    .line 70
    .line 71
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    int-to-char v3, v2

    .line 76
    const/4 v4, 0x1

    .line 77
    if-eq v3, v4, :cond_2

    .line 78
    .line 79
    invoke-static {v2, p1}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 80
    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_2
    invoke-static {v2, p1}, LU8/v0;->Z(ILandroid/os/Parcel;)Z

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    goto :goto_1

    .line 88
    :cond_3
    invoke-static {v0, p1}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 89
    .line 90
    .line 91
    new-instance p1, Lv7/b0;

    .line 92
    .line 93
    invoke-direct {p1, v1}, Lv7/b0;-><init>(Z)V

    .line 94
    .line 95
    .line 96
    return-object p1

    .line 97
    :pswitch_2
    invoke-static {p1}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    const/4 v1, 0x0

    .line 102
    :goto_2
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    if-ge v2, v0, :cond_5

    .line 107
    .line 108
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 109
    .line 110
    .line 111
    move-result v2

    .line 112
    int-to-char v3, v2

    .line 113
    const/4 v4, 0x1

    .line 114
    if-eq v3, v4, :cond_4

    .line 115
    .line 116
    invoke-static {v2, p1}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 117
    .line 118
    .line 119
    goto :goto_2

    .line 120
    :cond_4
    sget-object v1, Lv7/Z;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 121
    .line 122
    invoke-static {p1, v2, v1}, LU8/v0;->C(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    goto :goto_2

    .line 127
    :cond_5
    invoke-static {v0, p1}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 128
    .line 129
    .line 130
    new-instance p1, Lv7/a0;

    .line 131
    .line 132
    invoke-direct {p1, v1}, Lv7/a0;-><init>(Ljava/util/ArrayList;)V

    .line 133
    .line 134
    .line 135
    return-object p1

    .line 136
    :pswitch_3
    invoke-static {p1}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    const/4 v1, 0x0

    .line 141
    const-wide/16 v2, 0x0

    .line 142
    .line 143
    move-object v7, v1

    .line 144
    move-object v8, v7

    .line 145
    move-object v9, v8

    .line 146
    move-wide v5, v2

    .line 147
    :goto_3
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 148
    .line 149
    .line 150
    move-result v1

    .line 151
    if-ge v1, v0, :cond_a

    .line 152
    .line 153
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 154
    .line 155
    .line 156
    move-result v1

    .line 157
    int-to-char v2, v1

    .line 158
    const/4 v3, 0x1

    .line 159
    if-eq v2, v3, :cond_9

    .line 160
    .line 161
    const/4 v3, 0x2

    .line 162
    if-eq v2, v3, :cond_8

    .line 163
    .line 164
    const/4 v3, 0x3

    .line 165
    if-eq v2, v3, :cond_7

    .line 166
    .line 167
    const/4 v3, 0x4

    .line 168
    if-eq v2, v3, :cond_6

    .line 169
    .line 170
    invoke-static {v1, p1}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 171
    .line 172
    .line 173
    goto :goto_3

    .line 174
    :cond_6
    invoke-static {v1, p1}, LU8/v0;->r(ILandroid/os/Parcel;)[B

    .line 175
    .line 176
    .line 177
    move-result-object v1

    .line 178
    move-object v9, v1

    .line 179
    goto :goto_3

    .line 180
    :cond_7
    invoke-static {v1, p1}, LU8/v0;->r(ILandroid/os/Parcel;)[B

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    move-object v8, v1

    .line 185
    goto :goto_3

    .line 186
    :cond_8
    invoke-static {v1, p1}, LU8/v0;->r(ILandroid/os/Parcel;)[B

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    move-object v7, v1

    .line 191
    goto :goto_3

    .line 192
    :cond_9
    invoke-static {v1, p1}, LU8/v0;->h0(ILandroid/os/Parcel;)J

    .line 193
    .line 194
    .line 195
    move-result-wide v1

    .line 196
    move-wide v5, v1

    .line 197
    goto :goto_3

    .line 198
    :cond_a
    invoke-static {v0, p1}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 199
    .line 200
    .line 201
    new-instance v4, Lv7/Z;

    .line 202
    .line 203
    invoke-direct/range {v4 .. v9}, Lv7/Z;-><init>(J[B[B[B)V

    .line 204
    .line 205
    .line 206
    return-object v4

    .line 207
    :pswitch_4
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 208
    .line 209
    .line 210
    move-result p1

    .line 211
    :try_start_1
    invoke-static {p1}, Lv7/r;->c(I)Lv7/r;

    .line 212
    .line 213
    .line 214
    move-result-object p1
    :try_end_1
    .catch Lv7/q; {:try_start_1 .. :try_end_1} :catch_1

    .line 215
    return-object p1

    .line 216
    :catch_1
    move-exception v0

    .line 217
    move-object p1, v0

    .line 218
    new-instance v0, Ljava/lang/RuntimeException;

    .line 219
    .line 220
    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 221
    .line 222
    .line 223
    throw v0

    .line 224
    :pswitch_5
    invoke-static {p1}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 225
    .line 226
    .line 227
    move-result v0

    .line 228
    const/4 v1, 0x0

    .line 229
    move-object v2, v1

    .line 230
    move-object v3, v2

    .line 231
    :goto_4
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 232
    .line 233
    .line 234
    move-result v4

    .line 235
    if-ge v4, v0, :cond_e

    .line 236
    .line 237
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 238
    .line 239
    .line 240
    move-result v4

    .line 241
    int-to-char v5, v4

    .line 242
    const/4 v6, 0x2

    .line 243
    if-eq v5, v6, :cond_d

    .line 244
    .line 245
    const/4 v6, 0x3

    .line 246
    if-eq v5, v6, :cond_c

    .line 247
    .line 248
    const/4 v6, 0x4

    .line 249
    if-eq v5, v6, :cond_b

    .line 250
    .line 251
    invoke-static {v4, p1}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 252
    .line 253
    .line 254
    goto :goto_4

    .line 255
    :cond_b
    invoke-static {v4, p1}, LU8/v0;->r(ILandroid/os/Parcel;)[B

    .line 256
    .line 257
    .line 258
    move-result-object v3

    .line 259
    goto :goto_4

    .line 260
    :cond_c
    sget-object v2, Landroid/net/Uri;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 261
    .line 262
    invoke-static {p1, v4, v2}, LU8/v0;->x(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 263
    .line 264
    .line 265
    move-result-object v2

    .line 266
    check-cast v2, Landroid/net/Uri;

    .line 267
    .line 268
    goto :goto_4

    .line 269
    :cond_d
    sget-object v1, Lv7/B;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 270
    .line 271
    invoke-static {p1, v4, v1}, LU8/v0;->x(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 272
    .line 273
    .line 274
    move-result-object v1

    .line 275
    check-cast v1, Lv7/B;

    .line 276
    .line 277
    goto :goto_4

    .line 278
    :cond_e
    invoke-static {v0, p1}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 279
    .line 280
    .line 281
    new-instance p1, Lv7/o;

    .line 282
    .line 283
    invoke-direct {p1, v1, v2, v3}, Lv7/o;-><init>(Lv7/B;Landroid/net/Uri;[B)V

    .line 284
    .line 285
    .line 286
    return-object p1

    .line 287
    :pswitch_6
    invoke-static {p1}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 288
    .line 289
    .line 290
    move-result v0

    .line 291
    const/4 v1, 0x0

    .line 292
    move-object v2, v1

    .line 293
    move-object v3, v2

    .line 294
    :goto_5
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 295
    .line 296
    .line 297
    move-result v4

    .line 298
    if-ge v4, v0, :cond_12

    .line 299
    .line 300
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 301
    .line 302
    .line 303
    move-result v4

    .line 304
    int-to-char v5, v4

    .line 305
    const/4 v6, 0x2

    .line 306
    if-eq v5, v6, :cond_11

    .line 307
    .line 308
    const/4 v6, 0x3

    .line 309
    if-eq v5, v6, :cond_10

    .line 310
    .line 311
    const/4 v6, 0x4

    .line 312
    if-eq v5, v6, :cond_f

    .line 313
    .line 314
    invoke-static {v4, p1}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 315
    .line 316
    .line 317
    goto :goto_5

    .line 318
    :cond_f
    invoke-static {v4, p1}, LU8/v0;->r(ILandroid/os/Parcel;)[B

    .line 319
    .line 320
    .line 321
    move-result-object v3

    .line 322
    goto :goto_5

    .line 323
    :cond_10
    sget-object v2, Landroid/net/Uri;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 324
    .line 325
    invoke-static {p1, v4, v2}, LU8/v0;->x(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 326
    .line 327
    .line 328
    move-result-object v2

    .line 329
    check-cast v2, Landroid/net/Uri;

    .line 330
    .line 331
    goto :goto_5

    .line 332
    :cond_11
    sget-object v1, Lv7/y;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 333
    .line 334
    invoke-static {p1, v4, v1}, LU8/v0;->x(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 335
    .line 336
    .line 337
    move-result-object v1

    .line 338
    check-cast v1, Lv7/y;

    .line 339
    .line 340
    goto :goto_5

    .line 341
    :cond_12
    invoke-static {v0, p1}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 342
    .line 343
    .line 344
    new-instance p1, Lv7/n;

    .line 345
    .line 346
    invoke-direct {p1, v1, v2, v3}, Lv7/n;-><init>(Lv7/y;Landroid/net/Uri;[B)V

    .line 347
    .line 348
    .line 349
    return-object p1

    .line 350
    :pswitch_7
    invoke-static {p1}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 351
    .line 352
    .line 353
    move-result v0

    .line 354
    const/4 v1, 0x0

    .line 355
    move-object v2, v1

    .line 356
    move-object v3, v2

    .line 357
    move-object v4, v3

    .line 358
    :goto_6
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 359
    .line 360
    .line 361
    move-result v5

    .line 362
    if-ge v5, v0, :cond_17

    .line 363
    .line 364
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 365
    .line 366
    .line 367
    move-result v5

    .line 368
    int-to-char v6, v5

    .line 369
    const/4 v7, 0x2

    .line 370
    if-eq v6, v7, :cond_16

    .line 371
    .line 372
    const/4 v7, 0x3

    .line 373
    if-eq v6, v7, :cond_15

    .line 374
    .line 375
    const/4 v7, 0x4

    .line 376
    if-eq v6, v7, :cond_14

    .line 377
    .line 378
    const/4 v7, 0x5

    .line 379
    if-eq v6, v7, :cond_13

    .line 380
    .line 381
    invoke-static {v5, p1}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 382
    .line 383
    .line 384
    goto :goto_6

    .line 385
    :cond_13
    invoke-static {v5, p1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 386
    .line 387
    .line 388
    move-result-object v4

    .line 389
    goto :goto_6

    .line 390
    :cond_14
    invoke-static {v5, p1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 391
    .line 392
    .line 393
    move-result-object v3

    .line 394
    goto :goto_6

    .line 395
    :cond_15
    invoke-static {v5, p1}, LU8/v0;->a0(ILandroid/os/Parcel;)Ljava/lang/Boolean;

    .line 396
    .line 397
    .line 398
    move-result-object v2

    .line 399
    goto :goto_6

    .line 400
    :cond_16
    invoke-static {v5, p1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 401
    .line 402
    .line 403
    move-result-object v1

    .line 404
    goto :goto_6

    .line 405
    :cond_17
    invoke-static {v0, p1}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 406
    .line 407
    .line 408
    new-instance p1, Lv7/m;

    .line 409
    .line 410
    invoke-direct {p1, v1, v2, v3, v4}, Lv7/m;-><init>(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V

    .line 411
    .line 412
    .line 413
    return-object p1

    .line 414
    :pswitch_8
    invoke-static {p1}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 415
    .line 416
    .line 417
    move-result v0

    .line 418
    const/4 v1, 0x0

    .line 419
    const/4 v2, 0x0

    .line 420
    move-object v3, v2

    .line 421
    move v2, v1

    .line 422
    :goto_7
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 423
    .line 424
    .line 425
    move-result v4

    .line 426
    if-ge v4, v0, :cond_1b

    .line 427
    .line 428
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 429
    .line 430
    .line 431
    move-result v4

    .line 432
    int-to-char v5, v4

    .line 433
    const/4 v6, 0x2

    .line 434
    if-eq v5, v6, :cond_1a

    .line 435
    .line 436
    const/4 v6, 0x3

    .line 437
    if-eq v5, v6, :cond_19

    .line 438
    .line 439
    const/4 v6, 0x4

    .line 440
    if-eq v5, v6, :cond_18

    .line 441
    .line 442
    invoke-static {v4, p1}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 443
    .line 444
    .line 445
    goto :goto_7

    .line 446
    :cond_18
    invoke-static {v4, p1}, LU8/v0;->f0(ILandroid/os/Parcel;)I

    .line 447
    .line 448
    .line 449
    move-result v2

    .line 450
    goto :goto_7

    .line 451
    :cond_19
    invoke-static {v4, p1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 452
    .line 453
    .line 454
    move-result-object v3

    .line 455
    goto :goto_7

    .line 456
    :cond_1a
    invoke-static {v4, p1}, LU8/v0;->f0(ILandroid/os/Parcel;)I

    .line 457
    .line 458
    .line 459
    move-result v1

    .line 460
    goto :goto_7

    .line 461
    :cond_1b
    invoke-static {v0, p1}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 462
    .line 463
    .line 464
    new-instance p1, Lv7/k;

    .line 465
    .line 466
    invoke-direct {p1, v1, v3, v2}, Lv7/k;-><init>(ILjava/lang/String;I)V

    .line 467
    .line 468
    .line 469
    return-object p1

    .line 470
    :pswitch_9
    invoke-static {p1}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 471
    .line 472
    .line 473
    move-result v0

    .line 474
    const/4 v1, 0x0

    .line 475
    move-object v2, v1

    .line 476
    move-object v3, v2

    .line 477
    move-object v4, v3

    .line 478
    :goto_8
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 479
    .line 480
    .line 481
    move-result v5

    .line 482
    if-ge v5, v0, :cond_20

    .line 483
    .line 484
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 485
    .line 486
    .line 487
    move-result v5

    .line 488
    int-to-char v6, v5

    .line 489
    const/4 v7, 0x2

    .line 490
    if-eq v6, v7, :cond_1f

    .line 491
    .line 492
    const/4 v7, 0x3

    .line 493
    if-eq v6, v7, :cond_1e

    .line 494
    .line 495
    const/4 v7, 0x4

    .line 496
    if-eq v6, v7, :cond_1d

    .line 497
    .line 498
    const/4 v7, 0x5

    .line 499
    if-eq v6, v7, :cond_1c

    .line 500
    .line 501
    invoke-static {v5, p1}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 502
    .line 503
    .line 504
    goto :goto_8

    .line 505
    :cond_1c
    invoke-static {v5, p1}, LU8/v0;->z(ILandroid/os/Parcel;)[Ljava/lang/String;

    .line 506
    .line 507
    .line 508
    move-result-object v4

    .line 509
    goto :goto_8

    .line 510
    :cond_1d
    invoke-static {v5, p1}, LU8/v0;->r(ILandroid/os/Parcel;)[B

    .line 511
    .line 512
    .line 513
    move-result-object v3

    .line 514
    goto :goto_8

    .line 515
    :cond_1e
    invoke-static {v5, p1}, LU8/v0;->r(ILandroid/os/Parcel;)[B

    .line 516
    .line 517
    .line 518
    move-result-object v2

    .line 519
    goto :goto_8

    .line 520
    :cond_1f
    invoke-static {v5, p1}, LU8/v0;->r(ILandroid/os/Parcel;)[B

    .line 521
    .line 522
    .line 523
    move-result-object v1

    .line 524
    goto :goto_8

    .line 525
    :cond_20
    invoke-static {v0, p1}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 526
    .line 527
    .line 528
    new-instance p1, Lv7/j;

    .line 529
    .line 530
    invoke-direct {p1, v1, v2, v3, v4}, Lv7/j;-><init>([B[B[B[Ljava/lang/String;)V

    .line 531
    .line 532
    .line 533
    return-object p1

    .line 534
    :pswitch_a
    invoke-static {p1}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 535
    .line 536
    .line 537
    move-result v0

    .line 538
    const/4 v1, 0x0

    .line 539
    move-object v3, v1

    .line 540
    move-object v4, v3

    .line 541
    move-object v5, v4

    .line 542
    move-object v6, v5

    .line 543
    move-object v7, v6

    .line 544
    :goto_9
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 545
    .line 546
    .line 547
    move-result v1

    .line 548
    if-ge v1, v0, :cond_26

    .line 549
    .line 550
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 551
    .line 552
    .line 553
    move-result v1

    .line 554
    int-to-char v2, v1

    .line 555
    const/4 v8, 0x2

    .line 556
    if-eq v2, v8, :cond_25

    .line 557
    .line 558
    const/4 v8, 0x3

    .line 559
    if-eq v2, v8, :cond_24

    .line 560
    .line 561
    const/4 v8, 0x4

    .line 562
    if-eq v2, v8, :cond_23

    .line 563
    .line 564
    const/4 v8, 0x5

    .line 565
    if-eq v2, v8, :cond_22

    .line 566
    .line 567
    const/4 v8, 0x6

    .line 568
    if-eq v2, v8, :cond_21

    .line 569
    .line 570
    invoke-static {v1, p1}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 571
    .line 572
    .line 573
    goto :goto_9

    .line 574
    :cond_21
    invoke-static {v1, p1}, LU8/v0;->r(ILandroid/os/Parcel;)[B

    .line 575
    .line 576
    .line 577
    move-result-object v7

    .line 578
    goto :goto_9

    .line 579
    :cond_22
    invoke-static {v1, p1}, LU8/v0;->r(ILandroid/os/Parcel;)[B

    .line 580
    .line 581
    .line 582
    move-result-object v6

    .line 583
    goto :goto_9

    .line 584
    :cond_23
    invoke-static {v1, p1}, LU8/v0;->r(ILandroid/os/Parcel;)[B

    .line 585
    .line 586
    .line 587
    move-result-object v5

    .line 588
    goto :goto_9

    .line 589
    :cond_24
    invoke-static {v1, p1}, LU8/v0;->r(ILandroid/os/Parcel;)[B

    .line 590
    .line 591
    .line 592
    move-result-object v4

    .line 593
    goto :goto_9

    .line 594
    :cond_25
    invoke-static {v1, p1}, LU8/v0;->r(ILandroid/os/Parcel;)[B

    .line 595
    .line 596
    .line 597
    move-result-object v3

    .line 598
    goto :goto_9

    .line 599
    :cond_26
    invoke-static {v0, p1}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 600
    .line 601
    .line 602
    new-instance v2, Lv7/i;

    .line 603
    .line 604
    invoke-direct/range {v2 .. v7}, Lv7/i;-><init>([B[B[B[B[B)V

    .line 605
    .line 606
    .line 607
    return-object v2

    .line 608
    :pswitch_b
    invoke-static {p1}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 609
    .line 610
    .line 611
    move-result v0

    .line 612
    const/4 v1, 0x0

    .line 613
    const/4 v2, 0x0

    .line 614
    :goto_a
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 615
    .line 616
    .line 617
    move-result v3

    .line 618
    if-ge v3, v0, :cond_29

    .line 619
    .line 620
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 621
    .line 622
    .line 623
    move-result v3

    .line 624
    int-to-char v4, v3

    .line 625
    const/4 v5, 0x1

    .line 626
    if-eq v4, v5, :cond_28

    .line 627
    .line 628
    const/4 v5, 0x2

    .line 629
    if-eq v4, v5, :cond_27

    .line 630
    .line 631
    invoke-static {v3, p1}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 632
    .line 633
    .line 634
    goto :goto_a

    .line 635
    :cond_27
    invoke-static {v3, p1}, LU8/v0;->r(ILandroid/os/Parcel;)[B

    .line 636
    .line 637
    .line 638
    move-result-object v1

    .line 639
    goto :goto_a

    .line 640
    :cond_28
    invoke-static {v3, p1}, LU8/v0;->Z(ILandroid/os/Parcel;)Z

    .line 641
    .line 642
    .line 643
    move-result v2

    .line 644
    goto :goto_a

    .line 645
    :cond_29
    invoke-static {v0, p1}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 646
    .line 647
    .line 648
    new-instance p1, Lv7/Y;

    .line 649
    .line 650
    invoke-direct {p1, v2, v1}, Lv7/Y;-><init>(Z[B)V

    .line 651
    .line 652
    .line 653
    return-object p1

    .line 654
    :pswitch_c
    invoke-static {p1}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 655
    .line 656
    .line 657
    move-result v0

    .line 658
    const/4 v1, 0x0

    .line 659
    move-object v2, v1

    .line 660
    :goto_b
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 661
    .line 662
    .line 663
    move-result v3

    .line 664
    if-ge v3, v0, :cond_2c

    .line 665
    .line 666
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 667
    .line 668
    .line 669
    move-result v3

    .line 670
    int-to-char v4, v3

    .line 671
    const/4 v5, 0x1

    .line 672
    if-eq v4, v5, :cond_2b

    .line 673
    .line 674
    const/4 v5, 0x2

    .line 675
    if-eq v4, v5, :cond_2a

    .line 676
    .line 677
    invoke-static {v3, p1}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 678
    .line 679
    .line 680
    goto :goto_b

    .line 681
    :cond_2a
    invoke-static {v3, p1}, LU8/v0;->r(ILandroid/os/Parcel;)[B

    .line 682
    .line 683
    .line 684
    move-result-object v2

    .line 685
    goto :goto_b

    .line 686
    :cond_2b
    invoke-static {v3, p1}, LU8/v0;->r(ILandroid/os/Parcel;)[B

    .line 687
    .line 688
    .line 689
    move-result-object v1

    .line 690
    goto :goto_b

    .line 691
    :cond_2c
    invoke-static {v0, p1}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 692
    .line 693
    .line 694
    new-instance p1, Lv7/X;

    .line 695
    .line 696
    invoke-direct {p1, v1, v2}, Lv7/X;-><init>([B[B)V

    .line 697
    .line 698
    .line 699
    return-object p1

    .line 700
    :pswitch_d
    invoke-static {p1}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 701
    .line 702
    .line 703
    move-result v0

    .line 704
    const/4 v1, 0x0

    .line 705
    :goto_c
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 706
    .line 707
    .line 708
    move-result v2

    .line 709
    if-ge v2, v0, :cond_2e

    .line 710
    .line 711
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 712
    .line 713
    .line 714
    move-result v2

    .line 715
    int-to-char v3, v2

    .line 716
    const/4 v4, 0x1

    .line 717
    if-eq v3, v4, :cond_2d

    .line 718
    .line 719
    invoke-static {v2, p1}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 720
    .line 721
    .line 722
    goto :goto_c

    .line 723
    :cond_2d
    invoke-static {v2, p1}, LU8/v0;->Z(ILandroid/os/Parcel;)Z

    .line 724
    .line 725
    .line 726
    move-result v1

    .line 727
    goto :goto_c

    .line 728
    :cond_2e
    invoke-static {v0, p1}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 729
    .line 730
    .line 731
    new-instance p1, Lv7/h;

    .line 732
    .line 733
    invoke-direct {p1, v1}, Lv7/h;-><init>(Z)V

    .line 734
    .line 735
    .line 736
    return-object p1

    .line 737
    :pswitch_e
    invoke-static {p1}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 738
    .line 739
    .line 740
    move-result v0

    .line 741
    const/4 v1, 0x0

    .line 742
    move-object v3, v1

    .line 743
    move-object v4, v3

    .line 744
    move-object v5, v4

    .line 745
    move-object v6, v5

    .line 746
    move-object v7, v6

    .line 747
    move-object v8, v7

    .line 748
    move-object v9, v8

    .line 749
    move-object v10, v9

    .line 750
    move-object v11, v10

    .line 751
    move-object v12, v11

    .line 752
    :goto_d
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 753
    .line 754
    .line 755
    move-result v1

    .line 756
    if-ge v1, v0, :cond_2f

    .line 757
    .line 758
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 759
    .line 760
    .line 761
    move-result v1

    .line 762
    int-to-char v2, v1

    .line 763
    packed-switch v2, :pswitch_data_1

    .line 764
    .line 765
    .line 766
    invoke-static {v1, p1}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 767
    .line 768
    .line 769
    goto :goto_d

    .line 770
    :pswitch_f
    sget-object v2, Lv7/T;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 771
    .line 772
    invoke-static {p1, v1, v2}, LU8/v0;->x(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 773
    .line 774
    .line 775
    move-result-object v1

    .line 776
    move-object v12, v1

    .line 777
    check-cast v12, Lv7/T;

    .line 778
    .line 779
    goto :goto_d

    .line 780
    :pswitch_10
    sget-object v2, Lv7/w;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 781
    .line 782
    invoke-static {p1, v1, v2}, LU8/v0;->x(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 783
    .line 784
    .line 785
    move-result-object v1

    .line 786
    move-object v11, v1

    .line 787
    check-cast v11, Lv7/w;

    .line 788
    .line 789
    goto :goto_d

    .line 790
    :pswitch_11
    sget-object v2, Lv7/S;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 791
    .line 792
    invoke-static {p1, v1, v2}, LU8/v0;->x(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 793
    .line 794
    .line 795
    move-result-object v1

    .line 796
    move-object v10, v1

    .line 797
    check-cast v10, Lv7/S;

    .line 798
    .line 799
    goto :goto_d

    .line 800
    :pswitch_12
    sget-object v2, Lv7/b0;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 801
    .line 802
    invoke-static {p1, v1, v2}, LU8/v0;->x(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 803
    .line 804
    .line 805
    move-result-object v1

    .line 806
    move-object v9, v1

    .line 807
    check-cast v9, Lv7/b0;

    .line 808
    .line 809
    goto :goto_d

    .line 810
    :pswitch_13
    sget-object v2, Lv7/Q;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 811
    .line 812
    invoke-static {p1, v1, v2}, LU8/v0;->x(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 813
    .line 814
    .line 815
    move-result-object v1

    .line 816
    move-object v8, v1

    .line 817
    check-cast v8, Lv7/Q;

    .line 818
    .line 819
    goto :goto_d

    .line 820
    :pswitch_14
    sget-object v2, Lv7/P;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 821
    .line 822
    invoke-static {p1, v1, v2}, LU8/v0;->x(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 823
    .line 824
    .line 825
    move-result-object v1

    .line 826
    move-object v7, v1

    .line 827
    check-cast v7, Lv7/P;

    .line 828
    .line 829
    goto :goto_d

    .line 830
    :pswitch_15
    sget-object v2, Lv7/c0;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 831
    .line 832
    invoke-static {p1, v1, v2}, LU8/v0;->x(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 833
    .line 834
    .line 835
    move-result-object v1

    .line 836
    move-object v6, v1

    .line 837
    check-cast v6, Lv7/c0;

    .line 838
    .line 839
    goto :goto_d

    .line 840
    :pswitch_16
    sget-object v2, Lv7/M;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 841
    .line 842
    invoke-static {p1, v1, v2}, LU8/v0;->x(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 843
    .line 844
    .line 845
    move-result-object v1

    .line 846
    move-object v5, v1

    .line 847
    check-cast v5, Lv7/M;

    .line 848
    .line 849
    goto :goto_d

    .line 850
    :pswitch_17
    sget-object v2, Lv7/a0;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 851
    .line 852
    invoke-static {p1, v1, v2}, LU8/v0;->x(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 853
    .line 854
    .line 855
    move-result-object v1

    .line 856
    move-object v4, v1

    .line 857
    check-cast v4, Lv7/a0;

    .line 858
    .line 859
    goto :goto_d

    .line 860
    :pswitch_18
    sget-object v2, Lv7/v;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 861
    .line 862
    invoke-static {p1, v1, v2}, LU8/v0;->x(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 863
    .line 864
    .line 865
    move-result-object v1

    .line 866
    move-object v3, v1

    .line 867
    check-cast v3, Lv7/v;

    .line 868
    .line 869
    goto :goto_d

    .line 870
    :cond_2f
    invoke-static {v0, p1}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 871
    .line 872
    .line 873
    new-instance v2, Lv7/f;

    .line 874
    .line 875
    invoke-direct/range {v2 .. v12}, Lv7/f;-><init>(Lv7/v;Lv7/a0;Lv7/M;Lv7/c0;Lv7/P;Lv7/Q;Lv7/b0;Lv7/S;Lv7/w;Lv7/T;)V

    .line 876
    .line 877
    .line 878
    return-object v2

    .line 879
    :pswitch_19
    invoke-static {p1}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 880
    .line 881
    .line 882
    move-result v0

    .line 883
    const/4 v1, 0x0

    .line 884
    move-object v2, v1

    .line 885
    move-object v3, v2

    .line 886
    move-object v4, v3

    .line 887
    :goto_e
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 888
    .line 889
    .line 890
    move-result v5

    .line 891
    if-ge v5, v0, :cond_34

    .line 892
    .line 893
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 894
    .line 895
    .line 896
    move-result v5

    .line 897
    int-to-char v6, v5

    .line 898
    const/4 v7, 0x1

    .line 899
    if-eq v6, v7, :cond_33

    .line 900
    .line 901
    const/4 v7, 0x2

    .line 902
    if-eq v6, v7, :cond_32

    .line 903
    .line 904
    const/4 v7, 0x3

    .line 905
    if-eq v6, v7, :cond_31

    .line 906
    .line 907
    const/4 v7, 0x4

    .line 908
    if-eq v6, v7, :cond_30

    .line 909
    .line 910
    invoke-static {v5, p1}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 911
    .line 912
    .line 913
    goto :goto_e

    .line 914
    :cond_30
    sget-object v4, Lv7/Y;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 915
    .line 916
    invoke-static {p1, v5, v4}, LU8/v0;->x(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 917
    .line 918
    .line 919
    move-result-object v4

    .line 920
    check-cast v4, Lv7/Y;

    .line 921
    .line 922
    goto :goto_e

    .line 923
    :cond_31
    sget-object v3, Lv7/h;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 924
    .line 925
    invoke-static {p1, v5, v3}, LU8/v0;->x(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 926
    .line 927
    .line 928
    move-result-object v3

    .line 929
    check-cast v3, Lv7/h;

    .line 930
    .line 931
    goto :goto_e

    .line 932
    :cond_32
    sget-object v2, Lv7/X;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 933
    .line 934
    invoke-static {p1, v5, v2}, LU8/v0;->x(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 935
    .line 936
    .line 937
    move-result-object v2

    .line 938
    check-cast v2, Lv7/X;

    .line 939
    .line 940
    goto :goto_e

    .line 941
    :cond_33
    sget-object v1, Lv7/N;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 942
    .line 943
    invoke-static {p1, v5, v1}, LU8/v0;->x(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 944
    .line 945
    .line 946
    move-result-object v1

    .line 947
    check-cast v1, Lv7/N;

    .line 948
    .line 949
    goto :goto_e

    .line 950
    :cond_34
    invoke-static {v0, p1}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 951
    .line 952
    .line 953
    new-instance p1, Lv7/g;

    .line 954
    .line 955
    invoke-direct {p1, v1, v2, v3, v4}, Lv7/g;-><init>(Lv7/N;Lv7/X;Lv7/h;Lv7/Y;)V

    .line 956
    .line 957
    .line 958
    return-object p1

    .line 959
    :pswitch_1a
    invoke-static {p1}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 960
    .line 961
    .line 962
    move-result v0

    .line 963
    const/4 v1, 0x0

    .line 964
    move v2, v1

    .line 965
    move v3, v2

    .line 966
    :goto_f
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 967
    .line 968
    .line 969
    move-result v4

    .line 970
    if-ge v4, v0, :cond_38

    .line 971
    .line 972
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 973
    .line 974
    .line 975
    move-result v4

    .line 976
    int-to-char v5, v4

    .line 977
    const/4 v6, 0x1

    .line 978
    if-eq v5, v6, :cond_37

    .line 979
    .line 980
    const/4 v6, 0x2

    .line 981
    const/4 v7, 0x4

    .line 982
    if-eq v5, v6, :cond_36

    .line 983
    .line 984
    const/4 v6, 0x3

    .line 985
    if-eq v5, v6, :cond_35

    .line 986
    .line 987
    invoke-static {v4, p1}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 988
    .line 989
    .line 990
    goto :goto_f

    .line 991
    :cond_35
    invoke-static {p1, v4, v7}, LU8/v0;->r0(Landroid/os/Parcel;II)V

    .line 992
    .line 993
    .line 994
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 995
    .line 996
    .line 997
    move-result v3

    .line 998
    int-to-short v3, v3

    .line 999
    goto :goto_f

    .line 1000
    :cond_36
    invoke-static {p1, v4, v7}, LU8/v0;->r0(Landroid/os/Parcel;II)V

    .line 1001
    .line 1002
    .line 1003
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 1004
    .line 1005
    .line 1006
    move-result v2

    .line 1007
    int-to-short v2, v2

    .line 1008
    goto :goto_f

    .line 1009
    :cond_37
    invoke-static {v4, p1}, LU8/v0;->f0(ILandroid/os/Parcel;)I

    .line 1010
    .line 1011
    .line 1012
    move-result v1

    .line 1013
    goto :goto_f

    .line 1014
    :cond_38
    invoke-static {v0, p1}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 1015
    .line 1016
    .line 1017
    new-instance p1, Lv7/O;

    .line 1018
    .line 1019
    invoke-direct {p1, v1, v2, v3}, Lv7/O;-><init>(ISS)V

    .line 1020
    .line 1021
    .line 1022
    return-object p1

    .line 1023
    :pswitch_1b
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1024
    .line 1025
    .line 1026
    move-result-object p1

    .line 1027
    :try_start_2
    invoke-static {p1}, Lv7/e;->c(Ljava/lang/String;)Lv7/e;

    .line 1028
    .line 1029
    .line 1030
    move-result-object p1
    :try_end_2
    .catch Lv7/d; {:try_start_2 .. :try_end_2} :catch_2

    .line 1031
    return-object p1

    .line 1032
    :catch_2
    move-exception v0

    .line 1033
    move-object p1, v0

    .line 1034
    new-instance v0, Ljava/lang/RuntimeException;

    .line 1035
    .line 1036
    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 1037
    .line 1038
    .line 1039
    throw v0

    .line 1040
    :pswitch_1c
    invoke-static {p1}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 1041
    .line 1042
    .line 1043
    move-result v0

    .line 1044
    const/4 v1, 0x0

    .line 1045
    :goto_10
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 1046
    .line 1047
    .line 1048
    move-result v2

    .line 1049
    if-ge v2, v0, :cond_3a

    .line 1050
    .line 1051
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 1052
    .line 1053
    .line 1054
    move-result v2

    .line 1055
    int-to-char v3, v2

    .line 1056
    const/4 v4, 0x1

    .line 1057
    if-eq v3, v4, :cond_39

    .line 1058
    .line 1059
    invoke-static {v2, p1}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 1060
    .line 1061
    .line 1062
    goto :goto_10

    .line 1063
    :cond_39
    sget-object v1, Lv7/O;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1064
    .line 1065
    invoke-static {p1, v2, v1}, LU8/v0;->C(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 1066
    .line 1067
    .line 1068
    move-result-object v1

    .line 1069
    goto :goto_10

    .line 1070
    :cond_3a
    invoke-static {v0, p1}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 1071
    .line 1072
    .line 1073
    new-instance p1, Lv7/N;

    .line 1074
    .line 1075
    invoke-direct {p1, v1}, Lv7/N;-><init>(Ljava/util/ArrayList;)V

    .line 1076
    .line 1077
    .line 1078
    return-object p1

    .line 1079
    :pswitch_1d
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1080
    .line 1081
    .line 1082
    move-result-object p1

    .line 1083
    :try_start_3
    invoke-static {p1}, Lv7/W;->c(Ljava/lang/String;)Lv7/W;

    .line 1084
    .line 1085
    .line 1086
    move-result-object p1
    :try_end_3
    .catch Lv7/V; {:try_start_3 .. :try_end_3} :catch_3

    .line 1087
    return-object p1

    .line 1088
    :catch_3
    move-exception v0

    .line 1089
    move-object p1, v0

    .line 1090
    new-instance v0, Ljava/lang/RuntimeException;

    .line 1091
    .line 1092
    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 1093
    .line 1094
    .line 1095
    throw v0

    .line 1096
    :pswitch_1e
    invoke-static {p1}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 1097
    .line 1098
    .line 1099
    move-result v0

    .line 1100
    const/4 v1, 0x0

    .line 1101
    :goto_11
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 1102
    .line 1103
    .line 1104
    move-result v2

    .line 1105
    if-ge v2, v0, :cond_3c

    .line 1106
    .line 1107
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 1108
    .line 1109
    .line 1110
    move-result v2

    .line 1111
    int-to-char v3, v2

    .line 1112
    const/4 v4, 0x1

    .line 1113
    if-eq v3, v4, :cond_3b

    .line 1114
    .line 1115
    invoke-static {v2, p1}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 1116
    .line 1117
    .line 1118
    goto :goto_11

    .line 1119
    :cond_3b
    invoke-static {v2, p1}, LU8/v0;->Z(ILandroid/os/Parcel;)Z

    .line 1120
    .line 1121
    .line 1122
    move-result v1

    .line 1123
    goto :goto_11

    .line 1124
    :cond_3c
    invoke-static {v0, p1}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 1125
    .line 1126
    .line 1127
    new-instance p1, Lv7/M;

    .line 1128
    .line 1129
    invoke-direct {p1, v1}, Lv7/M;-><init>(Z)V

    .line 1130
    .line 1131
    .line 1132
    return-object p1

    .line 1133
    :pswitch_1f
    invoke-static {p1}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 1134
    .line 1135
    .line 1136
    move-result v0

    .line 1137
    const/4 v1, 0x0

    .line 1138
    move-object v2, v1

    .line 1139
    :goto_12
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 1140
    .line 1141
    .line 1142
    move-result v3

    .line 1143
    if-ge v3, v0, :cond_3f

    .line 1144
    .line 1145
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 1146
    .line 1147
    .line 1148
    move-result v3

    .line 1149
    int-to-char v4, v3

    .line 1150
    const/4 v5, 0x2

    .line 1151
    if-eq v4, v5, :cond_3e

    .line 1152
    .line 1153
    const/4 v5, 0x3

    .line 1154
    if-eq v4, v5, :cond_3d

    .line 1155
    .line 1156
    invoke-static {v3, p1}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 1157
    .line 1158
    .line 1159
    goto :goto_12

    .line 1160
    :cond_3d
    invoke-static {v3, p1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1161
    .line 1162
    .line 1163
    move-result-object v2

    .line 1164
    goto :goto_12

    .line 1165
    :cond_3e
    invoke-static {v3, p1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1166
    .line 1167
    .line 1168
    move-result-object v1

    .line 1169
    goto :goto_12

    .line 1170
    :cond_3f
    invoke-static {v0, p1}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 1171
    .line 1172
    .line 1173
    new-instance p1, Lv7/L;

    .line 1174
    .line 1175
    invoke-direct {p1, v1, v2}, Lv7/L;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 1176
    .line 1177
    .line 1178
    return-object p1

    .line 1179
    :pswitch_20
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1180
    .line 1181
    .line 1182
    move-result-object p1

    .line 1183
    :try_start_4
    invoke-static {p1}, Lv7/J;->c(Ljava/lang/String;)Lv7/J;

    .line 1184
    .line 1185
    .line 1186
    move-result-object p1
    :try_end_4
    .catch Lv7/K; {:try_start_4 .. :try_end_4} :catch_4

    .line 1187
    return-object p1

    .line 1188
    :catch_4
    move-exception v0

    .line 1189
    move-object p1, v0

    .line 1190
    new-instance v0, Ljava/lang/RuntimeException;

    .line 1191
    .line 1192
    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 1193
    .line 1194
    .line 1195
    throw v0

    .line 1196
    :pswitch_21
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1197
    .line 1198
    .line 1199
    move-result-object p1

    .line 1200
    if-nez p1, :cond_40

    .line 1201
    .line 1202
    :try_start_5
    const-string p1, ""

    .line 1203
    .line 1204
    goto :goto_13

    .line 1205
    :catch_5
    move-exception v0

    .line 1206
    move-object p1, v0

    .line 1207
    goto :goto_14

    .line 1208
    :cond_40
    :goto_13
    invoke-static {p1}, Lv7/I;->c(Ljava/lang/String;)Lv7/I;

    .line 1209
    .line 1210
    .line 1211
    move-result-object p1
    :try_end_5
    .catch Lv7/H; {:try_start_5 .. :try_end_5} :catch_5

    .line 1212
    return-object p1

    .line 1213
    :goto_14
    new-instance v0, Ljava/lang/RuntimeException;

    .line 1214
    .line 1215
    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 1216
    .line 1217
    .line 1218
    throw v0

    .line 1219
    :pswitch_22
    invoke-static {p1}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 1220
    .line 1221
    .line 1222
    move-result v0

    .line 1223
    const/4 v1, 0x0

    .line 1224
    move-object v2, v1

    .line 1225
    move-object v3, v2

    .line 1226
    move-object v4, v3

    .line 1227
    :goto_15
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 1228
    .line 1229
    .line 1230
    move-result v5

    .line 1231
    if-ge v5, v0, :cond_45

    .line 1232
    .line 1233
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 1234
    .line 1235
    .line 1236
    move-result v5

    .line 1237
    int-to-char v6, v5

    .line 1238
    const/4 v7, 0x2

    .line 1239
    if-eq v6, v7, :cond_44

    .line 1240
    .line 1241
    const/4 v7, 0x3

    .line 1242
    if-eq v6, v7, :cond_43

    .line 1243
    .line 1244
    const/4 v7, 0x4

    .line 1245
    if-eq v6, v7, :cond_42

    .line 1246
    .line 1247
    const/4 v7, 0x5

    .line 1248
    if-eq v6, v7, :cond_41

    .line 1249
    .line 1250
    invoke-static {v5, p1}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 1251
    .line 1252
    .line 1253
    goto :goto_15

    .line 1254
    :cond_41
    invoke-static {v5, p1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1255
    .line 1256
    .line 1257
    move-result-object v4

    .line 1258
    goto :goto_15

    .line 1259
    :cond_42
    invoke-static {v5, p1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1260
    .line 1261
    .line 1262
    move-result-object v3

    .line 1263
    goto :goto_15

    .line 1264
    :cond_43
    invoke-static {v5, p1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1265
    .line 1266
    .line 1267
    move-result-object v2

    .line 1268
    goto :goto_15

    .line 1269
    :cond_44
    invoke-static {v5, p1}, LU8/v0;->r(ILandroid/os/Parcel;)[B

    .line 1270
    .line 1271
    .line 1272
    move-result-object v1

    .line 1273
    goto :goto_15

    .line 1274
    :cond_45
    invoke-static {v0, p1}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 1275
    .line 1276
    .line 1277
    new-instance p1, Lv7/F;

    .line 1278
    .line 1279
    invoke-direct {p1, v2, v3, v4, v1}, Lv7/F;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[B)V

    .line 1280
    .line 1281
    .line 1282
    return-object p1

    .line 1283
    :pswitch_23
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1284
    .line 1285
    .line 1286
    move-result-object p1

    .line 1287
    :try_start_6
    invoke-static {p1}, Lv7/E;->c(Ljava/lang/String;)Lv7/E;

    .line 1288
    .line 1289
    .line 1290
    move-result-object p1
    :try_end_6
    .catch Lv7/D; {:try_start_6 .. :try_end_6} :catch_6

    .line 1291
    return-object p1

    .line 1292
    :catch_6
    move-exception v0

    .line 1293
    move-object p1, v0

    .line 1294
    new-instance v0, Ljava/lang/RuntimeException;

    .line 1295
    .line 1296
    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 1297
    .line 1298
    .line 1299
    throw v0

    .line 1300
    :pswitch_24
    invoke-static {p1}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 1301
    .line 1302
    .line 1303
    move-result v0

    .line 1304
    const/4 v1, 0x0

    .line 1305
    move-object v2, v1

    .line 1306
    move-object v3, v2

    .line 1307
    :goto_16
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 1308
    .line 1309
    .line 1310
    move-result v4

    .line 1311
    if-ge v4, v0, :cond_49

    .line 1312
    .line 1313
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 1314
    .line 1315
    .line 1316
    move-result v4

    .line 1317
    int-to-char v5, v4

    .line 1318
    const/4 v6, 0x2

    .line 1319
    if-eq v5, v6, :cond_48

    .line 1320
    .line 1321
    const/4 v6, 0x3

    .line 1322
    if-eq v5, v6, :cond_47

    .line 1323
    .line 1324
    const/4 v6, 0x4

    .line 1325
    if-eq v5, v6, :cond_46

    .line 1326
    .line 1327
    invoke-static {v4, p1}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 1328
    .line 1329
    .line 1330
    goto :goto_16

    .line 1331
    :cond_46
    invoke-static {v4, p1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1332
    .line 1333
    .line 1334
    move-result-object v3

    .line 1335
    goto :goto_16

    .line 1336
    :cond_47
    invoke-static {v4, p1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1337
    .line 1338
    .line 1339
    move-result-object v2

    .line 1340
    goto :goto_16

    .line 1341
    :cond_48
    invoke-static {v4, p1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1342
    .line 1343
    .line 1344
    move-result-object v1

    .line 1345
    goto :goto_16

    .line 1346
    :cond_49
    invoke-static {v0, p1}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 1347
    .line 1348
    .line 1349
    new-instance p1, Lv7/C;

    .line 1350
    .line 1351
    invoke-direct {p1, v1, v2, v3}, Lv7/C;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1352
    .line 1353
    .line 1354
    return-object p1

    .line 1355
    :pswitch_25
    invoke-static {p1}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 1356
    .line 1357
    .line 1358
    move-result v0

    .line 1359
    const/4 v1, 0x0

    .line 1360
    move-object v3, v1

    .line 1361
    move-object v4, v3

    .line 1362
    move-object v5, v4

    .line 1363
    move-object v6, v5

    .line 1364
    move-object v7, v6

    .line 1365
    move-object v8, v7

    .line 1366
    move-object v9, v8

    .line 1367
    move-object v10, v9

    .line 1368
    move-object v11, v10

    .line 1369
    :goto_17
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 1370
    .line 1371
    .line 1372
    move-result v1

    .line 1373
    if-ge v1, v0, :cond_4a

    .line 1374
    .line 1375
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 1376
    .line 1377
    .line 1378
    move-result v1

    .line 1379
    int-to-char v2, v1

    .line 1380
    packed-switch v2, :pswitch_data_2

    .line 1381
    .line 1382
    .line 1383
    invoke-static {v1, p1}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 1384
    .line 1385
    .line 1386
    goto :goto_17

    .line 1387
    :pswitch_26
    invoke-static {v1, p1}, LU8/v0;->i0(ILandroid/os/Parcel;)Ljava/lang/Long;

    .line 1388
    .line 1389
    .line 1390
    move-result-object v11

    .line 1391
    goto :goto_17

    .line 1392
    :pswitch_27
    sget-object v2, Lv7/f;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1393
    .line 1394
    invoke-static {p1, v1, v2}, LU8/v0;->x(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1395
    .line 1396
    .line 1397
    move-result-object v1

    .line 1398
    move-object v10, v1

    .line 1399
    check-cast v10, Lv7/f;

    .line 1400
    .line 1401
    goto :goto_17

    .line 1402
    :pswitch_28
    invoke-static {v1, p1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1403
    .line 1404
    .line 1405
    move-result-object v9

    .line 1406
    goto :goto_17

    .line 1407
    :pswitch_29
    sget-object v2, Lv7/L;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1408
    .line 1409
    invoke-static {p1, v1, v2}, LU8/v0;->x(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1410
    .line 1411
    .line 1412
    move-result-object v1

    .line 1413
    move-object v8, v1

    .line 1414
    check-cast v8, Lv7/L;

    .line 1415
    .line 1416
    goto :goto_17

    .line 1417
    :pswitch_2a
    invoke-static {v1, p1}, LU8/v0;->g0(ILandroid/os/Parcel;)Ljava/lang/Integer;

    .line 1418
    .line 1419
    .line 1420
    move-result-object v7

    .line 1421
    goto :goto_17

    .line 1422
    :pswitch_2b
    sget-object v2, Lv7/z;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1423
    .line 1424
    invoke-static {p1, v1, v2}, LU8/v0;->C(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 1425
    .line 1426
    .line 1427
    move-result-object v6

    .line 1428
    goto :goto_17

    .line 1429
    :pswitch_2c
    invoke-static {v1, p1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1430
    .line 1431
    .line 1432
    move-result-object v5

    .line 1433
    goto :goto_17

    .line 1434
    :pswitch_2d
    invoke-static {v1, p1}, LU8/v0;->b0(ILandroid/os/Parcel;)Ljava/lang/Double;

    .line 1435
    .line 1436
    .line 1437
    move-result-object v4

    .line 1438
    goto :goto_17

    .line 1439
    :pswitch_2e
    invoke-static {v1, p1}, LU8/v0;->r(ILandroid/os/Parcel;)[B

    .line 1440
    .line 1441
    .line 1442
    move-result-object v3

    .line 1443
    goto :goto_17

    .line 1444
    :cond_4a
    invoke-static {v0, p1}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 1445
    .line 1446
    .line 1447
    new-instance v2, Lv7/B;

    .line 1448
    .line 1449
    invoke-direct/range {v2 .. v11}, Lv7/B;-><init>([BLjava/lang/Double;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/Integer;Lv7/L;Ljava/lang/String;Lv7/f;Ljava/lang/Long;)V

    .line 1450
    .line 1451
    .line 1452
    return-object v2

    .line 1453
    :pswitch_2f
    invoke-static {p1}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 1454
    .line 1455
    .line 1456
    move-result v0

    .line 1457
    const/4 v1, 0x0

    .line 1458
    move-object v2, v1

    .line 1459
    :goto_18
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 1460
    .line 1461
    .line 1462
    move-result v3

    .line 1463
    if-ge v3, v0, :cond_4d

    .line 1464
    .line 1465
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 1466
    .line 1467
    .line 1468
    move-result v3

    .line 1469
    int-to-char v4, v3

    .line 1470
    const/4 v5, 0x2

    .line 1471
    if-eq v4, v5, :cond_4c

    .line 1472
    .line 1473
    const/4 v5, 0x3

    .line 1474
    if-eq v4, v5, :cond_4b

    .line 1475
    .line 1476
    invoke-static {v3, p1}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 1477
    .line 1478
    .line 1479
    goto :goto_18

    .line 1480
    :cond_4b
    invoke-static {v3, p1}, LU8/v0;->g0(ILandroid/os/Parcel;)Ljava/lang/Integer;

    .line 1481
    .line 1482
    .line 1483
    move-result-object v2

    .line 1484
    goto :goto_18

    .line 1485
    :cond_4c
    invoke-static {v3, p1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1486
    .line 1487
    .line 1488
    move-result-object v1

    .line 1489
    goto :goto_18

    .line 1490
    :cond_4d
    invoke-static {v0, p1}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 1491
    .line 1492
    .line 1493
    new-instance p1, Lv7/A;

    .line 1494
    .line 1495
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 1496
    .line 1497
    .line 1498
    move-result v0

    .line 1499
    invoke-direct {p1, v1, v0}, Lv7/A;-><init>(Ljava/lang/String;I)V

    .line 1500
    .line 1501
    .line 1502
    return-object p1

    .line 1503
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2f
        :pswitch_25
        :pswitch_24
        :pswitch_23
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

    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    :pswitch_data_1
    .packed-switch 0x2
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
    .end packed-switch

    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    :pswitch_data_2
    .packed-switch 0x2
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
    .end packed-switch
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lv7/U;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-array p1, p1, [Lv7/v;

    .line 7
    .line 8
    return-object p1

    .line 9
    :pswitch_0
    new-array p1, p1, [Lv7/u;

    .line 10
    .line 11
    return-object p1

    .line 12
    :pswitch_1
    new-array p1, p1, [Lv7/b0;

    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_2
    new-array p1, p1, [Lv7/a0;

    .line 16
    .line 17
    return-object p1

    .line 18
    :pswitch_3
    new-array p1, p1, [Lv7/Z;

    .line 19
    .line 20
    return-object p1

    .line 21
    :pswitch_4
    new-array p1, p1, [Lv7/r;

    .line 22
    .line 23
    return-object p1

    .line 24
    :pswitch_5
    new-array p1, p1, [Lv7/o;

    .line 25
    .line 26
    return-object p1

    .line 27
    :pswitch_6
    new-array p1, p1, [Lv7/n;

    .line 28
    .line 29
    return-object p1

    .line 30
    :pswitch_7
    new-array p1, p1, [Lv7/m;

    .line 31
    .line 32
    return-object p1

    .line 33
    :pswitch_8
    new-array p1, p1, [Lv7/k;

    .line 34
    .line 35
    return-object p1

    .line 36
    :pswitch_9
    new-array p1, p1, [Lv7/j;

    .line 37
    .line 38
    return-object p1

    .line 39
    :pswitch_a
    new-array p1, p1, [Lv7/i;

    .line 40
    .line 41
    return-object p1

    .line 42
    :pswitch_b
    new-array p1, p1, [Lv7/Y;

    .line 43
    .line 44
    return-object p1

    .line 45
    :pswitch_c
    new-array p1, p1, [Lv7/X;

    .line 46
    .line 47
    return-object p1

    .line 48
    :pswitch_d
    new-array p1, p1, [Lv7/h;

    .line 49
    .line 50
    return-object p1

    .line 51
    :pswitch_e
    new-array p1, p1, [Lv7/f;

    .line 52
    .line 53
    return-object p1

    .line 54
    :pswitch_f
    new-array p1, p1, [Lv7/g;

    .line 55
    .line 56
    return-object p1

    .line 57
    :pswitch_10
    new-array p1, p1, [Lv7/O;

    .line 58
    .line 59
    return-object p1

    .line 60
    :pswitch_11
    new-array p1, p1, [Lv7/e;

    .line 61
    .line 62
    return-object p1

    .line 63
    :pswitch_12
    new-array p1, p1, [Lv7/N;

    .line 64
    .line 65
    return-object p1

    .line 66
    :pswitch_13
    new-array p1, p1, [Lv7/W;

    .line 67
    .line 68
    return-object p1

    .line 69
    :pswitch_14
    new-array p1, p1, [Lv7/M;

    .line 70
    .line 71
    return-object p1

    .line 72
    :pswitch_15
    new-array p1, p1, [Lv7/L;

    .line 73
    .line 74
    return-object p1

    .line 75
    :pswitch_16
    new-array p1, p1, [Lv7/J;

    .line 76
    .line 77
    return-object p1

    .line 78
    :pswitch_17
    new-array p1, p1, [Lv7/I;

    .line 79
    .line 80
    return-object p1

    .line 81
    :pswitch_18
    new-array p1, p1, [Lv7/F;

    .line 82
    .line 83
    return-object p1

    .line 84
    :pswitch_19
    new-array p1, p1, [Lv7/E;

    .line 85
    .line 86
    return-object p1

    .line 87
    :pswitch_1a
    new-array p1, p1, [Lv7/C;

    .line 88
    .line 89
    return-object p1

    .line 90
    :pswitch_1b
    new-array p1, p1, [Lv7/B;

    .line 91
    .line 92
    return-object p1

    .line 93
    :pswitch_1c
    new-array p1, p1, [Lv7/A;

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
