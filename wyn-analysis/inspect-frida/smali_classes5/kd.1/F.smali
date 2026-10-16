.class public final synthetic Lkd/F;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luc/c;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/inlineInstall/f;


# direct methods
.method public synthetic constructor <init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/inlineInstall/f;I)V
    .locals 0

    .line 1
    iput p2, p0, Lkd/F;->a:I

    iput-object p1, p0, Lkd/F;->b:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/inlineInstall/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)V
    .locals 5

    .line 1
    iget v0, p0, Lkd/F;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    instance-of v0, p1, Ljava/util/List;

    .line 7
    .line 8
    iget-object v1, p0, Lkd/F;->b:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/inlineInstall/f;

    .line 9
    .line 10
    iget-object v1, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/inlineInstall/f;->b:Ltf/l;

    .line 11
    .line 12
    const-string v2, ""

    .line 13
    .line 14
    if-eqz v0, :cond_2

    .line 15
    .line 16
    check-cast p1, Ljava/util/List;

    .line 17
    .line 18
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/4 v3, 0x1

    .line 23
    const/4 v4, 0x0

    .line 24
    if-le v0, v3, :cond_0

    .line 25
    .line 26
    new-instance v0, Lkd/a;

    .line 27
    .line 28
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    const-string v4, "null cannot be cast to non-null type kotlin.String"

    .line 33
    .line 34
    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    check-cast v2, Ljava/lang/String;

    .line 38
    .line 39
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    check-cast v3, Ljava/lang/String;

    .line 47
    .line 48
    const/4 v4, 0x2

    .line 49
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    check-cast p1, Ljava/lang/String;

    .line 54
    .line 55
    invoke-direct {v0, v2, v3, p1}, Lkd/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-static {v0}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    new-instance v0, Lkd/K;

    .line 63
    .line 64
    invoke-direct {v0, p1}, Lkd/K;-><init>(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    invoke-interface {v1, v0}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_0
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    if-nez v0, :cond_1

    .line 76
    .line 77
    const-string p1, "null-error"

    .line 78
    .line 79
    const-string v0, "Flutter api returned null value for non-null return value."

    .line 80
    .line 81
    invoke-static {p1, v0, v2}, Lka/n;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lef/m;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    new-instance v0, Lkd/K;

    .line 86
    .line 87
    invoke-direct {v0, p1}, Lkd/K;-><init>(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    invoke-interface {v1, v0}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_1
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    const-string v0, "null cannot be cast to non-null type kotlin.Boolean"

    .line 99
    .line 100
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    check-cast p1, Ljava/lang/Boolean;

    .line 104
    .line 105
    new-instance v0, Lkd/K;

    .line 106
    .line 107
    invoke-direct {v0, p1}, Lkd/K;-><init>(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    invoke-interface {v1, v0}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_2
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsConfirm\'."

    .line 115
    .line 116
    const-string v0, "channel-error"

    .line 117
    .line 118
    invoke-static {v0, p1, v2}, Lka/n;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lef/m;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    new-instance v0, Lkd/K;

    .line 123
    .line 124
    invoke-direct {v0, p1}, Lkd/K;-><init>(Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    invoke-interface {v1, v0}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    :goto_0
    return-void

    .line 131
    :pswitch_0
    instance-of v0, p1, Ljava/util/List;

    .line 132
    .line 133
    iget-object v1, p0, Lkd/F;->b:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/inlineInstall/f;

    .line 134
    .line 135
    iget-object v1, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/inlineInstall/f;->b:Ltf/l;

    .line 136
    .line 137
    const-string v2, ""

    .line 138
    .line 139
    if-eqz v0, :cond_5

    .line 140
    .line 141
    check-cast p1, Ljava/util/List;

    .line 142
    .line 143
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 144
    .line 145
    .line 146
    move-result v0

    .line 147
    const/4 v3, 0x1

    .line 148
    const/4 v4, 0x0

    .line 149
    if-le v0, v3, :cond_3

    .line 150
    .line 151
    new-instance v0, Lkd/a;

    .line 152
    .line 153
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    const-string v4, "null cannot be cast to non-null type kotlin.String"

    .line 158
    .line 159
    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    check-cast v2, Ljava/lang/String;

    .line 163
    .line 164
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v3

    .line 168
    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    check-cast v3, Ljava/lang/String;

    .line 172
    .line 173
    const/4 v4, 0x2

    .line 174
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    check-cast p1, Ljava/lang/String;

    .line 179
    .line 180
    invoke-direct {v0, v2, v3, p1}, Lkd/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    invoke-static {v0}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    .line 184
    .line 185
    .line 186
    move-result-object p1

    .line 187
    new-instance v0, Lkd/K;

    .line 188
    .line 189
    invoke-direct {v0, p1}, Lkd/K;-><init>(Ljava/lang/Object;)V

    .line 190
    .line 191
    .line 192
    invoke-interface {v1, v0}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    goto :goto_1

    .line 196
    :cond_3
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    if-nez v0, :cond_4

    .line 201
    .line 202
    const-string p1, "null-error"

    .line 203
    .line 204
    const-string v0, "Flutter api returned null value for non-null return value."

    .line 205
    .line 206
    invoke-static {p1, v0, v2}, Lka/n;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lef/m;

    .line 207
    .line 208
    .line 209
    move-result-object p1

    .line 210
    new-instance v0, Lkd/K;

    .line 211
    .line 212
    invoke-direct {v0, p1}, Lkd/K;-><init>(Ljava/lang/Object;)V

    .line 213
    .line 214
    .line 215
    invoke-interface {v1, v0}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    goto :goto_1

    .line 219
    :cond_4
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object p1

    .line 223
    const-string v0, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>"

    .line 224
    .line 225
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 226
    .line 227
    .line 228
    check-cast p1, Ljava/util/List;

    .line 229
    .line 230
    new-instance v0, Lkd/K;

    .line 231
    .line 232
    invoke-direct {v0, p1}, Lkd/K;-><init>(Ljava/lang/Object;)V

    .line 233
    .line 234
    .line 235
    invoke-interface {v1, v0}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    goto :goto_1

    .line 239
    :cond_5
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onShowFileChooser\'."

    .line 240
    .line 241
    const-string v0, "channel-error"

    .line 242
    .line 243
    invoke-static {v0, p1, v2}, Lka/n;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lef/m;

    .line 244
    .line 245
    .line 246
    move-result-object p1

    .line 247
    new-instance v0, Lkd/K;

    .line 248
    .line 249
    invoke-direct {v0, p1}, Lkd/K;-><init>(Ljava/lang/Object;)V

    .line 250
    .line 251
    .line 252
    invoke-interface {v1, v0}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    :goto_1
    return-void

    .line 256
    :pswitch_1
    instance-of v0, p1, Ljava/util/List;

    .line 257
    .line 258
    iget-object v1, p0, Lkd/F;->b:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/inlineInstall/f;

    .line 259
    .line 260
    iget-object v1, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/inlineInstall/f;->b:Ltf/l;

    .line 261
    .line 262
    if-eqz v0, :cond_7

    .line 263
    .line 264
    check-cast p1, Ljava/util/List;

    .line 265
    .line 266
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 267
    .line 268
    .line 269
    move-result v0

    .line 270
    const/4 v2, 0x1

    .line 271
    if-le v0, v2, :cond_6

    .line 272
    .line 273
    new-instance v0, Lkd/a;

    .line 274
    .line 275
    const/4 v3, 0x0

    .line 276
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-result-object v3

    .line 280
    const-string v4, "null cannot be cast to non-null type kotlin.String"

    .line 281
    .line 282
    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 283
    .line 284
    .line 285
    check-cast v3, Ljava/lang/String;

    .line 286
    .line 287
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v2

    .line 291
    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 292
    .line 293
    .line 294
    check-cast v2, Ljava/lang/String;

    .line 295
    .line 296
    const/4 v4, 0x2

    .line 297
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    move-result-object p1

    .line 301
    check-cast p1, Ljava/lang/String;

    .line 302
    .line 303
    invoke-direct {v0, v3, v2, p1}, Lkd/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 304
    .line 305
    .line 306
    invoke-static {v0}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    .line 307
    .line 308
    .line 309
    move-result-object p1

    .line 310
    new-instance v0, Lkd/K;

    .line 311
    .line 312
    invoke-direct {v0, p1}, Lkd/K;-><init>(Ljava/lang/Object;)V

    .line 313
    .line 314
    .line 315
    invoke-interface {v1, v0}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    goto :goto_2

    .line 319
    :cond_6
    sget-object p1, Lef/C;->a:Lef/C;

    .line 320
    .line 321
    new-instance v0, Lkd/K;

    .line 322
    .line 323
    invoke-direct {v0, p1}, Lkd/K;-><init>(Ljava/lang/Object;)V

    .line 324
    .line 325
    .line 326
    invoke-interface {v1, v0}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    goto :goto_2

    .line 330
    :cond_7
    const-string p1, ""

    .line 331
    .line 332
    const-string v0, "channel-error"

    .line 333
    .line 334
    const-string v2, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsAlert\'."

    .line 335
    .line 336
    invoke-static {v0, v2, p1}, Lka/n;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lef/m;

    .line 337
    .line 338
    .line 339
    move-result-object p1

    .line 340
    new-instance v0, Lkd/K;

    .line 341
    .line 342
    invoke-direct {v0, p1}, Lkd/K;-><init>(Ljava/lang/Object;)V

    .line 343
    .line 344
    .line 345
    invoke-interface {v1, v0}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 346
    .line 347
    .line 348
    :goto_2
    return-void

    .line 349
    :pswitch_2
    instance-of v0, p1, Ljava/util/List;

    .line 350
    .line 351
    iget-object v1, p0, Lkd/F;->b:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/inlineInstall/f;

    .line 352
    .line 353
    iget-object v1, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/inlineInstall/f;->b:Ltf/l;

    .line 354
    .line 355
    if-eqz v0, :cond_9

    .line 356
    .line 357
    check-cast p1, Ljava/util/List;

    .line 358
    .line 359
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 360
    .line 361
    .line 362
    move-result v0

    .line 363
    const/4 v2, 0x0

    .line 364
    const/4 v3, 0x1

    .line 365
    if-le v0, v3, :cond_8

    .line 366
    .line 367
    new-instance v0, Lkd/a;

    .line 368
    .line 369
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 370
    .line 371
    .line 372
    move-result-object v2

    .line 373
    const-string v4, "null cannot be cast to non-null type kotlin.String"

    .line 374
    .line 375
    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 376
    .line 377
    .line 378
    check-cast v2, Ljava/lang/String;

    .line 379
    .line 380
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 381
    .line 382
    .line 383
    move-result-object v3

    .line 384
    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 385
    .line 386
    .line 387
    check-cast v3, Ljava/lang/String;

    .line 388
    .line 389
    const/4 v4, 0x2

    .line 390
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 391
    .line 392
    .line 393
    move-result-object p1

    .line 394
    check-cast p1, Ljava/lang/String;

    .line 395
    .line 396
    invoke-direct {v0, v2, v3, p1}, Lkd/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 397
    .line 398
    .line 399
    invoke-static {v0}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    .line 400
    .line 401
    .line 402
    move-result-object p1

    .line 403
    new-instance v0, Lkd/K;

    .line 404
    .line 405
    invoke-direct {v0, p1}, Lkd/K;-><init>(Ljava/lang/Object;)V

    .line 406
    .line 407
    .line 408
    invoke-interface {v1, v0}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 409
    .line 410
    .line 411
    goto :goto_3

    .line 412
    :cond_8
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 413
    .line 414
    .line 415
    move-result-object p1

    .line 416
    check-cast p1, Ljava/lang/String;

    .line 417
    .line 418
    new-instance v0, Lkd/K;

    .line 419
    .line 420
    invoke-direct {v0, p1}, Lkd/K;-><init>(Ljava/lang/Object;)V

    .line 421
    .line 422
    .line 423
    invoke-interface {v1, v0}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 424
    .line 425
    .line 426
    goto :goto_3

    .line 427
    :cond_9
    const-string p1, ""

    .line 428
    .line 429
    const-string v0, "channel-error"

    .line 430
    .line 431
    const-string v2, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsPrompt\'."

    .line 432
    .line 433
    invoke-static {v0, v2, p1}, Lka/n;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lef/m;

    .line 434
    .line 435
    .line 436
    move-result-object p1

    .line 437
    new-instance v0, Lkd/K;

    .line 438
    .line 439
    invoke-direct {v0, p1}, Lkd/K;-><init>(Ljava/lang/Object;)V

    .line 440
    .line 441
    .line 442
    invoke-interface {v1, v0}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 443
    .line 444
    .line 445
    :goto_3
    return-void

    .line 446
    nop

    .line 447
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
