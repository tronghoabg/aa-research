.class public final Lokhttp3/internal/http/CallServerInterceptor;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lokhttp3/Interceptor;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"
    }
    d2 = {
        "Lokhttp3/internal/http/CallServerInterceptor;",
        "Lokhttp3/Interceptor;",
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


# virtual methods
.method public final intercept(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;
    .locals 16

    .line 1
    const-string v1, "call"

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    check-cast v0, Lokhttp3/internal/http/RealInterceptorChain;

    .line 6
    .line 7
    iget-object v2, v0, Lokhttp3/internal/http/RealInterceptorChain;->d:Lokhttp3/internal/connection/Exchange;

    .line 8
    .line 9
    invoke-static {v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iget-object v3, v2, Lokhttp3/internal/connection/Exchange;->b:Lokhttp3/EventListener;

    .line 13
    .line 14
    iget-object v4, v2, Lokhttp3/internal/connection/Exchange;->a:Lokhttp3/internal/connection/RealCall;

    .line 15
    .line 16
    iget-object v5, v2, Lokhttp3/internal/connection/Exchange;->d:Lokhttp3/internal/http/ExchangeCodec;

    .line 17
    .line 18
    iget-object v0, v0, Lokhttp3/internal/http/RealInterceptorChain;->e:Lokhttp3/Request;

    .line 19
    .line 20
    iget-object v6, v0, Lokhttp3/Request;->d:Lokhttp3/RequestBody;

    .line 21
    .line 22
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 23
    .line 24
    .line 25
    move-result-wide v7

    .line 26
    :try_start_0
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    invoke-static {v4, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-interface {v5, v0}, Lokhttp3/internal/http/ExchangeCodec;->d(Lokhttp3/Request;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_4

    .line 33
    .line 34
    .line 35
    iget-object v9, v0, Lokhttp3/Request;->b:Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {v9}, Lokhttp3/internal/http/HttpMethod;->b(Ljava/lang/String;)Z

    .line 38
    .line 39
    .line 40
    move-result v9

    .line 41
    const/4 v10, 0x0

    .line 42
    const/4 v11, 0x0

    .line 43
    const/4 v12, 0x1

    .line 44
    iget-object v13, v2, Lokhttp3/internal/connection/Exchange;->f:Lokhttp3/internal/connection/RealConnection;

    .line 45
    .line 46
    if-eqz v9, :cond_4

    .line 47
    .line 48
    if-eqz v6, :cond_4

    .line 49
    .line 50
    iget-object v9, v0, Lokhttp3/Request;->c:Lokhttp3/Headers;

    .line 51
    .line 52
    const-string v14, "Expect"

    .line 53
    .line 54
    invoke-virtual {v9, v14}, Lokhttp3/Headers;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v9

    .line 58
    const-string v14, "100-continue"

    .line 59
    .line 60
    invoke-virtual {v14, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 61
    .line 62
    .line 63
    move-result v9

    .line 64
    if-eqz v9, :cond_0

    .line 65
    .line 66
    :try_start_1
    invoke-interface {v5}, Lokhttp3/internal/http/ExchangeCodec;->flushRequest()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 67
    .line 68
    .line 69
    invoke-virtual {v2, v12}, Lokhttp3/internal/connection/Exchange;->c(Z)Lokhttp3/Response$Builder;

    .line 70
    .line 71
    .line 72
    move-result-object v9

    .line 73
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    invoke-static {v4, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    move v14, v11

    .line 80
    goto :goto_0

    .line 81
    :catch_0
    move-exception v0

    .line 82
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    invoke-static {v4, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v2, v0}, Lokhttp3/internal/connection/Exchange;->d(Ljava/io/IOException;)V

    .line 89
    .line 90
    .line 91
    throw v0

    .line 92
    :cond_0
    move-object v9, v10

    .line 93
    move v14, v12

    .line 94
    :goto_0
    if-nez v9, :cond_2

    .line 95
    .line 96
    invoke-virtual {v6}, Lokhttp3/RequestBody;->isDuplex()Z

    .line 97
    .line 98
    .line 99
    move-result v15

    .line 100
    if-eqz v15, :cond_1

    .line 101
    .line 102
    :try_start_2
    invoke-interface {v5}, Lokhttp3/internal/http/ExchangeCodec;->flushRequest()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 103
    .line 104
    .line 105
    invoke-virtual {v2, v0, v12}, Lokhttp3/internal/connection/Exchange;->b(Lokhttp3/Request;Z)Lcg/F;

    .line 106
    .line 107
    .line 108
    move-result-object v12

    .line 109
    invoke-static {v12}, Lcg/b;->c(Lcg/F;)Lcg/A;

    .line 110
    .line 111
    .line 112
    move-result-object v12

    .line 113
    invoke-virtual {v6, v12}, Lokhttp3/RequestBody;->writeTo(Lcg/h;)V

    .line 114
    .line 115
    .line 116
    goto :goto_1

    .line 117
    :catch_1
    move-exception v0

    .line 118
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    invoke-static {v4, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v2, v0}, Lokhttp3/internal/connection/Exchange;->d(Ljava/io/IOException;)V

    .line 125
    .line 126
    .line 127
    throw v0

    .line 128
    :cond_1
    invoke-virtual {v2, v0, v11}, Lokhttp3/internal/connection/Exchange;->b(Lokhttp3/Request;Z)Lcg/F;

    .line 129
    .line 130
    .line 131
    move-result-object v12

    .line 132
    invoke-static {v12}, Lcg/b;->c(Lcg/F;)Lcg/A;

    .line 133
    .line 134
    .line 135
    move-result-object v12

    .line 136
    invoke-virtual {v6, v12}, Lokhttp3/RequestBody;->writeTo(Lcg/h;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v12}, Lcg/A;->close()V

    .line 140
    .line 141
    .line 142
    goto :goto_1

    .line 143
    :cond_2
    invoke-virtual {v4, v2, v12, v11, v10}, Lokhttp3/internal/connection/RealCall;->e(Lokhttp3/internal/connection/Exchange;ZZLjava/io/IOException;)Ljava/io/IOException;

    .line 144
    .line 145
    .line 146
    iget-object v12, v13, Lokhttp3/internal/connection/RealConnection;->g:Lokhttp3/internal/http2/Http2Connection;

    .line 147
    .line 148
    if-eqz v12, :cond_3

    .line 149
    .line 150
    goto :goto_1

    .line 151
    :cond_3
    invoke-interface {v5}, Lokhttp3/internal/http/ExchangeCodec;->getConnection()Lokhttp3/internal/connection/RealConnection;

    .line 152
    .line 153
    .line 154
    move-result-object v12

    .line 155
    invoke-virtual {v12}, Lokhttp3/internal/connection/RealConnection;->l()V

    .line 156
    .line 157
    .line 158
    :goto_1
    move v12, v14

    .line 159
    goto :goto_2

    .line 160
    :cond_4
    invoke-virtual {v4, v2, v12, v11, v10}, Lokhttp3/internal/connection/RealCall;->e(Lokhttp3/internal/connection/Exchange;ZZLjava/io/IOException;)Ljava/io/IOException;

    .line 161
    .line 162
    .line 163
    move-object v9, v10

    .line 164
    :goto_2
    if-eqz v6, :cond_5

    .line 165
    .line 166
    invoke-virtual {v6}, Lokhttp3/RequestBody;->isDuplex()Z

    .line 167
    .line 168
    .line 169
    move-result v6

    .line 170
    if-nez v6, :cond_6

    .line 171
    .line 172
    :cond_5
    :try_start_3
    invoke-interface {v5}, Lokhttp3/internal/http/ExchangeCodec;->finishRequest()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3

    .line 173
    .line 174
    .line 175
    :cond_6
    if-nez v9, :cond_7

    .line 176
    .line 177
    invoke-virtual {v2, v11}, Lokhttp3/internal/connection/Exchange;->c(Z)Lokhttp3/Response$Builder;

    .line 178
    .line 179
    .line 180
    move-result-object v9

    .line 181
    invoke-static {v9}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 182
    .line 183
    .line 184
    if-eqz v12, :cond_7

    .line 185
    .line 186
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    invoke-static {v4, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    move v12, v11

    .line 193
    :cond_7
    iput-object v0, v9, Lokhttp3/Response$Builder;->a:Lokhttp3/Request;

    .line 194
    .line 195
    iget-object v6, v13, Lokhttp3/internal/connection/RealConnection;->e:Lokhttp3/Handshake;

    .line 196
    .line 197
    iput-object v6, v9, Lokhttp3/Response$Builder;->e:Lokhttp3/Handshake;

    .line 198
    .line 199
    iput-wide v7, v9, Lokhttp3/Response$Builder;->k:J

    .line 200
    .line 201
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 202
    .line 203
    .line 204
    move-result-wide v14

    .line 205
    iput-wide v14, v9, Lokhttp3/Response$Builder;->l:J

    .line 206
    .line 207
    invoke-virtual {v9}, Lokhttp3/Response$Builder;->a()Lokhttp3/Response;

    .line 208
    .line 209
    .line 210
    move-result-object v6

    .line 211
    const/16 v9, 0x64

    .line 212
    .line 213
    iget v14, v6, Lokhttp3/Response;->d:I

    .line 214
    .line 215
    if-ne v14, v9, :cond_9

    .line 216
    .line 217
    invoke-virtual {v2, v11}, Lokhttp3/internal/connection/Exchange;->c(Z)Lokhttp3/Response$Builder;

    .line 218
    .line 219
    .line 220
    move-result-object v6

    .line 221
    invoke-static {v6}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 222
    .line 223
    .line 224
    if-eqz v12, :cond_8

    .line 225
    .line 226
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 227
    .line 228
    .line 229
    invoke-static {v4, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    :cond_8
    iput-object v0, v6, Lokhttp3/Response$Builder;->a:Lokhttp3/Request;

    .line 233
    .line 234
    iget-object v0, v13, Lokhttp3/internal/connection/RealConnection;->e:Lokhttp3/Handshake;

    .line 235
    .line 236
    iput-object v0, v6, Lokhttp3/Response$Builder;->e:Lokhttp3/Handshake;

    .line 237
    .line 238
    iput-wide v7, v6, Lokhttp3/Response$Builder;->k:J

    .line 239
    .line 240
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 241
    .line 242
    .line 243
    move-result-wide v0

    .line 244
    iput-wide v0, v6, Lokhttp3/Response$Builder;->l:J

    .line 245
    .line 246
    invoke-virtual {v6}, Lokhttp3/Response$Builder;->a()Lokhttp3/Response;

    .line 247
    .line 248
    .line 249
    move-result-object v6

    .line 250
    iget v14, v6, Lokhttp3/Response;->d:I

    .line 251
    .line 252
    :cond_9
    invoke-virtual {v6}, Lokhttp3/Response;->h()Lokhttp3/Response$Builder;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    :try_start_4
    const-string v1, "Content-Type"

    .line 257
    .line 258
    invoke-static {v1, v6}, Lokhttp3/Response;->b(Ljava/lang/String;Lokhttp3/Response;)Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v1

    .line 262
    invoke-interface {v5, v6}, Lokhttp3/internal/http/ExchangeCodec;->b(Lokhttp3/Response;)J

    .line 263
    .line 264
    .line 265
    move-result-wide v3

    .line 266
    invoke-interface {v5, v6}, Lokhttp3/internal/http/ExchangeCodec;->a(Lokhttp3/Response;)Lcg/H;

    .line 267
    .line 268
    .line 269
    move-result-object v6

    .line 270
    new-instance v7, Lokhttp3/internal/connection/Exchange$ResponseBodySource;

    .line 271
    .line 272
    invoke-direct {v7, v2, v6, v3, v4}, Lokhttp3/internal/connection/Exchange$ResponseBodySource;-><init>(Lokhttp3/internal/connection/Exchange;Lcg/H;J)V

    .line 273
    .line 274
    .line 275
    new-instance v6, Lokhttp3/internal/http/RealResponseBody;

    .line 276
    .line 277
    invoke-static {v7}, Lcg/b;->d(Lcg/H;)Lcg/B;

    .line 278
    .line 279
    .line 280
    move-result-object v7

    .line 281
    invoke-direct {v6, v1, v3, v4, v7}, Lokhttp3/internal/http/RealResponseBody;-><init>(Ljava/lang/String;JLcg/B;)V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2

    .line 282
    .line 283
    .line 284
    iput-object v6, v0, Lokhttp3/Response$Builder;->g:Lokhttp3/ResponseBody;

    .line 285
    .line 286
    invoke-virtual {v0}, Lokhttp3/Response$Builder;->a()Lokhttp3/Response;

    .line 287
    .line 288
    .line 289
    move-result-object v0

    .line 290
    iget-object v1, v0, Lokhttp3/Response;->a:Lokhttp3/Request;

    .line 291
    .line 292
    iget-object v1, v1, Lokhttp3/Request;->c:Lokhttp3/Headers;

    .line 293
    .line 294
    const-string v2, "Connection"

    .line 295
    .line 296
    invoke-virtual {v1, v2}, Lokhttp3/Headers;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object v1

    .line 300
    const-string v3, "close"

    .line 301
    .line 302
    invoke-virtual {v3, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 303
    .line 304
    .line 305
    move-result v1

    .line 306
    if-nez v1, :cond_a

    .line 307
    .line 308
    invoke-static {v2, v0}, Lokhttp3/Response;->b(Ljava/lang/String;Lokhttp3/Response;)Ljava/lang/String;

    .line 309
    .line 310
    .line 311
    move-result-object v1

    .line 312
    invoke-virtual {v3, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 313
    .line 314
    .line 315
    move-result v1

    .line 316
    if-eqz v1, :cond_b

    .line 317
    .line 318
    :cond_a
    invoke-interface {v5}, Lokhttp3/internal/http/ExchangeCodec;->getConnection()Lokhttp3/internal/connection/RealConnection;

    .line 319
    .line 320
    .line 321
    move-result-object v1

    .line 322
    invoke-virtual {v1}, Lokhttp3/internal/connection/RealConnection;->l()V

    .line 323
    .line 324
    .line 325
    :cond_b
    const/16 v1, 0xcc

    .line 326
    .line 327
    if-eq v14, v1, :cond_c

    .line 328
    .line 329
    const/16 v1, 0xcd

    .line 330
    .line 331
    if-ne v14, v1, :cond_f

    .line 332
    .line 333
    :cond_c
    iget-object v1, v0, Lokhttp3/Response;->g:Lokhttp3/ResponseBody;

    .line 334
    .line 335
    if-nez v1, :cond_d

    .line 336
    .line 337
    const-wide/16 v2, -0x1

    .line 338
    .line 339
    goto :goto_3

    .line 340
    :cond_d
    invoke-virtual {v1}, Lokhttp3/ResponseBody;->contentLength()J

    .line 341
    .line 342
    .line 343
    move-result-wide v2

    .line 344
    :goto_3
    const-wide/16 v4, 0x0

    .line 345
    .line 346
    cmp-long v2, v2, v4

    .line 347
    .line 348
    if-lez v2, :cond_f

    .line 349
    .line 350
    new-instance v0, Ljava/net/ProtocolException;

    .line 351
    .line 352
    const-string v2, "HTTP "

    .line 353
    .line 354
    const-string v3, " had non-zero Content-Length: "

    .line 355
    .line 356
    invoke-static {v14, v2, v3}, Lpd/f;->l(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 357
    .line 358
    .line 359
    move-result-object v2

    .line 360
    if-nez v1, :cond_e

    .line 361
    .line 362
    goto :goto_4

    .line 363
    :cond_e
    invoke-virtual {v1}, Lokhttp3/ResponseBody;->contentLength()J

    .line 364
    .line 365
    .line 366
    move-result-wide v3

    .line 367
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 368
    .line 369
    .line 370
    move-result-object v10

    .line 371
    :goto_4
    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 372
    .line 373
    .line 374
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 375
    .line 376
    .line 377
    move-result-object v1

    .line 378
    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 379
    .line 380
    .line 381
    throw v0

    .line 382
    :cond_f
    return-object v0

    .line 383
    :catch_2
    move-exception v0

    .line 384
    invoke-virtual {v2, v0}, Lokhttp3/internal/connection/Exchange;->d(Ljava/io/IOException;)V

    .line 385
    .line 386
    .line 387
    throw v0

    .line 388
    :catch_3
    move-exception v0

    .line 389
    invoke-virtual {v2, v0}, Lokhttp3/internal/connection/Exchange;->d(Ljava/io/IOException;)V

    .line 390
    .line 391
    .line 392
    throw v0

    .line 393
    :catch_4
    move-exception v0

    .line 394
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 395
    .line 396
    .line 397
    invoke-static {v4, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 398
    .line 399
    .line 400
    invoke-virtual {v2, v0}, Lokhttp3/internal/connection/Exchange;->d(Ljava/io/IOException;)V

    .line 401
    .line 402
    .line 403
    throw v0
.end method
