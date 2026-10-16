.class public final LA7/y0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, LA7/y0;->a:I

    iput-object p3, p0, LA7/y0;->c:Ljava/lang/Object;

    iput-object p2, p0, LA7/y0;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ZLjava/lang/Object;I)V
    .locals 0

    .line 2
    iput p4, p0, LA7/y0;->a:I

    iput-object p1, p0, LA7/y0;->c:Ljava/lang/Object;

    iput-object p3, p0, LA7/y0;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 8

    .line 1
    const/16 v0, 0x64

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    iget-object v3, p0, LA7/y0;->b:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v4, p0, LA7/y0;->c:Ljava/lang/Object;

    .line 8
    .line 9
    iget v5, p0, LA7/y0;->a:I

    .line 10
    .line 11
    packed-switch v5, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast v4, Landroid/content/Context;

    .line 15
    .line 16
    check-cast v3, Loc/d;

    .line 17
    .line 18
    const-string v0, "contains the following files: "

    .line 19
    .line 20
    const-string v5, "Could not load libflutter.so this is possibly because the application is running on an architecture that Flutter Android does not support (e.g. x86) see https://docs.flutter.dev/deployment/android#what-are-the-supported-target-architectures for more detail.\nApp is using cpu architecture: "

    .line 21
    .line 22
    const-string v6, "FlutterLoader initTask"

    .line 23
    .line 24
    invoke-static {v6}, Lld/a;->b(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    :try_start_0
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    .line 29
    .line 30
    iget-object v6, v3, Loc/d;->e:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v6, Lio/flutter/embedding/engine/FlutterJNI;

    .line 33
    .line 34
    :try_start_1
    invoke-virtual {v6, v4}, Lio/flutter/embedding/engine/FlutterJNI;->loadLibrary(Landroid/content/Context;)V
    :try_end_1
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 35
    .line 36
    .line 37
    :try_start_2
    invoke-virtual {v6}, Lio/flutter/embedding/engine/FlutterJNI;->updateRefreshRate()V

    .line 38
    .line 39
    .line 40
    iget-object v0, v3, Loc/d;->f:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v0, Ljava/util/concurrent/ExecutorService;

    .line 43
    .line 44
    new-instance v3, Lkd/c;

    .line 45
    .line 46
    invoke-direct {v3, p0, v2}, Lkd/c;-><init>(Ljava/lang/Object;I)V

    .line 47
    .line 48
    .line 49
    invoke-interface {v0, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 50
    .line 51
    .line 52
    new-instance v0, Loc/c;

    .line 53
    .line 54
    invoke-virtual {v4}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    if-nez v2, :cond_0

    .line 59
    .line 60
    new-instance v2, Ljava/io/File;

    .line 61
    .line 62
    invoke-static {v4}, LFe/g;->A(Landroid/content/Context;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    const-string v5, "files"

    .line 67
    .line 68
    invoke-direct {v2, v3, v5}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    :cond_0
    invoke-virtual {v2}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    invoke-virtual {v4}, Landroid/content/Context;->getCodeCacheDir()Ljava/io/File;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    if-nez v3, :cond_1

    .line 80
    .line 81
    invoke-virtual {v4}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    :cond_1
    if-nez v3, :cond_2

    .line 86
    .line 87
    new-instance v3, Ljava/io/File;

    .line 88
    .line 89
    invoke-static {v4}, LFe/g;->A(Landroid/content/Context;)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    const-string v6, "cache"

    .line 94
    .line 95
    invoke-direct {v3, v5, v6}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    :cond_2
    invoke-virtual {v3}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    const-string v5, "flutter"

    .line 103
    .line 104
    invoke-virtual {v4, v5, v1}, Landroid/content/Context;->getDir(Ljava/lang/String;I)Ljava/io/File;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    if-nez v1, :cond_3

    .line 109
    .line 110
    new-instance v1, Ljava/io/File;

    .line 111
    .line 112
    invoke-static {v4}, LFe/g;->A(Landroid/content/Context;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v4

    .line 116
    const-string v5, "app_flutter"

    .line 117
    .line 118
    invoke-direct {v1, v4, v5}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    :cond_3
    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    invoke-direct {v0, v2, v3}, Loc/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 125
    .line 126
    .line 127
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 128
    .line 129
    .line 130
    return-object v0

    .line 131
    :catchall_0
    move-exception v0

    .line 132
    goto :goto_2

    .line 133
    :catch_0
    move-exception v1

    .line 134
    :try_start_3
    const-string v2, "couldn\'t find \"libflutter.so\""

    .line 135
    .line 136
    const-string v4, "dlopen failed: library \"libflutter.so\" not found"

    .line 137
    .line 138
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v6

    .line 142
    invoke-virtual {v6, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 143
    .line 144
    .line 145
    move-result v2

    .line 146
    if-nez v2, :cond_5

    .line 147
    .line 148
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v2

    .line 152
    invoke-virtual {v2, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 153
    .line 154
    .line 155
    move-result v2

    .line 156
    if-eqz v2, :cond_4

    .line 157
    .line 158
    goto :goto_0

    .line 159
    :cond_4
    throw v1

    .line 160
    :cond_5
    :goto_0
    const-string v2, "os.arch"

    .line 161
    .line 162
    invoke-static {v2}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v2

    .line 166
    new-instance v4, Ljava/io/File;

    .line 167
    .line 168
    iget-object v3, v3, Loc/d;->d:Ljava/lang/Object;

    .line 169
    .line 170
    check-cast v3, LM/y;

    .line 171
    .line 172
    iget-object v3, v3, LM/y;->e:Ljava/lang/Object;

    .line 173
    .line 174
    check-cast v3, Ljava/lang/String;

    .line 175
    .line 176
    invoke-direct {v4, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v4}, Ljava/io/File;->list()[Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v3

    .line 183
    new-instance v6, Ljava/lang/UnsupportedOperationException;

    .line 184
    .line 185
    new-instance v7, Ljava/lang/StringBuilder;

    .line 186
    .line 187
    invoke-direct {v7, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    .line 193
    const-string v2, ", and the native libraries directory (with path "

    .line 194
    .line 195
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v2

    .line 202
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    const-string v2, ") "

    .line 206
    .line 207
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 208
    .line 209
    .line 210
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    .line 211
    .line 212
    .line 213
    move-result v2

    .line 214
    if-eqz v2, :cond_6

    .line 215
    .line 216
    new-instance v2, Ljava/lang/StringBuilder;

    .line 217
    .line 218
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    invoke-static {v3}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 226
    .line 227
    .line 228
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    goto :goto_1

    .line 233
    :cond_6
    const-string v0, "does not exist."

    .line 234
    .line 235
    :goto_1
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 236
    .line 237
    .line 238
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    invoke-direct {v6, v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 243
    .line 244
    .line 245
    throw v6
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 246
    :goto_2
    :try_start_4
    invoke-static {}, Landroid/os/Trace;->endSection()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 247
    .line 248
    .line 249
    goto :goto_3

    .line 250
    :catchall_1
    move-exception v1

    .line 251
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 252
    .line 253
    .line 254
    :goto_3
    throw v0

    .line 255
    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 256
    .line 257
    const-string v5, "DELETE FROM events WHERE id IN ("

    .line 258
    .line 259
    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    check-cast v4, Ljava/util/ArrayList;

    .line 263
    .line 264
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 265
    .line 266
    .line 267
    move-result v5

    .line 268
    :goto_4
    if-ge v1, v5, :cond_8

    .line 269
    .line 270
    const-string v6, "?"

    .line 271
    .line 272
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 273
    .line 274
    .line 275
    add-int/lit8 v6, v5, -0x1

    .line 276
    .line 277
    if-ge v1, v6, :cond_7

    .line 278
    .line 279
    const-string v6, ","

    .line 280
    .line 281
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 282
    .line 283
    .line 284
    :cond_7
    add-int/2addr v1, v2

    .line 285
    goto :goto_4

    .line 286
    :cond_8
    const-string v1, ")"

    .line 287
    .line 288
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 289
    .line 290
    .line 291
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v0

    .line 295
    check-cast v3, Lcom/moloco/sdk/acm/db/e;

    .line 296
    .line 297
    iget-object v1, v3, Lcom/moloco/sdk/acm/db/e;->a:Lcom/moloco/sdk/acm/db/MetricsDb_Impl;

    .line 298
    .line 299
    const-string v3, "sql"

    .line 300
    .line 301
    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 302
    .line 303
    .line 304
    invoke-virtual {v1}, Lk3/m;->a()V

    .line 305
    .line 306
    .line 307
    invoke-virtual {v1}, Lk3/m;->b()V

    .line 308
    .line 309
    .line 310
    invoke-virtual {v1}, Lk3/m;->g()Lo3/d;

    .line 311
    .line 312
    .line 313
    move-result-object v3

    .line 314
    invoke-interface {v3}, Lo3/d;->I()Lo3/a;

    .line 315
    .line 316
    .line 317
    move-result-object v3

    .line 318
    invoke-interface {v3, v0}, Lo3/a;->A(Ljava/lang/String;)Lo3/g;

    .line 319
    .line 320
    .line 321
    move-result-object v0

    .line 322
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 323
    .line 324
    .line 325
    move-result-object v3

    .line 326
    move v4, v2

    .line 327
    :goto_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 328
    .line 329
    .line 330
    move-result v5

    .line 331
    if-eqz v5, :cond_9

    .line 332
    .line 333
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    move-result-object v5

    .line 337
    check-cast v5, Ljava/lang/Long;

    .line 338
    .line 339
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 340
    .line 341
    .line 342
    move-result-wide v5

    .line 343
    invoke-interface {v0, v4, v5, v6}, Lo3/e;->G(IJ)V

    .line 344
    .line 345
    .line 346
    add-int/2addr v4, v2

    .line 347
    goto :goto_5

    .line 348
    :cond_9
    invoke-virtual {v1}, Lk3/m;->c()V

    .line 349
    .line 350
    .line 351
    :try_start_5
    invoke-interface {v0}, Lo3/g;->g()I

    .line 352
    .line 353
    .line 354
    invoke-virtual {v1}, Lk3/m;->n()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 355
    .line 356
    .line 357
    invoke-virtual {v1}, Lk3/m;->j()V

    .line 358
    .line 359
    .line 360
    sget-object v0, Lef/C;->a:Lef/C;

    .line 361
    .line 362
    return-object v0

    .line 363
    :catchall_2
    move-exception v0

    .line 364
    invoke-virtual {v1}, Lk3/m;->j()V

    .line 365
    .line 366
    .line 367
    throw v0

    .line 368
    :pswitch_1
    check-cast v4, LN6/a;

    .line 369
    .line 370
    check-cast v3, Ljava/lang/String;

    .line 371
    .line 372
    invoke-virtual {v4, v3}, LN6/a;->getClickSignals(Ljava/lang/String;)Ljava/lang/String;

    .line 373
    .line 374
    .line 375
    move-result-object v0

    .line 376
    return-object v0

    .line 377
    :pswitch_2
    sget-object v5, LG6/U;->l:LG6/M;

    .line 378
    .line 379
    check-cast v3, Landroid/content/Context;

    .line 380
    .line 381
    const-string v5, "com.google.android.gms.ads.db"

    .line 382
    .line 383
    invoke-virtual {v3, v5}, Landroid/content/Context;->getDatabasePath(Ljava/lang/String;)Ljava/io/File;

    .line 384
    .line 385
    .line 386
    move-result-object v3

    .line 387
    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 388
    .line 389
    .line 390
    move-result-object v3

    .line 391
    check-cast v4, Landroid/webkit/WebSettings;

    .line 392
    .line 393
    invoke-virtual {v4, v3}, Landroid/webkit/WebSettings;->setDatabasePath(Ljava/lang/String;)V

    .line 394
    .line 395
    .line 396
    invoke-virtual {v4, v2}, Landroid/webkit/WebSettings;->setDatabaseEnabled(Z)V

    .line 397
    .line 398
    .line 399
    invoke-virtual {v4, v2}, Landroid/webkit/WebSettings;->setDomStorageEnabled(Z)V

    .line 400
    .line 401
    .line 402
    invoke-virtual {v4, v1}, Landroid/webkit/WebSettings;->setDisplayZoomControls(Z)V

    .line 403
    .line 404
    .line 405
    invoke-virtual {v4, v2}, Landroid/webkit/WebSettings;->setBuiltInZoomControls(Z)V

    .line 406
    .line 407
    .line 408
    invoke-virtual {v4, v2}, Landroid/webkit/WebSettings;->setSupportZoom(Z)V

    .line 409
    .line 410
    .line 411
    sget-object v2, Lcom/google/android/gms/internal/ads/zzbix;->zzbB:Lcom/google/android/gms/internal/ads/zzbio;

    .line 412
    .line 413
    sget-object v3, LD6/s;->e:LD6/s;

    .line 414
    .line 415
    iget-object v3, v3, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 416
    .line 417
    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 418
    .line 419
    .line 420
    move-result-object v2

    .line 421
    check-cast v2, Ljava/lang/Boolean;

    .line 422
    .line 423
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 424
    .line 425
    .line 426
    move-result v2

    .line 427
    if-eqz v2, :cond_a

    .line 428
    .line 429
    invoke-virtual {v4, v0}, Landroid/webkit/WebSettings;->setTextZoom(I)V

    .line 430
    .line 431
    .line 432
    :cond_a
    invoke-virtual {v4, v1}, Landroid/webkit/WebSettings;->setAllowContentAccess(Z)V

    .line 433
    .line 434
    .line 435
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 436
    .line 437
    return-object v0

    .line 438
    :pswitch_3
    const-string v0, "admob_user_agent"

    .line 439
    .line 440
    check-cast v4, Landroid/content/Context;

    .line 441
    .line 442
    check-cast v3, Landroid/content/Context;

    .line 443
    .line 444
    if-eqz v4, :cond_b

    .line 445
    .line 446
    const-string v2, "Attempting to read user agent from Google Play Services."

    .line 447
    .line 448
    invoke-static {v2}, LG6/L;->k(Ljava/lang/String;)V

    .line 449
    .line 450
    .line 451
    invoke-virtual {v4, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 452
    .line 453
    .line 454
    move-result-object v0

    .line 455
    goto :goto_6

    .line 456
    :cond_b
    const-string v4, "Attempting to read user agent from local cache."

    .line 457
    .line 458
    invoke-static {v4}, LG6/L;->k(Ljava/lang/String;)V

    .line 459
    .line 460
    .line 461
    invoke-virtual {v3, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 462
    .line 463
    .line 464
    move-result-object v0

    .line 465
    move v1, v2

    .line 466
    :goto_6
    const-string v2, ""

    .line 467
    .line 468
    const-string v4, "user_agent"

    .line 469
    .line 470
    invoke-interface {v0, v4, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 471
    .line 472
    .line 473
    move-result-object v2

    .line 474
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 475
    .line 476
    .line 477
    move-result v5

    .line 478
    if-eqz v5, :cond_c

    .line 479
    .line 480
    const-string v2, "Reading user agent from WebSettings"

    .line 481
    .line 482
    invoke-static {v2}, LG6/L;->k(Ljava/lang/String;)V

    .line 483
    .line 484
    .line 485
    invoke-static {v3}, Landroid/webkit/WebSettings;->getDefaultUserAgent(Landroid/content/Context;)Ljava/lang/String;

    .line 486
    .line 487
    .line 488
    move-result-object v2

    .line 489
    if-eqz v1, :cond_c

    .line 490
    .line 491
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 492
    .line 493
    .line 494
    move-result-object v0

    .line 495
    invoke-interface {v0, v4, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 496
    .line 497
    .line 498
    move-result-object v0

    .line 499
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 500
    .line 501
    .line 502
    const-string v0, "Persisting user agent."

    .line 503
    .line 504
    invoke-static {v0}, LG6/L;->k(Ljava/lang/String;)V

    .line 505
    .line 506
    .line 507
    :cond_c
    return-object v2

    .line 508
    :pswitch_4
    check-cast v4, LC6/f;

    .line 509
    .line 510
    check-cast v3, Landroid/content/Context;

    .line 511
    .line 512
    invoke-virtual {v4, v3}, LC6/f;->b(Landroid/content/Context;)Ljava/lang/String;

    .line 513
    .line 514
    .line 515
    move-result-object v0

    .line 516
    return-object v0

    .line 517
    :pswitch_5
    check-cast v3, LAa/a;

    .line 518
    .line 519
    check-cast v4, LEa/f;

    .line 520
    .line 521
    const-class v0, Ljava/lang/Throwable;

    .line 522
    .line 523
    const-string v5, "detectorTaskWithResource#run"

    .line 524
    .line 525
    invoke-static {v5}, Lcom/google/android/gms/internal/mlkit_vision_common/zzlx;->zze(Ljava/lang/String;)Lcom/google/android/gms/internal/mlkit_vision_common/zzlx;

    .line 526
    .line 527
    .line 528
    move-result-object v5

    .line 529
    invoke-virtual {v5}, Lcom/google/android/gms/internal/mlkit_vision_common/zzlx;->zzb()Lcom/google/android/gms/internal/mlkit_vision_common/zzlx;

    .line 530
    .line 531
    .line 532
    :try_start_6
    iget-object v4, v4, LBa/b;->b:LEa/a;

    .line 533
    .line 534
    invoke-virtual {v4, v3}, LEa/a;->w(LAa/a;)LCa/f;

    .line 535
    .line 536
    .line 537
    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 538
    invoke-virtual {v5}, Lcom/google/android/gms/internal/mlkit_vision_common/zzlx;->close()V

    .line 539
    .line 540
    .line 541
    return-object v0

    .line 542
    :catchall_3
    move-exception v3

    .line 543
    :try_start_7
    invoke-virtual {v5}, Lcom/google/android/gms/internal/mlkit_vision_common/zzlx;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 544
    .line 545
    .line 546
    goto :goto_7

    .line 547
    :catchall_4
    move-exception v4

    .line 548
    :try_start_8
    const-string v5, "addSuppressed"

    .line 549
    .line 550
    new-array v6, v2, [Ljava/lang/Class;

    .line 551
    .line 552
    aput-object v0, v6, v1

    .line 553
    .line 554
    invoke-virtual {v0, v5, v6}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 555
    .line 556
    .line 557
    move-result-object v0

    .line 558
    new-array v2, v2, [Ljava/lang/Object;

    .line 559
    .line 560
    aput-object v4, v2, v1

    .line 561
    .line 562
    invoke-virtual {v0, v3, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_1

    .line 563
    .line 564
    .line 565
    :catch_1
    :goto_7
    throw v3

    .line 566
    :pswitch_6
    check-cast v4, LA7/N1;

    .line 567
    .line 568
    iget-object v1, v4, LA7/N1;->a:Ljava/lang/String;

    .line 569
    .line 570
    invoke-static {v1}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 571
    .line 572
    .line 573
    check-cast v3, LA7/L1;

    .line 574
    .line 575
    invoke-virtual {v3, v1}, LA7/L1;->E(Ljava/lang/String;)LA7/F0;

    .line 576
    .line 577
    .line 578
    move-result-object v1

    .line 579
    sget-object v2, LA7/E0;->c:LA7/E0;

    .line 580
    .line 581
    invoke-virtual {v1, v2}, LA7/F0;->i(LA7/E0;)Z

    .line 582
    .line 583
    .line 584
    move-result v1

    .line 585
    if-eqz v1, :cond_e

    .line 586
    .line 587
    iget-object v1, v4, LA7/N1;->v:Ljava/lang/String;

    .line 588
    .line 589
    invoke-static {v0, v1}, LA7/F0;->c(ILjava/lang/String;)LA7/F0;

    .line 590
    .line 591
    .line 592
    move-result-object v0

    .line 593
    invoke-virtual {v0, v2}, LA7/F0;->i(LA7/E0;)Z

    .line 594
    .line 595
    .line 596
    move-result v0

    .line 597
    if-nez v0, :cond_d

    .line 598
    .line 599
    goto :goto_8

    .line 600
    :cond_d
    invoke-virtual {v3, v4}, LA7/L1;->c(LA7/N1;)LA7/E;

    .line 601
    .line 602
    .line 603
    move-result-object v0

    .line 604
    invoke-virtual {v0}, LA7/E;->g()Ljava/lang/String;

    .line 605
    .line 606
    .line 607
    move-result-object v0

    .line 608
    goto :goto_9

    .line 609
    :cond_e
    :goto_8
    invoke-virtual {v3}, LA7/L1;->zzj()LA7/N;

    .line 610
    .line 611
    .line 612
    move-result-object v0

    .line 613
    const-string v1, "Analytics storage consent denied. Returning null app instance id"

    .line 614
    .line 615
    iget-object v0, v0, LA7/N;->n:LA7/P;

    .line 616
    .line 617
    invoke-virtual {v0, v1}, LA7/P;->c(Ljava/lang/String;)V

    .line 618
    .line 619
    .line 620
    const/4 v0, 0x0

    .line 621
    :goto_9
    return-object v0

    .line 622
    :pswitch_7
    check-cast v3, LA7/s0;

    .line 623
    .line 624
    iget-object v0, v3, LA7/s0;->a:LA7/L1;

    .line 625
    .line 626
    invoke-virtual {v0}, LA7/L1;->Z()V

    .line 627
    .line 628
    .line 629
    iget-object v0, v0, LA7/L1;->c:LA7/i;

    .line 630
    .line 631
    invoke-static {v0}, LA7/L1;->m(LA7/G1;)V

    .line 632
    .line 633
    .line 634
    check-cast v4, Ljava/lang/String;

    .line 635
    .line 636
    invoke-virtual {v0, v4}, LA7/i;->j1(Ljava/lang/String;)Ljava/util/List;

    .line 637
    .line 638
    .line 639
    move-result-object v0

    .line 640
    return-object v0

    .line 641
    :pswitch_8
    check-cast v3, LA7/s0;

    .line 642
    .line 643
    iget-object v0, v3, LA7/s0;->a:LA7/L1;

    .line 644
    .line 645
    invoke-virtual {v0}, LA7/L1;->Z()V

    .line 646
    .line 647
    .line 648
    new-instance v0, LA7/g;

    .line 649
    .line 650
    iget-object v1, v3, LA7/s0;->a:LA7/L1;

    .line 651
    .line 652
    check-cast v4, LA7/N1;

    .line 653
    .line 654
    iget-object v2, v4, LA7/N1;->a:Ljava/lang/String;

    .line 655
    .line 656
    invoke-virtual {v1, v2}, LA7/L1;->e(Ljava/lang/String;)Landroid/os/Bundle;

    .line 657
    .line 658
    .line 659
    move-result-object v1

    .line 660
    invoke-direct {v0, v1}, LA7/g;-><init>(Landroid/os/Bundle;)V

    .line 661
    .line 662
    .line 663
    return-object v0

    .line 664
    nop

    .line 665
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
