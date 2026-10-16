.class public final synthetic Lkd/G;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luc/b;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lkd/i;


# direct methods
.method public synthetic constructor <init>(Lkd/i;I)V
    .locals 0

    .line 1
    iput p2, p0, Lkd/G;->a:I

    iput-object p1, p0, Lkd/G;->b:Lkd/i;

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
    const-string v1, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl"

    .line 4
    .line 5
    const-string v2, ", Stacktrace: "

    .line 6
    .line 7
    const-string v3, "Cause: "

    .line 8
    .line 9
    const/4 v4, 0x2

    .line 10
    const/4 v5, 0x3

    .line 11
    const/4 v6, 0x0

    .line 12
    const-string v7, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 13
    .line 14
    iget-object v8, p0, Lkd/G;->b:Lkd/i;

    .line 15
    .line 16
    const/4 v9, 0x1

    .line 17
    const/4 v10, 0x0

    .line 18
    iget v11, p0, Lkd/G;->a:I

    .line 19
    .line 20
    packed-switch v11, :pswitch_data_0

    .line 21
    .line 22
    .line 23
    invoke-static {p1, v7}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

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
    move-result-object v7

    .line 32
    invoke-static {v7, v1}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    check-cast v7, Lkd/P;

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
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    iput-boolean p1, v7, Lkd/P;->g:Z

    .line 54
    .line 55
    invoke-static {v6}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 56
    .line 57
    .line 58
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    goto :goto_0

    .line 60
    :catchall_0
    move-exception p1

    .line 61
    instance-of v0, p1, Lkd/a;

    .line 62
    .line 63
    if-eqz v0, :cond_0

    .line 64
    .line 65
    check-cast p1, Lkd/a;

    .line 66
    .line 67
    iget-object v0, p1, Lkd/a;->b:Ljava/lang/String;

    .line 68
    .line 69
    iget-object v1, p1, Lkd/a;->c:Ljava/lang/String;

    .line 70
    .line 71
    iget-object p1, p1, Lkd/a;->a:Ljava/lang/String;

    .line 72
    .line 73
    new-array v2, v5, [Ljava/lang/Object;

    .line 74
    .line 75
    aput-object p1, v2, v10

    .line 76
    .line 77
    aput-object v0, v2, v9

    .line 78
    .line 79
    aput-object v1, v2, v4

    .line 80
    .line 81
    invoke-static {v2}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    goto :goto_0

    .line 86
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    invoke-static {v3, v2, p1, v4}, LVa/M6;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    invoke-static {p1}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    :goto_0
    invoke-virtual {p2, p1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    return-void

    .line 122
    :pswitch_0
    invoke-static {p1, v7}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    check-cast p1, Ljava/util/List;

    .line 126
    .line 127
    invoke-interface {p1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v7

    .line 131
    invoke-static {v7, v1}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    check-cast v7, Lkd/P;

    .line 135
    .line 136
    invoke-interface {p1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    check-cast p1, Ljava/lang/Boolean;

    .line 144
    .line 145
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 146
    .line 147
    .line 148
    move-result p1

    .line 149
    :try_start_1
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    iput-boolean p1, v7, Lkd/P;->f:Z

    .line 153
    .line 154
    invoke-static {v6}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 155
    .line 156
    .line 157
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 158
    goto :goto_1

    .line 159
    :catchall_1
    move-exception p1

    .line 160
    instance-of v0, p1, Lkd/a;

    .line 161
    .line 162
    if-eqz v0, :cond_1

    .line 163
    .line 164
    check-cast p1, Lkd/a;

    .line 165
    .line 166
    iget-object v0, p1, Lkd/a;->b:Ljava/lang/String;

    .line 167
    .line 168
    iget-object v1, p1, Lkd/a;->c:Ljava/lang/String;

    .line 169
    .line 170
    iget-object p1, p1, Lkd/a;->a:Ljava/lang/String;

    .line 171
    .line 172
    new-array v2, v5, [Ljava/lang/Object;

    .line 173
    .line 174
    aput-object p1, v2, v10

    .line 175
    .line 176
    aput-object v0, v2, v9

    .line 177
    .line 178
    aput-object v1, v2, v4

    .line 179
    .line 180
    invoke-static {v2}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    goto :goto_1

    .line 185
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v1

    .line 197
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 198
    .line 199
    .line 200
    move-result-object v4

    .line 201
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object p1

    .line 205
    invoke-static {v3, v2, p1, v4}, LVa/M6;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object p1

    .line 209
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object p1

    .line 213
    invoke-static {p1}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 214
    .line 215
    .line 216
    move-result-object p1

    .line 217
    :goto_1
    invoke-virtual {p2, p1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 218
    .line 219
    .line 220
    return-void

    .line 221
    :pswitch_1
    invoke-static {p1, v7}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    check-cast p1, Ljava/util/List;

    .line 225
    .line 226
    invoke-interface {p1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v7

    .line 230
    invoke-static {v7, v1}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    check-cast v7, Lkd/P;

    .line 234
    .line 235
    invoke-interface {p1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object p1

    .line 239
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 240
    .line 241
    .line 242
    check-cast p1, Ljava/lang/Boolean;

    .line 243
    .line 244
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 245
    .line 246
    .line 247
    move-result p1

    .line 248
    :try_start_2
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 249
    .line 250
    .line 251
    iput-boolean p1, v7, Lkd/P;->e:Z

    .line 252
    .line 253
    invoke-static {v6}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 254
    .line 255
    .line 256
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 257
    goto :goto_2

    .line 258
    :catchall_2
    move-exception p1

    .line 259
    instance-of v0, p1, Lkd/a;

    .line 260
    .line 261
    if-eqz v0, :cond_2

    .line 262
    .line 263
    check-cast p1, Lkd/a;

    .line 264
    .line 265
    iget-object v0, p1, Lkd/a;->b:Ljava/lang/String;

    .line 266
    .line 267
    iget-object v1, p1, Lkd/a;->c:Ljava/lang/String;

    .line 268
    .line 269
    iget-object p1, p1, Lkd/a;->a:Ljava/lang/String;

    .line 270
    .line 271
    new-array v2, v5, [Ljava/lang/Object;

    .line 272
    .line 273
    aput-object p1, v2, v10

    .line 274
    .line 275
    aput-object v0, v2, v9

    .line 276
    .line 277
    aput-object v1, v2, v4

    .line 278
    .line 279
    invoke-static {v2}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 280
    .line 281
    .line 282
    move-result-object p1

    .line 283
    goto :goto_2

    .line 284
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object v0

    .line 292
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object v1

    .line 296
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 297
    .line 298
    .line 299
    move-result-object v4

    .line 300
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 301
    .line 302
    .line 303
    move-result-object p1

    .line 304
    invoke-static {v3, v2, p1, v4}, LVa/M6;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 305
    .line 306
    .line 307
    move-result-object p1

    .line 308
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 309
    .line 310
    .line 311
    move-result-object p1

    .line 312
    invoke-static {p1}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 313
    .line 314
    .line 315
    move-result-object p1

    .line 316
    :goto_2
    invoke-virtual {p2, p1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 317
    .line 318
    .line 319
    return-void

    .line 320
    :pswitch_2
    invoke-static {p1, v7}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 321
    .line 322
    .line 323
    check-cast p1, Ljava/util/List;

    .line 324
    .line 325
    invoke-interface {p1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 326
    .line 327
    .line 328
    move-result-object v7

    .line 329
    invoke-static {v7, v1}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 330
    .line 331
    .line 332
    check-cast v7, Lkd/P;

    .line 333
    .line 334
    invoke-interface {p1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    move-result-object p1

    .line 338
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 339
    .line 340
    .line 341
    check-cast p1, Ljava/lang/Boolean;

    .line 342
    .line 343
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 344
    .line 345
    .line 346
    move-result p1

    .line 347
    :try_start_3
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 348
    .line 349
    .line 350
    iput-boolean p1, v7, Lkd/P;->d:Z

    .line 351
    .line 352
    invoke-static {v6}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 353
    .line 354
    .line 355
    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 356
    goto :goto_3

    .line 357
    :catchall_3
    move-exception p1

    .line 358
    instance-of v0, p1, Lkd/a;

    .line 359
    .line 360
    if-eqz v0, :cond_3

    .line 361
    .line 362
    check-cast p1, Lkd/a;

    .line 363
    .line 364
    iget-object v0, p1, Lkd/a;->b:Ljava/lang/String;

    .line 365
    .line 366
    iget-object v1, p1, Lkd/a;->c:Ljava/lang/String;

    .line 367
    .line 368
    iget-object p1, p1, Lkd/a;->a:Ljava/lang/String;

    .line 369
    .line 370
    new-array v2, v5, [Ljava/lang/Object;

    .line 371
    .line 372
    aput-object p1, v2, v10

    .line 373
    .line 374
    aput-object v0, v2, v9

    .line 375
    .line 376
    aput-object v1, v2, v4

    .line 377
    .line 378
    invoke-static {v2}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 379
    .line 380
    .line 381
    move-result-object p1

    .line 382
    goto :goto_3

    .line 383
    :cond_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 384
    .line 385
    .line 386
    move-result-object v0

    .line 387
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 388
    .line 389
    .line 390
    move-result-object v0

    .line 391
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 392
    .line 393
    .line 394
    move-result-object v1

    .line 395
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 396
    .line 397
    .line 398
    move-result-object v4

    .line 399
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 400
    .line 401
    .line 402
    move-result-object p1

    .line 403
    invoke-static {v3, v2, p1, v4}, LVa/M6;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 404
    .line 405
    .line 406
    move-result-object p1

    .line 407
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 408
    .line 409
    .line 410
    move-result-object p1

    .line 411
    invoke-static {p1}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 412
    .line 413
    .line 414
    move-result-object p1

    .line 415
    :goto_3
    invoke-virtual {p2, p1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 416
    .line 417
    .line 418
    return-void

    .line 419
    :pswitch_3
    invoke-static {p1, v7}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 420
    .line 421
    .line 422
    check-cast p1, Ljava/util/List;

    .line 423
    .line 424
    invoke-interface {p1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 425
    .line 426
    .line 427
    move-result-object v7

    .line 428
    invoke-static {v7, v1}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 429
    .line 430
    .line 431
    check-cast v7, Lkd/P;

    .line 432
    .line 433
    invoke-interface {p1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 434
    .line 435
    .line 436
    move-result-object p1

    .line 437
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 438
    .line 439
    .line 440
    check-cast p1, Ljava/lang/Boolean;

    .line 441
    .line 442
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 443
    .line 444
    .line 445
    move-result p1

    .line 446
    :try_start_4
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 447
    .line 448
    .line 449
    iput-boolean p1, v7, Lkd/P;->c:Z

    .line 450
    .line 451
    invoke-static {v6}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 452
    .line 453
    .line 454
    move-result-object p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 455
    goto :goto_4

    .line 456
    :catchall_4
    move-exception p1

    .line 457
    instance-of v0, p1, Lkd/a;

    .line 458
    .line 459
    if-eqz v0, :cond_4

    .line 460
    .line 461
    check-cast p1, Lkd/a;

    .line 462
    .line 463
    iget-object v0, p1, Lkd/a;->b:Ljava/lang/String;

    .line 464
    .line 465
    iget-object v1, p1, Lkd/a;->c:Ljava/lang/String;

    .line 466
    .line 467
    iget-object p1, p1, Lkd/a;->a:Ljava/lang/String;

    .line 468
    .line 469
    new-array v2, v5, [Ljava/lang/Object;

    .line 470
    .line 471
    aput-object p1, v2, v10

    .line 472
    .line 473
    aput-object v0, v2, v9

    .line 474
    .line 475
    aput-object v1, v2, v4

    .line 476
    .line 477
    invoke-static {v2}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 478
    .line 479
    .line 480
    move-result-object p1

    .line 481
    goto :goto_4

    .line 482
    :cond_4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 483
    .line 484
    .line 485
    move-result-object v0

    .line 486
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 487
    .line 488
    .line 489
    move-result-object v0

    .line 490
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 491
    .line 492
    .line 493
    move-result-object v1

    .line 494
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 495
    .line 496
    .line 497
    move-result-object v4

    .line 498
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 499
    .line 500
    .line 501
    move-result-object p1

    .line 502
    invoke-static {v3, v2, p1, v4}, LVa/M6;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 503
    .line 504
    .line 505
    move-result-object p1

    .line 506
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 507
    .line 508
    .line 509
    move-result-object p1

    .line 510
    invoke-static {p1}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 511
    .line 512
    .line 513
    move-result-object p1

    .line 514
    :goto_4
    invoke-virtual {p2, p1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 515
    .line 516
    .line 517
    return-void

    .line 518
    :pswitch_4
    invoke-static {p1, v7}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 519
    .line 520
    .line 521
    check-cast p1, Ljava/util/List;

    .line 522
    .line 523
    invoke-interface {p1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 524
    .line 525
    .line 526
    move-result-object p1

    .line 527
    const-string v0, "null cannot be cast to non-null type kotlin.Long"

    .line 528
    .line 529
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 530
    .line 531
    .line 532
    check-cast p1, Ljava/lang/Long;

    .line 533
    .line 534
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 535
    .line 536
    .line 537
    move-result-wide v0

    .line 538
    :try_start_5
    iget-object p1, v8, Lkd/i;->a:LC8/i;

    .line 539
    .line 540
    iget-object p1, p1, LC8/i;->d:Ljava/lang/Object;

    .line 541
    .line 542
    check-cast p1, Lkd/d;

    .line 543
    .line 544
    new-instance v7, Lkd/P;

    .line 545
    .line 546
    invoke-direct {v7, v8}, Lkd/P;-><init>(Lkd/i;)V

    .line 547
    .line 548
    .line 549
    invoke-virtual {p1, v0, v1, v7}, Lkd/d;->a(JLjava/lang/Object;)V

    .line 550
    .line 551
    .line 552
    invoke-static {v6}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 553
    .line 554
    .line 555
    move-result-object p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 556
    goto :goto_5

    .line 557
    :catchall_5
    move-exception p1

    .line 558
    instance-of v0, p1, Lkd/a;

    .line 559
    .line 560
    if-eqz v0, :cond_5

    .line 561
    .line 562
    check-cast p1, Lkd/a;

    .line 563
    .line 564
    iget-object v0, p1, Lkd/a;->b:Ljava/lang/String;

    .line 565
    .line 566
    iget-object v1, p1, Lkd/a;->c:Ljava/lang/String;

    .line 567
    .line 568
    iget-object p1, p1, Lkd/a;->a:Ljava/lang/String;

    .line 569
    .line 570
    new-array v2, v5, [Ljava/lang/Object;

    .line 571
    .line 572
    aput-object p1, v2, v10

    .line 573
    .line 574
    aput-object v0, v2, v9

    .line 575
    .line 576
    aput-object v1, v2, v4

    .line 577
    .line 578
    invoke-static {v2}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 579
    .line 580
    .line 581
    move-result-object p1

    .line 582
    goto :goto_5

    .line 583
    :cond_5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 584
    .line 585
    .line 586
    move-result-object v0

    .line 587
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 588
    .line 589
    .line 590
    move-result-object v0

    .line 591
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 592
    .line 593
    .line 594
    move-result-object v1

    .line 595
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 596
    .line 597
    .line 598
    move-result-object v4

    .line 599
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 600
    .line 601
    .line 602
    move-result-object p1

    .line 603
    invoke-static {v3, v2, p1, v4}, LVa/M6;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 604
    .line 605
    .line 606
    move-result-object p1

    .line 607
    filled-new-array {v0, v1, p1}, [Ljava/lang/String;

    .line 608
    .line 609
    .line 610
    move-result-object p1

    .line 611
    invoke-static {p1}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 612
    .line 613
    .line 614
    move-result-object p1

    .line 615
    :goto_5
    invoke-virtual {p2, p1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 616
    .line 617
    .line 618
    return-void

    .line 619
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
