.class public final synthetic Lcom/unity3d/ads/core/data/datasource/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnSuccessListener;
.implements Luc/c;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ltf/l;


# direct methods
.method public synthetic constructor <init>(Ltf/l;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/unity3d/ads/core/data/datasource/a;->a:I

    iput-object p1, p0, Lcom/unity3d/ads/core/data/datasource/a;->b:Ltf/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Ljava/lang/Object;)V
    .locals 5

    .line 1
    iget v0, p0, Lcom/unity3d/ads/core/data/datasource/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    instance-of v0, p1, Ljava/util/List;

    .line 7
    .line 8
    iget-object v1, p0, Lcom/unity3d/ads/core/data/datasource/a;->b:Ltf/l;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    check-cast p1, Ljava/util/List;

    .line 13
    .line 14
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/4 v2, 0x1

    .line 19
    if-le v0, v2, :cond_0

    .line 20
    .line 21
    new-instance v0, Lkd/a;

    .line 22
    .line 23
    const/4 v3, 0x0

    .line 24
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    const-string v4, "null cannot be cast to non-null type kotlin.String"

    .line 29
    .line 30
    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    check-cast v3, Ljava/lang/String;

    .line 34
    .line 35
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    check-cast v2, Ljava/lang/String;

    .line 43
    .line 44
    const/4 v4, 0x2

    .line 45
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    check-cast p1, Ljava/lang/String;

    .line 50
    .line 51
    invoke-direct {v0, v3, v2, p1}, Lkd/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-static {v0}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    :goto_0
    invoke-static {p1, v1}, Lka/n;->n(Lef/m;Ltf/l;)V

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_0
    sget-object p1, Lef/C;->a:Lef/C;

    .line 63
    .line 64
    new-instance v0, Lef/n;

    .line 65
    .line 66
    invoke-direct {v0, p1}, Lef/n;-><init>(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    invoke-interface {v1, v0}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_1
    const-string p1, ""

    .line 74
    .line 75
    const-string v0, "channel-error"

    .line 76
    .line 77
    const-string v2, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedSslError\'."

    .line 78
    .line 79
    invoke-static {v0, v2, p1}, Lka/n;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lef/m;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    goto :goto_0

    .line 84
    :goto_1
    return-void

    .line 85
    :pswitch_0
    instance-of v0, p1, Ljava/util/List;

    .line 86
    .line 87
    iget-object v1, p0, Lcom/unity3d/ads/core/data/datasource/a;->b:Ltf/l;

    .line 88
    .line 89
    if-eqz v0, :cond_3

    .line 90
    .line 91
    check-cast p1, Ljava/util/List;

    .line 92
    .line 93
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    const/4 v2, 0x1

    .line 98
    if-le v0, v2, :cond_2

    .line 99
    .line 100
    new-instance v0, Lkd/a;

    .line 101
    .line 102
    const/4 v3, 0x0

    .line 103
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    const-string v4, "null cannot be cast to non-null type kotlin.String"

    .line 108
    .line 109
    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    check-cast v3, Ljava/lang/String;

    .line 113
    .line 114
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    check-cast v2, Ljava/lang/String;

    .line 122
    .line 123
    const/4 v4, 0x2

    .line 124
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    check-cast p1, Ljava/lang/String;

    .line 129
    .line 130
    invoke-direct {v0, v3, v2, p1}, Lkd/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    invoke-static {v0}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    :goto_2
    invoke-static {p1, v1}, Lka/n;->n(Lef/m;Ltf/l;)V

    .line 138
    .line 139
    .line 140
    goto :goto_3

    .line 141
    :cond_2
    sget-object p1, Lef/C;->a:Lef/C;

    .line 142
    .line 143
    new-instance v0, Lef/n;

    .line 144
    .line 145
    invoke-direct {v0, p1}, Lef/n;-><init>(Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    invoke-interface {v1, v0}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    goto :goto_3

    .line 152
    :cond_3
    const-string p1, ""

    .line 153
    .line 154
    const-string v0, "channel-error"

    .line 155
    .line 156
    const-string v2, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onFormResubmission\'."

    .line 157
    .line 158
    invoke-static {v0, v2, p1}, Lka/n;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lef/m;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    goto :goto_2

    .line 163
    :goto_3
    return-void

    .line 164
    :pswitch_1
    instance-of v0, p1, Ljava/util/List;

    .line 165
    .line 166
    iget-object v1, p0, Lcom/unity3d/ads/core/data/datasource/a;->b:Ltf/l;

    .line 167
    .line 168
    if-eqz v0, :cond_5

    .line 169
    .line 170
    check-cast p1, Ljava/util/List;

    .line 171
    .line 172
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 173
    .line 174
    .line 175
    move-result v0

    .line 176
    const/4 v2, 0x1

    .line 177
    if-le v0, v2, :cond_4

    .line 178
    .line 179
    new-instance v0, Lkd/a;

    .line 180
    .line 181
    const/4 v3, 0x0

    .line 182
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v3

    .line 186
    const-string v4, "null cannot be cast to non-null type kotlin.String"

    .line 187
    .line 188
    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    check-cast v3, Ljava/lang/String;

    .line 192
    .line 193
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v2

    .line 197
    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    check-cast v2, Ljava/lang/String;

    .line 201
    .line 202
    const/4 v4, 0x2

    .line 203
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object p1

    .line 207
    check-cast p1, Ljava/lang/String;

    .line 208
    .line 209
    invoke-direct {v0, v3, v2, p1}, Lkd/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    invoke-static {v0}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    .line 213
    .line 214
    .line 215
    move-result-object p1

    .line 216
    :goto_4
    invoke-static {p1, v1}, Lka/n;->n(Lef/m;Ltf/l;)V

    .line 217
    .line 218
    .line 219
    goto :goto_5

    .line 220
    :cond_4
    sget-object p1, Lef/C;->a:Lef/C;

    .line 221
    .line 222
    new-instance v0, Lef/n;

    .line 223
    .line 224
    invoke-direct {v0, p1}, Lef/n;-><init>(Ljava/lang/Object;)V

    .line 225
    .line 226
    .line 227
    invoke-interface {v1, v0}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    goto :goto_5

    .line 231
    :cond_5
    const-string p1, ""

    .line 232
    .line 233
    const-string v0, "channel-error"

    .line 234
    .line 235
    const-string v2, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedHttpAuthRequest\'."

    .line 236
    .line 237
    invoke-static {v0, v2, p1}, Lka/n;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lef/m;

    .line 238
    .line 239
    .line 240
    move-result-object p1

    .line 241
    goto :goto_4

    .line 242
    :goto_5
    return-void

    .line 243
    :pswitch_2
    instance-of v0, p1, Ljava/util/List;

    .line 244
    .line 245
    iget-object v1, p0, Lcom/unity3d/ads/core/data/datasource/a;->b:Ltf/l;

    .line 246
    .line 247
    if-eqz v0, :cond_7

    .line 248
    .line 249
    check-cast p1, Ljava/util/List;

    .line 250
    .line 251
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 252
    .line 253
    .line 254
    move-result v0

    .line 255
    const/4 v2, 0x1

    .line 256
    if-le v0, v2, :cond_6

    .line 257
    .line 258
    new-instance v0, Lkd/a;

    .line 259
    .line 260
    const/4 v3, 0x0

    .line 261
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v3

    .line 265
    const-string v4, "null cannot be cast to non-null type kotlin.String"

    .line 266
    .line 267
    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 268
    .line 269
    .line 270
    check-cast v3, Ljava/lang/String;

    .line 271
    .line 272
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object v2

    .line 276
    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 277
    .line 278
    .line 279
    check-cast v2, Ljava/lang/String;

    .line 280
    .line 281
    const/4 v4, 0x2

    .line 282
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object p1

    .line 286
    check-cast p1, Ljava/lang/String;

    .line 287
    .line 288
    invoke-direct {v0, v3, v2, p1}, Lkd/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 289
    .line 290
    .line 291
    invoke-static {v0}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    .line 292
    .line 293
    .line 294
    move-result-object p1

    .line 295
    :goto_6
    invoke-static {p1, v1}, Lka/n;->n(Lef/m;Ltf/l;)V

    .line 296
    .line 297
    .line 298
    goto :goto_7

    .line 299
    :cond_6
    sget-object p1, Lef/C;->a:Lef/C;

    .line 300
    .line 301
    new-instance v0, Lef/n;

    .line 302
    .line 303
    invoke-direct {v0, p1}, Lef/n;-><init>(Ljava/lang/Object;)V

    .line 304
    .line 305
    .line 306
    invoke-interface {v1, v0}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    goto :goto_7

    .line 310
    :cond_7
    const-string p1, ""

    .line 311
    .line 312
    const-string v0, "channel-error"

    .line 313
    .line 314
    const-string v2, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedError\'."

    .line 315
    .line 316
    invoke-static {v0, v2, p1}, Lka/n;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lef/m;

    .line 317
    .line 318
    .line 319
    move-result-object p1

    .line 320
    goto :goto_6

    .line 321
    :goto_7
    return-void

    .line 322
    :pswitch_3
    instance-of v0, p1, Ljava/util/List;

    .line 323
    .line 324
    iget-object v1, p0, Lcom/unity3d/ads/core/data/datasource/a;->b:Ltf/l;

    .line 325
    .line 326
    if-eqz v0, :cond_9

    .line 327
    .line 328
    check-cast p1, Ljava/util/List;

    .line 329
    .line 330
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 331
    .line 332
    .line 333
    move-result v0

    .line 334
    const/4 v2, 0x1

    .line 335
    if-le v0, v2, :cond_8

    .line 336
    .line 337
    new-instance v0, Lkd/a;

    .line 338
    .line 339
    const/4 v3, 0x0

    .line 340
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 341
    .line 342
    .line 343
    move-result-object v3

    .line 344
    const-string v4, "null cannot be cast to non-null type kotlin.String"

    .line 345
    .line 346
    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 347
    .line 348
    .line 349
    check-cast v3, Ljava/lang/String;

    .line 350
    .line 351
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 352
    .line 353
    .line 354
    move-result-object v2

    .line 355
    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 356
    .line 357
    .line 358
    check-cast v2, Ljava/lang/String;

    .line 359
    .line 360
    const/4 v4, 0x2

    .line 361
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 362
    .line 363
    .line 364
    move-result-object p1

    .line 365
    check-cast p1, Ljava/lang/String;

    .line 366
    .line 367
    invoke-direct {v0, v3, v2, p1}, Lkd/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 368
    .line 369
    .line 370
    invoke-static {v0}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    .line 371
    .line 372
    .line 373
    move-result-object p1

    .line 374
    :goto_8
    invoke-static {p1, v1}, Lka/n;->n(Lef/m;Ltf/l;)V

    .line 375
    .line 376
    .line 377
    goto :goto_9

    .line 378
    :cond_8
    sget-object p1, Lef/C;->a:Lef/C;

    .line 379
    .line 380
    new-instance v0, Lef/n;

    .line 381
    .line 382
    invoke-direct {v0, p1}, Lef/n;-><init>(Ljava/lang/Object;)V

    .line 383
    .line 384
    .line 385
    invoke-interface {v1, v0}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 386
    .line 387
    .line 388
    goto :goto_9

    .line 389
    :cond_9
    const-string p1, ""

    .line 390
    .line 391
    const-string v0, "channel-error"

    .line 392
    .line 393
    const-string v2, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageFinished\'."

    .line 394
    .line 395
    invoke-static {v0, v2, p1}, Lka/n;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lef/m;

    .line 396
    .line 397
    .line 398
    move-result-object p1

    .line 399
    goto :goto_8

    .line 400
    :goto_9
    return-void

    .line 401
    :pswitch_4
    instance-of v0, p1, Ljava/util/List;

    .line 402
    .line 403
    iget-object v1, p0, Lcom/unity3d/ads/core/data/datasource/a;->b:Ltf/l;

    .line 404
    .line 405
    if-eqz v0, :cond_b

    .line 406
    .line 407
    check-cast p1, Ljava/util/List;

    .line 408
    .line 409
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 410
    .line 411
    .line 412
    move-result v0

    .line 413
    const/4 v2, 0x1

    .line 414
    if-le v0, v2, :cond_a

    .line 415
    .line 416
    new-instance v0, Lkd/a;

    .line 417
    .line 418
    const/4 v3, 0x0

    .line 419
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 420
    .line 421
    .line 422
    move-result-object v3

    .line 423
    const-string v4, "null cannot be cast to non-null type kotlin.String"

    .line 424
    .line 425
    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 426
    .line 427
    .line 428
    check-cast v3, Ljava/lang/String;

    .line 429
    .line 430
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 431
    .line 432
    .line 433
    move-result-object v2

    .line 434
    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 435
    .line 436
    .line 437
    check-cast v2, Ljava/lang/String;

    .line 438
    .line 439
    const/4 v4, 0x2

    .line 440
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 441
    .line 442
    .line 443
    move-result-object p1

    .line 444
    check-cast p1, Ljava/lang/String;

    .line 445
    .line 446
    invoke-direct {v0, v3, v2, p1}, Lkd/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 447
    .line 448
    .line 449
    invoke-static {v0}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    .line 450
    .line 451
    .line 452
    move-result-object p1

    .line 453
    :goto_a
    invoke-static {p1, v1}, Lka/n;->n(Lef/m;Ltf/l;)V

    .line 454
    .line 455
    .line 456
    goto :goto_b

    .line 457
    :cond_a
    sget-object p1, Lef/C;->a:Lef/C;

    .line 458
    .line 459
    new-instance v0, Lef/n;

    .line 460
    .line 461
    invoke-direct {v0, p1}, Lef/n;-><init>(Ljava/lang/Object;)V

    .line 462
    .line 463
    .line 464
    invoke-interface {v1, v0}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 465
    .line 466
    .line 467
    goto :goto_b

    .line 468
    :cond_b
    const-string p1, ""

    .line 469
    .line 470
    const-string v0, "channel-error"

    .line 471
    .line 472
    const-string v2, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageCommitVisible\'."

    .line 473
    .line 474
    invoke-static {v0, v2, p1}, Lka/n;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lef/m;

    .line 475
    .line 476
    .line 477
    move-result-object p1

    .line 478
    goto :goto_a

    .line 479
    :goto_b
    return-void

    .line 480
    :pswitch_5
    instance-of v0, p1, Ljava/util/List;

    .line 481
    .line 482
    iget-object v1, p0, Lcom/unity3d/ads/core/data/datasource/a;->b:Ltf/l;

    .line 483
    .line 484
    if-eqz v0, :cond_d

    .line 485
    .line 486
    check-cast p1, Ljava/util/List;

    .line 487
    .line 488
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 489
    .line 490
    .line 491
    move-result v0

    .line 492
    const/4 v2, 0x1

    .line 493
    if-le v0, v2, :cond_c

    .line 494
    .line 495
    new-instance v0, Lkd/a;

    .line 496
    .line 497
    const/4 v3, 0x0

    .line 498
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 499
    .line 500
    .line 501
    move-result-object v3

    .line 502
    const-string v4, "null cannot be cast to non-null type kotlin.String"

    .line 503
    .line 504
    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 505
    .line 506
    .line 507
    check-cast v3, Ljava/lang/String;

    .line 508
    .line 509
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 510
    .line 511
    .line 512
    move-result-object v2

    .line 513
    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 514
    .line 515
    .line 516
    check-cast v2, Ljava/lang/String;

    .line 517
    .line 518
    const/4 v4, 0x2

    .line 519
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 520
    .line 521
    .line 522
    move-result-object p1

    .line 523
    check-cast p1, Ljava/lang/String;

    .line 524
    .line 525
    invoke-direct {v0, v3, v2, p1}, Lkd/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 526
    .line 527
    .line 528
    invoke-static {v0}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    .line 529
    .line 530
    .line 531
    move-result-object p1

    .line 532
    :goto_c
    invoke-static {p1, v1}, Lka/n;->n(Lef/m;Ltf/l;)V

    .line 533
    .line 534
    .line 535
    goto :goto_d

    .line 536
    :cond_c
    sget-object p1, Lef/C;->a:Lef/C;

    .line 537
    .line 538
    new-instance v0, Lef/n;

    .line 539
    .line 540
    invoke-direct {v0, p1}, Lef/n;-><init>(Ljava/lang/Object;)V

    .line 541
    .line 542
    .line 543
    invoke-interface {v1, v0}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 544
    .line 545
    .line 546
    goto :goto_d

    .line 547
    :cond_d
    const-string p1, ""

    .line 548
    .line 549
    const-string v0, "channel-error"

    .line 550
    .line 551
    const-string v2, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.WebViewClient.requestLoading\'."

    .line 552
    .line 553
    invoke-static {v0, v2, p1}, Lka/n;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lef/m;

    .line 554
    .line 555
    .line 556
    move-result-object p1

    .line 557
    goto :goto_c

    .line 558
    :goto_d
    return-void

    .line 559
    :pswitch_6
    instance-of v0, p1, Ljava/util/List;

    .line 560
    .line 561
    iget-object v1, p0, Lcom/unity3d/ads/core/data/datasource/a;->b:Ltf/l;

    .line 562
    .line 563
    if-eqz v0, :cond_f

    .line 564
    .line 565
    check-cast p1, Ljava/util/List;

    .line 566
    .line 567
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 568
    .line 569
    .line 570
    move-result v0

    .line 571
    const/4 v2, 0x1

    .line 572
    if-le v0, v2, :cond_e

    .line 573
    .line 574
    new-instance v0, Lkd/a;

    .line 575
    .line 576
    const/4 v3, 0x0

    .line 577
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 578
    .line 579
    .line 580
    move-result-object v3

    .line 581
    const-string v4, "null cannot be cast to non-null type kotlin.String"

    .line 582
    .line 583
    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 584
    .line 585
    .line 586
    check-cast v3, Ljava/lang/String;

    .line 587
    .line 588
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 589
    .line 590
    .line 591
    move-result-object v2

    .line 592
    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 593
    .line 594
    .line 595
    check-cast v2, Ljava/lang/String;

    .line 596
    .line 597
    const/4 v4, 0x2

    .line 598
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 599
    .line 600
    .line 601
    move-result-object p1

    .line 602
    check-cast p1, Ljava/lang/String;

    .line 603
    .line 604
    invoke-direct {v0, v3, v2, p1}, Lkd/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 605
    .line 606
    .line 607
    invoke-static {v0}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    .line 608
    .line 609
    .line 610
    move-result-object p1

    .line 611
    :goto_e
    invoke-static {p1, v1}, Lka/n;->n(Lef/m;Ltf/l;)V

    .line 612
    .line 613
    .line 614
    goto :goto_f

    .line 615
    :cond_e
    sget-object p1, Lef/C;->a:Lef/C;

    .line 616
    .line 617
    new-instance v0, Lef/n;

    .line 618
    .line 619
    invoke-direct {v0, p1}, Lef/n;-><init>(Ljava/lang/Object;)V

    .line 620
    .line 621
    .line 622
    invoke-interface {v1, v0}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 623
    .line 624
    .line 625
    goto :goto_f

    .line 626
    :cond_f
    const-string p1, ""

    .line 627
    .line 628
    const-string v0, "channel-error"

    .line 629
    .line 630
    const-string v2, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedClientCertRequest\'."

    .line 631
    .line 632
    invoke-static {v0, v2, p1}, Lka/n;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lef/m;

    .line 633
    .line 634
    .line 635
    move-result-object p1

    .line 636
    goto :goto_e

    .line 637
    :goto_f
    return-void

    .line 638
    :pswitch_7
    instance-of v0, p1, Ljava/util/List;

    .line 639
    .line 640
    iget-object v1, p0, Lcom/unity3d/ads/core/data/datasource/a;->b:Ltf/l;

    .line 641
    .line 642
    if-eqz v0, :cond_11

    .line 643
    .line 644
    check-cast p1, Ljava/util/List;

    .line 645
    .line 646
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 647
    .line 648
    .line 649
    move-result v0

    .line 650
    const/4 v2, 0x1

    .line 651
    if-le v0, v2, :cond_10

    .line 652
    .line 653
    new-instance v0, Lkd/a;

    .line 654
    .line 655
    const/4 v3, 0x0

    .line 656
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 657
    .line 658
    .line 659
    move-result-object v3

    .line 660
    const-string v4, "null cannot be cast to non-null type kotlin.String"

    .line 661
    .line 662
    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 663
    .line 664
    .line 665
    check-cast v3, Ljava/lang/String;

    .line 666
    .line 667
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 668
    .line 669
    .line 670
    move-result-object v2

    .line 671
    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 672
    .line 673
    .line 674
    check-cast v2, Ljava/lang/String;

    .line 675
    .line 676
    const/4 v4, 0x2

    .line 677
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 678
    .line 679
    .line 680
    move-result-object p1

    .line 681
    check-cast p1, Ljava/lang/String;

    .line 682
    .line 683
    invoke-direct {v0, v3, v2, p1}, Lkd/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 684
    .line 685
    .line 686
    invoke-static {v0}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    .line 687
    .line 688
    .line 689
    move-result-object p1

    .line 690
    :goto_10
    invoke-static {p1, v1}, Lka/n;->n(Lef/m;Ltf/l;)V

    .line 691
    .line 692
    .line 693
    goto :goto_11

    .line 694
    :cond_10
    sget-object p1, Lef/C;->a:Lef/C;

    .line 695
    .line 696
    new-instance v0, Lef/n;

    .line 697
    .line 698
    invoke-direct {v0, p1}, Lef/n;-><init>(Ljava/lang/Object;)V

    .line 699
    .line 700
    .line 701
    invoke-interface {v1, v0}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 702
    .line 703
    .line 704
    goto :goto_11

    .line 705
    :cond_11
    const-string p1, ""

    .line 706
    .line 707
    const-string v0, "channel-error"

    .line 708
    .line 709
    const-string v2, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageStarted\'."

    .line 710
    .line 711
    invoke-static {v0, v2, p1}, Lka/n;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lef/m;

    .line 712
    .line 713
    .line 714
    move-result-object p1

    .line 715
    goto :goto_10

    .line 716
    :goto_11
    return-void

    .line 717
    :pswitch_8
    instance-of v0, p1, Ljava/util/List;

    .line 718
    .line 719
    iget-object v1, p0, Lcom/unity3d/ads/core/data/datasource/a;->b:Ltf/l;

    .line 720
    .line 721
    if-eqz v0, :cond_13

    .line 722
    .line 723
    check-cast p1, Ljava/util/List;

    .line 724
    .line 725
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 726
    .line 727
    .line 728
    move-result v0

    .line 729
    const/4 v2, 0x1

    .line 730
    if-le v0, v2, :cond_12

    .line 731
    .line 732
    new-instance v0, Lkd/a;

    .line 733
    .line 734
    const/4 v3, 0x0

    .line 735
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 736
    .line 737
    .line 738
    move-result-object v3

    .line 739
    const-string v4, "null cannot be cast to non-null type kotlin.String"

    .line 740
    .line 741
    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 742
    .line 743
    .line 744
    check-cast v3, Ljava/lang/String;

    .line 745
    .line 746
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 747
    .line 748
    .line 749
    move-result-object v2

    .line 750
    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 751
    .line 752
    .line 753
    check-cast v2, Ljava/lang/String;

    .line 754
    .line 755
    const/4 v4, 0x2

    .line 756
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 757
    .line 758
    .line 759
    move-result-object p1

    .line 760
    check-cast p1, Ljava/lang/String;

    .line 761
    .line 762
    invoke-direct {v0, v3, v2, p1}, Lkd/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 763
    .line 764
    .line 765
    invoke-static {v0}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    .line 766
    .line 767
    .line 768
    move-result-object p1

    .line 769
    :goto_12
    invoke-static {p1, v1}, Lka/n;->n(Lef/m;Ltf/l;)V

    .line 770
    .line 771
    .line 772
    goto :goto_13

    .line 773
    :cond_12
    sget-object p1, Lef/C;->a:Lef/C;

    .line 774
    .line 775
    new-instance v0, Lef/n;

    .line 776
    .line 777
    invoke-direct {v0, p1}, Lef/n;-><init>(Ljava/lang/Object;)V

    .line 778
    .line 779
    .line 780
    invoke-interface {v1, v0}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 781
    .line 782
    .line 783
    goto :goto_13

    .line 784
    :cond_13
    const-string p1, ""

    .line 785
    .line 786
    const-string v0, "channel-error"

    .line 787
    .line 788
    const-string v2, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedLoginRequest\'."

    .line 789
    .line 790
    invoke-static {v0, v2, p1}, Lka/n;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lef/m;

    .line 791
    .line 792
    .line 793
    move-result-object p1

    .line 794
    goto :goto_12

    .line 795
    :goto_13
    return-void

    .line 796
    :pswitch_9
    instance-of v0, p1, Ljava/util/List;

    .line 797
    .line 798
    iget-object v1, p0, Lcom/unity3d/ads/core/data/datasource/a;->b:Ltf/l;

    .line 799
    .line 800
    if-eqz v0, :cond_15

    .line 801
    .line 802
    check-cast p1, Ljava/util/List;

    .line 803
    .line 804
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 805
    .line 806
    .line 807
    move-result v0

    .line 808
    const/4 v2, 0x1

    .line 809
    if-le v0, v2, :cond_14

    .line 810
    .line 811
    new-instance v0, Lkd/a;

    .line 812
    .line 813
    const/4 v3, 0x0

    .line 814
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 815
    .line 816
    .line 817
    move-result-object v3

    .line 818
    const-string v4, "null cannot be cast to non-null type kotlin.String"

    .line 819
    .line 820
    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 821
    .line 822
    .line 823
    check-cast v3, Ljava/lang/String;

    .line 824
    .line 825
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 826
    .line 827
    .line 828
    move-result-object v2

    .line 829
    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 830
    .line 831
    .line 832
    check-cast v2, Ljava/lang/String;

    .line 833
    .line 834
    const/4 v4, 0x2

    .line 835
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 836
    .line 837
    .line 838
    move-result-object p1

    .line 839
    check-cast p1, Ljava/lang/String;

    .line 840
    .line 841
    invoke-direct {v0, v3, v2, p1}, Lkd/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 842
    .line 843
    .line 844
    invoke-static {v0}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    .line 845
    .line 846
    .line 847
    move-result-object p1

    .line 848
    :goto_14
    invoke-static {p1, v1}, Lka/n;->n(Lef/m;Ltf/l;)V

    .line 849
    .line 850
    .line 851
    goto :goto_15

    .line 852
    :cond_14
    sget-object p1, Lef/C;->a:Lef/C;

    .line 853
    .line 854
    new-instance v0, Lef/n;

    .line 855
    .line 856
    invoke-direct {v0, p1}, Lef/n;-><init>(Ljava/lang/Object;)V

    .line 857
    .line 858
    .line 859
    invoke-interface {v1, v0}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 860
    .line 861
    .line 862
    goto :goto_15

    .line 863
    :cond_15
    const-string p1, ""

    .line 864
    .line 865
    const-string v0, "channel-error"

    .line 866
    .line 867
    const-string v2, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onLoadResource\'."

    .line 868
    .line 869
    invoke-static {v0, v2, p1}, Lka/n;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lef/m;

    .line 870
    .line 871
    .line 872
    move-result-object p1

    .line 873
    goto :goto_14

    .line 874
    :goto_15
    return-void

    .line 875
    :pswitch_a
    instance-of v0, p1, Ljava/util/List;

    .line 876
    .line 877
    iget-object v1, p0, Lcom/unity3d/ads/core/data/datasource/a;->b:Ltf/l;

    .line 878
    .line 879
    if-eqz v0, :cond_17

    .line 880
    .line 881
    check-cast p1, Ljava/util/List;

    .line 882
    .line 883
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 884
    .line 885
    .line 886
    move-result v0

    .line 887
    const/4 v2, 0x1

    .line 888
    if-le v0, v2, :cond_16

    .line 889
    .line 890
    new-instance v0, Lkd/a;

    .line 891
    .line 892
    const/4 v3, 0x0

    .line 893
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 894
    .line 895
    .line 896
    move-result-object v3

    .line 897
    const-string v4, "null cannot be cast to non-null type kotlin.String"

    .line 898
    .line 899
    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 900
    .line 901
    .line 902
    check-cast v3, Ljava/lang/String;

    .line 903
    .line 904
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 905
    .line 906
    .line 907
    move-result-object v2

    .line 908
    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 909
    .line 910
    .line 911
    check-cast v2, Ljava/lang/String;

    .line 912
    .line 913
    const/4 v4, 0x2

    .line 914
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 915
    .line 916
    .line 917
    move-result-object p1

    .line 918
    check-cast p1, Ljava/lang/String;

    .line 919
    .line 920
    invoke-direct {v0, v3, v2, p1}, Lkd/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 921
    .line 922
    .line 923
    invoke-static {v0}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    .line 924
    .line 925
    .line 926
    move-result-object p1

    .line 927
    :goto_16
    invoke-static {p1, v1}, Lka/n;->n(Lef/m;Ltf/l;)V

    .line 928
    .line 929
    .line 930
    goto :goto_17

    .line 931
    :cond_16
    sget-object p1, Lef/C;->a:Lef/C;

    .line 932
    .line 933
    new-instance v0, Lef/n;

    .line 934
    .line 935
    invoke-direct {v0, p1}, Lef/n;-><init>(Ljava/lang/Object;)V

    .line 936
    .line 937
    .line 938
    invoke-interface {v1, v0}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 939
    .line 940
    .line 941
    goto :goto_17

    .line 942
    :cond_17
    const-string p1, ""

    .line 943
    .line 944
    const-string v0, "channel-error"

    .line 945
    .line 946
    const-string v2, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedHttpError\'."

    .line 947
    .line 948
    invoke-static {v0, v2, p1}, Lka/n;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lef/m;

    .line 949
    .line 950
    .line 951
    move-result-object p1

    .line 952
    goto :goto_16

    .line 953
    :goto_17
    return-void

    .line 954
    :pswitch_b
    instance-of v0, p1, Ljava/util/List;

    .line 955
    .line 956
    iget-object v1, p0, Lcom/unity3d/ads/core/data/datasource/a;->b:Ltf/l;

    .line 957
    .line 958
    if-eqz v0, :cond_19

    .line 959
    .line 960
    check-cast p1, Ljava/util/List;

    .line 961
    .line 962
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 963
    .line 964
    .line 965
    move-result v0

    .line 966
    const/4 v2, 0x1

    .line 967
    if-le v0, v2, :cond_18

    .line 968
    .line 969
    new-instance v0, Lkd/a;

    .line 970
    .line 971
    const/4 v3, 0x0

    .line 972
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 973
    .line 974
    .line 975
    move-result-object v3

    .line 976
    const-string v4, "null cannot be cast to non-null type kotlin.String"

    .line 977
    .line 978
    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 979
    .line 980
    .line 981
    check-cast v3, Ljava/lang/String;

    .line 982
    .line 983
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 984
    .line 985
    .line 986
    move-result-object v2

    .line 987
    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 988
    .line 989
    .line 990
    check-cast v2, Ljava/lang/String;

    .line 991
    .line 992
    const/4 v4, 0x2

    .line 993
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 994
    .line 995
    .line 996
    move-result-object p1

    .line 997
    check-cast p1, Ljava/lang/String;

    .line 998
    .line 999
    invoke-direct {v0, v3, v2, p1}, Lkd/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1000
    .line 1001
    .line 1002
    invoke-static {v0}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    .line 1003
    .line 1004
    .line 1005
    move-result-object p1

    .line 1006
    :goto_18
    invoke-static {p1, v1}, Lka/n;->n(Lef/m;Ltf/l;)V

    .line 1007
    .line 1008
    .line 1009
    goto :goto_19

    .line 1010
    :cond_18
    sget-object p1, Lef/C;->a:Lef/C;

    .line 1011
    .line 1012
    new-instance v0, Lef/n;

    .line 1013
    .line 1014
    invoke-direct {v0, p1}, Lef/n;-><init>(Ljava/lang/Object;)V

    .line 1015
    .line 1016
    .line 1017
    invoke-interface {v1, v0}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1018
    .line 1019
    .line 1020
    goto :goto_19

    .line 1021
    :cond_19
    const-string p1, ""

    .line 1022
    .line 1023
    const-string v0, "channel-error"

    .line 1024
    .line 1025
    const-string v2, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.WebViewClient.doUpdateVisitedHistory\'."

    .line 1026
    .line 1027
    invoke-static {v0, v2, p1}, Lka/n;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lef/m;

    .line 1028
    .line 1029
    .line 1030
    move-result-object p1

    .line 1031
    goto :goto_18

    .line 1032
    :goto_19
    return-void

    .line 1033
    :pswitch_c
    instance-of v0, p1, Ljava/util/List;

    .line 1034
    .line 1035
    iget-object v1, p0, Lcom/unity3d/ads/core/data/datasource/a;->b:Ltf/l;

    .line 1036
    .line 1037
    if-eqz v0, :cond_1b

    .line 1038
    .line 1039
    check-cast p1, Ljava/util/List;

    .line 1040
    .line 1041
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 1042
    .line 1043
    .line 1044
    move-result v0

    .line 1045
    const/4 v2, 0x1

    .line 1046
    if-le v0, v2, :cond_1a

    .line 1047
    .line 1048
    new-instance v0, Lkd/a;

    .line 1049
    .line 1050
    const/4 v3, 0x0

    .line 1051
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1052
    .line 1053
    .line 1054
    move-result-object v3

    .line 1055
    const-string v4, "null cannot be cast to non-null type kotlin.String"

    .line 1056
    .line 1057
    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1058
    .line 1059
    .line 1060
    check-cast v3, Ljava/lang/String;

    .line 1061
    .line 1062
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1063
    .line 1064
    .line 1065
    move-result-object v2

    .line 1066
    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1067
    .line 1068
    .line 1069
    check-cast v2, Ljava/lang/String;

    .line 1070
    .line 1071
    const/4 v4, 0x2

    .line 1072
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1073
    .line 1074
    .line 1075
    move-result-object p1

    .line 1076
    check-cast p1, Ljava/lang/String;

    .line 1077
    .line 1078
    invoke-direct {v0, v3, v2, p1}, Lkd/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1079
    .line 1080
    .line 1081
    invoke-static {v0}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    .line 1082
    .line 1083
    .line 1084
    move-result-object p1

    .line 1085
    :goto_1a
    invoke-static {p1, v1}, Lka/n;->n(Lef/m;Ltf/l;)V

    .line 1086
    .line 1087
    .line 1088
    goto :goto_1b

    .line 1089
    :cond_1a
    sget-object p1, Lef/C;->a:Lef/C;

    .line 1090
    .line 1091
    new-instance v0, Lef/n;

    .line 1092
    .line 1093
    invoke-direct {v0, p1}, Lef/n;-><init>(Ljava/lang/Object;)V

    .line 1094
    .line 1095
    .line 1096
    invoke-interface {v1, v0}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1097
    .line 1098
    .line 1099
    goto :goto_1b

    .line 1100
    :cond_1b
    const-string p1, ""

    .line 1101
    .line 1102
    const-string v0, "channel-error"

    .line 1103
    .line 1104
    const-string v2, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.WebViewClient.urlLoading\'."

    .line 1105
    .line 1106
    invoke-static {v0, v2, p1}, Lka/n;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lef/m;

    .line 1107
    .line 1108
    .line 1109
    move-result-object p1

    .line 1110
    goto :goto_1a

    .line 1111
    :goto_1b
    return-void

    .line 1112
    :pswitch_d
    instance-of v0, p1, Ljava/util/List;

    .line 1113
    .line 1114
    iget-object v1, p0, Lcom/unity3d/ads/core/data/datasource/a;->b:Ltf/l;

    .line 1115
    .line 1116
    if-eqz v0, :cond_1d

    .line 1117
    .line 1118
    check-cast p1, Ljava/util/List;

    .line 1119
    .line 1120
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 1121
    .line 1122
    .line 1123
    move-result v0

    .line 1124
    const/4 v2, 0x1

    .line 1125
    if-le v0, v2, :cond_1c

    .line 1126
    .line 1127
    new-instance v0, Lkd/a;

    .line 1128
    .line 1129
    const/4 v3, 0x0

    .line 1130
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1131
    .line 1132
    .line 1133
    move-result-object v3

    .line 1134
    const-string v4, "null cannot be cast to non-null type kotlin.String"

    .line 1135
    .line 1136
    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1137
    .line 1138
    .line 1139
    check-cast v3, Ljava/lang/String;

    .line 1140
    .line 1141
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1142
    .line 1143
    .line 1144
    move-result-object v2

    .line 1145
    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1146
    .line 1147
    .line 1148
    check-cast v2, Ljava/lang/String;

    .line 1149
    .line 1150
    const/4 v4, 0x2

    .line 1151
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1152
    .line 1153
    .line 1154
    move-result-object p1

    .line 1155
    check-cast p1, Ljava/lang/String;

    .line 1156
    .line 1157
    invoke-direct {v0, v3, v2, p1}, Lkd/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1158
    .line 1159
    .line 1160
    invoke-static {v0}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    .line 1161
    .line 1162
    .line 1163
    move-result-object p1

    .line 1164
    :goto_1c
    invoke-static {p1, v1}, Lka/n;->n(Lef/m;Ltf/l;)V

    .line 1165
    .line 1166
    .line 1167
    goto :goto_1d

    .line 1168
    :cond_1c
    sget-object p1, Lef/C;->a:Lef/C;

    .line 1169
    .line 1170
    new-instance v0, Lef/n;

    .line 1171
    .line 1172
    invoke-direct {v0, p1}, Lef/n;-><init>(Ljava/lang/Object;)V

    .line 1173
    .line 1174
    .line 1175
    invoke-interface {v1, v0}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1176
    .line 1177
    .line 1178
    goto :goto_1d

    .line 1179
    :cond_1d
    const-string p1, ""

    .line 1180
    .line 1181
    const-string v0, "channel-error"

    .line 1182
    .line 1183
    const-string v2, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onScaleChanged\'."

    .line 1184
    .line 1185
    invoke-static {v0, v2, p1}, Lka/n;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lef/m;

    .line 1186
    .line 1187
    .line 1188
    move-result-object p1

    .line 1189
    goto :goto_1c

    .line 1190
    :goto_1d
    return-void

    .line 1191
    :pswitch_data_0
    .packed-switch 0x1
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

.method public onSuccess(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/unity3d/ads/core/data/datasource/a;->b:Ltf/l;

    invoke-static {p1, v0}, Lcom/unity3d/ads/core/data/datasource/AndroidAppSetIdDataSource;->a(Ljava/lang/Object;Ltf/l;)V

    return-void
.end method
