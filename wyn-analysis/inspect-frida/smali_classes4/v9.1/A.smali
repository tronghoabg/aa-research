.class public final Lv9/A;
.super Lv9/b;
.source "SourceFile"


# static fields
.field public static final s:Lcom/google/protobuf/ByteString;


# instance fields
.field public final r:Lv9/o;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lcom/google/protobuf/ByteString;->EMPTY:Lcom/google/protobuf/ByteString;

    .line 2
    .line 3
    sput-object v0, Lv9/A;->s:Lcom/google/protobuf/ByteString;

    .line 4
    .line 5
    return-void
.end method

.method public constructor <init>(Lv9/m;Lw9/e;Lv9/o;Lv9/p;)V
    .locals 9

    .line 1
    sget-object v0, Lka/e0;->e:LF6/r;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const-class v1, Lka/e0;

    .line 6
    .line 7
    monitor-enter v1

    .line 8
    :try_start_0
    sget-object v0, Lka/e0;->e:LF6/r;

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    invoke-static {}, LF6/r;->d()LM/y;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    sget-object v2, Lmd/c0;->c:Lmd/c0;

    .line 17
    .line 18
    iput-object v2, v0, LM/y;->d:Ljava/lang/Object;

    .line 19
    .line 20
    const-string v2, "google.firestore.v1.Firestore"

    .line 21
    .line 22
    const-string v3, "Listen"

    .line 23
    .line 24
    invoke-static {v2, v3}, LF6/r;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    iput-object v2, v0, LM/y;->e:Ljava/lang/Object;

    .line 29
    .line 30
    const/4 v2, 0x1

    .line 31
    iput-boolean v2, v0, LM/y;->a:Z

    .line 32
    .line 33
    invoke-static {}, Lka/i0;->f()Lka/i0;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    sget-object v3, Ltd/c;->a:Lcom/google/protobuf/ExtensionRegistryLite;

    .line 38
    .line 39
    new-instance v3, Ltd/b;

    .line 40
    .line 41
    invoke-direct {v3, v2}, Ltd/b;-><init>(Lcom/google/protobuf/GeneratedMessageLite;)V

    .line 42
    .line 43
    .line 44
    iput-object v3, v0, LM/y;->b:Ljava/lang/Object;

    .line 45
    .line 46
    invoke-static {}, Lka/l0;->b()Lka/l0;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    new-instance v3, Ltd/b;

    .line 51
    .line 52
    invoke-direct {v3, v2}, Ltd/b;-><init>(Lcom/google/protobuf/GeneratedMessageLite;)V

    .line 53
    .line 54
    .line 55
    iput-object v3, v0, LM/y;->c:Ljava/lang/Object;

    .line 56
    .line 57
    invoke-virtual {v0}, LM/y;->d()LF6/r;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    sput-object v0, Lka/e0;->e:LF6/r;

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :catchall_0
    move-exception v0

    .line 65
    move-object p1, v0

    .line 66
    goto :goto_1

    .line 67
    :cond_0
    :goto_0
    monitor-exit v1

    .line 68
    :cond_1
    move-object v4, v0

    .line 69
    goto :goto_2

    .line 70
    :goto_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 71
    throw p1

    .line 72
    :goto_2
    sget-object v6, Lw9/d;->b:Lw9/d;

    .line 73
    .line 74
    sget-object v7, Lw9/d;->a:Lw9/d;

    .line 75
    .line 76
    move-object v2, p0

    .line 77
    move-object v3, p1

    .line 78
    move-object v5, p2

    .line 79
    move-object v8, p4

    .line 80
    invoke-direct/range {v2 .. v8}, Lv9/b;-><init>(Lv9/m;LF6/r;Lw9/e;Lw9/d;Lw9/d;Lv9/s;)V

    .line 81
    .line 82
    .line 83
    iput-object p3, v2, Lv9/A;->r:Lv9/o;

    .line 84
    .line 85
    return-void
.end method


