.class public final LA7/H;
.super LA7/Y;
.source "SourceFile"


# instance fields
.field public final c:LA7/m;

.field public d:Z


# direct methods
.method public constructor <init>(LA7/n0;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, LA7/Y;-><init>(LA7/n0;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, LA7/m;

    .line 5
    .line 6
    iget-object v0, p0, LA7/B0;->a:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, LA7/n0;

    .line 9
    .line 10
    iget-object v0, v0, LA7/n0;->a:Landroid/content/Context;

    .line 11
    .line 12
    invoke-direct {p1, p0, v0}, LA7/m;-><init>(LA7/H;Landroid/content/Context;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, LA7/H;->c:LA7/m;

    .line 16
    .line 17
    return-void
.end method

.method public static k0(Landroid/database/sqlite/SQLiteDatabase;)J
    .locals 11

    .line 1
    const/4 v1, 0x0

    .line 2
    :try_start_0
    const-string v3, "messages"

    .line 3
    .line 4
    const-string v0, "rowid"

    .line 5
    .line 6
    filled-new-array {v0}, [Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v4

    .line 10
    const-string v5, "type=?"

    .line 11
    .line 12
    const-string v0, "3"

    .line 13
    .line 14
    filled-new-array {v0}, [Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v6

    .line 18
    const-string v9, "rowid desc"

    .line 19
    .line 20
    const-string v10, "1"

    .line 21
    .line 22
    const/4 v7, 0x0

    .line 23
    const/4 v8, 0x0

    .line 24
    move-object v2, p0

    .line 25
    invoke-virtual/range {v2 .. v10}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    if-eqz p0, :cond_0

    .line 34
    .line 35
    const/4 p0, 0x0

    .line 36
    invoke-interface {v1, p0}, Landroid/database/Cursor;->getLong(I)J

    .line 37
    .line 38
    .line 39
    move-result-wide v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 41
    .line 42
    .line 43
    return-wide v2

    .line 44
    :catchall_0
    move-exception v0

    .line 45
    move-object p0, v0

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 48
    .line 49
    .line 50
    const-wide/16 v0, -0x1

    .line 51
    .line 52
    return-wide v0

    .line 53
    :goto_0
    if-eqz v1, :cond_1

    .line 54
    .line 55
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    .line 56
    .line 57
    .line 58
    :cond_1
    throw p0
.end method


# virtual methods
.method public final j0()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final l0(I[B)Z
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    invoke-virtual {v1}, LA7/B;->c0()V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, v1, LA7/H;->d:Z

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    new-instance v3, Landroid/content/ContentValues;

    .line 13
    .line 14
    invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const-string v4, "type"

    .line 22
    .line 23
    invoke-virtual {v3, v4, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 24
    .line 25
    .line 26
    const-string v0, "entry"

    .line 27
    .line 28
    move-object/from16 v4, p2

    .line 29
    .line 30
    invoke-virtual {v3, v0, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    .line 31
    .line 32
    .line 33
    const/4 v4, 0x5

    .line 34
    move v5, v2

    .line 35
    move v6, v4

    .line 36
    :goto_0
    if-ge v5, v4, :cond_d

    .line 37
    .line 38
    const/4 v7, 0x1

    .line 39
    const/4 v8, 0x0

    .line 40
    :try_start_0
    invoke-virtual {v1}, LA7/H;->o0()Landroid/database/sqlite/SQLiteDatabase;

    .line 41
    .line 42
    .line 43
    move-result-object v9
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_0 .. :try_end_0} :catch_11
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_0 .. :try_end_0} :catch_10
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_f
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 44
    if-nez v9, :cond_2

    .line 45
    .line 46
    :try_start_1
    iput-boolean v7, v1, LA7/H;->d:Z
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 47
    .line 48
    if-eqz v9, :cond_1

    .line 49
    .line 50
    invoke-virtual {v9}, Landroid/database/sqlite/SQLiteClosable;->close()V

    .line 51
    .line 52
    .line 53
    :cond_1
    :goto_1
    return v2

    .line 54
    :catchall_0
    move-exception v0

    .line 55
    goto/16 :goto_f

    .line 56
    .line 57
    :catch_0
    move-exception v0

    .line 58
    move/from16 v16, v2

    .line 59
    .line 60
    move/from16 p2, v7

    .line 61
    .line 62
    move-object v10, v8

    .line 63
    :goto_2
    move-object v8, v9

    .line 64
    goto/16 :goto_a

    .line 65
    .line 66
    :catch_1
    move/from16 v16, v2

    .line 67
    .line 68
    goto/16 :goto_c

    .line 69
    .line 70
    :catch_2
    move-exception v0

    .line 71
    move/from16 v16, v2

    .line 72
    .line 73
    goto/16 :goto_d

    .line 74
    .line 75
    :cond_2
    :try_start_2
    invoke-virtual {v9}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 76
    .line 77
    .line 78
    const-string v0, "select count(1) from messages"

    .line 79
    .line 80
    invoke-virtual {v9, v0, v8}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    .line 81
    .line 82
    .line 83
    move-result-object v10
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_2 .. :try_end_2} :catch_e
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 84
    if-eqz v10, :cond_3

    .line 85
    .line 86
    :try_start_3
    invoke-interface {v10}, Landroid/database/Cursor;->moveToFirst()Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-eqz v0, :cond_3

    .line 91
    .line 92
    invoke-interface {v10, v2}, Landroid/database/Cursor;->getLong(I)J

    .line 93
    .line 94
    .line 95
    move-result-wide v11
    :try_end_3
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_3 .. :try_end_3} :catch_5
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_3 .. :try_end_3} :catch_4
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 96
    goto :goto_6

    .line 97
    :catchall_1
    move-exception v0

    .line 98
    :goto_3
    move-object v8, v10

    .line 99
    goto/16 :goto_f

    .line 100
    .line 101
    :catch_3
    move-exception v0

    .line 102
    move/from16 v16, v2

    .line 103
    .line 104
    :goto_4
    move/from16 p2, v7

    .line 105
    .line 106
    goto :goto_2

    .line 107
    :catch_4
    move/from16 v16, v2

    .line 108
    .line 109
    goto/16 :goto_9

    .line 110
    .line 111
    :catch_5
    move-exception v0

    .line 112
    move/from16 v16, v2

    .line 113
    .line 114
    :goto_5
    move-object v8, v10

    .line 115
    goto/16 :goto_d

    .line 116
    .line 117
    :cond_3
    const-wide/16 v11, 0x0

    .line 118
    .line 119
    :goto_6
    const-wide/32 v13, 0x186a0

    .line 120
    .line 121
    .line 122
    cmp-long v0, v11, v13

    .line 123
    .line 124
    const-string v13, "messages"

    .line 125
    .line 126
    if-ltz v0, :cond_4

    .line 127
    .line 128
    :try_start_4
    invoke-virtual {v1}, LA7/B0;->zzj()LA7/N;

    .line 129
    .line 130
    .line 131
    move-result-object v0
    :try_end_4
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_4 .. :try_end_4} :catch_c
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_4 .. :try_end_4} :catch_4
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_4 .. :try_end_4} :catch_3
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 132
    :try_start_5
    iget-object v0, v0, LA7/N;->f:LA7/P;
    :try_end_5
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_5 .. :try_end_5} :catch_b
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_5 .. :try_end_5} :catch_4
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_5 .. :try_end_5} :catch_a
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 133
    .line 134
    :try_start_6
    const-string v14, "Data loss, local db full"

    .line 135
    .line 136
    invoke-virtual {v0, v14}, LA7/P;->c(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    const-wide/32 v14, 0x186a1

    .line 140
    .line 141
    .line 142
    sub-long/2addr v14, v11

    .line 143
    const-string v0, "rowid in (select rowid from messages order by rowid asc limit ?)"

    .line 144
    .line 145
    invoke-static {v14, v15}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v11

    .line 149
    filled-new-array {v11}, [Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v11

    .line 153
    invoke-virtual {v9, v13, v0, v11}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 154
    .line 155
    .line 156
    move-result v0

    .line 157
    int-to-long v11, v0

    .line 158
    cmp-long v0, v11, v14

    .line 159
    .line 160
    if-eqz v0, :cond_4

    .line 161
    .line 162
    invoke-virtual {v1}, LA7/B0;->zzj()LA7/N;

    .line 163
    .line 164
    .line 165
    move-result-object v0
    :try_end_6
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_6 .. :try_end_6} :catch_c
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_6 .. :try_end_6} :catch_4
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_6 .. :try_end_6} :catch_3
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 166
    :try_start_7
    iget-object v0, v0, LA7/N;->f:LA7/P;
    :try_end_7
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_7 .. :try_end_7} :catch_b
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_7 .. :try_end_7} :catch_4
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_7 .. :try_end_7} :catch_a
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 167
    .line 168
    move/from16 v16, v2

    .line 169
    .line 170
    :try_start_8
    const-string v2, "Different delete count than expected in local db. expected, received, difference"

    .line 171
    .line 172
    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 173
    .line 174
    .line 175
    move-result-object v4
    :try_end_8
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_8 .. :try_end_8} :catch_9
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_8 .. :try_end_8} :catch_d
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_8 .. :try_end_8} :catch_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 176
    move/from16 p2, v7

    .line 177
    .line 178
    :try_start_9
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 179
    .line 180
    .line 181
    move-result-object v7

    .line 182
    sub-long/2addr v14, v11

    .line 183
    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 184
    .line 185
    .line 186
    move-result-object v11

    .line 187
    invoke-virtual {v0, v4, v7, v11, v2}, LA7/P;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    goto :goto_8

    .line 191
    :catch_6
    move-exception v0

    .line 192
    goto/16 :goto_2

    .line 193
    .line 194
    :catch_7
    move-exception v0

    .line 195
    goto :goto_5

    .line 196
    :catch_8
    move-exception v0

    .line 197
    goto :goto_4

    .line 198
    :catch_9
    move-exception v0

    .line 199
    :goto_7
    move/from16 p2, v7

    .line 200
    .line 201
    goto :goto_5

    .line 202
    :catch_a
    move-exception v0

    .line 203
    move/from16 v16, v2

    .line 204
    .line 205
    goto :goto_4

    .line 206
    :catch_b
    move-exception v0

    .line 207
    move/from16 v16, v2

    .line 208
    .line 209
    goto :goto_7

    .line 210
    :catch_c
    move-exception v0

    .line 211
    move/from16 v16, v2

    .line 212
    .line 213
    goto :goto_7

    .line 214
    :cond_4
    move/from16 v16, v2

    .line 215
    .line 216
    move/from16 p2, v7

    .line 217
    .line 218
    :goto_8
    invoke-virtual {v9, v13, v8, v3}, Landroid/database/sqlite/SQLiteDatabase;->insertOrThrow(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    .line 219
    .line 220
    .line 221
    invoke-virtual {v9}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V

    .line 222
    .line 223
    .line 224
    invoke-virtual {v9}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V
    :try_end_9
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_9 .. :try_end_9} :catch_7
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_9 .. :try_end_9} :catch_d
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_9 .. :try_end_9} :catch_6
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 225
    .line 226
    .line 227
    if-eqz v10, :cond_5

    .line 228
    .line 229
    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    .line 230
    .line 231
    .line 232
    :cond_5
    invoke-virtual {v9}, Landroid/database/sqlite/SQLiteClosable;->close()V

    .line 233
    .line 234
    .line 235
    return p2

    .line 236
    :catch_d
    :goto_9
    move-object v8, v10

    .line 237
    goto :goto_c

    .line 238
    :catch_e
    move-exception v0

    .line 239
    move/from16 v16, v2

    .line 240
    .line 241
    move/from16 p2, v7

    .line 242
    .line 243
    goto :goto_d

    .line 244
    :catchall_2
    move-exception v0

    .line 245
    move-object v9, v8

    .line 246
    goto/16 :goto_f

    .line 247
    .line 248
    :catch_f
    move-exception v0

    .line 249
    move/from16 v16, v2

    .line 250
    .line 251
    move/from16 p2, v7

    .line 252
    .line 253
    move-object v10, v8

    .line 254
    :goto_a
    if-eqz v8, :cond_6

    .line 255
    .line 256
    :try_start_a
    invoke-virtual {v8}, Landroid/database/sqlite/SQLiteDatabase;->inTransaction()Z

    .line 257
    .line 258
    .line 259
    move-result v2

    .line 260
    if-eqz v2, :cond_6

    .line 261
    .line 262
    invoke-virtual {v8}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 263
    .line 264
    .line 265
    goto :goto_b

    .line 266
    :catchall_3
    move-exception v0

    .line 267
    move-object v9, v8

    .line 268
    goto/16 :goto_3

    .line 269
    .line 270
    :cond_6
    :goto_b
    invoke-virtual {v1}, LA7/B0;->zzj()LA7/N;

    .line 271
    .line 272
    .line 273
    move-result-object v2

    .line 274
    iget-object v2, v2, LA7/N;->f:LA7/P;

    .line 275
    .line 276
    const-string v4, "Error writing entry to local database"

    .line 277
    .line 278
    invoke-virtual {v2, v4, v0}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 279
    .line 280
    .line 281
    move/from16 v2, p2

    .line 282
    .line 283
    iput-boolean v2, v1, LA7/H;->d:Z
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    .line 284
    .line 285
    if-eqz v10, :cond_7

    .line 286
    .line 287
    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    .line 288
    .line 289
    .line 290
    :cond_7
    if-eqz v8, :cond_a

    .line 291
    .line 292
    invoke-virtual {v8}, Landroid/database/sqlite/SQLiteClosable;->close()V

    .line 293
    .line 294
    .line 295
    goto :goto_e

    .line 296
    :catch_10
    move/from16 v16, v2

    .line 297
    .line 298
    move-object v9, v8

    .line 299
    :goto_c
    int-to-long v10, v6

    .line 300
    :try_start_b
    invoke-static {v10, v11}, Landroid/os/SystemClock;->sleep(J)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    .line 301
    .line 302
    .line 303
    add-int/lit8 v6, v6, 0x14

    .line 304
    .line 305
    if-eqz v8, :cond_8

    .line 306
    .line 307
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 308
    .line 309
    .line 310
    :cond_8
    if-eqz v9, :cond_a

    .line 311
    .line 312
    invoke-virtual {v9}, Landroid/database/sqlite/SQLiteClosable;->close()V

    .line 313
    .line 314
    .line 315
    goto :goto_e

    .line 316
    :catch_11
    move-exception v0

    .line 317
    move/from16 v16, v2

    .line 318
    .line 319
    move-object v9, v8

    .line 320
    :goto_d
    :try_start_c
    invoke-virtual {v1}, LA7/B0;->zzj()LA7/N;

    .line 321
    .line 322
    .line 323
    move-result-object v2

    .line 324
    iget-object v2, v2, LA7/N;->f:LA7/P;

    .line 325
    .line 326
    const-string v4, "Error writing entry; local database full"

    .line 327
    .line 328
    invoke-virtual {v2, v4, v0}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 329
    .line 330
    .line 331
    const/4 v2, 0x1

    .line 332
    iput-boolean v2, v1, LA7/H;->d:Z
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    .line 333
    .line 334
    if-eqz v8, :cond_9

    .line 335
    .line 336
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 337
    .line 338
    .line 339
    :cond_9
    if-eqz v9, :cond_a

    .line 340
    .line 341
    invoke-virtual {v9}, Landroid/database/sqlite/SQLiteClosable;->close()V

    .line 342
    .line 343
    .line 344
    :cond_a
    :goto_e
    add-int/lit8 v5, v5, 0x1

    .line 345
    .line 346
    move/from16 v2, v16

    .line 347
    .line 348
    const/4 v4, 0x5

    .line 349
    goto/16 :goto_0

    .line 350
    .line 351
    :goto_f
    if-eqz v8, :cond_b

    .line 352
    .line 353
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    .line 354
    .line 355
    .line 356
    :cond_b
    if-eqz v9, :cond_c

    .line 357
    .line 358
    invoke-virtual {v9}, Landroid/database/sqlite/SQLiteClosable;->close()V

    .line 359
    .line 360
    .line 361
    :cond_c
    throw v0

    .line 362
    :cond_d
    move/from16 v16, v2

    .line 363
    .line 364
    invoke-virtual {v1}, LA7/B0;->zzj()LA7/N;

    .line 365
    .line 366
    .line 367
    move-result-object v0

    .line 368
    const-string v2, "Failed to write entry to local database"

    .line 369
    .line 370
    iget-object v0, v0, LA7/N;->n:LA7/P;

    .line 371
    .line 372
    invoke-virtual {v0, v2}, LA7/P;->c(Ljava/lang/String;)V

    .line 373
    .line 374
    .line 375
    return v16
