.class final Lokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSource;
.super Lokhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lokhttp3/internal/http1/Http1ExchangeCodec;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "ChunkedSource"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Lokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSource;",
        "Lokhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;",
        "Lokhttp3/internal/http1/Http1ExchangeCodec;",
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


# instance fields
.field public final d:Lokhttp3/HttpUrl;

.field public e:J

.field public f:Z

.field public final synthetic g:Lokhttp3/internal/http1/Http1ExchangeCodec;


# direct methods
.method public constructor <init>(Lokhttp3/internal/http1/Http1ExchangeCodec;Lokhttp3/HttpUrl;)V
    .locals 1

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "url"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSource;->g:Lokhttp3/internal/http1/Http1ExchangeCodec;

    .line 12
    .line 13
    invoke-direct {p0, p1}, Lokhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;-><init>(Lokhttp3/internal/http1/Http1ExchangeCodec;)V

    .line 14
    .line 15
    .line 16
    iput-object p2, p0, Lokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSource;->d:Lokhttp3/HttpUrl;

    .line 17
    .line 18
    const-wide/16 p1, -0x1

    .line 19
    .line 20
    iput-wide p1, p0, Lokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSource;->e:J

    .line 21
    .line 22
    const/4 p1, 0x1

    .line 23
    iput-boolean p1, p0, Lokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSource;->f:Z

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lokhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-boolean v0, p0, Lokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSource;->f:Z

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 11
    .line 12
    invoke-static {p0}, Lokhttp3/internal/Util;->g(Lcg/H;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    iget-object v0, p0, Lokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSource;->g:Lokhttp3/internal/http1/Http1ExchangeCodec;

    .line 19
    .line 20
    iget-object v0, v0, Lokhttp3/internal/http1/Http1ExchangeCodec;->b:Lokhttp3/internal/connection/RealConnection;

    .line 21
    .line 22
    invoke-virtual {v0}, Lokhttp3/internal/connection/RealConnection;->l()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Lokhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;->a()V

    .line 26
    .line 27
    .line 28
    :cond_1
    const/4 v0, 0x1

    .line 29
    iput-boolean v0, p0, Lokhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;->b:Z

    .line 30
    .line 31
    return-void
.end method

.method public final read(Lcg/g;J)J
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-wide/from16 v2, p2

    .line 6
    .line 7
    const-string v4, "sink"

    .line 8
    .line 9
    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-wide/16 v4, 0x0

    .line 13
    .line 14
    cmp-long v6, v2, v4

    .line 15
    .line 16
    if-ltz v6, :cond_10

    .line 17
    .line 18
    iget-boolean v6, v1, Lokhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;->b:Z

    .line 19
    .line 20
    if-nez v6, :cond_f

    .line 21
    .line 22
    iget-boolean v6, v1, Lokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSource;->f:Z

    .line 23
    .line 24
    const-wide/16 v7, -0x1

    .line 25
    .line 26
    if-nez v6, :cond_0

    .line 27
    .line 28
    goto/16 :goto_6

    .line 29
    .line 30
    :cond_0
    iget-wide v9, v1, Lokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSource;->e:J

    .line 31
    .line 32
    cmp-long v6, v9, v4

    .line 33
    .line 34
    iget-object v11, v1, Lokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSource;->g:Lokhttp3/internal/http1/Http1ExchangeCodec;

    .line 35
    .line 36
    if-eqz v6, :cond_1

    .line 37
    .line 38
    cmp-long v6, v9, v7

    .line 39
    .line 40
    if-nez v6, :cond_c

    .line 41
    .line 42
    :cond_1
    const-string v6, "expected chunk size and optional extensions but was \""

    .line 43
    .line 44
    cmp-long v9, v9, v7

    .line 45
    .line 46
    if-eqz v9, :cond_2

    .line 47
    .line 48
    iget-object v9, v11, Lokhttp3/internal/http1/Http1ExchangeCodec;->c:Lcg/B;

    .line 49
    .line 50
    const-wide v12, 0x7fffffffffffffffL

    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    invoke-virtual {v9, v12, v13}, Lcg/B;->readUtf8LineStrict(J)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    :cond_2
    :try_start_0
    iget-object v9, v11, Lokhttp3/internal/http1/Http1ExchangeCodec;->c:Lcg/B;

    .line 59
    .line 60
    const-wide/16 v12, 0x1

    .line 61
    .line 62
    invoke-virtual {v9, v12, v13}, Lcg/B;->require(J)V

    .line 63
    .line 64
    .line 65
    const/4 v10, 0x0

    .line 66
    move v12, v10

    .line 67
    :goto_0
    add-int/lit8 v13, v12, 0x1

    .line 68
    .line 69
    int-to-long v14, v13

    .line 70
    invoke-virtual {v9, v14, v15}, Lcg/B;->request(J)Z

    .line 71
    .line 72
    .line 73
    move-result v14

    .line 74
    iget-object v15, v9, Lcg/B;->b:Lcg/g;

    .line 75
    .line 76
    if-eqz v14, :cond_8

    .line 77
    .line 78
    move-wide/from16 v16, v4

    .line 79
    .line 80
    int-to-long v4, v12

    .line 81
    invoke-virtual {v15, v4, v5}, Lcg/g;->o(J)B

    .line 82
    .line 83
    .line 84
    move-result v4

    .line 85
    const/16 v5, 0x30

    .line 86
    .line 87
    if-lt v4, v5, :cond_3

    .line 88
    .line 89
    const/16 v5, 0x39

    .line 90
    .line 91
    if-le v4, v5, :cond_5

    .line 92
    .line 93
    :cond_3
    const/16 v5, 0x61

    .line 94
    .line 95
    if-lt v4, v5, :cond_4

    .line 96
    .line 97
    const/16 v5, 0x66

    .line 98
    .line 99
    if-le v4, v5, :cond_5

    .line 100
    .line 101
    :cond_4
    const/16 v5, 0x41

    .line 102
    .line 103
    if-lt v4, v5, :cond_6

    .line 104
    .line 105
    const/16 v5, 0x46

    .line 106
    .line 107
    if-le v4, v5, :cond_5

    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_5
    move v12, v13

    .line 111
    move-wide/from16 v4, v16

    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_6
    :goto_1
    if-eqz v12, :cond_7

    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_7
    new-instance v0, Ljava/lang/NumberFormatException;

    .line 118
    .line 119
    const/16 v2, 0x10

    .line 120
    .line 121
    invoke-static {v2}, Ltg/b;->t(I)V

    .line 122
    .line 123
    .line 124
    invoke-static {v4, v2}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    const-string v3, "toString(...)"

    .line 129
    .line 130
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    const-string v3, "Expected leading [0-9a-fA-F] character but was 0x"

    .line 134
    .line 135
    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    invoke-direct {v0, v2}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    throw v0

    .line 143
    :cond_8
    move-wide/from16 v16, v4

    .line 144
    .line 145
    :goto_2
    invoke-virtual {v15}, Lcg/g;->readHexadecimalUnsignedLong()J

    .line 146
    .line 147
    .line 148
    move-result-wide v4

    .line 149
    iput-wide v4, v1, Lokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSource;->e:J

    .line 150
    .line 151
    iget-object v4, v11, Lokhttp3/internal/http1/Http1ExchangeCodec;->c:Lcg/B;

    .line 152
    .line 153
    const-wide v12, 0x7fffffffffffffffL

    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    invoke-virtual {v4, v12, v13}, Lcg/B;->readUtf8LineStrict(J)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v4

    .line 162
    invoke-static {v4}, LBf/k;->V0(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 163
    .line 164
    .line 165
    move-result-object v4

    .line 166
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v4

    .line 170
    iget-wide v12, v1, Lokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSource;->e:J

    .line 171
    .line 172
    cmp-long v5, v12, v16

    .line 173
    .line 174
    if-ltz v5, :cond_e

    .line 175
    .line 176
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 177
    .line 178
    .line 179
    move-result v5

    .line 180
    if-lez v5, :cond_9

    .line 181
    .line 182
    const-string v5, ";"

    .line 183
    .line 184
    invoke-static {v4, v5, v10}, LBf/r;->k0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 185
    .line 186
    .line 187
    move-result v5
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 188
    if-eqz v5, :cond_e

    .line 189
    .line 190
    goto :goto_3

    .line 191
    :catch_0
    move-exception v0

    .line 192
    goto/16 :goto_7

    .line 193
    .line 194
    :cond_9
    :goto_3
    iget-wide v4, v1, Lokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSource;->e:J

    .line 195
    .line 196
    cmp-long v4, v4, v16

    .line 197
    .line 198
    if-nez v4, :cond_b

    .line 199
    .line 200
    iput-boolean v10, v1, Lokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSource;->f:Z

    .line 201
    .line 202
    iget-object v4, v11, Lokhttp3/internal/http1/Http1ExchangeCodec;->f:Lokhttp3/internal/http1/HeadersReader;

    .line 203
    .line 204
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 205
    .line 206
    .line 207
    new-instance v5, Lokhttp3/Headers$Builder;

    .line 208
    .line 209
    invoke-direct {v5}, Lokhttp3/Headers$Builder;-><init>()V

    .line 210
    .line 211
    .line 212
    :goto_4
    iget-object v6, v4, Lokhttp3/internal/http1/HeadersReader;->a:Lcg/B;

    .line 213
    .line 214
    iget-wide v9, v4, Lokhttp3/internal/http1/HeadersReader;->b:J

    .line 215
    .line 216
    invoke-virtual {v6, v9, v10}, Lcg/B;->readUtf8LineStrict(J)Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v6

    .line 220
    iget-wide v9, v4, Lokhttp3/internal/http1/HeadersReader;->b:J

    .line 221
    .line 222
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 223
    .line 224
    .line 225
    move-result v12

    .line 226
    int-to-long v12, v12

    .line 227
    sub-long/2addr v9, v12

    .line 228
    iput-wide v9, v4, Lokhttp3/internal/http1/HeadersReader;->b:J

    .line 229
    .line 230
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 231
    .line 232
    .line 233
    move-result v9

    .line 234
    if-nez v9, :cond_a

    .line 235
    .line 236
    invoke-virtual {v5}, Lokhttp3/Headers$Builder;->d()Lokhttp3/Headers;

    .line 237
    .line 238
    .line 239
    move-result-object v4

    .line 240
    iput-object v4, v11, Lokhttp3/internal/http1/Http1ExchangeCodec;->g:Lokhttp3/Headers;

    .line 241
    .line 242
    iget-object v4, v11, Lokhttp3/internal/http1/Http1ExchangeCodec;->a:Lokhttp3/OkHttpClient;

    .line 243
    .line 244
    invoke-static {v4}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 245
    .line 246
    .line 247
    iget-object v5, v11, Lokhttp3/internal/http1/Http1ExchangeCodec;->g:Lokhttp3/Headers;

    .line 248
    .line 249
    invoke-static {v5}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 250
    .line 251
    .line 252
    iget-object v4, v4, Lokhttp3/OkHttpClient;->j:Lokhttp3/CookieJar;

    .line 253
    .line 254
    iget-object v6, v1, Lokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSource;->d:Lokhttp3/HttpUrl;

    .line 255
    .line 256
    invoke-static {v4, v6, v5}, Lokhttp3/internal/http/HttpHeaders;->d(Lokhttp3/CookieJar;Lokhttp3/HttpUrl;Lokhttp3/Headers;)V

    .line 257
    .line 258
    .line 259
    invoke-virtual {v1}, Lokhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;->a()V

    .line 260
    .line 261
    .line 262
    goto :goto_5

    .line 263
    :cond_a
    invoke-virtual {v5, v6}, Lokhttp3/Headers$Builder;->b(Ljava/lang/String;)V

    .line 264
    .line 265
    .line 266
    goto :goto_4

    .line 267
    :cond_b
    :goto_5
    iget-boolean v4, v1, Lokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSource;->f:Z

    .line 268
    .line 269
    if-nez v4, :cond_c

    .line 270
    .line 271
    :goto_6
    return-wide v7

    .line 272
    :cond_c
    iget-wide v4, v1, Lokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSource;->e:J

    .line 273
    .line 274
    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->min(JJ)J

    .line 275
    .line 276
    .line 277
    move-result-wide v2

    .line 278
    invoke-super {v1, v0, v2, v3}, Lokhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;->read(Lcg/g;J)J

    .line 279
    .line 280
    .line 281
    move-result-wide v2

    .line 282
    cmp-long v0, v2, v7

    .line 283
    .line 284
    if-eqz v0, :cond_d

    .line 285
    .line 286
    iget-wide v4, v1, Lokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSource;->e:J

    .line 287
    .line 288
    sub-long/2addr v4, v2

    .line 289
    iput-wide v4, v1, Lokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSource;->e:J

    .line 290
    .line 291
    return-wide v2

    .line 292
    :cond_d
    iget-object v0, v11, Lokhttp3/internal/http1/Http1ExchangeCodec;->b:Lokhttp3/internal/connection/RealConnection;

    .line 293
    .line 294
    invoke-virtual {v0}, Lokhttp3/internal/connection/RealConnection;->l()V

    .line 295
    .line 296
    .line 297
    new-instance v0, Ljava/net/ProtocolException;

    .line 298
    .line 299
    const-string v2, "unexpected end of stream"

    .line 300
    .line 301
    invoke-direct {v0, v2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 302
    .line 303
    .line 304
    invoke-virtual {v1}, Lokhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;->a()V

    .line 305
    .line 306
    .line 307
    throw v0

    .line 308
    :cond_e
    :try_start_1
    new-instance v0, Ljava/net/ProtocolException;

    .line 309
    .line 310
    new-instance v2, Ljava/lang/StringBuilder;

    .line 311
    .line 312
    invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 313
    .line 314
    .line 315
    iget-wide v5, v1, Lokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSource;->e:J

    .line 316
    .line 317
    invoke-virtual {v2, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 318
    .line 319
    .line 320
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 321
    .line 322
    .line 323
    const/16 v3, 0x22

    .line 324
    .line 325
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 326
    .line 327
    .line 328
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 329
    .line 330
    .line 331
    move-result-object v2

    .line 332
    invoke-direct {v0, v2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 333
    .line 334
    .line 335
    throw v0
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    .line 336
    :goto_7
    new-instance v2, Ljava/net/ProtocolException;

    .line 337
    .line 338
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 339
    .line 340
    .line 341
    move-result-object v0

    .line 342
    invoke-direct {v2, v0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 343
    .line 344
    .line 345
    throw v2

    .line 346
    :cond_f
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 347
    .line 348
    const-string v2, "closed"

    .line 349
    .line 350
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 351
    .line 352
    .line 353
    throw v0

    .line 354
    :cond_10
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 355
    .line 356
    .line 357
    move-result-object v0

    .line 358
    const-string v2, "byteCount < 0: "

    .line 359
    .line 360
    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 361
    .line 362
    .line 363
    move-result-object v0

    .line 364
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 365
    .line 366
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 367
    .line 368
    .line 369
    move-result-object v0

    .line 370
    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 371
    .line 372
    .line 373
    throw v2
.end method
