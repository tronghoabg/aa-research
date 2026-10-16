.class public final Lp9/n;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LA7/b0;

.field public final b:Ln9/d;

.field public final c:Ln9/b;

.field public final d:Lw9/e;

.field public final e:Lo9/g;

.field public f:Lp7/b;

.field public g:Lr9/l;

.field public h:LE5/n0;

.field public i:Lp9/z;

.field public j:LQ1/n;

.field public k:Lne/a;

.field public l:Lr9/P;


# direct methods
.method public constructor <init>(Landroid/content/Context;LA7/b0;Ln9/d;Ln9/b;Lw9/e;Lv9/h;Lp9/s;)V
    .locals 9

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lp9/n;->a:LA7/b0;

    .line 5
    .line 6
    iput-object p3, p0, Lp9/n;->b:Ln9/d;

    .line 7
    .line 8
    iput-object p4, p0, Lp9/n;->c:Ln9/b;

    .line 9
    .line 10
    iput-object p5, p0, Lp9/n;->d:Lw9/e;

    .line 11
    .line 12
    new-instance v0, Lo9/g;

    .line 13
    .line 14
    new-instance v1, Lv9/o;

    .line 15
    .line 16
    iget-object p2, p2, LA7/b0;->e:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p2, Ls9/f;

    .line 19
    .line 20
    invoke-direct {v1, p2}, Lv9/o;-><init>(Ls9/f;)V

    .line 21
    .line 22
    .line 23
    invoke-direct {v0, v1}, Lo9/g;-><init>(Lv9/o;)V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, Lp9/n;->e:Lo9/g;

    .line 27
    .line 28
    new-instance v4, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 29
    .line 30
    invoke-direct {v4}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    .line 31
    .line 32
    .line 33
    new-instance p2, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 34
    .line 35
    const/4 v0, 0x0

    .line 36
    invoke-direct {p2, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 37
    .line 38
    .line 39
    new-instance v2, LKb/c;

    .line 40
    .line 41
    const/16 v8, 0x9

    .line 42
    .line 43
    move-object v3, p0

    .line 44
    move-object v5, p1

    .line 45
    move-object v7, p6

    .line 46
    move-object/from16 v6, p7

    .line 47
    .line 48
    invoke-direct/range {v2 .. v8}, LKb/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p5, v2}, Lw9/e;->a(Ljava/lang/Runnable;)Lcom/google/android/gms/tasks/Task;

    .line 52
    .line 53
    .line 54
    new-instance p1, Lcom/applovin/impl/Y;

    .line 55
    .line 56
    invoke-direct {p1, p0, p2, v4, p5}, Lcom/applovin/impl/Y;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    monitor-enter p3

    .line 60
    :try_start_0
    iput-object p1, p3, Ln9/d;->d:Lw9/n;

    .line 61
    .line 62
    invoke-virtual {p3}, Ln9/d;->X()Ln9/e;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    invoke-interface {p1, p2}, Lw9/n;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 67
    .line 68
    .line 69
    monitor-exit p3

    .line 70
    new-instance p1, Lm9/B;

    .line 71
    .line 72
    const/16 p2, 0xe

    .line 73
    .line 74
    invoke-direct {p1, p2}, Lm9/B;-><init>(I)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p4, p1}, Ln9/b;->Z(Lw9/n;)V

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :catchall_0
    move-exception v0

    .line 82
    move-object p1, v0

    .line 83
    :try_start_1
    monitor-exit p3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 84
    throw p1
.end method


