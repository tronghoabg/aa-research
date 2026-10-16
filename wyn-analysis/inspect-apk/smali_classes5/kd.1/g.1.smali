.class public final Lkd/g;
.super Lkd/b;
.source "SourceFile"


# static fields
.field public static final synthetic e:I


# instance fields
.field public final d:LC8/i;


# direct methods
.method public constructor <init>(LC8/i;)V
    .locals 1

    .line 1
    const-string v0, "registrar"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lkd/g;->d:LC8/i;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;
    .locals 3

    .line 1
    const/16 v0, -0x80

    .line 2
    .line 3
    if-ne p1, v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0, p2}, Luc/w;->e(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const-string p2, "null cannot be cast to non-null type kotlin.Long"

    .line 10
    .line 11
    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    check-cast p1, Ljava/lang/Long;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 17
    .line 18
    .line 19
    move-result-wide p1

    .line 20
    iget-object v0, p0, Lkd/g;->d:LC8/i;

    .line 21
    .line 22
    iget-object v0, v0, LC8/i;->d:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Lkd/d;

    .line 25
    .line 26
    invoke-virtual {v0, p1, p2}, Lkd/d;->e(J)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    if-nez v0, :cond_0

    .line 31
    .line 32
    new-instance v1, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    const-string v2, "Failed to find instance with identifier: "

    .line 35
    .line 36
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    const-string p2, "PigeonProxyApiBaseCodec"

    .line 47
    .line 48
    invoke-static {p2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 49
    .line 50
    .line 51
    :cond_0
    return-object v0

    .line 52
    :cond_1
    invoke-super {p0, p1, p2}, Lkd/b;->f(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    return-object p1
.end method

.method public final k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V
    .locals 26

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
    const/16 v4, 0x17

    .line 8
    .line 9
    const/16 v5, 0xa

    .line 10
    .line 11
    const/16 v6, 0x9

    .line 12
    .line 13
    const/16 v7, 0xb

    .line 14
    .line 15
    const/16 v9, 0x18

    .line 16
    .line 17
    const/16 v16, 0x0

    .line 18
    .line 19
    const/16 v13, 0x15

    .line 20
    .line 21
    const/16 v17, 0x6

    .line 22
    .line 23
    const-string v8, "stream"

    .line 24
    .line 25
    invoke-static {v1, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    instance-of v8, v2, Ljava/lang/Boolean;

    .line 29
    .line 30
    if-nez v8, :cond_49

    .line 31
    .line 32
    instance-of v8, v2, [B

    .line 33
    .line 34
    if-nez v8, :cond_49

    .line 35
    .line 36
    instance-of v8, v2, Ljava/lang/Double;

    .line 37
    .line 38
    if-nez v8, :cond_49

    .line 39
    .line 40
    instance-of v8, v2, [D

    .line 41
    .line 42
    if-nez v8, :cond_49

    .line 43
    .line 44
    instance-of v8, v2, [F

    .line 45
    .line 46
    if-nez v8, :cond_49

    .line 47
    .line 48
    instance-of v8, v2, Ljava/lang/Integer;

    .line 49
    .line 50
    if-nez v8, :cond_49

    .line 51
    .line 52
    instance-of v8, v2, [I

    .line 53
    .line 54
    if-nez v8, :cond_49

    .line 55
    .line 56
    instance-of v8, v2, Ljava/util/List;

    .line 57
    .line 58
    if-nez v8, :cond_49

    .line 59
    .line 60
    instance-of v8, v2, Ljava/lang/Long;

    .line 61
    .line 62
    if-nez v8, :cond_49

    .line 63
    .line 64
    instance-of v8, v2, [J

    .line 65
    .line 66
    if-nez v8, :cond_49

    .line 67
    .line 68
    instance-of v8, v2, Ljava/util/Map;

    .line 69
    .line 70
    if-nez v8, :cond_49

    .line 71
    .line 72
    instance-of v8, v2, Ljava/lang/String;

    .line 73
    .line 74
    if-nez v8, :cond_49

    .line 75
    .line 76
    instance-of v8, v2, Lkd/p;

    .line 77
    .line 78
    if-nez v8, :cond_49

    .line 79
    .line 80
    instance-of v8, v2, Lkd/j;

    .line 81
    .line 82
    if-nez v8, :cond_49

    .line 83
    .line 84
    instance-of v8, v2, Lkd/v;

    .line 85
    .line 86
    if-nez v8, :cond_49

    .line 87
    .line 88
    instance-of v8, v2, Lkd/L;

    .line 89
    .line 90
    if-nez v8, :cond_49

    .line 91
    .line 92
    instance-of v8, v2, Lkd/u;

    .line 93
    .line 94
    if-nez v8, :cond_49

    .line 95
    .line 96
    if-nez v2, :cond_0

    .line 97
    .line 98
    goto/16 :goto_6

    .line 99
    .line 100
    :cond_0
    instance-of v8, v2, Landroid/webkit/WebResourceRequest;

    .line 101
    .line 102
    const/4 v3, 0x0

    .line 103
    const/16 v19, 0x5

    .line 104
    .line 105
    iget-object v10, v0, Lkd/g;->d:LC8/i;

    .line 106
    .line 107
    if-eqz v8, :cond_4

    .line 108
    .line 109
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    move-object v4, v2

    .line 113
    check-cast v4, Landroid/webkit/WebResourceRequest;

    .line 114
    .line 115
    new-instance v5, Lcom/moloco/sdk/internal/publisher/d;

    .line 116
    .line 117
    invoke-direct {v5, v13}, Lcom/moloco/sdk/internal/publisher/d;-><init>(I)V

    .line 118
    .line 119
    .line 120
    iget-object v6, v10, LC8/i;->d:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v6, Lkd/d;

    .line 123
    .line 124
    invoke-virtual {v6, v4}, Lkd/d;->d(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v8

    .line 128
    if-eqz v8, :cond_1

    .line 129
    .line 130
    goto/16 :goto_5

    .line 131
    .line 132
    :cond_1
    invoke-virtual {v6, v4}, Lkd/d;->b(Ljava/lang/Object;)J

    .line 133
    .line 134
    .line 135
    move-result-wide v20

    .line 136
    invoke-interface {v4}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    .line 137
    .line 138
    .line 139
    move-result-object v6

    .line 140
    invoke-virtual {v6}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v6

    .line 144
    invoke-interface {v4}, Landroid/webkit/WebResourceRequest;->isForMainFrame()Z

    .line 145
    .line 146
    .line 147
    move-result v8

    .line 148
    sget v13, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 149
    .line 150
    if-lt v13, v9, :cond_2

    .line 151
    .line 152
    invoke-static {v4}, Ld2/b;->y(Landroid/webkit/WebResourceRequest;)Z

    .line 153
    .line 154
    .line 155
    move-result v9

    .line 156
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 157
    .line 158
    .line 159
    move-result-object v9

    .line 160
    goto :goto_0

    .line 161
    :cond_2
    move-object v9, v3

    .line 162
    :goto_0
    invoke-interface {v4}, Landroid/webkit/WebResourceRequest;->hasGesture()Z

    .line 163
    .line 164
    .line 165
    move-result v13

    .line 166
    invoke-interface {v4}, Landroid/webkit/WebResourceRequest;->getMethod()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v18

    .line 170
    invoke-interface {v4}, Landroid/webkit/WebResourceRequest;->getRequestHeaders()Ljava/util/Map;

    .line 171
    .line 172
    .line 173
    move-result-object v22

    .line 174
    if-nez v22, :cond_3

    .line 175
    .line 176
    sget-object v4, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 177
    .line 178
    :goto_1
    const/16 v22, 0x4

    .line 179
    .line 180
    goto :goto_2

    .line 181
    :cond_3
    invoke-interface {v4}, Landroid/webkit/WebResourceRequest;->getRequestHeaders()Ljava/util/Map;

    .line 182
    .line 183
    .line 184
    move-result-object v4

    .line 185
    goto :goto_1

    .line 186
    :goto_2
    invoke-virtual {v10}, LC8/i;->q()Luc/n;

    .line 187
    .line 188
    .line 189
    move-result-object v11

    .line 190
    const/16 v23, 0x1

    .line 191
    .line 192
    new-instance v15, LVa/X7;

    .line 193
    .line 194
    const/16 v24, 0x3

    .line 195
    .line 196
    iget-object v12, v10, LC8/i;->c:Ljava/lang/Object;

    .line 197
    .line 198
    check-cast v12, Luc/f;

    .line 199
    .line 200
    const/16 v25, 0x2

    .line 201
    .line 202
    const-string v14, "dev.flutter.pigeon.webview_flutter_android.WebResourceRequest.pigeon_newInstance"

    .line 203
    .line 204
    invoke-direct {v15, v12, v11, v3, v14}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    invoke-static/range {v20 .. v21}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 208
    .line 209
    .line 210
    move-result-object v3

    .line 211
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 212
    .line 213
    .line 214
    move-result-object v8

    .line 215
    invoke-static {v13}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 216
    .line 217
    .line 218
    move-result-object v11

    .line 219
    const/4 v12, 0x7

    .line 220
    new-array v12, v12, [Ljava/lang/Object;

    .line 221
    .line 222
    aput-object v3, v12, v16

    .line 223
    .line 224
    aput-object v6, v12, v23

    .line 225
    .line 226
    aput-object v8, v12, v25

    .line 227
    .line 228
    aput-object v9, v12, v24

    .line 229
    .line 230
    aput-object v11, v12, v22

    .line 231
    .line 232
    aput-object v18, v12, v19

    .line 233
    .line 234
    aput-object v4, v12, v17

    .line 235
    .line 236
    invoke-static {v12}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 237
    .line 238
    .line 239
    move-result-object v3

    .line 240
    new-instance v4, Lkd/D;

    .line 241
    .line 242
    invoke-direct {v4, v5, v7}, Lkd/D;-><init>(Ljava/lang/Object;I)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {v15, v3, v4}, LVa/X7;->m(Ljava/lang/Object;Luc/c;)V

    .line 246
    .line 247
    .line 248
    goto/16 :goto_5

    .line 249
    .line 250
    :cond_4
    const/16 v22, 0x4

    .line 251
    .line 252
    const/16 v23, 0x1

    .line 253
    .line 254
    const/16 v24, 0x3

    .line 255
    .line 256
    const/16 v25, 0x2

    .line 257
    .line 258
    instance-of v8, v2, Landroid/webkit/WebResourceResponse;

    .line 259
    .line 260
    if-eqz v8, :cond_6

    .line 261
    .line 262
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 263
    .line 264
    .line 265
    move-object v4, v2

    .line 266
    check-cast v4, Landroid/webkit/WebResourceResponse;

    .line 267
    .line 268
    new-instance v5, Lcom/moloco/sdk/internal/publisher/d;

    .line 269
    .line 270
    invoke-direct {v5, v13}, Lcom/moloco/sdk/internal/publisher/d;-><init>(I)V

    .line 271
    .line 272
    .line 273
    iget-object v6, v10, LC8/i;->d:Ljava/lang/Object;

    .line 274
    .line 275
    check-cast v6, Lkd/d;

    .line 276
    .line 277
    invoke-virtual {v6, v4}, Lkd/d;->d(Ljava/lang/Object;)Z

    .line 278
    .line 279
    .line 280
    move-result v7

    .line 281
    if-eqz v7, :cond_5

    .line 282
    .line 283
    goto/16 :goto_5

    .line 284
    .line 285
    :cond_5
    invoke-virtual {v6, v4}, Lkd/d;->b(Ljava/lang/Object;)J

    .line 286
    .line 287
    .line 288
    move-result-wide v6

    .line 289
    invoke-virtual {v4}, Landroid/webkit/WebResourceResponse;->getStatusCode()I

    .line 290
    .line 291
    .line 292
    move-result v4

    .line 293
    int-to-long v8, v4

    .line 294
    invoke-virtual {v10}, LC8/i;->q()Luc/n;

    .line 295
    .line 296
    .line 297
    move-result-object v4

    .line 298
    new-instance v11, LVa/X7;

    .line 299
    .line 300
    iget-object v12, v10, LC8/i;->c:Ljava/lang/Object;

    .line 301
    .line 302
    check-cast v12, Luc/f;

    .line 303
    .line 304
    const-string v13, "dev.flutter.pigeon.webview_flutter_android.WebResourceResponse.pigeon_newInstance"

    .line 305
    .line 306
    invoke-direct {v11, v12, v4, v3, v13}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 307
    .line 308
    .line 309
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 310
    .line 311
    .line 312
    move-result-object v3

    .line 313
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 314
    .line 315
    .line 316
    move-result-object v4

    .line 317
    move/from16 v6, v25

    .line 318
    .line 319
    new-array v6, v6, [Ljava/lang/Long;

    .line 320
    .line 321
    aput-object v3, v6, v16

    .line 322
    .line 323
    aput-object v4, v6, v23

    .line 324
    .line 325
    invoke-static {v6}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 326
    .line 327
    .line 328
    move-result-object v3

    .line 329
    new-instance v4, Lkd/D;

    .line 330
    .line 331
    const/16 v6, 0xc

    .line 332
    .line 333
    invoke-direct {v4, v5, v6}, Lkd/D;-><init>(Ljava/lang/Object;I)V

    .line 334
    .line 335
    .line 336
    invoke-virtual {v11, v3, v4}, LVa/X7;->m(Ljava/lang/Object;Luc/c;)V

    .line 337
    .line 338
    .line 339
    goto/16 :goto_5

    .line 340
    .line 341
    :cond_6
    instance-of v8, v2, Landroid/webkit/WebResourceError;

    .line 342
    .line 343
    if-eqz v8, :cond_8

    .line 344
    .line 345
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 346
    .line 347
    .line 348
    move-object v4, v2

    .line 349
    check-cast v4, Landroid/webkit/WebResourceError;

    .line 350
    .line 351
    new-instance v5, Lcom/moloco/sdk/internal/publisher/d;

    .line 352
    .line 353
    invoke-direct {v5, v13}, Lcom/moloco/sdk/internal/publisher/d;-><init>(I)V

    .line 354
    .line 355
    .line 356
    iget-object v7, v10, LC8/i;->d:Ljava/lang/Object;

    .line 357
    .line 358
    check-cast v7, Lkd/d;

    .line 359
    .line 360
    invoke-virtual {v7, v4}, Lkd/d;->d(Ljava/lang/Object;)Z

    .line 361
    .line 362
    .line 363
    move-result v8

    .line 364
    if-eqz v8, :cond_7

    .line 365
    .line 366
    goto/16 :goto_5

    .line 367
    .line 368
    :cond_7
    invoke-virtual {v7, v4}, Lkd/d;->b(Ljava/lang/Object;)J

    .line 369
    .line 370
    .line 371
    move-result-wide v7

    .line 372
    invoke-virtual {v4}, Landroid/webkit/WebResourceError;->getErrorCode()I

    .line 373
    .line 374
    .line 375
    move-result v9

    .line 376
    int-to-long v11, v9

    .line 377
    invoke-virtual {v4}, Landroid/webkit/WebResourceError;->getDescription()Ljava/lang/CharSequence;

    .line 378
    .line 379
    .line 380
    move-result-object v4

    .line 381
    invoke-interface {v4}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 382
    .line 383
    .line 384
    move-result-object v4

    .line 385
    invoke-virtual {v10}, LC8/i;->q()Luc/n;

    .line 386
    .line 387
    .line 388
    move-result-object v9

    .line 389
    new-instance v13, LVa/X7;

    .line 390
    .line 391
    iget-object v14, v10, LC8/i;->c:Ljava/lang/Object;

    .line 392
    .line 393
    check-cast v14, Luc/f;

    .line 394
    .line 395
    const-string v15, "dev.flutter.pigeon.webview_flutter_android.WebResourceError.pigeon_newInstance"

    .line 396
    .line 397
    invoke-direct {v13, v14, v9, v3, v15}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 398
    .line 399
    .line 400
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 401
    .line 402
    .line 403
    move-result-object v3

    .line 404
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 405
    .line 406
    .line 407
    move-result-object v7

    .line 408
    move/from16 v8, v24

    .line 409
    .line 410
    new-array v8, v8, [Ljava/lang/Object;

    .line 411
    .line 412
    aput-object v3, v8, v16

    .line 413
    .line 414
    aput-object v7, v8, v23

    .line 415
    .line 416
    const/16 v25, 0x2

    .line 417
    .line 418
    aput-object v4, v8, v25

    .line 419
    .line 420
    invoke-static {v8}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 421
    .line 422
    .line 423
    move-result-object v3

    .line 424
    new-instance v4, Lkd/D;

    .line 425
    .line 426
    invoke-direct {v4, v5, v6}, Lkd/D;-><init>(Ljava/lang/Object;I)V

    .line 427
    .line 428
    .line 429
    invoke-virtual {v13, v3, v4}, LVa/X7;->m(Ljava/lang/Object;Luc/c;)V

    .line 430
    .line 431
    .line 432
    goto/16 :goto_5

    .line 433
    .line 434
    :cond_8
    instance-of v8, v2, Lx3/f;

    .line 435
    .line 436
    if-eqz v8, :cond_a

    .line 437
    .line 438
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 439
    .line 440
    .line 441
    move-object v4, v2

    .line 442
    check-cast v4, Lx3/f;

    .line 443
    .line 444
    new-instance v6, Lcom/moloco/sdk/internal/publisher/d;

    .line 445
    .line 446
    invoke-direct {v6, v13}, Lcom/moloco/sdk/internal/publisher/d;-><init>(I)V

    .line 447
    .line 448
    .line 449
    iget-object v7, v10, LC8/i;->d:Ljava/lang/Object;

    .line 450
    .line 451
    check-cast v7, Lkd/d;

    .line 452
    .line 453
    invoke-virtual {v7, v4}, Lkd/d;->d(Ljava/lang/Object;)Z

    .line 454
    .line 455
    .line 456
    move-result v8

    .line 457
    if-eqz v8, :cond_9

    .line 458
    .line 459
    goto/16 :goto_5

    .line 460
    .line 461
    :cond_9
    invoke-virtual {v7, v4}, Lkd/d;->b(Ljava/lang/Object;)J

    .line 462
    .line 463
    .line 464
    move-result-wide v7

    .line 465
    invoke-virtual {v4}, Lx3/f;->b()I

    .line 466
    .line 467
    .line 468
    move-result v9

    .line 469
    int-to-long v11, v9

    .line 470
    invoke-virtual {v4}, Lx3/f;->a()Ljava/lang/CharSequence;

    .line 471
    .line 472
    .line 473
    move-result-object v4

    .line 474
    invoke-interface {v4}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 475
    .line 476
    .line 477
    move-result-object v4

    .line 478
    invoke-virtual {v10}, LC8/i;->q()Luc/n;

    .line 479
    .line 480
    .line 481
    move-result-object v9

    .line 482
    new-instance v13, LVa/X7;

    .line 483
    .line 484
    iget-object v14, v10, LC8/i;->c:Ljava/lang/Object;

    .line 485
    .line 486
    check-cast v14, Luc/f;

    .line 487
    .line 488
    const-string v15, "dev.flutter.pigeon.webview_flutter_android.WebResourceErrorCompat.pigeon_newInstance"

    .line 489
    .line 490
    invoke-direct {v13, v14, v9, v3, v15}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 491
    .line 492
    .line 493
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 494
    .line 495
    .line 496
    move-result-object v3

    .line 497
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 498
    .line 499
    .line 500
    move-result-object v7

    .line 501
    const/4 v8, 0x3

    .line 502
    new-array v8, v8, [Ljava/lang/Object;

    .line 503
    .line 504
    aput-object v3, v8, v16

    .line 505
    .line 506
    aput-object v7, v8, v23

    .line 507
    .line 508
    const/16 v25, 0x2

    .line 509
    .line 510
    aput-object v4, v8, v25

    .line 511
    .line 512
    invoke-static {v8}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 513
    .line 514
    .line 515
    move-result-object v3

    .line 516
    new-instance v4, Lkd/D;

    .line 517
    .line 518
    invoke-direct {v4, v6, v5}, Lkd/D;-><init>(Ljava/lang/Object;I)V

    .line 519
    .line 520
    .line 521
    invoke-virtual {v13, v3, v4}, LVa/X7;->m(Ljava/lang/Object;Luc/c;)V

    .line 522
    .line 523
    .line 524
    goto/16 :goto_5

    .line 525
    .line 526
    :cond_a
    instance-of v8, v2, Lkd/Y;

    .line 527
    .line 528
    if-eqz v8, :cond_c

    .line 529
    .line 530
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 531
    .line 532
    .line 533
    move-object v5, v2

    .line 534
    check-cast v5, Lkd/Y;

    .line 535
    .line 536
    new-instance v6, Lcom/moloco/sdk/internal/publisher/d;

    .line 537
    .line 538
    invoke-direct {v6, v13}, Lcom/moloco/sdk/internal/publisher/d;-><init>(I)V

    .line 539
    .line 540
    .line 541
    iget-object v7, v10, LC8/i;->d:Ljava/lang/Object;

    .line 542
    .line 543
    check-cast v7, Lkd/d;

    .line 544
    .line 545
    invoke-virtual {v7, v5}, Lkd/d;->d(Ljava/lang/Object;)Z

    .line 546
    .line 547
    .line 548
    move-result v8

    .line 549
    if-eqz v8, :cond_b

    .line 550
    .line 551
    goto/16 :goto_5

    .line 552
    .line 553
    :cond_b
    invoke-virtual {v7, v5}, Lkd/d;->b(Ljava/lang/Object;)J

    .line 554
    .line 555
    .line 556
    move-result-wide v7

    .line 557
    invoke-virtual {v10}, LC8/i;->q()Luc/n;

    .line 558
    .line 559
    .line 560
    move-result-object v9

    .line 561
    new-instance v11, LVa/X7;

    .line 562
    .line 563
    iget-object v12, v10, LC8/i;->c:Ljava/lang/Object;

    .line 564
    .line 565
    check-cast v12, Luc/f;

    .line 566
    .line 567
    const-string v13, "dev.flutter.pigeon.webview_flutter_android.WebViewPoint.pigeon_newInstance"

    .line 568
    .line 569
    invoke-direct {v11, v12, v9, v3, v13}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 570
    .line 571
    .line 572
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 573
    .line 574
    .line 575
    move-result-object v3

    .line 576
    iget-wide v7, v5, Lkd/Y;->a:J

    .line 577
    .line 578
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 579
    .line 580
    .line 581
    move-result-object v7

    .line 582
    iget-wide v8, v5, Lkd/Y;->b:J

    .line 583
    .line 584
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 585
    .line 586
    .line 587
    move-result-object v5

    .line 588
    const/4 v8, 0x3

    .line 589
    new-array v8, v8, [Ljava/lang/Long;

    .line 590
    .line 591
    aput-object v3, v8, v16

    .line 592
    .line 593
    aput-object v7, v8, v23

    .line 594
    .line 595
    const/16 v25, 0x2

    .line 596
    .line 597
    aput-object v5, v8, v25

    .line 598
    .line 599
    invoke-static {v8}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 600
    .line 601
    .line 602
    move-result-object v3

    .line 603
    new-instance v5, Lkd/D;

    .line 604
    .line 605
    invoke-direct {v5, v6, v4}, Lkd/D;-><init>(Ljava/lang/Object;I)V

    .line 606
    .line 607
    .line 608
    invoke-virtual {v11, v3, v5}, LVa/X7;->m(Ljava/lang/Object;Luc/c;)V

    .line 609
    .line 610
    .line 611
    goto/16 :goto_5

    .line 612
    .line 613
    :cond_c
    instance-of v8, v2, Landroid/webkit/ConsoleMessage;

    .line 614
    .line 615
    if-eqz v8, :cond_13

    .line 616
    .line 617
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 618
    .line 619
    .line 620
    move-object v4, v2

    .line 621
    check-cast v4, Landroid/webkit/ConsoleMessage;

    .line 622
    .line 623
    new-instance v5, Lcom/moloco/sdk/internal/publisher/d;

    .line 624
    .line 625
    invoke-direct {v5, v13}, Lcom/moloco/sdk/internal/publisher/d;-><init>(I)V

    .line 626
    .line 627
    .line 628
    iget-object v7, v10, LC8/i;->d:Ljava/lang/Object;

    .line 629
    .line 630
    check-cast v7, Lkd/d;

    .line 631
    .line 632
    invoke-virtual {v7, v4}, Lkd/d;->d(Ljava/lang/Object;)Z

    .line 633
    .line 634
    .line 635
    move-result v8

    .line 636
    if-eqz v8, :cond_d

    .line 637
    .line 638
    goto/16 :goto_5

    .line 639
    .line 640
    :cond_d
    invoke-virtual {v7, v4}, Lkd/d;->b(Ljava/lang/Object;)J

    .line 641
    .line 642
    .line 643
    move-result-wide v7

    .line 644
    invoke-virtual {v4}, Landroid/webkit/ConsoleMessage;->lineNumber()I

    .line 645
    .line 646
    .line 647
    move-result v9

    .line 648
    int-to-long v11, v9

    .line 649
    invoke-virtual {v4}, Landroid/webkit/ConsoleMessage;->message()Ljava/lang/String;

    .line 650
    .line 651
    .line 652
    move-result-object v9

    .line 653
    sget-object v13, Lkd/k;->a:[I

    .line 654
    .line 655
    invoke-virtual {v4}, Landroid/webkit/ConsoleMessage;->messageLevel()Landroid/webkit/ConsoleMessage$MessageLevel;

    .line 656
    .line 657
    .line 658
    move-result-object v14

    .line 659
    invoke-virtual {v14}, Ljava/lang/Enum;->ordinal()I

    .line 660
    .line 661
    .line 662
    move-result v14

    .line 663
    aget v13, v13, v14

    .line 664
    .line 665
    move/from16 v14, v23

    .line 666
    .line 667
    if-eq v13, v14, :cond_12

    .line 668
    .line 669
    const/4 v14, 0x2

    .line 670
    if-eq v13, v14, :cond_11

    .line 671
    .line 672
    const/4 v14, 0x3

    .line 673
    if-eq v13, v14, :cond_10

    .line 674
    .line 675
    move/from16 v14, v22

    .line 676
    .line 677
    if-eq v13, v14, :cond_f

    .line 678
    .line 679
    move/from16 v14, v19

    .line 680
    .line 681
    if-eq v13, v14, :cond_e

    .line 682
    .line 683
    sget-object v13, Lkd/j;->h:Lkd/j;

    .line 684
    .line 685
    goto :goto_3

    .line 686
    :cond_e
    sget-object v13, Lkd/j;->c:Lkd/j;

    .line 687
    .line 688
    goto :goto_3

    .line 689
    :cond_f
    sget-object v13, Lkd/j;->d:Lkd/j;

    .line 690
    .line 691
    goto :goto_3

    .line 692
    :cond_10
    sget-object v13, Lkd/j;->g:Lkd/j;

    .line 693
    .line 694
    goto :goto_3

    .line 695
    :cond_11
    sget-object v13, Lkd/j;->e:Lkd/j;

    .line 696
    .line 697
    goto :goto_3

    .line 698
    :cond_12
    sget-object v13, Lkd/j;->f:Lkd/j;

    .line 699
    .line 700
    :goto_3
    invoke-virtual {v4}, Landroid/webkit/ConsoleMessage;->sourceId()Ljava/lang/String;

    .line 701
    .line 702
    .line 703
    move-result-object v4

    .line 704
    invoke-virtual {v10}, LC8/i;->q()Luc/n;

    .line 705
    .line 706
    .line 707
    move-result-object v14

    .line 708
    new-instance v15, LVa/X7;

    .line 709
    .line 710
    iget-object v6, v10, LC8/i;->c:Ljava/lang/Object;

    .line 711
    .line 712
    check-cast v6, Luc/f;

    .line 713
    .line 714
    move-object/from16 v17, v4

    .line 715
    .line 716
    const-string v4, "dev.flutter.pigeon.webview_flutter_android.ConsoleMessage.pigeon_newInstance"

    .line 717
    .line 718
    invoke-direct {v15, v6, v14, v3, v4}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 719
    .line 720
    .line 721
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 722
    .line 723
    .line 724
    move-result-object v3

    .line 725
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 726
    .line 727
    .line 728
    move-result-object v4

    .line 729
    const/4 v14, 0x5

    .line 730
    new-array v6, v14, [Ljava/lang/Object;

    .line 731
    .line 732
    aput-object v3, v6, v16

    .line 733
    .line 734
    const/16 v23, 0x1

    .line 735
    .line 736
    aput-object v4, v6, v23

    .line 737
    .line 738
    const/16 v25, 0x2

    .line 739
    .line 740
    aput-object v9, v6, v25

    .line 741
    .line 742
    const/16 v24, 0x3

    .line 743
    .line 744
    aput-object v13, v6, v24

    .line 745
    .line 746
    const/16 v22, 0x4

    .line 747
    .line 748
    aput-object v17, v6, v22

    .line 749
    .line 750
    invoke-static {v6}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 751
    .line 752
    .line 753
    move-result-object v3

    .line 754
    new-instance v4, Lk2/c;

    .line 755
    .line 756
    const/16 v6, 0x9

    .line 757
    .line 758
    invoke-direct {v4, v5, v6}, Lk2/c;-><init>(Ljava/lang/Object;I)V

    .line 759
    .line 760
    .line 761
    invoke-virtual {v15, v3, v4}, LVa/X7;->m(Ljava/lang/Object;Luc/c;)V

    .line 762
    .line 763
    .line 764
    goto/16 :goto_5

    .line 765
    .line 766
    :cond_13
    instance-of v6, v2, Landroid/webkit/CookieManager;

    .line 767
    .line 768
    if-eqz v6, :cond_15

    .line 769
    .line 770
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 771
    .line 772
    .line 773
    move-object v4, v2

    .line 774
    check-cast v4, Landroid/webkit/CookieManager;

    .line 775
    .line 776
    new-instance v6, Lcom/moloco/sdk/internal/publisher/d;

    .line 777
    .line 778
    invoke-direct {v6, v13}, Lcom/moloco/sdk/internal/publisher/d;-><init>(I)V

    .line 779
    .line 780
    .line 781
    iget-object v7, v10, LC8/i;->d:Ljava/lang/Object;

    .line 782
    .line 783
    check-cast v7, Lkd/d;

    .line 784
    .line 785
    invoke-virtual {v7, v4}, Lkd/d;->d(Ljava/lang/Object;)Z

    .line 786
    .line 787
    .line 788
    move-result v8

    .line 789
    if-eqz v8, :cond_14

    .line 790
    .line 791
    goto/16 :goto_5

    .line 792
    .line 793
    :cond_14
    invoke-virtual {v7, v4}, Lkd/d;->b(Ljava/lang/Object;)J

    .line 794
    .line 795
    .line 796
    move-result-wide v7

    .line 797
    invoke-virtual {v10}, LC8/i;->q()Luc/n;

    .line 798
    .line 799
    .line 800
    move-result-object v4

    .line 801
    new-instance v9, LVa/X7;

    .line 802
    .line 803
    iget-object v11, v10, LC8/i;->c:Ljava/lang/Object;

    .line 804
    .line 805
    check-cast v11, Luc/f;

    .line 806
    .line 807
    const-string v12, "dev.flutter.pigeon.webview_flutter_android.CookieManager.pigeon_newInstance"

    .line 808
    .line 809
    invoke-direct {v9, v11, v4, v3, v12}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 810
    .line 811
    .line 812
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 813
    .line 814
    .line 815
    move-result-object v3

    .line 816
    invoke-static {v3}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 817
    .line 818
    .line 819
    move-result-object v3

    .line 820
    new-instance v4, Lk2/c;

    .line 821
    .line 822
    invoke-direct {v4, v6, v5}, Lk2/c;-><init>(Ljava/lang/Object;I)V

    .line 823
    .line 824
    .line 825
    invoke-virtual {v9, v3, v4}, LVa/X7;->m(Ljava/lang/Object;Luc/c;)V

    .line 826
    .line 827
    .line 828
    goto/16 :goto_5

    .line 829
    .line 830
    :cond_15
    instance-of v5, v2, Landroid/webkit/WebView;

    .line 831
    .line 832
    if-eqz v5, :cond_17

    .line 833
    .line 834
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 835
    .line 836
    .line 837
    move-object v4, v2

    .line 838
    check-cast v4, Landroid/webkit/WebView;

    .line 839
    .line 840
    new-instance v5, Lcom/moloco/sdk/internal/publisher/d;

    .line 841
    .line 842
    invoke-direct {v5, v13}, Lcom/moloco/sdk/internal/publisher/d;-><init>(I)V

    .line 843
    .line 844
    .line 845
    iget-object v6, v10, LC8/i;->d:Ljava/lang/Object;

    .line 846
    .line 847
    check-cast v6, Lkd/d;

    .line 848
    .line 849
    invoke-virtual {v6, v4}, Lkd/d;->d(Ljava/lang/Object;)Z

    .line 850
    .line 851
    .line 852
    move-result v7

    .line 853
    if-eqz v7, :cond_16

    .line 854
    .line 855
    goto/16 :goto_5

    .line 856
    .line 857
    :cond_16
    invoke-virtual {v6, v4}, Lkd/d;->b(Ljava/lang/Object;)J

    .line 858
    .line 859
    .line 860
    move-result-wide v6

    .line 861
    invoke-virtual {v10}, LC8/i;->q()Luc/n;

    .line 862
    .line 863
    .line 864
    move-result-object v4

    .line 865
    new-instance v8, LVa/X7;

    .line 866
    .line 867
    iget-object v9, v10, LC8/i;->c:Ljava/lang/Object;

    .line 868
    .line 869
    check-cast v9, Luc/f;

    .line 870
    .line 871
    const-string v11, "dev.flutter.pigeon.webview_flutter_android.WebView.pigeon_newInstance"

    .line 872
    .line 873
    invoke-direct {v8, v9, v4, v3, v11}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 874
    .line 875
    .line 876
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 877
    .line 878
    .line 879
    move-result-object v3

    .line 880
    invoke-static {v3}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 881
    .line 882
    .line 883
    move-result-object v3

    .line 884
    new-instance v4, Lkd/D;

    .line 885
    .line 886
    const/16 v6, 0x11

    .line 887
    .line 888
    invoke-direct {v4, v5, v6}, Lkd/D;-><init>(Ljava/lang/Object;I)V

    .line 889
    .line 890
    .line 891
    invoke-virtual {v8, v3, v4}, LVa/X7;->m(Ljava/lang/Object;Luc/c;)V

    .line 892
    .line 893
    .line 894
    goto/16 :goto_5

    .line 895
    .line 896
    :cond_17
    instance-of v5, v2, Landroid/webkit/WebSettings;

    .line 897
    .line 898
    if-eqz v5, :cond_19

    .line 899
    .line 900
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 901
    .line 902
    .line 903
    move-object v4, v2

    .line 904
    check-cast v4, Landroid/webkit/WebSettings;

    .line 905
    .line 906
    new-instance v5, Lcom/moloco/sdk/internal/publisher/d;

    .line 907
    .line 908
    invoke-direct {v5, v13}, Lcom/moloco/sdk/internal/publisher/d;-><init>(I)V

    .line 909
    .line 910
    .line 911
    iget-object v6, v10, LC8/i;->d:Ljava/lang/Object;

    .line 912
    .line 913
    check-cast v6, Lkd/d;

    .line 914
    .line 915
    invoke-virtual {v6, v4}, Lkd/d;->d(Ljava/lang/Object;)Z

    .line 916
    .line 917
    .line 918
    move-result v7

    .line 919
    if-eqz v7, :cond_18

    .line 920
    .line 921
    goto/16 :goto_5

    .line 922
    .line 923
    :cond_18
    invoke-virtual {v6, v4}, Lkd/d;->b(Ljava/lang/Object;)J

    .line 924
    .line 925
    .line 926
    move-result-wide v6

    .line 927
    invoke-virtual {v10}, LC8/i;->q()Luc/n;

    .line 928
    .line 929
    .line 930
    move-result-object v4

    .line 931
    new-instance v8, LVa/X7;

    .line 932
    .line 933
    iget-object v9, v10, LC8/i;->c:Ljava/lang/Object;

    .line 934
    .line 935
    check-cast v9, Luc/f;

    .line 936
    .line 937
    const-string v11, "dev.flutter.pigeon.webview_flutter_android.WebSettings.pigeon_newInstance"

    .line 938
    .line 939
    invoke-direct {v8, v9, v4, v3, v11}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 940
    .line 941
    .line 942
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 943
    .line 944
    .line 945
    move-result-object v3

    .line 946
    invoke-static {v3}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 947
    .line 948
    .line 949
    move-result-object v3

    .line 950
    new-instance v4, Lkd/D;

    .line 951
    .line 952
    const/16 v6, 0xd

    .line 953
    .line 954
    invoke-direct {v4, v5, v6}, Lkd/D;-><init>(Ljava/lang/Object;I)V

    .line 955
    .line 956
    .line 957
    invoke-virtual {v8, v3, v4}, LVa/X7;->m(Ljava/lang/Object;Luc/c;)V

    .line 958
    .line 959
    .line 960
    goto/16 :goto_5

    .line 961
    .line 962
    :cond_19
    instance-of v5, v2, Lkd/t;

    .line 963
    .line 964
    const-string v6, "new-instance-error"

    .line 965
    .line 966
    const-string v8, ""

    .line 967
    .line 968
    if-eqz v5, :cond_1b

    .line 969
    .line 970
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 971
    .line 972
    .line 973
    move-object v3, v2

    .line 974
    check-cast v3, Lkd/t;

    .line 975
    .line 976
    iget-object v4, v10, LC8/i;->d:Ljava/lang/Object;

    .line 977
    .line 978
    check-cast v4, Lkd/d;

    .line 979
    .line 980
    invoke-virtual {v4, v3}, Lkd/d;->d(Ljava/lang/Object;)Z

    .line 981
    .line 982
    .line 983
    move-result v3

    .line 984
    if-eqz v3, :cond_1a

    .line 985
    .line 986
    goto/16 :goto_5

    .line 987
    .line 988
    :cond_1a
    const-string v3, "Attempting to create a new Dart instance of JavaScriptChannel, but the class has a nonnull callback method."

    .line 989
    .line 990
    invoke-static {v6, v3, v8}, Lka/n;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 991
    .line 992
    .line 993
    goto/16 :goto_5

    .line 994
    .line 995
    :cond_1b
    instance-of v5, v2, Landroid/webkit/WebViewClient;

    .line 996
    .line 997
    if-eqz v5, :cond_1d

    .line 998
    .line 999
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1000
    .line 1001
    .line 1002
    move-object v4, v2

    .line 1003
    check-cast v4, Landroid/webkit/WebViewClient;

    .line 1004
    .line 1005
    new-instance v5, Lcom/moloco/sdk/internal/publisher/d;

    .line 1006
    .line 1007
    invoke-direct {v5, v13}, Lcom/moloco/sdk/internal/publisher/d;-><init>(I)V

    .line 1008
    .line 1009
    .line 1010
    iget-object v6, v10, LC8/i;->d:Ljava/lang/Object;

    .line 1011
    .line 1012
    check-cast v6, Lkd/d;

    .line 1013
    .line 1014
    invoke-virtual {v6, v4}, Lkd/d;->d(Ljava/lang/Object;)Z

    .line 1015
    .line 1016
    .line 1017
    move-result v7

    .line 1018
    if-eqz v7, :cond_1c

    .line 1019
    .line 1020
    goto/16 :goto_5

    .line 1021
    .line 1022
    :cond_1c
    invoke-virtual {v6, v4}, Lkd/d;->b(Ljava/lang/Object;)J

    .line 1023
    .line 1024
    .line 1025
    move-result-wide v6

    .line 1026
    invoke-virtual {v10}, LC8/i;->q()Luc/n;

    .line 1027
    .line 1028
    .line 1029
    move-result-object v4

    .line 1030
    new-instance v8, LVa/X7;

    .line 1031
    .line 1032
    iget-object v9, v10, LC8/i;->c:Ljava/lang/Object;

    .line 1033
    .line 1034
    check-cast v9, Luc/f;

    .line 1035
    .line 1036
    const-string v11, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.pigeon_newInstance"

    .line 1037
    .line 1038
    invoke-direct {v8, v9, v4, v3, v11}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 1039
    .line 1040
    .line 1041
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1042
    .line 1043
    .line 1044
    move-result-object v3

    .line 1045
    invoke-static {v3}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 1046
    .line 1047
    .line 1048
    move-result-object v3

    .line 1049
    new-instance v4, Lkd/D;

    .line 1050
    .line 1051
    const/16 v6, 0x13

    .line 1052
    .line 1053
    invoke-direct {v4, v5, v6}, Lkd/D;-><init>(Ljava/lang/Object;I)V

    .line 1054
    .line 1055
    .line 1056
    invoke-virtual {v8, v3, v4}, LVa/X7;->m(Ljava/lang/Object;Luc/c;)V

    .line 1057
    .line 1058
    .line 1059
    goto/16 :goto_5

    .line 1060
    .line 1061
    :cond_1d
    instance-of v5, v2, Landroid/webkit/DownloadListener;

    .line 1062
    .line 1063
    if-eqz v5, :cond_1f

    .line 1064
    .line 1065
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1066
    .line 1067
    .line 1068
    move-object v3, v2

    .line 1069
    check-cast v3, Landroid/webkit/DownloadListener;

    .line 1070
    .line 1071
    iget-object v4, v10, LC8/i;->d:Ljava/lang/Object;

    .line 1072
    .line 1073
    check-cast v4, Lkd/d;

    .line 1074
    .line 1075
    invoke-virtual {v4, v3}, Lkd/d;->d(Ljava/lang/Object;)Z

    .line 1076
    .line 1077
    .line 1078
    move-result v3

    .line 1079
    if-eqz v3, :cond_1e

    .line 1080
    .line 1081
    goto/16 :goto_5

    .line 1082
    .line 1083
    :cond_1e
    const-string v3, "Attempting to create a new Dart instance of DownloadListener, but the class has a nonnull callback method."

    .line 1084
    .line 1085
    invoke-static {v6, v3, v8}, Lka/n;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1086
    .line 1087
    .line 1088
    goto/16 :goto_5

    .line 1089
    .line 1090
    :cond_1f
    instance-of v5, v2, Lkd/P;

    .line 1091
    .line 1092
    if-eqz v5, :cond_21

    .line 1093
    .line 1094
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1095
    .line 1096
    .line 1097
    move-object v3, v2

    .line 1098
    check-cast v3, Lkd/P;

    .line 1099
    .line 1100
    iget-object v4, v10, LC8/i;->d:Ljava/lang/Object;

    .line 1101
    .line 1102
    check-cast v4, Lkd/d;

    .line 1103
    .line 1104
    invoke-virtual {v4, v3}, Lkd/d;->d(Ljava/lang/Object;)Z

    .line 1105
    .line 1106
    .line 1107
    move-result v3

    .line 1108
    if-eqz v3, :cond_20

    .line 1109
    .line 1110
    goto/16 :goto_5

    .line 1111
    .line 1112
    :cond_20
    const-string v3, "Attempting to create a new Dart instance of WebChromeClient, but the class has a nonnull callback method."

    .line 1113
    .line 1114
    invoke-static {v6, v3, v8}, Lka/n;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1115
    .line 1116
    .line 1117
    goto/16 :goto_5

    .line 1118
    .line 1119
    :cond_21
    instance-of v5, v2, Lkd/q;

    .line 1120
    .line 1121
    if-eqz v5, :cond_23

    .line 1122
    .line 1123
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1124
    .line 1125
    .line 1126
    move-object v4, v2

    .line 1127
    check-cast v4, Lkd/q;

    .line 1128
    .line 1129
    new-instance v5, Lcom/moloco/sdk/internal/publisher/d;

    .line 1130
    .line 1131
    invoke-direct {v5, v13}, Lcom/moloco/sdk/internal/publisher/d;-><init>(I)V

    .line 1132
    .line 1133
    .line 1134
    iget-object v6, v10, LC8/i;->d:Ljava/lang/Object;

    .line 1135
    .line 1136
    check-cast v6, Lkd/d;

    .line 1137
    .line 1138
    invoke-virtual {v6, v4}, Lkd/d;->d(Ljava/lang/Object;)Z

    .line 1139
    .line 1140
    .line 1141
    move-result v7

    .line 1142
    if-eqz v7, :cond_22

    .line 1143
    .line 1144
    goto/16 :goto_5

    .line 1145
    .line 1146
    :cond_22
    invoke-virtual {v6, v4}, Lkd/d;->b(Ljava/lang/Object;)J

    .line 1147
    .line 1148
    .line 1149
    move-result-wide v6

    .line 1150
    invoke-virtual {v10}, LC8/i;->q()Luc/n;

    .line 1151
    .line 1152
    .line 1153
    move-result-object v4

    .line 1154
    new-instance v8, LVa/X7;

    .line 1155
    .line 1156
    iget-object v9, v10, LC8/i;->c:Ljava/lang/Object;

    .line 1157
    .line 1158
    check-cast v9, Luc/f;

    .line 1159
    .line 1160
    const-string v11, "dev.flutter.pigeon.webview_flutter_android.FlutterAssetManager.pigeon_newInstance"

    .line 1161
    .line 1162
    invoke-direct {v8, v9, v4, v3, v11}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 1163
    .line 1164
    .line 1165
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1166
    .line 1167
    .line 1168
    move-result-object v3

    .line 1169
    invoke-static {v3}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 1170
    .line 1171
    .line 1172
    move-result-object v3

    .line 1173
    new-instance v4, Lk2/c;

    .line 1174
    .line 1175
    const/16 v6, 0xf

    .line 1176
    .line 1177
    invoke-direct {v4, v5, v6}, Lk2/c;-><init>(Ljava/lang/Object;I)V

    .line 1178
    .line 1179
    .line 1180
    invoke-virtual {v8, v3, v4}, LVa/X7;->m(Ljava/lang/Object;Luc/c;)V

    .line 1181
    .line 1182
    .line 1183
    goto/16 :goto_5

    .line 1184
    .line 1185
    :cond_23
    instance-of v5, v2, Landroid/webkit/WebStorage;

    .line 1186
    .line 1187
    if-eqz v5, :cond_25

    .line 1188
    .line 1189
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1190
    .line 1191
    .line 1192
    move-object v4, v2

    .line 1193
    check-cast v4, Landroid/webkit/WebStorage;

    .line 1194
    .line 1195
    new-instance v5, Lcom/moloco/sdk/internal/publisher/d;

    .line 1196
    .line 1197
    invoke-direct {v5, v13}, Lcom/moloco/sdk/internal/publisher/d;-><init>(I)V

    .line 1198
    .line 1199
    .line 1200
    iget-object v6, v10, LC8/i;->d:Ljava/lang/Object;

    .line 1201
    .line 1202
    check-cast v6, Lkd/d;

    .line 1203
    .line 1204
    invoke-virtual {v6, v4}, Lkd/d;->d(Ljava/lang/Object;)Z

    .line 1205
    .line 1206
    .line 1207
    move-result v7

    .line 1208
    if-eqz v7, :cond_24

    .line 1209
    .line 1210
    goto/16 :goto_5

    .line 1211
    .line 1212
    :cond_24
    invoke-virtual {v6, v4}, Lkd/d;->b(Ljava/lang/Object;)J

    .line 1213
    .line 1214
    .line 1215
    move-result-wide v6

    .line 1216
    invoke-virtual {v10}, LC8/i;->q()Luc/n;

    .line 1217
    .line 1218
    .line 1219
    move-result-object v4

    .line 1220
    new-instance v8, LVa/X7;

    .line 1221
    .line 1222
    iget-object v9, v10, LC8/i;->c:Ljava/lang/Object;

    .line 1223
    .line 1224
    check-cast v9, Luc/f;

    .line 1225
    .line 1226
    const-string v11, "dev.flutter.pigeon.webview_flutter_android.WebStorage.pigeon_newInstance"

    .line 1227
    .line 1228
    invoke-direct {v8, v9, v4, v3, v11}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 1229
    .line 1230
    .line 1231
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1232
    .line 1233
    .line 1234
    move-result-object v3

    .line 1235
    invoke-static {v3}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 1236
    .line 1237
    .line 1238
    move-result-object v3

    .line 1239
    new-instance v4, Lkd/D;

    .line 1240
    .line 1241
    const/16 v6, 0xf

    .line 1242
    .line 1243
    invoke-direct {v4, v5, v6}, Lkd/D;-><init>(Ljava/lang/Object;I)V

    .line 1244
    .line 1245
    .line 1246
    invoke-virtual {v8, v3, v4}, LVa/X7;->m(Ljava/lang/Object;Luc/c;)V

    .line 1247
    .line 1248
    .line 1249
    goto/16 :goto_5

    .line 1250
    .line 1251
    :cond_25
    instance-of v5, v2, Landroid/webkit/WebChromeClient$FileChooserParams;

    .line 1252
    .line 1253
    if-eqz v5, :cond_2a

    .line 1254
    .line 1255
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1256
    .line 1257
    .line 1258
    move-object v4, v2

    .line 1259
    check-cast v4, Landroid/webkit/WebChromeClient$FileChooserParams;

    .line 1260
    .line 1261
    new-instance v5, Lcom/moloco/sdk/internal/publisher/d;

    .line 1262
    .line 1263
    invoke-direct {v5, v13}, Lcom/moloco/sdk/internal/publisher/d;-><init>(I)V

    .line 1264
    .line 1265
    .line 1266
    iget-object v6, v10, LC8/i;->d:Ljava/lang/Object;

    .line 1267
    .line 1268
    check-cast v6, Lkd/d;

    .line 1269
    .line 1270
    invoke-virtual {v6, v4}, Lkd/d;->d(Ljava/lang/Object;)Z

    .line 1271
    .line 1272
    .line 1273
    move-result v7

    .line 1274
    if-eqz v7, :cond_26

    .line 1275
    .line 1276
    goto/16 :goto_5

    .line 1277
    .line 1278
    :cond_26
    invoke-virtual {v6, v4}, Lkd/d;->b(Ljava/lang/Object;)J

    .line 1279
    .line 1280
    .line 1281
    move-result-wide v6

    .line 1282
    invoke-virtual {v4}, Landroid/webkit/WebChromeClient$FileChooserParams;->isCaptureEnabled()Z

    .line 1283
    .line 1284
    .line 1285
    move-result v8

    .line 1286
    invoke-virtual {v4}, Landroid/webkit/WebChromeClient$FileChooserParams;->getAcceptTypes()[Ljava/lang/String;

    .line 1287
    .line 1288
    .line 1289
    move-result-object v9

    .line 1290
    invoke-static {v9}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 1291
    .line 1292
    .line 1293
    move-result-object v9

    .line 1294
    invoke-virtual {v4}, Landroid/webkit/WebChromeClient$FileChooserParams;->getMode()I

    .line 1295
    .line 1296
    .line 1297
    move-result v11

    .line 1298
    if-eqz v11, :cond_29

    .line 1299
    .line 1300
    const/4 v14, 0x1

    .line 1301
    if-eq v11, v14, :cond_28

    .line 1302
    .line 1303
    const/4 v14, 0x3

    .line 1304
    if-eq v11, v14, :cond_27

    .line 1305
    .line 1306
    sget-object v11, Lkd/p;->f:Lkd/p;

    .line 1307
    .line 1308
    goto :goto_4

    .line 1309
    :cond_27
    sget-object v11, Lkd/p;->e:Lkd/p;

    .line 1310
    .line 1311
    goto :goto_4

    .line 1312
    :cond_28
    sget-object v11, Lkd/p;->d:Lkd/p;

    .line 1313
    .line 1314
    goto :goto_4

    .line 1315
    :cond_29
    sget-object v11, Lkd/p;->c:Lkd/p;

    .line 1316
    .line 1317
    :goto_4
    invoke-virtual {v4}, Landroid/webkit/WebChromeClient$FileChooserParams;->getFilenameHint()Ljava/lang/String;

    .line 1318
    .line 1319
    .line 1320
    move-result-object v4

    .line 1321
    invoke-virtual {v10}, LC8/i;->q()Luc/n;

    .line 1322
    .line 1323
    .line 1324
    move-result-object v12

    .line 1325
    new-instance v13, LVa/X7;

    .line 1326
    .line 1327
    iget-object v14, v10, LC8/i;->c:Ljava/lang/Object;

    .line 1328
    .line 1329
    check-cast v14, Luc/f;

    .line 1330
    .line 1331
    const-string v15, "dev.flutter.pigeon.webview_flutter_android.FileChooserParams.pigeon_newInstance"

    .line 1332
    .line 1333
    invoke-direct {v13, v14, v12, v3, v15}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 1334
    .line 1335
    .line 1336
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1337
    .line 1338
    .line 1339
    move-result-object v3

    .line 1340
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1341
    .line 1342
    .line 1343
    move-result-object v6

    .line 1344
    const/4 v14, 0x5

    .line 1345
    new-array v7, v14, [Ljava/lang/Object;

    .line 1346
    .line 1347
    aput-object v3, v7, v16

    .line 1348
    .line 1349
    const/16 v23, 0x1

    .line 1350
    .line 1351
    aput-object v6, v7, v23

    .line 1352
    .line 1353
    const/16 v25, 0x2

    .line 1354
    .line 1355
    aput-object v9, v7, v25

    .line 1356
    .line 1357
    const/16 v24, 0x3

    .line 1358
    .line 1359
    aput-object v11, v7, v24

    .line 1360
    .line 1361
    const/16 v22, 0x4

    .line 1362
    .line 1363
    aput-object v4, v7, v22

    .line 1364
    .line 1365
    invoke-static {v7}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 1366
    .line 1367
    .line 1368
    move-result-object v3

    .line 1369
    new-instance v4, Lk2/c;

    .line 1370
    .line 1371
    const/16 v6, 0xe

    .line 1372
    .line 1373
    invoke-direct {v4, v5, v6}, Lk2/c;-><init>(Ljava/lang/Object;I)V

    .line 1374
    .line 1375
    .line 1376
    invoke-virtual {v13, v3, v4}, LVa/X7;->m(Ljava/lang/Object;Luc/c;)V

    .line 1377
    .line 1378
    .line 1379
    goto/16 :goto_5

    .line 1380
    .line 1381
    :cond_2a
    instance-of v5, v2, Landroid/webkit/PermissionRequest;

    .line 1382
    .line 1383
    if-eqz v5, :cond_2c

    .line 1384
    .line 1385
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1386
    .line 1387
    .line 1388
    move-object v4, v2

    .line 1389
    check-cast v4, Landroid/webkit/PermissionRequest;

    .line 1390
    .line 1391
    new-instance v5, Lcom/moloco/sdk/internal/publisher/d;

    .line 1392
    .line 1393
    invoke-direct {v5, v13}, Lcom/moloco/sdk/internal/publisher/d;-><init>(I)V

    .line 1394
    .line 1395
    .line 1396
    iget-object v6, v10, LC8/i;->d:Ljava/lang/Object;

    .line 1397
    .line 1398
    check-cast v6, Lkd/d;

    .line 1399
    .line 1400
    invoke-virtual {v6, v4}, Lkd/d;->d(Ljava/lang/Object;)Z

    .line 1401
    .line 1402
    .line 1403
    move-result v7

    .line 1404
    if-eqz v7, :cond_2b

    .line 1405
    .line 1406
    goto/16 :goto_5

    .line 1407
    .line 1408
    :cond_2b
    invoke-virtual {v6, v4}, Lkd/d;->b(Ljava/lang/Object;)J

    .line 1409
    .line 1410
    .line 1411
    move-result-wide v6

    .line 1412
    invoke-virtual {v4}, Landroid/webkit/PermissionRequest;->getResources()[Ljava/lang/String;

    .line 1413
    .line 1414
    .line 1415
    move-result-object v4

    .line 1416
    invoke-static {v4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 1417
    .line 1418
    .line 1419
    move-result-object v4

    .line 1420
    invoke-virtual {v10}, LC8/i;->q()Luc/n;

    .line 1421
    .line 1422
    .line 1423
    move-result-object v8

    .line 1424
    new-instance v9, LVa/X7;

    .line 1425
    .line 1426
    iget-object v11, v10, LC8/i;->c:Ljava/lang/Object;

    .line 1427
    .line 1428
    check-cast v11, Luc/f;

    .line 1429
    .line 1430
    const-string v12, "dev.flutter.pigeon.webview_flutter_android.PermissionRequest.pigeon_newInstance"

    .line 1431
    .line 1432
    invoke-direct {v9, v11, v8, v3, v12}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 1433
    .line 1434
    .line 1435
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1436
    .line 1437
    .line 1438
    move-result-object v3

    .line 1439
    const/4 v14, 0x2

    .line 1440
    new-array v6, v14, [Ljava/lang/Object;

    .line 1441
    .line 1442
    aput-object v3, v6, v16

    .line 1443
    .line 1444
    const/16 v23, 0x1

    .line 1445
    .line 1446
    aput-object v4, v6, v23

    .line 1447
    .line 1448
    invoke-static {v6}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 1449
    .line 1450
    .line 1451
    move-result-object v3

    .line 1452
    new-instance v4, Lk2/c;

    .line 1453
    .line 1454
    const/16 v6, 0x14

    .line 1455
    .line 1456
    invoke-direct {v4, v5, v6}, Lk2/c;-><init>(Ljava/lang/Object;I)V

    .line 1457
    .line 1458
    .line 1459
    invoke-virtual {v9, v3, v4}, LVa/X7;->m(Ljava/lang/Object;Luc/c;)V

    .line 1460
    .line 1461
    .line 1462
    goto/16 :goto_5

    .line 1463
    .line 1464
    :cond_2c
    instance-of v5, v2, Landroid/webkit/WebChromeClient$CustomViewCallback;

    .line 1465
    .line 1466
    if-eqz v5, :cond_2e

    .line 1467
    .line 1468
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1469
    .line 1470
    .line 1471
    move-object v4, v2

    .line 1472
    check-cast v4, Landroid/webkit/WebChromeClient$CustomViewCallback;

    .line 1473
    .line 1474
    new-instance v5, Lcom/moloco/sdk/internal/publisher/d;

    .line 1475
    .line 1476
    invoke-direct {v5, v13}, Lcom/moloco/sdk/internal/publisher/d;-><init>(I)V

    .line 1477
    .line 1478
    .line 1479
    iget-object v6, v10, LC8/i;->d:Ljava/lang/Object;

    .line 1480
    .line 1481
    check-cast v6, Lkd/d;

    .line 1482
    .line 1483
    invoke-virtual {v6, v4}, Lkd/d;->d(Ljava/lang/Object;)Z

    .line 1484
    .line 1485
    .line 1486
    move-result v8

    .line 1487
    if-eqz v8, :cond_2d

    .line 1488
    .line 1489
    goto/16 :goto_5

    .line 1490
    .line 1491
    :cond_2d
    invoke-virtual {v6, v4}, Lkd/d;->b(Ljava/lang/Object;)J

    .line 1492
    .line 1493
    .line 1494
    move-result-wide v8

    .line 1495
    invoke-virtual {v10}, LC8/i;->q()Luc/n;

    .line 1496
    .line 1497
    .line 1498
    move-result-object v4

    .line 1499
    new-instance v6, LVa/X7;

    .line 1500
    .line 1501
    iget-object v11, v10, LC8/i;->c:Ljava/lang/Object;

    .line 1502
    .line 1503
    check-cast v11, Luc/f;

    .line 1504
    .line 1505
    const-string v12, "dev.flutter.pigeon.webview_flutter_android.CustomViewCallback.pigeon_newInstance"

    .line 1506
    .line 1507
    invoke-direct {v6, v11, v4, v3, v12}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 1508
    .line 1509
    .line 1510
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1511
    .line 1512
    .line 1513
    move-result-object v3

    .line 1514
    invoke-static {v3}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 1515
    .line 1516
    .line 1517
    move-result-object v3

    .line 1518
    new-instance v4, Lk2/c;

    .line 1519
    .line 1520
    invoke-direct {v4, v5, v7}, Lk2/c;-><init>(Ljava/lang/Object;I)V

    .line 1521
    .line 1522
    .line 1523
    invoke-virtual {v6, v3, v4}, LVa/X7;->m(Ljava/lang/Object;Luc/c;)V

    .line 1524
    .line 1525
    .line 1526
    goto/16 :goto_5

    .line 1527
    .line 1528
    :cond_2e
    instance-of v5, v2, Landroid/view/View;

    .line 1529
    .line 1530
    if-eqz v5, :cond_30

    .line 1531
    .line 1532
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1533
    .line 1534
    .line 1535
    move-object v4, v2

    .line 1536
    check-cast v4, Landroid/view/View;

    .line 1537
    .line 1538
    new-instance v5, Lcom/moloco/sdk/internal/publisher/d;

    .line 1539
    .line 1540
    invoke-direct {v5, v13}, Lcom/moloco/sdk/internal/publisher/d;-><init>(I)V

    .line 1541
    .line 1542
    .line 1543
    iget-object v6, v10, LC8/i;->d:Ljava/lang/Object;

    .line 1544
    .line 1545
    check-cast v6, Lkd/d;

    .line 1546
    .line 1547
    invoke-virtual {v6, v4}, Lkd/d;->d(Ljava/lang/Object;)Z

    .line 1548
    .line 1549
    .line 1550
    move-result v7

    .line 1551
    if-eqz v7, :cond_2f

    .line 1552
    .line 1553
    goto/16 :goto_5

    .line 1554
    .line 1555
    :cond_2f
    invoke-virtual {v6, v4}, Lkd/d;->b(Ljava/lang/Object;)J

    .line 1556
    .line 1557
    .line 1558
    move-result-wide v6

    .line 1559
    invoke-virtual {v10}, LC8/i;->q()Luc/n;

    .line 1560
    .line 1561
    .line 1562
    move-result-object v4

    .line 1563
    new-instance v8, LVa/X7;

    .line 1564
    .line 1565
    iget-object v9, v10, LC8/i;->c:Ljava/lang/Object;

    .line 1566
    .line 1567
    check-cast v9, Luc/f;

    .line 1568
    .line 1569
    const-string v11, "dev.flutter.pigeon.webview_flutter_android.View.pigeon_newInstance"

    .line 1570
    .line 1571
    invoke-direct {v8, v9, v4, v3, v11}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 1572
    .line 1573
    .line 1574
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1575
    .line 1576
    .line 1577
    move-result-object v3

    .line 1578
    invoke-static {v3}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 1579
    .line 1580
    .line 1581
    move-result-object v3

    .line 1582
    new-instance v4, Lkd/D;

    .line 1583
    .line 1584
    const/4 v14, 0x1

    .line 1585
    invoke-direct {v4, v5, v14}, Lkd/D;-><init>(Ljava/lang/Object;I)V

    .line 1586
    .line 1587
    .line 1588
    invoke-virtual {v8, v3, v4}, LVa/X7;->m(Ljava/lang/Object;Luc/c;)V

    .line 1589
    .line 1590
    .line 1591
    goto/16 :goto_5

    .line 1592
    .line 1593
    :cond_30
    instance-of v5, v2, Landroid/webkit/GeolocationPermissions$Callback;

    .line 1594
    .line 1595
    if-eqz v5, :cond_32

    .line 1596
    .line 1597
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1598
    .line 1599
    .line 1600
    move-object v4, v2

    .line 1601
    check-cast v4, Landroid/webkit/GeolocationPermissions$Callback;

    .line 1602
    .line 1603
    new-instance v5, Lcom/moloco/sdk/internal/publisher/d;

    .line 1604
    .line 1605
    invoke-direct {v5, v13}, Lcom/moloco/sdk/internal/publisher/d;-><init>(I)V

    .line 1606
    .line 1607
    .line 1608
    iget-object v6, v10, LC8/i;->d:Ljava/lang/Object;

    .line 1609
    .line 1610
    check-cast v6, Lkd/d;

    .line 1611
    .line 1612
    invoke-virtual {v6, v4}, Lkd/d;->d(Ljava/lang/Object;)Z

    .line 1613
    .line 1614
    .line 1615
    move-result v7

    .line 1616
    if-eqz v7, :cond_31

    .line 1617
    .line 1618
    goto/16 :goto_5

    .line 1619
    .line 1620
    :cond_31
    invoke-virtual {v6, v4}, Lkd/d;->b(Ljava/lang/Object;)J

    .line 1621
    .line 1622
    .line 1623
    move-result-wide v6

    .line 1624
    invoke-virtual {v10}, LC8/i;->q()Luc/n;

    .line 1625
    .line 1626
    .line 1627
    move-result-object v4

    .line 1628
    new-instance v8, LVa/X7;

    .line 1629
    .line 1630
    iget-object v9, v10, LC8/i;->c:Ljava/lang/Object;

    .line 1631
    .line 1632
    check-cast v9, Luc/f;

    .line 1633
    .line 1634
    const-string v11, "dev.flutter.pigeon.webview_flutter_android.GeolocationPermissionsCallback.pigeon_newInstance"

    .line 1635
    .line 1636
    invoke-direct {v8, v9, v4, v3, v11}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 1637
    .line 1638
    .line 1639
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1640
    .line 1641
    .line 1642
    move-result-object v3

    .line 1643
    invoke-static {v3}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 1644
    .line 1645
    .line 1646
    move-result-object v3

    .line 1647
    new-instance v4, Lk2/c;

    .line 1648
    .line 1649
    const/16 v6, 0x10

    .line 1650
    .line 1651
    invoke-direct {v4, v5, v6}, Lk2/c;-><init>(Ljava/lang/Object;I)V

    .line 1652
    .line 1653
    .line 1654
    invoke-virtual {v8, v3, v4}, LVa/X7;->m(Ljava/lang/Object;Luc/c;)V

    .line 1655
    .line 1656
    .line 1657
    goto/16 :goto_5

    .line 1658
    .line 1659
    :cond_32
    instance-of v5, v2, Landroid/webkit/HttpAuthHandler;

    .line 1660
    .line 1661
    if-eqz v5, :cond_34

    .line 1662
    .line 1663
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1664
    .line 1665
    .line 1666
    move-object v4, v2

    .line 1667
    check-cast v4, Landroid/webkit/HttpAuthHandler;

    .line 1668
    .line 1669
    new-instance v5, Lcom/moloco/sdk/internal/publisher/d;

    .line 1670
    .line 1671
    invoke-direct {v5, v13}, Lcom/moloco/sdk/internal/publisher/d;-><init>(I)V

    .line 1672
    .line 1673
    .line 1674
    iget-object v6, v10, LC8/i;->d:Ljava/lang/Object;

    .line 1675
    .line 1676
    check-cast v6, Lkd/d;

    .line 1677
    .line 1678
    invoke-virtual {v6, v4}, Lkd/d;->d(Ljava/lang/Object;)Z

    .line 1679
    .line 1680
    .line 1681
    move-result v7

    .line 1682
    if-eqz v7, :cond_33

    .line 1683
    .line 1684
    goto/16 :goto_5

    .line 1685
    .line 1686
    :cond_33
    invoke-virtual {v6, v4}, Lkd/d;->b(Ljava/lang/Object;)J

    .line 1687
    .line 1688
    .line 1689
    move-result-wide v6

    .line 1690
    invoke-virtual {v10}, LC8/i;->q()Luc/n;

    .line 1691
    .line 1692
    .line 1693
    move-result-object v4

    .line 1694
    new-instance v8, LVa/X7;

    .line 1695
    .line 1696
    iget-object v9, v10, LC8/i;->c:Ljava/lang/Object;

    .line 1697
    .line 1698
    check-cast v9, Luc/f;

    .line 1699
    .line 1700
    const-string v11, "dev.flutter.pigeon.webview_flutter_android.HttpAuthHandler.pigeon_newInstance"

    .line 1701
    .line 1702
    invoke-direct {v8, v9, v4, v3, v11}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 1703
    .line 1704
    .line 1705
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1706
    .line 1707
    .line 1708
    move-result-object v3

    .line 1709
    invoke-static {v3}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 1710
    .line 1711
    .line 1712
    move-result-object v3

    .line 1713
    new-instance v4, Lk2/c;

    .line 1714
    .line 1715
    const/16 v6, 0x12

    .line 1716
    .line 1717
    invoke-direct {v4, v5, v6}, Lk2/c;-><init>(Ljava/lang/Object;I)V

    .line 1718
    .line 1719
    .line 1720
    invoke-virtual {v8, v3, v4}, LVa/X7;->m(Ljava/lang/Object;Luc/c;)V

    .line 1721
    .line 1722
    .line 1723
    goto/16 :goto_5

    .line 1724
    .line 1725
    :cond_34
    instance-of v5, v2, Landroid/os/Message;

    .line 1726
    .line 1727
    if-eqz v5, :cond_36

    .line 1728
    .line 1729
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1730
    .line 1731
    .line 1732
    move-object v4, v2

    .line 1733
    check-cast v4, Landroid/os/Message;

    .line 1734
    .line 1735
    new-instance v5, Lcom/moloco/sdk/internal/publisher/d;

    .line 1736
    .line 1737
    invoke-direct {v5, v13}, Lcom/moloco/sdk/internal/publisher/d;-><init>(I)V

    .line 1738
    .line 1739
    .line 1740
    iget-object v6, v10, LC8/i;->d:Ljava/lang/Object;

    .line 1741
    .line 1742
    check-cast v6, Lkd/d;

    .line 1743
    .line 1744
    invoke-virtual {v6, v4}, Lkd/d;->d(Ljava/lang/Object;)Z

    .line 1745
    .line 1746
    .line 1747
    move-result v7

    .line 1748
    if-eqz v7, :cond_35

    .line 1749
    .line 1750
    goto/16 :goto_5

    .line 1751
    .line 1752
    :cond_35
    invoke-virtual {v6, v4}, Lkd/d;->b(Ljava/lang/Object;)J

    .line 1753
    .line 1754
    .line 1755
    move-result-wide v6

    .line 1756
    invoke-virtual {v10}, LC8/i;->q()Luc/n;

    .line 1757
    .line 1758
    .line 1759
    move-result-object v4

    .line 1760
    new-instance v8, LVa/X7;

    .line 1761
    .line 1762
    iget-object v9, v10, LC8/i;->c:Ljava/lang/Object;

    .line 1763
    .line 1764
    check-cast v9, Luc/f;

    .line 1765
    .line 1766
    const-string v11, "dev.flutter.pigeon.webview_flutter_android.AndroidMessage.pigeon_newInstance"

    .line 1767
    .line 1768
    invoke-direct {v8, v9, v4, v3, v11}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 1769
    .line 1770
    .line 1771
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1772
    .line 1773
    .line 1774
    move-result-object v3

    .line 1775
    invoke-static {v3}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 1776
    .line 1777
    .line 1778
    move-result-object v3

    .line 1779
    new-instance v4, Lk2/c;

    .line 1780
    .line 1781
    const/4 v14, 0x4

    .line 1782
    invoke-direct {v4, v5, v14}, Lk2/c;-><init>(Ljava/lang/Object;I)V

    .line 1783
    .line 1784
    .line 1785
    invoke-virtual {v8, v3, v4}, LVa/X7;->m(Ljava/lang/Object;Luc/c;)V

    .line 1786
    .line 1787
    .line 1788
    goto/16 :goto_5

    .line 1789
    .line 1790
    :cond_36
    instance-of v5, v2, Landroid/webkit/ClientCertRequest;

    .line 1791
    .line 1792
    if-eqz v5, :cond_38

    .line 1793
    .line 1794
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1795
    .line 1796
    .line 1797
    move-object v4, v2

    .line 1798
    check-cast v4, Landroid/webkit/ClientCertRequest;

    .line 1799
    .line 1800
    new-instance v5, Lcom/moloco/sdk/internal/publisher/d;

    .line 1801
    .line 1802
    invoke-direct {v5, v13}, Lcom/moloco/sdk/internal/publisher/d;-><init>(I)V

    .line 1803
    .line 1804
    .line 1805
    iget-object v6, v10, LC8/i;->d:Ljava/lang/Object;

    .line 1806
    .line 1807
    check-cast v6, Lkd/d;

    .line 1808
    .line 1809
    invoke-virtual {v6, v4}, Lkd/d;->d(Ljava/lang/Object;)Z

    .line 1810
    .line 1811
    .line 1812
    move-result v7

    .line 1813
    if-eqz v7, :cond_37

    .line 1814
    .line 1815
    goto/16 :goto_5

    .line 1816
    .line 1817
    :cond_37
    invoke-virtual {v6, v4}, Lkd/d;->b(Ljava/lang/Object;)J

    .line 1818
    .line 1819
    .line 1820
    move-result-wide v6

    .line 1821
    invoke-virtual {v10}, LC8/i;->q()Luc/n;

    .line 1822
    .line 1823
    .line 1824
    move-result-object v4

    .line 1825
    new-instance v8, LVa/X7;

    .line 1826
    .line 1827
    iget-object v9, v10, LC8/i;->c:Ljava/lang/Object;

    .line 1828
    .line 1829
    check-cast v9, Luc/f;

    .line 1830
    .line 1831
    const-string v11, "dev.flutter.pigeon.webview_flutter_android.ClientCertRequest.pigeon_newInstance"

    .line 1832
    .line 1833
    invoke-direct {v8, v9, v4, v3, v11}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 1834
    .line 1835
    .line 1836
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1837
    .line 1838
    .line 1839
    move-result-object v3

    .line 1840
    invoke-static {v3}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 1841
    .line 1842
    .line 1843
    move-result-object v3

    .line 1844
    new-instance v4, Lk2/c;

    .line 1845
    .line 1846
    const/16 v6, 0x8

    .line 1847
    .line 1848
    invoke-direct {v4, v5, v6}, Lk2/c;-><init>(Ljava/lang/Object;I)V

    .line 1849
    .line 1850
    .line 1851
    invoke-virtual {v8, v3, v4}, LVa/X7;->m(Ljava/lang/Object;Luc/c;)V

    .line 1852
    .line 1853
    .line 1854
    goto/16 :goto_5

    .line 1855
    .line 1856
    :cond_38
    instance-of v5, v2, Ljava/security/PrivateKey;

    .line 1857
    .line 1858
    if-eqz v5, :cond_3a

    .line 1859
    .line 1860
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1861
    .line 1862
    .line 1863
    move-object v5, v2

    .line 1864
    check-cast v5, Ljava/security/PrivateKey;

    .line 1865
    .line 1866
    new-instance v6, Lcom/moloco/sdk/internal/publisher/d;

    .line 1867
    .line 1868
    invoke-direct {v6, v13}, Lcom/moloco/sdk/internal/publisher/d;-><init>(I)V

    .line 1869
    .line 1870
    .line 1871
    iget-object v7, v10, LC8/i;->d:Ljava/lang/Object;

    .line 1872
    .line 1873
    check-cast v7, Lkd/d;

    .line 1874
    .line 1875
    invoke-virtual {v7, v5}, Lkd/d;->d(Ljava/lang/Object;)Z

    .line 1876
    .line 1877
    .line 1878
    move-result v8

    .line 1879
    if-eqz v8, :cond_39

    .line 1880
    .line 1881
    goto/16 :goto_5

    .line 1882
    .line 1883
    :cond_39
    invoke-virtual {v7, v5}, Lkd/d;->b(Ljava/lang/Object;)J

    .line 1884
    .line 1885
    .line 1886
    move-result-wide v7

    .line 1887
    invoke-virtual {v10}, LC8/i;->q()Luc/n;

    .line 1888
    .line 1889
    .line 1890
    move-result-object v5

    .line 1891
    new-instance v9, LVa/X7;

    .line 1892
    .line 1893
    iget-object v11, v10, LC8/i;->c:Ljava/lang/Object;

    .line 1894
    .line 1895
    check-cast v11, Luc/f;

    .line 1896
    .line 1897
    const-string v12, "dev.flutter.pigeon.webview_flutter_android.PrivateKey.pigeon_newInstance"

    .line 1898
    .line 1899
    invoke-direct {v9, v11, v5, v3, v12}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 1900
    .line 1901
    .line 1902
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1903
    .line 1904
    .line 1905
    move-result-object v3

    .line 1906
    invoke-static {v3}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 1907
    .line 1908
    .line 1909
    move-result-object v3

    .line 1910
    new-instance v5, Lk2/c;

    .line 1911
    .line 1912
    invoke-direct {v5, v6, v4}, Lk2/c;-><init>(Ljava/lang/Object;I)V

    .line 1913
    .line 1914
    .line 1915
    invoke-virtual {v9, v3, v5}, LVa/X7;->m(Ljava/lang/Object;Luc/c;)V

    .line 1916
    .line 1917
    .line 1918
    goto/16 :goto_5

    .line 1919
    .line 1920
    :cond_3a
    instance-of v4, v2, Ljava/security/cert/X509Certificate;

    .line 1921
    .line 1922
    if-eqz v4, :cond_3c

    .line 1923
    .line 1924
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1925
    .line 1926
    .line 1927
    move-object v4, v2

    .line 1928
    check-cast v4, Ljava/security/cert/X509Certificate;

    .line 1929
    .line 1930
    new-instance v5, Lcom/moloco/sdk/internal/publisher/d;

    .line 1931
    .line 1932
    invoke-direct {v5, v13}, Lcom/moloco/sdk/internal/publisher/d;-><init>(I)V

    .line 1933
    .line 1934
    .line 1935
    iget-object v6, v10, LC8/i;->d:Ljava/lang/Object;

    .line 1936
    .line 1937
    check-cast v6, Lkd/d;

    .line 1938
    .line 1939
    invoke-virtual {v6, v4}, Lkd/d;->d(Ljava/lang/Object;)Z

    .line 1940
    .line 1941
    .line 1942
    move-result v7

    .line 1943
    if-eqz v7, :cond_3b

    .line 1944
    .line 1945
    goto/16 :goto_5

    .line 1946
    .line 1947
    :cond_3b
    invoke-virtual {v6, v4}, Lkd/d;->b(Ljava/lang/Object;)J

    .line 1948
    .line 1949
    .line 1950
    move-result-wide v6

    .line 1951
    invoke-virtual {v10}, LC8/i;->q()Luc/n;

    .line 1952
    .line 1953
    .line 1954
    move-result-object v4

    .line 1955
    new-instance v8, LVa/X7;

    .line 1956
    .line 1957
    iget-object v11, v10, LC8/i;->c:Ljava/lang/Object;

    .line 1958
    .line 1959
    check-cast v11, Luc/f;

    .line 1960
    .line 1961
    const-string v12, "dev.flutter.pigeon.webview_flutter_android.X509Certificate.pigeon_newInstance"

    .line 1962
    .line 1963
    invoke-direct {v8, v11, v4, v3, v12}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 1964
    .line 1965
    .line 1966
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1967
    .line 1968
    .line 1969
    move-result-object v3

    .line 1970
    invoke-static {v3}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 1971
    .line 1972
    .line 1973
    move-result-object v3

    .line 1974
    new-instance v4, Lkd/D;

    .line 1975
    .line 1976
    invoke-direct {v4, v5, v9}, Lkd/D;-><init>(Ljava/lang/Object;I)V

    .line 1977
    .line 1978
    .line 1979
    invoke-virtual {v8, v3, v4}, LVa/X7;->m(Ljava/lang/Object;Luc/c;)V

    .line 1980
    .line 1981
    .line 1982
    goto/16 :goto_5

    .line 1983
    .line 1984
    :cond_3c
    instance-of v4, v2, Landroid/webkit/SslErrorHandler;

    .line 1985
    .line 1986
    if-eqz v4, :cond_3e

    .line 1987
    .line 1988
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1989
    .line 1990
    .line 1991
    move-object v4, v2

    .line 1992
    check-cast v4, Landroid/webkit/SslErrorHandler;

    .line 1993
    .line 1994
    new-instance v5, Lcom/moloco/sdk/internal/publisher/d;

    .line 1995
    .line 1996
    invoke-direct {v5, v13}, Lcom/moloco/sdk/internal/publisher/d;-><init>(I)V

    .line 1997
    .line 1998
    .line 1999
    iget-object v6, v10, LC8/i;->d:Ljava/lang/Object;

    .line 2000
    .line 2001
    check-cast v6, Lkd/d;

    .line 2002
    .line 2003
    invoke-virtual {v6, v4}, Lkd/d;->d(Ljava/lang/Object;)Z

    .line 2004
    .line 2005
    .line 2006
    move-result v7

    .line 2007
    if-eqz v7, :cond_3d

    .line 2008
    .line 2009
    goto/16 :goto_5

    .line 2010
    .line 2011
    :cond_3d
    invoke-virtual {v6, v4}, Lkd/d;->b(Ljava/lang/Object;)J

    .line 2012
    .line 2013
    .line 2014
    move-result-wide v6

    .line 2015
    invoke-virtual {v10}, LC8/i;->q()Luc/n;

    .line 2016
    .line 2017
    .line 2018
    move-result-object v4

    .line 2019
    new-instance v8, LVa/X7;

    .line 2020
    .line 2021
    iget-object v9, v10, LC8/i;->c:Ljava/lang/Object;

    .line 2022
    .line 2023
    check-cast v9, Luc/f;

    .line 2024
    .line 2025
    const-string v11, "dev.flutter.pigeon.webview_flutter_android.SslErrorHandler.pigeon_newInstance"

    .line 2026
    .line 2027
    invoke-direct {v8, v9, v4, v3, v11}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 2028
    .line 2029
    .line 2030
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2031
    .line 2032
    .line 2033
    move-result-object v3

    .line 2034
    invoke-static {v3}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 2035
    .line 2036
    .line 2037
    move-result-object v3

    .line 2038
    new-instance v4, Lk2/c;

    .line 2039
    .line 2040
    const/16 v6, 0x1c

    .line 2041
    .line 2042
    invoke-direct {v4, v5, v6}, Lk2/c;-><init>(Ljava/lang/Object;I)V

    .line 2043
    .line 2044
    .line 2045
    invoke-virtual {v8, v3, v4}, LVa/X7;->m(Ljava/lang/Object;Luc/c;)V

    .line 2046
    .line 2047
    .line 2048
    goto/16 :goto_5

    .line 2049
    .line 2050
    :cond_3e
    instance-of v4, v2, Landroid/net/http/SslError;

    .line 2051
    .line 2052
    if-eqz v4, :cond_40

    .line 2053
    .line 2054
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2055
    .line 2056
    .line 2057
    move-object v4, v2

    .line 2058
    check-cast v4, Landroid/net/http/SslError;

    .line 2059
    .line 2060
    new-instance v5, Lcom/moloco/sdk/internal/publisher/d;

    .line 2061
    .line 2062
    invoke-direct {v5, v13}, Lcom/moloco/sdk/internal/publisher/d;-><init>(I)V

    .line 2063
    .line 2064
    .line 2065
    iget-object v6, v10, LC8/i;->d:Ljava/lang/Object;

    .line 2066
    .line 2067
    check-cast v6, Lkd/d;

    .line 2068
    .line 2069
    invoke-virtual {v6, v4}, Lkd/d;->d(Ljava/lang/Object;)Z

    .line 2070
    .line 2071
    .line 2072
    move-result v7

    .line 2073
    if-eqz v7, :cond_3f

    .line 2074
    .line 2075
    goto/16 :goto_5

    .line 2076
    .line 2077
    :cond_3f
    invoke-virtual {v6, v4}, Lkd/d;->b(Ljava/lang/Object;)J

    .line 2078
    .line 2079
    .line 2080
    move-result-wide v6

    .line 2081
    invoke-virtual {v4}, Landroid/net/http/SslError;->getCertificate()Landroid/net/http/SslCertificate;

    .line 2082
    .line 2083
    .line 2084
    move-result-object v8

    .line 2085
    invoke-virtual {v4}, Landroid/net/http/SslError;->getUrl()Ljava/lang/String;

    .line 2086
    .line 2087
    .line 2088
    move-result-object v4

    .line 2089
    invoke-virtual {v10}, LC8/i;->q()Luc/n;

    .line 2090
    .line 2091
    .line 2092
    move-result-object v9

    .line 2093
    new-instance v11, LVa/X7;

    .line 2094
    .line 2095
    iget-object v12, v10, LC8/i;->c:Ljava/lang/Object;

    .line 2096
    .line 2097
    check-cast v12, Luc/f;

    .line 2098
    .line 2099
    const-string v13, "dev.flutter.pigeon.webview_flutter_android.SslError.pigeon_newInstance"

    .line 2100
    .line 2101
    invoke-direct {v11, v12, v9, v3, v13}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 2102
    .line 2103
    .line 2104
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2105
    .line 2106
    .line 2107
    move-result-object v3

    .line 2108
    const/4 v14, 0x3

    .line 2109
    new-array v6, v14, [Ljava/lang/Object;

    .line 2110
    .line 2111
    aput-object v3, v6, v16

    .line 2112
    .line 2113
    const/16 v23, 0x1

    .line 2114
    .line 2115
    aput-object v8, v6, v23

    .line 2116
    .line 2117
    const/16 v25, 0x2

    .line 2118
    .line 2119
    aput-object v4, v6, v25

    .line 2120
    .line 2121
    invoke-static {v6}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 2122
    .line 2123
    .line 2124
    move-result-object v3

    .line 2125
    new-instance v4, Lk2/c;

    .line 2126
    .line 2127
    const/16 v6, 0x1a

    .line 2128
    .line 2129
    invoke-direct {v4, v5, v6}, Lk2/c;-><init>(Ljava/lang/Object;I)V

    .line 2130
    .line 2131
    .line 2132
    invoke-virtual {v11, v3, v4}, LVa/X7;->m(Ljava/lang/Object;Luc/c;)V

    .line 2133
    .line 2134
    .line 2135
    goto/16 :goto_5

    .line 2136
    .line 2137
    :cond_40
    instance-of v4, v2, Landroid/net/http/SslCertificate$DName;

    .line 2138
    .line 2139
    if-eqz v4, :cond_42

    .line 2140
    .line 2141
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2142
    .line 2143
    .line 2144
    move-object v4, v2

    .line 2145
    check-cast v4, Landroid/net/http/SslCertificate$DName;

    .line 2146
    .line 2147
    new-instance v5, Lcom/moloco/sdk/internal/publisher/d;

    .line 2148
    .line 2149
    invoke-direct {v5, v13}, Lcom/moloco/sdk/internal/publisher/d;-><init>(I)V

    .line 2150
    .line 2151
    .line 2152
    iget-object v6, v10, LC8/i;->d:Ljava/lang/Object;

    .line 2153
    .line 2154
    check-cast v6, Lkd/d;

    .line 2155
    .line 2156
    invoke-virtual {v6, v4}, Lkd/d;->d(Ljava/lang/Object;)Z

    .line 2157
    .line 2158
    .line 2159
    move-result v7

    .line 2160
    if-eqz v7, :cond_41

    .line 2161
    .line 2162
    goto/16 :goto_5

    .line 2163
    .line 2164
    :cond_41
    invoke-virtual {v6, v4}, Lkd/d;->b(Ljava/lang/Object;)J

    .line 2165
    .line 2166
    .line 2167
    move-result-wide v6

    .line 2168
    invoke-virtual {v10}, LC8/i;->q()Luc/n;

    .line 2169
    .line 2170
    .line 2171
    move-result-object v4

    .line 2172
    new-instance v8, LVa/X7;

    .line 2173
    .line 2174
    iget-object v9, v10, LC8/i;->c:Ljava/lang/Object;

    .line 2175
    .line 2176
    check-cast v9, Luc/f;

    .line 2177
    .line 2178
    const-string v11, "dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.pigeon_newInstance"

    .line 2179
    .line 2180
    invoke-direct {v8, v9, v4, v3, v11}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 2181
    .line 2182
    .line 2183
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2184
    .line 2185
    .line 2186
    move-result-object v3

    .line 2187
    invoke-static {v3}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 2188
    .line 2189
    .line 2190
    move-result-object v3

    .line 2191
    new-instance v4, Lk2/c;

    .line 2192
    .line 2193
    const/16 v6, 0x19

    .line 2194
    .line 2195
    invoke-direct {v4, v5, v6}, Lk2/c;-><init>(Ljava/lang/Object;I)V

    .line 2196
    .line 2197
    .line 2198
    invoke-virtual {v8, v3, v4}, LVa/X7;->m(Ljava/lang/Object;Luc/c;)V

    .line 2199
    .line 2200
    .line 2201
    goto/16 :goto_5

    .line 2202
    .line 2203
    :cond_42
    instance-of v4, v2, Landroid/net/http/SslCertificate;

    .line 2204
    .line 2205
    if-eqz v4, :cond_44

    .line 2206
    .line 2207
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2208
    .line 2209
    .line 2210
    move-object v4, v2

    .line 2211
    check-cast v4, Landroid/net/http/SslCertificate;

    .line 2212
    .line 2213
    new-instance v5, Lcom/moloco/sdk/internal/publisher/d;

    .line 2214
    .line 2215
    invoke-direct {v5, v13}, Lcom/moloco/sdk/internal/publisher/d;-><init>(I)V

    .line 2216
    .line 2217
    .line 2218
    iget-object v6, v10, LC8/i;->d:Ljava/lang/Object;

    .line 2219
    .line 2220
    check-cast v6, Lkd/d;

    .line 2221
    .line 2222
    invoke-virtual {v6, v4}, Lkd/d;->d(Ljava/lang/Object;)Z

    .line 2223
    .line 2224
    .line 2225
    move-result v7

    .line 2226
    if-eqz v7, :cond_43

    .line 2227
    .line 2228
    goto :goto_5

    .line 2229
    :cond_43
    invoke-virtual {v6, v4}, Lkd/d;->b(Ljava/lang/Object;)J

    .line 2230
    .line 2231
    .line 2232
    move-result-wide v6

    .line 2233
    invoke-virtual {v10}, LC8/i;->q()Luc/n;

    .line 2234
    .line 2235
    .line 2236
    move-result-object v4

    .line 2237
    new-instance v8, LVa/X7;

    .line 2238
    .line 2239
    iget-object v11, v10, LC8/i;->c:Ljava/lang/Object;

    .line 2240
    .line 2241
    check-cast v11, Luc/f;

    .line 2242
    .line 2243
    const-string v12, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.pigeon_newInstance"

    .line 2244
    .line 2245
    invoke-direct {v8, v11, v4, v3, v12}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 2246
    .line 2247
    .line 2248
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2249
    .line 2250
    .line 2251
    move-result-object v3

    .line 2252
    invoke-static {v3}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 2253
    .line 2254
    .line 2255
    move-result-object v3

    .line 2256
    new-instance v4, Lk2/c;

    .line 2257
    .line 2258
    invoke-direct {v4, v5, v9}, Lk2/c;-><init>(Ljava/lang/Object;I)V

    .line 2259
    .line 2260
    .line 2261
    invoke-virtual {v8, v3, v4}, LVa/X7;->m(Ljava/lang/Object;Luc/c;)V

    .line 2262
    .line 2263
    .line 2264
    goto :goto_5

    .line 2265
    :cond_44
    instance-of v4, v2, Ljava/security/cert/Certificate;

    .line 2266
    .line 2267
    if-eqz v4, :cond_46

    .line 2268
    .line 2269
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2270
    .line 2271
    .line 2272
    move-object v4, v2

    .line 2273
    check-cast v4, Ljava/security/cert/Certificate;

    .line 2274
    .line 2275
    new-instance v5, Lcom/moloco/sdk/internal/publisher/d;

    .line 2276
    .line 2277
    invoke-direct {v5, v13}, Lcom/moloco/sdk/internal/publisher/d;-><init>(I)V

    .line 2278
    .line 2279
    .line 2280
    iget-object v6, v10, LC8/i;->d:Ljava/lang/Object;

    .line 2281
    .line 2282
    check-cast v6, Lkd/d;

    .line 2283
    .line 2284
    invoke-virtual {v6, v4}, Lkd/d;->d(Ljava/lang/Object;)Z

    .line 2285
    .line 2286
    .line 2287
    move-result v7

    .line 2288
    if-eqz v7, :cond_45

    .line 2289
    .line 2290
    goto :goto_5

    .line 2291
    :cond_45
    invoke-virtual {v6, v4}, Lkd/d;->b(Ljava/lang/Object;)J

    .line 2292
    .line 2293
    .line 2294
    move-result-wide v6

    .line 2295
    invoke-virtual {v10}, LC8/i;->q()Luc/n;

    .line 2296
    .line 2297
    .line 2298
    move-result-object v4

    .line 2299
    new-instance v8, LVa/X7;

    .line 2300
    .line 2301
    iget-object v9, v10, LC8/i;->c:Ljava/lang/Object;

    .line 2302
    .line 2303
    check-cast v9, Luc/f;

    .line 2304
    .line 2305
    const-string v11, "dev.flutter.pigeon.webview_flutter_android.Certificate.pigeon_newInstance"

    .line 2306
    .line 2307
    invoke-direct {v8, v9, v4, v3, v11}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 2308
    .line 2309
    .line 2310
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2311
    .line 2312
    .line 2313
    move-result-object v3

    .line 2314
    invoke-static {v3}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 2315
    .line 2316
    .line 2317
    move-result-object v3

    .line 2318
    new-instance v4, Lk2/c;

    .line 2319
    .line 2320
    move/from16 v6, v17

    .line 2321
    .line 2322
    invoke-direct {v4, v5, v6}, Lk2/c;-><init>(Ljava/lang/Object;I)V

    .line 2323
    .line 2324
    .line 2325
    invoke-virtual {v8, v3, v4}, LVa/X7;->m(Ljava/lang/Object;Luc/c;)V

    .line 2326
    .line 2327
    .line 2328
    :cond_46
    :goto_5
    iget-object v3, v10, LC8/i;->d:Ljava/lang/Object;

    .line 2329
    .line 2330
    check-cast v3, Lkd/d;

    .line 2331
    .line 2332
    invoke-virtual {v3, v2}, Lkd/d;->d(Ljava/lang/Object;)Z

    .line 2333
    .line 2334
    .line 2335
    move-result v3

    .line 2336
    if-eqz v3, :cond_48

    .line 2337
    .line 2338
    const/16 v3, 0x80

    .line 2339
    .line 2340
    invoke-virtual {v1, v3}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 2341
    .line 2342
    .line 2343
    iget-object v3, v10, LC8/i;->d:Ljava/lang/Object;

    .line 2344
    .line 2345
    check-cast v3, Lkd/d;

    .line 2346
    .line 2347
    invoke-virtual {v3}, Lkd/d;->f()V

    .line 2348
    .line 2349
    .line 2350
    iget-object v4, v3, Lkd/d;->b:Ljava/util/WeakHashMap;

    .line 2351
    .line 2352
    invoke-virtual {v4, v2}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2353
    .line 2354
    .line 2355
    move-result-object v4

    .line 2356
    check-cast v4, Ljava/lang/Long;

    .line 2357
    .line 2358
    if-eqz v4, :cond_47

    .line 2359
    .line 2360
    iget-object v3, v3, Lkd/d;->d:Ljava/util/HashMap;

    .line 2361
    .line 2362
    invoke-virtual {v3, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2363
    .line 2364
    .line 2365
    :cond_47
    invoke-virtual {v0, v1, v4}, Lkd/g;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 2366
    .line 2367
    .line 2368
    return-void

    .line 2369
    :cond_48
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 2370
    .line 2371
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2372
    .line 2373
    .line 2374
    move-result-object v3

    .line 2375
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2376
    .line 2377
    .line 2378
    move-result-object v3

    .line 2379
    new-instance v4, Ljava/lang/StringBuilder;

    .line 2380
    .line 2381
    const-string v5, "Unsupported value: \'"

    .line 2382
    .line 2383
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2384
    .line 2385
    .line 2386
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 2387
    .line 2388
    .line 2389
    const-string v2, "\' of type \'"

    .line 2390
    .line 2391
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2392
    .line 2393
    .line 2394
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2395
    .line 2396
    .line 2397
    const-string v2, "\'"

    .line 2398
    .line 2399
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2400
    .line 2401
    .line 2402
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2403
    .line 2404
    .line 2405
    move-result-object v2

    .line 2406
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 2407
    .line 2408
    .line 2409
    throw v1

    .line 2410
    :cond_49
    :goto_6
    invoke-super/range {p0 .. p2}, Lkd/b;->k(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    .line 2411
    .line 2412
    .line 2413
    return-void
.end method
