.class public final LM3/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LK3/c;


# static fields
.field public static final e:Ljava/lang/String;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/util/HashMap;

.field public final c:Ljava/lang/Object;

.field public final d:LS3/s;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "CommandHandler"

    .line 2
    .line 3
    invoke-static {v0}, LJ3/r;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, LM3/c;->e:Ljava/lang/String;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;LS3/s;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LM3/c;->a:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, LM3/c;->d:LS3/s;

    .line 7
    .line 8
    new-instance p1, Ljava/util/HashMap;

    .line 9
    .line 10
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, LM3/c;->b:Ljava/util/HashMap;

    .line 14
    .line 15
    new-instance p1, Ljava/lang/Object;

    .line 16
    .line 17
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, LM3/c;->c:Ljava/lang/Object;

    .line 21
    .line 22
    return-void
.end method

.method public static c(Landroid/content/Intent;)LS3/j;
    .locals 4

    .line 1
    new-instance v0, LS3/j;

    .line 2
    .line 3
    const-string v1, "KEY_WORKSPEC_ID"

    .line 4
    .line 5
    invoke-virtual {p0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-string v2, "KEY_WORKSPEC_GENERATION"

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    invoke-virtual {p0, v2, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    invoke-direct {v0, v1, p0}, LS3/j;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    return-object v0
.end method

.method public static e(Landroid/content/Intent;LS3/j;)V
    .locals 2

    .line 1
    const-string v0, "KEY_WORKSPEC_ID"

    .line 2
    .line 3
    iget-object v1, p1, LS3/j;->a:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {p0, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 6
    .line 7
    .line 8
    const-string v0, "KEY_WORKSPEC_GENERATION"

    .line 9
    .line 10
    iget p1, p1, LS3/j;->b:I

    .line 11
    .line 12
    invoke-virtual {p0, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 2

    .line 1
    iget-object v0, p0, LM3/c;->c:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, LM3/c;->b:Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/util/HashMap;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    xor-int/lit8 v1, v1, 0x1

    .line 11
    .line 12
    monitor-exit v0

    .line 13
    return v1

    .line 14
    :catchall_0
    move-exception v1

    .line 15
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    throw v1
.end method

.method public final b(Landroid/content/Intent;ILM3/j;)V
    .locals 10

    .line 1
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "ACTION_CONSTRAINTS_CHANGED"

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x1

    .line 12
    const/4 v3, 0x0

    .line 13
    if-eqz v1, :cond_7

    .line 14
    .line 15
    invoke-static {}, LJ3/r;->d()LJ3/r;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    new-instance v1, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    const-string v4, "Handling constraints changed "

    .line 22
    .line 23
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    sget-object v1, LM3/c;->e:Ljava/lang/String;

    .line 34
    .line 35
    invoke-virtual {v0, v1, p1}, LJ3/r;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    new-instance p1, LM3/e;

    .line 39
    .line 40
    iget-object v0, p0, LM3/c;->a:Landroid/content/Context;

    .line 41
    .line 42
    invoke-direct {p1, v0, p2, p3}, LM3/e;-><init>(Landroid/content/Context;ILM3/j;)V

    .line 43
    .line 44
    .line 45
    iget-object p2, p3, LM3/j;->e:LK3/q;

    .line 46
    .line 47
    iget-object p2, p2, LK3/q;->c:Landroidx/work/impl/WorkDatabase;

    .line 48
    .line 49
    invoke-virtual {p2}, Landroidx/work/impl/WorkDatabase;->u()LS3/q;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    invoke-virtual {p2}, LS3/q;->d()Ljava/util/ArrayList;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    sget-object v0, LM3/d;->a:Ljava/lang/String;

    .line 58
    .line 59
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    move v1, v3

    .line 64
    move v4, v1

    .line 65
    move v5, v4

    .line 66
    move v6, v5

    .line 67
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 68
    .line 69
    .line 70
    move-result v7

    .line 71
    if-eqz v7, :cond_2

    .line 72
    .line 73
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v7

    .line 77
    check-cast v7, LS3/p;

    .line 78
    .line 79
    iget-object v7, v7, LS3/p;->j:LJ3/d;

    .line 80
    .line 81
    iget-boolean v8, v7, LJ3/d;->d:Z

    .line 82
    .line 83
    or-int/2addr v1, v8

    .line 84
    iget-boolean v8, v7, LJ3/d;->b:Z

    .line 85
    .line 86
    or-int/2addr v4, v8

    .line 87
    iget-boolean v8, v7, LJ3/d;->e:Z

    .line 88
    .line 89
    or-int/2addr v5, v8

    .line 90
    iget v7, v7, LJ3/d;->a:I

    .line 91
    .line 92
    if-eq v7, v2, :cond_1

    .line 93
    .line 94
    move v7, v2

    .line 95
    goto :goto_0

    .line 96
    :cond_1
    move v7, v3

    .line 97
    :goto_0
    or-int/2addr v6, v7

    .line 98
    if-eqz v1, :cond_0

    .line 99
    .line 100
    if-eqz v4, :cond_0

    .line 101
    .line 102
    if-eqz v5, :cond_0

    .line 103
    .line 104
    if-eqz v6, :cond_0

    .line 105
    .line 106
    :cond_2
    sget-object v0, Landroidx/work/impl/background/systemalarm/ConstraintProxyUpdateReceiver;->a:Ljava/lang/String;

    .line 107
    .line 108
    new-instance v0, Landroid/content/Intent;

    .line 109
    .line 110
    const-string v2, "androidx.work.impl.background.systemalarm.UpdateProxies"

    .line 111
    .line 112
    invoke-direct {v0, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    new-instance v2, Landroid/content/ComponentName;

    .line 116
    .line 117
    iget-object v7, p1, LM3/e;->a:Landroid/content/Context;

    .line 118
    .line 119
    const-class v8, Landroidx/work/impl/background/systemalarm/ConstraintProxyUpdateReceiver;

    .line 120
    .line 121
    invoke-direct {v2, v7, v8}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v0, v2}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 125
    .line 126
    .line 127
    const-string v2, "KEY_BATTERY_NOT_LOW_PROXY_ENABLED"

    .line 128
    .line 129
    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    const-string v2, "KEY_BATTERY_CHARGING_PROXY_ENABLED"

    .line 134
    .line 135
    invoke-virtual {v1, v2, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    const-string v2, "KEY_STORAGE_NOT_LOW_PROXY_ENABLED"

    .line 140
    .line 141
    invoke-virtual {v1, v2, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    const-string v2, "KEY_NETWORK_STATE_PROXY_ENABLED"

    .line 146
    .line 147
    invoke-virtual {v1, v2, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v7, v0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 151
    .line 152
    .line 153
    iget-object v0, p1, LM3/e;->c:Lb7/k;

    .line 154
    .line 155
    invoke-virtual {v0, p2}, Lb7/k;->F(Ljava/lang/Iterable;)V

    .line 156
    .line 157
    .line 158
    new-instance v1, Ljava/util/ArrayList;

    .line 159
    .line 160
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 161
    .line 162
    .line 163
    move-result v2

    .line 164
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 165
    .line 166
    .line 167
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 168
    .line 169
    .line 170
    move-result-wide v4

    .line 171
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 172
    .line 173
    .line 174
    move-result-object p2

    .line 175
    :cond_3
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 176
    .line 177
    .line 178
    move-result v2

    .line 179
    if-eqz v2, :cond_5

    .line 180
    .line 181
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v2

    .line 185
    check-cast v2, LS3/p;

    .line 186
    .line 187
    iget-object v6, v2, LS3/p;->a:Ljava/lang/String;

    .line 188
    .line 189
    invoke-virtual {v2}, LS3/p;->a()J

    .line 190
    .line 191
    .line 192
    move-result-wide v8

    .line 193
    cmp-long v8, v4, v8

    .line 194
    .line 195
    if-ltz v8, :cond_3

    .line 196
    .line 197
    invoke-virtual {v2}, LS3/p;->b()Z

    .line 198
    .line 199
    .line 200
    move-result v8

    .line 201
    if-eqz v8, :cond_4

    .line 202
    .line 203
    invoke-virtual {v0, v6}, Lb7/k;->m(Ljava/lang/String;)Z

    .line 204
    .line 205
    .line 206
    move-result v6

    .line 207
    if-eqz v6, :cond_3

    .line 208
    .line 209
    :cond_4
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 210
    .line 211
    .line 212
    goto :goto_1

    .line 213
    :cond_5
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 214
    .line 215
    .line 216
    move-result-object p2

    .line 217
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 218
    .line 219
    .line 220
    move-result v1

    .line 221
    if-eqz v1, :cond_6

    .line 222
    .line 223
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v1

    .line 227
    check-cast v1, LS3/p;

    .line 228
    .line 229
    iget-object v2, v1, LS3/p;->a:Ljava/lang/String;

    .line 230
    .line 231
    invoke-static {v1}, LFe/c;->s(LS3/p;)LS3/j;

    .line 232
    .line 233
    .line 234
    move-result-object v1

    .line 235
    new-instance v4, Landroid/content/Intent;

    .line 236
    .line 237
    const-class v5, Landroidx/work/impl/background/systemalarm/SystemAlarmService;

    .line 238
    .line 239
    invoke-direct {v4, v7, v5}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 240
    .line 241
    .line 242
    const-string v5, "ACTION_DELAY_MET"

    .line 243
    .line 244
    invoke-virtual {v4, v5}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 245
    .line 246
    .line 247
    invoke-static {v4, v1}, LM3/c;->e(Landroid/content/Intent;LS3/j;)V

    .line 248
    .line 249
    .line 250
    invoke-static {}, LJ3/r;->d()LJ3/r;

    .line 251
    .line 252
    .line 253
    move-result-object v1

    .line 254
    const-string v5, "Creating a delay_met command for workSpec with id ("

    .line 255
    .line 256
    const-string v6, ")"

    .line 257
    .line 258
    invoke-static {v5, v2, v6}, LA7/p0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v2

    .line 262
    sget-object v5, LM3/e;->d:Ljava/lang/String;

    .line 263
    .line 264
    invoke-virtual {v1, v5, v2}, LJ3/r;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    iget-object v1, p3, LM3/j;->b:Lb7/k;

    .line 268
    .line 269
    iget-object v1, v1, Lb7/k;->d:Ljava/lang/Object;

    .line 270
    .line 271
    check-cast v1, LA7/V0;

    .line 272
    .line 273
    new-instance v2, LM3/i;

    .line 274
    .line 275
    iget v5, p1, LM3/e;->b:I

    .line 276
    .line 277
    invoke-direct {v2, p3, v4, v5, v3}, LM3/i;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {v1, v2}, LA7/V0;->execute(Ljava/lang/Runnable;)V

    .line 281
    .line 282
    .line 283
    goto :goto_2

    .line 284
    :cond_6
    invoke-virtual {v0}, Lb7/k;->G()V

    .line 285
    .line 286
    .line 287
    return-void

    .line 288
    :cond_7
    const-string v1, "ACTION_RESCHEDULE"

    .line 289
    .line 290
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 291
    .line 292
    .line 293
    move-result v1

    .line 294
    if-eqz v1, :cond_8

    .line 295
    .line 296
    invoke-static {}, LJ3/r;->d()LJ3/r;

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    new-instance v1, Ljava/lang/StringBuilder;

    .line 301
    .line 302
    const-string v2, "Handling reschedule "

    .line 303
    .line 304
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 305
    .line 306
    .line 307
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 308
    .line 309
    .line 310
    const-string p1, ", "

    .line 311
    .line 312
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 313
    .line 314
    .line 315
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 316
    .line 317
    .line 318
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 319
    .line 320
    .line 321
    move-result-object p1

    .line 322
    sget-object p2, LM3/c;->e:Ljava/lang/String;

    .line 323
    .line 324
    invoke-virtual {v0, p2, p1}, LJ3/r;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 325
    .line 326
    .line 327
    iget-object p1, p3, LM3/j;->e:LK3/q;

    .line 328
    .line 329
    invoke-virtual {p1}, LK3/q;->f()V

    .line 330
    .line 331
    .line 332
    return-void

    .line 333
    :cond_8
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 334
    .line 335
    .line 336
    move-result-object v1

    .line 337
    const-string v4, "KEY_WORKSPEC_ID"

    .line 338
    .line 339
    filled-new-array {v4}, [Ljava/lang/String;

    .line 340
    .line 341
    .line 342
    move-result-object v4

    .line 343
    if-eqz v1, :cond_18

    .line 344
    .line 345
    invoke-virtual {v1}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 346
    .line 347
    .line 348
    move-result v5

    .line 349
    if-eqz v5, :cond_9

    .line 350
    .line 351
    goto/16 :goto_b

    .line 352
    .line 353
    :cond_9
    aget-object v4, v4, v3

    .line 354
    .line 355
    invoke-virtual {v1, v4}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 356
    .line 357
    .line 358
    move-result-object v1

    .line 359
    if-nez v1, :cond_a

    .line 360
    .line 361
    goto/16 :goto_b

    .line 362
    .line 363
    :cond_a
    const-string v1, "ACTION_SCHEDULE_WORK"

    .line 364
    .line 365
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 366
    .line 367
    .line 368
    move-result v1

    .line 369
    if-eqz v1, :cond_e

    .line 370
    .line 371
    const-string v0, "Opportunistically setting an alarm for "

    .line 372
    .line 373
    const-string v1, "Setting up Alarms for "

    .line 374
    .line 375
    invoke-static {p1}, LM3/c;->c(Landroid/content/Intent;)LS3/j;

    .line 376
    .line 377
    .line 378
    move-result-object p1

    .line 379
    invoke-static {}, LJ3/r;->d()LJ3/r;

    .line 380
    .line 381
    .line 382
    move-result-object v2

    .line 383
    new-instance v4, Ljava/lang/StringBuilder;

    .line 384
    .line 385
    const-string v5, "Handling schedule work for "

    .line 386
    .line 387
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 388
    .line 389
    .line 390
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 391
    .line 392
    .line 393
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 394
    .line 395
    .line 396
    move-result-object v4

    .line 397
    sget-object v5, LM3/c;->e:Ljava/lang/String;

    .line 398
    .line 399
    invoke-virtual {v2, v5, v4}, LJ3/r;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 400
    .line 401
    .line 402
    iget-object v2, p3, LM3/j;->e:LK3/q;

    .line 403
    .line 404
    iget-object v2, v2, LK3/q;->c:Landroidx/work/impl/WorkDatabase;

    .line 405
    .line 406
    invoke-virtual {v2}, Lk3/m;->c()V

    .line 407
    .line 408
    .line 409
    :try_start_0
    invoke-virtual {v2}, Landroidx/work/impl/WorkDatabase;->u()LS3/q;

    .line 410
    .line 411
    .line 412
    move-result-object v4

    .line 413
    iget-object v6, p1, LS3/j;->a:Ljava/lang/String;

    .line 414
    .line 415
    invoke-virtual {v4, v6}, LS3/q;->h(Ljava/lang/String;)LS3/p;

    .line 416
    .line 417
    .line 418
    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 419
    const-string v6, "Skipping scheduling "

    .line 420
    .line 421
    if-nez v4, :cond_b

    .line 422
    .line 423
    :try_start_1
    invoke-static {}, LJ3/r;->d()LJ3/r;

    .line 424
    .line 425
    .line 426
    move-result-object p2

    .line 427
    new-instance p3, Ljava/lang/StringBuilder;

    .line 428
    .line 429
    invoke-direct {p3, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 430
    .line 431
    .line 432
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 433
    .line 434
    .line 435
    const-string p1, " because it\'s no longer in the DB"

    .line 436
    .line 437
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 438
    .line 439
    .line 440
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 441
    .line 442
    .line 443
    move-result-object p1

    .line 444
    invoke-virtual {p2, v5, p1}, LJ3/r;->g(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 445
    .line 446
    .line 447
    invoke-virtual {v2}, Lk3/m;->j()V

    .line 448
    .line 449
    .line 450
    return-void

    .line 451
    :catchall_0
    move-exception p1

    .line 452
    goto/16 :goto_4

    .line 453
    .line 454
    :cond_b
    :try_start_2
    iget v7, v4, LS3/p;->b:I

    .line 455
    .line 456
    invoke-static {v7}, LA7/p0;->d(I)Z

    .line 457
    .line 458
    .line 459
    move-result v7

    .line 460
    if-eqz v7, :cond_c

    .line 461
    .line 462
    invoke-static {}, LJ3/r;->d()LJ3/r;

    .line 463
    .line 464
    .line 465
    move-result-object p2

    .line 466
    new-instance p3, Ljava/lang/StringBuilder;

    .line 467
    .line 468
    invoke-direct {p3, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 469
    .line 470
    .line 471
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 472
    .line 473
    .line 474
    const-string p1, "because it is finished."

    .line 475
    .line 476
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 477
    .line 478
    .line 479
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 480
    .line 481
    .line 482
    move-result-object p1

    .line 483
    invoke-virtual {p2, v5, p1}, LJ3/r;->g(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 484
    .line 485
    .line 486
    invoke-virtual {v2}, Lk3/m;->j()V

    .line 487
    .line 488
    .line 489
    return-void

    .line 490
    :cond_c
    :try_start_3
    invoke-virtual {v4}, LS3/p;->a()J

    .line 491
    .line 492
    .line 493
    move-result-wide v6

    .line 494
    invoke-virtual {v4}, LS3/p;->b()Z

    .line 495
    .line 496
    .line 497
    move-result v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 498
    const-string v8, "at "

    .line 499
    .line 500
    iget-object v9, p0, LM3/c;->a:Landroid/content/Context;

    .line 501
    .line 502
    if-nez v4, :cond_d

    .line 503
    .line 504
    :try_start_4
    invoke-static {}, LJ3/r;->d()LJ3/r;

    .line 505
    .line 506
    .line 507
    move-result-object p2

    .line 508
    new-instance p3, Ljava/lang/StringBuilder;

    .line 509
    .line 510
    invoke-direct {p3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 511
    .line 512
    .line 513
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 514
    .line 515
    .line 516
    invoke-virtual {p3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 517
    .line 518
    .line 519
    invoke-virtual {p3, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 520
    .line 521
    .line 522
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 523
    .line 524
    .line 525
    move-result-object p3

    .line 526
    invoke-virtual {p2, v5, p3}, LJ3/r;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 527
    .line 528
    .line 529
    invoke-static {v9, v2, p1, v6, v7}, LM3/b;->b(Landroid/content/Context;Landroidx/work/impl/WorkDatabase;LS3/j;J)V

    .line 530
    .line 531
    .line 532
    goto :goto_3

    .line 533
    :cond_d
    invoke-static {}, LJ3/r;->d()LJ3/r;

    .line 534
    .line 535
    .line 536
    move-result-object v1

    .line 537
    new-instance v4, Ljava/lang/StringBuilder;

    .line 538
    .line 539
    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 540
    .line 541
    .line 542
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 543
    .line 544
    .line 545
    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 546
    .line 547
    .line 548
    invoke-virtual {v4, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 549
    .line 550
    .line 551
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 552
    .line 553
    .line 554
    move-result-object v0

    .line 555
    invoke-virtual {v1, v5, v0}, LJ3/r;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 556
    .line 557
    .line 558
    invoke-static {v9, v2, p1, v6, v7}, LM3/b;->b(Landroid/content/Context;Landroidx/work/impl/WorkDatabase;LS3/j;J)V

    .line 559
    .line 560
    .line 561
    new-instance p1, Landroid/content/Intent;

    .line 562
    .line 563
    const-class v0, Landroidx/work/impl/background/systemalarm/SystemAlarmService;

    .line 564
    .line 565
    invoke-direct {p1, v9, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 566
    .line 567
    .line 568
    const-string v0, "ACTION_CONSTRAINTS_CHANGED"

    .line 569
    .line 570
    invoke-virtual {p1, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 571
    .line 572
    .line 573
    iget-object v0, p3, LM3/j;->b:Lb7/k;

    .line 574
    .line 575
    iget-object v0, v0, Lb7/k;->d:Ljava/lang/Object;

    .line 576
    .line 577
    check-cast v0, LA7/V0;

    .line 578
    .line 579
    new-instance v1, LM3/i;

    .line 580
    .line 581
    invoke-direct {v1, p3, p1, p2, v3}, LM3/i;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    .line 582
    .line 583
    .line 584
    invoke-virtual {v0, v1}, LA7/V0;->execute(Ljava/lang/Runnable;)V

    .line 585
    .line 586
    .line 587
    :goto_3
    invoke-virtual {v2}, Lk3/m;->n()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 588
    .line 589
    .line 590
    invoke-virtual {v2}, Lk3/m;->j()V

    .line 591
    .line 592
    .line 593
    return-void

    .line 594
    :goto_4
    invoke-virtual {v2}, Lk3/m;->j()V

    .line 595
    .line 596
    .line 597
    throw p1

    .line 598
    :cond_e
    const-string v1, "ACTION_DELAY_MET"

    .line 599
    .line 600
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 601
    .line 602
    .line 603
    move-result v1

    .line 604
    if-eqz v1, :cond_10

    .line 605
    .line 606
    const-string v0, "WorkSpec "

    .line 607
    .line 608
    const-string v1, "Handing delay met for "

    .line 609
    .line 610
    iget-object v4, p0, LM3/c;->c:Ljava/lang/Object;

    .line 611
    .line 612
    monitor-enter v4

    .line 613
    :try_start_5
    invoke-static {p1}, LM3/c;->c(Landroid/content/Intent;)LS3/j;

    .line 614
    .line 615
    .line 616
    move-result-object p1

    .line 617
    invoke-static {}, LJ3/r;->d()LJ3/r;

    .line 618
    .line 619
    .line 620
    move-result-object v2

    .line 621
    sget-object v3, LM3/c;->e:Ljava/lang/String;

    .line 622
    .line 623
    new-instance v5, Ljava/lang/StringBuilder;

    .line 624
    .line 625
    invoke-direct {v5, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 626
    .line 627
    .line 628
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 629
    .line 630
    .line 631
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 632
    .line 633
    .line 634
    move-result-object v1

    .line 635
    invoke-virtual {v2, v3, v1}, LJ3/r;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 636
    .line 637
    .line 638
    iget-object v1, p0, LM3/c;->b:Ljava/util/HashMap;

    .line 639
    .line 640
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 641
    .line 642
    .line 643
    move-result v1

    .line 644
    if-nez v1, :cond_f

    .line 645
    .line 646
    new-instance v0, LM3/g;

    .line 647
    .line 648
    iget-object v1, p0, LM3/c;->a:Landroid/content/Context;

    .line 649
    .line 650
    iget-object v2, p0, LM3/c;->d:LS3/s;

    .line 651
    .line 652
    invoke-virtual {v2, p1}, LS3/s;->y(LS3/j;)LK3/j;

    .line 653
    .line 654
    .line 655
    move-result-object v2

    .line 656
    invoke-direct {v0, v1, p2, p3, v2}, LM3/g;-><init>(Landroid/content/Context;ILM3/j;LK3/j;)V

    .line 657
    .line 658
    .line 659
    iget-object p2, p0, LM3/c;->b:Ljava/util/HashMap;

    .line 660
    .line 661
    invoke-virtual {p2, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 662
    .line 663
    .line 664
    invoke-virtual {v0}, LM3/g;->d()V

    .line 665
    .line 666
    .line 667
    goto :goto_5

    .line 668
    :catchall_1
    move-exception p1

    .line 669
    goto :goto_6

    .line 670
    :cond_f
    invoke-static {}, LJ3/r;->d()LJ3/r;

    .line 671
    .line 672
    .line 673
    move-result-object p2

    .line 674
    new-instance p3, Ljava/lang/StringBuilder;

    .line 675
    .line 676
    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 677
    .line 678
    .line 679
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 680
    .line 681
    .line 682
    const-string p1, " is is already being handled for ACTION_DELAY_MET"

    .line 683
    .line 684
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 685
    .line 686
    .line 687
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 688
    .line 689
    .line 690
    move-result-object p1

    .line 691
    invoke-virtual {p2, v3, p1}, LJ3/r;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 692
    .line 693
    .line 694
    :goto_5
    monitor-exit v4

    .line 695
    return-void

    .line 696
    :goto_6
    monitor-exit v4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 697
    throw p1

    .line 698
    :cond_10
    const-string v1, "ACTION_STOP_WORK"

    .line 699
    .line 700
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 701
    .line 702
    .line 703
    move-result v1

    .line 704
    if-eqz v1, :cond_16

    .line 705
    .line 706
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 707
    .line 708
    .line 709
    move-result-object p1

    .line 710
    const-string p2, "KEY_WORKSPEC_ID"

    .line 711
    .line 712
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 713
    .line 714
    .line 715
    move-result-object p2

    .line 716
    const-string v0, "KEY_WORKSPEC_GENERATION"

    .line 717
    .line 718
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 719
    .line 720
    .line 721
    move-result v1

    .line 722
    iget-object v4, p0, LM3/c;->d:LS3/s;

    .line 723
    .line 724
    if-eqz v1, :cond_11

    .line 725
    .line 726
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 727
    .line 728
    .line 729
    move-result p1

    .line 730
    new-instance v0, Ljava/util/ArrayList;

    .line 731
    .line 732
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 733
    .line 734
    .line 735
    new-instance v1, LS3/j;

    .line 736
    .line 737
    invoke-direct {v1, p2, p1}, LS3/j;-><init>(Ljava/lang/String;I)V

    .line 738
    .line 739
    .line 740
    invoke-virtual {v4, v1}, LS3/s;->w(LS3/j;)LK3/j;

    .line 741
    .line 742
    .line 743
    move-result-object p1

    .line 744
    if-eqz p1, :cond_12

    .line 745
    .line 746
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 747
    .line 748
    .line 749
    goto :goto_7

    .line 750
    :cond_11
    invoke-virtual {v4, p2}, LS3/s;->x(Ljava/lang/String;)Ljava/util/List;

    .line 751
    .line 752
    .line 753
    move-result-object v0

    .line 754
    :cond_12
    :goto_7
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 755
    .line 756
    .line 757
    move-result-object p1

    .line 758
    :goto_8
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 759
    .line 760
    .line 761
    move-result v0

    .line 762
    if-eqz v0, :cond_15

    .line 763
    .line 764
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 765
    .line 766
    .line 767
    move-result-object v0

    .line 768
    check-cast v0, LK3/j;

    .line 769
    .line 770
    invoke-static {}, LJ3/r;->d()LJ3/r;

    .line 771
    .line 772
    .line 773
    move-result-object v1

    .line 774
    const-string v4, "Handing stopWork work for "

    .line 775
    .line 776
    invoke-static {v4, p2}, LR8/v;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 777
    .line 778
    .line 779
    move-result-object v4

    .line 780
    sget-object v5, LM3/c;->e:Ljava/lang/String;

    .line 781
    .line 782
    invoke-virtual {v1, v5, v4}, LJ3/r;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 783
    .line 784
    .line 785
    iget-object v1, p3, LM3/j;->e:LK3/q;

    .line 786
    .line 787
    invoke-virtual {v1, v0}, LK3/q;->h(LK3/j;)V

    .line 788
    .line 789
    .line 790
    iget-object v1, p3, LM3/j;->e:LK3/q;

    .line 791
    .line 792
    iget-object v1, v1, LK3/q;->c:Landroidx/work/impl/WorkDatabase;

    .line 793
    .line 794
    iget-object v4, v0, LK3/j;->a:LS3/j;

    .line 795
    .line 796
    sget-object v5, LM3/b;->a:Ljava/lang/String;

    .line 797
    .line 798
    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->r()LS3/i;

    .line 799
    .line 800
    .line 801
    move-result-object v1

    .line 802
    invoke-virtual {v1, v4}, LS3/i;->c(LS3/j;)LS3/g;

    .line 803
    .line 804
    .line 805
    move-result-object v5

    .line 806
    if-eqz v5, :cond_14

    .line 807
    .line 808
    iget v5, v5, LS3/g;->c:I

    .line 809
    .line 810
    iget-object v6, p0, LM3/c;->a:Landroid/content/Context;

    .line 811
    .line 812
    invoke-static {v6, v4, v5}, LM3/b;->a(Landroid/content/Context;LS3/j;I)V

    .line 813
    .line 814
    .line 815
    invoke-static {}, LJ3/r;->d()LJ3/r;

    .line 816
    .line 817
    .line 818
    move-result-object v5

    .line 819
    new-instance v6, Ljava/lang/StringBuilder;

    .line 820
    .line 821
    const-string v7, "Removing SystemIdInfo for workSpecId ("

    .line 822
    .line 823
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 824
    .line 825
    .line 826
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 827
    .line 828
    .line 829
    const-string v7, ")"

    .line 830
    .line 831
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 832
    .line 833
    .line 834
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 835
    .line 836
    .line 837
    move-result-object v6

    .line 838
    sget-object v7, LM3/b;->a:Ljava/lang/String;

    .line 839
    .line 840
    invoke-virtual {v5, v7, v6}, LJ3/r;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 841
    .line 842
    .line 843
    iget-object v5, v1, LS3/i;->a:Ljava/lang/Object;

    .line 844
    .line 845
    check-cast v5, Landroidx/work/impl/WorkDatabase_Impl;

    .line 846
    .line 847
    invoke-virtual {v5}, Lk3/m;->b()V

    .line 848
    .line 849
    .line 850
    iget-object v1, v1, LS3/i;->c:Ljava/lang/Object;

    .line 851
    .line 852
    check-cast v1, LS3/h;

    .line 853
    .line 854
    invoke-virtual {v1}, LE9/c;->a()Lo3/g;

    .line 855
    .line 856
    .line 857
    move-result-object v6

    .line 858
    iget-object v7, v4, LS3/j;->a:Ljava/lang/String;

    .line 859
    .line 860
    if-nez v7, :cond_13

    .line 861
    .line 862
    invoke-interface {v6, v2}, Lo3/e;->N(I)V

    .line 863
    .line 864
    .line 865
    goto :goto_9

    .line 866
    :cond_13
    invoke-interface {v6, v2, v7}, Lo3/e;->x(ILjava/lang/String;)V

    .line 867
    .line 868
    .line 869
    :goto_9
    iget v4, v4, LS3/j;->b:I

    .line 870
    .line 871
    int-to-long v7, v4

    .line 872
    const/4 v4, 0x2

    .line 873
    invoke-interface {v6, v4, v7, v8}, Lo3/e;->G(IJ)V

    .line 874
    .line 875
    .line 876
    invoke-virtual {v5}, Lk3/m;->c()V

    .line 877
    .line 878
    .line 879
    :try_start_6
    invoke-interface {v6}, Lo3/g;->g()I

    .line 880
    .line 881
    .line 882
    invoke-virtual {v5}, Lk3/m;->n()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 883
    .line 884
    .line 885
    invoke-virtual {v5}, Lk3/m;->j()V

    .line 886
    .line 887
    .line 888
    invoke-virtual {v1, v6}, LE9/c;->q(Lo3/g;)V

    .line 889
    .line 890
    .line 891
    goto :goto_a

    .line 892
    :catchall_2
    move-exception p1

    .line 893
    invoke-virtual {v5}, Lk3/m;->j()V

    .line 894
    .line 895
    .line 896
    invoke-virtual {v1, v6}, LE9/c;->q(Lo3/g;)V

    .line 897
    .line 898
    .line 899
    throw p1

    .line 900
    :cond_14
    :goto_a
    iget-object v0, v0, LK3/j;->a:LS3/j;

    .line 901
    .line 902
    invoke-virtual {p3, v0, v3}, LM3/j;->d(LS3/j;Z)V

    .line 903
    .line 904
    .line 905
    goto/16 :goto_8

    .line 906
    .line 907
    :cond_15
    return-void

    .line 908
    :cond_16
    const-string p3, "ACTION_EXECUTION_COMPLETED"

    .line 909
    .line 910
    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 911
    .line 912
    .line 913
    move-result p3

    .line 914
    if-eqz p3, :cond_17

    .line 915
    .line 916
    invoke-static {p1}, LM3/c;->c(Landroid/content/Intent;)LS3/j;

    .line 917
    .line 918
    .line 919
    move-result-object p3

    .line 920
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 921
    .line 922
    .line 923
    move-result-object v0

    .line 924
    const-string v1, "KEY_NEEDS_RESCHEDULE"

    .line 925
    .line 926
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 927
    .line 928
    .line 929
    move-result v0

    .line 930
    invoke-static {}, LJ3/r;->d()LJ3/r;

    .line 931
    .line 932
    .line 933
    move-result-object v1

    .line 934
    new-instance v2, Ljava/lang/StringBuilder;

    .line 935
    .line 936
    const-string v3, "Handling onExecutionCompleted "

    .line 937
    .line 938
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 939
    .line 940
    .line 941
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 942
    .line 943
    .line 944
    const-string p1, ", "

    .line 945
    .line 946
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 947
    .line 948
    .line 949
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 950
    .line 951
    .line 952
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 953
    .line 954
    .line 955
    move-result-object p1

    .line 956
    sget-object p2, LM3/c;->e:Ljava/lang/String;

    .line 957
    .line 958
    invoke-virtual {v1, p2, p1}, LJ3/r;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 959
    .line 960
    .line 961
    invoke-virtual {p0, p3, v0}, LM3/c;->d(LS3/j;Z)V

    .line 962
    .line 963
    .line 964
    return-void

    .line 965
    :cond_17
    invoke-static {}, LJ3/r;->d()LJ3/r;

    .line 966
    .line 967
    .line 968
    move-result-object p2

    .line 969
    sget-object p3, LM3/c;->e:Ljava/lang/String;

    .line 970
    .line 971
    new-instance v0, Ljava/lang/StringBuilder;

    .line 972
    .line 973
    const-string v1, "Ignoring intent "

    .line 974
    .line 975
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 976
    .line 977
    .line 978
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 979
    .line 980
    .line 981
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 982
    .line 983
    .line 984
    move-result-object p1

    .line 985
    invoke-virtual {p2, p3, p1}, LJ3/r;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 986
    .line 987
    .line 988
    return-void

    .line 989
    :cond_18
    :goto_b
    invoke-static {}, LJ3/r;->d()LJ3/r;

    .line 990
    .line 991
    .line 992
    move-result-object p1

    .line 993
    sget-object p2, LM3/c;->e:Ljava/lang/String;

    .line 994
    .line 995
    new-instance p3, Ljava/lang/StringBuilder;

    .line 996
    .line 997
    const-string v1, "Invalid request for "

    .line 998
    .line 999
    invoke-direct {p3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1000
    .line 1001
    .line 1002
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1003
    .line 1004
    .line 1005
    const-string v0, " , requires KEY_WORKSPEC_ID ."

    .line 1006
    .line 1007
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1008
    .line 1009
    .line 1010
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1011
    .line 1012
    .line 1013
    move-result-object p3

    .line 1014
    invoke-virtual {p1, p2, p3}, LJ3/r;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1015
    .line 1016
    .line 1017
    return-void
.end method

.method public final d(LS3/j;Z)V
    .locals 3

    .line 1
    iget-object v0, p0, LM3/c;->c:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, LM3/c;->b:Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    check-cast v1, LM3/g;

    .line 11
    .line 12
    iget-object v2, p0, LM3/c;->d:LS3/s;

    .line 13
    .line 14
    invoke-virtual {v2, p1}, LS3/s;->w(LS3/j;)LK3/j;

    .line 15
    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    invoke-virtual {v1, p2}, LM3/g;->e(Z)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception p1

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    :goto_0
    monitor-exit v0

    .line 26
    return-void

    .line 27
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    throw p1
.end method
