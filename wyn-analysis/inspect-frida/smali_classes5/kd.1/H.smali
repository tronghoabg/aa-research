.class public final synthetic Lkd/H;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luc/b;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lkd/l;


# direct methods
.method public synthetic constructor <init>(Lkd/l;I)V
    .locals 0

    .line 1
    iput p2, p0, Lkd/H;->a:I

    iput-object p1, p0, Lkd/H;->b:Lkd/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Lba/a;)V
    .locals 12

    .line 1
    const-string v0, "null cannot be cast to non-null type kotlin.Boolean"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, ", Stacktrace: "

    .line 5
    .line 6
    const-string v3, "Cause: "

    .line 7
    .line 8
    const/4 v4, 0x3

    .line 9
    const-string v5, "null cannot be cast to non-null type android.webkit.WebSettings"

    .line 10
    .line 11
    const-string v6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 12
    .line 13
    iget-object v7, p0, Lkd/H;->b:Lkd/l;

    .line 14
    .line 15
    const/4 v8, 0x2

    .line 16
    const/4 v9, 0x1

    .line 17
    const/4 v10, 0x0

    .line 18
    iget v11, p0, Lkd/H;->a:I

    .line 19
    .line 20
    packed-switch v11, :pswitch_data_0

    .line 21
    .line 22
    .line 23
    invoke-static {p1, v6}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    check-cast p1, Ljava/util/List;

    .line 27
    .line 28
    invoke-interface {p1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v6

    .line 32
    invoke-static {v6, v5}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    check-cast v6, Landroid/webkit/WebSettings;

    .line 36
    .line 37
    invoke-interface {p1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    check-cast p1, Ljava/lang/Boolean;

    .line 45
    .line 46
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    :try_start_0
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v6, p1}, Landroid/webkit/WebSettings;->setSupportMultipleWindows(Z)V

    .line 54
    .line 55
    .line 56
    invoke-static {v1}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 57
    .line 58
    .line 59
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    goto :goto_0

    .line 61
    :catchall_0
    move-exception p1

    .line 62
    instance-of v0, p1, Lkd/a;

    .line 63
    .line 64
    if-eqz v0, :cond_0

    .line 65
    .line 66
    check-cast p1, Lkd/a;

    .line 67
    .line 68
    iget-object v0, p1, Lkd/a;->b:Ljava/lang/String;

    .line 69
    .line 70
    iget-object v1, p1, Lkd/a;->c:Ljava/lang/String;

    .line 71
    .line 72
    iget-object p1, p1, Lkd/a;->a:Ljava/lang/String;

    .line 73
    .line 74
    new-array v2, v4, [Ljava/lang/Object;

    .line 75
    .line 76
    aput-object p1, v2, v10

    .line 77
    .line 78
    aput-object v0, v2, v9

    .line 79
    .line 80
    aput-object v1, v2, v8

    .line 81
    .line 82
    invoke-static {v2}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    goto :goto_0

    .line 87
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    invoke-static {v3, v2, p1, v4}, LVa/M6;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    invoke-static {p1}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    :goto_0
    invoke-virtual {p2, p1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    return-void

    .line 123
    :pswitch_0
    invoke-static {p1, v6}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    check-cast p1, Ljava/util/List;

    .line 127
    .line 128
    invoke-interface {p1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v6

    .line 132
    invoke-static {v6, v5}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    check-cast v6, Landroid/webkit/WebSettings;

    .line 136
    .line 137
    invoke-interface {p1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    check-cast p1, Ljava/lang/Boolean;

    .line 145
    .line 146
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 147
    .line 148
    .line 149
    move-result p1

    .line 150
    :try_start_1
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v6, p1}, Landroid/webkit/WebSettings;->setJavaScriptCanOpenWindowsAutomatically(Z)V

    .line 154
    .line 155
    .line 156
    invoke-static {v1}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 157
    .line 158
    .line 159
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 160
    goto :goto_1

    .line 161
    :catchall_1
    move-exception p1

    .line 162
    instance-of v0, p1, Lkd/a;

    .line 163
    .line 164
    if-eqz v0, :cond_1

    .line 165
    .line 166
    check-cast p1, Lkd/a;

    .line 167
    .line 168
    iget-object v0, p1, Lkd/a;->b:Ljava/lang/String;

    .line 169
    .line 170
    iget-object v1, p1, Lkd/a;->c:Ljava/lang/String;

    .line 171
    .line 172
    iget-object p1, p1, Lkd/a;->a:Ljava/lang/String;

    .line 173
    .line 174
    new-array v2, v4, [Ljava/lang/Object;

    .line 175
    .line 176
    aput-object p1, v2, v10

    .line 177
    .line 178
    aput-object v0, v2, v9

    .line 179
    .line 180
    aput-object v1, v2, v8

    .line 181
    .line 182
    invoke-static {v2}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    goto :goto_1

    .line 187
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v1

    .line 199
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 200
    .line 201
    .line 202
    move-result-object v4

    .line 203
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object p1

    .line 207
    invoke-static {v3, v2, p1, v4}, LVa/M6;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object p1

    .line 211
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object p1

    .line 215
    invoke-static {p1}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 216
    .line 217
    .line 218
    move-result-object p1

    .line 219
    :goto_1
    invoke-virtual {p2, p1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 220
    .line 221
    .line 222
    return-void

    .line 223
    :pswitch_1
    invoke-static {p1, v6}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    check-cast p1, Ljava/util/List;

    .line 227
    .line 228
    invoke-interface {p1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    check-cast v0, Landroid/webkit/WebSettings;

    .line 236
    .line 237
    invoke-interface {p1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object p1

    .line 241
    const-string v5, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.MixedContentMode"

    .line 242
    .line 243
    invoke-static {p1, v5}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 244
    .line 245
    .line 246
    check-cast p1, Lkd/u;

    .line 247
    .line 248
    :try_start_2
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 249
    .line 250
    .line 251
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 252
    .line 253
    .line 254
    move-result p1

    .line 255
    if-eqz p1, :cond_4

    .line 256
    .line 257
    if-eq p1, v9, :cond_3

    .line 258
    .line 259
    if-eq p1, v8, :cond_2

    .line 260
    .line 261
    goto :goto_2

    .line 262
    :cond_2
    invoke-virtual {v0, v9}, Landroid/webkit/WebSettings;->setMixedContentMode(I)V

    .line 263
    .line 264
    .line 265
    goto :goto_2

    .line 266
    :cond_3
    invoke-virtual {v0, v8}, Landroid/webkit/WebSettings;->setMixedContentMode(I)V

    .line 267
    .line 268
    .line 269
    goto :goto_2

    .line 270
    :cond_4
    invoke-virtual {v0, v10}, Landroid/webkit/WebSettings;->setMixedContentMode(I)V

    .line 271
    .line 272
    .line 273
    :goto_2
    invoke-static {v1}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 274
    .line 275
    .line 276
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 277
    goto :goto_3

    .line 278
    :catchall_2
    move-exception p1

    .line 279
    instance-of v0, p1, Lkd/a;

    .line 280
    .line 281
    if-eqz v0, :cond_5

    .line 282
    .line 283
    check-cast p1, Lkd/a;

    .line 284
    .line 285
    iget-object v0, p1, Lkd/a;->b:Ljava/lang/String;

    .line 286
    .line 287
    iget-object v1, p1, Lkd/a;->c:Ljava/lang/String;

    .line 288
    .line 289
    iget-object p1, p1, Lkd/a;->a:Ljava/lang/String;

    .line 290
    .line 291
    new-array v2, v4, [Ljava/lang/Object;

    .line 292
    .line 293
    aput-object p1, v2, v10

    .line 294
    .line 295
    aput-object v0, v2, v9

    .line 296
    .line 297
    aput-object v1, v2, v8

    .line 298
    .line 299
    invoke-static {v2}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 300
    .line 301
    .line 302
    move-result-object p1

    .line 303
    goto :goto_3

    .line 304
    :cond_5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 305
    .line 306
    .line 307
    move-result-object v0

    .line 308
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 309
    .line 310
    .line 311
    move-result-object v0

    .line 312
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 313
    .line 314
    .line 315
    move-result-object v1

    .line 316
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 317
    .line 318
    .line 319
    move-result-object v4

    .line 320
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object p1

    .line 324
    invoke-static {v3, v2, p1, v4}, LVa/M6;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 325
    .line 326
    .line 327
    move-result-object p1

    .line 328
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 329
    .line 330
    .line 331
    move-result-object p1

    .line 332
    invoke-static {p1}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 333
    .line 334
    .line 335
    move-result-object p1

    .line 336
    :goto_3
    invoke-virtual {p2, p1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 337
    .line 338
    .line 339
    return-void

    .line 340
    :pswitch_2
    invoke-static {p1, v6}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 341
    .line 342
    .line 343
    check-cast p1, Ljava/util/List;

    .line 344
    .line 345
    invoke-interface {p1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 346
    .line 347
    .line 348
    move-result-object p1

    .line 349
    invoke-static {p1, v5}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 350
    .line 351
    .line 352
    check-cast p1, Landroid/webkit/WebSettings;

    .line 353
    .line 354
    :try_start_3
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 355
    .line 356
    .line 357
    invoke-virtual {p1}, Landroid/webkit/WebSettings;->getUserAgentString()Ljava/lang/String;

    .line 358
    .line 359
    .line 360
    move-result-object p1

    .line 361
    invoke-static {p1}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 362
    .line 363
    .line 364
    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 365
    goto :goto_4

    .line 366
    :catchall_3
    move-exception p1

    .line 367
    instance-of v0, p1, Lkd/a;

    .line 368
    .line 369
    if-eqz v0, :cond_6

    .line 370
    .line 371
    check-cast p1, Lkd/a;

    .line 372
    .line 373
    iget-object v0, p1, Lkd/a;->b:Ljava/lang/String;

    .line 374
    .line 375
    iget-object v1, p1, Lkd/a;->c:Ljava/lang/String;

    .line 376
    .line 377
    iget-object p1, p1, Lkd/a;->a:Ljava/lang/String;

    .line 378
    .line 379
    new-array v2, v4, [Ljava/lang/Object;

    .line 380
    .line 381
    aput-object p1, v2, v10

    .line 382
    .line 383
    aput-object v0, v2, v9

    .line 384
    .line 385
    aput-object v1, v2, v8

    .line 386
    .line 387
    invoke-static {v2}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 388
    .line 389
    .line 390
    move-result-object p1

    .line 391
    goto :goto_4

    .line 392
    :cond_6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 393
    .line 394
    .line 395
    move-result-object v0

    .line 396
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 397
    .line 398
    .line 399
    move-result-object v0

    .line 400
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 401
    .line 402
    .line 403
    move-result-object v1

    .line 404
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 405
    .line 406
    .line 407
    move-result-object v4

    .line 408
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 409
    .line 410
    .line 411
    move-result-object p1

    .line 412
    invoke-static {v3, v2, p1, v4}, LVa/M6;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 413
    .line 414
    .line 415
    move-result-object p1

    .line 416
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 417
    .line 418
    .line 419
    move-result-object p1

    .line 420
    invoke-static {p1}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 421
    .line 422
    .line 423
    move-result-object p1

    .line 424
    :goto_4
    invoke-virtual {p2, p1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 425
    .line 426
    .line 427
    return-void

    .line 428
    :pswitch_3
    invoke-static {p1, v6}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 429
    .line 430
    .line 431
    check-cast p1, Ljava/util/List;

    .line 432
    .line 433
    invoke-interface {p1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 434
    .line 435
    .line 436
    move-result-object v0

    .line 437
    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 438
    .line 439
    .line 440
    check-cast v0, Landroid/webkit/WebSettings;

    .line 441
    .line 442
    invoke-interface {p1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 443
    .line 444
    .line 445
    move-result-object p1

    .line 446
    const-string v5, "null cannot be cast to non-null type kotlin.Long"

    .line 447
    .line 448
    invoke-static {p1, v5}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 449
    .line 450
    .line 451
    check-cast p1, Ljava/lang/Long;

    .line 452
    .line 453
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 454
    .line 455
    .line 456
    move-result-wide v5

    .line 457
    :try_start_4
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 458
    .line 459
    .line 460
    long-to-int p1, v5

    .line 461
    invoke-virtual {v0, p1}, Landroid/webkit/WebSettings;->setTextZoom(I)V

    .line 462
    .line 463
    .line 464
    invoke-static {v1}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 465
    .line 466
    .line 467
    move-result-object p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 468
    goto :goto_5

    .line 469
    :catchall_4
    move-exception p1

    .line 470
    instance-of v0, p1, Lkd/a;

    .line 471
    .line 472
    if-eqz v0, :cond_7

    .line 473
    .line 474
    check-cast p1, Lkd/a;

    .line 475
    .line 476
    iget-object v0, p1, Lkd/a;->b:Ljava/lang/String;

    .line 477
    .line 478
    iget-object v1, p1, Lkd/a;->c:Ljava/lang/String;

    .line 479
    .line 480
    iget-object p1, p1, Lkd/a;->a:Ljava/lang/String;

    .line 481
    .line 482
    new-array v2, v4, [Ljava/lang/Object;

    .line 483
    .line 484
    aput-object p1, v2, v10

    .line 485
    .line 486
    aput-object v0, v2, v9

    .line 487
    .line 488
    aput-object v1, v2, v8

    .line 489
    .line 490
    invoke-static {v2}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 491
    .line 492
    .line 493
    move-result-object p1

    .line 494
    goto :goto_5

    .line 495
    :cond_7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 496
    .line 497
    .line 498
    move-result-object v0

    .line 499
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 500
    .line 501
    .line 502
    move-result-object v0

    .line 503
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 504
    .line 505
    .line 506
    move-result-object v1

    .line 507
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 508
    .line 509
    .line 510
    move-result-object v4

    .line 511
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 512
    .line 513
    .line 514
    move-result-object p1

    .line 515
    invoke-static {v3, v2, p1, v4}, LVa/M6;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 516
    .line 517
    .line 518
    move-result-object p1

    .line 519
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 520
    .line 521
    .line 522
    move-result-object p1

    .line 523
    invoke-static {p1}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 524
    .line 525
    .line 526
    move-result-object p1

    .line 527
    :goto_5
    invoke-virtual {p2, p1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 528
    .line 529
    .line 530
    return-void

    .line 531
    :pswitch_4
    invoke-static {p1, v6}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 532
    .line 533
    .line 534
    check-cast p1, Ljava/util/List;

    .line 535
    .line 536
    invoke-interface {p1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 537
    .line 538
    .line 539
    move-result-object v6

    .line 540
    invoke-static {v6, v5}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 541
    .line 542
    .line 543
    check-cast v6, Landroid/webkit/WebSettings;

    .line 544
    .line 545
    invoke-interface {p1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 546
    .line 547
    .line 548
    move-result-object p1

    .line 549
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 550
    .line 551
    .line 552
    check-cast p1, Ljava/lang/Boolean;

    .line 553
    .line 554
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 555
    .line 556
    .line 557
    move-result p1

    .line 558
    :try_start_5
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 559
    .line 560
    .line 561
    invoke-virtual {v6, p1}, Landroid/webkit/WebSettings;->setGeolocationEnabled(Z)V

    .line 562
    .line 563
    .line 564
    invoke-static {v1}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 565
    .line 566
    .line 567
    move-result-object p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 568
    goto :goto_6

    .line 569
    :catchall_5
    move-exception p1

    .line 570
    instance-of v0, p1, Lkd/a;

    .line 571
    .line 572
    if-eqz v0, :cond_8

    .line 573
    .line 574
    check-cast p1, Lkd/a;

    .line 575
    .line 576
    iget-object v0, p1, Lkd/a;->b:Ljava/lang/String;

    .line 577
    .line 578
    iget-object v1, p1, Lkd/a;->c:Ljava/lang/String;

    .line 579
    .line 580
    iget-object p1, p1, Lkd/a;->a:Ljava/lang/String;

    .line 581
    .line 582
    new-array v2, v4, [Ljava/lang/Object;

    .line 583
    .line 584
    aput-object p1, v2, v10

    .line 585
    .line 586
    aput-object v0, v2, v9

    .line 587
    .line 588
    aput-object v1, v2, v8

    .line 589
    .line 590
    invoke-static {v2}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 591
    .line 592
    .line 593
    move-result-object p1

    .line 594
    goto :goto_6

    .line 595
    :cond_8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 596
    .line 597
    .line 598
    move-result-object v0

    .line 599
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 600
    .line 601
    .line 602
    move-result-object v0

    .line 603
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 604
    .line 605
    .line 606
    move-result-object v1

    .line 607
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 608
    .line 609
    .line 610
    move-result-object v4

    .line 611
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 612
    .line 613
    .line 614
    move-result-object p1

    .line 615
    invoke-static {v3, v2, p1, v4}, LVa/M6;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 616
    .line 617
    .line 618
    move-result-object p1

    .line 619
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 620
    .line 621
    .line 622
    move-result-object p1

    .line 623
    invoke-static {p1}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 624
    .line 625
    .line 626
    move-result-object p1

    .line 627
    :goto_6
    invoke-virtual {p2, p1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 628
    .line 629
    .line 630
    return-void

    .line 631
    :pswitch_5
    invoke-static {p1, v6}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 632
    .line 633
    .line 634
    check-cast p1, Ljava/util/List;

    .line 635
    .line 636
    invoke-interface {p1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 637
    .line 638
    .line 639
    move-result-object v6

    .line 640
    invoke-static {v6, v5}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 641
    .line 642
    .line 643
    check-cast v6, Landroid/webkit/WebSettings;

    .line 644
    .line 645
    invoke-interface {p1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 646
    .line 647
    .line 648
    move-result-object p1

    .line 649
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 650
    .line 651
    .line 652
    check-cast p1, Ljava/lang/Boolean;

    .line 653
    .line 654
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 655
    .line 656
    .line 657
    move-result p1

    .line 658
    :try_start_6
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 659
    .line 660
    .line 661
    invoke-virtual {v6, p1}, Landroid/webkit/WebSettings;->setAllowContentAccess(Z)V

    .line 662
    .line 663
    .line 664
    invoke-static {v1}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 665
    .line 666
    .line 667
    move-result-object p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    .line 668
    goto :goto_7

    .line 669
    :catchall_6
    move-exception p1

    .line 670
    instance-of v0, p1, Lkd/a;

    .line 671
    .line 672
    if-eqz v0, :cond_9

    .line 673
    .line 674
    check-cast p1, Lkd/a;

    .line 675
    .line 676
    iget-object v0, p1, Lkd/a;->b:Ljava/lang/String;

    .line 677
    .line 678
    iget-object v1, p1, Lkd/a;->c:Ljava/lang/String;

    .line 679
    .line 680
    iget-object p1, p1, Lkd/a;->a:Ljava/lang/String;

    .line 681
    .line 682
    new-array v2, v4, [Ljava/lang/Object;

    .line 683
    .line 684
    aput-object p1, v2, v10

    .line 685
    .line 686
    aput-object v0, v2, v9

    .line 687
    .line 688
    aput-object v1, v2, v8

    .line 689
    .line 690
    invoke-static {v2}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 691
    .line 692
    .line 693
    move-result-object p1

    .line 694
    goto :goto_7

    .line 695
    :cond_9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 696
    .line 697
    .line 698
    move-result-object v0

    .line 699
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 700
    .line 701
    .line 702
    move-result-object v0

    .line 703
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 704
    .line 705
    .line 706
    move-result-object v1

    .line 707
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 708
    .line 709
    .line 710
    move-result-object v4

    .line 711
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 712
    .line 713
    .line 714
    move-result-object p1

    .line 715
    invoke-static {v3, v2, p1, v4}, LVa/M6;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 716
    .line 717
    .line 718
    move-result-object p1

    .line 719
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 720
    .line 721
    .line 722
    move-result-object p1

    .line 723
    invoke-static {p1}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 724
    .line 725
    .line 726
    move-result-object p1

    .line 727
    :goto_7
    invoke-virtual {p2, p1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 728
    .line 729
    .line 730
    return-void

    .line 731
    :pswitch_6
    invoke-static {p1, v6}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 732
    .line 733
    .line 734
    check-cast p1, Ljava/util/List;

    .line 735
    .line 736
    invoke-interface {p1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 737
    .line 738
    .line 739
    move-result-object v6

    .line 740
    invoke-static {v6, v5}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 741
    .line 742
    .line 743
    check-cast v6, Landroid/webkit/WebSettings;

    .line 744
    .line 745
    invoke-interface {p1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 746
    .line 747
    .line 748
    move-result-object p1

    .line 749
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 750
    .line 751
    .line 752
    check-cast p1, Ljava/lang/Boolean;

    .line 753
    .line 754
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 755
    .line 756
    .line 757
    move-result p1

    .line 758
    :try_start_7
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 759
    .line 760
    .line 761
    invoke-virtual {v6, p1}, Landroid/webkit/WebSettings;->setAllowFileAccess(Z)V

    .line 762
    .line 763
    .line 764
    invoke-static {v1}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 765
    .line 766
    .line 767
    move-result-object p1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    .line 768
    goto :goto_8

    .line 769
    :catchall_7
    move-exception p1

    .line 770
    instance-of v0, p1, Lkd/a;

    .line 771
    .line 772
    if-eqz v0, :cond_a

    .line 773
    .line 774
    check-cast p1, Lkd/a;

    .line 775
    .line 776
    iget-object v0, p1, Lkd/a;->b:Ljava/lang/String;

    .line 777
    .line 778
    iget-object v1, p1, Lkd/a;->c:Ljava/lang/String;

    .line 779
    .line 780
    iget-object p1, p1, Lkd/a;->a:Ljava/lang/String;

    .line 781
    .line 782
    new-array v2, v4, [Ljava/lang/Object;

    .line 783
    .line 784
    aput-object p1, v2, v10

    .line 785
    .line 786
    aput-object v0, v2, v9

    .line 787
    .line 788
    aput-object v1, v2, v8

    .line 789
    .line 790
    invoke-static {v2}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 791
    .line 792
    .line 793
    move-result-object p1

    .line 794
    goto :goto_8

    .line 795
    :cond_a
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 796
    .line 797
    .line 798
    move-result-object v0

    .line 799
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 800
    .line 801
    .line 802
    move-result-object v0

    .line 803
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 804
    .line 805
    .line 806
    move-result-object v1

    .line 807
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 808
    .line 809
    .line 810
    move-result-object v4

    .line 811
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 812
    .line 813
    .line 814
    move-result-object p1

    .line 815
    invoke-static {v3, v2, p1, v4}, LVa/M6;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 816
    .line 817
    .line 818
    move-result-object p1

    .line 819
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 820
    .line 821
    .line 822
    move-result-object p1

    .line 823
    invoke-static {p1}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 824
    .line 825
    .line 826
    move-result-object p1

    .line 827
    :goto_8
    invoke-virtual {p2, p1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 828
    .line 829
    .line 830
    return-void

    .line 831
    :pswitch_7
    invoke-static {p1, v6}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 832
    .line 833
    .line 834
    check-cast p1, Ljava/util/List;

    .line 835
    .line 836
    invoke-interface {p1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 837
    .line 838
    .line 839
    move-result-object v6

    .line 840
    invoke-static {v6, v5}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 841
    .line 842
    .line 843
    check-cast v6, Landroid/webkit/WebSettings;

    .line 844
    .line 845
    invoke-interface {p1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 846
    .line 847
    .line 848
    move-result-object p1

    .line 849
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 850
    .line 851
    .line 852
    check-cast p1, Ljava/lang/Boolean;

    .line 853
    .line 854
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 855
    .line 856
    .line 857
    move-result p1

    .line 858
    :try_start_8
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 859
    .line 860
    .line 861
    invoke-virtual {v6, p1}, Landroid/webkit/WebSettings;->setBuiltInZoomControls(Z)V

    .line 862
    .line 863
    .line 864
    invoke-static {v1}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 865
    .line 866
    .line 867
    move-result-object p1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_8

    .line 868
    goto :goto_9

    .line 869
    :catchall_8
    move-exception p1

    .line 870
    instance-of v0, p1, Lkd/a;

    .line 871
    .line 872
    if-eqz v0, :cond_b

    .line 873
    .line 874
    check-cast p1, Lkd/a;

    .line 875
    .line 876
    iget-object v0, p1, Lkd/a;->b:Ljava/lang/String;

    .line 877
    .line 878
    iget-object v1, p1, Lkd/a;->c:Ljava/lang/String;

    .line 879
    .line 880
    iget-object p1, p1, Lkd/a;->a:Ljava/lang/String;

    .line 881
    .line 882
    new-array v2, v4, [Ljava/lang/Object;

    .line 883
    .line 884
    aput-object p1, v2, v10

    .line 885
    .line 886
    aput-object v0, v2, v9

    .line 887
    .line 888
    aput-object v1, v2, v8

    .line 889
    .line 890
    invoke-static {v2}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 891
    .line 892
    .line 893
    move-result-object p1

    .line 894
    goto :goto_9

    .line 895
    :cond_b
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 896
    .line 897
    .line 898
    move-result-object v0

    .line 899
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 900
    .line 901
    .line 902
    move-result-object v0

    .line 903
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 904
    .line 905
    .line 906
    move-result-object v1

    .line 907
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 908
    .line 909
    .line 910
    move-result-object v4

    .line 911
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 912
    .line 913
    .line 914
    move-result-object p1

    .line 915
    invoke-static {v3, v2, p1, v4}, LVa/M6;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 916
    .line 917
    .line 918
    move-result-object p1

    .line 919
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 920
    .line 921
    .line 922
    move-result-object p1

    .line 923
    invoke-static {p1}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 924
    .line 925
    .line 926
    move-result-object p1

    .line 927
    :goto_9
    invoke-virtual {p2, p1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 928
    .line 929
    .line 930
    return-void

    .line 931
    :pswitch_8
    invoke-static {p1, v6}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 932
    .line 933
    .line 934
    check-cast p1, Ljava/util/List;

    .line 935
    .line 936
    invoke-interface {p1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 937
    .line 938
    .line 939
    move-result-object v6

    .line 940
    invoke-static {v6, v5}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 941
    .line 942
    .line 943
    check-cast v6, Landroid/webkit/WebSettings;

    .line 944
    .line 945
    invoke-interface {p1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 946
    .line 947
    .line 948
    move-result-object p1

    .line 949
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 950
    .line 951
    .line 952
    check-cast p1, Ljava/lang/Boolean;

    .line 953
    .line 954
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 955
    .line 956
    .line 957
    move-result p1

    .line 958
    :try_start_9
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 959
    .line 960
    .line 961
    invoke-virtual {v6, p1}, Landroid/webkit/WebSettings;->setDisplayZoomControls(Z)V

    .line 962
    .line 963
    .line 964
    invoke-static {v1}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 965
    .line 966
    .line 967
    move-result-object p1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_9

    .line 968
    goto :goto_a

    .line 969
    :catchall_9
    move-exception p1

    .line 970
    instance-of v0, p1, Lkd/a;

    .line 971
    .line 972
    if-eqz v0, :cond_c

    .line 973
    .line 974
    check-cast p1, Lkd/a;

    .line 975
    .line 976
    iget-object v0, p1, Lkd/a;->b:Ljava/lang/String;

    .line 977
    .line 978
    iget-object v1, p1, Lkd/a;->c:Ljava/lang/String;

    .line 979
    .line 980
    iget-object p1, p1, Lkd/a;->a:Ljava/lang/String;

    .line 981
    .line 982
    new-array v2, v4, [Ljava/lang/Object;

    .line 983
    .line 984
    aput-object p1, v2, v10

    .line 985
    .line 986
    aput-object v0, v2, v9

    .line 987
    .line 988
    aput-object v1, v2, v8

    .line 989
    .line 990
    invoke-static {v2}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 991
    .line 992
    .line 993
    move-result-object p1

    .line 994
    goto :goto_a

    .line 995
    :cond_c
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 996
    .line 997
    .line 998
    move-result-object v0

    .line 999
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 1000
    .line 1001
    .line 1002
    move-result-object v0

    .line 1003
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 1004
    .line 1005
    .line 1006
    move-result-object v1

    .line 1007
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 1008
    .line 1009
    .line 1010
    move-result-object v4

    .line 1011
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 1012
    .line 1013
    .line 1014
    move-result-object p1

    .line 1015
    invoke-static {v3, v2, p1, v4}, LVa/M6;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 1016
    .line 1017
    .line 1018
    move-result-object p1

    .line 1019
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 1020
    .line 1021
    .line 1022
    move-result-object p1

    .line 1023
    invoke-static {p1}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 1024
    .line 1025
    .line 1026
    move-result-object p1

    .line 1027
    :goto_a
    invoke-virtual {p2, p1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 1028
    .line 1029
    .line 1030
    return-void

    .line 1031
    :pswitch_9
    invoke-static {p1, v6}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1032
    .line 1033
    .line 1034
    check-cast p1, Ljava/util/List;

    .line 1035
    .line 1036
    invoke-interface {p1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1037
    .line 1038
    .line 1039
    move-result-object v6

    .line 1040
    invoke-static {v6, v5}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1041
    .line 1042
    .line 1043
    check-cast v6, Landroid/webkit/WebSettings;

    .line 1044
    .line 1045
    invoke-interface {p1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1046
    .line 1047
    .line 1048
    move-result-object p1

    .line 1049
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1050
    .line 1051
    .line 1052
    check-cast p1, Ljava/lang/Boolean;

    .line 1053
    .line 1054
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1055
    .line 1056
    .line 1057
    move-result p1

    .line 1058
    :try_start_a
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1059
    .line 1060
    .line 1061
    invoke-virtual {v6, p1}, Landroid/webkit/WebSettings;->setUseWideViewPort(Z)V

    .line 1062
    .line 1063
    .line 1064
    invoke-static {v1}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 1065
    .line 1066
    .line 1067
    move-result-object p1
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_a

    .line 1068
    goto :goto_b

    .line 1069
    :catchall_a
    move-exception p1

    .line 1070
    instance-of v0, p1, Lkd/a;

    .line 1071
    .line 1072
    if-eqz v0, :cond_d

    .line 1073
    .line 1074
    check-cast p1, Lkd/a;

    .line 1075
    .line 1076
    iget-object v0, p1, Lkd/a;->b:Ljava/lang/String;

    .line 1077
    .line 1078
    iget-object v1, p1, Lkd/a;->c:Ljava/lang/String;

    .line 1079
    .line 1080
    iget-object p1, p1, Lkd/a;->a:Ljava/lang/String;

    .line 1081
    .line 1082
    new-array v2, v4, [Ljava/lang/Object;

    .line 1083
    .line 1084
    aput-object p1, v2, v10

    .line 1085
    .line 1086
    aput-object v0, v2, v9

    .line 1087
    .line 1088
    aput-object v1, v2, v8

    .line 1089
    .line 1090
    invoke-static {v2}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 1091
    .line 1092
    .line 1093
    move-result-object p1

    .line 1094
    goto :goto_b

    .line 1095
    :cond_d
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1096
    .line 1097
    .line 1098
    move-result-object v0

    .line 1099
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 1100
    .line 1101
    .line 1102
    move-result-object v0

    .line 1103
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 1104
    .line 1105
    .line 1106
    move-result-object v1

    .line 1107
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 1108
    .line 1109
    .line 1110
    move-result-object v4

    .line 1111
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 1112
    .line 1113
    .line 1114
    move-result-object p1

    .line 1115
    invoke-static {v3, v2, p1, v4}, LVa/M6;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 1116
    .line 1117
    .line 1118
    move-result-object p1

    .line 1119
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 1120
    .line 1121
    .line 1122
    move-result-object p1

    .line 1123
    invoke-static {p1}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 1124
    .line 1125
    .line 1126
    move-result-object p1

    .line 1127
    :goto_b
    invoke-virtual {p2, p1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 1128
    .line 1129
    .line 1130
    return-void

    .line 1131
    :pswitch_a
    invoke-static {p1, v6}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1132
    .line 1133
    .line 1134
    check-cast p1, Ljava/util/List;

    .line 1135
    .line 1136
    invoke-interface {p1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1137
    .line 1138
    .line 1139
    move-result-object v6

    .line 1140
    invoke-static {v6, v5}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1141
    .line 1142
    .line 1143
    check-cast v6, Landroid/webkit/WebSettings;

    .line 1144
    .line 1145
    invoke-interface {p1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1146
    .line 1147
    .line 1148
    move-result-object p1

    .line 1149
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1150
    .line 1151
    .line 1152
    check-cast p1, Ljava/lang/Boolean;

    .line 1153
    .line 1154
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1155
    .line 1156
    .line 1157
    move-result p1

    .line 1158
    :try_start_b
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1159
    .line 1160
    .line 1161
    invoke-virtual {v6, p1}, Landroid/webkit/WebSettings;->setLoadWithOverviewMode(Z)V

    .line 1162
    .line 1163
    .line 1164
    invoke-static {v1}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 1165
    .line 1166
    .line 1167
    move-result-object p1
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_b

    .line 1168
    goto :goto_c

    .line 1169
    :catchall_b
    move-exception p1

    .line 1170
    instance-of v0, p1, Lkd/a;

    .line 1171
    .line 1172
    if-eqz v0, :cond_e

    .line 1173
    .line 1174
    check-cast p1, Lkd/a;

    .line 1175
    .line 1176
    iget-object v0, p1, Lkd/a;->b:Ljava/lang/String;

    .line 1177
    .line 1178
    iget-object v1, p1, Lkd/a;->c:Ljava/lang/String;

    .line 1179
    .line 1180
    iget-object p1, p1, Lkd/a;->a:Ljava/lang/String;

    .line 1181
    .line 1182
    new-array v2, v4, [Ljava/lang/Object;

    .line 1183
    .line 1184
    aput-object p1, v2, v10

    .line 1185
    .line 1186
    aput-object v0, v2, v9

    .line 1187
    .line 1188
    aput-object v1, v2, v8

    .line 1189
    .line 1190
    invoke-static {v2}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 1191
    .line 1192
    .line 1193
    move-result-object p1

    .line 1194
    goto :goto_c

    .line 1195
    :cond_e
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1196
    .line 1197
    .line 1198
    move-result-object v0

    .line 1199
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 1200
    .line 1201
    .line 1202
    move-result-object v0

    .line 1203
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 1204
    .line 1205
    .line 1206
    move-result-object v1

    .line 1207
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 1208
    .line 1209
    .line 1210
    move-result-object v4

    .line 1211
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 1212
    .line 1213
    .line 1214
    move-result-object p1

    .line 1215
    invoke-static {v3, v2, p1, v4}, LVa/M6;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 1216
    .line 1217
    .line 1218
    move-result-object p1

    .line 1219
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 1220
    .line 1221
    .line 1222
    move-result-object p1

    .line 1223
    invoke-static {p1}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 1224
    .line 1225
    .line 1226
    move-result-object p1

    .line 1227
    :goto_c
    invoke-virtual {p2, p1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 1228
    .line 1229
    .line 1230
    return-void

    .line 1231
    :pswitch_b
    invoke-static {p1, v6}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1232
    .line 1233
    .line 1234
    check-cast p1, Ljava/util/List;

    .line 1235
    .line 1236
    invoke-interface {p1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1237
    .line 1238
    .line 1239
    move-result-object v6

    .line 1240
    invoke-static {v6, v5}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1241
    .line 1242
    .line 1243
    check-cast v6, Landroid/webkit/WebSettings;

    .line 1244
    .line 1245
    invoke-interface {p1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1246
    .line 1247
    .line 1248
    move-result-object p1

    .line 1249
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1250
    .line 1251
    .line 1252
    check-cast p1, Ljava/lang/Boolean;

    .line 1253
    .line 1254
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1255
    .line 1256
    .line 1257
    move-result p1

    .line 1258
    :try_start_c
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1259
    .line 1260
    .line 1261
    invoke-virtual {v6, p1}, Landroid/webkit/WebSettings;->setSupportZoom(Z)V

    .line 1262
    .line 1263
    .line 1264
    invoke-static {v1}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 1265
    .line 1266
    .line 1267
    move-result-object p1
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_c

    .line 1268
    goto :goto_d

    .line 1269
    :catchall_c
    move-exception p1

    .line 1270
    instance-of v0, p1, Lkd/a;

    .line 1271
    .line 1272
    if-eqz v0, :cond_f

    .line 1273
    .line 1274
    check-cast p1, Lkd/a;

    .line 1275
    .line 1276
    iget-object v0, p1, Lkd/a;->b:Ljava/lang/String;

    .line 1277
    .line 1278
    iget-object v1, p1, Lkd/a;->c:Ljava/lang/String;

    .line 1279
    .line 1280
    iget-object p1, p1, Lkd/a;->a:Ljava/lang/String;

    .line 1281
    .line 1282
    new-array v2, v4, [Ljava/lang/Object;

    .line 1283
    .line 1284
    aput-object p1, v2, v10

    .line 1285
    .line 1286
    aput-object v0, v2, v9

    .line 1287
    .line 1288
    aput-object v1, v2, v8

    .line 1289
    .line 1290
    invoke-static {v2}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 1291
    .line 1292
    .line 1293
    move-result-object p1

    .line 1294
    goto :goto_d

    .line 1295
    :cond_f
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1296
    .line 1297
    .line 1298
    move-result-object v0

    .line 1299
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 1300
    .line 1301
    .line 1302
    move-result-object v0

    .line 1303
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 1304
    .line 1305
    .line 1306
    move-result-object v1

    .line 1307
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 1308
    .line 1309
    .line 1310
    move-result-object v4

    .line 1311
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 1312
    .line 1313
    .line 1314
    move-result-object p1

    .line 1315
    invoke-static {v3, v2, p1, v4}, LVa/M6;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 1316
    .line 1317
    .line 1318
    move-result-object p1

    .line 1319
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 1320
    .line 1321
    .line 1322
    move-result-object p1

    .line 1323
    invoke-static {p1}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 1324
    .line 1325
    .line 1326
    move-result-object p1

    .line 1327
    :goto_d
    invoke-virtual {p2, p1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 1328
    .line 1329
    .line 1330
    return-void

    .line 1331
    :pswitch_c
    invoke-static {p1, v6}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1332
    .line 1333
    .line 1334
    check-cast p1, Ljava/util/List;

    .line 1335
    .line 1336
    invoke-interface {p1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1337
    .line 1338
    .line 1339
    move-result-object v6

    .line 1340
    invoke-static {v6, v5}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1341
    .line 1342
    .line 1343
    check-cast v6, Landroid/webkit/WebSettings;

    .line 1344
    .line 1345
    invoke-interface {p1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1346
    .line 1347
    .line 1348
    move-result-object p1

    .line 1349
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1350
    .line 1351
    .line 1352
    check-cast p1, Ljava/lang/Boolean;

    .line 1353
    .line 1354
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1355
    .line 1356
    .line 1357
    move-result p1

    .line 1358
    :try_start_d
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1359
    .line 1360
    .line 1361
    invoke-virtual {v6, p1}, Landroid/webkit/WebSettings;->setMediaPlaybackRequiresUserGesture(Z)V

    .line 1362
    .line 1363
    .line 1364
    invoke-static {v1}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 1365
    .line 1366
    .line 1367
    move-result-object p1
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_d

    .line 1368
    goto :goto_e

    .line 1369
    :catchall_d
    move-exception p1

    .line 1370
    instance-of v0, p1, Lkd/a;

    .line 1371
    .line 1372
    if-eqz v0, :cond_10

    .line 1373
    .line 1374
    check-cast p1, Lkd/a;

    .line 1375
    .line 1376
    iget-object v0, p1, Lkd/a;->b:Ljava/lang/String;

    .line 1377
    .line 1378
    iget-object v1, p1, Lkd/a;->c:Ljava/lang/String;

    .line 1379
    .line 1380
    iget-object p1, p1, Lkd/a;->a:Ljava/lang/String;

    .line 1381
    .line 1382
    new-array v2, v4, [Ljava/lang/Object;

    .line 1383
    .line 1384
    aput-object p1, v2, v10

    .line 1385
    .line 1386
    aput-object v0, v2, v9

    .line 1387
    .line 1388
    aput-object v1, v2, v8

    .line 1389
    .line 1390
    invoke-static {v2}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 1391
    .line 1392
    .line 1393
    move-result-object p1

    .line 1394
    goto :goto_e

    .line 1395
    :cond_10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1396
    .line 1397
    .line 1398
    move-result-object v0

    .line 1399
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 1400
    .line 1401
    .line 1402
    move-result-object v0

    .line 1403
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 1404
    .line 1405
    .line 1406
    move-result-object v1

    .line 1407
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 1408
    .line 1409
    .line 1410
    move-result-object v4

    .line 1411
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 1412
    .line 1413
    .line 1414
    move-result-object p1

    .line 1415
    invoke-static {v3, v2, p1, v4}, LVa/M6;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 1416
    .line 1417
    .line 1418
    move-result-object p1

    .line 1419
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 1420
    .line 1421
    .line 1422
    move-result-object p1

    .line 1423
    invoke-static {p1}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 1424
    .line 1425
    .line 1426
    move-result-object p1

    .line 1427
    :goto_e
    invoke-virtual {p2, p1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 1428
    .line 1429
    .line 1430
    return-void

    .line 1431
    :pswitch_d
    invoke-static {p1, v6}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1432
    .line 1433
    .line 1434
    check-cast p1, Ljava/util/List;

    .line 1435
    .line 1436
    invoke-interface {p1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1437
    .line 1438
    .line 1439
    move-result-object v0

    .line 1440
    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1441
    .line 1442
    .line 1443
    check-cast v0, Landroid/webkit/WebSettings;

    .line 1444
    .line 1445
    invoke-interface {p1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1446
    .line 1447
    .line 1448
    move-result-object p1

    .line 1449
    check-cast p1, Ljava/lang/String;

    .line 1450
    .line 1451
    :try_start_e
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1452
    .line 1453
    .line 1454
    invoke-virtual {v0, p1}, Landroid/webkit/WebSettings;->setUserAgentString(Ljava/lang/String;)V

    .line 1455
    .line 1456
    .line 1457
    invoke-static {v1}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 1458
    .line 1459
    .line 1460
    move-result-object p1
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_e

    .line 1461
    goto :goto_f

    .line 1462
    :catchall_e
    move-exception p1

    .line 1463
    instance-of v0, p1, Lkd/a;

    .line 1464
    .line 1465
    if-eqz v0, :cond_11

    .line 1466
    .line 1467
    check-cast p1, Lkd/a;

    .line 1468
    .line 1469
    iget-object v0, p1, Lkd/a;->b:Ljava/lang/String;

    .line 1470
    .line 1471
    iget-object v1, p1, Lkd/a;->c:Ljava/lang/String;

    .line 1472
    .line 1473
    iget-object p1, p1, Lkd/a;->a:Ljava/lang/String;

    .line 1474
    .line 1475
    new-array v2, v4, [Ljava/lang/Object;

    .line 1476
    .line 1477
    aput-object p1, v2, v10

    .line 1478
    .line 1479
    aput-object v0, v2, v9

    .line 1480
    .line 1481
    aput-object v1, v2, v8

    .line 1482
    .line 1483
    invoke-static {v2}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 1484
    .line 1485
    .line 1486
    move-result-object p1

    .line 1487
    goto :goto_f

    .line 1488
    :cond_11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1489
    .line 1490
    .line 1491
    move-result-object v0

    .line 1492
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 1493
    .line 1494
    .line 1495
    move-result-object v0

    .line 1496
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 1497
    .line 1498
    .line 1499
    move-result-object v1

    .line 1500
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 1501
    .line 1502
    .line 1503
    move-result-object v4

    .line 1504
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 1505
    .line 1506
    .line 1507
    move-result-object p1

    .line 1508
    invoke-static {v3, v2, p1, v4}, LVa/M6;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 1509
    .line 1510
    .line 1511
    move-result-object p1

    .line 1512
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 1513
    .line 1514
    .line 1515
    move-result-object p1

    .line 1516
    invoke-static {p1}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 1517
    .line 1518
    .line 1519
    move-result-object p1

    .line 1520
    :goto_f
    invoke-virtual {p2, p1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 1521
    .line 1522
    .line 1523
    return-void

    .line 1524
    :pswitch_e
    invoke-static {p1, v6}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1525
    .line 1526
    .line 1527
    check-cast p1, Ljava/util/List;

    .line 1528
    .line 1529
    invoke-interface {p1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1530
    .line 1531
    .line 1532
    move-result-object v6

    .line 1533
    invoke-static {v6, v5}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1534
    .line 1535
    .line 1536
    check-cast v6, Landroid/webkit/WebSettings;

    .line 1537
    .line 1538
    invoke-interface {p1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1539
    .line 1540
    .line 1541
    move-result-object p1

    .line 1542
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1543
    .line 1544
    .line 1545
    check-cast p1, Ljava/lang/Boolean;

    .line 1546
    .line 1547
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1548
    .line 1549
    .line 1550
    move-result p1

    .line 1551
    :try_start_f
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1552
    .line 1553
    .line 1554
    invoke-virtual {v6, p1}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 1555
    .line 1556
    .line 1557
    invoke-static {v1}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 1558
    .line 1559
    .line 1560
    move-result-object p1
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_f

    .line 1561
    goto :goto_10

    .line 1562
    :catchall_f
    move-exception p1

    .line 1563
    instance-of v0, p1, Lkd/a;

    .line 1564
    .line 1565
    if-eqz v0, :cond_12

    .line 1566
    .line 1567
    check-cast p1, Lkd/a;

    .line 1568
    .line 1569
    iget-object v0, p1, Lkd/a;->b:Ljava/lang/String;

    .line 1570
    .line 1571
    iget-object v1, p1, Lkd/a;->c:Ljava/lang/String;

    .line 1572
    .line 1573
    iget-object p1, p1, Lkd/a;->a:Ljava/lang/String;

    .line 1574
    .line 1575
    new-array v2, v4, [Ljava/lang/Object;

    .line 1576
    .line 1577
    aput-object p1, v2, v10

    .line 1578
    .line 1579
    aput-object v0, v2, v9

    .line 1580
    .line 1581
    aput-object v1, v2, v8

    .line 1582
    .line 1583
    invoke-static {v2}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 1584
    .line 1585
    .line 1586
    move-result-object p1

    .line 1587
    goto :goto_10

    .line 1588
    :cond_12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1589
    .line 1590
    .line 1591
    move-result-object v0

    .line 1592
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 1593
    .line 1594
    .line 1595
    move-result-object v0

    .line 1596
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 1597
    .line 1598
    .line 1599
    move-result-object v1

    .line 1600
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 1601
    .line 1602
    .line 1603
    move-result-object v4

    .line 1604
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 1605
    .line 1606
    .line 1607
    move-result-object p1

    .line 1608
    invoke-static {v3, v2, p1, v4}, LVa/M6;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 1609
    .line 1610
    .line 1611
    move-result-object p1

    .line 1612
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 1613
    .line 1614
    .line 1615
    move-result-object p1

    .line 1616
    invoke-static {p1}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 1617
    .line 1618
    .line 1619
    move-result-object p1

    .line 1620
    :goto_10
    invoke-virtual {p2, p1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 1621
    .line 1622
    .line 1623
    return-void

    .line 1624
    :pswitch_f
    invoke-static {p1, v6}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1625
    .line 1626
    .line 1627
    check-cast p1, Ljava/util/List;

    .line 1628
    .line 1629
    invoke-interface {p1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1630
    .line 1631
    .line 1632
    move-result-object v6

    .line 1633
    invoke-static {v6, v5}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1634
    .line 1635
    .line 1636
    check-cast v6, Landroid/webkit/WebSettings;

    .line 1637
    .line 1638
    invoke-interface {p1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1639
    .line 1640
    .line 1641
    move-result-object p1

    .line 1642
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1643
    .line 1644
    .line 1645
    check-cast p1, Ljava/lang/Boolean;

    .line 1646
    .line 1647
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1648
    .line 1649
    .line 1650
    move-result p1

    .line 1651
    :try_start_10
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1652
    .line 1653
    .line 1654
    invoke-virtual {v6, p1}, Landroid/webkit/WebSettings;->setDomStorageEnabled(Z)V

    .line 1655
    .line 1656
    .line 1657
    invoke-static {v1}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 1658
    .line 1659
    .line 1660
    move-result-object p1
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_10

    .line 1661
    goto :goto_11

    .line 1662
    :catchall_10
    move-exception p1

    .line 1663
    instance-of v0, p1, Lkd/a;

    .line 1664
    .line 1665
    if-eqz v0, :cond_13

    .line 1666
    .line 1667
    check-cast p1, Lkd/a;

    .line 1668
    .line 1669
    iget-object v0, p1, Lkd/a;->b:Ljava/lang/String;

    .line 1670
    .line 1671
    iget-object v1, p1, Lkd/a;->c:Ljava/lang/String;

    .line 1672
    .line 1673
    iget-object p1, p1, Lkd/a;->a:Ljava/lang/String;

    .line 1674
    .line 1675
    new-array v2, v4, [Ljava/lang/Object;

    .line 1676
    .line 1677
    aput-object p1, v2, v10

    .line 1678
    .line 1679
    aput-object v0, v2, v9

    .line 1680
    .line 1681
    aput-object v1, v2, v8

    .line 1682
    .line 1683
    invoke-static {v2}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 1684
    .line 1685
    .line 1686
    move-result-object p1

    .line 1687
    goto :goto_11

    .line 1688
    :cond_13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1689
    .line 1690
    .line 1691
    move-result-object v0

    .line 1692
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 1693
    .line 1694
    .line 1695
    move-result-object v0

    .line 1696
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 1697
    .line 1698
    .line 1699
    move-result-object v1

    .line 1700
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 1701
    .line 1702
    .line 1703
    move-result-object v4

    .line 1704
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 1705
    .line 1706
    .line 1707
    move-result-object p1

    .line 1708
    invoke-static {v3, v2, p1, v4}, LVa/M6;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 1709
    .line 1710
    .line 1711
    move-result-object p1

    .line 1712
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 1713
    .line 1714
    .line 1715
    move-result-object p1

    .line 1716
    invoke-static {p1}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 1717
    .line 1718
    .line 1719
    move-result-object p1

    .line 1720
    :goto_11
    invoke-virtual {p2, p1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 1721
    .line 1722
    .line 1723
    return-void

    .line 1724
    nop

    .line 1725
    :pswitch_data_0
    .packed-switch 0x0
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
