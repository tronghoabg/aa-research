.class public Lcom/google/android/gms/internal/ads/zzaua;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzate;


# instance fields
.field protected final zza:Lcom/google/android/gms/internal/ads/zzauc;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzatz;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzatz;)V
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzauc;

    .line 2
    .line 3
    const/16 v1, 0x1000

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzauc;-><init>(I)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaua;->zzb:Lcom/google/android/gms/internal/ads/zzatz;

    .line 12
    .line 13
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzaua;->zza:Lcom/google/android/gms/internal/ads/zzauc;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public zza(Lcom/google/android/gms/internal/ads/zzatl;)Lcom/google/android/gms/internal/ads/zzath;
    .locals 27
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzatu;
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    const/4 v5, 0x0

    .line 6
    const-string v6, "]"

    .line 7
    .line 8
    const-string v7, "Error occurred when closing InputStream"

    .line 9
    .line 10
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 11
    .line 12
    .line 13
    move-result-wide v8

    .line 14
    :goto_0
    :try_start_0
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzatl;->zzk()Lcom/google/android/gms/internal/ads/zzasu;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :catch_0
    move-exception v0

    .line 24
    move/from16 v20, v5

    .line 25
    .line 26
    const/16 v19, 0x2

    .line 27
    .line 28
    const/16 v26, 0x1

    .line 29
    .line 30
    goto/16 :goto_15

    .line 31
    .line 32
    :cond_0
    new-instance v11, Ljava/util/HashMap;

    .line 33
    .line 34
    invoke-direct {v11}, Ljava/util/HashMap;-><init>()V

    .line 35
    .line 36
    .line 37
    iget-object v12, v0, Lcom/google/android/gms/internal/ads/zzasu;->zzb:Ljava/lang/String;

    .line 38
    .line 39
    if-eqz v12, :cond_1

    .line 40
    .line 41
    const-string v13, "If-None-Match"

    .line 42
    .line 43
    invoke-virtual {v11, v13, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    :cond_1
    iget-wide v12, v0, Lcom/google/android/gms/internal/ads/zzasu;->zzd:J

    .line 47
    .line 48
    const-wide/16 v14, 0x0

    .line 49
    .line 50
    cmp-long v0, v12, v14

    .line 51
    .line 52
    if-lez v0, :cond_2

    .line 53
    .line 54
    const-string v0, "If-Modified-Since"

    .line 55
    .line 56
    invoke-static {v12, v13}, Lcom/google/android/gms/internal/ads/zzaui;->zzc(J)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v12

    .line 60
    invoke-virtual {v11, v0, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    :cond_2
    move-object v0, v11

    .line 64
    :goto_1
    iget-object v11, v1, Lcom/google/android/gms/internal/ads/zzaua;->zzb:Lcom/google/android/gms/internal/ads/zzatz;

    .line 65
    .line 66
    invoke-virtual {v11, v2, v0}, Lcom/google/android/gms/internal/ads/zzatz;->zza(Lcom/google/android/gms/internal/ads/zzatl;Ljava/util/Map;)Lcom/google/android/gms/internal/ads/zzauj;

    .line 67
    .line 68
    .line 69
    move-result-object v11
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 70
    :try_start_1
    invoke-virtual {v11}, Lcom/google/android/gms/internal/ads/zzauj;->zza()I

    .line 71
    .line 72
    .line 73
    move-result v13

    .line 74
    invoke-virtual {v11}, Lcom/google/android/gms/internal/ads/zzauj;->zzb()Ljava/util/List;

    .line 75
    .line 76
    .line 77
    move-result-object v18
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 78
    const/16 v0, 0x130

    .line 79
    .line 80
    if-ne v13, v0, :cond_a

    .line 81
    .line 82
    :try_start_2
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 83
    .line 84
    .line 85
    move-result-wide v12

    .line 86
    sub-long v23, v12, v8

    .line 87
    .line 88
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzatl;->zzk()Lcom/google/android/gms/internal/ads/zzasu;

    .line 89
    .line 90
    .line 91
    move-result-object v0
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_3

    .line 92
    if-nez v0, :cond_3

    .line 93
    .line 94
    :try_start_3
    new-instance v14, Lcom/google/android/gms/internal/ads/zzath;

    .line 95
    .line 96
    const/16 v16, 0x0

    .line 97
    .line 98
    const/16 v17, 0x1

    .line 99
    .line 100
    const/16 v15, 0x130

    .line 101
    .line 102
    move-object/from16 v20, v18

    .line 103
    .line 104
    move-wide/from16 v18, v23

    .line 105
    .line 106
    invoke-direct/range {v14 .. v20}, Lcom/google/android/gms/internal/ads/zzath;-><init>(I[BZJLjava/util/List;)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    .line 107
    .line 108
    .line 109
    goto/16 :goto_7

    .line 110
    .line 111
    :catch_1
    move-exception v0

    .line 112
    move/from16 v20, v5

    .line 113
    .line 114
    const/16 v19, 0x2

    .line 115
    .line 116
    const/16 v26, 0x1

    .line 117
    .line 118
    goto/16 :goto_13

    .line 119
    .line 120
    :cond_3
    move-object/from16 v12, v18

    .line 121
    .line 122
    move-wide/from16 v18, v23

    .line 123
    .line 124
    :try_start_4
    new-instance v13, Ljava/util/TreeSet;

    .line 125
    .line 126
    sget-object v14, Ljava/lang/String;->CASE_INSENSITIVE_ORDER:Ljava/util/Comparator;

    .line 127
    .line 128
    invoke-direct {v13, v14}, Ljava/util/TreeSet;-><init>(Ljava/util/Comparator;)V

    .line 129
    .line 130
    .line 131
    invoke-interface {v12}, Ljava/util/List;->isEmpty()Z

    .line 132
    .line 133
    .line 134
    move-result v14
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 135
    if-nez v14, :cond_4

    .line 136
    .line 137
    :try_start_5
    invoke-interface {v12}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 138
    .line 139
    .line 140
    move-result-object v14

    .line 141
    :goto_2
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 142
    .line 143
    .line 144
    move-result v15

    .line 145
    if-eqz v15, :cond_4

    .line 146
    .line 147
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v15

    .line 151
    check-cast v15, Lcom/google/android/gms/internal/ads/zzatd;

    .line 152
    .line 153
    invoke-virtual {v15}, Lcom/google/android/gms/internal/ads/zzatd;->zza()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v15

    .line 157
    invoke-virtual {v13, v15}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_1

    .line 158
    .line 159
    .line 160
    goto :goto_2

    .line 161
    :cond_4
    :try_start_6
    new-instance v14, Ljava/util/ArrayList;

    .line 162
    .line 163
    invoke-direct {v14, v12}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 164
    .line 165
    .line 166
    iget-object v12, v0, Lcom/google/android/gms/internal/ads/zzasu;->zzh:Ljava/util/List;

    .line 167
    .line 168
    if-eqz v12, :cond_8

    .line 169
    .line 170
    invoke-interface {v12}, Ljava/util/List;->isEmpty()Z

    .line 171
    .line 172
    .line 173
    move-result v12

    .line 174
    if-nez v12, :cond_6

    .line 175
    .line 176
    iget-object v12, v0, Lcom/google/android/gms/internal/ads/zzasu;->zzh:Ljava/util/List;

    .line 177
    .line 178
    invoke-interface {v12}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 179
    .line 180
    .line 181
    move-result-object v12

    .line 182
    :cond_5
    :goto_3
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 183
    .line 184
    .line 185
    move-result v15

    .line 186
    if-eqz v15, :cond_6

    .line 187
    .line 188
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v15

    .line 192
    check-cast v15, Lcom/google/android/gms/internal/ads/zzatd;
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_3

    .line 193
    .line 194
    const/16 v26, 0x1

    .line 195
    .line 196
    :try_start_7
    invoke-virtual {v15}, Lcom/google/android/gms/internal/ads/zzatd;->zza()Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v4

    .line 200
    invoke-virtual {v13, v4}, Ljava/util/TreeSet;->contains(Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    move-result v4

    .line 204
    if-nez v4, :cond_5

    .line 205
    .line 206
    invoke-virtual {v14, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    goto :goto_3

    .line 210
    :catch_2
    move-exception v0

    .line 211
    :goto_4
    move/from16 v20, v5

    .line 212
    .line 213
    const/16 v19, 0x2

    .line 214
    .line 215
    goto/16 :goto_13

    .line 216
    .line 217
    :catch_3
    move-exception v0

    .line 218
    const/16 v26, 0x1

    .line 219
    .line 220
    goto :goto_4

    .line 221
    :cond_6
    const/16 v26, 0x1

    .line 222
    .line 223
    :cond_7
    move-wide/from16 v23, v18

    .line 224
    .line 225
    goto :goto_6

    .line 226
    :cond_8
    const/16 v26, 0x1

    .line 227
    .line 228
    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzasu;->zzg:Ljava/util/Map;

    .line 229
    .line 230
    invoke-interface {v4}, Ljava/util/Map;->isEmpty()Z

    .line 231
    .line 232
    .line 233
    move-result v4

    .line 234
    if-nez v4, :cond_7

    .line 235
    .line 236
    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzasu;->zzg:Ljava/util/Map;

    .line 237
    .line 238
    invoke-interface {v4}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 239
    .line 240
    .line 241
    move-result-object v4

    .line 242
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 243
    .line 244
    .line 245
    move-result-object v4

    .line 246
    :cond_9
    :goto_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 247
    .line 248
    .line 249
    move-result v12

    .line 250
    if-eqz v12, :cond_7

    .line 251
    .line 252
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v12

    .line 256
    check-cast v12, Ljava/util/Map$Entry;

    .line 257
    .line 258
    invoke-interface {v12}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v15

    .line 262
    invoke-virtual {v13, v15}, Ljava/util/TreeSet;->contains(Ljava/lang/Object;)Z

    .line 263
    .line 264
    .line 265
    move-result v15

    .line 266
    if-nez v15, :cond_9

    .line 267
    .line 268
    new-instance v15, Lcom/google/android/gms/internal/ads/zzatd;

    .line 269
    .line 270
    invoke-interface {v12}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v16

    .line 274
    move-object/from16 v10, v16

    .line 275
    .line 276
    check-cast v10, Ljava/lang/String;

    .line 277
    .line 278
    invoke-interface {v12}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v12

    .line 282
    check-cast v12, Ljava/lang/String;

    .line 283
    .line 284
    invoke-direct {v15, v10, v12}, Lcom/google/android/gms/internal/ads/zzatd;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v14, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 288
    .line 289
    .line 290
    goto :goto_5

    .line 291
    :goto_6
    new-instance v19, Lcom/google/android/gms/internal/ads/zzath;

    .line 292
    .line 293
    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzasu;->zza:[B

    .line 294
    .line 295
    const/16 v22, 0x1

    .line 296
    .line 297
    const/16 v20, 0x130

    .line 298
    .line 299
    move-object/from16 v21, v0

    .line 300
    .line 301
    move-object/from16 v25, v14

    .line 302
    .line 303
    invoke-direct/range {v19 .. v25}, Lcom/google/android/gms/internal/ads/zzath;-><init>(I[BZJLjava/util/List;)V

    .line 304
    .line 305
    .line 306
    move-object/from16 v14, v19

    .line 307
    .line 308
    :goto_7
    return-object v14

    .line 309
    :cond_a
    move-object/from16 v12, v18

    .line 310
    .line 311
    const/16 v26, 0x1

    .line 312
    .line 313
    invoke-virtual {v11}, Lcom/google/android/gms/internal/ads/zzauj;->zzd()Ljava/io/InputStream;

    .line 314
    .line 315
    .line 316
    move-result-object v4
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_2

    .line 317
    if-eqz v4, :cond_c

    .line 318
    .line 319
    :try_start_8
    invoke-virtual {v11}, Lcom/google/android/gms/internal/ads/zzauj;->zzc()I

    .line 320
    .line 321
    .line 322
    move-result v0

    .line 323
    iget-object v10, v1, Lcom/google/android/gms/internal/ads/zzaua;->zza:Lcom/google/android/gms/internal/ads/zzauc;

    .line 324
    .line 325
    new-instance v14, Lcom/google/android/gms/internal/ads/zzaun;

    .line 326
    .line 327
    invoke-direct {v14, v10, v0}, Lcom/google/android/gms/internal/ads/zzaun;-><init>(Lcom/google/android/gms/internal/ads/zzauc;I)V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_7

    .line 328
    .line 329
    .line 330
    const/16 v0, 0x400

    .line 331
    .line 332
    :try_start_9
    invoke-virtual {v10, v0}, Lcom/google/android/gms/internal/ads/zzauc;->zza(I)[B

    .line 333
    .line 334
    .line 335
    move-result-object v15
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 336
    :goto_8
    :try_start_a
    invoke-virtual {v4, v15}, Ljava/io/InputStream;->read([B)I

    .line 337
    .line 338
    .line 339
    move-result v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    .line 340
    const/16 v19, 0x2

    .line 341
    .line 342
    const/4 v3, -0x1

    .line 343
    if-eq v0, v3, :cond_b

    .line 344
    .line 345
    :try_start_b
    invoke-virtual {v14, v15, v5, v0}, Lcom/google/android/gms/internal/ads/zzaun;->write([BII)V

    .line 346
    .line 347
    .line 348
    goto :goto_8

    .line 349
    :catchall_0
    move-exception v0

    .line 350
    goto :goto_c

    .line 351
    :cond_b
    invoke-virtual {v14}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 352
    .line 353
    .line 354
    move-result-object v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    .line 355
    :try_start_c
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_4

    .line 356
    .line 357
    .line 358
    goto :goto_9

    .line 359
    :catch_4
    :try_start_d
    new-array v3, v5, [Ljava/lang/Object;

    .line 360
    .line 361
    invoke-static {v7, v3}, Lcom/google/android/gms/internal/ads/zzatx;->zza(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 362
    .line 363
    .line 364
    :goto_9
    invoke-virtual {v10, v15}, Lcom/google/android/gms/internal/ads/zzauc;->zzb([B)V

    .line 365
    .line 366
    .line 367
    invoke-virtual {v14}, Lcom/google/android/gms/internal/ads/zzaun;->close()V
    :try_end_d
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_5

    .line 368
    .line 369
    .line 370
    :goto_a
    move-object v14, v0

    .line 371
    goto :goto_e

    .line 372
    :catch_5
    move-exception v0

    .line 373
    :goto_b
    move/from16 v20, v5

    .line 374
    .line 375
    goto/16 :goto_13

    .line 376
    .line 377
    :catchall_1
    move-exception v0

    .line 378
    const/16 v19, 0x2

    .line 379
    .line 380
    goto :goto_c

    .line 381
    :catchall_2
    move-exception v0

    .line 382
    const/16 v19, 0x2

    .line 383
    .line 384
    const/4 v15, 0x0

    .line 385
    :goto_c
    :try_start_e
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_e
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_6

    .line 386
    .line 387
    .line 388
    goto :goto_d

    .line 389
    :catch_6
    :try_start_f
    new-array v3, v5, [Ljava/lang/Object;

    .line 390
    .line 391
    invoke-static {v7, v3}, Lcom/google/android/gms/internal/ads/zzatx;->zza(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 392
    .line 393
    .line 394
    :goto_d
    invoke-virtual {v10, v15}, Lcom/google/android/gms/internal/ads/zzauc;->zzb([B)V

    .line 395
    .line 396
    .line 397
    invoke-virtual {v14}, Lcom/google/android/gms/internal/ads/zzaun;->close()V

    .line 398
    .line 399
    .line 400
    throw v0

    .line 401
    :catch_7
    move-exception v0

    .line 402
    const/16 v19, 0x2

    .line 403
    .line 404
    goto :goto_b

    .line 405
    :cond_c
    const/16 v19, 0x2

    .line 406
    .line 407
    new-array v0, v5, [B
    :try_end_f
    .catch Ljava/io/IOException; {:try_start_f .. :try_end_f} :catch_5

    .line 408
    .line 409
    goto :goto_a

    .line 410
    :goto_e
    :try_start_10
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 411
    .line 412
    .line 413
    move-result-wide v3

    .line 414
    sub-long/2addr v3, v8

    .line 415
    sget-boolean v0, Lcom/google/android/gms/internal/ads/zzatx;->zzb:Z

    .line 416
    .line 417
    if-nez v0, :cond_e

    .line 418
    .line 419
    const-wide/16 v15, 0xbb8

    .line 420
    .line 421
    cmp-long v0, v3, v15

    .line 422
    .line 423
    if-lez v0, :cond_d

    .line 424
    .line 425
    goto :goto_f

    .line 426
    :cond_d
    move/from16 v20, v5

    .line 427
    .line 428
    goto :goto_11

    .line 429
    :cond_e
    :goto_f
    const-string v0, "HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]"

    .line 430
    .line 431
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 432
    .line 433
    .line 434
    move-result-object v3

    .line 435
    if-eqz v14, :cond_f

    .line 436
    .line 437
    array-length v4, v14

    .line 438
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 439
    .line 440
    .line 441
    move-result-object v4

    .line 442
    goto :goto_10

    .line 443
    :catch_8
    move-exception v0

    .line 444
    move/from16 v20, v5

    .line 445
    .line 446
    goto :goto_12

    .line 447
    :cond_f
    const-string v4, "null"

    .line 448
    .line 449
    :goto_10
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 450
    .line 451
    .line 452
    move-result-object v10

    .line 453
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzatl;->zzy()Lcom/google/android/gms/internal/ads/zzasz;

    .line 454
    .line 455
    .line 456
    move-result-object v15

    .line 457
    invoke-virtual {v15}, Lcom/google/android/gms/internal/ads/zzasz;->zzb()I

    .line 458
    .line 459
    .line 460
    move-result v15

    .line 461
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 462
    .line 463
    .line 464
    move-result-object v15
    :try_end_10
    .catch Ljava/io/IOException; {:try_start_10 .. :try_end_10} :catch_8

    .line 465
    move/from16 v20, v5

    .line 466
    .line 467
    const/4 v5, 0x5

    .line 468
    :try_start_11
    new-array v5, v5, [Ljava/lang/Object;

    .line 469
    .line 470
    aput-object v2, v5, v20

    .line 471
    .line 472
    aput-object v3, v5, v26

    .line 473
    .line 474
    aput-object v4, v5, v19

    .line 475
    .line 476
    const/4 v3, 0x3

    .line 477
    aput-object v10, v5, v3

    .line 478
    .line 479
    const/4 v3, 0x4

    .line 480
    aput-object v15, v5, v3

    .line 481
    .line 482
    invoke-static {v0, v5}, Lcom/google/android/gms/internal/ads/zzatx;->zzb(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 483
    .line 484
    .line 485
    :goto_11
    const/16 v0, 0xc8

    .line 486
    .line 487
    if-lt v13, v0, :cond_10

    .line 488
    .line 489
    const/16 v0, 0x12b

    .line 490
    .line 491
    if-gt v13, v0, :cond_10

    .line 492
    .line 493
    move-object/from16 v18, v12

    .line 494
    .line 495
    new-instance v12, Lcom/google/android/gms/internal/ads/zzath;

    .line 496
    .line 497
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 498
    .line 499
    .line 500
    move-result-wide v3

    .line 501
    sub-long v16, v3, v8

    .line 502
    .line 503
    const/4 v15, 0x0

    .line 504
    invoke-direct/range {v12 .. v18}, Lcom/google/android/gms/internal/ads/zzath;-><init>(I[BZJLjava/util/List;)V

    .line 505
    .line 506
    .line 507
    return-object v12

    .line 508
    :catch_9
    move-exception v0

    .line 509
    goto :goto_12

    .line 510
    :cond_10
    new-instance v0, Ljava/io/IOException;

    .line 511
    .line 512
    invoke-direct {v0}, Ljava/io/IOException;-><init>()V

    .line 513
    .line 514
    .line 515
    throw v0
    :try_end_11
    .catch Ljava/io/IOException; {:try_start_11 .. :try_end_11} :catch_9

    .line 516
    :goto_12
    move-object v10, v11

    .line 517
    move-object v13, v14

    .line 518
    goto :goto_16

    .line 519
    :goto_13
    move-object v10, v11

    .line 520
    :goto_14
    const/4 v13, 0x0

    .line 521
    goto :goto_16

    .line 522
    :goto_15
    const/4 v10, 0x0

    .line 523
    goto :goto_14

    .line 524
    :goto_16
    instance-of v3, v0, Ljava/net/SocketTimeoutException;

    .line 525
    .line 526
    if-eqz v3, :cond_11

    .line 527
    .line 528
    new-instance v0, Lcom/google/android/gms/internal/ads/zzatt;

    .line 529
    .line 530
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzatt;-><init>()V

    .line 531
    .line 532
    .line 533
    const-string v3, "socket"

    .line 534
    .line 535
    move/from16 v4, v19

    .line 536
    .line 537
    goto :goto_18

    .line 538
    :cond_11
    instance-of v3, v0, Ljava/net/MalformedURLException;

    .line 539
    .line 540
    if-nez v3, :cond_17

    .line 541
    .line 542
    if-eqz v10, :cond_16

    .line 543
    .line 544
    invoke-virtual {v10}, Lcom/google/android/gms/internal/ads/zzauj;->zza()I

    .line 545
    .line 546
    .line 547
    move-result v12

    .line 548
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 549
    .line 550
    .line 551
    move-result-object v0

    .line 552
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzatl;->zzh()Ljava/lang/String;

    .line 553
    .line 554
    .line 555
    move-result-object v3

    .line 556
    move/from16 v4, v19

    .line 557
    .line 558
    new-array v5, v4, [Ljava/lang/Object;

    .line 559
    .line 560
    aput-object v0, v5, v20

    .line 561
    .line 562
    aput-object v3, v5, v26

    .line 563
    .line 564
    const-string v0, "Unexpected response code %d for %s"

    .line 565
    .line 566
    invoke-static {v0, v5}, Lcom/google/android/gms/internal/ads/zzatx;->zzc(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 567
    .line 568
    .line 569
    if-eqz v13, :cond_15

    .line 570
    .line 571
    invoke-virtual {v10}, Lcom/google/android/gms/internal/ads/zzauj;->zzb()Ljava/util/List;

    .line 572
    .line 573
    .line 574
    move-result-object v17

    .line 575
    new-instance v11, Lcom/google/android/gms/internal/ads/zzath;

    .line 576
    .line 577
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 578
    .line 579
    .line 580
    move-result-wide v14

    .line 581
    sub-long/2addr v14, v8

    .line 582
    move-wide v15, v14

    .line 583
    const/4 v14, 0x0

    .line 584
    invoke-direct/range {v11 .. v17}, Lcom/google/android/gms/internal/ads/zzath;-><init>(I[BZJLjava/util/List;)V

    .line 585
    .line 586
    .line 587
    const/16 v0, 0x191

    .line 588
    .line 589
    if-eq v12, v0, :cond_14

    .line 590
    .line 591
    const/16 v0, 0x193

    .line 592
    .line 593
    if-ne v12, v0, :cond_12

    .line 594
    .line 595
    goto :goto_17

    .line 596
    :cond_12
    const/16 v0, 0x190

    .line 597
    .line 598
    if-lt v12, v0, :cond_13

    .line 599
    .line 600
    const/16 v0, 0x1f3

    .line 601
    .line 602
    if-gt v12, v0, :cond_13

    .line 603
    .line 604
    new-instance v0, Lcom/google/android/gms/internal/ads/zzasy;

    .line 605
    .line 606
    invoke-direct {v0, v11}, Lcom/google/android/gms/internal/ads/zzasy;-><init>(Lcom/google/android/gms/internal/ads/zzath;)V

    .line 607
    .line 608
    .line 609
    throw v0

    .line 610
    :cond_13
    new-instance v0, Lcom/google/android/gms/internal/ads/zzats;

    .line 611
    .line 612
    invoke-direct {v0, v11}, Lcom/google/android/gms/internal/ads/zzats;-><init>(Lcom/google/android/gms/internal/ads/zzath;)V

    .line 613
    .line 614
    .line 615
    throw v0

    .line 616
    :cond_14
    :goto_17
    new-instance v0, Lcom/google/android/gms/internal/ads/zzast;

    .line 617
    .line 618
    invoke-direct {v0, v11}, Lcom/google/android/gms/internal/ads/zzast;-><init>(Lcom/google/android/gms/internal/ads/zzath;)V

    .line 619
    .line 620
    .line 621
    const-string v3, "auth"

    .line 622
    .line 623
    goto :goto_18

    .line 624
    :cond_15
    new-instance v0, Lcom/google/android/gms/internal/ads/zzatg;

    .line 625
    .line 626
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzatg;-><init>()V

    .line 627
    .line 628
    .line 629
    const-string v3, "network"

    .line 630
    .line 631
    :goto_18
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzatl;->zzy()Lcom/google/android/gms/internal/ads/zzasz;

    .line 632
    .line 633
    .line 634
    move-result-object v5

    .line 635
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzatl;->zzo()I

    .line 636
    .line 637
    .line 638
    move-result v10

    .line 639
    :try_start_12
    invoke-virtual {v5, v0}, Lcom/google/android/gms/internal/ads/zzasz;->zzc(Lcom/google/android/gms/internal/ads/zzatu;)V
    :try_end_12
    .catch Lcom/google/android/gms/internal/ads/zzatu; {:try_start_12 .. :try_end_12} :catch_a

    .line 640
    .line 641
    .line 642
    new-instance v0, Ljava/lang/StringBuilder;

    .line 643
    .line 644
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 645
    .line 646
    .line 647
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 648
    .line 649
    .line 650
    const-string v3, "-retry [timeout="

    .line 651
    .line 652
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 653
    .line 654
    .line 655
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 656
    .line 657
    .line 658
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 659
    .line 660
    .line 661
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 662
    .line 663
    .line 664
    move-result-object v0

    .line 665
    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/zzatl;->zzc(Ljava/lang/String;)V

    .line 666
    .line 667
    .line 668
    move/from16 v5, v20

    .line 669
    .line 670
    goto/16 :goto_0

    .line 671
    .line 672
    :catch_a
    move-exception v0

    .line 673
    new-instance v4, Ljava/lang/StringBuilder;

    .line 674
    .line 675
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 676
    .line 677
    .line 678
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 679
    .line 680
    .line 681
    const-string v3, "-timeout-giveup [timeout="

    .line 682
    .line 683
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 684
    .line 685
    .line 686
    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 687
    .line 688
    .line 689
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 690
    .line 691
    .line 692
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 693
    .line 694
    .line 695
    move-result-object v3

    .line 696
    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/zzatl;->zzc(Ljava/lang/String;)V

    .line 697
    .line 698
    .line 699
    throw v0

    .line 700
    :cond_16
    new-instance v2, Lcom/google/android/gms/internal/ads/zzati;

    .line 701
    .line 702
    invoke-direct {v2, v0}, Lcom/google/android/gms/internal/ads/zzati;-><init>(Ljava/lang/Throwable;)V

    .line 703
    .line 704
    .line 705
    throw v2

    .line 706
    :cond_17
    new-instance v3, Ljava/lang/RuntimeException;

    .line 707
    .line 708
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzatl;->zzh()Ljava/lang/String;

    .line 709
    .line 710
    .line 711
    move-result-object v2

    .line 712
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 713
    .line 714
    .line 715
    move-result-object v2

    .line 716
    const-string v4, "Bad URL "

    .line 717
    .line 718
    invoke-virtual {v4, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 719
    .line 720
    .line 721
    move-result-object v2

    .line 722
    invoke-direct {v3, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 723
    .line 724
    .line 725
    throw v3
.end method
