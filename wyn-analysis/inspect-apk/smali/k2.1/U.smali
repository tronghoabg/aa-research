.class public final Lk2/U;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo2/j;


# instance fields
.field public final a:Landroid/net/Uri;

.field public final b:LS1/z;

.field public final c:LDd/c;

.field public final d:Lk2/X;

.field public final e:Ls8/b;

.field public final f:LJ5/n;

.field public volatile g:Z

.field public h:Z

.field public i:J

.field public j:LS1/k;

.field public k:Ls2/C;

.field public l:Z

.field public final synthetic m:Lk2/X;


# direct methods
.method public constructor <init>(Lk2/X;Landroid/net/Uri;LS1/h;LDd/c;Lk2/X;Ls8/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lk2/U;->m:Lk2/X;

    .line 5
    .line 6
    iput-object p2, p0, Lk2/U;->a:Landroid/net/Uri;

    .line 7
    .line 8
    new-instance p1, LS1/z;

    .line 9
    .line 10
    invoke-direct {p1, p3}, LS1/z;-><init>(LS1/h;)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lk2/U;->b:LS1/z;

    .line 14
    .line 15
    iput-object p4, p0, Lk2/U;->c:LDd/c;

    .line 16
    .line 17
    iput-object p5, p0, Lk2/U;->d:Lk2/X;

    .line 18
    .line 19
    iput-object p6, p0, Lk2/U;->e:Ls8/b;

    .line 20
    .line 21
    new-instance p1, LJ5/n;

    .line 22
    .line 23
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object p1, p0, Lk2/U;->f:LJ5/n;

    .line 27
    .line 28
    const/4 p1, 0x1

    .line 29
    iput-boolean p1, p0, Lk2/U;->h:Z

    .line 30
    .line 31
    sget-object p1, Lk2/z;->b:Ljava/util/concurrent/atomic/AtomicLong;

    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicLong;->getAndIncrement()J

    .line 34
    .line 35
    .line 36
    const-wide/16 p1, 0x0

    .line 37
    .line 38
    invoke-virtual {p0, p1, p2}, Lk2/U;->a(J)LS1/k;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    iput-object p1, p0, Lk2/U;->j:LS1/k;

    .line 43
    .line 44
    return-void
.end method


# virtual methods
.method public final a(J)LS1/k;
    .locals 12

    .line 1
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 2
    .line 3
    iget-object v0, p0, Lk2/U;->m:Lk2/X;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    sget-object v5, Lk2/X;->P:Ljava/util/Map;

    .line 9
    .line 10
    iget-object v2, p0, Lk2/U;->a:Landroid/net/Uri;

    .line 11
    .line 12
    const-string v0, "The uri must be set."

    .line 13
    .line 14
    invoke-static {v2, v0}, LQ1/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    new-instance v1, LS1/k;

    .line 18
    .line 19
    const-wide/16 v8, -0x1

    .line 20
    .line 21
    const/4 v11, 0x6

    .line 22
    const/4 v3, 0x1

    .line 23
    const/4 v4, 0x0

    .line 24
    const/4 v10, 0x0

    .line 25
    move-wide v6, p1

    .line 26
    invoke-direct/range {v1 .. v11}, LS1/k;-><init>(Landroid/net/Uri;I[BLjava/util/Map;JJLjava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    return-object v1
.end method

.method public final g()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lk2/U;->g:Z

    .line 3
    .line 4
    return-void
.end method

.method public final load()V
    .locals 15

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    if-nez v1, :cond_d

    .line 4
    .line 5
    iget-boolean v2, p0, Lk2/U;->g:Z

    .line 6
    .line 7
    if-nez v2, :cond_d

    .line 8
    .line 9
    const-wide/16 v2, -0x1

    .line 10
    .line 11
    const/4 v4, 0x1

    .line 12
    :try_start_0
    iget-object v5, p0, Lk2/U;->f:LJ5/n;

    .line 13
    .line 14
    iget-wide v10, v5, LJ5/n;->a:J

    .line 15
    .line 16
    invoke-virtual {p0, v10, v11}, Lk2/U;->a(J)LS1/k;

    .line 17
    .line 18
    .line 19
    move-result-object v5

    .line 20
    iput-object v5, p0, Lk2/U;->j:LS1/k;

    .line 21
    .line 22
    iget-object v6, p0, Lk2/U;->b:LS1/z;

    .line 23
    .line 24
    invoke-virtual {v6, v5}, LS1/z;->y(LS1/k;)J

    .line 25
    .line 26
    .line 27
    move-result-wide v5

    .line 28
    iget-boolean v7, p0, Lk2/U;->g:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    .line 30
    if-eqz v7, :cond_2

    .line 31
    .line 32
    if-ne v1, v4, :cond_0

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_0
    iget-object v0, p0, Lk2/U;->c:LDd/c;

    .line 36
    .line 37
    invoke-virtual {v0}, LDd/c;->F()J

    .line 38
    .line 39
    .line 40
    move-result-wide v0

    .line 41
    cmp-long v0, v0, v2

    .line 42
    .line 43
    if-eqz v0, :cond_1

    .line 44
    .line 45
    iget-object v0, p0, Lk2/U;->f:LJ5/n;

    .line 46
    .line 47
    iget-object v1, p0, Lk2/U;->c:LDd/c;

    .line 48
    .line 49
    invoke-virtual {v1}, LDd/c;->F()J

    .line 50
    .line 51
    .line 52
    move-result-wide v1

    .line 53
    iput-wide v1, v0, LJ5/n;->a:J

    .line 54
    .line 55
    :cond_1
    :goto_1
    iget-object v0, p0, Lk2/U;->b:LS1/z;

    .line 56
    .line 57
    invoke-static {v0}, LFe/b;->m(LS1/h;)V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :cond_2
    cmp-long v7, v5, v2

    .line 62
    .line 63
    if-eqz v7, :cond_3

    .line 64
    .line 65
    add-long/2addr v5, v10

    .line 66
    :try_start_1
    iget-object v7, p0, Lk2/U;->m:Lk2/X;

    .line 67
    .line 68
    iget-object v8, v7, Lk2/X;->q:Landroid/os/Handler;

    .line 69
    .line 70
    new-instance v9, Lk2/S;

    .line 71
    .line 72
    const/4 v12, 0x2

    .line 73
    invoke-direct {v9, v7, v12}, Lk2/S;-><init>(Lk2/X;I)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v8, v9}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 77
    .line 78
    .line 79
    :cond_3
    move-wide v12, v5

    .line 80
    goto :goto_2

    .line 81
    :catchall_0
    move-exception v0

    .line 82
    goto/16 :goto_9

    .line 83
    .line 84
    :goto_2
    iget-object v5, p0, Lk2/U;->m:Lk2/X;

    .line 85
    .line 86
    iget-object v6, p0, Lk2/U;->b:LS1/z;

    .line 87
    .line 88
    iget-object v6, v6, LS1/z;->a:LS1/h;

    .line 89
    .line 90
    invoke-interface {v6}, LS1/h;->d()Ljava/util/Map;

    .line 91
    .line 92
    .line 93
    move-result-object v6

    .line 94
    invoke-static {v6}, LF2/b;->c(Ljava/util/Map;)LF2/b;

    .line 95
    .line 96
    .line 97
    move-result-object v6

    .line 98
    iput-object v6, v5, Lk2/X;->s:LF2/b;

    .line 99
    .line 100
    iget-object v5, p0, Lk2/U;->b:LS1/z;

    .line 101
    .line 102
    iget-object v6, p0, Lk2/U;->m:Lk2/X;

    .line 103
    .line 104
    iget-object v6, v6, Lk2/X;->s:LF2/b;

    .line 105
    .line 106
    if-eqz v6, :cond_4

    .line 107
    .line 108
    iget v6, v6, LF2/b;->f:I

    .line 109
    .line 110
    const/4 v7, -0x1

    .line 111
    if-eq v6, v7, :cond_4

    .line 112
    .line 113
    new-instance v7, Lk2/y;

    .line 114
    .line 115
    invoke-direct {v7, v5, v6, p0}, Lk2/y;-><init>(LS1/h;ILk2/U;)V

    .line 116
    .line 117
    .line 118
    iget-object v5, p0, Lk2/U;->m:Lk2/X;

    .line 119
    .line 120
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    new-instance v6, Lk2/W;

    .line 124
    .line 125
    invoke-direct {v6, v0, v4}, Lk2/W;-><init>(IZ)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v5, v6}, Lk2/X;->z(Lk2/W;)Ls2/C;

    .line 129
    .line 130
    .line 131
    move-result-object v5

    .line 132
    iput-object v5, p0, Lk2/U;->k:Ls2/C;

    .line 133
    .line 134
    sget-object v6, Lk2/X;->Q:LN1/n;

    .line 135
    .line 136
    invoke-interface {v5, v6}, Ls2/C;->c(LN1/n;)V

    .line 137
    .line 138
    .line 139
    goto :goto_3

    .line 140
    :cond_4
    move-object v7, v5

    .line 141
    :goto_3
    iget-object v6, p0, Lk2/U;->c:LDd/c;

    .line 142
    .line 143
    iget-object v8, p0, Lk2/U;->a:Landroid/net/Uri;

    .line 144
    .line 145
    iget-object v5, p0, Lk2/U;->b:LS1/z;

    .line 146
    .line 147
    iget-object v5, v5, LS1/z;->a:LS1/h;

    .line 148
    .line 149
    invoke-interface {v5}, LS1/h;->d()Ljava/util/Map;

    .line 150
    .line 151
    .line 152
    move-result-object v9

    .line 153
    iget-object v14, p0, Lk2/U;->d:Lk2/X;

    .line 154
    .line 155
    invoke-virtual/range {v6 .. v14}, LDd/c;->K(LS1/h;Landroid/net/Uri;Ljava/util/Map;JJLk2/X;)V

    .line 156
    .line 157
    .line 158
    iget-object v5, p0, Lk2/U;->m:Lk2/X;

    .line 159
    .line 160
    iget-object v5, v5, Lk2/X;->s:LF2/b;

    .line 161
    .line 162
    if-eqz v5, :cond_6

    .line 163
    .line 164
    iget-object v5, p0, Lk2/U;->c:LDd/c;

    .line 165
    .line 166
    iget-object v5, v5, LDd/c;->c:Ljava/lang/Object;

    .line 167
    .line 168
    check-cast v5, Ls2/m;

    .line 169
    .line 170
    if-nez v5, :cond_5

    .line 171
    .line 172
    goto :goto_4

    .line 173
    :cond_5
    invoke-interface {v5}, Ls2/m;->h()Ls2/m;

    .line 174
    .line 175
    .line 176
    move-result-object v5

    .line 177
    instance-of v6, v5, LL2/d;

    .line 178
    .line 179
    if-eqz v6, :cond_6

    .line 180
    .line 181
    check-cast v5, LL2/d;

    .line 182
    .line 183
    iput-boolean v4, v5, LL2/d;->s:Z

    .line 184
    .line 185
    :cond_6
    :goto_4
    iget-boolean v5, p0, Lk2/U;->h:Z

    .line 186
    .line 187
    if-eqz v5, :cond_7

    .line 188
    .line 189
    iget-object v5, p0, Lk2/U;->c:LDd/c;

    .line 190
    .line 191
    iget-wide v6, p0, Lk2/U;->i:J

    .line 192
    .line 193
    iget-object v5, v5, LDd/c;->c:Ljava/lang/Object;

    .line 194
    .line 195
    check-cast v5, Ls2/m;

    .line 196
    .line 197
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 198
    .line 199
    .line 200
    invoke-interface {v5, v10, v11, v6, v7}, Ls2/m;->a(JJ)V

    .line 201
    .line 202
    .line 203
    iput-boolean v0, p0, Lk2/U;->h:Z

    .line 204
    .line 205
    :cond_7
    :goto_5
    if-nez v1, :cond_9

    .line 206
    .line 207
    iget-boolean v5, p0, Lk2/U;->g:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 208
    .line 209
    if-nez v5, :cond_9

    .line 210
    .line 211
    :try_start_2
    iget-object v5, p0, Lk2/U;->e:Ls8/b;

    .line 212
    .line 213
    monitor-enter v5
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 214
    :goto_6
    :try_start_3
    iget-boolean v6, v5, Ls8/b;->b:Z

    .line 215
    .line 216
    if-nez v6, :cond_8

    .line 217
    .line 218
    invoke-virtual {v5}, Ljava/lang/Object;->wait()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 219
    .line 220
    .line 221
    goto :goto_6

    .line 222
    :catchall_1
    move-exception v0

    .line 223
    goto :goto_7

    .line 224
    :cond_8
    :try_start_4
    monitor-exit v5
    :try_end_4
    .catch Ljava/lang/InterruptedException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 225
    :try_start_5
    iget-object v5, p0, Lk2/U;->c:LDd/c;

    .line 226
    .line 227
    iget-object v6, p0, Lk2/U;->f:LJ5/n;

    .line 228
    .line 229
    iget-object v7, v5, LDd/c;->c:Ljava/lang/Object;

    .line 230
    .line 231
    check-cast v7, Ls2/m;

    .line 232
    .line 233
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 234
    .line 235
    .line 236
    iget-object v5, v5, LDd/c;->d:Ljava/lang/Object;

    .line 237
    .line 238
    check-cast v5, Ls2/j;

    .line 239
    .line 240
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 241
    .line 242
    .line 243
    invoke-interface {v7, v5, v6}, Ls2/m;->k(Ls2/n;LJ5/n;)I

    .line 244
    .line 245
    .line 246
    move-result v1

    .line 247
    iget-object v5, p0, Lk2/U;->c:LDd/c;

    .line 248
    .line 249
    invoke-virtual {v5}, LDd/c;->F()J

    .line 250
    .line 251
    .line 252
    move-result-wide v5

    .line 253
    iget-object v7, p0, Lk2/U;->m:Lk2/X;

    .line 254
    .line 255
    iget-wide v7, v7, Lk2/X;->i:J

    .line 256
    .line 257
    add-long/2addr v7, v10

    .line 258
    cmp-long v7, v5, v7

    .line 259
    .line 260
    if-lez v7, :cond_7

    .line 261
    .line 262
    iget-object v7, p0, Lk2/U;->e:Ls8/b;

    .line 263
    .line 264
    invoke-virtual {v7}, Ls8/b;->b()V

    .line 265
    .line 266
    .line 267
    iget-object v7, p0, Lk2/U;->m:Lk2/X;

    .line 268
    .line 269
    iget-object v8, v7, Lk2/X;->q:Landroid/os/Handler;

    .line 270
    .line 271
    iget-object v7, v7, Lk2/X;->p:Lk2/S;

    .line 272
    .line 273
    invoke-virtual {v8, v7}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 274
    .line 275
    .line 276
    move-wide v10, v5

    .line 277
    goto :goto_5

    .line 278
    :goto_7
    :try_start_6
    monitor-exit v5
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 279
    :try_start_7
    throw v0
    :try_end_7
    .catch Ljava/lang/InterruptedException; {:try_start_7 .. :try_end_7} :catch_0
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 280
    :catch_0
    :try_start_8
    new-instance v0, Ljava/io/InterruptedIOException;

    .line 281
    .line 282
    invoke-direct {v0}, Ljava/io/InterruptedIOException;-><init>()V

    .line 283
    .line 284
    .line 285
    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 286
    :cond_9
    if-ne v1, v4, :cond_a

    .line 287
    .line 288
    move v1, v0

    .line 289
    goto :goto_8

    .line 290
    :cond_a
    iget-object v4, p0, Lk2/U;->c:LDd/c;

    .line 291
    .line 292
    invoke-virtual {v4}, LDd/c;->F()J

    .line 293
    .line 294
    .line 295
    move-result-wide v4

    .line 296
    cmp-long v2, v4, v2

    .line 297
    .line 298
    if-eqz v2, :cond_b

    .line 299
    .line 300
    iget-object v2, p0, Lk2/U;->f:LJ5/n;

    .line 301
    .line 302
    iget-object v3, p0, Lk2/U;->c:LDd/c;

    .line 303
    .line 304
    invoke-virtual {v3}, LDd/c;->F()J

    .line 305
    .line 306
    .line 307
    move-result-wide v3

    .line 308
    iput-wide v3, v2, LJ5/n;->a:J

    .line 309
    .line 310
    :cond_b
    :goto_8
    iget-object v2, p0, Lk2/U;->b:LS1/z;

    .line 311
    .line 312
    invoke-static {v2}, LFe/b;->m(LS1/h;)V

    .line 313
    .line 314
    .line 315
    goto/16 :goto_0

    .line 316
    .line 317
    :goto_9
    if-eq v1, v4, :cond_c

    .line 318
    .line 319
    iget-object v1, p0, Lk2/U;->c:LDd/c;

    .line 320
    .line 321
    invoke-virtual {v1}, LDd/c;->F()J

    .line 322
    .line 323
    .line 324
    move-result-wide v4

    .line 325
    cmp-long v1, v4, v2

    .line 326
    .line 327
    if-eqz v1, :cond_c

    .line 328
    .line 329
    iget-object v1, p0, Lk2/U;->f:LJ5/n;

    .line 330
    .line 331
    iget-object v2, p0, Lk2/U;->c:LDd/c;

    .line 332
    .line 333
    invoke-virtual {v2}, LDd/c;->F()J

    .line 334
    .line 335
    .line 336
    move-result-wide v2

    .line 337
    iput-wide v2, v1, LJ5/n;->a:J

    .line 338
    .line 339
    :cond_c
    iget-object v1, p0, Lk2/U;->b:LS1/z;

    .line 340
    .line 341
    invoke-static {v1}, LFe/b;->m(LS1/h;)V

    .line 342
    .line 343
    .line 344
    throw v0

    .line 345
    :cond_d
    return-void
.end method
