.class public final synthetic LA5/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LA5/k;
.implements Lcom/google/android/gms/tasks/OnSuccessListener;
.implements LO9/a;
.implements Lcom/google/android/gms/tasks/Continuation;
.implements Lcom/google/android/gms/tasks/SuccessContinuation;
.implements Lcom/applovin/impl/t4$b;
.implements Lcom/applovin/impl/s2$a;
.implements Lcom/google/android/ump/ConsentInformation$OnConsentInfoUpdateSuccessListener;
.implements Lcom/google/android/ump/UserMessagingPlatform$OnConsentFormLoadFailureListener;
.implements LQ1/c;
.implements Lw9/m;
.implements Lw9/o;
.implements Lcom/google/android/gms/tasks/OnCompleteListener;
.implements Lcom/google/android/gms/tasks/OnFailureListener;
.implements LB5/b;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, LA5/g;->a:I

    iput-object p1, p0, LA5/g;->b:Ljava/lang/Object;

    iput-object p2, p0, LA5/g;->d:Ljava/lang/Object;

    iput-object p3, p0, LA5/g;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ly5/a;Lt5/i;Lt5/h;)V
    .locals 1

    .line 2
    const/16 v0, 0x19

    iput v0, p0, LA5/g;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LA5/g;->b:Ljava/lang/Object;

    iput-object p2, p0, LA5/g;->c:Ljava/lang/Object;

    iput-object p3, p0, LA5/g;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(Lcom/applovin/impl/j2;Lcom/applovin/impl/r2;)V
    .locals 3

    .line 1
    iget v0, p0, LA5/g;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, LA5/g;->b:Ljava/lang/Object;

    check-cast v0, Lcom/applovin/impl/q;

    iget-object v1, p0, LA5/g;->d:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    iget-object v2, p0, LA5/g;->c:Ljava/lang/Object;

    check-cast v2, Lcom/applovin/impl/sdk/k;

    invoke-static {v0, v1, v2, p1, p2}, Lcom/applovin/impl/q;->c(Lcom/applovin/impl/q;Ljava/util/List;Lcom/applovin/impl/sdk/k;Lcom/applovin/impl/j2;Lcom/applovin/impl/r2;)V

    return-void

    :pswitch_0
    iget-object v0, p0, LA5/g;->b:Ljava/lang/Object;

    check-cast v0, Lcom/applovin/impl/p;

    iget-object v1, p0, LA5/g;->d:Ljava/lang/Object;

    check-cast v1, Lcom/applovin/impl/sdk/k;

    iget-object v2, p0, LA5/g;->c:Ljava/lang/Object;

    check-cast v2, Lcom/applovin/impl/n;

    invoke-static {v0, v1, v2, p1, p2}, Lcom/applovin/impl/p;->d(Lcom/applovin/impl/p;Lcom/applovin/impl/sdk/k;Lcom/applovin/impl/n;Lcom/applovin/impl/j2;Lcom/applovin/impl/r2;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0xc
        :pswitch_0
    .end packed-switch
.end method

.method public a(ZLjava/lang/Object;Ljava/lang/Object;)V
    .locals 6

    .line 2
    move-object v4, p2

    check-cast v4, Ljava/lang/String;

    move-object v5, p3

    check-cast v5, Ljava/lang/String;

    iget-object p2, p0, LA5/g;->b:Ljava/lang/Object;

    move-object v0, p2

    check-cast v0, Lcom/applovin/impl/m8;

    iget-object p2, p0, LA5/g;->d:Ljava/lang/Object;

    move-object v1, p2

    check-cast v1, Lcom/applovin/sdk/AppLovinPostbackListener;

    iget-object p2, p0, LA5/g;->c:Ljava/lang/Object;

    move-object v2, p2

    check-cast v2, Ljava/lang/String;

    move v3, p1

    invoke-static/range {v0 .. v5}, Lcom/applovin/impl/m8;->a(Lcom/applovin/impl/m8;Lcom/applovin/sdk/AppLovinPostbackListener;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public accept(Ljava/lang/Object;)V
    .locals 3

    .line 1
    check-cast p1, Lk2/M;

    .line 2
    .line 3
    iget-object v0, p0, LA5/g;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, LZ1/d;

    .line 6
    .line 7
    iget v0, v0, LZ1/d;->a:I

    .line 8
    .line 9
    iget-object v1, p0, LA5/g;->c:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, Lh2/g;

    .line 12
    .line 13
    iget-object v2, p0, LA5/g;->d:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v2, Lk2/H;

    .line 16
    .line 17
    invoke-interface {p1, v0, v2, v1}, Lk2/M;->B(ILk2/H;Lh2/g;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const-string v2, "bytes"

    .line 4
    .line 5
    const-string v3, "PRAGMA page_size"

    .line 6
    .line 7
    const-string v4, "PRAGMA page_count"

    .line 8
    .line 9
    const/4 v6, 0x5

    .line 10
    const/4 v7, 0x4

    .line 11
    const/4 v8, 0x3

    .line 12
    sget-object v9, Lw5/c;->d:Lw5/c;

    .line 13
    .line 14
    const/4 v10, 0x0

    .line 15
    const/4 v11, 0x2

    .line 16
    iget-object v12, v1, LA5/g;->d:Ljava/lang/Object;

    .line 17
    .line 18
    iget-object v13, v1, LA5/g;->c:Ljava/lang/Object;

    .line 19
    .line 20
    iget-object v14, v1, LA5/g;->b:Ljava/lang/Object;

    .line 21
    .line 22
    const/4 v15, 0x1

    .line 23
    const/16 v16, 0x0

    .line 24
    .line 25
    iget v0, v1, LA5/g;->a:I

    .line 26
    .line 27
    packed-switch v0, :pswitch_data_0

    .line 28
    .line 29
    .line 30
    move-object/from16 v0, p1

    .line 31
    .line 32
    check-cast v0, Lp9/B;

    .line 33
    .line 34
    check-cast v14, Lcom/google/firebase/firestore/FirebaseFirestore;

    .line 35
    .line 36
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    new-instance v2, LK3/e;

    .line 40
    .line 41
    check-cast v13, LVc/e;

    .line 42
    .line 43
    invoke-direct {v2, v14, v13, v0, v11}, LK3/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 44
    .line 45
    .line 46
    check-cast v12, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 47
    .line 48
    invoke-static {v12, v2}, Lcom/google/android/gms/tasks/Tasks;->call(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Lcom/google/android/gms/tasks/Task;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    return-object v0

    .line 53
    :pswitch_0
    move-object/from16 v0, p1

    .line 54
    .line 55
    check-cast v0, Landroid/database/Cursor;

    .line 56
    .line 57
    check-cast v14, LA5/m;

    .line 58
    .line 59
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    :goto_0
    invoke-interface {v0}, Landroid/database/Cursor;->moveToNext()Z

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    move-object v5, v12

    .line 67
    check-cast v5, Ljava/util/HashMap;

    .line 68
    .line 69
    if-eqz v2, :cond_8

    .line 70
    .line 71
    invoke-interface {v0, v10}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    invoke-interface {v0, v15}, Landroid/database/Cursor;->getInt(I)I

    .line 76
    .line 77
    .line 78
    move-result v10

    .line 79
    sget-object v16, Lw5/c;->b:Lw5/c;

    .line 80
    .line 81
    if-nez v10, :cond_0

    .line 82
    .line 83
    :goto_1
    move-object v10, v9

    .line 84
    move-object/from16 v6, v16

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_0
    if-ne v10, v15, :cond_1

    .line 88
    .line 89
    sget-object v16, Lw5/c;->c:Lw5/c;

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_1
    if-ne v10, v11, :cond_2

    .line 93
    .line 94
    move-object v6, v9

    .line 95
    move-object v10, v6

    .line 96
    goto :goto_2

    .line 97
    :cond_2
    if-ne v10, v8, :cond_3

    .line 98
    .line 99
    sget-object v16, Lw5/c;->e:Lw5/c;

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_3
    if-ne v10, v7, :cond_4

    .line 103
    .line 104
    sget-object v16, Lw5/c;->f:Lw5/c;

    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_4
    if-ne v10, v6, :cond_5

    .line 108
    .line 109
    sget-object v16, Lw5/c;->g:Lw5/c;

    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_5
    const/4 v6, 0x6

    .line 113
    if-ne v10, v6, :cond_6

    .line 114
    .line 115
    sget-object v16, Lw5/c;->h:Lw5/c;

    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_6
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 119
    .line 120
    .line 121
    move-result-object v6

    .line 122
    const-string v10, "SQLiteEventStore"

    .line 123
    .line 124
    const-string v7, "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN"

    .line 125
    .line 126
    invoke-static {v10, v7, v6}, Lic/d;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    goto :goto_1

    .line 130
    :goto_2
    invoke-interface {v0, v11}, Landroid/database/Cursor;->getLong(I)J

    .line 131
    .line 132
    .line 133
    move-result-wide v8

    .line 134
    invoke-virtual {v5, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result v16

    .line 138
    if-nez v16, :cond_7

    .line 139
    .line 140
    new-instance v7, Ljava/util/ArrayList;

    .line 141
    .line 142
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v5, v2, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    :cond_7
    invoke-virtual {v5, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v2

    .line 152
    check-cast v2, Ljava/util/List;

    .line 153
    .line 154
    new-instance v5, Lw5/d;

    .line 155
    .line 156
    invoke-direct {v5, v8, v9, v6}, Lw5/d;-><init>(JLw5/c;)V

    .line 157
    .line 158
    .line 159
    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-object v9, v10

    .line 163
    const/4 v6, 0x5

    .line 164
    const/4 v7, 0x4

    .line 165
    const/4 v8, 0x3

    .line 166
    const/4 v10, 0x0

    .line 167
    goto :goto_0

    .line 168
    :cond_8
    invoke-virtual {v5}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 177
    .line 178
    .line 179
    move-result v2

    .line 180
    move-object v5, v13

    .line 181
    check-cast v5, LS3/n;

    .line 182
    .line 183
    if-eqz v2, :cond_9

    .line 184
    .line 185
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v2

    .line 189
    check-cast v2, Ljava/util/Map$Entry;

    .line 190
    .line 191
    sget v6, Lw5/e;->c:I

    .line 192
    .line 193
    new-instance v6, Ljava/util/ArrayList;

    .line 194
    .line 195
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 196
    .line 197
    .line 198
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v6

    .line 202
    check-cast v6, Ljava/lang/String;

    .line 203
    .line 204
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v2

    .line 208
    check-cast v2, Ljava/util/List;

    .line 209
    .line 210
    new-instance v7, Lw5/e;

    .line 211
    .line 212
    invoke-static {v2}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 213
    .line 214
    .line 215
    move-result-object v2

    .line 216
    invoke-direct {v7, v6, v2}, Lw5/e;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 217
    .line 218
    .line 219
    iget-object v2, v5, LS3/n;->b:Ljava/lang/Object;

    .line 220
    .line 221
    check-cast v2, Ljava/util/ArrayList;

    .line 222
    .line 223
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 224
    .line 225
    .line 226
    goto :goto_3

    .line 227
    :cond_9
    iget-object v0, v14, LA5/m;->b:LC5/a;

    .line 228
    .line 229
    invoke-interface {v0}, LC5/a;->c()J

    .line 230
    .line 231
    .line 232
    move-result-wide v6

    .line 233
    invoke-virtual {v14}, LA5/m;->a()Landroid/database/sqlite/SQLiteDatabase;

    .line 234
    .line 235
    .line 236
    move-result-object v2

    .line 237
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 238
    .line 239
    .line 240
    const/4 v0, 0x0

    .line 241
    :try_start_0
    new-array v8, v0, [Ljava/lang/String;

    .line 242
    .line 243
    const-string v9, "SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1"

    .line 244
    .line 245
    invoke-virtual {v2, v9, v8}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    .line 246
    .line 247
    .line 248
    move-result-object v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 249
    :try_start_1
    invoke-interface {v8}, Landroid/database/Cursor;->moveToNext()Z

    .line 250
    .line 251
    .line 252
    invoke-interface {v8, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 253
    .line 254
    .line 255
    move-result-wide v9

    .line 256
    new-instance v0, Lw5/g;

    .line 257
    .line 258
    invoke-direct {v0, v9, v10, v6, v7}, Lw5/g;-><init>(JJ)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 259
    .line 260
    .line 261
    :try_start_2
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 262
    .line 263
    .line 264
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 265
    .line 266
    .line 267
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 268
    .line 269
    .line 270
    iput-object v0, v5, LS3/n;->a:Ljava/lang/Object;

    .line 271
    .line 272
    invoke-virtual {v14}, LA5/m;->a()Landroid/database/sqlite/SQLiteDatabase;

    .line 273
    .line 274
    .line 275
    move-result-object v0

    .line 276
    invoke-virtual {v0, v4}, Landroid/database/sqlite/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;

    .line 277
    .line 278
    .line 279
    move-result-object v0

    .line 280
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteStatement;->simpleQueryForLong()J

    .line 281
    .line 282
    .line 283
    move-result-wide v6

    .line 284
    invoke-virtual {v14}, LA5/m;->a()Landroid/database/sqlite/SQLiteDatabase;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    invoke-virtual {v0, v3}, Landroid/database/sqlite/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;

    .line 289
    .line 290
    .line 291
    move-result-object v0

    .line 292
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteStatement;->simpleQueryForLong()J

    .line 293
    .line 294
    .line 295
    move-result-wide v2

    .line 296
    mul-long/2addr v2, v6

    .line 297
    sget-object v0, LA5/a;->f:LA5/a;

    .line 298
    .line 299
    new-instance v4, Lw5/f;

    .line 300
    .line 301
    iget-wide v6, v0, LA5/a;->a:J

    .line 302
    .line 303
    invoke-direct {v4, v2, v3, v6, v7}, Lw5/f;-><init>(JJ)V

    .line 304
    .line 305
    .line 306
    new-instance v0, Lw5/b;

    .line 307
    .line 308
    invoke-direct {v0, v4}, Lw5/b;-><init>(Lw5/f;)V

    .line 309
    .line 310
    .line 311
    iput-object v0, v5, LS3/n;->c:Ljava/lang/Object;

    .line 312
    .line 313
    iget-object v0, v14, LA5/m;->e:Ldf/a;

    .line 314
    .line 315
    invoke-interface {v0}, Ldf/a;->get()Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    move-result-object v0

    .line 319
    check-cast v0, Ljava/lang/String;

    .line 320
    .line 321
    iput-object v0, v5, LS3/n;->d:Ljava/lang/Object;

    .line 322
    .line 323
    new-instance v0, Lw5/a;

    .line 324
    .line 325
    iget-object v2, v5, LS3/n;->a:Ljava/lang/Object;

    .line 326
    .line 327
    check-cast v2, Lw5/g;

    .line 328
    .line 329
    iget-object v3, v5, LS3/n;->b:Ljava/lang/Object;

    .line 330
    .line 331
    check-cast v3, Ljava/util/ArrayList;

    .line 332
    .line 333
    invoke-static {v3}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 334
    .line 335
    .line 336
    move-result-object v3

    .line 337
    iget-object v4, v5, LS3/n;->c:Ljava/lang/Object;

    .line 338
    .line 339
    check-cast v4, Lw5/b;

    .line 340
    .line 341
    iget-object v5, v5, LS3/n;->d:Ljava/lang/Object;

    .line 342
    .line 343
    check-cast v5, Ljava/lang/String;

    .line 344
    .line 345
    invoke-direct {v0, v2, v3, v4, v5}, Lw5/a;-><init>(Lw5/g;Ljava/util/List;Lw5/b;Ljava/lang/String;)V

    .line 346
    .line 347
    .line 348
    return-object v0

    .line 349
    :catchall_0
    move-exception v0

    .line 350
    goto :goto_4

    .line 351
    :catchall_1
    move-exception v0

    .line 352
    :try_start_3
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 353
    .line 354
    .line 355
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 356
    :goto_4
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 357
    .line 358
    .line 359
    throw v0

    .line 360
    :pswitch_1
    move-object/from16 v0, p1

    .line 361
    .line 362
    check-cast v0, Landroid/database/Cursor;

    .line 363
    .line 364
    check-cast v14, LA5/m;

    .line 365
    .line 366
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 367
    .line 368
    .line 369
    :goto_5
    invoke-interface {v0}, Landroid/database/Cursor;->moveToNext()Z

    .line 370
    .line 371
    .line 372
    move-result v3

    .line 373
    if-eqz v3, :cond_16

    .line 374
    .line 375
    const/4 v3, 0x0

    .line 376
    invoke-interface {v0, v3}, Landroid/database/Cursor;->getLong(I)J

    .line 377
    .line 378
    .line 379
    move-result-wide v4

    .line 380
    const/4 v3, 0x7

    .line 381
    invoke-interface {v0, v3}, Landroid/database/Cursor;->getInt(I)I

    .line 382
    .line 383
    .line 384
    move-result v3

    .line 385
    if-eqz v3, :cond_a

    .line 386
    .line 387
    move v3, v15

    .line 388
    goto :goto_6

    .line 389
    :cond_a
    const/4 v3, 0x0

    .line 390
    :goto_6
    new-instance v6, Lcom/bumptech/glide/f;

    .line 391
    .line 392
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 393
    .line 394
    .line 395
    new-instance v7, Ljava/util/HashMap;

    .line 396
    .line 397
    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 398
    .line 399
    .line 400
    iput-object v7, v6, Lcom/bumptech/glide/f;->f:Ljava/lang/Object;

    .line 401
    .line 402
    invoke-interface {v0, v15}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 403
    .line 404
    .line 405
    move-result-object v7

    .line 406
    if-eqz v7, :cond_15

    .line 407
    .line 408
    iput-object v7, v6, Lcom/bumptech/glide/f;->a:Ljava/lang/Object;

    .line 409
    .line 410
    invoke-interface {v0, v11}, Landroid/database/Cursor;->getLong(I)J

    .line 411
    .line 412
    .line 413
    move-result-wide v7

    .line 414
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 415
    .line 416
    .line 417
    move-result-object v7

    .line 418
    iput-object v7, v6, Lcom/bumptech/glide/f;->d:Ljava/lang/Object;

    .line 419
    .line 420
    const/4 v7, 0x3

    .line 421
    invoke-interface {v0, v7}, Landroid/database/Cursor;->getLong(I)J

    .line 422
    .line 423
    .line 424
    move-result-wide v8

    .line 425
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 426
    .line 427
    .line 428
    move-result-object v8

    .line 429
    iput-object v8, v6, Lcom/bumptech/glide/f;->e:Ljava/lang/Object;

    .line 430
    .line 431
    if-eqz v3, :cond_c

    .line 432
    .line 433
    new-instance v3, Lt5/l;

    .line 434
    .line 435
    const/4 v8, 0x4

    .line 436
    invoke-interface {v0, v8}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 437
    .line 438
    .line 439
    move-result-object v9

    .line 440
    if-nez v9, :cond_b

    .line 441
    .line 442
    sget-object v8, LA5/m;->f:Lq5/c;

    .line 443
    .line 444
    :goto_7
    const/4 v9, 0x5

    .line 445
    goto :goto_8

    .line 446
    :cond_b
    new-instance v8, Lq5/c;

    .line 447
    .line 448
    invoke-direct {v8, v9}, Lq5/c;-><init>(Ljava/lang/String;)V

    .line 449
    .line 450
    .line 451
    goto :goto_7

    .line 452
    :goto_8
    invoke-interface {v0, v9}, Landroid/database/Cursor;->getBlob(I)[B

    .line 453
    .line 454
    .line 455
    move-result-object v10

    .line 456
    invoke-direct {v3, v8, v10}, Lt5/l;-><init>(Lq5/c;[B)V

    .line 457
    .line 458
    .line 459
    iput-object v3, v6, Lcom/bumptech/glide/f;->c:Ljava/lang/Object;

    .line 460
    .line 461
    move/from16 v18, v15

    .line 462
    .line 463
    :goto_9
    const/4 v1, 0x6

    .line 464
    goto/16 :goto_d

    .line 465
    .line 466
    :cond_c
    const/4 v9, 0x5

    .line 467
    new-instance v3, Lt5/l;

    .line 468
    .line 469
    const/4 v8, 0x4

    .line 470
    invoke-interface {v0, v8}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 471
    .line 472
    .line 473
    move-result-object v10

    .line 474
    if-nez v10, :cond_d

    .line 475
    .line 476
    sget-object v10, LA5/m;->f:Lq5/c;

    .line 477
    .line 478
    goto :goto_a

    .line 479
    :cond_d
    new-instance v7, Lq5/c;

    .line 480
    .line 481
    invoke-direct {v7, v10}, Lq5/c;-><init>(Ljava/lang/String;)V

    .line 482
    .line 483
    .line 484
    move-object v10, v7

    .line 485
    :goto_a
    invoke-virtual {v14}, LA5/m;->a()Landroid/database/sqlite/SQLiteDatabase;

    .line 486
    .line 487
    .line 488
    move-result-object v17

    .line 489
    filled-new-array {v2}, [Ljava/lang/String;

    .line 490
    .line 491
    .line 492
    move-result-object v19

    .line 493
    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 494
    .line 495
    .line 496
    move-result-object v7

    .line 497
    filled-new-array {v7}, [Ljava/lang/String;

    .line 498
    .line 499
    .line 500
    move-result-object v21

    .line 501
    const/16 v23, 0x0

    .line 502
    .line 503
    const-string v24, "sequence_num"

    .line 504
    .line 505
    const-string v18, "event_payloads"

    .line 506
    .line 507
    const-string v20, "event_id = ?"

    .line 508
    .line 509
    const/16 v22, 0x0

    .line 510
    .line 511
    invoke-virtual/range {v17 .. v24}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 512
    .line 513
    .line 514
    move-result-object v7

    .line 515
    :try_start_4
    new-instance v8, Ljava/util/ArrayList;

    .line 516
    .line 517
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 518
    .line 519
    .line 520
    const/4 v9, 0x0

    .line 521
    :goto_b
    invoke-interface {v7}, Landroid/database/Cursor;->moveToNext()Z

    .line 522
    .line 523
    .line 524
    move-result v17

    .line 525
    if-eqz v17, :cond_e

    .line 526
    .line 527
    move/from16 v18, v15

    .line 528
    .line 529
    const/4 v11, 0x0

    .line 530
    invoke-interface {v7, v11}, Landroid/database/Cursor;->getBlob(I)[B

    .line 531
    .line 532
    .line 533
    move-result-object v15

    .line 534
    invoke-virtual {v8, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 535
    .line 536
    .line 537
    array-length v11, v15

    .line 538
    add-int/2addr v9, v11

    .line 539
    move/from16 v15, v18

    .line 540
    .line 541
    const/4 v11, 0x2

    .line 542
    goto :goto_b

    .line 543
    :cond_e
    move/from16 v18, v15

    .line 544
    .line 545
    new-array v9, v9, [B

    .line 546
    .line 547
    const/4 v11, 0x0

    .line 548
    const/4 v15, 0x0

    .line 549
    :goto_c
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 550
    .line 551
    .line 552
    move-result v1

    .line 553
    if-ge v11, v1, :cond_f

    .line 554
    .line 555
    invoke-virtual {v8, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 556
    .line 557
    .line 558
    move-result-object v1

    .line 559
    check-cast v1, [B
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 560
    .line 561
    move-object/from16 p1, v7

    .line 562
    .line 563
    :try_start_5
    array-length v7, v1

    .line 564
    move-object/from16 v19, v8

    .line 565
    .line 566
    const/4 v8, 0x0

    .line 567
    invoke-static {v1, v8, v9, v15, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 568
    .line 569
    .line 570
    array-length v1, v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 571
    add-int/2addr v15, v1

    .line 572
    add-int/lit8 v11, v11, 0x1

    .line 573
    .line 574
    move-object/from16 v7, p1

    .line 575
    .line 576
    move-object/from16 v8, v19

    .line 577
    .line 578
    goto :goto_c

    .line 579
    :catchall_2
    move-exception v0

    .line 580
    goto/16 :goto_e

    .line 581
    .line 582
    :cond_f
    move-object/from16 p1, v7

    .line 583
    .line 584
    invoke-interface/range {p1 .. p1}, Landroid/database/Cursor;->close()V

    .line 585
    .line 586
    .line 587
    invoke-direct {v3, v10, v9}, Lt5/l;-><init>(Lq5/c;[B)V

    .line 588
    .line 589
    .line 590
    iput-object v3, v6, Lcom/bumptech/glide/f;->c:Ljava/lang/Object;

    .line 591
    .line 592
    goto/16 :goto_9

    .line 593
    .line 594
    :goto_d
    invoke-interface {v0, v1}, Landroid/database/Cursor;->isNull(I)Z

    .line 595
    .line 596
    .line 597
    move-result v3

    .line 598
    if-nez v3, :cond_10

    .line 599
    .line 600
    invoke-interface {v0, v1}, Landroid/database/Cursor;->getInt(I)I

    .line 601
    .line 602
    .line 603
    move-result v3

    .line 604
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 605
    .line 606
    .line 607
    move-result-object v3

    .line 608
    iput-object v3, v6, Lcom/bumptech/glide/f;->b:Ljava/lang/Object;

    .line 609
    .line 610
    :cond_10
    const/16 v3, 0x8

    .line 611
    .line 612
    invoke-interface {v0, v3}, Landroid/database/Cursor;->isNull(I)Z

    .line 613
    .line 614
    .line 615
    move-result v7

    .line 616
    if-nez v7, :cond_11

    .line 617
    .line 618
    invoke-interface {v0, v3}, Landroid/database/Cursor;->getInt(I)I

    .line 619
    .line 620
    .line 621
    move-result v3

    .line 622
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 623
    .line 624
    .line 625
    move-result-object v3

    .line 626
    iput-object v3, v6, Lcom/bumptech/glide/f;->g:Ljava/lang/Object;

    .line 627
    .line 628
    :cond_11
    const/16 v3, 0x9

    .line 629
    .line 630
    invoke-interface {v0, v3}, Landroid/database/Cursor;->isNull(I)Z

    .line 631
    .line 632
    .line 633
    move-result v7

    .line 634
    if-nez v7, :cond_12

    .line 635
    .line 636
    invoke-interface {v0, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 637
    .line 638
    .line 639
    move-result-object v3

    .line 640
    iput-object v3, v6, Lcom/bumptech/glide/f;->h:Ljava/lang/Object;

    .line 641
    .line 642
    :cond_12
    const/16 v3, 0xa

    .line 643
    .line 644
    invoke-interface {v0, v3}, Landroid/database/Cursor;->isNull(I)Z

    .line 645
    .line 646
    .line 647
    move-result v7

    .line 648
    if-nez v7, :cond_13

    .line 649
    .line 650
    invoke-interface {v0, v3}, Landroid/database/Cursor;->getBlob(I)[B

    .line 651
    .line 652
    .line 653
    move-result-object v3

    .line 654
    iput-object v3, v6, Lcom/bumptech/glide/f;->i:Ljava/lang/Object;

    .line 655
    .line 656
    :cond_13
    const/16 v3, 0xb

    .line 657
    .line 658
    invoke-interface {v0, v3}, Landroid/database/Cursor;->isNull(I)Z

    .line 659
    .line 660
    .line 661
    move-result v7

    .line 662
    if-nez v7, :cond_14

    .line 663
    .line 664
    invoke-interface {v0, v3}, Landroid/database/Cursor;->getBlob(I)[B

    .line 665
    .line 666
    .line 667
    move-result-object v3

    .line 668
    iput-object v3, v6, Lcom/bumptech/glide/f;->j:Ljava/lang/Object;

    .line 669
    .line 670
    :cond_14
    invoke-virtual {v6}, Lcom/bumptech/glide/f;->f()Lt5/h;

    .line 671
    .line 672
    .line 673
    move-result-object v3

    .line 674
    new-instance v6, LA5/b;

    .line 675
    .line 676
    move-object v7, v13

    .line 677
    check-cast v7, Lt5/i;

    .line 678
    .line 679
    invoke-direct {v6, v4, v5, v7, v3}, LA5/b;-><init>(JLt5/i;Lt5/h;)V

    .line 680
    .line 681
    .line 682
    move-object v3, v12

    .line 683
    check-cast v3, Ljava/util/ArrayList;

    .line 684
    .line 685
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 686
    .line 687
    .line 688
    move-object/from16 v1, p0

    .line 689
    .line 690
    move/from16 v15, v18

    .line 691
    .line 692
    const/4 v11, 0x2

    .line 693
    goto/16 :goto_5

    .line 694
    .line 695
    :catchall_3
    move-exception v0

    .line 696
    move-object/from16 p1, v7

    .line 697
    .line 698
    :goto_e
    invoke-interface/range {p1 .. p1}, Landroid/database/Cursor;->close()V

    .line 699
    .line 700
    .line 701
    throw v0

    .line 702
    :cond_15
    new-instance v0, Ljava/lang/NullPointerException;

    .line 703
    .line 704
    const-string v1, "Null transportName"

    .line 705
    .line 706
    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 707
    .line 708
    .line 709
    throw v0

    .line 710
    :cond_16
    return-object v16

    .line 711
    :pswitch_2
    move-object v10, v9

    .line 712
    move/from16 v18, v15

    .line 713
    .line 714
    move-object/from16 v0, p1

    .line 715
    .line 716
    check-cast v0, Landroid/database/sqlite/SQLiteDatabase;

    .line 717
    .line 718
    check-cast v14, LA5/m;

    .line 719
    .line 720
    invoke-virtual {v14}, LA5/m;->a()Landroid/database/sqlite/SQLiteDatabase;

    .line 721
    .line 722
    .line 723
    move-result-object v1

    .line 724
    invoke-virtual {v1, v4}, Landroid/database/sqlite/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;

    .line 725
    .line 726
    .line 727
    move-result-object v1

    .line 728
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteStatement;->simpleQueryForLong()J

    .line 729
    .line 730
    .line 731
    move-result-wide v4

    .line 732
    invoke-virtual {v14}, LA5/m;->a()Landroid/database/sqlite/SQLiteDatabase;

    .line 733
    .line 734
    .line 735
    move-result-object v1

    .line 736
    invoke-virtual {v1, v3}, Landroid/database/sqlite/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;

    .line 737
    .line 738
    .line 739
    move-result-object v1

    .line 740
    invoke-virtual {v1}, Landroid/database/sqlite/SQLiteStatement;->simpleQueryForLong()J

    .line 741
    .line 742
    .line 743
    move-result-wide v6

    .line 744
    mul-long/2addr v6, v4

    .line 745
    iget-object v1, v14, LA5/m;->d:LA5/a;

    .line 746
    .line 747
    iget-wide v3, v1, LA5/a;->a:J

    .line 748
    .line 749
    cmp-long v3, v6, v3

    .line 750
    .line 751
    check-cast v12, Lt5/h;

    .line 752
    .line 753
    iget-object v4, v12, Lt5/h;->a:Ljava/lang/String;

    .line 754
    .line 755
    if-ltz v3, :cond_17

    .line 756
    .line 757
    const-wide/16 v0, 0x1

    .line 758
    .line 759
    invoke-virtual {v14, v0, v1, v10, v4}, LA5/m;->i(JLw5/c;Ljava/lang/String;)V

    .line 760
    .line 761
    .line 762
    const-wide/16 v0, -0x1

    .line 763
    .line 764
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 765
    .line 766
    .line 767
    move-result-object v0

    .line 768
    goto/16 :goto_14

    .line 769
    .line 770
    :cond_17
    check-cast v13, Lt5/i;

    .line 771
    .line 772
    invoke-static {v0, v13}, LA5/m;->b(Landroid/database/sqlite/SQLiteDatabase;Lt5/i;)Ljava/lang/Long;

    .line 773
    .line 774
    .line 775
    move-result-object v3

    .line 776
    if-eqz v3, :cond_18

    .line 777
    .line 778
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 779
    .line 780
    .line 781
    move-result-wide v5

    .line 782
    goto :goto_f

    .line 783
    :cond_18
    new-instance v3, Landroid/content/ContentValues;

    .line 784
    .line 785
    invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V

    .line 786
    .line 787
    .line 788
    const-string v5, "backend_name"

    .line 789
    .line 790
    iget-object v6, v13, Lt5/i;->a:Ljava/lang/String;

    .line 791
    .line 792
    invoke-virtual {v3, v5, v6}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 793
    .line 794
    .line 795
    iget-object v5, v13, Lt5/i;->c:Lq5/e;

    .line 796
    .line 797
    invoke-static {v5}, LD5/a;->a(Lq5/e;)I

    .line 798
    .line 799
    .line 800
    move-result v5

    .line 801
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 802
    .line 803
    .line 804
    move-result-object v5

    .line 805
    const-string v6, "priority"

    .line 806
    .line 807
    invoke-virtual {v3, v6, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 808
    .line 809
    .line 810
    const/4 v8, 0x0

    .line 811
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 812
    .line 813
    .line 814
    move-result-object v5

    .line 815
    const-string v6, "next_request_ms"

    .line 816
    .line 817
    invoke-virtual {v3, v6, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 818
    .line 819
    .line 820
    iget-object v5, v13, Lt5/i;->b:[B

    .line 821
    .line 822
    if-eqz v5, :cond_19

    .line 823
    .line 824
    invoke-static {v5, v8}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    .line 825
    .line 826
    .line 827
    move-result-object v5

    .line 828
    const-string v6, "extras"

    .line 829
    .line 830
    invoke-virtual {v3, v6, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 831
    .line 832
    .line 833
    :cond_19
    const-string v5, "transport_contexts"

    .line 834
    .line 835
    move-object/from16 v6, v16

    .line 836
    .line 837
    invoke-virtual {v0, v5, v6, v3}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    .line 838
    .line 839
    .line 840
    move-result-wide v7

    .line 841
    move-wide v5, v7

    .line 842
    :goto_f
    iget-object v3, v12, Lt5/h;->c:Lt5/l;

    .line 843
    .line 844
    iget-object v7, v3, Lt5/l;->b:[B

    .line 845
    .line 846
    array-length v8, v7

    .line 847
    iget v1, v1, LA5/a;->e:I

    .line 848
    .line 849
    if-gt v8, v1, :cond_1a

    .line 850
    .line 851
    move/from16 v8, v18

    .line 852
    .line 853
    goto :goto_10

    .line 854
    :cond_1a
    const/4 v8, 0x0

    .line 855
    :goto_10
    new-instance v9, Landroid/content/ContentValues;

    .line 856
    .line 857
    invoke-direct {v9}, Landroid/content/ContentValues;-><init>()V

    .line 858
    .line 859
    .line 860
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 861
    .line 862
    .line 863
    move-result-object v5

    .line 864
    const-string v6, "context_id"

    .line 865
    .line 866
    invoke-virtual {v9, v6, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 867
    .line 868
    .line 869
    const-string v5, "transport_name"

    .line 870
    .line 871
    invoke-virtual {v9, v5, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 872
    .line 873
    .line 874
    iget-wide v4, v12, Lt5/h;->d:J

    .line 875
    .line 876
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 877
    .line 878
    .line 879
    move-result-object v4

    .line 880
    const-string v5, "timestamp_ms"

    .line 881
    .line 882
    invoke-virtual {v9, v5, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 883
    .line 884
    .line 885
    iget-wide v4, v12, Lt5/h;->e:J

    .line 886
    .line 887
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 888
    .line 889
    .line 890
    move-result-object v4

    .line 891
    const-string v5, "uptime_ms"

    .line 892
    .line 893
    invoke-virtual {v9, v5, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 894
    .line 895
    .line 896
    iget-object v3, v3, Lt5/l;->a:Lq5/c;

    .line 897
    .line 898
    iget-object v3, v3, Lq5/c;->a:Ljava/lang/String;

    .line 899
    .line 900
    const-string v4, "payload_encoding"

    .line 901
    .line 902
    invoke-virtual {v9, v4, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 903
    .line 904
    .line 905
    const-string v3, "code"

    .line 906
    .line 907
    iget-object v4, v12, Lt5/h;->b:Ljava/lang/Integer;

    .line 908
    .line 909
    invoke-virtual {v9, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 910
    .line 911
    .line 912
    const/4 v3, 0x0

    .line 913
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 914
    .line 915
    .line 916
    move-result-object v4

    .line 917
    const-string v5, "num_attempts"

    .line 918
    .line 919
    invoke-virtual {v9, v5, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 920
    .line 921
    .line 922
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 923
    .line 924
    .line 925
    move-result-object v4

    .line 926
    const-string v5, "inline"

    .line 927
    .line 928
    invoke-virtual {v9, v5, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 929
    .line 930
    .line 931
    if-eqz v8, :cond_1b

    .line 932
    .line 933
    move-object v3, v7

    .line 934
    goto :goto_11

    .line 935
    :cond_1b
    new-array v3, v3, [B

    .line 936
    .line 937
    :goto_11
    const-string v4, "payload"

    .line 938
    .line 939
    invoke-virtual {v9, v4, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    .line 940
    .line 941
    .line 942
    const-string v3, "product_id"

    .line 943
    .line 944
    iget-object v4, v12, Lt5/h;->g:Ljava/lang/Integer;

    .line 945
    .line 946
    invoke-virtual {v9, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 947
    .line 948
    .line 949
    const-string v3, "pseudonymous_id"

    .line 950
    .line 951
    iget-object v4, v12, Lt5/h;->h:Ljava/lang/String;

    .line 952
    .line 953
    invoke-virtual {v9, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 954
    .line 955
    .line 956
    const-string v3, "experiment_ids_clear_blob"

    .line 957
    .line 958
    iget-object v4, v12, Lt5/h;->i:[B

    .line 959
    .line 960
    invoke-virtual {v9, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    .line 961
    .line 962
    .line 963
    const-string v3, "experiment_ids_encrypted_blob"

    .line 964
    .line 965
    iget-object v4, v12, Lt5/h;->j:[B

    .line 966
    .line 967
    invoke-virtual {v9, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    .line 968
    .line 969
    .line 970
    const-string v3, "events"

    .line 971
    .line 972
    const/4 v6, 0x0

    .line 973
    invoke-virtual {v0, v3, v6, v9}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    .line 974
    .line 975
    .line 976
    move-result-wide v3

    .line 977
    const-string v5, "event_id"

    .line 978
    .line 979
    if-nez v8, :cond_1c

    .line 980
    .line 981
    array-length v6, v7

    .line 982
    int-to-double v8, v6

    .line 983
    int-to-double v10, v1

    .line 984
    div-double/2addr v8, v10

    .line 985
    invoke-static {v8, v9}, Ljava/lang/Math;->ceil(D)D

    .line 986
    .line 987
    .line 988
    move-result-wide v8

    .line 989
    double-to-int v6, v8

    .line 990
    move/from16 v8, v18

    .line 991
    .line 992
    :goto_12
    if-gt v8, v6, :cond_1c

    .line 993
    .line 994
    add-int/lit8 v9, v8, -0x1

    .line 995
    .line 996
    mul-int/2addr v9, v1

    .line 997
    mul-int v10, v8, v1

    .line 998
    .line 999
    array-length v11, v7

    .line 1000
    invoke-static {v10, v11}, Ljava/lang/Math;->min(II)I

    .line 1001
    .line 1002
    .line 1003
    move-result v10

    .line 1004
    invoke-static {v7, v9, v10}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 1005
    .line 1006
    .line 1007
    move-result-object v9

    .line 1008
    new-instance v10, Landroid/content/ContentValues;

    .line 1009
    .line 1010
    invoke-direct {v10}, Landroid/content/ContentValues;-><init>()V

    .line 1011
    .line 1012
    .line 1013
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1014
    .line 1015
    .line 1016
    move-result-object v11

    .line 1017
    invoke-virtual {v10, v5, v11}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 1018
    .line 1019
    .line 1020
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1021
    .line 1022
    .line 1023
    move-result-object v11

    .line 1024
    const-string v13, "sequence_num"

    .line 1025
    .line 1026
    invoke-virtual {v10, v13, v11}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 1027
    .line 1028
    .line 1029
    invoke-virtual {v10, v2, v9}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    .line 1030
    .line 1031
    .line 1032
    const-string v9, "event_payloads"

    .line 1033
    .line 1034
    const/4 v11, 0x0

    .line 1035
    invoke-virtual {v0, v9, v11, v10}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    .line 1036
    .line 1037
    .line 1038
    add-int/lit8 v8, v8, 0x1

    .line 1039
    .line 1040
    goto :goto_12

    .line 1041
    :cond_1c
    iget-object v1, v12, Lt5/h;->f:Ljava/util/HashMap;

    .line 1042
    .line 1043
    invoke-static {v1}, Lj$/util/DesugarCollections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 1044
    .line 1045
    .line 1046
    move-result-object v1

    .line 1047
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 1048
    .line 1049
    .line 1050
    move-result-object v1

    .line 1051
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 1052
    .line 1053
    .line 1054
    move-result-object v1

    .line 1055
    :goto_13
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1056
    .line 1057
    .line 1058
    move-result v2

    .line 1059
    if-eqz v2, :cond_1d

    .line 1060
    .line 1061
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1062
    .line 1063
    .line 1064
    move-result-object v2

    .line 1065
    check-cast v2, Ljava/util/Map$Entry;

    .line 1066
    .line 1067
    new-instance v6, Landroid/content/ContentValues;

    .line 1068
    .line 1069
    invoke-direct {v6}, Landroid/content/ContentValues;-><init>()V

    .line 1070
    .line 1071
    .line 1072
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1073
    .line 1074
    .line 1075
    move-result-object v7

    .line 1076
    invoke-virtual {v6, v5, v7}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 1077
    .line 1078
    .line 1079
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 1080
    .line 1081
    .line 1082
    move-result-object v7

    .line 1083
    check-cast v7, Ljava/lang/String;

    .line 1084
    .line 1085
    const-string v8, "name"

    .line 1086
    .line 1087
    invoke-virtual {v6, v8, v7}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 1088
    .line 1089
    .line 1090
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 1091
    .line 1092
    .line 1093
    move-result-object v2

    .line 1094
    check-cast v2, Ljava/lang/String;

    .line 1095
    .line 1096
    const-string v7, "value"

    .line 1097
    .line 1098
    invoke-virtual {v6, v7, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 1099
    .line 1100
    .line 1101
    const-string v2, "event_metadata"

    .line 1102
    .line 1103
    const/4 v11, 0x0

    .line 1104
    invoke-virtual {v0, v2, v11, v6}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    .line 1105
    .line 1106
    .line 1107
    goto :goto_13

    .line 1108
    :cond_1d
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1109
    .line 1110
    .line 1111
    move-result-object v0

    .line 1112
    :goto_14
    return-object v0

    .line 1113
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public execute()Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, LA5/g;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ly5/a;

    .line 4
    .line 5
    iget-object v1, v0, Ly5/a;->d:LA5/d;

    .line 6
    .line 7
    check-cast v1, LA5/m;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget-object v2, p0, LA5/g;->c:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, Lt5/i;

    .line 15
    .line 16
    iget-object v3, p0, LA5/g;->d:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v3, Lt5/h;

    .line 19
    .line 20
    const-string v4, "SQLiteEventStore"

    .line 21
    .line 22
    invoke-static {v4}, Lic/d;->B(Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    const/4 v5, 0x3

    .line 27
    invoke-static {v4, v5}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    if-eqz v5, :cond_0

    .line 32
    .line 33
    new-instance v5, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    const-string v6, "Storing event with priority="

    .line 36
    .line 37
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    iget-object v6, v2, Lt5/i;->c:Lq5/e;

    .line 41
    .line 42
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string v6, ", name="

    .line 46
    .line 47
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    iget-object v6, v3, Lt5/h;->a:Ljava/lang/String;

    .line 51
    .line 52
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string v6, " for destination "

    .line 56
    .line 57
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    iget-object v6, v2, Lt5/i;->a:Ljava/lang/String;

    .line 61
    .line 62
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    invoke-static {v4, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 70
    .line 71
    .line 72
    :cond_0
    new-instance v4, LA5/g;

    .line 73
    .line 74
    const/4 v5, 0x0

    .line 75
    invoke-direct {v4, v1, v3, v2, v5}, LA5/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v1, v4}, LA5/m;->d(LA5/k;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    check-cast v1, Ljava/lang/Long;

    .line 83
    .line 84
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    iget-object v0, v0, Ly5/a;->a:Lz5/c;

    .line 88
    .line 89
    const/4 v1, 0x0

    .line 90
    const/4 v3, 0x1

    .line 91
    invoke-virtual {v0, v2, v3, v1}, Lz5/c;->a(Lt5/i;IZ)V

    .line 92
    .line 93
    .line 94
    const/4 v0, 0x0

    .line 95
    return-object v0
.end method

.method public f(LO9/b;)V
    .locals 5

    .line 1
    iget-object v0, p0, LA5/g;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LJ9/K;

    .line 4
    .line 5
    iget-object v1, p0, LA5/g;->d:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ljava/lang/String;

    .line 8
    .line 9
    iget-object v2, p0, LA5/g;->c:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Lw8/b;

    .line 12
    .line 13
    iget-object v3, v0, LJ9/K;->b:Lw8/a;

    .line 14
    .line 15
    sget-object v4, LJ9/K;->c:Ljava/lang/Object;

    .line 16
    .line 17
    if-ne v3, v4, :cond_0

    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    invoke-interface {p1}, LO9/b;->get()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    check-cast p1, Lw8/d;

    .line 25
    .line 26
    invoke-interface {p1, v1, v2}, Lw8/d;->h(Ljava/lang/String;Lw8/b;)Lw8/a;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iput-object p1, v0, LJ9/K;->b:Lw8/a;

    .line 31
    .line 32
    monitor-enter v0

    .line 33
    :try_start_0
    iget-object v1, v0, LJ9/K;->a:Ljava/util/HashSet;

    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/util/HashSet;->isEmpty()Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-nez v1, :cond_1

    .line 40
    .line 41
    iget-object v1, v0, LJ9/K;->a:Ljava/util/HashSet;

    .line 42
    .line 43
    invoke-interface {p1, v1}, Lw8/a;->c(Ljava/util/HashSet;)V

    .line 44
    .line 45
    .line 46
    new-instance p1, Ljava/util/HashSet;

    .line 47
    .line 48
    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 49
    .line 50
    .line 51
    iput-object p1, v0, LJ9/K;->a:Ljava/util/HashSet;

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :catchall_0
    move-exception p1

    .line 55
    goto :goto_1

    .line 56
    :cond_1
    :goto_0
    monitor-exit v0

    .line 57
    return-void

    .line 58
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    throw p1
.end method

.method public get()Ljava/lang/Object;
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v3, v0, LA5/g;->c:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v4, v0, LA5/g;->d:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v5, v0, LA5/g;->b:Ljava/lang/Object;

    .line 8
    .line 9
    iget v6, v0, LA5/g;->a:I

    .line 10
    .line 11
    check-cast v5, Lr9/l;

    .line 12
    .line 13
    packed-switch v6, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    sget-object v1, Ls9/h;->c:Lc9/d;

    .line 17
    .line 18
    new-instance v2, Ljava/util/HashMap;

    .line 19
    .line 20
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 21
    .line 22
    .line 23
    check-cast v4, Lc9/c;

    .line 24
    .line 25
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v6

    .line 33
    if-eqz v6, :cond_1

    .line 34
    .line 35
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v6

    .line 39
    check-cast v6, Ljava/util/Map$Entry;

    .line 40
    .line 41
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v7

    .line 45
    check-cast v7, Ls9/h;

    .line 46
    .line 47
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v6

    .line 51
    check-cast v6, Ls9/k;

    .line 52
    .line 53
    invoke-virtual {v6}, Ls9/k;->d()Z

    .line 54
    .line 55
    .line 56
    move-result v8

    .line 57
    if-eqz v8, :cond_0

    .line 58
    .line 59
    invoke-virtual {v1, v7}, Lc9/d;->a(Ljava/lang/Object;)Lc9/d;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    :cond_0
    invoke-virtual {v2, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_1
    check-cast v3, Lr9/S;

    .line 68
    .line 69
    iget v4, v3, Lr9/S;->b:I

    .line 70
    .line 71
    iget-object v6, v5, Lr9/l;->i:Lr9/Q;

    .line 72
    .line 73
    invoke-interface {v6, v4}, Lr9/Q;->j(I)V

    .line 74
    .line 75
    .line 76
    iget v3, v3, Lr9/S;->b:I

    .line 77
    .line 78
    invoke-interface {v6, v1, v3}, Lr9/Q;->c(Lc9/d;I)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v5, v2}, Lr9/l;->d(Ljava/util/Map;)Lba/a;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    iget-object v2, v5, Lr9/l;->f:LVa/Za;

    .line 86
    .line 87
    iget-object v3, v1, Lba/a;->b:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v3, Ljava/util/HashMap;

    .line 90
    .line 91
    iget-object v1, v1, Lba/a;->c:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v1, Ljava/util/HashSet;

    .line 94
    .line 95
    invoke-virtual {v2, v3, v1}, LVa/Za;->h(Ljava/util/Map;Ljava/util/HashSet;)Lc9/c;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    return-object v1

    .line 100
    :pswitch_0
    check-cast v4, LC8/i;

    .line 101
    .line 102
    iget-object v6, v5, Lr9/l;->a:Lp7/b;

    .line 103
    .line 104
    invoke-virtual {v6}, Lp7/b;->D()Lr9/z;

    .line 105
    .line 106
    .line 107
    move-result-object v7

    .line 108
    invoke-interface {v7}, Lr9/z;->d()J

    .line 109
    .line 110
    .line 111
    move-result-wide v7

    .line 112
    iget-object v9, v4, LC8/i;->c:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v9, Ljava/util/Map;

    .line 115
    .line 116
    invoke-interface {v9}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 117
    .line 118
    .line 119
    move-result-object v9

    .line 120
    invoke-interface {v9}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 121
    .line 122
    .line 123
    move-result-object v9

    .line 124
    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 125
    .line 126
    .line 127
    move-result v10

    .line 128
    iget-object v11, v5, Lr9/l;->i:Lr9/Q;

    .line 129
    .line 130
    if-eqz v10, :cond_6

    .line 131
    .line 132
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v10

    .line 136
    check-cast v10, Ljava/util/Map$Entry;

    .line 137
    .line 138
    invoke-interface {v10}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v12

    .line 142
    check-cast v12, Ljava/lang/Integer;

    .line 143
    .line 144
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    .line 145
    .line 146
    .line 147
    move-result v13

    .line 148
    invoke-interface {v10}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v10

    .line 152
    check-cast v10, Lv9/t;

    .line 153
    .line 154
    iget-object v14, v5, Lr9/l;->k:Landroid/util/SparseArray;

    .line 155
    .line 156
    invoke-virtual {v14, v13}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v15

    .line 160
    check-cast v15, Lr9/S;

    .line 161
    .line 162
    if-nez v15, :cond_2

    .line 163
    .line 164
    goto :goto_1

    .line 165
    :cond_2
    const/16 v16, 0x0

    .line 166
    .line 167
    iget-object v1, v10, Lv9/t;->e:Lc9/d;

    .line 168
    .line 169
    invoke-interface {v11, v1, v13}, Lr9/Q;->a(Lc9/d;I)V

    .line 170
    .line 171
    .line 172
    iget-object v1, v10, Lv9/t;->c:Lc9/d;

    .line 173
    .line 174
    invoke-interface {v11, v1, v13}, Lr9/Q;->c(Lc9/d;I)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v15, v7, v8}, Lr9/S;->b(J)Lr9/S;

    .line 178
    .line 179
    .line 180
    move-result-object v1

    .line 181
    const/16 v17, 0x1

    .line 182
    .line 183
    iget-object v2, v4, LC8/i;->d:Ljava/lang/Object;

    .line 184
    .line 185
    check-cast v2, Ljava/util/Map;

    .line 186
    .line 187
    invoke-interface {v2, v12}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    move-result v2

    .line 191
    if-eqz v2, :cond_3

    .line 192
    .line 193
    sget-object v2, Lcom/google/protobuf/ByteString;->EMPTY:Lcom/google/protobuf/ByteString;

    .line 194
    .line 195
    sget-object v12, Ls9/o;->b:Ls9/o;

    .line 196
    .line 197
    invoke-virtual {v1, v2, v12}, Lr9/S;->a(Lcom/google/protobuf/ByteString;Ls9/o;)Lr9/S;

    .line 198
    .line 199
    .line 200
    move-result-object v1

    .line 201
    new-instance v18, Lr9/S;

    .line 202
    .line 203
    iget-object v2, v1, Lr9/S;->d:Lr9/y;

    .line 204
    .line 205
    iget-object v0, v1, Lr9/S;->e:Ls9/o;

    .line 206
    .line 207
    move-object/from16 v24, v0

    .line 208
    .line 209
    iget-object v0, v1, Lr9/S;->a:Lp9/A;

    .line 210
    .line 211
    move-object/from16 v19, v0

    .line 212
    .line 213
    iget v0, v1, Lr9/S;->b:I

    .line 214
    .line 215
    move-object/from16 v23, v2

    .line 216
    .line 217
    move-object/from16 v28, v3

    .line 218
    .line 219
    iget-wide v2, v1, Lr9/S;->c:J

    .line 220
    .line 221
    iget-object v1, v1, Lr9/S;->g:Lcom/google/protobuf/ByteString;

    .line 222
    .line 223
    const/16 v27, 0x0

    .line 224
    .line 225
    move/from16 v20, v0

    .line 226
    .line 227
    move-object/from16 v26, v1

    .line 228
    .line 229
    move-wide/from16 v21, v2

    .line 230
    .line 231
    move-object/from16 v25, v12

    .line 232
    .line 233
    invoke-direct/range {v18 .. v27}, Lr9/S;-><init>(Lp9/A;IJLr9/y;Ls9/o;Ls9/o;Lcom/google/protobuf/ByteString;Ljava/lang/Integer;)V

    .line 234
    .line 235
    .line 236
    move-object/from16 v1, v18

    .line 237
    .line 238
    goto :goto_2

    .line 239
    :cond_3
    move-object/from16 v28, v3

    .line 240
    .line 241
    iget-object v0, v10, Lv9/t;->a:Lcom/google/protobuf/ByteString;

    .line 242
    .line 243
    invoke-virtual {v0}, Lcom/google/protobuf/ByteString;->isEmpty()Z

    .line 244
    .line 245
    .line 246
    move-result v2

    .line 247
    if-nez v2, :cond_4

    .line 248
    .line 249
    iget-object v2, v4, LC8/i;->b:Ljava/lang/Object;

    .line 250
    .line 251
    check-cast v2, Ls9/o;

    .line 252
    .line 253
    invoke-virtual {v1, v0, v2}, Lr9/S;->a(Lcom/google/protobuf/ByteString;Ls9/o;)Lr9/S;

    .line 254
    .line 255
    .line 256
    move-result-object v1

    .line 257
    :cond_4
    :goto_2
    invoke-virtual {v14, v13, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 258
    .line 259
    .line 260
    invoke-static {v15, v1, v10}, Lr9/l;->e(Lr9/S;Lr9/S;Lv9/t;)Z

    .line 261
    .line 262
    .line 263
    move-result v0

    .line 264
    if-eqz v0, :cond_5

    .line 265
    .line 266
    invoke-interface {v11, v1}, Lr9/Q;->b(Lr9/S;)V

    .line 267
    .line 268
    .line 269
    :cond_5
    move-object/from16 v0, p0

    .line 270
    .line 271
    move-object/from16 v3, v28

    .line 272
    .line 273
    goto/16 :goto_1

    .line 274
    .line 275
    :cond_6
    move-object/from16 v28, v3

    .line 276
    .line 277
    const/16 v16, 0x0

    .line 278
    .line 279
    const/16 v17, 0x1

    .line 280
    .line 281
    iget-object v0, v4, LC8/i;->e:Ljava/lang/Object;

    .line 282
    .line 283
    check-cast v0, Ljava/util/Map;

    .line 284
    .line 285
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 286
    .line 287
    .line 288
    move-result-object v1

    .line 289
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 290
    .line 291
    .line 292
    move-result-object v1

    .line 293
    :cond_7
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 294
    .line 295
    .line 296
    move-result v2

    .line 297
    if-eqz v2, :cond_8

    .line 298
    .line 299
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    move-result-object v2

    .line 303
    check-cast v2, Ls9/h;

    .line 304
    .line 305
    iget-object v3, v4, LC8/i;->f:Ljava/lang/Object;

    .line 306
    .line 307
    check-cast v3, Ljava/util/Set;

    .line 308
    .line 309
    invoke-interface {v3, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 310
    .line 311
    .line 312
    move-result v3

    .line 313
    if-eqz v3, :cond_7

    .line 314
    .line 315
    invoke-virtual {v6}, Lp7/b;->D()Lr9/z;

    .line 316
    .line 317
    .line 318
    move-result-object v3

    .line 319
    invoke-interface {v3, v2}, Lr9/z;->c(Ls9/h;)V

    .line 320
    .line 321
    .line 322
    goto :goto_3

    .line 323
    :cond_8
    invoke-virtual {v5, v0}, Lr9/l;->d(Ljava/util/Map;)Lba/a;

    .line 324
    .line 325
    .line 326
    move-result-object v0

    .line 327
    invoke-interface {v11}, Lr9/Q;->i()Ls9/o;

    .line 328
    .line 329
    .line 330
    move-result-object v1

    .line 331
    sget-object v2, Ls9/o;->b:Ls9/o;

    .line 332
    .line 333
    move-object/from16 v3, v28

    .line 334
    .line 335
    check-cast v3, Ls9/o;

    .line 336
    .line 337
    invoke-virtual {v3, v2}, Ls9/o;->equals(Ljava/lang/Object;)Z

    .line 338
    .line 339
    .line 340
    move-result v2

    .line 341
    if-nez v2, :cond_a

    .line 342
    .line 343
    invoke-virtual {v3, v1}, Ls9/o;->a(Ls9/o;)I

    .line 344
    .line 345
    .line 346
    move-result v2

    .line 347
    if-ltz v2, :cond_9

    .line 348
    .line 349
    move/from16 v2, v17

    .line 350
    .line 351
    goto :goto_4

    .line 352
    :cond_9
    move/from16 v2, v16

    .line 353
    .line 354
    :goto_4
    const-string v4, "Watch stream reverted to previous snapshot?? (%s < %s)"

    .line 355
    .line 356
    const/4 v6, 0x2

    .line 357
    new-array v6, v6, [Ljava/lang/Object;

    .line 358
    .line 359
    aput-object v3, v6, v16

    .line 360
    .line 361
    aput-object v1, v6, v17

    .line 362
    .line 363
    invoke-static {v2, v4, v6}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 364
    .line 365
    .line 366
    invoke-interface {v11, v3}, Lr9/Q;->e(Ls9/o;)V

    .line 367
    .line 368
    .line 369
    :cond_a
    iget-object v1, v5, Lr9/l;->f:LVa/Za;

    .line 370
    .line 371
    iget-object v2, v0, Lba/a;->b:Ljava/lang/Object;

    .line 372
    .line 373
    check-cast v2, Ljava/util/HashMap;

    .line 374
    .line 375
    iget-object v0, v0, Lba/a;->c:Ljava/lang/Object;

    .line 376
    .line 377
    check-cast v0, Ljava/util/HashSet;

    .line 378
    .line 379
    invoke-virtual {v1, v2, v0}, LVa/Za;->h(Ljava/util/Map;Ljava/util/HashSet;)Lc9/c;

    .line 380
    .line 381
    .line 382
    move-result-object v0

    .line 383
    return-object v0

    .line 384
    nop

    .line 385
    :pswitch_data_0
    .packed-switch 0x12
        :pswitch_0
    .end packed-switch
.end method

.method public onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 9

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x0

    .line 3
    iget-object v2, p0, LA5/g;->c:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v3, p0, LA5/g;->d:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v4, p0, LA5/g;->b:Ljava/lang/Object;

    .line 8
    .line 9
    const/4 v5, 0x1

    .line 10
    iget v6, p0, LA5/g;->a:I

    .line 11
    .line 12
    packed-switch v6, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast v4, Lv9/m;

    .line 16
    .line 17
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    check-cast p1, Lmd/f;

    .line 25
    .line 26
    new-instance v1, Lv9/l;

    .line 27
    .line 28
    check-cast v3, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 29
    .line 30
    invoke-direct {v1, v4, v3}, Lv9/l;-><init>(Lv9/m;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v4}, Lv9/m;->a()Lmd/b0;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-virtual {p1, v1, v3}, Lmd/f;->e(Lmd/e;Lmd/b0;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1, v0}, Lmd/f;->c(I)V

    .line 41
    .line 42
    .line 43
    check-cast v2, Lcom/google/protobuf/GeneratedMessageLite;

    .line 44
    .line 45
    invoke-virtual {p1, v2}, Lmd/f;->d(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1}, Lmd/f;->b()V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :pswitch_0
    check-cast v4, Lv9/m;

    .line 53
    .line 54
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    check-cast p1, Lmd/f;

    .line 62
    .line 63
    check-cast v3, [Lmd/f;

    .line 64
    .line 65
    aput-object p1, v3, v1

    .line 66
    .line 67
    new-instance v0, Lv9/j;

    .line 68
    .line 69
    check-cast v2, LE4/n;

    .line 70
    .line 71
    invoke-direct {v0, v4, v2, v3}, Lv9/j;-><init>(Lv9/m;LE4/n;[Lmd/f;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v4}, Lv9/m;->a()Lmd/b0;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    invoke-virtual {p1, v0, v4}, Lmd/f;->e(Lmd/e;Lmd/b0;)V

    .line 79
    .line 80
    .line 81
    new-instance p1, Lkd/c;

    .line 82
    .line 83
    const/16 v0, 0x10

    .line 84
    .line 85
    invoke-direct {p1, v2, v0}, Lkd/c;-><init>(Ljava/lang/Object;I)V

    .line 86
    .line 87
    .line 88
    iget-object v0, v2, LE4/n;->c:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v0, LA2/d;

    .line 91
    .line 92
    invoke-virtual {v0, p1}, LA2/d;->N(Ljava/lang/Runnable;)V

    .line 93
    .line 94
    .line 95
    aget-object p1, v3, v1

    .line 96
    .line 97
    invoke-virtual {p1, v5}, Lmd/f;->c(I)V

    .line 98
    .line 99
    .line 100
    return-void

    .line 101
    :pswitch_1
    check-cast v4, Lv9/m;

    .line 102
    .line 103
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    check-cast p1, Lmd/f;

    .line 111
    .line 112
    new-instance v0, Lv9/l;

    .line 113
    .line 114
    check-cast v3, LVa/Za;

    .line 115
    .line 116
    invoke-direct {v0, v3, p1}, Lv9/l;-><init>(LVa/Za;Lmd/f;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v4}, Lv9/m;->a()Lmd/b0;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    invoke-virtual {p1, v0, v1}, Lmd/f;->e(Lmd/e;Lmd/b0;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {p1, v5}, Lmd/f;->c(I)V

    .line 127
    .line 128
    .line 129
    check-cast v2, Lka/k;

    .line 130
    .line 131
    invoke-virtual {p1, v2}, Lmd/f;->d(Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {p1}, Lmd/f;->b()V

    .line 135
    .line 136
    .line 137
    return-void

    .line 138
    :pswitch_2
    new-instance p1, Lmd/b0;

    .line 139
    .line 140
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 141
    .line 142
    .line 143
    check-cast v4, Lcom/google/android/gms/tasks/Task;

    .line 144
    .line 145
    invoke-virtual {v4}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    .line 146
    .line 147
    .line 148
    move-result v6

    .line 149
    check-cast v3, Lod/a1;

    .line 150
    .line 151
    const-string v7, "FirestoreCallCredentials"

    .line 152
    .line 153
    if-eqz v6, :cond_0

    .line 154
    .line 155
    invoke-virtual {v4}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v4

    .line 159
    check-cast v4, Ljava/lang/String;

    .line 160
    .line 161
    new-array v6, v1, [Ljava/lang/Object;

    .line 162
    .line 163
    const-string v8, "Successfully fetched auth token."

    .line 164
    .line 165
    invoke-static {v7, v8, v5, v6}, LBa/c;->p(Ljava/lang/String;Ljava/lang/String;I[Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    if-eqz v4, :cond_2

    .line 169
    .line 170
    sget-object v6, Lv9/i;->c:Lmd/W;

    .line 171
    .line 172
    const-string v8, "Bearer "

    .line 173
    .line 174
    invoke-virtual {v8, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v4

    .line 178
    invoke-virtual {p1, v6, v4}, Lmd/b0;->f(Lmd/Y;Ljava/lang/Object;)V

    .line 179
    .line 180
    .line 181
    goto :goto_0

    .line 182
    :cond_0
    invoke-virtual {v4}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    .line 183
    .line 184
    .line 185
    move-result-object v4

    .line 186
    instance-of v6, v4, Ls8/c;

    .line 187
    .line 188
    if-eqz v6, :cond_1

    .line 189
    .line 190
    new-array v4, v1, [Ljava/lang/Object;

    .line 191
    .line 192
    const-string v6, "Firebase Auth API not available, not using authentication."

    .line 193
    .line 194
    invoke-static {v7, v6, v5, v4}, LBa/c;->p(Ljava/lang/String;Ljava/lang/String;I[Ljava/lang/Object;)V

    .line 195
    .line 196
    .line 197
    goto :goto_0

    .line 198
    :cond_1
    instance-of v6, v4, LU9/a;

    .line 199
    .line 200
    if-eqz v6, :cond_6

    .line 201
    .line 202
    new-array v4, v1, [Ljava/lang/Object;

    .line 203
    .line 204
    const-string v6, "No user signed in, not using authentication."

    .line 205
    .line 206
    invoke-static {v7, v6, v5, v4}, LBa/c;->p(Ljava/lang/String;Ljava/lang/String;I[Ljava/lang/Object;)V

    .line 207
    .line 208
    .line 209
    :cond_2
    :goto_0
    check-cast v2, Lcom/google/android/gms/tasks/Task;

    .line 210
    .line 211
    invoke-virtual {v2}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    .line 212
    .line 213
    .line 214
    move-result v4

    .line 215
    if-eqz v4, :cond_3

    .line 216
    .line 217
    invoke-virtual {v2}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    check-cast v0, Ljava/lang/String;

    .line 222
    .line 223
    if-eqz v0, :cond_4

    .line 224
    .line 225
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 226
    .line 227
    .line 228
    move-result v2

    .line 229
    if-nez v2, :cond_4

    .line 230
    .line 231
    new-array v1, v1, [Ljava/lang/Object;

    .line 232
    .line 233
    const-string v2, "Successfully fetched AppCheck token."

    .line 234
    .line 235
    invoke-static {v7, v2, v5, v1}, LBa/c;->p(Ljava/lang/String;Ljava/lang/String;I[Ljava/lang/Object;)V

    .line 236
    .line 237
    .line 238
    sget-object v1, Lv9/i;->d:Lmd/W;

    .line 239
    .line 240
    invoke-virtual {p1, v1, v0}, Lmd/b0;->f(Lmd/Y;Ljava/lang/Object;)V

    .line 241
    .line 242
    .line 243
    goto :goto_1

    .line 244
    :cond_3
    invoke-virtual {v2}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    .line 245
    .line 246
    .line 247
    move-result-object v2

    .line 248
    instance-of v4, v2, Ls8/c;

    .line 249
    .line 250
    if-eqz v4, :cond_5

    .line 251
    .line 252
    new-array v0, v1, [Ljava/lang/Object;

    .line 253
    .line 254
    const-string v1, "Firebase AppCheck API not available."

    .line 255
    .line 256
    invoke-static {v7, v1, v5, v0}, LBa/c;->p(Ljava/lang/String;Ljava/lang/String;I[Ljava/lang/Object;)V

    .line 257
    .line 258
    .line 259
    :cond_4
    :goto_1
    iget-boolean v0, v3, Lod/a1;->j:Z

    .line 260
    .line 261
    xor-int/2addr v0, v5

    .line 262
    const-string v1, "apply() or fail() already called"

    .line 263
    .line 264
    invoke-static {v1, v0}, LFe/e;->w(Ljava/lang/String;Z)V

    .line 265
    .line 266
    .line 267
    iget-object v0, v3, Lod/a1;->c:Lmd/b0;

    .line 268
    .line 269
    invoke-virtual {v0, p1}, Lmd/b0;->d(Lmd/b0;)V

    .line 270
    .line 271
    .line 272
    iget-object p1, v3, Lod/a1;->e:Lmd/q;

    .line 273
    .line 274
    invoke-virtual {p1}, Lmd/q;->a()Lmd/q;

    .line 275
    .line 276
    .line 277
    move-result-object v1

    .line 278
    :try_start_0
    iget-object v2, v3, Lod/a1;->a:Lod/u;

    .line 279
    .line 280
    iget-object v4, v3, Lod/a1;->b:LF6/r;

    .line 281
    .line 282
    iget-object v5, v3, Lod/a1;->d:Lmd/c;

    .line 283
    .line 284
    iget-object v6, v3, Lod/a1;->g:[Lmd/i;

    .line 285
    .line 286
    invoke-interface {v2, v4, v0, v5, v6}, Lod/u;->c(LF6/r;Lmd/b0;Lmd/c;[Lmd/i;)Lod/r;

    .line 287
    .line 288
    .line 289
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 290
    invoke-virtual {p1, v1}, Lmd/q;->c(Lmd/q;)V

    .line 291
    .line 292
    .line 293
    invoke-virtual {v3, v0}, Lod/a1;->b(Lod/r;)V

    .line 294
    .line 295
    .line 296
    goto :goto_2

    .line 297
    :catchall_0
    move-exception v0

    .line 298
    invoke-virtual {p1, v1}, Lmd/q;->c(Lmd/q;)V

    .line 299
    .line 300
    .line 301
    throw v0

    .line 302
    :cond_5
    new-array p1, v5, [Ljava/lang/Object;

    .line 303
    .line 304
    aput-object v2, p1, v1

    .line 305
    .line 306
    const-string v1, "Failed to get AppCheck token: %s."

    .line 307
    .line 308
    invoke-static {v7, v1, v0, p1}, LBa/c;->p(Ljava/lang/String;Ljava/lang/String;I[Ljava/lang/Object;)V

    .line 309
    .line 310
    .line 311
    sget-object p1, Lmd/k0;->j:Lmd/k0;

    .line 312
    .line 313
    invoke-virtual {p1, v2}, Lmd/k0;->g(Ljava/lang/Throwable;)Lmd/k0;

    .line 314
    .line 315
    .line 316
    move-result-object p1

    .line 317
    invoke-virtual {v3, p1}, Lod/a1;->a(Lmd/k0;)V

    .line 318
    .line 319
    .line 320
    goto :goto_2

    .line 321
    :cond_6
    new-array p1, v5, [Ljava/lang/Object;

    .line 322
    .line 323
    aput-object v4, p1, v1

    .line 324
    .line 325
    const-string v1, "Failed to get auth token: %s."

    .line 326
    .line 327
    invoke-static {v7, v1, v0, p1}, LBa/c;->p(Ljava/lang/String;Ljava/lang/String;I[Ljava/lang/Object;)V

    .line 328
    .line 329
    .line 330
    sget-object p1, Lmd/k0;->j:Lmd/k0;

    .line 331
    .line 332
    invoke-virtual {p1, v4}, Lmd/k0;->g(Ljava/lang/Throwable;)Lmd/k0;

    .line 333
    .line 334
    .line 335
    move-result-object p1

    .line 336
    invoke-virtual {v3, p1}, Lod/a1;->a(Lmd/k0;)V

    .line 337
    .line 338
    .line 339
    :goto_2
    return-void

    .line 340
    nop

    .line 341
    :pswitch_data_0
    .packed-switch 0x14
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onConsentFormLoadFailure(Lcom/google/android/ump/FormError;)V
    .locals 3

    .line 1
    iget-object v0, p0, LA5/g;->b:Ljava/lang/Object;

    check-cast v0, Lcom/applovin/impl/privacy/cmp/a;

    iget-object v1, p0, LA5/g;->d:Ljava/lang/Object;

    check-cast v1, Lcom/applovin/impl/privacy/cmp/a$a;

    iget-object v2, p0, LA5/g;->c:Ljava/lang/Object;

    check-cast v2, Lcom/google/android/ump/FormError;

    invoke-static {v0, v1, v2, p1}, Lcom/applovin/impl/privacy/cmp/a;->c(Lcom/applovin/impl/privacy/cmp/a;Lcom/applovin/impl/privacy/cmp/a$a;Lcom/google/android/ump/FormError;Lcom/google/android/ump/FormError;)V

    return-void
.end method

.method public onConsentInfoUpdateSuccess()V
    .locals 3

    .line 1
    iget-object v0, p0, LA5/g;->b:Ljava/lang/Object;

    check-cast v0, Lcom/applovin/impl/privacy/cmp/a;

    iget-object v1, p0, LA5/g;->d:Ljava/lang/Object;

    check-cast v1, Landroid/app/Activity;

    iget-object v2, p0, LA5/g;->c:Ljava/lang/Object;

    check-cast v2, Lcom/applovin/impl/privacy/cmp/a$a;

    invoke-static {v0, v1, v2}, Lcom/applovin/impl/privacy/cmp/a;->b(Lcom/applovin/impl/privacy/cmp/a;Landroid/app/Activity;Lcom/applovin/impl/privacy/cmp/a$a;)V

    return-void
.end method

.method public onFailure(Ljava/lang/Exception;)V
    .locals 12

    .line 1
    iget-object v0, p0, LA5/g;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lx4/b;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    instance-of v1, p1, Lcom/google/android/gms/common/api/s;

    .line 9
    .line 10
    iget-object v2, p0, LA5/g;->c:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v2, Lw4/a;

    .line 13
    .line 14
    const/4 v3, 0x3

    .line 15
    if-eqz v1, :cond_6

    .line 16
    .line 17
    iget-object v1, p0, LA5/g;->d:Ljava/lang/Object;

    .line 18
    .line 19
    move-object v4, v1

    .line 20
    check-cast v4, Landroid/app/Activity;

    .line 21
    .line 22
    if-nez v4, :cond_0

    .line 23
    .line 24
    invoke-interface {v2, v3}, Lw4/a;->onError(I)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    check-cast p1, Lcom/google/android/gms/common/api/s;

    .line 29
    .line 30
    invoke-virtual {p1}, Lcom/google/android/gms/common/api/j;->getStatusCode()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    const/4 v5, 0x6

    .line 35
    if-ne v1, v5, :cond_5

    .line 36
    .line 37
    :try_start_0
    iget v6, v0, Lx4/b;->e:I

    .line 38
    .line 39
    invoke-virtual {p1}, Lcom/google/android/gms/common/api/j;->getStatus()Lcom/google/android/gms/common/api/Status;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    iget-object v0, p1, Lcom/google/android/gms/common/api/Status;->c:Landroid/app/PendingIntent;

    .line 44
    .line 45
    const/4 v1, 0x0

    .line 46
    const/4 v5, 0x1

    .line 47
    if-eqz v0, :cond_1

    .line 48
    .line 49
    move v0, v5

    .line 50
    goto :goto_0

    .line 51
    :cond_1
    move v0, v1

    .line 52
    :goto_0
    if-nez v0, :cond_2

    .line 53
    .line 54
    goto :goto_3

    .line 55
    :cond_2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 56
    .line 57
    const/16 v7, 0x22

    .line 58
    .line 59
    if-lt v0, v7, :cond_3

    .line 60
    .line 61
    move v1, v5

    .line 62
    :cond_3
    if-eqz v1, :cond_4

    .line 63
    .line 64
    invoke-static {}, Landroid/app/ActivityOptions;->makeBasic()Landroid/app/ActivityOptions;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-static {v0}, LWf/p;->f(Landroid/app/ActivityOptions;)Landroid/app/ActivityOptions;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-virtual {v0}, Landroid/app/ActivityOptions;->toBundle()Landroid/os/Bundle;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    :goto_1
    move-object v11, v0

    .line 77
    goto :goto_2

    .line 78
    :cond_4
    const/4 v0, 0x0

    .line 79
    goto :goto_1

    .line 80
    :goto_2
    iget-object p1, p1, Lcom/google/android/gms/common/api/Status;->c:Landroid/app/PendingIntent;

    .line 81
    .line 82
    invoke-static {p1}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1}, Landroid/app/PendingIntent;->getIntentSender()Landroid/content/IntentSender;

    .line 86
    .line 87
    .line 88
    move-result-object v5

    .line 89
    const/4 v7, 0x0

    .line 90
    const/4 v8, 0x0

    .line 91
    const/4 v9, 0x0

    .line 92
    const/4 v10, 0x0

    .line 93
    invoke-virtual/range {v4 .. v11}, Landroid/app/Activity;->startIntentSenderForResult(Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V
    :try_end_0
    .catch Landroid/content/IntentSender$SendIntentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 94
    .line 95
    .line 96
    return-void

    .line 97
    :catch_0
    invoke-interface {v2, v3}, Lw4/a;->onError(I)V

    .line 98
    .line 99
    .line 100
    :goto_3
    return-void

    .line 101
    :cond_5
    invoke-interface {v2, v3}, Lw4/a;->onError(I)V

    .line 102
    .line 103
    .line 104
    return-void

    .line 105
    :cond_6
    check-cast p1, Lcom/google/android/gms/common/api/j;

    .line 106
    .line 107
    invoke-virtual {p1}, Lcom/google/android/gms/common/api/j;->getStatusCode()I

    .line 108
    .line 109
    .line 110
    move-result p1

    .line 111
    const/16 v1, 0x2136

    .line 112
    .line 113
    if-ne p1, v1, :cond_7

    .line 114
    .line 115
    iget-object p1, v0, Lx4/b;->f:Lx4/h;

    .line 116
    .line 117
    invoke-virtual {v0, p1}, Lx4/b;->g(Lx4/h;)V

    .line 118
    .line 119
    .line 120
    return-void

    .line 121
    :cond_7
    invoke-interface {v2, v3}, Lw4/a;->onError(I)V

    .line 122
    .line 123
    .line 124
    return-void
.end method

.method public onSuccess(Ljava/lang/Object;)V
    .locals 4

    .line 1
    iget v0, p0, LA5/g;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LA5/g;->d:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lcom/google/android/gms/tasks/Task;

    .line 9
    .line 10
    iget-object v1, p0, LA5/g;->c:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, LO8/b;

    .line 13
    .line 14
    check-cast p1, Laa/e;

    .line 15
    .line 16
    iget-object p1, p0, LA5/g;->b:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p1, LVa/Za;

    .line 19
    .line 20
    :try_start_0
    invoke-virtual {v0}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, Laa/e;

    .line 25
    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    iget-object v2, p1, LVa/Za;->b:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v2, Lba/a;

    .line 31
    .line 32
    invoke-virtual {v2, v0}, Lba/a;->u(Laa/e;)Lda/d;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iget-object p1, p1, LVa/Za;->c:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast p1, Ljava/util/concurrent/Executor;

    .line 39
    .line 40
    new-instance v2, Lba/b;

    .line 41
    .line 42
    const/4 v3, 0x1

    .line 43
    invoke-direct {v2, v1, v0, v3}, Lba/b;-><init>(LO8/b;Lda/d;I)V

    .line 44
    .line 45
    .line 46
    invoke-interface {p1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch LZ9/f; {:try_start_0 .. :try_end_0} :catch_0

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :catch_0
    move-exception p1

    .line 51
    const-string v0, "FirebaseRemoteConfig"

    .line 52
    .line 53
    const-string v1, "Exception publishing RolloutsState to subscriber. Continuing to listen for changes."

    .line 54
    .line 55
    invoke-static {v0, v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 56
    .line 57
    .line 58
    :cond_0
    :goto_0
    return-void

    .line 59
    :pswitch_0
    check-cast p1, Ljava/lang/String;

    .line 60
    .line 61
    iget-object v0, p0, LA5/g;->b:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v0, LJ9/G;

    .line 64
    .line 65
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    sget-object v1, LJ9/G;->i:Ljava/util/HashMap;

    .line 69
    .line 70
    iget-object v2, p0, LA5/g;->c:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v2, Lz9/C;

    .line 73
    .line 74
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    check-cast v1, Lz9/r;

    .line 79
    .line 80
    iget-object v2, p0, LA5/g;->d:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v2, LN9/h;

    .line 83
    .line 84
    invoke-virtual {v0, v2, p1}, LJ9/G;->a(LN9/h;Ljava/lang/String;)Lz9/b;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-virtual {p1, v1}, Lz9/b;->d(Lz9/r;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    check-cast p1, Lz9/c;

    .line 96
    .line 97
    invoke-virtual {p1}, Lcom/google/protobuf/AbstractMessageLite;->toByteArray()[B

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    iget-object v0, v0, LJ9/G;->a:LB8/b;

    .line 102
    .line 103
    invoke-virtual {v0, p1}, LB8/b;->b([B)V

    .line 104
    .line 105
    .line 106
    return-void

    .line 107
    :pswitch_1
    check-cast p1, Ljava/lang/String;

    .line 108
    .line 109
    iget-object v0, p0, LA5/g;->b:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v0, LJ9/G;

    .line 112
    .line 113
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    sget-object v1, LJ9/G;->h:Ljava/util/HashMap;

    .line 117
    .line 118
    iget-object v2, p0, LA5/g;->c:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast v2, Lz9/D;

    .line 121
    .line 122
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    check-cast v1, Lz9/Z;

    .line 127
    .line 128
    iget-object v2, p0, LA5/g;->d:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast v2, LN9/h;

    .line 131
    .line 132
    invoke-virtual {v0, v2, p1}, LJ9/G;->a(LN9/h;Ljava/lang/String;)Lz9/b;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    invoke-virtual {p1, v1}, Lz9/b;->h(Lz9/Z;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    check-cast p1, Lz9/c;

    .line 144
    .line 145
    invoke-virtual {p1}, Lcom/google/protobuf/AbstractMessageLite;->toByteArray()[B

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    iget-object v0, v0, LJ9/G;->a:LB8/b;

    .line 150
    .line 151
    invoke-virtual {v0, p1}, LB8/b;->b([B)V

    .line 152
    .line 153
    .line 154
    return-void

    .line 155
    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public then(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;
    .locals 8

    iget-object v0, p0, LA5/g;->b:Ljava/lang/Object;

    check-cast v0, Lcom/google/firebase/messaging/FirebaseMessaging;

    iget-object v1, p0, LA5/g;->d:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, LA5/g;->c:Ljava/lang/Object;

    check-cast v2, LW9/v;

    check-cast p1, Ljava/lang/String;

    .line 41
    iget-object v3, v0, Lcom/google/firebase/messaging/FirebaseMessaging;->b:Landroid/content/Context;

    invoke-static {v3}, Lcom/google/firebase/messaging/FirebaseMessaging;->d(Landroid/content/Context;)LA/e0;

    move-result-object v3

    .line 42
    invoke-virtual {v0}, Lcom/google/firebase/messaging/FirebaseMessaging;->e()Ljava/lang/String;

    move-result-object v4

    iget-object v5, v0, Lcom/google/firebase/messaging/FirebaseMessaging;->i:LW9/o;

    invoke-virtual {v5}, LW9/o;->b()Ljava/lang/String;

    move-result-object v5

    .line 43
    monitor-enter v3

    .line 44
    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    invoke-static {v6, v7, p1, v5}, LW9/v;->a(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v5, :cond_0

    .line 45
    monitor-exit v3

    goto :goto_0

    .line 46
    :cond_0
    :try_start_1
    iget-object v6, v3, LA/e0;->b:Ljava/lang/Object;

    check-cast v6, Landroid/content/SharedPreferences;

    invoke-interface {v6}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v6

    .line 47
    invoke-static {v4, v1}, LA/e0;->j(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v6, v1, v5}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 48
    invoke-interface {v6}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 49
    monitor-exit v3

    :goto_0
    if-eqz v2, :cond_1

    .line 50
    iget-object v1, v2, LW9/v;->a:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    .line 51
    :cond_1
    iget-object v1, v0, Lcom/google/firebase/messaging/FirebaseMessaging;->a:Ls8/g;

    invoke-virtual {v1}, Ls8/g;->a()V

    .line 52
    const-string v2, "[DEFAULT]"

    iget-object v3, v1, Ls8/g;->b:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 53
    const-string v2, "FirebaseMessaging"

    const/4 v3, 0x3

    invoke-static {v2, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 54
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Invoking onNewToken for app: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 55
    invoke-virtual {v1}, Ls8/g;->a()V

    .line 56
    iget-object v1, v1, Ls8/g;->b:Ljava/lang/String;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 57
    :cond_2
    new-instance v1, Landroid/content/Intent;

    const-string v2, "com.google.firebase.messaging.NEW_TOKEN"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 58
    const-string v2, "token"

    invoke-virtual {v1, v2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 59
    new-instance v2, LW9/i;

    iget-object v0, v0, Lcom/google/firebase/messaging/FirebaseMessaging;->b:Landroid/content/Context;

    invoke-direct {v2, v0}, LW9/i;-><init>(Landroid/content/Context;)V

    invoke-virtual {v2, v1}, LW9/i;->b(Landroid/content/Intent;)Lcom/google/android/gms/tasks/Task;

    .line 60
    :cond_3
    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1

    :catchall_0
    move-exception p1

    .line 61
    :try_start_2
    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public then(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;
    .locals 4

    iget v0, p0, LA5/g;->a:I

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    iget-object p1, p0, LA5/g;->b:Ljava/lang/Object;

    check-cast p1, Laa/n;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1
    iget-object v0, p0, LA5/g;->d:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/tasks/Task;

    invoke-virtual {v0}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    move-result v1

    if-nez v1, :cond_0

    .line 2
    new-instance p1, LZ9/e;

    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    move-result-object v0

    .line 4
    const-string v1, "Firebase Installations failed to get installation auth token for config update listener connection."

    invoke-direct {p1, v1, v0}, Ls8/j;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 5
    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forException(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    goto :goto_1

    .line 6
    :cond_0
    iget-object v1, p0, LA5/g;->c:Ljava/lang/Object;

    check-cast v1, Lcom/google/android/gms/tasks/Task;

    invoke-virtual {v1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    move-result v2

    if-nez v2, :cond_1

    .line 7
    new-instance p1, LZ9/e;

    .line 8
    invoke-virtual {v1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    move-result-object v0

    .line 9
    const-string v1, "Firebase Installations failed to get installation ID for config update listener connection."

    invoke-direct {p1, v1, v0}, Ls8/j;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 10
    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forException(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    goto :goto_1

    .line 11
    :cond_1
    :try_start_0
    new-instance v2, Ljava/net/URL;

    iget-object v3, p1, Laa/n;->l:Ljava/lang/String;

    invoke-virtual {p1, v3}, Laa/n;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    .line 12
    :catch_0
    :try_start_1
    const-string v2, "FirebaseRemoteConfig"

    const-string v3, "URL is malformed"

    invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v2, 0x0

    .line 13
    :goto_0
    invoke-virtual {v2}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v2

    check-cast v2, Ljava/net/HttpURLConnection;

    .line 14
    invoke-virtual {v0}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LP9/a;

    .line 15
    iget-object v0, v0, LP9/a;->a:Ljava/lang/String;

    .line 16
    invoke-virtual {v1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 17
    invoke-virtual {p1, v2, v1, v0}, Laa/n;->j(Ljava/net/HttpURLConnection;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 18
    invoke-static {v2}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    goto :goto_1

    :catch_1
    move-exception p1

    .line 19
    new-instance v0, LZ9/e;

    .line 20
    const-string v1, "Failed to open HTTP stream connection"

    invoke-direct {v0, v1, p1}, Ls8/j;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 21
    invoke-static {v0}, Lcom/google/android/gms/tasks/Tasks;->forException(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    :goto_1
    return-object p1

    .line 22
    :pswitch_1
    iget-object p1, p0, LA5/g;->b:Ljava/lang/Object;

    check-cast p1, LZ9/d;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    iget-object v0, p0, LA5/g;->d:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/gms/tasks/Task;

    invoke-virtual {v0}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {v0}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_2

    goto :goto_3

    .line 24
    :cond_2
    invoke-virtual {v0}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Laa/e;

    .line 25
    iget-object v1, p0, LA5/g;->c:Ljava/lang/Object;

    check-cast v1, Lcom/google/android/gms/tasks/Task;

    invoke-virtual {v1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    move-result v2

    if-eqz v2, :cond_4

    .line 26
    invoke-virtual {v1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Laa/e;

    if-eqz v1, :cond_4

    .line 27
    iget-object v2, v0, Laa/e;->c:Ljava/util/Date;

    .line 28
    iget-object v1, v1, Laa/e;->c:Ljava/util/Date;

    invoke-virtual {v2, v1}, Ljava/util/Date;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_2

    .line 29
    :cond_3
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    goto :goto_4

    .line 30
    :cond_4
    :goto_2
    iget-object v1, p1, LZ9/d;->e:Laa/c;

    .line 31
    invoke-virtual {v1, v0}, Laa/c;->e(Laa/e;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    new-instance v1, LZ9/c;

    invoke-direct {v1, p1}, LZ9/c;-><init>(LZ9/d;)V

    .line 32
    iget-object p1, p1, LZ9/d;->c:Ljava/util/concurrent/Executor;

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/tasks/Task;->continueWith(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/Continuation;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    goto :goto_4

    .line 33
    :cond_5
    :goto_3
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    :goto_4
    return-object p1

    .line 34
    :pswitch_2
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    move-result v0

    iget-object v1, p0, LA5/g;->b:Ljava/lang/Object;

    check-cast v1, Lcom/google/android/gms/tasks/TaskCompletionSource;

    if-eqz v0, :cond_6

    .line 35
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->trySetResult(Ljava/lang/Object;)Z

    goto :goto_5

    .line 36
    :cond_6
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    move-result-object v0

    if-eqz v0, :cond_7

    .line 37
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->trySetException(Ljava/lang/Exception;)Z

    goto :goto_5

    :cond_7
    const/4 p1, 0x1

    .line 38
    iget-object v0, p0, LA5/g;->d:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result p1

    if-eqz p1, :cond_8

    .line 39
    iget-object p1, p0, LA5/g;->c:Ljava/lang/Object;

    check-cast p1, Lcom/google/android/gms/tasks/CancellationTokenSource;

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/CancellationTokenSource;->cancel()V

    :cond_8
    :goto_5
    const/4 p1, 0x0

    .line 40
    invoke-static {p1}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
