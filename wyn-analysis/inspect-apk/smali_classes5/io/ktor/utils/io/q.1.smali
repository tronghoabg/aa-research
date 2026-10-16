.class public final Lio/ktor/utils/io/q;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lio/ktor/utils/io/t;

.field public final b:LQf/a;

.field public final c:Lio/ktor/utils/io/J;

.field public final d:J

.field public final e:LPf/i;

.field public final f:[I

.field public final g:LPf/a;

.field public h:J

.field public i:I


# direct methods
.method public constructor <init>(Lio/ktor/utils/io/t;LQf/a;Lio/ktor/utils/io/J;J)V
    .locals 2

    .line 1
    const-string v0, "channel"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "matchString"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "writeChannel"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lio/ktor/utils/io/q;->a:Lio/ktor/utils/io/t;

    .line 20
    .line 21
    iput-object p2, p0, Lio/ktor/utils/io/q;->b:LQf/a;

    .line 22
    .line 23
    iput-object p3, p0, Lio/ktor/utils/io/q;->c:Lio/ktor/utils/io/J;

    .line 24
    .line 25
    iput-wide p4, p0, Lio/ktor/utils/io/q;->d:J

    .line 26
    .line 27
    iget-object p3, p2, LQf/a;->a:[B

    .line 28
    .line 29
    array-length p4, p3

    .line 30
    if-lez p4, :cond_3

    .line 31
    .line 32
    invoke-interface {p1}, Lio/ktor/utils/io/t;->d()LPf/a;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iput-object p1, p0, Lio/ktor/utils/io/q;->e:LPf/i;

    .line 37
    .line 38
    array-length p1, p3

    .line 39
    new-array p1, p1, [I

    .line 40
    .line 41
    array-length p3, p3

    .line 42
    const/4 p4, 0x1

    .line 43
    const/4 p5, 0x0

    .line 44
    :goto_0
    if-ge p4, p3, :cond_2

    .line 45
    .line 46
    :goto_1
    if-lez p5, :cond_0

    .line 47
    .line 48
    invoke-virtual {p2, p4}, LQf/a;->a(I)B

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    invoke-virtual {p2, p5}, LQf/a;->a(I)B

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-eq v0, v1, :cond_0

    .line 57
    .line 58
    add-int/lit8 p5, p5, -0x1

    .line 59
    .line 60
    aget p5, p1, p5

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_0
    invoke-virtual {p2, p4}, LQf/a;->a(I)B

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    invoke-virtual {p2, p5}, LQf/a;->a(I)B

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-ne v0, v1, :cond_1

    .line 72
    .line 73
    add-int/lit8 p5, p5, 0x1

    .line 74
    .line 75
    :cond_1
    aput p5, p1, p4

    .line 76
    .line 77
    add-int/lit8 p4, p4, 0x1

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_2
    iput-object p1, p0, Lio/ktor/utils/io/q;->f:[I

    .line 81
    .line 82
    new-instance p1, LPf/a;

    .line 83
    .line 84
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 85
    .line 86
    .line 87
    iput-object p1, p0, Lio/ktor/utils/io/q;->g:LPf/a;

    .line 88
    .line 89
    return-void

    .line 90
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 91
    .line 92
    const-string p2, "Empty match string not permitted for scanning"

    .line 93
    .line 94
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    throw p1
.end method


# virtual methods
.method public final a(Llf/c;)Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    instance-of v2, v1, Lio/ktor/utils/io/n;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, Lio/ktor/utils/io/n;

    .line 11
    .line 12
    iget v3, v2, Lio/ktor/utils/io/n;->c:I

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
    iput v3, v2, Lio/ktor/utils/io/n;->c:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, Lio/ktor/utils/io/n;

    .line 25
    .line 26
    invoke-direct {v2, v0, v1}, Lio/ktor/utils/io/n;-><init>(Lio/ktor/utils/io/q;Llf/c;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v1, v2, Lio/ktor/utils/io/n;->a:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, Lkf/a;->a:Lkf/a;

    .line 32
    .line 33
    iget v4, v2, Lio/ktor/utils/io/n;->c:I

    .line 34
    .line 35
    sget-object v5, Lef/C;->a:Lef/C;

    .line 36
    .line 37
    const/4 v6, 0x1

    .line 38
    const/4 v7, 0x3

    .line 39
    const/4 v8, 0x2

    .line 40
    iget-object v9, v0, Lio/ktor/utils/io/q;->e:LPf/i;

    .line 41
    .line 42
    if-eqz v4, :cond_4

    .line 43
    .line 44
    if-eq v4, v6, :cond_3

    .line 45
    .line 46
    if-eq v4, v8, :cond_2

    .line 47
    .line 48
    if-ne v4, v7, :cond_1

    .line 49
    .line 50
    invoke-static {v1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    return-object v5

    .line 54
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 55
    .line 56
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 57
    .line 58
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    throw v1

    .line 62
    :cond_2
    invoke-static {v1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    move-object v15, v5

    .line 66
    move v1, v8

    .line 67
    goto/16 :goto_c

    .line 68
    .line 69
    :cond_3
    invoke-static {v1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_4
    invoke-static {v1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    :goto_1
    invoke-interface {v9}, LPf/i;->exhausted()Z

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    if-eqz v1, :cond_7

    .line 81
    .line 82
    iput v6, v2, Lio/ktor/utils/io/n;->c:I

    .line 83
    .line 84
    iget-object v1, v0, Lio/ktor/utils/io/q;->a:Lio/ktor/utils/io/t;

    .line 85
    .line 86
    invoke-interface {v1, v6, v2}, Lio/ktor/utils/io/t;->g(ILlf/c;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    if-ne v1, v3, :cond_5

    .line 91
    .line 92
    goto/16 :goto_d

    .line 93
    .line 94
    :cond_5
    :goto_2
    check-cast v1, Ljava/lang/Boolean;

    .line 95
    .line 96
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    if-eqz v1, :cond_6

    .line 101
    .line 102
    goto :goto_3

    .line 103
    :cond_6
    move-object v15, v5

    .line 104
    goto/16 :goto_e

    .line 105
    .line 106
    :cond_7
    :goto_3
    iget-object v1, v0, Lio/ktor/utils/io/q;->b:LQf/a;

    .line 107
    .line 108
    const/4 v4, 0x0

    .line 109
    invoke-virtual {v1, v4}, LQf/a;->a(I)B

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    const-string v10, "<this>"

    .line 114
    .line 115
    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    const-wide/16 v15, 0x0

    .line 119
    .line 120
    :goto_4
    const-wide v13, 0x7fffffffffffffffL

    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    cmp-long v17, v15, v13

    .line 126
    .line 127
    const-wide/16 v19, -0x1

    .line 128
    .line 129
    if-gez v17, :cond_17

    .line 130
    .line 131
    const-wide/16 v17, 0x1

    .line 132
    .line 133
    add-long v11, v15, v17

    .line 134
    .line 135
    invoke-interface {v9, v11, v12}, LPf/i;->request(J)Z

    .line 136
    .line 137
    .line 138
    move-result v11

    .line 139
    if-eqz v11, :cond_17

    .line 140
    .line 141
    invoke-interface {v9}, LPf/i;->getBuffer()LPf/a;

    .line 142
    .line 143
    .line 144
    move-result-object v11

    .line 145
    invoke-interface {v9}, LPf/i;->getBuffer()LPf/a;

    .line 146
    .line 147
    .line 148
    move-result-object v12

    .line 149
    iget-wide v6, v12, LPf/a;->c:J

    .line 150
    .line 151
    invoke-static {v13, v14, v6, v7}, Ljava/lang/Math;->min(JJ)J

    .line 152
    .line 153
    .line 154
    move-result-wide v6

    .line 155
    invoke-static {v11, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    iget-wide v12, v11, LPf/a;->c:J

    .line 159
    .line 160
    invoke-static {v6, v7, v12, v13}, Ljava/lang/Math;->min(JJ)J

    .line 161
    .line 162
    .line 163
    move-result-wide v17

    .line 164
    iget-wide v13, v11, LPf/a;->c:J

    .line 165
    .line 166
    invoke-static/range {v13 .. v18}, LPf/j;->a(JJJ)V

    .line 167
    .line 168
    .line 169
    cmp-long v6, v15, v17

    .line 170
    .line 171
    if-nez v6, :cond_9

    .line 172
    .line 173
    :goto_5
    move-object v15, v5

    .line 174
    :cond_8
    :goto_6
    move-wide/from16 v12, v19

    .line 175
    .line 176
    goto/16 :goto_a

    .line 177
    .line 178
    :cond_9
    iget-object v6, v11, LPf/a;->a:LPf/g;

    .line 179
    .line 180
    if-nez v6, :cond_a

    .line 181
    .line 182
    goto :goto_5

    .line 183
    :cond_a
    iget-wide v12, v11, LPf/a;->c:J

    .line 184
    .line 185
    sub-long v21, v12, v15

    .line 186
    .line 187
    cmp-long v7, v21, v15

    .line 188
    .line 189
    const-string v8, "Check failed."

    .line 190
    .line 191
    if-gez v7, :cond_11

    .line 192
    .line 193
    iget-object v6, v11, LPf/a;->b:LPf/g;

    .line 194
    .line 195
    :goto_7
    if-eqz v6, :cond_b

    .line 196
    .line 197
    cmp-long v7, v12, v15

    .line 198
    .line 199
    if-lez v7, :cond_b

    .line 200
    .line 201
    iget v7, v6, LPf/g;->c:I

    .line 202
    .line 203
    iget v11, v6, LPf/g;->b:I

    .line 204
    .line 205
    sub-int/2addr v7, v11

    .line 206
    move-wide/from16 v22, v15

    .line 207
    .line 208
    int-to-long v14, v7

    .line 209
    sub-long/2addr v12, v14

    .line 210
    cmp-long v7, v12, v22

    .line 211
    .line 212
    if-lez v7, :cond_c

    .line 213
    .line 214
    iget-object v6, v6, LPf/g;->g:LPf/g;

    .line 215
    .line 216
    move-wide/from16 v15, v22

    .line 217
    .line 218
    goto :goto_7

    .line 219
    :cond_b
    move-wide/from16 v22, v15

    .line 220
    .line 221
    :cond_c
    cmp-long v7, v12, v19

    .line 222
    .line 223
    if-nez v7, :cond_d

    .line 224
    .line 225
    goto :goto_5

    .line 226
    :cond_d
    :goto_8
    cmp-long v7, v17, v12

    .line 227
    .line 228
    if-lez v7, :cond_10

    .line 229
    .line 230
    invoke-static {v6}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 231
    .line 232
    .line 233
    sub-long v14, v22, v12

    .line 234
    .line 235
    long-to-int v7, v14

    .line 236
    invoke-static {v7, v4}, Ljava/lang/Math;->max(II)I

    .line 237
    .line 238
    .line 239
    move-result v7

    .line 240
    invoke-virtual {v6}, LPf/g;->a()I

    .line 241
    .line 242
    .line 243
    move-result v14

    .line 244
    move-object v15, v5

    .line 245
    sub-long v4, v17, v12

    .line 246
    .line 247
    long-to-int v4, v4

    .line 248
    invoke-static {v14, v4}, Ljava/lang/Math;->min(II)I

    .line 249
    .line 250
    .line 251
    move-result v4

    .line 252
    invoke-static {v6, v1, v7, v4}, LPf/j;->d(LPf/g;BII)I

    .line 253
    .line 254
    .line 255
    move-result v4

    .line 256
    const/4 v11, -0x1

    .line 257
    if-eq v4, v11, :cond_e

    .line 258
    .line 259
    int-to-long v4, v4

    .line 260
    add-long/2addr v12, v4

    .line 261
    goto/16 :goto_a

    .line 262
    .line 263
    :cond_e
    invoke-virtual {v6}, LPf/g;->a()I

    .line 264
    .line 265
    .line 266
    move-result v4

    .line 267
    int-to-long v4, v4

    .line 268
    add-long/2addr v12, v4

    .line 269
    iget-object v6, v6, LPf/g;->f:LPf/g;

    .line 270
    .line 271
    if-eqz v6, :cond_8

    .line 272
    .line 273
    cmp-long v4, v12, v17

    .line 274
    .line 275
    if-ltz v4, :cond_f

    .line 276
    .line 277
    goto :goto_6

    .line 278
    :cond_f
    move-object v5, v15

    .line 279
    const/4 v4, 0x0

    .line 280
    goto :goto_8

    .line 281
    :cond_10
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 282
    .line 283
    invoke-direct {v1, v8}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 284
    .line 285
    .line 286
    throw v1

    .line 287
    :cond_11
    move-wide/from16 v22, v15

    .line 288
    .line 289
    move-object v15, v5

    .line 290
    const-wide/16 v4, 0x0

    .line 291
    .line 292
    :goto_9
    if-eqz v6, :cond_12

    .line 293
    .line 294
    iget v7, v6, LPf/g;->c:I

    .line 295
    .line 296
    iget v12, v6, LPf/g;->b:I

    .line 297
    .line 298
    sub-int/2addr v7, v12

    .line 299
    int-to-long v12, v7

    .line 300
    add-long/2addr v12, v4

    .line 301
    cmp-long v7, v12, v22

    .line 302
    .line 303
    if-gtz v7, :cond_12

    .line 304
    .line 305
    iget-object v6, v6, LPf/g;->f:LPf/g;

    .line 306
    .line 307
    move-wide v4, v12

    .line 308
    goto :goto_9

    .line 309
    :cond_12
    cmp-long v7, v4, v19

    .line 310
    .line 311
    if-nez v7, :cond_13

    .line 312
    .line 313
    goto/16 :goto_6

    .line 314
    .line 315
    :cond_13
    cmp-long v7, v17, v4

    .line 316
    .line 317
    if-lez v7, :cond_16

    .line 318
    .line 319
    invoke-static {v6}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 320
    .line 321
    .line 322
    sub-long v12, v22, v4

    .line 323
    .line 324
    long-to-int v7, v12

    .line 325
    const/4 v12, 0x0

    .line 326
    invoke-static {v7, v12}, Ljava/lang/Math;->max(II)I

    .line 327
    .line 328
    .line 329
    move-result v7

    .line 330
    invoke-virtual {v6}, LPf/g;->a()I

    .line 331
    .line 332
    .line 333
    move-result v13

    .line 334
    sub-long v11, v17, v4

    .line 335
    .line 336
    long-to-int v11, v11

    .line 337
    invoke-static {v13, v11}, Ljava/lang/Math;->min(II)I

    .line 338
    .line 339
    .line 340
    move-result v11

    .line 341
    invoke-static {v6, v1, v7, v11}, LPf/j;->d(LPf/g;BII)I

    .line 342
    .line 343
    .line 344
    move-result v7

    .line 345
    const/4 v11, -0x1

    .line 346
    if-eq v7, v11, :cond_14

    .line 347
    .line 348
    int-to-long v6, v7

    .line 349
    add-long v12, v4, v6

    .line 350
    .line 351
    goto :goto_a

    .line 352
    :cond_14
    invoke-virtual {v6}, LPf/g;->a()I

    .line 353
    .line 354
    .line 355
    move-result v7

    .line 356
    int-to-long v12, v7

    .line 357
    add-long/2addr v4, v12

    .line 358
    iget-object v6, v6, LPf/g;->f:LPf/g;

    .line 359
    .line 360
    if-eqz v6, :cond_8

    .line 361
    .line 362
    cmp-long v7, v4, v17

    .line 363
    .line 364
    if-ltz v7, :cond_13

    .line 365
    .line 366
    goto/16 :goto_6

    .line 367
    .line 368
    :goto_a
    cmp-long v4, v12, v19

    .line 369
    .line 370
    if-eqz v4, :cond_15

    .line 371
    .line 372
    goto :goto_b

    .line 373
    :cond_15
    invoke-interface {v9}, LPf/i;->getBuffer()LPf/a;

    .line 374
    .line 375
    .line 376
    move-result-object v4

    .line 377
    iget-wide v4, v4, LPf/a;->c:J

    .line 378
    .line 379
    move-wide v6, v4

    .line 380
    move-object v5, v15

    .line 381
    move-wide v15, v6

    .line 382
    const/4 v4, 0x0

    .line 383
    const/4 v6, 0x1

    .line 384
    const/4 v7, 0x3

    .line 385
    const/4 v8, 0x2

    .line 386
    goto/16 :goto_4

    .line 387
    .line 388
    :cond_16
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 389
    .line 390
    invoke-direct {v1, v8}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 391
    .line 392
    .line 393
    throw v1

    .line 394
    :cond_17
    move-object v15, v5

    .line 395
    move-wide/from16 v12, v19

    .line 396
    .line 397
    :goto_b
    cmp-long v1, v12, v19

    .line 398
    .line 399
    iget-object v4, v0, Lio/ktor/utils/io/q;->c:Lio/ktor/utils/io/J;

    .line 400
    .line 401
    if-nez v1, :cond_19

    .line 402
    .line 403
    move-object v1, v9

    .line 404
    check-cast v1, LPf/a;

    .line 405
    .line 406
    iget-wide v5, v1, LPf/a;->c:J

    .line 407
    .line 408
    invoke-virtual {v0, v5, v6}, Lio/ktor/utils/io/q;->b(J)V

    .line 409
    .line 410
    .line 411
    iget-wide v5, v0, Lio/ktor/utils/io/q;->h:J

    .line 412
    .line 413
    invoke-interface {v4}, Lio/ktor/utils/io/J;->c()LPf/a;

    .line 414
    .line 415
    .line 416
    move-result-object v7

    .line 417
    invoke-virtual {v1, v7}, LPf/a;->i(LPf/a;)J

    .line 418
    .line 419
    .line 420
    move-result-wide v7

    .line 421
    add-long/2addr v7, v5

    .line 422
    iput-wide v7, v0, Lio/ktor/utils/io/q;->h:J

    .line 423
    .line 424
    const/4 v1, 0x2

    .line 425
    iput v1, v2, Lio/ktor/utils/io/n;->c:I

    .line 426
    .line 427
    invoke-static {v4, v2}, Lio/ktor/utils/io/N;->h(Lio/ktor/utils/io/J;Llf/c;)Ljava/lang/Object;

    .line 428
    .line 429
    .line 430
    move-result-object v4

    .line 431
    if-ne v4, v3, :cond_18

    .line 432
    .line 433
    goto :goto_d

    .line 434
    :cond_18
    :goto_c
    move v8, v1

    .line 435
    move-object v5, v15

    .line 436
    const/4 v6, 0x1

    .line 437
    const/4 v7, 0x3

    .line 438
    goto/16 :goto_1

    .line 439
    .line 440
    :cond_19
    invoke-virtual {v0, v12, v13}, Lio/ktor/utils/io/q;->b(J)V

    .line 441
    .line 442
    .line 443
    iget-wide v5, v0, Lio/ktor/utils/io/q;->h:J

    .line 444
    .line 445
    invoke-interface {v4}, Lio/ktor/utils/io/J;->c()LPf/a;

    .line 446
    .line 447
    .line 448
    move-result-object v1

    .line 449
    const-string v7, "null cannot be cast to non-null type kotlinx.io.Buffer"

    .line 450
    .line 451
    invoke-static {v1, v7}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 452
    .line 453
    .line 454
    invoke-interface {v9, v1, v12, v13}, LPf/d;->j(LPf/a;J)J

    .line 455
    .line 456
    .line 457
    move-result-wide v7

    .line 458
    add-long/2addr v7, v5

    .line 459
    iput-wide v7, v0, Lio/ktor/utils/io/q;->h:J

    .line 460
    .line 461
    const/4 v1, 0x3

    .line 462
    iput v1, v2, Lio/ktor/utils/io/n;->c:I

    .line 463
    .line 464
    invoke-static {v4, v2}, Lio/ktor/utils/io/N;->h(Lio/ktor/utils/io/J;Llf/c;)Ljava/lang/Object;

    .line 465
    .line 466
    .line 467
    move-result-object v1

    .line 468
    if-ne v1, v3, :cond_1a

    .line 469
    .line 470
    :goto_d
    return-object v3

    .line 471
    :cond_1a
    :goto_e
    return-object v15
.end method

.method public final b(J)V
    .locals 4

    .line 1
    iget-wide v0, p0, Lio/ktor/utils/io/q;->h:J

    .line 2
    .line 3
    add-long/2addr v0, p1

    .line 4
    iget-wide p1, p0, Lio/ktor/utils/io/q;->d:J

    .line 5
    .line 6
    cmp-long v0, v0, p1

    .line 7
    .line 8
    if-gtz v0, :cond_0

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    new-instance v0, Ljava/io/IOException;

    .line 12
    .line 13
    const-string v1, "Limit of "

    .line 14
    .line 15
    const-string v2, " bytes exceeded while searching for \""

    .line 16
    .line 17
    invoke-static {p1, p2, v1, v2}, LVa/M6;->u(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const-string p2, "<this>"

    .line 22
    .line 23
    iget-object v1, p0, Lio/ktor/utils/io/q;->b:LQf/a;

    .line 24
    .line 25
    invoke-static {v1, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    iget-object p2, v1, LQf/a;->a:[B

    .line 29
    .line 30
    invoke-static {p2}, LBf/r;->a0([B)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    const-string v1, "\n"

    .line 35
    .line 36
    const-string v2, "\\n"

    .line 37
    .line 38
    const/4 v3, 0x0

    .line 39
    invoke-static {p2, v1, v2, v3}, LBf/r;->h0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const/16 p2, 0x22

    .line 47
    .line 48
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw v0
.end method

.method public final c(Llf/c;)Ljava/lang/Object;
    .locals 14

    .line 1
    instance-of v0, p1, Lio/ktor/utils/io/o;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lio/ktor/utils/io/o;

    .line 7
    .line 8
    iget v1, v0, Lio/ktor/utils/io/o;->c:I

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
    iput v1, v0, Lio/ktor/utils/io/o;->c:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lio/ktor/utils/io/o;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lio/ktor/utils/io/o;-><init>(Lio/ktor/utils/io/q;Llf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lio/ktor/utils/io/o;->a:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 28
    .line 29
    iget v2, v0, Lio/ktor/utils/io/o;->c:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    iget-object v4, p0, Lio/ktor/utils/io/q;->e:LPf/i;

    .line 33
    .line 34
    const/4 v5, 0x2

    .line 35
    if-eqz v2, :cond_3

    .line 36
    .line 37
    if-eq v2, v3, :cond_2

    .line 38
    .line 39
    if-ne v2, v5, :cond_1

    .line 40
    .line 41
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto/16 :goto_7

    .line 45
    .line 46
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 47
    .line 48
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p1

    .line 54
    :cond_2
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_3
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    :goto_1
    invoke-interface {v4}, LPf/i;->exhausted()Z

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    if-eqz p1, :cond_6

    .line 66
    .line 67
    iput v3, v0, Lio/ktor/utils/io/o;->c:I

    .line 68
    .line 69
    iget-object p1, p0, Lio/ktor/utils/io/q;->a:Lio/ktor/utils/io/t;

    .line 70
    .line 71
    invoke-interface {p1, v3, v0}, Lio/ktor/utils/io/t;->g(ILlf/c;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    if-ne p1, v1, :cond_4

    .line 76
    .line 77
    goto/16 :goto_6

    .line 78
    .line 79
    :cond_4
    :goto_2
    check-cast p1, Ljava/lang/Boolean;

    .line 80
    .line 81
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    if-eqz p1, :cond_5

    .line 86
    .line 87
    goto :goto_3

    .line 88
    :cond_5
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 89
    .line 90
    return-object p1

    .line 91
    :cond_6
    :goto_3
    invoke-interface {v4}, LPf/i;->readByte()B

    .line 92
    .line 93
    .line 94
    move-result p1

    .line 95
    iget v2, p0, Lio/ktor/utils/io/q;->i:I

    .line 96
    .line 97
    iget-object v6, p0, Lio/ktor/utils/io/q;->g:LPf/a;

    .line 98
    .line 99
    iget-object v7, p0, Lio/ktor/utils/io/q;->b:LQf/a;

    .line 100
    .line 101
    if-lez v2, :cond_a

    .line 102
    .line 103
    invoke-virtual {v7, v2}, LQf/a;->a(I)B

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    if-eq p1, v2, :cond_a

    .line 108
    .line 109
    iget v2, p0, Lio/ktor/utils/io/q;->i:I

    .line 110
    .line 111
    :goto_4
    iget v8, p0, Lio/ktor/utils/io/q;->i:I

    .line 112
    .line 113
    if-lez v8, :cond_7

    .line 114
    .line 115
    invoke-virtual {v7, v8}, LQf/a;->a(I)B

    .line 116
    .line 117
    .line 118
    move-result v8

    .line 119
    if-eq p1, v8, :cond_7

    .line 120
    .line 121
    iget v8, p0, Lio/ktor/utils/io/q;->i:I

    .line 122
    .line 123
    sub-int/2addr v8, v3

    .line 124
    iget-object v9, p0, Lio/ktor/utils/io/q;->f:[I

    .line 125
    .line 126
    aget v8, v9, v8

    .line 127
    .line 128
    iput v8, p0, Lio/ktor/utils/io/q;->i:I

    .line 129
    .line 130
    goto :goto_4

    .line 131
    :cond_7
    iget v8, p0, Lio/ktor/utils/io/q;->i:I

    .line 132
    .line 133
    sub-int/2addr v2, v8

    .line 134
    int-to-long v8, v2

    .line 135
    invoke-virtual {p0, v8, v9}, Lio/ktor/utils/io/q;->b(J)V

    .line 136
    .line 137
    .line 138
    iget-wide v10, p0, Lio/ktor/utils/io/q;->h:J

    .line 139
    .line 140
    iget-object v2, p0, Lio/ktor/utils/io/q;->c:Lio/ktor/utils/io/J;

    .line 141
    .line 142
    invoke-interface {v2}, Lio/ktor/utils/io/J;->c()LPf/a;

    .line 143
    .line 144
    .line 145
    move-result-object v12

    .line 146
    const-string v13, "null cannot be cast to non-null type kotlinx.io.Buffer"

    .line 147
    .line 148
    invoke-static {v12, v13}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v6, v12, v8, v9}, LPf/a;->j(LPf/a;J)J

    .line 152
    .line 153
    .line 154
    move-result-wide v8

    .line 155
    add-long/2addr v8, v10

    .line 156
    iput-wide v8, p0, Lio/ktor/utils/io/q;->h:J

    .line 157
    .line 158
    iget v8, p0, Lio/ktor/utils/io/q;->i:I

    .line 159
    .line 160
    if-nez v8, :cond_a

    .line 161
    .line 162
    invoke-virtual {v7, v8}, LQf/a;->a(I)B

    .line 163
    .line 164
    .line 165
    move-result v8

    .line 166
    if-eq p1, v8, :cond_a

    .line 167
    .line 168
    int-to-byte p1, p1

    .line 169
    iput v5, v0, Lio/ktor/utils/io/o;->c:I

    .line 170
    .line 171
    invoke-interface {v2}, Lio/ktor/utils/io/J;->c()LPf/a;

    .line 172
    .line 173
    .line 174
    move-result-object v3

    .line 175
    invoke-virtual {v3, p1}, LPf/a;->z(B)V

    .line 176
    .line 177
    .line 178
    invoke-static {v2, v0}, Lio/ktor/utils/io/N;->h(Lio/ktor/utils/io/J;Llf/c;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    sget-object v0, Lkf/a;->a:Lkf/a;

    .line 183
    .line 184
    if-ne p1, v0, :cond_8

    .line 185
    .line 186
    goto :goto_5

    .line 187
    :cond_8
    sget-object p1, Lef/C;->a:Lef/C;

    .line 188
    .line 189
    :goto_5
    if-ne p1, v1, :cond_9

    .line 190
    .line 191
    :goto_6
    return-object v1

    .line 192
    :cond_9
    :goto_7
    iget-wide v0, p0, Lio/ktor/utils/io/q;->h:J

    .line 193
    .line 194
    const-wide/16 v2, 0x1

    .line 195
    .line 196
    add-long/2addr v0, v2

    .line 197
    iput-wide v0, p0, Lio/ktor/utils/io/q;->h:J

    .line 198
    .line 199
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 200
    .line 201
    return-object p1

    .line 202
    :cond_a
    iget v2, p0, Lio/ktor/utils/io/q;->i:I

    .line 203
    .line 204
    add-int/2addr v2, v3

    .line 205
    iput v2, p0, Lio/ktor/utils/io/q;->i:I

    .line 206
    .line 207
    iget-object v7, v7, LQf/a;->a:[B

    .line 208
    .line 209
    array-length v7, v7

    .line 210
    if-ne v2, v7, :cond_b

    .line 211
    .line 212
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 213
    .line 214
    return-object p1

    .line 215
    :cond_b
    int-to-byte p1, p1

    .line 216
    invoke-virtual {v6, p1}, LPf/a;->z(B)V

    .line 217
    .line 218
    .line 219
    goto/16 :goto_1
.end method

.method public final d(ZLlf/c;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p2, Lio/ktor/utils/io/p;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lio/ktor/utils/io/p;

    .line 7
    .line 8
    iget v1, v0, Lio/ktor/utils/io/p;->d:I

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
    iput v1, v0, Lio/ktor/utils/io/p;->d:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lio/ktor/utils/io/p;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lio/ktor/utils/io/p;-><init>(Lio/ktor/utils/io/q;Llf/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lio/ktor/utils/io/p;->b:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 28
    .line 29
    iget v2, v0, Lio/ktor/utils/io/p;->d:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    const/4 v4, 0x4

    .line 33
    const/4 v5, 0x3

    .line 34
    const/4 v6, 0x2

    .line 35
    if-eqz v2, :cond_5

    .line 36
    .line 37
    if-eq v2, v3, :cond_4

    .line 38
    .line 39
    if-eq v2, v6, :cond_3

    .line 40
    .line 41
    if-eq v2, v5, :cond_2

    .line 42
    .line 43
    if-ne v2, v4, :cond_1

    .line 44
    .line 45
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 50
    .line 51
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 52
    .line 53
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw p1

    .line 57
    :cond_2
    iget-boolean p1, v0, Lio/ktor/utils/io/p;->a:Z

    .line 58
    .line 59
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    goto/16 :goto_6

    .line 63
    .line 64
    :cond_3
    iget-boolean p1, v0, Lio/ktor/utils/io/p;->a:Z

    .line 65
    .line 66
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    goto/16 :goto_4

    .line 70
    .line 71
    :cond_4
    iget-boolean p1, v0, Lio/ktor/utils/io/p;->a:Z

    .line 72
    .line 73
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_5
    invoke-static {p2}, LFe/e;->U(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    const-wide/16 v7, 0x0

    .line 81
    .line 82
    iput-wide v7, p0, Lio/ktor/utils/io/q;->h:J

    .line 83
    .line 84
    :cond_6
    iget-object p2, p0, Lio/ktor/utils/io/q;->e:LPf/i;

    .line 85
    .line 86
    invoke-interface {p2}, LPf/i;->exhausted()Z

    .line 87
    .line 88
    .line 89
    move-result p2

    .line 90
    if-eqz p2, :cond_b

    .line 91
    .line 92
    iput-boolean p1, v0, Lio/ktor/utils/io/p;->a:Z

    .line 93
    .line 94
    iput v3, v0, Lio/ktor/utils/io/p;->d:I

    .line 95
    .line 96
    iget-object p2, p0, Lio/ktor/utils/io/q;->a:Lio/ktor/utils/io/t;

    .line 97
    .line 98
    invoke-interface {p2, v3, v0}, Lio/ktor/utils/io/t;->g(ILlf/c;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p2

    .line 102
    if-ne p2, v1, :cond_7

    .line 103
    .line 104
    goto :goto_5

    .line 105
    :cond_7
    :goto_1
    check-cast p2, Ljava/lang/Boolean;

    .line 106
    .line 107
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 108
    .line 109
    .line 110
    move-result p2

    .line 111
    if-eqz p2, :cond_8

    .line 112
    .line 113
    goto :goto_3

    .line 114
    :cond_8
    if-eqz p1, :cond_a

    .line 115
    .line 116
    iget-wide p1, p0, Lio/ktor/utils/io/q;->h:J

    .line 117
    .line 118
    iget-object v2, p0, Lio/ktor/utils/io/q;->c:Lio/ktor/utils/io/J;

    .line 119
    .line 120
    invoke-interface {v2}, Lio/ktor/utils/io/J;->c()LPf/a;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    iget-object v5, p0, Lio/ktor/utils/io/q;->g:LPf/a;

    .line 125
    .line 126
    invoke-virtual {v5, v3}, LPf/a;->i(LPf/a;)J

    .line 127
    .line 128
    .line 129
    move-result-wide v5

    .line 130
    add-long/2addr v5, p1

    .line 131
    iput-wide v5, p0, Lio/ktor/utils/io/q;->h:J

    .line 132
    .line 133
    iput v4, v0, Lio/ktor/utils/io/p;->d:I

    .line 134
    .line 135
    invoke-interface {v2, v0}, Lio/ktor/utils/io/J;->e(Llf/c;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    if-ne p1, v1, :cond_9

    .line 140
    .line 141
    goto :goto_5

    .line 142
    :cond_9
    :goto_2
    iget-wide p1, p0, Lio/ktor/utils/io/q;->h:J

    .line 143
    .line 144
    new-instance v0, Ljava/lang/Long;

    .line 145
    .line 146
    invoke-direct {v0, p1, p2}, Ljava/lang/Long;-><init>(J)V

    .line 147
    .line 148
    .line 149
    return-object v0

    .line 150
    :cond_a
    new-instance p1, Ljava/io/IOException;

    .line 151
    .line 152
    new-instance p2, Ljava/lang/StringBuilder;

    .line 153
    .line 154
    const-string v0, "Expected \""

    .line 155
    .line 156
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    const-string v0, "<this>"

    .line 160
    .line 161
    iget-object v1, p0, Lio/ktor/utils/io/q;->b:LQf/a;

    .line 162
    .line 163
    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    iget-object v0, v1, LQf/a;->a:[B

    .line 167
    .line 168
    invoke-static {v0}, LBf/r;->a0([B)Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    const-string v1, "\n"

    .line 173
    .line 174
    const-string v2, "\\n"

    .line 175
    .line 176
    const/4 v3, 0x0

    .line 177
    invoke-static {v0, v1, v2, v3}, LBf/r;->h0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    const-string v0, "\" but encountered end of input"

    .line 185
    .line 186
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object p2

    .line 193
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    throw p1

    .line 197
    :cond_b
    :goto_3
    iput-boolean p1, v0, Lio/ktor/utils/io/p;->a:Z

    .line 198
    .line 199
    iput v6, v0, Lio/ktor/utils/io/p;->d:I

    .line 200
    .line 201
    invoke-virtual {p0, v0}, Lio/ktor/utils/io/q;->a(Llf/c;)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object p2

    .line 205
    if-ne p2, v1, :cond_c

    .line 206
    .line 207
    goto :goto_5

    .line 208
    :cond_c
    :goto_4
    iput-boolean p1, v0, Lio/ktor/utils/io/p;->a:Z

    .line 209
    .line 210
    iput v5, v0, Lio/ktor/utils/io/p;->d:I

    .line 211
    .line 212
    invoke-virtual {p0, v0}, Lio/ktor/utils/io/q;->c(Llf/c;)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object p2

    .line 216
    if-ne p2, v1, :cond_d

    .line 217
    .line 218
    :goto_5
    return-object v1

    .line 219
    :cond_d
    :goto_6
    check-cast p2, Ljava/lang/Boolean;

    .line 220
    .line 221
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 222
    .line 223
    .line 224
    move-result p2

    .line 225
    if-eqz p2, :cond_6

    .line 226
    .line 227
    iget-wide p1, p0, Lio/ktor/utils/io/q;->h:J

    .line 228
    .line 229
    new-instance v0, Ljava/lang/Long;

    .line 230
    .line 231
    invoke-direct {v0, p1, p2}, Ljava/lang/Long;-><init>(J)V

    .line 232
    .line 233
    .line 234
    return-object v0
.end method
