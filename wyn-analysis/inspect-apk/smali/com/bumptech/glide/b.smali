.class public final Lcom/bumptech/glide/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ComponentCallbacks2;


# static fields
.field public static volatile i:Lcom/bumptech/glide/b;

.field public static volatile j:Z


# instance fields
.field public final a:LF4/a;

.field public final b:LG4/d;

.field public final c:Lcom/bumptech/glide/c;

.field public final d:Lcom/bumptech/glide/f;

.field public final e:LF4/f;

.field public final f:LR4/h;

.field public final g:Lya/b;

.field public final h:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Landroid/content/Context;LE4/o;LG4/d;LF4/a;LF4/f;LR4/h;Lya/b;Lad/I;Lx/e;Ljava/util/List;)V
    .locals 24

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v3, p1

    .line 4
    .line 5
    move-object/from16 v6, p4

    .line 6
    .line 7
    move-object/from16 v0, p5

    .line 8
    .line 9
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    new-instance v2, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v2, v1, Lcom/bumptech/glide/b;->h:Ljava/util/ArrayList;

    .line 18
    .line 19
    iput-object v6, v1, Lcom/bumptech/glide/b;->a:LF4/a;

    .line 20
    .line 21
    iput-object v0, v1, Lcom/bumptech/glide/b;->e:LF4/f;

    .line 22
    .line 23
    move-object/from16 v2, p3

    .line 24
    .line 25
    iput-object v2, v1, Lcom/bumptech/glide/b;->b:LG4/d;

    .line 26
    .line 27
    move-object/from16 v2, p6

    .line 28
    .line 29
    iput-object v2, v1, Lcom/bumptech/glide/b;->f:LR4/h;

    .line 30
    .line 31
    move-object/from16 v2, p7

    .line 32
    .line 33
    iput-object v2, v1, Lcom/bumptech/glide/b;->g:Lya/b;

    .line 34
    .line 35
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    new-instance v10, Lcom/bumptech/glide/f;

    .line 40
    .line 41
    invoke-direct {v10}, Lcom/bumptech/glide/f;-><init>()V

    .line 42
    .line 43
    .line 44
    iput-object v10, v1, Lcom/bumptech/glide/b;->d:Lcom/bumptech/glide/f;

    .line 45
    .line 46
    new-instance v4, LL4/h;

    .line 47
    .line 48
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 49
    .line 50
    .line 51
    iget-object v5, v10, Lcom/bumptech/glide/f;->g:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v5, LA/d0;

    .line 54
    .line 55
    monitor-enter v5

    .line 56
    :try_start_0
    iget-object v7, v5, LA/d0;->a:Ljava/util/ArrayList;

    .line 57
    .line 58
    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    .line 60
    .line 61
    monitor-exit v5

    .line 62
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 63
    .line 64
    const/16 v5, 0x1b

    .line 65
    .line 66
    if-lt v4, v5, :cond_0

    .line 67
    .line 68
    new-instance v5, LL4/q;

    .line 69
    .line 70
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v10, v5}, Lcom/bumptech/glide/f;->k(LB4/c;)V

    .line 74
    .line 75
    .line 76
    :cond_0
    invoke-virtual {v10}, Lcom/bumptech/glide/f;->i()Ljava/util/ArrayList;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    new-instance v7, LP4/a;

    .line 81
    .line 82
    invoke-direct {v7, v3, v5, v6, v0}, LP4/a;-><init>(Landroid/content/Context;Ljava/util/ArrayList;LF4/a;LF4/f;)V

    .line 83
    .line 84
    .line 85
    new-instance v8, LL4/B;

    .line 86
    .line 87
    new-instance v9, Lx9/d;

    .line 88
    .line 89
    const/16 v11, 0x15

    .line 90
    .line 91
    invoke-direct {v9, v11}, Lx9/d;-><init>(I)V

    .line 92
    .line 93
    .line 94
    invoke-direct {v8, v6, v9}, LL4/B;-><init>(LF4/a;LL4/A;)V

    .line 95
    .line 96
    .line 97
    new-instance v9, LL4/m;

    .line 98
    .line 99
    invoke-virtual {v10}, Lcom/bumptech/glide/f;->i()Ljava/util/ArrayList;

    .line 100
    .line 101
    .line 102
    move-result-object v11

    .line 103
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 104
    .line 105
    .line 106
    move-result-object v12

    .line 107
    invoke-direct {v9, v11, v12, v6, v0}, LL4/m;-><init>(Ljava/util/ArrayList;Landroid/util/DisplayMetrics;LF4/a;LF4/f;)V

    .line 108
    .line 109
    .line 110
    new-instance v11, LL4/d;

    .line 111
    .line 112
    const/4 v12, 0x0

    .line 113
    invoke-direct {v11, v9, v12}, LL4/d;-><init>(LL4/m;I)V

    .line 114
    .line 115
    .line 116
    new-instance v12, LL4/a;

    .line 117
    .line 118
    const/4 v13, 0x2

    .line 119
    invoke-direct {v12, v13, v9, v0}, LL4/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    new-instance v13, LN4/b;

    .line 123
    .line 124
    invoke-direct {v13, v3}, LN4/b;-><init>(Landroid/content/Context;)V

    .line 125
    .line 126
    .line 127
    new-instance v14, LI4/x;

    .line 128
    .line 129
    invoke-direct {v14, v2}, LI4/x;-><init>(Landroid/content/res/Resources;)V

    .line 130
    .line 131
    .line 132
    new-instance v15, LY9/c;

    .line 133
    .line 134
    const/16 v1, 0xc

    .line 135
    .line 136
    invoke-direct {v15, v2, v1}, LY9/c;-><init>(Ljava/lang/Object;I)V

    .line 137
    .line 138
    .line 139
    new-instance v1, LI4/w;

    .line 140
    .line 141
    move/from16 p3, v4

    .line 142
    .line 143
    const/4 v4, 0x0

    .line 144
    invoke-direct {v1, v2, v4}, LI4/w;-><init>(Landroid/content/res/Resources;I)V

    .line 145
    .line 146
    .line 147
    new-instance v4, Lxa/d;

    .line 148
    .line 149
    const/16 v3, 0xb

    .line 150
    .line 151
    invoke-direct {v4, v2, v3}, Lxa/d;-><init>(Ljava/lang/Object;I)V

    .line 152
    .line 153
    .line 154
    new-instance v3, LL4/b;

    .line 155
    .line 156
    invoke-direct {v3, v0}, LL4/b;-><init>(LF4/f;)V

    .line 157
    .line 158
    .line 159
    move-object/from16 p6, v4

    .line 160
    .line 161
    new-instance v4, LA/x;

    .line 162
    .line 163
    move-object/from16 p7, v15

    .line 164
    .line 165
    const/16 v15, 0x8

    .line 166
    .line 167
    move-object/from16 v16, v1

    .line 168
    .line 169
    const/4 v1, 0x0

    .line 170
    invoke-direct {v4, v1, v15}, LA/x;-><init>(BI)V

    .line 171
    .line 172
    .line 173
    new-instance v1, LQ4/c;

    .line 174
    .line 175
    const/4 v15, 0x1

    .line 176
    invoke-direct {v1, v15}, LQ4/c;-><init>(I)V

    .line 177
    .line 178
    .line 179
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 180
    .line 181
    .line 182
    move-result-object v15

    .line 183
    move-object/from16 v17, v1

    .line 184
    .line 185
    new-instance v1, LI4/z;

    .line 186
    .line 187
    move-object/from16 v18, v4

    .line 188
    .line 189
    const/4 v4, 0x5

    .line 190
    invoke-direct {v1, v4}, LI4/z;-><init>(I)V

    .line 191
    .line 192
    .line 193
    const-class v4, Ljava/nio/ByteBuffer;

    .line 194
    .line 195
    invoke-virtual {v10, v4, v1}, Lcom/bumptech/glide/f;->b(Ljava/lang/Class;LB4/b;)V

    .line 196
    .line 197
    .line 198
    new-instance v1, LA/e0;

    .line 199
    .line 200
    move-object/from16 v19, v15

    .line 201
    .line 202
    const/16 v15, 0x9

    .line 203
    .line 204
    invoke-direct {v1, v0, v15}, LA/e0;-><init>(Ljava/lang/Object;I)V

    .line 205
    .line 206
    .line 207
    const-class v15, Ljava/io/InputStream;

    .line 208
    .line 209
    invoke-virtual {v10, v15, v1}, Lcom/bumptech/glide/f;->b(Ljava/lang/Class;LB4/b;)V

    .line 210
    .line 211
    .line 212
    const-string v1, "Bitmap"

    .line 213
    .line 214
    move-object/from16 v20, v14

    .line 215
    .line 216
    const-class v14, Landroid/graphics/Bitmap;

    .line 217
    .line 218
    invoke-virtual {v10, v1, v4, v14, v11}, Lcom/bumptech/glide/f;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;LB4/i;)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v10, v1, v15, v14, v12}, Lcom/bumptech/glide/f;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;LB4/i;)V

    .line 222
    .line 223
    .line 224
    move-object/from16 v21, v13

    .line 225
    .line 226
    new-instance v13, LL4/d;

    .line 227
    .line 228
    const/4 v0, 0x1

    .line 229
    invoke-direct {v13, v9, v0}, LL4/d;-><init>(LL4/m;I)V

    .line 230
    .line 231
    .line 232
    const-class v0, Landroid/os/ParcelFileDescriptor;

    .line 233
    .line 234
    invoke-virtual {v10, v1, v0, v14, v13}, Lcom/bumptech/glide/f;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;LB4/i;)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {v10, v1, v0, v14, v8}, Lcom/bumptech/glide/f;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;LB4/i;)V

    .line 238
    .line 239
    .line 240
    new-instance v9, LL4/B;

    .line 241
    .line 242
    new-instance v13, Lm9/S;

    .line 243
    .line 244
    move-object/from16 v22, v5

    .line 245
    .line 246
    const/16 v5, 0x15

    .line 247
    .line 248
    invoke-direct {v13, v5}, Lm9/S;-><init>(I)V

    .line 249
    .line 250
    .line 251
    invoke-direct {v9, v6, v13}, LL4/B;-><init>(LF4/a;LL4/A;)V

    .line 252
    .line 253
    .line 254
    const-class v5, Landroid/content/res/AssetFileDescriptor;

    .line 255
    .line 256
    invoke-virtual {v10, v1, v5, v14, v9}, Lcom/bumptech/glide/f;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;LB4/i;)V

    .line 257
    .line 258
    .line 259
    sget-object v9, LI4/z;->b:LI4/z;

    .line 260
    .line 261
    invoke-virtual {v10, v14, v14, v9}, Lcom/bumptech/glide/f;->d(Ljava/lang/Class;Ljava/lang/Class;LI4/q;)V

    .line 262
    .line 263
    .line 264
    new-instance v13, LL4/x;

    .line 265
    .line 266
    move-object/from16 v23, v5

    .line 267
    .line 268
    const/4 v5, 0x0

    .line 269
    invoke-direct {v13, v5}, LL4/x;-><init>(I)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {v10, v1, v14, v14, v13}, Lcom/bumptech/glide/f;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;LB4/i;)V

    .line 273
    .line 274
    .line 275
    invoke-virtual {v10, v14, v3}, Lcom/bumptech/glide/f;->c(Ljava/lang/Class;LB4/j;)V

    .line 276
    .line 277
    .line 278
    new-instance v5, LL4/a;

    .line 279
    .line 280
    invoke-direct {v5, v2, v11}, LL4/a;-><init>(Landroid/content/res/Resources;LB4/i;)V

    .line 281
    .line 282
    .line 283
    const-string v11, "BitmapDrawable"

    .line 284
    .line 285
    const-class v13, Landroid/graphics/drawable/BitmapDrawable;

    .line 286
    .line 287
    invoke-virtual {v10, v11, v4, v13, v5}, Lcom/bumptech/glide/f;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;LB4/i;)V

    .line 288
    .line 289
    .line 290
    new-instance v5, LL4/a;

    .line 291
    .line 292
    invoke-direct {v5, v2, v12}, LL4/a;-><init>(Landroid/content/res/Resources;LB4/i;)V

    .line 293
    .line 294
    .line 295
    invoke-virtual {v10, v11, v15, v13, v5}, Lcom/bumptech/glide/f;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;LB4/i;)V

    .line 296
    .line 297
    .line 298
    new-instance v5, LL4/a;

    .line 299
    .line 300
    invoke-direct {v5, v2, v8}, LL4/a;-><init>(Landroid/content/res/Resources;LB4/i;)V

    .line 301
    .line 302
    .line 303
    invoke-virtual {v10, v11, v0, v13, v5}, Lcom/bumptech/glide/f;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;LB4/i;)V

    .line 304
    .line 305
    .line 306
    new-instance v5, LS3/c;

    .line 307
    .line 308
    const/16 v8, 0xc

    .line 309
    .line 310
    const/4 v11, 0x0

    .line 311
    invoke-direct {v5, v6, v11, v3, v8}, LS3/c;-><init>(Ljava/lang/Object;ZLjava/lang/Object;I)V

    .line 312
    .line 313
    .line 314
    invoke-virtual {v10, v13, v5}, Lcom/bumptech/glide/f;->c(Ljava/lang/Class;LB4/j;)V

    .line 315
    .line 316
    .line 317
    new-instance v3, LP4/j;

    .line 318
    .line 319
    move-object/from16 v11, p5

    .line 320
    .line 321
    move-object/from16 v5, v22

    .line 322
    .line 323
    invoke-direct {v3, v5, v7, v11}, LP4/j;-><init>(Ljava/util/ArrayList;LP4/a;LF4/f;)V

    .line 324
    .line 325
    .line 326
    const-string v5, "Gif"

    .line 327
    .line 328
    const-class v12, LP4/c;

    .line 329
    .line 330
    invoke-virtual {v10, v5, v15, v12, v3}, Lcom/bumptech/glide/f;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;LB4/i;)V

    .line 331
    .line 332
    .line 333
    invoke-virtual {v10, v5, v4, v12, v7}, Lcom/bumptech/glide/f;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;LB4/i;)V

    .line 334
    .line 335
    .line 336
    new-instance v3, Lya/b;

    .line 337
    .line 338
    const/16 v5, 0x18

    .line 339
    .line 340
    invoke-direct {v3, v5}, Lya/b;-><init>(I)V

    .line 341
    .line 342
    .line 343
    invoke-virtual {v10, v12, v3}, Lcom/bumptech/glide/f;->c(Ljava/lang/Class;LB4/j;)V

    .line 344
    .line 345
    .line 346
    const-class v3, LA4/d;

    .line 347
    .line 348
    invoke-virtual {v10, v3, v3, v9}, Lcom/bumptech/glide/f;->d(Ljava/lang/Class;Ljava/lang/Class;LI4/q;)V

    .line 349
    .line 350
    .line 351
    new-instance v5, LN4/b;

    .line 352
    .line 353
    invoke-direct {v5, v6}, LN4/b;-><init>(LF4/a;)V

    .line 354
    .line 355
    .line 356
    invoke-virtual {v10, v1, v3, v14, v5}, Lcom/bumptech/glide/f;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;LB4/i;)V

    .line 357
    .line 358
    .line 359
    const-string v1, "legacy_append"

    .line 360
    .line 361
    const-class v3, Landroid/net/Uri;

    .line 362
    .line 363
    const-class v5, Landroid/graphics/drawable/Drawable;

    .line 364
    .line 365
    move-object/from16 v7, v21

    .line 366
    .line 367
    invoke-virtual {v10, v1, v3, v5, v7}, Lcom/bumptech/glide/f;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;LB4/i;)V

    .line 368
    .line 369
    .line 370
    new-instance v8, LL4/a;

    .line 371
    .line 372
    move-object/from16 v21, v12

    .line 373
    .line 374
    const/4 v12, 0x1

    .line 375
    invoke-direct {v8, v12, v7, v6}, LL4/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 376
    .line 377
    .line 378
    invoke-virtual {v10, v1, v3, v14, v8}, Lcom/bumptech/glide/f;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;LB4/i;)V

    .line 379
    .line 380
    .line 381
    new-instance v7, LC4/h;

    .line 382
    .line 383
    const/4 v8, 0x2

    .line 384
    invoke-direct {v7, v8}, LC4/h;-><init>(I)V

    .line 385
    .line 386
    .line 387
    invoke-virtual {v10, v7}, Lcom/bumptech/glide/f;->l(LC4/f;)V

    .line 388
    .line 389
    .line 390
    new-instance v7, LI4/z;

    .line 391
    .line 392
    const/4 v8, 0x6

    .line 393
    invoke-direct {v7, v8}, LI4/z;-><init>(I)V

    .line 394
    .line 395
    .line 396
    const-class v8, Ljava/io/File;

    .line 397
    .line 398
    invoke-virtual {v10, v8, v4, v7}, Lcom/bumptech/glide/f;->d(Ljava/lang/Class;Ljava/lang/Class;LI4/q;)V

    .line 399
    .line 400
    .line 401
    new-instance v7, LI4/e;

    .line 402
    .line 403
    new-instance v12, LI4/z;

    .line 404
    .line 405
    const/16 v6, 0x9

    .line 406
    .line 407
    invoke-direct {v12, v6}, LI4/z;-><init>(I)V

    .line 408
    .line 409
    .line 410
    invoke-direct {v7, v12}, LA7/B0;-><init>(Ljava/lang/Object;)V

    .line 411
    .line 412
    .line 413
    invoke-virtual {v10, v8, v15, v7}, Lcom/bumptech/glide/f;->d(Ljava/lang/Class;Ljava/lang/Class;LI4/q;)V

    .line 414
    .line 415
    .line 416
    new-instance v6, LL4/x;

    .line 417
    .line 418
    const/4 v7, 0x2

    .line 419
    invoke-direct {v6, v7}, LL4/x;-><init>(I)V

    .line 420
    .line 421
    .line 422
    invoke-virtual {v10, v1, v8, v8, v6}, Lcom/bumptech/glide/f;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;LB4/i;)V

    .line 423
    .line 424
    .line 425
    new-instance v6, LI4/e;

    .line 426
    .line 427
    new-instance v7, LI4/z;

    .line 428
    .line 429
    const/16 v12, 0x8

    .line 430
    .line 431
    invoke-direct {v7, v12}, LI4/z;-><init>(I)V

    .line 432
    .line 433
    .line 434
    invoke-direct {v6, v7}, LA7/B0;-><init>(Ljava/lang/Object;)V

    .line 435
    .line 436
    .line 437
    invoke-virtual {v10, v8, v0, v6}, Lcom/bumptech/glide/f;->d(Ljava/lang/Class;Ljava/lang/Class;LI4/q;)V

    .line 438
    .line 439
    .line 440
    invoke-virtual {v10, v8, v8, v9}, Lcom/bumptech/glide/f;->d(Ljava/lang/Class;Ljava/lang/Class;LI4/q;)V

    .line 441
    .line 442
    .line 443
    new-instance v6, LC4/m;

    .line 444
    .line 445
    invoke-direct {v6, v11}, LC4/m;-><init>(LF4/f;)V

    .line 446
    .line 447
    .line 448
    invoke-virtual {v10, v6}, Lcom/bumptech/glide/f;->l(LC4/f;)V

    .line 449
    .line 450
    .line 451
    new-instance v6, LC4/h;

    .line 452
    .line 453
    const/4 v7, 0x1

    .line 454
    invoke-direct {v6, v7}, LC4/h;-><init>(I)V

    .line 455
    .line 456
    .line 457
    invoke-virtual {v10, v6}, Lcom/bumptech/glide/f;->l(LC4/f;)V

    .line 458
    .line 459
    .line 460
    sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 461
    .line 462
    move-object/from16 v7, v20

    .line 463
    .line 464
    invoke-virtual {v10, v6, v15, v7}, Lcom/bumptech/glide/f;->d(Ljava/lang/Class;Ljava/lang/Class;LI4/q;)V

    .line 465
    .line 466
    .line 467
    move-object/from16 v12, v16

    .line 468
    .line 469
    invoke-virtual {v10, v6, v0, v12}, Lcom/bumptech/glide/f;->d(Ljava/lang/Class;Ljava/lang/Class;LI4/q;)V

    .line 470
    .line 471
    .line 472
    const-class v11, Ljava/lang/Integer;

    .line 473
    .line 474
    invoke-virtual {v10, v11, v15, v7}, Lcom/bumptech/glide/f;->d(Ljava/lang/Class;Ljava/lang/Class;LI4/q;)V

    .line 475
    .line 476
    .line 477
    invoke-virtual {v10, v11, v0, v12}, Lcom/bumptech/glide/f;->d(Ljava/lang/Class;Ljava/lang/Class;LI4/q;)V

    .line 478
    .line 479
    .line 480
    move-object/from16 v7, p7

    .line 481
    .line 482
    invoke-virtual {v10, v11, v3, v7}, Lcom/bumptech/glide/f;->d(Ljava/lang/Class;Ljava/lang/Class;LI4/q;)V

    .line 483
    .line 484
    .line 485
    move-object/from16 v12, p6

    .line 486
    .line 487
    move-object/from16 p6, v13

    .line 488
    .line 489
    move-object/from16 v13, v23

    .line 490
    .line 491
    invoke-virtual {v10, v6, v13, v12}, Lcom/bumptech/glide/f;->d(Ljava/lang/Class;Ljava/lang/Class;LI4/q;)V

    .line 492
    .line 493
    .line 494
    invoke-virtual {v10, v11, v13, v12}, Lcom/bumptech/glide/f;->d(Ljava/lang/Class;Ljava/lang/Class;LI4/q;)V

    .line 495
    .line 496
    .line 497
    invoke-virtual {v10, v6, v3, v7}, Lcom/bumptech/glide/f;->d(Ljava/lang/Class;Ljava/lang/Class;LI4/q;)V

    .line 498
    .line 499
    .line 500
    new-instance v6, Ly3/j;

    .line 501
    .line 502
    const/16 v7, 0xa

    .line 503
    .line 504
    invoke-direct {v6, v7}, Ly3/j;-><init>(I)V

    .line 505
    .line 506
    .line 507
    const-class v7, Ljava/lang/String;

    .line 508
    .line 509
    invoke-virtual {v10, v7, v15, v6}, Lcom/bumptech/glide/f;->d(Ljava/lang/Class;Ljava/lang/Class;LI4/q;)V

    .line 510
    .line 511
    .line 512
    new-instance v6, Ly3/j;

    .line 513
    .line 514
    const/16 v11, 0xa

    .line 515
    .line 516
    invoke-direct {v6, v11}, Ly3/j;-><init>(I)V

    .line 517
    .line 518
    .line 519
    invoke-virtual {v10, v3, v15, v6}, Lcom/bumptech/glide/f;->d(Ljava/lang/Class;Ljava/lang/Class;LI4/q;)V

    .line 520
    .line 521
    .line 522
    new-instance v6, LI4/z;

    .line 523
    .line 524
    const/16 v11, 0xd

    .line 525
    .line 526
    invoke-direct {v6, v11}, LI4/z;-><init>(I)V

    .line 527
    .line 528
    .line 529
    invoke-virtual {v10, v7, v15, v6}, Lcom/bumptech/glide/f;->d(Ljava/lang/Class;Ljava/lang/Class;LI4/q;)V

    .line 530
    .line 531
    .line 532
    new-instance v6, LI4/z;

    .line 533
    .line 534
    const/16 v11, 0xc

    .line 535
    .line 536
    invoke-direct {v6, v11}, LI4/z;-><init>(I)V

    .line 537
    .line 538
    .line 539
    invoke-virtual {v10, v7, v0, v6}, Lcom/bumptech/glide/f;->d(Ljava/lang/Class;Ljava/lang/Class;LI4/q;)V

    .line 540
    .line 541
    .line 542
    new-instance v6, LI4/z;

    .line 543
    .line 544
    const/16 v11, 0xb

    .line 545
    .line 546
    invoke-direct {v6, v11}, LI4/z;-><init>(I)V

    .line 547
    .line 548
    .line 549
    invoke-virtual {v10, v7, v13, v6}, Lcom/bumptech/glide/f;->d(Ljava/lang/Class;Ljava/lang/Class;LI4/q;)V

    .line 550
    .line 551
    .line 552
    new-instance v6, Lza/a;

    .line 553
    .line 554
    const/16 v7, 0x13

    .line 555
    .line 556
    invoke-direct {v6, v7}, Lza/a;-><init>(I)V

    .line 557
    .line 558
    .line 559
    invoke-virtual {v10, v3, v15, v6}, Lcom/bumptech/glide/f;->d(Ljava/lang/Class;Ljava/lang/Class;LI4/q;)V

    .line 560
    .line 561
    .line 562
    new-instance v6, Lxa/d;

    .line 563
    .line 564
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    .line 565
    .line 566
    .line 567
    move-result-object v7

    .line 568
    const/16 v11, 0xa

    .line 569
    .line 570
    invoke-direct {v6, v7, v11}, Lxa/d;-><init>(Ljava/lang/Object;I)V

    .line 571
    .line 572
    .line 573
    invoke-virtual {v10, v3, v15, v6}, Lcom/bumptech/glide/f;->d(Ljava/lang/Class;Ljava/lang/Class;LI4/q;)V

    .line 574
    .line 575
    .line 576
    new-instance v6, LA/e0;

    .line 577
    .line 578
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    .line 579
    .line 580
    .line 581
    move-result-object v7

    .line 582
    const/16 v11, 0x8

    .line 583
    .line 584
    invoke-direct {v6, v7, v11}, LA/e0;-><init>(Ljava/lang/Object;I)V

    .line 585
    .line 586
    .line 587
    invoke-virtual {v10, v3, v0, v6}, Lcom/bumptech/glide/f;->d(Ljava/lang/Class;Ljava/lang/Class;LI4/q;)V

    .line 588
    .line 589
    .line 590
    new-instance v6, LE0/a;

    .line 591
    .line 592
    const/4 v7, 0x0

    .line 593
    move-object/from16 v11, p1

    .line 594
    .line 595
    invoke-direct {v6, v11, v7}, LE0/a;-><init>(Landroid/content/Context;Z)V

    .line 596
    .line 597
    .line 598
    invoke-virtual {v10, v3, v15, v6}, Lcom/bumptech/glide/f;->d(Ljava/lang/Class;Ljava/lang/Class;LI4/q;)V

    .line 599
    .line 600
    .line 601
    new-instance v6, LJ4/c;

    .line 602
    .line 603
    invoke-direct {v6, v11, v7}, LJ4/c;-><init>(Landroid/content/Context;Z)V

    .line 604
    .line 605
    .line 606
    invoke-virtual {v10, v3, v15, v6}, Lcom/bumptech/glide/f;->d(Ljava/lang/Class;Ljava/lang/Class;LI4/q;)V

    .line 607
    .line 608
    .line 609
    const/16 v6, 0x1d

    .line 610
    .line 611
    move/from16 v7, p3

    .line 612
    .line 613
    if-lt v7, v6, :cond_1

    .line 614
    .line 615
    new-instance v6, LJ4/e;

    .line 616
    .line 617
    invoke-direct {v6, v11, v15}, LJ4/d;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 618
    .line 619
    .line 620
    invoke-virtual {v10, v3, v15, v6}, Lcom/bumptech/glide/f;->d(Ljava/lang/Class;Ljava/lang/Class;LI4/q;)V

    .line 621
    .line 622
    .line 623
    new-instance v6, LJ4/e;

    .line 624
    .line 625
    invoke-direct {v6, v11, v0}, LJ4/d;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 626
    .line 627
    .line 628
    invoke-virtual {v10, v3, v0, v6}, Lcom/bumptech/glide/f;->d(Ljava/lang/Class;Ljava/lang/Class;LI4/q;)V

    .line 629
    .line 630
    .line 631
    :cond_1
    new-instance v6, LS3/l;

    .line 632
    .line 633
    move-object/from16 v7, v19

    .line 634
    .line 635
    invoke-direct {v6, v7}, LS3/l;-><init>(Ljava/lang/Object;)V

    .line 636
    .line 637
    .line 638
    invoke-virtual {v10, v3, v15, v6}, Lcom/bumptech/glide/f;->d(Ljava/lang/Class;Ljava/lang/Class;LI4/q;)V

    .line 639
    .line 640
    .line 641
    new-instance v6, Ly3/j;

    .line 642
    .line 643
    const/16 v12, 0xb

    .line 644
    .line 645
    invoke-direct {v6, v7, v12}, Ly3/j;-><init>(Ljava/lang/Object;I)V

    .line 646
    .line 647
    .line 648
    invoke-virtual {v10, v3, v0, v6}, Lcom/bumptech/glide/f;->d(Ljava/lang/Class;Ljava/lang/Class;LI4/q;)V

    .line 649
    .line 650
    .line 651
    new-instance v0, Lxa/d;

    .line 652
    .line 653
    const/16 v6, 0xc

    .line 654
    .line 655
    invoke-direct {v0, v7, v6}, Lxa/d;-><init>(Ljava/lang/Object;I)V

    .line 656
    .line 657
    .line 658
    invoke-virtual {v10, v3, v13, v0}, Lcom/bumptech/glide/f;->d(Ljava/lang/Class;Ljava/lang/Class;LI4/q;)V

    .line 659
    .line 660
    .line 661
    new-instance v0, LI4/z;

    .line 662
    .line 663
    const/16 v6, 0xe

    .line 664
    .line 665
    invoke-direct {v0, v6}, LI4/z;-><init>(I)V

    .line 666
    .line 667
    .line 668
    invoke-virtual {v10, v3, v15, v0}, Lcom/bumptech/glide/f;->d(Ljava/lang/Class;Ljava/lang/Class;LI4/q;)V

    .line 669
    .line 670
    .line 671
    new-instance v0, LVa/ka;

    .line 672
    .line 673
    const/16 v6, 0x14

    .line 674
    .line 675
    invoke-direct {v0, v6}, LVa/ka;-><init>(I)V

    .line 676
    .line 677
    .line 678
    const-class v6, Ljava/net/URL;

    .line 679
    .line 680
    invoke-virtual {v10, v6, v15, v0}, Lcom/bumptech/glide/f;->d(Ljava/lang/Class;Ljava/lang/Class;LI4/q;)V

    .line 681
    .line 682
    .line 683
    new-instance v0, LA7/Q1;

    .line 684
    .line 685
    invoke-direct {v0, v11}, LA7/Q1;-><init>(Landroid/content/Context;)V

    .line 686
    .line 687
    .line 688
    invoke-virtual {v10, v3, v8, v0}, Lcom/bumptech/glide/f;->d(Ljava/lang/Class;Ljava/lang/Class;LI4/q;)V

    .line 689
    .line 690
    .line 691
    new-instance v0, LY9/c;

    .line 692
    .line 693
    const/16 v6, 0xe

    .line 694
    .line 695
    invoke-direct {v0, v6}, LY9/c;-><init>(I)V

    .line 696
    .line 697
    .line 698
    const-class v6, LI4/f;

    .line 699
    .line 700
    invoke-virtual {v10, v6, v15, v0}, Lcom/bumptech/glide/f;->d(Ljava/lang/Class;Ljava/lang/Class;LI4/q;)V

    .line 701
    .line 702
    .line 703
    new-instance v0, LI4/z;

    .line 704
    .line 705
    const/4 v6, 0x2

    .line 706
    invoke-direct {v0, v6}, LI4/z;-><init>(I)V

    .line 707
    .line 708
    .line 709
    const-class v12, [B

    .line 710
    .line 711
    invoke-virtual {v10, v12, v4, v0}, Lcom/bumptech/glide/f;->d(Ljava/lang/Class;Ljava/lang/Class;LI4/q;)V

    .line 712
    .line 713
    .line 714
    new-instance v0, LI4/z;

    .line 715
    .line 716
    const/4 v4, 0x4

    .line 717
    invoke-direct {v0, v4}, LI4/z;-><init>(I)V

    .line 718
    .line 719
    .line 720
    invoke-virtual {v10, v12, v15, v0}, Lcom/bumptech/glide/f;->d(Ljava/lang/Class;Ljava/lang/Class;LI4/q;)V

    .line 721
    .line 722
    .line 723
    invoke-virtual {v10, v3, v3, v9}, Lcom/bumptech/glide/f;->d(Ljava/lang/Class;Ljava/lang/Class;LI4/q;)V

    .line 724
    .line 725
    .line 726
    invoke-virtual {v10, v5, v5, v9}, Lcom/bumptech/glide/f;->d(Ljava/lang/Class;Ljava/lang/Class;LI4/q;)V

    .line 727
    .line 728
    .line 729
    new-instance v0, LL4/x;

    .line 730
    .line 731
    const/4 v3, 0x1

    .line 732
    invoke-direct {v0, v3}, LL4/x;-><init>(I)V

    .line 733
    .line 734
    .line 735
    invoke-virtual {v10, v1, v5, v5, v0}, Lcom/bumptech/glide/f;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;LB4/i;)V

    .line 736
    .line 737
    .line 738
    new-instance v0, LI4/x;

    .line 739
    .line 740
    invoke-direct {v0, v2}, LI4/x;-><init>(Landroid/content/res/Resources;)V

    .line 741
    .line 742
    .line 743
    move-object/from16 v1, p6

    .line 744
    .line 745
    invoke-virtual {v10, v14, v1, v0}, Lcom/bumptech/glide/f;->m(Ljava/lang/Class;Ljava/lang/Class;LQ4/a;)V

    .line 746
    .line 747
    .line 748
    move-object/from16 v7, v18

    .line 749
    .line 750
    invoke-virtual {v10, v14, v12, v7}, Lcom/bumptech/glide/f;->m(Ljava/lang/Class;Ljava/lang/Class;LQ4/a;)V

    .line 751
    .line 752
    .line 753
    new-instance v4, Lb7/k;

    .line 754
    .line 755
    move-object v0, v5

    .line 756
    const/16 v5, 0xb

    .line 757
    .line 758
    const/4 v9, 0x0

    .line 759
    move-object/from16 v6, p4

    .line 760
    .line 761
    move-object/from16 v8, v17

    .line 762
    .line 763
    invoke-direct/range {v4 .. v9}, Lb7/k;-><init>(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)V

    .line 764
    .line 765
    .line 766
    invoke-virtual {v10, v0, v12, v4}, Lcom/bumptech/glide/f;->m(Ljava/lang/Class;Ljava/lang/Class;LQ4/a;)V

    .line 767
    .line 768
    .line 769
    move-object/from16 v0, v21

    .line 770
    .line 771
    invoke-virtual {v10, v0, v12, v8}, Lcom/bumptech/glide/f;->m(Ljava/lang/Class;Ljava/lang/Class;LQ4/a;)V

    .line 772
    .line 773
    .line 774
    new-instance v0, LL4/B;

    .line 775
    .line 776
    new-instance v3, Lwa/a;

    .line 777
    .line 778
    const/16 v4, 0x15

    .line 779
    .line 780
    invoke-direct {v3, v4}, Lwa/a;-><init>(I)V

    .line 781
    .line 782
    .line 783
    invoke-direct {v0, v6, v3}, LL4/B;-><init>(LF4/a;LL4/A;)V

    .line 784
    .line 785
    .line 786
    const-class v3, Ljava/nio/ByteBuffer;

    .line 787
    .line 788
    const-string v4, "legacy_append"

    .line 789
    .line 790
    invoke-virtual {v10, v4, v3, v14, v0}, Lcom/bumptech/glide/f;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;LB4/i;)V

    .line 791
    .line 792
    .line 793
    new-instance v3, LL4/a;

    .line 794
    .line 795
    invoke-direct {v3, v2, v0}, LL4/a;-><init>(Landroid/content/res/Resources;LB4/i;)V

    .line 796
    .line 797
    .line 798
    const-class v0, Ljava/nio/ByteBuffer;

    .line 799
    .line 800
    const-string v2, "legacy_append"

    .line 801
    .line 802
    invoke-virtual {v10, v2, v0, v1, v3}, Lcom/bumptech/glide/f;->e(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;LB4/i;)V

    .line 803
    .line 804
    .line 805
    new-instance v2, Lcom/bumptech/glide/c;

    .line 806
    .line 807
    move-object/from16 v9, p2

    .line 808
    .line 809
    move-object/from16 v4, p5

    .line 810
    .line 811
    move-object/from16 v6, p8

    .line 812
    .line 813
    move-object/from16 v7, p9

    .line 814
    .line 815
    move-object/from16 v8, p10

    .line 816
    .line 817
    move-object v5, v10

    .line 818
    move-object v3, v11

    .line 819
    invoke-direct/range {v2 .. v9}, Lcom/bumptech/glide/c;-><init>(Landroid/content/Context;LF4/f;Lcom/bumptech/glide/f;Lad/I;Lx/e;Ljava/util/List;LE4/o;)V

    .line 820
    .line 821
    .line 822
    move-object/from16 v1, p0

    .line 823
    .line 824
    iput-object v2, v1, Lcom/bumptech/glide/b;->c:Lcom/bumptech/glide/c;

    .line 825
    .line 826
    return-void

    .line 827
    :catchall_0
    move-exception v0

    .line 828
    :try_start_1
    monitor-exit v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 829
    throw v0
