.class public final LVa/T;
.super LVa/Ba;
.source "SourceFile"


# static fields
.field public static final l:[C

.field public static m:I = 0x0

.field public static n:I = 0x1


# instance fields
.field public final synthetic c:LVa/B7;

.field public final synthetic d:LVa/r9;

.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:Z

.field public final synthetic g:LVa/Ba;

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:LVa/Z0;

.field public final synthetic j:Landroid/content/Context;

.field public final synthetic k:LVa/V;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x40

    .line 2
    .line 3
    new-array v0, v0, [C

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, LVa/T;->l:[C

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 2
        0x43s
        0x140ds
        0x28aas
        0x3d48s
        0x51eds
        0x6589s
        0x7a38s
        -0x713fs
        -0x5c9es
        -0x48c1s
        -0x344bs
        -0x1fa8s
        -0xb07s
        0x89ds
        0x1d39s
        0x31ccs
        0x49s
        0x140cs
        0x28ads
        0x3d52s
        0x51e1s
        0x658bs
        0x7a20s
        -0x7139s
        -0x5c96s
        -0x48e5s
        -0x3446s
        -0x1fafs
        -0xb48s
        -0x2481s
        -0x30b1s
        -0xc02s
        -0x19ecs
        -0x7548s
        -0x413fs
        -0x5e8as
        0x55d1s
        0x782cs
        0x6c42s
        0x10e5s
        0x3b07s
        0x2fa2s
        -0x2c3as
        -0x3989s
        -0x1572s
        -0x62f3s
        -0x7e03s
        0x28s
        0x1401s
        0x28a5s
        0x3d45s
        0x51e0s
        0x658fs
        0x7a28s
        -0x7179s
        0x28s
        0x1404s
        0x28a1s
        0x3d52s
        0x51ebs
        0x6582s
        0x7a29s
        -0x7136s
        -0x5cc7s
    .end array-data
.end method

.method public constructor <init>(LVa/V;LVa/Z0;LVa/B7;LVa/r9;LVa/Ba;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LVa/T;->k:LVa/V;

    .line 5
    .line 6
    iput-object p3, p0, LVa/T;->c:LVa/B7;

    .line 7
    .line 8
    iput-object p4, p0, LVa/T;->d:LVa/r9;

    .line 9
    .line 10
    iput-object p7, p0, LVa/T;->e:Ljava/lang/String;

    .line 11
    .line 12
    iput-boolean p9, p0, LVa/T;->f:Z

    .line 13
    .line 14
    iput-object p5, p0, LVa/T;->g:LVa/Ba;

    .line 15
    .line 16
    iput-object p8, p0, LVa/T;->h:Ljava/lang/String;

    .line 17
    .line 18
    iput-object p2, p0, LVa/T;->i:LVa/Z0;

    .line 19
    .line 20
    iput-object p6, p0, LVa/T;->j:Landroid/content/Context;

    .line 21
    .line 22
    return-void
.end method

.method public static d(IIC)Ljava/lang/String;
    .locals 9

    .line 1
    sget-object v0, LVa/Ab;->u:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    new-array v1, p1, [C

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    sput v2, LVa/Ab;->t:I

    .line 8
    .line 9
    :goto_0
    sget v2, LVa/Ab;->t:I

    .line 10
    .line 11
    if-ge v2, p1, :cond_0

    .line 12
    .line 13
    sget-object v3, LVa/T;->l:[C

    .line 14
    .line 15
    add-int v4, p0, v2

    .line 16
    .line 17
    aget-char v3, v3, v4

    .line 18
    .line 19
    int-to-long v3, v3

    .line 20
    int-to-long v5, v2

    .line 21
    const-wide v7, -0x789be2aa4ce0eb9eL    # -4.647775078093289E-273

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    mul-long/2addr v5, v7

    .line 27
    xor-long/2addr v3, v5

    .line 28
    int-to-long v5, p2

    .line 29
    xor-long/2addr v3, v5

    .line 30
    long-to-int v3, v3

    .line 31
    int-to-char v3, v3

    .line 32
    aput-char v3, v1, v2

    .line 33
    .line 34
    add-int/lit8 v2, v2, 0x1

    .line 35
    .line 36
    sput v2, LVa/Ab;->t:I

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :catchall_0
    move-exception p0

    .line 40
    goto :goto_1

    .line 41
    :cond_0
    new-instance p0, Ljava/lang/String;

    .line 42
    .line 43
    invoke-direct {p0, v1}, Ljava/lang/String;-><init>([C)V

    .line 44
    .line 45
    .line 46
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    return-object p0

    .line 48
    :goto_1
    monitor-exit v0

    .line 49
    throw p0
.end method


# virtual methods
.method public final c()V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, LVa/T;->k:LVa/V;

    .line 4
    .line 5
    invoke-static {v1}, LVa/V;->M(LVa/V;)Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    goto/16 :goto_5

    .line 16
    .line 17
    :cond_0
    iget-object v2, v0, LVa/T;->c:LVa/B7;

    .line 18
    .line 19
    if-eqz v2, :cond_10

    .line 20
    .line 21
    sget v3, LVa/T;->m:I

    .line 22
    .line 23
    add-int/lit8 v3, v3, 0x63

    .line 24
    .line 25
    rem-int/lit16 v3, v3, 0x80

    .line 26
    .line 27
    sput v3, LVa/T;->n:I

    .line 28
    .line 29
    sget v3, LVa/V;->p:I

    .line 30
    .line 31
    add-int/lit8 v3, v3, 0x43

    .line 32
    .line 33
    rem-int/lit16 v4, v3, 0x80

    .line 34
    .line 35
    sput v4, LVa/V;->q:I

    .line 36
    .line 37
    rem-int/lit8 v3, v3, 0x2

    .line 38
    .line 39
    const/4 v4, 0x0

    .line 40
    if-eqz v3, :cond_f

    .line 41
    .line 42
    invoke-virtual {v1}, LVa/V;->i()Ljava/util/ArrayList;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    iget-object v5, v0, LVa/T;->d:LVa/r9;

    .line 47
    .line 48
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    if-eqz v3, :cond_1

    .line 53
    .line 54
    goto/16 :goto_5

    .line 55
    .line 56
    :cond_1
    invoke-static {v1}, LVa/V;->A(LVa/V;)LVa/la;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    if-nez v3, :cond_2

    .line 61
    .line 62
    goto/16 :goto_5

    .line 63
    .line 64
    :cond_2
    new-instance v6, LVa/Da;

    .line 65
    .line 66
    const/4 v7, 0x7

    .line 67
    invoke-direct {v6, v7}, LVa/Da;-><init>(I)V

    .line 68
    .line 69
    .line 70
    iput-object v3, v6, LVa/Da;->f:Ljava/lang/Object;

    .line 71
    .line 72
    iget-object v3, v0, LVa/T;->e:Ljava/lang/String;

    .line 73
    .line 74
    iput-object v3, v6, LVa/Da;->d:Ljava/lang/Object;

    .line 75
    .line 76
    iput-object v2, v6, LVa/Da;->e:Ljava/lang/Object;

    .line 77
    .line 78
    invoke-static {v6}, LVa/Cb;->g(LVa/Ba;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2}, LVa/B7;->b()Z

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    iget-object v6, v0, LVa/T;->g:LVa/Ba;

    .line 86
    .line 87
    if-nez v3, :cond_4

    .line 88
    .line 89
    sget v3, LVa/T;->n:I

    .line 90
    .line 91
    add-int/lit8 v3, v3, 0x1f

    .line 92
    .line 93
    rem-int/lit16 v7, v3, 0x80

    .line 94
    .line 95
    sput v7, LVa/T;->m:I

    .line 96
    .line 97
    rem-int/lit8 v3, v3, 0x2

    .line 98
    .line 99
    if-nez v3, :cond_3

    .line 100
    .line 101
    invoke-static {v6}, LVa/Cb;->e(LVa/Ba;)V

    .line 102
    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_3
    throw v4

    .line 106
    :cond_4
    :goto_0
    sget v3, LVa/V;->p:I

    .line 107
    .line 108
    add-int/lit8 v3, v3, 0x65

    .line 109
    .line 110
    rem-int/lit16 v7, v3, 0x80

    .line 111
    .line 112
    sput v7, LVa/V;->q:I

    .line 113
    .line 114
    rem-int/lit8 v3, v3, 0x2

    .line 115
    .line 116
    if-eqz v3, :cond_e

    .line 117
    .line 118
    invoke-virtual {v2}, LVa/B7;->d()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v3

    .line 122
    const/4 v7, 0x1

    .line 123
    const/4 v8, 0x0

    .line 124
    if-eqz v3, :cond_6

    .line 125
    .line 126
    invoke-static {}, Lcom/ironsource/adqualitysdk/sdk/IronSourceAdQuality;->getSDKVersion()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v9

    .line 130
    invoke-static {v9, v3}, LVa/pb;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 131
    .line 132
    .line 133
    move-result v3

    .line 134
    if-ltz v3, :cond_5

    .line 135
    .line 136
    goto :goto_1

    .line 137
    :cond_5
    move v3, v8

    .line 138
    goto :goto_2

    .line 139
    :cond_6
    :goto_1
    sget v3, LVa/V;->p:I

    .line 140
    .line 141
    add-int/lit8 v3, v3, 0x43

    .line 142
    .line 143
    rem-int/lit16 v9, v3, 0x80

    .line 144
    .line 145
    sput v9, LVa/V;->q:I

    .line 146
    .line 147
    rem-int/lit8 v3, v3, 0x2

    .line 148
    .line 149
    if-nez v3, :cond_7

    .line 150
    .line 151
    const/16 v3, 0x15

    .line 152
    .line 153
    div-int/2addr v3, v8

    .line 154
    :cond_7
    move v3, v7

    .line 155
    :goto_2
    sget v9, LVa/V;->p:I

    .line 156
    .line 157
    add-int/lit8 v9, v9, 0x31

    .line 158
    .line 159
    rem-int/lit16 v9, v9, 0x80

    .line 160
    .line 161
    sput v9, LVa/V;->q:I

    .line 162
    .line 163
    if-eqz v3, :cond_d

    .line 164
    .line 165
    invoke-static {v8}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 166
    .line 167
    .line 168
    move-result v3

    .line 169
    int-to-char v3, v3

    .line 170
    invoke-static {v8}, Landroid/graphics/ImageFormat;->getBitsPerPixel(I)I

    .line 171
    .line 172
    .line 173
    move-result v9

    .line 174
    rsub-int/lit8 v9, v9, -0x1

    .line 175
    .line 176
    invoke-static {}, Landroid/os/Process;->getElapsedCpuTime()J

    .line 177
    .line 178
    .line 179
    move-result-wide v10

    .line 180
    const-wide/16 v12, 0x0

    .line 181
    .line 182
    cmp-long v10, v10, v12

    .line 183
    .line 184
    add-int/lit8 v10, v10, 0xf

    .line 185
    .line 186
    invoke-static {v9, v10, v3}, LVa/T;->d(IIC)Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v3

    .line 190
    invoke-virtual {v3}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v3

    .line 194
    new-instance v9, Ljava/lang/StringBuilder;

    .line 195
    .line 196
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 197
    .line 198
    .line 199
    const-string v10, ""

    .line 200
    .line 201
    const/16 v11, 0x30

    .line 202
    .line 203
    invoke-static {v10, v11}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;C)I

    .line 204
    .line 205
    .line 206
    move-result v14

    .line 207
    add-int/2addr v14, v7

    .line 208
    int-to-char v7, v14

    .line 209
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 210
    .line 211
    .line 212
    move-result-wide v14

    .line 213
    cmp-long v14, v14, v12

    .line 214
    .line 215
    rsub-int/lit8 v14, v14, 0x11

    .line 216
    .line 217
    invoke-static {v8}, Landroid/os/Process;->getThreadPriority(I)I

    .line 218
    .line 219
    .line 220
    move-result v15

    .line 221
    add-int/lit8 v15, v15, 0x14

    .line 222
    .line 223
    shr-int/lit8 v15, v15, 0x6

    .line 224
    .line 225
    add-int/lit8 v15, v15, 0xd

    .line 226
    .line 227
    invoke-static {v14, v15, v7}, LVa/T;->d(IIC)Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v7

    .line 231
    invoke-virtual {v7}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v7

    .line 235
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 236
    .line 237
    .line 238
    iget-object v7, v0, LVa/T;->h:Ljava/lang/String;

    .line 239
    .line 240
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 241
    .line 242
    .line 243
    const v14, 0xdb5f

    .line 244
    .line 245
    .line 246
    invoke-static {v10, v10, v8}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I

    .line 247
    .line 248
    .line 249
    move-result v15

    .line 250
    add-int/2addr v15, v14

    .line 251
    int-to-char v14, v15

    .line 252
    invoke-static {v12, v13}, Landroid/widget/ExpandableListView;->getPackedPositionType(J)I

    .line 253
    .line 254
    .line 255
    move-result v15

    .line 256
    rsub-int/lit8 v15, v15, 0x1d

    .line 257
    .line 258
    invoke-static {}, Landroid/view/ViewConfiguration;->getPressedStateDuration()I

    .line 259
    .line 260
    .line 261
    move-result v16

    .line 262
    shr-int/lit8 v16, v16, 0x10

    .line 263
    .line 264
    move-object/from16 v17, v4

    .line 265
    .line 266
    rsub-int/lit8 v4, v16, 0x12

    .line 267
    .line 268
    invoke-static {v15, v4, v14}, LVa/T;->d(IIC)Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v4

    .line 272
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object v4

    .line 276
    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 277
    .line 278
    .line 279
    iget-boolean v4, v0, LVa/T;->f:Z

    .line 280
    .line 281
    if-eqz v4, :cond_8

    .line 282
    .line 283
    sget v4, LVa/T;->m:I

    .line 284
    .line 285
    add-int/lit8 v4, v4, 0x5f

    .line 286
    .line 287
    rem-int/lit16 v4, v4, 0x80

    .line 288
    .line 289
    sput v4, LVa/T;->n:I

    .line 290
    .line 291
    invoke-static {v10, v8}, Landroid/text/TextUtils;->getOffsetAfter(Ljava/lang/CharSequence;I)I

    .line 292
    .line 293
    .line 294
    move-result v4

    .line 295
    int-to-char v4, v4

    .line 296
    invoke-static {}, Landroid/view/ViewConfiguration;->getJumpTapTimeout()I

    .line 297
    .line 298
    .line 299
    move-result v14

    .line 300
    shr-int/lit8 v14, v14, 0x10

    .line 301
    .line 302
    add-int/lit8 v14, v14, 0x2f

    .line 303
    .line 304
    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    .line 305
    .line 306
    .line 307
    move-result v15

    .line 308
    shr-int/lit8 v15, v15, 0x10

    .line 309
    .line 310
    add-int/lit8 v15, v15, 0x8

    .line 311
    .line 312
    goto :goto_3

    .line 313
    :cond_8
    invoke-static {}, Landroid/os/Process;->myTid()I

    .line 314
    .line 315
    .line 316
    move-result v4

    .line 317
    shr-int/lit8 v4, v4, 0x16

    .line 318
    .line 319
    int-to-char v4, v4

    .line 320
    invoke-static {v8, v8}, Landroid/view/View;->getDefaultSize(II)I

    .line 321
    .line 322
    .line 323
    move-result v14

    .line 324
    add-int/lit8 v14, v14, 0x37

    .line 325
    .line 326
    invoke-static {v8, v8}, Landroid/widget/ExpandableListView;->getPackedPositionForChild(II)J

    .line 327
    .line 328
    .line 329
    move-result-wide v15

    .line 330
    cmp-long v15, v15, v12

    .line 331
    .line 332
    rsub-int/lit8 v15, v15, 0x8

    .line 333
    .line 334
    :goto_3
    invoke-static {v14, v15, v4}, LVa/T;->d(IIC)Ljava/lang/String;

    .line 335
    .line 336
    .line 337
    move-result-object v4

    .line 338
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 339
    .line 340
    .line 341
    move-result-object v4

    .line 342
    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 343
    .line 344
    .line 345
    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 346
    .line 347
    .line 348
    move-result-object v4

    .line 349
    invoke-static {v3, v4}, LVa/a;->J(Ljava/lang/String;Ljava/lang/String;)V

    .line 350
    .line 351
    .line 352
    iget-object v3, v0, LVa/T;->i:LVa/Z0;

    .line 353
    .line 354
    invoke-virtual {v3}, LVa/Z0;->A0()Ljava/util/HashMap;

    .line 355
    .line 356
    .line 357
    move-result-object v4

    .line 358
    iput-object v4, v3, LVa/Z0;->K:Ljava/util/Map;

    .line 359
    .line 360
    invoke-static {v10, v11, v8, v8}, Landroid/text/TextUtils;->lastIndexOf(Ljava/lang/CharSequence;CII)I

    .line 361
    .line 362
    .line 363
    move-result v9

    .line 364
    add-int/lit16 v9, v9, 0x5396

    .line 365
    .line 366
    int-to-char v9, v9

    .line 367
    const v14, -0x49615262

    .line 368
    .line 369
    .line 370
    invoke-static {v12, v13}, Landroid/widget/ExpandableListView;->getPackedPositionGroup(J)I

    .line 371
    .line 372
    .line 373
    move-result v15

    .line 374
    add-int/2addr v15, v14

    .line 375
    const-string v14, "\u9eba\u9ead\u95b6\u5a53"

    .line 376
    .line 377
    move/from16 v16, v11

    .line 378
    .line 379
    const-string v11, "\ua559\udb2a\u561c\u4643\ub66a\uc1cb\u97d1\u0676\ua33a\u6208\udad0\u76ce\u930c\uc075\ua1d7\u0e26\u9f25"

    .line 380
    .line 381
    invoke-static {v9, v14, v11, v15}, LVa/Z0;->v0(CLjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    .line 382
    .line 383
    .line 384
    move-result-object v9

    .line 385
    invoke-virtual {v9}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 386
    .line 387
    .line 388
    move-result-object v9

    .line 389
    new-instance v11, LVa/X0;

    .line 390
    .line 391
    const/4 v14, 0x0

    .line 392
    invoke-direct {v11, v14}, LVa/X0;-><init>(I)V

    .line 393
    .line 394
    .line 395
    iput-object v3, v11, LVa/X0;->b:LVa/Z0;

    .line 396
    .line 397
    invoke-virtual {v4, v9, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 398
    .line 399
    .line 400
    iget-object v4, v3, LVa/Z0;->K:Ljava/util/Map;

    .line 401
    .line 402
    invoke-static/range {v16 .. v16}, Landroid/text/AndroidCharacter;->getMirror(C)C

    .line 403
    .line 404
    .line 405
    move-result v9

    .line 406
    rsub-int/lit8 v11, v9, 0x30

    .line 407
    .line 408
    int-to-short v9, v11

    .line 409
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 410
    .line 411
    .line 412
    move-result-wide v14

    .line 413
    cmp-long v11, v14, v12

    .line 414
    .line 415
    const v14, -0x4d478b2

    .line 416
    .line 417
    .line 418
    add-int/2addr v11, v14

    .line 419
    invoke-static {v8}, Landroid/os/Process;->getThreadPriority(I)I

    .line 420
    .line 421
    .line 422
    move-result v14

    .line 423
    add-int/lit8 v14, v14, 0x14

    .line 424
    .line 425
    shr-int/lit8 v14, v14, 0x6

    .line 426
    .line 427
    rsub-int/lit8 v14, v14, -0x10

    .line 428
    .line 429
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 430
    .line 431
    .line 432
    move-result v15

    .line 433
    shr-int/lit8 v15, v15, 0x16

    .line 434
    .line 435
    const v16, 0x4d8a01f9    # 2.8942314E8f

    .line 436
    .line 437
    .line 438
    sub-int v15, v16, v15

    .line 439
    .line 440
    invoke-static {v8}, Landroid/widget/ExpandableListView;->getPackedPositionForGroup(I)J

    .line 441
    .line 442
    .line 443
    move-result-wide v18

    .line 444
    cmp-long v12, v18, v12

    .line 445
    .line 446
    rsub-int/lit8 v12, v12, 0x5a

    .line 447
    .line 448
    int-to-byte v12, v12

    .line 449
    invoke-static {v11, v14, v12, v9, v15}, LVa/Z0;->z0(IIBSI)Ljava/lang/String;

    .line 450
    .line 451
    .line 452
    move-result-object v9

    .line 453
    invoke-virtual {v9}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 454
    .line 455
    .line 456
    move-result-object v9

    .line 457
    new-instance v11, LVa/X0;

    .line 458
    .line 459
    const/4 v12, 0x1

    .line 460
    invoke-direct {v11, v12}, LVa/X0;-><init>(I)V

    .line 461
    .line 462
    .line 463
    iput-object v3, v11, LVa/X0;->b:LVa/Z0;

    .line 464
    .line 465
    invoke-interface {v4, v9, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 466
    .line 467
    .line 468
    iget-object v4, v3, LVa/Z0;->K:Ljava/util/Map;

    .line 469
    .line 470
    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumDrawingCacheSize()I

    .line 471
    .line 472
    .line 473
    move-result v9

    .line 474
    shr-int/lit8 v9, v9, 0x18

    .line 475
    .line 476
    int-to-short v9, v9

    .line 477
    const v11, -0x4d478b3

    .line 478
    .line 479
    .line 480
    invoke-static {v8, v8, v8, v8}, Landroid/graphics/Color;->argb(IIII)I

    .line 481
    .line 482
    .line 483
    move-result v12

    .line 484
    sub-int/2addr v11, v12

    .line 485
    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumDrawingCacheSize()I

    .line 486
    .line 487
    .line 488
    move-result v12

    .line 489
    shr-int/lit8 v12, v12, 0x18

    .line 490
    .line 491
    add-int/lit8 v12, v12, -0x1b

    .line 492
    .line 493
    const v13, 0x4d8a020a    # 2.8942368E8f

    .line 494
    .line 495
    .line 496
    invoke-static {v10}, Landroid/view/MotionEvent;->axisFromString(Ljava/lang/String;)I

    .line 497
    .line 498
    .line 499
    move-result v10

    .line 500
    sub-int/2addr v13, v10

    .line 501
    invoke-static {v8, v8}, Landroid/view/View;->getDefaultSize(II)I

    .line 502
    .line 503
    .line 504
    move-result v10

    .line 505
    rsub-int/lit8 v10, v10, -0x7d

    .line 506
    .line 507
    int-to-byte v10, v10

    .line 508
    invoke-static {v11, v12, v10, v9, v13}, LVa/Z0;->z0(IIBSI)Ljava/lang/String;

    .line 509
    .line 510
    .line 511
    move-result-object v9

    .line 512
    invoke-virtual {v9}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 513
    .line 514
    .line 515
    move-result-object v9

    .line 516
    new-instance v10, LVa/X0;

    .line 517
    .line 518
    const/4 v11, 0x2

    .line 519
    invoke-direct {v10, v11}, LVa/X0;-><init>(I)V

    .line 520
    .line 521
    .line 522
    iput-object v3, v10, LVa/X0;->b:LVa/Z0;

    .line 523
    .line 524
    invoke-interface {v4, v9, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 525
    .line 526
    .line 527
    sget v3, LVa/Z0;->Q:I

    .line 528
    .line 529
    add-int/lit8 v3, v3, 0x51

    .line 530
    .line 531
    rem-int/lit16 v3, v3, 0x80

    .line 532
    .line 533
    sput v3, LVa/Z0;->P:I

    .line 534
    .line 535
    invoke-virtual {v2}, LVa/B7;->b()Z

    .line 536
    .line 537
    .line 538
    move-result v3

    .line 539
    if-eqz v3, :cond_a

    .line 540
    .line 541
    sget v3, LVa/T;->m:I

    .line 542
    .line 543
    add-int/lit8 v3, v3, 0xb

    .line 544
    .line 545
    rem-int/lit16 v3, v3, 0x80

    .line 546
    .line 547
    sput v3, LVa/T;->n:I

    .line 548
    .line 549
    add-int/lit8 v3, v3, 0x43

    .line 550
    .line 551
    rem-int/lit16 v4, v3, 0x80

    .line 552
    .line 553
    sput v4, LVa/T;->m:I

    .line 554
    .line 555
    rem-int/lit8 v3, v3, 0x2

    .line 556
    .line 557
    if-eqz v3, :cond_9

    .line 558
    .line 559
    invoke-static {v6}, LVa/Cb;->e(LVa/Ba;)V

    .line 560
    .line 561
    .line 562
    const/16 v3, 0x29

    .line 563
    .line 564
    div-int/2addr v3, v8

    .line 565
    goto :goto_4

    .line 566
    :cond_9
    invoke-static {v6}, LVa/Cb;->e(LVa/Ba;)V

    .line 567
    .line 568
    .line 569
    :cond_a
    :goto_4
    invoke-static {}, LVa/Kb;->u()LVa/Kb;

    .line 570
    .line 571
    .line 572
    move-result-object v3

    .line 573
    invoke-virtual {v3}, LVa/Kb;->C()Z

    .line 574
    .line 575
    .line 576
    move-result v3

    .line 577
    if-nez v3, :cond_10

    .line 578
    .line 579
    sget v3, LVa/V;->p:I

    .line 580
    .line 581
    add-int/lit8 v3, v3, 0xd

    .line 582
    .line 583
    rem-int/lit16 v4, v3, 0x80

    .line 584
    .line 585
    sput v4, LVa/V;->q:I

    .line 586
    .line 587
    rem-int/lit8 v3, v3, 0x2

    .line 588
    .line 589
    invoke-virtual {v1, v2, v7}, LVa/V;->I(LVa/B7;Ljava/lang/String;)V

    .line 590
    .line 591
    .line 592
    if-nez v3, :cond_b

    .line 593
    .line 594
    const/16 v3, 0x19

    .line 595
    .line 596
    div-int/2addr v3, v8

    .line 597
    :cond_b
    sget v3, LVa/V;->q:I

    .line 598
    .line 599
    add-int/lit8 v3, v3, 0x7d

    .line 600
    .line 601
    rem-int/lit16 v3, v3, 0x80

    .line 602
    .line 603
    sput v3, LVa/V;->p:I

    .line 604
    .line 605
    invoke-virtual {v2}, LVa/B7;->j()Ljava/lang/String;

    .line 606
    .line 607
    .line 608
    move-result-object v2

    .line 609
    invoke-static {v1, v2}, LVa/V;->E(LVa/V;Ljava/lang/String;)Z

    .line 610
    .line 611
    .line 612
    move-result v2

    .line 613
    if-nez v2, :cond_10

    .line 614
    .line 615
    sget v2, LVa/V;->p:I

    .line 616
    .line 617
    add-int/lit8 v2, v2, 0x43

    .line 618
    .line 619
    rem-int/lit16 v3, v2, 0x80

    .line 620
    .line 621
    sput v3, LVa/V;->q:I

    .line 622
    .line 623
    rem-int/lit8 v2, v2, 0x2

    .line 624
    .line 625
    if-eqz v2, :cond_c

    .line 626
    .line 627
    invoke-virtual {v1}, LVa/V;->i()Ljava/util/ArrayList;

    .line 628
    .line 629
    .line 630
    move-result-object v1

    .line 631
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 632
    .line 633
    .line 634
    return-void

    .line 635
    :cond_c
    invoke-virtual {v1}, LVa/V;->i()Ljava/util/ArrayList;

    .line 636
    .line 637
    .line 638
    throw v17

    .line 639
    :cond_d
    new-instance v1, LVa/v;

    .line 640
    .line 641
    const/4 v2, 0x2

    .line 642
    invoke-direct {v1, v2}, LVa/v;-><init>(I)V

    .line 643
    .line 644
    .line 645
    iput-object v0, v1, LVa/v;->d:Ljava/lang/Object;

    .line 646
    .line 647
    invoke-static {v1}, LVa/Cb;->g(LVa/Ba;)V

    .line 648
    .line 649
    .line 650
    return-void

    .line 651
    :cond_e
    move-object/from16 v17, v4

    .line 652
    .line 653
    invoke-virtual {v2}, LVa/B7;->d()Ljava/lang/String;

    .line 654
    .line 655
    .line 656
    throw v17

    .line 657
    :cond_f
    move-object/from16 v17, v4

    .line 658
    .line 659
    invoke-virtual {v1}, LVa/V;->i()Ljava/util/ArrayList;

    .line 660
    .line 661
    .line 662
    throw v17

    .line 663
    :cond_10
    :goto_5
    return-void
.end method
