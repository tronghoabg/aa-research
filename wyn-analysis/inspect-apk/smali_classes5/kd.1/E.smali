.class public final synthetic Lkd/E;
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
    iput p2, p0, Lkd/E;->a:I

    iput-object p1, p0, Lkd/E;->b:Lkd/s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Lba/a;)V
    .locals 17

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
    const-string v3, "null cannot be cast to non-null type kotlin.Long"

    .line 8
    .line 9
    const-string v4, "null cannot be cast to non-null type kotlin.Boolean"

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    const-string v6, ", Stacktrace: "

    .line 13
    .line 14
    const-string v7, "Cause: "

    .line 15
    .line 16
    const-string v8, "null cannot be cast to non-null type android.view.View"

    .line 17
    .line 18
    const-string v9, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 19
    .line 20
    iget-object v10, v1, Lkd/E;->b:Lkd/s;

    .line 21
    .line 22
    const/4 v11, 0x3

    .line 23
    const/4 v12, 0x2

    .line 24
    const/4 v13, 0x1

    .line 25
    const/4 v14, 0x0

    .line 26
    iget v15, v1, Lkd/E;->a:I

    .line 27
    .line 28
    packed-switch v15, :pswitch_data_0

    .line 29
    .line 30
    .line 31
    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    check-cast v0, Ljava/util/List;

    .line 35
    .line 36
    invoke-interface {v0, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    invoke-static {v3, v8}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    check-cast v3, Landroid/view/View;

    .line 44
    .line 45
    invoke-interface {v0, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    const-string v4, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.OverScrollMode"

    .line 50
    .line 51
    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    check-cast v0, Lkd/v;

    .line 55
    .line 56
    :try_start_0
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-eqz v0, :cond_3

    .line 64
    .line 65
    if-eq v0, v13, :cond_2

    .line 66
    .line 67
    if-eq v0, v12, :cond_1

    .line 68
    .line 69
    if-eq v0, v11, :cond_0

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_0
    sget-object v0, Lkd/v;->c:Lkd/v;

    .line 73
    .line 74
    iget-object v3, v10, Lkd/s;->a:LC8/i;

    .line 75
    .line 76
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    new-instance v3, Ljava/lang/IllegalArgumentException;

    .line 80
    .line 81
    new-instance v4, Ljava/lang/StringBuilder;

    .line 82
    .line 83
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    const-string v0, " doesn\'t represent a native value."

    .line 90
    .line 91
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-direct {v3, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    throw v3

    .line 102
    :cond_1
    invoke-virtual {v3, v12}, Landroid/view/View;->setOverScrollMode(I)V

    .line 103
    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_2
    invoke-virtual {v3, v13}, Landroid/view/View;->setOverScrollMode(I)V

    .line 107
    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_3
    invoke-virtual {v3, v14}, Landroid/view/View;->setOverScrollMode(I)V

    .line 111
    .line 112
    .line 113
    :goto_0
    invoke-static {v5}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 114
    .line 115
    .line 116
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 117
    goto :goto_1

    .line 118
    :catchall_0
    move-exception v0

    .line 119
    instance-of v3, v0, Lkd/a;

    .line 120
    .line 121
    if-eqz v3, :cond_4

    .line 122
    .line 123
    check-cast v0, Lkd/a;

    .line 124
    .line 125
    iget-object v3, v0, Lkd/a;->b:Ljava/lang/String;

    .line 126
    .line 127
    iget-object v4, v0, Lkd/a;->c:Ljava/lang/String;

    .line 128
    .line 129
    iget-object v0, v0, Lkd/a;->a:Ljava/lang/String;

    .line 130
    .line 131
    new-array v5, v11, [Ljava/lang/Object;

    .line 132
    .line 133
    aput-object v0, v5, v14

    .line 134
    .line 135
    aput-object v3, v5, v13

    .line 136
    .line 137
    aput-object v4, v5, v12

    .line 138
    .line 139
    invoke-static {v5}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    goto :goto_1

    .line 144
    :cond_4
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    move-result-object v3

    .line 148
    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v3

    .line 152
    invoke-virtual {v0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v4

    .line 156
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 157
    .line 158
    .line 159
    move-result-object v5

    .line 160
    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    invoke-static {v7, v6, v0, v5}, LVa/M6;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    filled-new-array {v3, v4, v0}, [Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    invoke-static {v0}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    :goto_1
    invoke-virtual {v2, v0}, Lba/a;->c(Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    return-void

    .line 180
    :pswitch_0
    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    check-cast v0, Ljava/util/List;

    .line 184
    .line 185
    invoke-interface {v0, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v3

    .line 189
    invoke-static {v3, v8}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    check-cast v3, Landroid/view/View;

    .line 193
    .line 194
    invoke-interface {v0, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    check-cast v0, Ljava/lang/Boolean;

    .line 202
    .line 203
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 204
    .line 205
    .line 206
    move-result v0

    .line 207
    :try_start_1
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 208
    .line 209
    .line 210
    invoke-virtual {v3, v0}, Landroid/view/View;->setHorizontalScrollBarEnabled(Z)V

    .line 211
    .line 212
    .line 213
    invoke-static {v5}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 214
    .line 215
    .line 216
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 217
    goto :goto_2

    .line 218
    :catchall_1
    move-exception v0

    .line 219
    instance-of v3, v0, Lkd/a;

    .line 220
    .line 221
    if-eqz v3, :cond_5

    .line 222
    .line 223
    check-cast v0, Lkd/a;

    .line 224
    .line 225
    iget-object v3, v0, Lkd/a;->b:Ljava/lang/String;

    .line 226
    .line 227
    iget-object v4, v0, Lkd/a;->c:Ljava/lang/String;

    .line 228
    .line 229
    iget-object v0, v0, Lkd/a;->a:Ljava/lang/String;

    .line 230
    .line 231
    new-array v5, v11, [Ljava/lang/Object;

    .line 232
    .line 233
    aput-object v0, v5, v14

    .line 234
    .line 235
    aput-object v3, v5, v13

    .line 236
    .line 237
    aput-object v4, v5, v12

    .line 238
    .line 239
    invoke-static {v5}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    goto :goto_2

    .line 244
    :cond_5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 245
    .line 246
    .line 247
    move-result-object v3

    .line 248
    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object v3

    .line 252
    invoke-virtual {v0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v4

    .line 256
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 257
    .line 258
    .line 259
    move-result-object v5

    .line 260
    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    invoke-static {v7, v6, v0, v5}, LVa/M6;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    filled-new-array {v3, v4, v0}, [Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    invoke-static {v0}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 273
    .line 274
    .line 275
    move-result-object v0

    .line 276
    :goto_2
    invoke-virtual {v2, v0}, Lba/a;->c(Ljava/lang/Object;)V

    .line 277
    .line 278
    .line 279
    return-void

    .line 280
    :pswitch_1
    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 281
    .line 282
    .line 283
    check-cast v0, Ljava/util/List;

    .line 284
    .line 285
    invoke-interface {v0, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object v3

    .line 289
    invoke-static {v3, v8}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 290
    .line 291
    .line 292
    check-cast v3, Landroid/view/View;

    .line 293
    .line 294
    invoke-interface {v0, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object v0

    .line 298
    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 299
    .line 300
    .line 301
    check-cast v0, Ljava/lang/Boolean;

    .line 302
    .line 303
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 304
    .line 305
    .line 306
    move-result v0

    .line 307
    :try_start_2
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 308
    .line 309
    .line 310
    invoke-virtual {v3, v0}, Landroid/view/View;->setVerticalScrollBarEnabled(Z)V

    .line 311
    .line 312
    .line 313
    invoke-static {v5}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 314
    .line 315
    .line 316
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 317
    goto :goto_3

    .line 318
    :catchall_2
    move-exception v0

    .line 319
    instance-of v3, v0, Lkd/a;

    .line 320
    .line 321
    if-eqz v3, :cond_6

    .line 322
    .line 323
    check-cast v0, Lkd/a;

    .line 324
    .line 325
    iget-object v3, v0, Lkd/a;->b:Ljava/lang/String;

    .line 326
    .line 327
    iget-object v4, v0, Lkd/a;->c:Ljava/lang/String;

    .line 328
    .line 329
    iget-object v0, v0, Lkd/a;->a:Ljava/lang/String;

    .line 330
    .line 331
    new-array v5, v11, [Ljava/lang/Object;

    .line 332
    .line 333
    aput-object v0, v5, v14

    .line 334
    .line 335
    aput-object v3, v5, v13

    .line 336
    .line 337
    aput-object v4, v5, v12

    .line 338
    .line 339
    invoke-static {v5}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 340
    .line 341
    .line 342
    move-result-object v0

    .line 343
    goto :goto_3

    .line 344
    :cond_6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 345
    .line 346
    .line 347
    move-result-object v3

    .line 348
    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 349
    .line 350
    .line 351
    move-result-object v3

    .line 352
    invoke-virtual {v0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 353
    .line 354
    .line 355
    move-result-object v4

    .line 356
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 357
    .line 358
    .line 359
    move-result-object v5

    .line 360
    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 361
    .line 362
    .line 363
    move-result-object v0

    .line 364
    invoke-static {v7, v6, v0, v5}, LVa/M6;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 365
    .line 366
    .line 367
    move-result-object v0

    .line 368
    filled-new-array {v3, v4, v0}, [Ljava/lang/String;

    .line 369
    .line 370
    .line 371
    move-result-object v0

    .line 372
    invoke-static {v0}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 373
    .line 374
    .line 375
    move-result-object v0

    .line 376
    :goto_3
    invoke-virtual {v2, v0}, Lba/a;->c(Ljava/lang/Object;)V

    .line 377
    .line 378
    .line 379
    return-void

    .line 380
    :pswitch_2
    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 381
    .line 382
    .line 383
    check-cast v0, Ljava/util/List;

    .line 384
    .line 385
    invoke-interface {v0, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 386
    .line 387
    .line 388
    move-result-object v0

    .line 389
    invoke-static {v0, v8}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 390
    .line 391
    .line 392
    check-cast v0, Landroid/view/View;

    .line 393
    .line 394
    :try_start_3
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 395
    .line 396
    .line 397
    new-instance v3, Lkd/Y;

    .line 398
    .line 399
    invoke-virtual {v0}, Landroid/view/View;->getScrollX()I

    .line 400
    .line 401
    .line 402
    move-result v4

    .line 403
    int-to-long v4, v4

    .line 404
    invoke-virtual {v0}, Landroid/view/View;->getScrollY()I

    .line 405
    .line 406
    .line 407
    move-result v0

    .line 408
    int-to-long v8, v0

    .line 409
    invoke-direct {v3, v4, v5, v8, v9}, Lkd/Y;-><init>(JJ)V

    .line 410
    .line 411
    .line 412
    invoke-static {v3}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 413
    .line 414
    .line 415
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 416
    goto :goto_4

    .line 417
    :catchall_3
    move-exception v0

    .line 418
    instance-of v3, v0, Lkd/a;

    .line 419
    .line 420
    if-eqz v3, :cond_7

    .line 421
    .line 422
    check-cast v0, Lkd/a;

    .line 423
    .line 424
    iget-object v3, v0, Lkd/a;->b:Ljava/lang/String;

    .line 425
    .line 426
    iget-object v4, v0, Lkd/a;->c:Ljava/lang/String;

    .line 427
    .line 428
    iget-object v0, v0, Lkd/a;->a:Ljava/lang/String;

    .line 429
    .line 430
    new-array v5, v11, [Ljava/lang/Object;

    .line 431
    .line 432
    aput-object v0, v5, v14

    .line 433
    .line 434
    aput-object v3, v5, v13

    .line 435
    .line 436
    aput-object v4, v5, v12

    .line 437
    .line 438
    invoke-static {v5}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 439
    .line 440
    .line 441
    move-result-object v0

    .line 442
    goto :goto_4

    .line 443
    :cond_7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 444
    .line 445
    .line 446
    move-result-object v3

    .line 447
    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 448
    .line 449
    .line 450
    move-result-object v3

    .line 451
    invoke-virtual {v0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 452
    .line 453
    .line 454
    move-result-object v4

    .line 455
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 456
    .line 457
    .line 458
    move-result-object v5

    .line 459
    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 460
    .line 461
    .line 462
    move-result-object v0

    .line 463
    invoke-static {v7, v6, v0, v5}, LVa/M6;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 464
    .line 465
    .line 466
    move-result-object v0

    .line 467
    filled-new-array {v3, v4, v0}, [Ljava/lang/String;

    .line 468
    .line 469
    .line 470
    move-result-object v0

    .line 471
    invoke-static {v0}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 472
    .line 473
    .line 474
    move-result-object v0

    .line 475
    :goto_4
    invoke-virtual {v2, v0}, Lba/a;->c(Ljava/lang/Object;)V

    .line 476
    .line 477
    .line 478
    return-void

    .line 479
    :pswitch_3
    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 480
    .line 481
    .line 482
    check-cast v0, Ljava/util/List;

    .line 483
    .line 484
    invoke-interface {v0, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 485
    .line 486
    .line 487
    move-result-object v4

    .line 488
    invoke-static {v4, v8}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 489
    .line 490
    .line 491
    check-cast v4, Landroid/view/View;

    .line 492
    .line 493
    invoke-interface {v0, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 494
    .line 495
    .line 496
    move-result-object v8

    .line 497
    invoke-static {v8, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 498
    .line 499
    .line 500
    check-cast v8, Ljava/lang/Long;

    .line 501
    .line 502
    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    .line 503
    .line 504
    .line 505
    move-result-wide v8

    .line 506
    invoke-interface {v0, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 507
    .line 508
    .line 509
    move-result-object v0

    .line 510
    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 511
    .line 512
    .line 513
    check-cast v0, Ljava/lang/Long;

    .line 514
    .line 515
    move v15, v12

    .line 516
    move/from16 v16, v13

    .line 517
    .line 518
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 519
    .line 520
    .line 521
    move-result-wide v12

    .line 522
    :try_start_4
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 523
    .line 524
    .line 525
    long-to-int v0, v8

    .line 526
    long-to-int v3, v12

    .line 527
    invoke-virtual {v4, v0, v3}, Landroid/view/View;->scrollBy(II)V

    .line 528
    .line 529
    .line 530
    invoke-static {v5}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 531
    .line 532
    .line 533
    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 534
    goto :goto_5

    .line 535
    :catchall_4
    move-exception v0

    .line 536
    instance-of v3, v0, Lkd/a;

    .line 537
    .line 538
    if-eqz v3, :cond_8

    .line 539
    .line 540
    check-cast v0, Lkd/a;

    .line 541
    .line 542
    iget-object v3, v0, Lkd/a;->b:Ljava/lang/String;

    .line 543
    .line 544
    iget-object v4, v0, Lkd/a;->c:Ljava/lang/String;

    .line 545
    .line 546
    iget-object v0, v0, Lkd/a;->a:Ljava/lang/String;

    .line 547
    .line 548
    new-array v5, v11, [Ljava/lang/Object;

    .line 549
    .line 550
    aput-object v0, v5, v14

    .line 551
    .line 552
    aput-object v3, v5, v16

    .line 553
    .line 554
    aput-object v4, v5, v15

    .line 555
    .line 556
    invoke-static {v5}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 557
    .line 558
    .line 559
    move-result-object v0

    .line 560
    goto :goto_5

    .line 561
    :cond_8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 562
    .line 563
    .line 564
    move-result-object v3

    .line 565
    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 566
    .line 567
    .line 568
    move-result-object v3

    .line 569
    invoke-virtual {v0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 570
    .line 571
    .line 572
    move-result-object v4

    .line 573
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 574
    .line 575
    .line 576
    move-result-object v5

    .line 577
    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 578
    .line 579
    .line 580
    move-result-object v0

    .line 581
    invoke-static {v7, v6, v0, v5}, LVa/M6;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 582
    .line 583
    .line 584
    move-result-object v0

    .line 585
    filled-new-array {v3, v4, v0}, [Ljava/lang/String;

    .line 586
    .line 587
    .line 588
    move-result-object v0

    .line 589
    invoke-static {v0}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 590
    .line 591
    .line 592
    move-result-object v0

    .line 593
    :goto_5
    invoke-virtual {v2, v0}, Lba/a;->c(Ljava/lang/Object;)V

    .line 594
    .line 595
    .line 596
    return-void

    .line 597
    :pswitch_4
    move v15, v12

    .line 598
    move/from16 v16, v13

    .line 599
    .line 600
    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 601
    .line 602
    .line 603
    check-cast v0, Ljava/util/List;

    .line 604
    .line 605
    invoke-interface {v0, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 606
    .line 607
    .line 608
    move-result-object v4

    .line 609
    invoke-static {v4, v8}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 610
    .line 611
    .line 612
    check-cast v4, Landroid/view/View;

    .line 613
    .line 614
    move/from16 v8, v16

    .line 615
    .line 616
    invoke-interface {v0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 617
    .line 618
    .line 619
    move-result-object v9

    .line 620
    invoke-static {v9, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 621
    .line 622
    .line 623
    check-cast v9, Ljava/lang/Long;

    .line 624
    .line 625
    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    .line 626
    .line 627
    .line 628
    move-result-wide v8

    .line 629
    invoke-interface {v0, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 630
    .line 631
    .line 632
    move-result-object v0

    .line 633
    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 634
    .line 635
    .line 636
    check-cast v0, Ljava/lang/Long;

    .line 637
    .line 638
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 639
    .line 640
    .line 641
    move-result-wide v12

    .line 642
    :try_start_5
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 643
    .line 644
    .line 645
    long-to-int v0, v8

    .line 646
    long-to-int v3, v12

    .line 647
    invoke-virtual {v4, v0, v3}, Landroid/view/View;->scrollTo(II)V

    .line 648
    .line 649
    .line 650
    invoke-static {v5}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 651
    .line 652
    .line 653
    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 654
    goto :goto_6

    .line 655
    :catchall_5
    move-exception v0

    .line 656
    instance-of v3, v0, Lkd/a;

    .line 657
    .line 658
    if-eqz v3, :cond_9

    .line 659
    .line 660
    check-cast v0, Lkd/a;

    .line 661
    .line 662
    iget-object v3, v0, Lkd/a;->b:Ljava/lang/String;

    .line 663
    .line 664
    iget-object v4, v0, Lkd/a;->c:Ljava/lang/String;

    .line 665
    .line 666
    iget-object v0, v0, Lkd/a;->a:Ljava/lang/String;

    .line 667
    .line 668
    new-array v5, v11, [Ljava/lang/Object;

    .line 669
    .line 670
    aput-object v0, v5, v14

    .line 671
    .line 672
    const/16 v16, 0x1

    .line 673
    .line 674
    aput-object v3, v5, v16

    .line 675
    .line 676
    const/4 v15, 0x2

    .line 677
    aput-object v4, v5, v15

    .line 678
    .line 679
    invoke-static {v5}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 680
    .line 681
    .line 682
    move-result-object v0

    .line 683
    goto :goto_6

    .line 684
    :cond_9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 685
    .line 686
    .line 687
    move-result-object v3

    .line 688
    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 689
    .line 690
    .line 691
    move-result-object v3

    .line 692
    invoke-virtual {v0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 693
    .line 694
    .line 695
    move-result-object v4

    .line 696
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 697
    .line 698
    .line 699
    move-result-object v5

    .line 700
    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 701
    .line 702
    .line 703
    move-result-object v0

    .line 704
    invoke-static {v7, v6, v0, v5}, LVa/M6;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 705
    .line 706
    .line 707
    move-result-object v0

    .line 708
    filled-new-array {v3, v4, v0}, [Ljava/lang/String;

    .line 709
    .line 710
    .line 711
    move-result-object v0

    .line 712
    invoke-static {v0}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 713
    .line 714
    .line 715
    move-result-object v0

    .line 716
    :goto_6
    invoke-virtual {v2, v0}, Lba/a;->c(Ljava/lang/Object;)V

    .line 717
    .line 718
    .line 719
    return-void

    .line 720
    nop

    .line 721
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
