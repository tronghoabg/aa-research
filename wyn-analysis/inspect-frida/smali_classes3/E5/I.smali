.class public final LE5/I;
.super LA7/B0;
.source "SourceFile"


# instance fields
.field public final A:LE5/e;

.field public final B:LE5/E0;

.field public final C:Lx9/d;

.field public final D:Lya/b;

.field public final E:J

.field public F:I

.field public G:Z

.field public H:I

.field public I:I

.field public J:Z

.field public K:I

.field public final L:LE5/C0;

.field public M:Lf6/X;

.field public final N:Z

.field public O:LE5/s0;

.field public P:LE5/f0;

.field public Q:Landroid/media/AudioTrack;

.field public R:Ljava/lang/Object;

.field public S:Landroid/view/Surface;

.field public T:Landroid/view/SurfaceHolder;

.field public U:Lw6/k;

.field public V:Z

.field public W:Landroid/view/TextureView;

.field public final X:I

.field public Y:Lu6/p;

.field public final Z:I

.field public final a0:LG5/h;

.field public final b:Lr6/s;

.field public b0:F

.field public final c:LE5/s0;

.field public c0:Z

.field public final d:Ls8/b;

.field public d0:Lh6/c;

.field public final e:Landroid/content/Context;

.field public final e0:Z

.field public final f:LE5/I;

.field public f0:Z

