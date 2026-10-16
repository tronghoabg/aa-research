.class public final synthetic LC8/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, LC8/g;->a:I

    iput-object p1, p0, LC8/g;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a()V
    .locals 5

    .line 1
    iget-object v0, p0, LC8/g;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LA7/b0;

    .line 4
    .line 5
    iget-object v1, v0, LA7/b0;->d:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    monitor-enter v0

    .line 14
    :try_start_0
    iget-object v1, v0, LA7/b0;->c:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, Ljava/util/concurrent/atomic/AtomicMarkableReference;

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicMarkableReference;->isMarked()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    iget-object v1, v0, LA7/b0;->c:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v1, Ljava/util/concurrent/atomic/AtomicMarkableReference;

    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicMarkableReference;->getReference()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, LT8/d;

    .line 33
    .line 34
    invoke-virtual {v1}, LT8/d;->a()Ljava/util/Map;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    iget-object v1, v0, LA7/b0;->c:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v1, Ljava/util/concurrent/atomic/AtomicMarkableReference;

    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicMarkableReference;->getReference()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    check-cast v3, LT8/d;

    .line 47
    .line 48
    const/4 v4, 0x0

    .line 49
    invoke-virtual {v1, v3, v4}, Ljava/util/concurrent/atomic/AtomicMarkableReference;->set(Ljava/lang/Object;Z)V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :catchall_0
    move-exception v1

    .line 54
    goto :goto_1

    .line 55
    :cond_0
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    if-eqz v2, :cond_1

    .line 57
    .line 58
    iget-object v1, v0, LA7/b0;->e:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v1, LX8/c;

    .line 61
    .line 62
    iget-object v3, v1, LX8/c;->b:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v3, LT8/g;

    .line 65
    .line 66
    iget-object v1, v1, LX8/c;->a:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v1, Ljava/lang/String;

    .line 69
    .line 70
    iget-boolean v0, v0, LA7/b0;->b:Z

    .line 71
    .line 72
    invoke-virtual {v3, v1, v2, v0}, LT8/g;->h(Ljava/lang/String;Ljava/util/Map;Z)V

    .line 73
    .line 74
    .line 75
    :cond_1
    return-void

    .line 76
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 77
    throw v1
.end method

.method private final b()V
    .locals 6

    .line 1
    iget-object v0, p0, LC8/g;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LV5/f;

    .line 4
    .line 5
    iget-object v1, v0, LV5/f;->a:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v1

    .line 8
    :try_start_0
    iget-boolean v2, v0, LV5/f;->l:Z

    .line 9
    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    monitor-exit v1

    .line 13
    return-void

    .line 14
    :catchall_0
    move-exception v0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-wide v2, v0, LV5/f;->k:J

    .line 17
    .line 18
    const-wide/16 v4, 0x1

    .line 19
    .line 20
    sub-long/2addr v2, v4

    .line 21
    iput-wide v2, v0, LV5/f;->k:J

    .line 22
    .line 23
    const-wide/16 v4, 0x0

    .line 24
    .line 25
    cmp-long v2, v2, v4

    .line 26
    .line 27
    if-lez v2, :cond_1

    .line 28
    .line 29
    monitor-exit v1

    .line 30
    return-void

    .line 31
    :cond_1
    if-gez v2, :cond_2

    .line 32
    .line 33
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 34
    .line 35
    invoke-direct {v2}, Ljava/lang/IllegalStateException;-><init>()V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v2}, LV5/f;->b(Ljava/lang/IllegalStateException;)V

    .line 39
    .line 40
    .line 41
    monitor-exit v1

    .line 42
    return-void

    .line 43
    :cond_2
    invoke-virtual {v0}, LV5/f;->a()V

    .line 44
    .line 45
    .line 46
    monitor-exit v1

    .line 47
    return-void

    .line 48
    :goto_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    throw v0
.end method

