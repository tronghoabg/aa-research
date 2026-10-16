.class public final Lcom/google/android/gms/internal/ads/zzdal;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzdgf;
.implements Lcom/google/android/gms/internal/ads/zzdls;


# instance fields
.field private zza:Lcom/google/android/gms/internal/ads/zzcbd;

.field private final zzb:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final zzc:Landroid/content/Context;

.field private final zzd:Lcom/google/android/gms/internal/ads/zzfqt;

.field private final zze:LH6/a;

.field private final zzf:Ljava/util/concurrent/Executor;

.field private zzg:Z

.field private zzh:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzfqt;LH6/a;Ljava/util/concurrent/Executor;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzdal;->zzg:Z

    .line 6
    .line 7
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzdal;->zzh:Z

    .line 8
    .line 9
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzdal;->zzb:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 15
    .line 16
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzdal;->zzc:Landroid/content/Context;

    .line 17
    .line 18
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzdal;->zzd:Lcom/google/android/gms/internal/ads/zzfqt;

    .line 19
    .line 20
    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzdal;->zze:LH6/a;

    .line 21
    .line 22
    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzdal;->zzf:Ljava/util/concurrent/Executor;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final zzc()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdal;->zzb:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    goto/16 :goto_3

    .line 11
    .line 12
    :cond_0
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbkx;->zzo:Lcom/google/android/gms/internal/ads/zzbkh;

    .line 13
    .line 14
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbkh;->zze()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Ljava/lang/Boolean;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    const/4 v2, 0x2

    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    :goto_0
    move v3, v2

    .line 28
    goto :goto_1

    .line 29
    :cond_1
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbkx;->zzp:Lcom/google/android/gms/internal/ads/zzbkh;

    .line 30
    .line 31
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbkh;->zze()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, Ljava/lang/Boolean;

    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    const/4 v3, 0x3

    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_2
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbkx;->zzn:Lcom/google/android/gms/internal/ads/zzbkh;

    .line 46
    .line 47
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbkh;->zze()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    check-cast v0, Ljava/lang/Boolean;

    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-nez v0, :cond_4

    .line 58
    .line 59
    :catch_0
    :cond_3
    move v3, v1

    .line 60
    goto :goto_1

    .line 61
    :cond_4
    sget-object v0, LC6/n;->D:LC6/n;

    .line 62
    .line 63
    iget-object v0, v0, LC6/n;->h:Lcom/google/android/gms/internal/ads/zzcfk;

    .line 64
    .line 65
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzcfk;->zzp()LG6/N;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    check-cast v0, LG6/O;

    .line 70
    .line 71
    invoke-virtual {v0}, LG6/O;->r()Lcom/google/android/gms/internal/ads/zzcff;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzcff;->zzd()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    :try_start_0
    new-instance v4, Lorg/json/JSONObject;

    .line 80
    .line 81
    invoke-direct {v4, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    const-string v0, "local_flag_write"

    .line 85
    .line 86
    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    const-string v4, "client"

    .line 91
    .line 92
    invoke-static {v0, v4}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 93
    .line 94
    .line 95
    move-result v4

    .line 96
    if-eqz v4, :cond_5

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_5
    const-string v4, "service"

    .line 100
    .line 101
    invoke-static {v0, v4}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 102
    .line 103
    .line 104
    move-result v0
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 105
    if-eqz v0, :cond_3

    .line 106
    .line 107
    :goto_1
    add-int/lit8 v3, v3, -0x1

    .line 108
    .line 109
    if-eq v3, v1, :cond_7

    .line 110
    .line 111
    if-eq v3, v2, :cond_6

    .line 112
    .line 113
    goto :goto_3

    .line 114
    :cond_6
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdal;->zzc:Landroid/content/Context;

    .line 115
    .line 116
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzdal;->zzd:Lcom/google/android/gms/internal/ads/zzfqt;

    .line 117
    .line 118
    sget-object v3, LC6/n;->D:LC6/n;

    .line 119
    .line 120
    iget-object v3, v3, LC6/n;->r:Lcom/google/android/gms/internal/ads/zzbug;

    .line 121
    .line 122
    invoke-static {}, LH6/a;->V()LH6/a;

    .line 123
    .line 124
    .line 125
    move-result-object v4

    .line 126
    invoke-virtual {v3, v0, v4, v2}, Lcom/google/android/gms/internal/ads/zzbug;->zza(Landroid/content/Context;LH6/a;Lcom/google/android/gms/internal/ads/zzfqt;)Lcom/google/android/gms/internal/ads/zzbup;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    goto :goto_2

    .line 131
    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdal;->zzc:Landroid/content/Context;

    .line 132
    .line 133
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzdal;->zzd:Lcom/google/android/gms/internal/ads/zzfqt;

    .line 134
    .line 135
    sget-object v3, LC6/n;->D:LC6/n;

    .line 136
    .line 137
    iget-object v3, v3, LC6/n;->r:Lcom/google/android/gms/internal/ads/zzbug;

    .line 138
    .line 139
    invoke-static {}, LH6/a;->V()LH6/a;

    .line 140
    .line 141
    .line 142
    move-result-object v4

    .line 143
    invoke-virtual {v3, v0, v4, v2}, Lcom/google/android/gms/internal/ads/zzbug;->zzb(Landroid/content/Context;LH6/a;Lcom/google/android/gms/internal/ads/zzfqt;)Lcom/google/android/gms/internal/ads/zzbup;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    :goto_2
    const-string v2, "google.afma.sdkConstants.getSdkConstants"

    .line 148
    .line 149
    sget-object v3, Lcom/google/android/gms/internal/ads/zzbum;->zza:Lcom/google/android/gms/internal/ads/zzbuj;

    .line 150
    .line 151
    invoke-virtual {v0, v2, v3, v3}, Lcom/google/android/gms/internal/ads/zzbup;->zza(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzbui;Lcom/google/android/gms/internal/ads/zzbuh;)Lcom/google/android/gms/internal/ads/zzbuf;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzdal;->zzc:Landroid/content/Context;

    .line 156
    .line 157
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzdal;->zze:LH6/a;

    .line 158
    .line 159
    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzdal;->zzf:Ljava/util/concurrent/Executor;

    .line 160
    .line 161
    new-instance v5, Lcom/google/android/gms/internal/ads/zzcbg;

    .line 162
    .line 163
    invoke-direct {v5, v2, v0, v3, v4}, Lcom/google/android/gms/internal/ads/zzcbg;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzbuf;LH6/a;Ljava/util/concurrent/Executor;)V

    .line 164
    .line 165
    .line 166
    iput-object v5, p0, Lcom/google/android/gms/internal/ads/zzdal;->zza:Lcom/google/android/gms/internal/ads/zzcbd;

    .line 167
    .line 168
    iput-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzdal;->zzg:Z

    .line 169
    .line 170
    :goto_3
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzdal;->zzg:Z

    .line 171
    .line 172
    if-nez v0, :cond_8

    .line 173
    .line 174
    goto :goto_4

    .line 175
    :cond_8
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdal;->zza:Lcom/google/android/gms/internal/ads/zzcbd;

    .line 176
    .line 177
    if-eqz v0, :cond_a

    .line 178
    .line 179
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzcbd;->zzb()Lp8/p;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzdal;->zzh:Z

    .line 184
    .line 185
    if-nez v1, :cond_9

    .line 186
    .line 187
    sget-object v1, Lcom/google/android/gms/internal/ads/zzbkp;->zzi:Lcom/google/android/gms/internal/ads/zzbkh;

    .line 188
    .line 189
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzbkh;->zze()Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v1

    .line 193
    check-cast v1, Ljava/lang/Boolean;

    .line 194
    .line 195
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 196
    .line 197
    .line 198
    move-result v1

    .line 199
    if-eqz v1, :cond_9

    .line 200
    .line 201
    new-instance v1, Lcom/google/android/gms/internal/ads/zzdak;

    .line 202
    .line 203
    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/zzdak;-><init>(Lcom/google/android/gms/internal/ads/zzdal;)V

    .line 204
    .line 205
    .line 206
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzdal;->zzf:Ljava/util/concurrent/Executor;

    .line 207
    .line 208
    invoke-interface {v0, v1, v2}, Lp8/p;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 209
    .line 210
    .line 211
    :cond_9
    const-string v1, "persistFlagsClient"

    .line 212
    .line 213
    sget-object v2, Lcom/google/android/gms/internal/ads/zzcfy;->zzh:Lcom/google/android/gms/internal/ads/zzhcp;

    .line 214
    .line 215
    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzcgb;->zza(Lp8/p;Ljava/lang/String;Ljava/util/concurrent/Executor;)V

    .line 216
    .line 217
    .line 218
    :cond_a
    :goto_4
    return-void
.end method

.method public final zzd(LN6/s;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzdal;->zzc()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final zzdP(Lcom/google/android/gms/internal/ads/zzcbk;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzdal;->zzc()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final zzdQ(Lcom/google/android/gms/internal/ads/zzfky;)V
    .locals 0

    return-void
.end method

.method public final zze(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzdal;->zzc()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final synthetic zzf()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdal;->zzc:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzbii;->zze(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzdal;->zzh:Z

    .line 8
    .line 9
    return-void
.end method
