.class public final LCd/i;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/q;


# instance fields
.field public synthetic a:LRd/e;

.field public final synthetic b:LCd/j;


# direct methods
.method public constructor <init>(LCd/j;Ljf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LCd/i;->b:LCd/j;

    .line 2
    .line 3
    const/4 p1, 0x3

    .line 4
    invoke-direct {p0, p1, p2}, Llf/j;-><init>(ILjf/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, LRd/e;

    .line 2
    .line 3
    check-cast p3, Ljf/c;

    .line 4
    .line 5
    new-instance p2, LCd/i;

    .line 6
    .line 7
    iget-object v0, p0, LCd/i;->b:LCd/j;

    .line 8
    .line 9
    invoke-direct {p2, v0, p3}, LCd/i;-><init>(LCd/j;Ljf/c;)V

    .line 10
    .line 11
    .line 12
    iput-object p1, p2, LCd/i;->a:LRd/e;

    .line 13
    .line 14
    sget-object p1, Lef/C;->a:Lef/C;

    .line 15
    .line 16
    invoke-virtual {p2, p1}, LCd/i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 4
    .line 5
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, LCd/i;->a:LRd/e;

    .line 9
    .line 10
    iget-object v1, p1, LRd/e;->a:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, LFd/c;

    .line 13
    .line 14
    iget-object v1, v1, LFd/c;->a:LJd/B;

    .line 15
    .line 16
    invoke-virtual {v1}, LJd/B;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    new-instance v2, LCd/h;

    .line 21
    .line 22
    invoke-direct {v2}, LCd/h;-><init>()V

    .line 23
    .line 24
    .line 25
    iget-object p1, p1, LRd/e;->a:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p1, LFd/c;

    .line 28
    .line 29
    iget-object v3, p1, LFd/c;->c:LJd/n;

    .line 30
    .line 31
    iget-object v4, v2, LCd/h;->a:LJd/n;

    .line 32
    .line 33
    invoke-static {v4, v3}, Lxg/g;->l(LNd/k;LNd/k;)V

    .line 34
    .line 35
    .line 36
    iget-object v3, v4, LA7/B0;->a:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v3, Ljava/util/Map;

    .line 39
    .line 40
    const-string v5, "values"

    .line 41
    .line 42
    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    new-instance v5, LNd/b;

    .line 46
    .line 47
    invoke-direct {v5}, LNd/b;-><init>()V

    .line 48
    .line 49
    .line 50
    invoke-interface {v3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 51
    .line 52
    .line 53
    move-result-object v6

    .line 54
    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 55
    .line 56
    .line 57
    move-result-object v6

    .line 58
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 59
    .line 60
    .line 61
    move-result v7

    .line 62
    const/4 v8, 0x0

    .line 63
    if-eqz v7, :cond_1

    .line 64
    .line 65
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v7

    .line 69
    check-cast v7, Ljava/util/Map$Entry;

    .line 70
    .line 71
    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v9

    .line 75
    check-cast v9, Ljava/lang/String;

    .line 76
    .line 77
    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v7

    .line 81
    check-cast v7, Ljava/util/List;

    .line 82
    .line 83
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 84
    .line 85
    .line 86
    move-result v10

    .line 87
    new-instance v11, Ljava/util/ArrayList;

    .line 88
    .line 89
    invoke-direct {v11, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 90
    .line 91
    .line 92
    :goto_1
    if-ge v8, v10, :cond_0

    .line 93
    .line 94
    invoke-interface {v7, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v12

    .line 98
    check-cast v12, Ljava/lang/String;

    .line 99
    .line 100
    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    add-int/lit8 v8, v8, 0x1

    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_0
    invoke-interface {v5, v9, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_1
    iget-object v6, p0, LCd/i;->b:LCd/j;

    .line 111
    .line 112
    iget-object v6, v6, LCd/j;->a:Ltf/l;

    .line 113
    .line 114
    invoke-interface {v6, v2}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    invoke-interface {v5}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 118
    .line 119
    .line 120
    move-result-object v5

    .line 121
    const-string v6, "<this>"

    .line 122
    .line 123
    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    invoke-static {v5}, Lj$/util/DesugarCollections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    .line 127
    .line 128
    .line 129
    move-result-object v5

    .line 130
    const-string v6, "unmodifiableSet(...)"

    .line 131
    .line 132
    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    check-cast v5, Ljava/lang/Iterable;

    .line 136
    .line 137
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 138
    .line 139
    .line 140
    move-result-object v5

    .line 141
    :cond_2
    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 142
    .line 143
    .line 144
    move-result v6

    .line 145
    if-eqz v6, :cond_8

    .line 146
    .line 147
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v6

    .line 151
    check-cast v6, Ljava/util/Map$Entry;

    .line 152
    .line 153
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v7

    .line 157
    check-cast v7, Ljava/lang/String;

    .line 158
    .line 159
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v6

    .line 163
    check-cast v6, Ljava/util/List;

    .line 164
    .line 165
    invoke-virtual {v4, v7}, LA7/B0;->i(Ljava/lang/String;)Ljava/util/List;

    .line 166
    .line 167
    .line 168
    move-result-object v9

    .line 169
    if-nez v9, :cond_3

    .line 170
    .line 171
    check-cast v6, Ljava/lang/Iterable;

    .line 172
    .line 173
    invoke-virtual {v4, v7, v6}, LA7/B0;->f(Ljava/lang/String;Ljava/lang/Iterable;)V

    .line 174
    .line 175
    .line 176
    goto :goto_2

    .line 177
    :cond_3
    invoke-virtual {v9, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result v10

    .line 181
    if-nez v10, :cond_2

    .line 182
    .line 183
    sget-object v10, LJd/p;->a:Ljava/util/List;

    .line 184
    .line 185
    const-string v10, "Cookie"

    .line 186
    .line 187
    invoke-virtual {v7, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    move-result v10

    .line 191
    if-eqz v10, :cond_4

    .line 192
    .line 193
    goto :goto_2

    .line 194
    :cond_4
    invoke-interface {v3, v7}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    check-cast v6, Ljava/lang/Iterable;

    .line 198
    .line 199
    invoke-virtual {v4, v7, v6}, LA7/B0;->f(Ljava/lang/String;Ljava/lang/Iterable;)V

    .line 200
    .line 201
    .line 202
    check-cast v9, Ljava/lang/Iterable;

    .line 203
    .line 204
    invoke-interface {v3, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v6

    .line 208
    check-cast v6, Ljava/util/List;

    .line 209
    .line 210
    if-eqz v6, :cond_5

    .line 211
    .line 212
    check-cast v6, Ljava/lang/Iterable;

    .line 213
    .line 214
    invoke-static {v6}, Lff/o;->X0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 215
    .line 216
    .line 217
    move-result-object v6

    .line 218
    goto :goto_3

    .line 219
    :cond_5
    sget-object v6, Lff/x;->a:Lff/x;

    .line 220
    .line 221
    :goto_3
    new-instance v10, Ljava/util/ArrayList;

    .line 222
    .line 223
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 224
    .line 225
    .line 226
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 227
    .line 228
    .line 229
    move-result-object v9

    .line 230
    :cond_6
    :goto_4
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 231
    .line 232
    .line 233
    move-result v11

    .line 234
    if-eqz v11, :cond_7

    .line 235
    .line 236
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v11

    .line 240
    move-object v12, v11

    .line 241
    check-cast v12, Ljava/lang/String;

    .line 242
    .line 243
    invoke-interface {v6, v12}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 244
    .line 245
    .line 246
    move-result v12

    .line 247
    if-nez v12, :cond_6

    .line 248
    .line 249
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 250
    .line 251
    .line 252
    goto :goto_4

    .line 253
    :cond_7
    invoke-virtual {v4, v7, v10}, LA7/B0;->f(Ljava/lang/String;Ljava/lang/Iterable;)V

    .line 254
    .line 255
    .line 256
    goto :goto_2

    .line 257
    :cond_8
    iget-object v4, v2, LCd/h;->b:LJd/B;

    .line 258
    .line 259
    invoke-virtual {v4}, LJd/B;->b()LJd/H;

    .line 260
    .line 261
    .line 262
    move-result-object v4

    .line 263
    sget-object v5, LCd/j;->b:LCd/b;

    .line 264
    .line 265
    iget-object v5, p1, LFd/c;->a:LJd/B;

    .line 266
    .line 267
    iget-object v6, v5, LJd/B;->d:LJd/D;

    .line 268
    .line 269
    iget-object v7, v4, LJd/H;->g:LJd/D;

    .line 270
    .line 271
    if-nez v6, :cond_9

    .line 272
    .line 273
    iput-object v7, v5, LJd/B;->d:LJd/D;

    .line 274
    .line 275
    :cond_9
    iget-object v6, v5, LJd/B;->a:Ljava/lang/String;

    .line 276
    .line 277
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 278
    .line 279
    .line 280
    move-result v6

    .line 281
    if-lez v6, :cond_a

    .line 282
    .line 283
    goto/16 :goto_a

    .line 284
    .line 285
    :cond_a
    new-instance v6, LJd/B;

    .line 286
    .line 287
    invoke-direct {v6}, LJd/B;-><init>()V

    .line 288
    .line 289
    .line 290
    iput-object v7, v6, LJd/B;->d:LJd/D;

    .line 291
    .line 292
    iget-object v7, v4, LJd/H;->a:Ljava/lang/String;

    .line 293
    .line 294
    const-string v9, "<set-?>"

    .line 295
    .line 296
    invoke-static {v7, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 297
    .line 298
    .line 299
    iput-object v7, v6, LJd/B;->a:Ljava/lang/String;

    .line 300
    .line 301
    iget v7, v4, LJd/H;->b:I

    .line 302
    .line 303
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 304
    .line 305
    .line 306
    move-result-object v10

    .line 307
    if-nez v7, :cond_b

    .line 308
    .line 309
    const/4 v10, 0x0

    .line 310
    :cond_b
    if-eqz v10, :cond_c

    .line 311
    .line 312
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 313
    .line 314
    .line 315
    move-result v7

    .line 316
    goto :goto_5

    .line 317
    :cond_c
    iget-object v7, v4, LJd/H;->h:LJd/D;

    .line 318
    .line 319
    iget v7, v7, LJd/D;->b:I

    .line 320
    .line 321
    :goto_5
    invoke-virtual {v6, v7}, LJd/B;->d(I)V

    .line 322
    .line 323
    .line 324
    iget-object v7, v4, LJd/H;->i:Lef/p;

    .line 325
    .line 326
    invoke-virtual {v7}, Lef/p;->getValue()Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    move-result-object v7

    .line 330
    check-cast v7, Ljava/lang/String;

    .line 331
    .line 332
    invoke-static {v6, v7}, Lvf/a;->L(LJd/B;Ljava/lang/String;)V

    .line 333
    .line 334
    .line 335
    iget-object v7, v4, LJd/H;->k:Lef/p;

    .line 336
    .line 337
    invoke-virtual {v7}, Lef/p;->getValue()Ljava/lang/Object;

    .line 338
    .line 339
    .line 340
    move-result-object v7

    .line 341
    check-cast v7, Ljava/lang/String;

    .line 342
    .line 343
    iput-object v7, v6, LJd/B;->e:Ljava/lang/String;

    .line 344
    .line 345
    iget-object v7, v4, LJd/H;->l:Lef/p;

    .line 346
    .line 347
    invoke-virtual {v7}, Lef/p;->getValue()Ljava/lang/Object;

    .line 348
    .line 349
    .line 350
    move-result-object v7

    .line 351
    check-cast v7, Ljava/lang/String;

    .line 352
    .line 353
    iput-object v7, v6, LJd/B;->f:Ljava/lang/String;

    .line 354
    .line 355
    new-instance v7, LJd/z;

    .line 356
    .line 357
    invoke-direct {v7, v0}, LA7/B0;-><init>(I)V

    .line 358
    .line 359
    .line 360
    iget-object v10, v4, LJd/H;->j:Lef/p;

    .line 361
    .line 362
    invoke-virtual {v10}, Lef/p;->getValue()Ljava/lang/Object;

    .line 363
    .line 364
    .line 365
    move-result-object v10

    .line 366
    check-cast v10, Ljava/lang/String;

    .line 367
    .line 368
    invoke-static {v10}, Ltg/b;->L(Ljava/lang/String;)LJd/x;

    .line 369
    .line 370
    .line 371
    move-result-object v10

    .line 372
    invoke-virtual {v7, v10}, LA7/B0;->A(LNd/j;)V

    .line 373
    .line 374
    .line 375
    iput-object v7, v6, LJd/B;->i:LJd/z;

    .line 376
    .line 377
    new-instance v10, LS3/l;

    .line 378
    .line 379
    invoke-direct {v10, v7}, LS3/l;-><init>(LJd/z;)V

    .line 380
    .line 381
    .line 382
    iput-object v10, v6, LJd/B;->j:LS3/l;

    .line 383
    .line 384
    iget-object v7, v4, LJd/H;->m:Lef/p;

    .line 385
    .line 386
    invoke-virtual {v7}, Lef/p;->getValue()Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    move-result-object v7

    .line 390
    check-cast v7, Ljava/lang/String;

    .line 391
    .line 392
    invoke-static {v7, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 393
    .line 394
    .line 395
    iput-object v7, v6, LJd/B;->g:Ljava/lang/String;

    .line 396
    .line 397
    iget-boolean v4, v4, LJd/H;->e:Z

    .line 398
    .line 399
    iput-boolean v4, v6, LJd/B;->b:Z

    .line 400
    .line 401
    iget-object v4, v5, LJd/B;->d:LJd/D;

    .line 402
    .line 403
    iput-object v4, v6, LJd/B;->d:LJd/D;

    .line 404
    .line 405
    iget v4, v5, LJd/B;->c:I

    .line 406
    .line 407
    if-eqz v4, :cond_d

    .line 408
    .line 409
    invoke-virtual {v6, v4}, LJd/B;->d(I)V

    .line 410
    .line 411
    .line 412
    :cond_d
    iget-object v4, v6, LJd/B;->h:Ljava/util/List;

    .line 413
    .line 414
    iget-object v7, v5, LJd/B;->h:Ljava/util/List;

    .line 415
    .line 416
    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    .line 417
    .line 418
    .line 419
    move-result v10

    .line 420
    if-eqz v10, :cond_e

    .line 421
    .line 422
    goto :goto_8

    .line 423
    :cond_e
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 424
    .line 425
    .line 426
    move-result v10

    .line 427
    if-eqz v10, :cond_f

    .line 428
    .line 429
    :goto_6
    move-object v4, v7

    .line 430
    goto :goto_8

    .line 431
    :cond_f
    invoke-static {v7}, Lff/o;->q0(Ljava/util/List;)Ljava/lang/Object;

    .line 432
    .line 433
    .line 434
    move-result-object v10

    .line 435
    check-cast v10, Ljava/lang/CharSequence;

    .line 436
    .line 437
    invoke-interface {v10}, Ljava/lang/CharSequence;->length()I

    .line 438
    .line 439
    .line 440
    move-result v10

    .line 441
    if-nez v10, :cond_10

    .line 442
    .line 443
    goto :goto_6

    .line 444
    :cond_10
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 445
    .line 446
    .line 447
    move-result v10

    .line 448
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 449
    .line 450
    .line 451
    move-result v11

    .line 452
    add-int/2addr v11, v10

    .line 453
    add-int/lit8 v11, v11, -0x1

    .line 454
    .line 455
    new-instance v10, Lgf/b;

    .line 456
    .line 457
    invoke-direct {v10, v11}, Lgf/b;-><init>(I)V

    .line 458
    .line 459
    .line 460
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 461
    .line 462
    .line 463
    move-result v11

    .line 464
    add-int/lit8 v11, v11, -0x1

    .line 465
    .line 466
    :goto_7
    if-ge v8, v11, :cond_11

    .line 467
    .line 468
    invoke-interface {v4, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 469
    .line 470
    .line 471
    move-result-object v12

    .line 472
    invoke-virtual {v10, v12}, Lgf/b;->add(Ljava/lang/Object;)Z

    .line 473
    .line 474
    .line 475
    add-int/lit8 v8, v8, 0x1

    .line 476
    .line 477
    goto :goto_7

    .line 478
    :cond_11
    check-cast v7, Ljava/util/Collection;

    .line 479
    .line 480
    invoke-virtual {v10, v7}, Lgf/b;->addAll(Ljava/util/Collection;)Z

    .line 481
    .line 482
    .line 483
    invoke-static {v10}, Lr7/e;->l(Lgf/b;)Lgf/b;

    .line 484
    .line 485
    .line 486
    move-result-object v4

    .line 487
    :goto_8
    invoke-static {v4, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 488
    .line 489
    .line 490
    iput-object v4, v6, LJd/B;->h:Ljava/util/List;

    .line 491
    .line 492
    iget-object v4, v5, LJd/B;->g:Ljava/lang/String;

    .line 493
    .line 494
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 495
    .line 496
    .line 497
    move-result v4

    .line 498
    if-lez v4, :cond_12

    .line 499
    .line 500
    iget-object v4, v5, LJd/B;->g:Ljava/lang/String;

    .line 501
    .line 502
    invoke-static {v4, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 503
    .line 504
    .line 505
    iput-object v4, v6, LJd/B;->g:Ljava/lang/String;

    .line 506
    .line 507
    :cond_12
    new-instance v4, LJd/z;

    .line 508
    .line 509
    invoke-direct {v4, v0}, LA7/B0;-><init>(I)V

    .line 510
    .line 511
    .line 512
    iget-object v0, v6, LJd/B;->i:LJd/z;

    .line 513
    .line 514
    invoke-static {v4, v0}, Lxg/g;->l(LNd/k;LNd/k;)V

    .line 515
    .line 516
    .line 517
    iget-object v0, v5, LJd/B;->i:LJd/z;

    .line 518
    .line 519
    const-string v7, "value"

    .line 520
    .line 521
    invoke-static {v0, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 522
    .line 523
    .line 524
    iput-object v0, v6, LJd/B;->i:LJd/z;

    .line 525
    .line 526
    new-instance v7, LS3/l;

    .line 527
    .line 528
    invoke-direct {v7, v0}, LS3/l;-><init>(LJd/z;)V

    .line 529
    .line 530
    .line 531
    iput-object v7, v6, LJd/B;->j:LS3/l;

    .line 532
    .line 533
    invoke-virtual {v4}, LA7/B0;->b()Ljava/util/Set;

    .line 534
    .line 535
    .line 536
    move-result-object v0

    .line 537
    check-cast v0, Ljava/lang/Iterable;

    .line 538
    .line 539
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 540
    .line 541
    .line 542
    move-result-object v0

    .line 543
    :cond_13
    :goto_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 544
    .line 545
    .line 546
    move-result v4

    .line 547
    if-eqz v4, :cond_14

    .line 548
    .line 549
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 550
    .line 551
    .line 552
    move-result-object v4

    .line 553
    check-cast v4, Ljava/util/Map$Entry;

    .line 554
    .line 555
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 556
    .line 557
    .line 558
    move-result-object v7

    .line 559
    check-cast v7, Ljava/lang/String;

    .line 560
    .line 561
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 562
    .line 563
    .line 564
    move-result-object v4

    .line 565
    check-cast v4, Ljava/util/List;

    .line 566
    .line 567
    iget-object v8, v6, LJd/B;->i:LJd/z;

    .line 568
    .line 569
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 570
    .line 571
    .line 572
    const-string v9, "name"

    .line 573
    .line 574
    invoke-static {v7, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 575
    .line 576
    .line 577
    iget-object v8, v8, LA7/B0;->a:Ljava/lang/Object;

    .line 578
    .line 579
    check-cast v8, Ljava/util/Map;

    .line 580
    .line 581
    invoke-interface {v8, v7}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 582
    .line 583
    .line 584
    move-result v8

    .line 585
    if-nez v8, :cond_13

    .line 586
    .line 587
    iget-object v8, v6, LJd/B;->i:LJd/z;

    .line 588
    .line 589
    check-cast v4, Ljava/lang/Iterable;

    .line 590
    .line 591
    invoke-virtual {v8, v7, v4}, LA7/B0;->f(Ljava/lang/String;Ljava/lang/Iterable;)V

    .line 592
    .line 593
    .line 594
    goto :goto_9

    .line 595
    :cond_14
    invoke-static {v5, v6}, Lxg/g;->U(LJd/B;LJd/B;)V

    .line 596
    .line 597
    .line 598
    :goto_a
    iget-object v0, v2, LCd/h;->c:LNd/d;

    .line 599
    .line 600
    invoke-virtual {v0}, LNd/d;->c()Ljava/util/Map;

    .line 601
    .line 602
    .line 603
    move-result-object v2

    .line 604
    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 605
    .line 606
    .line 607
    move-result-object v2

    .line 608
    check-cast v2, Ljava/lang/Iterable;

    .line 609
    .line 610
    invoke-static {v2}, Lff/o;->S0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 611
    .line 612
    .line 613
    move-result-object v2

    .line 614
    check-cast v2, Ljava/lang/Iterable;

    .line 615
    .line 616
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 617
    .line 618
    .line 619
    move-result-object v2

    .line 620
    :cond_15
    :goto_b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 621
    .line 622
    .line 623
    move-result v4

    .line 624
    if-eqz v4, :cond_16

    .line 625
    .line 626
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 627
    .line 628
    .line 629
    move-result-object v4

    .line 630
    check-cast v4, LNd/a;

    .line 631
    .line 632
    iget-object v5, p1, LFd/c;->f:LNd/d;

    .line 633
    .line 634
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 635
    .line 636
    .line 637
    const-string v6, "key"

    .line 638
    .line 639
    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 640
    .line 641
    .line 642
    invoke-virtual {v5}, LNd/d;->c()Ljava/util/Map;

    .line 643
    .line 644
    .line 645
    move-result-object v5

    .line 646
    invoke-interface {v5, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 647
    .line 648
    .line 649
    move-result v5

    .line 650
    if-nez v5, :cond_15

    .line 651
    .line 652
    iget-object v5, p1, LFd/c;->f:LNd/d;

    .line 653
    .line 654
    invoke-virtual {v0, v4}, LNd/d;->b(LNd/a;)Ljava/lang/Object;

    .line 655
    .line 656
    .line 657
    move-result-object v6

    .line 658
    invoke-virtual {v5, v4, v6}, LNd/d;->e(LNd/a;Ljava/lang/Object;)V

    .line 659
    .line 660
    .line 661
    goto :goto_b

    .line 662
    :cond_16
    iget-object v0, p1, LFd/c;->c:LJd/n;

    .line 663
    .line 664
    invoke-virtual {v0}, LA7/B0;->B()V

    .line 665
    .line 666
    .line 667
    iget-object v0, p1, LFd/c;->c:LJd/n;

    .line 668
    .line 669
    new-instance v2, LJd/o;

    .line 670
    .line 671
    invoke-direct {v2, v3}, LJd/o;-><init>(Ljava/util/Map;)V

    .line 672
    .line 673
    .line 674
    invoke-virtual {v0, v2}, LA7/B0;->A(LNd/j;)V

    .line 675
    .line 676
    .line 677
    sget-object v0, LCd/k;->a:Lvg/b;

    .line 678
    .line 679
    const-string v2, "Applied DefaultRequest to "

    .line 680
    .line 681
    const-string v3, ". New url: "

    .line 682
    .line 683
    invoke-static {v2, v1, v3}, Lcom/google/android/gms/internal/consent_sdk/a;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 684
    .line 685
    .line 686
    move-result-object v1

    .line 687
    iget-object p1, p1, LFd/c;->a:LJd/B;

    .line 688
    .line 689
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 690
    .line 691
    .line 692
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 693
    .line 694
    .line 695
    move-result-object p1

    .line 696
    invoke-interface {v0, p1}, Lvg/b;->s(Ljava/lang/String;)V

    .line 697
    .line 698
    .line 699
    sget-object p1, Lef/C;->a:Lef/C;

    .line 700
    .line 701
    return-object p1
.end method
