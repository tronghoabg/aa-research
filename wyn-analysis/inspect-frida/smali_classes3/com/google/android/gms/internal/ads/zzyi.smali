.class final Lcom/google/android/gms/internal/ads/zzyi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzacb;
.implements Lcom/google/android/gms/internal/ads/zzxa;


# instance fields
.field final synthetic zza:Lcom/google/android/gms/internal/ads/zzyr;

.field private final zzb:J

.field private final zzc:Landroid/net/Uri;

.field private final zzd:Lcom/google/android/gms/internal/ads/zzio;

.field private final zze:Lcom/google/android/gms/internal/ads/zzye;

.field private final zzf:Lcom/google/android/gms/internal/ads/zzagd;

.field private final zzg:Lcom/google/android/gms/internal/ads/zzdt;

.field private final zzh:Lcom/google/android/gms/internal/ads/zzaha;

.field private volatile zzi:Z

.field private zzj:Z

.field private zzk:J

.field private zzl:Lcom/google/android/gms/internal/ads/zzhv;

.field private zzm:Lcom/google/android/gms/internal/ads/zzahm;

.field private zzn:Z


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzyr;Landroid/net/Uri;Lcom/google/android/gms/internal/ads/zzhr;Lcom/google/android/gms/internal/ads/zzye;Lcom/google/android/gms/internal/ads/zzagd;Lcom/google/android/gms/internal/ads/zzdt;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzyi;->zza:Lcom/google/android/gms/internal/ads/zzyr;

    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzyi;->zzc:Landroid/net/Uri;

    .line 10
    .line 11
    new-instance p1, Lcom/google/android/gms/internal/ads/zzio;

    .line 12
    .line 13
    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/ads/zzio;-><init>(Lcom/google/android/gms/internal/ads/zzhr;)V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzyi;->zzd:Lcom/google/android/gms/internal/ads/zzio;

    .line 17
    .line 18
    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzyi;->zze:Lcom/google/android/gms/internal/ads/zzye;

    .line 19
    .line 20
    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzyi;->zzf:Lcom/google/android/gms/internal/ads/zzagd;

    .line 21
    .line 22
    iput-object p6, p0, Lcom/google/android/gms/internal/ads/zzyi;->zzg:Lcom/google/android/gms/internal/ads/zzdt;

    .line 23
    .line 24
    new-instance p1, Lcom/google/android/gms/internal/ads/zzaha;

    .line 25
    .line 26
    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzaha;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzyi;->zzh:Lcom/google/android/gms/internal/ads/zzaha;

    .line 30
    .line 31
    const/4 p1, 0x1

    .line 32
    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzyi;->zzj:Z

    .line 33
    .line 34
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzxc;->zza()J

    .line 35
    .line 36
    .line 37
    move-result-wide p1

    .line 38
    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzyi;->zzb:J

    .line 39
    .line 40
    const-wide/16 p1, 0x0

    .line 41
    .line 42
    const/4 p3, 0x0

    .line 43
    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzyi;->zzi(JLjava/lang/String;)Lcom/google/android/gms/internal/ads/zzhv;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzyi;->zzl:Lcom/google/android/gms/internal/ads/zzhv;

    .line 48
    .line 49
    return-void
.end method

