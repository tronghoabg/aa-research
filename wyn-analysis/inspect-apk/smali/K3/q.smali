.class public final LK3/q;
.super LJ3/x;
.source "SourceFile"


# static fields
.field public static k:LK3/q;

.field public static l:LK3/q;

.field public static final m:Ljava/lang/Object;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:LJ3/b;

.field public final c:Landroidx/work/impl/WorkDatabase;

.field public final d:Lb7/k;

.field public final e:Ljava/util/List;

.field public final f:LK3/f;

.field public final g:Lxa/d;

.field public h:Z

.field public i:Landroid/content/BroadcastReceiver$PendingResult;

.field public final j:LS3/n;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "WorkManagerImpl"

    .line 2
    .line 3
    invoke-static {v0}, LJ3/r;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    sput-object v0, LK3/q;->k:LK3/q;

    .line 8
    .line 9
    sput-object v0, LK3/q;->l:LK3/q;

    .line 10
    .line 11
    new-instance v0, Ljava/lang/Object;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    sput-object v0, LK3/q;->m:Ljava/lang/Object;

    .line 17
    .line 18
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;LJ3/b;Lb7/k;)V
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v4, p2

    .line 4
    .line 5
    move-object/from16 v5, p3

    .line 6
    .line 7
    const/16 v0, 0x18

    .line 8
    .line 9
    const/4 v2, 0x2

    .line 10
    const/4 v8, 0x0

    .line 11
    const/4 v3, 0x1

    .line 12
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 13
    .line 14
    .line 15
    move-result-object v6

    .line 16
    const v7, 0x7f050008

    .line 17
    .line 18
    .line 19
    invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getBoolean(I)Z

    .line 20
    .line 21
    .line 22
    move-result v6

    .line 23
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 24
    .line 25
    .line 26
    move-result-object v7

    .line 27
    iget-object v9, v5, Lb7/k;->b:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v9, LT3/m;

    .line 30
    .line 31
    const-string v10, "context"

    .line 32
    .line 33
    invoke-static {v7, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const-string v10, "queryExecutor"

    .line 37
    .line 38
    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    const-class v10, Landroidx/work/impl/WorkDatabase;

    .line 42
    .line 43
    if-eqz v6, :cond_0

    .line 44
    .line 45
    new-instance v6, Lk3/k;

    .line 46
    .line 47
    const/4 v11, 0x0

    .line 48
    invoke-direct {v6, v7, v10, v11}, Lk3/k;-><init>(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    iput-boolean v3, v6, Lk3/k;->j:Z

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    const-string v6, "androidx.work.workdb"

    .line 55
    .line 56
    invoke-static {v7, v10, v6}, Lka/e0;->k(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;)Lk3/k;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    new-instance v10, LK3/l;

    .line 61
    .line 62
    invoke-direct {v10, v7}, LK3/l;-><init>(Landroid/content/Context;)V

    .line 63
    .line 64
    .line 65
    iput-object v10, v6, Lk3/k;->i:LK3/l;

    .line 66
    .line 67
    :goto_0
    iput-object v9, v6, Lk3/k;->g:Ljava/util/concurrent/Executor;

    .line 68
    .line 69
    sget-object v9, LK3/b;->a:LK3/b;

    .line 70
    .line 71
    iget-object v10, v6, Lk3/k;->d:Ljava/util/ArrayList;

    .line 72
    .line 73
    invoke-virtual {v10, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    new-array v9, v3, [Ll3/a;

    .line 77
    .line 78
    sget-object v10, LK3/d;->g:LK3/d;

    .line 79
    .line 80
    aput-object v10, v9, v8

    .line 81
    .line 82
    invoke-virtual {v6, v9}, Lk3/k;->a([Ll3/a;)V

    .line 83
    .line 84
    .line 85
    new-instance v9, LK3/g;

    .line 86
    .line 87
    const/4 v10, 0x3

    .line 88
    invoke-direct {v9, v7, v2, v10}, LK3/g;-><init>(Landroid/content/Context;II)V

    .line 89
    .line 90
    .line 91
    new-array v10, v3, [Ll3/a;

    .line 92
    .line 93
    aput-object v9, v10, v8

    .line 94
    .line 95
    invoke-virtual {v6, v10}, Lk3/k;->a([Ll3/a;)V

    .line 96
    .line 97
    .line 98
    new-array v9, v3, [Ll3/a;

    .line 99
    .line 100
    sget-object v10, LK3/d;->h:LK3/d;

    .line 101
    .line 102
    aput-object v10, v9, v8

    .line 103
    .line 104
    invoke-virtual {v6, v9}, Lk3/k;->a([Ll3/a;)V

    .line 105
    .line 106
    .line 107
    new-array v9, v3, [Ll3/a;

    .line 108
    .line 109
    sget-object v10, LK3/d;->i:LK3/d;

    .line 110
    .line 111
    aput-object v10, v9, v8

    .line 112
    .line 113
    invoke-virtual {v6, v9}, Lk3/k;->a([Ll3/a;)V

    .line 114
    .line 115
    .line 116
    new-instance v9, LK3/g;

    .line 117
    .line 118
    const/4 v10, 0x5

    .line 119
    const/4 v11, 0x6

    .line 120
    invoke-direct {v9, v7, v10, v11}, LK3/g;-><init>(Landroid/content/Context;II)V

    .line 121
    .line 122
    .line 123
    new-array v10, v3, [Ll3/a;

    .line 124
    .line 125
    aput-object v9, v10, v8

    .line 126
    .line 127
    invoke-virtual {v6, v10}, Lk3/k;->a([Ll3/a;)V

    .line 128
    .line 129
    .line 130
    new-array v9, v3, [Ll3/a;

    .line 131
    .line 132
    sget-object v10, LK3/d;->j:LK3/d;

    .line 133
    .line 134
    aput-object v10, v9, v8

    .line 135
    .line 136
    invoke-virtual {v6, v9}, Lk3/k;->a([Ll3/a;)V

    .line 137
    .line 138
    .line 139
    new-array v9, v3, [Ll3/a;

    .line 140
    .line 141
    sget-object v10, LK3/d;->k:LK3/d;

    .line 142
    .line 143
    aput-object v10, v9, v8

    .line 144
    .line 145
    invoke-virtual {v6, v9}, Lk3/k;->a([Ll3/a;)V

    .line 146
    .line 147
    .line 148
    new-array v9, v3, [Ll3/a;

    .line 149
    .line 150
    sget-object v10, LK3/d;->l:LK3/d;

    .line 151
    .line 152
    aput-object v10, v9, v8

    .line 153
    .line 154
    invoke-virtual {v6, v9}, Lk3/k;->a([Ll3/a;)V

    .line 155
    .line 156
    .line 157
    new-instance v9, LK3/g;

    .line 158
    .line 159
    invoke-direct {v9, v7}, LK3/g;-><init>(Landroid/content/Context;)V

    .line 160
    .line 161
    .line 162
    new-array v10, v3, [Ll3/a;

    .line 163
    .line 164
    aput-object v9, v10, v8

    .line 165
    .line 166
    invoke-virtual {v6, v10}, Lk3/k;->a([Ll3/a;)V

    .line 167
    .line 168
    .line 169
    new-instance v9, LK3/g;

    .line 170
    .line 171
    const/16 v10, 0xa

    .line 172
    .line 173
    const/16 v11, 0xb

    .line 174
    .line 175
    invoke-direct {v9, v7, v10, v11}, LK3/g;-><init>(Landroid/content/Context;II)V

    .line 176
    .line 177
    .line 178
    new-array v7, v3, [Ll3/a;

    .line 179
    .line 180
    aput-object v9, v7, v8

    .line 181
    .line 182
    invoke-virtual {v6, v7}, Lk3/k;->a([Ll3/a;)V

    .line 183
    .line 184
    .line 185
    new-array v7, v3, [Ll3/a;

    .line 186
    .line 187
    sget-object v9, LK3/d;->d:LK3/d;

    .line 188
    .line 189
    aput-object v9, v7, v8

    .line 190
    .line 191
    invoke-virtual {v6, v7}, Lk3/k;->a([Ll3/a;)V

    .line 192
    .line 193
    .line 194
    new-array v7, v3, [Ll3/a;

    .line 195
    .line 196
    sget-object v9, LK3/d;->e:LK3/d;

    .line 197
    .line 198
    aput-object v9, v7, v8

    .line 199
    .line 200
    invoke-virtual {v6, v7}, Lk3/k;->a([Ll3/a;)V

    .line 201
    .line 202
    .line 203
    new-array v7, v3, [Ll3/a;

    .line 204
    .line 205
    sget-object v9, LK3/d;->f:LK3/d;

    .line 206
    .line 207
    aput-object v9, v7, v8

    .line 208
    .line 209
    invoke-virtual {v6, v7}, Lk3/k;->a([Ll3/a;)V

    .line 210
    .line 211
    .line 212
    iput-boolean v8, v6, Lk3/k;->l:Z

    .line 213
    .line 214
    iput-boolean v3, v6, Lk3/k;->m:Z

    .line 215
    .line 216
    invoke-virtual {v6}, Lk3/k;->b()Lk3/m;

    .line 217
    .line 218
    .line 219
    move-result-object v6

    .line 220
    check-cast v6, Landroidx/work/impl/WorkDatabase;

    .line 221
    .line 222
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 223
    .line 224
    .line 225
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 226
    .line 227
    .line 228
    move-result-object v7

    .line 229
    new-instance v9, LJ3/r;

    .line 230
    .line 231
    iget v10, v4, LJ3/b;->f:I

    .line 232
    .line 233
    invoke-direct {v9, v10}, LJ3/r;-><init>(I)V

    .line 234
    .line 235
    .line 236
    sget-object v10, LJ3/r;->b:Ljava/lang/Object;

    .line 237
    .line 238
    monitor-enter v10

    .line 239
    :try_start_0
    sput-object v9, LJ3/r;->c:LJ3/r;

    .line 240
    .line 241
    monitor-exit v10
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 242
    new-instance v9, LS3/n;

    .line 243
    .line 244
    const-string v10, "context"

    .line 245
    .line 246
    invoke-static {v7, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    new-instance v10, LQ3/a;

    .line 250
    .line 251
    invoke-virtual {v7}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 252
    .line 253
    .line 254
    move-result-object v11

    .line 255
    const-string v12, "context.applicationContext"

    .line 256
    .line 257
    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 258
    .line 259
    .line 260
    invoke-direct {v10, v11, v5, v8}, LQ3/a;-><init>(Landroid/content/Context;Lb7/k;I)V

    .line 261
    .line 262
    .line 263
    new-instance v11, LQ3/a;

    .line 264
    .line 265
    invoke-virtual {v7}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 266
    .line 267
    .line 268
    move-result-object v13

    .line 269
    invoke-static {v13, v12}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 270
    .line 271
    .line 272
    invoke-direct {v11, v13, v5, v3}, LQ3/a;-><init>(Landroid/content/Context;Lb7/k;I)V

    .line 273
    .line 274
    .line 275
    invoke-virtual {v7}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 276
    .line 277
    .line 278
    move-result-object v13

    .line 279
    invoke-static {v13, v12}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 280
    .line 281
    .line 282
    sget-object v14, LQ3/j;->a:Ljava/lang/String;

    .line 283
    .line 284
    sget v14, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 285
    .line 286
    if-lt v14, v0, :cond_1

    .line 287
    .line 288
    new-instance v14, LQ3/i;

    .line 289
    .line 290
    invoke-direct {v14, v13, v5}, LQ3/i;-><init>(Landroid/content/Context;Lb7/k;)V

    .line 291
    .line 292
    .line 293
    goto :goto_1

    .line 294
    :cond_1
    new-instance v14, LQ3/k;

    .line 295
    .line 296
    invoke-direct {v14, v13, v5}, LQ3/k;-><init>(Landroid/content/Context;Lb7/k;)V

    .line 297
    .line 298
    .line 299
    :goto_1
    new-instance v13, LQ3/a;

    .line 300
    .line 301
    invoke-virtual {v7}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 302
    .line 303
    .line 304
    move-result-object v15

    .line 305
    invoke-static {v15, v12}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 306
    .line 307
    .line 308
    invoke-direct {v13, v15, v5, v2}, LQ3/a;-><init>(Landroid/content/Context;Lb7/k;I)V

    .line 309
    .line 310
    .line 311
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 312
    .line 313
    .line 314
    iput-object v10, v9, LS3/n;->a:Ljava/lang/Object;

    .line 315
    .line 316
    iput-object v11, v9, LS3/n;->b:Ljava/lang/Object;

    .line 317
    .line 318
    iput-object v14, v9, LS3/n;->c:Ljava/lang/Object;

    .line 319
    .line 320
    iput-object v13, v9, LS3/n;->d:Ljava/lang/Object;

    .line 321
    .line 322
    iput-object v9, v1, LK3/q;->j:LS3/n;

    .line 323
    .line 324
    sget-object v10, LK3/i;->a:Ljava/lang/String;

    .line 325
    .line 326
    new-instance v10, LN3/b;

    .line 327
    .line 328
    invoke-direct {v10, v7, v1}, LN3/b;-><init>(Landroid/content/Context;LK3/q;)V

    .line 329
    .line 330
    .line 331
    const-class v11, Landroidx/work/impl/background/systemjob/SystemJobService;

    .line 332
    .line 333
    invoke-static {v7, v11, v3}, LT3/k;->a(Landroid/content/Context;Ljava/lang/Class;Z)V

    .line 334
    .line 335
    .line 336
    invoke-static {}, LJ3/r;->d()LJ3/r;

    .line 337
    .line 338
    .line 339
    move-result-object v11

    .line 340
    sget-object v12, LK3/i;->a:Ljava/lang/String;

    .line 341
    .line 342
    const-string v13, "Created SystemJobScheduler and enabled SystemJobService"

    .line 343
    .line 344
    invoke-virtual {v11, v12, v13}, LJ3/r;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 345
    .line 346
    .line 347
    new-instance v11, LL3/b;

    .line 348
    .line 349
    invoke-direct {v11, v7, v4, v9, v1}, LL3/b;-><init>(Landroid/content/Context;LJ3/b;LS3/n;LK3/q;)V

    .line 350
    .line 351
    .line 352
    new-array v2, v2, [LK3/h;

    .line 353
    .line 354
    aput-object v10, v2, v8

    .line 355
    .line 356
    aput-object v11, v2, v3

    .line 357
    .line 358
    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 359
    .line 360
    .line 361
    move-result-object v7

    .line 362
    new-instance v2, LK3/f;

    .line 363
    .line 364
    move-object/from16 v3, p1

    .line 365
    .line 366
    invoke-direct/range {v2 .. v7}, LK3/f;-><init>(Landroid/content/Context;LJ3/b;Lb7/k;Landroidx/work/impl/WorkDatabase;Ljava/util/List;)V

    .line 367
    .line 368
    .line 369
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 370
    .line 371
    .line 372
    move-result-object v3

    .line 373
    iput-object v3, v1, LK3/q;->a:Landroid/content/Context;

    .line 374
    .line 375
    iput-object v4, v1, LK3/q;->b:LJ3/b;

    .line 376
    .line 377
    iput-object v5, v1, LK3/q;->d:Lb7/k;

    .line 378
    .line 379
    iput-object v6, v1, LK3/q;->c:Landroidx/work/impl/WorkDatabase;

    .line 380
    .line 381
    iput-object v7, v1, LK3/q;->e:Ljava/util/List;

    .line 382
    .line 383
    iput-object v2, v1, LK3/q;->f:LK3/f;

    .line 384
    .line 385
    new-instance v2, Lxa/d;

    .line 386
    .line 387
    const/16 v4, 0x17

    .line 388
    .line 389
    invoke-direct {v2, v6, v4}, Lxa/d;-><init>(Ljava/lang/Object;I)V

    .line 390
    .line 391
    .line 392
    iput-object v2, v1, LK3/q;->g:Lxa/d;

    .line 393
    .line 394
    iput-boolean v8, v1, LK3/q;->h:Z

    .line 395
    .line 396
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 397
    .line 398
    if-lt v2, v0, :cond_3

    .line 399
    .line 400
    invoke-static {v3}, LK3/p;->a(Landroid/content/Context;)Z

    .line 401
    .line 402
    .line 403
    move-result v0

    .line 404
    if-nez v0, :cond_2

    .line 405
    .line 406
    goto :goto_2

    .line 407
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 408
    .line 409
    const-string v2, "Cannot initialize WorkManager in direct boot mode"

    .line 410
    .line 411
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 412
    .line 413
    .line 414
    throw v0

    .line 415
    :cond_3
    :goto_2
    iget-object v0, v1, LK3/q;->d:Lb7/k;

    .line 416
    .line 417
    new-instance v2, LT3/f;

    .line 418
    .line 419
    invoke-direct {v2, v3, v1}, LT3/f;-><init>(Landroid/content/Context;LK3/q;)V

    .line 420
    .line 421
    .line 422
    invoke-virtual {v0, v2}, Lb7/k;->v(Ljava/lang/Runnable;)V

    .line 423
    .line 424
    .line 425
    return-void

    .line 426
    :catchall_0
    move-exception v0

    .line 427
    :try_start_1
    monitor-exit v10
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 428
    throw v0
.end method

.method public static b()LK3/q;
    .locals 2

    .line 1
    sget-object v0, LK3/q;->m:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, LK3/q;->k:LK3/q;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    monitor-exit v0

    .line 9
    return-object v1

    .line 10
    :catchall_0
    move-exception v1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    sget-object v1, LK3/q;->l:LK3/q;

    .line 13
    .line 14
    monitor-exit v0

    .line 15
    return-object v1

    .line 16
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    throw v1
.end method

.method public static c(Landroid/content/Context;)LK3/q;
    .locals 2

    .line 1
    sget-object v0, LK3/q;->m:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-static {}, LK3/q;->b()LK3/q;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    monitor-exit v0

    .line 11
    return-object v1

    .line 12
    :catchall_0
    move-exception p0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 15
    .line 16
    .line 17
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 18
    .line 19
    const-string v1, "WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider."

    .line 20
    .line 21
    invoke-direct {p0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    throw p0

    .line 25
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    throw p0
.end method

.method public static d(Landroid/content/Context;LJ3/b;)V
    .locals 4

    .line 1
    sget-object v0, LK3/q;->m:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, LK3/q;->k:LK3/q;

    .line 5
    .line 6
    if-eqz v1, :cond_1

    .line 7
    .line 8
    sget-object v2, LK3/q;->l:LK3/q;

    .line 9
    .line 10
    if-nez v2, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 14
    .line 15
    const-string p1, "WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information."

    .line 16
    .line 17
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw p0

    .line 21
    :catchall_0
    move-exception p0

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    :goto_0
    if-nez v1, :cond_3

    .line 24
    .line 25
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    sget-object v1, LK3/q;->l:LK3/q;

    .line 30
    .line 31
    if-nez v1, :cond_2

    .line 32
    .line 33
    new-instance v1, LK3/q;

    .line 34
    .line 35
    new-instance v2, Lb7/k;

    .line 36
    .line 37
    iget-object v3, p1, LJ3/b;->b:Ljava/util/concurrent/ExecutorService;

    .line 38
    .line 39
    invoke-direct {v2, v3}, Lb7/k;-><init>(Ljava/util/concurrent/ExecutorService;)V

    .line 40
    .line 41
    .line 42
    invoke-direct {v1, p0, p1, v2}, LK3/q;-><init>(Landroid/content/Context;LJ3/b;Lb7/k;)V

    .line 43
    .line 44
    .line 45
    sput-object v1, LK3/q;->l:LK3/q;

    .line 46
    .line 47
    :cond_2
    sget-object p0, LK3/q;->l:LK3/q;

    .line 48
    .line 49
    sput-object p0, LK3/q;->k:LK3/q;

    .line 50
    .line 51
    :cond_3
    monitor-exit v0

    .line 52
    return-void

    .line 53
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    throw p0
.end method


# virtual methods
.method public final e()V
    .locals 2

    .line 1
    sget-object v0, LK3/q;->m:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x1

    .line 5
    :try_start_0
    iput-boolean v1, p0, LK3/q;->h:Z

    .line 6
    .line 7
    iget-object v1, p0, LK3/q;->i:Landroid/content/BroadcastReceiver$PendingResult;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v1}, Landroid/content/BroadcastReceiver$PendingResult;->finish()V

    .line 12
    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    iput-object v1, p0, LK3/q;->i:Landroid/content/BroadcastReceiver$PendingResult;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :catchall_0
    move-exception v1

    .line 19
    goto :goto_1

    .line 20
    :cond_0
    :goto_0
    monitor-exit v0

    .line 21
    return-void

    .line 22
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    throw v1
.end method

.method public final f()V
    .locals 4

    .line 1
    iget-object v0, p0, LK3/q;->c:Landroidx/work/impl/WorkDatabase;

    .line 2
    .line 3
    iget-object v1, p0, LK3/q;->a:Landroid/content/Context;

    .line 4
    .line 5
    sget-object v2, LN3/b;->e:Ljava/lang/String;

    .line 6
    .line 7
    const-string v2, "jobscheduler"

    .line 8
    .line 9
    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    check-cast v2, Landroid/app/job/JobScheduler;

    .line 14
    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    invoke-static {v1, v2}, LN3/b;->f(Landroid/content/Context;Landroid/app/job/JobScheduler;)Ljava/util/ArrayList;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-nez v3, :cond_0

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-eqz v3, :cond_0

    .line 38
    .line 39
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    check-cast v3, Landroid/app/job/JobInfo;

    .line 44
    .line 45
    invoke-virtual {v3}, Landroid/app/job/JobInfo;->getId()I

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    invoke-static {v2, v3}, LN3/b;->b(Landroid/app/job/JobScheduler;I)V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->u()LS3/q;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    iget-object v2, v1, LS3/q;->a:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v2, Landroidx/work/impl/WorkDatabase_Impl;

    .line 60
    .line 61
    invoke-virtual {v2}, Lk3/m;->b()V

    .line 62
    .line 63
    .line 64
    iget-object v1, v1, LS3/q;->k:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v1, LS3/h;

    .line 67
    .line 68
    invoke-virtual {v1}, LE9/c;->a()Lo3/g;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    invoke-virtual {v2}, Lk3/m;->c()V

    .line 73
    .line 74
    .line 75
    :try_start_0
    invoke-interface {v3}, Lo3/g;->g()I

    .line 76
    .line 77
    .line 78
    invoke-virtual {v2}, Lk3/m;->n()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2}, Lk3/m;->j()V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1, v3}, LE9/c;->q(Lo3/g;)V

    .line 85
    .line 86
    .line 87
    iget-object v1, p0, LK3/q;->b:LJ3/b;

    .line 88
    .line 89
    iget-object v2, p0, LK3/q;->e:Ljava/util/List;

    .line 90
    .line 91
    invoke-static {v1, v0, v2}, LK3/i;->a(LJ3/b;Landroidx/work/impl/WorkDatabase;Ljava/util/List;)V

    .line 92
    .line 93
    .line 94
    return-void

    .line 95
    :catchall_0
    move-exception v0

    .line 96
    invoke-virtual {v2}, Lk3/m;->j()V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v1, v3}, LE9/c;->q(Lo3/g;)V

    .line 100
    .line 101
    .line 102
    throw v0
.end method

.method public final g(LK3/j;Lb7/k;)V
    .locals 3

    .line 1
    iget-object v0, p0, LK3/q;->d:Lb7/k;

    .line 2
    .line 3
    new-instance v1, LA7/w0;

    .line 4
    .line 5
    const/16 v2, 0x12

    .line 6
    .line 7
    invoke-direct {v1, v2}, LA7/w0;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object p0, v1, LA7/w0;->d:Ljava/lang/Object;

    .line 11
    .line 12
    iput-object p1, v1, LA7/w0;->b:Ljava/lang/Object;

    .line 13
    .line 14
    iput-object p2, v1, LA7/w0;->c:Ljava/lang/Object;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Lb7/k;->v(Ljava/lang/Runnable;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final h(LK3/j;)V
    .locals 3

    .line 1
    iget-object v0, p0, LK3/q;->d:Lb7/k;

    .line 2
    .line 3
    new-instance v1, LT3/n;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v1, p0, p1, v2}, LT3/n;-><init>(LK3/q;LK3/j;Z)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lb7/k;->v(Ljava/lang/Runnable;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
