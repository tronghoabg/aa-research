.class public final synthetic LFf/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltf/l;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, LFf/d;->a:I

    iput-object p2, p0, LFf/d;->b:Ljava/lang/Object;

    iput-object p3, p0, LFf/d;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, LFf/d;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string v0, "<this>"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, LFf/d;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Ltf/l;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-interface {v0, p1}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    :cond_0
    iget-object v0, p0, LFf/d;->c:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Ltf/l;

    .line 23
    .line 24
    invoke-interface {v0, p1}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    sget-object p1, Lef/C;->a:Lef/C;

    .line 28
    .line 29
    return-object p1

    .line 30
    :pswitch_0
    check-cast p1, Lkd/K;

    .line 31
    .line 32
    iget-object v0, p0, LFf/d;->b:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v0, Lkd/P;

    .line 35
    .line 36
    iget-boolean v1, p1, Lkd/K;->d:Z

    .line 37
    .line 38
    if-eqz v1, :cond_1

    .line 39
    .line 40
    iget-object v0, v0, Lkd/P;->b:Lkd/i;

    .line 41
    .line 42
    iget-object v0, v0, Lkd/i;->a:LC8/i;

    .line 43
    .line 44
    iget-object p1, p1, Lkd/K;->c:Ljava/lang/Throwable;

    .line 45
    .line 46
    invoke-static {p1}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    invoke-static {p1}, LC8/i;->t(Ljava/lang/Throwable;)V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    iget-object p1, p1, Lkd/K;->b:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast p1, Ljava/lang/String;

    .line 59
    .line 60
    iget-object v0, p0, LFf/d;->c:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v0, Landroid/webkit/JsPromptResult;

    .line 63
    .line 64
    if-eqz p1, :cond_2

    .line 65
    .line 66
    invoke-virtual {v0, p1}, Landroid/webkit/JsPromptResult;->confirm(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_2
    invoke-virtual {v0}, Landroid/webkit/JsResult;->cancel()V

    .line 71
    .line 72
    .line 73
    :goto_0
    const/4 p1, 0x0

    .line 74
    return-object p1

    .line 75
    :pswitch_1
    check-cast p1, Landroid/content/Context;

    .line 76
    .line 77
    const-string v0, "ctx"

    .line 78
    .line 79
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    iget-object v0, p0, LFf/d;->c:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/q;

    .line 85
    .line 86
    iget-object v1, p0, LFf/d;->b:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/G;

    .line 89
    .line 90
    invoke-virtual {v1, p1, v0}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/G;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    check-cast p1, Landroid/view/View;

    .line 95
    .line 96
    return-object p1

    .line 97
    :pswitch_2
    check-cast p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/d;

    .line 98
    .line 99
    const-string v0, "it"

    .line 100
    .line 101
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    iget-object v0, p0, LFf/d;->c:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v0, LN/V;

    .line 107
    .line 108
    invoke-interface {v0, p1}, LN/V;->setValue(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    iget-object v0, p0, LFf/d;->b:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast v0, Ltf/l;

    .line 114
    .line 115
    invoke-interface {v0, p1}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    sget-object p1, Lef/C;->a:Lef/C;

    .line 119
    .line 120
    return-object p1

    .line 121
    :pswitch_3
    check-cast p1, Lr0/k;

    .line 122
    .line 123
    const-string v0, "it"

    .line 124
    .line 125
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    iget-object v0, p0, LFf/d;->b:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/d;

    .line 131
    .line 132
    iget-object v1, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/d;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/c;

    .line 133
    .line 134
    const-string v2, "buttonType"

    .line 135
    .line 136
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    new-instance v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/d;

    .line 140
    .line 141
    invoke-static {p1}, LFe/g;->G(Lr0/k;)J

    .line 142
    .line 143
    .line 144
    move-result-wide v3

    .line 145
    invoke-static {v3, v4}, Ld0/c;->b(J)F

    .line 146
    .line 147
    .line 148
    move-result v3

    .line 149
    float-to-int v3, v3

    .line 150
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 151
    .line 152
    .line 153
    move-result-object v4

    .line 154
    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 155
    .line 156
    .line 157
    move-result-object v4

    .line 158
    int-to-float v3, v3

    .line 159
    iget v4, v4, Landroid/util/DisplayMetrics;->density:F

    .line 160
    .line 161
    div-float/2addr v3, v4

    .line 162
    invoke-static {p1}, LFe/g;->G(Lr0/k;)J

    .line 163
    .line 164
    .line 165
    move-result-wide v4

    .line 166
    invoke-static {v4, v5}, Ld0/c;->c(J)F

    .line 167
    .line 168
    .line 169
    move-result v4

    .line 170
    float-to-int v4, v4

    .line 171
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 172
    .line 173
    .line 174
    move-result-object v5

    .line 175
    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 176
    .line 177
    .line 178
    move-result-object v5

    .line 179
    int-to-float v4, v4

    .line 180
    iget v5, v5, Landroid/util/DisplayMetrics;->density:F

    .line 181
    .line 182
    div-float/2addr v4, v5

    .line 183
    new-instance v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/g;

    .line 184
    .line 185
    invoke-direct {v5, v3, v4}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/g;-><init>(FF)V

    .line 186
    .line 187
    .line 188
    check-cast p1, Lt0/y;

    .line 189
    .line 190
    iget-wide v3, p1, Lr0/t;->c:J

    .line 191
    .line 192
    const-wide v6, 0xffffffffL

    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    and-long/2addr v3, v6

    .line 198
    long-to-int v3, v3

    .line 199
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 200
    .line 201
    .line 202
    move-result-object v4

    .line 203
    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 204
    .line 205
    .line 206
    move-result-object v4

    .line 207
    int-to-float v3, v3

    .line 208
    iget v4, v4, Landroid/util/DisplayMetrics;->density:F

    .line 209
    .line 210
    div-float/2addr v3, v4

    .line 211
    iget-wide v6, p1, Lr0/t;->c:J

    .line 212
    .line 213
    const/16 p1, 0x20

    .line 214
    .line 215
    shr-long/2addr v6, p1

    .line 216
    long-to-int p1, v6

    .line 217
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 218
    .line 219
    .line 220
    move-result-object v4

    .line 221
    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 222
    .line 223
    .line 224
    move-result-object v4

    .line 225
    int-to-float p1, p1

    .line 226
    iget v4, v4, Landroid/util/DisplayMetrics;->density:F

    .line 227
    .line 228
    div-float/2addr p1, v4

    .line 229
    new-instance v4, Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/h;

    .line 230
    .line 231
    invoke-direct {v4, p1, v3}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/h;-><init>(FF)V

    .line 232
    .line 233
    .line 234
    invoke-direct {v2, v1, v5, v4}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/d;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/c;Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/g;Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/h;)V

    .line 235
    .line 236
    .line 237
    const/4 v1, 0x0

    .line 238
    cmpl-float v3, v3, v1

    .line 239
    .line 240
    if-lez v3, :cond_3

    .line 241
    .line 242
    cmpl-float p1, p1, v1

    .line 243
    .line 244
    if-lez p1, :cond_3

    .line 245
    .line 246
    invoke-virtual {v2, v0}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/d;->equals(Ljava/lang/Object;)Z

    .line 247
    .line 248
    .line 249
    move-result p1

    .line 250
    if-nez p1, :cond_3

    .line 251
    .line 252
    iget-object p1, p0, LFf/d;->c:Ljava/lang/Object;

    .line 253
    .line 254
    check-cast p1, Ltf/l;

    .line 255
    .line 256
    invoke-interface {p1, v2}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    :cond_3
    sget-object p1, Lef/C;->a:Lef/C;

    .line 260
    .line 261
    return-object p1

    .line 262
    :pswitch_4
    check-cast p1, Ljava/lang/String;

    .line 263
    .line 264
    const-string v0, "url"

    .line 265
    .line 266
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 267
    .line 268
    .line 269
    iget-object v0, p0, LFf/d;->b:Ljava/lang/Object;

    .line 270
    .line 271
    check-cast v0, Ltf/a;

    .line 272
    .line 273
    invoke-interface {v0}, Ltf/a;->invoke()Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    iget-object v0, p0, LFf/d;->c:Ljava/lang/Object;

    .line 277
    .line 278
    check-cast v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/inlineInstall/k;

    .line 279
    .line 280
    if-eqz v0, :cond_4

    .line 281
    .line 282
    invoke-interface {v0, p1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/inlineInstall/k;->a(Ljava/lang/String;)V

    .line 283
    .line 284
    .line 285
    :cond_4
    sget-object p1, Lef/C;->a:Lef/C;

    .line 286
    .line 287
    return-object p1

    .line 288
    :pswitch_5
    check-cast p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/d;

    .line 289
    .line 290
    iget-object v0, p0, LFf/d;->b:Ljava/lang/Object;

    .line 291
    .line 292
    check-cast v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/L;

    .line 293
    .line 294
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 295
    .line 296
    .line 297
    const-string v1, "event"

    .line 298
    .line 299
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 300
    .line 301
    .line 302
    sget-object v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/b;->e:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/b;

    .line 303
    .line 304
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 305
    .line 306
    .line 307
    move-result v1

    .line 308
    const/4 v2, 0x0

    .line 309
    iget-object v0, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/L;->h:LHf/x0;

    .line 310
    .line 311
    if-eqz v1, :cond_5

    .line 312
    .line 313
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 314
    .line 315
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 316
    .line 317
    .line 318
    invoke-virtual {v0, v2, p1}, LHf/x0;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 319
    .line 320
    .line 321
    goto/16 :goto_1

    .line 322
    .line 323
    :cond_5
    sget-object v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/b;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/b;

    .line 324
    .line 325
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 326
    .line 327
    .line 328
    move-result v1

    .line 329
    if-eqz v1, :cond_6

    .line 330
    .line 331
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 332
    .line 333
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 334
    .line 335
    .line 336
    invoke-virtual {v0, v2, p1}, LHf/x0;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 337
    .line 338
    .line 339
    goto/16 :goto_1

    .line 340
    .line 341
    :cond_6
    sget-object v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/b;->c:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/b;

    .line 342
    .line 343
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 344
    .line 345
    .line 346
    move-result v1

    .line 347
    if-eqz v1, :cond_7

    .line 348
    .line 349
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 350
    .line 351
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 352
    .line 353
    .line 354
    invoke-virtual {v0, v2, p1}, LHf/x0;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 355
    .line 356
    .line 357
    goto :goto_1

    .line 358
    :cond_7
    sget-object v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/b;->g:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/b;

    .line 359
    .line 360
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 361
    .line 362
    .line 363
    move-result v0

    .line 364
    iget-object v1, p0, LFf/d;->c:Ljava/lang/Object;

    .line 365
    .line 366
    check-cast v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/r;

    .line 367
    .line 368
    if-eqz v0, :cond_8

    .line 369
    .line 370
    const/4 p1, 0x1

    .line 371
    invoke-interface {v1, p1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/r;->a(Z)V

    .line 372
    .line 373
    .line 374
    goto :goto_1

    .line 375
    :cond_8
    sget-object v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/b;->h:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/b;

    .line 376
    .line 377
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 378
    .line 379
    .line 380
    move-result v0

    .line 381
    if-eqz v0, :cond_9

    .line 382
    .line 383
    invoke-interface {v1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/i;->a()V

    .line 384
    .line 385
    .line 386
    goto :goto_1

    .line 387
    :cond_9
    sget-object v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/b;->b:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/b;

    .line 388
    .line 389
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 390
    .line 391
    .line 392
    move-result v0

    .line 393
    if-eqz v0, :cond_a

    .line 394
    .line 395
    const/4 p1, 0x0

    .line 396
    invoke-interface {v1, p1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/r;->a(Z)V

    .line 397
    .line 398
    .line 399
    goto :goto_1

    .line 400
    :cond_a
    sget-object v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/a;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/a;

    .line 401
    .line 402
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 403
    .line 404
    .line 405
    move-result v0

    .line 406
    if-eqz v0, :cond_b

    .line 407
    .line 408
    invoke-interface {v1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/i;->b()V

    .line 409
    .line 410
    .line 411
    goto :goto_1

    .line 412
    :cond_b
    instance-of v0, p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/c;

    .line 413
    .line 414
    if-eqz v0, :cond_c

    .line 415
    .line 416
    check-cast p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/c;

    .line 417
    .line 418
    iget-object p1, p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/c;->a:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/c;

    .line 419
    .line 420
    invoke-interface {v1, p1}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/i;->e(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/c;)V

    .line 421
    .line 422
    .line 423
    goto :goto_1

    .line 424
    :cond_c
    sget-object v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/b;->f:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/b;

    .line 425
    .line 426
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 427
    .line 428
    .line 429
    move-result v0

    .line 430
    if-nez v0, :cond_e

    .line 431
    .line 432
    sget-object v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/b;->d:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/b;

    .line 433
    .line 434
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 435
    .line 436
    .line 437
    move-result p1

    .line 438
    if-eqz p1, :cond_d

    .line 439
    .line 440
    goto :goto_1

    .line 441
    :cond_d
    new-instance p1, LE5/Q;

    .line 442
    .line 443
    const/16 v0, 0x9

    .line 444
    .line 445
    const/4 v1, 0x0

    .line 446
    invoke-direct {p1, v1, v0}, LE5/Q;-><init>(BI)V

    .line 447
    .line 448
    .line 449
    throw p1

    .line 450
    :cond_e
    :goto_1
    sget-object p1, Lef/C;->a:Lef/C;

    .line 451
    .line 452
    return-object p1

    .line 453
    :pswitch_6
    check-cast p1, Ljava/lang/Boolean;

    .line 454
    .line 455
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 456
    .line 457
    .line 458
    iget-object p1, p0, LFf/d;->c:Ljava/lang/Object;

    .line 459
    .line 460
    check-cast p1, Lcom/moloco/sdk/internal/publisher/g;

    .line 461
    .line 462
    iget-object p1, p1, Lcom/moloco/sdk/internal/publisher/g;->b:Ljava/lang/String;

    .line 463
    .line 464
    const/4 v0, 0x0

    .line 465
    const/4 v1, 0x6

    .line 466
    invoke-static {p1, v0, v0, v1, v0}, Lcom/moloco/sdk/publisher/MolocoAdKt;->createAdInfo$default(Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;ILjava/lang/Object;)Lcom/moloco/sdk/publisher/MolocoAd;

    .line 467
    .line 468
    .line 469
    move-result-object p1

    .line 470
    iget-object v0, p0, LFf/d;->b:Ljava/lang/Object;

    .line 471
    .line 472
    check-cast v0, Lcom/moloco/sdk/internal/publisher/h;

    .line 473
    .line 474
    invoke-virtual {v0, p1}, Lcom/moloco/sdk/internal/publisher/h;->onRewardedVideoCompleted(Lcom/moloco/sdk/publisher/MolocoAd;)V

    .line 475
    .line 476
    .line 477
    sget-object p1, Lef/C;->a:Lef/C;

    .line 478
    .line 479
    return-object p1

    .line 480
    :pswitch_7
    check-cast p1, Ljava/lang/Throwable;

    .line 481
    .line 482
    iget-object p1, p0, LFf/d;->c:Ljava/lang/Object;

    .line 483
    .line 484
    check-cast p1, LNf/c;

    .line 485
    .line 486
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 487
    .line 488
    .line 489
    const/4 p1, 0x0

    .line 490
    iget-object v0, p0, LFf/d;->b:Ljava/lang/Object;

    .line 491
    .line 492
    check-cast v0, LNf/d;

    .line 493
    .line 494
    invoke-virtual {v0, p1}, LNf/d;->a(Ljava/lang/Object;)V

    .line 495
    .line 496
    .line 497
    sget-object p1, Lef/C;->a:Lef/C;

    .line 498
    .line 499
    return-object p1

    .line 500
    :pswitch_8
    check-cast p1, Ljava/lang/Throwable;

    .line 501
    .line 502
    iget-object p1, p0, LFf/d;->b:Ljava/lang/Object;

    .line 503
    .line 504
    check-cast p1, LFf/e;

    .line 505
    .line 506
    iget-object p1, p1, LFf/e;->b:Landroid/os/Handler;

    .line 507
    .line 508
    iget-object v0, p0, LFf/d;->c:Ljava/lang/Object;

    .line 509
    .line 510
    check-cast v0, LC8/d;

    .line 511
    .line 512
    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 513
    .line 514
    .line 515
    sget-object p1, Lef/C;->a:Lef/C;

    .line 516
    .line 517
    return-object p1

    .line 518
    nop

    .line 519
    :pswitch_data_0
    .packed-switch 0x0
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
