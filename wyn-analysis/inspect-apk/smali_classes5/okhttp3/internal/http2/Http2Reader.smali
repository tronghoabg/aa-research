.class public final Lokhttp3/internal/http2/Http2Reader;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lokhttp3/internal/http2/Http2Reader$ContinuationSource;,
        Lokhttp3/internal/http2/Http2Reader$Handler;,
        Lokhttp3/internal/http2/Http2Reader$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Lokhttp3/internal/http2/Http2Reader;",
        "Ljava/io/Closeable;",
        "Companion",
        "ContinuationSource",
        "Handler",
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
.field public static final d:Lokhttp3/internal/http2/Http2Reader$Companion;

.field public static final e:Ljava/util/logging/Logger;


# instance fields
.field public final a:Lcg/B;

.field public final b:Lokhttp3/internal/http2/Http2Reader$ContinuationSource;

.field public final c:Lokhttp3/internal/http2/Hpack$Reader;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lokhttp3/internal/http2/Http2Reader$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lokhttp3/internal/http2/Http2Reader$Companion;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lokhttp3/internal/http2/Http2Reader;->d:Lokhttp3/internal/http2/Http2Reader$Companion;

    .line 8
    .line 9
    const-class v0, Lokhttp3/internal/http2/Http2;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const-string v1, "getLogger(Http2::class.java.name)"

    .line 20
    .line 21
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    sput-object v0, Lokhttp3/internal/http2/Http2Reader;->e:Ljava/util/logging/Logger;

    .line 25
    .line 26
    return-void
.end method

