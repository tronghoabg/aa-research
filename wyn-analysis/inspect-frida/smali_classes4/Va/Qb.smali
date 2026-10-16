.class public final LVa/Qb;
.super LVa/Ba;
.source "SourceFile"


# instance fields
.field public final synthetic c:I

.field public synthetic d:Landroid/app/Activity;

.field public synthetic e:LVa/Tb;


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, LVa/Qb;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(LVa/Tb;Landroid/app/Activity;I)V
    .locals 0

    .line 2
    iput p3, p0, LVa/Qb;->c:I

    iput-object p1, p0, LVa/Qb;->e:LVa/Tb;

    iput-object p2, p0, LVa/Qb;->d:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final c()V
    .locals 13

    .line 1
    iget v0, p0, LVa/Qb;->c:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LVa/Qb;->e:LVa/Tb;

    .line 7
    .line 8
    iget-object v1, p0, LVa/Qb;->d:Landroid/app/Activity;

    .line 9
    .line 10
    invoke-static {v0, v1}, LVa/Tb;->S(LVa/Tb;Landroid/app/Activity;)Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-eqz v2, :cond_6

    .line 15
    .line 16
    new-instance v2, LVa/v;

    .line 17
    .line 18
    const/16 v3, 0x1d

    .line 19
    .line 20
    invoke-direct {v2, v3}, LVa/v;-><init>(I)V

    .line 21
    .line 22
    .line 23
    iput-object p0, v2, LVa/v;->d:Ljava/lang/Object;

    .line 24
    .line 25
    invoke-static {v2}, LVa/Cb;->e(LVa/Ba;)V

    .line 26
    .line 27
    .line 28
    sget v2, LVa/Tb;->s:I

    .line 29
    .line 30
    add-int/lit8 v2, v2, 0x1f

    .line 31
    .line 32
    rem-int/lit16 v3, v2, 0x80

    .line 33
    .line 34
    sput v3, LVa/Tb;->t:I

    .line 35
    .line 36
    rem-int/lit8 v2, v2, 0x2

    .line 37
    .line 38
    const/4 v3, 0x0

    .line 39
    iput-boolean v3, v0, LVa/Tb;->o:Z

    .line 40
    .line 41
    if-nez v2, :cond_0

    .line 42
    .line 43
    const/16 v2, 0x61

    .line 44
    .line 45
    div-int/2addr v2, v3

    .line 46
    :cond_0
    const/4 v2, 0x1

    .line 47
    invoke-static {v0, v2}, LVa/Tb;->H(LVa/Tb;Z)V

    .line 48
    .line 49
    .line 50
    invoke-static {v0}, LVa/Tb;->N(LVa/Tb;)Z

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    if-eqz v4, :cond_1

    .line 55
    .line 56
    sget v4, LVa/Tb;->t:I

    .line 57
    .line 58
    add-int/lit8 v4, v4, 0x39

    .line 59
    .line 60
    rem-int/lit16 v4, v4, 0x80

    .line 61
    .line 62
    sput v4, LVa/Tb;->s:I

    .line 63
    .line 64
    iget-boolean v5, v0, LVa/Tb;->p:Z

    .line 65
    .line 66
    add-int/lit8 v4, v4, 0x17

    .line 67
    .line 68
    rem-int/lit16 v4, v4, 0x80

    .line 69
    .line 70
    sput v4, LVa/Tb;->t:I

    .line 71
    .line 72
    if-eqz v5, :cond_5

    .line 73
    .line 74
    :cond_1
    invoke-virtual {v1}, Landroid/app/Activity;->isFinishing()Z

    .line 75
    .line 76
    .line 77
    move-result v4

    .line 78
    if-nez v4, :cond_5

    .line 79
    .line 80
    sget v4, LVa/Tb;->t:I

    .line 81
    .line 82
    add-int/lit8 v4, v4, 0x77

    .line 83
    .line 84
    rem-int/lit16 v5, v4, 0x80

    .line 85
    .line 86
    sput v5, LVa/Tb;->s:I

    .line 87
    .line 88
    rem-int/lit8 v4, v4, 0x2

    .line 89
    .line 90
    if-eqz v4, :cond_2

    .line 91
    .line 92
    invoke-static {v1}, LVa/Tb;->E(Landroid/app/Activity;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    const/16 v5, 0x23

    .line 97
    .line 98
    div-int/2addr v5, v3

    .line 99
    goto :goto_0

    .line 100
    :cond_2
    invoke-static {v1}, LVa/Tb;->E(Landroid/app/Activity;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v4

    .line 104
    :goto_0
    sget v5, LVa/Tb;->s:I

    .line 105
    .line 106
    add-int/lit8 v5, v5, 0x13

    .line 107
    .line 108
    rem-int/lit16 v5, v5, 0x80

    .line 109
    .line 110
    sput v5, LVa/Tb;->t:I

    .line 111
    .line 112
    iget-boolean v6, v0, LVa/Tb;->m:Z

    .line 113
    .line 114
    if-nez v6, :cond_4

    .line 115
    .line 116
    add-int/lit8 v5, v5, 0x53

    .line 117
    .line 118
    rem-int/lit16 v6, v5, 0x80

    .line 119
    .line 120
    sput v6, LVa/Tb;->s:I

    .line 121
    .line 122
    rem-int/lit8 v5, v5, 0x2

    .line 123
    .line 124
    if-eqz v5, :cond_3

    .line 125
    .line 126
    iput-boolean v2, v0, LVa/Tb;->m:Z

    .line 127
    .line 128
    new-instance v2, Lorg/json/JSONObject;

    .line 129
    .line 130
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 131
    .line 132
    .line 133
    :goto_1
    invoke-virtual {v0, v4, v2, v1}, LVa/Pb;->x(Ljava/lang/String;Lorg/json/JSONObject;Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    goto :goto_3

    .line 137
    :cond_3
    iput-boolean v2, v0, LVa/Tb;->m:Z

    .line 138
    .line 139
    new-instance v2, Lorg/json/JSONObject;

    .line 140
    .line 141
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 142
    .line 143
    .line 144
    goto :goto_1

    .line 145
    :cond_4
    new-instance v5, Lorg/json/JSONObject;

    .line 146
    .line 147
    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V

    .line 148
    .line 149
    .line 150
    :try_start_0
    sget-object v6, LVa/sa;->X:Ljava/lang/String;

    .line 151
    .line 152
    invoke-virtual {v5, v6, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 153
    .line 154
    .line 155
    goto :goto_2

    .line 156
    :catch_0
    move-exception v6

    .line 157
    invoke-static {v3, v3, v3, v3}, Landroid/graphics/Color;->argb(IIII)I

    .line 158
    .line 159
    .line 160
    move-result v7

    .line 161
    add-int/lit8 v7, v7, 0x11

    .line 162
    .line 163
    invoke-static {}, Landroid/view/ViewConfiguration;->getZoomControlsTimeout()J

    .line 164
    .line 165
    .line 166
    move-result-wide v8

    .line 167
    const-wide/16 v10, 0x0

    .line 168
    .line 169
    cmp-long v8, v8, v10

    .line 170
    .line 171
    invoke-static {}, Landroid/view/KeyEvent;->getMaxKeyCode()I

    .line 172
    .line 173
    .line 174
    move-result v9

    .line 175
    shr-int/lit8 v9, v9, 0x10

    .line 176
    .line 177
    add-int/lit16 v9, v9, 0xba

    .line 178
    .line 179
    const-string v10, "\u000e\uffdd\uffff\u0010\u0005\u0012\u0005\u0010\u0015\uffdd\u0000\uffe4\ufffd\n\u0000\u0008\u0001"

    .line 180
    .line 181
    invoke-static {v10, v7, v8, v9, v3}, LVa/Tb;->Q(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v7

    .line 185
    invoke-virtual {v7}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v7

    .line 189
    new-instance v8, Ljava/lang/StringBuilder;

    .line 190
    .line 191
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 192
    .line 193
    .line 194
    invoke-static {}, Landroid/os/Process;->myTid()I

    .line 195
    .line 196
    .line 197
    move-result v9

    .line 198
    shr-int/lit8 v9, v9, 0x16

    .line 199
    .line 200
    add-int/lit8 v9, v9, 0x20

    .line 201
    .line 202
    invoke-static {}, Landroid/media/AudioTrack;->getMinVolume()F

    .line 203
    .line 204
    .line 205
    move-result v10

    .line 206
    const/4 v11, 0x0

    .line 207
    cmpl-float v10, v10, v11

    .line 208
    .line 209
    add-int/lit8 v10, v10, 0xb

    .line 210
    .line 211
    invoke-static {v3}, Landroid/graphics/Color;->blue(I)I

    .line 212
    .line 213
    .line 214
    move-result v11

    .line 215
    rsub-int v11, v11, 0xb1

    .line 216
    .line 217
    const-string v12, "\u0013\u000e\t\t\u0006\uffc5\u0017\u0014\u0017\u0017\uffea\uffc5\uffdf\u0013\u0014\u0018\u000f\uffc5\u0014\u0019\uffc5\t\u0013\n\ufff8\u0019\u0014\ufff3\u0014\t\uffc5\u000c"

    .line 218
    .line 219
    invoke-static {v12, v9, v10, v11, v2}, LVa/Tb;->Q(Ljava/lang/String;IIIZ)Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object v2

    .line 223
    invoke-virtual {v2}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v2

    .line 227
    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 228
    .line 229
    .line 230
    invoke-virtual {v6}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v2

    .line 234
    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 235
    .line 236
    .line 237
    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v2

    .line 241
    invoke-static {v7, v2}, LVa/Ab;->x(Ljava/lang/String;Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    :goto_2
    invoke-virtual {v0, v4, v5, v1}, LVa/Pb;->x(Ljava/lang/String;Lorg/json/JSONObject;Ljava/lang/Object;)V

    .line 245
    .line 246
    .line 247
    :cond_5
    :goto_3
    invoke-static {v0, v3}, LVa/Tb;->P(LVa/Tb;Z)V

    .line 248
    .line 249
    .line 250
    :cond_6
    return-void

    .line 251
    :pswitch_0
    iget-object v0, p0, LVa/Qb;->e:LVa/Tb;

    .line 252
    .line 253
    iget-object v1, p0, LVa/Qb;->d:Landroid/app/Activity;

    .line 254
    .line 255
    invoke-static {v0, v1}, LVa/Tb;->S(LVa/Tb;Landroid/app/Activity;)Z

    .line 256
    .line 257
    .line 258
    move-result v1

    .line 259
    if-eqz v1, :cond_7

    .line 260
    .line 261
    invoke-static {v0}, LVa/Tb;->O(LVa/Tb;)LVa/db;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 266
    .line 267
    .line 268
    :cond_7
    return-void

    .line 269
    :pswitch_1
    iget-object v0, p0, LVa/Qb;->e:LVa/Tb;

    .line 270
    .line 271
    iget-object v1, p0, LVa/Qb;->d:Landroid/app/Activity;

    .line 272
    .line 273
    invoke-static {v0, v1}, LVa/Tb;->S(LVa/Tb;Landroid/app/Activity;)Z

    .line 274
    .line 275
    .line 276
    move-result v2

    .line 277
    if-eqz v2, :cond_9

    .line 278
    .line 279
    new-instance v2, LVa/v;

    .line 280
    .line 281
    const/16 v3, 0x1c

    .line 282
    .line 283
    invoke-direct {v2, v3}, LVa/v;-><init>(I)V

    .line 284
    .line 285
    .line 286
    iput-object p0, v2, LVa/v;->d:Ljava/lang/Object;

    .line 287
    .line 288
    invoke-static {v2}, LVa/Cb;->e(LVa/Ba;)V

    .line 289
    .line 290
    .line 291
    invoke-static {v0}, LVa/Tb;->L(LVa/Tb;)Z

    .line 292
    .line 293
    .line 294
    move-result v2

    .line 295
    if-eqz v2, :cond_9

    .line 296
    .line 297
    sget v2, LVa/Tb;->t:I

    .line 298
    .line 299
    add-int/lit8 v3, v2, 0x25

    .line 300
    .line 301
    rem-int/lit16 v3, v3, 0x80

    .line 302
    .line 303
    sput v3, LVa/Tb;->s:I

    .line 304
    .line 305
    iget-boolean v3, v0, LVa/Tb;->o:Z

    .line 306
    .line 307
    add-int/lit8 v2, v2, 0x3b

    .line 308
    .line 309
    rem-int/lit16 v4, v2, 0x80

    .line 310
    .line 311
    sput v4, LVa/Tb;->s:I

    .line 312
    .line 313
    rem-int/lit8 v2, v2, 0x2

    .line 314
    .line 315
    if-nez v2, :cond_8

    .line 316
    .line 317
    if-nez v3, :cond_9

    .line 318
    .line 319
    invoke-virtual {v1}, Landroid/app/Activity;->isFinishing()Z

    .line 320
    .line 321
    .line 322
    move-result v2

    .line 323
    if-eqz v2, :cond_9

    .line 324
    .line 325
    invoke-virtual {v0, v1}, LVa/Tb;->I(Landroid/app/Activity;)V

    .line 326
    .line 327
    .line 328
    goto :goto_4

    .line 329
    :cond_8
    const/4 v0, 0x0

    .line 330
    throw v0

    .line 331
    :cond_9
    :goto_4
    return-void

    .line 332
    :pswitch_2
    iget-object v0, p0, LVa/Qb;->e:LVa/Tb;

    .line 333
    .line 334
    iget-object v1, p0, LVa/Qb;->d:Landroid/app/Activity;

    .line 335
    .line 336
    invoke-static {v0, v1}, LVa/Tb;->S(LVa/Tb;Landroid/app/Activity;)Z

    .line 337
    .line 338
    .line 339
    move-result v1

    .line 340
    if-eqz v1, :cond_a

    .line 341
    .line 342
    invoke-static {v0}, LVa/Tb;->O(LVa/Tb;)LVa/db;

    .line 343
    .line 344
    .line 345
    move-result-object v0

    .line 346
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 347
    .line 348
    .line 349
    :cond_a
    return-void

    .line 350
    :pswitch_3
    iget-object v0, p0, LVa/Qb;->e:LVa/Tb;

    .line 351
    .line 352
    iget-object v1, p0, LVa/Qb;->d:Landroid/app/Activity;

    .line 353
    .line 354
    invoke-static {v0, v1}, LVa/Tb;->S(LVa/Tb;Landroid/app/Activity;)Z

    .line 355
    .line 356
    .line 357
    move-result v1

    .line 358
    if-eqz v1, :cond_b

    .line 359
    .line 360
    invoke-static {v0}, LVa/Tb;->O(LVa/Tb;)LVa/db;

    .line 361
    .line 362
    .line 363
    move-result-object v0

    .line 364
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 365
    .line 366
    .line 367
    :cond_b
    return-void

    .line 368
    :pswitch_4
    iget-object v0, p0, LVa/Qb;->e:LVa/Tb;

    .line 369
    .line 370
    iget-object v1, p0, LVa/Qb;->d:Landroid/app/Activity;

    .line 371
    .line 372
    invoke-static {v0, v1}, LVa/Tb;->S(LVa/Tb;Landroid/app/Activity;)Z

    .line 373
    .line 374
    .line 375
    move-result v2

    .line 376
    if-eqz v2, :cond_c

    .line 377
    .line 378
    new-instance v2, LVa/v;

    .line 379
    .line 380
    const/16 v3, 0x19

    .line 381
    .line 382
    invoke-direct {v2, v3}, LVa/v;-><init>(I)V

    .line 383
    .line 384
    .line 385
    iput-object p0, v2, LVa/v;->d:Ljava/lang/Object;

    .line 386
    .line 387
    invoke-static {v2}, LVa/Cb;->e(LVa/Ba;)V

    .line 388
    .line 389
    .line 390
    invoke-static {v0}, LVa/Tb;->L(LVa/Tb;)Z

    .line 391
    .line 392
    .line 393
    move-result v2

    .line 394
    if-eqz v2, :cond_c

    .line 395
    .line 396
    invoke-static {v0}, LVa/Tb;->N(LVa/Tb;)Z

    .line 397
    .line 398
    .line 399
    move-result v2

    .line 400
    if-eqz v2, :cond_c

    .line 401
    .line 402
    invoke-virtual {v1}, Landroid/app/Activity;->isFinishing()Z

    .line 403
    .line 404
    .line 405
    move-result v2

    .line 406
    if-eqz v2, :cond_c

    .line 407
    .line 408
    invoke-virtual {v0, v1}, LVa/Tb;->I(Landroid/app/Activity;)V

    .line 409
    .line 410
    .line 411
    :cond_c
    return-void

    .line 412
    :pswitch_5
    iget-object v0, p0, LVa/Qb;->e:LVa/Tb;

    .line 413
    .line 414
    iget-object v1, p0, LVa/Qb;->d:Landroid/app/Activity;

    .line 415
    .line 416
    invoke-static {v0, v1}, LVa/Tb;->S(LVa/Tb;Landroid/app/Activity;)Z

    .line 417
    .line 418
    .line 419
    move-result v2

    .line 420
    if-eqz v2, :cond_d

    .line 421
    .line 422
    invoke-static {v0}, LVa/Tb;->O(LVa/Tb;)LVa/db;

    .line 423
    .line 424
    .line 425
    move-result-object v0

    .line 426
    check-cast v0, LVa/q;

    .line 427
    .line 428
    invoke-virtual {v0, v1}, LVa/q;->onActivityPaused(Landroid/app/Activity;)V

    .line 429
    .line 430
    .line 431
    :cond_d
    return-void

    .line 432
    nop

    .line 433
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
