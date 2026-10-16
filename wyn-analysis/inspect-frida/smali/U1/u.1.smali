.class public final LU1/u;
.super LA7/B0;
.source "SourceFile"

# interfaces
.implements LU1/m;


# instance fields
.field public final A:LG4/c;

.field public final B:J

.field public C:I

.field public D:Z

.field public E:I

.field public F:I

.field public G:Z

.field public final H:LU1/a0;

.field public I:Lk2/g0;

.field public final J:LU1/l;

.field public K:LN1/G;

.field public L:LN1/z;

.field public M:LN1/n;

.field public N:Landroid/view/Surface;

.field public O:Landroid/view/Surface;

.field public P:Landroid/view/SurfaceHolder;

.field public Q:Z

.field public final R:I

.field public S:LQ1/p;

.field public final T:I

.field public U:LN1/c;

.field public V:F

.field public W:Z

.field public final X:Z

.field public Y:Z

.field public final Z:I

.field public a0:Z

.field public final b:Ln2/t;

.field public b0:LN1/Y;

.field public final c:LN1/G;

.field public c0:LN1/z;

.field public final d:Ls8/b;

.field public d0:LU1/P;

.field public final e:Landroid/content/Context;

.field public e0:I

.field public final f:LU1/u;

.field public f0:J

