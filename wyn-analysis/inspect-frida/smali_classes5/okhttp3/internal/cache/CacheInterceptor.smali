.class public final Lokhttp3/internal/cache/CacheInterceptor;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lokhttp3/Interceptor;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lokhttp3/internal/cache/CacheInterceptor$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001:\u0001\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Lokhttp3/internal/cache/CacheInterceptor;",
        "Lokhttp3/Interceptor;",
        "Companion",
        "okhttp"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final b:Lokhttp3/internal/cache/CacheInterceptor$Companion;


# instance fields
.field public final a:Lokhttp3/Cache;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lokhttp3/internal/cache/CacheInterceptor$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lokhttp3/internal/cache/CacheInterceptor$Companion;-><init>(I)V

    sput-object v0, Lokhttp3/internal/cache/CacheInterceptor;->b:Lokhttp3/internal/cache/CacheInterceptor$Companion;

    return-void
.end method

.method public constructor <init>(Lokhttp3/Cache;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lokhttp3/internal/cache/CacheInterceptor;->a:Lokhttp3/Cache;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final intercept(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;
    .locals 25

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    check-cast v0, Lokhttp3/internal/http/RealInterceptorChain;

    .line 6
    .line 7
    iget-object v2, v0, Lokhttp3/internal/http/RealInterceptorChain;->a:Lokhttp3/internal/connection/RealCall;

    .line 8
    .line 9
    iget-object v3, v1, Lokhttp3/internal/cache/CacheInterceptor;->a:Lokhttp3/Cache;

    .line 10
    .line 11
    if-nez v3, :cond_0

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget-object v5, v0, Lokhttp3/internal/http/RealInterceptorChain;->e:Lokhttp3/Request;

    .line 16
    .line 17
    invoke-virtual {v3, v5}, Lokhttp3/Cache;->a(Lokhttp3/Request;)Lokhttp3/Response;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    :goto_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 22
    .line 23
    .line 24
    move-result-wide v5

    .line 25
    new-instance v7, Lokhttp3/internal/cache/CacheStrategy$Factory;

    .line 26
    .line 27
    iget-object v8, v0, Lokhttp3/internal/http/RealInterceptorChain;->e:Lokhttp3/Request;

    .line 28
    .line 29
    const-string v9, "request"

    .line 30
    .line 31
    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    const/4 v9, -0x1

    .line 38
    iput v9, v7, Lokhttp3/internal/cache/CacheStrategy$Factory;->i:I

    .line 39
    .line 40
    if-eqz v3, :cond_6

    .line 41
    .line 42
    iget-wide v11, v3, Lokhttp3/Response;->k:J

    .line 43
    .line 44
    iput-wide v11, v7, Lokhttp3/internal/cache/CacheStrategy$Factory;->f:J

    .line 45
    .line 46
    iget-wide v11, v3, Lokhttp3/Response;->l:J

    .line 47
    .line 48
    iput-wide v11, v7, Lokhttp3/internal/cache/CacheStrategy$Factory;->g:J

    .line 49
    .line 50
    iget-object v11, v3, Lokhttp3/Response;->f:Lokhttp3/Headers;

    .line 51
    .line 52
    invoke-virtual {v11}, Lokhttp3/Headers;->size()I

    .line 53
    .line 54
    .line 55
    move-result v12

    .line 56
    const/4 v13, 0x0

    .line 57
    :goto_1
    if-ge v13, v12, :cond_6

    .line 58
    .line 59
    add-int/lit8 v14, v13, 0x1

    .line 60
    .line 61
    invoke-virtual {v11, v13}, Lokhttp3/Headers;->c(I)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v15

    .line 65
    invoke-virtual {v11, v13}, Lokhttp3/Headers;->f(I)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v13

    .line 69
    const-string v10, "Date"

    .line 70
    .line 71
    const/4 v4, 0x1

    .line 72
    invoke-static {v15, v10, v4}, LBf/r;->c0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 73
    .line 74
    .line 75
    move-result v10

    .line 76
    if-eqz v10, :cond_1

    .line 77
    .line 78
    invoke-static {v13}, Lokhttp3/internal/http/DatesKt;->a(Ljava/lang/String;)Ljava/util/Date;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    iput-object v4, v7, Lokhttp3/internal/cache/CacheStrategy$Factory;->a:Ljava/util/Date;

    .line 83
    .line 84
    iput-object v13, v7, Lokhttp3/internal/cache/CacheStrategy$Factory;->b:Ljava/lang/String;

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_1
    const-string v10, "Expires"

    .line 88
    .line 89
    invoke-static {v15, v10, v4}, LBf/r;->c0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 90
    .line 91
    .line 92
    move-result v10

    .line 93
    if-eqz v10, :cond_2

    .line 94
    .line 95
    invoke-static {v13}, Lokhttp3/internal/http/DatesKt;->a(Ljava/lang/String;)Ljava/util/Date;

    .line 96
    .line 97
    .line 98
    move-result-object v4

    .line 99
    iput-object v4, v7, Lokhttp3/internal/cache/CacheStrategy$Factory;->e:Ljava/util/Date;

    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_2
    const-string v10, "Last-Modified"

    .line 103
    .line 104
    invoke-static {v15, v10, v4}, LBf/r;->c0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 105
    .line 106
    .line 107
    move-result v10

    .line 108
    if-eqz v10, :cond_3

    .line 109
    .line 110
    invoke-static {v13}, Lokhttp3/internal/http/DatesKt;->a(Ljava/lang/String;)Ljava/util/Date;

    .line 111
    .line 112
    .line 113
    move-result-object v4

    .line 114
    iput-object v4, v7, Lokhttp3/internal/cache/CacheStrategy$Factory;->c:Ljava/util/Date;

    .line 115
    .line 116
    iput-object v13, v7, Lokhttp3/internal/cache/CacheStrategy$Factory;->d:Ljava/lang/String;

    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_3
    const-string v10, "ETag"

    .line 120
    .line 121
    invoke-static {v15, v10, v4}, LBf/r;->c0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 122
    .line 123
    .line 124
    move-result v10

    .line 125
    if-eqz v10, :cond_4

    .line 126
    .line 127
    iput-object v13, v7, Lokhttp3/internal/cache/CacheStrategy$Factory;->h:Ljava/lang/String;

    .line 128
    .line 129
    goto :goto_2

    .line 130
    :cond_4
    const-string v10, "Age"

    .line 131
    .line 132
    invoke-static {v15, v10, v4}, LBf/r;->c0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 133
    .line 134
    .line 135
    move-result v4

    .line 136
    if-eqz v4, :cond_5

    .line 137
    .line 138
    invoke-static {v13, v9}, Lokhttp3/internal/Util;->y(Ljava/lang/String;I)I

    .line 139
    .line 140
    .line 141
    move-result v4

    .line 142
    iput v4, v7, Lokhttp3/internal/cache/CacheStrategy$Factory;->i:I

    .line 143
    .line 144
    :cond_5
    :goto_2
    move v13, v14

    .line 145
    goto :goto_1

    .line 146
    :cond_6
    if-nez v3, :cond_7

    .line 147
    .line 148
    new-instance v4, Lokhttp3/internal/cache/CacheStrategy;

    .line 149
    .line 150
    const/4 v10, 0x0

    .line 151
    invoke-direct {v4, v8, v10}, Lokhttp3/internal/cache/CacheStrategy;-><init>(Lokhttp3/Request;Lokhttp3/Response;)V

    .line 152
    .line 153
    .line 154
    goto/16 :goto_11

    .line 155
    .line 156
    :cond_7
    const/4 v10, 0x0

    .line 157
    iget-object v4, v8, Lokhttp3/Request;->a:Lokhttp3/HttpUrl;

    .line 158
    .line 159
    iget-boolean v4, v4, Lokhttp3/HttpUrl;->j:Z

    .line 160
    .line 161
    if-eqz v4, :cond_8

    .line 162
    .line 163
    iget-object v4, v3, Lokhttp3/Response;->e:Lokhttp3/Handshake;

    .line 164
    .line 165
    if-nez v4, :cond_8

    .line 166
    .line 167
    new-instance v4, Lokhttp3/internal/cache/CacheStrategy;

    .line 168
    .line 169
    invoke-direct {v4, v8, v10}, Lokhttp3/internal/cache/CacheStrategy;-><init>(Lokhttp3/Request;Lokhttp3/Response;)V

    .line 170
    .line 171
    .line 172
    goto/16 :goto_11

    .line 173
    .line 174
    :cond_8
    sget-object v4, Lokhttp3/internal/cache/CacheStrategy;->c:Lokhttp3/internal/cache/CacheStrategy$Companion;

    .line 175
    .line 176
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    invoke-static {v8, v3}, Lokhttp3/internal/cache/CacheStrategy$Companion;->a(Lokhttp3/Request;Lokhttp3/Response;)Z

    .line 180
    .line 181
    .line 182
    move-result v4

    .line 183
    if-nez v4, :cond_9

    .line 184
    .line 185
    new-instance v4, Lokhttp3/internal/cache/CacheStrategy;

    .line 186
    .line 187
    invoke-direct {v4, v8, v10}, Lokhttp3/internal/cache/CacheStrategy;-><init>(Lokhttp3/Request;Lokhttp3/Response;)V

    .line 188
    .line 189
    .line 190
    goto/16 :goto_11

    .line 191
    .line 192
    :cond_9
    invoke-virtual {v8}, Lokhttp3/Request;->a()Lokhttp3/CacheControl;

    .line 193
    .line 194
    .line 195
    move-result-object v4

    .line 196
    iget-boolean v10, v4, Lokhttp3/CacheControl;->a:Z

    .line 197
    .line 198
    if-nez v10, :cond_1e

    .line 199
    .line 200
    const-string v10, "If-Modified-Since"

    .line 201
    .line 202
    iget-object v11, v8, Lokhttp3/Request;->c:Lokhttp3/Headers;

    .line 203
    .line 204
    invoke-virtual {v11, v10}, Lokhttp3/Headers;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v11

    .line 208
    if-nez v11, :cond_1e

    .line 209
    .line 210
    const-string v11, "If-None-Match"

    .line 211
    .line 212
    iget-object v12, v8, Lokhttp3/Request;->c:Lokhttp3/Headers;

    .line 213
    .line 214
    invoke-virtual {v12, v11}, Lokhttp3/Headers;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v12

    .line 218
    if-eqz v12, :cond_a

    .line 219
    .line 220
    goto/16 :goto_10

    .line 221
    .line 222
    :cond_a
    invoke-virtual {v3}, Lokhttp3/Response;->a()Lokhttp3/CacheControl;

    .line 223
    .line 224
    .line 225
    move-result-object v12

    .line 226
    iget-wide v13, v7, Lokhttp3/internal/cache/CacheStrategy$Factory;->g:J

    .line 227
    .line 228
    iget-object v15, v7, Lokhttp3/internal/cache/CacheStrategy$Factory;->a:Ljava/util/Date;

    .line 229
    .line 230
    move-object/from16 v16, v10

    .line 231
    .line 232
    const-wide/16 v9, 0x0

    .line 233
    .line 234
    if-eqz v15, :cond_b

    .line 235
    .line 236
    invoke-virtual {v15}, Ljava/util/Date;->getTime()J

    .line 237
    .line 238
    .line 239
    move-result-wide v17

    .line 240
    move-wide/from16 v19, v5

    .line 241
    .line 242
    sub-long v5, v13, v17

    .line 243
    .line 244
    invoke-static {v9, v10, v5, v6}, Ljava/lang/Math;->max(JJ)J

    .line 245
    .line 246
    .line 247
    move-result-wide v5

    .line 248
    move-wide/from16 v17, v9

    .line 249
    .line 250
    goto :goto_3

    .line 251
    :cond_b
    move-wide/from16 v19, v5

    .line 252
    .line 253
    move-wide v5, v9

    .line 254
    move-wide/from16 v17, v5

    .line 255
    .line 256
    :goto_3
    iget v9, v7, Lokhttp3/internal/cache/CacheStrategy$Factory;->i:I

    .line 257
    .line 258
    const/4 v10, -0x1

    .line 259
    if-eq v9, v10, :cond_c

    .line 260
    .line 261
    sget-object v10, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 262
    .line 263
    move-wide/from16 v21, v13

    .line 264
    .line 265
    int-to-long v13, v9

    .line 266
    invoke-virtual {v10, v13, v14}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 267
    .line 268
    .line 269
    move-result-wide v9

    .line 270
    invoke-static {v5, v6, v9, v10}, Ljava/lang/Math;->max(JJ)J

    .line 271
    .line 272
    .line 273
    move-result-wide v5

    .line 274
    goto :goto_4

    .line 275
    :cond_c
    move-wide/from16 v21, v13

    .line 276
    .line 277
    :goto_4
    iget-wide v9, v7, Lokhttp3/internal/cache/CacheStrategy$Factory;->f:J

    .line 278
    .line 279
    sub-long v13, v21, v9

    .line 280
    .line 281
    sub-long v19, v19, v21

    .line 282
    .line 283
    add-long/2addr v5, v13

    .line 284
    add-long v5, v5, v19

    .line 285
    .line 286
    invoke-virtual {v3}, Lokhttp3/Response;->a()Lokhttp3/CacheControl;

    .line 287
    .line 288
    .line 289
    move-result-object v13

    .line 290
    iget-object v14, v7, Lokhttp3/internal/cache/CacheStrategy$Factory;->c:Ljava/util/Date;

    .line 291
    .line 292
    move-wide/from16 v19, v5

    .line 293
    .line 294
    iget-object v5, v7, Lokhttp3/internal/cache/CacheStrategy$Factory;->e:Ljava/util/Date;

    .line 295
    .line 296
    iget v6, v13, Lokhttp3/CacheControl;->c:I

    .line 297
    .line 298
    const/4 v13, -0x1

    .line 299
    if-eq v6, v13, :cond_d

    .line 300
    .line 301
    sget-object v9, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 302
    .line 303
    move-object v13, v5

    .line 304
    int-to-long v5, v6

    .line 305
    invoke-virtual {v9, v5, v6}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 306
    .line 307
    .line 308
    move-result-wide v5

    .line 309
    goto/16 :goto_a

    .line 310
    .line 311
    :cond_d
    move-object v13, v5

    .line 312
    if-eqz v13, :cond_11

    .line 313
    .line 314
    if-nez v15, :cond_e

    .line 315
    .line 316
    const/4 v5, 0x0

    .line 317
    goto :goto_5

    .line 318
    :cond_e
    invoke-virtual {v15}, Ljava/util/Date;->getTime()J

    .line 319
    .line 320
    .line 321
    move-result-wide v5

    .line 322
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 323
    .line 324
    .line 325
    move-result-object v5

    .line 326
    :goto_5
    if-nez v5, :cond_f

    .line 327
    .line 328
    move-wide/from16 v5, v21

    .line 329
    .line 330
    goto :goto_6

    .line 331
    :cond_f
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 332
    .line 333
    .line 334
    move-result-wide v5

    .line 335
    :goto_6
    invoke-virtual {v13}, Ljava/util/Date;->getTime()J

    .line 336
    .line 337
    .line 338
    move-result-wide v9

    .line 339
    sub-long v5, v9, v5

    .line 340
    .line 341
    cmp-long v9, v5, v17

    .line 342
    .line 343
    if-lez v9, :cond_10

    .line 344
    .line 345
    goto :goto_a

    .line 346
    :cond_10
    move-wide/from16 v5, v17

    .line 347
    .line 348
    goto :goto_a

    .line 349
    :cond_11
    if-eqz v14, :cond_10

    .line 350
    .line 351
    iget-object v5, v3, Lokhttp3/Response;->a:Lokhttp3/Request;

    .line 352
    .line 353
    iget-object v5, v5, Lokhttp3/Request;->a:Lokhttp3/HttpUrl;

    .line 354
    .line 355
    iget-object v5, v5, Lokhttp3/HttpUrl;->g:Ljava/util/ArrayList;

    .line 356
    .line 357
    if-nez v5, :cond_12

    .line 358
    .line 359
    const/4 v5, 0x0

    .line 360
    goto :goto_7

    .line 361
    :cond_12
    new-instance v6, Ljava/lang/StringBuilder;

    .line 362
    .line 363
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 364
    .line 365
    .line 366
    sget-object v21, Lokhttp3/HttpUrl;->k:Lokhttp3/HttpUrl$Companion;

    .line 367
    .line 368
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 369
    .line 370
    .line 371
    invoke-static {v5, v6}, Lokhttp3/HttpUrl$Companion;->g(Ljava/util/ArrayList;Ljava/lang/StringBuilder;)V

    .line 372
    .line 373
    .line 374
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 375
    .line 376
    .line 377
    move-result-object v5

    .line 378
    :goto_7
    if-nez v5, :cond_10

    .line 379
    .line 380
    if-nez v15, :cond_13

    .line 381
    .line 382
    const/4 v5, 0x0

    .line 383
    goto :goto_8

    .line 384
    :cond_13
    invoke-virtual {v15}, Ljava/util/Date;->getTime()J

    .line 385
    .line 386
    .line 387
    move-result-wide v5

    .line 388
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 389
    .line 390
    .line 391
    move-result-object v5

    .line 392
    :goto_8
    if-nez v5, :cond_14

    .line 393
    .line 394
    goto :goto_9

    .line 395
    :cond_14
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 396
    .line 397
    .line 398
    move-result-wide v9

    .line 399
    :goto_9
    invoke-virtual {v14}, Ljava/util/Date;->getTime()J

    .line 400
    .line 401
    .line 402
    move-result-wide v5

    .line 403
    sub-long/2addr v9, v5

    .line 404
    cmp-long v5, v9, v17

    .line 405
    .line 406
    if-lez v5, :cond_10

    .line 407
    .line 408
    const/16 v5, 0xa

    .line 409
    .line 410
    int-to-long v5, v5

    .line 411
    div-long v5, v9, v5

    .line 412
    .line 413
    :goto_a
    iget v9, v4, Lokhttp3/CacheControl;->c:I

    .line 414
    .line 415
    const/4 v10, -0x1

    .line 416
    if-eq v9, v10, :cond_15

    .line 417
    .line 418
    sget-object v10, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 419
    .line 420
    move-object/from16 v22, v13

    .line 421
    .line 422
    move-object/from16 v21, v14

    .line 423
    .line 424
    int-to-long v13, v9

    .line 425
    invoke-virtual {v10, v13, v14}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 426
    .line 427
    .line 428
    move-result-wide v9

    .line 429
    invoke-static {v5, v6, v9, v10}, Ljava/lang/Math;->min(JJ)J

    .line 430
    .line 431
    .line 432
    move-result-wide v5

    .line 433
    goto :goto_b

    .line 434
    :cond_15
    move-object/from16 v22, v13

    .line 435
    .line 436
    move-object/from16 v21, v14

    .line 437
    .line 438
    :goto_b
    iget v9, v4, Lokhttp3/CacheControl;->i:I

    .line 439
    .line 440
    const/4 v10, -0x1

    .line 441
    if-eq v9, v10, :cond_16

    .line 442
    .line 443
    sget-object v13, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 444
    .line 445
    move-object v14, v11

    .line 446
    int-to-long v10, v9

    .line 447
    invoke-virtual {v13, v10, v11}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 448
    .line 449
    .line 450
    move-result-wide v9

    .line 451
    goto :goto_c

    .line 452
    :cond_16
    move-object v14, v11

    .line 453
    move-wide/from16 v9, v17

    .line 454
    .line 455
    :goto_c
    iget-boolean v11, v12, Lokhttp3/CacheControl;->g:Z

    .line 456
    .line 457
    if-nez v11, :cond_17

    .line 458
    .line 459
    iget v4, v4, Lokhttp3/CacheControl;->h:I

    .line 460
    .line 461
    const/4 v13, -0x1

    .line 462
    if-eq v4, v13, :cond_17

    .line 463
    .line 464
    sget-object v11, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 465
    .line 466
    move-wide/from16 v23, v5

    .line 467
    .line 468
    int-to-long v4, v4

    .line 469
    invoke-virtual {v11, v4, v5}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 470
    .line 471
    .line 472
    move-result-wide v4

    .line 473
    goto :goto_d

    .line 474
    :cond_17
    move-wide/from16 v23, v5

    .line 475
    .line 476
    move-wide/from16 v4, v17

    .line 477
    .line 478
    :goto_d
    iget-boolean v6, v12, Lokhttp3/CacheControl;->a:Z

    .line 479
    .line 480
    if-nez v6, :cond_1a

    .line 481
    .line 482
    add-long v9, v19, v9

    .line 483
    .line 484
    add-long v4, v23, v4

    .line 485
    .line 486
    cmp-long v4, v9, v4

    .line 487
    .line 488
    if-gez v4, :cond_1a

    .line 489
    .line 490
    invoke-virtual {v3}, Lokhttp3/Response;->h()Lokhttp3/Response$Builder;

    .line 491
    .line 492
    .line 493
    move-result-object v4

    .line 494
    cmp-long v5, v9, v23

    .line 495
    .line 496
    if-ltz v5, :cond_18

    .line 497
    .line 498
    const-string v5, "110 HttpURLConnection \"Response is stale\""

    .line 499
    .line 500
    iget-object v6, v4, Lokhttp3/Response$Builder;->f:Lokhttp3/Headers$Builder;

    .line 501
    .line 502
    const-string v7, "Warning"

    .line 503
    .line 504
    invoke-virtual {v6, v7, v5}, Lokhttp3/Headers$Builder;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 505
    .line 506
    .line 507
    :cond_18
    const-wide/32 v5, 0x5265c00

    .line 508
    .line 509
    .line 510
    cmp-long v5, v19, v5

    .line 511
    .line 512
    if-lez v5, :cond_19

    .line 513
    .line 514
    invoke-virtual {v3}, Lokhttp3/Response;->a()Lokhttp3/CacheControl;

    .line 515
    .line 516
    .line 517
    move-result-object v5

    .line 518
    iget v5, v5, Lokhttp3/CacheControl;->c:I

    .line 519
    .line 520
    const/4 v10, -0x1

    .line 521
    if-ne v5, v10, :cond_19

    .line 522
    .line 523
    if-nez v22, :cond_19

    .line 524
    .line 525
    const-string v5, "113 HttpURLConnection \"Heuristic expiration\""

    .line 526
    .line 527
    iget-object v6, v4, Lokhttp3/Response$Builder;->f:Lokhttp3/Headers$Builder;

    .line 528
    .line 529
    const-string v7, "Warning"

    .line 530
    .line 531
    invoke-virtual {v6, v7, v5}, Lokhttp3/Headers$Builder;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 532
    .line 533
    .line 534
    :cond_19
    new-instance v5, Lokhttp3/internal/cache/CacheStrategy;

    .line 535
    .line 536
    invoke-virtual {v4}, Lokhttp3/Response$Builder;->a()Lokhttp3/Response;

    .line 537
    .line 538
    .line 539
    move-result-object v4

    .line 540
    const/4 v10, 0x0

    .line 541
    invoke-direct {v5, v10, v4}, Lokhttp3/internal/cache/CacheStrategy;-><init>(Lokhttp3/Request;Lokhttp3/Response;)V

    .line 542
    .line 543
    .line 544
    move-object v4, v5

    .line 545
    goto :goto_11

    .line 546
    :cond_1a
    iget-object v4, v7, Lokhttp3/internal/cache/CacheStrategy$Factory;->h:Ljava/lang/String;

    .line 547
    .line 548
    if-eqz v4, :cond_1b

    .line 549
    .line 550
    move-object v10, v14

    .line 551
    goto :goto_f

    .line 552
    :cond_1b
    if-eqz v21, :cond_1c

    .line 553
    .line 554
    iget-object v4, v7, Lokhttp3/internal/cache/CacheStrategy$Factory;->d:Ljava/lang/String;

    .line 555
    .line 556
    :goto_e
    move-object/from16 v10, v16

    .line 557
    .line 558
    goto :goto_f

    .line 559
    :cond_1c
    if-eqz v15, :cond_1d

    .line 560
    .line 561
    iget-object v4, v7, Lokhttp3/internal/cache/CacheStrategy$Factory;->b:Ljava/lang/String;

    .line 562
    .line 563
    goto :goto_e

    .line 564
    :goto_f
    iget-object v5, v8, Lokhttp3/Request;->c:Lokhttp3/Headers;

    .line 565
    .line 566
    invoke-virtual {v5}, Lokhttp3/Headers;->d()Lokhttp3/Headers$Builder;

    .line 567
    .line 568
    .line 569
    move-result-object v5

    .line 570
    invoke-static {v4}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 571
    .line 572
    .line 573
    invoke-virtual {v5, v10, v4}, Lokhttp3/Headers$Builder;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 574
    .line 575
    .line 576
    invoke-virtual {v8}, Lokhttp3/Request;->b()Lokhttp3/Request$Builder;

    .line 577
    .line 578
    .line 579
    move-result-object v4

    .line 580
    invoke-virtual {v5}, Lokhttp3/Headers$Builder;->d()Lokhttp3/Headers;

    .line 581
    .line 582
    .line 583
    move-result-object v5

    .line 584
    invoke-virtual {v4, v5}, Lokhttp3/Request$Builder;->e(Lokhttp3/Headers;)V

    .line 585
    .line 586
    .line 587
    invoke-virtual {v4}, Lokhttp3/Request$Builder;->b()Lokhttp3/Request;

    .line 588
    .line 589
    .line 590
    move-result-object v4

    .line 591
    new-instance v5, Lokhttp3/internal/cache/CacheStrategy;

    .line 592
    .line 593
    invoke-direct {v5, v4, v3}, Lokhttp3/internal/cache/CacheStrategy;-><init>(Lokhttp3/Request;Lokhttp3/Response;)V

    .line 594
    .line 595
    .line 596
    move-object v4, v5

    .line 597
    const/4 v10, 0x0

    .line 598
    goto :goto_11

    .line 599
    :cond_1d
    new-instance v4, Lokhttp3/internal/cache/CacheStrategy;

    .line 600
    .line 601
    const/4 v10, 0x0

    .line 602
    invoke-direct {v4, v8, v10}, Lokhttp3/internal/cache/CacheStrategy;-><init>(Lokhttp3/Request;Lokhttp3/Response;)V

    .line 603
    .line 604
    .line 605
    goto :goto_11

    .line 606
    :cond_1e
    :goto_10
    const/4 v10, 0x0

    .line 607
    new-instance v4, Lokhttp3/internal/cache/CacheStrategy;

    .line 608
    .line 609
    invoke-direct {v4, v8, v10}, Lokhttp3/internal/cache/CacheStrategy;-><init>(Lokhttp3/Request;Lokhttp3/Response;)V

    .line 610
    .line 611
    .line 612
    :goto_11
    iget-object v5, v4, Lokhttp3/internal/cache/CacheStrategy;->a:Lokhttp3/Request;

    .line 613
    .line 614
    if-eqz v5, :cond_1f

    .line 615
    .line 616
    invoke-virtual {v8}, Lokhttp3/Request;->a()Lokhttp3/CacheControl;

    .line 617
    .line 618
    .line 619
    move-result-object v5

    .line 620
    iget-boolean v5, v5, Lokhttp3/CacheControl;->j:Z

    .line 621
    .line 622
    if-eqz v5, :cond_1f

    .line 623
    .line 624
    new-instance v4, Lokhttp3/internal/cache/CacheStrategy;

    .line 625
    .line 626
    invoke-direct {v4, v10, v10}, Lokhttp3/internal/cache/CacheStrategy;-><init>(Lokhttp3/Request;Lokhttp3/Response;)V

    .line 627
    .line 628
    .line 629
    :cond_1f
    iget-object v5, v4, Lokhttp3/internal/cache/CacheStrategy;->a:Lokhttp3/Request;

    .line 630
    .line 631
    iget-object v4, v4, Lokhttp3/internal/cache/CacheStrategy;->b:Lokhttp3/Response;

    .line 632
    .line 633
    iget-object v6, v1, Lokhttp3/internal/cache/CacheInterceptor;->a:Lokhttp3/Cache;

    .line 634
    .line 635
    if-nez v6, :cond_20

    .line 636
    .line 637
    goto :goto_12

    .line 638
    :cond_20
    monitor-enter v6

    .line 639
    monitor-exit v6

    .line 640
    :goto_12
    instance-of v6, v2, Lokhttp3/internal/connection/RealCall;

    .line 641
    .line 642
    if-eqz v6, :cond_21

    .line 643
    .line 644
    move-object v6, v2

    .line 645
    goto :goto_13

    .line 646
    :cond_21
    move-object v6, v10

    .line 647
    :goto_13
    if-nez v6, :cond_22

    .line 648
    .line 649
    move-object v6, v10

    .line 650
    goto :goto_14

    .line 651
    :cond_22
    iget-object v6, v6, Lokhttp3/internal/connection/RealCall;->d:Lokhttp3/EventListener;

    .line 652
    .line 653
    :goto_14
    if-nez v6, :cond_23

    .line 654
    .line 655
    sget-object v6, Lokhttp3/EventListener;->a:Lokhttp3/EventListener$Companion$NONE$1;

    .line 656
    .line 657
    :cond_23
    if-eqz v3, :cond_25

    .line 658
    .line 659
    if-nez v4, :cond_25

    .line 660
    .line 661
    iget-object v7, v3, Lokhttp3/Response;->g:Lokhttp3/ResponseBody;

    .line 662
    .line 663
    if-nez v7, :cond_24

    .line 664
    .line 665
    goto :goto_15

    .line 666
    :cond_24
    invoke-static {v7}, Lokhttp3/internal/Util;->c(Ljava/io/Closeable;)V

    .line 667
    .line 668
    .line 669
    :cond_25
    :goto_15
    if-nez v5, :cond_26

    .line 670
    .line 671
    if-nez v4, :cond_26

    .line 672
    .line 673
    new-instance v3, Lokhttp3/Response$Builder;

    .line 674
    .line 675
    invoke-direct {v3}, Lokhttp3/Response$Builder;-><init>()V

    .line 676
    .line 677
    .line 678
    iget-object v0, v0, Lokhttp3/internal/http/RealInterceptorChain;->e:Lokhttp3/Request;

    .line 679
    .line 680
    const-string v4, "request"

    .line 681
    .line 682
    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 683
    .line 684
    .line 685
    iput-object v0, v3, Lokhttp3/Response$Builder;->a:Lokhttp3/Request;

    .line 686
    .line 687
    sget-object v0, Lokhttp3/Protocol;->d:Lokhttp3/Protocol;

    .line 688
    .line 689
    iput-object v0, v3, Lokhttp3/Response$Builder;->b:Lokhttp3/Protocol;

    .line 690
    .line 691
    const/16 v0, 0x1f8

    .line 692
    .line 693
    iput v0, v3, Lokhttp3/Response$Builder;->c:I

    .line 694
    .line 695
    const-string v0, "Unsatisfiable Request (only-if-cached)"

    .line 696
    .line 697
    iput-object v0, v3, Lokhttp3/Response$Builder;->d:Ljava/lang/String;

    .line 698
    .line 699
    sget-object v0, Lokhttp3/internal/Util;->c:Lokhttp3/ResponseBody$Companion$asResponseBody$1;

    .line 700
    .line 701
    iput-object v0, v3, Lokhttp3/Response$Builder;->g:Lokhttp3/ResponseBody;

    .line 702
    .line 703
    const-wide/16 v4, -0x1

    .line 704
    .line 705
    iput-wide v4, v3, Lokhttp3/Response$Builder;->k:J

    .line 706
    .line 707
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 708
    .line 709
    .line 710
    move-result-wide v4

    .line 711
    iput-wide v4, v3, Lokhttp3/Response$Builder;->l:J

    .line 712
    .line 713
    invoke-virtual {v3}, Lokhttp3/Response$Builder;->a()Lokhttp3/Response;

    .line 714
    .line 715
    .line 716
    move-result-object v0

    .line 717
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 718
    .line 719
    .line 720
    const-string v3, "call"

    .line 721
    .line 722
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 723
    .line 724
    .line 725
    return-object v0

    .line 726
    :cond_26
    if-nez v5, :cond_27

    .line 727
    .line 728
    invoke-static {v4}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 729
    .line 730
    .line 731
    invoke-virtual {v4}, Lokhttp3/Response;->h()Lokhttp3/Response$Builder;

    .line 732
    .line 733
    .line 734
    move-result-object v0

    .line 735
    sget-object v3, Lokhttp3/internal/cache/CacheInterceptor;->b:Lokhttp3/internal/cache/CacheInterceptor$Companion;

    .line 736
    .line 737
    invoke-static {v3, v4}, Lokhttp3/internal/cache/CacheInterceptor$Companion;->a(Lokhttp3/internal/cache/CacheInterceptor$Companion;Lokhttp3/Response;)Lokhttp3/Response;

    .line 738
    .line 739
    .line 740
    move-result-object v3

    .line 741
    const-string v4, "cacheResponse"

    .line 742
    .line 743
    invoke-static {v4, v3}, Lokhttp3/Response$Builder;->b(Ljava/lang/String;Lokhttp3/Response;)V

    .line 744
    .line 745
    .line 746
    iput-object v3, v0, Lokhttp3/Response$Builder;->i:Lokhttp3/Response;

    .line 747
    .line 748
    invoke-virtual {v0}, Lokhttp3/Response$Builder;->a()Lokhttp3/Response;

    .line 749
    .line 750
    .line 751
    move-result-object v0

    .line 752
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 753
    .line 754
    .line 755
    const-string v3, "call"

    .line 756
    .line 757
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 758
    .line 759
    .line 760
    return-object v0

    .line 761
    :cond_27
    if-eqz v4, :cond_28

    .line 762
    .line 763
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 764
    .line 765
    .line 766
    const-string v0, "call"

    .line 767
    .line 768
    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 769
    .line 770
    .line 771
    goto :goto_16

    .line 772
    :cond_28
    iget-object v0, v1, Lokhttp3/internal/cache/CacheInterceptor;->a:Lokhttp3/Cache;

    .line 773
    .line 774
    if-eqz v0, :cond_29

    .line 775
    .line 776
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 777
    .line 778
    .line 779
    const-string v0, "call"

    .line 780
    .line 781
    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 782
    .line 783
    .line 784
    :cond_29
    :goto_16
    :try_start_0
    move-object/from16 v0, p1

    .line 785
    .line 786
    check-cast v0, Lokhttp3/internal/http/RealInterceptorChain;

    .line 787
    .line 788
    invoke-virtual {v0, v5}, Lokhttp3/internal/http/RealInterceptorChain;->a(Lokhttp3/Request;)Lokhttp3/Response;

    .line 789
    .line 790
    .line 791
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 792
    if-eqz v4, :cond_35

    .line 793
    .line 794
    iget v3, v0, Lokhttp3/Response;->d:I

    .line 795
    .line 796
    const/16 v7, 0x130

    .line 797
    .line 798
    if-ne v3, v7, :cond_33

    .line 799
    .line 800
    invoke-virtual {v4}, Lokhttp3/Response;->h()Lokhttp3/Response$Builder;

    .line 801
    .line 802
    .line 803
    move-result-object v3

    .line 804
    sget-object v5, Lokhttp3/internal/cache/CacheInterceptor;->b:Lokhttp3/internal/cache/CacheInterceptor$Companion;

    .line 805
    .line 806
    iget-object v7, v4, Lokhttp3/Response;->f:Lokhttp3/Headers;

    .line 807
    .line 808
    iget-object v8, v0, Lokhttp3/Response;->f:Lokhttp3/Headers;

    .line 809
    .line 810
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 811
    .line 812
    .line 813
    new-instance v5, Lokhttp3/Headers$Builder;

    .line 814
    .line 815
    invoke-direct {v5}, Lokhttp3/Headers$Builder;-><init>()V

    .line 816
    .line 817
    .line 818
    invoke-virtual {v7}, Lokhttp3/Headers;->size()I

    .line 819
    .line 820
    .line 821
    move-result v9

    .line 822
    const/4 v10, 0x0

    .line 823
    :goto_17
    if-ge v10, v9, :cond_2f

    .line 824
    .line 825
    add-int/lit8 v11, v10, 0x1

    .line 826
    .line 827
    invoke-virtual {v7, v10}, Lokhttp3/Headers;->c(I)Ljava/lang/String;

    .line 828
    .line 829
    .line 830
    move-result-object v12

    .line 831
    invoke-virtual {v7, v10}, Lokhttp3/Headers;->f(I)Ljava/lang/String;

    .line 832
    .line 833
    .line 834
    move-result-object v10

    .line 835
    const-string v13, "Warning"

    .line 836
    .line 837
    invoke-virtual {v13, v12}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 838
    .line 839
    .line 840
    move-result v13

    .line 841
    if-eqz v13, :cond_2a

    .line 842
    .line 843
    const-string v13, "1"

    .line 844
    .line 845
    const/4 v14, 0x0

    .line 846
    invoke-static {v10, v13, v14}, LBf/r;->k0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 847
    .line 848
    .line 849
    move-result v13

    .line 850
    if-eqz v13, :cond_2b

    .line 851
    .line 852
    goto :goto_19

    .line 853
    :cond_2a
    const/4 v14, 0x0

    .line 854
    :cond_2b
    const-string v13, "Content-Length"

    .line 855
    .line 856
    invoke-virtual {v13, v12}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 857
    .line 858
    .line 859
    move-result v13

    .line 860
    if-nez v13, :cond_2d

    .line 861
    .line 862
    const-string v13, "Content-Encoding"

    .line 863
    .line 864
    invoke-virtual {v13, v12}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 865
    .line 866
    .line 867
    move-result v13

    .line 868
    if-nez v13, :cond_2d

    .line 869
    .line 870
    const-string v13, "Content-Type"

    .line 871
    .line 872
    invoke-virtual {v13, v12}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 873
    .line 874
    .line 875
    move-result v13

    .line 876
    if-eqz v13, :cond_2c

    .line 877
    .line 878
    goto :goto_18

    .line 879
    :cond_2c
    invoke-static {v12}, Lokhttp3/internal/cache/CacheInterceptor$Companion;->b(Ljava/lang/String;)Z

    .line 880
    .line 881
    .line 882
    move-result v13

    .line 883
    if-eqz v13, :cond_2d

    .line 884
    .line 885
    invoke-virtual {v8, v12}, Lokhttp3/Headers;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 886
    .line 887
    .line 888
    move-result-object v13

    .line 889
    if-nez v13, :cond_2e

    .line 890
    .line 891
    :cond_2d
    :goto_18
    invoke-virtual {v5, v12, v10}, Lokhttp3/Headers$Builder;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 892
    .line 893
    .line 894
    :cond_2e
    :goto_19
    move v10, v11

    .line 895
    goto :goto_17

    .line 896
    :cond_2f
    const/4 v14, 0x0

    .line 897
    invoke-virtual {v8}, Lokhttp3/Headers;->size()I

    .line 898
    .line 899
    .line 900
    move-result v7

    .line 901
    move v10, v14

    .line 902
    :goto_1a
    if-ge v10, v7, :cond_32

    .line 903
    .line 904
    add-int/lit8 v9, v10, 0x1

    .line 905
    .line 906
    invoke-virtual {v8, v10}, Lokhttp3/Headers;->c(I)Ljava/lang/String;

    .line 907
    .line 908
    .line 909
    move-result-object v11

    .line 910
    const-string v12, "Content-Length"

    .line 911
    .line 912
    invoke-virtual {v12, v11}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 913
    .line 914
    .line 915
    move-result v12

    .line 916
    if-nez v12, :cond_31

    .line 917
    .line 918
    const-string v12, "Content-Encoding"

    .line 919
    .line 920
    invoke-virtual {v12, v11}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 921
    .line 922
    .line 923
    move-result v12

    .line 924
    if-nez v12, :cond_31

    .line 925
    .line 926
    const-string v12, "Content-Type"

    .line 927
    .line 928
    invoke-virtual {v12, v11}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 929
    .line 930
    .line 931
    move-result v12

    .line 932
    if-eqz v12, :cond_30

    .line 933
    .line 934
    goto :goto_1b

    .line 935
    :cond_30
    invoke-static {v11}, Lokhttp3/internal/cache/CacheInterceptor$Companion;->b(Ljava/lang/String;)Z

    .line 936
    .line 937
    .line 938
    move-result v12

    .line 939
    if-eqz v12, :cond_31

    .line 940
    .line 941
    invoke-virtual {v8, v10}, Lokhttp3/Headers;->f(I)Ljava/lang/String;

    .line 942
    .line 943
    .line 944
    move-result-object v10

    .line 945
    invoke-virtual {v5, v11, v10}, Lokhttp3/Headers$Builder;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 946
    .line 947
    .line 948
    :cond_31
    :goto_1b
    move v10, v9

    .line 949
    goto :goto_1a

    .line 950
    :cond_32
    invoke-virtual {v5}, Lokhttp3/Headers$Builder;->d()Lokhttp3/Headers;

    .line 951
    .line 952
    .line 953
    move-result-object v5

    .line 954
    invoke-virtual {v3, v5}, Lokhttp3/Response$Builder;->c(Lokhttp3/Headers;)V

    .line 955
    .line 956
    .line 957
    iget-wide v7, v0, Lokhttp3/Response;->k:J

    .line 958
    .line 959
    iput-wide v7, v3, Lokhttp3/Response$Builder;->k:J

    .line 960
    .line 961
    iget-wide v7, v0, Lokhttp3/Response;->l:J

    .line 962
    .line 963
    iput-wide v7, v3, Lokhttp3/Response$Builder;->l:J

    .line 964
    .line 965
    sget-object v5, Lokhttp3/internal/cache/CacheInterceptor;->b:Lokhttp3/internal/cache/CacheInterceptor$Companion;

    .line 966
    .line 967
    invoke-static {v5, v4}, Lokhttp3/internal/cache/CacheInterceptor$Companion;->a(Lokhttp3/internal/cache/CacheInterceptor$Companion;Lokhttp3/Response;)Lokhttp3/Response;

    .line 968
    .line 969
    .line 970
    move-result-object v7

    .line 971
    const-string v8, "cacheResponse"

    .line 972
    .line 973
    invoke-static {v8, v7}, Lokhttp3/Response$Builder;->b(Ljava/lang/String;Lokhttp3/Response;)V

    .line 974
    .line 975
    .line 976
    iput-object v7, v3, Lokhttp3/Response$Builder;->i:Lokhttp3/Response;

    .line 977
    .line 978
    invoke-static {v5, v0}, Lokhttp3/internal/cache/CacheInterceptor$Companion;->a(Lokhttp3/internal/cache/CacheInterceptor$Companion;Lokhttp3/Response;)Lokhttp3/Response;

    .line 979
    .line 980
    .line 981
    move-result-object v5

    .line 982
    const-string v7, "networkResponse"

    .line 983
    .line 984
    invoke-static {v7, v5}, Lokhttp3/Response$Builder;->b(Ljava/lang/String;Lokhttp3/Response;)V

    .line 985
    .line 986
    .line 987
    iput-object v5, v3, Lokhttp3/Response$Builder;->h:Lokhttp3/Response;

    .line 988
    .line 989
    invoke-virtual {v3}, Lokhttp3/Response$Builder;->a()Lokhttp3/Response;

    .line 990
    .line 991
    .line 992
    move-result-object v3

    .line 993
    iget-object v0, v0, Lokhttp3/Response;->g:Lokhttp3/ResponseBody;

    .line 994
    .line 995
    invoke-static {v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 996
    .line 997
    .line 998
    invoke-virtual {v0}, Lokhttp3/ResponseBody;->close()V

    .line 999
    .line 1000
    .line 1001
    iget-object v0, v1, Lokhttp3/internal/cache/CacheInterceptor;->a:Lokhttp3/Cache;

    .line 1002
    .line 1003
    invoke-static {v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 1004
    .line 1005
    .line 1006
    invoke-virtual {v0}, Lokhttp3/Cache;->h()V

    .line 1007
    .line 1008
    .line 1009
    iget-object v0, v1, Lokhttp3/internal/cache/CacheInterceptor;->a:Lokhttp3/Cache;

    .line 1010
    .line 1011
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1012
    .line 1013
    .line 1014
    invoke-static {v4, v3}, Lokhttp3/Cache;->i(Lokhttp3/Response;Lokhttp3/Response;)V

    .line 1015
    .line 1016
    .line 1017
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1018
    .line 1019
    .line 1020
    const-string v0, "call"

    .line 1021
    .line 1022
    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1023
    .line 1024
    .line 1025
    return-object v3

    .line 1026
    :cond_33
    iget-object v3, v4, Lokhttp3/Response;->g:Lokhttp3/ResponseBody;

    .line 1027
    .line 1028
    if-nez v3, :cond_34

    .line 1029
    .line 1030
    goto :goto_1c

    .line 1031
    :cond_34
    invoke-static {v3}, Lokhttp3/internal/Util;->c(Ljava/io/Closeable;)V

    .line 1032
    .line 1033
    .line 1034
    :cond_35
    :goto_1c
    invoke-virtual {v0}, Lokhttp3/Response;->h()Lokhttp3/Response$Builder;

    .line 1035
    .line 1036
    .line 1037
    move-result-object v3

    .line 1038
    sget-object v7, Lokhttp3/internal/cache/CacheInterceptor;->b:Lokhttp3/internal/cache/CacheInterceptor$Companion;

    .line 1039
    .line 1040
    invoke-static {v7, v4}, Lokhttp3/internal/cache/CacheInterceptor$Companion;->a(Lokhttp3/internal/cache/CacheInterceptor$Companion;Lokhttp3/Response;)Lokhttp3/Response;

    .line 1041
    .line 1042
    .line 1043
    move-result-object v8

    .line 1044
    const-string v9, "cacheResponse"

    .line 1045
    .line 1046
    invoke-static {v9, v8}, Lokhttp3/Response$Builder;->b(Ljava/lang/String;Lokhttp3/Response;)V

    .line 1047
    .line 1048
    .line 1049
    iput-object v8, v3, Lokhttp3/Response$Builder;->i:Lokhttp3/Response;

    .line 1050
    .line 1051
    invoke-static {v7, v0}, Lokhttp3/internal/cache/CacheInterceptor$Companion;->a(Lokhttp3/internal/cache/CacheInterceptor$Companion;Lokhttp3/Response;)Lokhttp3/Response;

    .line 1052
    .line 1053
    .line 1054
    move-result-object v0

    .line 1055
    const-string v7, "networkResponse"

    .line 1056
    .line 1057
    invoke-static {v7, v0}, Lokhttp3/Response$Builder;->b(Ljava/lang/String;Lokhttp3/Response;)V

    .line 1058
    .line 1059
    .line 1060
    iput-object v0, v3, Lokhttp3/Response$Builder;->h:Lokhttp3/Response;

    .line 1061
    .line 1062
    invoke-virtual {v3}, Lokhttp3/Response$Builder;->a()Lokhttp3/Response;

    .line 1063
    .line 1064
    .line 1065
    move-result-object v0

    .line 1066
    iget-object v3, v1, Lokhttp3/internal/cache/CacheInterceptor;->a:Lokhttp3/Cache;

    .line 1067
    .line 1068
    if-eqz v3, :cond_39

    .line 1069
    .line 1070
    invoke-static {v0}, Lokhttp3/internal/http/HttpHeaders;->a(Lokhttp3/Response;)Z

    .line 1071
    .line 1072
    .line 1073
    move-result v3

    .line 1074
    if-eqz v3, :cond_38

    .line 1075
    .line 1076
    sget-object v3, Lokhttp3/internal/cache/CacheStrategy;->c:Lokhttp3/internal/cache/CacheStrategy$Companion;

    .line 1077
    .line 1078
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1079
    .line 1080
    .line 1081
    invoke-static {v5, v0}, Lokhttp3/internal/cache/CacheStrategy$Companion;->a(Lokhttp3/Request;Lokhttp3/Response;)Z

    .line 1082
    .line 1083
    .line 1084
    move-result v3

    .line 1085
    if-eqz v3, :cond_38

    .line 1086
    .line 1087
    iget-object v3, v1, Lokhttp3/internal/cache/CacheInterceptor;->a:Lokhttp3/Cache;

    .line 1088
    .line 1089
    invoke-virtual {v3, v0}, Lokhttp3/Cache;->b(Lokhttp3/Response;)Lokhttp3/internal/cache/CacheRequest;

    .line 1090
    .line 1091
    .line 1092
    move-result-object v3

    .line 1093
    if-nez v3, :cond_36

    .line 1094
    .line 1095
    goto :goto_1d

    .line 1096
    :cond_36
    invoke-interface {v3}, Lokhttp3/internal/cache/CacheRequest;->body()Lokhttp3/Cache$RealCacheRequest$1;

    .line 1097
    .line 1098
    .line 1099
    move-result-object v5

    .line 1100
    iget-object v7, v0, Lokhttp3/Response;->g:Lokhttp3/ResponseBody;

    .line 1101
    .line 1102
    invoke-static {v7}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 1103
    .line 1104
    .line 1105
    invoke-virtual {v7}, Lokhttp3/ResponseBody;->source()Lcg/i;

    .line 1106
    .line 1107
    .line 1108
    move-result-object v7

    .line 1109
    invoke-static {v5}, Lcg/b;->c(Lcg/F;)Lcg/A;

    .line 1110
    .line 1111
    .line 1112
    move-result-object v5

    .line 1113
    new-instance v8, Lokhttp3/internal/cache/CacheInterceptor$cacheWritingResponse$cacheWritingSource$1;

    .line 1114
    .line 1115
    invoke-direct {v8, v7, v3, v5}, Lokhttp3/internal/cache/CacheInterceptor$cacheWritingResponse$cacheWritingSource$1;-><init>(Lcg/i;Lokhttp3/internal/cache/CacheRequest;Lcg/A;)V

    .line 1116
    .line 1117
    .line 1118
    const-string v3, "Content-Type"

    .line 1119
    .line 1120
    invoke-static {v3, v0}, Lokhttp3/Response;->b(Ljava/lang/String;Lokhttp3/Response;)Ljava/lang/String;

    .line 1121
    .line 1122
    .line 1123
    move-result-object v3

    .line 1124
    iget-object v5, v0, Lokhttp3/Response;->g:Lokhttp3/ResponseBody;

    .line 1125
    .line 1126
    invoke-virtual {v5}, Lokhttp3/ResponseBody;->contentLength()J

    .line 1127
    .line 1128
    .line 1129
    move-result-wide v9

    .line 1130
    invoke-virtual {v0}, Lokhttp3/Response;->h()Lokhttp3/Response$Builder;

    .line 1131
    .line 1132
    .line 1133
    move-result-object v0

    .line 1134
    new-instance v5, Lokhttp3/internal/http/RealResponseBody;

    .line 1135
    .line 1136
    invoke-static {v8}, Lcg/b;->d(Lcg/H;)Lcg/B;

    .line 1137
    .line 1138
    .line 1139
    move-result-object v7

    .line 1140
    invoke-direct {v5, v3, v9, v10, v7}, Lokhttp3/internal/http/RealResponseBody;-><init>(Ljava/lang/String;JLcg/B;)V

    .line 1141
    .line 1142
    .line 1143
    iput-object v5, v0, Lokhttp3/Response$Builder;->g:Lokhttp3/ResponseBody;

    .line 1144
    .line 1145
    invoke-virtual {v0}, Lokhttp3/Response$Builder;->a()Lokhttp3/Response;

    .line 1146
    .line 1147
    .line 1148
    move-result-object v0

    .line 1149
    :goto_1d
    if-eqz v4, :cond_37

    .line 1150
    .line 1151
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1152
    .line 1153
    .line 1154
    const-string v3, "call"

    .line 1155
    .line 1156
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1157
    .line 1158
    .line 1159
    :cond_37
    return-object v0

    .line 1160
    :cond_38
    sget-object v2, Lokhttp3/internal/http/HttpMethod;->a:Lokhttp3/internal/http/HttpMethod;

    .line 1161
    .line 1162
    iget-object v3, v5, Lokhttp3/Request;->b:Ljava/lang/String;

    .line 1163
    .line 1164
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1165
    .line 1166
    .line 1167
    invoke-static {v3}, Lokhttp3/internal/http/HttpMethod;->a(Ljava/lang/String;)Z

    .line 1168
    .line 1169
    .line 1170
    move-result v2

    .line 1171
    if-eqz v2, :cond_39

    .line 1172
    .line 1173
    :try_start_1
    iget-object v2, v1, Lokhttp3/internal/cache/CacheInterceptor;->a:Lokhttp3/Cache;

    .line 1174
    .line 1175
    invoke-virtual {v2, v5}, Lokhttp3/Cache;->d(Lokhttp3/Request;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 1176
    .line 1177
    .line 1178
    :catch_0
    :cond_39
    return-object v0

    .line 1179
    :catchall_0
    move-exception v0

    .line 1180
    if-eqz v3, :cond_3b

    .line 1181
    .line 1182
    iget-object v2, v3, Lokhttp3/Response;->g:Lokhttp3/ResponseBody;

    .line 1183
    .line 1184
    if-nez v2, :cond_3a

    .line 1185
    .line 1186
    goto :goto_1e

    .line 1187
    :cond_3a
    invoke-static {v2}, Lokhttp3/internal/Util;->c(Ljava/io/Closeable;)V

    .line 1188
    .line 1189
    .line 1190
    :cond_3b
    :goto_1e
    throw v0
.end method
