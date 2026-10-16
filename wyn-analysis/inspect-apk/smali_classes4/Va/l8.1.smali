.class public abstract LVa/l8;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/regex/Pattern;

.field public static final b:Ljava/util/regex/Pattern;

.field public static final c:Ljava/util/regex/Pattern;

.field public static final d:Ljava/util/regex/Pattern;

.field public static final e:Ljava/util/regex/Pattern;

.field public static final f:Ljava/util/regex/Pattern;

.field public static final g:Ljava/util/regex/Pattern;

.field public static final h:Ljava/util/regex/Pattern;

.field public static final i:Ljava/util/List;

.field public static j:I = 0x0

.field public static k:I = 0x1


# direct methods
.method static constructor <clinit>()V
    .locals 17

    .line 1
    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumFlingVelocity()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    shr-int/lit8 v0, v0, 0x10

    .line 6
    .line 7
    rsub-int v0, v0, 0x755

    .line 8
    .line 9
    const-string v1, "\u4006\u4756\u4e93\u558a\u5d76\u64b0\u6b8b\u7351\u7ad4\u01fa\u0957\u10a4\u17c5\u1f24\u2684\u2de2\u3525\u3ca7\uc392\ucb3a\ud2c5\ud985\ue149\ue8a6\uef8a"

    .line 10
    .line 11
    invoke-static {v0, v1}, LVa/l8;->a(ILjava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, LVa/l8;->a:Ljava/util/regex/Pattern;

    .line 24
    .line 25
    const v0, 0xc509

    .line 26
    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-static {v1}, Landroid/graphics/Color;->blue(I)I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    add-int/2addr v2, v0

    .line 34
    const-string v0, "\u4006\u8573\uca62\u0f7c\u5446\u9929\ude32\u2345\u686c\uad52\uf25c\u3719\u7c69\u4104\u860c\ucbfd"

    .line 35
    .line 36
    invoke-static {v2, v0}, LVa/l8;->a(ILjava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    sput-object v0, LVa/l8;->b:Ljava/util/regex/Pattern;

    .line 49
    .line 50
    invoke-static {}, Landroid/os/Process;->myTid()I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    shr-int/lit8 v0, v0, 0x16

    .line 55
    .line 56
    rsub-int/lit8 v0, v0, 0x10

    .line 57
    .line 58
    const-string v2, ""

    .line 59
    .line 60
    const/16 v3, 0x30

    .line 61
    .line 62
    invoke-static {v2, v3, v1, v1}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CII)I

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    rsub-int v4, v4, 0x9e

    .line 67
    .line 68
    invoke-static {}, Landroid/view/ViewConfiguration;->getDoubleTapTimeout()I

    .line 69
    .line 70
    .line 71
    move-result v5

    .line 72
    shr-int/lit8 v5, v5, 0x10

    .line 73
    .line 74
    rsub-int/lit8 v5, v5, 0xf

    .line 75
    .line 76
    const-string v6, "\uffe4\uffe5\ufffc\ufff7\u0019\u0019\uffe49\u0018\u001b\uffe4\u001a\uffe6\uffe7\uffe4\u001b"

    .line 77
    .line 78
    invoke-static {v6, v0, v4, v5, v1}, LVa/l8;->b(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    sput-object v0, LVa/l8;->c:Ljava/util/regex/Pattern;

    .line 91
    .line 92
    invoke-static {v1}, Landroid/graphics/ImageFormat;->getBitsPerPixel(I)I

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    rsub-int/lit8 v0, v0, 0xe

    .line 97
    .line 98
    invoke-static {v1, v1, v1}, Landroid/view/View;->resolveSizeAndState(III)I

    .line 99
    .line 100
    .line 101
    move-result v4

    .line 102
    rsub-int v4, v4, 0x9d

    .line 103
    .line 104
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 105
    .line 106
    .line 107
    move-result-wide v5

    .line 108
    const-wide/16 v7, 0x0

    .line 109
    .line 110
    cmp-long v5, v5, v7

    .line 111
    .line 112
    rsub-int/lit8 v5, v5, 0xe

    .line 113
    .line 114
    const-string v6, "\uffef\uffec\ufff8\u001c\uffea\u001b\uffed\u001a\uffef\uffec\ufff8\u001c\uffea\u001d\u001a"

    .line 115
    .line 116
    invoke-static {v6, v0, v4, v5, v1}, LVa/l8;->b(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    sput-object v0, LVa/l8;->d:Ljava/util/regex/Pattern;

    .line 129
    .line 130
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 131
    .line 132
    .line 133
    move-result-wide v4

    .line 134
    cmp-long v0, v4, v7

    .line 135
    .line 136
    add-int/lit16 v0, v0, 0x33fc

    .line 137
    .line 138
    const-string v4, "\u4006\u73fe\u2792\udb82\u8f95\u43f4\u779d"

    .line 139
    .line 140
    invoke-static {v0, v4}, LVa/l8;->a(ILjava/lang/String;)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    sput-object v0, LVa/l8;->e:Ljava/util/regex/Pattern;

    .line 153
    .line 154
    invoke-static {}, Landroid/media/AudioTrack;->getMaxVolume()F

    .line 155
    .line 156
    .line 157
    move-result v0

    .line 158
    const/4 v4, 0x0

    .line 159
    cmpl-float v0, v0, v4

    .line 160
    .line 161
    rsub-int/lit8 v0, v0, 0x22

    .line 162
    .line 163
    invoke-static {v2, v3, v1}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CI)I

    .line 164
    .line 165
    .line 166
    move-result v5

    .line 167
    add-int/lit16 v5, v5, 0xaa

    .line 168
    .line 169
    invoke-static {}, Landroid/media/AudioTrack;->getMaxVolume()F

    .line 170
    .line 171
    .line 172
    move-result v6

    .line 173
    cmpl-float v6, v6, v4

    .line 174
    .line 175
    rsub-int/lit8 v6, v6, 0x12

    .line 176
    .line 177
    const/4 v9, 0x1

    .line 178
    const-string v10, "\uffe0\ufff4-\uffe0\u0014\u000e\u0010\u0012\uffd7\r\uffe0\ufff4-\uffe0\u0014\u000e\u0011&&\u0014\u001f\u0016\uffe1\u000f\uffdd\u0010\uffe1\u0012\uffd7\uffec\uffe0\uffe3\r"

    .line 179
    .line 180
    invoke-static {v10, v0, v5, v6, v9}, LVa/l8;->b(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    sput-object v0, LVa/l8;->f:Ljava/util/regex/Pattern;

    .line 193
    .line 194
    invoke-static {v2, v1}, Landroid/text/TextUtils;->getOffsetBefore(Ljava/lang/CharSequence;I)I

    .line 195
    .line 196
    .line 197
    move-result v0

    .line 198
    add-int/lit8 v0, v0, 0x3

    .line 199
    .line 200
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollFriction()F

    .line 201
    .line 202
    .line 203
    move-result v5

    .line 204
    cmpl-float v5, v5, v4

    .line 205
    .line 206
    rsub-int v5, v5, 0x95

    .line 207
    .line 208
    invoke-static {v2, v1}, Landroid/text/TextUtils;->getOffsetBefore(Ljava/lang/CharSequence;I)I

    .line 209
    .line 210
    .line 211
    move-result v2

    .line 212
    add-int/lit8 v2, v2, 0x3

    .line 213
    .line 214
    const-string v6, "&\uffee\uffee"

    .line 215
    .line 216
    invoke-static {v6, v0, v5, v2, v1}, LVa/l8;->b(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    sput-object v0, LVa/l8;->g:Ljava/util/regex/Pattern;

    .line 229
    .line 230
    invoke-static {v1, v1, v1, v1}, Landroid/graphics/Color;->argb(IIII)I

    .line 231
    .line 232
    .line 233
    move-result v0

    .line 234
    add-int/lit8 v0, v0, 0x5

    .line 235
    .line 236
    invoke-static {v7, v8}, Landroid/widget/ExpandableListView;->getPackedPositionChild(J)I

    .line 237
    .line 238
    .line 239
    move-result v2

    .line 240
    rsub-int v2, v2, 0xc4

    .line 241
    .line 242
    invoke-static {}, Landroid/view/KeyEvent;->getMaxKeyCode()I

    .line 243
    .line 244
    .line 245
    move-result v5

    .line 246
    shr-int/lit8 v5, v5, 0x10

    .line 247
    .line 248
    rsub-int/lit8 v5, v5, 0x1

    .line 249
    .line 250
    const-string v6, "\u0013\ufff5\ufff3\u0013\ufff3"

    .line 251
    .line 252
    invoke-static {v6, v0, v2, v5, v1}, LVa/l8;->b(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    sput-object v0, LVa/l8;->h:Ljava/util/regex/Pattern;

    .line 265
    .line 266
    invoke-static {}, Landroid/view/ViewConfiguration;->getGlobalActionKeyTimeout()J

    .line 267
    .line 268
    .line 269
    move-result-wide v5

    .line 270
    cmp-long v0, v5, v7

    .line 271
    .line 272
    const v2, 0xa176

    .line 273
    .line 274
    .line 275
    sub-int/2addr v2, v0

    .line 276
    const-string v0, "\u4031\ue14b"

    .line 277
    .line 278
    invoke-static {v2, v0}, LVa/l8;->a(ILjava/lang/String;)Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object v0

    .line 282
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object v10

    .line 286
    invoke-static {}, Landroid/media/AudioTrack;->getMinVolume()F

    .line 287
    .line 288
    .line 289
    move-result v0

    .line 290
    cmpl-float v0, v0, v4

    .line 291
    .line 292
    add-int/lit16 v0, v0, 0x755f

    .line 293
    .line 294
    const-string v2, "\u403d\u356b\uaa95\u2020"

    .line 295
    .line 296
    invoke-static {v0, v2}, LVa/l8;->a(ILjava/lang/String;)Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 301
    .line 302
    .line 303
    move-result-object v11

    .line 304
    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumFlingVelocity()I

    .line 305
    .line 306
    .line 307
    move-result v0

    .line 308
    shr-int/lit8 v0, v0, 0x10

    .line 309
    .line 310
    rsub-int v0, v0, 0x71f

    .line 311
    .line 312
    const-string v2, "\u4036\u4732\u4e0a\u5569"

    .line 313
    .line 314
    invoke-static {v0, v2}, LVa/l8;->a(ILjava/lang/String;)Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object v0

    .line 318
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 319
    .line 320
    .line 321
    move-result-object v12

    .line 322
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarSize()I

    .line 323
    .line 324
    .line 325
    move-result v0

    .line 326
    shr-int/lit8 v0, v0, 0x8

    .line 327
    .line 328
    const v2, 0xcf55

    .line 329
    .line 330
    .line 331
    sub-int/2addr v2, v0

    .line 332
    const-string v0, "\u402a\u8f68\ude86\u2dd2\u7d7e\u4c9f"

    .line 333
    .line 334
    invoke-static {v2, v0}, LVa/l8;->a(ILjava/lang/String;)Ljava/lang/String;

    .line 335
    .line 336
    .line 337
    move-result-object v0

    .line 338
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 339
    .line 340
    .line 341
    move-result-object v13

    .line 342
    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    .line 343
    .line 344
    .line 345
    move-result v0

    .line 346
    shr-int/lit8 v0, v0, 0x10

    .line 347
    .line 348
    add-int/lit8 v0, v0, 0x5

    .line 349
    .line 350
    invoke-static {v1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 351
    .line 352
    .line 353
    move-result v2

    .line 354
    add-int/lit16 v2, v2, 0xcb

    .line 355
    .line 356
    invoke-static {v1, v1}, Landroid/graphics/drawable/Drawable;->resolveOpacity(II)I

    .line 357
    .line 358
    .line 359
    move-result v4

    .line 360
    add-int/lit8 v4, v4, 0x4

    .line 361
    .line 362
    const-string v5, "\ufff6\u0001\u0006\u0004\u0003"

    .line 363
    .line 364
    invoke-static {v5, v0, v2, v4, v9}, LVa/l8;->b(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 365
    .line 366
    .line 367
    move-result-object v0

    .line 368
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 369
    .line 370
    .line 371
    move-result-object v14

    .line 372
    invoke-static {}, Landroid/os/SystemClock;->currentThreadTimeMillis()J

    .line 373
    .line 374
    .line 375
    move-result-wide v4

    .line 376
    const-wide/16 v15, -0x1

    .line 377
    .line 378
    cmp-long v0, v4, v15

    .line 379
    .line 380
    rsub-int v0, v0, 0xdac

    .line 381
    .line 382
    const-string v2, "\u402c\u4d81\u5b77"

    .line 383
    .line 384
    invoke-static {v0, v2}, LVa/l8;->a(ILjava/lang/String;)Ljava/lang/String;

    .line 385
    .line 386
    .line 387
    move-result-object v0

    .line 388
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 389
    .line 390
    .line 391
    move-result-object v15

    .line 392
    invoke-static {}, Landroid/os/Process;->getElapsedCpuTime()J

    .line 393
    .line 394
    .line 395
    move-result-wide v4

    .line 396
    cmp-long v0, v4, v7

    .line 397
    .line 398
    add-int/lit8 v0, v0, 0x4

    .line 399
    .line 400
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 401
    .line 402
    .line 403
    move-result v2

    .line 404
    shr-int/lit8 v2, v2, 0x16

    .line 405
    .line 406
    add-int/lit16 v2, v2, 0xc3

    .line 407
    .line 408
    invoke-static {v3}, Landroid/text/AndroidCharacter;->getMirror(C)C

    .line 409
    .line 410
    .line 411
    move-result v3

    .line 412
    add-int/lit8 v3, v3, -0x2d

    .line 413
    .line 414
    const-string v4, "\r\ufffc\u0001\ufffc\ufffa"

    .line 415
    .line 416
    invoke-static {v4, v0, v2, v3, v1}, LVa/l8;->b(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 417
    .line 418
    .line 419
    move-result-object v0

    .line 420
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 421
    .line 422
    .line 423
    move-result-object v16

    .line 424
    filled-new-array/range {v10 .. v16}, [Ljava/lang/String;

    .line 425
    .line 426
    .line 427
    move-result-object v0

    .line 428
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 429
    .line 430
    .line 431
    move-result-object v0

    .line 432
    sput-object v0, LVa/l8;->i:Ljava/util/List;

    .line 433
    .line 434
    sget v0, LVa/l8;->j:I

    .line 435
    .line 436
    add-int/lit8 v0, v0, 0x23

    .line 437
    .line 438
    rem-int/lit16 v0, v0, 0x80

    .line 439
    .line 440
    sput v0, LVa/l8;->k:I

    .line 441
    .line 442
    return-void
.end method

.method public static a(ILjava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, [C

    .line 6
    .line 7
    sget-object v0, LVa/a;->u:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v0

    .line 10
    :try_start_0
    sput p0, LVa/a;->t:I

    .line 11
    .line 12
    array-length p0, p1

    .line 13
    new-array p0, p0, [C

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    sput v1, LVa/a;->s:I

    .line 17
    .line 18
    :goto_0
    sget v1, LVa/a;->s:I

    .line 19
    .line 20
    array-length v2, p1

    .line 21
    if-ge v1, v2, :cond_0

    .line 22
    .line 23
    aget-char v2, p1, v1

    .line 24
    .line 25
    sget v3, LVa/a;->t:I

    .line 26
    .line 27
    mul-int/2addr v3, v1

    .line 28
    xor-int/2addr v2, v3

    .line 29
    int-to-long v2, v2

    .line 30
    const-wide v4, 0x5ad8efbc4fa24058L    # 4.3212866713850254E129

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    xor-long/2addr v2, v4

    .line 36
    long-to-int v2, v2

    .line 37
    int-to-char v2, v2

    .line 38
    aput-char v2, p0, v1

    .line 39
    .line 40
    add-int/lit8 v1, v1, 0x1

    .line 41
    .line 42
    sput v1, LVa/a;->s:I

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :catchall_0
    move-exception p0

    .line 46
    goto :goto_1

    .line 47
    :cond_0
    new-instance p1, Ljava/lang/String;

    .line 48
    .line 49
    invoke-direct {p1, p0}, Ljava/lang/String;-><init>([C)V

    .line 50
    .line 51
    .line 52
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    return-object p1

    .line 54
    :goto_1
    monitor-exit v0

    .line 55
    throw p0
.end method

.method public static b(Ljava/lang/String;IIIZ)Ljava/lang/String;
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, [C

    .line 6
    .line 7
    sget-object v0, LVa/Ab;->x:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v0

    .line 10
    :try_start_0
    new-array v1, p1, [C

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    sput v2, LVa/Ab;->v:I

    .line 14
    .line 15
    :goto_0
    sget v3, LVa/Ab;->v:I

    .line 16
    .line 17
    if-ge v3, p1, :cond_0

    .line 18
    .line 19
    aget-char v4, p0, v3

    .line 20
    .line 21
    add-int/2addr v4, p2

    .line 22
    int-to-char v4, v4

    .line 23
    aput-char v4, v1, v3

    .line 24
    .line 25
    add-int/lit8 v4, v4, -0x5c

    .line 26
    .line 27
    int-to-char v4, v4

    .line 28
    aput-char v4, v1, v3

    .line 29
    .line 30
    add-int/lit8 v3, v3, 0x1

    .line 31
    .line 32
    sput v3, LVa/Ab;->v:I

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :catchall_0
    move-exception p0

    .line 36
    goto :goto_2

    .line 37
    :cond_0
    if-lez p3, :cond_1

    .line 38
    .line 39
    sput p3, LVa/Ab;->w:I

    .line 40
    .line 41
    new-array p0, p1, [C

    .line 42
    .line 43
    invoke-static {v1, v2, p0, v2, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 44
    .line 45
    .line 46
    sget p2, LVa/Ab;->w:I

    .line 47
    .line 48
    sub-int p3, p1, p2

    .line 49
    .line 50
    invoke-static {p0, v2, v1, p3, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 51
    .line 52
    .line 53
    sget p2, LVa/Ab;->w:I

    .line 54
    .line 55
    sub-int p3, p1, p2

    .line 56
    .line 57
    invoke-static {p0, p2, v1, v2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 58
    .line 59
    .line 60
    :cond_1
    if-eqz p4, :cond_3

    .line 61
    .line 62
    new-array p0, p1, [C

    .line 63
    .line 64
    sput v2, LVa/Ab;->v:I

    .line 65
    .line 66
    :goto_1
    sget p2, LVa/Ab;->v:I

    .line 67
    .line 68
    if-ge p2, p1, :cond_2

    .line 69
    .line 70
    sub-int p3, p1, p2

    .line 71
    .line 72
    add-int/lit8 p3, p3, -0x1

    .line 73
    .line 74
    aget-char p3, v1, p3

    .line 75
    .line 76
    aput-char p3, p0, p2

    .line 77
    .line 78
    add-int/lit8 p2, p2, 0x1

    .line 79
    .line 80
    sput p2, LVa/Ab;->v:I

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_2
    move-object v1, p0

    .line 84
    :cond_3
    new-instance p0, Ljava/lang/String;

    .line 85
    .line 86
    invoke-direct {p0, v1}, Ljava/lang/String;-><init>([C)V

    .line 87
    .line 88
    .line 89
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 90
    return-object p0

    .line 91
    :goto_2
    monitor-exit v0

    .line 92
    throw p0
.end method

.method public static c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    sget v3, LVa/l8;->k:I

    .line 8
    .line 9
    add-int/lit8 v3, v3, 0x4b

    .line 10
    .line 11
    rem-int/lit16 v3, v3, 0x80

    .line 12
    .line 13
    sput v3, LVa/l8;->j:I

    .line 14
    .line 15
    new-instance v3, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 18
    .line 19
    .line 20
    const/4 v4, 0x0

    .line 21
    move v5, v4

    .line 22
    :goto_0
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 23
    .line 24
    .line 25
    move-result v6

    .line 26
    if-ge v5, v6, :cond_15

    .line 27
    .line 28
    sget v6, LVa/l8;->j:I

    .line 29
    .line 30
    add-int/lit8 v6, v6, 0x3f

    .line 31
    .line 32
    rem-int/lit16 v6, v6, 0x80

    .line 33
    .line 34
    sput v6, LVa/l8;->k:I

    .line 35
    .line 36
    add-int/lit8 v6, v5, 0x1

    .line 37
    .line 38
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 39
    .line 40
    .line 41
    move-result v7

    .line 42
    if-ge v6, v7, :cond_0

    .line 43
    .line 44
    sget v7, LVa/l8;->j:I

    .line 45
    .line 46
    add-int/lit8 v7, v7, 0x4b

    .line 47
    .line 48
    rem-int/lit16 v7, v7, 0x80

    .line 49
    .line 50
    sput v7, LVa/l8;->k:I

    .line 51
    .line 52
    invoke-virtual {v2, v6}, Ljava/lang/String;->charAt(I)C

    .line 53
    .line 54
    .line 55
    move-result v7

    .line 56
    goto :goto_1

    .line 57
    :cond_0
    move v7, v4

    .line 58
    :goto_1
    invoke-virtual {v2, v5}, Ljava/lang/String;->charAt(I)C

    .line 59
    .line 60
    .line 61
    move-result v8

    .line 62
    const/16 v9, 0xa

    .line 63
    .line 64
    if-eq v8, v9, :cond_1

    .line 65
    .line 66
    const/16 v9, 0x25

    .line 67
    .line 68
    if-eq v8, v9, :cond_14

    .line 69
    .line 70
    const/16 v10, 0x5b

    .line 71
    .line 72
    if-eq v8, v10, :cond_14

    .line 73
    .line 74
    const/16 v10, 0x5d

    .line 75
    .line 76
    if-eq v8, v10, :cond_14

    .line 77
    .line 78
    const/16 v10, 0x7b

    .line 79
    .line 80
    if-eq v8, v10, :cond_14

    .line 81
    .line 82
    const/16 v10, 0x7d

    .line 83
    .line 84
    if-eq v8, v10, :cond_14

    .line 85
    .line 86
    const/4 v10, 0x1

    .line 87
    const/16 v11, 0x21

    .line 88
    .line 89
    const-string v14, ""

    .line 90
    .line 91
    if-eq v8, v11, :cond_12

    .line 92
    .line 93
    const/4 v11, 0x2

    .line 94
    const/16 v15, 0x22

    .line 95
    .line 96
    const v16, 0xab4d

    .line 97
    .line 98
    .line 99
    move/from16 v17, v9

    .line 100
    .line 101
    const-string v9, "\u401d\ueb67\u16b0\u41d0\ued1e\u18f9\u43e6\uef22\u1a42\u459e\uf133\u1c79\u47a3\uf291\u1e1d\u49af\uf4fa\u202c\u4b5c\uf688\u227c\u4d68\uf8b2\u2393\u4f10\ufab2\u25f9\u512e\ufc40\u2788\u5331\ufe65\u29d8"

    .line 102
    .line 103
    const-wide/16 v18, 0x0

    .line 104
    .line 105
    const-string v12, "$)\uffdb\uffdb"

    .line 106
    .line 107
    const-string v13, "\u4014\u7900\u325a\ueb8a\ua4de\u5e46"

    .line 108
    .line 109
    if-eq v8, v15, :cond_10

    .line 110
    .line 111
    packed-switch v8, :pswitch_data_0

    .line 112
    .line 113
    .line 114
    packed-switch v8, :pswitch_data_1

    .line 115
    .line 116
    .line 117
    invoke-virtual {v2, v5}, Ljava/lang/String;->charAt(I)C

    .line 118
    .line 119
    .line 120
    move-result v7

    .line 121
    invoke-static {v7}, Ljava/lang/Character;->isWhitespace(C)Z

    .line 122
    .line 123
    .line 124
    move-result v7

    .line 125
    if-eqz v7, :cond_2

    .line 126
    .line 127
    :cond_1
    :goto_2
    move v5, v6

    .line 128
    goto :goto_0

    .line 129
    :cond_2
    sget-object v7, LVa/u8;->h:LVa/u8;

    .line 130
    .line 131
    sget-object v8, LVa/l8;->f:Ljava/util/regex/Pattern;

    .line 132
    .line 133
    invoke-static {v8, v2, v5}, LVa/l8;->e(Ljava/util/regex/Pattern;Ljava/lang/String;I)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v8

    .line 137
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 138
    .line 139
    .line 140
    move-result v9

    .line 141
    if-eqz v9, :cond_5

    .line 142
    .line 143
    sget v7, LVa/l8;->j:I

    .line 144
    .line 145
    add-int/lit8 v7, v7, 0x41

    .line 146
    .line 147
    rem-int/lit16 v7, v7, 0x80

    .line 148
    .line 149
    sput v7, LVa/l8;->k:I

    .line 150
    .line 151
    sget-object v7, LVa/u8;->b:LVa/u8;

    .line 152
    .line 153
    sget-object v8, LVa/l8;->a:Ljava/util/regex/Pattern;

    .line 154
    .line 155
    invoke-static {v8, v2, v5}, LVa/l8;->e(Ljava/util/regex/Pattern;Ljava/lang/String;I)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v8

    .line 159
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 160
    .line 161
    .line 162
    move-result v9

    .line 163
    if-nez v9, :cond_5

    .line 164
    .line 165
    const v9, 0x9257

    .line 166
    .line 167
    .line 168
    invoke-static {v4, v4, v4, v4}, Landroid/graphics/Color;->argb(IIII)I

    .line 169
    .line 170
    .line 171
    move-result v16

    .line 172
    add-int v9, v16, v9

    .line 173
    .line 174
    const/16 v20, 0x0

    .line 175
    .line 176
    const-string v15, "\u402c\ud27d\u6483\uf738"

    .line 177
    .line 178
    invoke-static {v9, v15}, LVa/l8;->a(ILjava/lang/String;)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v9

    .line 182
    invoke-virtual {v9}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v9

    .line 186
    invoke-virtual {v8, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    move-result v9

    .line 190
    if-nez v9, :cond_4

    .line 191
    .line 192
    invoke-static {v4}, Landroid/view/KeyEvent;->normalizeMetaState(I)I

    .line 193
    .line 194
    .line 195
    move-result v9

    .line 196
    add-int/lit16 v9, v9, 0x7b4f

    .line 197
    .line 198
    const-string v15, "\u403e\u3b76\ub6aa\u31c6\uad01"

    .line 199
    .line 200
    invoke-static {v9, v15}, LVa/l8;->a(ILjava/lang/String;)Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v9

    .line 204
    invoke-virtual {v9}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v9

    .line 208
    invoke-virtual {v8, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    move-result v9

    .line 212
    if-eqz v9, :cond_3

    .line 213
    .line 214
    goto :goto_3

    .line 215
    :cond_3
    sget-object v9, LVa/l8;->i:Ljava/util/List;

    .line 216
    .line 217
    invoke-interface {v9, v8}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 218
    .line 219
    .line 220
    move-result v9

    .line 221
    if-eqz v9, :cond_6

    .line 222
    .line 223
    sget-object v7, LVa/u8;->a:LVa/u8;

    .line 224
    .line 225
    goto :goto_4

    .line 226
    :cond_4
    :goto_3
    sget-object v7, LVa/u8;->g:LVa/u8;

    .line 227
    .line 228
    goto :goto_4

    .line 229
    :cond_5
    const/16 v20, 0x0

    .line 230
    .line 231
    :cond_6
    :goto_4
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 232
    .line 233
    .line 234
    move-result v9

    .line 235
    if-eqz v9, :cond_7

    .line 236
    .line 237
    sget-object v7, LVa/u8;->f:LVa/u8;

    .line 238
    .line 239
    sget-object v8, LVa/l8;->d:Ljava/util/regex/Pattern;

    .line 240
    .line 241
    invoke-static {v8, v2, v5}, LVa/l8;->e(Ljava/util/regex/Pattern;Ljava/lang/String;I)Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object v8

    .line 245
    :cond_7
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 246
    .line 247
    .line 248
    move-result v9

    .line 249
    xor-int/2addr v9, v10

    .line 250
    if-eq v9, v10, :cond_8

    .line 251
    .line 252
    sget-object v7, LVa/u8;->e:LVa/u8;

    .line 253
    .line 254
    sget-object v8, LVa/l8;->e:Ljava/util/regex/Pattern;

    .line 255
    .line 256
    invoke-static {v8, v2, v5}, LVa/l8;->e(Ljava/util/regex/Pattern;Ljava/lang/String;I)Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v8

    .line 260
    :cond_8
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 261
    .line 262
    .line 263
    move-result v9

    .line 264
    if-eqz v9, :cond_a

    .line 265
    .line 266
    sget v7, LVa/l8;->k:I

    .line 267
    .line 268
    add-int/lit8 v7, v7, 0x25

    .line 269
    .line 270
    rem-int/lit16 v8, v7, 0x80

    .line 271
    .line 272
    sput v8, LVa/l8;->j:I

    .line 273
    .line 274
    rem-int/2addr v7, v11

    .line 275
    sget-object v8, LVa/l8;->h:Ljava/util/regex/Pattern;

    .line 276
    .line 277
    if-nez v7, :cond_9

    .line 278
    .line 279
    sget-object v7, LVa/u8;->c:LVa/u8;

    .line 280
    .line 281
    invoke-static {v8, v2, v5}, LVa/l8;->e(Ljava/util/regex/Pattern;Ljava/lang/String;I)Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object v8

    .line 285
    goto :goto_5

    .line 286
    :cond_9
    invoke-static {v8, v2, v5}, LVa/l8;->e(Ljava/util/regex/Pattern;Ljava/lang/String;I)Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    const/4 v0, 0x0

    .line 290
    throw v0

    .line 291
    :cond_a
    :goto_5
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 292
    .line 293
    .line 294
    move-result v9

    .line 295
    if-eqz v9, :cond_b

    .line 296
    .line 297
    sget-object v7, LVa/u8;->c:LVa/u8;

    .line 298
    .line 299
    sget-object v8, LVa/l8;->g:Ljava/util/regex/Pattern;

    .line 300
    .line 301
    invoke-static {v8, v2, v5}, LVa/l8;->e(Ljava/util/regex/Pattern;Ljava/lang/String;I)Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object v8

    .line 305
    :cond_b
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 306
    .line 307
    .line 308
    move-result v9

    .line 309
    if-nez v9, :cond_c

    .line 310
    .line 311
    new-instance v6, LVa/v8;

    .line 312
    .line 313
    invoke-direct {v6, v7, v8}, LVa/v8;-><init>(LVa/u8;Ljava/lang/String;)V

    .line 314
    .line 315
    .line 316
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 317
    .line 318
    .line 319
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 320
    .line 321
    .line 322
    move-result v6

    .line 323
    :goto_6
    add-int/2addr v5, v6

    .line 324
    goto/16 :goto_0

    .line 325
    .line 326
    :cond_c
    new-instance v7, Ljava/lang/StringBuilder;

    .line 327
    .line 328
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 329
    .line 330
    .line 331
    invoke-static {v4, v4}, Landroid/widget/ExpandableListView;->getPackedPositionForChild(II)J

    .line 332
    .line 333
    .line 334
    move-result-wide v8

    .line 335
    cmp-long v8, v8, v18

    .line 336
    .line 337
    rsub-int v8, v8, 0x393c

    .line 338
    .line 339
    invoke-static {v8, v13}, LVa/l8;->a(ILjava/lang/String;)Ljava/lang/String;

    .line 340
    .line 341
    .line 342
    move-result-object v8

    .line 343
    invoke-virtual {v8}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 344
    .line 345
    .line 346
    move-result-object v8

    .line 347
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 348
    .line 349
    .line 350
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 351
    .line 352
    .line 353
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 354
    .line 355
    .line 356
    move-result-object v7

    .line 357
    new-instance v8, Ljava/lang/StringBuilder;

    .line 358
    .line 359
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 360
    .line 361
    .line 362
    invoke-static {}, Landroid/media/AudioTrack;->getMaxVolume()F

    .line 363
    .line 364
    .line 365
    move-result v9

    .line 366
    cmpl-float v9, v9, v20

    .line 367
    .line 368
    add-int/lit8 v9, v9, 0x11

    .line 369
    .line 370
    invoke-static {}, Landroid/view/ViewConfiguration;->getTapTimeout()I

    .line 371
    .line 372
    .line 373
    move-result v13

    .line 374
    shr-int/lit8 v13, v13, 0x10

    .line 375
    .line 376
    rsub-int v13, v13, 0xbc

    .line 377
    .line 378
    invoke-static {v14, v4, v4}, Landroid/text/TextUtils;->getCapsMode(Ljava/lang/CharSequence;II)I

    .line 379
    .line 380
    .line 381
    move-result v15

    .line 382
    add-int/2addr v15, v11

    .line 383
    const-string v11, "\u000e\ufff5\uffc0\u0012\u0001\u0008\u0003\uffc0\u0004\u0005\u001a\t\u000e\u0007\u000f\u0003\u0005\u0012"

    .line 384
    .line 385
    invoke-static {v11, v9, v13, v15, v10}, LVa/l8;->b(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 386
    .line 387
    .line 388
    move-result-object v9

    .line 389
    invoke-virtual {v9}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 390
    .line 391
    .line 392
    move-result-object v9

    .line 393
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 394
    .line 395
    .line 396
    invoke-virtual {v2, v5}, Ljava/lang/String;->charAt(I)C

    .line 397
    .line 398
    .line 399
    move-result v9

    .line 400
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 401
    .line 402
    .line 403
    invoke-static {v14}, Landroid/view/KeyEvent;->keyCodeFromString(Ljava/lang/String;)I

    .line 404
    .line 405
    .line 406
    move-result v9

    .line 407
    add-int/lit8 v9, v9, 0xd

    .line 408
    .line 409
    invoke-static {}, Landroid/view/ViewConfiguration;->getTouchSlop()I

    .line 410
    .line 411
    .line 412
    move-result v11

    .line 413
    shr-int/lit8 v11, v11, 0x8

    .line 414
    .line 415
    add-int/lit16 v11, v11, 0xb7

    .line 416
    .line 417
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 418
    .line 419
    .line 420
    move-result-wide v15

    .line 421
    cmp-long v13, v15, v18

    .line 422
    .line 423
    add-int/lit8 v13, v13, 0x4

    .line 424
    .line 425
    const-string v15, "\u0015\uffc5\u0019\u0006\uffc5\uffc5\u0013\u0014\u000e\u0019\u000e\u0018\u0014"

    .line 426
    .line 427
    invoke-static {v15, v9, v11, v13, v10}, LVa/l8;->b(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 428
    .line 429
    .line 430
    move-result-object v9

    .line 431
    invoke-virtual {v9}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 432
    .line 433
    .line 434
    move-result-object v9

    .line 435
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 436
    .line 437
    .line 438
    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 439
    .line 440
    .line 441
    invoke-static {}, Landroid/view/ViewConfiguration;->getDoubleTapTimeout()I

    .line 442
    .line 443
    .line 444
    move-result v5

    .line 445
    shr-int/lit8 v5, v5, 0x10

    .line 446
    .line 447
    rsub-int/lit8 v5, v5, 0x4

    .line 448
    .line 449
    invoke-static {v4}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 450
    .line 451
    .line 452
    move-result v9

    .line 453
    rsub-int v9, v9, 0xa1

    .line 454
    .line 455
    invoke-static {v14, v14, v4}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I

    .line 456
    .line 457
    .line 458
    move-result v10

    .line 459
    add-int/lit8 v10, v10, 0x3

    .line 460
    .line 461
    invoke-static {v12, v5, v9, v10, v4}, LVa/l8;->b(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 462
    .line 463
    .line 464
    move-result-object v5

    .line 465
    invoke-virtual {v5}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 466
    .line 467
    .line 468
    move-result-object v5

    .line 469
    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 470
    .line 471
    .line 472
    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 473
    .line 474
    .line 475
    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 476
    .line 477
    .line 478
    move-result-object v5

    .line 479
    invoke-static {v7, v5}, LVa/a;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 480
    .line 481
    .line 482
    goto/16 :goto_2

    .line 483
    .line 484
    :pswitch_0
    new-instance v7, LVa/v8;

    .line 485
    .line 486
    sget-object v8, LVa/u8;->c:LVa/u8;

    .line 487
    .line 488
    new-instance v9, Ljava/lang/StringBuilder;

    .line 489
    .line 490
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 491
    .line 492
    .line 493
    invoke-virtual {v2, v5}, Ljava/lang/String;->charAt(I)C

    .line 494
    .line 495
    .line 496
    move-result v5

    .line 497
    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 498
    .line 499
    .line 500
    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 501
    .line 502
    .line 503
    move-result-object v5

    .line 504
    invoke-direct {v7, v8, v5}, LVa/v8;-><init>(LVa/u8;Ljava/lang/String;)V

    .line 505
    .line 506
    .line 507
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 508
    .line 509
    .line 510
    goto/16 :goto_2

    .line 511
    .line 512
    :pswitch_1
    const/16 v20, 0x0

    .line 513
    .line 514
    const/16 v8, 0x2d

    .line 515
    .line 516
    if-ne v7, v8, :cond_14

    .line 517
    .line 518
    new-instance v6, LVa/v8;

    .line 519
    .line 520
    sget-object v7, LVa/u8;->c:LVa/u8;

    .line 521
    .line 522
    invoke-static {}, Landroid/media/AudioTrack;->getMinVolume()F

    .line 523
    .line 524
    .line 525
    move-result v8

    .line 526
    cmpl-float v8, v8, v20

    .line 527
    .line 528
    rsub-int v8, v8, 0x7d3

    .line 529
    .line 530
    const-string v9, "\u4075\u47a6"

    .line 531
    .line 532
    invoke-static {v8, v9}, LVa/l8;->a(ILjava/lang/String;)Ljava/lang/String;

    .line 533
    .line 534
    .line 535
    move-result-object v8

    .line 536
    invoke-virtual {v8}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 537
    .line 538
    .line 539
    move-result-object v8

    .line 540
    invoke-direct {v6, v7, v8}, LVa/v8;-><init>(LVa/u8;Ljava/lang/String;)V

    .line 541
    .line 542
    .line 543
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 544
    .line 545
    .line 546
    :goto_7
    add-int/lit8 v5, v5, 0x2

    .line 547
    .line 548
    goto/16 :goto_0

    .line 549
    .line 550
    :pswitch_2
    const/16 v8, 0x2b

    .line 551
    .line 552
    if-ne v7, v8, :cond_d

    .line 553
    .line 554
    new-instance v6, LVa/v8;

    .line 555
    .line 556
    sget-object v7, LVa/u8;->c:LVa/u8;

    .line 557
    .line 558
    invoke-static/range {v18 .. v19}, Landroid/widget/ExpandableListView;->getPackedPositionGroup(J)I

    .line 559
    .line 560
    .line 561
    move-result v8

    .line 562
    add-int/2addr v8, v11

    .line 563
    invoke-static {v14, v14, v4, v4}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;II)I

    .line 564
    .line 565
    .line 566
    move-result v9

    .line 567
    add-int/lit16 v9, v9, 0x87

    .line 568
    .line 569
    invoke-static {v4, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 570
    .line 571
    .line 572
    move-result v10

    .line 573
    add-int/2addr v10, v11

    .line 574
    const-string v11, "\u0000\u0000"

    .line 575
    .line 576
    invoke-static {v11, v8, v9, v10, v4}, LVa/l8;->b(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 577
    .line 578
    .line 579
    move-result-object v8

    .line 580
    invoke-virtual {v8}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 581
    .line 582
    .line 583
    move-result-object v8

    .line 584
    invoke-direct {v6, v7, v8}, LVa/v8;-><init>(LVa/u8;Ljava/lang/String;)V

    .line 585
    .line 586
    .line 587
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 588
    .line 589
    .line 590
    goto :goto_7

    .line 591
    :cond_d
    new-instance v7, LVa/v8;

    .line 592
    .line 593
    sget-object v8, LVa/u8;->c:LVa/u8;

    .line 594
    .line 595
    new-instance v9, Ljava/lang/StringBuilder;

    .line 596
    .line 597
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 598
    .line 599
    .line 600
    invoke-virtual {v2, v5}, Ljava/lang/String;->charAt(I)C

    .line 601
    .line 602
    .line 603
    move-result v5

    .line 604
    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 605
    .line 606
    .line 607
    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 608
    .line 609
    .line 610
    move-result-object v5

    .line 611
    invoke-direct {v7, v8, v5}, LVa/v8;-><init>(LVa/u8;Ljava/lang/String;)V

    .line 612
    .line 613
    .line 614
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 615
    .line 616
    .line 617
    sget v5, LVa/l8;->j:I

    .line 618
    .line 619
    add-int/lit8 v5, v5, 0x7

    .line 620
    .line 621
    rem-int/lit16 v5, v5, 0x80

    .line 622
    .line 623
    sput v5, LVa/l8;->k:I

    .line 624
    .line 625
    goto/16 :goto_2

    .line 626
    .line 627
    :pswitch_3
    sget-object v7, LVa/l8;->c:Ljava/util/regex/Pattern;

    .line 628
    .line 629
    invoke-static {v7, v2, v5}, LVa/l8;->e(Ljava/util/regex/Pattern;Ljava/lang/String;I)Ljava/lang/String;

    .line 630
    .line 631
    .line 632
    move-result-object v7

    .line 633
    if-nez v7, :cond_e

    .line 634
    .line 635
    new-instance v7, Ljava/lang/StringBuilder;

    .line 636
    .line 637
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 638
    .line 639
    .line 640
    invoke-static {}, Landroid/view/ViewConfiguration;->getJumpTapTimeout()I

    .line 641
    .line 642
    .line 643
    move-result v8

    .line 644
    shr-int/lit8 v8, v8, 0x10

    .line 645
    .line 646
    rsub-int v8, v8, 0x393d

    .line 647
    .line 648
    invoke-static {v8, v13}, LVa/l8;->a(ILjava/lang/String;)Ljava/lang/String;

    .line 649
    .line 650
    .line 651
    move-result-object v8

    .line 652
    invoke-virtual {v8}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 653
    .line 654
    .line 655
    move-result-object v8

    .line 656
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 657
    .line 658
    .line 659
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 660
    .line 661
    .line 662
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 663
    .line 664
    .line 665
    move-result-object v7

    .line 666
    new-instance v8, Ljava/lang/StringBuilder;

    .line 667
    .line 668
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 669
    .line 670
    .line 671
    invoke-static {}, Landroid/view/ViewConfiguration;->getPressedStateDuration()I

    .line 672
    .line 673
    .line 674
    move-result v10

    .line 675
    shr-int/lit8 v10, v10, 0x10

    .line 676
    .line 677
    sub-int v10, v16, v10

    .line 678
    .line 679
    invoke-static {v10, v9}, LVa/l8;->a(ILjava/lang/String;)Ljava/lang/String;

    .line 680
    .line 681
    .line 682
    move-result-object v9

    .line 683
    invoke-virtual {v9}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 684
    .line 685
    .line 686
    move-result-object v9

    .line 687
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 688
    .line 689
    .line 690
    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 691
    .line 692
    .line 693
    invoke-static {}, Landroid/view/KeyEvent;->getModifierMetaStateMask()I

    .line 694
    .line 695
    .line 696
    move-result v5

    .line 697
    int-to-byte v5, v5

    .line 698
    rsub-int/lit8 v5, v5, 0x3

    .line 699
    .line 700
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarFadeDuration()I

    .line 701
    .line 702
    .line 703
    move-result v9

    .line 704
    shr-int/lit8 v9, v9, 0x10

    .line 705
    .line 706
    add-int/lit16 v9, v9, 0xa1

    .line 707
    .line 708
    invoke-static {v14, v14, v4, v4}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;II)I

    .line 709
    .line 710
    .line 711
    move-result v10

    .line 712
    add-int/lit8 v10, v10, 0x3

    .line 713
    .line 714
    invoke-static {v12, v5, v9, v10, v4}, LVa/l8;->b(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 715
    .line 716
    .line 717
    move-result-object v5

    .line 718
    invoke-virtual {v5}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 719
    .line 720
    .line 721
    move-result-object v5

    .line 722
    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 723
    .line 724
    .line 725
    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 726
    .line 727
    .line 728
    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 729
    .line 730
    .line 731
    move-result-object v5

    .line 732
    invoke-static {v7, v5}, LVa/a;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 733
    .line 734
    .line 735
    goto/16 :goto_2

    .line 736
    .line 737
    :cond_e
    invoke-static {v7}, LVa/l8;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 738
    .line 739
    .line 740
    move-result-object v6

    .line 741
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 742
    .line 743
    .line 744
    move-result v7

    .line 745
    if-ne v7, v10, :cond_f

    .line 746
    .line 747
    invoke-virtual {v6, v4}, Ljava/lang/String;->charAt(I)C

    .line 748
    .line 749
    .line 750
    move-result v7

    .line 751
    new-instance v8, LVa/v8;

    .line 752
    .line 753
    sget-object v9, LVa/u8;->e:LVa/u8;

    .line 754
    .line 755
    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 756
    .line 757
    .line 758
    move-result-object v7

    .line 759
    invoke-direct {v8, v9, v7}, LVa/v8;-><init>(LVa/u8;Ljava/lang/String;)V

    .line 760
    .line 761
    .line 762
    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 763
    .line 764
    .line 765
    goto :goto_8

    .line 766
    :cond_f
    new-instance v7, LVa/v8;

    .line 767
    .line 768
    sget-object v8, LVa/u8;->d:LVa/u8;

    .line 769
    .line 770
    invoke-direct {v7, v8, v6}, LVa/v8;-><init>(LVa/u8;Ljava/lang/String;)V

    .line 771
    .line 772
    .line 773
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 774
    .line 775
    .line 776
    :goto_8
    invoke-static {v11, v5, v6}, LA7/p0;->g(IILjava/lang/String;)I

    .line 777
    .line 778
    .line 779
    move-result v5

    .line 780
    sget v6, LVa/l8;->j:I

    .line 781
    .line 782
    add-int/lit8 v6, v6, 0x3

    .line 783
    .line 784
    rem-int/lit16 v6, v6, 0x80

    .line 785
    .line 786
    sput v6, LVa/l8;->k:I

    .line 787
    .line 788
    goto/16 :goto_0

    .line 789
    .line 790
    :cond_10
    sget-object v7, LVa/l8;->b:Ljava/util/regex/Pattern;

    .line 791
    .line 792
    invoke-static {v7, v2, v5}, LVa/l8;->e(Ljava/util/regex/Pattern;Ljava/lang/String;I)Ljava/lang/String;

    .line 793
    .line 794
    .line 795
    move-result-object v7

    .line 796
    if-nez v7, :cond_11

    .line 797
    .line 798
    new-instance v7, Ljava/lang/StringBuilder;

    .line 799
    .line 800
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 801
    .line 802
    .line 803
    invoke-static {v4, v4, v4}, Landroid/view/View;->resolveSizeAndState(III)I

    .line 804
    .line 805
    .line 806
    move-result v8

    .line 807
    rsub-int v8, v8, 0x393d

    .line 808
    .line 809
    invoke-static {v8, v13}, LVa/l8;->a(ILjava/lang/String;)Ljava/lang/String;

    .line 810
    .line 811
    .line 812
    move-result-object v8

    .line 813
    invoke-virtual {v8}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 814
    .line 815
    .line 816
    move-result-object v8

    .line 817
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 818
    .line 819
    .line 820
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 821
    .line 822
    .line 823
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 824
    .line 825
    .line 826
    move-result-object v7

    .line 827
    new-instance v8, Ljava/lang/StringBuilder;

    .line 828
    .line 829
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 830
    .line 831
    .line 832
    invoke-static {v4}, Landroid/graphics/Color;->red(I)I

    .line 833
    .line 834
    .line 835
    move-result v10

    .line 836
    add-int v10, v10, v16

    .line 837
    .line 838
    invoke-static {v10, v9}, LVa/l8;->a(ILjava/lang/String;)Ljava/lang/String;

    .line 839
    .line 840
    .line 841
    move-result-object v9

    .line 842
    invoke-virtual {v9}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 843
    .line 844
    .line 845
    move-result-object v9

    .line 846
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 847
    .line 848
    .line 849
    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 850
    .line 851
    .line 852
    invoke-static {v14, v4}, Landroid/text/TextUtils;->getOffsetAfter(Ljava/lang/CharSequence;I)I

    .line 853
    .line 854
    .line 855
    move-result v5

    .line 856
    add-int/lit8 v5, v5, 0x4

    .line 857
    .line 858
    invoke-static {v4, v4}, Landroid/view/View;->getDefaultSize(II)I

    .line 859
    .line 860
    .line 861
    move-result v9

    .line 862
    add-int/lit16 v9, v9, 0xa1

    .line 863
    .line 864
    invoke-static/range {v18 .. v19}, Landroid/widget/ExpandableListView;->getPackedPositionType(J)I

    .line 865
    .line 866
    .line 867
    move-result v10

    .line 868
    add-int/lit8 v10, v10, 0x3

    .line 869
    .line 870
    invoke-static {v12, v5, v9, v10, v4}, LVa/l8;->b(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 871
    .line 872
    .line 873
    move-result-object v5

    .line 874
    invoke-virtual {v5}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 875
    .line 876
    .line 877
    move-result-object v5

    .line 878
    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 879
    .line 880
    .line 881
    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 882
    .line 883
    .line 884
    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 885
    .line 886
    .line 887
    move-result-object v5

    .line 888
    invoke-static {v7, v5}, LVa/a;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 889
    .line 890
    .line 891
    goto/16 :goto_2

    .line 892
    .line 893
    :cond_11
    invoke-static {v7}, LVa/l8;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 894
    .line 895
    .line 896
    move-result-object v6

    .line 897
    new-instance v7, LVa/v8;

    .line 898
    .line 899
    sget-object v8, LVa/u8;->d:LVa/u8;

    .line 900
    .line 901
    invoke-direct {v7, v8, v6}, LVa/v8;-><init>(LVa/u8;Ljava/lang/String;)V

    .line 902
    .line 903
    .line 904
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 905
    .line 906
    .line 907
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 908
    .line 909
    .line 910
    move-result v6

    .line 911
    add-int/2addr v6, v11

    .line 912
    goto/16 :goto_6

    .line 913
    .line 914
    :cond_12
    const-wide/16 v18, 0x0

    .line 915
    .line 916
    :pswitch_4
    const/16 v8, 0x3d

    .line 917
    .line 918
    if-ne v7, v8, :cond_13

    .line 919
    .line 920
    new-instance v6, LVa/v8;

    .line 921
    .line 922
    sget-object v7, LVa/u8;->c:LVa/u8;

    .line 923
    .line 924
    new-instance v8, Ljava/lang/StringBuilder;

    .line 925
    .line 926
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 927
    .line 928
    .line 929
    invoke-virtual {v2, v5}, Ljava/lang/String;->charAt(I)C

    .line 930
    .line 931
    .line 932
    move-result v9

    .line 933
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 934
    .line 935
    .line 936
    invoke-static {v14}, Landroid/os/Process;->getGidForName(Ljava/lang/String;)I

    .line 937
    .line 938
    .line 939
    move-result v9

    .line 940
    neg-int v9, v9

    .line 941
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 942
    .line 943
    .line 944
    move-result-wide v11

    .line 945
    cmp-long v11, v11, v18

    .line 946
    .line 947
    rsub-int v11, v11, 0x9a

    .line 948
    .line 949
    invoke-static {}, Landroid/os/Process;->getElapsedCpuTime()J

    .line 950
    .line 951
    .line 952
    move-result-wide v12

    .line 953
    cmp-long v12, v12, v18

    .line 954
    .line 955
    const-string v13, "\u0000"

    .line 956
    .line 957
    invoke-static {v13, v9, v11, v12, v10}, LVa/l8;->b(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 958
    .line 959
    .line 960
    move-result-object v9

    .line 961
    invoke-virtual {v9}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 962
    .line 963
    .line 964
    move-result-object v9

    .line 965
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 966
    .line 967
    .line 968
    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 969
    .line 970
    .line 971
    move-result-object v8

    .line 972
    invoke-direct {v6, v7, v8}, LVa/v8;-><init>(LVa/u8;Ljava/lang/String;)V

    .line 973
    .line 974
    .line 975
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 976
    .line 977
    .line 978
    goto/16 :goto_7

    .line 979
    .line 980
    :cond_13
    new-instance v7, LVa/v8;

    .line 981
    .line 982
    sget-object v8, LVa/u8;->c:LVa/u8;

    .line 983
    .line 984
    new-instance v9, Ljava/lang/StringBuilder;

    .line 985
    .line 986
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 987
    .line 988
    .line 989
    invoke-virtual {v2, v5}, Ljava/lang/String;->charAt(I)C

    .line 990
    .line 991
    .line 992
    move-result v5

    .line 993
    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 994
    .line 995
    .line 996
    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 997
    .line 998
    .line 999
    move-result-object v5

    .line 1000
    invoke-direct {v7, v8, v5}, LVa/v8;-><init>(LVa/u8;Ljava/lang/String;)V

    .line 1001
    .line 1002
    .line 1003
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1004
    .line 1005
    .line 1006
    goto/16 :goto_2

    .line 1007
    .line 1008
    :cond_14
    :pswitch_5
    new-instance v7, LVa/v8;

    .line 1009
    .line 1010
    sget-object v8, LVa/u8;->c:LVa/u8;

    .line 1011
    .line 1012
    new-instance v9, Ljava/lang/StringBuilder;

    .line 1013
    .line 1014
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 1015
    .line 1016
    .line 1017
    invoke-virtual {v2, v5}, Ljava/lang/String;->charAt(I)C

    .line 1018
    .line 1019
    .line 1020
    move-result v5

    .line 1021
    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1022
    .line 1023
    .line 1024
    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1025
    .line 1026
    .line 1027
    move-result-object v5

    .line 1028
    invoke-direct {v7, v8, v5}, LVa/v8;-><init>(LVa/u8;Ljava/lang/String;)V

    .line 1029
    .line 1030
    .line 1031
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1032
    .line 1033
    .line 1034
    goto/16 :goto_2

    .line 1035
    .line 1036
    :cond_15
    sget v0, LVa/l8;->j:I

    .line 1037
    .line 1038
    add-int/lit8 v0, v0, 0x43

    .line 1039
    .line 1040
    rem-int/lit16 v0, v0, 0x80

    .line 1041
    .line 1042
    sput v0, LVa/l8;->k:I

    .line 1043
    .line 1044
    return-object v3

    .line 1045
    :pswitch_data_0
    .packed-switch 0x27
        :pswitch_3
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_2
        :pswitch_5
        :pswitch_1
        :pswitch_5
        :pswitch_0
    .end packed-switch

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
    :pswitch_data_1
    .packed-switch 0x3a
        :pswitch_5
        :pswitch_5
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method

.method public static d(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    sget v0, LVa/l8;->k:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1f

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/l8;->j:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    shr-int/2addr v0, v1

    .line 19
    const/4 v1, 0x0

    .line 20
    :goto_0
    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0

    .line 25
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    sub-int/2addr v0, v1

    .line 30
    goto :goto_0
.end method

.method public static e(Ljava/util/regex/Pattern;Ljava/lang/String;I)Ljava/lang/String;
    .locals 2

    .line 1
    sget v0, LVa/l8;->k:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0xb

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/l8;->j:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    invoke-virtual {p0, p2, v0}, Ljava/util/regex/Matcher;->region(II)Ljava/util/regex/Matcher;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->find()Z

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    if-eqz p2, :cond_0

    .line 30
    .line 31
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->start()I

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->end()I

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    invoke-virtual {p1, p2, p0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    sget p1, LVa/l8;->k:I

    .line 44
    .line 45
    add-int/lit8 p1, p1, 0x39

    .line 46
    .line 47
    rem-int/lit16 p1, p1, 0x80

    .line 48
    .line 49
    sput p1, LVa/l8;->j:I

    .line 50
    .line 51
    return-object p0

    .line 52
    :cond_0
    return-object v1

    .line 53
    :cond_1
    invoke-virtual {p0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    invoke-virtual {p0, p2, p1}, Ljava/util/regex/Matcher;->region(II)Ljava/util/regex/Matcher;

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->find()Z

    .line 65
    .line 66
    .line 67
    throw v1
.end method
