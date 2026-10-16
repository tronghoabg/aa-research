.class public final Lcom/google/android/gms/internal/ads/zzekc;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzbhw;

.field private final zzb:Landroid/content/Context;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzejh;

.field private final zzd:LH6/a;


# direct methods
.method public constructor <init>(Landroid/content/Context;LH6/a;Lcom/google/android/gms/internal/ads/zzbhw;Lcom/google/android/gms/internal/ads/zzejh;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzekc;->zzb:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzekc;->zzd:LH6/a;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzekc;->zza:Lcom/google/android/gms/internal/ads/zzbhw;

    .line 9
    .line 10
    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzekc;->zzc:Lcom/google/android/gms/internal/ads/zzejh;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final zza(Z)V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzekc;->zzc:Lcom/google/android/gms/internal/ads/zzejh;

    .line 2
    .line 3
    new-instance v1, Lcom/google/android/gms/internal/ads/zzekb;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/ads/zzekb;-><init>(Lcom/google/android/gms/internal/ads/zzekc;Z)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzejh;->zza(Lcom/google/android/gms/internal/ads/zzfos;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :catch_0
    move-exception p1

    .line 13
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    sget v0, LG6/L;->b:I

    .line 22
    .line 23
    const-string v0, "Error in offline signals database startup: "

    .line 24
    .line 25
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-static {p1}, LH6/l;->c(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final zzb(ZLandroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Void;
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const/4 v10, 0x1

    .line 4
    const/4 v11, 0x0

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzekc;->zzb:Landroid/content/Context;

    .line 8
    .line 9
    const-string v2, "OfflineUpload.db"

    .line 10
    .line 11
    invoke-virtual {v0, v2}, Landroid/content/Context;->deleteDatabase(Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    return-object v11

    .line 15
    :cond_0
    new-instance v12, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 18
    .line 19
    .line 20
    const-string v13, "serialized_proto_data"

    .line 21
    .line 22
    filled-new-array {v13}, [Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    const/4 v6, 0x0

    .line 27
    const/4 v7, 0x0

    .line 28
    const-string v3, "offline_signal_contents"

    .line 29
    .line 30
    const/4 v5, 0x0

    .line 31
    const/4 v8, 0x0

    .line 32
    const/4 v9, 0x0

    .line 33
    move-object/from16 v2, p2

    .line 34
    .line 35
    invoke-virtual/range {v2 .. v9}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    :goto_0
    invoke-interface {v3}, Landroid/database/Cursor;->moveToNext()Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_1

    .line 44
    .line 45
    invoke-interface {v3, v13}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    invoke-interface {v3, v0}, Landroid/database/Cursor;->getBlob(I)[B

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    :try_start_0
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzbic$zzaf$zza;->zzk([B)Lcom/google/android/gms/internal/ads/zzbic$zzaf$zza;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {v12, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/zzifh; {:try_start_0 .. :try_end_0} :catch_0

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :catch_0
    move-exception v0

    .line 62
    sget v4, LG6/L;->b:I

    .line 63
    .line 64
    const-string v4, "Unable to deserialize proto from offline signals database:"

    .line 65
    .line 66
    invoke-static {v4}, LH6/l;->c(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-static {v0}, LH6/l;->c(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_1
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    .line 78
    .line 79
    .line 80
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzekc;->zzb:Landroid/content/Context;

    .line 81
    .line 82
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbic$zzaf;->zzB()Lcom/google/android/gms/internal/ads/zzbic$zzaf$zzc;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-virtual {v3, v0}, Lcom/google/android/gms/internal/ads/zzbic$zzaf$zzc;->zzB(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzbic$zzaf$zzc;

    .line 91
    .line 92
    .line 93
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 94
    .line 95
    invoke-virtual {v3, v0}, Lcom/google/android/gms/internal/ads/zzbic$zzaf$zzc;->zzH(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzbic$zzaf$zzc;

    .line 96
    .line 97
    .line 98
    const/4 v0, 0x0

    .line 99
    invoke-static {v2, v0}, Lcom/google/android/gms/internal/ads/zzejw;->zzc(Landroid/database/sqlite/SQLiteDatabase;I)I

    .line 100
    .line 101
    .line 102
    move-result v4

    .line 103
    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ads/zzbic$zzaf$zzc;->zzo(I)Lcom/google/android/gms/internal/ads/zzbic$zzaf$zzc;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v3, v12}, Lcom/google/android/gms/internal/ads/zzbic$zzaf$zzc;->zzj(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/ads/zzbic$zzaf$zzc;

    .line 107
    .line 108
    .line 109
    invoke-static {v2, v10}, Lcom/google/android/gms/internal/ads/zzejw;->zzc(Landroid/database/sqlite/SQLiteDatabase;I)I

    .line 110
    .line 111
    .line 112
    move-result v4

    .line 113
    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ads/zzbic$zzaf$zzc;->zzs(I)Lcom/google/android/gms/internal/ads/zzbic$zzaf$zzc;

    .line 114
    .line 115
    .line 116
    const/4 v4, 0x3

    .line 117
    invoke-static {v2, v4}, Lcom/google/android/gms/internal/ads/zzejw;->zzc(Landroid/database/sqlite/SQLiteDatabase;I)I

    .line 118
    .line 119
    .line 120
    move-result v4

    .line 121
    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ads/zzbic$zzaf$zzc;->zzQ(I)Lcom/google/android/gms/internal/ads/zzbic$zzaf$zzc;

    .line 122
    .line 123
    .line 124
    sget-object v4, LC6/n;->D:LC6/n;

    .line 125
    .line 126
    iget-object v4, v4, LC6/n;->k:Ln7/b;

    .line 127
    .line 128
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 132
    .line 133
    .line 134
    move-result-wide v4

    .line 135
    invoke-virtual {v3, v4, v5}, Lcom/google/android/gms/internal/ads/zzbic$zzaf$zzc;->zzw(J)Lcom/google/android/gms/internal/ads/zzbic$zzaf$zzc;

    .line 136
    .line 137
    .line 138
    const/4 v4, 0x2

    .line 139
    invoke-static {v2, v4}, Lcom/google/android/gms/internal/ads/zzejw;->zzd(Landroid/database/sqlite/SQLiteDatabase;I)J

    .line 140
    .line 141
    .line 142
    move-result-wide v5

    .line 143
    invoke-virtual {v3, v5, v6}, Lcom/google/android/gms/internal/ads/zzbic$zzaf$zzc;->zzM(J)Lcom/google/android/gms/internal/ads/zzbic$zzaf$zzc;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zziej;->zzbm()Lcom/google/android/gms/internal/ads/zziep;

    .line 147
    .line 148
    .line 149
    move-result-object v3

    .line 150
    check-cast v3, Lcom/google/android/gms/internal/ads/zzbic$zzaf;

    .line 151
    .line 152
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 153
    .line 154
    .line 155
    move-result v5

    .line 156
    const-wide/16 v6, 0x0

    .line 157
    .line 158
    move v8, v0

    .line 159
    move-wide v13, v6

    .line 160
    :goto_1
    if-ge v8, v5, :cond_3

    .line 161
    .line 162
    invoke-virtual {v12, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v9

    .line 166
    check-cast v9, Lcom/google/android/gms/internal/ads/zzbic$zzaf$zza;

    .line 167
    .line 168
    invoke-virtual {v9}, Lcom/google/android/gms/internal/ads/zzbic$zzaf$zza;->zzf()Lcom/google/android/gms/internal/ads/zzbic$zzq;

    .line 169
    .line 170
    .line 171
    move-result-object v15

    .line 172
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbic$zzq;->zzb:Lcom/google/android/gms/internal/ads/zzbic$zzq;

    .line 173
    .line 174
    if-ne v15, v0, :cond_2

    .line 175
    .line 176
    invoke-virtual {v9}, Lcom/google/android/gms/internal/ads/zzbic$zzaf$zza;->zzb()J

    .line 177
    .line 178
    .line 179
    move-result-wide v15

    .line 180
    cmp-long v0, v15, v13

    .line 181
    .line 182
    if-lez v0, :cond_2

    .line 183
    .line 184
    invoke-virtual {v9}, Lcom/google/android/gms/internal/ads/zzbic$zzaf$zza;->zzb()J

    .line 185
    .line 186
    .line 187
    move-result-wide v13

    .line 188
    :cond_2
    add-int/2addr v8, v10

    .line 189
    const/4 v0, 0x0

    .line 190
    goto :goto_1

    .line 191
    :cond_3
    cmp-long v0, v13, v6

    .line 192
    .line 193
    if-eqz v0, :cond_4

    .line 194
    .line 195
    new-instance v0, Landroid/content/ContentValues;

    .line 196
    .line 197
    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    .line 198
    .line 199
    .line 200
    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 201
    .line 202
    .line 203
    move-result-object v5

    .line 204
    const-string v6, "value"

    .line 205
    .line 206
    invoke-virtual {v0, v6, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 207
    .line 208
    .line 209
    const-string v5, "statistic_name = \'last_successful_request_time\'"

    .line 210
    .line 211
    const-string v6, "offline_signal_statistics"

    .line 212
    .line 213
    invoke-virtual {v2, v6, v0, v5, v11}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    .line 214
    .line 215
    .line 216
    :cond_4
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzekc;->zza:Lcom/google/android/gms/internal/ads/zzbhw;

    .line 217
    .line 218
    new-instance v5, Lcom/google/android/gms/internal/ads/zzejz;

    .line 219
    .line 220
    invoke-direct {v5, v3}, Lcom/google/android/gms/internal/ads/zzejz;-><init>(Lcom/google/android/gms/internal/ads/zzbic$zzaf;)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v0, v5}, Lcom/google/android/gms/internal/ads/zzbhw;->zzb(Lcom/google/android/gms/internal/ads/zzbhv;)V

    .line 224
    .line 225
    .line 226
    iget-object v3, v1, Lcom/google/android/gms/internal/ads/zzekc;->zzd:LH6/a;

    .line 227
    .line 228
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbic$zzar;->zzs()Lcom/google/android/gms/internal/ads/zzbic$zzar$zza;

    .line 229
    .line 230
    .line 231
    move-result-object v5

    .line 232
    iget v6, v3, LH6/a;->b:I

    .line 233
    .line 234
    invoke-virtual {v5, v6}, Lcom/google/android/gms/internal/ads/zzbic$zzar$zza;->zzc(I)Lcom/google/android/gms/internal/ads/zzbic$zzar$zza;

    .line 235
    .line 236
    .line 237
    iget v6, v3, LH6/a;->c:I

    .line 238
    .line 239
    invoke-virtual {v5, v6}, Lcom/google/android/gms/internal/ads/zzbic$zzar$zza;->zzg(I)Lcom/google/android/gms/internal/ads/zzbic$zzar$zza;

    .line 240
    .line 241
    .line 242
    iget-boolean v3, v3, LH6/a;->d:Z

    .line 243
    .line 244
    if-eq v10, v3, :cond_5

    .line 245
    .line 246
    goto :goto_2

    .line 247
    :cond_5
    const/4 v4, 0x0

    .line 248
    :goto_2
    invoke-virtual {v5, v4}, Lcom/google/android/gms/internal/ads/zzbic$zzar$zza;->zzk(I)Lcom/google/android/gms/internal/ads/zzbic$zzar$zza;

    .line 249
    .line 250
    .line 251
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zziej;->zzbm()Lcom/google/android/gms/internal/ads/zziep;

    .line 252
    .line 253
    .line 254
    move-result-object v3

    .line 255
    check-cast v3, Lcom/google/android/gms/internal/ads/zzbic$zzar;

    .line 256
    .line 257
    new-instance v4, Lcom/google/android/gms/internal/ads/zzeka;

    .line 258
    .line 259
    invoke-direct {v4, v3}, Lcom/google/android/gms/internal/ads/zzeka;-><init>(Lcom/google/android/gms/internal/ads/zzbic$zzar;)V

    .line 260
    .line 261
    .line 262
    invoke-virtual {v0, v4}, Lcom/google/android/gms/internal/ads/zzbhw;->zzb(Lcom/google/android/gms/internal/ads/zzbhv;)V

    .line 263
    .line 264
    .line 265
    const/16 v3, 0x2714

    .line 266
    .line 267
    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/ads/zzbhw;->zzc(I)V

    .line 268
    .line 269
    .line 270
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzejw;->zzb(Landroid/database/sqlite/SQLiteDatabase;)V

    .line 271
    .line 272
    .line 273
    return-object v11
.end method