.method public constructor <init>(Lcg/B;)V
    .locals 1

    .line 1
    const-string v0, "source"

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
    iput-object p1, p0, Lokhttp3/internal/http2/Http2Reader;->a:Lcg/B;

    .line 10
    .line 11
    new-instance v0, Lokhttp3/internal/http2/Http2Reader$ContinuationSource;

    .line 12
    .line 13
    invoke-direct {v0, p1}, Lokhttp3/internal/http2/Http2Reader$ContinuationSource;-><init>(Lcg/B;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lokhttp3/internal/http2/Http2Reader;->b:Lokhttp3/internal/http2/Http2Reader$ContinuationSource;

    .line 17
    .line 18
    new-instance p1, Lokhttp3/internal/http2/Hpack$Reader;

    .line 19
    .line 20
    invoke-direct {p1, v0}, Lokhttp3/internal/http2/Hpack$Reader;-><init>(Lokhttp3/internal/http2/Http2Reader$ContinuationSource;)V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Lokhttp3/internal/http2/Http2Reader;->c:Lokhttp3/internal/http2/Hpack$Reader;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final a(ZLokhttp3/internal/http2/Http2Connection$ReaderRunnable;)Z
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p2

    .line 4
    .line 5
    const/4 v2, 0x6

    .line 6
    const/16 v3, 0x8

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x1

    .line 10
    iget-object v6, v1, Lokhttp3/internal/http2/Http2Reader;->a:Lcg/B;

    .line 11
    .line 12
    const-wide/16 v7, 0x9

    .line 13
    .line 14
    :try_start_0
    invoke-virtual {v6, v7, v8}, Lcg/B;->require(J)V
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    .line 16
    .line 17
    invoke-static {v6}, Lokhttp3/internal/Util;->s(Lcg/B;)I

    .line 18
    .line 19
    .line 20
    move-result v7

    .line 21
    const/16 v8, 0x4000

    .line 22
    .line 23
    if-gt v7, v8, :cond_35

    .line 24
    .line 25
    invoke-virtual {v6}, Lcg/B;->readByte()B

    .line 26
    .line 27
    .line 28
    move-result v9

    .line 29
    and-int/lit16 v9, v9, 0xff

    .line 30
    .line 31
    invoke-virtual {v6}, Lcg/B;->readByte()B

    .line 32
    .line 33
    .line 34
    move-result v10

    .line 35
    and-int/lit16 v11, v10, 0xff

    .line 36
    .line 37
    invoke-virtual {v6}, Lcg/B;->readInt()I

    .line 38
    .line 39
    .line 40
    move-result v12

    .line 41
    const v13, 0x7fffffff

    .line 42
    .line 43
    .line 44
    and-int v14, v12, v13

    .line 45
    .line 46
    sget-object v15, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    .line 47
    .line 48
    move/from16 v16, v13

    .line 49
    .line 50
    sget-object v13, Lokhttp3/internal/http2/Http2Reader;->e:Ljava/util/logging/Logger;

    .line 51
    .line 52
    invoke-virtual {v13, v15}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    .line 53
    .line 54
    .line 55
    move-result v15

    .line 56
    if-eqz v15, :cond_0

    .line 57
    .line 58
    sget-object v15, Lokhttp3/internal/http2/Http2;->a:Lokhttp3/internal/http2/Http2;

    .line 59
    .line 60
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    invoke-static {v5, v14, v7, v9, v11}, Lokhttp3/internal/http2/Http2;->a(ZIIII)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v15

    .line 67
    invoke-virtual {v13, v15}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    :cond_0
    const/4 v13, 0x4

    .line 71
    if-eqz p1, :cond_3

    .line 72
    .line 73
    if-ne v9, v13, :cond_1

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_1
    new-instance v0, Ljava/io/IOException;

    .line 77
    .line 78
    sget-object v2, Lokhttp3/internal/http2/Http2;->a:Lokhttp3/internal/http2/Http2;

    .line 79
    .line 80
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    sget-object v2, Lokhttp3/internal/http2/Http2;->c:[Ljava/lang/String;

    .line 84
    .line 85
    array-length v3, v2

    .line 86
    if-ge v9, v3, :cond_2

    .line 87
    .line 88
    aget-object v2, v2, v9

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_2
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    new-array v3, v5, [Ljava/lang/Object;

    .line 96
    .line 97
    aput-object v2, v3, v4

    .line 98
    .line 99
    const-string v2, "0x%02x"

    .line 100
    .line 101
    invoke-static {v2, v3}, Lokhttp3/internal/Util;->h(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    :goto_0
    const-string v3, "Expected a SETTINGS frame but was "

    .line 106
    .line 107
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    throw v0

    .line 115
    :cond_3
    :goto_1
    sget-object v15, Lokhttp3/internal/http2/Http2Reader;->d:Lokhttp3/internal/http2/Http2Reader$Companion;

    .line 116
    .line 117
    const/16 v17, 0x0

    .line 118
    .line 119
    move/from16 v18, v9

    .line 120
    .line 121
    const-wide/16 v19, 0x0

    .line 122
    .line 123
    const/4 v8, 0x5

    .line 124
    packed-switch v18, :pswitch_data_0

    .line 125
    .line 126
    .line 127
    int-to-long v2, v7

    .line 128
    invoke-virtual {v6, v2, v3}, Lcg/B;->skip(J)V

    .line 129
    .line 130
    .line 131
    return v5

    .line 132
    :pswitch_0
    if-ne v7, v13, :cond_7

    .line 133
    .line 134
    invoke-virtual {v6}, Lcg/B;->readInt()I

    .line 135
    .line 136
    .line 137
    move-result v2

    .line 138
    int-to-long v2, v2

    .line 139
    const-wide/32 v6, 0x7fffffff

    .line 140
    .line 141
    .line 142
    and-long/2addr v2, v6

    .line 143
    cmp-long v4, v2, v19

    .line 144
    .line 145
    if-eqz v4, :cond_6

    .line 146
    .line 147
    if-nez v14, :cond_4

    .line 148
    .line 149
    iget-object v4, v0, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;->b:Lokhttp3/internal/http2/Http2Connection;

    .line 150
    .line 151
    monitor-enter v4

    .line 152
    :try_start_1
    iget-wide v6, v4, Lokhttp3/internal/http2/Http2Connection;->v:J

    .line 153
    .line 154
    add-long/2addr v6, v2

    .line 155
    iput-wide v6, v4, Lokhttp3/internal/http2/Http2Connection;->v:J

    .line 156
    .line 157
    invoke-virtual {v4}, Ljava/lang/Object;->notifyAll()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 158
    .line 159
    .line 160
    monitor-exit v4

    .line 161
    return v5

    .line 162
    :catchall_0
    move-exception v0

    .line 163
    monitor-exit v4

    .line 164
    throw v0

    .line 165
    :cond_4
    iget-object v0, v0, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;->b:Lokhttp3/internal/http2/Http2Connection;

    .line 166
    .line 167
    invoke-virtual {v0, v14}, Lokhttp3/internal/http2/Http2Connection;->d(I)Lokhttp3/internal/http2/Http2Stream;

    .line 168
    .line 169
    .line 170
    move-result-object v6

    .line 171
    if-eqz v6, :cond_26

    .line 172
    .line 173
    monitor-enter v6

    .line 174
    :try_start_2
    iget-wide v7, v6, Lokhttp3/internal/http2/Http2Stream;->f:J

    .line 175
    .line 176
    add-long/2addr v7, v2

    .line 177
    iput-wide v7, v6, Lokhttp3/internal/http2/Http2Stream;->f:J

    .line 178
    .line 179
    if-lez v4, :cond_5

    .line 180
    .line 181
    invoke-virtual {v6}, Ljava/lang/Object;->notifyAll()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 182
    .line 183
    .line 184
    :cond_5
    monitor-exit v6

    .line 185
    return v5

    .line 186
    :catchall_1
    move-exception v0

    .line 187
    monitor-exit v6

    .line 188
    throw v0

    .line 189
    :cond_6
    new-instance v0, Ljava/io/IOException;

    .line 190
    .line 191
    const-string v2, "windowSizeIncrement was 0"

    .line 192
    .line 193
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    throw v0

    .line 197
    :cond_7
    new-instance v0, Ljava/io/IOException;

    .line 198
    .line 199
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 200
    .line 201
    .line 202
    move-result-object v2

    .line 203
    const-string v3, "TYPE_WINDOW_UPDATE length !=4: "

    .line 204
    .line 205
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v2

    .line 209
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    throw v0

    .line 213
    :pswitch_1
    if-lt v7, v3, :cond_d

    .line 214
    .line 215
    if-nez v14, :cond_c

    .line 216
    .line 217
    invoke-virtual {v6}, Lcg/B;->readInt()I

    .line 218
    .line 219
    .line 220
    move-result v2

    .line 221
    invoke-virtual {v6}, Lcg/B;->readInt()I

    .line 222
    .line 223
    .line 224
    move-result v8

    .line 225
    sub-int/2addr v7, v3

    .line 226
    sget-object v3, Lokhttp3/internal/http2/ErrorCode;->b:Lokhttp3/internal/http2/ErrorCode$Companion;

    .line 227
    .line 228
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 229
    .line 230
    .line 231
    invoke-static {}, Lokhttp3/internal/http2/ErrorCode;->values()[Lokhttp3/internal/http2/ErrorCode;

    .line 232
    .line 233
    .line 234
    move-result-object v3

    .line 235
    array-length v9, v3

    .line 236
    :goto_2
    if-ge v4, v9, :cond_9

    .line 237
    .line 238
    aget-object v10, v3, v4

    .line 239
    .line 240
    iget v11, v10, Lokhttp3/internal/http2/ErrorCode;->a:I

    .line 241
    .line 242
    if-ne v11, v8, :cond_8

    .line 243
    .line 244
    goto :goto_3

    .line 245
    :cond_8
    add-int/2addr v4, v5

    .line 246
    goto :goto_2

    .line 247
    :cond_9
    move-object/from16 v10, v17

    .line 248
    .line 249
    :goto_3
    if-eqz v10, :cond_b

    .line 250
    .line 251
    sget-object v3, Lcg/j;->d:Lcg/j;

    .line 252
    .line 253
    if-lez v7, :cond_a

    .line 254
    .line 255
    int-to-long v3, v7

    .line 256
    invoke-virtual {v6, v3, v4}, Lcg/B;->a(J)Lcg/j;

    .line 257
    .line 258
    .line 259
    move-result-object v3

    .line 260
    :cond_a
    invoke-virtual {v0, v2, v10, v3}, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;->b(ILokhttp3/internal/http2/ErrorCode;Lcg/j;)V

    .line 261
    .line 262
    .line 263
    return v5

    .line 264
    :cond_b
    new-instance v0, Ljava/io/IOException;

    .line 265
    .line 266
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 267
    .line 268
    .line 269
    move-result-object v2

    .line 270
    const-string v3, "TYPE_GOAWAY unexpected error code: "

    .line 271
    .line 272
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object v2

    .line 276
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 277
    .line 278
    .line 279
    throw v0

    .line 280
    :cond_c
    new-instance v0, Ljava/io/IOException;

    .line 281
    .line 282
    const-string v2, "TYPE_GOAWAY streamId != 0"

    .line 283
    .line 284
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    throw v0

    .line 288
    :cond_d
    new-instance v0, Ljava/io/IOException;

    .line 289
    .line 290
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 291
    .line 292
    .line 293
    move-result-object v2

    .line 294
    const-string v3, "TYPE_GOAWAY length < 8: "

    .line 295
    .line 296
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object v2

    .line 300
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 301
    .line 302
    .line 303
    throw v0

    .line 304
    :pswitch_2
    if-ne v7, v3, :cond_10

    .line 305
    .line 306
    if-nez v14, :cond_f

    .line 307
    .line 308
    invoke-virtual {v6}, Lcg/B;->readInt()I

    .line 309
    .line 310
    .line 311
    move-result v2

    .line 312
    invoke-virtual {v6}, Lcg/B;->readInt()I

    .line 313
    .line 314
    .line 315
    move-result v3

    .line 316
    and-int/lit8 v6, v10, 0x1

    .line 317
    .line 318
    if-eqz v6, :cond_e

    .line 319
    .line 320
    move v4, v5

    .line 321
    :cond_e
    invoke-virtual {v0, v4, v2, v3}, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;->d(ZII)V

    .line 322
    .line 323
    .line 324
    return v5

    .line 325
    :cond_f
    new-instance v0, Ljava/io/IOException;

    .line 326
    .line 327
    const-string v2, "TYPE_PING streamId != 0"

    .line 328
    .line 329
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 330
    .line 331
    .line 332
    throw v0

    .line 333
    :cond_10
    new-instance v0, Ljava/io/IOException;

    .line 334
    .line 335
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 336
    .line 337
    .line 338
    move-result-object v2

    .line 339
    const-string v3, "TYPE_PING length != 8: "

    .line 340
    .line 341
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object v2

    .line 345
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 346
    .line 347
    .line 348
    throw v0

    .line 349
    :pswitch_3
    if-eqz v14, :cond_12

    .line 350
    .line 351
    and-int/lit8 v2, v10, 0x8

    .line 352
    .line 353
    if-eqz v2, :cond_11

    .line 354
    .line 355
    invoke-virtual {v6}, Lcg/B;->readByte()B

    .line 356
    .line 357
    .line 358
    move-result v2

    .line 359
    and-int/lit16 v4, v2, 0xff

    .line 360
    .line 361
    :cond_11
    invoke-virtual {v6}, Lcg/B;->readInt()I

    .line 362
    .line 363
    .line 364
    move-result v2

    .line 365
    and-int v2, v2, v16

    .line 366
    .line 367
    sub-int/2addr v7, v13

    .line 368
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 369
    .line 370
    .line 371
    invoke-static {v7, v11, v4}, Lokhttp3/internal/http2/Http2Reader$Companion;->a(III)I

    .line 372
    .line 373
    .line 374
    move-result v3

    .line 375
    invoke-virtual {v1, v3, v4, v11, v14}, Lokhttp3/internal/http2/Http2Reader;->b(IIII)Ljava/util/List;

    .line 376
    .line 377
    .line 378
    move-result-object v3

    .line 379
    invoke-virtual {v0, v14, v2, v3}, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;->e(IILjava/util/List;)V

    .line 380
    .line 381
    .line 382
    return v5

    .line 383
    :cond_12
    new-instance v0, Ljava/io/IOException;

    .line 384
    .line 385
    const-string v2, "PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0"

    .line 386
    .line 387
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 388
    .line 389
    .line 390
    throw v0

    .line 391
    :pswitch_4
    if-nez v14, :cond_22

    .line 392
    .line 393
    and-int/lit8 v3, v10, 0x1

    .line 394
    .line 395
    if-eqz v3, :cond_14

    .line 396
    .line 397
    if-nez v7, :cond_13

    .line 398
    .line 399
    goto/16 :goto_9

    .line 400
    .line 401
    :cond_13
    new-instance v0, Ljava/io/IOException;

    .line 402
    .line 403
    const-string v2, "FRAME_SIZE_ERROR ack frame should be empty!"

    .line 404
    .line 405
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 406
    .line 407
    .line 408
    throw v0

    .line 409
    :cond_14
    rem-int/lit8 v3, v7, 0x6

    .line 410
    .line 411
    if-nez v3, :cond_21

    .line 412
    .line 413
    new-instance v3, Lokhttp3/internal/http2/Settings;

    .line 414
    .line 415
    invoke-direct {v3}, Lokhttp3/internal/http2/Settings;-><init>()V

    .line 416
    .line 417
    .line 418
    invoke-static {v4, v7}, Landroid/support/v4/media/session/b;->u0(II)Lzf/g;

    .line 419
    .line 420
    .line 421
    move-result-object v4

    .line 422
    invoke-static {v4, v2}, Landroid/support/v4/media/session/b;->r0(Lzf/g;I)Lzf/e;

    .line 423
    .line 424
    .line 425
    move-result-object v2

    .line 426
    iget v4, v2, Lzf/e;->a:I

    .line 427
    .line 428
    iget v7, v2, Lzf/e;->b:I

    .line 429
    .line 430
    iget v2, v2, Lzf/e;->c:I

    .line 431
    .line 432
    if-lez v2, :cond_15

    .line 433
    .line 434
    if-le v4, v7, :cond_16

    .line 435
    .line 436
    :cond_15
    if-gez v2, :cond_20

    .line 437
    .line 438
    if-gt v7, v4, :cond_20

    .line 439
    .line 440
    :cond_16
    :goto_4
    add-int v9, v4, v2

    .line 441
    .line 442
    invoke-virtual {v6}, Lcg/B;->readShort()S

    .line 443
    .line 444
    .line 445
    move-result v10

    .line 446
    sget-object v11, Lokhttp3/internal/Util;->a:[B

    .line 447
    .line 448
    const v11, 0xffff

    .line 449
    .line 450
    .line 451
    and-int/2addr v10, v11

    .line 452
    invoke-virtual {v6}, Lcg/B;->readInt()I

    .line 453
    .line 454
    .line 455
    move-result v11

    .line 456
    const/4 v12, 0x2

    .line 457
    if-eq v10, v12, :cond_1c

    .line 458
    .line 459
    const/4 v12, 0x3

    .line 460
    if-eq v10, v12, :cond_1b

    .line 461
    .line 462
    if-eq v10, v13, :cond_19

    .line 463
    .line 464
    if-eq v10, v8, :cond_17

    .line 465
    .line 466
    const/16 v12, 0x4000

    .line 467
    .line 468
    goto :goto_5

    .line 469
    :cond_17
    const/16 v12, 0x4000

    .line 470
    .line 471
    if-lt v11, v12, :cond_18

    .line 472
    .line 473
    const v14, 0xffffff

    .line 474
    .line 475
    .line 476
    if-gt v11, v14, :cond_18

    .line 477
    .line 478
    goto :goto_5

    .line 479
    :cond_18
    new-instance v0, Ljava/io/IOException;

    .line 480
    .line 481
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 482
    .line 483
    .line 484
    move-result-object v2

    .line 485
    const-string v3, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "

    .line 486
    .line 487
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 488
    .line 489
    .line 490
    move-result-object v2

    .line 491
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 492
    .line 493
    .line 494
    throw v0

    .line 495
    :cond_19
    const/16 v12, 0x4000

    .line 496
    .line 497
    if-ltz v11, :cond_1a

    .line 498
    .line 499
    const/4 v10, 0x7

    .line 500
    goto :goto_5

    .line 501
    :cond_1a
    new-instance v0, Ljava/io/IOException;

    .line 502
    .line 503
    const-string v2, "PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1"

    .line 504
    .line 505
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 506
    .line 507
    .line 508
    throw v0

    .line 509
    :cond_1b
    const/16 v12, 0x4000

    .line 510
    .line 511
    move v10, v13

    .line 512
    goto :goto_5

    .line 513
    :cond_1c
    const/16 v12, 0x4000

    .line 514
    .line 515
    if-eqz v11, :cond_1e

    .line 516
    .line 517
    if-ne v11, v5, :cond_1d

    .line 518
    .line 519
    goto :goto_5

    .line 520
    :cond_1d
    new-instance v0, Ljava/io/IOException;

    .line 521
    .line 522
    const-string v2, "PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1"

    .line 523
    .line 524
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 525
    .line 526
    .line 527
    throw v0

    .line 528
    :cond_1e
    :goto_5
    invoke-virtual {v3, v10, v11}, Lokhttp3/internal/http2/Settings;->c(II)V

    .line 529
    .line 530
    .line 531
    if-ne v4, v7, :cond_1f

    .line 532
    .line 533
    goto :goto_6

    .line 534
    :cond_1f
    move v4, v9

    .line 535
    goto :goto_4

    .line 536
    :cond_20
    :goto_6
    iget-object v2, v0, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;->b:Lokhttp3/internal/http2/Http2Connection;

    .line 537
    .line 538
    iget-object v4, v2, Lokhttp3/internal/http2/Http2Connection;->h:Lokhttp3/internal/concurrent/TaskQueue;

    .line 539
    .line 540
    const-string v6, " applyAndAckSettings"

    .line 541
    .line 542
    iget-object v2, v2, Lokhttp3/internal/http2/Http2Connection;->c:Ljava/lang/String;

    .line 543
    .line 544
    invoke-static {v6, v2}, Lkotlin/jvm/internal/k;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 545
    .line 546
    .line 547
    move-result-object v2

    .line 548
    new-instance v6, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable$settings$$inlined$execute$default$1;

    .line 549
    .line 550
    invoke-direct {v6, v2, v0, v3}, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable$settings$$inlined$execute$default$1;-><init>(Ljava/lang/String;Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;Lokhttp3/internal/http2/Settings;)V

    .line 551
    .line 552
    .line 553
    move-wide/from16 v2, v19

    .line 554
    .line 555
    invoke-virtual {v4, v6, v2, v3}, Lokhttp3/internal/concurrent/TaskQueue;->c(Lokhttp3/internal/concurrent/Task;J)V

    .line 556
    .line 557
    .line 558
    return v5

    .line 559
    :cond_21
    new-instance v0, Ljava/io/IOException;

    .line 560
    .line 561
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 562
    .line 563
    .line 564
    move-result-object v2

    .line 565
    const-string v3, "TYPE_SETTINGS length % 6 != 0: "

    .line 566
    .line 567
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 568
    .line 569
    .line 570
    move-result-object v2

    .line 571
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 572
    .line 573
    .line 574
    throw v0

    .line 575
    :cond_22
    new-instance v0, Ljava/io/IOException;

    .line 576
    .line 577
    const-string v2, "TYPE_SETTINGS streamId != 0"

    .line 578
    .line 579
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 580
    .line 581
    .line 582
    throw v0

    .line 583
    :pswitch_5
    if-ne v7, v13, :cond_2a

    .line 584
    .line 585
    if-eqz v14, :cond_29

    .line 586
    .line 587
    invoke-virtual {v6}, Lcg/B;->readInt()I

    .line 588
    .line 589
    .line 590
    move-result v2

    .line 591
    sget-object v3, Lokhttp3/internal/http2/ErrorCode;->b:Lokhttp3/internal/http2/ErrorCode$Companion;

    .line 592
    .line 593
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 594
    .line 595
    .line 596
    invoke-static {}, Lokhttp3/internal/http2/ErrorCode;->values()[Lokhttp3/internal/http2/ErrorCode;

    .line 597
    .line 598
    .line 599
    move-result-object v3

    .line 600
    array-length v6, v3

    .line 601
    :goto_7
    if-ge v4, v6, :cond_24

    .line 602
    .line 603
    aget-object v7, v3, v4

    .line 604
    .line 605
    iget v8, v7, Lokhttp3/internal/http2/ErrorCode;->a:I

    .line 606
    .line 607
    if-ne v8, v2, :cond_23

    .line 608
    .line 609
    goto :goto_8

    .line 610
    :cond_23
    add-int/2addr v4, v5

    .line 611
    goto :goto_7

    .line 612
    :cond_24
    move-object/from16 v7, v17

    .line 613
    .line 614
    :goto_8
    if-eqz v7, :cond_28

    .line 615
    .line 616
    iget-object v0, v0, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;->b:Lokhttp3/internal/http2/Http2Connection;

    .line 617
    .line 618
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 619
    .line 620
    .line 621
    if-eqz v14, :cond_25

    .line 622
    .line 623
    and-int/lit8 v2, v12, 0x1

    .line 624
    .line 625
    if-nez v2, :cond_25

    .line 626
    .line 627
    new-instance v2, Ljava/lang/StringBuilder;

    .line 628
    .line 629
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 630
    .line 631
    .line 632
    iget-object v3, v0, Lokhttp3/internal/http2/Http2Connection;->c:Ljava/lang/String;

    .line 633
    .line 634
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 635
    .line 636
    .line 637
    const/16 v3, 0x5b

    .line 638
    .line 639
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 640
    .line 641
    .line 642
    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 643
    .line 644
    .line 645
    const-string v3, "] onReset"

    .line 646
    .line 647
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 648
    .line 649
    .line 650
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 651
    .line 652
    .line 653
    move-result-object v2

    .line 654
    new-instance v3, Lokhttp3/internal/http2/Http2Connection$pushResetLater$$inlined$execute$default$1;

    .line 655
    .line 656
    invoke-direct {v3, v2, v0, v14, v7}, Lokhttp3/internal/http2/Http2Connection$pushResetLater$$inlined$execute$default$1;-><init>(Ljava/lang/String;Lokhttp3/internal/http2/Http2Connection;ILokhttp3/internal/http2/ErrorCode;)V

    .line 657
    .line 658
    .line 659
    iget-object v0, v0, Lokhttp3/internal/http2/Http2Connection;->i:Lokhttp3/internal/concurrent/TaskQueue;

    .line 660
    .line 661
    const-wide/16 v6, 0x0

    .line 662
    .line 663
    invoke-virtual {v0, v3, v6, v7}, Lokhttp3/internal/concurrent/TaskQueue;->c(Lokhttp3/internal/concurrent/Task;J)V

    .line 664
    .line 665
    .line 666
    return v5

    .line 667
    :cond_25
    invoke-virtual {v0, v14}, Lokhttp3/internal/http2/Http2Connection;->i(I)Lokhttp3/internal/http2/Http2Stream;

    .line 668
    .line 669
    .line 670
    move-result-object v0

    .line 671
    if-nez v0, :cond_27

    .line 672
    .line 673
    :cond_26
    :goto_9
    return v5

    .line 674
    :cond_27
    invoke-virtual {v0, v7}, Lokhttp3/internal/http2/Http2Stream;->k(Lokhttp3/internal/http2/ErrorCode;)V

    .line 675
    .line 676
    .line 677
    return v5

    .line 678
    :cond_28
    new-instance v0, Ljava/io/IOException;

    .line 679
    .line 680
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 681
    .line 682
    .line 683
    move-result-object v2

    .line 684
    const-string v3, "TYPE_RST_STREAM unexpected error code: "

    .line 685
    .line 686
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 687
    .line 688
    .line 689
    move-result-object v2

    .line 690
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 691
    .line 692
    .line 693
    throw v0

    .line 694
    :cond_29
    new-instance v0, Ljava/io/IOException;

    .line 695
    .line 696
    const-string v2, "TYPE_RST_STREAM streamId == 0"

    .line 697
    .line 698
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 699
    .line 700
    .line 701
    throw v0

    .line 702
    :cond_2a
    new-instance v0, Ljava/io/IOException;

    .line 703
    .line 704
    const-string v2, "TYPE_RST_STREAM length: "

    .line 705
    .line 706
    const-string v3, " != 4"

    .line 707
    .line 708
    invoke-static {v7, v2, v3}, LA7/p0;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 709
    .line 710
    .line 711
    move-result-object v2

    .line 712
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 713
    .line 714
    .line 715
    throw v0

    .line 716
    :pswitch_6
    if-ne v7, v8, :cond_2c

    .line 717
    .line 718
    if-eqz v14, :cond_2b

    .line 719
    .line 720
    invoke-virtual {v1, v0, v14}, Lokhttp3/internal/http2/Http2Reader;->d(Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;I)V

    .line 721
    .line 722
    .line 723
    return v5

    .line 724
    :cond_2b
    new-instance v0, Ljava/io/IOException;

    .line 725
    .line 726
    const-string v2, "TYPE_PRIORITY streamId == 0"

    .line 727
    .line 728
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 729
    .line 730
    .line 731
    throw v0

    .line 732
    :cond_2c
    new-instance v0, Ljava/io/IOException;

    .line 733
    .line 734
    const-string v2, "TYPE_PRIORITY length: "

    .line 735
    .line 736
    const-string v3, " != 5"

    .line 737
    .line 738
    invoke-static {v7, v2, v3}, LA7/p0;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 739
    .line 740
    .line 741
    move-result-object v2

    .line 742
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 743
    .line 744
    .line 745
    throw v0

    .line 746
    :pswitch_7
    if-eqz v14, :cond_30

    .line 747
    .line 748
    and-int/lit8 v2, v10, 0x1

    .line 749
    .line 750
    if-eqz v2, :cond_2d

    .line 751
    .line 752
    move v2, v5

    .line 753
    goto :goto_a

    .line 754
    :cond_2d
    move v2, v4

    .line 755
    :goto_a
    and-int/2addr v3, v10

    .line 756
    if-eqz v3, :cond_2e

    .line 757
    .line 758
    invoke-virtual {v6}, Lcg/B;->readByte()B

    .line 759
    .line 760
    .line 761
    move-result v3

    .line 762
    and-int/lit16 v4, v3, 0xff

    .line 763
    .line 764
    :cond_2e
    and-int/lit8 v3, v10, 0x20

    .line 765
    .line 766
    if-eqz v3, :cond_2f

    .line 767
    .line 768
    invoke-virtual {v1, v0, v14}, Lokhttp3/internal/http2/Http2Reader;->d(Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;I)V

    .line 769
    .line 770
    .line 771
    add-int/lit8 v7, v7, -0x5

    .line 772
    .line 773
    :cond_2f
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 774
    .line 775
    .line 776
    invoke-static {v7, v11, v4}, Lokhttp3/internal/http2/Http2Reader$Companion;->a(III)I

    .line 777
    .line 778
    .line 779
    move-result v3

    .line 780
    invoke-virtual {v1, v3, v4, v11, v14}, Lokhttp3/internal/http2/Http2Reader;->b(IIII)Ljava/util/List;

    .line 781
    .line 782
    .line 783
    move-result-object v3

    .line 784
    const/4 v4, -0x1

    .line 785
    invoke-virtual {v0, v2, v14, v4, v3}, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;->c(ZIILjava/util/List;)V

    .line 786
    .line 787
    .line 788
    return v5

    .line 789
    :cond_30
    new-instance v0, Ljava/io/IOException;

    .line 790
    .line 791
    const-string v2, "PROTOCOL_ERROR: TYPE_HEADERS streamId == 0"

    .line 792
    .line 793
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 794
    .line 795
    .line 796
    throw v0

    .line 797
    :pswitch_8
    if-eqz v14, :cond_34

    .line 798
    .line 799
    and-int/lit8 v2, v10, 0x1

    .line 800
    .line 801
    if-eqz v2, :cond_31

    .line 802
    .line 803
    move v2, v5

    .line 804
    goto :goto_b

    .line 805
    :cond_31
    move v2, v4

    .line 806
    :goto_b
    and-int/lit8 v8, v10, 0x20

    .line 807
    .line 808
    if-nez v8, :cond_33

    .line 809
    .line 810
    and-int/2addr v3, v10

    .line 811
    if-eqz v3, :cond_32

    .line 812
    .line 813
    invoke-virtual {v6}, Lcg/B;->readByte()B

    .line 814
    .line 815
    .line 816
    move-result v3

    .line 817
    and-int/lit16 v4, v3, 0xff

    .line 818
    .line 819
    :cond_32
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 820
    .line 821
    .line 822
    invoke-static {v7, v11, v4}, Lokhttp3/internal/http2/Http2Reader$Companion;->a(III)I

    .line 823
    .line 824
    .line 825
    move-result v3

    .line 826
    invoke-virtual {v0, v2, v14, v6, v3}, Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;->a(ZILcg/B;I)V

    .line 827
    .line 828
    .line 829
    int-to-long v2, v4

    .line 830
    invoke-virtual {v6, v2, v3}, Lcg/B;->skip(J)V

    .line 831
    .line 832
    .line 833
    return v5

    .line 834
    :cond_33
    new-instance v0, Ljava/io/IOException;

    .line 835
    .line 836
    const-string v2, "PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA"

    .line 837
    .line 838
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 839
    .line 840
    .line 841
    throw v0

    .line 842
    :cond_34
    new-instance v0, Ljava/io/IOException;

    .line 843
    .line 844
    const-string v2, "PROTOCOL_ERROR: TYPE_DATA streamId == 0"

    .line 845
    .line 846
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 847
    .line 848
    .line 849
    throw v0

    .line 850
    :cond_35
    new-instance v0, Ljava/io/IOException;

    .line 851
    .line 852
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 853
    .line 854
    .line 855
    move-result-object v2

    .line 856
    const-string v3, "FRAME_SIZE_ERROR: "

    .line 857
    .line 858
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 859
    .line 860
    .line 861
    move-result-object v2

    .line 862
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 863
    .line 864
    .line 865
    throw v0

    .line 866
    :catch_0
    return v4

    .line 867
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b(IIII)Ljava/util/List;
    .locals 6

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    const/16 v1, 0x40

    .line 4
    .line 5
    const/16 v2, 0x80

    .line 6
    .line 7
    iget-object v3, p0, Lokhttp3/internal/http2/Http2Reader;->b:Lokhttp3/internal/http2/Http2Reader$ContinuationSource;

    .line 8
    .line 9
    iput p1, v3, Lokhttp3/internal/http2/Http2Reader$ContinuationSource;->e:I

    .line 10
    .line 11
    iput p1, v3, Lokhttp3/internal/http2/Http2Reader$ContinuationSource;->b:I

    .line 12
    .line 13
    iput p2, v3, Lokhttp3/internal/http2/Http2Reader$ContinuationSource;->f:I

    .line 14
    .line 15
    iput p3, v3, Lokhttp3/internal/http2/Http2Reader$ContinuationSource;->c:I

    .line 16
    .line 17
    iput p4, v3, Lokhttp3/internal/http2/Http2Reader$ContinuationSource;->d:I

    .line 18
    .line 19
    :cond_0
    :goto_0
    iget-object p1, p0, Lokhttp3/internal/http2/Http2Reader;->c:Lokhttp3/internal/http2/Hpack$Reader;

    .line 20
    .line 21
    iget-object p2, p1, Lokhttp3/internal/http2/Hpack$Reader;->c:Lcg/B;

    .line 22
    .line 23
    invoke-virtual {p2}, Lcg/B;->exhausted()Z

    .line 24
    .line 25
    .line 26
    move-result p3

    .line 27
    iget-object p4, p1, Lokhttp3/internal/http2/Hpack$Reader;->b:Ljava/util/ArrayList;

    .line 28
    .line 29
    if-nez p3, :cond_c

    .line 30
    .line 31
    invoke-virtual {p2}, Lcg/B;->readByte()B

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    sget-object p3, Lokhttp3/internal/Util;->a:[B

    .line 36
    .line 37
    and-int/lit16 p3, p2, 0xff

    .line 38
    .line 39
    if-eq p3, v2, :cond_b

    .line 40
    .line 41
    and-int/lit16 v3, p2, 0x80

    .line 42
    .line 43
    if-ne v3, v2, :cond_3

    .line 44
    .line 45
    const/16 p2, 0x7f

    .line 46
    .line 47
    invoke-virtual {p1, p3, p2}, Lokhttp3/internal/http2/Hpack$Reader;->e(II)I

    .line 48
    .line 49
    .line 50
    move-result p2

    .line 51
    add-int/lit8 p3, p2, -0x1

    .line 52
    .line 53
    if-ltz p3, :cond_1

    .line 54
    .line 55
    sget-object v3, Lokhttp3/internal/http2/Hpack;->a:Lokhttp3/internal/http2/Hpack;

    .line 56
    .line 57
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    sget-object v4, Lokhttp3/internal/http2/Hpack;->b:[Lokhttp3/internal/http2/Header;

    .line 61
    .line 62
    array-length v5, v4

    .line 63
    add-int/lit8 v5, v5, -0x1

    .line 64
    .line 65
    if-gt p3, v5, :cond_1

    .line 66
    .line 67
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    aget-object p1, v4, p3

    .line 71
    .line 72
    invoke-virtual {p4, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_1
    sget-object v3, Lokhttp3/internal/http2/Hpack;->a:Lokhttp3/internal/http2/Hpack;

    .line 77
    .line 78
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    sget-object v3, Lokhttp3/internal/http2/Hpack;->b:[Lokhttp3/internal/http2/Header;

    .line 82
    .line 83
    array-length v3, v3

    .line 84
    sub-int/2addr p3, v3

    .line 85
    iget v3, p1, Lokhttp3/internal/http2/Hpack$Reader;->e:I

    .line 86
    .line 87
    add-int/lit8 v3, v3, 0x1

    .line 88
    .line 89
    add-int/2addr v3, p3

    .line 90
    if-ltz v3, :cond_2

    .line 91
    .line 92
    iget-object p1, p1, Lokhttp3/internal/http2/Hpack$Reader;->d:[Lokhttp3/internal/http2/Header;

    .line 93
    .line 94
    array-length p3, p1

    .line 95
    if-ge v3, p3, :cond_2

    .line 96
    .line 97
    aget-object p1, p1, v3

    .line 98
    .line 99
    invoke-static {p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p4, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_2
    new-instance p1, Ljava/io/IOException;

    .line 107
    .line 108
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 109
    .line 110
    .line 111
    move-result-object p2

    .line 112
    const-string p3, "Header index too large "

    .line 113
    .line 114
    invoke-static {p2, p3}, Lkotlin/jvm/internal/k;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p2

    .line 118
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    throw p1

    .line 122
    :cond_3
    if-ne p3, v1, :cond_4

    .line 123
    .line 124
    sget-object p2, Lokhttp3/internal/http2/Hpack;->a:Lokhttp3/internal/http2/Hpack;

    .line 125
    .line 126
    invoke-virtual {p1}, Lokhttp3/internal/http2/Hpack$Reader;->d()Lcg/j;

    .line 127
    .line 128
    .line 129
    move-result-object p3

    .line 130
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    invoke-static {p3}, Lokhttp3/internal/http2/Hpack;->a(Lcg/j;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {p1}, Lokhttp3/internal/http2/Hpack$Reader;->d()Lcg/j;

    .line 137
    .line 138
    .line 139
    move-result-object p2

    .line 140
    new-instance p4, Lokhttp3/internal/http2/Header;

    .line 141
    .line 142
    invoke-direct {p4, p3, p2}, Lokhttp3/internal/http2/Header;-><init>(Lcg/j;Lcg/j;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {p1, p4}, Lokhttp3/internal/http2/Hpack$Reader;->c(Lokhttp3/internal/http2/Header;)V

    .line 146
    .line 147
    .line 148
    goto/16 :goto_0

    .line 149
    .line 150
    :cond_4
    and-int/lit8 v3, p2, 0x40

    .line 151
    .line 152
    if-ne v3, v1, :cond_5

    .line 153
    .line 154
    const/16 p2, 0x3f

    .line 155
    .line 156
    invoke-virtual {p1, p3, p2}, Lokhttp3/internal/http2/Hpack$Reader;->e(II)I

    .line 157
    .line 158
    .line 159
    move-result p2

    .line 160
    add-int/lit8 p2, p2, -0x1

    .line 161
    .line 162
    invoke-virtual {p1, p2}, Lokhttp3/internal/http2/Hpack$Reader;->b(I)Lcg/j;

    .line 163
    .line 164
    .line 165
    move-result-object p2

    .line 166
    invoke-virtual {p1}, Lokhttp3/internal/http2/Hpack$Reader;->d()Lcg/j;

    .line 167
    .line 168
    .line 169
    move-result-object p3

    .line 170
    new-instance p4, Lokhttp3/internal/http2/Header;

    .line 171
    .line 172
    invoke-direct {p4, p2, p3}, Lokhttp3/internal/http2/Header;-><init>(Lcg/j;Lcg/j;)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {p1, p4}, Lokhttp3/internal/http2/Hpack$Reader;->c(Lokhttp3/internal/http2/Header;)V

    .line 176
    .line 177
    .line 178
    goto/16 :goto_0

    .line 179
    .line 180
    :cond_5
    and-int/2addr p2, v0

    .line 181
    if-ne p2, v0, :cond_8

    .line 182
    .line 183
    const/16 p2, 0x1f

    .line 184
    .line 185
    invoke-virtual {p1, p3, p2}, Lokhttp3/internal/http2/Hpack$Reader;->e(II)I

    .line 186
    .line 187
    .line 188
    move-result p2

    .line 189
    iput p2, p1, Lokhttp3/internal/http2/Hpack$Reader;->a:I

    .line 190
    .line 191
    if-ltz p2, :cond_7

    .line 192
    .line 193
    const/16 p3, 0x1000

    .line 194
    .line 195
    if-gt p2, p3, :cond_7

    .line 196
    .line 197
    iget p3, p1, Lokhttp3/internal/http2/Hpack$Reader;->g:I

    .line 198
    .line 199
    if-ge p2, p3, :cond_0

    .line 200
    .line 201
    if-nez p2, :cond_6

    .line 202
    .line 203
    iget-object p2, p1, Lokhttp3/internal/http2/Hpack$Reader;->d:[Lokhttp3/internal/http2/Header;

    .line 204
    .line 205
    const/4 p3, 0x0

    .line 206
    invoke-static {p2, p3}, Lff/m;->r0([Ljava/lang/Object;LH6/g;)V

    .line 207
    .line 208
    .line 209
    iget-object p2, p1, Lokhttp3/internal/http2/Hpack$Reader;->d:[Lokhttp3/internal/http2/Header;

    .line 210
    .line 211
    array-length p2, p2

    .line 212
    add-int/lit8 p2, p2, -0x1

    .line 213
    .line 214
    iput p2, p1, Lokhttp3/internal/http2/Hpack$Reader;->e:I

    .line 215
    .line 216
    const/4 p2, 0x0

    .line 217
    iput p2, p1, Lokhttp3/internal/http2/Hpack$Reader;->f:I

    .line 218
    .line 219
    iput p2, p1, Lokhttp3/internal/http2/Hpack$Reader;->g:I

    .line 220
    .line 221
    goto/16 :goto_0

    .line 222
    .line 223
    :cond_6
    sub-int/2addr p3, p2

    .line 224
    invoke-virtual {p1, p3}, Lokhttp3/internal/http2/Hpack$Reader;->a(I)I

    .line 225
    .line 226
    .line 227
    goto/16 :goto_0

    .line 228
    .line 229
    :cond_7
    new-instance p2, Ljava/io/IOException;

    .line 230
    .line 231
    iget p1, p1, Lokhttp3/internal/http2/Hpack$Reader;->a:I

    .line 232
    .line 233
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 234
    .line 235
    .line 236
    move-result-object p1

    .line 237
    const-string p3, "Invalid dynamic table size update "

    .line 238
    .line 239
    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object p1

    .line 243
    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 244
    .line 245
    .line 246
    throw p2

    .line 247
    :cond_8
    const/16 p2, 0x10

    .line 248
    .line 249
    if-eq p3, p2, :cond_a

    .line 250
    .line 251
    if-nez p3, :cond_9

    .line 252
    .line 253
    goto :goto_1

    .line 254
    :cond_9
    const/16 p2, 0xf

    .line 255
    .line 256
    invoke-virtual {p1, p3, p2}, Lokhttp3/internal/http2/Hpack$Reader;->e(II)I

    .line 257
    .line 258
    .line 259
    move-result p2

    .line 260
    add-int/lit8 p2, p2, -0x1

    .line 261
    .line 262
    invoke-virtual {p1, p2}, Lokhttp3/internal/http2/Hpack$Reader;->b(I)Lcg/j;

    .line 263
    .line 264
    .line 265
    move-result-object p2

    .line 266
    invoke-virtual {p1}, Lokhttp3/internal/http2/Hpack$Reader;->d()Lcg/j;

    .line 267
    .line 268
    .line 269
    move-result-object p1

    .line 270
    new-instance p3, Lokhttp3/internal/http2/Header;

    .line 271
    .line 272
    invoke-direct {p3, p2, p1}, Lokhttp3/internal/http2/Header;-><init>(Lcg/j;Lcg/j;)V

    .line 273
    .line 274
    .line 275
    invoke-virtual {p4, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 276
    .line 277
    .line 278
    goto/16 :goto_0

    .line 279
    .line 280
    :cond_a
    :goto_1
    sget-object p2, Lokhttp3/internal/http2/Hpack;->a:Lokhttp3/internal/http2/Hpack;

    .line 281
    .line 282
    invoke-virtual {p1}, Lokhttp3/internal/http2/Hpack$Reader;->d()Lcg/j;

    .line 283
    .line 284
    .line 285
    move-result-object p3

    .line 286
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 287
    .line 288
    .line 289
    invoke-static {p3}, Lokhttp3/internal/http2/Hpack;->a(Lcg/j;)V

    .line 290
    .line 291
    .line 292
    invoke-virtual {p1}, Lokhttp3/internal/http2/Hpack$Reader;->d()Lcg/j;

    .line 293
    .line 294
    .line 295
    move-result-object p1

    .line 296
    new-instance p2, Lokhttp3/internal/http2/Header;

    .line 297
    .line 298
    invoke-direct {p2, p3, p1}, Lokhttp3/internal/http2/Header;-><init>(Lcg/j;Lcg/j;)V

    .line 299
    .line 300
    .line 301
    invoke-virtual {p4, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 302
    .line 303
    .line 304
    goto/16 :goto_0

    .line 305
    .line 306
    :cond_b
    new-instance p1, Ljava/io/IOException;

    .line 307
    .line 308
    const-string p2, "index == 0"

    .line 309
    .line 310
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 311
    .line 312
    .line 313
    throw p1

    .line 314
    :cond_c
    invoke-static {p4}, Lff/o;->S0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 315
    .line 316
    .line 317
    move-result-object p1

    .line 318
    invoke-virtual {p4}, Ljava/util/ArrayList;->clear()V

    .line 319
    .line 320
    .line 321
    return-object p1
.end method

.method public final close()V
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/internal/http2/Http2Reader;->a:Lcg/B;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcg/B;->close()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final d(Lokhttp3/internal/http2/Http2Connection$ReaderRunnable;I)V
    .locals 0

    .line 1
    iget-object p1, p0, Lokhttp3/internal/http2/Http2Reader;->a:Lcg/B;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcg/B;->readInt()I

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lcg/B;->readByte()B

    .line 7
    .line 8
    .line 9
    sget-object p1, Lokhttp3/internal/Util;->a:[B

    .line 10
    .line 11
    return-void
.end method
