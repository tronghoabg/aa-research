.class public Lkd/X;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lqc/b;
.implements Lrc/a;


# instance fields
.field public a:Lqc/a;

.field public b:LC8/i;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final onAttachedToActivity(Lrc/b;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lkd/X;->b:LC8/i;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lq/s1;

    .line 6
    .line 7
    iget-object p1, p1, Lq/s1;->a:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p1, Landroid/app/Activity;

    .line 10
    .line 11
    iput-object p1, v0, LC8/i;->b:Ljava/lang/Object;

    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public final onAttachedToEngine(Lqc/a;)V
    .locals 13

    .line 1
    const/16 v0, 0x16

    .line 2
    .line 3
    const/16 v1, 0x10

    .line 4
    .line 5
    const/16 v2, 0x11

    .line 6
    .line 7
    const/16 v3, 0xe

    .line 8
    .line 9
    const/4 v4, 0x2

    .line 10
    const/4 v5, 0x1

    .line 11
    const/4 v6, 0x0

    .line 12
    iput-object p1, p0, Lkd/X;->a:Lqc/a;

    .line 13
    .line 14
    new-instance v7, LC8/i;

    .line 15
    .line 16
    iget-object v8, p1, Lqc/a;->c:Luc/f;

    .line 17
    .line 18
    new-instance v9, Lkd/q;

    .line 19
    .line 20
    iget-object v10, p1, Lqc/a;->a:Landroid/content/Context;

    .line 21
    .line 22
    invoke-virtual {v10}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    .line 23
    .line 24
    .line 25
    move-result-object v11

    .line 26
    iget-object v12, p1, Lqc/a;->f:Lcom/google/android/gms/ads/nativead/l;

    .line 27
    .line 28
    invoke-direct {v9, v11, v12}, Lkd/q;-><init>(Landroid/content/res/AssetManager;Lcom/google/android/gms/ads/nativead/l;)V

    .line 29
    .line 30
    .line 31
    invoke-direct {v7, v8, v10, v9}, LC8/i;-><init>(Luc/f;Landroid/content/Context;Lkd/q;)V

    .line 32
    .line 33
    .line 34
    iput-object v7, p0, Lkd/X;->b:LC8/i;

    .line 35
    .line 36
    new-instance v8, Lad/Z;

    .line 37
    .line 38
    iget-object v7, v7, LC8/i;->d:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v7, Lkd/d;

    .line 41
    .line 42
    invoke-direct {v8, v7}, Lad/Z;-><init>(Lkd/d;)V

    .line 43
    .line 44
    .line 45
    iget-object p1, p1, Lqc/a;->e:Lio/flutter/plugin/platform/n;

    .line 46
    .line 47
    const-string v7, "plugins.flutter.io/webview"

    .line 48
    .line 49
    invoke-virtual {p1, v7, v8}, Lio/flutter/plugin/platform/n;->j(Ljava/lang/String;Lio/flutter/plugin/platform/f;)V

    .line 50
    .line 51
    .line 52
    iget-object p1, p0, Lkd/X;->b:LC8/i;

    .line 53
    .line 54
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    sget-object v7, Lkd/f;->b:Lef/p;

    .line 58
    .line 59
    iget-object v7, p1, LC8/i;->d:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v7, Lkd/d;

    .line 62
    .line 63
    iget-object v8, p1, LC8/i;->c:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v8, Luc/f;

    .line 66
    .line 67
    invoke-static {v8, v7}, Landroid/support/v4/media/session/b;->q0(Luc/f;Lkd/d;)V

    .line 68
    .line 69
    .line 70
    new-instance v7, Lkd/l;

    .line 71
    .line 72
    invoke-direct {v7, p1, v6}, Lkd/l;-><init>(LC8/i;I)V

    .line 73
    .line 74
    .line 75
    invoke-static {v8, v7}, Lic/d;->M(Luc/f;Lkd/l;)V

    .line 76
    .line 77
    .line 78
    new-instance v7, Lkd/s;

    .line 79
    .line 80
    invoke-direct {v7, p1, v4}, Lkd/s;-><init>(LC8/i;I)V

    .line 81
    .line 82
    .line 83
    invoke-static {v8, v7}, LA6/c;->M(Luc/f;Lkd/s;)V

    .line 84
    .line 85
    .line 86
    new-instance v7, Lkd/l;

    .line 87
    .line 88
    invoke-direct {v7, p1, v4}, Lkd/l;-><init>(LC8/i;I)V

    .line 89
    .line 90
    .line 91
    invoke-static {v8, v7}, Lxg/g;->T(Luc/f;Lkd/l;)V

    .line 92
    .line 93
    .line 94
    new-instance v7, Lkd/i;

    .line 95
    .line 96
    invoke-direct {v7, p1, v5}, Lkd/i;-><init>(LC8/i;I)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p1}, LC8/i;->q()Luc/n;

    .line 100
    .line 101
    .line 102
    move-result-object v9

    .line 103
    new-instance v10, LVa/X7;

    .line 104
    .line 105
    const-string v11, "dev.flutter.pigeon.webview_flutter_android.JavaScriptChannel.pigeon_defaultConstructor"

    .line 106
    .line 107
    const/4 v12, 0x0

    .line 108
    invoke-direct {v10, v8, v9, v12, v11}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    new-instance v9, Lcom/unity3d/services/core/webview/b;

    .line 112
    .line 113
    const/16 v11, 0xf

    .line 114
    .line 115
    invoke-direct {v9, v7, v11}, Lcom/unity3d/services/core/webview/b;-><init>(Ljava/lang/Object;I)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v10, v9}, LVa/X7;->n(Luc/b;)V

    .line 119
    .line 120
    .line 121
    new-instance v7, Lkd/r;

    .line 122
    .line 123
    invoke-direct {v7, p1, v4}, Lkd/r;-><init>(LC8/i;I)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {p1}, LC8/i;->q()Luc/n;

    .line 127
    .line 128
    .line 129
    move-result-object v9

    .line 130
    new-instance v10, LVa/X7;

    .line 131
    .line 132
    const-string v11, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.pigeon_defaultConstructor"

    .line 133
    .line 134
    invoke-direct {v10, v8, v9, v12, v11}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    new-instance v11, Lkd/J;

    .line 138
    .line 139
    invoke-direct {v11, v7, v6}, Lkd/J;-><init>(Lkd/r;I)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v10, v11}, LVa/X7;->n(Luc/b;)V

    .line 143
    .line 144
    .line 145
    new-instance v10, LVa/X7;

    .line 146
    .line 147
    const-string v11, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.setSynchronousReturnValueForShouldOverrideUrlLoading"

    .line 148
    .line 149
    invoke-direct {v10, v8, v9, v12, v11}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    new-instance v9, Lkd/J;

    .line 153
    .line 154
    invoke-direct {v9, v7, v5}, Lkd/J;-><init>(Lkd/r;I)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v10, v9}, LVa/X7;->n(Luc/b;)V

    .line 158
    .line 159
    .line 160
    new-instance v7, Lkd/o;

    .line 161
    .line 162
    invoke-direct {v7, p1, v6}, Lkd/o;-><init>(LC8/i;I)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {p1}, LC8/i;->q()Luc/n;

    .line 166
    .line 167
    .line 168
    move-result-object v9

    .line 169
    new-instance v10, LVa/X7;

    .line 170
    .line 171
    const-string v11, "dev.flutter.pigeon.webview_flutter_android.DownloadListener.pigeon_defaultConstructor"

    .line 172
    .line 173
    invoke-direct {v10, v8, v9, v12, v11}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    new-instance v9, Lcom/unity3d/services/core/webview/b;

    .line 177
    .line 178
    invoke-direct {v9, v7, v3}, Lcom/unity3d/services/core/webview/b;-><init>(Ljava/lang/Object;I)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v10, v9}, LVa/X7;->n(Luc/b;)V

    .line 182
    .line 183
    .line 184
    new-instance v7, Lkd/i;

    .line 185
    .line 186
    invoke-direct {v7, p1, v4}, Lkd/i;-><init>(LC8/i;I)V

    .line 187
    .line 188
    .line 189
    invoke-static {v8, v7}, Lvf/a;->M(Luc/f;Lkd/i;)V

    .line 190
    .line 191
    .line 192
    new-instance v7, Lkd/r;

    .line 193
    .line 194
    invoke-direct {v7, p1, v6}, Lkd/r;-><init>(LC8/i;I)V

    .line 195
    .line 196
    .line 197
    invoke-static {v8, v7}, Lka/e0;->x(Luc/f;Lkd/r;)V

    .line 198
    .line 199
    .line 200
    new-instance v7, Lkd/o;

    .line 201
    .line 202
    invoke-direct {v7, p1, v4}, Lkd/o;-><init>(LC8/i;I)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {p1}, LC8/i;->q()Luc/n;

    .line 206
    .line 207
    .line 208
    move-result-object v4

    .line 209
    new-instance v9, LVa/X7;

    .line 210
    .line 211
    const-string v10, "dev.flutter.pigeon.webview_flutter_android.WebStorage.instance"

    .line 212
    .line 213
    invoke-direct {v9, v8, v4, v12, v10}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    new-instance v10, Lcom/unity3d/services/core/webview/b;

    .line 217
    .line 218
    invoke-direct {v10, v7, v2}, Lcom/unity3d/services/core/webview/b;-><init>(Ljava/lang/Object;I)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v9, v10}, LVa/X7;->n(Luc/b;)V

    .line 222
    .line 223
    .line 224
    new-instance v9, LVa/X7;

    .line 225
    .line 226
    const-string v10, "dev.flutter.pigeon.webview_flutter_android.WebStorage.deleteAllData"

    .line 227
    .line 228
    invoke-direct {v9, v8, v4, v12, v10}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    new-instance v4, Lkd/D;

    .line 232
    .line 233
    invoke-direct {v4, v7, v1}, Lkd/D;-><init>(Ljava/lang/Object;I)V

    .line 234
    .line 235
    .line 236
    invoke-virtual {v9, v4}, LVa/X7;->n(Luc/b;)V

    .line 237
    .line 238
    .line 239
    new-instance v4, Lab/b;

    .line 240
    .line 241
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 242
    .line 243
    .line 244
    invoke-virtual {p1}, LC8/i;->q()Luc/n;

    .line 245
    .line 246
    .line 247
    move-result-object v7

    .line 248
    new-instance v9, LVa/X7;

    .line 249
    .line 250
    const-string v10, "dev.flutter.pigeon.webview_flutter_android.PermissionRequest.grant"

    .line 251
    .line 252
    invoke-direct {v9, v8, v7, v12, v10}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 253
    .line 254
    .line 255
    new-instance v10, Lk2/c;

    .line 256
    .line 257
    const/16 v11, 0x15

    .line 258
    .line 259
    invoke-direct {v10, v4, v11}, Lk2/c;-><init>(Ljava/lang/Object;I)V

    .line 260
    .line 261
    .line 262
    invoke-virtual {v9, v10}, LVa/X7;->n(Luc/b;)V

    .line 263
    .line 264
    .line 265
    new-instance v9, LVa/X7;

    .line 266
    .line 267
    const-string v10, "dev.flutter.pigeon.webview_flutter_android.PermissionRequest.deny"

    .line 268
    .line 269
    invoke-direct {v9, v8, v7, v12, v10}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 270
    .line 271
    .line 272
    new-instance v7, Lk2/c;

    .line 273
    .line 274
    invoke-direct {v7, v4, v0}, Lk2/c;-><init>(Ljava/lang/Object;I)V

    .line 275
    .line 276
    .line 277
    invoke-virtual {v9, v7}, LVa/X7;->n(Luc/b;)V

    .line 278
    .line 279
    .line 280
    new-instance v4, Lae/b;

    .line 281
    .line 282
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 283
    .line 284
    .line 285
    invoke-virtual {p1}, LC8/i;->q()Luc/n;

    .line 286
    .line 287
    .line 288
    move-result-object v7

    .line 289
    new-instance v9, LVa/X7;

    .line 290
    .line 291
    const-string v10, "dev.flutter.pigeon.webview_flutter_android.CustomViewCallback.onCustomViewHidden"

    .line 292
    .line 293
    invoke-direct {v9, v8, v7, v12, v10}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 294
    .line 295
    .line 296
    new-instance v7, Lk2/c;

    .line 297
    .line 298
    const/16 v10, 0xc

    .line 299
    .line 300
    invoke-direct {v7, v4, v10}, Lk2/c;-><init>(Ljava/lang/Object;I)V

    .line 301
    .line 302
    .line 303
    invoke-virtual {v9, v7}, LVa/X7;->n(Luc/b;)V

    .line 304
    .line 305
    .line 306
    new-instance v4, Lkd/s;

    .line 307
    .line 308
    invoke-direct {v4, p1, v5}, Lkd/s;-><init>(LC8/i;I)V

    .line 309
    .line 310
    .line 311
    invoke-static {v8, v4}, Ltg/b;->Q(Luc/f;Lkd/s;)V

    .line 312
    .line 313
    .line 314
    new-instance v4, Landroidx/fragment/app/X;

    .line 315
    .line 316
    const/16 v7, 0x8

    .line 317
    .line 318
    invoke-direct {v4, v7}, Landroidx/fragment/app/X;-><init>(I)V

    .line 319
    .line 320
    .line 321
    invoke-virtual {p1}, LC8/i;->q()Luc/n;

    .line 322
    .line 323
    .line 324
    move-result-object v7

    .line 325
    new-instance v9, LVa/X7;

    .line 326
    .line 327
    const-string v10, "dev.flutter.pigeon.webview_flutter_android.GeolocationPermissionsCallback.invoke"

    .line 328
    .line 329
    invoke-direct {v9, v8, v7, v12, v10}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 330
    .line 331
    .line 332
    new-instance v7, Lk2/c;

    .line 333
    .line 334
    invoke-direct {v7, v4, v2}, Lk2/c;-><init>(Ljava/lang/Object;I)V

    .line 335
    .line 336
    .line 337
    invoke-virtual {v9, v7}, LVa/X7;->n(Luc/b;)V

    .line 338
    .line 339
    .line 340
    new-instance v2, Lkd/s;

    .line 341
    .line 342
    invoke-direct {v2, p1, v6}, Lkd/s;-><init>(LC8/i;I)V

    .line 343
    .line 344
    .line 345
    invoke-static {v8, v2}, Lp7/b;->Q(Luc/f;Lkd/s;)V

    .line 346
    .line 347
    .line 348
    new-instance v2, La2/k;

    .line 349
    .line 350
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 351
    .line 352
    .line 353
    invoke-virtual {p1}, LC8/i;->q()Luc/n;

    .line 354
    .line 355
    .line 356
    move-result-object v4

    .line 357
    new-instance v7, LVa/X7;

    .line 358
    .line 359
    const-string v9, "dev.flutter.pigeon.webview_flutter_android.AndroidMessage.sendToTarget"

    .line 360
    .line 361
    invoke-direct {v7, v8, v4, v12, v9}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 362
    .line 363
    .line 364
    new-instance v4, Lk2/c;

    .line 365
    .line 366
    const/4 v9, 0x5

    .line 367
    invoke-direct {v4, v2, v9}, Lk2/c;-><init>(Ljava/lang/Object;I)V

    .line 368
    .line 369
    .line 370
    invoke-virtual {v7, v4}, LVa/X7;->n(Luc/b;)V

    .line 371
    .line 372
    .line 373
    new-instance v2, Lkd/i;

    .line 374
    .line 375
    invoke-direct {v2, p1, v6}, Lkd/i;-><init>(LC8/i;I)V

    .line 376
    .line 377
    .line 378
    invoke-static {v8, v2}, Lgc/b;->L(Luc/f;Lkd/i;)V

    .line 379
    .line 380
    .line 381
    new-instance v2, Lad/r;

    .line 382
    .line 383
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 384
    .line 385
    .line 386
    invoke-virtual {p1}, LC8/i;->q()Luc/n;

    .line 387
    .line 388
    .line 389
    move-result-object v4

    .line 390
    new-instance v7, LVa/X7;

    .line 391
    .line 392
    const-string v9, "dev.flutter.pigeon.webview_flutter_android.SslErrorHandler.cancel"

    .line 393
    .line 394
    invoke-direct {v7, v8, v4, v12, v9}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 395
    .line 396
    .line 397
    new-instance v9, Lk2/c;

    .line 398
    .line 399
    const/16 v10, 0x1d

    .line 400
    .line 401
    invoke-direct {v9, v2, v10}, Lk2/c;-><init>(Ljava/lang/Object;I)V

    .line 402
    .line 403
    .line 404
    invoke-virtual {v7, v9}, LVa/X7;->n(Luc/b;)V

    .line 405
    .line 406
    .line 407
    new-instance v7, LVa/X7;

    .line 408
    .line 409
    const-string v9, "dev.flutter.pigeon.webview_flutter_android.SslErrorHandler.proceed"

    .line 410
    .line 411
    invoke-direct {v7, v8, v4, v12, v9}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 412
    .line 413
    .line 414
    new-instance v4, Lkd/D;

    .line 415
    .line 416
    invoke-direct {v4, v2, v6}, Lkd/D;-><init>(Ljava/lang/Object;I)V

    .line 417
    .line 418
    .line 419
    invoke-virtual {v7, v4}, LVa/X7;->n(Luc/b;)V

    .line 420
    .line 421
    .line 422
    new-instance v2, Lkd/r;

    .line 423
    .line 424
    invoke-direct {v2, p1, v5}, Lkd/r;-><init>(LC8/i;I)V

    .line 425
    .line 426
    .line 427
    invoke-virtual {p1}, LC8/i;->q()Luc/n;

    .line 428
    .line 429
    .line 430
    move-result-object v4

    .line 431
    new-instance v6, LVa/X7;

    .line 432
    .line 433
    const-string v7, "dev.flutter.pigeon.webview_flutter_android.SslError.getPrimaryError"

    .line 434
    .line 435
    invoke-direct {v6, v8, v4, v12, v7}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 436
    .line 437
    .line 438
    new-instance v7, Lk2/c;

    .line 439
    .line 440
    const/16 v9, 0x1b

    .line 441
    .line 442
    invoke-direct {v7, v2, v9}, Lk2/c;-><init>(Ljava/lang/Object;I)V

    .line 443
    .line 444
    .line 445
    invoke-virtual {v6, v7}, LVa/X7;->n(Luc/b;)V

    .line 446
    .line 447
    .line 448
    new-instance v6, LVa/X7;

    .line 449
    .line 450
    const-string v7, "dev.flutter.pigeon.webview_flutter_android.SslError.hasError"

    .line 451
    .line 452
    invoke-direct {v6, v8, v4, v12, v7}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 453
    .line 454
    .line 455
    new-instance v4, Lcom/unity3d/services/core/webview/b;

    .line 456
    .line 457
    invoke-direct {v4, v2, v1}, Lcom/unity3d/services/core/webview/b;-><init>(Ljava/lang/Object;I)V

    .line 458
    .line 459
    .line 460
    invoke-virtual {v6, v4}, LVa/X7;->n(Luc/b;)V

    .line 461
    .line 462
    .line 463
    new-instance v1, Lkd/l;

    .line 464
    .line 465
    invoke-direct {v1, p1, v5}, Lkd/l;-><init>(LC8/i;I)V

    .line 466
    .line 467
    .line 468
    invoke-static {v8, v1}, Lff/B;->K(Luc/f;Lkd/l;)V

    .line 469
    .line 470
    .line 471
    new-instance v1, Lkd/o;

    .line 472
    .line 473
    invoke-direct {v1, p1, v5}, Lkd/o;-><init>(LC8/i;I)V

    .line 474
    .line 475
    .line 476
    invoke-static {v8, v1}, Lr7/e;->N(Luc/f;Lkd/o;)V

    .line 477
    .line 478
    .line 479
    new-instance v1, Lad/r;

    .line 480
    .line 481
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 482
    .line 483
    .line 484
    invoke-virtual {p1}, LC8/i;->q()Luc/n;

    .line 485
    .line 486
    .line 487
    move-result-object v2

    .line 488
    new-instance v4, LVa/X7;

    .line 489
    .line 490
    const-string v5, "dev.flutter.pigeon.webview_flutter_android.Certificate.getEncoded"

    .line 491
    .line 492
    invoke-direct {v4, v8, v2, v12, v5}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 493
    .line 494
    .line 495
    new-instance v2, Lk2/c;

    .line 496
    .line 497
    const/4 v5, 0x7

    .line 498
    invoke-direct {v2, v1, v5}, Lk2/c;-><init>(Ljava/lang/Object;I)V

    .line 499
    .line 500
    .line 501
    invoke-virtual {v4, v2}, LVa/X7;->n(Luc/b;)V

    .line 502
    .line 503
    .line 504
    new-instance v1, Lae/b;

    .line 505
    .line 506
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 507
    .line 508
    .line 509
    invoke-virtual {p1}, LC8/i;->q()Luc/n;

    .line 510
    .line 511
    .line 512
    move-result-object v2

    .line 513
    new-instance v4, LVa/X7;

    .line 514
    .line 515
    const-string v5, "dev.flutter.pigeon.webview_flutter_android.WebSettingsCompat.setPaymentRequestEnabled"

    .line 516
    .line 517
    invoke-direct {v4, v8, v2, v12, v5}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 518
    .line 519
    .line 520
    new-instance v2, Lkd/D;

    .line 521
    .line 522
    invoke-direct {v2, v1, v3}, Lkd/D;-><init>(Ljava/lang/Object;I)V

    .line 523
    .line 524
    .line 525
    invoke-virtual {v4, v2}, LVa/X7;->n(Luc/b;)V

    .line 526
    .line 527
    .line 528
    new-instance v1, Lae/d;

    .line 529
    .line 530
    const/16 v2, 0x9

    .line 531
    .line 532
    invoke-direct {v1, v2}, Lae/d;-><init>(I)V

    .line 533
    .line 534
    .line 535
    invoke-virtual {p1}, LC8/i;->q()Luc/n;

    .line 536
    .line 537
    .line 538
    move-result-object p1

    .line 539
    new-instance v2, LVa/X7;

    .line 540
    .line 541
    const-string v3, "dev.flutter.pigeon.webview_flutter_android.WebViewFeature.isFeatureSupported"

    .line 542
    .line 543
    invoke-direct {v2, v8, p1, v12, v3}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 544
    .line 545
    .line 546
    new-instance p1, Lkd/D;

    .line 547
    .line 548
    invoke-direct {p1, v1, v0}, Lkd/D;-><init>(Ljava/lang/Object;I)V

    .line 549
    .line 550
    .line 551
    invoke-virtual {v2, p1}, LVa/X7;->n(Luc/b;)V

    .line 552
    .line 553
    .line 554
    return-void
