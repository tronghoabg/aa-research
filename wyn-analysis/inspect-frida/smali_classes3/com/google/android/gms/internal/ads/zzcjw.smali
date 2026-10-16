.class public final Lcom/google/android/gms/internal/ads/zzcjw;
.super Lcom/google/android/gms/internal/ads/zzhj;
.source "SourceFile"


# instance fields
.field private final zza:Landroid/content/Context;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzhr;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzcju;

.field private final zzd:Ljava/lang/String;

.field private final zze:I

.field private final zzf:Z

.field private zzg:Ljava/io/InputStream;

.field private zzh:Z

.field private zzi:Landroid/net/Uri;

.field private volatile zzj:Lcom/google/android/gms/internal/ads/zzbhi;

.field private zzk:Z

.field private zzl:Z

.field private zzm:Z

.field private zzn:Z

.field private zzo:J

.field private zzp:Lp8/p;

.field private final zzq:Ljava/util/concurrent/atomic/AtomicLong;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzhr;Ljava/lang/String;ILcom/google/android/gms/internal/ads/zzip;Lcom/google/android/gms/internal/ads/zzcju;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzhj;-><init>(Z)V

    .line 3
    .line 4
    .line 5
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcjw;->zza:Landroid/content/Context;

    .line 6
    .line 7
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzcjw;->zzb:Lcom/google/android/gms/internal/ads/zzhr;

    .line 8
    .line 9
    iput-object p6, p0, Lcom/google/android/gms/internal/ads/zzcjw;->zzc:Lcom/google/android/gms/internal/ads/zzcju;

    .line 10
    .line 11
    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzcjw;->zzd:Ljava/lang/String;

    .line 12
    .line 13
    iput p4, p0, Lcom/google/android/gms/internal/ads/zzcjw;->zze:I

    .line 14
    .line 15
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzcjw;->zzk:Z

    .line 16
    .line 17
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzcjw;->zzl:Z

    .line 18
    .line 19
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzcjw;->zzm:Z

    .line 20
    .line 21
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzcjw;->zzn:Z

    .line 22
    .line 23
    const-wide/16 p1, 0x0

    .line 24
    .line 25
    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzcjw;->zzo:J

    .line 26
    .line 27
    new-instance p1, Ljava/util/concurrent/atomic/AtomicLong;

    .line 28
    .line 29
    const-wide/16 p2, -0x1

    .line 30
    .line 31
    invoke-direct {p1, p2, p3}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcjw;->zzq:Ljava/util/concurrent/atomic/AtomicLong;

    .line 35
    .line 36
    const/4 p1, 0x0

    .line 37
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcjw;->zzp:Lp8/p;

    .line 38
    .line 39
    sget-object p1, Lcom/google/android/gms/internal/ads/zzbix;->zzcG:Lcom/google/android/gms/internal/ads/zzbio;

    .line 40
    .line 41
    sget-object p2, LD6/s;->e:LD6/s;

    .line 42
    .line 43
    iget-object p2, p2, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 44
    .line 45
    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    check-cast p1, Ljava/lang/Boolean;

    .line 50
    .line 51
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzcjw;->zzf:Z

    .line 56
    .line 57
    invoke-virtual {p0, p5}, Lcom/google/android/gms/internal/ads/zzhj;->zze(Lcom/google/android/gms/internal/ads/zzip;)V

    .line 58
    .line 59
    .line 60
    return-void
.end method

.method private final zzr()Z
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzcjw;->zzf:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbix;->zzfv:Lcom/google/android/gms/internal/ads/zzbio;

    .line 8
    .line 9
    sget-object v2, LD6/s;->e:LD6/s;

    .line 10
    .line 11
    iget-object v3, v2, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 12
    .line 13
    invoke-virtual {v3, v0}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Ljava/lang/Boolean;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    const/4 v3, 0x1

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzcjw;->zzm:Z

    .line 27
    .line 28
    if-nez v0, :cond_1

    .line 29
    .line 30
    return v3

    .line 31
    :cond_1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbix;->zzfw:Lcom/google/android/gms/internal/ads/zzbio;

    .line 32
    .line 33
    iget-object v2, v2, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 34
    .line 35
    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    check-cast v0, Ljava/lang/Boolean;

    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_2

    .line 46
    .line 47
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzcjw;->zzn:Z

    .line 48
    .line 49
    if-nez v0, :cond_2

    .line 50
    .line 51
    return v3

    .line 52
    :cond_2
    return v1
