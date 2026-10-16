.class public final LVa/x;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static r:I = 0x0

.field public static s:I = 0x1


# instance fields
.field public final a:LVa/A;

.field public b:Z

.field public final c:LVa/z;

.field public final d:LVa/cb;

.field public final e:LVa/n;

.field public final f:Landroid/os/Handler;

.field public g:Z

.field public h:Z

.field public final i:Ljava/util/ArrayList;

.field public final j:Ljava/util/ArrayList;

.field public final k:Landroid/content/Context;

.field public final l:LVa/w;

.field public final m:LVa/k;

.field public final n:Ljava/lang/Thread$UncaughtExceptionHandler;

.field public o:LA7/b0;

.field public final p:Ljava/lang/String;

.field public final q:LVa/Ra;


# direct methods
.method public constructor <init>(Landroid/content/Context;LVa/H;LVa/A;ZLjava/lang/String;LVa/Ra;)V
    .locals 13

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LVa/x;->i:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, LVa/x;->j:Ljava/util/ArrayList;

    .line 17
    .line 18
    move-object/from16 v0, p6

    .line 19
    .line 20
    iput-object v0, p0, LVa/x;->q:LVa/Ra;

    .line 21
    .line 22
    invoke-static {}, Ljava/lang/Thread;->getDefaultUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iput-object v0, p0, LVa/x;->n:Ljava/lang/Thread$UncaughtExceptionHandler;

    .line 27
    .line 28
    new-instance v0, LVa/s;

    .line 29
    .line 30
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object p0, v0, LVa/s;->a:LVa/x;

    .line 34
    .line 35
    invoke-static {v0}, Ljava/lang/Thread;->setDefaultUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    .line 36
    .line 37
    .line 38
    move-object/from16 v0, p3

    .line 39
    .line 40
    iput-object v0, p0, LVa/x;->a:LVa/A;

    .line 41
    .line 42
    iput-object p1, p0, LVa/x;->k:Landroid/content/Context;

    .line 43
    .line 44
    new-instance v0, LVa/Ra;

    .line 45
    .line 46
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatDelay()I

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    shr-int/lit8 v1, v1, 0x10

    .line 51
    .line 52
    add-int/lit8 v1, v1, 0x19

    .line 53
    .line 54
    const-string v2, "\ub101\u148b\ub2a0\u04c1\u773e\uf0e2\ub2a0\u04c1\u42be\u5812\u2e9a\uaed4\u725b\uf637\u2b34\ueab9\uf962\u4835\u8cd2\u0f33\u1656\uccd7\u051b\ue04e\u6774\u506b"

    .line 55
    .line 56
    invoke-static {v2, v1}, LVa/x;->v(Ljava/lang/String;I)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    const/4 v2, 0x0

    .line 65
    invoke-static {v2, v2}, Landroid/view/View;->resolveSize(II)I

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    rsub-int/lit8 v3, v3, 0x3

    .line 70
    .line 71
    const-string v4, ""

    .line 72
    .line 73
    invoke-static {v4, v2, v2}, Landroid/text/TextUtils;->getCapsMode(Ljava/lang/CharSequence;II)I

    .line 74
    .line 75
    .line 76
    move-result v5

    .line 77
    rsub-int/lit8 v5, v5, 0x18

    .line 78
    .line 79
    invoke-static {}, Landroid/view/KeyEvent;->getMaxKeyCode()I

    .line 80
    .line 81
    .line 82
    move-result v6

    .line 83
    shr-int/lit8 v6, v6, 0x10

    .line 84
    .line 85
    add-int/lit16 v6, v6, 0x97

    .line 86
    .line 87
    const-string v7, "\u000b\u000b\u000f\u000f\uffff\u0005\u0010\u0015\u0008\ufffd\n\ufffd\uffd0\uffc9\u0010\u0001\u000e\uffff\u0001\u000f\uffc9\ufffd\u0008\t"

    .line 88
    .line 89
    const/4 v8, 0x1

    .line 90
    invoke-static {v7, v3, v5, v6, v8}, LVa/x;->B(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    invoke-direct {v0, p1, v1, v3}, LVa/Ra;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    new-instance v1, LVa/cb;

    .line 102
    .line 103
    invoke-static {v2, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 104
    .line 105
    .line 106
    move-result v3

    .line 107
    rsub-int/lit8 v3, v3, 0x5

    .line 108
    .line 109
    invoke-static {v2, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 110
    .line 111
    .line 112
    move-result v5

    .line 113
    rsub-int/lit8 v5, v5, 0x8

    .line 114
    .line 115
    invoke-static {v2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 116
    .line 117
    .line 118
    move-result v6

    .line 119
    rsub-int v6, v6, 0x95

    .line 120
    .line 121
    const-string v7, "\u0003\u0014\uffe3\ufff5\uffe6\u0011\u0012\u000c"

    .line 122
    .line 123
    invoke-static {v7, v3, v5, v6, v8}, LVa/x;->B(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v3

    .line 127
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v3

    .line 131
    invoke-static {}, Landroid/view/ViewConfiguration;->getDoubleTapTimeout()I

    .line 132
    .line 133
    .line 134
    move-result v5

    .line 135
    shr-int/lit8 v5, v5, 0x10

    .line 136
    .line 137
    rsub-int/lit8 v5, v5, 0x5

    .line 138
    .line 139
    invoke-static {}, Landroid/media/AudioTrack;->getMaxVolume()F

    .line 140
    .line 141
    .line 142
    move-result v6

    .line 143
    const/4 v7, 0x0

    .line 144
    cmpl-float v6, v6, v7

    .line 145
    .line 146
    add-int/lit8 v6, v6, 0x5

    .line 147
    .line 148
    invoke-static {v2, v2, v2}, Landroid/view/View;->resolveSizeAndState(III)I

    .line 149
    .line 150
    .line 151
    move-result v7

    .line 152
    rsub-int v7, v7, 0x95

    .line 153
    .line 154
    const-string v9, "\u0012\u000c\u0003\u0014\u0003\uffcc"

    .line 155
    .line 156
    invoke-static {v9, v5, v6, v7, v8}, LVa/x;->B(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v5

    .line 160
    invoke-virtual {v5}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v5

    .line 164
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 165
    .line 166
    .line 167
    iput-object v5, v1, LVa/cb;->b:Ljava/lang/Object;

    .line 168
    .line 169
    iput-object v3, v1, LVa/cb;->a:Ljava/lang/Object;

    .line 170
    .line 171
    iput-object v0, v1, LVa/cb;->c:Ljava/lang/Object;

    .line 172
    .line 173
    iput-object v1, p0, LVa/x;->d:LVa/cb;

    .line 174
    .line 175
    sget v1, LVa/x;->r:I

    .line 176
    .line 177
    add-int/lit8 v1, v1, 0x55

    .line 178
    .line 179
    rem-int/lit16 v1, v1, 0x80

    .line 180
    .line 181
    sput v1, LVa/x;->s:I

    .line 182
    .line 183
    invoke-static {v4, v4}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I

    .line 184
    .line 185
    .line 186
    move-result v1

    .line 187
    rsub-int/lit8 v1, v1, 0x8

    .line 188
    .line 189
    invoke-static {v2}, Landroid/os/Process;->getThreadPriority(I)I

    .line 190
    .line 191
    .line 192
    move-result v3

    .line 193
    add-int/lit8 v3, v3, 0x14

    .line 194
    .line 195
    shr-int/lit8 v3, v3, 0x6

    .line 196
    .line 197
    rsub-int/lit8 v3, v3, 0xa

    .line 198
    .line 199
    invoke-static {v4, v2}, Landroid/text/TextUtils;->getOffsetBefore(Ljava/lang/CharSequence;I)I

    .line 200
    .line 201
    .line 202
    move-result v5

    .line 203
    add-int/lit16 v5, v5, 0x96

    .line 204
    .line 205
    const-string v6, "\u0011\uffcb\u0010\u0002\u0010\u0010\uffe6\u0001\u0006\u000b"

    .line 206
    .line 207
    invoke-static {v6, v1, v3, v5, v2}, LVa/x;->B(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v1

    .line 211
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v1

    .line 215
    invoke-virtual {v0, v1}, LVa/Ra;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v1

    .line 219
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 220
    .line 221
    .line 222
    move-result v3

    .line 223
    if-nez v3, :cond_0

    .line 224
    .line 225
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 226
    .line 227
    .line 228
    move-result v1

    .line 229
    add-int/2addr v1, v8

    .line 230
    sget v3, LVa/x;->s:I

    .line 231
    .line 232
    add-int/lit8 v3, v3, 0xf

    .line 233
    .line 234
    rem-int/lit16 v3, v3, 0x80

    .line 235
    .line 236
    sput v3, LVa/x;->r:I

    .line 237
    .line 238
    goto :goto_0

    .line 239
    :cond_0
    move v1, v8

    .line 240
    :goto_0
    invoke-static {}, Landroid/view/ViewConfiguration;->getTapTimeout()I

    .line 241
    .line 242
    .line 243
    move-result v3

    .line 244
    shr-int/lit8 v3, v3, 0x10

    .line 245
    .line 246
    rsub-int/lit8 v3, v3, 0x8

    .line 247
    .line 248
    invoke-static {v4}, Landroid/text/TextUtils;->getTrimmedLength(Ljava/lang/CharSequence;)I

    .line 249
    .line 250
    .line 251
    move-result v5

    .line 252
    add-int/lit8 v5, v5, 0xa

    .line 253
    .line 254
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 255
    .line 256
    .line 257
    move-result-wide v9

    .line 258
    const-wide/16 v11, 0x0

    .line 259
    .line 260
    cmp-long v7, v9, v11

    .line 261
    .line 262
    rsub-int v7, v7, 0x97

    .line 263
    .line 264
    invoke-static {v6, v3, v5, v7, v2}, LVa/x;->B(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object v3

    .line 268
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v3

    .line 272
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object v5

    .line 276
    invoke-virtual {v0, v3, v5}, LVa/Ra;->r(Ljava/lang/String;Ljava/lang/String;)V

    .line 277
    .line 278
    .line 279
    new-instance v3, LVa/n;

    .line 280
    .line 281
    invoke-static {v0}, LVa/x;->A(LVa/Ra;)Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object v0

    .line 285
    invoke-static {}, LVa/G;->S()LVa/G;

    .line 286
    .line 287
    .line 288
    move-result-object v5

    .line 289
    invoke-virtual {v5}, LVa/G;->F()J

    .line 290
    .line 291
    .line 292
    move-result-wide v5

    .line 293
    invoke-direct {v3, p1, p2, v5, v6}, LVa/lb;-><init>(Landroid/content/Context;LVa/H;J)V

    .line 294
    .line 295
    .line 296
    iput v1, v3, LVa/n;->h:I

    .line 297
    .line 298
    iput v2, v3, LVa/n;->i:I

    .line 299
    .line 300
    iput v8, v3, LVa/n;->j:I

    .line 301
    .line 302
    iput-object v0, v3, LVa/n;->g:Ljava/lang/String;

    .line 303
    .line 304
    new-instance v0, Landroid/os/HandlerThread;

    .line 305
    .line 306
    invoke-static {v4, v2}, Landroid/text/TextUtils;->getOffsetAfter(Ljava/lang/CharSequence;I)I

    .line 307
    .line 308
    .line 309
    move-result v5

    .line 310
    add-int/lit16 v5, v5, 0x495a

    .line 311
    .line 312
    int-to-char v5, v5

    .line 313
    invoke-static {v4}, Landroid/os/Process;->getGidForName(Ljava/lang/String;)I

    .line 314
    .line 315
    .line 316
    move-result v4

    .line 317
    add-int/2addr v4, v8

    .line 318
    invoke-static {v2, v2}, Landroid/widget/ExpandableListView;->getPackedPositionForChild(II)J

    .line 319
    .line 320
    .line 321
    move-result-wide v6

    .line 322
    cmp-long v6, v6, v11

    .line 323
    .line 324
    rsub-int/lit8 v6, v6, 0x16

    .line 325
    .line 326
    invoke-static {v4, v6, v5}, LVa/n;->e(IIC)Ljava/lang/String;

    .line 327
    .line 328
    .line 329
    move-result-object v4

    .line 330
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 331
    .line 332
    .line 333
    move-result-object v4

    .line 334
    invoke-direct {v0, v4}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 335
    .line 336
    .line 337
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 338
    .line 339
    .line 340
    new-instance v4, Landroid/os/Handler;

    .line 341
    .line 342
    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 343
    .line 344
    .line 345
    move-result-object v0

    .line 346
    invoke-direct {v4, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 347
    .line 348
    .line 349
    iput-object v4, v3, LVa/n;->k:Landroid/os/Handler;

    .line 350
    .line 351
    iput-object v3, p0, LVa/x;->e:LVa/n;

    .line 352
    .line 353
    new-instance v0, LVa/z;

    .line 354
    .line 355
    invoke-direct {v0, p1}, LVa/z;-><init>(Landroid/content/Context;)V

    .line 356
    .line 357
    .line 358
    iput-object v0, p0, LVa/x;->c:LVa/z;

    .line 359
    .line 360
    iput-boolean v2, p0, LVa/x;->b:Z

    .line 361
    .line 362
    new-instance p1, Landroid/os/HandlerThread;

    .line 363
    .line 364
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 365
    .line 366
    .line 367
    move-result v3

    .line 368
    shr-int/lit8 v3, v3, 0x16

    .line 369
    .line 370
    rsub-int/lit8 v3, v3, 0xe

    .line 371
    .line 372
    const-string v4, "\u7826\u38a2\ue6f5\u963f\u4e1c\ua8a7\u395f\ud29d\u59a3\ua917\ue55d\uc231\u4275\u410d"

    .line 373
    .line 374
    invoke-static {v4, v3}, LVa/x;->v(Ljava/lang/String;I)Ljava/lang/String;

    .line 375
    .line 376
    .line 377
    move-result-object v3

    .line 378
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 379
    .line 380
    .line 381
    move-result-object v3

    .line 382
    invoke-direct {p1, v3}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 383
    .line 384
    .line 385
    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    .line 386
    .line 387
    .line 388
    new-instance v3, Landroid/os/Handler;

    .line 389
    .line 390
    invoke-virtual {p1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 391
    .line 392
    .line 393
    move-result-object p1

    .line 394
    invoke-direct {v3, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 395
    .line 396
    .line 397
    iput-object v3, p0, LVa/x;->f:Landroid/os/Handler;

    .line 398
    .line 399
    new-instance p1, LVa/k;

    .line 400
    .line 401
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 402
    .line 403
    .line 404
    const/4 v3, 0x0

    .line 405
    iput-object v3, p1, LVa/k;->a:Ljava/lang/Boolean;

    .line 406
    .line 407
    iput v1, p1, LVa/k;->f:I

    .line 408
    .line 409
    invoke-static {}, LVa/G;->S()LVa/G;

    .line 410
    .line 411
    .line 412
    move-result-object v1

    .line 413
    new-instance v3, LVa/j;

    .line 414
    .line 415
    const/4 v4, 0x0

    .line 416
    invoke-direct {v3, v4}, LVa/j;-><init>(I)V

    .line 417
    .line 418
    .line 419
    iput-object p1, v3, LVa/j;->b:Ljava/lang/Object;

    .line 420
    .line 421
    invoke-virtual {v1, v3}, LVa/G;->Z(LVa/X;)V

    .line 422
    .line 423
    .line 424
    iput-object p1, p0, LVa/x;->m:LVa/k;

    .line 425
    .line 426
    xor-int/lit8 p1, p4, 0x1

    .line 427
    .line 428
    iput-boolean p1, p0, LVa/x;->g:Z

    .line 429
    .line 430
    move-object/from16 p1, p5

    .line 431
    .line 432
    iput-object p1, p0, LVa/x;->p:Ljava/lang/String;

    .line 433
    .line 434
    invoke-virtual {p0, v8}, LVa/x;->n(Z)V

    .line 435
    .line 436
    .line 437
    new-instance p1, LVa/w;

    .line 438
    .line 439
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 440
    .line 441
    .line 442
    iput-object p0, p1, LVa/w;->a:LVa/x;

    .line 443
    .line 444
    iput-object p1, p0, LVa/x;->l:LVa/w;

    .line 445
    .line 446
    invoke-virtual {v0}, LVa/z;->a()LVa/Ea;

    .line 447
    .line 448
    .line 449
    move-result-object p1

    .line 450
    iget-object v0, p0, LVa/x;->l:LVa/w;

    .line 451
    .line 452
    invoke-virtual {p1, v0}, LVa/Ea;->d(LVa/za;)V

    .line 453
    .line 454
    .line 455
    new-instance p1, LA7/b0;

    .line 456
    .line 457
    new-instance v0, LVa/p;

    .line 458
    .line 459
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 460
    .line 461
    .line 462
    iput-object p0, v0, LVa/p;->a:LVa/x;

    .line 463
    .line 464
    invoke-direct {p1, v0}, LA7/b0;-><init>(LVa/jb;)V

    .line 465
    .line 466
    .line 467
    iput-object p1, p0, LVa/x;->o:LA7/b0;

    .line 468
    .line 469
    invoke-static {}, LVa/fb;->e()LVa/fb;

    .line 470
    .line 471
    .line 472
    move-result-object p1

    .line 473
    new-instance v0, LVa/q;

    .line 474
    .line 475
    const/4 v1, 0x0

    .line 476
    invoke-direct {v0, v1}, LVa/q;-><init>(I)V

    .line 477
    .line 478
    .line 479
    iput-object p0, v0, LVa/q;->b:Ljava/lang/Object;

    .line 480
    .line 481
    invoke-virtual {p1, v0}, LVa/fb;->f(LVa/db;)V

    .line 482
    .line 483
    .line 484
    invoke-static {}, LVa/G;->S()LVa/G;

    .line 485
    .line 486
    .line 487
    move-result-object p1

    .line 488
    new-instance v0, LVa/j;

    .line 489
    .line 490
    const/4 v1, 0x2

    .line 491
    invoke-direct {v0, v1}, LVa/j;-><init>(I)V

    .line 492
    .line 493
    .line 494
    iput-object p0, v0, LVa/j;->b:Ljava/lang/Object;

    .line 495
    .line 496
    invoke-virtual {p1, v0}, LVa/G;->Z(LVa/X;)V

    .line 497
    .line 498
    .line 499
    sget p1, LVa/x;->r:I

    .line 500
    .line 501
    add-int/lit8 p1, p1, 0x4f

    .line 502
    .line 503
    rem-int/lit16 v0, p1, 0x80

    .line 504
    .line 505
    sput v0, LVa/x;->s:I

    .line 506
    .line 507
    rem-int/lit8 p1, p1, 0x2

    .line 508
    .line 509
    if-nez p1, :cond_1

    .line 510
    .line 511
    const/16 p1, 0x31

    .line 512
    .line 513
    div-int/2addr p1, v2

    .line 514
    :cond_1
    return-void
.end method

.method public static A(LVa/Ra;)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-static {}, Landroid/view/ViewConfiguration;->getTapTimeout()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    shr-int/lit8 v0, v0, 0x10

    .line 6
    .line 7
    add-int/lit8 v0, v0, 0x10

    .line 8
    .line 9
    const-string v1, "\u860c\udb48\ua748\u8e67\u98bb\u56e5\ufd48\u4462\u3ea0\u527b\u9739\ua7cc\u1d60\uc08e\uc5fb\u1cff"

    .line 10
    .line 11
    invoke-static {v1, v0}, LVa/x;->v(Ljava/lang/String;I)Ljava/lang/String;

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
    invoke-virtual {p0, v0}, LVa/Ra;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    sget v0, LVa/x;->r:I

    .line 30
    .line 31
    add-int/lit8 v0, v0, 0x31

    .line 32
    .line 33
    rem-int/lit16 v0, v0, 0x80

    .line 34
    .line 35
    sput v0, LVa/x;->s:I

    .line 36
    .line 37
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-static {}, Landroid/view/KeyEvent;->getModifierMetaStateMask()I

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    int-to-byte v2, v2

    .line 50
    add-int/lit8 v2, v2, 0x11

    .line 51
    .line 52
    invoke-static {v1, v2}, LVa/x;->v(Ljava/lang/String;I)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-virtual {p0, v1, v0}, LVa/Ra;->r(Ljava/lang/String;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    sget p0, LVa/x;->s:I

    .line 64
    .line 65
    add-int/lit8 p0, p0, 0x15

    .line 66
    .line 67
    rem-int/lit16 p0, p0, 0x80

    .line 68
    .line 69
    sput p0, LVa/x;->r:I

    .line 70
    .line 71
    :cond_0
    return-object v0
.end method

.method public static B(Ljava/lang/String;IIIZ)Ljava/lang/String;
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
    new-array v1, p2, [C

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
    if-ge v3, p2, :cond_0

    .line 18
    .line 19
    aget-char v4, p0, v3

    .line 20
    .line 21
    add-int/2addr v4, p3

    .line 22
    int-to-char v4, v4

    .line 23
    aput-char v4, v1, v3

    .line 24
    .line 25
    add-int/lit8 v4, v4, -0x33

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
    if-lez p1, :cond_1

    .line 38
    .line 39
    sput p1, LVa/Ab;->w:I

    .line 40
    .line 41
    new-array p0, p2, [C

    .line 42
    .line 43
    invoke-static {v1, v2, p0, v2, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 44
    .line 45
    .line 46
    sget p1, LVa/Ab;->w:I

    .line 47
    .line 48
    sub-int p3, p2, p1

    .line 49
    .line 50
    invoke-static {p0, v2, v1, p3, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 51
    .line 52
    .line 53
    sget p1, LVa/Ab;->w:I

    .line 54
    .line 55
    sub-int p3, p2, p1

    .line 56
    .line 57
    invoke-static {p0, p1, v1, v2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 58
    .line 59
    .line 60
    :cond_1
    if-eqz p4, :cond_3

    .line 61
    .line 62
    new-array p0, p2, [C

    .line 63
    .line 64
    sput v2, LVa/Ab;->v:I

    .line 65
    .line 66
    :goto_1
    sget p1, LVa/Ab;->v:I

    .line 67
    .line 68
    if-ge p1, p2, :cond_2

    .line 69
    .line 70
    sub-int p3, p2, p1

    .line 71
    .line 72
    add-int/lit8 p3, p3, -0x1

    .line 73
    .line 74
    aget-char p3, v1, p3

    .line 75
    .line 76
    aput-char p3, p0, p1

    .line 77
    .line 78
    add-int/lit8 p1, p1, 0x1

    .line 79
    .line 80
    sput p1, LVa/Ab;->v:I

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

.method public static synthetic D(LVa/x;)V
    .locals 1

    .line 1
    sget v0, LVa/x;->r:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x17

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/x;->s:I

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-virtual {p0, v0}, LVa/x;->n(Z)V

    .line 11
    .line 12
    .line 13
    sget p0, LVa/x;->r:I

    .line 14
    .line 15
    add-int/lit8 p0, p0, 0x31

    .line 16
    .line 17
    rem-int/lit16 v0, p0, 0x80

    .line 18
    .line 19
    sput v0, LVa/x;->s:I

    .line 20
    .line 21
    rem-int/lit8 p0, p0, 0x2

    .line 22
    .line 23
    if-eqz p0, :cond_0

    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    const/4 p0, 0x0

    .line 27
    throw p0
.end method

.method public static synthetic f(LVa/x;)V
    .locals 1

    .line 1
    sget v0, LVa/x;->s:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x75

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/x;->r:I

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-virtual {p0, v0}, LVa/x;->y(Z)V

    .line 11
    .line 12
    .line 13
    sget p0, LVa/x;->s:I

    .line 14
    .line 15
    add-int/lit8 p0, p0, 0x1f

    .line 16
    .line 17
    rem-int/lit16 p0, p0, 0x80

    .line 18
    .line 19
    sput p0, LVa/x;->r:I

    .line 20
    .line 21
    return-void
.end method

.method public static synthetic g(LVa/x;)V
    .locals 2

    .line 1
    sget v0, LVa/x;->r:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x59

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/x;->s:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    invoke-virtual {p0}, LVa/x;->d()V

    .line 12
    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    sget p0, LVa/x;->s:I

    .line 17
    .line 18
    add-int/lit8 p0, p0, 0x29

    .line 19
    .line 20
    rem-int/lit16 p0, p0, 0x80

    .line 21
    .line 22
    sput p0, LVa/x;->r:I

    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    const/4 p0, 0x0

    .line 26
    throw p0
.end method

.method public static synthetic o(LVa/x;)LVa/Ra;
    .locals 2

    .line 1
    sget v0, LVa/x;->r:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x3b

    .line 4
    .line 5
    rem-int/lit16 v1, v1, 0x80

    .line 6
    .line 7
    sput v1, LVa/x;->s:I

    .line 8
    .line 9
    iget-object p0, p0, LVa/x;->q:LVa/Ra;

    .line 10
    .line 11
    add-int/lit8 v0, v0, 0x39

    .line 12
    .line 13
    rem-int/lit16 v1, v0, 0x80

    .line 14
    .line 15
    sput v1, LVa/x;->s:I

    .line 16
    .line 17
    rem-int/lit8 v0, v0, 0x2

    .line 18
    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    const/16 v0, 0x40

    .line 22
    .line 23
    div-int/lit8 v0, v0, 0x0

    .line 24
    .line 25
    :cond_0
    return-object p0
.end method

.method public static synthetic t(LVa/x;)LVa/k;
    .locals 2

    .line 1
    sget v0, LVa/x;->s:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x39

    .line 4
    .line 5
    rem-int/lit16 v1, v1, 0x80

    .line 6
    .line 7
    sput v1, LVa/x;->r:I

    .line 8
    .line 9
    iget-object p0, p0, LVa/x;->m:LVa/k;

    .line 10
    .line 11
    add-int/lit8 v0, v0, 0x2b

    .line 12
    .line 13
    rem-int/lit16 v1, v0, 0x80

    .line 14
    .line 15
    sput v1, LVa/x;->r:I

    .line 16
    .line 17
    rem-int/lit8 v0, v0, 0x2

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    const/4 v0, 0x5

    .line 22
    div-int/lit8 v0, v0, 0x0

    .line 23
    .line 24
    :cond_0
    return-object p0
.end method

.method public static v(Ljava/lang/String;I)Ljava/lang/String;
    .locals 12

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
    sget-object v0, LVa/Ab;->F:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v0

    .line 10
    :try_start_0
    array-length v1, p0

    .line 11
    new-array v1, v1, [C

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    sput v2, LVa/Ab;->E:I

    .line 15
    .line 16
    const/4 v3, 0x2

    .line 17
    new-array v3, v3, [C

    .line 18
    .line 19
    :goto_0
    sget v4, LVa/Ab;->E:I

    .line 20
    .line 21
    array-length v5, p0

    .line 22
    if-ge v4, v5, :cond_1

    .line 23
    .line 24
    aget-char v5, p0, v4

    .line 25
    .line 26
    aput-char v5, v3, v2

    .line 27
    .line 28
    add-int/lit8 v4, v4, 0x1

    .line 29
    .line 30
    aget-char v4, p0, v4

    .line 31
    .line 32
    const/4 v5, 0x1

    .line 33
    aput-char v4, v3, v5

    .line 34
    .line 35
    const v4, 0xe370

    .line 36
    .line 37
    .line 38
    move v6, v2

    .line 39
    :goto_1
    const/16 v7, 0x10

    .line 40
    .line 41
    if-ge v6, v7, :cond_0

    .line 42
    .line 43
    aget-char v7, v3, v5

    .line 44
    .line 45
    aget-char v8, v3, v2

    .line 46
    .line 47
    add-int v9, v8, v4

    .line 48
    .line 49
    shl-int/lit8 v10, v8, 0x4

    .line 50
    .line 51
    add-int/lit16 v10, v10, 0x2c79

    .line 52
    .line 53
    xor-int/2addr v9, v10

    .line 54
    ushr-int/lit8 v10, v8, 0x5

    .line 55
    .line 56
    add-int/lit16 v10, v10, 0x4a48

    .line 57
    .line 58
    xor-int/2addr v9, v10

    .line 59
    sub-int/2addr v7, v9

    .line 60
    int-to-char v7, v7

    .line 61
    aput-char v7, v3, v5

    .line 62
    .line 63
    add-int v9, v7, v4

    .line 64
    .line 65
    shl-int/lit8 v10, v7, 0x4

    .line 66
    .line 67
    const v11, 0xed3f

    .line 68
    .line 69
    .line 70
    add-int/2addr v10, v11

    .line 71
    xor-int/2addr v9, v10

    .line 72
    ushr-int/lit8 v7, v7, 0x5

    .line 73
    .line 74
    add-int/lit16 v7, v7, 0x7f86

    .line 75
    .line 76
    xor-int/2addr v7, v9

    .line 77
    sub-int/2addr v8, v7

    .line 78
    int-to-char v7, v8

    .line 79
    aput-char v7, v3, v2

    .line 80
    .line 81
    const v7, 0x9e37

    .line 82
    .line 83
    .line 84
    sub-int/2addr v4, v7

    .line 85
    add-int/lit8 v6, v6, 0x1

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :catchall_0
    move-exception p0

    .line 89
    goto :goto_2

    .line 90
    :cond_0
    sget v4, LVa/Ab;->E:I

    .line 91
    .line 92
    aget-char v6, v3, v2

    .line 93
    .line 94
    aput-char v6, v1, v4

    .line 95
    .line 96
    add-int/lit8 v6, v4, 0x1

    .line 97
    .line 98
    aget-char v5, v3, v5

    .line 99
    .line 100
    aput-char v5, v1, v6

    .line 101
    .line 102
    add-int/lit8 v4, v4, 0x2

    .line 103
    .line 104
    sput v4, LVa/Ab;->E:I

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_1
    new-instance p0, Ljava/lang/String;

    .line 108
    .line 109
    invoke-direct {p0, v1, v2, p1}, Ljava/lang/String;-><init>([CII)V

    .line 110
    .line 111
    .line 112
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 113
    return-object p0

    .line 114
    :goto_2
    monitor-exit v0

    .line 115
    throw p0
.end method


# virtual methods
.method public final C(I)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, LVa/x;->f:Landroid/os/Handler;

    .line 3
    .line 4
    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    new-instance v0, LVa/u;

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    invoke-direct {v0, v2}, LVa/u;-><init>(I)V

    .line 11
    .line 12
    .line 13
    iput-object p0, v0, LVa/u;->d:LVa/x;

    .line 14
    .line 15
    int-to-long v2, p1

    .line 16
    invoke-virtual {v1, v0, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 17
    .line 18
    .line 19
    sget p1, LVa/x;->s:I

    .line 20
    .line 21
    add-int/lit8 p1, p1, 0x6d

    .line 22
    .line 23
    rem-int/lit16 p1, p1, 0x80

    .line 24
    .line 25
    sput p1, LVa/x;->r:I

    .line 26
    .line 27
    return-void
.end method

.method public final declared-synchronized E(LVa/Db;)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget v0, LVa/x;->s:I

    .line 3
    .line 4
    add-int/lit8 v0, v0, 0x61

    .line 5
    .line 6
    rem-int/lit16 v0, v0, 0x80

    .line 7
    .line 8
    sput v0, LVa/x;->r:I

    .line 9
    .line 10
    iget-object v0, p0, LVa/x;->j:Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    sget p1, LVa/x;->r:I

    .line 16
    .line 17
    add-int/lit8 p1, p1, 0x7

    .line 18
    .line 19
    rem-int/lit16 p1, p1, 0x80

    .line 20
    .line 21
    sput p1, LVa/x;->s:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    monitor-exit p0

    .line 24
    return-void

    .line 25
    :catchall_0
    move-exception p1

    .line 26
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 27
    throw p1
.end method

.method public final F(Lorg/json/JSONObject;LVa/v;)V
    .locals 11

    .line 1
    invoke-virtual {p0}, LVa/x;->c()LVa/D;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, v0, LVa/Mb;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, LVa/W;

    .line 8
    .line 9
    iget-object v1, v1, LVa/W;->d:Lorg/json/JSONObject;

    .line 10
    .line 11
    const-string v2, ""

    .line 12
    .line 13
    const/16 v3, 0x30

    .line 14
    .line 15
    const/4 v4, 0x0

    .line 16
    invoke-static {v2, v3, v4, v4}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CII)I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    rsub-int/lit8 v2, v2, 0x2

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    invoke-static {v4, v3, v3}, Landroid/util/TypedValue;->complexToFraction(IFF)F

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    cmpl-float v5, v5, v3

    .line 28
    .line 29
    rsub-int v5, v5, 0xc9

    .line 30
    .line 31
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollDefaultDelay()I

    .line 32
    .line 33
    .line 34
    move-result v6

    .line 35
    shr-int/lit8 v6, v6, 0x10

    .line 36
    .line 37
    add-int/lit8 v6, v6, 0x2

    .line 38
    .line 39
    const-string v7, "\u0004\ufff6\u0008"

    .line 40
    .line 41
    const/4 v8, 0x1

    .line 42
    invoke-static {v7, v2, v5, v6, v8}, LVa/W;->c(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    new-instance v5, Ljava/util/ArrayList;

    .line 51
    .line 52
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 53
    .line 54
    .line 55
    invoke-static {v1, v2, v5}, LVa/Ab;->V(Lorg/json/JSONObject;Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    sget v2, LVa/W;->h:I

    .line 60
    .line 61
    add-int/lit8 v2, v2, 0x3

    .line 62
    .line 63
    rem-int/lit16 v2, v2, 0x80

    .line 64
    .line 65
    sput v2, LVa/W;->g:I

    .line 66
    .line 67
    invoke-virtual {v0}, LVa/Mb;->e()Lorg/json/JSONObject;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-static {}, Landroid/os/SystemClock;->currentThreadTimeMillis()J

    .line 72
    .line 73
    .line 74
    move-result-wide v5

    .line 75
    const-wide/16 v9, -0x1

    .line 76
    .line 77
    cmp-long v2, v5, v9

    .line 78
    .line 79
    rsub-int v2, v2, 0x80

    .line 80
    .line 81
    const-string v5, "\u008f\u0084\u008e"

    .line 82
    .line 83
    invoke-static {v2, v5}, LVa/D;->y(ILjava/lang/String;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    new-instance v5, Ljava/util/ArrayList;

    .line 92
    .line 93
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 94
    .line 95
    .line 96
    invoke-static {v0, v2, v5}, LVa/Ab;->V(Lorg/json/JSONObject;Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-interface {v1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 101
    .line 102
    .line 103
    sget v0, LVa/D;->i:I

    .line 104
    .line 105
    add-int/lit8 v0, v0, 0x2f

    .line 106
    .line 107
    rem-int/lit16 v2, v0, 0x80

    .line 108
    .line 109
    sput v2, LVa/D;->j:I

    .line 110
    .line 111
    rem-int/lit8 v0, v0, 0x2

    .line 112
    .line 113
    const/4 v2, 0x0

    .line 114
    if-eqz v0, :cond_8

    .line 115
    .line 116
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    sget v1, LVa/x;->s:I

    .line 121
    .line 122
    add-int/lit8 v1, v1, 0x3d

    .line 123
    .line 124
    rem-int/lit16 v1, v1, 0x80

    .line 125
    .line 126
    sput v1, LVa/x;->r:I

    .line 127
    .line 128
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 129
    .line 130
    .line 131
    move-result v1

    .line 132
    if-eqz v1, :cond_0

    .line 133
    .line 134
    sget v1, LVa/x;->r:I

    .line 135
    .line 136
    add-int/lit8 v1, v1, 0x21

    .line 137
    .line 138
    rem-int/lit16 v1, v1, 0x80

    .line 139
    .line 140
    sput v1, LVa/x;->s:I

    .line 141
    .line 142
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    check-cast v1, Ljava/lang/String;

    .line 147
    .line 148
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    goto :goto_0

    .line 152
    :cond_0
    new-instance v0, LVa/l;

    .line 153
    .line 154
    new-instance v1, LVa/Sa;

    .line 155
    .line 156
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 157
    .line 158
    .line 159
    move-result-object v5

    .line 160
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v5

    .line 164
    invoke-direct {v1, p1, v5}, LVa/Sa;-><init>(Lorg/json/JSONObject;Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    sget v5, LVa/cb;->k:I

    .line 168
    .line 169
    add-int/lit8 v5, v5, 0x6f

    .line 170
    .line 171
    rem-int/lit16 v5, v5, 0x80

    .line 172
    .line 173
    sput v5, LVa/cb;->l:I

    .line 174
    .line 175
    invoke-direct {v0, v1}, LVa/l;-><init>(LVa/Sa;)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {p0}, LVa/x;->c()LVa/D;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    invoke-static {}, LVa/G;->S()LVa/G;

    .line 186
    .line 187
    .line 188
    move-result-object v5

    .line 189
    invoke-virtual {v5}, LVa/G;->P()Z

    .line 190
    .line 191
    .line 192
    move-result v5

    .line 193
    if-eqz v5, :cond_4

    .line 194
    .line 195
    sget v5, LVa/D;->i:I

    .line 196
    .line 197
    add-int/lit8 v5, v5, 0x15

    .line 198
    .line 199
    rem-int/lit16 v6, v5, 0x80

    .line 200
    .line 201
    sput v6, LVa/D;->j:I

    .line 202
    .line 203
    rem-int/lit8 v5, v5, 0x2

    .line 204
    .line 205
    const-string v6, "\ubbcd\u0768\u59fc\u8ca2"

    .line 206
    .line 207
    const-string v7, "\u0b61\ub13c\u4969\u278f"

    .line 208
    .line 209
    const v9, 0x8f49

    .line 210
    .line 211
    .line 212
    if-nez v5, :cond_1

    .line 213
    .line 214
    invoke-virtual {v1}, LVa/Mb;->e()Lorg/json/JSONObject;

    .line 215
    .line 216
    .line 217
    move-result-object v3

    .line 218
    invoke-static {v4}, Landroid/util/TypedValue;->complexToFloat(I)F

    .line 219
    .line 220
    .line 221
    move-result v5

    .line 222
    const/high16 v10, 0x40000000    # 2.0f

    .line 223
    .line 224
    cmpl-float v5, v5, v10

    .line 225
    .line 226
    ushr-int v5, v9, v5

    .line 227
    .line 228
    int-to-char v5, v5

    .line 229
    invoke-static {v4, v4, v8, v8}, Landroid/graphics/Color;->argb(IIII)I

    .line 230
    .line 231
    .line 232
    move-result v9

    .line 233
    invoke-static {v5, v7, v6, v9}, LVa/D;->u(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v5

    .line 237
    invoke-virtual {v5}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v5

    .line 241
    invoke-virtual {v3, v5, v8}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 242
    .line 243
    .line 244
    move-result v3

    .line 245
    goto :goto_1

    .line 246
    :cond_1
    invoke-virtual {v1}, LVa/Mb;->e()Lorg/json/JSONObject;

    .line 247
    .line 248
    .line 249
    move-result-object v5

    .line 250
    invoke-static {v4}, Landroid/util/TypedValue;->complexToFloat(I)F

    .line 251
    .line 252
    .line 253
    move-result v10

    .line 254
    cmpl-float v3, v10, v3

    .line 255
    .line 256
    add-int/2addr v3, v9

    .line 257
    int-to-char v3, v3

    .line 258
    invoke-static {v4, v4, v4, v4}, Landroid/graphics/Color;->argb(IIII)I

    .line 259
    .line 260
    .line 261
    move-result v9

    .line 262
    invoke-static {v3, v7, v6, v9}, LVa/D;->u(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v3

    .line 266
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v3

    .line 270
    invoke-virtual {v5, v3, v4}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 271
    .line 272
    .line 273
    move-result v3

    .line 274
    :goto_1
    sget v5, LVa/D;->j:I

    .line 275
    .line 276
    add-int/lit8 v6, v5, 0x63

    .line 277
    .line 278
    rem-int/lit16 v7, v6, 0x80

    .line 279
    .line 280
    sput v7, LVa/D;->i:I

    .line 281
    .line 282
    rem-int/lit8 v6, v6, 0x2

    .line 283
    .line 284
    if-nez v6, :cond_3

    .line 285
    .line 286
    if-eqz v3, :cond_4

    .line 287
    .line 288
    add-int/lit8 v5, v5, 0x37

    .line 289
    .line 290
    rem-int/lit16 v3, v5, 0x80

    .line 291
    .line 292
    sput v3, LVa/D;->i:I

    .line 293
    .line 294
    rem-int/lit8 v5, v5, 0x2

    .line 295
    .line 296
    const-string v3, "\u0086\u0089\u0087\u008d\u008c\u008b\u008a"

    .line 297
    .line 298
    const v6, 0xf4240

    .line 299
    .line 300
    .line 301
    invoke-virtual {v1}, LVa/Mb;->e()Lorg/json/JSONObject;

    .line 302
    .line 303
    .line 304
    move-result-object v1

    .line 305
    if-eqz v5, :cond_2

    .line 306
    .line 307
    invoke-static {v8}, Landroid/graphics/Color;->blue(I)I

    .line 308
    .line 309
    .line 310
    move-result v5

    .line 311
    add-int/lit8 v5, v5, 0x50

    .line 312
    .line 313
    :goto_2
    invoke-static {v5, v3}, LVa/D;->y(ILjava/lang/String;)Ljava/lang/String;

    .line 314
    .line 315
    .line 316
    move-result-object v3

    .line 317
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 318
    .line 319
    .line 320
    move-result-object v3

    .line 321
    invoke-virtual {v1, v3, v6}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 322
    .line 323
    .line 324
    move-result v1

    .line 325
    goto :goto_3

    .line 326
    :cond_2
    invoke-static {v4}, Landroid/graphics/Color;->blue(I)I

    .line 327
    .line 328
    .line 329
    move-result v5

    .line 330
    add-int/lit8 v5, v5, 0x7f

    .line 331
    .line 332
    goto :goto_2

    .line 333
    :goto_3
    sget v3, LVa/D;->j:I

    .line 334
    .line 335
    add-int/lit8 v3, v3, 0xd

    .line 336
    .line 337
    rem-int/lit16 v3, v3, 0x80

    .line 338
    .line 339
    sput v3, LVa/D;->i:I

    .line 340
    .line 341
    goto :goto_4

    .line 342
    :cond_3
    throw v2

    .line 343
    :cond_4
    invoke-virtual {v1}, LVa/Mb;->e()Lorg/json/JSONObject;

    .line 344
    .line 345
    .line 346
    move-result-object v1

    .line 347
    const-string v3, ""

    .line 348
    .line 349
    invoke-static {v3, v4, v4}, Landroid/text/TextUtils;->getCapsMode(Ljava/lang/CharSequence;II)I

    .line 350
    .line 351
    .line 352
    move-result v3

    .line 353
    add-int/lit8 v3, v3, 0x7f

    .line 354
    .line 355
    const-string v5, "\u0086\u0089\u0087"

    .line 356
    .line 357
    invoke-static {v3, v5}, LVa/D;->y(ILjava/lang/String;)Ljava/lang/String;

    .line 358
    .line 359
    .line 360
    move-result-object v3

    .line 361
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 362
    .line 363
    .line 364
    move-result-object v3

    .line 365
    const/16 v5, 0x267a

    .line 366
    .line 367
    invoke-virtual {v1, v3, v5}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 368
    .line 369
    .line 370
    move-result v1

    .line 371
    sget v3, LVa/D;->i:I

    .line 372
    .line 373
    add-int/lit8 v3, v3, 0xb

    .line 374
    .line 375
    rem-int/lit16 v3, v3, 0x80

    .line 376
    .line 377
    sput v3, LVa/D;->j:I

    .line 378
    .line 379
    :goto_4
    monitor-enter v0

    .line 380
    :try_start_0
    sget v3, LVa/l;->c:I

    .line 381
    .line 382
    add-int/lit8 v5, v3, 0x53

    .line 383
    .line 384
    rem-int/lit16 v6, v5, 0x80

    .line 385
    .line 386
    sput v6, LVa/l;->b:I

    .line 387
    .line 388
    rem-int/lit8 v5, v5, 0x2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 389
    .line 390
    if-eqz v5, :cond_5

    .line 391
    .line 392
    const/16 v5, 0x61

    .line 393
    .line 394
    :try_start_1
    div-int/2addr v5, v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 395
    goto :goto_5

    .line 396
    :catchall_0
    move-exception p1

    .line 397
    :try_start_2
    throw p1

    .line 398
    :catchall_1
    move-exception p1

    .line 399
    goto :goto_7

    .line 400
    :cond_5
    :goto_5
    add-int/lit8 v3, v3, 0x7d

    .line 401
    .line 402
    rem-int/lit16 v4, v3, 0x80

    .line 403
    .line 404
    sput v4, LVa/l;->b:I

    .line 405
    .line 406
    rem-int/lit8 v3, v3, 0x2

    .line 407
    .line 408
    if-eqz v3, :cond_6

    .line 409
    .line 410
    sget-object v3, LVa/sa;->K:Ljava/lang/String;

    .line 411
    .line 412
    filled-new-array {v3}, [Ljava/lang/String;

    .line 413
    .line 414
    .line 415
    move-result-object v3

    .line 416
    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 417
    .line 418
    .line 419
    move-result-object v3

    .line 420
    goto :goto_6

    .line 421
    :cond_6
    sget-object v3, LVa/sa;->K:Ljava/lang/String;

    .line 422
    .line 423
    filled-new-array {v3}, [Ljava/lang/String;

    .line 424
    .line 425
    .line 426
    move-result-object v3

    .line 427
    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 428
    .line 429
    .line 430
    move-result-object v3

    .line 431
    :goto_6
    invoke-static {v3, v1, p1}, LVa/Ab;->q(Ljava/util/List;ILorg/json/JSONObject;)V

    .line 432
    .line 433
    .line 434
    sget p1, LVa/l;->b:I

    .line 435
    .line 436
    add-int/lit8 p1, p1, 0x55

    .line 437
    .line 438
    rem-int/lit16 v1, p1, 0x80

    .line 439
    .line 440
    sput v1, LVa/l;->c:I

    .line 441
    .line 442
    rem-int/lit8 p1, p1, 0x2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 443
    .line 444
    if-eqz p1, :cond_7

    .line 445
    .line 446
    monitor-exit v0

    .line 447
    iget-object p1, p0, LVa/x;->d:LVa/cb;

    .line 448
    .line 449
    invoke-virtual {v0}, LVa/l;->d()LVa/Sa;

    .line 450
    .line 451
    .line 452
    move-result-object v1

    .line 453
    invoke-virtual {p1, v1, p2}, LVa/cb;->t(LVa/Sa;LVa/v;)V

    .line 454
    .line 455
    .line 456
    invoke-virtual {v0}, LVa/l;->j()Lorg/json/JSONObject;

    .line 457
    .line 458
    .line 459
    move-result-object p1

    .line 460
    invoke-virtual {p0, p1}, LVa/x;->m(Lorg/json/JSONObject;)V

    .line 461
    .line 462
    .line 463
    invoke-static {p2}, LVa/Cb;->g(LVa/Ba;)V

    .line 464
    .line 465
    .line 466
    sget p1, LVa/x;->r:I

    .line 467
    .line 468
    add-int/lit8 p1, p1, 0x7b

    .line 469
    .line 470
    rem-int/lit16 p1, p1, 0x80

    .line 471
    .line 472
    sput p1, LVa/x;->s:I

    .line 473
    .line 474
    return-void

    .line 475
    :cond_7
    :try_start_3
    throw v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 476
    :catchall_2
    move-exception p1

    .line 477
    :try_start_4
    throw p1

    .line 478
    :goto_7
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 479
    throw p1

    .line 480
    :cond_8
    throw v2
.end method

.method public final a()Ljava/lang/String;
    .locals 9

    .line 1
    invoke-static {}, LVa/G;->S()LVa/G;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LVa/G;->P()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    const-string v2, "\u0091\u0082\u0090"

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    if-nez v0, :cond_3

    .line 14
    .line 15
    sget v0, LVa/x;->r:I

    .line 16
    .line 17
    add-int/lit8 v0, v0, 0x3f

    .line 18
    .line 19
    rem-int/lit16 v0, v0, 0x80

    .line 20
    .line 21
    sput v0, LVa/x;->s:I

    .line 22
    .line 23
    invoke-virtual {p0}, LVa/x;->c()LVa/D;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    sget v4, LVa/D;->i:I

    .line 31
    .line 32
    add-int/lit8 v4, v4, 0x11

    .line 33
    .line 34
    rem-int/lit16 v4, v4, 0x80

    .line 35
    .line 36
    sput v4, LVa/D;->j:I

    .line 37
    .line 38
    invoke-virtual {v0}, LVa/Mb;->e()Lorg/json/JSONObject;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatTimeout()I

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    shr-int/lit8 v4, v4, 0x10

    .line 47
    .line 48
    add-int/lit8 v4, v4, 0x7f

    .line 49
    .line 50
    invoke-static {v4, v2}, LVa/D;->y(ILjava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    const-string v2, "\u0086\u0085\u0083\u0084\u0083\u0082\u0081"

    .line 63
    .line 64
    if-eqz v0, :cond_0

    .line 65
    .line 66
    invoke-static {v1}, Landroid/graphics/Color;->alpha(I)I

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    rsub-int/lit8 v1, v1, 0x7f

    .line 71
    .line 72
    const-string v4, "\u0081"

    .line 73
    .line 74
    invoke-static {v1, v4}, LVa/D;->y(ILjava/lang/String;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    const-wide/16 v4, 0x0

    .line 83
    .line 84
    invoke-static {v4, v5}, Landroid/widget/ExpandableListView;->getPackedPositionType(J)I

    .line 85
    .line 86
    .line 87
    move-result v4

    .line 88
    add-int/lit8 v4, v4, 0x7f

    .line 89
    .line 90
    invoke-static {v4, v2}, LVa/D;->y(ILjava/lang/String;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    goto :goto_0

    .line 103
    :cond_0
    invoke-static {v1}, Landroid/graphics/Color;->alpha(I)I

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    rsub-int/lit8 v0, v0, 0x7f

    .line 108
    .line 109
    invoke-static {v0, v2}, LVa/D;->y(ILjava/lang/String;)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    sget v1, LVa/D;->j:I

    .line 118
    .line 119
    add-int/lit8 v1, v1, 0x73

    .line 120
    .line 121
    rem-int/lit16 v2, v1, 0x80

    .line 122
    .line 123
    sput v2, LVa/D;->i:I

    .line 124
    .line 125
    rem-int/lit8 v1, v1, 0x2

    .line 126
    .line 127
    if-nez v1, :cond_2

    .line 128
    .line 129
    :goto_0
    sget v1, LVa/x;->s:I

    .line 130
    .line 131
    add-int/lit8 v1, v1, 0x5

    .line 132
    .line 133
    rem-int/lit16 v2, v1, 0x80

    .line 134
    .line 135
    sput v2, LVa/x;->r:I

    .line 136
    .line 137
    rem-int/lit8 v1, v1, 0x2

    .line 138
    .line 139
    if-nez v1, :cond_1

    .line 140
    .line 141
    return-object v0

    .line 142
    :cond_1
    throw v3

    .line 143
    :cond_2
    throw v3

    .line 144
    :cond_3
    invoke-virtual {p0}, LVa/x;->c()LVa/D;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    sget v4, LVa/D;->i:I

    .line 152
    .line 153
    add-int/lit8 v4, v4, 0x2f

    .line 154
    .line 155
    rem-int/lit16 v5, v4, 0x80

    .line 156
    .line 157
    sput v5, LVa/D;->j:I

    .line 158
    .line 159
    rem-int/lit8 v4, v4, 0x2

    .line 160
    .line 161
    const v5, 0xc89172

    .line 162
    .line 163
    .line 164
    const-string v6, "\u26bf\u14c0\ua6f5\u55dd\u20db\ub4cd\u716f\ue8a8\udf3e"

    .line 165
    .line 166
    const-string v7, "\u7277\uc891\u5c00\u4adc"

    .line 167
    .line 168
    const-string v8, ""

    .line 169
    .line 170
    if-nez v4, :cond_4

    .line 171
    .line 172
    invoke-virtual {v0}, LVa/Mb;->e()Lorg/json/JSONObject;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    invoke-static {}, Landroid/os/Process;->myTid()I

    .line 177
    .line 178
    .line 179
    move-result v4

    .line 180
    div-int/lit8 v4, v4, 0x13

    .line 181
    .line 182
    mul-int/lit8 v4, v4, 0x2c

    .line 183
    .line 184
    invoke-static {v4, v2}, LVa/D;->y(ILjava/lang/String;)Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v2

    .line 188
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v2

    .line 192
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    if-eqz v0, :cond_5

    .line 197
    .line 198
    goto :goto_1

    .line 199
    :cond_4
    invoke-virtual {v0}, LVa/Mb;->e()Lorg/json/JSONObject;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    invoke-static {}, Landroid/os/Process;->myTid()I

    .line 204
    .line 205
    .line 206
    move-result v4

    .line 207
    shr-int/lit8 v4, v4, 0x16

    .line 208
    .line 209
    add-int/lit8 v4, v4, 0x7f

    .line 210
    .line 211
    invoke-static {v4, v2}, LVa/D;->y(ILjava/lang/String;)Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v2

    .line 215
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v2

    .line 219
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    if-eqz v0, :cond_5

    .line 224
    .line 225
    :goto_1
    sget v2, LVa/D;->j:I

    .line 226
    .line 227
    add-int/lit8 v2, v2, 0x25

    .line 228
    .line 229
    rem-int/lit16 v2, v2, 0x80

    .line 230
    .line 231
    sput v2, LVa/D;->i:I

    .line 232
    .line 233
    invoke-static {v8}, Landroid/view/KeyEvent;->keyCodeFromString(Ljava/lang/String;)I

    .line 234
    .line 235
    .line 236
    move-result v2

    .line 237
    rsub-int/lit8 v2, v2, 0x7f

    .line 238
    .line 239
    const-string v4, "\u0088"

    .line 240
    .line 241
    invoke-static {v2, v4}, LVa/D;->y(ILjava/lang/String;)Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object v2

    .line 245
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v2

    .line 249
    const/16 v4, 0x30

    .line 250
    .line 251
    invoke-static {v8, v4, v1, v1}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CII)I

    .line 252
    .line 253
    .line 254
    move-result v4

    .line 255
    rsub-int/lit8 v4, v4, -0x1

    .line 256
    .line 257
    int-to-char v4, v4

    .line 258
    invoke-static {v1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 259
    .line 260
    .line 261
    move-result v1

    .line 262
    sub-int/2addr v5, v1

    .line 263
    invoke-static {v4, v7, v6, v5}, LVa/D;->u(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object v1

    .line 267
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object v1

    .line 271
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    goto :goto_2

    .line 276
    :cond_5
    invoke-static {v8, v1}, Landroid/text/TextUtils;->getOffsetAfter(Ljava/lang/CharSequence;I)I

    .line 277
    .line 278
    .line 279
    move-result v0

    .line 280
    int-to-char v0, v0

    .line 281
    invoke-static {v1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 282
    .line 283
    .line 284
    move-result v1

    .line 285
    add-int/2addr v1, v5

    .line 286
    invoke-static {v0, v7, v6, v1}, LVa/D;->u(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object v0

    .line 290
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 291
    .line 292
    .line 293
    move-result-object v0

    .line 294
    :goto_2
    sget v1, LVa/x;->r:I

    .line 295
    .line 296
    add-int/lit8 v1, v1, 0x71

    .line 297
    .line 298
    rem-int/lit16 v2, v1, 0x80

    .line 299
    .line 300
    sput v2, LVa/x;->s:I

    .line 301
    .line 302
    rem-int/lit8 v1, v1, 0x2

    .line 303
    .line 304
    if-eqz v1, :cond_6

    .line 305
    .line 306
    return-object v0

    .line 307
    :cond_6
    throw v3
.end method

.method public final declared-synchronized b()Z
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget v0, LVa/x;->r:I

    .line 3
    .line 4
    iget-boolean v1, p0, LVa/x;->h:Z

    .line 5
    .line 6
    add-int/lit8 v0, v0, 0x49

    .line 7
    .line 8
    rem-int/lit16 v0, v0, 0x80

    .line 9
    .line 10
    sput v0, LVa/x;->s:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    monitor-exit p0

    .line 13
    return v1

    .line 14
    :catchall_0
    move-exception v0

    .line 15
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 16
    throw v0
.end method

.method public final declared-synchronized c()LVa/D;
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget v0, LVa/x;->s:I

    .line 3
    .line 4
    add-int/lit8 v0, v0, 0x5

    .line 5
    .line 6
    rem-int/lit16 v1, v0, 0x80

    .line 7
    .line 8
    sput v1, LVa/x;->r:I

    .line 9
    .line 10
    rem-int/lit8 v0, v0, 0x2

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    invoke-static {}, LVa/G;->S()LVa/G;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, LVa/G;->L()LVa/D;

    .line 19
    .line 20
    .line 21
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    monitor-exit p0

    .line 23
    return-object v0

    .line 24
    :catchall_0
    move-exception v0

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    :try_start_1
    invoke-static {}, LVa/G;->S()LVa/G;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0}, LVa/G;->L()LVa/D;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 31
    .line 32
    .line 33
    const/4 v0, 0x0

    .line 34
    :try_start_2
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 35
    :catchall_1
    move-exception v0

    .line 36
    :try_start_3
    throw v0

    .line 37
    :goto_0
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 38
    throw v0
.end method

.method public final declared-synchronized d()V
    .locals 9

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p0}, LVa/x;->e()Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, LVa/x;->e:LVa/n;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    sget v1, LVa/lb;->e:I

    .line 14
    .line 15
    add-int/lit8 v1, v1, 0x57

    .line 16
    .line 17
    rem-int/lit16 v1, v1, 0x80

    .line 18
    .line 19
    sput v1, LVa/lb;->f:I

    .line 20
    .line 21
    add-int/lit8 v1, v1, 0x57

    .line 22
    .line 23
    rem-int/lit16 v1, v1, 0x80

    .line 24
    .line 25
    sput v1, LVa/lb;->e:I

    .line 26
    .line 27
    iget-object v0, v0, LVa/lb;->c:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v0, LVa/H;

    .line 30
    .line 31
    invoke-virtual {v0}, LVa/H;->c()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    const/4 v1, 0x1

    .line 40
    if-eq v0, v1, :cond_0

    .line 41
    .line 42
    sget v0, LVa/x;->s:I

    .line 43
    .line 44
    add-int/lit8 v0, v0, 0x63

    .line 45
    .line 46
    rem-int/lit16 v0, v0, 0x80

    .line 47
    .line 48
    sput v0, LVa/x;->r:I

    .line 49
    .line 50
    invoke-virtual {p0}, LVa/x;->b()Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-nez v0, :cond_0

    .line 55
    .line 56
    invoke-virtual {p0, v1}, LVa/x;->y(Z)V

    .line 57
    .line 58
    .line 59
    const-string v0, ""

    .line 60
    .line 61
    const-string v1, ""

    .line 62
    .line 63
    const/4 v2, 0x0

    .line 64
    invoke-static {v0, v1, v2, v2}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;II)I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    add-int/lit8 v0, v0, 0x9

    .line 69
    .line 70
    const-string v1, "\uffd9\u0006\ufff9\u0004\u0011\u000c\u0001\ufffb\u000b"

    .line 71
    .line 72
    invoke-static {}, Landroid/os/Process;->getElapsedCpuTime()J

    .line 73
    .line 74
    .line 75
    move-result-wide v3

    .line 76
    const-wide/16 v5, 0x0

    .line 77
    .line 78
    cmp-long v3, v3, v5

    .line 79
    .line 80
    add-int/lit8 v3, v3, 0x8

    .line 81
    .line 82
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 83
    .line 84
    .line 85
    move-result-wide v7

    .line 86
    cmp-long v4, v7, v5

    .line 87
    .line 88
    rsub-int v4, v4, 0x9c

    .line 89
    .line 90
    invoke-static {v1, v0, v3, v4, v2}, LVa/x;->B(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    const-string v1, "\uddfa\u49fe\uc00c\u85c7\u5b23\u2085\udeb7\uaa50\u56a6\ub020\u9b05\u5cb0\u6810\u34a3\ua657\uc414\u395f\ud29d\uabf2\ua8ed\u0103\u90ed\ue6f5\u963f\u937d\u5b72"

    .line 99
    .line 100
    invoke-static {v5, v6}, Landroid/widget/ExpandableListView;->getPackedPositionType(J)I

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    rsub-int/lit8 v2, v2, 0x19

    .line 105
    .line 106
    invoke-static {v1, v2}, LVa/x;->v(Ljava/lang/String;I)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    invoke-static {v0, v1}, LVa/Ab;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    iget-object v0, p0, LVa/x;->d:LVa/cb;

    .line 118
    .line 119
    invoke-virtual {p0}, LVa/x;->c()LVa/D;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    invoke-virtual {v1}, LVa/D;->z()I

    .line 124
    .line 125
    .line 126
    move-result v1

    .line 127
    new-instance v2, LVa/p;

    .line 128
    .line 129
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 130
    .line 131
    .line 132
    iput-object p0, v2, LVa/p;->a:LVa/x;

    .line 133
    .line 134
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    invoke-static {}, LVa/Ra;->k()Landroid/os/Handler;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    new-instance v4, LVa/La;

    .line 142
    .line 143
    invoke-direct {v4, v0, v1, v2}, LVa/La;-><init>(LVa/cb;ILVa/p;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v3, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 147
    .line 148
    .line 149
    sget v0, LVa/cb;->l:I

    .line 150
    .line 151
    add-int/lit8 v0, v0, 0x73

    .line 152
    .line 153
    rem-int/lit16 v0, v0, 0x80

    .line 154
    .line 155
    sput v0, LVa/cb;->k:I

    .line 156
    .line 157
    goto :goto_0

    .line 158
    :catchall_0
    move-exception v0

    .line 159
    goto :goto_1

    .line 160
    :cond_0
    :goto_0
    sget v0, LVa/x;->s:I

    .line 161
    .line 162
    add-int/lit8 v0, v0, 0x9

    .line 163
    .line 164
    rem-int/lit16 v0, v0, 0x80

    .line 165
    .line 166
    sput v0, LVa/x;->r:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 167
    .line 168
    monitor-exit p0

    .line 169
    return-void

    .line 170
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 171
    throw v0
.end method

.method public final declared-synchronized e()Z
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget v0, LVa/x;->s:I

    .line 3
    .line 4
    add-int/lit8 v0, v0, 0x5f

    .line 5
    .line 6
    rem-int/lit16 v1, v0, 0x80

    .line 7
    .line 8
    sput v1, LVa/x;->r:I

    .line 9
    .line 10
    rem-int/lit8 v0, v0, 0x2

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    iget-boolean v0, p0, LVa/x;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    monitor-exit p0

    .line 17
    return v0

    .line 18
    :catchall_0
    move-exception v0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    :try_start_1
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 22
    :catchall_1
    move-exception v0

    .line 23
    :try_start_2
    throw v0

    .line 24
    :goto_0
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 25
    throw v0
.end method

.method public final h()V
    .locals 3

    .line 1
    sget v0, LVa/x;->s:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x4d

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/x;->r:I

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
    iget-object v0, p0, LVa/x;->l:LVa/w;

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    iget-object v0, p0, LVa/x;->c:LVa/z;

    .line 19
    .line 20
    invoke-virtual {v0}, LVa/z;->a()LVa/Ea;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iget-object v2, p0, LVa/x;->l:LVa/w;

    .line 25
    .line 26
    invoke-virtual {v0, v2}, LVa/Ea;->i(LVa/za;)V

    .line 27
    .line 28
    .line 29
    :cond_0
    iget-object v0, p0, LVa/x;->o:LA7/b0;

    .line 30
    .line 31
    invoke-virtual {v0}, LA7/b0;->x()V

    .line 32
    .line 33
    .line 34
    iput-object v1, p0, LVa/x;->o:LA7/b0;

    .line 35
    .line 36
    sget v0, LVa/x;->s:I

    .line 37
    .line 38
    add-int/lit8 v0, v0, 0x73

    .line 39
    .line 40
    rem-int/lit16 v0, v0, 0x80

    .line 41
    .line 42
    sput v0, LVa/x;->r:I

    .line 43
    .line 44
    return-void

    .line 45
    :cond_1
    throw v1
.end method

.method public final i()Ljava/lang/String;
    .locals 7

    .line 1
    new-instance v0, LVa/Ra;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v1}, Landroid/util/TypedValue;->complexToFloat(I)F

    .line 5
    .line 6
    .line 7
    move-result v2

    .line 8
    const/4 v3, 0x0

    .line 9
    cmpl-float v2, v2, v3

    .line 10
    .line 11
    add-int/lit8 v2, v2, 0x19

    .line 12
    .line 13
    const-string v3, "\ub101\u148b\ub2a0\u04c1\u773e\uf0e2\ub2a0\u04c1\u42be\u5812\u2e9a\uaed4\u725b\uf637\u2b34\ueab9\uf962\u4835\u8cd2\u0f33\u1656\uccd7\u051b\ue04e\u6774\u506b"

    .line 14
    .line 15
    invoke-static {v3, v2}, LVa/x;->v(Ljava/lang/String;I)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-static {v1}, Landroid/graphics/ImageFormat;->getBitsPerPixel(I)I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    rsub-int/lit8 v3, v3, 0x2

    .line 28
    .line 29
    invoke-static {v1, v1}, Landroid/graphics/drawable/Drawable;->resolveOpacity(II)I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    add-int/lit8 v1, v1, 0x18

    .line 34
    .line 35
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarFadeDuration()I

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    shr-int/lit8 v4, v4, 0x10

    .line 40
    .line 41
    add-int/lit16 v4, v4, 0x97

    .line 42
    .line 43
    const-string v5, "\u000b\u000b\u000f\u000f\uffff\u0005\u0010\u0015\u0008\ufffd\n\ufffd\uffd0\uffc9\u0010\u0001\u000e\uffff\u0001\u000f\uffc9\ufffd\u0008\t"

    .line 44
    .line 45
    const/4 v6, 0x1

    .line 46
    invoke-static {v5, v3, v1, v4, v6}, LVa/x;->B(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    iget-object v3, p0, LVa/x;->k:Landroid/content/Context;

    .line 55
    .line 56
    invoke-direct {v0, v3, v2, v1}, LVa/Ra;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-static {v0}, LVa/x;->A(LVa/Ra;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    sget v1, LVa/x;->s:I

    .line 64
    .line 65
    add-int/lit8 v1, v1, 0x1f

    .line 66
    .line 67
    rem-int/lit16 v2, v1, 0x80

    .line 68
    .line 69
    sput v2, LVa/x;->r:I

    .line 70
    .line 71
    rem-int/lit8 v1, v1, 0x2

    .line 72
    .line 73
    if-nez v1, :cond_0

    .line 74
    .line 75
    return-object v0

    .line 76
    :cond_0
    const/4 v0, 0x0

    .line 77
    throw v0
.end method

.method public final j()V
    .locals 2

    .line 1
    new-instance v0, LVa/u;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LVa/u;-><init>(I)V

    .line 5
    .line 6
    .line 7
    iput-object p0, v0, LVa/u;->d:LVa/x;

    .line 8
    .line 9
    invoke-static {v0}, LVa/Cb;->j(LVa/Ba;)V

    .line 10
    .line 11
    .line 12
    sget v0, LVa/x;->r:I

    .line 13
    .line 14
    add-int/lit8 v0, v0, 0x33

    .line 15
    .line 16
    rem-int/lit16 v1, v0, 0x80

    .line 17
    .line 18
    sput v1, LVa/x;->s:I

    .line 19
    .line 20
    rem-int/lit8 v0, v0, 0x2

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    const/4 v0, 0x0

    .line 26
    throw v0
.end method

.method public final declared-synchronized k(LVa/Gb;)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget v0, LVa/x;->r:I

    .line 3
    .line 4
    add-int/lit8 v0, v0, 0x45

    .line 5
    .line 6
    rem-int/lit16 v0, v0, 0x80

    .line 7
    .line 8
    sput v0, LVa/x;->s:I

    .line 9
    .line 10
    iget-object v0, p0, LVa/x;->i:Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    sget p1, LVa/x;->s:I

    .line 16
    .line 17
    add-int/lit8 p1, p1, 0x47

    .line 18
    .line 19
    rem-int/lit16 v0, p1, 0x80

    .line 20
    .line 21
    sput v0, LVa/x;->r:I

    .line 22
    .line 23
    rem-int/lit8 p1, p1, 0x2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 24
    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    const/16 p1, 0x4c

    .line 28
    .line 29
    :try_start_1
    div-int/lit8 p1, p1, 0x0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 30
    .line 31
    monitor-exit p0

    .line 32
    return-void

    .line 33
    :catchall_0
    move-exception p1

    .line 34
    :try_start_2
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 35
    :catchall_1
    move-exception p1

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    monitor-exit p0

    .line 38
    return-void

    .line 39
    :goto_0
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 40
    throw p1
.end method

.method public final l(Ljava/lang/String;Lorg/json/JSONObject;Lorg/json/JSONObject;LVa/y;)V
    .locals 11

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-static {v0, v1, v2}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    add-int/lit8 v0, v0, 0x9

    .line 11
    .line 12
    const-string v1, "\uffd9\u0006\ufff9\u0004\u0011\u000c\u0001\ufffb\u000b"

    .line 13
    .line 14
    invoke-static {}, Landroid/view/ViewConfiguration;->getFadingEdgeLength()I

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    shr-int/lit8 v3, v3, 0x10

    .line 19
    .line 20
    add-int/lit8 v3, v3, 0x9

    .line 21
    .line 22
    const-string v4, ""

    .line 23
    .line 24
    const/16 v5, 0x30

    .line 25
    .line 26
    invoke-static {v4, v5, v2}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CI)I

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    add-int/lit16 v4, v4, 0x9c

    .line 31
    .line 32
    invoke-static {v1, v0, v3, v4, v2}, LVa/x;->B(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    new-instance v1, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 43
    .line 44
    .line 45
    const-string v3, "\uf092\u4002\u6945\u33c1\u98bb\u56e5\u3743\ufb7b\u0c07\u8136\u4bdb\u9b6e\uc00c\u85c7\u623f\u1c1f\u12da\udcdf\ufdb6\ufa38\uadfd\u482c"

    .line 46
    .line 47
    invoke-static {}, Landroid/os/Process;->getElapsedCpuTime()J

    .line 48
    .line 49
    .line 50
    move-result-wide v4

    .line 51
    const-wide/16 v6, 0x0

    .line 52
    .line 53
    cmp-long v4, v4, v6

    .line 54
    .line 55
    rsub-int/lit8 v4, v4, 0x17

    .line 56
    .line 57
    invoke-static {v3, v4}, LVa/x;->v(Ljava/lang/String;I)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    const-string v3, "\u6ab8\u1c74\u1726\u5d33\u8d4f\u531f\u1ff9\ucaf5\ub101\u148b\ud90a\u952c\u5b23\u2085\u55e9\u4a34\u08a0\u9586"

    .line 72
    .line 73
    invoke-static {v2, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    add-int/lit8 v4, v4, 0x11

    .line 78
    .line 79
    invoke-static {v3, v4}, LVa/x;->v(Ljava/lang/String;I)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    invoke-static {v0, v1, p2}, LVa/Ab;->y(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    const/4 v1, 0x0

    .line 98
    :try_start_0
    invoke-virtual {p0}, LVa/x;->c()LVa/D;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    invoke-virtual {v0}, LVa/D;->x()Ljava/util/List;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    if-eqz v0, :cond_1

    .line 111
    .line 112
    invoke-static {}, Landroid/os/Process;->getElapsedCpuTime()J

    .line 113
    .line 114
    .line 115
    move-result-wide p2

    .line 116
    cmp-long p2, p2, v6

    .line 117
    .line 118
    add-int/lit8 p2, p2, 0x8

    .line 119
    .line 120
    const-string p3, "\uffd9\u0006\ufff9\u0004\u0011\u000c\u0001\ufffb\u000b"

    .line 121
    .line 122
    const-string p4, ""

    .line 123
    .line 124
    const-string v0, ""

    .line 125
    .line 126
    invoke-static {p4, v0, v2}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I

    .line 127
    .line 128
    .line 129
    move-result p4

    .line 130
    rsub-int/lit8 p4, p4, 0x9

    .line 131
    .line 132
    invoke-static {v2, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    add-int/lit16 v0, v0, 0x9b

    .line 137
    .line 138
    invoke-static {p3, p2, p4, v0, v2}, LVa/x;->B(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object p2

    .line 142
    invoke-virtual {p2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object p2

    .line 146
    new-instance p3, Ljava/lang/StringBuilder;

    .line 147
    .line 148
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 149
    .line 150
    .line 151
    const-string p4, "\u02d2\u9be6\u95fc\ud208\u4bdb\u9b6e\uc00c\u85c7\u5b23\u2085\udeb7\uaa50\u56a6\ub020\u9b05\u5cb0\u95fc\ud208\ub98b\u76fa\u497e\u87d3\u5514\uccd9\u74f4\uf5d7\u0795\u59b1\u119d\ud30a"

    .line 152
    .line 153
    invoke-static {v2}, Landroid/util/TypedValue;->complexToFloat(I)F

    .line 154
    .line 155
    .line 156
    move-result v0

    .line 157
    cmpl-float v0, v0, v1

    .line 158
    .line 159
    rsub-int/lit8 v0, v0, 0x1d

    .line 160
    .line 161
    invoke-static {p4, v0}, LVa/x;->v(Ljava/lang/String;I)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object p4

    .line 165
    invoke-virtual {p4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object p4

    .line 169
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    const-string p1, "\uc63b\ude88\u1ff9\ucaf5\u7d91\u2b8b\u6394\u7601\u84f3\ub201\uc55e\u72a3\u244b\u5b53\u4bdb\u9b6e\u9121\uc4d9\ufcf2\u14f9\ubbed\u835a"

    .line 176
    .line 177
    invoke-static {v6, v7}, Landroid/widget/ExpandableListView;->getPackedPositionGroup(J)I

    .line 178
    .line 179
    .line 180
    move-result p4

    .line 181
    rsub-int/lit8 p4, p4, 0x15

    .line 182
    .line 183
    invoke-static {p1, p4}, LVa/x;->v(Ljava/lang/String;I)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object p1

    .line 187
    invoke-virtual {p1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object p1

    .line 198
    invoke-static {p2, p1}, LVa/Ab;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 199
    .line 200
    .line 201
    sget p1, LVa/x;->s:I

    .line 202
    .line 203
    add-int/lit8 p1, p1, 0x1d

    .line 204
    .line 205
    rem-int/lit16 p2, p1, 0x80

    .line 206
    .line 207
    sput p2, LVa/x;->r:I

    .line 208
    .line 209
    rem-int/lit8 p1, p1, 0x2

    .line 210
    .line 211
    if-eqz p1, :cond_0

    .line 212
    .line 213
    const/16 p1, 0x4d

    .line 214
    .line 215
    div-int/2addr p1, v2

    .line 216
    :cond_0
    return-void

    .line 217
    :catch_0
    move-exception v0

    .line 218
    move-object p1, v0

    .line 219
    move-object v5, p1

    .line 220
    goto :goto_0

    .line 221
    :cond_1
    :try_start_1
    invoke-static {v2}, Landroid/util/TypedValue;->complexToFloat(I)F

    .line 222
    .line 223
    .line 224
    move-result v0

    .line 225
    cmpl-float v0, v0, v1

    .line 226
    .line 227
    add-int/lit8 v0, v0, 0x9

    .line 228
    .line 229
    const-string v3, "\uffd9\u0006\ufff9\u0004\u0011\u000c\u0001\ufffb\u000b"

    .line 230
    .line 231
    invoke-static {v6, v7}, Landroid/widget/ExpandableListView;->getPackedPositionGroup(J)I

    .line 232
    .line 233
    .line 234
    move-result v4

    .line 235
    add-int/lit8 v4, v4, 0x9

    .line 236
    .line 237
    invoke-static {v2}, Landroid/graphics/ImageFormat;->getBitsPerPixel(I)I

    .line 238
    .line 239
    .line 240
    move-result v5

    .line 241
    rsub-int v5, v5, 0x9a

    .line 242
    .line 243
    invoke-static {v3, v0, v4, v5, v2}, LVa/x;->B(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    new-instance v3, Ljava/lang/StringBuilder;

    .line 252
    .line 253
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 254
    .line 255
    .line 256
    const-string v4, "\uf092\u4002\u6945\u33c1\u98bb\u56e5\u3743\ufb7b\u0c07\u8136\u4bdb\u9b6e\uc00c\u85c7\u623f\u1c1f\u12da\udcdf\ufdb6\ufa38\u6ab8\u1c74\u1726\u5d33\u8d4f\u531f\u11d2\u4ca9\u2e60\u1fdc\uadfd\u482c"

    .line 257
    .line 258
    invoke-static {}, Landroid/view/ViewConfiguration;->getJumpTapTimeout()I

    .line 259
    .line 260
    .line 261
    move-result v5

    .line 262
    shr-int/lit8 v5, v5, 0x10

    .line 263
    .line 264
    add-int/lit8 v5, v5, 0x20

    .line 265
    .line 266
    invoke-static {v4, v5}, LVa/x;->v(Ljava/lang/String;I)Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v4

    .line 270
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object v4

    .line 274
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 275
    .line 276
    .line 277
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 278
    .line 279
    .line 280
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v3

    .line 284
    invoke-static {v0, v3}, LVa/Ab;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    iget-object v5, p0, LVa/x;->e:LVa/n;

    .line 288
    .line 289
    iget-object v0, p0, LVa/x;->c:LVa/z;

    .line 290
    .line 291
    invoke-virtual {v0}, LVa/z;->a()LVa/Ea;

    .line 292
    .line 293
    .line 294
    move-result-object v0

    .line 295
    invoke-virtual {v0}, LVa/Ea;->f()Z

    .line 296
    .line 297
    .line 298
    move-result v9

    .line 299
    new-instance v10, LVa/ha;

    .line 300
    .line 301
    invoke-direct {v10, p0, p4}, LVa/ha;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 302
    .line 303
    .line 304
    monitor-enter v5
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 305
    :try_start_2
    iget-object p4, v5, LVa/n;->k:Landroid/os/Handler;

    .line 306
    .line 307
    new-instance v4, LVa/m;

    .line 308
    .line 309
    move-object v6, p1

    .line 310
    move-object v7, p2

    .line 311
    move-object v8, p3

    .line 312
    invoke-direct/range {v4 .. v10}, LVa/m;-><init>(LVa/n;Ljava/lang/String;Lorg/json/JSONObject;Lorg/json/JSONObject;ZLVa/ha;)V

    .line 313
    .line 314
    .line 315
    invoke-virtual {p4, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 316
    .line 317
    .line 318
    sget p1, LVa/n;->n:I

    .line 319
    .line 320
    add-int/lit8 p1, p1, 0x65

    .line 321
    .line 322
    rem-int/lit16 p1, p1, 0x80

    .line 323
    .line 324
    sput p1, LVa/n;->m:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 325
    .line 326
    :try_start_3
    monitor-exit v5
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 327
    return-void

    .line 328
    :catchall_0
    move-exception v0

    .line 329
    move-object p1, v0

    .line 330
    :try_start_4
    monitor-exit v5
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 331
    :try_start_5
    throw p1
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    .line 332
    :goto_0
    invoke-static {v2}, Landroid/os/Process;->getThreadPriority(I)I

    .line 333
    .line 334
    .line 335
    move-result p1

    .line 336
    add-int/lit8 p1, p1, 0x14

    .line 337
    .line 338
    shr-int/lit8 p1, p1, 0x6

    .line 339
    .line 340
    add-int/lit8 p1, p1, 0x9

    .line 341
    .line 342
    const-string p2, "\uffd9\u0006\ufff9\u0004\u0011\u000c\u0001\ufffb\u000b"

    .line 343
    .line 344
    invoke-static {}, Landroid/view/KeyEvent;->getMaxKeyCode()I

    .line 345
    .line 346
    .line 347
    move-result p3

    .line 348
    shr-int/lit8 p3, p3, 0x10

    .line 349
    .line 350
    rsub-int/lit8 p3, p3, 0x9

    .line 351
    .line 352
    invoke-static {}, Landroid/media/AudioTrack;->getMinVolume()F

    .line 353
    .line 354
    .line 355
    move-result p4

    .line 356
    cmpl-float p4, p4, v1

    .line 357
    .line 358
    rsub-int p4, p4, 0x9b

    .line 359
    .line 360
    invoke-static {p2, p1, p3, p4, v2}, LVa/x;->B(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 361
    .line 362
    .line 363
    move-result-object p1

    .line 364
    invoke-virtual {p1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 365
    .line 366
    .line 367
    move-result-object v3

    .line 368
    invoke-static {}, Landroid/view/ViewConfiguration;->getWindowTouchSlop()I

    .line 369
    .line 370
    .line 371
    move-result p1

    .line 372
    shr-int/lit8 p1, p1, 0x8

    .line 373
    .line 374
    rsub-int/lit8 p1, p1, 0xa

    .line 375
    .line 376
    const-string p2, "\u0013\uffc0\u000e\t\uffc0\u0012\u000f\u0012\u0012\uffe5\u0014\u000e\u0005\u0016\uffe5\u0004\u000e\u0005"

    .line 377
    .line 378
    invoke-static {}, Landroid/view/KeyEvent;->getModifierMetaStateMask()I

    .line 379
    .line 380
    .line 381
    move-result p3

    .line 382
    int-to-byte p3, p3

    .line 383
    rsub-int/lit8 p3, p3, 0x11

    .line 384
    .line 385
    invoke-static {v2, v2}, Landroid/graphics/drawable/Drawable;->resolveOpacity(II)I

    .line 386
    .line 387
    .line 388
    move-result p4

    .line 389
    add-int/lit16 p4, p4, 0x93

    .line 390
    .line 391
    const/4 v0, 0x1

    .line 392
    invoke-static {p2, p1, p3, p4, v0}, LVa/x;->B(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 393
    .line 394
    .line 395
    move-result-object p1

    .line 396
    invoke-virtual {p1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 397
    .line 398
    .line 399
    move-result-object v4

    .line 400
    const/4 v8, 0x1

    .line 401
    const/4 v6, 0x0

    .line 402
    const/4 v7, 0x0

    .line 403
    invoke-static/range {v3 .. v8}, LVa/Ab;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZZZ)V

    .line 404
    .line 405
    .line 406
    return-void
.end method

.method public final m(Lorg/json/JSONObject;)V
    .locals 3

    .line 1
    invoke-static {}, LVa/Kb;->u()LVa/Kb;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LVa/Kb;->t()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    monitor-enter p0

    .line 12
    :try_start_0
    new-instance v0, Ljava/util/ArrayList;

    .line 13
    .line 14
    iget-object v1, p0, LVa/x;->i:Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 17
    .line 18
    .line 19
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    new-instance v1, LVa/y;

    .line 21
    .line 22
    const/16 v2, 0x8

    .line 23
    .line 24
    invoke-direct {v1, v2}, LVa/y;-><init>(I)V

    .line 25
    .line 26
    .line 27
    iput-object v0, v1, LVa/y;->d:Ljava/lang/Object;

    .line 28
    .line 29
    iput-object p1, v1, LVa/y;->e:Ljava/lang/Object;

    .line 30
    .line 31
    invoke-static {v1}, LVa/Cb;->g(LVa/Ba;)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :catchall_0
    move-exception p1

    .line 36
    monitor-exit p0

    .line 37
    throw p1

    .line 38
    :cond_0
    return-void
.end method

.method public final declared-synchronized n(Z)V
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget v0, LVa/x;->s:I

    .line 3
    .line 4
    add-int/lit8 v1, v0, 0x11

    .line 5
    .line 6
    rem-int/lit16 v1, v1, 0x80

    .line 7
    .line 8
    sput v1, LVa/x;->r:I

    .line 9
    .line 10
    if-eqz p1, :cond_1

    .line 11
    .line 12
    add-int/lit8 v0, v0, 0xf

    .line 13
    .line 14
    rem-int/lit16 v0, v0, 0x80

    .line 15
    .line 16
    sput v0, LVa/x;->r:I

    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    invoke-virtual {p0, p1}, LVa/x;->C(I)V

    .line 20
    .line 21
    .line 22
    sget p1, LVa/x;->r:I

    .line 23
    .line 24
    add-int/lit8 p1, p1, 0x17

    .line 25
    .line 26
    rem-int/lit16 v0, p1, 0x80

    .line 27
    .line 28
    sput v0, LVa/x;->s:I

    .line 29
    .line 30
    rem-int/lit8 p1, p1, 0x2

    .line 31
    .line 32
    if-eqz p1, :cond_0

    .line 33
    .line 34
    add-int/lit8 v0, v0, 0x6d

    .line 35
    .line 36
    rem-int/lit16 v0, v0, 0x80

    .line 37
    .line 38
    sput v0, LVa/x;->r:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    monitor-exit p0

    .line 41
    return-void

    .line 42
    :catchall_0
    move-exception p1

    .line 43
    goto :goto_0

    .line 44
    :cond_0
    const/4 p1, 0x0

    .line 45
    :try_start_1
    throw p1

    .line 46
    :cond_1
    iget-object p1, p0, LVa/x;->d:LVa/cb;

    .line 47
    .line 48
    new-instance v0, LVa/r;

    .line 49
    .line 50
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 51
    .line 52
    .line 53
    iput-object p0, v0, LVa/r;->a:LVa/x;

    .line 54
    .line 55
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    invoke-static {}, LVa/Ra;->k()Landroid/os/Handler;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    new-instance v2, LVa/y;

    .line 63
    .line 64
    const/16 v3, 0x11

    .line 65
    .line 66
    invoke-direct {v2, v3, p1, v0}, LVa/y;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 70
    .line 71
    .line 72
    sget p1, LVa/cb;->k:I

    .line 73
    .line 74
    add-int/lit8 p1, p1, 0x19

    .line 75
    .line 76
    rem-int/lit16 p1, p1, 0x80

    .line 77
    .line 78
    sput p1, LVa/cb;->l:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 79
    .line 80
    monitor-exit p0

    .line 81
    return-void

    .line 82
    :goto_0
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 83
    throw p1
.end method

.method public final declared-synchronized p()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget v0, LVa/x;->s:I

    .line 3
    .line 4
    add-int/lit8 v0, v0, 0xf

    .line 5
    .line 6
    rem-int/lit16 v1, v0, 0x80

    .line 7
    .line 8
    sput v1, LVa/x;->r:I

    .line 9
    .line 10
    rem-int/lit8 v0, v0, 0x2

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iput-boolean v1, p0, LVa/x;->b:Z

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-virtual {p0, v0}, LVa/x;->n(Z)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :catchall_0
    move-exception v0

    .line 23
    goto :goto_1

    .line 24
    :cond_0
    iput-boolean v1, p0, LVa/x;->b:Z

    .line 25
    .line 26
    invoke-virtual {p0, v1}, LVa/x;->n(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    .line 29
    :goto_0
    monitor-exit p0

    .line 30
    return-void

    .line 31
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 32
    throw v0
.end method

.method public final q(Ljava/util/ArrayList;LVa/p;)V
    .locals 7

    .line 1
    new-instance v0, Lorg/json/JSONArray;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    sget v2, LVa/x;->r:I

    .line 11
    .line 12
    add-int/lit8 v2, v2, 0x59

    .line 13
    .line 14
    rem-int/lit16 v2, v2, 0x80

    .line 15
    .line 16
    sput v2, LVa/x;->s:I

    .line 17
    .line 18
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_3

    .line 23
    .line 24
    sget v2, LVa/x;->s:I

    .line 25
    .line 26
    add-int/lit8 v2, v2, 0x41

    .line 27
    .line 28
    rem-int/lit16 v2, v2, 0x80

    .line 29
    .line 30
    sput v2, LVa/x;->r:I

    .line 31
    .line 32
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    check-cast v2, LVa/l;

    .line 37
    .line 38
    invoke-virtual {v2}, LVa/l;->j()Lorg/json/JSONObject;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-static {}, Landroid/view/ViewConfiguration;->getPressedStateDuration()I

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    shr-int/lit8 v4, v4, 0x10

    .line 47
    .line 48
    add-int/lit8 v4, v4, 0x3

    .line 49
    .line 50
    const-string v5, "\ufbde\u1289\u6774\u506b"

    .line 51
    .line 52
    invoke-static {v5, v4}, LVa/x;->v(Ljava/lang/String;I)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    if-nez v4, :cond_1

    .line 65
    .line 66
    sget v4, LVa/x;->r:I

    .line 67
    .line 68
    add-int/lit8 v4, v4, 0x7d

    .line 69
    .line 70
    rem-int/lit16 v6, v4, 0x80

    .line 71
    .line 72
    sput v6, LVa/x;->s:I

    .line 73
    .line 74
    rem-int/lit8 v4, v4, 0x2

    .line 75
    .line 76
    const-string v6, ""

    .line 77
    .line 78
    if-nez v4, :cond_0

    .line 79
    .line 80
    :try_start_0
    invoke-static {v6}, Landroid/view/KeyEvent;->keyCodeFromString(Ljava/lang/String;)I

    .line 81
    .line 82
    .line 83
    move-result v4

    .line 84
    mul-int/lit8 v4, v4, 0x2

    .line 85
    .line 86
    invoke-static {v5, v4}, LVa/x;->v(Ljava/lang/String;I)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    sget-object v5, LVa/sa;->f:Ljava/lang/String;

    .line 95
    .line 96
    :goto_1
    invoke-virtual {v3, v5}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    .line 97
    .line 98
    .line 99
    move-result-wide v5

    .line 100
    invoke-virtual {v3, v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 101
    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_0
    invoke-static {v6}, Landroid/view/KeyEvent;->keyCodeFromString(Ljava/lang/String;)I

    .line 105
    .line 106
    .line 107
    move-result v4

    .line 108
    rsub-int/lit8 v4, v4, 0x3

    .line 109
    .line 110
    invoke-static {v5, v4}, LVa/x;->v(Ljava/lang/String;I)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v4

    .line 114
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v4

    .line 118
    sget-object v5, LVa/sa;->f:Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 119
    .line 120
    goto :goto_1

    .line 121
    :catch_0
    :cond_1
    :goto_2
    iget-object v4, p0, LVa/x;->m:LVa/k;

    .line 122
    .line 123
    invoke-virtual {v4, v3}, LVa/k;->c(Lorg/json/JSONObject;)Z

    .line 124
    .line 125
    .line 126
    move-result v4

    .line 127
    if-nez v4, :cond_2

    .line 128
    .line 129
    goto :goto_3

    .line 130
    :cond_2
    invoke-virtual {v2}, LVa/l;->d()LVa/Sa;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    const/4 v4, 0x0

    .line 135
    iget-object v5, p0, LVa/x;->d:LVa/cb;

    .line 136
    .line 137
    invoke-virtual {v5, v2, v4}, LVa/cb;->t(LVa/Sa;LVa/v;)V

    .line 138
    .line 139
    .line 140
    sget v2, LVa/x;->s:I

    .line 141
    .line 142
    add-int/lit8 v2, v2, 0x2d

    .line 143
    .line 144
    rem-int/lit16 v2, v2, 0x80

    .line 145
    .line 146
    sput v2, LVa/x;->r:I

    .line 147
    .line 148
    :goto_3
    invoke-virtual {v0, v3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 149
    .line 150
    .line 151
    goto/16 :goto_0

    .line 152
    .line 153
    :cond_3
    iget-object v1, p0, LVa/x;->c:LVa/z;

    .line 154
    .line 155
    invoke-virtual {v1}, LVa/z;->a()LVa/Ea;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    invoke-virtual {v1}, LVa/Ea;->f()Z

    .line 160
    .line 161
    .line 162
    move-result v1

    .line 163
    new-instance v2, LS3/i;

    .line 164
    .line 165
    invoke-direct {v2, p0, v0, p1, p2}, LS3/i;-><init>(LVa/x;Lorg/json/JSONArray;Ljava/util/ArrayList;LVa/p;)V

    .line 166
    .line 167
    .line 168
    iget-object p1, p0, LVa/x;->e:LVa/n;

    .line 169
    .line 170
    iget-object p2, p1, LVa/n;->k:Landroid/os/Handler;

    .line 171
    .line 172
    new-instance v3, LVa/Ub;

    .line 173
    .line 174
    invoke-direct {v3, p1, v1, v0, v2}, LVa/Ub;-><init>(LVa/n;ZLorg/json/JSONArray;LS3/i;)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {p2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 178
    .line 179
    .line 180
    sget p1, LVa/n;->m:I

    .line 181
    .line 182
    add-int/lit8 p1, p1, 0x71

    .line 183
    .line 184
    rem-int/lit16 p1, p1, 0x80

    .line 185
    .line 186
    sput p1, LVa/n;->n:I

    .line 187
    .line 188
    return-void
.end method

.method public final r(LVa/l;)Z
    .locals 2

    .line 1
    sget v0, LVa/x;->s:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x7b

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/x;->r:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    iget-object v1, p0, LVa/x;->p:Ljava/lang/String;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-static {}, LVa/G;->S()LVa/G;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {p1}, LVa/l;->i()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {v0, p1, v1}, LVa/G;->V(Ljava/lang/String;Ljava/lang/String;)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    const/16 v0, 0x5d

    .line 28
    .line 29
    div-int/lit8 v0, v0, 0x0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-static {}, LVa/G;->S()LVa/G;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {p1}, LVa/l;->i()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {v0, p1, v1}, LVa/G;->V(Ljava/lang/String;Ljava/lang/String;)Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    :goto_0
    sget v0, LVa/x;->s:I

    .line 45
    .line 46
    add-int/lit8 v0, v0, 0x5

    .line 47
    .line 48
    rem-int/lit16 v1, v0, 0x80

    .line 49
    .line 50
    sput v1, LVa/x;->r:I

    .line 51
    .line 52
    rem-int/lit8 v0, v0, 0x2

    .line 53
    .line 54
    if-nez v0, :cond_1

    .line 55
    .line 56
    return p1

    .line 57
    :cond_1
    const/4 p1, 0x0

    .line 58
    throw p1
.end method

.method public final s()V
    .locals 2

    .line 1
    new-instance v0, LVa/u;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-direct {v0, v1}, LVa/u;-><init>(I)V

    .line 5
    .line 6
    .line 7
    iput-object p0, v0, LVa/u;->d:LVa/x;

    .line 8
    .line 9
    invoke-static {v0}, LVa/Cb;->j(LVa/Ba;)V

    .line 10
    .line 11
    .line 12
    sget v0, LVa/x;->s:I

    .line 13
    .line 14
    add-int/lit8 v0, v0, 0x5f

    .line 15
    .line 16
    rem-int/lit16 v0, v0, 0x80

    .line 17
    .line 18
    sput v0, LVa/x;->r:I

    .line 19
    .line 20
    return-void
.end method

.method public final declared-synchronized u()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget v0, LVa/x;->r:I

    .line 3
    .line 4
    add-int/lit8 v0, v0, 0x2b

    .line 5
    .line 6
    rem-int/lit16 v1, v0, 0x80

    .line 7
    .line 8
    sput v1, LVa/x;->s:I

    .line 9
    .line 10
    rem-int/lit8 v0, v0, 0x2

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    iput-boolean v0, p0, LVa/x;->b:Z

    .line 16
    .line 17
    iget-object v0, p0, LVa/x;->f:Landroid/os/Handler;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :catchall_0
    move-exception v0

    .line 23
    goto :goto_1

    .line 24
    :cond_0
    const/4 v0, 0x0

    .line 25
    iput-boolean v0, p0, LVa/x;->b:Z

    .line 26
    .line 27
    iget-object v0, p0, LVa/x;->f:Landroid/os/Handler;

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    :goto_0
    iget-object v0, p0, LVa/x;->f:Landroid/os/Handler;

    .line 32
    .line 33
    const/4 v1, 0x0

    .line 34
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    sget v0, LVa/x;->r:I

    .line 38
    .line 39
    add-int/lit8 v0, v0, 0x7d

    .line 40
    .line 41
    rem-int/lit16 v0, v0, 0x80

    .line 42
    .line 43
    sput v0, LVa/x;->s:I

    .line 44
    .line 45
    :cond_1
    iget-object v0, p0, LVa/x;->c:LVa/z;

    .line 46
    .line 47
    invoke-virtual {v0}, LVa/z;->h()V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, LVa/x;->h()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    .line 52
    .line 53
    monitor-exit p0

    .line 54
    return-void

    .line 55
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 56
    throw v0
.end method

.method public final w()V
    .locals 7

    .line 1
    sget v0, LVa/x;->r:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1f

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/x;->s:I

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    :try_start_0
    iput-boolean v0, p0, LVa/x;->g:Z

    .line 11
    .line 12
    invoke-virtual {p0}, LVa/x;->j()V

    .line 13
    .line 14
    .line 15
    monitor-enter p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    :try_start_1
    iget-object v1, p0, LVa/x;->f:Landroid/os/Handler;

    .line 17
    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception v0

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    :goto_0
    invoke-virtual {p0, v0}, LVa/x;->n(Z)V

    .line 28
    .line 29
    .line 30
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 31
    sget v0, LVa/x;->s:I

    .line 32
    .line 33
    add-int/lit8 v0, v0, 0x9

    .line 34
    .line 35
    rem-int/lit16 v0, v0, 0x80

    .line 36
    .line 37
    sput v0, LVa/x;->r:I

    .line 38
    .line 39
    return-void

    .line 40
    :goto_1
    :try_start_2
    monitor-exit p0

    .line 41
    throw v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 42
    :catch_0
    move-exception v0

    .line 43
    const/4 v1, 0x0

    .line 44
    invoke-static {v1, v1}, Landroid/view/View;->combineMeasuredStates(II)I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    rsub-int/lit8 v2, v2, 0x9

    .line 49
    .line 50
    invoke-static {v1}, Landroid/graphics/ImageFormat;->getBitsPerPixel(I)I

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    rsub-int/lit8 v3, v3, 0x8

    .line 55
    .line 56
    invoke-static {v1, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    rsub-int v4, v4, 0x9b

    .line 61
    .line 62
    const-string v5, "\uffd9\u0006\ufff9\u0004\u0011\u000c\u0001\ufffb\u000b"

    .line 63
    .line 64
    invoke-static {v5, v2, v3, v4, v1}, LVa/x;->B(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    invoke-static {v1}, Landroid/graphics/Color;->green(I)I

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    rsub-int/lit8 v3, v3, 0x16

    .line 77
    .line 78
    invoke-static {}, Landroid/view/ViewConfiguration;->getTouchSlop()I

    .line 79
    .line 80
    .line 81
    move-result v4

    .line 82
    shr-int/lit8 v4, v4, 0x8

    .line 83
    .line 84
    add-int/lit8 v4, v4, 0x1a

    .line 85
    .line 86
    invoke-static {v1, v1, v1}, Landroid/view/View;->resolveSizeAndState(III)I

    .line 87
    .line 88
    .line 89
    move-result v5

    .line 90
    rsub-int v5, v5, 0x94

    .line 91
    .line 92
    const-string v6, "\u0011\uffbf\u0008\r\uffbf\u000e\r\uffe0\u000f\u000f\ufff3\u000e\uffe1\u0000\u0002\n\u0006\u0011\u000e\u0014\r\u0003\uffe4\u0011\u0011\u000e"

    .line 93
    .line 94
    invoke-static {v6, v3, v4, v5, v1}, LVa/x;->B(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    invoke-static {v2, v3, v0, v1}, LVa/Ab;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 103
    .line 104
    .line 105
    return-void
.end method

.method public final x(Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 3

    .line 1
    sget v0, LVa/x;->s:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x73

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/x;->r:I

    .line 8
    .line 9
    const/16 v1, 0x3f

    .line 10
    .line 11
    add-int/2addr v0, v1

    .line 12
    rem-int/lit16 v2, v0, 0x80

    .line 13
    .line 14
    sput v2, LVa/x;->s:I

    .line 15
    .line 16
    rem-int/lit8 v0, v0, 0x2

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-virtual {p0, p1, p2, v2, v2}, LVa/x;->l(Ljava/lang/String;Lorg/json/JSONObject;Lorg/json/JSONObject;LVa/y;)V

    .line 20
    .line 21
    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    div-int/lit8 v1, v1, 0x0

    .line 25
    .line 26
    :cond_0
    sget p1, LVa/x;->s:I

    .line 27
    .line 28
    add-int/lit8 p2, p1, 0x21

    .line 29
    .line 30
    rem-int/lit16 v0, p2, 0x80

    .line 31
    .line 32
    sput v0, LVa/x;->r:I

    .line 33
    .line 34
    rem-int/lit8 p2, p2, 0x2

    .line 35
    .line 36
    if-nez p2, :cond_2

    .line 37
    .line 38
    add-int/lit8 p1, p1, 0x13

    .line 39
    .line 40
    rem-int/lit16 p2, p1, 0x80

    .line 41
    .line 42
    sput p2, LVa/x;->r:I

    .line 43
    .line 44
    rem-int/lit8 p1, p1, 0x2

    .line 45
    .line 46
    if-nez p1, :cond_1

    .line 47
    .line 48
    return-void

    .line 49
    :cond_1
    throw v2

    .line 50
    :cond_2
    throw v2
.end method

.method public final declared-synchronized y(Z)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget v0, LVa/x;->r:I

    .line 3
    .line 4
    iput-boolean p1, p0, LVa/x;->h:Z

    .line 5
    .line 6
    add-int/lit8 v0, v0, 0x21

    .line 7
    .line 8
    rem-int/lit16 v0, v0, 0x80

    .line 9
    .line 10
    sput v0, LVa/x;->s:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    monitor-exit p0

    .line 13
    return-void

    .line 14
    :catchall_0
    move-exception p1

    .line 15
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 16
    throw p1
.end method

.method public final z(I)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, LVa/x;->c()LVa/D;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LVa/D;->z()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-lt p1, v0, :cond_1

    .line 10
    .line 11
    sget p1, LVa/x;->s:I

    .line 12
    .line 13
    add-int/lit8 p1, p1, 0x13

    .line 14
    .line 15
    rem-int/lit16 v0, p1, 0x80

    .line 16
    .line 17
    sput v0, LVa/x;->r:I

    .line 18
    .line 19
    rem-int/lit8 p1, p1, 0x2

    .line 20
    .line 21
    if-nez p1, :cond_0

    .line 22
    .line 23
    const/4 p1, 0x1

    .line 24
    return p1

    .line 25
    :cond_0
    const/4 p1, 0x0

    .line 26
    throw p1

    .line 27
    :cond_1
    const/4 p1, 0x0

    .line 28
    return p1
.end method