.field public final g:[LE5/f;

.field public final g0:LE5/n;

.field public final h:Lr6/o;

.field public h0:Lv6/o;

.field public final i:Lu6/s;

.field public i0:LE5/f0;

.field public final j:LE5/u;

.field public j0:LE5/q0;

.field public final k:LE5/O;

.field public k0:I

.field public final l:LK8/H;

.field public l0:J

.field public final m:Ljava/util/concurrent/CopyOnWriteArraySet;

.field public final n:LE5/H0;

.field public final o:Ljava/util/ArrayList;

.field public final p:Z

.field public final q:Lf6/y;

.field public final r:LF5/f;

.field public final s:Landroid/os/Looper;

.field public final t:Lt6/e;

.field public final u:J

.field public final v:J

.field public final w:Lu6/q;

.field public final x:LE5/F;

.field public final y:LE5/G;

.field public final z:LE5/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "goog.exo.exoplayer"

    .line 2
    .line 3
    invoke-static {v0}, LE5/P;->a(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public constructor <init>(LE5/r;)V
    .locals 38

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    const/16 v3, 0x1f

    .line 6
    .line 7
    const/4 v6, 0x7

    .line 8
    const/16 v7, 0x15

    .line 9
    .line 10
    const/4 v9, 0x0

    .line 11
    const-string v10, " [ExoPlayerLib/2.18.2] ["

    .line 12
    .line 13
    const-string v11, "Init "

    .line 14
    .line 15
    const/4 v12, 0x1

    .line 16
    invoke-direct {v1, v12}, LA7/B0;-><init>(I)V

    .line 17
    .line 18
    .line 19
    new-instance v13, Ls8/b;

    .line 20
    .line 21
    invoke-direct {v13, v6}, Ls8/b;-><init>(I)V

    .line 22
    .line 23
    .line 24
    iput-object v13, v1, LE5/I;->d:Ls8/b;

    .line 25
    .line 26
    :try_start_0
    const-string v13, "ExoPlayerImpl"

    .line 27
    .line 28
    new-instance v14, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    invoke-direct {v14, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-static {v1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 34
    .line 35
    .line 36
    move-result v11

    .line 37
    invoke-static {v11}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v11

    .line 41
    invoke-virtual {v14, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v14, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    sget-object v10, Lu6/v;->e:Ljava/lang/String;

    .line 48
    .line 49
    invoke-virtual {v14, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string v10, "]"

    .line 53
    .line 54
    invoke-virtual {v14, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v10

    .line 61
    invoke-static {v13, v10}, Lu6/a;->u(Ljava/lang/String;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    iget-object v10, v0, LE5/r;->a:Landroid/content/Context;

    .line 65
    .line 66
    invoke-virtual {v10}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 67
    .line 68
    .line 69
    move-result-object v10

    .line 70
    iput-object v10, v1, LE5/I;->e:Landroid/content/Context;

    .line 71
    .line 72
    iget-object v10, v0, LE5/r;->b:Lu6/q;

    .line 73
    .line 74
    new-instance v11, LF5/f;

    .line 75
    .line 76
    invoke-direct {v11, v10}, LF5/f;-><init>(Lu6/q;)V

    .line 77
    .line 78
    .line 79
    iput-object v11, v1, LE5/I;->r:LF5/f;

    .line 80
    .line 81
    iget-object v10, v0, LE5/r;->h:LG5/h;

    .line 82
    .line 83
    iput-object v10, v1, LE5/I;->a0:LG5/h;

    .line 84
    .line 85
    iget v10, v0, LE5/r;->i:I

    .line 86
    .line 87
    iput v10, v1, LE5/I;->X:I

    .line 88
    .line 89
    iput-boolean v9, v1, LE5/I;->c0:Z

    .line 90
    .line 91
    iget-wide v10, v0, LE5/r;->p:J

    .line 92
    .line 93
    iput-wide v10, v1, LE5/I;->E:J

    .line 94
    .line 95
    new-instance v15, LE5/F;

    .line 96
    .line 97
    invoke-direct {v15, v1}, LE5/F;-><init>(LE5/I;)V

    .line 98
    .line 99
    .line 100
    iput-object v15, v1, LE5/I;->x:LE5/F;

    .line 101
    .line 102
    new-instance v10, LE5/G;

    .line 103
    .line 104
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 105
    .line 106
    .line 107
    iput-object v10, v1, LE5/I;->y:LE5/G;

    .line 108
    .line 109
    new-instance v14, Landroid/os/Handler;

    .line 110
    .line 111
    iget-object v10, v0, LE5/r;->g:Landroid/os/Looper;

    .line 112
    .line 113
    invoke-direct {v14, v10}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 114
    .line 115
    .line 116
    iget-object v10, v0, LE5/r;->c:LE5/p;

    .line 117
    .line 118
    invoke-virtual {v10}, LE5/p;->get()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v10

    .line 122
    move-object v13, v10

    .line 123
    check-cast v13, LE5/m;

    .line 124
    .line 125
    move-object/from16 v16, v15

    .line 126
    .line 127
    move-object/from16 v17, v15

    .line 128
    .line 129
    move-object/from16 v18, v15

    .line 130
    .line 131
    invoke-virtual/range {v13 .. v18}, LE5/m;->a(Landroid/os/Handler;LE5/F;LE5/F;LE5/F;LE5/F;)[LE5/f;

    .line 132
    .line 133
    .line 134
    move-result-object v10

    .line 135
    iput-object v10, v1, LE5/I;->g:[LE5/f;

    .line 136
    .line 137
    array-length v11, v10

    .line 138
    if-lez v11, :cond_0

    .line 139
    .line 140
    move v11, v12

    .line 141
    goto :goto_0

    .line 142
    :cond_0
    move v11, v9

    .line 143
    :goto_0
    invoke-static {v11}, Lu6/a;->i(Z)V

    .line 144
    .line 145
    .line 146
    iget-object v11, v0, LE5/r;->e:LE5/p;

    .line 147
    .line 148
    invoke-virtual {v11}, LE5/p;->get()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v11

    .line 152
    check-cast v11, Lr6/o;

    .line 153
    .line 154
    iput-object v11, v1, LE5/I;->h:Lr6/o;

    .line 155
    .line 156
    iget-object v11, v0, LE5/r;->d:LE5/p;

    .line 157
    .line 158
    invoke-virtual {v11}, LE5/p;->get()Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v11

    .line 162
    check-cast v11, Lf6/y;

    .line 163
    .line 164
    iput-object v11, v1, LE5/I;->q:Lf6/y;

    .line 165
    .line 166
    iget-object v11, v0, LE5/r;->f:LE5/p;

    .line 167
    .line 168
    invoke-virtual {v11}, LE5/p;->get()Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v11

    .line 172
    check-cast v11, Lt6/e;

    .line 173
    .line 174
    iput-object v11, v1, LE5/I;->t:Lt6/e;

    .line 175
    .line 176
    iget-boolean v11, v0, LE5/r;->j:Z

    .line 177
    .line 178
    iput-boolean v11, v1, LE5/I;->p:Z

    .line 179
    .line 180
    iget-object v11, v0, LE5/r;->k:LE5/C0;

    .line 181
    .line 182
    iput-object v11, v1, LE5/I;->L:LE5/C0;

    .line 183
    .line 184
    iget-wide v4, v0, LE5/r;->l:J

    .line 185
    .line 186
    iput-wide v4, v1, LE5/I;->u:J

    .line 187
    .line 188
    iget-wide v4, v0, LE5/r;->m:J

    .line 189
    .line 190
    iput-wide v4, v1, LE5/I;->v:J

    .line 191
    .line 192
    iget-boolean v4, v0, LE5/r;->q:Z

    .line 193
    .line 194
    iput-boolean v4, v1, LE5/I;->N:Z

    .line 195
    .line 196
    iget-object v4, v0, LE5/r;->g:Landroid/os/Looper;

    .line 197
    .line 198
    iput-object v4, v1, LE5/I;->s:Landroid/os/Looper;

    .line 199
    .line 200
    iget-object v5, v0, LE5/r;->b:Lu6/q;

    .line 201
    .line 202
    iput-object v5, v1, LE5/I;->w:Lu6/q;

    .line 203
    .line 204
    iput-object v1, v1, LE5/I;->f:LE5/I;

    .line 205
    .line 206
    new-instance v15, LK8/H;

    .line 207
    .line 208
    new-instance v11, LE5/u;

    .line 209
    .line 210
    invoke-direct {v11, v1}, LE5/u;-><init>(LE5/I;)V

    .line 211
    .line 212
    .line 213
    invoke-direct {v15, v4, v5, v11}, LK8/H;-><init>(Landroid/os/Looper;Lu6/q;Lu6/h;)V

    .line 214
    .line 215
    .line 216
    iput-object v15, v1, LE5/I;->l:LK8/H;

    .line 217
    .line 218
    new-instance v4, Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 219
    .line 220
    invoke-direct {v4}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    .line 221
    .line 222
    .line 223
    iput-object v4, v1, LE5/I;->m:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 224
    .line 225
    new-instance v4, Ljava/util/ArrayList;

    .line 226
    .line 227
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 228
    .line 229
    .line 230
    iput-object v4, v1, LE5/I;->o:Ljava/util/ArrayList;

    .line 231
    .line 232
    new-instance v4, Lf6/X;

    .line 233
    .line 234
    invoke-direct {v4}, Lf6/X;-><init>()V

    .line 235
    .line 236
    .line 237
    iput-object v4, v1, LE5/I;->M:Lf6/X;

    .line 238
    .line 239
    new-instance v4, Lr6/s;

    .line 240
    .line 241
    array-length v5, v10

    .line 242
    new-array v5, v5, [LE5/B0;

    .line 243
    .line 244
    array-length v10, v10

    .line 245
    new-array v10, v10, [Lr6/n;

    .line 246
    .line 247
    sget-object v11, LE5/L0;->b:LE5/L0;

    .line 248
    .line 249
    const/4 v15, 0x0

    .line 250
    invoke-direct {v4, v5, v10, v11, v15}, Lr6/s;-><init>([LE5/B0;[Lr6/n;LE5/L0;LR1/q;)V

    .line 251
    .line 252
    .line 253
    iput-object v4, v1, LE5/I;->b:Lr6/s;

    .line 254
    .line 255
    new-instance v4, LE5/H0;

    .line 256
    .line 257
    invoke-direct {v4}, LE5/H0;-><init>()V

    .line 258
    .line 259
    .line 260
    iput-object v4, v1, LE5/I;->n:LE5/H0;

    .line 261
    .line 262
    new-instance v4, Landroid/util/SparseBooleanArray;

    .line 263
    .line 264
    invoke-direct {v4}, Landroid/util/SparseBooleanArray;-><init>()V

    .line 265
    .line 266
    .line 267
    new-array v5, v7, [I

    .line 268
    .line 269
    fill-array-data v5, :array_0

    .line 270
    .line 271
    .line 272
    move v10, v9

    .line 273
    :goto_1
    if-ge v10, v7, :cond_1

    .line 274
    .line 275
    aget v11, v5, v10

    .line 276
    .line 277
    xor-int/lit8 v17, v9, 0x1

    .line 278
    .line 279
    invoke-static/range {v17 .. v17}, Lu6/a;->i(Z)V

    .line 280
    .line 281
    .line 282
    invoke-virtual {v4, v11, v12}, Landroid/util/SparseBooleanArray;->append(IZ)V

    .line 283
    .line 284
    .line 285
    add-int/2addr v10, v12

    .line 286
    goto :goto_1

    .line 287
    :cond_1
    iget-object v5, v1, LE5/I;->h:Lr6/o;

    .line 288
    .line 289
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 290
    .line 291
    .line 292
    xor-int/lit8 v5, v9, 0x1

    .line 293
    .line 294
    invoke-static {v5}, Lu6/a;->i(Z)V

    .line 295
    .line 296
    .line 297
    const/16 v5, 0x1d

    .line 298
    .line 299
    invoke-virtual {v4, v5, v12}, Landroid/util/SparseBooleanArray;->append(IZ)V

    .line 300
    .line 301
    .line 302
    new-instance v10, LE5/s0;

    .line 303
    .line 304
    xor-int/lit8 v11, v9, 0x1

    .line 305
    .line 306
    invoke-static {v11}, Lu6/a;->i(Z)V

    .line 307
    .line 308
    .line 309
    new-instance v11, Lu6/e;

    .line 310
    .line 311
    invoke-direct {v11, v4}, Lu6/e;-><init>(Landroid/util/SparseBooleanArray;)V

    .line 312
    .line 313
    .line 314
    invoke-direct {v10, v11}, LE5/s0;-><init>(Lu6/e;)V

    .line 315
    .line 316
    .line 317
    iput-object v10, v1, LE5/I;->c:LE5/s0;

    .line 318
    .line 319
    new-instance v4, Landroid/util/SparseBooleanArray;

    .line 320
    .line 321
    invoke-direct {v4}, Landroid/util/SparseBooleanArray;-><init>()V

    .line 322
    .line 323
    .line 324
    move v10, v9

    .line 325
    :goto_2
    iget-object v13, v11, Lu6/e;->a:Landroid/util/SparseBooleanArray;

    .line 326
    .line 327
    invoke-virtual {v13}, Landroid/util/SparseBooleanArray;->size()I

    .line 328
    .line 329
    .line 330
    move-result v13

    .line 331
    if-ge v10, v13, :cond_2

    .line 332
    .line 333
    invoke-virtual {v11, v10}, Lu6/e;->a(I)I

    .line 334
    .line 335
    .line 336
    move-result v13

    .line 337
    xor-int/lit8 v18, v9, 0x1

    .line 338
    .line 339
    invoke-static/range {v18 .. v18}, Lu6/a;->i(Z)V

    .line 340
    .line 341
    .line 342
    invoke-virtual {v4, v13, v12}, Landroid/util/SparseBooleanArray;->append(IZ)V

    .line 343
    .line 344
    .line 345
    add-int/2addr v10, v12

    .line 346
    goto :goto_2

    .line 347
    :cond_2
    xor-int/lit8 v10, v9, 0x1

    .line 348
    .line 349
    invoke-static {v10}, Lu6/a;->i(Z)V

    .line 350
    .line 351
    .line 352
    const/4 v10, 0x4

    .line 353
    invoke-virtual {v4, v10, v12}, Landroid/util/SparseBooleanArray;->append(IZ)V

    .line 354
    .line 355
    .line 356
    xor-int/lit8 v11, v9, 0x1

    .line 357
    .line 358
    invoke-static {v11}, Lu6/a;->i(Z)V

    .line 359
    .line 360
    .line 361
    const/16 v11, 0xa

    .line 362
    .line 363
    invoke-virtual {v4, v11, v12}, Landroid/util/SparseBooleanArray;->append(IZ)V

    .line 364
    .line 365
    .line 366
    new-instance v13, LE5/s0;

    .line 367
    .line 368
    xor-int/lit8 v18, v9, 0x1

    .line 369
    .line 370
    invoke-static/range {v18 .. v18}, Lu6/a;->i(Z)V

    .line 371
    .line 372
    .line 373
    new-instance v6, Lu6/e;

    .line 374
    .line 375
    invoke-direct {v6, v4}, Lu6/e;-><init>(Landroid/util/SparseBooleanArray;)V

    .line 376
    .line 377
    .line 378
    invoke-direct {v13, v6}, LE5/s0;-><init>(Lu6/e;)V

    .line 379
    .line 380
    .line 381
    iput-object v13, v1, LE5/I;->O:LE5/s0;

    .line 382
    .line 383
    iget-object v4, v1, LE5/I;->w:Lu6/q;

    .line 384
    .line 385
    iget-object v6, v1, LE5/I;->s:Landroid/os/Looper;

    .line 386
    .line 387
    invoke-virtual {v4, v6, v15}, Lu6/q;->a(Landroid/os/Looper;Landroid/os/Handler$Callback;)Lu6/s;

    .line 388
    .line 389
    .line 390
    move-result-object v4

    .line 391
    iput-object v4, v1, LE5/I;->i:Lu6/s;

    .line 392
    .line 393
    new-instance v4, LE5/u;

    .line 394
    .line 395
    invoke-direct {v4, v1}, LE5/u;-><init>(LE5/I;)V

    .line 396
    .line 397
    .line 398
    iput-object v4, v1, LE5/I;->j:LE5/u;

    .line 399
    .line 400
    iget-object v6, v1, LE5/I;->b:Lr6/s;

    .line 401
    .line 402
    invoke-static {v6}, LE5/q0;->h(Lr6/s;)LE5/q0;

    .line 403
    .line 404
    .line 405
    move-result-object v6

    .line 406
    iput-object v6, v1, LE5/I;->j0:LE5/q0;

    .line 407
    .line 408
    iget-object v6, v1, LE5/I;->r:LF5/f;

    .line 409
    .line 410
    iget-object v13, v1, LE5/I;->f:LE5/I;

    .line 411
    .line 412
    iget-object v10, v1, LE5/I;->s:Landroid/os/Looper;

    .line 413
    .line 414
    invoke-virtual {v6, v13, v10}, LF5/f;->P(LE5/I;Landroid/os/Looper;)V

    .line 415
    .line 416
    .line 417
    sget v6, Lu6/v;->a:I

    .line 418
    .line 419
    if-ge v6, v3, :cond_3

    .line 420
    .line 421
    new-instance v3, LF5/l;

    .line 422
    .line 423
    invoke-direct {v3}, LF5/l;-><init>()V

    .line 424
    .line 425
    .line 426
    :goto_3
    move-object/from16 v36, v3

    .line 427
    .line 428
    goto :goto_4

    .line 429
    :catchall_0
    move-exception v0

    .line 430
    goto/16 :goto_9

    .line 431
    .line 432
    :cond_3
    iget-object v3, v1, LE5/I;->e:Landroid/content/Context;

    .line 433
    .line 434
    iget-boolean v10, v0, LE5/r;->r:Z

    .line 435
    .line 436
    invoke-static {v3, v1, v10}, LE5/B;->a(Landroid/content/Context;LE5/I;Z)LF5/l;

    .line 437
    .line 438
    .line 439
    move-result-object v3

    .line 440
    goto :goto_3

    .line 441
    :goto_4
    new-instance v19, LE5/O;

    .line 442
    .line 443
    iget-object v3, v1, LE5/I;->g:[LE5/f;

    .line 444
    .line 445
    iget-object v10, v1, LE5/I;->h:Lr6/o;

    .line 446
    .line 447
    iget-object v13, v1, LE5/I;->b:Lr6/s;

    .line 448
    .line 449
    new-instance v23, LE5/k;

    .line 450
    .line 451
    invoke-direct/range {v23 .. v23}, LE5/k;-><init>()V

    .line 452
    .line 453
    .line 454
    iget-object v11, v1, LE5/I;->t:Lt6/e;

    .line 455
    .line 456
    iget v8, v1, LE5/I;->F:I

    .line 457
    .line 458
    iget-boolean v5, v1, LE5/I;->G:Z

    .line 459
    .line 460
    iget-object v2, v1, LE5/I;->r:LF5/f;

    .line 461
    .line 462
    iget-object v12, v1, LE5/I;->L:LE5/C0;

    .line 463
    .line 464
    iget-object v15, v0, LE5/r;->n:LE5/j;

    .line 465
    .line 466
    move/from16 v25, v8

    .line 467
    .line 468
    iget-wide v7, v0, LE5/r;->o:J

    .line 469
    .line 470
    iget-boolean v9, v1, LE5/I;->N:Z

    .line 471
    .line 472
    move-object/from16 v27, v2

    .line 473
    .line 474
    iget-object v2, v1, LE5/I;->s:Landroid/os/Looper;

    .line 475
    .line 476
    move-object/from16 v33, v2

    .line 477
    .line 478
    iget-object v2, v1, LE5/I;->w:Lu6/q;

    .line 479
    .line 480
    move-object/from16 v34, v2

    .line 481
    .line 482
    move-object/from16 v20, v3

    .line 483
    .line 484
    move-object/from16 v35, v4

    .line 485
    .line 486
    move/from16 v26, v5

    .line 487
    .line 488
    move-wide/from16 v30, v7

    .line 489
    .line 490
    move/from16 v32, v9

    .line 491
    .line 492
    move-object/from16 v21, v10

    .line 493
    .line 494
    move-object/from16 v24, v11

    .line 495
    .line 496
    move-object/from16 v28, v12

    .line 497
    .line 498
    move-object/from16 v22, v13

    .line 499
    .line 500
    move-object/from16 v29, v15

    .line 501
    .line 502
    invoke-direct/range {v19 .. v36}, LE5/O;-><init>([LE5/f;Lr6/o;Lr6/s;LE5/k;Lt6/e;IZLF5/f;LE5/C0;LE5/j;JZLandroid/os/Looper;Lu6/q;LE5/u;LF5/l;)V

    .line 503
    .line 504
    .line 505
    move-object/from16 v2, v19

    .line 506
    .line 507
    iput-object v2, v1, LE5/I;->k:LE5/O;

    .line 508
    .line 509
    const/high16 v2, 0x3f800000    # 1.0f

    .line 510
    .line 511
    iput v2, v1, LE5/I;->b0:F

    .line 512
    .line 513
    const/4 v2, 0x0

    .line 514
    iput v2, v1, LE5/I;->F:I

    .line 515
    .line 516
    sget-object v2, LE5/f0;->G:LE5/f0;

    .line 517
    .line 518
    iput-object v2, v1, LE5/I;->P:LE5/f0;

    .line 519
    .line 520
    iput-object v2, v1, LE5/I;->i0:LE5/f0;

    .line 521
    .line 522
    const/4 v2, -0x1

    .line 523
    iput v2, v1, LE5/I;->k0:I

    .line 524
    .line 525
    const/16 v3, 0x15

    .line 526
    .line 527
    if-ge v6, v3, :cond_6

    .line 528
    .line 529
    iget-object v2, v1, LE5/I;->Q:Landroid/media/AudioTrack;

    .line 530
    .line 531
    if-eqz v2, :cond_4

    .line 532
    .line 533
    invoke-virtual {v2}, Landroid/media/AudioTrack;->getAudioSessionId()I

    .line 534
    .line 535
    .line 536
    move-result v2

    .line 537
    if-eqz v2, :cond_4

    .line 538
    .line 539
    iget-object v2, v1, LE5/I;->Q:Landroid/media/AudioTrack;

    .line 540
    .line 541
    invoke-virtual {v2}, Landroid/media/AudioTrack;->release()V

    .line 542
    .line 543
    .line 544
    const/4 v2, 0x0

    .line 545
    iput-object v2, v1, LE5/I;->Q:Landroid/media/AudioTrack;

    .line 546
    .line 547
    :cond_4
    iget-object v2, v1, LE5/I;->Q:Landroid/media/AudioTrack;

    .line 548
    .line 549
    if-nez v2, :cond_5

    .line 550
    .line 551
    new-instance v3, Landroid/media/AudioTrack;

    .line 552
    .line 553
    const/16 v5, 0xfa0

    .line 554
    .line 555
    const/4 v6, 0x4

    .line 556
    const/4 v7, 0x2

    .line 557
    const/4 v8, 0x2

    .line 558
    const/4 v10, 0x0

    .line 559
    const/4 v4, 0x3

    .line 560
    const/4 v9, 0x0

    .line 561
    invoke-direct/range {v3 .. v10}, Landroid/media/AudioTrack;-><init>(IIIIIII)V

    .line 562
    .line 563
    .line 564
    iput-object v3, v1, LE5/I;->Q:Landroid/media/AudioTrack;

    .line 565
    .line 566
    :cond_5
    iget-object v2, v1, LE5/I;->Q:Landroid/media/AudioTrack;

    .line 567
    .line 568
    invoke-virtual {v2}, Landroid/media/AudioTrack;->getAudioSessionId()I

    .line 569
    .line 570
    .line 571
    move-result v2

    .line 572
    iput v2, v1, LE5/I;->Z:I

    .line 573
    .line 574
    goto :goto_6

    .line 575
    :cond_6
    iget-object v3, v1, LE5/I;->e:Landroid/content/Context;

    .line 576
    .line 577
    const-string v4, "audio"

    .line 578
    .line 579
    invoke-virtual {v3, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 580
    .line 581
    .line 582
    move-result-object v3

    .line 583
    check-cast v3, Landroid/media/AudioManager;

    .line 584
    .line 585
    if-nez v3, :cond_7

    .line 586
    .line 587
    goto :goto_5

    .line 588
    :cond_7
    invoke-virtual {v3}, Landroid/media/AudioManager;->generateAudioSessionId()I

    .line 589
    .line 590
    .line 591
    move-result v2

    .line 592
    :goto_5
    iput v2, v1, LE5/I;->Z:I

    .line 593
    .line 594
    :goto_6
    sget-object v2, Lh6/c;->b:Lh6/c;

    .line 595
    .line 596
    iput-object v2, v1, LE5/I;->d0:Lh6/c;

    .line 597
    .line 598
    const/4 v2, 0x1

    .line 599
    iput-boolean v2, v1, LE5/I;->e0:Z

    .line 600
    .line 601
    iget-object v2, v1, LE5/I;->r:LF5/f;

    .line 602
    .line 603
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 604
    .line 605
    .line 606
    iget-object v3, v1, LE5/I;->l:LK8/H;

    .line 607
    .line 608
    invoke-virtual {v3, v2}, LK8/H;->d(Ljava/lang/Object;)V

    .line 609
    .line 610
    .line 611
    iget-object v2, v1, LE5/I;->t:Lt6/e;

    .line 612
    .line 613
    new-instance v3, Landroid/os/Handler;

    .line 614
    .line 615
    iget-object v4, v1, LE5/I;->s:Landroid/os/Looper;

    .line 616
    .line 617
    invoke-direct {v3, v4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 618
    .line 619
    .line 620
    iget-object v4, v1, LE5/I;->r:LF5/f;

    .line 621
    .line 622
    check-cast v2, Lt6/p;

    .line 623
    .line 624
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 625
    .line 626
    .line 627
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 628
    .line 629
    .line 630
    iget-object v2, v2, Lt6/p;->b:La2/c;

    .line 631
    .line 632
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 633
    .line 634
    .line 635
    iget-object v5, v2, La2/c;->b:Ljava/lang/Object;

    .line 636
    .line 637
    check-cast v5, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 638
    .line 639
    invoke-virtual {v5}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 640
    .line 641
    .line 642
    move-result-object v6

    .line 643
    :cond_8
    :goto_7
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 644
    .line 645
    .line 646
    move-result v7

    .line 647
    if-eqz v7, :cond_9

    .line 648
    .line 649
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 650
    .line 651
    .line 652
    move-result-object v7

    .line 653
    check-cast v7, Lt6/d;

    .line 654
    .line 655
    iget-object v8, v7, Lt6/d;->b:LF5/f;

    .line 656
    .line 657
    if-ne v8, v4, :cond_8

    .line 658
    .line 659
    const/4 v8, 0x1

    .line 660
    iput-boolean v8, v7, Lt6/d;->c:Z

    .line 661
    .line 662
    invoke-virtual {v5, v7}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 663
    .line 664
    .line 665
    goto :goto_7

    .line 666
    :cond_9
    iget-object v2, v2, La2/c;->b:Ljava/lang/Object;

    .line 667
    .line 668
    check-cast v2, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 669
    .line 670
    new-instance v5, Lt6/d;

    .line 671
    .line 672
    invoke-direct {v5, v4, v3}, Lt6/d;-><init>(LF5/f;Landroid/os/Handler;)V

    .line 673
    .line 674
    .line 675
    invoke-virtual {v2, v5}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 676
    .line 677
    .line 678
    iget-object v2, v1, LE5/I;->x:LE5/F;

    .line 679
    .line 680
    iget-object v3, v1, LE5/I;->m:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 681
    .line 682
    invoke-virtual {v3, v2}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 683
    .line 684
    .line 685
    new-instance v2, LE5/b;

    .line 686
    .line 687
    iget-object v3, v0, LE5/r;->a:Landroid/content/Context;

    .line 688
    .line 689
    iget-object v4, v1, LE5/I;->x:LE5/F;

    .line 690
    .line 691
    invoke-direct {v2, v3, v14, v4}, LE5/b;-><init>(Landroid/content/Context;Landroid/os/Handler;LE5/F;)V

    .line 692
    .line 693
    .line 694
    iput-object v2, v1, LE5/I;->z:LE5/b;

    .line 695
    .line 696
    invoke-virtual {v2}, LE5/b;->l()V

    .line 697
    .line 698
    .line 699
    new-instance v2, LE5/e;

    .line 700
    .line 701
    iget-object v3, v0, LE5/r;->a:Landroid/content/Context;

    .line 702
    .line 703
    iget-object v4, v1, LE5/I;->x:LE5/F;

    .line 704
    .line 705
    invoke-direct {v2, v3, v14, v4}, LE5/e;-><init>(Landroid/content/Context;Landroid/os/Handler;LE5/F;)V

    .line 706
    .line 707
    .line 708
    iput-object v2, v1, LE5/I;->A:LE5/e;

    .line 709
    .line 710
    sget v2, Lu6/v;->a:I

    .line 711
    .line 712
    new-instance v2, LE5/E0;

    .line 713
    .line 714
    iget-object v3, v0, LE5/r;->a:Landroid/content/Context;

    .line 715
    .line 716
    iget-object v4, v1, LE5/I;->x:LE5/F;

    .line 717
    .line 718
    invoke-direct {v2, v3, v14, v4}, LE5/E0;-><init>(Landroid/content/Context;Landroid/os/Handler;LE5/F;)V

    .line 719
    .line 720
    .line 721
    iput-object v2, v1, LE5/I;->B:LE5/E0;

    .line 722
    .line 723
    iget-object v3, v1, LE5/I;->a0:LG5/h;

    .line 724
    .line 725
    iget v3, v3, LG5/h;->c:I

    .line 726
    .line 727
    invoke-static {v3}, Lu6/v;->q(I)I

    .line 728
    .line 729
    .line 730
    move-result v3

    .line 731
    iget v4, v2, LE5/E0;->f:I

    .line 732
    .line 733
    if-ne v4, v3, :cond_a

    .line 734
    .line 735
    goto :goto_8

    .line 736
    :cond_a
    iput v3, v2, LE5/E0;->f:I

    .line 737
    .line 738
    invoke-virtual {v2}, LE5/E0;->b()V

    .line 739
    .line 740
    .line 741
    iget-object v3, v2, LE5/E0;->c:LE5/F;

    .line 742
    .line 743
    iget-object v3, v3, LE5/F;->a:LE5/I;

    .line 744
    .line 745
    iget-object v4, v3, LE5/I;->B:LE5/E0;

    .line 746
    .line 747
    invoke-static {v4}, LE5/I;->g0(LE5/E0;)LE5/n;

    .line 748
    .line 749
    .line 750
    move-result-object v4

    .line 751
    iget-object v5, v3, LE5/I;->g0:LE5/n;

    .line 752
    .line 753
    invoke-virtual {v4, v5}, LE5/n;->equals(Ljava/lang/Object;)Z

    .line 754
    .line 755
    .line 756
    move-result v5

    .line 757
    if-nez v5, :cond_b

    .line 758
    .line 759
    iput-object v4, v3, LE5/I;->g0:LE5/n;

    .line 760
    .line 761
    new-instance v5, LB8/b;

    .line 762
    .line 763
    const/16 v6, 0x9

    .line 764
    .line 765
    invoke-direct {v5, v4, v6}, LB8/b;-><init>(Ljava/lang/Object;I)V

    .line 766
    .line 767
    .line 768
    iget-object v3, v3, LE5/I;->l:LK8/H;

    .line 769
    .line 770
    const/16 v4, 0x1d

    .line 771
    .line 772
    invoke-virtual {v3, v4, v5}, LK8/H;->p(ILu6/g;)V

    .line 773
    .line 774
    .line 775
    :cond_b
    :goto_8
    new-instance v3, Lx9/d;

    .line 776
    .line 777
    iget-object v4, v0, LE5/r;->a:Landroid/content/Context;

    .line 778
    .line 779
    const/16 v5, 0x10

    .line 780
    .line 781
    invoke-direct {v3, v5}, Lx9/d;-><init>(I)V

    .line 782
    .line 783
    .line 784
    invoke-virtual {v4}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 785
    .line 786
    .line 787
    move-result-object v4

    .line 788
    const-string v5, "power"

    .line 789
    .line 790
    invoke-virtual {v4, v5}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 791
    .line 792
    .line 793
    move-result-object v4

    .line 794
    check-cast v4, Landroid/os/PowerManager;

    .line 795
    .line 796
    iput-object v3, v1, LE5/I;->C:Lx9/d;

    .line 797
    .line 798
    new-instance v3, Lya/b;

    .line 799
    .line 800
    iget-object v0, v0, LE5/r;->a:Landroid/content/Context;

    .line 801
    .line 802
    const/16 v5, 0x10

    .line 803
    .line 804
    invoke-direct {v3, v5}, Lya/b;-><init>(I)V

    .line 805
    .line 806
    .line 807
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 808
    .line 809
    .line 810
    move-result-object v0

    .line 811
    const-string v4, "wifi"

    .line 812
    .line 813
    invoke-virtual {v0, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 814
    .line 815
    .line 816
    move-result-object v0

    .line 817
    check-cast v0, Landroid/net/wifi/WifiManager;

    .line 818
    .line 819
    iput-object v3, v1, LE5/I;->D:Lya/b;

    .line 820
    .line 821
    invoke-static {v2}, LE5/I;->g0(LE5/E0;)LE5/n;

    .line 822
    .line 823
    .line 824
    move-result-object v0

    .line 825
    iput-object v0, v1, LE5/I;->g0:LE5/n;

    .line 826
    .line 827
    sget-object v0, Lv6/o;->e:Lv6/o;

    .line 828
    .line 829
    iput-object v0, v1, LE5/I;->h0:Lv6/o;

    .line 830
    .line 831
    sget-object v0, Lu6/p;->c:Lu6/p;

    .line 832
    .line 833
    iput-object v0, v1, LE5/I;->Y:Lu6/p;

    .line 834
    .line 835
    iget-object v0, v1, LE5/I;->h:Lr6/o;

    .line 836
    .line 837
    iget-object v2, v1, LE5/I;->a0:LG5/h;

    .line 838
    .line 839
    check-cast v0, Lr6/l;

    .line 840
    .line 841
    iget-object v3, v0, Lr6/l;->c:Ljava/lang/Object;

    .line 842
    .line 843
    monitor-enter v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 844
    :try_start_1
    iget-object v4, v0, Lr6/l;->i:LG5/h;

    .line 845
    .line 846
    invoke-virtual {v4, v2}, LG5/h;->equals(Ljava/lang/Object;)Z

    .line 847
    .line 848
    .line 849
    move-result v4

    .line 850
    iput-object v2, v0, Lr6/l;->i:LG5/h;

    .line 851
    .line 852
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 853
    if-nez v4, :cond_c

    .line 854
    .line 855
    :try_start_2
    invoke-virtual {v0}, Lr6/l;->f()V

    .line 856
    .line 857
    .line 858
    :cond_c
    iget v0, v1, LE5/I;->Z:I

    .line 859
    .line 860
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 861
    .line 862
    .line 863
    move-result-object v0

    .line 864
    const/4 v2, 0x1

    .line 865
    const/16 v3, 0xa

    .line 866
    .line 867
    invoke-virtual {v1, v2, v3, v0}, LE5/I;->F0(IILjava/lang/Object;)V

    .line 868
    .line 869
    .line 870
    iget v0, v1, LE5/I;->Z:I

    .line 871
    .line 872
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 873
    .line 874
    .line 875
    move-result-object v0

    .line 876
    const/4 v13, 0x2

    .line 877
    invoke-virtual {v1, v13, v3, v0}, LE5/I;->F0(IILjava/lang/Object;)V

    .line 878
    .line 879
    .line 880
    iget-object v0, v1, LE5/I;->a0:LG5/h;

    .line 881
    .line 882
    const/4 v11, 0x3

    .line 883
    invoke-virtual {v1, v2, v11, v0}, LE5/I;->F0(IILjava/lang/Object;)V

    .line 884
    .line 885
    .line 886
    iget v0, v1, LE5/I;->X:I

    .line 887
    .line 888
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 889
    .line 890
    .line 891
    move-result-object v0

    .line 892
    const/4 v2, 0x4

    .line 893
    invoke-virtual {v1, v13, v2, v0}, LE5/I;->F0(IILjava/lang/Object;)V

    .line 894
    .line 895
    .line 896
    const/16 v37, 0x0

    .line 897
    .line 898
    invoke-static/range {v37 .. v37}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 899
    .line 900
    .line 901
    move-result-object v0

    .line 902
    const/4 v2, 0x5

    .line 903
    invoke-virtual {v1, v13, v2, v0}, LE5/I;->F0(IILjava/lang/Object;)V

    .line 904
    .line 905
    .line 906
    iget-boolean v0, v1, LE5/I;->c0:Z

    .line 907
    .line 908
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 909
    .line 910
    .line 911
    move-result-object v0

    .line 912
    const/4 v2, 0x1

    .line 913
    const/16 v6, 0x9

    .line 914
    .line 915
    invoke-virtual {v1, v2, v6, v0}, LE5/I;->F0(IILjava/lang/Object;)V

    .line 916
    .line 917
    .line 918
    iget-object v0, v1, LE5/I;->y:LE5/G;

    .line 919
    .line 920
    const/4 v2, 0x7

    .line 921
    invoke-virtual {v1, v13, v2, v0}, LE5/I;->F0(IILjava/lang/Object;)V

    .line 922
    .line 923
    .line 924
    iget-object v0, v1, LE5/I;->y:LE5/G;

    .line 925
    .line 926
    const/4 v2, 0x6

    .line 927
    const/16 v3, 0x8

    .line 928
    .line 929
    invoke-virtual {v1, v2, v3, v0}, LE5/I;->F0(IILjava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 930
    .line 931
    .line 932
    iget-object v0, v1, LE5/I;->d:Ls8/b;

    .line 933
    .line 934
    invoke-virtual {v0}, Ls8/b;->e()Z

    .line 935
    .line 936
    .line 937
    return-void

    .line 938
    :catchall_1
    move-exception v0

    .line 939
    :try_start_3
    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 940
    :try_start_4
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 941
    :goto_9
    iget-object v2, v1, LE5/I;->d:Ls8/b;

    .line 942
    .line 943
    invoke-virtual {v2}, Ls8/b;->e()Z

    .line 944
    .line 945
    .line 946
    throw v0

    .line 947
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
        0x16
        0x17
        0x18
        0x19
        0x1a
        0x1b
        0x1c
    .end array-data
.end method

.method public static g0(LE5/E0;)LE5/n;
    .locals 5

    .line 1
    new-instance v0, LE5/n;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget v1, Lu6/v;->a:I

    .line 7
    .line 8
    const/16 v2, 0x1c

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    iget-object v4, p0, LE5/E0;->d:Landroid/media/AudioManager;

    .line 12
    .line 13
    if-lt v1, v2, :cond_0

    .line 14
    .line 15
    iget v1, p0, LE5/E0;->f:I

    .line 16
    .line 17
    invoke-static {v4, v1}, LA0/j;->c(Landroid/media/AudioManager;I)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move v1, v3

    .line 23
    :goto_0
    iget p0, p0, LE5/E0;->f:I

    .line 24
    .line 25
    invoke-virtual {v4, p0}, Landroid/media/AudioManager;->getStreamMaxVolume(I)I

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    invoke-direct {v0, v3, v1, p0}, LE5/n;-><init>(III)V

    .line 30
    .line 31
    .line 32
    return-object v0
.end method

.method public static u0(LE5/q0;)J
    .locals 6

    .line 1
    new-instance v0, LE5/I0;

    .line 2
    .line 3
    invoke-direct {v0}, LE5/I0;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, LE5/H0;

    .line 7
    .line 8
    invoke-direct {v1}, LE5/H0;-><init>()V

    .line 9
    .line 10
    .line 11
    iget-object v2, p0, LE5/q0;->a:LE5/J0;

    .line 12
    .line 13
    iget-object v3, p0, LE5/q0;->b:Lf6/z;

    .line 14
    .line 15
    iget-object v3, v3, Lf6/x;->a:Ljava/lang/Object;

    .line 16
    .line 17
    invoke-virtual {v2, v3, v1}, LE5/J0;->g(Ljava/lang/Object;LE5/H0;)LE5/H0;

    .line 18
    .line 19
    .line 20
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    iget-wide v4, p0, LE5/q0;->c:J

    .line 26
    .line 27
    cmp-long v2, v4, v2

    .line 28
    .line 29
    if-nez v2, :cond_0

    .line 30
    .line 31
    iget v1, v1, LE5/H0;->c:I

    .line 32
    .line 33
    const-wide/16 v2, 0x0

    .line 34
    .line 35
    iget-object p0, p0, LE5/q0;->a:LE5/J0;

    .line 36
    .line 37
    invoke-virtual {p0, v1, v0, v2, v3}, LE5/J0;->m(ILE5/I0;J)LE5/I0;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    iget-wide v0, p0, LE5/I0;->l:J

    .line 42
    .line 43
    return-wide v0

    .line 44
    :cond_0
    iget-wide v0, v1, LE5/H0;->e:J

    .line 45
    .line 46
    add-long/2addr v0, v4

    .line 47
    return-wide v0
.end method

.method public static w0(LE5/q0;)Z
    .locals 2

    .line 1
    iget v0, p0, LE5/q0;->e:I

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    iget-boolean v0, p0, LE5/q0;->l:Z

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget p0, p0, LE5/q0;->m:I

    .line 11
    .line 12
    if-nez p0, :cond_0

    .line 13
    .line 14
    const/4 p0, 0x1

    .line 15
    return p0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    return p0
.end method


# virtual methods
.method public final A0(II)V
    .locals 2

    .line 1
    iget-object v0, p0, LE5/I;->Y:Lu6/p;

    .line 2
    .line 3
    iget v1, v0, Lu6/p;->a:I

    .line 4
    .line 5
    if-ne p1, v1, :cond_1

    .line 6
    .line 7
    iget v0, v0, Lu6/p;->b:I

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
    new-instance v0, Lu6/p;

    .line 14
    .line 15
    invoke-direct {v0, p1, p2}, Lu6/p;-><init>(II)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, LE5/I;->Y:Lu6/p;

    .line 19
    .line 20
    new-instance v0, LE5/x;

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    invoke-direct {v0, p1, p2, v1}, LE5/x;-><init>(III)V

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, LE5/I;->l:LK8/H;

    .line 27
    .line 28
    const/16 p2, 0x18

    .line 29
    .line 30
    invoke-virtual {p1, p2, v0}, LK8/H;->p(ILu6/g;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public final B0()V
    .locals 15

    .line 1
    invoke-virtual {p0}, LE5/I;->Q0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LE5/I;->s0()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    iget-object v1, p0, LE5/I;->A:LE5/e;

    .line 9
    .line 10
    const/4 v2, 0x2

    .line 11
    invoke-virtual {v1, v2, v0}, LE5/e;->c(IZ)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v3, 0x1

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    if-eq v1, v3, :cond_0

    .line 19
    .line 20
    move v4, v2

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move v4, v3

    .line 23
    :goto_0
    invoke-virtual {p0, v1, v4, v0}, LE5/I;->N0(IIZ)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, LE5/I;->j0:LE5/q0;

    .line 27
    .line 28
    iget v1, v0, LE5/q0;->e:I

    .line 29
    .line 30
    if-eq v1, v3, :cond_1

    .line 31
    .line 32
    return-void

    .line 33
    :cond_1
    const/4 v1, 0x0

    .line 34
    invoke-virtual {v0, v1}, LE5/q0;->d(LE5/o;)LE5/q0;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    iget-object v1, v0, LE5/q0;->a:LE5/J0;

    .line 39
    .line 40
    invoke-virtual {v1}, LE5/J0;->p()Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-eqz v1, :cond_2

    .line 45
    .line 46
    const/4 v2, 0x4

    .line 47
    :cond_2
    invoke-virtual {v0, v2}, LE5/q0;->f(I)LE5/q0;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    iget v0, p0, LE5/I;->H:I

    .line 52
    .line 53
    add-int/2addr v0, v3

    .line 54
    iput v0, p0, LE5/I;->H:I

    .line 55
    .line 56
    iget-object v0, p0, LE5/I;->k:LE5/O;

    .line 57
    .line 58
    iget-object v0, v0, LE5/O;->h:Lu6/s;

    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    invoke-static {}, Lu6/s;->b()Lu6/r;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    iget-object v0, v0, Lu6/s;->a:Landroid/os/Handler;

    .line 68
    .line 69
    const/4 v2, 0x0

    .line 70
    invoke-virtual {v0, v2}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    iput-object v0, v1, Lu6/r;->a:Landroid/os/Message;

    .line 75
    .line 76
    invoke-virtual {v1}, Lu6/r;->b()V

    .line 77
    .line 78
    .line 79
    const/4 v10, 0x5

    .line 80
    const-wide v11, -0x7fffffffffffffffL    # -4.9E-324

    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    const/4 v6, 0x1

    .line 86
    const/4 v7, 0x1

    .line 87
    const/4 v8, 0x0

    .line 88
    const/4 v9, 0x0

    .line 89
    const/4 v13, -0x1

    .line 90
    const/4 v14, 0x0

    .line 91
    move-object v4, p0

    .line 92
    invoke-virtual/range {v4 .. v14}, LE5/I;->O0(LE5/q0;IIZZIJIZ)V

    .line 93
    .line 94
    .line 95
    return-void
.end method

.method public final C0(LE5/u0;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LE5/I;->l:LK8/H;

    .line 5
    .line 6
    iget-object v1, v0, LK8/H;->e:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    if-eqz v3, :cond_2

    .line 19
    .line 20
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    check-cast v3, Lu6/i;

    .line 25
    .line 26
    iget-object v4, v3, Lu6/i;->a:Ljava/lang/Object;

    .line 27
    .line 28
    invoke-virtual {v4, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    if-eqz v4, :cond_0

    .line 33
    .line 34
    const/4 v4, 0x1

    .line 35
    iput-boolean v4, v3, Lu6/i;->d:Z

    .line 36
    .line 37
    iget-boolean v4, v3, Lu6/i;->c:Z

    .line 38
    .line 39
    if-eqz v4, :cond_1

    .line 40
    .line 41
    const/4 v4, 0x0

    .line 42
    iput-boolean v4, v3, Lu6/i;->c:Z

    .line 43
    .line 44
    iget-object v4, v3, Lu6/i;->b:LN1/k;

    .line 45
    .line 46
    invoke-virtual {v4}, LN1/k;->c()Lu6/e;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    iget-object v5, v3, Lu6/i;->a:Ljava/lang/Object;

    .line 51
    .line 52
    iget-object v6, v0, LK8/H;->d:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v6, Lu6/h;

    .line 55
    .line 56
    invoke-interface {v6, v5, v4}, Lu6/h;->a(Ljava/lang/Object;Lu6/e;)V

    .line 57
    .line 58
    .line 59
    :cond_1
    invoke-virtual {v1, v3}, Ljava/util/concurrent/CopyOnWriteArraySet;->remove(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_2
    return-void
.end method

.method public final D0()V
    .locals 4

    .line 1
    iget-object v0, p0, LE5/I;->U:Lw6/k;

    .line 2
    .line 3
    iget-object v1, p0, LE5/I;->x:LE5/F;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, LE5/I;->y:LE5/G;

    .line 9
    .line 10
    invoke-virtual {p0, v0}, LE5/I;->h0(LE5/x0;)LE5/y0;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-boolean v3, v0, LE5/y0;->g:Z

    .line 15
    .line 16
    xor-int/lit8 v3, v3, 0x1

    .line 17
    .line 18
    invoke-static {v3}, Lu6/a;->i(Z)V

    .line 19
    .line 20
    .line 21
    const/16 v3, 0x2710

    .line 22
    .line 23
    iput v3, v0, LE5/y0;->d:I

    .line 24
    .line 25
    iget-boolean v3, v0, LE5/y0;->g:Z

    .line 26
    .line 27
    xor-int/lit8 v3, v3, 0x1

    .line 28
    .line 29
    invoke-static {v3}, Lu6/a;->i(Z)V

    .line 30
    .line 31
    .line 32
    iput-object v2, v0, LE5/y0;->e:Ljava/lang/Object;

    .line 33
    .line 34
    invoke-virtual {v0}, LE5/y0;->c()V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, LE5/I;->U:Lw6/k;

    .line 38
    .line 39
    iget-object v0, v0, Lw6/k;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    iput-object v2, p0, LE5/I;->U:Lw6/k;

    .line 45
    .line 46
    :cond_0
    iget-object v0, p0, LE5/I;->W:Landroid/view/TextureView;

    .line 47
    .line 48
    if-eqz v0, :cond_2

    .line 49
    .line 50
    invoke-virtual {v0}, Landroid/view/TextureView;->getSurfaceTextureListener()Landroid/view/TextureView$SurfaceTextureListener;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    if-eq v0, v1, :cond_1

    .line 55
    .line 56
    const-string v0, "ExoPlayerImpl"

    .line 57
    .line 58
    const-string v3, "SurfaceTextureListener already unset or replaced."

    .line 59
    .line 60
    invoke-static {v0, v3}, Lu6/a;->E(Ljava/lang/String;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_1
    iget-object v0, p0, LE5/I;->W:Landroid/view/TextureView;

    .line 65
    .line 66
    invoke-virtual {v0, v2}, Landroid/view/TextureView;->setSurfaceTextureListener(Landroid/view/TextureView$SurfaceTextureListener;)V

    .line 67
    .line 68
    .line 69
    :goto_0
    iput-object v2, p0, LE5/I;->W:Landroid/view/TextureView;

    .line 70
    .line 71
    :cond_2
    iget-object v0, p0, LE5/I;->T:Landroid/view/SurfaceHolder;

    .line 72
    .line 73
    if-eqz v0, :cond_3

    .line 74
    .line 75
    invoke-interface {v0, v1}, Landroid/view/SurfaceHolder;->removeCallback(Landroid/view/SurfaceHolder$Callback;)V

    .line 76
    .line 77
    .line 78
    iput-object v2, p0, LE5/I;->T:Landroid/view/SurfaceHolder;

    .line 79
    .line 80
    :cond_3
    return-void
.end method

.method public final E0(JIZ)V
    .locals 11

    .line 1
    iget-object v2, p0, LE5/I;->r:LF5/f;

    .line 2
    .line 3
    iget-boolean v3, v2, LF5/f;->i:Z

    .line 4
    .line 5
    const/4 v4, 0x1

    .line 6
    if-nez v3, :cond_0

    .line 7
    .line 8
    invoke-virtual {v2}, LF5/f;->J()LF5/a;

    .line 9
    .line 10
    .line 11
    move-result-object v3

    .line 12
    iput-boolean v4, v2, LF5/f;->i:Z

    .line 13
    .line 14
    new-instance v5, LA5/f;

    .line 15
    .line 16
    const/16 v6, 0x18

    .line 17
    .line 18
    invoke-direct {v5, v6}, LA5/f;-><init>(I)V

    .line 19
    .line 20
    .line 21
    const/4 v6, -0x1

    .line 22
    invoke-virtual {v2, v3, v6, v5}, LF5/f;->O(LF5/a;ILu6/g;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    iget-object v2, p0, LE5/I;->j0:LE5/q0;

    .line 26
    .line 27
    iget-object v2, v2, LE5/q0;->a:LE5/J0;

    .line 28
    .line 29
    if-ltz p3, :cond_4

    .line 30
    .line 31
    invoke-virtual {v2}, LE5/J0;->p()Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-nez v3, :cond_1

    .line 36
    .line 37
    invoke-virtual {v2}, LE5/J0;->o()I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-ge p3, v3, :cond_4

    .line 42
    .line 43
    :cond_1
    iget v3, p0, LE5/I;->H:I

    .line 44
    .line 45
    add-int/2addr v3, v4

    .line 46
    iput v3, p0, LE5/I;->H:I

    .line 47
    .line 48
    invoke-virtual {p0}, LE5/I;->x0()Z

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    if-eqz v3, :cond_2

    .line 53
    .line 54
    const-string v1, "ExoPlayerImpl"

    .line 55
    .line 56
    const-string v2, "seekTo ignored because an ad is playing"

    .line 57
    .line 58
    invoke-static {v1, v2}, Lu6/a;->E(Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    new-instance v1, LA6/d;

    .line 62
    .line 63
    iget-object v2, p0, LE5/I;->j0:LE5/q0;

    .line 64
    .line 65
    invoke-direct {v1, v2}, LA6/d;-><init>(LE5/q0;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1, v4}, LA6/d;->a(I)V

    .line 69
    .line 70
    .line 71
    iget-object v2, p0, LE5/I;->j:LE5/u;

    .line 72
    .line 73
    iget-object v2, v2, LE5/u;->a:LE5/I;

    .line 74
    .line 75
    iget-object v3, v2, LE5/I;->i:Lu6/s;

    .line 76
    .line 77
    new-instance v4, LC8/d;

    .line 78
    .line 79
    const/4 v5, 0x4

    .line 80
    invoke-direct {v4, v5, v2, v1}, LC8/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    iget-object v1, v3, Lu6/s;->a:Landroid/os/Handler;

    .line 84
    .line 85
    invoke-virtual {v1, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 86
    .line 87
    .line 88
    return-void

    .line 89
    :cond_2
    invoke-virtual {p0}, LE5/I;->t0()I

    .line 90
    .line 91
    .line 92
    move-result v3

    .line 93
    if-ne v3, v4, :cond_3

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_3
    const/4 v4, 0x2

    .line 97
    :goto_0
    invoke-virtual {p0}, LE5/I;->l0()I

    .line 98
    .line 99
    .line 100
    move-result v9

    .line 101
    iget-object v3, p0, LE5/I;->j0:LE5/q0;

    .line 102
    .line 103
    invoke-virtual {v3, v4}, LE5/q0;->f(I)LE5/q0;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    invoke-virtual {p0, v2, p3, p1, p2}, LE5/I;->z0(LE5/J0;IJ)Landroid/util/Pair;

    .line 108
    .line 109
    .line 110
    move-result-object v6

    .line 111
    invoke-virtual {p0, v3, v2, v6}, LE5/I;->y0(LE5/q0;LE5/J0;Landroid/util/Pair;)LE5/q0;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    invoke-static {p1, p2}, Lu6/v;->y(J)J

    .line 116
    .line 117
    .line 118
    move-result-wide v4

    .line 119
    iget-object v6, p0, LE5/I;->k:LE5/O;

    .line 120
    .line 121
    iget-object v6, v6, LE5/O;->h:Lu6/s;

    .line 122
    .line 123
    new-instance v7, LE5/N;

    .line 124
    .line 125
    invoke-direct {v7, v2, p3, v4, v5}, LE5/N;-><init>(LE5/J0;IJ)V

    .line 126
    .line 127
    .line 128
    const/4 v1, 0x3

    .line 129
    invoke-virtual {v6, v1, v7}, Lu6/s;->a(ILjava/lang/Object;)Lu6/r;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    invoke-virtual {v1}, Lu6/r;->b()V

    .line 134
    .line 135
    .line 136
    invoke-virtual {p0, v3}, LE5/I;->n0(LE5/q0;)J

    .line 137
    .line 138
    .line 139
    move-result-wide v7

    .line 140
    const/4 v4, 0x1

    .line 141
    const/4 v5, 0x1

    .line 142
    const/4 v2, 0x0

    .line 143
    move-object v1, v3

    .line 144
    const/4 v3, 0x1

    .line 145
    const/4 v6, 0x1

    .line 146
    move-object v0, p0

    .line 147
    move v10, p4

    .line 148
    invoke-virtual/range {v0 .. v10}, LE5/I;->O0(LE5/q0;IIZZIJIZ)V

    .line 149
    .line 150
    .line 151
    return-void

    .line 152
    :cond_4
    new-instance v0, LCd/s0;

    .line 153
    .line 154
    const/4 v1, 0x2

    .line 155
    invoke-direct {v0, v1}, LCd/s0;-><init>(I)V

    .line 156
    .line 157
    .line 158
    throw v0
.end method

.method public final F0(IILjava/lang/Object;)V
    .locals 5

    .line 1
    iget-object v0, p0, LE5/I;->g:[LE5/f;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    :goto_0
    if-ge v2, v1, :cond_1

    .line 6
    .line 7
    aget-object v3, v0, v2

    .line 8
    .line 9
    iget v4, v3, LE5/f;->a:I

    .line 10
    .line 11
    if-ne v4, p1, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0, v3}, LE5/I;->h0(LE5/x0;)LE5/y0;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    iget-boolean v4, v3, LE5/y0;->g:Z

    .line 18
    .line 19
    xor-int/lit8 v4, v4, 0x1

    .line 20
    .line 21
    invoke-static {v4}, Lu6/a;->i(Z)V

    .line 22
    .line 23
    .line 24
    iput p2, v3, LE5/y0;->d:I

    .line 25
    .line 26
    iget-boolean v4, v3, LE5/y0;->g:Z

    .line 27
    .line 28
    xor-int/lit8 v4, v4, 0x1

    .line 29
    .line 30
    invoke-static {v4}, Lu6/a;->i(Z)V

    .line 31
    .line 32
    .line 33
    iput-object p3, v3, LE5/y0;->e:Ljava/lang/Object;

    .line 34
    .line 35
    invoke-virtual {v3}, LE5/y0;->c()V

    .line 36
    .line 37
    .line 38
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    return-void
.end method

.method public final G0(Ljava/util/List;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, LE5/I;->Q0()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, LE5/I;->q0()I

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, LE5/I;->m0()J

    .line 10
    .line 11
    .line 12
    iget v1, v0, LE5/I;->H:I

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    add-int/2addr v1, v2

    .line 16
    iput v1, v0, LE5/I;->H:I

    .line 17
    .line 18
    iget-object v1, v0, LE5/I;->o:Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    const/4 v4, 0x0

    .line 25
    if-nez v3, :cond_4

    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    add-int/lit8 v5, v3, -0x1

    .line 32
    .line 33
    :goto_0
    if-ltz v5, :cond_0

    .line 34
    .line 35
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    add-int/lit8 v5, v5, -0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    iget-object v5, v0, LE5/I;->M:Lf6/X;

    .line 42
    .line 43
    iget-object v6, v5, Lf6/X;->b:[I

    .line 44
    .line 45
    array-length v7, v6

    .line 46
    sub-int/2addr v7, v3

    .line 47
    new-array v7, v7, [I

    .line 48
    .line 49
    move v8, v4

    .line 50
    move v9, v8

    .line 51
    :goto_1
    array-length v10, v6

    .line 52
    if-ge v8, v10, :cond_3

    .line 53
    .line 54
    aget v10, v6, v8

    .line 55
    .line 56
    if-ltz v10, :cond_1

    .line 57
    .line 58
    if-ge v10, v3, :cond_1

    .line 59
    .line 60
    add-int/lit8 v9, v9, 0x1

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_1
    sub-int v11, v8, v9

    .line 64
    .line 65
    if-ltz v10, :cond_2

    .line 66
    .line 67
    sub-int/2addr v10, v3

    .line 68
    :cond_2
    aput v10, v7, v11

    .line 69
    .line 70
    :goto_2
    add-int/lit8 v8, v8, 0x1

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_3
    new-instance v3, Lf6/X;

    .line 74
    .line 75
    new-instance v6, Ljava/util/Random;

    .line 76
    .line 77
    iget-object v5, v5, Lf6/X;->a:Ljava/util/Random;

    .line 78
    .line 79
    invoke-virtual {v5}, Ljava/util/Random;->nextLong()J

    .line 80
    .line 81
    .line 82
    move-result-wide v8

    .line 83
    invoke-direct {v6, v8, v9}, Ljava/util/Random;-><init>(J)V

    .line 84
    .line 85
    .line 86
    invoke-direct {v3, v7, v6}, Lf6/X;-><init>([ILjava/util/Random;)V

    .line 87
    .line 88
    .line 89
    iput-object v3, v0, LE5/I;->M:Lf6/X;

    .line 90
    .line 91
    :cond_4
    new-instance v11, Ljava/util/ArrayList;

    .line 92
    .line 93
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 94
    .line 95
    .line 96
    move v3, v4

    .line 97
    :goto_3
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    .line 98
    .line 99
    .line 100
    move-result v5

    .line 101
    if-ge v3, v5, :cond_5

    .line 102
    .line 103
    new-instance v5, LE5/m0;

    .line 104
    .line 105
    move-object/from16 v6, p1

    .line 106
    .line 107
    invoke-interface {v6, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v7

    .line 111
    check-cast v7, Lf6/a;

    .line 112
    .line 113
    iget-boolean v8, v0, LE5/I;->p:Z

    .line 114
    .line 115
    invoke-direct {v5, v7, v8}, LE5/m0;-><init>(Lf6/a;Z)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v11, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    new-instance v7, LE5/H;

    .line 122
    .line 123
    iget-object v8, v5, LE5/m0;->b:Ljava/lang/Object;

    .line 124
    .line 125
    iget-object v5, v5, LE5/m0;->a:Lf6/t;

    .line 126
    .line 127
    iget-object v5, v5, Lf6/t;->o:Lf6/r;

    .line 128
    .line 129
    invoke-direct {v7, v8, v5}, LE5/H;-><init>(Ljava/lang/Object;LE5/J0;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v1, v3, v7}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    add-int/lit8 v3, v3, 0x1

    .line 136
    .line 137
    goto :goto_3

    .line 138
    :cond_5
    iget-object v3, v0, LE5/I;->M:Lf6/X;

    .line 139
    .line 140
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 141
    .line 142
    .line 143
    move-result v5

    .line 144
    invoke-virtual {v3, v5}, Lf6/X;->a(I)Lf6/X;

    .line 145
    .line 146
    .line 147
    move-result-object v3

    .line 148
    iput-object v3, v0, LE5/I;->M:Lf6/X;

    .line 149
    .line 150
    new-instance v5, LE5/z0;

    .line 151
    .line 152
    invoke-direct {v5, v1, v3}, LE5/z0;-><init>(Ljava/util/ArrayList;Lf6/X;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v5}, LE5/J0;->p()Z

    .line 156
    .line 157
    .line 158
    move-result v1

    .line 159
    const/4 v3, -0x1

    .line 160
    iget v6, v5, LE5/z0;->d:I

    .line 161
    .line 162
    if-nez v1, :cond_7

    .line 163
    .line 164
    if-ge v3, v6, :cond_6

    .line 165
    .line 166
    goto :goto_4

    .line 167
    :cond_6
    new-instance v1, LCd/s0;

    .line 168
    .line 169
    const/4 v2, 0x2

    .line 170
    invoke-direct {v1, v2}, LCd/s0;-><init>(I)V

    .line 171
    .line 172
    .line 173
    throw v1

    .line 174
    :cond_7
    :goto_4
    iget-boolean v1, v0, LE5/I;->G:Z

    .line 175
    .line 176
    invoke-virtual {v5, v1}, LE5/z0;->a(Z)I

    .line 177
    .line 178
    .line 179
    move-result v13

    .line 180
    iget-object v1, v0, LE5/I;->j0:LE5/q0;

    .line 181
    .line 182
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    invoke-virtual {v0, v5, v13, v7, v8}, LE5/I;->z0(LE5/J0;IJ)Landroid/util/Pair;

    .line 188
    .line 189
    .line 190
    move-result-object v9

    .line 191
    invoke-virtual {v0, v1, v5, v9}, LE5/I;->y0(LE5/q0;LE5/J0;Landroid/util/Pair;)LE5/q0;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    iget v9, v1, LE5/q0;->e:I

    .line 196
    .line 197
    if-eq v13, v3, :cond_a

    .line 198
    .line 199
    if-eq v9, v2, :cond_a

    .line 200
    .line 201
    invoke-virtual {v5}, LE5/J0;->p()Z

    .line 202
    .line 203
    .line 204
    move-result v3

    .line 205
    if-nez v3, :cond_9

    .line 206
    .line 207
    if-lt v13, v6, :cond_8

    .line 208
    .line 209
    goto :goto_5

    .line 210
    :cond_8
    const/4 v9, 0x2

    .line 211
    goto :goto_6

    .line 212
    :cond_9
    :goto_5
    const/4 v9, 0x4

    .line 213
    :cond_a
    :goto_6
    invoke-virtual {v1, v9}, LE5/q0;->f(I)LE5/q0;

    .line 214
    .line 215
    .line 216
    move-result-object v1

    .line 217
    invoke-static {v7, v8}, Lu6/v;->y(J)J

    .line 218
    .line 219
    .line 220
    move-result-wide v14

    .line 221
    iget-object v12, v0, LE5/I;->M:Lf6/X;

    .line 222
    .line 223
    iget-object v3, v0, LE5/I;->k:LE5/O;

    .line 224
    .line 225
    iget-object v3, v3, LE5/O;->h:Lu6/s;

    .line 226
    .line 227
    new-instance v10, LE5/L;

    .line 228
    .line 229
    invoke-direct/range {v10 .. v15}, LE5/L;-><init>(Ljava/util/ArrayList;Lf6/X;IJ)V

    .line 230
    .line 231
    .line 232
    const/16 v5, 0x11

    .line 233
    .line 234
    invoke-virtual {v3, v5, v10}, Lu6/s;->a(ILjava/lang/Object;)Lu6/r;

    .line 235
    .line 236
    .line 237
    move-result-object v3

    .line 238
    invoke-virtual {v3}, Lu6/r;->b()V

    .line 239
    .line 240
    .line 241
    iget-object v3, v0, LE5/I;->j0:LE5/q0;

    .line 242
    .line 243
    iget-object v3, v3, LE5/q0;->b:Lf6/z;

    .line 244
    .line 245
    iget-object v3, v3, Lf6/x;->a:Ljava/lang/Object;

    .line 246
    .line 247
    iget-object v5, v1, LE5/q0;->b:Lf6/z;

    .line 248
    .line 249
    iget-object v5, v5, Lf6/x;->a:Ljava/lang/Object;

    .line 250
    .line 251
    invoke-virtual {v3, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 252
    .line 253
    .line 254
    move-result v3

    .line 255
    if-nez v3, :cond_b

    .line 256
    .line 257
    iget-object v3, v0, LE5/I;->j0:LE5/q0;

    .line 258
    .line 259
    iget-object v3, v3, LE5/q0;->a:LE5/J0;

    .line 260
    .line 261
    invoke-virtual {v3}, LE5/J0;->p()Z

    .line 262
    .line 263
    .line 264
    move-result v3

    .line 265
    if-nez v3, :cond_b

    .line 266
    .line 267
    move v5, v2

    .line 268
    goto :goto_7

    .line 269
    :cond_b
    move v5, v4

    .line 270
    :goto_7
    invoke-virtual {v0, v1}, LE5/I;->n0(LE5/q0;)J

    .line 271
    .line 272
    .line 273
    move-result-wide v7

    .line 274
    const/4 v9, -0x1

    .line 275
    const/4 v10, 0x0

    .line 276
    const/4 v2, 0x0

    .line 277
    const/4 v3, 0x1

    .line 278
    const/4 v4, 0x0

    .line 279
    const/4 v6, 0x4

    .line 280
    invoke-virtual/range {v0 .. v10}, LE5/I;->O0(LE5/q0;IIZZIJIZ)V

    .line 281
    .line 282
    .line 283
    return-void
.end method

.method public final H0(Landroid/view/SurfaceHolder;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, LE5/I;->V:Z

    .line 3
    .line 4
    iput-object p1, p0, LE5/I;->T:Landroid/view/SurfaceHolder;

    .line 5
    .line 6
    iget-object v1, p0, LE5/I;->x:LE5/F;

    .line 7
    .line 8
    invoke-interface {p1, v1}, Landroid/view/SurfaceHolder;->addCallback(Landroid/view/SurfaceHolder$Callback;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, LE5/I;->T:Landroid/view/SurfaceHolder;

    .line 12
    .line 13
    invoke-interface {p1}, Landroid/view/SurfaceHolder;->getSurface()Landroid/view/Surface;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    invoke-virtual {p1}, Landroid/view/Surface;->isValid()Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    iget-object p1, p0, LE5/I;->T:Landroid/view/SurfaceHolder;

    .line 26
    .line 27
    invoke-interface {p1}, Landroid/view/SurfaceHolder;->getSurfaceFrame()Landroid/graphics/Rect;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    invoke-virtual {p0, v0, p1}, LE5/I;->A0(II)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_0
    invoke-virtual {p0, v0, v0}, LE5/I;->A0(II)V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public final I0(Z)V
    .locals 2

    .line 1
    invoke-virtual {p0}, LE5/I;->Q0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LE5/I;->A:LE5/e;

    .line 5
    .line 6
    invoke-virtual {p0}, LE5/I;->t0()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    invoke-virtual {v0, v1, p1}, LE5/e;->c(IZ)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    if-eq v0, v1, :cond_0

    .line 18
    .line 19
    const/4 v1, 0x2

    .line 20
    :cond_0
    invoke-virtual {p0, v0, v1, p1}, LE5/I;->N0(IIZ)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final J0(I)V
    .locals 4

    .line 1
    invoke-virtual {p0}, LE5/I;->Q0()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, LE5/I;->F:I

    .line 5
    .line 6
    if-eq v0, p1, :cond_0

    .line 7
    .line 8
    iput p1, p0, LE5/I;->F:I

    .line 9
    .line 10
    iget-object v0, p0, LE5/I;->k:LE5/O;

    .line 11
    .line 12
    iget-object v0, v0, LE5/O;->h:Lu6/s;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-static {}, Lu6/s;->b()Lu6/r;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    iget-object v0, v0, Lu6/s;->a:Landroid/os/Handler;

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
    iput-object v0, v1, Lu6/r;->a:Landroid/os/Message;

    .line 31
    .line 32
    invoke-virtual {v1}, Lu6/r;->b()V

    .line 33
    .line 34
    .line 35
    new-instance v0, LE5/v;

    .line 36
    .line 37
    const/4 v1, 0x0

    .line 38
    invoke-direct {v0, p1, v1}, LE5/v;-><init>(II)V

    .line 39
    .line 40
    .line 41
    const/16 p1, 0x8

    .line 42
    .line 43
    iget-object v1, p0, LE5/I;->l:LK8/H;

    .line 44
    .line 45
    invoke-virtual {v1, p1, v0}, LK8/H;->o(ILu6/g;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, LE5/I;->M0()V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1}, LK8/H;->m()V

    .line 52
    .line 53
    .line 54
    :cond_0
    return-void
.end method

.method public final K0(Lr6/r;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, LE5/I;->Q0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LE5/I;->h:Lr6/o;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    check-cast v0, Lr6/l;

    .line 10
    .line 11
    invoke-virtual {v0}, Lr6/l;->d()Lr6/f;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {p1, v1}, Lr6/r;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    instance-of v1, p1, Lr6/f;

    .line 23
    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    move-object v1, p1

    .line 27
    check-cast v1, Lr6/f;

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Lr6/l;->i(Lr6/f;)V

    .line 30
    .line 31
    .line 32
    :cond_1
    new-instance v1, Lr6/e;

    .line 33
    .line 34
    invoke-virtual {v0}, Lr6/l;->d()Lr6/f;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-direct {v1, v2}, Lr6/e;-><init>(Lr6/f;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, p1}, Lr6/q;->b(Lr6/r;)V

    .line 42
    .line 43
    .line 44
    new-instance v2, Lr6/f;

    .line 45
    .line 46
    invoke-direct {v2, v1}, Lr6/f;-><init>(Lr6/e;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v2}, Lr6/l;->i(Lr6/f;)V

    .line 50
    .line 51
    .line 52
    new-instance v0, LB8/b;

    .line 53
    .line 54
    const/4 v1, 0x5

    .line 55
    invoke-direct {v0, p1, v1}, LB8/b;-><init>(Ljava/lang/Object;I)V

    .line 56
    .line 57
    .line 58
    iget-object p1, p0, LE5/I;->l:LK8/H;

    .line 59
    .line 60
    const/16 v1, 0x13

    .line 61
    .line 62
    invoke-virtual {p1, v1, v0}, LK8/H;->p(ILu6/g;)V

    .line 63
    .line 64
    .line 65
    return-void
.end method

.method public final L0(Ljava/lang/Object;)V
    .locals 11

    .line 1
    new-instance v2, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v3, p0, LE5/I;->g:[LE5/f;

    .line 7
    .line 8
    array-length v4, v3

    .line 9
    const/4 v5, 0x0

    .line 10
    move v6, v5

    .line 11
    :goto_0
    const/4 v7, 0x2

    .line 12
    const/4 v8, 0x1

    .line 13
    if-ge v6, v4, :cond_1

    .line 14
    .line 15
    aget-object v9, v3, v6

    .line 16
    .line 17
    iget v10, v9, LE5/f;->a:I

    .line 18
    .line 19
    if-ne v10, v7, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0, v9}, LE5/I;->h0(LE5/x0;)LE5/y0;

    .line 22
    .line 23
    .line 24
    move-result-object v7

    .line 25
    iget-boolean v9, v7, LE5/y0;->g:Z

    .line 26
    .line 27
    xor-int/2addr v9, v8

    .line 28
    invoke-static {v9}, Lu6/a;->i(Z)V

    .line 29
    .line 30
    .line 31
    iput v8, v7, LE5/y0;->d:I

    .line 32
    .line 33
    iget-boolean v9, v7, LE5/y0;->g:Z

    .line 34
    .line 35
    xor-int/2addr v8, v9

    .line 36
    invoke-static {v8}, Lu6/a;->i(Z)V

    .line 37
    .line 38
    .line 39
    iput-object p1, v7, LE5/y0;->e:Ljava/lang/Object;

    .line 40
    .line 41
    invoke-virtual {v7}, LE5/y0;->c()V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    :cond_0
    add-int/lit8 v6, v6, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    iget-object v3, p0, LE5/I;->R:Ljava/lang/Object;

    .line 51
    .line 52
    if-eqz v3, :cond_3

    .line 53
    .line 54
    if-eq v3, p1, :cond_3

    .line 55
    .line 56
    :try_start_0
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    if-eqz v3, :cond_2

    .line 65
    .line 66
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    check-cast v3, LE5/y0;

    .line 71
    .line 72
    iget-wide v9, p0, LE5/I;->E:J

    .line 73
    .line 74
    invoke-virtual {v3, v9, v10}, LE5/y0;->a(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_0

    .line 75
    .line 76
    .line 77
    goto :goto_1

    .line 78
    :catch_0
    move v2, v8

    .line 79
    goto :goto_2

    .line 80
    :catch_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    invoke-virtual {v2}, Ljava/lang/Thread;->interrupt()V

    .line 85
    .line 86
    .line 87
    :cond_2
    move v2, v5

    .line 88
    :goto_2
    iget-object v3, p0, LE5/I;->R:Ljava/lang/Object;

    .line 89
    .line 90
    iget-object v4, p0, LE5/I;->S:Landroid/view/Surface;

    .line 91
    .line 92
    if-ne v3, v4, :cond_4

    .line 93
    .line 94
    invoke-virtual {v4}, Landroid/view/Surface;->release()V

    .line 95
    .line 96
    .line 97
    const/4 v3, 0x0

    .line 98
    iput-object v3, p0, LE5/I;->S:Landroid/view/Surface;

    .line 99
    .line 100
    goto :goto_3

    .line 101
    :cond_3
    move v2, v5

    .line 102
    :cond_4
    :goto_3
    iput-object p1, p0, LE5/I;->R:Ljava/lang/Object;

    .line 103
    .line 104
    if-eqz v2, :cond_6

    .line 105
    .line 106
    new-instance v1, LE5/Q;

    .line 107
    .line 108
    const-string v2, "Detaching surface timed out."

    .line 109
    .line 110
    const/4 v3, 0x0

    .line 111
    invoke-direct {v1, v2, v3}, LE5/Q;-><init>(Ljava/lang/String;I)V

    .line 112
    .line 113
    .line 114
    new-instance v2, LE5/o;

    .line 115
    .line 116
    const/16 v3, 0x3eb

    .line 117
    .line 118
    invoke-direct {v2, v7, v1, v3}, LE5/o;-><init>(ILjava/lang/Exception;I)V

    .line 119
    .line 120
    .line 121
    iget-object v1, p0, LE5/I;->j0:LE5/q0;

    .line 122
    .line 123
    iget-object v3, v1, LE5/q0;->b:Lf6/z;

    .line 124
    .line 125
    invoke-virtual {v1, v3}, LE5/q0;->a(Lf6/z;)LE5/q0;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    iget-wide v3, v1, LE5/q0;->r:J

    .line 130
    .line 131
    iput-wide v3, v1, LE5/q0;->p:J

    .line 132
    .line 133
    const-wide/16 v3, 0x0

    .line 134
    .line 135
    iput-wide v3, v1, LE5/q0;->q:J

    .line 136
    .line 137
    invoke-virtual {v1, v8}, LE5/q0;->f(I)LE5/q0;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    invoke-virtual {v1, v2}, LE5/q0;->d(LE5/o;)LE5/q0;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    iget v2, p0, LE5/I;->H:I

    .line 146
    .line 147
    add-int/2addr v2, v8

    .line 148
    iput v2, p0, LE5/I;->H:I

    .line 149
    .line 150
    iget-object v2, p0, LE5/I;->k:LE5/O;

    .line 151
    .line 152
    iget-object v2, v2, LE5/O;->h:Lu6/s;

    .line 153
    .line 154
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    invoke-static {}, Lu6/s;->b()Lu6/r;

    .line 158
    .line 159
    .line 160
    move-result-object v3

    .line 161
    iget-object v2, v2, Lu6/s;->a:Landroid/os/Handler;

    .line 162
    .line 163
    const/4 v4, 0x6

    .line 164
    invoke-virtual {v2, v4}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    iput-object v2, v3, Lu6/r;->a:Landroid/os/Message;

    .line 169
    .line 170
    invoke-virtual {v3}, Lu6/r;->b()V

    .line 171
    .line 172
    .line 173
    iget-object v2, v1, LE5/q0;->a:LE5/J0;

    .line 174
    .line 175
    invoke-virtual {v2}, LE5/J0;->p()Z

    .line 176
    .line 177
    .line 178
    move-result v2

    .line 179
    if-eqz v2, :cond_5

    .line 180
    .line 181
    iget-object v2, p0, LE5/I;->j0:LE5/q0;

    .line 182
    .line 183
    iget-object v2, v2, LE5/q0;->a:LE5/J0;

    .line 184
    .line 185
    invoke-virtual {v2}, LE5/J0;->p()Z

    .line 186
    .line 187
    .line 188
    move-result v2

    .line 189
    if-nez v2, :cond_5

    .line 190
    .line 191
    move v5, v8

    .line 192
    :cond_5
    invoke-virtual {p0, v1}, LE5/I;->n0(LE5/q0;)J

    .line 193
    .line 194
    .line 195
    move-result-wide v7

    .line 196
    const/4 v9, -0x1

    .line 197
    const/4 v10, 0x0

    .line 198
    const/4 v2, 0x0

    .line 199
    const/4 v3, 0x1

    .line 200
    const/4 v4, 0x0

    .line 201
    const/4 v6, 0x4

    .line 202
    move-object v0, p0

    .line 203
    invoke-virtual/range {v0 .. v10}, LE5/I;->O0(LE5/q0;IIZZIJIZ)V

    .line 204
    .line 205
    .line 206
    :cond_6
    return-void
.end method

.method public final M0()V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    const/4 v2, 0x1

    .line 5
    iget-object v3, v0, LE5/I;->O:LE5/s0;

    .line 6
    .line 7
    sget v4, Lu6/v;->a:I

    .line 8
    .line 9
    iget-object v4, v0, LE5/I;->f:LE5/I;

    .line 10
    .line 11
    invoke-virtual {v4}, LE5/I;->x0()Z

    .line 12
    .line 13
    .line 14
    move-result v5

    .line 15
    invoke-virtual {v4}, LA7/B0;->K()Z

    .line 16
    .line 17
    .line 18
    move-result v6

    .line 19
    invoke-virtual {v4}, LE5/I;->o0()LE5/J0;

    .line 20
    .line 21
    .line 22
    move-result-object v7

    .line 23
    invoke-virtual {v7}, LE5/J0;->p()Z

    .line 24
    .line 25
    .line 26
    move-result v8

    .line 27
    const/4 v9, -0x1

    .line 28
    const/4 v10, 0x0

    .line 29
    if-eqz v8, :cond_0

    .line 30
    .line 31
    move v7, v9

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-virtual {v4}, LE5/I;->l0()I

    .line 34
    .line 35
    .line 36
    move-result v8

    .line 37
    invoke-virtual {v4}, LE5/I;->Q0()V

    .line 38
    .line 39
    .line 40
    iget v11, v4, LE5/I;->F:I

    .line 41
    .line 42
    if-ne v11, v2, :cond_1

    .line 43
    .line 44
    move v11, v10

    .line 45
    :cond_1
    invoke-virtual {v4}, LE5/I;->Q0()V

    .line 46
    .line 47
    .line 48
    iget-boolean v12, v4, LE5/I;->G:Z

    .line 49
    .line 50
    invoke-virtual {v7, v8, v11, v12}, LE5/J0;->k(IIZ)I

    .line 51
    .line 52
    .line 53
    move-result v7

    .line 54
    :goto_0
    if-eq v7, v9, :cond_2

    .line 55
    .line 56
    move v7, v2

    .line 57
    goto :goto_1

    .line 58
    :cond_2
    move v7, v10

    .line 59
    :goto_1
    invoke-virtual {v4}, LE5/I;->o0()LE5/J0;

    .line 60
    .line 61
    .line 62
    move-result-object v8

    .line 63
    invoke-virtual {v8}, LE5/J0;->p()Z

    .line 64
    .line 65
    .line 66
    move-result v11

    .line 67
    if-eqz v11, :cond_3

    .line 68
    .line 69
    move v8, v9

    .line 70
    goto :goto_2

    .line 71
    :cond_3
    invoke-virtual {v4}, LE5/I;->l0()I

    .line 72
    .line 73
    .line 74
    move-result v11

    .line 75
    invoke-virtual {v4}, LE5/I;->Q0()V

    .line 76
    .line 77
    .line 78
    iget v12, v4, LE5/I;->F:I

    .line 79
    .line 80
    if-ne v12, v2, :cond_4

    .line 81
    .line 82
    move v12, v10

    .line 83
    :cond_4
    invoke-virtual {v4}, LE5/I;->Q0()V

    .line 84
    .line 85
    .line 86
    iget-boolean v13, v4, LE5/I;->G:Z

    .line 87
    .line 88
    invoke-virtual {v8, v11, v12, v13}, LE5/J0;->e(IIZ)I

    .line 89
    .line 90
    .line 91
    move-result v8

    .line 92
    :goto_2
    if-eq v8, v9, :cond_5

    .line 93
    .line 94
    move v8, v2

    .line 95
    goto :goto_3

    .line 96
    :cond_5
    move v8, v10

    .line 97
    :goto_3
    invoke-virtual {v4}, LA7/B0;->J()Z

    .line 98
    .line 99
    .line 100
    move-result v9

    .line 101
    invoke-virtual {v4}, LA7/B0;->I()Z

    .line 102
    .line 103
    .line 104
    move-result v11

    .line 105
    invoke-virtual {v4}, LE5/I;->o0()LE5/J0;

    .line 106
    .line 107
    .line 108
    move-result-object v4

    .line 109
    invoke-virtual {v4}, LE5/J0;->p()Z

    .line 110
    .line 111
    .line 112
    move-result v4

    .line 113
    new-instance v12, LA/e0;

    .line 114
    .line 115
    invoke-direct {v12, v1}, LA/e0;-><init>(I)V

    .line 116
    .line 117
    .line 118
    iget-object v13, v0, LE5/I;->c:LE5/s0;

    .line 119
    .line 120
    iget-object v13, v13, LE5/s0;->a:Lu6/e;

    .line 121
    .line 122
    iget-object v14, v12, LA/e0;->b:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast v14, LN1/k;

    .line 125
    .line 126
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    move/from16 v16, v2

    .line 130
    .line 131
    move v15, v10

    .line 132
    :goto_4
    iget-object v2, v13, Lu6/e;->a:Landroid/util/SparseBooleanArray;

    .line 133
    .line 134
    invoke-virtual {v2}, Landroid/util/SparseBooleanArray;->size()I

    .line 135
    .line 136
    .line 137
    move-result v2

    .line 138
    if-ge v15, v2, :cond_6

    .line 139
    .line 140
    invoke-virtual {v13, v15}, Lu6/e;->a(I)I

    .line 141
    .line 142
    .line 143
    move-result v2

    .line 144
    invoke-virtual {v14, v2}, LN1/k;->a(I)V

    .line 145
    .line 146
    .line 147
    add-int/lit8 v15, v15, 0x1

    .line 148
    .line 149
    goto :goto_4

    .line 150
    :cond_6
    xor-int/lit8 v2, v5, 0x1

    .line 151
    .line 152
    const/4 v13, 0x4

    .line 153
    invoke-virtual {v12, v13, v2}, LA/e0;->f(IZ)V

    .line 154
    .line 155
    .line 156
    if-eqz v6, :cond_7

    .line 157
    .line 158
    if-nez v5, :cond_7

    .line 159
    .line 160
    move/from16 v13, v16

    .line 161
    .line 162
    goto :goto_5

    .line 163
    :cond_7
    move v13, v10

    .line 164
    :goto_5
    invoke-virtual {v12, v1, v13}, LA/e0;->f(IZ)V

    .line 165
    .line 166
    .line 167
    if-eqz v7, :cond_8

    .line 168
    .line 169
    if-nez v5, :cond_8

    .line 170
    .line 171
    move/from16 v1, v16

    .line 172
    .line 173
    goto :goto_6

    .line 174
    :cond_8
    move v1, v10

    .line 175
    :goto_6
    const/4 v13, 0x6

    .line 176
    invoke-virtual {v12, v13, v1}, LA/e0;->f(IZ)V

    .line 177
    .line 178
    .line 179
    if-nez v4, :cond_a

    .line 180
    .line 181
    if-nez v7, :cond_9

    .line 182
    .line 183
    if-eqz v9, :cond_9

    .line 184
    .line 185
    if-eqz v6, :cond_a

    .line 186
    .line 187
    :cond_9
    if-nez v5, :cond_a

    .line 188
    .line 189
    move/from16 v1, v16

    .line 190
    .line 191
    goto :goto_7

    .line 192
    :cond_a
    move v1, v10

    .line 193
    :goto_7
    const/4 v7, 0x7

    .line 194
    invoke-virtual {v12, v7, v1}, LA/e0;->f(IZ)V

    .line 195
    .line 196
    .line 197
    if-eqz v8, :cond_b

    .line 198
    .line 199
    if-nez v5, :cond_b

    .line 200
    .line 201
    move/from16 v1, v16

    .line 202
    .line 203
    goto :goto_8

    .line 204
    :cond_b
    move v1, v10

    .line 205
    :goto_8
    const/16 v7, 0x8

    .line 206
    .line 207
    invoke-virtual {v12, v7, v1}, LA/e0;->f(IZ)V

    .line 208
    .line 209
    .line 210
    if-nez v4, :cond_d

    .line 211
    .line 212
    if-nez v8, :cond_c

    .line 213
    .line 214
    if-eqz v9, :cond_d

    .line 215
    .line 216
    if-eqz v11, :cond_d

    .line 217
    .line 218
    :cond_c
    if-nez v5, :cond_d

    .line 219
    .line 220
    move/from16 v1, v16

    .line 221
    .line 222
    goto :goto_9

    .line 223
    :cond_d
    move v1, v10

    .line 224
    :goto_9
    const/16 v4, 0x9

    .line 225
    .line 226
    invoke-virtual {v12, v4, v1}, LA/e0;->f(IZ)V

    .line 227
    .line 228
    .line 229
    const/16 v1, 0xa

    .line 230
    .line 231
    invoke-virtual {v12, v1, v2}, LA/e0;->f(IZ)V

    .line 232
    .line 233
    .line 234
    if-eqz v6, :cond_e

    .line 235
    .line 236
    if-nez v5, :cond_e

    .line 237
    .line 238
    move/from16 v1, v16

    .line 239
    .line 240
    goto :goto_a

    .line 241
    :cond_e
    move v1, v10

    .line 242
    :goto_a
    const/16 v2, 0xb

    .line 243
    .line 244
    invoke-virtual {v12, v2, v1}, LA/e0;->f(IZ)V

    .line 245
    .line 246
    .line 247
    if-eqz v6, :cond_f

    .line 248
    .line 249
    if-nez v5, :cond_f

    .line 250
    .line 251
    move/from16 v2, v16

    .line 252
    .line 253
    goto :goto_b

    .line 254
    :cond_f
    move v2, v10

    .line 255
    :goto_b
    const/16 v1, 0xc

    .line 256
    .line 257
    invoke-virtual {v12, v1, v2}, LA/e0;->f(IZ)V

    .line 258
    .line 259
    .line 260
    new-instance v1, LE5/s0;

    .line 261
    .line 262
    invoke-virtual {v14}, LN1/k;->c()Lu6/e;

    .line 263
    .line 264
    .line 265
    move-result-object v2

    .line 266
    invoke-direct {v1, v2}, LE5/s0;-><init>(Lu6/e;)V

    .line 267
    .line 268
    .line 269
    iput-object v1, v0, LE5/I;->O:LE5/s0;

    .line 270
    .line 271
    invoke-virtual {v1, v3}, LE5/s0;->equals(Ljava/lang/Object;)Z

    .line 272
    .line 273
    .line 274
    move-result v1

    .line 275
    if-nez v1, :cond_10

    .line 276
    .line 277
    new-instance v1, LE5/u;

    .line 278
    .line 279
    invoke-direct {v1, v0}, LE5/u;-><init>(LE5/I;)V

    .line 280
    .line 281
    .line 282
    iget-object v2, v0, LE5/I;->l:LK8/H;

    .line 283
    .line 284
    const/16 v3, 0xd

    .line 285
    .line 286
    invoke-virtual {v2, v3, v1}, LK8/H;->o(ILu6/g;)V

    .line 287
    .line 288
    .line 289
    :cond_10
    return-void
.end method

.method public final N0(IIZ)V
    .locals 11

    .line 1
    const/4 v2, 0x0

    .line 2
    const/4 v3, 0x1

    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 v4, -0x1

    .line 6
    if-eq p1, v4, :cond_0

    .line 7
    .line 8
    move v4, v3

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move v4, v2

    .line 11
    :goto_0
    if-eqz v4, :cond_1

    .line 12
    .line 13
    if-eq p1, v3, :cond_1

    .line 14
    .line 15
    move v2, v3

    .line 16
    :cond_1
    iget-object v1, p0, LE5/I;->j0:LE5/q0;

    .line 17
    .line 18
    iget-boolean v5, v1, LE5/q0;->l:Z

    .line 19
    .line 20
    if-ne v5, v4, :cond_2

    .line 21
    .line 22
    iget v5, v1, LE5/q0;->m:I

    .line 23
    .line 24
    if-ne v5, v2, :cond_2

    .line 25
    .line 26
    return-void

    .line 27
    :cond_2
    iget v5, p0, LE5/I;->H:I

    .line 28
    .line 29
    add-int/2addr v5, v3

    .line 30
    iput v5, p0, LE5/I;->H:I

    .line 31
    .line 32
    invoke-virtual {v1, v2, v4}, LE5/q0;->c(IZ)LE5/q0;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    iget-object v5, p0, LE5/I;->k:LE5/O;

    .line 37
    .line 38
    iget-object v5, v5, LE5/O;->h:Lu6/s;

    .line 39
    .line 40
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    invoke-static {}, Lu6/s;->b()Lu6/r;

    .line 44
    .line 45
    .line 46
    move-result-object v6

    .line 47
    iget-object v5, v5, Lu6/s;->a:Landroid/os/Handler;

    .line 48
    .line 49
    invoke-virtual {v5, v3, v4, v2}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    iput-object v2, v6, Lu6/r;->a:Landroid/os/Message;

    .line 54
    .line 55
    invoke-virtual {v6}, Lu6/r;->b()V

    .line 56
    .line 57
    .line 58
    const/4 v6, 0x5

    .line 59
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    const/4 v2, 0x0

    .line 65
    const/4 v4, 0x0

    .line 66
    const/4 v5, 0x0

    .line 67
    const/4 v9, -0x1

    .line 68
    const/4 v10, 0x0

    .line 69
    move-object v0, p0

    .line 70
    move v3, p2

    .line 71
    invoke-virtual/range {v0 .. v10}, LE5/I;->O0(LE5/q0;IIZZIJIZ)V

    .line 72
    .line 73
    .line 74
    return-void
.end method

.method public final O0(LE5/q0;IIZZIJIZ)V
    .locals 33

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p6

    .line 6
    .line 7
    iget-object v3, v0, LE5/I;->j0:LE5/q0;

    .line 8
    .line 9
    iput-object v1, v0, LE5/I;->j0:LE5/q0;

    .line 10
    .line 11
    iget-object v4, v3, LE5/q0;->a:LE5/J0;

    .line 12
    .line 13
    iget-object v5, v1, LE5/q0;->a:LE5/J0;

    .line 14
    .line 15
    invoke-virtual {v4, v5}, LE5/J0;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    iget-object v5, v3, LE5/q0;->a:LE5/J0;

    .line 20
    .line 21
    iget-object v6, v1, LE5/q0;->a:LE5/J0;

    .line 22
    .line 23
    invoke-virtual {v6}, LE5/J0;->p()Z

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
    invoke-virtual {v5}, LE5/J0;->p()Z

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
    invoke-virtual {v6}, LE5/J0;->p()Z

    .line 59
    .line 60
    .line 61
    move-result v7

    .line 62
    const/16 v16, 0x3

    .line 63
    .line 64
    invoke-virtual {v5}, LE5/J0;->p()Z

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
    iget-object v7, v3, LE5/q0;->b:Lf6/z;

    .line 83
    .line 84
    iget-object v12, v7, Lf6/x;->a:Ljava/lang/Object;

    .line 85
    .line 86
    const/16 v17, 0x2

    .line 87
    .line 88
    iget-object v11, v0, LE5/I;->n:LE5/H0;

    .line 89
    .line 90
    invoke-virtual {v5, v12, v11}, LE5/J0;->g(Ljava/lang/Object;LE5/H0;)LE5/H0;

    .line 91
    .line 92
    .line 93
    move-result-object v12

    .line 94
    iget v12, v12, LE5/H0;->c:I

    .line 95
    .line 96
    iget-object v8, v0, LA7/B0;->a:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v8, LE5/I0;

    .line 99
    .line 100
    invoke-virtual {v5, v12, v8, v13, v14}, LE5/J0;->m(ILE5/I0;J)LE5/I0;

    .line 101
    .line 102
    .line 103
    move-result-object v5

    .line 104
    iget-object v5, v5, LE5/I0;->a:Ljava/lang/Object;

    .line 105
    .line 106
    iget-object v12, v1, LE5/q0;->b:Lf6/z;

    .line 107
    .line 108
    const/16 v18, 0x0

    .line 109
    .line 110
    iget-object v15, v12, Lf6/x;->a:Ljava/lang/Object;

    .line 111
    .line 112
    invoke-virtual {v6, v15, v11}, LE5/J0;->g(Ljava/lang/Object;LE5/H0;)LE5/H0;

    .line 113
    .line 114
    .line 115
    move-result-object v11

    .line 116
    iget v11, v11, LE5/H0;->c:I

    .line 117
    .line 118
    invoke-virtual {v6, v11, v8, v13, v14}, LE5/J0;->m(ILE5/I0;J)LE5/I0;

    .line 119
    .line 120
    .line 121
    move-result-object v6

    .line 122
    iget-object v6, v6, LE5/I0;->a:Ljava/lang/Object;

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
    if-eqz p5, :cond_2

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
    if-eqz p5, :cond_3

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
    if-eqz p5, :cond_6

    .line 167
    .line 168
    if-nez v2, :cond_6

    .line 169
    .line 170
    iget-wide v5, v7, Lf6/x;->d:J

    .line 171
    .line 172
    iget-wide v7, v12, Lf6/x;->d:J

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
    if-eqz p5, :cond_7

    .line 191
    .line 192
    if-ne v2, v10, :cond_7

    .line 193
    .line 194
    if-eqz p10, :cond_7

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
    iget-object v7, v0, LE5/I;->P:LE5/f0;

    .line 232
    .line 233
    if-eqz v6, :cond_9

    .line 234
    .line 235
    iget-object v9, v1, LE5/q0;->a:LE5/J0;

    .line 236
    .line 237
    invoke-virtual {v9}, LE5/J0;->p()Z

    .line 238
    .line 239
    .line 240
    move-result v9

    .line 241
    if-nez v9, :cond_8

    .line 242
    .line 243
    iget-object v9, v1, LE5/q0;->a:LE5/J0;

    .line 244
    .line 245
    iget-object v11, v1, LE5/q0;->b:Lf6/z;

    .line 246
    .line 247
    iget-object v11, v11, Lf6/x;->a:Ljava/lang/Object;

    .line 248
    .line 249
    iget-object v12, v0, LE5/I;->n:LE5/H0;

    .line 250
    .line 251
    invoke-virtual {v9, v11, v12}, LE5/J0;->g(Ljava/lang/Object;LE5/H0;)LE5/H0;

    .line 252
    .line 253
    .line 254
    move-result-object v9

    .line 255
    iget v9, v9, LE5/H0;->c:I

    .line 256
    .line 257
    iget-object v11, v1, LE5/q0;->a:LE5/J0;

    .line 258
    .line 259
    iget-object v12, v0, LA7/B0;->a:Ljava/lang/Object;

    .line 260
    .line 261
    check-cast v12, LE5/I0;

    .line 262
    .line 263
    invoke-virtual {v11, v9, v12, v13, v14}, LE5/J0;->m(ILE5/I0;J)LE5/I0;

    .line 264
    .line 265
    .line 266
    move-result-object v9

    .line 267
    iget-object v9, v9, LE5/I0;->c:LE5/d0;

    .line 268
    .line 269
    goto :goto_3

    .line 270
    :cond_8
    const/4 v9, 0x0

    .line 271
    :goto_3
    sget-object v11, LE5/f0;->G:LE5/f0;

    .line 272
    .line 273
    iput-object v11, v0, LE5/I;->i0:LE5/f0;

    .line 274
    .line 275
    goto :goto_4

    .line 276
    :cond_9
    const/4 v9, 0x0

    .line 277
    :goto_4
    if-nez v6, :cond_a

    .line 278
    .line 279
    iget-object v11, v3, LE5/q0;->j:Ljava/util/List;

    .line 280
    .line 281
    iget-object v12, v1, LE5/q0;->j:Ljava/util/List;

    .line 282
    .line 283
    invoke-interface {v11, v12}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    .line 284
    .line 285
    .line 286
    move-result v11

    .line 287
    if-nez v11, :cond_d

    .line 288
    .line 289
    :cond_a
    iget-object v7, v0, LE5/I;->i0:LE5/f0;

    .line 290
    .line 291
    invoke-virtual {v7}, LE5/f0;->a()LE5/e0;

    .line 292
    .line 293
    .line 294
    move-result-object v7

    .line 295
    iget-object v11, v1, LE5/q0;->j:Ljava/util/List;

    .line 296
    .line 297
    move/from16 v12, v18

    .line 298
    .line 299
    :goto_5
    invoke-interface {v11}, Ljava/util/List;->size()I

    .line 300
    .line 301
    .line 302
    move-result v15

    .line 303
    if-ge v12, v15, :cond_c

    .line 304
    .line 305
    invoke-interface {v11, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 306
    .line 307
    .line 308
    move-result-object v15

    .line 309
    check-cast v15, LW5/c;

    .line 310
    .line 311
    move/from16 v8, v18

    .line 312
    .line 313
    :goto_6
    iget-object v10, v15, LW5/c;->a:[LW5/b;

    .line 314
    .line 315
    array-length v13, v10

    .line 316
    if-ge v8, v13, :cond_b

    .line 317
    .line 318
    aget-object v10, v10, v8

    .line 319
    .line 320
    invoke-interface {v10, v7}, LW5/b;->d(LE5/e0;)V

    .line 321
    .line 322
    .line 323
    add-int/lit8 v8, v8, 0x1

    .line 324
    .line 325
    const-wide/16 v13, 0x0

    .line 326
    .line 327
    goto :goto_6

    .line 328
    :cond_b
    add-int/lit8 v12, v12, 0x1

    .line 329
    .line 330
    const/4 v10, 0x1

    .line 331
    const-wide/16 v13, 0x0

    .line 332
    .line 333
    goto :goto_5

    .line 334
    :cond_c
    new-instance v8, LE5/f0;

    .line 335
    .line 336
    invoke-direct {v8, v7}, LE5/f0;-><init>(LE5/e0;)V

    .line 337
    .line 338
    .line 339
    iput-object v8, v0, LE5/I;->i0:LE5/f0;

    .line 340
    .line 341
    invoke-virtual {v0}, LE5/I;->e0()LE5/f0;

    .line 342
    .line 343
    .line 344
    move-result-object v7

    .line 345
    :cond_d
    iget-object v8, v0, LE5/I;->P:LE5/f0;

    .line 346
    .line 347
    invoke-virtual {v7, v8}, LE5/f0;->equals(Ljava/lang/Object;)Z

    .line 348
    .line 349
    .line 350
    move-result v8

    .line 351
    iput-object v7, v0, LE5/I;->P:LE5/f0;

    .line 352
    .line 353
    iget-boolean v7, v3, LE5/q0;->l:Z

    .line 354
    .line 355
    iget-boolean v10, v1, LE5/q0;->l:Z

    .line 356
    .line 357
    if-eq v7, v10, :cond_e

    .line 358
    .line 359
    const/4 v7, 0x1

    .line 360
    goto :goto_7

    .line 361
    :cond_e
    move/from16 v7, v18

    .line 362
    .line 363
    :goto_7
    iget v10, v3, LE5/q0;->e:I

    .line 364
    .line 365
    iget v11, v1, LE5/q0;->e:I

    .line 366
    .line 367
    if-eq v10, v11, :cond_f

    .line 368
    .line 369
    const/4 v10, 0x1

    .line 370
    goto :goto_8

    .line 371
    :cond_f
    move/from16 v10, v18

    .line 372
    .line 373
    :goto_8
    if-nez v10, :cond_10

    .line 374
    .line 375
    if-eqz v7, :cond_11

    .line 376
    .line 377
    :cond_10
    invoke-virtual {v0}, LE5/I;->P0()V

    .line 378
    .line 379
    .line 380
    :cond_11
    iget-boolean v11, v3, LE5/q0;->g:Z

    .line 381
    .line 382
    iget-boolean v12, v1, LE5/q0;->g:Z

    .line 383
    .line 384
    if-eq v11, v12, :cond_12

    .line 385
    .line 386
    const/4 v11, 0x1

    .line 387
    goto :goto_9

    .line 388
    :cond_12
    move/from16 v11, v18

    .line 389
    .line 390
    :goto_9
    if-nez v4, :cond_13

    .line 391
    .line 392
    iget-object v4, v0, LE5/I;->l:LK8/H;

    .line 393
    .line 394
    new-instance v12, LE5/w;

    .line 395
    .line 396
    const/4 v13, 0x0

    .line 397
    move/from16 v14, p2

    .line 398
    .line 399
    invoke-direct {v12, v1, v14, v13}, LE5/w;-><init>(LE5/q0;II)V

    .line 400
    .line 401
    .line 402
    move/from16 v13, v18

    .line 403
    .line 404
    invoke-virtual {v4, v13, v12}, LK8/H;->o(ILu6/g;)V

    .line 405
    .line 406
    .line 407
    :cond_13
    if-eqz p5, :cond_1b

    .line 408
    .line 409
    new-instance v4, LE5/H0;

    .line 410
    .line 411
    invoke-direct {v4}, LE5/H0;-><init>()V

    .line 412
    .line 413
    .line 414
    iget-object v12, v3, LE5/q0;->a:LE5/J0;

    .line 415
    .line 416
    invoke-virtual {v12}, LE5/J0;->p()Z

    .line 417
    .line 418
    .line 419
    move-result v12

    .line 420
    if-nez v12, :cond_14

    .line 421
    .line 422
    iget-object v12, v3, LE5/q0;->b:Lf6/z;

    .line 423
    .line 424
    iget-object v12, v12, Lf6/x;->a:Ljava/lang/Object;

    .line 425
    .line 426
    iget-object v13, v3, LE5/q0;->a:LE5/J0;

    .line 427
    .line 428
    invoke-virtual {v13, v12, v4}, LE5/J0;->g(Ljava/lang/Object;LE5/H0;)LE5/H0;

    .line 429
    .line 430
    .line 431
    iget v13, v4, LE5/H0;->c:I

    .line 432
    .line 433
    iget-object v14, v3, LE5/q0;->a:LE5/J0;

    .line 434
    .line 435
    invoke-virtual {v14, v12}, LE5/J0;->b(Ljava/lang/Object;)I

    .line 436
    .line 437
    .line 438
    move-result v14

    .line 439
    iget-object v15, v3, LE5/q0;->a:LE5/J0;

    .line 440
    .line 441
    move/from16 v18, v6

    .line 442
    .line 443
    iget-object v6, v0, LA7/B0;->a:Ljava/lang/Object;

    .line 444
    .line 445
    check-cast v6, LE5/I0;

    .line 446
    .line 447
    move/from16 v20, v7

    .line 448
    .line 449
    move/from16 v19, v8

    .line 450
    .line 451
    const-wide/16 v7, 0x0

    .line 452
    .line 453
    invoke-virtual {v15, v13, v6, v7, v8}, LE5/J0;->m(ILE5/I0;J)LE5/I0;

    .line 454
    .line 455
    .line 456
    move-result-object v6

    .line 457
    iget-object v6, v6, LE5/I0;->a:Ljava/lang/Object;

    .line 458
    .line 459
    iget-object v7, v0, LA7/B0;->a:Ljava/lang/Object;

    .line 460
    .line 461
    check-cast v7, LE5/I0;

    .line 462
    .line 463
    iget-object v7, v7, LE5/I0;->c:LE5/d0;

    .line 464
    .line 465
    move-object/from16 v22, v6

    .line 466
    .line 467
    move-object/from16 v24, v7

    .line 468
    .line 469
    move-object/from16 v25, v12

    .line 470
    .line 471
    move/from16 v23, v13

    .line 472
    .line 473
    move/from16 v26, v14

    .line 474
    .line 475
    goto :goto_a

    .line 476
    :cond_14
    move/from16 v18, v6

    .line 477
    .line 478
    move/from16 v20, v7

    .line 479
    .line 480
    move/from16 v19, v8

    .line 481
    .line 482
    move/from16 v23, p9

    .line 483
    .line 484
    const/16 v22, 0x0

    .line 485
    .line 486
    const/16 v24, 0x0

    .line 487
    .line 488
    const/16 v25, 0x0

    .line 489
    .line 490
    const/16 v26, -0x1

    .line 491
    .line 492
    :goto_a
    if-nez v2, :cond_17

    .line 493
    .line 494
    iget-object v6, v3, LE5/q0;->b:Lf6/z;

    .line 495
    .line 496
    invoke-virtual {v6}, Lf6/x;->a()Z

    .line 497
    .line 498
    .line 499
    move-result v6

    .line 500
    if-eqz v6, :cond_15

    .line 501
    .line 502
    iget-object v6, v3, LE5/q0;->b:Lf6/z;

    .line 503
    .line 504
    iget v7, v6, Lf6/x;->b:I

    .line 505
    .line 506
    iget v6, v6, Lf6/x;->c:I

    .line 507
    .line 508
    invoke-virtual {v4, v7, v6}, LE5/H0;->a(II)J

    .line 509
    .line 510
    .line 511
    move-result-wide v6

    .line 512
    invoke-static {v3}, LE5/I;->u0(LE5/q0;)J

    .line 513
    .line 514
    .line 515
    move-result-wide v12

    .line 516
    goto :goto_d

    .line 517
    :cond_15
    iget-object v6, v3, LE5/q0;->b:Lf6/z;

    .line 518
    .line 519
    iget v6, v6, Lf6/x;->e:I

    .line 520
    .line 521
    const/4 v7, -0x1

    .line 522
    if-eq v6, v7, :cond_16

    .line 523
    .line 524
    iget-object v4, v0, LE5/I;->j0:LE5/q0;

    .line 525
    .line 526
    invoke-static {v4}, LE5/I;->u0(LE5/q0;)J

    .line 527
    .line 528
    .line 529
    move-result-wide v6

    .line 530
    :goto_b
    move-wide v12, v6

    .line 531
    goto :goto_d

    .line 532
    :cond_16
    iget-wide v6, v4, LE5/H0;->e:J

    .line 533
    .line 534
    iget-wide v12, v4, LE5/H0;->d:J

    .line 535
    .line 536
    :goto_c
    add-long/2addr v6, v12

    .line 537
    goto :goto_b

    .line 538
    :cond_17
    iget-object v6, v3, LE5/q0;->b:Lf6/z;

    .line 539
    .line 540
    invoke-virtual {v6}, Lf6/x;->a()Z

    .line 541
    .line 542
    .line 543
    move-result v6

    .line 544
    if-eqz v6, :cond_18

    .line 545
    .line 546
    iget-wide v6, v3, LE5/q0;->r:J

    .line 547
    .line 548
    invoke-static {v3}, LE5/I;->u0(LE5/q0;)J

    .line 549
    .line 550
    .line 551
    move-result-wide v12

    .line 552
    goto :goto_d

    .line 553
    :cond_18
    iget-wide v6, v4, LE5/H0;->e:J

    .line 554
    .line 555
    iget-wide v12, v3, LE5/q0;->r:J

    .line 556
    .line 557
    goto :goto_c

    .line 558
    :goto_d
    new-instance v21, LE5/v0;

    .line 559
    .line 560
    invoke-static {v6, v7}, Lu6/v;->F(J)J

    .line 561
    .line 562
    .line 563
    move-result-wide v27

    .line 564
    invoke-static {v12, v13}, Lu6/v;->F(J)J

    .line 565
    .line 566
    .line 567
    move-result-wide v29

    .line 568
    iget-object v4, v3, LE5/q0;->b:Lf6/z;

    .line 569
    .line 570
    iget v6, v4, Lf6/x;->b:I

    .line 571
    .line 572
    iget v4, v4, Lf6/x;->c:I

    .line 573
    .line 574
    move/from16 v32, v4

    .line 575
    .line 576
    move/from16 v31, v6

    .line 577
    .line 578
    invoke-direct/range {v21 .. v32}, LE5/v0;-><init>(Ljava/lang/Object;ILE5/d0;Ljava/lang/Object;IJJII)V

    .line 579
    .line 580
    .line 581
    move-object/from16 v4, v21

    .line 582
    .line 583
    invoke-virtual {v0}, LE5/I;->l0()I

    .line 584
    .line 585
    .line 586
    move-result v6

    .line 587
    iget-object v7, v0, LE5/I;->j0:LE5/q0;

    .line 588
    .line 589
    iget-object v7, v7, LE5/q0;->a:LE5/J0;

    .line 590
    .line 591
    invoke-virtual {v7}, LE5/J0;->p()Z

    .line 592
    .line 593
    .line 594
    move-result v7

    .line 595
    if-nez v7, :cond_19

    .line 596
    .line 597
    iget-object v7, v0, LE5/I;->j0:LE5/q0;

    .line 598
    .line 599
    iget-object v8, v7, LE5/q0;->b:Lf6/z;

    .line 600
    .line 601
    iget-object v8, v8, Lf6/x;->a:Ljava/lang/Object;

    .line 602
    .line 603
    iget-object v7, v7, LE5/q0;->a:LE5/J0;

    .line 604
    .line 605
    iget-object v12, v0, LE5/I;->n:LE5/H0;

    .line 606
    .line 607
    invoke-virtual {v7, v8, v12}, LE5/J0;->g(Ljava/lang/Object;LE5/H0;)LE5/H0;

    .line 608
    .line 609
    .line 610
    iget-object v7, v0, LE5/I;->j0:LE5/q0;

    .line 611
    .line 612
    iget-object v7, v7, LE5/q0;->a:LE5/J0;

    .line 613
    .line 614
    invoke-virtual {v7, v8}, LE5/J0;->b(Ljava/lang/Object;)I

    .line 615
    .line 616
    .line 617
    move-result v7

    .line 618
    iget-object v12, v0, LE5/I;->j0:LE5/q0;

    .line 619
    .line 620
    iget-object v12, v12, LE5/q0;->a:LE5/J0;

    .line 621
    .line 622
    iget-object v13, v0, LA7/B0;->a:Ljava/lang/Object;

    .line 623
    .line 624
    check-cast v13, LE5/I0;

    .line 625
    .line 626
    const-wide/16 v14, 0x0

    .line 627
    .line 628
    invoke-virtual {v12, v6, v13, v14, v15}, LE5/J0;->m(ILE5/I0;J)LE5/I0;

    .line 629
    .line 630
    .line 631
    move-result-object v12

    .line 632
    iget-object v12, v12, LE5/I0;->a:Ljava/lang/Object;

    .line 633
    .line 634
    iget-object v13, v13, LE5/I0;->c:LE5/d0;

    .line 635
    .line 636
    move/from16 v26, v7

    .line 637
    .line 638
    move-object/from16 v25, v8

    .line 639
    .line 640
    move-object/from16 v22, v12

    .line 641
    .line 642
    move-object/from16 v24, v13

    .line 643
    .line 644
    goto :goto_e

    .line 645
    :cond_19
    const/16 v22, 0x0

    .line 646
    .line 647
    const/16 v24, 0x0

    .line 648
    .line 649
    const/16 v25, 0x0

    .line 650
    .line 651
    const/16 v26, -0x1

    .line 652
    .line 653
    :goto_e
    invoke-static/range {p7 .. p8}, Lu6/v;->F(J)J

    .line 654
    .line 655
    .line 656
    move-result-wide v27

    .line 657
    new-instance v21, LE5/v0;

    .line 658
    .line 659
    iget-object v7, v0, LE5/I;->j0:LE5/q0;

    .line 660
    .line 661
    iget-object v7, v7, LE5/q0;->b:Lf6/z;

    .line 662
    .line 663
    invoke-virtual {v7}, Lf6/x;->a()Z

    .line 664
    .line 665
    .line 666
    move-result v7

    .line 667
    if-eqz v7, :cond_1a

    .line 668
    .line 669
    iget-object v7, v0, LE5/I;->j0:LE5/q0;

    .line 670
    .line 671
    invoke-static {v7}, LE5/I;->u0(LE5/q0;)J

    .line 672
    .line 673
    .line 674
    move-result-wide v7

    .line 675
    invoke-static {v7, v8}, Lu6/v;->F(J)J

    .line 676
    .line 677
    .line 678
    move-result-wide v7

    .line 679
    move-wide/from16 v29, v7

    .line 680
    .line 681
    goto :goto_f

    .line 682
    :cond_1a
    move-wide/from16 v29, v27

    .line 683
    .line 684
    :goto_f
    iget-object v7, v0, LE5/I;->j0:LE5/q0;

    .line 685
    .line 686
    iget-object v7, v7, LE5/q0;->b:Lf6/z;

    .line 687
    .line 688
    iget v8, v7, Lf6/x;->b:I

    .line 689
    .line 690
    iget v7, v7, Lf6/x;->c:I

    .line 691
    .line 692
    move/from16 v23, v6

    .line 693
    .line 694
    move/from16 v32, v7

    .line 695
    .line 696
    move/from16 v31, v8

    .line 697
    .line 698
    invoke-direct/range {v21 .. v32}, LE5/v0;-><init>(Ljava/lang/Object;ILE5/d0;Ljava/lang/Object;IJJII)V

    .line 699
    .line 700
    .line 701
    move-object/from16 v6, v21

    .line 702
    .line 703
    iget-object v7, v0, LE5/I;->l:LK8/H;

    .line 704
    .line 705
    new-instance v8, LE5/z;

    .line 706
    .line 707
    const/4 v12, 0x0

    .line 708
    invoke-direct {v8, v4, v2, v12, v6}, LE5/z;-><init>(Ljava/lang/Object;IILjava/lang/Object;)V

    .line 709
    .line 710
    .line 711
    const/16 v2, 0xb

    .line 712
    .line 713
    invoke-virtual {v7, v2, v8}, LK8/H;->o(ILu6/g;)V

    .line 714
    .line 715
    .line 716
    goto :goto_10

    .line 717
    :cond_1b
    move/from16 v18, v6

    .line 718
    .line 719
    move/from16 v20, v7

    .line 720
    .line 721
    move/from16 v19, v8

    .line 722
    .line 723
    :goto_10
    if-eqz v18, :cond_1c

    .line 724
    .line 725
    iget-object v2, v0, LE5/I;->l:LK8/H;

    .line 726
    .line 727
    new-instance v4, LE5/A;

    .line 728
    .line 729
    const/4 v6, 0x0

    .line 730
    invoke-direct {v4, v9, v5, v6}, LE5/A;-><init>(Ljava/lang/Object;II)V

    .line 731
    .line 732
    .line 733
    const/4 v5, 0x1

    .line 734
    invoke-virtual {v2, v5, v4}, LK8/H;->o(ILu6/g;)V

    .line 735
    .line 736
    .line 737
    :cond_1c
    iget-object v2, v3, LE5/q0;->f:LE5/o;

    .line 738
    .line 739
    iget-object v4, v1, LE5/q0;->f:LE5/o;

    .line 740
    .line 741
    if-eq v2, v4, :cond_1d

    .line 742
    .line 743
    iget-object v2, v0, LE5/I;->l:LK8/H;

    .line 744
    .line 745
    new-instance v4, LE5/s;

    .line 746
    .line 747
    const/16 v5, 0x8

    .line 748
    .line 749
    invoke-direct {v4, v1, v5}, LE5/s;-><init>(LE5/q0;I)V

    .line 750
    .line 751
    .line 752
    const/16 v5, 0xa

    .line 753
    .line 754
    invoke-virtual {v2, v5, v4}, LK8/H;->o(ILu6/g;)V

    .line 755
    .line 756
    .line 757
    iget-object v2, v1, LE5/q0;->f:LE5/o;

    .line 758
    .line 759
    if-eqz v2, :cond_1d

    .line 760
    .line 761
    iget-object v2, v0, LE5/I;->l:LK8/H;

    .line 762
    .line 763
    new-instance v4, LE5/s;

    .line 764
    .line 765
    const/4 v6, 0x0

    .line 766
    invoke-direct {v4, v1, v6}, LE5/s;-><init>(LE5/q0;I)V

    .line 767
    .line 768
    .line 769
    invoke-virtual {v2, v5, v4}, LK8/H;->o(ILu6/g;)V

    .line 770
    .line 771
    .line 772
    :cond_1d
    iget-object v2, v3, LE5/q0;->i:Lr6/s;

    .line 773
    .line 774
    iget-object v4, v1, LE5/q0;->i:Lr6/s;

    .line 775
    .line 776
    if-eq v2, v4, :cond_1e

    .line 777
    .line 778
    iget-object v2, v0, LE5/I;->h:Lr6/o;

    .line 779
    .line 780
    iget-object v4, v4, Lr6/s;->e:LR1/q;

    .line 781
    .line 782
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 783
    .line 784
    .line 785
    iget-object v2, v0, LE5/I;->l:LK8/H;

    .line 786
    .line 787
    new-instance v4, LE5/s;

    .line 788
    .line 789
    const/4 v5, 0x1

    .line 790
    invoke-direct {v4, v1, v5}, LE5/s;-><init>(LE5/q0;I)V

    .line 791
    .line 792
    .line 793
    move/from16 v5, v17

    .line 794
    .line 795
    invoke-virtual {v2, v5, v4}, LK8/H;->o(ILu6/g;)V

    .line 796
    .line 797
    .line 798
    :cond_1e
    if-nez v19, :cond_1f

    .line 799
    .line 800
    iget-object v2, v0, LE5/I;->P:LE5/f0;

    .line 801
    .line 802
    iget-object v4, v0, LE5/I;->l:LK8/H;

    .line 803
    .line 804
    new-instance v5, LB8/b;

    .line 805
    .line 806
    const/4 v6, 0x4

    .line 807
    invoke-direct {v5, v2, v6}, LB8/b;-><init>(Ljava/lang/Object;I)V

    .line 808
    .line 809
    .line 810
    const/16 v2, 0xe

    .line 811
    .line 812
    invoke-virtual {v4, v2, v5}, LK8/H;->o(ILu6/g;)V

    .line 813
    .line 814
    .line 815
    :cond_1f
    if-eqz v11, :cond_20

    .line 816
    .line 817
    iget-object v2, v0, LE5/I;->l:LK8/H;

    .line 818
    .line 819
    new-instance v4, LE5/s;

    .line 820
    .line 821
    const/4 v5, 0x2

    .line 822
    invoke-direct {v4, v1, v5}, LE5/s;-><init>(LE5/q0;I)V

    .line 823
    .line 824
    .line 825
    move/from16 v5, v16

    .line 826
    .line 827
    invoke-virtual {v2, v5, v4}, LK8/H;->o(ILu6/g;)V

    .line 828
    .line 829
    .line 830
    :cond_20
    if-nez v10, :cond_21

    .line 831
    .line 832
    if-eqz v20, :cond_22

    .line 833
    .line 834
    :cond_21
    iget-object v2, v0, LE5/I;->l:LK8/H;

    .line 835
    .line 836
    new-instance v4, LE5/s;

    .line 837
    .line 838
    const/4 v5, 0x3

    .line 839
    invoke-direct {v4, v1, v5}, LE5/s;-><init>(LE5/q0;I)V

    .line 840
    .line 841
    .line 842
    const/4 v7, -0x1

    .line 843
    invoke-virtual {v2, v7, v4}, LK8/H;->o(ILu6/g;)V

    .line 844
    .line 845
    .line 846
    :cond_22
    if-eqz v10, :cond_23

    .line 847
    .line 848
    iget-object v2, v0, LE5/I;->l:LK8/H;

    .line 849
    .line 850
    new-instance v4, LE5/s;

    .line 851
    .line 852
    const/4 v5, 0x4

    .line 853
    invoke-direct {v4, v1, v5}, LE5/s;-><init>(LE5/q0;I)V

    .line 854
    .line 855
    .line 856
    invoke-virtual {v2, v5, v4}, LK8/H;->o(ILu6/g;)V

    .line 857
    .line 858
    .line 859
    :cond_23
    if-eqz v20, :cond_24

    .line 860
    .line 861
    iget-object v2, v0, LE5/I;->l:LK8/H;

    .line 862
    .line 863
    new-instance v4, LE5/w;

    .line 864
    .line 865
    const/4 v5, 0x1

    .line 866
    move/from16 v6, p3

    .line 867
    .line 868
    invoke-direct {v4, v1, v6, v5}, LE5/w;-><init>(LE5/q0;II)V

    .line 869
    .line 870
    .line 871
    const/4 v5, 0x5

    .line 872
    invoke-virtual {v2, v5, v4}, LK8/H;->o(ILu6/g;)V

    .line 873
    .line 874
    .line 875
    :cond_24
    iget v2, v3, LE5/q0;->m:I

    .line 876
    .line 877
    iget v4, v1, LE5/q0;->m:I

    .line 878
    .line 879
    if-eq v2, v4, :cond_25

    .line 880
    .line 881
    iget-object v2, v0, LE5/I;->l:LK8/H;

    .line 882
    .line 883
    new-instance v4, LE5/s;

    .line 884
    .line 885
    const/4 v5, 0x5

    .line 886
    invoke-direct {v4, v1, v5}, LE5/s;-><init>(LE5/q0;I)V

    .line 887
    .line 888
    .line 889
    const/4 v5, 0x6

    .line 890
    invoke-virtual {v2, v5, v4}, LK8/H;->o(ILu6/g;)V

    .line 891
    .line 892
    .line 893
    :cond_25
    invoke-static {v3}, LE5/I;->w0(LE5/q0;)Z

    .line 894
    .line 895
    .line 896
    move-result v2

    .line 897
    invoke-static {v1}, LE5/I;->w0(LE5/q0;)Z

    .line 898
    .line 899
    .line 900
    move-result v4

    .line 901
    if-eq v2, v4, :cond_26

    .line 902
    .line 903
    iget-object v2, v0, LE5/I;->l:LK8/H;

    .line 904
    .line 905
    new-instance v4, LE5/s;

    .line 906
    .line 907
    const/4 v5, 0x6

    .line 908
    invoke-direct {v4, v1, v5}, LE5/s;-><init>(LE5/q0;I)V

    .line 909
    .line 910
    .line 911
    const/4 v5, 0x7

    .line 912
    invoke-virtual {v2, v5, v4}, LK8/H;->o(ILu6/g;)V

    .line 913
    .line 914
    .line 915
    :cond_26
    iget-object v2, v3, LE5/q0;->n:LE5/r0;

    .line 916
    .line 917
    iget-object v4, v1, LE5/q0;->n:LE5/r0;

    .line 918
    .line 919
    invoke-virtual {v2, v4}, LE5/r0;->equals(Ljava/lang/Object;)Z

    .line 920
    .line 921
    .line 922
    move-result v2

    .line 923
    if-nez v2, :cond_27

    .line 924
    .line 925
    iget-object v2, v0, LE5/I;->l:LK8/H;

    .line 926
    .line 927
    new-instance v4, LE5/s;

    .line 928
    .line 929
    const/4 v5, 0x7

    .line 930
    invoke-direct {v4, v1, v5}, LE5/s;-><init>(LE5/q0;I)V

    .line 931
    .line 932
    .line 933
    const/16 v5, 0xc

    .line 934
    .line 935
    invoke-virtual {v2, v5, v4}, LK8/H;->o(ILu6/g;)V

    .line 936
    .line 937
    .line 938
    :cond_27
    if-eqz p4, :cond_28

    .line 939
    .line 940
    iget-object v2, v0, LE5/I;->l:LK8/H;

    .line 941
    .line 942
    new-instance v4, LA5/f;

    .line 943
    .line 944
    const/4 v5, 0x5

    .line 945
    invoke-direct {v4, v5}, LA5/f;-><init>(I)V

    .line 946
    .line 947
    .line 948
    const/4 v7, -0x1

    .line 949
    invoke-virtual {v2, v7, v4}, LK8/H;->o(ILu6/g;)V

    .line 950
    .line 951
    .line 952
    :cond_28
    invoke-virtual {v0}, LE5/I;->M0()V

    .line 953
    .line 954
    .line 955
    iget-object v2, v0, LE5/I;->l:LK8/H;

    .line 956
    .line 957
    invoke-virtual {v2}, LK8/H;->m()V

    .line 958
    .line 959
    .line 960
    iget-boolean v2, v3, LE5/q0;->o:Z

    .line 961
    .line 962
    iget-boolean v1, v1, LE5/q0;->o:Z

    .line 963
    .line 964
    if-eq v2, v1, :cond_29

    .line 965
    .line 966
    iget-object v1, v0, LE5/I;->m:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 967
    .line 968
    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    .line 969
    .line 970
    .line 971
    move-result-object v1

    .line 972
    :goto_11
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 973
    .line 974
    .line 975
    move-result v2

    .line 976
    if-eqz v2, :cond_29

    .line 977
    .line 978
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 979
    .line 980
    .line 981
    move-result-object v2

    .line 982
    check-cast v2, LE5/F;

    .line 983
    .line 984
    iget-object v2, v2, LE5/F;->a:LE5/I;

    .line 985
    .line 986
    invoke-virtual {v2}, LE5/I;->P0()V

    .line 987
    .line 988
    .line 989
    goto :goto_11

    .line 990
    :cond_29
    return-void
.end method

.method public final P0()V
    .locals 4

    .line 1
    invoke-virtual {p0}, LE5/I;->t0()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, LE5/I;->D:Lya/b;

    .line 6
    .line 7
    iget-object v2, p0, LE5/I;->C:Lx9/d;

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
    invoke-virtual {p0}, LE5/I;->Q0()V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, LE5/I;->j0:LE5/q0;

    .line 32
    .line 33
    iget-boolean v0, v0, LE5/q0;->o:Z

    .line 34
    .line 35
    invoke-virtual {p0}, LE5/I;->s0()Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0}, LE5/I;->s0()Z

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    return-void

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
    return-void
.end method

.method public final Q0()V
    .locals 6

    .line 1
    iget-object v0, p0, LE5/I;->d:Ls8/b;

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
    iget-object v1, p0, LE5/I;->s:Landroid/os/Looper;

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
    iget-object v1, p0, LE5/I;->s:Landroid/os/Looper;

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
    sget v2, Lu6/v;->a:I

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
    const-string v5, "\'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread"

    .line 67
    .line 68
    invoke-static {v2, v0, v4, v1, v5}, LR8/v;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    iget-boolean v1, p0, LE5/I;->e0:Z

    .line 73
    .line 74
    if-nez v1, :cond_3

    .line 75
    .line 76
    const-string v1, "ExoPlayerImpl"

    .line 77
    .line 78
    iget-boolean v2, p0, LE5/I;->f0:Z

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
    invoke-static {v2, v1, v0}, Lu6/a;->D(Ljava/lang/Exception;Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    iput-boolean v3, p0, LE5/I;->f0:Z

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

.method public final e0()LE5/f0;
    .locals 5

    .line 1
    invoke-virtual {p0}, LE5/I;->o0()LE5/J0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LE5/J0;->p()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, LE5/I;->i0:LE5/f0;

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    invoke-virtual {p0}, LE5/I;->l0()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const-wide/16 v2, 0x0

    .line 19
    .line 20
    iget-object v4, p0, LA7/B0;->a:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v4, LE5/I0;

    .line 23
    .line 24
    invoke-virtual {v0, v1, v4, v2, v3}, LE5/J0;->m(ILE5/I0;J)LE5/I0;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iget-object v0, v0, LE5/I0;->c:LE5/d0;

    .line 29
    .line 30
    iget-object v1, p0, LE5/I;->i0:LE5/f0;

    .line 31
    .line 32
    invoke-virtual {v1}, LE5/f0;->a()LE5/e0;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    iget-object v0, v0, LE5/d0;->d:LE5/f0;

    .line 37
    .line 38
    if-nez v0, :cond_1

    .line 39
    .line 40
    goto/16 :goto_0

    .line 41
    .line 42
    :cond_1
    iget-object v2, v0, LE5/f0;->a:Ljava/lang/CharSequence;

    .line 43
    .line 44
    if-eqz v2, :cond_2

    .line 45
    .line 46
    iput-object v2, v1, LE5/e0;->a:Ljava/lang/CharSequence;

    .line 47
    .line 48
    :cond_2
    iget-object v2, v0, LE5/f0;->b:Ljava/lang/CharSequence;

    .line 49
    .line 50
    if-eqz v2, :cond_3

    .line 51
    .line 52
    iput-object v2, v1, LE5/e0;->b:Ljava/lang/CharSequence;

    .line 53
    .line 54
    :cond_3
    iget-object v2, v0, LE5/f0;->c:Ljava/lang/CharSequence;

    .line 55
    .line 56
    if-eqz v2, :cond_4

    .line 57
    .line 58
    iput-object v2, v1, LE5/e0;->c:Ljava/lang/CharSequence;

    .line 59
    .line 60
    :cond_4
    iget-object v2, v0, LE5/f0;->d:Ljava/lang/CharSequence;

    .line 61
    .line 62
    if-eqz v2, :cond_5

    .line 63
    .line 64
    iput-object v2, v1, LE5/e0;->d:Ljava/lang/CharSequence;

    .line 65
    .line 66
    :cond_5
    iget-object v2, v0, LE5/f0;->e:Ljava/lang/CharSequence;

    .line 67
    .line 68
    if-eqz v2, :cond_6

    .line 69
    .line 70
    iput-object v2, v1, LE5/e0;->e:Ljava/lang/CharSequence;

    .line 71
    .line 72
    :cond_6
    iget-object v2, v0, LE5/f0;->f:Ljava/lang/CharSequence;

    .line 73
    .line 74
    if-eqz v2, :cond_7

    .line 75
    .line 76
    iput-object v2, v1, LE5/e0;->f:Ljava/lang/CharSequence;

    .line 77
    .line 78
    :cond_7
    iget-object v2, v0, LE5/f0;->g:Ljava/lang/CharSequence;

    .line 79
    .line 80
    if-eqz v2, :cond_8

    .line 81
    .line 82
    iput-object v2, v1, LE5/e0;->g:Ljava/lang/CharSequence;

    .line 83
    .line 84
    :cond_8
    iget-object v2, v0, LE5/f0;->h:LE5/A0;

    .line 85
    .line 86
    if-eqz v2, :cond_9

    .line 87
    .line 88
    iput-object v2, v1, LE5/e0;->h:LE5/A0;

    .line 89
    .line 90
    :cond_9
    iget-object v2, v0, LE5/f0;->i:LE5/A0;

    .line 91
    .line 92
    if-eqz v2, :cond_a

    .line 93
    .line 94
    iput-object v2, v1, LE5/e0;->i:LE5/A0;

    .line 95
    .line 96
    :cond_a
    iget-object v2, v0, LE5/f0;->j:[B

    .line 97
    .line 98
    if-eqz v2, :cond_b

    .line 99
    .line 100
    invoke-virtual {v2}, [B->clone()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    check-cast v2, [B

    .line 105
    .line 106
    iput-object v2, v1, LE5/e0;->j:[B

    .line 107
    .line 108
    iget-object v2, v0, LE5/f0;->k:Ljava/lang/Integer;

    .line 109
    .line 110
    iput-object v2, v1, LE5/e0;->k:Ljava/lang/Integer;

    .line 111
    .line 112
    :cond_b
    iget-object v2, v0, LE5/f0;->l:Landroid/net/Uri;

    .line 113
    .line 114
    if-eqz v2, :cond_c

    .line 115
    .line 116
    iput-object v2, v1, LE5/e0;->l:Landroid/net/Uri;

    .line 117
    .line 118
    :cond_c
    iget-object v2, v0, LE5/f0;->m:Ljava/lang/Integer;

    .line 119
    .line 120
    if-eqz v2, :cond_d

    .line 121
    .line 122
    iput-object v2, v1, LE5/e0;->m:Ljava/lang/Integer;

    .line 123
    .line 124
    :cond_d
    iget-object v2, v0, LE5/f0;->n:Ljava/lang/Integer;

    .line 125
    .line 126
    if-eqz v2, :cond_e

    .line 127
    .line 128
    iput-object v2, v1, LE5/e0;->n:Ljava/lang/Integer;

    .line 129
    .line 130
    :cond_e
    iget-object v2, v0, LE5/f0;->o:Ljava/lang/Integer;

    .line 131
    .line 132
    if-eqz v2, :cond_f

    .line 133
    .line 134
    iput-object v2, v1, LE5/e0;->o:Ljava/lang/Integer;

    .line 135
    .line 136
    :cond_f
    iget-object v2, v0, LE5/f0;->p:Ljava/lang/Boolean;

    .line 137
    .line 138
    if-eqz v2, :cond_10

    .line 139
    .line 140
    iput-object v2, v1, LE5/e0;->p:Ljava/lang/Boolean;

    .line 141
    .line 142
    :cond_10
    iget-object v2, v0, LE5/f0;->q:Ljava/lang/Integer;

    .line 143
    .line 144
    if-eqz v2, :cond_11

    .line 145
    .line 146
    iput-object v2, v1, LE5/e0;->q:Ljava/lang/Integer;

    .line 147
    .line 148
    :cond_11
    iget-object v2, v0, LE5/f0;->r:Ljava/lang/Integer;

    .line 149
    .line 150
    if-eqz v2, :cond_12

    .line 151
    .line 152
    iput-object v2, v1, LE5/e0;->q:Ljava/lang/Integer;

    .line 153
    .line 154
    :cond_12
    iget-object v2, v0, LE5/f0;->s:Ljava/lang/Integer;

    .line 155
    .line 156
    if-eqz v2, :cond_13

    .line 157
    .line 158
    iput-object v2, v1, LE5/e0;->r:Ljava/lang/Integer;

    .line 159
    .line 160
    :cond_13
    iget-object v2, v0, LE5/f0;->t:Ljava/lang/Integer;

    .line 161
    .line 162
    if-eqz v2, :cond_14

    .line 163
    .line 164
    iput-object v2, v1, LE5/e0;->s:Ljava/lang/Integer;

    .line 165
    .line 166
    :cond_14
    iget-object v2, v0, LE5/f0;->u:Ljava/lang/Integer;

    .line 167
    .line 168
    if-eqz v2, :cond_15

    .line 169
    .line 170
    iput-object v2, v1, LE5/e0;->t:Ljava/lang/Integer;

    .line 171
    .line 172
    :cond_15
    iget-object v2, v0, LE5/f0;->v:Ljava/lang/Integer;

    .line 173
    .line 174
    if-eqz v2, :cond_16

    .line 175
    .line 176
    iput-object v2, v1, LE5/e0;->u:Ljava/lang/Integer;

    .line 177
    .line 178
    :cond_16
    iget-object v2, v0, LE5/f0;->w:Ljava/lang/Integer;

    .line 179
    .line 180
    if-eqz v2, :cond_17

    .line 181
    .line 182
    iput-object v2, v1, LE5/e0;->v:Ljava/lang/Integer;

    .line 183
    .line 184
    :cond_17
    iget-object v2, v0, LE5/f0;->x:Ljava/lang/CharSequence;

    .line 185
    .line 186
    if-eqz v2, :cond_18

    .line 187
    .line 188
    iput-object v2, v1, LE5/e0;->w:Ljava/lang/CharSequence;

    .line 189
    .line 190
    :cond_18
    iget-object v2, v0, LE5/f0;->y:Ljava/lang/CharSequence;

    .line 191
    .line 192
    if-eqz v2, :cond_19

    .line 193
    .line 194
    iput-object v2, v1, LE5/e0;->x:Ljava/lang/CharSequence;

    .line 195
    .line 196
    :cond_19
    iget-object v2, v0, LE5/f0;->z:Ljava/lang/CharSequence;

    .line 197
    .line 198
    if-eqz v2, :cond_1a

    .line 199
    .line 200
    iput-object v2, v1, LE5/e0;->y:Ljava/lang/CharSequence;

    .line 201
    .line 202
    :cond_1a
    iget-object v2, v0, LE5/f0;->A:Ljava/lang/Integer;

    .line 203
    .line 204
    if-eqz v2, :cond_1b

    .line 205
    .line 206
    iput-object v2, v1, LE5/e0;->z:Ljava/lang/Integer;

    .line 207
    .line 208
    :cond_1b
    iget-object v2, v0, LE5/f0;->B:Ljava/lang/Integer;

    .line 209
    .line 210
    if-eqz v2, :cond_1c

    .line 211
    .line 212
    iput-object v2, v1, LE5/e0;->A:Ljava/lang/Integer;

    .line 213
    .line 214
    :cond_1c
    iget-object v2, v0, LE5/f0;->C:Ljava/lang/CharSequence;

    .line 215
    .line 216
    if-eqz v2, :cond_1d

    .line 217
    .line 218
    iput-object v2, v1, LE5/e0;->B:Ljava/lang/CharSequence;

    .line 219
    .line 220
    :cond_1d
    iget-object v2, v0, LE5/f0;->D:Ljava/lang/CharSequence;

    .line 221
    .line 222
    if-eqz v2, :cond_1e

    .line 223
    .line 224
    iput-object v2, v1, LE5/e0;->C:Ljava/lang/CharSequence;

    .line 225
    .line 226
    :cond_1e
    iget-object v2, v0, LE5/f0;->E:Ljava/lang/CharSequence;

    .line 227
    .line 228
    if-eqz v2, :cond_1f

    .line 229
    .line 230
    iput-object v2, v1, LE5/e0;->D:Ljava/lang/CharSequence;

    .line 231
    .line 232
    :cond_1f
    iget-object v0, v0, LE5/f0;->F:Landroid/os/Bundle;

    .line 233
    .line 234
    if-eqz v0, :cond_20

    .line 235
    .line 236
    iput-object v0, v1, LE5/e0;->E:Landroid/os/Bundle;

    .line 237
    .line 238
    :cond_20
    :goto_0
    new-instance v0, LE5/f0;

    .line 239
    .line 240
    invoke-direct {v0, v1}, LE5/f0;-><init>(LE5/e0;)V

    .line 241
    .line 242
    .line 243
    return-object v0
.end method

.method public final f0()V
    .locals 1

    .line 1
    invoke-virtual {p0}, LE5/I;->Q0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LE5/I;->D0()V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-virtual {p0, v0}, LE5/I;->L0(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-virtual {p0, v0, v0}, LE5/I;->A0(II)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final h0(LE5/x0;)LE5/y0;
    .locals 8

    .line 1
    invoke-virtual {p0}, LE5/I;->q0()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    new-instance v1, LE5/y0;

    .line 6
    .line 7
    iget-object v2, p0, LE5/I;->j0:LE5/q0;

    .line 8
    .line 9
    iget-object v4, v2, LE5/q0;->a:LE5/J0;

    .line 10
    .line 11
    const/4 v2, -0x1

    .line 12
    if-ne v0, v2, :cond_0

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    :cond_0
    move v5, v0

    .line 16
    iget-object v2, p0, LE5/I;->k:LE5/O;

    .line 17
    .line 18
    iget-object v7, v2, LE5/O;->j:Landroid/os/Looper;

    .line 19
    .line 20
    iget-object v6, p0, LE5/I;->w:Lu6/q;

    .line 21
    .line 22
    move-object v3, p1

    .line 23
    invoke-direct/range {v1 .. v7}, LE5/y0;-><init>(LE5/O;LE5/x0;LE5/J0;ILu6/q;Landroid/os/Looper;)V

    .line 24
    .line 25
    .line 26
    return-object v1
.end method

.method public final i0()J
    .locals 7

    .line 1
    invoke-virtual {p0}, LE5/I;->Q0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LE5/I;->x0()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    iget-object v0, p0, LE5/I;->j0:LE5/q0;

    .line 11
    .line 12
    iget-object v1, v0, LE5/q0;->a:LE5/J0;

    .line 13
    .line 14
    iget-object v0, v0, LE5/q0;->b:Lf6/z;

    .line 15
    .line 16
    iget-object v0, v0, Lf6/x;->a:Ljava/lang/Object;

    .line 17
    .line 18
    iget-object v2, p0, LE5/I;->n:LE5/H0;

    .line 19
    .line 20
    invoke-virtual {v1, v0, v2}, LE5/J0;->g(Ljava/lang/Object;LE5/H0;)LE5/H0;

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, LE5/I;->j0:LE5/q0;

    .line 24
    .line 25
    iget-wide v3, v0, LE5/q0;->c:J

    .line 26
    .line 27
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    cmp-long v1, v3, v5

    .line 33
    .line 34
    if-nez v1, :cond_0

    .line 35
    .line 36
    iget-object v0, v0, LE5/q0;->a:LE5/J0;

    .line 37
    .line 38
    invoke-virtual {p0}, LE5/I;->l0()I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    const-wide/16 v2, 0x0

    .line 43
    .line 44
    iget-object v4, p0, LA7/B0;->a:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v4, LE5/I0;

    .line 47
    .line 48
    invoke-virtual {v0, v1, v4, v2, v3}, LE5/J0;->m(ILE5/I0;J)LE5/I0;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    iget-wide v0, v0, LE5/I0;->l:J

    .line 53
    .line 54
    invoke-static {v0, v1}, Lu6/v;->F(J)J

    .line 55
    .line 56
    .line 57
    move-result-wide v0

    .line 58
    return-wide v0

    .line 59
    :cond_0
    iget-wide v0, v2, LE5/H0;->e:J

    .line 60
    .line 61
    invoke-static {v0, v1}, Lu6/v;->F(J)J

    .line 62
    .line 63
    .line 64
    move-result-wide v0

    .line 65
    iget-object v2, p0, LE5/I;->j0:LE5/q0;

    .line 66
    .line 67
    iget-wide v2, v2, LE5/q0;->c:J

    .line 68
    .line 69
    invoke-static {v2, v3}, Lu6/v;->F(J)J

    .line 70
    .line 71
    .line 72
    move-result-wide v2

    .line 73
    add-long/2addr v2, v0

    .line 74
    return-wide v2

    .line 75
    :cond_1
    invoke-virtual {p0}, LE5/I;->m0()J

    .line 76
    .line 77
    .line 78
    move-result-wide v0

    .line 79
    return-wide v0
.end method

.method public final j0()I
    .locals 1

    .line 1
    invoke-virtual {p0}, LE5/I;->Q0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LE5/I;->x0()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, LE5/I;->j0:LE5/q0;

    .line 11
    .line 12
    iget-object v0, v0, LE5/q0;->b:Lf6/z;

    .line 13
    .line 14
    iget v0, v0, Lf6/x;->b:I

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
    invoke-virtual {p0}, LE5/I;->Q0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LE5/I;->x0()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, LE5/I;->j0:LE5/q0;

    .line 11
    .line 12
    iget-object v0, v0, LE5/q0;->b:Lf6/z;

    .line 13
    .line 14
    iget v0, v0, Lf6/x;->c:I

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
    invoke-virtual {p0}, LE5/I;->Q0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LE5/I;->q0()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v1, -0x1

    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    :cond_0
    return v0
.end method

.method public final m0()J
    .locals 2

    .line 1
    invoke-virtual {p0}, LE5/I;->Q0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LE5/I;->j0:LE5/q0;

    .line 5
    .line 6
    invoke-virtual {p0, v0}, LE5/I;->n0(LE5/q0;)J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    invoke-static {v0, v1}, Lu6/v;->F(J)J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    return-wide v0
.end method

.method public final n0(LE5/q0;)J
    .locals 4

    .line 1
    iget-object v0, p1, LE5/q0;->a:LE5/J0;

    .line 2
    .line 3
    invoke-virtual {v0}, LE5/J0;->p()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-wide v0, p0, LE5/I;->l0:J

    .line 10
    .line 11
    invoke-static {v0, v1}, Lu6/v;->y(J)J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    return-wide v0

    .line 16
    :cond_0
    iget-object v0, p1, LE5/q0;->b:Lf6/z;

    .line 17
    .line 18
    invoke-virtual {v0}, Lf6/x;->a()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    iget-wide v0, p1, LE5/q0;->r:J

    .line 25
    .line 26
    return-wide v0

    .line 27
    :cond_1
    iget-object v0, p1, LE5/q0;->a:LE5/J0;

    .line 28
    .line 29
    iget-object v1, p1, LE5/q0;->b:Lf6/z;

    .line 30
    .line 31
    iget-wide v2, p1, LE5/q0;->r:J

    .line 32
    .line 33
    iget-object p1, v1, Lf6/x;->a:Ljava/lang/Object;

    .line 34
    .line 35
    iget-object v1, p0, LE5/I;->n:LE5/H0;

    .line 36
    .line 37
    invoke-virtual {v0, p1, v1}, LE5/J0;->g(Ljava/lang/Object;LE5/H0;)LE5/H0;

    .line 38
    .line 39
    .line 40
    iget-wide v0, v1, LE5/H0;->e:J

    .line 41
    .line 42
    add-long/2addr v2, v0

    .line 43
    return-wide v2
.end method

.method public final o0()LE5/J0;
    .locals 1

    .line 1
    invoke-virtual {p0}, LE5/I;->Q0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LE5/I;->j0:LE5/q0;

    .line 5
    .line 6
    iget-object v0, v0, LE5/q0;->a:LE5/J0;

    .line 7
    .line 8
    return-object v0
.end method

.method public final p0()LE5/L0;
    .locals 1

    .line 1
    invoke-virtual {p0}, LE5/I;->Q0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LE5/I;->j0:LE5/q0;

    .line 5
    .line 6
    iget-object v0, v0, LE5/q0;->i:Lr6/s;

    .line 7
    .line 8
    iget-object v0, v0, Lr6/s;->d:LE5/L0;

    .line 9
    .line 10
    return-object v0
.end method

.method public final q0()I
    .locals 3

    .line 1
    iget-object v0, p0, LE5/I;->j0:LE5/q0;

    .line 2
    .line 3
    iget-object v0, v0, LE5/q0;->a:LE5/J0;

    .line 4
    .line 5
    invoke-virtual {v0}, LE5/J0;->p()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget v0, p0, LE5/I;->k0:I

    .line 12
    .line 13
    return v0

    .line 14
    :cond_0
    iget-object v0, p0, LE5/I;->j0:LE5/q0;

    .line 15
    .line 16
    iget-object v1, v0, LE5/q0;->a:LE5/J0;

    .line 17
    .line 18
    iget-object v0, v0, LE5/q0;->b:Lf6/z;

    .line 19
    .line 20
    iget-object v0, v0, Lf6/x;->a:Ljava/lang/Object;

    .line 21
    .line 22
    iget-object v2, p0, LE5/I;->n:LE5/H0;

    .line 23
    .line 24
    invoke-virtual {v1, v0, v2}, LE5/J0;->g(Ljava/lang/Object;LE5/H0;)LE5/H0;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iget v0, v0, LE5/H0;->c:I

    .line 29
    .line 30
    return v0
.end method

.method public final r0()J
    .locals 5

    .line 1
    invoke-virtual {p0}, LE5/I;->Q0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LE5/I;->x0()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, LE5/I;->j0:LE5/q0;

    .line 11
    .line 12
    iget-object v1, v0, LE5/q0;->b:Lf6/z;

    .line 13
    .line 14
    iget-object v0, v0, LE5/q0;->a:LE5/J0;

    .line 15
    .line 16
    iget-object v2, v1, Lf6/x;->a:Ljava/lang/Object;

    .line 17
    .line 18
    iget-object v3, p0, LE5/I;->n:LE5/H0;

    .line 19
    .line 20
    invoke-virtual {v0, v2, v3}, LE5/J0;->g(Ljava/lang/Object;LE5/H0;)LE5/H0;

    .line 21
    .line 22
    .line 23
    iget v0, v1, Lf6/x;->b:I

    .line 24
    .line 25
    iget v1, v1, Lf6/x;->c:I

    .line 26
    .line 27
    invoke-virtual {v3, v0, v1}, LE5/H0;->a(II)J

    .line 28
    .line 29
    .line 30
    move-result-wide v0

    .line 31
    invoke-static {v0, v1}, Lu6/v;->F(J)J

    .line 32
    .line 33
    .line 34
    move-result-wide v0

    .line 35
    return-wide v0

    .line 36
    :cond_0
    invoke-virtual {p0}, LE5/I;->o0()LE5/J0;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v0}, LE5/J0;->p()Z

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
    invoke-virtual {p0}, LE5/I;->l0()I

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
    check-cast v4, LE5/I0;

    .line 61
    .line 62
    invoke-virtual {v0, v1, v4, v2, v3}, LE5/J0;->m(ILE5/I0;J)LE5/I0;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    iget-wide v0, v0, LE5/I0;->m:J

    .line 67
    .line 68
    invoke-static {v0, v1}, Lu6/v;->F(J)J

    .line 69
    .line 70
    .line 71
    move-result-wide v0

    .line 72
    return-wide v0
.end method

.method public final s0()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, LE5/I;->Q0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LE5/I;->j0:LE5/q0;

    .line 5
    .line 6
    iget-boolean v0, v0, LE5/q0;->l:Z

    .line 7
    .line 8
    return v0
.end method

.method public final t0()I
    .locals 1

    .line 1
    invoke-virtual {p0}, LE5/I;->Q0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LE5/I;->j0:LE5/q0;

    .line 5
    .line 6
    iget v0, v0, LE5/q0;->e:I

    .line 7
    .line 8
    return v0
.end method

.method public final v0()Lr6/f;
    .locals 1

    .line 1
    invoke-virtual {p0}, LE5/I;->Q0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LE5/I;->h:Lr6/o;

    .line 5
    .line 6
    check-cast v0, Lr6/l;

    .line 7
    .line 8
    invoke-virtual {v0}, Lr6/l;->d()Lr6/f;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    return-object v0
.end method

.method public final x0()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, LE5/I;->Q0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LE5/I;->j0:LE5/q0;

    .line 5
    .line 6
    iget-object v0, v0, LE5/q0;->b:Lf6/z;

    .line 7
    .line 8
    invoke-virtual {v0}, Lf6/x;->a()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    return v0
.end method

.method public final y0(LE5/q0;LE5/J0;Landroid/util/Pair;)LE5/q0;
    .locals 20

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
    invoke-virtual {v1}, LE5/J0;->p()Z

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
    invoke-static {v3}, Lu6/a;->e(Z)V

    .line 22
    .line 23
    .line 24
    move-object/from16 v3, p1

    .line 25
    .line 26
    iget-object v6, v3, LE5/q0;->a:LE5/J0;

    .line 27
    .line 28
    invoke-virtual/range {p1 .. p2}, LE5/q0;->g(LE5/J0;)LE5/q0;

    .line 29
    .line 30
    .line 31
    move-result-object v7

    .line 32
    invoke-virtual {v1}, LE5/J0;->p()Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-eqz v3, :cond_2

    .line 37
    .line 38
    sget-object v8, LE5/q0;->s:Lf6/z;

    .line 39
    .line 40
    iget-wide v1, v0, LE5/I;->l0:J

    .line 41
    .line 42
    invoke-static {v1, v2}, Lu6/v;->y(J)J

    .line 43
    .line 44
    .line 45
    move-result-wide v9

    .line 46
    sget-object v17, Lf6/a0;->d:Lf6/a0;

    .line 47
    .line 48
    iget-object v1, v0, LE5/I;->b:Lr6/s;

    .line 49
    .line 50
    sget-object v19, Ll8/e0;->e:Ll8/e0;

    .line 51
    .line 52
    const-wide/16 v15, 0x0

    .line 53
    .line 54
    move-wide v11, v9

    .line 55
    move-wide v13, v9

    .line 56
    move-object/from16 v18, v1

    .line 57
    .line 58
    invoke-virtual/range {v7 .. v19}, LE5/q0;->b(Lf6/z;JJJJLf6/a0;Lr6/s;Ljava/util/List;)LE5/q0;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-virtual {v1, v8}, LE5/q0;->a(Lf6/z;)LE5/q0;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    iget-wide v2, v1, LE5/q0;->r:J

    .line 67
    .line 68
    iput-wide v2, v1, LE5/q0;->p:J

    .line 69
    .line 70
    return-object v1

    .line 71
    :cond_2
    iget-object v3, v7, LE5/q0;->b:Lf6/z;

    .line 72
    .line 73
    iget-object v3, v3, Lf6/x;->a:Ljava/lang/Object;

    .line 74
    .line 75
    sget v8, Lu6/v;->a:I

    .line 76
    .line 77
    iget-object v8, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 78
    .line 79
    invoke-virtual {v3, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v8

    .line 83
    if-nez v8, :cond_3

    .line 84
    .line 85
    new-instance v9, Lf6/z;

    .line 86
    .line 87
    iget-object v10, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 88
    .line 89
    invoke-direct {v9, v10}, Lf6/z;-><init>(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_3
    iget-object v9, v7, LE5/q0;->b:Lf6/z;

    .line 94
    .line 95
    :goto_2
    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v2, Ljava/lang/Long;

    .line 98
    .line 99
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 100
    .line 101
    .line 102
    move-result-wide v10

    .line 103
    invoke-virtual {v0}, LE5/I;->i0()J

    .line 104
    .line 105
    .line 106
    move-result-wide v12

    .line 107
    invoke-static {v12, v13}, Lu6/v;->y(J)J

    .line 108
    .line 109
    .line 110
    move-result-wide v12

    .line 111
    invoke-virtual {v6}, LE5/J0;->p()Z

    .line 112
    .line 113
    .line 114
    move-result v2

    .line 115
    if-nez v2, :cond_4

    .line 116
    .line 117
    iget-object v2, v0, LE5/I;->n:LE5/H0;

    .line 118
    .line 119
    invoke-virtual {v6, v3, v2}, LE5/J0;->g(Ljava/lang/Object;LE5/H0;)LE5/H0;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    iget-wide v2, v2, LE5/H0;->e:J

    .line 124
    .line 125
    sub-long/2addr v12, v2

    .line 126
    :cond_4
    if-eqz v8, :cond_5

    .line 127
    .line 128
    cmp-long v2, v10, v12

    .line 129
    .line 130
    if-gez v2, :cond_6

    .line 131
    .line 132
    :cond_5
    move v1, v8

    .line 133
    move-object v8, v9

    .line 134
    move-wide v9, v10

    .line 135
    goto/16 :goto_6

    .line 136
    .line 137
    :cond_6
    if-nez v2, :cond_a

    .line 138
    .line 139
    iget-object v2, v7, LE5/q0;->k:Lf6/z;

    .line 140
    .line 141
    iget-object v2, v2, Lf6/x;->a:Ljava/lang/Object;

    .line 142
    .line 143
    invoke-virtual {v1, v2}, LE5/J0;->b(Ljava/lang/Object;)I

    .line 144
    .line 145
    .line 146
    move-result v2

    .line 147
    const/4 v3, -0x1

    .line 148
    if-eq v2, v3, :cond_8

    .line 149
    .line 150
    iget-object v3, v0, LE5/I;->n:LE5/H0;

    .line 151
    .line 152
    invoke-virtual {v1, v2, v3, v4}, LE5/J0;->f(ILE5/H0;Z)LE5/H0;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    iget v2, v2, LE5/H0;->c:I

    .line 157
    .line 158
    iget-object v3, v9, Lf6/x;->a:Ljava/lang/Object;

    .line 159
    .line 160
    iget-object v4, v0, LE5/I;->n:LE5/H0;

    .line 161
    .line 162
    invoke-virtual {v1, v3, v4}, LE5/J0;->g(Ljava/lang/Object;LE5/H0;)LE5/H0;

    .line 163
    .line 164
    .line 165
    move-result-object v3

    .line 166
    iget v3, v3, LE5/H0;->c:I

    .line 167
    .line 168
    if-eq v2, v3, :cond_7

    .line 169
    .line 170
    goto :goto_3

    .line 171
    :cond_7
    return-object v7

    .line 172
    :cond_8
    :goto_3
    iget-object v2, v9, Lf6/x;->a:Ljava/lang/Object;

    .line 173
    .line 174
    iget-object v3, v0, LE5/I;->n:LE5/H0;

    .line 175
    .line 176
    invoke-virtual {v1, v2, v3}, LE5/J0;->g(Ljava/lang/Object;LE5/H0;)LE5/H0;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v9}, Lf6/x;->a()Z

    .line 180
    .line 181
    .line 182
    move-result v1

    .line 183
    if-eqz v1, :cond_9

    .line 184
    .line 185
    iget-object v1, v0, LE5/I;->n:LE5/H0;

    .line 186
    .line 187
    iget v2, v9, Lf6/x;->b:I

    .line 188
    .line 189
    iget v3, v9, Lf6/x;->c:I

    .line 190
    .line 191
    invoke-virtual {v1, v2, v3}, LE5/H0;->a(II)J

    .line 192
    .line 193
    .line 194
    move-result-wide v1

    .line 195
    :goto_4
    move-object v8, v9

    .line 196
    goto :goto_5

    .line 197
    :cond_9
    iget-object v1, v0, LE5/I;->n:LE5/H0;

    .line 198
    .line 199
    iget-wide v1, v1, LE5/H0;->d:J

    .line 200
    .line 201
    goto :goto_4

    .line 202
    :goto_5
    iget-wide v9, v7, LE5/q0;->r:J

    .line 203
    .line 204
    iget-wide v11, v7, LE5/q0;->r:J

    .line 205
    .line 206
    iget-wide v13, v7, LE5/q0;->d:J

    .line 207
    .line 208
    iget-wide v3, v7, LE5/q0;->r:J

    .line 209
    .line 210
    sub-long v15, v1, v3

    .line 211
    .line 212
    iget-object v3, v7, LE5/q0;->h:Lf6/a0;

    .line 213
    .line 214
    iget-object v4, v7, LE5/q0;->i:Lr6/s;

    .line 215
    .line 216
    iget-object v5, v7, LE5/q0;->j:Ljava/util/List;

    .line 217
    .line 218
    move-object/from16 v17, v3

    .line 219
    .line 220
    move-object/from16 v18, v4

    .line 221
    .line 222
    move-object/from16 v19, v5

    .line 223
    .line 224
    invoke-virtual/range {v7 .. v19}, LE5/q0;->b(Lf6/z;JJJJLf6/a0;Lr6/s;Ljava/util/List;)LE5/q0;

    .line 225
    .line 226
    .line 227
    move-result-object v3

    .line 228
    invoke-virtual {v3, v8}, LE5/q0;->a(Lf6/z;)LE5/q0;

    .line 229
    .line 230
    .line 231
    move-result-object v3

    .line 232
    iput-wide v1, v3, LE5/q0;->p:J

    .line 233
    .line 234
    return-object v3

    .line 235
    :cond_a
    move-object v8, v9

    .line 236
    invoke-virtual {v8}, Lf6/x;->a()Z

    .line 237
    .line 238
    .line 239
    move-result v1

    .line 240
    xor-int/2addr v1, v5

    .line 241
    invoke-static {v1}, Lu6/a;->i(Z)V

    .line 242
    .line 243
    .line 244
    iget-wide v1, v7, LE5/q0;->q:J

    .line 245
    .line 246
    sub-long v3, v10, v12

    .line 247
    .line 248
    sub-long/2addr v1, v3

    .line 249
    const-wide/16 v3, 0x0

    .line 250
    .line 251
    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->max(JJ)J

    .line 252
    .line 253
    .line 254
    move-result-wide v15

    .line 255
    iget-wide v1, v7, LE5/q0;->p:J

    .line 256
    .line 257
    iget-object v3, v7, LE5/q0;->k:Lf6/z;

    .line 258
    .line 259
    iget-object v4, v7, LE5/q0;->b:Lf6/z;

    .line 260
    .line 261
    invoke-virtual {v3, v4}, Lf6/x;->equals(Ljava/lang/Object;)Z

    .line 262
    .line 263
    .line 264
    move-result v3

    .line 265
    if-eqz v3, :cond_b

    .line 266
    .line 267
    add-long v1, v10, v15

    .line 268
    .line 269
    :cond_b
    iget-object v3, v7, LE5/q0;->h:Lf6/a0;

    .line 270
    .line 271
    iget-object v4, v7, LE5/q0;->i:Lr6/s;

    .line 272
    .line 273
    iget-object v5, v7, LE5/q0;->j:Ljava/util/List;

    .line 274
    .line 275
    move-wide v9, v10

    .line 276
    move-wide v11, v9

    .line 277
    move-wide v13, v9

    .line 278
    move-object/from16 v17, v3

    .line 279
    .line 280
    move-object/from16 v18, v4

    .line 281
    .line 282
    move-object/from16 v19, v5

    .line 283
    .line 284
    invoke-virtual/range {v7 .. v19}, LE5/q0;->b(Lf6/z;JJJJLf6/a0;Lr6/s;Ljava/util/List;)LE5/q0;

    .line 285
    .line 286
    .line 287
    move-result-object v3

    .line 288
    iput-wide v1, v3, LE5/q0;->p:J

    .line 289
    .line 290
    return-object v3

    .line 291
    :goto_6
    invoke-virtual {v8}, Lf6/x;->a()Z

    .line 292
    .line 293
    .line 294
    move-result v2

    .line 295
    xor-int/2addr v2, v5

    .line 296
    invoke-static {v2}, Lu6/a;->i(Z)V

    .line 297
    .line 298
    .line 299
    if-nez v1, :cond_c

    .line 300
    .line 301
    sget-object v2, Lf6/a0;->d:Lf6/a0;

    .line 302
    .line 303
    :goto_7
    move-object/from16 v17, v2

    .line 304
    .line 305
    goto :goto_8

    .line 306
    :cond_c
    iget-object v2, v7, LE5/q0;->h:Lf6/a0;

    .line 307
    .line 308
    goto :goto_7

    .line 309
    :goto_8
    if-nez v1, :cond_d

    .line 310
    .line 311
    iget-object v2, v0, LE5/I;->b:Lr6/s;

    .line 312
    .line 313
    :goto_9
    move-object/from16 v18, v2

    .line 314
    .line 315
    goto :goto_a

    .line 316
    :cond_d
    iget-object v2, v7, LE5/q0;->i:Lr6/s;

    .line 317
    .line 318
    goto :goto_9

    .line 319
    :goto_a
    if-nez v1, :cond_e

    .line 320
    .line 321
    sget-object v1, Ll8/K;->b:Ll8/I;

    .line 322
    .line 323
    sget-object v1, Ll8/e0;->e:Ll8/e0;

    .line 324
    .line 325
    :goto_b
    move-object/from16 v19, v1

    .line 326
    .line 327
    goto :goto_c

    .line 328
    :cond_e
    iget-object v1, v7, LE5/q0;->j:Ljava/util/List;

    .line 329
    .line 330
    goto :goto_b

    .line 331
    :goto_c
    const-wide/16 v15, 0x0

    .line 332
    .line 333
    move-wide v11, v9

    .line 334
    move-wide v13, v9

    .line 335
    invoke-virtual/range {v7 .. v19}, LE5/q0;->b(Lf6/z;JJJJLf6/a0;Lr6/s;Ljava/util/List;)LE5/q0;

    .line 336
    .line 337
    .line 338
    move-result-object v1

    .line 339
    invoke-virtual {v1, v8}, LE5/q0;->a(Lf6/z;)LE5/q0;

    .line 340
    .line 341
    .line 342
    move-result-object v1

    .line 343
    iput-wide v9, v1, LE5/q0;->p:J

    .line 344
    .line 345
    return-object v1
.end method

.method public final z0(LE5/J0;IJ)Landroid/util/Pair;
    .locals 6

    .line 1
    invoke-virtual {p1}, LE5/J0;->p()Z

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
    iput p2, p0, LE5/I;->k0:I

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
    iput-wide p3, p0, LE5/I;->l0:J

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
    invoke-virtual {p1}, LE5/J0;->o()I

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
    iget-boolean p2, p0, LE5/I;->G:Z

    .line 38
    .line 39
    invoke-virtual {p1, p2}, LE5/J0;->a(Z)I

    .line 40
    .line 41
    .line 42
    move-result p2

    .line 43
    iget-object p3, p0, LA7/B0;->a:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p3, LE5/I0;

    .line 46
    .line 47
    invoke-virtual {p1, p2, p3, v1, v2}, LE5/J0;->m(ILE5/I0;J)LE5/I0;

    .line 48
    .line 49
    .line 50
    move-result-object p3

    .line 51
    iget-wide p3, p3, LE5/I0;->l:J

    .line 52
    .line 53
    invoke-static {p3, p4}, Lu6/v;->F(J)J

    .line 54
    .line 55
    .line 56
    move-result-wide p3

    .line 57
    goto :goto_0

    .line 58
    :goto_2
    invoke-static {p3, p4}, Lu6/v;->y(J)J

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
    check-cast v1, LE5/I0;

    .line 66
    .line 67
    iget-object v2, p0, LE5/I;->n:LE5/H0;

    .line 68
    .line 69
    move-object v0, p1

    .line 70
    invoke-virtual/range {v0 .. v5}, LE5/J0;->i(LE5/I0;LE5/H0;IJ)Landroid/util/Pair;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    return-object p1
.end method
