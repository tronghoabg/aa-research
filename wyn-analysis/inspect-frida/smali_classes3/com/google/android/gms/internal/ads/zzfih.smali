.class public final Lcom/google/android/gms/internal/ads/zzfih;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzimz;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzini;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzini;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzini;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/ads/zzini;Lcom/google/android/gms/internal/ads/zzini;Lcom/google/android/gms/internal/ads/zzini;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfih;->zza:Lcom/google/android/gms/internal/ads/zzini;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzfih;->zzb:Lcom/google/android/gms/internal/ads/zzini;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzfih;->zzc:Lcom/google/android/gms/internal/ads/zzini;

    return-void
.end method

.method public static zzc(Lcom/google/android/gms/internal/ads/zzini;Lcom/google/android/gms/internal/ads/zzini;Lcom/google/android/gms/internal/ads/zzini;)Lcom/google/android/gms/internal/ads/zzfih;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/zzfih;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/ads/zzfih;-><init>(Lcom/google/android/gms/internal/ads/zzini;Lcom/google/android/gms/internal/ads/zzini;Lcom/google/android/gms/internal/ads/zzini;)V

    return-object v0
.end method


# virtual methods
.method public final zza()Lcom/google/android/gms/internal/ads/zzfie;
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfih;->zza:Lcom/google/android/gms/internal/ads/zzini;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzino;->zzb()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/content/Context;

    .line 8
    .line 9
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfih;->zzb:Lcom/google/android/gms/internal/ads/zzini;

    .line 10
    .line 11
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzino;->zzb()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Lcom/google/android/gms/internal/ads/zzfmr;

    .line 16
    .line 17
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzfih;->zzc:Lcom/google/android/gms/internal/ads/zzini;

    .line 18
    .line 19
    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/zzino;->zzb()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Lcom/google/android/gms/internal/ads/zzfnj;

    .line 24
    .line 25
    sget-object v3, Lcom/google/android/gms/internal/ads/zzbix;->zzhs:Lcom/google/android/gms/internal/ads/zzbio;

    .line 26
    .line 27
    sget-object v4, LD6/s;->e:LD6/s;

    .line 28
    .line 29
    iget-object v5, v4, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 30
    .line 31
    invoke-virtual {v5, v3}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    check-cast v3, Ljava/lang/Boolean;

    .line 36
    .line 37
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-eqz v3, :cond_0

    .line 42
    .line 43
    sget-object v3, LC6/n;->D:LC6/n;

    .line 44
    .line 45
    iget-object v3, v3, LC6/n;->h:Lcom/google/android/gms/internal/ads/zzcfk;

    .line 46
    .line 47
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzcfk;->zzp()LG6/N;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    check-cast v3, LG6/O;

    .line 52
    .line 53
    invoke-virtual {v3}, LG6/O;->r()Lcom/google/android/gms/internal/ads/zzcff;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    goto :goto_0

    .line 58
    :cond_0
    sget-object v3, LC6/n;->D:LC6/n;

    .line 59
    .line 60
    iget-object v3, v3, LC6/n;->h:Lcom/google/android/gms/internal/ads/zzcfk;

    .line 61
    .line 62
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzcfk;->zzp()LG6/N;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    check-cast v3, LG6/O;

    .line 67
    .line 68
    iget-object v5, v3, LG6/O;->a:Ljava/lang/Object;

    .line 69
    .line 70
    monitor-enter v5

    .line 71
    :try_start_0
    iget-object v3, v3, LG6/O;->n:Lcom/google/android/gms/internal/ads/zzcff;

    .line 72
    .line 73
    monitor-exit v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 74
    :goto_0
    const/4 v5, 0x0

    .line 75
    if-eqz v3, :cond_1

    .line 76
    .line 77
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzcff;->zzi()Z

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    if-eqz v3, :cond_1

    .line 82
    .line 83
    const/4 v5, 0x1

    .line 84
    :cond_1
    sget-object v3, Lcom/google/android/gms/internal/ads/zzbix;->zzhu:Lcom/google/android/gms/internal/ads/zzbio;

    .line 85
    .line 86
    iget-object v6, v4, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 87
    .line 88
    invoke-virtual {v6, v3}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    check-cast v3, Ljava/lang/Integer;

    .line 93
    .line 94
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 95
    .line 96
    .line 97
    move-result v3

    .line 98
    if-lez v3, :cond_3

    .line 99
    .line 100
    sget-object v3, Lcom/google/android/gms/internal/ads/zzbix;->zzhr:Lcom/google/android/gms/internal/ads/zzbio;

    .line 101
    .line 102
    iget-object v4, v4, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 103
    .line 104
    invoke-virtual {v4, v3}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    check-cast v3, Ljava/lang/Boolean;

    .line 109
    .line 110
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 111
    .line 112
    .line 113
    move-result v3

    .line 114
    if-eqz v3, :cond_2

    .line 115
    .line 116
    if-eqz v5, :cond_3

    .line 117
    .line 118
    :cond_2
    new-instance v3, Lcom/google/android/gms/internal/ads/zzfhg;

    .line 119
    .line 120
    invoke-direct {v3}, Lcom/google/android/gms/internal/ads/zzfhg;-><init>()V

    .line 121
    .line 122
    .line 123
    sget-object v4, Lcom/google/android/gms/internal/ads/zzfmz;->zza:Lcom/google/android/gms/internal/ads/zzfmz;

    .line 124
    .line 125
    new-instance v5, Lcom/google/android/gms/internal/ads/zzfhh;

    .line 126
    .line 127
    invoke-direct {v5, v3}, Lcom/google/android/gms/internal/ads/zzfhh;-><init>(Lcom/google/android/gms/internal/ads/zzfie;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v2, v4, v0, v1, v5}, Lcom/google/android/gms/internal/ads/zzfnj;->zza(Lcom/google/android/gms/internal/ads/zzfmz;Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzfmr;Lcom/google/android/gms/internal/ads/zzfno;)Lcom/google/android/gms/internal/ads/zzfni;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    new-instance v1, Lcom/google/android/gms/internal/ads/zzfhl;

    .line 135
    .line 136
    new-instance v2, Lcom/google/android/gms/internal/ads/zzfhv;

    .line 137
    .line 138
    new-instance v3, Lcom/google/android/gms/internal/ads/zzfhu;

    .line 139
    .line 140
    invoke-direct {v3}, Lcom/google/android/gms/internal/ads/zzfhu;-><init>()V

    .line 141
    .line 142
    .line 143
    invoke-direct {v2, v3}, Lcom/google/android/gms/internal/ads/zzfhv;-><init>(Lcom/google/android/gms/internal/ads/zzfie;)V

    .line 144
    .line 145
    .line 146
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzfni;->zza:Lcom/google/android/gms/internal/ads/zzfmv;

    .line 147
    .line 148
    move-object v4, v3

    .line 149
    new-instance v3, Lcom/google/android/gms/internal/ads/zzfhr;

    .line 150
    .line 151
    sget-object v6, Lcom/google/android/gms/internal/ads/zzcfy;->zza:Lcom/google/android/gms/internal/ads/zzhcp;

    .line 152
    .line 153
    invoke-direct {v3, v4, v6}, Lcom/google/android/gms/internal/ads/zzfhr;-><init>(Lcom/google/android/gms/internal/ads/zzfmv;Ljava/util/concurrent/Executor;)V

    .line 154
    .line 155
    .line 156
    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzfni;->zzb:Lcom/google/android/gms/internal/ads/zzfnr;

    .line 157
    .line 158
    invoke-interface {v4}, Lcom/google/android/gms/internal/ads/zzfmv;->zze()Lcom/google/android/gms/internal/ads/zzfnc;

    .line 159
    .line 160
    .line 161
    move-result-object v4

    .line 162
    iget-object v5, v4, Lcom/google/android/gms/internal/ads/zzfnc;->zzf:Ljava/lang/String;

    .line 163
    .line 164
    move-object v4, v0

    .line 165
    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/ads/zzfhl;-><init>(Lcom/google/android/gms/internal/ads/zzfie;Lcom/google/android/gms/internal/ads/zzfie;Lcom/google/android/gms/internal/ads/zzfnr;Ljava/lang/String;Ljava/util/concurrent/Executor;)V

    .line 166
    .line 167
    .line 168
    return-object v1

    .line 169
    :cond_3
    new-instance v0, Lcom/google/android/gms/internal/ads/zzfhu;

    .line 170
    .line 171
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzfhu;-><init>()V

    .line 172
    .line 173
    .line 174
    return-object v0

    .line 175
    :catchall_0
    move-exception v0

    .line 176
    :try_start_1
    monitor-exit v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 177
    throw v0
.end method

.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzfih;->zza()Lcom/google/android/gms/internal/ads/zzfie;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
