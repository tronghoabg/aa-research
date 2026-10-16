.class public final LE4/C;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LE4/h;
.implements LC4/d;


# instance fields
.field public final a:LE4/k;

.field public final b:LE4/i;

.field public c:I

.field public d:I

.field public e:LB4/d;

.field public f:Ljava/util/List;

.field public g:I

.field public volatile h:LI4/o;

.field public i:Ljava/io/File;

.field public j:LE4/D;


# direct methods
.method public constructor <init>(LE4/i;LE4/k;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, LE4/C;->d:I

    .line 6
    .line 7
    iput-object p1, p0, LE4/C;->b:LE4/i;

    .line 8
    .line 9
    iput-object p2, p0, LE4/C;->a:LE4/k;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Exception;)V
    .locals 4

    .line 1
    iget-object v0, p0, LE4/C;->a:LE4/k;

    .line 2
    .line 3
    iget-object v1, p0, LE4/C;->j:LE4/D;

    .line 4
    .line 5
    iget-object v2, p0, LE4/C;->h:LI4/o;

    .line 6
    .line 7
    iget-object v2, v2, LI4/o;->c:LC4/e;

    .line 8
    .line 9
    const/4 v3, 0x4

    .line 10
    invoke-virtual {v0, v1, p1, v2, v3}, LE4/k;->b(LB4/d;Ljava/lang/Exception;LC4/e;I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final cancel()V
    .locals 1

    .line 1
    iget-object v0, p0, LE4/C;->h:LI4/o;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, LI4/o;->c:LC4/e;

    .line 6
    .line 7
    invoke-interface {v0}, LC4/e;->cancel()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public final d()Z
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, LE4/C;->b:LE4/i;

    .line 4
    .line 5
    invoke-virtual {v0}, LE4/i;->a()Ljava/util/ArrayList;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    const/4 v3, 0x0

    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    goto/16 :goto_4

    .line 17
    .line 18
    :cond_0
    iget-object v2, v1, LE4/C;->b:LE4/i;

    .line 19
    .line 20
    iget-object v4, v2, LE4/i;->c:Lcom/bumptech/glide/c;

    .line 21
    .line 22
    iget-object v4, v4, Lcom/bumptech/glide/c;->b:Lcom/bumptech/glide/f;

    .line 23
    .line 24
    iget-object v5, v2, LE4/i;->d:Ljava/lang/Object;

    .line 25
    .line 26
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    iget-object v6, v2, LE4/i;->g:Ljava/lang/Class;

    .line 31
    .line 32
    iget-object v2, v2, LE4/i;->k:Ljava/lang/Class;

    .line 33
    .line 34
    iget-object v7, v4, Lcom/bumptech/glide/f;->h:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v7, LS3/s;

    .line 37
    .line 38
    iget-object v8, v7, LS3/s;->b:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v8, Ljava/util/concurrent/atomic/AtomicReference;

    .line 41
    .line 42
    const/4 v9, 0x0

    .line 43
    invoke-virtual {v8, v9}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v8

    .line 47
    check-cast v8, LY4/k;

    .line 48
    .line 49
    if-nez v8, :cond_1

    .line 50
    .line 51
    new-instance v8, LY4/k;

    .line 52
    .line 53
    invoke-direct {v8, v5, v6, v2}, LY4/k;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)V

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    iput-object v5, v8, LY4/k;->a:Ljava/lang/Class;

    .line 58
    .line 59
    iput-object v6, v8, LY4/k;->b:Ljava/lang/Class;

    .line 60
    .line 61
    iput-object v2, v8, LY4/k;->c:Ljava/lang/Class;

    .line 62
    .line 63
    :goto_0
    iget-object v10, v7, LS3/s;->c:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v10, Lx/e;

    .line 66
    .line 67
    monitor-enter v10

    .line 68
    :try_start_0
    iget-object v11, v7, LS3/s;->c:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v11, Lx/e;

    .line 71
    .line 72
    invoke-virtual {v11, v8}, Lx/v;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v11

    .line 76
    check-cast v11, Ljava/util/List;

    .line 77
    .line 78
    monitor-exit v10
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 79
    iget-object v7, v7, LS3/s;->b:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v7, Ljava/util/concurrent/atomic/AtomicReference;

    .line 82
    .line 83
    invoke-virtual {v7, v8}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    if-nez v11, :cond_5

    .line 87
    .line 88
    new-instance v11, Ljava/util/ArrayList;

    .line 89
    .line 90
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 91
    .line 92
    .line 93
    iget-object v7, v4, Lcom/bumptech/glide/f;->a:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v7, LI4/s;

    .line 96
    .line 97
    invoke-virtual {v7, v5}, LI4/s;->a(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 98
    .line 99
    .line 100
    move-result-object v7

    .line 101
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 102
    .line 103
    .line 104
    move-result-object v7

    .line 105
    :cond_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 106
    .line 107
    .line 108
    move-result v8

    .line 109
    if-eqz v8, :cond_4

    .line 110
    .line 111
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v8

    .line 115
    check-cast v8, Ljava/lang/Class;

    .line 116
    .line 117
    iget-object v10, v4, Lcom/bumptech/glide/f;->c:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast v10, LS3/c;

    .line 120
    .line 121
    invoke-virtual {v10, v8, v6}, LS3/c;->n(Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 122
    .line 123
    .line 124
    move-result-object v8

    .line 125
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 126
    .line 127
    .line 128
    move-result-object v8

    .line 129
    :cond_3
    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 130
    .line 131
    .line 132
    move-result v10

    .line 133
    if-eqz v10, :cond_2

    .line 134
    .line 135
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v10

    .line 139
    check-cast v10, Ljava/lang/Class;

    .line 140
    .line 141
    iget-object v12, v4, Lcom/bumptech/glide/f;->f:Ljava/lang/Object;

    .line 142
    .line 143
    check-cast v12, LN/d0;

    .line 144
    .line 145
    invoke-virtual {v12, v10, v2}, LN/d0;->d(Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 146
    .line 147
    .line 148
    move-result-object v12

    .line 149
    invoke-virtual {v12}, Ljava/util/ArrayList;->isEmpty()Z

    .line 150
    .line 151
    .line 152
    move-result v12

    .line 153
    if-nez v12, :cond_3

    .line 154
    .line 155
    invoke-virtual {v11, v10}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result v12

    .line 159
    if-nez v12, :cond_3

    .line 160
    .line 161
    invoke-virtual {v11, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    goto :goto_1

    .line 165
    :cond_4
    iget-object v4, v4, Lcom/bumptech/glide/f;->h:Ljava/lang/Object;

    .line 166
    .line 167
    check-cast v4, LS3/s;

    .line 168
    .line 169
    invoke-static {v11}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 170
    .line 171
    .line 172
    move-result-object v7

    .line 173
    invoke-virtual {v4, v5, v6, v2, v7}, LS3/s;->t(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/util/List;)V

    .line 174
    .line 175
    .line 176
    :cond_5
    invoke-interface {v11}, Ljava/util/List;->isEmpty()Z

    .line 177
    .line 178
    .line 179
    move-result v2

    .line 180
    if-eqz v2, :cond_7

    .line 181
    .line 182
    const-class v0, Ljava/io/File;

    .line 183
    .line 184
    iget-object v2, v1, LE4/C;->b:LE4/i;

    .line 185
    .line 186
    iget-object v2, v2, LE4/i;->k:Ljava/lang/Class;

    .line 187
    .line 188
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 189
    .line 190
    .line 191
    move-result v0

    .line 192
    if-eqz v0, :cond_6

    .line 193
    .line 194
    goto/16 :goto_4

    .line 195
    .line 196
    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 197
    .line 198
    new-instance v2, Ljava/lang/StringBuilder;

    .line 199
    .line 200
    const-string v3, "Failed to find any load path from "

    .line 201
    .line 202
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    iget-object v3, v1, LE4/C;->b:LE4/i;

    .line 206
    .line 207
    iget-object v3, v3, LE4/i;->d:Ljava/lang/Object;

    .line 208
    .line 209
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 210
    .line 211
    .line 212
    move-result-object v3

    .line 213
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 214
    .line 215
    .line 216
    const-string v3, " to "

    .line 217
    .line 218
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 219
    .line 220
    .line 221
    iget-object v3, v1, LE4/C;->b:LE4/i;

    .line 222
    .line 223
    iget-object v3, v3, LE4/i;->k:Ljava/lang/Class;

    .line 224
    .line 225
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 226
    .line 227
    .line 228
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v2

    .line 232
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    throw v0

    .line 236
    :cond_7
    :goto_2
    iget-object v2, v1, LE4/C;->f:Ljava/util/List;

    .line 237
    .line 238
    const/4 v4, 0x1

    .line 239
    if-eqz v2, :cond_a

    .line 240
    .line 241
    iget v5, v1, LE4/C;->g:I

    .line 242
    .line 243
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 244
    .line 245
    .line 246
    move-result v2

    .line 247
    if-ge v5, v2, :cond_a

    .line 248
    .line 249
    iput-object v9, v1, LE4/C;->h:LI4/o;

    .line 250
    .line 251
    :cond_8
    :goto_3
    if-nez v3, :cond_9

    .line 252
    .line 253
    iget v0, v1, LE4/C;->g:I

    .line 254
    .line 255
    iget-object v2, v1, LE4/C;->f:Ljava/util/List;

    .line 256
    .line 257
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 258
    .line 259
    .line 260
    move-result v2

    .line 261
    if-ge v0, v2, :cond_9

    .line 262
    .line 263
    iget-object v0, v1, LE4/C;->f:Ljava/util/List;

    .line 264
    .line 265
    iget v2, v1, LE4/C;->g:I

    .line 266
    .line 267
    add-int/lit8 v5, v2, 0x1

    .line 268
    .line 269
    iput v5, v1, LE4/C;->g:I

    .line 270
    .line 271
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    check-cast v0, LI4/p;

    .line 276
    .line 277
    iget-object v2, v1, LE4/C;->i:Ljava/io/File;

    .line 278
    .line 279
    iget-object v5, v1, LE4/C;->b:LE4/i;

    .line 280
    .line 281
    iget v6, v5, LE4/i;->e:I

    .line 282
    .line 283
    iget v7, v5, LE4/i;->f:I

    .line 284
    .line 285
    iget-object v5, v5, LE4/i;->i:LB4/g;

    .line 286
    .line 287
    invoke-interface {v0, v2, v6, v7, v5}, LI4/p;->b(Ljava/lang/Object;IILB4/g;)LI4/o;

    .line 288
    .line 289
    .line 290
    move-result-object v0

    .line 291
    iput-object v0, v1, LE4/C;->h:LI4/o;

    .line 292
    .line 293
    iget-object v0, v1, LE4/C;->h:LI4/o;

    .line 294
    .line 295
    if-eqz v0, :cond_8

    .line 296
    .line 297
    iget-object v0, v1, LE4/C;->b:LE4/i;

    .line 298
    .line 299
    iget-object v2, v1, LE4/C;->h:LI4/o;

    .line 300
    .line 301
    iget-object v2, v2, LI4/o;->c:LC4/e;

    .line 302
    .line 303
    invoke-interface {v2}, LC4/e;->b()Ljava/lang/Class;

    .line 304
    .line 305
    .line 306
    move-result-object v2

    .line 307
    invoke-virtual {v0, v2}, LE4/i;->c(Ljava/lang/Class;)LE4/z;

    .line 308
    .line 309
    .line 310
    move-result-object v0

    .line 311
    if-eqz v0, :cond_8

    .line 312
    .line 313
    iget-object v0, v1, LE4/C;->h:LI4/o;

    .line 314
    .line 315
    iget-object v0, v0, LI4/o;->c:LC4/e;

    .line 316
    .line 317
    iget-object v2, v1, LE4/C;->b:LE4/i;

    .line 318
    .line 319
    iget-object v2, v2, LE4/i;->o:Lcom/bumptech/glide/d;

    .line 320
    .line 321
    invoke-interface {v0, v2, v1}, LC4/e;->e(Lcom/bumptech/glide/d;LC4/d;)V

    .line 322
    .line 323
    .line 324
    move v3, v4

    .line 325
    goto :goto_3

    .line 326
    :cond_9
    return v3

    .line 327
    :cond_a
    iget v2, v1, LE4/C;->d:I

    .line 328
    .line 329
    add-int/2addr v2, v4

    .line 330
    iput v2, v1, LE4/C;->d:I

    .line 331
    .line 332
    invoke-interface {v11}, Ljava/util/List;->size()I

    .line 333
    .line 334
    .line 335
    move-result v5

    .line 336
    if-lt v2, v5, :cond_c

    .line 337
    .line 338
    iget v2, v1, LE4/C;->c:I

    .line 339
    .line 340
    add-int/2addr v2, v4

    .line 341
    iput v2, v1, LE4/C;->c:I

    .line 342
    .line 343
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 344
    .line 345
    .line 346
    move-result v4

    .line 347
    if-lt v2, v4, :cond_b

    .line 348
    .line 349
    :goto_4
    return v3

    .line 350
    :cond_b
    iput v3, v1, LE4/C;->d:I

    .line 351
    .line 352
    :cond_c
    iget v2, v1, LE4/C;->c:I

    .line 353
    .line 354
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    move-result-object v2

    .line 358
    move-object v14, v2

    .line 359
    check-cast v14, LB4/d;

    .line 360
    .line 361
    iget v2, v1, LE4/C;->d:I

    .line 362
    .line 363
    invoke-interface {v11, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 364
    .line 365
    .line 366
    move-result-object v2

    .line 367
    check-cast v2, Ljava/lang/Class;

    .line 368
    .line 369
    iget-object v4, v1, LE4/C;->b:LE4/i;

    .line 370
    .line 371
    invoke-virtual {v4, v2}, LE4/i;->e(Ljava/lang/Class;)LB4/k;

    .line 372
    .line 373
    .line 374
    move-result-object v18

    .line 375
    new-instance v12, LE4/D;

    .line 376
    .line 377
    iget-object v4, v1, LE4/C;->b:LE4/i;

    .line 378
    .line 379
    iget-object v5, v4, LE4/i;->c:Lcom/bumptech/glide/c;

    .line 380
    .line 381
    iget-object v13, v5, Lcom/bumptech/glide/c;->a:LF4/f;

    .line 382
    .line 383
    iget-object v15, v4, LE4/i;->n:LB4/d;

    .line 384
    .line 385
    iget v5, v4, LE4/i;->e:I

    .line 386
    .line 387
    iget v6, v4, LE4/i;->f:I

    .line 388
    .line 389
    iget-object v7, v4, LE4/i;->i:LB4/g;

    .line 390
    .line 391
    move-object/from16 v19, v2

    .line 392
    .line 393
    move/from16 v16, v5

    .line 394
    .line 395
    move/from16 v17, v6

    .line 396
    .line 397
    move-object/from16 v20, v7

    .line 398
    .line 399
    invoke-direct/range {v12 .. v20}, LE4/D;-><init>(LF4/f;LB4/d;LB4/d;IILB4/k;Ljava/lang/Class;LB4/g;)V

    .line 400
    .line 401
    .line 402
    iput-object v12, v1, LE4/C;->j:LE4/D;

    .line 403
    .line 404
    iget-object v2, v4, LE4/i;->h:Ld7/j;

    .line 405
    .line 406
    invoke-virtual {v2}, Ld7/j;->a()LG4/a;

    .line 407
    .line 408
    .line 409
    move-result-object v2

    .line 410
    iget-object v4, v1, LE4/C;->j:LE4/D;

    .line 411
    .line 412
    invoke-interface {v2, v4}, LG4/a;->h(LB4/d;)Ljava/io/File;

    .line 413
    .line 414
    .line 415
    move-result-object v2

    .line 416
    iput-object v2, v1, LE4/C;->i:Ljava/io/File;

    .line 417
    .line 418
    if-eqz v2, :cond_7

    .line 419
    .line 420
    iput-object v14, v1, LE4/C;->e:LB4/d;

    .line 421
    .line 422
    iget-object v4, v1, LE4/C;->b:LE4/i;

    .line 423
    .line 424
    iget-object v4, v4, LE4/i;->c:Lcom/bumptech/glide/c;

    .line 425
    .line 426
    iget-object v4, v4, Lcom/bumptech/glide/c;->b:Lcom/bumptech/glide/f;

    .line 427
    .line 428
    invoke-virtual {v4, v2}, Lcom/bumptech/glide/f;->j(Ljava/lang/Object;)Ljava/util/List;

    .line 429
    .line 430
    .line 431
    move-result-object v2

    .line 432
    iput-object v2, v1, LE4/C;->f:Ljava/util/List;

    .line 433
    .line 434
    iput v3, v1, LE4/C;->g:I

    .line 435
    .line 436
    goto/16 :goto_2

    .line 437
    .line 438
    :catchall_0
    move-exception v0

    .line 439
    :try_start_1
    monitor-exit v10
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 440
    throw v0
.end method

.method public final i(Ljava/lang/Object;)V
    .locals 6

    .line 1
    iget-object v0, p0, LE4/C;->a:LE4/k;

    .line 2
    .line 3
    iget-object v1, p0, LE4/C;->e:LB4/d;

    .line 4
    .line 5
    iget-object v2, p0, LE4/C;->h:LI4/o;

    .line 6
    .line 7
    iget-object v3, v2, LI4/o;->c:LC4/e;

    .line 8
    .line 9
    const/4 v4, 0x4

    .line 10
    iget-object v5, p0, LE4/C;->j:LE4/D;

    .line 11
    .line 12
    move-object v2, p1

    .line 13
    invoke-virtual/range {v0 .. v5}, LE4/k;->a(LB4/d;Ljava/lang/Object;LC4/e;ILB4/d;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
