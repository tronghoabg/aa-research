.class public final Lf6/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf6/y;


# instance fields
.field public final a:LC8/i;

.field public final b:Lt6/k;

.field public final c:J

.field public final d:J

.field public final e:J

.field public final f:F

.field public final g:F


# direct methods
.method public constructor <init>(Lt6/k;LJ5/i;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lf6/m;->b:Lt6/k;

    .line 5
    .line 6
    new-instance v0, LC8/i;

    .line 7
    .line 8
    invoke-direct {v0, p2}, LC8/i;-><init>(LJ5/i;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lf6/m;->a:LC8/i;

    .line 12
    .line 13
    iget-object p2, v0, LC8/i;->f:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p2, Lt6/k;

    .line 16
    .line 17
    if-eq p1, p2, :cond_0

    .line 18
    .line 19
    iput-object p1, v0, LC8/i;->f:Ljava/lang/Object;

    .line 20
    .line 21
    iget-object p1, v0, LC8/i;->c:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast p1, Ljava/util/HashMap;

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/util/HashMap;->clear()V

    .line 26
    .line 27
    .line 28
    iget-object p1, v0, LC8/i;->e:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p1, Ljava/util/HashMap;

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/util/HashMap;->clear()V

    .line 33
    .line 34
    .line 35
    :cond_0
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    iput-wide p1, p0, Lf6/m;->c:J

    .line 41
    .line 42
    iput-wide p1, p0, Lf6/m;->d:J

    .line 43
    .line 44
    iput-wide p1, p0, Lf6/m;->e:J

    .line 45
    .line 46
    const p1, -0x800001

    .line 47
    .line 48
    .line 49
    iput p1, p0, Lf6/m;->f:F

    .line 50
    .line 51
    iput p1, p0, Lf6/m;->g:F

    .line 52
    .line 53
    return-void
.end method

.method public static b(Ljava/lang/Class;Lt6/k;)Lf6/y;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    :try_start_0
    new-array v2, v1, [Ljava/lang/Class;

    .line 4
    .line 5
    const-class v3, Lt6/k;

    .line 6
    .line 7
    aput-object v3, v2, v0

    .line 8
    .line 9
    invoke-virtual {p0, v2}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    new-array v1, v1, [Ljava/lang/Object;

    .line 14
    .line 15
    aput-object p1, v1, v0

    .line 16
    .line 17
    invoke-virtual {p0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    check-cast p0, Lf6/y;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 22
    .line 23
    return-object p0

    .line 24
    :catch_0
    move-exception p0

    .line 25
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 26
    .line 27
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    .line 28
    .line 29
    .line 30
    throw p1
.end method


# virtual methods
.method public final a(LE5/d0;)Lf6/a;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x1

    .line 8
    const/4 v5, 0x0

    .line 9
    iget-object v6, v1, LE5/d0;->b:LE5/a0;

    .line 10
    .line 11
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-object v6, v1, LE5/d0;->b:LE5/a0;

    .line 15
    .line 16
    iget-object v7, v6, LE5/a0;->a:Landroid/net/Uri;

    .line 17
    .line 18
    invoke-virtual {v7}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v7

    .line 22
    if-eqz v7, :cond_1

    .line 23
    .line 24
    const-string v8, "ssai"

    .line 25
    .line 26
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v7

    .line 30
    if-nez v7, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    throw v3

    .line 34
    :cond_1
    :goto_0
    iget-object v7, v6, LE5/a0;->a:Landroid/net/Uri;

    .line 35
    .line 36
    invoke-static {v7}, Lu6/v;->u(Landroid/net/Uri;)I

    .line 37
    .line 38
    .line 39
    move-result v7

    .line 40
    iget-object v8, v0, Lf6/m;->a:LC8/i;

    .line 41
    .line 42
    iget-object v9, v8, LC8/i;->e:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v9, Ljava/util/HashMap;

    .line 45
    .line 46
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 47
    .line 48
    .line 49
    move-result-object v10

    .line 50
    invoke-virtual {v9, v10}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v10

    .line 54
    check-cast v10, Lf6/y;

    .line 55
    .line 56
    if-eqz v10, :cond_2

    .line 57
    .line 58
    goto/16 :goto_5

    .line 59
    .line 60
    :cond_2
    iget-object v10, v8, LC8/i;->c:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v10, Ljava/util/HashMap;

    .line 63
    .line 64
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 65
    .line 66
    .line 67
    move-result-object v11

    .line 68
    invoke-virtual {v10, v11}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v11

    .line 72
    if-eqz v11, :cond_3

    .line 73
    .line 74
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    invoke-virtual {v10, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    check-cast v2, Lk8/p;

    .line 83
    .line 84
    goto/16 :goto_4

    .line 85
    .line 86
    :cond_3
    iget-object v11, v8, LC8/i;->f:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v11, Lt6/k;

    .line 89
    .line 90
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    const-class v12, Lf6/y;

    .line 94
    .line 95
    if-eqz v7, :cond_8

    .line 96
    .line 97
    if-eq v7, v4, :cond_7

    .line 98
    .line 99
    if-eq v7, v2, :cond_6

    .line 100
    .line 101
    const/4 v2, 0x3

    .line 102
    if-eq v7, v2, :cond_5

    .line 103
    .line 104
    const/4 v2, 0x4

    .line 105
    if-eq v7, v2, :cond_4

    .line 106
    .line 107
    goto :goto_2

    .line 108
    :cond_4
    :try_start_0
    new-instance v2, Lf6/l;

    .line 109
    .line 110
    invoke-direct {v2, v5, v8, v11}, Lf6/l;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    goto :goto_3

    .line 114
    :cond_5
    const-string v2, "com.google.android.exoplayer2.source.rtsp.RtspMediaSource$Factory"

    .line 115
    .line 116
    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    invoke-virtual {v2, v12}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    new-instance v11, Lf6/k;

    .line 125
    .line 126
    invoke-direct {v11, v5, v2}, Lf6/k;-><init>(ILjava/lang/Class;)V

    .line 127
    .line 128
    .line 129
    move-object v2, v11

    .line 130
    goto :goto_3

    .line 131
    :cond_6
    const-string v13, "com.google.android.exoplayer2.source.hls.HlsMediaSource$Factory"

    .line 132
    .line 133
    invoke-static {v13}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    move-result-object v13

    .line 137
    invoke-virtual {v13, v12}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    move-result-object v12

    .line 141
    new-instance v13, Lf6/j;

    .line 142
    .line 143
    invoke-direct {v13, v12, v11, v2}, Lf6/j;-><init>(Ljava/lang/Class;Lt6/k;I)V

    .line 144
    .line 145
    .line 146
    move-object v2, v13

    .line 147
    goto :goto_3

    .line 148
    :cond_7
    const-string v2, "com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource$Factory"

    .line 149
    .line 150
    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    invoke-virtual {v2, v12}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    new-instance v12, Lf6/j;

    .line 159
    .line 160
    invoke-direct {v12, v2, v11, v4}, Lf6/j;-><init>(Ljava/lang/Class;Lt6/k;I)V

    .line 161
    .line 162
    .line 163
    :goto_1
    move-object v2, v12

    .line 164
    goto :goto_3

    .line 165
    :cond_8
    const-string v2, "com.google.android.exoplayer2.source.dash.DashMediaSource$Factory"

    .line 166
    .line 167
    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    invoke-virtual {v2, v12}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    move-result-object v2

    .line 175
    new-instance v12, Lf6/j;

    .line 176
    .line 177
    invoke-direct {v12, v2, v11, v5}, Lf6/j;-><init>(Ljava/lang/Class;Lt6/k;I)V
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 178
    .line 179
    .line 180
    goto :goto_1

    .line 181
    :catch_0
    :goto_2
    move-object v2, v3

    .line 182
    :goto_3
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 183
    .line 184
    .line 185
    move-result-object v11

    .line 186
    invoke-virtual {v10, v11, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    if-eqz v2, :cond_9

    .line 190
    .line 191
    iget-object v8, v8, LC8/i;->d:Ljava/lang/Object;

    .line 192
    .line 193
    check-cast v8, Ljava/util/HashSet;

    .line 194
    .line 195
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 196
    .line 197
    .line 198
    move-result-object v10

    .line 199
    invoke-virtual {v8, v10}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    :cond_9
    :goto_4
    if-nez v2, :cond_a

    .line 203
    .line 204
    move-object v10, v3

    .line 205
    goto :goto_5

    .line 206
    :cond_a
    invoke-interface {v2}, Lk8/p;->get()Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v2

    .line 210
    move-object v10, v2

    .line 211
    check-cast v10, Lf6/y;

    .line 212
    .line 213
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 214
    .line 215
    .line 216
    move-result-object v2

    .line 217
    invoke-virtual {v9, v2, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    :goto_5
    new-instance v2, Ljava/lang/StringBuilder;

    .line 221
    .line 222
    const-string v8, "No suitable media source factory found for content type: "

    .line 223
    .line 224
    invoke-direct {v2, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 228
    .line 229
    .line 230
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v2

    .line 234
    invoke-static {v10, v2}, Lu6/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    iget-object v2, v1, LE5/d0;->c:LE5/Z;

    .line 238
    .line 239
    invoke-virtual {v2}, LE5/Z;->a()LE5/Y;

    .line 240
    .line 241
    .line 242
    move-result-object v7

    .line 243
    iget-wide v8, v2, LE5/Z;->a:J

    .line 244
    .line 245
    const-wide v11, -0x7fffffffffffffffL    # -4.9E-324

    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    cmp-long v8, v8, v11

    .line 251
    .line 252
    if-nez v8, :cond_b

    .line 253
    .line 254
    iget-wide v8, v0, Lf6/m;->c:J

    .line 255
    .line 256
    iput-wide v8, v7, LE5/Y;->a:J

    .line 257
    .line 258
    :cond_b
    iget v8, v2, LE5/Z;->d:F

    .line 259
    .line 260
    const v9, -0x800001

    .line 261
    .line 262
    .line 263
    cmpl-float v8, v8, v9

    .line 264
    .line 265
    if-nez v8, :cond_c

    .line 266
    .line 267
    iget v8, v0, Lf6/m;->f:F

    .line 268
    .line 269
    iput v8, v7, LE5/Y;->d:F

    .line 270
    .line 271
    :cond_c
    iget v8, v2, LE5/Z;->e:F

    .line 272
    .line 273
    cmpl-float v8, v8, v9

    .line 274
    .line 275
    if-nez v8, :cond_d

    .line 276
    .line 277
    iget v8, v0, Lf6/m;->g:F

    .line 278
    .line 279
    iput v8, v7, LE5/Y;->e:F

    .line 280
    .line 281
    :cond_d
    iget-wide v8, v2, LE5/Z;->b:J

    .line 282
    .line 283
    cmp-long v8, v8, v11

    .line 284
    .line 285
    if-nez v8, :cond_e

    .line 286
    .line 287
    iget-wide v8, v0, Lf6/m;->d:J

    .line 288
    .line 289
    iput-wide v8, v7, LE5/Y;->b:J

    .line 290
    .line 291
    :cond_e
    iget-wide v8, v2, LE5/Z;->c:J

    .line 292
    .line 293
    cmp-long v8, v8, v11

    .line 294
    .line 295
    if-nez v8, :cond_f

    .line 296
    .line 297
    iget-wide v8, v0, Lf6/m;->e:J

    .line 298
    .line 299
    iput-wide v8, v7, LE5/Y;->c:J

    .line 300
    .line 301
    :cond_f
    invoke-virtual {v7}, LE5/Y;->a()LE5/Z;

    .line 302
    .line 303
    .line 304
    move-result-object v7

    .line 305
    invoke-virtual {v7, v2}, LE5/Z;->equals(Ljava/lang/Object;)Z

    .line 306
    .line 307
    .line 308
    move-result v8

    .line 309
    if-nez v8, :cond_13

    .line 310
    .line 311
    sget-object v8, Ll8/K;->b:Ll8/I;

    .line 312
    .line 313
    sget-object v8, Ll8/e0;->e:Ll8/e0;

    .line 314
    .line 315
    sget-object v8, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 316
    .line 317
    sget-object v8, Ll8/e0;->e:Ll8/e0;

    .line 318
    .line 319
    sget-object v8, LE5/b0;->c:LE5/b0;

    .line 320
    .line 321
    new-instance v8, LE5/V;

    .line 322
    .line 323
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 324
    .line 325
    .line 326
    iget-object v9, v1, LE5/d0;->e:LE5/X;

    .line 327
    .line 328
    iget-wide v11, v9, LE5/W;->a:J

    .line 329
    .line 330
    iput-wide v11, v8, LE5/V;->a:J

    .line 331
    .line 332
    iget-wide v11, v9, LE5/W;->b:J

    .line 333
    .line 334
    iput-wide v11, v8, LE5/V;->b:J

    .line 335
    .line 336
    iget-boolean v11, v9, LE5/W;->c:Z

    .line 337
    .line 338
    iput-boolean v11, v8, LE5/V;->c:Z

    .line 339
    .line 340
    iget-boolean v11, v9, LE5/W;->d:Z

    .line 341
    .line 342
    iput-boolean v11, v8, LE5/V;->d:Z

    .line 343
    .line 344
    iget-boolean v9, v9, LE5/W;->e:Z

    .line 345
    .line 346
    iput-boolean v9, v8, LE5/V;->e:Z

    .line 347
    .line 348
    invoke-virtual {v2}, LE5/Z;->a()LE5/Y;

    .line 349
    .line 350
    .line 351
    sget-object v2, Ll8/K;->b:Ll8/I;

    .line 352
    .line 353
    sget-object v2, Ll8/e0;->e:Ll8/e0;

    .line 354
    .line 355
    iget-object v2, v6, LE5/a0;->a:Landroid/net/Uri;

    .line 356
    .line 357
    iget-object v9, v6, LE5/a0;->b:Ljava/util/List;

    .line 358
    .line 359
    iget-object v6, v6, LE5/a0;->c:Ll8/K;

    .line 360
    .line 361
    invoke-virtual {v7}, LE5/Z;->a()LE5/Y;

    .line 362
    .line 363
    .line 364
    move-result-object v7

    .line 365
    if-eqz v2, :cond_10

    .line 366
    .line 367
    new-instance v11, LE5/a0;

    .line 368
    .line 369
    invoke-direct {v11, v2, v3, v9, v6}, LE5/a0;-><init>(Landroid/net/Uri;Lxg/g;Ljava/util/List;Ll8/K;)V

    .line 370
    .line 371
    .line 372
    move-object v15, v11

    .line 373
    goto :goto_6

    .line 374
    :cond_10
    move-object v15, v3

    .line 375
    :goto_6
    new-instance v12, LE5/d0;

    .line 376
    .line 377
    iget-object v2, v1, LE5/d0;->a:Ljava/lang/String;

    .line 378
    .line 379
    if-eqz v2, :cond_11

    .line 380
    .line 381
    :goto_7
    move-object v13, v2

    .line 382
    goto :goto_8

    .line 383
    :cond_11
    const-string v2, ""

    .line 384
    .line 385
    goto :goto_7

    .line 386
    :goto_8
    new-instance v14, LE5/X;

    .line 387
    .line 388
    invoke-direct {v14, v8}, LE5/W;-><init>(LE5/V;)V

    .line 389
    .line 390
    .line 391
    invoke-virtual {v7}, LE5/Y;->a()LE5/Z;

    .line 392
    .line 393
    .line 394
    move-result-object v16

    .line 395
    iget-object v2, v1, LE5/d0;->d:LE5/f0;

    .line 396
    .line 397
    if-eqz v2, :cond_12

    .line 398
    .line 399
    :goto_9
    move-object/from16 v17, v2

    .line 400
    .line 401
    goto :goto_a

    .line 402
    :cond_12
    sget-object v2, LE5/f0;->G:LE5/f0;

    .line 403
    .line 404
    goto :goto_9

    .line 405
    :goto_a
    iget-object v1, v1, LE5/d0;->f:LE5/b0;

    .line 406
    .line 407
    move-object/from16 v18, v1

    .line 408
    .line 409
    invoke-direct/range {v12 .. v18}, LE5/d0;-><init>(Ljava/lang/String;LE5/X;LE5/a0;LE5/Z;LE5/f0;LE5/b0;)V

    .line 410
    .line 411
    .line 412
    move-object v1, v12

    .line 413
    :cond_13
    invoke-interface {v10, v1}, Lf6/y;->a(LE5/d0;)Lf6/a;

    .line 414
    .line 415
    .line 416
    move-result-object v2

    .line 417
    iget-object v6, v1, LE5/d0;->b:LE5/a0;

    .line 418
    .line 419
    iget-object v6, v6, LE5/a0;->c:Ll8/K;

    .line 420
    .line 421
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    .line 422
    .line 423
    .line 424
    move-result v7

    .line 425
    if-nez v7, :cond_14

    .line 426
    .line 427
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 428
    .line 429
    .line 430
    move-result v7

    .line 431
    add-int/2addr v7, v4

    .line 432
    new-array v7, v7, [Lf6/a;

    .line 433
    .line 434
    aput-object v2, v7, v5

    .line 435
    .line 436
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 437
    .line 438
    .line 439
    move-result v2

    .line 440
    if-gtz v2, :cond_15

    .line 441
    .line 442
    new-instance v2, Lf6/I;

    .line 443
    .line 444
    invoke-direct {v2, v7}, Lf6/I;-><init>([Lf6/a;)V

    .line 445
    .line 446
    .line 447
    :cond_14
    move-object v5, v2

    .line 448
    goto :goto_b

    .line 449
    :cond_15
    iget-object v1, v0, Lf6/m;->b:Lt6/k;

    .line 450
    .line 451
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 452
    .line 453
    .line 454
    invoke-interface {v6, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 455
    .line 456
    .line 457
    move-result-object v1

    .line 458
    check-cast v1, LE5/c0;

    .line 459
    .line 460
    new-instance v2, Ljava/util/ArrayList;

    .line 461
    .line 462
    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 463
    .line 464
    .line 465
    new-instance v2, Ljava/util/HashSet;

    .line 466
    .line 467
    invoke-direct {v2, v4}, Ljava/util/HashSet;-><init>(I)V

    .line 468
    .line 469
    .line 470
    new-instance v2, LI5/f;

    .line 471
    .line 472
    invoke-direct {v2, v4}, LI5/f;-><init>(I)V

    .line 473
    .line 474
    .line 475
    new-instance v2, LI5/f;

    .line 476
    .line 477
    invoke-direct {v2, v5}, LI5/f;-><init>(I)V

    .line 478
    .line 479
    .line 480
    sget-object v2, Ll8/K;->b:Ll8/I;

    .line 481
    .line 482
    sget-object v2, Ll8/e0;->e:Ll8/e0;

    .line 483
    .line 484
    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 485
    .line 486
    sget-object v2, Ll8/e0;->e:Ll8/e0;

    .line 487
    .line 488
    sget-object v2, LE5/b0;->c:LE5/b0;

    .line 489
    .line 490
    sget-object v2, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    .line 491
    .line 492
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 493
    .line 494
    .line 495
    throw v3

    .line 496
    :goto_b
    iget-object v1, v1, LE5/d0;->e:LE5/X;

    .line 497
    .line 498
    iget-wide v2, v1, LE5/W;->a:J

    .line 499
    .line 500
    const-wide/16 v6, 0x0

    .line 501
    .line 502
    cmp-long v6, v2, v6

    .line 503
    .line 504
    iget-wide v7, v1, LE5/W;->b:J

    .line 505
    .line 506
    if-nez v6, :cond_16

    .line 507
    .line 508
    const-wide/high16 v9, -0x8000000000000000L

    .line 509
    .line 510
    cmp-long v6, v7, v9

    .line 511
    .line 512
    if-nez v6, :cond_16

    .line 513
    .line 514
    iget-boolean v6, v1, LE5/W;->d:Z

    .line 515
    .line 516
    if-nez v6, :cond_16

    .line 517
    .line 518
    return-object v5

    .line 519
    :cond_16
    move v6, v4

    .line 520
    new-instance v4, Lf6/f;

    .line 521
    .line 522
    invoke-static {v2, v3}, Lu6/v;->y(J)J

    .line 523
    .line 524
    .line 525
    move-result-wide v2

    .line 526
    invoke-static {v7, v8}, Lu6/v;->y(J)J

    .line 527
    .line 528
    .line 529
    move-result-wide v8

    .line 530
    iget-boolean v7, v1, LE5/W;->e:Z

    .line 531
    .line 532
    xor-int/lit8 v10, v7, 0x1

    .line 533
    .line 534
    iget-boolean v11, v1, LE5/W;->c:Z

    .line 535
    .line 536
    iget-boolean v12, v1, LE5/W;->d:Z

    .line 537
    .line 538
    move-wide v6, v2

    .line 539
    invoke-direct/range {v4 .. v12}, Lf6/f;-><init>(Lf6/a;JJZZZ)V

    .line 540
    .line 541
    .line 542
    return-object v4
.end method
