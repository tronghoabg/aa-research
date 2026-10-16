.class public final LT3/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field public static final e:Ljava/lang/String;

.field public static final f:J


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:LK3/q;

.field public final c:Lxa/d;

.field public d:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-string v0, "ForceStopRunnable"

    .line 2
    .line 3
    invoke-static {v0}, LJ3/r;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, LT3/f;->e:Ljava/lang/String;

    .line 8
    .line 9
    sget-object v0, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    .line 10
    .line 11
    const-wide/16 v1, 0xe42

    .line 12
    .line 13
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    sput-wide v0, LT3/f;->f:J

    .line 18
    .line 19
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;LK3/q;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, LT3/f;->a:Landroid/content/Context;

    .line 9
    .line 10
    iput-object p2, p0, LT3/f;->b:LK3/q;

    .line 11
    .line 12
    iget-object p1, p2, LK3/q;->g:Lxa/d;

    .line 13
    .line 14
    iput-object p1, p0, LT3/f;->c:Lxa/d;

    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    iput p1, p0, LT3/f;->d:I

    .line 18
    .line 19
    return-void
.end method

.method public static c(Landroid/content/Context;)V
    .locals 5

    .line 1
    const-string v0, "alarm"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/app/AlarmManager;

    .line 8
    .line 9
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 10
    .line 11
    const/16 v2, 0x1f

    .line 12
    .line 13
    if-lt v1, v2, :cond_0

    .line 14
    .line 15
    const/high16 v1, 0xa000000

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/high16 v1, 0x8000000

    .line 19
    .line 20
    :goto_0
    new-instance v2, Landroid/content/Intent;

    .line 21
    .line 22
    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 23
    .line 24
    .line 25
    new-instance v3, Landroid/content/ComponentName;

    .line 26
    .line 27
    const-class v4, Landroidx/work/impl/utils/ForceStopRunnable$BroadcastReceiver;

    .line 28
    .line 29
    invoke-direct {v3, p0, v4}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v2, v3}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 33
    .line 34
    .line 35
    const-string v3, "ACTION_FORCE_STOP_RESCHEDULE"

    .line 36
    .line 37
    invoke-virtual {v2, v3}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 38
    .line 39
    .line 40
    const/4 v3, -0x1

    .line 41
    invoke-static {p0, v3, v2, v1}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 46
    .line 47
    .line 48
    move-result-wide v1

    .line 49
    sget-wide v3, LT3/f;->f:J

    .line 50
    .line 51
    add-long/2addr v1, v3

    .line 52
    if-eqz v0, :cond_1

    .line 53
    .line 54
    const/4 v3, 0x0

    .line 55
    invoke-virtual {v0, v3, v1, v2, p0}, Landroid/app/AlarmManager;->setExact(IJLandroid/app/PendingIntent;)V

    .line 56
    .line 57
    .line 58
    :cond_1
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    const-string v2, "last_force_stop_ms"

    .line 5
    .line 6
    iget-object v3, v1, LT3/f;->c:Lxa/d;

    .line 7
    .line 8
    sget-object v4, LN3/b;->e:Ljava/lang/String;

    .line 9
    .line 10
    iget-object v4, v1, LT3/f;->a:Landroid/content/Context;

    .line 11
    .line 12
    const-string v5, "jobscheduler"

    .line 13
    .line 14
    invoke-virtual {v4, v5}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v5

    .line 18
    check-cast v5, Landroid/app/job/JobScheduler;

    .line 19
    .line 20
    invoke-static {v4, v5}, LN3/b;->f(Landroid/content/Context;Landroid/app/job/JobScheduler;)Ljava/util/ArrayList;

    .line 21
    .line 22
    .line 23
    move-result-object v6

    .line 24
    iget-object v7, v1, LT3/f;->b:LK3/q;

    .line 25
    .line 26
    iget-object v8, v7, LK3/q;->c:Landroidx/work/impl/WorkDatabase;

    .line 27
    .line 28
    invoke-virtual {v8}, Landroidx/work/impl/WorkDatabase;->r()LS3/i;

    .line 29
    .line 30
    .line 31
    move-result-object v8

    .line 32
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    const-string v9, "SELECT DISTINCT work_spec_id FROM SystemIdInfo"

    .line 36
    .line 37
    const/4 v10, 0x0

    .line 38
    invoke-static {v10, v9}, Lk3/q;->d(ILjava/lang/String;)Lk3/q;

    .line 39
    .line 40
    .line 41
    move-result-object v9

    .line 42
    iget-object v8, v8, LS3/i;->a:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v8, Landroidx/work/impl/WorkDatabase_Impl;

    .line 45
    .line 46
    invoke-virtual {v8}, Lk3/m;->b()V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v8, v9}, Lk3/m;->l(Lo3/f;)Landroid/database/Cursor;

    .line 50
    .line 51
    .line 52
    move-result-object v8

    .line 53
    :try_start_0
    new-instance v11, Ljava/util/ArrayList;

    .line 54
    .line 55
    invoke-interface {v8}, Landroid/database/Cursor;->getCount()I

    .line 56
    .line 57
    .line 58
    move-result v12

    .line 59
    invoke-direct {v11, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 60
    .line 61
    .line 62
    :goto_0
    invoke-interface {v8}, Landroid/database/Cursor;->moveToNext()Z

    .line 63
    .line 64
    .line 65
    move-result v12

    .line 66
    if-eqz v12, :cond_1

    .line 67
    .line 68
    invoke-interface {v8, v10}, Landroid/database/Cursor;->isNull(I)Z

    .line 69
    .line 70
    .line 71
    move-result v12

    .line 72
    if-eqz v12, :cond_0

    .line 73
    .line 74
    const/4 v12, 0x0

    .line 75
    goto :goto_1

    .line 76
    :cond_0
    invoke-interface {v8, v10}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v12

    .line 80
    :goto_1
    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 81
    .line 82
    .line 83
    goto :goto_0

    .line 84
    :catchall_0
    move-exception v0

    .line 85
    goto/16 :goto_11

    .line 86
    .line 87
    :cond_1
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v9}, Lk3/q;->h()V

    .line 91
    .line 92
    .line 93
    if-eqz v6, :cond_2

    .line 94
    .line 95
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 96
    .line 97
    .line 98
    move-result v8

    .line 99
    goto :goto_2

    .line 100
    :cond_2
    move v8, v10

    .line 101
    :goto_2
    new-instance v9, Ljava/util/HashSet;

    .line 102
    .line 103
    invoke-direct {v9, v8}, Ljava/util/HashSet;-><init>(I)V

    .line 104
    .line 105
    .line 106
    if-eqz v6, :cond_4

    .line 107
    .line 108
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    .line 109
    .line 110
    .line 111
    move-result v8

    .line 112
    if-nez v8, :cond_4

    .line 113
    .line 114
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 115
    .line 116
    .line 117
    move-result-object v6

    .line 118
    :goto_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 119
    .line 120
    .line 121
    move-result v8

    .line 122
    if-eqz v8, :cond_4

    .line 123
    .line 124
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v8

    .line 128
    check-cast v8, Landroid/app/job/JobInfo;

    .line 129
    .line 130
    invoke-static {v8}, LN3/b;->g(Landroid/app/job/JobInfo;)LS3/j;

    .line 131
    .line 132
    .line 133
    move-result-object v12

    .line 134
    if-eqz v12, :cond_3

    .line 135
    .line 136
    iget-object v8, v12, LS3/j;->a:Ljava/lang/String;

    .line 137
    .line 138
    invoke-virtual {v9, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    goto :goto_3

    .line 142
    :cond_3
    invoke-virtual {v8}, Landroid/app/job/JobInfo;->getId()I

    .line 143
    .line 144
    .line 145
    move-result v8

    .line 146
    invoke-static {v5, v8}, LN3/b;->b(Landroid/app/job/JobScheduler;I)V

    .line 147
    .line 148
    .line 149
    goto :goto_3

    .line 150
    :cond_4
    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 151
    .line 152
    .line 153
    move-result-object v5

    .line 154
    :cond_5
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 155
    .line 156
    .line 157
    move-result v6

    .line 158
    if-eqz v6, :cond_6

    .line 159
    .line 160
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v6

    .line 164
    check-cast v6, Ljava/lang/String;

    .line 165
    .line 166
    invoke-virtual {v9, v6}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    move-result v6

    .line 170
    if-nez v6, :cond_5

    .line 171
    .line 172
    invoke-static {}, LJ3/r;->d()LJ3/r;

    .line 173
    .line 174
    .line 175
    move-result-object v5

    .line 176
    sget-object v6, LN3/b;->e:Ljava/lang/String;

    .line 177
    .line 178
    const-string v8, "Reconciling jobs"

    .line 179
    .line 180
    invoke-virtual {v5, v6, v8}, LJ3/r;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    move v5, v0

    .line 184
    goto :goto_4

    .line 185
    :cond_6
    move v5, v10

    .line 186
    :goto_4
    const-wide/16 v8, -0x1

    .line 187
    .line 188
    if-eqz v5, :cond_8

    .line 189
    .line 190
    iget-object v6, v7, LK3/q;->c:Landroidx/work/impl/WorkDatabase;

    .line 191
    .line 192
    invoke-virtual {v6}, Lk3/m;->c()V

    .line 193
    .line 194
    .line 195
    :try_start_1
    invoke-virtual {v6}, Landroidx/work/impl/WorkDatabase;->u()LS3/q;

    .line 196
    .line 197
    .line 198
    move-result-object v12

    .line 199
    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 200
    .line 201
    .line 202
    move-result-object v11

    .line 203
    :goto_5
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 204
    .line 205
    .line 206
    move-result v13

    .line 207
    if-eqz v13, :cond_7

    .line 208
    .line 209
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v13

    .line 213
    check-cast v13, Ljava/lang/String;

    .line 214
    .line 215
    invoke-virtual {v12, v8, v9, v13}, LS3/q;->i(JLjava/lang/String;)V

    .line 216
    .line 217
    .line 218
    goto :goto_5

    .line 219
    :catchall_1
    move-exception v0

    .line 220
    goto :goto_6

    .line 221
    :cond_7
    invoke-virtual {v6}, Lk3/m;->n()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 222
    .line 223
    .line 224
    invoke-virtual {v6}, Lk3/m;->j()V

    .line 225
    .line 226
    .line 227
    goto :goto_7

    .line 228
    :goto_6
    invoke-virtual {v6}, Lk3/m;->j()V

    .line 229
    .line 230
    .line 231
    throw v0

    .line 232
    :cond_8
    :goto_7
    iget-object v6, v7, LK3/q;->c:Landroidx/work/impl/WorkDatabase;

    .line 233
    .line 234
    invoke-virtual {v6}, Landroidx/work/impl/WorkDatabase;->u()LS3/q;

    .line 235
    .line 236
    .line 237
    move-result-object v11

    .line 238
    invoke-virtual {v6}, Landroidx/work/impl/WorkDatabase;->t()LS3/n;

    .line 239
    .line 240
    .line 241
    move-result-object v12

    .line 242
    invoke-virtual {v6}, Lk3/m;->c()V

    .line 243
    .line 244
    .line 245
    :try_start_2
    invoke-virtual {v11}, LS3/q;->c()Ljava/util/ArrayList;

    .line 246
    .line 247
    .line 248
    move-result-object v13

    .line 249
    invoke-virtual {v13}, Ljava/util/ArrayList;->isEmpty()Z

    .line 250
    .line 251
    .line 252
    move-result v14

    .line 253
    if-nez v14, :cond_9

    .line 254
    .line 255
    invoke-virtual {v13}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 256
    .line 257
    .line 258
    move-result-object v13

    .line 259
    :goto_8
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 260
    .line 261
    .line 262
    move-result v15

    .line 263
    if-eqz v15, :cond_9

    .line 264
    .line 265
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v15

    .line 269
    check-cast v15, LS3/p;

    .line 270
    .line 271
    iget-object v10, v15, LS3/p;->a:Ljava/lang/String;

    .line 272
    .line 273
    invoke-virtual {v11, v0, v10}, LS3/q;->l(ILjava/lang/String;)V

    .line 274
    .line 275
    .line 276
    iget-object v10, v15, LS3/p;->a:Ljava/lang/String;

    .line 277
    .line 278
    invoke-virtual {v11, v8, v9, v10}, LS3/q;->i(JLjava/lang/String;)V

    .line 279
    .line 280
    .line 281
    const/4 v10, 0x0

    .line 282
    goto :goto_8

    .line 283
    :catchall_2
    move-exception v0

    .line 284
    goto/16 :goto_10

    .line 285
    .line 286
    :cond_9
    iget-object v8, v12, LS3/n;->a:Ljava/lang/Object;

    .line 287
    .line 288
    check-cast v8, Landroidx/work/impl/WorkDatabase_Impl;

    .line 289
    .line 290
    invoke-virtual {v8}, Lk3/m;->b()V

    .line 291
    .line 292
    .line 293
    iget-object v9, v12, LS3/n;->d:Ljava/lang/Object;

    .line 294
    .line 295
    check-cast v9, LS3/h;

    .line 296
    .line 297
    invoke-virtual {v9}, LE9/c;->a()Lo3/g;

    .line 298
    .line 299
    .line 300
    move-result-object v10

    .line 301
    invoke-virtual {v8}, Lk3/m;->c()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 302
    .line 303
    .line 304
    :try_start_3
    invoke-interface {v10}, Lo3/g;->g()I

    .line 305
    .line 306
    .line 307
    invoke-virtual {v8}, Lk3/m;->n()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 308
    .line 309
    .line 310
    :try_start_4
    invoke-virtual {v8}, Lk3/m;->j()V

    .line 311
    .line 312
    .line 313
    invoke-virtual {v9, v10}, LE9/c;->q(Lo3/g;)V

    .line 314
    .line 315
    .line 316
    invoke-virtual {v6}, Lk3/m;->n()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 317
    .line 318
    .line 319
    invoke-virtual {v6}, Lk3/m;->j()V

    .line 320
    .line 321
    .line 322
    if-eqz v14, :cond_b

    .line 323
    .line 324
    if-eqz v5, :cond_a

    .line 325
    .line 326
    goto :goto_9

    .line 327
    :cond_a
    const/4 v5, 0x0

    .line 328
    goto :goto_a

    .line 329
    :cond_b
    :goto_9
    move v5, v0

    .line 330
    :goto_a
    iget-object v6, v7, LK3/q;->g:Lxa/d;

    .line 331
    .line 332
    iget-object v6, v6, Lxa/d;->b:Ljava/lang/Object;

    .line 333
    .line 334
    check-cast v6, Landroidx/work/impl/WorkDatabase;

    .line 335
    .line 336
    invoke-virtual {v6}, Landroidx/work/impl/WorkDatabase;->q()LS3/e;

    .line 337
    .line 338
    .line 339
    move-result-object v6

    .line 340
    const-string v8, "reschedule_needed"

    .line 341
    .line 342
    invoke-virtual {v6, v8}, LS3/e;->o(Ljava/lang/String;)Ljava/lang/Long;

    .line 343
    .line 344
    .line 345
    move-result-object v6

    .line 346
    const-wide/16 v9, 0x0

    .line 347
    .line 348
    sget-object v11, LT3/f;->e:Ljava/lang/String;

    .line 349
    .line 350
    if-eqz v6, :cond_c

    .line 351
    .line 352
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    .line 353
    .line 354
    .line 355
    move-result-wide v12

    .line 356
    const-wide/16 v14, 0x1

    .line 357
    .line 358
    cmp-long v6, v12, v14

    .line 359
    .line 360
    if-nez v6, :cond_c

    .line 361
    .line 362
    invoke-static {}, LJ3/r;->d()LJ3/r;

    .line 363
    .line 364
    .line 365
    move-result-object v0

    .line 366
    const-string v2, "Rescheduling Workers."

    .line 367
    .line 368
    invoke-virtual {v0, v11, v2}, LJ3/r;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 369
    .line 370
    .line 371
    invoke-virtual {v7}, LK3/q;->f()V

    .line 372
    .line 373
    .line 374
    iget-object v0, v7, LK3/q;->g:Lxa/d;

    .line 375
    .line 376
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 377
    .line 378
    .line 379
    new-instance v2, LS3/d;

    .line 380
    .line 381
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 382
    .line 383
    .line 384
    move-result-object v3

    .line 385
    invoke-direct {v2, v8, v3}, LS3/d;-><init>(Ljava/lang/String;Ljava/lang/Long;)V

    .line 386
    .line 387
    .line 388
    iget-object v0, v0, Lxa/d;->b:Ljava/lang/Object;

    .line 389
    .line 390
    check-cast v0, Landroidx/work/impl/WorkDatabase;

    .line 391
    .line 392
    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->q()LS3/e;

    .line 393
    .line 394
    .line 395
    move-result-object v0

    .line 396
    invoke-virtual {v0, v2}, LS3/e;->q(LS3/d;)V

    .line 397
    .line 398
    .line 399
    return-void

    .line 400
    :cond_c
    :try_start_5
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 401
    .line 402
    const/16 v8, 0x1f

    .line 403
    .line 404
    if-lt v6, v8, :cond_d

    .line 405
    .line 406
    const/high16 v8, 0x22000000

    .line 407
    .line 408
    goto :goto_b

    .line 409
    :cond_d
    const/high16 v8, 0x20000000

    .line 410
    .line 411
    :goto_b
    new-instance v12, Landroid/content/Intent;

    .line 412
    .line 413
    invoke-direct {v12}, Landroid/content/Intent;-><init>()V

    .line 414
    .line 415
    .line 416
    new-instance v13, Landroid/content/ComponentName;

    .line 417
    .line 418
    const-class v14, Landroidx/work/impl/utils/ForceStopRunnable$BroadcastReceiver;

    .line 419
    .line 420
    invoke-direct {v13, v4, v14}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 421
    .line 422
    .line 423
    invoke-virtual {v12, v13}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 424
    .line 425
    .line 426
    const-string v13, "ACTION_FORCE_STOP_RESCHEDULE"

    .line 427
    .line 428
    invoke-virtual {v12, v13}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 429
    .line 430
    .line 431
    const/4 v13, -0x1

    .line 432
    invoke-static {v4, v13, v12, v8}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 433
    .line 434
    .line 435
    move-result-object v8

    .line 436
    const/16 v12, 0x1e

    .line 437
    .line 438
    if-lt v6, v12, :cond_11

    .line 439
    .line 440
    if-eqz v8, :cond_e

    .line 441
    .line 442
    invoke-virtual {v8}, Landroid/app/PendingIntent;->cancel()V

    .line 443
    .line 444
    .line 445
    goto :goto_c

    .line 446
    :catch_0
    move-exception v0

    .line 447
    goto :goto_e

    .line 448
    :catch_1
    move-exception v0

    .line 449
    goto :goto_e

    .line 450
    :cond_e
    :goto_c
    const-string v6, "activity"

    .line 451
    .line 452
    invoke-virtual {v4, v6}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 453
    .line 454
    .line 455
    move-result-object v4

    .line 456
    check-cast v4, Landroid/app/ActivityManager;

    .line 457
    .line 458
    invoke-static {v4}, LA7/N0;->o(Landroid/app/ActivityManager;)Ljava/util/List;

    .line 459
    .line 460
    .line 461
    move-result-object v4

    .line 462
    if-eqz v4, :cond_12

    .line 463
    .line 464
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 465
    .line 466
    .line 467
    move-result v6

    .line 468
    if-nez v6, :cond_12

    .line 469
    .line 470
    iget-object v6, v3, Lxa/d;->b:Ljava/lang/Object;

    .line 471
    .line 472
    check-cast v6, Landroidx/work/impl/WorkDatabase;

    .line 473
    .line 474
    invoke-virtual {v6}, Landroidx/work/impl/WorkDatabase;->q()LS3/e;

    .line 475
    .line 476
    .line 477
    move-result-object v6

    .line 478
    invoke-virtual {v6, v2}, LS3/e;->o(Ljava/lang/String;)Ljava/lang/Long;

    .line 479
    .line 480
    .line 481
    move-result-object v6

    .line 482
    if-eqz v6, :cond_f

    .line 483
    .line 484
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    .line 485
    .line 486
    .line 487
    move-result-wide v9

    .line 488
    :cond_f
    const/4 v6, 0x0

    .line 489
    :goto_d
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 490
    .line 491
    .line 492
    move-result v8

    .line 493
    if-ge v6, v8, :cond_12

    .line 494
    .line 495
    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 496
    .line 497
    .line 498
    move-result-object v8

    .line 499
    invoke-static {v8}, LA7/N0;->e(Ljava/lang/Object;)Landroid/app/ApplicationExitInfo;

    .line 500
    .line 501
    .line 502
    move-result-object v8

    .line 503
    invoke-static {v8}, LA7/N0;->b(Landroid/app/ApplicationExitInfo;)I

    .line 504
    .line 505
    .line 506
    move-result v12

    .line 507
    const/16 v13, 0xa

    .line 508
    .line 509
    if-ne v12, v13, :cond_10

    .line 510
    .line 511
    invoke-static {v8}, LA7/N0;->d(Landroid/app/ApplicationExitInfo;)J

    .line 512
    .line 513
    .line 514
    move-result-wide v12

    .line 515
    cmp-long v8, v12, v9

    .line 516
    .line 517
    if-ltz v8, :cond_10

    .line 518
    .line 519
    goto :goto_f

    .line 520
    :cond_10
    add-int/2addr v6, v0

    .line 521
    goto :goto_d

    .line 522
    :cond_11
    if-nez v8, :cond_12

    .line 523
    .line 524
    invoke-static {v4}, LT3/f;->c(Landroid/content/Context;)V
    :try_end_5
    .catch Ljava/lang/SecurityException; {:try_start_5 .. :try_end_5} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_5 .. :try_end_5} :catch_0

    .line 525
    .line 526
    .line 527
    goto :goto_f

    .line 528
    :cond_12
    if-eqz v5, :cond_14

    .line 529
    .line 530
    invoke-static {}, LJ3/r;->d()LJ3/r;

    .line 531
    .line 532
    .line 533
    move-result-object v0

    .line 534
    const-string v2, "Found unfinished work, scheduling it."

    .line 535
    .line 536
    invoke-virtual {v0, v11, v2}, LJ3/r;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 537
    .line 538
    .line 539
    iget-object v0, v7, LK3/q;->b:LJ3/b;

    .line 540
    .line 541
    iget-object v2, v7, LK3/q;->c:Landroidx/work/impl/WorkDatabase;

    .line 542
    .line 543
    iget-object v3, v7, LK3/q;->e:Ljava/util/List;

    .line 544
    .line 545
    invoke-static {v0, v2, v3}, LK3/i;->a(LJ3/b;Landroidx/work/impl/WorkDatabase;Ljava/util/List;)V

    .line 546
    .line 547
    .line 548
    return-void

    .line 549
    :goto_e
    invoke-static {}, LJ3/r;->d()LJ3/r;

    .line 550
    .line 551
    .line 552
    move-result-object v4

    .line 553
    iget v4, v4, LJ3/r;->a:I

    .line 554
    .line 555
    const/4 v5, 0x5

    .line 556
    if-gt v4, v5, :cond_13

    .line 557
    .line 558
    const-string v4, "Ignoring exception"

    .line 559
    .line 560
    invoke-static {v11, v4, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 561
    .line 562
    .line 563
    :cond_13
    :goto_f
    invoke-static {}, LJ3/r;->d()LJ3/r;

    .line 564
    .line 565
    .line 566
    move-result-object v0

    .line 567
    const-string v4, "Application was force-stopped, rescheduling."

    .line 568
    .line 569
    invoke-virtual {v0, v11, v4}, LJ3/r;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 570
    .line 571
    .line 572
    invoke-virtual {v7}, LK3/q;->f()V

    .line 573
    .line 574
    .line 575
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 576
    .line 577
    .line 578
    move-result-wide v4

    .line 579
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 580
    .line 581
    .line 582
    new-instance v0, LS3/d;

    .line 583
    .line 584
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 585
    .line 586
    .line 587
    move-result-object v4

    .line 588
    invoke-direct {v0, v2, v4}, LS3/d;-><init>(Ljava/lang/String;Ljava/lang/Long;)V

    .line 589
    .line 590
    .line 591
    iget-object v2, v3, Lxa/d;->b:Ljava/lang/Object;

    .line 592
    .line 593
    check-cast v2, Landroidx/work/impl/WorkDatabase;

    .line 594
    .line 595
    invoke-virtual {v2}, Landroidx/work/impl/WorkDatabase;->q()LS3/e;

    .line 596
    .line 597
    .line 598
    move-result-object v2

    .line 599
    invoke-virtual {v2, v0}, LS3/e;->q(LS3/d;)V

    .line 600
    .line 601
    .line 602
    :cond_14
    return-void

    .line 603
    :catchall_3
    move-exception v0

    .line 604
    :try_start_6
    invoke-virtual {v8}, Lk3/m;->j()V

    .line 605
    .line 606
    .line 607
    invoke-virtual {v9, v10}, LE9/c;->q(Lo3/g;)V

    .line 608
    .line 609
    .line 610
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 611
    :goto_10
    invoke-virtual {v6}, Lk3/m;->j()V

    .line 612
    .line 613
    .line 614
    throw v0

    .line 615
    :goto_11
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 616
    .line 617
    .line 618
    invoke-virtual {v9}, Lk3/q;->h()V

    .line 619
    .line 620
    .line 621
    throw v0
.end method

.method public final b()Z
    .locals 5

    .line 1
    iget-object v0, p0, LT3/f;->b:LK3/q;

    .line 2
    .line 3
    iget-object v0, v0, LK3/q;->b:LJ3/b;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    sget-object v2, LT3/f;->e:Ljava/lang/String;

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-static {}, LJ3/r;->d()LJ3/r;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const-string v1, "The default process name was not specified."

    .line 22
    .line 23
    invoke-virtual {v0, v2, v1}, LJ3/r;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const/4 v0, 0x1

    .line 27
    return v0

    .line 28
    :cond_0
    iget-object v1, p0, LT3/f;->a:Landroid/content/Context;

    .line 29
    .line 30
    invoke-static {v1, v0}, LT3/l;->a(Landroid/content/Context;LJ3/b;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    invoke-static {}, LJ3/r;->d()LJ3/r;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    new-instance v3, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    const-string v4, "Is default app process = "

    .line 41
    .line 42
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    invoke-virtual {v1, v2, v3}, LJ3/r;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    return v0
.end method

.method public final run()V
    .locals 11

    .line 1
    sget-object v0, LT3/f;->e:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, LT3/f;->b:LK3/q;

    .line 4
    .line 5
    :try_start_0
    invoke-virtual {p0}, LT3/f;->b()Z

    .line 6
    .line 7
    .line 8
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    if-nez v2, :cond_0

    .line 10
    .line 11
    invoke-virtual {v1}, LK3/q;->e()V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :catch_0
    :cond_0
    :goto_0
    :try_start_1
    iget-object v2, p0, LT3/f;->a:Landroid/content/Context;

    .line 16
    .line 17
    invoke-static {v2}, LU8/v0;->V(Landroid/content/Context;)V
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_8
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 18
    .line 19
    .line 20
    :try_start_2
    invoke-static {}, LJ3/r;->d()LJ3/r;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    const-string v3, "Performing cleanup operations."

    .line 25
    .line 26
    invoke-virtual {v2, v0, v3}, LJ3/r;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 27
    .line 28
    .line 29
    :try_start_3
    invoke-virtual {p0}, LT3/f;->a()V
    :try_end_3
    .catch Landroid/database/sqlite/SQLiteCantOpenDatabaseException; {:try_start_3 .. :try_end_3} :catch_7
    .catch Landroid/database/sqlite/SQLiteDiskIOException; {:try_start_3 .. :try_end_3} :catch_6
    .catch Landroid/database/sqlite/SQLiteDatabaseCorruptException; {:try_start_3 .. :try_end_3} :catch_5
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_3 .. :try_end_3} :catch_4
    .catch Landroid/database/sqlite/SQLiteTableLockedException; {:try_start_3 .. :try_end_3} :catch_3
    .catch Landroid/database/sqlite/SQLiteConstraintException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Landroid/database/sqlite/SQLiteAccessPermException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, LK3/q;->e()V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :catchall_0
    move-exception v0

    .line 37
    goto :goto_2

    .line 38
    :catch_1
    move-exception v2

    .line 39
    goto :goto_1

    .line 40
    :catch_2
    move-exception v2

    .line 41
    goto :goto_1

    .line 42
    :catch_3
    move-exception v2

    .line 43
    goto :goto_1

    .line 44
    :catch_4
    move-exception v2

    .line 45
    goto :goto_1

    .line 46
    :catch_5
    move-exception v2

    .line 47
    goto :goto_1

    .line 48
    :catch_6
    move-exception v2

    .line 49
    goto :goto_1

    .line 50
    :catch_7
    move-exception v2

    .line 51
    :goto_1
    :try_start_4
    iget v3, p0, LT3/f;->d:I

    .line 52
    .line 53
    add-int/lit8 v3, v3, 0x1

    .line 54
    .line 55
    iput v3, p0, LT3/f;->d:I

    .line 56
    .line 57
    const/4 v4, 0x3

    .line 58
    if-ge v3, v4, :cond_2

    .line 59
    .line 60
    int-to-long v5, v3

    .line 61
    const-wide/16 v7, 0x12c

    .line 62
    .line 63
    mul-long/2addr v5, v7

    .line 64
    invoke-static {}, LJ3/r;->d()LJ3/r;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    new-instance v9, Ljava/lang/StringBuilder;

    .line 69
    .line 70
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 71
    .line 72
    .line 73
    const-string v10, "Retrying after "

    .line 74
    .line 75
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v9, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    iget v3, v3, LJ3/r;->a:I

    .line 86
    .line 87
    if-gt v3, v4, :cond_1

    .line 88
    .line 89
    invoke-static {v0, v5, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 90
    .line 91
    .line 92
    :cond_1
    iget v2, p0, LT3/f;->d:I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 93
    .line 94
    int-to-long v2, v2

    .line 95
    mul-long/2addr v2, v7

    .line 96
    :try_start_5
    invoke-static {v2, v3}, Ljava/lang/Thread;->sleep(J)V
    :try_end_5
    .catch Ljava/lang/InterruptedException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 97
    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_2
    :try_start_6
    const-string v3, "The file system on the device is in a bad state. WorkManager cannot access the app\'s internal data store."

    .line 101
    .line 102
    invoke-static {}, LJ3/r;->d()LJ3/r;

    .line 103
    .line 104
    .line 105
    move-result-object v4

    .line 106
    invoke-virtual {v4, v0, v3, v2}, LJ3/r;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 107
    .line 108
    .line 109
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 110
    .line 111
    invoke-direct {v0, v3, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 112
    .line 113
    .line 114
    iget-object v2, v1, LK3/q;->b:LJ3/b;

    .line 115
    .line 116
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    throw v0

    .line 120
    :catch_8
    move-exception v2

    .line 121
    const-string v3, "Unexpected SQLite exception during migrations"

    .line 122
    .line 123
    invoke-static {}, LJ3/r;->d()LJ3/r;

    .line 124
    .line 125
    .line 126
    move-result-object v4

    .line 127
    invoke-virtual {v4, v0, v3}, LJ3/r;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 131
    .line 132
    invoke-direct {v0, v3, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 133
    .line 134
    .line 135
    iget-object v2, v1, LK3/q;->b:LJ3/b;

    .line 136
    .line 137
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 141
    :goto_2
    invoke-virtual {v1}, LK3/q;->e()V

    .line 142
    .line 143
    .line 144
    throw v0
.end method