# virtual methods
.method public final a(Landroid/content/Context;Ln9/e;Lp9/s;Lv9/h;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v5, 0x1

    .line 11
    iget-object v6, v2, Ln9/e;->a:Ljava/lang/String;

    .line 12
    .line 13
    new-array v7, v5, [Ljava/lang/Object;

    .line 14
    .line 15
    aput-object v6, v7, v4

    .line 16
    .line 17
    const-string v6, "FirestoreClient"

    .line 18
    .line 19
    const-string v8, "Initializing. user=%s"

    .line 20
    .line 21
    invoke-static {v6, v8, v5, v7}, LBa/c;->p(Ljava/lang/String;Ljava/lang/String;I[Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    new-instance v6, Lme/a;

    .line 25
    .line 26
    iget-object v7, v0, Lp9/n;->a:LA7/b0;

    .line 27
    .line 28
    iget-object v10, v0, Lp9/n;->b:Ln9/d;

    .line 29
    .line 30
    iget-object v11, v0, Lp9/n;->c:Ln9/b;

    .line 31
    .line 32
    iget-object v9, v0, Lp9/n;->d:Lw9/e;

    .line 33
    .line 34
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object v1, v6, Lme/a;->a:Ljava/lang/Object;

    .line 38
    .line 39
    iput-object v9, v6, Lme/a;->b:Ljava/lang/Object;

    .line 40
    .line 41
    iput-object v7, v6, Lme/a;->c:Ljava/lang/Object;

    .line 42
    .line 43
    iget-object v15, v3, Lp9/s;->b:LC8/i;

    .line 44
    .line 45
    new-instance v8, Lv9/o;

    .line 46
    .line 47
    iget-object v12, v7, LA7/b0;->e:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v12, Ls9/f;

    .line 50
    .line 51
    invoke-direct {v8, v12}, Lv9/o;-><init>(Ls9/f;)V

    .line 52
    .line 53
    .line 54
    iput-object v8, v15, LC8/i;->c:Ljava/lang/Object;

    .line 55
    .line 56
    new-instance v8, Lv9/i;

    .line 57
    .line 58
    invoke-direct {v8, v10, v11}, Lv9/i;-><init>(Ln9/d;Ln9/b;)V

    .line 59
    .line 60
    .line 61
    new-instance v13, LX8/c;

    .line 62
    .line 63
    invoke-direct {v13}, Ljava/lang/Object;-><init>()V

    .line 64
    .line 65
    .line 66
    iput-object v9, v13, LX8/c;->b:Ljava/lang/Object;

    .line 67
    .line 68
    iput-object v1, v13, LX8/c;->e:Ljava/lang/Object;

    .line 69
    .line 70
    iput-object v7, v13, LX8/c;->f:Ljava/lang/Object;

    .line 71
    .line 72
    iput-object v8, v13, LX8/c;->g:Ljava/lang/Object;

    .line 73
    .line 74
    sget-object v7, Lw9/k;->c:Lp2/a;

    .line 75
    .line 76
    new-instance v8, LG8/c;

    .line 77
    .line 78
    const/16 v14, 0xb

    .line 79
    .line 80
    invoke-direct {v8, v13, v14}, LG8/c;-><init>(Ljava/lang/Object;I)V

    .line 81
    .line 82
    .line 83
    invoke-static {v7, v8}, Lcom/google/android/gms/tasks/Tasks;->call(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Lcom/google/android/gms/tasks/Task;

    .line 84
    .line 85
    .line 86
    move-result-object v7

    .line 87
    iput-object v7, v13, LX8/c;->a:Ljava/lang/Object;

    .line 88
    .line 89
    iput-object v13, v15, LC8/i;->b:Ljava/lang/Object;

    .line 90
    .line 91
    new-instance v8, Lv9/m;

    .line 92
    .line 93
    iget-object v7, v15, LC8/i;->b:Ljava/lang/Object;

    .line 94
    .line 95
    move-object v14, v7

    .line 96
    check-cast v14, LX8/c;

    .line 97
    .line 98
    new-array v7, v4, [Ljava/lang/Object;

    .line 99
    .line 100
    const-string v13, "grpcCallProvider not initialized yet"

    .line 101
    .line 102
    invoke-static {v14, v13, v7}, LA6/c;->A(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    move-object/from16 v13, p4

    .line 106
    .line 107
    invoke-direct/range {v8 .. v14}, Lv9/m;-><init>(Lw9/e;Ln9/d;Ln9/b;Ls9/f;Lv9/h;LX8/c;)V

    .line 108
    .line 109
    .line 110
    iput-object v8, v15, LC8/i;->d:Ljava/lang/Object;

    .line 111
    .line 112
    new-instance v7, Lv9/g;

    .line 113
    .line 114
    iget-object v8, v15, LC8/i;->c:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast v8, Lv9/o;

    .line 117
    .line 118
    new-array v10, v4, [Ljava/lang/Object;

    .line 119
    .line 120
    const-string v11, "remoteSerializer not initialized yet"

    .line 121
    .line 122
    invoke-static {v8, v11, v10}, LA6/c;->A(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    iget-object v10, v15, LC8/i;->d:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast v10, Lv9/m;

    .line 128
    .line 129
    new-array v11, v4, [Ljava/lang/Object;

    .line 130
    .line 131
    const-string v13, "firestoreChannel not initialized yet"

    .line 132
    .line 133
    invoke-static {v10, v13, v11}, LA6/c;->A(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    invoke-direct {v7, v9, v8, v10}, Lv9/g;-><init>(Lw9/e;Lv9/o;Lv9/m;)V

    .line 137
    .line 138
    .line 139
    iput-object v7, v15, LC8/i;->e:Ljava/lang/Object;

    .line 140
    .line 141
    new-instance v7, LVa/Y7;

    .line 142
    .line 143
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 144
    .line 145
    .line 146
    new-instance v8, Ljava/util/ArrayList;

    .line 147
    .line 148
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 149
    .line 150
    .line 151
    iput-object v8, v7, LVa/Y7;->d:Ljava/lang/Object;

    .line 152
    .line 153
    if-eqz v1, :cond_0

    .line 154
    .line 155
    move v8, v5

    .line 156
    goto :goto_0

    .line 157
    :cond_0
    move v8, v4

    .line 158
    :goto_0
    const-string v10, "Context must be non-null"

    .line 159
    .line 160
    new-array v11, v4, [Ljava/lang/Object;

    .line 161
    .line 162
    invoke-static {v8, v10, v11}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    iput-object v1, v7, LVa/Y7;->a:Ljava/lang/Object;

    .line 166
    .line 167
    const-string v8, "connectivity"

    .line 168
    .line 169
    invoke-virtual {v1, v8}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v8

    .line 173
    check-cast v8, Landroid/net/ConnectivityManager;

    .line 174
    .line 175
    iput-object v8, v7, LVa/Y7;->b:Ljava/lang/Object;

    .line 176
    .line 177
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 178
    .line 179
    .line 180
    move-result-object v10

    .line 181
    check-cast v10, Landroid/app/Application;

    .line 182
    .line 183
    new-instance v11, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 184
    .line 185
    invoke-direct {v11}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    .line 186
    .line 187
    .line 188
    new-instance v13, Lv9/c;

    .line 189
    .line 190
    invoke-direct {v13, v7, v11}, Lv9/c;-><init>(LVa/Y7;Ljava/util/concurrent/atomic/AtomicBoolean;)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {v10, v13}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 194
    .line 195
    .line 196
    new-instance v13, Lv9/d;

    .line 197
    .line 198
    invoke-direct {v13, v11}, Lv9/d;-><init>(Ljava/util/concurrent/atomic/AtomicBoolean;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v10, v13}, Landroid/app/Application;->registerComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    .line 202
    .line 203
    .line 204
    sget v10, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 205
    .line 206
    const/16 v11, 0x18

    .line 207
    .line 208
    if-lt v10, v11, :cond_1

    .line 209
    .line 210
    if-eqz v8, :cond_1

    .line 211
    .line 212
    new-instance v1, LQ3/h;

    .line 213
    .line 214
    const/4 v10, 0x4

    .line 215
    invoke-direct {v1, v7, v10}, LQ3/h;-><init>(Ljava/lang/Object;I)V

    .line 216
    .line 217
    .line 218
    invoke-static {v8, v1}, Lu6/u;->h(Landroid/net/ConnectivityManager;LQ3/h;)V

    .line 219
    .line 220
    .line 221
    new-instance v8, Lng/a;

    .line 222
    .line 223
    const/16 v10, 0x15

    .line 224
    .line 225
    invoke-direct {v8, v10, v7, v1}, Lng/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 226
    .line 227
    .line 228
    iput-object v8, v7, LVa/Y7;->c:Ljava/lang/Object;

    .line 229
    .line 230
    goto :goto_1

    .line 231
    :cond_1
    new-instance v8, Lnd/a;

    .line 232
    .line 233
    invoke-direct {v8, v7, v5}, Lnd/a;-><init>(Ljava/lang/Object;I)V

    .line 234
    .line 235
    .line 236
    new-instance v10, Landroid/content/IntentFilter;

    .line 237
    .line 238
    const-string v11, "android.net.conn.CONNECTIVITY_CHANGE"

    .line 239
    .line 240
    invoke-direct {v10, v11}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v1, v8, v10}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 244
    .line 245
    .line 246
    new-instance v1, Lng/a;

    .line 247
    .line 248
    const/16 v10, 0x16

    .line 249
    .line 250
    invoke-direct {v1, v10, v7, v8}, Lng/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 251
    .line 252
    .line 253
    iput-object v1, v7, LVa/Y7;->c:Ljava/lang/Object;

    .line 254
    .line 255
    :goto_1
    iput-object v7, v15, LC8/i;->f:Ljava/lang/Object;

    .line 256
    .line 257
    invoke-virtual {v3, v6}, Lp9/s;->c(Lme/a;)Lp7/b;

    .line 258
    .line 259
    .line 260
    move-result-object v1

    .line 261
    iput-object v1, v3, Lp9/s;->c:Lp7/b;

    .line 262
    .line 263
    invoke-virtual {v1}, Lp7/b;->T()V

    .line 264
    .line 265
    .line 266
    new-instance v1, Lr9/l;

    .line 267
    .line 268
    iget-object v7, v3, Lp9/s;->c:Lp7/b;

    .line 269
    .line 270
    new-array v8, v4, [Ljava/lang/Object;

    .line 271
    .line 272
    const-string v10, "persistence not initialized yet"

    .line 273
    .line 274
    invoke-static {v7, v10, v8}, LA6/c;->A(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 275
    .line 276
    .line 277
    new-instance v8, LK8/f;

    .line 278
    .line 279
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 280
    .line 281
    .line 282
    iput-boolean v4, v8, LK8/f;->b:Z

    .line 283
    .line 284
    invoke-direct {v1, v7, v8, v2}, Lr9/l;-><init>(Lp7/b;LK8/f;Ln9/e;)V

    .line 285
    .line 286
    .line 287
    iput-object v1, v3, Lp9/s;->d:Lr9/l;

    .line 288
    .line 289
    move-object v13, v12

    .line 290
    new-instance v12, LE5/n0;

    .line 291
    .line 292
    new-instance v14, Lad/L;

    .line 293
    .line 294
    const/16 v1, 0x14

    .line 295
    .line 296
    invoke-direct {v14, v3, v1}, Lad/L;-><init>(Ljava/lang/Object;I)V

    .line 297
    .line 298
    .line 299
    invoke-virtual {v3}, Lp9/s;->d()Lr9/l;

    .line 300
    .line 301
    .line 302
    move-result-object v1

    .line 303
    iget-object v7, v15, LC8/i;->e:Ljava/lang/Object;

    .line 304
    .line 305
    check-cast v7, Lv9/g;

    .line 306
    .line 307
    new-array v8, v4, [Ljava/lang/Object;

    .line 308
    .line 309
    const-string v11, "datastore not initialized yet"

    .line 310
    .line 311
    invoke-static {v7, v11, v8}, LA6/c;->A(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 312
    .line 313
    .line 314
    iget-object v8, v15, LC8/i;->f:Ljava/lang/Object;

    .line 315
    .line 316
    check-cast v8, LVa/Y7;

    .line 317
    .line 318
    new-array v11, v4, [Ljava/lang/Object;

    .line 319
    .line 320
    const-string v15, "connectivityMonitor not initialized yet"

    .line 321
    .line 322
    invoke-static {v8, v15, v11}, LA6/c;->A(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 323
    .line 324
    .line 325
    move-object v15, v1

    .line 326
    move-object/from16 v16, v7

    .line 327
    .line 328
    move-object/from16 v18, v8

    .line 329
    .line 330
    move-object/from16 v17, v9

    .line 331
    .line 332
    invoke-direct/range {v12 .. v18}, LE5/n0;-><init>(Ls9/f;Lad/L;Lr9/l;Lv9/g;Lw9/e;LVa/Y7;)V

    .line 333
    .line 334
    .line 335
    iput-object v12, v3, Lp9/s;->f:LE5/n0;

    .line 336
    .line 337
    new-instance v1, Lp9/z;

    .line 338
    .line 339
    invoke-virtual {v3}, Lp9/s;->d()Lr9/l;

    .line 340
    .line 341
    .line 342
    move-result-object v7

    .line 343
    iget-object v8, v3, Lp9/s;->f:LE5/n0;

    .line 344
    .line 345
    new-array v9, v4, [Ljava/lang/Object;

    .line 346
    .line 347
    const-string v11, "remoteStore not initialized yet"

    .line 348
    .line 349
    invoke-static {v8, v11, v9}, LA6/c;->A(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 350
    .line 351
    .line 352
    invoke-direct {v1, v7, v8, v2}, Lp9/z;-><init>(Lr9/l;LE5/n0;Ln9/e;)V

    .line 353
    .line 354
    .line 355
    iput-object v1, v3, Lp9/s;->e:Lp9/z;

    .line 356
    .line 357
    new-instance v1, LQ1/n;

    .line 358
    .line 359
    invoke-virtual {v3}, Lp9/s;->e()Lp9/z;

    .line 360
    .line 361
    .line 362
    move-result-object v2

    .line 363
    invoke-direct {v1, v2}, LQ1/n;-><init>(Lp9/z;)V

    .line 364
    .line 365
    .line 366
    iput-object v1, v3, Lp9/s;->g:LQ1/n;

    .line 367
    .line 368
    iget-object v1, v3, Lp9/s;->d:Lr9/l;

    .line 369
    .line 370
    iget-object v2, v1, Lr9/l;->a:Lp7/b;

    .line 371
    .line 372
    invoke-virtual {v2}, Lp7/b;->B()Lr9/w;

    .line 373
    .line 374
    .line 375
    move-result-object v2

    .line 376
    invoke-interface {v2}, Lr9/w;->run()V

    .line 377
    .line 378
    .line 379
    new-instance v2, Lr9/h;

    .line 380
    .line 381
    invoke-direct {v2, v1, v4}, Lr9/h;-><init>(Lr9/l;I)V

    .line 382
    .line 383
    .line 384
    const-string v7, "Start IndexManager"

    .line 385
    .line 386
    iget-object v8, v1, Lr9/l;->a:Lp7/b;

    .line 387
    .line 388
    invoke-virtual {v8, v7, v2}, Lp7/b;->P(Ljava/lang/String;Ljava/lang/Runnable;)V

    .line 389
    .line 390
    .line 391
    new-instance v2, Lr9/h;

    .line 392
    .line 393
    invoke-direct {v2, v1, v5}, Lr9/h;-><init>(Lr9/l;I)V

    .line 394
    .line 395
    .line 396
    const-string v1, "Start MutationQueue"

    .line 397
    .line 398
    invoke-virtual {v8, v1, v2}, Lp7/b;->P(Ljava/lang/String;Ljava/lang/Runnable;)V

    .line 399
    .line 400
    .line 401
    iget-object v1, v3, Lp9/s;->f:LE5/n0;

    .line 402
    .line 403
    invoke-virtual {v1}, LE5/n0;->h()V

    .line 404
    .line 405
    .line 406
    invoke-virtual {v3, v6}, Lp9/s;->a(Lme/a;)Lr9/P;

    .line 407
    .line 408
    .line 409
    move-result-object v1

    .line 410
    iput-object v1, v3, Lp9/s;->i:Lr9/P;

    .line 411
    .line 412
    invoke-virtual {v3, v6}, Lp9/s;->b(Lme/a;)Lr9/e;

    .line 413
    .line 414
    .line 415
    move-result-object v1

    .line 416
    iput-object v1, v3, Lp9/s;->h:Lr9/e;

    .line 417
    .line 418
    iget-object v1, v3, Lp9/s;->c:Lp7/b;

    .line 419
    .line 420
    new-array v2, v4, [Ljava/lang/Object;

    .line 421
    .line 422
    invoke-static {v1, v10, v2}, LA6/c;->A(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 423
    .line 424
    .line 425
    iput-object v1, v0, Lp9/n;->f:Lp7/b;

    .line 426
    .line 427
    iget-object v1, v3, Lp9/s;->i:Lr9/P;

    .line 428
    .line 429
    iput-object v1, v0, Lp9/n;->l:Lr9/P;

    .line 430
    .line 431
    invoke-virtual {v3}, Lp9/s;->d()Lr9/l;

    .line 432
    .line 433
    .line 434
    move-result-object v1

    .line 435
    iput-object v1, v0, Lp9/n;->g:Lr9/l;

    .line 436
    .line 437
    iget-object v1, v3, Lp9/s;->f:LE5/n0;

    .line 438
    .line 439
    new-array v2, v4, [Ljava/lang/Object;

    .line 440
    .line 441
    invoke-static {v1, v11, v2}, LA6/c;->A(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 442
    .line 443
    .line 444
    iput-object v1, v0, Lp9/n;->h:LE5/n0;

    .line 445
    .line 446
    invoke-virtual {v3}, Lp9/s;->e()Lp9/z;

    .line 447
    .line 448
    .line 449
    move-result-object v1

    .line 450
    iput-object v1, v0, Lp9/n;->i:Lp9/z;

    .line 451
    .line 452
    iget-object v1, v3, Lp9/s;->g:LQ1/n;

    .line 453
    .line 454
    new-array v2, v4, [Ljava/lang/Object;

    .line 455
    .line 456
    const-string v4, "eventManager not initialized yet"

    .line 457
    .line 458
    invoke-static {v1, v4, v2}, LA6/c;->A(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 459
    .line 460
    .line 461
    iput-object v1, v0, Lp9/n;->j:LQ1/n;

    .line 462
    .line 463
    iget-object v1, v3, Lp9/s;->h:Lr9/e;

    .line 464
    .line 465
    iget-object v2, v0, Lp9/n;->l:Lr9/P;

    .line 466
    .line 467
    if-eqz v2, :cond_2

    .line 468
    .line 469
    invoke-interface {v2}, Lr9/P;->start()V

    .line 470
    .line 471
    .line 472
    :cond_2
    if-eqz v1, :cond_3

    .line 473
    .line 474
    iget-object v1, v1, Lr9/e;->a:Lne/a;

    .line 475
    .line 476
    iput-object v1, v0, Lp9/n;->k:Lne/a;

    .line 477
    .line 478
    invoke-virtual {v1}, Lne/a;->start()V

    .line 479
    .line 480
    .line 481
    :cond_3
    return-void
.end method

.method public final b(Lp9/u;Lp9/g;Lp9/b;)Lp9/v;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lp9/n;->e()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lp9/v;

    .line 5
    .line 6
    invoke-direct {v0, p1, p2, p3}, Lp9/v;-><init>(Lp9/u;Lp9/g;Lp9/b;)V

    .line 7
    .line 8
    .line 9
    new-instance p1, Lp9/m;

    .line 10
    .line 11
    const/4 p2, 0x1

    .line 12
    invoke-direct {p1, p0, v0, p2}, Lp9/m;-><init>(Lp9/n;Lp9/v;I)V

    .line 13
    .line 14
    .line 15
    iget-object p2, p0, Lp9/n;->d:Lw9/e;

    .line 16
    .line 17
    invoke-virtual {p2, p1}, Lw9/e;->a(Ljava/lang/Runnable;)Lcom/google/android/gms/tasks/Task;

    .line 18
    .line 19
    .line 20
    return-object v0
.end method

.method public final c(Z)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lp9/n;->e()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LG5/o;

    .line 5
    .line 6
    const/4 v1, 0x5

    .line 7
    invoke-direct {v0, v1, p0, p1}, LG5/o;-><init>(ILjava/lang/Object;Z)V

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Lp9/n;->d:Lw9/e;

    .line 11
    .line 12
    invoke-virtual {p1, v0}, Lw9/e;->a(Ljava/lang/Runnable;)Lcom/google/android/gms/tasks/Task;

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final d()Lcom/google/android/gms/tasks/Task;
    .locals 4

    .line 1
    iget-object v0, p0, Lp9/n;->b:Ln9/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Ln9/d;->a0()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lp9/n;->c:Ln9/b;

    .line 7
    .line 8
    invoke-virtual {v0}, Ln9/b;->Y()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lp9/n;->d:Lw9/e;

    .line 12
    .line 13
    new-instance v1, Lp9/l;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-direct {v1, p0, v2}, Lp9/l;-><init>(Lp9/n;I)V

    .line 17
    .line 18
    .line 19
    iget-object v0, v0, Lw9/e;->a:Lw9/c;

    .line 20
    .line 21
    monitor-enter v0

    .line 22
    :try_start_0
    invoke-virtual {v0}, Lw9/c;->c()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    new-instance v1, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 29
    .line 30
    invoke-direct {v1}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    .line 31
    .line 32
    .line 33
    const/4 v2, 0x0

    .line 34
    invoke-virtual {v1, v2}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 38
    .line 39
    .line 40
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    monitor-exit v0

    .line 42
    return-object v1

    .line 43
    :catchall_0
    move-exception v1

    .line 44
    goto :goto_0

    .line 45
    :cond_0
    :try_start_1
    new-instance v2, LG8/c;

    .line 46
    .line 47
    const/16 v3, 0xd

    .line 48
    .line 49
    invoke-direct {v2, v1, v3}, LG8/c;-><init>(Ljava/lang/Object;I)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v2}, Lw9/c;->b(Ljava/util/concurrent/Callable;)Lcom/google/android/gms/tasks/Task;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    const/4 v2, 0x1

    .line 57
    iput-boolean v2, v0, Lw9/c;->b:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 58
    .line 59
    monitor-exit v0

    .line 60
    return-object v1

    .line 61
    :goto_0
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 62
    throw v1
.end method

.method public final e()V
    .locals 2

    .line 1
    iget-object v0, p0, Lp9/n;->d:Lw9/e;

    .line 2
    .line 3
    iget-object v0, v0, Lw9/e;->a:Lw9/c;

    .line 4
    .line 5
    invoke-virtual {v0}, Lw9/c;->c()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 13
    .line 14
    const-string v1, "The client has already been terminated"

    .line 15
    .line 16
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw v0
.end method

.method public final f(Ljava/util/List;)Lcom/google/android/gms/tasks/Task;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lp9/n;->e()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 5
    .line 6
    invoke-direct {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance v1, Lcom/applovin/impl/mediation/ads/f;

    .line 10
    .line 11
    const/16 v2, 0x1c

    .line 12
    .line 13
    invoke-direct {v1, p0, p1, v0, v2}, Lcom/applovin/impl/mediation/ads/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Lp9/n;->d:Lw9/e;

    .line 17
    .line 18
    invoke-virtual {p1, v1}, Lw9/e;->a(Ljava/lang/Runnable;)Lcom/google/android/gms/tasks/Task;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    return-object p1
.end method
