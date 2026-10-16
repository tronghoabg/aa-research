.class public final enum Lcom/moloco/sdk/internal/client_metrics_data/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final synthetic b:[Lcom/moloco/sdk/internal/client_metrics_data/a;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 83

    .line 1
    new-instance v0, Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 2
    .line 3
    const-string v1, "sdk_init_attempt"

    .line 4
    .line 5
    const-string v2, "SDKInitAttempt"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct {v0, v2, v3, v1}, Lcom/moloco/sdk/internal/client_metrics_data/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v1, Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 12
    .line 13
    const-string v2, "sdk_init_success"

    .line 14
    .line 15
    const-string v4, "SDKInitSuccess"

    .line 16
    .line 17
    const/4 v5, 0x1

    .line 18
    invoke-direct {v1, v4, v5, v2}, Lcom/moloco/sdk/internal/client_metrics_data/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 19
    .line 20
    .line 21
    new-instance v2, Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 22
    .line 23
    const-string v4, "sdk_init_failure"

    .line 24
    .line 25
    const-string v6, "SDKInitFailure"

    .line 26
    .line 27
    const/4 v7, 0x2

    .line 28
    invoke-direct {v2, v6, v7, v4}, Lcom/moloco/sdk/internal/client_metrics_data/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 29
    .line 30
    .line 31
    new-instance v4, Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 32
    .line 33
    const-string v6, "sdk_perform_init_attempt"

    .line 34
    .line 35
    const-string v8, "SDKPerformInitAttempt"

    .line 36
    .line 37
    const/4 v9, 0x3

    .line 38
    invoke-direct {v4, v8, v9, v6}, Lcom/moloco/sdk/internal/client_metrics_data/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 39
    .line 40
    .line 41
    new-instance v6, Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 42
    .line 43
    const-string v8, "sdk_fetch_init_attempt"

    .line 44
    .line 45
    const-string v10, "SDKFetchInitAttempt"

    .line 46
    .line 47
    const/4 v11, 0x4

    .line 48
    invoke-direct {v6, v10, v11, v8}, Lcom/moloco/sdk/internal/client_metrics_data/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 49
    .line 50
    .line 51
    new-instance v8, Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 52
    .line 53
    const-string v10, "sdk_init_cache_read"

    .line 54
    .line 55
    const-string v12, "SDKInitCacheRead"

    .line 56
    .line 57
    const/4 v13, 0x5

    .line 58
    invoke-direct {v8, v12, v13, v10}, Lcom/moloco/sdk/internal/client_metrics_data/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 59
    .line 60
    .line 61
    new-instance v10, Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 62
    .line 63
    const-string v12, "sdk_init_cache_write"

    .line 64
    .line 65
    const-string v14, "SDKInitCacheWrite"

    .line 66
    .line 67
    const/4 v15, 0x6

    .line 68
    invoke-direct {v10, v14, v15, v12}, Lcom/moloco/sdk/internal/client_metrics_data/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 69
    .line 70
    .line 71
    new-instance v12, Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 72
    .line 73
    const-string v14, "sdk_init_cache_clear"

    .line 74
    .line 75
    move/from16 v16, v3

    .line 76
    .line 77
    const-string v3, "SDKInitCacheClear"

    .line 78
    .line 79
    move/from16 v17, v5

    .line 80
    .line 81
    const/4 v5, 0x7

    .line 82
    invoke-direct {v12, v3, v5, v14}, Lcom/moloco/sdk/internal/client_metrics_data/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 83
    .line 84
    .line 85
    new-instance v3, Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 86
    .line 87
    const-string v14, "sdk_init_failure_different_app_key"

    .line 88
    .line 89
    move/from16 v18, v5

    .line 90
    .line 91
    const-string v5, "SDKInitFailureDifferentAppKey"

    .line 92
    .line 93
    move/from16 v19, v7

    .line 94
    .line 95
    const/16 v7, 0x8

    .line 96
    .line 97
    invoke-direct {v3, v5, v7, v14}, Lcom/moloco/sdk/internal/client_metrics_data/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 98
    .line 99
    .line 100
    new-instance v5, Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 101
    .line 102
    const-string v14, "create_ad"

    .line 103
    .line 104
    move/from16 v20, v7

    .line 105
    .line 106
    const-string v7, "CreateAd"

    .line 107
    .line 108
    move/from16 v21, v9

    .line 109
    .line 110
    const/16 v9, 0x9

    .line 111
    .line 112
    invoke-direct {v5, v7, v9, v14}, Lcom/moloco/sdk/internal/client_metrics_data/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 113
    .line 114
    .line 115
    new-instance v7, Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 116
    .line 117
    const-string v14, "load_ad_attempted"

    .line 118
    .line 119
    move/from16 v22, v9

    .line 120
    .line 121
    const-string v9, "LoadAdAttempt"

    .line 122
    .line 123
    move/from16 v23, v11

    .line 124
    .line 125
    const/16 v11, 0xa

    .line 126
    .line 127
    invoke-direct {v7, v9, v11, v14}, Lcom/moloco/sdk/internal/client_metrics_data/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 128
    .line 129
    .line 130
    new-instance v9, Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 131
    .line 132
    const-string v14, "load_ad_success"

    .line 133
    .line 134
    move/from16 v24, v11

    .line 135
    .line 136
    const-string v11, "LoadAdSuccess"

    .line 137
    .line 138
    move/from16 v25, v13

    .line 139
    .line 140
    const/16 v13, 0xb

    .line 141
    .line 142
    invoke-direct {v9, v11, v13, v14}, Lcom/moloco/sdk/internal/client_metrics_data/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 143
    .line 144
    .line 145
    new-instance v11, Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 146
    .line 147
    const-string v14, "load_ad_failed"

    .line 148
    .line 149
    move/from16 v26, v13

    .line 150
    .line 151
    const-string v13, "LoadAdFailed"

    .line 152
    .line 153
    move/from16 v27, v15

    .line 154
    .line 155
    const/16 v15, 0xc

    .line 156
    .line 157
    invoke-direct {v11, v13, v15, v14}, Lcom/moloco/sdk/internal/client_metrics_data/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 158
    .line 159
    .line 160
    new-instance v13, Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 161
    .line 162
    const-string v14, "native_ad_load_attempted"

    .line 163
    .line 164
    move/from16 v28, v15

    .line 165
    .line 166
    const-string v15, "NativeAdLoadAdAttempted"

    .line 167
    .line 168
    move-object/from16 v29, v0

    .line 169
    .line 170
    const/16 v0, 0xd

    .line 171
    .line 172
    invoke-direct {v13, v15, v0, v14}, Lcom/moloco/sdk/internal/client_metrics_data/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 173
    .line 174
    .line 175
    new-instance v14, Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 176
    .line 177
    const-string v15, "native_ad_load"

    .line 178
    .line 179
    move/from16 v30, v0

    .line 180
    .line 181
    const-string v0, "NativeLoadAd"

    .line 182
    .line 183
    move-object/from16 v31, v1

    .line 184
    .line 185
    const/16 v1, 0xe

    .line 186
    .line 187
    invoke-direct {v14, v0, v1, v15}, Lcom/moloco/sdk/internal/client_metrics_data/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 188
    .line 189
    .line 190
    new-instance v0, Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 191
    .line 192
    const-string v15, "bid_token_get_request"

    .line 193
    .line 194
    move/from16 v32, v1

    .line 195
    .line 196
    const-string v1, "BidTokenGetRequest"

    .line 197
    .line 198
    move-object/from16 v33, v2

    .line 199
    .line 200
    const/16 v2, 0xf

    .line 201
    .line 202
    invoke-direct {v0, v1, v2, v15}, Lcom/moloco/sdk/internal/client_metrics_data/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 203
    .line 204
    .line 205
    new-instance v1, Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 206
    .line 207
    const-string v15, "bid_token_get_response"

    .line 208
    .line 209
    move/from16 v34, v2

    .line 210
    .line 211
    const-string v2, "BidTokenGetResponse"

    .line 212
    .line 213
    move-object/from16 v35, v0

    .line 214
    .line 215
    const/16 v0, 0x10

    .line 216
    .line 217
    invoke-direct {v1, v2, v0, v15}, Lcom/moloco/sdk/internal/client_metrics_data/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 218
    .line 219
    .line 220
    new-instance v2, Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 221
    .line 222
    const-string v15, "bid_token_fetch"

    .line 223
    .line 224
    move/from16 v36, v0

    .line 225
    .line 226
    const-string v0, "BidTokenFetch"

    .line 227
    .line 228
    move-object/from16 v37, v1

    .line 229
    .line 230
    const/16 v1, 0x11

    .line 231
    .line 232
    invoke-direct {v2, v0, v1, v15}, Lcom/moloco/sdk/internal/client_metrics_data/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 233
    .line 234
    .line 235
    new-instance v0, Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 236
    .line 237
    const-string v15, "bid_token_duration_crossed_1s"

    .line 238
    .line 239
    move/from16 v38, v1

    .line 240
    .line 241
    const-string v1, "BidTokenDurationTimeoutOneSecond"

    .line 242
    .line 243
    move-object/from16 v39, v2

    .line 244
    .line 245
    const/16 v2, 0x12

    .line 246
    .line 247
    invoke-direct {v0, v1, v2, v15}, Lcom/moloco/sdk/internal/client_metrics_data/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 248
    .line 249
    .line 250
    new-instance v1, Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 251
    .line 252
    const-string v15, "bid_token_duration_crossed_3s"

    .line 253
    .line 254
    move/from16 v40, v2

    .line 255
    .line 256
    const-string v2, "BidTokenDurationTimeoutThreeSecond"

    .line 257
    .line 258
    move-object/from16 v41, v0

    .line 259
    .line 260
    const/16 v0, 0x13

    .line 261
    .line 262
    invoke-direct {v1, v2, v0, v15}, Lcom/moloco/sdk/internal/client_metrics_data/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 263
    .line 264
    .line 265
    new-instance v2, Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 266
    .line 267
    const-string v15, "sbt_fetch"

    .line 268
    .line 269
    move/from16 v42, v0

    .line 270
    .line 271
    const-string v0, "ServerBidTokenFetch"

    .line 272
    .line 273
    move-object/from16 v43, v1

    .line 274
    .line 275
    const/16 v1, 0x14

    .line 276
    .line 277
    invoke-direct {v2, v0, v1, v15}, Lcom/moloco/sdk/internal/client_metrics_data/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 278
    .line 279
    .line 280
    new-instance v0, Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 281
    .line 282
    const-string v15, "sbt_cached"

    .line 283
    .line 284
    move/from16 v44, v1

    .line 285
    .line 286
    const-string v1, "ServerBidTokenCached"

    .line 287
    .line 288
    move-object/from16 v45, v2

    .line 289
    .line 290
    const/16 v2, 0x15

    .line 291
    .line 292
    invoke-direct {v0, v1, v2, v15}, Lcom/moloco/sdk/internal/client_metrics_data/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 293
    .line 294
    .line 295
    new-instance v1, Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 296
    .line 297
    const-string v15, "sbt_api_fetch"

    .line 298
    .line 299
    move/from16 v46, v2

    .line 300
    .line 301
    const-string v2, "ServerBidTokenApiFetch"

    .line 302
    .line 303
    move-object/from16 v47, v0

    .line 304
    .line 305
    const/16 v0, 0x16

    .line 306
    .line 307
    invoke-direct {v1, v2, v0, v15}, Lcom/moloco/sdk/internal/client_metrics_data/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 308
    .line 309
    .line 310
    new-instance v0, Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 311
    .line 312
    const-string v2, "sbt_async_fetch"

    .line 313
    .line 314
    const-string v15, "ServerBidTokenAsyncRefresh"

    .line 315
    .line 316
    move-object/from16 v48, v1

    .line 317
    .line 318
    const/16 v1, 0x17

    .line 319
    .line 320
    invoke-direct {v0, v15, v1, v2}, Lcom/moloco/sdk/internal/client_metrics_data/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 321
    .line 322
    .line 323
    new-instance v1, Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 324
    .line 325
    const-string v2, "bid_token_build"

    .line 326
    .line 327
    const-string v15, "ClientBidTokenBuild"

    .line 328
    .line 329
    move-object/from16 v49, v0

    .line 330
    .line 331
    const/16 v0, 0x18

    .line 332
    .line 333
    invoke-direct {v1, v15, v0, v2}, Lcom/moloco/sdk/internal/client_metrics_data/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 334
    .line 335
    .line 336
    new-instance v0, Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 337
    .line 338
    const-string v2, "cbt_cached"

    .line 339
    .line 340
    const-string v15, "ClientBidTokenCached"

    .line 341
    .line 342
    move-object/from16 v50, v1

    .line 343
    .line 344
    const/16 v1, 0x19

    .line 345
    .line 346
    invoke-direct {v0, v15, v1, v2}, Lcom/moloco/sdk/internal/client_metrics_data/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 347
    .line 348
    .line 349
    new-instance v1, Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 350
    .line 351
    const-string v2, "show_ad_attempted"

    .line 352
    .line 353
    const-string v15, "ShowAdAttempt"

    .line 354
    .line 355
    move-object/from16 v51, v0

    .line 356
    .line 357
    const/16 v0, 0x1a

    .line 358
    .line 359
    invoke-direct {v1, v15, v0, v2}, Lcom/moloco/sdk/internal/client_metrics_data/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 360
    .line 361
    .line 362
    new-instance v0, Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 363
    .line 364
    const-string v2, "show_ad_success"

    .line 365
    .line 366
    const-string v15, "ShowAdSuccess"

    .line 367
    .line 368
    move-object/from16 v52, v1

    .line 369
    .line 370
    const/16 v1, 0x1b

    .line 371
    .line 372
    invoke-direct {v0, v15, v1, v2}, Lcom/moloco/sdk/internal/client_metrics_data/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 373
    .line 374
    .line 375
    new-instance v1, Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 376
    .line 377
    const-string v2, "show_ad_failed"

    .line 378
    .line 379
    const-string v15, "ShowAdFailed"

    .line 380
    .line 381
    move-object/from16 v53, v0

    .line 382
    .line 383
    const/16 v0, 0x1c

    .line 384
    .line 385
    invoke-direct {v1, v15, v0, v2}, Lcom/moloco/sdk/internal/client_metrics_data/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 386
    .line 387
    .line 388
    new-instance v0, Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 389
    .line 390
    const-string v2, "ad_clicked"

    .line 391
    .line 392
    const-string v15, "AdClicked"

    .line 393
    .line 394
    move-object/from16 v54, v1

    .line 395
    .line 396
    const/16 v1, 0x1d

    .line 397
    .line 398
    invoke-direct {v0, v15, v1, v2}, Lcom/moloco/sdk/internal/client_metrics_data/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 399
    .line 400
    .line 401
    new-instance v1, Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 402
    .line 403
    const-string v2, "ad_clicked_deduped"

    .line 404
    .line 405
    const-string v15, "AdClickedDeduped"

    .line 406
    .line 407
    move-object/from16 v55, v0

    .line 408
    .line 409
    const/16 v0, 0x1e

    .line 410
    .line 411
    invoke-direct {v1, v15, v0, v2}, Lcom/moloco/sdk/internal/client_metrics_data/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 412
    .line 413
    .line 414
    new-instance v0, Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 415
    .line 416
    const-string v2, "crash_detected"

    .line 417
    .line 418
    const-string v15, "CrashDetected"

    .line 419
    .line 420
    move-object/from16 v56, v1

    .line 421
    .line 422
    const/16 v1, 0x1f

    .line 423
    .line 424
    invoke-direct {v0, v15, v1, v2}, Lcom/moloco/sdk/internal/client_metrics_data/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 425
    .line 426
    .line 427
    new-instance v1, Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 428
    .line 429
    const-string v2, "webview_load_ad"

    .line 430
    .line 431
    const-string v15, "WebviewLoadAd"

    .line 432
    .line 433
    move-object/from16 v57, v0

    .line 434
    .line 435
    const/16 v0, 0x20

    .line 436
    .line 437
    invoke-direct {v1, v15, v0, v2}, Lcom/moloco/sdk/internal/client_metrics_data/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 438
    .line 439
    .line 440
    new-instance v0, Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 441
    .line 442
    const-string v2, "webview_html_ad_error"

    .line 443
    .line 444
    const-string v15, "WebviewHtmlAdError"

    .line 445
    .line 446
    move-object/from16 v58, v1

    .line 447
    .line 448
    const/16 v1, 0x21

    .line 449
    .line 450
    invoke-direct {v0, v15, v1, v2}, Lcom/moloco/sdk/internal/client_metrics_data/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 451
    .line 452
    .line 453
    new-instance v1, Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 454
    .line 455
    const-string v2, "webview_html_ad_retry_attempt"

    .line 456
    .line 457
    const-string v15, "WebviewHtmlAdRetryAttempt"

    .line 458
    .line 459
    move-object/from16 v59, v0

    .line 460
    .line 461
    const/16 v0, 0x22

    .line 462
    .line 463
    invoke-direct {v1, v15, v0, v2}, Lcom/moloco/sdk/internal/client_metrics_data/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 464
    .line 465
    .line 466
    new-instance v0, Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 467
    .line 468
    const-string v2, "webview_html_ad_ignored_error"

    .line 469
    .line 470
    const-string v15, "WebviewHtmlAdIgnoredError"

    .line 471
    .line 472
    move-object/from16 v60, v1

    .line 473
    .line 474
    const/16 v1, 0x23

    .line 475
    .line 476
    invoke-direct {v0, v15, v1, v2}, Lcom/moloco/sdk/internal/client_metrics_data/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 477
    .line 478
    .line 479
    new-instance v1, Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 480
    .line 481
    const-string v2, "webview_event_handled"

    .line 482
    .line 483
    const-string v15, "WebviewEventHandled"

    .line 484
    .line 485
    move-object/from16 v61, v0

    .line 486
    .line 487
    const/16 v0, 0x24

    .line 488
    .line 489
    invoke-direct {v1, v15, v0, v2}, Lcom/moloco/sdk/internal/client_metrics_data/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 490
    .line 491
    .line 492
    new-instance v0, Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 493
    .line 494
    const-string v2, "webview_event_multiple_handlers"

    .line 495
    .line 496
    const-string v15, "WebviewEventMultipleHandlers"

    .line 497
    .line 498
    move-object/from16 v62, v1

    .line 499
    .line 500
    const/16 v1, 0x25

    .line 501
    .line 502
    invoke-direct {v0, v15, v1, v2}, Lcom/moloco/sdk/internal/client_metrics_data/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 503
    .line 504
    .line 505
    new-instance v1, Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 506
    .line 507
    const-string v2, "webview_page_load_start"

    .line 508
    .line 509
    const-string v15, "WebviewPageLoadStart"

    .line 510
    .line 511
    move-object/from16 v63, v0

    .line 512
    .line 513
    const/16 v0, 0x26

    .line 514
    .line 515
    invoke-direct {v1, v15, v0, v2}, Lcom/moloco/sdk/internal/client_metrics_data/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 516
    .line 517
    .line 518
    new-instance v0, Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 519
    .line 520
    const-string v2, "webview_page_load_end"

    .line 521
    .line 522
    const-string v15, "WebviewPageLoadEnd"

    .line 523
    .line 524
    move-object/from16 v64, v1

    .line 525
    .line 526
    const/16 v1, 0x27

    .line 527
    .line 528
    invoke-direct {v0, v15, v1, v2}, Lcom/moloco/sdk/internal/client_metrics_data/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 529
    .line 530
    .line 531
    new-instance v1, Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 532
    .line 533
    const-string v2, "webview_page_load_finish_callback"

    .line 534
    .line 535
    const-string v15, "WebviewPageLoadFinishCallback"

    .line 536
    .line 537
    move-object/from16 v65, v0

    .line 538
    .line 539
    const/16 v0, 0x28

    .line 540
    .line 541
    invoke-direct {v1, v15, v0, v2}, Lcom/moloco/sdk/internal/client_metrics_data/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 542
    .line 543
    .line 544
    new-instance v0, Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 545
    .line 546
    const-string v2, "webview_required_content_loaded"

    .line 547
    .line 548
    const-string v15, "WebviewRequiredContentLoaded"

    .line 549
    .line 550
    move-object/from16 v66, v1

    .line 551
    .line 552
    const/16 v1, 0x29

    .line 553
    .line 554
    invoke-direct {v0, v15, v1, v2}, Lcom/moloco/sdk/internal/client_metrics_data/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 555
    .line 556
    .line 557
    new-instance v1, Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 558
    .line 559
    const-string v2, "store_launch_started"

    .line 560
    .line 561
    const-string v15, "StoreLaunchStarted"

    .line 562
    .line 563
    move-object/from16 v67, v0

    .line 564
    .line 565
    const/16 v0, 0x2a

    .line 566
    .line 567
    invoke-direct {v1, v15, v0, v2}, Lcom/moloco/sdk/internal/client_metrics_data/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 568
    .line 569
    .line 570
    new-instance v0, Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 571
    .line 572
    const-string v2, "store_launch_complete"

    .line 573
    .line 574
    const-string v15, "StoreLaunchComplete"

    .line 575
    .line 576
    move-object/from16 v68, v1

    .line 577
    .line 578
    const/16 v1, 0x2b

    .line 579
    .line 580
    invoke-direct {v0, v15, v1, v2}, Lcom/moloco/sdk/internal/client_metrics_data/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 581
    .line 582
    .line 583
    new-instance v1, Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 584
    .line 585
    const-string v2, "template_bridge_notify_ready_invoked"

    .line 586
    .line 587
    const-string v15, "TemplateBridgeNotifyReadyInvoked"

    .line 588
    .line 589
    move-object/from16 v69, v0

    .line 590
    .line 591
    const/16 v0, 0x2c

    .line 592
    .line 593
    invoke-direct {v1, v15, v0, v2}, Lcom/moloco/sdk/internal/client_metrics_data/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 594
    .line 595
    .line 596
    new-instance v0, Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 597
    .line 598
    const-string v2, "template_bridge_notify_ready_completed"

    .line 599
    .line 600
    const-string v15, "TemplateBridgeNotifyReadyCompleted"

    .line 601
    .line 602
    move-object/from16 v70, v1

    .line 603
    .line 604
    const/16 v1, 0x2d

    .line 605
    .line 606
    invoke-direct {v0, v15, v1, v2}, Lcom/moloco/sdk/internal/client_metrics_data/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 607
    .line 608
    .line 609
    new-instance v1, Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 610
    .line 611
    const-string v2, "template_bridge_view_visible_invoked"

    .line 612
    .line 613
    const-string v15, "TemplateBridgeViewVisibleInvoked"

    .line 614
    .line 615
    move-object/from16 v71, v0

    .line 616
    .line 617
    const/16 v0, 0x2e

    .line 618
    .line 619
    invoke-direct {v1, v15, v0, v2}, Lcom/moloco/sdk/internal/client_metrics_data/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 620
    .line 621
    .line 622
    new-instance v0, Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 623
    .line 624
    const-string v2, "template_bridge_view_visible_completed"

    .line 625
    .line 626
    const-string v15, "TemplateBridgeViewVisibleCompleted"

    .line 627
    .line 628
    move-object/from16 v72, v1

    .line 629
    .line 630
    const/16 v1, 0x2f

    .line 631
    .line 632
    invoke-direct {v0, v15, v1, v2}, Lcom/moloco/sdk/internal/client_metrics_data/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 633
    .line 634
    .line 635
    new-instance v1, Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 636
    .line 637
    const-string v2, "fullscreen_webview_activity_create"

    .line 638
    .line 639
    const-string v15, "FullscreenWebviewActivityOnCreate"

    .line 640
    .line 641
    move-object/from16 v73, v0

    .line 642
    .line 643
    const/16 v0, 0x30

    .line 644
    .line 645
    invoke-direct {v1, v15, v0, v2}, Lcom/moloco/sdk/internal/client_metrics_data/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 646
    .line 647
    .line 648
    new-instance v0, Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 649
    .line 650
    const-string v2, "reward_issued"

    .line 651
    .line 652
    const-string v15, "RewardIssued"

    .line 653
    .line 654
    move-object/from16 v74, v1

    .line 655
    .line 656
    const/16 v1, 0x31

    .line 657
    .line 658
    invoke-direct {v0, v15, v1, v2}, Lcom/moloco/sdk/internal/client_metrics_data/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 659
    .line 660
    .line 661
    new-instance v1, Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 662
    .line 663
    const-string v2, "unknown_creative_type"

    .line 664
    .line 665
    const-string v15, "UnknownCreativeType"

    .line 666
    .line 667
    move-object/from16 v75, v0

    .line 668
    .line 669
    const/16 v0, 0x32

    .line 670
    .line 671
    invoke-direct {v1, v15, v0, v2}, Lcom/moloco/sdk/internal/client_metrics_data/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 672
    .line 673
    .line 674
    new-instance v0, Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 675
    .line 676
    const-string v2, "webview_not_available"

    .line 677
    .line 678
    const-string v15, "WebViewNotAvailable"

    .line 679
    .line 680
    move-object/from16 v76, v1

    .line 681
    .line 682
    const/16 v1, 0x33

    .line 683
    .line 684
    invoke-direct {v0, v15, v1, v2}, Lcom/moloco/sdk/internal/client_metrics_data/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 685
    .line 686
    .line 687
    new-instance v1, Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 688
    .line 689
    const-string v2, "vast_show_file_not_exists"

    .line 690
    .line 691
    const-string v15, "VastShowFileNotExists"

    .line 692
    .line 693
    move-object/from16 v77, v0

    .line 694
    .line 695
    const/16 v0, 0x34

    .line 696
    .line 697
    invoke-direct {v1, v15, v0, v2}, Lcom/moloco/sdk/internal/client_metrics_data/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 698
    .line 699
    .line 700
    new-instance v0, Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 701
    .line 702
    const-string v2, "software_rendering_detected"

    .line 703
    .line 704
    const-string v15, "SoftwareRenderingDetected"

    .line 705
    .line 706
    move-object/from16 v78, v1

    .line 707
    .line 708
    const/16 v1, 0x35

    .line 709
    .line 710
    invoke-direct {v0, v15, v1, v2}, Lcom/moloco/sdk/internal/client_metrics_data/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 711
    .line 712
    .line 713
    new-instance v1, Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 714
    .line 715
    const-string v2, "exoplayer_error"

    .line 716
    .line 717
    const-string v15, "ExoPlayerError"

    .line 718
    .line 719
    move-object/from16 v79, v0

    .line 720
    .line 721
    const/16 v0, 0x36

    .line 722
    .line 723
    invoke-direct {v1, v15, v0, v2}, Lcom/moloco/sdk/internal/client_metrics_data/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 724
    .line 725
    .line 726
    new-instance v0, Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 727
    .line 728
    const-string v2, "ad_hidden"

    .line 729
    .line 730
    const-string v15, "AdHidden"

    .line 731
    .line 732
    move-object/from16 v80, v1

    .line 733
    .line 734
    const/16 v1, 0x37

    .line 735
    .line 736
    invoke-direct {v0, v15, v1, v2}, Lcom/moloco/sdk/internal/client_metrics_data/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 737
    .line 738
    .line 739
    new-instance v1, Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 740
    .line 741
    const-string v2, "native_ad_compose_not_available"

    .line 742
    .line 743
    const-string v15, "NativeAdComposeViewNotAvailable"

    .line 744
    .line 745
    move-object/from16 v81, v0

    .line 746
    .line 747
    const/16 v0, 0x38

    .line 748
    .line 749
    invoke-direct {v1, v15, v0, v2}, Lcom/moloco/sdk/internal/client_metrics_data/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 750
    .line 751
    .line 752
    new-instance v0, Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 753
    .line 754
    const-string v2, "fullscreen_ad_compose_not_available"

    .line 755
    .line 756
    const-string v15, "FullscreenAdComposeViewNotAvailable"

    .line 757
    .line 758
    move-object/from16 v82, v1

    .line 759
    .line 760
    const/16 v1, 0x39

    .line 761
    .line 762
    invoke-direct {v0, v15, v1, v2}, Lcom/moloco/sdk/internal/client_metrics_data/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 763
    .line 764
    .line 765
    const/16 v1, 0x3a

    .line 766
    .line 767
    new-array v1, v1, [Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 768
    .line 769
    aput-object v29, v1, v16

    .line 770
    .line 771
    aput-object v31, v1, v17

    .line 772
    .line 773
    aput-object v33, v1, v19

    .line 774
    .line 775
    aput-object v4, v1, v21

    .line 776
    .line 777
    aput-object v6, v1, v23

    .line 778
    .line 779
    aput-object v8, v1, v25

    .line 780
    .line 781
    aput-object v10, v1, v27

    .line 782
    .line 783
    aput-object v12, v1, v18

    .line 784
    .line 785
    aput-object v3, v1, v20

    .line 786
    .line 787
    aput-object v5, v1, v22

    .line 788
    .line 789
    aput-object v7, v1, v24

    .line 790
    .line 791
    aput-object v9, v1, v26

    .line 792
    .line 793
    aput-object v11, v1, v28

    .line 794
    .line 795
    aput-object v13, v1, v30

    .line 796
    .line 797
    aput-object v14, v1, v32

    .line 798
    .line 799
    aput-object v35, v1, v34

    .line 800
    .line 801
    aput-object v37, v1, v36

    .line 802
    .line 803
    aput-object v39, v1, v38

    .line 804
    .line 805
    aput-object v41, v1, v40

    .line 806
    .line 807
    aput-object v43, v1, v42

    .line 808
    .line 809
    aput-object v45, v1, v44

    .line 810
    .line 811
    aput-object v47, v1, v46

    .line 812
    .line 813
    const/16 v2, 0x16

    .line 814
    .line 815
    aput-object v48, v1, v2

    .line 816
    .line 817
    const/16 v2, 0x17

    .line 818
    .line 819
    aput-object v49, v1, v2

    .line 820
    .line 821
    const/16 v2, 0x18

    .line 822
    .line 823
    aput-object v50, v1, v2

    .line 824
    .line 825
    const/16 v2, 0x19

    .line 826
    .line 827
    aput-object v51, v1, v2

    .line 828
    .line 829
    const/16 v2, 0x1a

    .line 830
    .line 831
    aput-object v52, v1, v2

    .line 832
    .line 833
    const/16 v2, 0x1b

    .line 834
    .line 835
    aput-object v53, v1, v2

    .line 836
    .line 837
    const/16 v2, 0x1c

    .line 838
    .line 839
    aput-object v54, v1, v2

    .line 840
    .line 841
    const/16 v2, 0x1d

    .line 842
    .line 843
    aput-object v55, v1, v2

    .line 844
    .line 845
    const/16 v2, 0x1e

    .line 846
    .line 847
    aput-object v56, v1, v2

    .line 848
    .line 849
    const/16 v2, 0x1f

    .line 850
    .line 851
    aput-object v57, v1, v2

    .line 852
    .line 853
    const/16 v2, 0x20

    .line 854
    .line 855
    aput-object v58, v1, v2

    .line 856
    .line 857
    const/16 v2, 0x21

    .line 858
    .line 859
    aput-object v59, v1, v2

    .line 860
    .line 861
    const/16 v2, 0x22

    .line 862
    .line 863
    aput-object v60, v1, v2

    .line 864
    .line 865
    const/16 v2, 0x23

    .line 866
    .line 867
    aput-object v61, v1, v2

    .line 868
    .line 869
    const/16 v2, 0x24

    .line 870
    .line 871
    aput-object v62, v1, v2

    .line 872
    .line 873
    const/16 v2, 0x25

    .line 874
    .line 875
    aput-object v63, v1, v2

    .line 876
    .line 877
    const/16 v2, 0x26

    .line 878
    .line 879
    aput-object v64, v1, v2

    .line 880
    .line 881
    const/16 v2, 0x27

    .line 882
    .line 883
    aput-object v65, v1, v2

    .line 884
    .line 885
    const/16 v2, 0x28

    .line 886
    .line 887
    aput-object v66, v1, v2

    .line 888
    .line 889
    const/16 v2, 0x29

    .line 890
    .line 891
    aput-object v67, v1, v2

    .line 892
    .line 893
    const/16 v2, 0x2a

    .line 894
    .line 895
    aput-object v68, v1, v2

    .line 896
    .line 897
    const/16 v2, 0x2b

    .line 898
    .line 899
    aput-object v69, v1, v2

    .line 900
    .line 901
    const/16 v2, 0x2c

    .line 902
    .line 903
    aput-object v70, v1, v2

    .line 904
    .line 905
    const/16 v2, 0x2d

    .line 906
    .line 907
    aput-object v71, v1, v2

    .line 908
    .line 909
    const/16 v2, 0x2e

    .line 910
    .line 911
    aput-object v72, v1, v2

    .line 912
    .line 913
    const/16 v2, 0x2f

    .line 914
    .line 915
    aput-object v73, v1, v2

    .line 916
    .line 917
    const/16 v2, 0x30

    .line 918
    .line 919
    aput-object v74, v1, v2

    .line 920
    .line 921
    const/16 v2, 0x31

    .line 922
    .line 923
    aput-object v75, v1, v2

    .line 924
    .line 925
    const/16 v2, 0x32

    .line 926
    .line 927
    aput-object v76, v1, v2

    .line 928
    .line 929
    const/16 v2, 0x33

    .line 930
    .line 931
    aput-object v77, v1, v2

    .line 932
    .line 933
    const/16 v2, 0x34

    .line 934
    .line 935
    aput-object v78, v1, v2

    .line 936
    .line 937
    const/16 v2, 0x35

    .line 938
    .line 939
    aput-object v79, v1, v2

    .line 940
    .line 941
    const/16 v2, 0x36

    .line 942
    .line 943
    aput-object v80, v1, v2

    .line 944
    .line 945
    const/16 v2, 0x37

    .line 946
    .line 947
    aput-object v81, v1, v2

    .line 948
    .line 949
    const/16 v2, 0x38

    .line 950
    .line 951
    aput-object v82, v1, v2

    .line 952
    .line 953
    const/16 v2, 0x39

    .line 954
    .line 955
    aput-object v0, v1, v2

    .line 956
    .line 957
    sput-object v1, Lcom/moloco/sdk/internal/client_metrics_data/a;->b:[Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 958
    .line 959
    invoke-static {v1}, Lic/d;->t([Ljava/lang/Enum;)Lmf/b;

    .line 960
    .line 961
    .line 962
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lcom/moloco/sdk/internal/client_metrics_data/a;->a:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/moloco/sdk/internal/client_metrics_data/a;
    .locals 1

    .line 1
    const-class v0, Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lcom/moloco/sdk/internal/client_metrics_data/a;
    .locals 1

    .line 1
    sget-object v0, Lcom/moloco/sdk/internal/client_metrics_data/a;->b:[Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/moloco/sdk/internal/client_metrics_data/a;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
