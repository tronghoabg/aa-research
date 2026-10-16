.class public final LA7/l;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public b:J

.field public final synthetic c:LA7/i;


# direct methods
.method public constructor <init>(LA7/i;Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LA7/l;->c:LA7/i;

    .line 5
    .line 6
    const-wide/16 v0, -0x1

    .line 7
    .line 8
    iput-wide v0, p0, LA7/l;->b:J

    .line 9
    .line 10
    invoke-static {p2}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    iput-object p2, p0, LA7/l;->a:Ljava/lang/String;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v2, v1, LA7/l;->c:LA7/i;

    .line 4
    .line 5
    new-instance v3, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    const-string v7, "app_id = ? and rowid > ?"

    .line 11
    .line 12
    iget-wide v4, v1, LA7/l;->b:J

    .line 13
    .line 14
    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v13, v1, LA7/l;->a:Ljava/lang/String;

    .line 19
    .line 20
    filled-new-array {v13, v0}, [Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v8

    .line 24
    const/4 v14, 0x0

    .line 25
    :try_start_0
    invoke-virtual {v2}, LA7/i;->l0()Landroid/database/sqlite/SQLiteDatabase;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    const-string v5, "raw_events"

    .line 30
    .line 31
    const-string v15, "rowid"

    .line 32
    .line 33
    const-string v16, "name"

    .line 34
    .line 35
    const-string v17, "timestamp"

    .line 36
    .line 37
    const-string v18, "metadata_fingerprint"

    .line 38
    .line 39
    const-string v19, "data"

    .line 40
    .line 41
    const-string v20, "realtime"

    .line 42
    .line 43
    filled-new-array/range {v15 .. v20}, [Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v6

    .line 47
    const-string v11, "rowid"

    .line 48
    .line 49
    const-string v12, "1000"

    .line 50
    .line 51
    const/4 v9, 0x0

    .line 52
    const/4 v10, 0x0

    .line 53
    invoke-virtual/range {v4 .. v12}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 54
    .line 55
    .line 56
    move-result-object v14

    .line 57
    invoke-interface {v14}, Landroid/database/Cursor;->moveToFirst()Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-nez v0, :cond_0

    .line 62
    .line 63
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 64
    .line 65
    invoke-interface {v14}, Landroid/database/Cursor;->close()V

    .line 66
    .line 67
    .line 68
    return-object v0

    .line 69
    :catchall_0
    move-exception v0

    .line 70
    goto/16 :goto_4

    .line 71
    .line 72
    :catch_0
    move-exception v0

    .line 73
    goto/16 :goto_2

    .line 74
    .line 75
    :cond_0
    const/4 v0, 0x0

    .line 76
    :try_start_1
    invoke-interface {v14, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 77
    .line 78
    .line 79
    move-result-wide v5

    .line 80
    const/4 v4, 0x3

    .line 81
    invoke-interface {v14, v4}, Landroid/database/Cursor;->getLong(I)J

    .line 82
    .line 83
    .line 84
    move-result-wide v7

    .line 85
    const/4 v4, 0x5

    .line 86
    invoke-interface {v14, v4}, Landroid/database/Cursor;->getLong(I)J

    .line 87
    .line 88
    .line 89
    move-result-wide v9

    .line 90
    const-wide/16 v11, 0x1

    .line 91
    .line 92
    cmp-long v4, v9, v11

    .line 93
    .line 94
    const/4 v9, 0x1

    .line 95
    if-nez v4, :cond_1

    .line 96
    .line 97
    move v0, v9

    .line 98
    :cond_1
    const/4 v4, 0x4

    .line 99
    invoke-interface {v14, v4}, Landroid/database/Cursor;->getBlob(I)[B

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    iget-wide v10, v1, LA7/l;->b:J

    .line 104
    .line 105
    cmp-long v10, v5, v10

    .line 106
    .line 107
    if-lez v10, :cond_2

    .line 108
    .line 109
    iput-wide v5, v1, LA7/l;->b:J
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 110
    .line 111
    :cond_2
    :try_start_2
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzfy$zzf;->zze()Lcom/google/android/gms/internal/measurement/zzfy$zzf$zza;

    .line 112
    .line 113
    .line 114
    move-result-object v10

    .line 115
    invoke-static {v10, v4}, LA7/S1;->t0(Lcom/google/android/gms/internal/measurement/zzjt$zzb;[B)Lcom/google/android/gms/internal/measurement/zzlb;

    .line 116
    .line 117
    .line 118
    move-result-object v4

    .line 119
    check-cast v4, Lcom/google/android/gms/internal/measurement/zzfy$zzf$zza;
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 120
    .line 121
    :try_start_3
    invoke-interface {v14, v9}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v9

    .line 125
    if-eqz v9, :cond_3

    .line 126
    .line 127
    goto :goto_0

    .line 128
    :cond_3
    const-string v9, ""

    .line 129
    .line 130
    :goto_0
    invoke-virtual {v4, v9}, Lcom/google/android/gms/internal/measurement/zzfy$zzf$zza;->zza(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzfy$zzf$zza;

    .line 131
    .line 132
    .line 133
    move-result-object v9

    .line 134
    const/4 v10, 0x2

    .line 135
    invoke-interface {v14, v10}, Landroid/database/Cursor;->getLong(I)J

    .line 136
    .line 137
    .line 138
    move-result-wide v10

    .line 139
    invoke-virtual {v9, v10, v11}, Lcom/google/android/gms/internal/measurement/zzfy$zzf$zza;->zzb(J)Lcom/google/android/gms/internal/measurement/zzfy$zzf$zza;

    .line 140
    .line 141
    .line 142
    move-object v9, v4

    .line 143
    new-instance v4, LA7/j;

    .line 144
    .line 145
    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/zzjt$zzb;->zzai()Lcom/google/android/gms/internal/measurement/zzlc;

    .line 146
    .line 147
    .line 148
    move-result-object v9

    .line 149
    check-cast v9, Lcom/google/android/gms/internal/measurement/zzjt;

    .line 150
    .line 151
    move-object v10, v9

    .line 152
    check-cast v10, Lcom/google/android/gms/internal/measurement/zzfy$zzf;

    .line 153
    .line 154
    move v9, v0

    .line 155
    invoke-direct/range {v4 .. v10}, LA7/j;-><init>(JJZLcom/google/android/gms/internal/measurement/zzfy$zzf;)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    goto :goto_1

    .line 162
    :catch_1
    move-exception v0

    .line 163
    invoke-virtual {v2}, LA7/B0;->zzj()LA7/N;

    .line 164
    .line 165
    .line 166
    move-result-object v4

    .line 167
    iget-object v4, v4, LA7/N;->f:LA7/P;

    .line 168
    .line 169
    const-string v5, "Data loss. Failed to merge raw event. appId"

    .line 170
    .line 171
    invoke-static {v13}, LA7/N;->h0(Ljava/lang/String;)LA7/O;

    .line 172
    .line 173
    .line 174
    move-result-object v6

    .line 175
    invoke-virtual {v4, v6, v5, v0}, LA7/P;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    :goto_1
    invoke-interface {v14}, Landroid/database/Cursor;->moveToNext()Z

    .line 179
    .line 180
    .line 181
    move-result v0
    :try_end_3
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 182
    if-nez v0, :cond_0

    .line 183
    .line 184
    invoke-interface {v14}, Landroid/database/Cursor;->close()V

    .line 185
    .line 186
    .line 187
    goto :goto_3

    .line 188
    :goto_2
    :try_start_4
    invoke-virtual {v2}, LA7/B0;->zzj()LA7/N;

    .line 189
    .line 190
    .line 191
    move-result-object v2

    .line 192
    iget-object v2, v2, LA7/N;->f:LA7/P;

    .line 193
    .line 194
    const-string v4, "Data loss. Error querying raw events batch. appId"

    .line 195
    .line 196
    invoke-static {v13}, LA7/N;->h0(Ljava/lang/String;)LA7/O;

    .line 197
    .line 198
    .line 199
    move-result-object v5

    .line 200
    invoke-virtual {v2, v5, v4, v0}, LA7/P;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 201
    .line 202
    .line 203
    if-eqz v14, :cond_4

    .line 204
    .line 205
    invoke-interface {v14}, Landroid/database/Cursor;->close()V

    .line 206
    .line 207
    .line 208
    :cond_4
    :goto_3
    return-object v3

    .line 209
    :goto_4
    if-eqz v14, :cond_5

    .line 210
    .line 211
    invoke-interface {v14}, Landroid/database/Cursor;->close()V

    .line 212
    .line 213
    .line 214
    :cond_5
    throw v0
.end method
