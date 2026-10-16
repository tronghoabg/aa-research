.class public final synthetic LQ1/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, LQ1/f;->a:I

    iput-object p1, p0, LQ1/f;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)Z
    .locals 9

    .line 1
    const/4 v0, -0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    iget-object v2, p0, LQ1/f;->b:Ljava/lang/Object;

    .line 4
    .line 5
    const/4 v3, 0x1

    .line 6
    iget v4, p0, LQ1/f;->a:I

    .line 7
    .line 8
    packed-switch v4, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast v2, LK8/H;

    .line 12
    .line 13
    iget-object p1, v2, LK8/H;->e:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p1, Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Lu6/i;

    .line 32
    .line 33
    iget-boolean v4, v0, Lu6/i;->d:Z

    .line 34
    .line 35
    if-nez v4, :cond_1

    .line 36
    .line 37
    iget-boolean v4, v0, Lu6/i;->c:Z

    .line 38
    .line 39
    if-eqz v4, :cond_1

    .line 40
    .line 41
    iget-object v4, v0, Lu6/i;->b:LN1/k;

    .line 42
    .line 43
    invoke-virtual {v4}, LN1/k;->c()Lu6/e;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    new-instance v5, LN1/k;

    .line 48
    .line 49
    invoke-direct {v5, v3}, LN1/k;-><init>(I)V

    .line 50
    .line 51
    .line 52
    iput-object v5, v0, Lu6/i;->b:LN1/k;

    .line 53
    .line 54
    iput-boolean v1, v0, Lu6/i;->c:Z

    .line 55
    .line 56
    iget-object v0, v0, Lu6/i;->a:Ljava/lang/Object;

    .line 57
    .line 58
    iget-object v5, v2, LK8/H;->d:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v5, Lu6/h;

    .line 61
    .line 62
    invoke-interface {v5, v0, v4}, Lu6/h;->a(Ljava/lang/Object;Lu6/e;)V

    .line 63
    .line 64
    .line 65
    :cond_1
    iget-object v0, v2, LK8/H;->c:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v0, Lu6/s;

    .line 68
    .line 69
    iget-object v0, v0, Lu6/s;->a:Landroid/os/Handler;

    .line 70
    .line 71
    invoke-virtual {v0, v1}, Landroid/os/Handler;->hasMessages(I)Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-eqz v0, :cond_0

    .line 76
    .line 77
    :cond_2
    return v3

    .line 78
    :pswitch_0
    check-cast v2, Lk2/t;

    .line 79
    .line 80
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    iget v1, p1, Landroid/os/Message;->what:I

    .line 84
    .line 85
    iget-object v4, v2, Lk2/t;->n:Ljava/util/ArrayList;

    .line 86
    .line 87
    packed-switch v1, :pswitch_data_1

    .line 88
    .line 89
    .line 90
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 91
    .line 92
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 93
    .line 94
    .line 95
    throw p1

    .line 96
    :pswitch_1
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 97
    .line 98
    sget v0, LQ1/x;->a:I

    .line 99
    .line 100
    check-cast p1, Ljava/util/Set;

    .line 101
    .line 102
    invoke-virtual {v2, p1}, Lk2/t;->H(Ljava/util/Set;)V

    .line 103
    .line 104
    .line 105
    goto/16 :goto_3

    .line 106
    .line 107
    :pswitch_2
    invoke-virtual {v2}, Lk2/t;->N()V

    .line 108
    .line 109
    .line 110
    goto/16 :goto_3

    .line 111
    .line 112
    :pswitch_3
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 113
    .line 114
    sget v0, LQ1/x;->a:I

    .line 115
    .line 116
    check-cast p1, Lk2/s;

    .line 117
    .line 118
    iget-object v0, p1, Lk2/s;->b:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast v0, Lk2/g0;

    .line 121
    .line 122
    iput-object v0, v2, Lk2/t;->u:Lk2/g0;

    .line 123
    .line 124
    iget-object p1, p1, Lk2/s;->c:Lk2/q;

    .line 125
    .line 126
    invoke-virtual {v2, p1}, Lk2/t;->K(Lk2/q;)V

    .line 127
    .line 128
    .line 129
    goto/16 :goto_3

    .line 130
    .line 131
    :pswitch_4
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 132
    .line 133
    sget v0, LQ1/x;->a:I

    .line 134
    .line 135
    check-cast p1, Lk2/s;

    .line 136
    .line 137
    iget-object v0, v2, Lk2/t;->u:Lk2/g0;

    .line 138
    .line 139
    iget v1, p1, Lk2/s;->a:I

    .line 140
    .line 141
    add-int/lit8 v5, v1, 0x1

    .line 142
    .line 143
    invoke-virtual {v0, v1, v5}, Lk2/g0;->c(II)Lk2/g0;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    iput-object v0, v2, Lk2/t;->u:Lk2/g0;

    .line 148
    .line 149
    iget-object v1, p1, Lk2/s;->b:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast v1, Ljava/lang/Integer;

    .line 152
    .line 153
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 154
    .line 155
    .line 156
    move-result v5

    .line 157
    invoke-virtual {v0, v5, v3}, Lk2/g0;->b(II)Lk2/g0;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    iput-object v0, v2, Lk2/t;->u:Lk2/g0;

    .line 162
    .line 163
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 164
    .line 165
    .line 166
    move-result v0

    .line 167
    iget v1, p1, Lk2/s;->a:I

    .line 168
    .line 169
    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    .line 170
    .line 171
    .line 172
    move-result v5

    .line 173
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    .line 174
    .line 175
    .line 176
    move-result v6

    .line 177
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v7

    .line 181
    check-cast v7, Lk2/r;

    .line 182
    .line 183
    iget v7, v7, Lk2/r;->e:I

    .line 184
    .line 185
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v1

    .line 189
    check-cast v1, Lk2/r;

    .line 190
    .line 191
    invoke-virtual {v4, v0, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 192
    .line 193
    .line 194
    :goto_0
    if-gt v5, v6, :cond_3

    .line 195
    .line 196
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    check-cast v0, Lk2/r;

    .line 201
    .line 202
    iput v5, v0, Lk2/r;->d:I

    .line 203
    .line 204
    iput v7, v0, Lk2/r;->e:I

    .line 205
    .line 206
    iget-object v0, v0, Lk2/r;->a:Lk2/D;

    .line 207
    .line 208
    iget-object v0, v0, Lk2/D;->o:Lk2/B;

    .line 209
    .line 210
    iget-object v0, v0, Lk2/x;->b:LN1/N;

    .line 211
    .line 212
    invoke-virtual {v0}, LN1/N;->o()I

    .line 213
    .line 214
    .line 215
    move-result v0

    .line 216
    add-int/2addr v7, v0

    .line 217
    add-int/2addr v5, v3

    .line 218
    goto :goto_0

    .line 219
    :cond_3
    iget-object p1, p1, Lk2/s;->c:Lk2/q;

    .line 220
    .line 221
    invoke-virtual {v2, p1}, Lk2/t;->K(Lk2/q;)V

    .line 222
    .line 223
    .line 224
    goto/16 :goto_3

    .line 225
    .line 226
    :pswitch_5
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 227
    .line 228
    sget v1, LQ1/x;->a:I

    .line 229
    .line 230
    check-cast p1, Lk2/s;

    .line 231
    .line 232
    iget v1, p1, Lk2/s;->a:I

    .line 233
    .line 234
    iget-object v5, p1, Lk2/s;->b:Ljava/lang/Object;

    .line 235
    .line 236
    check-cast v5, Ljava/lang/Integer;

    .line 237
    .line 238
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 239
    .line 240
    .line 241
    move-result v5

    .line 242
    if-nez v1, :cond_4

    .line 243
    .line 244
    iget-object v6, v2, Lk2/t;->u:Lk2/g0;

    .line 245
    .line 246
    iget-object v7, v6, Lk2/g0;->b:[I

    .line 247
    .line 248
    array-length v7, v7

    .line 249
    if-ne v5, v7, :cond_4

    .line 250
    .line 251
    invoke-virtual {v6}, Lk2/g0;->a()Lk2/g0;

    .line 252
    .line 253
    .line 254
    move-result-object v6

    .line 255
    iput-object v6, v2, Lk2/t;->u:Lk2/g0;

    .line 256
    .line 257
    goto :goto_1

    .line 258
    :cond_4
    iget-object v6, v2, Lk2/t;->u:Lk2/g0;

    .line 259
    .line 260
    invoke-virtual {v6, v1, v5}, Lk2/g0;->c(II)Lk2/g0;

    .line 261
    .line 262
    .line 263
    move-result-object v6

    .line 264
    iput-object v6, v2, Lk2/t;->u:Lk2/g0;

    .line 265
    .line 266
    :goto_1
    sub-int/2addr v5, v3

    .line 267
    :goto_2
    if-lt v5, v1, :cond_6

    .line 268
    .line 269
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v6

    .line 273
    check-cast v6, Lk2/r;

    .line 274
    .line 275
    iget-object v7, v2, Lk2/t;->p:Ljava/util/HashMap;

    .line 276
    .line 277
    iget-object v8, v6, Lk2/r;->b:Ljava/lang/Object;

    .line 278
    .line 279
    invoke-virtual {v7, v8}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    iget-object v7, v6, Lk2/r;->a:Lk2/D;

    .line 283
    .line 284
    iget-object v7, v7, Lk2/D;->o:Lk2/B;

    .line 285
    .line 286
    iget-object v7, v7, Lk2/x;->b:LN1/N;

    .line 287
    .line 288
    invoke-virtual {v7}, LN1/N;->o()I

    .line 289
    .line 290
    .line 291
    move-result v7

    .line 292
    neg-int v7, v7

    .line 293
    invoke-virtual {v2, v5, v0, v7}, Lk2/t;->D(III)V

    .line 294
    .line 295
    .line 296
    iput-boolean v3, v6, Lk2/r;->f:Z

    .line 297
    .line 298
    iget-object v7, v6, Lk2/r;->c:Ljava/util/ArrayList;

    .line 299
    .line 300
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    .line 301
    .line 302
    .line 303
    move-result v7

    .line 304
    if-eqz v7, :cond_5

    .line 305
    .line 306
    iget-object v7, v2, Lk2/t;->q:Ljava/util/HashSet;

    .line 307
    .line 308
    invoke-virtual {v7, v6}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 309
    .line 310
    .line 311
    iget-object v7, v2, Lk2/l;->h:Ljava/util/HashMap;

    .line 312
    .line 313
    invoke-virtual {v7, v6}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object v6

    .line 317
    check-cast v6, Lk2/k;

    .line 318
    .line 319
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 320
    .line 321
    .line 322
    iget-object v7, v6, Lk2/k;->b:Lk2/i;

    .line 323
    .line 324
    iget-object v8, v6, Lk2/k;->a:Lk2/a;

    .line 325
    .line 326
    invoke-virtual {v8, v7}, Lk2/a;->o(Lk2/I;)V

    .line 327
    .line 328
    .line 329
    iget-object v6, v6, Lk2/k;->c:Lk2/j;

    .line 330
    .line 331
    invoke-virtual {v8, v6}, Lk2/a;->r(Lk2/M;)V

    .line 332
    .line 333
    .line 334
    invoke-virtual {v8, v6}, Lk2/a;->q(LZ1/e;)V

    .line 335
    .line 336
    .line 337
    :cond_5
    add-int/2addr v5, v0

    .line 338
    goto :goto_2

    .line 339
    :cond_6
    iget-object p1, p1, Lk2/s;->c:Lk2/q;

    .line 340
    .line 341
    invoke-virtual {v2, p1}, Lk2/t;->K(Lk2/q;)V

    .line 342
    .line 343
    .line 344
    goto :goto_3

    .line 345
    :pswitch_6
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 346
    .line 347
    sget v0, LQ1/x;->a:I

    .line 348
    .line 349
    check-cast p1, Lk2/s;

    .line 350
    .line 351
    iget-object v0, v2, Lk2/t;->u:Lk2/g0;

    .line 352
    .line 353
    iget v1, p1, Lk2/s;->a:I

    .line 354
    .line 355
    iget-object v4, p1, Lk2/s;->b:Ljava/lang/Object;

    .line 356
    .line 357
    check-cast v4, Ljava/util/Collection;

    .line 358
    .line 359
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    .line 360
    .line 361
    .line 362
    move-result v5

    .line 363
    invoke-virtual {v0, v1, v5}, Lk2/g0;->b(II)Lk2/g0;

    .line 364
    .line 365
    .line 366
    move-result-object v0

    .line 367
    iput-object v0, v2, Lk2/t;->u:Lk2/g0;

    .line 368
    .line 369
    iget v0, p1, Lk2/s;->a:I

    .line 370
    .line 371
    invoke-virtual {v2, v0, v4}, Lk2/t;->B(ILjava/util/Collection;)V

    .line 372
    .line 373
    .line 374
    iget-object p1, p1, Lk2/s;->c:Lk2/q;

    .line 375
    .line 376
    invoke-virtual {v2, p1}, Lk2/t;->K(Lk2/q;)V

    .line 377
    .line 378
    .line 379
    :goto_3
    return v3

    .line 380
    :pswitch_7
    check-cast v2, LQ1/j;

    .line 381
    .line 382
    iget-object p1, v2, LQ1/j;->d:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 383
    .line 384
    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    .line 385
    .line 386
    .line 387
    move-result-object p1

    .line 388
    :cond_7
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 389
    .line 390
    .line 391
    move-result v0

    .line 392
    if-eqz v0, :cond_9

    .line 393
    .line 394
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 395
    .line 396
    .line 397
    move-result-object v0

    .line 398
    check-cast v0, LQ1/i;

    .line 399
    .line 400
    iget-boolean v4, v0, LQ1/i;->d:Z

    .line 401
    .line 402
    if-nez v4, :cond_8

    .line 403
    .line 404
    iget-boolean v4, v0, LQ1/i;->c:Z

    .line 405
    .line 406
    if-eqz v4, :cond_8

    .line 407
    .line 408
    iget-object v4, v0, LQ1/i;->b:LN1/k;

    .line 409
    .line 410
    invoke-virtual {v4}, LN1/k;->b()LN1/l;

    .line 411
    .line 412
    .line 413
    move-result-object v4

    .line 414
    new-instance v5, LN1/k;

    .line 415
    .line 416
    invoke-direct {v5, v1}, LN1/k;-><init>(I)V

    .line 417
    .line 418
    .line 419
    iput-object v5, v0, LQ1/i;->b:LN1/k;

    .line 420
    .line 421
    iput-boolean v1, v0, LQ1/i;->c:Z

    .line 422
    .line 423
    iget-object v0, v0, LQ1/i;->a:Ljava/lang/Object;

    .line 424
    .line 425
    iget-object v5, v2, LQ1/j;->c:LQ1/h;

    .line 426
    .line 427
    invoke-interface {v5, v0, v4}, LQ1/h;->b(Ljava/lang/Object;LN1/l;)V

    .line 428
    .line 429
    .line 430
    :cond_8
    iget-object v0, v2, LQ1/j;->b:LQ1/s;

    .line 431
    .line 432
    iget-object v0, v0, LQ1/s;->a:Landroid/os/Handler;

    .line 433
    .line 434
    invoke-virtual {v0, v3}, Landroid/os/Handler;->hasMessages(I)Z

    .line 435
    .line 436
    .line 437
    move-result v0

    .line 438
    if-eqz v0, :cond_7

    .line 439
    .line 440
    :cond_9
    return v3

    .line 441
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_0
    .end packed-switch

    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