.end method

.method public static a(Landroid/content/Context;Lcom/bumptech/glide/GeneratedAppGlideModule;)V
    .locals 32

    .line 1
    sget-boolean v0, Lcom/bumptech/glide/b;->j:Z

    .line 2
    .line 3
    if-nez v0, :cond_18

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    sput-boolean v0, Lcom/bumptech/glide/b;->j:Z

    .line 7
    .line 8
    new-instance v10, Lx/e;

    .line 9
    .line 10
    const/4 v12, 0x0

    .line 11
    invoke-direct {v10, v12}, Lx/v;-><init>(I)V

    .line 12
    .line 13
    .line 14
    new-instance v9, Lad/I;

    .line 15
    .line 16
    const/4 v1, 0x2

    .line 17
    invoke-direct {v9, v1}, Lad/I;-><init>(I)V

    .line 18
    .line 19
    .line 20
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 25
    .line 26
    const-string v1, "Got app info metadata: "

    .line 27
    .line 28
    const-string v3, "ManifestParser"

    .line 29
    .line 30
    const/4 v4, 0x3

    .line 31
    invoke-static {v3, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 32
    .line 33
    .line 34
    move-result v5

    .line 35
    if-eqz v5, :cond_0

    .line 36
    .line 37
    const-string v5, "Loading Glide modules"

    .line 38
    .line 39
    invoke-static {v3, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 40
    .line 41
    .line 42
    :cond_0
    new-instance v13, Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 45
    .line 46
    .line 47
    :try_start_0
    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v6

    .line 55
    const/16 v7, 0x80

    .line 56
    .line 57
    invoke-virtual {v5, v6, v7}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    iget-object v6, v5, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 62
    .line 63
    const/4 v7, 0x2

    .line 64
    if-nez v6, :cond_1

    .line 65
    .line 66
    invoke-static {v3, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    if-eqz v1, :cond_5

    .line 71
    .line 72
    const-string v1, "Got null app info metadata"

    .line 73
    .line 74
    invoke-static {v3, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 75
    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_1
    invoke-static {v3, v7}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 79
    .line 80
    .line 81
    move-result v6

    .line 82
    if-eqz v6, :cond_2

    .line 83
    .line 84
    new-instance v6, Ljava/lang/StringBuilder;

    .line 85
    .line 86
    invoke-direct {v6, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    iget-object v1, v5, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 90
    .line 91
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    invoke-static {v3, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 99
    .line 100
    .line 101
    :cond_2
    iget-object v1, v5, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 102
    .line 103
    invoke-virtual {v1}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 112
    .line 113
    .line 114
    move-result v6

    .line 115
    if-eqz v6, :cond_4

    .line 116
    .line 117
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v6

    .line 121
    check-cast v6, Ljava/lang/String;

    .line 122
    .line 123
    const-string v8, "GlideModule"

    .line 124
    .line 125
    iget-object v11, v5, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 126
    .line 127
    invoke-virtual {v11, v6}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v11

    .line 131
    invoke-virtual {v8, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v8

    .line 135
    if-nez v8, :cond_3

    .line 136
    .line 137
    goto :goto_0

    .line 138
    :cond_3
    invoke-static {v6}, LS3/f;->B(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    const/4 v0, 0x0

    .line 142
    throw v0
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 143
    :cond_4
    invoke-static {v3, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 144
    .line 145
    .line 146
    move-result v1

    .line 147
    if-eqz v1, :cond_5

    .line 148
    .line 149
    const-string v1, "Finished loading Glide modules"

    .line 150
    .line 151
    invoke-static {v3, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 152
    .line 153
    .line 154
    :cond_5
    :goto_1
    if-eqz p1, :cond_7

    .line 155
    .line 156
    invoke-virtual/range {p1 .. p1}, Lcom/bumptech/glide/GeneratedAppGlideModule;->Z()Ljava/util/Set;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    .line 161
    .line 162
    .line 163
    move-result v1

    .line 164
    if-nez v1, :cond_7

    .line 165
    .line 166
    invoke-virtual/range {p1 .. p1}, Lcom/bumptech/glide/GeneratedAppGlideModule;->Z()Ljava/util/Set;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v13}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 174
    .line 175
    .line 176
    move-result v3

    .line 177
    if-nez v3, :cond_6

    .line 178
    .line 179
    goto :goto_2

    .line 180
    :cond_6
    invoke-static {v1}, LVa/M6;->j(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    throw v0

    .line 185
    :cond_7
    :goto_2
    const-string v1, "Glide"

    .line 186
    .line 187
    invoke-static {v1, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 188
    .line 189
    .line 190
    move-result v1

    .line 191
    if-eqz v1, :cond_9

    .line 192
    .line 193
    invoke-virtual {v13}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 194
    .line 195
    .line 196
    move-result-object v1

    .line 197
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 198
    .line 199
    .line 200
    move-result v3

    .line 201
    if-nez v3, :cond_8

    .line 202
    .line 203
    goto :goto_3

    .line 204
    :cond_8
    invoke-static {v1}, LVa/M6;->j(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    throw v0

    .line 209
    :cond_9
    :goto_3
    invoke-virtual {v13}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 210
    .line 211
    .line 212
    move-result-object v1

    .line 213
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 214
    .line 215
    .line 216
    move-result v3

    .line 217
    if-nez v3, :cond_17

    .line 218
    .line 219
    sget v1, LH4/c;->c:I

    .line 220
    .line 221
    const/4 v3, 0x4

    .line 222
    if-nez v1, :cond_a

    .line 223
    .line 224
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    .line 225
    .line 226
    .line 227
    move-result-object v1

    .line 228
    invoke-virtual {v1}, Ljava/lang/Runtime;->availableProcessors()I

    .line 229
    .line 230
    .line 231
    move-result v1

    .line 232
    invoke-static {v3, v1}, Ljava/lang/Math;->min(II)I

    .line 233
    .line 234
    .line 235
    move-result v1

    .line 236
    sput v1, LH4/c;->c:I

    .line 237
    .line 238
    :cond_a
    sget v15, LH4/c;->c:I

    .line 239
    .line 240
    const-string v1, "source"

    .line 241
    .line 242
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 243
    .line 244
    .line 245
    move-result v4

    .line 246
    if-nez v4, :cond_16

    .line 247
    .line 248
    new-instance v14, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 249
    .line 250
    sget-object v21, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 251
    .line 252
    new-instance v20, Ljava/util/concurrent/PriorityBlockingQueue;

    .line 253
    .line 254
    invoke-direct/range {v20 .. v20}, Ljava/util/concurrent/PriorityBlockingQueue;-><init>()V

    .line 255
    .line 256
    .line 257
    new-instance v4, LH4/b;

    .line 258
    .line 259
    invoke-direct {v4, v1, v12}, LH4/b;-><init>(Ljava/lang/String;Z)V

    .line 260
    .line 261
    .line 262
    const-wide/16 v17, 0x0

    .line 263
    .line 264
    move/from16 v16, v15

    .line 265
    .line 266
    move-object/from16 v19, v21

    .line 267
    .line 268
    move-object/from16 v21, v4

    .line 269
    .line 270
    invoke-direct/range {v14 .. v21}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    .line 271
    .line 272
    .line 273
    move-object/from16 v21, v19

    .line 274
    .line 275
    new-instance v1, LH4/c;

    .line 276
    .line 277
    invoke-direct {v1, v14}, LH4/c;-><init>(Ljava/util/concurrent/ThreadPoolExecutor;)V

    .line 278
    .line 279
    .line 280
    const-string v4, "disk-cache"

    .line 281
    .line 282
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 283
    .line 284
    .line 285
    move-result v5

    .line 286
    if-nez v5, :cond_15

    .line 287
    .line 288
    new-instance v16, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 289
    .line 290
    new-instance v22, Ljava/util/concurrent/PriorityBlockingQueue;

    .line 291
    .line 292
    invoke-direct/range {v22 .. v22}, Ljava/util/concurrent/PriorityBlockingQueue;-><init>()V

    .line 293
    .line 294
    .line 295
    new-instance v5, LH4/b;

    .line 296
    .line 297
    const/4 v6, 0x1

    .line 298
    invoke-direct {v5, v4, v6}, LH4/b;-><init>(Ljava/lang/String;Z)V

    .line 299
    .line 300
    .line 301
    const-wide/16 v19, 0x0

    .line 302
    .line 303
    move/from16 v18, v6

    .line 304
    .line 305
    move-object/from16 v23, v5

    .line 306
    .line 307
    move/from16 v17, v6

    .line 308
    .line 309
    invoke-direct/range {v16 .. v23}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    .line 310
    .line 311
    .line 312
    move-object/from16 v4, v16

    .line 313
    .line 314
    new-instance v5, LH4/c;

    .line 315
    .line 316
    invoke-direct {v5, v4}, LH4/c;-><init>(Ljava/util/concurrent/ThreadPoolExecutor;)V

    .line 317
    .line 318
    .line 319
    sget v4, LH4/c;->c:I

    .line 320
    .line 321
    if-nez v4, :cond_b

    .line 322
    .line 323
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    .line 324
    .line 325
    .line 326
    move-result-object v4

    .line 327
    invoke-virtual {v4}, Ljava/lang/Runtime;->availableProcessors()I

    .line 328
    .line 329
    .line 330
    move-result v4

    .line 331
    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    .line 332
    .line 333
    .line 334
    move-result v4

    .line 335
    sput v4, LH4/c;->c:I

    .line 336
    .line 337
    :cond_b
    sget v4, LH4/c;->c:I

    .line 338
    .line 339
    if-lt v4, v3, :cond_c

    .line 340
    .line 341
    move/from16 v17, v7

    .line 342
    .line 343
    goto :goto_4

    .line 344
    :cond_c
    move/from16 v17, v0

    .line 345
    .line 346
    :goto_4
    const-string v3, "animation"

    .line 347
    .line 348
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 349
    .line 350
    .line 351
    move-result v4

    .line 352
    if-nez v4, :cond_14

    .line 353
    .line 354
    new-instance v16, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 355
    .line 356
    new-instance v22, Ljava/util/concurrent/PriorityBlockingQueue;

    .line 357
    .line 358
    invoke-direct/range {v22 .. v22}, Ljava/util/concurrent/PriorityBlockingQueue;-><init>()V

    .line 359
    .line 360
    .line 361
    new-instance v4, LH4/b;

    .line 362
    .line 363
    invoke-direct {v4, v3, v0}, LH4/b;-><init>(Ljava/lang/String;Z)V

    .line 364
    .line 365
    .line 366
    const-wide/16 v19, 0x0

    .line 367
    .line 368
    move/from16 v18, v17

    .line 369
    .line 370
    move-object/from16 v23, v4

    .line 371
    .line 372
    invoke-direct/range {v16 .. v23}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    .line 373
    .line 374
    .line 375
    move-object/from16 v0, v16

    .line 376
    .line 377
    new-instance v3, LH4/c;

    .line 378
    .line 379
    invoke-direct {v3, v0}, LH4/c;-><init>(Ljava/util/concurrent/ThreadPoolExecutor;)V

    .line 380
    .line 381
    .line 382
    new-instance v0, LG4/e;

    .line 383
    .line 384
    invoke-direct {v0, v2}, LG4/e;-><init>(Landroid/content/Context;)V

    .line 385
    .line 386
    .line 387
    new-instance v4, LG4/f;

    .line 388
    .line 389
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 390
    .line 391
    .line 392
    iget-object v6, v0, LG4/e;->a:Landroid/content/Context;

    .line 393
    .line 394
    iput-object v6, v4, LG4/f;->d:Ljava/lang/Object;

    .line 395
    .line 396
    iget-object v7, v0, LG4/e;->b:Landroid/app/ActivityManager;

    .line 397
    .line 398
    invoke-virtual {v7}, Landroid/app/ActivityManager;->isLowRamDevice()Z

    .line 399
    .line 400
    .line 401
    move-result v8

    .line 402
    if-eqz v8, :cond_d

    .line 403
    .line 404
    const/high16 v8, 0x200000

    .line 405
    .line 406
    goto :goto_5

    .line 407
    :cond_d
    const/high16 v8, 0x400000

    .line 408
    .line 409
    :goto_5
    iput v8, v4, LG4/f;->c:I

    .line 410
    .line 411
    invoke-virtual {v7}, Landroid/app/ActivityManager;->getMemoryClass()I

    .line 412
    .line 413
    .line 414
    move-result v11

    .line 415
    const/high16 v14, 0x100000

    .line 416
    .line 417
    mul-int/2addr v11, v14

    .line 418
    invoke-virtual {v7}, Landroid/app/ActivityManager;->isLowRamDevice()Z

    .line 419
    .line 420
    .line 421
    move-result v14

    .line 422
    int-to-float v11, v11

    .line 423
    if-eqz v14, :cond_e

    .line 424
    .line 425
    const v14, 0x3ea8f5c3    # 0.33f

    .line 426
    .line 427
    .line 428
    goto :goto_6

    .line 429
    :cond_e
    const v14, 0x3ecccccd    # 0.4f

    .line 430
    .line 431
    .line 432
    :goto_6
    mul-float/2addr v11, v14

    .line 433
    invoke-static {v11}, Ljava/lang/Math;->round(F)I

    .line 434
    .line 435
    .line 436
    move-result v11

    .line 437
    iget-object v14, v0, LG4/e;->c:LY9/c;

    .line 438
    .line 439
    iget-object v14, v14, LY9/c;->b:Ljava/lang/Object;

    .line 440
    .line 441
    check-cast v14, Landroid/util/DisplayMetrics;

    .line 442
    .line 443
    iget v15, v14, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 444
    .line 445
    iget v14, v14, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 446
    .line 447
    mul-int/2addr v15, v14

    .line 448
    mul-int/lit8 v15, v15, 0x4

    .line 449
    .line 450
    int-to-float v14, v15

    .line 451
    iget v0, v0, LG4/e;->d:F

    .line 452
    .line 453
    mul-float v15, v14, v0

    .line 454
    .line 455
    invoke-static {v15}, Ljava/lang/Math;->round(F)I

    .line 456
    .line 457
    .line 458
    move-result v15

    .line 459
    const/high16 v16, 0x40000000    # 2.0f

    .line 460
    .line 461
    mul-float v14, v14, v16

    .line 462
    .line 463
    invoke-static {v14}, Ljava/lang/Math;->round(F)I

    .line 464
    .line 465
    .line 466
    move-result v14

    .line 467
    sub-int v12, v11, v8

    .line 468
    .line 469
    move/from16 v17, v0

    .line 470
    .line 471
    add-int v0, v14, v15

    .line 472
    .line 473
    if-gt v0, v12, :cond_f

    .line 474
    .line 475
    iput v14, v4, LG4/f;->b:I

    .line 476
    .line 477
    iput v15, v4, LG4/f;->a:I

    .line 478
    .line 479
    goto :goto_7

    .line 480
    :cond_f
    int-to-float v12, v12

    .line 481
    add-float v14, v17, v16

    .line 482
    .line 483
    div-float/2addr v12, v14

    .line 484
    mul-float v16, v16, v12

    .line 485
    .line 486
    invoke-static/range {v16 .. v16}, Ljava/lang/Math;->round(F)I

    .line 487
    .line 488
    .line 489
    move-result v14

    .line 490
    iput v14, v4, LG4/f;->b:I

    .line 491
    .line 492
    mul-float v12, v12, v17

    .line 493
    .line 494
    invoke-static {v12}, Ljava/lang/Math;->round(F)I

    .line 495
    .line 496
    .line 497
    move-result v12

    .line 498
    iput v12, v4, LG4/f;->a:I

    .line 499
    .line 500
    :goto_7
    const-string v12, "MemorySizeCalculator"

    .line 501
    .line 502
    const/4 v14, 0x3

    .line 503
    invoke-static {v12, v14}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 504
    .line 505
    .line 506
    move-result v14

    .line 507
    if-eqz v14, :cond_11

    .line 508
    .line 509
    new-instance v14, Ljava/lang/StringBuilder;

    .line 510
    .line 511
    const-string v15, "Calculation complete, Calculated memory cache size: "

    .line 512
    .line 513
    invoke-direct {v14, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 514
    .line 515
    .line 516
    iget v15, v4, LG4/f;->b:I

    .line 517
    .line 518
    move-object/from16 v31, v9

    .line 519
    .line 520
    move-object/from16 v30, v10

    .line 521
    .line 522
    int-to-long v9, v15

    .line 523
    invoke-static {v6, v9, v10}, Landroid/text/format/Formatter;->formatFileSize(Landroid/content/Context;J)Ljava/lang/String;

    .line 524
    .line 525
    .line 526
    move-result-object v9

    .line 527
    invoke-virtual {v14, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 528
    .line 529
    .line 530
    const-string v9, ", pool size: "

    .line 531
    .line 532
    invoke-virtual {v14, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 533
    .line 534
    .line 535
    iget v9, v4, LG4/f;->a:I

    .line 536
    .line 537
    int-to-long v9, v9

    .line 538
    invoke-static {v6, v9, v10}, Landroid/text/format/Formatter;->formatFileSize(Landroid/content/Context;J)Ljava/lang/String;

    .line 539
    .line 540
    .line 541
    move-result-object v9

    .line 542
    invoke-virtual {v14, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 543
    .line 544
    .line 545
    const-string v9, ", byte array size: "

    .line 546
    .line 547
    invoke-virtual {v14, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 548
    .line 549
    .line 550
    int-to-long v8, v8

    .line 551
    invoke-static {v6, v8, v9}, Landroid/text/format/Formatter;->formatFileSize(Landroid/content/Context;J)Ljava/lang/String;

    .line 552
    .line 553
    .line 554
    move-result-object v8

    .line 555
    invoke-virtual {v14, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 556
    .line 557
    .line 558
    const-string v8, ", memory class limited? "

    .line 559
    .line 560
    invoke-virtual {v14, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 561
    .line 562
    .line 563
    if-le v0, v11, :cond_10

    .line 564
    .line 565
    const/4 v0, 0x1

    .line 566
    goto :goto_8

    .line 567
    :cond_10
    const/4 v0, 0x0

    .line 568
    :goto_8
    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 569
    .line 570
    .line 571
    const-string v0, ", max size: "

    .line 572
    .line 573
    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 574
    .line 575
    .line 576
    int-to-long v8, v11

    .line 577
    invoke-static {v6, v8, v9}, Landroid/text/format/Formatter;->formatFileSize(Landroid/content/Context;J)Ljava/lang/String;

    .line 578
    .line 579
    .line 580
    move-result-object v0

    .line 581
    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 582
    .line 583
    .line 584
    const-string v0, ", memoryClass: "

    .line 585
    .line 586
    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 587
    .line 588
    .line 589
    invoke-virtual {v7}, Landroid/app/ActivityManager;->getMemoryClass()I

    .line 590
    .line 591
    .line 592
    move-result v0

    .line 593
    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 594
    .line 595
    .line 596
    const-string v0, ", isLowMemoryDevice: "

    .line 597
    .line 598
    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 599
    .line 600
    .line 601
    invoke-virtual {v7}, Landroid/app/ActivityManager;->isLowRamDevice()Z

    .line 602
    .line 603
    .line 604
    move-result v0

    .line 605
    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 606
    .line 607
    .line 608
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 609
    .line 610
    .line 611
    move-result-object v0

    .line 612
    invoke-static {v12, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 613
    .line 614
    .line 615
    goto :goto_9

    .line 616
    :cond_11
    move-object/from16 v31, v9

    .line 617
    .line 618
    move-object/from16 v30, v10

    .line 619
    .line 620
    :goto_9
    new-instance v8, Lya/b;

    .line 621
    .line 622
    const/16 v0, 0x19

    .line 623
    .line 624
    invoke-direct {v8, v0}, Lya/b;-><init>(I)V

    .line 625
    .line 626
    .line 627
    iget v0, v4, LG4/f;->a:I

    .line 628
    .line 629
    if-lez v0, :cond_12

    .line 630
    .line 631
    new-instance v6, LF4/g;

    .line 632
    .line 633
    int-to-long v9, v0

    .line 634
    invoke-direct {v6, v9, v10}, LF4/g;-><init>(J)V

    .line 635
    .line 636
    .line 637
    goto :goto_a

    .line 638
    :cond_12
    new-instance v6, Lx4/d;

    .line 639
    .line 640
    const/16 v0, 0x11

    .line 641
    .line 642
    invoke-direct {v6, v0}, Lx4/d;-><init>(I)V

    .line 643
    .line 644
    .line 645
    :goto_a
    new-instance v0, LF4/f;

    .line 646
    .line 647
    iget v7, v4, LG4/f;->c:I

    .line 648
    .line 649
    invoke-direct {v0, v7}, LF4/f;-><init>(I)V

    .line 650
    .line 651
    .line 652
    new-instance v7, LG4/d;

    .line 653
    .line 654
    iget v4, v4, LG4/f;->b:I

    .line 655
    .line 656
    int-to-long v9, v4

    .line 657
    invoke-direct {v7, v9, v10}, LW1/r;-><init>(J)V

    .line 658
    .line 659
    .line 660
    new-instance v4, LS3/l;

    .line 661
    .line 662
    invoke-direct {v4, v2}, LS3/l;-><init>(Landroid/content/Context;)V

    .line 663
    .line 664
    .line 665
    new-instance v9, LE4/o;

    .line 666
    .line 667
    new-instance v10, LH4/c;

    .line 668
    .line 669
    new-instance v16, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 670
    .line 671
    new-instance v22, Ljava/util/concurrent/SynchronousQueue;

    .line 672
    .line 673
    invoke-direct/range {v22 .. v22}, Ljava/util/concurrent/SynchronousQueue;-><init>()V

    .line 674
    .line 675
    .line 676
    new-instance v11, LH4/b;

    .line 677
    .line 678
    const-string v12, "source-unlimited"

    .line 679
    .line 680
    const/4 v14, 0x0

    .line 681
    invoke-direct {v11, v12, v14}, LH4/b;-><init>(Ljava/lang/String;Z)V

    .line 682
    .line 683
    .line 684
    sget-wide v19, LH4/c;->b:J

    .line 685
    .line 686
    const/16 v17, 0x0

    .line 687
    .line 688
    const v18, 0x7fffffff

    .line 689
    .line 690
    .line 691
    move-object/from16 v23, v11

    .line 692
    .line 693
    invoke-direct/range {v16 .. v23}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    .line 694
    .line 695
    .line 696
    move-object/from16 v11, v16

    .line 697
    .line 698
    invoke-direct {v10, v11}, LH4/c;-><init>(Ljava/util/concurrent/ThreadPoolExecutor;)V

    .line 699
    .line 700
    .line 701
    move-object/from16 v26, v1

    .line 702
    .line 703
    move-object/from16 v28, v3

    .line 704
    .line 705
    move-object/from16 v24, v4

    .line 706
    .line 707
    move-object/from16 v25, v5

    .line 708
    .line 709
    move-object/from16 v23, v7

    .line 710
    .line 711
    move-object/from16 v22, v9

    .line 712
    .line 713
    move-object/from16 v27, v10

    .line 714
    .line 715
    invoke-direct/range {v22 .. v28}, LE4/o;-><init>(LG4/d;LS3/l;LH4/c;LH4/c;LH4/c;LH4/c;)V

    .line 716
    .line 717
    .line 718
    move-object/from16 v3, v22

    .line 719
    .line 720
    move-object/from16 v4, v23

    .line 721
    .line 722
    sget-object v11, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 723
    .line 724
    new-instance v7, LR4/h;

    .line 725
    .line 726
    invoke-direct {v7}, LR4/h;-><init>()V

    .line 727
    .line 728
    .line 729
    new-instance v1, Lcom/bumptech/glide/b;

    .line 730
    .line 731
    move-object v5, v6

    .line 732
    move-object/from16 v10, v30

    .line 733
    .line 734
    move-object/from16 v9, v31

    .line 735
    .line 736
    move-object v6, v0

    .line 737
    invoke-direct/range {v1 .. v11}, Lcom/bumptech/glide/b;-><init>(Landroid/content/Context;LE4/o;LG4/d;LF4/a;LF4/f;LR4/h;Lya/b;Lad/I;Lx/e;Ljava/util/List;)V

    .line 738
    .line 739
    .line 740
    invoke-virtual {v13}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 741
    .line 742
    .line 743
    move-result-object v0

    .line 744
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 745
    .line 746
    .line 747
    move-result v3

    .line 748
    if-nez v3, :cond_13

    .line 749
    .line 750
    invoke-virtual {v2, v1}, Landroid/content/Context;->registerComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    .line 751
    .line 752
    .line 753
    sput-object v1, Lcom/bumptech/glide/b;->i:Lcom/bumptech/glide/b;

    .line 754
    .line 755
    const/16 v29, 0x0

    .line 756
    .line 757
    sput-boolean v29, Lcom/bumptech/glide/b;->j:Z

    .line 758
    .line 759
    return-void

    .line 760
    :cond_13
    invoke-static {v0}, LVa/M6;->j(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 761
    .line 762
    .line 763
    move-result-object v0

    .line 764
    throw v0

    .line 765
    :cond_14
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 766
    .line 767
    const-string v1, "Name must be non-null and non-empty, but given: animation"

    .line 768
    .line 769
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 770
    .line 771
    .line 772
    throw v0

    .line 773
    :cond_15
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 774
    .line 775
    const-string v1, "Name must be non-null and non-empty, but given: disk-cache"

    .line 776
    .line 777
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 778
    .line 779
    .line 780
    throw v0

    .line 781
    :cond_16
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 782
    .line 783
    const-string v1, "Name must be non-null and non-empty, but given: source"

    .line 784
    .line 785
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 786
    .line 787
    .line 788
    throw v0

    .line 789
    :cond_17
    invoke-static {v1}, LVa/M6;->j(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 790
    .line 791
    .line 792
    move-result-object v0

    .line 793
    throw v0

    .line 794
    :catch_0
    move-exception v0

    .line 795
    new-instance v1, Ljava/lang/RuntimeException;

    .line 796
    .line 797
    const-string v2, "Unable to find metadata to parse GlideModules"

    .line 798
    .line 799
    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 800
    .line 801
    .line 802
    throw v1

    .line 803
    :cond_18
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 804
    .line 805
    const-string v1, "You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead"

    .line 806
    .line 807
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 808
    .line 809
    .line 810
    throw v0
.end method

.method public static b(Landroid/content/Context;)Lcom/bumptech/glide/b;
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    sget-object v2, Lcom/bumptech/glide/b;->i:Lcom/bumptech/glide/b;

    .line 4
    .line 5
    if-nez v2, :cond_2

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    :try_start_0
    const-string v3, "com.bumptech.glide.GeneratedAppGlideModuleImpl"

    .line 12
    .line 13
    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    new-array v4, v1, [Ljava/lang/Class;

    .line 18
    .line 19
    const-class v5, Landroid/content/Context;

    .line 20
    .line 21
    aput-object v5, v4, v0

    .line 22
    .line 23
    invoke-virtual {v3, v4}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    new-array v1, v1, [Ljava/lang/Object;

    .line 32
    .line 33
    aput-object v2, v1, v0

    .line 34
    .line 35
    invoke-virtual {v3, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    check-cast v0, Lcom/bumptech/glide/GeneratedAppGlideModule;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :catch_0
    move-exception p0

    .line 43
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 44
    .line 45
    const-string v1, "GeneratedAppGlideModuleImpl is implemented incorrectly. If you\'ve manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation."

    .line 46
    .line 47
    invoke-direct {v0, v1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 48
    .line 49
    .line 50
    throw v0

    .line 51
    :catch_1
    move-exception p0

    .line 52
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 53
    .line 54
    const-string v1, "GeneratedAppGlideModuleImpl is implemented incorrectly. If you\'ve manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation."

    .line 55
    .line 56
    invoke-direct {v0, v1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 57
    .line 58
    .line 59
    throw v0

    .line 60
    :catch_2
    move-exception p0

    .line 61
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 62
    .line 63
    const-string v1, "GeneratedAppGlideModuleImpl is implemented incorrectly. If you\'ve manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation."

    .line 64
    .line 65
    invoke-direct {v0, v1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 66
    .line 67
    .line 68
    throw v0

    .line 69
    :catch_3
    move-exception p0

    .line 70
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 71
    .line 72
    const-string v1, "GeneratedAppGlideModuleImpl is implemented incorrectly. If you\'ve manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation."

    .line 73
    .line 74
    invoke-direct {v0, v1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 75
    .line 76
    .line 77
    throw v0

    .line 78
    :catch_4
    const-string v0, "Glide"

    .line 79
    .line 80
    const/4 v1, 0x5

    .line 81
    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    if-eqz v1, :cond_0

    .line 86
    .line 87
    const-string v1, "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored"

    .line 88
    .line 89
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 90
    .line 91
    .line 92
    :cond_0
    const/4 v0, 0x0

    .line 93
    :goto_0
    const-class v1, Lcom/bumptech/glide/b;

    .line 94
    .line 95
    monitor-enter v1

    .line 96
    :try_start_1
    sget-object v2, Lcom/bumptech/glide/b;->i:Lcom/bumptech/glide/b;

    .line 97
    .line 98
    if-nez v2, :cond_1

    .line 99
    .line 100
    invoke-static {p0, v0}, Lcom/bumptech/glide/b;->a(Landroid/content/Context;Lcom/bumptech/glide/GeneratedAppGlideModule;)V

    .line 101
    .line 102
    .line 103
    goto :goto_1

    .line 104
    :catchall_0
    move-exception p0

    .line 105
    goto :goto_2

    .line 106
    :cond_1
    :goto_1
    monitor-exit v1

    .line 107
    goto :goto_3

    .line 108
    :goto_2
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 109
    throw p0

    .line 110
    :cond_2
    :goto_3
    sget-object p0, Lcom/bumptech/glide/b;->i:Lcom/bumptech/glide/b;

    .line 111
    .line 112
    return-object p0
.end method


# virtual methods
.method public final c(Lcom/bumptech/glide/h;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bumptech/glide/b;->h:Ljava/util/ArrayList;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/bumptech/glide/b;->h:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    iget-object v1, p0, Lcom/bumptech/glide/b;->h:Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    monitor-exit v0

    .line 18
    return-void

    .line 19
    :catchall_0
    move-exception p1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 22
    .line 23
    const-string v1, "Cannot register already registered manager"

    .line 24
    .line 25
    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw p1

    .line 29
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    throw p1
.end method

.method public final d(Lcom/bumptech/glide/h;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/bumptech/glide/b;->h:Ljava/util/ArrayList;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/bumptech/glide/b;->h:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    iget-object v1, p0, Lcom/bumptech/glide/b;->h:Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    monitor-exit v0

    .line 18
    return-void

    .line 19
    :catchall_0
    move-exception p1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 22
    .line 23
    const-string v1, "Cannot unregister not yet registered manager"

    .line 24
    .line 25
    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw p1

    .line 29
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    throw p1
.end method

.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    return-void
.end method

.method public final onLowMemory()V
    .locals 3

    .line 1
    sget-object v0, LY4/m;->a:[C

    .line 2
    .line 3
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    const-wide/16 v0, 0x0

    .line 14
    .line 15
    iget-object v2, p0, Lcom/bumptech/glide/b;->b:LG4/d;

    .line 16
    .line 17
    invoke-virtual {v2, v0, v1}, LW1/r;->g(J)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lcom/bumptech/glide/b;->a:LF4/a;

    .line 21
    .line 22
    invoke-interface {v0}, LF4/a;->o()V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Lcom/bumptech/glide/b;->e:LF4/f;

    .line 26
    .line 27
    invoke-virtual {v0}, LF4/f;->b()V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 32
    .line 33
    const-string v1, "You must call this method on the main thread"

    .line 34
    .line 35
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw v0
.end method

.method public final onTrimMemory(I)V
    .locals 5

    .line 1
    sget-object v0, LY4/m;->a:[C

    .line 2
    .line 3
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-ne v0, v1, :cond_4

    .line 12
    .line 13
    iget-object v0, p0, Lcom/bumptech/glide/b;->h:Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    check-cast v1, Lcom/bumptech/glide/h;

    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    iget-object v0, p0, Lcom/bumptech/glide/b;->b:LG4/d;

    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    const/16 v1, 0x28

    .line 41
    .line 42
    if-lt p1, v1, :cond_1

    .line 43
    .line 44
    const-wide/16 v1, 0x0

    .line 45
    .line 46
    invoke-virtual {v0, v1, v2}, LW1/r;->g(J)V

    .line 47
    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    const/16 v1, 0x14

    .line 51
    .line 52
    if-ge p1, v1, :cond_2

    .line 53
    .line 54
    const/16 v1, 0xf

    .line 55
    .line 56
    if-ne p1, v1, :cond_3

    .line 57
    .line 58
    :cond_2
    monitor-enter v0

    .line 59
    :try_start_0
    iget-wide v1, v0, LW1/r;->a:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    .line 61
    monitor-exit v0

    .line 62
    const-wide/16 v3, 0x2

    .line 63
    .line 64
    div-long/2addr v1, v3

    .line 65
    invoke-virtual {v0, v1, v2}, LW1/r;->g(J)V

    .line 66
    .line 67
    .line 68
    :cond_3
    :goto_1
    iget-object v0, p0, Lcom/bumptech/glide/b;->a:LF4/a;

    .line 69
    .line 70
    invoke-interface {v0, p1}, LF4/a;->b(I)V

    .line 71
    .line 72
    .line 73
    iget-object v0, p0, Lcom/bumptech/glide/b;->e:LF4/f;

    .line 74
    .line 75
    invoke-virtual {v0, p1}, LF4/f;->j(I)V

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :catchall_0
    move-exception p1

    .line 80
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 81
    throw p1

    .line 82
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 83
    .line 84
    const-string v0, "You must call this method on the main thread"

    .line 85
    .line 86
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    throw p1
.end method