.method private final c()V
    .locals 7

    .line 1
    iget-object v0, p0, LC8/g;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/work/impl/workers/ConstraintTrackingWorker;

    .line 4
    .line 5
    const-string v1, "this$0"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object v1, v0, Landroidx/work/impl/workers/ConstraintTrackingWorker;->d:LU3/j;

    .line 11
    .line 12
    iget-object v1, v1, LU3/h;->a:Ljava/lang/Object;

    .line 13
    .line 14
    instance-of v1, v1, LU3/a;

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    goto/16 :goto_1

    .line 19
    .line 20
    :cond_0
    invoke-virtual {v0}, LJ3/q;->getInputData()LJ3/h;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    const-string v2, "androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME"

    .line 25
    .line 26
    invoke-virtual {v1, v2}, LJ3/h;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-static {}, LJ3/r;->d()LJ3/r;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    const-string v3, "get()"

    .line 35
    .line 36
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    if-eqz v1, :cond_7

    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-nez v3, :cond_1

    .line 46
    .line 47
    goto/16 :goto_3

    .line 48
    .line 49
    :cond_1
    invoke-virtual {v0}, LJ3/q;->getWorkerFactory()LJ3/z;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    invoke-virtual {v0}, LJ3/q;->getApplicationContext()Landroid/content/Context;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    iget-object v5, v0, Landroidx/work/impl/workers/ConstraintTrackingWorker;->a:Landroidx/work/WorkerParameters;

    .line 58
    .line 59
    invoke-virtual {v3, v4, v1, v5}, LJ3/z;->a(Landroid/content/Context;Ljava/lang/String;Landroidx/work/WorkerParameters;)LJ3/q;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    iput-object v3, v0, Landroidx/work/impl/workers/ConstraintTrackingWorker;->e:LJ3/q;

    .line 64
    .line 65
    if-nez v3, :cond_2

    .line 66
    .line 67
    sget-object v1, LW3/a;->a:Ljava/lang/String;

    .line 68
    .line 69
    const-string v3, "No worker to delegate to."

    .line 70
    .line 71
    invoke-virtual {v2, v1, v3}, LJ3/r;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    iget-object v0, v0, Landroidx/work/impl/workers/ConstraintTrackingWorker;->d:LU3/j;

    .line 75
    .line 76
    const-string v1, "future"

    .line 77
    .line 78
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    new-instance v1, LJ3/m;

    .line 82
    .line 83
    invoke-direct {v1}, LJ3/m;-><init>()V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0, v1}, LU3/j;->i(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :cond_2
    invoke-virtual {v0}, LJ3/q;->getApplicationContext()Landroid/content/Context;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    invoke-static {v3}, LK3/q;->c(Landroid/content/Context;)LK3/q;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    iget-object v4, v3, LK3/q;->c:Landroidx/work/impl/WorkDatabase;

    .line 99
    .line 100
    invoke-virtual {v4}, Landroidx/work/impl/WorkDatabase;->u()LS3/q;

    .line 101
    .line 102
    .line 103
    move-result-object v4

    .line 104
    invoke-virtual {v0}, LJ3/q;->getId()Ljava/util/UUID;

    .line 105
    .line 106
    .line 107
    move-result-object v5

    .line 108
    invoke-virtual {v5}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v5

    .line 112
    const-string v6, "id.toString()"

    .line 113
    .line 114
    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v4, v5}, LS3/q;->h(Ljava/lang/String;)LS3/p;

    .line 118
    .line 119
    .line 120
    move-result-object v4

    .line 121
    if-nez v4, :cond_3

    .line 122
    .line 123
    iget-object v0, v0, Landroidx/work/impl/workers/ConstraintTrackingWorker;->d:LU3/j;

    .line 124
    .line 125
    const-string v1, "future"

    .line 126
    .line 127
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    sget-object v1, LW3/a;->a:Ljava/lang/String;

    .line 131
    .line 132
    new-instance v1, LJ3/m;

    .line 133
    .line 134
    invoke-direct {v1}, LJ3/m;-><init>()V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v0, v1}, LU3/j;->i(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    return-void

    .line 141
    :cond_3
    new-instance v5, Lb7/k;

    .line 142
    .line 143
    iget-object v3, v3, LK3/q;->j:LS3/n;

    .line 144
    .line 145
    const-string v6, "workManagerImpl.trackers"

    .line 146
    .line 147
    invoke-static {v3, v6}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    invoke-direct {v5, v3, v0}, Lb7/k;-><init>(LS3/n;LO3/b;)V

    .line 151
    .line 152
    .line 153
    invoke-static {v4}, Lr7/e;->C(Ljava/lang/Object;)Ljava/util/List;

    .line 154
    .line 155
    .line 156
    move-result-object v3

    .line 157
    check-cast v3, Ljava/lang/Iterable;

    .line 158
    .line 159
    invoke-virtual {v5, v3}, Lb7/k;->F(Ljava/lang/Iterable;)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v0}, LJ3/q;->getId()Ljava/util/UUID;

    .line 163
    .line 164
    .line 165
    move-result-object v3

    .line 166
    invoke-virtual {v3}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v3

    .line 170
    const-string v4, "id.toString()"

    .line 171
    .line 172
    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v5, v3}, Lb7/k;->m(Ljava/lang/String;)Z

    .line 176
    .line 177
    .line 178
    move-result v3

    .line 179
    if-eqz v3, :cond_6

    .line 180
    .line 181
    sget-object v3, LW3/a;->a:Ljava/lang/String;

    .line 182
    .line 183
    const-string v4, "Constraints met for delegate "

    .line 184
    .line 185
    invoke-virtual {v4, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v4

    .line 189
    invoke-virtual {v2, v3, v4}, LJ3/r;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    :try_start_0
    iget-object v3, v0, Landroidx/work/impl/workers/ConstraintTrackingWorker;->e:LJ3/q;

    .line 193
    .line 194
    invoke-static {v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v3}, LJ3/q;->startWork()Lp8/p;

    .line 198
    .line 199
    .line 200
    move-result-object v3

    .line 201
    const-string v4, "delegate!!.startWork()"

    .line 202
    .line 203
    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    new-instance v4, LT3/r;

    .line 207
    .line 208
    const/16 v5, 0xf

    .line 209
    .line 210
    invoke-direct {v4, v5, v0, v3}, LT3/r;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {v0}, LJ3/q;->getBackgroundExecutor()Ljava/util/concurrent/Executor;

    .line 214
    .line 215
    .line 216
    move-result-object v5

    .line 217
    invoke-interface {v3, v4, v5}, Lp8/p;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 218
    .line 219
    .line 220
    return-void

    .line 221
    :catchall_0
    move-exception v3

    .line 222
    sget-object v4, LW3/a;->a:Ljava/lang/String;

    .line 223
    .line 224
    const-string v5, "Delegated worker "

    .line 225
    .line 226
    const-string v6, " threw exception in startWork."

    .line 227
    .line 228
    invoke-static {v5, v1, v6}, LA7/p0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v1

    .line 232
    iget v5, v2, LJ3/r;->a:I

    .line 233
    .line 234
    const/4 v6, 0x3

    .line 235
    if-gt v5, v6, :cond_4

    .line 236
    .line 237
    invoke-static {v4, v1, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 238
    .line 239
    .line 240
    :cond_4
    iget-object v1, v0, Landroidx/work/impl/workers/ConstraintTrackingWorker;->b:Ljava/lang/Object;

    .line 241
    .line 242
    monitor-enter v1

    .line 243
    :try_start_1
    iget-boolean v3, v0, Landroidx/work/impl/workers/ConstraintTrackingWorker;->c:Z

    .line 244
    .line 245
    if-eqz v3, :cond_5

    .line 246
    .line 247
    const-string v3, "Constraints were unmet, Retrying."

    .line 248
    .line 249
    invoke-virtual {v2, v4, v3}, LJ3/r;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 250
    .line 251
    .line 252
    iget-object v0, v0, Landroidx/work/impl/workers/ConstraintTrackingWorker;->d:LU3/j;

    .line 253
    .line 254
    const-string v2, "future"

    .line 255
    .line 256
    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    new-instance v2, LJ3/n;

    .line 260
    .line 261
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 262
    .line 263
    .line 264
    invoke-virtual {v0, v2}, LU3/j;->i(Ljava/lang/Object;)Z

    .line 265
    .line 266
    .line 267
    goto :goto_0

    .line 268
    :catchall_1
    move-exception v0

    .line 269
    goto :goto_2

    .line 270
    :cond_5
    iget-object v0, v0, Landroidx/work/impl/workers/ConstraintTrackingWorker;->d:LU3/j;

    .line 271
    .line 272
    const-string v2, "future"

    .line 273
    .line 274
    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 275
    .line 276
    .line 277
    new-instance v2, LJ3/m;

    .line 278
    .line 279
    invoke-direct {v2}, LJ3/m;-><init>()V

    .line 280
    .line 281
    .line 282
    invoke-virtual {v0, v2}, LU3/j;->i(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 283
    .line 284
    .line 285
    :goto_0
    monitor-exit v1

    .line 286
    :goto_1
    return-void

    .line 287
    :goto_2
    monitor-exit v1

    .line 288
    throw v0

    .line 289
    :cond_6
    sget-object v3, LW3/a;->a:Ljava/lang/String;

    .line 290
    .line 291
    new-instance v4, Ljava/lang/StringBuilder;

    .line 292
    .line 293
    const-string v5, "Constraints not met for delegate "

    .line 294
    .line 295
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 296
    .line 297
    .line 298
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 299
    .line 300
    .line 301
    const-string v1, ". Requesting retry."

    .line 302
    .line 303
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 304
    .line 305
    .line 306
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    move-result-object v1

    .line 310
    invoke-virtual {v2, v3, v1}, LJ3/r;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 311
    .line 312
    .line 313
    iget-object v0, v0, Landroidx/work/impl/workers/ConstraintTrackingWorker;->d:LU3/j;

    .line 314
    .line 315
    const-string v1, "future"

    .line 316
    .line 317
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 318
    .line 319
    .line 320
    new-instance v1, LJ3/n;

    .line 321
    .line 322
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 323
    .line 324
    .line 325
    invoke-virtual {v0, v1}, LU3/j;->i(Ljava/lang/Object;)Z

    .line 326
    .line 327
    .line 328
    return-void

    .line 329
    :cond_7
    :goto_3
    sget-object v1, LW3/a;->a:Ljava/lang/String;

    .line 330
    .line 331
    const-string v3, "No worker to delegate to."

    .line 332
    .line 333
    invoke-virtual {v2, v1, v3}, LJ3/r;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 334
    .line 335
    .line 336
    iget-object v0, v0, Landroidx/work/impl/workers/ConstraintTrackingWorker;->d:LU3/j;

    .line 337
    .line 338
    const-string v1, "future"

    .line 339
    .line 340
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 341
    .line 342
    .line 343
    new-instance v1, LJ3/m;

    .line 344
    .line 345
    invoke-direct {v1}, LJ3/m;-><init>()V

    .line 346
    .line 347
    .line 348
    invoke-virtual {v0, v1}, LU3/j;->i(Ljava/lang/Object;)Z

    .line 349
    .line 350
    .line 351
    return-void
.end method

.method private final d()V
    .locals 7

    .line 1
    iget-object v0, p0, LC8/g;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LC8/i;

    .line 4
    .line 5
    iget-object v1, v0, LC8/i;->e:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ljava/util/ArrayDeque;

    .line 8
    .line 9
    monitor-enter v1

    .line 10
    :try_start_0
    iget-object v2, v0, LC8/i;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v2, Landroid/content/SharedPreferences;

    .line 13
    .line 14
    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    iget-object v3, v0, LC8/i;->c:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v3, Ljava/lang/String;

    .line 21
    .line 22
    new-instance v4, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 25
    .line 26
    .line 27
    iget-object v5, v0, LC8/i;->e:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v5, Ljava/util/ArrayDeque;

    .line 30
    .line 31
    invoke-virtual {v5}, Ljava/util/ArrayDeque;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v6

    .line 39
    if-eqz v6, :cond_0

    .line 40
    .line 41
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v6

    .line 45
    check-cast v6, Ljava/lang/String;

    .line 46
    .line 47
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    iget-object v6, v0, LC8/i;->d:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v6, Ljava/lang/String;

    .line 53
    .line 54
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_0
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-interface {v2, v3, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 67
    .line 68
    .line 69
    monitor-exit v1

    .line 70
    return-void

    .line 71
    :catchall_0
    move-exception v0

    .line 72
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 73
    throw v0
.end method


# virtual methods
.method public final run()V
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const/16 v0, 0x404

    .line 4
    .line 5
    const/16 v2, 0xa

    .line 6
    .line 7
    const/16 v5, 0x9

    .line 8
    .line 9
    const/4 v7, 0x0

    .line 10
    const/4 v8, 0x1

    .line 11
    iget v9, v1, LC8/g;->a:I

    .line 12
    .line 13
    packed-switch v9, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    iget-object v0, v1, LC8/g;->b:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Landroidx/lifecycle/J;

    .line 19
    .line 20
    const-string v2, "this$0"

    .line 21
    .line 22
    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    iget v2, v0, Landroidx/lifecycle/J;->b:I

    .line 26
    .line 27
    iget-object v3, v0, Landroidx/lifecycle/J;->f:Landroidx/lifecycle/x;

    .line 28
    .line 29
    if-nez v2, :cond_0

    .line 30
    .line 31
    iput-boolean v8, v0, Landroidx/lifecycle/J;->c:Z

    .line 32
    .line 33
    sget-object v2, Landroidx/lifecycle/m;->ON_PAUSE:Landroidx/lifecycle/m;

    .line 34
    .line 35
    invoke-virtual {v3, v2}, Landroidx/lifecycle/x;->f(Landroidx/lifecycle/m;)V

    .line 36
    .line 37
    .line 38
    :cond_0
    iget v2, v0, Landroidx/lifecycle/J;->a:I

    .line 39
    .line 40
    if-nez v2, :cond_1

    .line 41
    .line 42
    iget-boolean v2, v0, Landroidx/lifecycle/J;->c:Z

    .line 43
    .line 44
    if-eqz v2, :cond_1

    .line 45
    .line 46
    sget-object v2, Landroidx/lifecycle/m;->ON_STOP:Landroidx/lifecycle/m;

    .line 47
    .line 48
    invoke-virtual {v3, v2}, Landroidx/lifecycle/x;->f(Landroidx/lifecycle/m;)V

    .line 49
    .line 50
    .line 51
    iput-boolean v8, v0, Landroidx/lifecycle/J;->d:Z

    .line 52
    .line 53
    :cond_1
    return-void

    .line 54
    :pswitch_0
    iget-object v0, v1, LC8/g;->b:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v0, Landroidx/activity/m;

    .line 57
    .line 58
    invoke-static {v0}, Landroidx/activity/m;->a(Landroidx/activity/m;)V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :pswitch_1
    iget-object v0, v1, LC8/g;->b:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v0, Landroidx/activity/l;

    .line 65
    .line 66
    iget-object v2, v0, Landroidx/activity/l;->b:Ljava/lang/Runnable;

    .line 67
    .line 68
    if-eqz v2, :cond_2

    .line 69
    .line 70
    invoke-interface {v2}, Ljava/lang/Runnable;->run()V

    .line 71
    .line 72
    .line 73
    iput-object v7, v0, Landroidx/activity/l;->b:Ljava/lang/Runnable;

    .line 74
    .line 75
    :cond_2
    return-void

    .line 76
    :pswitch_2
    iget-object v0, v1, LC8/g;->b:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v0, Landroidx/activity/ComponentActivity;

    .line 79
    .line 80
    invoke-virtual {v0}, Landroidx/activity/ComponentActivity;->invalidateMenu()V

    .line 81
    .line 82
    .line 83
    return-void

    .line 84
    :pswitch_3
    iget-object v0, v1, LC8/g;->b:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v0, LA/e0;

    .line 87
    .line 88
    invoke-virtual {v0}, LA/e0;->u()V

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    :pswitch_4
    iget-object v0, v1, LC8/g;->b:Ljava/lang/Object;

    .line 93
    .line 94
    move-object v9, v0

    .line 95
    check-cast v9, Landroid/app/Activity;

    .line 96
    .line 97
    invoke-virtual {v9}, Landroid/app/Activity;->isFinishing()Z

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    if-nez v0, :cond_d

    .line 102
    .line 103
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 104
    .line 105
    const/16 v10, 0x1c

    .line 106
    .line 107
    if-lt v0, v10, :cond_3

    .line 108
    .line 109
    sget-object v0, LX0/d;->a:Ljava/lang/Class;

    .line 110
    .line 111
    invoke-virtual {v9}, Landroid/app/Activity;->recreate()V

    .line 112
    .line 113
    .line 114
    goto/16 :goto_7

    .line 115
    .line 116
    :cond_3
    sget-object v10, LX0/d;->a:Ljava/lang/Class;

    .line 117
    .line 118
    const/16 v10, 0x1b

    .line 119
    .line 120
    const/16 v11, 0x1a

    .line 121
    .line 122
    if-eq v0, v11, :cond_5

    .line 123
    .line 124
    if-ne v0, v10, :cond_4

    .line 125
    .line 126
    goto :goto_0

    .line 127
    :cond_4
    const/4 v12, 0x0

    .line 128
    goto :goto_1

    .line 129
    :cond_5
    :goto_0
    move v12, v8

    .line 130
    :goto_1
    sget-object v13, LX0/d;->f:Ljava/lang/reflect/Method;

    .line 131
    .line 132
    if-eqz v12, :cond_6

    .line 133
    .line 134
    if-nez v13, :cond_6

    .line 135
    .line 136
    goto/16 :goto_6

    .line 137
    .line 138
    :cond_6
    sget-object v12, LX0/d;->e:Ljava/lang/reflect/Method;

    .line 139
    .line 140
    if-nez v12, :cond_7

    .line 141
    .line 142
    sget-object v12, LX0/d;->d:Ljava/lang/reflect/Method;

    .line 143
    .line 144
    if-nez v12, :cond_7

    .line 145
    .line 146
    goto/16 :goto_6

    .line 147
    .line 148
    :cond_7
    :try_start_0
    sget-object v12, LX0/d;->c:Ljava/lang/reflect/Field;

    .line 149
    .line 150
    invoke-virtual {v12, v9}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v12

    .line 154
    if-nez v12, :cond_8

    .line 155
    .line 156
    goto/16 :goto_6

    .line 157
    .line 158
    :cond_8
    sget-object v14, LX0/d;->b:Ljava/lang/reflect/Field;

    .line 159
    .line 160
    invoke-virtual {v14, v9}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v14

    .line 164
    if-nez v14, :cond_9

    .line 165
    .line 166
    goto :goto_6

    .line 167
    :cond_9
    invoke-virtual {v9}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 168
    .line 169
    .line 170
    move-result-object v15

    .line 171
    const/16 v16, 0x3

    .line 172
    .line 173
    new-instance v3, LX0/c;

    .line 174
    .line 175
    invoke-direct {v3, v9}, LX0/c;-><init>(Landroid/app/Activity;)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v15, v3}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 179
    .line 180
    .line 181
    const/16 v17, 0x2

    .line 182
    .line 183
    sget-object v4, LX0/d;->g:Landroid/os/Handler;

    .line 184
    .line 185
    const/16 v18, 0x0

    .line 186
    .line 187
    :try_start_1
    new-instance v6, LL7/b;

    .line 188
    .line 189
    invoke-direct {v6, v5, v3, v12}, LL7/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v4, v6}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 193
    .line 194
    .line 195
    if-eq v0, v11, :cond_b

    .line 196
    .line 197
    if-ne v0, v10, :cond_a

    .line 198
    .line 199
    goto :goto_2

    .line 200
    :cond_a
    move/from16 v0, v18

    .line 201
    .line 202
    goto :goto_3

    .line 203
    :cond_b
    :goto_2
    move v0, v8

    .line 204
    :goto_3
    if-eqz v0, :cond_c

    .line 205
    .line 206
    :try_start_2
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    new-array v5, v5, [Ljava/lang/Object;

    .line 211
    .line 212
    aput-object v12, v5, v18

    .line 213
    .line 214
    aput-object v7, v5, v8

    .line 215
    .line 216
    aput-object v7, v5, v17

    .line 217
    .line 218
    aput-object v0, v5, v16

    .line 219
    .line 220
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 221
    .line 222
    const/4 v6, 0x4

    .line 223
    aput-object v0, v5, v6

    .line 224
    .line 225
    const/4 v6, 0x5

    .line 226
    aput-object v7, v5, v6

    .line 227
    .line 228
    const/4 v6, 0x6

    .line 229
    aput-object v7, v5, v6

    .line 230
    .line 231
    const/4 v6, 0x7

    .line 232
    aput-object v0, v5, v6

    .line 233
    .line 234
    const/16 v6, 0x8

    .line 235
    .line 236
    aput-object v0, v5, v6

    .line 237
    .line 238
    invoke-virtual {v13, v14, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    goto :goto_4

    .line 242
    :catchall_0
    move-exception v0

    .line 243
    goto :goto_5

    .line 244
    :cond_c
    invoke-virtual {v9}, Landroid/app/Activity;->recreate()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 245
    .line 246
    .line 247
    :goto_4
    :try_start_3
    new-instance v0, LL7/b;

    .line 248
    .line 249
    invoke-direct {v0, v2, v15, v3}, LL7/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 250
    .line 251
    .line 252
    invoke-virtual {v4, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 253
    .line 254
    .line 255
    goto :goto_7

    .line 256
    :goto_5
    new-instance v5, LL7/b;

    .line 257
    .line 258
    invoke-direct {v5, v2, v15, v3}, LL7/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 259
    .line 260
    .line 261
    invoke-virtual {v4, v5}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 262
    .line 263
    .line 264
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 265
    :catchall_1
    :goto_6
    invoke-virtual {v9}, Landroid/app/Activity;->recreate()V

    .line 266
    .line 267
    .line 268
    :cond_d
    :goto_7
    return-void

    .line 269
    :pswitch_5
    iget-object v0, v1, LC8/g;->b:Ljava/lang/Object;

    .line 270
    .line 271
    check-cast v0, LWb/a;

    .line 272
    .line 273
    iget-object v2, v0, LWb/a;->c:Luc/h;

    .line 274
    .line 275
    iget-object v0, v0, LWb/a;->b:Lxa/d;

    .line 276
    .line 277
    iget-object v0, v0, Lxa/d;->b:Ljava/lang/Object;

    .line 278
    .line 279
    check-cast v0, Landroid/net/ConnectivityManager;

    .line 280
    .line 281
    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetwork()Landroid/net/Network;

    .line 282
    .line 283
    .line 284
    move-result-object v3

    .line 285
    invoke-virtual {v0, v3}, Landroid/net/ConnectivityManager;->getNetworkCapabilities(Landroid/net/Network;)Landroid/net/NetworkCapabilities;

    .line 286
    .line 287
    .line 288
    move-result-object v0

    .line 289
    invoke-static {v0}, Lxa/d;->m(Landroid/net/NetworkCapabilities;)Ljava/util/ArrayList;

    .line 290
    .line 291
    .line 292
    move-result-object v0

    .line 293
    invoke-virtual {v2, v0}, Luc/h;->a(Ljava/lang/Object;)V

    .line 294
    .line 295
    .line 296
    return-void

    .line 297
    :pswitch_6
    iget-object v0, v1, LC8/g;->b:Ljava/lang/Object;

    .line 298
    .line 299
    check-cast v0, LWa/h;

    .line 300
    .line 301
    iget-object v0, v0, LWa/h;->c:Ltc/g;

    .line 302
    .line 303
    invoke-virtual {v0}, Ltc/g;->c()V

    .line 304
    .line 305
    .line 306
    return-void

    .line 307
    :pswitch_7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 308
    .line 309
    const-string v2, "Service took too long to process intent: "

    .line 310
    .line 311
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 312
    .line 313
    .line 314
    iget-object v2, v1, LC8/g;->b:Ljava/lang/Object;

    .line 315
    .line 316
    check-cast v2, LW9/F;

    .line 317
    .line 318
    iget-object v3, v2, LW9/F;->a:Landroid/content/Intent;

    .line 319
    .line 320
    invoke-virtual {v3}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object v3

    .line 324
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 325
    .line 326
    .line 327
    const-string v3, " finishing."

    .line 328
    .line 329
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 330
    .line 331
    .line 332
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 333
    .line 334
    .line 335
    move-result-object v0

    .line 336
    const-string v3, "FirebaseMessaging"

    .line 337
    .line 338
    invoke-static {v3, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 339
    .line 340
    .line 341
    iget-object v0, v2, LW9/F;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 342
    .line 343
    invoke-virtual {v0, v7}, Lcom/google/android/gms/tasks/TaskCompletionSource;->trySetResult(Ljava/lang/Object;)Z

    .line 344
    .line 345
    .line 346
    return-void

    .line 347
    :pswitch_8
    invoke-direct {v1}, LC8/g;->d()V

    .line 348
    .line 349
    .line 350
    return-void

    .line 351
    :pswitch_9
    invoke-direct {v1}, LC8/g;->c()V

    .line 352
    .line 353
    .line 354
    return-void

    .line 355
    :pswitch_a
    iget-object v0, v1, LC8/g;->b:Ljava/lang/Object;

    .line 356
    .line 357
    check-cast v0, LW1/t;

    .line 358
    .line 359
    iget-wide v2, v0, LW1/t;->h0:J

    .line 360
    .line 361
    const-wide/32 v4, 0x493e0

    .line 362
    .line 363
    .line 364
    cmp-long v2, v2, v4

    .line 365
    .line 366
    if-ltz v2, :cond_e

    .line 367
    .line 368
    iget-object v2, v0, LW1/t;->r:Lxa/d;

    .line 369
    .line 370
    iget-object v2, v2, Lxa/d;->b:Ljava/lang/Object;

    .line 371
    .line 372
    check-cast v2, LW1/v;

    .line 373
    .line 374
    iput-boolean v8, v2, LW1/v;->O0:Z

    .line 375
    .line 376
    const-wide/16 v2, 0x0

    .line 377
    .line 378
    iput-wide v2, v0, LW1/t;->h0:J

    .line 379
    .line 380
    :cond_e
    return-void

    .line 381
    :pswitch_b
    iget-object v0, v1, LC8/g;->b:Ljava/lang/Object;

    .line 382
    .line 383
    check-cast v0, Luc/h;

    .line 384
    .line 385
    invoke-virtual {v0, v7}, Luc/h;->a(Ljava/lang/Object;)V

    .line 386
    .line 387
    .line 388
    return-void

    .line 389
    :pswitch_c
    invoke-direct {v1}, LC8/g;->b()V

    .line 390
    .line 391
    .line 392
    return-void

    .line 393
    :pswitch_d
    iget-object v2, v1, LC8/g;->b:Ljava/lang/Object;

    .line 394
    .line 395
    check-cast v2, LV1/d;

    .line 396
    .line 397
    invoke-virtual {v2}, LV1/d;->G()LV1/a;

    .line 398
    .line 399
    .line 400
    move-result-object v3

    .line 401
    new-instance v4, LV1/b;

    .line 402
    .line 403
    const/16 v5, 0x12

    .line 404
    .line 405
    invoke-direct {v4, v5}, LV1/b;-><init>(I)V

    .line 406
    .line 407
    .line 408
    invoke-virtual {v2, v3, v0, v4}, LV1/d;->L(LV1/a;ILQ1/g;)V

    .line 409
    .line 410
    .line 411
    iget-object v0, v2, LV1/d;->f:LQ1/j;

    .line 412
    .line 413
    invoke-virtual {v0}, LQ1/j;->d()V

    .line 414
    .line 415
    .line 416
    return-void

    .line 417
    :pswitch_e
    invoke-direct {v1}, LC8/g;->a()V

    .line 418
    .line 419
    .line 420
    return-void

    .line 421
    :pswitch_f
    const/16 v18, 0x0

    .line 422
    .line 423
    iget-object v0, v1, LC8/g;->b:Ljava/lang/Object;

    .line 424
    .line 425
    check-cast v0, LX8/c;

    .line 426
    .line 427
    iget-object v2, v0, LX8/c;->g:Ljava/lang/Object;

    .line 428
    .line 429
    check-cast v2, Ljava/util/concurrent/atomic/AtomicMarkableReference;

    .line 430
    .line 431
    monitor-enter v2

    .line 432
    :try_start_4
    iget-object v3, v0, LX8/c;->g:Ljava/lang/Object;

    .line 433
    .line 434
    check-cast v3, Ljava/util/concurrent/atomic/AtomicMarkableReference;

    .line 435
    .line 436
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicMarkableReference;->isMarked()Z

    .line 437
    .line 438
    .line 439
    move-result v3

    .line 440
    if-eqz v3, :cond_f

    .line 441
    .line 442
    iget-object v3, v0, LX8/c;->g:Ljava/lang/Object;

    .line 443
    .line 444
    check-cast v3, Ljava/util/concurrent/atomic/AtomicMarkableReference;

    .line 445
    .line 446
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicMarkableReference;->getReference()Ljava/lang/Object;

    .line 447
    .line 448
    .line 449
    move-result-object v3

    .line 450
    move-object v7, v3

    .line 451
    check-cast v7, Ljava/lang/String;

    .line 452
    .line 453
    iget-object v3, v0, LX8/c;->g:Ljava/lang/Object;

    .line 454
    .line 455
    check-cast v3, Ljava/util/concurrent/atomic/AtomicMarkableReference;

    .line 456
    .line 457
    move/from16 v4, v18

    .line 458
    .line 459
    invoke-virtual {v3, v7, v4}, Ljava/util/concurrent/atomic/AtomicMarkableReference;->set(Ljava/lang/Object;Z)V

    .line 460
    .line 461
    .line 462
    move v6, v8

    .line 463
    goto :goto_8

    .line 464
    :catchall_2
    move-exception v0

    .line 465
    goto :goto_9

    .line 466
    :cond_f
    const/4 v6, 0x0

    .line 467
    :goto_8
    monitor-exit v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 468
    if-eqz v6, :cond_10

    .line 469
    .line 470
    iget-object v2, v0, LX8/c;->b:Ljava/lang/Object;

    .line 471
    .line 472
    check-cast v2, LT8/g;

    .line 473
    .line 474
    iget-object v0, v0, LX8/c;->a:Ljava/lang/Object;

    .line 475
    .line 476
    check-cast v0, Ljava/lang/String;

    .line 477
    .line 478
    invoke-virtual {v2, v0, v7}, LT8/g;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 479
    .line 480
    .line 481
    :cond_10
    return-void

    .line 482
    :goto_9
    :try_start_5
    monitor-exit v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 483
    throw v0

    .line 484
    :pswitch_10
    iget-object v0, v1, LC8/g;->b:Ljava/lang/Object;

    .line 485
    .line 486
    check-cast v0, LM0/f;

    .line 487
    .line 488
    const-string v2, "$tmp0"

    .line 489
    .line 490
    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 491
    .line 492
    .line 493
    invoke-virtual {v0}, LM0/f;->invoke()Ljava/lang/Object;

    .line 494
    .line 495
    .line 496
    return-void

    .line 497
    :pswitch_11
    iget-object v0, v1, LC8/g;->b:Ljava/lang/Object;

    .line 498
    .line 499
    check-cast v0, LM/r;

    .line 500
    .line 501
    invoke-static {v0}, LM/r;->a(LM/r;)V

    .line 502
    .line 503
    .line 504
    return-void

    .line 505
    :pswitch_12
    iget-object v0, v1, LC8/g;->b:Ljava/lang/Object;

    .line 506
    .line 507
    check-cast v0, Lcom/vungle/ads/internal/ui/view/g;

    .line 508
    .line 509
    invoke-static {v0}, Lcom/vungle/ads/internal/ui/view/g;->a(Lcom/vungle/ads/internal/ui/view/g;)V

    .line 510
    .line 511
    .line 512
    return-void

    .line 513
    :pswitch_13
    iget-object v0, v1, LC8/g;->b:Ljava/lang/Object;

    .line 514
    .line 515
    check-cast v0, Lcom/vungle/ads/internal/ui/z;

    .line 516
    .line 517
    invoke-static {v8, v0}, Lcom/vungle/ads/internal/ui/z;->a(ZLcom/vungle/ads/internal/ui/z;)V

    .line 518
    .line 519
    .line 520
    return-void

    .line 521
    :pswitch_14
    iget-object v0, v1, LC8/g;->b:Ljava/lang/Object;

    .line 522
    .line 523
    check-cast v0, LJ9/p;

    .line 524
    .line 525
    iget-boolean v2, v0, LJ9/p;->b:Z

    .line 526
    .line 527
    if-eqz v2, :cond_11

    .line 528
    .line 529
    iget-boolean v3, v0, LJ9/p;->c:Z

    .line 530
    .line 531
    if-nez v3, :cond_12

    .line 532
    .line 533
    :cond_11
    if-eqz v2, :cond_12

    .line 534
    .line 535
    move v6, v8

    .line 536
    goto :goto_a

    .line 537
    :cond_12
    const/4 v6, 0x0

    .line 538
    :goto_a
    iput-boolean v6, v0, LJ9/p;->b:Z

    .line 539
    .line 540
    return-void

    .line 541
    :pswitch_15
    iget-object v0, v1, LC8/g;->b:Ljava/lang/Object;

    .line 542
    .line 543
    check-cast v0, Landroidx/work/CoroutineWorker;

    .line 544
    .line 545
    invoke-static {v0}, Landroidx/work/CoroutineWorker;->a(Landroidx/work/CoroutineWorker;)V

    .line 546
    .line 547
    .line 548
    return-void

    .line 549
    :pswitch_16
    iget-object v0, v1, LC8/g;->b:Ljava/lang/Object;

    .line 550
    .line 551
    check-cast v0, Lcom/vungle/ads/internal/session/b;

    .line 552
    .line 553
    invoke-static {v0}, Lcom/vungle/ads/internal/session/b;->b(Lcom/vungle/ads/internal/session/b;)V

    .line 554
    .line 555
    .line 556
    return-void

    .line 557
    :pswitch_17
    iget-object v2, v1, LC8/g;->b:Ljava/lang/Object;

    .line 558
    .line 559
    check-cast v2, LF5/f;

    .line 560
    .line 561
    invoke-virtual {v2}, LF5/f;->J()LF5/a;

    .line 562
    .line 563
    .line 564
    move-result-object v3

    .line 565
    new-instance v4, LF5/b;

    .line 566
    .line 567
    const/16 v5, 0x1d

    .line 568
    .line 569
    invoke-direct {v4, v5}, LF5/b;-><init>(I)V

    .line 570
    .line 571
    .line 572
    invoke-virtual {v2, v3, v0, v4}, LF5/f;->O(LF5/a;ILu6/g;)V

    .line 573
    .line 574
    .line 575
    iget-object v0, v2, LF5/f;->f:LK8/H;

    .line 576
    .line 577
    iget-object v2, v0, LK8/H;->e:Ljava/lang/Object;

    .line 578
    .line 579
    check-cast v2, Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 580
    .line 581
    invoke-virtual {v2}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    .line 582
    .line 583
    .line 584
    move-result-object v3

    .line 585
    :goto_b
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 586
    .line 587
    .line 588
    move-result v4

    .line 589
    if-eqz v4, :cond_14

    .line 590
    .line 591
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 592
    .line 593
    .line 594
    move-result-object v4

    .line 595
    check-cast v4, Lu6/i;

    .line 596
    .line 597
    iput-boolean v8, v4, Lu6/i;->d:Z

    .line 598
    .line 599
    iget-boolean v5, v4, Lu6/i;->c:Z

    .line 600
    .line 601
    if-eqz v5, :cond_13

    .line 602
    .line 603
    const/4 v5, 0x0

    .line 604
    iput-boolean v5, v4, Lu6/i;->c:Z

    .line 605
    .line 606
    iget-object v6, v4, Lu6/i;->b:LN1/k;

    .line 607
    .line 608
    invoke-virtual {v6}, LN1/k;->c()Lu6/e;

    .line 609
    .line 610
    .line 611
    move-result-object v6

    .line 612
    iget-object v4, v4, Lu6/i;->a:Ljava/lang/Object;

    .line 613
    .line 614
    iget-object v7, v0, LK8/H;->d:Ljava/lang/Object;

    .line 615
    .line 616
    check-cast v7, Lu6/h;

    .line 617
    .line 618
    invoke-interface {v7, v4, v6}, Lu6/h;->a(Ljava/lang/Object;Lu6/e;)V

    .line 619
    .line 620
    .line 621
    goto :goto_b

    .line 622
    :cond_13
    const/4 v5, 0x0

    .line 623
    goto :goto_b

    .line 624
    :cond_14
    invoke-virtual {v2}, Ljava/util/concurrent/CopyOnWriteArraySet;->clear()V

    .line 625
    .line 626
    .line 627
    iput-boolean v8, v0, LK8/H;->a:Z

    .line 628
    .line 629
    return-void

    .line 630
    :pswitch_18
    iget-object v0, v1, LC8/g;->b:Ljava/lang/Object;

    .line 631
    .line 632
    check-cast v0, Lcom/vungle/ads/internal/omsdk/c;

    .line 633
    .line 634
    invoke-static {v0}, Lcom/vungle/ads/internal/omsdk/c;->a(Lcom/vungle/ads/internal/omsdk/c;)V

    .line 635
    .line 636
    .line 637
    return-void

    .line 638
    :pswitch_19
    iget-object v0, v1, LC8/g;->b:Ljava/lang/Object;

    .line 639
    .line 640
    check-cast v0, LE5/E0;

    .line 641
    .line 642
    invoke-virtual {v0}, LE5/E0;->b()V

    .line 643
    .line 644
    .line 645
    return-void

    .line 646
    :pswitch_1a
    iget-object v0, v1, LC8/g;->b:Ljava/lang/Object;

    .line 647
    .line 648
    check-cast v0, Lcom/vungle/ads/internal/load/g;

    .line 649
    .line 650
    invoke-static {v0}, Lcom/vungle/ads/internal/load/g;->h(Lcom/vungle/ads/internal/load/g;)V

    .line 651
    .line 652
    .line 653
    return-void

    .line 654
    :pswitch_1b
    const/16 v16, 0x3

    .line 655
    .line 656
    const/16 v17, 0x2

    .line 657
    .line 658
    iget-object v0, v1, LC8/g;->b:Ljava/lang/Object;

    .line 659
    .line 660
    check-cast v0, LC8/h;

    .line 661
    .line 662
    iget-object v2, v0, LC8/h;->a:LC8/f;

    .line 663
    .line 664
    iget-object v3, v2, LC8/f;->l:Lz8/a;

    .line 665
    .line 666
    invoke-interface {v3}, Lz8/a;->getToken()Lcom/google/android/gms/tasks/Task;

    .line 667
    .line 668
    .line 669
    move-result-object v3

    .line 670
    new-instance v4, LB8/b;

    .line 671
    .line 672
    move/from16 v5, v17

    .line 673
    .line 674
    invoke-direct {v4, v2, v5}, LB8/b;-><init>(Ljava/lang/Object;I)V

    .line 675
    .line 676
    .line 677
    iget-object v2, v2, LC8/f;->g:Ljava/util/concurrent/Executor;

    .line 678
    .line 679
    invoke-virtual {v3, v2, v4}, Lcom/google/android/gms/tasks/Task;->onSuccessTask(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/SuccessContinuation;)Lcom/google/android/gms/tasks/Task;

    .line 680
    .line 681
    .line 682
    move-result-object v2

    .line 683
    new-instance v3, LB8/b;

    .line 684
    .line 685
    move/from16 v4, v16

    .line 686
    .line 687
    invoke-direct {v3, v0, v4}, LB8/b;-><init>(Ljava/lang/Object;I)V

    .line 688
    .line 689
    .line 690
    iget-object v0, v0, LC8/h;->b:Ljava/util/concurrent/Executor;

    .line 691
    .line 692
    invoke-virtual {v2, v0, v3}, Lcom/google/android/gms/tasks/Task;->addOnFailureListener(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/OnFailureListener;)Lcom/google/android/gms/tasks/Task;

    .line 693
    .line 694
    .line 695
    return-void

    .line 696
    nop

    .line 697
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
