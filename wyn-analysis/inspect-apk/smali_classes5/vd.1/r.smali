.class public final Lvd/r;
.super Lmd/O;
.source "SourceFile"


# static fields
.field public static final n:Lmd/a;


# instance fields
.field public final f:LS1/n;

.field public final g:Lmd/n0;

.field public final h:Lvd/e;

.field public final i:Lod/Y1;

.field public final j:Ljava/util/concurrent/ScheduledExecutorService;

.field public k:Lba/a;

.field public l:Ljava/lang/Long;

.field public final m:Lmd/e;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lmd/a;

    .line 2
    .line 3
    const-string v1, "addressTrackerKey"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lmd/a;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lvd/r;->n:Lmd/a;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Lmd/y;)V
    .locals 4

    .line 1
    sget-object v0, Lod/Y1;->b:Lod/Y1;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lmd/y;->d()Lmd/e;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    iput-object v1, p0, Lvd/r;->m:Lmd/e;

    .line 11
    .line 12
    new-instance v2, Lvd/d;

    .line 13
    .line 14
    invoke-direct {v2, p0, p1}, Lvd/d;-><init>(Lvd/r;Lmd/y;)V

    .line 15
    .line 16
    .line 17
    new-instance v3, Lvd/e;

    .line 18
    .line 19
    invoke-direct {v3, v2}, Lvd/e;-><init>(Lvd/a;)V

    .line 20
    .line 21
    .line 22
    iput-object v3, p0, Lvd/r;->h:Lvd/e;

    .line 23
    .line 24
    new-instance v2, LS1/n;

    .line 25
    .line 26
    invoke-direct {v2}, LS1/n;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object v2, p0, Lvd/r;->f:LS1/n;

    .line 30
    .line 31
    invoke-virtual {p1}, Lmd/y;->g()Lmd/n0;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    const-string v3, "syncContext"

    .line 36
    .line 37
    invoke-static {v2, v3}, LFe/e;->t(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    iput-object v2, p0, Lvd/r;->g:Lmd/n0;

    .line 41
    .line 42
    invoke-virtual {p1}, Lmd/y;->e()Ljava/util/concurrent/ScheduledExecutorService;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    const-string v2, "timeService"

    .line 47
    .line 48
    invoke-static {p1, v2}, LFe/e;->t(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    iput-object p1, p0, Lvd/r;->j:Ljava/util/concurrent/ScheduledExecutorService;

    .line 52
    .line 53
    iput-object v0, p0, Lvd/r;->i:Lod/Y1;

    .line 54
    .line 55
    const/4 p1, 0x1

    .line 56
    const-string v0, "OutlierDetection lb created."

    .line 57
    .line 58
    invoke-virtual {v1, p1, v0}, Lmd/e;->g(ILjava/lang/String;)V

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method public static g(Ljava/util/List;)Z
    .locals 4

    .line 1
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x0

    .line 6
    move v1, v0

    .line 7
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    const/4 v3, 0x1

    .line 12
    if-eqz v2, :cond_1

    .line 13
    .line 14
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    check-cast v2, Lmd/u;

    .line 19
    .line 20
    iget-object v2, v2, Lmd/u;->a:Ljava/util/List;

    .line 21
    .line 22
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    add-int/2addr v1, v2

    .line 27
    if-le v1, v3, :cond_0

    .line 28
    .line 29
    return v0

    .line 30
    :cond_1
    return v3
.end method

.method public static h(LS1/n;I)Ljava/util/ArrayList;
    .locals 6

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, LS1/n;->values()Ljava/util/Collection;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Lvd/k;

    .line 25
    .line 26
    invoke-virtual {v1}, Lvd/k;->c()J

    .line 27
    .line 28
    .line 29
    move-result-wide v2

    .line 30
    int-to-long v4, p1

    .line 31
    cmp-long v2, v2, v4

    .line 32
    .line 33
    if-ltz v2, :cond_0

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    return-object v0
.end method


# virtual methods
.method public final a(Lmd/L;)Lmd/k0;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    new-array v3, v2, [Ljava/lang/Object;

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    aput-object v1, v3, v4

    .line 10
    .line 11
    iget-object v5, v0, Lvd/r;->m:Lmd/e;

    .line 12
    .line 13
    const-string v6, "Received resolution result: {0}"

    .line 14
    .line 15
    invoke-virtual {v5, v2, v6, v3}, Lmd/e;->h(ILjava/lang/String;[Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    iget-object v2, v1, Lmd/L;->c:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v2, Lvd/m;

    .line 21
    .line 22
    new-instance v3, Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 25
    .line 26
    .line 27
    iget-object v6, v1, Lmd/L;->a:Ljava/util/List;

    .line 28
    .line 29
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object v6

    .line 33
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v7

    .line 37
    if-eqz v7, :cond_0

    .line 38
    .line 39
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v7

    .line 43
    check-cast v7, Lmd/u;

    .line 44
    .line 45
    iget-object v7, v7, Lmd/u;->a:Ljava/util/List;

    .line 46
    .line 47
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    iget-object v6, v0, Lvd/r;->f:LS1/n;

    .line 52
    .line 53
    invoke-virtual {v6}, LS1/n;->keySet()Ljava/util/Set;

    .line 54
    .line 55
    .line 56
    move-result-object v7

    .line 57
    invoke-interface {v7, v3}, Ljava/util/Set;->retainAll(Ljava/util/Collection;)Z

    .line 58
    .line 59
    .line 60
    iget-object v7, v6, LS1/n;->b:Ljava/util/Map;

    .line 61
    .line 62
    check-cast v7, Ljava/util/HashMap;

    .line 63
    .line 64
    invoke-virtual {v7}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 65
    .line 66
    .line 67
    move-result-object v7

    .line 68
    invoke-interface {v7}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 69
    .line 70
    .line 71
    move-result-object v7

    .line 72
    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 73
    .line 74
    .line 75
    move-result v8

    .line 76
    if-eqz v8, :cond_1

    .line 77
    .line 78
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v8

    .line 82
    check-cast v8, Lvd/k;

    .line 83
    .line 84
    iput-object v2, v8, Lvd/k;->a:Lvd/m;

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_1
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    :cond_2
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 92
    .line 93
    .line 94
    move-result v7

    .line 95
    if-eqz v7, :cond_3

    .line 96
    .line 97
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v7

    .line 101
    check-cast v7, Ljava/net/SocketAddress;

    .line 102
    .line 103
    iget-object v8, v6, LS1/n;->b:Ljava/util/Map;

    .line 104
    .line 105
    check-cast v8, Ljava/util/HashMap;

    .line 106
    .line 107
    invoke-virtual {v8, v7}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result v9

    .line 111
    if-nez v9, :cond_2

    .line 112
    .line 113
    new-instance v9, Lvd/k;

    .line 114
    .line 115
    invoke-direct {v9, v2}, Lvd/k;-><init>(Lvd/m;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v8, v7, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    goto :goto_2

    .line 122
    :cond_3
    iget-object v3, v2, Lvd/m;->g:Lod/R1;

    .line 123
    .line 124
    iget-object v3, v3, Lod/R1;->a:Lmd/P;

    .line 125
    .line 126
    iget-object v7, v0, Lvd/r;->h:Lvd/e;

    .line 127
    .line 128
    invoke-virtual {v7, v3}, Lvd/e;->i(Lmd/P;)V

    .line 129
    .line 130
    .line 131
    iget-object v3, v2, Lvd/m;->e:LS3/i;

    .line 132
    .line 133
    if-nez v3, :cond_6

    .line 134
    .line 135
    iget-object v3, v2, Lvd/m;->f:LW9/u;

    .line 136
    .line 137
    if-eqz v3, :cond_4

    .line 138
    .line 139
    goto :goto_4

    .line 140
    :cond_4
    iget-object v3, v0, Lvd/r;->k:Lba/a;

    .line 141
    .line 142
    if-eqz v3, :cond_9

    .line 143
    .line 144
    invoke-virtual {v3}, Lba/a;->j()V

    .line 145
    .line 146
    .line 147
    const/4 v3, 0x0

    .line 148
    iput-object v3, v0, Lvd/r;->l:Ljava/lang/Long;

    .line 149
    .line 150
    iget-object v3, v6, LS1/n;->b:Ljava/util/Map;

    .line 151
    .line 152
    check-cast v3, Ljava/util/HashMap;

    .line 153
    .line 154
    invoke-virtual {v3}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 155
    .line 156
    .line 157
    move-result-object v3

    .line 158
    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 159
    .line 160
    .line 161
    move-result-object v3

    .line 162
    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 163
    .line 164
    .line 165
    move-result v5

    .line 166
    if-eqz v5, :cond_9

    .line 167
    .line 168
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v5

    .line 172
    check-cast v5, Lvd/k;

    .line 173
    .line 174
    invoke-virtual {v5}, Lvd/k;->d()Z

    .line 175
    .line 176
    .line 177
    move-result v6

    .line 178
    if-eqz v6, :cond_5

    .line 179
    .line 180
    invoke-virtual {v5}, Lvd/k;->e()V

    .line 181
    .line 182
    .line 183
    :cond_5
    iput v4, v5, Lvd/k;->e:I

    .line 184
    .line 185
    goto :goto_3

    .line 186
    :cond_6
    :goto_4
    iget-object v3, v0, Lvd/r;->l:Ljava/lang/Long;

    .line 187
    .line 188
    iget-object v4, v2, Lvd/m;->a:Ljava/lang/Long;

    .line 189
    .line 190
    const-wide/16 v8, 0x0

    .line 191
    .line 192
    if-nez v3, :cond_7

    .line 193
    .line 194
    move-object v3, v4

    .line 195
    goto :goto_5

    .line 196
    :cond_7
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 197
    .line 198
    .line 199
    move-result-wide v10

    .line 200
    iget-object v3, v0, Lvd/r;->i:Lod/Y1;

    .line 201
    .line 202
    invoke-virtual {v3}, Lod/Y1;->d()J

    .line 203
    .line 204
    .line 205
    move-result-wide v12

    .line 206
    iget-object v3, v0, Lvd/r;->l:Ljava/lang/Long;

    .line 207
    .line 208
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 209
    .line 210
    .line 211
    move-result-wide v14

    .line 212
    sub-long/2addr v12, v14

    .line 213
    sub-long/2addr v10, v12

    .line 214
    invoke-static {v8, v9, v10, v11}, Ljava/lang/Math;->max(JJ)J

    .line 215
    .line 216
    .line 217
    move-result-wide v10

    .line 218
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 219
    .line 220
    .line 221
    move-result-object v3

    .line 222
    :goto_5
    iget-object v10, v0, Lvd/r;->k:Lba/a;

    .line 223
    .line 224
    if-eqz v10, :cond_8

    .line 225
    .line 226
    invoke-virtual {v10}, Lba/a;->j()V

    .line 227
    .line 228
    .line 229
    iget-object v6, v6, LS1/n;->b:Ljava/util/Map;

    .line 230
    .line 231
    check-cast v6, Ljava/util/HashMap;

    .line 232
    .line 233
    invoke-virtual {v6}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 234
    .line 235
    .line 236
    move-result-object v6

    .line 237
    invoke-interface {v6}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 238
    .line 239
    .line 240
    move-result-object v6

    .line 241
    :goto_6
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 242
    .line 243
    .line 244
    move-result v10

    .line 245
    if-eqz v10, :cond_8

    .line 246
    .line 247
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object v10

    .line 251
    check-cast v10, Lvd/k;

    .line 252
    .line 253
    iget-object v11, v10, Lvd/k;->b:Lt6/q;

    .line 254
    .line 255
    iget-object v12, v11, Lt6/q;->a:Ljava/lang/Object;

    .line 256
    .line 257
    check-cast v12, Ljava/util/concurrent/atomic/AtomicLong;

    .line 258
    .line 259
    invoke-virtual {v12, v8, v9}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    .line 260
    .line 261
    .line 262
    iget-object v11, v11, Lt6/q;->b:Ljava/lang/Object;

    .line 263
    .line 264
    check-cast v11, Ljava/util/concurrent/atomic/AtomicLong;

    .line 265
    .line 266
    invoke-virtual {v11, v8, v9}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    .line 267
    .line 268
    .line 269
    iget-object v10, v10, Lvd/k;->c:Lt6/q;

    .line 270
    .line 271
    iget-object v11, v10, Lt6/q;->a:Ljava/lang/Object;

    .line 272
    .line 273
    check-cast v11, Ljava/util/concurrent/atomic/AtomicLong;

    .line 274
    .line 275
    invoke-virtual {v11, v8, v9}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    .line 276
    .line 277
    .line 278
    iget-object v10, v10, Lt6/q;->b:Ljava/lang/Object;

    .line 279
    .line 280
    check-cast v10, Ljava/util/concurrent/atomic/AtomicLong;

    .line 281
    .line 282
    invoke-virtual {v10, v8, v9}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    .line 283
    .line 284
    .line 285
    goto :goto_6

    .line 286
    :cond_8
    new-instance v14, Lpb/a;

    .line 287
    .line 288
    const/4 v6, 0x7

    .line 289
    invoke-direct {v14, v0, v2, v5, v6}, Lpb/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 290
    .line 291
    .line 292
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 293
    .line 294
    .line 295
    move-result-wide v17

    .line 296
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 297
    .line 298
    .line 299
    move-result-wide v15

    .line 300
    sget-object v21, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    .line 301
    .line 302
    iget-object v12, v0, Lvd/r;->g:Lmd/n0;

    .line 303
    .line 304
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 305
    .line 306
    .line 307
    new-instance v13, LN6/w;

    .line 308
    .line 309
    invoke-direct {v13, v14}, LN6/w;-><init>(Ljava/lang/Runnable;)V

    .line 310
    .line 311
    .line 312
    new-instance v11, LW9/w;

    .line 313
    .line 314
    invoke-direct/range {v11 .. v16}, LW9/w;-><init>(Lmd/n0;LN6/w;Lpb/a;J)V

    .line 315
    .line 316
    .line 317
    iget-object v3, v0, Lvd/r;->j:Ljava/util/concurrent/ScheduledExecutorService;

    .line 318
    .line 319
    move-wide/from16 v19, v15

    .line 320
    .line 321
    move-object v15, v3

    .line 322
    move-object/from16 v16, v11

    .line 323
    .line 324
    invoke-interface/range {v15 .. v21}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleWithFixedDelay(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 325
    .line 326
    .line 327
    move-result-object v3

    .line 328
    new-instance v4, Lba/a;

    .line 329
    .line 330
    invoke-direct {v4, v13, v3}, Lba/a;-><init>(LN6/w;Ljava/util/concurrent/ScheduledFuture;)V

    .line 331
    .line 332
    .line 333
    iput-object v4, v0, Lvd/r;->k:Lba/a;

    .line 334
    .line 335
    :cond_9
    sget-object v3, Lmd/b;->b:Lmd/b;

    .line 336
    .line 337
    iget-object v3, v1, Lmd/L;->a:Ljava/util/List;

    .line 338
    .line 339
    iget-object v1, v1, Lmd/L;->b:Lmd/b;

    .line 340
    .line 341
    iget-object v2, v2, Lvd/m;->g:Lod/R1;

    .line 342
    .line 343
    iget-object v2, v2, Lod/R1;->b:Ljava/lang/Object;

    .line 344
    .line 345
    new-instance v4, Lmd/L;

    .line 346
    .line 347
    invoke-direct {v4, v3, v1, v2}, Lmd/L;-><init>(Ljava/util/List;Lmd/b;Ljava/lang/Object;)V

    .line 348
    .line 349
    .line 350
    invoke-virtual {v7, v4}, Lvd/e;->d(Lmd/L;)V

    .line 351
    .line 352
    .line 353
    sget-object v1, Lmd/k0;->e:Lmd/k0;

    .line 354
    .line 355
    return-object v1
.end method

.method public final c(Lmd/k0;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lvd/r;->h:Lvd/e;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lvd/e;->c(Lmd/k0;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final f()V
    .locals 1

    .line 1
    iget-object v0, p0, Lvd/r;->h:Lvd/e;

    .line 2
    .line 3
    invoke-virtual {v0}, Lvd/e;->f()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
