.class public final LZ6/c;
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
    iput p1, p0, LZ6/c;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget v0, p0, LZ6/c;->a:I

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
    :goto_0
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    if-ge v3, v0, :cond_2

    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    int-to-char v4, v3

    .line 23
    const/4 v5, 0x2

    .line 24
    if-eq v4, v5, :cond_1

    .line 25
    .line 26
    const/4 v5, 0x5

    .line 27
    if-eq v4, v5, :cond_0

    .line 28
    .line 29
    invoke-static {v3, p1}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    sget-object v2, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 34
    .line 35
    invoke-static {p1, v3, v2}, LU8/v0;->x(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    check-cast v2, Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    invoke-static {v3, p1}, LU8/v0;->y(ILandroid/os/Parcel;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    goto :goto_0

    .line 47
    :cond_2
    invoke-static {v0, p1}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 48
    .line 49
    .line 50
    new-instance p1, Lcom/google/android/gms/auth/api/signin/internal/SignInConfiguration;

    .line 51
    .line 52
    invoke-direct {p1, v1, v2}, Lcom/google/android/gms/auth/api/signin/internal/SignInConfiguration;-><init>(Ljava/lang/String;Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;)V

    .line 53
    .line 54
    .line 55
    return-object p1

    .line 56
    :pswitch_0
    invoke-static {p1}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    const/4 v1, 0x0

    .line 61
    const/4 v2, 0x0

    .line 62
    move v3, v2

    .line 63
    :goto_1
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    if-ge v4, v0, :cond_6

    .line 68
    .line 69
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 70
    .line 71
    .line 72
    move-result v4

    .line 73
    int-to-char v5, v4

    .line 74
    const/4 v6, 0x1

    .line 75
    if-eq v5, v6, :cond_5

    .line 76
    .line 77
    const/4 v6, 0x2

    .line 78
    if-eq v5, v6, :cond_4

    .line 79
    .line 80
    const/4 v6, 0x3

    .line 81
    if-eq v5, v6, :cond_3

    .line 82
    .line 83
    invoke-static {v4, p1}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 84
    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_3
    invoke-static {v4, p1}, LU8/v0;->q(ILandroid/os/Parcel;)Landroid/os/Bundle;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    goto :goto_1

    .line 92
    :cond_4
    invoke-static {v4, p1}, LU8/v0;->f0(ILandroid/os/Parcel;)I

    .line 93
    .line 94
    .line 95
    move-result v3

    .line 96
    goto :goto_1

    .line 97
    :cond_5
    invoke-static {v4, p1}, LU8/v0;->f0(ILandroid/os/Parcel;)I

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    goto :goto_1

    .line 102
    :cond_6
    invoke-static {v0, p1}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 103
    .line 104
    .line 105
    new-instance p1, Lb7/a;

    .line 106
    .line 107
    invoke-direct {p1, v2, v3, v1}, Lb7/a;-><init>(IILandroid/os/Bundle;)V

    .line 108
    .line 109
    .line 110
    return-object p1

    .line 111
    :pswitch_1
    new-instance v0, Lb6/n;

    .line 112
    .line 113
    invoke-direct {v0, p1}, Lb6/n;-><init>(Landroid/os/Parcel;)V

    .line 114
    .line 115
    .line 116
    return-object v0

    .line 117
    :pswitch_2
    new-instance v0, Lb6/m;

    .line 118
    .line 119
    invoke-direct {v0, p1}, Lb6/m;-><init>(Landroid/os/Parcel;)V

    .line 120
    .line 121
    .line 122
    return-object v0

    .line 123
    :pswitch_3
    new-instance v0, Lb6/l;

    .line 124
    .line 125
    invoke-direct {v0, p1}, Lb6/l;-><init>(Landroid/os/Parcel;)V

    .line 126
    .line 127
    .line 128
    return-object v0

    .line 129
    :pswitch_4
    new-instance v0, Lb6/k;

    .line 130
    .line 131
    invoke-direct {v0, p1}, Lb6/k;-><init>(Landroid/os/Parcel;)V

    .line 132
    .line 133
    .line 134
    return-object v0

    .line 135
    :pswitch_5
    new-instance v0, Lb6/j;

    .line 136
    .line 137
    invoke-direct {v0, p1}, Lb6/j;-><init>(Landroid/os/Parcel;)V

    .line 138
    .line 139
    .line 140
    return-object v0

    .line 141
    :pswitch_6
    new-instance v0, Lb6/f;

    .line 142
    .line 143
    invoke-direct {v0, p1}, Lb6/f;-><init>(Landroid/os/Parcel;)V

    .line 144
    .line 145
    .line 146
    return-object v0

    .line 147
    :pswitch_7
    new-instance v0, Lb6/e;

    .line 148
    .line 149
    invoke-direct {v0, p1}, Lb6/e;-><init>(Landroid/os/Parcel;)V

    .line 150
    .line 151
    .line 152
    return-object v0

    .line 153
    :pswitch_8
    new-instance v0, Lb6/d;

    .line 154
    .line 155
    invoke-direct {v0, p1}, Lb6/d;-><init>(Landroid/os/Parcel;)V

    .line 156
    .line 157
    .line 158
    return-object v0

    .line 159
    :pswitch_9
    new-instance v0, Lb6/c;

    .line 160
    .line 161
    invoke-direct {v0, p1}, Lb6/c;-><init>(Landroid/os/Parcel;)V

    .line 162
    .line 163
    .line 164
    return-object v0

    .line 165
    :pswitch_a
    new-instance v0, Lb6/b;

    .line 166
    .line 167
    invoke-direct {v0, p1}, Lb6/b;-><init>(Landroid/os/Parcel;)V

    .line 168
    .line 169
    .line 170
    return-object v0

    .line 171
    :pswitch_b
    new-instance v0, Lb6/a;

    .line 172
    .line 173
    invoke-direct {v0, p1}, Lb6/a;-><init>(Landroid/os/Parcel;)V

    .line 174
    .line 175
    .line 176
    return-object v0

    .line 177
    :pswitch_c
    new-instance v0, Landroidx/recyclerview/widget/u0;

    .line 178
    .line 179
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 180
    .line 181
    .line 182
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 183
    .line 184
    .line 185
    move-result v1

    .line 186
    iput v1, v0, Landroidx/recyclerview/widget/u0;->a:I

    .line 187
    .line 188
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 189
    .line 190
    .line 191
    move-result v1

    .line 192
    iput v1, v0, Landroidx/recyclerview/widget/u0;->b:I

    .line 193
    .line 194
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 195
    .line 196
    .line 197
    move-result v1

    .line 198
    iput v1, v0, Landroidx/recyclerview/widget/u0;->c:I

    .line 199
    .line 200
    if-lez v1, :cond_7

    .line 201
    .line 202
    new-array v1, v1, [I

    .line 203
    .line 204
    iput-object v1, v0, Landroidx/recyclerview/widget/u0;->d:[I

    .line 205
    .line 206
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readIntArray([I)V

    .line 207
    .line 208
    .line 209
    :cond_7
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 210
    .line 211
    .line 212
    move-result v1

    .line 213
    iput v1, v0, Landroidx/recyclerview/widget/u0;->e:I

    .line 214
    .line 215
    if-lez v1, :cond_8

    .line 216
    .line 217
    new-array v1, v1, [I

    .line 218
    .line 219
    iput-object v1, v0, Landroidx/recyclerview/widget/u0;->f:[I

    .line 220
    .line 221
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readIntArray([I)V

    .line 222
    .line 223
    .line 224
    :cond_8
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 225
    .line 226
    .line 227
    move-result v1

    .line 228
    const/4 v2, 0x0

    .line 229
    const/4 v3, 0x1

    .line 230
    if-ne v1, v3, :cond_9

    .line 231
    .line 232
    move v1, v3

    .line 233
    goto :goto_2

    .line 234
    :cond_9
    move v1, v2

    .line 235
    :goto_2
    iput-boolean v1, v0, Landroidx/recyclerview/widget/u0;->h:Z

    .line 236
    .line 237
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 238
    .line 239
    .line 240
    move-result v1

    .line 241
    if-ne v1, v3, :cond_a

    .line 242
    .line 243
    move v1, v3

    .line 244
    goto :goto_3

    .line 245
    :cond_a
    move v1, v2

    .line 246
    :goto_3
    iput-boolean v1, v0, Landroidx/recyclerview/widget/u0;->i:Z

    .line 247
    .line 248
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 249
    .line 250
    .line 251
    move-result v1

    .line 252
    if-ne v1, v3, :cond_b

    .line 253
    .line 254
    move v2, v3

    .line 255
    :cond_b
    iput-boolean v2, v0, Landroidx/recyclerview/widget/u0;->j:Z

    .line 256
    .line 257
    const-class v1, Landroidx/recyclerview/widget/t0;

    .line 258
    .line 259
    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 260
    .line 261
    .line 262
    move-result-object v1

    .line 263
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readArrayList(Ljava/lang/ClassLoader;)Ljava/util/ArrayList;

    .line 264
    .line 265
    .line 266
    move-result-object p1

    .line 267
    iput-object p1, v0, Landroidx/recyclerview/widget/u0;->g:Ljava/util/ArrayList;

    .line 268
    .line 269
    return-object v0

    .line 270
    :pswitch_d
    new-instance v0, Landroidx/recyclerview/widget/t0;

    .line 271
    .line 272
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 273
    .line 274
    .line 275
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 276
    .line 277
    .line 278
    move-result v1

    .line 279
    iput v1, v0, Landroidx/recyclerview/widget/t0;->a:I

    .line 280
    .line 281
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 282
    .line 283
    .line 284
    move-result v1

    .line 285
    iput v1, v0, Landroidx/recyclerview/widget/t0;->b:I

    .line 286
    .line 287
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 288
    .line 289
    .line 290
    move-result v1

    .line 291
    const/4 v2, 0x1

    .line 292
    if-ne v1, v2, :cond_c

    .line 293
    .line 294
    goto :goto_4

    .line 295
    :cond_c
    const/4 v2, 0x0

    .line 296
    :goto_4
    iput-boolean v2, v0, Landroidx/recyclerview/widget/t0;->d:Z

    .line 297
    .line 298
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 299
    .line 300
    .line 301
    move-result v1

    .line 302
    if-lez v1, :cond_d

    .line 303
    .line 304
    new-array v1, v1, [I

    .line 305
    .line 306
    iput-object v1, v0, Landroidx/recyclerview/widget/t0;->c:[I

    .line 307
    .line 308
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readIntArray([I)V

    .line 309
    .line 310
    .line 311
    :cond_d
    return-object v0

    .line 312
    :pswitch_e
    new-instance v0, Landroidx/recyclerview/widget/y;

    .line 313
    .line 314
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 315
    .line 316
    .line 317
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 318
    .line 319
    .line 320
    move-result v1

    .line 321
    iput v1, v0, Landroidx/recyclerview/widget/y;->a:I

    .line 322
    .line 323
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 324
    .line 325
    .line 326
    move-result v1

    .line 327
    iput v1, v0, Landroidx/recyclerview/widget/y;->b:I

    .line 328
    .line 329
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 330
    .line 331
    .line 332
    move-result p1

    .line 333
    const/4 v1, 0x1

    .line 334
    if-ne p1, v1, :cond_e

    .line 335
    .line 336
    goto :goto_5

    .line 337
    :cond_e
    const/4 v1, 0x0

    .line 338
    :goto_5
    iput-boolean v1, v0, Landroidx/recyclerview/widget/y;->c:Z

    .line 339
    .line 340
    return-object v0

    .line 341
    :pswitch_f
    new-instance v0, Landroidx/fragment/app/j0;

    .line 342
    .line 343
    invoke-direct {v0, p1}, Landroidx/fragment/app/j0;-><init>(Landroid/os/Parcel;)V

    .line 344
    .line 345
    .line 346
    return-object v0

    .line 347
    :pswitch_10
    new-instance v0, Landroidx/fragment/app/g0;

    .line 348
    .line 349
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 350
    .line 351
    .line 352
    const/4 v1, 0x0

    .line 353
    iput-object v1, v0, Landroidx/fragment/app/g0;->e:Ljava/lang/String;

    .line 354
    .line 355
    new-instance v1, Ljava/util/ArrayList;

    .line 356
    .line 357
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 358
    .line 359
    .line 360
    iput-object v1, v0, Landroidx/fragment/app/g0;->f:Ljava/util/ArrayList;

    .line 361
    .line 362
    new-instance v1, Ljava/util/ArrayList;

    .line 363
    .line 364
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 365
    .line 366
    .line 367
    iput-object v1, v0, Landroidx/fragment/app/g0;->g:Ljava/util/ArrayList;

    .line 368
    .line 369
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    .line 370
    .line 371
    .line 372
    move-result-object v1

    .line 373
    iput-object v1, v0, Landroidx/fragment/app/g0;->a:Ljava/util/ArrayList;

    .line 374
    .line 375
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    .line 376
    .line 377
    .line 378
    move-result-object v1

    .line 379
    iput-object v1, v0, Landroidx/fragment/app/g0;->b:Ljava/util/ArrayList;

    .line 380
    .line 381
    sget-object v1, Landroidx/fragment/app/b;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 382
    .line 383
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->createTypedArray(Landroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    .line 384
    .line 385
    .line 386
    move-result-object v1

    .line 387
    check-cast v1, [Landroidx/fragment/app/b;

    .line 388
    .line 389
    iput-object v1, v0, Landroidx/fragment/app/g0;->c:[Landroidx/fragment/app/b;

    .line 390
    .line 391
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 392
    .line 393
    .line 394
    move-result v1

    .line 395
    iput v1, v0, Landroidx/fragment/app/g0;->d:I

    .line 396
    .line 397
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 398
    .line 399
    .line 400
    move-result-object v1

    .line 401
    iput-object v1, v0, Landroidx/fragment/app/g0;->e:Ljava/lang/String;

    .line 402
    .line 403
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    .line 404
    .line 405
    .line 406
    move-result-object v1

    .line 407
    iput-object v1, v0, Landroidx/fragment/app/g0;->f:Ljava/util/ArrayList;

    .line 408
    .line 409
    sget-object v1, Landroidx/fragment/app/c;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 410
    .line 411
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 412
    .line 413
    .line 414
    move-result-object v1

    .line 415
    iput-object v1, v0, Landroidx/fragment/app/g0;->g:Ljava/util/ArrayList;

    .line 416
    .line 417
    sget-object v1, Landroidx/fragment/app/a0;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 418
    .line 419
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->createTypedArrayList(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;

    .line 420
    .line 421
    .line 422
    move-result-object p1

    .line 423
    iput-object p1, v0, Landroidx/fragment/app/g0;->h:Ljava/util/ArrayList;

    .line 424
    .line 425
    return-object v0

    .line 426
    :pswitch_11
    new-instance v0, Landroidx/fragment/app/a0;

    .line 427
    .line 428
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 429
    .line 430
    .line 431
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 432
    .line 433
    .line 434
    move-result-object v1

    .line 435
    iput-object v1, v0, Landroidx/fragment/app/a0;->a:Ljava/lang/String;

    .line 436
    .line 437
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 438
    .line 439
    .line 440
    move-result p1

    .line 441
    iput p1, v0, Landroidx/fragment/app/a0;->b:I

    .line 442
    .line 443
    return-object v0

    .line 444
    :pswitch_12
    new-instance v0, Landroidx/fragment/app/c;

    .line 445
    .line 446
    invoke-direct {v0, p1}, Landroidx/fragment/app/c;-><init>(Landroid/os/Parcel;)V

    .line 447
    .line 448
    .line 449
    return-object v0

    .line 450
    :pswitch_13
    new-instance v0, Landroidx/fragment/app/b;

    .line 451
    .line 452
    invoke-direct {v0, p1}, Landroidx/fragment/app/b;-><init>(Landroid/os/Parcel;)V

    .line 453
    .line 454
    .line 455
    return-object v0

    .line 456
    :pswitch_14
    new-instance v0, Landroid/support/v4/media/RatingCompat;

    .line 457
    .line 458
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 459
    .line 460
    .line 461
    move-result v1

    .line 462
    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    .line 463
    .line 464
    .line 465
    move-result p1

    .line 466
    invoke-direct {v0, v1, p1}, Landroid/support/v4/media/RatingCompat;-><init>(IF)V

    .line 467
    .line 468
    .line 469
    return-object v0

    .line 470
    :pswitch_15
    new-instance v0, Landroid/support/v4/media/MediaMetadataCompat;

    .line 471
    .line 472
    invoke-direct {v0, p1}, Landroid/support/v4/media/MediaMetadataCompat;-><init>(Landroid/os/Parcel;)V

    .line 473
    .line 474
    .line 475
    return-object v0

    .line 476
    :pswitch_16
    sget-object v0, Landroid/media/MediaDescription;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 477
    .line 478
    invoke-interface {v0, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 479
    .line 480
    .line 481
    move-result-object p1

    .line 482
    const/4 v0, 0x0

    .line 483
    if-eqz p1, :cond_14

    .line 484
    .line 485
    check-cast p1, Landroid/media/MediaDescription;

    .line 486
    .line 487
    invoke-static {p1}, Landroid/support/v4/media/a;->g(Landroid/media/MediaDescription;)Ljava/lang/String;

    .line 488
    .line 489
    .line 490
    move-result-object v2

    .line 491
    invoke-static {p1}, Landroid/support/v4/media/a;->i(Landroid/media/MediaDescription;)Ljava/lang/CharSequence;

    .line 492
    .line 493
    .line 494
    move-result-object v3

    .line 495
    invoke-static {p1}, Landroid/support/v4/media/a;->h(Landroid/media/MediaDescription;)Ljava/lang/CharSequence;

    .line 496
    .line 497
    .line 498
    move-result-object v4

    .line 499
    invoke-static {p1}, Landroid/support/v4/media/a;->c(Landroid/media/MediaDescription;)Ljava/lang/CharSequence;

    .line 500
    .line 501
    .line 502
    move-result-object v5

    .line 503
    invoke-static {p1}, Landroid/support/v4/media/a;->e(Landroid/media/MediaDescription;)Landroid/graphics/Bitmap;

    .line 504
    .line 505
    .line 506
    move-result-object v6

    .line 507
    invoke-static {p1}, Landroid/support/v4/media/a;->f(Landroid/media/MediaDescription;)Landroid/net/Uri;

    .line 508
    .line 509
    .line 510
    move-result-object v7

    .line 511
    invoke-static {p1}, Landroid/support/v4/media/a;->d(Landroid/media/MediaDescription;)Landroid/os/Bundle;

    .line 512
    .line 513
    .line 514
    move-result-object v1

    .line 515
    if-eqz v1, :cond_f

    .line 516
    .line 517
    invoke-static {v1}, Landroid/support/v4/media/session/b;->s0(Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 518
    .line 519
    .line 520
    move-result-object v1

    .line 521
    :cond_f
    const-string v8, "android.support.v4.media.description.MEDIA_URI"

    .line 522
    .line 523
    if-eqz v1, :cond_10

    .line 524
    .line 525
    invoke-virtual {v1, v8}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 526
    .line 527
    .line 528
    move-result-object v9

    .line 529
    check-cast v9, Landroid/net/Uri;

    .line 530
    .line 531
    goto :goto_6

    .line 532
    :cond_10
    move-object v9, v0

    .line 533
    :goto_6
    if-eqz v9, :cond_12

    .line 534
    .line 535
    const-string v10, "android.support.v4.media.description.NULL_BUNDLE_FLAG"

    .line 536
    .line 537
    invoke-virtual {v1, v10}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 538
    .line 539
    .line 540
    move-result v11

    .line 541
    if-eqz v11, :cond_11

    .line 542
    .line 543
    invoke-virtual {v1}, Landroid/os/BaseBundle;->size()I

    .line 544
    .line 545
    .line 546
    move-result v11

    .line 547
    const/4 v12, 0x2

    .line 548
    if-ne v11, v12, :cond_11

    .line 549
    .line 550
    move-object v8, v0

    .line 551
    goto :goto_7

    .line 552
    :cond_11
    invoke-virtual {v1, v8}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 553
    .line 554
    .line 555
    invoke-virtual {v1, v10}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 556
    .line 557
    .line 558
    :cond_12
    move-object v8, v1

    .line 559
    :goto_7
    if-eqz v9, :cond_13

    .line 560
    .line 561
    goto :goto_8

    .line 562
    :cond_13
    invoke-static {p1}, Landroid/support/v4/media/b;->a(Landroid/media/MediaDescription;)Landroid/net/Uri;

    .line 563
    .line 564
    .line 565
    move-result-object v9

    .line 566
    :goto_8
    new-instance v1, Landroid/support/v4/media/MediaDescriptionCompat;

    .line 567
    .line 568
    invoke-direct/range {v1 .. v9}, Landroid/support/v4/media/MediaDescriptionCompat;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/graphics/Bitmap;Landroid/net/Uri;Landroid/os/Bundle;Landroid/net/Uri;)V

    .line 569
    .line 570
    .line 571
    iput-object p1, v1, Landroid/support/v4/media/MediaDescriptionCompat;->i:Landroid/media/MediaDescription;

    .line 572
    .line 573
    move-object v0, v1

    .line 574
    :cond_14
    return-object v0

    .line 575
    :pswitch_17
    new-instance v0, Landroid/support/v4/media/MediaBrowserCompat$MediaItem;

    .line 576
    .line 577
    invoke-direct {v0, p1}, Landroid/support/v4/media/MediaBrowserCompat$MediaItem;-><init>(Landroid/os/Parcel;)V

    .line 578
    .line 579
    .line 580
    return-object v0

    .line 581
    :pswitch_18
    new-instance v0, La6/c;

    .line 582
    .line 583
    invoke-direct {v0, p1}, La6/c;-><init>(Landroid/os/Parcel;)V

    .line 584
    .line 585
    .line 586
    return-object v0

    .line 587
    :pswitch_19
    new-instance v0, La6/b;

    .line 588
    .line 589
    invoke-direct {v0, p1}, La6/b;-><init>(Landroid/os/Parcel;)V

    .line 590
    .line 591
    .line 592
    return-object v0

    .line 593
    :pswitch_1a
    new-instance v0, La2/t;

    .line 594
    .line 595
    invoke-direct {v0, p1}, La2/t;-><init>(Landroid/os/Parcel;)V

    .line 596
    .line 597
    .line 598
    return-object v0

    .line 599
    :pswitch_1b
    new-instance v0, La2/u;

    .line 600
    .line 601
    invoke-direct {v0, p1}, La2/u;-><init>(Landroid/os/Parcel;)V

    .line 602
    .line 603
    .line 604
    return-object v0

    .line 605
    :pswitch_1c
    invoke-static {p1}, LU8/v0;->o0(Landroid/os/Parcel;)I

    .line 606
    .line 607
    .line 608
    move-result v0

    .line 609
    const/4 v1, 0x0

    .line 610
    const/4 v2, 0x0

    .line 611
    move-object v6, v1

    .line 612
    move-object v8, v6

    .line 613
    move-object v9, v8

    .line 614
    move v4, v2

    .line 615
    move v5, v4

    .line 616
    move v7, v5

    .line 617
    :goto_9
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 618
    .line 619
    .line 620
    move-result v1

    .line 621
    if-ge v1, v0, :cond_1b

    .line 622
    .line 623
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 624
    .line 625
    .line 626
    move-result v1

    .line 627
    int-to-char v2, v1

    .line 628
    const/4 v3, 0x1

    .line 629
    if-eq v2, v3, :cond_1a

    .line 630
    .line 631
    const/4 v3, 0x2

    .line 632
    if-eq v2, v3, :cond_19

    .line 633
    .line 634
    const/4 v3, 0x3

    .line 635
    if-eq v2, v3, :cond_18

    .line 636
    .line 637
    const/4 v3, 0x4

    .line 638
    if-eq v2, v3, :cond_17

    .line 639
    .line 640
    const/4 v3, 0x5

    .line 641
    if-eq v2, v3, :cond_16

    .line 642
    .line 643
    const/16 v3, 0x3e8

    .line 644
    .line 645
    if-eq v2, v3, :cond_15

    .line 646
    .line 647
    invoke-static {v1, p1}, LU8/v0;->m0(ILandroid/os/Parcel;)V

    .line 648
    .line 649
    .line 650
    goto :goto_9

    .line 651
    :cond_15
    invoke-static {v1, p1}, LU8/v0;->f0(ILandroid/os/Parcel;)I

    .line 652
    .line 653
    .line 654
    move-result v4

    .line 655
    goto :goto_9

    .line 656
    :cond_16
    invoke-static {v1, p1}, LU8/v0;->r(ILandroid/os/Parcel;)[B

    .line 657
    .line 658
    .line 659
    move-result-object v9

    .line 660
    goto :goto_9

    .line 661
    :cond_17
    invoke-static {v1, p1}, LU8/v0;->q(ILandroid/os/Parcel;)Landroid/os/Bundle;

    .line 662
    .line 663
    .line 664
    move-result-object v8

    .line 665
    goto :goto_9

    .line 666
    :cond_18
    invoke-static {v1, p1}, LU8/v0;->f0(ILandroid/os/Parcel;)I

    .line 667
    .line 668
    .line 669
    move-result v7

    .line 670
    goto :goto_9

    .line 671
    :cond_19
    sget-object v2, Landroid/app/PendingIntent;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 672
    .line 673
    invoke-static {p1, v1, v2}, LU8/v0;->x(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 674
    .line 675
    .line 676
    move-result-object v1

    .line 677
    move-object v6, v1

    .line 678
    check-cast v6, Landroid/app/PendingIntent;

    .line 679
    .line 680
    goto :goto_9

    .line 681
    :cond_1a
    invoke-static {v1, p1}, LU8/v0;->f0(ILandroid/os/Parcel;)I

    .line 682
    .line 683
    .line 684
    move-result v5

    .line 685
    goto :goto_9

    .line 686
    :cond_1b
    invoke-static {v0, p1}, LU8/v0;->D(ILandroid/os/Parcel;)V

    .line 687
    .line 688
    .line 689
    new-instance v3, LZ6/b;

    .line 690
    .line 691
    invoke-direct/range {v3 .. v9}, LZ6/b;-><init>(IILandroid/app/PendingIntent;ILandroid/os/Bundle;[B)V

    .line 692
    .line 693
    .line 694
    return-object v3

    .line 695
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

.method public final newArray(I)[Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, LZ6/c;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-array p1, p1, [Lcom/google/android/gms/auth/api/signin/internal/SignInConfiguration;

    .line 7
    .line 8
    return-object p1

    .line 9
    :pswitch_0
    new-array p1, p1, [Lb7/a;

    .line 10
    .line 11
    return-object p1

    .line 12
    :pswitch_1
    new-array p1, p1, [Lb6/n;

    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_2
    new-array p1, p1, [Lb6/m;

    .line 16
    .line 17
    return-object p1

    .line 18
    :pswitch_3
    new-array p1, p1, [Lb6/l;

    .line 19
    .line 20
    return-object p1

    .line 21
    :pswitch_4
    new-array p1, p1, [Lb6/k;

    .line 22
    .line 23
    return-object p1

    .line 24
    :pswitch_5
    new-array p1, p1, [Lb6/j;

    .line 25
    .line 26
    return-object p1

    .line 27
    :pswitch_6
    new-array p1, p1, [Lb6/f;

    .line 28
    .line 29
    return-object p1

    .line 30
    :pswitch_7
    new-array p1, p1, [Lb6/e;

    .line 31
    .line 32
    return-object p1

    .line 33
    :pswitch_8
    new-array p1, p1, [Lb6/d;

    .line 34
    .line 35
    return-object p1

    .line 36
    :pswitch_9
    new-array p1, p1, [Lb6/c;

    .line 37
    .line 38
    return-object p1

    .line 39
    :pswitch_a
    new-array p1, p1, [Lb6/b;

    .line 40
    .line 41
    return-object p1

    .line 42
    :pswitch_b
    new-array p1, p1, [Lb6/a;

    .line 43
    .line 44
    return-object p1

    .line 45
    :pswitch_c
    new-array p1, p1, [Landroidx/recyclerview/widget/u0;

    .line 46
    .line 47
    return-object p1

    .line 48
    :pswitch_d
    new-array p1, p1, [Landroidx/recyclerview/widget/t0;

    .line 49
    .line 50
    return-object p1

    .line 51
    :pswitch_e
    new-array p1, p1, [Landroidx/recyclerview/widget/y;

    .line 52
    .line 53
    return-object p1

    .line 54
    :pswitch_f
    new-array p1, p1, [Landroidx/fragment/app/j0;

    .line 55
    .line 56
    return-object p1

    .line 57
    :pswitch_10
    new-array p1, p1, [Landroidx/fragment/app/g0;

    .line 58
    .line 59
    return-object p1

    .line 60
    :pswitch_11
    new-array p1, p1, [Landroidx/fragment/app/a0;

    .line 61
    .line 62
    return-object p1

    .line 63
    :pswitch_12
    new-array p1, p1, [Landroidx/fragment/app/c;

    .line 64
    .line 65
    return-object p1

    .line 66
    :pswitch_13
    new-array p1, p1, [Landroidx/fragment/app/b;

    .line 67
    .line 68
    return-object p1

    .line 69
    :pswitch_14
    new-array p1, p1, [Landroid/support/v4/media/RatingCompat;

    .line 70
    .line 71
    return-object p1

    .line 72
    :pswitch_15
    new-array p1, p1, [Landroid/support/v4/media/MediaMetadataCompat;

    .line 73
    .line 74
    return-object p1

    .line 75
    :pswitch_16
    new-array p1, p1, [Landroid/support/v4/media/MediaDescriptionCompat;

    .line 76
    .line 77
    return-object p1

    .line 78
    :pswitch_17
    new-array p1, p1, [Landroid/support/v4/media/MediaBrowserCompat$MediaItem;

    .line 79
    .line 80
    return-object p1

    .line 81
    :pswitch_18
    new-array p1, p1, [La6/c;

    .line 82
    .line 83
    return-object p1

    .line 84
    :pswitch_19
    new-array p1, p1, [La6/b;

    .line 85
    .line 86
    return-object p1

    .line 87
    :pswitch_1a
    new-array p1, p1, [La2/t;

    .line 88
    .line 89
    return-object p1

    .line 90
    :pswitch_1b
    new-array p1, p1, [La2/u;

    .line 91
    .line 92
    return-object p1

    .line 93
    :pswitch_1c
    new-array p1, p1, [LZ6/b;

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
