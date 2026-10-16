.class public final Lcom/google/android/gms/internal/ads/zzeiu;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzfos;


# instance fields
.field protected final zza:Landroid/content/Context;

.field protected final zzb:Ljava/lang/String;

.field private final zzc:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzcbs;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzeiu;->zza:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzeiu;->zzb:Ljava/lang/String;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzeiu;->zzc:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final bridge synthetic zza(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    check-cast p1, Lcom/google/android/gms/internal/ads/zzeis;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/zzeiu;->zzb(Lcom/google/android/gms/internal/ads/zzeis;)Lcom/google/android/gms/internal/ads/zzeit;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final zzb(Lcom/google/android/gms/internal/ads/zzeis;)Lcom/google/android/gms/internal/ads/zzeit;
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzeel;
        }
    .end annotation

    .line 1
    iget-object v1, p1, Lcom/google/android/gms/internal/ads/zzeis;->zza:Ljava/lang/String;

    .line 2
    .line 3
    iget v2, p1, Lcom/google/android/gms/internal/ads/zzeis;->zzb:I

    .line 4
    .line 5
    iget-object v3, p1, Lcom/google/android/gms/internal/ads/zzeis;->zzc:Ljava/util/Map;

    .line 6
    .line 7
    iget-object v4, p1, Lcom/google/android/gms/internal/ads/zzeis;->zzd:[B

    .line 8
    .line 9
    iget-object v5, p1, Lcom/google/android/gms/internal/ads/zzeis;->zze:Ljava/lang/String;

    .line 10
    .line 11
    sget-object p1, LC6/n;->D:LC6/n;

    .line 12
    .line 13
    iget-object p1, p1, LC6/n;->k:Ln7/b;

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 19
    .line 20
    .line 21
    move-result-wide v6

    .line 22
    move-object v0, p0

    .line 23
    invoke-virtual/range {v0 .. v7}, Lcom/google/android/gms/internal/ads/zzeiu;->zzc(Ljava/lang/String;ILjava/util/Map;[BLjava/lang/String;J)Lcom/google/android/gms/internal/ads/zzeit;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    return-object p1
.end method

.method public final zzc(Ljava/lang/String;ILjava/util/Map;[BLjava/lang/String;J)Lcom/google/android/gms/internal/ads/zzeit;
    .locals 18
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzeel;
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v2, p4

    .line 6
    .line 7
    const-string v3, "AdRequestServiceImpl: Sending request: "

    .line 8
    .line 9
    const-string v4, "SDK version: "

    .line 10
    .line 11
    const-string v5, "Received error HTTP response code: "

    .line 12
    .line 13
    const/4 v6, 0x1

    .line 14
    :try_start_0
    new-instance v7, Lcom/google/android/gms/internal/ads/zzeit;

    .line 15
    .line 16
    invoke-direct {v7}, Lcom/google/android/gms/internal/ads/zzeit;-><init>()V

    .line 17
    .line 18
    .line 19
    sget-object v8, Lcom/google/android/gms/internal/ads/zzbix;->zzdn:Lcom/google/android/gms/internal/ads/zzbio;

    .line 20
    .line 21
    sget-object v9, LD6/s;->e:LD6/s;

    .line 22
    .line 23
    iget-object v9, v9, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 24
    .line 25
    invoke-virtual {v9, v8}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v8

    .line 29
    check-cast v8, Ljava/lang/Boolean;

    .line 30
    .line 31
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 32
    .line 33
    .line 34
    move-result v8

    .line 35
    if-eqz v8, :cond_0

    .line 36
    .line 37
    sget-object v8, LD6/q;->g:LD6/q;

    .line 38
    .line 39
    iget-boolean v8, v8, LD6/q;->c:Z

    .line 40
    .line 41
    if-eqz v8, :cond_0

    .line 42
    .line 43
    const/16 v0, 0x19a

    .line 44
    .line 45
    iput v0, v7, Lcom/google/android/gms/internal/ads/zzeit;->zza:I

    .line 46
    .line 47
    return-object v7

    .line 48
    :catch_0
    move-exception v0

    .line 49
    goto/16 :goto_13

    .line 50
    .line 51
    :cond_0
    iget-object v8, v1, Lcom/google/android/gms/internal/ads/zzeiu;->zzb:Ljava/lang/String;

    .line 52
    .line 53
    invoke-static {v8}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v9

    .line 57
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 58
    .line 59
    .line 60
    move-result v9

    .line 61
    add-int/lit8 v9, v9, 0xd

    .line 62
    .line 63
    new-instance v10, Ljava/lang/StringBuilder;

    .line 64
    .line 65
    invoke-direct {v10, v9}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    sget v9, LG6/L;->b:I

    .line 79
    .line 80
    invoke-static {v4}, LH6/l;->e(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v4

    .line 87
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 88
    .line 89
    .line 90
    move-result v4

    .line 91
    add-int/lit8 v4, v4, 0x27

    .line 92
    .line 93
    new-instance v9, Ljava/lang/StringBuilder;

    .line 94
    .line 95
    invoke-direct {v9, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    invoke-static {v3}, LH6/l;->a(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    new-instance v3, Ljava/net/URL;

    .line 112
    .line 113
    invoke-direct {v3, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    new-instance v4, Ljava/util/HashMap;

    .line 117
    .line 118
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 119
    .line 120
    .line 121
    const/4 v10, 0x0

    .line 122
    :goto_0
    invoke-virtual {v3}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    move-object v3, v0

    .line 127
    check-cast v3, Ljava/net/HttpURLConnection;

    .line 128
    .line 129
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzeiu;->zzc:Ljava/lang/String;

    .line 130
    .line 131
    if-eqz v0, :cond_1

    .line 132
    .line 133
    invoke-virtual {v3, v0}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 134
    .line 135
    .line 136
    :cond_1
    :try_start_1
    sget-object v0, LC6/n;->D:LC6/n;

    .line 137
    .line 138
    iget-object v0, v0, LC6/n;->c:LG6/U;

    .line 139
    .line 140
    iget-object v11, v1, Lcom/google/android/gms/internal/ads/zzeiu;->zza:Landroid/content/Context;

    .line 141
    .line 142
    move/from16 v12, p2

    .line 143
    .line 144
    invoke-virtual {v0, v11, v8, v3, v12}, LG6/U;->B(Landroid/content/Context;Ljava/lang/String;Ljava/net/HttpURLConnection;I)V

    .line 145
    .line 146
    .line 147
    invoke-interface/range {p3 .. p3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 156
    .line 157
    .line 158
    move-result v11

    .line 159
    if-eqz v11, :cond_2

    .line 160
    .line 161
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v11

    .line 165
    check-cast v11, Ljava/util/Map$Entry;

    .line 166
    .line 167
    invoke-interface {v11}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v13

    .line 171
    check-cast v13, Ljava/lang/String;

    .line 172
    .line 173
    invoke-interface {v11}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v11

    .line 177
    check-cast v11, Ljava/lang/String;

    .line 178
    .line 179
    invoke-virtual {v3, v13, v11}, Ljava/net/URLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    goto :goto_1

    .line 183
    :catchall_0
    move-exception v0

    .line 184
    goto/16 :goto_12

    .line 185
    .line 186
    :catch_1
    move-exception v0

    .line 187
    goto/16 :goto_10

    .line 188
    .line 189
    :cond_2
    invoke-static/range {p5 .. p5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 190
    .line 191
    .line 192
    move-result v0

    .line 193
    if-nez v0, :cond_3

    .line 194
    .line 195
    const-string v0, "Content-Type"

    .line 196
    .line 197
    move-object/from16 v11, p5

    .line 198
    .line 199
    invoke-virtual {v3, v0, v11}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    goto :goto_2

    .line 203
    :cond_3
    move-object/from16 v11, p5

    .line 204
    .line 205
    :goto_2
    new-instance v13, LH6/i;

    .line 206
    .line 207
    invoke-direct {v13}, LH6/i;-><init>()V
    :try_end_1
    .catch Lcom/google/android/gms/internal/ads/zzeel; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 208
    .line 209
    .line 210
    :try_start_2
    invoke-virtual {v13, v3, v2}, LH6/i;->a(Ljava/net/HttpURLConnection;[B)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 211
    .line 212
    .line 213
    goto :goto_3

    .line 214
    :catchall_1
    move-exception v0

    .line 215
    :try_start_3
    const-string v14, "Network request logging failed."

    .line 216
    .line 217
    invoke-static {v14, v0}, LH6/l;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 218
    .line 219
    .line 220
    sget-object v14, LC6/n;->D:LC6/n;

    .line 221
    .line 222
    iget-object v14, v14, LC6/n;->h:Lcom/google/android/gms/internal/ads/zzcfk;

    .line 223
    .line 224
    const-string v15, "HttpRequestFunction.logAdRequest"

    .line 225
    .line 226
    invoke-virtual {v14, v0, v15}, Lcom/google/android/gms/internal/ads/zzcfk;->zzi(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    :goto_3
    array-length v0, v2

    .line 230
    if-lez v0, :cond_4

    .line 231
    .line 232
    invoke-virtual {v3, v6}, Ljava/net/URLConnection;->setDoOutput(Z)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {v3, v0}, Ljava/net/HttpURLConnection;->setFixedLengthStreamingMode(I)V
    :try_end_3
    .catch Lcom/google/android/gms/internal/ads/zzeel; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 236
    .line 237
    .line 238
    :try_start_4
    new-instance v15, Ljava/io/BufferedOutputStream;

    .line 239
    .line 240
    invoke-virtual {v3}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    .line 241
    .line 242
    .line 243
    move-result-object v0

    .line 244
    invoke-direct {v15, v0}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 245
    .line 246
    .line 247
    :try_start_5
    invoke-virtual {v15, v2}, Ljava/io/OutputStream;->write([B)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 248
    .line 249
    .line 250
    :try_start_6
    invoke-static {v15}, Ln7/c;->d(Ljava/io/Closeable;)V

    .line 251
    .line 252
    .line 253
    goto :goto_5

    .line 254
    :catchall_2
    move-exception v0

    .line 255
    move-object v14, v15

    .line 256
    goto :goto_4

    .line 257
    :catchall_3
    move-exception v0

    .line 258
    const/4 v14, 0x0

    .line 259
    :goto_4
    invoke-static {v14}, Ln7/c;->d(Ljava/io/Closeable;)V

    .line 260
    .line 261
    .line 262
    throw v0

    .line 263
    :cond_4
    :goto_5
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 264
    .line 265
    .line 266
    move-result v0

    .line 267
    invoke-virtual {v3}, Ljava/net/URLConnection;->getHeaderFields()Ljava/util/Map;

    .line 268
    .line 269
    .line 270
    move-result-object v15

    .line 271
    invoke-interface {v15}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 272
    .line 273
    .line 274
    move-result-object v15

    .line 275
    invoke-interface {v15}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 276
    .line 277
    .line 278
    move-result-object v15

    .line 279
    :goto_6
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    .line 280
    .line 281
    .line 282
    move-result v16

    .line 283
    if-eqz v16, :cond_6

    .line 284
    .line 285
    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object v16

    .line 289
    check-cast v16, Ljava/util/Map$Entry;

    .line 290
    .line 291
    invoke-interface/range {v16 .. v16}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object v17

    .line 295
    move-object/from16 v14, v17

    .line 296
    .line 297
    check-cast v14, Ljava/lang/String;

    .line 298
    .line 299
    invoke-interface/range {v16 .. v16}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    move-result-object v16

    .line 303
    move-object/from16 v6, v16

    .line 304
    .line 305
    check-cast v6, Ljava/util/List;

    .line 306
    .line 307
    invoke-virtual {v4, v14}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 308
    .line 309
    .line 310
    move-result v16

    .line 311
    if-eqz v16, :cond_5

    .line 312
    .line 313
    invoke-virtual {v4, v14}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object v14

    .line 317
    check-cast v14, Ljava/util/List;

    .line 318
    .line 319
    invoke-interface {v14, v6}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 320
    .line 321
    .line 322
    :goto_7
    const/4 v6, 0x1

    .line 323
    goto :goto_6

    .line 324
    :cond_5
    new-instance v9, Ljava/util/ArrayList;

    .line 325
    .line 326
    invoke-direct {v9, v6}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 327
    .line 328
    .line 329
    invoke-virtual {v4, v14, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 330
    .line 331
    .line 332
    goto :goto_7

    .line 333
    :cond_6
    invoke-virtual {v13, v3, v0}, LH6/i;->b(Ljava/net/HttpURLConnection;I)V

    .line 334
    .line 335
    .line 336
    iput v0, v7, Lcom/google/android/gms/internal/ads/zzeit;->zza:I

    .line 337
    .line 338
    iput-object v4, v7, Lcom/google/android/gms/internal/ads/zzeit;->zzb:Ljava/util/Map;

    .line 339
    .line 340
    const-string v6, ""

    .line 341
    .line 342
    iput-object v6, v7, Lcom/google/android/gms/internal/ads/zzeit;->zzc:Ljava/lang/String;
    :try_end_6
    .catch Lcom/google/android/gms/internal/ads/zzeel; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 343
    .line 344
    const/16 v6, 0xc8

    .line 345
    .line 346
    const/16 v9, 0x12c

    .line 347
    .line 348
    if-lt v0, v6, :cond_c

    .line 349
    .line 350
    if-ge v0, v9, :cond_c

    .line 351
    .line 352
    :try_start_7
    new-instance v2, Ljava/io/InputStreamReader;

    .line 353
    .line 354
    invoke-virtual {v3}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 355
    .line 356
    .line 357
    move-result-object v0

    .line 358
    invoke-direct {v2, v0}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    .line 359
    .line 360
    .line 361
    :try_start_8
    sget-object v0, LC6/n;->D:LC6/n;

    .line 362
    .line 363
    iget-object v0, v0, LC6/n;->c:LG6/U;

    .line 364
    .line 365
    new-instance v0, Ljava/lang/StringBuilder;

    .line 366
    .line 367
    const/16 v4, 0x2000

    .line 368
    .line 369
    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 370
    .line 371
    .line 372
    const/16 v4, 0x800

    .line 373
    .line 374
    new-array v4, v4, [C

    .line 375
    .line 376
    :goto_8
    invoke-virtual {v2, v4}, Ljava/io/Reader;->read([C)I

    .line 377
    .line 378
    .line 379
    move-result v5

    .line 380
    const/4 v6, -0x1

    .line 381
    if-eq v5, v6, :cond_7

    .line 382
    .line 383
    const/4 v6, 0x0

    .line 384
    invoke-virtual {v0, v4, v6, v5}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    .line 385
    .line 386
    .line 387
    goto :goto_8

    .line 388
    :catchall_4
    move-exception v0

    .line 389
    goto :goto_c

    .line 390
    :cond_7
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 391
    .line 392
    .line 393
    move-result-object v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 394
    :try_start_9
    invoke-static {v2}, Ln7/c;->d(Ljava/io/Closeable;)V

    .line 395
    .line 396
    .line 397
    invoke-static {}, LH6/i;->c()Z

    .line 398
    .line 399
    .line 400
    move-result v2

    .line 401
    if-nez v2, :cond_8

    .line 402
    .line 403
    goto :goto_9

    .line 404
    :cond_8
    if-eqz v0, :cond_9

    .line 405
    .line 406
    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    .line 407
    .line 408
    .line 409
    move-result-object v2

    .line 410
    new-instance v4, LS3/l;

    .line 411
    .line 412
    invoke-direct {v4, v2}, LS3/l;-><init>(Ljava/lang/Object;)V

    .line 413
    .line 414
    .line 415
    const-string v2, "onNetworkResponseBody"

    .line 416
    .line 417
    invoke-virtual {v13, v2, v4}, LH6/i;->e(Ljava/lang/String;LH6/h;)V

    .line 418
    .line 419
    .line 420
    :cond_9
    :goto_9
    iput-object v0, v7, Lcom/google/android/gms/internal/ads/zzeit;->zzc:Ljava/lang/String;

    .line 421
    .line 422
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 423
    .line 424
    .line 425
    move-result v0

    .line 426
    if-eqz v0, :cond_b

    .line 427
    .line 428
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbix;->zzgG:Lcom/google/android/gms/internal/ads/zzbio;

    .line 429
    .line 430
    sget-object v2, LD6/s;->e:LD6/s;

    .line 431
    .line 432
    iget-object v2, v2, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 433
    .line 434
    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 435
    .line 436
    .line 437
    move-result-object v0

    .line 438
    check-cast v0, Ljava/lang/Boolean;

    .line 439
    .line 440
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 441
    .line 442
    .line 443
    move-result v0

    .line 444
    if-eqz v0, :cond_a

    .line 445
    .line 446
    goto :goto_a

    .line 447
    :cond_a
    new-instance v0, Lcom/google/android/gms/internal/ads/zzeel;

    .line 448
    .line 449
    const/4 v2, 0x3

    .line 450
    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/ads/zzeel;-><init>(I)V

    .line 451
    .line 452
    .line 453
    throw v0

    .line 454
    :cond_b
    :goto_a
    sget-object v0, LC6/n;->D:LC6/n;

    .line 455
    .line 456
    iget-object v0, v0, LC6/n;->k:Ln7/b;

    .line 457
    .line 458
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 459
    .line 460
    .line 461
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 462
    .line 463
    .line 464
    move-result-wide v4

    .line 465
    sub-long v4, v4, p6

    .line 466
    .line 467
    iput-wide v4, v7, Lcom/google/android/gms/internal/ads/zzeit;->zzd:J
    :try_end_9
    .catch Lcom/google/android/gms/internal/ads/zzeel; {:try_start_9 .. :try_end_9} :catch_1
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 468
    .line 469
    :goto_b
    :try_start_a
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_0

    .line 470
    .line 471
    .line 472
    goto/16 :goto_11

    .line 473
    .line 474
    :goto_c
    move-object v14, v2

    .line 475
    goto :goto_d

    .line 476
    :catchall_5
    move-exception v0

    .line 477
    const/4 v14, 0x0

    .line 478
    :goto_d
    :try_start_b
    invoke-static {v14}, Ln7/c;->d(Ljava/io/Closeable;)V

    .line 479
    .line 480
    .line 481
    throw v0

    .line 482
    :cond_c
    const/4 v6, 0x0

    .line 483
    if-lt v0, v9, :cond_10

    .line 484
    .line 485
    const/16 v9, 0x190

    .line 486
    .line 487
    if-ge v0, v9, :cond_10

    .line 488
    .line 489
    const-string v0, "Location"

    .line 490
    .line 491
    invoke-virtual {v3, v0}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    .line 492
    .line 493
    .line 494
    move-result-object v0

    .line 495
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 496
    .line 497
    .line 498
    move-result v9

    .line 499
    if-nez v9, :cond_f

    .line 500
    .line 501
    sget-object v9, Lcom/google/android/gms/internal/ads/zzbix;->zzjc:Lcom/google/android/gms/internal/ads/zzbio;

    .line 502
    .line 503
    sget-object v13, LD6/s;->e:LD6/s;

    .line 504
    .line 505
    iget-object v14, v13, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 506
    .line 507
    invoke-virtual {v14, v9}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 508
    .line 509
    .line 510
    move-result-object v9

    .line 511
    check-cast v9, Ljava/lang/Boolean;

    .line 512
    .line 513
    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    .line 514
    .line 515
    .line 516
    move-result v9
    :try_end_b
    .catch Lcom/google/android/gms/internal/ads/zzeel; {:try_start_b .. :try_end_b} :catch_1
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    .line 517
    if-eqz v9, :cond_d

    .line 518
    .line 519
    :try_start_c
    new-instance v9, Ljava/net/URI;

    .line 520
    .line 521
    invoke-direct {v9, v0}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    .line 522
    .line 523
    .line 524
    invoke-virtual {v9}, Ljava/net/URI;->toURL()Ljava/net/URL;

    .line 525
    .line 526
    .line 527
    move-result-object v0
    :try_end_c
    .catch Ljava/net/URISyntaxException; {:try_start_c .. :try_end_c} :catch_2
    .catch Lcom/google/android/gms/internal/ads/zzeel; {:try_start_c .. :try_end_c} :catch_1
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    .line 528
    move-object v9, v0

    .line 529
    :goto_e
    const/16 v17, 0x1

    .line 530
    .line 531
    goto :goto_f

    .line 532
    :catch_2
    move-exception v0

    .line 533
    :try_start_d
    new-instance v2, Lcom/google/android/gms/internal/ads/zzeel;

    .line 534
    .line 535
    invoke-virtual {v0}, Ljava/net/URISyntaxException;->getMessage()Ljava/lang/String;

    .line 536
    .line 537
    .line 538
    move-result-object v4

    .line 539
    const/4 v5, 0x1

    .line 540
    invoke-direct {v2, v5, v4, v0}, Lcom/google/android/gms/internal/ads/zzeel;-><init>(ILjava/lang/String;Ljava/lang/Throwable;)V

    .line 541
    .line 542
    .line 543
    throw v2

    .line 544
    :cond_d
    new-instance v9, Ljava/net/URL;

    .line 545
    .line 546
    invoke-direct {v9, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 547
    .line 548
    .line 549
    goto :goto_e

    .line 550
    :goto_f
    add-int/lit8 v10, v10, 0x1

    .line 551
    .line 552
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbix;->zzgp:Lcom/google/android/gms/internal/ads/zzbio;

    .line 553
    .line 554
    iget-object v13, v13, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 555
    .line 556
    invoke-virtual {v13, v0}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 557
    .line 558
    .line 559
    move-result-object v0

    .line 560
    check-cast v0, Ljava/lang/Integer;

    .line 561
    .line 562
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 563
    .line 564
    .line 565
    move-result v0
    :try_end_d
    .catch Lcom/google/android/gms/internal/ads/zzeel; {:try_start_d .. :try_end_d} :catch_1
    .catchall {:try_start_d .. :try_end_d} :catchall_0

    .line 566
    if-gt v10, v0, :cond_e

    .line 567
    .line 568
    :try_start_e
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_e
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_0

    .line 569
    .line 570
    .line 571
    move-object v3, v9

    .line 572
    const/4 v6, 0x1

    .line 573
    goto/16 :goto_0

    .line 574
    .line 575
    :cond_e
    :try_start_f
    const-string v0, "Too many redirects."

    .line 576
    .line 577
    invoke-static {v0}, LH6/l;->f(Ljava/lang/String;)V

    .line 578
    .line 579
    .line 580
    new-instance v0, Lcom/google/android/gms/internal/ads/zzeel;

    .line 581
    .line 582
    const-string v2, "Too many redirects"

    .line 583
    .line 584
    const/4 v5, 0x1

    .line 585
    invoke-direct {v0, v5, v2}, Lcom/google/android/gms/internal/ads/zzeel;-><init>(ILjava/lang/String;)V

    .line 586
    .line 587
    .line 588
    throw v0

    .line 589
    :cond_f
    const-string v0, "No location header to follow redirect."

    .line 590
    .line 591
    invoke-static {v0}, LH6/l;->f(Ljava/lang/String;)V

    .line 592
    .line 593
    .line 594
    new-instance v0, Lcom/google/android/gms/internal/ads/zzeel;

    .line 595
    .line 596
    const-string v2, "No location header to follow redirect"

    .line 597
    .line 598
    const/4 v5, 0x1

    .line 599
    invoke-direct {v0, v5, v2}, Lcom/google/android/gms/internal/ads/zzeel;-><init>(ILjava/lang/String;)V

    .line 600
    .line 601
    .line 602
    throw v0

    .line 603
    :cond_10
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 604
    .line 605
    .line 606
    move-result-object v2

    .line 607
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 608
    .line 609
    .line 610
    move-result v2

    .line 611
    add-int/lit8 v2, v2, 0x23

    .line 612
    .line 613
    new-instance v4, Ljava/lang/StringBuilder;

    .line 614
    .line 615
    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 616
    .line 617
    .line 618
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 619
    .line 620
    .line 621
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 622
    .line 623
    .line 624
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 625
    .line 626
    .line 627
    move-result-object v2

    .line 628
    invoke-static {v2}, LH6/l;->f(Ljava/lang/String;)V

    .line 629
    .line 630
    .line 631
    new-instance v2, Lcom/google/android/gms/internal/ads/zzeel;

    .line 632
    .line 633
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 634
    .line 635
    .line 636
    move-result-object v4

    .line 637
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 638
    .line 639
    .line 640
    move-result v4

    .line 641
    add-int/lit8 v4, v4, 0x23

    .line 642
    .line 643
    new-instance v6, Ljava/lang/StringBuilder;

    .line 644
    .line 645
    invoke-direct {v6, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 646
    .line 647
    .line 648
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 649
    .line 650
    .line 651
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 652
    .line 653
    .line 654
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 655
    .line 656
    .line 657
    move-result-object v0

    .line 658
    const/4 v5, 0x1

    .line 659
    invoke-direct {v2, v5, v0}, Lcom/google/android/gms/internal/ads/zzeel;-><init>(ILjava/lang/String;)V

    .line 660
    .line 661
    .line 662
    throw v2
    :try_end_f
    .catch Lcom/google/android/gms/internal/ads/zzeel; {:try_start_f .. :try_end_f} :catch_1
    .catchall {:try_start_f .. :try_end_f} :catchall_0

    .line 663
    :goto_10
    :try_start_10
    sget-object v2, Lcom/google/android/gms/internal/ads/zzbix;->zzjI:Lcom/google/android/gms/internal/ads/zzbio;

    .line 664
    .line 665
    sget-object v4, LD6/s;->e:LD6/s;

    .line 666
    .line 667
    iget-object v4, v4, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 668
    .line 669
    invoke-virtual {v4, v2}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 670
    .line 671
    .line 672
    move-result-object v2

    .line 673
    check-cast v2, Ljava/lang/Boolean;

    .line 674
    .line 675
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 676
    .line 677
    .line 678
    move-result v2

    .line 679
    if-eqz v2, :cond_11

    .line 680
    .line 681
    sget-object v0, LC6/n;->D:LC6/n;

    .line 682
    .line 683
    iget-object v0, v0, LC6/n;->k:Ln7/b;

    .line 684
    .line 685
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 686
    .line 687
    .line 688
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 689
    .line 690
    .line 691
    move-result-wide v4

    .line 692
    sub-long v4, v4, p6

    .line 693
    .line 694
    iput-wide v4, v7, Lcom/google/android/gms/internal/ads/zzeit;->zzd:J

    .line 695
    .line 696
    goto/16 :goto_b

    .line 697
    .line 698
    :goto_11
    return-object v7

    .line 699
    :cond_11
    throw v0
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_0

    .line 700
    :goto_12
    :try_start_11
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 701
    .line 702
    .line 703
    throw v0
    :try_end_11
    .catch Ljava/io/IOException; {:try_start_11 .. :try_end_11} :catch_0

    .line 704
    :goto_13
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 705
    .line 706
    .line 707
    move-result-object v2

    .line 708
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 709
    .line 710
    .line 711
    move-result-object v2

    .line 712
    sget v3, LG6/L;->b:I

    .line 713
    .line 714
    const-string v3, "Error while connecting to ad server: "

    .line 715
    .line 716
    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 717
    .line 718
    .line 719
    move-result-object v2

    .line 720
    invoke-static {v2}, LH6/l;->f(Ljava/lang/String;)V

    .line 721
    .line 722
    .line 723
    new-instance v3, Lcom/google/android/gms/internal/ads/zzeel;

    .line 724
    .line 725
    const/4 v5, 0x1

    .line 726
    invoke-direct {v3, v5, v2, v0}, Lcom/google/android/gms/internal/ads/zzeel;-><init>(ILjava/lang/String;Ljava/lang/Throwable;)V

    .line 727
    .line 728
    .line 729
    throw v3
.end method
