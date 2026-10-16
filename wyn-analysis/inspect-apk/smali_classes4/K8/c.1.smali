.class public final LK8/c;
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
    iput p1, p0, LK8/c;->a:I

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
    iget v2, v0, LK8/c;->a:I

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
    move v5, v4

    .line 17
    move-object v4, v3

    .line 18
    :goto_0
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 19
    .line 20
    .line 21
    move-result v6

    .line 22
    if-ge v6, v2, :cond_3

    .line 23
    .line 24
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

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
    const/4 v8, 0x3

    .line 36
    if-eq v7, v8, :cond_0

    .line 37
    .line 38
    invoke-static {v6, v1}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    invoke-static {v6, v1}, LU8/v0;->Z(ILandroid/os/Parcel;)Z

    .line 43
    .line 44
    .line 45
    move-result v5

    .line 46
    goto :goto_0

    .line 47
    :cond_1
    invoke-static {v6, v1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    goto :goto_0

    .line 52
    :cond_2
    invoke-static {v6, v1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    goto :goto_0

    .line 57
    :cond_3
    invoke-static {v2, v1}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 58
    .line 59
    .line 60
    new-instance v1, LK8/Q;

    .line 61
    .line 62
    invoke-direct {v1, v3, v4, v5}, LK8/Q;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 63
    .line 64
    .line 65
    return-object v1

    .line 66
    :pswitch_0
    invoke-static {v1}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    const/4 v3, 0x0

    .line 71
    move-object v4, v3

    .line 72
    :goto_1
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 73
    .line 74
    .line 75
    move-result v5

    .line 76
    if-ge v5, v2, :cond_6

    .line 77
    .line 78
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 79
    .line 80
    .line 81
    move-result v5

    .line 82
    int-to-char v6, v5

    .line 83
    const/4 v7, 0x1

    .line 84
    if-eq v6, v7, :cond_5

    .line 85
    .line 86
    const/4 v7, 0x2

    .line 87
    if-eq v6, v7, :cond_4

    .line 88
    .line 89
    invoke-static {v5, v1}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 90
    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_4
    sget-object v4, LJ8/C;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 94
    .line 95
    invoke-static {v1, v5, v4}, LU8/v0;->C(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 96
    .line 97
    .line 98
    move-result-object v4

    .line 99
    goto :goto_1

    .line 100
    :cond_5
    sget-object v3, LJ8/z;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 101
    .line 102
    invoke-static {v1, v5, v3}, LU8/v0;->C(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    goto :goto_1

    .line 107
    :cond_6
    invoke-static {v2, v1}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 108
    .line 109
    .line 110
    new-instance v1, LK8/w;

    .line 111
    .line 112
    invoke-direct {v1, v3, v4}, LK8/w;-><init>(Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 113
    .line 114
    .line 115
    return-object v1

    .line 116
    :pswitch_1
    invoke-static {v1}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 117
    .line 118
    .line 119
    move-result v2

    .line 120
    const/4 v3, 0x0

    .line 121
    move-object v4, v3

    .line 122
    move-object v5, v4

    .line 123
    move-object v6, v5

    .line 124
    move-object v7, v6

    .line 125
    :goto_2
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 126
    .line 127
    .line 128
    move-result v8

    .line 129
    if-ge v8, v2, :cond_c

    .line 130
    .line 131
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 132
    .line 133
    .line 134
    move-result v8

    .line 135
    int-to-char v9, v8

    .line 136
    const/4 v10, 0x1

    .line 137
    if-eq v9, v10, :cond_b

    .line 138
    .line 139
    const/4 v10, 0x2

    .line 140
    if-eq v9, v10, :cond_a

    .line 141
    .line 142
    const/4 v10, 0x3

    .line 143
    if-eq v9, v10, :cond_9

    .line 144
    .line 145
    const/4 v10, 0x4

    .line 146
    if-eq v9, v10, :cond_8

    .line 147
    .line 148
    const/4 v10, 0x5

    .line 149
    if-eq v9, v10, :cond_7

    .line 150
    .line 151
    invoke-static {v8, v1}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 152
    .line 153
    .line 154
    goto :goto_2

    .line 155
    :cond_7
    sget-object v7, LK8/e;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 156
    .line 157
    invoke-static {v1, v8, v7}, LU8/v0;->x(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 158
    .line 159
    .line 160
    move-result-object v7

    .line 161
    check-cast v7, LK8/e;

    .line 162
    .line 163
    goto :goto_2

    .line 164
    :cond_8
    sget-object v6, LJ8/C;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 165
    .line 166
    invoke-static {v1, v8, v6}, LU8/v0;->C(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 167
    .line 168
    .line 169
    move-result-object v6

    .line 170
    goto :goto_2

    .line 171
    :cond_9
    sget-object v5, LJ8/z;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 172
    .line 173
    invoke-static {v1, v8, v5}, LU8/v0;->C(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 174
    .line 175
    .line 176
    move-result-object v5

    .line 177
    goto :goto_2

    .line 178
    :cond_a
    invoke-static {v8, v1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v4

    .line 182
    goto :goto_2

    .line 183
    :cond_b
    invoke-static {v8, v1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v3

    .line 187
    goto :goto_2

    .line 188
    :cond_c
    invoke-static {v2, v1}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 189
    .line 190
    .line 191
    new-instance v1, LK8/j;

    .line 192
    .line 193
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 194
    .line 195
    .line 196
    iput-object v3, v1, LK8/j;->a:Ljava/lang/String;

    .line 197
    .line 198
    iput-object v4, v1, LK8/j;->b:Ljava/lang/String;

    .line 199
    .line 200
    iput-object v5, v1, LK8/j;->c:Ljava/util/ArrayList;

    .line 201
    .line 202
    iput-object v6, v1, LK8/j;->d:Ljava/util/ArrayList;

    .line 203
    .line 204
    iput-object v7, v1, LK8/j;->e:LK8/e;

    .line 205
    .line 206
    return-object v1

    .line 207
    :pswitch_2
    invoke-static {v1}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 208
    .line 209
    .line 210
    move-result v2

    .line 211
    const/4 v3, 0x0

    .line 212
    move-object v5, v3

    .line 213
    move-object v6, v5

    .line 214
    move-object v7, v6

    .line 215
    move-object v8, v7

    .line 216
    move-object v9, v8

    .line 217
    move-object v10, v9

    .line 218
    :goto_3
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 219
    .line 220
    .line 221
    move-result v3

    .line 222
    if-ge v3, v2, :cond_d

    .line 223
    .line 224
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 225
    .line 226
    .line 227
    move-result v3

    .line 228
    int-to-char v4, v3

    .line 229
    packed-switch v4, :pswitch_data_1

    .line 230
    .line 231
    .line 232
    invoke-static {v3, v1}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 233
    .line 234
    .line 235
    goto :goto_3

    .line 236
    :pswitch_3
    sget-object v4, LJ8/C;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 237
    .line 238
    invoke-static {v1, v3, v4}, LU8/v0;->C(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 239
    .line 240
    .line 241
    move-result-object v10

    .line 242
    goto :goto_3

    .line 243
    :pswitch_4
    sget-object v4, LK8/e;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 244
    .line 245
    invoke-static {v1, v3, v4}, LU8/v0;->x(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 246
    .line 247
    .line 248
    move-result-object v3

    .line 249
    move-object v9, v3

    .line 250
    check-cast v9, LK8/e;

    .line 251
    .line 252
    goto :goto_3

    .line 253
    :pswitch_5
    sget-object v4, LJ8/I;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 254
    .line 255
    invoke-static {v1, v3, v4}, LU8/v0;->x(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 256
    .line 257
    .line 258
    move-result-object v3

    .line 259
    move-object v8, v3

    .line 260
    check-cast v8, LJ8/I;

    .line 261
    .line 262
    goto :goto_3

    .line 263
    :pswitch_6
    invoke-static {v3, v1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object v7

    .line 267
    goto :goto_3

    .line 268
    :pswitch_7
    sget-object v4, LK8/j;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 269
    .line 270
    invoke-static {v1, v3, v4}, LU8/v0;->x(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 271
    .line 272
    .line 273
    move-result-object v3

    .line 274
    move-object v6, v3

    .line 275
    check-cast v6, LK8/j;

    .line 276
    .line 277
    goto :goto_3

    .line 278
    :pswitch_8
    sget-object v4, LJ8/z;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 279
    .line 280
    invoke-static {v1, v3, v4}, LU8/v0;->C(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 281
    .line 282
    .line 283
    move-result-object v5

    .line 284
    goto :goto_3

    .line 285
    :cond_d
    invoke-static {v2, v1}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 286
    .line 287
    .line 288
    new-instance v4, LK8/i;

    .line 289
    .line 290
    invoke-direct/range {v4 .. v10}, LK8/i;-><init>(Ljava/util/ArrayList;LK8/j;Ljava/lang/String;LJ8/I;LK8/e;Ljava/util/ArrayList;)V

    .line 291
    .line 292
    .line 293
    return-object v4

    .line 294
    :pswitch_9
    invoke-static {v1}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 295
    .line 296
    .line 297
    move-result v2

    .line 298
    const-wide/16 v3, 0x0

    .line 299
    .line 300
    move-wide v5, v3

    .line 301
    :goto_4
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 302
    .line 303
    .line 304
    move-result v7

    .line 305
    if-ge v7, v2, :cond_10

    .line 306
    .line 307
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 308
    .line 309
    .line 310
    move-result v7

    .line 311
    int-to-char v8, v7

    .line 312
    const/4 v9, 0x1

    .line 313
    if-eq v8, v9, :cond_f

    .line 314
    .line 315
    const/4 v9, 0x2

    .line 316
    if-eq v8, v9, :cond_e

    .line 317
    .line 318
    invoke-static {v7, v1}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 319
    .line 320
    .line 321
    goto :goto_4

    .line 322
    :cond_e
    invoke-static {v7, v1}, LU8/v0;->h0(ILandroid/os/Parcel;)J

    .line 323
    .line 324
    .line 325
    move-result-wide v5

    .line 326
    goto :goto_4

    .line 327
    :cond_f
    invoke-static {v7, v1}, LU8/v0;->h0(ILandroid/os/Parcel;)J

    .line 328
    .line 329
    .line 330
    move-result-wide v3

    .line 331
    goto :goto_4

    .line 332
    :cond_10
    invoke-static {v2, v1}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 333
    .line 334
    .line 335
    new-instance v1, LK8/g;

    .line 336
    .line 337
    invoke-direct {v1, v3, v4, v5, v6}, LK8/g;-><init>(JJ)V

    .line 338
    .line 339
    .line 340
    return-object v1

    .line 341
    :pswitch_a
    invoke-static {v1}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 342
    .line 343
    .line 344
    move-result v2

    .line 345
    const/4 v3, 0x0

    .line 346
    const/4 v4, 0x0

    .line 347
    move-object v5, v3

    .line 348
    move-object v6, v5

    .line 349
    move-object v7, v6

    .line 350
    move-object v8, v7

    .line 351
    move-object v9, v8

    .line 352
    move-object v10, v9

    .line 353
    move-object v11, v10

    .line 354
    move-object v12, v11

    .line 355
    move-object v13, v12

    .line 356
    move-object v14, v13

    .line 357
    move v15, v4

    .line 358
    move-object v4, v14

    .line 359
    :goto_5
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 360
    .line 361
    .line 362
    move-result v0

    .line 363
    if-ge v0, v2, :cond_11

    .line 364
    .line 365
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 366
    .line 367
    .line 368
    move-result v0

    .line 369
    move-object/from16 v16, v14

    .line 370
    .line 371
    int-to-char v14, v0

    .line 372
    packed-switch v14, :pswitch_data_2

    .line 373
    .line 374
    .line 375
    invoke-static {v0, v1}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 376
    .line 377
    .line 378
    :goto_6
    move-object/from16 v14, v16

    .line 379
    .line 380
    goto :goto_5

    .line 381
    :pswitch_b
    sget-object v14, LJ8/H;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 382
    .line 383
    invoke-static {v1, v0, v14}, LU8/v0;->C(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 384
    .line 385
    .line 386
    move-result-object v14

    .line 387
    goto :goto_5

    .line 388
    :pswitch_c
    sget-object v13, LK8/w;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 389
    .line 390
    invoke-static {v1, v0, v13}, LU8/v0;->x(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 391
    .line 392
    .line 393
    move-result-object v0

    .line 394
    move-object v13, v0

    .line 395
    check-cast v13, LK8/w;

    .line 396
    .line 397
    goto :goto_6

    .line 398
    :pswitch_d
    sget-object v12, LJ8/I;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 399
    .line 400
    invoke-static {v1, v0, v12}, LU8/v0;->x(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 401
    .line 402
    .line 403
    move-result-object v0

    .line 404
    move-object v12, v0

    .line 405
    check-cast v12, LJ8/I;

    .line 406
    .line 407
    goto :goto_6

    .line 408
    :pswitch_e
    invoke-static {v0, v1}, LU8/v0;->Z(ILandroid/os/Parcel;)Z

    .line 409
    .line 410
    .line 411
    move-result v15

    .line 412
    goto :goto_6

    .line 413
    :pswitch_f
    sget-object v11, LK8/g;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 414
    .line 415
    invoke-static {v1, v0, v11}, LU8/v0;->x(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 416
    .line 417
    .line 418
    move-result-object v0

    .line 419
    move-object v11, v0

    .line 420
    check-cast v11, LK8/g;

    .line 421
    .line 422
    goto :goto_6

    .line 423
    :pswitch_10
    invoke-static {v0, v1}, LU8/v0;->a0(ILandroid/os/Parcel;)Ljava/lang/Boolean;

    .line 424
    .line 425
    .line 426
    move-result-object v10

    .line 427
    goto :goto_6

    .line 428
    :pswitch_11
    invoke-static {v0, v1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 429
    .line 430
    .line 431
    move-result-object v9

    .line 432
    goto :goto_6

    .line 433
    :pswitch_12
    invoke-static {v0, v1}, LU8/v0;->A(ILandroid/os/Parcel;)Ljava/util/ArrayList;

    .line 434
    .line 435
    .line 436
    move-result-object v8

    .line 437
    goto :goto_6

    .line 438
    :pswitch_13
    sget-object v7, LK8/U;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 439
    .line 440
    invoke-static {v1, v0, v7}, LU8/v0;->C(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 441
    .line 442
    .line 443
    move-result-object v7

    .line 444
    goto :goto_6

    .line 445
    :pswitch_14
    invoke-static {v0, v1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 446
    .line 447
    .line 448
    move-result-object v6

    .line 449
    goto :goto_6

    .line 450
    :pswitch_15
    invoke-static {v0, v1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 451
    .line 452
    .line 453
    move-result-object v5

    .line 454
    goto :goto_6

    .line 455
    :pswitch_16
    sget-object v4, LK8/U;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 456
    .line 457
    invoke-static {v1, v0, v4}, LU8/v0;->x(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 458
    .line 459
    .line 460
    move-result-object v0

    .line 461
    move-object v4, v0

    .line 462
    check-cast v4, LK8/U;

    .line 463
    .line 464
    goto :goto_6

    .line 465
    :pswitch_17
    sget-object v3, Lcom/google/android/gms/internal/firebase-auth-api/zzagl;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 466
    .line 467
    invoke-static {v1, v0, v3}, LU8/v0;->x(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 468
    .line 469
    .line 470
    move-result-object v0

    .line 471
    move-object v3, v0

    .line 472
    check-cast v3, Lcom/google/android/gms/internal/firebase-auth-api/zzagl;

    .line 473
    .line 474
    goto :goto_6

    .line 475
    :cond_11
    move-object/from16 v16, v14

    .line 476
    .line 477
    invoke-static {v2, v1}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 478
    .line 479
    .line 480
    new-instance v0, LK8/e;

    .line 481
    .line 482
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 483
    .line 484
    .line 485
    iput-object v3, v0, LK8/e;->a:Lcom/google/android/gms/internal/firebase-auth-api/zzagl;

    .line 486
    .line 487
    iput-object v4, v0, LK8/e;->b:LK8/U;

    .line 488
    .line 489
    iput-object v5, v0, LK8/e;->c:Ljava/lang/String;

    .line 490
    .line 491
    iput-object v6, v0, LK8/e;->d:Ljava/lang/String;

    .line 492
    .line 493
    iput-object v7, v0, LK8/e;->e:Ljava/util/ArrayList;

    .line 494
    .line 495
    iput-object v8, v0, LK8/e;->f:Ljava/util/ArrayList;

    .line 496
    .line 497
    iput-object v9, v0, LK8/e;->g:Ljava/lang/String;

    .line 498
    .line 499
    iput-object v10, v0, LK8/e;->h:Ljava/lang/Boolean;

    .line 500
    .line 501
    iput-object v11, v0, LK8/e;->i:LK8/g;

    .line 502
    .line 503
    iput-boolean v15, v0, LK8/e;->j:Z

    .line 504
    .line 505
    iput-object v12, v0, LK8/e;->k:LJ8/I;

    .line 506
    .line 507
    iput-object v13, v0, LK8/e;->l:LK8/w;

    .line 508
    .line 509
    move-object/from16 v14, v16

    .line 510
    .line 511
    iput-object v14, v0, LK8/e;->m:Ljava/util/List;

    .line 512
    .line 513
    return-object v0

    .line 514
    :pswitch_18
    invoke-static {v1}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 515
    .line 516
    .line 517
    move-result v0

    .line 518
    const/4 v2, 0x0

    .line 519
    const/4 v3, 0x0

    .line 520
    move-object v5, v2

    .line 521
    move-object v6, v5

    .line 522
    move-object v7, v6

    .line 523
    move-object v8, v7

    .line 524
    move-object v9, v8

    .line 525
    move-object v10, v9

    .line 526
    move-object v12, v10

    .line 527
    move v11, v3

    .line 528
    :goto_7
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 529
    .line 530
    .line 531
    move-result v2

    .line 532
    if-ge v2, v0, :cond_12

    .line 533
    .line 534
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 535
    .line 536
    .line 537
    move-result v2

    .line 538
    int-to-char v3, v2

    .line 539
    packed-switch v3, :pswitch_data_3

    .line 540
    .line 541
    .line 542
    invoke-static {v2, v1}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 543
    .line 544
    .line 545
    goto :goto_7

    .line 546
    :pswitch_19
    invoke-static {v2, v1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 547
    .line 548
    .line 549
    move-result-object v12

    .line 550
    goto :goto_7

    .line 551
    :pswitch_1a
    invoke-static {v2, v1}, LU8/v0;->Z(ILandroid/os/Parcel;)Z

    .line 552
    .line 553
    .line 554
    move-result v11

    .line 555
    goto :goto_7

    .line 556
    :pswitch_1b
    invoke-static {v2, v1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 557
    .line 558
    .line 559
    move-result-object v10

    .line 560
    goto :goto_7

    .line 561
    :pswitch_1c
    invoke-static {v2, v1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 562
    .line 563
    .line 564
    move-result-object v7

    .line 565
    goto :goto_7

    .line 566
    :pswitch_1d
    invoke-static {v2, v1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 567
    .line 568
    .line 569
    move-result-object v8

    .line 570
    goto :goto_7

    .line 571
    :pswitch_1e
    invoke-static {v2, v1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 572
    .line 573
    .line 574
    move-result-object v9

    .line 575
    goto :goto_7

    .line 576
    :pswitch_1f
    invoke-static {v2, v1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 577
    .line 578
    .line 579
    move-result-object v6

    .line 580
    goto :goto_7

    .line 581
    :pswitch_20
    invoke-static {v2, v1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 582
    .line 583
    .line 584
    move-result-object v5

    .line 585
    goto :goto_7

    .line 586
    :cond_12
    invoke-static {v0, v1}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 587
    .line 588
    .line 589
    new-instance v4, LK8/U;

    .line 590
    .line 591
    invoke-direct/range {v4 .. v12}, LK8/U;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    .line 592
    .line 593
    .line 594
    return-object v4

    .line 595
    :pswitch_21
    invoke-static {v1}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 596
    .line 597
    .line 598
    move-result v0

    .line 599
    const/4 v2, 0x0

    .line 600
    move-object v3, v2

    .line 601
    move-object v4, v3

    .line 602
    :goto_8
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 603
    .line 604
    .line 605
    move-result v5

    .line 606
    if-ge v5, v0, :cond_16

    .line 607
    .line 608
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 609
    .line 610
    .line 611
    move-result v5

    .line 612
    int-to-char v6, v5

    .line 613
    const/4 v7, 0x1

    .line 614
    if-eq v6, v7, :cond_15

    .line 615
    .line 616
    const/4 v7, 0x2

    .line 617
    if-eq v6, v7, :cond_14

    .line 618
    .line 619
    const/4 v7, 0x3

    .line 620
    if-eq v6, v7, :cond_13

    .line 621
    .line 622
    invoke-static {v5, v1}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 623
    .line 624
    .line 625
    goto :goto_8

    .line 626
    :cond_13
    sget-object v4, LJ8/I;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 627
    .line 628
    invoke-static {v1, v5, v4}, LU8/v0;->x(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 629
    .line 630
    .line 631
    move-result-object v4

    .line 632
    check-cast v4, LJ8/I;

    .line 633
    .line 634
    goto :goto_8

    .line 635
    :cond_14
    sget-object v3, LK8/Q;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 636
    .line 637
    invoke-static {v1, v5, v3}, LU8/v0;->x(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 638
    .line 639
    .line 640
    move-result-object v3

    .line 641
    check-cast v3, LK8/Q;

    .line 642
    .line 643
    goto :goto_8

    .line 644
    :cond_15
    sget-object v2, LK8/e;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 645
    .line 646
    invoke-static {v1, v5, v2}, LU8/v0;->x(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 647
    .line 648
    .line 649
    move-result-object v2

    .line 650
    check-cast v2, LK8/e;

    .line 651
    .line 652
    goto :goto_8

    .line 653
    :cond_16
    invoke-static {v0, v1}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 654
    .line 655
    .line 656
    new-instance v0, LK8/T;

    .line 657
    .line 658
    invoke-direct {v0, v2, v3, v4}, LK8/T;-><init>(LK8/e;LK8/Q;LJ8/I;)V

    .line 659
    .line 660
    .line 661
    return-object v0

    .line 662
    nop

    .line 663
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_21
        :pswitch_18
        :pswitch_a
        :pswitch_9
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
    .end packed-switch

    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    :pswitch_data_2
    .packed-switch 0x1
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
    .end packed-switch

    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    :pswitch_data_3
    .packed-switch 0x1
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
    .end packed-switch
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, LK8/c;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-array p1, p1, [LK8/Q;

    .line 7
    .line 8
    return-object p1

    .line 9
    :pswitch_0
    new-array p1, p1, [LK8/w;

    .line 10
    .line 11
    return-object p1

    .line 12
    :pswitch_1
    new-array p1, p1, [LK8/j;

    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_2
    new-array p1, p1, [LK8/i;

    .line 16
    .line 17
    return-object p1

    .line 18
    :pswitch_3
    new-array p1, p1, [LK8/g;

    .line 19
    .line 20
    return-object p1

    .line 21
    :pswitch_4
    new-array p1, p1, [LK8/e;

    .line 22
    .line 23
    return-object p1

    .line 24
    :pswitch_5
    new-array p1, p1, [LK8/U;

    .line 25
    .line 26
    return-object p1

    .line 27
    :pswitch_6
    new-array p1, p1, [LK8/T;

    .line 28
    .line 29
    return-object p1

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
