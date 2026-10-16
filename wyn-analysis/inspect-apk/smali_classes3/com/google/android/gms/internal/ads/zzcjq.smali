.class public final Lcom/google/android/gms/internal/ads/zzcjq;
.super Lcom/google/android/gms/internal/ads/zzcjh;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzchk;


# static fields
.field public static final synthetic zzd:I


# instance fields
.field private zze:Lcom/google/android/gms/internal/ads/zzchl;

.field private zzf:Ljava/lang/String;

.field private zzg:Z

.field private zzh:Z

.field private zzi:Lcom/google/android/gms/internal/ads/zzciz;

.field private zzj:J

.field private zzk:J


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzchu;Lcom/google/android/gms/internal/ads/zzcht;)V
    .locals 3

    .line 1
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzcjh;-><init>(Lcom/google/android/gms/internal/ads/zzchu;)V

    .line 2
    .line 3
    .line 4
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzchu;->getContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    new-instance v0, Lcom/google/android/gms/internal/ads/zzckj;

    .line 9
    .line 10
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzcjh;->zzc:Ljava/lang/ref/WeakReference;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Lcom/google/android/gms/internal/ads/zzchu;

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-direct {v0, p1, p2, v1, v2}, Lcom/google/android/gms/internal/ads/zzckj;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzcht;Lcom/google/android/gms/internal/ads/zzchu;Ljava/lang/Integer;)V

    .line 20
    .line 21
    .line 22
    sget p1, LG6/L;->b:I

    .line 23
    .line 24
    const-string p1, "ExoPlayerAdapter initialized."

    .line 25
    .line 26
    invoke-static {p1}, LH6/l;->e(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzcjq;->zze:Lcom/google/android/gms/internal/ads/zzchl;

    .line 30
    .line 31
    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/ads/zzchl;->zzs(Lcom/google/android/gms/internal/ads/zzchk;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public static final zzc(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "MD5"

    .line 2
    .line 3
    invoke-static {p0, v0}, LH6/f;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const-string v0, "cache:"

    .line 12
    .line 13
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method private final zzd(J)V
    .locals 2

    .line 1
    sget-object v0, LG6/U;->l:LG6/M;

    .line 2
    .line 3
    new-instance v1, Lcom/google/android/gms/internal/ads/zzcjo;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/zzcjo;-><init>(Lcom/google/android/gms/internal/ads/zzcjq;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method private static zzx(Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/String;
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    new-instance v4, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    add-int/lit8 v3, v3, 0x1

    .line 36
    .line 37
    add-int/2addr v3, v1

    .line 38
    add-int/lit8 v3, v3, 0x1

    .line 39
    .line 40
    add-int/2addr v3, v2

    .line 41
    invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 42
    .line 43
    .line 44
    const-string v1, "/"

    .line 45
    .line 46
    const-string v2, ":"

    .line 47
    .line 48
    invoke-static {v4, p0, v1, v0, v2}, Lka/n;->p(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    return-object p0
.end method


# virtual methods
.method public final release()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcjq;->zze:Lcom/google/android/gms/internal/ads/zzchl;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzchl;->zzs(Lcom/google/android/gms/internal/ads/zzchk;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcjq;->zze:Lcom/google/android/gms/internal/ads/zzchl;

    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzchl;->zzt()V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public final zzD()V
    .locals 1

    .line 1
    sget v0, LG6/L;->b:I

    .line 2
    .line 3
    const-string v0, "Precache onRenderedFirstFrame"

    .line 4
    .line 5
    invoke-static {v0}, LH6/l;->f(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final zza()Lcom/google/android/gms/internal/ads/zzchl;
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    const/4 v0, 0x1

    .line 3
    :try_start_0
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzcjq;->zzh:Z

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->notify()V

    .line 6
    .line 7
    .line 8
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcjq;->zze:Lcom/google/android/gms/internal/ads/zzchl;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzchl;->zzs(Lcom/google/android/gms/internal/ads/zzchk;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcjq;->zze:Lcom/google/android/gms/internal/ads/zzchl;

    .line 16
    .line 17
    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzcjq;->zze:Lcom/google/android/gms/internal/ads/zzchl;

    .line 18
    .line 19
    return-object v0

    .line 20
    :catchall_0
    move-exception v0

    .line 21
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 22
    throw v0
.end method

.method public final zzb()V
    .locals 24

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzcjq;->zzf:Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzcjq;->zzc(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v3

    .line 9
    const-string v17, "error"

    .line 10
    .line 11
    const-string v0, " ms"

    .line 12
    .line 13
    const-string v2, "Timeout reached. Limit: "

    .line 14
    .line 15
    :try_start_0
    sget-object v4, Lcom/google/android/gms/internal/ads/zzbix;->zzaq:Lcom/google/android/gms/internal/ads/zzbio;

    .line 16
    .line 17
    sget-object v5, LD6/s;->e:LD6/s;

    .line 18
    .line 19
    iget-object v6, v5, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 20
    .line 21
    invoke-virtual {v6, v4}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    check-cast v4, Ljava/lang/Long;

    .line 26
    .line 27
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 28
    .line 29
    .line 30
    move-result-wide v6

    .line 31
    const-wide/16 v8, 0x3e8

    .line 32
    .line 33
    mul-long/2addr v6, v8

    .line 34
    sget-object v4, Lcom/google/android/gms/internal/ads/zzbix;->zzA:Lcom/google/android/gms/internal/ads/zzbio;

    .line 35
    .line 36
    iget-object v8, v5, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 37
    .line 38
    invoke-virtual {v8, v4}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    check-cast v4, Ljava/lang/Integer;

    .line 43
    .line 44
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    int-to-long v8, v4

    .line 49
    sget-object v4, Lcom/google/android/gms/internal/ads/zzbix;->zzcG:Lcom/google/android/gms/internal/ads/zzbio;

    .line 50
    .line 51
    iget-object v10, v5, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 52
    .line 53
    invoke-virtual {v10, v4}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    check-cast v4, Ljava/lang/Boolean;

    .line 58
    .line 59
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    monitor-enter p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 64
    :try_start_1
    sget-object v10, LC6/n;->D:LC6/n;

    .line 65
    .line 66
    iget-object v10, v10, LC6/n;->k:Ln7/b;

    .line 67
    .line 68
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 72
    .line 73
    .line 74
    move-result-wide v10

    .line 75
    iget-wide v12, v1, Lcom/google/android/gms/internal/ads/zzcjq;->zzj:J

    .line 76
    .line 77
    sub-long/2addr v10, v12

    .line 78
    cmp-long v10, v10, v6

    .line 79
    .line 80
    if-gtz v10, :cond_b

    .line 81
    .line 82
    iget-boolean v0, v1, Lcom/google/android/gms/internal/ads/zzcjq;->zzg:Z

    .line 83
    .line 84
    if-nez v0, :cond_a

    .line 85
    .line 86
    iget-boolean v0, v1, Lcom/google/android/gms/internal/ads/zzcjq;->zzh:Z

    .line 87
    .line 88
    if-eqz v0, :cond_0

    .line 89
    .line 90
    monitor-exit p0

    .line 91
    goto/16 :goto_7

    .line 92
    .line 93
    :cond_0
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzcjq;->zze:Lcom/google/android/gms/internal/ads/zzchl;

    .line 94
    .line 95
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzchl;->zzB()Z

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    if-eqz v0, :cond_9

    .line 100
    .line 101
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzcjq;->zze:Lcom/google/android/gms/internal/ads/zzchl;

    .line 102
    .line 103
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzchl;->zzH()J

    .line 104
    .line 105
    .line 106
    move-result-wide v6

    .line 107
    const-wide/16 v18, 0x0

    .line 108
    .line 109
    cmp-long v0, v6, v18

    .line 110
    .line 111
    if-lez v0, :cond_7

    .line 112
    .line 113
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzcjq;->zze:Lcom/google/android/gms/internal/ads/zzchl;

    .line 114
    .line 115
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzchl;->zzN()J

    .line 116
    .line 117
    .line 118
    move-result-wide v10

    .line 119
    iget-wide v12, v1, Lcom/google/android/gms/internal/ads/zzcjq;->zzk:J

    .line 120
    .line 121
    cmp-long v0, v10, v12

    .line 122
    .line 123
    if-eqz v0, :cond_5

    .line 124
    .line 125
    cmp-long v0, v10, v18

    .line 126
    .line 127
    if-lez v0, :cond_1

    .line 128
    .line 129
    const/4 v0, 0x1

    .line 130
    goto :goto_0

    .line 131
    :cond_1
    const/4 v0, 0x0

    .line 132
    :goto_0
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzcjq;->zzf:Ljava/lang/String;

    .line 133
    .line 134
    if-eqz v4, :cond_2

    .line 135
    .line 136
    iget-object v14, v1, Lcom/google/android/gms/internal/ads/zzcjq;->zze:Lcom/google/android/gms/internal/ads/zzchl;

    .line 137
    .line 138
    invoke-virtual {v14}, Lcom/google/android/gms/internal/ads/zzchl;->zzI()J

    .line 139
    .line 140
    .line 141
    move-result-wide v14

    .line 142
    goto :goto_1

    .line 143
    :cond_2
    const-wide/16 v14, -0x1

    .line 144
    .line 145
    :goto_1
    if-eqz v4, :cond_3

    .line 146
    .line 147
    iget-object v12, v1, Lcom/google/android/gms/internal/ads/zzcjq;->zze:Lcom/google/android/gms/internal/ads/zzchl;

    .line 148
    .line 149
    invoke-virtual {v12}, Lcom/google/android/gms/internal/ads/zzchl;->zzJ()J

    .line 150
    .line 151
    .line 152
    move-result-wide v12

    .line 153
    goto :goto_2

    .line 154
    :cond_3
    const-wide/16 v12, -0x1

    .line 155
    .line 156
    :goto_2
    if-eqz v4, :cond_4

    .line 157
    .line 158
    iget-object v4, v1, Lcom/google/android/gms/internal/ads/zzcjq;->zze:Lcom/google/android/gms/internal/ads/zzchl;

    .line 159
    .line 160
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzchl;->zzK()J

    .line 161
    .line 162
    .line 163
    move-result-wide v20

    .line 164
    :goto_3
    move-wide/from16 v22, v8

    .line 165
    .line 166
    move-object v8, v5

    .line 167
    move-wide v4, v10

    .line 168
    move-wide v9, v14

    .line 169
    goto :goto_4

    .line 170
    :cond_4
    const-wide/16 v20, -0x1

    .line 171
    .line 172
    goto :goto_3

    .line 173
    :goto_4
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzchl;->zzP()I

    .line 174
    .line 175
    .line 176
    move-result v15

    .line 177
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzchl;->zzQ()I

    .line 178
    .line 179
    .line 180
    move-result v16

    .line 181
    move-object v11, v8

    .line 182
    move v8, v0

    .line 183
    move-object v0, v11

    .line 184
    move-wide v11, v12

    .line 185
    move-wide/from16 v13, v20

    .line 186
    .line 187
    invoke-virtual/range {v1 .. v16}, Lcom/google/android/gms/internal/ads/zzcjh;->zzm(Ljava/lang/String;Ljava/lang/String;JJZJJJII)V

    .line 188
    .line 189
    .line 190
    iput-wide v4, v1, Lcom/google/android/gms/internal/ads/zzcjq;->zzk:J

    .line 191
    .line 192
    goto :goto_5

    .line 193
    :cond_5
    move-object v0, v5

    .line 194
    move-wide/from16 v22, v8

    .line 195
    .line 196
    move-wide v4, v10

    .line 197
    :goto_5
    cmp-long v2, v4, v6

    .line 198
    .line 199
    if-ltz v2, :cond_6

    .line 200
    .line 201
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzcjq;->zzf:Ljava/lang/String;

    .line 202
    .line 203
    invoke-virtual {v1, v0, v3, v6, v7}, Lcom/google/android/gms/internal/ads/zzcjh;->zzp(Ljava/lang/String;Ljava/lang/String;J)V

    .line 204
    .line 205
    .line 206
    monitor-exit p0

    .line 207
    goto/16 :goto_7

    .line 208
    .line 209
    :cond_6
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzcjq;->zze:Lcom/google/android/gms/internal/ads/zzchl;

    .line 210
    .line 211
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzchl;->zzO()J

    .line 212
    .line 213
    .line 214
    move-result-wide v6

    .line 215
    cmp-long v2, v6, v22

    .line 216
    .line 217
    if-ltz v2, :cond_8

    .line 218
    .line 219
    cmp-long v2, v4, v18

    .line 220
    .line 221
    if-lez v2, :cond_8

    .line 222
    .line 223
    monitor-exit p0

    .line 224
    goto/16 :goto_7

    .line 225
    .line 226
    :cond_7
    move-object v0, v5

    .line 227
    :cond_8
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 228
    sget-object v2, Lcom/google/android/gms/internal/ads/zzbix;->zzar:Lcom/google/android/gms/internal/ads/zzbio;

    .line 229
    .line 230
    iget-object v0, v0, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 231
    .line 232
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    check-cast v0, Ljava/lang/Long;

    .line 237
    .line 238
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 239
    .line 240
    .line 241
    move-result-wide v2

    .line 242
    invoke-direct {v1, v2, v3}, Lcom/google/android/gms/internal/ads/zzcjq;->zzd(J)V

    .line 243
    .line 244
    .line 245
    return-void

    .line 246
    :cond_9
    :try_start_2
    const-string v17, "exoPlayerReleased"

    .line 247
    .line 248
    new-instance v0, Ljava/io/IOException;

    .line 249
    .line 250
    const-string v2, "ExoPlayer was released during preloading."

    .line 251
    .line 252
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 253
    .line 254
    .line 255
    throw v0

    .line 256
    :catchall_0
    move-exception v0

    .line 257
    goto :goto_6

    .line 258
    :cond_a
    const-string v17, "externalAbort"

    .line 259
    .line 260
    new-instance v0, Ljava/io/IOException;

    .line 261
    .line 262
    const-string v2, "Abort requested before buffering finished. "

    .line 263
    .line 264
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    throw v0

    .line 268
    :cond_b
    const-string v17, "downloadTimeout"

    .line 269
    .line 270
    new-instance v4, Ljava/io/IOException;

    .line 271
    .line 272
    invoke-static {v6, v7}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object v5

    .line 276
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 277
    .line 278
    .line 279
    move-result v5

    .line 280
    add-int/lit8 v5, v5, 0x1b

    .line 281
    .line 282
    new-instance v8, Ljava/lang/StringBuilder;

    .line 283
    .line 284
    invoke-direct {v8, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 288
    .line 289
    .line 290
    invoke-virtual {v8, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 291
    .line 292
    .line 293
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 294
    .line 295
    .line 296
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    invoke-direct {v4, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 301
    .line 302
    .line 303
    throw v4

    .line 304
    :goto_6
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 305
    :try_start_3
    throw v0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 306
    :catch_0
    move-exception v0

    .line 307
    move-object/from16 v2, v17

    .line 308
    .line 309
    iget-object v4, v1, Lcom/google/android/gms/internal/ads/zzcjq;->zzf:Ljava/lang/String;

    .line 310
    .line 311
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 312
    .line 313
    .line 314
    move-result-object v5

    .line 315
    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object v6

    .line 319
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 320
    .line 321
    .line 322
    move-result v6

    .line 323
    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 324
    .line 325
    .line 326
    move-result-object v7

    .line 327
    add-int/lit8 v6, v6, 0x22

    .line 328
    .line 329
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 330
    .line 331
    .line 332
    move-result v7

    .line 333
    new-instance v8, Ljava/lang/StringBuilder;

    .line 334
    .line 335
    add-int/2addr v6, v7

    .line 336
    invoke-direct {v8, v6}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 337
    .line 338
    .line 339
    const-string v6, "Failed to preload url "

    .line 340
    .line 341
    const-string v7, " Exception: "

    .line 342
    .line 343
    invoke-static {v8, v6, v4, v7, v5}, Lka/n;->h(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 344
    .line 345
    .line 346
    move-result-object v4

    .line 347
    sget v5, LG6/L;->b:I

    .line 348
    .line 349
    invoke-static {v4}, LH6/l;->f(Ljava/lang/String;)V

    .line 350
    .line 351
    .line 352
    const-string v4, "VideoStreamExoPlayerCache.preload"

    .line 353
    .line 354
    sget-object v5, LC6/n;->D:LC6/n;

    .line 355
    .line 356
    iget-object v5, v5, LC6/n;->h:Lcom/google/android/gms/internal/ads/zzcfk;

    .line 357
    .line 358
    invoke-virtual {v5, v0, v4}, Lcom/google/android/gms/internal/ads/zzcfk;->zzi(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 359
    .line 360
    .line 361
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzcjq;->release()V

    .line 362
    .line 363
    .line 364
    invoke-static {v2, v0}, Lcom/google/android/gms/internal/ads/zzcjq;->zzx(Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/String;

    .line 365
    .line 366
    .line 367
    move-result-object v0

    .line 368
    iget-object v4, v1, Lcom/google/android/gms/internal/ads/zzcjq;->zzf:Ljava/lang/String;

    .line 369
    .line 370
    invoke-virtual {v1, v4, v3, v2, v0}, Lcom/google/android/gms/internal/ads/zzcjh;->zzq(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 371
    .line 372
    .line 373
    :goto_7
    sget-object v0, LC6/n;->D:LC6/n;

    .line 374
    .line 375
    iget-object v0, v0, LC6/n;->B:Lcom/google/android/gms/internal/ads/zzcja;

    .line 376
    .line 377
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzcjq;->zzi:Lcom/google/android/gms/internal/ads/zzciz;

    .line 378
    .line 379
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/zzcja;->zzd(Lcom/google/android/gms/internal/ads/zzciz;)V

    .line 380
    .line 381
    .line 382
    return-void
.end method

.method public final zze(Ljava/lang/String;)Z
    .locals 1

    .line 1
    filled-new-array {p1}, [Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/ads/zzcjq;->zzf(Ljava/lang/String;[Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public final zzf(Ljava/lang/String;[Ljava/lang/String;)Z
    .locals 38

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v0, p2

    .line 6
    .line 7
    const/16 v17, 0x1

    .line 8
    .line 9
    iput-object v2, v1, Lcom/google/android/gms/internal/ads/zzcjq;->zzf:Ljava/lang/String;

    .line 10
    .line 11
    const-string v18, "error"

    .line 12
    .line 13
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzcjq;->zzc(Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    const-string v4, " ms"

    .line 18
    .line 19
    const-string v5, "Timeout reached. Limit: "

    .line 20
    .line 21
    const/16 v19, 0x0

    .line 22
    .line 23
    :try_start_0
    array-length v6, v0

    .line 24
    new-array v6, v6, [Landroid/net/Uri;

    .line 25
    .line 26
    move/from16 v7, v19

    .line 27
    .line 28
    :goto_0
    array-length v8, v0

    .line 29
    if-ge v7, v8, :cond_0

    .line 30
    .line 31
    aget-object v8, v0, v7

    .line 32
    .line 33
    invoke-static {v8}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 34
    .line 35
    .line 36
    move-result-object v8

    .line 37
    aput-object v8, v6, v7

    .line 38
    .line 39
    add-int/lit8 v7, v7, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzcjq;->zze:Lcom/google/android/gms/internal/ads/zzchl;

    .line 43
    .line 44
    iget-object v7, v1, Lcom/google/android/gms/internal/ads/zzcjh;->zzb:Ljava/lang/String;

    .line 45
    .line 46
    invoke-virtual {v0, v6, v7}, Lcom/google/android/gms/internal/ads/zzchl;->zzq([Landroid/net/Uri;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzcjh;->zzc:Ljava/lang/ref/WeakReference;

    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    check-cast v0, Lcom/google/android/gms/internal/ads/zzchu;

    .line 56
    .line 57
    if-eqz v0, :cond_1

    .line 58
    .line 59
    invoke-interface {v0, v3, v1}, Lcom/google/android/gms/internal/ads/zzchu;->zzt(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzcjh;)V

    .line 60
    .line 61
    .line 62
    :cond_1
    sget-object v0, LC6/n;->D:LC6/n;

    .line 63
    .line 64
    iget-object v0, v0, LC6/n;->k:Ln7/b;

    .line 65
    .line 66
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 70
    .line 71
    .line 72
    move-result-wide v20

    .line 73
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbix;->zzar:Lcom/google/android/gms/internal/ads/zzbio;

    .line 74
    .line 75
    sget-object v6, LD6/s;->e:LD6/s;

    .line 76
    .line 77
    iget-object v7, v6, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 78
    .line 79
    invoke-virtual {v7, v0}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    check-cast v0, Ljava/lang/Long;

    .line 84
    .line 85
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 86
    .line 87
    .line 88
    move-result-wide v7

    .line 89
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbix;->zzaq:Lcom/google/android/gms/internal/ads/zzbio;

    .line 90
    .line 91
    iget-object v9, v6, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 92
    .line 93
    invoke-virtual {v9, v0}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    check-cast v0, Ljava/lang/Long;

    .line 98
    .line 99
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 100
    .line 101
    .line 102
    move-result-wide v9

    .line 103
    const-wide/16 v11, 0x3e8

    .line 104
    .line 105
    mul-long/2addr v9, v11

    .line 106
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbix;->zzA:Lcom/google/android/gms/internal/ads/zzbio;

    .line 107
    .line 108
    iget-object v11, v6, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 109
    .line 110
    invoke-virtual {v11, v0}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    check-cast v0, Ljava/lang/Integer;

    .line 115
    .line 116
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    int-to-long v11, v0

    .line 121
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbix;->zzcG:Lcom/google/android/gms/internal/ads/zzbio;

    .line 122
    .line 123
    iget-object v6, v6, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 124
    .line 125
    invoke-virtual {v6, v0}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    check-cast v0, Ljava/lang/Boolean;

    .line 130
    .line 131
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    const-wide/16 v22, -0x1

    .line 136
    .line 137
    move-wide/from16 v13, v22

    .line 138
    .line 139
    :goto_1
    monitor-enter p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 140
    :try_start_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 141
    .line 142
    .line 143
    move-result-wide v15

    .line 144
    sub-long v15, v15, v20

    .line 145
    .line 146
    cmp-long v6, v15, v9

    .line 147
    .line 148
    if-gtz v6, :cond_d

    .line 149
    .line 150
    iget-boolean v6, v1, Lcom/google/android/gms/internal/ads/zzcjq;->zzg:Z

    .line 151
    .line 152
    if-nez v6, :cond_c

    .line 153
    .line 154
    iget-boolean v6, v1, Lcom/google/android/gms/internal/ads/zzcjq;->zzh:Z

    .line 155
    .line 156
    if-eqz v6, :cond_2

    .line 157
    .line 158
    monitor-exit p0

    .line 159
    return v17

    .line 160
    :cond_2
    iget-object v6, v1, Lcom/google/android/gms/internal/ads/zzcjq;->zze:Lcom/google/android/gms/internal/ads/zzchl;

    .line 161
    .line 162
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzchl;->zzB()Z

    .line 163
    .line 164
    .line 165
    move-result v6

    .line 166
    if-eqz v6, :cond_b

    .line 167
    .line 168
    iget-object v6, v1, Lcom/google/android/gms/internal/ads/zzcjq;->zze:Lcom/google/android/gms/internal/ads/zzchl;

    .line 169
    .line 170
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzchl;->zzH()J

    .line 171
    .line 172
    .line 173
    move-result-wide v15

    .line 174
    const-wide/16 v24, 0x0

    .line 175
    .line 176
    cmp-long v6, v15, v24

    .line 177
    .line 178
    if-lez v6, :cond_a

    .line 179
    .line 180
    iget-object v6, v1, Lcom/google/android/gms/internal/ads/zzcjq;->zze:Lcom/google/android/gms/internal/ads/zzchl;

    .line 181
    .line 182
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzchl;->zzN()J

    .line 183
    .line 184
    .line 185
    move-result-wide v26

    .line 186
    cmp-long v6, v26, v13

    .line 187
    .line 188
    if-eqz v6, :cond_7

    .line 189
    .line 190
    cmp-long v6, v26, v24

    .line 191
    .line 192
    if-lez v6, :cond_3

    .line 193
    .line 194
    move-wide v6, v7

    .line 195
    move/from16 v8, v17

    .line 196
    .line 197
    goto :goto_2

    .line 198
    :cond_3
    move-wide v6, v7

    .line 199
    move/from16 v8, v19

    .line 200
    .line 201
    :goto_2
    if-eqz v0, :cond_4

    .line 202
    .line 203
    iget-object v13, v1, Lcom/google/android/gms/internal/ads/zzcjq;->zze:Lcom/google/android/gms/internal/ads/zzchl;

    .line 204
    .line 205
    invoke-virtual {v13}, Lcom/google/android/gms/internal/ads/zzchl;->zzI()J

    .line 206
    .line 207
    .line 208
    move-result-wide v13

    .line 209
    goto :goto_3

    .line 210
    :cond_4
    move-wide/from16 v13, v22

    .line 211
    .line 212
    :goto_3
    if-eqz v0, :cond_5

    .line 213
    .line 214
    move/from16 p2, v0

    .line 215
    .line 216
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzcjq;->zze:Lcom/google/android/gms/internal/ads/zzchl;

    .line 217
    .line 218
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzchl;->zzJ()J

    .line 219
    .line 220
    .line 221
    move-result-wide v28

    .line 222
    goto :goto_4

    .line 223
    :cond_5
    move/from16 p2, v0

    .line 224
    .line 225
    move-wide/from16 v28, v22

    .line 226
    .line 227
    :goto_4
    if-eqz p2, :cond_6

    .line 228
    .line 229
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzcjq;->zze:Lcom/google/android/gms/internal/ads/zzchl;

    .line 230
    .line 231
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzchl;->zzK()J

    .line 232
    .line 233
    .line 234
    move-result-wide v30

    .line 235
    :goto_5
    move-wide/from16 v32, v6

    .line 236
    .line 237
    move-wide v6, v15

    .line 238
    goto :goto_6

    .line 239
    :cond_6
    move-wide/from16 v30, v22

    .line 240
    .line 241
    goto :goto_5

    .line 242
    :goto_6
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzchl;->zzP()I

    .line 243
    .line 244
    .line 245
    move-result v15

    .line 246
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzchl;->zzQ()I

    .line 247
    .line 248
    .line 249
    move-result v16

    .line 250
    move-object v0, v5

    .line 251
    move-wide/from16 v34, v32

    .line 252
    .line 253
    move-wide/from16 v36, v26

    .line 254
    .line 255
    move-object/from16 v26, v4

    .line 256
    .line 257
    move-wide/from16 v4, v36

    .line 258
    .line 259
    move-wide/from16 v36, v28

    .line 260
    .line 261
    move-wide/from16 v27, v9

    .line 262
    .line 263
    move-wide v9, v13

    .line 264
    move-wide/from16 v13, v30

    .line 265
    .line 266
    move-wide/from16 v29, v11

    .line 267
    .line 268
    move-wide/from16 v11, v36

    .line 269
    .line 270
    invoke-virtual/range {v1 .. v16}, Lcom/google/android/gms/internal/ads/zzcjh;->zzm(Ljava/lang/String;Ljava/lang/String;JJZJJJII)V

    .line 271
    .line 272
    .line 273
    move-wide v13, v4

    .line 274
    goto :goto_7

    .line 275
    :cond_7
    move/from16 p2, v0

    .line 276
    .line 277
    move-object v0, v5

    .line 278
    move-wide/from16 v34, v7

    .line 279
    .line 280
    move-wide/from16 v29, v11

    .line 281
    .line 282
    move-wide v6, v15

    .line 283
    move-wide/from16 v36, v26

    .line 284
    .line 285
    move-object/from16 v26, v4

    .line 286
    .line 287
    move-wide/from16 v27, v9

    .line 288
    .line 289
    move-wide/from16 v4, v36

    .line 290
    .line 291
    :goto_7
    cmp-long v8, v4, v6

    .line 292
    .line 293
    if-ltz v8, :cond_8

    .line 294
    .line 295
    invoke-virtual {v1, v2, v3, v6, v7}, Lcom/google/android/gms/internal/ads/zzcjh;->zzp(Ljava/lang/String;Ljava/lang/String;J)V

    .line 296
    .line 297
    .line 298
    monitor-exit p0

    .line 299
    return v17

    .line 300
    :cond_8
    iget-object v6, v1, Lcom/google/android/gms/internal/ads/zzcjq;->zze:Lcom/google/android/gms/internal/ads/zzchl;

    .line 301
    .line 302
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzchl;->zzO()J

    .line 303
    .line 304
    .line 305
    move-result-wide v6

    .line 306
    cmp-long v6, v6, v29

    .line 307
    .line 308
    if-ltz v6, :cond_9

    .line 309
    .line 310
    cmp-long v4, v4, v24

    .line 311
    .line 312
    if-lez v4, :cond_9

    .line 313
    .line 314
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 315
    return v17

    .line 316
    :cond_9
    move-wide/from16 v6, v34

    .line 317
    .line 318
    goto :goto_8

    .line 319
    :cond_a
    move/from16 p2, v0

    .line 320
    .line 321
    move-object/from16 v26, v4

    .line 322
    .line 323
    move-object v0, v5

    .line 324
    move-wide/from16 v27, v9

    .line 325
    .line 326
    move-wide/from16 v29, v11

    .line 327
    .line 328
    move-wide v6, v7

    .line 329
    :goto_8
    :try_start_2
    invoke-virtual {v1, v6, v7}, Ljava/lang/Object;->wait(J)V
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 330
    .line 331
    .line 332
    :try_start_3
    monitor-exit p0

    .line 333
    move-object v5, v0

    .line 334
    move-wide v7, v6

    .line 335
    move-object/from16 v4, v26

    .line 336
    .line 337
    move-wide/from16 v9, v27

    .line 338
    .line 339
    move-wide/from16 v11, v29

    .line 340
    .line 341
    move/from16 v0, p2

    .line 342
    .line 343
    goto/16 :goto_1

    .line 344
    .line 345
    :catch_0
    const-string v18, "interrupted"

    .line 346
    .line 347
    new-instance v0, Ljava/io/IOException;

    .line 348
    .line 349
    const-string v4, "Wait interrupted."

    .line 350
    .line 351
    invoke-direct {v0, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 352
    .line 353
    .line 354
    throw v0

    .line 355
    :catchall_0
    move-exception v0

    .line 356
    goto :goto_9

    .line 357
    :cond_b
    const-string v18, "exoPlayerReleased"

    .line 358
    .line 359
    new-instance v0, Ljava/io/IOException;

    .line 360
    .line 361
    const-string v4, "ExoPlayer was released during preloading."

    .line 362
    .line 363
    invoke-direct {v0, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 364
    .line 365
    .line 366
    throw v0

    .line 367
    :cond_c
    const-string v18, "externalAbort"

    .line 368
    .line 369
    new-instance v0, Ljava/io/IOException;

    .line 370
    .line 371
    const-string v4, "Abort requested before buffering finished. "

    .line 372
    .line 373
    invoke-direct {v0, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 374
    .line 375
    .line 376
    throw v0

    .line 377
    :cond_d
    move-object/from16 v26, v4

    .line 378
    .line 379
    move-object v0, v5

    .line 380
    move-wide/from16 v27, v9

    .line 381
    .line 382
    const-string v18, "downloadTimeout"

    .line 383
    .line 384
    new-instance v4, Ljava/io/IOException;

    .line 385
    .line 386
    invoke-static/range {v27 .. v28}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 387
    .line 388
    .line 389
    move-result-object v5

    .line 390
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 391
    .line 392
    .line 393
    move-result v5

    .line 394
    add-int/lit8 v5, v5, 0x1b

    .line 395
    .line 396
    new-instance v6, Ljava/lang/StringBuilder;

    .line 397
    .line 398
    invoke-direct {v6, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 399
    .line 400
    .line 401
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 402
    .line 403
    .line 404
    move-wide/from16 v9, v27

    .line 405
    .line 406
    invoke-virtual {v6, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 407
    .line 408
    .line 409
    move-object/from16 v0, v26

    .line 410
    .line 411
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 412
    .line 413
    .line 414
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 415
    .line 416
    .line 417
    move-result-object v0

    .line 418
    invoke-direct {v4, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 419
    .line 420
    .line 421
    throw v4

    .line 422
    :goto_9
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 423
    :try_start_4
    throw v0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    .line 424
    :catch_1
    move-exception v0

    .line 425
    move-object/from16 v4, v18

    .line 426
    .line 427
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 428
    .line 429
    .line 430
    move-result-object v5

    .line 431
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 432
    .line 433
    .line 434
    move-result-object v6

    .line 435
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 436
    .line 437
    .line 438
    move-result v6

    .line 439
    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 440
    .line 441
    .line 442
    move-result-object v7

    .line 443
    add-int/lit8 v6, v6, 0x22

    .line 444
    .line 445
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 446
    .line 447
    .line 448
    move-result v7

    .line 449
    new-instance v8, Ljava/lang/StringBuilder;

    .line 450
    .line 451
    add-int/2addr v6, v7

    .line 452
    invoke-direct {v8, v6}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 453
    .line 454
    .line 455
    const-string v6, "Failed to preload url "

    .line 456
    .line 457
    const-string v7, " Exception: "

    .line 458
    .line 459
    invoke-static {v8, v6, v2, v7, v5}, Lka/n;->h(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 460
    .line 461
    .line 462
    move-result-object v5

    .line 463
    sget v6, LG6/L;->b:I

    .line 464
    .line 465
    invoke-static {v5}, LH6/l;->f(Ljava/lang/String;)V

    .line 466
    .line 467
    .line 468
    const-string v5, "VideoStreamExoPlayerCache.preload"

    .line 469
    .line 470
    sget-object v6, LC6/n;->D:LC6/n;

    .line 471
    .line 472
    iget-object v6, v6, LC6/n;->h:Lcom/google/android/gms/internal/ads/zzcfk;

    .line 473
    .line 474
    invoke-virtual {v6, v0, v5}, Lcom/google/android/gms/internal/ads/zzcfk;->zzi(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 475
    .line 476
    .line 477
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzcjq;->release()V

    .line 478
    .line 479
    .line 480
    invoke-static {v4, v0}, Lcom/google/android/gms/internal/ads/zzcjq;->zzx(Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/String;

    .line 481
    .line 482
    .line 483
    move-result-object v0

    .line 484
    invoke-virtual {v1, v2, v3, v4, v0}, Lcom/google/android/gms/internal/ads/zzcjh;->zzq(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 485
    .line 486
    .line 487
    return v19
.end method

.method public final zzg(Ljava/lang/String;[Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzciz;)Z
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcjq;->zzf:Ljava/lang/String;

    .line 3
    .line 4
    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzcjq;->zzi:Lcom/google/android/gms/internal/ads/zzciz;

    .line 5
    .line 6
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzcjq;->zzc(Ljava/lang/String;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p3

    .line 10
    const/4 v1, 0x0

    .line 11
    :try_start_0
    array-length v2, p2

    .line 12
    new-array v2, v2, [Landroid/net/Uri;

    .line 13
    .line 14
    move v3, v1

    .line 15
    :goto_0
    array-length v4, p2

    .line 16
    if-ge v3, v4, :cond_0

    .line 17
    .line 18
    aget-object v4, p2, v3

    .line 19
    .line 20
    invoke-static {v4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    aput-object v4, v2, v3

    .line 25
    .line 26
    add-int/2addr v3, v0

    .line 27
    goto :goto_0

    .line 28
    :catch_0
    move-exception p2

    .line 29
    goto :goto_1

    .line 30
    :cond_0
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzcjq;->zze:Lcom/google/android/gms/internal/ads/zzchl;

    .line 31
    .line 32
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzcjh;->zzb:Ljava/lang/String;

    .line 33
    .line 34
    invoke-virtual {p2, v2, v3}, Lcom/google/android/gms/internal/ads/zzchl;->zzq([Landroid/net/Uri;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzcjh;->zzc:Ljava/lang/ref/WeakReference;

    .line 38
    .line 39
    invoke-virtual {p2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    check-cast p2, Lcom/google/android/gms/internal/ads/zzchu;

    .line 44
    .line 45
    if-eqz p2, :cond_1

    .line 46
    .line 47
    invoke-interface {p2, p3, p0}, Lcom/google/android/gms/internal/ads/zzchu;->zzt(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzcjh;)V

    .line 48
    .line 49
    .line 50
    :cond_1
    sget-object p2, LC6/n;->D:LC6/n;

    .line 51
    .line 52
    iget-object p2, p2, LC6/n;->k:Ln7/b;

    .line 53
    .line 54
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 58
    .line 59
    .line 60
    move-result-wide v2

    .line 61
    iput-wide v2, p0, Lcom/google/android/gms/internal/ads/zzcjq;->zzj:J

    .line 62
    .line 63
    const-wide/16 v2, -0x1

    .line 64
    .line 65
    iput-wide v2, p0, Lcom/google/android/gms/internal/ads/zzcjq;->zzk:J

    .line 66
    .line 67
    const-wide/16 v2, 0x0

    .line 68
    .line 69
    invoke-direct {p0, v2, v3}, Lcom/google/android/gms/internal/ads/zzcjq;->zzd(J)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 70
    .line 71
    .line 72
    return v0

    .line 73
    :goto_1
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    add-int/lit8 v2, v2, 0x22

    .line 90
    .line 91
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 92
    .line 93
    .line 94
    move-result v3

    .line 95
    new-instance v4, Ljava/lang/StringBuilder;

    .line 96
    .line 97
    add-int/2addr v2, v3

    .line 98
    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 99
    .line 100
    .line 101
    const-string v2, "Failed to preload url "

    .line 102
    .line 103
    const-string v3, " Exception: "

    .line 104
    .line 105
    invoke-static {v4, v2, p1, v3, v0}, Lka/n;->h(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    sget v2, LG6/L;->b:I

    .line 110
    .line 111
    invoke-static {v0}, LH6/l;->f(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    sget-object v0, LC6/n;->D:LC6/n;

    .line 115
    .line 116
    iget-object v0, v0, LC6/n;->h:Lcom/google/android/gms/internal/ads/zzcfk;

    .line 117
    .line 118
    const-string v2, "VideoStreamExoPlayerCache.preload"

    .line 119
    .line 120
    invoke-virtual {v0, p2, v2}, Lcom/google/android/gms/internal/ads/zzcfk;->zzi(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzcjq;->release()V

    .line 124
    .line 125
    .line 126
    const-string v0, "error"

    .line 127
    .line 128
    invoke-static {v0, p2}, Lcom/google/android/gms/internal/ads/zzcjq;->zzx(Ljava/lang/String;Ljava/lang/Exception;)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object p2

    .line 132
    invoke-virtual {p0, p1, p3, v0, p2}, Lcom/google/android/gms/internal/ads/zzcjh;->zzq(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    return v1
.end method

.method public final zzh(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcjq;->zze:Lcom/google/android/gms/internal/ads/zzchl;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzchl;->zzG(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final zzi(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcjq;->zze:Lcom/google/android/gms/internal/ads/zzchl;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzchl;->zzF(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final zzj(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcjq;->zze:Lcom/google/android/gms/internal/ads/zzchl;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzchl;->zzy(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final zzk(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcjq;->zze:Lcom/google/android/gms/internal/ads/zzchl;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzchl;->zzz(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final zzl()V
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    const/4 v0, 0x1

    .line 3
    :try_start_0
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzcjq;->zzg:Z

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->notify()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzcjq;->release()V

    .line 9
    .line 10
    .line 11
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcjq;->zzf:Ljava/lang/String;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzcjq;->zzc(Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzcjq;->zzf:Ljava/lang/String;

    .line 21
    .line 22
    const-string v2, "externalAbort"

    .line 23
    .line 24
    const-string v3, "Programmatic precache abort."

    .line 25
    .line 26
    invoke-virtual {p0, v1, v0, v2, v3}, Lcom/google/android/gms/internal/ads/zzcjh;->zzq(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    :cond_0
    return-void

    .line 30
    :catchall_0
    move-exception v0

    .line 31
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 32
    throw v0
.end method

.method public final zzr(ZJ)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcjh;->zzc:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/google/android/gms/internal/ads/zzchu;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    sget-object v1, Lcom/google/android/gms/internal/ads/zzcfy;->zzf:Lcom/google/android/gms/internal/ads/zzhcp;

    .line 12
    .line 13
    new-instance v2, Lcom/google/android/gms/internal/ads/zzcjp;

    .line 14
    .line 15
    invoke-direct {v2, v0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzcjp;-><init>(Lcom/google/android/gms/internal/ads/zzchu;ZJ)V

    .line 16
    .line 17
    .line 18
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method public final zzs(I)V
    .locals 0

    return-void
.end method

.method public final zzt(II)V
    .locals 0

    return-void
.end method

.method public final zzu(Ljava/lang/String;Ljava/lang/Exception;)V
    .locals 1

    .line 1
    sget p1, LG6/L;->b:I

    .line 2
    .line 3
    const-string p1, "Precache error"

    .line 4
    .line 5
    invoke-static {p1, p2}, LH6/l;->g(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 6
    .line 7
    .line 8
    sget-object p1, LC6/n;->D:LC6/n;

    .line 9
    .line 10
    iget-object p1, p1, LC6/n;->h:Lcom/google/android/gms/internal/ads/zzcfk;

    .line 11
    .line 12
    const-string v0, "VideoStreamExoPlayerCache.onError"

    .line 13
    .line 14
    invoke-virtual {p1, p2, v0}, Lcom/google/android/gms/internal/ads/zzcfk;->zzi(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final zzv(Ljava/lang/String;Ljava/lang/Exception;)V
    .locals 1

    .line 1
    sget p1, LG6/L;->b:I

    .line 2
    .line 3
    const-string p1, "Precache exception"

    .line 4
    .line 5
    invoke-static {p1, p2}, LH6/l;->g(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 6
    .line 7
    .line 8
    sget-object p1, LC6/n;->D:LC6/n;

    .line 9
    .line 10
    iget-object p1, p1, LC6/n;->h:Lcom/google/android/gms/internal/ads/zzcfk;

    .line 11
    .line 12
    const-string v0, "VideoStreamExoPlayerCache.onException"

    .line 13
    .line 14
    invoke-virtual {p1, p2, v0}, Lcom/google/android/gms/internal/ads/zzcfk;->zzi(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method
