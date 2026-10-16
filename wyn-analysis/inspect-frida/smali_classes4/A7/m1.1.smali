.class public final LA7/m1;
.super LA7/Y;
.source "SourceFile"


# instance fields
.field public final c:LA7/t1;

.field public d:LA7/F;

.field public volatile e:Ljava/lang/Boolean;

.field public final f:LA7/n1;

.field public final g:LA2/d;

.field public final h:Ljava/util/ArrayList;

.field public final i:LA7/n1;


# direct methods
.method public constructor <init>(LA7/n0;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, LA7/Y;-><init>(LA7/n0;)V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LA7/m1;->h:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v0, LA2/d;

    .line 12
    .line 13
    iget-object v1, p1, LA7/n0;->n:Ln7/b;

    .line 14
    .line 15
    invoke-direct {v0, v1}, LA2/d;-><init>(Ln7/b;)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, LA7/m1;->g:LA2/d;

    .line 19
    .line 20
    new-instance v0, LA7/t1;

    .line 21
    .line 22
    invoke-direct {v0, p0}, LA7/t1;-><init>(LA7/m1;)V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, LA7/m1;->c:LA7/t1;

    .line 26
    .line 27
    new-instance v0, LA7/n1;

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    invoke-direct {v0, p0, p1, v1}, LA7/n1;-><init>(LA7/m1;LA7/n0;I)V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, LA7/m1;->f:LA7/n1;

    .line 34
    .line 35
    new-instance v0, LA7/n1;

    .line 36
    .line 37
    const/4 v1, 0x1

    .line 38
    invoke-direct {v0, p0, p1, v1}, LA7/n1;-><init>(LA7/m1;LA7/n0;I)V

    .line 39
    .line 40
    .line 41
    iput-object v0, p0, LA7/m1;->i:LA7/n1;

    .line 42
    .line 43
    return-void
.end method


# virtual methods
.method public final j0()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final k0(LA7/d;)V
    .locals 7

    .line 1
    invoke-virtual {p0}, LA7/B;->c0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LA7/Y;->h0()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, LA7/B0;->a:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, LA7/n0;

    .line 10
    .line 11
    invoke-virtual {v0}, LA7/n0;->k()LA7/H;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, LA7/B0;->b0()LA7/U1;

    .line 16
    .line 17
    .line 18
    invoke-static {p1}, LA7/U1;->T0(Landroid/os/Parcelable;)[B

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    array-length v2, v1

    .line 23
    const/high16 v3, 0x20000

    .line 24
    .line 25
    if-le v2, v3, :cond_0

    .line 26
    .line 27
    invoke-virtual {v0}, LA7/B0;->zzj()LA7/N;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    const-string v1, "Conditional user property too long for local database. Sending directly to service"

    .line 32
    .line 33
    iget-object v0, v0, LA7/N;->g:LA7/P;

    .line 34
    .line 35
    invoke-virtual {v0, v1}, LA7/P;->c(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    const/4 v0, 0x0

    .line 39
    :goto_0
    move v4, v0

    .line 40
    goto :goto_1

    .line 41
    :cond_0
    const/4 v2, 0x2

    .line 42
    invoke-virtual {v0, v2, v1}, LA7/H;->l0(I[B)Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    goto :goto_0

    .line 47
    :goto_1
    new-instance v5, LA7/d;

    .line 48
    .line 49
    invoke-direct {v5, p1}, LA7/d;-><init>(LA7/d;)V

    .line 50
    .line 51
    .line 52
    const/4 v0, 0x1

    .line 53
    invoke-virtual {p0, v0}, LA7/m1;->w0(Z)LA7/N1;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    new-instance v1, LA7/p1;

    .line 58
    .line 59
    move-object v2, p0

    .line 60
    move-object v6, p1

    .line 61
    invoke-direct/range {v1 .. v6}, LA7/p1;-><init>(LA7/m1;LA7/N1;ZLA7/d;LA7/d;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0, v1}, LA7/m1;->m0(Ljava/lang/Runnable;)V

    .line 65
    .line 66
    .line 67
    return-void
.end method

.method public final l0(LA7/F;Lf7/a;LA7/N1;)V
    .locals 30

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    move-object/from16 v2, p2

    .line 4
    .line 5
    move-object/from16 v3, p3

    .line 6
    .line 7
    invoke-virtual/range {p0 .. p0}, LA7/B;->c0()V

    .line 8
    .line 9
    .line 10
    invoke-virtual/range {p0 .. p0}, LA7/Y;->h0()V

    .line 11
    .line 12
    .line 13
    const/16 v4, 0x64

    .line 14
    .line 15
    const/4 v5, 0x0

    .line 16
    move v0, v4

    .line 17
    move v6, v5

    .line 18
    :goto_0
    const/16 v7, 0x3e9

    .line 19
    .line 20
    if-ge v6, v7, :cond_20

    .line 21
    .line 22
    if-ne v0, v4, :cond_20

    .line 23
    .line 24
    new-instance v7, Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 27
    .line 28
    .line 29
    move-object/from16 v8, p0

    .line 30
    .line 31
    iget-object v0, v8, LA7/B0;->a:Ljava/lang/Object;

    .line 32
    .line 33
    move-object v9, v0

    .line 34
    check-cast v9, LA7/n0;

    .line 35
    .line 36
    invoke-virtual {v9}, LA7/n0;->k()LA7/H;

    .line 37
    .line 38
    .line 39
    move-result-object v10

    .line 40
    const-string v11, "Error reading entries from local database"

    .line 41
    .line 42
    invoke-virtual {v10}, LA7/B;->c0()V

    .line 43
    .line 44
    .line 45
    iget-boolean v0, v10, LA7/H;->d:Z

    .line 46
    .line 47
    if-eqz v0, :cond_1

    .line 48
    .line 49
    :cond_0
    :goto_1
    move/from16 v29, v4

    .line 50
    .line 51
    move/from16 v19, v6

    .line 52
    .line 53
    :goto_2
    const/4 v13, 0x0

    .line 54
    goto/16 :goto_24

    .line 55
    .line 56
    :cond_1
    new-instance v13, Ljava/util/ArrayList;

    .line 57
    .line 58
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 59
    .line 60
    .line 61
    iget-object v0, v10, LA7/B0;->a:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v0, LA7/n0;

    .line 64
    .line 65
    iget-object v0, v0, LA7/n0;->a:Landroid/content/Context;

    .line 66
    .line 67
    const-string v14, "google_app_measurement_local.db"

    .line 68
    .line 69
    invoke-virtual {v0, v14}, Landroid/content/Context;->getDatabasePath(Ljava/lang/String;)Ljava/io/File;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-nez v0, :cond_2

    .line 78
    .line 79
    move/from16 v29, v4

    .line 80
    .line 81
    move/from16 v19, v6

    .line 82
    .line 83
    goto/16 :goto_24

    .line 84
    .line 85
    :cond_2
    const/4 v14, 0x5

    .line 86
    move v15, v5

    .line 87
    move v12, v14

    .line 88
    :goto_3
    if-ge v15, v14, :cond_14

    .line 89
    .line 90
    const/4 v14, 0x1

    .line 91
    :try_start_0
    invoke-virtual {v10}, LA7/H;->o0()Landroid/database/sqlite/SQLiteDatabase;

    .line 92
    .line 93
    .line 94
    move-result-object v18
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_0 .. :try_end_0} :catch_23
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_0 .. :try_end_0} :catch_22
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_21
    .catchall {:try_start_0 .. :try_end_0} :catchall_8

    .line 95
    if-nez v18, :cond_3

    .line 96
    .line 97
    :try_start_1
    iput-boolean v14, v10, LA7/H;->d:Z
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 98
    .line 99
    if-eqz v18, :cond_0

    .line 100
    .line 101
    invoke-virtual/range {v18 .. v18}, Landroid/database/sqlite/SQLiteClosable;->close()V

    .line 102
    .line 103
    .line 104
    goto :goto_1

    .line 105
    :catchall_0
    move-exception v0

    .line 106
    move-object/from16 v14, v18

    .line 107
    .line 108
    const/4 v12, 0x0

    .line 109
    goto/16 :goto_23

    .line 110
    .line 111
    :catch_0
    move-exception v0

    .line 112
    move/from16 v29, v4

    .line 113
    .line 114
    :goto_4
    move/from16 v19, v6

    .line 115
    .line 116
    :goto_5
    const/4 v4, 0x0

    .line 117
    goto/16 :goto_1e

    .line 118
    .line 119
    :catch_1
    move/from16 v29, v4

    .line 120
    .line 121
    :catch_2
    move/from16 v19, v6

    .line 122
    .line 123
    move-object/from16 v14, v18

    .line 124
    .line 125
    goto/16 :goto_1d

    .line 126
    .line 127
    :catch_3
    move-exception v0

    .line 128
    move/from16 v29, v4

    .line 129
    .line 130
    :goto_6
    move/from16 v19, v6

    .line 131
    .line 132
    :goto_7
    const/4 v4, 0x0

    .line 133
    goto/16 :goto_21

    .line 134
    .line 135
    :cond_3
    :try_start_2
    invoke-virtual/range {v18 .. v18}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 136
    .line 137
    .line 138
    invoke-static/range {v18 .. v18}, LA7/H;->k0(Landroid/database/sqlite/SQLiteDatabase;)J

    .line 139
    .line 140
    .line 141
    move-result-wide v19
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_2 .. :try_end_2} :catch_20
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_1f
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 142
    const-wide/16 v27, -0x1

    .line 143
    .line 144
    cmp-long v0, v19, v27

    .line 145
    .line 146
    if-eqz v0, :cond_4

    .line 147
    .line 148
    :try_start_3
    const-string v0, "rowid<?"
    :try_end_3
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_3 .. :try_end_3} :catch_3
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 149
    .line 150
    move/from16 v29, v4

    .line 151
    .line 152
    :try_start_4
    new-array v4, v14, [Ljava/lang/String;

    .line 153
    .line 154
    invoke-static/range {v19 .. v20}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v19

    .line 158
    aput-object v19, v4, v5
    :try_end_4
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_4 .. :try_end_4} :catch_5
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_4 .. :try_end_4} :catch_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 159
    .line 160
    move-object/from16 v21, v0

    .line 161
    .line 162
    move-object/from16 v22, v4

    .line 163
    .line 164
    goto :goto_8

    .line 165
    :catch_4
    move-exception v0

    .line 166
    goto :goto_4

    .line 167
    :catch_5
    move-exception v0

    .line 168
    goto :goto_6

    .line 169
    :cond_4
    move/from16 v29, v4

    .line 170
    .line 171
    const/16 v21, 0x0

    .line 172
    .line 173
    const/16 v22, 0x0

    .line 174
    .line 175
    :goto_8
    :try_start_5
    const-string v19, "messages"

    .line 176
    .line 177
    const-string v0, "rowid"

    .line 178
    .line 179
    const-string v4, "type"

    .line 180
    .line 181
    const-string v14, "entry"

    .line 182
    .line 183
    filled-new-array {v0, v4, v14}, [Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v20

    .line 187
    const-string v25, "rowid asc"

    .line 188
    .line 189
    invoke-static/range {v29 .. v29}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v26

    .line 193
    const/16 v23, 0x0

    .line 194
    .line 195
    const/16 v24, 0x0

    .line 196
    .line 197
    invoke-virtual/range {v18 .. v26}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 198
    .line 199
    .line 200
    move-result-object v4
    :try_end_5
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_5 .. :try_end_5} :catch_1e
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_5 .. :try_end_5} :catch_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_5 .. :try_end_5} :catch_1d
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 201
    move-object/from16 v14, v18

    .line 202
    .line 203
    :goto_9
    :try_start_6
    invoke-interface {v4}, Landroid/database/Cursor;->moveToNext()Z

    .line 204
    .line 205
    .line 206
    move-result v0

    .line 207
    if-eqz v0, :cond_b

    .line 208
    .line 209
    invoke-interface {v4, v5}, Landroid/database/Cursor;->getLong(I)J

    .line 210
    .line 211
    .line 212
    move-result-wide v27
    :try_end_6
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_6 .. :try_end_6} :catch_1b
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_6 .. :try_end_6} :catch_1a
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_6 .. :try_end_6} :catch_19
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 213
    const/4 v5, 0x1

    .line 214
    :try_start_7
    invoke-interface {v4, v5}, Landroid/database/Cursor;->getInt(I)I

    .line 215
    .line 216
    .line 217
    move-result v0
    :try_end_7
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_7 .. :try_end_7} :catch_18
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_7 .. :try_end_7} :catch_17
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_7 .. :try_end_7} :catch_16
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 218
    const/4 v5, 0x2

    .line 219
    move/from16 v19, v6

    .line 220
    .line 221
    :try_start_8
    invoke-interface {v4, v5}, Landroid/database/Cursor;->getBlob(I)[B

    .line 222
    .line 223
    .line 224
    move-result-object v6
    :try_end_8
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_8 .. :try_end_8} :catch_15
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_8 .. :try_end_8} :catch_c
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_8 .. :try_end_8} :catch_14
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 225
    if-nez v0, :cond_6

    .line 226
    .line 227
    :try_start_9
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 228
    .line 229
    .line 230
    move-result-object v5
    :try_end_9
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_9 .. :try_end_9} :catch_d
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_9 .. :try_end_9} :catch_c
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_9 .. :try_end_9} :catch_b
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 231
    :try_start_a
    array-length v0, v6
    :try_end_a
    .catch Lf7/b; {:try_start_a .. :try_end_a} :catch_9
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    .line 232
    move-object/from16 v20, v4

    .line 233
    .line 234
    const/4 v4, 0x0

    .line 235
    :try_start_b
    invoke-virtual {v5, v6, v4, v0}, Landroid/os/Parcel;->unmarshall([BII)V

    .line 236
    .line 237
    .line 238
    invoke-virtual {v5, v4}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 239
    .line 240
    .line 241
    sget-object v0, LA7/x;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 242
    .line 243
    invoke-interface {v0, v5}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    check-cast v0, LA7/x;
    :try_end_b
    .catch Lf7/b; {:try_start_b .. :try_end_b} :catch_a
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    .line 248
    .line 249
    :try_start_c
    invoke-virtual {v5}, Landroid/os/Parcel;->recycle()V

    .line 250
    .line 251
    .line 252
    if-eqz v0, :cond_5

    .line 253
    .line 254
    invoke-virtual {v13, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_c
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_c .. :try_end_c} :catch_8
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_c .. :try_end_c} :catch_7
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_c .. :try_end_c} :catch_6
    .catchall {:try_start_c .. :try_end_c} :catchall_1

    .line 255
    .line 256
    .line 257
    goto :goto_e

    .line 258
    :catchall_1
    move-exception v0

    .line 259
    :goto_a
    move-object/from16 v12, v20

    .line 260
    .line 261
    goto/16 :goto_23

    .line 262
    .line 263
    :catch_6
    move-exception v0

    .line 264
    move-object/from16 v18, v14

    .line 265
    .line 266
    move-object/from16 v4, v20

    .line 267
    .line 268
    :goto_b
    const/4 v5, 0x0

    .line 269
    goto/16 :goto_1e

    .line 270
    .line 271
    :catch_7
    :goto_c
    const/4 v5, 0x0

    .line 272
    goto/16 :goto_1a

    .line 273
    .line 274
    :catch_8
    move-exception v0

    .line 275
    :goto_d
    move-object/from16 v18, v14

    .line 276
    .line 277
    move-object/from16 v4, v20

    .line 278
    .line 279
    goto/16 :goto_21

    .line 280
    .line 281
    :cond_5
    :goto_e
    const/4 v5, 0x0

    .line 282
    goto/16 :goto_16

    .line 283
    .line 284
    :catchall_2
    move-exception v0

    .line 285
    goto :goto_f

    .line 286
    :catchall_3
    move-exception v0

    .line 287
    move-object/from16 v20, v4

    .line 288
    .line 289
    goto :goto_f

    .line 290
    :catch_9
    move-object/from16 v20, v4

    .line 291
    .line 292
    :catch_a
    :try_start_d
    invoke-virtual {v10}, LA7/B0;->zzj()LA7/N;

    .line 293
    .line 294
    .line 295
    move-result-object v0

    .line 296
    iget-object v0, v0, LA7/N;->f:LA7/P;

    .line 297
    .line 298
    const-string v4, "Failed to load event from local database"

    .line 299
    .line 300
    invoke-virtual {v0, v4}, LA7/P;->c(Ljava/lang/String;)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_2

    .line 301
    .line 302
    .line 303
    :try_start_e
    invoke-virtual {v5}, Landroid/os/Parcel;->recycle()V

    .line 304
    .line 305
    .line 306
    goto :goto_e

    .line 307
    :goto_f
    invoke-virtual {v5}, Landroid/os/Parcel;->recycle()V

    .line 308
    .line 309
    .line 310
    throw v0

    .line 311
    :catchall_4
    move-exception v0

    .line 312
    move-object/from16 v20, v4

    .line 313
    .line 314
    goto :goto_a

    .line 315
    :catch_b
    move-exception v0

    .line 316
    move-object/from16 v20, v4

    .line 317
    .line 318
    move-object/from16 v18, v14

    .line 319
    .line 320
    goto :goto_b

    .line 321
    :catch_c
    move-object/from16 v20, v4

    .line 322
    .line 323
    goto :goto_c

    .line 324
    :catch_d
    move-exception v0

    .line 325
    move-object/from16 v20, v4

    .line 326
    .line 327
    :goto_10
    move-object/from16 v18, v14

    .line 328
    .line 329
    goto/16 :goto_21

    .line 330
    .line 331
    :cond_6
    move-object/from16 v20, v4

    .line 332
    .line 333
    const/4 v4, 0x1

    .line 334
    if-ne v0, v4, :cond_7

    .line 335
    .line 336
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 337
    .line 338
    .line 339
    move-result-object v4
    :try_end_e
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_e .. :try_end_e} :catch_8
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_e .. :try_end_e} :catch_7
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_e .. :try_end_e} :catch_6
    .catchall {:try_start_e .. :try_end_e} :catchall_1

    .line 340
    :try_start_f
    array-length v0, v6

    .line 341
    const/4 v5, 0x0

    .line 342
    invoke-virtual {v4, v6, v5, v0}, Landroid/os/Parcel;->unmarshall([BII)V

    .line 343
    .line 344
    .line 345
    invoke-virtual {v4, v5}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 346
    .line 347
    .line 348
    sget-object v0, LA7/R1;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 349
    .line 350
    invoke-interface {v0, v4}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 351
    .line 352
    .line 353
    move-result-object v0

    .line 354
    check-cast v0, LA7/R1;
    :try_end_f
    .catch Lf7/b; {:try_start_f .. :try_end_f} :catch_e
    .catchall {:try_start_f .. :try_end_f} :catchall_5

    .line 355
    .line 356
    :try_start_10
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V
    :try_end_10
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_10 .. :try_end_10} :catch_8
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_10 .. :try_end_10} :catch_7
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_10 .. :try_end_10} :catch_6
    .catchall {:try_start_10 .. :try_end_10} :catchall_1

    .line 357
    .line 358
    .line 359
    goto :goto_11

    .line 360
    :catchall_5
    move-exception v0

    .line 361
    goto :goto_12

    .line 362
    :catch_e
    :try_start_11
    invoke-virtual {v10}, LA7/B0;->zzj()LA7/N;

    .line 363
    .line 364
    .line 365
    move-result-object v0

    .line 366
    iget-object v0, v0, LA7/N;->f:LA7/P;

    .line 367
    .line 368
    const-string v5, "Failed to load user property from local database"

    .line 369
    .line 370
    invoke-virtual {v0, v5}, LA7/P;->c(Ljava/lang/String;)V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_5

    .line 371
    .line 372
    .line 373
    :try_start_12
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 374
    .line 375
    .line 376
    const/4 v0, 0x0

    .line 377
    :goto_11
    if-eqz v0, :cond_5

    .line 378
    .line 379
    invoke-virtual {v13, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 380
    .line 381
    .line 382
    goto :goto_e

    .line 383
    :goto_12
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 384
    .line 385
    .line 386
    throw v0
    :try_end_12
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_12 .. :try_end_12} :catch_8
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_12 .. :try_end_12} :catch_7
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_12 .. :try_end_12} :catch_6
    .catchall {:try_start_12 .. :try_end_12} :catchall_1

    .line 387
    :cond_7
    if-ne v0, v5, :cond_8

    .line 388
    .line 389
    :try_start_13
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 390
    .line 391
    .line 392
    move-result-object v4
    :try_end_13
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_13 .. :try_end_13} :catch_13
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_13 .. :try_end_13} :catch_7
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_13 .. :try_end_13} :catch_12
    .catchall {:try_start_13 .. :try_end_13} :catchall_1

    .line 393
    :try_start_14
    array-length v0, v6
    :try_end_14
    .catch Lf7/b; {:try_start_14 .. :try_end_14} :catch_10
    .catchall {:try_start_14 .. :try_end_14} :catchall_7

    .line 394
    const/4 v5, 0x0

    .line 395
    :try_start_15
    invoke-virtual {v4, v6, v5, v0}, Landroid/os/Parcel;->unmarshall([BII)V

    .line 396
    .line 397
    .line 398
    invoke-virtual {v4, v5}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 399
    .line 400
    .line 401
    sget-object v0, LA7/d;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 402
    .line 403
    invoke-interface {v0, v4}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 404
    .line 405
    .line 406
    move-result-object v0

    .line 407
    check-cast v0, LA7/d;
    :try_end_15
    .catch Lf7/b; {:try_start_15 .. :try_end_15} :catch_11
    .catchall {:try_start_15 .. :try_end_15} :catchall_6

    .line 408
    .line 409
    :try_start_16
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V
    :try_end_16
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_16 .. :try_end_16} :catch_8
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_16 .. :try_end_16} :catch_1c
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_16 .. :try_end_16} :catch_f
    .catchall {:try_start_16 .. :try_end_16} :catchall_1

    .line 410
    .line 411
    .line 412
    goto :goto_14

    .line 413
    :catch_f
    move-exception v0

    .line 414
    :goto_13
    move-object/from16 v18, v14

    .line 415
    .line 416
    move-object/from16 v4, v20

    .line 417
    .line 418
    goto/16 :goto_1e

    .line 419
    .line 420
    :catchall_6
    move-exception v0

    .line 421
    goto :goto_15

    .line 422
    :catchall_7
    move-exception v0

    .line 423
    const/4 v5, 0x0

    .line 424
    goto :goto_15

    .line 425
    :catch_10
    const/4 v5, 0x0

    .line 426
    :catch_11
    :try_start_17
    invoke-virtual {v10}, LA7/B0;->zzj()LA7/N;

    .line 427
    .line 428
    .line 429
    move-result-object v0

    .line 430
    iget-object v0, v0, LA7/N;->f:LA7/P;

    .line 431
    .line 432
    const-string v6, "Failed to load conditional user property from local database"

    .line 433
    .line 434
    invoke-virtual {v0, v6}, LA7/P;->c(Ljava/lang/String;)V
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_6

    .line 435
    .line 436
    .line 437
    :try_start_18
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 438
    .line 439
    .line 440
    const/4 v0, 0x0

    .line 441
    :goto_14
    if-eqz v0, :cond_a

    .line 442
    .line 443
    invoke-virtual {v13, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 444
    .line 445
    .line 446
    goto :goto_16

    .line 447
    :goto_15
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 448
    .line 449
    .line 450
    throw v0

    .line 451
    :catch_12
    move-exception v0

    .line 452
    const/4 v5, 0x0

    .line 453
    goto :goto_13

    .line 454
    :catch_13
    move-exception v0

    .line 455
    const/4 v5, 0x0

    .line 456
    goto/16 :goto_d

    .line 457
    .line 458
    :cond_8
    const/4 v5, 0x0

    .line 459
    const/4 v4, 0x3

    .line 460
    if-ne v0, v4, :cond_9

    .line 461
    .line 462
    invoke-virtual {v10}, LA7/B0;->zzj()LA7/N;

    .line 463
    .line 464
    .line 465
    move-result-object v0

    .line 466
    iget-object v0, v0, LA7/N;->i:LA7/P;

    .line 467
    .line 468
    const-string v4, "Skipping app launch break"

    .line 469
    .line 470
    invoke-virtual {v0, v4}, LA7/P;->c(Ljava/lang/String;)V

    .line 471
    .line 472
    .line 473
    goto :goto_16

    .line 474
    :cond_9
    invoke-virtual {v10}, LA7/B0;->zzj()LA7/N;

    .line 475
    .line 476
    .line 477
    move-result-object v0

    .line 478
    iget-object v0, v0, LA7/N;->f:LA7/P;

    .line 479
    .line 480
    const-string v4, "Unknown record type in local database"

    .line 481
    .line 482
    invoke-virtual {v0, v4}, LA7/P;->c(Ljava/lang/String;)V

    .line 483
    .line 484
    .line 485
    :cond_a
    :goto_16
    move/from16 v6, v19

    .line 486
    .line 487
    move-object/from16 v4, v20

    .line 488
    .line 489
    goto/16 :goto_9

    .line 490
    .line 491
    :catch_14
    move-exception v0

    .line 492
    move-object/from16 v20, v4

    .line 493
    .line 494
    :goto_17
    const/4 v5, 0x0

    .line 495
    :goto_18
    move-object/from16 v18, v14

    .line 496
    .line 497
    goto/16 :goto_1e

    .line 498
    .line 499
    :catch_15
    move-exception v0

    .line 500
    move-object/from16 v20, v4

    .line 501
    .line 502
    :goto_19
    const/4 v5, 0x0

    .line 503
    goto/16 :goto_10

    .line 504
    .line 505
    :catch_16
    move-exception v0

    .line 506
    move-object/from16 v20, v4

    .line 507
    .line 508
    move/from16 v19, v6

    .line 509
    .line 510
    goto :goto_17

    .line 511
    :catch_17
    move-object/from16 v20, v4

    .line 512
    .line 513
    move/from16 v19, v6

    .line 514
    .line 515
    goto/16 :goto_c

    .line 516
    .line 517
    :catch_18
    move-exception v0

    .line 518
    move-object/from16 v20, v4

    .line 519
    .line 520
    move/from16 v19, v6

    .line 521
    .line 522
    goto :goto_19

    .line 523
    :catch_19
    move-exception v0

    .line 524
    move-object/from16 v20, v4

    .line 525
    .line 526
    move/from16 v19, v6

    .line 527
    .line 528
    goto :goto_18

    .line 529
    :catch_1a
    move-object/from16 v20, v4

    .line 530
    .line 531
    move/from16 v19, v6

    .line 532
    .line 533
    goto :goto_1a

    .line 534
    :catch_1b
    move-exception v0

    .line 535
    move-object/from16 v20, v4

    .line 536
    .line 537
    move/from16 v19, v6

    .line 538
    .line 539
    goto/16 :goto_10

    .line 540
    .line 541
    :cond_b
    move-object/from16 v20, v4

    .line 542
    .line 543
    move/from16 v19, v6

    .line 544
    .line 545
    const-string v0, "messages"

    .line 546
    .line 547
    const-string v4, "rowid <= ?"

    .line 548
    .line 549
    invoke-static/range {v27 .. v28}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 550
    .line 551
    .line 552
    move-result-object v6

    .line 553
    filled-new-array {v6}, [Ljava/lang/String;

    .line 554
    .line 555
    .line 556
    move-result-object v6

    .line 557
    invoke-virtual {v14, v0, v4, v6}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 558
    .line 559
    .line 560
    move-result v0

    .line 561
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    .line 562
    .line 563
    .line 564
    move-result v4

    .line 565
    if-ge v0, v4, :cond_c

    .line 566
    .line 567
    invoke-virtual {v10}, LA7/B0;->zzj()LA7/N;

    .line 568
    .line 569
    .line 570
    move-result-object v0

    .line 571
    iget-object v0, v0, LA7/N;->f:LA7/P;

    .line 572
    .line 573
    const-string v4, "Fewer entries removed from local database than expected"

    .line 574
    .line 575
    invoke-virtual {v0, v4}, LA7/P;->c(Ljava/lang/String;)V

    .line 576
    .line 577
    .line 578
    :cond_c
    invoke-virtual {v14}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V

    .line 579
    .line 580
    .line 581
    invoke-virtual {v14}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V
    :try_end_18
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_18 .. :try_end_18} :catch_8
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_18 .. :try_end_18} :catch_1c
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_18 .. :try_end_18} :catch_f
    .catchall {:try_start_18 .. :try_end_18} :catchall_1

    .line 582
    .line 583
    .line 584
    invoke-interface/range {v20 .. v20}, Landroid/database/Cursor;->close()V

    .line 585
    .line 586
    .line 587
    invoke-virtual {v14}, Landroid/database/sqlite/SQLiteClosable;->close()V

    .line 588
    .line 589
    .line 590
    goto/16 :goto_24

    .line 591
    .line 592
    :catch_1c
    :goto_1a
    move-object/from16 v18, v14

    .line 593
    .line 594
    move-object/from16 v4, v20

    .line 595
    .line 596
    goto :goto_20

    .line 597
    :catch_1d
    move-exception v0

    .line 598
    :goto_1b
    move/from16 v19, v6

    .line 599
    .line 600
    move-object/from16 v14, v18

    .line 601
    .line 602
    goto/16 :goto_5

    .line 603
    .line 604
    :catch_1e
    move-exception v0

    .line 605
    :goto_1c
    move/from16 v19, v6

    .line 606
    .line 607
    move-object/from16 v14, v18

    .line 608
    .line 609
    goto/16 :goto_7

    .line 610
    .line 611
    :catch_1f
    move-exception v0

    .line 612
    move/from16 v29, v4

    .line 613
    .line 614
    goto :goto_1b

    .line 615
    :catch_20
    move-exception v0

    .line 616
    move/from16 v29, v4

    .line 617
    .line 618
    goto :goto_1c

    .line 619
    :goto_1d
    move-object/from16 v18, v14

    .line 620
    .line 621
    const/4 v4, 0x0

    .line 622
    goto :goto_20

    .line 623
    :catchall_8
    move-exception v0

    .line 624
    const/4 v12, 0x0

    .line 625
    const/4 v14, 0x0

    .line 626
    goto/16 :goto_23

    .line 627
    .line 628
    :catch_21
    move-exception v0

    .line 629
    move/from16 v29, v4

    .line 630
    .line 631
    move/from16 v19, v6

    .line 632
    .line 633
    const/4 v4, 0x0

    .line 634
    const/16 v18, 0x0

    .line 635
    .line 636
    :goto_1e
    if-eqz v18, :cond_d

    .line 637
    .line 638
    :try_start_19
    invoke-virtual/range {v18 .. v18}, Landroid/database/sqlite/SQLiteDatabase;->inTransaction()Z

    .line 639
    .line 640
    .line 641
    move-result v6

    .line 642
    if-eqz v6, :cond_d

    .line 643
    .line 644
    invoke-virtual/range {v18 .. v18}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 645
    .line 646
    .line 647
    goto :goto_1f

    .line 648
    :catchall_9
    move-exception v0

    .line 649
    move-object v12, v4

    .line 650
    move-object/from16 v14, v18

    .line 651
    .line 652
    goto :goto_23

    .line 653
    :cond_d
    :goto_1f
    invoke-virtual {v10}, LA7/B0;->zzj()LA7/N;

    .line 654
    .line 655
    .line 656
    move-result-object v6

    .line 657
    iget-object v6, v6, LA7/N;->f:LA7/P;

    .line 658
    .line 659
    invoke-virtual {v6, v11, v0}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 660
    .line 661
    .line 662
    const/4 v6, 0x1

    .line 663
    iput-boolean v6, v10, LA7/H;->d:Z
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_9

    .line 664
    .line 665
    if-eqz v4, :cond_e

    .line 666
    .line 667
    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    .line 668
    .line 669
    .line 670
    :cond_e
    if-eqz v18, :cond_11

    .line 671
    .line 672
    invoke-virtual/range {v18 .. v18}, Landroid/database/sqlite/SQLiteClosable;->close()V

    .line 673
    .line 674
    .line 675
    goto :goto_22

    .line 676
    :catch_22
    move/from16 v29, v4

    .line 677
    .line 678
    move/from16 v19, v6

    .line 679
    .line 680
    const/4 v4, 0x0

    .line 681
    const/16 v18, 0x0

    .line 682
    .line 683
    :goto_20
    int-to-long v5, v12

    .line 684
    :try_start_1a
    invoke-static {v5, v6}, Landroid/os/SystemClock;->sleep(J)V
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_9

    .line 685
    .line 686
    .line 687
    add-int/lit8 v12, v12, 0x14

    .line 688
    .line 689
    if-eqz v4, :cond_f

    .line 690
    .line 691
    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    .line 692
    .line 693
    .line 694
    :cond_f
    if-eqz v18, :cond_11

    .line 695
    .line 696
    invoke-virtual/range {v18 .. v18}, Landroid/database/sqlite/SQLiteClosable;->close()V

    .line 697
    .line 698
    .line 699
    goto :goto_22

    .line 700
    :catch_23
    move-exception v0

    .line 701
    move/from16 v29, v4

    .line 702
    .line 703
    move/from16 v19, v6

    .line 704
    .line 705
    const/4 v4, 0x0

    .line 706
    const/16 v18, 0x0

    .line 707
    .line 708
    :goto_21
    :try_start_1b
    invoke-virtual {v10}, LA7/B0;->zzj()LA7/N;

    .line 709
    .line 710
    .line 711
    move-result-object v5

    .line 712
    iget-object v5, v5, LA7/N;->f:LA7/P;

    .line 713
    .line 714
    invoke-virtual {v5, v11, v0}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 715
    .line 716
    .line 717
    const/4 v5, 0x1

    .line 718
    iput-boolean v5, v10, LA7/H;->d:Z
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_9

    .line 719
    .line 720
    if-eqz v4, :cond_10

    .line 721
    .line 722
    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    .line 723
    .line 724
    .line 725
    :cond_10
    if-eqz v18, :cond_11

    .line 726
    .line 727
    invoke-virtual/range {v18 .. v18}, Landroid/database/sqlite/SQLiteClosable;->close()V

    .line 728
    .line 729
    .line 730
    :cond_11
    :goto_22
    add-int/lit8 v15, v15, 0x1

    .line 731
    .line 732
    move/from16 v6, v19

    .line 733
    .line 734
    move/from16 v4, v29

    .line 735
    .line 736
    const/4 v5, 0x0

    .line 737
    const/4 v14, 0x5

    .line 738
    goto/16 :goto_3

    .line 739
    .line 740
    :goto_23
    if-eqz v12, :cond_12

    .line 741
    .line 742
    invoke-interface {v12}, Landroid/database/Cursor;->close()V

    .line 743
    .line 744
    .line 745
    :cond_12
    if-eqz v14, :cond_13

    .line 746
    .line 747
    invoke-virtual {v14}, Landroid/database/sqlite/SQLiteClosable;->close()V

    .line 748
    .line 749
    .line 750
    :cond_13
    throw v0

    .line 751
    :cond_14
    move/from16 v29, v4

    .line 752
    .line 753
    move/from16 v19, v6

    .line 754
    .line 755
    invoke-virtual {v10}, LA7/B0;->zzj()LA7/N;

    .line 756
    .line 757
    .line 758
    move-result-object v0

    .line 759
    const-string v4, "Failed to read events from database in reasonable time"

    .line 760
    .line 761
    iget-object v0, v0, LA7/N;->i:LA7/P;

    .line 762
    .line 763
    invoke-virtual {v0, v4}, LA7/P;->c(Ljava/lang/String;)V

    .line 764
    .line 765
    .line 766
    goto/16 :goto_2

    .line 767
    .line 768
    :goto_24
    if-eqz v13, :cond_15

    .line 769
    .line 770
    invoke-virtual {v7, v13}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 771
    .line 772
    .line 773
    invoke-interface {v13}, Ljava/util/List;->size()I

    .line 774
    .line 775
    .line 776
    move-result v0

    .line 777
    move v4, v0

    .line 778
    goto :goto_25

    .line 779
    :cond_15
    const/4 v4, 0x0

    .line 780
    :goto_25
    move/from16 v5, v29

    .line 781
    .line 782
    if-eqz v2, :cond_16

    .line 783
    .line 784
    if-ge v4, v5, :cond_16

    .line 785
    .line 786
    invoke-virtual {v7, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 787
    .line 788
    .line 789
    :cond_16
    sget-object v0, LA7/y;->E0:LA7/D;

    .line 790
    .line 791
    iget-object v6, v9, LA7/n0;->g:LA7/e;

    .line 792
    .line 793
    const/4 v10, 0x0

    .line 794
    invoke-virtual {v6, v10, v0}, LA7/e;->o0(Ljava/lang/String;LA7/D;)Z

    .line 795
    .line 796
    .line 797
    move-result v6

    .line 798
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 799
    .line 800
    .line 801
    move-result v10

    .line 802
    const/4 v0, 0x0

    .line 803
    :goto_26
    if-ge v0, v10, :cond_1f

    .line 804
    .line 805
    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 806
    .line 807
    .line 808
    move-result-object v11

    .line 809
    add-int/lit8 v12, v0, 0x1

    .line 810
    .line 811
    check-cast v11, Lf7/a;

    .line 812
    .line 813
    instance-of v0, v11, LA7/x;

    .line 814
    .line 815
    if-eqz v0, :cond_1b

    .line 816
    .line 817
    iget-object v13, v9, LA7/n0;->a:Landroid/content/Context;

    .line 818
    .line 819
    iget-object v15, v9, LA7/n0;->n:Ln7/b;

    .line 820
    .line 821
    const-wide/16 v16, 0x0

    .line 822
    .line 823
    if-eqz v6, :cond_17

    .line 824
    .line 825
    :try_start_1c
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 826
    .line 827
    .line 828
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 829
    .line 830
    .line 831
    move-result-wide v20
    :try_end_1c
    .catch Landroid/os/RemoteException; {:try_start_1c .. :try_end_1c} :catch_25

    .line 832
    :try_start_1d
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 833
    .line 834
    .line 835
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 836
    .line 837
    .line 838
    move-result-wide v22
    :try_end_1d
    .catch Landroid/os/RemoteException; {:try_start_1d .. :try_end_1d} :catch_24

    .line 839
    move-wide/from16 v27, v22

    .line 840
    .line 841
    move-wide/from16 v23, v20

    .line 842
    .line 843
    goto :goto_27

    .line 844
    :catch_24
    move-exception v0

    .line 845
    move/from16 v18, v6

    .line 846
    .line 847
    move-wide/from16 v27, v16

    .line 848
    .line 849
    move-wide/from16 v23, v20

    .line 850
    .line 851
    goto :goto_28

    .line 852
    :catch_25
    move-exception v0

    .line 853
    move/from16 v18, v6

    .line 854
    .line 855
    move-wide/from16 v23, v16

    .line 856
    .line 857
    move-wide/from16 v27, v23

    .line 858
    .line 859
    goto :goto_28

    .line 860
    :cond_17
    move-wide/from16 v23, v16

    .line 861
    .line 862
    move-wide/from16 v27, v23

    .line 863
    .line 864
    :goto_27
    :try_start_1e
    check-cast v11, LA7/x;

    .line 865
    .line 866
    invoke-interface {v1, v11, v3}, LA7/F;->s(LA7/x;LA7/N1;)V

    .line 867
    .line 868
    .line 869
    if-eqz v6, :cond_19

    .line 870
    .line 871
    invoke-virtual {v8}, LA7/B0;->zzj()LA7/N;

    .line 872
    .line 873
    .line 874
    move-result-object v0

    .line 875
    iget-object v0, v0, LA7/N;->n:LA7/P;

    .line 876
    .line 877
    const-string v11, "Logging telemetry for logEvent from database"

    .line 878
    .line 879
    invoke-virtual {v0, v11}, LA7/P;->c(Ljava/lang/String;)V

    .line 880
    .line 881
    .line 882
    sget-object v0, LA7/L;->d:LA7/L;

    .line 883
    .line 884
    if-nez v0, :cond_18

    .line 885
    .line 886
    new-instance v0, LA7/L;

    .line 887
    .line 888
    invoke-direct {v0, v13, v9}, LA7/L;-><init>(Landroid/content/Context;LA7/n0;)V

    .line 889
    .line 890
    .line 891
    sput-object v0, LA7/L;->d:LA7/L;

    .line 892
    .line 893
    :cond_18
    sget-object v20, LA7/L;->d:LA7/L;

    .line 894
    .line 895
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 896
    .line 897
    .line 898
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 899
    .line 900
    .line 901
    move-result-wide v25

    .line 902
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 903
    .line 904
    .line 905
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 906
    .line 907
    .line 908
    move-result-wide v21
    :try_end_1e
    .catch Landroid/os/RemoteException; {:try_start_1e .. :try_end_1e} :catch_27

    .line 909
    move/from16 v18, v6

    .line 910
    .line 911
    sub-long v5, v21, v27

    .line 912
    .line 913
    long-to-int v0, v5

    .line 914
    const/16 v21, 0x0

    .line 915
    .line 916
    move/from16 v22, v0

    .line 917
    .line 918
    :try_start_1f
    invoke-virtual/range {v20 .. v26}, LA7/L;->a(IIJJ)V
    :try_end_1f
    .catch Landroid/os/RemoteException; {:try_start_1f .. :try_end_1f} :catch_26

    .line 919
    .line 920
    .line 921
    goto/16 :goto_29

    .line 922
    .line 923
    :catch_26
    move-exception v0

    .line 924
    goto :goto_28

    .line 925
    :catch_27
    move-exception v0

    .line 926
    move/from16 v18, v6

    .line 927
    .line 928
    goto :goto_28

    .line 929
    :cond_19
    move/from16 v18, v6

    .line 930
    .line 931
    goto/16 :goto_29

    .line 932
    .line 933
    :goto_28
    invoke-virtual {v8}, LA7/B0;->zzj()LA7/N;

    .line 934
    .line 935
    .line 936
    move-result-object v5

    .line 937
    const-string v6, "Failed to send event to the service"

    .line 938
    .line 939
    iget-object v5, v5, LA7/N;->f:LA7/P;

    .line 940
    .line 941
    invoke-virtual {v5, v6, v0}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 942
    .line 943
    .line 944
    if-eqz v18, :cond_1e

    .line 945
    .line 946
    cmp-long v0, v23, v16

    .line 947
    .line 948
    if-eqz v0, :cond_1e

    .line 949
    .line 950
    sget-object v0, LA7/L;->d:LA7/L;

    .line 951
    .line 952
    if-nez v0, :cond_1a

    .line 953
    .line 954
    new-instance v0, LA7/L;

    .line 955
    .line 956
    invoke-direct {v0, v13, v9}, LA7/L;-><init>(Landroid/content/Context;LA7/n0;)V

    .line 957
    .line 958
    .line 959
    sput-object v0, LA7/L;->d:LA7/L;

    .line 960
    .line 961
    :cond_1a
    sget-object v20, LA7/L;->d:LA7/L;

    .line 962
    .line 963
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 964
    .line 965
    .line 966
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 967
    .line 968
    .line 969
    move-result-wide v25

    .line 970
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 971
    .line 972
    .line 973
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 974
    .line 975
    .line 976
    move-result-wide v5

    .line 977
    sub-long v5, v5, v27

    .line 978
    .line 979
    long-to-int v0, v5

    .line 980
    const/16 v21, 0xd

    .line 981
    .line 982
    move/from16 v22, v0

    .line 983
    .line 984
    invoke-virtual/range {v20 .. v26}, LA7/L;->a(IIJJ)V

    .line 985
    .line 986
    .line 987
    goto :goto_29

    .line 988
    :cond_1b
    move/from16 v18, v6

    .line 989
    .line 990
    instance-of v0, v11, LA7/R1;

    .line 991
    .line 992
    if-eqz v0, :cond_1c

    .line 993
    .line 994
    :try_start_20
    check-cast v11, LA7/R1;

    .line 995
    .line 996
    invoke-interface {v1, v11, v3}, LA7/F;->K(LA7/R1;LA7/N1;)V
    :try_end_20
    .catch Landroid/os/RemoteException; {:try_start_20 .. :try_end_20} :catch_28

    .line 997
    .line 998
    .line 999
    goto :goto_29

    .line 1000
    :catch_28
    move-exception v0

    .line 1001
    invoke-virtual {v8}, LA7/B0;->zzj()LA7/N;

    .line 1002
    .line 1003
    .line 1004
    move-result-object v5

    .line 1005
    const-string v6, "Failed to send user property to the service"

    .line 1006
    .line 1007
    iget-object v5, v5, LA7/N;->f:LA7/P;

    .line 1008
    .line 1009
    invoke-virtual {v5, v6, v0}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1010
    .line 1011
    .line 1012
    goto :goto_29

    .line 1013
    :cond_1c
    instance-of v0, v11, LA7/d;

    .line 1014
    .line 1015
    if-eqz v0, :cond_1d

    .line 1016
    .line 1017
    :try_start_21
    check-cast v11, LA7/d;

    .line 1018
    .line 1019
    invoke-interface {v1, v11, v3}, LA7/F;->l(LA7/d;LA7/N1;)V
    :try_end_21
    .catch Landroid/os/RemoteException; {:try_start_21 .. :try_end_21} :catch_29

    .line 1020
    .line 1021
    .line 1022
    goto :goto_29

    .line 1023
    :catch_29
    move-exception v0

    .line 1024
    invoke-virtual {v8}, LA7/B0;->zzj()LA7/N;

    .line 1025
    .line 1026
    .line 1027
    move-result-object v5

    .line 1028
    const-string v6, "Failed to send conditional user property to the service"

    .line 1029
    .line 1030
    iget-object v5, v5, LA7/N;->f:LA7/P;

    .line 1031
    .line 1032
    invoke-virtual {v5, v6, v0}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1033
    .line 1034
    .line 1035
    goto :goto_29

    .line 1036
    :cond_1d
    invoke-virtual {v8}, LA7/B0;->zzj()LA7/N;

    .line 1037
    .line 1038
    .line 1039
    move-result-object v0

    .line 1040
    const-string v5, "Discarding data. Unrecognized parcel type."

    .line 1041
    .line 1042
    iget-object v0, v0, LA7/N;->f:LA7/P;

    .line 1043
    .line 1044
    invoke-virtual {v0, v5}, LA7/P;->c(Ljava/lang/String;)V

    .line 1045
    .line 1046
    .line 1047
    :cond_1e
    :goto_29
    move v0, v12

    .line 1048
    move/from16 v6, v18

    .line 1049
    .line 1050
    const/16 v5, 0x64

    .line 1051
    .line 1052
    goto/16 :goto_26

    .line 1053
    .line 1054
    :cond_1f
    add-int/lit8 v6, v19, 0x1

    .line 1055
    .line 1056
    move v0, v4

    .line 1057
    const/16 v4, 0x64

    .line 1058
    .line 1059
    const/4 v5, 0x0

    .line 1060
    goto/16 :goto_0

    .line 1061
    .line 1062
    :cond_20
    move-object/from16 v8, p0

    .line 1063
    .line 1064
    return-void
.end method

.method public final m0(Ljava/lang/Runnable;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, LA7/B;->c0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LA7/m1;->r0()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget-object v0, p0, LA7/m1;->h:Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    int-to-long v1, v1

    .line 21
    const-wide/16 v3, 0x3e8

    .line 22
    .line 23
    cmp-long v1, v1, v3

    .line 24
    .line 25
    if-ltz v1, :cond_1

    .line 26
    .line 27
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    const-string v0, "Discarding data. Max runnable queue size reached"

    .line 32
    .line 33
    iget-object p1, p1, LA7/N;->f:LA7/P;

    .line 34
    .line 35
    invoke-virtual {p1, v0}, LA7/P;->c(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_1
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    iget-object p1, p0, LA7/m1;->i:LA7/n1;

    .line 43
    .line 44
    const-wide/32 v0, 0xea60

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1, v0, v1}, LA7/n;->b(J)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, LA7/m1;->p0()V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public final n0(Ljava/util/concurrent/atomic/AtomicReference;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, LA7/B;->c0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LA7/Y;->h0()V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-virtual {p0, v0}, LA7/m1;->w0(Z)LA7/N1;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    new-instance v1, LA7/w0;

    .line 13
    .line 14
    const/4 v2, 0x5

    .line 15
    invoke-direct {v1, p0, p1, v0, v2}, LA7/w0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, v1}, LA7/m1;->m0(Ljava/lang/Runnable;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final o0(Z)V
    .locals 4

    .line 1
    invoke-virtual {p0}, LA7/B;->c0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LA7/Y;->h0()V

    .line 5
    .line 6
    .line 7
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zznm;->zza()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iget-object v1, p0, LA7/B0;->a:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, LA7/n0;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object v0, v1, LA7/n0;->g:LA7/e;

    .line 18
    .line 19
    sget-object v2, LA7/y;->X0:LA7/D;

    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    invoke-virtual {v0, v3, v2}, LA7/e;->o0(Ljava/lang/String;LA7/D;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_1

    .line 27
    .line 28
    :cond_0
    if-eqz p1, :cond_1

    .line 29
    .line 30
    invoke-virtual {v1}, LA7/n0;->k()LA7/H;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {p1}, LA7/H;->m0()V

    .line 35
    .line 36
    .line 37
    :cond_1
    invoke-virtual {p0}, LA7/m1;->s0()Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-eqz p1, :cond_2

    .line 42
    .line 43
    const/4 p1, 0x0

    .line 44
    invoke-virtual {p0, p1}, LA7/m1;->w0(Z)LA7/N1;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    new-instance v0, LA7/q1;

    .line 49
    .line 50
    const/4 v1, 0x4

    .line 51
    invoke-direct {v0, p0, p1, v1}, LA7/q1;-><init>(LA7/m1;LA7/N1;I)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0, v0}, LA7/m1;->m0(Ljava/lang/Runnable;)V

    .line 55
    .line 56
    .line 57
    :cond_2
    return-void
.end method

.method public final p0()V
    .locals 7

    .line 1
    invoke-virtual {p0}, LA7/B;->c0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LA7/Y;->h0()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, LA7/m1;->r0()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto/16 :goto_1

    .line 14
    .line 15
    :cond_0
    invoke-virtual {p0}, LA7/m1;->t0()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_4

    .line 20
    .line 21
    iget-object v4, p0, LA7/m1;->c:LA7/t1;

    .line 22
    .line 23
    iget-object v0, v4, LA7/t1;->c:LA7/m1;

    .line 24
    .line 25
    invoke-virtual {v0}, LA7/B;->c0()V

    .line 26
    .line 27
    .line 28
    iget-object v0, v4, LA7/t1;->c:LA7/m1;

    .line 29
    .line 30
    iget-object v0, v0, LA7/B0;->a:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, LA7/n0;

    .line 33
    .line 34
    iget-object v2, v0, LA7/n0;->a:Landroid/content/Context;

    .line 35
    .line 36
    monitor-enter v4

    .line 37
    :try_start_0
    iget-boolean v0, v4, LA7/t1;->a:Z

    .line 38
    .line 39
    if-eqz v0, :cond_1

    .line 40
    .line 41
    iget-object v0, v4, LA7/t1;->c:LA7/m1;

    .line 42
    .line 43
    invoke-virtual {v0}, LA7/B0;->zzj()LA7/N;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    iget-object v0, v0, LA7/N;->n:LA7/P;

    .line 48
    .line 49
    const-string v1, "Connection attempt already in progress"

    .line 50
    .line 51
    invoke-virtual {v0, v1}, LA7/P;->c(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    monitor-exit v4

    .line 55
    return-void

    .line 56
    :catchall_0
    move-exception v0

    .line 57
    goto :goto_0

    .line 58
    :cond_1
    iget-object v0, v4, LA7/t1;->b:LA7/K;

    .line 59
    .line 60
    if-eqz v0, :cond_3

    .line 61
    .line 62
    iget-object v0, v4, LA7/t1;->b:LA7/K;

    .line 63
    .line 64
    invoke-virtual {v0}, Lcom/google/android/gms/common/internal/f;->isConnecting()Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-nez v0, :cond_2

    .line 69
    .line 70
    iget-object v0, v4, LA7/t1;->b:LA7/K;

    .line 71
    .line 72
    invoke-virtual {v0}, Lcom/google/android/gms/common/internal/f;->isConnected()Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-eqz v0, :cond_3

    .line 77
    .line 78
    :cond_2
    iget-object v0, v4, LA7/t1;->c:LA7/m1;

    .line 79
    .line 80
    invoke-virtual {v0}, LA7/B0;->zzj()LA7/N;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    iget-object v0, v0, LA7/N;->n:LA7/P;

    .line 85
    .line 86
    const-string v1, "Already awaiting connection attempt"

    .line 87
    .line 88
    invoke-virtual {v0, v1}, LA7/P;->c(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    monitor-exit v4

    .line 92
    return-void

    .line 93
    :cond_3
    new-instance v1, LA7/K;

    .line 94
    .line 95
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    const/16 v6, 0x5d

    .line 100
    .line 101
    move-object v5, v4

    .line 102
    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/common/internal/f;-><init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/internal/b;Lcom/google/android/gms/common/internal/c;I)V

    .line 103
    .line 104
    .line 105
    iput-object v1, v4, LA7/t1;->b:LA7/K;

    .line 106
    .line 107
    iget-object v0, v4, LA7/t1;->c:LA7/m1;

    .line 108
    .line 109
    invoke-virtual {v0}, LA7/B0;->zzj()LA7/N;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    iget-object v0, v0, LA7/N;->n:LA7/P;

    .line 114
    .line 115
    const-string v1, "Connecting to remote service"

    .line 116
    .line 117
    invoke-virtual {v0, v1}, LA7/P;->c(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    const/4 v0, 0x1

    .line 121
    iput-boolean v0, v4, LA7/t1;->a:Z

    .line 122
    .line 123
    iget-object v0, v4, LA7/t1;->b:LA7/K;

    .line 124
    .line 125
    invoke-static {v0}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    iget-object v0, v4, LA7/t1;->b:LA7/K;

    .line 129
    .line 130
    invoke-virtual {v0}, Lcom/google/android/gms/common/internal/f;->checkAvailabilityAndConnect()V

    .line 131
    .line 132
    .line 133
    monitor-exit v4

    .line 134
    return-void

    .line 135
    :goto_0
    monitor-exit v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 136
    throw v0

    .line 137
    :cond_4
    iget-object v0, p0, LA7/B0;->a:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast v0, LA7/n0;

    .line 140
    .line 141
    iget-object v0, v0, LA7/n0;->g:LA7/e;

    .line 142
    .line 143
    invoke-virtual {v0}, LA7/e;->r0()Z

    .line 144
    .line 145
    .line 146
    move-result v0

    .line 147
    if-nez v0, :cond_6

    .line 148
    .line 149
    iget-object v0, p0, LA7/B0;->a:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast v0, LA7/n0;

    .line 152
    .line 153
    iget-object v0, v0, LA7/n0;->a:Landroid/content/Context;

    .line 154
    .line 155
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    new-instance v1, Landroid/content/Intent;

    .line 160
    .line 161
    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 162
    .line 163
    .line 164
    iget-object v2, p0, LA7/B0;->a:Ljava/lang/Object;

    .line 165
    .line 166
    check-cast v2, LA7/n0;

    .line 167
    .line 168
    iget-object v2, v2, LA7/n0;->a:Landroid/content/Context;

    .line 169
    .line 170
    const-string v3, "com.google.android.gms.measurement.AppMeasurementService"

    .line 171
    .line 172
    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    const/high16 v2, 0x10000

    .line 177
    .line 178
    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->queryIntentServices(Landroid/content/Intent;I)Ljava/util/List;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    if-eqz v0, :cond_5

    .line 183
    .line 184
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 185
    .line 186
    .line 187
    move-result v0

    .line 188
    if-nez v0, :cond_5

    .line 189
    .line 190
    new-instance v0, Landroid/content/Intent;

    .line 191
    .line 192
    const-string v1, "com.google.android.gms.measurement.START"

    .line 193
    .line 194
    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    new-instance v1, Landroid/content/ComponentName;

    .line 198
    .line 199
    iget-object v2, p0, LA7/B0;->a:Ljava/lang/Object;

    .line 200
    .line 201
    check-cast v2, LA7/n0;

    .line 202
    .line 203
    iget-object v2, v2, LA7/n0;->a:Landroid/content/Context;

    .line 204
    .line 205
    const-string v3, "com.google.android.gms.measurement.AppMeasurementService"

    .line 206
    .line 207
    invoke-direct {v1, v2, v3}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 211
    .line 212
    .line 213
    iget-object v1, p0, LA7/m1;->c:LA7/t1;

    .line 214
    .line 215
    invoke-virtual {v1, v0}, LA7/t1;->a(Landroid/content/Intent;)V

    .line 216
    .line 217
    .line 218
    return-void

    .line 219
    :cond_5
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    iget-object v0, v0, LA7/N;->f:LA7/P;

    .line 224
    .line 225
    const-string v1, "Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest"

    .line 226
    .line 227
    invoke-virtual {v0, v1}, LA7/P;->c(Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    :cond_6
    :goto_1
    return-void
.end method

.method public final q0()V
    .locals 4

    .line 1
    invoke-virtual {p0}, LA7/B;->c0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LA7/Y;->h0()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, LA7/m1;->c:LA7/t1;

    .line 8
    .line 9
    iget-object v1, v0, LA7/t1;->b:LA7/K;

    .line 10
    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    iget-object v1, v0, LA7/t1;->b:LA7/K;

    .line 14
    .line 15
    invoke-virtual {v1}, Lcom/google/android/gms/common/internal/f;->isConnected()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    iget-object v1, v0, LA7/t1;->b:LA7/K;

    .line 22
    .line 23
    invoke-virtual {v1}, Lcom/google/android/gms/common/internal/f;->isConnecting()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    :cond_0
    iget-object v1, v0, LA7/t1;->b:LA7/K;

    .line 30
    .line 31
    invoke-virtual {v1}, Lcom/google/android/gms/common/internal/f;->disconnect()V

    .line 32
    .line 33
    .line 34
    :cond_1
    const/4 v1, 0x0

    .line 35
    iput-object v1, v0, LA7/t1;->b:LA7/K;

    .line 36
    .line 37
    :try_start_0
    invoke-static {}, Lm7/a;->b()Lm7/a;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iget-object v2, p0, LA7/B0;->a:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v2, LA7/n0;

    .line 44
    .line 45
    iget-object v2, v2, LA7/n0;->a:Landroid/content/Context;

    .line 46
    .line 47
    iget-object v3, p0, LA7/m1;->c:LA7/t1;

    .line 48
    .line 49
    invoke-virtual {v0, v2, v3}, Lm7/a;->c(Landroid/content/Context;Landroid/content/ServiceConnection;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 50
    .line 51
    .line 52
    :catch_0
    iput-object v1, p0, LA7/m1;->d:LA7/F;

    .line 53
    .line 54
    return-void
.end method

.method public final r0()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, LA7/B;->c0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LA7/Y;->h0()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, LA7/m1;->d:LA7/F;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    return v0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return v0
.end method

.method public final s0()Z
    .locals 4

    .line 1
    invoke-virtual {p0}, LA7/B;->c0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LA7/Y;->h0()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, LA7/m1;->t0()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x1

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    return v1

    .line 15
    :cond_0
    invoke-virtual {p0}, LA7/B0;->b0()LA7/U1;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, LA7/U1;->i1()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    sget-object v2, LA7/y;->t0:LA7/D;

    .line 24
    .line 25
    const/4 v3, 0x0

    .line 26
    invoke-virtual {v2, v3}, LA7/D;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v2, Ljava/lang/Integer;

    .line 31
    .line 32
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-lt v0, v2, :cond_1

    .line 37
    .line 38
    return v1

    .line 39
    :cond_1
    const/4 v0, 0x0

    .line 40
    return v0
.end method

.method public final t0()Z
    .locals 7

    .line 1
    invoke-virtual {p0}, LA7/B;->c0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LA7/Y;->h0()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, LA7/m1;->e:Ljava/lang/Boolean;

    .line 8
    .line 9
    if-nez v0, :cond_d

    .line 10
    .line 11
    invoke-virtual {p0}, LA7/B;->c0()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, LA7/Y;->h0()V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, LA7/B0;->a0()LA7/Z;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, LA7/B0;->c0()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, LA7/Z;->l0()Landroid/content/SharedPreferences;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    const-string v2, "use_service"

    .line 29
    .line 30
    invoke-interface {v1, v2}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    const/4 v3, 0x0

    .line 35
    if-nez v1, :cond_0

    .line 36
    .line 37
    const/4 v0, 0x0

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    invoke-virtual {v0}, LA7/Z;->l0()Landroid/content/SharedPreferences;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    :goto_0
    const/4 v1, 0x1

    .line 52
    if-eqz v0, :cond_1

    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    if-eqz v4, :cond_1

    .line 59
    .line 60
    goto/16 :goto_7

    .line 61
    .line 62
    :cond_1
    iget-object v4, p0, LA7/B0;->a:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v4, LA7/n0;

    .line 65
    .line 66
    invoke-virtual {v4}, LA7/n0;->j()LA7/I;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    invoke-virtual {v4}, LA7/Y;->h0()V

    .line 71
    .line 72
    .line 73
    iget v4, v4, LA7/I;->k:I

    .line 74
    .line 75
    if-ne v4, v1, :cond_2

    .line 76
    .line 77
    :goto_1
    move v0, v1

    .line 78
    goto/16 :goto_5

    .line 79
    .line 80
    :cond_2
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    iget-object v4, v4, LA7/N;->n:LA7/P;

    .line 85
    .line 86
    const-string v5, "Checking service availability"

    .line 87
    .line 88
    invoke-virtual {v4, v5}, LA7/P;->c(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p0}, LA7/B0;->b0()LA7/U1;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    sget-object v5, Ld7/f;->b:Ld7/f;

    .line 96
    .line 97
    iget-object v4, v4, LA7/B0;->a:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v4, LA7/n0;

    .line 100
    .line 101
    iget-object v4, v4, LA7/n0;->a:Landroid/content/Context;

    .line 102
    .line 103
    const v6, 0xbdfcb8

    .line 104
    .line 105
    .line 106
    invoke-virtual {v5, v4, v6}, Ld7/f;->d(Landroid/content/Context;I)I

    .line 107
    .line 108
    .line 109
    move-result v4

    .line 110
    if-eqz v4, :cond_a

    .line 111
    .line 112
    if-eq v4, v1, :cond_9

    .line 113
    .line 114
    const/4 v5, 0x2

    .line 115
    if-eq v4, v5, :cond_6

    .line 116
    .line 117
    const/4 v0, 0x3

    .line 118
    if-eq v4, v0, :cond_5

    .line 119
    .line 120
    const/16 v0, 0x9

    .line 121
    .line 122
    if-eq v4, v0, :cond_4

    .line 123
    .line 124
    const/16 v0, 0x12

    .line 125
    .line 126
    if-eq v4, v0, :cond_3

    .line 127
    .line 128
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    iget-object v0, v0, LA7/N;->i:LA7/P;

    .line 133
    .line 134
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    const-string v4, "Unexpected service status"

    .line 139
    .line 140
    invoke-virtual {v0, v4, v1}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    :goto_2
    move v0, v3

    .line 144
    move v1, v0

    .line 145
    goto :goto_5

    .line 146
    :cond_3
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    iget-object v0, v0, LA7/N;->i:LA7/P;

    .line 151
    .line 152
    const-string v4, "Service updating"

    .line 153
    .line 154
    invoke-virtual {v0, v4}, LA7/P;->c(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    goto :goto_1

    .line 158
    :cond_4
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    iget-object v0, v0, LA7/N;->i:LA7/P;

    .line 163
    .line 164
    const-string v1, "Service invalid"

    .line 165
    .line 166
    invoke-virtual {v0, v1}, LA7/P;->c(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    goto :goto_2

    .line 170
    :cond_5
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    iget-object v0, v0, LA7/N;->i:LA7/P;

    .line 175
    .line 176
    const-string v1, "Service disabled"

    .line 177
    .line 178
    invoke-virtual {v0, v1}, LA7/P;->c(Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    goto :goto_2

    .line 182
    :cond_6
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 183
    .line 184
    .line 185
    move-result-object v4

    .line 186
    iget-object v4, v4, LA7/N;->m:LA7/P;

    .line 187
    .line 188
    const-string v5, "Service container out of date"

    .line 189
    .line 190
    invoke-virtual {v4, v5}, LA7/P;->c(Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {p0}, LA7/B0;->b0()LA7/U1;

    .line 194
    .line 195
    .line 196
    move-result-object v4

    .line 197
    invoke-virtual {v4}, LA7/U1;->i1()I

    .line 198
    .line 199
    .line 200
    move-result v4

    .line 201
    const/16 v5, 0x4423

    .line 202
    .line 203
    if-ge v4, v5, :cond_7

    .line 204
    .line 205
    :goto_3
    move v0, v1

    .line 206
    move v1, v3

    .line 207
    goto :goto_5

    .line 208
    :cond_7
    if-nez v0, :cond_8

    .line 209
    .line 210
    goto :goto_4

    .line 211
    :cond_8
    move v1, v3

    .line 212
    :goto_4
    move v0, v3

    .line 213
    goto :goto_5

    .line 214
    :cond_9
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    iget-object v0, v0, LA7/N;->n:LA7/P;

    .line 219
    .line 220
    const-string v4, "Service missing"

    .line 221
    .line 222
    invoke-virtual {v0, v4}, LA7/P;->c(Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    goto :goto_3

    .line 226
    :cond_a
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    iget-object v0, v0, LA7/N;->n:LA7/P;

    .line 231
    .line 232
    const-string v4, "Service available"

    .line 233
    .line 234
    invoke-virtual {v0, v4}, LA7/P;->c(Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    goto/16 :goto_1

    .line 238
    .line 239
    :goto_5
    if-nez v1, :cond_b

    .line 240
    .line 241
    iget-object v4, p0, LA7/B0;->a:Ljava/lang/Object;

    .line 242
    .line 243
    check-cast v4, LA7/n0;

    .line 244
    .line 245
    iget-object v4, v4, LA7/n0;->g:LA7/e;

    .line 246
    .line 247
    invoke-virtual {v4}, LA7/e;->r0()Z

    .line 248
    .line 249
    .line 250
    move-result v4

    .line 251
    if-eqz v4, :cond_b

    .line 252
    .line 253
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    iget-object v0, v0, LA7/N;->f:LA7/P;

    .line 258
    .line 259
    const-string v4, "No way to upload. Consider using the full version of Analytics"

    .line 260
    .line 261
    invoke-virtual {v0, v4}, LA7/P;->c(Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    goto :goto_6

    .line 265
    :cond_b
    move v3, v0

    .line 266
    :goto_6
    if-eqz v3, :cond_c

    .line 267
    .line 268
    invoke-virtual {p0}, LA7/B0;->a0()LA7/Z;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    invoke-virtual {v0}, LA7/B0;->c0()V

    .line 273
    .line 274
    .line 275
    invoke-virtual {v0}, LA7/Z;->l0()Landroid/content/SharedPreferences;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 280
    .line 281
    .line 282
    move-result-object v0

    .line 283
    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 284
    .line 285
    .line 286
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 287
    .line 288
    .line 289
    :cond_c
    :goto_7
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 290
    .line 291
    .line 292
    move-result-object v0

    .line 293
    iput-object v0, p0, LA7/m1;->e:Ljava/lang/Boolean;

    .line 294
    .line 295
    :cond_d
    iget-object v0, p0, LA7/m1;->e:Ljava/lang/Boolean;

    .line 296
    .line 297
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 298
    .line 299
    .line 300
    move-result v0

    .line 301
    return v0
.end method

.method public final u0()V
    .locals 5

    .line 1
    invoke-virtual {p0}, LA7/B;->c0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v1, p0, LA7/m1;->h:Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    iget-object v0, v0, LA7/N;->n:LA7/P;

    .line 19
    .line 20
    const-string v3, "Processing queued up service tasks"

    .line 21
    .line 22
    invoke-virtual {v0, v3, v2}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_0

    .line 34
    .line 35
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    check-cast v2, Ljava/lang/Runnable;

    .line 40
    .line 41
    :try_start_0
    invoke-interface {v2}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :catch_0
    move-exception v2

    .line 46
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    const-string v4, "Task exception while flushing queue"

    .line 51
    .line 52
    iget-object v3, v3, LA7/N;->f:LA7/P;

    .line 53
    .line 54
    invoke-virtual {v3, v4, v2}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 59
    .line 60
    .line 61
    iget-object v0, p0, LA7/m1;->i:LA7/n1;

    .line 62
    .line 63
    invoke-virtual {v0}, LA7/n;->a()V

    .line 64
    .line 65
    .line 66
    return-void
.end method

.method public final v0()V
    .locals 3

    .line 1
    invoke-virtual {p0}, LA7/B;->c0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LA7/m1;->g:LA2/d;

    .line 5
    .line 6
    iget-object v1, v0, LA2/d;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Ln7/b;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 14
    .line 15
    .line 16
    move-result-wide v1

    .line 17
    iput-wide v1, v0, LA2/d;->b:J

    .line 18
    .line 19
    sget-object v0, LA7/y;->M:LA7/D;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    invoke-virtual {v0, v1}, LA7/D;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, Ljava/lang/Long;

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 29
    .line 30
    .line 31
    move-result-wide v0

    .line 32
    iget-object v2, p0, LA7/m1;->f:LA7/n1;

    .line 33
    .line 34
    invoke-virtual {v2, v0, v1}, LA7/n;->b(J)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public final w0(Z)LA7/N1;
    .locals 46

    .line 1
    const/4 v2, 0x1

    .line 2
    move-object/from16 v3, p0

    .line 3
    .line 4
    iget-object v0, v3, LA7/B0;->a:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, LA7/n0;

    .line 7
    .line 8
    invoke-virtual {v0}, LA7/n0;->j()LA7/I;

    .line 9
    .line 10
    .line 11
    move-result-object v4

    .line 12
    const-wide/16 v5, 0x0

    .line 13
    .line 14
    const/4 v7, 0x0

    .line 15
    if-eqz p1, :cond_8

    .line 16
    .line 17
    invoke-virtual {v3}, LA7/B0;->zzj()LA7/N;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, LA7/B0;->a0()LA7/Z;

    .line 22
    .line 23
    .line 24
    move-result-object v8

    .line 25
    iget-object v8, v8, LA7/Z;->f:LA7/c0;

    .line 26
    .line 27
    if-nez v8, :cond_0

    .line 28
    .line 29
    goto/16 :goto_4

    .line 30
    .line 31
    :cond_0
    invoke-virtual {v0}, LA7/B0;->a0()LA7/Z;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iget-object v0, v0, LA7/Z;->f:LA7/c0;

    .line 36
    .line 37
    iget-object v8, v0, LA7/c0;->e:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v8, LA7/Z;

    .line 40
    .line 41
    invoke-virtual {v8}, LA7/B0;->c0()V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v8}, LA7/B0;->c0()V

    .line 45
    .line 46
    .line 47
    iget-object v9, v0, LA7/c0;->e:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v9, LA7/Z;

    .line 50
    .line 51
    invoke-virtual {v9}, LA7/Z;->l0()Landroid/content/SharedPreferences;

    .line 52
    .line 53
    .line 54
    move-result-object v9

    .line 55
    iget-object v10, v0, LA7/c0;->b:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v10, Ljava/lang/String;

    .line 58
    .line 59
    invoke-interface {v9, v10, v5, v6}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 60
    .line 61
    .line 62
    move-result-wide v9

    .line 63
    cmp-long v11, v9, v5

    .line 64
    .line 65
    if-nez v11, :cond_1

    .line 66
    .line 67
    invoke-virtual {v0}, LA7/c0;->n()V

    .line 68
    .line 69
    .line 70
    move-wide v9, v5

    .line 71
    goto :goto_0

    .line 72
    :cond_1
    iget-object v11, v8, LA7/B0;->a:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v11, LA7/n0;

    .line 75
    .line 76
    iget-object v11, v11, LA7/n0;->n:Ln7/b;

    .line 77
    .line 78
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 82
    .line 83
    .line 84
    move-result-wide v11

    .line 85
    sub-long/2addr v9, v11

    .line 86
    invoke-static {v9, v10}, Ljava/lang/Math;->abs(J)J

    .line 87
    .line 88
    .line 89
    move-result-wide v9

    .line 90
    :goto_0
    iget-wide v11, v0, LA7/c0;->a:J

    .line 91
    .line 92
    cmp-long v13, v9, v11

    .line 93
    .line 94
    if-gez v13, :cond_2

    .line 95
    .line 96
    :goto_1
    move-object v0, v7

    .line 97
    goto :goto_3

    .line 98
    :cond_2
    shl-long/2addr v11, v2

    .line 99
    cmp-long v9, v9, v11

    .line 100
    .line 101
    if-lez v9, :cond_3

    .line 102
    .line 103
    invoke-virtual {v0}, LA7/c0;->n()V

    .line 104
    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_3
    invoke-virtual {v8}, LA7/Z;->l0()Landroid/content/SharedPreferences;

    .line 108
    .line 109
    .line 110
    move-result-object v9

    .line 111
    iget-object v10, v0, LA7/c0;->d:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast v10, Ljava/lang/String;

    .line 114
    .line 115
    invoke-interface {v9, v10, v7}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v9

    .line 119
    invoke-virtual {v8}, LA7/Z;->l0()Landroid/content/SharedPreferences;

    .line 120
    .line 121
    .line 122
    move-result-object v8

    .line 123
    iget-object v10, v0, LA7/c0;->c:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast v10, Ljava/lang/String;

    .line 126
    .line 127
    invoke-interface {v8, v10, v5, v6}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 128
    .line 129
    .line 130
    move-result-wide v10

    .line 131
    invoke-virtual {v0}, LA7/c0;->n()V

    .line 132
    .line 133
    .line 134
    if-eqz v9, :cond_5

    .line 135
    .line 136
    cmp-long v0, v10, v5

    .line 137
    .line 138
    if-gtz v0, :cond_4

    .line 139
    .line 140
    goto :goto_2

    .line 141
    :cond_4
    new-instance v0, Landroid/util/Pair;

    .line 142
    .line 143
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 144
    .line 145
    .line 146
    move-result-object v8

    .line 147
    invoke-direct {v0, v9, v8}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    goto :goto_3

    .line 151
    :cond_5
    :goto_2
    sget-object v0, LA7/Z;->A:Landroid/util/Pair;

    .line 152
    .line 153
    :goto_3
    if-eqz v0, :cond_7

    .line 154
    .line 155
    sget-object v8, LA7/Z;->A:Landroid/util/Pair;

    .line 156
    .line 157
    if-ne v0, v8, :cond_6

    .line 158
    .line 159
    goto :goto_4

    .line 160
    :cond_6
    iget-object v8, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 161
    .line 162
    invoke-static {v8}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v8

    .line 166
    iget-object v0, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 167
    .line 168
    check-cast v0, Ljava/lang/String;

    .line 169
    .line 170
    const-string v9, ":"

    .line 171
    .line 172
    invoke-static {v8, v9, v0}, LN0/a;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    goto :goto_5

    .line 177
    :cond_7
    :goto_4
    move-object v0, v7

    .line 178
    :goto_5
    move-object/from16 v19, v0

    .line 179
    .line 180
    goto :goto_6

    .line 181
    :cond_8
    move-object/from16 v19, v7

    .line 182
    .line 183
    :goto_6
    invoke-virtual {v4}, LA7/B;->c0()V

    .line 184
    .line 185
    .line 186
    new-instance v8, LA7/N1;

    .line 187
    .line 188
    invoke-virtual {v4}, LA7/I;->k0()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v9

    .line 192
    invoke-virtual {v4}, LA7/I;->l0()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v10

    .line 196
    invoke-virtual {v4}, LA7/Y;->h0()V

    .line 197
    .line 198
    .line 199
    iget-object v11, v4, LA7/I;->d:Ljava/lang/String;

    .line 200
    .line 201
    invoke-virtual {v4}, LA7/Y;->h0()V

    .line 202
    .line 203
    .line 204
    iget v0, v4, LA7/I;->e:I

    .line 205
    .line 206
    int-to-long v12, v0

    .line 207
    invoke-virtual {v4}, LA7/Y;->h0()V

    .line 208
    .line 209
    .line 210
    iget-object v0, v4, LA7/I;->f:Ljava/lang/String;

    .line 211
    .line 212
    invoke-static {v0}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 213
    .line 214
    .line 215
    iget-object v14, v4, LA7/I;->f:Ljava/lang/String;

    .line 216
    .line 217
    invoke-virtual {v4}, LA7/Y;->h0()V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v4}, LA7/B;->c0()V

    .line 221
    .line 222
    .line 223
    move-wide v15, v5

    .line 224
    iget-wide v5, v4, LA7/I;->g:J

    .line 225
    .line 226
    cmp-long v0, v5, v15

    .line 227
    .line 228
    iget-object v5, v4, LA7/B0;->a:Ljava/lang/Object;

    .line 229
    .line 230
    check-cast v5, LA7/n0;

    .line 231
    .line 232
    if-nez v0, :cond_c

    .line 233
    .line 234
    iget-object v6, v5, LA7/n0;->l:LA7/U1;

    .line 235
    .line 236
    invoke-static {v6}, LA7/n0;->c(LA7/B0;)V

    .line 237
    .line 238
    .line 239
    iget-object v0, v5, LA7/n0;->a:Landroid/content/Context;

    .line 240
    .line 241
    move-wide/from16 v17, v15

    .line 242
    .line 243
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v15

    .line 247
    invoke-virtual {v6}, LA7/B0;->c0()V

    .line 248
    .line 249
    .line 250
    invoke-static {v15}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 254
    .line 255
    .line 256
    move-result-object v16

    .line 257
    const/16 v20, 0x0

    .line 258
    .line 259
    invoke-static {}, LA7/U1;->q1()Ljava/security/MessageDigest;

    .line 260
    .line 261
    .line 262
    move-result-object v1

    .line 263
    const-wide/16 v21, -0x1

    .line 264
    .line 265
    if-nez v1, :cond_9

    .line 266
    .line 267
    invoke-virtual {v6}, LA7/B0;->zzj()LA7/N;

    .line 268
    .line 269
    .line 270
    move-result-object v0

    .line 271
    const-string v1, "Could not get MD5 instance"

    .line 272
    .line 273
    iget-object v0, v0, LA7/N;->f:LA7/P;

    .line 274
    .line 275
    invoke-virtual {v0, v1}, LA7/P;->c(Ljava/lang/String;)V

    .line 276
    .line 277
    .line 278
    move/from16 v16, v2

    .line 279
    .line 280
    :goto_7
    move-wide/from16 v0, v21

    .line 281
    .line 282
    goto :goto_a

    .line 283
    :cond_9
    if-eqz v16, :cond_b

    .line 284
    .line 285
    :try_start_0
    invoke-virtual {v6, v0, v15}, LA7/U1;->a1(Landroid/content/Context;Ljava/lang/String;)Z

    .line 286
    .line 287
    .line 288
    move-result v15

    .line 289
    if-nez v15, :cond_b

    .line 290
    .line 291
    invoke-static {v0}, Lp7/c;->a(Landroid/content/Context;)LE0/a;

    .line 292
    .line 293
    .line 294
    move-result-object v0

    .line 295
    iget-object v15, v6, LA7/B0;->a:Ljava/lang/Object;

    .line 296
    .line 297
    check-cast v15, LA7/n0;

    .line 298
    .line 299
    iget-object v15, v15, LA7/n0;->a:Landroid/content/Context;

    .line 300
    .line 301
    invoke-virtual {v15}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object v15
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_1

    .line 305
    move/from16 v16, v2

    .line 306
    .line 307
    const/16 v2, 0x40

    .line 308
    .line 309
    :try_start_1
    invoke-virtual {v0, v2, v15}, LE0/a;->c(ILjava/lang/String;)Landroid/content/pm/PackageInfo;

    .line 310
    .line 311
    .line 312
    move-result-object v0

    .line 313
    iget-object v0, v0, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    .line 314
    .line 315
    if-eqz v0, :cond_a

    .line 316
    .line 317
    array-length v2, v0

    .line 318
    if-lez v2, :cond_a

    .line 319
    .line 320
    aget-object v0, v0, v20

    .line 321
    .line 322
    invoke-virtual {v0}, Landroid/content/pm/Signature;->toByteArray()[B

    .line 323
    .line 324
    .line 325
    move-result-object v0

    .line 326
    invoke-virtual {v1, v0}, Ljava/security/MessageDigest;->digest([B)[B

    .line 327
    .line 328
    .line 329
    move-result-object v0

    .line 330
    invoke-static {v0}, LA7/U1;->l0([B)J

    .line 331
    .line 332
    .line 333
    move-result-wide v21

    .line 334
    goto :goto_7

    .line 335
    :catch_0
    move-exception v0

    .line 336
    goto :goto_8

    .line 337
    :cond_a
    invoke-virtual {v6}, LA7/B0;->zzj()LA7/N;

    .line 338
    .line 339
    .line 340
    move-result-object v0

    .line 341
    iget-object v0, v0, LA7/N;->i:LA7/P;

    .line 342
    .line 343
    const-string v1, "Could not get signatures"

    .line 344
    .line 345
    invoke-virtual {v0, v1}, LA7/P;->c(Ljava/lang/String;)V
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_0

    .line 346
    .line 347
    .line 348
    goto :goto_7

    .line 349
    :catch_1
    move-exception v0

    .line 350
    move/from16 v16, v2

    .line 351
    .line 352
    goto :goto_8

    .line 353
    :cond_b
    move/from16 v16, v2

    .line 354
    .line 355
    goto :goto_9

    .line 356
    :goto_8
    invoke-virtual {v6}, LA7/B0;->zzj()LA7/N;

    .line 357
    .line 358
    .line 359
    move-result-object v1

    .line 360
    const-string v2, "Package name not found"

    .line 361
    .line 362
    iget-object v1, v1, LA7/N;->f:LA7/P;

    .line 363
    .line 364
    invoke-virtual {v1, v2, v0}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 365
    .line 366
    .line 367
    :goto_9
    move-wide/from16 v0, v17

    .line 368
    .line 369
    :goto_a
    iput-wide v0, v4, LA7/I;->g:J

    .line 370
    .line 371
    goto :goto_b

    .line 372
    :cond_c
    move-wide/from16 v17, v15

    .line 373
    .line 374
    const/16 v20, 0x0

    .line 375
    .line 376
    move/from16 v16, v2

    .line 377
    .line 378
    :goto_b
    iget-wide v0, v4, LA7/I;->g:J

    .line 379
    .line 380
    invoke-virtual {v5}, LA7/n0;->e()Z

    .line 381
    .line 382
    .line 383
    move-result v2

    .line 384
    iget-object v6, v5, LA7/n0;->a:Landroid/content/Context;

    .line 385
    .line 386
    invoke-virtual {v4}, LA7/B0;->a0()LA7/Z;

    .line 387
    .line 388
    .line 389
    move-result-object v15

    .line 390
    iget-boolean v15, v15, LA7/Z;->s:Z

    .line 391
    .line 392
    xor-int/lit8 v21, v15, 0x1

    .line 393
    .line 394
    invoke-virtual {v4}, LA7/B;->c0()V

    .line 395
    .line 396
    .line 397
    invoke-virtual {v5}, LA7/n0;->e()Z

    .line 398
    .line 399
    .line 400
    move-result v15

    .line 401
    iget-object v7, v5, LA7/n0;->g:LA7/e;

    .line 402
    .line 403
    if-nez v15, :cond_d

    .line 404
    .line 405
    move-wide/from16 v23, v0

    .line 406
    .line 407
    move/from16 p1, v2

    .line 408
    .line 409
    const/4 v1, 0x0

    .line 410
    goto/16 :goto_f

    .line 411
    .line 412
    :cond_d
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzpz;->zza()Z

    .line 413
    .line 414
    .line 415
    move-result v15

    .line 416
    if-eqz v15, :cond_e

    .line 417
    .line 418
    sget-object v15, LA7/y;->r0:LA7/D;

    .line 419
    .line 420
    move-wide/from16 v23, v0

    .line 421
    .line 422
    const/4 v1, 0x0

    .line 423
    invoke-virtual {v7, v1, v15}, LA7/e;->o0(Ljava/lang/String;LA7/D;)Z

    .line 424
    .line 425
    .line 426
    move-result v0

    .line 427
    if-eqz v0, :cond_f

    .line 428
    .line 429
    invoke-virtual {v4}, LA7/B0;->zzj()LA7/N;

    .line 430
    .line 431
    .line 432
    move-result-object v0

    .line 433
    const-string v1, "Disabled IID for tests."

    .line 434
    .line 435
    iget-object v0, v0, LA7/N;->n:LA7/P;

    .line 436
    .line 437
    invoke-virtual {v0, v1}, LA7/P;->c(Ljava/lang/String;)V

    .line 438
    .line 439
    .line 440
    :catch_2
    :goto_c
    move/from16 p1, v2

    .line 441
    .line 442
    :goto_d
    const/4 v0, 0x0

    .line 443
    goto :goto_e

    .line 444
    :cond_e
    move-wide/from16 v23, v0

    .line 445
    .line 446
    :cond_f
    :try_start_2
    invoke-virtual {v6}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 447
    .line 448
    .line 449
    move-result-object v0

    .line 450
    const-string v1, "com.google.firebase.analytics.FirebaseAnalytics"

    .line 451
    .line 452
    invoke-virtual {v0, v1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 453
    .line 454
    .line 455
    move-result-object v0
    :try_end_2
    .catch Ljava/lang/ClassNotFoundException; {:try_start_2 .. :try_end_2} :catch_2

    .line 456
    if-nez v0, :cond_10

    .line 457
    .line 458
    goto :goto_c

    .line 459
    :cond_10
    :try_start_3
    const-string v1, "getInstance"
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_4

    .line 460
    .line 461
    move/from16 p1, v2

    .line 462
    .line 463
    move/from16 v15, v16

    .line 464
    .line 465
    :try_start_4
    new-array v2, v15, [Ljava/lang/Class;

    .line 466
    .line 467
    const-class v16, Landroid/content/Context;

    .line 468
    .line 469
    aput-object v16, v2, v20

    .line 470
    .line 471
    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 472
    .line 473
    .line 474
    move-result-object v1

    .line 475
    new-array v2, v15, [Ljava/lang/Object;

    .line 476
    .line 477
    aput-object v6, v2, v20

    .line 478
    .line 479
    const/4 v6, 0x0

    .line 480
    invoke-virtual {v1, v6, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 481
    .line 482
    .line 483
    move-result-object v1
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_5

    .line 484
    if-nez v1, :cond_11

    .line 485
    .line 486
    goto :goto_d

    .line 487
    :cond_11
    :try_start_5
    const-string v2, "getFirebaseInstanceId"

    .line 488
    .line 489
    move/from16 v6, v20

    .line 490
    .line 491
    new-array v15, v6, [Ljava/lang/Class;

    .line 492
    .line 493
    invoke-virtual {v0, v2, v15}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 494
    .line 495
    .line 496
    move-result-object v0

    .line 497
    new-array v2, v6, [Ljava/lang/Object;

    .line 498
    .line 499
    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 500
    .line 501
    .line 502
    move-result-object v0

    .line 503
    check-cast v0, Ljava/lang/String;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3

    .line 504
    .line 505
    goto :goto_e

    .line 506
    :catch_3
    invoke-virtual {v4}, LA7/B0;->zzj()LA7/N;

    .line 507
    .line 508
    .line 509
    move-result-object v0

    .line 510
    const-string v1, "Failed to retrieve Firebase Instance Id"

    .line 511
    .line 512
    iget-object v0, v0, LA7/N;->k:LA7/P;

    .line 513
    .line 514
    invoke-virtual {v0, v1}, LA7/P;->c(Ljava/lang/String;)V

    .line 515
    .line 516
    .line 517
    goto :goto_d

    .line 518
    :catch_4
    move/from16 p1, v2

    .line 519
    .line 520
    :catch_5
    invoke-virtual {v4}, LA7/B0;->zzj()LA7/N;

    .line 521
    .line 522
    .line 523
    move-result-object v0

    .line 524
    const-string v1, "Failed to obtain Firebase Analytics instance"

    .line 525
    .line 526
    iget-object v0, v0, LA7/N;->j:LA7/P;

    .line 527
    .line 528
    invoke-virtual {v0, v1}, LA7/P;->c(Ljava/lang/String;)V

    .line 529
    .line 530
    .line 531
    goto :goto_d

    .line 532
    :goto_e
    move-object v1, v0

    .line 533
    :goto_f
    iget-object v0, v5, LA7/n0;->h:LA7/Z;

    .line 534
    .line 535
    invoke-static {v0}, LA7/n0;->c(LA7/B0;)V

    .line 536
    .line 537
    .line 538
    iget-object v0, v0, LA7/Z;->g:LA7/a0;

    .line 539
    .line 540
    move-object v2, v1

    .line 541
    invoke-virtual {v0}, LA7/a0;->d()J

    .line 542
    .line 543
    .line 544
    move-result-wide v0

    .line 545
    cmp-long v6, v0, v17

    .line 546
    .line 547
    move-object v15, v2

    .line 548
    iget-wide v2, v5, LA7/n0;->H:J

    .line 549
    .line 550
    if-nez v6, :cond_12

    .line 551
    .line 552
    goto :goto_10

    .line 553
    :cond_12
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    .line 554
    .line 555
    .line 556
    move-result-wide v2

    .line 557
    :goto_10
    invoke-virtual {v4}, LA7/Y;->h0()V

    .line 558
    .line 559
    .line 560
    iget v0, v4, LA7/I;->k:I

    .line 561
    .line 562
    const-string v1, "google_analytics_adid_collection_enabled"

    .line 563
    .line 564
    invoke-virtual {v7, v1}, LA7/e;->m0(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 565
    .line 566
    .line 567
    move-result-object v1

    .line 568
    if-eqz v1, :cond_14

    .line 569
    .line 570
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 571
    .line 572
    .line 573
    move-result v1

    .line 574
    if-eqz v1, :cond_13

    .line 575
    .line 576
    goto :goto_11

    .line 577
    :cond_13
    const/16 v26, 0x0

    .line 578
    .line 579
    goto :goto_12

    .line 580
    :cond_14
    :goto_11
    const/16 v26, 0x1

    .line 581
    .line 582
    :goto_12
    invoke-virtual {v4}, LA7/B0;->a0()LA7/Z;

    .line 583
    .line 584
    .line 585
    move-result-object v1

    .line 586
    invoke-virtual {v1}, LA7/B0;->c0()V

    .line 587
    .line 588
    .line 589
    invoke-virtual {v1}, LA7/Z;->l0()Landroid/content/SharedPreferences;

    .line 590
    .line 591
    .line 592
    move-result-object v1

    .line 593
    const-string v6, "deferred_analytics_collection"

    .line 594
    .line 595
    move-wide/from16 v27, v2

    .line 596
    .line 597
    const/4 v2, 0x0

    .line 598
    invoke-interface {v1, v6, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 599
    .line 600
    .line 601
    move-result v1

    .line 602
    invoke-virtual {v4}, LA7/Y;->h0()V

    .line 603
    .line 604
    .line 605
    iget-object v2, v4, LA7/I;->m:Ljava/lang/String;

    .line 606
    .line 607
    const-string v3, "google_analytics_default_allow_ad_personalization_signals"

    .line 608
    .line 609
    invoke-virtual {v7, v3}, LA7/e;->m0(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 610
    .line 611
    .line 612
    move-result-object v6

    .line 613
    if-nez v6, :cond_15

    .line 614
    .line 615
    const/16 v29, 0x0

    .line 616
    .line 617
    goto :goto_13

    .line 618
    :cond_15
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 619
    .line 620
    .line 621
    move-result v6

    .line 622
    const/16 v16, 0x1

    .line 623
    .line 624
    xor-int/lit8 v6, v6, 0x1

    .line 625
    .line 626
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 627
    .line 628
    .line 629
    move-result-object v6

    .line 630
    move-object/from16 v29, v6

    .line 631
    .line 632
    :goto_13
    iget-object v6, v4, LA7/I;->i:Ljava/util/List;

    .line 633
    .line 634
    invoke-virtual {v4}, LA7/B0;->a0()LA7/Z;

    .line 635
    .line 636
    .line 637
    move-result-object v25

    .line 638
    invoke-virtual/range {v25 .. v25}, LA7/Z;->n0()LA7/F0;

    .line 639
    .line 640
    .line 641
    move-result-object v25

    .line 642
    invoke-virtual/range {v25 .. v25}, LA7/F0;->m()Ljava/lang/String;

    .line 643
    .line 644
    .line 645
    move-result-object v33

    .line 646
    move/from16 v25, v0

    .line 647
    .line 648
    iget-object v0, v4, LA7/I;->j:Ljava/lang/String;

    .line 649
    .line 650
    if-nez v0, :cond_16

    .line 651
    .line 652
    invoke-virtual {v4}, LA7/B0;->b0()LA7/U1;

    .line 653
    .line 654
    .line 655
    move-result-object v0

    .line 656
    invoke-virtual {v0}, LA7/U1;->p1()Ljava/lang/String;

    .line 657
    .line 658
    .line 659
    move-result-object v0

    .line 660
    iput-object v0, v4, LA7/I;->j:Ljava/lang/String;

    .line 661
    .line 662
    :cond_16
    iget-object v0, v4, LA7/I;->j:Ljava/lang/String;

    .line 663
    .line 664
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zznm;->zza()Z

    .line 665
    .line 666
    .line 667
    move-result v30

    .line 668
    move-object/from16 v34, v0

    .line 669
    .line 670
    if-eqz v30, :cond_17

    .line 671
    .line 672
    sget-object v0, LA7/y;->X0:LA7/D;

    .line 673
    .line 674
    move/from16 v30, v1

    .line 675
    .line 676
    const/4 v1, 0x0

    .line 677
    invoke-virtual {v7, v1, v0}, LA7/e;->o0(Ljava/lang/String;LA7/D;)Z

    .line 678
    .line 679
    .line 680
    move-result v0

    .line 681
    if-eqz v0, :cond_18

    .line 682
    .line 683
    invoke-virtual {v4}, LA7/B0;->a0()LA7/Z;

    .line 684
    .line 685
    .line 686
    move-result-object v0

    .line 687
    invoke-virtual {v0}, LA7/Z;->n0()LA7/F0;

    .line 688
    .line 689
    .line 690
    move-result-object v0

    .line 691
    sget-object v1, LA7/E0;->c:LA7/E0;

    .line 692
    .line 693
    invoke-virtual {v0, v1}, LA7/F0;->i(LA7/E0;)Z

    .line 694
    .line 695
    .line 696
    move-result v0

    .line 697
    if-nez v0, :cond_18

    .line 698
    .line 699
    const/16 v35, 0x0

    .line 700
    .line 701
    goto :goto_14

    .line 702
    :cond_17
    move/from16 v30, v1

    .line 703
    .line 704
    :cond_18
    invoke-virtual {v4}, LA7/B;->c0()V

    .line 705
    .line 706
    .line 707
    iget-wide v0, v4, LA7/I;->o:J

    .line 708
    .line 709
    cmp-long v0, v0, v17

    .line 710
    .line 711
    if-eqz v0, :cond_19

    .line 712
    .line 713
    iget-object v0, v5, LA7/n0;->n:Ln7/b;

    .line 714
    .line 715
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 716
    .line 717
    .line 718
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 719
    .line 720
    .line 721
    move-result-wide v0

    .line 722
    move-wide/from16 v31, v0

    .line 723
    .line 724
    iget-wide v0, v4, LA7/I;->o:J

    .line 725
    .line 726
    sub-long v0, v31, v0

    .line 727
    .line 728
    iget-object v5, v4, LA7/I;->n:Ljava/lang/String;

    .line 729
    .line 730
    if-eqz v5, :cond_19

    .line 731
    .line 732
    const-wide/32 v31, 0x5265c00

    .line 733
    .line 734
    .line 735
    cmp-long v0, v0, v31

    .line 736
    .line 737
    if-lez v0, :cond_19

    .line 738
    .line 739
    iget-object v0, v4, LA7/I;->p:Ljava/lang/String;

    .line 740
    .line 741
    if-nez v0, :cond_19

    .line 742
    .line 743
    invoke-virtual {v4}, LA7/I;->m0()V

    .line 744
    .line 745
    .line 746
    :cond_19
    iget-object v0, v4, LA7/I;->n:Ljava/lang/String;

    .line 747
    .line 748
    if-nez v0, :cond_1a

    .line 749
    .line 750
    invoke-virtual {v4}, LA7/I;->m0()V

    .line 751
    .line 752
    .line 753
    :cond_1a
    iget-object v0, v4, LA7/I;->n:Ljava/lang/String;

    .line 754
    .line 755
    move-object/from16 v35, v0

    .line 756
    .line 757
    :goto_14
    const-string v0, "google_analytics_sgtm_upload_enabled"

    .line 758
    .line 759
    invoke-virtual {v7, v0}, LA7/e;->m0(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 760
    .line 761
    .line 762
    move-result-object v0

    .line 763
    if-nez v0, :cond_1b

    .line 764
    .line 765
    const/16 v36, 0x0

    .line 766
    .line 767
    goto :goto_15

    .line 768
    :cond_1b
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 769
    .line 770
    .line 771
    move-result v0

    .line 772
    move/from16 v36, v0

    .line 773
    .line 774
    :goto_15
    invoke-virtual {v4}, LA7/B0;->b0()LA7/U1;

    .line 775
    .line 776
    .line 777
    move-result-object v0

    .line 778
    invoke-virtual {v4}, LA7/I;->k0()Ljava/lang/String;

    .line 779
    .line 780
    .line 781
    move-result-object v1

    .line 782
    iget-object v5, v0, LA7/B0;->a:Ljava/lang/Object;

    .line 783
    .line 784
    check-cast v5, LA7/n0;

    .line 785
    .line 786
    move-object/from16 v31, v0

    .line 787
    .line 788
    iget-object v0, v5, LA7/n0;->a:Landroid/content/Context;

    .line 789
    .line 790
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 791
    .line 792
    .line 793
    move-result-object v0

    .line 794
    if-nez v0, :cond_1c

    .line 795
    .line 796
    move-wide/from16 v37, v17

    .line 797
    .line 798
    goto :goto_17

    .line 799
    :cond_1c
    :try_start_6
    iget-object v0, v5, LA7/n0;->a:Landroid/content/Context;

    .line 800
    .line 801
    invoke-static {v0}, Lp7/c;->a(Landroid/content/Context;)LE0/a;

    .line 802
    .line 803
    .line 804
    move-result-object v0
    :try_end_6
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_6 .. :try_end_6} :catch_6

    .line 805
    const/4 v5, 0x0

    .line 806
    :try_start_7
    invoke-virtual {v0, v5, v1}, LE0/a;->a(ILjava/lang/String;)Landroid/content/pm/ApplicationInfo;

    .line 807
    .line 808
    .line 809
    move-result-object v0

    .line 810
    if-eqz v0, :cond_1d

    .line 811
    .line 812
    iget v0, v0, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I
    :try_end_7
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_7 .. :try_end_7} :catch_7

    .line 813
    .line 814
    goto :goto_16

    .line 815
    :cond_1d
    move v0, v5

    .line 816
    goto :goto_16

    .line 817
    :catch_6
    const/4 v5, 0x0

    .line 818
    :catch_7
    invoke-virtual/range {v31 .. v31}, LA7/B0;->zzj()LA7/N;

    .line 819
    .line 820
    .line 821
    move-result-object v0

    .line 822
    const-string v5, "PackageManager failed to find running app: app_id"

    .line 823
    .line 824
    iget-object v0, v0, LA7/N;->l:LA7/P;

    .line 825
    .line 826
    invoke-virtual {v0, v5, v1}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 827
    .line 828
    .line 829
    const/4 v0, 0x0

    .line 830
    :goto_16
    int-to-long v0, v0

    .line 831
    move-wide/from16 v37, v0

    .line 832
    .line 833
    :goto_17
    invoke-virtual {v4}, LA7/B0;->a0()LA7/Z;

    .line 834
    .line 835
    .line 836
    move-result-object v0

    .line 837
    invoke-virtual {v0}, LA7/Z;->n0()LA7/F0;

    .line 838
    .line 839
    .line 840
    move-result-object v0

    .line 841
    invoke-virtual {v4}, LA7/B0;->a0()LA7/Z;

    .line 842
    .line 843
    .line 844
    move-result-object v1

    .line 845
    invoke-virtual {v1}, LA7/B0;->c0()V

    .line 846
    .line 847
    .line 848
    invoke-virtual {v1}, LA7/Z;->l0()Landroid/content/SharedPreferences;

    .line 849
    .line 850
    .line 851
    move-result-object v1

    .line 852
    const-string v5, "dma_consent_settings"

    .line 853
    .line 854
    move-object/from16 v31, v2

    .line 855
    .line 856
    const/4 v2, 0x0

    .line 857
    invoke-interface {v1, v5, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 858
    .line 859
    .line 860
    move-result-object v1

    .line 861
    invoke-static {v1}, LA7/o;->b(Ljava/lang/String;)LA7/o;

    .line 862
    .line 863
    .line 864
    move-result-object v1

    .line 865
    iget-object v1, v1, LA7/o;->b:Ljava/lang/String;

    .line 866
    .line 867
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzpn;->zza()Z

    .line 868
    .line 869
    .line 870
    move-result v5

    .line 871
    if-eqz v5, :cond_1f

    .line 872
    .line 873
    sget-object v5, LA7/y;->I0:LA7/D;

    .line 874
    .line 875
    invoke-virtual {v7, v2, v5}, LA7/e;->o0(Ljava/lang/String;LA7/D;)Z

    .line 876
    .line 877
    .line 878
    move-result v5

    .line 879
    if-eqz v5, :cond_1f

    .line 880
    .line 881
    invoke-virtual {v4}, LA7/B0;->b0()LA7/U1;

    .line 882
    .line 883
    .line 884
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 885
    .line 886
    const/16 v5, 0x1e

    .line 887
    .line 888
    if-lt v2, v5, :cond_1e

    .line 889
    .line 890
    invoke-static {}, Lcom/applovin/impl/sdk/z;->w()I

    .line 891
    .line 892
    .line 893
    move-result v2

    .line 894
    const/4 v5, 0x3

    .line 895
    if-le v2, v5, :cond_1e

    .line 896
    .line 897
    invoke-static {}, LA7/N0;->a()I

    .line 898
    .line 899
    .line 900
    move-result v2

    .line 901
    goto :goto_18

    .line 902
    :cond_1e
    const/4 v2, 0x0

    .line 903
    :goto_18
    move/from16 v41, v2

    .line 904
    .line 905
    goto :goto_19

    .line 906
    :cond_1f
    const/16 v41, 0x0

    .line 907
    .line 908
    :goto_19
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzpn;->zza()Z

    .line 909
    .line 910
    .line 911
    move-result v2

    .line 912
    if-eqz v2, :cond_20

    .line 913
    .line 914
    sget-object v2, LA7/y;->I0:LA7/D;

    .line 915
    .line 916
    const/4 v5, 0x0

    .line 917
    invoke-virtual {v7, v5, v2}, LA7/e;->o0(Ljava/lang/String;LA7/D;)Z

    .line 918
    .line 919
    .line 920
    move-result v2

    .line 921
    if-eqz v2, :cond_20

    .line 922
    .line 923
    invoke-virtual {v4}, LA7/B0;->b0()LA7/U1;

    .line 924
    .line 925
    .line 926
    move-result-object v2

    .line 927
    invoke-virtual {v2}, LA7/U1;->n1()J

    .line 928
    .line 929
    .line 930
    move-result-wide v17

    .line 931
    :cond_20
    move-wide/from16 v42, v17

    .line 932
    .line 933
    iget-object v2, v7, LA7/e;->c:Ljava/lang/String;

    .line 934
    .line 935
    const/4 v5, 0x1

    .line 936
    invoke-virtual {v7, v3, v5}, LA7/e;->k0(Ljava/lang/String;Z)LA7/H0;

    .line 937
    .line 938
    .line 939
    move-result-object v3

    .line 940
    invoke-static {v3}, LA7/F0;->a(LA7/H0;)C

    .line 941
    .line 942
    .line 943
    move-result v3

    .line 944
    invoke-static {v3}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 945
    .line 946
    .line 947
    move-result-object v45

    .line 948
    move-object/from16 v22, v15

    .line 949
    .line 950
    const-wide/32 v15, 0x19e10

    .line 951
    .line 952
    .line 953
    iget-wide v3, v4, LA7/I;->h:J

    .line 954
    .line 955
    iget v0, v0, LA7/F0;->b:I

    .line 956
    .line 957
    move/from16 v20, p1

    .line 958
    .line 959
    move/from16 v39, v0

    .line 960
    .line 961
    move-object/from16 v40, v1

    .line 962
    .line 963
    move-object/from16 v44, v2

    .line 964
    .line 965
    move-object/from16 v32, v6

    .line 966
    .line 967
    move-wide/from16 v17, v23

    .line 968
    .line 969
    move-wide/from16 v23, v27

    .line 970
    .line 971
    move/from16 v27, v30

    .line 972
    .line 973
    move-object/from16 v28, v31

    .line 974
    .line 975
    move-wide/from16 v30, v3

    .line 976
    .line 977
    invoke-direct/range {v8 .. v45}, LA7/N1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;JJLjava/lang/String;ZZLjava/lang/String;JIZZLjava/lang/String;Ljava/lang/Boolean;JLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJILjava/lang/String;IJLjava/lang/String;Ljava/lang/String;)V

    .line 978
    .line 979
    .line 980
    return-object v8
.end method