.field public final g:[LU1/W;

.field public final h:Ln2/s;

.field public final i:LQ1/s;

.field public final j:LU1/o;

.field public final k:LU1/z;

.field public final l:LQ1/j;

.field public final m:Ljava/util/concurrent/CopyOnWriteArraySet;

.field public final n:LN1/L;

.field public final o:Ljava/util/ArrayList;

.field public final p:Z

.field public final q:Lk2/G;

.field public final r:LV1/d;

.field public final s:Landroid/os/Looper;

.field public final t:Lo2/d;

.field public final u:LQ1/q;

.field public final v:LU1/r;

.field public final w:LU1/s;

.field public final x:LE5/b;

.field public final y:LU1/c;

.field public final z:LJ4/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "media3.exoplayer"

    .line 2
    .line 3
    invoke-static {v0}, LN1/x;->a(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public constructor <init>(LU1/k;)V
    .locals 42

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    const/16 v2, 0x1f

    .line 6
    .line 7
    const/16 v5, 0x14

    .line 8
    .line 9
    const/4 v6, 0x3

    .line 10
    const/4 v7, 0x1

    .line 11
    const/4 v8, 0x0

    .line 12
    const-string v9, "audio"

    .line 13
    .line 14
    const-string v10, " [AndroidXMedia3/1.5.1] ["

    .line 15
    .line 16
    const-string v11, "Init "

    .line 17
    .line 18
    const/4 v12, 0x6

    .line 19
    invoke-direct {v1, v12}, LA7/B0;-><init>(I)V

    .line 20
    .line 21
    .line 22
    new-instance v13, Ls8/b;

    .line 23
    .line 24
    invoke-direct {v13, v6}, Ls8/b;-><init>(I)V

    .line 25
    .line 26
    .line 27
    iput-object v13, v1, LU1/u;->d:Ls8/b;

    .line 28
    .line 29
    :try_start_0
    const-string v13, "ExoPlayerImpl"

    .line 30
    .line 31
    new-instance v14, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    invoke-direct {v14, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-static {v1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 37
    .line 38
    .line 39
    move-result v11

    .line 40
    invoke-static {v11}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v11

    .line 44
    invoke-virtual {v14, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v14, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    sget-object v10, LQ1/x;->e:Ljava/lang/String;

    .line 51
    .line 52
    invoke-virtual {v14, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string v10, "]"

    .line 56
    .line 57
    invoke-virtual {v14, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v10

    .line 64
    invoke-static {v13, v10}, LQ1/k;->o(Ljava/lang/String;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    iget-object v10, v0, LU1/k;->a:Landroid/content/Context;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 68
    .line 69
    iget-object v11, v0, LU1/k;->i:Landroid/os/Looper;

    .line 70
    .line 71
    :try_start_1
    invoke-virtual {v10}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 72
    .line 73
    .line 74
    move-result-object v13

    .line 75
    iput-object v13, v1, LU1/u;->e:Landroid/content/Context;

    .line 76
    .line 77
    iget-object v13, v0, LU1/k;->h:LJ9/x;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 78
    .line 79
    iget-object v14, v0, LU1/k;->b:LQ1/q;

    .line 80
    .line 81
    :try_start_2
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    new-instance v13, LV1/d;

    .line 85
    .line 86
    invoke-direct {v13, v14}, LV1/d;-><init>(LQ1/q;)V

    .line 87
    .line 88
    .line 89
    iput-object v13, v1, LU1/u;->r:LV1/d;

    .line 90
    .line 91
    iget v13, v0, LU1/k;->j:I

    .line 92
    .line 93
    iput v13, v1, LU1/u;->Z:I

    .line 94
    .line 95
    iget-object v13, v0, LU1/k;->k:LN1/c;

    .line 96
    .line 97
    iput-object v13, v1, LU1/u;->U:LN1/c;

    .line 98
    .line 99
    iget v13, v0, LU1/k;->l:I

    .line 100
    .line 101
    iput v13, v1, LU1/u;->R:I

    .line 102
    .line 103
    iput-boolean v8, v1, LU1/u;->W:Z

    .line 104
    .line 105
    iget-wide v12, v0, LU1/k;->q:J

    .line 106
    .line 107
    iput-wide v12, v1, LU1/u;->B:J

    .line 108
    .line 109
    new-instance v12, LU1/r;

    .line 110
    .line 111
    invoke-direct {v12, v1}, LU1/r;-><init>(LU1/u;)V

    .line 112
    .line 113
    .line 114
    iput-object v12, v1, LU1/u;->v:LU1/r;

    .line 115
    .line 116
    new-instance v13, LU1/s;

    .line 117
    .line 118
    invoke-direct {v13}, Ljava/lang/Object;-><init>()V

    .line 119
    .line 120
    .line 121
    iput-object v13, v1, LU1/u;->w:LU1/s;

    .line 122
    .line 123
    new-instance v13, Landroid/os/Handler;

    .line 124
    .line 125
    invoke-direct {v13, v11}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 126
    .line 127
    .line 128
    iget-object v15, v0, LU1/k;->c:Lk8/p;

    .line 129
    .line 130
    invoke-interface {v15}, Lk8/p;->get()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v15

    .line 134
    move-object/from16 v16, v15

    .line 135
    .line 136
    check-cast v16, LU1/Z;

    .line 137
    .line 138
    move-object/from16 v19, v12

    .line 139
    .line 140
    move-object/from16 v20, v12

    .line 141
    .line 142
    move-object/from16 v21, v12

    .line 143
    .line 144
    move-object/from16 v18, v12

    .line 145
    .line 146
    move-object/from16 v17, v13

    .line 147
    .line 148
    invoke-interface/range {v16 .. v21}, LU1/Z;->a(Landroid/os/Handler;LU1/r;LU1/r;LU1/r;LU1/r;)[LU1/W;

    .line 149
    .line 150
    .line 151
    move-result-object v12

    .line 152
    iput-object v12, v1, LU1/u;->g:[LU1/W;

    .line 153
    .line 154
    array-length v15, v12

    .line 155
    if-lez v15, :cond_0

    .line 156
    .line 157
    move v15, v7

    .line 158
    goto :goto_0

    .line 159
    :cond_0
    move v15, v8

    .line 160
    :goto_0
    invoke-static {v15}, LQ1/k;->g(Z)V

    .line 161
    .line 162
    .line 163
    iget-object v15, v0, LU1/k;->e:LE5/p;

    .line 164
    .line 165
    invoke-virtual {v15}, LE5/p;->get()Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v15

    .line 169
    check-cast v15, Ln2/s;

    .line 170
    .line 171
    iput-object v15, v1, LU1/u;->h:Ln2/s;

    .line 172
    .line 173
    iget-object v15, v0, LU1/k;->d:Lk8/p;

    .line 174
    .line 175
    invoke-interface {v15}, Lk8/p;->get()Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v15

    .line 179
    check-cast v15, Lk2/G;

    .line 180
    .line 181
    iput-object v15, v1, LU1/u;->q:Lk2/G;

    .line 182
    .line 183
    iget-object v15, v0, LU1/k;->g:LE5/p;

    .line 184
    .line 185
    invoke-virtual {v15}, LE5/p;->get()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v15

    .line 189
    check-cast v15, Lo2/d;

    .line 190
    .line 191
    iput-object v15, v1, LU1/u;->t:Lo2/d;

    .line 192
    .line 193
    iget-boolean v15, v0, LU1/k;->m:Z

    .line 194
    .line 195
    iput-boolean v15, v1, LU1/u;->p:Z

    .line 196
    .line 197
    iget-object v15, v0, LU1/k;->n:LU1/a0;

    .line 198
    .line 199
    iput-object v15, v1, LU1/u;->H:LU1/a0;

    .line 200
    .line 201
    iput-object v11, v1, LU1/u;->s:Landroid/os/Looper;

    .line 202
    .line 203
    iput-object v14, v1, LU1/u;->u:LQ1/q;

    .line 204
    .line 205
    iput-object v1, v1, LU1/u;->f:LU1/u;

    .line 206
    .line 207
    new-instance v15, LQ1/j;

    .line 208
    .line 209
    new-instance v3, LU1/o;

    .line 210
    .line 211
    invoke-direct {v3, v1}, LU1/o;-><init>(LU1/u;)V

    .line 212
    .line 213
    .line 214
    invoke-direct {v15, v11, v14, v3}, LQ1/j;-><init>(Landroid/os/Looper;LQ1/q;LQ1/h;)V

    .line 215
    .line 216
    .line 217
    iput-object v15, v1, LU1/u;->l:LQ1/j;

    .line 218
    .line 219
    new-instance v3, Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 220
    .line 221
    invoke-direct {v3}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    .line 222
    .line 223
    .line 224
    iput-object v3, v1, LU1/u;->m:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 225
    .line 226
    new-instance v3, Ljava/util/ArrayList;

    .line 227
    .line 228
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 229
    .line 230
    .line 231
    iput-object v3, v1, LU1/u;->o:Ljava/util/ArrayList;

    .line 232
    .line 233
    new-instance v3, Lk2/g0;

    .line 234
    .line 235
    invoke-direct {v3}, Lk2/g0;-><init>()V

    .line 236
    .line 237
    .line 238
    iput-object v3, v1, LU1/u;->I:Lk2/g0;

    .line 239
    .line 240
    sget-object v3, LU1/l;->a:LU1/l;

    .line 241
    .line 242
    iput-object v3, v1, LU1/u;->J:LU1/l;

    .line 243
    .line 244
    new-instance v3, Ln2/t;

    .line 245
    .line 246
    array-length v11, v12

    .line 247
    new-array v11, v11, [LU1/Y;

    .line 248
    .line 249
    array-length v12, v12

    .line 250
    new-array v12, v12, [Ln2/q;

    .line 251
    .line 252
    sget-object v14, LN1/V;->b:LN1/V;

    .line 253
    .line 254
    const/4 v15, 0x0

    .line 255
    invoke-direct {v3, v11, v12, v14, v15}, Ln2/t;-><init>([LU1/Y;[Ln2/q;LN1/V;LR1/q;)V

    .line 256
    .line 257
    .line 258
    iput-object v3, v1, LU1/u;->b:Ln2/t;

    .line 259
    .line 260
    new-instance v3, LN1/L;

    .line 261
    .line 262
    invoke-direct {v3}, LN1/L;-><init>()V

    .line 263
    .line 264
    .line 265
    iput-object v3, v1, LU1/u;->n:LN1/L;

    .line 266
    .line 267
    new-instance v3, Landroid/util/SparseBooleanArray;

    .line 268
    .line 269
    invoke-direct {v3}, Landroid/util/SparseBooleanArray;-><init>()V

    .line 270
    .line 271
    .line 272
    new-array v11, v5, [I

    .line 273
    .line 274
    fill-array-data v11, :array_0

    .line 275
    .line 276
    .line 277
    move v12, v8

    .line 278
    :goto_1
    if-ge v12, v5, :cond_1

    .line 279
    .line 280
    aget v14, v11, v12

    .line 281
    .line 282
    xor-int/lit8 v17, v8, 0x1

    .line 283
    .line 284
    invoke-static/range {v17 .. v17}, LQ1/k;->g(Z)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v3, v14, v7}, Landroid/util/SparseBooleanArray;->append(IZ)V

    .line 288
    .line 289
    .line 290
    add-int/2addr v12, v7

    .line 291
    goto :goto_1

    .line 292
    :cond_1
    iget-object v5, v1, LU1/u;->h:Ln2/s;

    .line 293
    .line 294
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 295
    .line 296
    .line 297
    xor-int/lit8 v5, v8, 0x1

    .line 298
    .line 299
    invoke-static {v5}, LQ1/k;->g(Z)V

    .line 300
    .line 301
    .line 302
    const/16 v5, 0x1d

    .line 303
    .line 304
    invoke-virtual {v3, v5, v7}, Landroid/util/SparseBooleanArray;->append(IZ)V

    .line 305
    .line 306
    .line 307
    new-instance v5, LN1/G;

    .line 308
    .line 309
    xor-int/lit8 v11, v8, 0x1

    .line 310
    .line 311
    invoke-static {v11}, LQ1/k;->g(Z)V

    .line 312
    .line 313
    .line 314
    new-instance v11, LN1/l;

    .line 315
    .line 316
    invoke-direct {v11, v3}, LN1/l;-><init>(Landroid/util/SparseBooleanArray;)V

    .line 317
    .line 318
    .line 319
    invoke-direct {v5, v11}, LN1/G;-><init>(LN1/l;)V

    .line 320
    .line 321
    .line 322
    iput-object v5, v1, LU1/u;->c:LN1/G;

    .line 323
    .line 324
    new-instance v3, Landroid/util/SparseBooleanArray;

    .line 325
    .line 326
    invoke-direct {v3}, Landroid/util/SparseBooleanArray;-><init>()V

    .line 327
    .line 328
    .line 329
    move v5, v8

    .line 330
    :goto_2
    iget-object v12, v11, LN1/l;->a:Landroid/util/SparseBooleanArray;

    .line 331
    .line 332
    invoke-virtual {v12}, Landroid/util/SparseBooleanArray;->size()I

    .line 333
    .line 334
    .line 335
    move-result v12

    .line 336
    if-ge v5, v12, :cond_2

    .line 337
    .line 338
    invoke-virtual {v11, v5}, LN1/l;->a(I)I

    .line 339
    .line 340
    .line 341
    move-result v12

    .line 342
    xor-int/lit8 v14, v8, 0x1

    .line 343
    .line 344
    invoke-static {v14}, LQ1/k;->g(Z)V

    .line 345
    .line 346
    .line 347
    invoke-virtual {v3, v12, v7}, Landroid/util/SparseBooleanArray;->append(IZ)V

    .line 348
    .line 349
    .line 350
    add-int/2addr v5, v7

    .line 351
    goto :goto_2

    .line 352
    :cond_2
    xor-int/lit8 v5, v8, 0x1

    .line 353
    .line 354
    invoke-static {v5}, LQ1/k;->g(Z)V

    .line 355
    .line 356
    .line 357
    const/4 v5, 0x4

    .line 358
    invoke-virtual {v3, v5, v7}, Landroid/util/SparseBooleanArray;->append(IZ)V

    .line 359
    .line 360
    .line 361
    xor-int/lit8 v11, v8, 0x1

    .line 362
    .line 363
    invoke-static {v11}, LQ1/k;->g(Z)V

    .line 364
    .line 365
    .line 366
    const/16 v11, 0xa

    .line 367
    .line 368
    invoke-virtual {v3, v11, v7}, Landroid/util/SparseBooleanArray;->append(IZ)V

    .line 369
    .line 370
    .line 371
    new-instance v12, LN1/G;

    .line 372
    .line 373
    xor-int/lit8 v14, v8, 0x1

    .line 374
    .line 375
    invoke-static {v14}, LQ1/k;->g(Z)V

    .line 376
    .line 377
    .line 378
    new-instance v14, LN1/l;

    .line 379
    .line 380
    invoke-direct {v14, v3}, LN1/l;-><init>(Landroid/util/SparseBooleanArray;)V

    .line 381
    .line 382
    .line 383
    invoke-direct {v12, v14}, LN1/G;-><init>(LN1/l;)V

    .line 384
    .line 385
    .line 386
    iput-object v12, v1, LU1/u;->K:LN1/G;

    .line 387
    .line 388
    iget-object v3, v1, LU1/u;->u:LQ1/q;

    .line 389
    .line 390
    iget-object v12, v1, LU1/u;->s:Landroid/os/Looper;

    .line 391
    .line 392
    invoke-virtual {v3, v12, v15}, LQ1/q;->a(Landroid/os/Looper;Landroid/os/Handler$Callback;)LQ1/s;

    .line 393
    .line 394
    .line 395
    move-result-object v3

    .line 396
    iput-object v3, v1, LU1/u;->i:LQ1/s;

    .line 397
    .line 398
    new-instance v3, LU1/o;

    .line 399
    .line 400
    invoke-direct {v3, v1}, LU1/o;-><init>(LU1/u;)V

    .line 401
    .line 402
    .line 403
    iput-object v3, v1, LU1/u;->j:LU1/o;

    .line 404
    .line 405
    iget-object v12, v1, LU1/u;->b:Ln2/t;

    .line 406
    .line 407
    invoke-static {v12}, LU1/P;->i(Ln2/t;)LU1/P;

    .line 408
    .line 409
    .line 410
    move-result-object v12

    .line 411
    iput-object v12, v1, LU1/u;->d0:LU1/P;

    .line 412
    .line 413
    iget-object v12, v1, LU1/u;->r:LV1/d;

    .line 414
    .line 415
    iget-object v14, v1, LU1/u;->f:LU1/u;

    .line 416
    .line 417
    iget-object v5, v1, LU1/u;->s:Landroid/os/Looper;

    .line 418
    .line 419
    invoke-virtual {v12, v14, v5}, LV1/d;->M(LU1/u;Landroid/os/Looper;)V

    .line 420
    .line 421
    .line 422
    sget v5, LQ1/x;->a:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 423
    .line 424
    iget-object v12, v0, LU1/k;->t:Ljava/lang/String;

    .line 425
    .line 426
    if-ge v5, v2, :cond_3

    .line 427
    .line 428
    :try_start_3
    new-instance v2, LV1/k;

    .line 429
    .line 430
    invoke-direct {v2, v12}, LV1/k;-><init>(Ljava/lang/String;)V

    .line 431
    .line 432
    .line 433
    :goto_3
    move-object/from16 v38, v2

    .line 434
    .line 435
    goto :goto_4

    .line 436
    :catchall_0
    move-exception v0

    .line 437
    goto/16 :goto_7

    .line 438
    .line 439
    :cond_3
    iget-object v2, v1, LU1/u;->e:Landroid/content/Context;

    .line 440
    .line 441
    iget-boolean v5, v0, LU1/k;->r:Z

    .line 442
    .line 443
    invoke-static {v2, v1, v5, v12}, Lvf/a;->A(Landroid/content/Context;LU1/u;ZLjava/lang/String;)LV1/k;

    .line 444
    .line 445
    .line 446
    move-result-object v2

    .line 447
    goto :goto_3

    .line 448
    :goto_4
    new-instance v22, LU1/z;

    .line 449
    .line 450
    iget-object v2, v1, LU1/u;->g:[LU1/W;

    .line 451
    .line 452
    iget-object v5, v1, LU1/u;->h:Ln2/s;

    .line 453
    .line 454
    iget-object v12, v1, LU1/u;->b:Ln2/t;

    .line 455
    .line 456
    iget-object v14, v0, LU1/k;->f:Lk8/p;

    .line 457
    .line 458
    invoke-interface {v14}, Lk8/p;->get()Ljava/lang/Object;

    .line 459
    .line 460
    .line 461
    move-result-object v14

    .line 462
    move-object/from16 v26, v14

    .line 463
    .line 464
    check-cast v26, LU1/h;

    .line 465
    .line 466
    iget-object v14, v1, LU1/u;->t:Lo2/d;

    .line 467
    .line 468
    iget v4, v1, LU1/u;->C:I

    .line 469
    .line 470
    iget-boolean v11, v1, LU1/u;->D:Z

    .line 471
    .line 472
    iget-object v6, v1, LU1/u;->r:LV1/d;

    .line 473
    .line 474
    iget-object v15, v1, LU1/u;->H:LU1/a0;

    .line 475
    .line 476
    iget-object v7, v0, LU1/k;->o:LU1/f;

    .line 477
    .line 478
    move-object/from16 v41, v9

    .line 479
    .line 480
    iget-wide v8, v0, LU1/k;->p:J

    .line 481
    .line 482
    iget-object v0, v1, LU1/u;->s:Landroid/os/Looper;

    .line 483
    .line 484
    move-object/from16 v35, v0

    .line 485
    .line 486
    iget-object v0, v1, LU1/u;->u:LQ1/q;

    .line 487
    .line 488
    move-object/from16 v36, v0

    .line 489
    .line 490
    iget-object v0, v1, LU1/u;->J:LU1/l;

    .line 491
    .line 492
    move-object/from16 v39, v0

    .line 493
    .line 494
    move-object/from16 v23, v2

    .line 495
    .line 496
    move-object/from16 v37, v3

    .line 497
    .line 498
    move/from16 v28, v4

    .line 499
    .line 500
    move-object/from16 v24, v5

    .line 501
    .line 502
    move-object/from16 v30, v6

    .line 503
    .line 504
    move-object/from16 v32, v7

    .line 505
    .line 506
    move-wide/from16 v33, v8

    .line 507
    .line 508
    move/from16 v29, v11

    .line 509
    .line 510
    move-object/from16 v25, v12

    .line 511
    .line 512
    move-object/from16 v27, v14

    .line 513
    .line 514
    move-object/from16 v31, v15

    .line 515
    .line 516
    invoke-direct/range {v22 .. v39}, LU1/z;-><init>([LU1/W;Ln2/s;Ln2/t;LU1/h;Lo2/d;IZLV1/d;LU1/a0;LU1/f;JLandroid/os/Looper;LQ1/q;LU1/o;LV1/k;LU1/l;)V

    .line 517
    .line 518
    .line 519
    move-object/from16 v0, v22

    .line 520
    .line 521
    iput-object v0, v1, LU1/u;->k:LU1/z;

    .line 522
    .line 523
    const/high16 v0, 0x3f800000    # 1.0f

    .line 524
    .line 525
    iput v0, v1, LU1/u;->V:F

    .line 526
    .line 527
    const/4 v0, 0x0

    .line 528
    iput v0, v1, LU1/u;->C:I

    .line 529
    .line 530
    sget-object v0, LN1/z;->B:LN1/z;

    .line 531
    .line 532
    iput-object v0, v1, LU1/u;->L:LN1/z;

    .line 533
    .line 534
    iput-object v0, v1, LU1/u;->c0:LN1/z;

    .line 535
    .line 536
    const/4 v0, -0x1

    .line 537
    iput v0, v1, LU1/u;->e0:I

    .line 538
    .line 539
    iget-object v2, v1, LU1/u;->e:Landroid/content/Context;

    .line 540
    .line 541
    move-object/from16 v3, v41

    .line 542
    .line 543
    invoke-virtual {v2, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 544
    .line 545
    .line 546
    move-result-object v2

    .line 547
    check-cast v2, Landroid/media/AudioManager;

    .line 548
    .line 549
    if-nez v2, :cond_4

    .line 550
    .line 551
    move v2, v0

    .line 552
    goto :goto_5

    .line 553
    :cond_4
    invoke-virtual {v2}, Landroid/media/AudioManager;->generateAudioSessionId()I

    .line 554
    .line 555
    .line 556
    move-result v2

    .line 557
    :goto_5
    iput v2, v1, LU1/u;->T:I

    .line 558
    .line 559
    sget v3, LP1/c;->b:I

    .line 560
    .line 561
    const/4 v3, 0x1

    .line 562
    iput-boolean v3, v1, LU1/u;->X:Z

    .line 563
    .line 564
    iget-object v3, v1, LU1/u;->r:LV1/d;

    .line 565
    .line 566
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 567
    .line 568
    .line 569
    iget-object v4, v1, LU1/u;->l:LQ1/j;

    .line 570
    .line 571
    invoke-virtual {v4, v3}, LQ1/j;->a(Ljava/lang/Object;)V

    .line 572
    .line 573
    .line 574
    iget-object v3, v1, LU1/u;->t:Lo2/d;

    .line 575
    .line 576
    new-instance v4, Landroid/os/Handler;

    .line 577
    .line 578
    iget-object v5, v1, LU1/u;->s:Landroid/os/Looper;

    .line 579
    .line 580
    invoke-direct {v4, v5}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 581
    .line 582
    .line 583
    iget-object v5, v1, LU1/u;->r:LV1/d;

    .line 584
    .line 585
    check-cast v3, Lo2/g;

    .line 586
    .line 587
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 588
    .line 589
    .line 590
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 591
    .line 592
    .line 593
    iget-object v3, v3, Lo2/g;->b:Lad/L;

    .line 594
    .line 595
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 596
    .line 597
    .line 598
    iget-object v3, v3, Lad/L;->b:Ljava/lang/Object;

    .line 599
    .line 600
    check-cast v3, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 601
    .line 602
    :try_start_4
    invoke-virtual {v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 603
    .line 604
    .line 605
    move-result-object v6

    .line 606
    :cond_5
    :goto_6
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 607
    .line 608
    .line 609
    move-result v7

    .line 610
    if-eqz v7, :cond_6

    .line 611
    .line 612
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 613
    .line 614
    .line 615
    move-result-object v7

    .line 616
    check-cast v7, Lo2/c;

    .line 617
    .line 618
    iget-object v8, v7, Lo2/c;->b:LV1/d;

    .line 619
    .line 620
    if-ne v8, v5, :cond_5

    .line 621
    .line 622
    const/4 v8, 0x1

    .line 623
    iput-boolean v8, v7, Lo2/c;->c:Z

    .line 624
    .line 625
    invoke-virtual {v3, v7}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 626
    .line 627
    .line 628
    goto :goto_6

    .line 629
    :cond_6
    new-instance v6, Lo2/c;

    .line 630
    .line 631
    invoke-direct {v6, v4, v5}, Lo2/c;-><init>(Landroid/os/Handler;LV1/d;)V

    .line 632
    .line 633
    .line 634
    invoke-virtual {v3, v6}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 635
    .line 636
    .line 637
    iget-object v3, v1, LU1/u;->v:LU1/r;

    .line 638
    .line 639
    iget-object v4, v1, LU1/u;->m:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 640
    .line 641
    invoke-virtual {v4, v3}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 642
    .line 643
    .line 644
    new-instance v3, LE5/b;

    .line 645
    .line 646
    iget-object v4, v1, LU1/u;->v:LU1/r;

    .line 647
    .line 648
    invoke-direct {v3, v10, v13, v4}, LE5/b;-><init>(Landroid/content/Context;Landroid/os/Handler;LU1/r;)V

    .line 649
    .line 650
    .line 651
    iput-object v3, v1, LU1/u;->x:LE5/b;

    .line 652
    .line 653
    invoke-virtual {v3}, LE5/b;->l()V

    .line 654
    .line 655
    .line 656
    new-instance v3, LU1/c;

    .line 657
    .line 658
    iget-object v4, v1, LU1/u;->v:LU1/r;

    .line 659
    .line 660
    invoke-direct {v3, v10, v13, v4}, LU1/c;-><init>(Landroid/content/Context;Landroid/os/Handler;LU1/r;)V

    .line 661
    .line 662
    .line 663
    iput-object v3, v1, LU1/u;->y:LU1/c;

    .line 664
    .line 665
    const/4 v4, 0x0

    .line 666
    invoke-virtual {v3, v4}, LU1/c;->b(LN1/c;)V

    .line 667
    .line 668
    .line 669
    new-instance v3, LJ4/c;

    .line 670
    .line 671
    invoke-direct {v3, v10}, LJ4/c;-><init>(Landroid/content/Context;)V

    .line 672
    .line 673
    .line 674
    iput-object v3, v1, LU1/u;->z:LJ4/c;

    .line 675
    .line 676
    new-instance v3, LG4/c;

    .line 677
    .line 678
    const/4 v8, 0x1

    .line 679
    invoke-direct {v3, v10, v8}, LG4/c;-><init>(Landroid/content/Context;I)V

    .line 680
    .line 681
    .line 682
    iput-object v3, v1, LU1/u;->A:LG4/c;

    .line 683
    .line 684
    new-instance v3, LD9/n;

    .line 685
    .line 686
    const/4 v4, 0x3

    .line 687
    invoke-direct {v3, v4}, LD9/n;-><init>(I)V

    .line 688
    .line 689
    .line 690
    const/4 v4, 0x0

    .line 691
    iput v4, v3, LD9/n;->b:I

    .line 692
    .line 693
    iput v4, v3, LD9/n;->c:I

    .line 694
    .line 695
    new-instance v4, LN1/h;

    .line 696
    .line 697
    invoke-direct {v4, v3}, LN1/h;-><init>(LD9/n;)V

    .line 698
    .line 699
    .line 700
    sget-object v3, LN1/Y;->d:LN1/Y;

    .line 701
    .line 702
    iput-object v3, v1, LU1/u;->b0:LN1/Y;

    .line 703
    .line 704
    sget-object v3, LQ1/p;->c:LQ1/p;

    .line 705
    .line 706
    iput-object v3, v1, LU1/u;->S:LQ1/p;

    .line 707
    .line 708
    iget-object v3, v1, LU1/u;->h:Ln2/s;

    .line 709
    .line 710
    iget-object v4, v1, LU1/u;->U:LN1/c;

    .line 711
    .line 712
    invoke-virtual {v3, v4}, Ln2/s;->b(LN1/c;)V

    .line 713
    .line 714
    .line 715
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 716
    .line 717
    .line 718
    move-result-object v3

    .line 719
    const/16 v4, 0xa

    .line 720
    .line 721
    const/4 v8, 0x1

    .line 722
    invoke-virtual {v1, v8, v4, v3}, LU1/u;->D0(IILjava/lang/Object;)V

    .line 723
    .line 724
    .line 725
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 726
    .line 727
    .line 728
    move-result-object v2

    .line 729
    const/4 v3, 0x2

    .line 730
    invoke-virtual {v1, v3, v4, v2}, LU1/u;->D0(IILjava/lang/Object;)V

    .line 731
    .line 732
    .line 733
    iget-object v2, v1, LU1/u;->U:LN1/c;

    .line 734
    .line 735
    const/4 v4, 0x3

    .line 736
    invoke-virtual {v1, v8, v4, v2}, LU1/u;->D0(IILjava/lang/Object;)V

    .line 737
    .line 738
    .line 739
    iget v2, v1, LU1/u;->R:I

    .line 740
    .line 741
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 742
    .line 743
    .line 744
    move-result-object v2

    .line 745
    const/4 v4, 0x4

    .line 746
    invoke-virtual {v1, v3, v4, v2}, LU1/u;->D0(IILjava/lang/Object;)V

    .line 747
    .line 748
    .line 749
    const/16 v40, 0x0

    .line 750
    .line 751
    invoke-static/range {v40 .. v40}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 752
    .line 753
    .line 754
    move-result-object v2

    .line 755
    const/4 v4, 0x5

    .line 756
    invoke-virtual {v1, v3, v4, v2}, LU1/u;->D0(IILjava/lang/Object;)V

    .line 757
    .line 758
    .line 759
    iget-boolean v2, v1, LU1/u;->W:Z

    .line 760
    .line 761
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 762
    .line 763
    .line 764
    move-result-object v2

    .line 765
    const/16 v3, 0x9

    .line 766
    .line 767
    const/4 v8, 0x1

    .line 768
    invoke-virtual {v1, v8, v3, v2}, LU1/u;->D0(IILjava/lang/Object;)V

    .line 769
    .line 770
    .line 771
    iget-object v2, v1, LU1/u;->w:LU1/s;

    .line 772
    .line 773
    const/4 v3, 0x7

    .line 774
    const/4 v4, 0x2

    .line 775
    invoke-virtual {v1, v4, v3, v2}, LU1/u;->D0(IILjava/lang/Object;)V

    .line 776
    .line 777
    .line 778
    iget-object v2, v1, LU1/u;->w:LU1/s;

    .line 779
    .line 780
    const/16 v3, 0x8

    .line 781
    .line 782
    const/4 v15, 0x6

    .line 783
    invoke-virtual {v1, v15, v3, v2}, LU1/u;->D0(IILjava/lang/Object;)V

    .line 784
    .line 785
    .line 786
    iget v2, v1, LU1/u;->Z:I

    .line 787
    .line 788
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 789
    .line 790
    .line 791
    move-result-object v2

    .line 792
    const/16 v3, 0x10

    .line 793
    .line 794
    invoke-virtual {v1, v0, v3, v2}, LU1/u;->D0(IILjava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 795
    .line 796
    .line 797
    iget-object v0, v1, LU1/u;->d:Ls8/b;

    .line 798
    .line 799
    invoke-virtual {v0}, Ls8/b;->e()Z

    .line 800
    .line 801
    .line 802
    return-void

    .line 803
    :goto_7
    iget-object v2, v1, LU1/u;->d:Ls8/b;

    .line 804
    .line 805
    invoke-virtual {v2}, Ls8/b;->e()Z

    .line 806
    .line 807
    .line 808
    throw v0

    .line 809
    :array_0
    .array-data 4
        0x1
        0x2
        0x3
        0xd
        0xe
        0xf
        0x10
        0x11
        0x12
        0x13
        0x1f
        0x14
        0x1e
        0x15
        0x23
        0x16
        0x18
        0x1b
        0x1c
        0x20
    .end array-data
.end method

.method public static u0(LU1/P;)J
    .locals 6

    .line 1
    new-instance v0, LN1/M;

    .line 2
    .line 3
    invoke-direct {v0}, LN1/M;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, LN1/L;

    .line 7
    .line 8
    invoke-direct {v1}, LN1/L;-><init>()V

    .line 9
    .line 10
    .line 11
    iget-object v2, p0, LU1/P;->a:LN1/N;

    .line 12
    .line 13
    iget-object v3, p0, LU1/P;->b:Lk2/H;

    .line 14
    .line 15
    iget-object v3, v3, Lk2/H;->a:Ljava/lang/Object;

    .line 16
    .line 17
    invoke-virtual {v2, v3, v1}, LN1/N;->g(Ljava/lang/Object;LN1/L;)LN1/L;

    .line 18
    .line 19
    .line 20
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    iget-wide v4, p0, LU1/P;->c:J

    .line 26
    .line 27
    cmp-long v2, v4, v2

    .line 28
    .line 29
    if-nez v2, :cond_0

    .line 30
    .line 31
    iget v1, v1, LN1/L;->c:I

    .line 32
    .line 33
    const-wide/16 v2, 0x0

    .line 34
    .line 35
    iget-object p0, p0, LU1/P;->a:LN1/N;

    .line 36
    .line 37
    invoke-virtual {p0, v1, v0, v2, v3}, LN1/N;->m(ILN1/M;J)LN1/M;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    iget-wide v0, p0, LN1/M;->l:J

    .line 42
    .line 43
    return-wide v0

    .line 44
    :cond_0
    iget-wide v0, v1, LN1/L;->e:J

    .line 45
    .line 46
    add-long/2addr v0, v4

    .line 47
    return-wide v0
.end method


# virtual methods
.method public final A0()V
    .locals 7

    .line 1
    const-string v0, "ExoPlayerImpl"

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v2, "Release "

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    invoke-static {v2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const-string v2, " [AndroidXMedia3/1.5.1] ["

    .line 22
    .line 23
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    sget-object v2, LQ1/x;->e:Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string v2, "] ["

    .line 32
    .line 33
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    sget-object v2, LN1/x;->a:Ljava/util/HashSet;

    .line 37
    .line 38
    const-class v2, LN1/x;

    .line 39
    .line 40
    monitor-enter v2

    .line 41
    :try_start_0
    sget-object v3, LN1/x;->b:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    .line 43
    monitor-exit v2

    .line 44
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string v2, "]"

    .line 48
    .line 49
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-static {v0, v1}, LQ1/k;->o(Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0}, LU1/u;->S0()V

    .line 60
    .line 61
    .line 62
    iget-object v0, p0, LU1/u;->x:LE5/b;

    .line 63
    .line 64
    invoke-virtual {v0}, LE5/b;->l()V

    .line 65
    .line 66
    .line 67
    iget-object v0, p0, LU1/u;->z:LJ4/c;

    .line 68
    .line 69
    const/4 v1, 0x0

    .line 70
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    iget-object v0, p0, LU1/u;->A:LG4/c;

    .line 74
    .line 75
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    iget-object v0, p0, LU1/u;->y:LU1/c;

    .line 79
    .line 80
    const/4 v2, 0x0

    .line 81
    iput-object v2, v0, LU1/c;->c:LU1/r;

    .line 82
    .line 83
    invoke-virtual {v0}, LU1/c;->a()V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0, v1}, LU1/c;->c(I)V

    .line 87
    .line 88
    .line 89
    iget-object v0, p0, LU1/u;->k:LU1/z;

    .line 90
    .line 91
    invoke-virtual {v0}, LU1/z;->C()Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-nez v0, :cond_0

    .line 96
    .line 97
    iget-object v0, p0, LU1/u;->l:LQ1/j;

    .line 98
    .line 99
    new-instance v1, LJ9/x;

    .line 100
    .line 101
    const/16 v3, 0x19

    .line 102
    .line 103
    invoke-direct {v1, v3}, LJ9/x;-><init>(I)V

    .line 104
    .line 105
    .line 106
    const/16 v3, 0xa

    .line 107
    .line 108
    invoke-virtual {v0, v3, v1}, LQ1/j;->e(ILQ1/g;)V

    .line 109
    .line 110
    .line 111
    :cond_0
    iget-object v0, p0, LU1/u;->l:LQ1/j;

    .line 112
    .line 113
    invoke-virtual {v0}, LQ1/j;->d()V

    .line 114
    .line 115
    .line 116
    iget-object v0, p0, LU1/u;->i:LQ1/s;

    .line 117
    .line 118
    iget-object v0, v0, LQ1/s;->a:Landroid/os/Handler;

    .line 119
    .line 120
    invoke-virtual {v0, v2}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    iget-object v0, p0, LU1/u;->t:Lo2/d;

    .line 124
    .line 125
    iget-object v1, p0, LU1/u;->r:LV1/d;

    .line 126
    .line 127
    check-cast v0, Lo2/g;

    .line 128
    .line 129
    iget-object v0, v0, Lo2/g;->b:Lad/L;

    .line 130
    .line 131
    iget-object v0, v0, Lad/L;->b:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 134
    .line 135
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 136
    .line 137
    .line 138
    move-result-object v3

    .line 139
    :cond_1
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 140
    .line 141
    .line 142
    move-result v4

    .line 143
    const/4 v5, 0x1

    .line 144
    if-eqz v4, :cond_2

    .line 145
    .line 146
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v4

    .line 150
    check-cast v4, Lo2/c;

    .line 151
    .line 152
    iget-object v6, v4, Lo2/c;->b:LV1/d;

    .line 153
    .line 154
    if-ne v6, v1, :cond_1

    .line 155
    .line 156
    iput-boolean v5, v4, Lo2/c;->c:Z

    .line 157
    .line 158
    invoke-virtual {v0, v4}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    goto :goto_0

    .line 162
    :cond_2
    iget-object v0, p0, LU1/u;->d0:LU1/P;

    .line 163
    .line 164
    iget-boolean v1, v0, LU1/P;->p:Z

    .line 165
    .line 166
    if-eqz v1, :cond_3

    .line 167
    .line 168
    invoke-virtual {v0}, LU1/P;->a()LU1/P;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    iput-object v0, p0, LU1/u;->d0:LU1/P;

    .line 173
    .line 174
    :cond_3
    iget-object v0, p0, LU1/u;->d0:LU1/P;

    .line 175
    .line 176
    invoke-virtual {v0, v5}, LU1/P;->g(I)LU1/P;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    iput-object v0, p0, LU1/u;->d0:LU1/P;

    .line 181
    .line 182
    iget-object v1, v0, LU1/P;->b:Lk2/H;

    .line 183
    .line 184
    invoke-virtual {v0, v1}, LU1/P;->b(Lk2/H;)LU1/P;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    iput-object v0, p0, LU1/u;->d0:LU1/P;

    .line 189
    .line 190
    iget-wide v3, v0, LU1/P;->s:J

    .line 191
    .line 192
    iput-wide v3, v0, LU1/P;->q:J

    .line 193
    .line 194
    iget-object v0, p0, LU1/u;->d0:LU1/P;

    .line 195
    .line 196
    const-wide/16 v3, 0x0

    .line 197
    .line 198
    iput-wide v3, v0, LU1/P;->r:J

    .line 199
    .line 200
    iget-object v0, p0, LU1/u;->r:LV1/d;

    .line 201
    .line 202
    iget-object v1, v0, LV1/d;->h:LQ1/s;

    .line 203
    .line 204
    invoke-static {v1}, LQ1/k;->h(Ljava/lang/Object;)V

    .line 205
    .line 206
    .line 207
    new-instance v3, LC8/g;

    .line 208
    .line 209
    const/16 v4, 0xe

    .line 210
    .line 211
    invoke-direct {v3, v0, v4}, LC8/g;-><init>(Ljava/lang/Object;I)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {v1, v3}, LQ1/s;->c(Ljava/lang/Runnable;)Z

    .line 215
    .line 216
    .line 217
    iget-object v0, p0, LU1/u;->h:Ln2/s;

    .line 218
    .line 219
    invoke-virtual {v0}, Ln2/s;->a()V

    .line 220
    .line 221
    .line 222
    invoke-virtual {p0}, LU1/u;->C0()V

    .line 223
    .line 224
    .line 225
    iget-object v0, p0, LU1/u;->O:Landroid/view/Surface;

    .line 226
    .line 227
    if-eqz v0, :cond_4

    .line 228
    .line 229
    invoke-virtual {v0}, Landroid/view/Surface;->release()V

    .line 230
    .line 231
    .line 232
    iput-object v2, p0, LU1/u;->O:Landroid/view/Surface;

    .line 233
    .line 234
    :cond_4
    sget v0, LP1/c;->b:I

    .line 235
    .line 236
    iput-boolean v5, p0, LU1/u;->a0:Z

    .line 237
    .line 238
    return-void

    .line 239
    :catchall_0
    move-exception v0

    .line 240
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 241
    throw v0
.end method

.method public final B0(II)V
    .locals 12

    .line 1
    invoke-virtual {p0}, LU1/u;->S0()V

    .line 2
    .line 3
    .line 4
    const/4 v7, 0x1

    .line 5
    if-ltz p1, :cond_0

    .line 6
    .line 7
    if-lt p2, p1, :cond_0

    .line 8
    .line 9
    move v2, v7

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v2, 0x0

    .line 12
    :goto_0
    invoke-static {v2}, LQ1/k;->c(Z)V

    .line 13
    .line 14
    .line 15
    iget-object v2, p0, LU1/u;->o:Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    invoke-static {p2, v3}, Ljava/lang/Math;->min(II)I

    .line 22
    .line 23
    .line 24
    move-result v8

    .line 25
    if-ge p1, v3, :cond_4

    .line 26
    .line 27
    if-ne p1, v8, :cond_1

    .line 28
    .line 29
    goto/16 :goto_2

    .line 30
    .line 31
    :cond_1
    iget-object v9, p0, LU1/u;->d0:LU1/P;

    .line 32
    .line 33
    invoke-virtual {p0, v9}, LU1/u;->p0(LU1/P;)I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    invoke-virtual {p0, v9}, LU1/u;->i0(LU1/P;)J

    .line 38
    .line 39
    .line 40
    move-result-wide v4

    .line 41
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 42
    .line 43
    .line 44
    move-result v10

    .line 45
    iget v1, p0, LU1/u;->E:I

    .line 46
    .line 47
    add-int/2addr v1, v7

    .line 48
    iput v1, p0, LU1/u;->E:I

    .line 49
    .line 50
    add-int/lit8 v1, v8, -0x1

    .line 51
    .line 52
    :goto_1
    if-lt v1, p1, :cond_2

    .line 53
    .line 54
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    add-int/lit8 v1, v1, -0x1

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_2
    iget-object v1, p0, LU1/u;->I:Lk2/g0;

    .line 61
    .line 62
    invoke-virtual {v1, p1, v8}, Lk2/g0;->c(II)Lk2/g0;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    iput-object v1, p0, LU1/u;->I:Lk2/g0;

    .line 67
    .line 68
    new-instance v1, LU1/V;

    .line 69
    .line 70
    iget-object v11, p0, LU1/u;->I:Lk2/g0;

    .line 71
    .line 72
    invoke-direct {v1, v2, v11}, LU1/V;-><init>(Ljava/util/ArrayList;Lk2/g0;)V

    .line 73
    .line 74
    .line 75
    move-object v2, v1

    .line 76
    iget-object v1, v9, LU1/P;->a:LN1/N;

    .line 77
    .line 78
    move-object v0, p0

    .line 79
    invoke-virtual/range {v0 .. v5}, LU1/u;->r0(LN1/N;LU1/V;IJ)Landroid/util/Pair;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    invoke-virtual {p0, v9, v2, v1}, LU1/u;->w0(LU1/P;LN1/N;Landroid/util/Pair;)LU1/P;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    iget v2, v1, LU1/P;->e:I

    .line 88
    .line 89
    if-eq v2, v7, :cond_3

    .line 90
    .line 91
    const/4 v4, 0x4

    .line 92
    if-eq v2, v4, :cond_3

    .line 93
    .line 94
    if-ge p1, v8, :cond_3

    .line 95
    .line 96
    if-ne v8, v10, :cond_3

    .line 97
    .line 98
    iget-object v2, v1, LU1/P;->a:LN1/N;

    .line 99
    .line 100
    invoke-virtual {v2}, LN1/N;->o()I

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    if-lt v3, v2, :cond_3

    .line 105
    .line 106
    invoke-virtual {v1, v4}, LU1/P;->g(I)LU1/P;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    :cond_3
    iget-object v2, p0, LU1/u;->I:Lk2/g0;

    .line 111
    .line 112
    iget-object v3, p0, LU1/u;->k:LU1/z;

    .line 113
    .line 114
    iget-object v3, v3, LU1/z;->i:LQ1/s;

    .line 115
    .line 116
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    invoke-static {}, LQ1/s;->b()LQ1/r;

    .line 120
    .line 121
    .line 122
    move-result-object v4

    .line 123
    iget-object v3, v3, LQ1/s;->a:Landroid/os/Handler;

    .line 124
    .line 125
    const/16 v5, 0x14

    .line 126
    .line 127
    invoke-virtual {v3, v5, p1, v8, v2}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    iput-object v2, v4, LQ1/r;->a:Landroid/os/Message;

    .line 132
    .line 133
    invoke-virtual {v4}, LQ1/r;->b()V

    .line 134
    .line 135
    .line 136
    iget-object v2, v1, LU1/P;->b:Lk2/H;

    .line 137
    .line 138
    iget-object v2, v2, Lk2/H;->a:Ljava/lang/Object;

    .line 139
    .line 140
    iget-object v3, p0, LU1/u;->d0:LU1/P;

    .line 141
    .line 142
    iget-object v3, v3, LU1/P;->b:Lk2/H;

    .line 143
    .line 144
    iget-object v3, v3, Lk2/H;->a:Ljava/lang/Object;

    .line 145
    .line 146
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result v2

    .line 150
    xor-int/lit8 v3, v2, 0x1

    .line 151
    .line 152
    invoke-virtual {p0, v1}, LU1/u;->n0(LU1/P;)J

    .line 153
    .line 154
    .line 155
    move-result-wide v5

    .line 156
    const/4 v2, 0x0

    .line 157
    const/4 v4, 0x4

    .line 158
    const/4 v7, -0x1

    .line 159
    const/4 v8, 0x0

    .line 160
    move-object v0, p0

    .line 161
    invoke-virtual/range {v0 .. v8}, LU1/u;->Q0(LU1/P;IZIJIZ)V

    .line 162
    .line 163
    .line 164
    :cond_4
    :goto_2
    return-void
.end method

.method public final C0()V
    .locals 2

    .line 1
    iget-object v0, p0, LU1/u;->P:Landroid/view/SurfaceHolder;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, LU1/u;->v:LU1/r;

    .line 6
    .line 7
    invoke-interface {v0, v1}, Landroid/view/SurfaceHolder;->removeCallback(Landroid/view/SurfaceHolder$Callback;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    iput-object v0, p0, LU1/u;->P:Landroid/view/SurfaceHolder;

    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public final D0(IILjava/lang/Object;)V
    .locals 12

    .line 1
    iget-object v0, p0, LU1/u;->g:[LU1/W;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    move v3, v2

    .line 6
    :goto_0
    if-ge v3, v1, :cond_3

    .line 7
    .line 8
    aget-object v6, v0, v3

    .line 9
    .line 10
    const/4 v4, -0x1

    .line 11
    if-eq p1, v4, :cond_0

    .line 12
    .line 13
    invoke-interface {v6}, LU1/W;->f()I

    .line 14
    .line 15
    .line 16
    move-result v5

    .line 17
    if-ne v5, p1, :cond_2

    .line 18
    .line 19
    :cond_0
    iget-object v5, p0, LU1/u;->d0:LU1/P;

    .line 20
    .line 21
    invoke-virtual {p0, v5}, LU1/u;->p0(LU1/P;)I

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    move v7, v4

    .line 26
    new-instance v4, LU1/T;

    .line 27
    .line 28
    iget-object v8, p0, LU1/u;->d0:LU1/P;

    .line 29
    .line 30
    iget-object v8, v8, LU1/P;->a:LN1/N;

    .line 31
    .line 32
    if-ne v5, v7, :cond_1

    .line 33
    .line 34
    move v5, v2

    .line 35
    :cond_1
    iget-object v7, p0, LU1/u;->k:LU1/z;

    .line 36
    .line 37
    iget-object v10, v7, LU1/z;->k:Landroid/os/Looper;

    .line 38
    .line 39
    iget-object v9, p0, LU1/u;->u:LQ1/q;

    .line 40
    .line 41
    move-object v11, v8

    .line 42
    move v8, v5

    .line 43
    move-object v5, v7

    .line 44
    move-object v7, v11

    .line 45
    invoke-direct/range {v4 .. v10}, LU1/T;-><init>(LU1/Q;LU1/W;LN1/N;ILQ1/q;Landroid/os/Looper;)V

    .line 46
    .line 47
    .line 48
    iget-boolean v5, v4, LU1/T;->g:Z

    .line 49
    .line 50
    xor-int/lit8 v5, v5, 0x1

    .line 51
    .line 52
    invoke-static {v5}, LQ1/k;->g(Z)V

    .line 53
    .line 54
    .line 55
    iput p2, v4, LU1/T;->d:I

    .line 56
    .line 57
    iget-boolean v5, v4, LU1/T;->g:Z

    .line 58
    .line 59
    xor-int/lit8 v5, v5, 0x1

    .line 60
    .line 61
    invoke-static {v5}, LQ1/k;->g(Z)V

    .line 62
    .line 63
    .line 64
    iput-object p3, v4, LU1/T;->e:Ljava/lang/Object;

    .line 65
    .line 66
    invoke-virtual {v4}, LU1/T;->c()V

    .line 67
    .line 68
    .line 69
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_3
    return-void
.end method

.method public final E0(LN1/c;Z)V
    .locals 5

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-virtual {p0}, LU1/u;->S0()V

    .line 3
    .line 4
    .line 5
    iget-boolean v1, p0, LU1/u;->a0:Z

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object v1, p0, LU1/u;->U:LN1/c;

    .line 11
    .line 12
    sget v2, LQ1/x;->a:I

    .line 13
    .line 14
    invoke-static {v1, p1}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const/4 v2, 0x1

    .line 19
    iget-object v3, p0, LU1/u;->l:LQ1/j;

    .line 20
    .line 21
    if-nez v1, :cond_1

    .line 22
    .line 23
    iput-object p1, p0, LU1/u;->U:LN1/c;

    .line 24
    .line 25
    const/4 v1, 0x3

    .line 26
    invoke-virtual {p0, v2, v1, p1}, LU1/u;->D0(IILjava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    new-instance v1, LS8/b;

    .line 30
    .line 31
    invoke-direct {v1, p1, v0}, LS8/b;-><init>(Ljava/lang/Object;I)V

    .line 32
    .line 33
    .line 34
    const/16 v4, 0x14

    .line 35
    .line 36
    invoke-virtual {v3, v4, v1}, LQ1/j;->c(ILQ1/g;)V

    .line 37
    .line 38
    .line 39
    :cond_1
    if-eqz p2, :cond_2

    .line 40
    .line 41
    move-object p2, p1

    .line 42
    goto :goto_0

    .line 43
    :cond_2
    const/4 p2, 0x0

    .line 44
    :goto_0
    iget-object v1, p0, LU1/u;->y:LU1/c;

    .line 45
    .line 46
    invoke-virtual {v1, p2}, LU1/c;->b(LN1/c;)V

    .line 47
    .line 48
    .line 49
    iget-object p2, p0, LU1/u;->h:Ln2/s;

    .line 50
    .line 51
    invoke-virtual {p2, p1}, Ln2/s;->b(LN1/c;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, LU1/u;->s0()Z

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    invoke-virtual {p0}, LU1/u;->t0()I

    .line 59
    .line 60
    .line 61
    move-result p2

    .line 62
    invoke-virtual {v1, p2, p1}, LU1/c;->d(IZ)I

    .line 63
    .line 64
    .line 65
    move-result p2

    .line 66
    const/4 v1, -0x1

    .line 67
    if-ne p2, v1, :cond_3

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_3
    move v0, v2

    .line 71
    :goto_1
    invoke-virtual {p0, p2, v0, p1}, LU1/u;->P0(IIZ)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v3}, LQ1/j;->b()V

    .line 75
    .line 76
    .line 77
    return-void
.end method

.method public final F0(Ljava/util/List;ZJI)V
    .locals 15

    .line 1
    move/from16 v1, p5

    .line 2
    .line 3
    iget-object v2, p0, LU1/u;->d0:LU1/P;

    .line 4
    .line 5
    invoke-virtual {p0, v2}, LU1/u;->p0(LU1/P;)I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    invoke-virtual {p0}, LU1/u;->m0()J

    .line 10
    .line 11
    .line 12
    move-result-wide v3

    .line 13
    iget v5, p0, LU1/u;->E:I

    .line 14
    .line 15
    const/4 v6, 0x1

    .line 16
    add-int/2addr v5, v6

    .line 17
    iput v5, p0, LU1/u;->E:I

    .line 18
    .line 19
    iget-object v5, p0, LU1/u;->o:Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 22
    .line 23
    .line 24
    move-result v7

    .line 25
    const/4 v8, 0x0

    .line 26
    if-nez v7, :cond_1

    .line 27
    .line 28
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 29
    .line 30
    .line 31
    move-result v7

    .line 32
    add-int/lit8 v9, v7, -0x1

    .line 33
    .line 34
    :goto_0
    if-ltz v9, :cond_0

    .line 35
    .line 36
    invoke-virtual {v5, v9}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    add-int/lit8 v9, v9, -0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    iget-object v9, p0, LU1/u;->I:Lk2/g0;

    .line 43
    .line 44
    invoke-virtual {v9, v8, v7}, Lk2/g0;->c(II)Lk2/g0;

    .line 45
    .line 46
    .line 47
    move-result-object v7

    .line 48
    iput-object v7, p0, LU1/u;->I:Lk2/g0;

    .line 49
    .line 50
    :cond_1
    move-object/from16 v7, p1

    .line 51
    .line 52
    invoke-virtual {p0, v8, v7}, LU1/u;->e0(ILjava/util/List;)Ljava/util/ArrayList;

    .line 53
    .line 54
    .line 55
    move-result-object v10

    .line 56
    new-instance v7, LU1/V;

    .line 57
    .line 58
    iget-object v9, p0, LU1/u;->I:Lk2/g0;

    .line 59
    .line 60
    invoke-direct {v7, v5, v9}, LU1/V;-><init>(Ljava/util/ArrayList;Lk2/g0;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v7}, LN1/N;->p()Z

    .line 64
    .line 65
    .line 66
    move-result v5

    .line 67
    iget v9, v7, LU1/V;->e:I

    .line 68
    .line 69
    if-nez v5, :cond_3

    .line 70
    .line 71
    if-ge v1, v9, :cond_2

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_2
    new-instance v1, LCd/s0;

    .line 75
    .line 76
    const/16 v2, 0x8

    .line 77
    .line 78
    invoke-direct {v1, v2}, LCd/s0;-><init>(I)V

    .line 79
    .line 80
    .line 81
    throw v1

    .line 82
    :cond_3
    :goto_1
    const/4 v5, -0x1

    .line 83
    if-eqz p2, :cond_4

    .line 84
    .line 85
    iget-boolean v1, p0, LU1/u;->D:Z

    .line 86
    .line 87
    invoke-virtual {v7, v1}, LU1/a;->a(Z)I

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    :goto_2
    move v12, v1

    .line 97
    goto :goto_3

    .line 98
    :cond_4
    if-ne v1, v5, :cond_5

    .line 99
    .line 100
    move v12, v2

    .line 101
    move-wide v2, v3

    .line 102
    goto :goto_3

    .line 103
    :cond_5
    move-wide/from16 v2, p3

    .line 104
    .line 105
    goto :goto_2

    .line 106
    :goto_3
    iget-object v1, p0, LU1/u;->d0:LU1/P;

    .line 107
    .line 108
    invoke-virtual {p0, v7, v12, v2, v3}, LU1/u;->x0(LN1/N;IJ)Landroid/util/Pair;

    .line 109
    .line 110
    .line 111
    move-result-object v4

    .line 112
    invoke-virtual {p0, v1, v7, v4}, LU1/u;->w0(LU1/P;LN1/N;Landroid/util/Pair;)LU1/P;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    iget v4, v1, LU1/P;->e:I

    .line 117
    .line 118
    if-eq v12, v5, :cond_8

    .line 119
    .line 120
    if-eq v4, v6, :cond_8

    .line 121
    .line 122
    invoke-virtual {v7}, LN1/N;->p()Z

    .line 123
    .line 124
    .line 125
    move-result v4

    .line 126
    if-nez v4, :cond_7

    .line 127
    .line 128
    if-lt v12, v9, :cond_6

    .line 129
    .line 130
    goto :goto_4

    .line 131
    :cond_6
    const/4 v4, 0x2

    .line 132
    goto :goto_5

    .line 133
    :cond_7
    :goto_4
    const/4 v4, 0x4

    .line 134
    :cond_8
    :goto_5
    invoke-virtual {v1, v4}, LU1/P;->g(I)LU1/P;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    invoke-static {v2, v3}, LQ1/x;->K(J)J

    .line 139
    .line 140
    .line 141
    move-result-wide v13

    .line 142
    iget-object v11, p0, LU1/u;->I:Lk2/g0;

    .line 143
    .line 144
    iget-object v2, p0, LU1/u;->k:LU1/z;

    .line 145
    .line 146
    iget-object v2, v2, LU1/z;->i:LQ1/s;

    .line 147
    .line 148
    new-instance v9, LU1/w;

    .line 149
    .line 150
    invoke-direct/range {v9 .. v14}, LU1/w;-><init>(Ljava/util/ArrayList;Lk2/g0;IJ)V

    .line 151
    .line 152
    .line 153
    const/16 v3, 0x11

    .line 154
    .line 155
    invoke-virtual {v2, v3, v9}, LQ1/s;->a(ILjava/lang/Object;)LQ1/r;

    .line 156
    .line 157
    .line 158
    move-result-object v2

    .line 159
    invoke-virtual {v2}, LQ1/r;->b()V

    .line 160
    .line 161
    .line 162
    iget-object v2, p0, LU1/u;->d0:LU1/P;

    .line 163
    .line 164
    iget-object v2, v2, LU1/P;->b:Lk2/H;

    .line 165
    .line 166
    iget-object v2, v2, Lk2/H;->a:Ljava/lang/Object;

    .line 167
    .line 168
    iget-object v3, v1, LU1/P;->b:Lk2/H;

    .line 169
    .line 170
    iget-object v3, v3, Lk2/H;->a:Ljava/lang/Object;

    .line 171
    .line 172
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result v2

    .line 176
    if-nez v2, :cond_9

    .line 177
    .line 178
    iget-object v2, p0, LU1/u;->d0:LU1/P;

    .line 179
    .line 180
    iget-object v2, v2, LU1/P;->a:LN1/N;

    .line 181
    .line 182
    invoke-virtual {v2}, LN1/N;->p()Z

    .line 183
    .line 184
    .line 185
    move-result v2

    .line 186
    if-nez v2, :cond_9

    .line 187
    .line 188
    move v3, v6

    .line 189
    goto :goto_6

    .line 190
    :cond_9
    move v3, v8

    .line 191
    :goto_6
    invoke-virtual {p0, v1}, LU1/u;->n0(LU1/P;)J

    .line 192
    .line 193
    .line 194
    move-result-wide v5

    .line 195
    const/4 v2, 0x0

    .line 196
    const/4 v4, 0x4

    .line 197
    const/4 v7, -0x1

    .line 198
    const/4 v8, 0x0

    .line 199
    move-object v0, p0

    .line 200
    invoke-virtual/range {v0 .. v8}, LU1/u;->Q0(LU1/P;IZIJIZ)V

    .line 201
    .line 202
    .line 203
    return-void
.end method

.method public final G0(Z)V
    .locals 2

    .line 1
    invoke-virtual {p0}, LU1/u;->S0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LU1/u;->y:LU1/c;

    .line 5
    .line 6
    invoke-virtual {p0}, LU1/u;->t0()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    invoke-virtual {v0, v1, p1}, LU1/c;->d(IZ)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, -0x1

    .line 15
    if-ne v0, v1, :cond_0

    .line 16
    .line 17
    const/4 v1, 0x2

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v1, 0x1

    .line 20
    :goto_0
    invoke-virtual {p0, v0, v1, p1}, LU1/u;->P0(IIZ)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final H0(LN1/F;)V
    .locals 10

    .line 1
    invoke-virtual {p0}, LU1/u;->S0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LU1/u;->d0:LU1/P;

    .line 5
    .line 6
    iget-object v0, v0, LU1/P;->o:LN1/F;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, LN1/F;->equals(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    iget-object v0, p0, LU1/u;->d0:LU1/P;

    .line 16
    .line 17
    invoke-virtual {v0, p1}, LU1/P;->f(LN1/F;)LU1/P;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    iget v0, p0, LU1/u;->E:I

    .line 22
    .line 23
    add-int/lit8 v0, v0, 0x1

    .line 24
    .line 25
    iput v0, p0, LU1/u;->E:I

    .line 26
    .line 27
    iget-object v0, p0, LU1/u;->k:LU1/z;

    .line 28
    .line 29
    iget-object v0, v0, LU1/z;->i:LQ1/s;

    .line 30
    .line 31
    const/4 v1, 0x4

    .line 32
    invoke-virtual {v0, v1, p1}, LQ1/s;->a(ILjava/lang/Object;)LQ1/r;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p1}, LQ1/r;->b()V

    .line 37
    .line 38
    .line 39
    const/4 v5, 0x5

    .line 40
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    const/4 v3, 0x0

    .line 46
    const/4 v4, 0x0

    .line 47
    const/4 v8, -0x1

    .line 48
    const/4 v9, 0x0

    .line 49
    move-object v1, p0

    .line 50
    invoke-virtual/range {v1 .. v9}, LU1/u;->Q0(LU1/P;IZIJIZ)V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public final I0(I)V
    .locals 4

    .line 1
    invoke-virtual {p0}, LU1/u;->S0()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, LU1/u;->C:I

    .line 5
    .line 6
    if-eq v0, p1, :cond_0

    .line 7
    .line 8
    iput p1, p0, LU1/u;->C:I

    .line 9
    .line 10
    iget-object v0, p0, LU1/u;->k:LU1/z;

    .line 11
    .line 12
    iget-object v0, v0, LU1/z;->i:LQ1/s;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-static {}, LQ1/s;->b()LQ1/r;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    iget-object v0, v0, LQ1/s;->a:Landroid/os/Handler;

    .line 22
    .line 23
    const/16 v2, 0xb

    .line 24
    .line 25
    const/4 v3, 0x0

    .line 26
    invoke-virtual {v0, v2, p1, v3}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iput-object v0, v1, LQ1/r;->a:Landroid/os/Message;

    .line 31
    .line 32
    invoke-virtual {v1}, LQ1/r;->b()V

    .line 33
    .line 34
    .line 35
    new-instance v0, LE5/v;

    .line 36
    .line 37
    const/4 v1, 0x2

    .line 38
    invoke-direct {v0, p1, v1}, LE5/v;-><init>(II)V

    .line 39
    .line 40
    .line 41
    const/16 p1, 0x8

    .line 42
    .line 43
    iget-object v1, p0, LU1/u;->l:LQ1/j;

    .line 44
    .line 45
    invoke-virtual {v1, p1, v0}, LQ1/j;->c(ILQ1/g;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, LU1/u;->O0()V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1}, LQ1/j;->b()V

    .line 52
    .line 53
    .line 54
    :cond_0
    return-void
.end method

.method public final J0(Lk2/g0;)V
    .locals 13

    .line 1
    invoke-virtual {p0}, LU1/u;->S0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Lk2/g0;->b:[I

    .line 5
    .line 6
    array-length v0, v0

    .line 7
    iget-object v1, p0, LU1/u;->o:Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    const/4 v3, 0x1

    .line 14
    if-ne v0, v2, :cond_0

    .line 15
    .line 16
    move v0, v3

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    :goto_0
    invoke-static {v0}, LQ1/k;->c(Z)V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, LU1/u;->I:Lk2/g0;

    .line 23
    .line 24
    new-instance v0, LU1/V;

    .line 25
    .line 26
    iget-object v2, p0, LU1/u;->I:Lk2/g0;

    .line 27
    .line 28
    invoke-direct {v0, v1, v2}, LU1/V;-><init>(Ljava/util/ArrayList;Lk2/g0;)V

    .line 29
    .line 30
    .line 31
    iget-object v1, p0, LU1/u;->d0:LU1/P;

    .line 32
    .line 33
    invoke-virtual {p0}, LU1/u;->l0()I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    invoke-virtual {p0}, LU1/u;->m0()J

    .line 38
    .line 39
    .line 40
    move-result-wide v4

    .line 41
    invoke-virtual {p0, v0, v2, v4, v5}, LU1/u;->x0(LN1/N;IJ)Landroid/util/Pair;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-virtual {p0, v1, v0, v2}, LU1/u;->w0(LU1/P;LN1/N;Landroid/util/Pair;)LU1/P;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    iget v0, p0, LU1/u;->E:I

    .line 50
    .line 51
    add-int/2addr v0, v3

    .line 52
    iput v0, p0, LU1/u;->E:I

    .line 53
    .line 54
    iget-object v0, p0, LU1/u;->k:LU1/z;

    .line 55
    .line 56
    iget-object v0, v0, LU1/z;->i:LQ1/s;

    .line 57
    .line 58
    const/16 v1, 0x15

    .line 59
    .line 60
    invoke-virtual {v0, v1, p1}, LQ1/s;->a(ILjava/lang/Object;)LQ1/r;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-virtual {p1}, LQ1/r;->b()V

    .line 65
    .line 66
    .line 67
    const/4 v8, 0x5

    .line 68
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    const/4 v6, 0x0

    .line 74
    const/4 v7, 0x0

    .line 75
    const/4 v11, -0x1

    .line 76
    const/4 v12, 0x0

    .line 77
    move-object v4, p0

    .line 78
    invoke-virtual/range {v4 .. v12}, LU1/u;->Q0(LU1/P;IZIJIZ)V

    .line 79
    .line 80
    .line 81
    return-void
.end method

.method public final K0(Landroid/view/Surface;)V
    .locals 14

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, LU1/u;->g:[LU1/W;

    .line 7
    .line 8
    array-length v2, v1

    .line 9
    const/4 v3, 0x0

    .line 10
    move v4, v3

    .line 11
    :goto_0
    const/4 v5, 0x2

    .line 12
    const/4 v6, 0x1

    .line 13
    if-ge v4, v2, :cond_2

    .line 14
    .line 15
    aget-object v9, v1, v4

    .line 16
    .line 17
    invoke-interface {v9}, LU1/W;->f()I

    .line 18
    .line 19
    .line 20
    move-result v7

    .line 21
    if-ne v7, v5, :cond_1

    .line 22
    .line 23
    iget-object v5, p0, LU1/u;->d0:LU1/P;

    .line 24
    .line 25
    invoke-virtual {p0, v5}, LU1/u;->p0(LU1/P;)I

    .line 26
    .line 27
    .line 28
    move-result v5

    .line 29
    new-instance v7, LU1/T;

    .line 30
    .line 31
    iget-object v8, p0, LU1/u;->d0:LU1/P;

    .line 32
    .line 33
    iget-object v10, v8, LU1/P;->a:LN1/N;

    .line 34
    .line 35
    const/4 v8, -0x1

    .line 36
    if-ne v5, v8, :cond_0

    .line 37
    .line 38
    move v11, v3

    .line 39
    goto :goto_1

    .line 40
    :cond_0
    move v11, v5

    .line 41
    :goto_1
    iget-object v8, p0, LU1/u;->k:LU1/z;

    .line 42
    .line 43
    iget-object v13, v8, LU1/z;->k:Landroid/os/Looper;

    .line 44
    .line 45
    iget-object v12, p0, LU1/u;->u:LQ1/q;

    .line 46
    .line 47
    invoke-direct/range {v7 .. v13}, LU1/T;-><init>(LU1/Q;LU1/W;LN1/N;ILQ1/q;Landroid/os/Looper;)V

    .line 48
    .line 49
    .line 50
    iget-boolean v5, v7, LU1/T;->g:Z

    .line 51
    .line 52
    xor-int/2addr v5, v6

    .line 53
    invoke-static {v5}, LQ1/k;->g(Z)V

    .line 54
    .line 55
    .line 56
    iput v6, v7, LU1/T;->d:I

    .line 57
    .line 58
    iget-boolean v5, v7, LU1/T;->g:Z

    .line 59
    .line 60
    xor-int/2addr v5, v6

    .line 61
    invoke-static {v5}, LQ1/k;->g(Z)V

    .line 62
    .line 63
    .line 64
    iput-object p1, v7, LU1/T;->e:Ljava/lang/Object;

    .line 65
    .line 66
    invoke-virtual {v7}, LU1/T;->c()V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_2
    iget-object v1, p0, LU1/u;->N:Landroid/view/Surface;

    .line 76
    .line 77
    if-eqz v1, :cond_4

    .line 78
    .line 79
    if-eq v1, p1, :cond_4

    .line 80
    .line 81
    :try_start_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    if-eqz v1, :cond_3

    .line 90
    .line 91
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    check-cast v1, LU1/T;

    .line 96
    .line 97
    iget-wide v7, p0, LU1/u;->B:J

    .line 98
    .line 99
    invoke-virtual {v1, v7, v8}, LU1/T;->a(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_0

    .line 100
    .line 101
    .line 102
    goto :goto_2

    .line 103
    :catch_0
    move v3, v6

    .line 104
    goto :goto_3

    .line 105
    :catch_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 110
    .line 111
    .line 112
    :cond_3
    :goto_3
    iget-object v0, p0, LU1/u;->N:Landroid/view/Surface;

    .line 113
    .line 114
    iget-object v1, p0, LU1/u;->O:Landroid/view/Surface;

    .line 115
    .line 116
    if-ne v0, v1, :cond_4

    .line 117
    .line 118
    invoke-virtual {v1}, Landroid/view/Surface;->release()V

    .line 119
    .line 120
    .line 121
    const/4 v0, 0x0

    .line 122
    iput-object v0, p0, LU1/u;->O:Landroid/view/Surface;

    .line 123
    .line 124
    :cond_4
    iput-object p1, p0, LU1/u;->N:Landroid/view/Surface;

    .line 125
    .line 126
    if-eqz v3, :cond_5

    .line 127
    .line 128
    new-instance p1, LE5/Q;

    .line 129
    .line 130
    const-string v0, "Detaching surface timed out."

    .line 131
    .line 132
    const/4 v1, 0x4

    .line 133
    invoke-direct {p1, v0, v1}, LE5/Q;-><init>(Ljava/lang/String;I)V

    .line 134
    .line 135
    .line 136
    new-instance v0, LU1/j;

    .line 137
    .line 138
    const/16 v1, 0x3eb

    .line 139
    .line 140
    invoke-direct {v0, v5, p1, v1}, LU1/j;-><init>(ILjava/lang/Exception;I)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {p0, v0}, LU1/u;->N0(LU1/j;)V

    .line 144
    .line 145
    .line 146
    :cond_5
    return-void
.end method

.method public final L0(Landroid/view/Surface;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, LU1/u;->S0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LU1/u;->C0()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1}, LU1/u;->K0(Landroid/view/Surface;)V

    .line 8
    .line 9
    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p1, -0x1

    .line 15
    :goto_0
    invoke-virtual {p0, p1, p1}, LU1/u;->y0(II)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final M0(F)V
    .locals 3

    .line 1
    invoke-virtual {p0}, LU1/u;->S0()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    const/high16 v1, 0x3f800000    # 1.0f

    .line 6
    .line 7
    invoke-static {p1, v0, v1}, LQ1/x;->h(FFF)F

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    iget v0, p0, LU1/u;->V:F

    .line 12
    .line 13
    cmpl-float v0, v0, p1

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iput p1, p0, LU1/u;->V:F

    .line 19
    .line 20
    iget-object v0, p0, LU1/u;->y:LU1/c;

    .line 21
    .line 22
    iget v0, v0, LU1/c;->g:F

    .line 23
    .line 24
    mul-float/2addr v0, p1

    .line 25
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const/4 v1, 0x1

    .line 30
    const/4 v2, 0x2

    .line 31
    invoke-virtual {p0, v1, v2, v0}, LU1/u;->D0(IILjava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    new-instance v0, LE5/t;

    .line 35
    .line 36
    const/4 v1, 0x1

    .line 37
    invoke-direct {v0, p1, v1}, LE5/t;-><init>(FI)V

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, LU1/u;->l:LQ1/j;

    .line 41
    .line 42
    const/16 v1, 0x16

    .line 43
    .line 44
    invoke-virtual {p1, v1, v0}, LQ1/j;->e(ILQ1/g;)V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public final N0(LU1/j;)V
    .locals 11

    .line 1
    iget-object v0, p0, LU1/u;->d0:LU1/P;

    .line 2
    .line 3
    iget-object v1, v0, LU1/P;->b:Lk2/H;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, LU1/P;->b(Lk2/H;)LU1/P;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-wide v1, v0, LU1/P;->s:J

    .line 10
    .line 11
    iput-wide v1, v0, LU1/P;->q:J

    .line 12
    .line 13
    const-wide/16 v1, 0x0

    .line 14
    .line 15
    iput-wide v1, v0, LU1/P;->r:J

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    invoke-virtual {v0, v1}, LU1/P;->g(I)LU1/P;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    invoke-virtual {v0, p1}, LU1/P;->e(LU1/j;)LU1/P;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    :cond_0
    move-object v3, v0

    .line 29
    iget p1, p0, LU1/u;->E:I

    .line 30
    .line 31
    add-int/2addr p1, v1

    .line 32
    iput p1, p0, LU1/u;->E:I

    .line 33
    .line 34
    iget-object p1, p0, LU1/u;->k:LU1/z;

    .line 35
    .line 36
    iget-object p1, p1, LU1/z;->i:LQ1/s;

    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    invoke-static {}, LQ1/s;->b()LQ1/r;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iget-object p1, p1, LQ1/s;->a:Landroid/os/Handler;

    .line 46
    .line 47
    const/4 v1, 0x6

    .line 48
    invoke-virtual {p1, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    iput-object p1, v0, LQ1/r;->a:Landroid/os/Message;

    .line 53
    .line 54
    invoke-virtual {v0}, LQ1/r;->b()V

    .line 55
    .line 56
    .line 57
    const/4 v6, 0x5

    .line 58
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    const/4 v4, 0x0

    .line 64
    const/4 v5, 0x0

    .line 65
    const/4 v9, -0x1

    .line 66
    const/4 v10, 0x0

    .line 67
    move-object v2, p0

    .line 68
    invoke-virtual/range {v2 .. v10}, LU1/u;->Q0(LU1/P;IZIJIZ)V

    .line 69
    .line 70
    .line 71
    return-void
.end method

.method public final O(JIZ)V
    .locals 10

    .line 1
    invoke-virtual {p0}, LU1/u;->S0()V

    .line 2
    .line 3
    .line 4
    const/4 v2, -0x1

    .line 5
    if-ne p3, v2, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    const/4 v3, 0x1

    .line 9
    if-ltz p3, :cond_1

    .line 10
    .line 11
    move v4, v3

    .line 12
    goto :goto_0

    .line 13
    :cond_1
    const/4 v4, 0x0

    .line 14
    :goto_0
    invoke-static {v4}, LQ1/k;->c(Z)V

    .line 15
    .line 16
    .line 17
    iget-object v4, p0, LU1/u;->d0:LU1/P;

    .line 18
    .line 19
    iget-object v4, v4, LU1/P;->a:LN1/N;

    .line 20
    .line 21
    invoke-virtual {v4}, LN1/N;->p()Z

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    if-nez v5, :cond_2

    .line 26
    .line 27
    invoke-virtual {v4}, LN1/N;->o()I

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    if-lt p3, v5, :cond_2

    .line 32
    .line 33
    :goto_1
    return-void

    .line 34
    :cond_2
    iget-object v5, p0, LU1/u;->r:LV1/d;

    .line 35
    .line 36
    iget-boolean v6, v5, LV1/d;->i:Z

    .line 37
    .line 38
    if-nez v6, :cond_3

    .line 39
    .line 40
    invoke-virtual {v5}, LV1/d;->G()LV1/a;

    .line 41
    .line 42
    .line 43
    move-result-object v6

    .line 44
    iput-boolean v3, v5, LV1/d;->i:Z

    .line 45
    .line 46
    new-instance v7, LV1/b;

    .line 47
    .line 48
    const/16 v8, 0x8

    .line 49
    .line 50
    invoke-direct {v7, v8}, LV1/b;-><init>(I)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v5, v6, v2, v7}, LV1/d;->L(LV1/a;ILQ1/g;)V

    .line 54
    .line 55
    .line 56
    :cond_3
    iget v2, p0, LU1/u;->E:I

    .line 57
    .line 58
    add-int/2addr v2, v3

    .line 59
    iput v2, p0, LU1/u;->E:I

    .line 60
    .line 61
    invoke-virtual {p0}, LU1/u;->v0()Z

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    if-eqz v2, :cond_4

    .line 66
    .line 67
    const-string v1, "ExoPlayerImpl"

    .line 68
    .line 69
    const-string v2, "seekTo ignored because an ad is playing"

    .line 70
    .line 71
    invoke-static {v1, v2}, LQ1/k;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    new-instance v1, LT5/s;

    .line 75
    .line 76
    iget-object v2, p0, LU1/u;->d0:LU1/P;

    .line 77
    .line 78
    invoke-direct {v1, v2}, LT5/s;-><init>(LU1/P;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v1, v3}, LT5/s;->c(I)V

    .line 82
    .line 83
    .line 84
    iget-object v2, p0, LU1/u;->j:LU1/o;

    .line 85
    .line 86
    iget-object v2, v2, LU1/o;->a:LU1/u;

    .line 87
    .line 88
    iget-object v3, v2, LU1/u;->i:LQ1/s;

    .line 89
    .line 90
    new-instance v4, LT3/r;

    .line 91
    .line 92
    const/4 v5, 0x4

    .line 93
    invoke-direct {v4, v5, v2, v1}, LT3/r;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v3, v4}, LQ1/s;->c(Ljava/lang/Runnable;)Z

    .line 97
    .line 98
    .line 99
    return-void

    .line 100
    :cond_4
    iget-object v2, p0, LU1/u;->d0:LU1/P;

    .line 101
    .line 102
    iget v3, v2, LU1/P;->e:I

    .line 103
    .line 104
    const/4 v5, 0x3

    .line 105
    if-eq v3, v5, :cond_5

    .line 106
    .line 107
    const/4 v6, 0x4

    .line 108
    if-ne v3, v6, :cond_6

    .line 109
    .line 110
    invoke-virtual {v4}, LN1/N;->p()Z

    .line 111
    .line 112
    .line 113
    move-result v3

    .line 114
    if-nez v3, :cond_6

    .line 115
    .line 116
    :cond_5
    iget-object v2, p0, LU1/u;->d0:LU1/P;

    .line 117
    .line 118
    const/4 v3, 0x2

    .line 119
    invoke-virtual {v2, v3}, LU1/P;->g(I)LU1/P;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    :cond_6
    invoke-virtual {p0}, LU1/u;->l0()I

    .line 124
    .line 125
    .line 126
    move-result v7

    .line 127
    invoke-virtual {p0, v4, p3, p1, p2}, LU1/u;->x0(LN1/N;IJ)Landroid/util/Pair;

    .line 128
    .line 129
    .line 130
    move-result-object v3

    .line 131
    invoke-virtual {p0, v2, v4, v3}, LU1/u;->w0(LU1/P;LN1/N;Landroid/util/Pair;)LU1/P;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    invoke-static {p1, p2}, LQ1/x;->K(J)J

    .line 136
    .line 137
    .line 138
    move-result-wide v8

    .line 139
    iget-object v3, p0, LU1/u;->k:LU1/z;

    .line 140
    .line 141
    iget-object v3, v3, LU1/z;->i:LQ1/s;

    .line 142
    .line 143
    new-instance v6, LU1/y;

    .line 144
    .line 145
    invoke-direct {v6, v4, p3, v8, v9}, LU1/y;-><init>(LN1/N;IJ)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v3, v5, v6}, LQ1/s;->a(ILjava/lang/Object;)LQ1/r;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    invoke-virtual {v1}, LQ1/r;->b()V

    .line 153
    .line 154
    .line 155
    invoke-virtual {p0, v2}, LU1/u;->n0(LU1/P;)J

    .line 156
    .line 157
    .line 158
    move-result-wide v5

    .line 159
    move-object v1, v2

    .line 160
    const/4 v2, 0x0

    .line 161
    const/4 v3, 0x1

    .line 162
    const/4 v4, 0x1

    .line 163
    move-object v0, p0

    .line 164
    move v8, p4

    .line 165
    invoke-virtual/range {v0 .. v8}, LU1/u;->Q0(LU1/P;IZIJIZ)V

    .line 166
    .line 167
    .line 168
    return-void
.end method

.method public final O0()V
    .locals 15

    .line 1
    const/4 v0, 0x1

    .line 2
    iget-object v1, p0, LU1/u;->K:LN1/G;

    .line 3
    .line 4
    sget v2, LQ1/x;->a:I

    .line 5
    .line 6
    iget-object v2, p0, LU1/u;->f:LU1/u;

    .line 7
    .line 8
    invoke-virtual {v2}, LU1/u;->v0()Z

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    invoke-virtual {v2}, LU1/u;->o0()LN1/N;

    .line 13
    .line 14
    .line 15
    move-result-object v4

    .line 16
    invoke-virtual {v4}, LN1/N;->p()Z

    .line 17
    .line 18
    .line 19
    move-result v5

    .line 20
    const/4 v6, 0x0

    .line 21
    const-wide/16 v7, 0x0

    .line 22
    .line 23
    iget-object v9, v2, LA7/B0;->a:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v9, LN1/M;

    .line 26
    .line 27
    if-nez v5, :cond_0

    .line 28
    .line 29
    invoke-virtual {v2}, LU1/u;->l0()I

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    invoke-virtual {v4, v5, v9, v7, v8}, LN1/N;->m(ILN1/M;J)LN1/M;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    iget-boolean v4, v4, LN1/M;->h:Z

    .line 38
    .line 39
    if-eqz v4, :cond_0

    .line 40
    .line 41
    move v4, v0

    .line 42
    goto :goto_0

    .line 43
    :cond_0
    move v4, v6

    .line 44
    :goto_0
    invoke-virtual {v2}, LU1/u;->o0()LN1/N;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    invoke-virtual {v5}, LN1/N;->p()Z

    .line 49
    .line 50
    .line 51
    move-result v10

    .line 52
    const/4 v11, -0x1

    .line 53
    if-eqz v10, :cond_1

    .line 54
    .line 55
    move v5, v11

    .line 56
    goto :goto_1

    .line 57
    :cond_1
    invoke-virtual {v2}, LU1/u;->l0()I

    .line 58
    .line 59
    .line 60
    move-result v10

    .line 61
    invoke-virtual {v2}, LU1/u;->S0()V

    .line 62
    .line 63
    .line 64
    iget v12, v2, LU1/u;->C:I

    .line 65
    .line 66
    if-ne v12, v0, :cond_2

    .line 67
    .line 68
    move v12, v6

    .line 69
    :cond_2
    invoke-virtual {v2}, LU1/u;->S0()V

    .line 70
    .line 71
    .line 72
    iget-boolean v13, v2, LU1/u;->D:Z

    .line 73
    .line 74
    invoke-virtual {v5, v10, v12, v13}, LN1/N;->k(IIZ)I

    .line 75
    .line 76
    .line 77
    move-result v5

    .line 78
    :goto_1
    if-eq v5, v11, :cond_3

    .line 79
    .line 80
    move v5, v0

    .line 81
    goto :goto_2

    .line 82
    :cond_3
    move v5, v6

    .line 83
    :goto_2
    invoke-virtual {v2}, LU1/u;->o0()LN1/N;

    .line 84
    .line 85
    .line 86
    move-result-object v10

    .line 87
    invoke-virtual {v10}, LN1/N;->p()Z

    .line 88
    .line 89
    .line 90
    move-result v12

    .line 91
    if-eqz v12, :cond_4

    .line 92
    .line 93
    move v10, v11

    .line 94
    goto :goto_3

    .line 95
    :cond_4
    invoke-virtual {v2}, LU1/u;->l0()I

    .line 96
    .line 97
    .line 98
    move-result v12

    .line 99
    invoke-virtual {v2}, LU1/u;->S0()V

    .line 100
    .line 101
    .line 102
    iget v13, v2, LU1/u;->C:I

    .line 103
    .line 104
    if-ne v13, v0, :cond_5

    .line 105
    .line 106
    move v13, v6

    .line 107
    :cond_5
    invoke-virtual {v2}, LU1/u;->S0()V

    .line 108
    .line 109
    .line 110
    iget-boolean v14, v2, LU1/u;->D:Z

    .line 111
    .line 112
    invoke-virtual {v10, v12, v13, v14}, LN1/N;->e(IIZ)I

    .line 113
    .line 114
    .line 115
    move-result v10

    .line 116
    :goto_3
    if-eq v10, v11, :cond_6

    .line 117
    .line 118
    move v10, v0

    .line 119
    goto :goto_4

    .line 120
    :cond_6
    move v10, v6

    .line 121
    :goto_4
    invoke-virtual {v2}, LU1/u;->o0()LN1/N;

    .line 122
    .line 123
    .line 124
    move-result-object v11

    .line 125
    invoke-virtual {v11}, LN1/N;->p()Z

    .line 126
    .line 127
    .line 128
    move-result v12

    .line 129
    if-nez v12, :cond_7

    .line 130
    .line 131
    invoke-virtual {v2}, LU1/u;->l0()I

    .line 132
    .line 133
    .line 134
    move-result v12

    .line 135
    invoke-virtual {v11, v12, v9, v7, v8}, LN1/N;->m(ILN1/M;J)LN1/M;

    .line 136
    .line 137
    .line 138
    move-result-object v11

    .line 139
    invoke-virtual {v11}, LN1/M;->a()Z

    .line 140
    .line 141
    .line 142
    move-result v11

    .line 143
    if-eqz v11, :cond_7

    .line 144
    .line 145
    move v11, v0

    .line 146
    goto :goto_5

    .line 147
    :cond_7
    move v11, v6

    .line 148
    :goto_5
    invoke-virtual {v2}, LU1/u;->o0()LN1/N;

    .line 149
    .line 150
    .line 151
    move-result-object v12

    .line 152
    invoke-virtual {v12}, LN1/N;->p()Z

    .line 153
    .line 154
    .line 155
    move-result v13

    .line 156
    if-nez v13, :cond_8

    .line 157
    .line 158
    invoke-virtual {v2}, LU1/u;->l0()I

    .line 159
    .line 160
    .line 161
    move-result v13

    .line 162
    invoke-virtual {v12, v13, v9, v7, v8}, LN1/N;->m(ILN1/M;J)LN1/M;

    .line 163
    .line 164
    .line 165
    move-result-object v7

    .line 166
    iget-boolean v7, v7, LN1/M;->i:Z

    .line 167
    .line 168
    if-eqz v7, :cond_8

    .line 169
    .line 170
    move v7, v0

    .line 171
    goto :goto_6

    .line 172
    :cond_8
    move v7, v6

    .line 173
    :goto_6
    invoke-virtual {v2}, LU1/u;->o0()LN1/N;

    .line 174
    .line 175
    .line 176
    move-result-object v2

    .line 177
    invoke-virtual {v2}, LN1/N;->p()Z

    .line 178
    .line 179
    .line 180
    move-result v2

    .line 181
    new-instance v8, LS3/l;

    .line 182
    .line 183
    const/16 v9, 0x14

    .line 184
    .line 185
    invoke-direct {v8, v9}, LS3/l;-><init>(I)V

    .line 186
    .line 187
    .line 188
    iget-object v9, p0, LU1/u;->c:LN1/G;

    .line 189
    .line 190
    iget-object v9, v9, LN1/G;->a:LN1/l;

    .line 191
    .line 192
    iget-object v12, v8, LS3/l;->a:Ljava/lang/Object;

    .line 193
    .line 194
    check-cast v12, LN1/k;

    .line 195
    .line 196
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 197
    .line 198
    .line 199
    move v13, v6

    .line 200
    :goto_7
    iget-object v14, v9, LN1/l;->a:Landroid/util/SparseBooleanArray;

    .line 201
    .line 202
    invoke-virtual {v14}, Landroid/util/SparseBooleanArray;->size()I

    .line 203
    .line 204
    .line 205
    move-result v14

    .line 206
    if-ge v13, v14, :cond_9

    .line 207
    .line 208
    invoke-virtual {v9, v13}, LN1/l;->a(I)I

    .line 209
    .line 210
    .line 211
    move-result v14

    .line 212
    invoke-virtual {v12, v14}, LN1/k;->a(I)V

    .line 213
    .line 214
    .line 215
    add-int/2addr v13, v0

    .line 216
    goto :goto_7

    .line 217
    :cond_9
    xor-int/lit8 v9, v3, 0x1

    .line 218
    .line 219
    const/4 v13, 0x4

    .line 220
    invoke-virtual {v8, v13, v9}, LS3/l;->k(IZ)V

    .line 221
    .line 222
    .line 223
    if-eqz v4, :cond_a

    .line 224
    .line 225
    if-nez v3, :cond_a

    .line 226
    .line 227
    move v13, v0

    .line 228
    goto :goto_8

    .line 229
    :cond_a
    move v13, v6

    .line 230
    :goto_8
    const/4 v14, 0x5

    .line 231
    invoke-virtual {v8, v14, v13}, LS3/l;->k(IZ)V

    .line 232
    .line 233
    .line 234
    if-eqz v5, :cond_b

    .line 235
    .line 236
    if-nez v3, :cond_b

    .line 237
    .line 238
    move v13, v0

    .line 239
    goto :goto_9

    .line 240
    :cond_b
    move v13, v6

    .line 241
    :goto_9
    const/4 v14, 0x6

    .line 242
    invoke-virtual {v8, v14, v13}, LS3/l;->k(IZ)V

    .line 243
    .line 244
    .line 245
    if-nez v2, :cond_d

    .line 246
    .line 247
    if-nez v5, :cond_c

    .line 248
    .line 249
    if-eqz v11, :cond_c

    .line 250
    .line 251
    if-eqz v4, :cond_d

    .line 252
    .line 253
    :cond_c
    if-nez v3, :cond_d

    .line 254
    .line 255
    move v5, v0

    .line 256
    goto :goto_a

    .line 257
    :cond_d
    move v5, v6

    .line 258
    :goto_a
    const/4 v13, 0x7

    .line 259
    invoke-virtual {v8, v13, v5}, LS3/l;->k(IZ)V

    .line 260
    .line 261
    .line 262
    if-eqz v10, :cond_e

    .line 263
    .line 264
    if-nez v3, :cond_e

    .line 265
    .line 266
    move v5, v0

    .line 267
    goto :goto_b

    .line 268
    :cond_e
    move v5, v6

    .line 269
    :goto_b
    const/16 v13, 0x8

    .line 270
    .line 271
    invoke-virtual {v8, v13, v5}, LS3/l;->k(IZ)V

    .line 272
    .line 273
    .line 274
    if-nez v2, :cond_10

    .line 275
    .line 276
    if-nez v10, :cond_f

    .line 277
    .line 278
    if-eqz v11, :cond_10

    .line 279
    .line 280
    if-eqz v7, :cond_10

    .line 281
    .line 282
    :cond_f
    if-nez v3, :cond_10

    .line 283
    .line 284
    move v2, v0

    .line 285
    goto :goto_c

    .line 286
    :cond_10
    move v2, v6

    .line 287
    :goto_c
    const/16 v5, 0x9

    .line 288
    .line 289
    invoke-virtual {v8, v5, v2}, LS3/l;->k(IZ)V

    .line 290
    .line 291
    .line 292
    const/16 v2, 0xa

    .line 293
    .line 294
    invoke-virtual {v8, v2, v9}, LS3/l;->k(IZ)V

    .line 295
    .line 296
    .line 297
    if-eqz v4, :cond_11

    .line 298
    .line 299
    if-nez v3, :cond_11

    .line 300
    .line 301
    move v2, v0

    .line 302
    goto :goto_d

    .line 303
    :cond_11
    move v2, v6

    .line 304
    :goto_d
    const/16 v5, 0xb

    .line 305
    .line 306
    invoke-virtual {v8, v5, v2}, LS3/l;->k(IZ)V

    .line 307
    .line 308
    .line 309
    if-eqz v4, :cond_12

    .line 310
    .line 311
    if-nez v3, :cond_12

    .line 312
    .line 313
    goto :goto_e

    .line 314
    :cond_12
    move v0, v6

    .line 315
    :goto_e
    const/16 v2, 0xc

    .line 316
    .line 317
    invoke-virtual {v8, v2, v0}, LS3/l;->k(IZ)V

    .line 318
    .line 319
    .line 320
    new-instance v0, LN1/G;

    .line 321
    .line 322
    invoke-virtual {v12}, LN1/k;->b()LN1/l;

    .line 323
    .line 324
    .line 325
    move-result-object v2

    .line 326
    invoke-direct {v0, v2}, LN1/G;-><init>(LN1/l;)V

    .line 327
    .line 328
    .line 329
    iput-object v0, p0, LU1/u;->K:LN1/G;

    .line 330
    .line 331
    invoke-virtual {v0, v1}, LN1/G;->equals(Ljava/lang/Object;)Z

    .line 332
    .line 333
    .line 334
    move-result v0

    .line 335
    if-nez v0, :cond_13

    .line 336
    .line 337
    new-instance v0, LU1/o;

    .line 338
    .line 339
    invoke-direct {v0, p0}, LU1/o;-><init>(LU1/u;)V

    .line 340
    .line 341
    .line 342
    iget-object v1, p0, LU1/u;->l:LQ1/j;

    .line 343
    .line 344
    const/16 v2, 0xd

    .line 345
    .line 346
    invoke-virtual {v1, v2, v0}, LQ1/j;->c(ILQ1/g;)V

    .line 347
    .line 348
    .line 349
    :cond_13
    return-void
.end method

.method public final P0(IIZ)V
    .locals 11

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p3, -0x1

    .line 6
    if-eq p1, p3, :cond_0

    .line 7
    .line 8
    move p3, v1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move p3, v0

    .line 11
    :goto_0
    if-nez p1, :cond_1

    .line 12
    .line 13
    move v0, v1

    .line 14
    :cond_1
    iget-object p1, p0, LU1/u;->d0:LU1/P;

    .line 15
    .line 16
    iget-boolean v1, p1, LU1/P;->l:Z

    .line 17
    .line 18
    if-ne v1, p3, :cond_2

    .line 19
    .line 20
    iget v1, p1, LU1/P;->n:I

    .line 21
    .line 22
    if-ne v1, v0, :cond_2

    .line 23
    .line 24
    iget p1, p1, LU1/P;->m:I

    .line 25
    .line 26
    if-ne p1, p2, :cond_2

    .line 27
    .line 28
    return-void

    .line 29
    :cond_2
    iget p1, p0, LU1/u;->E:I

    .line 30
    .line 31
    const/4 v1, 0x1

    .line 32
    add-int/2addr p1, v1

    .line 33
    iput p1, p0, LU1/u;->E:I

    .line 34
    .line 35
    iget-object p1, p0, LU1/u;->d0:LU1/P;

    .line 36
    .line 37
    iget-boolean v2, p1, LU1/P;->p:Z

    .line 38
    .line 39
    if-eqz v2, :cond_3

    .line 40
    .line 41
    invoke-virtual {p1}, LU1/P;->a()LU1/P;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    :cond_3
    invoke-virtual {p1, p2, v0, p3}, LU1/P;->d(IIZ)LU1/P;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    shl-int/lit8 p1, v0, 0x4

    .line 50
    .line 51
    or-int/2addr p1, p2

    .line 52
    iget-object p2, p0, LU1/u;->k:LU1/z;

    .line 53
    .line 54
    iget-object p2, p2, LU1/z;->i:LQ1/s;

    .line 55
    .line 56
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    invoke-static {}, LQ1/s;->b()LQ1/r;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    iget-object p2, p2, LQ1/s;->a:Landroid/os/Handler;

    .line 64
    .line 65
    invoke-virtual {p2, v1, p3, p1}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    iput-object p1, v0, LQ1/r;->a:Landroid/os/Message;

    .line 70
    .line 71
    invoke-virtual {v0}, LQ1/r;->b()V

    .line 72
    .line 73
    .line 74
    const/4 v6, 0x5

    .line 75
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    const/4 v4, 0x0

    .line 81
    const/4 v5, 0x0

    .line 82
    const/4 v9, -0x1

    .line 83
    const/4 v10, 0x0

    .line 84
    move-object v2, p0

    .line 85
    invoke-virtual/range {v2 .. v10}, LU1/u;->Q0(LU1/P;IZIJIZ)V

    .line 86
    .line 87
    .line 88
    return-void
.end method

.method public final Q0(LU1/P;IZIJIZ)V
    .locals 33

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p4

    .line 6
    .line 7
    iget-object v3, v0, LU1/u;->d0:LU1/P;

    .line 8
    .line 9
    iput-object v1, v0, LU1/u;->d0:LU1/P;

    .line 10
    .line 11
    iget-object v4, v3, LU1/P;->a:LN1/N;

    .line 12
    .line 13
    iget-object v5, v1, LU1/P;->a:LN1/N;

    .line 14
    .line 15
    invoke-virtual {v4, v5}, LN1/N;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    iget-object v5, v3, LU1/P;->a:LN1/N;

    .line 20
    .line 21
    iget-object v6, v1, LU1/P;->a:LN1/N;

    .line 22
    .line 23
    invoke-virtual {v6}, LN1/N;->p()Z

    .line 24
    .line 25
    .line 26
    move-result v7

    .line 27
    const/4 v8, -0x1

    .line 28
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 29
    .line 30
    .line 31
    move-result-object v9

    .line 32
    const/4 v10, 0x1

    .line 33
    const-wide/16 v13, 0x0

    .line 34
    .line 35
    if-eqz v7, :cond_0

    .line 36
    .line 37
    invoke-virtual {v5}, LN1/N;->p()Z

    .line 38
    .line 39
    .line 40
    move-result v7

    .line 41
    if-eqz v7, :cond_0

    .line 42
    .line 43
    new-instance v5, Landroid/util/Pair;

    .line 44
    .line 45
    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 46
    .line 47
    invoke-direct {v5, v6, v9}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    const/16 v16, 0x3

    .line 51
    .line 52
    :goto_0
    const/16 v17, 0x2

    .line 53
    .line 54
    const/16 v18, 0x0

    .line 55
    .line 56
    goto/16 :goto_2

    .line 57
    .line 58
    :cond_0
    invoke-virtual {v6}, LN1/N;->p()Z

    .line 59
    .line 60
    .line 61
    move-result v7

    .line 62
    const/16 v16, 0x3

    .line 63
    .line 64
    invoke-virtual {v5}, LN1/N;->p()Z

    .line 65
    .line 66
    .line 67
    move-result v12

    .line 68
    if-eq v7, v12, :cond_1

    .line 69
    .line 70
    new-instance v5, Landroid/util/Pair;

    .line 71
    .line 72
    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 73
    .line 74
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 75
    .line 76
    .line 77
    move-result-object v7

    .line 78
    invoke-direct {v5, v6, v7}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_1
    iget-object v7, v3, LU1/P;->b:Lk2/H;

    .line 83
    .line 84
    iget-object v12, v7, Lk2/H;->a:Ljava/lang/Object;

    .line 85
    .line 86
    const/16 v17, 0x2

    .line 87
    .line 88
    iget-object v11, v0, LU1/u;->n:LN1/L;

    .line 89
    .line 90
    invoke-virtual {v5, v12, v11}, LN1/N;->g(Ljava/lang/Object;LN1/L;)LN1/L;

    .line 91
    .line 92
    .line 93
    move-result-object v12

    .line 94
    iget v12, v12, LN1/L;->c:I

    .line 95
    .line 96
    iget-object v8, v0, LA7/B0;->a:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v8, LN1/M;

    .line 99
    .line 100
    invoke-virtual {v5, v12, v8, v13, v14}, LN1/N;->m(ILN1/M;J)LN1/M;

    .line 101
    .line 102
    .line 103
    move-result-object v5

    .line 104
    iget-object v5, v5, LN1/M;->a:Ljava/lang/Object;

    .line 105
    .line 106
    iget-object v12, v1, LU1/P;->b:Lk2/H;

    .line 107
    .line 108
    const/16 v18, 0x0

    .line 109
    .line 110
    iget-object v15, v12, Lk2/H;->a:Ljava/lang/Object;

    .line 111
    .line 112
    invoke-virtual {v6, v15, v11}, LN1/N;->g(Ljava/lang/Object;LN1/L;)LN1/L;

    .line 113
    .line 114
    .line 115
    move-result-object v11

    .line 116
    iget v11, v11, LN1/L;->c:I

    .line 117
    .line 118
    invoke-virtual {v6, v11, v8, v13, v14}, LN1/N;->m(ILN1/M;J)LN1/M;

    .line 119
    .line 120
    .line 121
    move-result-object v6

    .line 122
    iget-object v6, v6, LN1/M;->a:Ljava/lang/Object;

    .line 123
    .line 124
    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v5

    .line 128
    if-nez v5, :cond_5

    .line 129
    .line 130
    if-eqz p3, :cond_2

    .line 131
    .line 132
    if-nez v2, :cond_2

    .line 133
    .line 134
    move v5, v10

    .line 135
    goto :goto_1

    .line 136
    :cond_2
    if-eqz p3, :cond_3

    .line 137
    .line 138
    if-ne v2, v10, :cond_3

    .line 139
    .line 140
    move/from16 v5, v17

    .line 141
    .line 142
    goto :goto_1

    .line 143
    :cond_3
    if-nez v4, :cond_4

    .line 144
    .line 145
    move/from16 v5, v16

    .line 146
    .line 147
    :goto_1
    new-instance v6, Landroid/util/Pair;

    .line 148
    .line 149
    sget-object v7, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 150
    .line 151
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 152
    .line 153
    .line 154
    move-result-object v5

    .line 155
    invoke-direct {v6, v7, v5}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    move-object v5, v6

    .line 159
    goto :goto_2

    .line 160
    :cond_4
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 161
    .line 162
    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 163
    .line 164
    .line 165
    throw v1

    .line 166
    :cond_5
    if-eqz p3, :cond_6

    .line 167
    .line 168
    if-nez v2, :cond_6

    .line 169
    .line 170
    iget-wide v5, v7, Lk2/H;->d:J

    .line 171
    .line 172
    iget-wide v7, v12, Lk2/H;->d:J

    .line 173
    .line 174
    cmp-long v5, v5, v7

    .line 175
    .line 176
    if-gez v5, :cond_6

    .line 177
    .line 178
    new-instance v5, Landroid/util/Pair;

    .line 179
    .line 180
    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 181
    .line 182
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 183
    .line 184
    .line 185
    move-result-object v7

    .line 186
    invoke-direct {v5, v6, v7}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    goto :goto_2

    .line 190
    :cond_6
    if-eqz p3, :cond_7

    .line 191
    .line 192
    if-ne v2, v10, :cond_7

    .line 193
    .line 194
    if-eqz p8, :cond_7

    .line 195
    .line 196
    new-instance v5, Landroid/util/Pair;

    .line 197
    .line 198
    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 199
    .line 200
    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 201
    .line 202
    .line 203
    move-result-object v7

    .line 204
    invoke-direct {v5, v6, v7}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 205
    .line 206
    .line 207
    goto :goto_2

    .line 208
    :cond_7
    new-instance v5, Landroid/util/Pair;

    .line 209
    .line 210
    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 211
    .line 212
    invoke-direct {v5, v6, v9}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 213
    .line 214
    .line 215
    :goto_2
    iget-object v6, v5, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 216
    .line 217
    check-cast v6, Ljava/lang/Boolean;

    .line 218
    .line 219
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 220
    .line 221
    .line 222
    move-result v6

    .line 223
    iget-object v5, v5, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 224
    .line 225
    check-cast v5, Ljava/lang/Integer;

    .line 226
    .line 227
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 228
    .line 229
    .line 230
    move-result v5

    .line 231
    if-eqz v6, :cond_9

    .line 232
    .line 233
    iget-object v8, v1, LU1/P;->a:LN1/N;

    .line 234
    .line 235
    invoke-virtual {v8}, LN1/N;->p()Z

    .line 236
    .line 237
    .line 238
    move-result v8

    .line 239
    if-nez v8, :cond_8

    .line 240
    .line 241
    iget-object v8, v1, LU1/P;->a:LN1/N;

    .line 242
    .line 243
    iget-object v9, v1, LU1/P;->b:Lk2/H;

    .line 244
    .line 245
    iget-object v9, v9, Lk2/H;->a:Ljava/lang/Object;

    .line 246
    .line 247
    iget-object v11, v0, LU1/u;->n:LN1/L;

    .line 248
    .line 249
    invoke-virtual {v8, v9, v11}, LN1/N;->g(Ljava/lang/Object;LN1/L;)LN1/L;

    .line 250
    .line 251
    .line 252
    move-result-object v8

    .line 253
    iget v8, v8, LN1/L;->c:I

    .line 254
    .line 255
    iget-object v9, v1, LU1/P;->a:LN1/N;

    .line 256
    .line 257
    iget-object v11, v0, LA7/B0;->a:Ljava/lang/Object;

    .line 258
    .line 259
    check-cast v11, LN1/M;

    .line 260
    .line 261
    invoke-virtual {v9, v8, v11, v13, v14}, LN1/N;->m(ILN1/M;J)LN1/M;

    .line 262
    .line 263
    .line 264
    move-result-object v8

    .line 265
    iget-object v8, v8, LN1/M;->c:LN1/w;

    .line 266
    .line 267
    goto :goto_3

    .line 268
    :cond_8
    const/4 v8, 0x0

    .line 269
    :goto_3
    sget-object v9, LN1/z;->B:LN1/z;

    .line 270
    .line 271
    iput-object v9, v0, LU1/u;->c0:LN1/z;

    .line 272
    .line 273
    goto :goto_4

    .line 274
    :cond_9
    const/4 v8, 0x0

    .line 275
    :goto_4
    if-nez v6, :cond_a

    .line 276
    .line 277
    iget-object v9, v3, LU1/P;->j:Ljava/util/List;

    .line 278
    .line 279
    iget-object v11, v1, LU1/P;->j:Ljava/util/List;

    .line 280
    .line 281
    invoke-interface {v9, v11}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    .line 282
    .line 283
    .line 284
    move-result v9

    .line 285
    if-nez v9, :cond_d

    .line 286
    .line 287
    :cond_a
    iget-object v9, v0, LU1/u;->c0:LN1/z;

    .line 288
    .line 289
    invoke-virtual {v9}, LN1/z;->a()LN1/y;

    .line 290
    .line 291
    .line 292
    move-result-object v9

    .line 293
    iget-object v11, v1, LU1/P;->j:Ljava/util/List;

    .line 294
    .line 295
    move/from16 v12, v18

    .line 296
    .line 297
    :goto_5
    invoke-interface {v11}, Ljava/util/List;->size()I

    .line 298
    .line 299
    .line 300
    move-result v15

    .line 301
    if-ge v12, v15, :cond_c

    .line 302
    .line 303
    invoke-interface {v11, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    move-result-object v15

    .line 307
    check-cast v15, LN1/B;

    .line 308
    .line 309
    move/from16 v7, v18

    .line 310
    .line 311
    :goto_6
    iget-object v10, v15, LN1/B;->a:[LN1/A;

    .line 312
    .line 313
    array-length v13, v10

    .line 314
    if-ge v7, v13, :cond_b

    .line 315
    .line 316
    aget-object v10, v10, v7

    .line 317
    .line 318
    invoke-interface {v10, v9}, LN1/A;->P(LN1/y;)V

    .line 319
    .line 320
    .line 321
    add-int/lit8 v7, v7, 0x1

    .line 322
    .line 323
    const-wide/16 v13, 0x0

    .line 324
    .line 325
    goto :goto_6

    .line 326
    :cond_b
    add-int/lit8 v12, v12, 0x1

    .line 327
    .line 328
    const/4 v10, 0x1

    .line 329
    const-wide/16 v13, 0x0

    .line 330
    .line 331
    goto :goto_5

    .line 332
    :cond_c
    new-instance v7, LN1/z;

    .line 333
    .line 334
    invoke-direct {v7, v9}, LN1/z;-><init>(LN1/y;)V

    .line 335
    .line 336
    .line 337
    iput-object v7, v0, LU1/u;->c0:LN1/z;

    .line 338
    .line 339
    :cond_d
    invoke-virtual {v0}, LU1/u;->g0()LN1/z;

    .line 340
    .line 341
    .line 342
    move-result-object v7

    .line 343
    iget-object v9, v0, LU1/u;->L:LN1/z;

    .line 344
    .line 345
    invoke-virtual {v7, v9}, LN1/z;->equals(Ljava/lang/Object;)Z

    .line 346
    .line 347
    .line 348
    move-result v9

    .line 349
    iput-object v7, v0, LU1/u;->L:LN1/z;

    .line 350
    .line 351
    iget-boolean v7, v3, LU1/P;->l:Z

    .line 352
    .line 353
    iget-boolean v10, v1, LU1/P;->l:Z

    .line 354
    .line 355
    if-eq v7, v10, :cond_e

    .line 356
    .line 357
    const/4 v7, 0x1

    .line 358
    goto :goto_7

    .line 359
    :cond_e
    move/from16 v7, v18

    .line 360
    .line 361
    :goto_7
    iget v10, v3, LU1/P;->e:I

    .line 362
    .line 363
    iget v11, v1, LU1/P;->e:I

    .line 364
    .line 365
    if-eq v10, v11, :cond_f

    .line 366
    .line 367
    const/4 v10, 0x1

    .line 368
    goto :goto_8

    .line 369
    :cond_f
    move/from16 v10, v18

    .line 370
    .line 371
    :goto_8
    if-nez v10, :cond_10

    .line 372
    .line 373
    if-eqz v7, :cond_11

    .line 374
    .line 375
    :cond_10
    invoke-virtual {v0}, LU1/u;->R0()V

    .line 376
    .line 377
    .line 378
    :cond_11
    iget-boolean v11, v3, LU1/P;->g:Z

    .line 379
    .line 380
    iget-boolean v12, v1, LU1/P;->g:Z

    .line 381
    .line 382
    if-eq v11, v12, :cond_12

    .line 383
    .line 384
    const/4 v11, 0x1

    .line 385
    goto :goto_9

    .line 386
    :cond_12
    move/from16 v11, v18

    .line 387
    .line 388
    :goto_9
    if-nez v4, :cond_13

    .line 389
    .line 390
    iget-object v4, v0, LU1/u;->l:LQ1/j;

    .line 391
    .line 392
    new-instance v12, LE5/A;

    .line 393
    .line 394
    const/4 v13, 0x1

    .line 395
    move/from16 v14, p2

    .line 396
    .line 397
    invoke-direct {v12, v1, v14, v13}, LE5/A;-><init>(Ljava/lang/Object;II)V

    .line 398
    .line 399
    .line 400
    move/from16 v13, v18

    .line 401
    .line 402
    invoke-virtual {v4, v13, v12}, LQ1/j;->c(ILQ1/g;)V

    .line 403
    .line 404
    .line 405
    :cond_13
    if-eqz p3, :cond_1b

    .line 406
    .line 407
    new-instance v4, LN1/L;

    .line 408
    .line 409
    invoke-direct {v4}, LN1/L;-><init>()V

    .line 410
    .line 411
    .line 412
    iget-object v12, v3, LU1/P;->a:LN1/N;

    .line 413
    .line 414
    invoke-virtual {v12}, LN1/N;->p()Z

    .line 415
    .line 416
    .line 417
    move-result v12

    .line 418
    if-nez v12, :cond_14

    .line 419
    .line 420
    iget-object v12, v3, LU1/P;->b:Lk2/H;

    .line 421
    .line 422
    iget-object v12, v12, Lk2/H;->a:Ljava/lang/Object;

    .line 423
    .line 424
    iget-object v13, v3, LU1/P;->a:LN1/N;

    .line 425
    .line 426
    invoke-virtual {v13, v12, v4}, LN1/N;->g(Ljava/lang/Object;LN1/L;)LN1/L;

    .line 427
    .line 428
    .line 429
    iget v13, v4, LN1/L;->c:I

    .line 430
    .line 431
    iget-object v14, v3, LU1/P;->a:LN1/N;

    .line 432
    .line 433
    invoke-virtual {v14, v12}, LN1/N;->b(Ljava/lang/Object;)I

    .line 434
    .line 435
    .line 436
    move-result v14

    .line 437
    iget-object v15, v3, LU1/P;->a:LN1/N;

    .line 438
    .line 439
    move/from16 v18, v6

    .line 440
    .line 441
    iget-object v6, v0, LA7/B0;->a:Ljava/lang/Object;

    .line 442
    .line 443
    check-cast v6, LN1/M;

    .line 444
    .line 445
    move/from16 v19, v9

    .line 446
    .line 447
    move/from16 v20, v10

    .line 448
    .line 449
    const-wide/16 v9, 0x0

    .line 450
    .line 451
    invoke-virtual {v15, v13, v6, v9, v10}, LN1/N;->m(ILN1/M;J)LN1/M;

    .line 452
    .line 453
    .line 454
    move-result-object v6

    .line 455
    iget-object v6, v6, LN1/M;->a:Ljava/lang/Object;

    .line 456
    .line 457
    iget-object v9, v0, LA7/B0;->a:Ljava/lang/Object;

    .line 458
    .line 459
    check-cast v9, LN1/M;

    .line 460
    .line 461
    iget-object v9, v9, LN1/M;->c:LN1/w;

    .line 462
    .line 463
    move-object/from16 v22, v6

    .line 464
    .line 465
    move-object/from16 v24, v9

    .line 466
    .line 467
    move-object/from16 v25, v12

    .line 468
    .line 469
    move/from16 v23, v13

    .line 470
    .line 471
    move/from16 v26, v14

    .line 472
    .line 473
    goto :goto_a

    .line 474
    :cond_14
    move/from16 v18, v6

    .line 475
    .line 476
    move/from16 v19, v9

    .line 477
    .line 478
    move/from16 v20, v10

    .line 479
    .line 480
    move/from16 v23, p7

    .line 481
    .line 482
    const/16 v22, 0x0

    .line 483
    .line 484
    const/16 v24, 0x0

    .line 485
    .line 486
    const/16 v25, 0x0

    .line 487
    .line 488
    const/16 v26, -0x1

    .line 489
    .line 490
    :goto_a
    if-nez v2, :cond_17

    .line 491
    .line 492
    iget-object v6, v3, LU1/P;->b:Lk2/H;

    .line 493
    .line 494
    invoke-virtual {v6}, Lk2/H;->b()Z

    .line 495
    .line 496
    .line 497
    move-result v6

    .line 498
    if-eqz v6, :cond_15

    .line 499
    .line 500
    iget-object v6, v3, LU1/P;->b:Lk2/H;

    .line 501
    .line 502
    iget v9, v6, Lk2/H;->b:I

    .line 503
    .line 504
    iget v6, v6, Lk2/H;->c:I

    .line 505
    .line 506
    invoke-virtual {v4, v9, v6}, LN1/L;->a(II)J

    .line 507
    .line 508
    .line 509
    move-result-wide v9

    .line 510
    invoke-static {v3}, LU1/u;->u0(LU1/P;)J

    .line 511
    .line 512
    .line 513
    move-result-wide v12

    .line 514
    goto :goto_d

    .line 515
    :cond_15
    iget-object v6, v3, LU1/P;->b:Lk2/H;

    .line 516
    .line 517
    iget v6, v6, Lk2/H;->e:I

    .line 518
    .line 519
    const/4 v9, -0x1

    .line 520
    if-eq v6, v9, :cond_16

    .line 521
    .line 522
    iget-object v4, v0, LU1/u;->d0:LU1/P;

    .line 523
    .line 524
    invoke-static {v4}, LU1/u;->u0(LU1/P;)J

    .line 525
    .line 526
    .line 527
    move-result-wide v9

    .line 528
    :goto_b
    move-wide v12, v9

    .line 529
    goto :goto_d

    .line 530
    :cond_16
    iget-wide v9, v4, LN1/L;->e:J

    .line 531
    .line 532
    iget-wide v12, v4, LN1/L;->d:J

    .line 533
    .line 534
    :goto_c
    add-long/2addr v9, v12

    .line 535
    goto :goto_b

    .line 536
    :cond_17
    iget-object v6, v3, LU1/P;->b:Lk2/H;

    .line 537
    .line 538
    invoke-virtual {v6}, Lk2/H;->b()Z

    .line 539
    .line 540
    .line 541
    move-result v6

    .line 542
    if-eqz v6, :cond_18

    .line 543
    .line 544
    iget-wide v9, v3, LU1/P;->s:J

    .line 545
    .line 546
    invoke-static {v3}, LU1/u;->u0(LU1/P;)J

    .line 547
    .line 548
    .line 549
    move-result-wide v12

    .line 550
    goto :goto_d

    .line 551
    :cond_18
    iget-wide v9, v4, LN1/L;->e:J

    .line 552
    .line 553
    iget-wide v12, v3, LU1/P;->s:J

    .line 554
    .line 555
    goto :goto_c

    .line 556
    :goto_d
    new-instance v21, LN1/I;

    .line 557
    .line 558
    invoke-static {v9, v10}, LQ1/x;->W(J)J

    .line 559
    .line 560
    .line 561
    move-result-wide v27

    .line 562
    invoke-static {v12, v13}, LQ1/x;->W(J)J

    .line 563
    .line 564
    .line 565
    move-result-wide v29

    .line 566
    iget-object v4, v3, LU1/P;->b:Lk2/H;

    .line 567
    .line 568
    iget v6, v4, Lk2/H;->b:I

    .line 569
    .line 570
    iget v4, v4, Lk2/H;->c:I

    .line 571
    .line 572
    move/from16 v32, v4

    .line 573
    .line 574
    move/from16 v31, v6

    .line 575
    .line 576
    invoke-direct/range {v21 .. v32}, LN1/I;-><init>(Ljava/lang/Object;ILN1/w;Ljava/lang/Object;IJJII)V

    .line 577
    .line 578
    .line 579
    move-object/from16 v4, v21

    .line 580
    .line 581
    invoke-virtual {v0}, LU1/u;->l0()I

    .line 582
    .line 583
    .line 584
    move-result v6

    .line 585
    iget-object v9, v0, LU1/u;->d0:LU1/P;

    .line 586
    .line 587
    iget-object v9, v9, LU1/P;->a:LN1/N;

    .line 588
    .line 589
    invoke-virtual {v9}, LN1/N;->p()Z

    .line 590
    .line 591
    .line 592
    move-result v9

    .line 593
    if-nez v9, :cond_19

    .line 594
    .line 595
    iget-object v9, v0, LU1/u;->d0:LU1/P;

    .line 596
    .line 597
    iget-object v10, v9, LU1/P;->b:Lk2/H;

    .line 598
    .line 599
    iget-object v10, v10, Lk2/H;->a:Ljava/lang/Object;

    .line 600
    .line 601
    iget-object v9, v9, LU1/P;->a:LN1/N;

    .line 602
    .line 603
    iget-object v12, v0, LU1/u;->n:LN1/L;

    .line 604
    .line 605
    invoke-virtual {v9, v10, v12}, LN1/N;->g(Ljava/lang/Object;LN1/L;)LN1/L;

    .line 606
    .line 607
    .line 608
    iget-object v9, v0, LU1/u;->d0:LU1/P;

    .line 609
    .line 610
    iget-object v9, v9, LU1/P;->a:LN1/N;

    .line 611
    .line 612
    invoke-virtual {v9, v10}, LN1/N;->b(Ljava/lang/Object;)I

    .line 613
    .line 614
    .line 615
    move-result v9

    .line 616
    iget-object v12, v0, LU1/u;->d0:LU1/P;

    .line 617
    .line 618
    iget-object v12, v12, LU1/P;->a:LN1/N;

    .line 619
    .line 620
    iget-object v13, v0, LA7/B0;->a:Ljava/lang/Object;

    .line 621
    .line 622
    check-cast v13, LN1/M;

    .line 623
    .line 624
    const-wide/16 v14, 0x0

    .line 625
    .line 626
    invoke-virtual {v12, v6, v13, v14, v15}, LN1/N;->m(ILN1/M;J)LN1/M;

    .line 627
    .line 628
    .line 629
    move-result-object v12

    .line 630
    iget-object v12, v12, LN1/M;->a:Ljava/lang/Object;

    .line 631
    .line 632
    iget-object v13, v13, LN1/M;->c:LN1/w;

    .line 633
    .line 634
    move/from16 v26, v9

    .line 635
    .line 636
    move-object/from16 v25, v10

    .line 637
    .line 638
    move-object/from16 v22, v12

    .line 639
    .line 640
    move-object/from16 v24, v13

    .line 641
    .line 642
    goto :goto_e

    .line 643
    :cond_19
    const/16 v22, 0x0

    .line 644
    .line 645
    const/16 v24, 0x0

    .line 646
    .line 647
    const/16 v25, 0x0

    .line 648
    .line 649
    const/16 v26, -0x1

    .line 650
    .line 651
    :goto_e
    invoke-static/range {p5 .. p6}, LQ1/x;->W(J)J

    .line 652
    .line 653
    .line 654
    move-result-wide v27

    .line 655
    new-instance v21, LN1/I;

    .line 656
    .line 657
    iget-object v9, v0, LU1/u;->d0:LU1/P;

    .line 658
    .line 659
    iget-object v9, v9, LU1/P;->b:Lk2/H;

    .line 660
    .line 661
    invoke-virtual {v9}, Lk2/H;->b()Z

    .line 662
    .line 663
    .line 664
    move-result v9

    .line 665
    if-eqz v9, :cond_1a

    .line 666
    .line 667
    iget-object v9, v0, LU1/u;->d0:LU1/P;

    .line 668
    .line 669
    invoke-static {v9}, LU1/u;->u0(LU1/P;)J

    .line 670
    .line 671
    .line 672
    move-result-wide v9

    .line 673
    invoke-static {v9, v10}, LQ1/x;->W(J)J

    .line 674
    .line 675
    .line 676
    move-result-wide v9

    .line 677
    move-wide/from16 v29, v9

    .line 678
    .line 679
    goto :goto_f

    .line 680
    :cond_1a
    move-wide/from16 v29, v27

    .line 681
    .line 682
    :goto_f
    iget-object v9, v0, LU1/u;->d0:LU1/P;

    .line 683
    .line 684
    iget-object v9, v9, LU1/P;->b:Lk2/H;

    .line 685
    .line 686
    iget v10, v9, Lk2/H;->b:I

    .line 687
    .line 688
    iget v9, v9, Lk2/H;->c:I

    .line 689
    .line 690
    move/from16 v23, v6

    .line 691
    .line 692
    move/from16 v32, v9

    .line 693
    .line 694
    move/from16 v31, v10

    .line 695
    .line 696
    invoke-direct/range {v21 .. v32}, LN1/I;-><init>(Ljava/lang/Object;ILN1/w;Ljava/lang/Object;IJJII)V

    .line 697
    .line 698
    .line 699
    move-object/from16 v6, v21

    .line 700
    .line 701
    iget-object v9, v0, LU1/u;->l:LQ1/j;

    .line 702
    .line 703
    new-instance v10, LE5/z;

    .line 704
    .line 705
    const/4 v12, 0x1

    .line 706
    invoke-direct {v10, v4, v2, v12, v6}, LE5/z;-><init>(Ljava/lang/Object;IILjava/lang/Object;)V

    .line 707
    .line 708
    .line 709
    const/16 v2, 0xb

    .line 710
    .line 711
    invoke-virtual {v9, v2, v10}, LQ1/j;->c(ILQ1/g;)V

    .line 712
    .line 713
    .line 714
    goto :goto_10

    .line 715
    :cond_1b
    move/from16 v18, v6

    .line 716
    .line 717
    move/from16 v19, v9

    .line 718
    .line 719
    move/from16 v20, v10

    .line 720
    .line 721
    :goto_10
    if-eqz v18, :cond_1c

    .line 722
    .line 723
    iget-object v2, v0, LU1/u;->l:LQ1/j;

    .line 724
    .line 725
    new-instance v4, LE5/A;

    .line 726
    .line 727
    const/4 v6, 0x2

    .line 728
    invoke-direct {v4, v8, v5, v6}, LE5/A;-><init>(Ljava/lang/Object;II)V

    .line 729
    .line 730
    .line 731
    const/4 v5, 0x1

    .line 732
    invoke-virtual {v2, v5, v4}, LQ1/j;->c(ILQ1/g;)V

    .line 733
    .line 734
    .line 735
    :cond_1c
    iget-object v2, v3, LU1/P;->f:LU1/j;

    .line 736
    .line 737
    iget-object v4, v1, LU1/P;->f:LU1/j;

    .line 738
    .line 739
    if-eq v2, v4, :cond_1d

    .line 740
    .line 741
    iget-object v2, v0, LU1/u;->l:LQ1/j;

    .line 742
    .line 743
    new-instance v4, LU1/n;

    .line 744
    .line 745
    const/16 v5, 0x8

    .line 746
    .line 747
    invoke-direct {v4, v1, v5}, LU1/n;-><init>(LU1/P;I)V

    .line 748
    .line 749
    .line 750
    const/16 v5, 0xa

    .line 751
    .line 752
    invoke-virtual {v2, v5, v4}, LQ1/j;->c(ILQ1/g;)V

    .line 753
    .line 754
    .line 755
    iget-object v2, v1, LU1/P;->f:LU1/j;

    .line 756
    .line 757
    if-eqz v2, :cond_1d

    .line 758
    .line 759
    iget-object v2, v0, LU1/u;->l:LQ1/j;

    .line 760
    .line 761
    new-instance v4, LU1/n;

    .line 762
    .line 763
    const/16 v6, 0x9

    .line 764
    .line 765
    invoke-direct {v4, v1, v6}, LU1/n;-><init>(LU1/P;I)V

    .line 766
    .line 767
    .line 768
    invoke-virtual {v2, v5, v4}, LQ1/j;->c(ILQ1/g;)V

    .line 769
    .line 770
    .line 771
    :cond_1d
    iget-object v2, v3, LU1/P;->i:Ln2/t;

    .line 772
    .line 773
    iget-object v4, v1, LU1/P;->i:Ln2/t;

    .line 774
    .line 775
    if-eq v2, v4, :cond_1e

    .line 776
    .line 777
    iget-object v2, v0, LU1/u;->h:Ln2/s;

    .line 778
    .line 779
    iget-object v4, v4, Ln2/t;->e:LR1/q;

    .line 780
    .line 781
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 782
    .line 783
    .line 784
    iget-object v2, v0, LU1/u;->l:LQ1/j;

    .line 785
    .line 786
    new-instance v4, LU1/n;

    .line 787
    .line 788
    const/4 v5, 0x0

    .line 789
    invoke-direct {v4, v1, v5}, LU1/n;-><init>(LU1/P;I)V

    .line 790
    .line 791
    .line 792
    move/from16 v5, v17

    .line 793
    .line 794
    invoke-virtual {v2, v5, v4}, LQ1/j;->c(ILQ1/g;)V

    .line 795
    .line 796
    .line 797
    :cond_1e
    if-nez v19, :cond_1f

    .line 798
    .line 799
    iget-object v2, v0, LU1/u;->L:LN1/z;

    .line 800
    .line 801
    iget-object v4, v0, LU1/u;->l:LQ1/j;

    .line 802
    .line 803
    new-instance v5, LS8/b;

    .line 804
    .line 805
    const/4 v6, 0x1

    .line 806
    invoke-direct {v5, v2, v6}, LS8/b;-><init>(Ljava/lang/Object;I)V

    .line 807
    .line 808
    .line 809
    const/16 v2, 0xe

    .line 810
    .line 811
    invoke-virtual {v4, v2, v5}, LQ1/j;->c(ILQ1/g;)V

    .line 812
    .line 813
    .line 814
    :cond_1f
    if-eqz v11, :cond_20

    .line 815
    .line 816
    iget-object v2, v0, LU1/u;->l:LQ1/j;

    .line 817
    .line 818
    new-instance v4, LU1/n;

    .line 819
    .line 820
    const/4 v5, 0x1

    .line 821
    invoke-direct {v4, v1, v5}, LU1/n;-><init>(LU1/P;I)V

    .line 822
    .line 823
    .line 824
    move/from16 v5, v16

    .line 825
    .line 826
    invoke-virtual {v2, v5, v4}, LQ1/j;->c(ILQ1/g;)V

    .line 827
    .line 828
    .line 829
    :cond_20
    if-nez v20, :cond_21

    .line 830
    .line 831
    if-eqz v7, :cond_22

    .line 832
    .line 833
    :cond_21
    iget-object v2, v0, LU1/u;->l:LQ1/j;

    .line 834
    .line 835
    new-instance v4, LU1/n;

    .line 836
    .line 837
    const/4 v5, 0x2

    .line 838
    invoke-direct {v4, v1, v5}, LU1/n;-><init>(LU1/P;I)V

    .line 839
    .line 840
    .line 841
    const/4 v9, -0x1

    .line 842
    invoke-virtual {v2, v9, v4}, LQ1/j;->c(ILQ1/g;)V

    .line 843
    .line 844
    .line 845
    :cond_22
    if-eqz v20, :cond_23

    .line 846
    .line 847
    iget-object v2, v0, LU1/u;->l:LQ1/j;

    .line 848
    .line 849
    new-instance v4, LU1/n;

    .line 850
    .line 851
    const/4 v5, 0x3

    .line 852
    invoke-direct {v4, v1, v5}, LU1/n;-><init>(LU1/P;I)V

    .line 853
    .line 854
    .line 855
    const/4 v5, 0x4

    .line 856
    invoke-virtual {v2, v5, v4}, LQ1/j;->c(ILQ1/g;)V

    .line 857
    .line 858
    .line 859
    :cond_23
    if-nez v7, :cond_24

    .line 860
    .line 861
    iget v2, v3, LU1/P;->m:I

    .line 862
    .line 863
    iget v4, v1, LU1/P;->m:I

    .line 864
    .line 865
    if-eq v2, v4, :cond_25

    .line 866
    .line 867
    :cond_24
    iget-object v2, v0, LU1/u;->l:LQ1/j;

    .line 868
    .line 869
    new-instance v4, LU1/n;

    .line 870
    .line 871
    const/4 v5, 0x4

    .line 872
    invoke-direct {v4, v1, v5}, LU1/n;-><init>(LU1/P;I)V

    .line 873
    .line 874
    .line 875
    const/4 v5, 0x5

    .line 876
    invoke-virtual {v2, v5, v4}, LQ1/j;->c(ILQ1/g;)V

    .line 877
    .line 878
    .line 879
    :cond_25
    iget v2, v3, LU1/P;->n:I

    .line 880
    .line 881
    iget v4, v1, LU1/P;->n:I

    .line 882
    .line 883
    if-eq v2, v4, :cond_26

    .line 884
    .line 885
    iget-object v2, v0, LU1/u;->l:LQ1/j;

    .line 886
    .line 887
    new-instance v4, LU1/n;

    .line 888
    .line 889
    const/4 v5, 0x5

    .line 890
    invoke-direct {v4, v1, v5}, LU1/n;-><init>(LU1/P;I)V

    .line 891
    .line 892
    .line 893
    const/4 v5, 0x6

    .line 894
    invoke-virtual {v2, v5, v4}, LQ1/j;->c(ILQ1/g;)V

    .line 895
    .line 896
    .line 897
    :cond_26
    invoke-virtual {v3}, LU1/P;->k()Z

    .line 898
    .line 899
    .line 900
    move-result v2

    .line 901
    invoke-virtual {v1}, LU1/P;->k()Z

    .line 902
    .line 903
    .line 904
    move-result v4

    .line 905
    if-eq v2, v4, :cond_27

    .line 906
    .line 907
    iget-object v2, v0, LU1/u;->l:LQ1/j;

    .line 908
    .line 909
    new-instance v4, LU1/n;

    .line 910
    .line 911
    const/4 v5, 0x6

    .line 912
    invoke-direct {v4, v1, v5}, LU1/n;-><init>(LU1/P;I)V

    .line 913
    .line 914
    .line 915
    const/4 v5, 0x7

    .line 916
    invoke-virtual {v2, v5, v4}, LQ1/j;->c(ILQ1/g;)V

    .line 917
    .line 918
    .line 919
    :cond_27
    iget-object v2, v3, LU1/P;->o:LN1/F;

    .line 920
    .line 921
    iget-object v4, v1, LU1/P;->o:LN1/F;

    .line 922
    .line 923
    invoke-virtual {v2, v4}, LN1/F;->equals(Ljava/lang/Object;)Z

    .line 924
    .line 925
    .line 926
    move-result v2

    .line 927
    if-nez v2, :cond_28

    .line 928
    .line 929
    iget-object v2, v0, LU1/u;->l:LQ1/j;

    .line 930
    .line 931
    new-instance v4, LU1/n;

    .line 932
    .line 933
    const/4 v5, 0x7

    .line 934
    invoke-direct {v4, v1, v5}, LU1/n;-><init>(LU1/P;I)V

    .line 935
    .line 936
    .line 937
    const/16 v5, 0xc

    .line 938
    .line 939
    invoke-virtual {v2, v5, v4}, LQ1/j;->c(ILQ1/g;)V

    .line 940
    .line 941
    .line 942
    :cond_28
    invoke-virtual {v0}, LU1/u;->O0()V

    .line 943
    .line 944
    .line 945
    iget-object v2, v0, LU1/u;->l:LQ1/j;

    .line 946
    .line 947
    invoke-virtual {v2}, LQ1/j;->b()V

    .line 948
    .line 949
    .line 950
    iget-boolean v2, v3, LU1/P;->p:Z

    .line 951
    .line 952
    iget-boolean v1, v1, LU1/P;->p:Z

    .line 953
    .line 954
    if-eq v2, v1, :cond_29

    .line 955
    .line 956
    iget-object v1, v0, LU1/u;->m:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 957
    .line 958
    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    .line 959
    .line 960
    .line 961
    move-result-object v1

    .line 962
    :goto_11
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 963
    .line 964
    .line 965
    move-result v2

    .line 966
    if-eqz v2, :cond_29

    .line 967
    .line 968
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 969
    .line 970
    .line 971
    move-result-object v2

    .line 972
    check-cast v2, LU1/r;

    .line 973
    .line 974
    iget-object v2, v2, LU1/r;->a:LU1/u;

    .line 975
    .line 976
    invoke-virtual {v2}, LU1/u;->R0()V

    .line 977
    .line 978
    .line 979
    goto :goto_11

    .line 980
    :cond_29
    return-void
.end method

.method public final R0()V
    .locals 4

    .line 1
    invoke-virtual {p0}, LU1/u;->t0()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, LU1/u;->A:LG4/c;

    .line 6
    .line 7
    iget-object v2, p0, LU1/u;->z:LJ4/c;

    .line 8
    .line 9
    const/4 v3, 0x1

    .line 10
    if-eq v0, v3, :cond_2

    .line 11
    .line 12
    const/4 v3, 0x2

    .line 13
    if-eq v0, v3, :cond_1

    .line 14
    .line 15
    const/4 v3, 0x3

    .line 16
    if-eq v0, v3, :cond_1

    .line 17
    .line 18
    const/4 v3, 0x4

    .line 19
    if-ne v0, v3, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 23
    .line 24
    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    .line 25
    .line 26
    .line 27
    throw v0

    .line 28
    :cond_1
    invoke-virtual {p0}, LU1/u;->S0()V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, LU1/u;->d0:LU1/P;

    .line 32
    .line 33
    iget-boolean v0, v0, LU1/P;->p:Z

    .line 34
    .line 35
    invoke-virtual {p0}, LU1/u;->s0()Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0}, LU1/u;->s0()Z

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_2
    :goto_0
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    :goto_1
    return-void
.end method

.method public final S0()V
    .locals 6

    .line 1
    iget-object v0, p0, LU1/u;->d:Ls8/b;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x0

    .line 5
    :goto_0
    :try_start_0
    iget-boolean v2, v0, Ls8/b;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    if-nez v2, :cond_0

    .line 9
    .line 10
    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :catchall_0
    move-exception v1

    .line 15
    goto :goto_3

    .line 16
    :catch_0
    move v1, v3

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    if-eqz v1, :cond_1

    .line 19
    .line 20
    :try_start_2
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 25
    .line 26
    .line 27
    :cond_1
    monitor-exit v0

    .line 28
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iget-object v1, p0, LU1/u;->s:Landroid/os/Looper;

    .line 33
    .line 34
    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    if-eq v0, v1, :cond_4

    .line 39
    .line 40
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {v0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iget-object v1, p0, LU1/u;->s:Landroid/os/Looper;

    .line 49
    .line 50
    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    sget v2, LQ1/x;->a:I

    .line 59
    .line 60
    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 61
    .line 62
    const-string v2, "Player is accessed on the wrong thread.\nCurrent thread: \'"

    .line 63
    .line 64
    const-string v4, "\'\nExpected thread: \'"

    .line 65
    .line 66
    const-string v5, "\'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread"

    .line 67
    .line 68
    invoke-static {v2, v0, v4, v1, v5}, LR8/v;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    iget-boolean v1, p0, LU1/u;->X:Z

    .line 73
    .line 74
    if-nez v1, :cond_3

    .line 75
    .line 76
    const-string v1, "ExoPlayerImpl"

    .line 77
    .line 78
    iget-boolean v2, p0, LU1/u;->Y:Z

    .line 79
    .line 80
    if-eqz v2, :cond_2

    .line 81
    .line 82
    const/4 v2, 0x0

    .line 83
    goto :goto_1

    .line 84
    :cond_2
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 85
    .line 86
    invoke-direct {v2}, Ljava/lang/IllegalStateException;-><init>()V

    .line 87
    .line 88
    .line 89
    :goto_1
    invoke-static {v1, v0, v2}, LQ1/k;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 90
    .line 91
    .line 92
    iput-boolean v3, p0, LU1/u;->Y:Z

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_3
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 96
    .line 97
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    throw v1

    .line 101
    :cond_4
    :goto_2
    return-void

    .line 102
    :goto_3
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 103
    throw v1
.end method

.method public final e0(ILjava/util/List;)Ljava/util/ArrayList;
    .locals 7

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-ge v1, v2, :cond_0

    .line 12
    .line 13
    new-instance v2, LU1/O;

    .line 14
    .line 15
    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    check-cast v3, Lk2/a;

    .line 20
    .line 21
    iget-boolean v4, p0, LU1/u;->p:Z

    .line 22
    .line 23
    invoke-direct {v2, v3, v4}, LU1/O;-><init>(Lk2/a;Z)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    iget-object v3, p0, LU1/u;->o:Ljava/util/ArrayList;

    .line 30
    .line 31
    add-int v4, v1, p1

    .line 32
    .line 33
    new-instance v5, LU1/t;

    .line 34
    .line 35
    iget-object v6, v2, LU1/O;->b:Ljava/lang/Object;

    .line 36
    .line 37
    iget-object v2, v2, LU1/O;->a:Lk2/D;

    .line 38
    .line 39
    invoke-direct {v5, v6, v2}, LU1/t;-><init>(Ljava/lang/Object;Lk2/D;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v3, v4, v5}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    add-int/lit8 v1, v1, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    iget-object p2, p0, LU1/u;->I:Lk2/g0;

    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    invoke-virtual {p2, p1, v1}, Lk2/g0;->b(II)Lk2/g0;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    iput-object p1, p0, LU1/u;->I:Lk2/g0;

    .line 59
    .line 60
    return-object v0
.end method

.method public final f0(Ljava/util/ArrayList;I)V
    .locals 15

    .line 1
    move/from16 v1, p2

    .line 2
    .line 3
    invoke-virtual {p0}, LU1/u;->S0()V

    .line 4
    .line 5
    .line 6
    const/4 v6, 0x0

    .line 7
    const/4 v2, 0x1

    .line 8
    if-ltz v1, :cond_0

    .line 9
    .line 10
    move v3, v2

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move v3, v6

    .line 13
    :goto_0
    invoke-static {v3}, LQ1/k;->c(Z)V

    .line 14
    .line 15
    .line 16
    iget-object v3, p0, LU1/u;->o:Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    invoke-static {v1, v4}, Ljava/lang/Math;->min(II)I

    .line 23
    .line 24
    .line 25
    move-result v7

    .line 26
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    iget v1, p0, LU1/u;->e0:I

    .line 33
    .line 34
    const/4 v3, -0x1

    .line 35
    if-ne v1, v3, :cond_1

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    move v2, v6

    .line 39
    :goto_1
    invoke-virtual {p0}, LU1/u;->S0()V

    .line 40
    .line 41
    .line 42
    const/4 v5, -0x1

    .line 43
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    move-object v0, p0

    .line 49
    move-object/from16 v1, p1

    .line 50
    .line 51
    invoke-virtual/range {v0 .. v5}, LU1/u;->F0(Ljava/util/List;ZJI)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_2
    iget-object v8, p0, LU1/u;->d0:LU1/P;

    .line 56
    .line 57
    iget-object v1, v8, LU1/P;->a:LN1/N;

    .line 58
    .line 59
    iget v4, p0, LU1/u;->E:I

    .line 60
    .line 61
    add-int/2addr v4, v2

    .line 62
    iput v4, p0, LU1/u;->E:I

    .line 63
    .line 64
    move-object/from16 v2, p1

    .line 65
    .line 66
    invoke-virtual {p0, v7, v2}, LU1/u;->e0(ILjava/util/List;)Ljava/util/ArrayList;

    .line 67
    .line 68
    .line 69
    move-result-object v10

    .line 70
    new-instance v2, LU1/V;

    .line 71
    .line 72
    iget-object v4, p0, LU1/u;->I:Lk2/g0;

    .line 73
    .line 74
    invoke-direct {v2, v3, v4}, LU1/V;-><init>(Ljava/util/ArrayList;Lk2/g0;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0, v8}, LU1/u;->p0(LU1/P;)I

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    invoke-virtual {p0, v8}, LU1/u;->i0(LU1/P;)J

    .line 82
    .line 83
    .line 84
    move-result-wide v4

    .line 85
    move-object v0, p0

    .line 86
    invoke-virtual/range {v0 .. v5}, LU1/u;->r0(LN1/N;LU1/V;IJ)Landroid/util/Pair;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-virtual {p0, v8, v2, v1}, LU1/u;->w0(LU1/P;LN1/N;Landroid/util/Pair;)LU1/P;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    iget-object v11, p0, LU1/u;->I:Lk2/g0;

    .line 95
    .line 96
    iget-object v2, p0, LU1/u;->k:LU1/z;

    .line 97
    .line 98
    iget-object v2, v2, LU1/z;->i:LQ1/s;

    .line 99
    .line 100
    new-instance v9, LU1/w;

    .line 101
    .line 102
    const/4 v12, -0x1

    .line 103
    const-wide v13, -0x7fffffffffffffffL    # -4.9E-324

    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    invoke-direct/range {v9 .. v14}, LU1/w;-><init>(Ljava/util/ArrayList;Lk2/g0;IJ)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    invoke-static {}, LQ1/s;->b()LQ1/r;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    iget-object v2, v2, LQ1/s;->a:Landroid/os/Handler;

    .line 119
    .line 120
    const/16 v4, 0x12

    .line 121
    .line 122
    invoke-virtual {v2, v4, v7, v6, v9}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    iput-object v2, v3, LQ1/r;->a:Landroid/os/Message;

    .line 127
    .line 128
    invoke-virtual {v3}, LQ1/r;->b()V

    .line 129
    .line 130
    .line 131
    const/4 v4, 0x5

    .line 132
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    const/4 v2, 0x0

    .line 138
    const/4 v3, 0x0

    .line 139
    const/4 v7, -0x1

    .line 140
    const/4 v8, 0x0

    .line 141
    move-object v0, p0

    .line 142
    invoke-virtual/range {v0 .. v8}, LU1/u;->Q0(LU1/P;IZIJIZ)V

    .line 143
    .line 144
    .line 145
    return-void
.end method

.method public final g0()LN1/z;
    .locals 5

    .line 1
    invoke-virtual {p0}, LU1/u;->o0()LN1/N;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LN1/N;->p()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, LU1/u;->c0:LN1/z;

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    invoke-virtual {p0}, LU1/u;->l0()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    iget-object v2, p0, LA7/B0;->a:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v2, LN1/M;

    .line 21
    .line 22
    const-wide/16 v3, 0x0

    .line 23
    .line 24
    invoke-virtual {v0, v1, v2, v3, v4}, LN1/N;->m(ILN1/M;J)LN1/M;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iget-object v0, v0, LN1/M;->c:LN1/w;

    .line 29
    .line 30
    iget-object v1, p0, LU1/u;->c0:LN1/z;

    .line 31
    .line 32
    invoke-virtual {v1}, LN1/z;->a()LN1/y;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    iget-object v0, v0, LN1/w;->d:LN1/z;

    .line 37
    .line 38
    if-nez v0, :cond_1

    .line 39
    .line 40
    goto/16 :goto_1

    .line 41
    .line 42
    :cond_1
    iget-object v2, v0, LN1/z;->a:Ljava/lang/CharSequence;

    .line 43
    .line 44
    if-eqz v2, :cond_2

    .line 45
    .line 46
    iput-object v2, v1, LN1/y;->a:Ljava/lang/CharSequence;

    .line 47
    .line 48
    :cond_2
    iget-object v2, v0, LN1/z;->b:Ljava/lang/CharSequence;

    .line 49
    .line 50
    if-eqz v2, :cond_3

    .line 51
    .line 52
    iput-object v2, v1, LN1/y;->b:Ljava/lang/CharSequence;

    .line 53
    .line 54
    :cond_3
    iget-object v2, v0, LN1/z;->c:Ljava/lang/CharSequence;

    .line 55
    .line 56
    if-eqz v2, :cond_4

    .line 57
    .line 58
    iput-object v2, v1, LN1/y;->c:Ljava/lang/CharSequence;

    .line 59
    .line 60
    :cond_4
    iget-object v2, v0, LN1/z;->d:Ljava/lang/CharSequence;

    .line 61
    .line 62
    if-eqz v2, :cond_5

    .line 63
    .line 64
    iput-object v2, v1, LN1/y;->d:Ljava/lang/CharSequence;

    .line 65
    .line 66
    :cond_5
    iget-object v2, v0, LN1/z;->e:Ljava/lang/CharSequence;

    .line 67
    .line 68
    if-eqz v2, :cond_6

    .line 69
    .line 70
    iput-object v2, v1, LN1/y;->e:Ljava/lang/CharSequence;

    .line 71
    .line 72
    :cond_6
    iget-object v2, v0, LN1/z;->f:[B

    .line 73
    .line 74
    if-eqz v2, :cond_8

    .line 75
    .line 76
    if-nez v2, :cond_7

    .line 77
    .line 78
    const/4 v2, 0x0

    .line 79
    goto :goto_0

    .line 80
    :cond_7
    invoke-virtual {v2}, [B->clone()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    check-cast v2, [B

    .line 85
    .line 86
    :goto_0
    iput-object v2, v1, LN1/y;->f:[B

    .line 87
    .line 88
    iget-object v2, v0, LN1/z;->g:Ljava/lang/Integer;

    .line 89
    .line 90
    iput-object v2, v1, LN1/y;->g:Ljava/lang/Integer;

    .line 91
    .line 92
    :cond_8
    iget-object v2, v0, LN1/z;->h:Ljava/lang/Integer;

    .line 93
    .line 94
    if-eqz v2, :cond_9

    .line 95
    .line 96
    iput-object v2, v1, LN1/y;->h:Ljava/lang/Integer;

    .line 97
    .line 98
    :cond_9
    iget-object v2, v0, LN1/z;->i:Ljava/lang/Integer;

    .line 99
    .line 100
    if-eqz v2, :cond_a

    .line 101
    .line 102
    iput-object v2, v1, LN1/y;->i:Ljava/lang/Integer;

    .line 103
    .line 104
    :cond_a
    iget-object v2, v0, LN1/z;->j:Ljava/lang/Integer;

    .line 105
    .line 106
    if-eqz v2, :cond_b

    .line 107
    .line 108
    iput-object v2, v1, LN1/y;->j:Ljava/lang/Integer;

    .line 109
    .line 110
    :cond_b
    iget-object v2, v0, LN1/z;->k:Ljava/lang/Boolean;

    .line 111
    .line 112
    if-eqz v2, :cond_c

    .line 113
    .line 114
    iput-object v2, v1, LN1/y;->k:Ljava/lang/Boolean;

    .line 115
    .line 116
    :cond_c
    iget-object v2, v0, LN1/z;->l:Ljava/lang/Integer;

    .line 117
    .line 118
    if-eqz v2, :cond_d

    .line 119
    .line 120
    iput-object v2, v1, LN1/y;->l:Ljava/lang/Integer;

    .line 121
    .line 122
    :cond_d
    iget-object v2, v0, LN1/z;->m:Ljava/lang/Integer;

    .line 123
    .line 124
    if-eqz v2, :cond_e

    .line 125
    .line 126
    iput-object v2, v1, LN1/y;->l:Ljava/lang/Integer;

    .line 127
    .line 128
    :cond_e
    iget-object v2, v0, LN1/z;->n:Ljava/lang/Integer;

    .line 129
    .line 130
    if-eqz v2, :cond_f

    .line 131
    .line 132
    iput-object v2, v1, LN1/y;->m:Ljava/lang/Integer;

    .line 133
    .line 134
    :cond_f
    iget-object v2, v0, LN1/z;->o:Ljava/lang/Integer;

    .line 135
    .line 136
    if-eqz v2, :cond_10

    .line 137
    .line 138
    iput-object v2, v1, LN1/y;->n:Ljava/lang/Integer;

    .line 139
    .line 140
    :cond_10
    iget-object v2, v0, LN1/z;->p:Ljava/lang/Integer;

    .line 141
    .line 142
    if-eqz v2, :cond_11

    .line 143
    .line 144
    iput-object v2, v1, LN1/y;->o:Ljava/lang/Integer;

    .line 145
    .line 146
    :cond_11
    iget-object v2, v0, LN1/z;->q:Ljava/lang/Integer;

    .line 147
    .line 148
    if-eqz v2, :cond_12

    .line 149
    .line 150
    iput-object v2, v1, LN1/y;->p:Ljava/lang/Integer;

    .line 151
    .line 152
    :cond_12
    iget-object v2, v0, LN1/z;->r:Ljava/lang/Integer;

    .line 153
    .line 154
    if-eqz v2, :cond_13

    .line 155
    .line 156
    iput-object v2, v1, LN1/y;->q:Ljava/lang/Integer;

    .line 157
    .line 158
    :cond_13
    iget-object v2, v0, LN1/z;->s:Ljava/lang/CharSequence;

    .line 159
    .line 160
    if-eqz v2, :cond_14

    .line 161
    .line 162
    iput-object v2, v1, LN1/y;->r:Ljava/lang/CharSequence;

    .line 163
    .line 164
    :cond_14
    iget-object v2, v0, LN1/z;->t:Ljava/lang/CharSequence;

    .line 165
    .line 166
    if-eqz v2, :cond_15

    .line 167
    .line 168
    iput-object v2, v1, LN1/y;->s:Ljava/lang/CharSequence;

    .line 169
    .line 170
    :cond_15
    iget-object v2, v0, LN1/z;->u:Ljava/lang/CharSequence;

    .line 171
    .line 172
    if-eqz v2, :cond_16

    .line 173
    .line 174
    iput-object v2, v1, LN1/y;->t:Ljava/lang/CharSequence;

    .line 175
    .line 176
    :cond_16
    iget-object v2, v0, LN1/z;->v:Ljava/lang/Integer;

    .line 177
    .line 178
    if-eqz v2, :cond_17

    .line 179
    .line 180
    iput-object v2, v1, LN1/y;->u:Ljava/lang/Integer;

    .line 181
    .line 182
    :cond_17
    iget-object v2, v0, LN1/z;->w:Ljava/lang/Integer;

    .line 183
    .line 184
    if-eqz v2, :cond_18

    .line 185
    .line 186
    iput-object v2, v1, LN1/y;->v:Ljava/lang/Integer;

    .line 187
    .line 188
    :cond_18
    iget-object v2, v0, LN1/z;->x:Ljava/lang/CharSequence;

    .line 189
    .line 190
    if-eqz v2, :cond_19

    .line 191
    .line 192
    iput-object v2, v1, LN1/y;->w:Ljava/lang/CharSequence;

    .line 193
    .line 194
    :cond_19
    iget-object v2, v0, LN1/z;->y:Ljava/lang/CharSequence;

    .line 195
    .line 196
    if-eqz v2, :cond_1a

    .line 197
    .line 198
    iput-object v2, v1, LN1/y;->x:Ljava/lang/CharSequence;

    .line 199
    .line 200
    :cond_1a
    iget-object v2, v0, LN1/z;->z:Ljava/lang/Integer;

    .line 201
    .line 202
    if-eqz v2, :cond_1b

    .line 203
    .line 204
    iput-object v2, v1, LN1/y;->y:Ljava/lang/Integer;

    .line 205
    .line 206
    :cond_1b
    iget-object v0, v0, LN1/z;->A:Ll8/K;

    .line 207
    .line 208
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 209
    .line 210
    .line 211
    move-result v2

    .line 212
    if-nez v2, :cond_1c

    .line 213
    .line 214
    invoke-static {v0}, Ll8/K;->j(Ljava/util/Collection;)Ll8/K;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    iput-object v0, v1, LN1/y;->z:Ll8/K;

    .line 219
    .line 220
    :cond_1c
    :goto_1
    new-instance v0, LN1/z;

    .line 221
    .line 222
    invoke-direct {v0, v1}, LN1/z;-><init>(LN1/y;)V

    .line 223
    .line 224
    .line 225
    return-object v0
.end method

.method public final h0()J
    .locals 5

    .line 1
    invoke-virtual {p0}, LU1/u;->S0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LU1/u;->v0()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    iget-object v0, p0, LU1/u;->d0:LU1/P;

    .line 11
    .line 12
    iget-object v1, v0, LU1/P;->k:Lk2/H;

    .line 13
    .line 14
    iget-object v0, v0, LU1/P;->b:Lk2/H;

    .line 15
    .line 16
    invoke-virtual {v1, v0}, Lk2/H;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    iget-object v0, p0, LU1/u;->d0:LU1/P;

    .line 23
    .line 24
    iget-wide v0, v0, LU1/P;->q:J

    .line 25
    .line 26
    invoke-static {v0, v1}, LQ1/x;->W(J)J

    .line 27
    .line 28
    .line 29
    move-result-wide v0

    .line 30
    return-wide v0

    .line 31
    :cond_0
    invoke-virtual {p0}, LU1/u;->q0()J

    .line 32
    .line 33
    .line 34
    move-result-wide v0

    .line 35
    return-wide v0

    .line 36
    :cond_1
    invoke-virtual {p0}, LU1/u;->S0()V

    .line 37
    .line 38
    .line 39
    iget-object v0, p0, LU1/u;->d0:LU1/P;

    .line 40
    .line 41
    iget-object v0, v0, LU1/P;->a:LN1/N;

    .line 42
    .line 43
    invoke-virtual {v0}, LN1/N;->p()Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_2

    .line 48
    .line 49
    iget-wide v0, p0, LU1/u;->f0:J

    .line 50
    .line 51
    return-wide v0

    .line 52
    :cond_2
    iget-object v0, p0, LU1/u;->d0:LU1/P;

    .line 53
    .line 54
    iget-object v1, v0, LU1/P;->k:Lk2/H;

    .line 55
    .line 56
    iget-wide v1, v1, Lk2/H;->d:J

    .line 57
    .line 58
    iget-object v3, v0, LU1/P;->b:Lk2/H;

    .line 59
    .line 60
    iget-wide v3, v3, Lk2/H;->d:J

    .line 61
    .line 62
    cmp-long v1, v1, v3

    .line 63
    .line 64
    const-wide/16 v2, 0x0

    .line 65
    .line 66
    if-eqz v1, :cond_3

    .line 67
    .line 68
    iget-object v0, v0, LU1/P;->a:LN1/N;

    .line 69
    .line 70
    invoke-virtual {p0}, LU1/u;->l0()I

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    iget-object v4, p0, LA7/B0;->a:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v4, LN1/M;

    .line 77
    .line 78
    invoke-virtual {v0, v1, v4, v2, v3}, LN1/N;->m(ILN1/M;J)LN1/M;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    iget-wide v0, v0, LN1/M;->m:J

    .line 83
    .line 84
    invoke-static {v0, v1}, LQ1/x;->W(J)J

    .line 85
    .line 86
    .line 87
    move-result-wide v0

    .line 88
    return-wide v0

    .line 89
    :cond_3
    iget-wide v0, v0, LU1/P;->q:J

    .line 90
    .line 91
    iget-object v4, p0, LU1/u;->d0:LU1/P;

    .line 92
    .line 93
    iget-object v4, v4, LU1/P;->k:Lk2/H;

    .line 94
    .line 95
    invoke-virtual {v4}, Lk2/H;->b()Z

    .line 96
    .line 97
    .line 98
    move-result v4

    .line 99
    if-eqz v4, :cond_4

    .line 100
    .line 101
    iget-object v0, p0, LU1/u;->d0:LU1/P;

    .line 102
    .line 103
    iget-object v1, v0, LU1/P;->a:LN1/N;

    .line 104
    .line 105
    iget-object v0, v0, LU1/P;->k:Lk2/H;

    .line 106
    .line 107
    iget-object v0, v0, Lk2/H;->a:Ljava/lang/Object;

    .line 108
    .line 109
    iget-object v4, p0, LU1/u;->n:LN1/L;

    .line 110
    .line 111
    invoke-virtual {v1, v0, v4}, LN1/N;->g(Ljava/lang/Object;LN1/L;)LN1/L;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    iget-object v1, p0, LU1/u;->d0:LU1/P;

    .line 116
    .line 117
    iget-object v1, v1, LU1/P;->k:Lk2/H;

    .line 118
    .line 119
    iget v1, v1, Lk2/H;->b:I

    .line 120
    .line 121
    invoke-virtual {v0, v1}, LN1/L;->d(I)J

    .line 122
    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_4
    move-wide v2, v0

    .line 126
    :goto_0
    iget-object v0, p0, LU1/u;->d0:LU1/P;

    .line 127
    .line 128
    iget-object v1, v0, LU1/P;->a:LN1/N;

    .line 129
    .line 130
    iget-object v0, v0, LU1/P;->k:Lk2/H;

    .line 131
    .line 132
    iget-object v0, v0, Lk2/H;->a:Ljava/lang/Object;

    .line 133
    .line 134
    iget-object v4, p0, LU1/u;->n:LN1/L;

    .line 135
    .line 136
    invoke-virtual {v1, v0, v4}, LN1/N;->g(Ljava/lang/Object;LN1/L;)LN1/L;

    .line 137
    .line 138
    .line 139
    iget-wide v0, v4, LN1/L;->e:J

    .line 140
    .line 141
    add-long/2addr v2, v0

    .line 142
    invoke-static {v2, v3}, LQ1/x;->W(J)J

    .line 143
    .line 144
    .line 145
    move-result-wide v0

    .line 146
    return-wide v0
.end method

.method public final i0(LU1/P;)J
    .locals 7

    .line 1
    iget-object v0, p1, LU1/P;->b:Lk2/H;

    .line 2
    .line 3
    invoke-virtual {v0}, Lk2/H;->b()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p1, LU1/P;->b:Lk2/H;

    .line 10
    .line 11
    iget-object v0, v0, Lk2/H;->a:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object v1, p1, LU1/P;->a:LN1/N;

    .line 14
    .line 15
    iget-object v2, p0, LU1/u;->n:LN1/L;

    .line 16
    .line 17
    invoke-virtual {v1, v0, v2}, LN1/N;->g(Ljava/lang/Object;LN1/L;)LN1/L;

    .line 18
    .line 19
    .line 20
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    iget-wide v5, p1, LU1/P;->c:J

    .line 26
    .line 27
    cmp-long v0, v5, v3

    .line 28
    .line 29
    if-nez v0, :cond_0

    .line 30
    .line 31
    invoke-virtual {p0, p1}, LU1/u;->p0(LU1/P;)I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    const-wide/16 v2, 0x0

    .line 36
    .line 37
    iget-object v0, p0, LA7/B0;->a:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v0, LN1/M;

    .line 40
    .line 41
    invoke-virtual {v1, p1, v0, v2, v3}, LN1/N;->m(ILN1/M;J)LN1/M;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    iget-wide v0, p1, LN1/M;->l:J

    .line 46
    .line 47
    invoke-static {v0, v1}, LQ1/x;->W(J)J

    .line 48
    .line 49
    .line 50
    move-result-wide v0

    .line 51
    return-wide v0

    .line 52
    :cond_0
    iget-wide v0, v2, LN1/L;->e:J

    .line 53
    .line 54
    invoke-static {v0, v1}, LQ1/x;->W(J)J

    .line 55
    .line 56
    .line 57
    move-result-wide v0

    .line 58
    invoke-static {v5, v6}, LQ1/x;->W(J)J

    .line 59
    .line 60
    .line 61
    move-result-wide v2

    .line 62
    add-long/2addr v2, v0

    .line 63
    return-wide v2

    .line 64
    :cond_1
    invoke-virtual {p0, p1}, LU1/u;->n0(LU1/P;)J

    .line 65
    .line 66
    .line 67
    move-result-wide v0

    .line 68
    invoke-static {v0, v1}, LQ1/x;->W(J)J

    .line 69
    .line 70
    .line 71
    move-result-wide v0

    .line 72
    return-wide v0
.end method

.method public final j0()I
    .locals 1

    .line 1
    invoke-virtual {p0}, LU1/u;->S0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LU1/u;->v0()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, LU1/u;->d0:LU1/P;

    .line 11
    .line 12
    iget-object v0, v0, LU1/P;->b:Lk2/H;

    .line 13
    .line 14
    iget v0, v0, Lk2/H;->b:I

    .line 15
    .line 16
    return v0

    .line 17
    :cond_0
    const/4 v0, -0x1

    .line 18
    return v0
.end method

.method public final k0()I
    .locals 1

    .line 1
    invoke-virtual {p0}, LU1/u;->S0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LU1/u;->v0()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, LU1/u;->d0:LU1/P;

    .line 11
    .line 12
    iget-object v0, v0, LU1/P;->b:Lk2/H;

    .line 13
    .line 14
    iget v0, v0, Lk2/H;->c:I

    .line 15
    .line 16
    return v0

    .line 17
    :cond_0
    const/4 v0, -0x1

    .line 18
    return v0
.end method

.method public final l0()I
    .locals 2

    .line 1
    invoke-virtual {p0}, LU1/u;->S0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LU1/u;->d0:LU1/P;

    .line 5
    .line 6
    invoke-virtual {p0, v0}, LU1/u;->p0(LU1/P;)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, -0x1

    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    :cond_0
    return v0
.end method

.method public final m0()J
    .locals 2

    .line 1
    invoke-virtual {p0}, LU1/u;->S0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LU1/u;->d0:LU1/P;

    .line 5
    .line 6
    invoke-virtual {p0, v0}, LU1/u;->n0(LU1/P;)J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    invoke-static {v0, v1}, LQ1/x;->W(J)J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    return-wide v0
.end method

.method public final n0(LU1/P;)J
    .locals 4

    .line 1
    iget-object v0, p1, LU1/P;->a:LN1/N;

    .line 2
    .line 3
    invoke-virtual {v0}, LN1/N;->p()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-wide v0, p0, LU1/u;->f0:J

    .line 10
    .line 11
    invoke-static {v0, v1}, LQ1/x;->K(J)J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    return-wide v0

    .line 16
    :cond_0
    iget-boolean v0, p1, LU1/P;->p:Z

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    invoke-virtual {p1}, LU1/P;->j()J

    .line 21
    .line 22
    .line 23
    move-result-wide v0

    .line 24
    goto :goto_0

    .line 25
    :cond_1
    iget-wide v0, p1, LU1/P;->s:J

    .line 26
    .line 27
    :goto_0
    iget-object v2, p1, LU1/P;->b:Lk2/H;

    .line 28
    .line 29
    invoke-virtual {v2}, Lk2/H;->b()Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    return-wide v0

    .line 36
    :cond_2
    iget-object v2, p1, LU1/P;->a:LN1/N;

    .line 37
    .line 38
    iget-object p1, p1, LU1/P;->b:Lk2/H;

    .line 39
    .line 40
    iget-object p1, p1, Lk2/H;->a:Ljava/lang/Object;

    .line 41
    .line 42
    iget-object v3, p0, LU1/u;->n:LN1/L;

    .line 43
    .line 44
    invoke-virtual {v2, p1, v3}, LN1/N;->g(Ljava/lang/Object;LN1/L;)LN1/L;

    .line 45
    .line 46
    .line 47
    iget-wide v2, v3, LN1/L;->e:J

    .line 48
    .line 49
    add-long/2addr v0, v2

    .line 50
    return-wide v0
.end method

.method public final o0()LN1/N;
    .locals 1

    .line 1
    invoke-virtual {p0}, LU1/u;->S0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LU1/u;->d0:LU1/P;

    .line 5
    .line 6
    iget-object v0, v0, LU1/P;->a:LN1/N;

    .line 7
    .line 8
    return-object v0
.end method

.method public final p0(LU1/P;)I
    .locals 2

    .line 1
    iget-object v0, p1, LU1/P;->a:LN1/N;

    .line 2
    .line 3
    invoke-virtual {v0}, LN1/N;->p()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget p1, p0, LU1/u;->e0:I

    .line 10
    .line 11
    return p1

    .line 12
    :cond_0
    iget-object v0, p1, LU1/P;->b:Lk2/H;

    .line 13
    .line 14
    iget-object v0, v0, Lk2/H;->a:Ljava/lang/Object;

    .line 15
    .line 16
    iget-object v1, p0, LU1/u;->n:LN1/L;

    .line 17
    .line 18
    iget-object p1, p1, LU1/P;->a:LN1/N;

    .line 19
    .line 20
    invoke-virtual {p1, v0, v1}, LN1/N;->g(Ljava/lang/Object;LN1/L;)LN1/L;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iget p1, p1, LN1/L;->c:I

    .line 25
    .line 26
    return p1
.end method

.method public final q0()J
    .locals 5

    .line 1
    invoke-virtual {p0}, LU1/u;->S0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LU1/u;->v0()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, LU1/u;->d0:LU1/P;

    .line 11
    .line 12
    iget-object v1, v0, LU1/P;->b:Lk2/H;

    .line 13
    .line 14
    iget-object v0, v0, LU1/P;->a:LN1/N;

    .line 15
    .line 16
    iget-object v2, v1, Lk2/H;->a:Ljava/lang/Object;

    .line 17
    .line 18
    iget-object v3, p0, LU1/u;->n:LN1/L;

    .line 19
    .line 20
    invoke-virtual {v0, v2, v3}, LN1/N;->g(Ljava/lang/Object;LN1/L;)LN1/L;

    .line 21
    .line 22
    .line 23
    iget v0, v1, Lk2/H;->b:I

    .line 24
    .line 25
    iget v1, v1, Lk2/H;->c:I

    .line 26
    .line 27
    invoke-virtual {v3, v0, v1}, LN1/L;->a(II)J

    .line 28
    .line 29
    .line 30
    move-result-wide v0

    .line 31
    invoke-static {v0, v1}, LQ1/x;->W(J)J

    .line 32
    .line 33
    .line 34
    move-result-wide v0

    .line 35
    return-wide v0

    .line 36
    :cond_0
    invoke-virtual {p0}, LU1/u;->o0()LN1/N;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v0}, LN1/N;->p()Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-eqz v1, :cond_1

    .line 45
    .line 46
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    return-wide v0

    .line 52
    :cond_1
    invoke-virtual {p0}, LU1/u;->l0()I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    const-wide/16 v2, 0x0

    .line 57
    .line 58
    iget-object v4, p0, LA7/B0;->a:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v4, LN1/M;

    .line 61
    .line 62
    invoke-virtual {v0, v1, v4, v2, v3}, LN1/N;->m(ILN1/M;J)LN1/M;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    iget-wide v0, v0, LN1/M;->m:J

    .line 67
    .line 68
    invoke-static {v0, v1}, LQ1/x;->W(J)J

    .line 69
    .line 70
    .line 71
    move-result-wide v0

    .line 72
    return-wide v0
.end method

.method public final r0(LN1/N;LU1/V;IJ)Landroid/util/Pair;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v7, p2

    .line 4
    .line 5
    invoke-virtual/range {p1 .. p1}, LN1/N;->p()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    const/4 v10, -0x1

    .line 15
    if-nez v1, :cond_3

    .line 16
    .line 17
    invoke-virtual {v7}, LN1/N;->p()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-static/range {p4 .. p5}, LQ1/x;->K(J)J

    .line 25
    .line 26
    .line 27
    move-result-wide v15

    .line 28
    iget-object v1, v0, LA7/B0;->a:Ljava/lang/Object;

    .line 29
    .line 30
    move-object v12, v1

    .line 31
    check-cast v12, LN1/M;

    .line 32
    .line 33
    iget-object v13, v0, LU1/u;->n:LN1/L;

    .line 34
    .line 35
    move-object/from16 v11, p1

    .line 36
    .line 37
    move/from16 v14, p3

    .line 38
    .line 39
    invoke-virtual/range {v11 .. v16}, LN1/N;->i(LN1/M;LN1/L;IJ)Landroid/util/Pair;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    iget-object v5, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 44
    .line 45
    invoke-virtual {v7, v5}, LU1/a;->b(Ljava/lang/Object;)I

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-eq v2, v10, :cond_1

    .line 50
    .line 51
    return-object v1

    .line 52
    :cond_1
    iget v3, v0, LU1/u;->C:I

    .line 53
    .line 54
    iget-boolean v4, v0, LU1/u;->D:Z

    .line 55
    .line 56
    iget-object v1, v0, LA7/B0;->a:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v1, LN1/M;

    .line 59
    .line 60
    iget-object v2, v0, LU1/u;->n:LN1/L;

    .line 61
    .line 62
    move-object/from16 v6, p1

    .line 63
    .line 64
    invoke-static/range {v1 .. v7}, LU1/z;->L(LN1/M;LN1/L;IZLjava/lang/Object;LN1/N;LN1/N;)I

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    if-eq v1, v10, :cond_2

    .line 69
    .line 70
    iget-object v2, v0, LA7/B0;->a:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v2, LN1/M;

    .line 73
    .line 74
    const-wide/16 v3, 0x0

    .line 75
    .line 76
    invoke-virtual {v7, v1, v2, v3, v4}, LU1/a;->m(ILN1/M;J)LN1/M;

    .line 77
    .line 78
    .line 79
    iget-wide v2, v2, LN1/M;->l:J

    .line 80
    .line 81
    invoke-static {v2, v3}, LQ1/x;->W(J)J

    .line 82
    .line 83
    .line 84
    move-result-wide v2

    .line 85
    invoke-virtual {v0, v7, v1, v2, v3}, LU1/u;->x0(LN1/N;IJ)Landroid/util/Pair;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    return-object v1

    .line 90
    :cond_2
    invoke-virtual {v0, v7, v10, v8, v9}, LU1/u;->x0(LN1/N;IJ)Landroid/util/Pair;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    return-object v1

    .line 95
    :cond_3
    :goto_0
    invoke-virtual/range {p1 .. p1}, LN1/N;->p()Z

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    if-nez v1, :cond_4

    .line 100
    .line 101
    invoke-virtual {v7}, LN1/N;->p()Z

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    if-eqz v1, :cond_4

    .line 106
    .line 107
    const/4 v1, 0x1

    .line 108
    goto :goto_1

    .line 109
    :cond_4
    const/4 v1, 0x0

    .line 110
    :goto_1
    if-eqz v1, :cond_5

    .line 111
    .line 112
    goto :goto_2

    .line 113
    :cond_5
    move/from16 v10, p3

    .line 114
    .line 115
    :goto_2
    if-eqz v1, :cond_6

    .line 116
    .line 117
    goto :goto_3

    .line 118
    :cond_6
    move-wide/from16 v8, p4

    .line 119
    .line 120
    :goto_3
    invoke-virtual {v0, v7, v10, v8, v9}, LU1/u;->x0(LN1/N;IJ)Landroid/util/Pair;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    return-object v1
.end method

.method public final s0()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, LU1/u;->S0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LU1/u;->d0:LU1/P;

    .line 5
    .line 6
    iget-boolean v0, v0, LU1/P;->l:Z

    .line 7
    .line 8
    return v0
.end method

.method public final t0()I
    .locals 1

    .line 1
    invoke-virtual {p0}, LU1/u;->S0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LU1/u;->d0:LU1/P;

    .line 5
    .line 6
    iget v0, v0, LU1/P;->e:I

    .line 7
    .line 8
    return v0
.end method

.method public final v0()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, LU1/u;->S0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LU1/u;->d0:LU1/P;

    .line 5
    .line 6
    iget-object v0, v0, LU1/P;->b:Lk2/H;

    .line 7
    .line 8
    invoke-virtual {v0}, Lk2/H;->b()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    return v0
.end method

.method public final w0(LU1/P;LN1/N;Landroid/util/Pair;)LU1/P;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    invoke-virtual {v1}, LN1/N;->p()Z

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    const/4 v4, 0x0

    .line 12
    const/4 v5, 0x1

    .line 13
    if-nez v3, :cond_1

    .line 14
    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move v3, v4

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    :goto_0
    move v3, v5

    .line 21
    :goto_1
    invoke-static {v3}, LQ1/k;->c(Z)V

    .line 22
    .line 23
    .line 24
    move-object/from16 v3, p1

    .line 25
    .line 26
    iget-object v6, v3, LU1/P;->a:LN1/N;

    .line 27
    .line 28
    invoke-virtual/range {p0 .. p1}, LU1/u;->i0(LU1/P;)J

    .line 29
    .line 30
    .line 31
    move-result-wide v7

    .line 32
    invoke-virtual/range {p1 .. p2}, LU1/P;->h(LN1/N;)LU1/P;

    .line 33
    .line 34
    .line 35
    move-result-object v9

    .line 36
    invoke-virtual {v1}, LN1/N;->p()Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-eqz v3, :cond_2

    .line 41
    .line 42
    sget-object v10, LU1/P;->u:Lk2/H;

    .line 43
    .line 44
    iget-wide v1, v0, LU1/u;->f0:J

    .line 45
    .line 46
    invoke-static {v1, v2}, LQ1/x;->K(J)J

    .line 47
    .line 48
    .line 49
    move-result-wide v11

    .line 50
    sget-object v19, Lk2/n0;->d:Lk2/n0;

    .line 51
    .line 52
    iget-object v1, v0, LU1/u;->b:Ln2/t;

    .line 53
    .line 54
    sget-object v21, Ll8/e0;->e:Ll8/e0;

    .line 55
    .line 56
    const-wide/16 v17, 0x0

    .line 57
    .line 58
    move-wide v13, v11

    .line 59
    move-wide v15, v11

    .line 60
    move-object/from16 v20, v1

    .line 61
    .line 62
    invoke-virtual/range {v9 .. v21}, LU1/P;->c(Lk2/H;JJJJLk2/n0;Ln2/t;Ljava/util/List;)LU1/P;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-virtual {v1, v10}, LU1/P;->b(Lk2/H;)LU1/P;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    iget-wide v2, v1, LU1/P;->s:J

    .line 71
    .line 72
    iput-wide v2, v1, LU1/P;->q:J

    .line 73
    .line 74
    return-object v1

    .line 75
    :cond_2
    iget-object v3, v9, LU1/P;->b:Lk2/H;

    .line 76
    .line 77
    iget-object v3, v3, Lk2/H;->a:Ljava/lang/Object;

    .line 78
    .line 79
    iget-object v10, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 80
    .line 81
    invoke-virtual {v3, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v10

    .line 85
    if-nez v10, :cond_3

    .line 86
    .line 87
    new-instance v11, Lk2/H;

    .line 88
    .line 89
    iget-object v12, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 90
    .line 91
    invoke-direct {v11, v12}, Lk2/H;-><init>(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_3
    iget-object v11, v9, LU1/P;->b:Lk2/H;

    .line 96
    .line 97
    :goto_2
    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v2, Ljava/lang/Long;

    .line 100
    .line 101
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 102
    .line 103
    .line 104
    move-result-wide v12

    .line 105
    invoke-static {v7, v8}, LQ1/x;->K(J)J

    .line 106
    .line 107
    .line 108
    move-result-wide v7

    .line 109
    invoke-virtual {v6}, LN1/N;->p()Z

    .line 110
    .line 111
    .line 112
    move-result v2

    .line 113
    if-nez v2, :cond_4

    .line 114
    .line 115
    iget-object v2, v0, LU1/u;->n:LN1/L;

    .line 116
    .line 117
    invoke-virtual {v6, v3, v2}, LN1/N;->g(Ljava/lang/Object;LN1/L;)LN1/L;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    iget-wide v2, v2, LN1/L;->e:J

    .line 122
    .line 123
    sub-long/2addr v7, v2

    .line 124
    :cond_4
    if-eqz v10, :cond_5

    .line 125
    .line 126
    cmp-long v2, v12, v7

    .line 127
    .line 128
    if-gez v2, :cond_6

    .line 129
    .line 130
    :cond_5
    move v1, v10

    .line 131
    move-object v10, v11

    .line 132
    move-wide v11, v12

    .line 133
    goto/16 :goto_6

    .line 134
    .line 135
    :cond_6
    if-nez v2, :cond_a

    .line 136
    .line 137
    iget-object v2, v9, LU1/P;->k:Lk2/H;

    .line 138
    .line 139
    iget-object v2, v2, Lk2/H;->a:Ljava/lang/Object;

    .line 140
    .line 141
    invoke-virtual {v1, v2}, LN1/N;->b(Ljava/lang/Object;)I

    .line 142
    .line 143
    .line 144
    move-result v2

    .line 145
    const/4 v3, -0x1

    .line 146
    if-eq v2, v3, :cond_8

    .line 147
    .line 148
    iget-object v3, v0, LU1/u;->n:LN1/L;

    .line 149
    .line 150
    invoke-virtual {v1, v2, v3, v4}, LN1/N;->f(ILN1/L;Z)LN1/L;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    iget v2, v2, LN1/L;->c:I

    .line 155
    .line 156
    iget-object v3, v11, Lk2/H;->a:Ljava/lang/Object;

    .line 157
    .line 158
    iget-object v4, v0, LU1/u;->n:LN1/L;

    .line 159
    .line 160
    invoke-virtual {v1, v3, v4}, LN1/N;->g(Ljava/lang/Object;LN1/L;)LN1/L;

    .line 161
    .line 162
    .line 163
    move-result-object v3

    .line 164
    iget v3, v3, LN1/L;->c:I

    .line 165
    .line 166
    if-eq v2, v3, :cond_7

    .line 167
    .line 168
    goto :goto_3

    .line 169
    :cond_7
    return-object v9

    .line 170
    :cond_8
    :goto_3
    iget-object v2, v11, Lk2/H;->a:Ljava/lang/Object;

    .line 171
    .line 172
    iget-object v3, v0, LU1/u;->n:LN1/L;

    .line 173
    .line 174
    invoke-virtual {v1, v2, v3}, LN1/N;->g(Ljava/lang/Object;LN1/L;)LN1/L;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v11}, Lk2/H;->b()Z

    .line 178
    .line 179
    .line 180
    move-result v1

    .line 181
    if-eqz v1, :cond_9

    .line 182
    .line 183
    iget-object v1, v0, LU1/u;->n:LN1/L;

    .line 184
    .line 185
    iget v2, v11, Lk2/H;->b:I

    .line 186
    .line 187
    iget v3, v11, Lk2/H;->c:I

    .line 188
    .line 189
    invoke-virtual {v1, v2, v3}, LN1/L;->a(II)J

    .line 190
    .line 191
    .line 192
    move-result-wide v1

    .line 193
    :goto_4
    move-object v10, v11

    .line 194
    goto :goto_5

    .line 195
    :cond_9
    iget-object v1, v0, LU1/u;->n:LN1/L;

    .line 196
    .line 197
    iget-wide v1, v1, LN1/L;->d:J

    .line 198
    .line 199
    goto :goto_4

    .line 200
    :goto_5
    iget-wide v11, v9, LU1/P;->s:J

    .line 201
    .line 202
    iget-wide v13, v9, LU1/P;->s:J

    .line 203
    .line 204
    iget-wide v3, v9, LU1/P;->d:J

    .line 205
    .line 206
    iget-wide v5, v9, LU1/P;->s:J

    .line 207
    .line 208
    sub-long v17, v1, v5

    .line 209
    .line 210
    iget-object v5, v9, LU1/P;->h:Lk2/n0;

    .line 211
    .line 212
    iget-object v6, v9, LU1/P;->i:Ln2/t;

    .line 213
    .line 214
    iget-object v7, v9, LU1/P;->j:Ljava/util/List;

    .line 215
    .line 216
    move-wide v15, v3

    .line 217
    move-object/from16 v19, v5

    .line 218
    .line 219
    move-object/from16 v20, v6

    .line 220
    .line 221
    move-object/from16 v21, v7

    .line 222
    .line 223
    invoke-virtual/range {v9 .. v21}, LU1/P;->c(Lk2/H;JJJJLk2/n0;Ln2/t;Ljava/util/List;)LU1/P;

    .line 224
    .line 225
    .line 226
    move-result-object v3

    .line 227
    invoke-virtual {v3, v10}, LU1/P;->b(Lk2/H;)LU1/P;

    .line 228
    .line 229
    .line 230
    move-result-object v3

    .line 231
    iput-wide v1, v3, LU1/P;->q:J

    .line 232
    .line 233
    return-object v3

    .line 234
    :cond_a
    move-object v10, v11

    .line 235
    invoke-virtual {v10}, Lk2/H;->b()Z

    .line 236
    .line 237
    .line 238
    move-result v1

    .line 239
    xor-int/2addr v1, v5

    .line 240
    invoke-static {v1}, LQ1/k;->g(Z)V

    .line 241
    .line 242
    .line 243
    iget-wide v1, v9, LU1/P;->r:J

    .line 244
    .line 245
    sub-long v3, v12, v7

    .line 246
    .line 247
    sub-long/2addr v1, v3

    .line 248
    const-wide/16 v3, 0x0

    .line 249
    .line 250
    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->max(JJ)J

    .line 251
    .line 252
    .line 253
    move-result-wide v17

    .line 254
    iget-wide v1, v9, LU1/P;->q:J

    .line 255
    .line 256
    iget-object v3, v9, LU1/P;->k:Lk2/H;

    .line 257
    .line 258
    iget-object v4, v9, LU1/P;->b:Lk2/H;

    .line 259
    .line 260
    invoke-virtual {v3, v4}, Lk2/H;->equals(Ljava/lang/Object;)Z

    .line 261
    .line 262
    .line 263
    move-result v3

    .line 264
    if-eqz v3, :cond_b

    .line 265
    .line 266
    add-long v1, v12, v17

    .line 267
    .line 268
    :cond_b
    iget-object v3, v9, LU1/P;->h:Lk2/n0;

    .line 269
    .line 270
    iget-object v4, v9, LU1/P;->i:Ln2/t;

    .line 271
    .line 272
    iget-object v5, v9, LU1/P;->j:Ljava/util/List;

    .line 273
    .line 274
    move-wide v11, v12

    .line 275
    move-wide v13, v11

    .line 276
    move-wide v15, v11

    .line 277
    move-object/from16 v19, v3

    .line 278
    .line 279
    move-object/from16 v20, v4

    .line 280
    .line 281
    move-object/from16 v21, v5

    .line 282
    .line 283
    invoke-virtual/range {v9 .. v21}, LU1/P;->c(Lk2/H;JJJJLk2/n0;Ln2/t;Ljava/util/List;)LU1/P;

    .line 284
    .line 285
    .line 286
    move-result-object v3

    .line 287
    iput-wide v1, v3, LU1/P;->q:J

    .line 288
    .line 289
    return-object v3

    .line 290
    :goto_6
    invoke-virtual {v10}, Lk2/H;->b()Z

    .line 291
    .line 292
    .line 293
    move-result v2

    .line 294
    xor-int/2addr v2, v5

    .line 295
    invoke-static {v2}, LQ1/k;->g(Z)V

    .line 296
    .line 297
    .line 298
    if-nez v1, :cond_c

    .line 299
    .line 300
    sget-object v2, Lk2/n0;->d:Lk2/n0;

    .line 301
    .line 302
    :goto_7
    move-object/from16 v19, v2

    .line 303
    .line 304
    goto :goto_8

    .line 305
    :cond_c
    iget-object v2, v9, LU1/P;->h:Lk2/n0;

    .line 306
    .line 307
    goto :goto_7

    .line 308
    :goto_8
    if-nez v1, :cond_d

    .line 309
    .line 310
    iget-object v2, v0, LU1/u;->b:Ln2/t;

    .line 311
    .line 312
    :goto_9
    move-object/from16 v20, v2

    .line 313
    .line 314
    goto :goto_a

    .line 315
    :cond_d
    iget-object v2, v9, LU1/P;->i:Ln2/t;

    .line 316
    .line 317
    goto :goto_9

    .line 318
    :goto_a
    if-nez v1, :cond_e

    .line 319
    .line 320
    sget-object v1, Ll8/K;->b:Ll8/I;

    .line 321
    .line 322
    sget-object v1, Ll8/e0;->e:Ll8/e0;

    .line 323
    .line 324
    :goto_b
    move-object/from16 v21, v1

    .line 325
    .line 326
    goto :goto_c

    .line 327
    :cond_e
    iget-object v1, v9, LU1/P;->j:Ljava/util/List;

    .line 328
    .line 329
    goto :goto_b

    .line 330
    :goto_c
    const-wide/16 v17, 0x0

    .line 331
    .line 332
    move-wide v13, v11

    .line 333
    move-wide v15, v11

    .line 334
    invoke-virtual/range {v9 .. v21}, LU1/P;->c(Lk2/H;JJJJLk2/n0;Ln2/t;Ljava/util/List;)LU1/P;

    .line 335
    .line 336
    .line 337
    move-result-object v1

    .line 338
    invoke-virtual {v1, v10}, LU1/P;->b(Lk2/H;)LU1/P;

    .line 339
    .line 340
    .line 341
    move-result-object v1

    .line 342
    iput-wide v11, v1, LU1/P;->q:J

    .line 343
    .line 344
    return-object v1
.end method

.method public final x0(LN1/N;IJ)Landroid/util/Pair;
    .locals 6

    .line 1
    invoke-virtual {p1}, LN1/N;->p()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-wide/16 v1, 0x0

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iput p2, p0, LU1/u;->e0:I

    .line 10
    .line 11
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    cmp-long p1, p3, p1

    .line 17
    .line 18
    if-nez p1, :cond_0

    .line 19
    .line 20
    move-wide p3, v1

    .line 21
    :cond_0
    iput-wide p3, p0, LU1/u;->f0:J

    .line 22
    .line 23
    const/4 p1, 0x0

    .line 24
    return-object p1

    .line 25
    :cond_1
    const/4 v0, -0x1

    .line 26
    if-eq p2, v0, :cond_3

    .line 27
    .line 28
    invoke-virtual {p1}, LN1/N;->o()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-lt p2, v0, :cond_2

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_2
    :goto_0
    move v3, p2

    .line 36
    goto :goto_2

    .line 37
    :cond_3
    :goto_1
    iget-boolean p2, p0, LU1/u;->D:Z

    .line 38
    .line 39
    invoke-virtual {p1, p2}, LN1/N;->a(Z)I

    .line 40
    .line 41
    .line 42
    move-result p2

    .line 43
    iget-object p3, p0, LA7/B0;->a:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p3, LN1/M;

    .line 46
    .line 47
    invoke-virtual {p1, p2, p3, v1, v2}, LN1/N;->m(ILN1/M;J)LN1/M;

    .line 48
    .line 49
    .line 50
    move-result-object p3

    .line 51
    iget-wide p3, p3, LN1/M;->l:J

    .line 52
    .line 53
    invoke-static {p3, p4}, LQ1/x;->W(J)J

    .line 54
    .line 55
    .line 56
    move-result-wide p3

    .line 57
    goto :goto_0

    .line 58
    :goto_2
    invoke-static {p3, p4}, LQ1/x;->K(J)J

    .line 59
    .line 60
    .line 61
    move-result-wide v4

    .line 62
    iget-object p2, p0, LA7/B0;->a:Ljava/lang/Object;

    .line 63
    .line 64
    move-object v1, p2

    .line 65
    check-cast v1, LN1/M;

    .line 66
    .line 67
    iget-object v2, p0, LU1/u;->n:LN1/L;

    .line 68
    .line 69
    move-object v0, p1

    .line 70
    invoke-virtual/range {v0 .. v5}, LN1/N;->i(LN1/M;LN1/L;IJ)Landroid/util/Pair;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    return-object p1
.end method

.method public final y0(II)V
    .locals 3

    .line 1
    iget-object v0, p0, LU1/u;->S:LQ1/p;

    .line 2
    .line 3
    iget v1, v0, LQ1/p;->a:I

    .line 4
    .line 5
    if-ne p1, v1, :cond_1

    .line 6
    .line 7
    iget v0, v0, LQ1/p;->b:I

    .line 8
    .line 9
    if-eq p2, v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    return-void

    .line 13
    :cond_1
    :goto_0
    new-instance v0, LQ1/p;

    .line 14
    .line 15
    invoke-direct {v0, p1, p2}, LQ1/p;-><init>(II)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, LU1/u;->S:LQ1/p;

    .line 19
    .line 20
    new-instance v0, LE5/x;

    .line 21
    .line 22
    const/4 v1, 0x1

    .line 23
    invoke-direct {v0, p1, p2, v1}, LE5/x;-><init>(III)V

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, LU1/u;->l:LQ1/j;

    .line 27
    .line 28
    const/16 v2, 0x18

    .line 29
    .line 30
    invoke-virtual {v1, v2, v0}, LQ1/j;->e(ILQ1/g;)V

    .line 31
    .line 32
    .line 33
    new-instance v0, LQ1/p;

    .line 34
    .line 35
    invoke-direct {v0, p1, p2}, LQ1/p;-><init>(II)V

    .line 36
    .line 37
    .line 38
    const/4 p1, 0x2

    .line 39
    const/16 p2, 0xe

    .line 40
    .line 41
    invoke-virtual {p0, p1, p2, v0}, LU1/u;->D0(IILjava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public final z0()V
    .locals 14

    .line 1
    invoke-virtual {p0}, LU1/u;->S0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LU1/u;->s0()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    iget-object v1, p0, LU1/u;->y:LU1/c;

    .line 9
    .line 10
    const/4 v2, 0x2

    .line 11
    invoke-virtual {v1, v2, v0}, LU1/c;->d(IZ)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v3, -0x1

    .line 16
    const/4 v4, 0x1

    .line 17
    if-ne v1, v3, :cond_0

    .line 18
    .line 19
    move v3, v2

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move v3, v4

    .line 22
    :goto_0
    invoke-virtual {p0, v1, v3, v0}, LU1/u;->P0(IIZ)V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, LU1/u;->d0:LU1/P;

    .line 26
    .line 27
    iget v1, v0, LU1/P;->e:I

    .line 28
    .line 29
    if-eq v1, v4, :cond_1

    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    const/4 v1, 0x0

    .line 33
    invoke-virtual {v0, v1}, LU1/P;->e(LU1/j;)LU1/P;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    iget-object v1, v0, LU1/P;->a:LN1/N;

    .line 38
    .line 39
    invoke-virtual {v1}, LN1/N;->p()Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_2

    .line 44
    .line 45
    const/4 v2, 0x4

    .line 46
    :cond_2
    invoke-virtual {v0, v2}, LU1/P;->g(I)LU1/P;

    .line 47
    .line 48
    .line 49
    move-result-object v6

    .line 50
    iget v0, p0, LU1/u;->E:I

    .line 51
    .line 52
    add-int/2addr v0, v4

    .line 53
    iput v0, p0, LU1/u;->E:I

    .line 54
    .line 55
    iget-object v0, p0, LU1/u;->k:LU1/z;

    .line 56
    .line 57
    iget-object v0, v0, LU1/z;->i:LQ1/s;

    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    invoke-static {}, LQ1/s;->b()LQ1/r;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    iget-object v0, v0, LQ1/s;->a:Landroid/os/Handler;

    .line 67
    .line 68
    const/16 v2, 0x1d

    .line 69
    .line 70
    invoke-virtual {v0, v2}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    iput-object v0, v1, LQ1/r;->a:Landroid/os/Message;

    .line 75
    .line 76
    invoke-virtual {v1}, LQ1/r;->b()V

    .line 77
    .line 78
    .line 79
    const/4 v9, 0x5

    .line 80
    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    const/4 v7, 0x1

    .line 86
    const/4 v8, 0x0

    .line 87
    const/4 v12, -0x1

    .line 88
    const/4 v13, 0x0

    .line 89
    move-object v5, p0

    .line 90
    invoke-virtual/range {v5 .. v13}, LU1/u;->Q0(LU1/P;IZIJIZ)V

    .line 91
    .line 92
    .line 93
    return-void
.end method
