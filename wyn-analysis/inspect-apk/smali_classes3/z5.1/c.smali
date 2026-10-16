.class public final Lz5/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:LA5/d;

.field public final c:Lz5/a;


# direct methods
.method public constructor <init>(Landroid/content/Context;LA5/d;Lz5/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lz5/c;->a:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, Lz5/c;->b:LA5/d;

    .line 7
    .line 8
    iput-object p3, p0, Lz5/c;->c:Lz5/a;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(Lt5/i;IZ)V
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    const/4 v6, 0x0

    .line 8
    const/4 v7, 0x4

    .line 9
    new-instance v8, Landroid/content/ComponentName;

    .line 10
    .line 11
    iget-object v9, v1, Lz5/c;->a:Landroid/content/Context;

    .line 12
    .line 13
    const-class v10, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/JobInfoSchedulerService;

    .line 14
    .line 15
    invoke-direct {v8, v9, v10}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 16
    .line 17
    .line 18
    const-string v10, "jobscheduler"

    .line 19
    .line 20
    invoke-virtual {v9, v10}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v10

    .line 24
    check-cast v10, Landroid/app/job/JobScheduler;

    .line 25
    .line 26
    new-instance v11, Ljava/util/zip/Adler32;

    .line 27
    .line 28
    invoke-direct {v11}, Ljava/util/zip/Adler32;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v9}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v9

    .line 35
    const-string v12, "UTF-8"

    .line 36
    .line 37
    invoke-static {v12}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 38
    .line 39
    .line 40
    move-result-object v13

    .line 41
    invoke-virtual {v9, v13}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 42
    .line 43
    .line 44
    move-result-object v9

    .line 45
    invoke-virtual {v11, v9}, Ljava/util/zip/Adler32;->update([B)V

    .line 46
    .line 47
    .line 48
    iget-object v9, v0, Lt5/i;->a:Ljava/lang/String;

    .line 49
    .line 50
    invoke-static {v12}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 51
    .line 52
    .line 53
    move-result-object v12

    .line 54
    invoke-virtual {v9, v12}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 55
    .line 56
    .line 57
    move-result-object v9

    .line 58
    invoke-virtual {v11, v9}, Ljava/util/zip/Adler32;->update([B)V

    .line 59
    .line 60
    .line 61
    invoke-static {v7}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 62
    .line 63
    .line 64
    move-result-object v9

    .line 65
    iget-object v12, v0, Lt5/i;->c:Lq5/e;

    .line 66
    .line 67
    invoke-static {v12}, LD5/a;->a(Lq5/e;)I

    .line 68
    .line 69
    .line 70
    move-result v13

    .line 71
    invoke-virtual {v9, v13}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 72
    .line 73
    .line 74
    move-result-object v9

    .line 75
    invoke-virtual {v9}, Ljava/nio/ByteBuffer;->array()[B

    .line 76
    .line 77
    .line 78
    move-result-object v9

    .line 79
    invoke-virtual {v11, v9}, Ljava/util/zip/Adler32;->update([B)V

    .line 80
    .line 81
    .line 82
    iget-object v9, v0, Lt5/i;->b:[B

    .line 83
    .line 84
    if-eqz v9, :cond_0

    .line 85
    .line 86
    invoke-virtual {v11, v9}, Ljava/util/zip/Adler32;->update([B)V

    .line 87
    .line 88
    .line 89
    :cond_0
    invoke-virtual {v11}, Ljava/util/zip/Adler32;->getValue()J

    .line 90
    .line 91
    .line 92
    move-result-wide v13

    .line 93
    long-to-int v11, v13

    .line 94
    const-string v13, "JobInfoScheduler"

    .line 95
    .line 96
    const-string v14, "attemptNumber"

    .line 97
    .line 98
    if-nez p3, :cond_2

    .line 99
    .line 100
    invoke-virtual {v10}, Landroid/app/job/JobScheduler;->getAllPendingJobs()Ljava/util/List;

    .line 101
    .line 102
    .line 103
    move-result-object v15

    .line 104
    invoke-interface {v15}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 105
    .line 106
    .line 107
    move-result-object v15

    .line 108
    :goto_0
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    .line 109
    .line 110
    .line 111
    move-result v16

    .line 112
    if-eqz v16, :cond_2

    .line 113
    .line 114
    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v16

    .line 118
    check-cast v16, Landroid/app/job/JobInfo;

    .line 119
    .line 120
    move/from16 v17, v7

    .line 121
    .line 122
    invoke-virtual/range {v16 .. v16}, Landroid/app/job/JobInfo;->getExtras()Landroid/os/PersistableBundle;

    .line 123
    .line 124
    .line 125
    move-result-object v7

    .line 126
    invoke-virtual {v7, v14}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 127
    .line 128
    .line 129
    move-result v7

    .line 130
    const/16 v18, 0x3

    .line 131
    .line 132
    invoke-virtual/range {v16 .. v16}, Landroid/app/job/JobInfo;->getId()I

    .line 133
    .line 134
    .line 135
    move-result v3

    .line 136
    if-ne v3, v11, :cond_1

    .line 137
    .line 138
    if-lt v7, v2, :cond_3

    .line 139
    .line 140
    const-string v2, "Upload for context %s is already scheduled. Returning..."

    .line 141
    .line 142
    invoke-static {v13, v2, v0}, Lic/d;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    return-void

    .line 146
    :cond_1
    move/from16 v7, v17

    .line 147
    .line 148
    goto :goto_0

    .line 149
    :cond_2
    move/from16 v17, v7

    .line 150
    .line 151
    const/16 v18, 0x3

    .line 152
    .line 153
    :cond_3
    iget-object v3, v1, Lz5/c;->b:LA5/d;

    .line 154
    .line 155
    check-cast v3, LA5/m;

    .line 156
    .line 157
    invoke-virtual {v3}, LA5/m;->a()Landroid/database/sqlite/SQLiteDatabase;

    .line 158
    .line 159
    .line 160
    move-result-object v3

    .line 161
    invoke-static {v12}, LD5/a;->a(Lq5/e;)I

    .line 162
    .line 163
    .line 164
    move-result v7

    .line 165
    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v7

    .line 169
    iget-object v15, v0, Lt5/i;->a:Ljava/lang/String;

    .line 170
    .line 171
    filled-new-array {v15, v7}, [Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v7

    .line 175
    const-string v5, "SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?"

    .line 176
    .line 177
    invoke-virtual {v3, v5, v7}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    .line 178
    .line 179
    .line 180
    move-result-object v3

    .line 181
    :try_start_0
    invoke-interface {v3}, Landroid/database/Cursor;->moveToNext()Z

    .line 182
    .line 183
    .line 184
    move-result v5

    .line 185
    if-eqz v5, :cond_4

    .line 186
    .line 187
    invoke-interface {v3, v6}, Landroid/database/Cursor;->getLong(I)J

    .line 188
    .line 189
    .line 190
    move-result-wide v19

    .line 191
    invoke-static/range {v19 .. v20}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 192
    .line 193
    .line 194
    move-result-object v5

    .line 195
    goto :goto_1

    .line 196
    :cond_4
    const-wide/16 v19, 0x0

    .line 197
    .line 198
    invoke-static/range {v19 .. v20}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 199
    .line 200
    .line 201
    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 202
    :goto_1
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    .line 203
    .line 204
    .line 205
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 206
    .line 207
    .line 208
    move-result-wide v6

    .line 209
    new-instance v3, Landroid/app/job/JobInfo$Builder;

    .line 210
    .line 211
    invoke-direct {v3, v11, v8}, Landroid/app/job/JobInfo$Builder;-><init>(ILandroid/content/ComponentName;)V

    .line 212
    .line 213
    .line 214
    iget-object v8, v1, Lz5/c;->c:Lz5/a;

    .line 215
    .line 216
    move-object/from16 p3, v5

    .line 217
    .line 218
    invoke-virtual {v8, v12, v6, v7, v2}, Lz5/a;->a(Lq5/e;JI)J

    .line 219
    .line 220
    .line 221
    move-result-wide v4

    .line 222
    invoke-virtual {v3, v4, v5}, Landroid/app/job/JobInfo$Builder;->setMinimumLatency(J)Landroid/app/job/JobInfo$Builder;

    .line 223
    .line 224
    .line 225
    iget-object v4, v8, Lz5/a;->b:Ljava/util/HashMap;

    .line 226
    .line 227
    invoke-virtual {v4, v12}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v4

    .line 231
    check-cast v4, Lz5/b;

    .line 232
    .line 233
    iget-object v4, v4, Lz5/b;->c:Ljava/util/Set;

    .line 234
    .line 235
    sget-object v5, Lz5/d;->a:Lz5/d;

    .line 236
    .line 237
    invoke-interface {v4, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 238
    .line 239
    .line 240
    move-result v5

    .line 241
    if-eqz v5, :cond_5

    .line 242
    .line 243
    const/4 v5, 0x2

    .line 244
    invoke-virtual {v3, v5}, Landroid/app/job/JobInfo$Builder;->setRequiredNetworkType(I)Landroid/app/job/JobInfo$Builder;

    .line 245
    .line 246
    .line 247
    goto :goto_2

    .line 248
    :cond_5
    const/4 v5, 0x1

    .line 249
    invoke-virtual {v3, v5}, Landroid/app/job/JobInfo$Builder;->setRequiredNetworkType(I)Landroid/app/job/JobInfo$Builder;

    .line 250
    .line 251
    .line 252
    :goto_2
    sget-object v5, Lz5/d;->c:Lz5/d;

    .line 253
    .line 254
    invoke-interface {v4, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 255
    .line 256
    .line 257
    move-result v5

    .line 258
    if-eqz v5, :cond_6

    .line 259
    .line 260
    const/4 v5, 0x1

    .line 261
    invoke-virtual {v3, v5}, Landroid/app/job/JobInfo$Builder;->setRequiresCharging(Z)Landroid/app/job/JobInfo$Builder;

    .line 262
    .line 263
    .line 264
    :cond_6
    sget-object v5, Lz5/d;->b:Lz5/d;

    .line 265
    .line 266
    invoke-interface {v4, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 267
    .line 268
    .line 269
    move-result v4

    .line 270
    if-eqz v4, :cond_7

    .line 271
    .line 272
    const/4 v5, 0x1

    .line 273
    invoke-virtual {v3, v5}, Landroid/app/job/JobInfo$Builder;->setRequiresDeviceIdle(Z)Landroid/app/job/JobInfo$Builder;

    .line 274
    .line 275
    .line 276
    :cond_7
    new-instance v4, Landroid/os/PersistableBundle;

    .line 277
    .line 278
    invoke-direct {v4}, Landroid/os/PersistableBundle;-><init>()V

    .line 279
    .line 280
    .line 281
    invoke-virtual {v4, v14, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 282
    .line 283
    .line 284
    const-string v5, "backendName"

    .line 285
    .line 286
    invoke-virtual {v4, v5, v15}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 287
    .line 288
    .line 289
    invoke-static {v12}, LD5/a;->a(Lq5/e;)I

    .line 290
    .line 291
    .line 292
    move-result v5

    .line 293
    const-string v14, "priority"

    .line 294
    .line 295
    invoke-virtual {v4, v14, v5}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 296
    .line 297
    .line 298
    if-eqz v9, :cond_8

    .line 299
    .line 300
    const/4 v5, 0x0

    .line 301
    invoke-static {v9, v5}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object v9

    .line 305
    const-string v5, "extras"

    .line 306
    .line 307
    invoke-virtual {v4, v5, v9}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 308
    .line 309
    .line 310
    :cond_8
    invoke-virtual {v3, v4}, Landroid/app/job/JobInfo$Builder;->setExtras(Landroid/os/PersistableBundle;)Landroid/app/job/JobInfo$Builder;

    .line 311
    .line 312
    .line 313
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 314
    .line 315
    .line 316
    move-result-object v4

    .line 317
    invoke-virtual {v8, v12, v6, v7, v2}, Lz5/a;->a(Lq5/e;JI)J

    .line 318
    .line 319
    .line 320
    move-result-wide v5

    .line 321
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 322
    .line 323
    .line 324
    move-result-object v5

    .line 325
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 326
    .line 327
    .line 328
    move-result-object v2

    .line 329
    const/4 v6, 0x5

    .line 330
    new-array v6, v6, [Ljava/lang/Object;

    .line 331
    .line 332
    const/16 v19, 0x0

    .line 333
    .line 334
    aput-object v0, v6, v19

    .line 335
    .line 336
    const/16 v16, 0x1

    .line 337
    .line 338
    aput-object v4, v6, v16

    .line 339
    .line 340
    const/16 v20, 0x2

    .line 341
    .line 342
    aput-object v5, v6, v20

    .line 343
    .line 344
    aput-object p3, v6, v18

    .line 345
    .line 346
    aput-object v2, v6, v17

    .line 347
    .line 348
    invoke-static {v13}, Lic/d;->B(Ljava/lang/String;)Ljava/lang/String;

    .line 349
    .line 350
    .line 351
    move-result-object v0

    .line 352
    move/from16 v2, v18

    .line 353
    .line 354
    invoke-static {v0, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 355
    .line 356
    .line 357
    move-result v2

    .line 358
    if-eqz v2, :cond_9

    .line 359
    .line 360
    const-string v2, "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d"

    .line 361
    .line 362
    invoke-static {v2, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 363
    .line 364
    .line 365
    move-result-object v2

    .line 366
    invoke-static {v0, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 367
    .line 368
    .line 369
    :cond_9
    invoke-virtual {v3}, Landroid/app/job/JobInfo$Builder;->build()Landroid/app/job/JobInfo;

    .line 370
    .line 371
    .line 372
    move-result-object v0

    .line 373
    invoke-virtual {v10, v0}, Landroid/app/job/JobScheduler;->schedule(Landroid/app/job/JobInfo;)I

    .line 374
    .line 375
    .line 376
    return-void

    .line 377
    :catchall_0
    move-exception v0

    .line 378
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    .line 379
    .line 380
    .line 381
    throw v0
.end method
