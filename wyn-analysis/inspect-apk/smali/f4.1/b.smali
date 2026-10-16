.class public final Lf4/b;
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
    iput p1, p0, Lf4/b;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget v0, p0, Lf4/b;->a:I

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
    move-object v2, v1

    .line 12
    move-object v3, v2

    .line 13
    :goto_0
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    if-ge v4, v0, :cond_3

    .line 18
    .line 19
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    int-to-char v5, v4

    .line 24
    const/4 v6, 0x2

    .line 25
    if-eq v5, v6, :cond_2

    .line 26
    .line 27
    const/4 v6, 0x3

    .line 28
    if-eq v5, v6, :cond_1

    .line 29
    .line 30
    const/4 v6, 0x4

    .line 31
    if-eq v5, v6, :cond_0

    .line 32
    .line 33
    invoke-static {v4, p1}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    sget-object v3, Lcom/google/android/gms/fido/common/Transport;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 38
    .line 39
    invoke-static {p1, v4, v3}, LU8/v0;->C(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    goto :goto_0

    .line 44
    :cond_1
    invoke-static {v4, p1}, LU8/v0;->r(ILandroid/os/Parcel;)[B

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    goto :goto_0

    .line 49
    :cond_2
    invoke-static {v4, p1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    goto :goto_0

    .line 54
    :cond_3
    invoke-static {v0, p1}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 55
    .line 56
    .line 57
    new-instance p1, Lv7/z;

    .line 58
    .line 59
    invoke-direct {p1, v1, v2, v3}, Lv7/z;-><init>(Ljava/lang/String;[BLjava/util/ArrayList;)V

    .line 60
    .line 61
    .line 62
    return-object p1

    .line 63
    :pswitch_0
    invoke-static {p1}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    const/4 v1, 0x0

    .line 68
    move-object v3, v1

    .line 69
    move-object v4, v3

    .line 70
    move-object v5, v4

    .line 71
    move-object v6, v5

    .line 72
    move-object v7, v6

    .line 73
    move-object v8, v7

    .line 74
    move-object v9, v8

    .line 75
    move-object v10, v9

    .line 76
    :goto_1
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    if-ge v1, v0, :cond_4

    .line 81
    .line 82
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    int-to-char v2, v1

    .line 87
    packed-switch v2, :pswitch_data_1

    .line 88
    .line 89
    .line 90
    invoke-static {v1, p1}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 91
    .line 92
    .line 93
    goto :goto_1

    .line 94
    :pswitch_1
    invoke-static {v1, p1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v10

    .line 98
    goto :goto_1

    .line 99
    :pswitch_2
    sget-object v2, Lv7/g;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 100
    .line 101
    invoke-static {p1, v1, v2}, LU8/v0;->x(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    move-object v9, v1

    .line 106
    check-cast v9, Lv7/g;

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :pswitch_3
    sget-object v2, Lv7/k;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 110
    .line 111
    invoke-static {p1, v1, v2}, LU8/v0;->x(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    move-object v8, v1

    .line 116
    check-cast v8, Lv7/k;

    .line 117
    .line 118
    goto :goto_1

    .line 119
    :pswitch_4
    sget-object v2, Lv7/i;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 120
    .line 121
    invoke-static {p1, v1, v2}, LU8/v0;->x(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    move-object v7, v1

    .line 126
    check-cast v7, Lv7/i;

    .line 127
    .line 128
    goto :goto_1

    .line 129
    :pswitch_5
    sget-object v2, Lv7/j;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 130
    .line 131
    invoke-static {p1, v1, v2}, LU8/v0;->x(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    move-object v6, v1

    .line 136
    check-cast v6, Lv7/j;

    .line 137
    .line 138
    goto :goto_1

    .line 139
    :pswitch_6
    invoke-static {v1, p1}, LU8/v0;->r(ILandroid/os/Parcel;)[B

    .line 140
    .line 141
    .line 142
    move-result-object v5

    .line 143
    goto :goto_1

    .line 144
    :pswitch_7
    invoke-static {v1, p1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v4

    .line 148
    goto :goto_1

    .line 149
    :pswitch_8
    invoke-static {v1, p1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v3

    .line 153
    goto :goto_1

    .line 154
    :cond_4
    invoke-static {v0, p1}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 155
    .line 156
    .line 157
    new-instance v2, Lv7/x;

    .line 158
    .line 159
    invoke-direct/range {v2 .. v10}, Lv7/x;-><init>(Ljava/lang/String;Ljava/lang/String;[BLv7/j;Lv7/i;Lv7/k;Lv7/g;Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    return-object v2

    .line 163
    :pswitch_9
    invoke-static {p1}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 164
    .line 165
    .line 166
    move-result v0

    .line 167
    const/4 v1, 0x0

    .line 168
    move-object v3, v1

    .line 169
    move-object v4, v3

    .line 170
    move-object v5, v4

    .line 171
    move-object v6, v5

    .line 172
    move-object v7, v6

    .line 173
    move-object v8, v7

    .line 174
    move-object v9, v8

    .line 175
    move-object v10, v9

    .line 176
    move-object v11, v10

    .line 177
    move-object v12, v11

    .line 178
    move-object v13, v12

    .line 179
    :goto_2
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 180
    .line 181
    .line 182
    move-result v1

    .line 183
    if-ge v1, v0, :cond_5

    .line 184
    .line 185
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 186
    .line 187
    .line 188
    move-result v1

    .line 189
    int-to-char v2, v1

    .line 190
    packed-switch v2, :pswitch_data_2

    .line 191
    .line 192
    .line 193
    invoke-static {v1, p1}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 194
    .line 195
    .line 196
    goto :goto_2

    .line 197
    :pswitch_a
    sget-object v2, Lv7/f;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 198
    .line 199
    invoke-static {p1, v1, v2}, LU8/v0;->x(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    move-object v13, v1

    .line 204
    check-cast v13, Lv7/f;

    .line 205
    .line 206
    goto :goto_2

    .line 207
    :pswitch_b
    invoke-static {v1, p1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v12

    .line 211
    goto :goto_2

    .line 212
    :pswitch_c
    sget-object v2, Lv7/L;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 213
    .line 214
    invoke-static {p1, v1, v2}, LU8/v0;->x(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 215
    .line 216
    .line 217
    move-result-object v1

    .line 218
    move-object v11, v1

    .line 219
    check-cast v11, Lv7/L;

    .line 220
    .line 221
    goto :goto_2

    .line 222
    :pswitch_d
    invoke-static {v1, p1}, LU8/v0;->g0(ILandroid/os/Parcel;)Ljava/lang/Integer;

    .line 223
    .line 224
    .line 225
    move-result-object v10

    .line 226
    goto :goto_2

    .line 227
    :pswitch_e
    sget-object v2, Lv7/m;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 228
    .line 229
    invoke-static {p1, v1, v2}, LU8/v0;->x(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 230
    .line 231
    .line 232
    move-result-object v1

    .line 233
    move-object v9, v1

    .line 234
    check-cast v9, Lv7/m;

    .line 235
    .line 236
    goto :goto_2

    .line 237
    :pswitch_f
    sget-object v2, Lv7/z;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 238
    .line 239
    invoke-static {p1, v1, v2}, LU8/v0;->C(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 240
    .line 241
    .line 242
    move-result-object v8

    .line 243
    goto :goto_2

    .line 244
    :pswitch_10
    invoke-static {v1, p1}, LU8/v0;->b0(ILandroid/os/Parcel;)Ljava/lang/Double;

    .line 245
    .line 246
    .line 247
    move-result-object v7

    .line 248
    goto :goto_2

    .line 249
    :pswitch_11
    sget-object v2, Lv7/A;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 250
    .line 251
    invoke-static {p1, v1, v2}, LU8/v0;->C(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 252
    .line 253
    .line 254
    move-result-object v6

    .line 255
    goto :goto_2

    .line 256
    :pswitch_12
    invoke-static {v1, p1}, LU8/v0;->r(ILandroid/os/Parcel;)[B

    .line 257
    .line 258
    .line 259
    move-result-object v5

    .line 260
    goto :goto_2

    .line 261
    :pswitch_13
    sget-object v2, Lv7/F;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 262
    .line 263
    invoke-static {p1, v1, v2}, LU8/v0;->x(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 264
    .line 265
    .line 266
    move-result-object v1

    .line 267
    move-object v4, v1

    .line 268
    check-cast v4, Lv7/F;

    .line 269
    .line 270
    goto :goto_2

    .line 271
    :pswitch_14
    sget-object v2, Lv7/C;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 272
    .line 273
    invoke-static {p1, v1, v2}, LU8/v0;->x(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 274
    .line 275
    .line 276
    move-result-object v1

    .line 277
    move-object v3, v1

    .line 278
    check-cast v3, Lv7/C;

    .line 279
    .line 280
    goto :goto_2

    .line 281
    :cond_5
    invoke-static {v0, p1}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 282
    .line 283
    .line 284
    new-instance v2, Lv7/y;

    .line 285
    .line 286
    invoke-direct/range {v2 .. v13}, Lv7/y;-><init>(Lv7/C;Lv7/F;[BLjava/util/ArrayList;Ljava/lang/Double;Ljava/util/ArrayList;Lv7/m;Ljava/lang/Integer;Lv7/L;Ljava/lang/String;Lv7/f;)V

    .line 287
    .line 288
    .line 289
    return-object v2

    .line 290
    :pswitch_15
    invoke-static {p1}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 291
    .line 292
    .line 293
    move-result v0

    .line 294
    const/4 v1, 0x0

    .line 295
    :goto_3
    move-object v2, v1

    .line 296
    :goto_4
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 297
    .line 298
    .line 299
    move-result v3

    .line 300
    if-ge v3, v0, :cond_9

    .line 301
    .line 302
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 303
    .line 304
    .line 305
    move-result v3

    .line 306
    int-to-char v4, v3

    .line 307
    const/4 v5, 0x1

    .line 308
    if-eq v4, v5, :cond_6

    .line 309
    .line 310
    invoke-static {v3, p1}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 311
    .line 312
    .line 313
    goto :goto_4

    .line 314
    :cond_6
    invoke-static {v3, p1}, LU8/v0;->k0(ILandroid/os/Parcel;)I

    .line 315
    .line 316
    .line 317
    move-result v2

    .line 318
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 319
    .line 320
    .line 321
    move-result v3

    .line 322
    if-nez v2, :cond_7

    .line 323
    .line 324
    goto :goto_3

    .line 325
    :cond_7
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 326
    .line 327
    .line 328
    move-result v4

    .line 329
    new-array v5, v4, [[B

    .line 330
    .line 331
    const/4 v6, 0x0

    .line 332
    :goto_5
    if-ge v6, v4, :cond_8

    .line 333
    .line 334
    invoke-virtual {p1}, Landroid/os/Parcel;->createByteArray()[B

    .line 335
    .line 336
    .line 337
    move-result-object v7

    .line 338
    aput-object v7, v5, v6

    .line 339
    .line 340
    add-int/lit8 v6, v6, 0x1

    .line 341
    .line 342
    goto :goto_5

    .line 343
    :cond_8
    add-int/2addr v3, v2

    .line 344
    invoke-virtual {p1, v3}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 345
    .line 346
    .line 347
    move-object v2, v5

    .line 348
    goto :goto_4

    .line 349
    :cond_9
    invoke-static {v0, p1}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 350
    .line 351
    .line 352
    new-instance p1, Lv7/T;

    .line 353
    .line 354
    invoke-direct {p1, v2}, Lv7/T;-><init>([[B)V

    .line 355
    .line 356
    .line 357
    return-object p1

    .line 358
    :pswitch_16
    invoke-static {p1}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 359
    .line 360
    .line 361
    move-result v0

    .line 362
    const/4 v1, 0x0

    .line 363
    :goto_6
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 364
    .line 365
    .line 366
    move-result v2

    .line 367
    if-ge v2, v0, :cond_b

    .line 368
    .line 369
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 370
    .line 371
    .line 372
    move-result v2

    .line 373
    int-to-char v3, v2

    .line 374
    const/4 v4, 0x1

    .line 375
    if-eq v3, v4, :cond_a

    .line 376
    .line 377
    invoke-static {v2, p1}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 378
    .line 379
    .line 380
    goto :goto_6

    .line 381
    :cond_a
    invoke-static {v2, p1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 382
    .line 383
    .line 384
    move-result-object v1

    .line 385
    goto :goto_6

    .line 386
    :cond_b
    invoke-static {v0, p1}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 387
    .line 388
    .line 389
    new-instance p1, Lv7/S;

    .line 390
    .line 391
    invoke-direct {p1, v1}, Lv7/S;-><init>(Ljava/lang/String;)V

    .line 392
    .line 393
    .line 394
    return-object p1

    .line 395
    :pswitch_17
    invoke-static {p1}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 396
    .line 397
    .line 398
    move-result v0

    .line 399
    const/4 v1, 0x0

    .line 400
    :goto_7
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 401
    .line 402
    .line 403
    move-result v2

    .line 404
    if-ge v2, v0, :cond_d

    .line 405
    .line 406
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 407
    .line 408
    .line 409
    move-result v2

    .line 410
    int-to-char v3, v2

    .line 411
    const/4 v4, 0x1

    .line 412
    if-eq v3, v4, :cond_c

    .line 413
    .line 414
    invoke-static {v2, p1}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 415
    .line 416
    .line 417
    goto :goto_7

    .line 418
    :cond_c
    invoke-static {v2, p1}, LU8/v0;->Z(ILandroid/os/Parcel;)Z

    .line 419
    .line 420
    .line 421
    move-result v1

    .line 422
    goto :goto_7

    .line 423
    :cond_d
    invoke-static {v0, p1}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 424
    .line 425
    .line 426
    new-instance p1, Lv7/w;

    .line 427
    .line 428
    invoke-direct {p1, v1}, Lv7/w;-><init>(Z)V

    .line 429
    .line 430
    .line 431
    return-object p1

    .line 432
    :pswitch_18
    invoke-static {p1}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 433
    .line 434
    .line 435
    move-result v0

    .line 436
    const/4 v1, 0x0

    .line 437
    :goto_8
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 438
    .line 439
    .line 440
    move-result v2

    .line 441
    if-ge v2, v0, :cond_f

    .line 442
    .line 443
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 444
    .line 445
    .line 446
    move-result v2

    .line 447
    int-to-char v3, v2

    .line 448
    const/4 v4, 0x1

    .line 449
    if-eq v3, v4, :cond_e

    .line 450
    .line 451
    invoke-static {v2, p1}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 452
    .line 453
    .line 454
    goto :goto_8

    .line 455
    :cond_e
    invoke-static {v2, p1}, LU8/v0;->Z(ILandroid/os/Parcel;)Z

    .line 456
    .line 457
    .line 458
    move-result v1

    .line 459
    goto :goto_8

    .line 460
    :cond_f
    invoke-static {v0, p1}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 461
    .line 462
    .line 463
    new-instance p1, Lv7/Q;

    .line 464
    .line 465
    invoke-direct {p1, v1}, Lv7/Q;-><init>(Z)V

    .line 466
    .line 467
    .line 468
    return-object p1

    .line 469
    :pswitch_19
    invoke-static {p1}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 470
    .line 471
    .line 472
    move-result v0

    .line 473
    const-wide/16 v1, 0x0

    .line 474
    .line 475
    :goto_9
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 476
    .line 477
    .line 478
    move-result v3

    .line 479
    if-ge v3, v0, :cond_11

    .line 480
    .line 481
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 482
    .line 483
    .line 484
    move-result v3

    .line 485
    int-to-char v4, v3

    .line 486
    const/4 v5, 0x1

    .line 487
    if-eq v4, v5, :cond_10

    .line 488
    .line 489
    invoke-static {v3, p1}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 490
    .line 491
    .line 492
    goto :goto_9

    .line 493
    :cond_10
    invoke-static {v3, p1}, LU8/v0;->h0(ILandroid/os/Parcel;)J

    .line 494
    .line 495
    .line 496
    move-result-wide v1

    .line 497
    goto :goto_9

    .line 498
    :cond_11
    invoke-static {v0, p1}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 499
    .line 500
    .line 501
    new-instance p1, Lv7/P;

    .line 502
    .line 503
    invoke-direct {p1, v1, v2}, Lv7/P;-><init>(J)V

    .line 504
    .line 505
    .line 506
    return-object p1

    .line 507
    :pswitch_1a
    invoke-static {p1}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 508
    .line 509
    .line 510
    move-result v0

    .line 511
    const/4 v1, 0x0

    .line 512
    :goto_a
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 513
    .line 514
    .line 515
    move-result v2

    .line 516
    if-ge v2, v0, :cond_13

    .line 517
    .line 518
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 519
    .line 520
    .line 521
    move-result v2

    .line 522
    int-to-char v3, v2

    .line 523
    const/4 v4, 0x1

    .line 524
    if-eq v3, v4, :cond_12

    .line 525
    .line 526
    invoke-static {v2, p1}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 527
    .line 528
    .line 529
    goto :goto_a

    .line 530
    :cond_12
    invoke-static {v2, p1}, LU8/v0;->Z(ILandroid/os/Parcel;)Z

    .line 531
    .line 532
    .line 533
    move-result v1

    .line 534
    goto :goto_a

    .line 535
    :cond_13
    invoke-static {v0, p1}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 536
    .line 537
    .line 538
    new-instance p1, Lv7/c0;

    .line 539
    .line 540
    invoke-direct {p1, v1}, Lv7/c0;-><init>(Z)V

    .line 541
    .line 542
    .line 543
    return-object p1

    .line 544
    :pswitch_1b
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 545
    .line 546
    .line 547
    move-result-object p1

    .line 548
    :try_start_0
    invoke-static {p1}, Lv7/c;->c(Ljava/lang/String;)Lv7/c;

    .line 549
    .line 550
    .line 551
    move-result-object p1
    :try_end_0
    .catch Lv7/b; {:try_start_0 .. :try_end_0} :catch_0

    .line 552
    return-object p1

    .line 553
    :catch_0
    move-exception v0

    .line 554
    move-object p1, v0

    .line 555
    new-instance v0, Ljava/lang/RuntimeException;

    .line 556
    .line 557
    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 558
    .line 559
    .line 560
    throw v0

    .line 561
    :pswitch_1c
    new-instance v0, Landroidx/versionedparcelable/ParcelImpl;

    .line 562
    .line 563
    invoke-direct {v0, p1}, Landroidx/versionedparcelable/ParcelImpl;-><init>(Landroid/os/Parcel;)V

    .line 564
    .line 565
    .line 566
    return-object v0

    .line 567
    :pswitch_1d
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 568
    .line 569
    .line 570
    move-result-object p1

    .line 571
    :try_start_1
    invoke-static {}, Lcom/google/android/gms/fido/common/Transport;->values()[Lcom/google/android/gms/fido/common/Transport;

    .line 572
    .line 573
    .line 574
    move-result-object v0

    .line 575
    array-length v1, v0

    .line 576
    const/4 v2, 0x0

    .line 577
    :goto_b
    if-ge v2, v1, :cond_15

    .line 578
    .line 579
    aget-object v3, v0, v2

    .line 580
    .line 581
    iget-object v4, v3, Lcom/google/android/gms/fido/common/Transport;->a:Ljava/lang/String;

    .line 582
    .line 583
    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 584
    .line 585
    .line 586
    move-result v4

    .line 587
    if-eqz v4, :cond_14

    .line 588
    .line 589
    goto :goto_c

    .line 590
    :cond_14
    add-int/lit8 v2, v2, 0x1

    .line 591
    .line 592
    goto :goto_b

    .line 593
    :cond_15
    const-string v0, "hybrid"

    .line 594
    .line 595
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 596
    .line 597
    .line 598
    move-result v0

    .line 599
    if-eqz v0, :cond_16

    .line 600
    .line 601
    sget-object v3, Lcom/google/android/gms/fido/common/Transport;->b:Lcom/google/android/gms/fido/common/Transport;

    .line 602
    .line 603
    :goto_c
    return-object v3

    .line 604
    :cond_16
    new-instance v0, Lt7/a;

    .line 605
    .line 606
    const-string v1, "Transport "

    .line 607
    .line 608
    const-string v2, " not supported"

    .line 609
    .line 610
    invoke-static {v1, p1, v2}, LA7/p0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 611
    .line 612
    .line 613
    move-result-object p1

    .line 614
    invoke-direct {v0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 615
    .line 616
    .line 617
    throw v0
    :try_end_1
    .catch Lt7/a; {:try_start_1 .. :try_end_1} :catch_1

    .line 618
    :catch_1
    move-exception v0

    .line 619
    move-object p1, v0

    .line 620
    new-instance v0, Ljava/lang/RuntimeException;

    .line 621
    .line 622
    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 623
    .line 624
    .line 625
    throw v0

    .line 626
    :pswitch_1e
    new-instance v0, Lq/K;

    .line 627
    .line 628
    invoke-direct {v0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;)V

    .line 629
    .line 630
    .line 631
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    .line 632
    .line 633
    .line 634
    move-result p1

    .line 635
    if-eqz p1, :cond_17

    .line 636
    .line 637
    const/4 p1, 0x1

    .line 638
    goto :goto_d

    .line 639
    :cond_17
    const/4 p1, 0x0

    .line 640
    :goto_d
    iput-boolean p1, v0, Lq/K;->a:Z

    .line 641
    .line 642
    return-object v0

    .line 643
    :pswitch_1f
    new-instance v0, Ln1/g;

    .line 644
    .line 645
    invoke-direct {v0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;)V

    .line 646
    .line 647
    .line 648
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 649
    .line 650
    .line 651
    move-result p1

    .line 652
    iput p1, v0, Ln1/g;->a:I

    .line 653
    .line 654
    return-object v0

    .line 655
    :pswitch_20
    invoke-static {p1}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 656
    .line 657
    .line 658
    move-result v0

    .line 659
    const/4 v1, 0x0

    .line 660
    const/4 v2, 0x0

    .line 661
    move-object v3, v1

    .line 662
    move-object v4, v3

    .line 663
    :goto_e
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 664
    .line 665
    .line 666
    move-result v5

    .line 667
    if-ge v5, v0, :cond_1c

    .line 668
    .line 669
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 670
    .line 671
    .line 672
    move-result v5

    .line 673
    int-to-char v6, v5

    .line 674
    const/4 v7, 0x1

    .line 675
    if-eq v6, v7, :cond_1b

    .line 676
    .line 677
    const/4 v7, 0x2

    .line 678
    if-eq v6, v7, :cond_19

    .line 679
    .line 680
    const/4 v7, 0x3

    .line 681
    if-eq v6, v7, :cond_18

    .line 682
    .line 683
    invoke-static {v5, p1}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 684
    .line 685
    .line 686
    goto :goto_e

    .line 687
    :cond_18
    sget-object v4, Ll7/h;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 688
    .line 689
    invoke-static {p1, v5, v4}, LU8/v0;->x(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 690
    .line 691
    .line 692
    move-result-object v4

    .line 693
    check-cast v4, Ll7/h;

    .line 694
    .line 695
    goto :goto_e

    .line 696
    :cond_19
    invoke-static {v5, p1}, LU8/v0;->k0(ILandroid/os/Parcel;)I

    .line 697
    .line 698
    .line 699
    move-result v3

    .line 700
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 701
    .line 702
    .line 703
    move-result v5

    .line 704
    if-nez v3, :cond_1a

    .line 705
    .line 706
    move-object v3, v1

    .line 707
    goto :goto_e

    .line 708
    :cond_1a
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 709
    .line 710
    .line 711
    move-result-object v6

    .line 712
    invoke-virtual {v6, p1, v5, v3}, Landroid/os/Parcel;->appendFrom(Landroid/os/Parcel;II)V

    .line 713
    .line 714
    .line 715
    add-int/2addr v5, v3

    .line 716
    invoke-virtual {p1, v5}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 717
    .line 718
    .line 719
    move-object v3, v6

    .line 720
    goto :goto_e

    .line 721
    :cond_1b
    invoke-static {v5, p1}, LU8/v0;->f0(ILandroid/os/Parcel;)I

    .line 722
    .line 723
    .line 724
    move-result v2

    .line 725
    goto :goto_e

    .line 726
    :cond_1c
    invoke-static {v0, p1}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 727
    .line 728
    .line 729
    new-instance p1, Ll7/d;

    .line 730
    .line 731
    invoke-direct {p1, v2, v3, v4}, Ll7/d;-><init>(ILandroid/os/Parcel;Ll7/h;)V

    .line 732
    .line 733
    .line 734
    return-object p1

    .line 735
    :pswitch_21
    invoke-static {p1}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 736
    .line 737
    .line 738
    move-result v0

    .line 739
    const/4 v1, 0x0

    .line 740
    const/4 v2, 0x0

    .line 741
    move v3, v2

    .line 742
    move-object v2, v1

    .line 743
    :goto_f
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 744
    .line 745
    .line 746
    move-result v4

    .line 747
    if-ge v4, v0, :cond_20

    .line 748
    .line 749
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 750
    .line 751
    .line 752
    move-result v4

    .line 753
    int-to-char v5, v4

    .line 754
    const/4 v6, 0x1

    .line 755
    if-eq v5, v6, :cond_1f

    .line 756
    .line 757
    const/4 v6, 0x2

    .line 758
    if-eq v5, v6, :cond_1e

    .line 759
    .line 760
    const/4 v6, 0x3

    .line 761
    if-eq v5, v6, :cond_1d

    .line 762
    .line 763
    invoke-static {v4, p1}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 764
    .line 765
    .line 766
    goto :goto_f

    .line 767
    :cond_1d
    sget-object v2, Ll7/g;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 768
    .line 769
    invoke-static {p1, v4, v2}, LU8/v0;->C(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 770
    .line 771
    .line 772
    move-result-object v2

    .line 773
    goto :goto_f

    .line 774
    :cond_1e
    invoke-static {v4, p1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 775
    .line 776
    .line 777
    move-result-object v1

    .line 778
    goto :goto_f

    .line 779
    :cond_1f
    invoke-static {v4, p1}, LU8/v0;->f0(ILandroid/os/Parcel;)I

    .line 780
    .line 781
    .line 782
    move-result v3

    .line 783
    goto :goto_f

    .line 784
    :cond_20
    invoke-static {v0, p1}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 785
    .line 786
    .line 787
    new-instance p1, Ll7/f;

    .line 788
    .line 789
    invoke-direct {p1, v3, v1, v2}, Ll7/f;-><init>(ILjava/lang/String;Ljava/util/ArrayList;)V

    .line 790
    .line 791
    .line 792
    return-object p1

    .line 793
    :pswitch_22
    invoke-static {p1}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 794
    .line 795
    .line 796
    move-result v0

    .line 797
    const/4 v1, 0x0

    .line 798
    const/4 v2, 0x0

    .line 799
    move v3, v2

    .line 800
    move-object v2, v1

    .line 801
    :goto_10
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 802
    .line 803
    .line 804
    move-result v4

    .line 805
    if-ge v4, v0, :cond_24

    .line 806
    .line 807
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 808
    .line 809
    .line 810
    move-result v4

    .line 811
    int-to-char v5, v4

    .line 812
    const/4 v6, 0x1

    .line 813
    if-eq v5, v6, :cond_23

    .line 814
    .line 815
    const/4 v6, 0x2

    .line 816
    if-eq v5, v6, :cond_22

    .line 817
    .line 818
    const/4 v6, 0x3

    .line 819
    if-eq v5, v6, :cond_21

    .line 820
    .line 821
    invoke-static {v4, p1}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 822
    .line 823
    .line 824
    goto :goto_10

    .line 825
    :cond_21
    invoke-static {v4, p1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 826
    .line 827
    .line 828
    move-result-object v2

    .line 829
    goto :goto_10

    .line 830
    :cond_22
    sget-object v1, Ll7/f;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 831
    .line 832
    invoke-static {p1, v4, v1}, LU8/v0;->C(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 833
    .line 834
    .line 835
    move-result-object v1

    .line 836
    goto :goto_10

    .line 837
    :cond_23
    invoke-static {v4, p1}, LU8/v0;->f0(ILandroid/os/Parcel;)I

    .line 838
    .line 839
    .line 840
    move-result v3

    .line 841
    goto :goto_10

    .line 842
    :cond_24
    invoke-static {v0, p1}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 843
    .line 844
    .line 845
    new-instance p1, Ll7/h;

    .line 846
    .line 847
    invoke-direct {p1, v3, v2, v1}, Ll7/h;-><init>(ILjava/lang/String;Ljava/util/ArrayList;)V

    .line 848
    .line 849
    .line 850
    return-object p1

    .line 851
    :pswitch_23
    invoke-static {p1}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 852
    .line 853
    .line 854
    move-result v0

    .line 855
    const/4 v1, 0x0

    .line 856
    const/4 v2, 0x0

    .line 857
    move v3, v2

    .line 858
    move-object v2, v1

    .line 859
    :goto_11
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 860
    .line 861
    .line 862
    move-result v4

    .line 863
    if-ge v4, v0, :cond_28

    .line 864
    .line 865
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 866
    .line 867
    .line 868
    move-result v4

    .line 869
    int-to-char v5, v4

    .line 870
    const/4 v6, 0x1

    .line 871
    if-eq v5, v6, :cond_27

    .line 872
    .line 873
    const/4 v6, 0x2

    .line 874
    if-eq v5, v6, :cond_26

    .line 875
    .line 876
    const/4 v6, 0x3

    .line 877
    if-eq v5, v6, :cond_25

    .line 878
    .line 879
    invoke-static {v4, p1}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 880
    .line 881
    .line 882
    goto :goto_11

    .line 883
    :cond_25
    sget-object v2, Ll7/a;->CREATOR:Ll7/e;

    .line 884
    .line 885
    invoke-static {p1, v4, v2}, LU8/v0;->x(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 886
    .line 887
    .line 888
    move-result-object v2

    .line 889
    check-cast v2, Ll7/a;

    .line 890
    .line 891
    goto :goto_11

    .line 892
    :cond_26
    invoke-static {v4, p1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 893
    .line 894
    .line 895
    move-result-object v1

    .line 896
    goto :goto_11

    .line 897
    :cond_27
    invoke-static {v4, p1}, LU8/v0;->f0(ILandroid/os/Parcel;)I

    .line 898
    .line 899
    .line 900
    move-result v3

    .line 901
    goto :goto_11

    .line 902
    :cond_28
    invoke-static {v0, p1}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 903
    .line 904
    .line 905
    new-instance p1, Ll7/g;

    .line 906
    .line 907
    invoke-direct {p1, v2, v1, v3}, Ll7/g;-><init>(Ll7/a;Ljava/lang/String;I)V

    .line 908
    .line 909
    .line 910
    return-object p1

    .line 911
    :pswitch_24
    invoke-static {p1}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 912
    .line 913
    .line 914
    move-result v0

    .line 915
    const/4 v1, 0x0

    .line 916
    const/4 v2, 0x0

    .line 917
    move-object v3, v2

    .line 918
    move v2, v1

    .line 919
    :goto_12
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 920
    .line 921
    .line 922
    move-result v4

    .line 923
    if-ge v4, v0, :cond_2c

    .line 924
    .line 925
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 926
    .line 927
    .line 928
    move-result v4

    .line 929
    int-to-char v5, v4

    .line 930
    const/4 v6, 0x1

    .line 931
    if-eq v5, v6, :cond_2b

    .line 932
    .line 933
    const/4 v6, 0x2

    .line 934
    if-eq v5, v6, :cond_2a

    .line 935
    .line 936
    const/4 v6, 0x3

    .line 937
    if-eq v5, v6, :cond_29

    .line 938
    .line 939
    invoke-static {v4, p1}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 940
    .line 941
    .line 942
    goto :goto_12

    .line 943
    :cond_29
    invoke-static {v4, p1}, LU8/v0;->f0(ILandroid/os/Parcel;)I

    .line 944
    .line 945
    .line 946
    move-result v2

    .line 947
    goto :goto_12

    .line 948
    :cond_2a
    invoke-static {v4, p1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 949
    .line 950
    .line 951
    move-result-object v3

    .line 952
    goto :goto_12

    .line 953
    :cond_2b
    invoke-static {v4, p1}, LU8/v0;->f0(ILandroid/os/Parcel;)I

    .line 954
    .line 955
    .line 956
    move-result v1

    .line 957
    goto :goto_12

    .line 958
    :cond_2c
    invoke-static {v0, p1}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 959
    .line 960
    .line 961
    new-instance p1, Lk7/c;

    .line 962
    .line 963
    invoke-direct {p1, v1, v3, v2}, Lk7/c;-><init>(ILjava/lang/String;I)V

    .line 964
    .line 965
    .line 966
    return-object p1

    .line 967
    :pswitch_25
    invoke-static {p1}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 968
    .line 969
    .line 970
    move-result v0

    .line 971
    const/4 v1, 0x0

    .line 972
    const/4 v2, 0x0

    .line 973
    :goto_13
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 974
    .line 975
    .line 976
    move-result v3

    .line 977
    if-ge v3, v0, :cond_2f

    .line 978
    .line 979
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 980
    .line 981
    .line 982
    move-result v3

    .line 983
    int-to-char v4, v3

    .line 984
    const/4 v5, 0x1

    .line 985
    if-eq v4, v5, :cond_2e

    .line 986
    .line 987
    const/4 v5, 0x2

    .line 988
    if-eq v4, v5, :cond_2d

    .line 989
    .line 990
    invoke-static {v3, p1}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 991
    .line 992
    .line 993
    goto :goto_13

    .line 994
    :cond_2d
    sget-object v1, Lk7/c;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 995
    .line 996
    invoke-static {p1, v3, v1}, LU8/v0;->C(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 997
    .line 998
    .line 999
    move-result-object v1

    .line 1000
    goto :goto_13

    .line 1001
    :cond_2e
    invoke-static {v3, p1}, LU8/v0;->f0(ILandroid/os/Parcel;)I

    .line 1002
    .line 1003
    .line 1004
    move-result v2

    .line 1005
    goto :goto_13

    .line 1006
    :cond_2f
    invoke-static {v0, p1}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 1007
    .line 1008
    .line 1009
    new-instance p1, Lk7/a;

    .line 1010
    .line 1011
    invoke-direct {p1, v1, v2}, Lk7/a;-><init>(Ljava/util/ArrayList;I)V

    .line 1012
    .line 1013
    .line 1014
    return-object p1

    .line 1015
    :pswitch_26
    invoke-static {p1}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 1016
    .line 1017
    .line 1018
    move-result v0

    .line 1019
    const/4 v1, 0x0

    .line 1020
    const/4 v2, 0x0

    .line 1021
    :goto_14
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 1022
    .line 1023
    .line 1024
    move-result v3

    .line 1025
    if-ge v3, v0, :cond_32

    .line 1026
    .line 1027
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 1028
    .line 1029
    .line 1030
    move-result v3

    .line 1031
    int-to-char v4, v3

    .line 1032
    const/4 v5, 0x1

    .line 1033
    if-eq v4, v5, :cond_31

    .line 1034
    .line 1035
    const/4 v5, 0x2

    .line 1036
    if-eq v4, v5, :cond_30

    .line 1037
    .line 1038
    invoke-static {v3, p1}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 1039
    .line 1040
    .line 1041
    goto :goto_14

    .line 1042
    :cond_30
    sget-object v1, Lk7/a;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1043
    .line 1044
    invoke-static {p1, v3, v1}, LU8/v0;->x(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1045
    .line 1046
    .line 1047
    move-result-object v1

    .line 1048
    check-cast v1, Lk7/a;

    .line 1049
    .line 1050
    goto :goto_14

    .line 1051
    :cond_31
    invoke-static {v3, p1}, LU8/v0;->f0(ILandroid/os/Parcel;)I

    .line 1052
    .line 1053
    .line 1054
    move-result v2

    .line 1055
    goto :goto_14

    .line 1056
    :cond_32
    invoke-static {v0, p1}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 1057
    .line 1058
    .line 1059
    new-instance p1, Lk7/b;

    .line 1060
    .line 1061
    invoke-direct {p1, v2, v1}, Lk7/b;-><init>(ILk7/a;)V

    .line 1062
    .line 1063
    .line 1064
    return-object p1

    .line 1065
    :pswitch_27
    invoke-static {p1}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 1066
    .line 1067
    .line 1068
    move-result v0

    .line 1069
    const/4 v1, 0x0

    .line 1070
    move v2, v1

    .line 1071
    :goto_15
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 1072
    .line 1073
    .line 1074
    move-result v3

    .line 1075
    if-ge v3, v0, :cond_35

    .line 1076
    .line 1077
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 1078
    .line 1079
    .line 1080
    move-result v3

    .line 1081
    int-to-char v4, v3

    .line 1082
    const/4 v5, 0x1

    .line 1083
    if-eq v4, v5, :cond_34

    .line 1084
    .line 1085
    const/4 v5, 0x2

    .line 1086
    if-eq v4, v5, :cond_33

    .line 1087
    .line 1088
    invoke-static {v3, p1}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 1089
    .line 1090
    .line 1091
    goto :goto_15

    .line 1092
    :cond_33
    invoke-static {v3, p1}, LU8/v0;->Z(ILandroid/os/Parcel;)Z

    .line 1093
    .line 1094
    .line 1095
    move-result v2

    .line 1096
    goto :goto_15

    .line 1097
    :cond_34
    invoke-static {v3, p1}, LU8/v0;->f0(ILandroid/os/Parcel;)I

    .line 1098
    .line 1099
    .line 1100
    move-result v1

    .line 1101
    goto :goto_15

    .line 1102
    :cond_35
    invoke-static {v0, p1}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 1103
    .line 1104
    .line 1105
    new-instance p1, Li7/c;

    .line 1106
    .line 1107
    invoke-direct {p1, v1, v2}, Li7/c;-><init>(IZ)V

    .line 1108
    .line 1109
    .line 1110
    return-object p1

    .line 1111
    :pswitch_28
    invoke-static {p1}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 1112
    .line 1113
    .line 1114
    move-result v0

    .line 1115
    const/4 v1, 0x0

    .line 1116
    :goto_16
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 1117
    .line 1118
    .line 1119
    move-result v2

    .line 1120
    if-ge v2, v0, :cond_37

    .line 1121
    .line 1122
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 1123
    .line 1124
    .line 1125
    move-result v2

    .line 1126
    int-to-char v3, v2

    .line 1127
    const/4 v4, 0x1

    .line 1128
    if-eq v3, v4, :cond_36

    .line 1129
    .line 1130
    invoke-static {v2, p1}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 1131
    .line 1132
    .line 1133
    goto :goto_16

    .line 1134
    :cond_36
    sget-object v1, Landroid/app/PendingIntent;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1135
    .line 1136
    invoke-static {p1, v2, v1}, LU8/v0;->x(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1137
    .line 1138
    .line 1139
    move-result-object v1

    .line 1140
    check-cast v1, Landroid/app/PendingIntent;

    .line 1141
    .line 1142
    goto :goto_16

    .line 1143
    :cond_37
    invoke-static {v0, p1}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 1144
    .line 1145
    .line 1146
    new-instance p1, Li7/b;

    .line 1147
    .line 1148
    invoke-direct {p1, v1}, Li7/b;-><init>(Landroid/app/PendingIntent;)V

    .line 1149
    .line 1150
    .line 1151
    return-object p1

    .line 1152
    :pswitch_29
    invoke-static {p1}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 1153
    .line 1154
    .line 1155
    move-result v0

    .line 1156
    const/4 v1, 0x0

    .line 1157
    move v2, v1

    .line 1158
    :goto_17
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 1159
    .line 1160
    .line 1161
    move-result v3

    .line 1162
    if-ge v3, v0, :cond_3a

    .line 1163
    .line 1164
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 1165
    .line 1166
    .line 1167
    move-result v3

    .line 1168
    int-to-char v4, v3

    .line 1169
    const/4 v5, 0x1

    .line 1170
    if-eq v4, v5, :cond_39

    .line 1171
    .line 1172
    const/4 v5, 0x2

    .line 1173
    if-eq v4, v5, :cond_38

    .line 1174
    .line 1175
    invoke-static {v3, p1}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 1176
    .line 1177
    .line 1178
    goto :goto_17

    .line 1179
    :cond_38
    invoke-static {v3, p1}, LU8/v0;->f0(ILandroid/os/Parcel;)I

    .line 1180
    .line 1181
    .line 1182
    move-result v2

    .line 1183
    goto :goto_17

    .line 1184
    :cond_39
    invoke-static {v3, p1}, LU8/v0;->Z(ILandroid/os/Parcel;)Z

    .line 1185
    .line 1186
    .line 1187
    move-result v1

    .line 1188
    goto :goto_17

    .line 1189
    :cond_3a
    invoke-static {v0, p1}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 1190
    .line 1191
    .line 1192
    new-instance p1, Li7/a;

    .line 1193
    .line 1194
    invoke-direct {p1, v1, v2}, Li7/a;-><init>(ZI)V

    .line 1195
    .line 1196
    .line 1197
    return-object p1

    .line 1198
    :pswitch_2a
    const-string v0, "inParcel"

    .line 1199
    .line 1200
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1201
    .line 1202
    .line 1203
    new-instance v0, Lg/j;

    .line 1204
    .line 1205
    const-class v1, Landroid/content/IntentSender;

    .line 1206
    .line 1207
    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 1208
    .line 1209
    .line 1210
    move-result-object v1

    .line 1211
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 1212
    .line 1213
    .line 1214
    move-result-object v1

    .line 1215
    invoke-static {v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 1216
    .line 1217
    .line 1218
    check-cast v1, Landroid/content/IntentSender;

    .line 1219
    .line 1220
    const-class v2, Landroid/content/Intent;

    .line 1221
    .line 1222
    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 1223
    .line 1224
    .line 1225
    move-result-object v2

    .line 1226
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    .line 1227
    .line 1228
    .line 1229
    move-result-object v2

    .line 1230
    check-cast v2, Landroid/content/Intent;

    .line 1231
    .line 1232
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 1233
    .line 1234
    .line 1235
    move-result v3

    .line 1236
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 1237
    .line 1238
    .line 1239
    move-result p1

    .line 1240
    invoke-direct {v0, v1, v2, v3, p1}, Lg/j;-><init>(Landroid/content/IntentSender;Landroid/content/Intent;II)V

    .line 1241
    .line 1242
    .line 1243
    return-object v0

    .line 1244
    :pswitch_2b
    new-instance v0, Lg/a;

    .line 1245
    .line 1246
    invoke-direct {v0, p1}, Lg/a;-><init>(Landroid/os/Parcel;)V

    .line 1247
    .line 1248
    .line 1249
    return-object v0

    .line 1250
    :pswitch_2c
    invoke-static {p1}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 1251
    .line 1252
    .line 1253
    move-result v0

    .line 1254
    const/4 v1, 0x0

    .line 1255
    :goto_18
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 1256
    .line 1257
    .line 1258
    move-result v2

    .line 1259
    if-ge v2, v0, :cond_3c

    .line 1260
    .line 1261
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 1262
    .line 1263
    .line 1264
    move-result v2

    .line 1265
    int-to-char v3, v2

    .line 1266
    const/4 v4, 0x2

    .line 1267
    if-eq v3, v4, :cond_3b

    .line 1268
    .line 1269
    invoke-static {v2, p1}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 1270
    .line 1271
    .line 1272
    goto :goto_18

    .line 1273
    :cond_3b
    invoke-static {v2, p1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1274
    .line 1275
    .line 1276
    move-result-object v1

    .line 1277
    goto :goto_18

    .line 1278
    :cond_3c
    invoke-static {v0, p1}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 1279
    .line 1280
    .line 1281
    new-instance p1, Lf9/m;

    .line 1282
    .line 1283
    invoke-direct {p1, v1}, Lf9/m;-><init>(Ljava/lang/String;)V

    .line 1284
    .line 1285
    .line 1286
    return-object p1

    .line 1287
    :pswitch_2d
    invoke-static {p1}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 1288
    .line 1289
    .line 1290
    move-result v0

    .line 1291
    const/4 v1, 0x0

    .line 1292
    move-object v2, v1

    .line 1293
    move-object v3, v2

    .line 1294
    :goto_19
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 1295
    .line 1296
    .line 1297
    move-result v4

    .line 1298
    if-ge v4, v0, :cond_40

    .line 1299
    .line 1300
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 1301
    .line 1302
    .line 1303
    move-result v4

    .line 1304
    int-to-char v5, v4

    .line 1305
    const/4 v6, 0x1

    .line 1306
    if-eq v5, v6, :cond_3f

    .line 1307
    .line 1308
    const/4 v6, 0x2

    .line 1309
    if-eq v5, v6, :cond_3e

    .line 1310
    .line 1311
    const/4 v6, 0x3

    .line 1312
    if-eq v5, v6, :cond_3d

    .line 1313
    .line 1314
    invoke-static {v4, p1}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 1315
    .line 1316
    .line 1317
    goto :goto_19

    .line 1318
    :cond_3d
    sget-object v3, Lf9/m;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1319
    .line 1320
    invoke-static {p1, v4, v3}, LU8/v0;->C(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 1321
    .line 1322
    .line 1323
    move-result-object v3

    .line 1324
    goto :goto_19

    .line 1325
    :cond_3e
    sget-object v2, Landroid/net/Uri;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1326
    .line 1327
    invoke-static {p1, v4, v2}, LU8/v0;->x(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1328
    .line 1329
    .line 1330
    move-result-object v2

    .line 1331
    check-cast v2, Landroid/net/Uri;

    .line 1332
    .line 1333
    goto :goto_19

    .line 1334
    :cond_3f
    sget-object v1, Landroid/net/Uri;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1335
    .line 1336
    invoke-static {p1, v4, v1}, LU8/v0;->x(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1337
    .line 1338
    .line 1339
    move-result-object v1

    .line 1340
    check-cast v1, Landroid/net/Uri;

    .line 1341
    .line 1342
    goto :goto_19

    .line 1343
    :cond_40
    invoke-static {v0, p1}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 1344
    .line 1345
    .line 1346
    new-instance p1, Lf9/n;

    .line 1347
    .line 1348
    invoke-direct {p1, v1, v2, v3}, Lf9/n;-><init>(Landroid/net/Uri;Landroid/net/Uri;Ljava/util/ArrayList;)V

    .line 1349
    .line 1350
    .line 1351
    return-object p1

    .line 1352
    :pswitch_2e
    invoke-static {p1}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 1353
    .line 1354
    .line 1355
    move-result v0

    .line 1356
    const/4 v1, 0x0

    .line 1357
    const/4 v2, 0x0

    .line 1358
    const-wide/16 v3, 0x0

    .line 1359
    .line 1360
    move v5, v2

    .line 1361
    move-wide v6, v3

    .line 1362
    move-object v2, v1

    .line 1363
    move-object v3, v2

    .line 1364
    move-object v4, v3

    .line 1365
    :goto_1a
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 1366
    .line 1367
    .line 1368
    move-result v8

    .line 1369
    if-ge v8, v0, :cond_41

    .line 1370
    .line 1371
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 1372
    .line 1373
    .line 1374
    move-result v8

    .line 1375
    int-to-char v9, v8

    .line 1376
    packed-switch v9, :pswitch_data_3

    .line 1377
    .line 1378
    .line 1379
    invoke-static {v8, p1}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 1380
    .line 1381
    .line 1382
    goto :goto_1a

    .line 1383
    :pswitch_2f
    sget-object v4, Landroid/net/Uri;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1384
    .line 1385
    invoke-static {p1, v8, v4}, LU8/v0;->x(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1386
    .line 1387
    .line 1388
    move-result-object v4

    .line 1389
    check-cast v4, Landroid/net/Uri;

    .line 1390
    .line 1391
    goto :goto_1a

    .line 1392
    :pswitch_30
    invoke-static {v8, p1}, LU8/v0;->q(ILandroid/os/Parcel;)Landroid/os/Bundle;

    .line 1393
    .line 1394
    .line 1395
    move-result-object v3

    .line 1396
    goto :goto_1a

    .line 1397
    :pswitch_31
    invoke-static {v8, p1}, LU8/v0;->h0(ILandroid/os/Parcel;)J

    .line 1398
    .line 1399
    .line 1400
    move-result-wide v6

    .line 1401
    goto :goto_1a

    .line 1402
    :pswitch_32
    invoke-static {v8, p1}, LU8/v0;->f0(ILandroid/os/Parcel;)I

    .line 1403
    .line 1404
    .line 1405
    move-result v5

    .line 1406
    goto :goto_1a

    .line 1407
    :pswitch_33
    invoke-static {v8, p1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1408
    .line 1409
    .line 1410
    move-result-object v2

    .line 1411
    goto :goto_1a

    .line 1412
    :pswitch_34
    invoke-static {v8, p1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1413
    .line 1414
    .line 1415
    move-result-object v1

    .line 1416
    goto :goto_1a

    .line 1417
    :cond_41
    invoke-static {v0, p1}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 1418
    .line 1419
    .line 1420
    new-instance p1, Lf9/a;

    .line 1421
    .line 1422
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 1423
    .line 1424
    .line 1425
    iput-object v1, p1, Lf9/a;->a:Ljava/lang/String;

    .line 1426
    .line 1427
    iput-object v2, p1, Lf9/a;->b:Ljava/lang/String;

    .line 1428
    .line 1429
    iput v5, p1, Lf9/a;->c:I

    .line 1430
    .line 1431
    iput-wide v6, p1, Lf9/a;->d:J

    .line 1432
    .line 1433
    iput-object v3, p1, Lf9/a;->e:Landroid/os/Bundle;

    .line 1434
    .line 1435
    iput-object v4, p1, Lf9/a;->f:Landroid/net/Uri;

    .line 1436
    .line 1437
    return-object p1

    .line 1438
    :pswitch_35
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1439
    .line 1440
    .line 1441
    move-result-object v0

    .line 1442
    invoke-static {v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 1443
    .line 1444
    .line 1445
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 1446
    .line 1447
    .line 1448
    move-result v1

    .line 1449
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 1450
    .line 1451
    invoke-direct {v2, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 1452
    .line 1453
    .line 1454
    const/4 v3, 0x0

    .line 1455
    :goto_1b
    if-ge v3, v1, :cond_42

    .line 1456
    .line 1457
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1458
    .line 1459
    .line 1460
    move-result-object v4

    .line 1461
    invoke-static {v4}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 1462
    .line 1463
    .line 1464
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1465
    .line 1466
    .line 1467
    move-result-object v5

    .line 1468
    invoke-static {v5}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 1469
    .line 1470
    .line 1471
    invoke-interface {v2, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1472
    .line 1473
    .line 1474
    add-int/lit8 v3, v3, 0x1

    .line 1475
    .line 1476
    goto :goto_1b

    .line 1477
    :cond_42
    new-instance p1, Lf4/c;

    .line 1478
    .line 1479
    invoke-direct {p1, v0, v2}, Lf4/c;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    .line 1480
    .line 1481
    .line 1482
    return-object p1

    .line 1483
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_35
        :pswitch_2e
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
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_9
        :pswitch_0
    .end packed-switch

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
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
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
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch

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
    :pswitch_data_2
    .packed-switch 0x2
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
    .line 1590
    .line 1591
    :pswitch_data_3
    .packed-switch 0x1
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
    .end packed-switch
.end method

.method public final newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lf4/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-array p1, p1, [Lv7/z;

    .line 7
    .line 8
    return-object p1

    .line 9
    :pswitch_0
    new-array p1, p1, [Lv7/x;

    .line 10
    .line 11
    return-object p1

    .line 12
    :pswitch_1
    new-array p1, p1, [Lv7/y;

    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_2
    new-array p1, p1, [Lv7/T;

    .line 16
    .line 17
    return-object p1

    .line 18
    :pswitch_3
    new-array p1, p1, [Lv7/S;

    .line 19
    .line 20
    return-object p1

    .line 21
    :pswitch_4
    new-array p1, p1, [Lv7/w;

    .line 22
    .line 23
    return-object p1

    .line 24
    :pswitch_5
    new-array p1, p1, [Lv7/Q;

    .line 25
    .line 26
    return-object p1

    .line 27
    :pswitch_6
    new-array p1, p1, [Lv7/P;

    .line 28
    .line 29
    return-object p1

    .line 30
    :pswitch_7
    new-array p1, p1, [Lv7/c0;

    .line 31
    .line 32
    return-object p1

    .line 33
    :pswitch_8
    new-array p1, p1, [Lv7/c;

    .line 34
    .line 35
    return-object p1

    .line 36
    :pswitch_9
    new-array p1, p1, [Landroidx/versionedparcelable/ParcelImpl;

    .line 37
    .line 38
    return-object p1

    .line 39
    :pswitch_a
    new-array p1, p1, [Lcom/google/android/gms/fido/common/Transport;

    .line 40
    .line 41
    return-object p1

    .line 42
    :pswitch_b
    new-array p1, p1, [Lq/K;

    .line 43
    .line 44
    return-object p1

    .line 45
    :pswitch_c
    new-array p1, p1, [Ln1/g;

    .line 46
    .line 47
    return-object p1

    .line 48
    :pswitch_d
    new-array p1, p1, [Ll7/d;

    .line 49
    .line 50
    return-object p1

    .line 51
    :pswitch_e
    new-array p1, p1, [Ll7/f;

    .line 52
    .line 53
    return-object p1

    .line 54
    :pswitch_f
    new-array p1, p1, [Ll7/h;

    .line 55
    .line 56
    return-object p1

    .line 57
    :pswitch_10
    new-array p1, p1, [Ll7/g;

    .line 58
    .line 59
    return-object p1

    .line 60
    :pswitch_11
    new-array p1, p1, [Lk7/c;

    .line 61
    .line 62
    return-object p1

    .line 63
    :pswitch_12
    new-array p1, p1, [Lk7/a;

    .line 64
    .line 65
    return-object p1

    .line 66
    :pswitch_13
    new-array p1, p1, [Lk7/b;

    .line 67
    .line 68
    return-object p1

    .line 69
    :pswitch_14
    new-array p1, p1, [Li7/c;

    .line 70
    .line 71
    return-object p1

    .line 72
    :pswitch_15
    new-array p1, p1, [Li7/b;

    .line 73
    .line 74
    return-object p1

    .line 75
    :pswitch_16
    new-array p1, p1, [Li7/a;

    .line 76
    .line 77
    return-object p1

    .line 78
    :pswitch_17
    new-array p1, p1, [Lg/j;

    .line 79
    .line 80
    return-object p1

    .line 81
    :pswitch_18
    new-array p1, p1, [Lg/a;

    .line 82
    .line 83
    return-object p1

    .line 84
    :pswitch_19
    new-array p1, p1, [Lf9/m;

    .line 85
    .line 86
    return-object p1

    .line 87
    :pswitch_1a
    new-array p1, p1, [Lf9/n;

    .line 88
    .line 89
    return-object p1

    .line 90
    :pswitch_1b
    new-array p1, p1, [Lf9/a;

    .line 91
    .line 92
    return-object p1

    .line 93
    :pswitch_1c
    new-array p1, p1, [Lf4/c;

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
