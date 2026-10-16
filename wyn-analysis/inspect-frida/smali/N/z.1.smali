.class public final LN/z;
.super LX/z;
.source "SourceFile"

# interfaces
.implements LN/K0;


# instance fields
.field public final b:LA/T;

.field public c:LN/x;


# direct methods
.method public constructor <init>(LA/T;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LX/z;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LN/z;->b:LA/T;

    .line 5
    .line 6
    new-instance p1, LN/x;

    .line 7
    .line 8
    invoke-direct {p1}, LN/x;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, LN/z;->c:LN/x;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final c(LX/A;)V
    .locals 1

    .line 1
    const-string v0, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    check-cast p1, LN/x;

    .line 7
    .line 8
    iput-object p1, p0, LN/z;->c:LN/x;

    .line 9
    .line 10
    return-void
.end method

.method public final e()LX/A;
    .locals 1

    .line 1
    iget-object v0, p0, LN/z;->c:LN/x;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getValue()Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-static {}, LX/m;->k()LX/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LX/g;->f()Ltf/l;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-interface {v0, p0}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-static {}, LX/m;->k()LX/g;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v1, p0, LN/z;->c:LN/x;

    .line 19
    .line 20
    invoke-static {v1, v0}, LX/m;->j(LX/A;LX/g;)LX/A;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, LN/x;

    .line 25
    .line 26
    const/4 v2, 0x1

    .line 27
    iget-object v3, p0, LN/z;->b:LA/T;

    .line 28
    .line 29
    invoke-virtual {p0, v1, v0, v2, v3}, LN/z;->i(LN/x;LX/g;ZLA/T;)LN/x;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iget-object v0, v0, LN/x;->f:Ljava/lang/Object;

    .line 34
    .line 35
    return-object v0
.end method

.method public final i(LN/x;LX/g;ZLA/T;)LN/x;
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    invoke-virtual {v0, v1, v2}, LN/x;->c(LN/z;LX/g;)Z

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    if-eqz v3, :cond_b

    .line 12
    .line 13
    if-eqz p3, :cond_a

    .line 14
    .line 15
    invoke-static {}, LN/d;->z()LP/d;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    iget v5, v3, LP/d;->c:I

    .line 20
    .line 21
    if-lez v5, :cond_1

    .line 22
    .line 23
    iget-object v6, v3, LP/d;->a:[Ljava/lang/Object;

    .line 24
    .line 25
    const/4 v7, 0x0

    .line 26
    :cond_0
    aget-object v8, v6, v7

    .line 27
    .line 28
    check-cast v8, LN/n;

    .line 29
    .line 30
    invoke-virtual {v8}, LN/n;->b()V

    .line 31
    .line 32
    .line 33
    add-int/lit8 v7, v7, 0x1

    .line 34
    .line 35
    if-lt v7, v5, :cond_0

    .line 36
    .line 37
    :cond_1
    :try_start_0
    iget-object v5, v0, LN/x;->e:Lx/n;

    .line 38
    .line 39
    sget-object v6, LN/B0;->a:LDd/c;

    .line 40
    .line 41
    invoke-virtual {v6}, LDd/c;->E()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v7

    .line 45
    check-cast v7, LV/f;

    .line 46
    .line 47
    if-nez v7, :cond_2

    .line 48
    .line 49
    new-instance v7, LV/f;

    .line 50
    .line 51
    invoke-direct {v7}, LV/f;-><init>()V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v6, v7}, LDd/c;->Q(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :catchall_0
    move-exception v0

    .line 59
    goto/16 :goto_4

    .line 60
    .line 61
    :cond_2
    :goto_0
    iget v6, v7, LV/f;->a:I

    .line 62
    .line 63
    iget-object v8, v5, Lx/n;->b:[Ljava/lang/Object;

    .line 64
    .line 65
    iget-object v9, v5, Lx/n;->c:[I

    .line 66
    .line 67
    iget-object v5, v5, Lx/n;->a:[J

    .line 68
    .line 69
    array-length v10, v5

    .line 70
    add-int/lit8 v10, v10, -0x2

    .line 71
    .line 72
    if-ltz v10, :cond_7

    .line 73
    .line 74
    const/4 v11, 0x0

    .line 75
    :goto_1
    aget-wide v12, v5, v11

    .line 76
    .line 77
    not-long v14, v12

    .line 78
    const/16 v16, 0x7

    .line 79
    .line 80
    shl-long v14, v14, v16

    .line 81
    .line 82
    and-long/2addr v14, v12

    .line 83
    const-wide v16, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    and-long v14, v14, v16

    .line 89
    .line 90
    cmp-long v14, v14, v16

    .line 91
    .line 92
    if-eqz v14, :cond_6

    .line 93
    .line 94
    sub-int v14, v11, v10

    .line 95
    .line 96
    not-int v14, v14

    .line 97
    ushr-int/lit8 v14, v14, 0x1f

    .line 98
    .line 99
    const/16 v15, 0x8

    .line 100
    .line 101
    rsub-int/lit8 v14, v14, 0x8

    .line 102
    .line 103
    const/4 v4, 0x0

    .line 104
    :goto_2
    if-ge v4, v14, :cond_5

    .line 105
    .line 106
    const-wide/16 v17, 0xff

    .line 107
    .line 108
    and-long v17, v12, v17

    .line 109
    .line 110
    const-wide/16 v19, 0x80

    .line 111
    .line 112
    cmp-long v17, v17, v19

    .line 113
    .line 114
    if-gez v17, :cond_3

    .line 115
    .line 116
    shl-int/lit8 v17, v11, 0x3

    .line 117
    .line 118
    add-int v17, v17, v4

    .line 119
    .line 120
    aget-object v18, v8, v17

    .line 121
    .line 122
    aget v17, v9, v17

    .line 123
    .line 124
    move/from16 p3, v15

    .line 125
    .line 126
    move-object/from16 v15, v18

    .line 127
    .line 128
    check-cast v15, LX/y;

    .line 129
    .line 130
    add-int v0, v6, v17

    .line 131
    .line 132
    iput v0, v7, LV/f;->a:I

    .line 133
    .line 134
    invoke-virtual {v2}, LX/g;->f()Ltf/l;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    if-eqz v0, :cond_4

    .line 139
    .line 140
    invoke-interface {v0, v15}, Ltf/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    goto :goto_3

    .line 144
    :cond_3
    move/from16 p3, v15

    .line 145
    .line 146
    :cond_4
    :goto_3
    shr-long v12, v12, p3

    .line 147
    .line 148
    add-int/lit8 v4, v4, 0x1

    .line 149
    .line 150
    move-object/from16 v0, p1

    .line 151
    .line 152
    move/from16 v15, p3

    .line 153
    .line 154
    goto :goto_2

    .line 155
    :cond_5
    move v0, v15

    .line 156
    if-ne v14, v0, :cond_7

    .line 157
    .line 158
    :cond_6
    if-eq v11, v10, :cond_7

    .line 159
    .line 160
    add-int/lit8 v11, v11, 0x1

    .line 161
    .line 162
    move-object/from16 v0, p1

    .line 163
    .line 164
    goto :goto_1

    .line 165
    :cond_7
    iput v6, v7, LV/f;->a:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 166
    .line 167
    iget v0, v3, LP/d;->c:I

    .line 168
    .line 169
    if-lez v0, :cond_a

    .line 170
    .line 171
    iget-object v2, v3, LP/d;->a:[Ljava/lang/Object;

    .line 172
    .line 173
    const/4 v4, 0x0

    .line 174
    :cond_8
    aget-object v3, v2, v4

    .line 175
    .line 176
    check-cast v3, LN/n;

    .line 177
    .line 178
    invoke-virtual {v3}, LN/n;->a()V

    .line 179
    .line 180
    .line 181
    add-int/lit8 v4, v4, 0x1

    .line 182
    .line 183
    if-lt v4, v0, :cond_8

    .line 184
    .line 185
    goto :goto_6

    .line 186
    :goto_4
    iget v2, v3, LP/d;->c:I

    .line 187
    .line 188
    if-lez v2, :cond_9

    .line 189
    .line 190
    iget-object v3, v3, LP/d;->a:[Ljava/lang/Object;

    .line 191
    .line 192
    const/4 v4, 0x0

    .line 193
    :goto_5
    aget-object v5, v3, v4

    .line 194
    .line 195
    check-cast v5, LN/n;

    .line 196
    .line 197
    invoke-virtual {v5}, LN/n;->a()V

    .line 198
    .line 199
    .line 200
    add-int/lit8 v4, v4, 0x1

    .line 201
    .line 202
    if-ge v4, v2, :cond_9

    .line 203
    .line 204
    goto :goto_5

    .line 205
    :cond_9
    throw v0

    .line 206
    :cond_a
    :goto_6
    return-object p1

    .line 207
    :cond_b
    new-instance v0, Lx/n;

    .line 208
    .line 209
    invoke-direct {v0}, Lx/n;-><init>()V

    .line 210
    .line 211
    .line 212
    sget-object v2, LN/B0;->a:LDd/c;

    .line 213
    .line 214
    invoke-virtual {v2}, LDd/c;->E()Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v3

    .line 218
    check-cast v3, LV/f;

    .line 219
    .line 220
    if-nez v3, :cond_c

    .line 221
    .line 222
    new-instance v3, LV/f;

    .line 223
    .line 224
    invoke-direct {v3}, LV/f;-><init>()V

    .line 225
    .line 226
    .line 227
    invoke-virtual {v2, v3}, LDd/c;->Q(Ljava/lang/Object;)V

    .line 228
    .line 229
    .line 230
    :cond_c
    iget v2, v3, LV/f;->a:I

    .line 231
    .line 232
    invoke-static {}, LN/d;->z()LP/d;

    .line 233
    .line 234
    .line 235
    move-result-object v4

    .line 236
    iget v5, v4, LP/d;->c:I

    .line 237
    .line 238
    if-lez v5, :cond_e

    .line 239
    .line 240
    iget-object v6, v4, LP/d;->a:[Ljava/lang/Object;

    .line 241
    .line 242
    const/4 v7, 0x0

    .line 243
    :cond_d
    aget-object v8, v6, v7

    .line 244
    .line 245
    check-cast v8, LN/n;

    .line 246
    .line 247
    invoke-virtual {v8}, LN/n;->b()V

    .line 248
    .line 249
    .line 250
    add-int/lit8 v7, v7, 0x1

    .line 251
    .line 252
    if-lt v7, v5, :cond_d

    .line 253
    .line 254
    :cond_e
    add-int/lit8 v5, v2, 0x1

    .line 255
    .line 256
    :try_start_1
    iput v5, v3, LV/f;->a:I

    .line 257
    .line 258
    new-instance v5, LN/y;

    .line 259
    .line 260
    invoke-direct {v5, v1, v3, v0, v2}, LN/y;-><init>(LN/z;LV/f;Lx/n;I)V

    .line 261
    .line 262
    .line 263
    move-object/from16 v6, p4

    .line 264
    .line 265
    invoke-static {v6, v5}, LX/q;->c(Ltf/a;Ltf/l;)Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v5

    .line 269
    iput v2, v3, LV/f;->a:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 270
    .line 271
    iget v2, v4, LP/d;->c:I

    .line 272
    .line 273
    if-lez v2, :cond_10

    .line 274
    .line 275
    iget-object v3, v4, LP/d;->a:[Ljava/lang/Object;

    .line 276
    .line 277
    const/4 v4, 0x0

    .line 278
    :cond_f
    aget-object v6, v3, v4

    .line 279
    .line 280
    check-cast v6, LN/n;

    .line 281
    .line 282
    invoke-virtual {v6}, LN/n;->a()V

    .line 283
    .line 284
    .line 285
    add-int/lit8 v4, v4, 0x1

    .line 286
    .line 287
    if-lt v4, v2, :cond_f

    .line 288
    .line 289
    :cond_10
    sget-object v2, LX/m;->b:Ljava/lang/Object;

    .line 290
    .line 291
    monitor-enter v2

    .line 292
    :try_start_2
    invoke-static {}, LX/m;->k()LX/g;

    .line 293
    .line 294
    .line 295
    move-result-object v3

    .line 296
    iget-object v4, v1, LN/z;->c:LN/x;

    .line 297
    .line 298
    invoke-static {v4, v1, v3}, LX/m;->n(LX/A;LN/z;LX/g;)LX/A;

    .line 299
    .line 300
    .line 301
    move-result-object v4

    .line 302
    check-cast v4, LN/x;

    .line 303
    .line 304
    iput-object v0, v4, LN/x;->e:Lx/n;

    .line 305
    .line 306
    invoke-virtual {v4, v1, v3}, LN/x;->d(LN/z;LX/g;)I

    .line 307
    .line 308
    .line 309
    move-result v0

    .line 310
    iput v0, v4, LN/x;->g:I

    .line 311
    .line 312
    iput-object v5, v4, LN/x;->f:Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 313
    .line 314
    monitor-exit v2

    .line 315
    sget-object v0, LN/B0;->a:LDd/c;

    .line 316
    .line 317
    invoke-virtual {v0}, LDd/c;->E()Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    move-result-object v0

    .line 321
    check-cast v0, LV/f;

    .line 322
    .line 323
    if-eqz v0, :cond_11

    .line 324
    .line 325
    iget v0, v0, LV/f;->a:I

    .line 326
    .line 327
    if-nez v0, :cond_11

    .line 328
    .line 329
    invoke-static {}, LX/m;->k()LX/g;

    .line 330
    .line 331
    .line 332
    move-result-object v0

    .line 333
    invoke-virtual {v0}, LX/g;->m()V

    .line 334
    .line 335
    .line 336
    monitor-enter v2

    .line 337
    :try_start_3
    invoke-static {}, LX/m;->k()LX/g;

    .line 338
    .line 339
    .line 340
    move-result-object v0

    .line 341
    invoke-virtual {v0}, LX/g;->d()I

    .line 342
    .line 343
    .line 344
    move-result v3

    .line 345
    iput v3, v4, LN/x;->c:I

    .line 346
    .line 347
    invoke-virtual {v0}, LX/g;->h()I

    .line 348
    .line 349
    .line 350
    move-result v0

    .line 351
    iput v0, v4, LN/x;->d:I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 352
    .line 353
    monitor-exit v2

    .line 354
    return-object v4

    .line 355
    :catchall_1
    move-exception v0

    .line 356
    monitor-exit v2

    .line 357
    throw v0

    .line 358
    :cond_11
    return-object v4

    .line 359
    :catchall_2
    move-exception v0

    .line 360
    monitor-exit v2

    .line 361
    throw v0

    .line 362
    :catchall_3
    move-exception v0

    .line 363
    iget v2, v4, LP/d;->c:I

    .line 364
    .line 365
    if-lez v2, :cond_12

    .line 366
    .line 367
    iget-object v3, v4, LP/d;->a:[Ljava/lang/Object;

    .line 368
    .line 369
    const/4 v4, 0x0

    .line 370
    :goto_7
    aget-object v5, v3, v4

    .line 371
    .line 372
    check-cast v5, LN/n;

    .line 373
    .line 374
    invoke-virtual {v5}, LN/n;->a()V

    .line 375
    .line 376
    .line 377
    add-int/lit8 v4, v4, 0x1

    .line 378
    .line 379
    if-ge v4, v2, :cond_12

    .line 380
    .line 381
    goto :goto_7

    .line 382
    :cond_12
    throw v0
.end method

.method public final j()LN/x;
    .locals 4

    .line 1
    invoke-static {}, LX/m;->k()LX/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, LN/z;->c:LN/x;

    .line 6
    .line 7
    invoke-static {v1, v0}, LX/m;->j(LX/A;LX/g;)LX/A;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, LN/x;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    iget-object v3, p0, LN/z;->b:LA/T;

    .line 15
    .line 16
    invoke-virtual {p0, v1, v0, v2, v3}, LN/z;->i(LN/x;LX/g;ZLA/T;)LN/x;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, LN/z;->c:LN/x;

    .line 2
    .line 3
    invoke-static {v0}, LX/m;->i(LX/A;)LX/A;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LN/x;

    .line 8
    .line 9
    new-instance v0, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    const-string v1, "DerivedState(value="

    .line 12
    .line 13
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, LN/z;->c:LN/x;

    .line 17
    .line 18
    invoke-static {v1}, LX/m;->i(LX/A;)LX/A;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, LN/x;

    .line 23
    .line 24
    invoke-static {}, LX/m;->k()LX/g;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {v1, p0, v2}, LN/x;->c(LN/z;LX/g;)Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_0

    .line 33
    .line 34
    iget-object v1, v1, LN/x;->f:Ljava/lang/Object;

    .line 35
    .line 36
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    const-string v1, "<Not calculated>"

    .line 42
    .line 43
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string v1, ")@"

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    return-object v0
.end method
