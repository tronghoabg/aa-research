.class public final synthetic Lkd/D;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luc/b;
.implements Luc/c;
.implements Ljg/a;
.implements Lld/c;
.implements Ljg/b;
.implements Lk8/h;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lkd/D;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p2, p0, Lkd/D;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public accept(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/io/IOException;

    .line 2
    .line 3
    throw p1
.end method

.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lkd/D;->a:I

    .line 2
    .line 3
    check-cast p1, LP2/a;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-wide v0, p1, LP2/a;->c:J

    .line 9
    .line 10
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1

    .line 15
    :pswitch_0
    iget-wide v0, p1, LP2/a;->b:J

    .line 16
    .line 17
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    return-object p1

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x1c
        :pswitch_0
    .end packed-switch
.end method

.method public b(Landroid/view/View;)Z
    .locals 0

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->hasFocus()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method public c(Ljava/lang/Object;)V
    .locals 7

    .line 1
    const-string v0, "channel-error"

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const-string v3, "null cannot be cast to non-null type kotlin.String"

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x1

    .line 10
    iget v6, p0, Lkd/D;->a:I

    .line 11
    .line 12
    packed-switch v6, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    :pswitch_0
    instance-of v6, p1, Ljava/util/List;

    .line 16
    .line 17
    if-eqz v6, :cond_1

    .line 18
    .line 19
    check-cast p1, Ljava/util/List;

    .line 20
    .line 21
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-le v0, v5, :cond_0

    .line 26
    .line 27
    new-instance v0, Lkd/a;

    .line 28
    .line 29
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    check-cast v1, Ljava/lang/String;

    .line 37
    .line 38
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    check-cast v4, Ljava/lang/String;

    .line 46
    .line 47
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    check-cast p1, Ljava/lang/String;

    .line 52
    .line 53
    invoke-direct {v0, v1, v4, p1}, Lkd/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-static {v0}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    .line 57
    .line 58
    .line 59
    sget p1, Lkd/g;->e:I

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_0
    sget p1, Lkd/g;->e:I

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_1
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.X509Certificate.pigeon_newInstance\'."

    .line 66
    .line 67
    invoke-static {v0, p1, v1}, Lka/n;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    sget p1, Lkd/g;->e:I

    .line 71
    .line 72
    :goto_0
    return-void

    .line 73
    :pswitch_1
    instance-of v6, p1, Ljava/util/List;

    .line 74
    .line 75
    if-eqz v6, :cond_3

    .line 76
    .line 77
    check-cast p1, Ljava/util/List;

    .line 78
    .line 79
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-le v0, v5, :cond_2

    .line 84
    .line 85
    new-instance v0, Lkd/a;

    .line 86
    .line 87
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    check-cast v1, Ljava/lang/String;

    .line 95
    .line 96
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    check-cast v4, Ljava/lang/String;

    .line 104
    .line 105
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    check-cast p1, Ljava/lang/String;

    .line 110
    .line 111
    invoke-direct {v0, v1, v4, p1}, Lkd/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    invoke-static {v0}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    .line 115
    .line 116
    .line 117
    sget p1, Lkd/g;->e:I

    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_2
    sget p1, Lkd/g;->e:I

    .line 121
    .line 122
    goto :goto_1

    .line 123
    :cond_3
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.WebViewPoint.pigeon_newInstance\'."

    .line 124
    .line 125
    invoke-static {v0, p1, v1}, Lka/n;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    sget p1, Lkd/g;->e:I

    .line 129
    .line 130
    :goto_1
    return-void

    .line 131
    :pswitch_2
    instance-of v6, p1, Ljava/util/List;

    .line 132
    .line 133
    if-eqz v6, :cond_5

    .line 134
    .line 135
    check-cast p1, Ljava/util/List;

    .line 136
    .line 137
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    if-le v0, v5, :cond_4

    .line 142
    .line 143
    new-instance v0, Lkd/a;

    .line 144
    .line 145
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    check-cast v1, Ljava/lang/String;

    .line 153
    .line 154
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v4

    .line 158
    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    check-cast v4, Ljava/lang/String;

    .line 162
    .line 163
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    check-cast p1, Ljava/lang/String;

    .line 168
    .line 169
    invoke-direct {v0, v1, v4, p1}, Lkd/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    invoke-static {v0}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    .line 173
    .line 174
    .line 175
    sget p1, Lkd/W;->c:I

    .line 176
    .line 177
    goto :goto_2

    .line 178
    :cond_4
    sget p1, Lkd/W;->c:I

    .line 179
    .line 180
    goto :goto_2

    .line 181
    :cond_5
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedRequestError\'."

    .line 182
    .line 183
    invoke-static {v0, p1, v1}, Lka/n;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    sget p1, Lkd/W;->c:I

    .line 187
    .line 188
    :goto_2
    return-void

    .line 189
    :pswitch_3
    instance-of v6, p1, Ljava/util/List;

    .line 190
    .line 191
    if-eqz v6, :cond_7

    .line 192
    .line 193
    check-cast p1, Ljava/util/List;

    .line 194
    .line 195
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 196
    .line 197
    .line 198
    move-result v0

    .line 199
    if-le v0, v5, :cond_6

    .line 200
    .line 201
    new-instance v0, Lkd/a;

    .line 202
    .line 203
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v1

    .line 207
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    check-cast v1, Ljava/lang/String;

    .line 211
    .line 212
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v4

    .line 216
    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    check-cast v4, Ljava/lang/String;

    .line 220
    .line 221
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object p1

    .line 225
    check-cast p1, Ljava/lang/String;

    .line 226
    .line 227
    invoke-direct {v0, v1, v4, p1}, Lkd/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    invoke-static {v0}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    .line 231
    .line 232
    .line 233
    sget p1, Lkd/T;->c:I

    .line 234
    .line 235
    goto :goto_3

    .line 236
    :cond_6
    sget p1, Lkd/T;->c:I

    .line 237
    .line 238
    goto :goto_3

    .line 239
    :cond_7
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedRequestErrorCompat\'."

    .line 240
    .line 241
    invoke-static {v0, p1, v1}, Lka/n;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    sget p1, Lkd/T;->c:I

    .line 245
    .line 246
    :goto_3
    return-void

    .line 247
    :pswitch_4
    instance-of v6, p1, Ljava/util/List;

    .line 248
    .line 249
    if-eqz v6, :cond_9

    .line 250
    .line 251
    check-cast p1, Ljava/util/List;

    .line 252
    .line 253
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 254
    .line 255
    .line 256
    move-result v0

    .line 257
    if-le v0, v5, :cond_8

    .line 258
    .line 259
    new-instance v0, Lkd/a;

    .line 260
    .line 261
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v1

    .line 265
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 266
    .line 267
    .line 268
    check-cast v1, Ljava/lang/String;

    .line 269
    .line 270
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v4

    .line 274
    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 275
    .line 276
    .line 277
    check-cast v4, Ljava/lang/String;

    .line 278
    .line 279
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object p1

    .line 283
    check-cast p1, Ljava/lang/String;

    .line 284
    .line 285
    invoke-direct {v0, v1, v4, p1}, Lkd/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 286
    .line 287
    .line 288
    invoke-static {v0}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    .line 289
    .line 290
    .line 291
    sget p1, Lkd/g;->e:I

    .line 292
    .line 293
    goto :goto_4

    .line 294
    :cond_8
    sget p1, Lkd/g;->e:I

    .line 295
    .line 296
    goto :goto_4

    .line 297
    :cond_9
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.WebViewClient.pigeon_newInstance\'."

    .line 298
    .line 299
    invoke-static {v0, p1, v1}, Lka/n;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 300
    .line 301
    .line 302
    sget p1, Lkd/g;->e:I

    .line 303
    .line 304
    :goto_4
    return-void

    .line 305
    :pswitch_5
    instance-of v6, p1, Ljava/util/List;

    .line 306
    .line 307
    if-eqz v6, :cond_b

    .line 308
    .line 309
    check-cast p1, Ljava/util/List;

    .line 310
    .line 311
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 312
    .line 313
    .line 314
    move-result v0

    .line 315
    if-le v0, v5, :cond_a

    .line 316
    .line 317
    new-instance v0, Lkd/a;

    .line 318
    .line 319
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    move-result-object v1

    .line 323
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 324
    .line 325
    .line 326
    check-cast v1, Ljava/lang/String;

    .line 327
    .line 328
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    move-result-object v4

    .line 332
    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 333
    .line 334
    .line 335
    check-cast v4, Ljava/lang/String;

    .line 336
    .line 337
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 338
    .line 339
    .line 340
    move-result-object p1

    .line 341
    check-cast p1, Ljava/lang/String;

    .line 342
    .line 343
    invoke-direct {v0, v1, v4, p1}, Lkd/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 344
    .line 345
    .line 346
    invoke-static {v0}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    .line 347
    .line 348
    .line 349
    sget p1, Lkd/a0;->d:I

    .line 350
    .line 351
    goto :goto_5

    .line 352
    :cond_a
    sget p1, Lkd/a0;->d:I

    .line 353
    .line 354
    goto :goto_5

    .line 355
    :cond_b
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.WebView.onScrollChanged\'."

    .line 356
    .line 357
    invoke-static {v0, p1, v1}, Lka/n;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 358
    .line 359
    .line 360
    sget p1, Lkd/a0;->d:I

    .line 361
    .line 362
    :goto_5
    return-void

    .line 363
    :pswitch_6
    instance-of v6, p1, Ljava/util/List;

    .line 364
    .line 365
    if-eqz v6, :cond_d

    .line 366
    .line 367
    check-cast p1, Ljava/util/List;

    .line 368
    .line 369
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 370
    .line 371
    .line 372
    move-result v0

    .line 373
    if-le v0, v5, :cond_c

    .line 374
    .line 375
    new-instance v0, Lkd/a;

    .line 376
    .line 377
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 378
    .line 379
    .line 380
    move-result-object v1

    .line 381
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 382
    .line 383
    .line 384
    check-cast v1, Ljava/lang/String;

    .line 385
    .line 386
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    move-result-object v4

    .line 390
    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 391
    .line 392
    .line 393
    check-cast v4, Ljava/lang/String;

    .line 394
    .line 395
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 396
    .line 397
    .line 398
    move-result-object p1

    .line 399
    check-cast p1, Ljava/lang/String;

    .line 400
    .line 401
    invoke-direct {v0, v1, v4, p1}, Lkd/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 402
    .line 403
    .line 404
    invoke-static {v0}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    .line 405
    .line 406
    .line 407
    sget p1, Lkd/g;->e:I

    .line 408
    .line 409
    goto :goto_6

    .line 410
    :cond_c
    sget p1, Lkd/g;->e:I

    .line 411
    .line 412
    goto :goto_6

    .line 413
    :cond_d
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.WebView.pigeon_newInstance\'."

    .line 414
    .line 415
    invoke-static {v0, p1, v1}, Lka/n;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 416
    .line 417
    .line 418
    sget p1, Lkd/g;->e:I

    .line 419
    .line 420
    :goto_6
    return-void

    .line 421
    :pswitch_7
    instance-of v6, p1, Ljava/util/List;

    .line 422
    .line 423
    if-eqz v6, :cond_f

    .line 424
    .line 425
    check-cast p1, Ljava/util/List;

    .line 426
    .line 427
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 428
    .line 429
    .line 430
    move-result v0

    .line 431
    if-le v0, v5, :cond_e

    .line 432
    .line 433
    new-instance v0, Lkd/a;

    .line 434
    .line 435
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 436
    .line 437
    .line 438
    move-result-object v1

    .line 439
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 440
    .line 441
    .line 442
    check-cast v1, Ljava/lang/String;

    .line 443
    .line 444
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 445
    .line 446
    .line 447
    move-result-object v4

    .line 448
    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 449
    .line 450
    .line 451
    check-cast v4, Ljava/lang/String;

    .line 452
    .line 453
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 454
    .line 455
    .line 456
    move-result-object p1

    .line 457
    check-cast p1, Ljava/lang/String;

    .line 458
    .line 459
    invoke-direct {v0, v1, v4, p1}, Lkd/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 460
    .line 461
    .line 462
    invoke-static {v0}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    .line 463
    .line 464
    .line 465
    sget p1, Lkd/g;->e:I

    .line 466
    .line 467
    goto :goto_7

    .line 468
    :cond_e
    sget p1, Lkd/g;->e:I

    .line 469
    .line 470
    goto :goto_7

    .line 471
    :cond_f
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.WebStorage.pigeon_newInstance\'."

    .line 472
    .line 473
    invoke-static {v0, p1, v1}, Lka/n;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 474
    .line 475
    .line 476
    sget p1, Lkd/g;->e:I

    .line 477
    .line 478
    :goto_7
    return-void

    .line 479
    :pswitch_8
    instance-of v6, p1, Ljava/util/List;

    .line 480
    .line 481
    if-eqz v6, :cond_11

    .line 482
    .line 483
    check-cast p1, Ljava/util/List;

    .line 484
    .line 485
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 486
    .line 487
    .line 488
    move-result v0

    .line 489
    if-le v0, v5, :cond_10

    .line 490
    .line 491
    new-instance v0, Lkd/a;

    .line 492
    .line 493
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 494
    .line 495
    .line 496
    move-result-object v1

    .line 497
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 498
    .line 499
    .line 500
    check-cast v1, Ljava/lang/String;

    .line 501
    .line 502
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 503
    .line 504
    .line 505
    move-result-object v4

    .line 506
    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 507
    .line 508
    .line 509
    check-cast v4, Ljava/lang/String;

    .line 510
    .line 511
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 512
    .line 513
    .line 514
    move-result-object p1

    .line 515
    check-cast p1, Ljava/lang/String;

    .line 516
    .line 517
    invoke-direct {v0, v1, v4, p1}, Lkd/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 518
    .line 519
    .line 520
    invoke-static {v0}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    .line 521
    .line 522
    .line 523
    sget p1, Lkd/g;->e:I

    .line 524
    .line 525
    goto :goto_8

    .line 526
    :cond_10
    sget p1, Lkd/g;->e:I

    .line 527
    .line 528
    goto :goto_8

    .line 529
    :cond_11
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.WebSettings.pigeon_newInstance\'."

    .line 530
    .line 531
    invoke-static {v0, p1, v1}, Lka/n;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 532
    .line 533
    .line 534
    sget p1, Lkd/g;->e:I

    .line 535
    .line 536
    :goto_8
    return-void

    .line 537
    :pswitch_9
    instance-of v6, p1, Ljava/util/List;

    .line 538
    .line 539
    if-eqz v6, :cond_13

    .line 540
    .line 541
    check-cast p1, Ljava/util/List;

    .line 542
    .line 543
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 544
    .line 545
    .line 546
    move-result v0

    .line 547
    if-le v0, v5, :cond_12

    .line 548
    .line 549
    new-instance v0, Lkd/a;

    .line 550
    .line 551
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 552
    .line 553
    .line 554
    move-result-object v1

    .line 555
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 556
    .line 557
    .line 558
    check-cast v1, Ljava/lang/String;

    .line 559
    .line 560
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 561
    .line 562
    .line 563
    move-result-object v4

    .line 564
    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 565
    .line 566
    .line 567
    check-cast v4, Ljava/lang/String;

    .line 568
    .line 569
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 570
    .line 571
    .line 572
    move-result-object p1

    .line 573
    check-cast p1, Ljava/lang/String;

    .line 574
    .line 575
    invoke-direct {v0, v1, v4, p1}, Lkd/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 576
    .line 577
    .line 578
    invoke-static {v0}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    .line 579
    .line 580
    .line 581
    sget p1, Lkd/g;->e:I

    .line 582
    .line 583
    goto :goto_9

    .line 584
    :cond_12
    sget p1, Lkd/g;->e:I

    .line 585
    .line 586
    goto :goto_9

    .line 587
    :cond_13
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.WebResourceResponse.pigeon_newInstance\'."

    .line 588
    .line 589
    invoke-static {v0, p1, v1}, Lka/n;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 590
    .line 591
    .line 592
    sget p1, Lkd/g;->e:I

    .line 593
    .line 594
    :goto_9
    return-void

    .line 595
    :pswitch_a
    instance-of v6, p1, Ljava/util/List;

    .line 596
    .line 597
    if-eqz v6, :cond_15

    .line 598
    .line 599
    check-cast p1, Ljava/util/List;

    .line 600
    .line 601
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 602
    .line 603
    .line 604
    move-result v0

    .line 605
    if-le v0, v5, :cond_14

    .line 606
    .line 607
    new-instance v0, Lkd/a;

    .line 608
    .line 609
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 610
    .line 611
    .line 612
    move-result-object v1

    .line 613
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 614
    .line 615
    .line 616
    check-cast v1, Ljava/lang/String;

    .line 617
    .line 618
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 619
    .line 620
    .line 621
    move-result-object v4

    .line 622
    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 623
    .line 624
    .line 625
    check-cast v4, Ljava/lang/String;

    .line 626
    .line 627
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 628
    .line 629
    .line 630
    move-result-object p1

    .line 631
    check-cast p1, Ljava/lang/String;

    .line 632
    .line 633
    invoke-direct {v0, v1, v4, p1}, Lkd/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 634
    .line 635
    .line 636
    invoke-static {v0}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    .line 637
    .line 638
    .line 639
    sget p1, Lkd/g;->e:I

    .line 640
    .line 641
    goto :goto_a

    .line 642
    :cond_14
    sget p1, Lkd/g;->e:I

    .line 643
    .line 644
    goto :goto_a

    .line 645
    :cond_15
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.WebResourceRequest.pigeon_newInstance\'."

    .line 646
    .line 647
    invoke-static {v0, p1, v1}, Lka/n;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 648
    .line 649
    .line 650
    sget p1, Lkd/g;->e:I

    .line 651
    .line 652
    :goto_a
    return-void

    .line 653
    :pswitch_b
    instance-of v6, p1, Ljava/util/List;

    .line 654
    .line 655
    if-eqz v6, :cond_17

    .line 656
    .line 657
    check-cast p1, Ljava/util/List;

    .line 658
    .line 659
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 660
    .line 661
    .line 662
    move-result v0

    .line 663
    if-le v0, v5, :cond_16

    .line 664
    .line 665
    new-instance v0, Lkd/a;

    .line 666
    .line 667
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 668
    .line 669
    .line 670
    move-result-object v1

    .line 671
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 672
    .line 673
    .line 674
    check-cast v1, Ljava/lang/String;

    .line 675
    .line 676
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 677
    .line 678
    .line 679
    move-result-object v4

    .line 680
    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 681
    .line 682
    .line 683
    check-cast v4, Ljava/lang/String;

    .line 684
    .line 685
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 686
    .line 687
    .line 688
    move-result-object p1

    .line 689
    check-cast p1, Ljava/lang/String;

    .line 690
    .line 691
    invoke-direct {v0, v1, v4, p1}, Lkd/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 692
    .line 693
    .line 694
    invoke-static {v0}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    .line 695
    .line 696
    .line 697
    sget p1, Lkd/g;->e:I

    .line 698
    .line 699
    goto :goto_b

    .line 700
    :cond_16
    sget p1, Lkd/g;->e:I

    .line 701
    .line 702
    goto :goto_b

    .line 703
    :cond_17
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.WebResourceErrorCompat.pigeon_newInstance\'."

    .line 704
    .line 705
    invoke-static {v0, p1, v1}, Lka/n;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 706
    .line 707
    .line 708
    sget p1, Lkd/g;->e:I

    .line 709
    .line 710
    :goto_b
    return-void

    .line 711
    :pswitch_c
    instance-of v6, p1, Ljava/util/List;

    .line 712
    .line 713
    if-eqz v6, :cond_19

    .line 714
    .line 715
    check-cast p1, Ljava/util/List;

    .line 716
    .line 717
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 718
    .line 719
    .line 720
    move-result v0

    .line 721
    if-le v0, v5, :cond_18

    .line 722
    .line 723
    new-instance v0, Lkd/a;

    .line 724
    .line 725
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 726
    .line 727
    .line 728
    move-result-object v1

    .line 729
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 730
    .line 731
    .line 732
    check-cast v1, Ljava/lang/String;

    .line 733
    .line 734
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 735
    .line 736
    .line 737
    move-result-object v4

    .line 738
    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 739
    .line 740
    .line 741
    check-cast v4, Ljava/lang/String;

    .line 742
    .line 743
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 744
    .line 745
    .line 746
    move-result-object p1

    .line 747
    check-cast p1, Ljava/lang/String;

    .line 748
    .line 749
    invoke-direct {v0, v1, v4, p1}, Lkd/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 750
    .line 751
    .line 752
    invoke-static {v0}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    .line 753
    .line 754
    .line 755
    sget p1, Lkd/g;->e:I

    .line 756
    .line 757
    goto :goto_c

    .line 758
    :cond_18
    sget p1, Lkd/g;->e:I

    .line 759
    .line 760
    goto :goto_c

    .line 761
    :cond_19
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.WebResourceError.pigeon_newInstance\'."

    .line 762
    .line 763
    invoke-static {v0, p1, v1}, Lka/n;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 764
    .line 765
    .line 766
    sget p1, Lkd/g;->e:I

    .line 767
    .line 768
    :goto_c
    return-void

    .line 769
    :pswitch_d
    instance-of v6, p1, Ljava/util/List;

    .line 770
    .line 771
    if-eqz v6, :cond_1b

    .line 772
    .line 773
    check-cast p1, Ljava/util/List;

    .line 774
    .line 775
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 776
    .line 777
    .line 778
    move-result v0

    .line 779
    if-le v0, v5, :cond_1a

    .line 780
    .line 781
    new-instance v0, Lkd/a;

    .line 782
    .line 783
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 784
    .line 785
    .line 786
    move-result-object v1

    .line 787
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 788
    .line 789
    .line 790
    check-cast v1, Ljava/lang/String;

    .line 791
    .line 792
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 793
    .line 794
    .line 795
    move-result-object v4

    .line 796
    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 797
    .line 798
    .line 799
    check-cast v4, Ljava/lang/String;

    .line 800
    .line 801
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 802
    .line 803
    .line 804
    move-result-object p1

    .line 805
    check-cast p1, Ljava/lang/String;

    .line 806
    .line 807
    invoke-direct {v0, v1, v4, p1}, Lkd/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 808
    .line 809
    .line 810
    invoke-static {v0}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    .line 811
    .line 812
    .line 813
    sget p1, Lkd/P;->h:I

    .line 814
    .line 815
    goto :goto_d

    .line 816
    :cond_1a
    sget p1, Lkd/P;->h:I

    .line 817
    .line 818
    goto :goto_d

    .line 819
    :cond_1b
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onGeolocationPermissionsHidePrompt\'."

    .line 820
    .line 821
    invoke-static {v0, p1, v1}, Lka/n;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 822
    .line 823
    .line 824
    sget p1, Lkd/P;->h:I

    .line 825
    .line 826
    :goto_d
    return-void

    .line 827
    :pswitch_e
    instance-of v6, p1, Ljava/util/List;

    .line 828
    .line 829
    if-eqz v6, :cond_1d

    .line 830
    .line 831
    check-cast p1, Ljava/util/List;

    .line 832
    .line 833
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 834
    .line 835
    .line 836
    move-result v0

    .line 837
    if-le v0, v5, :cond_1c

    .line 838
    .line 839
    new-instance v0, Lkd/a;

    .line 840
    .line 841
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 842
    .line 843
    .line 844
    move-result-object v1

    .line 845
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 846
    .line 847
    .line 848
    check-cast v1, Ljava/lang/String;

    .line 849
    .line 850
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 851
    .line 852
    .line 853
    move-result-object v4

    .line 854
    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 855
    .line 856
    .line 857
    check-cast v4, Ljava/lang/String;

    .line 858
    .line 859
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 860
    .line 861
    .line 862
    move-result-object p1

    .line 863
    check-cast p1, Ljava/lang/String;

    .line 864
    .line 865
    invoke-direct {v0, v1, v4, p1}, Lkd/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 866
    .line 867
    .line 868
    invoke-static {v0}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    .line 869
    .line 870
    .line 871
    sget p1, Lkd/P;->h:I

    .line 872
    .line 873
    goto :goto_e

    .line 874
    :cond_1c
    sget p1, Lkd/P;->h:I

    .line 875
    .line 876
    goto :goto_e

    .line 877
    :cond_1d
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onGeolocationPermissionsShowPrompt\'."

    .line 878
    .line 879
    invoke-static {v0, p1, v1}, Lka/n;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 880
    .line 881
    .line 882
    sget p1, Lkd/P;->h:I

    .line 883
    .line 884
    :goto_e
    return-void

    .line 885
    :pswitch_f
    instance-of v6, p1, Ljava/util/List;

    .line 886
    .line 887
    if-eqz v6, :cond_1f

    .line 888
    .line 889
    check-cast p1, Ljava/util/List;

    .line 890
    .line 891
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 892
    .line 893
    .line 894
    move-result v0

    .line 895
    if-le v0, v5, :cond_1e

    .line 896
    .line 897
    new-instance v0, Lkd/a;

    .line 898
    .line 899
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 900
    .line 901
    .line 902
    move-result-object v1

    .line 903
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 904
    .line 905
    .line 906
    check-cast v1, Ljava/lang/String;

    .line 907
    .line 908
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 909
    .line 910
    .line 911
    move-result-object v4

    .line 912
    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 913
    .line 914
    .line 915
    check-cast v4, Ljava/lang/String;

    .line 916
    .line 917
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 918
    .line 919
    .line 920
    move-result-object p1

    .line 921
    check-cast p1, Ljava/lang/String;

    .line 922
    .line 923
    invoke-direct {v0, v1, v4, p1}, Lkd/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 924
    .line 925
    .line 926
    invoke-static {v0}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    .line 927
    .line 928
    .line 929
    sget p1, Lkd/P;->h:I

    .line 930
    .line 931
    goto :goto_f

    .line 932
    :cond_1e
    sget p1, Lkd/P;->h:I

    .line 933
    .line 934
    goto :goto_f

    .line 935
    :cond_1f
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onConsoleMessage\'."

    .line 936
    .line 937
    invoke-static {v0, p1, v1}, Lka/n;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 938
    .line 939
    .line 940
    sget p1, Lkd/P;->h:I

    .line 941
    .line 942
    :goto_f
    return-void

    .line 943
    :pswitch_10
    instance-of v6, p1, Ljava/util/List;

    .line 944
    .line 945
    if-eqz v6, :cond_21

    .line 946
    .line 947
    check-cast p1, Ljava/util/List;

    .line 948
    .line 949
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 950
    .line 951
    .line 952
    move-result v0

    .line 953
    if-le v0, v5, :cond_20

    .line 954
    .line 955
    new-instance v0, Lkd/a;

    .line 956
    .line 957
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 958
    .line 959
    .line 960
    move-result-object v1

    .line 961
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 962
    .line 963
    .line 964
    check-cast v1, Ljava/lang/String;

    .line 965
    .line 966
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 967
    .line 968
    .line 969
    move-result-object v4

    .line 970
    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 971
    .line 972
    .line 973
    check-cast v4, Ljava/lang/String;

    .line 974
    .line 975
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 976
    .line 977
    .line 978
    move-result-object p1

    .line 979
    check-cast p1, Ljava/lang/String;

    .line 980
    .line 981
    invoke-direct {v0, v1, v4, p1}, Lkd/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 982
    .line 983
    .line 984
    invoke-static {v0}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    .line 985
    .line 986
    .line 987
    sget p1, Lkd/P;->h:I

    .line 988
    .line 989
    goto :goto_10

    .line 990
    :cond_20
    sget p1, Lkd/P;->h:I

    .line 991
    .line 992
    goto :goto_10

    .line 993
    :cond_21
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onShowCustomView\'."

    .line 994
    .line 995
    invoke-static {v0, p1, v1}, Lka/n;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 996
    .line 997
    .line 998
    sget p1, Lkd/P;->h:I

    .line 999
    .line 1000
    :goto_10
    return-void

    .line 1001
    :pswitch_11
    instance-of v6, p1, Ljava/util/List;

    .line 1002
    .line 1003
    if-eqz v6, :cond_23

    .line 1004
    .line 1005
    check-cast p1, Ljava/util/List;

    .line 1006
    .line 1007
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 1008
    .line 1009
    .line 1010
    move-result v0

    .line 1011
    if-le v0, v5, :cond_22

    .line 1012
    .line 1013
    new-instance v0, Lkd/a;

    .line 1014
    .line 1015
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1016
    .line 1017
    .line 1018
    move-result-object v1

    .line 1019
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1020
    .line 1021
    .line 1022
    check-cast v1, Ljava/lang/String;

    .line 1023
    .line 1024
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1025
    .line 1026
    .line 1027
    move-result-object v4

    .line 1028
    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1029
    .line 1030
    .line 1031
    check-cast v4, Ljava/lang/String;

    .line 1032
    .line 1033
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1034
    .line 1035
    .line 1036
    move-result-object p1

    .line 1037
    check-cast p1, Ljava/lang/String;

    .line 1038
    .line 1039
    invoke-direct {v0, v1, v4, p1}, Lkd/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1040
    .line 1041
    .line 1042
    invoke-static {v0}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    .line 1043
    .line 1044
    .line 1045
    sget p1, Lkd/P;->h:I

    .line 1046
    .line 1047
    goto :goto_11

    .line 1048
    :cond_22
    sget p1, Lkd/P;->h:I

    .line 1049
    .line 1050
    goto :goto_11

    .line 1051
    :cond_23
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onPermissionRequest\'."

    .line 1052
    .line 1053
    invoke-static {v0, p1, v1}, Lka/n;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1054
    .line 1055
    .line 1056
    sget p1, Lkd/P;->h:I

    .line 1057
    .line 1058
    :goto_11
    return-void

    .line 1059
    :pswitch_12
    instance-of v6, p1, Ljava/util/List;

    .line 1060
    .line 1061
    if-eqz v6, :cond_25

    .line 1062
    .line 1063
    check-cast p1, Ljava/util/List;

    .line 1064
    .line 1065
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 1066
    .line 1067
    .line 1068
    move-result v0

    .line 1069
    if-le v0, v5, :cond_24

    .line 1070
    .line 1071
    new-instance v0, Lkd/a;

    .line 1072
    .line 1073
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1074
    .line 1075
    .line 1076
    move-result-object v1

    .line 1077
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1078
    .line 1079
    .line 1080
    check-cast v1, Ljava/lang/String;

    .line 1081
    .line 1082
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1083
    .line 1084
    .line 1085
    move-result-object v4

    .line 1086
    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1087
    .line 1088
    .line 1089
    check-cast v4, Ljava/lang/String;

    .line 1090
    .line 1091
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1092
    .line 1093
    .line 1094
    move-result-object p1

    .line 1095
    check-cast p1, Ljava/lang/String;

    .line 1096
    .line 1097
    invoke-direct {v0, v1, v4, p1}, Lkd/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1098
    .line 1099
    .line 1100
    invoke-static {v0}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    .line 1101
    .line 1102
    .line 1103
    sget p1, Lkd/P;->h:I

    .line 1104
    .line 1105
    goto :goto_12

    .line 1106
    :cond_24
    sget p1, Lkd/P;->h:I

    .line 1107
    .line 1108
    goto :goto_12

    .line 1109
    :cond_25
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onProgressChanged\'."

    .line 1110
    .line 1111
    invoke-static {v0, p1, v1}, Lka/n;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1112
    .line 1113
    .line 1114
    sget p1, Lkd/P;->h:I

    .line 1115
    .line 1116
    :goto_12
    return-void

    .line 1117
    :pswitch_13
    instance-of v6, p1, Ljava/util/List;

    .line 1118
    .line 1119
    if-eqz v6, :cond_27

    .line 1120
    .line 1121
    check-cast p1, Ljava/util/List;

    .line 1122
    .line 1123
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 1124
    .line 1125
    .line 1126
    move-result v0

    .line 1127
    if-le v0, v5, :cond_26

    .line 1128
    .line 1129
    new-instance v0, Lkd/a;

    .line 1130
    .line 1131
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1132
    .line 1133
    .line 1134
    move-result-object v1

    .line 1135
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1136
    .line 1137
    .line 1138
    check-cast v1, Ljava/lang/String;

    .line 1139
    .line 1140
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1141
    .line 1142
    .line 1143
    move-result-object v4

    .line 1144
    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1145
    .line 1146
    .line 1147
    check-cast v4, Ljava/lang/String;

    .line 1148
    .line 1149
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1150
    .line 1151
    .line 1152
    move-result-object p1

    .line 1153
    check-cast p1, Ljava/lang/String;

    .line 1154
    .line 1155
    invoke-direct {v0, v1, v4, p1}, Lkd/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1156
    .line 1157
    .line 1158
    invoke-static {v0}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    .line 1159
    .line 1160
    .line 1161
    sget p1, Lkd/P;->h:I

    .line 1162
    .line 1163
    goto :goto_13

    .line 1164
    :cond_26
    sget p1, Lkd/P;->h:I

    .line 1165
    .line 1166
    goto :goto_13

    .line 1167
    :cond_27
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onHideCustomView\'."

    .line 1168
    .line 1169
    invoke-static {v0, p1, v1}, Lka/n;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1170
    .line 1171
    .line 1172
    sget p1, Lkd/P;->h:I

    .line 1173
    .line 1174
    :goto_13
    return-void

    .line 1175
    :pswitch_14
    instance-of v6, p1, Ljava/util/List;

    .line 1176
    .line 1177
    if-eqz v6, :cond_29

    .line 1178
    .line 1179
    check-cast p1, Ljava/util/List;

    .line 1180
    .line 1181
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 1182
    .line 1183
    .line 1184
    move-result v0

    .line 1185
    if-le v0, v5, :cond_28

    .line 1186
    .line 1187
    new-instance v0, Lkd/a;

    .line 1188
    .line 1189
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1190
    .line 1191
    .line 1192
    move-result-object v1

    .line 1193
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1194
    .line 1195
    .line 1196
    check-cast v1, Ljava/lang/String;

    .line 1197
    .line 1198
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1199
    .line 1200
    .line 1201
    move-result-object v4

    .line 1202
    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1203
    .line 1204
    .line 1205
    check-cast v4, Ljava/lang/String;

    .line 1206
    .line 1207
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1208
    .line 1209
    .line 1210
    move-result-object p1

    .line 1211
    check-cast p1, Ljava/lang/String;

    .line 1212
    .line 1213
    invoke-direct {v0, v1, v4, p1}, Lkd/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1214
    .line 1215
    .line 1216
    invoke-static {v0}, LFe/e;->z(Ljava/lang/Throwable;)Lef/m;

    .line 1217
    .line 1218
    .line 1219
    sget p1, Lkd/g;->e:I

    .line 1220
    .line 1221
    goto :goto_14

    .line 1222
    :cond_28
    sget p1, Lkd/g;->e:I

    .line 1223
    .line 1224
    goto :goto_14

    .line 1225
    :cond_29
    const-string p1, "Unable to establish connection on channel: \'dev.flutter.pigeon.webview_flutter_android.View.pigeon_newInstance\'."

    .line 1226
    .line 1227
    invoke-static {v0, p1, v1}, Lka/n;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1228
    .line 1229
    .line 1230
    sget p1, Lkd/g;->e:I

    .line 1231
    .line 1232
    :goto_14
    return-void

    .line 1233
    :pswitch_data_0
    .packed-switch 0x1
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
        :pswitch_0
        :pswitch_7
        :pswitch_0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public e(Ljava/lang/Object;Lba/a;)V
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    const-string v1, ", Stacktrace: "

    .line 3
    .line 4
    const-string v2, "Cause: "

    .line 5
    .line 6
    const/4 v3, 0x2

    .line 7
    const/4 v4, 0x3

    .line 8
    const-string v5, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    .line 9
    .line 10
    const/4 v6, 0x1

    .line 11
    const/4 v7, 0x0

    .line 12
    iget v8, p0, Lkd/D;->a:I

    .line 13
    .line 14
    sparse-switch v8, :sswitch_data_0

    .line 15
    .line 16
    .line 17
    invoke-static {p1, v5}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    check-cast p1, Ljava/util/List;

    .line 21
    .line 22
    invoke-interface {p1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    const-string v0, "null cannot be cast to non-null type kotlin.String"

    .line 27
    .line 28
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    check-cast p1, Ljava/lang/String;

    .line 32
    .line 33
    :try_start_0
    invoke-static {p1}, Lcom/moloco/sdk/internal/publisher/H;->b0(Ljava/lang/String;)Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-static {p1}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    goto :goto_0

    .line 46
    :catchall_0
    move-exception p1

    .line 47
    instance-of v0, p1, Lkd/a;

    .line 48
    .line 49
    if-eqz v0, :cond_0

    .line 50
    .line 51
    check-cast p1, Lkd/a;

    .line 52
    .line 53
    iget-object v0, p1, Lkd/a;->b:Ljava/lang/String;

    .line 54
    .line 55
    iget-object v1, p1, Lkd/a;->c:Ljava/lang/String;

    .line 56
    .line 57
    iget-object p1, p1, Lkd/a;->a:Ljava/lang/String;

    .line 58
    .line 59
    new-array v2, v4, [Ljava/lang/Object;

    .line 60
    .line 61
    aput-object p1, v2, v7

    .line 62
    .line 63
    aput-object v0, v2, v6

    .line 64
    .line 65
    aput-object v1, v2, v3

    .line 66
    .line 67
    invoke-static {v2}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    goto :goto_0

    .line 72
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    invoke-static {v2, v1, p1, v4}, LVa/M6;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    filled-new-array {v0, v3, p1}, [Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    invoke-static {p1}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    :goto_0
    invoke-virtual {p2, p1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    return-void

    .line 108
    :sswitch_0
    invoke-static {p1, v5}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    check-cast p1, Ljava/util/List;

    .line 112
    .line 113
    invoke-interface {p1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    const-string v5, "null cannot be cast to non-null type android.webkit.WebStorage"

    .line 118
    .line 119
    invoke-static {p1, v5}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    check-cast p1, Landroid/webkit/WebStorage;

    .line 123
    .line 124
    :try_start_1
    invoke-virtual {p1}, Landroid/webkit/WebStorage;->deleteAllData()V

    .line 125
    .line 126
    .line 127
    invoke-static {v0}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 128
    .line 129
    .line 130
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 131
    goto :goto_1

    .line 132
    :catchall_1
    move-exception p1

    .line 133
    instance-of v0, p1, Lkd/a;

    .line 134
    .line 135
    if-eqz v0, :cond_1

    .line 136
    .line 137
    check-cast p1, Lkd/a;

    .line 138
    .line 139
    iget-object v0, p1, Lkd/a;->b:Ljava/lang/String;

    .line 140
    .line 141
    iget-object v1, p1, Lkd/a;->c:Ljava/lang/String;

    .line 142
    .line 143
    iget-object p1, p1, Lkd/a;->a:Ljava/lang/String;

    .line 144
    .line 145
    new-array v2, v4, [Ljava/lang/Object;

    .line 146
    .line 147
    aput-object p1, v2, v7

    .line 148
    .line 149
    aput-object v0, v2, v6

    .line 150
    .line 151
    aput-object v1, v2, v3

    .line 152
    .line 153
    invoke-static {v2}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    goto :goto_1

    .line 158
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v3

    .line 170
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 171
    .line 172
    .line 173
    move-result-object v4

    .line 174
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    invoke-static {v2, v1, p1, v4}, LVa/M6;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    filled-new-array {v0, v3, p1}, [Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    invoke-static {p1}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    :goto_1
    invoke-virtual {p2, p1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    return-void

    .line 194
    :sswitch_1
    invoke-static {p1, v5}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    check-cast p1, Ljava/util/List;

    .line 198
    .line 199
    invoke-interface {p1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v5

    .line 203
    const-string v8, "null cannot be cast to non-null type android.webkit.WebSettings"

    .line 204
    .line 205
    invoke-static {v5, v8}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    check-cast v5, Landroid/webkit/WebSettings;

    .line 209
    .line 210
    invoke-interface {p1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object p1

    .line 214
    const-string v8, "null cannot be cast to non-null type kotlin.Boolean"

    .line 215
    .line 216
    invoke-static {p1, v8}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    check-cast p1, Ljava/lang/Boolean;

    .line 220
    .line 221
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 222
    .line 223
    .line 224
    move-result p1

    .line 225
    :try_start_2
    invoke-static {v5, p1}, Lae/b;->f(Landroid/webkit/WebSettings;Z)V

    .line 226
    .line 227
    .line 228
    invoke-static {v0}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 229
    .line 230
    .line 231
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 232
    goto :goto_2

    .line 233
    :catchall_2
    move-exception p1

    .line 234
    instance-of v0, p1, Lkd/a;

    .line 235
    .line 236
    if-eqz v0, :cond_2

    .line 237
    .line 238
    check-cast p1, Lkd/a;

    .line 239
    .line 240
    iget-object v0, p1, Lkd/a;->b:Ljava/lang/String;

    .line 241
    .line 242
    iget-object v1, p1, Lkd/a;->c:Ljava/lang/String;

    .line 243
    .line 244
    iget-object p1, p1, Lkd/a;->a:Ljava/lang/String;

    .line 245
    .line 246
    new-array v2, v4, [Ljava/lang/Object;

    .line 247
    .line 248
    aput-object p1, v2, v7

    .line 249
    .line 250
    aput-object v0, v2, v6

    .line 251
    .line 252
    aput-object v1, v2, v3

    .line 253
    .line 254
    invoke-static {v2}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 255
    .line 256
    .line 257
    move-result-object p1

    .line 258
    goto :goto_2

    .line 259
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object v0

    .line 267
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object v3

    .line 271
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 272
    .line 273
    .line 274
    move-result-object v4

    .line 275
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object p1

    .line 279
    invoke-static {v2, v1, p1, v4}, LVa/M6;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 280
    .line 281
    .line 282
    move-result-object p1

    .line 283
    filled-new-array {v0, v3, p1}, [Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object p1

    .line 287
    invoke-static {p1}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 288
    .line 289
    .line 290
    move-result-object p1

    .line 291
    :goto_2
    invoke-virtual {p2, p1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 292
    .line 293
    .line 294
    return-void

    .line 295
    :sswitch_2
    invoke-static {p1, v5}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 296
    .line 297
    .line 298
    check-cast p1, Ljava/util/List;

    .line 299
    .line 300
    invoke-interface {p1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    move-result-object p1

    .line 304
    const-string v5, "null cannot be cast to non-null type android.webkit.SslErrorHandler"

    .line 305
    .line 306
    invoke-static {p1, v5}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 307
    .line 308
    .line 309
    check-cast p1, Landroid/webkit/SslErrorHandler;

    .line 310
    .line 311
    :try_start_3
    invoke-virtual {p1}, Landroid/webkit/SslErrorHandler;->proceed()V

    .line 312
    .line 313
    .line 314
    invoke-static {v0}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 315
    .line 316
    .line 317
    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 318
    goto :goto_3

    .line 319
    :catchall_3
    move-exception p1

    .line 320
    instance-of v0, p1, Lkd/a;

    .line 321
    .line 322
    if-eqz v0, :cond_3

    .line 323
    .line 324
    check-cast p1, Lkd/a;

    .line 325
    .line 326
    iget-object v0, p1, Lkd/a;->b:Ljava/lang/String;

    .line 327
    .line 328
    iget-object v1, p1, Lkd/a;->c:Ljava/lang/String;

    .line 329
    .line 330
    iget-object p1, p1, Lkd/a;->a:Ljava/lang/String;

    .line 331
    .line 332
    new-array v2, v4, [Ljava/lang/Object;

    .line 333
    .line 334
    aput-object p1, v2, v7

    .line 335
    .line 336
    aput-object v0, v2, v6

    .line 337
    .line 338
    aput-object v1, v2, v3

    .line 339
    .line 340
    invoke-static {v2}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 341
    .line 342
    .line 343
    move-result-object p1

    .line 344
    goto :goto_3

    .line 345
    :cond_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 346
    .line 347
    .line 348
    move-result-object v0

    .line 349
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 350
    .line 351
    .line 352
    move-result-object v0

    .line 353
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 354
    .line 355
    .line 356
    move-result-object v3

    .line 357
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 358
    .line 359
    .line 360
    move-result-object v4

    .line 361
    invoke-static {p1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 362
    .line 363
    .line 364
    move-result-object p1

    .line 365
    invoke-static {v2, v1, p1, v4}, LVa/M6;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 366
    .line 367
    .line 368
    move-result-object p1

    .line 369
    filled-new-array {v0, v3, p1}, [Ljava/lang/String;

    .line 370
    .line 371
    .line 372
    move-result-object p1

    .line 373
    invoke-static {p1}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 374
    .line 375
    .line 376
    move-result-object p1

    .line 377
    :goto_3
    invoke-virtual {p2, p1}, Lba/a;->c(Ljava/lang/Object;)V

    .line 378
    .line 379
    .line 380
    return-void

    .line 381
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_2
        0xe -> :sswitch_1
        0x10 -> :sswitch_0
    .end sparse-switch
.end method

.method public h(Llg/b;)Ljava/lang/Object;
    .locals 0

    .line 1
    sget-object p1, Llg/a;->a:Llg/a;

    .line 2
    .line 3
    return-object p1
.end method
