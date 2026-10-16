.class public final Lnet/zetetic/database/sqlcipher/SQLiteSession;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/zetetic/database/sqlcipher/SQLiteSession$Transaction;
    }
.end annotation


# instance fields
.field public final a:Lnet/zetetic/database/sqlcipher/SQLiteConnectionPool;

.field public b:Lnet/zetetic/database/sqlcipher/SQLiteConnection;

.field public c:I

.field public d:Lnet/zetetic/database/sqlcipher/SQLiteSession$Transaction;

.field public e:Lnet/zetetic/database/sqlcipher/SQLiteSession$Transaction;


# direct methods
.method public constructor <init>(Lnet/zetetic/database/sqlcipher/SQLiteConnectionPool;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    iput-object p1, p0, Lnet/zetetic/database/sqlcipher/SQLiteSession;->a:Lnet/zetetic/database/sqlcipher/SQLiteConnectionPool;

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 10
    .line 11
    const-string v0, "connectionPool must not be null"

    .line 12
    .line 13
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    throw p1
.end method


# virtual methods
.method public final a(Ljava/lang/String;ILandroid/os/CancellationSignal;)V
    .locals 20

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
    move-object/from16 v3, p3

    .line 8
    .line 9
    iget-object v4, v1, Lnet/zetetic/database/sqlcipher/SQLiteSession;->b:Lnet/zetetic/database/sqlcipher/SQLiteConnection;

    .line 10
    .line 11
    const/4 v5, 0x1

    .line 12
    if-nez v4, :cond_13

    .line 13
    .line 14
    iget-object v4, v1, Lnet/zetetic/database/sqlcipher/SQLiteSession;->a:Lnet/zetetic/database/sqlcipher/SQLiteConnectionPool;

    .line 15
    .line 16
    and-int/lit8 v6, v2, 0x2

    .line 17
    .line 18
    const/4 v7, 0x0

    .line 19
    if-eqz v6, :cond_0

    .line 20
    .line 21
    move v6, v5

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move v6, v7

    .line 24
    :goto_0
    iget-object v8, v4, Lnet/zetetic/database/sqlcipher/SQLiteConnectionPool;->b:Ljava/lang/Object;

    .line 25
    .line 26
    monitor-enter v8

    .line 27
    :try_start_0
    invoke-virtual {v4}, Lnet/zetetic/database/sqlcipher/SQLiteConnectionPool;->P()V

    .line 28
    .line 29
    .line 30
    if-eqz v3, :cond_1

    .line 31
    .line 32
    invoke-virtual {v3}, Landroid/os/CancellationSignal;->throwIfCanceled()V

    .line 33
    .line 34
    .line 35
    goto :goto_1

    .line 36
    :catchall_0
    move-exception v0

    .line 37
    goto/16 :goto_f

    .line 38
    .line 39
    :cond_1
    :goto_1
    iget-object v9, v4, Lnet/zetetic/database/sqlcipher/SQLiteConnectionPool;->k:Lnet/zetetic/database/sqlcipher/SQLiteConnection;

    .line 40
    .line 41
    if-eqz v9, :cond_2

    .line 42
    .line 43
    iget-object v9, v4, Lnet/zetetic/database/sqlcipher/SQLiteConnectionPool;->j:Ljava/util/ArrayList;

    .line 44
    .line 45
    invoke-virtual {v9}, Ljava/util/ArrayList;->isEmpty()Z

    .line 46
    .line 47
    .line 48
    move-result v9

    .line 49
    if-nez v9, :cond_3

    .line 50
    .line 51
    :cond_2
    if-eqz v6, :cond_4

    .line 52
    .line 53
    :cond_3
    invoke-virtual {v4, v2}, Lnet/zetetic/database/sqlcipher/SQLiteConnectionPool;->V(I)Lnet/zetetic/database/sqlcipher/SQLiteConnection;

    .line 54
    .line 55
    .line 56
    move-result-object v9

    .line 57
    if-eqz v9, :cond_4

    .line 58
    .line 59
    monitor-exit v8

    .line 60
    :goto_2
    move v0, v5

    .line 61
    goto/16 :goto_c

    .line 62
    .line 63
    :cond_4
    if-nez v6, :cond_5

    .line 64
    .line 65
    invoke-virtual {v4, v2, v0}, Lnet/zetetic/database/sqlcipher/SQLiteConnectionPool;->Q(ILjava/lang/String;)Lnet/zetetic/database/sqlcipher/SQLiteConnection;

    .line 66
    .line 67
    .line 68
    move-result-object v9

    .line 69
    if-eqz v9, :cond_5

    .line 70
    .line 71
    monitor-exit v8

    .line 72
    goto :goto_2

    .line 73
    :cond_5
    and-int/lit8 v9, v2, 0x4

    .line 74
    .line 75
    if-eqz v9, :cond_6

    .line 76
    .line 77
    move v9, v5

    .line 78
    goto :goto_3

    .line 79
    :cond_6
    move v9, v7

    .line 80
    :goto_3
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 81
    .line 82
    .line 83
    move-result-wide v10

    .line 84
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 85
    .line 86
    .line 87
    move-result-object v12

    .line 88
    iget-object v13, v4, Lnet/zetetic/database/sqlcipher/SQLiteConnectionPool;->h:Lnet/zetetic/database/sqlcipher/SQLiteConnectionPool$ConnectionWaiter;

    .line 89
    .line 90
    const/4 v14, 0x0

    .line 91
    if-eqz v13, :cond_7

    .line 92
    .line 93
    iget-object v15, v13, Lnet/zetetic/database/sqlcipher/SQLiteConnectionPool$ConnectionWaiter;->a:Lnet/zetetic/database/sqlcipher/SQLiteConnectionPool$ConnectionWaiter;

    .line 94
    .line 95
    iput-object v15, v4, Lnet/zetetic/database/sqlcipher/SQLiteConnectionPool;->h:Lnet/zetetic/database/sqlcipher/SQLiteConnectionPool$ConnectionWaiter;

    .line 96
    .line 97
    iput-object v14, v13, Lnet/zetetic/database/sqlcipher/SQLiteConnectionPool$ConnectionWaiter;->a:Lnet/zetetic/database/sqlcipher/SQLiteConnectionPool$ConnectionWaiter;

    .line 98
    .line 99
    goto :goto_4

    .line 100
    :cond_7
    new-instance v13, Lnet/zetetic/database/sqlcipher/SQLiteConnectionPool$ConnectionWaiter;

    .line 101
    .line 102
    invoke-direct {v13}, Ljava/lang/Object;-><init>()V

    .line 103
    .line 104
    .line 105
    :goto_4
    iput-object v12, v13, Lnet/zetetic/database/sqlcipher/SQLiteConnectionPool$ConnectionWaiter;->b:Ljava/lang/Thread;

    .line 106
    .line 107
    iput-wide v10, v13, Lnet/zetetic/database/sqlcipher/SQLiteConnectionPool$ConnectionWaiter;->c:J

    .line 108
    .line 109
    iput v9, v13, Lnet/zetetic/database/sqlcipher/SQLiteConnectionPool$ConnectionWaiter;->d:I

    .line 110
    .line 111
    iput-boolean v6, v13, Lnet/zetetic/database/sqlcipher/SQLiteConnectionPool$ConnectionWaiter;->e:Z

    .line 112
    .line 113
    iput-object v0, v13, Lnet/zetetic/database/sqlcipher/SQLiteConnectionPool$ConnectionWaiter;->f:Ljava/lang/String;

    .line 114
    .line 115
    iput v2, v13, Lnet/zetetic/database/sqlcipher/SQLiteConnectionPool$ConnectionWaiter;->g:I

    .line 116
    .line 117
    iget-object v0, v4, Lnet/zetetic/database/sqlcipher/SQLiteConnectionPool;->i:Lnet/zetetic/database/sqlcipher/SQLiteConnectionPool$ConnectionWaiter;

    .line 118
    .line 119
    move-object v6, v14

    .line 120
    :goto_5
    if-eqz v0, :cond_9

    .line 121
    .line 122
    iget v10, v0, Lnet/zetetic/database/sqlcipher/SQLiteConnectionPool$ConnectionWaiter;->d:I

    .line 123
    .line 124
    if-le v9, v10, :cond_8

    .line 125
    .line 126
    iput-object v0, v13, Lnet/zetetic/database/sqlcipher/SQLiteConnectionPool$ConnectionWaiter;->a:Lnet/zetetic/database/sqlcipher/SQLiteConnectionPool$ConnectionWaiter;

    .line 127
    .line 128
    goto :goto_6

    .line 129
    :cond_8
    iget-object v6, v0, Lnet/zetetic/database/sqlcipher/SQLiteConnectionPool$ConnectionWaiter;->a:Lnet/zetetic/database/sqlcipher/SQLiteConnectionPool$ConnectionWaiter;

    .line 130
    .line 131
    move-object/from16 v19, v6

    .line 132
    .line 133
    move-object v6, v0

    .line 134
    move-object/from16 v0, v19

    .line 135
    .line 136
    goto :goto_5

    .line 137
    :cond_9
    :goto_6
    if-eqz v6, :cond_a

    .line 138
    .line 139
    iput-object v13, v6, Lnet/zetetic/database/sqlcipher/SQLiteConnectionPool$ConnectionWaiter;->a:Lnet/zetetic/database/sqlcipher/SQLiteConnectionPool$ConnectionWaiter;

    .line 140
    .line 141
    goto :goto_7

    .line 142
    :cond_a
    iput-object v13, v4, Lnet/zetetic/database/sqlcipher/SQLiteConnectionPool;->i:Lnet/zetetic/database/sqlcipher/SQLiteConnectionPool$ConnectionWaiter;

    .line 143
    .line 144
    :goto_7
    iget v0, v13, Lnet/zetetic/database/sqlcipher/SQLiteConnectionPool$ConnectionWaiter;->j:I

    .line 145
    .line 146
    monitor-exit v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 147
    if-eqz v3, :cond_b

    .line 148
    .line 149
    new-instance v6, Lnet/zetetic/database/sqlcipher/SQLiteConnectionPool$1;

    .line 150
    .line 151
    invoke-direct {v6, v4, v13, v0}, Lnet/zetetic/database/sqlcipher/SQLiteConnectionPool$1;-><init>(Lnet/zetetic/database/sqlcipher/SQLiteConnectionPool;Lnet/zetetic/database/sqlcipher/SQLiteConnectionPool$ConnectionWaiter;I)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v3, v6}, Landroid/os/CancellationSignal;->setOnCancelListener(Landroid/os/CancellationSignal$OnCancelListener;)V

    .line 155
    .line 156
    .line 157
    :cond_b
    :try_start_1
    iget-wide v8, v13, Lnet/zetetic/database/sqlcipher/SQLiteConnectionPool$ConnectionWaiter;->c:J

    .line 158
    .line 159
    const-wide/16 v10, 0x7530

    .line 160
    .line 161
    add-long/2addr v8, v10

    .line 162
    move-wide v15, v10

    .line 163
    :goto_8
    iget-object v0, v4, Lnet/zetetic/database/sqlcipher/SQLiteConnectionPool;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 164
    .line 165
    invoke-virtual {v0, v5, v7}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 166
    .line 167
    .line 168
    move-result v0

    .line 169
    if-eqz v0, :cond_c

    .line 170
    .line 171
    iget-object v6, v4, Lnet/zetetic/database/sqlcipher/SQLiteConnectionPool;->b:Ljava/lang/Object;

    .line 172
    .line 173
    monitor-enter v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 174
    :try_start_2
    invoke-virtual {v4}, Lnet/zetetic/database/sqlcipher/SQLiteConnectionPool;->W()V

    .line 175
    .line 176
    .line 177
    monitor-exit v6

    .line 178
    goto :goto_9

    .line 179
    :catchall_1
    move-exception v0

    .line 180
    monitor-exit v6
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 181
    :try_start_3
    throw v0

    .line 182
    :catchall_2
    move-exception v0

    .line 183
    goto :goto_e

    .line 184
    :cond_c
    :goto_9
    const-wide/32 v17, 0xf4240

    .line 185
    .line 186
    .line 187
    move v0, v5

    .line 188
    mul-long v5, v15, v17

    .line 189
    .line 190
    invoke-static {v4, v5, v6}, Ljava/util/concurrent/locks/LockSupport;->parkNanos(Ljava/lang/Object;J)V

    .line 191
    .line 192
    .line 193
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    .line 194
    .line 195
    .line 196
    iget-object v5, v4, Lnet/zetetic/database/sqlcipher/SQLiteConnectionPool;->b:Ljava/lang/Object;

    .line 197
    .line 198
    monitor-enter v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 199
    :try_start_4
    invoke-virtual {v4}, Lnet/zetetic/database/sqlcipher/SQLiteConnectionPool;->P()V

    .line 200
    .line 201
    .line 202
    iget-object v6, v13, Lnet/zetetic/database/sqlcipher/SQLiteConnectionPool$ConnectionWaiter;->h:Lnet/zetetic/database/sqlcipher/SQLiteConnection;

    .line 203
    .line 204
    iget-object v12, v13, Lnet/zetetic/database/sqlcipher/SQLiteConnectionPool$ConnectionWaiter;->i:Ljava/lang/RuntimeException;

    .line 205
    .line 206
    if-nez v6, :cond_f

    .line 207
    .line 208
    if-eqz v12, :cond_d

    .line 209
    .line 210
    goto :goto_b

    .line 211
    :cond_d
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 212
    .line 213
    .line 214
    move-result-wide v15

    .line 215
    cmp-long v6, v15, v8

    .line 216
    .line 217
    if-gez v6, :cond_e

    .line 218
    .line 219
    sub-long/2addr v15, v8

    .line 220
    goto :goto_a

    .line 221
    :cond_e
    iget-wide v8, v13, Lnet/zetetic/database/sqlcipher/SQLiteConnectionPool$ConnectionWaiter;->c:J

    .line 222
    .line 223
    sub-long v8, v15, v8

    .line 224
    .line 225
    invoke-virtual {v4, v2, v8, v9}, Lnet/zetetic/database/sqlcipher/SQLiteConnectionPool;->i(IJ)V

    .line 226
    .line 227
    .line 228
    add-long/2addr v15, v10

    .line 229
    move-wide v8, v15

    .line 230
    move-wide v15, v10

    .line 231
    :goto_a
    monitor-exit v5

    .line 232
    move v5, v0

    .line 233
    goto :goto_8

    .line 234
    :catchall_3
    move-exception v0

    .line 235
    goto :goto_d

    .line 236
    :cond_f
    :goto_b
    iget-object v2, v4, Lnet/zetetic/database/sqlcipher/SQLiteConnectionPool;->h:Lnet/zetetic/database/sqlcipher/SQLiteConnectionPool$ConnectionWaiter;

    .line 237
    .line 238
    iput-object v2, v13, Lnet/zetetic/database/sqlcipher/SQLiteConnectionPool$ConnectionWaiter;->a:Lnet/zetetic/database/sqlcipher/SQLiteConnectionPool$ConnectionWaiter;

    .line 239
    .line 240
    iput-object v14, v13, Lnet/zetetic/database/sqlcipher/SQLiteConnectionPool$ConnectionWaiter;->b:Ljava/lang/Thread;

    .line 241
    .line 242
    iput-object v14, v13, Lnet/zetetic/database/sqlcipher/SQLiteConnectionPool$ConnectionWaiter;->f:Ljava/lang/String;

    .line 243
    .line 244
    iput-object v14, v13, Lnet/zetetic/database/sqlcipher/SQLiteConnectionPool$ConnectionWaiter;->h:Lnet/zetetic/database/sqlcipher/SQLiteConnection;

    .line 245
    .line 246
    iput-object v14, v13, Lnet/zetetic/database/sqlcipher/SQLiteConnectionPool$ConnectionWaiter;->i:Ljava/lang/RuntimeException;

    .line 247
    .line 248
    iget v2, v13, Lnet/zetetic/database/sqlcipher/SQLiteConnectionPool$ConnectionWaiter;->j:I

    .line 249
    .line 250
    add-int/2addr v2, v0

    .line 251
    iput v2, v13, Lnet/zetetic/database/sqlcipher/SQLiteConnectionPool$ConnectionWaiter;->j:I

    .line 252
    .line 253
    iput-object v13, v4, Lnet/zetetic/database/sqlcipher/SQLiteConnectionPool;->h:Lnet/zetetic/database/sqlcipher/SQLiteConnectionPool$ConnectionWaiter;

    .line 254
    .line 255
    if-eqz v6, :cond_11

    .line 256
    .line 257
    monitor-exit v5
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 258
    if-eqz v3, :cond_10

    .line 259
    .line 260
    invoke-virtual {v3, v14}, Landroid/os/CancellationSignal;->setOnCancelListener(Landroid/os/CancellationSignal$OnCancelListener;)V

    .line 261
    .line 262
    .line 263
    :cond_10
    move-object v9, v6

    .line 264
    :goto_c
    iput-object v9, v1, Lnet/zetetic/database/sqlcipher/SQLiteSession;->b:Lnet/zetetic/database/sqlcipher/SQLiteConnection;

    .line 265
    .line 266
    goto :goto_10

    .line 267
    :cond_11
    :try_start_5
    throw v12

    .line 268
    :goto_d
    monitor-exit v5
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 269
    :try_start_6
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 270
    :goto_e
    if-eqz v3, :cond_12

    .line 271
    .line 272
    invoke-virtual {v3, v14}, Landroid/os/CancellationSignal;->setOnCancelListener(Landroid/os/CancellationSignal$OnCancelListener;)V

    .line 273
    .line 274
    .line 275
    :cond_12
    throw v0

    .line 276
    :goto_f
    :try_start_7
    monitor-exit v8
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 277
    throw v0

    .line 278
    :cond_13
    move v0, v5

    .line 279
    :goto_10
    iget v2, v1, Lnet/zetetic/database/sqlcipher/SQLiteSession;->c:I

    .line 280
    .line 281
    add-int/2addr v2, v0

    .line 282
    iput v2, v1, Lnet/zetetic/database/sqlcipher/SQLiteSession;->c:I

    .line 283
    .line 284
    return-void
