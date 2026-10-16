.class public final Lf6/K;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/net/Uri;

.field public final b:Lt6/J;

.field public final c:Lb7/k;

.field public final d:Lf6/N;

.field public final e:Ls8/b;

.field public final f:LJ5/n;

.field public volatile g:Z

.field public h:Z

.field public i:J

.field public j:Lt6/n;

.field public k:Lf6/U;

.field public l:Z

.field public final synthetic m:Lf6/N;


# direct methods
.method public constructor <init>(Lf6/N;Landroid/net/Uri;Lt6/l;Lb7/k;Lf6/N;Ls8/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lf6/K;->m:Lf6/N;

    .line 5
    .line 6
    iput-object p2, p0, Lf6/K;->a:Landroid/net/Uri;

    .line 7
    .line 8
    new-instance p1, Lt6/J;

    .line 9
    .line 10
    invoke-direct {p1, p3}, Lt6/J;-><init>(Lt6/l;)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lf6/K;->b:Lt6/J;

    .line 14
    .line 15
    iput-object p4, p0, Lf6/K;->c:Lb7/k;

    .line 16
    .line 17
    iput-object p5, p0, Lf6/K;->d:Lf6/N;

    .line 18
    .line 19
    iput-object p6, p0, Lf6/K;->e:Ls8/b;

    .line 20
    .line 21
    new-instance p1, LJ5/n;

    .line 22
    .line 23
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object p1, p0, Lf6/K;->f:LJ5/n;

    .line 27
    .line 28
    const/4 p1, 0x1

    .line 29
    iput-boolean p1, p0, Lf6/K;->h:Z

    .line 30
    .line 31
    sget-object p1, Lf6/p;->a:Ljava/util/concurrent/atomic/AtomicLong;

    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicLong;->getAndIncrement()J

    .line 34
    .line 35
    .line 36
    const-wide/16 p1, 0x0

    .line 37
    .line 38
    invoke-virtual {p0, p1, p2}, Lf6/K;->a(J)Lt6/n;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    iput-object p1, p0, Lf6/K;->j:Lt6/n;

    .line 43
    .line 44
    return-void
.end method


# virtual methods
.method public final a(J)Lt6/n;
    .locals 11

    .line 1
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 2
    .line 3
    iget-object v0, p0, Lf6/K;->m:Lf6/N;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    sget-object v5, Lf6/N;->L:Ljava/util/Map;

    .line 9
    .line 10
    iget-object v2, p0, Lf6/K;->a:Landroid/net/Uri;

    .line 11
    .line 12
    const-string v0, "The uri must be set."

    .line 13
    .line 14
    invoke-static {v2, v0}, Lu6/a;->k(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    new-instance v1, Lt6/n;

    .line 18
    .line 19
    const-wide/16 v8, -0x1

    .line 20
    .line 21
    const/4 v10, 0x6

    .line 22
    const/4 v3, 0x1

    .line 23
    const/4 v4, 0x0

    .line 24
    move-wide v6, p1

    .line 25
    invoke-direct/range {v1 .. v10}, Lt6/n;-><init>(Landroid/net/Uri;I[BLjava/util/Map;JJI)V

    .line 26
    .line 27
    .line 28
    return-object v1
.end method

.method public final b()V
    .locals 15

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :catch_0
    :cond_0
    :goto_0
    if-nez v1, :cond_10

    .line 4
    .line 5
    iget-boolean v2, p0, Lf6/K;->g:Z

    .line 6
    .line 7
    if-nez v2, :cond_10

    .line 8
    .line 9
    const-wide/16 v2, -0x1

    .line 10
    .line 11
    const/4 v4, 0x1

    .line 12
    :try_start_0
    iget-object v5, p0, Lf6/K;->f:LJ5/n;

    .line 13
    .line 14
    iget-wide v10, v5, LJ5/n;->a:J

    .line 15
    .line 16
    invoke-virtual {p0, v10, v11}, Lf6/K;->a(J)Lt6/n;

    .line 17
    .line 18
    .line 19
    move-result-object v5

    .line 20
    iput-object v5, p0, Lf6/K;->j:Lt6/n;

    .line 21
    .line 22
    iget-object v6, p0, Lf6/K;->b:Lt6/J;

    .line 23
    .line 24
    invoke-virtual {v6, v5}, Lt6/J;->t(Lt6/n;)J

    .line 25
    .line 26
    .line 27
    move-result-wide v5

    .line 28
    cmp-long v7, v5, v2

    .line 29
    .line 30
    if-eqz v7, :cond_1

    .line 31
    .line 32
    add-long/2addr v5, v10

    .line 33
    iget-object v7, p0, Lf6/K;->m:Lf6/N;

    .line 34
    .line 35
    iget-object v8, v7, Lf6/N;->o:Landroid/os/Handler;

    .line 36
    .line 37
    new-instance v9, Lf6/J;

    .line 38
    .line 39
    const/4 v12, 0x2

    .line 40
    invoke-direct {v9, v7, v12}, Lf6/J;-><init>(Lf6/N;I)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v8, v9}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 44
    .line 45
    .line 46
    :cond_1
    move-wide v12, v5

    .line 47
    goto :goto_1

    .line 48
    :catchall_0
    move-exception v0

    .line 49
    goto/16 :goto_9

    .line 50
    .line 51
    :goto_1
    iget-object v5, p0, Lf6/K;->m:Lf6/N;

    .line 52
    .line 53
    iget-object v6, p0, Lf6/K;->b:Lt6/J;

    .line 54
    .line 55
    iget-object v6, v6, Lt6/J;->a:Lt6/l;

    .line 56
    .line 57
    invoke-interface {v6}, Lt6/l;->d()Ljava/util/Map;

    .line 58
    .line 59
    .line 60
    move-result-object v6

    .line 61
    invoke-static {v6}, La6/b;->c(Ljava/util/Map;)La6/b;

    .line 62
    .line 63
    .line 64
    move-result-object v6

    .line 65
    iput-object v6, v5, Lf6/N;->q:La6/b;

    .line 66
    .line 67
    iget-object v5, p0, Lf6/K;->b:Lt6/J;

    .line 68
    .line 69
    iget-object v6, p0, Lf6/K;->m:Lf6/N;

    .line 70
    .line 71
    iget-object v6, v6, Lf6/N;->q:La6/b;

    .line 72
    .line 73
    if-eqz v6, :cond_2

    .line 74
    .line 75
    iget v6, v6, La6/b;->f:I

    .line 76
    .line 77
    const/4 v7, -0x1

    .line 78
    if-eq v6, v7, :cond_2

    .line 79
    .line 80
    new-instance v7, Lf6/o;

    .line 81
    .line 82
    invoke-direct {v7, v5, v6, p0}, Lf6/o;-><init>(Lt6/l;ILf6/K;)V

    .line 83
    .line 84
    .line 85
    iget-object v5, p0, Lf6/K;->m:Lf6/N;

    .line 86
    .line 87
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    new-instance v6, Lf6/M;

    .line 91
    .line 92
    invoke-direct {v6, v0, v4}, Lf6/M;-><init>(IZ)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v5, v6}, Lf6/N;->A(Lf6/M;)Lf6/U;

    .line 96
    .line 97
    .line 98
    move-result-object v5

    .line 99
    iput-object v5, p0, Lf6/K;->k:Lf6/U;

    .line 100
    .line 101
    sget-object v6, Lf6/N;->M:LE5/T;

    .line 102
    .line 103
    invoke-virtual {v5, v6}, Lf6/U;->a(LE5/T;)V

    .line 104
    .line 105
    .line 106
    goto :goto_2

    .line 107
    :cond_2
    move-object v7, v5

    .line 108
    :goto_2
    iget-object v6, p0, Lf6/K;->c:Lb7/k;

    .line 109
    .line 110
    iget-object v8, p0, Lf6/K;->a:Landroid/net/Uri;

    .line 111
    .line 112
    iget-object v5, p0, Lf6/K;->b:Lt6/J;

    .line 113
    .line 114
    iget-object v5, v5, Lt6/J;->a:Lt6/l;

    .line 115
    .line 116
    invoke-interface {v5}, Lt6/l;->d()Ljava/util/Map;

    .line 117
    .line 118
    .line 119
    move-result-object v9

    .line 120
    iget-object v14, p0, Lf6/K;->d:Lf6/N;

    .line 121
    .line 122
    invoke-virtual/range {v6 .. v14}, Lb7/k;->y(Lt6/l;Landroid/net/Uri;Ljava/util/Map;JJLf6/N;)V

    .line 123
    .line 124
    .line 125
    iget-object v5, p0, Lf6/K;->m:Lf6/N;

    .line 126
    .line 127
    iget-object v5, v5, Lf6/N;->q:La6/b;

    .line 128
    .line 129
    if-eqz v5, :cond_3

    .line 130
    .line 131
    iget-object v5, p0, Lf6/K;->c:Lb7/k;

    .line 132
    .line 133
    iget-object v5, v5, Lb7/k;->c:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast v5, LJ5/k;

    .line 136
    .line 137
    instance-of v6, v5, LQ5/d;

    .line 138
    .line 139
    if-eqz v6, :cond_3

    .line 140
    .line 141
    check-cast v5, LQ5/d;

    .line 142
    .line 143
    iput-boolean v4, v5, LQ5/d;->p:Z

    .line 144
    .line 145
    :cond_3
    iget-boolean v5, p0, Lf6/K;->h:Z

    .line 146
    .line 147
    if-eqz v5, :cond_4

    .line 148
    .line 149
    iget-object v5, p0, Lf6/K;->c:Lb7/k;

    .line 150
    .line 151
    iget-wide v6, p0, Lf6/K;->i:J

    .line 152
    .line 153
    iget-object v5, v5, Lb7/k;->c:Ljava/lang/Object;

    .line 154
    .line 155
    check-cast v5, LJ5/k;

    .line 156
    .line 157
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    invoke-interface {v5, v10, v11, v6, v7}, LJ5/k;->a(JJ)V

    .line 161
    .line 162
    .line 163
    iput-boolean v0, p0, Lf6/K;->h:Z

    .line 164
    .line 165
    :cond_4
    :goto_3
    if-nez v1, :cond_7

    .line 166
    .line 167
    iget-boolean v5, p0, Lf6/K;->g:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 168
    .line 169
    if-nez v5, :cond_7

    .line 170
    .line 171
    :try_start_1
    iget-object v5, p0, Lf6/K;->e:Ls8/b;

    .line 172
    .line 173
    monitor-enter v5
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 174
    :goto_4
    :try_start_2
    iget-boolean v6, v5, Ls8/b;->b:Z

    .line 175
    .line 176
    if-nez v6, :cond_5

    .line 177
    .line 178
    invoke-virtual {v5}, Ljava/lang/Object;->wait()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 179
    .line 180
    .line 181
    goto :goto_4

    .line 182
    :catchall_1
    move-exception v0

    .line 183
    goto :goto_6

    .line 184
    :cond_5
    :try_start_3
    monitor-exit v5
    :try_end_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 185
    :try_start_4
    iget-object v5, p0, Lf6/K;->c:Lb7/k;

    .line 186
    .line 187
    iget-object v6, p0, Lf6/K;->f:LJ5/n;

    .line 188
    .line 189
    iget-object v7, v5, Lb7/k;->c:Ljava/lang/Object;

    .line 190
    .line 191
    check-cast v7, LJ5/k;

    .line 192
    .line 193
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 194
    .line 195
    .line 196
    iget-object v5, v5, Lb7/k;->d:Ljava/lang/Object;

    .line 197
    .line 198
    check-cast v5, LJ5/h;

    .line 199
    .line 200
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 201
    .line 202
    .line 203
    invoke-interface {v7, v5, v6}, LJ5/k;->g(LJ5/l;LJ5/n;)I

    .line 204
    .line 205
    .line 206
    move-result v1

    .line 207
    iget-object v5, p0, Lf6/K;->c:Lb7/k;

    .line 208
    .line 209
    iget-object v5, v5, Lb7/k;->d:Ljava/lang/Object;

    .line 210
    .line 211
    check-cast v5, LJ5/h;

    .line 212
    .line 213
    if-eqz v5, :cond_6

    .line 214
    .line 215
    iget-wide v5, v5, LJ5/h;->d:J

    .line 216
    .line 217
    goto :goto_5

    .line 218
    :cond_6
    move-wide v5, v2

    .line 219
    :goto_5
    iget-object v7, p0, Lf6/K;->m:Lf6/N;

    .line 220
    .line 221
    iget-wide v7, v7, Lf6/N;->i:J

    .line 222
    .line 223
    add-long/2addr v7, v10

    .line 224
    cmp-long v7, v5, v7

    .line 225
    .line 226
    if-lez v7, :cond_4

    .line 227
    .line 228
    iget-object v7, p0, Lf6/K;->e:Ls8/b;

    .line 229
    .line 230
    invoke-virtual {v7}, Ls8/b;->b()V

    .line 231
    .line 232
    .line 233
    iget-object v7, p0, Lf6/K;->m:Lf6/N;

    .line 234
    .line 235
    iget-object v8, v7, Lf6/N;->o:Landroid/os/Handler;

    .line 236
    .line 237
    iget-object v7, v7, Lf6/N;->n:Lf6/J;

    .line 238
    .line 239
    invoke-virtual {v8, v7}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 240
    .line 241
    .line 242
    move-wide v10, v5

    .line 243
    goto :goto_3

    .line 244
    :goto_6
    :try_start_5
    monitor-exit v5
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 245
    :try_start_6
    throw v0
    :try_end_6
    .catch Ljava/lang/InterruptedException; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 246
    :catch_1
    :try_start_7
    new-instance v0, Ljava/io/InterruptedIOException;

    .line 247
    .line 248
    invoke-direct {v0}, Ljava/io/InterruptedIOException;-><init>()V

    .line 249
    .line 250
    .line 251
    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 252
    :cond_7
    if-ne v1, v4, :cond_8

    .line 253
    .line 254
    move v1, v0

    .line 255
    goto :goto_8

    .line 256
    :cond_8
    iget-object v4, p0, Lf6/K;->c:Lb7/k;

    .line 257
    .line 258
    iget-object v4, v4, Lb7/k;->d:Ljava/lang/Object;

    .line 259
    .line 260
    check-cast v4, LJ5/h;

    .line 261
    .line 262
    if-eqz v4, :cond_9

    .line 263
    .line 264
    iget-wide v5, v4, LJ5/h;->d:J

    .line 265
    .line 266
    goto :goto_7

    .line 267
    :cond_9
    move-wide v5, v2

    .line 268
    :goto_7
    cmp-long v5, v5, v2

    .line 269
    .line 270
    if-eqz v5, :cond_b

    .line 271
    .line 272
    iget-object v5, p0, Lf6/K;->f:LJ5/n;

    .line 273
    .line 274
    if-eqz v4, :cond_a

    .line 275
    .line 276
    iget-wide v2, v4, LJ5/h;->d:J

    .line 277
    .line 278
    :cond_a
    iput-wide v2, v5, LJ5/n;->a:J

    .line 279
    .line 280
    :cond_b
    :goto_8
    iget-object v2, p0, Lf6/K;->b:Lt6/J;

    .line 281
    .line 282
    if-eqz v2, :cond_0

    .line 283
    .line 284
    :try_start_8
    invoke-virtual {v2}, Lt6/J;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_0

    .line 285
    .line 286
    .line 287
    goto/16 :goto_0

    .line 288
    .line 289
    :goto_9
    if-eq v1, v4, :cond_e

    .line 290
    .line 291
    iget-object v1, p0, Lf6/K;->c:Lb7/k;

    .line 292
    .line 293
    iget-object v1, v1, Lb7/k;->d:Ljava/lang/Object;

    .line 294
    .line 295
    check-cast v1, LJ5/h;

    .line 296
    .line 297
    if-eqz v1, :cond_c

    .line 298
    .line 299
    iget-wide v4, v1, LJ5/h;->d:J

    .line 300
    .line 301
    goto :goto_a

    .line 302
    :cond_c
    move-wide v4, v2

    .line 303
    :goto_a
    cmp-long v4, v4, v2

    .line 304
    .line 305
    if-eqz v4, :cond_e

    .line 306
    .line 307
    iget-object v4, p0, Lf6/K;->f:LJ5/n;

    .line 308
    .line 309
    if-eqz v1, :cond_d

    .line 310
    .line 311
    iget-wide v2, v1, LJ5/h;->d:J

    .line 312
    .line 313
    :cond_d
    iput-wide v2, v4, LJ5/n;->a:J

    .line 314
    .line 315
    :cond_e
    iget-object v1, p0, Lf6/K;->b:Lt6/J;

    .line 316
    .line 317
    if-eqz v1, :cond_f

    .line 318
    .line 319
    :try_start_9
    invoke-virtual {v1}, Lt6/J;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_2

    .line 320
    .line 321
    .line 322
    :catch_2
    :cond_f
    throw v0

    .line 323
    :cond_10
    return-void
.end method
