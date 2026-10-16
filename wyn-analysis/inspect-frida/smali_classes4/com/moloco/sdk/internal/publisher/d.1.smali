.class public final synthetic Lcom/moloco/sdk/internal/publisher/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltf/l;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/moloco/sdk/internal/publisher/d;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p2, p0, Lcom/moloco/sdk/internal/publisher/d;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    const/4 v0, 0x1

    .line 2
    const-string v1, "<this>"

    .line 3
    .line 4
    const-string v2, "it"

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    const-string v4, "$this$semantics"

    .line 8
    .line 9
    sget-object v5, Lef/C;->a:Lef/C;

    .line 10
    .line 11
    iget v6, p0, Lcom/moloco/sdk/internal/publisher/d;->a:I

    .line 12
    .line 13
    packed-switch v6, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    check-cast p1, LAd/h;

    .line 17
    .line 18
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-object v5

    .line 22
    :pswitch_0
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-object v5

    .line 26
    :pswitch_1
    check-cast p1, Lwd/c;

    .line 27
    .line 28
    const-string v1, "$this$install"

    .line 29
    .line 30
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    sget-object v1, LCd/s;->a:Lvg/b;

    .line 34
    .line 35
    new-instance v1, LCd/p;

    .line 36
    .line 37
    const/4 v2, 0x3

    .line 38
    const/4 v4, 0x0

    .line 39
    invoke-direct {v1, v2, v3, v4}, LCd/p;-><init>(ILjf/c;I)V

    .line 40
    .line 41
    .line 42
    iget-object v4, p1, Lwd/c;->e:LFd/f;

    .line 43
    .line 44
    sget-object v6, LFd/f;->j:LD8/a;

    .line 45
    .line 46
    invoke-virtual {v4, v6, v1}, LRd/d;->f(LD8/a;Ltf/q;)V

    .line 47
    .line 48
    .line 49
    new-instance v1, LCd/r;

    .line 50
    .line 51
    invoke-direct {v1, p1, v3}, LCd/r;-><init>(Lwd/c;Ljf/c;)V

    .line 52
    .line 53
    .line 54
    iget-object p1, p1, Lwd/c;->f:LGd/b;

    .line 55
    .line 56
    sget-object v4, LGd/b;->k:LD8/a;

    .line 57
    .line 58
    invoke-virtual {p1, v4, v1}, LRd/d;->f(LD8/a;Ltf/q;)V

    .line 59
    .line 60
    .line 61
    new-instance v1, LCd/p;

    .line 62
    .line 63
    invoke-direct {v1, v2, v3, v0}, LCd/p;-><init>(ILjf/c;I)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1, v4, v1}, LRd/d;->f(LD8/a;Ltf/q;)V

    .line 67
    .line 68
    .line 69
    return-object v5

    .line 70
    :pswitch_2
    check-cast p1, Lef/n;

    .line 71
    .line 72
    sget p1, Lkd/a0;->d:I

    .line 73
    .line 74
    return-object v3

    .line 75
    :pswitch_3
    check-cast p1, Lef/n;

    .line 76
    .line 77
    sget p1, Lkd/W;->c:I

    .line 78
    .line 79
    return-object v3

    .line 80
    :pswitch_4
    check-cast p1, Lef/n;

    .line 81
    .line 82
    sget p1, Lkd/T;->c:I

    .line 83
    .line 84
    return-object v3

    .line 85
    :pswitch_5
    check-cast p1, Lef/n;

    .line 86
    .line 87
    sget p1, Lkd/P;->h:I

    .line 88
    .line 89
    return-object v3

    .line 90
    :pswitch_6
    check-cast p1, Lef/n;

    .line 91
    .line 92
    return-object v3

    .line 93
    :pswitch_7
    check-cast p1, Lef/n;

    .line 94
    .line 95
    sget p1, Lkd/g;->e:I

    .line 96
    .line 97
    return-object v5

    .line 98
    :pswitch_8
    check-cast p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/c;

    .line 99
    .line 100
    return-object v5

    .line 101
    :pswitch_9
    check-cast p1, Lx0/g;

    .line 102
    .line 103
    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    const-string v0, "mute_button"

    .line 107
    .line 108
    invoke-static {p1, v0}, Lx0/p;->a(Lx0/g;Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    invoke-static {p1, v0}, Lx0/p;->c(Lx0/g;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    return-object v5

    .line 115
    :pswitch_a
    check-cast p1, Ljava/util/List;

    .line 116
    .line 117
    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    invoke-static {p1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/E;->b(Ljava/util/List;)Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/h;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    return-object p1

    .line 125
    :pswitch_b
    check-cast p1, Lt0/v;

    .line 126
    .line 127
    const-string v0, "$this$drawWithContent"

    .line 128
    .line 129
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    iget-object v0, p1, Lt0/v;->a:Lg0/b;

    .line 133
    .line 134
    iget-object v1, v0, Lg0/b;->b:Lba/a;

    .line 135
    .line 136
    invoke-virtual {v1}, Lba/a;->y()J

    .line 137
    .line 138
    .line 139
    move-result-wide v1

    .line 140
    invoke-static {v1, v2}, Ld0/f;->d(J)F

    .line 141
    .line 142
    .line 143
    move-result v1

    .line 144
    const/high16 v2, 0x40000000    # 2.0f

    .line 145
    .line 146
    div-float v9, v1, v2

    .line 147
    .line 148
    iget-object v0, v0, Lg0/b;->b:Lba/a;

    .line 149
    .line 150
    invoke-virtual {v0}, Lba/a;->y()J

    .line 151
    .line 152
    .line 153
    move-result-wide v1

    .line 154
    invoke-static {v1, v2}, Ld0/f;->b(J)F

    .line 155
    .line 156
    .line 157
    move-result v10

    .line 158
    invoke-virtual {v0}, Lba/a;->y()J

    .line 159
    .line 160
    .line 161
    move-result-wide v1

    .line 162
    invoke-virtual {v0}, Lba/a;->v()Le0/o;

    .line 163
    .line 164
    .line 165
    move-result-object v3

    .line 166
    invoke-interface {v3}, Le0/o;->m()V

    .line 167
    .line 168
    .line 169
    iget-object v3, v0, Lba/a;->b:Ljava/lang/Object;

    .line 170
    .line 171
    check-cast v3, Lad/L;

    .line 172
    .line 173
    iget-object v3, v3, Lad/L;->b:Ljava/lang/Object;

    .line 174
    .line 175
    check-cast v3, Lba/a;

    .line 176
    .line 177
    invoke-virtual {v3}, Lba/a;->v()Le0/o;

    .line 178
    .line 179
    .line 180
    move-result-object v6

    .line 181
    const/4 v7, 0x0

    .line 182
    const/4 v8, 0x0

    .line 183
    const/4 v11, 0x1

    .line 184
    invoke-interface/range {v6 .. v11}, Le0/o;->e(FFFFI)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {p1}, Lt0/v;->a()V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v0}, Lba/a;->v()Le0/o;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    invoke-interface {p1}, Le0/o;->restore()V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v0, v1, v2}, Lba/a;->J(J)V

    .line 198
    .line 199
    .line 200
    return-object v5

    .line 201
    :pswitch_c
    check-cast p1, Lx0/g;

    .line 202
    .line 203
    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    const-string v0, "countdown_timer_text"

    .line 207
    .line 208
    invoke-static {p1, v0}, Lx0/p;->a(Lx0/g;Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    invoke-static {p1, v0}, Lx0/p;->c(Lx0/g;Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    return-object v5

    .line 215
    :pswitch_d
    check-cast p1, Lx0/g;

    .line 216
    .line 217
    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    const-string v0, "timer_container"

    .line 221
    .line 222
    invoke-static {p1, v0}, Lx0/p;->a(Lx0/g;Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    invoke-static {p1, v0}, Lx0/p;->c(Lx0/g;Ljava/lang/String;)V

    .line 226
    .line 227
    .line 228
    return-object v5

    .line 229
    :pswitch_e
    check-cast p1, Lx0/g;

    .line 230
    .line 231
    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    const-string v0, "custom_timer_container"

    .line 235
    .line 236
    invoke-static {p1, v0}, Lx0/p;->a(Lx0/g;Ljava/lang/String;)V

    .line 237
    .line 238
    .line 239
    invoke-static {p1, v0}, Lx0/p;->c(Lx0/g;Ljava/lang/String;)V

    .line 240
    .line 241
    .line 242
    return-object v5

    .line 243
    :pswitch_f
    check-cast p1, Lx0/g;

    .line 244
    .line 245
    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    const-string v0, "custom_countdown_timer_text"

    .line 249
    .line 250
    invoke-static {p1, v0}, Lx0/p;->a(Lx0/g;Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    invoke-static {p1, v0}, Lx0/p;->c(Lx0/g;Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    return-object v5

    .line 257
    :pswitch_10
    check-cast p1, Lx0/g;

    .line 258
    .line 259
    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    const-string v0, "rewarded_countdown_timer_custom"

    .line 263
    .line 264
    invoke-static {p1, v0}, Lx0/p;->a(Lx0/g;Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    invoke-static {p1, v0}, Lx0/p;->c(Lx0/g;Ljava/lang/String;)V

    .line 268
    .line 269
    .line 270
    return-object v5

    .line 271
    :pswitch_11
    check-cast p1, Lx0/g;

    .line 272
    .line 273
    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    const-string v0, "rewarded_countdown_timer"

    .line 277
    .line 278
    invoke-static {p1, v0}, Lx0/p;->a(Lx0/g;Ljava/lang/String;)V

    .line 279
    .line 280
    .line 281
    invoke-static {p1, v0}, Lx0/p;->c(Lx0/g;Ljava/lang/String;)V

    .line 282
    .line 283
    .line 284
    return-object v5

    .line 285
    :pswitch_12
    check-cast p1, Lx0/g;

    .line 286
    .line 287
    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 288
    .line 289
    .line 290
    const-string v0, "Ad Badge"

    .line 291
    .line 292
    invoke-static {p1, v0}, Lx0/p;->a(Lx0/g;Ljava/lang/String;)V

    .line 293
    .line 294
    .line 295
    invoke-static {p1, v0}, Lx0/p;->c(Lx0/g;Ljava/lang/String;)V

    .line 296
    .line 297
    .line 298
    return-object v5

    .line 299
    :pswitch_13
    check-cast p1, Landroidx/activity/o;

    .line 300
    .line 301
    sget-object v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/fullscreen/FullscreenWebviewActivity;->d:Ljava/lang/ref/WeakReference;

    .line 302
    .line 303
    const-string v0, "$this$addCallback"

    .line 304
    .line 305
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 306
    .line 307
    .line 308
    sget-object v6, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 309
    .line 310
    const-string v8, "Back press detected, but disabled"

    .line 311
    .line 312
    const/4 v9, 0x0

    .line 313
    const-string v7, "FullscreenWebviewActivity"

    .line 314
    .line 315
    const/4 v10, 0x4

    .line 316
    const/4 v11, 0x0

    .line 317
    invoke-static/range {v6 .. v11}, Lcom/moloco/sdk/internal/MolocoLogger;->debug$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 318
    .line 319
    .line 320
    return-object v5

    .line 321
    :pswitch_14
    check-cast p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/d;

    .line 322
    .line 323
    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 324
    .line 325
    .line 326
    return-object v5

    .line 327
    :pswitch_15
    check-cast p1, Ljava/lang/String;

    .line 328
    .line 329
    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 330
    .line 331
    .line 332
    return-object v5

    .line 333
    :pswitch_16
    check-cast p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/d;

    .line 334
    .line 335
    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 336
    .line 337
    .line 338
    return-object v5

    .line 339
    :pswitch_17
    check-cast p1, Lx0/g;

    .line 340
    .line 341
    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 342
    .line 343
    .line 344
    const-string v0, "Watermark Overlay"

    .line 345
    .line 346
    invoke-static {p1, v0}, Lx0/p;->a(Lx0/g;Ljava/lang/String;)V

    .line 347
    .line 348
    .line 349
    invoke-static {p1, v0}, Lx0/p;->c(Lx0/g;Ljava/lang/String;)V

    .line 350
    .line 351
    .line 352
    return-object v5

    .line 353
    :pswitch_18
    check-cast p1, LJd/n;

    .line 354
    .line 355
    const-string v0, "$this$headers"

    .line 356
    .line 357
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 358
    .line 359
    .line 360
    sget-object v0, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 361
    .line 362
    invoke-static {p1, v3}, Lff/B;->d(LJd/n;Lcom/moloco/sdk/publisher/MediationInfo;)V

    .line 363
    .line 364
    .line 365
    return-object v5

    .line 366
    :pswitch_19
    check-cast p1, LXf/f;

    .line 367
    .line 368
    const-string v1, "$this$Json"

    .line 369
    .line 370
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 371
    .line 372
    .line 373
    iput-boolean v0, p1, LXf/f;->d:Z

    .line 374
    .line 375
    iput-boolean v0, p1, LXf/f;->c:Z

    .line 376
    .line 377
    return-object v5

    .line 378
    :pswitch_1a
    check-cast p1, Lx0/g;

    .line 379
    .line 380
    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 381
    .line 382
    .line 383
    const-string v0, "playback_control_button"

    .line 384
    .line 385
    invoke-static {p1, v0}, Lx0/p;->a(Lx0/g;Ljava/lang/String;)V

    .line 386
    .line 387
    .line 388
    invoke-static {p1, v0}, Lx0/p;->c(Lx0/g;Ljava/lang/String;)V

    .line 389
    .line 390
    .line 391
    return-object v5

    .line 392
    :pswitch_1b
    check-cast p1, Lcom/moloco/sdk/internal/ortb/model/h0;

    .line 393
    .line 394
    if-eqz p1, :cond_0

    .line 395
    .line 396
    invoke-static {p1}, Lcom/moloco/sdk/internal/i;->d(Lcom/moloco/sdk/internal/ortb/model/h0;)Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/k;

    .line 397
    .line 398
    .line 399
    move-result-object p1

    .line 400
    goto :goto_0

    .line 401
    :cond_0
    sget-object p1, Lcom/moloco/sdk/internal/i;->a:Lef/p;

    .line 402
    .line 403
    invoke-virtual {p1}, Lef/p;->getValue()Ljava/lang/Object;

    .line 404
    .line 405
    .line 406
    move-result-object p1

    .line 407
    check-cast p1, Lcom/moloco/sdk/internal/ortb/model/h0;

    .line 408
    .line 409
    invoke-static {p1}, Lcom/moloco/sdk/internal/i;->d(Lcom/moloco/sdk/internal/ortb/model/h0;)Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/k;

    .line 410
    .line 411
    .line 412
    move-result-object p1

    .line 413
    :goto_0
    return-object p1

    .line 414
    :pswitch_1c
    check-cast p1, Lcom/moloco/sdk/internal/ortb/model/h0;

    .line 415
    .line 416
    if-eqz p1, :cond_1

    .line 417
    .line 418
    invoke-static {p1}, Lcom/moloco/sdk/internal/i;->d(Lcom/moloco/sdk/internal/ortb/model/h0;)Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/k;

    .line 419
    .line 420
    .line 421
    move-result-object p1

    .line 422
    goto :goto_1

    .line 423
    :cond_1
    sget-object p1, Lcom/moloco/sdk/internal/i;->a:Lef/p;

    .line 424
    .line 425
    invoke-virtual {p1}, Lef/p;->getValue()Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    move-result-object p1

    .line 429
    check-cast p1, Lcom/moloco/sdk/internal/ortb/model/h0;

    .line 430
    .line 431
    invoke-static {p1}, Lcom/moloco/sdk/internal/i;->d(Lcom/moloco/sdk/internal/ortb/model/h0;)Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/k;

    .line 432
    .line 433
    .line 434
    move-result-object p1

    .line 435
    :goto_1
    return-object p1

    .line 436
    nop

    .line 437
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