.end method


# virtual methods
.method public final zza([BII)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzcjw;->zzh:Z

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcjw;->zzg:Ljava/io/InputStream;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0, p1, p2, p3}, Ljava/io/InputStream;->read([BII)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcjw;->zzb:Lcom/google/android/gms/internal/ads/zzhr;

    .line 15
    .line 16
    invoke-interface {v0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzj;->zza([BII)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    :goto_0
    iget-boolean p2, p0, Lcom/google/android/gms/internal/ads/zzcjw;->zzf:Z

    .line 21
    .line 22
    if-eqz p2, :cond_2

    .line 23
    .line 24
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzcjw;->zzg:Ljava/io/InputStream;

    .line 25
    .line 26
    if-eqz p2, :cond_1

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    return p1

    .line 30
    :cond_2
    :goto_1
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/zzhj;->zzh(I)V

    .line 31
    .line 32
    .line 33
    return p1

    .line 34
    :cond_3
    new-instance p1, Ljava/io/IOException;

    .line 35
    .line 36
    const-string p2, "Attempt to read closed GcacheDataSource."

    .line 37
    .line 38
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    throw p1
.end method

.method public final zzb(Lcom/google/android/gms/internal/ads/zzhv;)J
    .locals 17
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    const-string v2, "ms"

    .line 6
    .line 7
    const-string v3, "Cache connection took "

    .line 8
    .line 9
    iget-boolean v4, v1, Lcom/google/android/gms/internal/ads/zzcjw;->zzh:Z

    .line 10
    .line 11
    if-nez v4, :cond_9

    .line 12
    .line 13
    const/4 v4, 0x1

    .line 14
    iput-boolean v4, v1, Lcom/google/android/gms/internal/ads/zzcjw;->zzh:Z

    .line 15
    .line 16
    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzhv;->zza:Landroid/net/Uri;

    .line 17
    .line 18
    iput-object v5, v1, Lcom/google/android/gms/internal/ads/zzcjw;->zzi:Landroid/net/Uri;

    .line 19
    .line 20
    iget-boolean v6, v1, Lcom/google/android/gms/internal/ads/zzcjw;->zzf:Z

    .line 21
    .line 22
    if-nez v6, :cond_0

    .line 23
    .line 24
    invoke-virtual/range {p0 .. p1}, Lcom/google/android/gms/internal/ads/zzhj;->zzg(Lcom/google/android/gms/internal/ads/zzhv;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    invoke-static {v5}, Lcom/google/android/gms/internal/ads/zzbhi;->zza(Landroid/net/Uri;)Lcom/google/android/gms/internal/ads/zzbhi;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    iput-object v5, v1, Lcom/google/android/gms/internal/ads/zzcjw;->zzj:Lcom/google/android/gms/internal/ads/zzbhi;

    .line 32
    .line 33
    sget-object v5, Lcom/google/android/gms/internal/ads/zzbix;->zzfs:Lcom/google/android/gms/internal/ads/zzbio;

    .line 34
    .line 35
    sget-object v7, LD6/s;->e:LD6/s;

    .line 36
    .line 37
    iget-object v8, v7, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 38
    .line 39
    invoke-virtual {v8, v5}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    check-cast v5, Ljava/lang/Boolean;

    .line 44
    .line 45
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 46
    .line 47
    .line 48
    move-result v5

    .line 49
    const/4 v10, 0x0

    .line 50
    if-eqz v5, :cond_4

    .line 51
    .line 52
    iget-object v5, v1, Lcom/google/android/gms/internal/ads/zzcjw;->zzj:Lcom/google/android/gms/internal/ads/zzbhi;

    .line 53
    .line 54
    if-eqz v5, :cond_7

    .line 55
    .line 56
    iget-object v5, v1, Lcom/google/android/gms/internal/ads/zzcjw;->zzj:Lcom/google/android/gms/internal/ads/zzbhi;

    .line 57
    .line 58
    iget-wide v11, v0, Lcom/google/android/gms/internal/ads/zzhv;->zze:J

    .line 59
    .line 60
    iput-wide v11, v5, Lcom/google/android/gms/internal/ads/zzbhi;->zzh:J

    .line 61
    .line 62
    iget-object v5, v1, Lcom/google/android/gms/internal/ads/zzcjw;->zzj:Lcom/google/android/gms/internal/ads/zzbhi;

    .line 63
    .line 64
    iget-object v11, v1, Lcom/google/android/gms/internal/ads/zzcjw;->zzd:Ljava/lang/String;

    .line 65
    .line 66
    invoke-static {v11}, Lcom/google/android/gms/internal/ads/zzgui;->zza(Ljava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v11

    .line 70
    iput-object v11, v5, Lcom/google/android/gms/internal/ads/zzbhi;->zzi:Ljava/lang/String;

    .line 71
    .line 72
    iget-object v5, v1, Lcom/google/android/gms/internal/ads/zzcjw;->zzj:Lcom/google/android/gms/internal/ads/zzbhi;

    .line 73
    .line 74
    iget v11, v1, Lcom/google/android/gms/internal/ads/zzcjw;->zze:I

    .line 75
    .line 76
    iput v11, v5, Lcom/google/android/gms/internal/ads/zzbhi;->zzj:I

    .line 77
    .line 78
    iget-object v5, v1, Lcom/google/android/gms/internal/ads/zzcjw;->zzj:Lcom/google/android/gms/internal/ads/zzbhi;

    .line 79
    .line 80
    iget-boolean v5, v5, Lcom/google/android/gms/internal/ads/zzbhi;->zzg:Z

    .line 81
    .line 82
    if-eqz v5, :cond_1

    .line 83
    .line 84
    sget-object v5, Lcom/google/android/gms/internal/ads/zzbix;->zzfu:Lcom/google/android/gms/internal/ads/zzbio;

    .line 85
    .line 86
    iget-object v7, v7, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 87
    .line 88
    invoke-virtual {v7, v5}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v5

    .line 92
    check-cast v5, Ljava/lang/Long;

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_1
    sget-object v5, Lcom/google/android/gms/internal/ads/zzbix;->zzft:Lcom/google/android/gms/internal/ads/zzbio;

    .line 96
    .line 97
    iget-object v7, v7, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 98
    .line 99
    invoke-virtual {v7, v5}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v5

    .line 103
    check-cast v5, Ljava/lang/Long;

    .line 104
    .line 105
    :goto_0
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 106
    .line 107
    .line 108
    move-result-wide v11

    .line 109
    sget-object v5, LC6/n;->D:LC6/n;

    .line 110
    .line 111
    iget-object v7, v5, LC6/n;->k:Ln7/b;

    .line 112
    .line 113
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 117
    .line 118
    .line 119
    move-result-wide v13

    .line 120
    iget-object v7, v1, Lcom/google/android/gms/internal/ads/zzcjw;->zza:Landroid/content/Context;

    .line 121
    .line 122
    iget-object v15, v1, Lcom/google/android/gms/internal/ads/zzcjw;->zzj:Lcom/google/android/gms/internal/ads/zzbhi;

    .line 123
    .line 124
    invoke-static {v7, v15}, Lcom/google/android/gms/internal/ads/zzbht;->zza(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzbhi;)Ljava/util/concurrent/Future;

    .line 125
    .line 126
    .line 127
    move-result-object v7

    .line 128
    :try_start_0
    sget-object v15, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 129
    .line 130
    invoke-interface {v7, v11, v12, v15}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v11

    .line 134
    check-cast v11, Lcom/google/android/gms/internal/ads/zzbhu;
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 135
    .line 136
    :try_start_1
    invoke-virtual {v11}, Lcom/google/android/gms/internal/ads/zzbhu;->zzc()Z

    .line 137
    .line 138
    .line 139
    move-result v12

    .line 140
    iput-boolean v12, v1, Lcom/google/android/gms/internal/ads/zzcjw;->zzk:Z

    .line 141
    .line 142
    invoke-virtual {v11}, Lcom/google/android/gms/internal/ads/zzbhu;->zzd()Z

    .line 143
    .line 144
    .line 145
    move-result v12

    .line 146
    iput-boolean v12, v1, Lcom/google/android/gms/internal/ads/zzcjw;->zzm:Z

    .line 147
    .line 148
    invoke-virtual {v11}, Lcom/google/android/gms/internal/ads/zzbhu;->zzf()Z

    .line 149
    .line 150
    .line 151
    move-result v12

    .line 152
    iput-boolean v12, v1, Lcom/google/android/gms/internal/ads/zzcjw;->zzn:Z

    .line 153
    .line 154
    const-wide/16 v15, -0x1

    .line 155
    .line 156
    invoke-virtual {v11}, Lcom/google/android/gms/internal/ads/zzbhu;->zze()J

    .line 157
    .line 158
    .line 159
    move-result-wide v8

    .line 160
    iput-wide v8, v1, Lcom/google/android/gms/internal/ads/zzcjw;->zzo:J

    .line 161
    .line 162
    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/zzcjw;->zzr()Z

    .line 163
    .line 164
    .line 165
    move-result v8

    .line 166
    if-nez v8, :cond_3

    .line 167
    .line 168
    invoke-virtual {v11}, Lcom/google/android/gms/internal/ads/zzbhu;->zzb()Ljava/io/InputStream;

    .line 169
    .line 170
    .line 171
    move-result-object v8

    .line 172
    iput-object v8, v1, Lcom/google/android/gms/internal/ads/zzcjw;->zzg:Ljava/io/InputStream;

    .line 173
    .line 174
    if-eqz v6, :cond_2

    .line 175
    .line 176
    invoke-virtual/range {p0 .. p1}, Lcom/google/android/gms/internal/ads/zzhj;->zzg(Lcom/google/android/gms/internal/ads/zzhv;)V
    :try_end_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 177
    .line 178
    .line 179
    goto :goto_1

    .line 180
    :catchall_0
    move-exception v0

    .line 181
    goto/16 :goto_6

    .line 182
    .line 183
    :cond_2
    :goto_1
    iget-object v0, v5, LC6/n;->k:Ln7/b;

    .line 184
    .line 185
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 189
    .line 190
    .line 191
    move-result-wide v5

    .line 192
    sub-long/2addr v5, v13

    .line 193
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzcjw;->zzc:Lcom/google/android/gms/internal/ads/zzcju;

    .line 194
    .line 195
    invoke-interface {v0, v4, v5, v6}, Lcom/google/android/gms/internal/ads/zzcju;->zza(ZJ)V

    .line 196
    .line 197
    .line 198
    iput-boolean v4, v1, Lcom/google/android/gms/internal/ads/zzcjw;->zzl:Z

    .line 199
    .line 200
    invoke-static {v5, v6}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 205
    .line 206
    .line 207
    move-result v0

    .line 208
    add-int/lit8 v0, v0, 0x18

    .line 209
    .line 210
    new-instance v4, Ljava/lang/StringBuilder;

    .line 211
    .line 212
    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    .line 218
    invoke-virtual {v4, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 219
    .line 220
    .line 221
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 222
    .line 223
    .line 224
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    invoke-static {v0}, LG6/L;->k(Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    return-wide v15

    .line 232
    :cond_3
    iget-object v5, v5, LC6/n;->k:Ln7/b;

    .line 233
    .line 234
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 235
    .line 236
    .line 237
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 238
    .line 239
    .line 240
    move-result-wide v5

    .line 241
    sub-long/2addr v5, v13

    .line 242
    iget-object v7, v1, Lcom/google/android/gms/internal/ads/zzcjw;->zzc:Lcom/google/android/gms/internal/ads/zzcju;

    .line 243
    .line 244
    invoke-interface {v7, v4, v5, v6}, Lcom/google/android/gms/internal/ads/zzcju;->zza(ZJ)V

    .line 245
    .line 246
    .line 247
    iput-boolean v4, v1, Lcom/google/android/gms/internal/ads/zzcjw;->zzl:Z

    .line 248
    .line 249
    invoke-static {v5, v6}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v4

    .line 253
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 254
    .line 255
    .line 256
    move-result v4

    .line 257
    add-int/lit8 v4, v4, 0x18

    .line 258
    .line 259
    new-instance v7, Ljava/lang/StringBuilder;

    .line 260
    .line 261
    invoke-direct {v7, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 262
    .line 263
    .line 264
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 265
    .line 266
    .line 267
    invoke-virtual {v7, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 268
    .line 269
    .line 270
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 271
    .line 272
    .line 273
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v2

    .line 277
    :goto_2
    invoke-static {v2}, LG6/L;->k(Ljava/lang/String;)V

    .line 278
    .line 279
    .line 280
    goto/16 :goto_8

    .line 281
    .line 282
    :catch_0
    move v5, v4

    .line 283
    goto :goto_3

    .line 284
    :catch_1
    move v5, v4

    .line 285
    goto :goto_5

    .line 286
    :catchall_1
    move-exception v0

    .line 287
    move v4, v10

    .line 288
    goto :goto_6

    .line 289
    :catch_2
    move v5, v10

    .line 290
    :goto_3
    :try_start_2
    invoke-interface {v7, v4}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 291
    .line 292
    .line 293
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 294
    .line 295
    .line 296
    move-result-object v4

    .line 297
    invoke-virtual {v4}, Ljava/lang/Thread;->interrupt()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 298
    .line 299
    .line 300
    sget-object v4, LC6/n;->D:LC6/n;

    .line 301
    .line 302
    iget-object v4, v4, LC6/n;->k:Ln7/b;

    .line 303
    .line 304
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 305
    .line 306
    .line 307
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 308
    .line 309
    .line 310
    move-result-wide v6

    .line 311
    sub-long/2addr v6, v13

    .line 312
    iget-object v4, v1, Lcom/google/android/gms/internal/ads/zzcjw;->zzc:Lcom/google/android/gms/internal/ads/zzcju;

    .line 313
    .line 314
    invoke-interface {v4, v5, v6, v7}, Lcom/google/android/gms/internal/ads/zzcju;->zza(ZJ)V

    .line 315
    .line 316
    .line 317
    iput-boolean v5, v1, Lcom/google/android/gms/internal/ads/zzcjw;->zzl:Z

    .line 318
    .line 319
    invoke-static {v6, v7}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 320
    .line 321
    .line 322
    move-result-object v4

    .line 323
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 324
    .line 325
    .line 326
    move-result v4

    .line 327
    add-int/lit8 v4, v4, 0x18

    .line 328
    .line 329
    new-instance v5, Ljava/lang/StringBuilder;

    .line 330
    .line 331
    invoke-direct {v5, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 332
    .line 333
    .line 334
    :goto_4
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 335
    .line 336
    .line 337
    invoke-virtual {v5, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 338
    .line 339
    .line 340
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 341
    .line 342
    .line 343
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 344
    .line 345
    .line 346
    move-result-object v2

    .line 347
    goto :goto_2

    .line 348
    :catchall_2
    move-exception v0

    .line 349
    move v4, v5

    .line 350
    goto :goto_6

    .line 351
    :catch_3
    move v5, v10

    .line 352
    :goto_5
    :try_start_3
    invoke-interface {v7, v4}, Ljava/util/concurrent/Future;->cancel(Z)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 353
    .line 354
    .line 355
    sget-object v4, LC6/n;->D:LC6/n;

    .line 356
    .line 357
    iget-object v4, v4, LC6/n;->k:Ln7/b;

    .line 358
    .line 359
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 360
    .line 361
    .line 362
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 363
    .line 364
    .line 365
    move-result-wide v6

    .line 366
    sub-long/2addr v6, v13

    .line 367
    iget-object v4, v1, Lcom/google/android/gms/internal/ads/zzcjw;->zzc:Lcom/google/android/gms/internal/ads/zzcju;

    .line 368
    .line 369
    invoke-interface {v4, v5, v6, v7}, Lcom/google/android/gms/internal/ads/zzcju;->zza(ZJ)V

    .line 370
    .line 371
    .line 372
    iput-boolean v5, v1, Lcom/google/android/gms/internal/ads/zzcjw;->zzl:Z

    .line 373
    .line 374
    invoke-static {v6, v7}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 375
    .line 376
    .line 377
    move-result-object v4

    .line 378
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 379
    .line 380
    .line 381
    move-result v4

    .line 382
    add-int/lit8 v4, v4, 0x18

    .line 383
    .line 384
    new-instance v5, Ljava/lang/StringBuilder;

    .line 385
    .line 386
    invoke-direct {v5, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 387
    .line 388
    .line 389
    goto :goto_4

    .line 390
    :goto_6
    sget-object v5, LC6/n;->D:LC6/n;

    .line 391
    .line 392
    iget-object v5, v5, LC6/n;->k:Ln7/b;

    .line 393
    .line 394
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 395
    .line 396
    .line 397
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 398
    .line 399
    .line 400
    move-result-wide v5

    .line 401
    sub-long/2addr v5, v13

    .line 402
    iget-object v7, v1, Lcom/google/android/gms/internal/ads/zzcjw;->zzc:Lcom/google/android/gms/internal/ads/zzcju;

    .line 403
    .line 404
    invoke-interface {v7, v4, v5, v6}, Lcom/google/android/gms/internal/ads/zzcju;->zza(ZJ)V

    .line 405
    .line 406
    .line 407
    iput-boolean v4, v1, Lcom/google/android/gms/internal/ads/zzcjw;->zzl:Z

    .line 408
    .line 409
    invoke-static {v5, v6}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 410
    .line 411
    .line 412
    move-result-object v4

    .line 413
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 414
    .line 415
    .line 416
    move-result v4

    .line 417
    add-int/lit8 v4, v4, 0x18

    .line 418
    .line 419
    new-instance v7, Ljava/lang/StringBuilder;

    .line 420
    .line 421
    invoke-direct {v7, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 422
    .line 423
    .line 424
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 425
    .line 426
    .line 427
    invoke-virtual {v7, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 428
    .line 429
    .line 430
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 431
    .line 432
    .line 433
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 434
    .line 435
    .line 436
    move-result-object v2

    .line 437
    invoke-static {v2}, LG6/L;->k(Ljava/lang/String;)V

    .line 438
    .line 439
    .line 440
    throw v0

    .line 441
    :cond_4
    const-wide/16 v15, -0x1

    .line 442
    .line 443
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzcjw;->zzj:Lcom/google/android/gms/internal/ads/zzbhi;

    .line 444
    .line 445
    if-eqz v2, :cond_5

    .line 446
    .line 447
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzcjw;->zzj:Lcom/google/android/gms/internal/ads/zzbhi;

    .line 448
    .line 449
    iget-wide v5, v0, Lcom/google/android/gms/internal/ads/zzhv;->zze:J

    .line 450
    .line 451
    iput-wide v5, v2, Lcom/google/android/gms/internal/ads/zzbhi;->zzh:J

    .line 452
    .line 453
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzcjw;->zzj:Lcom/google/android/gms/internal/ads/zzbhi;

    .line 454
    .line 455
    iget-object v3, v1, Lcom/google/android/gms/internal/ads/zzcjw;->zzd:Ljava/lang/String;

    .line 456
    .line 457
    invoke-static {v3}, Lcom/google/android/gms/internal/ads/zzgui;->zza(Ljava/lang/String;)Ljava/lang/String;

    .line 458
    .line 459
    .line 460
    move-result-object v3

    .line 461
    iput-object v3, v2, Lcom/google/android/gms/internal/ads/zzbhi;->zzi:Ljava/lang/String;

    .line 462
    .line 463
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzcjw;->zzj:Lcom/google/android/gms/internal/ads/zzbhi;

    .line 464
    .line 465
    iget v3, v1, Lcom/google/android/gms/internal/ads/zzcjw;->zze:I

    .line 466
    .line 467
    iput v3, v2, Lcom/google/android/gms/internal/ads/zzbhi;->zzj:I

    .line 468
    .line 469
    sget-object v2, LC6/n;->D:LC6/n;

    .line 470
    .line 471
    iget-object v2, v2, LC6/n;->j:Lcom/google/android/gms/internal/ads/zzbhe;

    .line 472
    .line 473
    iget-object v3, v1, Lcom/google/android/gms/internal/ads/zzcjw;->zzj:Lcom/google/android/gms/internal/ads/zzbhi;

    .line 474
    .line 475
    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/zzbhe;->zzc(Lcom/google/android/gms/internal/ads/zzbhi;)Lcom/google/android/gms/internal/ads/zzbhf;

    .line 476
    .line 477
    .line 478
    move-result-object v2

    .line 479
    goto :goto_7

    .line 480
    :cond_5
    const/4 v2, 0x0

    .line 481
    :goto_7
    if-eqz v2, :cond_7

    .line 482
    .line 483
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzbhf;->zza()Z

    .line 484
    .line 485
    .line 486
    move-result v3

    .line 487
    if-eqz v3, :cond_7

    .line 488
    .line 489
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzbhf;->zzd()Z

    .line 490
    .line 491
    .line 492
    move-result v3

    .line 493
    iput-boolean v3, v1, Lcom/google/android/gms/internal/ads/zzcjw;->zzk:Z

    .line 494
    .line 495
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzbhf;->zzg()Z

    .line 496
    .line 497
    .line 498
    move-result v3

    .line 499
    iput-boolean v3, v1, Lcom/google/android/gms/internal/ads/zzcjw;->zzm:Z

    .line 500
    .line 501
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzbhf;->zze()Z

    .line 502
    .line 503
    .line 504
    move-result v3

    .line 505
    iput-boolean v3, v1, Lcom/google/android/gms/internal/ads/zzcjw;->zzn:Z

    .line 506
    .line 507
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzbhf;->zzf()J

    .line 508
    .line 509
    .line 510
    move-result-wide v5

    .line 511
    iput-wide v5, v1, Lcom/google/android/gms/internal/ads/zzcjw;->zzo:J

    .line 512
    .line 513
    iput-boolean v4, v1, Lcom/google/android/gms/internal/ads/zzcjw;->zzl:Z

    .line 514
    .line 515
    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/zzcjw;->zzr()Z

    .line 516
    .line 517
    .line 518
    move-result v3

    .line 519
    if-nez v3, :cond_7

    .line 520
    .line 521
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzbhf;->zzb()Ljava/io/InputStream;

    .line 522
    .line 523
    .line 524
    move-result-object v2

    .line 525
    iput-object v2, v1, Lcom/google/android/gms/internal/ads/zzcjw;->zzg:Ljava/io/InputStream;

    .line 526
    .line 527
    iget-boolean v2, v1, Lcom/google/android/gms/internal/ads/zzcjw;->zzf:Z

    .line 528
    .line 529
    if-eqz v2, :cond_6

    .line 530
    .line 531
    invoke-virtual/range {p0 .. p1}, Lcom/google/android/gms/internal/ads/zzhj;->zzg(Lcom/google/android/gms/internal/ads/zzhv;)V

    .line 532
    .line 533
    .line 534
    :cond_6
    return-wide v15

    .line 535
    :cond_7
    :goto_8
    iput-boolean v10, v1, Lcom/google/android/gms/internal/ads/zzcjw;->zzl:Z

    .line 536
    .line 537
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzcjw;->zzj:Lcom/google/android/gms/internal/ads/zzbhi;

    .line 538
    .line 539
    if-eqz v2, :cond_8

    .line 540
    .line 541
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzhv;->zzb()Lcom/google/android/gms/internal/ads/zzhu;

    .line 542
    .line 543
    .line 544
    move-result-object v0

    .line 545
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzcjw;->zzj:Lcom/google/android/gms/internal/ads/zzbhi;

    .line 546
    .line 547
    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzbhi;->zza:Ljava/lang/String;

    .line 548
    .line 549
    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 550
    .line 551
    .line 552
    move-result-object v2

    .line 553
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/zzhu;->zza(Landroid/net/Uri;)Lcom/google/android/gms/internal/ads/zzhu;

    .line 554
    .line 555
    .line 556
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzhu;->zze()Lcom/google/android/gms/internal/ads/zzhv;

    .line 557
    .line 558
    .line 559
    move-result-object v0

    .line 560
    :cond_8
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzcjw;->zzb:Lcom/google/android/gms/internal/ads/zzhr;

    .line 561
    .line 562
    invoke-interface {v2, v0}, Lcom/google/android/gms/internal/ads/zzhr;->zzb(Lcom/google/android/gms/internal/ads/zzhv;)J

    .line 563
    .line 564
    .line 565
    move-result-wide v2

    .line 566
    return-wide v2

    .line 567
    :cond_9
    new-instance v0, Ljava/io/IOException;

    .line 568
    .line 569
    const-string v2, "Attempt to open an already open GcacheDataSource."

    .line 570
    .line 571
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 572
    .line 573
    .line 574
    throw v0
.end method

.method public final zzc()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcjw;->zzi:Landroid/net/Uri;

    return-object v0
.end method

.method public final zzd()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzcjw;->zzh:Z

    .line 2
    .line 3
    if-eqz v0, :cond_4

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzcjw;->zzh:Z

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzcjw;->zzi:Landroid/net/Uri;

    .line 10
    .line 11
    iget-boolean v2, p0, Lcom/google/android/gms/internal/ads/zzcjw;->zzf:Z

    .line 12
    .line 13
    const/4 v3, 0x1

    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzcjw;->zzg:Ljava/io/InputStream;

    .line 17
    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    :cond_0
    move v0, v3

    .line 21
    :cond_1
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzcjw;->zzg:Ljava/io/InputStream;

    .line 22
    .line 23
    if-eqz v2, :cond_2

    .line 24
    .line 25
    invoke-static {v2}, Ln7/c;->d(Ljava/io/Closeable;)V

    .line 26
    .line 27
    .line 28
    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzcjw;->zzg:Ljava/io/InputStream;

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_2
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzcjw;->zzb:Lcom/google/android/gms/internal/ads/zzhr;

    .line 32
    .line 33
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzhr;->zzd()V

    .line 34
    .line 35
    .line 36
    :goto_0
    if-eqz v0, :cond_3

    .line 37
    .line 38
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzhj;->zzi()V

    .line 39
    .line 40
    .line 41
    :cond_3
    return-void

    .line 42
    :cond_4
    new-instance v0, Ljava/io/IOException;

    .line 43
    .line 44
    const-string v1, "Attempt to close an already closed GcacheDataSource."

    .line 45
    .line 46
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw v0
.end method

.method public final zzk()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzcjw;->zzk:Z

    return v0
.end method

.method public final zzl()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzcjw;->zzl:Z

    return v0
.end method

.method public final zzm()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzcjw;->zzm:Z

    return v0
.end method

.method public final zzn()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzcjw;->zzn:Z

    return v0
.end method

.method public final zzo()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzcjw;->zzo:J

    return-wide v0
.end method

.method public final zzp()J
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcjw;->zzj:Lcom/google/android/gms/internal/ads/zzbhi;

    .line 2
    .line 3
    const-wide/16 v1, -0x1

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcjw;->zzq:Ljava/util/concurrent/atomic/AtomicLong;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 11
    .line 12
    .line 13
    move-result-wide v3

    .line 14
    cmp-long v3, v3, v1

    .line 15
    .line 16
    if-eqz v3, :cond_1

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 19
    .line 20
    .line 21
    move-result-wide v0

    .line 22
    return-wide v0

    .line 23
    :cond_1
    monitor-enter p0

    .line 24
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcjw;->zzp:Lp8/p;

    .line 25
    .line 26
    if-nez v0, :cond_2

    .line 27
    .line 28
    sget-object v0, Lcom/google/android/gms/internal/ads/zzcfy;->zza:Lcom/google/android/gms/internal/ads/zzhcp;

    .line 29
    .line 30
    new-instance v3, Lcom/google/android/gms/internal/ads/zzcjv;

    .line 31
    .line 32
    invoke-direct {v3, p0}, Lcom/google/android/gms/internal/ads/zzcjv;-><init>(Lcom/google/android/gms/internal/ads/zzcjw;)V

    .line 33
    .line 34
    .line 35
    invoke-interface {v0, v3}, Lcom/google/android/gms/internal/ads/zzhcp;->zzc(Ljava/util/concurrent/Callable;)Lp8/p;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzcjw;->zzp:Lp8/p;

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :catchall_0
    move-exception v0

    .line 43
    goto :goto_2

    .line 44
    :cond_2
    :goto_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcjw;->zzp:Lp8/p;

    .line 46
    .line 47
    invoke-interface {v0}, Ljava/util/concurrent/Future;->isDone()Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_3

    .line 52
    .line 53
    :try_start_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcjw;->zzq:Ljava/util/concurrent/atomic/AtomicLong;

    .line 54
    .line 55
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzcjw;->zzp:Lp8/p;

    .line 56
    .line 57
    invoke-interface {v3}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    check-cast v3, Ljava/lang/Long;

    .line 62
    .line 63
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 64
    .line 65
    .line 66
    move-result-wide v3

    .line 67
    invoke-virtual {v0, v1, v2, v3, v4}, Ljava/util/concurrent/atomic/AtomicLong;->compareAndSet(JJ)Z
    :try_end_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0

    .line 68
    .line 69
    .line 70
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcjw;->zzq:Ljava/util/concurrent/atomic/AtomicLong;

    .line 71
    .line 72
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 73
    .line 74
    .line 75
    move-result-wide v0

    .line 76
    return-wide v0

    .line 77
    :catch_0
    :cond_3
    :goto_1
    return-wide v1

    .line 78
    :goto_2
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 79
    throw v0
.end method

.method public final zzq()Ljava/lang/Long;
    .locals 2

    .line 1
    sget-object v0, LC6/n;->D:LC6/n;

    .line 2
    .line 3
    iget-object v0, v0, LC6/n;->j:Lcom/google/android/gms/internal/ads/zzbhe;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzcjw;->zzj:Lcom/google/android/gms/internal/ads/zzbhi;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzbhe;->zzd(Lcom/google/android/gms/internal/ads/zzbhi;)J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0
.end method
