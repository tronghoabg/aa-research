.class public final synthetic Lcom/applovin/impl/mediation/ads/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Enum;Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p4, p0, Lcom/applovin/impl/mediation/ads/f;->a:I

    iput-object p1, p0, Lcom/applovin/impl/mediation/ads/f;->c:Ljava/lang/Object;

    iput-object p2, p0, Lcom/applovin/impl/mediation/ads/f;->d:Ljava/lang/Object;

    iput-object p3, p0, Lcom/applovin/impl/mediation/ads/f;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p4, p0, Lcom/applovin/impl/mediation/ads/f;->a:I

    iput-object p1, p0, Lcom/applovin/impl/mediation/ads/f;->c:Ljava/lang/Object;

    iput-object p2, p0, Lcom/applovin/impl/mediation/ads/f;->b:Ljava/lang/Object;

    iput-object p3, p0, Lcom/applovin/impl/mediation/ads/f;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 29

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const/16 v0, 0x18

    .line 4
    .line 5
    const/16 v2, 0x19

    .line 6
    .line 7
    const/4 v4, 0x0

    .line 8
    const/4 v5, 0x1

    .line 9
    iget v6, v1, Lcom/applovin/impl/mediation/ads/f;->a:I

    .line 10
    .line 11
    packed-switch v6, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    iget-object v0, v1, Lcom/applovin/impl/mediation/ads/f;->c:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Lp9/n;

    .line 17
    .line 18
    iget-object v0, v0, Lp9/n;->g:Lr9/l;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    new-instance v2, Laa/f;

    .line 24
    .line 25
    iget-object v3, v1, Lcom/applovin/impl/mediation/ads/f;->b:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v3, Ljava/lang/String;

    .line 28
    .line 29
    const/16 v5, 0x13

    .line 30
    .line 31
    invoke-direct {v2, v5, v0, v3}, Laa/f;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iget-object v0, v0, Lr9/l;->a:Lp7/b;

    .line 35
    .line 36
    const-string v3, "Get named query"

    .line 37
    .line 38
    invoke-virtual {v0, v3, v2}, Lp7/b;->O(Ljava/lang/String;Lw9/o;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, Lo9/j;

    .line 43
    .line 44
    iget-object v2, v1, Lcom/applovin/impl/mediation/ads/f;->d:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v2, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 47
    .line 48
    if-eqz v0, :cond_0

    .line 49
    .line 50
    iget-object v0, v0, Lo9/j;->b:Lo9/i;

    .line 51
    .line 52
    new-instance v3, Lp9/u;

    .line 53
    .line 54
    iget-object v4, v0, Lo9/i;->a:Lp9/A;

    .line 55
    .line 56
    iget-object v5, v4, Lp9/A;->d:Ls9/m;

    .line 57
    .line 58
    iget-object v11, v4, Lp9/A;->g:Lp9/c;

    .line 59
    .line 60
    iget-object v12, v4, Lp9/A;->h:Lp9/c;

    .line 61
    .line 62
    move-object v6, v5

    .line 63
    iget-object v5, v4, Lp9/A;->e:Ljava/lang/String;

    .line 64
    .line 65
    move-object v7, v6

    .line 66
    iget-object v6, v4, Lp9/A;->c:Ljava/util/List;

    .line 67
    .line 68
    move-object v8, v7

    .line 69
    iget-object v7, v4, Lp9/A;->b:Ljava/util/List;

    .line 70
    .line 71
    iget-wide v9, v4, Lp9/A;->f:J

    .line 72
    .line 73
    iget v0, v0, Lo9/i;->b:I

    .line 74
    .line 75
    move-object v4, v8

    .line 76
    move-wide v8, v9

    .line 77
    move v10, v0

    .line 78
    invoke-direct/range {v3 .. v12}, Lp9/u;-><init>(Ls9/m;Ljava/lang/String;Ljava/util/List;Ljava/util/List;JILp9/c;Lp9/c;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2, v3}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_0
    invoke-virtual {v2, v4}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    :goto_0
    return-void

    .line 89
    :pswitch_0
    iget-object v0, v1, Lcom/applovin/impl/mediation/ads/f;->c:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v0, Lp9/n;

    .line 92
    .line 93
    iget-object v0, v0, Lp9/n;->i:Lp9/z;

    .line 94
    .line 95
    const-string v2, "writeMutations"

    .line 96
    .line 97
    invoke-virtual {v0, v2}, Lp9/z;->a(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    iget-object v2, v0, Lp9/z;->a:Lr9/l;

    .line 101
    .line 102
    new-instance v3, Ls8/q;

    .line 103
    .line 104
    new-instance v5, Ljava/util/Date;

    .line 105
    .line 106
    invoke-direct {v5}, Ljava/util/Date;-><init>()V

    .line 107
    .line 108
    .line 109
    invoke-direct {v3, v5}, Ls8/q;-><init>(Ljava/util/Date;)V

    .line 110
    .line 111
    .line 112
    new-instance v5, Ljava/util/HashSet;

    .line 113
    .line 114
    invoke-direct {v5}, Ljava/util/HashSet;-><init>()V

    .line 115
    .line 116
    .line 117
    iget-object v6, v1, Lcom/applovin/impl/mediation/ads/f;->b:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast v6, Ljava/util/List;

    .line 120
    .line 121
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 122
    .line 123
    .line 124
    move-result-object v7

    .line 125
    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 126
    .line 127
    .line 128
    move-result v8

    .line 129
    if-eqz v8, :cond_1

    .line 130
    .line 131
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v8

    .line 135
    check-cast v8, Lt9/h;

    .line 136
    .line 137
    iget-object v8, v8, Lt9/h;->a:Ls9/h;

    .line 138
    .line 139
    invoke-virtual {v5, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    goto :goto_1

    .line 143
    :cond_1
    new-instance v7, Lcom/applovin/impl/Y;

    .line 144
    .line 145
    invoke-direct {v7, v2, v5, v6, v3}, Lcom/applovin/impl/Y;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    iget-object v2, v2, Lr9/l;->a:Lp7/b;

    .line 149
    .line 150
    const-string v3, "Locally write mutations"

    .line 151
    .line 152
    invoke-virtual {v2, v3, v7}, Lp7/b;->O(Ljava/lang/String;Lw9/o;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    check-cast v2, Lr9/g;

    .line 157
    .line 158
    iget v3, v2, Lr9/g;->a:I

    .line 159
    .line 160
    iget-object v5, v0, Lp9/z;->i:Ljava/util/HashMap;

    .line 161
    .line 162
    iget-object v6, v0, Lp9/z;->l:Ln9/e;

    .line 163
    .line 164
    invoke-virtual {v5, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v6

    .line 168
    check-cast v6, Ljava/util/Map;

    .line 169
    .line 170
    if-nez v6, :cond_2

    .line 171
    .line 172
    new-instance v6, Ljava/util/HashMap;

    .line 173
    .line 174
    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 175
    .line 176
    .line 177
    iget-object v7, v0, Lp9/z;->l:Ln9/e;

    .line 178
    .line 179
    invoke-virtual {v5, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    :cond_2
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 183
    .line 184
    .line 185
    move-result-object v3

    .line 186
    iget-object v5, v1, Lcom/applovin/impl/mediation/ads/f;->d:Ljava/lang/Object;

    .line 187
    .line 188
    check-cast v5, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 189
    .line 190
    invoke-interface {v6, v3, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    iget-object v2, v2, Lr9/g;->b:Lc9/c;

    .line 194
    .line 195
    invoke-virtual {v0, v2, v4}, Lp9/z;->b(Lc9/c;LC8/i;)V

    .line 196
    .line 197
    .line 198
    iget-object v0, v0, Lp9/z;->b:LE5/n0;

    .line 199
    .line 200
    invoke-virtual {v0}, LE5/n0;->i()V

    .line 201
    .line 202
    .line 203
    return-void

    .line 204
    :pswitch_1
    iget-object v0, v1, Lcom/applovin/impl/mediation/ads/f;->b:Ljava/lang/Object;

    .line 205
    .line 206
    check-cast v0, Lo9/f;

    .line 207
    .line 208
    iget-object v2, v0, Lo9/f;->b:Ljava/io/ByteArrayInputStream;

    .line 209
    .line 210
    iget-object v6, v1, Lcom/applovin/impl/mediation/ads/f;->d:Ljava/lang/Object;

    .line 211
    .line 212
    check-cast v6, Lm9/N;

    .line 213
    .line 214
    iget-object v7, v1, Lcom/applovin/impl/mediation/ads/f;->c:Ljava/lang/Object;

    .line 215
    .line 216
    check-cast v7, Lp9/n;

    .line 217
    .line 218
    iget-object v7, v7, Lp9/n;->i:Lp9/z;

    .line 219
    .line 220
    iget-object v8, v7, Lp9/z;->a:Lr9/l;

    .line 221
    .line 222
    iget-object v9, v8, Lr9/l;->a:Lp7/b;

    .line 223
    .line 224
    const-string v10, "Exception while closing bundle"

    .line 225
    .line 226
    const-string v11, "SyncEngine"

    .line 227
    .line 228
    const/4 v12, 0x2

    .line 229
    :try_start_0
    iget-object v13, v0, Lo9/f;->c:Lo9/e;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_5
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 230
    .line 231
    const-string v14, "Expected first element in bundle to be a metadata object"

    .line 232
    .line 233
    const/4 v15, 0x0

    .line 234
    const-wide/16 v3, 0x0

    .line 235
    .line 236
    if-eqz v13, :cond_3

    .line 237
    .line 238
    move/from16 v17, v15

    .line 239
    .line 240
    goto :goto_2

    .line 241
    :cond_3
    :try_start_1
    invoke-virtual {v0}, Lo9/f;->c()Lo9/c;

    .line 242
    .line 243
    .line 244
    move-result-object v13
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_4
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 245
    move/from16 v17, v15

    .line 246
    .line 247
    :try_start_2
    instance-of v15, v13, Lo9/e;

    .line 248
    .line 249
    if-eqz v15, :cond_9

    .line 250
    .line 251
    check-cast v13, Lo9/e;

    .line 252
    .line 253
    iput-object v13, v0, Lo9/f;->c:Lo9/e;

    .line 254
    .line 255
    iput-wide v3, v0, Lo9/f;->e:J

    .line 256
    .line 257
    :goto_2
    new-instance v15, Laa/f;

    .line 258
    .line 259
    const/16 v3, 0x16

    .line 260
    .line 261
    invoke-direct {v15, v3, v8, v13}, Laa/f;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 262
    .line 263
    .line 264
    const-string v3, "Has newer bundle"

    .line 265
    .line 266
    invoke-virtual {v9, v3, v15}, Lp7/b;->O(Ljava/lang/String;Lw9/o;)Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object v3

    .line 270
    check-cast v3, Ljava/lang/Boolean;

    .line 271
    .line 272
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 273
    .line 274
    .line 275
    move-result v3

    .line 276
    if-eqz v3, :cond_4

    .line 277
    .line 278
    new-instance v18, Lm9/O;

    .line 279
    .line 280
    iget v0, v13, Lo9/e;->d:I

    .line 281
    .line 282
    iget-wide v3, v13, Lo9/e;->e:J

    .line 283
    .line 284
    const/16 v25, 0x0

    .line 285
    .line 286
    const/16 v26, 0x3

    .line 287
    .line 288
    move/from16 v20, v0

    .line 289
    .line 290
    move-wide/from16 v23, v3

    .line 291
    .line 292
    move/from16 v19, v0

    .line 293
    .line 294
    move-wide/from16 v21, v3

    .line 295
    .line 296
    invoke-direct/range {v18 .. v26}, Lm9/O;-><init>(IIJJLm9/G;I)V

    .line 297
    .line 298
    .line 299
    move-object/from16 v0, v18

    .line 300
    .line 301
    invoke-virtual {v6, v0}, Lm9/N;->c(Lm9/O;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 302
    .line 303
    .line 304
    :try_start_3
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    .line 305
    .line 306
    .line 307
    goto/16 :goto_9

    .line 308
    .line 309
    :catch_0
    move-exception v0

    .line 310
    new-array v2, v5, [Ljava/lang/Object;

    .line 311
    .line 312
    aput-object v0, v2, v17

    .line 313
    .line 314
    invoke-static {v11, v10, v12, v2}, LBa/c;->p(Ljava/lang/String;Ljava/lang/String;I[Ljava/lang/Object;)V

    .line 315
    .line 316
    .line 317
    goto/16 :goto_9

    .line 318
    .line 319
    :catchall_0
    move-exception v0

    .line 320
    :goto_3
    move-object v3, v0

    .line 321
    goto/16 :goto_a

    .line 322
    .line 323
    :catch_1
    move-exception v0

    .line 324
    :goto_4
    move-object v15, v6

    .line 325
    goto/16 :goto_8

    .line 326
    .line 327
    :cond_4
    :try_start_4
    new-instance v18, Lm9/O;

    .line 328
    .line 329
    iget v3, v13, Lo9/e;->d:I
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 330
    .line 331
    move-object v15, v6

    .line 332
    :try_start_5
    iget-wide v5, v13, Lo9/e;->e:J

    .line 333
    .line 334
    const/16 v26, 0x2

    .line 335
    .line 336
    const/16 v25, 0x0

    .line 337
    .line 338
    const/16 v19, 0x0

    .line 339
    .line 340
    const-wide/16 v21, 0x0

    .line 341
    .line 342
    move/from16 v20, v3

    .line 343
    .line 344
    move-wide/from16 v23, v5

    .line 345
    .line 346
    invoke-direct/range {v18 .. v26}, Lm9/O;-><init>(IIJJLm9/G;I)V

    .line 347
    .line 348
    .line 349
    move-object/from16 v3, v18

    .line 350
    .line 351
    invoke-virtual {v15, v3}, Lm9/N;->d(Lm9/O;)V

    .line 352
    .line 353
    .line 354
    new-instance v3, Lo9/d;

    .line 355
    .line 356
    invoke-direct {v3, v8, v13}, Lo9/d;-><init>(Lo9/a;Lo9/e;)V

    .line 357
    .line 358
    .line 359
    const-wide/16 v5, 0x0

    .line 360
    .line 361
    :goto_5
    iget-object v4, v0, Lo9/f;->c:Lo9/e;

    .line 362
    .line 363
    if-eqz v4, :cond_5

    .line 364
    .line 365
    move-wide/from16 v20, v5

    .line 366
    .line 367
    const-wide/16 v4, 0x0

    .line 368
    .line 369
    goto :goto_6

    .line 370
    :cond_5
    invoke-virtual {v0}, Lo9/f;->c()Lo9/c;

    .line 371
    .line 372
    .line 373
    move-result-object v4

    .line 374
    instance-of v12, v4, Lo9/e;

    .line 375
    .line 376
    if-eqz v12, :cond_8

    .line 377
    .line 378
    check-cast v4, Lo9/e;

    .line 379
    .line 380
    iput-object v4, v0, Lo9/f;->c:Lo9/e;

    .line 381
    .line 382
    move-wide/from16 v20, v5

    .line 383
    .line 384
    const-wide/16 v4, 0x0

    .line 385
    .line 386
    iput-wide v4, v0, Lo9/f;->e:J

    .line 387
    .line 388
    :goto_6
    invoke-virtual {v0}, Lo9/f;->c()Lo9/c;

    .line 389
    .line 390
    .line 391
    move-result-object v6

    .line 392
    if-eqz v6, :cond_7

    .line 393
    .line 394
    iget-wide v4, v0, Lo9/f;->e:J

    .line 395
    .line 396
    move-wide/from16 v22, v4

    .line 397
    .line 398
    sub-long v4, v22, v20

    .line 399
    .line 400
    invoke-virtual {v3, v6, v4, v5}, Lo9/d;->a(Lo9/c;J)Lm9/O;

    .line 401
    .line 402
    .line 403
    move-result-object v4

    .line 404
    if-eqz v4, :cond_6

    .line 405
    .line 406
    invoke-virtual {v15, v4}, Lm9/N;->d(Lm9/O;)V

    .line 407
    .line 408
    .line 409
    goto :goto_7

    .line 410
    :catch_2
    move-exception v0

    .line 411
    goto :goto_8

    .line 412
    :cond_6
    :goto_7
    move-wide/from16 v5, v22

    .line 413
    .line 414
    const/4 v12, 0x2

    .line 415
    goto :goto_5

    .line 416
    :cond_7
    invoke-virtual {v3}, Lo9/d;->b()Lc9/c;

    .line 417
    .line 418
    .line 419
    move-result-object v0

    .line 420
    const/4 v3, 0x0

    .line 421
    invoke-virtual {v7, v0, v3}, Lp9/z;->b(Lc9/c;LC8/i;)V

    .line 422
    .line 423
    .line 424
    new-instance v0, Lng/a;

    .line 425
    .line 426
    const/16 v3, 0xb

    .line 427
    .line 428
    invoke-direct {v0, v3, v8, v13}, Lng/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 429
    .line 430
    .line 431
    const-string v3, "Save bundle"

    .line 432
    .line 433
    invoke-virtual {v9, v3, v0}, Lp7/b;->P(Ljava/lang/String;Ljava/lang/Runnable;)V

    .line 434
    .line 435
    .line 436
    new-instance v20, Lm9/O;

    .line 437
    .line 438
    iget v0, v13, Lo9/e;->d:I

    .line 439
    .line 440
    iget-wide v3, v13, Lo9/e;->e:J

    .line 441
    .line 442
    const/16 v27, 0x0

    .line 443
    .line 444
    const/16 v28, 0x3

    .line 445
    .line 446
    move/from16 v22, v0

    .line 447
    .line 448
    move-wide/from16 v25, v3

    .line 449
    .line 450
    move/from16 v21, v0

    .line 451
    .line 452
    move-wide/from16 v23, v3

    .line 453
    .line 454
    invoke-direct/range {v20 .. v28}, Lm9/O;-><init>(IIJJLm9/G;I)V

    .line 455
    .line 456
    .line 457
    move-object/from16 v0, v20

    .line 458
    .line 459
    invoke-virtual {v15, v0}, Lm9/N;->c(Lm9/O;)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 460
    .line 461
    .line 462
    :try_start_6
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_3

    .line 463
    .line 464
    .line 465
    goto :goto_9

    .line 466
    :catch_3
    move-exception v0

    .line 467
    const/4 v4, 0x1

    .line 468
    new-array v2, v4, [Ljava/lang/Object;

    .line 469
    .line 470
    aput-object v0, v2, v17

    .line 471
    .line 472
    const/4 v3, 0x2

    .line 473
    invoke-static {v11, v10, v3, v2}, LBa/c;->p(Ljava/lang/String;Ljava/lang/String;I[Ljava/lang/Object;)V

    .line 474
    .line 475
    .line 476
    goto :goto_9

    .line 477
    :cond_8
    :try_start_7
    invoke-virtual {v0, v14}, Lo9/f;->a(Ljava/lang/String;)V

    .line 478
    .line 479
    .line 480
    const/16 v16, 0x0

    .line 481
    .line 482
    throw v16

    .line 483
    :cond_9
    move-object v15, v6

    .line 484
    invoke-virtual {v0, v14}, Lo9/f;->a(Ljava/lang/String;)V

    .line 485
    .line 486
    .line 487
    const/16 v16, 0x0

    .line 488
    .line 489
    throw v16
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_2
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 490
    :catchall_1
    move-exception v0

    .line 491
    move/from16 v17, v15

    .line 492
    .line 493
    goto/16 :goto_3

    .line 494
    .line 495
    :catch_4
    move-exception v0

    .line 496
    move/from16 v17, v15

    .line 497
    .line 498
    goto/16 :goto_4

    .line 499
    .line 500
    :catchall_2
    move-exception v0

    .line 501
    const/16 v17, 0x0

    .line 502
    .line 503
    goto/16 :goto_3

    .line 504
    .line 505
    :catch_5
    move-exception v0

    .line 506
    move-object v15, v6

    .line 507
    const/16 v17, 0x0

    .line 508
    .line 509
    :goto_8
    :try_start_8
    const-string v3, "Firestore"

    .line 510
    .line 511
    const-string v5, "Loading bundle failed : %s"

    .line 512
    .line 513
    const/4 v4, 0x1

    .line 514
    new-array v6, v4, [Ljava/lang/Object;

    .line 515
    .line 516
    aput-object v0, v6, v17

    .line 517
    .line 518
    const/4 v7, 0x2

    .line 519
    invoke-static {v3, v5, v7, v6}, LBa/c;->p(Ljava/lang/String;Ljava/lang/String;I[Ljava/lang/Object;)V

    .line 520
    .line 521
    .line 522
    new-instance v3, Lm9/G;

    .line 523
    .line 524
    const-string v5, "Bundle failed to load"

    .line 525
    .line 526
    sget-object v6, Lm9/F;->e:Lm9/F;

    .line 527
    .line 528
    invoke-direct {v3, v5, v6, v0}, Lm9/G;-><init>(Ljava/lang/String;Lm9/F;Ljava/lang/Exception;)V

    .line 529
    .line 530
    .line 531
    invoke-virtual {v15, v3}, Lm9/N;->b(Lm9/G;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 532
    .line 533
    .line 534
    :try_start_9
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_6

    .line 535
    .line 536
    .line 537
    goto :goto_9

    .line 538
    :catch_6
    move-exception v0

    .line 539
    const/4 v4, 0x1

    .line 540
    new-array v2, v4, [Ljava/lang/Object;

    .line 541
    .line 542
    aput-object v0, v2, v17

    .line 543
    .line 544
    const/4 v3, 0x2

    .line 545
    invoke-static {v11, v10, v3, v2}, LBa/c;->p(Ljava/lang/String;Ljava/lang/String;I[Ljava/lang/Object;)V

    .line 546
    .line 547
    .line 548
    :goto_9
    return-void

    .line 549
    :goto_a
    :try_start_a
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_7

    .line 550
    .line 551
    .line 552
    goto :goto_b

    .line 553
    :catch_7
    move-exception v0

    .line 554
    const/4 v4, 0x1

    .line 555
    new-array v2, v4, [Ljava/lang/Object;

    .line 556
    .line 557
    aput-object v0, v2, v17

    .line 558
    .line 559
    const/4 v7, 0x2

    .line 560
    invoke-static {v11, v10, v7, v2}, LBa/c;->p(Ljava/lang/String;Ljava/lang/String;I[Ljava/lang/Object;)V

    .line 561
    .line 562
    .line 563
    :goto_b
    throw v3

    .line 564
    :pswitch_2
    iget-object v0, v1, Lcom/applovin/impl/mediation/ads/f;->c:Ljava/lang/Object;

    .line 565
    .line 566
    check-cast v0, Lp9/b;

    .line 567
    .line 568
    iget-object v2, v1, Lcom/applovin/impl/mediation/ads/f;->b:Ljava/lang/Object;

    .line 569
    .line 570
    iget-object v3, v1, Lcom/applovin/impl/mediation/ads/f;->d:Ljava/lang/Object;

    .line 571
    .line 572
    check-cast v3, Lm9/G;

    .line 573
    .line 574
    iget-boolean v4, v0, Lp9/b;->c:Z

    .line 575
    .line 576
    if-nez v4, :cond_a

    .line 577
    .line 578
    iget-object v0, v0, Lp9/b;->b:Lm9/p;

    .line 579
    .line 580
    invoke-interface {v0, v2, v3}, Lm9/p;->a(Ljava/lang/Object;Lm9/G;)V

    .line 581
    .line 582
    .line 583
    :cond_a
    return-void

    .line 584
    :pswitch_3
    iget-object v0, v1, Lcom/applovin/impl/mediation/ads/f;->c:Ljava/lang/Object;

    .line 585
    .line 586
    check-cast v0, Lorg/apache/tika/parser/external/ExternalParser;

    .line 587
    .line 588
    iget-object v2, v1, Lcom/applovin/impl/mediation/ads/f;->b:Ljava/lang/Object;

    .line 589
    .line 590
    check-cast v2, Ljava/io/InputStream;

    .line 591
    .line 592
    iget-object v3, v1, Lcom/applovin/impl/mediation/ads/f;->d:Ljava/lang/Object;

    .line 593
    .line 594
    check-cast v3, Lorg/apache/tika/metadata/Metadata;

    .line 595
    .line 596
    invoke-static {v0, v2, v3}, Lorg/apache/tika/parser/external/ExternalParser;->c(Lorg/apache/tika/parser/external/ExternalParser;Ljava/io/InputStream;Lorg/apache/tika/metadata/Metadata;)V

    .line 597
    .line 598
    .line 599
    return-void

    .line 600
    :pswitch_4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 601
    .line 602
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 603
    .line 604
    .line 605
    iget-object v2, v1, Lcom/applovin/impl/mediation/ads/f;->b:Ljava/lang/Object;

    .line 606
    .line 607
    check-cast v2, Ljava/lang/String;

    .line 608
    .line 609
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 610
    .line 611
    .line 612
    const-string v2, ": "

    .line 613
    .line 614
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 615
    .line 616
    .line 617
    iget-object v2, v1, Lcom/applovin/impl/mediation/ads/f;->d:Ljava/lang/Object;

    .line 618
    .line 619
    check-cast v2, Ljava/lang/Exception;

    .line 620
    .line 621
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 622
    .line 623
    .line 624
    move-result-object v2

    .line 625
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 626
    .line 627
    .line 628
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 629
    .line 630
    .line 631
    move-result-object v0

    .line 632
    iget-object v2, v1, Lcom/applovin/impl/mediation/ads/f;->c:Ljava/lang/Object;

    .line 633
    .line 634
    check-cast v2, Ltc/g;

    .line 635
    .line 636
    const-string v3, "DISK_SPACE_ERROR"

    .line 637
    .line 638
    const/4 v4, 0x0

    .line 639
    invoke-virtual {v2, v3, v0, v4}, Ltc/g;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 640
    .line 641
    .line 642
    return-void

    .line 643
    :pswitch_5
    iget-object v0, v1, Lcom/applovin/impl/mediation/ads/f;->c:Ljava/lang/Object;

    .line 644
    .line 645
    check-cast v0, Llb/f;

    .line 646
    .line 647
    iget-object v0, v0, Llb/f;->b:Luc/r;

    .line 648
    .line 649
    if-eqz v0, :cond_b

    .line 650
    .line 651
    iget-object v2, v1, Lcom/applovin/impl/mediation/ads/f;->b:Ljava/lang/Object;

    .line 652
    .line 653
    check-cast v2, Ljava/lang/String;

    .line 654
    .line 655
    iget-object v3, v1, Lcom/applovin/impl/mediation/ads/f;->d:Ljava/lang/Object;

    .line 656
    .line 657
    check-cast v3, Ljava/io/Serializable;

    .line 658
    .line 659
    invoke-virtual {v0, v2, v3, v4}, Luc/r;->a(Ljava/lang/String;Ljava/lang/Object;Luc/q;)V

    .line 660
    .line 661
    .line 662
    :cond_b
    return-void

    .line 663
    :pswitch_6
    new-instance v0, Lcom/moloco/sdk/internal/publisher/d;

    .line 664
    .line 665
    invoke-direct {v0, v2}, Lcom/moloco/sdk/internal/publisher/d;-><init>(I)V

    .line 666
    .line 667
    .line 668
    iget-object v2, v1, Lcom/applovin/impl/mediation/ads/f;->c:Ljava/lang/Object;

    .line 669
    .line 670
    check-cast v2, Lkd/W;

    .line 671
    .line 672
    iget-object v3, v2, Lkd/W;->a:Lkd/r;

    .line 673
    .line 674
    iget-object v4, v1, Lcom/applovin/impl/mediation/ads/f;->b:Ljava/lang/Object;

    .line 675
    .line 676
    check-cast v4, Landroid/webkit/WebView;

    .line 677
    .line 678
    iget-object v5, v1, Lcom/applovin/impl/mediation/ads/f;->d:Ljava/lang/Object;

    .line 679
    .line 680
    check-cast v5, Landroid/webkit/WebResourceRequest;

    .line 681
    .line 682
    invoke-virtual {v3, v2, v4, v5, v0}, Lkd/r;->n(Landroid/webkit/WebViewClient;Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Ltf/l;)V

    .line 683
    .line 684
    .line 685
    return-void

    .line 686
    :pswitch_7
    new-instance v0, Lcom/moloco/sdk/internal/publisher/d;

    .line 687
    .line 688
    invoke-direct {v0, v2}, Lcom/moloco/sdk/internal/publisher/d;-><init>(I)V

    .line 689
    .line 690
    .line 691
    iget-object v2, v1, Lcom/applovin/impl/mediation/ads/f;->c:Ljava/lang/Object;

    .line 692
    .line 693
    check-cast v2, Lkd/W;

    .line 694
    .line 695
    iget-object v3, v2, Lkd/W;->a:Lkd/r;

    .line 696
    .line 697
    iget-object v4, v1, Lcom/applovin/impl/mediation/ads/f;->b:Ljava/lang/Object;

    .line 698
    .line 699
    check-cast v4, Landroid/webkit/WebView;

    .line 700
    .line 701
    iget-object v5, v1, Lcom/applovin/impl/mediation/ads/f;->d:Ljava/lang/Object;

    .line 702
    .line 703
    check-cast v5, Landroid/webkit/ClientCertRequest;

    .line 704
    .line 705
    invoke-virtual {v3, v2, v4, v5, v0}, Lkd/r;->g(Landroid/webkit/WebViewClient;Landroid/webkit/WebView;Landroid/webkit/ClientCertRequest;Ltf/l;)V

    .line 706
    .line 707
    .line 708
    return-void

    .line 709
    :pswitch_8
    new-instance v2, Lcom/moloco/sdk/internal/publisher/d;

    .line 710
    .line 711
    invoke-direct {v2, v0}, Lcom/moloco/sdk/internal/publisher/d;-><init>(I)V

    .line 712
    .line 713
    .line 714
    iget-object v0, v1, Lcom/applovin/impl/mediation/ads/f;->c:Ljava/lang/Object;

    .line 715
    .line 716
    check-cast v0, Lkd/T;

    .line 717
    .line 718
    iget-object v3, v0, Lkd/T;->a:Lkd/r;

    .line 719
    .line 720
    iget-object v4, v1, Lcom/applovin/impl/mediation/ads/f;->b:Ljava/lang/Object;

    .line 721
    .line 722
    check-cast v4, Landroid/webkit/WebView;

    .line 723
    .line 724
    iget-object v5, v1, Lcom/applovin/impl/mediation/ads/f;->d:Ljava/lang/Object;

    .line 725
    .line 726
    check-cast v5, Landroid/webkit/WebResourceRequest;

    .line 727
    .line 728
    invoke-virtual {v3, v0, v4, v5, v2}, Lkd/r;->n(Landroid/webkit/WebViewClient;Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Ltf/l;)V

    .line 729
    .line 730
    .line 731
    return-void

    .line 732
    :pswitch_9
    new-instance v2, Lcom/moloco/sdk/internal/publisher/d;

    .line 733
    .line 734
    invoke-direct {v2, v0}, Lcom/moloco/sdk/internal/publisher/d;-><init>(I)V

    .line 735
    .line 736
    .line 737
    iget-object v0, v1, Lcom/applovin/impl/mediation/ads/f;->c:Ljava/lang/Object;

    .line 738
    .line 739
    check-cast v0, Lkd/T;

    .line 740
    .line 741
    iget-object v3, v0, Lkd/T;->a:Lkd/r;

    .line 742
    .line 743
    iget-object v4, v1, Lcom/applovin/impl/mediation/ads/f;->b:Ljava/lang/Object;

    .line 744
    .line 745
    check-cast v4, Landroid/webkit/WebView;

    .line 746
    .line 747
    iget-object v5, v1, Lcom/applovin/impl/mediation/ads/f;->d:Ljava/lang/Object;

    .line 748
    .line 749
    check-cast v5, Landroid/webkit/ClientCertRequest;

    .line 750
    .line 751
    invoke-virtual {v3, v0, v4, v5, v2}, Lkd/r;->g(Landroid/webkit/WebViewClient;Landroid/webkit/WebView;Landroid/webkit/ClientCertRequest;Ltf/l;)V

    .line 752
    .line 753
    .line 754
    return-void

    .line 755
    :pswitch_a
    iget-object v0, v1, Lcom/applovin/impl/mediation/ads/f;->c:Ljava/lang/Object;

    .line 756
    .line 757
    check-cast v0, Lg2/f;

    .line 758
    .line 759
    iget-object v0, v0, Lg2/f;->c:Lcom/unity3d/services/core/webview/b;

    .line 760
    .line 761
    iget-object v2, v1, Lcom/applovin/impl/mediation/ads/f;->b:Ljava/lang/Object;

    .line 762
    .line 763
    check-cast v2, Ljava/lang/String;

    .line 764
    .line 765
    iget-object v0, v0, Lcom/unity3d/services/core/webview/b;->b:Ljava/lang/Object;

    .line 766
    .line 767
    check-cast v0, Lg2/q;

    .line 768
    .line 769
    iput-object v2, v0, Lg2/q;->c:Ljava/lang/String;

    .line 770
    .line 771
    iget-object v2, v1, Lcom/applovin/impl/mediation/ads/f;->d:Ljava/lang/Object;

    .line 772
    .line 773
    check-cast v2, Lg2/e;

    .line 774
    .line 775
    invoke-interface {v2}, Lg2/e;->B()Lg2/H;

    .line 776
    .line 777
    .line 778
    move-result-object v3

    .line 779
    iget-object v0, v0, Lg2/q;->d:Lg2/s;

    .line 780
    .line 781
    if-eqz v3, :cond_c

    .line 782
    .line 783
    iget-object v5, v0, Lg2/s;->d:Lg2/n;

    .line 784
    .line 785
    invoke-interface {v2}, Lg2/e;->p()I

    .line 786
    .line 787
    .line 788
    move-result v2

    .line 789
    iget-object v5, v5, Lg2/n;->i:Lg2/z;

    .line 790
    .line 791
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 792
    .line 793
    .line 794
    move-result-object v2

    .line 795
    iget-object v5, v5, Lg2/z;->c:Ljava/util/Map;

    .line 796
    .line 797
    invoke-interface {v5, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 798
    .line 799
    .line 800
    const/4 v4, 0x1

    .line 801
    iput-boolean v4, v0, Lg2/s;->v:Z

    .line 802
    .line 803
    :cond_c
    invoke-virtual {v0}, Lg2/s;->p()V

    .line 804
    .line 805
    .line 806
    return-void

    .line 807
    :pswitch_b
    iget-object v0, v1, Lcom/applovin/impl/mediation/ads/f;->c:Ljava/lang/Object;

    .line 808
    .line 809
    check-cast v0, LI5/f;

    .line 810
    .line 811
    iget v2, v0, LI5/f;->a:I

    .line 812
    .line 813
    iget-object v3, v1, Lcom/applovin/impl/mediation/ads/f;->b:Ljava/lang/Object;

    .line 814
    .line 815
    iget-object v4, v1, Lcom/applovin/impl/mediation/ads/f;->d:Ljava/lang/Object;

    .line 816
    .line 817
    check-cast v4, Lf6/u;

    .line 818
    .line 819
    iget-object v0, v0, LI5/f;->b:Lf6/z;

    .line 820
    .line 821
    invoke-interface {v3, v2, v0, v4}, Lf6/D;->H(ILf6/z;Lf6/u;)V

    .line 822
    .line 823
    .line 824
    return-void

    .line 825
    :pswitch_c
    iget-object v0, v1, Lcom/applovin/impl/mediation/ads/f;->b:Ljava/lang/Object;

    .line 826
    .line 827
    check-cast v0, Ljava/lang/String;

    .line 828
    .line 829
    iget-object v2, v1, Lcom/applovin/impl/mediation/ads/f;->c:Ljava/lang/Object;

    .line 830
    .line 831
    check-cast v2, Lcom/unity3d/services/core/webview/WebView;

    .line 832
    .line 833
    iget-object v3, v1, Lcom/applovin/impl/mediation/ads/f;->d:Ljava/lang/Object;

    .line 834
    .line 835
    check-cast v3, Landroid/webkit/ValueCallback;

    .line 836
    .line 837
    invoke-static {v2, v0, v3}, Lcom/unity3d/services/core/webview/WebView;->b(Lcom/unity3d/services/core/webview/WebView;Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    .line 838
    .line 839
    .line 840
    return-void

    .line 841
    :pswitch_d
    iget-object v0, v1, Lcom/applovin/impl/mediation/ads/f;->b:Ljava/lang/Object;

    .line 842
    .line 843
    check-cast v0, Ljava/lang/String;

    .line 844
    .line 845
    iget-object v2, v1, Lcom/applovin/impl/mediation/ads/f;->c:Ljava/lang/Object;

    .line 846
    .line 847
    check-cast v2, Lcom/unity3d/ads/IUnityAdsInitializationListener;

    .line 848
    .line 849
    iget-object v3, v1, Lcom/applovin/impl/mediation/ads/f;->d:Ljava/lang/Object;

    .line 850
    .line 851
    check-cast v3, Lcom/unity3d/ads/UnityAds$UnityAdsInitializationError;

    .line 852
    .line 853
    invoke-static {v2, v3, v0}, Lcom/unity3d/services/core/properties/SdkProperties;->a(Lcom/unity3d/ads/IUnityAdsInitializationListener;Lcom/unity3d/ads/UnityAds$UnityAdsInitializationError;Ljava/lang/String;)V

    .line 854
    .line 855
    .line 856
    return-void

    .line 857
    :pswitch_e
    iget-object v0, v1, Lcom/applovin/impl/mediation/ads/f;->c:Ljava/lang/Object;

    .line 858
    .line 859
    check-cast v0, Lcom/unity3d/services/ads/operation/load/LoadOperationState;

    .line 860
    .line 861
    iget-object v2, v1, Lcom/applovin/impl/mediation/ads/f;->d:Ljava/lang/Object;

    .line 862
    .line 863
    check-cast v2, Lcom/unity3d/ads/UnityAds$UnityAdsLoadError;

    .line 864
    .line 865
    iget-object v3, v1, Lcom/applovin/impl/mediation/ads/f;->b:Ljava/lang/Object;

    .line 866
    .line 867
    check-cast v3, Ljava/lang/String;

    .line 868
    .line 869
    invoke-static {v0, v2, v3}, Lcom/unity3d/services/ads/operation/load/LoadOperationState;->b(Lcom/unity3d/services/ads/operation/load/LoadOperationState;Lcom/unity3d/ads/UnityAds$UnityAdsLoadError;Ljava/lang/String;)V

    .line 870
    .line 871
    .line 872
    return-void

    .line 873
    :pswitch_f
    iget-object v0, v1, Lcom/applovin/impl/mediation/ads/f;->d:Ljava/lang/Object;

    .line 874
    .line 875
    check-cast v0, Ljava/lang/Throwable;

    .line 876
    .line 877
    iget-object v2, v1, Lcom/applovin/impl/mediation/ads/f;->c:Ljava/lang/Object;

    .line 878
    .line 879
    check-cast v2, Lcom/unity3d/ads/IUnityAdsLoadListener;

    .line 880
    .line 881
    iget-object v3, v1, Lcom/applovin/impl/mediation/ads/f;->b:Ljava/lang/Object;

    .line 882
    .line 883
    check-cast v3, Ljava/lang/String;

    .line 884
    .line 885
    invoke-static {v2, v3, v0}, Lcom/unity3d/ads/UnityAds;->c(Lcom/unity3d/ads/IUnityAdsLoadListener;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 886
    .line 887
    .line 888
    return-void

    .line 889
    :pswitch_10
    iget-object v0, v1, Lcom/applovin/impl/mediation/ads/f;->d:Ljava/lang/Object;

    .line 890
    .line 891
    check-cast v0, Ljava/lang/Throwable;

    .line 892
    .line 893
    iget-object v2, v1, Lcom/applovin/impl/mediation/ads/f;->c:Ljava/lang/Object;

    .line 894
    .line 895
    check-cast v2, Lcom/unity3d/ads/IUnityAdsShowListener;

    .line 896
    .line 897
    iget-object v3, v1, Lcom/applovin/impl/mediation/ads/f;->b:Ljava/lang/Object;

    .line 898
    .line 899
    check-cast v3, Ljava/lang/String;

    .line 900
    .line 901
    invoke-static {v2, v3, v0}, Lcom/unity3d/ads/UnityAds;->a(Lcom/unity3d/ads/IUnityAdsShowListener;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 902
    .line 903
    .line 904
    return-void

    .line 905
    :pswitch_11
    iget-object v0, v1, Lcom/applovin/impl/mediation/ads/f;->b:Ljava/lang/Object;

    .line 906
    .line 907
    check-cast v0, Landroid/content/ContentResolver;

    .line 908
    .line 909
    iget-object v2, v1, Lcom/applovin/impl/mediation/ads/f;->d:Ljava/lang/Object;

    .line 910
    .line 911
    check-cast v2, Ljava/lang/ref/WeakReference;

    .line 912
    .line 913
    iget-object v3, v1, Lcom/applovin/impl/mediation/ads/f;->c:Ljava/lang/Object;

    .line 914
    .line 915
    check-cast v3, Lcom/qonversion/android/sdk/internal/FacebookAttribution;

    .line 916
    .line 917
    invoke-static {v3, v0, v2}, Lcom/qonversion/android/sdk/internal/FacebookAttribution;->a(Lcom/qonversion/android/sdk/internal/FacebookAttribution;Landroid/content/ContentResolver;Ljava/lang/ref/WeakReference;)V

    .line 918
    .line 919
    .line 920
    return-void

    .line 921
    :pswitch_12
    iget-object v0, v1, Lcom/applovin/impl/mediation/ads/f;->d:Ljava/lang/Object;

    .line 922
    .line 923
    check-cast v0, Lcom/moloco/sdk/publisher/MolocoAdError;

    .line 924
    .line 925
    invoke-virtual {v0}, Lcom/moloco/sdk/publisher/MolocoAdError;->toString()Ljava/lang/String;

    .line 926
    .line 927
    .line 928
    move-result-object v0

    .line 929
    iget-object v2, v1, Lcom/applovin/impl/mediation/ads/f;->c:Ljava/lang/Object;

    .line 930
    .line 931
    check-cast v2, Lcom/moloco/sdk/internal/unity_bridge/MolocoUnityLoadCallback;

    .line 932
    .line 933
    iget-object v3, v1, Lcom/applovin/impl/mediation/ads/f;->b:Ljava/lang/Object;

    .line 934
    .line 935
    check-cast v3, Ljava/lang/String;

    .line 936
    .line 937
    invoke-interface {v2, v3, v0}, Lcom/moloco/sdk/internal/unity_bridge/MolocoUnityLoadCallback;->onAdLoadFailed(Ljava/lang/String;Ljava/lang/String;)V

    .line 938
    .line 939
    .line 940
    return-void

    .line 941
    :pswitch_13
    iget-object v0, v1, Lcom/applovin/impl/mediation/ads/f;->d:Ljava/lang/Object;

    .line 942
    .line 943
    check-cast v0, Lcom/moloco/sdk/publisher/MolocoAdError$AdCreateError;

    .line 944
    .line 945
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 946
    .line 947
    .line 948
    move-result-object v0

    .line 949
    iget-object v2, v1, Lcom/applovin/impl/mediation/ads/f;->c:Ljava/lang/Object;

    .line 950
    .line 951
    check-cast v2, Lcom/moloco/sdk/internal/unity_bridge/MolocoUnityLoadCallback;

    .line 952
    .line 953
    iget-object v3, v1, Lcom/applovin/impl/mediation/ads/f;->b:Ljava/lang/Object;

    .line 954
    .line 955
    check-cast v3, Ljava/lang/String;

    .line 956
    .line 957
    invoke-interface {v2, v3, v0}, Lcom/moloco/sdk/internal/unity_bridge/MolocoUnityLoadCallback;->onAdLoadFailed(Ljava/lang/String;Ljava/lang/String;)V

    .line 958
    .line 959
    .line 960
    return-void

    .line 961
    :pswitch_14
    iget-object v0, v1, Lcom/applovin/impl/mediation/ads/f;->c:Ljava/lang/Object;

    .line 962
    .line 963
    check-cast v0, Lcom/applovin/impl/z0;

    .line 964
    .line 965
    iget-object v2, v1, Lcom/applovin/impl/mediation/ads/f;->b:Ljava/lang/Object;

    .line 966
    .line 967
    check-cast v2, Lcom/applovin/impl/v0;

    .line 968
    .line 969
    iget-object v3, v1, Lcom/applovin/impl/mediation/ads/f;->d:Ljava/lang/Object;

    .line 970
    .line 971
    check-cast v3, Landroid/app/Activity;

    .line 972
    .line 973
    invoke-static {v0, v2, v3}, Lcom/applovin/impl/z0;->b(Lcom/applovin/impl/z0;Lcom/applovin/impl/v0;Landroid/app/Activity;)V

    .line 974
    .line 975
    .line 976
    return-void

    .line 977
    :pswitch_15
    iget-object v0, v1, Lcom/applovin/impl/mediation/ads/f;->b:Ljava/lang/Object;

    .line 978
    .line 979
    check-cast v0, Lcom/applovin/impl/b;

    .line 980
    .line 981
    iget-object v2, v1, Lcom/applovin/impl/mediation/ads/f;->d:Ljava/lang/Object;

    .line 982
    .line 983
    check-cast v2, Lcom/applovin/impl/t4;

    .line 984
    .line 985
    iget-object v3, v1, Lcom/applovin/impl/mediation/ads/f;->c:Ljava/lang/Object;

    .line 986
    .line 987
    check-cast v3, Lcom/applovin/impl/w1;

    .line 988
    .line 989
    invoke-static {v3, v0, v2}, Lcom/applovin/impl/w1;->h(Lcom/applovin/impl/w1;Lcom/applovin/impl/b;Lcom/applovin/impl/t4;)V

    .line 990
    .line 991
    .line 992
    return-void

    .line 993
    :pswitch_16
    iget-object v0, v1, Lcom/applovin/impl/mediation/ads/f;->c:Ljava/lang/Object;

    .line 994
    .line 995
    check-cast v0, Lcom/applovin/impl/t4;

    .line 996
    .line 997
    iget-object v2, v1, Lcom/applovin/impl/mediation/ads/f;->b:Ljava/lang/Object;

    .line 998
    .line 999
    check-cast v2, Ljava/util/concurrent/Executor;

    .line 1000
    .line 1001
    iget-object v3, v1, Lcom/applovin/impl/mediation/ads/f;->d:Ljava/lang/Object;

    .line 1002
    .line 1003
    check-cast v3, Lcom/applovin/impl/t4$b;

    .line 1004
    .line 1005
    invoke-static {v0, v2, v3}, Lcom/applovin/impl/t4;->d(Lcom/applovin/impl/t4;Ljava/util/concurrent/Executor;Lcom/applovin/impl/t4$b;)V

    .line 1006
    .line 1007
    .line 1008
    return-void

    .line 1009
    :pswitch_17
    iget-object v0, v1, Lcom/applovin/impl/mediation/ads/f;->c:Ljava/lang/Object;

    .line 1010
    .line 1011
    check-cast v0, Lcom/applovin/mediation/MaxAdReviewListener;

    .line 1012
    .line 1013
    iget-object v2, v1, Lcom/applovin/impl/mediation/ads/f;->b:Ljava/lang/Object;

    .line 1014
    .line 1015
    check-cast v2, Ljava/lang/String;

    .line 1016
    .line 1017
    iget-object v3, v1, Lcom/applovin/impl/mediation/ads/f;->d:Ljava/lang/Object;

    .line 1018
    .line 1019
    check-cast v3, Lcom/applovin/mediation/MaxAd;

    .line 1020
    .line 1021
    invoke-static {v0, v2, v3}, Lcom/applovin/impl/t2;->E(Lcom/applovin/mediation/MaxAdReviewListener;Ljava/lang/String;Lcom/applovin/mediation/MaxAd;)V

    .line 1022
    .line 1023
    .line 1024
    return-void

    .line 1025
    :pswitch_18
    iget-object v0, v1, Lcom/applovin/impl/mediation/ads/f;->d:Ljava/lang/Object;

    .line 1026
    .line 1027
    check-cast v0, Landroid/widget/ImageView;

    .line 1028
    .line 1029
    iget-object v2, v1, Lcom/applovin/impl/mediation/ads/f;->c:Ljava/lang/Object;

    .line 1030
    .line 1031
    check-cast v2, Lcom/applovin/impl/sdk/k;

    .line 1032
    .line 1033
    iget-object v3, v1, Lcom/applovin/impl/mediation/ads/f;->b:Ljava/lang/Object;

    .line 1034
    .line 1035
    check-cast v3, Landroid/graphics/Bitmap;

    .line 1036
    .line 1037
    invoke-static {v2, v3, v0}, Lcom/applovin/impl/sdk/utils/ImageViewUtils;->g(Lcom/applovin/impl/sdk/k;Landroid/graphics/Bitmap;Landroid/widget/ImageView;)V

    .line 1038
    .line 1039
    .line 1040
    return-void

    .line 1041
    :pswitch_19
    iget-object v0, v1, Lcom/applovin/impl/mediation/ads/f;->b:Ljava/lang/Object;

    .line 1042
    .line 1043
    check-cast v0, Lcom/applovin/impl/sdk/network/d;

    .line 1044
    .line 1045
    iget-object v2, v1, Lcom/applovin/impl/mediation/ads/f;->c:Ljava/lang/Object;

    .line 1046
    .line 1047
    check-cast v2, Lcom/applovin/impl/sdk/network/b;

    .line 1048
    .line 1049
    iget-object v3, v1, Lcom/applovin/impl/mediation/ads/f;->d:Ljava/lang/Object;

    .line 1050
    .line 1051
    check-cast v3, Lcom/applovin/sdk/AppLovinPostbackListener;

    .line 1052
    .line 1053
    invoke-static {v2, v0, v3}, Lcom/applovin/impl/sdk/network/b;->e(Lcom/applovin/impl/sdk/network/b;Lcom/applovin/impl/sdk/network/d;Lcom/applovin/sdk/AppLovinPostbackListener;)V

    .line 1054
    .line 1055
    .line 1056
    return-void

    .line 1057
    :pswitch_1a
    iget-object v0, v1, Lcom/applovin/impl/mediation/ads/f;->b:Ljava/lang/Object;

    .line 1058
    .line 1059
    check-cast v0, Lcom/applovin/impl/e5;

    .line 1060
    .line 1061
    iget-object v2, v1, Lcom/applovin/impl/mediation/ads/f;->c:Ljava/lang/Object;

    .line 1062
    .line 1063
    check-cast v2, Lcom/applovin/impl/q5;

    .line 1064
    .line 1065
    iget-object v3, v1, Lcom/applovin/impl/mediation/ads/f;->d:Ljava/lang/Object;

    .line 1066
    .line 1067
    check-cast v3, Lcom/applovin/impl/d5$a;

    .line 1068
    .line 1069
    invoke-static {v2, v0, v3}, Lcom/applovin/impl/q5;->e(Lcom/applovin/impl/q5;Lcom/applovin/impl/e5;Lcom/applovin/impl/d5$a;)V

    .line 1070
    .line 1071
    .line 1072
    return-void

    .line 1073
    :pswitch_1b
    iget-object v0, v1, Lcom/applovin/impl/mediation/ads/f;->d:Ljava/lang/Object;

    .line 1074
    .line 1075
    check-cast v0, Lcom/applovin/impl/t4;

    .line 1076
    .line 1077
    iget-object v2, v1, Lcom/applovin/impl/mediation/ads/f;->c:Ljava/lang/Object;

    .line 1078
    .line 1079
    check-cast v2, Landroid/webkit/WebView;

    .line 1080
    .line 1081
    iget-object v3, v1, Lcom/applovin/impl/mediation/ads/f;->b:Ljava/lang/Object;

    .line 1082
    .line 1083
    check-cast v3, Ljava/lang/String;

    .line 1084
    .line 1085
    invoke-static {v2, v3, v0}, Lcom/applovin/impl/p8;->e(Landroid/webkit/WebView;Ljava/lang/String;Lcom/applovin/impl/t4;)V

    .line 1086
    .line 1087
    .line 1088
    return-void

    .line 1089
    :pswitch_1c
    iget-object v0, v1, Lcom/applovin/impl/mediation/ads/f;->c:Ljava/lang/Object;

    .line 1090
    .line 1091
    check-cast v0, Lcom/applovin/impl/mediation/ads/MaxFullscreenAdImpl$b;

    .line 1092
    .line 1093
    iget-object v2, v1, Lcom/applovin/impl/mediation/ads/f;->b:Ljava/lang/Object;

    .line 1094
    .line 1095
    check-cast v2, Ljava/lang/String;

    .line 1096
    .line 1097
    iget-object v3, v1, Lcom/applovin/impl/mediation/ads/f;->d:Ljava/lang/Object;

    .line 1098
    .line 1099
    check-cast v3, Lcom/applovin/mediation/MaxError;

    .line 1100
    .line 1101
    invoke-static {v0, v2, v3}, Lcom/applovin/impl/mediation/ads/MaxFullscreenAdImpl$b;->b(Lcom/applovin/impl/mediation/ads/MaxFullscreenAdImpl$b;Ljava/lang/String;Lcom/applovin/mediation/MaxError;)V

    .line 1102
    .line 1103
    .line 1104
    return-void

    .line 1105
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
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
