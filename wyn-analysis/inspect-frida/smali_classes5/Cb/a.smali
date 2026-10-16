.class public final synthetic LCb/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/io/File;Lcom/vungle/ads/internal/load/c;Lcom/vungle/ads/internal/downloader/k;Lcom/vungle/ads/internal/load/g;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, LCb/a;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LCb/a;->e:Ljava/lang/Object;

    iput-object p2, p0, LCb/a;->b:Ljava/lang/Object;

    iput-object p3, p0, LCb/a;->c:Ljava/lang/Object;

    iput-object p4, p0, LCb/a;->d:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p5, p0, LCb/a;->a:I

    iput-object p1, p0, LCb/a;->c:Ljava/lang/Object;

    iput-object p2, p0, LCb/a;->d:Ljava/lang/Object;

    iput-object p3, p0, LCb/a;->b:Ljava/lang/Object;

    iput-object p4, p0, LCb/a;->e:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const/16 v2, 0xe

    .line 4
    .line 5
    const/4 v0, 0x3

    .line 6
    const/4 v3, 0x2

    .line 7
    const/4 v4, 0x4

    .line 8
    const/16 v5, 0x19

    .line 9
    .line 10
    const/16 v6, 0x18

    .line 11
    .line 12
    const/4 v7, 0x1

    .line 13
    const/4 v8, 0x0

    .line 14
    const/4 v9, 0x0

    .line 15
    iget v10, v1, LCb/a;->a:I

    .line 16
    .line 17
    packed-switch v10, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    new-instance v2, Lcom/moloco/sdk/internal/publisher/d;

    .line 21
    .line 22
    invoke-direct {v2, v5}, Lcom/moloco/sdk/internal/publisher/d;-><init>(I)V

    .line 23
    .line 24
    .line 25
    iget-object v5, v1, LCb/a;->c:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v5, Lkd/W;

    .line 28
    .line 29
    iget-object v6, v5, Lkd/W;->a:Lkd/r;

    .line 30
    .line 31
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    iget-object v10, v1, LCb/a;->d:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v10, Landroid/webkit/WebView;

    .line 37
    .line 38
    const-string v11, "webViewArg"

    .line 39
    .line 40
    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    iget-object v11, v1, LCb/a;->b:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v11, Landroid/webkit/WebResourceRequest;

    .line 46
    .line 47
    const-string v12, "requestArg"

    .line 48
    .line 49
    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    iget-object v12, v1, LCb/a;->e:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v12, Landroid/webkit/WebResourceError;

    .line 55
    .line 56
    const-string v13, "errorArg"

    .line 57
    .line 58
    invoke-static {v12, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    iget-object v6, v6, Lkd/r;->a:LC8/i;

    .line 62
    .line 63
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v6}, LC8/i;->q()Luc/n;

    .line 67
    .line 68
    .line 69
    move-result-object v13

    .line 70
    new-instance v14, LVa/X7;

    .line 71
    .line 72
    const-string v15, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedRequestError"

    .line 73
    .line 74
    iget-object v6, v6, LC8/i;->c:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v6, Luc/f;

    .line 77
    .line 78
    invoke-direct {v14, v6, v13, v9, v15}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    new-array v4, v4, [Ljava/lang/Object;

    .line 82
    .line 83
    aput-object v5, v4, v8

    .line 84
    .line 85
    aput-object v10, v4, v7

    .line 86
    .line 87
    aput-object v11, v4, v3

    .line 88
    .line 89
    aput-object v12, v4, v0

    .line 90
    .line 91
    invoke-static {v4}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    new-instance v3, Lkd/D;

    .line 96
    .line 97
    const/16 v4, 0x15

    .line 98
    .line 99
    invoke-direct {v3, v2, v4}, Lkd/D;-><init>(Ljava/lang/Object;I)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v14, v0, v3}, LVa/X7;->m(Ljava/lang/Object;Luc/c;)V

    .line 103
    .line 104
    .line 105
    return-void

    .line 106
    :pswitch_0
    new-instance v10, Lcom/moloco/sdk/internal/publisher/d;

    .line 107
    .line 108
    invoke-direct {v10, v5}, Lcom/moloco/sdk/internal/publisher/d;-><init>(I)V

    .line 109
    .line 110
    .line 111
    iget-object v0, v1, LCb/a;->c:Ljava/lang/Object;

    .line 112
    .line 113
    move-object v6, v0

    .line 114
    check-cast v6, Lkd/W;

    .line 115
    .line 116
    iget-object v5, v6, Lkd/W;->a:Lkd/r;

    .line 117
    .line 118
    iget-object v0, v1, LCb/a;->d:Ljava/lang/Object;

    .line 119
    .line 120
    move-object v7, v0

    .line 121
    check-cast v7, Landroid/webkit/WebView;

    .line 122
    .line 123
    iget-object v0, v1, LCb/a;->b:Ljava/lang/Object;

    .line 124
    .line 125
    move-object v8, v0

    .line 126
    check-cast v8, Landroid/webkit/SslErrorHandler;

    .line 127
    .line 128
    iget-object v0, v1, LCb/a;->e:Ljava/lang/Object;

    .line 129
    .line 130
    move-object v9, v0

    .line 131
    check-cast v9, Landroid/net/http/SslError;

    .line 132
    .line 133
    invoke-virtual/range {v5 .. v10}, Lkd/r;->l(Landroid/webkit/WebViewClient;Landroid/webkit/WebView;Landroid/webkit/SslErrorHandler;Landroid/net/http/SslError;Ltf/l;)V

    .line 134
    .line 135
    .line 136
    return-void

    .line 137
    :pswitch_1
    new-instance v0, Lcom/moloco/sdk/internal/publisher/d;

    .line 138
    .line 139
    invoke-direct {v0, v5}, Lcom/moloco/sdk/internal/publisher/d;-><init>(I)V

    .line 140
    .line 141
    .line 142
    iget-object v2, v1, LCb/a;->c:Ljava/lang/Object;

    .line 143
    .line 144
    move-object v12, v2

    .line 145
    check-cast v12, Lkd/W;

    .line 146
    .line 147
    iget-object v11, v12, Lkd/W;->a:Lkd/r;

    .line 148
    .line 149
    iget-object v2, v1, LCb/a;->d:Ljava/lang/Object;

    .line 150
    .line 151
    move-object v13, v2

    .line 152
    check-cast v13, Landroid/webkit/WebView;

    .line 153
    .line 154
    iget-object v2, v1, LCb/a;->b:Ljava/lang/Object;

    .line 155
    .line 156
    move-object v14, v2

    .line 157
    check-cast v14, Landroid/os/Message;

    .line 158
    .line 159
    iget-object v2, v1, LCb/a;->e:Ljava/lang/Object;

    .line 160
    .line 161
    move-object v15, v2

    .line 162
    check-cast v15, Landroid/os/Message;

    .line 163
    .line 164
    move-object/from16 v16, v0

    .line 165
    .line 166
    invoke-virtual/range {v11 .. v16}, Lkd/r;->b(Landroid/webkit/WebViewClient;Landroid/webkit/WebView;Landroid/os/Message;Landroid/os/Message;Ltf/l;)V

    .line 167
    .line 168
    .line 169
    return-void

    .line 170
    :pswitch_2
    new-instance v7, Lcom/moloco/sdk/internal/publisher/d;

    .line 171
    .line 172
    invoke-direct {v7, v6}, Lcom/moloco/sdk/internal/publisher/d;-><init>(I)V

    .line 173
    .line 174
    .line 175
    iget-object v0, v1, LCb/a;->c:Ljava/lang/Object;

    .line 176
    .line 177
    move-object v3, v0

    .line 178
    check-cast v3, Lkd/T;

    .line 179
    .line 180
    iget-object v2, v3, Lkd/T;->a:Lkd/r;

    .line 181
    .line 182
    iget-object v0, v1, LCb/a;->d:Ljava/lang/Object;

    .line 183
    .line 184
    move-object v4, v0

    .line 185
    check-cast v4, Landroid/webkit/WebView;

    .line 186
    .line 187
    iget-object v0, v1, LCb/a;->b:Ljava/lang/Object;

    .line 188
    .line 189
    move-object v5, v0

    .line 190
    check-cast v5, Landroid/webkit/SslErrorHandler;

    .line 191
    .line 192
    iget-object v0, v1, LCb/a;->e:Ljava/lang/Object;

    .line 193
    .line 194
    move-object v6, v0

    .line 195
    check-cast v6, Landroid/net/http/SslError;

    .line 196
    .line 197
    invoke-virtual/range {v2 .. v7}, Lkd/r;->l(Landroid/webkit/WebViewClient;Landroid/webkit/WebView;Landroid/webkit/SslErrorHandler;Landroid/net/http/SslError;Ltf/l;)V

    .line 198
    .line 199
    .line 200
    return-void

    .line 201
    :pswitch_3
    new-instance v13, Lcom/moloco/sdk/internal/publisher/d;

    .line 202
    .line 203
    invoke-direct {v13, v6}, Lcom/moloco/sdk/internal/publisher/d;-><init>(I)V

    .line 204
    .line 205
    .line 206
    iget-object v0, v1, LCb/a;->c:Ljava/lang/Object;

    .line 207
    .line 208
    move-object v9, v0

    .line 209
    check-cast v9, Lkd/T;

    .line 210
    .line 211
    iget-object v8, v9, Lkd/T;->a:Lkd/r;

    .line 212
    .line 213
    iget-object v0, v1, LCb/a;->d:Ljava/lang/Object;

    .line 214
    .line 215
    move-object v10, v0

    .line 216
    check-cast v10, Landroid/webkit/WebView;

    .line 217
    .line 218
    iget-object v0, v1, LCb/a;->b:Ljava/lang/Object;

    .line 219
    .line 220
    move-object v11, v0

    .line 221
    check-cast v11, Landroid/os/Message;

    .line 222
    .line 223
    iget-object v0, v1, LCb/a;->e:Ljava/lang/Object;

    .line 224
    .line 225
    move-object v12, v0

    .line 226
    check-cast v12, Landroid/os/Message;

    .line 227
    .line 228
    invoke-virtual/range {v8 .. v13}, Lkd/r;->b(Landroid/webkit/WebViewClient;Landroid/webkit/WebView;Landroid/os/Message;Landroid/os/Message;Ltf/l;)V

    .line 229
    .line 230
    .line 231
    return-void

    .line 232
    :pswitch_4
    new-instance v7, Lcom/moloco/sdk/internal/publisher/d;

    .line 233
    .line 234
    invoke-direct {v7, v6}, Lcom/moloco/sdk/internal/publisher/d;-><init>(I)V

    .line 235
    .line 236
    .line 237
    iget-object v0, v1, LCb/a;->c:Ljava/lang/Object;

    .line 238
    .line 239
    move-object v3, v0

    .line 240
    check-cast v3, Lkd/T;

    .line 241
    .line 242
    iget-object v2, v3, Lkd/T;->a:Lkd/r;

    .line 243
    .line 244
    iget-object v0, v1, LCb/a;->d:Ljava/lang/Object;

    .line 245
    .line 246
    move-object v4, v0

    .line 247
    check-cast v4, Landroid/webkit/WebView;

    .line 248
    .line 249
    iget-object v0, v1, LCb/a;->b:Ljava/lang/Object;

    .line 250
    .line 251
    move-object v5, v0

    .line 252
    check-cast v5, Landroid/webkit/WebResourceRequest;

    .line 253
    .line 254
    iget-object v0, v1, LCb/a;->e:Ljava/lang/Object;

    .line 255
    .line 256
    move-object v6, v0

    .line 257
    check-cast v6, Landroid/webkit/WebResourceResponse;

    .line 258
    .line 259
    invoke-virtual/range {v2 .. v7}, Lkd/r;->j(Landroid/webkit/WebViewClient;Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceResponse;Ltf/l;)V

    .line 260
    .line 261
    .line 262
    return-void

    .line 263
    :pswitch_5
    new-instance v2, Lcom/moloco/sdk/internal/publisher/d;

    .line 264
    .line 265
    invoke-direct {v2, v6}, Lcom/moloco/sdk/internal/publisher/d;-><init>(I)V

    .line 266
    .line 267
    .line 268
    iget-object v5, v1, LCb/a;->c:Ljava/lang/Object;

    .line 269
    .line 270
    check-cast v5, Lkd/T;

    .line 271
    .line 272
    iget-object v6, v5, Lkd/T;->a:Lkd/r;

    .line 273
    .line 274
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 275
    .line 276
    .line 277
    iget-object v10, v1, LCb/a;->d:Ljava/lang/Object;

    .line 278
    .line 279
    check-cast v10, Landroid/webkit/WebView;

    .line 280
    .line 281
    const-string v11, "webViewArg"

    .line 282
    .line 283
    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 284
    .line 285
    .line 286
    iget-object v11, v1, LCb/a;->b:Ljava/lang/Object;

    .line 287
    .line 288
    check-cast v11, Landroid/webkit/WebResourceRequest;

    .line 289
    .line 290
    const-string v12, "requestArg"

    .line 291
    .line 292
    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 293
    .line 294
    .line 295
    iget-object v12, v1, LCb/a;->e:Ljava/lang/Object;

    .line 296
    .line 297
    check-cast v12, Lx3/f;

    .line 298
    .line 299
    const-string v13, "errorArg"

    .line 300
    .line 301
    invoke-static {v12, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 302
    .line 303
    .line 304
    iget-object v6, v6, Lkd/r;->a:LC8/i;

    .line 305
    .line 306
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 307
    .line 308
    .line 309
    invoke-virtual {v6}, LC8/i;->q()Luc/n;

    .line 310
    .line 311
    .line 312
    move-result-object v13

    .line 313
    new-instance v14, LVa/X7;

    .line 314
    .line 315
    const-string v15, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedRequestErrorCompat"

    .line 316
    .line 317
    iget-object v6, v6, LC8/i;->c:Ljava/lang/Object;

    .line 318
    .line 319
    check-cast v6, Luc/f;

    .line 320
    .line 321
    invoke-direct {v14, v6, v13, v9, v15}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 322
    .line 323
    .line 324
    new-array v4, v4, [Ljava/lang/Object;

    .line 325
    .line 326
    aput-object v5, v4, v8

    .line 327
    .line 328
    aput-object v10, v4, v7

    .line 329
    .line 330
    aput-object v11, v4, v3

    .line 331
    .line 332
    aput-object v12, v4, v0

    .line 333
    .line 334
    invoke-static {v4}, Lr7/e;->D([Ljava/lang/Object;)Ljava/util/List;

    .line 335
    .line 336
    .line 337
    move-result-object v0

    .line 338
    new-instance v3, Lkd/D;

    .line 339
    .line 340
    const/16 v4, 0x14

    .line 341
    .line 342
    invoke-direct {v3, v2, v4}, Lkd/D;-><init>(Ljava/lang/Object;I)V

    .line 343
    .line 344
    .line 345
    invoke-virtual {v14, v0, v3}, LVa/X7;->m(Ljava/lang/Object;Luc/c;)V

    .line 346
    .line 347
    .line 348
    return-void

    .line 349
    :pswitch_6
    iget-object v0, v1, LCb/a;->c:Ljava/lang/Object;

    .line 350
    .line 351
    check-cast v0, LWa/h;

    .line 352
    .line 353
    iget-object v0, v0, LWa/h;->c:Ltc/g;

    .line 354
    .line 355
    iget-object v2, v1, LCb/a;->b:Ljava/lang/Object;

    .line 356
    .line 357
    check-cast v2, Ljava/lang/String;

    .line 358
    .line 359
    iget-object v3, v1, LCb/a;->e:Ljava/lang/Object;

    .line 360
    .line 361
    iget-object v4, v1, LCb/a;->d:Ljava/lang/Object;

    .line 362
    .line 363
    check-cast v4, Ljava/lang/String;

    .line 364
    .line 365
    invoke-virtual {v0, v4, v2, v3}, Ltc/g;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 366
    .line 367
    .line 368
    return-void

    .line 369
    :pswitch_7
    iget-object v0, v1, LCb/a;->c:Ljava/lang/Object;

    .line 370
    .line 371
    check-cast v0, Lcom/applovin/adview/AppLovinAdViewEventListener;

    .line 372
    .line 373
    iget-object v2, v1, LCb/a;->d:Ljava/lang/Object;

    .line 374
    .line 375
    check-cast v2, Lcom/applovin/sdk/AppLovinAd;

    .line 376
    .line 377
    iget-object v3, v1, LCb/a;->b:Ljava/lang/Object;

    .line 378
    .line 379
    check-cast v3, Lcom/applovin/adview/AppLovinAdView;

    .line 380
    .line 381
    iget-object v4, v1, LCb/a;->e:Ljava/lang/Object;

    .line 382
    .line 383
    check-cast v4, Lcom/applovin/adview/AppLovinAdViewDisplayErrorCode;

    .line 384
    .line 385
    invoke-static {v0, v2, v3, v4}, Lcom/applovin/impl/t2;->C(Lcom/applovin/adview/AppLovinAdViewEventListener;Lcom/applovin/sdk/AppLovinAd;Lcom/applovin/adview/AppLovinAdView;Lcom/applovin/adview/AppLovinAdViewDisplayErrorCode;)V

    .line 386
    .line 387
    .line 388
    return-void

    .line 389
    :pswitch_8
    iget-object v0, v1, LCb/a;->b:Ljava/lang/Object;

    .line 390
    .line 391
    check-cast v0, Landroid/widget/ImageView;

    .line 392
    .line 393
    iget-object v2, v1, LCb/a;->e:Ljava/lang/Object;

    .line 394
    .line 395
    check-cast v2, Landroid/net/Uri;

    .line 396
    .line 397
    iget-object v3, v1, LCb/a;->d:Ljava/lang/Object;

    .line 398
    .line 399
    check-cast v3, Lcom/applovin/impl/sdk/k;

    .line 400
    .line 401
    iget-object v4, v1, LCb/a;->c:Ljava/lang/Object;

    .line 402
    .line 403
    check-cast v4, Ljava/lang/String;

    .line 404
    .line 405
    invoke-static {v4, v3, v0, v2}, Lcom/applovin/impl/sdk/utils/ImageViewUtils;->e(Ljava/lang/String;Lcom/applovin/impl/sdk/k;Landroid/widget/ImageView;Landroid/net/Uri;)V

    .line 406
    .line 407
    .line 408
    return-void

    .line 409
    :pswitch_9
    iget-object v0, v1, LCb/a;->c:Ljava/lang/Object;

    .line 410
    .line 411
    check-cast v0, Lcom/applovin/impl/sdk/c;

    .line 412
    .line 413
    iget-object v2, v1, LCb/a;->d:Ljava/lang/Object;

    .line 414
    .line 415
    check-cast v2, Ljava/io/File;

    .line 416
    .line 417
    iget-object v3, v1, LCb/a;->b:Ljava/lang/Object;

    .line 418
    .line 419
    check-cast v3, Lcom/applovin/impl/sdk/c$c;

    .line 420
    .line 421
    iget-object v4, v1, LCb/a;->e:Ljava/lang/Object;

    .line 422
    .line 423
    check-cast v4, Lcom/applovin/impl/sdk/c$a;

    .line 424
    .line 425
    invoke-static {v0, v2, v3, v4}, Lcom/applovin/impl/sdk/c;->b(Lcom/applovin/impl/sdk/c;Ljava/io/File;Lcom/applovin/impl/sdk/c$c;Lcom/applovin/impl/sdk/c$a;)V

    .line 426
    .line 427
    .line 428
    return-void

    .line 429
    :pswitch_a
    iget-object v0, v1, LCb/a;->b:Ljava/lang/Object;

    .line 430
    .line 431
    check-cast v0, Ljava/util/Map;

    .line 432
    .line 433
    iget-object v2, v1, LCb/a;->c:Ljava/lang/Object;

    .line 434
    .line 435
    check-cast v2, Lcom/applovin/impl/sdk/EventServiceImpl;

    .line 436
    .line 437
    iget-object v3, v1, LCb/a;->d:Ljava/lang/Object;

    .line 438
    .line 439
    check-cast v3, Ljava/lang/String;

    .line 440
    .line 441
    iget-object v4, v1, LCb/a;->e:Ljava/lang/Object;

    .line 442
    .line 443
    check-cast v4, Ljava/util/Map;

    .line 444
    .line 445
    invoke-static {v2, v3, v0, v4}, Lcom/applovin/impl/sdk/EventServiceImpl;->b(Lcom/applovin/impl/sdk/EventServiceImpl;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)V

    .line 446
    .line 447
    .line 448
    return-void

    .line 449
    :pswitch_b
    iget-object v0, v1, LCb/a;->c:Ljava/lang/Object;

    .line 450
    .line 451
    check-cast v0, Lcom/applovin/impl/r1;

    .line 452
    .line 453
    iget-object v2, v1, LCb/a;->d:Ljava/lang/Object;

    .line 454
    .line 455
    check-cast v2, Ljava/lang/String;

    .line 456
    .line 457
    iget-object v3, v1, LCb/a;->b:Ljava/lang/Object;

    .line 458
    .line 459
    check-cast v3, Ljava/lang/String;

    .line 460
    .line 461
    iget-object v4, v1, LCb/a;->e:Ljava/lang/Object;

    .line 462
    .line 463
    check-cast v4, Ljava/lang/Throwable;

    .line 464
    .line 465
    invoke-static {v0, v2, v3, v4}, Lcom/applovin/impl/r1;->e(Lcom/applovin/impl/r1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 466
    .line 467
    .line 468
    return-void

    .line 469
    :pswitch_c
    iget-object v0, v1, LCb/a;->c:Ljava/lang/Object;

    .line 470
    .line 471
    check-cast v0, Lcom/applovin/impl/privacy/cmp/a;

    .line 472
    .line 473
    iget-object v2, v1, LCb/a;->d:Ljava/lang/Object;

    .line 474
    .line 475
    check-cast v2, Lcom/google/android/ump/FormError;

    .line 476
    .line 477
    iget-object v3, v1, LCb/a;->b:Ljava/lang/Object;

    .line 478
    .line 479
    check-cast v3, Lcom/applovin/impl/k0;

    .line 480
    .line 481
    iget-object v4, v1, LCb/a;->e:Ljava/lang/Object;

    .line 482
    .line 483
    check-cast v4, Lcom/applovin/impl/privacy/cmp/a$a;

    .line 484
    .line 485
    invoke-static {v3, v4, v0, v2}, Lcom/applovin/impl/privacy/cmp/a;->d(Lcom/applovin/impl/k0;Lcom/applovin/impl/privacy/cmp/a$a;Lcom/applovin/impl/privacy/cmp/a;Lcom/google/android/ump/FormError;)V

    .line 486
    .line 487
    .line 488
    return-void

    .line 489
    :pswitch_d
    iget-object v0, v1, LCb/a;->c:Ljava/lang/Object;

    .line 490
    .line 491
    check-cast v0, Lcom/applovin/impl/n2;

    .line 492
    .line 493
    iget-object v2, v1, LCb/a;->d:Ljava/lang/Object;

    .line 494
    .line 495
    check-cast v2, Landroid/view/ViewGroup;

    .line 496
    .line 497
    iget-object v3, v1, LCb/a;->b:Ljava/lang/Object;

    .line 498
    .line 499
    check-cast v3, Landroid/app/Activity;

    .line 500
    .line 501
    iget-object v4, v1, LCb/a;->e:Ljava/lang/Object;

    .line 502
    .line 503
    check-cast v4, Lcom/applovin/adview/AppLovinFullscreenAdViewObserver;

    .line 504
    .line 505
    invoke-static {v0, v3, v4, v2}, Lcom/applovin/impl/n2;->c(Lcom/applovin/impl/n2;Landroid/app/Activity;Lcom/applovin/adview/AppLovinFullscreenAdViewObserver;Landroid/view/ViewGroup;)V

    .line 506
    .line 507
    .line 508
    return-void

    .line 509
    :pswitch_e
    iget-object v0, v1, LCb/a;->c:Ljava/lang/Object;

    .line 510
    .line 511
    check-cast v0, Lcom/applovin/impl/mediation/ads/MaxFullscreenAdImpl;

    .line 512
    .line 513
    iget-object v2, v1, LCb/a;->d:Ljava/lang/Object;

    .line 514
    .line 515
    check-cast v2, Ljava/lang/String;

    .line 516
    .line 517
    iget-object v3, v1, LCb/a;->b:Ljava/lang/Object;

    .line 518
    .line 519
    check-cast v3, Ljava/lang/String;

    .line 520
    .line 521
    iget-object v4, v1, LCb/a;->e:Ljava/lang/Object;

    .line 522
    .line 523
    check-cast v4, Landroid/app/Activity;

    .line 524
    .line 525
    invoke-static {v0, v2, v3, v4}, Lcom/applovin/impl/mediation/ads/MaxFullscreenAdImpl;->d(Lcom/applovin/impl/mediation/ads/MaxFullscreenAdImpl;Ljava/lang/String;Ljava/lang/String;Landroid/app/Activity;)V

    .line 526
    .line 527
    .line 528
    return-void

    .line 529
    :pswitch_f
    iget-object v0, v1, LCb/a;->c:Ljava/lang/Object;

    .line 530
    .line 531
    check-cast v0, Lcom/applovin/impl/mediation/ads/MaxFullscreenAdImpl;

    .line 532
    .line 533
    iget-object v2, v1, LCb/a;->d:Ljava/lang/Object;

    .line 534
    .line 535
    check-cast v2, Landroid/app/Activity;

    .line 536
    .line 537
    iget-object v3, v1, LCb/a;->b:Ljava/lang/Object;

    .line 538
    .line 539
    check-cast v3, Landroid/content/Context;

    .line 540
    .line 541
    iget-object v4, v1, LCb/a;->e:Ljava/lang/Object;

    .line 542
    .line 543
    check-cast v4, Lcom/applovin/impl/i;

    .line 544
    .line 545
    invoke-static {v0, v2, v3, v4}, Lcom/applovin/impl/mediation/ads/MaxFullscreenAdImpl;->p(Lcom/applovin/impl/mediation/ads/MaxFullscreenAdImpl;Landroid/app/Activity;Landroid/content/Context;Lcom/applovin/impl/i;)V

    .line 546
    .line 547
    .line 548
    return-void

    .line 549
    :pswitch_10
    iget-object v0, v1, LCb/a;->c:Ljava/lang/Object;

    .line 550
    .line 551
    check-cast v0, Lcom/applovin/impl/j;

    .line 552
    .line 553
    iget-object v2, v1, LCb/a;->d:Ljava/lang/Object;

    .line 554
    .line 555
    check-cast v2, Lcom/applovin/impl/j$b;

    .line 556
    .line 557
    iget-object v3, v1, LCb/a;->b:Ljava/lang/Object;

    .line 558
    .line 559
    check-cast v3, Ljava/lang/String;

    .line 560
    .line 561
    iget-object v4, v1, LCb/a;->e:Ljava/lang/Object;

    .line 562
    .line 563
    check-cast v4, Ljava/lang/String;

    .line 564
    .line 565
    invoke-static {v0, v2, v3, v4}, Lcom/applovin/impl/j;->a(Lcom/applovin/impl/j;Lcom/applovin/impl/j$b;Ljava/lang/String;Ljava/lang/String;)V

    .line 566
    .line 567
    .line 568
    return-void

    .line 569
    :pswitch_11
    iget-object v0, v1, LCb/a;->c:Ljava/lang/Object;

    .line 570
    .line 571
    check-cast v0, Lcom/applovin/impl/f1;

    .line 572
    .line 573
    iget-object v2, v1, LCb/a;->d:Ljava/lang/Object;

    .line 574
    .line 575
    check-cast v2, Lcom/applovin/impl/sdk/nativeAd/AppLovinNativeAdImpl;

    .line 576
    .line 577
    iget-object v3, v1, LCb/a;->b:Ljava/lang/Object;

    .line 578
    .line 579
    check-cast v3, Landroid/app/Activity;

    .line 580
    .line 581
    iget-object v4, v1, LCb/a;->e:Ljava/lang/Object;

    .line 582
    .line 583
    check-cast v4, Landroid/net/Uri;

    .line 584
    .line 585
    invoke-static {v0, v2, v3, v4}, Lcom/applovin/impl/f1;->d(Lcom/applovin/impl/f1;Lcom/applovin/impl/sdk/nativeAd/AppLovinNativeAdImpl;Landroid/app/Activity;Landroid/net/Uri;)V

    .line 586
    .line 587
    .line 588
    return-void

    .line 589
    :pswitch_12
    iget-object v0, v1, LCb/a;->c:Ljava/lang/Object;

    .line 590
    .line 591
    check-cast v0, Lcom/applovin/impl/f1;

    .line 592
    .line 593
    iget-object v2, v1, LCb/a;->d:Ljava/lang/Object;

    .line 594
    .line 595
    check-cast v2, Lcom/applovin/impl/adview/a;

    .line 596
    .line 597
    iget-object v3, v1, LCb/a;->b:Ljava/lang/Object;

    .line 598
    .line 599
    check-cast v3, Landroid/app/Activity;

    .line 600
    .line 601
    iget-object v4, v1, LCb/a;->e:Ljava/lang/Object;

    .line 602
    .line 603
    check-cast v4, Landroid/net/Uri;

    .line 604
    .line 605
    invoke-static {v0, v2, v3, v4}, Lcom/applovin/impl/f1;->c(Lcom/applovin/impl/f1;Lcom/applovin/impl/adview/a;Landroid/app/Activity;Landroid/net/Uri;)V

    .line 606
    .line 607
    .line 608
    return-void

    .line 609
    :pswitch_13
    iget-object v0, v1, LCb/a;->b:Ljava/lang/Object;

    .line 610
    .line 611
    check-cast v0, Lcom/applovin/impl/d2;

    .line 612
    .line 613
    iget-object v2, v1, LCb/a;->c:Ljava/lang/Object;

    .line 614
    .line 615
    check-cast v2, Lcom/applovin/impl/e2;

    .line 616
    .line 617
    iget-object v3, v1, LCb/a;->d:Ljava/lang/Object;

    .line 618
    .line 619
    check-cast v3, Ljava/lang/String;

    .line 620
    .line 621
    iget-object v4, v1, LCb/a;->e:Ljava/lang/Object;

    .line 622
    .line 623
    check-cast v4, Lorg/json/JSONObject;

    .line 624
    .line 625
    invoke-static {v2, v3, v0, v4}, Lcom/applovin/impl/e2;->b(Lcom/applovin/impl/e2;Ljava/lang/String;Lcom/applovin/impl/d2;Lorg/json/JSONObject;)V

    .line 626
    .line 627
    .line 628
    return-void

    .line 629
    :pswitch_14
    iget-object v0, v1, LCb/a;->c:Ljava/lang/Object;

    .line 630
    .line 631
    check-cast v0, LWa/h;

    .line 632
    .line 633
    iget-object v0, v0, LWa/h;->c:Ltc/g;

    .line 634
    .line 635
    iget-object v2, v1, LCb/a;->b:Ljava/lang/Object;

    .line 636
    .line 637
    check-cast v2, Ljava/lang/String;

    .line 638
    .line 639
    iget-object v3, v1, LCb/a;->e:Ljava/lang/Object;

    .line 640
    .line 641
    iget-object v4, v1, LCb/a;->d:Ljava/lang/Object;

    .line 642
    .line 643
    check-cast v4, Ljava/lang/String;

    .line 644
    .line 645
    invoke-virtual {v0, v4, v2, v3}, Ltc/g;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 646
    .line 647
    .line 648
    return-void

    .line 649
    :pswitch_15
    iget-object v0, v1, LCb/a;->c:Ljava/lang/Object;

    .line 650
    .line 651
    check-cast v0, Landroid/media/AudioTrack;

    .line 652
    .line 653
    iget-object v3, v1, LCb/a;->d:Ljava/lang/Object;

    .line 654
    .line 655
    check-cast v3, Lxa/d;

    .line 656
    .line 657
    iget-object v4, v1, LCb/a;->b:Ljava/lang/Object;

    .line 658
    .line 659
    check-cast v4, Landroid/os/Handler;

    .line 660
    .line 661
    iget-object v5, v1, LCb/a;->e:Ljava/lang/Object;

    .line 662
    .line 663
    check-cast v5, LW1/g;

    .line 664
    .line 665
    :try_start_0
    invoke-virtual {v0}, Landroid/media/AudioTrack;->flush()V

    .line 666
    .line 667
    .line 668
    invoke-virtual {v0}, Landroid/media/AudioTrack;->release()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 669
    .line 670
    .line 671
    if-eqz v3, :cond_0

    .line 672
    .line 673
    invoke-virtual {v4}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 674
    .line 675
    .line 676
    move-result-object v0

    .line 677
    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 678
    .line 679
    .line 680
    move-result-object v0

    .line 681
    invoke-virtual {v0}, Ljava/lang/Thread;->isAlive()Z

    .line 682
    .line 683
    .line 684
    move-result v0

    .line 685
    if-eqz v0, :cond_0

    .line 686
    .line 687
    new-instance v0, LT3/r;

    .line 688
    .line 689
    invoke-direct {v0, v2, v3, v5}, LT3/r;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 690
    .line 691
    .line 692
    invoke-virtual {v4, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 693
    .line 694
    .line 695
    :cond_0
    sget-object v6, LW1/t;->j0:Ljava/lang/Object;

    .line 696
    .line 697
    monitor-enter v6

    .line 698
    :try_start_1
    sget v0, LW1/t;->l0:I

    .line 699
    .line 700
    sub-int/2addr v0, v7

    .line 701
    sput v0, LW1/t;->l0:I

    .line 702
    .line 703
    if-nez v0, :cond_1

    .line 704
    .line 705
    sget-object v0, LW1/t;->k0:Ljava/util/concurrent/ScheduledExecutorService;

    .line 706
    .line 707
    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 708
    .line 709
    .line 710
    sput-object v9, LW1/t;->k0:Ljava/util/concurrent/ScheduledExecutorService;

    .line 711
    .line 712
    goto :goto_0

    .line 713
    :catchall_0
    move-exception v0

    .line 714
    goto :goto_1

    .line 715
    :cond_1
    :goto_0
    monitor-exit v6

    .line 716
    return-void

    .line 717
    :goto_1
    monitor-exit v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 718
    throw v0

    .line 719
    :catchall_1
    move-exception v0

    .line 720
    if-eqz v3, :cond_2

    .line 721
    .line 722
    invoke-virtual {v4}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 723
    .line 724
    .line 725
    move-result-object v6

    .line 726
    invoke-virtual {v6}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 727
    .line 728
    .line 729
    move-result-object v6

    .line 730
    invoke-virtual {v6}, Ljava/lang/Thread;->isAlive()Z

    .line 731
    .line 732
    .line 733
    move-result v6

    .line 734
    if-eqz v6, :cond_2

    .line 735
    .line 736
    new-instance v6, LT3/r;

    .line 737
    .line 738
    invoke-direct {v6, v2, v3, v5}, LT3/r;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 739
    .line 740
    .line 741
    invoke-virtual {v4, v6}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 742
    .line 743
    .line 744
    :cond_2
    sget-object v2, LW1/t;->j0:Ljava/lang/Object;

    .line 745
    .line 746
    monitor-enter v2

    .line 747
    :try_start_2
    sget v3, LW1/t;->l0:I

    .line 748
    .line 749
    sub-int/2addr v3, v7

    .line 750
    sput v3, LW1/t;->l0:I

    .line 751
    .line 752
    if-nez v3, :cond_3

    .line 753
    .line 754
    sget-object v3, LW1/t;->k0:Ljava/util/concurrent/ScheduledExecutorService;

    .line 755
    .line 756
    invoke-interface {v3}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 757
    .line 758
    .line 759
    sput-object v9, LW1/t;->k0:Ljava/util/concurrent/ScheduledExecutorService;

    .line 760
    .line 761
    goto :goto_2

    .line 762
    :catchall_2
    move-exception v0

    .line 763
    goto :goto_3

    .line 764
    :cond_3
    :goto_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 765
    throw v0

    .line 766
    :goto_3
    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 767
    throw v0

    .line 768
    :pswitch_16
    iget-object v0, v1, LCb/a;->c:Ljava/lang/Object;

    .line 769
    .line 770
    check-cast v0, LUc/n;

    .line 771
    .line 772
    iget-object v2, v1, LCb/a;->d:Ljava/lang/Object;

    .line 773
    .line 774
    check-cast v2, Ljava/lang/String;

    .line 775
    .line 776
    iget-object v3, v1, LCb/a;->b:Ljava/lang/Object;

    .line 777
    .line 778
    check-cast v3, LPc/p;

    .line 779
    .line 780
    iget-object v4, v1, LCb/a;->e:Ljava/lang/Object;

    .line 781
    .line 782
    check-cast v4, LUc/t;

    .line 783
    .line 784
    :try_start_4
    invoke-static {v0}, LUc/f;->c(LUc/n;)Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 785
    .line 786
    .line 787
    move-result-object v0

    .line 788
    invoke-virtual {v0, v2}, Lcom/google/firebase/firestore/FirebaseFirestore;->f(Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;

    .line 789
    .line 790
    .line 791
    move-result-object v0

    .line 792
    invoke-static {v0}, Lcom/google/android/gms/tasks/Tasks;->await(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;

    .line 793
    .line 794
    .line 795
    move-result-object v0

    .line 796
    check-cast v0, Lm9/W;

    .line 797
    .line 798
    if-nez v0, :cond_4

    .line 799
    .line 800
    new-instance v0, Ljava/lang/NullPointerException;

    .line 801
    .line 802
    const-string v2, "Named query has not been found. Please check it has been loaded properly via loadBundle()."

    .line 803
    .line 804
    invoke-direct {v0, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 805
    .line 806
    .line 807
    invoke-virtual {v3, v0}, LPc/p;->b(Ljava/lang/Exception;)V

    .line 808
    .line 809
    .line 810
    goto :goto_5

    .line 811
    :catch_0
    move-exception v0

    .line 812
    goto :goto_4

    .line 813
    :cond_4
    iget v2, v4, LUc/t;->a:I

    .line 814
    .line 815
    invoke-static {v2}, Lxg/g;->H(I)I

    .line 816
    .line 817
    .line 818
    move-result v2

    .line 819
    invoke-virtual {v0, v2}, Lm9/W;->c(I)Lcom/google/android/gms/tasks/Task;

    .line 820
    .line 821
    .line 822
    move-result-object v0

    .line 823
    invoke-static {v0}, Lcom/google/android/gms/tasks/Tasks;->await(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;

    .line 824
    .line 825
    .line 826
    move-result-object v0

    .line 827
    check-cast v0, Lm9/Y;

    .line 828
    .line 829
    iget v2, v4, LUc/t;->b:I

    .line 830
    .line 831
    invoke-static {v2}, Lxg/g;->G(I)Lm9/n;

    .line 832
    .line 833
    .line 834
    move-result-object v2

    .line 835
    invoke-static {v0, v2}, Lxg/g;->X(Lm9/Y;Lm9/n;)LUc/v;

    .line 836
    .line 837
    .line 838
    move-result-object v0

    .line 839
    invoke-virtual {v3, v0}, LPc/p;->a(Ljava/lang/Object;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 840
    .line 841
    .line 842
    goto :goto_5

    .line 843
    :goto_4
    invoke-static {v3, v0}, Lvf/a;->K(LUc/y;Ljava/lang/Exception;)V

    .line 844
    .line 845
    .line 846
    :goto_5
    return-void

    .line 847
    :pswitch_17
    iget-object v0, v1, LCb/a;->c:Ljava/lang/Object;

    .line 848
    .line 849
    check-cast v0, LX8/c;

    .line 850
    .line 851
    iget-object v2, v0, LX8/c;->g:Ljava/lang/Object;

    .line 852
    .line 853
    check-cast v2, Ljava/util/concurrent/atomic/AtomicMarkableReference;

    .line 854
    .line 855
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicMarkableReference;->getReference()Ljava/lang/Object;

    .line 856
    .line 857
    .line 858
    move-result-object v2

    .line 859
    check-cast v2, Ljava/lang/String;

    .line 860
    .line 861
    iget-object v3, v1, LCb/a;->d:Ljava/lang/Object;

    .line 862
    .line 863
    check-cast v3, Ljava/lang/String;

    .line 864
    .line 865
    iget-object v4, v0, LX8/c;->b:Ljava/lang/Object;

    .line 866
    .line 867
    check-cast v4, LT8/g;

    .line 868
    .line 869
    if-eqz v2, :cond_5

    .line 870
    .line 871
    iget-object v0, v0, LX8/c;->g:Ljava/lang/Object;

    .line 872
    .line 873
    check-cast v0, Ljava/util/concurrent/atomic/AtomicMarkableReference;

    .line 874
    .line 875
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicMarkableReference;->getReference()Ljava/lang/Object;

    .line 876
    .line 877
    .line 878
    move-result-object v0

    .line 879
    check-cast v0, Ljava/lang/String;

    .line 880
    .line 881
    invoke-virtual {v4, v3, v0}, LT8/g;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 882
    .line 883
    .line 884
    :cond_5
    iget-object v0, v1, LCb/a;->b:Ljava/lang/Object;

    .line 885
    .line 886
    check-cast v0, Ljava/util/Map;

    .line 887
    .line 888
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 889
    .line 890
    .line 891
    move-result v2

    .line 892
    if-nez v2, :cond_6

    .line 893
    .line 894
    invoke-virtual {v4, v3, v0, v8}, LT8/g;->h(Ljava/lang/String;Ljava/util/Map;Z)V

    .line 895
    .line 896
    .line 897
    :cond_6
    iget-object v0, v1, LCb/a;->e:Ljava/lang/Object;

    .line 898
    .line 899
    check-cast v0, Ljava/util/List;

    .line 900
    .line 901
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 902
    .line 903
    .line 904
    move-result v2

    .line 905
    if-nez v2, :cond_7

    .line 906
    .line 907
    invoke-virtual {v4, v3, v0}, LT8/g;->i(Ljava/lang/String;Ljava/util/List;)V

    .line 908
    .line 909
    .line 910
    :cond_7
    return-void

    .line 911
    :pswitch_18
    iget-object v0, v1, LCb/a;->c:Ljava/lang/Object;

    .line 912
    .line 913
    check-cast v0, LSc/b;

    .line 914
    .line 915
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 916
    .line 917
    .line 918
    const-string v2, "flutterfire-used-link"

    .line 919
    .line 920
    iget-object v3, v1, LCb/a;->e:Ljava/lang/Object;

    .line 921
    .line 922
    check-cast v3, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 923
    .line 924
    iget-object v4, v1, LCb/a;->d:Ljava/lang/Object;

    .line 925
    .line 926
    check-cast v4, Ljava/lang/String;

    .line 927
    .line 928
    iget-object v5, v1, LCb/a;->b:Ljava/lang/Object;

    .line 929
    .line 930
    check-cast v5, Le9/a;

    .line 931
    .line 932
    if-eqz v4, :cond_8

    .line 933
    .line 934
    :try_start_5
    invoke-static {v4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 935
    .line 936
    .line 937
    move-result-object v0

    .line 938
    check-cast v5, Lf9/h;

    .line 939
    .line 940
    new-instance v2, Lf9/g;

    .line 941
    .line 942
    iget-object v4, v5, Lf9/h;->b:LO9/b;

    .line 943
    .line 944
    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 945
    .line 946
    .line 947
    move-result-object v0

    .line 948
    invoke-direct {v2, v4, v0}, Lf9/g;-><init>(LO9/b;Ljava/lang/String;)V

    .line 949
    .line 950
    .line 951
    iget-object v0, v5, Lf9/h;->a:Lf9/b;

    .line 952
    .line 953
    invoke-virtual {v0, v2}, Lcom/google/android/gms/common/api/l;->doWrite(Lcom/google/android/gms/common/api/internal/A;)Lcom/google/android/gms/tasks/Task;

    .line 954
    .line 955
    .line 956
    move-result-object v0

    .line 957
    invoke-static {v0}, Lcom/google/android/gms/tasks/Tasks;->await(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;

    .line 958
    .line 959
    .line 960
    move-result-object v0

    .line 961
    check-cast v0, Le9/b;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1

    .line 962
    .line 963
    goto :goto_6

    .line 964
    :catch_1
    move-exception v0

    .line 965
    goto :goto_8

    .line 966
    :cond_8
    iget-object v0, v0, LSc/b;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 967
    .line 968
    :try_start_6
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 969
    .line 970
    .line 971
    move-result-object v4

    .line 972
    if-eqz v4, :cond_a

    .line 973
    .line 974
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 975
    .line 976
    .line 977
    move-result-object v4

    .line 978
    check-cast v4, Landroid/app/Activity;

    .line 979
    .line 980
    invoke-virtual {v4}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 981
    .line 982
    .line 983
    move-result-object v4

    .line 984
    if-eqz v4, :cond_a

    .line 985
    .line 986
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 987
    .line 988
    .line 989
    move-result-object v4

    .line 990
    check-cast v4, Landroid/app/Activity;

    .line 991
    .line 992
    invoke-virtual {v4}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 993
    .line 994
    .line 995
    move-result-object v4

    .line 996
    invoke-virtual {v4, v2, v8}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 997
    .line 998
    .line 999
    move-result v4

    .line 1000
    if-eqz v4, :cond_9

    .line 1001
    .line 1002
    goto :goto_7

    .line 1003
    :cond_9
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 1004
    .line 1005
    .line 1006
    move-result-object v4

    .line 1007
    check-cast v4, Landroid/app/Activity;

    .line 1008
    .line 1009
    invoke-virtual {v4}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 1010
    .line 1011
    .line 1012
    move-result-object v4

    .line 1013
    invoke-virtual {v4, v2, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 1014
    .line 1015
    .line 1016
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 1017
    .line 1018
    .line 1019
    move-result-object v0

    .line 1020
    check-cast v0, Landroid/app/Activity;

    .line 1021
    .line 1022
    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 1023
    .line 1024
    .line 1025
    move-result-object v0

    .line 1026
    invoke-virtual {v5, v0}, Le9/a;->a(Landroid/content/Intent;)Lcom/google/android/gms/tasks/Task;

    .line 1027
    .line 1028
    .line 1029
    move-result-object v0

    .line 1030
    invoke-static {v0}, Lcom/google/android/gms/tasks/Tasks;->await(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;

    .line 1031
    .line 1032
    .line 1033
    move-result-object v0

    .line 1034
    check-cast v0, Le9/b;

    .line 1035
    .line 1036
    :goto_6
    invoke-static {v0}, La/a;->r(Le9/b;)Ljava/util/HashMap;

    .line 1037
    .line 1038
    .line 1039
    move-result-object v0

    .line 1040
    invoke-virtual {v3, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    .line 1041
    .line 1042
    .line 1043
    goto :goto_9

    .line 1044
    :cond_a
    :goto_7
    invoke-virtual {v3, v9}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1

    .line 1045
    .line 1046
    .line 1047
    goto :goto_9

    .line 1048
    :goto_8
    invoke-virtual {v3, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    .line 1049
    .line 1050
    .line 1051
    :goto_9
    return-void

    .line 1052
    :pswitch_19
    iget-object v0, v1, LCb/a;->d:Ljava/lang/Object;

    .line 1053
    .line 1054
    check-cast v0, LQc/f;

    .line 1055
    .line 1056
    iget-object v2, v1, LCb/a;->e:Ljava/lang/Object;

    .line 1057
    .line 1058
    check-cast v2, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 1059
    .line 1060
    sget-object v3, LQc/c;->c:Ljava/util/HashMap;

    .line 1061
    .line 1062
    iget-object v3, v1, LCb/a;->c:Ljava/lang/Object;

    .line 1063
    .line 1064
    check-cast v3, LQc/c;

    .line 1065
    .line 1066
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1067
    .line 1068
    .line 1069
    :try_start_7
    iget-object v6, v0, LQc/f;->a:Ljava/lang/String;

    .line 1070
    .line 1071
    const-string v4, "ApiKey must be set."

    .line 1072
    .line 1073
    invoke-static {v6, v4}, Lcom/google/android/gms/common/internal/v;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 1074
    .line 1075
    .line 1076
    iget-object v5, v0, LQc/f;->b:Ljava/lang/String;

    .line 1077
    .line 1078
    const-string v4, "ApplicationId must be set."

    .line 1079
    .line 1080
    invoke-static {v5, v4}, Lcom/google/android/gms/common/internal/v;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 1081
    .line 1082
    .line 1083
    iget-object v7, v0, LQc/f;->f:Ljava/lang/String;

    .line 1084
    .line 1085
    iget-object v9, v0, LQc/f;->c:Ljava/lang/String;

    .line 1086
    .line 1087
    iget-object v11, v0, LQc/f;->d:Ljava/lang/String;

    .line 1088
    .line 1089
    iget-object v10, v0, LQc/f;->g:Ljava/lang/String;

    .line 1090
    .line 1091
    iget-object v8, v0, LQc/f;->i:Ljava/lang/String;

    .line 1092
    .line 1093
    new-instance v4, Ls8/l;

    .line 1094
    .line 1095
    invoke-direct/range {v4 .. v11}, Ls8/l;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_3

    .line 1096
    .line 1097
    .line 1098
    :try_start_8
    invoke-static {}, Landroid/os/Looper;->prepare()V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_2

    .line 1099
    .line 1100
    .line 1101
    :catch_2
    :try_start_9
    iget-object v0, v0, LQc/f;->e:Ljava/lang/String;
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_3

    .line 1102
    .line 1103
    iget-object v5, v1, LCb/a;->b:Ljava/lang/Object;

    .line 1104
    .line 1105
    check-cast v5, Ljava/lang/String;

    .line 1106
    .line 1107
    if-eqz v0, :cond_b

    .line 1108
    .line 1109
    :try_start_a
    sget-object v6, LQc/c;->c:Ljava/util/HashMap;

    .line 1110
    .line 1111
    invoke-virtual {v6, v5, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1112
    .line 1113
    .line 1114
    goto :goto_a

    .line 1115
    :catch_3
    move-exception v0

    .line 1116
    goto :goto_b

    .line 1117
    :cond_b
    :goto_a
    iget-object v0, v3, LQc/c;->a:Landroid/content/Context;

    .line 1118
    .line 1119
    invoke-static {v0, v5, v4}, Ls8/g;->j(Landroid/content/Context;Ljava/lang/String;Ls8/l;)Ls8/g;

    .line 1120
    .line 1121
    .line 1122
    move-result-object v0

    .line 1123
    new-instance v4, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 1124
    .line 1125
    invoke-direct {v4}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    .line 1126
    .line 1127
    .line 1128
    sget-object v5, Lio/flutter/plugins/firebase/core/FlutterFirebasePlugin;->cachedThreadPool:Ljava/util/concurrent/ExecutorService;

    .line 1129
    .line 1130
    new-instance v6, LAb/a;

    .line 1131
    .line 1132
    const/4 v7, 0x5

    .line 1133
    invoke-direct {v6, v3, v0, v4, v7}, LAb/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 1134
    .line 1135
    .line 1136
    invoke-interface {v5, v6}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 1137
    .line 1138
    .line 1139
    invoke-virtual {v4}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 1140
    .line 1141
    .line 1142
    move-result-object v0

    .line 1143
    invoke-static {v0}, Lcom/google/android/gms/tasks/Tasks;->await(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;

    .line 1144
    .line 1145
    .line 1146
    move-result-object v0

    .line 1147
    check-cast v0, LQc/g;

    .line 1148
    .line 1149
    invoke-virtual {v2, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_3

    .line 1150
    .line 1151
    .line 1152
    goto :goto_c

    .line 1153
    :goto_b
    invoke-virtual {v2, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    .line 1154
    .line 1155
    .line 1156
    :goto_c
    return-void

    .line 1157
    :pswitch_1a
    sget-object v0, LCg/c;->e:Landroid/net/Uri;

    .line 1158
    .line 1159
    iget-object v0, v1, LCb/a;->e:Ljava/lang/Object;

    .line 1160
    .line 1161
    check-cast v0, Ljava/lang/StringBuilder;

    .line 1162
    .line 1163
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1164
    .line 1165
    .line 1166
    move-result-object v0

    .line 1167
    iget-object v2, v1, LCb/a;->c:Ljava/lang/Object;

    .line 1168
    .line 1169
    check-cast v2, Ltc/g;

    .line 1170
    .line 1171
    iget-object v3, v1, LCb/a;->d:Ljava/lang/Object;

    .line 1172
    .line 1173
    check-cast v3, Ljava/lang/String;

    .line 1174
    .line 1175
    iget-object v4, v1, LCb/a;->b:Ljava/lang/Object;

    .line 1176
    .line 1177
    check-cast v4, Ljava/lang/String;

    .line 1178
    .line 1179
    invoke-virtual {v2, v3, v4, v0}, Ltc/g;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 1180
    .line 1181
    .line 1182
    return-void

    .line 1183
    :pswitch_1b
    iget-object v0, v1, LCb/a;->c:Ljava/lang/Object;

    .line 1184
    .line 1185
    check-cast v0, Lcom/vungle/ads/internal/downloader/k;

    .line 1186
    .line 1187
    iget-object v2, v1, LCb/a;->d:Ljava/lang/Object;

    .line 1188
    .line 1189
    check-cast v2, Lcom/vungle/ads/internal/load/g;

    .line 1190
    .line 1191
    iget-object v3, v1, LCb/a;->e:Ljava/lang/Object;

    .line 1192
    .line 1193
    check-cast v3, Ljava/io/File;

    .line 1194
    .line 1195
    iget-object v4, v1, LCb/a;->b:Ljava/lang/Object;

    .line 1196
    .line 1197
    check-cast v4, Lcom/vungle/ads/internal/load/c;

    .line 1198
    .line 1199
    invoke-static {v3, v4, v0, v2}, Lcom/vungle/ads/internal/load/c;->a(Ljava/io/File;Lcom/vungle/ads/internal/load/c;Lcom/vungle/ads/internal/downloader/k;Lcom/vungle/ads/internal/load/g;)V

    .line 1200
    .line 1201
    .line 1202
    return-void

    .line 1203
    :pswitch_1c
    iget-object v0, v1, LCb/a;->b:Ljava/lang/Object;

    .line 1204
    .line 1205
    check-cast v0, Lcom/vungle/ads/internal/load/c;

    .line 1206
    .line 1207
    iget-object v2, v1, LCb/a;->e:Ljava/lang/Object;

    .line 1208
    .line 1209
    check-cast v2, Lcom/vungle/ads/internal/downloader/b;

    .line 1210
    .line 1211
    iget-object v3, v1, LCb/a;->c:Ljava/lang/Object;

    .line 1212
    .line 1213
    check-cast v3, Lcom/vungle/ads/internal/downloader/k;

    .line 1214
    .line 1215
    iget-object v4, v1, LCb/a;->d:Ljava/lang/Object;

    .line 1216
    .line 1217
    check-cast v4, Lcom/vungle/ads/internal/load/g;

    .line 1218
    .line 1219
    invoke-static {v3, v4, v0, v2}, Lcom/vungle/ads/internal/load/c;->a(Lcom/vungle/ads/internal/downloader/k;Lcom/vungle/ads/internal/load/g;Lcom/vungle/ads/internal/load/c;Lcom/vungle/ads/internal/downloader/b;)V

    .line 1220
    .line 1221
    .line 1222
    return-void

    .line 1223
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