.end method

.method public final onDetachedFromActivity()V
    .locals 2

    .line 1
    iget-object v0, p0, Lkd/X;->b:LC8/i;

    .line 2
    .line 3
    iget-object v1, p0, Lkd/X;->a:Lqc/a;

    .line 4
    .line 5
    iget-object v1, v1, Lqc/a;->a:Landroid/content/Context;

    .line 6
    .line 7
    iput-object v1, v0, LC8/i;->b:Ljava/lang/Object;

    .line 8
    .line 9
    return-void
.end method

.method public final onDetachedFromActivityForConfigChanges()V
    .locals 2

    .line 1
    iget-object v0, p0, Lkd/X;->b:LC8/i;

    .line 2
    .line 3
    iget-object v1, p0, Lkd/X;->a:Lqc/a;

    .line 4
    .line 5
    iget-object v1, v1, Lqc/a;->a:Landroid/content/Context;

    .line 6
    .line 7
    iput-object v1, v0, LC8/i;->b:Ljava/lang/Object;

    .line 8
    .line 9
    return-void
.end method

.method public final onDetachedFromEngine(Lqc/a;)V
    .locals 4

    .line 1
    iget-object p1, p0, Lkd/X;->b:LC8/i;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    sget-object v0, Lkd/f;->b:Lef/p;

    .line 6
    .line 7
    iget-object p1, p1, LC8/i;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p1, Luc/f;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-static {p1, v0}, Landroid/support/v4/media/session/b;->q0(Luc/f;Lkd/d;)V

    .line 13
    .line 14
    .line 15
    invoke-static {p1, v0}, Lic/d;->M(Luc/f;Lkd/l;)V

    .line 16
    .line 17
    .line 18
    invoke-static {p1, v0}, LA6/c;->M(Luc/f;Lkd/s;)V

    .line 19
    .line 20
    .line 21
    invoke-static {p1, v0}, Lxg/g;->T(Luc/f;Lkd/l;)V

    .line 22
    .line 23
    .line 24
    new-instance v1, Lkd/b;

    .line 25
    .line 26
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 27
    .line 28
    .line 29
    new-instance v2, LVa/X7;

    .line 30
    .line 31
    const-string v3, "dev.flutter.pigeon.webview_flutter_android.JavaScriptChannel.pigeon_defaultConstructor"

    .line 32
    .line 33
    invoke-direct {v2, p1, v1, v0, v3}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2, v0}, LVa/X7;->n(Luc/b;)V

    .line 37
    .line 38
    .line 39
    new-instance v1, Lkd/b;

    .line 40
    .line 41
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 42
    .line 43
    .line 44
    new-instance v2, LVa/X7;

    .line 45
    .line 46
    const-string v3, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.pigeon_defaultConstructor"

    .line 47
    .line 48
    invoke-direct {v2, p1, v1, v0, v3}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v2, v0}, LVa/X7;->n(Luc/b;)V

    .line 52
    .line 53
    .line 54
    new-instance v2, LVa/X7;

    .line 55
    .line 56
    const-string v3, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.setSynchronousReturnValueForShouldOverrideUrlLoading"

    .line 57
    .line 58
    invoke-direct {v2, p1, v1, v0, v3}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v2, v0}, LVa/X7;->n(Luc/b;)V

    .line 62
    .line 63
    .line 64
    new-instance v1, Lkd/b;

    .line 65
    .line 66
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 67
    .line 68
    .line 69
    new-instance v2, LVa/X7;

    .line 70
    .line 71
    const-string v3, "dev.flutter.pigeon.webview_flutter_android.DownloadListener.pigeon_defaultConstructor"

    .line 72
    .line 73
    invoke-direct {v2, p1, v1, v0, v3}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v0}, LVa/X7;->n(Luc/b;)V

    .line 77
    .line 78
    .line 79
    invoke-static {p1, v0}, Lvf/a;->M(Luc/f;Lkd/i;)V

    .line 80
    .line 81
    .line 82
    invoke-static {p1, v0}, Lka/e0;->x(Luc/f;Lkd/r;)V

    .line 83
    .line 84
    .line 85
    new-instance v1, Lkd/b;

    .line 86
    .line 87
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 88
    .line 89
    .line 90
    new-instance v2, LVa/X7;

    .line 91
    .line 92
    const-string v3, "dev.flutter.pigeon.webview_flutter_android.WebStorage.instance"

    .line 93
    .line 94
    invoke-direct {v2, p1, v1, v0, v3}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v2, v0}, LVa/X7;->n(Luc/b;)V

    .line 98
    .line 99
    .line 100
    new-instance v2, LVa/X7;

    .line 101
    .line 102
    const-string v3, "dev.flutter.pigeon.webview_flutter_android.WebStorage.deleteAllData"

    .line 103
    .line 104
    invoke-direct {v2, p1, v1, v0, v3}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v2, v0}, LVa/X7;->n(Luc/b;)V

    .line 108
    .line 109
    .line 110
    new-instance v1, Lkd/b;

    .line 111
    .line 112
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 113
    .line 114
    .line 115
    new-instance v2, LVa/X7;

    .line 116
    .line 117
    const-string v3, "dev.flutter.pigeon.webview_flutter_android.PermissionRequest.grant"

    .line 118
    .line 119
    invoke-direct {v2, p1, v1, v0, v3}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v2, v0}, LVa/X7;->n(Luc/b;)V

    .line 123
    .line 124
    .line 125
    new-instance v2, LVa/X7;

    .line 126
    .line 127
    const-string v3, "dev.flutter.pigeon.webview_flutter_android.PermissionRequest.deny"

    .line 128
    .line 129
    invoke-direct {v2, p1, v1, v0, v3}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v2, v0}, LVa/X7;->n(Luc/b;)V

    .line 133
    .line 134
    .line 135
    new-instance v1, Lkd/b;

    .line 136
    .line 137
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 138
    .line 139
    .line 140
    new-instance v2, LVa/X7;

    .line 141
    .line 142
    const-string v3, "dev.flutter.pigeon.webview_flutter_android.CustomViewCallback.onCustomViewHidden"

    .line 143
    .line 144
    invoke-direct {v2, p1, v1, v0, v3}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v2, v0}, LVa/X7;->n(Luc/b;)V

    .line 148
    .line 149
    .line 150
    invoke-static {p1, v0}, Ltg/b;->Q(Luc/f;Lkd/s;)V

    .line 151
    .line 152
    .line 153
    new-instance v1, Lkd/b;

    .line 154
    .line 155
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 156
    .line 157
    .line 158
    new-instance v2, LVa/X7;

    .line 159
    .line 160
    const-string v3, "dev.flutter.pigeon.webview_flutter_android.GeolocationPermissionsCallback.invoke"

    .line 161
    .line 162
    invoke-direct {v2, p1, v1, v0, v3}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v2, v0}, LVa/X7;->n(Luc/b;)V

    .line 166
    .line 167
    .line 168
    invoke-static {p1, v0}, Lp7/b;->Q(Luc/f;Lkd/s;)V

    .line 169
    .line 170
    .line 171
    new-instance v1, Lkd/b;

    .line 172
    .line 173
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 174
    .line 175
    .line 176
    new-instance v2, LVa/X7;

    .line 177
    .line 178
    const-string v3, "dev.flutter.pigeon.webview_flutter_android.AndroidMessage.sendToTarget"

    .line 179
    .line 180
    invoke-direct {v2, p1, v1, v0, v3}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v2, v0}, LVa/X7;->n(Luc/b;)V

    .line 184
    .line 185
    .line 186
    invoke-static {p1, v0}, Lgc/b;->L(Luc/f;Lkd/i;)V

    .line 187
    .line 188
    .line 189
    new-instance v1, Lkd/b;

    .line 190
    .line 191
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 192
    .line 193
    .line 194
    new-instance v2, LVa/X7;

    .line 195
    .line 196
    const-string v3, "dev.flutter.pigeon.webview_flutter_android.SslErrorHandler.cancel"

    .line 197
    .line 198
    invoke-direct {v2, p1, v1, v0, v3}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v2, v0}, LVa/X7;->n(Luc/b;)V

    .line 202
    .line 203
    .line 204
    new-instance v2, LVa/X7;

    .line 205
    .line 206
    const-string v3, "dev.flutter.pigeon.webview_flutter_android.SslErrorHandler.proceed"

    .line 207
    .line 208
    invoke-direct {v2, p1, v1, v0, v3}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v2, v0}, LVa/X7;->n(Luc/b;)V

    .line 212
    .line 213
    .line 214
    new-instance v1, Lkd/b;

    .line 215
    .line 216
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 217
    .line 218
    .line 219
    new-instance v2, LVa/X7;

    .line 220
    .line 221
    const-string v3, "dev.flutter.pigeon.webview_flutter_android.SslError.getPrimaryError"

    .line 222
    .line 223
    invoke-direct {v2, p1, v1, v0, v3}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v2, v0}, LVa/X7;->n(Luc/b;)V

    .line 227
    .line 228
    .line 229
    new-instance v2, LVa/X7;

    .line 230
    .line 231
    const-string v3, "dev.flutter.pigeon.webview_flutter_android.SslError.hasError"

    .line 232
    .line 233
    invoke-direct {v2, p1, v1, v0, v3}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    invoke-virtual {v2, v0}, LVa/X7;->n(Luc/b;)V

    .line 237
    .line 238
    .line 239
    invoke-static {p1, v0}, Lff/B;->K(Luc/f;Lkd/l;)V

    .line 240
    .line 241
    .line 242
    invoke-static {p1, v0}, Lr7/e;->N(Luc/f;Lkd/o;)V

    .line 243
    .line 244
    .line 245
    new-instance v1, Lkd/b;

    .line 246
    .line 247
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 248
    .line 249
    .line 250
    new-instance v2, LVa/X7;

    .line 251
    .line 252
    const-string v3, "dev.flutter.pigeon.webview_flutter_android.Certificate.getEncoded"

    .line 253
    .line 254
    invoke-direct {v2, p1, v1, v0, v3}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v2, v0}, LVa/X7;->n(Luc/b;)V

    .line 258
    .line 259
    .line 260
    new-instance v1, Lkd/b;

    .line 261
    .line 262
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 263
    .line 264
    .line 265
    new-instance v2, LVa/X7;

    .line 266
    .line 267
    const-string v3, "dev.flutter.pigeon.webview_flutter_android.WebSettingsCompat.setPaymentRequestEnabled"

    .line 268
    .line 269
    invoke-direct {v2, p1, v1, v0, v3}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {v2, v0}, LVa/X7;->n(Luc/b;)V

    .line 273
    .line 274
    .line 275
    new-instance v1, Lkd/b;

    .line 276
    .line 277
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 278
    .line 279
    .line 280
    new-instance v2, LVa/X7;

    .line 281
    .line 282
    const-string v3, "dev.flutter.pigeon.webview_flutter_android.WebViewFeature.isFeatureSupported"

    .line 283
    .line 284
    invoke-direct {v2, p1, v1, v0, v3}, LVa/X7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v2, v0}, LVa/X7;->n(Luc/b;)V

    .line 288
    .line 289
    .line 290
    iget-object p1, p0, Lkd/X;->b:LC8/i;

    .line 291
    .line 292
    iget-object p1, p1, LC8/i;->d:Ljava/lang/Object;

    .line 293
    .line 294
    check-cast p1, Lkd/d;

    .line 295
    .line 296
    iget-object v1, p1, Lkd/d;->g:Landroid/os/Handler;

    .line 297
    .line 298
    iget-object v2, p1, Lkd/d;->h:Lkd/c;

    .line 299
    .line 300
    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 301
    .line 302
    .line 303
    const/4 v1, 0x1

    .line 304
    iput-boolean v1, p1, Lkd/d;->j:Z

    .line 305
    .line 306
    iput-object v0, p0, Lkd/X;->b:LC8/i;

    .line 307
    .line 308
    :cond_0
    return-void
.end method

.method public final onReattachedToActivityForConfigChanges(Lrc/b;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lkd/X;->b:LC8/i;

    .line 2
    .line 3
    check-cast p1, Lq/s1;

    .line 4
    .line 5
    iget-object p1, p1, Lq/s1;->a:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p1, Landroid/app/Activity;

    .line 8
    .line 9
    iput-object p1, v0, LC8/i;->b:Ljava/lang/Object;

    .line 10
    .line 11
    return-void
.end method
