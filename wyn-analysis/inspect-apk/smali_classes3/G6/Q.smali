.class public final LG6/Q;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, LG6/Q;->a:I

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method private final a(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    .line 1
    sget-object p2, LH6/i;->b:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter p2

    .line 4
    const/4 v0, 0x0

    .line 5
    :try_start_0
    sput-boolean v0, LH6/i;->c:Z

    .line 6
    .line 7
    sput-boolean v0, LH6/i;->d:Z

    .line 8
    .line 9
    const-string v0, "Ad debug logging enablement is out of date."

    .line 10
    .line 11
    invoke-static {v0}, LH6/l;->f(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    invoke-static {p1}, LU8/v0;->q0(Landroid/content/Context;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :catchall_0
    move-exception p1

    .line 20
    :try_start_1
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 21
    throw p1
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 10

    .line 1
    const/4 v0, -0x1

    .line 2
    const/4 v1, 0x1

    .line 3
    const/4 v2, 0x2

    .line 4
    iget v3, p0, LG6/Q;->a:I

    .line 5
    .line 6
    packed-switch v3, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    sget-object p1, LVa/qb;->a:Lorg/json/JSONObject;

    .line 10
    .line 11
    new-instance p1, Lorg/json/JSONObject;

    .line 12
    .line 13
    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    .line 14
    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    if-eqz p2, :cond_6

    .line 18
    .line 19
    sget v4, LVa/qb;->e:I

    .line 20
    .line 21
    add-int/lit8 v4, v4, 0x17

    .line 22
    .line 23
    rem-int/lit16 v5, v4, 0x80

    .line 24
    .line 25
    sput v5, LVa/qb;->d:I

    .line 26
    .line 27
    rem-int/2addr v4, v2

    .line 28
    const/4 v5, 0x7

    .line 29
    const/16 v6, 0xb7

    .line 30
    .line 31
    if-eqz v4, :cond_1

    .line 32
    .line 33
    :try_start_0
    const-string v4, "\u0000\u0000\u0001\u0000\u0000\u0000\u0001"

    .line 34
    .line 35
    filled-new-array {v6, v5, v3, v1}, [I

    .line 36
    .line 37
    .line 38
    move-result-object v7

    .line 39
    invoke-static {v4, v7, v3}, LVa/qb;->j(Ljava/lang/String;[IZ)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    invoke-virtual {p2, v4}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    if-eqz v4, :cond_0

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    move v4, v0

    .line 55
    goto :goto_1

    .line 56
    :catchall_0
    move-exception p2

    .line 57
    goto/16 :goto_6

    .line 58
    .line 59
    :cond_1
    const-string v4, "\u0000\u0000\u0001\u0000\u0000\u0000\u0001"

    .line 60
    .line 61
    filled-new-array {v6, v5, v3, v1}, [I

    .line 62
    .line 63
    .line 64
    move-result-object v7

    .line 65
    invoke-static {v4, v7, v1}, LVa/qb;->j(Ljava/lang/String;[IZ)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    invoke-virtual {p2, v4}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    if-eqz v4, :cond_0

    .line 78
    .line 79
    :goto_0
    const-string v4, "\u0000\u0000\u0001\u0000\u0000\u0000\u0001"

    .line 80
    .line 81
    filled-new-array {v6, v5, v3, v1}, [I

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    invoke-static {v4, v5, v1}, LVa/qb;->j(Ljava/lang/String;[IZ)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    invoke-virtual {p2, v4, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 94
    .line 95
    .line 96
    move-result v4

    .line 97
    :goto_1
    const-string v5, "\u0001\u0000\u0000\u0000"

    .line 98
    .line 99
    const/16 v6, 0xbe

    .line 100
    .line 101
    const/16 v7, 0xc5

    .line 102
    .line 103
    const/4 v8, 0x4

    .line 104
    filled-new-array {v6, v8, v7, v3}, [I

    .line 105
    .line 106
    .line 107
    move-result-object v6

    .line 108
    invoke-static {v5, v6, v3}, LVa/qb;->j(Ljava/lang/String;[IZ)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v5

    .line 112
    invoke-virtual {v5}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v5

    .line 116
    invoke-virtual {p1, v5, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 117
    .line 118
    .line 119
    const-string v4, "\u0001\u0001\u0001\u0001\u0001"

    .line 120
    .line 121
    const/16 v5, 0xaf

    .line 122
    .line 123
    const/16 v6, 0xc2

    .line 124
    .line 125
    const/4 v7, 0x5

    .line 126
    filled-new-array {v6, v7, v5, v3}, [I

    .line 127
    .line 128
    .line 129
    move-result-object v9

    .line 130
    invoke-static {v4, v9, v3}, LVa/qb;->j(Ljava/lang/String;[IZ)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v4

    .line 134
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v4

    .line 138
    invoke-virtual {p2, v4}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    .line 139
    .line 140
    .line 141
    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 142
    if-eqz v4, :cond_3

    .line 143
    .line 144
    sget v4, LVa/qb;->e:I

    .line 145
    .line 146
    add-int/lit8 v4, v4, 0x9

    .line 147
    .line 148
    rem-int/lit16 v9, v4, 0x80

    .line 149
    .line 150
    sput v9, LVa/qb;->d:I

    .line 151
    .line 152
    rem-int/2addr v4, v2

    .line 153
    if-eqz v4, :cond_2

    .line 154
    .line 155
    :try_start_1
    const-string v4, "\u0001\u0001\u0001\u0001\u0001"

    .line 156
    .line 157
    filled-new-array {v6, v7, v5, v3}, [I

    .line 158
    .line 159
    .line 160
    move-result-object v5

    .line 161
    invoke-static {v4, v5, v1}, LVa/qb;->j(Ljava/lang/String;[IZ)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v4

    .line 165
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v4

    .line 169
    :goto_2
    invoke-virtual {p2, v4, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 170
    .line 171
    .line 172
    move-result v4

    .line 173
    goto :goto_3

    .line 174
    :cond_2
    const-string v4, "\u0001\u0001\u0001\u0001\u0001"

    .line 175
    .line 176
    filled-new-array {v6, v7, v5, v3}, [I

    .line 177
    .line 178
    .line 179
    move-result-object v5

    .line 180
    invoke-static {v4, v5, v3}, LVa/qb;->j(Ljava/lang/String;[IZ)Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v4

    .line 184
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v4

    .line 188
    goto :goto_2

    .line 189
    :cond_3
    move v4, v0

    .line 190
    :goto_3
    const-string v5, "\ud3dc\u3dd6\u9f12\u3917\u67c3\ud431"

    .line 191
    .line 192
    invoke-static {}, Landroid/view/KeyEvent;->getModifierMetaStateMask()I

    .line 193
    .line 194
    .line 195
    move-result v6

    .line 196
    int-to-byte v6, v6

    .line 197
    add-int/lit8 v6, v6, 0x6

    .line 198
    .line 199
    invoke-static {v6, v5}, LVa/qb;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v5

    .line 203
    invoke-virtual {v5}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v5

    .line 207
    invoke-virtual {p2, v5}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    .line 208
    .line 209
    .line 210
    move-result v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 211
    if-eqz v5, :cond_5

    .line 212
    .line 213
    sget v5, LVa/qb;->e:I

    .line 214
    .line 215
    add-int/lit8 v5, v5, 0x37

    .line 216
    .line 217
    rem-int/lit16 v6, v5, 0x80

    .line 218
    .line 219
    sput v6, LVa/qb;->d:I

    .line 220
    .line 221
    rem-int/2addr v5, v2

    .line 222
    if-eqz v5, :cond_4

    .line 223
    .line 224
    :try_start_2
    const-string v5, "\ud3dc\u3dd6\u9f12\u3917\u67c3\ud431"

    .line 225
    .line 226
    invoke-static {}, Landroid/view/ViewConfiguration;->getTouchSlop()I

    .line 227
    .line 228
    .line 229
    move-result v6

    .line 230
    shl-int/lit8 v6, v6, 0x27

    .line 231
    .line 232
    ushr-int v6, v7, v6

    .line 233
    .line 234
    invoke-static {v6, v5}, LVa/qb;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v5

    .line 238
    invoke-virtual {v5}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v5

    .line 242
    :goto_4
    invoke-virtual {p2, v5, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 243
    .line 244
    .line 245
    move-result p2

    .line 246
    move v0, p2

    .line 247
    goto :goto_5

    .line 248
    :cond_4
    const-string v5, "\ud3dc\u3dd6\u9f12\u3917\u67c3\ud431"

    .line 249
    .line 250
    invoke-static {}, Landroid/view/ViewConfiguration;->getTouchSlop()I

    .line 251
    .line 252
    .line 253
    move-result v6

    .line 254
    shr-int/lit8 v6, v6, 0x8

    .line 255
    .line 256
    add-int/2addr v6, v7

    .line 257
    invoke-static {v6, v5}, LVa/qb;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v5

    .line 261
    invoke-virtual {v5}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 265
    goto :goto_4

    .line 266
    :goto_5
    sget p2, LVa/qb;->e:I

    .line 267
    .line 268
    add-int/lit8 p2, p2, 0x5f

    .line 269
    .line 270
    rem-int/lit16 p2, p2, 0x80

    .line 271
    .line 272
    sput p2, LVa/qb;->d:I

    .line 273
    .line 274
    :cond_5
    :try_start_3
    const-string p2, "\u36bb\u9c31\ud461\u6f90"

    .line 275
    .line 276
    invoke-static {v3}, Landroid/graphics/Color;->blue(I)I

    .line 277
    .line 278
    .line 279
    move-result v5

    .line 280
    add-int/2addr v5, v8

    .line 281
    invoke-static {v5, p2}, LVa/qb;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object p2

    .line 285
    invoke-virtual {p2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object p2

    .line 289
    int-to-float v4, v4

    .line 290
    const/high16 v5, 0x42c80000    # 100.0f

    .line 291
    .line 292
    mul-float/2addr v4, v5

    .line 293
    int-to-float v0, v0

    .line 294
    div-float/2addr v4, v0

    .line 295
    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    .line 296
    .line 297
    .line 298
    move-result v0

    .line 299
    invoke-virtual {p1, p2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 300
    .line 301
    .line 302
    goto :goto_7

    .line 303
    :goto_6
    const-string v0, "\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001"

    .line 304
    .line 305
    const/16 v4, 0xb

    .line 306
    .line 307
    const/16 v5, 0xa

    .line 308
    .line 309
    filled-new-array {v1, v4, v3, v5}, [I

    .line 310
    .line 311
    .line 312
    move-result-object v1

    .line 313
    invoke-static {v0, v1, v3}, LVa/qb;->j(Ljava/lang/String;[IZ)Ljava/lang/String;

    .line 314
    .line 315
    .line 316
    move-result-object v0

    .line 317
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 318
    .line 319
    .line 320
    move-result-object v0

    .line 321
    new-instance v1, Ljava/lang/StringBuilder;

    .line 322
    .line 323
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 324
    .line 325
    .line 326
    const-string v4, "\ua7a6\uf206\uf111\u978e\u5d2a\u56a0\ueb07\u7e3b\u001b\u6266\u4e54\u5147\u22e8\u4490\u5d0a\u91c6\uff3c\u65b2\u0268\uedae\u6ce9\u75e7\u0a4c\ufb91\ubbb9\u89d5\u00b7\u19d9\u256e\u1e94\ubcfc\uc38c\u9924\uda21\u5c45\u3a20\ua1c0\ue76d"

    .line 327
    .line 328
    const v5, 0x1000025

    .line 329
    .line 330
    .line 331
    invoke-static {v3, v3, v3}, Landroid/graphics/Color;->rgb(III)I

    .line 332
    .line 333
    .line 334
    move-result v6

    .line 335
    add-int/2addr v6, v5

    .line 336
    invoke-static {v6, v4}, LVa/qb;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    move-result-object v4

    .line 340
    invoke-virtual {v4}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 341
    .line 342
    .line 343
    move-result-object v4

    .line 344
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 345
    .line 346
    .line 347
    invoke-virtual {p2}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    .line 348
    .line 349
    .line 350
    move-result-object p2

    .line 351
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 352
    .line 353
    .line 354
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 355
    .line 356
    .line 357
    move-result-object p2

    .line 358
    invoke-static {v0, p2}, LVa/Ab;->x(Ljava/lang/String;Ljava/lang/String;)V

    .line 359
    .line 360
    .line 361
    :cond_6
    :goto_7
    const-class v4, LVa/qb;

    .line 362
    .line 363
    monitor-enter v4

    .line 364
    :try_start_4
    sget p2, LVa/qb;->e:I

    .line 365
    .line 366
    sput-object p1, LVa/qb;->b:Lorg/json/JSONObject;

    .line 367
    .line 368
    add-int/lit8 p2, p2, 0x43

    .line 369
    .line 370
    rem-int/lit16 p1, p2, 0x80

    .line 371
    .line 372
    sput p1, LVa/qb;->d:I

    .line 373
    .line 374
    rem-int/2addr p2, v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 375
    if-eqz p2, :cond_7

    .line 376
    .line 377
    const/16 p1, 0x51

    .line 378
    .line 379
    :try_start_5
    div-int/2addr p1, v3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 380
    :cond_7
    monitor-exit v4

    .line 381
    goto :goto_8

    .line 382
    :catchall_1
    move-exception p1

    .line 383
    :try_start_6
    throw p1

    .line 384
    :catchall_2
    move-exception p1

    .line 385
    goto :goto_9

    .line 386
    :goto_8
    return-void

    .line 387
    :goto_9
    monitor-exit v4
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 388
    throw p1

    .line 389
    :pswitch_0
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 390
    .line 391
    .line 392
    move-result-object p1

    .line 393
    const-string v3, "android.media.action.HDMI_AUDIO_PLUG"

    .line 394
    .line 395
    if-ne p1, v3, :cond_9

    .line 396
    .line 397
    const-string p1, "android.media.extra.AUDIO_PLUG_STATE"

    .line 398
    .line 399
    invoke-virtual {p2, p1, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 400
    .line 401
    .line 402
    move-result p1

    .line 403
    if-nez p1, :cond_8

    .line 404
    .line 405
    sput v1, Lp7/b;->c:I

    .line 406
    .line 407
    goto :goto_a

    .line 408
    :cond_8
    if-ne p1, v1, :cond_9

    .line 409
    .line 410
    sput v2, Lp7/b;->c:I

    .line 411
    .line 412
    :cond_9
    :goto_a
    return-void

    .line 413
    :pswitch_1
    invoke-direct {p0, p1, p2}, LG6/Q;->a(Landroid/content/Context;Landroid/content/Intent;)V

    .line 414
    .line 415
    .line 416
    return-void

    .line 417
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
