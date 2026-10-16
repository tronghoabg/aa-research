.class public final synthetic LBf/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltf/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, LBf/g;->a:I

    iput-object p2, p0, LBf/g;->b:Ljava/lang/Object;

    iput-object p3, p0, LBf/g;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 15

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    const/4 v2, 0x0

    .line 4
    sget-object v3, Lef/C;->a:Lef/C;

    .line 5
    .line 6
    iget-object v4, p0, LBf/g;->c:Ljava/lang/Object;

    .line 7
    .line 8
    iget-object v5, p0, LBf/g;->b:Ljava/lang/Object;

    .line 9
    .line 10
    iget v6, p0, LBf/g;->a:I

    .line 11
    .line 12
    packed-switch v6, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast v5, Lm5/c;

    .line 16
    .line 17
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    new-instance v0, Landroid/os/StatFs;

    .line 21
    .line 22
    check-cast v4, Ljava/lang/String;

    .line 23
    .line 24
    invoke-direct {v0, v4}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Landroid/os/StatFs;->getBlockSizeLong()J

    .line 28
    .line 29
    .line 30
    move-result-wide v1

    .line 31
    invoke-virtual {v0}, Landroid/os/StatFs;->getAvailableBlocksLong()J

    .line 32
    .line 33
    .line 34
    move-result-wide v3

    .line 35
    mul-long/2addr v3, v1

    .line 36
    long-to-float v0, v3

    .line 37
    const/high16 v1, 0x49800000    # 1048576.0f

    .line 38
    .line 39
    div-float/2addr v0, v1

    .line 40
    float-to-double v0, v0

    .line 41
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    return-object v0

    .line 46
    :pswitch_0
    sget-object v6, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 47
    .line 48
    const/4 v9, 0x0

    .line 49
    const/4 v10, 0x0

    .line 50
    const-string v7, "AdWebViewRenderer"

    .line 51
    .line 52
    const-string v8, "Countdown finished - skip button is now available"

    .line 53
    .line 54
    const/16 v11, 0xc

    .line 55
    .line 56
    const/4 v12, 0x0

    .line 57
    invoke-static/range {v6 .. v12}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 61
    .line 62
    check-cast v5, LN/V;

    .line 63
    .line 64
    invoke-interface {v5, v0}, LN/V;->setValue(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    check-cast v4, Ltf/a;

    .line 68
    .line 69
    invoke-interface {v4}, Ltf/a;->invoke()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    return-object v3

    .line 73
    :pswitch_1
    check-cast v5, Landroid/view/View;

    .line 74
    .line 75
    invoke-virtual {v5}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-virtual {v0}, Landroid/view/ViewTreeObserver;->isAlive()Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-eqz v0, :cond_0

    .line 84
    .line 85
    invoke-virtual {v5}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    check-cast v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/I0;

    .line 90
    .line 91
    invoke-virtual {v0, v4}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 92
    .line 93
    .line 94
    :cond_0
    return-object v3

    .line 95
    :pswitch_2
    check-cast v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/E;

    .line 96
    .line 97
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    new-instance v3, Ljava/util/ArrayList;

    .line 101
    .line 102
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 103
    .line 104
    .line 105
    new-instance v5, Ljava/util/ArrayList;

    .line 106
    .line 107
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 108
    .line 109
    .line 110
    new-instance v6, Ljava/util/ArrayList;

    .line 111
    .line 112
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 113
    .line 114
    .line 115
    new-instance v7, Ljava/util/ArrayList;

    .line 116
    .line 117
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 118
    .line 119
    .line 120
    new-instance v8, Ljava/util/ArrayList;

    .line 121
    .line 122
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 123
    .line 124
    .line 125
    check-cast v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/l;

    .line 126
    .line 127
    if-eqz v4, :cond_9

    .line 128
    .line 129
    iget-object v4, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/l;->c:Ljava/util/List;

    .line 130
    .line 131
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 132
    .line 133
    .line 134
    move-result-object v4

    .line 135
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 136
    .line 137
    .line 138
    move-result v9

    .line 139
    if-eqz v9, :cond_9

    .line 140
    .line 141
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v9

    .line 145
    check-cast v9, Ljava/util/List;

    .line 146
    .line 147
    new-instance v10, Ljava/util/ArrayList;

    .line 148
    .line 149
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 150
    .line 151
    .line 152
    new-instance v11, Ljava/util/ArrayList;

    .line 153
    .line 154
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 155
    .line 156
    .line 157
    new-instance v12, Ljava/util/ArrayList;

    .line 158
    .line 159
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 160
    .line 161
    .line 162
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 163
    .line 164
    .line 165
    move-result-object v9

    .line 166
    :cond_1
    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 167
    .line 168
    .line 169
    move-result v13

    .line 170
    if-eqz v13, :cond_4

    .line 171
    .line 172
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v13

    .line 176
    move-object v14, v13

    .line 177
    check-cast v14, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/j;

    .line 178
    .line 179
    iget-object v14, v14, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/j;->d:Ljava/lang/String;

    .line 180
    .line 181
    if-eqz v14, :cond_3

    .line 182
    .line 183
    invoke-static {v14}, LBf/k;->y0(Ljava/lang/CharSequence;)Z

    .line 184
    .line 185
    .line 186
    move-result v14

    .line 187
    if-eqz v14, :cond_2

    .line 188
    .line 189
    goto :goto_2

    .line 190
    :cond_2
    move v14, v2

    .line 191
    goto :goto_3

    .line 192
    :cond_3
    :goto_2
    move v14, v1

    .line 193
    :goto_3
    if-eqz v14, :cond_1

    .line 194
    .line 195
    invoke-virtual {v12, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    goto :goto_1

    .line 199
    :cond_4
    invoke-virtual {v12}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 200
    .line 201
    .line 202
    move-result-object v9

    .line 203
    :goto_4
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 204
    .line 205
    .line 206
    move-result v12

    .line 207
    if-eqz v12, :cond_8

    .line 208
    .line 209
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v12

    .line 213
    check-cast v12, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/j;

    .line 214
    .line 215
    iget-object v12, v12, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/j;->e:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/m;

    .line 216
    .line 217
    instance-of v13, v12, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/l;

    .line 218
    .line 219
    if-eqz v13, :cond_6

    .line 220
    .line 221
    check-cast v12, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/l;

    .line 222
    .line 223
    iget-object v12, v12, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/l;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/u;

    .line 224
    .line 225
    iget-object v13, v12, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/u;->d:Ljava/util/List;

    .line 226
    .line 227
    invoke-static {v13, v3}, Lff/t;->e0(Ljava/lang/Iterable;Ljava/util/Collection;)V

    .line 228
    .line 229
    .line 230
    iget-object v13, v12, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/u;->e:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/a;

    .line 231
    .line 232
    if-eqz v13, :cond_5

    .line 233
    .line 234
    iget-object v14, v13, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/a;->b:Ljava/util/List;

    .line 235
    .line 236
    invoke-static {v14, v5}, Lff/t;->e0(Ljava/lang/Iterable;Ljava/util/Collection;)V

    .line 237
    .line 238
    .line 239
    iget-object v13, v13, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/a;->c:Ljava/util/List;

    .line 240
    .line 241
    invoke-static {v13, v6}, Lff/t;->e0(Ljava/lang/Iterable;Ljava/util/Collection;)V

    .line 242
    .line 243
    .line 244
    :cond_5
    iget-object v12, v12, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/u;->f:Ljava/util/List;

    .line 245
    .line 246
    invoke-static {v12, v10}, Lff/t;->e0(Ljava/lang/Iterable;Ljava/util/Collection;)V

    .line 247
    .line 248
    .line 249
    goto :goto_4

    .line 250
    :cond_6
    instance-of v13, v12, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/k;

    .line 251
    .line 252
    if-eqz v13, :cond_7

    .line 253
    .line 254
    check-cast v12, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/k;

    .line 255
    .line 256
    iget-object v12, v12, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/k;->a:Ljava/util/List;

    .line 257
    .line 258
    invoke-static {v12, v11}, Lff/t;->e0(Ljava/lang/Iterable;Ljava/util/Collection;)V

    .line 259
    .line 260
    .line 261
    goto :goto_4

    .line 262
    :cond_7
    new-instance v0, LE5/Q;

    .line 263
    .line 264
    const/16 v1, 0x9

    .line 265
    .line 266
    invoke-direct {v0, v2, v1}, LE5/Q;-><init>(BI)V

    .line 267
    .line 268
    .line 269
    throw v0

    .line 270
    :cond_8
    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 271
    .line 272
    .line 273
    invoke-virtual {v8, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 274
    .line 275
    .line 276
    goto/16 :goto_0

    .line 277
    .line 278
    :cond_9
    new-instance v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/m;

    .line 279
    .line 280
    new-instance v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/a;

    .line 281
    .line 282
    invoke-direct {v2, v0, v5, v6}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/a;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/J;Ljava/util/List;Ljava/util/List;)V

    .line 283
    .line 284
    .line 285
    invoke-direct {v1, v3, v2, v7, v8}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/m;-><init>(Ljava/util/ArrayList;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/model/a;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 286
    .line 287
    .line 288
    return-object v1

    .line 289
    :pswitch_3
    new-instance v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/ad/loader/b;

    .line 290
    .line 291
    check-cast v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/ad/c;

    .line 292
    .line 293
    iget-object v1, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/ad/c;->a:LKd/a;

    .line 294
    .line 295
    iget-object v2, v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/ad/c;->c:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/i;

    .line 296
    .line 297
    check-cast v5, Ljava/lang/String;

    .line 298
    .line 299
    invoke-direct {v0, v5, v1, v2}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/ad/loader/b;-><init>(Ljava/lang/String;LKd/a;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/i;)V

    .line 300
    .line 301
    .line 302
    return-object v0

    .line 303
    :pswitch_4
    check-cast v5, Landroidx/lifecycle/o;

    .line 304
    .line 305
    check-cast v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/V;

    .line 306
    .line 307
    invoke-virtual {v5, v4}, Landroidx/lifecycle/o;->c(Landroidx/lifecycle/u;)V

    .line 308
    .line 309
    .line 310
    return-object v3

    .line 311
    :pswitch_5
    check-cast v5, Landroid/view/View;

    .line 312
    .line 313
    check-cast v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/T;

    .line 314
    .line 315
    invoke-virtual {v5, v4}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 316
    .line 317
    .line 318
    return-object v3

    .line 319
    :pswitch_6
    check-cast v5, Lcom/moloco/sdk/publisher/MolocoInitializationListener;

    .line 320
    .line 321
    check-cast v4, Lcom/moloco/sdk/publisher/MolocoInitStatus;

    .line 322
    .line 323
    invoke-interface {v5, v4}, Lcom/moloco/sdk/publisher/MolocoInitializationListener;->onMolocoInitializationStatus(Lcom/moloco/sdk/publisher/MolocoInitStatus;)V

    .line 324
    .line 325
    .line 326
    return-object v3

    .line 327
    :pswitch_7
    sget-object v0, Lk1/S;->a:Ljava/util/WeakHashMap;

    .line 328
    .line 329
    check-cast v5, Landroid/widget/FrameLayout;

    .line 330
    .line 331
    invoke-virtual {v5}, Landroid/view/View;->isAttachedToWindow()Z

    .line 332
    .line 333
    .line 334
    move-result v0

    .line 335
    check-cast v4, Lcom/moloco/sdk/internal/b;

    .line 336
    .line 337
    if-eqz v0, :cond_a

    .line 338
    .line 339
    invoke-static {v4, v5}, Lcom/moloco/sdk/internal/b;->a(Lcom/moloco/sdk/internal/b;Landroid/widget/FrameLayout;)V

    .line 340
    .line 341
    .line 342
    goto :goto_5

    .line 343
    :cond_a
    new-instance v0, Lcom/moloco/sdk/internal/a;

    .line 344
    .line 345
    invoke-direct {v0, v5, v4, v5}, Lcom/moloco/sdk/internal/a;-><init>(Landroid/widget/FrameLayout;Lcom/moloco/sdk/internal/b;Landroid/widget/FrameLayout;)V

    .line 346
    .line 347
    .line 348
    invoke-virtual {v5, v0}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 349
    .line 350
    .line 351
    :goto_5
    return-object v3

    .line 352
    :pswitch_8
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 353
    .line 354
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 355
    .line 356
    .line 357
    check-cast v4, LXf/c;

    .line 358
    .line 359
    iget-object v3, v4, LXf/c;->a:LXf/h;

    .line 360
    .line 361
    check-cast v5, Lkotlinx/serialization/descriptors/SerialDescriptor;

    .line 362
    .line 363
    invoke-static {v4, v5}, LYf/r;->n(LXf/c;Lkotlinx/serialization/descriptors/SerialDescriptor;)V

    .line 364
    .line 365
    .line 366
    invoke-interface {v5}, Lkotlinx/serialization/descriptors/SerialDescriptor;->d()I

    .line 367
    .line 368
    .line 369
    move-result v3

    .line 370
    move v4, v2

    .line 371
    :goto_6
    if-ge v4, v3, :cond_10

    .line 372
    .line 373
    invoke-interface {v5, v4}, Lkotlinx/serialization/descriptors/SerialDescriptor;->f(I)Ljava/util/List;

    .line 374
    .line 375
    .line 376
    move-result-object v6

    .line 377
    check-cast v6, Ljava/lang/Iterable;

    .line 378
    .line 379
    new-instance v7, Ljava/util/ArrayList;

    .line 380
    .line 381
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 382
    .line 383
    .line 384
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 385
    .line 386
    .line 387
    move-result-object v6

    .line 388
    :cond_b
    :goto_7
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 389
    .line 390
    .line 391
    move-result v8

    .line 392
    if-eqz v8, :cond_c

    .line 393
    .line 394
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 395
    .line 396
    .line 397
    move-result-object v8

    .line 398
    instance-of v9, v8, LXf/r;

    .line 399
    .line 400
    if-eqz v9, :cond_b

    .line 401
    .line 402
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 403
    .line 404
    .line 405
    goto :goto_7

    .line 406
    :cond_c
    invoke-static {v7}, Lff/o;->K0(Ljava/util/List;)Ljava/lang/Object;

    .line 407
    .line 408
    .line 409
    move-result-object v6

    .line 410
    check-cast v6, LXf/r;

    .line 411
    .line 412
    if-eqz v6, :cond_f

    .line 413
    .line 414
    invoke-interface {v6}, LXf/r;->names()[Ljava/lang/String;

    .line 415
    .line 416
    .line 417
    move-result-object v6

    .line 418
    if-eqz v6, :cond_f

    .line 419
    .line 420
    array-length v7, v6

    .line 421
    move v8, v2

    .line 422
    :goto_8
    if-ge v8, v7, :cond_f

    .line 423
    .line 424
    aget-object v9, v6, v8

    .line 425
    .line 426
    invoke-interface {v5}, Lkotlinx/serialization/descriptors/SerialDescriptor;->getKind()LS3/f;

    .line 427
    .line 428
    .line 429
    move-result-object v10

    .line 430
    sget-object v11, LUf/i;->q:LUf/i;

    .line 431
    .line 432
    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 433
    .line 434
    .line 435
    move-result v10

    .line 436
    if-eqz v10, :cond_d

    .line 437
    .line 438
    const-string v10, "enum value"

    .line 439
    .line 440
    goto :goto_9

    .line 441
    :cond_d
    const-string v10, "property"

    .line 442
    .line 443
    :goto_9
    invoke-interface {v0, v9}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 444
    .line 445
    .line 446
    move-result v11

    .line 447
    if-nez v11, :cond_e

    .line 448
    .line 449
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 450
    .line 451
    .line 452
    move-result-object v10

    .line 453
    invoke-interface {v0, v9, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 454
    .line 455
    .line 456
    add-int/2addr v8, v1

    .line 457
    goto :goto_8

    .line 458
    :cond_e
    new-instance v1, LSf/i;

    .line 459
    .line 460
    new-instance v2, Ljava/lang/StringBuilder;

    .line 461
    .line 462
    const-string v3, "The suggested name \'"

    .line 463
    .line 464
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 465
    .line 466
    .line 467
    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 468
    .line 469
    .line 470
    const-string v3, "\' for "

    .line 471
    .line 472
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 473
    .line 474
    .line 475
    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 476
    .line 477
    .line 478
    const/16 v3, 0x20

    .line 479
    .line 480
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 481
    .line 482
    .line 483
    invoke-interface {v5, v4}, Lkotlinx/serialization/descriptors/SerialDescriptor;->e(I)Ljava/lang/String;

    .line 484
    .line 485
    .line 486
    move-result-object v4

    .line 487
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 488
    .line 489
    .line 490
    const-string v4, " is already one of the names for "

    .line 491
    .line 492
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 493
    .line 494
    .line 495
    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 496
    .line 497
    .line 498
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 499
    .line 500
    .line 501
    invoke-static {v9, v0}, Lff/B;->v(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;

    .line 502
    .line 503
    .line 504
    move-result-object v0

    .line 505
    check-cast v0, Ljava/lang/Number;

    .line 506
    .line 507
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 508
    .line 509
    .line 510
    move-result v0

    .line 511
    invoke-interface {v5, v0}, Lkotlinx/serialization/descriptors/SerialDescriptor;->e(I)Ljava/lang/String;

    .line 512
    .line 513
    .line 514
    move-result-object v0

    .line 515
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 516
    .line 517
    .line 518
    const-string v0, " in "

    .line 519
    .line 520
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 521
    .line 522
    .line 523
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 524
    .line 525
    .line 526
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 527
    .line 528
    .line 529
    move-result-object v0

    .line 530
    const-string v2, "message"

    .line 531
    .line 532
    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 533
    .line 534
    .line 535
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 536
    .line 537
    .line 538
    throw v1

    .line 539
    :cond_f
    add-int/2addr v4, v1

    .line 540
    goto/16 :goto_6

    .line 541
    .line 542
    :cond_10
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 543
    .line 544
    .line 545
    move-result v1

    .line 546
    if-eqz v1, :cond_11

    .line 547
    .line 548
    sget-object v0, Lff/w;->a:Lff/w;

    .line 549
    .line 550
    :cond_11
    return-object v0

    .line 551
    :pswitch_9
    check-cast v5, LSf/a;

    .line 552
    .line 553
    iget-object v0, v5, LSf/a;->c:Ljava/lang/Object;

    .line 554
    .line 555
    check-cast v0, LWf/y;

    .line 556
    .line 557
    if-nez v0, :cond_12

    .line 558
    .line 559
    new-instance v0, LWf/y;

    .line 560
    .line 561
    iget-object v3, v5, LSf/a;->b:Ljava/lang/Object;

    .line 562
    .line 563
    check-cast v3, [Ljava/lang/Enum;

    .line 564
    .line 565
    array-length v5, v3

    .line 566
    check-cast v4, Ljava/lang/String;

    .line 567
    .line 568
    invoke-direct {v0, v4, v5}, LWf/y;-><init>(Ljava/lang/String;I)V

    .line 569
    .line 570
    .line 571
    array-length v4, v3

    .line 572
    move v5, v2

    .line 573
    :goto_a
    if-ge v5, v4, :cond_12

    .line 574
    .line 575
    aget-object v6, v3, v5

    .line 576
    .line 577
    invoke-virtual {v6}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 578
    .line 579
    .line 580
    move-result-object v6

    .line 581
    invoke-virtual {v0, v6, v2}, LWf/d0;->j(Ljava/lang/String;Z)V

    .line 582
    .line 583
    .line 584
    add-int/2addr v5, v1

    .line 585
    goto :goto_a

    .line 586
    :cond_12
    return-object v0

    .line 587
    :pswitch_a
    check-cast v5, Ljava/util/ArrayList;

    .line 588
    .line 589
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 590
    .line 591
    .line 592
    move-result v0

    .line 593
    if-eqz v0, :cond_13

    .line 594
    .line 595
    goto :goto_b

    .line 596
    :cond_13
    check-cast v4, LJd/H;

    .line 597
    .line 598
    iget-object v0, v4, LJd/H;->f:Ljava/lang/String;

    .line 599
    .line 600
    iget-object v1, v4, LJd/H;->h:LJd/D;

    .line 601
    .line 602
    iget-object v1, v1, LJd/D;->a:Ljava/lang/String;

    .line 603
    .line 604
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 605
    .line 606
    .line 607
    move-result v1

    .line 608
    add-int/lit8 v1, v1, 0x3

    .line 609
    .line 610
    const/4 v3, 0x4

    .line 611
    const/16 v5, 0x2f

    .line 612
    .line 613
    invoke-static {v0, v5, v1, v3}, LBf/k;->v0(Ljava/lang/CharSequence;CII)I

    .line 614
    .line 615
    .line 616
    move-result v0

    .line 617
    const/4 v1, -0x1

    .line 618
    if-ne v0, v1, :cond_14

    .line 619
    .line 620
    :goto_b
    const-string v0, ""

    .line 621
    .line 622
    goto :goto_c

    .line 623
    :cond_14
    const/4 v3, 0x2

    .line 624
    new-array v3, v3, [C

    .line 625
    .line 626
    fill-array-data v3, :array_0

    .line 627
    .line 628
    .line 629
    iget-object v4, v4, LJd/H;->f:Ljava/lang/String;

    .line 630
    .line 631
    invoke-static {v4, v3, v0, v2}, LBf/k;->x0(Ljava/lang/CharSequence;[CIZ)I

    .line 632
    .line 633
    .line 634
    move-result v2

    .line 635
    const-string v3, "substring(...)"

    .line 636
    .line 637
    if-ne v2, v1, :cond_15

    .line 638
    .line 639
    invoke-virtual {v4, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 640
    .line 641
    .line 642
    move-result-object v0

    .line 643
    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 644
    .line 645
    .line 646
    goto :goto_c

    .line 647
    :cond_15
    invoke-virtual {v4, v0, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 648
    .line 649
    .line 650
    move-result-object v0

    .line 651
    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 652
    .line 653
    .line 654
    :goto_c
    return-object v0

    .line 655
    :pswitch_b
    check-cast v5, LBf/i;

    .line 656
    .line 657
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 658
    .line 659
    .line 660
    const-string v1, "input"

    .line 661
    .line 662
    check-cast v4, Ljava/lang/CharSequence;

    .line 663
    .line 664
    invoke-static {v4, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 665
    .line 666
    .line 667
    iget-object v1, v5, LBf/i;->a:Ljava/util/regex/Pattern;

    .line 668
    .line 669
    invoke-virtual {v1, v4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 670
    .line 671
    .line 672
    move-result-object v1

    .line 673
    const-string v3, "matcher(...)"

    .line 674
    .line 675
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 676
    .line 677
    .line 678
    invoke-virtual {v1, v2}, Ljava/util/regex/Matcher;->find(I)Z

    .line 679
    .line 680
    .line 681
    move-result v2

    .line 682
    if-nez v2, :cond_16

    .line 683
    .line 684
    goto :goto_d

    .line 685
    :cond_16
    new-instance v0, LBf/f;

    .line 686
    .line 687
    invoke-direct {v0, v1, v4}, LBf/f;-><init>(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)V

    .line 688
    .line 689
    .line 690
    :goto_d
    return-object v0

    .line 691
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

    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    :array_0
    .array-data 2
        0x3fs
        0x23s
    .end array-data
.end method
