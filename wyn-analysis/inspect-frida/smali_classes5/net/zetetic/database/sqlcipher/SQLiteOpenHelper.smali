.class public abstract Lnet/zetetic/database/sqlcipher/SQLiteOpenHelper;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo3/d;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/lang/String;

.field public final c:Lnet/zetetic/database/sqlcipher/SQLiteDatabase$CursorFactory;

.field public final d:I

.field public final e:I

.field public f:Lnet/zetetic/database/sqlcipher/SQLiteDatabase;

.field public final g:[B

.field public h:Z

.field public i:Z

.field public final j:Lnet/zetetic/database/DatabaseErrorHandler;

.field public final k:Lnet/zetetic/database/sqlcipher/SQLiteDatabaseHook;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lnet/zetetic/database/sqlcipher/SQLiteDatabase$CursorFactory;IILnet/zetetic/database/DatabaseErrorHandler;Lnet/zetetic/database/sqlcipher/SQLiteDatabaseHook;Z)V
    .locals 11

    if-eqz p3, :cond_1

    .line 21
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 22
    :cond_0
    invoke-static {p3}, Ljava/nio/CharBuffer;->wrap(Ljava/lang/CharSequence;)Ljava/nio/CharBuffer;

    move-result-object p3

    .line 23
    const-string v0, "UTF-8"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-virtual {v0, p3}, Ljava/nio/charset/Charset;->encode(Ljava/nio/CharBuffer;)Ljava/nio/ByteBuffer;

    move-result-object p3

    .line 24
    invoke-virtual {p3}, Ljava/nio/Buffer;->limit()I

    move-result v0

    new-array v0, v0, [B

    .line 25
    invoke-virtual {p3, v0}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    :goto_0
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move/from16 v10, p9

    move-object v4, v0

    goto :goto_2

    :cond_1
    :goto_1
    const/4 p3, 0x0

    .line 26
    new-array v0, p3, [B

    goto :goto_0

    .line 27
    :goto_2
    invoke-direct/range {v1 .. v10}, Lnet/zetetic/database/sqlcipher/SQLiteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;[BLnet/zetetic/database/sqlcipher/SQLiteDatabase$CursorFactory;IILnet/zetetic/database/DatabaseErrorHandler;Lnet/zetetic/database/sqlcipher/SQLiteDatabaseHook;Z)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lnet/zetetic/database/sqlcipher/SQLiteDatabase$CursorFactory;I)V
    .locals 6

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    .line 1
    invoke-direct/range {v0 .. v5}, Lnet/zetetic/database/sqlcipher/SQLiteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Lnet/zetetic/database/sqlcipher/SQLiteDatabase$CursorFactory;ILnet/zetetic/database/DatabaseErrorHandler;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lnet/zetetic/database/sqlcipher/SQLiteDatabase$CursorFactory;IILnet/zetetic/database/DatabaseErrorHandler;)V
    .locals 11

    const/4 v0, 0x0

    .line 3
    new-array v4, v0, [B

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v5, p3

    move v6, p4

    move/from16 v7, p5

    move-object/from16 v8, p6

    invoke-direct/range {v1 .. v10}, Lnet/zetetic/database/sqlcipher/SQLiteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;[BLnet/zetetic/database/sqlcipher/SQLiteDatabase$CursorFactory;IILnet/zetetic/database/DatabaseErrorHandler;Lnet/zetetic/database/sqlcipher/SQLiteDatabaseHook;Z)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lnet/zetetic/database/sqlcipher/SQLiteDatabase$CursorFactory;ILnet/zetetic/database/DatabaseErrorHandler;)V
    .locals 7

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move-object v6, p5

    .line 2
    invoke-direct/range {v0 .. v6}, Lnet/zetetic/database/sqlcipher/SQLiteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Lnet/zetetic/database/sqlcipher/SQLiteDatabase$CursorFactory;IILnet/zetetic/database/DatabaseErrorHandler;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;[BLnet/zetetic/database/sqlcipher/SQLiteDatabase$CursorFactory;IILnet/zetetic/database/DatabaseErrorHandler;Lnet/zetetic/database/sqlcipher/SQLiteDatabaseHook;Z)V
    .locals 1

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    if-lt p5, v0, :cond_0

    .line 5
    iput-object p1, p0, Lnet/zetetic/database/sqlcipher/SQLiteOpenHelper;->a:Landroid/content/Context;

    .line 6
    iput-object p2, p0, Lnet/zetetic/database/sqlcipher/SQLiteOpenHelper;->b:Ljava/lang/String;

    .line 7
    iput-object p3, p0, Lnet/zetetic/database/sqlcipher/SQLiteOpenHelper;->g:[B

    .line 8
    iput-object p4, p0, Lnet/zetetic/database/sqlcipher/SQLiteOpenHelper;->c:Lnet/zetetic/database/sqlcipher/SQLiteDatabase$CursorFactory;

    .line 9
    iput p5, p0, Lnet/zetetic/database/sqlcipher/SQLiteOpenHelper;->d:I

    .line 10
    iput-object p7, p0, Lnet/zetetic/database/sqlcipher/SQLiteOpenHelper;->j:Lnet/zetetic/database/DatabaseErrorHandler;

    .line 11
    iput-object p8, p0, Lnet/zetetic/database/sqlcipher/SQLiteOpenHelper;->k:Lnet/zetetic/database/sqlcipher/SQLiteDatabaseHook;

    .line 12
    iput-boolean p9, p0, Lnet/zetetic/database/sqlcipher/SQLiteOpenHelper;->i:Z

    const/4 p1, 0x0

    .line 13
    invoke-static {p1, p6}, Ljava/lang/Math;->max(II)I

    move-result p1

    iput p1, p0, Lnet/zetetic/database/sqlcipher/SQLiteOpenHelper;->e:I

    return-void

    .line 14
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Version must be >= 1, was "

    .line 15
    invoke-static {p5, p2}, Lka/n;->g(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 16
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final I()Lo3/a;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    const/4 v0, 0x1

    .line 3
    :try_start_0
    invoke-virtual {p0, v0}, Lnet/zetetic/database/sqlcipher/SQLiteOpenHelper;->a(Z)Lnet/zetetic/database/sqlcipher/SQLiteDatabase;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    monitor-exit p0

    .line 8
    return-object v0

    .line 9
    :catchall_0
    move-exception v0

    .line 10
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    throw v0
.end method

.method public final a(Z)Lnet/zetetic/database/sqlcipher/SQLiteDatabase;
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v2, v1, Lnet/zetetic/database/sqlcipher/SQLiteOpenHelper;->a:Landroid/content/Context;

    .line 4
    .line 5
    const-string v3, "Opened "

    .line 6
    .line 7
    const-string v4, "Unable to delete obsolete database "

    .line 8
    .line 9
    const-string v5, "Can\'t upgrade read-only database from version "

    .line 10
    .line 11
    const-string v6, "Couldn\'t open "

    .line 12
    .line 13
    iget-object v0, v1, Lnet/zetetic/database/sqlcipher/SQLiteOpenHelper;->f:Lnet/zetetic/database/sqlcipher/SQLiteDatabase;

    .line 14
    .line 15
    const/4 v7, 0x0

    .line 16
    if-eqz v0, :cond_2

    .line 17
    .line 18
    invoke-virtual {v0}, Lnet/zetetic/database/sqlcipher/SQLiteDatabase;->isOpen()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    iput-object v7, v1, Lnet/zetetic/database/sqlcipher/SQLiteOpenHelper;->f:Lnet/zetetic/database/sqlcipher/SQLiteDatabase;

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    if-eqz p1, :cond_1

    .line 28
    .line 29
    iget-object v0, v1, Lnet/zetetic/database/sqlcipher/SQLiteOpenHelper;->f:Lnet/zetetic/database/sqlcipher/SQLiteDatabase;

    .line 30
    .line 31
    invoke-virtual {v0}, Lnet/zetetic/database/sqlcipher/SQLiteDatabase;->W()Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-nez v0, :cond_2

    .line 36
    .line 37
    :cond_1
    iget-object v0, v1, Lnet/zetetic/database/sqlcipher/SQLiteOpenHelper;->f:Lnet/zetetic/database/sqlcipher/SQLiteDatabase;

    .line 38
    .line 39
    return-object v0

    .line 40
    :cond_2
    :goto_0
    iget-boolean v0, v1, Lnet/zetetic/database/sqlcipher/SQLiteOpenHelper;->h:Z

    .line 41
    .line 42
    if-nez v0, :cond_13

    .line 43
    .line 44
    iget-object v8, v1, Lnet/zetetic/database/sqlcipher/SQLiteOpenHelper;->f:Lnet/zetetic/database/sqlcipher/SQLiteDatabase;

    .line 45
    .line 46
    const/4 v9, 0x1

    .line 47
    const/4 v10, 0x0

    .line 48
    :try_start_0
    iput-boolean v9, v1, Lnet/zetetic/database/sqlcipher/SQLiteOpenHelper;->h:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    .line 50
    const-string v11, "SQLiteOpenHelper"

    .line 51
    .line 52
    iget-object v12, v1, Lnet/zetetic/database/sqlcipher/SQLiteOpenHelper;->b:Ljava/lang/String;

    .line 53
    .line 54
    if-eqz v8, :cond_3

    .line 55
    .line 56
    if-eqz p1, :cond_8

    .line 57
    .line 58
    :try_start_1
    invoke-virtual {v8}, Lnet/zetetic/database/sqlcipher/SQLiteDatabase;->W()Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-eqz v0, :cond_8

    .line 63
    .line 64
    invoke-virtual {v8}, Lnet/zetetic/database/sqlcipher/SQLiteDatabase;->a0()V

    .line 65
    .line 66
    .line 67
    goto/16 :goto_5

    .line 68
    .line 69
    :catchall_0
    move-exception v0

    .line 70
    goto/16 :goto_9

    .line 71
    .line 72
    :cond_3
    if-nez v12, :cond_4

    .line 73
    .line 74
    new-array v0, v10, [B

    .line 75
    .line 76
    const-string v14, ":memory:"

    .line 77
    .line 78
    const/16 v17, 0x0

    .line 79
    .line 80
    const/4 v15, 0x0

    .line 81
    const/high16 v13, 0x10000000

    .line 82
    .line 83
    const/16 v16, 0x0

    .line 84
    .line 85
    move-object/from16 v18, v0

    .line 86
    .line 87
    invoke-static/range {v13 .. v18}, Lnet/zetetic/database/sqlcipher/SQLiteDatabase;->X(ILjava/lang/String;Lnet/zetetic/database/DatabaseErrorHandler;Lnet/zetetic/database/sqlcipher/SQLiteDatabase$CursorFactory;Lnet/zetetic/database/sqlcipher/SQLiteDatabaseHook;[B)Lnet/zetetic/database/sqlcipher/SQLiteDatabase;

    .line 88
    .line 89
    .line 90
    move-result-object v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 91
    goto/16 :goto_5

    .line 92
    .line 93
    :cond_4
    :try_start_2
    const-string v0, "file:"

    .line 94
    .line 95
    invoke-virtual {v12, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    if-nez v0, :cond_5

    .line 100
    .line 101
    invoke-virtual {v2, v12}, Landroid/content/Context;->getDatabasePath(Ljava/lang/String;)Ljava/io/File;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    move-object v14, v0

    .line 110
    goto :goto_1

    .line 111
    :catch_0
    move-exception v0

    .line 112
    goto :goto_4

    .line 113
    :cond_5
    move-object v14, v12

    .line 114
    :goto_1
    new-instance v0, Ljava/io/File;

    .line 115
    .line 116
    invoke-direct {v0, v14}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    new-instance v13, Ljava/io/File;

    .line 120
    .line 121
    invoke-virtual {v0}, Ljava/io/File;->getParent()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    invoke-direct {v13, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v13}, Ljava/io/File;->exists()Z

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    if-nez v0, :cond_6

    .line 133
    .line 134
    invoke-virtual {v13}, Ljava/io/File;->mkdirs()Z

    .line 135
    .line 136
    .line 137
    :cond_6
    iget-boolean v0, v1, Lnet/zetetic/database/sqlcipher/SQLiteOpenHelper;->i:Z

    .line 138
    .line 139
    if-eqz v0, :cond_7

    .line 140
    .line 141
    const/high16 v0, 0x30000000

    .line 142
    .line 143
    :goto_2
    move v13, v0

    .line 144
    goto :goto_3

    .line 145
    :cond_7
    const/high16 v0, 0x10000000

    .line 146
    .line 147
    goto :goto_2

    .line 148
    :goto_3
    iget-object v0, v1, Lnet/zetetic/database/sqlcipher/SQLiteOpenHelper;->g:[B

    .line 149
    .line 150
    iget-object v15, v1, Lnet/zetetic/database/sqlcipher/SQLiteOpenHelper;->c:Lnet/zetetic/database/sqlcipher/SQLiteDatabase$CursorFactory;

    .line 151
    .line 152
    move-object/from16 v16, v15

    .line 153
    .line 154
    iget-object v15, v1, Lnet/zetetic/database/sqlcipher/SQLiteOpenHelper;->j:Lnet/zetetic/database/DatabaseErrorHandler;

    .line 155
    .line 156
    iget-object v7, v1, Lnet/zetetic/database/sqlcipher/SQLiteOpenHelper;->k:Lnet/zetetic/database/sqlcipher/SQLiteDatabaseHook;

    .line 157
    .line 158
    move-object/from16 v18, v0

    .line 159
    .line 160
    move-object/from16 v17, v7

    .line 161
    .line 162
    invoke-static/range {v13 .. v18}, Lnet/zetetic/database/sqlcipher/SQLiteDatabase;->X(ILjava/lang/String;Lnet/zetetic/database/DatabaseErrorHandler;Lnet/zetetic/database/sqlcipher/SQLiteDatabase$CursorFactory;Lnet/zetetic/database/sqlcipher/SQLiteDatabaseHook;[B)Lnet/zetetic/database/sqlcipher/SQLiteDatabase;

    .line 163
    .line 164
    .line 165
    move-result-object v8
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 166
    goto :goto_5

    .line 167
    :goto_4
    if-nez p1, :cond_11

    .line 168
    .line 169
    :try_start_3
    new-instance v7, Ljava/lang/StringBuilder;

    .line 170
    .line 171
    invoke-direct {v7, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v7, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    const-string v6, " for writing (will try read-only):"

    .line 178
    .line 179
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v6

    .line 186
    invoke-static {v0, v11, v6}, Lnet/zetetic/database/Logger;->a(Ljava/lang/Exception;Ljava/lang/String;Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v2, v12}, Landroid/content/Context;->getDatabasePath(Ljava/lang/String;)Ljava/io/File;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v14

    .line 197
    iget-object v0, v1, Lnet/zetetic/database/sqlcipher/SQLiteOpenHelper;->g:[B

    .line 198
    .line 199
    iget-object v2, v1, Lnet/zetetic/database/sqlcipher/SQLiteOpenHelper;->c:Lnet/zetetic/database/sqlcipher/SQLiteDatabase$CursorFactory;

    .line 200
    .line 201
    iget-object v15, v1, Lnet/zetetic/database/sqlcipher/SQLiteOpenHelper;->j:Lnet/zetetic/database/DatabaseErrorHandler;

    .line 202
    .line 203
    iget-object v6, v1, Lnet/zetetic/database/sqlcipher/SQLiteOpenHelper;->k:Lnet/zetetic/database/sqlcipher/SQLiteDatabaseHook;

    .line 204
    .line 205
    const/4 v13, 0x1

    .line 206
    move-object/from16 v18, v0

    .line 207
    .line 208
    move-object/from16 v16, v2

    .line 209
    .line 210
    move-object/from16 v17, v6

    .line 211
    .line 212
    invoke-static/range {v13 .. v18}, Lnet/zetetic/database/sqlcipher/SQLiteDatabase;->X(ILjava/lang/String;Lnet/zetetic/database/DatabaseErrorHandler;Lnet/zetetic/database/sqlcipher/SQLiteDatabase$CursorFactory;Lnet/zetetic/database/sqlcipher/SQLiteDatabaseHook;[B)Lnet/zetetic/database/sqlcipher/SQLiteDatabase;

    .line 213
    .line 214
    .line 215
    move-result-object v8

    .line 216
    :cond_8
    :goto_5
    invoke-virtual {v1, v8}, Lnet/zetetic/database/sqlcipher/SQLiteOpenHelper;->b(Lnet/zetetic/database/sqlcipher/SQLiteDatabase;)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v8}, Lnet/zetetic/database/sqlcipher/SQLiteDatabase;->V()I

    .line 220
    .line 221
    .line 222
    move-result v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 223
    iget v2, v1, Lnet/zetetic/database/sqlcipher/SQLiteOpenHelper;->d:I

    .line 224
    .line 225
    if-eq v0, v2, :cond_f

    .line 226
    .line 227
    :try_start_4
    invoke-virtual {v8}, Lnet/zetetic/database/sqlcipher/SQLiteDatabase;->W()Z

    .line 228
    .line 229
    .line 230
    move-result v6

    .line 231
    if-nez v6, :cond_e

    .line 232
    .line 233
    if-lez v0, :cond_b

    .line 234
    .line 235
    iget v5, v1, Lnet/zetetic/database/sqlcipher/SQLiteOpenHelper;->e:I

    .line 236
    .line 237
    if-ge v0, v5, :cond_b

    .line 238
    .line 239
    new-instance v2, Ljava/io/File;

    .line 240
    .line 241
    invoke-virtual {v8}, Lnet/zetetic/database/sqlcipher/SQLiteDatabase;->J()Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object v3

    .line 245
    invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {v8}, Lnet/zetetic/database/sqlcipher/SQLiteClosable;->d()V

    .line 249
    .line 250
    .line 251
    invoke-static {v2}, Lnet/zetetic/database/sqlcipher/SQLiteDatabase;->i(Ljava/io/File;)Z

    .line 252
    .line 253
    .line 254
    move-result v2

    .line 255
    if-eqz v2, :cond_a

    .line 256
    .line 257
    iput-boolean v10, v1, Lnet/zetetic/database/sqlcipher/SQLiteOpenHelper;->h:Z

    .line 258
    .line 259
    invoke-virtual/range {p0 .. p1}, Lnet/zetetic/database/sqlcipher/SQLiteOpenHelper;->a(Z)Lnet/zetetic/database/sqlcipher/SQLiteDatabase;

    .line 260
    .line 261
    .line 262
    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 263
    iput-boolean v10, v1, Lnet/zetetic/database/sqlcipher/SQLiteOpenHelper;->h:Z

    .line 264
    .line 265
    iget-object v2, v1, Lnet/zetetic/database/sqlcipher/SQLiteOpenHelper;->f:Lnet/zetetic/database/sqlcipher/SQLiteDatabase;

    .line 266
    .line 267
    if-eq v8, v2, :cond_9

    .line 268
    .line 269
    invoke-virtual {v8}, Lnet/zetetic/database/sqlcipher/SQLiteClosable;->d()V

    .line 270
    .line 271
    .line 272
    :cond_9
    return-object v0

    .line 273
    :cond_a
    :try_start_5
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 274
    .line 275
    new-instance v3, Ljava/lang/StringBuilder;

    .line 276
    .line 277
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {v3, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 281
    .line 282
    .line 283
    const-string v4, " with version "

    .line 284
    .line 285
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 286
    .line 287
    .line 288
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 289
    .line 290
    .line 291
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v0

    .line 295
    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 296
    .line 297
    .line 298
    throw v2

    .line 299
    :cond_b
    invoke-virtual {v8, v9}, Lnet/zetetic/database/sqlcipher/SQLiteDatabase;->h(Z)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 300
    .line 301
    .line 302
    if-nez v0, :cond_c

    .line 303
    .line 304
    :try_start_6
    invoke-virtual {v1, v8}, Lnet/zetetic/database/sqlcipher/SQLiteOpenHelper;->d(Lnet/zetetic/database/sqlcipher/SQLiteDatabase;)V

    .line 305
    .line 306
    .line 307
    goto :goto_6

    .line 308
    :catchall_1
    move-exception v0

    .line 309
    goto :goto_7

    .line 310
    :cond_c
    if-le v0, v2, :cond_d

    .line 311
    .line 312
    invoke-virtual {v1, v8, v0, v2}, Lnet/zetetic/database/sqlcipher/SQLiteOpenHelper;->h(Lnet/zetetic/database/sqlcipher/SQLiteDatabase;II)V

    .line 313
    .line 314
    .line 315
    goto :goto_6

    .line 316
    :cond_d
    invoke-virtual {v1, v8, v0, v2}, Lnet/zetetic/database/sqlcipher/SQLiteOpenHelper;->o(Lnet/zetetic/database/sqlcipher/SQLiteDatabase;II)V

    .line 317
    .line 318
    .line 319
    :goto_6
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 320
    .line 321
    .line 322
    new-instance v0, Ljava/lang/StringBuilder;

    .line 323
    .line 324
    const-string v4, "PRAGMA user_version = "

    .line 325
    .line 326
    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 327
    .line 328
    .line 329
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 330
    .line 331
    .line 332
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 333
    .line 334
    .line 335
    move-result-object v0

    .line 336
    const/4 v2, 0x0

    .line 337
    invoke-virtual {v8, v0, v2}, Lnet/zetetic/database/sqlcipher/SQLiteDatabase;->z(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 338
    .line 339
    .line 340
    invoke-virtual {v8}, Lnet/zetetic/database/sqlcipher/SQLiteDatabase;->k()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 341
    .line 342
    .line 343
    :try_start_7
    invoke-virtual {v8}, Lnet/zetetic/database/sqlcipher/SQLiteDatabase;->p()V

    .line 344
    .line 345
    .line 346
    goto :goto_8

    .line 347
    :goto_7
    invoke-virtual {v8}, Lnet/zetetic/database/sqlcipher/SQLiteDatabase;->p()V

    .line 348
    .line 349
    .line 350
    throw v0

    .line 351
    :cond_e
    new-instance v0, Landroid/database/sqlite/SQLiteException;

    .line 352
    .line 353
    new-instance v3, Ljava/lang/StringBuilder;

    .line 354
    .line 355
    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 356
    .line 357
    .line 358
    invoke-virtual {v8}, Lnet/zetetic/database/sqlcipher/SQLiteDatabase;->V()I

    .line 359
    .line 360
    .line 361
    move-result v4

    .line 362
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 363
    .line 364
    .line 365
    const-string v4, " to "

    .line 366
    .line 367
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 368
    .line 369
    .line 370
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 371
    .line 372
    .line 373
    const-string v2, ": "

    .line 374
    .line 375
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 376
    .line 377
    .line 378
    invoke-virtual {v3, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 379
    .line 380
    .line 381
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 382
    .line 383
    .line 384
    move-result-object v2

    .line 385
    invoke-direct {v0, v2}, Landroid/database/sqlite/SQLiteException;-><init>(Ljava/lang/String;)V

    .line 386
    .line 387
    .line 388
    throw v0

    .line 389
    :cond_f
    :goto_8
    invoke-virtual {v1, v8}, Lnet/zetetic/database/sqlcipher/SQLiteOpenHelper;->i(Lnet/zetetic/database/sqlcipher/SQLiteDatabase;)V

    .line 390
    .line 391
    .line 392
    invoke-virtual {v8}, Lnet/zetetic/database/sqlcipher/SQLiteDatabase;->W()Z

    .line 393
    .line 394
    .line 395
    move-result v0

    .line 396
    if-eqz v0, :cond_10

    .line 397
    .line 398
    new-instance v0, Ljava/lang/StringBuilder;

    .line 399
    .line 400
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 401
    .line 402
    .line 403
    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 404
    .line 405
    .line 406
    const-string v2, " in read-only mode"

    .line 407
    .line 408
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 409
    .line 410
    .line 411
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 412
    .line 413
    .line 414
    move-result-object v0

    .line 415
    invoke-static {}, Lnet/zetetic/database/Logger;->b()Lnet/zetetic/database/LogTarget;

    .line 416
    .line 417
    .line 418
    move-result-object v2

    .line 419
    const/4 v3, 0x5

    .line 420
    const/4 v4, 0x0

    .line 421
    invoke-interface {v2, v3, v4, v11, v0}, Lnet/zetetic/database/LogTarget;->a(ILjava/lang/Exception;Ljava/lang/String;Ljava/lang/String;)V

    .line 422
    .line 423
    .line 424
    :cond_10
    iput-object v8, v1, Lnet/zetetic/database/sqlcipher/SQLiteOpenHelper;->f:Lnet/zetetic/database/sqlcipher/SQLiteDatabase;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 425
    .line 426
    iput-boolean v10, v1, Lnet/zetetic/database/sqlcipher/SQLiteOpenHelper;->h:Z

    .line 427
    .line 428
    return-object v8

    .line 429
    :cond_11
    :try_start_8
    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 430
    :goto_9
    iput-boolean v10, v1, Lnet/zetetic/database/sqlcipher/SQLiteOpenHelper;->h:Z

    .line 431
    .line 432
    if-eqz v8, :cond_12

    .line 433
    .line 434
    iget-object v2, v1, Lnet/zetetic/database/sqlcipher/SQLiteOpenHelper;->f:Lnet/zetetic/database/sqlcipher/SQLiteDatabase;

    .line 435
    .line 436
    if-eq v8, v2, :cond_12

    .line 437
    .line 438
    invoke-virtual {v8}, Lnet/zetetic/database/sqlcipher/SQLiteClosable;->d()V

    .line 439
    .line 440
    .line 441
    :cond_12
    throw v0

    .line 442
    :cond_13
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 443
    .line 444
    const-string v2, "getDatabase called recursively"

    .line 445
    .line 446
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 447
    .line 448
    .line 449
    throw v0
.end method

.method public b(Lnet/zetetic/database/sqlcipher/SQLiteDatabase;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final declared-synchronized close()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lnet/zetetic/database/sqlcipher/SQLiteOpenHelper;->h:Z

    .line 3
    .line 4
    if-nez v0, :cond_1

    .line 5
    .line 6
    iget-object v0, p0, Lnet/zetetic/database/sqlcipher/SQLiteOpenHelper;->f:Lnet/zetetic/database/sqlcipher/SQLiteDatabase;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0}, Lnet/zetetic/database/sqlcipher/SQLiteDatabase;->isOpen()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, Lnet/zetetic/database/sqlcipher/SQLiteOpenHelper;->f:Lnet/zetetic/database/sqlcipher/SQLiteDatabase;

    .line 17
    .line 18
    invoke-virtual {v0}, Lnet/zetetic/database/sqlcipher/SQLiteClosable;->d()V

    .line 19
    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    iput-object v0, p0, Lnet/zetetic/database/sqlcipher/SQLiteOpenHelper;->f:Lnet/zetetic/database/sqlcipher/SQLiteDatabase;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception v0

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    :goto_0
    monitor-exit p0

    .line 28
    return-void

    .line 29
    :cond_1
    :try_start_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 30
    .line 31
    const-string v1, "Closed during initialization"

    .line 32
    .line 33
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw v0

    .line 37
    :goto_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 38
    throw v0
.end method

.method public abstract d(Lnet/zetetic/database/sqlcipher/SQLiteDatabase;)V
.end method

.method public h(Lnet/zetetic/database/sqlcipher/SQLiteDatabase;II)V
    .locals 2

    .line 1
    new-instance p1, Landroid/database/sqlite/SQLiteException;

    .line 2
    .line 3
    const-string v0, "Can\'t downgrade database from version "

    .line 4
    .line 5
    const-string v1, " to "

    .line 6
    .line 7
    invoke-static {p2, p3, v0, v1}, LR8/v;->e(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-direct {p1, p2}, Landroid/database/sqlite/SQLiteException;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    throw p1
.end method

.method public i(Lnet/zetetic/database/sqlcipher/SQLiteDatabase;)V
    .locals 0

    .line 1
    return-void
.end method

.method public abstract o(Lnet/zetetic/database/sqlcipher/SQLiteDatabase;II)V
.end method

.method public final setWriteAheadLoggingEnabled(Z)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lnet/zetetic/database/sqlcipher/SQLiteOpenHelper;->i:Z

    .line 3
    .line 4
    if-eq v0, p1, :cond_2

    .line 5
    .line 6
    iget-object v0, p0, Lnet/zetetic/database/sqlcipher/SQLiteOpenHelper;->f:Lnet/zetetic/database/sqlcipher/SQLiteDatabase;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    invoke-virtual {v0}, Lnet/zetetic/database/sqlcipher/SQLiteDatabase;->isOpen()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    iget-object v0, p0, Lnet/zetetic/database/sqlcipher/SQLiteOpenHelper;->f:Lnet/zetetic/database/sqlcipher/SQLiteDatabase;

    .line 17
    .line 18
    invoke-virtual {v0}, Lnet/zetetic/database/sqlcipher/SQLiteDatabase;->W()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    if-eqz p1, :cond_0

    .line 25
    .line 26
    iget-object v0, p0, Lnet/zetetic/database/sqlcipher/SQLiteOpenHelper;->f:Lnet/zetetic/database/sqlcipher/SQLiteDatabase;

    .line 27
    .line 28
    invoke-virtual {v0}, Lnet/zetetic/database/sqlcipher/SQLiteDatabase;->y()V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :catchall_0
    move-exception p1

    .line 33
    goto :goto_1

    .line 34
    :cond_0
    iget-object v0, p0, Lnet/zetetic/database/sqlcipher/SQLiteOpenHelper;->f:Lnet/zetetic/database/sqlcipher/SQLiteDatabase;

    .line 35
    .line 36
    invoke-virtual {v0}, Lnet/zetetic/database/sqlcipher/SQLiteDatabase;->o()V

    .line 37
    .line 38
    .line 39
    :cond_1
    :goto_0
    iput-boolean p1, p0, Lnet/zetetic/database/sqlcipher/SQLiteOpenHelper;->i:Z

    .line 40
    .line 41
    :cond_2
    monitor-exit p0

    .line 42
    return-void

    .line 43
    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    throw p1
.end method
