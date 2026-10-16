.class public final Lvd/s;
.super Lmd/P;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static d(Ljava/util/Map;)Lmd/d0;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-string v1, "interval"

    .line 4
    .line 5
    invoke-static {v1, v0}, Lod/r0;->i(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/Long;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-string v2, "baseEjectionTime"

    .line 10
    .line 11
    invoke-static {v2, v0}, Lod/r0;->i(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/Long;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    const-string v3, "maxEjectionTime"

    .line 16
    .line 17
    invoke-static {v3, v0}, Lod/r0;->i(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/Long;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    const-string v4, "maxEjectionPercentage"

    .line 22
    .line 23
    invoke-static {v4, v0}, Lod/r0;->f(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/Integer;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    const-wide v5, 0x2540be400L

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    const-wide v6, 0x6fc23ac00L

    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 42
    .line 43
    .line 44
    move-result-object v6

    .line 45
    const-wide v7, 0x45d964b800L

    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 51
    .line 52
    .line 53
    move-result-object v7

    .line 54
    const/16 v8, 0xa

    .line 55
    .line 56
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 57
    .line 58
    .line 59
    move-result-object v8

    .line 60
    if-eqz v1, :cond_0

    .line 61
    .line 62
    move-object v10, v1

    .line 63
    goto :goto_0

    .line 64
    :cond_0
    move-object v10, v5

    .line 65
    :goto_0
    if-eqz v2, :cond_1

    .line 66
    .line 67
    move-object v11, v2

    .line 68
    goto :goto_1

    .line 69
    :cond_1
    move-object v11, v6

    .line 70
    :goto_1
    if-eqz v3, :cond_2

    .line 71
    .line 72
    move-object v12, v3

    .line 73
    goto :goto_2

    .line 74
    :cond_2
    move-object v12, v7

    .line 75
    :goto_2
    if-eqz v4, :cond_3

    .line 76
    .line 77
    move-object v13, v4

    .line 78
    goto :goto_3

    .line 79
    :cond_3
    move-object v13, v8

    .line 80
    :goto_3
    const-string v1, "successRateEjection"

    .line 81
    .line 82
    invoke-static {v1, v0}, Lod/r0;->g(Ljava/lang/String;Ljava/util/Map;)Ljava/util/Map;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    const-string v2, "requestVolume"

    .line 87
    .line 88
    const-string v3, "minimumHosts"

    .line 89
    .line 90
    const-string v4, "enforcementPercentage"

    .line 91
    .line 92
    const/4 v5, 0x5

    .line 93
    const/16 v6, 0x64

    .line 94
    .line 95
    const/4 v9, 0x0

    .line 96
    if-eqz v1, :cond_b

    .line 97
    .line 98
    const/16 v14, 0x76c

    .line 99
    .line 100
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 101
    .line 102
    .line 103
    move-result-object v14

    .line 104
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 105
    .line 106
    .line 107
    move-result-object v15

    .line 108
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 109
    .line 110
    .line 111
    move-result-object v16

    .line 112
    move/from16 v17, v5

    .line 113
    .line 114
    const-string v5, "stdevFactor"

    .line 115
    .line 116
    invoke-static {v5, v1}, Lod/r0;->f(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/Integer;

    .line 117
    .line 118
    .line 119
    move-result-object v5

    .line 120
    invoke-static {v4, v1}, Lod/r0;->f(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/Integer;

    .line 121
    .line 122
    .line 123
    move-result-object v18

    .line 124
    invoke-static {v3, v1}, Lod/r0;->f(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/Integer;

    .line 125
    .line 126
    .line 127
    move-result-object v19

    .line 128
    invoke-static {v2, v1}, Lod/r0;->f(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/Integer;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    if-eqz v5, :cond_4

    .line 133
    .line 134
    move-object v14, v5

    .line 135
    :cond_4
    if-eqz v18, :cond_6

    .line 136
    .line 137
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Integer;->intValue()I

    .line 138
    .line 139
    .line 140
    move-result v5

    .line 141
    if-ltz v5, :cond_5

    .line 142
    .line 143
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Integer;->intValue()I

    .line 144
    .line 145
    .line 146
    move-result v5

    .line 147
    if-gt v5, v6, :cond_5

    .line 148
    .line 149
    const/4 v5, 0x1

    .line 150
    goto :goto_4

    .line 151
    :cond_5
    const/4 v5, 0x0

    .line 152
    :goto_4
    invoke-static {v5}, LFe/e;->q(Z)V

    .line 153
    .line 154
    .line 155
    move-object/from16 v5, v18

    .line 156
    .line 157
    goto :goto_5

    .line 158
    :cond_6
    move-object v5, v15

    .line 159
    :goto_5
    if-eqz v19, :cond_8

    .line 160
    .line 161
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Integer;->intValue()I

    .line 162
    .line 163
    .line 164
    move-result v16

    .line 165
    if-ltz v16, :cond_7

    .line 166
    .line 167
    const/16 v16, 0x1

    .line 168
    .line 169
    goto :goto_6

    .line 170
    :cond_7
    const/16 v16, 0x0

    .line 171
    .line 172
    :goto_6
    invoke-static/range {v16 .. v16}, LFe/e;->q(Z)V

    .line 173
    .line 174
    .line 175
    move-object/from16 v7, v19

    .line 176
    .line 177
    goto :goto_7

    .line 178
    :cond_8
    move-object/from16 v7, v16

    .line 179
    .line 180
    :goto_7
    if-eqz v1, :cond_a

    .line 181
    .line 182
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 183
    .line 184
    .line 185
    move-result v15

    .line 186
    if-ltz v15, :cond_9

    .line 187
    .line 188
    const/4 v15, 0x1

    .line 189
    goto :goto_8

    .line 190
    :cond_9
    const/4 v15, 0x0

    .line 191
    :goto_8
    invoke-static {v15}, LFe/e;->q(Z)V

    .line 192
    .line 193
    .line 194
    move-object v15, v1

    .line 195
    :cond_a
    new-instance v1, LS3/i;

    .line 196
    .line 197
    invoke-direct {v1, v14, v5, v7, v15}, LS3/i;-><init>(Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 198
    .line 199
    .line 200
    move-object v14, v1

    .line 201
    goto :goto_9

    .line 202
    :cond_b
    move/from16 v17, v5

    .line 203
    .line 204
    move-object v14, v9

    .line 205
    :goto_9
    const-string v1, "failurePercentageEjection"

    .line 206
    .line 207
    invoke-static {v1, v0}, Lod/r0;->g(Ljava/lang/String;Ljava/util/Map;)Ljava/util/Map;

    .line 208
    .line 209
    .line 210
    move-result-object v1

    .line 211
    if-eqz v1, :cond_14

    .line 212
    .line 213
    const/16 v5, 0x55

    .line 214
    .line 215
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 216
    .line 217
    .line 218
    move-result-object v5

    .line 219
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 220
    .line 221
    .line 222
    move-result-object v7

    .line 223
    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 224
    .line 225
    .line 226
    move-result-object v15

    .line 227
    const/16 v16, 0x32

    .line 228
    .line 229
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 230
    .line 231
    .line 232
    move-result-object v16

    .line 233
    const-string v8, "threshold"

    .line 234
    .line 235
    invoke-static {v8, v1}, Lod/r0;->f(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/Integer;

    .line 236
    .line 237
    .line 238
    move-result-object v8

    .line 239
    invoke-static {v4, v1}, Lod/r0;->f(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/Integer;

    .line 240
    .line 241
    .line 242
    move-result-object v4

    .line 243
    invoke-static {v3, v1}, Lod/r0;->f(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/Integer;

    .line 244
    .line 245
    .line 246
    move-result-object v3

    .line 247
    invoke-static {v2, v1}, Lod/r0;->f(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/Integer;

    .line 248
    .line 249
    .line 250
    move-result-object v1

    .line 251
    if-eqz v8, :cond_d

    .line 252
    .line 253
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 254
    .line 255
    .line 256
    move-result v2

    .line 257
    if-ltz v2, :cond_c

    .line 258
    .line 259
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 260
    .line 261
    .line 262
    move-result v2

    .line 263
    if-gt v2, v6, :cond_c

    .line 264
    .line 265
    const/4 v2, 0x1

    .line 266
    goto :goto_a

    .line 267
    :cond_c
    const/4 v2, 0x0

    .line 268
    :goto_a
    invoke-static {v2}, LFe/e;->q(Z)V

    .line 269
    .line 270
    .line 271
    move-object v5, v8

    .line 272
    :cond_d
    if-eqz v4, :cond_f

    .line 273
    .line 274
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 275
    .line 276
    .line 277
    move-result v2

    .line 278
    if-ltz v2, :cond_e

    .line 279
    .line 280
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 281
    .line 282
    .line 283
    move-result v2

    .line 284
    if-gt v2, v6, :cond_e

    .line 285
    .line 286
    const/4 v2, 0x1

    .line 287
    goto :goto_b

    .line 288
    :cond_e
    const/4 v2, 0x0

    .line 289
    :goto_b
    invoke-static {v2}, LFe/e;->q(Z)V

    .line 290
    .line 291
    .line 292
    move-object v7, v4

    .line 293
    :cond_f
    if-eqz v3, :cond_11

    .line 294
    .line 295
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 296
    .line 297
    .line 298
    move-result v2

    .line 299
    if-ltz v2, :cond_10

    .line 300
    .line 301
    const/4 v2, 0x1

    .line 302
    goto :goto_c

    .line 303
    :cond_10
    const/4 v2, 0x0

    .line 304
    :goto_c
    invoke-static {v2}, LFe/e;->q(Z)V

    .line 305
    .line 306
    .line 307
    move-object v15, v3

    .line 308
    :cond_11
    if-eqz v1, :cond_13

    .line 309
    .line 310
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 311
    .line 312
    .line 313
    move-result v2

    .line 314
    if-ltz v2, :cond_12

    .line 315
    .line 316
    const/4 v2, 0x1

    .line 317
    goto :goto_d

    .line 318
    :cond_12
    const/4 v2, 0x0

    .line 319
    :goto_d
    invoke-static {v2}, LFe/e;->q(Z)V

    .line 320
    .line 321
    .line 322
    goto :goto_e

    .line 323
    :cond_13
    move-object/from16 v1, v16

    .line 324
    .line 325
    :goto_e
    new-instance v2, LW9/u;

    .line 326
    .line 327
    invoke-direct {v2, v5, v7, v15, v1}, LW9/u;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 328
    .line 329
    .line 330
    move-object v15, v2

    .line 331
    goto :goto_f

    .line 332
    :cond_14
    move-object v15, v9

    .line 333
    :goto_f
    const-string v1, "childPolicy"

    .line 334
    .line 335
    invoke-static {v1, v0}, Lod/r0;->c(Ljava/lang/String;Ljava/util/Map;)Ljava/util/List;

    .line 336
    .line 337
    .line 338
    move-result-object v1

    .line 339
    if-nez v1, :cond_15

    .line 340
    .line 341
    goto :goto_10

    .line 342
    :cond_15
    invoke-static {v1}, Lod/r0;->a(Ljava/util/List;)V

    .line 343
    .line 344
    .line 345
    move-object v9, v1

    .line 346
    :goto_10
    invoke-static {v9}, Lod/S1;->t(Ljava/util/List;)Ljava/util/List;

    .line 347
    .line 348
    .line 349
    move-result-object v1

    .line 350
    if-eqz v1, :cond_1a

    .line 351
    .line 352
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 353
    .line 354
    .line 355
    move-result v2

    .line 356
    if-eqz v2, :cond_16

    .line 357
    .line 358
    goto :goto_13

    .line 359
    :cond_16
    invoke-static {}, Lmd/Q;->b()Lmd/Q;

    .line 360
    .line 361
    .line 362
    move-result-object v0

    .line 363
    invoke-static {v1, v0}, Lod/S1;->s(Ljava/util/List;Lmd/Q;)Lmd/d0;

    .line 364
    .line 365
    .line 366
    move-result-object v0

    .line 367
    iget-object v1, v0, Lmd/d0;->a:Lmd/k0;

    .line 368
    .line 369
    if-eqz v1, :cond_17

    .line 370
    .line 371
    return-object v0

    .line 372
    :cond_17
    iget-object v0, v0, Lmd/d0;->b:Ljava/lang/Object;

    .line 373
    .line 374
    move-object/from16 v16, v0

    .line 375
    .line 376
    check-cast v16, Lod/R1;

    .line 377
    .line 378
    if-eqz v16, :cond_18

    .line 379
    .line 380
    const/4 v0, 0x1

    .line 381
    goto :goto_11

    .line 382
    :cond_18
    const/4 v0, 0x0

    .line 383
    :goto_11
    invoke-static {v0}, LFe/e;->x(Z)V

    .line 384
    .line 385
    .line 386
    if-eqz v16, :cond_19

    .line 387
    .line 388
    const/4 v7, 0x1

    .line 389
    goto :goto_12

    .line 390
    :cond_19
    const/4 v7, 0x0

    .line 391
    :goto_12
    invoke-static {v7}, LFe/e;->x(Z)V

    .line 392
    .line 393
    .line 394
    new-instance v9, Lvd/m;

    .line 395
    .line 396
    invoke-direct/range {v9 .. v16}, Lvd/m;-><init>(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;LS3/i;LW9/u;Lod/R1;)V

    .line 397
    .line 398
    .line 399
    new-instance v0, Lmd/d0;

    .line 400
    .line 401
    invoke-direct {v0, v9}, Lmd/d0;-><init>(Ljava/lang/Object;)V

    .line 402
    .line 403
    .line 404
    return-object v0

    .line 405
    :cond_1a
    :goto_13
    sget-object v1, Lmd/k0;->m:Lmd/k0;

    .line 406
    .line 407
    new-instance v2, Ljava/lang/StringBuilder;

    .line 408
    .line 409
    const-string v3, "No child policy in outlier_detection_experimental LB policy: "

    .line 410
    .line 411
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 412
    .line 413
    .line 414
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 415
    .line 416
    .line 417
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 418
    .line 419
    .line 420
    move-result-object v0

    .line 421
    invoke-virtual {v1, v0}, Lmd/k0;->h(Ljava/lang/String;)Lmd/k0;

    .line 422
    .line 423
    .line 424
    move-result-object v0

    .line 425
    new-instance v1, Lmd/d0;

    .line 426
    .line 427
    invoke-direct {v1, v0}, Lmd/d0;-><init>(Lmd/k0;)V

    .line 428
    .line 429
    .line 430
    return-object v1
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "outlier_detection_experimental"

    .line 2
    .line 3
    return-object v0
.end method

.method public final b(Lmd/y;)Lmd/O;
    .locals 1

    .line 1
    new-instance v0, Lvd/r;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lvd/r;-><init>(Lmd/y;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final c(Ljava/util/Map;)Lmd/d0;
    .locals 1

    .line 1
    :try_start_0
    invoke-static {p1}, Lvd/s;->d(Ljava/util/Map;)Lmd/d0;

    .line 2
    .line 3
    .line 4
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    return-object p1

    .line 6
    :catch_0
    move-exception p1

    .line 7
    sget-object v0, Lmd/k0;->n:Lmd/k0;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lmd/k0;->g(Ljava/lang/Throwable;)Lmd/k0;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    const-string v0, "Failed parsing configuration for outlier_detection_experimental"

    .line 14
    .line 15
    invoke-virtual {p1, v0}, Lmd/k0;->h(Ljava/lang/String;)Lmd/k0;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    new-instance v0, Lmd/d0;

    .line 20
    .line 21
    invoke-direct {v0, p1}, Lmd/d0;-><init>(Lmd/k0;)V

    .line 22
    .line 23
    .line 24
    return-object v0
.end method
