.class public final Lr9/N;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/database/sqlite/SQLiteDatabase;

.field public final b:La2/v;


# direct methods
.method public constructor <init>(Landroid/database/sqlite/SQLiteDatabase;La2/v;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lr9/N;->a:Landroid/database/sqlite/SQLiteDatabase;

    .line 5
    .line 6
    iput-object p2, p0, Lr9/N;->b:La2/v;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    .line 1
    new-instance v0, Lr9/M;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lr9/M;-><init>(Lr9/N;I)V

    .line 5
    .line 6
    .line 7
    const-string v1, "SELECT target_id, target_proto FROM targets"

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    iget-object v3, p0, Lr9/N;->a:Landroid/database/sqlite/SQLiteDatabase;

    .line 11
    .line 12
    invoke-virtual {v3, v1, v2}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    :goto_0
    :try_start_0
    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Lr9/M;->accept(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception v0

    .line 27
    goto :goto_1

    .line 28
    :cond_0
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :goto_1
    if-eqz v1, :cond_1

    .line 33
    .line 34
    :try_start_1
    invoke-interface {v1}, Landroid/database/Cursor;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 35
    .line 36
    .line 37
    goto :goto_2

    .line 38
    :catchall_1
    move-exception v1

    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 40
    .line 41
    .line 42
    :cond_1
    :goto_2
    throw v0
.end method

.method public final b([Ljava/lang/String;Ljava/lang/Runnable;)V
    .locals 6

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "["

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string v1, ", "

    .line 9
    .line 10
    invoke-static {v1, p1}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;[Ljava/lang/Object;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const-string v2, "]"

    .line 15
    .line 16
    invoke-static {v0, v1, v2}, Lwg/b;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const/4 v1, 0x0

    .line 21
    move v2, v1

    .line 22
    move v3, v2

    .line 23
    :goto_0
    array-length v4, p1

    .line 24
    if-ge v2, v4, :cond_3

    .line 25
    .line 26
    aget-object v4, p1, v2

    .line 27
    .line 28
    invoke-virtual {p0, v4}, Lr9/N;->e(Ljava/lang/String;)Z

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    if-nez v2, :cond_0

    .line 33
    .line 34
    move v3, v5

    .line 35
    goto :goto_2

    .line 36
    :cond_0
    if-eq v5, v3, :cond_2

    .line 37
    .line 38
    const-string p2, "Expected all of "

    .line 39
    .line 40
    const-string v2, " to either exist or not, but "

    .line 41
    .line 42
    invoke-static {p2, v0, v2}, LA7/p0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    if-eqz v3, :cond_1

    .line 47
    .line 48
    invoke-static {p2}, LN0/a;->j(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    aget-object p1, p1, v1

    .line 53
    .line 54
    const-string v0, " exists and "

    .line 55
    .line 56
    const-string v1, " does not"

    .line 57
    .line 58
    invoke-static {p2, p1, v0, v4, v1}, Lka/n;->h(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    goto :goto_1

    .line 63
    :cond_1
    invoke-static {p2}, LN0/a;->j(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    move-result-object p2

    .line 67
    aget-object p1, p1, v1

    .line 68
    .line 69
    const-string v0, " does not exist and "

    .line 70
    .line 71
    const-string v1, " does"

    .line 72
    .line 73
    invoke-static {p2, p1, v0, v4, v1}, Lka/n;->h(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    :goto_1
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 78
    .line 79
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    throw p2

    .line 83
    :cond_2
    :goto_2
    add-int/lit8 v2, v2, 0x1

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_3
    if-nez v3, :cond_4

    .line 87
    .line 88
    invoke-interface {p2}, Ljava/lang/Runnable;->run()V

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    :cond_4
    const-string p1, "Skipping migration because all of "

    .line 93
    .line 94
    const-string p2, " already exist"

    .line 95
    .line 96
    invoke-static {p1, v0, p2}, LA7/p0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    new-array p2, v1, [Ljava/lang/Object;

    .line 101
    .line 102
    const/4 v0, 0x1

    .line 103
    const-string v1, "SQLiteSchema"

    .line 104
    .line 105
    invoke-static {v1, p1, v0, p2}, LBa/c;->p(Ljava/lang/String;Ljava/lang/String;I[Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    return-void
.end method

.method public final c(I)V
    .locals 23

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v0, p1

    .line 4
    .line 5
    const/4 v4, 0x4

    .line 6
    const/4 v5, 0x5

    .line 7
    const/16 v6, 0x8

    .line 8
    .line 9
    const/4 v7, 0x3

    .line 10
    const/4 v9, 0x2

    .line 11
    const/4 v10, 0x1

    .line 12
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 13
    .line 14
    .line 15
    move-result-wide v11

    .line 16
    const-string v13, "target_globals"

    .line 17
    .line 18
    const-string v14, "targets"

    .line 19
    .line 20
    const-string v15, "target_documents"

    .line 21
    .line 22
    const-string v8, "remote_documents"

    .line 23
    .line 24
    if-ge v0, v10, :cond_0

    .line 25
    .line 26
    const-string v10, "mutations"

    .line 27
    .line 28
    const-string v2, "document_mutations"

    .line 29
    .line 30
    const-string v3, "mutation_queues"

    .line 31
    .line 32
    filled-new-array {v3, v10, v2}, [Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    new-instance v3, Lr9/L;

    .line 37
    .line 38
    invoke-direct {v3, v1, v6}, Lr9/L;-><init>(Lr9/N;I)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, v2, v3}, Lr9/N;->b([Ljava/lang/String;Ljava/lang/Runnable;)V

    .line 42
    .line 43
    .line 44
    filled-new-array {v14, v13, v15}, [Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    new-instance v3, Lr9/L;

    .line 49
    .line 50
    invoke-direct {v3, v1, v9}, Lr9/L;-><init>(Lr9/N;I)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1, v2, v3}, Lr9/N;->b([Ljava/lang/String;Ljava/lang/Runnable;)V

    .line 54
    .line 55
    .line 56
    filled-new-array {v8}, [Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    new-instance v3, Lr9/L;

    .line 61
    .line 62
    invoke-direct {v3, v1, v5}, Lr9/L;-><init>(Lr9/N;I)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1, v2, v3}, Lr9/N;->b([Ljava/lang/String;Ljava/lang/Runnable;)V

    .line 66
    .line 67
    .line 68
    :cond_0
    iget-object v2, v1, Lr9/N;->a:Landroid/database/sqlite/SQLiteDatabase;

    .line 69
    .line 70
    if-ge v0, v7, :cond_4

    .line 71
    .line 72
    if-eqz v0, :cond_4

    .line 73
    .line 74
    invoke-virtual {v1, v14}, Lr9/N;->e(Ljava/lang/String;)Z

    .line 75
    .line 76
    .line 77
    move-result v3

    .line 78
    if-eqz v3, :cond_1

    .line 79
    .line 80
    const-string v3, "DROP TABLE targets"

    .line 81
    .line 82
    invoke-virtual {v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    :cond_1
    invoke-virtual {v1, v13}, Lr9/N;->e(Ljava/lang/String;)Z

    .line 86
    .line 87
    .line 88
    move-result v3

    .line 89
    if-eqz v3, :cond_2

    .line 90
    .line 91
    const-string v3, "DROP TABLE target_globals"

    .line 92
    .line 93
    invoke-virtual {v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    :cond_2
    invoke-virtual {v1, v15}, Lr9/N;->e(Ljava/lang/String;)Z

    .line 97
    .line 98
    .line 99
    move-result v3

    .line 100
    if-eqz v3, :cond_3

    .line 101
    .line 102
    const-string v3, "DROP TABLE target_documents"

    .line 103
    .line 104
    invoke-virtual {v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    :cond_3
    filled-new-array {v14, v13, v15}, [Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v3

    .line 111
    new-instance v10, Lr9/L;

    .line 112
    .line 113
    invoke-direct {v10, v1, v9}, Lr9/L;-><init>(Lr9/N;I)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v1, v3, v10}, Lr9/N;->b([Ljava/lang/String;Ljava/lang/Runnable;)V

    .line 117
    .line 118
    .line 119
    :cond_4
    const/4 v3, 0x0

    .line 120
    if-ge v0, v4, :cond_7

    .line 121
    .line 122
    invoke-static {v2, v13}, Landroid/database/DatabaseUtils;->queryNumEntries(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)J

    .line 123
    .line 124
    .line 125
    move-result-wide v17

    .line 126
    const-wide/16 v19, 0x1

    .line 127
    .line 128
    cmp-long v10, v17, v19

    .line 129
    .line 130
    if-nez v10, :cond_5

    .line 131
    .line 132
    goto :goto_0

    .line 133
    :cond_5
    const-string v10, "0"

    .line 134
    .line 135
    filled-new-array {v10, v10, v10, v10}, [Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v10

    .line 139
    const-string v4, "INSERT INTO target_globals (highest_target_id, highest_listen_sequence_number, last_remote_snapshot_version_seconds, last_remote_snapshot_version_nanos) VALUES (?, ?, ?, ?)"

    .line 140
    .line 141
    invoke-virtual {v2, v4, v10}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    :goto_0
    const-string v4, "target_count"

    .line 145
    .line 146
    invoke-virtual {v1, v13, v4}, Lr9/N;->d(Ljava/lang/String;Ljava/lang/String;)Z

    .line 147
    .line 148
    .line 149
    move-result v10

    .line 150
    if-nez v10, :cond_6

    .line 151
    .line 152
    const-string v10, "ALTER TABLE target_globals ADD COLUMN target_count INTEGER"

    .line 153
    .line 154
    invoke-virtual {v2, v10}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    :cond_6
    invoke-static {v2, v14}, Landroid/database/DatabaseUtils;->queryNumEntries(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)J

    .line 158
    .line 159
    .line 160
    move-result-wide v18

    .line 161
    new-instance v10, Landroid/content/ContentValues;

    .line 162
    .line 163
    invoke-direct {v10}, Landroid/content/ContentValues;-><init>()V

    .line 164
    .line 165
    .line 166
    invoke-static/range {v18 .. v19}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 167
    .line 168
    .line 169
    move-result-object v14

    .line 170
    invoke-virtual {v10, v4, v14}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v2, v13, v10, v3, v3}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    .line 174
    .line 175
    .line 176
    :cond_7
    if-ge v0, v5, :cond_8

    .line 177
    .line 178
    const-string v4, "sequence_number"

    .line 179
    .line 180
    invoke-virtual {v1, v15, v4}, Lr9/N;->d(Ljava/lang/String;Ljava/lang/String;)Z

    .line 181
    .line 182
    .line 183
    move-result v4

    .line 184
    if-nez v4, :cond_8

    .line 185
    .line 186
    const-string v4, "ALTER TABLE target_documents ADD COLUMN sequence_number INTEGER"

    .line 187
    .line 188
    invoke-virtual {v2, v4}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    :cond_8
    const/4 v4, 0x6

    .line 192
    if-ge v0, v4, :cond_b

    .line 193
    .line 194
    new-instance v4, Lr9/M;

    .line 195
    .line 196
    invoke-direct {v4, v1, v9}, Lr9/M;-><init>(Lr9/N;I)V

    .line 197
    .line 198
    .line 199
    const-string v5, "SELECT uid, last_acknowledged_batch_id FROM mutation_queues"

    .line 200
    .line 201
    invoke-virtual {v2, v5, v3}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    .line 202
    .line 203
    .line 204
    move-result-object v5

    .line 205
    :goto_1
    :try_start_0
    invoke-interface {v5}, Landroid/database/Cursor;->moveToNext()Z

    .line 206
    .line 207
    .line 208
    move-result v10

    .line 209
    if-eqz v10, :cond_9

    .line 210
    .line 211
    invoke-virtual {v4, v5}, Lr9/M;->accept(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 212
    .line 213
    .line 214
    goto :goto_1

    .line 215
    :catchall_0
    move-exception v0

    .line 216
    move-object v2, v0

    .line 217
    goto :goto_2

    .line 218
    :cond_9
    invoke-interface {v5}, Landroid/database/Cursor;->close()V

    .line 219
    .line 220
    .line 221
    goto :goto_4

    .line 222
    :goto_2
    if-eqz v5, :cond_a

    .line 223
    .line 224
    :try_start_1
    invoke-interface {v5}, Landroid/database/Cursor;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 225
    .line 226
    .line 227
    goto :goto_3

    .line 228
    :catchall_1
    move-exception v0

    .line 229
    invoke-virtual {v2, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 230
    .line 231
    .line 232
    :cond_a
    :goto_3
    throw v2

    .line 233
    :cond_b
    :goto_4
    const/4 v5, 0x7

    .line 234
    if-ge v0, v5, :cond_13

    .line 235
    .line 236
    const-string v5, "SELECT highest_listen_sequence_number FROM target_globals LIMIT 1"

    .line 237
    .line 238
    invoke-virtual {v2, v5, v3}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    .line 239
    .line 240
    .line 241
    move-result-object v5

    .line 242
    :try_start_2
    invoke-interface {v5}, Landroid/database/Cursor;->moveToFirst()Z

    .line 243
    .line 244
    .line 245
    move-result v10

    .line 246
    if-eqz v10, :cond_c

    .line 247
    .line 248
    const/4 v10, 0x0

    .line 249
    invoke-interface {v5, v10}, Landroid/database/Cursor;->getLong(I)J

    .line 250
    .line 251
    .line 252
    move-result-wide v13

    .line 253
    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 254
    .line 255
    .line 256
    move-result-object v10
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    .line 257
    invoke-interface {v5}, Landroid/database/Cursor;->close()V

    .line 258
    .line 259
    .line 260
    goto :goto_6

    .line 261
    :goto_5
    move-object v2, v0

    .line 262
    goto/16 :goto_e

    .line 263
    .line 264
    :cond_c
    invoke-interface {v5}, Landroid/database/Cursor;->close()V

    .line 265
    .line 266
    .line 267
    move-object v10, v3

    .line 268
    :goto_6
    if-eqz v10, :cond_d

    .line 269
    .line 270
    const/4 v5, 0x1

    .line 271
    goto :goto_7

    .line 272
    :cond_d
    const/4 v5, 0x0

    .line 273
    :goto_7
    const-string v13, "Missing highest sequence number"

    .line 274
    .line 275
    const/4 v14, 0x0

    .line 276
    new-array v15, v14, [Ljava/lang/Object;

    .line 277
    .line 278
    invoke-static {v5, v13, v15}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 279
    .line 280
    .line 281
    const/16 v13, 0x64

    .line 282
    .line 283
    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    .line 284
    .line 285
    .line 286
    move-result-wide v4

    .line 287
    const-string v10, "INSERT INTO target_documents (target_id, path, sequence_number) VALUES (0, ?, ?)"

    .line 288
    .line 289
    invoke-virtual {v2, v10}, Landroid/database/sqlite/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;

    .line 290
    .line 291
    .line 292
    move-result-object v10

    .line 293
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 294
    .line 295
    .line 296
    move-result-object v15

    .line 297
    move/from16 v18, v13

    .line 298
    .line 299
    const/4 v13, 0x1

    .line 300
    new-array v7, v13, [Ljava/lang/Object;

    .line 301
    .line 302
    aput-object v15, v7, v14

    .line 303
    .line 304
    new-instance v15, Ljb/c;

    .line 305
    .line 306
    invoke-direct {v15, v7, v9}, Ljb/c;-><init>(Ljava/lang/Object;I)V

    .line 307
    .line 308
    .line 309
    :goto_8
    new-array v7, v13, [Z

    .line 310
    .line 311
    aput-boolean v14, v7, v14

    .line 312
    .line 313
    const-string v6, "SELECT RD.path FROM remote_documents AS RD WHERE NOT EXISTS (SELECT TD.path FROM target_documents AS TD WHERE RD.path = TD.path AND TD.target_id = 0) LIMIT ?"

    .line 314
    .line 315
    invoke-virtual {v2, v15, v6, v3, v3}, Landroid/database/sqlite/SQLiteDatabase;->rawQueryWithFactory(Landroid/database/sqlite/SQLiteDatabase$CursorFactory;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 316
    .line 317
    .line 318
    move-result-object v6

    .line 319
    :goto_9
    :try_start_3
    invoke-interface {v6}, Landroid/database/Cursor;->moveToNext()Z

    .line 320
    .line 321
    .line 322
    move-result v16

    .line 323
    if-eqz v16, :cond_f

    .line 324
    .line 325
    aput-boolean v13, v7, v14

    .line 326
    .line 327
    invoke-virtual {v10}, Landroid/database/sqlite/SQLiteProgram;->clearBindings()V

    .line 328
    .line 329
    .line 330
    invoke-interface {v6, v14}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 331
    .line 332
    .line 333
    move-result-object v3

    .line 334
    invoke-virtual {v10, v13, v3}, Landroid/database/sqlite/SQLiteProgram;->bindString(ILjava/lang/String;)V

    .line 335
    .line 336
    .line 337
    invoke-virtual {v10, v9, v4, v5}, Landroid/database/sqlite/SQLiteProgram;->bindLong(IJ)V

    .line 338
    .line 339
    .line 340
    invoke-virtual {v10}, Landroid/database/sqlite/SQLiteStatement;->executeInsert()J

    .line 341
    .line 342
    .line 343
    move-result-wide v13

    .line 344
    const-wide/16 v21, -0x1

    .line 345
    .line 346
    cmp-long v3, v13, v21

    .line 347
    .line 348
    if-eqz v3, :cond_e

    .line 349
    .line 350
    const/4 v3, 0x1

    .line 351
    goto :goto_a

    .line 352
    :cond_e
    const/4 v3, 0x0

    .line 353
    :goto_a
    const-string v13, "Failed to insert a sentinel row"

    .line 354
    .line 355
    const/4 v14, 0x0

    .line 356
    new-array v9, v14, [Ljava/lang/Object;

    .line 357
    .line 358
    invoke-static {v3, v13, v9}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 359
    .line 360
    .line 361
    const/4 v3, 0x0

    .line 362
    const/4 v9, 0x2

    .line 363
    const/4 v13, 0x1

    .line 364
    const/4 v14, 0x0

    .line 365
    goto :goto_9

    .line 366
    :goto_b
    move-object v2, v0

    .line 367
    goto :goto_c

    .line 368
    :cond_f
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 369
    .line 370
    .line 371
    const/16 v16, 0x0

    .line 372
    .line 373
    aget-boolean v3, v7, v16

    .line 374
    .line 375
    if-nez v3, :cond_10

    .line 376
    .line 377
    const/16 v3, 0x8

    .line 378
    .line 379
    goto :goto_10

    .line 380
    :cond_10
    const/4 v3, 0x0

    .line 381
    const/16 v6, 0x8

    .line 382
    .line 383
    const/4 v9, 0x2

    .line 384
    const/4 v13, 0x1

    .line 385
    const/4 v14, 0x0

    .line 386
    goto :goto_8

    .line 387
    :catchall_2
    move-exception v0

    .line 388
    goto :goto_b

    .line 389
    :goto_c
    if-eqz v6, :cond_11

    .line 390
    .line 391
    :try_start_4
    invoke-interface {v6}, Landroid/database/Cursor;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 392
    .line 393
    .line 394
    goto :goto_d

    .line 395
    :catchall_3
    move-exception v0

    .line 396
    invoke-virtual {v2, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 397
    .line 398
    .line 399
    :cond_11
    :goto_d
    throw v2

    .line 400
    :catchall_4
    move-exception v0

    .line 401
    goto/16 :goto_5

    .line 402
    .line 403
    :goto_e
    if-eqz v5, :cond_12

    .line 404
    .line 405
    :try_start_5
    invoke-interface {v5}, Landroid/database/Cursor;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 406
    .line 407
    .line 408
    goto :goto_f

    .line 409
    :catchall_5
    move-exception v0

    .line 410
    invoke-virtual {v2, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 411
    .line 412
    .line 413
    :cond_12
    :goto_f
    throw v2

    .line 414
    :cond_13
    const/16 v18, 0x64

    .line 415
    .line 416
    move v3, v6

    .line 417
    :goto_10
    if-ge v0, v3, :cond_1a

    .line 418
    .line 419
    const-string v3, "collection_parents"

    .line 420
    .line 421
    filled-new-array {v3}, [Ljava/lang/String;

    .line 422
    .line 423
    .line 424
    move-result-object v3

    .line 425
    new-instance v4, Lr9/L;

    .line 426
    .line 427
    const/4 v14, 0x0

    .line 428
    invoke-direct {v4, v1, v14}, Lr9/L;-><init>(Lr9/N;I)V

    .line 429
    .line 430
    .line 431
    invoke-virtual {v1, v3, v4}, Lr9/N;->b([Ljava/lang/String;Ljava/lang/Runnable;)V

    .line 432
    .line 433
    .line 434
    new-instance v3, Lad/L;

    .line 435
    .line 436
    const/16 v4, 0x18

    .line 437
    .line 438
    invoke-direct {v3, v4}, Lad/L;-><init>(I)V

    .line 439
    .line 440
    .line 441
    const-string v4, "INSERT OR REPLACE INTO collection_parents (collection_id, parent) VALUES (?, ?)"

    .line 442
    .line 443
    invoke-virtual {v2, v4}, Landroid/database/sqlite/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;

    .line 444
    .line 445
    .line 446
    move-result-object v4

    .line 447
    const-string v5, "SELECT path FROM remote_documents"

    .line 448
    .line 449
    const/4 v6, 0x0

    .line 450
    invoke-virtual {v2, v5, v6}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    .line 451
    .line 452
    .line 453
    move-result-object v5

    .line 454
    :cond_14
    :goto_11
    :try_start_6
    invoke-interface {v5}, Landroid/database/Cursor;->moveToNext()Z

    .line 455
    .line 456
    .line 457
    move-result v6

    .line 458
    if-eqz v6, :cond_15

    .line 459
    .line 460
    const/4 v14, 0x0

    .line 461
    invoke-interface {v5, v14}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 462
    .line 463
    .line 464
    move-result-object v6

    .line 465
    invoke-static {v6}, Lka/e0;->l(Ljava/lang/String;)Ls9/m;

    .line 466
    .line 467
    .line 468
    move-result-object v6

    .line 469
    invoke-virtual {v6}, Ls9/e;->k()Ls9/e;

    .line 470
    .line 471
    .line 472
    move-result-object v6

    .line 473
    check-cast v6, Ls9/m;

    .line 474
    .line 475
    invoke-virtual {v3, v6}, Lad/L;->e(Ls9/m;)Z

    .line 476
    .line 477
    .line 478
    move-result v7

    .line 479
    if-eqz v7, :cond_14

    .line 480
    .line 481
    invoke-virtual {v6}, Ls9/e;->f()Ljava/lang/String;

    .line 482
    .line 483
    .line 484
    move-result-object v7

    .line 485
    invoke-virtual {v6}, Ls9/e;->k()Ls9/e;

    .line 486
    .line 487
    .line 488
    move-result-object v6

    .line 489
    check-cast v6, Ls9/m;

    .line 490
    .line 491
    invoke-virtual {v4}, Landroid/database/sqlite/SQLiteProgram;->clearBindings()V

    .line 492
    .line 493
    .line 494
    const/4 v13, 0x1

    .line 495
    invoke-virtual {v4, v13, v7}, Landroid/database/sqlite/SQLiteProgram;->bindString(ILjava/lang/String;)V

    .line 496
    .line 497
    .line 498
    invoke-static {v6}, Lka/e0;->n(Ls9/e;)Ljava/lang/String;

    .line 499
    .line 500
    .line 501
    move-result-object v6

    .line 502
    const/4 v7, 0x2

    .line 503
    invoke-virtual {v4, v7, v6}, Landroid/database/sqlite/SQLiteProgram;->bindString(ILjava/lang/String;)V

    .line 504
    .line 505
    .line 506
    invoke-virtual {v4}, Landroid/database/sqlite/SQLiteStatement;->execute()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_8

    .line 507
    .line 508
    .line 509
    goto :goto_11

    .line 510
    :goto_12
    move-object v2, v0

    .line 511
    goto :goto_17

    .line 512
    :cond_15
    invoke-interface {v5}, Landroid/database/Cursor;->close()V

    .line 513
    .line 514
    .line 515
    const-string v5, "SELECT path FROM document_mutations"

    .line 516
    .line 517
    const/4 v6, 0x0

    .line 518
    invoke-virtual {v2, v5, v6}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    .line 519
    .line 520
    .line 521
    move-result-object v5

    .line 522
    :cond_16
    :goto_13
    :try_start_7
    invoke-interface {v5}, Landroid/database/Cursor;->moveToNext()Z

    .line 523
    .line 524
    .line 525
    move-result v6

    .line 526
    if-eqz v6, :cond_17

    .line 527
    .line 528
    const/4 v14, 0x0

    .line 529
    invoke-interface {v5, v14}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 530
    .line 531
    .line 532
    move-result-object v6

    .line 533
    invoke-static {v6}, Lka/e0;->l(Ljava/lang/String;)Ls9/m;

    .line 534
    .line 535
    .line 536
    move-result-object v6

    .line 537
    invoke-virtual {v6}, Ls9/e;->k()Ls9/e;

    .line 538
    .line 539
    .line 540
    move-result-object v6

    .line 541
    check-cast v6, Ls9/m;

    .line 542
    .line 543
    invoke-virtual {v3, v6}, Lad/L;->e(Ls9/m;)Z

    .line 544
    .line 545
    .line 546
    move-result v7

    .line 547
    if-eqz v7, :cond_16

    .line 548
    .line 549
    invoke-virtual {v6}, Ls9/e;->f()Ljava/lang/String;

    .line 550
    .line 551
    .line 552
    move-result-object v7

    .line 553
    invoke-virtual {v6}, Ls9/e;->k()Ls9/e;

    .line 554
    .line 555
    .line 556
    move-result-object v6

    .line 557
    check-cast v6, Ls9/m;

    .line 558
    .line 559
    invoke-virtual {v4}, Landroid/database/sqlite/SQLiteProgram;->clearBindings()V

    .line 560
    .line 561
    .line 562
    const/4 v13, 0x1

    .line 563
    invoke-virtual {v4, v13, v7}, Landroid/database/sqlite/SQLiteProgram;->bindString(ILjava/lang/String;)V

    .line 564
    .line 565
    .line 566
    invoke-static {v6}, Lka/e0;->n(Ls9/e;)Ljava/lang/String;

    .line 567
    .line 568
    .line 569
    move-result-object v6

    .line 570
    const/4 v7, 0x2

    .line 571
    invoke-virtual {v4, v7, v6}, Landroid/database/sqlite/SQLiteProgram;->bindString(ILjava/lang/String;)V

    .line 572
    .line 573
    .line 574
    invoke-virtual {v4}, Landroid/database/sqlite/SQLiteStatement;->execute()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    .line 575
    .line 576
    .line 577
    goto :goto_13

    .line 578
    :goto_14
    move-object v2, v0

    .line 579
    goto :goto_15

    .line 580
    :cond_17
    invoke-interface {v5}, Landroid/database/Cursor;->close()V

    .line 581
    .line 582
    .line 583
    goto :goto_19

    .line 584
    :catchall_6
    move-exception v0

    .line 585
    goto :goto_14

    .line 586
    :goto_15
    if-eqz v5, :cond_18

    .line 587
    .line 588
    :try_start_8
    invoke-interface {v5}, Landroid/database/Cursor;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_7

    .line 589
    .line 590
    .line 591
    goto :goto_16

    .line 592
    :catchall_7
    move-exception v0

    .line 593
    invoke-virtual {v2, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 594
    .line 595
    .line 596
    :cond_18
    :goto_16
    throw v2

    .line 597
    :catchall_8
    move-exception v0

    .line 598
    goto :goto_12

    .line 599
    :goto_17
    if-eqz v5, :cond_19

    .line 600
    .line 601
    :try_start_9
    invoke-interface {v5}, Landroid/database/Cursor;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_9

    .line 602
    .line 603
    .line 604
    goto :goto_18

    .line 605
    :catchall_9
    move-exception v0

    .line 606
    invoke-virtual {v2, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 607
    .line 608
    .line 609
    :cond_19
    :goto_18
    throw v2

    .line 610
    :cond_1a
    :goto_19
    const/16 v3, 0x9

    .line 611
    .line 612
    if-ge v0, v3, :cond_1d

    .line 613
    .line 614
    const-string v4, "read_time_seconds"

    .line 615
    .line 616
    invoke-virtual {v1, v8, v4}, Lr9/N;->d(Ljava/lang/String;Ljava/lang/String;)Z

    .line 617
    .line 618
    .line 619
    move-result v4

    .line 620
    const-string v5, "read_time_nanos"

    .line 621
    .line 622
    invoke-virtual {v1, v8, v5}, Lr9/N;->d(Ljava/lang/String;Ljava/lang/String;)Z

    .line 623
    .line 624
    .line 625
    move-result v5

    .line 626
    if-ne v4, v5, :cond_1b

    .line 627
    .line 628
    const/4 v6, 0x1

    .line 629
    goto :goto_1a

    .line 630
    :cond_1b
    const/4 v6, 0x0

    .line 631
    :goto_1a
    const-string v7, "Table contained just one of read_time_seconds or read_time_nanos"

    .line 632
    .line 633
    const/4 v14, 0x0

    .line 634
    new-array v9, v14, [Ljava/lang/Object;

    .line 635
    .line 636
    invoke-static {v6, v7, v9}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 637
    .line 638
    .line 639
    if-eqz v4, :cond_1c

    .line 640
    .line 641
    if-eqz v5, :cond_1c

    .line 642
    .line 643
    invoke-virtual {v1}, Lr9/N;->a()V

    .line 644
    .line 645
    .line 646
    goto :goto_1b

    .line 647
    :cond_1c
    const-string v4, "ALTER TABLE remote_documents ADD COLUMN read_time_seconds INTEGER"

    .line 648
    .line 649
    invoke-virtual {v2, v4}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 650
    .line 651
    .line 652
    const-string v4, "ALTER TABLE remote_documents ADD COLUMN read_time_nanos INTEGER"

    .line 653
    .line 654
    invoke-virtual {v2, v4}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 655
    .line 656
    .line 657
    :cond_1d
    :goto_1b
    if-ne v0, v3, :cond_1e

    .line 658
    .line 659
    invoke-virtual {v1}, Lr9/N;->a()V

    .line 660
    .line 661
    .line 662
    :cond_1e
    const/16 v3, 0xb

    .line 663
    .line 664
    if-ge v0, v3, :cond_21

    .line 665
    .line 666
    new-instance v3, Lr9/M;

    .line 667
    .line 668
    const/4 v13, 0x1

    .line 669
    invoke-direct {v3, v1, v13}, Lr9/M;-><init>(Lr9/N;I)V

    .line 670
    .line 671
    .line 672
    const-string v4, "SELECT target_id, target_proto FROM targets"

    .line 673
    .line 674
    const/4 v6, 0x0

    .line 675
    invoke-virtual {v2, v4, v6}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    .line 676
    .line 677
    .line 678
    move-result-object v4

    .line 679
    :goto_1c
    :try_start_a
    invoke-interface {v4}, Landroid/database/Cursor;->moveToNext()Z

    .line 680
    .line 681
    .line 682
    move-result v5

    .line 683
    if-eqz v5, :cond_1f

    .line 684
    .line 685
    invoke-virtual {v3, v4}, Lr9/M;->accept(Ljava/lang/Object;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_a

    .line 686
    .line 687
    .line 688
    goto :goto_1c

    .line 689
    :catchall_a
    move-exception v0

    .line 690
    move-object v2, v0

    .line 691
    goto :goto_1d

    .line 692
    :cond_1f
    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    .line 693
    .line 694
    .line 695
    goto :goto_1f

    .line 696
    :goto_1d
    if-eqz v4, :cond_20

    .line 697
    .line 698
    :try_start_b
    invoke-interface {v4}, Landroid/database/Cursor;->close()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_b

    .line 699
    .line 700
    .line 701
    goto :goto_1e

    .line 702
    :catchall_b
    move-exception v0

    .line 703
    invoke-virtual {v2, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 704
    .line 705
    .line 706
    :cond_20
    :goto_1e
    throw v2

    .line 707
    :cond_21
    :goto_1f
    const/16 v3, 0xc

    .line 708
    .line 709
    if-ge v0, v3, :cond_22

    .line 710
    .line 711
    const-string v3, "bundles"

    .line 712
    .line 713
    const-string v4, "named_queries"

    .line 714
    .line 715
    filled-new-array {v3, v4}, [Ljava/lang/String;

    .line 716
    .line 717
    .line 718
    move-result-object v3

    .line 719
    new-instance v4, Lr9/L;

    .line 720
    .line 721
    const/4 v5, 0x6

    .line 722
    invoke-direct {v4, v1, v5}, Lr9/L;-><init>(Lr9/N;I)V

    .line 723
    .line 724
    .line 725
    invoke-virtual {v1, v3, v4}, Lr9/N;->b([Ljava/lang/String;Ljava/lang/Runnable;)V

    .line 726
    .line 727
    .line 728
    :cond_22
    const/16 v3, 0xd

    .line 729
    .line 730
    if-ge v0, v3, :cond_28

    .line 731
    .line 732
    const-string v3, "path_length"

    .line 733
    .line 734
    invoke-virtual {v1, v8, v3}, Lr9/N;->d(Ljava/lang/String;Ljava/lang/String;)Z

    .line 735
    .line 736
    .line 737
    move-result v3

    .line 738
    if-nez v3, :cond_23

    .line 739
    .line 740
    const-string v3, "ALTER TABLE remote_documents ADD COLUMN path_length INTEGER"

    .line 741
    .line 742
    invoke-virtual {v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 743
    .line 744
    .line 745
    :cond_23
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 746
    .line 747
    .line 748
    move-result-object v3

    .line 749
    const/4 v13, 0x1

    .line 750
    new-array v4, v13, [Ljava/lang/Object;

    .line 751
    .line 752
    const/4 v14, 0x0

    .line 753
    aput-object v3, v4, v14

    .line 754
    .line 755
    new-instance v3, Ljb/c;

    .line 756
    .line 757
    const/4 v7, 0x2

    .line 758
    invoke-direct {v3, v4, v7}, Ljb/c;-><init>(Ljava/lang/Object;I)V

    .line 759
    .line 760
    .line 761
    const-string v4, "UPDATE remote_documents SET path_length = ? WHERE path = ?"

    .line 762
    .line 763
    invoke-virtual {v2, v4}, Landroid/database/sqlite/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;

    .line 764
    .line 765
    .line 766
    move-result-object v4

    .line 767
    :goto_20
    new-array v5, v13, [Z

    .line 768
    .line 769
    aput-boolean v14, v5, v14

    .line 770
    .line 771
    const-string v6, "SELECT path FROM remote_documents WHERE path_length IS NULL LIMIT ?"

    .line 772
    .line 773
    const/4 v7, 0x0

    .line 774
    invoke-virtual {v2, v3, v6, v7, v7}, Landroid/database/sqlite/SQLiteDatabase;->rawQueryWithFactory(Landroid/database/sqlite/SQLiteDatabase$CursorFactory;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 775
    .line 776
    .line 777
    move-result-object v6

    .line 778
    :goto_21
    :try_start_c
    invoke-interface {v6}, Landroid/database/Cursor;->moveToNext()Z

    .line 779
    .line 780
    .line 781
    move-result v8

    .line 782
    if-eqz v8, :cond_25

    .line 783
    .line 784
    aput-boolean v13, v5, v14

    .line 785
    .line 786
    invoke-interface {v6, v14}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 787
    .line 788
    .line 789
    move-result-object v8

    .line 790
    invoke-static {v8}, Lka/e0;->l(Ljava/lang/String;)Ls9/m;

    .line 791
    .line 792
    .line 793
    move-result-object v9

    .line 794
    invoke-virtual {v4}, Landroid/database/sqlite/SQLiteProgram;->clearBindings()V

    .line 795
    .line 796
    .line 797
    iget-object v9, v9, Ls9/e;->a:Ljava/util/List;

    .line 798
    .line 799
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 800
    .line 801
    .line 802
    move-result v9

    .line 803
    int-to-long v9, v9

    .line 804
    const/4 v13, 0x1

    .line 805
    invoke-virtual {v4, v13, v9, v10}, Landroid/database/sqlite/SQLiteProgram;->bindLong(IJ)V

    .line 806
    .line 807
    .line 808
    const/4 v9, 0x2

    .line 809
    invoke-virtual {v4, v9, v8}, Landroid/database/sqlite/SQLiteProgram;->bindString(ILjava/lang/String;)V

    .line 810
    .line 811
    .line 812
    invoke-virtual {v4}, Landroid/database/sqlite/SQLiteStatement;->executeUpdateDelete()I

    .line 813
    .line 814
    .line 815
    move-result v8

    .line 816
    const/4 v9, -0x1

    .line 817
    if-eq v8, v9, :cond_24

    .line 818
    .line 819
    const/4 v8, 0x1

    .line 820
    goto :goto_22

    .line 821
    :cond_24
    const/4 v8, 0x0

    .line 822
    :goto_22
    const-string v9, "Failed to update document path"

    .line 823
    .line 824
    const/4 v14, 0x0

    .line 825
    new-array v10, v14, [Ljava/lang/Object;

    .line 826
    .line 827
    invoke-static {v8, v9, v10}, LA6/c;->z(ZLjava/lang/String;[Ljava/lang/Object;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_c

    .line 828
    .line 829
    .line 830
    const/4 v13, 0x1

    .line 831
    const/4 v14, 0x0

    .line 832
    goto :goto_21

    .line 833
    :goto_23
    move-object v2, v0

    .line 834
    goto :goto_24

    .line 835
    :cond_25
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 836
    .line 837
    .line 838
    const/16 v16, 0x0

    .line 839
    .line 840
    aget-boolean v5, v5, v16

    .line 841
    .line 842
    if-nez v5, :cond_26

    .line 843
    .line 844
    goto :goto_26

    .line 845
    :cond_26
    const/4 v13, 0x1

    .line 846
    const/4 v14, 0x0

    .line 847
    goto :goto_20

    .line 848
    :catchall_c
    move-exception v0

    .line 849
    goto :goto_23

    .line 850
    :goto_24
    if-eqz v6, :cond_27

    .line 851
    .line 852
    :try_start_d
    invoke-interface {v6}, Landroid/database/Cursor;->close()V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_d

    .line 853
    .line 854
    .line 855
    goto :goto_25

    .line 856
    :catchall_d
    move-exception v0

    .line 857
    invoke-virtual {v2, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 858
    .line 859
    .line 860
    :cond_27
    :goto_25
    throw v2

    .line 861
    :cond_28
    :goto_26
    const/16 v3, 0xe

    .line 862
    .line 863
    if-ge v0, v3, :cond_29

    .line 864
    .line 865
    const-string v3, "document_overlays"

    .line 866
    .line 867
    filled-new-array {v3}, [Ljava/lang/String;

    .line 868
    .line 869
    .line 870
    move-result-object v3

    .line 871
    new-instance v4, Lr9/L;

    .line 872
    .line 873
    const/4 v5, 0x7

    .line 874
    invoke-direct {v4, v1, v5}, Lr9/L;-><init>(Lr9/N;I)V

    .line 875
    .line 876
    .line 877
    invoke-virtual {v1, v3, v4}, Lr9/N;->b([Ljava/lang/String;Ljava/lang/Runnable;)V

    .line 878
    .line 879
    .line 880
    const-string v3, "data_migrations"

    .line 881
    .line 882
    filled-new-array {v3}, [Ljava/lang/String;

    .line 883
    .line 884
    .line 885
    move-result-object v3

    .line 886
    new-instance v4, Lr9/L;

    .line 887
    .line 888
    const/4 v5, 0x3

    .line 889
    invoke-direct {v4, v1, v5}, Lr9/L;-><init>(Lr9/N;I)V

    .line 890
    .line 891
    .line 892
    invoke-virtual {v1, v3, v4}, Lr9/N;->b([Ljava/lang/String;Ljava/lang/Runnable;)V

    .line 893
    .line 894
    .line 895
    const-string v3, "BUILD_OVERLAYS"

    .line 896
    .line 897
    filled-new-array {v3}, [Ljava/lang/String;

    .line 898
    .line 899
    .line 900
    move-result-object v3

    .line 901
    const-string v4, "INSERT OR IGNORE INTO data_migrations (migration_name) VALUES (?)"

    .line 902
    .line 903
    invoke-virtual {v2, v4, v3}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 904
    .line 905
    .line 906
    :cond_29
    const/16 v3, 0xf

    .line 907
    .line 908
    if-ge v0, v3, :cond_2a

    .line 909
    .line 910
    const-string v3, "UPDATE remote_documents SET read_time_seconds = 0, read_time_nanos = 0 WHERE read_time_seconds IS NULL"

    .line 911
    .line 912
    invoke-virtual {v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 913
    .line 914
    .line 915
    :cond_2a
    const/16 v2, 0x10

    .line 916
    .line 917
    if-ge v0, v2, :cond_2b

    .line 918
    .line 919
    const-string v2, "index_state"

    .line 920
    .line 921
    const-string v3, "index_entries"

    .line 922
    .line 923
    const-string v4, "index_configuration"

    .line 924
    .line 925
    filled-new-array {v4, v2, v3}, [Ljava/lang/String;

    .line 926
    .line 927
    .line 928
    move-result-object v2

    .line 929
    new-instance v3, Lr9/L;

    .line 930
    .line 931
    const/4 v13, 0x1

    .line 932
    invoke-direct {v3, v1, v13}, Lr9/L;-><init>(Lr9/N;I)V

    .line 933
    .line 934
    .line 935
    invoke-virtual {v1, v2, v3}, Lr9/N;->b([Ljava/lang/String;Ljava/lang/Runnable;)V

    .line 936
    .line 937
    .line 938
    :cond_2b
    const/16 v2, 0x11

    .line 939
    .line 940
    if-ge v0, v2, :cond_2c

    .line 941
    .line 942
    const-string v3, "globals"

    .line 943
    .line 944
    filled-new-array {v3}, [Ljava/lang/String;

    .line 945
    .line 946
    .line 947
    move-result-object v3

    .line 948
    new-instance v4, Lr9/L;

    .line 949
    .line 950
    const/4 v5, 0x4

    .line 951
    invoke-direct {v4, v1, v5}, Lr9/L;-><init>(Lr9/N;I)V

    .line 952
    .line 953
    .line 954
    invoke-virtual {v1, v3, v4}, Lr9/N;->b([Ljava/lang/String;Ljava/lang/Runnable;)V

    .line 955
    .line 956
    .line 957
    :cond_2c
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 958
    .line 959
    .line 960
    move-result-object v0

    .line 961
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 962
    .line 963
    .line 964
    move-result-object v2

    .line 965
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 966
    .line 967
    .line 968
    move-result-wide v3

    .line 969
    sub-long/2addr v3, v11

    .line 970
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 971
    .line 972
    .line 973
    move-result-object v3

    .line 974
    const/4 v5, 0x3

    .line 975
    new-array v4, v5, [Ljava/lang/Object;

    .line 976
    .line 977
    const/16 v16, 0x0

    .line 978
    .line 979
    aput-object v0, v4, v16

    .line 980
    .line 981
    const/4 v13, 0x1

    .line 982
    aput-object v2, v4, v13

    .line 983
    .line 984
    const/16 v21, 0x2

    .line 985
    .line 986
    aput-object v3, v4, v21

    .line 987
    .line 988
    const-string v0, "SQLiteSchema"

    .line 989
    .line 990
    const-string v2, "Migration from version %s to %s took %s milliseconds"

    .line 991
    .line 992
    invoke-static {v0, v2, v13, v4}, LBa/c;->p(Ljava/lang/String;Ljava/lang/String;I[Ljava/lang/Object;)V

    .line 993
    .line 994
    .line 995
    return-void
.end method

.method public final d(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 5

    .line 1
    const-string v0, "PRAGMA table_info("

    .line 2
    .line 3
    new-instance v1, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    :try_start_0
    iget-object v3, p0, Lr9/N;->a:Landroid/database/sqlite/SQLiteDatabase;

    .line 10
    .line 11
    new-instance v4, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string p1, ")"

    .line 20
    .line 21
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {v3, p1, v2}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    const-string p1, "name"

    .line 33
    .line 34
    invoke-interface {v2, p1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    :goto_0
    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_0

    .line 43
    .line 44
    invoke-interface {v2, p1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :catchall_0
    move-exception p1

    .line 53
    goto :goto_1

    .line 54
    :cond_0
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    const/4 p2, -0x1

    .line 62
    if-eq p1, p2, :cond_1

    .line 63
    .line 64
    const/4 p1, 0x1

    .line 65
    return p1

    .line 66
    :cond_1
    const/4 p1, 0x0

    .line 67
    return p1

    .line 68
    :goto_1
    if-eqz v2, :cond_2

    .line 69
    .line 70
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 71
    .line 72
    .line 73
    :cond_2
    throw p1
.end method

.method public final e(Ljava/lang/String;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    new-array v1, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    aput-object p1, v1, v2

    .line 6
    .line 7
    new-instance p1, Ljb/c;

    .line 8
    .line 9
    const/4 v2, 0x2

    .line 10
    invoke-direct {p1, v1, v2}, Ljb/c;-><init>(Ljava/lang/Object;I)V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lr9/N;->a:Landroid/database/sqlite/SQLiteDatabase;

    .line 14
    .line 15
    const-string v2, "SELECT 1=1 FROM sqlite_master WHERE tbl_name = ?"

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-virtual {v1, p1, v2, v3, v3}, Landroid/database/sqlite/SQLiteDatabase;->rawQueryWithFactory(Landroid/database/sqlite/SQLiteDatabase$CursorFactory;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    :try_start_0
    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    .line 23
    .line 24
    .line 25
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    xor-int/2addr v1, v0

    .line 27
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 28
    .line 29
    .line 30
    xor-int/lit8 p1, v1, 0x1

    .line 31
    .line 32
    return p1

    .line 33
    :catchall_0
    move-exception v0

    .line 34
    if-eqz p1, :cond_0

    .line 35
    .line 36
    :try_start_1
    invoke-interface {p1}, Landroid/database/Cursor;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :catchall_1
    move-exception p1

    .line 41
    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 42
    .line 43
    .line 44
    :cond_0
    :goto_0
    throw v0
.end method
