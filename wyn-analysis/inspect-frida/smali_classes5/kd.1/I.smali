.class public final synthetic Lkd/I;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luc/b;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lkd/s;


# direct methods
.method public synthetic constructor <init>(Lkd/s;I)V
    .locals 0

    .line 1
    iput p2, p0, Lkd/I;->a:I

    iput-object p1, p0, Lkd/I;->b:Lkd/s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Lba/a;)V
    .locals 23

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    const-string v3, "null cannot be cast to non-null type kotlin.Boolean"

    .line 8
    .line 9
    const-string v4, "null cannot be cast to non-null type kotlin.Long"

    .line 10
    .line 11
    const-string v5, "null cannot be cast to non-null type kotlin.String"

    .line 12
    .line 13
    const-string v7, "null cannot be cast to non-null type android.webkit.WebView"

    .line 14
    .line 15
    const-string v8, ", Stacktrace: "

    .line 16
    .line 17
    const-string v9, "Cause: "

    .line 18
    .line 19
    const-string v10, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 20
    .line 21
    iget-object v11, v1, Lkd/I;->b:Lkd/s;

    .line 22
    .line 23
    const/4 v12, 0x3

    .line 24
    const/4 v13, 0x2

    .line 25
    const/4 v14, 0x1

    .line 26
    const/4 v15, 0x0

    .line 27
    const/16 v16, 0x0

    .line 28
    .line 29
    iget v6, v1, Lkd/I;->a:I

    .line 30
    .line 31
    packed-switch v6, :pswitch_data_0

    .line 32
    .line 33
    .line 34
    invoke-static {v0, v10}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    check-cast v0, Ljava/util/List;

    .line 38
    .line 39
    invoke-interface {v0, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-static {v3, v7}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    check-cast v3, Landroid/webkit/WebView;

    .line 47
    .line 48
    invoke-interface {v0, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    check-cast v0, Ljava/lang/String;

    .line 56
    .line 57
    :try_start_0
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v3, v0}, Landroid/webkit/WebView;->removeJavascriptInterface(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    invoke-static/range {v16 .. v16}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 64
    .line 65
    .line 66
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 67
    goto :goto_0

    .line 68
    :catchall_0
    move-exception v0

    .line 69
    instance-of v3, v0, Lkd/a;

    .line 70
    .line 71
    if-eqz v3, :cond_0

    .line 72
    .line 73
    check-cast v0, Lkd/a;

    .line 74
    .line 75
    iget-object v3, v0, Lkd/a;->b:Ljava/lang/String;

    .line 76
    .line 77
    iget-object v4, v0, Lkd/a;->c:Ljava/lang/String;

    .line 78
    .line 79
    iget-object v0, v0, Lkd/a;->a:Ljava/lang/String;

    .line 80
    .line 81
    new-array v5, v12, [Ljava/lang/Object;

    .line 82
    .line 83
    aput-object v0, v5, v15

    .line 84
    .line 85
    aput-object v3, v5, v14

    .line 86
    .line 87
    aput-object v4, v5, v13

    .line 88
    .line 89
    invoke-static {v5}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    goto :goto_0

    .line 94
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    invoke-virtual {v0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v4

    .line 106
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 107
    .line 108
    .line 109
    move-result-object v5

    .line 110
    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    invoke-static {v9, v8, v0, v5}, LVa/M6;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    filled-new-array {v3, v4, v0}, [Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    invoke-static {v0}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    :goto_0
    invoke-virtual {v2, v0}, Lba/a;->c(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    return-void

    .line 130
    :pswitch_0
    invoke-static {v0, v10}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    check-cast v0, Ljava/util/List;

    .line 134
    .line 135
    invoke-interface {v0, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v3

    .line 139
    invoke-static {v3, v7}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    check-cast v3, Landroid/webkit/WebView;

    .line 143
    .line 144
    invoke-interface {v0, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    const-string v4, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel"

    .line 149
    .line 150
    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    check-cast v0, Lkd/t;

    .line 154
    .line 155
    :try_start_1
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    iget-object v4, v0, Lkd/t;->a:Ljava/lang/String;

    .line 159
    .line 160
    invoke-virtual {v3, v0, v4}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    invoke-static/range {v16 .. v16}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 164
    .line 165
    .line 166
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 167
    goto :goto_1

    .line 168
    :catchall_1
    move-exception v0

    .line 169
    instance-of v3, v0, Lkd/a;

    .line 170
    .line 171
    if-eqz v3, :cond_1

    .line 172
    .line 173
    check-cast v0, Lkd/a;

    .line 174
    .line 175
    iget-object v3, v0, Lkd/a;->b:Ljava/lang/String;

    .line 176
    .line 177
    iget-object v4, v0, Lkd/a;->c:Ljava/lang/String;

    .line 178
    .line 179
    iget-object v0, v0, Lkd/a;->a:Ljava/lang/String;

    .line 180
    .line 181
    new-array v5, v12, [Ljava/lang/Object;

    .line 182
    .line 183
    aput-object v0, v5, v15

    .line 184
    .line 185
    aput-object v3, v5, v14

    .line 186
    .line 187
    aput-object v4, v5, v13

    .line 188
    .line 189
    invoke-static {v5}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    goto :goto_1

    .line 194
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 195
    .line 196
    .line 197
    move-result-object v3

    .line 198
    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v3

    .line 202
    invoke-virtual {v0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v4

    .line 206
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 207
    .line 208
    .line 209
    move-result-object v5

    .line 210
    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    invoke-static {v9, v8, v0, v5}, LVa/M6;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    filled-new-array {v3, v4, v0}, [Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    invoke-static {v0}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    :goto_1
    invoke-virtual {v2, v0}, Lba/a;->c(Ljava/lang/Object;)V

    .line 227
    .line 228
    .line 229
    return-void

    .line 230
    :pswitch_1
    invoke-static {v0, v10}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    check-cast v0, Ljava/util/List;

    .line 234
    .line 235
    invoke-interface {v0, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v3

    .line 239
    invoke-static {v3, v7}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 240
    .line 241
    .line 242
    check-cast v3, Landroid/webkit/WebView;

    .line 243
    .line 244
    invoke-interface {v0, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    check-cast v0, Landroid/webkit/WebViewClient;

    .line 249
    .line 250
    :try_start_2
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 251
    .line 252
    .line 253
    invoke-virtual {v3, v0}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 254
    .line 255
    .line 256
    invoke-static/range {v16 .. v16}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 257
    .line 258
    .line 259
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 260
    goto :goto_2

    .line 261
    :catchall_2
    move-exception v0

    .line 262
    instance-of v3, v0, Lkd/a;

    .line 263
    .line 264
    if-eqz v3, :cond_2

    .line 265
    .line 266
    check-cast v0, Lkd/a;

    .line 267
    .line 268
    iget-object v3, v0, Lkd/a;->b:Ljava/lang/String;

    .line 269
    .line 270
    iget-object v4, v0, Lkd/a;->c:Ljava/lang/String;

    .line 271
    .line 272
    iget-object v0, v0, Lkd/a;->a:Ljava/lang/String;

    .line 273
    .line 274
    new-array v5, v12, [Ljava/lang/Object;

    .line 275
    .line 276
    aput-object v0, v5, v15

    .line 277
    .line 278
    aput-object v3, v5, v14

    .line 279
    .line 280
    aput-object v4, v5, v13

    .line 281
    .line 282
    invoke-static {v5}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    goto :goto_2

    .line 287
    :cond_2
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 288
    .line 289
    .line 290
    move-result-object v3

    .line 291
    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v3

    .line 295
    invoke-virtual {v0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object v4

    .line 299
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 300
    .line 301
    .line 302
    move-result-object v5

    .line 303
    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object v0

    .line 307
    invoke-static {v9, v8, v0, v5}, LVa/M6;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    move-result-object v0

    .line 311
    filled-new-array {v3, v4, v0}, [Ljava/lang/String;

    .line 312
    .line 313
    .line 314
    move-result-object v0

    .line 315
    invoke-static {v0}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 316
    .line 317
    .line 318
    move-result-object v0

    .line 319
    :goto_2
    invoke-virtual {v2, v0}, Lba/a;->c(Ljava/lang/Object;)V

    .line 320
    .line 321
    .line 322
    return-void

    .line 323
    :pswitch_2
    invoke-static {v0, v10}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 324
    .line 325
    .line 326
    check-cast v0, Ljava/util/List;

    .line 327
    .line 328
    invoke-interface {v0, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    move-result-object v0

    .line 332
    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 333
    .line 334
    .line 335
    check-cast v0, Ljava/lang/Boolean;

    .line 336
    .line 337
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 338
    .line 339
    .line 340
    move-result v0

    .line 341
    :try_start_3
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 342
    .line 343
    .line 344
    invoke-static {v0}, Landroid/webkit/WebView;->setWebContentsDebuggingEnabled(Z)V

    .line 345
    .line 346
    .line 347
    invoke-static/range {v16 .. v16}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 348
    .line 349
    .line 350
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 351
    goto :goto_3

    .line 352
    :catchall_3
    move-exception v0

    .line 353
    instance-of v3, v0, Lkd/a;

    .line 354
    .line 355
    if-eqz v3, :cond_3

    .line 356
    .line 357
    check-cast v0, Lkd/a;

    .line 358
    .line 359
    iget-object v3, v0, Lkd/a;->b:Ljava/lang/String;

    .line 360
    .line 361
    iget-object v4, v0, Lkd/a;->c:Ljava/lang/String;

    .line 362
    .line 363
    iget-object v0, v0, Lkd/a;->a:Ljava/lang/String;

    .line 364
    .line 365
    new-array v5, v12, [Ljava/lang/Object;

    .line 366
    .line 367
    aput-object v0, v5, v15

    .line 368
    .line 369
    aput-object v3, v5, v14

    .line 370
    .line 371
    aput-object v4, v5, v13

    .line 372
    .line 373
    invoke-static {v5}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 374
    .line 375
    .line 376
    move-result-object v0

    .line 377
    goto :goto_3

    .line 378
    :cond_3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 379
    .line 380
    .line 381
    move-result-object v3

    .line 382
    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 383
    .line 384
    .line 385
    move-result-object v3

    .line 386
    invoke-virtual {v0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 387
    .line 388
    .line 389
    move-result-object v4

    .line 390
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 391
    .line 392
    .line 393
    move-result-object v5

    .line 394
    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 395
    .line 396
    .line 397
    move-result-object v0

    .line 398
    invoke-static {v9, v8, v0, v5}, LVa/M6;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 399
    .line 400
    .line 401
    move-result-object v0

    .line 402
    filled-new-array {v3, v4, v0}, [Ljava/lang/String;

    .line 403
    .line 404
    .line 405
    move-result-object v0

    .line 406
    invoke-static {v0}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 407
    .line 408
    .line 409
    move-result-object v0

    .line 410
    :goto_3
    invoke-virtual {v2, v0}, Lba/a;->c(Ljava/lang/Object;)V

    .line 411
    .line 412
    .line 413
    return-void

    .line 414
    :pswitch_3
    invoke-static {v0, v10}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 415
    .line 416
    .line 417
    check-cast v0, Ljava/util/List;

    .line 418
    .line 419
    invoke-interface {v0, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 420
    .line 421
    .line 422
    move-result-object v0

    .line 423
    invoke-static {v0, v7}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 424
    .line 425
    .line 426
    check-cast v0, Landroid/webkit/WebView;

    .line 427
    .line 428
    :try_start_4
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 429
    .line 430
    .line 431
    invoke-virtual {v0}, Landroid/webkit/WebView;->getTitle()Ljava/lang/String;

    .line 432
    .line 433
    .line 434
    move-result-object v0

    .line 435
    invoke-static {v0}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 436
    .line 437
    .line 438
    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 439
    goto :goto_4

    .line 440
    :catchall_4
    move-exception v0

    .line 441
    instance-of v3, v0, Lkd/a;

    .line 442
    .line 443
    if-eqz v3, :cond_4

    .line 444
    .line 445
    check-cast v0, Lkd/a;

    .line 446
    .line 447
    iget-object v3, v0, Lkd/a;->b:Ljava/lang/String;

    .line 448
    .line 449
    iget-object v4, v0, Lkd/a;->c:Ljava/lang/String;

    .line 450
    .line 451
    iget-object v0, v0, Lkd/a;->a:Ljava/lang/String;

    .line 452
    .line 453
    new-array v5, v12, [Ljava/lang/Object;

    .line 454
    .line 455
    aput-object v0, v5, v15

    .line 456
    .line 457
    aput-object v3, v5, v14

    .line 458
    .line 459
    aput-object v4, v5, v13

    .line 460
    .line 461
    invoke-static {v5}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 462
    .line 463
    .line 464
    move-result-object v0

    .line 465
    goto :goto_4

    .line 466
    :cond_4
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 467
    .line 468
    .line 469
    move-result-object v3

    .line 470
    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 471
    .line 472
    .line 473
    move-result-object v3

    .line 474
    invoke-virtual {v0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 475
    .line 476
    .line 477
    move-result-object v4

    .line 478
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 479
    .line 480
    .line 481
    move-result-object v5

    .line 482
    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 483
    .line 484
    .line 485
    move-result-object v0

    .line 486
    invoke-static {v9, v8, v0, v5}, LVa/M6;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 487
    .line 488
    .line 489
    move-result-object v0

    .line 490
    filled-new-array {v3, v4, v0}, [Ljava/lang/String;

    .line 491
    .line 492
    .line 493
    move-result-object v0

    .line 494
    invoke-static {v0}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 495
    .line 496
    .line 497
    move-result-object v0

    .line 498
    :goto_4
    invoke-virtual {v2, v0}, Lba/a;->c(Ljava/lang/Object;)V

    .line 499
    .line 500
    .line 501
    return-void

    .line 502
    :pswitch_4
    invoke-static {v0, v10}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 503
    .line 504
    .line 505
    check-cast v0, Ljava/util/List;

    .line 506
    .line 507
    invoke-interface {v0, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 508
    .line 509
    .line 510
    move-result-object v3

    .line 511
    invoke-static {v3, v7}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 512
    .line 513
    .line 514
    check-cast v3, Landroid/webkit/WebView;

    .line 515
    .line 516
    invoke-interface {v0, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 517
    .line 518
    .line 519
    move-result-object v0

    .line 520
    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 521
    .line 522
    .line 523
    check-cast v0, Ljava/lang/String;

    .line 524
    .line 525
    new-instance v4, Lkd/y;

    .line 526
    .line 527
    invoke-direct {v4, v2, v14}, Lkd/y;-><init>(Lba/a;I)V

    .line 528
    .line 529
    .line 530
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 531
    .line 532
    .line 533
    new-instance v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/bridge/b;

    .line 534
    .line 535
    invoke-direct {v2, v4, v13}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/bridge/b;-><init>(Ljava/lang/Object;I)V

    .line 536
    .line 537
    .line 538
    invoke-virtual {v3, v0, v2}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    .line 539
    .line 540
    .line 541
    return-void

    .line 542
    :pswitch_5
    invoke-static {v0, v10}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 543
    .line 544
    .line 545
    check-cast v0, Ljava/util/List;

    .line 546
    .line 547
    invoke-interface {v0, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 548
    .line 549
    .line 550
    move-result-object v4

    .line 551
    invoke-static {v4, v7}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 552
    .line 553
    .line 554
    check-cast v4, Landroid/webkit/WebView;

    .line 555
    .line 556
    invoke-interface {v0, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 557
    .line 558
    .line 559
    move-result-object v0

    .line 560
    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 561
    .line 562
    .line 563
    check-cast v0, Ljava/lang/Boolean;

    .line 564
    .line 565
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 566
    .line 567
    .line 568
    move-result v0

    .line 569
    :try_start_5
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 570
    .line 571
    .line 572
    invoke-virtual {v4, v0}, Landroid/webkit/WebView;->clearCache(Z)V

    .line 573
    .line 574
    .line 575
    invoke-static/range {v16 .. v16}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 576
    .line 577
    .line 578
    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 579
    goto :goto_5

    .line 580
    :catchall_5
    move-exception v0

    .line 581
    instance-of v3, v0, Lkd/a;

    .line 582
    .line 583
    if-eqz v3, :cond_5

    .line 584
    .line 585
    check-cast v0, Lkd/a;

    .line 586
    .line 587
    iget-object v3, v0, Lkd/a;->b:Ljava/lang/String;

    .line 588
    .line 589
    iget-object v4, v0, Lkd/a;->c:Ljava/lang/String;

    .line 590
    .line 591
    iget-object v0, v0, Lkd/a;->a:Ljava/lang/String;

    .line 592
    .line 593
    new-array v5, v12, [Ljava/lang/Object;

    .line 594
    .line 595
    aput-object v0, v5, v15

    .line 596
    .line 597
    aput-object v3, v5, v14

    .line 598
    .line 599
    aput-object v4, v5, v13

    .line 600
    .line 601
    invoke-static {v5}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 602
    .line 603
    .line 604
    move-result-object v0

    .line 605
    goto :goto_5

    .line 606
    :cond_5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 607
    .line 608
    .line 609
    move-result-object v3

    .line 610
    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 611
    .line 612
    .line 613
    move-result-object v3

    .line 614
    invoke-virtual {v0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 615
    .line 616
    .line 617
    move-result-object v4

    .line 618
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 619
    .line 620
    .line 621
    move-result-object v5

    .line 622
    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 623
    .line 624
    .line 625
    move-result-object v0

    .line 626
    invoke-static {v9, v8, v0, v5}, LVa/M6;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 627
    .line 628
    .line 629
    move-result-object v0

    .line 630
    filled-new-array {v3, v4, v0}, [Ljava/lang/String;

    .line 631
    .line 632
    .line 633
    move-result-object v0

    .line 634
    invoke-static {v0}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 635
    .line 636
    .line 637
    move-result-object v0

    .line 638
    :goto_5
    invoke-virtual {v2, v0}, Lba/a;->c(Ljava/lang/Object;)V

    .line 639
    .line 640
    .line 641
    return-void

    .line 642
    :pswitch_6
    invoke-static {v0, v10}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 643
    .line 644
    .line 645
    check-cast v0, Ljava/util/List;

    .line 646
    .line 647
    invoke-interface {v0, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 648
    .line 649
    .line 650
    move-result-object v0

    .line 651
    invoke-static {v0, v7}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 652
    .line 653
    .line 654
    check-cast v0, Landroid/webkit/WebView;

    .line 655
    .line 656
    :try_start_6
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 657
    .line 658
    .line 659
    invoke-virtual {v0}, Landroid/webkit/WebView;->reload()V

    .line 660
    .line 661
    .line 662
    invoke-static/range {v16 .. v16}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 663
    .line 664
    .line 665
    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    .line 666
    goto :goto_6

    .line 667
    :catchall_6
    move-exception v0

    .line 668
    instance-of v3, v0, Lkd/a;

    .line 669
    .line 670
    if-eqz v3, :cond_6

    .line 671
    .line 672
    check-cast v0, Lkd/a;

    .line 673
    .line 674
    iget-object v3, v0, Lkd/a;->b:Ljava/lang/String;

    .line 675
    .line 676
    iget-object v4, v0, Lkd/a;->c:Ljava/lang/String;

    .line 677
    .line 678
    iget-object v0, v0, Lkd/a;->a:Ljava/lang/String;

    .line 679
    .line 680
    new-array v5, v12, [Ljava/lang/Object;

    .line 681
    .line 682
    aput-object v0, v5, v15

    .line 683
    .line 684
    aput-object v3, v5, v14

    .line 685
    .line 686
    aput-object v4, v5, v13

    .line 687
    .line 688
    invoke-static {v5}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 689
    .line 690
    .line 691
    move-result-object v0

    .line 692
    goto :goto_6

    .line 693
    :cond_6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 694
    .line 695
    .line 696
    move-result-object v3

    .line 697
    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 698
    .line 699
    .line 700
    move-result-object v3

    .line 701
    invoke-virtual {v0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 702
    .line 703
    .line 704
    move-result-object v4

    .line 705
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 706
    .line 707
    .line 708
    move-result-object v5

    .line 709
    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 710
    .line 711
    .line 712
    move-result-object v0

    .line 713
    invoke-static {v9, v8, v0, v5}, LVa/M6;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 714
    .line 715
    .line 716
    move-result-object v0

    .line 717
    filled-new-array {v3, v4, v0}, [Ljava/lang/String;

    .line 718
    .line 719
    .line 720
    move-result-object v0

    .line 721
    invoke-static {v0}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 722
    .line 723
    .line 724
    move-result-object v0

    .line 725
    :goto_6
    invoke-virtual {v2, v0}, Lba/a;->c(Ljava/lang/Object;)V

    .line 726
    .line 727
    .line 728
    return-void

    .line 729
    :pswitch_7
    invoke-static {v0, v10}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 730
    .line 731
    .line 732
    check-cast v0, Ljava/util/List;

    .line 733
    .line 734
    invoke-interface {v0, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 735
    .line 736
    .line 737
    move-result-object v0

    .line 738
    invoke-static {v0, v7}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 739
    .line 740
    .line 741
    check-cast v0, Landroid/webkit/WebView;

    .line 742
    .line 743
    :try_start_7
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 744
    .line 745
    .line 746
    invoke-virtual {v0}, Landroid/webkit/WebView;->goBack()V

    .line 747
    .line 748
    .line 749
    invoke-static/range {v16 .. v16}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 750
    .line 751
    .line 752
    move-result-object v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    .line 753
    goto :goto_7

    .line 754
    :catchall_7
    move-exception v0

    .line 755
    instance-of v3, v0, Lkd/a;

    .line 756
    .line 757
    if-eqz v3, :cond_7

    .line 758
    .line 759
    check-cast v0, Lkd/a;

    .line 760
    .line 761
    iget-object v3, v0, Lkd/a;->b:Ljava/lang/String;

    .line 762
    .line 763
    iget-object v4, v0, Lkd/a;->c:Ljava/lang/String;

    .line 764
    .line 765
    iget-object v0, v0, Lkd/a;->a:Ljava/lang/String;

    .line 766
    .line 767
    new-array v5, v12, [Ljava/lang/Object;

    .line 768
    .line 769
    aput-object v0, v5, v15

    .line 770
    .line 771
    aput-object v3, v5, v14

    .line 772
    .line 773
    aput-object v4, v5, v13

    .line 774
    .line 775
    invoke-static {v5}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 776
    .line 777
    .line 778
    move-result-object v0

    .line 779
    goto :goto_7

    .line 780
    :cond_7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 781
    .line 782
    .line 783
    move-result-object v3

    .line 784
    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 785
    .line 786
    .line 787
    move-result-object v3

    .line 788
    invoke-virtual {v0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 789
    .line 790
    .line 791
    move-result-object v4

    .line 792
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 793
    .line 794
    .line 795
    move-result-object v5

    .line 796
    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 797
    .line 798
    .line 799
    move-result-object v0

    .line 800
    invoke-static {v9, v8, v0, v5}, LVa/M6;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 801
    .line 802
    .line 803
    move-result-object v0

    .line 804
    filled-new-array {v3, v4, v0}, [Ljava/lang/String;

    .line 805
    .line 806
    .line 807
    move-result-object v0

    .line 808
    invoke-static {v0}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 809
    .line 810
    .line 811
    move-result-object v0

    .line 812
    :goto_7
    invoke-virtual {v2, v0}, Lba/a;->c(Ljava/lang/Object;)V

    .line 813
    .line 814
    .line 815
    return-void

    .line 816
    :pswitch_8
    invoke-static {v0, v10}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 817
    .line 818
    .line 819
    check-cast v0, Ljava/util/List;

    .line 820
    .line 821
    invoke-interface {v0, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 822
    .line 823
    .line 824
    move-result-object v0

    .line 825
    invoke-static {v0, v7}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 826
    .line 827
    .line 828
    check-cast v0, Landroid/webkit/WebView;

    .line 829
    .line 830
    :try_start_8
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 831
    .line 832
    .line 833
    invoke-virtual {v0}, Landroid/webkit/WebView;->canGoForward()Z

    .line 834
    .line 835
    .line 836
    move-result v0

    .line 837
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 838
    .line 839
    .line 840
    move-result-object v0

    .line 841
    invoke-static {v0}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 842
    .line 843
    .line 844
    move-result-object v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_8

    .line 845
    goto :goto_8

    .line 846
    :catchall_8
    move-exception v0

    .line 847
    instance-of v3, v0, Lkd/a;

    .line 848
    .line 849
    if-eqz v3, :cond_8

    .line 850
    .line 851
    check-cast v0, Lkd/a;

    .line 852
    .line 853
    iget-object v3, v0, Lkd/a;->b:Ljava/lang/String;

    .line 854
    .line 855
    iget-object v4, v0, Lkd/a;->c:Ljava/lang/String;

    .line 856
    .line 857
    iget-object v0, v0, Lkd/a;->a:Ljava/lang/String;

    .line 858
    .line 859
    new-array v5, v12, [Ljava/lang/Object;

    .line 860
    .line 861
    aput-object v0, v5, v15

    .line 862
    .line 863
    aput-object v3, v5, v14

    .line 864
    .line 865
    aput-object v4, v5, v13

    .line 866
    .line 867
    invoke-static {v5}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 868
    .line 869
    .line 870
    move-result-object v0

    .line 871
    goto :goto_8

    .line 872
    :cond_8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 873
    .line 874
    .line 875
    move-result-object v3

    .line 876
    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 877
    .line 878
    .line 879
    move-result-object v3

    .line 880
    invoke-virtual {v0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 881
    .line 882
    .line 883
    move-result-object v4

    .line 884
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 885
    .line 886
    .line 887
    move-result-object v5

    .line 888
    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 889
    .line 890
    .line 891
    move-result-object v0

    .line 892
    invoke-static {v9, v8, v0, v5}, LVa/M6;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 893
    .line 894
    .line 895
    move-result-object v0

    .line 896
    filled-new-array {v3, v4, v0}, [Ljava/lang/String;

    .line 897
    .line 898
    .line 899
    move-result-object v0

    .line 900
    invoke-static {v0}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 901
    .line 902
    .line 903
    move-result-object v0

    .line 904
    :goto_8
    invoke-virtual {v2, v0}, Lba/a;->c(Ljava/lang/Object;)V

    .line 905
    .line 906
    .line 907
    return-void

    .line 908
    :pswitch_9
    invoke-static {v0, v10}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 909
    .line 910
    .line 911
    check-cast v0, Ljava/util/List;

    .line 912
    .line 913
    invoke-interface {v0, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 914
    .line 915
    .line 916
    move-result-object v0

    .line 917
    invoke-static {v0, v7}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 918
    .line 919
    .line 920
    check-cast v0, Landroid/webkit/WebView;

    .line 921
    .line 922
    :try_start_9
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 923
    .line 924
    .line 925
    invoke-virtual {v0}, Landroid/webkit/WebView;->canGoBack()Z

    .line 926
    .line 927
    .line 928
    move-result v0

    .line 929
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 930
    .line 931
    .line 932
    move-result-object v0

    .line 933
    invoke-static {v0}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 934
    .line 935
    .line 936
    move-result-object v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_9

    .line 937
    goto :goto_9

    .line 938
    :catchall_9
    move-exception v0

    .line 939
    instance-of v3, v0, Lkd/a;

    .line 940
    .line 941
    if-eqz v3, :cond_9

    .line 942
    .line 943
    check-cast v0, Lkd/a;

    .line 944
    .line 945
    iget-object v3, v0, Lkd/a;->b:Ljava/lang/String;

    .line 946
    .line 947
    iget-object v4, v0, Lkd/a;->c:Ljava/lang/String;

    .line 948
    .line 949
    iget-object v0, v0, Lkd/a;->a:Ljava/lang/String;

    .line 950
    .line 951
    new-array v5, v12, [Ljava/lang/Object;

    .line 952
    .line 953
    aput-object v0, v5, v15

    .line 954
    .line 955
    aput-object v3, v5, v14

    .line 956
    .line 957
    aput-object v4, v5, v13

    .line 958
    .line 959
    invoke-static {v5}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 960
    .line 961
    .line 962
    move-result-object v0

    .line 963
    goto :goto_9

    .line 964
    :cond_9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 965
    .line 966
    .line 967
    move-result-object v3

    .line 968
    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 969
    .line 970
    .line 971
    move-result-object v3

    .line 972
    invoke-virtual {v0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 973
    .line 974
    .line 975
    move-result-object v4

    .line 976
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 977
    .line 978
    .line 979
    move-result-object v5

    .line 980
    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 981
    .line 982
    .line 983
    move-result-object v0

    .line 984
    invoke-static {v9, v8, v0, v5}, LVa/M6;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 985
    .line 986
    .line 987
    move-result-object v0

    .line 988
    filled-new-array {v3, v4, v0}, [Ljava/lang/String;

    .line 989
    .line 990
    .line 991
    move-result-object v0

    .line 992
    invoke-static {v0}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 993
    .line 994
    .line 995
    move-result-object v0

    .line 996
    :goto_9
    invoke-virtual {v2, v0}, Lba/a;->c(Ljava/lang/Object;)V

    .line 997
    .line 998
    .line 999
    return-void

    .line 1000
    :pswitch_a
    invoke-static {v0, v10}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1001
    .line 1002
    .line 1003
    check-cast v0, Ljava/util/List;

    .line 1004
    .line 1005
    invoke-interface {v0, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1006
    .line 1007
    .line 1008
    move-result-object v0

    .line 1009
    invoke-static {v0, v7}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1010
    .line 1011
    .line 1012
    check-cast v0, Landroid/webkit/WebView;

    .line 1013
    .line 1014
    :try_start_a
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1015
    .line 1016
    .line 1017
    invoke-virtual {v0}, Landroid/webkit/WebView;->goForward()V

    .line 1018
    .line 1019
    .line 1020
    invoke-static/range {v16 .. v16}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 1021
    .line 1022
    .line 1023
    move-result-object v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_a

    .line 1024
    goto :goto_a

    .line 1025
    :catchall_a
    move-exception v0

    .line 1026
    instance-of v3, v0, Lkd/a;

    .line 1027
    .line 1028
    if-eqz v3, :cond_a

    .line 1029
    .line 1030
    check-cast v0, Lkd/a;

    .line 1031
    .line 1032
    iget-object v3, v0, Lkd/a;->b:Ljava/lang/String;

    .line 1033
    .line 1034
    iget-object v4, v0, Lkd/a;->c:Ljava/lang/String;

    .line 1035
    .line 1036
    iget-object v0, v0, Lkd/a;->a:Ljava/lang/String;

    .line 1037
    .line 1038
    new-array v5, v12, [Ljava/lang/Object;

    .line 1039
    .line 1040
    aput-object v0, v5, v15

    .line 1041
    .line 1042
    aput-object v3, v5, v14

    .line 1043
    .line 1044
    aput-object v4, v5, v13

    .line 1045
    .line 1046
    invoke-static {v5}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 1047
    .line 1048
    .line 1049
    move-result-object v0

    .line 1050
    goto :goto_a

    .line 1051
    :cond_a
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1052
    .line 1053
    .line 1054
    move-result-object v3

    .line 1055
    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 1056
    .line 1057
    .line 1058
    move-result-object v3

    .line 1059
    invoke-virtual {v0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 1060
    .line 1061
    .line 1062
    move-result-object v4

    .line 1063
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 1064
    .line 1065
    .line 1066
    move-result-object v5

    .line 1067
    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 1068
    .line 1069
    .line 1070
    move-result-object v0

    .line 1071
    invoke-static {v9, v8, v0, v5}, LVa/M6;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 1072
    .line 1073
    .line 1074
    move-result-object v0

    .line 1075
    filled-new-array {v3, v4, v0}, [Ljava/lang/String;

    .line 1076
    .line 1077
    .line 1078
    move-result-object v0

    .line 1079
    invoke-static {v0}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 1080
    .line 1081
    .line 1082
    move-result-object v0

    .line 1083
    :goto_a
    invoke-virtual {v2, v0}, Lba/a;->c(Ljava/lang/Object;)V

    .line 1084
    .line 1085
    .line 1086
    return-void

    .line 1087
    :pswitch_b
    invoke-static {v0, v10}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1088
    .line 1089
    .line 1090
    check-cast v0, Ljava/util/List;

    .line 1091
    .line 1092
    invoke-interface {v0, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1093
    .line 1094
    .line 1095
    move-result-object v0

    .line 1096
    invoke-static {v0, v7}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1097
    .line 1098
    .line 1099
    check-cast v0, Landroid/webkit/WebView;

    .line 1100
    .line 1101
    :try_start_b
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1102
    .line 1103
    .line 1104
    invoke-virtual {v0}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    .line 1105
    .line 1106
    .line 1107
    move-result-object v0

    .line 1108
    invoke-static {v0}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 1109
    .line 1110
    .line 1111
    move-result-object v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_b

    .line 1112
    goto :goto_b

    .line 1113
    :catchall_b
    move-exception v0

    .line 1114
    instance-of v3, v0, Lkd/a;

    .line 1115
    .line 1116
    if-eqz v3, :cond_b

    .line 1117
    .line 1118
    check-cast v0, Lkd/a;

    .line 1119
    .line 1120
    iget-object v3, v0, Lkd/a;->b:Ljava/lang/String;

    .line 1121
    .line 1122
    iget-object v4, v0, Lkd/a;->c:Ljava/lang/String;

    .line 1123
    .line 1124
    iget-object v0, v0, Lkd/a;->a:Ljava/lang/String;

    .line 1125
    .line 1126
    new-array v5, v12, [Ljava/lang/Object;

    .line 1127
    .line 1128
    aput-object v0, v5, v15

    .line 1129
    .line 1130
    aput-object v3, v5, v14

    .line 1131
    .line 1132
    aput-object v4, v5, v13

    .line 1133
    .line 1134
    invoke-static {v5}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 1135
    .line 1136
    .line 1137
    move-result-object v0

    .line 1138
    goto :goto_b

    .line 1139
    :cond_b
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1140
    .line 1141
    .line 1142
    move-result-object v3

    .line 1143
    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 1144
    .line 1145
    .line 1146
    move-result-object v3

    .line 1147
    invoke-virtual {v0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 1148
    .line 1149
    .line 1150
    move-result-object v4

    .line 1151
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 1152
    .line 1153
    .line 1154
    move-result-object v5

    .line 1155
    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 1156
    .line 1157
    .line 1158
    move-result-object v0

    .line 1159
    invoke-static {v9, v8, v0, v5}, LVa/M6;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 1160
    .line 1161
    .line 1162
    move-result-object v0

    .line 1163
    filled-new-array {v3, v4, v0}, [Ljava/lang/String;

    .line 1164
    .line 1165
    .line 1166
    move-result-object v0

    .line 1167
    invoke-static {v0}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 1168
    .line 1169
    .line 1170
    move-result-object v0

    .line 1171
    :goto_b
    invoke-virtual {v2, v0}, Lba/a;->c(Ljava/lang/Object;)V

    .line 1172
    .line 1173
    .line 1174
    return-void

    .line 1175
    :pswitch_c
    invoke-static {v0, v10}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1176
    .line 1177
    .line 1178
    check-cast v0, Ljava/util/List;

    .line 1179
    .line 1180
    invoke-interface {v0, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1181
    .line 1182
    .line 1183
    move-result-object v3

    .line 1184
    invoke-static {v3, v7}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1185
    .line 1186
    .line 1187
    check-cast v3, Landroid/webkit/WebView;

    .line 1188
    .line 1189
    invoke-interface {v0, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1190
    .line 1191
    .line 1192
    move-result-object v4

    .line 1193
    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1194
    .line 1195
    .line 1196
    check-cast v4, Ljava/lang/String;

    .line 1197
    .line 1198
    invoke-interface {v0, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1199
    .line 1200
    .line 1201
    move-result-object v0

    .line 1202
    const-string v5, "null cannot be cast to non-null type kotlin.ByteArray"

    .line 1203
    .line 1204
    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1205
    .line 1206
    .line 1207
    check-cast v0, [B

    .line 1208
    .line 1209
    :try_start_c
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1210
    .line 1211
    .line 1212
    invoke-virtual {v3, v4, v0}, Landroid/webkit/WebView;->postUrl(Ljava/lang/String;[B)V

    .line 1213
    .line 1214
    .line 1215
    invoke-static/range {v16 .. v16}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 1216
    .line 1217
    .line 1218
    move-result-object v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_c

    .line 1219
    goto :goto_c

    .line 1220
    :catchall_c
    move-exception v0

    .line 1221
    instance-of v3, v0, Lkd/a;

    .line 1222
    .line 1223
    if-eqz v3, :cond_c

    .line 1224
    .line 1225
    check-cast v0, Lkd/a;

    .line 1226
    .line 1227
    iget-object v3, v0, Lkd/a;->b:Ljava/lang/String;

    .line 1228
    .line 1229
    iget-object v4, v0, Lkd/a;->c:Ljava/lang/String;

    .line 1230
    .line 1231
    iget-object v0, v0, Lkd/a;->a:Ljava/lang/String;

    .line 1232
    .line 1233
    new-array v5, v12, [Ljava/lang/Object;

    .line 1234
    .line 1235
    aput-object v0, v5, v15

    .line 1236
    .line 1237
    aput-object v3, v5, v14

    .line 1238
    .line 1239
    aput-object v4, v5, v13

    .line 1240
    .line 1241
    invoke-static {v5}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 1242
    .line 1243
    .line 1244
    move-result-object v0

    .line 1245
    goto :goto_c

    .line 1246
    :cond_c
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1247
    .line 1248
    .line 1249
    move-result-object v3

    .line 1250
    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 1251
    .line 1252
    .line 1253
    move-result-object v3

    .line 1254
    invoke-virtual {v0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 1255
    .line 1256
    .line 1257
    move-result-object v4

    .line 1258
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 1259
    .line 1260
    .line 1261
    move-result-object v5

    .line 1262
    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 1263
    .line 1264
    .line 1265
    move-result-object v0

    .line 1266
    invoke-static {v9, v8, v0, v5}, LVa/M6;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 1267
    .line 1268
    .line 1269
    move-result-object v0

    .line 1270
    filled-new-array {v3, v4, v0}, [Ljava/lang/String;

    .line 1271
    .line 1272
    .line 1273
    move-result-object v0

    .line 1274
    invoke-static {v0}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 1275
    .line 1276
    .line 1277
    move-result-object v0

    .line 1278
    :goto_c
    invoke-virtual {v2, v0}, Lba/a;->c(Ljava/lang/Object;)V

    .line 1279
    .line 1280
    .line 1281
    return-void

    .line 1282
    :pswitch_d
    invoke-static {v0, v10}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1283
    .line 1284
    .line 1285
    check-cast v0, Ljava/util/List;

    .line 1286
    .line 1287
    invoke-interface {v0, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1288
    .line 1289
    .line 1290
    move-result-object v3

    .line 1291
    invoke-static {v3, v7}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1292
    .line 1293
    .line 1294
    check-cast v3, Landroid/webkit/WebView;

    .line 1295
    .line 1296
    invoke-interface {v0, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1297
    .line 1298
    .line 1299
    move-result-object v4

    .line 1300
    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1301
    .line 1302
    .line 1303
    check-cast v4, Ljava/lang/String;

    .line 1304
    .line 1305
    invoke-interface {v0, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1306
    .line 1307
    .line 1308
    move-result-object v0

    .line 1309
    const-string v5, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>"

    .line 1310
    .line 1311
    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1312
    .line 1313
    .line 1314
    check-cast v0, Ljava/util/Map;

    .line 1315
    .line 1316
    :try_start_d
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1317
    .line 1318
    .line 1319
    invoke-virtual {v3, v4, v0}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;Ljava/util/Map;)V

    .line 1320
    .line 1321
    .line 1322
    invoke-static/range {v16 .. v16}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 1323
    .line 1324
    .line 1325
    move-result-object v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_d

    .line 1326
    goto :goto_d

    .line 1327
    :catchall_d
    move-exception v0

    .line 1328
    instance-of v3, v0, Lkd/a;

    .line 1329
    .line 1330
    if-eqz v3, :cond_d

    .line 1331
    .line 1332
    check-cast v0, Lkd/a;

    .line 1333
    .line 1334
    iget-object v3, v0, Lkd/a;->b:Ljava/lang/String;

    .line 1335
    .line 1336
    iget-object v4, v0, Lkd/a;->c:Ljava/lang/String;

    .line 1337
    .line 1338
    iget-object v0, v0, Lkd/a;->a:Ljava/lang/String;

    .line 1339
    .line 1340
    new-array v5, v12, [Ljava/lang/Object;

    .line 1341
    .line 1342
    aput-object v0, v5, v15

    .line 1343
    .line 1344
    aput-object v3, v5, v14

    .line 1345
    .line 1346
    aput-object v4, v5, v13

    .line 1347
    .line 1348
    invoke-static {v5}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 1349
    .line 1350
    .line 1351
    move-result-object v0

    .line 1352
    goto :goto_d

    .line 1353
    :cond_d
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1354
    .line 1355
    .line 1356
    move-result-object v3

    .line 1357
    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 1358
    .line 1359
    .line 1360
    move-result-object v3

    .line 1361
    invoke-virtual {v0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 1362
    .line 1363
    .line 1364
    move-result-object v4

    .line 1365
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 1366
    .line 1367
    .line 1368
    move-result-object v5

    .line 1369
    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 1370
    .line 1371
    .line 1372
    move-result-object v0

    .line 1373
    invoke-static {v9, v8, v0, v5}, LVa/M6;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 1374
    .line 1375
    .line 1376
    move-result-object v0

    .line 1377
    filled-new-array {v3, v4, v0}, [Ljava/lang/String;

    .line 1378
    .line 1379
    .line 1380
    move-result-object v0

    .line 1381
    invoke-static {v0}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 1382
    .line 1383
    .line 1384
    move-result-object v0

    .line 1385
    :goto_d
    invoke-virtual {v2, v0}, Lba/a;->c(Ljava/lang/Object;)V

    .line 1386
    .line 1387
    .line 1388
    return-void

    .line 1389
    :pswitch_e
    invoke-static {v0, v10}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1390
    .line 1391
    .line 1392
    check-cast v0, Ljava/util/List;

    .line 1393
    .line 1394
    invoke-interface {v0, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1395
    .line 1396
    .line 1397
    move-result-object v3

    .line 1398
    invoke-static {v3, v7}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1399
    .line 1400
    .line 1401
    move-object/from16 v17, v3

    .line 1402
    .line 1403
    check-cast v17, Landroid/webkit/WebView;

    .line 1404
    .line 1405
    invoke-interface {v0, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1406
    .line 1407
    .line 1408
    move-result-object v3

    .line 1409
    move-object/from16 v18, v3

    .line 1410
    .line 1411
    check-cast v18, Ljava/lang/String;

    .line 1412
    .line 1413
    invoke-interface {v0, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1414
    .line 1415
    .line 1416
    move-result-object v3

    .line 1417
    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1418
    .line 1419
    .line 1420
    move-object/from16 v19, v3

    .line 1421
    .line 1422
    check-cast v19, Ljava/lang/String;

    .line 1423
    .line 1424
    invoke-interface {v0, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1425
    .line 1426
    .line 1427
    move-result-object v3

    .line 1428
    move-object/from16 v20, v3

    .line 1429
    .line 1430
    check-cast v20, Ljava/lang/String;

    .line 1431
    .line 1432
    const/4 v3, 0x4

    .line 1433
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1434
    .line 1435
    .line 1436
    move-result-object v3

    .line 1437
    move-object/from16 v21, v3

    .line 1438
    .line 1439
    check-cast v21, Ljava/lang/String;

    .line 1440
    .line 1441
    const/4 v3, 0x5

    .line 1442
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1443
    .line 1444
    .line 1445
    move-result-object v0

    .line 1446
    move-object/from16 v22, v0

    .line 1447
    .line 1448
    check-cast v22, Ljava/lang/String;

    .line 1449
    .line 1450
    :try_start_e
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1451
    .line 1452
    .line 1453
    invoke-virtual/range {v17 .. v22}, Landroid/webkit/WebView;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1454
    .line 1455
    .line 1456
    invoke-static/range {v16 .. v16}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 1457
    .line 1458
    .line 1459
    move-result-object v0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_e

    .line 1460
    goto :goto_e

    .line 1461
    :catchall_e
    move-exception v0

    .line 1462
    instance-of v3, v0, Lkd/a;

    .line 1463
    .line 1464
    if-eqz v3, :cond_e

    .line 1465
    .line 1466
    check-cast v0, Lkd/a;

    .line 1467
    .line 1468
    iget-object v3, v0, Lkd/a;->b:Ljava/lang/String;

    .line 1469
    .line 1470
    iget-object v4, v0, Lkd/a;->c:Ljava/lang/String;

    .line 1471
    .line 1472
    iget-object v0, v0, Lkd/a;->a:Ljava/lang/String;

    .line 1473
    .line 1474
    new-array v5, v12, [Ljava/lang/Object;

    .line 1475
    .line 1476
    aput-object v0, v5, v15

    .line 1477
    .line 1478
    aput-object v3, v5, v14

    .line 1479
    .line 1480
    aput-object v4, v5, v13

    .line 1481
    .line 1482
    invoke-static {v5}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 1483
    .line 1484
    .line 1485
    move-result-object v0

    .line 1486
    goto :goto_e

    .line 1487
    :cond_e
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1488
    .line 1489
    .line 1490
    move-result-object v3

    .line 1491
    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 1492
    .line 1493
    .line 1494
    move-result-object v3

    .line 1495
    invoke-virtual {v0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 1496
    .line 1497
    .line 1498
    move-result-object v4

    .line 1499
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 1500
    .line 1501
    .line 1502
    move-result-object v5

    .line 1503
    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 1504
    .line 1505
    .line 1506
    move-result-object v0

    .line 1507
    invoke-static {v9, v8, v0, v5}, LVa/M6;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 1508
    .line 1509
    .line 1510
    move-result-object v0

    .line 1511
    filled-new-array {v3, v4, v0}, [Ljava/lang/String;

    .line 1512
    .line 1513
    .line 1514
    move-result-object v0

    .line 1515
    invoke-static {v0}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 1516
    .line 1517
    .line 1518
    move-result-object v0

    .line 1519
    :goto_e
    invoke-virtual {v2, v0}, Lba/a;->c(Ljava/lang/Object;)V

    .line 1520
    .line 1521
    .line 1522
    return-void

    .line 1523
    :pswitch_f
    invoke-static {v0, v10}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1524
    .line 1525
    .line 1526
    check-cast v0, Ljava/util/List;

    .line 1527
    .line 1528
    invoke-interface {v0, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1529
    .line 1530
    .line 1531
    move-result-object v3

    .line 1532
    invoke-static {v3, v7}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1533
    .line 1534
    .line 1535
    check-cast v3, Landroid/webkit/WebView;

    .line 1536
    .line 1537
    invoke-interface {v0, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1538
    .line 1539
    .line 1540
    move-result-object v4

    .line 1541
    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1542
    .line 1543
    .line 1544
    check-cast v4, Ljava/lang/String;

    .line 1545
    .line 1546
    invoke-interface {v0, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1547
    .line 1548
    .line 1549
    move-result-object v5

    .line 1550
    check-cast v5, Ljava/lang/String;

    .line 1551
    .line 1552
    invoke-interface {v0, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1553
    .line 1554
    .line 1555
    move-result-object v0

    .line 1556
    check-cast v0, Ljava/lang/String;

    .line 1557
    .line 1558
    :try_start_f
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1559
    .line 1560
    .line 1561
    invoke-virtual {v3, v4, v5, v0}, Landroid/webkit/WebView;->loadData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1562
    .line 1563
    .line 1564
    invoke-static/range {v16 .. v16}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 1565
    .line 1566
    .line 1567
    move-result-object v0
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_f

    .line 1568
    goto :goto_f

    .line 1569
    :catchall_f
    move-exception v0

    .line 1570
    instance-of v3, v0, Lkd/a;

    .line 1571
    .line 1572
    if-eqz v3, :cond_f

    .line 1573
    .line 1574
    check-cast v0, Lkd/a;

    .line 1575
    .line 1576
    iget-object v3, v0, Lkd/a;->b:Ljava/lang/String;

    .line 1577
    .line 1578
    iget-object v4, v0, Lkd/a;->c:Ljava/lang/String;

    .line 1579
    .line 1580
    iget-object v0, v0, Lkd/a;->a:Ljava/lang/String;

    .line 1581
    .line 1582
    new-array v5, v12, [Ljava/lang/Object;

    .line 1583
    .line 1584
    aput-object v0, v5, v15

    .line 1585
    .line 1586
    aput-object v3, v5, v14

    .line 1587
    .line 1588
    aput-object v4, v5, v13

    .line 1589
    .line 1590
    invoke-static {v5}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 1591
    .line 1592
    .line 1593
    move-result-object v0

    .line 1594
    goto :goto_f

    .line 1595
    :cond_f
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1596
    .line 1597
    .line 1598
    move-result-object v3

    .line 1599
    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 1600
    .line 1601
    .line 1602
    move-result-object v3

    .line 1603
    invoke-virtual {v0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 1604
    .line 1605
    .line 1606
    move-result-object v4

    .line 1607
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 1608
    .line 1609
    .line 1610
    move-result-object v5

    .line 1611
    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 1612
    .line 1613
    .line 1614
    move-result-object v0

    .line 1615
    invoke-static {v9, v8, v0, v5}, LVa/M6;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 1616
    .line 1617
    .line 1618
    move-result-object v0

    .line 1619
    filled-new-array {v3, v4, v0}, [Ljava/lang/String;

    .line 1620
    .line 1621
    .line 1622
    move-result-object v0

    .line 1623
    invoke-static {v0}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 1624
    .line 1625
    .line 1626
    move-result-object v0

    .line 1627
    :goto_f
    invoke-virtual {v2, v0}, Lba/a;->c(Ljava/lang/Object;)V

    .line 1628
    .line 1629
    .line 1630
    return-void

    .line 1631
    :pswitch_10
    invoke-static {v0, v10}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1632
    .line 1633
    .line 1634
    check-cast v0, Ljava/util/List;

    .line 1635
    .line 1636
    invoke-interface {v0, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1637
    .line 1638
    .line 1639
    move-result-object v0

    .line 1640
    invoke-static {v0, v7}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1641
    .line 1642
    .line 1643
    check-cast v0, Landroid/webkit/WebView;

    .line 1644
    .line 1645
    :try_start_10
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1646
    .line 1647
    .line 1648
    invoke-virtual {v0}, Landroid/webkit/WebView;->destroy()V

    .line 1649
    .line 1650
    .line 1651
    invoke-static/range {v16 .. v16}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 1652
    .line 1653
    .line 1654
    move-result-object v0
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_10

    .line 1655
    goto :goto_10

    .line 1656
    :catchall_10
    move-exception v0

    .line 1657
    instance-of v3, v0, Lkd/a;

    .line 1658
    .line 1659
    if-eqz v3, :cond_10

    .line 1660
    .line 1661
    check-cast v0, Lkd/a;

    .line 1662
    .line 1663
    iget-object v3, v0, Lkd/a;->b:Ljava/lang/String;

    .line 1664
    .line 1665
    iget-object v4, v0, Lkd/a;->c:Ljava/lang/String;

    .line 1666
    .line 1667
    iget-object v0, v0, Lkd/a;->a:Ljava/lang/String;

    .line 1668
    .line 1669
    new-array v5, v12, [Ljava/lang/Object;

    .line 1670
    .line 1671
    aput-object v0, v5, v15

    .line 1672
    .line 1673
    aput-object v3, v5, v14

    .line 1674
    .line 1675
    aput-object v4, v5, v13

    .line 1676
    .line 1677
    invoke-static {v5}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 1678
    .line 1679
    .line 1680
    move-result-object v0

    .line 1681
    goto :goto_10

    .line 1682
    :cond_10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1683
    .line 1684
    .line 1685
    move-result-object v3

    .line 1686
    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 1687
    .line 1688
    .line 1689
    move-result-object v3

    .line 1690
    invoke-virtual {v0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 1691
    .line 1692
    .line 1693
    move-result-object v4

    .line 1694
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 1695
    .line 1696
    .line 1697
    move-result-object v5

    .line 1698
    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 1699
    .line 1700
    .line 1701
    move-result-object v0

    .line 1702
    invoke-static {v9, v8, v0, v5}, LVa/M6;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 1703
    .line 1704
    .line 1705
    move-result-object v0

    .line 1706
    filled-new-array {v3, v4, v0}, [Ljava/lang/String;

    .line 1707
    .line 1708
    .line 1709
    move-result-object v0

    .line 1710
    invoke-static {v0}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 1711
    .line 1712
    .line 1713
    move-result-object v0

    .line 1714
    :goto_10
    invoke-virtual {v2, v0}, Lba/a;->c(Ljava/lang/Object;)V

    .line 1715
    .line 1716
    .line 1717
    return-void

    .line 1718
    :pswitch_11
    invoke-static {v0, v10}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1719
    .line 1720
    .line 1721
    check-cast v0, Ljava/util/List;

    .line 1722
    .line 1723
    invoke-interface {v0, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1724
    .line 1725
    .line 1726
    move-result-object v3

    .line 1727
    invoke-static {v3, v7}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1728
    .line 1729
    .line 1730
    check-cast v3, Landroid/webkit/WebView;

    .line 1731
    .line 1732
    invoke-interface {v0, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1733
    .line 1734
    .line 1735
    move-result-object v0

    .line 1736
    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1737
    .line 1738
    .line 1739
    check-cast v0, Ljava/lang/Long;

    .line 1740
    .line 1741
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 1742
    .line 1743
    .line 1744
    move-result-wide v4

    .line 1745
    :try_start_11
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1746
    .line 1747
    .line 1748
    long-to-int v0, v4

    .line 1749
    invoke-virtual {v3, v0}, Landroid/webkit/WebView;->setBackgroundColor(I)V

    .line 1750
    .line 1751
    .line 1752
    invoke-static/range {v16 .. v16}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 1753
    .line 1754
    .line 1755
    move-result-object v0
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_11

    .line 1756
    goto :goto_11

    .line 1757
    :catchall_11
    move-exception v0

    .line 1758
    instance-of v3, v0, Lkd/a;

    .line 1759
    .line 1760
    if-eqz v3, :cond_11

    .line 1761
    .line 1762
    check-cast v0, Lkd/a;

    .line 1763
    .line 1764
    iget-object v3, v0, Lkd/a;->b:Ljava/lang/String;

    .line 1765
    .line 1766
    iget-object v4, v0, Lkd/a;->c:Ljava/lang/String;

    .line 1767
    .line 1768
    iget-object v0, v0, Lkd/a;->a:Ljava/lang/String;

    .line 1769
    .line 1770
    new-array v5, v12, [Ljava/lang/Object;

    .line 1771
    .line 1772
    aput-object v0, v5, v15

    .line 1773
    .line 1774
    aput-object v3, v5, v14

    .line 1775
    .line 1776
    aput-object v4, v5, v13

    .line 1777
    .line 1778
    invoke-static {v5}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 1779
    .line 1780
    .line 1781
    move-result-object v0

    .line 1782
    goto :goto_11

    .line 1783
    :cond_11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1784
    .line 1785
    .line 1786
    move-result-object v3

    .line 1787
    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 1788
    .line 1789
    .line 1790
    move-result-object v3

    .line 1791
    invoke-virtual {v0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 1792
    .line 1793
    .line 1794
    move-result-object v4

    .line 1795
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 1796
    .line 1797
    .line 1798
    move-result-object v5

    .line 1799
    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 1800
    .line 1801
    .line 1802
    move-result-object v0

    .line 1803
    invoke-static {v9, v8, v0, v5}, LVa/M6;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 1804
    .line 1805
    .line 1806
    move-result-object v0

    .line 1807
    filled-new-array {v3, v4, v0}, [Ljava/lang/String;

    .line 1808
    .line 1809
    .line 1810
    move-result-object v0

    .line 1811
    invoke-static {v0}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 1812
    .line 1813
    .line 1814
    move-result-object v0

    .line 1815
    :goto_11
    invoke-virtual {v2, v0}, Lba/a;->c(Ljava/lang/Object;)V

    .line 1816
    .line 1817
    .line 1818
    return-void

    .line 1819
    :pswitch_12
    invoke-static {v0, v10}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1820
    .line 1821
    .line 1822
    check-cast v0, Ljava/util/List;

    .line 1823
    .line 1824
    invoke-interface {v0, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1825
    .line 1826
    .line 1827
    move-result-object v3

    .line 1828
    invoke-static {v3, v7}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1829
    .line 1830
    .line 1831
    check-cast v3, Landroid/webkit/WebView;

    .line 1832
    .line 1833
    invoke-interface {v0, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1834
    .line 1835
    .line 1836
    move-result-object v0

    .line 1837
    check-cast v0, Lkd/P;

    .line 1838
    .line 1839
    :try_start_12
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1840
    .line 1841
    .line 1842
    invoke-virtual {v3, v0}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    .line 1843
    .line 1844
    .line 1845
    invoke-static/range {v16 .. v16}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 1846
    .line 1847
    .line 1848
    move-result-object v0
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_12

    .line 1849
    goto :goto_12

    .line 1850
    :catchall_12
    move-exception v0

    .line 1851
    instance-of v3, v0, Lkd/a;

    .line 1852
    .line 1853
    if-eqz v3, :cond_12

    .line 1854
    .line 1855
    check-cast v0, Lkd/a;

    .line 1856
    .line 1857
    iget-object v3, v0, Lkd/a;->b:Ljava/lang/String;

    .line 1858
    .line 1859
    iget-object v4, v0, Lkd/a;->c:Ljava/lang/String;

    .line 1860
    .line 1861
    iget-object v0, v0, Lkd/a;->a:Ljava/lang/String;

    .line 1862
    .line 1863
    new-array v5, v12, [Ljava/lang/Object;

    .line 1864
    .line 1865
    aput-object v0, v5, v15

    .line 1866
    .line 1867
    aput-object v3, v5, v14

    .line 1868
    .line 1869
    aput-object v4, v5, v13

    .line 1870
    .line 1871
    invoke-static {v5}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 1872
    .line 1873
    .line 1874
    move-result-object v0

    .line 1875
    goto :goto_12

    .line 1876
    :cond_12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1877
    .line 1878
    .line 1879
    move-result-object v3

    .line 1880
    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 1881
    .line 1882
    .line 1883
    move-result-object v3

    .line 1884
    invoke-virtual {v0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 1885
    .line 1886
    .line 1887
    move-result-object v4

    .line 1888
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 1889
    .line 1890
    .line 1891
    move-result-object v5

    .line 1892
    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 1893
    .line 1894
    .line 1895
    move-result-object v0

    .line 1896
    invoke-static {v9, v8, v0, v5}, LVa/M6;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 1897
    .line 1898
    .line 1899
    move-result-object v0

    .line 1900
    filled-new-array {v3, v4, v0}, [Ljava/lang/String;

    .line 1901
    .line 1902
    .line 1903
    move-result-object v0

    .line 1904
    invoke-static {v0}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 1905
    .line 1906
    .line 1907
    move-result-object v0

    .line 1908
    :goto_12
    invoke-virtual {v2, v0}, Lba/a;->c(Ljava/lang/Object;)V

    .line 1909
    .line 1910
    .line 1911
    return-void

    .line 1912
    :pswitch_13
    invoke-static {v0, v10}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1913
    .line 1914
    .line 1915
    check-cast v0, Ljava/util/List;

    .line 1916
    .line 1917
    invoke-interface {v0, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1918
    .line 1919
    .line 1920
    move-result-object v3

    .line 1921
    invoke-static {v3, v7}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1922
    .line 1923
    .line 1924
    check-cast v3, Landroid/webkit/WebView;

    .line 1925
    .line 1926
    invoke-interface {v0, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1927
    .line 1928
    .line 1929
    move-result-object v0

    .line 1930
    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1931
    .line 1932
    .line 1933
    check-cast v0, Ljava/lang/Long;

    .line 1934
    .line 1935
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 1936
    .line 1937
    .line 1938
    move-result-wide v4

    .line 1939
    :try_start_13
    iget-object v0, v11, Lkd/s;->a:LC8/i;

    .line 1940
    .line 1941
    iget-object v0, v0, LC8/i;->d:Ljava/lang/Object;

    .line 1942
    .line 1943
    check-cast v0, Lkd/d;

    .line 1944
    .line 1945
    invoke-virtual {v3}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 1946
    .line 1947
    .line 1948
    move-result-object v3

    .line 1949
    invoke-virtual {v0, v4, v5, v3}, Lkd/d;->a(JLjava/lang/Object;)V

    .line 1950
    .line 1951
    .line 1952
    invoke-static/range {v16 .. v16}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 1953
    .line 1954
    .line 1955
    move-result-object v0
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_13

    .line 1956
    goto :goto_13

    .line 1957
    :catchall_13
    move-exception v0

    .line 1958
    instance-of v3, v0, Lkd/a;

    .line 1959
    .line 1960
    if-eqz v3, :cond_13

    .line 1961
    .line 1962
    check-cast v0, Lkd/a;

    .line 1963
    .line 1964
    iget-object v3, v0, Lkd/a;->b:Ljava/lang/String;

    .line 1965
    .line 1966
    iget-object v4, v0, Lkd/a;->c:Ljava/lang/String;

    .line 1967
    .line 1968
    iget-object v0, v0, Lkd/a;->a:Ljava/lang/String;

    .line 1969
    .line 1970
    new-array v5, v12, [Ljava/lang/Object;

    .line 1971
    .line 1972
    aput-object v0, v5, v15

    .line 1973
    .line 1974
    aput-object v3, v5, v14

    .line 1975
    .line 1976
    aput-object v4, v5, v13

    .line 1977
    .line 1978
    invoke-static {v5}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 1979
    .line 1980
    .line 1981
    move-result-object v0

    .line 1982
    goto :goto_13

    .line 1983
    :cond_13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1984
    .line 1985
    .line 1986
    move-result-object v3

    .line 1987
    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 1988
    .line 1989
    .line 1990
    move-result-object v3

    .line 1991
    invoke-virtual {v0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 1992
    .line 1993
    .line 1994
    move-result-object v4

    .line 1995
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 1996
    .line 1997
    .line 1998
    move-result-object v5

    .line 1999
    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 2000
    .line 2001
    .line 2002
    move-result-object v0

    .line 2003
    invoke-static {v9, v8, v0, v5}, LVa/M6;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 2004
    .line 2005
    .line 2006
    move-result-object v0

    .line 2007
    filled-new-array {v3, v4, v0}, [Ljava/lang/String;

    .line 2008
    .line 2009
    .line 2010
    move-result-object v0

    .line 2011
    invoke-static {v0}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 2012
    .line 2013
    .line 2014
    move-result-object v0

    .line 2015
    :goto_13
    invoke-virtual {v2, v0}, Lba/a;->c(Ljava/lang/Object;)V

    .line 2016
    .line 2017
    .line 2018
    return-void

    .line 2019
    :pswitch_14
    invoke-static {v0, v10}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2020
    .line 2021
    .line 2022
    check-cast v0, Ljava/util/List;

    .line 2023
    .line 2024
    invoke-interface {v0, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 2025
    .line 2026
    .line 2027
    move-result-object v3

    .line 2028
    invoke-static {v3, v7}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2029
    .line 2030
    .line 2031
    check-cast v3, Landroid/webkit/WebView;

    .line 2032
    .line 2033
    invoke-interface {v0, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 2034
    .line 2035
    .line 2036
    move-result-object v0

    .line 2037
    check-cast v0, Landroid/webkit/DownloadListener;

    .line 2038
    .line 2039
    :try_start_14
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2040
    .line 2041
    .line 2042
    invoke-virtual {v3, v0}, Landroid/webkit/WebView;->setDownloadListener(Landroid/webkit/DownloadListener;)V

    .line 2043
    .line 2044
    .line 2045
    invoke-static/range {v16 .. v16}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 2046
    .line 2047
    .line 2048
    move-result-object v0
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_14

    .line 2049
    goto :goto_14

    .line 2050
    :catchall_14
    move-exception v0

    .line 2051
    instance-of v3, v0, Lkd/a;

    .line 2052
    .line 2053
    if-eqz v3, :cond_14

    .line 2054
    .line 2055
    check-cast v0, Lkd/a;

    .line 2056
    .line 2057
    iget-object v3, v0, Lkd/a;->b:Ljava/lang/String;

    .line 2058
    .line 2059
    iget-object v4, v0, Lkd/a;->c:Ljava/lang/String;

    .line 2060
    .line 2061
    iget-object v0, v0, Lkd/a;->a:Ljava/lang/String;

    .line 2062
    .line 2063
    new-array v5, v12, [Ljava/lang/Object;

    .line 2064
    .line 2065
    aput-object v0, v5, v15

    .line 2066
    .line 2067
    aput-object v3, v5, v14

    .line 2068
    .line 2069
    aput-object v4, v5, v13

    .line 2070
    .line 2071
    invoke-static {v5}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 2072
    .line 2073
    .line 2074
    move-result-object v0

    .line 2075
    goto :goto_14

    .line 2076
    :cond_14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2077
    .line 2078
    .line 2079
    move-result-object v3

    .line 2080
    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 2081
    .line 2082
    .line 2083
    move-result-object v3

    .line 2084
    invoke-virtual {v0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 2085
    .line 2086
    .line 2087
    move-result-object v4

    .line 2088
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 2089
    .line 2090
    .line 2091
    move-result-object v5

    .line 2092
    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 2093
    .line 2094
    .line 2095
    move-result-object v0

    .line 2096
    invoke-static {v9, v8, v0, v5}, LVa/M6;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 2097
    .line 2098
    .line 2099
    move-result-object v0

    .line 2100
    filled-new-array {v3, v4, v0}, [Ljava/lang/String;

    .line 2101
    .line 2102
    .line 2103
    move-result-object v0

    .line 2104
    invoke-static {v0}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 2105
    .line 2106
    .line 2107
    move-result-object v0

    .line 2108
    :goto_14
    invoke-virtual {v2, v0}, Lba/a;->c(Ljava/lang/Object;)V

    .line 2109
    .line 2110
    .line 2111
    return-void

    .line 2112
    :pswitch_15
    invoke-static {v0, v10}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2113
    .line 2114
    .line 2115
    check-cast v0, Ljava/util/List;

    .line 2116
    .line 2117
    invoke-interface {v0, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 2118
    .line 2119
    .line 2120
    move-result-object v0

    .line 2121
    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2122
    .line 2123
    .line 2124
    check-cast v0, Ljava/lang/Long;

    .line 2125
    .line 2126
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 2127
    .line 2128
    .line 2129
    move-result-wide v3

    .line 2130
    :try_start_15
    iget-object v0, v11, Lkd/s;->a:LC8/i;

    .line 2131
    .line 2132
    iget-object v0, v0, LC8/i;->d:Ljava/lang/Object;

    .line 2133
    .line 2134
    check-cast v0, Lkd/d;

    .line 2135
    .line 2136
    invoke-virtual {v11}, Lkd/s;->a()Lkd/a0;

    .line 2137
    .line 2138
    .line 2139
    move-result-object v5

    .line 2140
    invoke-virtual {v0, v3, v4, v5}, Lkd/d;->a(JLjava/lang/Object;)V

    .line 2141
    .line 2142
    .line 2143
    invoke-static/range {v16 .. v16}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 2144
    .line 2145
    .line 2146
    move-result-object v0
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_15

    .line 2147
    goto :goto_15

    .line 2148
    :catchall_15
    move-exception v0

    .line 2149
    instance-of v3, v0, Lkd/a;

    .line 2150
    .line 2151
    if-eqz v3, :cond_15

    .line 2152
    .line 2153
    check-cast v0, Lkd/a;

    .line 2154
    .line 2155
    iget-object v3, v0, Lkd/a;->b:Ljava/lang/String;

    .line 2156
    .line 2157
    iget-object v4, v0, Lkd/a;->c:Ljava/lang/String;

    .line 2158
    .line 2159
    iget-object v0, v0, Lkd/a;->a:Ljava/lang/String;

    .line 2160
    .line 2161
    new-array v5, v12, [Ljava/lang/Object;

    .line 2162
    .line 2163
    aput-object v0, v5, v15

    .line 2164
    .line 2165
    aput-object v3, v5, v14

    .line 2166
    .line 2167
    aput-object v4, v5, v13

    .line 2168
    .line 2169
    invoke-static {v5}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 2170
    .line 2171
    .line 2172
    move-result-object v0

    .line 2173
    goto :goto_15

    .line 2174
    :cond_15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2175
    .line 2176
    .line 2177
    move-result-object v3

    .line 2178
    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 2179
    .line 2180
    .line 2181
    move-result-object v3

    .line 2182
    invoke-virtual {v0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 2183
    .line 2184
    .line 2185
    move-result-object v4

    .line 2186
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 2187
    .line 2188
    .line 2189
    move-result-object v5

    .line 2190
    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 2191
    .line 2192
    .line 2193
    move-result-object v0

    .line 2194
    invoke-static {v9, v8, v0, v5}, LVa/M6;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 2195
    .line 2196
    .line 2197
    move-result-object v0

    .line 2198
    filled-new-array {v3, v4, v0}, [Ljava/lang/String;

    .line 2199
    .line 2200
    .line 2201
    move-result-object v0

    .line 2202
    invoke-static {v0}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 2203
    .line 2204
    .line 2205
    move-result-object v0

    .line 2206
    :goto_15
    invoke-virtual {v2, v0}, Lba/a;->c(Ljava/lang/Object;)V

    .line 2207
    .line 2208
    .line 2209
    return-void

    .line 2210
    nop

    .line 2211
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
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
