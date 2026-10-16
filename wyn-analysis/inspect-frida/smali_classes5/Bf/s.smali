.class public final synthetic LBf/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, LBf/s;->a:I

    iput-object p1, p0, LBf/s;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "$this$DelimitedRangesSequence"

    .line 5
    .line 6
    const-string v3, " for "

    .line 7
    .line 8
    const-string v4, "Retry attempt #"

    .line 9
    .line 10
    const-string v5, "it"

    .line 11
    .line 12
    const-string v6, "$this$modifyRequest"

    .line 13
    .line 14
    const-string v7, "buttonType"

    .line 15
    .line 16
    const-string v8, "key"

    .line 17
    .line 18
    const-string v9, "values"

    .line 19
    .line 20
    const/4 v10, 0x0

    .line 21
    const/4 v11, 0x1

    .line 22
    sget-object v12, Lef/C;->a:Lef/C;

    .line 23
    .line 24
    iget-object v13, v0, LBf/s;->b:Ljava/lang/Object;

    .line 25
    .line 26
    iget v14, v0, LBf/s;->a:I

    .line 27
    .line 28
    packed-switch v14, :pswitch_data_0

    .line 29
    .line 30
    .line 31
    move-object/from16 v1, p1

    .line 32
    .line 33
    check-cast v1, Ljava/lang/String;

    .line 34
    .line 35
    move-object/from16 v2, p2

    .line 36
    .line 37
    check-cast v2, Ljava/util/List;

    .line 38
    .line 39
    invoke-static {v1, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-static {v2, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    sget-object v3, LJd/p;->a:Ljava/util/List;

    .line 46
    .line 47
    const-string v3, "Content-Length"

    .line 48
    .line 49
    invoke-virtual {v3, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-eqz v3, :cond_0

    .line 54
    .line 55
    goto :goto_3

    .line 56
    :cond_0
    const-string v3, "Content-Type"

    .line 57
    .line 58
    invoke-virtual {v3, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    if-eqz v3, :cond_1

    .line 63
    .line 64
    goto :goto_3

    .line 65
    :cond_1
    sget-object v3, Lzd/j;->a:Ljava/util/Set;

    .line 66
    .line 67
    invoke-interface {v3, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    check-cast v13, LAd/d;

    .line 72
    .line 73
    if-eqz v3, :cond_2

    .line 74
    .line 75
    check-cast v2, Ljava/lang/Iterable;

    .line 76
    .line 77
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    if-eqz v3, :cond_4

    .line 86
    .line 87
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    check-cast v3, Ljava/lang/String;

    .line 92
    .line 93
    invoke-virtual {v13, v1, v3}, LAd/d;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_2
    const-string v3, "Cookie"

    .line 98
    .line 99
    invoke-virtual {v3, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v3

    .line 103
    if-eqz v3, :cond_3

    .line 104
    .line 105
    const-string v3, "; "

    .line 106
    .line 107
    :goto_1
    move-object v5, v3

    .line 108
    goto :goto_2

    .line 109
    :cond_3
    const-string v3, ","

    .line 110
    .line 111
    goto :goto_1

    .line 112
    :goto_2
    move-object v4, v2

    .line 113
    check-cast v4, Ljava/lang/Iterable;

    .line 114
    .line 115
    const/4 v7, 0x0

    .line 116
    const/4 v8, 0x0

    .line 117
    const/4 v6, 0x0

    .line 118
    const/16 v9, 0x3e

    .line 119
    .line 120
    invoke-static/range {v4 .. v9}, Lff/o;->w0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ltf/l;I)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    invoke-virtual {v13, v1, v2}, LAd/d;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    :cond_4
    :goto_3
    return-object v12

    .line 128
    :pswitch_0
    move-object/from16 v1, p1

    .line 129
    .line 130
    check-cast v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/d;

    .line 131
    .line 132
    move-object/from16 v2, p2

    .line 133
    .line 134
    check-cast v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/c;

    .line 135
    .line 136
    const-string v3, "button"

    .line 137
    .line 138
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    invoke-static {v2, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    check-cast v13, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/h;

    .line 145
    .line 146
    iget-object v3, v13, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/h;->x:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/l;

    .line 147
    .line 148
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    iget-object v4, v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/l;->j:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/s;

    .line 152
    .line 153
    invoke-virtual {v4, v1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/s;->a(Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/d;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    iget-object v1, v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/l;->j:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/s;

    .line 160
    .line 161
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    invoke-static {v2, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    iget-object v1, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/s;->a:Ljava/util/LinkedHashMap;

    .line 168
    .line 169
    invoke-interface {v1, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    return-object v12

    .line 173
    :pswitch_1
    move-object/from16 v1, p1

    .line 174
    .line 175
    check-cast v1, Ld0/c;

    .line 176
    .line 177
    move-object/from16 v2, p2

    .line 178
    .line 179
    check-cast v2, Ld0/c;

    .line 180
    .line 181
    iget-wide v1, v1, Ld0/c;->a:J

    .line 182
    .line 183
    invoke-static {v1, v2}, Ld0/c;->b(J)F

    .line 184
    .line 185
    .line 186
    move-result v3

    .line 187
    float-to-int v3, v3

    .line 188
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 189
    .line 190
    .line 191
    move-result-object v4

    .line 192
    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 193
    .line 194
    .line 195
    move-result-object v4

    .line 196
    int-to-float v3, v3

    .line 197
    iget v4, v4, Landroid/util/DisplayMetrics;->density:F

    .line 198
    .line 199
    div-float/2addr v3, v4

    .line 200
    invoke-static {v1, v2}, Ld0/c;->c(J)F

    .line 201
    .line 202
    .line 203
    move-result v1

    .line 204
    float-to-int v1, v1

    .line 205
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 206
    .line 207
    .line 208
    move-result-object v2

    .line 209
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 210
    .line 211
    .line 212
    move-result-object v2

    .line 213
    int-to-float v1, v1

    .line 214
    iget v2, v2, Landroid/util/DisplayMetrics;->density:F

    .line 215
    .line 216
    div-float/2addr v1, v2

    .line 217
    new-instance v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/g;

    .line 218
    .line 219
    invoke-direct {v2, v3, v1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/g;-><init>(FF)V

    .line 220
    .line 221
    .line 222
    check-cast v13, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/companion/i;

    .line 223
    .line 224
    iput-object v2, v13, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/companion/i;->i:Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/g;

    .line 225
    .line 226
    return-object v12

    .line 227
    :pswitch_2
    move-object/from16 v1, p1

    .line 228
    .line 229
    check-cast v1, Ljava/io/File;

    .line 230
    .line 231
    move-object/from16 v2, p2

    .line 232
    .line 233
    check-cast v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/stream/g;

    .line 234
    .line 235
    new-instance v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/stream/f;

    .line 236
    .line 237
    invoke-direct {v3, v1, v2}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/stream/f;-><init>(Ljava/io/File;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/media/stream/g;)V

    .line 238
    .line 239
    .line 240
    check-cast v13, LGf/t;

    .line 241
    .line 242
    check-cast v13, LGf/s;

    .line 243
    .line 244
    invoke-virtual {v13, v3}, LGf/s;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    return-object v12

    .line 248
    :pswitch_3
    move-object/from16 v1, p1

    .line 249
    .line 250
    check-cast v1, LCd/f0;

    .line 251
    .line 252
    move-object/from16 v2, p2

    .line 253
    .line 254
    check-cast v2, LFd/c;

    .line 255
    .line 256
    invoke-static {v1, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    sget-object v14, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 263
    .line 264
    check-cast v13, LDd/c;

    .line 265
    .line 266
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 267
    .line 268
    .line 269
    new-instance v2, Ljava/lang/StringBuilder;

    .line 270
    .line 271
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 272
    .line 273
    .line 274
    iget v4, v1, LCd/f0;->b:I

    .line 275
    .line 276
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 277
    .line 278
    .line 279
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 280
    .line 281
    .line 282
    iget-object v1, v1, LCd/f0;->a:LFd/c;

    .line 283
    .line 284
    iget-object v1, v1, LFd/c;->a:LJd/B;

    .line 285
    .line 286
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 287
    .line 288
    .line 289
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object v16

    .line 293
    const/16 v17, 0x0

    .line 294
    .line 295
    const/16 v18, 0x0

    .line 296
    .line 297
    const-string v15, "LegacyMediaDownloader"

    .line 298
    .line 299
    const/16 v19, 0xc

    .line 300
    .line 301
    const/16 v20, 0x0

    .line 302
    .line 303
    invoke-static/range {v14 .. v20}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 304
    .line 305
    .line 306
    return-object v12

    .line 307
    :pswitch_4
    move-object/from16 v1, p1

    .line 308
    .line 309
    check-cast v1, LCd/f0;

    .line 310
    .line 311
    move-object/from16 v2, p2

    .line 312
    .line 313
    check-cast v2, LFd/c;

    .line 314
    .line 315
    invoke-static {v1, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 316
    .line 317
    .line 318
    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 319
    .line 320
    .line 321
    sget-object v14, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 322
    .line 323
    check-cast v13, LVa/X7;

    .line 324
    .line 325
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 326
    .line 327
    .line 328
    new-instance v2, Ljava/lang/StringBuilder;

    .line 329
    .line 330
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 331
    .line 332
    .line 333
    iget v4, v1, LCd/f0;->b:I

    .line 334
    .line 335
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 336
    .line 337
    .line 338
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 339
    .line 340
    .line 341
    iget-object v1, v1, LCd/f0;->a:LFd/c;

    .line 342
    .line 343
    iget-object v1, v1, LFd/c;->a:LJd/B;

    .line 344
    .line 345
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 346
    .line 347
    .line 348
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 349
    .line 350
    .line 351
    move-result-object v16

    .line 352
    const/16 v17, 0x0

    .line 353
    .line 354
    const/16 v18, 0x0

    .line 355
    .line 356
    const-string v15, "ChunkedMediaDownloader"

    .line 357
    .line 358
    const/16 v19, 0xc

    .line 359
    .line 360
    const/16 v20, 0x0

    .line 361
    .line 362
    invoke-static/range {v14 .. v20}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 363
    .line 364
    .line 365
    return-object v12

    .line 366
    :pswitch_5
    move-object/from16 v1, p1

    .line 367
    .line 368
    check-cast v1, Ljava/lang/String;

    .line 369
    .line 370
    move-object/from16 v2, p2

    .line 371
    .line 372
    check-cast v2, Ljava/util/List;

    .line 373
    .line 374
    const-string v3, "name"

    .line 375
    .line 376
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 377
    .line 378
    .line 379
    invoke-static {v2, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 380
    .line 381
    .line 382
    check-cast v2, Ljava/lang/Iterable;

    .line 383
    .line 384
    check-cast v13, LA7/B0;

    .line 385
    .line 386
    invoke-virtual {v13, v1, v2}, LA7/B0;->f(Ljava/lang/String;Ljava/lang/Iterable;)V

    .line 387
    .line 388
    .line 389
    return-object v12

    .line 390
    :pswitch_6
    move-object/from16 v1, p1

    .line 391
    .line 392
    check-cast v1, Ljava/lang/String;

    .line 393
    .line 394
    move-object/from16 v2, p2

    .line 395
    .line 396
    check-cast v2, Ljava/util/List;

    .line 397
    .line 398
    invoke-static {v1, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 399
    .line 400
    .line 401
    invoke-static {v2, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 402
    .line 403
    .line 404
    check-cast v13, LJd/B;

    .line 405
    .line 406
    iget-object v3, v13, LJd/B;->i:LJd/z;

    .line 407
    .line 408
    check-cast v2, Ljava/lang/Iterable;

    .line 409
    .line 410
    invoke-virtual {v3, v1, v2}, LA7/B0;->f(Ljava/lang/String;Ljava/lang/Iterable;)V

    .line 411
    .line 412
    .line 413
    return-object v12

    .line 414
    :pswitch_7
    move-object/from16 v1, p1

    .line 415
    .line 416
    check-cast v1, Ljava/lang/Integer;

    .line 417
    .line 418
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 419
    .line 420
    .line 421
    move-result v1

    .line 422
    move-object/from16 v2, p2

    .line 423
    .line 424
    check-cast v2, Ljf/f;

    .line 425
    .line 426
    invoke-interface {v2}, Ljf/f;->getKey()Ljf/g;

    .line 427
    .line 428
    .line 429
    move-result-object v3

    .line 430
    check-cast v13, LIf/z;

    .line 431
    .line 432
    iget-object v4, v13, LIf/z;->b:Ljf/h;

    .line 433
    .line 434
    invoke-interface {v4, v3}, Ljf/h;->get(Ljf/g;)Ljf/f;

    .line 435
    .line 436
    .line 437
    move-result-object v4

    .line 438
    sget-object v5, LEf/l0;->a:LEf/l0;

    .line 439
    .line 440
    if-eq v3, v5, :cond_6

    .line 441
    .line 442
    if-eq v2, v4, :cond_5

    .line 443
    .line 444
    const/high16 v1, -0x80000000

    .line 445
    .line 446
    goto :goto_7

    .line 447
    :cond_5
    add-int/2addr v1, v11

    .line 448
    goto :goto_7

    .line 449
    :cond_6
    check-cast v4, LEf/m0;

    .line 450
    .line 451
    check-cast v2, LEf/m0;

    .line 452
    .line 453
    :goto_4
    if-nez v2, :cond_7

    .line 454
    .line 455
    goto :goto_6

    .line 456
    :cond_7
    if-ne v2, v4, :cond_8

    .line 457
    .line 458
    goto :goto_5

    .line 459
    :cond_8
    instance-of v3, v2, LJf/q;

    .line 460
    .line 461
    if-nez v3, :cond_a

    .line 462
    .line 463
    :goto_5
    move-object v10, v2

    .line 464
    :goto_6
    if-ne v10, v4, :cond_9

    .line 465
    .line 466
    if-nez v4, :cond_5

    .line 467
    .line 468
    :goto_7
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 469
    .line 470
    .line 471
    move-result-object v1

    .line 472
    return-object v1

    .line 473
    :cond_9
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 474
    .line 475
    new-instance v2, Ljava/lang/StringBuilder;

    .line 476
    .line 477
    const-string v3, "Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of "

    .line 478
    .line 479
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 480
    .line 481
    .line 482
    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 483
    .line 484
    .line 485
    const-string v3, ", expected child of "

    .line 486
    .line 487
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 488
    .line 489
    .line 490
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 491
    .line 492
    .line 493
    const-string v3, ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use \'channelFlow\' builder instead of \'flow\'"

    .line 494
    .line 495
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 496
    .line 497
    .line 498
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 499
    .line 500
    .line 501
    move-result-object v2

    .line 502
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 503
    .line 504
    .line 505
    move-result-object v2

    .line 506
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 507
    .line 508
    .line 509
    throw v1

    .line 510
    :cond_a
    check-cast v2, LJf/q;

    .line 511
    .line 512
    sget-object v3, LEf/z0;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 513
    .line 514
    invoke-virtual {v3, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 515
    .line 516
    .line 517
    move-result-object v2

    .line 518
    check-cast v2, LEf/q;

    .line 519
    .line 520
    if-eqz v2, :cond_b

    .line 521
    .line 522
    invoke-interface {v2}, LEf/q;->getParent()LEf/m0;

    .line 523
    .line 524
    .line 525
    move-result-object v2

    .line 526
    goto :goto_4

    .line 527
    :cond_b
    move-object v2, v10

    .line 528
    goto :goto_4

    .line 529
    :pswitch_8
    move-object/from16 v1, p1

    .line 530
    .line 531
    check-cast v1, LCd/d0;

    .line 532
    .line 533
    move-object/from16 v2, p2

    .line 534
    .line 535
    check-cast v2, Ljava/lang/Integer;

    .line 536
    .line 537
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 538
    .line 539
    .line 540
    move-result v2

    .line 541
    const-string v3, "$this$delayMillis"

    .line 542
    .line 543
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 544
    .line 545
    .line 546
    sub-int/2addr v2, v11

    .line 547
    int-to-double v1, v2

    .line 548
    const-wide/high16 v3, 0x4000000000000000L    # 2.0

    .line 549
    .line 550
    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->pow(DD)D

    .line 551
    .line 552
    .line 553
    move-result-wide v1

    .line 554
    const-wide/16 v3, 0x3e8

    .line 555
    .line 556
    long-to-double v5, v3

    .line 557
    mul-double/2addr v1, v5

    .line 558
    double-to-long v1, v1

    .line 559
    const-wide/32 v5, 0xea60

    .line 560
    .line 561
    .line 562
    invoke-static {v1, v2, v5, v6}, Ljava/lang/Math;->min(JJ)J

    .line 563
    .line 564
    .line 565
    move-result-wide v1

    .line 566
    check-cast v13, LCd/Y;

    .line 567
    .line 568
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 569
    .line 570
    .line 571
    sget-object v5, Lxf/d;->a:Lxf/a;

    .line 572
    .line 573
    invoke-virtual {v5, v3, v4}, Lxf/d;->e(J)J

    .line 574
    .line 575
    .line 576
    move-result-wide v3

    .line 577
    add-long/2addr v3, v1

    .line 578
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 579
    .line 580
    .line 581
    move-result-object v1

    .line 582
    return-object v1

    .line 583
    :pswitch_9
    move-object/from16 v1, p1

    .line 584
    .line 585
    check-cast v1, LCd/d0;

    .line 586
    .line 587
    move-object/from16 v2, p2

    .line 588
    .line 589
    check-cast v2, Ljava/lang/Integer;

    .line 590
    .line 591
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 592
    .line 593
    .line 594
    const-string v3, "<this>"

    .line 595
    .line 596
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 597
    .line 598
    .line 599
    check-cast v13, Ltf/p;

    .line 600
    .line 601
    iget-object v3, v1, LCd/d0;->a:LGd/a;

    .line 602
    .line 603
    if-eqz v3, :cond_c

    .line 604
    .line 605
    invoke-interface {v3}, LJd/q;->a()LJd/m;

    .line 606
    .line 607
    .line 608
    move-result-object v3

    .line 609
    if-eqz v3, :cond_c

    .line 610
    .line 611
    sget-object v4, LJd/p;->a:Ljava/util/List;

    .line 612
    .line 613
    const-string v4, "Retry-After"

    .line 614
    .line 615
    invoke-interface {v3, v4}, LNd/j;->get(Ljava/lang/String;)Ljava/lang/String;

    .line 616
    .line 617
    .line 618
    move-result-object v3

    .line 619
    if-eqz v3, :cond_c

    .line 620
    .line 621
    invoke-static {v3}, LBf/r;->m0(Ljava/lang/String;)Ljava/lang/Long;

    .line 622
    .line 623
    .line 624
    move-result-object v3

    .line 625
    if-eqz v3, :cond_c

    .line 626
    .line 627
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 628
    .line 629
    .line 630
    move-result-wide v3

    .line 631
    const/16 v5, 0x3e8

    .line 632
    .line 633
    int-to-long v5, v5

    .line 634
    mul-long/2addr v3, v5

    .line 635
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 636
    .line 637
    .line 638
    move-result-object v10

    .line 639
    :cond_c
    invoke-interface {v13, v1, v2}, Ltf/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 640
    .line 641
    .line 642
    move-result-object v1

    .line 643
    check-cast v1, Ljava/lang/Number;

    .line 644
    .line 645
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 646
    .line 647
    .line 648
    move-result-wide v1

    .line 649
    if-eqz v10, :cond_d

    .line 650
    .line 651
    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    .line 652
    .line 653
    .line 654
    move-result-wide v3

    .line 655
    goto :goto_8

    .line 656
    :cond_d
    const-wide/16 v3, 0x0

    .line 657
    .line 658
    :goto_8
    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->max(JJ)J

    .line 659
    .line 660
    .line 661
    move-result-wide v1

    .line 662
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 663
    .line 664
    .line 665
    move-result-object v1

    .line 666
    return-object v1

    .line 667
    :pswitch_a
    move-object/from16 v4, p1

    .line 668
    .line 669
    check-cast v4, Ljava/lang/CharSequence;

    .line 670
    .line 671
    move-object/from16 v3, p2

    .line 672
    .line 673
    check-cast v3, Ljava/lang/Integer;

    .line 674
    .line 675
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 676
    .line 677
    .line 678
    move-result v3

    .line 679
    invoke-static {v4, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 680
    .line 681
    .line 682
    check-cast v13, Ljava/util/List;

    .line 683
    .line 684
    check-cast v13, Ljava/util/Collection;

    .line 685
    .line 686
    invoke-interface {v13}, Ljava/util/Collection;->size()I

    .line 687
    .line 688
    .line 689
    move-result v2

    .line 690
    if-ne v2, v11, :cond_10

    .line 691
    .line 692
    check-cast v13, Ljava/lang/Iterable;

    .line 693
    .line 694
    invoke-static {v13}, Lff/o;->H0(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 695
    .line 696
    .line 697
    move-result-object v2

    .line 698
    check-cast v2, Ljava/lang/String;

    .line 699
    .line 700
    const/4 v5, 0x4

    .line 701
    invoke-static {v4, v2, v3, v1, v5}, LBf/k;->w0(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 702
    .line 703
    .line 704
    move-result v1

    .line 705
    if-gez v1, :cond_f

    .line 706
    .line 707
    :cond_e
    move-object v3, v10

    .line 708
    goto/16 :goto_f

    .line 709
    .line 710
    :cond_f
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 711
    .line 712
    .line 713
    move-result-object v1

    .line 714
    new-instance v3, Lef/k;

    .line 715
    .line 716
    invoke-direct {v3, v1, v2}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 717
    .line 718
    .line 719
    goto/16 :goto_f

    .line 720
    .line 721
    :cond_10
    new-instance v2, Lzf/g;

    .line 722
    .line 723
    if-gez v3, :cond_11

    .line 724
    .line 725
    goto :goto_9

    .line 726
    :cond_11
    move v1, v3

    .line 727
    :goto_9
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    .line 728
    .line 729
    .line 730
    move-result v3

    .line 731
    invoke-direct {v2, v1, v3, v11}, Lzf/e;-><init>(III)V

    .line 732
    .line 733
    .line 734
    instance-of v3, v4, Ljava/lang/String;

    .line 735
    .line 736
    const/4 v14, 0x0

    .line 737
    iget v8, v2, Lzf/e;->c:I

    .line 738
    .line 739
    iget v9, v2, Lzf/e;->b:I

    .line 740
    .line 741
    if-eqz v3, :cond_17

    .line 742
    .line 743
    if-lez v8, :cond_12

    .line 744
    .line 745
    if-le v1, v9, :cond_13

    .line 746
    .line 747
    :cond_12
    if-gez v8, :cond_e

    .line 748
    .line 749
    if-gt v9, v1, :cond_e

    .line 750
    .line 751
    :cond_13
    move/from16 v17, v1

    .line 752
    .line 753
    :goto_a
    move-object v1, v13

    .line 754
    check-cast v1, Ljava/lang/Iterable;

    .line 755
    .line 756
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 757
    .line 758
    .line 759
    move-result-object v1

    .line 760
    :goto_b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 761
    .line 762
    .line 763
    move-result v2

    .line 764
    if-eqz v2, :cond_15

    .line 765
    .line 766
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 767
    .line 768
    .line 769
    move-result-object v2

    .line 770
    move-object/from16 v16, v2

    .line 771
    .line 772
    check-cast v16, Ljava/lang/String;

    .line 773
    .line 774
    move-object/from16 v18, v4

    .line 775
    .line 776
    check-cast v18, Ljava/lang/String;

    .line 777
    .line 778
    invoke-virtual/range {v16 .. v16}, Ljava/lang/String;->length()I

    .line 779
    .line 780
    .line 781
    move-result v19

    .line 782
    const/4 v15, 0x0

    .line 783
    invoke-static/range {v14 .. v19}, LBf/r;->f0(ZILjava/lang/String;ILjava/lang/String;I)Z

    .line 784
    .line 785
    .line 786
    move-result v3

    .line 787
    move/from16 v5, v17

    .line 788
    .line 789
    if-eqz v3, :cond_14

    .line 790
    .line 791
    goto :goto_c

    .line 792
    :cond_14
    move/from16 v17, v5

    .line 793
    .line 794
    goto :goto_b

    .line 795
    :cond_15
    move/from16 v5, v17

    .line 796
    .line 797
    move-object v2, v10

    .line 798
    :goto_c
    check-cast v2, Ljava/lang/String;

    .line 799
    .line 800
    if-eqz v2, :cond_16

    .line 801
    .line 802
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 803
    .line 804
    .line 805
    move-result-object v1

    .line 806
    new-instance v3, Lef/k;

    .line 807
    .line 808
    invoke-direct {v3, v1, v2}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 809
    .line 810
    .line 811
    goto :goto_f

    .line 812
    :cond_16
    if-eq v5, v9, :cond_e

    .line 813
    .line 814
    add-int v17, v5, v8

    .line 815
    .line 816
    goto :goto_a

    .line 817
    :cond_17
    if-lez v8, :cond_18

    .line 818
    .line 819
    if-le v1, v9, :cond_19

    .line 820
    .line 821
    :cond_18
    if-gez v8, :cond_e

    .line 822
    .line 823
    if-gt v9, v1, :cond_e

    .line 824
    .line 825
    :cond_19
    move v5, v1

    .line 826
    :goto_d
    move-object v1, v13

    .line 827
    check-cast v1, Ljava/lang/Iterable;

    .line 828
    .line 829
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 830
    .line 831
    .line 832
    move-result-object v1

    .line 833
    :cond_1a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 834
    .line 835
    .line 836
    move-result v2

    .line 837
    if-eqz v2, :cond_1b

    .line 838
    .line 839
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 840
    .line 841
    .line 842
    move-result-object v11

    .line 843
    move-object v2, v11

    .line 844
    check-cast v2, Ljava/lang/String;

    .line 845
    .line 846
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 847
    .line 848
    .line 849
    move-result v6

    .line 850
    const/4 v3, 0x0

    .line 851
    move v7, v14

    .line 852
    invoke-static/range {v2 .. v7}, LBf/k;->D0(Ljava/lang/CharSequence;ILjava/lang/CharSequence;IIZ)Z

    .line 853
    .line 854
    .line 855
    move-result v2

    .line 856
    if-eqz v2, :cond_1a

    .line 857
    .line 858
    goto :goto_e

    .line 859
    :cond_1b
    move-object v11, v10

    .line 860
    :goto_e
    check-cast v11, Ljava/lang/String;

    .line 861
    .line 862
    if-eqz v11, :cond_1c

    .line 863
    .line 864
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 865
    .line 866
    .line 867
    move-result-object v1

    .line 868
    new-instance v3, Lef/k;

    .line 869
    .line 870
    invoke-direct {v3, v1, v11}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 871
    .line 872
    .line 873
    goto :goto_f

    .line 874
    :cond_1c
    if-eq v5, v9, :cond_e

    .line 875
    .line 876
    add-int/2addr v5, v8

    .line 877
    goto :goto_d

    .line 878
    :goto_f
    if-eqz v3, :cond_1d

    .line 879
    .line 880
    iget-object v1, v3, Lef/k;->b:Ljava/lang/Object;

    .line 881
    .line 882
    check-cast v1, Ljava/lang/String;

    .line 883
    .line 884
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 885
    .line 886
    .line 887
    move-result v1

    .line 888
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 889
    .line 890
    .line 891
    move-result-object v1

    .line 892
    new-instance v10, Lef/k;

    .line 893
    .line 894
    iget-object v2, v3, Lef/k;->a:Ljava/lang/Object;

    .line 895
    .line 896
    invoke-direct {v10, v2, v1}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 897
    .line 898
    .line 899
    :cond_1d
    return-object v10

    .line 900
    :pswitch_b
    move-object/from16 v3, p1

    .line 901
    .line 902
    check-cast v3, Ljava/lang/CharSequence;

    .line 903
    .line 904
    move-object/from16 v4, p2

    .line 905
    .line 906
    check-cast v4, Ljava/lang/Integer;

    .line 907
    .line 908
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 909
    .line 910
    .line 911
    move-result v4

    .line 912
    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 913
    .line 914
    .line 915
    check-cast v13, [C

    .line 916
    .line 917
    invoke-static {v3, v13, v4, v1}, LBf/k;->x0(Ljava/lang/CharSequence;[CIZ)I

    .line 918
    .line 919
    .line 920
    move-result v1

    .line 921
    if-gez v1, :cond_1e

    .line 922
    .line 923
    goto :goto_10

    .line 924
    :cond_1e
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 925
    .line 926
    .line 927
    move-result-object v1

    .line 928
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 929
    .line 930
    .line 931
    move-result-object v2

    .line 932
    new-instance v10, Lef/k;

    .line 933
    .line 934
    invoke-direct {v10, v1, v2}, Lef/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 935
    .line 936
    .line 937
    :goto_10
    return-object v10

    .line 938
    nop

    .line 939
    :pswitch_data_0
    .packed-switch 0x0
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
