.class Lcom/unity3d/services/core/cache/CacheThreadHandler;
.super Landroid/os/Handler;
.source "SourceFile"


# instance fields
.field private _active:Z

.field private _canceled:Z

.field private _currentRequest:Lcom/unity3d/services/core/request/WebRequest;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/unity3d/services/core/cache/CacheThreadHandler;->_currentRequest:Lcom/unity3d/services/core/request/WebRequest;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-boolean v0, p0, Lcom/unity3d/services/core/cache/CacheThreadHandler;->_canceled:Z

    .line 9
    .line 10
    iput-boolean v0, p0, Lcom/unity3d/services/core/cache/CacheThreadHandler;->_active:Z

    .line 11
    .line 12
    return-void
.end method

.method private downloadFile(Ljava/lang/String;Ljava/lang/String;IIILjava/util/HashMap;ZLcom/unity3d/services/core/cache/CacheEventSender;)V
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "III",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;Z",
            "Lcom/unity3d/services/core/cache/CacheEventSender;",
            ")V"
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v4, p1

    .line 4
    .line 5
    move-object/from16 v0, p2

    .line 6
    .line 7
    move/from16 v2, p7

    .line 8
    .line 9
    move-object/from16 v13, p8

    .line 10
    .line 11
    const/4 v15, 0x2

    .line 12
    const/4 v3, 0x1

    .line 13
    const/4 v5, 0x0

    .line 14
    const-string v6, "Error closing stream"

    .line 15
    .line 16
    iget-boolean v7, v1, Lcom/unity3d/services/core/cache/CacheThreadHandler;->_canceled:Z

    .line 17
    .line 18
    if-nez v7, :cond_4

    .line 19
    .line 20
    if-eqz v4, :cond_4

    .line 21
    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    goto/16 :goto_11

    .line 25
    .line 26
    :cond_0
    new-instance v7, Ljava/io/File;

    .line 27
    .line 28
    invoke-direct {v7, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const-string v8, " to "

    .line 32
    .line 33
    if-eqz v2, :cond_1

    .line 34
    .line 35
    const-string v9, "Unity Ads cache: resuming download "

    .line 36
    .line 37
    const-string v10, " at "

    .line 38
    .line 39
    invoke-static {v9, v4, v8, v0, v10}, LA7/p0;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {v7}, Ljava/io/File;->length()J

    .line 44
    .line 45
    .line 46
    move-result-wide v8

    .line 47
    invoke-virtual {v0, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string v8, " bytes"

    .line 51
    .line 52
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-static {v0}, Lcom/unity3d/services/core/log/DeviceLog;->debug(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_1
    new-instance v9, Ljava/lang/StringBuilder;

    .line 64
    .line 65
    const-string v10, "Unity Ads cache: start downloading "

    .line 66
    .line 67
    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-static {v0}, Lcom/unity3d/services/core/log/DeviceLog;->debug(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    :goto_0
    invoke-static {}, Lcom/unity3d/services/core/device/Device;->isActiveNetworkConnected()Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-nez v0, :cond_2

    .line 91
    .line 92
    const-string v0, "Unity Ads cache: download cancelled, no internet connection available"

    .line 93
    .line 94
    invoke-static {v0}, Lcom/unity3d/services/core/log/DeviceLog;->debug(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    sget-object v0, Lcom/unity3d/services/core/cache/CacheEvent;->DOWNLOAD_ERROR:Lcom/unity3d/services/core/cache/CacheEvent;

    .line 98
    .line 99
    new-array v2, v15, [Ljava/lang/Object;

    .line 100
    .line 101
    sget-object v6, Lcom/unity3d/services/core/cache/CacheError;->NO_INTERNET:Lcom/unity3d/services/core/cache/CacheError;

    .line 102
    .line 103
    aput-object v6, v2, v5

    .line 104
    .line 105
    aput-object v4, v2, v3

    .line 106
    .line 107
    invoke-virtual {v13, v0, v2}, Lcom/unity3d/services/core/cache/CacheEventSender;->sendEvent(Lcom/unity3d/services/core/cache/CacheEvent;[Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    return-void

    .line 111
    :cond_2
    iput-boolean v3, v1, Lcom/unity3d/services/core/cache/CacheThreadHandler;->_active:Z

    .line 112
    .line 113
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 114
    .line 115
    .line 116
    move-result-wide v8

    .line 117
    const/4 v10, 0x0

    .line 118
    :try_start_0
    new-instance v11, Ljava/io/FileOutputStream;

    .line 119
    .line 120
    invoke-direct {v11, v7, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_12
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_11
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_10
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_f
    .catch Lcom/unity3d/services/core/request/NetworkIOException; {:try_start_0 .. :try_end_0} :catch_e
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_d
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 121
    .line 122
    .line 123
    move/from16 v0, p3

    .line 124
    .line 125
    move/from16 v2, p4

    .line 126
    .line 127
    move-object/from16 v12, p6

    .line 128
    .line 129
    :try_start_1
    invoke-direct {v1, v4, v0, v2, v12}, Lcom/unity3d/services/core/cache/CacheThreadHandler;->getWebRequest(Ljava/lang/String;IILjava/util/HashMap;)Lcom/unity3d/services/core/request/WebRequest;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    iput-object v0, v1, Lcom/unity3d/services/core/cache/CacheThreadHandler;->_currentRequest:Lcom/unity3d/services/core/request/WebRequest;

    .line 134
    .line 135
    new-instance v2, Lcom/unity3d/services/core/cache/CacheThreadHandler$1;

    .line 136
    .line 137
    move/from16 v12, p5

    .line 138
    .line 139
    invoke-direct {v2, v1, v13, v7, v12}, Lcom/unity3d/services/core/cache/CacheThreadHandler$1;-><init>(Lcom/unity3d/services/core/cache/CacheThreadHandler;Lcom/unity3d/services/core/cache/CacheEventSender;Ljava/io/File;I)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v0, v2}, Lcom/unity3d/services/core/request/WebRequest;->setProgressListener(Lcom/unity3d/services/core/request/IWebRequestProgressListener;)V

    .line 143
    .line 144
    .line 145
    iget-object v0, v1, Lcom/unity3d/services/core/cache/CacheThreadHandler;->_currentRequest:Lcom/unity3d/services/core/request/WebRequest;

    .line 146
    .line 147
    invoke-virtual {v0, v11}, Lcom/unity3d/services/core/request/WebRequest;->makeStreamRequest(Ljava/io/OutputStream;)J

    .line 148
    .line 149
    .line 150
    move-result-wide v16

    .line 151
    iput-boolean v5, v1, Lcom/unity3d/services/core/cache/CacheThreadHandler;->_active:Z

    .line 152
    .line 153
    iget-object v0, v1, Lcom/unity3d/services/core/cache/CacheThreadHandler;->_currentRequest:Lcom/unity3d/services/core/request/WebRequest;

    .line 154
    .line 155
    invoke-virtual {v0}, Lcom/unity3d/services/core/request/WebRequest;->getContentLength()J

    .line 156
    .line 157
    .line 158
    move-result-wide v18

    .line 159
    iget-object v0, v1, Lcom/unity3d/services/core/cache/CacheThreadHandler;->_currentRequest:Lcom/unity3d/services/core/request/WebRequest;

    .line 160
    .line 161
    invoke-virtual {v0}, Lcom/unity3d/services/core/request/WebRequest;->isCanceled()Z

    .line 162
    .line 163
    .line 164
    move-result v0

    .line 165
    iget-object v2, v1, Lcom/unity3d/services/core/cache/CacheThreadHandler;->_currentRequest:Lcom/unity3d/services/core/request/WebRequest;

    .line 166
    .line 167
    invoke-virtual {v2}, Lcom/unity3d/services/core/request/WebRequest;->getResponseCode()I

    .line 168
    .line 169
    .line 170
    move-result v2

    .line 171
    iget-object v12, v1, Lcom/unity3d/services/core/cache/CacheThreadHandler;->_currentRequest:Lcom/unity3d/services/core/request/WebRequest;

    .line 172
    .line 173
    invoke-virtual {v12}, Lcom/unity3d/services/core/request/WebRequest;->getResponseHeaders()Ljava/util/Map;

    .line 174
    .line 175
    .line 176
    move-result-object v12
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_c
    .catch Ljava/net/MalformedURLException; {:try_start_1 .. :try_end_1} :catch_b
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_a
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_9
    .catch Lcom/unity3d/services/core/request/NetworkIOException; {:try_start_1 .. :try_end_1} :catch_8
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_7
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 177
    move-object v14, v6

    .line 178
    move-object v5, v7

    .line 179
    move/from16 v20, v15

    .line 180
    .line 181
    move-wide/from16 v6, v16

    .line 182
    .line 183
    move-object v15, v10

    .line 184
    move-object/from16 v17, v11

    .line 185
    .line 186
    move v10, v0

    .line 187
    move v11, v2

    .line 188
    move-wide/from16 v21, v18

    .line 189
    .line 190
    move/from16 v18, v3

    .line 191
    .line 192
    move-wide v2, v8

    .line 193
    move-wide/from16 v8, v21

    .line 194
    .line 195
    :try_start_2
    invoke-direct/range {v1 .. v13}, Lcom/unity3d/services/core/cache/CacheThreadHandler;->postProcessDownload(JLjava/lang/String;Ljava/io/File;JJZILjava/util/Map;Lcom/unity3d/services/core/cache/CacheEventSender;)V
    :try_end_2
    .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_6
    .catch Ljava/net/MalformedURLException; {:try_start_2 .. :try_end_2} :catch_5
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_4
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Lcom/unity3d/services/core/request/NetworkIOException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 196
    .line 197
    .line 198
    iput-object v15, v1, Lcom/unity3d/services/core/cache/CacheThreadHandler;->_currentRequest:Lcom/unity3d/services/core/request/WebRequest;

    .line 199
    .line 200
    :try_start_3
    invoke-virtual/range {v17 .. v17}, Ljava/io/FileOutputStream;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 201
    .line 202
    .line 203
    return-void

    .line 204
    :catch_0
    move-exception v0

    .line 205
    invoke-static {v14, v0}, Lcom/unity3d/services/core/log/DeviceLog;->exception(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 206
    .line 207
    .line 208
    sget-object v2, Lcom/unity3d/services/core/cache/CacheEvent;->DOWNLOAD_ERROR:Lcom/unity3d/services/core/cache/CacheEvent;

    .line 209
    .line 210
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    const/4 v3, 0x3

    .line 215
    new-array v3, v3, [Ljava/lang/Object;

    .line 216
    .line 217
    sget-object v4, Lcom/unity3d/services/core/cache/CacheError;->FILE_IO_ERROR:Lcom/unity3d/services/core/cache/CacheError;

    .line 218
    .line 219
    const/4 v5, 0x0

    .line 220
    aput-object v4, v3, v5

    .line 221
    .line 222
    aput-object p1, v3, v18

    .line 223
    .line 224
    aput-object v0, v3, v20

    .line 225
    .line 226
    invoke-virtual {v13, v2, v3}, Lcom/unity3d/services/core/cache/CacheEventSender;->sendEvent(Lcom/unity3d/services/core/cache/CacheEvent;[Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    goto/16 :goto_11

    .line 230
    .line 231
    :catchall_0
    move-exception v0

    .line 232
    const/4 v5, 0x0

    .line 233
    :goto_1
    move-object v2, v0

    .line 234
    move-object/from16 v10, v17

    .line 235
    .line 236
    goto/16 :goto_f

    .line 237
    .line 238
    :catch_1
    move-exception v0

    .line 239
    const/4 v5, 0x0

    .line 240
    :goto_2
    move-object/from16 v10, v17

    .line 241
    .line 242
    goto/16 :goto_9

    .line 243
    .line 244
    :catch_2
    move-exception v0

    .line 245
    const/4 v5, 0x0

    .line 246
    :goto_3
    move-object/from16 v10, v17

    .line 247
    .line 248
    goto/16 :goto_a

    .line 249
    .line 250
    :catch_3
    move-exception v0

    .line 251
    const/4 v5, 0x0

    .line 252
    :goto_4
    move-object/from16 v10, v17

    .line 253
    .line 254
    goto/16 :goto_b

    .line 255
    .line 256
    :catch_4
    move-exception v0

    .line 257
    const/4 v5, 0x0

    .line 258
    :goto_5
    move-object/from16 v10, v17

    .line 259
    .line 260
    goto/16 :goto_c

    .line 261
    .line 262
    :catch_5
    move-exception v0

    .line 263
    const/4 v5, 0x0

    .line 264
    :goto_6
    move-object/from16 v10, v17

    .line 265
    .line 266
    goto/16 :goto_d

    .line 267
    .line 268
    :catch_6
    move-exception v0

    .line 269
    const/4 v5, 0x0

    .line 270
    :goto_7
    move-object/from16 v10, v17

    .line 271
    .line 272
    goto/16 :goto_e

    .line 273
    .line 274
    :catchall_1
    move-exception v0

    .line 275
    move/from16 v18, v3

    .line 276
    .line 277
    move-object v14, v6

    .line 278
    move-object/from16 v17, v11

    .line 279
    .line 280
    move/from16 v20, v15

    .line 281
    .line 282
    move-object v15, v10

    .line 283
    goto :goto_1

    .line 284
    :catch_7
    move-exception v0

    .line 285
    move/from16 v18, v3

    .line 286
    .line 287
    move-object v14, v6

    .line 288
    move-object/from16 v17, v11

    .line 289
    .line 290
    move/from16 v20, v15

    .line 291
    .line 292
    move-object v15, v10

    .line 293
    goto :goto_2

    .line 294
    :catch_8
    move-exception v0

    .line 295
    move/from16 v18, v3

    .line 296
    .line 297
    move-object v14, v6

    .line 298
    move-object/from16 v17, v11

    .line 299
    .line 300
    move/from16 v20, v15

    .line 301
    .line 302
    move-object v15, v10

    .line 303
    goto :goto_3

    .line 304
    :catch_9
    move-exception v0

    .line 305
    move/from16 v18, v3

    .line 306
    .line 307
    move-object v14, v6

    .line 308
    move-object/from16 v17, v11

    .line 309
    .line 310
    move/from16 v20, v15

    .line 311
    .line 312
    move-object v15, v10

    .line 313
    goto :goto_4

    .line 314
    :catch_a
    move-exception v0

    .line 315
    move/from16 v18, v3

    .line 316
    .line 317
    move-object v14, v6

    .line 318
    move-object/from16 v17, v11

    .line 319
    .line 320
    move/from16 v20, v15

    .line 321
    .line 322
    move-object v15, v10

    .line 323
    goto :goto_5

    .line 324
    :catch_b
    move-exception v0

    .line 325
    move/from16 v18, v3

    .line 326
    .line 327
    move-object v14, v6

    .line 328
    move-object/from16 v17, v11

    .line 329
    .line 330
    move/from16 v20, v15

    .line 331
    .line 332
    move-object v15, v10

    .line 333
    goto :goto_6

    .line 334
    :catch_c
    move-exception v0

    .line 335
    move/from16 v18, v3

    .line 336
    .line 337
    move-object v14, v6

    .line 338
    move-object/from16 v17, v11

    .line 339
    .line 340
    move/from16 v20, v15

    .line 341
    .line 342
    move-object v15, v10

    .line 343
    goto :goto_7

    .line 344
    :catchall_2
    move-exception v0

    .line 345
    move/from16 v18, v3

    .line 346
    .line 347
    move-object v14, v6

    .line 348
    move/from16 v20, v15

    .line 349
    .line 350
    move-object v15, v10

    .line 351
    :goto_8
    move-object v2, v0

    .line 352
    goto/16 :goto_f

    .line 353
    .line 354
    :catch_d
    move-exception v0

    .line 355
    move/from16 v18, v3

    .line 356
    .line 357
    move-object v14, v6

    .line 358
    move/from16 v20, v15

    .line 359
    .line 360
    move-object v15, v10

    .line 361
    goto :goto_9

    .line 362
    :catch_e
    move-exception v0

    .line 363
    move/from16 v18, v3

    .line 364
    .line 365
    move-object v14, v6

    .line 366
    move/from16 v20, v15

    .line 367
    .line 368
    move-object v15, v10

    .line 369
    goto/16 :goto_a

    .line 370
    .line 371
    :catch_f
    move-exception v0

    .line 372
    move/from16 v18, v3

    .line 373
    .line 374
    move-object v14, v6

    .line 375
    move/from16 v20, v15

    .line 376
    .line 377
    move-object v15, v10

    .line 378
    goto/16 :goto_b

    .line 379
    .line 380
    :catch_10
    move-exception v0

    .line 381
    move/from16 v18, v3

    .line 382
    .line 383
    move-object v14, v6

    .line 384
    move/from16 v20, v15

    .line 385
    .line 386
    move-object v15, v10

    .line 387
    goto/16 :goto_c

    .line 388
    .line 389
    :catch_11
    move-exception v0

    .line 390
    move/from16 v18, v3

    .line 391
    .line 392
    move-object v14, v6

    .line 393
    move/from16 v20, v15

    .line 394
    .line 395
    move-object v15, v10

    .line 396
    goto/16 :goto_d

    .line 397
    .line 398
    :catch_12
    move-exception v0

    .line 399
    move/from16 v18, v3

    .line 400
    .line 401
    move-object v14, v6

    .line 402
    move/from16 v20, v15

    .line 403
    .line 404
    move-object v15, v10

    .line 405
    goto/16 :goto_e

    .line 406
    .line 407
    :goto_9
    :try_start_4
    const-string v2, "Unknown error"

    .line 408
    .line 409
    invoke-static {v2, v0}, Lcom/unity3d/services/core/log/DeviceLog;->exception(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 410
    .line 411
    .line 412
    iput-boolean v5, v1, Lcom/unity3d/services/core/cache/CacheThreadHandler;->_active:Z

    .line 413
    .line 414
    sget-object v2, Lcom/unity3d/services/core/cache/CacheEvent;->DOWNLOAD_ERROR:Lcom/unity3d/services/core/cache/CacheEvent;

    .line 415
    .line 416
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 417
    .line 418
    .line 419
    move-result-object v0

    .line 420
    const/4 v3, 0x3

    .line 421
    new-array v4, v3, [Ljava/lang/Object;

    .line 422
    .line 423
    sget-object v3, Lcom/unity3d/services/core/cache/CacheError;->UNKNOWN_ERROR:Lcom/unity3d/services/core/cache/CacheError;

    .line 424
    .line 425
    aput-object v3, v4, v5

    .line 426
    .line 427
    aput-object p1, v4, v18

    .line 428
    .line 429
    aput-object v0, v4, v20

    .line 430
    .line 431
    invoke-virtual {v13, v2, v4}, Lcom/unity3d/services/core/cache/CacheEventSender;->sendEvent(Lcom/unity3d/services/core/cache/CacheEvent;[Ljava/lang/Object;)Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 432
    .line 433
    .line 434
    iput-object v15, v1, Lcom/unity3d/services/core/cache/CacheThreadHandler;->_currentRequest:Lcom/unity3d/services/core/request/WebRequest;

    .line 435
    .line 436
    if-eqz v10, :cond_4

    .line 437
    .line 438
    :try_start_5
    invoke-virtual {v10}, Ljava/io/FileOutputStream;->close()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_13

    .line 439
    .line 440
    .line 441
    goto/16 :goto_11

    .line 442
    .line 443
    :catch_13
    move-exception v0

    .line 444
    invoke-static {v14, v0}, Lcom/unity3d/services/core/log/DeviceLog;->exception(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 445
    .line 446
    .line 447
    sget-object v2, Lcom/unity3d/services/core/cache/CacheEvent;->DOWNLOAD_ERROR:Lcom/unity3d/services/core/cache/CacheEvent;

    .line 448
    .line 449
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 450
    .line 451
    .line 452
    move-result-object v0

    .line 453
    const/4 v3, 0x3

    .line 454
    new-array v3, v3, [Ljava/lang/Object;

    .line 455
    .line 456
    sget-object v4, Lcom/unity3d/services/core/cache/CacheError;->FILE_IO_ERROR:Lcom/unity3d/services/core/cache/CacheError;

    .line 457
    .line 458
    aput-object v4, v3, v5

    .line 459
    .line 460
    aput-object p1, v3, v18

    .line 461
    .line 462
    aput-object v0, v3, v20

    .line 463
    .line 464
    invoke-virtual {v13, v2, v3}, Lcom/unity3d/services/core/cache/CacheEventSender;->sendEvent(Lcom/unity3d/services/core/cache/CacheEvent;[Ljava/lang/Object;)Z

    .line 465
    .line 466
    .line 467
    goto/16 :goto_11

    .line 468
    .line 469
    :catchall_3
    move-exception v0

    .line 470
    goto :goto_8

    .line 471
    :goto_a
    :try_start_6
    const-string v2, "Network error"

    .line 472
    .line 473
    invoke-static {v2, v0}, Lcom/unity3d/services/core/log/DeviceLog;->exception(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 474
    .line 475
    .line 476
    iput-boolean v5, v1, Lcom/unity3d/services/core/cache/CacheThreadHandler;->_active:Z

    .line 477
    .line 478
    sget-object v2, Lcom/unity3d/services/core/cache/CacheEvent;->DOWNLOAD_ERROR:Lcom/unity3d/services/core/cache/CacheEvent;

    .line 479
    .line 480
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 481
    .line 482
    .line 483
    move-result-object v0

    .line 484
    const/4 v3, 0x3

    .line 485
    new-array v4, v3, [Ljava/lang/Object;

    .line 486
    .line 487
    sget-object v3, Lcom/unity3d/services/core/cache/CacheError;->NETWORK_ERROR:Lcom/unity3d/services/core/cache/CacheError;

    .line 488
    .line 489
    aput-object v3, v4, v5

    .line 490
    .line 491
    aput-object p1, v4, v18

    .line 492
    .line 493
    aput-object v0, v4, v20

    .line 494
    .line 495
    invoke-virtual {v13, v2, v4}, Lcom/unity3d/services/core/cache/CacheEventSender;->sendEvent(Lcom/unity3d/services/core/cache/CacheEvent;[Ljava/lang/Object;)Z
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 496
    .line 497
    .line 498
    iput-object v15, v1, Lcom/unity3d/services/core/cache/CacheThreadHandler;->_currentRequest:Lcom/unity3d/services/core/request/WebRequest;

    .line 499
    .line 500
    if-eqz v10, :cond_4

    .line 501
    .line 502
    :try_start_7
    invoke-virtual {v10}, Ljava/io/FileOutputStream;->close()V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_14

    .line 503
    .line 504
    .line 505
    goto/16 :goto_11

    .line 506
    .line 507
    :catch_14
    move-exception v0

    .line 508
    invoke-static {v14, v0}, Lcom/unity3d/services/core/log/DeviceLog;->exception(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 509
    .line 510
    .line 511
    sget-object v2, Lcom/unity3d/services/core/cache/CacheEvent;->DOWNLOAD_ERROR:Lcom/unity3d/services/core/cache/CacheEvent;

    .line 512
    .line 513
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 514
    .line 515
    .line 516
    move-result-object v0

    .line 517
    const/4 v3, 0x3

    .line 518
    new-array v3, v3, [Ljava/lang/Object;

    .line 519
    .line 520
    sget-object v4, Lcom/unity3d/services/core/cache/CacheError;->FILE_IO_ERROR:Lcom/unity3d/services/core/cache/CacheError;

    .line 521
    .line 522
    aput-object v4, v3, v5

    .line 523
    .line 524
    aput-object p1, v3, v18

    .line 525
    .line 526
    aput-object v0, v3, v20

    .line 527
    .line 528
    invoke-virtual {v13, v2, v3}, Lcom/unity3d/services/core/cache/CacheEventSender;->sendEvent(Lcom/unity3d/services/core/cache/CacheEvent;[Ljava/lang/Object;)Z

    .line 529
    .line 530
    .line 531
    goto/16 :goto_11

    .line 532
    .line 533
    :goto_b
    :try_start_8
    const-string v2, "Illegal state"

    .line 534
    .line 535
    invoke-static {v2, v0}, Lcom/unity3d/services/core/log/DeviceLog;->exception(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 536
    .line 537
    .line 538
    iput-boolean v5, v1, Lcom/unity3d/services/core/cache/CacheThreadHandler;->_active:Z

    .line 539
    .line 540
    sget-object v2, Lcom/unity3d/services/core/cache/CacheEvent;->DOWNLOAD_ERROR:Lcom/unity3d/services/core/cache/CacheEvent;

    .line 541
    .line 542
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 543
    .line 544
    .line 545
    move-result-object v0

    .line 546
    const/4 v3, 0x3

    .line 547
    new-array v4, v3, [Ljava/lang/Object;

    .line 548
    .line 549
    sget-object v3, Lcom/unity3d/services/core/cache/CacheError;->ILLEGAL_STATE:Lcom/unity3d/services/core/cache/CacheError;

    .line 550
    .line 551
    aput-object v3, v4, v5

    .line 552
    .line 553
    aput-object p1, v4, v18

    .line 554
    .line 555
    aput-object v0, v4, v20

    .line 556
    .line 557
    invoke-virtual {v13, v2, v4}, Lcom/unity3d/services/core/cache/CacheEventSender;->sendEvent(Lcom/unity3d/services/core/cache/CacheEvent;[Ljava/lang/Object;)Z
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 558
    .line 559
    .line 560
    iput-object v15, v1, Lcom/unity3d/services/core/cache/CacheThreadHandler;->_currentRequest:Lcom/unity3d/services/core/request/WebRequest;

    .line 561
    .line 562
    if-eqz v10, :cond_4

    .line 563
    .line 564
    :try_start_9
    invoke-virtual {v10}, Ljava/io/FileOutputStream;->close()V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_15

    .line 565
    .line 566
    .line 567
    goto/16 :goto_11

    .line 568
    .line 569
    :catch_15
    move-exception v0

    .line 570
    invoke-static {v14, v0}, Lcom/unity3d/services/core/log/DeviceLog;->exception(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 571
    .line 572
    .line 573
    sget-object v2, Lcom/unity3d/services/core/cache/CacheEvent;->DOWNLOAD_ERROR:Lcom/unity3d/services/core/cache/CacheEvent;

    .line 574
    .line 575
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 576
    .line 577
    .line 578
    move-result-object v0

    .line 579
    const/4 v3, 0x3

    .line 580
    new-array v3, v3, [Ljava/lang/Object;

    .line 581
    .line 582
    sget-object v4, Lcom/unity3d/services/core/cache/CacheError;->FILE_IO_ERROR:Lcom/unity3d/services/core/cache/CacheError;

    .line 583
    .line 584
    aput-object v4, v3, v5

    .line 585
    .line 586
    aput-object p1, v3, v18

    .line 587
    .line 588
    aput-object v0, v3, v20

    .line 589
    .line 590
    invoke-virtual {v13, v2, v3}, Lcom/unity3d/services/core/cache/CacheEventSender;->sendEvent(Lcom/unity3d/services/core/cache/CacheEvent;[Ljava/lang/Object;)Z

    .line 591
    .line 592
    .line 593
    goto/16 :goto_11

    .line 594
    .line 595
    :goto_c
    :try_start_a
    const-string v2, "Couldn\'t request stream"

    .line 596
    .line 597
    invoke-static {v2, v0}, Lcom/unity3d/services/core/log/DeviceLog;->exception(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 598
    .line 599
    .line 600
    iput-boolean v5, v1, Lcom/unity3d/services/core/cache/CacheThreadHandler;->_active:Z

    .line 601
    .line 602
    sget-object v2, Lcom/unity3d/services/core/cache/CacheEvent;->DOWNLOAD_ERROR:Lcom/unity3d/services/core/cache/CacheEvent;

    .line 603
    .line 604
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 605
    .line 606
    .line 607
    move-result-object v0

    .line 608
    const/4 v3, 0x3

    .line 609
    new-array v4, v3, [Ljava/lang/Object;

    .line 610
    .line 611
    sget-object v3, Lcom/unity3d/services/core/cache/CacheError;->FILE_IO_ERROR:Lcom/unity3d/services/core/cache/CacheError;

    .line 612
    .line 613
    aput-object v3, v4, v5

    .line 614
    .line 615
    aput-object p1, v4, v18

    .line 616
    .line 617
    aput-object v0, v4, v20

    .line 618
    .line 619
    invoke-virtual {v13, v2, v4}, Lcom/unity3d/services/core/cache/CacheEventSender;->sendEvent(Lcom/unity3d/services/core/cache/CacheEvent;[Ljava/lang/Object;)Z
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    .line 620
    .line 621
    .line 622
    iput-object v15, v1, Lcom/unity3d/services/core/cache/CacheThreadHandler;->_currentRequest:Lcom/unity3d/services/core/request/WebRequest;

    .line 623
    .line 624
    if-eqz v10, :cond_4

    .line 625
    .line 626
    :try_start_b
    invoke-virtual {v10}, Ljava/io/FileOutputStream;->close()V
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_16

    .line 627
    .line 628
    .line 629
    goto/16 :goto_11

    .line 630
    .line 631
    :catch_16
    move-exception v0

    .line 632
    invoke-static {v14, v0}, Lcom/unity3d/services/core/log/DeviceLog;->exception(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 633
    .line 634
    .line 635
    sget-object v2, Lcom/unity3d/services/core/cache/CacheEvent;->DOWNLOAD_ERROR:Lcom/unity3d/services/core/cache/CacheEvent;

    .line 636
    .line 637
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 638
    .line 639
    .line 640
    move-result-object v0

    .line 641
    const/4 v3, 0x3

    .line 642
    new-array v3, v3, [Ljava/lang/Object;

    .line 643
    .line 644
    sget-object v4, Lcom/unity3d/services/core/cache/CacheError;->FILE_IO_ERROR:Lcom/unity3d/services/core/cache/CacheError;

    .line 645
    .line 646
    aput-object v4, v3, v5

    .line 647
    .line 648
    aput-object p1, v3, v18

    .line 649
    .line 650
    aput-object v0, v3, v20

    .line 651
    .line 652
    invoke-virtual {v13, v2, v3}, Lcom/unity3d/services/core/cache/CacheEventSender;->sendEvent(Lcom/unity3d/services/core/cache/CacheEvent;[Ljava/lang/Object;)Z

    .line 653
    .line 654
    .line 655
    goto/16 :goto_11

    .line 656
    .line 657
    :goto_d
    :try_start_c
    const-string v2, "Malformed URL"

    .line 658
    .line 659
    invoke-static {v2, v0}, Lcom/unity3d/services/core/log/DeviceLog;->exception(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 660
    .line 661
    .line 662
    iput-boolean v5, v1, Lcom/unity3d/services/core/cache/CacheThreadHandler;->_active:Z

    .line 663
    .line 664
    sget-object v2, Lcom/unity3d/services/core/cache/CacheEvent;->DOWNLOAD_ERROR:Lcom/unity3d/services/core/cache/CacheEvent;

    .line 665
    .line 666
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 667
    .line 668
    .line 669
    move-result-object v0

    .line 670
    const/4 v3, 0x3

    .line 671
    new-array v4, v3, [Ljava/lang/Object;

    .line 672
    .line 673
    sget-object v3, Lcom/unity3d/services/core/cache/CacheError;->MALFORMED_URL:Lcom/unity3d/services/core/cache/CacheError;

    .line 674
    .line 675
    aput-object v3, v4, v5

    .line 676
    .line 677
    aput-object p1, v4, v18

    .line 678
    .line 679
    aput-object v0, v4, v20

    .line 680
    .line 681
    invoke-virtual {v13, v2, v4}, Lcom/unity3d/services/core/cache/CacheEventSender;->sendEvent(Lcom/unity3d/services/core/cache/CacheEvent;[Ljava/lang/Object;)Z
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    .line 682
    .line 683
    .line 684
    iput-object v15, v1, Lcom/unity3d/services/core/cache/CacheThreadHandler;->_currentRequest:Lcom/unity3d/services/core/request/WebRequest;

    .line 685
    .line 686
    if-eqz v10, :cond_4

    .line 687
    .line 688
    :try_start_d
    invoke-virtual {v10}, Ljava/io/FileOutputStream;->close()V
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_17

    .line 689
    .line 690
    .line 691
    goto/16 :goto_11

    .line 692
    .line 693
    :catch_17
    move-exception v0

    .line 694
    invoke-static {v14, v0}, Lcom/unity3d/services/core/log/DeviceLog;->exception(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 695
    .line 696
    .line 697
    sget-object v2, Lcom/unity3d/services/core/cache/CacheEvent;->DOWNLOAD_ERROR:Lcom/unity3d/services/core/cache/CacheEvent;

    .line 698
    .line 699
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 700
    .line 701
    .line 702
    move-result-object v0

    .line 703
    const/4 v3, 0x3

    .line 704
    new-array v3, v3, [Ljava/lang/Object;

    .line 705
    .line 706
    sget-object v4, Lcom/unity3d/services/core/cache/CacheError;->FILE_IO_ERROR:Lcom/unity3d/services/core/cache/CacheError;

    .line 707
    .line 708
    aput-object v4, v3, v5

    .line 709
    .line 710
    aput-object p1, v3, v18

    .line 711
    .line 712
    aput-object v0, v3, v20

    .line 713
    .line 714
    invoke-virtual {v13, v2, v3}, Lcom/unity3d/services/core/cache/CacheEventSender;->sendEvent(Lcom/unity3d/services/core/cache/CacheEvent;[Ljava/lang/Object;)Z

    .line 715
    .line 716
    .line 717
    goto :goto_11

    .line 718
    :goto_e
    :try_start_e
    const-string v2, "Couldn\'t create target file"

    .line 719
    .line 720
    invoke-static {v2, v0}, Lcom/unity3d/services/core/log/DeviceLog;->exception(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 721
    .line 722
    .line 723
    iput-boolean v5, v1, Lcom/unity3d/services/core/cache/CacheThreadHandler;->_active:Z

    .line 724
    .line 725
    sget-object v2, Lcom/unity3d/services/core/cache/CacheEvent;->DOWNLOAD_ERROR:Lcom/unity3d/services/core/cache/CacheEvent;

    .line 726
    .line 727
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 728
    .line 729
    .line 730
    move-result-object v0

    .line 731
    const/4 v3, 0x3

    .line 732
    new-array v4, v3, [Ljava/lang/Object;

    .line 733
    .line 734
    sget-object v3, Lcom/unity3d/services/core/cache/CacheError;->FILE_IO_ERROR:Lcom/unity3d/services/core/cache/CacheError;

    .line 735
    .line 736
    aput-object v3, v4, v5

    .line 737
    .line 738
    aput-object p1, v4, v18

    .line 739
    .line 740
    aput-object v0, v4, v20

    .line 741
    .line 742
    invoke-virtual {v13, v2, v4}, Lcom/unity3d/services/core/cache/CacheEventSender;->sendEvent(Lcom/unity3d/services/core/cache/CacheEvent;[Ljava/lang/Object;)Z
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_3

    .line 743
    .line 744
    .line 745
    iput-object v15, v1, Lcom/unity3d/services/core/cache/CacheThreadHandler;->_currentRequest:Lcom/unity3d/services/core/request/WebRequest;

    .line 746
    .line 747
    if-eqz v10, :cond_4

    .line 748
    .line 749
    :try_start_f
    invoke-virtual {v10}, Ljava/io/FileOutputStream;->close()V
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_18

    .line 750
    .line 751
    .line 752
    goto :goto_11

    .line 753
    :catch_18
    move-exception v0

    .line 754
    invoke-static {v14, v0}, Lcom/unity3d/services/core/log/DeviceLog;->exception(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 755
    .line 756
    .line 757
    sget-object v2, Lcom/unity3d/services/core/cache/CacheEvent;->DOWNLOAD_ERROR:Lcom/unity3d/services/core/cache/CacheEvent;

    .line 758
    .line 759
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 760
    .line 761
    .line 762
    move-result-object v0

    .line 763
    const/4 v3, 0x3

    .line 764
    new-array v3, v3, [Ljava/lang/Object;

    .line 765
    .line 766
    sget-object v4, Lcom/unity3d/services/core/cache/CacheError;->FILE_IO_ERROR:Lcom/unity3d/services/core/cache/CacheError;

    .line 767
    .line 768
    aput-object v4, v3, v5

    .line 769
    .line 770
    aput-object p1, v3, v18

    .line 771
    .line 772
    aput-object v0, v3, v20

    .line 773
    .line 774
    invoke-virtual {v13, v2, v3}, Lcom/unity3d/services/core/cache/CacheEventSender;->sendEvent(Lcom/unity3d/services/core/cache/CacheEvent;[Ljava/lang/Object;)Z

    .line 775
    .line 776
    .line 777
    goto :goto_11

    .line 778
    :goto_f
    iput-object v15, v1, Lcom/unity3d/services/core/cache/CacheThreadHandler;->_currentRequest:Lcom/unity3d/services/core/request/WebRequest;

    .line 779
    .line 780
    if-eqz v10, :cond_3

    .line 781
    .line 782
    :try_start_10
    invoke-virtual {v10}, Ljava/io/FileOutputStream;->close()V
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_19

    .line 783
    .line 784
    .line 785
    goto :goto_10

    .line 786
    :catch_19
    move-exception v0

    .line 787
    invoke-static {v14, v0}, Lcom/unity3d/services/core/log/DeviceLog;->exception(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 788
    .line 789
    .line 790
    sget-object v3, Lcom/unity3d/services/core/cache/CacheEvent;->DOWNLOAD_ERROR:Lcom/unity3d/services/core/cache/CacheEvent;

    .line 791
    .line 792
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 793
    .line 794
    .line 795
    move-result-object v0

    .line 796
    const/4 v4, 0x3

    .line 797
    new-array v4, v4, [Ljava/lang/Object;

    .line 798
    .line 799
    sget-object v6, Lcom/unity3d/services/core/cache/CacheError;->FILE_IO_ERROR:Lcom/unity3d/services/core/cache/CacheError;

    .line 800
    .line 801
    aput-object v6, v4, v5

    .line 802
    .line 803
    aput-object p1, v4, v18

    .line 804
    .line 805
    aput-object v0, v4, v20

    .line 806
    .line 807
    invoke-virtual {v13, v3, v4}, Lcom/unity3d/services/core/cache/CacheEventSender;->sendEvent(Lcom/unity3d/services/core/cache/CacheEvent;[Ljava/lang/Object;)Z

    .line 808
    .line 809
    .line 810
    :cond_3
    :goto_10
    throw v2

    .line 811
    :cond_4
    :goto_11
    return-void
.end method

.method private getWebRequest(Ljava/lang/String;IILjava/util/HashMap;)Lcom/unity3d/services/core/request/WebRequest;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "II",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;)",
            "Lcom/unity3d/services/core/request/WebRequest;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/net/MalformedURLException;
        }
    .end annotation

    .line 1
    new-instance v3, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    if-eqz p4, :cond_0

    .line 7
    .line 8
    invoke-virtual {v3, p4}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 9
    .line 10
    .line 11
    :cond_0
    new-instance v0, Lcom/unity3d/services/core/request/WebRequest;

    .line 12
    .line 13
    const-string v2, "GET"

    .line 14
    .line 15
    move-object v1, p1

    .line 16
    move v4, p2

    .line 17
    move v5, p3

    .line 18
    invoke-direct/range {v0 .. v5}, Lcom/unity3d/services/core/request/WebRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;II)V

    .line 19
    .line 20
    .line 21
    return-object v0
.end method

.method private postProcessDownload(JLjava/lang/String;Ljava/io/File;JJZILjava/util/Map;Lcom/unity3d/services/core/cache/CacheEventSender;)V
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/lang/String;",
            "Ljava/io/File;",
            "JJZI",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;",
            "Lcom/unity3d/services/core/cache/CacheEventSender;",
            ")V"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p3

    .line 2
    .line 3
    move-object/from16 v1, p12

    .line 4
    .line 5
    const/4 v2, 0x5

    .line 6
    const/4 v3, 0x4

    .line 7
    const/4 v4, 0x3

    .line 8
    const/4 v5, 0x2

    .line 9
    const/4 v6, 0x6

    .line 10
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 11
    .line 12
    .line 13
    move-result-wide v7

    .line 14
    sub-long v7, v7, p1

    .line 15
    .line 16
    const/4 v9, 0x1

    .line 17
    const/4 v10, 0x0

    .line 18
    move-object/from16 v11, p4

    .line 19
    .line 20
    invoke-virtual {v11, v9, v10}, Ljava/io/File;->setReadable(ZZ)Z

    .line 21
    .line 22
    .line 23
    move-result v12

    .line 24
    if-nez v12, :cond_0

    .line 25
    .line 26
    const-string v12, "Unity Ads cache: could not set file readable!"

    .line 27
    .line 28
    invoke-static {v12}, Lcom/unity3d/services/core/log/DeviceLog;->debug(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    :cond_0
    if-nez p9, :cond_1

    .line 32
    .line 33
    new-instance v12, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    const-string v13, "Unity Ads cache: File "

    .line 36
    .line 37
    invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v11}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v11

    .line 44
    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string v11, " of "

    .line 48
    .line 49
    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    move-wide/from16 v13, p5

    .line 53
    .line 54
    invoke-virtual {v12, v13, v14}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    const-string v11, " bytes downloaded in "

    .line 58
    .line 59
    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v12, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    const-string v11, "ms"

    .line 66
    .line 67
    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v11

    .line 74
    invoke-static {v11}, Lcom/unity3d/services/core/log/DeviceLog;->debug(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    sget-object v11, Lcom/unity3d/services/core/cache/CacheEvent;->DOWNLOAD_END:Lcom/unity3d/services/core/cache/CacheEvent;

    .line 78
    .line 79
    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 80
    .line 81
    .line 82
    move-result-object v12

    .line 83
    invoke-static/range {p7 .. p8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 84
    .line 85
    .line 86
    move-result-object v13

    .line 87
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 88
    .line 89
    .line 90
    move-result-object v7

    .line 91
    invoke-static/range {p10 .. p10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 92
    .line 93
    .line 94
    move-result-object v8

    .line 95
    invoke-static/range {p11 .. p11}, Lcom/unity3d/services/core/api/Request;->getResponseHeadersMap(Ljava/util/Map;)Lorg/json/JSONArray;

    .line 96
    .line 97
    .line 98
    move-result-object v14

    .line 99
    new-array v6, v6, [Ljava/lang/Object;

    .line 100
    .line 101
    aput-object v0, v6, v10

    .line 102
    .line 103
    aput-object v12, v6, v9

    .line 104
    .line 105
    aput-object v13, v6, v5

    .line 106
    .line 107
    aput-object v7, v6, v4

    .line 108
    .line 109
    aput-object v8, v6, v3

    .line 110
    .line 111
    aput-object v14, v6, v2

    .line 112
    .line 113
    invoke-virtual {v1, v11, v6}, Lcom/unity3d/services/core/cache/CacheEventSender;->sendEvent(Lcom/unity3d/services/core/cache/CacheEvent;[Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    return-void

    .line 117
    :cond_1
    move-wide/from16 v13, p5

    .line 118
    .line 119
    new-instance v11, Ljava/lang/StringBuilder;

    .line 120
    .line 121
    const-string v12, "Unity Ads cache: downloading of "

    .line 122
    .line 123
    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    const-string v12, " stopped"

    .line 130
    .line 131
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v11

    .line 138
    invoke-static {v11}, Lcom/unity3d/services/core/log/DeviceLog;->debug(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    sget-object v11, Lcom/unity3d/services/core/cache/CacheEvent;->DOWNLOAD_STOPPED:Lcom/unity3d/services/core/cache/CacheEvent;

    .line 142
    .line 143
    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 144
    .line 145
    .line 146
    move-result-object v12

    .line 147
    invoke-static/range {p7 .. p8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 148
    .line 149
    .line 150
    move-result-object v13

    .line 151
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 152
    .line 153
    .line 154
    move-result-object v7

    .line 155
    invoke-static/range {p10 .. p10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 156
    .line 157
    .line 158
    move-result-object v8

    .line 159
    invoke-static/range {p11 .. p11}, Lcom/unity3d/services/core/api/Request;->getResponseHeadersMap(Ljava/util/Map;)Lorg/json/JSONArray;

    .line 160
    .line 161
    .line 162
    move-result-object v14

    .line 163
    new-array v6, v6, [Ljava/lang/Object;

    .line 164
    .line 165
    aput-object v0, v6, v10

    .line 166
    .line 167
    aput-object v12, v6, v9

    .line 168
    .line 169
    aput-object v13, v6, v5

    .line 170
    .line 171
    aput-object v7, v6, v4

    .line 172
    .line 173
    aput-object v8, v6, v3

    .line 174
    .line 175
    aput-object v14, v6, v2

    .line 176
    .line 177
    invoke-virtual {v1, v11, v6}, Lcom/unity3d/services/core/cache/CacheEventSender;->sendEvent(Lcom/unity3d/services/core/cache/CacheEvent;[Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 14

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    const-string v2, "source"

    .line 7
    .line 8
    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v4

    .line 12
    invoke-virtual {v1, v2}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const-string v2, "target"

    .line 16
    .line 17
    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    invoke-virtual {v1, v2}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const-string v2, "connectTimeout"

    .line 25
    .line 26
    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    move-result v6

    .line 30
    invoke-virtual {v1, v2}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    const-string v2, "readTimeout"

    .line 34
    .line 35
    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 36
    .line 37
    .line 38
    move-result v7

    .line 39
    invoke-virtual {v1, v2}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    const-string v2, "progressInterval"

    .line 43
    .line 44
    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 45
    .line 46
    .line 47
    move-result v8

    .line 48
    invoke-virtual {v1, v2}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    const-string v2, "append"

    .line 52
    .line 53
    const/4 v3, 0x0

    .line 54
    invoke-virtual {v1, v2, v3}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 55
    .line 56
    .line 57
    move-result v10

    .line 58
    invoke-virtual {v1, v2}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    const-string v2, "cacheEventSender"

    .line 62
    .line 63
    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    .line 64
    .line 65
    .line 66
    move-result-object v9

    .line 67
    move-object v11, v9

    .line 68
    check-cast v11, Lcom/unity3d/services/core/cache/CacheEventSender;

    .line 69
    .line 70
    invoke-virtual {v1, v2}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1}, Landroid/os/BaseBundle;->size()I

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    if-lez v2, :cond_1

    .line 78
    .line 79
    const-string v2, "There are headers left in data, reading them"

    .line 80
    .line 81
    invoke-static {v2}, Lcom/unity3d/services/core/log/DeviceLog;->debug(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    new-instance v2, Ljava/util/HashMap;

    .line 85
    .line 86
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v1}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 90
    .line 91
    .line 92
    move-result-object v9

    .line 93
    invoke-interface {v9}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 94
    .line 95
    .line 96
    move-result-object v9

    .line 97
    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 98
    .line 99
    .line 100
    move-result v12

    .line 101
    if-eqz v12, :cond_0

    .line 102
    .line 103
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v12

    .line 107
    check-cast v12, Ljava/lang/String;

    .line 108
    .line 109
    invoke-virtual {v1, v12}, Landroid/os/BaseBundle;->getStringArray(Ljava/lang/String;)[Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v13

    .line 113
    invoke-static {v13}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 114
    .line 115
    .line 116
    move-result-object v13

    .line 117
    invoke-virtual {v2, v12, v13}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    goto :goto_0

    .line 121
    :cond_0
    :goto_1
    move-object v9, v2

    .line 122
    goto :goto_2

    .line 123
    :cond_1
    const/4 v2, 0x0

    .line 124
    goto :goto_1

    .line 125
    :goto_2
    new-instance v1, Ljava/io/File;

    .line 126
    .line 127
    invoke-direct {v1, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    if-eqz v10, :cond_2

    .line 131
    .line 132
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 133
    .line 134
    .line 135
    move-result v2

    .line 136
    if-eqz v2, :cond_3

    .line 137
    .line 138
    :cond_2
    if-nez v10, :cond_4

    .line 139
    .line 140
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 141
    .line 142
    .line 143
    move-result v2

    .line 144
    if-eqz v2, :cond_4

    .line 145
    .line 146
    :cond_3
    iput-boolean v3, p0, Lcom/unity3d/services/core/cache/CacheThreadHandler;->_active:Z

    .line 147
    .line 148
    sget-object p1, Lcom/unity3d/services/core/cache/CacheEvent;->DOWNLOAD_ERROR:Lcom/unity3d/services/core/cache/CacheEvent;

    .line 149
    .line 150
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 155
    .line 156
    .line 157
    move-result v1

    .line 158
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    const/4 v6, 0x5

    .line 163
    new-array v6, v6, [Ljava/lang/Object;

    .line 164
    .line 165
    sget-object v7, Lcom/unity3d/services/core/cache/CacheError;->FILE_STATE_WRONG:Lcom/unity3d/services/core/cache/CacheError;

    .line 166
    .line 167
    aput-object v7, v6, v3

    .line 168
    .line 169
    aput-object v4, v6, v0

    .line 170
    .line 171
    const/4 v0, 0x2

    .line 172
    aput-object v5, v6, v0

    .line 173
    .line 174
    const/4 v0, 0x3

    .line 175
    aput-object v2, v6, v0

    .line 176
    .line 177
    const/4 v0, 0x4

    .line 178
    aput-object v1, v6, v0

    .line 179
    .line 180
    invoke-virtual {v11, p1, v6}, Lcom/unity3d/services/core/cache/CacheEventSender;->sendEvent(Lcom/unity3d/services/core/cache/CacheEvent;[Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    return-void

    .line 184
    :cond_4
    iget p1, p1, Landroid/os/Message;->what:I

    .line 185
    .line 186
    if-eq p1, v0, :cond_5

    .line 187
    .line 188
    return-void

    .line 189
    :cond_5
    move-object v3, p0

    .line 190
    invoke-direct/range {v3 .. v11}, Lcom/unity3d/services/core/cache/CacheThreadHandler;->downloadFile(Ljava/lang/String;Ljava/lang/String;IIILjava/util/HashMap;ZLcom/unity3d/services/core/cache/CacheEventSender;)V

    .line 191
    .line 192
    .line 193
    return-void
.end method

.method public isActive()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/unity3d/services/core/cache/CacheThreadHandler;->_active:Z

    .line 2
    .line 3
    return v0
.end method

.method public setCancelStatus(Z)V
    .locals 1

    .line 1
    iput-boolean p1, p0, Lcom/unity3d/services/core/cache/CacheThreadHandler;->_canceled:Z

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lcom/unity3d/services/core/cache/CacheThreadHandler;->_currentRequest:Lcom/unity3d/services/core/request/WebRequest;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput-boolean v0, p0, Lcom/unity3d/services/core/cache/CacheThreadHandler;->_active:Z

    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/unity3d/services/core/request/WebRequest;->cancel()V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method
