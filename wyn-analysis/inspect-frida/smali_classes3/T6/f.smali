.class public final LT6/f;
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
    iput p1, p0, LT6/f;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget v0, p0, LT6/f;->a:I

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
    const-wide/16 v2, 0x0

    .line 12
    .line 13
    const/4 v4, 0x0

    .line 14
    move-object v7, v1

    .line 15
    move-object v11, v7

    .line 16
    move-object v12, v11

    .line 17
    move-wide v9, v2

    .line 18
    move v6, v4

    .line 19
    move v8, v6

    .line 20
    :goto_0
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-ge v1, v0, :cond_6

    .line 25
    .line 26
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    int-to-char v2, v1

    .line 31
    const/4 v3, 0x1

    .line 32
    if-eq v2, v3, :cond_5

    .line 33
    .line 34
    const/4 v3, 0x2

    .line 35
    if-eq v2, v3, :cond_4

    .line 36
    .line 37
    const/4 v3, 0x3

    .line 38
    if-eq v2, v3, :cond_3

    .line 39
    .line 40
    const/4 v3, 0x4

    .line 41
    if-eq v2, v3, :cond_2

    .line 42
    .line 43
    const/4 v3, 0x5

    .line 44
    if-eq v2, v3, :cond_1

    .line 45
    .line 46
    const/16 v3, 0x3e8

    .line 47
    .line 48
    if-eq v2, v3, :cond_0

    .line 49
    .line 50
    invoke-static {v1, p1}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    invoke-static {v1, p1}, LU8/v0;->f0(ILandroid/os/Parcel;)I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    move v6, v1

    .line 59
    goto :goto_0

    .line 60
    :cond_1
    invoke-static {v1, p1}, LU8/v0;->q(ILandroid/os/Parcel;)Landroid/os/Bundle;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    move-object v12, v1

    .line 65
    goto :goto_0

    .line 66
    :cond_2
    invoke-static {v1, p1}, LU8/v0;->r(ILandroid/os/Parcel;)[B

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    move-object v11, v1

    .line 71
    goto :goto_0

    .line 72
    :cond_3
    invoke-static {v1, p1}, LU8/v0;->h0(ILandroid/os/Parcel;)J

    .line 73
    .line 74
    .line 75
    move-result-wide v1

    .line 76
    move-wide v9, v1

    .line 77
    goto :goto_0

    .line 78
    :cond_4
    invoke-static {v1, p1}, LU8/v0;->f0(ILandroid/os/Parcel;)I

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    move v8, v1

    .line 83
    goto :goto_0

    .line 84
    :cond_5
    invoke-static {v1, p1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    move-object v7, v1

    .line 89
    goto :goto_0

    .line 90
    :cond_6
    invoke-static {v0, p1}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 91
    .line 92
    .line 93
    new-instance v5, LZ6/a;

    .line 94
    .line 95
    invoke-direct/range {v5 .. v12}, LZ6/a;-><init>(ILjava/lang/String;IJ[BLandroid/os/Bundle;)V

    .line 96
    .line 97
    .line 98
    return-object v5

    .line 99
    :pswitch_0
    new-instance v0, LZ5/b;

    .line 100
    .line 101
    invoke-direct {v0, p1}, LZ5/b;-><init>(Landroid/os/Parcel;)V

    .line 102
    .line 103
    .line 104
    return-object v0

    .line 105
    :pswitch_1
    new-instance v0, LZ5/a;

    .line 106
    .line 107
    invoke-direct {v0, p1}, LZ5/a;-><init>(Landroid/os/Parcel;)V

    .line 108
    .line 109
    .line 110
    return-object v0

    .line 111
    :pswitch_2
    new-instance v0, LY5/a;

    .line 112
    .line 113
    invoke-direct {v0, p1}, LY5/a;-><init>(Landroid/os/Parcel;)V

    .line 114
    .line 115
    .line 116
    return-object v0

    .line 117
    :pswitch_3
    invoke-static {p1}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    const/4 v1, 0x0

    .line 122
    move-object v2, v1

    .line 123
    :goto_1
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 124
    .line 125
    .line 126
    move-result v3

    .line 127
    if-ge v3, v0, :cond_9

    .line 128
    .line 129
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 130
    .line 131
    .line 132
    move-result v3

    .line 133
    int-to-char v4, v3

    .line 134
    const/4 v5, 0x1

    .line 135
    if-eq v4, v5, :cond_8

    .line 136
    .line 137
    const/4 v5, 0x2

    .line 138
    if-eq v4, v5, :cond_7

    .line 139
    .line 140
    invoke-static {v3, p1}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 141
    .line 142
    .line 143
    goto :goto_1

    .line 144
    :cond_7
    invoke-static {v3, p1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    goto :goto_1

    .line 149
    :cond_8
    invoke-static {v3, p1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    goto :goto_1

    .line 154
    :cond_9
    invoke-static {v0, p1}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 155
    .line 156
    .line 157
    new-instance p1, LX6/p;

    .line 158
    .line 159
    invoke-direct {p1, v1, v2}, LX6/p;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    return-object p1

    .line 163
    :pswitch_4
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
    :goto_2
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 178
    .line 179
    .line 180
    move-result v1

    .line 181
    if-ge v1, v0, :cond_a

    .line 182
    .line 183
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 184
    .line 185
    .line 186
    move-result v1

    .line 187
    int-to-char v2, v1

    .line 188
    packed-switch v2, :pswitch_data_1

    .line 189
    .line 190
    .line 191
    invoke-static {v1, p1}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 192
    .line 193
    .line 194
    goto :goto_2

    .line 195
    :pswitch_5
    sget-object v2, Lv7/x;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 196
    .line 197
    invoke-static {p1, v1, v2}, LU8/v0;->x(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 198
    .line 199
    .line 200
    move-result-object v1

    .line 201
    move-object v11, v1

    .line 202
    check-cast v11, Lv7/x;

    .line 203
    .line 204
    goto :goto_2

    .line 205
    :pswitch_6
    invoke-static {v1, p1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v10

    .line 209
    goto :goto_2

    .line 210
    :pswitch_7
    invoke-static {v1, p1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v9

    .line 214
    goto :goto_2

    .line 215
    :pswitch_8
    invoke-static {v1, p1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v8

    .line 219
    goto :goto_2

    .line 220
    :pswitch_9
    sget-object v2, Landroid/net/Uri;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 221
    .line 222
    invoke-static {p1, v1, v2}, LU8/v0;->x(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 223
    .line 224
    .line 225
    move-result-object v1

    .line 226
    move-object v7, v1

    .line 227
    check-cast v7, Landroid/net/Uri;

    .line 228
    .line 229
    goto :goto_2

    .line 230
    :pswitch_a
    invoke-static {v1, p1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v6

    .line 234
    goto :goto_2

    .line 235
    :pswitch_b
    invoke-static {v1, p1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v5

    .line 239
    goto :goto_2

    .line 240
    :pswitch_c
    invoke-static {v1, p1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v4

    .line 244
    goto :goto_2

    .line 245
    :pswitch_d
    invoke-static {v1, p1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v3

    .line 249
    goto :goto_2

    .line 250
    :cond_a
    invoke-static {v0, p1}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 251
    .line 252
    .line 253
    new-instance v2, LX6/o;

    .line 254
    .line 255
    invoke-direct/range {v2 .. v11}, LX6/o;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lv7/x;)V

    .line 256
    .line 257
    .line 258
    return-object v2

    .line 259
    :pswitch_e
    invoke-static {p1}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 260
    .line 261
    .line 262
    move-result v0

    .line 263
    const/4 v1, 0x0

    .line 264
    :goto_3
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 265
    .line 266
    .line 267
    move-result v2

    .line 268
    if-ge v2, v0, :cond_c

    .line 269
    .line 270
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 271
    .line 272
    .line 273
    move-result v2

    .line 274
    int-to-char v3, v2

    .line 275
    const/4 v4, 0x1

    .line 276
    if-eq v3, v4, :cond_b

    .line 277
    .line 278
    invoke-static {v2, p1}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 279
    .line 280
    .line 281
    goto :goto_3

    .line 282
    :cond_b
    sget-object v1, Landroid/app/PendingIntent;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 283
    .line 284
    invoke-static {p1, v2, v1}, LU8/v0;->x(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 285
    .line 286
    .line 287
    move-result-object v1

    .line 288
    check-cast v1, Landroid/app/PendingIntent;

    .line 289
    .line 290
    goto :goto_3

    .line 291
    :cond_c
    invoke-static {v0, p1}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 292
    .line 293
    .line 294
    new-instance p1, LX6/m;

    .line 295
    .line 296
    invoke-direct {p1, v1}, LX6/m;-><init>(Landroid/app/PendingIntent;)V

    .line 297
    .line 298
    .line 299
    return-object p1

    .line 300
    :pswitch_f
    invoke-static {p1}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 301
    .line 302
    .line 303
    move-result v0

    .line 304
    const/4 v1, 0x0

    .line 305
    const/4 v2, 0x0

    .line 306
    move-object v3, v2

    .line 307
    :goto_4
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 308
    .line 309
    .line 310
    move-result v4

    .line 311
    if-ge v4, v0, :cond_10

    .line 312
    .line 313
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 314
    .line 315
    .line 316
    move-result v4

    .line 317
    int-to-char v5, v4

    .line 318
    const/4 v6, 0x1

    .line 319
    if-eq v5, v6, :cond_f

    .line 320
    .line 321
    const/4 v6, 0x2

    .line 322
    if-eq v5, v6, :cond_e

    .line 323
    .line 324
    const/4 v6, 0x3

    .line 325
    if-eq v5, v6, :cond_d

    .line 326
    .line 327
    invoke-static {v4, p1}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 328
    .line 329
    .line 330
    goto :goto_4

    .line 331
    :cond_d
    invoke-static {v4, p1}, LU8/v0;->f0(ILandroid/os/Parcel;)I

    .line 332
    .line 333
    .line 334
    move-result v1

    .line 335
    goto :goto_4

    .line 336
    :cond_e
    invoke-static {v4, p1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    move-result-object v3

    .line 340
    goto :goto_4

    .line 341
    :cond_f
    sget-object v2, LX6/p;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 342
    .line 343
    invoke-static {p1, v4, v2}, LU8/v0;->x(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 344
    .line 345
    .line 346
    move-result-object v2

    .line 347
    check-cast v2, LX6/p;

    .line 348
    .line 349
    goto :goto_4

    .line 350
    :cond_10
    invoke-static {v0, p1}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 351
    .line 352
    .line 353
    new-instance p1, LX6/l;

    .line 354
    .line 355
    invoke-direct {p1, v2, v3, v1}, LX6/l;-><init>(LX6/p;Ljava/lang/String;I)V

    .line 356
    .line 357
    .line 358
    return-object p1

    .line 359
    :pswitch_10
    invoke-static {p1}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 360
    .line 361
    .line 362
    move-result v0

    .line 363
    const/4 v1, 0x0

    .line 364
    :goto_5
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 365
    .line 366
    .line 367
    move-result v2

    .line 368
    if-ge v2, v0, :cond_12

    .line 369
    .line 370
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 371
    .line 372
    .line 373
    move-result v2

    .line 374
    int-to-char v3, v2

    .line 375
    const/4 v4, 0x1

    .line 376
    if-eq v3, v4, :cond_11

    .line 377
    .line 378
    invoke-static {v2, p1}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 379
    .line 380
    .line 381
    goto :goto_5

    .line 382
    :cond_11
    sget-object v1, Landroid/app/PendingIntent;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 383
    .line 384
    invoke-static {p1, v2, v1}, LU8/v0;->x(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 385
    .line 386
    .line 387
    move-result-object v1

    .line 388
    check-cast v1, Landroid/app/PendingIntent;

    .line 389
    .line 390
    goto :goto_5

    .line 391
    :cond_12
    invoke-static {v0, p1}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 392
    .line 393
    .line 394
    new-instance p1, LX6/k;

    .line 395
    .line 396
    invoke-direct {p1, v1}, LX6/k;-><init>(Landroid/app/PendingIntent;)V

    .line 397
    .line 398
    .line 399
    return-object p1

    .line 400
    :pswitch_11
    invoke-static {p1}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 401
    .line 402
    .line 403
    move-result v0

    .line 404
    const/4 v1, 0x0

    .line 405
    const/4 v2, 0x0

    .line 406
    move v9, v1

    .line 407
    move-object v4, v2

    .line 408
    move-object v5, v4

    .line 409
    move-object v6, v5

    .line 410
    move-object v7, v6

    .line 411
    move-object v8, v7

    .line 412
    :goto_6
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 413
    .line 414
    .line 415
    move-result v1

    .line 416
    if-ge v1, v0, :cond_13

    .line 417
    .line 418
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 419
    .line 420
    .line 421
    move-result v1

    .line 422
    int-to-char v2, v1

    .line 423
    packed-switch v2, :pswitch_data_2

    .line 424
    .line 425
    .line 426
    invoke-static {v1, p1}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 427
    .line 428
    .line 429
    goto :goto_6

    .line 430
    :pswitch_12
    invoke-static {v1, p1}, LU8/v0;->f0(ILandroid/os/Parcel;)I

    .line 431
    .line 432
    .line 433
    move-result v9

    .line 434
    goto :goto_6

    .line 435
    :pswitch_13
    invoke-static {v1, p1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 436
    .line 437
    .line 438
    move-result-object v8

    .line 439
    goto :goto_6

    .line 440
    :pswitch_14
    invoke-static {v1, p1}, LU8/v0;->A(ILandroid/os/Parcel;)Ljava/util/ArrayList;

    .line 441
    .line 442
    .line 443
    move-result-object v7

    .line 444
    goto :goto_6

    .line 445
    :pswitch_15
    invoke-static {v1, p1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 446
    .line 447
    .line 448
    move-result-object v6

    .line 449
    goto :goto_6

    .line 450
    :pswitch_16
    invoke-static {v1, p1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 451
    .line 452
    .line 453
    move-result-object v5

    .line 454
    goto :goto_6

    .line 455
    :pswitch_17
    sget-object v2, Landroid/app/PendingIntent;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 456
    .line 457
    invoke-static {p1, v1, v2}, LU8/v0;->x(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 458
    .line 459
    .line 460
    move-result-object v1

    .line 461
    move-object v4, v1

    .line 462
    check-cast v4, Landroid/app/PendingIntent;

    .line 463
    .line 464
    goto :goto_6

    .line 465
    :cond_13
    invoke-static {v0, p1}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 466
    .line 467
    .line 468
    new-instance v3, Lcom/google/android/gms/auth/api/identity/SaveAccountLinkingTokenRequest;

    .line 469
    .line 470
    invoke-direct/range {v3 .. v9}, Lcom/google/android/gms/auth/api/identity/SaveAccountLinkingTokenRequest;-><init>(Landroid/app/PendingIntent;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;I)V

    .line 471
    .line 472
    .line 473
    return-object v3

    .line 474
    :pswitch_18
    invoke-static {p1}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 475
    .line 476
    .line 477
    move-result v0

    .line 478
    const/4 v1, 0x0

    .line 479
    :goto_7
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 480
    .line 481
    .line 482
    move-result v2

    .line 483
    if-ge v2, v0, :cond_15

    .line 484
    .line 485
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 486
    .line 487
    .line 488
    move-result v2

    .line 489
    int-to-char v3, v2

    .line 490
    const/4 v4, 0x1

    .line 491
    if-eq v3, v4, :cond_14

    .line 492
    .line 493
    invoke-static {v2, p1}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 494
    .line 495
    .line 496
    goto :goto_7

    .line 497
    :cond_14
    invoke-static {v2, p1}, LU8/v0;->Z(ILandroid/os/Parcel;)Z

    .line 498
    .line 499
    .line 500
    move-result v1

    .line 501
    goto :goto_7

    .line 502
    :cond_15
    invoke-static {v0, p1}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 503
    .line 504
    .line 505
    new-instance p1, LX6/e;

    .line 506
    .line 507
    invoke-direct {p1, v1}, LX6/e;-><init>(Z)V

    .line 508
    .line 509
    .line 510
    return-object p1

    .line 511
    :pswitch_19
    invoke-static {p1}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 512
    .line 513
    .line 514
    move-result v0

    .line 515
    const/4 v1, 0x0

    .line 516
    const/4 v2, 0x0

    .line 517
    move v3, v2

    .line 518
    move-object v2, v1

    .line 519
    :goto_8
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 520
    .line 521
    .line 522
    move-result v4

    .line 523
    if-ge v4, v0, :cond_19

    .line 524
    .line 525
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 526
    .line 527
    .line 528
    move-result v4

    .line 529
    int-to-char v5, v4

    .line 530
    const/4 v6, 0x1

    .line 531
    if-eq v5, v6, :cond_18

    .line 532
    .line 533
    const/4 v6, 0x2

    .line 534
    if-eq v5, v6, :cond_17

    .line 535
    .line 536
    const/4 v6, 0x3

    .line 537
    if-eq v5, v6, :cond_16

    .line 538
    .line 539
    invoke-static {v4, p1}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 540
    .line 541
    .line 542
    goto :goto_8

    .line 543
    :cond_16
    invoke-static {v4, p1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 544
    .line 545
    .line 546
    move-result-object v2

    .line 547
    goto :goto_8

    .line 548
    :cond_17
    invoke-static {v4, p1}, LU8/v0;->r(ILandroid/os/Parcel;)[B

    .line 549
    .line 550
    .line 551
    move-result-object v1

    .line 552
    goto :goto_8

    .line 553
    :cond_18
    invoke-static {v4, p1}, LU8/v0;->Z(ILandroid/os/Parcel;)Z

    .line 554
    .line 555
    .line 556
    move-result v3

    .line 557
    goto :goto_8

    .line 558
    :cond_19
    invoke-static {v0, p1}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 559
    .line 560
    .line 561
    new-instance p1, LX6/d;

    .line 562
    .line 563
    invoke-direct {p1, v1, v2, v3}, LX6/d;-><init>([BLjava/lang/String;Z)V

    .line 564
    .line 565
    .line 566
    return-object p1

    .line 567
    :pswitch_1a
    invoke-static {p1}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 568
    .line 569
    .line 570
    move-result v0

    .line 571
    const/4 v1, 0x0

    .line 572
    const/4 v2, 0x0

    .line 573
    :goto_9
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 574
    .line 575
    .line 576
    move-result v3

    .line 577
    if-ge v3, v0, :cond_1c

    .line 578
    .line 579
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 580
    .line 581
    .line 582
    move-result v3

    .line 583
    int-to-char v4, v3

    .line 584
    const/4 v5, 0x1

    .line 585
    if-eq v4, v5, :cond_1b

    .line 586
    .line 587
    const/4 v5, 0x2

    .line 588
    if-eq v4, v5, :cond_1a

    .line 589
    .line 590
    invoke-static {v3, p1}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 591
    .line 592
    .line 593
    goto :goto_9

    .line 594
    :cond_1a
    invoke-static {v3, p1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 595
    .line 596
    .line 597
    move-result-object v1

    .line 598
    goto :goto_9

    .line 599
    :cond_1b
    invoke-static {v3, p1}, LU8/v0;->Z(ILandroid/os/Parcel;)Z

    .line 600
    .line 601
    .line 602
    move-result v2

    .line 603
    goto :goto_9

    .line 604
    :cond_1c
    invoke-static {v0, p1}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 605
    .line 606
    .line 607
    new-instance p1, LX6/c;

    .line 608
    .line 609
    invoke-direct {p1, v2, v1}, LX6/c;-><init>(ZLjava/lang/String;)V

    .line 610
    .line 611
    .line 612
    return-object p1

    .line 613
    :pswitch_1b
    invoke-static {p1}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 614
    .line 615
    .line 616
    move-result v0

    .line 617
    const/4 v1, 0x0

    .line 618
    const/4 v2, 0x0

    .line 619
    move v4, v1

    .line 620
    move v7, v4

    .line 621
    move v10, v7

    .line 622
    move-object v5, v2

    .line 623
    move-object v6, v5

    .line 624
    move-object v8, v6

    .line 625
    move-object v9, v8

    .line 626
    :goto_a
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 627
    .line 628
    .line 629
    move-result v1

    .line 630
    if-ge v1, v0, :cond_1d

    .line 631
    .line 632
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 633
    .line 634
    .line 635
    move-result v1

    .line 636
    int-to-char v2, v1

    .line 637
    packed-switch v2, :pswitch_data_3

    .line 638
    .line 639
    .line 640
    invoke-static {v1, p1}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 641
    .line 642
    .line 643
    goto :goto_a

    .line 644
    :pswitch_1c
    invoke-static {v1, p1}, LU8/v0;->Z(ILandroid/os/Parcel;)Z

    .line 645
    .line 646
    .line 647
    move-result v10

    .line 648
    goto :goto_a

    .line 649
    :pswitch_1d
    invoke-static {v1, p1}, LU8/v0;->A(ILandroid/os/Parcel;)Ljava/util/ArrayList;

    .line 650
    .line 651
    .line 652
    move-result-object v9

    .line 653
    goto :goto_a

    .line 654
    :pswitch_1e
    invoke-static {v1, p1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 655
    .line 656
    .line 657
    move-result-object v8

    .line 658
    goto :goto_a

    .line 659
    :pswitch_1f
    invoke-static {v1, p1}, LU8/v0;->Z(ILandroid/os/Parcel;)Z

    .line 660
    .line 661
    .line 662
    move-result v7

    .line 663
    goto :goto_a

    .line 664
    :pswitch_20
    invoke-static {v1, p1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 665
    .line 666
    .line 667
    move-result-object v6

    .line 668
    goto :goto_a

    .line 669
    :pswitch_21
    invoke-static {v1, p1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 670
    .line 671
    .line 672
    move-result-object v5

    .line 673
    goto :goto_a

    .line 674
    :pswitch_22
    invoke-static {v1, p1}, LU8/v0;->Z(ILandroid/os/Parcel;)Z

    .line 675
    .line 676
    .line 677
    move-result v4

    .line 678
    goto :goto_a

    .line 679
    :cond_1d
    invoke-static {v0, p1}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 680
    .line 681
    .line 682
    new-instance v3, LX6/b;

    .line 683
    .line 684
    invoke-direct/range {v3 .. v10}, LX6/b;-><init>(ZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/ArrayList;Z)V

    .line 685
    .line 686
    .line 687
    return-object v3

    .line 688
    :pswitch_23
    invoke-static {p1}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 689
    .line 690
    .line 691
    move-result v0

    .line 692
    const/4 v1, 0x0

    .line 693
    const/4 v2, 0x0

    .line 694
    move v4, v1

    .line 695
    move v9, v4

    .line 696
    move-object v5, v2

    .line 697
    move-object v6, v5

    .line 698
    move-object v7, v6

    .line 699
    move-object v8, v7

    .line 700
    :goto_b
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 701
    .line 702
    .line 703
    move-result v1

    .line 704
    if-ge v1, v0, :cond_1e

    .line 705
    .line 706
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 707
    .line 708
    .line 709
    move-result v1

    .line 710
    int-to-char v2, v1

    .line 711
    packed-switch v2, :pswitch_data_4

    .line 712
    .line 713
    .line 714
    invoke-static {v1, p1}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 715
    .line 716
    .line 717
    goto :goto_b

    .line 718
    :pswitch_24
    invoke-static {v1, p1}, LU8/v0;->f0(ILandroid/os/Parcel;)I

    .line 719
    .line 720
    .line 721
    move-result v9

    .line 722
    goto :goto_b

    .line 723
    :pswitch_25
    invoke-static {v1, p1}, LU8/v0;->Z(ILandroid/os/Parcel;)Z

    .line 724
    .line 725
    .line 726
    move-result v4

    .line 727
    goto :goto_b

    .line 728
    :pswitch_26
    invoke-static {v1, p1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 729
    .line 730
    .line 731
    move-result-object v8

    .line 732
    goto :goto_b

    .line 733
    :pswitch_27
    invoke-static {v1, p1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 734
    .line 735
    .line 736
    move-result-object v7

    .line 737
    goto :goto_b

    .line 738
    :pswitch_28
    invoke-static {v1, p1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 739
    .line 740
    .line 741
    move-result-object v6

    .line 742
    goto :goto_b

    .line 743
    :pswitch_29
    invoke-static {v1, p1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 744
    .line 745
    .line 746
    move-result-object v5

    .line 747
    goto :goto_b

    .line 748
    :cond_1e
    invoke-static {v0, p1}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 749
    .line 750
    .line 751
    new-instance v3, LX6/j;

    .line 752
    .line 753
    invoke-direct/range {v3 .. v9}, LX6/j;-><init>(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 754
    .line 755
    .line 756
    return-object v3

    .line 757
    :pswitch_2a
    invoke-static {p1}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 758
    .line 759
    .line 760
    move-result v0

    .line 761
    const/4 v1, 0x0

    .line 762
    :goto_c
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 763
    .line 764
    .line 765
    move-result v2

    .line 766
    if-ge v2, v0, :cond_20

    .line 767
    .line 768
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 769
    .line 770
    .line 771
    move-result v2

    .line 772
    int-to-char v3, v2

    .line 773
    const/4 v4, 0x1

    .line 774
    if-eq v3, v4, :cond_1f

    .line 775
    .line 776
    invoke-static {v2, p1}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 777
    .line 778
    .line 779
    goto :goto_c

    .line 780
    :cond_1f
    invoke-static {v2, p1}, LU8/v0;->f0(ILandroid/os/Parcel;)I

    .line 781
    .line 782
    .line 783
    move-result v1

    .line 784
    goto :goto_c

    .line 785
    :cond_20
    invoke-static {v0, p1}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 786
    .line 787
    .line 788
    new-instance p1, LX6/i;

    .line 789
    .line 790
    invoke-direct {p1, v1}, LX6/i;-><init>(I)V

    .line 791
    .line 792
    .line 793
    return-object p1

    .line 794
    :pswitch_2b
    invoke-static {p1}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 795
    .line 796
    .line 797
    move-result v0

    .line 798
    const/4 v1, 0x0

    .line 799
    :goto_d
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 800
    .line 801
    .line 802
    move-result v2

    .line 803
    if-ge v2, v0, :cond_22

    .line 804
    .line 805
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 806
    .line 807
    .line 808
    move-result v2

    .line 809
    int-to-char v3, v2

    .line 810
    const/4 v4, 0x1

    .line 811
    if-eq v3, v4, :cond_21

    .line 812
    .line 813
    invoke-static {v2, p1}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 814
    .line 815
    .line 816
    goto :goto_d

    .line 817
    :cond_21
    sget-object v1, Landroid/app/PendingIntent;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 818
    .line 819
    invoke-static {p1, v2, v1}, LU8/v0;->x(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 820
    .line 821
    .line 822
    move-result-object v1

    .line 823
    check-cast v1, Landroid/app/PendingIntent;

    .line 824
    .line 825
    goto :goto_d

    .line 826
    :cond_22
    invoke-static {v0, p1}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 827
    .line 828
    .line 829
    new-instance p1, LX6/g;

    .line 830
    .line 831
    invoke-direct {p1, v1}, LX6/g;-><init>(Landroid/app/PendingIntent;)V

    .line 832
    .line 833
    .line 834
    return-object p1

    .line 835
    :pswitch_2c
    invoke-static {p1}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 836
    .line 837
    .line 838
    move-result v0

    .line 839
    const/4 v1, 0x0

    .line 840
    const/4 v2, 0x0

    .line 841
    move-object v4, v1

    .line 842
    move-object v5, v4

    .line 843
    move-object v6, v5

    .line 844
    move-object v9, v6

    .line 845
    move-object v10, v9

    .line 846
    move v7, v2

    .line 847
    move v8, v7

    .line 848
    :goto_e
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 849
    .line 850
    .line 851
    move-result v1

    .line 852
    if-ge v1, v0, :cond_23

    .line 853
    .line 854
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 855
    .line 856
    .line 857
    move-result v1

    .line 858
    int-to-char v2, v1

    .line 859
    packed-switch v2, :pswitch_data_5

    .line 860
    .line 861
    .line 862
    invoke-static {v1, p1}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 863
    .line 864
    .line 865
    goto :goto_e

    .line 866
    :pswitch_2d
    sget-object v2, LX6/c;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 867
    .line 868
    invoke-static {p1, v1, v2}, LU8/v0;->x(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 869
    .line 870
    .line 871
    move-result-object v1

    .line 872
    move-object v10, v1

    .line 873
    check-cast v10, LX6/c;

    .line 874
    .line 875
    goto :goto_e

    .line 876
    :pswitch_2e
    sget-object v2, LX6/d;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 877
    .line 878
    invoke-static {p1, v1, v2}, LU8/v0;->x(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 879
    .line 880
    .line 881
    move-result-object v1

    .line 882
    move-object v9, v1

    .line 883
    check-cast v9, LX6/d;

    .line 884
    .line 885
    goto :goto_e

    .line 886
    :pswitch_2f
    invoke-static {v1, p1}, LU8/v0;->f0(ILandroid/os/Parcel;)I

    .line 887
    .line 888
    .line 889
    move-result v8

    .line 890
    goto :goto_e

    .line 891
    :pswitch_30
    invoke-static {v1, p1}, LU8/v0;->Z(ILandroid/os/Parcel;)Z

    .line 892
    .line 893
    .line 894
    move-result v7

    .line 895
    goto :goto_e

    .line 896
    :pswitch_31
    invoke-static {v1, p1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 897
    .line 898
    .line 899
    move-result-object v6

    .line 900
    goto :goto_e

    .line 901
    :pswitch_32
    sget-object v2, LX6/b;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 902
    .line 903
    invoke-static {p1, v1, v2}, LU8/v0;->x(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 904
    .line 905
    .line 906
    move-result-object v1

    .line 907
    move-object v5, v1

    .line 908
    check-cast v5, LX6/b;

    .line 909
    .line 910
    goto :goto_e

    .line 911
    :pswitch_33
    sget-object v2, LX6/e;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 912
    .line 913
    invoke-static {p1, v1, v2}, LU8/v0;->x(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 914
    .line 915
    .line 916
    move-result-object v1

    .line 917
    move-object v4, v1

    .line 918
    check-cast v4, LX6/e;

    .line 919
    .line 920
    goto :goto_e

    .line 921
    :cond_23
    invoke-static {v0, p1}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 922
    .line 923
    .line 924
    new-instance v3, LX6/f;

    .line 925
    .line 926
    invoke-direct/range {v3 .. v10}, LX6/f;-><init>(LX6/e;LX6/b;Ljava/lang/String;ZILX6/d;LX6/c;)V

    .line 927
    .line 928
    .line 929
    return-object v3

    .line 930
    :pswitch_34
    invoke-static {p1}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 931
    .line 932
    .line 933
    move-result v0

    .line 934
    const/4 v1, 0x0

    .line 935
    move-object v3, v1

    .line 936
    move-object v4, v3

    .line 937
    move-object v5, v4

    .line 938
    move-object v6, v5

    .line 939
    move-object v7, v6

    .line 940
    move-object v8, v7

    .line 941
    :goto_f
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 942
    .line 943
    .line 944
    move-result v1

    .line 945
    if-ge v1, v0, :cond_24

    .line 946
    .line 947
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 948
    .line 949
    .line 950
    move-result v1

    .line 951
    int-to-char v2, v1

    .line 952
    packed-switch v2, :pswitch_data_6

    .line 953
    .line 954
    .line 955
    invoke-static {v1, p1}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 956
    .line 957
    .line 958
    goto :goto_f

    .line 959
    :pswitch_35
    sget-object v2, Landroid/app/PendingIntent;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 960
    .line 961
    invoke-static {p1, v1, v2}, LU8/v0;->x(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 962
    .line 963
    .line 964
    move-result-object v1

    .line 965
    move-object v8, v1

    .line 966
    check-cast v8, Landroid/app/PendingIntent;

    .line 967
    .line 968
    goto :goto_f

    .line 969
    :pswitch_36
    sget-object v2, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 970
    .line 971
    invoke-static {p1, v1, v2}, LU8/v0;->x(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 972
    .line 973
    .line 974
    move-result-object v1

    .line 975
    move-object v7, v1

    .line 976
    check-cast v7, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    .line 977
    .line 978
    goto :goto_f

    .line 979
    :pswitch_37
    invoke-static {v1, p1}, LU8/v0;->A(ILandroid/os/Parcel;)Ljava/util/ArrayList;

    .line 980
    .line 981
    .line 982
    move-result-object v6

    .line 983
    goto :goto_f

    .line 984
    :pswitch_38
    invoke-static {v1, p1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 985
    .line 986
    .line 987
    move-result-object v5

    .line 988
    goto :goto_f

    .line 989
    :pswitch_39
    invoke-static {v1, p1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 990
    .line 991
    .line 992
    move-result-object v4

    .line 993
    goto :goto_f

    .line 994
    :pswitch_3a
    invoke-static {v1, p1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 995
    .line 996
    .line 997
    move-result-object v3

    .line 998
    goto :goto_f

    .line 999
    :cond_24
    invoke-static {v0, p1}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 1000
    .line 1001
    .line 1002
    new-instance v2, LX6/a;

    .line 1003
    .line 1004
    invoke-direct/range {v2 .. v8}, LX6/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;Landroid/app/PendingIntent;)V

    .line 1005
    .line 1006
    .line 1007
    return-object v2

    .line 1008
    :pswitch_3b
    invoke-static {p1}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 1009
    .line 1010
    .line 1011
    move-result v0

    .line 1012
    const/4 v1, 0x0

    .line 1013
    const/4 v2, 0x0

    .line 1014
    move v6, v1

    .line 1015
    move v7, v6

    .line 1016
    move v11, v7

    .line 1017
    move-object v4, v2

    .line 1018
    move-object v5, v4

    .line 1019
    move-object v8, v5

    .line 1020
    move-object v9, v8

    .line 1021
    move-object v10, v9

    .line 1022
    :goto_10
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 1023
    .line 1024
    .line 1025
    move-result v1

    .line 1026
    if-ge v1, v0, :cond_25

    .line 1027
    .line 1028
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 1029
    .line 1030
    .line 1031
    move-result v1

    .line 1032
    int-to-char v2, v1

    .line 1033
    packed-switch v2, :pswitch_data_7

    .line 1034
    .line 1035
    .line 1036
    invoke-static {v1, p1}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 1037
    .line 1038
    .line 1039
    goto :goto_10

    .line 1040
    :pswitch_3c
    invoke-static {v1, p1}, LU8/v0;->Z(ILandroid/os/Parcel;)Z

    .line 1041
    .line 1042
    .line 1043
    move-result v11

    .line 1044
    goto :goto_10

    .line 1045
    :pswitch_3d
    invoke-static {v1, p1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1046
    .line 1047
    .line 1048
    move-result-object v10

    .line 1049
    goto :goto_10

    .line 1050
    :pswitch_3e
    invoke-static {v1, p1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1051
    .line 1052
    .line 1053
    move-result-object v9

    .line 1054
    goto :goto_10

    .line 1055
    :pswitch_3f
    sget-object v2, Landroid/accounts/Account;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1056
    .line 1057
    invoke-static {p1, v1, v2}, LU8/v0;->x(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1058
    .line 1059
    .line 1060
    move-result-object v1

    .line 1061
    move-object v8, v1

    .line 1062
    check-cast v8, Landroid/accounts/Account;

    .line 1063
    .line 1064
    goto :goto_10

    .line 1065
    :pswitch_40
    invoke-static {v1, p1}, LU8/v0;->Z(ILandroid/os/Parcel;)Z

    .line 1066
    .line 1067
    .line 1068
    move-result v7

    .line 1069
    goto :goto_10

    .line 1070
    :pswitch_41
    invoke-static {v1, p1}, LU8/v0;->Z(ILandroid/os/Parcel;)Z

    .line 1071
    .line 1072
    .line 1073
    move-result v6

    .line 1074
    goto :goto_10

    .line 1075
    :pswitch_42
    invoke-static {v1, p1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1076
    .line 1077
    .line 1078
    move-result-object v5

    .line 1079
    goto :goto_10

    .line 1080
    :pswitch_43
    sget-object v2, Lcom/google/android/gms/common/api/Scope;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1081
    .line 1082
    invoke-static {p1, v1, v2}, LU8/v0;->C(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 1083
    .line 1084
    .line 1085
    move-result-object v4

    .line 1086
    goto :goto_10

    .line 1087
    :cond_25
    invoke-static {v0, p1}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 1088
    .line 1089
    .line 1090
    new-instance v3, Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;

    .line 1091
    .line 1092
    invoke-direct/range {v3 .. v11}, Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;-><init>(Ljava/util/ArrayList;Ljava/lang/String;ZZLandroid/accounts/Account;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1093
    .line 1094
    .line 1095
    return-object v3

    .line 1096
    :pswitch_44
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 1097
    .line 1098
    .line 1099
    move-result-object v0

    .line 1100
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1101
    .line 1102
    .line 1103
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 1104
    .line 1105
    .line 1106
    move-result p1

    .line 1107
    new-instance v1, LX5/a;

    .line 1108
    .line 1109
    invoke-direct {v1, p1, v0}, LX5/a;-><init>(ILjava/lang/String;)V

    .line 1110
    .line 1111
    .line 1112
    return-object v1

    .line 1113
    :pswitch_45
    invoke-static {p1}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 1114
    .line 1115
    .line 1116
    move-result v0

    .line 1117
    const/4 v1, 0x0

    .line 1118
    :goto_11
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 1119
    .line 1120
    .line 1121
    move-result v2

    .line 1122
    if-ge v2, v0, :cond_27

    .line 1123
    .line 1124
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 1125
    .line 1126
    .line 1127
    move-result v2

    .line 1128
    int-to-char v3, v2

    .line 1129
    const/4 v4, 0x2

    .line 1130
    if-eq v3, v4, :cond_26

    .line 1131
    .line 1132
    invoke-static {v2, p1}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 1133
    .line 1134
    .line 1135
    goto :goto_11

    .line 1136
    :cond_26
    invoke-static {v2, p1}, LU8/v0;->q(ILandroid/os/Parcel;)Landroid/os/Bundle;

    .line 1137
    .line 1138
    .line 1139
    move-result-object v1

    .line 1140
    goto :goto_11

    .line 1141
    :cond_27
    invoke-static {v0, p1}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 1142
    .line 1143
    .line 1144
    new-instance p1, LW9/t;

    .line 1145
    .line 1146
    invoke-direct {p1, v1}, LW9/t;-><init>(Landroid/os/Bundle;)V

    .line 1147
    .line 1148
    .line 1149
    return-object p1

    .line 1150
    :pswitch_46
    invoke-static {p1}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 1151
    .line 1152
    .line 1153
    move-result v0

    .line 1154
    const/4 v1, 0x0

    .line 1155
    const-wide/16 v2, 0x0

    .line 1156
    .line 1157
    move v5, v1

    .line 1158
    move v6, v5

    .line 1159
    move v7, v6

    .line 1160
    move-wide v8, v2

    .line 1161
    :goto_12
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 1162
    .line 1163
    .line 1164
    move-result v1

    .line 1165
    if-ge v1, v0, :cond_2c

    .line 1166
    .line 1167
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 1168
    .line 1169
    .line 1170
    move-result v1

    .line 1171
    int-to-char v2, v1

    .line 1172
    const/4 v3, 0x1

    .line 1173
    if-eq v2, v3, :cond_2b

    .line 1174
    .line 1175
    const/4 v3, 0x2

    .line 1176
    if-eq v2, v3, :cond_2a

    .line 1177
    .line 1178
    const/4 v3, 0x3

    .line 1179
    if-eq v2, v3, :cond_29

    .line 1180
    .line 1181
    const/4 v3, 0x4

    .line 1182
    if-eq v2, v3, :cond_28

    .line 1183
    .line 1184
    invoke-static {v1, p1}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 1185
    .line 1186
    .line 1187
    goto :goto_12

    .line 1188
    :cond_28
    invoke-static {v1, p1}, LU8/v0;->Z(ILandroid/os/Parcel;)Z

    .line 1189
    .line 1190
    .line 1191
    move-result v1

    .line 1192
    move v7, v1

    .line 1193
    goto :goto_12

    .line 1194
    :cond_29
    invoke-static {v1, p1}, LU8/v0;->h0(ILandroid/os/Parcel;)J

    .line 1195
    .line 1196
    .line 1197
    move-result-wide v1

    .line 1198
    move-wide v8, v1

    .line 1199
    goto :goto_12

    .line 1200
    :cond_2a
    invoke-static {v1, p1}, LU8/v0;->Z(ILandroid/os/Parcel;)Z

    .line 1201
    .line 1202
    .line 1203
    move-result v1

    .line 1204
    move v6, v1

    .line 1205
    goto :goto_12

    .line 1206
    :cond_2b
    invoke-static {v1, p1}, LU8/v0;->f0(ILandroid/os/Parcel;)I

    .line 1207
    .line 1208
    .line 1209
    move-result v1

    .line 1210
    move v5, v1

    .line 1211
    goto :goto_12

    .line 1212
    :cond_2c
    invoke-static {v0, p1}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 1213
    .line 1214
    .line 1215
    new-instance v4, LW6/a;

    .line 1216
    .line 1217
    invoke-direct/range {v4 .. v9}, LW6/a;-><init>(IZZJ)V

    .line 1218
    .line 1219
    .line 1220
    return-object v4

    .line 1221
    :pswitch_47
    invoke-static {p1}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 1222
    .line 1223
    .line 1224
    move-result v0

    .line 1225
    new-instance v2, Ljava/util/HashSet;

    .line 1226
    .line 1227
    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 1228
    .line 1229
    .line 1230
    const/4 v1, 0x0

    .line 1231
    const/4 v3, 0x0

    .line 1232
    move-object v4, v1

    .line 1233
    move-object v6, v4

    .line 1234
    move-object v7, v6

    .line 1235
    move-object v8, v7

    .line 1236
    move v5, v3

    .line 1237
    :goto_13
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 1238
    .line 1239
    .line 1240
    move-result v1

    .line 1241
    if-ge v1, v0, :cond_2d

    .line 1242
    .line 1243
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 1244
    .line 1245
    .line 1246
    move-result v1

    .line 1247
    int-to-char v9, v1

    .line 1248
    packed-switch v9, :pswitch_data_8

    .line 1249
    .line 1250
    .line 1251
    invoke-static {v1, p1}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 1252
    .line 1253
    .line 1254
    goto :goto_13

    .line 1255
    :pswitch_48
    sget-object v8, LW6/a;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1256
    .line 1257
    invoke-static {p1, v1, v8}, LU8/v0;->x(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1258
    .line 1259
    .line 1260
    move-result-object v1

    .line 1261
    move-object v8, v1

    .line 1262
    check-cast v8, LW6/a;

    .line 1263
    .line 1264
    const/4 v1, 0x6

    .line 1265
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1266
    .line 1267
    .line 1268
    move-result-object v1

    .line 1269
    invoke-virtual {v2, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1270
    .line 1271
    .line 1272
    goto :goto_13

    .line 1273
    :pswitch_49
    sget-object v7, Landroid/app/PendingIntent;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1274
    .line 1275
    invoke-static {p1, v1, v7}, LU8/v0;->x(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1276
    .line 1277
    .line 1278
    move-result-object v1

    .line 1279
    move-object v7, v1

    .line 1280
    check-cast v7, Landroid/app/PendingIntent;

    .line 1281
    .line 1282
    const/4 v1, 0x5

    .line 1283
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1284
    .line 1285
    .line 1286
    move-result-object v1

    .line 1287
    invoke-virtual {v2, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1288
    .line 1289
    .line 1290
    goto :goto_13

    .line 1291
    :pswitch_4a
    invoke-static {v1, p1}, LU8/v0;->r(ILandroid/os/Parcel;)[B

    .line 1292
    .line 1293
    .line 1294
    move-result-object v6

    .line 1295
    const/4 v1, 0x4

    .line 1296
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1297
    .line 1298
    .line 1299
    move-result-object v1

    .line 1300
    invoke-virtual {v2, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1301
    .line 1302
    .line 1303
    goto :goto_13

    .line 1304
    :pswitch_4b
    invoke-static {v1, p1}, LU8/v0;->f0(ILandroid/os/Parcel;)I

    .line 1305
    .line 1306
    .line 1307
    move-result v5

    .line 1308
    const/4 v1, 0x3

    .line 1309
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1310
    .line 1311
    .line 1312
    move-result-object v1

    .line 1313
    invoke-virtual {v2, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1314
    .line 1315
    .line 1316
    goto :goto_13

    .line 1317
    :pswitch_4c
    invoke-static {v1, p1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1318
    .line 1319
    .line 1320
    move-result-object v4

    .line 1321
    const/4 v1, 0x2

    .line 1322
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1323
    .line 1324
    .line 1325
    move-result-object v1

    .line 1326
    invoke-virtual {v2, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1327
    .line 1328
    .line 1329
    goto :goto_13

    .line 1330
    :pswitch_4d
    invoke-static {v1, p1}, LU8/v0;->f0(ILandroid/os/Parcel;)I

    .line 1331
    .line 1332
    .line 1333
    move-result v3

    .line 1334
    const/4 v1, 0x1

    .line 1335
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1336
    .line 1337
    .line 1338
    move-result-object v1

    .line 1339
    invoke-virtual {v2, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1340
    .line 1341
    .line 1342
    goto :goto_13

    .line 1343
    :cond_2d
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 1344
    .line 1345
    .line 1346
    move-result v1

    .line 1347
    if-ne v1, v0, :cond_2e

    .line 1348
    .line 1349
    new-instance v1, LW6/f;

    .line 1350
    .line 1351
    invoke-direct/range {v1 .. v8}, LW6/f;-><init>(Ljava/util/HashSet;ILjava/lang/String;I[BLandroid/app/PendingIntent;LW6/a;)V

    .line 1352
    .line 1353
    .line 1354
    return-object v1

    .line 1355
    :cond_2e
    new-instance v1, Lf7/b;

    .line 1356
    .line 1357
    const-string v2, "Overread allowed size end="

    .line 1358
    .line 1359
    invoke-static {v0, v2}, Lka/n;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 1360
    .line 1361
    .line 1362
    move-result-object v0

    .line 1363
    invoke-direct {v1, v0, p1}, Lf7/b;-><init>(Ljava/lang/String;Landroid/os/Parcel;)V

    .line 1364
    .line 1365
    .line 1366
    throw v1

    .line 1367
    :pswitch_4e
    invoke-static {p1}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 1368
    .line 1369
    .line 1370
    move-result v0

    .line 1371
    new-instance v2, Ljava/util/HashSet;

    .line 1372
    .line 1373
    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 1374
    .line 1375
    .line 1376
    const/4 v1, 0x0

    .line 1377
    const/4 v3, 0x0

    .line 1378
    move-object v4, v1

    .line 1379
    move-object v5, v4

    .line 1380
    move-object v6, v5

    .line 1381
    move-object v7, v6

    .line 1382
    :goto_14
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 1383
    .line 1384
    .line 1385
    move-result v1

    .line 1386
    if-ge v1, v0, :cond_34

    .line 1387
    .line 1388
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 1389
    .line 1390
    .line 1391
    move-result v1

    .line 1392
    int-to-char v8, v1

    .line 1393
    const/4 v9, 0x1

    .line 1394
    if-eq v8, v9, :cond_33

    .line 1395
    .line 1396
    const/4 v9, 0x2

    .line 1397
    if-eq v8, v9, :cond_32

    .line 1398
    .line 1399
    const/4 v9, 0x3

    .line 1400
    if-eq v8, v9, :cond_31

    .line 1401
    .line 1402
    const/4 v9, 0x4

    .line 1403
    if-eq v8, v9, :cond_30

    .line 1404
    .line 1405
    const/4 v9, 0x5

    .line 1406
    if-eq v8, v9, :cond_2f

    .line 1407
    .line 1408
    invoke-static {v1, p1}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 1409
    .line 1410
    .line 1411
    goto :goto_14

    .line 1412
    :cond_2f
    invoke-static {v1, p1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1413
    .line 1414
    .line 1415
    move-result-object v7

    .line 1416
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1417
    .line 1418
    .line 1419
    move-result-object v1

    .line 1420
    invoke-virtual {v2, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1421
    .line 1422
    .line 1423
    goto :goto_14

    .line 1424
    :cond_30
    invoke-static {v1, p1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1425
    .line 1426
    .line 1427
    move-result-object v6

    .line 1428
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1429
    .line 1430
    .line 1431
    move-result-object v1

    .line 1432
    invoke-virtual {v2, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1433
    .line 1434
    .line 1435
    goto :goto_14

    .line 1436
    :cond_31
    invoke-static {v1, p1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1437
    .line 1438
    .line 1439
    move-result-object v5

    .line 1440
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1441
    .line 1442
    .line 1443
    move-result-object v1

    .line 1444
    invoke-virtual {v2, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1445
    .line 1446
    .line 1447
    goto :goto_14

    .line 1448
    :cond_32
    sget-object v4, LW6/f;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1449
    .line 1450
    invoke-static {p1, v1, v4}, LU8/v0;->x(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1451
    .line 1452
    .line 1453
    move-result-object v1

    .line 1454
    move-object v4, v1

    .line 1455
    check-cast v4, LW6/f;

    .line 1456
    .line 1457
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1458
    .line 1459
    .line 1460
    move-result-object v1

    .line 1461
    invoke-virtual {v2, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1462
    .line 1463
    .line 1464
    goto :goto_14

    .line 1465
    :cond_33
    invoke-static {v1, p1}, LU8/v0;->f0(ILandroid/os/Parcel;)I

    .line 1466
    .line 1467
    .line 1468
    move-result v3

    .line 1469
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1470
    .line 1471
    .line 1472
    move-result-object v1

    .line 1473
    invoke-virtual {v2, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1474
    .line 1475
    .line 1476
    goto :goto_14

    .line 1477
    :cond_34
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 1478
    .line 1479
    .line 1480
    move-result v1

    .line 1481
    if-ne v1, v0, :cond_35

    .line 1482
    .line 1483
    new-instance v1, LW6/e;

    .line 1484
    .line 1485
    invoke-direct/range {v1 .. v7}, LW6/e;-><init>(Ljava/util/HashSet;ILW6/f;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1486
    .line 1487
    .line 1488
    return-object v1

    .line 1489
    :cond_35
    new-instance v1, Lf7/b;

    .line 1490
    .line 1491
    const-string v2, "Overread allowed size end="

    .line 1492
    .line 1493
    invoke-static {v0, v2}, Lka/n;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 1494
    .line 1495
    .line 1496
    move-result-object v0

    .line 1497
    invoke-direct {v1, v0, p1}, Lf7/b;-><init>(Ljava/lang/String;Landroid/os/Parcel;)V

    .line 1498
    .line 1499
    .line 1500
    throw v1

    .line 1501
    :pswitch_4f
    invoke-static {p1}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 1502
    .line 1503
    .line 1504
    move-result v0

    .line 1505
    const/4 v1, 0x0

    .line 1506
    const/4 v2, 0x0

    .line 1507
    move-object v5, v1

    .line 1508
    move-object v6, v5

    .line 1509
    move-object v7, v6

    .line 1510
    move-object v8, v7

    .line 1511
    move-object v9, v8

    .line 1512
    move v4, v2

    .line 1513
    :goto_15
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 1514
    .line 1515
    .line 1516
    move-result v1

    .line 1517
    if-ge v1, v0, :cond_36

    .line 1518
    .line 1519
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 1520
    .line 1521
    .line 1522
    move-result v1

    .line 1523
    int-to-char v2, v1

    .line 1524
    packed-switch v2, :pswitch_data_9

    .line 1525
    .line 1526
    .line 1527
    invoke-static {v1, p1}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 1528
    .line 1529
    .line 1530
    goto :goto_15

    .line 1531
    :pswitch_50
    invoke-static {v1, p1}, LU8/v0;->A(ILandroid/os/Parcel;)Ljava/util/ArrayList;

    .line 1532
    .line 1533
    .line 1534
    move-result-object v9

    .line 1535
    goto :goto_15

    .line 1536
    :pswitch_51
    invoke-static {v1, p1}, LU8/v0;->A(ILandroid/os/Parcel;)Ljava/util/ArrayList;

    .line 1537
    .line 1538
    .line 1539
    move-result-object v8

    .line 1540
    goto :goto_15

    .line 1541
    :pswitch_52
    invoke-static {v1, p1}, LU8/v0;->A(ILandroid/os/Parcel;)Ljava/util/ArrayList;

    .line 1542
    .line 1543
    .line 1544
    move-result-object v7

    .line 1545
    goto :goto_15

    .line 1546
    :pswitch_53
    invoke-static {v1, p1}, LU8/v0;->A(ILandroid/os/Parcel;)Ljava/util/ArrayList;

    .line 1547
    .line 1548
    .line 1549
    move-result-object v6

    .line 1550
    goto :goto_15

    .line 1551
    :pswitch_54
    invoke-static {v1, p1}, LU8/v0;->A(ILandroid/os/Parcel;)Ljava/util/ArrayList;

    .line 1552
    .line 1553
    .line 1554
    move-result-object v5

    .line 1555
    goto :goto_15

    .line 1556
    :pswitch_55
    invoke-static {v1, p1}, LU8/v0;->f0(ILandroid/os/Parcel;)I

    .line 1557
    .line 1558
    .line 1559
    move-result v4

    .line 1560
    goto :goto_15

    .line 1561
    :cond_36
    invoke-static {v0, p1}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 1562
    .line 1563
    .line 1564
    new-instance v3, LW6/d;

    .line 1565
    .line 1566
    invoke-direct/range {v3 .. v9}, LW6/d;-><init>(ILjava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 1567
    .line 1568
    .line 1569
    return-object v3

    .line 1570
    :pswitch_56
    invoke-static {p1}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 1571
    .line 1572
    .line 1573
    move-result v0

    .line 1574
    new-instance v2, Ljava/util/HashSet;

    .line 1575
    .line 1576
    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 1577
    .line 1578
    .line 1579
    const/4 v1, 0x0

    .line 1580
    const/4 v3, 0x0

    .line 1581
    move-object v4, v1

    .line 1582
    move-object v6, v4

    .line 1583
    move v5, v3

    .line 1584
    :goto_16
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 1585
    .line 1586
    .line 1587
    move-result v1

    .line 1588
    if-ge v1, v0, :cond_3b

    .line 1589
    .line 1590
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 1591
    .line 1592
    .line 1593
    move-result v1

    .line 1594
    int-to-char v7, v1

    .line 1595
    const/4 v8, 0x1

    .line 1596
    if-eq v7, v8, :cond_3a

    .line 1597
    .line 1598
    const/4 v8, 0x2

    .line 1599
    if-eq v7, v8, :cond_39

    .line 1600
    .line 1601
    const/4 v8, 0x3

    .line 1602
    if-eq v7, v8, :cond_38

    .line 1603
    .line 1604
    const/4 v8, 0x4

    .line 1605
    if-eq v7, v8, :cond_37

    .line 1606
    .line 1607
    invoke-static {v1, p1}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 1608
    .line 1609
    .line 1610
    goto :goto_16

    .line 1611
    :cond_37
    sget-object v6, LW6/d;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1612
    .line 1613
    invoke-static {p1, v1, v6}, LU8/v0;->x(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1614
    .line 1615
    .line 1616
    move-result-object v1

    .line 1617
    move-object v6, v1

    .line 1618
    check-cast v6, LW6/d;

    .line 1619
    .line 1620
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1621
    .line 1622
    .line 1623
    move-result-object v1

    .line 1624
    invoke-virtual {v2, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1625
    .line 1626
    .line 1627
    goto :goto_16

    .line 1628
    :cond_38
    invoke-static {v1, p1}, LU8/v0;->f0(ILandroid/os/Parcel;)I

    .line 1629
    .line 1630
    .line 1631
    move-result v5

    .line 1632
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1633
    .line 1634
    .line 1635
    move-result-object v1

    .line 1636
    invoke-virtual {v2, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1637
    .line 1638
    .line 1639
    goto :goto_16

    .line 1640
    :cond_39
    sget-object v4, LW6/e;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1641
    .line 1642
    invoke-static {p1, v1, v4}, LU8/v0;->C(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 1643
    .line 1644
    .line 1645
    move-result-object v4

    .line 1646
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1647
    .line 1648
    .line 1649
    move-result-object v1

    .line 1650
    invoke-virtual {v2, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1651
    .line 1652
    .line 1653
    goto :goto_16

    .line 1654
    :cond_3a
    invoke-static {v1, p1}, LU8/v0;->f0(ILandroid/os/Parcel;)I

    .line 1655
    .line 1656
    .line 1657
    move-result v3

    .line 1658
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1659
    .line 1660
    .line 1661
    move-result-object v1

    .line 1662
    invoke-virtual {v2, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1663
    .line 1664
    .line 1665
    goto :goto_16

    .line 1666
    :cond_3b
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 1667
    .line 1668
    .line 1669
    move-result v1

    .line 1670
    if-ne v1, v0, :cond_3c

    .line 1671
    .line 1672
    new-instance v1, LW6/b;

    .line 1673
    .line 1674
    invoke-direct/range {v1 .. v6}, LW6/b;-><init>(Ljava/util/HashSet;ILjava/util/ArrayList;ILW6/d;)V

    .line 1675
    .line 1676
    .line 1677
    return-object v1

    .line 1678
    :cond_3c
    new-instance v1, Lf7/b;

    .line 1679
    .line 1680
    const-string v2, "Overread allowed size end="

    .line 1681
    .line 1682
    invoke-static {v0, v2}, Lka/n;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 1683
    .line 1684
    .line 1685
    move-result-object v0

    .line 1686
    invoke-direct {v1, v0, p1}, Lf7/b;-><init>(Ljava/lang/String;Landroid/os/Parcel;)V

    .line 1687
    .line 1688
    .line 1689
    throw v1

    .line 1690
    :pswitch_57
    invoke-static {p1}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 1691
    .line 1692
    .line 1693
    move-result v0

    .line 1694
    const/4 v1, 0x0

    .line 1695
    const/4 v2, 0x0

    .line 1696
    move-object v5, v1

    .line 1697
    move-object v6, v5

    .line 1698
    move-object v9, v6

    .line 1699
    move-object v10, v9

    .line 1700
    move v4, v2

    .line 1701
    move v7, v4

    .line 1702
    move v8, v7

    .line 1703
    :goto_17
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 1704
    .line 1705
    .line 1706
    move-result v1

    .line 1707
    if-ge v1, v0, :cond_3d

    .line 1708
    .line 1709
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 1710
    .line 1711
    .line 1712
    move-result v1

    .line 1713
    int-to-char v2, v1

    .line 1714
    packed-switch v2, :pswitch_data_a

    .line 1715
    .line 1716
    .line 1717
    invoke-static {v1, p1}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 1718
    .line 1719
    .line 1720
    goto :goto_17

    .line 1721
    :pswitch_58
    invoke-static {v1, p1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1722
    .line 1723
    .line 1724
    move-result-object v10

    .line 1725
    goto :goto_17

    .line 1726
    :pswitch_59
    invoke-static {v1, p1}, LU8/v0;->A(ILandroid/os/Parcel;)Ljava/util/ArrayList;

    .line 1727
    .line 1728
    .line 1729
    move-result-object v9

    .line 1730
    goto :goto_17

    .line 1731
    :pswitch_5a
    invoke-static {v1, p1}, LU8/v0;->Z(ILandroid/os/Parcel;)Z

    .line 1732
    .line 1733
    .line 1734
    move-result v8

    .line 1735
    goto :goto_17

    .line 1736
    :pswitch_5b
    invoke-static {v1, p1}, LU8/v0;->Z(ILandroid/os/Parcel;)Z

    .line 1737
    .line 1738
    .line 1739
    move-result v7

    .line 1740
    goto :goto_17

    .line 1741
    :pswitch_5c
    invoke-static {v1, p1}, LU8/v0;->i0(ILandroid/os/Parcel;)Ljava/lang/Long;

    .line 1742
    .line 1743
    .line 1744
    move-result-object v6

    .line 1745
    goto :goto_17

    .line 1746
    :pswitch_5d
    invoke-static {v1, p1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1747
    .line 1748
    .line 1749
    move-result-object v5

    .line 1750
    goto :goto_17

    .line 1751
    :pswitch_5e
    invoke-static {v1, p1}, LU8/v0;->f0(ILandroid/os/Parcel;)I

    .line 1752
    .line 1753
    .line 1754
    move-result v4

    .line 1755
    goto :goto_17

    .line 1756
    :cond_3d
    invoke-static {v0, p1}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 1757
    .line 1758
    .line 1759
    new-instance v3, Lcom/google/android/gms/auth/TokenData;

    .line 1760
    .line 1761
    invoke-direct/range {v3 .. v10}, Lcom/google/android/gms/auth/TokenData;-><init>(ILjava/lang/String;Ljava/lang/Long;ZZLjava/util/ArrayList;Ljava/lang/String;)V

    .line 1762
    .line 1763
    .line 1764
    return-object v3

    .line 1765
    :pswitch_5f
    invoke-static {p1}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 1766
    .line 1767
    .line 1768
    move-result v0

    .line 1769
    const/4 v1, 0x0

    .line 1770
    const/4 v2, 0x0

    .line 1771
    :goto_18
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 1772
    .line 1773
    .line 1774
    move-result v3

    .line 1775
    if-ge v3, v0, :cond_40

    .line 1776
    .line 1777
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 1778
    .line 1779
    .line 1780
    move-result v3

    .line 1781
    int-to-char v4, v3

    .line 1782
    const/4 v5, 0x1

    .line 1783
    if-eq v4, v5, :cond_3f

    .line 1784
    .line 1785
    const/4 v5, 0x2

    .line 1786
    if-eq v4, v5, :cond_3e

    .line 1787
    .line 1788
    invoke-static {v3, p1}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 1789
    .line 1790
    .line 1791
    goto :goto_18

    .line 1792
    :cond_3e
    sget-object v1, LT6/a;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1793
    .line 1794
    invoke-static {p1, v3, v1}, LU8/v0;->C(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 1795
    .line 1796
    .line 1797
    move-result-object v1

    .line 1798
    goto :goto_18

    .line 1799
    :cond_3f
    invoke-static {v3, p1}, LU8/v0;->f0(ILandroid/os/Parcel;)I

    .line 1800
    .line 1801
    .line 1802
    move-result v2

    .line 1803
    goto :goto_18

    .line 1804
    :cond_40
    invoke-static {v0, p1}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 1805
    .line 1806
    .line 1807
    new-instance p1, LT6/c;

    .line 1808
    .line 1809
    invoke-direct {p1, v1, v2}, LT6/c;-><init>(Ljava/util/ArrayList;I)V

    .line 1810
    .line 1811
    .line 1812
    return-object p1

    .line 1813
    :pswitch_60
    invoke-static {p1}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 1814
    .line 1815
    .line 1816
    move-result v0

    .line 1817
    const/4 v1, 0x0

    .line 1818
    const/4 v2, 0x0

    .line 1819
    move v3, v2

    .line 1820
    move v4, v3

    .line 1821
    move-object v2, v1

    .line 1822
    :goto_19
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 1823
    .line 1824
    .line 1825
    move-result v5

    .line 1826
    if-ge v5, v0, :cond_45

    .line 1827
    .line 1828
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 1829
    .line 1830
    .line 1831
    move-result v5

    .line 1832
    int-to-char v6, v5

    .line 1833
    const/4 v7, 0x1

    .line 1834
    if-eq v6, v7, :cond_44

    .line 1835
    .line 1836
    const/4 v7, 0x2

    .line 1837
    if-eq v6, v7, :cond_43

    .line 1838
    .line 1839
    const/4 v7, 0x3

    .line 1840
    if-eq v6, v7, :cond_42

    .line 1841
    .line 1842
    const/4 v7, 0x4

    .line 1843
    if-eq v6, v7, :cond_41

    .line 1844
    .line 1845
    invoke-static {v5, p1}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 1846
    .line 1847
    .line 1848
    goto :goto_19

    .line 1849
    :cond_41
    sget-object v2, Landroid/accounts/Account;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 1850
    .line 1851
    invoke-static {p1, v5, v2}, LU8/v0;->x(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 1852
    .line 1853
    .line 1854
    move-result-object v2

    .line 1855
    check-cast v2, Landroid/accounts/Account;

    .line 1856
    .line 1857
    goto :goto_19

    .line 1858
    :cond_42
    invoke-static {v5, p1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 1859
    .line 1860
    .line 1861
    move-result-object v1

    .line 1862
    goto :goto_19

    .line 1863
    :cond_43
    invoke-static {v5, p1}, LU8/v0;->f0(ILandroid/os/Parcel;)I

    .line 1864
    .line 1865
    .line 1866
    move-result v4

    .line 1867
    goto :goto_19

    .line 1868
    :cond_44
    invoke-static {v5, p1}, LU8/v0;->f0(ILandroid/os/Parcel;)I

    .line 1869
    .line 1870
    .line 1871
    move-result v3

    .line 1872
    goto :goto_19

    .line 1873
    :cond_45
    invoke-static {v0, p1}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 1874
    .line 1875
    .line 1876
    new-instance p1, LT6/b;

    .line 1877
    .line 1878
    invoke-direct {p1, v3, v4, v1, v2}, LT6/b;-><init>(IILjava/lang/String;Landroid/accounts/Account;)V

    .line 1879
    .line 1880
    .line 1881
    return-object p1

    .line 1882
    nop

    .line 1883
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_60
        :pswitch_5f
        :pswitch_57
        :pswitch_56
        :pswitch_4f
        :pswitch_4e
        :pswitch_47
        :pswitch_46
        :pswitch_45
        :pswitch_44
        :pswitch_3b
        :pswitch_34
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_23
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

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
    .line 1942
    .line 1943
    .line 1944
    .line 1945
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
    .end packed-switch

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
    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
    .end packed-switch

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
    :pswitch_data_3
    .packed-switch 0x1
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
    .end packed-switch

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
    .line 1996
    .line 1997
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    :pswitch_data_4
    .packed-switch 0x1
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
    .end packed-switch

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
    .line 2012
    .line 2013
    .line 2014
    .line 2015
    .line 2016
    .line 2017
    :pswitch_data_5
    .packed-switch 0x1
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
    .end packed-switch

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
    .line 2030
    .line 2031
    .line 2032
    .line 2033
    .line 2034
    .line 2035
    :pswitch_data_6
    .packed-switch 0x1
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
    .end packed-switch

    .line 2036
    .line 2037
    .line 2038
    .line 2039
    .line 2040
    .line 2041
    .line 2042
    .line 2043
    .line 2044
    .line 2045
    .line 2046
    .line 2047
    .line 2048
    .line 2049
    .line 2050
    .line 2051
    :pswitch_data_7
    .packed-switch 0x1
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
    .end packed-switch

    .line 2052
    .line 2053
    .line 2054
    .line 2055
    .line 2056
    .line 2057
    .line 2058
    .line 2059
    .line 2060
    .line 2061
    .line 2062
    .line 2063
    .line 2064
    .line 2065
    .line 2066
    .line 2067
    .line 2068
    .line 2069
    .line 2070
    .line 2071
    :pswitch_data_8
    .packed-switch 0x1
        :pswitch_4d
        :pswitch_4c
        :pswitch_4b
        :pswitch_4a
        :pswitch_49
        :pswitch_48
    .end packed-switch

    .line 2072
    .line 2073
    .line 2074
    .line 2075
    .line 2076
    .line 2077
    .line 2078
    .line 2079
    .line 2080
    .line 2081
    .line 2082
    .line 2083
    .line 2084
    .line 2085
    .line 2086
    .line 2087
    :pswitch_data_9
    .packed-switch 0x1
        :pswitch_55
        :pswitch_54
        :pswitch_53
        :pswitch_52
        :pswitch_51
        :pswitch_50
    .end packed-switch

    .line 2088
    .line 2089
    .line 2090
    .line 2091
    .line 2092
    .line 2093
    .line 2094
    .line 2095
    .line 2096
    .line 2097
    .line 2098
    .line 2099
    .line 2100
    .line 2101
    .line 2102
    .line 2103
    :pswitch_data_a
    .packed-switch 0x1
        :pswitch_5e
        :pswitch_5d
        :pswitch_5c
        :pswitch_5b
        :pswitch_5a
        :pswitch_59
        :pswitch_58
    .end packed-switch
.end method

.method public final newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, LT6/f;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-array p1, p1, [LZ6/a;

    .line 7
    .line 8
    return-object p1

    .line 9
    :pswitch_0
    new-array p1, p1, [LZ5/b;

    .line 10
    .line 11
    return-object p1

    .line 12
    :pswitch_1
    new-array p1, p1, [LZ5/a;

    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_2
    new-array p1, p1, [LY5/a;

    .line 16
    .line 17
    return-object p1

    .line 18
    :pswitch_3
    new-array p1, p1, [LX6/p;

    .line 19
    .line 20
    return-object p1

    .line 21
    :pswitch_4
    new-array p1, p1, [LX6/o;

    .line 22
    .line 23
    return-object p1

    .line 24
    :pswitch_5
    new-array p1, p1, [LX6/m;

    .line 25
    .line 26
    return-object p1

    .line 27
    :pswitch_6
    new-array p1, p1, [LX6/l;

    .line 28
    .line 29
    return-object p1

    .line 30
    :pswitch_7
    new-array p1, p1, [LX6/k;

    .line 31
    .line 32
    return-object p1

    .line 33
    :pswitch_8
    new-array p1, p1, [Lcom/google/android/gms/auth/api/identity/SaveAccountLinkingTokenRequest;

    .line 34
    .line 35
    return-object p1

    .line 36
    :pswitch_9
    new-array p1, p1, [LX6/e;

    .line 37
    .line 38
    return-object p1

    .line 39
    :pswitch_a
    new-array p1, p1, [LX6/d;

    .line 40
    .line 41
    return-object p1

    .line 42
    :pswitch_b
    new-array p1, p1, [LX6/c;

    .line 43
    .line 44
    return-object p1

    .line 45
    :pswitch_c
    new-array p1, p1, [LX6/b;

    .line 46
    .line 47
    return-object p1

    .line 48
    :pswitch_d
    new-array p1, p1, [LX6/j;

    .line 49
    .line 50
    return-object p1

    .line 51
    :pswitch_e
    new-array p1, p1, [LX6/i;

    .line 52
    .line 53
    return-object p1

    .line 54
    :pswitch_f
    new-array p1, p1, [LX6/g;

    .line 55
    .line 56
    return-object p1

    .line 57
    :pswitch_10
    new-array p1, p1, [LX6/f;

    .line 58
    .line 59
    return-object p1

    .line 60
    :pswitch_11
    new-array p1, p1, [LX6/a;

    .line 61
    .line 62
    return-object p1

    .line 63
    :pswitch_12
    new-array p1, p1, [Lcom/google/android/gms/auth/api/identity/AuthorizationRequest;

    .line 64
    .line 65
    return-object p1

    .line 66
    :pswitch_13
    new-array p1, p1, [LX5/a;

    .line 67
    .line 68
    return-object p1

    .line 69
    :pswitch_14
    new-array p1, p1, [LW9/t;

    .line 70
    .line 71
    return-object p1

    .line 72
    :pswitch_15
    new-array p1, p1, [LW6/a;

    .line 73
    .line 74
    return-object p1

    .line 75
    :pswitch_16
    new-array p1, p1, [LW6/f;

    .line 76
    .line 77
    return-object p1

    .line 78
    :pswitch_17
    new-array p1, p1, [LW6/e;

    .line 79
    .line 80
    return-object p1

    .line 81
    :pswitch_18
    new-array p1, p1, [LW6/d;

    .line 82
    .line 83
    return-object p1

    .line 84
    :pswitch_19
    new-array p1, p1, [LW6/b;

    .line 85
    .line 86
    return-object p1

    .line 87
    :pswitch_1a
    new-array p1, p1, [Lcom/google/android/gms/auth/TokenData;

    .line 88
    .line 89
    return-object p1

    .line 90
    :pswitch_1b
    new-array p1, p1, [LT6/c;

    .line 91
    .line 92
    return-object p1

    .line 93
    :pswitch_1c
    new-array p1, p1, [LT6/b;

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
