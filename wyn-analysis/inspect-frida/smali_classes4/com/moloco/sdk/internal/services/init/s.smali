.class public final Lcom/moloco/sdk/internal/services/init/s;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lcom/moloco/sdk/internal/services/init/f;

.field public final b:Lcom/moloco/sdk/internal/services/init/k;

.field public final c:LKd/a;

.field public d:Lcom/moloco/sdk/K0;


# direct methods
.method public constructor <init>(Lcom/moloco/sdk/internal/services/init/f;Lcom/moloco/sdk/internal/services/init/k;LKd/a;)V
    .locals 1

    .line 1
    const-string v0, "initApi"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/moloco/sdk/internal/services/init/s;->a:Lcom/moloco/sdk/internal/services/init/f;

    .line 10
    .line 11
    iput-object p2, p0, Lcom/moloco/sdk/internal/services/init/s;->b:Lcom/moloco/sdk/internal/services/init/k;

    .line 12
    .line 13
    iput-object p3, p0, Lcom/moloco/sdk/internal/services/init/s;->c:LKd/a;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lcom/moloco/sdk/publisher/MediationInfo;Lcom/moloco/sdk/acm/recorder/b;ZLlf/c;)Ljava/lang/Object;
    .locals 32

    .line 1
    move-object/from16 v0, p5

    .line 2
    .line 3
    instance-of v3, v0, Lcom/moloco/sdk/internal/services/init/q;

    .line 4
    .line 5
    if-eqz v3, :cond_0

    .line 6
    .line 7
    move-object v3, v0

    .line 8
    check-cast v3, Lcom/moloco/sdk/internal/services/init/q;

    .line 9
    .line 10
    iget v4, v3, Lcom/moloco/sdk/internal/services/init/q;->m:I

    .line 11
    .line 12
    const/high16 v5, -0x80000000

    .line 13
    .line 14
    and-int v6, v4, v5

    .line 15
    .line 16
    if-eqz v6, :cond_0

    .line 17
    .line 18
    sub-int/2addr v4, v5

    .line 19
    iput v4, v3, Lcom/moloco/sdk/internal/services/init/q;->m:I

    .line 20
    .line 21
    move-object/from16 v4, p0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v3, Lcom/moloco/sdk/internal/services/init/q;

    .line 25
    .line 26
    move-object/from16 v4, p0

    .line 27
    .line 28
    invoke-direct {v3, v4, v0}, Lcom/moloco/sdk/internal/services/init/q;-><init>(Lcom/moloco/sdk/internal/services/init/s;Llf/c;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v0, v3, Lcom/moloco/sdk/internal/services/init/q;->k:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v5, Lkf/a;->a:Lkf/a;

    .line 34
    .line 35
    iget v6, v3, Lcom/moloco/sdk/internal/services/init/q;->m:I

    .line 36
    .line 37
    sget-object v7, Lef/C;->a:Lef/C;

    .line 38
    .line 39
    const-string v9, "async"

    .line 40
    .line 41
    const-string v10, "attempt"

    .line 42
    .line 43
    const-string v11, "sdk_fetch_init_attempt"

    .line 44
    .line 45
    const/4 v12, 0x5

    .line 46
    const/4 v13, 0x4

    .line 47
    const/4 v14, 0x2

    .line 48
    const/4 v15, 0x3

    .line 49
    const/4 v1, 0x1

    .line 50
    const-string v2, "result"

    .line 51
    .line 52
    if-eqz v6, :cond_6

    .line 53
    .line 54
    if-eq v6, v1, :cond_5

    .line 55
    .line 56
    if-eq v6, v14, :cond_4

    .line 57
    .line 58
    if-eq v6, v15, :cond_3

    .line 59
    .line 60
    if-eq v6, v13, :cond_2

    .line 61
    .line 62
    if-ne v6, v12, :cond_1

    .line 63
    .line 64
    iget v6, v3, Lcom/moloco/sdk/internal/services/init/q;->i:I

    .line 65
    .line 66
    iget v12, v3, Lcom/moloco/sdk/internal/services/init/q;->h:I

    .line 67
    .line 68
    iget-boolean v13, v3, Lcom/moloco/sdk/internal/services/init/q;->g:Z

    .line 69
    .line 70
    iget-object v15, v3, Lcom/moloco/sdk/internal/services/init/q;->e:Lkotlin/jvm/internal/G;

    .line 71
    .line 72
    iget-object v14, v3, Lcom/moloco/sdk/internal/services/init/q;->d:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v14, Lcom/moloco/sdk/acm/recorder/b;

    .line 75
    .line 76
    iget-object v8, v3, Lcom/moloco/sdk/internal/services/init/q;->c:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v8, Lcom/moloco/sdk/publisher/MediationInfo;

    .line 79
    .line 80
    iget-object v1, v3, Lcom/moloco/sdk/internal/services/init/q;->b:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v1, Ljava/lang/String;

    .line 83
    .line 84
    move-object/from16 v21, v0

    .line 85
    .line 86
    iget-object v0, v3, Lcom/moloco/sdk/internal/services/init/q;->a:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v0, Lcom/moloco/sdk/internal/services/init/s;

    .line 89
    .line 90
    invoke-static/range {v21 .. v21}, LFe/e;->U(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    move/from16 v18, v12

    .line 94
    .line 95
    move-object v12, v3

    .line 96
    move-object v3, v14

    .line 97
    move/from16 v14, v18

    .line 98
    .line 99
    move-object/from16 v24, v2

    .line 100
    .line 101
    move-object/from16 v21, v7

    .line 102
    .line 103
    move-object/from16 v23, v11

    .line 104
    .line 105
    const/4 v11, 0x5

    .line 106
    const/16 v18, 0x2

    .line 107
    .line 108
    move-object v2, v0

    .line 109
    move-object v0, v1

    .line 110
    move-object v1, v8

    .line 111
    const/4 v8, 0x4

    .line 112
    :goto_1
    const/16 v20, 0x1

    .line 113
    .line 114
    goto/16 :goto_e

    .line 115
    .line 116
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 117
    .line 118
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 119
    .line 120
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    throw v0

    .line 124
    :cond_2
    move-object/from16 v21, v0

    .line 125
    .line 126
    iget-object v0, v3, Lcom/moloco/sdk/internal/services/init/q;->a:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast v0, Lkotlin/jvm/internal/G;

    .line 129
    .line 130
    invoke-static/range {v21 .. v21}, LFe/e;->U(Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    move-object/from16 v24, v2

    .line 134
    .line 135
    goto/16 :goto_b

    .line 136
    .line 137
    :cond_3
    move-object/from16 v21, v0

    .line 138
    .line 139
    iget v0, v3, Lcom/moloco/sdk/internal/services/init/q;->h:I

    .line 140
    .line 141
    iget-boolean v1, v3, Lcom/moloco/sdk/internal/services/init/q;->g:Z

    .line 142
    .line 143
    iget-object v5, v3, Lcom/moloco/sdk/internal/services/init/q;->b:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast v5, Lcom/moloco/sdk/K0;

    .line 146
    .line 147
    iget-object v3, v3, Lcom/moloco/sdk/internal/services/init/q;->a:Ljava/lang/Object;

    .line 148
    .line 149
    check-cast v3, Lcom/moloco/sdk/acm/recorder/b;

    .line 150
    .line 151
    invoke-static/range {v21 .. v21}, LFe/e;->U(Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    goto/16 :goto_8

    .line 155
    .line 156
    :cond_4
    move-object/from16 v21, v0

    .line 157
    .line 158
    iget v0, v3, Lcom/moloco/sdk/internal/services/init/q;->h:I

    .line 159
    .line 160
    iget-boolean v1, v3, Lcom/moloco/sdk/internal/services/init/q;->g:Z

    .line 161
    .line 162
    iget-object v6, v3, Lcom/moloco/sdk/internal/services/init/q;->d:Ljava/lang/Object;

    .line 163
    .line 164
    check-cast v6, Lcom/moloco/sdk/internal/services/init/k;

    .line 165
    .line 166
    iget-object v8, v3, Lcom/moloco/sdk/internal/services/init/q;->c:Ljava/lang/Object;

    .line 167
    .line 168
    check-cast v8, Lcom/moloco/sdk/internal/services/init/a;

    .line 169
    .line 170
    iget-object v12, v3, Lcom/moloco/sdk/internal/services/init/q;->b:Ljava/lang/Object;

    .line 171
    .line 172
    check-cast v12, Lcom/moloco/sdk/K0;

    .line 173
    .line 174
    iget-object v13, v3, Lcom/moloco/sdk/internal/services/init/q;->a:Ljava/lang/Object;

    .line 175
    .line 176
    check-cast v13, Lcom/moloco/sdk/acm/recorder/b;

    .line 177
    .line 178
    invoke-static/range {v21 .. v21}, LFe/e;->U(Ljava/lang/Object;)V

    .line 179
    .line 180
    .line 181
    move-object/from16 v21, v7

    .line 182
    .line 183
    move-object v14, v8

    .line 184
    :goto_2
    move-object/from16 v16, v6

    .line 185
    .line 186
    move-object v15, v12

    .line 187
    goto/16 :goto_6

    .line 188
    .line 189
    :cond_5
    move-object/from16 v21, v0

    .line 190
    .line 191
    iget v0, v3, Lcom/moloco/sdk/internal/services/init/q;->j:I

    .line 192
    .line 193
    iget v1, v3, Lcom/moloco/sdk/internal/services/init/q;->i:I

    .line 194
    .line 195
    iget v6, v3, Lcom/moloco/sdk/internal/services/init/q;->h:I

    .line 196
    .line 197
    iget-boolean v8, v3, Lcom/moloco/sdk/internal/services/init/q;->g:Z

    .line 198
    .line 199
    iget-object v12, v3, Lcom/moloco/sdk/internal/services/init/q;->f:Lkotlin/jvm/internal/G;

    .line 200
    .line 201
    iget-object v13, v3, Lcom/moloco/sdk/internal/services/init/q;->e:Lkotlin/jvm/internal/G;

    .line 202
    .line 203
    iget-object v14, v3, Lcom/moloco/sdk/internal/services/init/q;->d:Ljava/lang/Object;

    .line 204
    .line 205
    check-cast v14, Lcom/moloco/sdk/acm/recorder/b;

    .line 206
    .line 207
    iget-object v15, v3, Lcom/moloco/sdk/internal/services/init/q;->c:Ljava/lang/Object;

    .line 208
    .line 209
    check-cast v15, Lcom/moloco/sdk/publisher/MediationInfo;

    .line 210
    .line 211
    move/from16 p1, v0

    .line 212
    .line 213
    iget-object v0, v3, Lcom/moloco/sdk/internal/services/init/q;->b:Ljava/lang/Object;

    .line 214
    .line 215
    check-cast v0, Ljava/lang/String;

    .line 216
    .line 217
    move-object/from16 p2, v0

    .line 218
    .line 219
    iget-object v0, v3, Lcom/moloco/sdk/internal/services/init/q;->a:Ljava/lang/Object;

    .line 220
    .line 221
    check-cast v0, Lcom/moloco/sdk/internal/services/init/s;

    .line 222
    .line 223
    invoke-static/range {v21 .. v21}, LFe/e;->U(Ljava/lang/Object;)V

    .line 224
    .line 225
    .line 226
    move-object v4, v15

    .line 227
    move-object v15, v0

    .line 228
    move-object/from16 v0, v21

    .line 229
    .line 230
    move-object/from16 v21, v7

    .line 231
    .line 232
    move-object v7, v13

    .line 233
    move-object v13, v14

    .line 234
    move v14, v6

    .line 235
    move-object v6, v4

    .line 236
    move v4, v8

    .line 237
    move/from16 v8, p1

    .line 238
    .line 239
    move/from16 p1, v1

    .line 240
    .line 241
    move-object/from16 v1, p2

    .line 242
    .line 243
    goto :goto_4

    .line 244
    :cond_6
    move-object/from16 v21, v0

    .line 245
    .line 246
    invoke-static/range {v21 .. v21}, LA7/p0;->s(Ljava/lang/Object;)Lkotlin/jvm/internal/G;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    move-object/from16 v1, p2

    .line 251
    .line 252
    move/from16 v6, p4

    .line 253
    .line 254
    move-object v13, v0

    .line 255
    move-object v12, v3

    .line 256
    move-object v15, v4

    .line 257
    const/4 v8, 0x0

    .line 258
    const/4 v14, 0x3

    .line 259
    move-object/from16 v0, p1

    .line 260
    .line 261
    move-object/from16 v3, p3

    .line 262
    .line 263
    :goto_3
    if-ge v8, v14, :cond_18

    .line 264
    .line 265
    iget-object v4, v15, Lcom/moloco/sdk/internal/services/init/s;->a:Lcom/moloco/sdk/internal/services/init/f;

    .line 266
    .line 267
    iput-object v15, v12, Lcom/moloco/sdk/internal/services/init/q;->a:Ljava/lang/Object;

    .line 268
    .line 269
    iput-object v0, v12, Lcom/moloco/sdk/internal/services/init/q;->b:Ljava/lang/Object;

    .line 270
    .line 271
    iput-object v1, v12, Lcom/moloco/sdk/internal/services/init/q;->c:Ljava/lang/Object;

    .line 272
    .line 273
    iput-object v3, v12, Lcom/moloco/sdk/internal/services/init/q;->d:Ljava/lang/Object;

    .line 274
    .line 275
    iput-object v13, v12, Lcom/moloco/sdk/internal/services/init/q;->e:Lkotlin/jvm/internal/G;

    .line 276
    .line 277
    iput-object v13, v12, Lcom/moloco/sdk/internal/services/init/q;->f:Lkotlin/jvm/internal/G;

    .line 278
    .line 279
    iput-boolean v6, v12, Lcom/moloco/sdk/internal/services/init/q;->g:Z

    .line 280
    .line 281
    iput v14, v12, Lcom/moloco/sdk/internal/services/init/q;->h:I

    .line 282
    .line 283
    iput v8, v12, Lcom/moloco/sdk/internal/services/init/q;->i:I

    .line 284
    .line 285
    iput v8, v12, Lcom/moloco/sdk/internal/services/init/q;->j:I

    .line 286
    .line 287
    move/from16 v21, v6

    .line 288
    .line 289
    const/4 v6, 0x1

    .line 290
    iput v6, v12, Lcom/moloco/sdk/internal/services/init/q;->m:I

    .line 291
    .line 292
    invoke-virtual {v4, v0, v1, v3, v12}, Lcom/moloco/sdk/internal/services/init/f;->a(Ljava/lang/String;Lcom/moloco/sdk/publisher/MediationInfo;Lcom/moloco/sdk/acm/recorder/b;Llf/c;)Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v4

    .line 296
    if-ne v4, v5, :cond_7

    .line 297
    .line 298
    goto/16 :goto_d

    .line 299
    .line 300
    :cond_7
    move-object v6, v1

    .line 301
    move/from16 p1, v8

    .line 302
    .line 303
    move-object v1, v0

    .line 304
    move-object v0, v4

    .line 305
    move/from16 v4, v21

    .line 306
    .line 307
    move-object/from16 v21, v7

    .line 308
    .line 309
    move-object v7, v13

    .line 310
    move-object v13, v3

    .line 311
    move-object v3, v12

    .line 312
    move-object v12, v7

    .line 313
    :goto_4
    iput-object v0, v12, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 314
    .line 315
    iget-object v0, v7, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 316
    .line 317
    if-eqz v0, :cond_17

    .line 318
    .line 319
    check-cast v0, Lcom/moloco/sdk/internal/A;

    .line 320
    .line 321
    instance-of v12, v0, Lcom/moloco/sdk/internal/z;

    .line 322
    .line 323
    if-eqz v12, :cond_c

    .line 324
    .line 325
    check-cast v0, Lcom/moloco/sdk/internal/z;

    .line 326
    .line 327
    iget-object v0, v0, Lcom/moloco/sdk/internal/z;->a:Ljava/lang/Object;

    .line 328
    .line 329
    move-object v12, v0

    .line 330
    check-cast v12, Lcom/moloco/sdk/K0;

    .line 331
    .line 332
    sget-object v22, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 333
    .line 334
    new-instance v0, Ljava/lang/StringBuilder;

    .line 335
    .line 336
    const-string v6, "Init, successful in attempt(#"

    .line 337
    .line 338
    invoke-direct {v0, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 339
    .line 340
    .line 341
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 342
    .line 343
    .line 344
    const/16 v6, 0x29

    .line 345
    .line 346
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 347
    .line 348
    .line 349
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 350
    .line 351
    .line 352
    move-result-object v24

    .line 353
    const/16 v25, 0x0

    .line 354
    .line 355
    const/16 v26, 0x0

    .line 356
    .line 357
    const-string v23, "InitService"

    .line 358
    .line 359
    const/16 v27, 0xc

    .line 360
    .line 361
    const/16 v28, 0x0

    .line 362
    .line 363
    invoke-static/range {v22 .. v28}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 364
    .line 365
    .line 366
    new-instance v0, Lcom/moloco/sdk/internal/services/init/a;

    .line 367
    .line 368
    invoke-direct {v0, v1}, Lcom/moloco/sdk/internal/services/init/a;-><init>(Ljava/lang/String;)V

    .line 369
    .line 370
    .line 371
    iget-object v6, v15, Lcom/moloco/sdk/internal/services/init/s;->b:Lcom/moloco/sdk/internal/services/init/k;

    .line 372
    .line 373
    const-string v23, "InitService"

    .line 374
    .line 375
    const-string v24, "Clearing cache for old init response"

    .line 376
    .line 377
    invoke-static/range {v22 .. v28}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 378
    .line 379
    .line 380
    iput-object v13, v3, Lcom/moloco/sdk/internal/services/init/q;->a:Ljava/lang/Object;

    .line 381
    .line 382
    iput-object v12, v3, Lcom/moloco/sdk/internal/services/init/q;->b:Ljava/lang/Object;

    .line 383
    .line 384
    iput-object v0, v3, Lcom/moloco/sdk/internal/services/init/q;->c:Ljava/lang/Object;

    .line 385
    .line 386
    iput-object v6, v3, Lcom/moloco/sdk/internal/services/init/q;->d:Ljava/lang/Object;

    .line 387
    .line 388
    const/4 v1, 0x0

    .line 389
    iput-object v1, v3, Lcom/moloco/sdk/internal/services/init/q;->e:Lkotlin/jvm/internal/G;

    .line 390
    .line 391
    iput-object v1, v3, Lcom/moloco/sdk/internal/services/init/q;->f:Lkotlin/jvm/internal/G;

    .line 392
    .line 393
    iput-boolean v4, v3, Lcom/moloco/sdk/internal/services/init/q;->g:Z

    .line 394
    .line 395
    iput v8, v3, Lcom/moloco/sdk/internal/services/init/q;->h:I

    .line 396
    .line 397
    const/4 v7, 0x2

    .line 398
    iput v7, v3, Lcom/moloco/sdk/internal/services/init/q;->m:I

    .line 399
    .line 400
    new-instance v7, Lcom/moloco/sdk/internal/services/init/h;

    .line 401
    .line 402
    invoke-direct {v7, v13, v0, v6, v1}, Lcom/moloco/sdk/internal/services/init/h;-><init>(Lcom/moloco/sdk/acm/recorder/b;Lcom/moloco/sdk/internal/services/init/a;Lcom/moloco/sdk/internal/services/init/k;Ljf/c;)V

    .line 403
    .line 404
    .line 405
    iget-object v1, v6, Lcom/moloco/sdk/internal/services/init/k;->b:LLf/d;

    .line 406
    .line 407
    invoke-static {v1, v7, v3}, LEf/H;->P(Ljf/h;Ltf/p;Ljf/c;)Ljava/lang/Object;

    .line 408
    .line 409
    .line 410
    move-result-object v1

    .line 411
    sget-object v7, Lkf/a;->a:Lkf/a;

    .line 412
    .line 413
    if-ne v1, v7, :cond_8

    .line 414
    .line 415
    goto :goto_5

    .line 416
    :cond_8
    move-object/from16 v1, v21

    .line 417
    .line 418
    :goto_5
    if-ne v1, v5, :cond_9

    .line 419
    .line 420
    goto/16 :goto_d

    .line 421
    .line 422
    :cond_9
    move-object v14, v0

    .line 423
    move v1, v4

    .line 424
    move v0, v8

    .line 425
    goto/16 :goto_2

    .line 426
    .line 427
    :goto_6
    sget-object v22, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 428
    .line 429
    const/16 v25, 0x0

    .line 430
    .line 431
    const/16 v26, 0x0

    .line 432
    .line 433
    const-string v23, "InitService"

    .line 434
    .line 435
    const-string v24, "Updating cache to new init response"

    .line 436
    .line 437
    const/16 v27, 0xc

    .line 438
    .line 439
    const/16 v28, 0x0

    .line 440
    .line 441
    invoke-static/range {v22 .. v28}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 442
    .line 443
    .line 444
    iput-object v13, v3, Lcom/moloco/sdk/internal/services/init/q;->a:Ljava/lang/Object;

    .line 445
    .line 446
    iput-object v15, v3, Lcom/moloco/sdk/internal/services/init/q;->b:Ljava/lang/Object;

    .line 447
    .line 448
    const/4 v4, 0x0

    .line 449
    iput-object v4, v3, Lcom/moloco/sdk/internal/services/init/q;->c:Ljava/lang/Object;

    .line 450
    .line 451
    iput-object v4, v3, Lcom/moloco/sdk/internal/services/init/q;->d:Ljava/lang/Object;

    .line 452
    .line 453
    iput-boolean v1, v3, Lcom/moloco/sdk/internal/services/init/q;->g:Z

    .line 454
    .line 455
    iput v0, v3, Lcom/moloco/sdk/internal/services/init/q;->h:I

    .line 456
    .line 457
    const/4 v12, 0x3

    .line 458
    iput v12, v3, Lcom/moloco/sdk/internal/services/init/q;->m:I

    .line 459
    .line 460
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 461
    .line 462
    .line 463
    new-instance v12, Lcom/moloco/sdk/internal/services/init/j;

    .line 464
    .line 465
    const/16 v17, 0x0

    .line 466
    .line 467
    invoke-direct/range {v12 .. v17}, Lcom/moloco/sdk/internal/services/init/j;-><init>(Lcom/moloco/sdk/acm/recorder/b;Lcom/moloco/sdk/internal/services/init/a;Lcom/moloco/sdk/K0;Lcom/moloco/sdk/internal/services/init/k;Ljf/c;)V

    .line 468
    .line 469
    .line 470
    move-object/from16 v6, v16

    .line 471
    .line 472
    iget-object v4, v6, Lcom/moloco/sdk/internal/services/init/k;->b:LLf/d;

    .line 473
    .line 474
    invoke-static {v4, v12, v3}, LEf/H;->P(Ljf/h;Ltf/p;Ljf/c;)Ljava/lang/Object;

    .line 475
    .line 476
    .line 477
    move-result-object v3

    .line 478
    sget-object v4, Lkf/a;->a:Lkf/a;

    .line 479
    .line 480
    if-ne v3, v4, :cond_a

    .line 481
    .line 482
    move-object v7, v3

    .line 483
    goto :goto_7

    .line 484
    :cond_a
    move-object/from16 v7, v21

    .line 485
    .line 486
    :goto_7
    if-ne v7, v5, :cond_b

    .line 487
    .line 488
    goto/16 :goto_d

    .line 489
    .line 490
    :cond_b
    move-object v3, v13

    .line 491
    move-object v5, v15

    .line 492
    :goto_8
    new-instance v4, Lcom/moloco/sdk/acm/h;

    .line 493
    .line 494
    sget-object v6, Lcom/moloco/sdk/internal/client_metrics_data/a;->b:[Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 495
    .line 496
    invoke-direct {v4, v11}, Lcom/moloco/sdk/acm/h;-><init>(Ljava/lang/String;)V

    .line 497
    .line 498
    .line 499
    sget-object v6, Lcom/moloco/sdk/internal/client_metrics_data/b;->a:[Lcom/moloco/sdk/internal/client_metrics_data/b;

    .line 500
    .line 501
    const-string v6, "success"

    .line 502
    .line 503
    invoke-virtual {v4, v2, v6}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 504
    .line 505
    .line 506
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 507
    .line 508
    .line 509
    move-result-object v0

    .line 510
    invoke-virtual {v4, v10, v0}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 511
    .line 512
    .line 513
    invoke-static {v1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 514
    .line 515
    .line 516
    move-result-object v0

    .line 517
    invoke-virtual {v4, v9, v0}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 518
    .line 519
    .line 520
    check-cast v3, Lcom/moloco/sdk/acm/recorder/c;

    .line 521
    .line 522
    invoke-virtual {v3, v4}, Lcom/moloco/sdk/acm/recorder/c;->a(Lcom/moloco/sdk/acm/h;)V

    .line 523
    .line 524
    .line 525
    new-instance v0, Lcom/moloco/sdk/internal/z;

    .line 526
    .line 527
    invoke-direct {v0, v5}, Lcom/moloco/sdk/internal/z;-><init>(Ljava/lang/Object;)V

    .line 528
    .line 529
    .line 530
    return-object v0

    .line 531
    :cond_c
    const/16 v18, 0x2

    .line 532
    .line 533
    instance-of v12, v0, Lcom/moloco/sdk/internal/y;

    .line 534
    .line 535
    if-eqz v12, :cond_16

    .line 536
    .line 537
    check-cast v0, Lcom/moloco/sdk/internal/y;

    .line 538
    .line 539
    iget-object v0, v0, Lcom/moloco/sdk/internal/y;->a:Ljava/lang/Object;

    .line 540
    .line 541
    move-object v12, v0

    .line 542
    check-cast v12, Lcom/moloco/sdk/internal/services/init/n;

    .line 543
    .line 544
    move-object/from16 v22, v13

    .line 545
    .line 546
    instance-of v13, v12, Lcom/moloco/sdk/internal/services/init/l;

    .line 547
    .line 548
    if-eqz v13, :cond_d

    .line 549
    .line 550
    check-cast v12, Lcom/moloco/sdk/internal/services/init/l;

    .line 551
    .line 552
    iget-object v12, v12, Lcom/moloco/sdk/internal/services/init/l;->a:Lcom/moloco/sdk/internal/services/init/b;

    .line 553
    .line 554
    goto :goto_9

    .line 555
    :cond_d
    instance-of v13, v12, Lcom/moloco/sdk/internal/services/init/m;

    .line 556
    .line 557
    if-eqz v13, :cond_15

    .line 558
    .line 559
    check-cast v12, Lcom/moloco/sdk/internal/services/init/m;

    .line 560
    .line 561
    iget v12, v12, Lcom/moloco/sdk/internal/services/init/m;->a:I

    .line 562
    .line 563
    invoke-static {v12}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 564
    .line 565
    .line 566
    move-result-object v12

    .line 567
    :goto_9
    new-instance v13, Lcom/moloco/sdk/acm/h;

    .line 568
    .line 569
    sget-object v23, Lcom/moloco/sdk/internal/client_metrics_data/a;->b:[Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 570
    .line 571
    invoke-direct {v13, v11}, Lcom/moloco/sdk/acm/h;-><init>(Ljava/lang/String;)V

    .line 572
    .line 573
    .line 574
    sget-object v23, Lcom/moloco/sdk/internal/client_metrics_data/b;->a:[Lcom/moloco/sdk/internal/client_metrics_data/b;

    .line 575
    .line 576
    move-object/from16 v23, v11

    .line 577
    .line 578
    const-string v11, "failure"

    .line 579
    .line 580
    invoke-virtual {v13, v2, v11}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 581
    .line 582
    .line 583
    invoke-static {v8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 584
    .line 585
    .line 586
    move-result-object v11

    .line 587
    invoke-virtual {v13, v10, v11}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 588
    .line 589
    .line 590
    invoke-static {v12}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 591
    .line 592
    .line 593
    move-result-object v11

    .line 594
    move-object/from16 v24, v2

    .line 595
    .line 596
    const-string v2, "reason"

    .line 597
    .line 598
    invoke-virtual {v13, v2, v11}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 599
    .line 600
    .line 601
    invoke-static {v4}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 602
    .line 603
    .line 604
    move-result-object v2

    .line 605
    invoke-virtual {v13, v9, v2}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 606
    .line 607
    .line 608
    move-object/from16 v2, v22

    .line 609
    .line 610
    check-cast v2, Lcom/moloco/sdk/acm/recorder/c;

    .line 611
    .line 612
    invoke-virtual {v2, v13}, Lcom/moloco/sdk/acm/recorder/c;->a(Lcom/moloco/sdk/acm/h;)V

    .line 613
    .line 614
    .line 615
    sget-object v25, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 616
    .line 617
    new-instance v11, Ljava/lang/StringBuilder;

    .line 618
    .line 619
    const-string v13, "Init attempt(#"

    .line 620
    .line 621
    invoke-direct {v11, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 622
    .line 623
    .line 624
    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 625
    .line 626
    .line 627
    const-string v8, ") failed with error: "

    .line 628
    .line 629
    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 630
    .line 631
    .line 632
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 633
    .line 634
    .line 635
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 636
    .line 637
    .line 638
    move-result-object v27

    .line 639
    const/16 v28, 0x0

    .line 640
    .line 641
    const/16 v29, 0x0

    .line 642
    .line 643
    const-string v26, "InitService"

    .line 644
    .line 645
    const/16 v30, 0xc

    .line 646
    .line 647
    const/16 v31, 0x0

    .line 648
    .line 649
    invoke-static/range {v25 .. v31}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 650
    .line 651
    .line 652
    instance-of v8, v0, Lcom/moloco/sdk/internal/services/init/m;

    .line 653
    .line 654
    if-eqz v8, :cond_13

    .line 655
    .line 656
    move-object v8, v0

    .line 657
    check-cast v8, Lcom/moloco/sdk/internal/services/init/m;

    .line 658
    .line 659
    iget v11, v8, Lcom/moloco/sdk/internal/services/init/m;->a:I

    .line 660
    .line 661
    sget-object v12, LJd/v;->n:LJd/v;

    .line 662
    .line 663
    iget v12, v12, LJd/v;->a:I

    .line 664
    .line 665
    if-eq v11, v12, :cond_13

    .line 666
    .line 667
    sget-object v12, LJd/v;->m:LJd/v;

    .line 668
    .line 669
    iget v12, v12, LJd/v;->a:I

    .line 670
    .line 671
    if-eq v11, v12, :cond_13

    .line 672
    .line 673
    const/16 v12, 0x190

    .line 674
    .line 675
    if-lt v11, v12, :cond_13

    .line 676
    .line 677
    const/16 v12, 0x1f4

    .line 678
    .line 679
    if-lt v11, v12, :cond_e

    .line 680
    .line 681
    goto/16 :goto_c

    .line 682
    .line 683
    :cond_e
    instance-of v4, v0, Lcom/moloco/sdk/internal/services/init/m;

    .line 684
    .line 685
    if-eqz v4, :cond_10

    .line 686
    .line 687
    new-instance v0, Ljava/lang/StringBuilder;

    .line 688
    .line 689
    const-string v4, "Init response is non-retryable server failure: "

    .line 690
    .line 691
    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 692
    .line 693
    .line 694
    iget v4, v8, Lcom/moloco/sdk/internal/services/init/m;->a:I

    .line 695
    .line 696
    const-string v6, ", clearing cache"

    .line 697
    .line 698
    invoke-static {v4, v6, v0}, LA7/p0;->j(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 699
    .line 700
    .line 701
    move-result-object v27

    .line 702
    const/16 v28, 0x0

    .line 703
    .line 704
    const/16 v29, 0x0

    .line 705
    .line 706
    const-string v26, "InitService"

    .line 707
    .line 708
    const/16 v30, 0xc

    .line 709
    .line 710
    const/16 v31, 0x0

    .line 711
    .line 712
    invoke-static/range {v25 .. v31}, Lcom/moloco/sdk/internal/MolocoLogger;->error$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 713
    .line 714
    .line 715
    iget-object v0, v15, Lcom/moloco/sdk/internal/services/init/s;->b:Lcom/moloco/sdk/internal/services/init/k;

    .line 716
    .line 717
    new-instance v4, Lcom/moloco/sdk/internal/services/init/a;

    .line 718
    .line 719
    invoke-direct {v4, v1}, Lcom/moloco/sdk/internal/services/init/a;-><init>(Ljava/lang/String;)V

    .line 720
    .line 721
    .line 722
    iput-object v7, v3, Lcom/moloco/sdk/internal/services/init/q;->a:Ljava/lang/Object;

    .line 723
    .line 724
    const/4 v1, 0x0

    .line 725
    iput-object v1, v3, Lcom/moloco/sdk/internal/services/init/q;->b:Ljava/lang/Object;

    .line 726
    .line 727
    iput-object v1, v3, Lcom/moloco/sdk/internal/services/init/q;->c:Ljava/lang/Object;

    .line 728
    .line 729
    iput-object v1, v3, Lcom/moloco/sdk/internal/services/init/q;->d:Ljava/lang/Object;

    .line 730
    .line 731
    iput-object v1, v3, Lcom/moloco/sdk/internal/services/init/q;->e:Lkotlin/jvm/internal/G;

    .line 732
    .line 733
    iput-object v1, v3, Lcom/moloco/sdk/internal/services/init/q;->f:Lkotlin/jvm/internal/G;

    .line 734
    .line 735
    const/4 v8, 0x4

    .line 736
    iput v8, v3, Lcom/moloco/sdk/internal/services/init/q;->m:I

    .line 737
    .line 738
    new-instance v6, Lcom/moloco/sdk/internal/services/init/h;

    .line 739
    .line 740
    invoke-direct {v6, v2, v4, v0, v1}, Lcom/moloco/sdk/internal/services/init/h;-><init>(Lcom/moloco/sdk/acm/recorder/b;Lcom/moloco/sdk/internal/services/init/a;Lcom/moloco/sdk/internal/services/init/k;Ljf/c;)V

    .line 741
    .line 742
    .line 743
    iget-object v0, v0, Lcom/moloco/sdk/internal/services/init/k;->b:LLf/d;

    .line 744
    .line 745
    invoke-static {v0, v6, v3}, LEf/H;->P(Ljf/h;Ltf/p;Ljf/c;)Ljava/lang/Object;

    .line 746
    .line 747
    .line 748
    move-result-object v0

    .line 749
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 750
    .line 751
    if-ne v0, v1, :cond_f

    .line 752
    .line 753
    goto :goto_a

    .line 754
    :cond_f
    move-object/from16 v0, v21

    .line 755
    .line 756
    :goto_a
    if-ne v0, v5, :cond_11

    .line 757
    .line 758
    goto :goto_d

    .line 759
    :cond_10
    new-instance v1, Ljava/lang/StringBuilder;

    .line 760
    .line 761
    const-string v2, "Init response is non-retryable server or client failure: "

    .line 762
    .line 763
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 764
    .line 765
    .line 766
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 767
    .line 768
    .line 769
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 770
    .line 771
    .line 772
    move-result-object v27

    .line 773
    const/16 v28, 0x0

    .line 774
    .line 775
    const/16 v29, 0x0

    .line 776
    .line 777
    const-string v26, "InitService"

    .line 778
    .line 779
    const/16 v30, 0xc

    .line 780
    .line 781
    const/16 v31, 0x0

    .line 782
    .line 783
    invoke-static/range {v25 .. v31}, Lcom/moloco/sdk/internal/MolocoLogger;->error$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 784
    .line 785
    .line 786
    :cond_11
    move-object v0, v7

    .line 787
    :goto_b
    iget-object v0, v0, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 788
    .line 789
    if-eqz v0, :cond_12

    .line 790
    .line 791
    check-cast v0, Lcom/moloco/sdk/internal/A;

    .line 792
    .line 793
    return-object v0

    .line 794
    :cond_12
    invoke-static/range {v24 .. v24}, Lkotlin/jvm/internal/k;->m(Ljava/lang/String;)V

    .line 795
    .line 796
    .line 797
    const/4 v0, 0x0

    .line 798
    throw v0

    .line 799
    :cond_13
    :goto_c
    const/4 v0, 0x0

    .line 800
    const/4 v8, 0x4

    .line 801
    iput-object v15, v3, Lcom/moloco/sdk/internal/services/init/q;->a:Ljava/lang/Object;

    .line 802
    .line 803
    iput-object v1, v3, Lcom/moloco/sdk/internal/services/init/q;->b:Ljava/lang/Object;

    .line 804
    .line 805
    iput-object v6, v3, Lcom/moloco/sdk/internal/services/init/q;->c:Ljava/lang/Object;

    .line 806
    .line 807
    iput-object v2, v3, Lcom/moloco/sdk/internal/services/init/q;->d:Ljava/lang/Object;

    .line 808
    .line 809
    iput-object v7, v3, Lcom/moloco/sdk/internal/services/init/q;->e:Lkotlin/jvm/internal/G;

    .line 810
    .line 811
    iput-object v0, v3, Lcom/moloco/sdk/internal/services/init/q;->f:Lkotlin/jvm/internal/G;

    .line 812
    .line 813
    iput-boolean v4, v3, Lcom/moloco/sdk/internal/services/init/q;->g:Z

    .line 814
    .line 815
    iput v14, v3, Lcom/moloco/sdk/internal/services/init/q;->h:I

    .line 816
    .line 817
    move/from16 v0, p1

    .line 818
    .line 819
    iput v0, v3, Lcom/moloco/sdk/internal/services/init/q;->i:I

    .line 820
    .line 821
    const/4 v11, 0x5

    .line 822
    iput v11, v3, Lcom/moloco/sdk/internal/services/init/q;->m:I

    .line 823
    .line 824
    const-wide/16 v12, 0x3e8

    .line 825
    .line 826
    invoke-static {v12, v13, v3}, LEf/H;->m(JLjf/c;)Ljava/lang/Object;

    .line 827
    .line 828
    .line 829
    move-result-object v12

    .line 830
    if-ne v12, v5, :cond_14

    .line 831
    .line 832
    :goto_d
    return-object v5

    .line 833
    :cond_14
    move-object v12, v6

    .line 834
    move v6, v0

    .line 835
    move-object v0, v1

    .line 836
    move-object v1, v12

    .line 837
    move-object v12, v3

    .line 838
    move v13, v4

    .line 839
    move-object v3, v2

    .line 840
    move-object v2, v15

    .line 841
    move-object v15, v7

    .line 842
    goto/16 :goto_1

    .line 843
    .line 844
    :goto_e
    add-int/lit8 v4, v6, 0x1

    .line 845
    .line 846
    move v8, v4

    .line 847
    move v6, v13

    .line 848
    move-object v13, v15

    .line 849
    move-object/from16 v7, v21

    .line 850
    .line 851
    move-object/from16 v11, v23

    .line 852
    .line 853
    move-object/from16 v4, p0

    .line 854
    .line 855
    move-object v15, v2

    .line 856
    move-object/from16 v2, v24

    .line 857
    .line 858
    goto/16 :goto_3

    .line 859
    .line 860
    :cond_15
    new-instance v0, LE5/Q;

    .line 861
    .line 862
    const/4 v1, 0x0

    .line 863
    const/16 v2, 0x9

    .line 864
    .line 865
    invoke-direct {v0, v1, v2}, LE5/Q;-><init>(BI)V

    .line 866
    .line 867
    .line 868
    throw v0

    .line 869
    :cond_16
    const/4 v1, 0x0

    .line 870
    const/16 v2, 0x9

    .line 871
    .line 872
    new-instance v0, LE5/Q;

    .line 873
    .line 874
    invoke-direct {v0, v1, v2}, LE5/Q;-><init>(BI)V

    .line 875
    .line 876
    .line 877
    throw v0

    .line 878
    :cond_17
    move-object/from16 v24, v2

    .line 879
    .line 880
    invoke-static/range {v24 .. v24}, Lkotlin/jvm/internal/k;->m(Ljava/lang/String;)V

    .line 881
    .line 882
    .line 883
    const/16 v19, 0x0

    .line 884
    .line 885
    throw v19

    .line 886
    :cond_18
    move-object/from16 v24, v2

    .line 887
    .line 888
    sget-object v0, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 889
    .line 890
    new-instance v1, Ljava/lang/StringBuilder;

    .line 891
    .line 892
    const-string v2, "Moloco SDK Init failed after all retries: "

    .line 893
    .line 894
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 895
    .line 896
    .line 897
    iget-object v2, v13, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 898
    .line 899
    if-eqz v2, :cond_1a

    .line 900
    .line 901
    check-cast v2, Lcom/moloco/sdk/internal/A;

    .line 902
    .line 903
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 904
    .line 905
    .line 906
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 907
    .line 908
    .line 909
    move-result-object v2

    .line 910
    const/4 v3, 0x0

    .line 911
    const/4 v4, 0x0

    .line 912
    const-string v1, "InitService"

    .line 913
    .line 914
    const/16 v5, 0xc

    .line 915
    .line 916
    const/4 v6, 0x0

    .line 917
    invoke-static/range {v0 .. v6}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 918
    .line 919
    .line 920
    iget-object v0, v13, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 921
    .line 922
    if-eqz v0, :cond_19

    .line 923
    .line 924
    check-cast v0, Lcom/moloco/sdk/internal/A;

    .line 925
    .line 926
    return-object v0

    .line 927
    :cond_19
    invoke-static/range {v24 .. v24}, Lkotlin/jvm/internal/k;->m(Ljava/lang/String;)V

    .line 928
    .line 929
    .line 930
    const/16 v19, 0x0

    .line 931
    .line 932
    throw v19

    .line 933
    :cond_1a
    const/16 v19, 0x0

    .line 934
    .line 935
    invoke-static/range {v24 .. v24}, Lkotlin/jvm/internal/k;->m(Ljava/lang/String;)V

    .line 936
    .line 937
    .line 938
    throw v19
.end method

.method public final b(Ljava/lang/String;Lcom/moloco/sdk/publisher/MediationInfo;Lcom/moloco/sdk/acm/recorder/c;Llf/c;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    move-object/from16 v3, p4

    .line 8
    .line 9
    instance-of v4, v3, Lcom/moloco/sdk/internal/services/init/o;

    .line 10
    .line 11
    if-eqz v4, :cond_0

    .line 12
    .line 13
    move-object v4, v3

    .line 14
    check-cast v4, Lcom/moloco/sdk/internal/services/init/o;

    .line 15
    .line 16
    iget v5, v4, Lcom/moloco/sdk/internal/services/init/o;->g:I

    .line 17
    .line 18
    const/high16 v6, -0x80000000

    .line 19
    .line 20
    and-int v7, v5, v6

    .line 21
    .line 22
    if-eqz v7, :cond_0

    .line 23
    .line 24
    sub-int/2addr v5, v6

    .line 25
    iput v5, v4, Lcom/moloco/sdk/internal/services/init/o;->g:I

    .line 26
    .line 27
    :goto_0
    move-object v10, v4

    .line 28
    goto :goto_1

    .line 29
    :cond_0
    new-instance v4, Lcom/moloco/sdk/internal/services/init/o;

    .line 30
    .line 31
    invoke-direct {v4, v0, v3}, Lcom/moloco/sdk/internal/services/init/o;-><init>(Lcom/moloco/sdk/internal/services/init/s;Llf/c;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :goto_1
    iget-object v3, v10, Lcom/moloco/sdk/internal/services/init/o;->e:Ljava/lang/Object;

    .line 36
    .line 37
    sget-object v4, Lkf/a;->a:Lkf/a;

    .line 38
    .line 39
    iget v5, v10, Lcom/moloco/sdk/internal/services/init/o;->g:I

    .line 40
    .line 41
    const/4 v6, 0x0

    .line 42
    const/4 v7, 0x2

    .line 43
    const/4 v8, 0x1

    .line 44
    if-eqz v5, :cond_3

    .line 45
    .line 46
    if-eq v5, v8, :cond_2

    .line 47
    .line 48
    if-ne v5, v7, :cond_1

    .line 49
    .line 50
    iget-object v1, v10, Lcom/moloco/sdk/internal/services/init/o;->a:Lcom/moloco/sdk/internal/services/init/s;

    .line 51
    .line 52
    invoke-static {v3}, LFe/e;->U(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    goto/16 :goto_4

    .line 56
    .line 57
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 58
    .line 59
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 60
    .line 61
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw v1

    .line 65
    :cond_2
    iget-object v1, v10, Lcom/moloco/sdk/internal/services/init/o;->d:Lcom/moloco/sdk/acm/recorder/b;

    .line 66
    .line 67
    iget-object v2, v10, Lcom/moloco/sdk/internal/services/init/o;->c:Lcom/moloco/sdk/publisher/MediationInfo;

    .line 68
    .line 69
    iget-object v5, v10, Lcom/moloco/sdk/internal/services/init/o;->b:Ljava/lang/String;

    .line 70
    .line 71
    iget-object v8, v10, Lcom/moloco/sdk/internal/services/init/o;->a:Lcom/moloco/sdk/internal/services/init/s;

    .line 72
    .line 73
    invoke-static {v3}, LFe/e;->U(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    move-object v15, v1

    .line 77
    move-object v14, v2

    .line 78
    move-object v13, v5

    .line 79
    move-object v12, v8

    .line 80
    goto :goto_2

    .line 81
    :cond_3
    invoke-static {v3}, LFe/e;->U(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    iget-object v3, v0, Lcom/moloco/sdk/internal/services/init/s;->d:Lcom/moloco/sdk/K0;

    .line 85
    .line 86
    if-eqz v3, :cond_4

    .line 87
    .line 88
    sget-object v11, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 89
    .line 90
    const/4 v14, 0x0

    .line 91
    const/4 v15, 0x0

    .line 92
    const-string v12, "InitService"

    .line 93
    .line 94
    const-string v13, "Returning current session init response"

    .line 95
    .line 96
    const/16 v16, 0xc

    .line 97
    .line 98
    const/16 v17, 0x0

    .line 99
    .line 100
    invoke-static/range {v11 .. v17}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    new-instance v1, Lcom/moloco/sdk/internal/services/init/c;

    .line 104
    .line 105
    new-instance v2, Lcom/moloco/sdk/internal/z;

    .line 106
    .line 107
    invoke-direct {v2, v3}, Lcom/moloco/sdk/internal/z;-><init>(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    const-string v3, "in_memory"

    .line 111
    .line 112
    invoke-direct {v1, v2, v3}, Lcom/moloco/sdk/internal/services/init/c;-><init>(Lcom/moloco/sdk/internal/A;Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    return-object v1

    .line 116
    :cond_4
    new-instance v3, Lcom/moloco/sdk/internal/services/init/a;

    .line 117
    .line 118
    invoke-direct {v3, v1}, Lcom/moloco/sdk/internal/services/init/a;-><init>(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    iput-object v0, v10, Lcom/moloco/sdk/internal/services/init/o;->a:Lcom/moloco/sdk/internal/services/init/s;

    .line 122
    .line 123
    iput-object v1, v10, Lcom/moloco/sdk/internal/services/init/o;->b:Ljava/lang/String;

    .line 124
    .line 125
    move-object/from16 v5, p2

    .line 126
    .line 127
    iput-object v5, v10, Lcom/moloco/sdk/internal/services/init/o;->c:Lcom/moloco/sdk/publisher/MediationInfo;

    .line 128
    .line 129
    iput-object v2, v10, Lcom/moloco/sdk/internal/services/init/o;->d:Lcom/moloco/sdk/acm/recorder/b;

    .line 130
    .line 131
    iput v8, v10, Lcom/moloco/sdk/internal/services/init/o;->g:I

    .line 132
    .line 133
    iget-object v8, v0, Lcom/moloco/sdk/internal/services/init/s;->b:Lcom/moloco/sdk/internal/services/init/k;

    .line 134
    .line 135
    new-instance v9, Lcom/moloco/sdk/internal/services/init/i;

    .line 136
    .line 137
    invoke-direct {v9, v2, v3, v8, v6}, Lcom/moloco/sdk/internal/services/init/i;-><init>(Lcom/moloco/sdk/acm/recorder/c;Lcom/moloco/sdk/internal/services/init/a;Lcom/moloco/sdk/internal/services/init/k;Ljf/c;)V

    .line 138
    .line 139
    .line 140
    iget-object v3, v8, Lcom/moloco/sdk/internal/services/init/k;->b:LLf/d;

    .line 141
    .line 142
    invoke-static {v3, v9, v10}, LEf/H;->P(Ljf/h;Ltf/p;Ljf/c;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v3

    .line 146
    if-ne v3, v4, :cond_5

    .line 147
    .line 148
    goto :goto_3

    .line 149
    :cond_5
    move-object v12, v0

    .line 150
    move-object v13, v1

    .line 151
    move-object v15, v2

    .line 152
    move-object v14, v5

    .line 153
    :goto_2
    check-cast v3, Lcom/moloco/sdk/K0;

    .line 154
    .line 155
    if-eqz v3, :cond_6

    .line 156
    .line 157
    sget-object v16, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 158
    .line 159
    const/16 v19, 0x0

    .line 160
    .line 161
    const/16 v20, 0x0

    .line 162
    .line 163
    const-string v17, "InitService"

    .line 164
    .line 165
    const-string v18, "Returning cached init response"

    .line 166
    .line 167
    const/16 v21, 0xc

    .line 168
    .line 169
    const/16 v22, 0x0

    .line 170
    .line 171
    invoke-static/range {v16 .. v22}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    iput-object v3, v12, Lcom/moloco/sdk/internal/services/init/s;->d:Lcom/moloco/sdk/K0;

    .line 175
    .line 176
    new-instance v11, Lcom/moloco/sdk/internal/services/init/p;

    .line 177
    .line 178
    const/16 v16, 0x0

    .line 179
    .line 180
    invoke-direct/range {v11 .. v16}, Lcom/moloco/sdk/internal/services/init/p;-><init>(Lcom/moloco/sdk/internal/services/init/s;Ljava/lang/String;Lcom/moloco/sdk/publisher/MediationInfo;Lcom/moloco/sdk/acm/recorder/b;Ljf/c;)V

    .line 181
    .line 182
    .line 183
    iget-object v1, v12, Lcom/moloco/sdk/internal/services/init/s;->c:LKd/a;

    .line 184
    .line 185
    const/4 v2, 0x3

    .line 186
    invoke-static {v1, v6, v11, v2}, LEf/H;->D(LEf/E;Ljf/h;Ltf/p;I)LEf/H0;

    .line 187
    .line 188
    .line 189
    new-instance v1, Lcom/moloco/sdk/internal/services/init/c;

    .line 190
    .line 191
    new-instance v2, Lcom/moloco/sdk/internal/z;

    .line 192
    .line 193
    invoke-direct {v2, v3}, Lcom/moloco/sdk/internal/z;-><init>(Ljava/lang/Object;)V

    .line 194
    .line 195
    .line 196
    const-string v3, "cache"

    .line 197
    .line 198
    invoke-direct {v1, v2, v3}, Lcom/moloco/sdk/internal/services/init/c;-><init>(Lcom/moloco/sdk/internal/A;Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    return-object v1

    .line 202
    :cond_6
    sget-object v16, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 203
    .line 204
    const/16 v19, 0x0

    .line 205
    .line 206
    const/16 v20, 0x0

    .line 207
    .line 208
    const-string v17, "InitService"

    .line 209
    .line 210
    const-string v18, "No cached response, fetching from server"

    .line 211
    .line 212
    const/16 v21, 0xc

    .line 213
    .line 214
    const/16 v22, 0x0

    .line 215
    .line 216
    invoke-static/range {v16 .. v22}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 217
    .line 218
    .line 219
    iput-object v12, v10, Lcom/moloco/sdk/internal/services/init/o;->a:Lcom/moloco/sdk/internal/services/init/s;

    .line 220
    .line 221
    iput-object v6, v10, Lcom/moloco/sdk/internal/services/init/o;->b:Ljava/lang/String;

    .line 222
    .line 223
    iput-object v6, v10, Lcom/moloco/sdk/internal/services/init/o;->c:Lcom/moloco/sdk/publisher/MediationInfo;

    .line 224
    .line 225
    iput-object v6, v10, Lcom/moloco/sdk/internal/services/init/o;->d:Lcom/moloco/sdk/acm/recorder/b;

    .line 226
    .line 227
    iput v7, v10, Lcom/moloco/sdk/internal/services/init/o;->g:I

    .line 228
    .line 229
    const/4 v9, 0x0

    .line 230
    move-object v5, v12

    .line 231
    move-object v6, v13

    .line 232
    move-object v7, v14

    .line 233
    move-object v8, v15

    .line 234
    invoke-virtual/range {v5 .. v10}, Lcom/moloco/sdk/internal/services/init/s;->a(Ljava/lang/String;Lcom/moloco/sdk/publisher/MediationInfo;Lcom/moloco/sdk/acm/recorder/b;ZLlf/c;)Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v3

    .line 238
    if-ne v3, v4, :cond_7

    .line 239
    .line 240
    :goto_3
    return-object v4

    .line 241
    :cond_7
    move-object v1, v12

    .line 242
    :goto_4
    check-cast v3, Lcom/moloco/sdk/internal/A;

    .line 243
    .line 244
    instance-of v2, v3, Lcom/moloco/sdk/internal/z;

    .line 245
    .line 246
    if-eqz v2, :cond_8

    .line 247
    .line 248
    move-object v2, v3

    .line 249
    check-cast v2, Lcom/moloco/sdk/internal/z;

    .line 250
    .line 251
    iget-object v2, v2, Lcom/moloco/sdk/internal/z;->a:Ljava/lang/Object;

    .line 252
    .line 253
    check-cast v2, Lcom/moloco/sdk/K0;

    .line 254
    .line 255
    iput-object v2, v1, Lcom/moloco/sdk/internal/services/init/s;->d:Lcom/moloco/sdk/K0;

    .line 256
    .line 257
    goto :goto_5

    .line 258
    :cond_8
    instance-of v1, v3, Lcom/moloco/sdk/internal/y;

    .line 259
    .line 260
    if-eqz v1, :cond_9

    .line 261
    .line 262
    sget-object v4, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 263
    .line 264
    const/4 v7, 0x0

    .line 265
    const/4 v8, 0x0

    .line 266
    const-string v5, "InitService"

    .line 267
    .line 268
    const-string v6, "Fetching init response failed"

    .line 269
    .line 270
    const/16 v9, 0xc

    .line 271
    .line 272
    const/4 v10, 0x0

    .line 273
    invoke-static/range {v4 .. v10}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 274
    .line 275
    .line 276
    :goto_5
    new-instance v1, Lcom/moloco/sdk/internal/services/init/c;

    .line 277
    .line 278
    const-string v2, "network"

    .line 279
    .line 280
    invoke-direct {v1, v3, v2}, Lcom/moloco/sdk/internal/services/init/c;-><init>(Lcom/moloco/sdk/internal/A;Ljava/lang/String;)V

    .line 281
    .line 282
    .line 283
    return-object v1

    .line 284
    :cond_9
    new-instance v1, LE5/Q;

    .line 285
    .line 286
    const/16 v2, 0x9

    .line 287
    .line 288
    const/4 v3, 0x0

    .line 289
    invoke-direct {v1, v3, v2}, LE5/Q;-><init>(BI)V

    .line 290
    .line 291
    .line 292
    throw v1
.end method

.method public final c(Ljava/lang/String;Lcom/moloco/sdk/publisher/MediationInfo;Llf/c;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p3, Lcom/moloco/sdk/internal/services/init/r;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lcom/moloco/sdk/internal/services/init/r;

    .line 7
    .line 8
    iget v1, v0, Lcom/moloco/sdk/internal/services/init/r;->e:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcom/moloco/sdk/internal/services/init/r;->e:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/moloco/sdk/internal/services/init/r;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lcom/moloco/sdk/internal/services/init/r;-><init>(Lcom/moloco/sdk/internal/services/init/s;Llf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lcom/moloco/sdk/internal/services/init/r;->c:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 28
    .line 29
    iget v2, v0, Lcom/moloco/sdk/internal/services/init/r;->e:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    iget-object p1, v0, Lcom/moloco/sdk/internal/services/init/r;->b:Lcom/moloco/sdk/acm/l;

    .line 37
    .line 38
    iget-object p2, v0, Lcom/moloco/sdk/internal/services/init/r;->a:Lcom/moloco/sdk/acm/recorder/c;

    .line 39
    .line 40
    invoke-static {p3}, LFe/e;->U(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 45
    .line 46
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw p1

    .line 52
    :cond_2
    invoke-static {p3}, LFe/e;->U(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    sget-object p3, Lcom/moloco/sdk/acm/recorder/b;->Companion:Lcom/moloco/sdk/acm/recorder/a;

    .line 56
    .line 57
    invoke-virtual {p2}, Lcom/moloco/sdk/publisher/MediationInfo;->getName()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    invoke-static {v2}, Lcom/moloco/sdk/acm/recorder/a;->a(Ljava/lang/String;)Lcom/moloco/sdk/acm/recorder/c;

    .line 65
    .line 66
    .line 67
    move-result-object p3

    .line 68
    sget-object v2, Lcom/moloco/sdk/internal/client_metrics_data/c;->b:[Lcom/moloco/sdk/internal/client_metrics_data/c;

    .line 69
    .line 70
    const-string v2, "sdk_perform_init_time_ms"

    .line 71
    .line 72
    invoke-virtual {p3, v2}, Lcom/moloco/sdk/acm/recorder/c;->c(Ljava/lang/String;)Lcom/moloco/sdk/acm/l;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    iput-object p3, v0, Lcom/moloco/sdk/internal/services/init/r;->a:Lcom/moloco/sdk/acm/recorder/c;

    .line 77
    .line 78
    iput-object v2, v0, Lcom/moloco/sdk/internal/services/init/r;->b:Lcom/moloco/sdk/acm/l;

    .line 79
    .line 80
    iput v3, v0, Lcom/moloco/sdk/internal/services/init/r;->e:I

    .line 81
    .line 82
    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/moloco/sdk/internal/services/init/s;->b(Ljava/lang/String;Lcom/moloco/sdk/publisher/MediationInfo;Lcom/moloco/sdk/acm/recorder/c;Llf/c;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    if-ne p1, v1, :cond_3

    .line 87
    .line 88
    return-object v1

    .line 89
    :cond_3
    move-object p2, p3

    .line 90
    move-object p3, p1

    .line 91
    move-object p1, v2

    .line 92
    :goto_1
    check-cast p3, Lcom/moloco/sdk/internal/services/init/c;

    .line 93
    .line 94
    iget-object v0, p3, Lcom/moloco/sdk/internal/services/init/c;->a:Lcom/moloco/sdk/internal/A;

    .line 95
    .line 96
    instance-of v1, v0, Lcom/moloco/sdk/internal/y;

    .line 97
    .line 98
    iget-object v2, p3, Lcom/moloco/sdk/internal/services/init/c;->b:Ljava/lang/String;

    .line 99
    .line 100
    const-string v3, "sdk_perform_init_attempt"

    .line 101
    .line 102
    const-string v4, "state"

    .line 103
    .line 104
    const-string v5, "result"

    .line 105
    .line 106
    if-eqz v1, :cond_4

    .line 107
    .line 108
    new-instance v0, Lcom/moloco/sdk/acm/h;

    .line 109
    .line 110
    sget-object v1, Lcom/moloco/sdk/internal/client_metrics_data/a;->b:[Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 111
    .line 112
    invoke-direct {v0, v3}, Lcom/moloco/sdk/acm/h;-><init>(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    sget-object v1, Lcom/moloco/sdk/internal/client_metrics_data/b;->a:[Lcom/moloco/sdk/internal/client_metrics_data/b;

    .line 116
    .line 117
    const-string v1, "failure"

    .line 118
    .line 119
    invoke-virtual {v0, v5, v1}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0, v4, v2}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {p2, v0}, Lcom/moloco/sdk/acm/recorder/c;->a(Lcom/moloco/sdk/acm/h;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {p1, v5, v1}, Lcom/moloco/sdk/acm/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {p1, v4, v2}, Lcom/moloco/sdk/acm/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {p2, p1}, Lcom/moloco/sdk/acm/recorder/c;->b(Lcom/moloco/sdk/acm/l;)V

    .line 135
    .line 136
    .line 137
    goto :goto_2

    .line 138
    :cond_4
    instance-of v0, v0, Lcom/moloco/sdk/internal/z;

    .line 139
    .line 140
    if-eqz v0, :cond_5

    .line 141
    .line 142
    new-instance v0, Lcom/moloco/sdk/acm/h;

    .line 143
    .line 144
    sget-object v1, Lcom/moloco/sdk/internal/client_metrics_data/a;->b:[Lcom/moloco/sdk/internal/client_metrics_data/a;

    .line 145
    .line 146
    invoke-direct {v0, v3}, Lcom/moloco/sdk/acm/h;-><init>(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    sget-object v1, Lcom/moloco/sdk/internal/client_metrics_data/b;->a:[Lcom/moloco/sdk/internal/client_metrics_data/b;

    .line 150
    .line 151
    const-string v1, "success"

    .line 152
    .line 153
    invoke-virtual {v0, v5, v1}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v0, v4, v2}, Lcom/moloco/sdk/acm/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {p2, v0}, Lcom/moloco/sdk/acm/recorder/c;->a(Lcom/moloco/sdk/acm/h;)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {p1, v5, v1}, Lcom/moloco/sdk/acm/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {p1, v4, v2}, Lcom/moloco/sdk/acm/l;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {p2, p1}, Lcom/moloco/sdk/acm/recorder/c;->b(Lcom/moloco/sdk/acm/l;)V

    .line 169
    .line 170
    .line 171
    :goto_2
    iget-object p1, p3, Lcom/moloco/sdk/internal/services/init/c;->a:Lcom/moloco/sdk/internal/A;

    .line 172
    .line 173
    return-object p1

    .line 174
    :cond_5
    new-instance p1, LE5/Q;

    .line 175
    .line 176
    const/16 p2, 0x9

    .line 177
    .line 178
    const/4 p3, 0x0

    .line 179
    invoke-direct {p1, p3, p2}, LE5/Q;-><init>(BI)V

    .line 180
    .line 181
    .line 182
    throw p1
.end method
