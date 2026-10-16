.class public final Lk3/k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/lang/Class;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/util/ArrayList;

.field public final e:Ljava/util/ArrayList;

.field public final f:Ljava/util/ArrayList;

.field public g:Ljava/util/concurrent/Executor;

.field public h:Ljava/util/concurrent/Executor;

.field public i:LK3/l;

.field public j:Z

.field public final k:I

.field public l:Z

.field public m:Z

.field public final n:J

.field public final o:Lh4/m;

.field public final p:Ljava/util/LinkedHashSet;

.field public q:Ljava/util/HashSet;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lk3/k;->a:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, Lk3/k;->b:Ljava/lang/Class;

    .line 7
    .line 8
    iput-object p3, p0, Lk3/k;->c:Ljava/lang/String;

    .line 9
    .line 10
    new-instance p1, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lk3/k;->d:Ljava/util/ArrayList;

    .line 16
    .line 17
    new-instance p1, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Lk3/k;->e:Ljava/util/ArrayList;

    .line 23
    .line 24
    new-instance p1, Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, Lk3/k;->f:Ljava/util/ArrayList;

    .line 30
    .line 31
    const/4 p1, 0x1

    .line 32
    iput p1, p0, Lk3/k;->k:I

    .line 33
    .line 34
    iput-boolean p1, p0, Lk3/k;->l:Z

    .line 35
    .line 36
    const-wide/16 p1, -0x1

    .line 37
    .line 38
    iput-wide p1, p0, Lk3/k;->n:J

    .line 39
    .line 40
    new-instance p1, Lh4/m;

    .line 41
    .line 42
    invoke-direct {p1}, Lh4/m;-><init>()V

    .line 43
    .line 44
    .line 45
    iput-object p1, p0, Lk3/k;->o:Lh4/m;

    .line 46
    .line 47
    new-instance p1, Ljava/util/LinkedHashSet;

    .line 48
    .line 49
    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 50
    .line 51
    .line 52
    iput-object p1, p0, Lk3/k;->p:Ljava/util/LinkedHashSet;

    .line 53
    .line 54
    return-void
.end method


