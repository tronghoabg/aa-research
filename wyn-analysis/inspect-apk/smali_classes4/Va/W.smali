.class public final LVa/W;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final f:[C

.field public static g:I = 0x0

.field public static h:I = 0x1


# instance fields
.field public final a:Ljava/util/List;

.field public final b:Ljava/util/ArrayList;

.field public final c:Ljava/util/List;

.field public d:Lorg/json/JSONObject;

.field public final e:Lorg/json/JSONObject;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x1a

    .line 2
    .line 3
    new-array v0, v0, [C

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, LVa/W;->f:[C

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 2
        0xf2s
        0xffs
        0xf5s
        0x103s
        0x100s
        0xfas
        0xbfs
        0x108s
        0xf6s
        0xf3s
        0xfcs
        0x105s
        0xf4s
        0xfes
        0xf8s
        0xdas
        0xdes
        0xd2s
        0x107s
        0x10as
        0x101s
        0x104s
        0xfds
        0x109s
        0xc8s
        0xc1s
    .end array-data
.end method

.method public constructor <init>()V
    .locals 13

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Landroid/view/ViewConfiguration;->getTouchSlop()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    shr-int/lit8 v0, v0, 0x8

    .line 9
    .line 10
    rsub-int/lit8 v0, v0, 0x14

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-static {v1}, Landroid/graphics/Color;->green(I)I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    add-int/lit16 v2, v2, 0xba

    .line 18
    .line 19
    invoke-static {v1}, Landroid/graphics/Color;->green(I)I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    add-int/lit8 v3, v3, 0xf

    .line 24
    .line 25
    const-string v4, "\u0001\u0004\u0016\uffcd\u0003\u0008\u000e\u0011\u0003\r\u0000\uffcd\u000c\u000e\u0002\uffcd\u0016\u0004\u0008\u0015"

    .line 26
    .line 27
    const/4 v5, 0x1

    .line 28
    invoke-static {v4, v0, v2, v3, v5}, LVa/W;->c(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    const-wide/16 v2, 0x0

    .line 37
    .line 38
    invoke-static {v2, v3}, Landroid/widget/ExpandableListView;->getPackedPositionGroup(J)I

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    rsub-int/lit8 v4, v4, 0x7f

    .line 43
    .line 44
    const-string v6, "\u0087\u008c\u0086\u008b\u008a\u0089\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081"

    .line 45
    .line 46
    invoke-static {v4, v6}, LVa/W;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    const-string v6, ""

    .line 55
    .line 56
    filled-new-array {v0, v4, v6}, [Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iput-object v0, p0, LVa/W;->a:Ljava/util/List;

    .line 65
    .line 66
    new-instance v0, Ljava/util/ArrayList;

    .line 67
    .line 68
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 69
    .line 70
    .line 71
    iput-object v0, p0, LVa/W;->b:Ljava/util/ArrayList;

    .line 72
    .line 73
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarSize()I

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    shr-int/lit8 v0, v0, 0x8

    .line 78
    .line 79
    rsub-int/lit8 v0, v0, 0x7f

    .line 80
    .line 81
    const-string v4, "\u0094\u008c\u0086\u0093\u0086\u008c\u008d\u0092\u0083\u0092\u0086\u008a\u0085\u0091\u0082\u0090\u0087\u008f\u0082\u0086\u0084\u0089\u0083\u0082\u0089\u0084\u0087\u0086\u008a\u0085\u008e\u0082\u0086\u0087\u008e\u0085\u008d"

    .line 82
    .line 83
    invoke-static {v0, v4}, LVa/W;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-static {}, Landroid/view/ViewConfiguration;->getMinimumFlingVelocity()I

    .line 92
    .line 93
    .line 94
    move-result v4

    .line 95
    shr-int/lit8 v4, v4, 0x10

    .line 96
    .line 97
    rsub-int/lit8 v4, v4, 0x29

    .line 98
    .line 99
    invoke-static {v6}, Landroid/view/KeyEvent;->keyCodeFromString(Ljava/lang/String;)I

    .line 100
    .line 101
    .line 102
    move-result v7

    .line 103
    add-int/lit16 v7, v7, 0xba

    .line 104
    .line 105
    invoke-static {}, Landroid/view/KeyEvent;->getModifierMetaStateMask()I

    .line 106
    .line 107
    .line 108
    move-result v8

    .line 109
    int-to-byte v8, v8

    .line 110
    rsub-int/lit8 v8, v8, 0x16

    .line 111
    .line 112
    const-string v9, "\r\u0008\u0011\u0004\u0003\r\u0004\u0011\uffcd\u0012\u0003\u0000\uffcd\u0008\u0001\u000e\u000c\r\u0008\uffcd\u000c\u000e\u0002\u0018\u0013\u0008\u0015\u0008\u0013\u0002\uffe0\u0003\uffe0\u0008\u0001\u000e\uffec\r\uffe8\uffcd\u0006"

    .line 113
    .line 114
    invoke-static {v9, v4, v7, v8, v5}, LVa/W;->c(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v4

    .line 118
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v4

    .line 122
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarFadeDuration()I

    .line 123
    .line 124
    .line 125
    move-result v7

    .line 126
    shr-int/lit8 v7, v7, 0x10

    .line 127
    .line 128
    rsub-int/lit8 v7, v7, 0x7f

    .line 129
    .line 130
    const-string v8, "\u0094\u008c\u0086\u0093\u0086\u008c\u008d\u0092\u0097\u0081\u0086\u008c\u0086\u008c\u0096\u0084\u0089\u008c\u0082\u0090\u0087\u0097\u0081\u0086\u008c\u0086\u008c\u0096\u0084\u0089\u008c\u0082\u0086\u0087\u0089\u008f\u0081\u0096\u0089\u0084\u0095\u0087\u0085\u0086"

    .line 131
    .line 132
    invoke-static {v7, v8}, LVa/W;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v7

    .line 136
    invoke-virtual {v7}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v7

    .line 140
    const/16 v8, 0x30

    .line 141
    .line 142
    invoke-static {v8}, Landroid/text/AndroidCharacter;->getMirror(C)C

    .line 143
    .line 144
    .line 145
    move-result v9

    .line 146
    add-int/lit8 v9, v9, -0x1

    .line 147
    .line 148
    invoke-static {}, Landroid/os/Process;->getElapsedCpuTime()J

    .line 149
    .line 150
    .line 151
    move-result-wide v10

    .line 152
    cmp-long v10, v10, v2

    .line 153
    .line 154
    add-int/lit16 v10, v10, 0xbe

    .line 155
    .line 156
    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumFlingVelocity()I

    .line 157
    .line 158
    .line 159
    move-result v11

    .line 160
    shr-int/lit8 v11, v11, 0x10

    .line 161
    .line 162
    add-int/lit8 v11, v11, 0x22

    .line 163
    .line 164
    const-string v12, "\u000e\r\u000c\uffff\u000e\u0008\uffe3\uffc8\u0003\u000f\uffc8\u0006\ufffb\u0003\u000e\u0003\u000e\r\u000c\uffff\u000e\u0008\u0003\uffc8\uffff\u0001\ufffb\r\uffff\u000c\n\uffc8\t\u0003\u0013\u000e\u0003\u0010\u0003\u000e\ufffd\uffdb\u0006\ufffb\u0003\u000e\u0003"

    .line 165
    .line 166
    invoke-static {v12, v9, v10, v11, v5}, LVa/W;->c(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v9

    .line 170
    invoke-virtual {v9}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v9

    .line 174
    filled-new-array {v0, v4, v7, v9}, [Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    iput-object v0, p0, LVa/W;->c:Ljava/util/List;

    .line 183
    .line 184
    invoke-static {}, Landroid/media/AudioTrack;->getMinVolume()F

    .line 185
    .line 186
    .line 187
    move-result v4

    .line 188
    const/4 v7, 0x0

    .line 189
    cmpl-float v4, v4, v7

    .line 190
    .line 191
    add-int/lit8 v4, v4, 0x7f

    .line 192
    .line 193
    const-string v9, "\u0095\u0093\u0088"

    .line 194
    .line 195
    invoke-static {v4, v9}, LVa/W;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v4

    .line 199
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    invoke-static {}, Landroid/os/Process;->myTid()I

    .line 203
    .line 204
    .line 205
    move-result v4

    .line 206
    shr-int/lit8 v4, v4, 0x16

    .line 207
    .line 208
    rsub-int/lit8 v4, v4, 0x7f

    .line 209
    .line 210
    const-string v9, "\u0083\u0096\u0093\u0088"

    .line 211
    .line 212
    invoke-static {v4, v9}, LVa/W;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v4

    .line 216
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatTimeout()I

    .line 220
    .line 221
    .line 222
    move-result v4

    .line 223
    shr-int/lit8 v4, v4, 0x10

    .line 224
    .line 225
    rsub-int/lit8 v4, v4, 0x3

    .line 226
    .line 227
    invoke-static {v7, v7}, Landroid/graphics/PointF;->length(FF)F

    .line 228
    .line 229
    .line 230
    move-result v9

    .line 231
    cmpl-float v7, v9, v7

    .line 232
    .line 233
    add-int/lit16 v7, v7, 0xc2

    .line 234
    .line 235
    invoke-static {}, Landroid/os/Process;->getElapsedCpuTime()J

    .line 236
    .line 237
    .line 238
    move-result-wide v9

    .line 239
    cmp-long v9, v9, v2

    .line 240
    .line 241
    rsub-int/lit8 v9, v9, 0x4

    .line 242
    .line 243
    const-string v10, "\u0007\ufffa\u0000"

    .line 244
    .line 245
    invoke-static {v10, v4, v7, v9, v5}, LVa/W;->c(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v4

    .line 249
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    invoke-static {v6, v8, v1, v1}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CII)I

    .line 253
    .line 254
    .line 255
    move-result v4

    .line 256
    add-int/lit8 v4, v4, 0x5

    .line 257
    .line 258
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarFadeDuration()I

    .line 259
    .line 260
    .line 261
    move-result v7

    .line 262
    shr-int/lit8 v7, v7, 0x10

    .line 263
    .line 264
    rsub-int v7, v7, 0xc1

    .line 265
    .line 266
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 267
    .line 268
    .line 269
    move-result-wide v8

    .line 270
    cmp-long v8, v8, v2

    .line 271
    .line 272
    rsub-int/lit8 v8, v8, 0x4

    .line 273
    .line 274
    const-string v9, "\ufffb\u000b\ufffc\u0001"

    .line 275
    .line 276
    invoke-static {v9, v4, v7, v8, v1}, LVa/W;->c(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object v4

    .line 280
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    invoke-static {v1, v1}, Landroid/view/View;->getDefaultSize(II)I

    .line 284
    .line 285
    .line 286
    move-result v4

    .line 287
    rsub-int/lit8 v4, v4, 0x3

    .line 288
    .line 289
    invoke-static {v1, v1}, Landroid/view/View;->getDefaultSize(II)I

    .line 290
    .line 291
    .line 292
    move-result v7

    .line 293
    add-int/lit16 v7, v7, 0xc9

    .line 294
    .line 295
    invoke-static {}, Landroid/os/SystemClock;->currentThreadTimeMillis()J

    .line 296
    .line 297
    .line 298
    move-result-wide v8

    .line 299
    const-wide/16 v10, -0x1

    .line 300
    .line 301
    cmp-long v8, v8, v10

    .line 302
    .line 303
    add-int/2addr v8, v5

    .line 304
    const-string v9, "\u0004\ufff6\u0008"

    .line 305
    .line 306
    invoke-static {v9, v4, v7, v8, v5}, LVa/W;->c(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    move-result-object v4

    .line 310
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    invoke-static {v6, v1, v1}, Landroid/text/TextUtils;->getCapsMode(Ljava/lang/CharSequence;II)I

    .line 314
    .line 315
    .line 316
    move-result v4

    .line 317
    rsub-int/lit8 v4, v4, 0x7f

    .line 318
    .line 319
    const-string v5, "\u0098\u008c\u0089"

    .line 320
    .line 321
    invoke-static {v4, v5}, LVa/W;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 322
    .line 323
    .line 324
    move-result-object v4

    .line 325
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 326
    .line 327
    .line 328
    invoke-static {v1}, Landroid/graphics/ImageFormat;->getBitsPerPixel(I)I

    .line 329
    .line 330
    .line 331
    move-result v4

    .line 332
    rsub-int/lit8 v4, v4, 0x3

    .line 333
    .line 334
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarFadeDuration()I

    .line 335
    .line 336
    .line 337
    move-result v5

    .line 338
    shr-int/lit8 v5, v5, 0x10

    .line 339
    .line 340
    rsub-int v5, v5, 0xc4

    .line 341
    .line 342
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatDelay()I

    .line 343
    .line 344
    .line 345
    move-result v6

    .line 346
    shr-int/lit8 v6, v6, 0x10

    .line 347
    .line 348
    add-int/lit8 v6, v6, 0x3

    .line 349
    .line 350
    const-string v7, "\ufff6\u0005\t\ufffe"

    .line 351
    .line 352
    invoke-static {v7, v4, v5, v6, v1}, LVa/W;->c(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 353
    .line 354
    .line 355
    move-result-object v4

    .line 356
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 357
    .line 358
    .line 359
    new-instance v4, Lorg/json/JSONObject;

    .line 360
    .line 361
    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 362
    .line 363
    .line 364
    iput-object v4, p0, LVa/W;->d:Lorg/json/JSONObject;

    .line 365
    .line 366
    new-instance v4, Lorg/json/JSONObject;

    .line 367
    .line 368
    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 369
    .line 370
    .line 371
    iput-object v4, p0, LVa/W;->e:Lorg/json/JSONObject;

    .line 372
    .line 373
    :try_start_0
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 374
    .line 375
    .line 376
    move-result-object v0

    .line 377
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 378
    .line 379
    .line 380
    move-result v4

    .line 381
    if-eqz v4, :cond_0

    .line 382
    .line 383
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 384
    .line 385
    .line 386
    move-result-object v4

    .line 387
    check-cast v4, Ljava/lang/String;

    .line 388
    .line 389
    iget-object v5, p0, LVa/W;->e:Lorg/json/JSONObject;

    .line 390
    .line 391
    invoke-static {v1}, Landroid/widget/ExpandableListView;->getPackedPositionForGroup(I)J

    .line 392
    .line 393
    .line 394
    move-result-wide v6

    .line 395
    cmp-long v6, v6, v2

    .line 396
    .line 397
    rsub-int/lit8 v6, v6, 0x7f

    .line 398
    .line 399
    const-string v7, "\u0097\u0084"

    .line 400
    .line 401
    invoke-static {v6, v7}, LVa/W;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 402
    .line 403
    .line 404
    move-result-object v6

    .line 405
    invoke-virtual {v6}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 406
    .line 407
    .line 408
    move-result-object v6

    .line 409
    invoke-virtual {v5, v4, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 410
    .line 411
    .line 412
    goto :goto_0

    .line 413
    :catch_0
    :cond_0
    return-void
.end method

.method public static b(ILjava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, "ISO-8859-1"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, [B

    .line 8
    .line 9
    sget-object v0, LVa/a;->x:Ljava/lang/Object;

    .line 10
    .line 11
    monitor-enter v0

    .line 12
    :try_start_0
    sget-object v1, LVa/W;->f:[C

    .line 13
    .line 14
    array-length v2, p1

    .line 15
    sput v2, LVa/a;->w:I

    .line 16
    .line 17
    new-array v2, v2, [C

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    sput v3, LVa/a;->v:I

    .line 21
    .line 22
    :goto_0
    sget v3, LVa/a;->v:I

    .line 23
    .line 24
    sget v4, LVa/a;->w:I

    .line 25
    .line 26
    if-ge v3, v4, :cond_0

    .line 27
    .line 28
    add-int/lit8 v4, v4, -0x1

    .line 29
    .line 30
    sub-int/2addr v4, v3

    .line 31
    aget-byte v4, p1, v4

    .line 32
    .line 33
    add-int/2addr v4, p0

    .line 34
    aget-char v4, v1, v4

    .line 35
    .line 36
    add-int/lit16 v4, v4, -0x91

    .line 37
    .line 38
    int-to-char v4, v4

    .line 39
    aput-char v4, v2, v3

    .line 40
    .line 41
    add-int/lit8 v3, v3, 0x1

    .line 42
    .line 43
    sput v3, LVa/a;->v:I

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :catchall_0
    move-exception p0

    .line 47
    goto :goto_1

    .line 48
    :cond_0
    new-instance p0, Ljava/lang/String;

    .line 49
    .line 50
    invoke-direct {p0, v2}, Ljava/lang/String;-><init>([C)V

    .line 51
    .line 52
    .line 53
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    return-object p0

    .line 55
    :goto_1
    monitor-exit v0

    .line 56
    throw p0
.end method

.method public static c(Ljava/lang/String;IIIZ)Ljava/lang/String;
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
    add-int/lit8 v4, v4, -0x59

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


# virtual methods
.method public final a()I
    .locals 4

    .line 1
    sget v0, LVa/W;->h:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x9

    .line 4
    .line 5
    rem-int/lit16 v0, v0, 0x80

    .line 6
    .line 7
    sput v0, LVa/W;->g:I

    .line 8
    .line 9
    iget-object v0, p0, LVa/W;->d:Lorg/json/JSONObject;

    .line 10
    .line 11
    const/16 v1, 0x30

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    const-string v3, ""

    .line 15
    .line 16
    invoke-static {v3, v1, v2, v2}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CII)I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    rsub-int/lit8 v1, v1, 0x7e

    .line 21
    .line 22
    const-string v2, "\u0083\u0084\u008e\u008d"

    .line 23
    .line 24
    invoke-static {v1, v2}, LVa/W;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v1}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    const/16 v2, 0xbb8

    .line 33
    .line 34
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    sget v1, LVa/W;->h:I

    .line 39
    .line 40
    add-int/lit8 v1, v1, 0x69

    .line 41
    .line 42
    rem-int/lit16 v2, v1, 0x80

    .line 43
    .line 44
    sput v2, LVa/W;->g:I

    .line 45
    .line 46
    rem-int/lit8 v1, v1, 0x2

    .line 47
    .line 48
    if-nez v1, :cond_0

    .line 49
    .line 50
    return v0

    .line 51
    :cond_0
    const/4 v0, 0x0

    .line 52
    throw v0
.end method

.method public final d()Ljava/util/List;
    .locals 8

    .line 1
    sget v0, LVa/W;->g:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1d

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/W;->h:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    iget-object v1, p0, LVa/W;->b:Ljava/util/ArrayList;

    .line 12
    .line 13
    const-string v2, "\u0007\ufffa\u0000"

    .line 14
    .line 15
    const-string v3, ""

    .line 16
    .line 17
    const/4 v4, 0x1

    .line 18
    const/4 v5, 0x0

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    iget-object v0, p0, LVa/W;->d:Lorg/json/JSONObject;

    .line 22
    .line 23
    invoke-static {v4}, Landroid/graphics/Color;->red(I)I

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    mul-int/lit8 v4, v4, 0x4

    .line 28
    .line 29
    invoke-static {v3}, Landroid/text/TextUtils;->getTrimmedLength(Ljava/lang/CharSequence;)I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    add-int/lit16 v3, v3, 0x4ee8

    .line 34
    .line 35
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatTimeout()I

    .line 36
    .line 37
    .line 38
    move-result v6

    .line 39
    add-int/lit8 v6, v6, 0x62

    .line 40
    .line 41
    const/4 v7, 0x5

    .line 42
    shr-int v6, v7, v6

    .line 43
    .line 44
    invoke-static {v2, v4, v3, v6, v5}, LVa/W;->c(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    :goto_0
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-static {v0, v2, v1}, LVa/Ab;->V(Lorg/json/JSONObject;Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    return-object v0

    .line 57
    :cond_0
    iget-object v0, p0, LVa/W;->d:Lorg/json/JSONObject;

    .line 58
    .line 59
    invoke-static {v5}, Landroid/graphics/Color;->red(I)I

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    add-int/lit8 v5, v5, 0x3

    .line 64
    .line 65
    invoke-static {v3}, Landroid/text/TextUtils;->getTrimmedLength(Ljava/lang/CharSequence;)I

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    add-int/lit16 v3, v3, 0xc2

    .line 70
    .line 71
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatTimeout()I

    .line 72
    .line 73
    .line 74
    move-result v6

    .line 75
    shr-int/lit8 v6, v6, 0x10

    .line 76
    .line 77
    rsub-int/lit8 v6, v6, 0x3

    .line 78
    .line 79
    invoke-static {v2, v5, v3, v6, v4}, LVa/W;->c(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    goto :goto_0
.end method

.method public final e(LVa/Ha;)V
    .locals 7

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, Landroid/text/TextUtils;->getOffsetAfter(Ljava/lang/CharSequence;I)I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    add-int/lit8 v0, v0, 0x7f

    .line 9
    .line 10
    const-string v2, "\u008b\u008d\u0081\u008a\u0089\u008d\u0081\u0084\u008c"

    .line 11
    .line 12
    invoke-static {v0, v2}, LVa/W;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-static {v1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    add-int/lit8 v2, v2, 0x7f

    .line 25
    .line 26
    const-string v3, "\u009a\u0087\u0099"

    .line 27
    .line 28
    invoke-static {v2, v3}, LVa/W;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    new-instance v3, LVa/Ra;

    .line 37
    .line 38
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 39
    .line 40
    .line 41
    iput-object p0, v3, LVa/Ra;->a:Ljava/lang/Object;

    .line 42
    .line 43
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    new-instance v4, LVa/Oa;

    .line 47
    .line 48
    const/4 v5, 0x0

    .line 49
    invoke-direct {v4, v5, v0, v2}, LVa/Oa;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-static {}, LVa/G;->S()LVa/G;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    invoke-virtual {v5}, LVa/G;->J()LVa/E;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    invoke-virtual {v5}, LVa/E;->x()Z

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    if-eqz v5, :cond_2

    .line 65
    .line 66
    sget v4, LVa/Ha;->h:I

    .line 67
    .line 68
    add-int/lit8 v4, v4, 0x73

    .line 69
    .line 70
    rem-int/lit16 v5, v4, 0x80

    .line 71
    .line 72
    sput v5, LVa/Ha;->g:I

    .line 73
    .line 74
    rem-int/lit8 v4, v4, 0x2

    .line 75
    .line 76
    if-eqz v4, :cond_0

    .line 77
    .line 78
    invoke-static {}, LVa/G;->S()LVa/G;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    invoke-virtual {v4}, LVa/G;->J()LVa/E;

    .line 83
    .line 84
    .line 85
    move-result-object v4

    .line 86
    invoke-virtual {v4, v0}, LVa/E;->u(Ljava/lang/String;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 91
    .line 92
    .line 93
    move-result v5

    .line 94
    const/16 v6, 0x48

    .line 95
    .line 96
    div-int/2addr v6, v1

    .line 97
    if-eqz v5, :cond_1

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_0
    invoke-static {}, LVa/G;->S()LVa/G;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    invoke-virtual {v1}, LVa/G;->J()LVa/E;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    invoke-virtual {v1, v0}, LVa/E;->u(Ljava/lang/String;)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v4

    .line 112
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 113
    .line 114
    .line 115
    move-result v1

    .line 116
    if-eqz v1, :cond_1

    .line 117
    .line 118
    :goto_0
    sget p1, LVa/Ha;->g:I

    .line 119
    .line 120
    add-int/lit8 p1, p1, 0x11

    .line 121
    .line 122
    rem-int/lit16 p1, p1, 0x80

    .line 123
    .line 124
    sput p1, LVa/Ha;->h:I

    .line 125
    .line 126
    add-int/lit8 p1, p1, 0x7b

    .line 127
    .line 128
    rem-int/lit16 p1, p1, 0x80

    .line 129
    .line 130
    sput p1, LVa/Ha;->g:I

    .line 131
    .line 132
    const/4 p1, 0x0

    .line 133
    goto :goto_1

    .line 134
    :cond_1
    new-instance v1, LVa/Na;

    .line 135
    .line 136
    invoke-direct {v1, v0, v2, v4}, LVa/Na;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    move-object v4, v1

    .line 140
    :cond_2
    invoke-virtual {p1, v4, v3}, LVa/Ha;->c(LVa/Pa;LVa/ya;)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    :goto_1
    invoke-virtual {p0, p1}, LVa/W;->f(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    sget p1, LVa/W;->h:I

    .line 148
    .line 149
    add-int/lit8 p1, p1, 0x5b

    .line 150
    .line 151
    rem-int/lit16 p1, p1, 0x80

    .line 152
    .line 153
    sput p1, LVa/W;->g:I

    .line 154
    .line 155
    return-void
.end method

.method public final f(Ljava/lang/String;)V
    .locals 2

    .line 1
    sget v0, LVa/W;->h:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x2b

    .line 4
    .line 5
    rem-int/lit16 v1, v0, 0x80

    .line 6
    .line 7
    sput v1, LVa/W;->g:I

    .line 8
    .line 9
    rem-int/lit8 v0, v0, 0x2

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/16 v1, 0x56

    .line 18
    .line 19
    div-int/lit8 v1, v1, 0x0

    .line 20
    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_1

    .line 29
    .line 30
    :goto_0
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    .line 31
    .line 32
    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    iput-object v0, p0, LVa/W;->d:Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 36
    .line 37
    return-void

    .line 38
    :catch_0
    :cond_1
    sget p1, LVa/W;->g:I

    .line 39
    .line 40
    add-int/lit8 p1, p1, 0xd

    .line 41
    .line 42
    rem-int/lit16 v0, p1, 0x80

    .line 43
    .line 44
    sput v0, LVa/W;->h:I

    .line 45
    .line 46
    rem-int/lit8 p1, p1, 0x2

    .line 47
    .line 48
    if-eqz p1, :cond_2

    .line 49
    .line 50
    return-void

    .line 51
    :cond_2
    const/4 p1, 0x0

    .line 52
    throw p1
.end method