.end method

.method public final m0()V
    .locals 3

    .line 1
    invoke-virtual {p0}, LA7/B;->c0()V

    .line 2
    .line 3
    .line 4
    :try_start_0
    invoke-virtual {p0}, LA7/H;->o0()Landroid/database/sqlite/SQLiteDatabase;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const-string v1, "messages"

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-virtual {v0, v1, v2, v2}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-lez v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    iget-object v1, v1, LA7/N;->n:LA7/P;

    .line 24
    .line 25
    const-string v2, "Reset local analytics data. records"

    .line 26
    .line 27
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {v1, v2, v0}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :catch_0
    move-exception v0

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    return-void

    .line 38
    :goto_0
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    const-string v2, "Error resetting local analytics data. error"

    .line 43
    .line 44
    iget-object v1, v1, LA7/N;->f:LA7/P;

    .line 45
    .line 46
    invoke-virtual {v1, v2, v0}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public final n0()Z
    .locals 10

    .line 1
    const-string v0, "Error deleting app launch break from local database"

    .line 2
    .line 3
    invoke-virtual {p0}, LA7/B;->c0()V

    .line 4
    .line 5
    .line 6
    iget-boolean v1, p0, LA7/H;->d:Z

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    iget-object v1, p0, LA7/B0;->a:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, LA7/n0;

    .line 15
    .line 16
    iget-object v1, v1, LA7/n0;->a:Landroid/content/Context;

    .line 17
    .line 18
    const-string v3, "google_app_measurement_local.db"

    .line 19
    .line 20
    invoke-virtual {v1, v3}, Landroid/content/Context;->getDatabasePath(Ljava/lang/String;)Ljava/io/File;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-nez v1, :cond_1

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    const/4 v1, 0x5

    .line 32
    move v4, v1

    .line 33
    move v3, v2

    .line 34
    :goto_0
    if-ge v3, v1, :cond_7

    .line 35
    .line 36
    const/4 v5, 0x1

    .line 37
    const/4 v6, 0x0

    .line 38
    :try_start_0
    invoke-virtual {p0}, LA7/H;->o0()Landroid/database/sqlite/SQLiteDatabase;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    if-nez v6, :cond_3

    .line 43
    .line 44
    iput-boolean v5, p0, LA7/H;->d:Z
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    .line 46
    if-eqz v6, :cond_2

    .line 47
    .line 48
    invoke-virtual {v6}, Landroid/database/sqlite/SQLiteClosable;->close()V

    .line 49
    .line 50
    .line 51
    :cond_2
    :goto_1
    return v2

    .line 52
    :catchall_0
    move-exception v0

    .line 53
    goto :goto_5

    .line 54
    :catch_0
    move-exception v7

    .line 55
    goto :goto_2

    .line 56
    :catch_1
    move-exception v7

    .line 57
    goto :goto_3

    .line 58
    :cond_3
    :try_start_1
    invoke-virtual {v6}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 59
    .line 60
    .line 61
    const-string v7, "messages"

    .line 62
    .line 63
    const-string v8, "type == ?"

    .line 64
    .line 65
    const/4 v9, 0x3

    .line 66
    invoke-static {v9}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v9

    .line 70
    filled-new-array {v9}, [Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v9

    .line 74
    invoke-virtual {v6, v7, v8, v9}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 75
    .line 76
    .line 77
    invoke-virtual {v6}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v6}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 81
    .line 82
    .line 83
    invoke-virtual {v6}, Landroid/database/sqlite/SQLiteClosable;->close()V

    .line 84
    .line 85
    .line 86
    return v5

    .line 87
    :goto_2
    if-eqz v6, :cond_4

    .line 88
    .line 89
    :try_start_2
    invoke-virtual {v6}, Landroid/database/sqlite/SQLiteDatabase;->inTransaction()Z

    .line 90
    .line 91
    .line 92
    move-result v8

    .line 93
    if-eqz v8, :cond_4

    .line 94
    .line 95
    invoke-virtual {v6}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 96
    .line 97
    .line 98
    :cond_4
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 99
    .line 100
    .line 101
    move-result-object v8

    .line 102
    iget-object v8, v8, LA7/N;->f:LA7/P;

    .line 103
    .line 104
    invoke-virtual {v8, v0, v7}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    iput-boolean v5, p0, LA7/H;->d:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 108
    .line 109
    if-eqz v6, :cond_5

    .line 110
    .line 111
    invoke-virtual {v6}, Landroid/database/sqlite/SQLiteClosable;->close()V

    .line 112
    .line 113
    .line 114
    goto :goto_4

    .line 115
    :catch_2
    int-to-long v7, v4

    .line 116
    :try_start_3
    invoke-static {v7, v8}, Landroid/os/SystemClock;->sleep(J)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 117
    .line 118
    .line 119
    add-int/lit8 v4, v4, 0x14

    .line 120
    .line 121
    if-eqz v6, :cond_5

    .line 122
    .line 123
    invoke-virtual {v6}, Landroid/database/sqlite/SQLiteClosable;->close()V

    .line 124
    .line 125
    .line 126
    goto :goto_4

    .line 127
    :goto_3
    :try_start_4
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 128
    .line 129
    .line 130
    move-result-object v8

    .line 131
    iget-object v8, v8, LA7/N;->f:LA7/P;

    .line 132
    .line 133
    invoke-virtual {v8, v0, v7}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    iput-boolean v5, p0, LA7/H;->d:Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 137
    .line 138
    if-eqz v6, :cond_5

    .line 139
    .line 140
    invoke-virtual {v6}, Landroid/database/sqlite/SQLiteClosable;->close()V

    .line 141
    .line 142
    .line 143
    :cond_5
    :goto_4
    add-int/lit8 v3, v3, 0x1

    .line 144
    .line 145
    goto :goto_0

    .line 146
    :goto_5
    if-eqz v6, :cond_6

    .line 147
    .line 148
    invoke-virtual {v6}, Landroid/database/sqlite/SQLiteClosable;->close()V

    .line 149
    .line 150
    .line 151
    :cond_6
    throw v0

    .line 152
    :cond_7
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    const-string v1, "Error deleting app launch break from local database in reasonable time"

    .line 157
    .line 158
    iget-object v0, v0, LA7/N;->i:LA7/P;

    .line 159
    .line 160
    invoke-virtual {v0, v1}, LA7/P;->c(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    return v2
.end method

.method public final o0()Landroid/database/sqlite/SQLiteDatabase;
    .locals 2

    .line 1
    iget-boolean v0, p0, LA7/H;->d:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    return-object v1

    .line 7
    :cond_0
    iget-object v0, p0, LA7/H;->c:LA7/m;

    .line 8
    .line 9
    invoke-virtual {v0}, LA7/m;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    iput-boolean v0, p0, LA7/H;->d:Z

    .line 17
    .line 18
    return-object v1

    .line 19
    :cond_1
    return-object v0
.end method
