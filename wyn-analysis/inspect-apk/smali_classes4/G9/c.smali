.class public final LG9/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldf/a;


# instance fields
.field public final synthetic a:I

.field public final b:LG9/d;


# direct methods
.method public synthetic constructor <init>(Lza/a;LG9/d;I)V
    .locals 0

    .line 1
    iput p3, p0, LG9/c;->a:I

    iput-object p2, p0, LG9/c;->b:LG9/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, LG9/c;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LG9/c;->b:LG9/d;

    .line 7
    .line 8
    invoke-virtual {v0}, LG9/d;->get()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Landroid/util/DisplayMetrics;

    .line 13
    .line 14
    new-instance v1, LD9/k;

    .line 15
    .line 16
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iget v2, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 20
    .line 21
    int-to-float v2, v2

    .line 22
    const v3, 0x3f666666    # 0.9f

    .line 23
    .line 24
    .line 25
    mul-float/2addr v2, v3

    .line 26
    float-to-int v2, v2

    .line 27
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    iput-object v2, v1, LD9/k;->c:Ljava/lang/Integer;

    .line 32
    .line 33
    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 34
    .line 35
    int-to-float v0, v0

    .line 36
    mul-float/2addr v0, v3

    .line 37
    float-to-int v0, v0

    .line 38
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iput-object v0, v1, LD9/k;->d:Ljava/lang/Integer;

    .line 43
    .line 44
    const v0, 0x3f4ccccd    # 0.8f

    .line 45
    .line 46
    .line 47
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    iput-object v2, v1, LD9/k;->b:Ljava/lang/Float;

    .line 52
    .line 53
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    iput-object v0, v1, LD9/k;->a:Ljava/lang/Float;

    .line 58
    .line 59
    const/16 v0, 0x11

    .line 60
    .line 61
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    iput-object v0, v1, LD9/k;->f:Ljava/lang/Integer;

    .line 66
    .line 67
    const v0, 0x50102

    .line 68
    .line 69
    .line 70
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    iput-object v0, v1, LD9/k;->e:Ljava/lang/Integer;

    .line 75
    .line 76
    const/4 v0, -0x2

    .line 77
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    iput-object v2, v1, LD9/k;->g:Ljava/lang/Integer;

    .line 82
    .line 83
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    iput-object v0, v1, LD9/k;->h:Ljava/lang/Integer;

    .line 88
    .line 89
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 90
    .line 91
    iput-object v0, v1, LD9/k;->i:Ljava/lang/Boolean;

    .line 92
    .line 93
    iput-object v0, v1, LD9/k;->j:Ljava/lang/Boolean;

    .line 94
    .line 95
    iput-object v0, v1, LD9/k;->k:Ljava/lang/Boolean;

    .line 96
    .line 97
    return-object v1

    .line 98
    :pswitch_0
    iget-object v0, p0, LG9/c;->b:LG9/d;

    .line 99
    .line 100
    invoke-virtual {v0}, LG9/d;->get()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    check-cast v0, Landroid/util/DisplayMetrics;

    .line 105
    .line 106
    new-instance v1, LD9/k;

    .line 107
    .line 108
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 109
    .line 110
    .line 111
    iget v2, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 112
    .line 113
    int-to-double v2, v2

    .line 114
    const-wide v4, 0x3fe999999999999aL    # 0.8

    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    mul-double/2addr v2, v4

    .line 120
    double-to-int v2, v2

    .line 121
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    iput-object v2, v1, LD9/k;->c:Ljava/lang/Integer;

    .line 126
    .line 127
    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 128
    .line 129
    int-to-float v0, v0

    .line 130
    const v2, 0x3f333333    # 0.7f

    .line 131
    .line 132
    .line 133
    mul-float/2addr v0, v2

    .line 134
    float-to-int v0, v0

    .line 135
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    iput-object v0, v1, LD9/k;->d:Ljava/lang/Integer;

    .line 140
    .line 141
    const v0, 0x3f19999a    # 0.6f

    .line 142
    .line 143
    .line 144
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    iput-object v0, v1, LD9/k;->a:Ljava/lang/Float;

    .line 149
    .line 150
    const v0, 0x3f666666    # 0.9f

    .line 151
    .line 152
    .line 153
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    iput-object v0, v1, LD9/k;->b:Ljava/lang/Float;

    .line 158
    .line 159
    const/16 v0, 0x11

    .line 160
    .line 161
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    iput-object v0, v1, LD9/k;->f:Ljava/lang/Integer;

    .line 166
    .line 167
    const v0, 0x50102

    .line 168
    .line 169
    .line 170
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    iput-object v0, v1, LD9/k;->e:Ljava/lang/Integer;

    .line 175
    .line 176
    const/4 v0, -0x1

    .line 177
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    iput-object v0, v1, LD9/k;->g:Ljava/lang/Integer;

    .line 182
    .line 183
    const/4 v0, -0x2

    .line 184
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    iput-object v0, v1, LD9/k;->h:Ljava/lang/Integer;

    .line 189
    .line 190
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 191
    .line 192
    iput-object v0, v1, LD9/k;->i:Ljava/lang/Boolean;

    .line 193
    .line 194
    iput-object v0, v1, LD9/k;->j:Ljava/lang/Boolean;

    .line 195
    .line 196
    iput-object v0, v1, LD9/k;->k:Ljava/lang/Boolean;

    .line 197
    .line 198
    return-object v1

    .line 199
    :pswitch_1
    iget-object v0, p0, LG9/c;->b:LG9/d;

    .line 200
    .line 201
    invoke-virtual {v0}, LG9/d;->get()Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    check-cast v0, Landroid/util/DisplayMetrics;

    .line 206
    .line 207
    new-instance v1, LD9/k;

    .line 208
    .line 209
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 210
    .line 211
    .line 212
    iget v2, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 213
    .line 214
    int-to-double v2, v2

    .line 215
    const-wide v4, 0x3fe999999999999aL    # 0.8

    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    mul-double/2addr v2, v4

    .line 221
    double-to-int v2, v2

    .line 222
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 223
    .line 224
    .line 225
    move-result-object v2

    .line 226
    iput-object v2, v1, LD9/k;->c:Ljava/lang/Integer;

    .line 227
    .line 228
    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 229
    .line 230
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    iput-object v0, v1, LD9/k;->d:Ljava/lang/Integer;

    .line 235
    .line 236
    const/high16 v0, 0x3f800000    # 1.0f

    .line 237
    .line 238
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    iput-object v0, v1, LD9/k;->a:Ljava/lang/Float;

    .line 243
    .line 244
    const v0, 0x3ecccccd    # 0.4f

    .line 245
    .line 246
    .line 247
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    iput-object v0, v1, LD9/k;->b:Ljava/lang/Float;

    .line 252
    .line 253
    const/16 v0, 0x11

    .line 254
    .line 255
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    iput-object v0, v1, LD9/k;->f:Ljava/lang/Integer;

    .line 260
    .line 261
    const v0, 0x50102

    .line 262
    .line 263
    .line 264
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    iput-object v0, v1, LD9/k;->e:Ljava/lang/Integer;

    .line 269
    .line 270
    const/4 v0, -0x1

    .line 271
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 272
    .line 273
    .line 274
    move-result-object v2

    .line 275
    iput-object v2, v1, LD9/k;->g:Ljava/lang/Integer;

    .line 276
    .line 277
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 278
    .line 279
    .line 280
    move-result-object v0

    .line 281
    iput-object v0, v1, LD9/k;->h:Ljava/lang/Integer;

    .line 282
    .line 283
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 284
    .line 285
    iput-object v0, v1, LD9/k;->i:Ljava/lang/Boolean;

    .line 286
    .line 287
    iput-object v0, v1, LD9/k;->j:Ljava/lang/Boolean;

    .line 288
    .line 289
    iput-object v0, v1, LD9/k;->k:Ljava/lang/Boolean;

    .line 290
    .line 291
    return-object v1

    .line 292
    :pswitch_2
    iget-object v0, p0, LG9/c;->b:LG9/d;

    .line 293
    .line 294
    invoke-virtual {v0}, LG9/d;->get()Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object v0

    .line 298
    check-cast v0, Landroid/util/DisplayMetrics;

    .line 299
    .line 300
    new-instance v1, LD9/k;

    .line 301
    .line 302
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 303
    .line 304
    .line 305
    iget v2, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 306
    .line 307
    int-to-float v2, v2

    .line 308
    const v3, 0x3f666666    # 0.9f

    .line 309
    .line 310
    .line 311
    mul-float/2addr v2, v3

    .line 312
    float-to-int v2, v2

    .line 313
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 314
    .line 315
    .line 316
    move-result-object v2

    .line 317
    iput-object v2, v1, LD9/k;->c:Ljava/lang/Integer;

    .line 318
    .line 319
    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 320
    .line 321
    int-to-float v0, v0

    .line 322
    mul-float/2addr v0, v3

    .line 323
    float-to-int v0, v0

    .line 324
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 325
    .line 326
    .line 327
    move-result-object v0

    .line 328
    iput-object v0, v1, LD9/k;->d:Ljava/lang/Integer;

    .line 329
    .line 330
    const v0, 0x3f4ccccd    # 0.8f

    .line 331
    .line 332
    .line 333
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 334
    .line 335
    .line 336
    move-result-object v2

    .line 337
    iput-object v2, v1, LD9/k;->b:Ljava/lang/Float;

    .line 338
    .line 339
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 340
    .line 341
    .line 342
    move-result-object v0

    .line 343
    iput-object v0, v1, LD9/k;->a:Ljava/lang/Float;

    .line 344
    .line 345
    const/16 v0, 0x11

    .line 346
    .line 347
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 348
    .line 349
    .line 350
    move-result-object v0

    .line 351
    iput-object v0, v1, LD9/k;->f:Ljava/lang/Integer;

    .line 352
    .line 353
    const v0, 0x50102

    .line 354
    .line 355
    .line 356
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 357
    .line 358
    .line 359
    move-result-object v0

    .line 360
    iput-object v0, v1, LD9/k;->e:Ljava/lang/Integer;

    .line 361
    .line 362
    const/4 v0, -0x2

    .line 363
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 364
    .line 365
    .line 366
    move-result-object v2

    .line 367
    iput-object v2, v1, LD9/k;->g:Ljava/lang/Integer;

    .line 368
    .line 369
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 370
    .line 371
    .line 372
    move-result-object v0

    .line 373
    iput-object v0, v1, LD9/k;->h:Ljava/lang/Integer;

    .line 374
    .line 375
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 376
    .line 377
    iput-object v0, v1, LD9/k;->i:Ljava/lang/Boolean;

    .line 378
    .line 379
    iput-object v0, v1, LD9/k;->j:Ljava/lang/Boolean;

    .line 380
    .line 381
    iput-object v0, v1, LD9/k;->k:Ljava/lang/Boolean;

    .line 382
    .line 383
    return-object v1

    .line 384
    :pswitch_3
    iget-object v0, p0, LG9/c;->b:LG9/d;

    .line 385
    .line 386
    invoke-virtual {v0}, LG9/d;->get()Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    move-result-object v0

    .line 390
    check-cast v0, Landroid/util/DisplayMetrics;

    .line 391
    .line 392
    new-instance v1, LD9/k;

    .line 393
    .line 394
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 395
    .line 396
    .line 397
    iget v2, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 398
    .line 399
    int-to-double v2, v2

    .line 400
    const-wide v4, 0x3fe999999999999aL    # 0.8

    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    mul-double/2addr v2, v4

    .line 406
    double-to-int v2, v2

    .line 407
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 408
    .line 409
    .line 410
    move-result-object v2

    .line 411
    iput-object v2, v1, LD9/k;->c:Ljava/lang/Integer;

    .line 412
    .line 413
    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 414
    .line 415
    int-to-float v0, v0

    .line 416
    const v2, 0x3f333333    # 0.7f

    .line 417
    .line 418
    .line 419
    mul-float/2addr v0, v2

    .line 420
    float-to-int v0, v0

    .line 421
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 422
    .line 423
    .line 424
    move-result-object v0

    .line 425
    iput-object v0, v1, LD9/k;->d:Ljava/lang/Integer;

    .line 426
    .line 427
    const v0, 0x3f19999a    # 0.6f

    .line 428
    .line 429
    .line 430
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 431
    .line 432
    .line 433
    move-result-object v0

    .line 434
    iput-object v0, v1, LD9/k;->a:Ljava/lang/Float;

    .line 435
    .line 436
    const/high16 v0, 0x3f800000    # 1.0f

    .line 437
    .line 438
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 439
    .line 440
    .line 441
    move-result-object v0

    .line 442
    iput-object v0, v1, LD9/k;->b:Ljava/lang/Float;

    .line 443
    .line 444
    const/16 v0, 0x11

    .line 445
    .line 446
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 447
    .line 448
    .line 449
    move-result-object v0

    .line 450
    iput-object v0, v1, LD9/k;->f:Ljava/lang/Integer;

    .line 451
    .line 452
    const v0, 0x50122

    .line 453
    .line 454
    .line 455
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 456
    .line 457
    .line 458
    move-result-object v0

    .line 459
    iput-object v0, v1, LD9/k;->e:Ljava/lang/Integer;

    .line 460
    .line 461
    const/4 v0, -0x2

    .line 462
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 463
    .line 464
    .line 465
    move-result-object v2

    .line 466
    iput-object v2, v1, LD9/k;->g:Ljava/lang/Integer;

    .line 467
    .line 468
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 469
    .line 470
    .line 471
    move-result-object v0

    .line 472
    iput-object v0, v1, LD9/k;->h:Ljava/lang/Integer;

    .line 473
    .line 474
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 475
    .line 476
    iput-object v0, v1, LD9/k;->i:Ljava/lang/Boolean;

    .line 477
    .line 478
    iput-object v0, v1, LD9/k;->j:Ljava/lang/Boolean;

    .line 479
    .line 480
    iput-object v0, v1, LD9/k;->k:Ljava/lang/Boolean;

    .line 481
    .line 482
    return-object v1

    .line 483
    :pswitch_4
    iget-object v0, p0, LG9/c;->b:LG9/d;

    .line 484
    .line 485
    invoke-virtual {v0}, LG9/d;->get()Ljava/lang/Object;

    .line 486
    .line 487
    .line 488
    move-result-object v0

    .line 489
    check-cast v0, Landroid/util/DisplayMetrics;

    .line 490
    .line 491
    new-instance v1, LD9/k;

    .line 492
    .line 493
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 494
    .line 495
    .line 496
    iget v2, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 497
    .line 498
    int-to-double v2, v2

    .line 499
    const-wide v4, 0x3fe999999999999aL    # 0.8

    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    mul-double/2addr v2, v4

    .line 505
    double-to-int v2, v2

    .line 506
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 507
    .line 508
    .line 509
    move-result-object v2

    .line 510
    iput-object v2, v1, LD9/k;->c:Ljava/lang/Integer;

    .line 511
    .line 512
    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 513
    .line 514
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 515
    .line 516
    .line 517
    move-result-object v0

    .line 518
    iput-object v0, v1, LD9/k;->d:Ljava/lang/Integer;

    .line 519
    .line 520
    const/high16 v0, 0x3f800000    # 1.0f

    .line 521
    .line 522
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 523
    .line 524
    .line 525
    move-result-object v0

    .line 526
    iput-object v0, v1, LD9/k;->a:Ljava/lang/Float;

    .line 527
    .line 528
    const/high16 v0, 0x3f000000    # 0.5f

    .line 529
    .line 530
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 531
    .line 532
    .line 533
    move-result-object v0

    .line 534
    iput-object v0, v1, LD9/k;->b:Ljava/lang/Float;

    .line 535
    .line 536
    const/16 v0, 0x11

    .line 537
    .line 538
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 539
    .line 540
    .line 541
    move-result-object v0

    .line 542
    iput-object v0, v1, LD9/k;->f:Ljava/lang/Integer;

    .line 543
    .line 544
    const v0, 0x50122

    .line 545
    .line 546
    .line 547
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 548
    .line 549
    .line 550
    move-result-object v0

    .line 551
    iput-object v0, v1, LD9/k;->e:Ljava/lang/Integer;

    .line 552
    .line 553
    const/4 v0, -0x2

    .line 554
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 555
    .line 556
    .line 557
    move-result-object v2

    .line 558
    iput-object v2, v1, LD9/k;->g:Ljava/lang/Integer;

    .line 559
    .line 560
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 561
    .line 562
    .line 563
    move-result-object v0

    .line 564
    iput-object v0, v1, LD9/k;->h:Ljava/lang/Integer;

    .line 565
    .line 566
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 567
    .line 568
    iput-object v0, v1, LD9/k;->i:Ljava/lang/Boolean;

    .line 569
    .line 570
    iput-object v0, v1, LD9/k;->j:Ljava/lang/Boolean;

    .line 571
    .line 572
    iput-object v0, v1, LD9/k;->k:Ljava/lang/Boolean;

    .line 573
    .line 574
    return-object v1

    .line 575
    :pswitch_5
    iget-object v0, p0, LG9/c;->b:LG9/d;

    .line 576
    .line 577
    invoke-virtual {v0}, LG9/d;->get()Ljava/lang/Object;

    .line 578
    .line 579
    .line 580
    move-result-object v0

    .line 581
    check-cast v0, Landroid/util/DisplayMetrics;

    .line 582
    .line 583
    new-instance v1, LD9/k;

    .line 584
    .line 585
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 586
    .line 587
    .line 588
    const v2, 0x3e99999a    # 0.3f

    .line 589
    .line 590
    .line 591
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 592
    .line 593
    .line 594
    move-result-object v3

    .line 595
    iput-object v3, v1, LD9/k;->a:Ljava/lang/Float;

    .line 596
    .line 597
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 598
    .line 599
    .line 600
    move-result-object v2

    .line 601
    iput-object v2, v1, LD9/k;->b:Ljava/lang/Float;

    .line 602
    .line 603
    iget v2, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 604
    .line 605
    int-to-float v2, v2

    .line 606
    const/high16 v3, 0x3f000000    # 0.5f

    .line 607
    .line 608
    mul-float/2addr v2, v3

    .line 609
    float-to-int v2, v2

    .line 610
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 611
    .line 612
    .line 613
    move-result-object v2

    .line 614
    iput-object v2, v1, LD9/k;->c:Ljava/lang/Integer;

    .line 615
    .line 616
    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 617
    .line 618
    int-to-float v0, v0

    .line 619
    const v2, 0x3f666666    # 0.9f

    .line 620
    .line 621
    .line 622
    mul-float/2addr v0, v2

    .line 623
    float-to-int v0, v0

    .line 624
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 625
    .line 626
    .line 627
    move-result-object v0

    .line 628
    iput-object v0, v1, LD9/k;->d:Ljava/lang/Integer;

    .line 629
    .line 630
    const/16 v0, 0x30

    .line 631
    .line 632
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 633
    .line 634
    .line 635
    move-result-object v0

    .line 636
    iput-object v0, v1, LD9/k;->f:Ljava/lang/Integer;

    .line 637
    .line 638
    const v0, 0x10120

    .line 639
    .line 640
    .line 641
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 642
    .line 643
    .line 644
    move-result-object v0

    .line 645
    iput-object v0, v1, LD9/k;->e:Ljava/lang/Integer;

    .line 646
    .line 647
    const/4 v0, -0x1

    .line 648
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 649
    .line 650
    .line 651
    move-result-object v0

    .line 652
    iput-object v0, v1, LD9/k;->g:Ljava/lang/Integer;

    .line 653
    .line 654
    const/4 v0, -0x2

    .line 655
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 656
    .line 657
    .line 658
    move-result-object v0

    .line 659
    iput-object v0, v1, LD9/k;->h:Ljava/lang/Integer;

    .line 660
    .line 661
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 662
    .line 663
    iput-object v0, v1, LD9/k;->i:Ljava/lang/Boolean;

    .line 664
    .line 665
    iput-object v0, v1, LD9/k;->j:Ljava/lang/Boolean;

    .line 666
    .line 667
    iput-object v0, v1, LD9/k;->k:Ljava/lang/Boolean;

    .line 668
    .line 669
    return-object v1

    .line 670
    :pswitch_6
    iget-object v0, p0, LG9/c;->b:LG9/d;

    .line 671
    .line 672
    invoke-virtual {v0}, LG9/d;->get()Ljava/lang/Object;

    .line 673
    .line 674
    .line 675
    move-result-object v0

    .line 676
    check-cast v0, Landroid/util/DisplayMetrics;

    .line 677
    .line 678
    new-instance v1, LD9/k;

    .line 679
    .line 680
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 681
    .line 682
    .line 683
    const v2, 0x3e99999a    # 0.3f

    .line 684
    .line 685
    .line 686
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 687
    .line 688
    .line 689
    move-result-object v3

    .line 690
    iput-object v3, v1, LD9/k;->a:Ljava/lang/Float;

    .line 691
    .line 692
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 693
    .line 694
    .line 695
    move-result-object v2

    .line 696
    iput-object v2, v1, LD9/k;->b:Ljava/lang/Float;

    .line 697
    .line 698
    iget v2, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 699
    .line 700
    int-to-float v2, v2

    .line 701
    const/high16 v3, 0x3f000000    # 0.5f

    .line 702
    .line 703
    mul-float/2addr v2, v3

    .line 704
    float-to-int v2, v2

    .line 705
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 706
    .line 707
    .line 708
    move-result-object v2

    .line 709
    iput-object v2, v1, LD9/k;->c:Ljava/lang/Integer;

    .line 710
    .line 711
    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 712
    .line 713
    int-to-float v0, v0

    .line 714
    const v2, 0x3f666666    # 0.9f

    .line 715
    .line 716
    .line 717
    mul-float/2addr v0, v2

    .line 718
    float-to-int v0, v0

    .line 719
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 720
    .line 721
    .line 722
    move-result-object v0

    .line 723
    iput-object v0, v1, LD9/k;->d:Ljava/lang/Integer;

    .line 724
    .line 725
    const/16 v0, 0x30

    .line 726
    .line 727
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 728
    .line 729
    .line 730
    move-result-object v0

    .line 731
    iput-object v0, v1, LD9/k;->f:Ljava/lang/Integer;

    .line 732
    .line 733
    const v0, 0x10120

    .line 734
    .line 735
    .line 736
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 737
    .line 738
    .line 739
    move-result-object v0

    .line 740
    iput-object v0, v1, LD9/k;->e:Ljava/lang/Integer;

    .line 741
    .line 742
    const/4 v0, -0x1

    .line 743
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 744
    .line 745
    .line 746
    move-result-object v0

    .line 747
    iput-object v0, v1, LD9/k;->g:Ljava/lang/Integer;

    .line 748
    .line 749
    const/4 v0, -0x2

    .line 750
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 751
    .line 752
    .line 753
    move-result-object v0

    .line 754
    iput-object v0, v1, LD9/k;->h:Ljava/lang/Integer;

    .line 755
    .line 756
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 757
    .line 758
    iput-object v0, v1, LD9/k;->i:Ljava/lang/Boolean;

    .line 759
    .line 760
    iput-object v0, v1, LD9/k;->j:Ljava/lang/Boolean;

    .line 761
    .line 762
    iput-object v0, v1, LD9/k;->k:Ljava/lang/Boolean;

    .line 763
    .line 764
    return-object v1

    .line 765
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
