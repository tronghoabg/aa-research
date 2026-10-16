.class public final synthetic LAf/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltf/l;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/E;Lcom/moloco/sdk/common_adapter_internal/a;)V
    .locals 0

    .line 1
    const/16 p1, 0x16

    iput p1, p0, LAf/r;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LAf/r;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p2, p0, LAf/r;->a:I

    iput-object p1, p0, LAf/r;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const-string v2, "$this$retry"

    .line 6
    .line 7
    const/4 v3, 0x3

    .line 8
    sget-object v4, Lff/v;->a:Lff/v;

    .line 9
    .line 10
    const-string v5, "$this$buildSerialDescriptor"

    .line 11
    .line 12
    const/16 v6, 0xa

    .line 13
    .line 14
    const/4 v7, 0x2

    .line 15
    const/4 v8, 0x1

    .line 16
    const/4 v9, 0x0

    .line 17
    const/4 v10, 0x0

    .line 18
    const-string v11, "it"

    .line 19
    .line 20
    sget-object v12, Lef/C;->a:Lef/C;

    .line 21
    .line 22
    iget-object v13, v0, LAf/r;->b:Ljava/lang/Object;

    .line 23
    .line 24
    iget v14, v0, LAf/r;->a:I

    .line 25
    .line 26
    packed-switch v14, :pswitch_data_0

    .line 27
    .line 28
    .line 29
    check-cast v1, Lkotlin/reflect/KTypeProjection;

    .line 30
    .line 31
    invoke-static {v1, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    check-cast v13, Lkotlin/jvm/internal/O;

    .line 35
    .line 36
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1}, Lkotlin/reflect/KTypeProjection;->getVariance()Lkotlin/reflect/KVariance;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    if-nez v2, :cond_0

    .line 44
    .line 45
    const-string v1, "*"

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    invoke-virtual {v1}, Lkotlin/reflect/KTypeProjection;->getType()Lkotlin/reflect/KType;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    instance-of v4, v2, Lkotlin/jvm/internal/O;

    .line 53
    .line 54
    if-eqz v4, :cond_1

    .line 55
    .line 56
    move-object v9, v2

    .line 57
    check-cast v9, Lkotlin/jvm/internal/O;

    .line 58
    .line 59
    :cond_1
    if-eqz v9, :cond_2

    .line 60
    .line 61
    invoke-virtual {v9, v8}, Lkotlin/jvm/internal/O;->a(Z)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    if-nez v2, :cond_3

    .line 66
    .line 67
    :cond_2
    invoke-virtual {v1}, Lkotlin/reflect/KTypeProjection;->getType()Lkotlin/reflect/KType;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    :cond_3
    invoke-virtual {v1}, Lkotlin/reflect/KTypeProjection;->getVariance()Lkotlin/reflect/KVariance;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    sget-object v4, Lkotlin/jvm/internal/N;->a:[I

    .line 80
    .line 81
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    aget v1, v4, v1

    .line 86
    .line 87
    if-eq v1, v8, :cond_6

    .line 88
    .line 89
    if-eq v1, v7, :cond_5

    .line 90
    .line 91
    if-ne v1, v3, :cond_4

    .line 92
    .line 93
    const-string v1, "out "

    .line 94
    .line 95
    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    goto :goto_0

    .line 100
    :cond_4
    new-instance v1, LE5/Q;

    .line 101
    .line 102
    const/16 v2, 0x9

    .line 103
    .line 104
    invoke-direct {v1, v10, v2}, LE5/Q;-><init>(BI)V

    .line 105
    .line 106
    .line 107
    throw v1

    .line 108
    :cond_5
    const-string v1, "in "

    .line 109
    .line 110
    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    goto :goto_0

    .line 115
    :cond_6
    move-object v1, v2

    .line 116
    :goto_0
    return-object v1

    .line 117
    :pswitch_0
    check-cast v1, Ljava/util/Map$Entry;

    .line 118
    .line 119
    invoke-static {v1, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    check-cast v13, Lff/g;

    .line 123
    .line 124
    new-instance v2, Ljava/lang/StringBuilder;

    .line 125
    .line 126
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 127
    .line 128
    .line 129
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v3

    .line 133
    const-string v4, "(this Map)"

    .line 134
    .line 135
    if-ne v3, v13, :cond_7

    .line 136
    .line 137
    move-object v3, v4

    .line 138
    goto :goto_1

    .line 139
    :cond_7
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v3

    .line 143
    :goto_1
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    const/16 v3, 0x3d

    .line 147
    .line 148
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    if-ne v1, v13, :cond_8

    .line 156
    .line 157
    goto :goto_2

    .line 158
    :cond_8
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v4

    .line 162
    :goto_2
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    return-object v1

    .line 170
    :pswitch_1
    check-cast v13, Lff/a;

    .line 171
    .line 172
    if-ne v1, v13, :cond_9

    .line 173
    .line 174
    const-string v1, "(this Collection)"

    .line 175
    .line 176
    goto :goto_3

    .line 177
    :cond_9
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v1

    .line 181
    :goto_3
    return-object v1

    .line 182
    :pswitch_2
    check-cast v1, LJd/n;

    .line 183
    .line 184
    sget-object v2, LJd/p;->a:Ljava/util/List;

    .line 185
    .line 186
    const-string v2, "Content-Encoding"

    .line 187
    .line 188
    check-cast v13, Ljava/lang/String;

    .line 189
    .line 190
    invoke-virtual {v1, v2, v13}, LA7/B0;->z(Ljava/lang/String;Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    return-object v12

    .line 194
    :pswitch_3
    check-cast v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/d;

    .line 195
    .line 196
    invoke-static {v1, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    check-cast v13, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/R0;

    .line 200
    .line 201
    invoke-virtual {v13}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/e;->getAdShowListener()Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/i;

    .line 202
    .line 203
    .line 204
    move-result-object v2

    .line 205
    if-eqz v2, :cond_a

    .line 206
    .line 207
    invoke-static {v1}, Lgc/b;->c(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/d;)Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/d;

    .line 208
    .line 209
    .line 210
    move-result-object v1

    .line 211
    invoke-interface {v2, v1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/i;->e(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/c;)V

    .line 212
    .line 213
    .line 214
    :cond_a
    return-object v12

    .line 215
    :pswitch_4
    check-cast v1, Landroid/content/Context;

    .line 216
    .line 217
    invoke-static {v1, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    new-instance v2, Landroid/widget/FrameLayout;

    .line 221
    .line 222
    invoke-direct {v2, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 223
    .line 224
    .line 225
    new-instance v1, Landroid/view/ViewGroup$LayoutParams;

    .line 226
    .line 227
    const/4 v3, -0x1

    .line 228
    invoke-direct {v1, v3, v3}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 229
    .line 230
    .line 231
    check-cast v13, Landroid/view/View;

    .line 232
    .line 233
    invoke-virtual {v2, v13, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 234
    .line 235
    .line 236
    return-object v2

    .line 237
    :pswitch_5
    check-cast v1, Ljava/lang/Boolean;

    .line 238
    .line 239
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 240
    .line 241
    .line 242
    move-result v1

    .line 243
    check-cast v13, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/h;

    .line 244
    .line 245
    iget-object v2, v13, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/h;->y:LR1/q;

    .line 246
    .line 247
    if-eqz v1, :cond_b

    .line 248
    .line 249
    iget v1, v2, LR1/q;->a:I

    .line 250
    .line 251
    const/high16 v3, -0x80000000

    .line 252
    .line 253
    xor-int/2addr v1, v3

    .line 254
    invoke-static {v1, v3}, Ljava/lang/Integer;->compare(II)I

    .line 255
    .line 256
    .line 257
    move-result v1

    .line 258
    if-lez v1, :cond_e

    .line 259
    .line 260
    iget v1, v2, LR1/q;->a:I

    .line 261
    .line 262
    int-to-long v3, v1

    .line 263
    const-wide v5, 0xffffffffL

    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    and-long/2addr v3, v5

    .line 269
    invoke-virtual {v2, v3, v4}, LR1/q;->l(J)V

    .line 270
    .line 271
    .line 272
    goto :goto_6

    .line 273
    :cond_b
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 274
    .line 275
    .line 276
    sget-object v14, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 277
    .line 278
    const/16 v19, 0xc

    .line 279
    .line 280
    const/16 v20, 0x0

    .line 281
    .line 282
    const-string v15, "LinearGoNextActionImpl"

    .line 283
    .line 284
    const-string v16, "Canceling timer"

    .line 285
    .line 286
    const/16 v17, 0x0

    .line 287
    .line 288
    const/16 v18, 0x0

    .line 289
    .line 290
    invoke-static/range {v14 .. v20}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 291
    .line 292
    .line 293
    iget-object v1, v2, LR1/q;->e:Ljava/lang/Object;

    .line 294
    .line 295
    check-cast v1, LEf/H0;

    .line 296
    .line 297
    if-eqz v1, :cond_c

    .line 298
    .line 299
    invoke-virtual {v1, v9}, LEf/z0;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 300
    .line 301
    .line 302
    :cond_c
    iget-object v1, v13, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/h;->m:LHf/x0;

    .line 303
    .line 304
    invoke-virtual {v1}, LHf/x0;->getValue()Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    move-result-object v1

    .line 308
    check-cast v1, Ljava/lang/Boolean;

    .line 309
    .line 310
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 311
    .line 312
    .line 313
    move-result v1

    .line 314
    if-eqz v1, :cond_d

    .line 315
    .line 316
    iget v1, v13, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/h;->n:I

    .line 317
    .line 318
    if-lez v1, :cond_d

    .line 319
    .line 320
    sub-int/2addr v1, v6

    .line 321
    :goto_4
    int-to-long v1, v1

    .line 322
    goto :goto_5

    .line 323
    :cond_d
    iget v1, v13, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/h;->A:I

    .line 324
    .line 325
    goto :goto_4

    .line 326
    :goto_5
    new-instance v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/z;

    .line 327
    .line 328
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 329
    .line 330
    .line 331
    move-result-object v1

    .line 332
    invoke-direct {v3, v1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/z;-><init>(Ljava/lang/Comparable;)V

    .line 333
    .line 334
    .line 335
    iget-object v1, v13, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/h;->k:LHf/x0;

    .line 336
    .line 337
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 338
    .line 339
    .line 340
    invoke-virtual {v1, v9, v3}, LHf/x0;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 341
    .line 342
    .line 343
    :cond_e
    :goto_6
    return-object v12

    .line 344
    :pswitch_6
    check-cast v1, Ljava/util/List;

    .line 345
    .line 346
    invoke-static {v1, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 347
    .line 348
    .line 349
    check-cast v13, Lcom/moloco/sdk/common_adapter_internal/a;

    .line 350
    .line 351
    invoke-static {v1, v13}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/E;->a(Ljava/util/List;Lcom/moloco/sdk/common_adapter_internal/a;)Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/b;

    .line 352
    .line 353
    .line 354
    move-result-object v1

    .line 355
    return-object v1

    .line 356
    :pswitch_7
    check-cast v1, LCd/Y;

    .line 357
    .line 358
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 359
    .line 360
    .line 361
    new-instance v2, LCd/U;

    .line 362
    .line 363
    const/16 v3, 0x10

    .line 364
    .line 365
    invoke-direct {v2, v3}, LCd/U;-><init>(I)V

    .line 366
    .line 367
    .line 368
    new-instance v3, LBf/s;

    .line 369
    .line 370
    invoke-direct {v3, v2, v7}, LBf/s;-><init>(Ljava/lang/Object;I)V

    .line 371
    .line 372
    .line 373
    iput-object v3, v1, LCd/Y;->c:LBf/s;

    .line 374
    .line 375
    new-instance v2, LCd/V;

    .line 376
    .line 377
    invoke-direct {v2, v8}, LCd/V;-><init>(Z)V

    .line 378
    .line 379
    .line 380
    iput-object v2, v1, LCd/Y;->b:LCd/V;

    .line 381
    .line 382
    new-instance v2, LCd/W;

    .line 383
    .line 384
    invoke-direct {v2, v10}, LCd/W;-><init>(I)V

    .line 385
    .line 386
    .line 387
    iput v6, v1, LCd/Y;->f:I

    .line 388
    .line 389
    iput-object v2, v1, LCd/Y;->a:LCd/W;

    .line 390
    .line 391
    new-instance v2, LBf/s;

    .line 392
    .line 393
    check-cast v13, LDd/c;

    .line 394
    .line 395
    const/16 v3, 0x8

    .line 396
    .line 397
    invoke-direct {v2, v13, v3}, LBf/s;-><init>(Ljava/lang/Object;I)V

    .line 398
    .line 399
    .line 400
    iput-object v2, v1, LCd/Y;->e:Ltf/p;

    .line 401
    .line 402
    return-object v12

    .line 403
    :pswitch_8
    check-cast v1, LCd/Y;

    .line 404
    .line 405
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 406
    .line 407
    .line 408
    new-instance v2, LCd/U;

    .line 409
    .line 410
    const/16 v3, 0xf

    .line 411
    .line 412
    invoke-direct {v2, v3}, LCd/U;-><init>(I)V

    .line 413
    .line 414
    .line 415
    new-instance v3, LBf/s;

    .line 416
    .line 417
    invoke-direct {v3, v2, v7}, LBf/s;-><init>(Ljava/lang/Object;I)V

    .line 418
    .line 419
    .line 420
    iput-object v3, v1, LCd/Y;->c:LBf/s;

    .line 421
    .line 422
    new-instance v2, LCd/V;

    .line 423
    .line 424
    invoke-direct {v2, v8}, LCd/V;-><init>(Z)V

    .line 425
    .line 426
    .line 427
    iput-object v2, v1, LCd/Y;->b:LCd/V;

    .line 428
    .line 429
    new-instance v2, LCd/W;

    .line 430
    .line 431
    invoke-direct {v2, v10}, LCd/W;-><init>(I)V

    .line 432
    .line 433
    .line 434
    iput v6, v1, LCd/Y;->f:I

    .line 435
    .line 436
    iput-object v2, v1, LCd/Y;->a:LCd/W;

    .line 437
    .line 438
    new-instance v2, LBf/s;

    .line 439
    .line 440
    check-cast v13, LVa/X7;

    .line 441
    .line 442
    const/4 v3, 0x7

    .line 443
    invoke-direct {v2, v13, v3}, LBf/s;-><init>(Ljava/lang/Object;I)V

    .line 444
    .line 445
    .line 446
    iput-object v2, v1, LCd/Y;->e:Ltf/p;

    .line 447
    .line 448
    return-object v12

    .line 449
    :pswitch_9
    check-cast v1, Ljava/lang/String;

    .line 450
    .line 451
    const-string v2, "url"

    .line 452
    .line 453
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 454
    .line 455
    .line 456
    check-cast v13, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/c;

    .line 457
    .line 458
    iget-object v2, v13, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/c;->e:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/t;

    .line 459
    .line 460
    sget-object v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/linear/i;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/g;

    .line 461
    .line 462
    const-string v5, "position"

    .line 463
    .line 464
    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 465
    .line 466
    .line 467
    sget-object v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/u;->b:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/u;

    .line 468
    .line 469
    new-instance v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/r;

    .line 470
    .line 471
    invoke-direct {v5, v2, v4, v9}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/r;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/t;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/u;Ljf/c;)V

    .line 472
    .line 473
    .line 474
    iget-object v4, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/t;->b:LKd/a;

    .line 475
    .line 476
    invoke-static {v4, v9, v5, v3}, LEf/H;->D(LEf/E;Ljf/h;Ltf/p;I)LEf/H0;

    .line 477
    .line 478
    .line 479
    iget-object v2, v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/t;->d:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/inlineInstall/k;

    .line 480
    .line 481
    if-eqz v2, :cond_f

    .line 482
    .line 483
    invoke-interface {v2, v1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/inlineInstall/k;->a(Ljava/lang/String;)V

    .line 484
    .line 485
    .line 486
    :cond_f
    return-object v12

    .line 487
    :pswitch_a
    check-cast v1, Lg0/d;

    .line 488
    .line 489
    const-string v2, "$this$Canvas"

    .line 490
    .line 491
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 492
    .line 493
    .line 494
    check-cast v13, Le0/d;

    .line 495
    .line 496
    iget-object v2, v13, Le0/d;->a:Landroid/graphics/Bitmap;

    .line 497
    .line 498
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 499
    .line 500
    .line 501
    move-result v3

    .line 502
    int-to-float v3, v3

    .line 503
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 504
    .line 505
    .line 506
    move-result v2

    .line 507
    int-to-float v2, v2

    .line 508
    invoke-interface {v1}, Lg0/d;->c()J

    .line 509
    .line 510
    .line 511
    move-result-wide v4

    .line 512
    invoke-static {v4, v5}, Ld0/f;->d(J)F

    .line 513
    .line 514
    .line 515
    move-result v4

    .line 516
    invoke-interface {v1}, Lg0/d;->c()J

    .line 517
    .line 518
    .line 519
    move-result-wide v5

    .line 520
    invoke-static {v5, v6}, Ld0/f;->b(J)F

    .line 521
    .line 522
    .line 523
    move-result v5

    .line 524
    const/4 v6, 0x0

    .line 525
    move v7, v6

    .line 526
    :goto_7
    cmpg-float v8, v7, v4

    .line 527
    .line 528
    if-gez v8, :cond_11

    .line 529
    .line 530
    move v8, v6

    .line 531
    :goto_8
    cmpg-float v9, v8, v5

    .line 532
    .line 533
    if-gez v9, :cond_10

    .line 534
    .line 535
    invoke-static {v7, v8}, LU8/v0;->f(FF)J

    .line 536
    .line 537
    .line 538
    move-result-wide v9

    .line 539
    sget-object v11, Lg0/f;->b:Lg0/f;

    .line 540
    .line 541
    invoke-interface {v1, v13, v9, v10, v11}, Lg0/d;->d(Le0/d;JLg0/c;)V

    .line 542
    .line 543
    .line 544
    add-float/2addr v8, v2

    .line 545
    goto :goto_8

    .line 546
    :cond_10
    add-float/2addr v7, v3

    .line 547
    goto :goto_7

    .line 548
    :cond_11
    return-object v12

    .line 549
    :pswitch_b
    check-cast v1, Ljava/lang/Long;

    .line 550
    .line 551
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 552
    .line 553
    .line 554
    check-cast v13, Lcom/moloco/sdk/internal/publisher/l0;

    .line 555
    .line 556
    iget-object v1, v13, Lcom/moloco/sdk/internal/publisher/l0;->k:LW1/r;

    .line 557
    .line 558
    invoke-virtual {v1}, LW1/r;->a()J

    .line 559
    .line 560
    .line 561
    move-result-wide v1

    .line 562
    new-instance v3, LCf/a;

    .line 563
    .line 564
    invoke-direct {v3, v1, v2}, LCf/a;-><init>(J)V

    .line 565
    .line 566
    .line 567
    return-object v3

    .line 568
    :pswitch_c
    check-cast v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/d;

    .line 569
    .line 570
    const-string v2, "button"

    .line 571
    .line 572
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 573
    .line 574
    .line 575
    check-cast v13, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/s;

    .line 576
    .line 577
    invoke-virtual {v13, v1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/s;->a(Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/d;)V

    .line 578
    .line 579
    .line 580
    return-object v12

    .line 581
    :pswitch_d
    check-cast v1, Ljf/c;

    .line 582
    .line 583
    check-cast v13, Lcom/moloco/sdk/acm/db/e;

    .line 584
    .line 585
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 586
    .line 587
    .line 588
    invoke-static {v13, v1}, Lcom/moloco/sdk/internal/publisher/H;->K(Lcom/moloco/sdk/acm/db/e;Ljf/c;)Ljava/lang/Object;

    .line 589
    .line 590
    .line 591
    move-result-object v1

    .line 592
    return-object v1

    .line 593
    :pswitch_e
    check-cast v1, Lkotlinx/serialization/json/b;

    .line 594
    .line 595
    invoke-static {v1, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 596
    .line 597
    .line 598
    check-cast v13, Lkotlin/jvm/internal/G;

    .line 599
    .line 600
    iput-object v1, v13, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 601
    .line 602
    return-object v12

    .line 603
    :pswitch_f
    check-cast v1, Lkotlinx/serialization/json/b;

    .line 604
    .line 605
    const-string v2, "node"

    .line 606
    .line 607
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 608
    .line 609
    .line 610
    check-cast v13, LYf/u;

    .line 611
    .line 612
    iget-object v2, v13, LYf/u;->a:Ljava/util/ArrayList;

    .line 613
    .line 614
    invoke-static {v2}, Lff/o;->y0(Ljava/util/List;)Ljava/lang/Object;

    .line 615
    .line 616
    .line 617
    move-result-object v2

    .line 618
    check-cast v2, Ljava/lang/String;

    .line 619
    .line 620
    invoke-virtual {v13, v2, v1}, LYf/u;->N(Ljava/lang/String;Lkotlinx/serialization/json/b;)V

    .line 621
    .line 622
    .line 623
    return-object v12

    .line 624
    :pswitch_10
    check-cast v1, LUf/a;

    .line 625
    .line 626
    const-string v2, "$this$buildClassSerialDescriptor"

    .line 627
    .line 628
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 629
    .line 630
    .line 631
    check-cast v13, LWf/r0;

    .line 632
    .line 633
    iget-object v2, v13, LWf/r0;->a:Lkotlinx/serialization/KSerializer;

    .line 634
    .line 635
    invoke-interface {v2}, Lkotlinx/serialization/KSerializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    .line 636
    .line 637
    .line 638
    move-result-object v2

    .line 639
    const-string v3, "first"

    .line 640
    .line 641
    invoke-static {v1, v3, v2}, LUf/a;->a(LUf/a;Ljava/lang/String;Lkotlinx/serialization/descriptors/SerialDescriptor;)V

    .line 642
    .line 643
    .line 644
    iget-object v2, v13, LWf/r0;->b:Lkotlinx/serialization/KSerializer;

    .line 645
    .line 646
    invoke-interface {v2}, Lkotlinx/serialization/KSerializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    .line 647
    .line 648
    .line 649
    move-result-object v2

    .line 650
    const-string v3, "second"

    .line 651
    .line 652
    invoke-static {v1, v3, v2}, LUf/a;->a(LUf/a;Ljava/lang/String;Lkotlinx/serialization/descriptors/SerialDescriptor;)V

    .line 653
    .line 654
    .line 655
    iget-object v2, v13, LWf/r0;->c:Lkotlinx/serialization/KSerializer;

    .line 656
    .line 657
    invoke-interface {v2}, Lkotlinx/serialization/KSerializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    .line 658
    .line 659
    .line 660
    move-result-object v2

    .line 661
    const-string v3, "third"

    .line 662
    .line 663
    invoke-static {v1, v3, v2}, LUf/a;->a(LUf/a;Ljava/lang/String;Lkotlinx/serialization/descriptors/SerialDescriptor;)V

    .line 664
    .line 665
    .line 666
    return-object v12

    .line 667
    :pswitch_11
    check-cast v1, Ljava/lang/Integer;

    .line 668
    .line 669
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 670
    .line 671
    .line 672
    move-result v1

    .line 673
    new-instance v2, Ljava/lang/StringBuilder;

    .line 674
    .line 675
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 676
    .line 677
    .line 678
    invoke-interface {v13, v1}, Lkotlinx/serialization/descriptors/SerialDescriptor;->e(I)Ljava/lang/String;

    .line 679
    .line 680
    .line 681
    move-result-object v3

    .line 682
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 683
    .line 684
    .line 685
    const-string v3, ": "

    .line 686
    .line 687
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 688
    .line 689
    .line 690
    invoke-interface {v13, v1}, Lkotlinx/serialization/descriptors/SerialDescriptor;->g(I)Lkotlinx/serialization/descriptors/SerialDescriptor;

    .line 691
    .line 692
    .line 693
    move-result-object v1

    .line 694
    invoke-interface {v1}, Lkotlinx/serialization/descriptors/SerialDescriptor;->h()Ljava/lang/String;

    .line 695
    .line 696
    .line 697
    move-result-object v1

    .line 698
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 699
    .line 700
    .line 701
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 702
    .line 703
    .line 704
    move-result-object v1

    .line 705
    return-object v1

    .line 706
    :pswitch_12
    check-cast v1, LUf/a;

    .line 707
    .line 708
    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 709
    .line 710
    .line 711
    check-cast v13, LWf/Y;

    .line 712
    .line 713
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 714
    .line 715
    .line 716
    iput-object v4, v1, LUf/a;->b:Ljava/util/List;

    .line 717
    .line 718
    return-object v12

    .line 719
    :pswitch_13
    check-cast v1, LUf/a;

    .line 720
    .line 721
    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 722
    .line 723
    .line 724
    sget-object v2, LWf/q0;->b:LWf/h0;

    .line 725
    .line 726
    const-string v3, "type"

    .line 727
    .line 728
    invoke-static {v1, v3, v2}, LUf/a;->a(LUf/a;Ljava/lang/String;Lkotlinx/serialization/descriptors/SerialDescriptor;)V

    .line 729
    .line 730
    .line 731
    new-instance v2, Ljava/lang/StringBuilder;

    .line 732
    .line 733
    const-string v3, "kotlinx.serialization.Polymorphic<"

    .line 734
    .line 735
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 736
    .line 737
    .line 738
    check-cast v13, LSf/d;

    .line 739
    .line 740
    iget-object v3, v13, LSf/d;->a:Lkotlin/reflect/KClass;

    .line 741
    .line 742
    invoke-interface {v3}, Lkotlin/reflect/KClass;->getSimpleName()Ljava/lang/String;

    .line 743
    .line 744
    .line 745
    move-result-object v3

    .line 746
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 747
    .line 748
    .line 749
    const/16 v3, 0x3e

    .line 750
    .line 751
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 752
    .line 753
    .line 754
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 755
    .line 756
    .line 757
    move-result-object v2

    .line 758
    sget-object v3, LUf/i;->p:LUf/i;

    .line 759
    .line 760
    new-array v5, v10, [Lkotlinx/serialization/descriptors/SerialDescriptor;

    .line 761
    .line 762
    invoke-static {v2, v3, v5}, LFe/g;->t(Ljava/lang/String;LS3/f;[Lkotlinx/serialization/descriptors/SerialDescriptor;)LUf/g;

    .line 763
    .line 764
    .line 765
    move-result-object v2

    .line 766
    const-string v3, "value"

    .line 767
    .line 768
    invoke-static {v1, v3, v2}, LUf/a;->a(LUf/a;Ljava/lang/String;Lkotlinx/serialization/descriptors/SerialDescriptor;)V

    .line 769
    .line 770
    .line 771
    iput-object v4, v1, LUf/a;->b:Ljava/util/List;

    .line 772
    .line 773
    return-object v12

    .line 774
    :pswitch_14
    check-cast v1, LUf/a;

    .line 775
    .line 776
    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 777
    .line 778
    .line 779
    check-cast v13, LSf/a;

    .line 780
    .line 781
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 782
    .line 783
    .line 784
    iput-object v4, v1, LUf/a;->b:Ljava/util/List;

    .line 785
    .line 786
    return-object v12

    .line 787
    :pswitch_15
    check-cast v1, Ljava/lang/Byte;

    .line 788
    .line 789
    invoke-virtual {v1}, Ljava/lang/Byte;->byteValue()B

    .line 790
    .line 791
    .line 792
    move-result v2

    .line 793
    check-cast v13, Ljava/lang/StringBuilder;

    .line 794
    .line 795
    const/16 v3, 0x20

    .line 796
    .line 797
    if-ne v2, v3, :cond_12

    .line 798
    .line 799
    const-string v1, "%20"

    .line 800
    .line 801
    invoke-virtual {v13, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 802
    .line 803
    .line 804
    goto :goto_a

    .line 805
    :cond_12
    sget-object v3, LJd/b;->a:Ljava/util/Set;

    .line 806
    .line 807
    invoke-interface {v3, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 808
    .line 809
    .line 810
    move-result v3

    .line 811
    if-nez v3, :cond_14

    .line 812
    .line 813
    sget-object v3, LJd/b;->c:Ljava/util/ArrayList;

    .line 814
    .line 815
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 816
    .line 817
    .line 818
    move-result v1

    .line 819
    if-eqz v1, :cond_13

    .line 820
    .line 821
    goto :goto_9

    .line 822
    :cond_13
    invoke-static {v2}, LJd/b;->g(B)Ljava/lang/String;

    .line 823
    .line 824
    .line 825
    move-result-object v1

    .line 826
    invoke-virtual {v13, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 827
    .line 828
    .line 829
    goto :goto_a

    .line 830
    :cond_14
    :goto_9
    int-to-char v1, v2

    .line 831
    invoke-virtual {v13, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 832
    .line 833
    .line 834
    :goto_a
    return-object v12

    .line 835
    :pswitch_16
    check-cast v1, Ljava/lang/Throwable;

    .line 836
    .line 837
    check-cast v13, LEf/H0;

    .line 838
    .line 839
    invoke-virtual {v13, v9}, LEf/z0;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 840
    .line 841
    .line 842
    return-object v12

    .line 843
    :pswitch_17
    check-cast v1, Ljava/lang/Throwable;

    .line 844
    .line 845
    check-cast v13, LFd/c;

    .line 846
    .line 847
    iget-object v2, v13, LFd/c;->e:LEf/I0;

    .line 848
    .line 849
    const-string v3, "null cannot be cast to non-null type kotlinx.coroutines.CompletableJob"

    .line 850
    .line 851
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 852
    .line 853
    .line 854
    if-nez v1, :cond_15

    .line 855
    .line 856
    invoke-virtual {v2}, LEf/o0;->Y()Z

    .line 857
    .line 858
    .line 859
    goto :goto_b

    .line 860
    :cond_15
    new-instance v3, LEf/x;

    .line 861
    .line 862
    invoke-direct {v3, v10, v1}, LEf/x;-><init>(ZLjava/lang/Throwable;)V

    .line 863
    .line 864
    .line 865
    invoke-virtual {v2, v3}, LEf/z0;->K(Ljava/lang/Object;)Z

    .line 866
    .line 867
    .line 868
    :goto_b
    return-object v12

    .line 869
    :pswitch_18
    check-cast v1, Ljava/lang/Throwable;

    .line 870
    .line 871
    check-cast v13, LEf/U;

    .line 872
    .line 873
    invoke-interface {v13}, LEf/U;->dispose()V

    .line 874
    .line 875
    .line 876
    return-object v12

    .line 877
    :pswitch_19
    check-cast v1, Ljava/lang/Throwable;

    .line 878
    .line 879
    sget-object v2, LCd/T;->a:Lvg/b;

    .line 880
    .line 881
    check-cast v13, LEf/I0;

    .line 882
    .line 883
    if-eqz v1, :cond_16

    .line 884
    .line 885
    new-instance v3, Ljava/lang/StringBuilder;

    .line 886
    .line 887
    const-string v4, "Cancelling request because engine Job failed with error: "

    .line 888
    .line 889
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 890
    .line 891
    .line 892
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 893
    .line 894
    .line 895
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 896
    .line 897
    .line 898
    move-result-object v3

    .line 899
    invoke-interface {v2, v3}, Lvg/b;->s(Ljava/lang/String;)V

    .line 900
    .line 901
    .line 902
    const-string v2, "Engine failed"

    .line 903
    .line 904
    invoke-static {v13, v2, v1}, LEf/H;->k(LEf/m0;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 905
    .line 906
    .line 907
    goto :goto_c

    .line 908
    :cond_16
    const-string v1, "Cancelling request because engine Job completed"

    .line 909
    .line 910
    invoke-interface {v2, v1}, Lvg/b;->s(Ljava/lang/String;)V

    .line 911
    .line 912
    .line 913
    invoke-virtual {v13}, LEf/o0;->Y()Z

    .line 914
    .line 915
    .line 916
    :goto_c
    return-object v12

    .line 917
    :pswitch_1a
    check-cast v1, Ljava/lang/Throwable;

    .line 918
    .line 919
    check-cast v13, LEf/o0;

    .line 920
    .line 921
    invoke-virtual {v13}, LEf/o0;->Y()Z

    .line 922
    .line 923
    .line 924
    return-object v12

    .line 925
    :pswitch_1b
    check-cast v1, LCd/h;

    .line 926
    .line 927
    const-string v2, "$this$install"

    .line 928
    .line 929
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 930
    .line 931
    .line 932
    check-cast v13, Lcom/moloco/sdk/internal/http/a;

    .line 933
    .line 934
    invoke-virtual {v13, v1}, Lcom/moloco/sdk/internal/http/a;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 935
    .line 936
    .line 937
    return-object v12

    .line 938
    :pswitch_1c
    invoke-static {v1, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 939
    .line 940
    .line 941
    check-cast v13, Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/DeserializedMemberScope$OptimizedImplementation$computeDescriptors$1$1;

    .line 942
    .line 943
    invoke-interface {v13}, Ltf/a;->invoke()Ljava/lang/Object;

    .line 944
    .line 945
    .line 946
    move-result-object v1

    .line 947
    return-object v1

    .line 948
    nop

    .line 949
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
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