# virtual methods
.method public final varargs a([Ll3/a;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lk3/k;->q:Ljava/util/HashSet;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/util/HashSet;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lk3/k;->q:Ljava/util/HashSet;

    .line 11
    .line 12
    :cond_0
    array-length v0, p1

    .line 13
    const/4 v1, 0x0

    .line 14
    :goto_0
    if-ge v1, v0, :cond_1

    .line 15
    .line 16
    aget-object v2, p1, v1

    .line 17
    .line 18
    iget-object v3, p0, Lk3/k;->q:Ljava/util/HashSet;

    .line 19
    .line 20
    invoke-static {v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    iget v4, v2, Ll3/a;->a:I

    .line 24
    .line 25
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    invoke-virtual {v3, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    iget-object v3, p0, Lk3/k;->q:Ljava/util/HashSet;

    .line 33
    .line 34
    invoke-static {v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    iget v2, v2, Ll3/a;->b:I

    .line 38
    .line 39
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-virtual {v3, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    add-int/lit8 v1, v1, 0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    array-length v0, p1

    .line 50
    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    check-cast p1, [Ll3/a;

    .line 55
    .line 56
    iget-object v0, p0, Lk3/k;->o:Lh4/m;

    .line 57
    .line 58
    invoke-virtual {v0, p1}, Lh4/m;->a([Ll3/a;)V

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method public final b()Lk3/m;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v2, 0x1

    .line 4
    const/4 v3, -0x1

    .line 5
    iget-object v4, v0, Lk3/k;->g:Ljava/util/concurrent/Executor;

    .line 6
    .line 7
    if-nez v4, :cond_0

    .line 8
    .line 9
    iget-object v5, v0, Lk3/k;->h:Ljava/util/concurrent/Executor;

    .line 10
    .line 11
    if-nez v5, :cond_0

    .line 12
    .line 13
    sget-object v4, Lr/a;->c:Lcom/applovin/impl/T0;

    .line 14
    .line 15
    iput-object v4, v0, Lk3/k;->h:Ljava/util/concurrent/Executor;

    .line 16
    .line 17
    iput-object v4, v0, Lk3/k;->g:Ljava/util/concurrent/Executor;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    if-eqz v4, :cond_1

    .line 21
    .line 22
    iget-object v5, v0, Lk3/k;->h:Ljava/util/concurrent/Executor;

    .line 23
    .line 24
    if-nez v5, :cond_1

    .line 25
    .line 26
    iput-object v4, v0, Lk3/k;->h:Ljava/util/concurrent/Executor;

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    if-nez v4, :cond_2

    .line 30
    .line 31
    iget-object v4, v0, Lk3/k;->h:Ljava/util/concurrent/Executor;

    .line 32
    .line 33
    iput-object v4, v0, Lk3/k;->g:Ljava/util/concurrent/Executor;

    .line 34
    .line 35
    :cond_2
    :goto_0
    iget-object v4, v0, Lk3/k;->q:Ljava/util/HashSet;

    .line 36
    .line 37
    iget-object v5, v0, Lk3/k;->p:Ljava/util/LinkedHashSet;

    .line 38
    .line 39
    if-eqz v4, :cond_4

    .line 40
    .line 41
    invoke-virtual {v4}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 46
    .line 47
    .line 48
    move-result v6

    .line 49
    if-eqz v6, :cond_4

    .line 50
    .line 51
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v6

    .line 55
    check-cast v6, Ljava/lang/Number;

    .line 56
    .line 57
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 58
    .line 59
    .line 60
    move-result v6

    .line 61
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 62
    .line 63
    .line 64
    move-result-object v7

    .line 65
    invoke-interface {v5, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v7

    .line 69
    if-nez v7, :cond_3

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_3
    const-string v1, "Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: "

    .line 73
    .line 74
    invoke-static {v6, v1}, Lka/n;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 79
    .line 80
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    throw v2

    .line 88
    :cond_4
    iget-object v4, v0, Lk3/k;->i:LK3/l;

    .line 89
    .line 90
    if-nez v4, :cond_5

    .line 91
    .line 92
    new-instance v4, La9/b;

    .line 93
    .line 94
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 95
    .line 96
    .line 97
    :cond_5
    move-object v8, v4

    .line 98
    iget-wide v6, v0, Lk3/k;->n:J

    .line 99
    .line 100
    const-wide/16 v9, 0x0

    .line 101
    .line 102
    cmp-long v4, v6, v9

    .line 103
    .line 104
    const-string v6, "Required value was null."

    .line 105
    .line 106
    if-lez v4, :cond_7

    .line 107
    .line 108
    iget-object v1, v0, Lk3/k;->c:Ljava/lang/String;

    .line 109
    .line 110
    if-eqz v1, :cond_6

    .line 111
    .line 112
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 113
    .line 114
    invoke-direct {v1, v6}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    throw v1

    .line 118
    :cond_6
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 119
    .line 120
    const-string v2, "Cannot create auto-closing database for an in-memory database."

    .line 121
    .line 122
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    throw v1

    .line 126
    :cond_7
    move-object/from16 v17, v5

    .line 127
    .line 128
    new-instance v5, Lk3/c;

    .line 129
    .line 130
    iget-object v10, v0, Lk3/k;->d:Ljava/util/ArrayList;

    .line 131
    .line 132
    iget-boolean v11, v0, Lk3/k;->j:Z

    .line 133
    .line 134
    iget v4, v0, Lk3/k;->k:I

    .line 135
    .line 136
    const/4 v7, 0x0

    .line 137
    if-eqz v4, :cond_26

    .line 138
    .line 139
    move-object v9, v6

    .line 140
    iget-object v6, v0, Lk3/k;->a:Landroid/content/Context;

    .line 141
    .line 142
    const/4 v12, 0x3

    .line 143
    if-eq v4, v2, :cond_8

    .line 144
    .line 145
    goto :goto_2

    .line 146
    :cond_8
    const-string v4, "activity"

    .line 147
    .line 148
    invoke-virtual {v6, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v4

    .line 152
    instance-of v13, v4, Landroid/app/ActivityManager;

    .line 153
    .line 154
    if-eqz v13, :cond_9

    .line 155
    .line 156
    move-object v7, v4

    .line 157
    check-cast v7, Landroid/app/ActivityManager;

    .line 158
    .line 159
    :cond_9
    if-eqz v7, :cond_a

    .line 160
    .line 161
    invoke-virtual {v7}, Landroid/app/ActivityManager;->isLowRamDevice()Z

    .line 162
    .line 163
    .line 164
    move-result v4

    .line 165
    if-nez v4, :cond_a

    .line 166
    .line 167
    move v4, v12

    .line 168
    goto :goto_2

    .line 169
    :cond_a
    const/4 v4, 0x2

    .line 170
    :goto_2
    iget-object v13, v0, Lk3/k;->g:Ljava/util/concurrent/Executor;

    .line 171
    .line 172
    if-eqz v13, :cond_25

    .line 173
    .line 174
    iget-object v14, v0, Lk3/k;->h:Ljava/util/concurrent/Executor;

    .line 175
    .line 176
    if-eqz v14, :cond_24

    .line 177
    .line 178
    iget-boolean v15, v0, Lk3/k;->l:Z

    .line 179
    .line 180
    iget-boolean v7, v0, Lk3/k;->m:Z

    .line 181
    .line 182
    iget-object v9, v0, Lk3/k;->e:Ljava/util/ArrayList;

    .line 183
    .line 184
    const/16 v20, 0x0

    .line 185
    .line 186
    iget-object v1, v0, Lk3/k;->f:Ljava/util/ArrayList;

    .line 187
    .line 188
    move/from16 v16, v7

    .line 189
    .line 190
    iget-object v7, v0, Lk3/k;->c:Ljava/lang/String;

    .line 191
    .line 192
    move-object/from16 v18, v9

    .line 193
    .line 194
    iget-object v9, v0, Lk3/k;->o:Lh4/m;

    .line 195
    .line 196
    move-object/from16 v19, v1

    .line 197
    .line 198
    move v1, v12

    .line 199
    move v12, v4

    .line 200
    invoke-direct/range {v5 .. v19}, Lk3/c;-><init>(Landroid/content/Context;Ljava/lang/String;Lo3/c;Lh4/m;Ljava/util/ArrayList;ZILjava/util/concurrent/Executor;Ljava/util/concurrent/Executor;ZZLjava/util/LinkedHashSet;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 201
    .line 202
    .line 203
    const-string v4, ".canonicalName"

    .line 204
    .line 205
    iget-object v6, v0, Lk3/k;->b:Ljava/lang/Class;

    .line 206
    .line 207
    invoke-virtual {v6}, Ljava/lang/Class;->getPackage()Ljava/lang/Package;

    .line 208
    .line 209
    .line 210
    move-result-object v7

    .line 211
    invoke-static {v7}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {v7}, Ljava/lang/Package;->getName()Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v7

    .line 218
    invoke-virtual {v6}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v8

    .line 222
    invoke-static {v8}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 223
    .line 224
    .line 225
    const-string v9, "fullPackage"

    .line 226
    .line 227
    invoke-static {v7, v9}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 231
    .line 232
    .line 233
    move-result v9

    .line 234
    if-nez v9, :cond_b

    .line 235
    .line 236
    goto :goto_3

    .line 237
    :cond_b
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 238
    .line 239
    .line 240
    move-result v9

    .line 241
    add-int/2addr v9, v2

    .line 242
    invoke-virtual {v8, v9}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v8

    .line 246
    const-string v9, "this as java.lang.String).substring(startIndex)"

    .line 247
    .line 248
    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 249
    .line 250
    .line 251
    :goto_3
    const/16 v9, 0x5f

    .line 252
    .line 253
    const/16 v10, 0x2e

    .line 254
    .line 255
    invoke-static {v8, v10, v9}, LBf/r;->i0(Ljava/lang/String;CC)Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object v8

    .line 259
    const-string v9, "_Impl"

    .line 260
    .line 261
    invoke-virtual {v8, v9}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object v8

    .line 265
    :try_start_0
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 266
    .line 267
    .line 268
    move-result v9

    .line 269
    if-nez v9, :cond_c

    .line 270
    .line 271
    move-object v7, v8

    .line 272
    goto :goto_4

    .line 273
    :cond_c
    new-instance v9, Ljava/lang/StringBuilder;

    .line 274
    .line 275
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 276
    .line 277
    .line 278
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 279
    .line 280
    .line 281
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 282
    .line 283
    .line 284
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 285
    .line 286
    .line 287
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object v7

    .line 291
    :goto_4
    invoke-virtual {v6}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 292
    .line 293
    .line 294
    move-result-object v9

    .line 295
    invoke-static {v7, v2, v9}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 296
    .line 297
    .line 298
    move-result-object v7

    .line 299
    const-string v9, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.Room.getGeneratedImplementation>"

    .line 300
    .line 301
    invoke-static {v7, v9}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 302
    .line 303
    .line 304
    invoke-virtual {v7}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    move-result-object v4
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 308
    check-cast v4, Lk3/m;

    .line 309
    .line 310
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 311
    .line 312
    .line 313
    invoke-virtual {v4, v5}, Lk3/m;->e(Lk3/c;)Lo3/d;

    .line 314
    .line 315
    .line 316
    move-result-object v6

    .line 317
    iput-object v6, v4, Lk3/m;->d:Lo3/d;

    .line 318
    .line 319
    invoke-virtual {v4}, Lk3/m;->h()Ljava/util/Set;

    .line 320
    .line 321
    .line 322
    move-result-object v6

    .line 323
    new-instance v7, Ljava/util/BitSet;

    .line 324
    .line 325
    invoke-direct {v7}, Ljava/util/BitSet;-><init>()V

    .line 326
    .line 327
    .line 328
    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 329
    .line 330
    .line 331
    move-result-object v6

    .line 332
    :goto_5
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 333
    .line 334
    .line 335
    move-result v8

    .line 336
    iget-object v9, v4, Lk3/m;->h:Ljava/util/LinkedHashMap;

    .line 337
    .line 338
    iget-object v10, v5, Lk3/c;->n:Ljava/util/ArrayList;

    .line 339
    .line 340
    if-eqz v8, :cond_11

    .line 341
    .line 342
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 343
    .line 344
    .line 345
    move-result-object v8

    .line 346
    check-cast v8, Ljava/lang/Class;

    .line 347
    .line 348
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 349
    .line 350
    .line 351
    move-result v11

    .line 352
    add-int/2addr v11, v3

    .line 353
    if-ltz v11, :cond_f

    .line 354
    .line 355
    :goto_6
    add-int/lit8 v12, v11, -0x1

    .line 356
    .line 357
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 358
    .line 359
    .line 360
    move-result-object v13

    .line 361
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 362
    .line 363
    .line 364
    move-result-object v13

    .line 365
    invoke-virtual {v8, v13}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 366
    .line 367
    .line 368
    move-result v13

    .line 369
    if-eqz v13, :cond_d

    .line 370
    .line 371
    invoke-virtual {v7, v11}, Ljava/util/BitSet;->set(I)V

    .line 372
    .line 373
    .line 374
    goto :goto_8

    .line 375
    :cond_d
    if-gez v12, :cond_e

    .line 376
    .line 377
    goto :goto_7

    .line 378
    :cond_e
    move v11, v12

    .line 379
    goto :goto_6

    .line 380
    :cond_f
    :goto_7
    move v11, v3

    .line 381
    :goto_8
    if-ltz v11, :cond_10

    .line 382
    .line 383
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 384
    .line 385
    .line 386
    move-result-object v10

    .line 387
    invoke-interface {v9, v8, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 388
    .line 389
    .line 390
    goto :goto_5

    .line 391
    :cond_10
    new-instance v1, Ljava/lang/StringBuilder;

    .line 392
    .line 393
    const-string v2, "A required auto migration spec ("

    .line 394
    .line 395
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 396
    .line 397
    .line 398
    invoke-virtual {v8}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 399
    .line 400
    .line 401
    move-result-object v2

    .line 402
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 403
    .line 404
    .line 405
    const-string v2, ") is missing in the database configuration."

    .line 406
    .line 407
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 408
    .line 409
    .line 410
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 411
    .line 412
    .line 413
    move-result-object v1

    .line 414
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 415
    .line 416
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 417
    .line 418
    .line 419
    move-result-object v1

    .line 420
    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 421
    .line 422
    .line 423
    throw v2

    .line 424
    :cond_11
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 425
    .line 426
    .line 427
    move-result v6

    .line 428
    add-int/2addr v6, v3

    .line 429
    if-ltz v6, :cond_14

    .line 430
    .line 431
    :goto_9
    add-int/lit8 v8, v6, -0x1

    .line 432
    .line 433
    invoke-virtual {v7, v6}, Ljava/util/BitSet;->get(I)Z

    .line 434
    .line 435
    .line 436
    move-result v6

    .line 437
    if-eqz v6, :cond_13

    .line 438
    .line 439
    if-gez v8, :cond_12

    .line 440
    .line 441
    goto :goto_a

    .line 442
    :cond_12
    move v6, v8

    .line 443
    goto :goto_9

    .line 444
    :cond_13
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 445
    .line 446
    const-string v2, "Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder."

    .line 447
    .line 448
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 449
    .line 450
    .line 451
    throw v1

    .line 452
    :cond_14
    :goto_a
    invoke-virtual {v4, v9}, Lk3/m;->f(Ljava/util/LinkedHashMap;)Ljava/util/List;

    .line 453
    .line 454
    .line 455
    move-result-object v6

    .line 456
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 457
    .line 458
    .line 459
    move-result-object v6

    .line 460
    :cond_15
    :goto_b
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 461
    .line 462
    .line 463
    move-result v7

    .line 464
    if-eqz v7, :cond_18

    .line 465
    .line 466
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 467
    .line 468
    .line 469
    move-result-object v7

    .line 470
    check-cast v7, Ll3/a;

    .line 471
    .line 472
    iget v8, v7, Ll3/a;->a:I

    .line 473
    .line 474
    iget-object v9, v5, Lk3/c;->d:Lh4/m;

    .line 475
    .line 476
    iget-object v10, v9, Lh4/m;->a:Ljava/util/LinkedHashMap;

    .line 477
    .line 478
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 479
    .line 480
    .line 481
    move-result-object v11

    .line 482
    invoke-interface {v10, v11}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 483
    .line 484
    .line 485
    move-result v11

    .line 486
    if-eqz v11, :cond_17

    .line 487
    .line 488
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 489
    .line 490
    .line 491
    move-result-object v8

    .line 492
    invoke-virtual {v10, v8}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 493
    .line 494
    .line 495
    move-result-object v8

    .line 496
    check-cast v8, Ljava/util/Map;

    .line 497
    .line 498
    if-nez v8, :cond_16

    .line 499
    .line 500
    sget-object v8, Lff/w;->a:Lff/w;

    .line 501
    .line 502
    :cond_16
    iget v10, v7, Ll3/a;->b:I

    .line 503
    .line 504
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 505
    .line 506
    .line 507
    move-result-object v10

    .line 508
    invoke-interface {v8, v10}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 509
    .line 510
    .line 511
    move-result v8

    .line 512
    goto :goto_c

    .line 513
    :cond_17
    move/from16 v8, v20

    .line 514
    .line 515
    :goto_c
    if-nez v8, :cond_15

    .line 516
    .line 517
    new-array v8, v2, [Ll3/a;

    .line 518
    .line 519
    aput-object v7, v8, v20

    .line 520
    .line 521
    invoke-virtual {v9, v8}, Lh4/m;->a([Ll3/a;)V

    .line 522
    .line 523
    .line 524
    goto :goto_b

    .line 525
    :cond_18
    invoke-virtual {v4}, Lk3/m;->g()Lo3/d;

    .line 526
    .line 527
    .line 528
    move-result-object v6

    .line 529
    const-class v7, Lk3/r;

    .line 530
    .line 531
    invoke-static {v7, v6}, Lk3/m;->o(Ljava/lang/Class;Lo3/d;)Ljava/lang/Object;

    .line 532
    .line 533
    .line 534
    move-result-object v6

    .line 535
    check-cast v6, Lk3/r;

    .line 536
    .line 537
    invoke-virtual {v4}, Lk3/m;->g()Lo3/d;

    .line 538
    .line 539
    .line 540
    move-result-object v6

    .line 541
    const-class v7, Lk3/a;

    .line 542
    .line 543
    invoke-static {v7, v6}, Lk3/m;->o(Ljava/lang/Class;Lo3/d;)Ljava/lang/Object;

    .line 544
    .line 545
    .line 546
    move-result-object v6

    .line 547
    check-cast v6, Lk3/a;

    .line 548
    .line 549
    iget v6, v5, Lk3/c;->g:I

    .line 550
    .line 551
    if-ne v6, v1, :cond_19

    .line 552
    .line 553
    move v1, v2

    .line 554
    goto :goto_d

    .line 555
    :cond_19
    move/from16 v1, v20

    .line 556
    .line 557
    :goto_d
    invoke-virtual {v4}, Lk3/m;->g()Lo3/d;

    .line 558
    .line 559
    .line 560
    move-result-object v6

    .line 561
    invoke-interface {v6, v1}, Lo3/d;->setWriteAheadLoggingEnabled(Z)V

    .line 562
    .line 563
    .line 564
    iget-object v1, v5, Lk3/c;->e:Ljava/util/ArrayList;

    .line 565
    .line 566
    iput-object v1, v4, Lk3/m;->g:Ljava/util/ArrayList;

    .line 567
    .line 568
    iget-object v1, v5, Lk3/c;->h:Ljava/util/concurrent/Executor;

    .line 569
    .line 570
    iput-object v1, v4, Lk3/m;->b:Ljava/util/concurrent/Executor;

    .line 571
    .line 572
    new-instance v1, LT3/m;

    .line 573
    .line 574
    iget-object v6, v5, Lk3/c;->i:Ljava/util/concurrent/Executor;

    .line 575
    .line 576
    invoke-direct {v1, v6}, LT3/m;-><init>(Ljava/util/concurrent/Executor;)V

    .line 577
    .line 578
    .line 579
    iput-object v1, v4, Lk3/m;->c:LT3/m;

    .line 580
    .line 581
    iget-boolean v1, v5, Lk3/c;->f:Z

    .line 582
    .line 583
    iput-boolean v1, v4, Lk3/m;->f:Z

    .line 584
    .line 585
    invoke-virtual {v4}, Lk3/m;->i()Ljava/util/Map;

    .line 586
    .line 587
    .line 588
    move-result-object v1

    .line 589
    new-instance v6, Ljava/util/BitSet;

    .line 590
    .line 591
    invoke-direct {v6}, Ljava/util/BitSet;-><init>()V

    .line 592
    .line 593
    .line 594
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 595
    .line 596
    .line 597
    move-result-object v1

    .line 598
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 599
    .line 600
    .line 601
    move-result-object v1

    .line 602
    :cond_1a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 603
    .line 604
    .line 605
    move-result v7

    .line 606
    iget-object v8, v5, Lk3/c;->m:Ljava/util/ArrayList;

    .line 607
    .line 608
    if-eqz v7, :cond_20

    .line 609
    .line 610
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 611
    .line 612
    .line 613
    move-result-object v7

    .line 614
    check-cast v7, Ljava/util/Map$Entry;

    .line 615
    .line 616
    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 617
    .line 618
    .line 619
    move-result-object v9

    .line 620
    check-cast v9, Ljava/lang/Class;

    .line 621
    .line 622
    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 623
    .line 624
    .line 625
    move-result-object v7

    .line 626
    check-cast v7, Ljava/util/List;

    .line 627
    .line 628
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 629
    .line 630
    .line 631
    move-result-object v7

    .line 632
    :goto_e
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 633
    .line 634
    .line 635
    move-result v10

    .line 636
    if-eqz v10, :cond_1a

    .line 637
    .line 638
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 639
    .line 640
    .line 641
    move-result-object v10

    .line 642
    check-cast v10, Ljava/lang/Class;

    .line 643
    .line 644
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 645
    .line 646
    .line 647
    move-result v11

    .line 648
    add-int/2addr v11, v3

    .line 649
    if-ltz v11, :cond_1d

    .line 650
    .line 651
    :goto_f
    add-int/lit8 v12, v11, -0x1

    .line 652
    .line 653
    invoke-virtual {v8, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 654
    .line 655
    .line 656
    move-result-object v13

    .line 657
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 658
    .line 659
    .line 660
    move-result-object v13

    .line 661
    invoke-virtual {v10, v13}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 662
    .line 663
    .line 664
    move-result v13

    .line 665
    if-eqz v13, :cond_1b

    .line 666
    .line 667
    invoke-virtual {v6, v11}, Ljava/util/BitSet;->set(I)V

    .line 668
    .line 669
    .line 670
    goto :goto_11

    .line 671
    :cond_1b
    if-gez v12, :cond_1c

    .line 672
    .line 673
    goto :goto_10

    .line 674
    :cond_1c
    move v11, v12

    .line 675
    goto :goto_f

    .line 676
    :cond_1d
    :goto_10
    move v11, v3

    .line 677
    :goto_11
    if-ltz v11, :cond_1e

    .line 678
    .line 679
    move v12, v2

    .line 680
    goto :goto_12

    .line 681
    :cond_1e
    move/from16 v12, v20

    .line 682
    .line 683
    :goto_12
    if-eqz v12, :cond_1f

    .line 684
    .line 685
    iget-object v12, v4, Lk3/m;->l:Ljava/util/LinkedHashMap;

    .line 686
    .line 687
    invoke-virtual {v8, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 688
    .line 689
    .line 690
    move-result-object v11

    .line 691
    invoke-interface {v12, v10, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 692
    .line 693
    .line 694
    goto :goto_e

    .line 695
    :cond_1f
    new-instance v1, Ljava/lang/StringBuilder;

    .line 696
    .line 697
    const-string v2, "A required type converter ("

    .line 698
    .line 699
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 700
    .line 701
    .line 702
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 703
    .line 704
    .line 705
    const-string v2, ") for "

    .line 706
    .line 707
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 708
    .line 709
    .line 710
    invoke-virtual {v9}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 711
    .line 712
    .line 713
    move-result-object v2

    .line 714
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 715
    .line 716
    .line 717
    const-string v2, " is missing in the database configuration."

    .line 718
    .line 719
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 720
    .line 721
    .line 722
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 723
    .line 724
    .line 725
    move-result-object v1

    .line 726
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 727
    .line 728
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 729
    .line 730
    .line 731
    move-result-object v1

    .line 732
    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 733
    .line 734
    .line 735
    throw v2

    .line 736
    :cond_20
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 737
    .line 738
    .line 739
    move-result v1

    .line 740
    add-int/2addr v1, v3

    .line 741
    if-ltz v1, :cond_23

    .line 742
    .line 743
    :goto_13
    add-int/lit8 v2, v1, -0x1

    .line 744
    .line 745
    invoke-virtual {v6, v1}, Ljava/util/BitSet;->get(I)Z

    .line 746
    .line 747
    .line 748
    move-result v5

    .line 749
    if-eqz v5, :cond_22

    .line 750
    .line 751
    if-gez v2, :cond_21

    .line 752
    .line 753
    goto :goto_14

    .line 754
    :cond_21
    move v1, v2

    .line 755
    goto :goto_13

    .line 756
    :cond_22
    invoke-virtual {v8, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 757
    .line 758
    .line 759
    move-result-object v1

    .line 760
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 761
    .line 762
    new-instance v3, Ljava/lang/StringBuilder;

    .line 763
    .line 764
    const-string v4, "Unexpected type converter "

    .line 765
    .line 766
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 767
    .line 768
    .line 769
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 770
    .line 771
    .line 772
    const-string v1, ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder."

    .line 773
    .line 774
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 775
    .line 776
    .line 777
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 778
    .line 779
    .line 780
    move-result-object v1

    .line 781
    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 782
    .line 783
    .line 784
    throw v2

    .line 785
    :cond_23
    :goto_14
    return-object v4

    .line 786
    :catch_0
    new-instance v1, Ljava/lang/RuntimeException;

    .line 787
    .line 788
    new-instance v2, Ljava/lang/StringBuilder;

    .line 789
    .line 790
    const-string v3, "Failed to create an instance of "

    .line 791
    .line 792
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 793
    .line 794
    .line 795
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 796
    .line 797
    .line 798
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 799
    .line 800
    .line 801
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 802
    .line 803
    .line 804
    move-result-object v2

    .line 805
    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 806
    .line 807
    .line 808
    throw v1

    .line 809
    :catch_1
    new-instance v1, Ljava/lang/RuntimeException;

    .line 810
    .line 811
    new-instance v2, Ljava/lang/StringBuilder;

    .line 812
    .line 813
    const-string v3, "Cannot access the constructor "

    .line 814
    .line 815
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 816
    .line 817
    .line 818
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 819
    .line 820
    .line 821
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 822
    .line 823
    .line 824
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 825
    .line 826
    .line 827
    move-result-object v2

    .line 828
    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 829
    .line 830
    .line 831
    throw v1

    .line 832
    :catch_2
    new-instance v1, Ljava/lang/RuntimeException;

    .line 833
    .line 834
    new-instance v2, Ljava/lang/StringBuilder;

    .line 835
    .line 836
    const-string v3, "Cannot find implementation for "

    .line 837
    .line 838
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 839
    .line 840
    .line 841
    invoke-virtual {v6}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 842
    .line 843
    .line 844
    move-result-object v3

    .line 845
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 846
    .line 847
    .line 848
    const-string v3, ". "

    .line 849
    .line 850
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 851
    .line 852
    .line 853
    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 854
    .line 855
    .line 856
    const-string v3, " does not exist"

    .line 857
    .line 858
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 859
    .line 860
    .line 861
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 862
    .line 863
    .line 864
    move-result-object v2

    .line 865
    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 866
    .line 867
    .line 868
    throw v1

    .line 869
    :cond_24
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 870
    .line 871
    invoke-direct {v1, v9}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 872
    .line 873
    .line 874
    throw v1

    .line 875
    :cond_25
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 876
    .line 877
    invoke-direct {v1, v9}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 878
    .line 879
    .line 880
    throw v1

    .line 881
    :cond_26
    throw v7
.end method
