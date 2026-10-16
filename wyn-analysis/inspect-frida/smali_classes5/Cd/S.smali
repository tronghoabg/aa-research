.class public abstract LCd/S;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/Set;

.field public static final b:Lvg/b;

.field public static final c:Lwa/a;

.field public static final d:LDd/c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const/4 v0, 0x2

    .line 2
    new-array v0, v0, [LJd/s;

    .line 3
    .line 4
    sget-object v1, LJd/s;->b:LJd/s;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    aput-object v1, v0, v2

    .line 8
    .line 9
    sget-object v1, LJd/s;->d:LJd/s;

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    aput-object v1, v0, v2

    .line 13
    .line 14
    invoke-static {v0}, Lff/m;->P0([Ljava/lang/Object;)Ljava/util/Set;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    sput-object v0, LCd/S;->a:Ljava/util/Set;

    .line 19
    .line 20
    const-string v0, "io.ktor.client.plugins.HttpRedirect"

    .line 21
    .line 22
    invoke-static {v0}, Lvg/d;->c(Ljava/lang/String;)Lvg/b;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    sput-object v0, LCd/S;->b:Lvg/b;

    .line 27
    .line 28
    new-instance v0, Lwa/a;

    .line 29
    .line 30
    const/16 v1, 0x13

    .line 31
    .line 32
    invoke-direct {v0, v1}, Lwa/a;-><init>(I)V

    .line 33
    .line 34
    .line 35
    sput-object v0, LCd/S;->c:Lwa/a;

    .line 36
    .line 37
    sget-object v0, LCd/P;->a:LCd/P;

    .line 38
    .line 39
    new-instance v1, LAd/g;

    .line 40
    .line 41
    const/16 v2, 0xb

    .line 42
    .line 43
    invoke-direct {v1, v2}, LAd/g;-><init>(I)V

    .line 44
    .line 45
    .line 46
    const-string v2, "HttpRedirect"

    .line 47
    .line 48
    invoke-static {v2, v0, v1}, LU8/v0;->s(Ljava/lang/String;Ltf/a;Ltf/l;)LDd/c;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    sput-object v0, LCd/S;->d:LDd/c;

    .line 53
    .line 54
    return-void
.end method

.method public static final a(LDd/h;LFd/c;Lxd/c;Lwd/c;Llf/c;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    move-object/from16 v1, p4

    .line 4
    .line 5
    instance-of v2, v1, LCd/Q;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, LCd/Q;

    .line 11
    .line 12
    iget v3, v2, LCd/Q;->j:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, LCd/Q;->j:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, LCd/Q;

    .line 25
    .line 26
    invoke-direct {v2, v1}, Llf/c;-><init>(Ljf/c;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v1, v2, LCd/Q;->i:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, Lkf/a;->a:Lkf/a;

    .line 32
    .line 33
    iget v4, v2, LCd/Q;->j:I

    .line 34
    .line 35
    const-string v5, "<this>"

    .line 36
    .line 37
    const/4 v6, 0x1

    .line 38
    if-eqz v4, :cond_2

    .line 39
    .line 40
    if-ne v4, v6, :cond_1

    .line 41
    .line 42
    iget-object v0, v2, LCd/Q;->h:Lkotlin/jvm/internal/G;

    .line 43
    .line 44
    iget-object v4, v2, LCd/Q;->g:Ljava/lang/String;

    .line 45
    .line 46
    iget-object v7, v2, LCd/Q;->f:LJd/D;

    .line 47
    .line 48
    iget-object v8, v2, LCd/Q;->e:Lkotlin/jvm/internal/G;

    .line 49
    .line 50
    iget-object v9, v2, LCd/Q;->d:Lkotlin/jvm/internal/G;

    .line 51
    .line 52
    iget-object v10, v2, LCd/Q;->c:Lwd/c;

    .line 53
    .line 54
    iget-object v11, v2, LCd/Q;->b:LFd/c;

    .line 55
    .line 56
    iget-object v12, v2, LCd/Q;->a:LDd/h;

    .line 57
    .line 58
    invoke-static {v1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    move-object/from16 v17, v4

    .line 62
    .line 63
    move-object v4, v2

    .line 64
    move-object v2, v9

    .line 65
    move-object v9, v7

    .line 66
    move-object v7, v11

    .line 67
    move-object v11, v8

    .line 68
    move-object/from16 v8, v17

    .line 69
    .line 70
    goto/16 :goto_6

    .line 71
    .line 72
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 73
    .line 74
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 75
    .line 76
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    throw v0

    .line 80
    :cond_2
    invoke-static {v1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0}, Lxd/c;->e()LGd/a;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    invoke-virtual {v1}, LGd/a;->e()LJd/v;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    invoke-static {v1}, LCd/S;->b(LJd/v;)Z

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    if-nez v1, :cond_3

    .line 96
    .line 97
    return-object v0

    .line 98
    :cond_3
    new-instance v1, Lkotlin/jvm/internal/G;

    .line 99
    .line 100
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 101
    .line 102
    .line 103
    iput-object v0, v1, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 104
    .line 105
    new-instance v4, Lkotlin/jvm/internal/G;

    .line 106
    .line 107
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 108
    .line 109
    .line 110
    move-object/from16 v7, p1

    .line 111
    .line 112
    iput-object v7, v4, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 113
    .line 114
    invoke-virtual {v0}, Lxd/c;->d()LFd/b;

    .line 115
    .line 116
    .line 117
    move-result-object v8

    .line 118
    invoke-interface {v8}, LFd/b;->getUrl()LJd/H;

    .line 119
    .line 120
    .line 121
    move-result-object v8

    .line 122
    iget-object v8, v8, LJd/H;->h:LJd/D;

    .line 123
    .line 124
    invoke-virtual {v0}, Lxd/c;->d()LFd/b;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    invoke-interface {v0}, LFd/b;->getUrl()LJd/H;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    new-instance v9, Ljava/lang/StringBuilder;

    .line 136
    .line 137
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 138
    .line 139
    .line 140
    new-instance v10, Ljava/lang/StringBuilder;

    .line 141
    .line 142
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 143
    .line 144
    .line 145
    iget-object v11, v0, LJd/H;->k:Lef/p;

    .line 146
    .line 147
    invoke-virtual {v11}, Lef/p;->getValue()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v11

    .line 151
    check-cast v11, Ljava/lang/String;

    .line 152
    .line 153
    iget-object v12, v0, LJd/H;->l:Lef/p;

    .line 154
    .line 155
    invoke-virtual {v12}, Lef/p;->getValue()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v12

    .line 159
    check-cast v12, Ljava/lang/String;

    .line 160
    .line 161
    const/16 v13, 0x3a

    .line 162
    .line 163
    if-nez v11, :cond_4

    .line 164
    .line 165
    goto :goto_1

    .line 166
    :cond_4
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    if-eqz v12, :cond_5

    .line 170
    .line 171
    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    :cond_5
    const-string v11, "@"

    .line 178
    .line 179
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    :goto_1
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v10

    .line 186
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    iget v10, v0, LJd/H;->b:I

    .line 190
    .line 191
    iget-object v11, v0, LJd/H;->a:Ljava/lang/String;

    .line 192
    .line 193
    if-eqz v10, :cond_9

    .line 194
    .line 195
    iget-object v0, v0, LJd/H;->h:LJd/D;

    .line 196
    .line 197
    iget v12, v0, LJd/D;->b:I

    .line 198
    .line 199
    if-ne v10, v12, :cond_6

    .line 200
    .line 201
    goto :goto_3

    .line 202
    :cond_6
    new-instance v12, Ljava/lang/StringBuilder;

    .line 203
    .line 204
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 208
    .line 209
    .line 210
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 211
    .line 212
    .line 213
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 214
    .line 215
    .line 216
    move-result-object v11

    .line 217
    if-nez v10, :cond_7

    .line 218
    .line 219
    const/4 v11, 0x0

    .line 220
    :cond_7
    if-eqz v11, :cond_8

    .line 221
    .line 222
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    .line 223
    .line 224
    .line 225
    move-result v0

    .line 226
    goto :goto_2

    .line 227
    :cond_8
    iget v0, v0, LJd/D;->b:I

    .line 228
    .line 229
    :goto_2
    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 230
    .line 231
    .line 232
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v11

    .line 236
    :cond_9
    :goto_3
    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 237
    .line 238
    .line 239
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    move-object v10, v4

    .line 244
    move-object v9, v8

    .line 245
    move-object v8, v0

    .line 246
    move-object v4, v2

    .line 247
    move-object/from16 v0, p0

    .line 248
    .line 249
    move-object v2, v1

    .line 250
    move-object/from16 v1, p3

    .line 251
    .line 252
    :goto_4
    iget-object v11, v1, Lwd/c;->j:Ly3/j;

    .line 253
    .line 254
    iget-object v12, v2, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 255
    .line 256
    check-cast v12, Lxd/c;

    .line 257
    .line 258
    invoke-virtual {v12}, Lxd/c;->e()LGd/a;

    .line 259
    .line 260
    .line 261
    sget-object v12, LCd/S;->c:Lwa/a;

    .line 262
    .line 263
    invoke-virtual {v11, v12}, Ly3/j;->q(Lwa/a;)V

    .line 264
    .line 265
    .line 266
    iget-object v11, v2, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 267
    .line 268
    check-cast v11, Lxd/c;

    .line 269
    .line 270
    invoke-virtual {v11}, Lxd/c;->e()LGd/a;

    .line 271
    .line 272
    .line 273
    move-result-object v11

    .line 274
    invoke-interface {v11}, LJd/q;->a()LJd/m;

    .line 275
    .line 276
    .line 277
    move-result-object v11

    .line 278
    sget-object v12, LJd/p;->a:Ljava/util/List;

    .line 279
    .line 280
    const-string v12, "Location"

    .line 281
    .line 282
    invoke-interface {v11, v12}, LNd/j;->get(Ljava/lang/String;)Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object v11

    .line 286
    const-string v12, "Received redirect response to "

    .line 287
    .line 288
    const-string v13, " for request "

    .line 289
    .line 290
    invoke-static {v12, v11, v13}, Lcom/google/android/gms/internal/consent_sdk/a;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 291
    .line 292
    .line 293
    move-result-object v12

    .line 294
    iget-object v13, v7, LFd/c;->a:LJd/B;

    .line 295
    .line 296
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 297
    .line 298
    .line 299
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object v12

    .line 303
    sget-object v13, LCd/S;->b:Lvg/b;

    .line 304
    .line 305
    invoke-interface {v13, v12}, Lvg/b;->s(Ljava/lang/String;)V

    .line 306
    .line 307
    .line 308
    new-instance v12, LFd/c;

    .line 309
    .line 310
    invoke-direct {v12}, LFd/c;-><init>()V

    .line 311
    .line 312
    .line 313
    iget-object v14, v10, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 314
    .line 315
    check-cast v14, LFd/c;

    .line 316
    .line 317
    const-string v15, "builder"

    .line 318
    .line 319
    invoke-static {v14, v15}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 320
    .line 321
    .line 322
    iget-object v15, v14, LFd/c;->e:LEf/I0;

    .line 323
    .line 324
    iput-object v15, v12, LFd/c;->e:LEf/I0;

    .line 325
    .line 326
    invoke-virtual {v12, v14}, LFd/c;->d(LFd/c;)V

    .line 327
    .line 328
    .line 329
    iget-object v14, v12, LFd/c;->a:LJd/B;

    .line 330
    .line 331
    iget-object v15, v14, LJd/B;->j:LS3/l;

    .line 332
    .line 333
    iget-object v15, v15, LS3/l;->a:Ljava/lang/Object;

    .line 334
    .line 335
    check-cast v15, LJd/z;

    .line 336
    .line 337
    invoke-virtual {v15}, LA7/B0;->B()V

    .line 338
    .line 339
    .line 340
    if-eqz v11, :cond_a

    .line 341
    .line 342
    invoke-static {v14, v11}, LJd/C;->b(LJd/B;Ljava/lang/String;)V

    .line 343
    .line 344
    .line 345
    :cond_a
    invoke-static {v9, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 346
    .line 347
    .line 348
    iget-object v11, v9, LJd/D;->a:Ljava/lang/String;

    .line 349
    .line 350
    const-string v15, "https"

    .line 351
    .line 352
    invoke-static {v11, v15}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 353
    .line 354
    .line 355
    move-result v16

    .line 356
    const-string v6, "wss"

    .line 357
    .line 358
    move-object/from16 p0, v14

    .line 359
    .line 360
    iget-object v14, v7, LFd/c;->a:LJd/B;

    .line 361
    .line 362
    if-nez v16, :cond_b

    .line 363
    .line 364
    invoke-static {v11, v6}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 365
    .line 366
    .line 367
    move-result v11

    .line 368
    if-eqz v11, :cond_d

    .line 369
    .line 370
    :cond_b
    invoke-virtual/range {p0 .. p0}, LJd/B;->c()LJd/D;

    .line 371
    .line 372
    .line 373
    move-result-object v11

    .line 374
    invoke-static {v11, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 375
    .line 376
    .line 377
    iget-object v11, v11, LJd/D;->a:Ljava/lang/String;

    .line 378
    .line 379
    invoke-static {v11, v15}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 380
    .line 381
    .line 382
    move-result v15

    .line 383
    if-nez v15, :cond_d

    .line 384
    .line 385
    invoke-static {v11, v6}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 386
    .line 387
    .line 388
    move-result v6

    .line 389
    if-eqz v6, :cond_c

    .line 390
    .line 391
    goto :goto_5

    .line 392
    :cond_c
    new-instance v0, Ljava/lang/StringBuilder;

    .line 393
    .line 394
    const-string v1, "Can not redirect "

    .line 395
    .line 396
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 397
    .line 398
    .line 399
    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 400
    .line 401
    .line 402
    const-string v1, " because of security downgrade"

    .line 403
    .line 404
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 405
    .line 406
    .line 407
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 408
    .line 409
    .line 410
    move-result-object v0

    .line 411
    invoke-interface {v13, v0}, Lvg/b;->s(Ljava/lang/String;)V

    .line 412
    .line 413
    .line 414
    iget-object v0, v2, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 415
    .line 416
    return-object v0

    .line 417
    :cond_d
    :goto_5
    invoke-static/range {p0 .. p0}, Lvf/a;->u(LJd/B;)Ljava/lang/String;

    .line 418
    .line 419
    .line 420
    move-result-object v6

    .line 421
    invoke-static {v8, v6}, Lkotlin/jvm/internal/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 422
    .line 423
    .line 424
    move-result v6

    .line 425
    if-nez v6, :cond_e

    .line 426
    .line 427
    iget-object v6, v12, LFd/c;->c:LJd/n;

    .line 428
    .line 429
    iget-object v6, v6, LA7/B0;->a:Ljava/lang/Object;

    .line 430
    .line 431
    check-cast v6, Ljava/util/Map;

    .line 432
    .line 433
    const-string v11, "Authorization"

    .line 434
    .line 435
    invoke-interface {v6, v11}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 436
    .line 437
    .line 438
    new-instance v6, Ljava/lang/StringBuilder;

    .line 439
    .line 440
    const-string v11, "Removing Authorization header from redirect for "

    .line 441
    .line 442
    invoke-direct {v6, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 443
    .line 444
    .line 445
    invoke-virtual {v6, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 446
    .line 447
    .line 448
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 449
    .line 450
    .line 451
    move-result-object v6

    .line 452
    invoke-interface {v13, v6}, Lvg/b;->s(Ljava/lang/String;)V

    .line 453
    .line 454
    .line 455
    :cond_e
    iput-object v12, v10, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 456
    .line 457
    iput-object v0, v4, LCd/Q;->a:LDd/h;

    .line 458
    .line 459
    iput-object v7, v4, LCd/Q;->b:LFd/c;

    .line 460
    .line 461
    iput-object v1, v4, LCd/Q;->c:Lwd/c;

    .line 462
    .line 463
    iput-object v2, v4, LCd/Q;->d:Lkotlin/jvm/internal/G;

    .line 464
    .line 465
    iput-object v10, v4, LCd/Q;->e:Lkotlin/jvm/internal/G;

    .line 466
    .line 467
    iput-object v9, v4, LCd/Q;->f:LJd/D;

    .line 468
    .line 469
    iput-object v8, v4, LCd/Q;->g:Ljava/lang/String;

    .line 470
    .line 471
    iput-object v2, v4, LCd/Q;->h:Lkotlin/jvm/internal/G;

    .line 472
    .line 473
    const/4 v6, 0x1

    .line 474
    iput v6, v4, LCd/Q;->j:I

    .line 475
    .line 476
    iget-object v11, v0, LDd/h;->a:LCd/u0;

    .line 477
    .line 478
    invoke-interface {v11, v12, v4}, LCd/u0;->a(LFd/c;Llf/c;)Ljava/lang/Object;

    .line 479
    .line 480
    .line 481
    move-result-object v11

    .line 482
    if-ne v11, v3, :cond_f

    .line 483
    .line 484
    return-object v3

    .line 485
    :cond_f
    move-object v12, v10

    .line 486
    move-object v10, v1

    .line 487
    move-object v1, v11

    .line 488
    move-object v11, v12

    .line 489
    move-object v12, v0

    .line 490
    move-object v0, v2

    .line 491
    :goto_6
    iput-object v1, v0, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 492
    .line 493
    iget-object v0, v2, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 494
    .line 495
    check-cast v0, Lxd/c;

    .line 496
    .line 497
    invoke-virtual {v0}, Lxd/c;->e()LGd/a;

    .line 498
    .line 499
    .line 500
    move-result-object v0

    .line 501
    invoke-virtual {v0}, LGd/a;->e()LJd/v;

    .line 502
    .line 503
    .line 504
    move-result-object v0

    .line 505
    invoke-static {v0}, LCd/S;->b(LJd/v;)Z

    .line 506
    .line 507
    .line 508
    move-result v0

    .line 509
    if-nez v0, :cond_10

    .line 510
    .line 511
    iget-object v0, v2, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 512
    .line 513
    return-object v0

    .line 514
    :cond_10
    move-object v1, v10

    .line 515
    move-object v10, v11

    .line 516
    move-object v0, v12

    .line 517
    goto/16 :goto_4
.end method

.method public static final b(LJd/v;)Z
    .locals 1

    .line 1
    iget p0, p0, LJd/v;->a:I

    .line 2
    .line 3
    sget-object v0, LJd/v;->c:LJd/v;

    .line 4
    .line 5
    sget-object v0, LJd/v;->e:LJd/v;

    .line 6
    .line 7
    iget v0, v0, LJd/v;->a:I

    .line 8
    .line 9
    if-eq p0, v0, :cond_1

    .line 10
    .line 11
    sget-object v0, LJd/v;->f:LJd/v;

    .line 12
    .line 13
    iget v0, v0, LJd/v;->a:I

    .line 14
    .line 15
    if-eq p0, v0, :cond_1

    .line 16
    .line 17
    sget-object v0, LJd/v;->i:LJd/v;

    .line 18
    .line 19
    iget v0, v0, LJd/v;->a:I

    .line 20
    .line 21
    if-eq p0, v0, :cond_1

    .line 22
    .line 23
    sget-object v0, LJd/v;->j:LJd/v;

    .line 24
    .line 25
    iget v0, v0, LJd/v;->a:I

    .line 26
    .line 27
    if-eq p0, v0, :cond_1

    .line 28
    .line 29
    sget-object v0, LJd/v;->g:LJd/v;

    .line 30
    .line 31
    iget v0, v0, LJd/v;->a:I

    .line 32
    .line 33
    if-ne p0, v0, :cond_0

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    const/4 p0, 0x0

    .line 37
    return p0

    .line 38
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 39
    return p0
.end method
