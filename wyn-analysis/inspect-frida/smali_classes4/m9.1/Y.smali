.class public final Lm9/Y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Iterable;


# instance fields
.field public final a:Lm9/W;

.field public final b:Lp9/D;

.field public final c:Lcom/google/firebase/firestore/FirebaseFirestore;

.field public d:Ljava/util/List;

.field public e:I

.field public final f:Lm9/b0;


# direct methods
.method public constructor <init>(Lm9/W;Lp9/D;Lcom/google/firebase/firestore/FirebaseFirestore;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lm9/Y;->a:Lm9/W;

    .line 8
    .line 9
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iput-object p2, p0, Lm9/Y;->b:Lp9/D;

    .line 13
    .line 14
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iput-object p3, p0, Lm9/Y;->c:Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 18
    .line 19
    new-instance p1, Lm9/b0;

    .line 20
    .line 21
    iget-object p3, p2, Lp9/D;->f:Lc9/d;

    .line 22
    .line 23
    iget-object p3, p3, Lc9/d;->a:Lc9/c;

    .line 24
    .line 25
    invoke-virtual {p3}, Lc9/c;->isEmpty()Z

    .line 26
    .line 27
    .line 28
    move-result p3

    .line 29
    xor-int/lit8 p3, p3, 0x1

    .line 30
    .line 31
    iget-boolean p2, p2, Lp9/D;->e:Z

    .line 32
    .line 33
    invoke-direct {p1, p3, p2}, Lm9/b0;-><init>(ZZ)V

    .line 34
    .line 35
    .line 36
    iput-object p1, p0, Lm9/Y;->f:Lm9/b0;

    .line 37
    .line 38
    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x1

    .line 5
    invoke-static {v1, v2}, LA/f;->b(II)Z

    .line 6
    .line 7
    .line 8
    move-result v3

    .line 9
    iget-object v4, v0, Lm9/Y;->b:Lp9/D;

    .line 10
    .line 11
    if-eqz v3, :cond_1

    .line 12
    .line 13
    iget-boolean v3, v4, Lp9/D;->h:Z

    .line 14
    .line 15
    if-nez v3, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 19
    .line 20
    const-string v2, "To include metadata changes with your document changes, you must also pass MetadataChanges.INCLUDE to addSnapshotListener()."

    .line 21
    .line 22
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw v1

    .line 26
    :cond_1
    :goto_0
    iget-object v3, v0, Lm9/Y;->d:Ljava/util/List;

    .line 27
    .line 28
    if-eqz v3, :cond_2

    .line 29
    .line 30
    iget v3, v0, Lm9/Y;->e:I

    .line 31
    .line 32
    if-eq v3, v2, :cond_13

    .line 33
    .line 34
    :cond_2
    new-instance v3, Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 37
    .line 38
    .line 39
    iget-object v5, v4, Lp9/D;->c:Ls9/i;

    .line 40
    .line 41
    iget-object v5, v5, Ls9/i;->a:Lc9/c;

    .line 42
    .line 43
    invoke-virtual {v5}, Lc9/c;->isEmpty()Z

    .line 44
    .line 45
    .line 46
    move-result v5

    .line 47
    iget-object v6, v4, Lp9/D;->d:Ljava/util/ArrayList;

    .line 48
    .line 49
    const/4 v7, -0x1

    .line 50
    iget-object v9, v0, Lm9/Y;->c:Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 51
    .line 52
    const/4 v14, 0x0

    .line 53
    iget-object v15, v4, Lp9/D;->f:Lc9/d;

    .line 54
    .line 55
    iget-boolean v12, v4, Lp9/D;->e:Z

    .line 56
    .line 57
    if-eqz v5, :cond_6

    .line 58
    .line 59
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    const/4 v5, 0x0

    .line 64
    move v6, v14

    .line 65
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 66
    .line 67
    .line 68
    move-result v8

    .line 69
    if-eqz v8, :cond_12

    .line 70
    .line 71
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v8

    .line 75
    check-cast v8, Lp9/f;

    .line 76
    .line 77
    iget-object v11, v8, Lp9/f;->b:Ls9/k;

    .line 78
    .line 79
    iget-object v10, v11, Ls9/k;->a:Ls9/h;

    .line 80
    .line 81
    iget-object v13, v15, Lc9/d;->a:Lc9/c;

    .line 82
    .line 83
    invoke-virtual {v13, v10}, Lc9/c;->a(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v13

    .line 87
    move-object v10, v8

    .line 88
    new-instance v8, Lm9/X;

    .line 89
    .line 90
    move-object/from16 v16, v10

    .line 91
    .line 92
    iget-object v10, v11, Ls9/k;->a:Ls9/h;

    .line 93
    .line 94
    move-object/from16 v2, v16

    .line 95
    .line 96
    invoke-direct/range {v8 .. v13}, Lm9/o;-><init>(Lcom/google/firebase/firestore/FirebaseFirestore;Ls9/h;Ls9/k;ZZ)V

    .line 97
    .line 98
    .line 99
    sget-object v10, Lp9/e;->b:Lp9/e;

    .line 100
    .line 101
    iget-object v2, v2, Lp9/f;->a:Lp9/e;

    .line 102
    .line 103
    if-ne v2, v10, :cond_3

    .line 104
    .line 105
    const/4 v2, 0x1

    .line 106
    goto :goto_2

    .line 107
    :cond_3
    move v2, v14

    .line 108
    :goto_2
    const-string v10, "Invalid added event for first snapshot"

    .line 109
    .line 110
    new-array v13, v14, [Ljava/lang/Object;

    .line 111
    .line 112
    invoke-static {v2, v10, v13}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    if-eqz v5, :cond_5

    .line 116
    .line 117
    iget-object v2, v4, Lp9/D;->a:Lp9/u;

    .line 118
    .line 119
    invoke-virtual {v2}, Lp9/u;->a()LO7/d;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    invoke-virtual {v2, v5, v11}, LO7/d;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 124
    .line 125
    .line 126
    move-result v2

    .line 127
    if-gez v2, :cond_4

    .line 128
    .line 129
    goto :goto_3

    .line 130
    :cond_4
    move v2, v14

    .line 131
    goto :goto_4

    .line 132
    :cond_5
    :goto_3
    const/4 v2, 0x1

    .line 133
    :goto_4
    const-string v5, "Got added events in wrong order"

    .line 134
    .line 135
    new-array v10, v14, [Ljava/lang/Object;

    .line 136
    .line 137
    invoke-static {v2, v5, v10}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    new-instance v2, Lm9/i;

    .line 141
    .line 142
    add-int/lit8 v5, v6, 0x1

    .line 143
    .line 144
    const/4 v10, 0x1

    .line 145
    invoke-direct {v2, v8, v10, v7, v6}, Lm9/i;-><init>(Lm9/X;III)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move v6, v5

    .line 152
    move-object v5, v11

    .line 153
    const/4 v2, 0x1

    .line 154
    goto :goto_1

    .line 155
    :cond_6
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 156
    .line 157
    .line 158
    move-result-object v2

    .line 159
    iget-object v4, v4, Lp9/D;->c:Ls9/i;

    .line 160
    .line 161
    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 162
    .line 163
    .line 164
    move-result v5

    .line 165
    if-eqz v5, :cond_12

    .line 166
    .line 167
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v5

    .line 171
    check-cast v5, Lp9/f;

    .line 172
    .line 173
    iget-object v6, v5, Lp9/f;->a:Lp9/e;

    .line 174
    .line 175
    sget-object v8, Lp9/e;->d:Lp9/e;

    .line 176
    .line 177
    if-ne v6, v8, :cond_7

    .line 178
    .line 179
    goto :goto_5

    .line 180
    :cond_7
    iget-object v11, v5, Lp9/f;->b:Ls9/k;

    .line 181
    .line 182
    iget-object v6, v11, Ls9/k;->a:Ls9/h;

    .line 183
    .line 184
    iget-object v8, v15, Lc9/d;->a:Lc9/c;

    .line 185
    .line 186
    invoke-virtual {v8, v6}, Lc9/c;->a(Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    move-result v13

    .line 190
    new-instance v8, Lm9/X;

    .line 191
    .line 192
    iget-object v10, v11, Ls9/k;->a:Ls9/h;

    .line 193
    .line 194
    invoke-direct/range {v8 .. v13}, Lm9/o;-><init>(Lcom/google/firebase/firestore/FirebaseFirestore;Ls9/h;Ls9/k;ZZ)V

    .line 195
    .line 196
    .line 197
    iget-object v5, v5, Lp9/f;->a:Lp9/e;

    .line 198
    .line 199
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 200
    .line 201
    .line 202
    move-result v6

    .line 203
    const/4 v10, 0x3

    .line 204
    if-eqz v6, :cond_b

    .line 205
    .line 206
    const/4 v13, 0x1

    .line 207
    if-eq v6, v13, :cond_a

    .line 208
    .line 209
    if-eq v6, v1, :cond_9

    .line 210
    .line 211
    if-ne v6, v10, :cond_8

    .line 212
    .line 213
    goto :goto_6

    .line 214
    :cond_8
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 215
    .line 216
    new-instance v2, Ljava/lang/StringBuilder;

    .line 217
    .line 218
    const-string v3, "Unknown view change type: "

    .line 219
    .line 220
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 224
    .line 225
    .line 226
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v2

    .line 230
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    throw v1

    .line 234
    :cond_9
    :goto_6
    move v5, v1

    .line 235
    goto :goto_7

    .line 236
    :cond_a
    const/4 v5, 0x1

    .line 237
    goto :goto_7

    .line 238
    :cond_b
    move v5, v10

    .line 239
    :goto_7
    const-string v6, "Index for document not found"

    .line 240
    .line 241
    const/4 v13, 0x1

    .line 242
    if-eq v5, v13, :cond_e

    .line 243
    .line 244
    iget-object v13, v4, Ls9/i;->a:Lc9/c;

    .line 245
    .line 246
    iget-object v1, v11, Ls9/k;->a:Ls9/h;

    .line 247
    .line 248
    invoke-virtual {v13, v1}, Lc9/c;->b(Ls9/h;)Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object v13

    .line 252
    check-cast v13, Ls9/k;

    .line 253
    .line 254
    if-nez v13, :cond_c

    .line 255
    .line 256
    goto :goto_8

    .line 257
    :cond_c
    iget-object v7, v4, Ls9/i;->b:Lc9/d;

    .line 258
    .line 259
    iget-object v7, v7, Lc9/d;->a:Lc9/c;

    .line 260
    .line 261
    invoke-virtual {v7, v13}, Lc9/c;->f(Ls9/k;)I

    .line 262
    .line 263
    .line 264
    move-result v7

    .line 265
    :goto_8
    if-ltz v7, :cond_d

    .line 266
    .line 267
    const/4 v13, 0x1

    .line 268
    goto :goto_9

    .line 269
    :cond_d
    move v13, v14

    .line 270
    :goto_9
    new-array v10, v14, [Ljava/lang/Object;

    .line 271
    .line 272
    invoke-static {v13, v6, v10}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 273
    .line 274
    .line 275
    invoke-virtual {v4, v1}, Ls9/i;->a(Ls9/h;)Ls9/i;

    .line 276
    .line 277
    .line 278
    move-result-object v4

    .line 279
    const/4 v1, 0x3

    .line 280
    goto :goto_a

    .line 281
    :cond_e
    move v1, v10

    .line 282
    const/4 v7, -0x1

    .line 283
    :goto_a
    if-eq v5, v1, :cond_11

    .line 284
    .line 285
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 286
    .line 287
    .line 288
    iget-object v1, v11, Ls9/k;->a:Ls9/h;

    .line 289
    .line 290
    invoke-virtual {v4, v1}, Ls9/i;->a(Ls9/h;)Ls9/i;

    .line 291
    .line 292
    .line 293
    move-result-object v4

    .line 294
    iget-object v10, v4, Ls9/i;->a:Lc9/c;

    .line 295
    .line 296
    invoke-virtual {v10, v1, v11}, Lc9/c;->g(Ljava/lang/Object;Ljava/lang/Object;)Lc9/c;

    .line 297
    .line 298
    .line 299
    move-result-object v10

    .line 300
    iget-object v4, v4, Ls9/i;->b:Lc9/d;

    .line 301
    .line 302
    invoke-virtual {v4, v11}, Lc9/d;->a(Ljava/lang/Object;)Lc9/d;

    .line 303
    .line 304
    .line 305
    move-result-object v4

    .line 306
    new-instance v11, Ls9/i;

    .line 307
    .line 308
    invoke-direct {v11, v10, v4}, Ls9/i;-><init>(Lc9/c;Lc9/d;)V

    .line 309
    .line 310
    .line 311
    invoke-virtual {v10, v1}, Lc9/c;->b(Ls9/h;)Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object v1

    .line 315
    check-cast v1, Ls9/k;

    .line 316
    .line 317
    if-nez v1, :cond_f

    .line 318
    .line 319
    const/4 v1, -0x1

    .line 320
    goto :goto_b

    .line 321
    :cond_f
    iget-object v4, v4, Lc9/d;->a:Lc9/c;

    .line 322
    .line 323
    invoke-virtual {v4, v1}, Lc9/c;->f(Ls9/k;)I

    .line 324
    .line 325
    .line 326
    move-result v1

    .line 327
    :goto_b
    if-ltz v1, :cond_10

    .line 328
    .line 329
    const/4 v10, 0x1

    .line 330
    goto :goto_c

    .line 331
    :cond_10
    move v10, v14

    .line 332
    :goto_c
    new-array v4, v14, [Ljava/lang/Object;

    .line 333
    .line 334
    invoke-static {v10, v6, v4}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 335
    .line 336
    .line 337
    move-object v4, v11

    .line 338
    goto :goto_d

    .line 339
    :cond_11
    const/4 v1, -0x1

    .line 340
    :goto_d
    new-instance v6, Lm9/i;

    .line 341
    .line 342
    invoke-direct {v6, v8, v5, v7, v1}, Lm9/i;-><init>(Lm9/X;III)V

    .line 343
    .line 344
    .line 345
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 346
    .line 347
    .line 348
    const/4 v1, 0x2

    .line 349
    const/4 v7, -0x1

    .line 350
    goto/16 :goto_5

    .line 351
    .line 352
    :cond_12
    invoke-static {v3}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 353
    .line 354
    .line 355
    move-result-object v1

    .line 356
    iput-object v1, v0, Lm9/Y;->d:Ljava/util/List;

    .line 357
    .line 358
    const/4 v13, 0x1

    .line 359
    iput v13, v0, Lm9/Y;->e:I

    .line 360
    .line 361
    :cond_13
    iget-object v1, v0, Lm9/Y;->d:Ljava/util/List;

    .line 362
    .line 363
    return-object v1
.end method

.method public final b()Ljava/util/ArrayList;
    .locals 10

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    iget-object v1, p0, Lm9/Y;->b:Lp9/D;

    .line 4
    .line 5
    iget-object v2, v1, Lp9/D;->b:Ls9/i;

    .line 6
    .line 7
    iget-object v2, v2, Ls9/i;->a:Lc9/c;

    .line 8
    .line 9
    invoke-virtual {v2}, Lc9/c;->size()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 14
    .line 15
    .line 16
    iget-object v2, v1, Lp9/D;->b:Ls9/i;

    .line 17
    .line 18
    iget-object v2, v2, Ls9/i;->b:Lc9/d;

    .line 19
    .line 20
    invoke-virtual {v2}, Lc9/d;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    :goto_0
    move-object v3, v2

    .line 25
    check-cast v3, LA7/v;

    .line 26
    .line 27
    iget-object v4, v3, LA7/v;->b:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v4, Ljava/util/Iterator;

    .line 30
    .line 31
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    if-eqz v4, :cond_0

    .line 36
    .line 37
    invoke-virtual {v3}, LA7/v;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    move-object v7, v3

    .line 42
    check-cast v7, Ls9/k;

    .line 43
    .line 44
    iget-boolean v8, v1, Lp9/D;->e:Z

    .line 45
    .line 46
    iget-object v3, v7, Ls9/k;->a:Ls9/h;

    .line 47
    .line 48
    iget-object v4, v1, Lp9/D;->f:Lc9/d;

    .line 49
    .line 50
    iget-object v4, v4, Lc9/d;->a:Lc9/c;

    .line 51
    .line 52
    invoke-virtual {v4, v3}, Lc9/c;->a(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v9

    .line 56
    new-instance v4, Lm9/X;

    .line 57
    .line 58
    iget-object v5, p0, Lm9/Y;->c:Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 59
    .line 60
    iget-object v6, v7, Ls9/k;->a:Ls9/h;

    .line 61
    .line 62
    invoke-direct/range {v4 .. v9}, Lm9/o;-><init>(Lcom/google/firebase/firestore/FirebaseFirestore;Ls9/h;Ls9/k;ZZ)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_0
    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lm9/Y;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lm9/Y;

    .line 12
    .line 13
    iget-object v1, p1, Lm9/Y;->c:Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 14
    .line 15
    iget-object v3, p0, Lm9/Y;->c:Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 16
    .line 17
    invoke-virtual {v3, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_2

    .line 22
    .line 23
    iget-object v1, p0, Lm9/Y;->a:Lm9/W;

    .line 24
    .line 25
    iget-object v3, p1, Lm9/Y;->a:Lm9/W;

    .line 26
    .line 27
    invoke-virtual {v1, v3}, Lm9/W;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    iget-object v1, p0, Lm9/Y;->b:Lp9/D;

    .line 34
    .line 35
    iget-object v3, p1, Lm9/Y;->b:Lp9/D;

    .line 36
    .line 37
    invoke-virtual {v1, v3}, Lp9/D;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_2

    .line 42
    .line 43
    iget-object v1, p0, Lm9/Y;->f:Lm9/b0;

    .line 44
    .line 45
    iget-object p1, p1, Lm9/Y;->f:Lm9/b0;

    .line 46
    .line 47
    invoke-virtual {v1, p1}, Lm9/b0;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    if-eqz p1, :cond_2

    .line 52
    .line 53
    return v0

    .line 54
    :cond_2
    return v2
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Lm9/Y;->c:Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object v1, p0, Lm9/Y;->a:Lm9/W;

    .line 10
    .line 11
    invoke-virtual {v1}, Lm9/W;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/2addr v1, v0

    .line 16
    mul-int/lit8 v1, v1, 0x1f

    .line 17
    .line 18
    iget-object v0, p0, Lm9/Y;->b:Lp9/D;

    .line 19
    .line 20
    invoke-virtual {v0}, Lp9/D;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    add-int/2addr v0, v1

    .line 25
    mul-int/lit8 v0, v0, 0x1f

    .line 26
    .line 27
    iget-object v1, p0, Lm9/Y;->f:Lm9/b0;

    .line 28
    .line 29
    invoke-virtual {v1}, Lm9/b0;->hashCode()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    add-int/2addr v1, v0

    .line 34
    return v1
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 2

    .line 1
    new-instance v0, Lcom/google/protobuf/A1;

    .line 2
    .line 3
    iget-object v1, p0, Lm9/Y;->b:Lp9/D;

    .line 4
    .line 5
    iget-object v1, v1, Lp9/D;->b:Ls9/i;

    .line 6
    .line 7
    iget-object v1, v1, Ls9/i;->b:Lc9/d;

    .line 8
    .line 9
    invoke-virtual {v1}, Lc9/d;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, LA7/v;

    .line 14
    .line 15
    invoke-direct {v0, p0, v1}, Lcom/google/protobuf/A1;-><init>(Lm9/Y;LA7/v;)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method