.end method

.method public final b(IILandroid/os/CancellationSignal;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lnet/zetetic/database/sqlcipher/SQLiteSession;->e:Lnet/zetetic/database/sqlcipher/SQLiteSession$Transaction;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-boolean v0, v0, Lnet/zetetic/database/sqlcipher/SQLiteSession$Transaction;->b:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 11
    .line 12
    const-string p2, "Cannot perform this operation because the transaction has already been marked successful.  The only thing you can do now is call endTransaction()."

    .line 13
    .line 14
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    throw p1

    .line 18
    :cond_1
    :goto_0
    if-eqz p3, :cond_2

    .line 19
    .line 20
    invoke-virtual {p3}, Landroid/os/CancellationSignal;->throwIfCanceled()V

    .line 21
    .line 22
    .line 23
    :cond_2
    iget-object v0, p0, Lnet/zetetic/database/sqlcipher/SQLiteSession;->e:Lnet/zetetic/database/sqlcipher/SQLiteSession$Transaction;

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    if-nez v0, :cond_3

    .line 27
    .line 28
    invoke-virtual {p0, v1, p2, p3}, Lnet/zetetic/database/sqlcipher/SQLiteSession;->a(Ljava/lang/String;ILandroid/os/CancellationSignal;)V

    .line 29
    .line 30
    .line 31
    :cond_3
    :try_start_0
    iget-object p2, p0, Lnet/zetetic/database/sqlcipher/SQLiteSession;->e:Lnet/zetetic/database/sqlcipher/SQLiteSession$Transaction;

    .line 32
    .line 33
    if-nez p2, :cond_6

    .line 34
    .line 35
    const/4 p2, 0x1

    .line 36
    if-eq p1, p2, :cond_5

    .line 37
    .line 38
    const/4 p2, 0x2

    .line 39
    if-eq p1, p2, :cond_4

    .line 40
    .line 41
    iget-object p1, p0, Lnet/zetetic/database/sqlcipher/SQLiteSession;->b:Lnet/zetetic/database/sqlcipher/SQLiteConnection;

    .line 42
    .line 43
    const-string p2, "BEGIN;"

    .line 44
    .line 45
    invoke-virtual {p1, p2, v1, p3}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->h(Ljava/lang/String;[Ljava/lang/Object;Landroid/os/CancellationSignal;)V

    .line 46
    .line 47
    .line 48
    goto :goto_1

    .line 49
    :catchall_0
    move-exception p1

    .line 50
    goto :goto_3

    .line 51
    :cond_4
    iget-object p1, p0, Lnet/zetetic/database/sqlcipher/SQLiteSession;->b:Lnet/zetetic/database/sqlcipher/SQLiteConnection;

    .line 52
    .line 53
    const-string p2, "BEGIN EXCLUSIVE;"

    .line 54
    .line 55
    invoke-virtual {p1, p2, v1, p3}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->h(Ljava/lang/String;[Ljava/lang/Object;Landroid/os/CancellationSignal;)V

    .line 56
    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_5
    iget-object p1, p0, Lnet/zetetic/database/sqlcipher/SQLiteSession;->b:Lnet/zetetic/database/sqlcipher/SQLiteConnection;

    .line 60
    .line 61
    const-string p2, "BEGIN IMMEDIATE;"

    .line 62
    .line 63
    invoke-virtual {p1, p2, v1, p3}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->h(Ljava/lang/String;[Ljava/lang/Object;Landroid/os/CancellationSignal;)V

    .line 64
    .line 65
    .line 66
    :cond_6
    :goto_1
    iget-object p1, p0, Lnet/zetetic/database/sqlcipher/SQLiteSession;->d:Lnet/zetetic/database/sqlcipher/SQLiteSession$Transaction;

    .line 67
    .line 68
    if-eqz p1, :cond_7

    .line 69
    .line 70
    iget-object p2, p1, Lnet/zetetic/database/sqlcipher/SQLiteSession$Transaction;->a:Lnet/zetetic/database/sqlcipher/SQLiteSession$Transaction;

    .line 71
    .line 72
    iput-object p2, p0, Lnet/zetetic/database/sqlcipher/SQLiteSession;->d:Lnet/zetetic/database/sqlcipher/SQLiteSession$Transaction;

    .line 73
    .line 74
    iput-object v1, p1, Lnet/zetetic/database/sqlcipher/SQLiteSession$Transaction;->a:Lnet/zetetic/database/sqlcipher/SQLiteSession$Transaction;

    .line 75
    .line 76
    const/4 p2, 0x0

    .line 77
    iput-boolean p2, p1, Lnet/zetetic/database/sqlcipher/SQLiteSession$Transaction;->b:Z

    .line 78
    .line 79
    iput-boolean p2, p1, Lnet/zetetic/database/sqlcipher/SQLiteSession$Transaction;->c:Z

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_7
    new-instance p1, Lnet/zetetic/database/sqlcipher/SQLiteSession$Transaction;

    .line 83
    .line 84
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 85
    .line 86
    .line 87
    :goto_2
    iget-object p2, p0, Lnet/zetetic/database/sqlcipher/SQLiteSession;->e:Lnet/zetetic/database/sqlcipher/SQLiteSession$Transaction;

    .line 88
    .line 89
    iput-object p2, p1, Lnet/zetetic/database/sqlcipher/SQLiteSession$Transaction;->a:Lnet/zetetic/database/sqlcipher/SQLiteSession$Transaction;

    .line 90
    .line 91
    iput-object p1, p0, Lnet/zetetic/database/sqlcipher/SQLiteSession;->e:Lnet/zetetic/database/sqlcipher/SQLiteSession$Transaction;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 92
    .line 93
    return-void

    .line 94
    :goto_3
    iget-object p2, p0, Lnet/zetetic/database/sqlcipher/SQLiteSession;->e:Lnet/zetetic/database/sqlcipher/SQLiteSession$Transaction;

    .line 95
    .line 96
    if-nez p2, :cond_8

    .line 97
    .line 98
    invoke-virtual {p0}, Lnet/zetetic/database/sqlcipher/SQLiteSession;->i()V

    .line 99
    .line 100
    .line 101
    :cond_8
    throw p1
.end method

.method public final c(Landroid/os/CancellationSignal;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lnet/zetetic/database/sqlcipher/SQLiteSession;->e:Lnet/zetetic/database/sqlcipher/SQLiteSession$Transaction;

    .line 2
    .line 3
    if-eqz v0, :cond_6

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/os/CancellationSignal;->throwIfCanceled()V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, Lnet/zetetic/database/sqlcipher/SQLiteSession;->e:Lnet/zetetic/database/sqlcipher/SQLiteSession$Transaction;

    .line 11
    .line 12
    iget-boolean v1, v0, Lnet/zetetic/database/sqlcipher/SQLiteSession$Transaction;->b:Z

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    if-nez v1, :cond_1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    iget-boolean v1, v0, Lnet/zetetic/database/sqlcipher/SQLiteSession$Transaction;->c:Z

    .line 19
    .line 20
    if-nez v1, :cond_2

    .line 21
    .line 22
    move v1, v2

    .line 23
    goto :goto_1

    .line 24
    :cond_2
    :goto_0
    const/4 v1, 0x0

    .line 25
    :goto_1
    iget-object v3, v0, Lnet/zetetic/database/sqlcipher/SQLiteSession$Transaction;->a:Lnet/zetetic/database/sqlcipher/SQLiteSession$Transaction;

    .line 26
    .line 27
    iput-object v3, p0, Lnet/zetetic/database/sqlcipher/SQLiteSession;->e:Lnet/zetetic/database/sqlcipher/SQLiteSession$Transaction;

    .line 28
    .line 29
    iget-object v4, p0, Lnet/zetetic/database/sqlcipher/SQLiteSession;->d:Lnet/zetetic/database/sqlcipher/SQLiteSession$Transaction;

    .line 30
    .line 31
    iput-object v4, v0, Lnet/zetetic/database/sqlcipher/SQLiteSession$Transaction;->a:Lnet/zetetic/database/sqlcipher/SQLiteSession$Transaction;

    .line 32
    .line 33
    iput-object v0, p0, Lnet/zetetic/database/sqlcipher/SQLiteSession;->d:Lnet/zetetic/database/sqlcipher/SQLiteSession$Transaction;

    .line 34
    .line 35
    if-eqz v3, :cond_3

    .line 36
    .line 37
    if-nez v1, :cond_5

    .line 38
    .line 39
    iput-boolean v2, v3, Lnet/zetetic/database/sqlcipher/SQLiteSession$Transaction;->c:Z

    .line 40
    .line 41
    goto :goto_3

    .line 42
    :cond_3
    const/4 v0, 0x0

    .line 43
    if-eqz v1, :cond_4

    .line 44
    .line 45
    :try_start_0
    iget-object v1, p0, Lnet/zetetic/database/sqlcipher/SQLiteSession;->b:Lnet/zetetic/database/sqlcipher/SQLiteConnection;

    .line 46
    .line 47
    const-string v2, "COMMIT;"

    .line 48
    .line 49
    invoke-virtual {v1, v2, v0, p1}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->h(Ljava/lang/String;[Ljava/lang/Object;Landroid/os/CancellationSignal;)V

    .line 50
    .line 51
    .line 52
    goto :goto_2

    .line 53
    :catchall_0
    move-exception p1

    .line 54
    goto :goto_4

    .line 55
    :cond_4
    iget-object v1, p0, Lnet/zetetic/database/sqlcipher/SQLiteSession;->b:Lnet/zetetic/database/sqlcipher/SQLiteConnection;

    .line 56
    .line 57
    const-string v2, "ROLLBACK;"

    .line 58
    .line 59
    invoke-virtual {v1, v2, v0, p1}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->h(Ljava/lang/String;[Ljava/lang/Object;Landroid/os/CancellationSignal;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    .line 61
    .line 62
    :goto_2
    invoke-virtual {p0}, Lnet/zetetic/database/sqlcipher/SQLiteSession;->i()V

    .line 63
    .line 64
    .line 65
    :cond_5
    :goto_3
    return-void

    .line 66
    :goto_4
    invoke-virtual {p0}, Lnet/zetetic/database/sqlcipher/SQLiteSession;->i()V

    .line 67
    .line 68
    .line 69
    throw p1

    .line 70
    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 71
    .line 72
    const-string v0, "Cannot perform this operation because there is no current transaction."

    .line 73
    .line 74
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    throw p1
.end method

.method public final d(ILjava/lang/String;[Ljava/lang/Object;)I
    .locals 2

    .line 1
    if-eqz p2, :cond_1

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-virtual {p0, p2, p1, v0}, Lnet/zetetic/database/sqlcipher/SQLiteSession;->h(Ljava/lang/String;ILandroid/os/CancellationSignal;)Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    return p1

    .line 12
    :cond_0
    invoke-virtual {p0, p2, p1, v0}, Lnet/zetetic/database/sqlcipher/SQLiteSession;->a(Ljava/lang/String;ILandroid/os/CancellationSignal;)V

    .line 13
    .line 14
    .line 15
    :try_start_0
    iget-object p1, p0, Lnet/zetetic/database/sqlcipher/SQLiteSession;->b:Lnet/zetetic/database/sqlcipher/SQLiteConnection;

    .line 16
    .line 17
    invoke-virtual {p1, p2, p3}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->i(Ljava/lang/String;[Ljava/lang/Object;)I

    .line 18
    .line 19
    .line 20
    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    invoke-virtual {p0}, Lnet/zetetic/database/sqlcipher/SQLiteSession;->i()V

    .line 22
    .line 23
    .line 24
    return p1

    .line 25
    :catchall_0
    move-exception p1

    .line 26
    invoke-virtual {p0}, Lnet/zetetic/database/sqlcipher/SQLiteSession;->i()V

    .line 27
    .line 28
    .line 29
    throw p1

    .line 30
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 31
    .line 32
    const-string p2, "sql must not be null."

    .line 33
    .line 34
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw p1
.end method

.method public final e(Ljava/lang/String;[Ljava/lang/Object;Lnet/zetetic/database/CursorWindow;IIZILandroid/os/CancellationSignal;)I
    .locals 8

    .line 1
    move-object/from16 v7, p8

    .line 2
    .line 3
    if-eqz p1, :cond_2

    .line 4
    .line 5
    if-eqz p3, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0, p1, p7, v7}, Lnet/zetetic/database/sqlcipher/SQLiteSession;->h(Ljava/lang/String;ILandroid/os/CancellationSignal;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {p3}, Lnet/zetetic/database/CursorWindow;->h()V

    .line 14
    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    return p1

    .line 18
    :cond_0
    invoke-virtual {p0, p1, p7, v7}, Lnet/zetetic/database/sqlcipher/SQLiteSession;->a(Ljava/lang/String;ILandroid/os/CancellationSignal;)V

    .line 19
    .line 20
    .line 21
    :try_start_0
    iget-object v0, p0, Lnet/zetetic/database/sqlcipher/SQLiteSession;->b:Lnet/zetetic/database/sqlcipher/SQLiteConnection;

    .line 22
    .line 23
    move-object v1, p1

    .line 24
    move-object v2, p2

    .line 25
    move-object v3, p3

    .line 26
    move v4, p4

    .line 27
    move v5, p5

    .line 28
    move v6, p6

    .line 29
    invoke-virtual/range {v0 .. v7}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->j(Ljava/lang/String;[Ljava/lang/Object;Lnet/zetetic/database/CursorWindow;IIZLandroid/os/CancellationSignal;)I

    .line 30
    .line 31
    .line 32
    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    invoke-virtual {p0}, Lnet/zetetic/database/sqlcipher/SQLiteSession;->i()V

    .line 34
    .line 35
    .line 36
    return p1

    .line 37
    :catchall_0
    move-exception v0

    .line 38
    move-object p1, v0

    .line 39
    invoke-virtual {p0}, Lnet/zetetic/database/sqlcipher/SQLiteSession;->i()V

    .line 40
    .line 41
    .line 42
    throw p1

    .line 43
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 44
    .line 45
    const-string p2, "window must not be null."

    .line 46
    .line 47
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw p1

    .line 51
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 52
    .line 53
    const-string p2, "sql must not be null."

    .line 54
    .line 55
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw p1
.end method

.method public final f(ILjava/lang/String;[Ljava/lang/Object;)J
    .locals 2

    .line 1
    if-eqz p2, :cond_1

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-virtual {p0, p2, p1, v0}, Lnet/zetetic/database/sqlcipher/SQLiteSession;->h(Ljava/lang/String;ILandroid/os/CancellationSignal;)Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    const-wide/16 p1, 0x0

    .line 11
    .line 12
    return-wide p1

    .line 13
    :cond_0
    invoke-virtual {p0, p2, p1, v0}, Lnet/zetetic/database/sqlcipher/SQLiteSession;->a(Ljava/lang/String;ILandroid/os/CancellationSignal;)V

    .line 14
    .line 15
    .line 16
    :try_start_0
    iget-object p1, p0, Lnet/zetetic/database/sqlcipher/SQLiteSession;->b:Lnet/zetetic/database/sqlcipher/SQLiteConnection;

    .line 17
    .line 18
    invoke-virtual {p1, p2, p3}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->k(Ljava/lang/String;[Ljava/lang/Object;)J

    .line 19
    .line 20
    .line 21
    move-result-wide p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    invoke-virtual {p0}, Lnet/zetetic/database/sqlcipher/SQLiteSession;->i()V

    .line 23
    .line 24
    .line 25
    return-wide p1

    .line 26
    :catchall_0
    move-exception p1

    .line 27
    invoke-virtual {p0}, Lnet/zetetic/database/sqlcipher/SQLiteSession;->i()V

    .line 28
    .line 29
    .line 30
    throw p1

    .line 31
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 32
    .line 33
    const-string p2, "sql must not be null."

    .line 34
    .line 35
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw p1
.end method

.method public final g(ILjava/lang/String;[Ljava/lang/Object;)J
    .locals 2

    .line 1
    if-eqz p2, :cond_1

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-virtual {p0, p2, p1, v0}, Lnet/zetetic/database/sqlcipher/SQLiteSession;->h(Ljava/lang/String;ILandroid/os/CancellationSignal;)Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    const-wide/16 p1, 0x0

    .line 11
    .line 12
    return-wide p1

    .line 13
    :cond_0
    invoke-virtual {p0, p2, p1, v0}, Lnet/zetetic/database/sqlcipher/SQLiteSession;->a(Ljava/lang/String;ILandroid/os/CancellationSignal;)V

    .line 14
    .line 15
    .line 16
    :try_start_0
    iget-object p1, p0, Lnet/zetetic/database/sqlcipher/SQLiteSession;->b:Lnet/zetetic/database/sqlcipher/SQLiteConnection;

    .line 17
    .line 18
    invoke-virtual {p1, p2, p3}, Lnet/zetetic/database/sqlcipher/SQLiteConnection;->l(Ljava/lang/String;[Ljava/lang/Object;)J

    .line 19
    .line 20
    .line 21
    move-result-wide p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    invoke-virtual {p0}, Lnet/zetetic/database/sqlcipher/SQLiteSession;->i()V

    .line 23
    .line 24
    .line 25
    return-wide p1

    .line 26
    :catchall_0
    move-exception p1

    .line 27
    invoke-virtual {p0}, Lnet/zetetic/database/sqlcipher/SQLiteSession;->i()V

    .line 28
    .line 29
    .line 30
    throw p1

    .line 31
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 32
    .line 33
    const-string p2, "sql must not be null."

    .line 34
    .line 35
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw p1
.end method

.method public final h(Ljava/lang/String;ILandroid/os/CancellationSignal;)Z
    .locals 2

    .line 1
    if-eqz p3, :cond_0

    .line 2
    .line 3
    invoke-virtual {p3}, Landroid/os/CancellationSignal;->throwIfCanceled()V

    .line 4
    .line 5
    .line 6
    :cond_0
    invoke-static {p1}, Landroid/database/DatabaseUtils;->getSqlStatementType(Ljava/lang/String;)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    const/4 v0, 0x4

    .line 11
    const/4 v1, 0x1

    .line 12
    if-eq p1, v0, :cond_5

    .line 13
    .line 14
    const/4 p2, 0x5

    .line 15
    if-eq p1, p2, :cond_2

    .line 16
    .line 17
    const/4 p2, 0x6

    .line 18
    if-eq p1, p2, :cond_1

    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    return p1

    .line 22
    :cond_1
    invoke-virtual {p0, p3}, Lnet/zetetic/database/sqlcipher/SQLiteSession;->c(Landroid/os/CancellationSignal;)V

    .line 23
    .line 24
    .line 25
    return v1

    .line 26
    :cond_2
    iget-object p1, p0, Lnet/zetetic/database/sqlcipher/SQLiteSession;->e:Lnet/zetetic/database/sqlcipher/SQLiteSession$Transaction;

    .line 27
    .line 28
    if-eqz p1, :cond_4

    .line 29
    .line 30
    iget-boolean p2, p1, Lnet/zetetic/database/sqlcipher/SQLiteSession$Transaction;->b:Z

    .line 31
    .line 32
    if-nez p2, :cond_3

    .line 33
    .line 34
    iput-boolean v1, p1, Lnet/zetetic/database/sqlcipher/SQLiteSession$Transaction;->b:Z

    .line 35
    .line 36
    invoke-virtual {p0, p3}, Lnet/zetetic/database/sqlcipher/SQLiteSession;->c(Landroid/os/CancellationSignal;)V

    .line 37
    .line 38
    .line 39
    return v1

    .line 40
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 41
    .line 42
    const-string p2, "Cannot perform this operation because the transaction has already been marked successful.  The only thing you can do now is call endTransaction()."

    .line 43
    .line 44
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw p1

    .line 48
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 49
    .line 50
    const-string p2, "Cannot perform this operation because there is no current transaction."

    .line 51
    .line 52
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw p1

    .line 56
    :cond_5
    const/4 p1, 0x2

    .line 57
    invoke-virtual {p0, p1, p2, p3}, Lnet/zetetic/database/sqlcipher/SQLiteSession;->b(IILandroid/os/CancellationSignal;)V

    .line 58
    .line 59
    .line 60
    return v1
.end method

.method public final i()V
    .locals 3

    .line 1
    iget v0, p0, Lnet/zetetic/database/sqlcipher/SQLiteSession;->c:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, -0x1

    .line 4
    .line 5
    iput v0, p0, Lnet/zetetic/database/sqlcipher/SQLiteSession;->c:I

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    :try_start_0
    iget-object v1, p0, Lnet/zetetic/database/sqlcipher/SQLiteSession;->a:Lnet/zetetic/database/sqlcipher/SQLiteConnectionPool;

    .line 11
    .line 12
    iget-object v2, p0, Lnet/zetetic/database/sqlcipher/SQLiteSession;->b:Lnet/zetetic/database/sqlcipher/SQLiteConnection;

    .line 13
    .line 14
    invoke-virtual {v1, v2}, Lnet/zetetic/database/sqlcipher/SQLiteConnectionPool;->D(Lnet/zetetic/database/sqlcipher/SQLiteConnection;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lnet/zetetic/database/sqlcipher/SQLiteSession;->b:Lnet/zetetic/database/sqlcipher/SQLiteConnection;

    .line 18
    .line 19
    return-void

    .line 20
    :catchall_0
    move-exception v1

    .line 21
    iput-object v0, p0, Lnet/zetetic/database/sqlcipher/SQLiteSession;->b:Lnet/zetetic/database/sqlcipher/SQLiteConnection;

    .line 22
    .line 23
    throw v1

    .line 24
    :cond_0
    return-void
.end method