.method private final zzi(JLjava/lang/String;)Lcom/google/android/gms/internal/ads/zzhv;
    .locals 2

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzyr;->zzJ()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz p3, :cond_0

    .line 6
    .line 7
    const-string v1, "W/"

    .line 8
    .line 9
    invoke-virtual {p3, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    new-instance v1, Lcom/google/android/gms/internal/ads/zzgwv;

    .line 16
    .line 17
    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/zzgwv;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzgwv;->zzb(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/ads/zzgwv;

    .line 25
    .line 26
    .line 27
    const-string v0, "If-Range"

    .line 28
    .line 29
    invoke-virtual {v1, v0, p3}, Lcom/google/android/gms/internal/ads/zzgwv;->zza(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzgwv;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzgwv;->zzd()Lcom/google/android/gms/internal/ads/zzgww;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    :cond_0
    new-instance p3, Lcom/google/android/gms/internal/ads/zzhu;

    .line 37
    .line 38
    invoke-direct {p3}, Lcom/google/android/gms/internal/ads/zzhu;-><init>()V

    .line 39
    .line 40
    .line 41
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzyi;->zzc:Landroid/net/Uri;

    .line 42
    .line 43
    invoke-virtual {p3, v1}, Lcom/google/android/gms/internal/ads/zzhu;->zza(Landroid/net/Uri;)Lcom/google/android/gms/internal/ads/zzhu;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p3, p1, p2}, Lcom/google/android/gms/internal/ads/zzhu;->zzc(J)Lcom/google/android/gms/internal/ads/zzhu;

    .line 47
    .line 48
    .line 49
    const/4 p1, 0x6

    .line 50
    invoke-virtual {p3, p1}, Lcom/google/android/gms/internal/ads/zzhu;->zzd(I)Lcom/google/android/gms/internal/ads/zzhu;

    .line 51
    .line 52
    .line 53
    invoke-virtual {p3, v0}, Lcom/google/android/gms/internal/ads/zzhu;->zzb(Ljava/util/Map;)Lcom/google/android/gms/internal/ads/zzhu;

    .line 54
    .line 55
    .line 56
    invoke-virtual {p3}, Lcom/google/android/gms/internal/ads/zzhu;->zze()Lcom/google/android/gms/internal/ads/zzhv;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    return-object p1
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/ads/zzeu;)V
    .locals 11

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzyi;->zzn:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    iget-wide v2, p0, Lcom/google/android/gms/internal/ads/zzyi;->zzk:J

    .line 7
    .line 8
    :goto_0
    move-wide v5, v2

    .line 9
    goto :goto_1

    .line 10
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzyi;->zza:Lcom/google/android/gms/internal/ads/zzyr;

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzyr;->zzI(Z)J

    .line 13
    .line 14
    .line 15
    move-result-wide v2

    .line 16
    iget-wide v4, p0, Lcom/google/android/gms/internal/ads/zzyi;->zzk:J

    .line 17
    .line 18
    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->max(JJ)J

    .line 19
    .line 20
    .line 21
    move-result-wide v2

    .line 22
    goto :goto_0

    .line 23
    :goto_1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzeu;->zzd()I

    .line 24
    .line 25
    .line 26
    move-result v8

    .line 27
    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzyi;->zzm:Lcom/google/android/gms/internal/ads/zzahm;

    .line 28
    .line 29
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    invoke-interface {v4, p1, v8}, Lcom/google/android/gms/internal/ads/zzahm;->zzc(Lcom/google/android/gms/internal/ads/zzeu;I)V

    .line 33
    .line 34
    .line 35
    const/4 v9, 0x0

    .line 36
    const/4 v10, 0x0

    .line 37
    const/4 v7, 0x1

    .line 38
    invoke-interface/range {v4 .. v10}, Lcom/google/android/gms/internal/ads/zzahm;->zze(JIIILcom/google/android/gms/internal/ads/zzahl;)V

    .line 39
    .line 40
    .line 41
    iput-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzyi;->zzn:Z

    .line 42
    .line 43
    return-void
.end method

.method public final zzb()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzyi;->zzi:Z

    return-void
.end method

.method public final zzc()V
    .locals 26
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const/4 v2, 0x0

    .line 4
    move v3, v2

    .line 5
    const/4 v4, 0x0

    .line 6
    :goto_0
    if-nez v3, :cond_16

    .line 7
    .line 8
    iget-boolean v3, v1, Lcom/google/android/gms/internal/ads/zzyi;->zzi:Z

    .line 9
    .line 10
    if-nez v3, :cond_16

    .line 11
    .line 12
    const-wide/16 v5, -0x1

    .line 13
    .line 14
    :try_start_0
    iget-object v7, v1, Lcom/google/android/gms/internal/ads/zzyi;->zzh:Lcom/google/android/gms/internal/ads/zzaha;

    .line 15
    .line 16
    iget-wide v12, v7, Lcom/google/android/gms/internal/ads/zzaha;->zza:J

    .line 17
    .line 18
    invoke-direct {v1, v12, v13, v4}, Lcom/google/android/gms/internal/ads/zzyi;->zzi(JLjava/lang/String;)Lcom/google/android/gms/internal/ads/zzhv;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    iput-object v4, v1, Lcom/google/android/gms/internal/ads/zzyi;->zzl:Lcom/google/android/gms/internal/ads/zzhv;

    .line 23
    .line 24
    iget-object v7, v1, Lcom/google/android/gms/internal/ads/zzyi;->zzd:Lcom/google/android/gms/internal/ads/zzio;

    .line 25
    .line 26
    invoke-virtual {v7, v4}, Lcom/google/android/gms/internal/ads/zzio;->zzb(Lcom/google/android/gms/internal/ads/zzhv;)J

    .line 27
    .line 28
    .line 29
    move-result-wide v8

    .line 30
    iget-boolean v4, v1, Lcom/google/android/gms/internal/ads/zzyi;->zzi:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    .line 32
    if-eqz v4, :cond_1

    .line 33
    .line 34
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzyi;->zze:Lcom/google/android/gms/internal/ads/zzye;

    .line 35
    .line 36
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzye;->zzd()J

    .line 37
    .line 38
    .line 39
    move-result-wide v2

    .line 40
    cmp-long v2, v2, v5

    .line 41
    .line 42
    if-eqz v2, :cond_0

    .line 43
    .line 44
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzyi;->zzh:Lcom/google/android/gms/internal/ads/zzaha;

    .line 45
    .line 46
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzye;->zzd()J

    .line 47
    .line 48
    .line 49
    move-result-wide v3

    .line 50
    iput-wide v3, v2, Lcom/google/android/gms/internal/ads/zzaha;->zza:J

    .line 51
    .line 52
    :cond_0
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzyi;->zzd:Lcom/google/android/gms/internal/ads/zzio;

    .line 53
    .line 54
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzht;->zza(Lcom/google/android/gms/internal/ads/zzhr;)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :cond_1
    :try_start_1
    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/zzio;->zzj()Ljava/util/Map;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    const-string v10, "ETag"

    .line 63
    .line 64
    invoke-interface {v4, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    check-cast v4, Ljava/util/List;

    .line 69
    .line 70
    if-eqz v4, :cond_2

    .line 71
    .line 72
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 73
    .line 74
    .line 75
    move-result v10

    .line 76
    if-nez v10, :cond_2

    .line 77
    .line 78
    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    check-cast v4, Ljava/lang/String;

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :catchall_0
    move-exception v0

    .line 86
    move v3, v2

    .line 87
    move-wide/from16 v17, v5

    .line 88
    .line 89
    goto/16 :goto_e

    .line 90
    .line 91
    :cond_2
    const/4 v4, 0x0

    .line 92
    :goto_1
    cmp-long v10, v8, v5

    .line 93
    .line 94
    if-eqz v10, :cond_3

    .line 95
    .line 96
    add-long/2addr v8, v12

    .line 97
    iget-object v10, v1, Lcom/google/android/gms/internal/ads/zzyi;->zza:Lcom/google/android/gms/internal/ads/zzyr;

    .line 98
    .line 99
    invoke-virtual {v10}, Lcom/google/android/gms/internal/ads/zzyr;->zzH()V

    .line 100
    .line 101
    .line 102
    :cond_3
    move-wide v14, v8

    .line 103
    iget-object v8, v1, Lcom/google/android/gms/internal/ads/zzyi;->zza:Lcom/google/android/gms/internal/ads/zzyr;

    .line 104
    .line 105
    invoke-virtual {v7}, Lcom/google/android/gms/internal/ads/zzio;->zzj()Ljava/util/Map;

    .line 106
    .line 107
    .line 108
    move-result-object v7

    .line 109
    const-string v9, "icy-br"

    .line 110
    .line 111
    const-string v10, "Invalid bitrate header: "

    .line 112
    .line 113
    const-string v11, "Invalid metadata interval: "

    .line 114
    .line 115
    const-string v0, "Invalid bitrate: "

    .line 116
    .line 117
    invoke-interface {v7, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v9

    .line 121
    check-cast v9, Ljava/util/List;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 122
    .line 123
    move-wide/from16 v17, v5

    .line 124
    .line 125
    const-string v5, "IcyHeaders"

    .line 126
    .line 127
    if-eqz v9, :cond_5

    .line 128
    .line 129
    :try_start_2
    invoke-interface {v9, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v9

    .line 133
    check-cast v9, Ljava/lang/String;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 134
    .line 135
    :try_start_3
    invoke-static {v9}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 136
    .line 137
    .line 138
    move-result v3
    :try_end_3
    .catch Ljava/lang/NumberFormatException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 139
    mul-int/lit16 v3, v3, 0x3e8

    .line 140
    .line 141
    if-lez v3, :cond_4

    .line 142
    .line 143
    move/from16 v20, v3

    .line 144
    .line 145
    const/4 v0, 0x1

    .line 146
    goto :goto_2

    .line 147
    :cond_4
    :try_start_4
    invoke-static {v9}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v16

    .line 151
    invoke-virtual/range {v16 .. v16}, Ljava/lang/String;->length()I

    .line 152
    .line 153
    .line 154
    move-result v16

    .line 155
    add-int/lit8 v6, v16, 0x11

    .line 156
    .line 157
    new-instance v2, Ljava/lang/StringBuilder;

    .line 158
    .line 159
    invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    invoke-static {v5, v0}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_4
    .catch Ljava/lang/NumberFormatException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 173
    .line 174
    .line 175
    :cond_5
    const/4 v0, 0x0

    .line 176
    const/16 v20, -0x1

    .line 177
    .line 178
    goto :goto_2

    .line 179
    :catchall_1
    move-exception v0

    .line 180
    const/4 v3, 0x0

    .line 181
    goto/16 :goto_e

    .line 182
    .line 183
    :catch_0
    const/4 v3, -0x1

    .line 184
    :catch_1
    :try_start_5
    invoke-static {v9}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    invoke-virtual {v10, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    invoke-static {v5, v0}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    move/from16 v20, v3

    .line 196
    .line 197
    const/4 v0, 0x0

    .line 198
    :goto_2
    const-string v2, "icy-genre"

    .line 199
    .line 200
    invoke-interface {v7, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v2

    .line 204
    check-cast v2, Ljava/util/List;

    .line 205
    .line 206
    if-eqz v2, :cond_6

    .line 207
    .line 208
    const/4 v3, 0x0

    .line 209
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    check-cast v0, Ljava/lang/String;

    .line 214
    .line 215
    move-object/from16 v21, v0

    .line 216
    .line 217
    const/4 v0, 0x1

    .line 218
    goto :goto_3

    .line 219
    :cond_6
    const/16 v21, 0x0

    .line 220
    .line 221
    :goto_3
    const-string v2, "icy-name"

    .line 222
    .line 223
    invoke-interface {v7, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v2

    .line 227
    check-cast v2, Ljava/util/List;

    .line 228
    .line 229
    if-eqz v2, :cond_7

    .line 230
    .line 231
    const/4 v3, 0x0

    .line 232
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    check-cast v0, Ljava/lang/String;

    .line 237
    .line 238
    move-object/from16 v22, v0

    .line 239
    .line 240
    const/4 v0, 0x1

    .line 241
    goto :goto_4

    .line 242
    :cond_7
    const/16 v22, 0x0

    .line 243
    .line 244
    :goto_4
    const-string v2, "icy-url"

    .line 245
    .line 246
    invoke-interface {v7, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v2

    .line 250
    check-cast v2, Ljava/util/List;

    .line 251
    .line 252
    if-eqz v2, :cond_8

    .line 253
    .line 254
    const/4 v3, 0x0

    .line 255
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    check-cast v0, Ljava/lang/String;

    .line 260
    .line 261
    move-object/from16 v23, v0

    .line 262
    .line 263
    const/4 v0, 0x1

    .line 264
    goto :goto_5

    .line 265
    :cond_8
    const/16 v23, 0x0

    .line 266
    .line 267
    :goto_5
    const-string v2, "icy-pub"

    .line 268
    .line 269
    invoke-interface {v7, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v2

    .line 273
    check-cast v2, Ljava/util/List;

    .line 274
    .line 275
    if-eqz v2, :cond_9

    .line 276
    .line 277
    const/4 v3, 0x0

    .line 278
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v0

    .line 282
    check-cast v0, Ljava/lang/String;

    .line 283
    .line 284
    const-string v2, "1"

    .line 285
    .line 286
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 287
    .line 288
    .line 289
    move-result v0

    .line 290
    move/from16 v24, v0

    .line 291
    .line 292
    const/4 v0, 0x1

    .line 293
    goto :goto_6

    .line 294
    :cond_9
    const/16 v24, 0x0

    .line 295
    .line 296
    :goto_6
    const-string v2, "icy-metaint"

    .line 297
    .line 298
    invoke-interface {v7, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    move-result-object v2

    .line 302
    check-cast v2, Ljava/util/List;

    .line 303
    .line 304
    if-eqz v2, :cond_b

    .line 305
    .line 306
    const/4 v3, 0x0

    .line 307
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v2

    .line 311
    check-cast v2, Ljava/lang/String;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 312
    .line 313
    :try_start_6
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 314
    .line 315
    .line 316
    move-result v3
    :try_end_6
    .catch Ljava/lang/NumberFormatException; {:try_start_6 .. :try_end_6} :catch_2
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 317
    if-lez v3, :cond_a

    .line 318
    .line 319
    move/from16 v25, v3

    .line 320
    .line 321
    const/4 v0, 0x1

    .line 322
    goto :goto_7

    .line 323
    :cond_a
    :try_start_7
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 324
    .line 325
    .line 326
    move-result-object v6

    .line 327
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 328
    .line 329
    .line 330
    move-result v6

    .line 331
    add-int/lit8 v6, v6, 0x1b

    .line 332
    .line 333
    new-instance v7, Ljava/lang/StringBuilder;

    .line 334
    .line 335
    invoke-direct {v7, v6}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 336
    .line 337
    .line 338
    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 339
    .line 340
    .line 341
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 342
    .line 343
    .line 344
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 345
    .line 346
    .line 347
    move-result-object v6

    .line 348
    invoke-static {v5, v6}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_7
    .catch Ljava/lang/NumberFormatException; {:try_start_7 .. :try_end_7} :catch_3
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 349
    .line 350
    .line 351
    :cond_b
    const/16 v25, -0x1

    .line 352
    .line 353
    goto :goto_7

    .line 354
    :catch_2
    const/4 v3, -0x1

    .line 355
    :catch_3
    :try_start_8
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 356
    .line 357
    .line 358
    move-result-object v2

    .line 359
    invoke-virtual {v11, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 360
    .line 361
    .line 362
    move-result-object v2

    .line 363
    invoke-static {v5, v2}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    .line 364
    .line 365
    .line 366
    move/from16 v25, v3

    .line 367
    .line 368
    :goto_7
    if-eqz v0, :cond_c

    .line 369
    .line 370
    new-instance v19, Lcom/google/android/gms/internal/ads/zzajh;

    .line 371
    .line 372
    invoke-direct/range {v19 .. v25}, Lcom/google/android/gms/internal/ads/zzajh;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)V

    .line 373
    .line 374
    .line 375
    move-object/from16 v0, v19

    .line 376
    .line 377
    goto :goto_8

    .line 378
    :cond_c
    const/4 v0, 0x0

    .line 379
    :goto_8
    invoke-virtual {v8, v0}, Lcom/google/android/gms/internal/ads/zzyr;->zzP(Lcom/google/android/gms/internal/ads/zzajh;)V

    .line 380
    .line 381
    .line 382
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzyi;->zzd:Lcom/google/android/gms/internal/ads/zzio;

    .line 383
    .line 384
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzyi;->zza:Lcom/google/android/gms/internal/ads/zzyr;

    .line 385
    .line 386
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzyr;->zzO()Lcom/google/android/gms/internal/ads/zzajh;

    .line 387
    .line 388
    .line 389
    move-result-object v3

    .line 390
    if-eqz v3, :cond_d

    .line 391
    .line 392
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzyr;->zzO()Lcom/google/android/gms/internal/ads/zzajh;

    .line 393
    .line 394
    .line 395
    move-result-object v3

    .line 396
    iget v3, v3, Lcom/google/android/gms/internal/ads/zzajh;->zzf:I

    .line 397
    .line 398
    const/4 v5, -0x1

    .line 399
    if-eq v3, v5, :cond_d

    .line 400
    .line 401
    new-instance v3, Lcom/google/android/gms/internal/ads/zzxb;

    .line 402
    .line 403
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzyr;->zzO()Lcom/google/android/gms/internal/ads/zzajh;

    .line 404
    .line 405
    .line 406
    move-result-object v5

    .line 407
    iget v5, v5, Lcom/google/android/gms/internal/ads/zzajh;->zzf:I

    .line 408
    .line 409
    invoke-direct {v3, v0, v5, v1}, Lcom/google/android/gms/internal/ads/zzxb;-><init>(Lcom/google/android/gms/internal/ads/zzhr;ILcom/google/android/gms/internal/ads/zzxa;)V

    .line 410
    .line 411
    .line 412
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzyr;->zzx()Lcom/google/android/gms/internal/ads/zzahm;

    .line 413
    .line 414
    .line 415
    move-result-object v5

    .line 416
    iput-object v5, v1, Lcom/google/android/gms/internal/ads/zzyi;->zzm:Lcom/google/android/gms/internal/ads/zzahm;

    .line 417
    .line 418
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzyr;->zzK()Lcom/google/android/gms/internal/ads/zzv;

    .line 419
    .line 420
    .line 421
    move-result-object v6

    .line 422
    invoke-interface {v5, v6}, Lcom/google/android/gms/internal/ads/zzahm;->zzA(Lcom/google/android/gms/internal/ads/zzv;)V

    .line 423
    .line 424
    .line 425
    move-object v9, v3

    .line 426
    goto :goto_9

    .line 427
    :cond_d
    move-object v9, v0

    .line 428
    :goto_9
    iget-object v8, v1, Lcom/google/android/gms/internal/ads/zzyi;->zze:Lcom/google/android/gms/internal/ads/zzye;

    .line 429
    .line 430
    iget-object v10, v1, Lcom/google/android/gms/internal/ads/zzyi;->zzc:Landroid/net/Uri;

    .line 431
    .line 432
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzio;->zzj()Ljava/util/Map;

    .line 433
    .line 434
    .line 435
    move-result-object v11

    .line 436
    iget-object v3, v1, Lcom/google/android/gms/internal/ads/zzyi;->zzf:Lcom/google/android/gms/internal/ads/zzagd;

    .line 437
    .line 438
    move-object/from16 v16, v3

    .line 439
    .line 440
    invoke-interface/range {v8 .. v16}, Lcom/google/android/gms/internal/ads/zzye;->zza(Lcom/google/android/gms/internal/ads/zzj;Landroid/net/Uri;Ljava/util/Map;JJLcom/google/android/gms/internal/ads/zzagd;)V

    .line 441
    .line 442
    .line 443
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzyr;->zzO()Lcom/google/android/gms/internal/ads/zzajh;

    .line 444
    .line 445
    .line 446
    move-result-object v3

    .line 447
    if-eqz v3, :cond_e

    .line 448
    .line 449
    invoke-interface {v8}, Lcom/google/android/gms/internal/ads/zzye;->zzc()V

    .line 450
    .line 451
    .line 452
    :cond_e
    iget-boolean v3, v1, Lcom/google/android/gms/internal/ads/zzyi;->zzj:Z

    .line 453
    .line 454
    if-eqz v3, :cond_f

    .line 455
    .line 456
    iget-wide v5, v1, Lcom/google/android/gms/internal/ads/zzyi;->zzk:J

    .line 457
    .line 458
    invoke-interface {v8, v12, v13, v5, v6}, Lcom/google/android/gms/internal/ads/zzye;->zze(JJ)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 459
    .line 460
    .line 461
    const/4 v3, 0x0

    .line 462
    :try_start_9
    iput-boolean v3, v1, Lcom/google/android/gms/internal/ads/zzyi;->zzj:Z
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 463
    .line 464
    :goto_a
    move v5, v3

    .line 465
    goto :goto_b

    .line 466
    :catchall_2
    move-exception v0

    .line 467
    goto :goto_e

    .line 468
    :cond_f
    const/4 v3, 0x0

    .line 469
    goto :goto_a

    .line 470
    :cond_10
    :goto_b
    if-nez v5, :cond_12

    .line 471
    .line 472
    :try_start_a
    iget-boolean v6, v1, Lcom/google/android/gms/internal/ads/zzyi;->zzi:Z
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    .line 473
    .line 474
    if-nez v6, :cond_11

    .line 475
    .line 476
    :try_start_b
    iget-object v6, v1, Lcom/google/android/gms/internal/ads/zzyi;->zzg:Lcom/google/android/gms/internal/ads/zzdt;

    .line 477
    .line 478
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzdt;->zzc()V
    :try_end_b
    .catch Ljava/lang/InterruptedException; {:try_start_b .. :try_end_b} :catch_4
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    .line 479
    .line 480
    .line 481
    :try_start_c
    iget-object v7, v1, Lcom/google/android/gms/internal/ads/zzyi;->zzh:Lcom/google/android/gms/internal/ads/zzaha;

    .line 482
    .line 483
    invoke-interface {v8, v7}, Lcom/google/android/gms/internal/ads/zzye;->zzf(Lcom/google/android/gms/internal/ads/zzaha;)I

    .line 484
    .line 485
    .line 486
    move-result v5

    .line 487
    invoke-interface {v8}, Lcom/google/android/gms/internal/ads/zzye;->zzd()J

    .line 488
    .line 489
    .line 490
    move-result-wide v9

    .line 491
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzyr;->zzL()J

    .line 492
    .line 493
    .line 494
    move-result-wide v14

    .line 495
    add-long/2addr v14, v12

    .line 496
    cmp-long v7, v9, v14

    .line 497
    .line 498
    if-lez v7, :cond_10

    .line 499
    .line 500
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzdt;->zzb()Z

    .line 501
    .line 502
    .line 503
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzyr;->zzN()Landroid/os/Handler;

    .line 504
    .line 505
    .line 506
    move-result-object v6

    .line 507
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzyr;->zzM()Ljava/lang/Runnable;

    .line 508
    .line 509
    .line 510
    move-result-object v7

    .line 511
    invoke-virtual {v6, v7}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 512
    .line 513
    .line 514
    move-wide v12, v9

    .line 515
    goto :goto_b

    .line 516
    :catchall_3
    move-exception v0

    .line 517
    move v2, v5

    .line 518
    :goto_c
    const/4 v3, 0x1

    .line 519
    goto :goto_f

    .line 520
    :catch_4
    new-instance v0, Ljava/io/InterruptedIOException;

    .line 521
    .line 522
    invoke-direct {v0}, Ljava/io/InterruptedIOException;-><init>()V

    .line 523
    .line 524
    .line 525
    throw v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    .line 526
    :cond_11
    move v5, v3

    .line 527
    :cond_12
    const/4 v2, 0x1

    .line 528
    if-ne v5, v2, :cond_13

    .line 529
    .line 530
    move v5, v3

    .line 531
    goto :goto_d

    .line 532
    :cond_13
    invoke-interface {v8}, Lcom/google/android/gms/internal/ads/zzye;->zzd()J

    .line 533
    .line 534
    .line 535
    move-result-wide v6

    .line 536
    cmp-long v2, v6, v17

    .line 537
    .line 538
    if-eqz v2, :cond_14

    .line 539
    .line 540
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzyi;->zzh:Lcom/google/android/gms/internal/ads/zzaha;

    .line 541
    .line 542
    invoke-interface {v8}, Lcom/google/android/gms/internal/ads/zzye;->zzd()J

    .line 543
    .line 544
    .line 545
    move-result-wide v6

    .line 546
    iput-wide v6, v2, Lcom/google/android/gms/internal/ads/zzaha;->zza:J

    .line 547
    .line 548
    :cond_14
    :goto_d
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzht;->zza(Lcom/google/android/gms/internal/ads/zzhr;)V

    .line 549
    .line 550
    .line 551
    move v2, v3

    .line 552
    move v3, v5

    .line 553
    goto/16 :goto_0

    .line 554
    .line 555
    :goto_e
    move v2, v3

    .line 556
    goto :goto_c

    .line 557
    :goto_f
    if-eq v2, v3, :cond_15

    .line 558
    .line 559
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzyi;->zze:Lcom/google/android/gms/internal/ads/zzye;

    .line 560
    .line 561
    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/zzye;->zzd()J

    .line 562
    .line 563
    .line 564
    move-result-wide v3

    .line 565
    cmp-long v3, v3, v17

    .line 566
    .line 567
    if-eqz v3, :cond_15

    .line 568
    .line 569
    iget-object v3, v1, Lcom/google/android/gms/internal/ads/zzyi;->zzh:Lcom/google/android/gms/internal/ads/zzaha;

    .line 570
    .line 571
    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/zzye;->zzd()J

    .line 572
    .line 573
    .line 574
    move-result-wide v4

    .line 575
    iput-wide v4, v3, Lcom/google/android/gms/internal/ads/zzaha;->zza:J

    .line 576
    .line 577
    :cond_15
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzyi;->zzd:Lcom/google/android/gms/internal/ads/zzio;

    .line 578
    .line 579
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzht;->zza(Lcom/google/android/gms/internal/ads/zzhr;)V

    .line 580
    .line 581
    .line 582
    throw v0

    .line 583
    :cond_16
    return-void
.end method

.method public final synthetic zzd(JJ)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzyi;->zzh:Lcom/google/android/gms/internal/ads/zzaha;

    iput-wide p1, v0, Lcom/google/android/gms/internal/ads/zzaha;->zza:J

    iput-wide p3, p0, Lcom/google/android/gms/internal/ads/zzyi;->zzk:J

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzyi;->zzj:Z

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzyi;->zzn:Z

    return-void
.end method

.method public final synthetic zze()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzyi;->zzb:J

    return-wide v0
.end method

.method public final synthetic zzf()Lcom/google/android/gms/internal/ads/zzio;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzyi;->zzd:Lcom/google/android/gms/internal/ads/zzio;

    return-object v0
.end method

.method public final synthetic zzg()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzyi;->zzk:J

    return-wide v0
.end method

.method public final synthetic zzh()Lcom/google/android/gms/internal/ads/zzhv;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzyi;->zzl:Lcom/google/android/gms/internal/ads/zzhv;

    return-object v0
.end method