# virtual methods
.method public final e(Lcom/google/protobuf/MessageLite;)V
    .locals 0

    .line 1
    check-cast p1, Lka/l0;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lv9/A;->j(Lka/l0;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final bridge synthetic f(Lcom/google/protobuf/MessageLite;)V
    .locals 0

    .line 1
    check-cast p1, Lka/l0;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lv9/A;->j(Lka/l0;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final j(Lka/l0;)V
    .locals 33

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const/4 v3, 0x0

    .line 4
    const/4 v4, 0x0

    .line 5
    const/4 v5, 0x1

    .line 6
    iget-object v0, v1, Lv9/b;->k:Lw9/l;

    .line 7
    .line 8
    const-wide/16 v6, 0x0

    .line 9
    .line 10
    iput-wide v6, v0, Lw9/l;->f:J

    .line 11
    .line 12
    iget-object v0, v1, Lv9/A;->r:Lv9/o;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-virtual/range {p1 .. p1}, Lka/l0;->g()I

    .line 18
    .line 19
    .line 20
    move-result v8

    .line 21
    invoke-static {v8}, LA/f;->f(I)I

    .line 22
    .line 23
    .line 24
    move-result v8

    .line 25
    sget-object v9, Lv9/z;->c:Lv9/z;

    .line 26
    .line 27
    const/4 v10, 0x3

    .line 28
    const/4 v11, 0x2

    .line 29
    const/4 v12, 0x4

    .line 30
    if-eqz v8, :cond_4

    .line 31
    .line 32
    if-eq v8, v5, :cond_3

    .line 33
    .line 34
    if-eq v8, v11, :cond_2

    .line 35
    .line 36
    if-eq v8, v10, :cond_1

    .line 37
    .line 38
    if-ne v8, v12, :cond_0

    .line 39
    .line 40
    invoke-virtual/range {p1 .. p1}, Lka/l0;->f()Lka/d0;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    new-instance v8, LA/x;

    .line 45
    .line 46
    invoke-virtual {v0}, Lka/d0;->b()I

    .line 47
    .line 48
    .line 49
    move-result v13

    .line 50
    invoke-virtual {v0}, Lka/d0;->e()Lka/u;

    .line 51
    .line 52
    .line 53
    move-result-object v14

    .line 54
    const/16 v15, 0x13

    .line 55
    .line 56
    invoke-direct {v8, v13, v14, v15}, LA/x;-><init>(ILjava/lang/Object;I)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0}, Lka/d0;->d()I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    new-instance v13, Lv9/x;

    .line 64
    .line 65
    invoke-direct {v13, v0, v8}, Lv9/x;-><init>(ILA/x;)V

    .line 66
    .line 67
    .line 68
    goto/16 :goto_3

    .line 69
    .line 70
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 71
    .line 72
    const-string v2, "Unknown change type set"

    .line 73
    .line 74
    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    throw v0

    .line 78
    :cond_1
    invoke-virtual/range {p1 .. p1}, Lka/l0;->e()Lka/U;

    .line 79
    .line 80
    .line 81
    move-result-object v8

    .line 82
    invoke-virtual {v8}, Lka/U;->d()Lcom/google/protobuf/Internal$IntList;

    .line 83
    .line 84
    .line 85
    move-result-object v13

    .line 86
    invoke-virtual {v8}, Lka/U;->c()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v8

    .line 90
    invoke-virtual {v0, v8}, Lv9/o;->b(Ljava/lang/String;)Ls9/h;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    new-instance v8, Lv9/w;

    .line 95
    .line 96
    sget-object v14, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 97
    .line 98
    invoke-direct {v8, v14, v13, v0, v3}, Lv9/w;-><init>(Ljava/util/List;Lcom/google/protobuf/Internal$IntList;Ls9/h;Ls9/k;)V

    .line 99
    .line 100
    .line 101
    :goto_0
    move-object v13, v8

    .line 102
    goto/16 :goto_3

    .line 103
    .line 104
    :cond_2
    invoke-virtual/range {p1 .. p1}, Lka/l0;->d()Lka/N;

    .line 105
    .line 106
    .line 107
    move-result-object v8

    .line 108
    invoke-virtual {v8}, Lka/N;->e()Lcom/google/protobuf/Internal$IntList;

    .line 109
    .line 110
    .line 111
    move-result-object v13

    .line 112
    invoke-virtual {v8}, Lka/N;->c()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v14

    .line 116
    invoke-virtual {v0, v14}, Lv9/o;->b(Ljava/lang/String;)Ls9/h;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    invoke-virtual {v8}, Lka/N;->d()Lcom/google/protobuf/Timestamp;

    .line 121
    .line 122
    .line 123
    move-result-object v8

    .line 124
    invoke-static {v8}, Lv9/o;->f(Lcom/google/protobuf/Timestamp;)Ls9/o;

    .line 125
    .line 126
    .line 127
    move-result-object v8

    .line 128
    invoke-static {v0, v8}, Ls9/k;->h(Ls9/h;Ls9/o;)Ls9/k;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    new-instance v8, Lv9/w;

    .line 133
    .line 134
    sget-object v14, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 135
    .line 136
    iget-object v15, v0, Ls9/k;->a:Ls9/h;

    .line 137
    .line 138
    invoke-direct {v8, v14, v13, v15, v0}, Lv9/w;-><init>(Ljava/util/List;Lcom/google/protobuf/Internal$IntList;Ls9/h;Ls9/k;)V

    .line 139
    .line 140
    .line 141
    goto :goto_0

    .line 142
    :cond_3
    invoke-virtual/range {p1 .. p1}, Lka/l0;->c()Lka/K;

    .line 143
    .line 144
    .line 145
    move-result-object v8

    .line 146
    invoke-virtual {v8}, Lka/K;->e()Lcom/google/protobuf/Internal$IntList;

    .line 147
    .line 148
    .line 149
    move-result-object v13

    .line 150
    invoke-virtual {v8}, Lka/K;->d()Lcom/google/protobuf/Internal$IntList;

    .line 151
    .line 152
    .line 153
    move-result-object v14

    .line 154
    invoke-virtual {v8}, Lka/K;->c()Lka/H;

    .line 155
    .line 156
    .line 157
    move-result-object v15

    .line 158
    invoke-virtual {v15}, Lka/H;->getName()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v15

    .line 162
    invoke-virtual {v0, v15}, Lv9/o;->b(Ljava/lang/String;)Ls9/h;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    invoke-virtual {v8}, Lka/K;->c()Lka/H;

    .line 167
    .line 168
    .line 169
    move-result-object v15

    .line 170
    invoke-virtual {v15}, Lka/H;->f()Lcom/google/protobuf/Timestamp;

    .line 171
    .line 172
    .line 173
    move-result-object v15

    .line 174
    invoke-static {v15}, Lv9/o;->f(Lcom/google/protobuf/Timestamp;)Ls9/o;

    .line 175
    .line 176
    .line 177
    move-result-object v15

    .line 178
    sget-object v6, Ls9/o;->b:Ls9/o;

    .line 179
    .line 180
    invoke-virtual {v15, v6}, Ls9/o;->equals(Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    move-result v6

    .line 184
    xor-int/2addr v6, v5

    .line 185
    new-array v7, v4, [Ljava/lang/Object;

    .line 186
    .line 187
    const-string v3, "Got a document change without an update time"

    .line 188
    .line 189
    invoke-static {v6, v3, v7}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v8}, Lka/K;->c()Lka/H;

    .line 193
    .line 194
    .line 195
    move-result-object v3

    .line 196
    invoke-virtual {v3}, Lka/H;->getFieldsMap()Ljava/util/Map;

    .line 197
    .line 198
    .line 199
    move-result-object v3

    .line 200
    invoke-static {v3}, Ls9/l;->e(Ljava/util/Map;)Ls9/l;

    .line 201
    .line 202
    .line 203
    move-result-object v3

    .line 204
    new-instance v6, Ls9/k;

    .line 205
    .line 206
    invoke-direct {v6, v0}, Ls9/k;-><init>(Ls9/h;)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {v6, v15, v3}, Ls9/k;->a(Ls9/o;Ls9/l;)V

    .line 210
    .line 211
    .line 212
    new-instance v3, Lv9/w;

    .line 213
    .line 214
    invoke-direct {v3, v13, v14, v0, v6}, Lv9/w;-><init>(Ljava/util/List;Lcom/google/protobuf/Internal$IntList;Ls9/h;Ls9/k;)V

    .line 215
    .line 216
    .line 217
    move-object v13, v3

    .line 218
    goto :goto_3

    .line 219
    :cond_4
    invoke-virtual/range {p1 .. p1}, Lka/l0;->h()Lka/s1;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    invoke-virtual {v0}, Lka/s1;->f()Lka/r1;

    .line 224
    .line 225
    .line 226
    move-result-object v3

    .line 227
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 228
    .line 229
    .line 230
    move-result v3

    .line 231
    if-eqz v3, :cond_9

    .line 232
    .line 233
    if-eq v3, v5, :cond_8

    .line 234
    .line 235
    if-eq v3, v11, :cond_7

    .line 236
    .line 237
    if-eq v3, v10, :cond_6

    .line 238
    .line 239
    if-ne v3, v12, :cond_5

    .line 240
    .line 241
    sget-object v3, Lv9/z;->e:Lv9/z;

    .line 242
    .line 243
    :goto_1
    const/4 v6, 0x0

    .line 244
    goto :goto_2

    .line 245
    :cond_5
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 246
    .line 247
    const-string v2, "Unknown target change type"

    .line 248
    .line 249
    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 250
    .line 251
    .line 252
    throw v0

    .line 253
    :cond_6
    sget-object v3, Lv9/z;->d:Lv9/z;

    .line 254
    .line 255
    goto :goto_1

    .line 256
    :cond_7
    invoke-virtual {v0}, Lka/s1;->b()LHa/c;

    .line 257
    .line 258
    .line 259
    move-result-object v3

    .line 260
    invoke-virtual {v3}, LHa/c;->b()I

    .line 261
    .line 262
    .line 263
    move-result v6

    .line 264
    invoke-static {v6}, Lmd/k0;->d(I)Lmd/k0;

    .line 265
    .line 266
    .line 267
    move-result-object v6

    .line 268
    invoke-virtual {v3}, LHa/c;->getMessage()Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v3

    .line 272
    invoke-virtual {v6, v3}, Lmd/k0;->h(Ljava/lang/String;)Lmd/k0;

    .line 273
    .line 274
    .line 275
    move-result-object v3

    .line 276
    move-object v6, v3

    .line 277
    move-object v3, v9

    .line 278
    goto :goto_2

    .line 279
    :cond_8
    sget-object v3, Lv9/z;->b:Lv9/z;

    .line 280
    .line 281
    goto :goto_1

    .line 282
    :cond_9
    sget-object v3, Lv9/z;->a:Lv9/z;

    .line 283
    .line 284
    goto :goto_1

    .line 285
    :goto_2
    new-instance v13, Lv9/y;

    .line 286
    .line 287
    invoke-virtual {v0}, Lka/s1;->h()Lcom/google/protobuf/Internal$IntList;

    .line 288
    .line 289
    .line 290
    move-result-object v7

    .line 291
    invoke-virtual {v0}, Lka/s1;->e()Lcom/google/protobuf/ByteString;

    .line 292
    .line 293
    .line 294
    move-result-object v0

    .line 295
    invoke-direct {v13, v3, v7, v0, v6}, Lv9/y;-><init>(Lv9/z;Lcom/google/protobuf/Internal$IntList;Lcom/google/protobuf/ByteString;Lmd/k0;)V

    .line 296
    .line 297
    .line 298
    :goto_3
    invoke-virtual/range {p1 .. p1}, Lka/l0;->g()I

    .line 299
    .line 300
    .line 301
    move-result v0

    .line 302
    if-eq v0, v5, :cond_a

    .line 303
    .line 304
    sget-object v0, Ls9/o;->b:Ls9/o;

    .line 305
    .line 306
    :goto_4
    move-object v3, v0

    .line 307
    goto :goto_5

    .line 308
    :cond_a
    invoke-virtual/range {p1 .. p1}, Lka/l0;->h()Lka/s1;

    .line 309
    .line 310
    .line 311
    move-result-object v0

    .line 312
    invoke-virtual {v0}, Lka/s1;->g()I

    .line 313
    .line 314
    .line 315
    move-result v0

    .line 316
    if-eqz v0, :cond_b

    .line 317
    .line 318
    sget-object v0, Ls9/o;->b:Ls9/o;

    .line 319
    .line 320
    goto :goto_4

    .line 321
    :cond_b
    invoke-virtual/range {p1 .. p1}, Lka/l0;->h()Lka/s1;

    .line 322
    .line 323
    .line 324
    move-result-object v0

    .line 325
    invoke-virtual {v0}, Lka/s1;->d()Lcom/google/protobuf/Timestamp;

    .line 326
    .line 327
    .line 328
    move-result-object v0

    .line 329
    invoke-static {v0}, Lv9/o;->f(Lcom/google/protobuf/Timestamp;)Ls9/o;

    .line 330
    .line 331
    .line 332
    move-result-object v0

    .line 333
    goto :goto_4

    .line 334
    :goto_5
    iget-object v0, v1, Lv9/b;->l:Lv9/s;

    .line 335
    .line 336
    check-cast v0, Lv9/p;

    .line 337
    .line 338
    iget-object v6, v0, Lv9/p;->a:LE5/n0;

    .line 339
    .line 340
    iget-object v0, v6, LE5/n0;->j:Ljava/lang/Object;

    .line 341
    .line 342
    check-cast v0, Lio/flutter/plugin/platform/x;

    .line 343
    .line 344
    invoke-virtual {v0, v11}, Lio/flutter/plugin/platform/x;->d(I)V

    .line 345
    .line 346
    .line 347
    iget-object v0, v6, LE5/n0;->k:Ljava/lang/Object;

    .line 348
    .line 349
    check-cast v0, Lv9/A;

    .line 350
    .line 351
    if-eqz v0, :cond_c

    .line 352
    .line 353
    iget-object v0, v6, LE5/n0;->l:Ljava/lang/Object;

    .line 354
    .line 355
    check-cast v0, LC6/l;

    .line 356
    .line 357
    if-eqz v0, :cond_c

    .line 358
    .line 359
    move v0, v5

    .line 360
    goto :goto_6

    .line 361
    :cond_c
    move v0, v4

    .line 362
    :goto_6
    const-string v7, "WatchStream and WatchStreamAggregator should both be non-null"

    .line 363
    .line 364
    new-array v8, v4, [Ljava/lang/Object;

    .line 365
    .line 366
    invoke-static {v0, v7, v8}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 367
    .line 368
    .line 369
    instance-of v0, v13, Lv9/y;

    .line 370
    .line 371
    if-eqz v0, :cond_d

    .line 372
    .line 373
    move-object v7, v13

    .line 374
    check-cast v7, Lv9/y;

    .line 375
    .line 376
    goto :goto_7

    .line 377
    :cond_d
    const/4 v7, 0x0

    .line 378
    :goto_7
    iget-object v8, v6, LE5/n0;->d:Ljava/lang/Object;

    .line 379
    .line 380
    check-cast v8, Ljava/util/HashMap;

    .line 381
    .line 382
    iget-object v14, v6, LE5/n0;->b:Ljava/lang/Object;

    .line 383
    .line 384
    check-cast v14, Lad/L;

    .line 385
    .line 386
    iget-object v14, v14, Lad/L;->b:Ljava/lang/Object;

    .line 387
    .line 388
    check-cast v14, Lp9/s;

    .line 389
    .line 390
    if-eqz v7, :cond_11

    .line 391
    .line 392
    iget-object v15, v7, Lv9/y;->c:Lv9/z;

    .line 393
    .line 394
    invoke-virtual {v15, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 395
    .line 396
    .line 397
    move-result v9

    .line 398
    if-eqz v9, :cond_11

    .line 399
    .line 400
    iget-object v9, v7, Lv9/y;->f:Lmd/k0;

    .line 401
    .line 402
    if-eqz v9, :cond_11

    .line 403
    .line 404
    iget-object v0, v7, Lv9/y;->d:Lcom/google/protobuf/Internal$IntList;

    .line 405
    .line 406
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 407
    .line 408
    .line 409
    move-result-object v0

    .line 410
    :cond_e
    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 411
    .line 412
    .line 413
    move-result v2

    .line 414
    if-eqz v2, :cond_48

    .line 415
    .line 416
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 417
    .line 418
    .line 419
    move-result-object v2

    .line 420
    check-cast v2, Ljava/lang/Integer;

    .line 421
    .line 422
    invoke-virtual {v8, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 423
    .line 424
    .line 425
    move-result v3

    .line 426
    if-eqz v3, :cond_e

    .line 427
    .line 428
    invoke-virtual {v8, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 429
    .line 430
    .line 431
    iget-object v3, v6, LE5/n0;->l:Ljava/lang/Object;

    .line 432
    .line 433
    check-cast v3, LC6/l;

    .line 434
    .line 435
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 436
    .line 437
    .line 438
    iget-object v3, v3, LC6/l;->b:Ljava/lang/Object;

    .line 439
    .line 440
    check-cast v3, Ljava/util/HashMap;

    .line 441
    .line 442
    invoke-virtual {v3, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 443
    .line 444
    .line 445
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 446
    .line 447
    .line 448
    move-result v2

    .line 449
    invoke-virtual {v14}, Lp9/s;->e()Lp9/z;

    .line 450
    .line 451
    .line 452
    move-result-object v3

    .line 453
    const-string v4, "handleRejectedListen"

    .line 454
    .line 455
    invoke-virtual {v3, v4}, Lp9/z;->a(Ljava/lang/String;)V

    .line 456
    .line 457
    .line 458
    iget-object v4, v3, Lp9/z;->g:Ljava/util/HashMap;

    .line 459
    .line 460
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 461
    .line 462
    .line 463
    move-result-object v5

    .line 464
    invoke-virtual {v4, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 465
    .line 466
    .line 467
    move-result-object v5

    .line 468
    check-cast v5, Lp9/y;

    .line 469
    .line 470
    if-eqz v5, :cond_f

    .line 471
    .line 472
    iget-object v5, v5, Lp9/y;->a:Ls9/h;

    .line 473
    .line 474
    goto :goto_9

    .line 475
    :cond_f
    const/4 v5, 0x0

    .line 476
    :goto_9
    if-eqz v5, :cond_10

    .line 477
    .line 478
    iget-object v7, v3, Lp9/z;->f:Ljava/util/HashMap;

    .line 479
    .line 480
    invoke-virtual {v7, v5}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 481
    .line 482
    .line 483
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 484
    .line 485
    .line 486
    move-result-object v2

    .line 487
    invoke-virtual {v4, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 488
    .line 489
    .line 490
    invoke-virtual {v3}, Lp9/z;->g()V

    .line 491
    .line 492
    .line 493
    sget-object v2, Ls9/o;->b:Ls9/o;

    .line 494
    .line 495
    invoke-static {v5, v2}, Ls9/k;->h(Ls9/h;Ls9/o;)Ls9/k;

    .line 496
    .line 497
    .line 498
    move-result-object v4

    .line 499
    invoke-static {v5, v4}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 500
    .line 501
    .line 502
    move-result-object v23

    .line 503
    invoke-static {v5}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    .line 504
    .line 505
    .line 506
    move-result-object v24

    .line 507
    new-instance v19, LC8/i;

    .line 508
    .line 509
    sget-object v21, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 510
    .line 511
    const/16 v25, 0x14

    .line 512
    .line 513
    move-object/from16 v22, v21

    .line 514
    .line 515
    move-object/from16 v20, v2

    .line 516
    .line 517
    invoke-direct/range {v19 .. v25}, LC8/i;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 518
    .line 519
    .line 520
    move-object/from16 v2, v19

    .line 521
    .line 522
    invoke-virtual {v3, v2}, Lp9/z;->c(LC8/i;)V

    .line 523
    .line 524
    .line 525
    goto :goto_8

    .line 526
    :cond_10
    iget-object v4, v3, Lp9/z;->a:Lr9/l;

    .line 527
    .line 528
    new-instance v5, LE5/c;

    .line 529
    .line 530
    const/16 v7, 0x9

    .line 531
    .line 532
    invoke-direct {v5, v4, v2, v7}, LE5/c;-><init>(Ljava/lang/Object;II)V

    .line 533
    .line 534
    .line 535
    iget-object v4, v4, Lr9/l;->a:Lp7/b;

    .line 536
    .line 537
    const-string v7, "Release target"

    .line 538
    .line 539
    invoke-virtual {v4, v7, v5}, Lp7/b;->P(Ljava/lang/String;Ljava/lang/Runnable;)V

    .line 540
    .line 541
    .line 542
    invoke-virtual {v3, v2, v9}, Lp9/z;->h(ILmd/k0;)V

    .line 543
    .line 544
    .line 545
    goto/16 :goto_8

    .line 546
    .line 547
    :cond_11
    instance-of v7, v13, Lv9/w;

    .line 548
    .line 549
    if-eqz v7, :cond_17

    .line 550
    .line 551
    iget-object v0, v6, LE5/n0;->l:Ljava/lang/Object;

    .line 552
    .line 553
    check-cast v0, LC6/l;

    .line 554
    .line 555
    check-cast v13, Lv9/w;

    .line 556
    .line 557
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 558
    .line 559
    .line 560
    iget-object v2, v13, Lv9/w;->c:Ljava/util/List;

    .line 561
    .line 562
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 563
    .line 564
    .line 565
    move-result-object v2

    .line 566
    :goto_a
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 567
    .line 568
    .line 569
    move-result v7

    .line 570
    iget-object v9, v13, Lv9/w;->f:Ls9/k;

    .line 571
    .line 572
    iget-object v10, v13, Lv9/w;->e:Ls9/h;

    .line 573
    .line 574
    if-eqz v7, :cond_16

    .line 575
    .line 576
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 577
    .line 578
    .line 579
    move-result-object v7

    .line 580
    check-cast v7, Ljava/lang/Integer;

    .line 581
    .line 582
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 583
    .line 584
    .line 585
    move-result v11

    .line 586
    if-eqz v9, :cond_15

    .line 587
    .line 588
    invoke-virtual {v9}, Ls9/k;->d()Z

    .line 589
    .line 590
    .line 591
    move-result v12

    .line 592
    if-eqz v12, :cond_15

    .line 593
    .line 594
    invoke-virtual {v0, v11}, LC6/l;->u(I)Z

    .line 595
    .line 596
    .line 597
    move-result v10

    .line 598
    if-nez v10, :cond_12

    .line 599
    .line 600
    goto :goto_a

    .line 601
    :cond_12
    iget-object v10, v0, LC6/l;->a:Ljava/lang/Object;

    .line 602
    .line 603
    check-cast v10, LE5/n0;

    .line 604
    .line 605
    iget-object v10, v10, LE5/n0;->b:Ljava/lang/Object;

    .line 606
    .line 607
    check-cast v10, Lad/L;

    .line 608
    .line 609
    invoke-virtual {v10, v11}, Lad/L;->p(I)Lc9/d;

    .line 610
    .line 611
    .line 612
    move-result-object v10

    .line 613
    iget-object v10, v10, Lc9/d;->a:Lc9/c;

    .line 614
    .line 615
    iget-object v12, v9, Ls9/k;->a:Ls9/h;

    .line 616
    .line 617
    invoke-virtual {v10, v12}, Lc9/c;->a(Ljava/lang/Object;)Z

    .line 618
    .line 619
    .line 620
    move-result v10

    .line 621
    if-eqz v10, :cond_13

    .line 622
    .line 623
    sget-object v10, Lp9/e;->c:Lp9/e;

    .line 624
    .line 625
    goto :goto_b

    .line 626
    :cond_13
    sget-object v10, Lp9/e;->b:Lp9/e;

    .line 627
    .line 628
    :goto_b
    invoke-virtual {v0, v11}, LC6/l;->o(I)Lv9/u;

    .line 629
    .line 630
    .line 631
    move-result-object v11

    .line 632
    iput-boolean v5, v11, Lv9/u;->c:Z

    .line 633
    .line 634
    iget-object v11, v11, Lv9/u;->b:Ljava/util/HashMap;

    .line 635
    .line 636
    invoke-virtual {v11, v12, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 637
    .line 638
    .line 639
    iget-object v10, v0, LC6/l;->c:Ljava/lang/Object;

    .line 640
    .line 641
    check-cast v10, Ljava/util/HashMap;

    .line 642
    .line 643
    invoke-virtual {v10, v12, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 644
    .line 645
    .line 646
    iget-object v9, v0, LC6/l;->d:Ljava/lang/Object;

    .line 647
    .line 648
    check-cast v9, Ljava/util/HashMap;

    .line 649
    .line 650
    invoke-virtual {v9, v12}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 651
    .line 652
    .line 653
    move-result-object v9

    .line 654
    check-cast v9, Ljava/util/Set;

    .line 655
    .line 656
    if-nez v9, :cond_14

    .line 657
    .line 658
    new-instance v9, Ljava/util/HashSet;

    .line 659
    .line 660
    invoke-direct {v9}, Ljava/util/HashSet;-><init>()V

    .line 661
    .line 662
    .line 663
    iget-object v10, v0, LC6/l;->d:Ljava/lang/Object;

    .line 664
    .line 665
    check-cast v10, Ljava/util/HashMap;

    .line 666
    .line 667
    invoke-virtual {v10, v12, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 668
    .line 669
    .line 670
    :cond_14
    invoke-interface {v9, v7}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 671
    .line 672
    .line 673
    goto :goto_a

    .line 674
    :cond_15
    invoke-virtual {v0, v11, v10, v9}, LC6/l;->y(ILs9/h;Ls9/k;)V

    .line 675
    .line 676
    .line 677
    goto :goto_a

    .line 678
    :cond_16
    iget-object v2, v13, Lv9/w;->d:Lcom/google/protobuf/Internal$IntList;

    .line 679
    .line 680
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 681
    .line 682
    .line 683
    move-result-object v2

    .line 684
    :goto_c
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 685
    .line 686
    .line 687
    move-result v7

    .line 688
    if-eqz v7, :cond_3c

    .line 689
    .line 690
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 691
    .line 692
    .line 693
    move-result-object v7

    .line 694
    check-cast v7, Ljava/lang/Integer;

    .line 695
    .line 696
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 697
    .line 698
    .line 699
    move-result v7

    .line 700
    invoke-virtual {v0, v7, v10, v9}, LC6/l;->y(ILs9/h;Ls9/k;)V

    .line 701
    .line 702
    .line 703
    goto :goto_c

    .line 704
    :cond_17
    instance-of v7, v13, Lv9/x;

    .line 705
    .line 706
    if-eqz v7, :cond_2c

    .line 707
    .line 708
    iget-object v0, v6, LE5/n0;->l:Ljava/lang/Object;

    .line 709
    .line 710
    move-object v7, v0

    .line 711
    check-cast v7, LC6/l;

    .line 712
    .line 713
    check-cast v13, Lv9/x;

    .line 714
    .line 715
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 716
    .line 717
    .line 718
    iget-object v0, v13, Lv9/x;->d:LA/x;

    .line 719
    .line 720
    iget v9, v13, Lv9/x;->c:I

    .line 721
    .line 722
    invoke-virtual {v7, v9}, LC6/l;->x(I)Lr9/S;

    .line 723
    .line 724
    .line 725
    move-result-object v12

    .line 726
    if-eqz v12, :cond_3c

    .line 727
    .line 728
    iget-object v12, v12, Lr9/S;->a:Lp9/A;

    .line 729
    .line 730
    invoke-virtual {v12}, Lp9/A;->e()Z

    .line 731
    .line 732
    .line 733
    move-result v13

    .line 734
    iget v15, v0, LA/x;->b:I

    .line 735
    .line 736
    if-eqz v13, :cond_1a

    .line 737
    .line 738
    if-nez v15, :cond_18

    .line 739
    .line 740
    new-instance v0, Ls9/h;

    .line 741
    .line 742
    iget-object v2, v12, Lp9/A;->d:Ls9/m;

    .line 743
    .line 744
    invoke-direct {v0, v2}, Ls9/h;-><init>(Ls9/m;)V

    .line 745
    .line 746
    .line 747
    sget-object v2, Ls9/o;->b:Ls9/o;

    .line 748
    .line 749
    invoke-static {v0, v2}, Ls9/k;->h(Ls9/h;Ls9/o;)Ls9/k;

    .line 750
    .line 751
    .line 752
    move-result-object v2

    .line 753
    invoke-virtual {v7, v9, v0, v2}, LC6/l;->y(ILs9/h;Ls9/k;)V

    .line 754
    .line 755
    .line 756
    goto/16 :goto_21

    .line 757
    .line 758
    :cond_18
    if-ne v15, v5, :cond_19

    .line 759
    .line 760
    move v0, v5

    .line 761
    goto :goto_d

    .line 762
    :cond_19
    move v0, v4

    .line 763
    :goto_d
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 764
    .line 765
    .line 766
    move-result-object v2

    .line 767
    new-array v7, v5, [Ljava/lang/Object;

    .line 768
    .line 769
    aput-object v2, v7, v4

    .line 770
    .line 771
    const-string v2, "Single document existence filter with count: %d"

    .line 772
    .line 773
    invoke-static {v0, v2, v7}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 774
    .line 775
    .line 776
    goto/16 :goto_21

    .line 777
    .line 778
    :cond_1a
    invoke-virtual {v7, v9}, LC6/l;->o(I)Lv9/u;

    .line 779
    .line 780
    .line 781
    move-result-object v12

    .line 782
    invoke-virtual {v12}, Lv9/u;->a()Lv9/t;

    .line 783
    .line 784
    .line 785
    move-result-object v12

    .line 786
    iget-object v13, v7, LC6/l;->a:Ljava/lang/Object;

    .line 787
    .line 788
    check-cast v13, LE5/n0;

    .line 789
    .line 790
    iget-object v10, v13, LE5/n0;->b:Ljava/lang/Object;

    .line 791
    .line 792
    check-cast v10, Lad/L;

    .line 793
    .line 794
    invoke-virtual {v10, v9}, Lad/L;->p(I)Lc9/d;

    .line 795
    .line 796
    .line 797
    move-result-object v10

    .line 798
    iget-object v10, v10, Lc9/d;->a:Lc9/c;

    .line 799
    .line 800
    invoke-virtual {v10}, Lc9/c;->size()I

    .line 801
    .line 802
    .line 803
    move-result v10

    .line 804
    move/from16 v20, v5

    .line 805
    .line 806
    iget-object v5, v12, Lv9/t;->c:Lc9/d;

    .line 807
    .line 808
    iget-object v5, v5, Lc9/d;->a:Lc9/c;

    .line 809
    .line 810
    invoke-virtual {v5}, Lc9/c;->size()I

    .line 811
    .line 812
    .line 813
    move-result v5

    .line 814
    add-int/2addr v5, v10

    .line 815
    iget-object v10, v12, Lv9/t;->e:Lc9/d;

    .line 816
    .line 817
    iget-object v10, v10, Lc9/d;->a:Lc9/c;

    .line 818
    .line 819
    invoke-virtual {v10}, Lc9/c;->size()I

    .line 820
    .line 821
    .line 822
    move-result v10

    .line 823
    sub-int/2addr v5, v10

    .line 824
    if-eq v5, v15, :cond_3c

    .line 825
    .line 826
    iget-object v0, v0, LA/x;->c:Ljava/lang/Object;

    .line 827
    .line 828
    move-object v10, v0

    .line 829
    check-cast v10, Lka/u;

    .line 830
    .line 831
    if-eqz v10, :cond_1c

    .line 832
    .line 833
    invoke-virtual {v10}, Lka/u;->e()Z

    .line 834
    .line 835
    .line 836
    move-result v0

    .line 837
    if-nez v0, :cond_1b

    .line 838
    .line 839
    goto :goto_e

    .line 840
    :cond_1b
    invoke-virtual {v10}, Lka/u;->b()Lka/r;

    .line 841
    .line 842
    .line 843
    move-result-object v0

    .line 844
    invoke-virtual {v0}, Lka/r;->b()Lcom/google/protobuf/ByteString;

    .line 845
    .line 846
    .line 847
    move-result-object v0

    .line 848
    :try_start_0
    invoke-virtual {v10}, Lka/u;->b()Lka/r;

    .line 849
    .line 850
    .line 851
    move-result-object v12

    .line 852
    invoke-virtual {v12}, Lka/r;->d()I

    .line 853
    .line 854
    .line 855
    move-result v12

    .line 856
    invoke-virtual {v10}, Lka/u;->d()I

    .line 857
    .line 858
    .line 859
    move-result v2

    .line 860
    invoke-static {v0, v12, v2}, LM2/d;->a(Lcom/google/protobuf/ByteString;II)LM2/d;

    .line 861
    .line 862
    .line 863
    move-result-object v0
    :try_end_0
    .catch Lv9/e; {:try_start_0 .. :try_end_0} :catch_0

    .line 864
    iget v2, v0, LM2/d;->b:I

    .line 865
    .line 866
    if-nez v2, :cond_1d

    .line 867
    .line 868
    :cond_1c
    :goto_e
    const/4 v0, 0x0

    .line 869
    goto :goto_f

    .line 870
    :catch_0
    move-exception v0

    .line 871
    new-instance v2, Ljava/lang/StringBuilder;

    .line 872
    .line 873
    const-string v12, "Applying bloom filter failed: ("

    .line 874
    .line 875
    invoke-direct {v2, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 876
    .line 877
    .line 878
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 879
    .line 880
    .line 881
    move-result-object v0

    .line 882
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 883
    .line 884
    .line 885
    const-string v0, "); ignoring the bloom filter and falling back to full re-query."

    .line 886
    .line 887
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 888
    .line 889
    .line 890
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 891
    .line 892
    .line 893
    move-result-object v0

    .line 894
    new-array v2, v4, [Ljava/lang/Object;

    .line 895
    .line 896
    const-string v12, "WatchChangeAggregator"

    .line 897
    .line 898
    invoke-static {v12, v0, v11, v2}, LBa/c;->p(Ljava/lang/String;Ljava/lang/String;I[Ljava/lang/Object;)V

    .line 899
    .line 900
    .line 901
    goto :goto_e

    .line 902
    :cond_1d
    :goto_f
    iget-object v2, v7, LC6/l;->f:Ljava/lang/Object;

    .line 903
    .line 904
    check-cast v2, Ls9/f;

    .line 905
    .line 906
    if-eqz v0, :cond_25

    .line 907
    .line 908
    iget-object v11, v13, LE5/n0;->b:Ljava/lang/Object;

    .line 909
    .line 910
    check-cast v11, Lad/L;

    .line 911
    .line 912
    invoke-virtual {v11, v9}, Lad/L;->p(I)Lc9/d;

    .line 913
    .line 914
    .line 915
    move-result-object v11

    .line 916
    new-instance v12, Ljava/lang/StringBuilder;

    .line 917
    .line 918
    const-string v13, "projects/"

    .line 919
    .line 920
    invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 921
    .line 922
    .line 923
    iget-object v13, v2, Ls9/f;->a:Ljava/lang/String;

    .line 924
    .line 925
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 926
    .line 927
    .line 928
    const-string v13, "/databases/"

    .line 929
    .line 930
    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 931
    .line 932
    .line 933
    iget-object v13, v2, Ls9/f;->b:Ljava/lang/String;

    .line 934
    .line 935
    const-string v4, "/documents/"

    .line 936
    .line 937
    invoke-static {v12, v13, v4}, Lwg/b;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 938
    .line 939
    .line 940
    move-result-object v4

    .line 941
    invoke-virtual {v11}, Lc9/d;->iterator()Ljava/util/Iterator;

    .line 942
    .line 943
    .line 944
    move-result-object v11

    .line 945
    const/4 v12, 0x0

    .line 946
    :goto_10
    move-object v13, v11

    .line 947
    check-cast v13, LA7/v;

    .line 948
    .line 949
    iget-object v1, v13, LA7/v;->b:Ljava/lang/Object;

    .line 950
    .line 951
    check-cast v1, Ljava/util/Iterator;

    .line 952
    .line 953
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 954
    .line 955
    .line 956
    move-result v1

    .line 957
    if-eqz v1, :cond_23

    .line 958
    .line 959
    invoke-virtual {v13}, LA7/v;->next()Ljava/lang/Object;

    .line 960
    .line 961
    .line 962
    move-result-object v1

    .line 963
    check-cast v1, Ls9/h;

    .line 964
    .line 965
    invoke-static {v4}, LN0/a;->j(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 966
    .line 967
    .line 968
    move-result-object v13

    .line 969
    move-object/from16 p1, v4

    .line 970
    .line 971
    iget-object v4, v1, Ls9/h;->a:Ls9/m;

    .line 972
    .line 973
    invoke-virtual {v4}, Ls9/m;->c()Ljava/lang/String;

    .line 974
    .line 975
    .line 976
    move-result-object v4

    .line 977
    invoke-virtual {v13, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 978
    .line 979
    .line 980
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 981
    .line 982
    .line 983
    move-result-object v4

    .line 984
    iget v13, v0, LM2/d;->b:I

    .line 985
    .line 986
    if-nez v13, :cond_1f

    .line 987
    .line 988
    move/from16 v23, v5

    .line 989
    .line 990
    move-object/from16 v24, v10

    .line 991
    .line 992
    move-object/from16 v30, v11

    .line 993
    .line 994
    const/16 v21, 0x8

    .line 995
    .line 996
    :cond_1e
    const/4 v4, 0x0

    .line 997
    goto :goto_13

    .line 998
    :cond_1f
    move/from16 v23, v5

    .line 999
    .line 1000
    sget-object v5, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 1001
    .line 1002
    invoke-virtual {v4, v5}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 1003
    .line 1004
    .line 1005
    move-result-object v4

    .line 1006
    iget-object v5, v0, LM2/d;->e:Ljava/lang/Object;

    .line 1007
    .line 1008
    check-cast v5, Ljava/security/MessageDigest;

    .line 1009
    .line 1010
    invoke-virtual {v5, v4}, Ljava/security/MessageDigest;->digest([B)[B

    .line 1011
    .line 1012
    .line 1013
    move-result-object v4

    .line 1014
    array-length v5, v4

    .line 1015
    move-object/from16 v24, v10

    .line 1016
    .line 1017
    const/16 v10, 0x10

    .line 1018
    .line 1019
    if-ne v5, v10, :cond_22

    .line 1020
    .line 1021
    const/4 v5, 0x0

    .line 1022
    invoke-static {v5, v4}, LM2/d;->b(I[B)J

    .line 1023
    .line 1024
    .line 1025
    move-result-wide v25

    .line 1026
    const/16 v5, 0x8

    .line 1027
    .line 1028
    invoke-static {v5, v4}, LM2/d;->b(I[B)J

    .line 1029
    .line 1030
    .line 1031
    move-result-wide v27

    .line 1032
    const/4 v4, 0x0

    .line 1033
    :goto_11
    iget v5, v0, LM2/d;->c:I

    .line 1034
    .line 1035
    if-ge v4, v5, :cond_21

    .line 1036
    .line 1037
    move-object v5, v11

    .line 1038
    int-to-long v10, v4

    .line 1039
    mul-long v10, v10, v27

    .line 1040
    .line 1041
    add-long v10, v10, v25

    .line 1042
    .line 1043
    move/from16 v29, v4

    .line 1044
    .line 1045
    move-object/from16 v30, v5

    .line 1046
    .line 1047
    int-to-long v4, v13

    .line 1048
    ushr-long v31, v10, v20

    .line 1049
    .line 1050
    div-long v31, v31, v4

    .line 1051
    .line 1052
    shl-long v31, v31, v20

    .line 1053
    .line 1054
    mul-long v31, v31, v4

    .line 1055
    .line 1056
    sub-long v10, v10, v31

    .line 1057
    .line 1058
    cmp-long v31, v10, v4

    .line 1059
    .line 1060
    if-ltz v31, :cond_20

    .line 1061
    .line 1062
    goto :goto_12

    .line 1063
    :cond_20
    const-wide/16 v4, 0x0

    .line 1064
    .line 1065
    :goto_12
    sub-long/2addr v10, v4

    .line 1066
    long-to-int v4, v10

    .line 1067
    const/16 v21, 0x8

    .line 1068
    .line 1069
    div-int/lit8 v5, v4, 0x8

    .line 1070
    .line 1071
    iget-object v10, v0, LM2/d;->d:Ljava/lang/Object;

    .line 1072
    .line 1073
    check-cast v10, Lcom/google/protobuf/ByteString;

    .line 1074
    .line 1075
    invoke-virtual {v10, v5}, Lcom/google/protobuf/ByteString;->byteAt(I)B

    .line 1076
    .line 1077
    .line 1078
    move-result v5

    .line 1079
    rem-int/lit8 v4, v4, 0x8

    .line 1080
    .line 1081
    shl-int v4, v20, v4

    .line 1082
    .line 1083
    and-int/2addr v4, v5

    .line 1084
    if-eqz v4, :cond_1e

    .line 1085
    .line 1086
    add-int/lit8 v4, v29, 0x1

    .line 1087
    .line 1088
    move-object/from16 v11, v30

    .line 1089
    .line 1090
    goto :goto_11

    .line 1091
    :goto_13
    invoke-virtual {v7, v9, v1, v4}, LC6/l;->y(ILs9/h;Ls9/k;)V

    .line 1092
    .line 1093
    .line 1094
    add-int/lit8 v12, v12, 0x1

    .line 1095
    .line 1096
    goto :goto_14

    .line 1097
    :cond_21
    move-object/from16 v30, v11

    .line 1098
    .line 1099
    const/16 v21, 0x8

    .line 1100
    .line 1101
    :goto_14
    move-object/from16 v1, p0

    .line 1102
    .line 1103
    move-object/from16 v4, p1

    .line 1104
    .line 1105
    move/from16 v5, v23

    .line 1106
    .line 1107
    move-object/from16 v10, v24

    .line 1108
    .line 1109
    move-object/from16 v11, v30

    .line 1110
    .line 1111
    goto/16 :goto_10

    .line 1112
    .line 1113
    :cond_22
    new-instance v0, Ljava/lang/RuntimeException;

    .line 1114
    .line 1115
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1116
    .line 1117
    const-string v2, "Invalid md5 hash array length: "

    .line 1118
    .line 1119
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1120
    .line 1121
    .line 1122
    array-length v2, v4

    .line 1123
    const-string v3, " (expected 16)"

    .line 1124
    .line 1125
    invoke-static {v2, v3, v1}, LA7/p0;->j(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 1126
    .line 1127
    .line 1128
    move-result-object v1

    .line 1129
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 1130
    .line 1131
    .line 1132
    throw v0

    .line 1133
    :cond_23
    move/from16 v23, v5

    .line 1134
    .line 1135
    move-object/from16 v24, v10

    .line 1136
    .line 1137
    sub-int v5, v23, v12

    .line 1138
    .line 1139
    if-ne v15, v5, :cond_24

    .line 1140
    .line 1141
    move/from16 v11, v20

    .line 1142
    .line 1143
    goto :goto_15

    .line 1144
    :cond_24
    const/4 v11, 0x3

    .line 1145
    :goto_15
    move/from16 v1, v20

    .line 1146
    .line 1147
    goto :goto_16

    .line 1148
    :cond_25
    move-object/from16 v24, v10

    .line 1149
    .line 1150
    goto :goto_15

    .line 1151
    :goto_16
    if-eq v11, v1, :cond_27

    .line 1152
    .line 1153
    invoke-virtual {v7, v9}, LC6/l;->z(I)V

    .line 1154
    .line 1155
    .line 1156
    const/4 v1, 0x3

    .line 1157
    if-ne v11, v1, :cond_26

    .line 1158
    .line 1159
    sget-object v0, Lr9/y;->c:Lr9/y;

    .line 1160
    .line 1161
    goto :goto_17

    .line 1162
    :cond_26
    sget-object v0, Lr9/y;->b:Lr9/y;

    .line 1163
    .line 1164
    :goto_17
    iget-object v1, v7, LC6/l;->e:Ljava/lang/Object;

    .line 1165
    .line 1166
    check-cast v1, Ljava/util/HashMap;

    .line 1167
    .line 1168
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1169
    .line 1170
    .line 1171
    move-result-object v4

    .line 1172
    invoke-virtual {v1, v4, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1173
    .line 1174
    .line 1175
    :cond_27
    sget-object v0, Lv9/v;->b:Lv9/v;

    .line 1176
    .line 1177
    iget-object v1, v2, Ls9/f;->a:Ljava/lang/String;

    .line 1178
    .line 1179
    if-nez v24, :cond_28

    .line 1180
    .line 1181
    goto :goto_18

    .line 1182
    :cond_28
    invoke-virtual/range {v24 .. v24}, Lka/u;->b()Lka/r;

    .line 1183
    .line 1184
    .line 1185
    move-result-object v4

    .line 1186
    invoke-virtual {v4}, Lka/r;->b()Lcom/google/protobuf/ByteString;

    .line 1187
    .line 1188
    .line 1189
    move-result-object v4

    .line 1190
    invoke-virtual {v4}, Lcom/google/protobuf/ByteString;->size()I

    .line 1191
    .line 1192
    .line 1193
    invoke-virtual/range {v24 .. v24}, Lka/u;->b()Lka/r;

    .line 1194
    .line 1195
    .line 1196
    move-result-object v4

    .line 1197
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1198
    .line 1199
    .line 1200
    :goto_18
    if-eqz v1, :cond_2b

    .line 1201
    .line 1202
    iget-object v1, v2, Ls9/f;->b:Ljava/lang/String;

    .line 1203
    .line 1204
    if-eqz v1, :cond_2a

    .line 1205
    .line 1206
    iget-object v0, v0, Lv9/v;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 1207
    .line 1208
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 1209
    .line 1210
    .line 1211
    move-result-object v0

    .line 1212
    :goto_19
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1213
    .line 1214
    .line 1215
    move-result v1

    .line 1216
    if-eqz v1, :cond_3c

    .line 1217
    .line 1218
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1219
    .line 1220
    .line 1221
    move-result-object v1

    .line 1222
    check-cast v1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 1223
    .line 1224
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 1225
    .line 1226
    .line 1227
    move-result-object v1

    .line 1228
    if-nez v1, :cond_29

    .line 1229
    .line 1230
    goto :goto_19

    .line 1231
    :cond_29
    new-instance v0, Ljava/lang/ClassCastException;

    .line 1232
    .line 1233
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 1234
    .line 1235
    .line 1236
    throw v0

    .line 1237
    :cond_2a
    new-instance v0, Ljava/lang/NullPointerException;

    .line 1238
    .line 1239
    const-string v1, "Null databaseId"

    .line 1240
    .line 1241
    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 1242
    .line 1243
    .line 1244
    throw v0

    .line 1245
    :cond_2b
    new-instance v0, Ljava/lang/NullPointerException;

    .line 1246
    .line 1247
    const-string v1, "Null projectId"

    .line 1248
    .line 1249
    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 1250
    .line 1251
    .line 1252
    throw v0

    .line 1253
    :cond_2c
    const-string v1, "Expected watchChange to be an instance of WatchTargetChange"

    .line 1254
    .line 1255
    const/4 v5, 0x0

    .line 1256
    new-array v2, v5, [Ljava/lang/Object;

    .line 1257
    .line 1258
    invoke-static {v0, v1, v2}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 1259
    .line 1260
    .line 1261
    iget-object v0, v6, LE5/n0;->l:Ljava/lang/Object;

    .line 1262
    .line 1263
    check-cast v0, LC6/l;

    .line 1264
    .line 1265
    check-cast v13, Lv9/y;

    .line 1266
    .line 1267
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1268
    .line 1269
    .line 1270
    iget-object v1, v13, Lv9/y;->d:Lcom/google/protobuf/Internal$IntList;

    .line 1271
    .line 1272
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 1273
    .line 1274
    .line 1275
    move-result v2

    .line 1276
    iget-object v4, v0, LC6/l;->b:Ljava/lang/Object;

    .line 1277
    .line 1278
    check-cast v4, Ljava/util/HashMap;

    .line 1279
    .line 1280
    if-nez v2, :cond_2d

    .line 1281
    .line 1282
    goto :goto_1b

    .line 1283
    :cond_2d
    new-instance v1, Ljava/util/ArrayList;

    .line 1284
    .line 1285
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 1286
    .line 1287
    .line 1288
    invoke-virtual {v4}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 1289
    .line 1290
    .line 1291
    move-result-object v2

    .line 1292
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 1293
    .line 1294
    .line 1295
    move-result-object v2

    .line 1296
    :cond_2e
    :goto_1a
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1297
    .line 1298
    .line 1299
    move-result v5

    .line 1300
    if-eqz v5, :cond_2f

    .line 1301
    .line 1302
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1303
    .line 1304
    .line 1305
    move-result-object v5

    .line 1306
    check-cast v5, Ljava/lang/Integer;

    .line 1307
    .line 1308
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 1309
    .line 1310
    .line 1311
    move-result v7

    .line 1312
    invoke-virtual {v0, v7}, LC6/l;->u(I)Z

    .line 1313
    .line 1314
    .line 1315
    move-result v7

    .line 1316
    if-eqz v7, :cond_2e

    .line 1317
    .line 1318
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1319
    .line 1320
    .line 1321
    goto :goto_1a

    .line 1322
    :cond_2f
    :goto_1b
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 1323
    .line 1324
    .line 1325
    move-result-object v1

    .line 1326
    :goto_1c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1327
    .line 1328
    .line 1329
    move-result v2

    .line 1330
    if-eqz v2, :cond_3c

    .line 1331
    .line 1332
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1333
    .line 1334
    .line 1335
    move-result-object v2

    .line 1336
    check-cast v2, Ljava/lang/Integer;

    .line 1337
    .line 1338
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 1339
    .line 1340
    .line 1341
    move-result v5

    .line 1342
    invoke-virtual {v0, v5}, LC6/l;->o(I)Lv9/u;

    .line 1343
    .line 1344
    .line 1345
    move-result-object v7

    .line 1346
    iget-object v9, v13, Lv9/y;->c:Lv9/z;

    .line 1347
    .line 1348
    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    .line 1349
    .line 1350
    .line 1351
    move-result v10

    .line 1352
    iget-object v15, v13, Lv9/y;->e:Lcom/google/protobuf/ByteString;

    .line 1353
    .line 1354
    if-eqz v10, :cond_3a

    .line 1355
    .line 1356
    const/4 v12, 0x1

    .line 1357
    if-eq v10, v12, :cond_37

    .line 1358
    .line 1359
    if-eq v10, v11, :cond_34

    .line 1360
    .line 1361
    const/4 v11, 0x3

    .line 1362
    if-eq v10, v11, :cond_32

    .line 1363
    .line 1364
    const/4 v2, 0x4

    .line 1365
    if-ne v10, v2, :cond_31

    .line 1366
    .line 1367
    invoke-virtual {v0, v5}, LC6/l;->u(I)Z

    .line 1368
    .line 1369
    .line 1370
    move-result v9

    .line 1371
    if-eqz v9, :cond_30

    .line 1372
    .line 1373
    invoke-virtual {v0, v5}, LC6/l;->z(I)V

    .line 1374
    .line 1375
    .line 1376
    invoke-virtual {v15}, Lcom/google/protobuf/ByteString;->isEmpty()Z

    .line 1377
    .line 1378
    .line 1379
    move-result v5

    .line 1380
    if-nez v5, :cond_30

    .line 1381
    .line 1382
    iput-boolean v12, v7, Lv9/u;->c:Z

    .line 1383
    .line 1384
    iput-object v15, v7, Lv9/u;->d:Lcom/google/protobuf/ByteString;

    .line 1385
    .line 1386
    :cond_30
    move/from16 v16, v2

    .line 1387
    .line 1388
    const/16 v18, 0x0

    .line 1389
    .line 1390
    goto/16 :goto_20

    .line 1391
    .line 1392
    :cond_31
    new-array v0, v12, [Ljava/lang/Object;

    .line 1393
    .line 1394
    const/16 v22, 0x0

    .line 1395
    .line 1396
    aput-object v9, v0, v22

    .line 1397
    .line 1398
    const-string v1, "Unknown target watch change state: %s"

    .line 1399
    .line 1400
    invoke-static {v1, v0}, LA6/c;->s(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1401
    .line 1402
    .line 1403
    const/16 v18, 0x0

    .line 1404
    .line 1405
    throw v18

    .line 1406
    :cond_32
    const/4 v2, 0x4

    .line 1407
    const/16 v18, 0x0

    .line 1408
    .line 1409
    invoke-virtual {v0, v5}, LC6/l;->u(I)Z

    .line 1410
    .line 1411
    .line 1412
    move-result v5

    .line 1413
    if-eqz v5, :cond_33

    .line 1414
    .line 1415
    iput-boolean v12, v7, Lv9/u;->c:Z

    .line 1416
    .line 1417
    iput-boolean v12, v7, Lv9/u;->e:Z

    .line 1418
    .line 1419
    invoke-virtual {v15}, Lcom/google/protobuf/ByteString;->isEmpty()Z

    .line 1420
    .line 1421
    .line 1422
    move-result v5

    .line 1423
    if-nez v5, :cond_33

    .line 1424
    .line 1425
    iput-boolean v12, v7, Lv9/u;->c:Z

    .line 1426
    .line 1427
    iput-object v15, v7, Lv9/u;->d:Lcom/google/protobuf/ByteString;

    .line 1428
    .line 1429
    :cond_33
    move/from16 v16, v2

    .line 1430
    .line 1431
    goto :goto_20

    .line 1432
    :cond_34
    const/4 v11, 0x3

    .line 1433
    const/16 v16, 0x4

    .line 1434
    .line 1435
    const/16 v18, 0x0

    .line 1436
    .line 1437
    iget v5, v7, Lv9/u;->a:I

    .line 1438
    .line 1439
    sub-int/2addr v5, v12

    .line 1440
    iput v5, v7, Lv9/u;->a:I

    .line 1441
    .line 1442
    if-eqz v5, :cond_35

    .line 1443
    .line 1444
    goto :goto_1d

    .line 1445
    :cond_35
    invoke-virtual {v4, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1446
    .line 1447
    .line 1448
    :goto_1d
    iget-object v2, v13, Lv9/y;->f:Lmd/k0;

    .line 1449
    .line 1450
    if-nez v2, :cond_36

    .line 1451
    .line 1452
    const/4 v2, 0x1

    .line 1453
    goto :goto_1e

    .line 1454
    :cond_36
    const/4 v2, 0x0

    .line 1455
    :goto_1e
    const-string v5, "WatchChangeAggregator does not handle errored targets"

    .line 1456
    .line 1457
    const/4 v9, 0x0

    .line 1458
    new-array v7, v9, [Ljava/lang/Object;

    .line 1459
    .line 1460
    invoke-static {v2, v5, v7}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 1461
    .line 1462
    .line 1463
    goto :goto_20

    .line 1464
    :cond_37
    const/4 v9, 0x0

    .line 1465
    const/4 v11, 0x3

    .line 1466
    const/16 v16, 0x4

    .line 1467
    .line 1468
    const/16 v18, 0x0

    .line 1469
    .line 1470
    iget v2, v7, Lv9/u;->a:I

    .line 1471
    .line 1472
    const/16 v20, 0x1

    .line 1473
    .line 1474
    add-int/lit8 v2, v2, -0x1

    .line 1475
    .line 1476
    iput v2, v7, Lv9/u;->a:I

    .line 1477
    .line 1478
    if-eqz v2, :cond_38

    .line 1479
    .line 1480
    goto :goto_1f

    .line 1481
    :cond_38
    iput-boolean v9, v7, Lv9/u;->c:Z

    .line 1482
    .line 1483
    iget-object v2, v7, Lv9/u;->b:Ljava/util/HashMap;

    .line 1484
    .line 1485
    invoke-virtual {v2}, Ljava/util/HashMap;->clear()V

    .line 1486
    .line 1487
    .line 1488
    :goto_1f
    invoke-virtual {v15}, Lcom/google/protobuf/ByteString;->isEmpty()Z

    .line 1489
    .line 1490
    .line 1491
    move-result v2

    .line 1492
    if-nez v2, :cond_39

    .line 1493
    .line 1494
    const/4 v12, 0x1

    .line 1495
    iput-boolean v12, v7, Lv9/u;->c:Z

    .line 1496
    .line 1497
    iput-object v15, v7, Lv9/u;->d:Lcom/google/protobuf/ByteString;

    .line 1498
    .line 1499
    goto :goto_20

    .line 1500
    :cond_39
    const/4 v12, 0x1

    .line 1501
    goto :goto_20

    .line 1502
    :cond_3a
    move/from16 v16, v12

    .line 1503
    .line 1504
    const/4 v11, 0x3

    .line 1505
    const/4 v12, 0x1

    .line 1506
    const/16 v18, 0x0

    .line 1507
    .line 1508
    invoke-virtual {v0, v5}, LC6/l;->u(I)Z

    .line 1509
    .line 1510
    .line 1511
    move-result v2

    .line 1512
    if-eqz v2, :cond_3b

    .line 1513
    .line 1514
    invoke-virtual {v15}, Lcom/google/protobuf/ByteString;->isEmpty()Z

    .line 1515
    .line 1516
    .line 1517
    move-result v2

    .line 1518
    if-nez v2, :cond_3b

    .line 1519
    .line 1520
    iput-boolean v12, v7, Lv9/u;->c:Z

    .line 1521
    .line 1522
    iput-object v15, v7, Lv9/u;->d:Lcom/google/protobuf/ByteString;

    .line 1523
    .line 1524
    :cond_3b
    :goto_20
    move/from16 v12, v16

    .line 1525
    .line 1526
    const/4 v11, 0x2

    .line 1527
    goto/16 :goto_1c

    .line 1528
    .line 1529
    :cond_3c
    :goto_21
    sget-object v0, Ls9/o;->b:Ls9/o;

    .line 1530
    .line 1531
    invoke-virtual {v3, v0}, Ls9/o;->equals(Ljava/lang/Object;)Z

    .line 1532
    .line 1533
    .line 1534
    move-result v1

    .line 1535
    if-nez v1, :cond_48

    .line 1536
    .line 1537
    iget-object v1, v6, LE5/n0;->c:Ljava/lang/Object;

    .line 1538
    .line 1539
    check-cast v1, Lr9/l;

    .line 1540
    .line 1541
    iget-object v1, v1, Lr9/l;->i:Lr9/Q;

    .line 1542
    .line 1543
    invoke-interface {v1}, Lr9/Q;->i()Ls9/o;

    .line 1544
    .line 1545
    .line 1546
    move-result-object v1

    .line 1547
    invoke-virtual {v3, v1}, Ls9/o;->a(Ls9/o;)I

    .line 1548
    .line 1549
    .line 1550
    move-result v1

    .line 1551
    if-ltz v1, :cond_48

    .line 1552
    .line 1553
    invoke-virtual {v3, v0}, Ls9/o;->equals(Ljava/lang/Object;)Z

    .line 1554
    .line 1555
    .line 1556
    move-result v0

    .line 1557
    const/16 v20, 0x1

    .line 1558
    .line 1559
    xor-int/lit8 v0, v0, 0x1

    .line 1560
    .line 1561
    const/4 v5, 0x0

    .line 1562
    new-array v1, v5, [Ljava/lang/Object;

    .line 1563
    .line 1564
    const-string v2, "Can\'t raise event for unknown SnapshotVersion"

    .line 1565
    .line 1566
    invoke-static {v0, v2, v1}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 1567
    .line 1568
    .line 1569
    iget-object v0, v6, LE5/n0;->l:Ljava/lang/Object;

    .line 1570
    .line 1571
    check-cast v0, LC6/l;

    .line 1572
    .line 1573
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1574
    .line 1575
    .line 1576
    new-instance v1, Ljava/util/HashMap;

    .line 1577
    .line 1578
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 1579
    .line 1580
    .line 1581
    iget-object v2, v0, LC6/l;->b:Ljava/lang/Object;

    .line 1582
    .line 1583
    check-cast v2, Ljava/util/HashMap;

    .line 1584
    .line 1585
    invoke-virtual {v2}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 1586
    .line 1587
    .line 1588
    move-result-object v2

    .line 1589
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 1590
    .line 1591
    .line 1592
    move-result-object v2

    .line 1593
    :goto_22
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1594
    .line 1595
    .line 1596
    move-result v4

    .line 1597
    if-eqz v4, :cond_3f

    .line 1598
    .line 1599
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1600
    .line 1601
    .line 1602
    move-result-object v4

    .line 1603
    check-cast v4, Ljava/util/Map$Entry;

    .line 1604
    .line 1605
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 1606
    .line 1607
    .line 1608
    move-result-object v5

    .line 1609
    check-cast v5, Ljava/lang/Integer;

    .line 1610
    .line 1611
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 1612
    .line 1613
    .line 1614
    move-result v7

    .line 1615
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 1616
    .line 1617
    .line 1618
    move-result-object v4

    .line 1619
    check-cast v4, Lv9/u;

    .line 1620
    .line 1621
    invoke-virtual {v0, v7}, LC6/l;->x(I)Lr9/S;

    .line 1622
    .line 1623
    .line 1624
    move-result-object v9

    .line 1625
    if-eqz v9, :cond_3e

    .line 1626
    .line 1627
    iget-boolean v10, v4, Lv9/u;->e:Z

    .line 1628
    .line 1629
    if-eqz v10, :cond_3d

    .line 1630
    .line 1631
    iget-object v9, v9, Lr9/S;->a:Lp9/A;

    .line 1632
    .line 1633
    invoke-virtual {v9}, Lp9/A;->e()Z

    .line 1634
    .line 1635
    .line 1636
    move-result v10

    .line 1637
    if-eqz v10, :cond_3d

    .line 1638
    .line 1639
    new-instance v10, Ls9/h;

    .line 1640
    .line 1641
    iget-object v9, v9, Lp9/A;->d:Ls9/m;

    .line 1642
    .line 1643
    invoke-direct {v10, v9}, Ls9/h;-><init>(Ls9/m;)V

    .line 1644
    .line 1645
    .line 1646
    iget-object v9, v0, LC6/l;->c:Ljava/lang/Object;

    .line 1647
    .line 1648
    check-cast v9, Ljava/util/HashMap;

    .line 1649
    .line 1650
    invoke-virtual {v9, v10}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1651
    .line 1652
    .line 1653
    move-result-object v9

    .line 1654
    if-nez v9, :cond_3d

    .line 1655
    .line 1656
    iget-object v9, v0, LC6/l;->a:Ljava/lang/Object;

    .line 1657
    .line 1658
    check-cast v9, LE5/n0;

    .line 1659
    .line 1660
    iget-object v9, v9, LE5/n0;->b:Ljava/lang/Object;

    .line 1661
    .line 1662
    check-cast v9, Lad/L;

    .line 1663
    .line 1664
    invoke-virtual {v9, v7}, Lad/L;->p(I)Lc9/d;

    .line 1665
    .line 1666
    .line 1667
    move-result-object v9

    .line 1668
    iget-object v9, v9, Lc9/d;->a:Lc9/c;

    .line 1669
    .line 1670
    invoke-virtual {v9, v10}, Lc9/c;->a(Ljava/lang/Object;)Z

    .line 1671
    .line 1672
    .line 1673
    move-result v9

    .line 1674
    if-nez v9, :cond_3d

    .line 1675
    .line 1676
    invoke-static {v10, v3}, Ls9/k;->h(Ls9/h;Ls9/o;)Ls9/k;

    .line 1677
    .line 1678
    .line 1679
    move-result-object v9

    .line 1680
    invoke-virtual {v0, v7, v10, v9}, LC6/l;->y(ILs9/h;Ls9/k;)V

    .line 1681
    .line 1682
    .line 1683
    :cond_3d
    iget-boolean v7, v4, Lv9/u;->c:Z

    .line 1684
    .line 1685
    if-eqz v7, :cond_3e

    .line 1686
    .line 1687
    invoke-virtual {v4}, Lv9/u;->a()Lv9/t;

    .line 1688
    .line 1689
    .line 1690
    move-result-object v7

    .line 1691
    invoke-virtual {v1, v5, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1692
    .line 1693
    .line 1694
    const/4 v5, 0x0

    .line 1695
    iput-boolean v5, v4, Lv9/u;->c:Z

    .line 1696
    .line 1697
    iget-object v4, v4, Lv9/u;->b:Ljava/util/HashMap;

    .line 1698
    .line 1699
    invoke-virtual {v4}, Ljava/util/HashMap;->clear()V

    .line 1700
    .line 1701
    .line 1702
    goto :goto_22

    .line 1703
    :cond_3e
    const/4 v5, 0x0

    .line 1704
    goto :goto_22

    .line 1705
    :cond_3f
    new-instance v2, Ljava/util/HashSet;

    .line 1706
    .line 1707
    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 1708
    .line 1709
    .line 1710
    iget-object v4, v0, LC6/l;->d:Ljava/lang/Object;

    .line 1711
    .line 1712
    check-cast v4, Ljava/util/HashMap;

    .line 1713
    .line 1714
    invoke-virtual {v4}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 1715
    .line 1716
    .line 1717
    move-result-object v4

    .line 1718
    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 1719
    .line 1720
    .line 1721
    move-result-object v4

    .line 1722
    :goto_23
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1723
    .line 1724
    .line 1725
    move-result v5

    .line 1726
    if-eqz v5, :cond_42

    .line 1727
    .line 1728
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1729
    .line 1730
    .line 1731
    move-result-object v5

    .line 1732
    check-cast v5, Ljava/util/Map$Entry;

    .line 1733
    .line 1734
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 1735
    .line 1736
    .line 1737
    move-result-object v7

    .line 1738
    check-cast v7, Ls9/h;

    .line 1739
    .line 1740
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 1741
    .line 1742
    .line 1743
    move-result-object v5

    .line 1744
    check-cast v5, Ljava/util/Set;

    .line 1745
    .line 1746
    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 1747
    .line 1748
    .line 1749
    move-result-object v5

    .line 1750
    :cond_40
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 1751
    .line 1752
    .line 1753
    move-result v9

    .line 1754
    if-eqz v9, :cond_41

    .line 1755
    .line 1756
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1757
    .line 1758
    .line 1759
    move-result-object v9

    .line 1760
    check-cast v9, Ljava/lang/Integer;

    .line 1761
    .line 1762
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 1763
    .line 1764
    .line 1765
    move-result v9

    .line 1766
    invoke-virtual {v0, v9}, LC6/l;->x(I)Lr9/S;

    .line 1767
    .line 1768
    .line 1769
    move-result-object v9

    .line 1770
    if-eqz v9, :cond_40

    .line 1771
    .line 1772
    sget-object v10, Lr9/y;->d:Lr9/y;

    .line 1773
    .line 1774
    iget-object v9, v9, Lr9/S;->d:Lr9/y;

    .line 1775
    .line 1776
    invoke-virtual {v9, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1777
    .line 1778
    .line 1779
    move-result v9

    .line 1780
    if-nez v9, :cond_40

    .line 1781
    .line 1782
    goto :goto_23

    .line 1783
    :cond_41
    invoke-virtual {v2, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1784
    .line 1785
    .line 1786
    goto :goto_23

    .line 1787
    :cond_42
    iget-object v4, v0, LC6/l;->c:Ljava/lang/Object;

    .line 1788
    .line 1789
    check-cast v4, Ljava/util/HashMap;

    .line 1790
    .line 1791
    invoke-virtual {v4}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 1792
    .line 1793
    .line 1794
    move-result-object v4

    .line 1795
    invoke-interface {v4}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 1796
    .line 1797
    .line 1798
    move-result-object v4

    .line 1799
    :goto_24
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1800
    .line 1801
    .line 1802
    move-result v5

    .line 1803
    if-eqz v5, :cond_43

    .line 1804
    .line 1805
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1806
    .line 1807
    .line 1808
    move-result-object v5

    .line 1809
    check-cast v5, Ls9/k;

    .line 1810
    .line 1811
    iput-object v3, v5, Ls9/k;->d:Ls9/o;

    .line 1812
    .line 1813
    goto :goto_24

    .line 1814
    :cond_43
    new-instance v19, LC8/i;

    .line 1815
    .line 1816
    invoke-static {v1}, Lj$/util/DesugarCollections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 1817
    .line 1818
    .line 1819
    move-result-object v21

    .line 1820
    iget-object v1, v0, LC6/l;->e:Ljava/lang/Object;

    .line 1821
    .line 1822
    check-cast v1, Ljava/util/HashMap;

    .line 1823
    .line 1824
    invoke-static {v1}, Lj$/util/DesugarCollections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 1825
    .line 1826
    .line 1827
    move-result-object v22

    .line 1828
    iget-object v1, v0, LC6/l;->c:Ljava/lang/Object;

    .line 1829
    .line 1830
    check-cast v1, Ljava/util/HashMap;

    .line 1831
    .line 1832
    invoke-static {v1}, Lj$/util/DesugarCollections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 1833
    .line 1834
    .line 1835
    move-result-object v23

    .line 1836
    invoke-static {v2}, Lj$/util/DesugarCollections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    .line 1837
    .line 1838
    .line 1839
    move-result-object v24

    .line 1840
    const/16 v25, 0x14

    .line 1841
    .line 1842
    move-object/from16 v20, v3

    .line 1843
    .line 1844
    invoke-direct/range {v19 .. v25}, LC8/i;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 1845
    .line 1846
    .line 1847
    move-object/from16 v2, v19

    .line 1848
    .line 1849
    move-object/from16 v1, v20

    .line 1850
    .line 1851
    new-instance v3, Ljava/util/HashMap;

    .line 1852
    .line 1853
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 1854
    .line 1855
    .line 1856
    iput-object v3, v0, LC6/l;->c:Ljava/lang/Object;

    .line 1857
    .line 1858
    new-instance v3, Ljava/util/HashMap;

    .line 1859
    .line 1860
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 1861
    .line 1862
    .line 1863
    iput-object v3, v0, LC6/l;->d:Ljava/lang/Object;

    .line 1864
    .line 1865
    new-instance v3, Ljava/util/HashMap;

    .line 1866
    .line 1867
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 1868
    .line 1869
    .line 1870
    iput-object v3, v0, LC6/l;->e:Ljava/lang/Object;

    .line 1871
    .line 1872
    invoke-interface/range {v21 .. v21}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 1873
    .line 1874
    .line 1875
    move-result-object v0

    .line 1876
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 1877
    .line 1878
    .line 1879
    move-result-object v0

    .line 1880
    :cond_44
    :goto_25
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1881
    .line 1882
    .line 1883
    move-result v3

    .line 1884
    if-eqz v3, :cond_45

    .line 1885
    .line 1886
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1887
    .line 1888
    .line 1889
    move-result-object v3

    .line 1890
    check-cast v3, Ljava/util/Map$Entry;

    .line 1891
    .line 1892
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 1893
    .line 1894
    .line 1895
    move-result-object v4

    .line 1896
    check-cast v4, Lv9/t;

    .line 1897
    .line 1898
    iget-object v5, v4, Lv9/t;->a:Lcom/google/protobuf/ByteString;

    .line 1899
    .line 1900
    invoke-virtual {v5}, Lcom/google/protobuf/ByteString;->isEmpty()Z

    .line 1901
    .line 1902
    .line 1903
    move-result v5

    .line 1904
    if-nez v5, :cond_44

    .line 1905
    .line 1906
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 1907
    .line 1908
    .line 1909
    move-result-object v3

    .line 1910
    check-cast v3, Ljava/lang/Integer;

    .line 1911
    .line 1912
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1913
    .line 1914
    .line 1915
    invoke-virtual {v8, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1916
    .line 1917
    .line 1918
    move-result-object v5

    .line 1919
    check-cast v5, Lr9/S;

    .line 1920
    .line 1921
    if-eqz v5, :cond_44

    .line 1922
    .line 1923
    iget-object v4, v4, Lv9/t;->a:Lcom/google/protobuf/ByteString;

    .line 1924
    .line 1925
    invoke-virtual {v5, v4, v1}, Lr9/S;->a(Lcom/google/protobuf/ByteString;Ls9/o;)Lr9/S;

    .line 1926
    .line 1927
    .line 1928
    move-result-object v4

    .line 1929
    invoke-virtual {v8, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1930
    .line 1931
    .line 1932
    goto :goto_25

    .line 1933
    :cond_45
    iget-object v0, v2, LC8/i;->d:Ljava/lang/Object;

    .line 1934
    .line 1935
    check-cast v0, Ljava/util/Map;

    .line 1936
    .line 1937
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 1938
    .line 1939
    .line 1940
    move-result-object v0

    .line 1941
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 1942
    .line 1943
    .line 1944
    move-result-object v0

    .line 1945
    :cond_46
    :goto_26
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1946
    .line 1947
    .line 1948
    move-result v1

    .line 1949
    if-eqz v1, :cond_47

    .line 1950
    .line 1951
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1952
    .line 1953
    .line 1954
    move-result-object v1

    .line 1955
    check-cast v1, Ljava/util/Map$Entry;

    .line 1956
    .line 1957
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 1958
    .line 1959
    .line 1960
    move-result-object v3

    .line 1961
    check-cast v3, Ljava/lang/Integer;

    .line 1962
    .line 1963
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 1964
    .line 1965
    .line 1966
    move-result v4

    .line 1967
    invoke-virtual {v8, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1968
    .line 1969
    .line 1970
    move-result-object v5

    .line 1971
    check-cast v5, Lr9/S;

    .line 1972
    .line 1973
    if-eqz v5, :cond_46

    .line 1974
    .line 1975
    sget-object v7, Lcom/google/protobuf/ByteString;->EMPTY:Lcom/google/protobuf/ByteString;

    .line 1976
    .line 1977
    iget-object v9, v5, Lr9/S;->e:Ls9/o;

    .line 1978
    .line 1979
    invoke-virtual {v5, v7, v9}, Lr9/S;->a(Lcom/google/protobuf/ByteString;Ls9/o;)Lr9/S;

    .line 1980
    .line 1981
    .line 1982
    move-result-object v7

    .line 1983
    invoke-virtual {v8, v3, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1984
    .line 1985
    .line 1986
    invoke-virtual {v6, v4}, LE5/n0;->s(I)V

    .line 1987
    .line 1988
    .line 1989
    new-instance v15, Lr9/S;

    .line 1990
    .line 1991
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 1992
    .line 1993
    .line 1994
    move-result-object v1

    .line 1995
    move-object/from16 v20, v1

    .line 1996
    .line 1997
    check-cast v20, Lr9/y;

    .line 1998
    .line 1999
    iget-object v1, v5, Lr9/S;->a:Lp9/A;

    .line 2000
    .line 2001
    iget-wide v9, v5, Lr9/S;->c:J

    .line 2002
    .line 2003
    move-object/from16 v16, v1

    .line 2004
    .line 2005
    move/from16 v17, v4

    .line 2006
    .line 2007
    move-wide/from16 v18, v9

    .line 2008
    .line 2009
    invoke-direct/range {v15 .. v20}, Lr9/S;-><init>(Lp9/A;IJLr9/y;)V

    .line 2010
    .line 2011
    .line 2012
    invoke-virtual {v6, v15}, LE5/n0;->t(Lr9/S;)V

    .line 2013
    .line 2014
    .line 2015
    goto :goto_26

    .line 2016
    :cond_47
    invoke-virtual {v14}, Lp9/s;->e()Lp9/z;

    .line 2017
    .line 2018
    .line 2019
    move-result-object v0

    .line 2020
    invoke-virtual {v0, v2}, Lp9/z;->c(LC8/i;)V

    .line 2021
    .line 2022
    .line 2023
    :cond_48
    return-void
.end method
