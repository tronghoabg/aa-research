.class public abstract Lcom/google/android/gms/internal/ads/zzceh;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static zzi:Lcom/google/android/gms/internal/ads/zzceh;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static declared-synchronized zzb(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/zzceh;
    .locals 5

    .line 1
    const-class v0, Lcom/google/android/gms/internal/ads/zzceh;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lcom/google/android/gms/internal/ads/zzceh;->zzi:Lcom/google/android/gms/internal/ads/zzceh;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    monitor-exit v0

    .line 9
    return-object v1

    .line 10
    :cond_0
    :try_start_1
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzbix;->zza(Landroid/content/Context;)V

    .line 15
    .line 16
    .line 17
    sget-object v1, LC6/n;->D:LC6/n;

    .line 18
    .line 19
    iget-object v2, v1, LC6/n;->h:Lcom/google/android/gms/internal/ads/zzcfk;

    .line 20
    .line 21
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzcfk;->zzp()LG6/N;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    check-cast v2, LG6/O;

    .line 26
    .line 27
    invoke-virtual {v2, p0}, LG6/O;->n(Landroid/content/Context;)V

    .line 28
    .line 29
    .line 30
    new-instance v3, Lcom/google/android/gms/internal/ads/zzceb;

    .line 31
    .line 32
    const/4 v4, 0x0

    .line 33
    invoke-direct {v3, v4}, Lcom/google/android/gms/internal/ads/zzceb;-><init>([B)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v3, p0}, Lcom/google/android/gms/internal/ads/zzceb;->zza(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/zzceb;

    .line 37
    .line 38
    .line 39
    iget-object p0, v1, LC6/n;->k:Ln7/b;

    .line 40
    .line 41
    invoke-virtual {v3, p0}, Lcom/google/android/gms/internal/ads/zzceb;->zzb(Ln7/a;)Lcom/google/android/gms/internal/ads/zzceb;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/ads/zzceb;->zzc(LG6/N;)Lcom/google/android/gms/internal/ads/zzceb;

    .line 45
    .line 46
    .line 47
    iget-object p0, v1, LC6/n;->z:Lcom/google/android/gms/internal/ads/zzceg;

    .line 48
    .line 49
    invoke-virtual {v3, p0}, Lcom/google/android/gms/internal/ads/zzceb;->zzd(Lcom/google/android/gms/internal/ads/zzceg;)Lcom/google/android/gms/internal/ads/zzceb;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzceb;->zze()Lcom/google/android/gms/internal/ads/zzceh;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    sput-object p0, Lcom/google/android/gms/internal/ads/zzceh;->zzi:Lcom/google/android/gms/internal/ads/zzceh;

    .line 57
    .line 58
    check-cast p0, Lcom/google/android/gms/internal/ads/zzcec;

    .line 59
    .line 60
    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzcec;->zzc:Lcom/google/android/gms/internal/ads/zzini;

    .line 61
    .line 62
    invoke-interface {p0}, Lcom/google/android/gms/internal/ads/zzino;->zzb()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    check-cast p0, Lcom/google/android/gms/internal/ads/zzcdv;

    .line 67
    .line 68
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzcdv;->zza()V

    .line 69
    .line 70
    .line 71
    sget-object p0, Lcom/google/android/gms/internal/ads/zzceh;->zzi:Lcom/google/android/gms/internal/ads/zzceh;

    .line 72
    .line 73
    check-cast p0, Lcom/google/android/gms/internal/ads/zzcec;

    .line 74
    .line 75
    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzcec;->zzh:Lcom/google/android/gms/internal/ads/zzini;

    .line 76
    .line 77
    invoke-interface {p0}, Lcom/google/android/gms/internal/ads/zzino;->zzb()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    check-cast p0, Lcom/google/android/gms/internal/ads/zzcem;

    .line 82
    .line 83
    sget-object v1, Lcom/google/android/gms/internal/ads/zzbix;->zzbk:Lcom/google/android/gms/internal/ads/zzbio;

    .line 84
    .line 85
    sget-object v2, LD6/s;->e:LD6/s;

    .line 86
    .line 87
    iget-object v3, v2, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 88
    .line 89
    invoke-virtual {v3, v1}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    check-cast v1, Ljava/lang/Boolean;

    .line 94
    .line 95
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    if-nez v1, :cond_1

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_1
    sget-object v1, Lcom/google/android/gms/internal/ads/zzbix;->zzbl:Lcom/google/android/gms/internal/ads/zzbio;

    .line 103
    .line 104
    iget-object v2, v2, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 105
    .line 106
    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    check-cast v1, Ljava/lang/String;

    .line 111
    .line 112
    invoke-static {v1}, LG6/U;->P(Ljava/lang/String;)Ljava/util/HashMap;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    invoke-virtual {v1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 125
    .line 126
    .line 127
    move-result v3

    .line 128
    if-eqz v3, :cond_2

    .line 129
    .line 130
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v3

    .line 134
    check-cast v3, Ljava/lang/String;

    .line 135
    .line 136
    invoke-virtual {p0, v3}, Lcom/google/android/gms/internal/ads/zzcem;->zzb(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    goto :goto_0

    .line 140
    :catchall_0
    move-exception p0

    .line 141
    goto :goto_2

    .line 142
    :cond_2
    new-instance v2, Lcom/google/android/gms/internal/ads/zzcel;

    .line 143
    .line 144
    invoke-direct {v2, p0, v1}, Lcom/google/android/gms/internal/ads/zzcel;-><init>(Lcom/google/android/gms/internal/ads/zzcem;Ljava/util/Map;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {p0, v2}, Lcom/google/android/gms/internal/ads/zzcem;->zza(Lcom/google/android/gms/internal/ads/zzcek;)V

    .line 148
    .line 149
    .line 150
    :goto_1
    sget-object p0, Lcom/google/android/gms/internal/ads/zzceh;->zzi:Lcom/google/android/gms/internal/ads/zzceh;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 151
    .line 152
    monitor-exit v0

    .line 153
    return-object p0

    .line 154
    :goto_2
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 155
    throw p0
.end method


# virtual methods
.method public abstract zza()Lcom/google/android/gms/internal/ads/zzcdz;
.end method
