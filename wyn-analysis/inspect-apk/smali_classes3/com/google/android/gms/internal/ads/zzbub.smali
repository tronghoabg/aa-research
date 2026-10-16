.class public final Lcom/google/android/gms/internal/ads/zzbub;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final zza:Ljava/lang/Object;

.field private final zzb:Landroid/content/Context;

.field private final zzc:Ljava/lang/String;

.field private final zzd:LH6/a;

.field private final zze:Lcom/google/android/gms/internal/ads/zzfqt;

.field private final zzf:LG6/r;

.field private final zzg:LG6/r;

.field private zzh:Lcom/google/android/gms/internal/ads/zzbua;

.field private zzi:I


# direct methods
.method public constructor <init>(Landroid/content/Context;LH6/a;Ljava/lang/String;LG6/r;LG6/r;Lcom/google/android/gms/internal/ads/zzfqt;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzbub;->zza:Ljava/lang/Object;

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzbub;->zzi:I

    .line 13
    .line 14
    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzbub;->zzc:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbub;->zzb:Landroid/content/Context;

    .line 21
    .line 22
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzbub;->zzd:LH6/a;

    .line 23
    .line 24
    iput-object p6, p0, Lcom/google/android/gms/internal/ads/zzbub;->zze:Lcom/google/android/gms/internal/ads/zzfqt;

    .line 25
    .line 26
    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzbub;->zzf:LG6/r;

    .line 27
    .line 28
    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzbub;->zzg:LG6/r;

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/ads/zzbaw;)Lcom/google/android/gms/internal/ads/zzbua;
    .locals 4

    .line 1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbub;->zzb:Landroid/content/Context;

    .line 2
    .line 3
    const/4 v0, 0x6

    .line 4
    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ads/u;->a(Landroid/content/Context;I)Lcom/google/android/gms/internal/ads/zzfqg;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzfqg;->zza()Lcom/google/android/gms/internal/ads/zzfqg;

    .line 9
    .line 10
    .line 11
    new-instance v0, Lcom/google/android/gms/internal/ads/zzbua;

    .line 12
    .line 13
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbub;->zzg:LG6/r;

    .line 14
    .line 15
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzbua;-><init>(LG6/r;)V

    .line 16
    .line 17
    .line 18
    const-string v1, "loadJavascriptEngine > Before UI_THREAD_EXECUTOR"

    .line 19
    .line 20
    invoke-static {v1}, LG6/L;->k(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sget-object v1, Lcom/google/android/gms/internal/ads/zzcfy;->zzf:Lcom/google/android/gms/internal/ads/zzhcp;

    .line 24
    .line 25
    new-instance v2, Lcom/google/android/gms/internal/ads/zzbtr;

    .line 26
    .line 27
    const/4 v3, 0x0

    .line 28
    invoke-direct {v2, p0, v3, v0}, Lcom/google/android/gms/internal/ads/zzbtr;-><init>(Lcom/google/android/gms/internal/ads/zzbub;Lcom/google/android/gms/internal/ads/zzbaw;Lcom/google/android/gms/internal/ads/zzbua;)V

    .line 29
    .line 30
    .line 31
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 32
    .line 33
    .line 34
    const-string v1, "loadNewJavascriptEngine: Promise created"

    .line 35
    .line 36
    invoke-static {v1}, LG6/L;->k(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    new-instance v1, Lcom/google/android/gms/internal/ads/zzbtk;

    .line 40
    .line 41
    invoke-direct {v1, p0, v0, p1}, Lcom/google/android/gms/internal/ads/zzbtk;-><init>(Lcom/google/android/gms/internal/ads/zzbub;Lcom/google/android/gms/internal/ads/zzbua;Lcom/google/android/gms/internal/ads/zzfqg;)V

    .line 42
    .line 43
    .line 44
    new-instance v2, Lcom/google/android/gms/internal/ads/zzbtl;

    .line 45
    .line 46
    invoke-direct {v2, p0, v0, p1}, Lcom/google/android/gms/internal/ads/zzbtl;-><init>(Lcom/google/android/gms/internal/ads/zzbub;Lcom/google/android/gms/internal/ads/zzbua;Lcom/google/android/gms/internal/ads/zzfqg;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzcgk;->zze(Lcom/google/android/gms/internal/ads/zzcgh;Lcom/google/android/gms/internal/ads/zzcgf;)V

    .line 50
    .line 51
    .line 52
    return-object v0
.end method

.method public final zzb(Lcom/google/android/gms/internal/ads/zzbaw;)Lcom/google/android/gms/internal/ads/zzbtv;
    .locals 4

    .line 1
    const-string p1, "getEngine: Trying to acquire lock"

    .line 2
    .line 3
    invoke-static {p1}, LG6/L;->k(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbub;->zza:Ljava/lang/Object;

    .line 7
    .line 8
    monitor-enter p1

    .line 9
    :try_start_0
    const-string v0, "getEngine: Lock acquired"

    .line 10
    .line 11
    invoke-static {v0}, LG6/L;->k(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-string v0, "refreshIfDestroyed: Trying to acquire lock"

    .line 15
    .line 16
    invoke-static {v0}, LG6/L;->k(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    monitor-enter p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 20
    :try_start_1
    const-string v0, "refreshIfDestroyed: Lock acquired"

    .line 21
    .line 22
    invoke-static {v0}, LG6/L;->k(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbub;->zzh:Lcom/google/android/gms/internal/ads/zzbua;

    .line 26
    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    iget v1, p0, Lcom/google/android/gms/internal/ads/zzbub;->zzi:I

    .line 30
    .line 31
    if-nez v1, :cond_0

    .line 32
    .line 33
    new-instance v1, Lcom/google/android/gms/internal/ads/zzbtn;

    .line 34
    .line 35
    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ads/zzbtn;-><init>(Lcom/google/android/gms/internal/ads/zzbub;)V

    .line 36
    .line 37
    .line 38
    sget-object v2, Lcom/google/android/gms/internal/ads/zzbto;->zza:Lcom/google/android/gms/internal/ads/zzbto;

    .line 39
    .line 40
    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzcgk;->zze(Lcom/google/android/gms/internal/ads/zzcgh;Lcom/google/android/gms/internal/ads/zzcgf;)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :catchall_0
    move-exception v0

    .line 45
    goto :goto_2

    .line 46
    :cond_0
    :goto_0
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 47
    :try_start_2
    const-string v0, "refreshIfDestroyed: Lock released"

    .line 48
    .line 49
    invoke-static {v0}, LG6/L;->k(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbub;->zzh:Lcom/google/android/gms/internal/ads/zzbua;

    .line 53
    .line 54
    const/4 v1, 0x0

    .line 55
    const/4 v2, 0x2

    .line 56
    if-eqz v0, :cond_4

    .line 57
    .line 58
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzcgk;->zzi()I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    const/4 v3, -0x1

    .line 63
    if-ne v0, v3, :cond_1

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_1
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbub;->zzi:I

    .line 67
    .line 68
    if-nez v0, :cond_2

    .line 69
    .line 70
    const-string v0, "getEngine (NO_UPDATE): Lock released"

    .line 71
    .line 72
    invoke-static {v0}, LG6/L;->k(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbub;->zzh:Lcom/google/android/gms/internal/ads/zzbua;

    .line 76
    .line 77
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbua;->zza()Lcom/google/android/gms/internal/ads/zzbtv;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    monitor-exit p1

    .line 82
    return-object v0

    .line 83
    :catchall_1
    move-exception v0

    .line 84
    goto :goto_3

    .line 85
    :cond_2
    const/4 v3, 0x1

    .line 86
    if-ne v0, v3, :cond_3

    .line 87
    .line 88
    iput v2, p0, Lcom/google/android/gms/internal/ads/zzbub;->zzi:I

    .line 89
    .line 90
    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/ads/zzbub;->zza(Lcom/google/android/gms/internal/ads/zzbaw;)Lcom/google/android/gms/internal/ads/zzbua;

    .line 91
    .line 92
    .line 93
    const-string v0, "getEngine (PENDING_UPDATE): Lock released"

    .line 94
    .line 95
    invoke-static {v0}, LG6/L;->k(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbub;->zzh:Lcom/google/android/gms/internal/ads/zzbua;

    .line 99
    .line 100
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbua;->zza()Lcom/google/android/gms/internal/ads/zzbtv;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    monitor-exit p1

    .line 105
    return-object v0

    .line 106
    :cond_3
    const-string v0, "getEngine (UPDATING): Lock released"

    .line 107
    .line 108
    invoke-static {v0}, LG6/L;->k(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbub;->zzh:Lcom/google/android/gms/internal/ads/zzbua;

    .line 112
    .line 113
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbua;->zza()Lcom/google/android/gms/internal/ads/zzbtv;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    monitor-exit p1

    .line 118
    return-object v0

    .line 119
    :cond_4
    :goto_1
    iput v2, p0, Lcom/google/android/gms/internal/ads/zzbub;->zzi:I

    .line 120
    .line 121
    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/ads/zzbub;->zza(Lcom/google/android/gms/internal/ads/zzbaw;)Lcom/google/android/gms/internal/ads/zzbua;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzbub;->zzh:Lcom/google/android/gms/internal/ads/zzbua;

    .line 126
    .line 127
    const-string v0, "getEngine (NULL or REJECTED): Lock released"

    .line 128
    .line 129
    invoke-static {v0}, LG6/L;->k(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbub;->zzh:Lcom/google/android/gms/internal/ads/zzbua;

    .line 133
    .line 134
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbua;->zza()Lcom/google/android/gms/internal/ads/zzbtv;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    monitor-exit p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 139
    return-object v0

    .line 140
    :goto_2
    :try_start_3
    monitor-exit p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 141
    :try_start_4
    throw v0

    .line 142
    :goto_3
    monitor-exit p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 143
    throw v0
.end method

.method public final zzc()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbub;->zzh:Lcom/google/android/gms/internal/ads/zzbua;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbua;->zzc()V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzbub;->zzh:Lcom/google/android/gms/internal/ads/zzbua;

    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final zzd(Lcom/google/android/gms/internal/ads/zzbaw;Lcom/google/android/gms/internal/ads/zzbua;)V
    .locals 10

    .line 1
    sget-object p1, LC6/n;->D:LC6/n;

    .line 2
    .line 3
    iget-object p1, p1, LC6/n;->k:Ln7/b;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 9
    .line 10
    .line 11
    move-result-wide v2

    .line 12
    new-instance v4, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 15
    .line 16
    .line 17
    :try_start_0
    const-string p1, "loadJavascriptEngine > Before createJavascriptEngine"

    .line 18
    .line 19
    invoke-static {p1}, LG6/L;->k(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbub;->zzb:Landroid/content/Context;

    .line 23
    .line 24
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbub;->zzd:LH6/a;

    .line 25
    .line 26
    new-instance v5, Lcom/google/android/gms/internal/ads/zzbte;

    .line 27
    .line 28
    const/4 v7, 0x0

    .line 29
    invoke-direct {v5, p1, v0, v7, v7}, Lcom/google/android/gms/internal/ads/zzbte;-><init>(Landroid/content/Context;LH6/a;Lcom/google/android/gms/internal/ads/zzbaw;LC6/a;)V

    .line 30
    .line 31
    .line 32
    const-string p1, "loadJavascriptEngine > After createJavascriptEngine"

    .line 33
    .line 34
    invoke-static {p1}, LG6/L;->k(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    .line 36
    .line 37
    const-string p1, "loadJavascriptEngine > Before setting new engine loaded listener"

    .line 38
    .line 39
    invoke-static {p1}, LG6/L;->k(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    new-instance v0, Lcom/google/android/gms/internal/ads/zzbtp;

    .line 43
    .line 44
    move-wide v8, v2

    .line 45
    move-object v2, v4

    .line 46
    move-wide v3, v8

    .line 47
    move-object v1, p0

    .line 48
    move-object v6, v5

    .line 49
    move-object v5, p2

    .line 50
    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/ads/zzbtp;-><init>(Lcom/google/android/gms/internal/ads/zzbub;Ljava/util/ArrayList;JLcom/google/android/gms/internal/ads/zzbua;Lcom/google/android/gms/internal/ads/zzbsw;)V

    .line 51
    .line 52
    .line 53
    move-object p1, v2

    .line 54
    move-object v2, v5

    .line 55
    move-object v5, v6

    .line 56
    invoke-interface {v5, v0}, Lcom/google/android/gms/internal/ads/zzbsw;->zzi(Lcom/google/android/gms/internal/ads/zzbsv;)V

    .line 57
    .line 58
    .line 59
    const-string p2, "loadJavascriptEngine > Before registering GmsgHandler for /jsLoaded"

    .line 60
    .line 61
    invoke-static {p2}, LG6/L;->k(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    new-instance v0, Lcom/google/android/gms/internal/ads/zzbtg;

    .line 65
    .line 66
    move-object v4, v2

    .line 67
    move-wide v2, v8

    .line 68
    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/zzbtg;-><init>(Lcom/google/android/gms/internal/ads/zzbub;JLcom/google/android/gms/internal/ads/zzbua;Lcom/google/android/gms/internal/ads/zzbsw;)V

    .line 69
    .line 70
    .line 71
    move-object v2, v4

    .line 72
    move-wide v3, v8

    .line 73
    const-string p2, "/jsLoaded"

    .line 74
    .line 75
    invoke-interface {v5, p2, v0}, Lcom/google/android/gms/internal/ads/zzbuc;->zzm(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzbpx;)V

    .line 76
    .line 77
    .line 78
    new-instance p2, LG6/D;

    .line 79
    .line 80
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 81
    .line 82
    .line 83
    new-instance v0, Lcom/google/android/gms/internal/ads/zzbth;

    .line 84
    .line 85
    invoke-direct {v0, p0, v7, v5, p2}, Lcom/google/android/gms/internal/ads/zzbth;-><init>(Lcom/google/android/gms/internal/ads/zzbub;Lcom/google/android/gms/internal/ads/zzbaw;Lcom/google/android/gms/internal/ads/zzbsw;LG6/D;)V

    .line 86
    .line 87
    .line 88
    iput-object v0, p2, LG6/D;->a:Ljava/lang/Object;

    .line 89
    .line 90
    const-string p2, "loadJavascriptEngine > Before registering GmsgHandler for /requestReload"

    .line 91
    .line 92
    invoke-static {p2}, LG6/L;->k(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    sget-object p2, Lcom/google/android/gms/internal/ads/zzbkx;->zzd:Lcom/google/android/gms/internal/ads/zzbkh;

    .line 96
    .line 97
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzbkh;->zze()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object p2

    .line 101
    check-cast p2, Ljava/lang/Boolean;

    .line 102
    .line 103
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 104
    .line 105
    .line 106
    move-result p2

    .line 107
    if-eqz p2, :cond_0

    .line 108
    .line 109
    iget-object p2, v1, Lcom/google/android/gms/internal/ads/zzbub;->zzb:Landroid/content/Context;

    .line 110
    .line 111
    invoke-virtual {p2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p2

    .line 115
    const-string v6, "com.google.android.gms"

    .line 116
    .line 117
    invoke-static {p2, v6}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 118
    .line 119
    .line 120
    move-result p2

    .line 121
    if-eqz p2, :cond_1

    .line 122
    .line 123
    :cond_0
    const-string p2, "/requestReload"

    .line 124
    .line 125
    invoke-interface {v5, p2, v0}, Lcom/google/android/gms/internal/ads/zzbuc;->zzm(Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzbpx;)V

    .line 126
    .line 127
    .line 128
    :cond_1
    iget-object p2, v1, Lcom/google/android/gms/internal/ads/zzbub;->zzc:Ljava/lang/String;

    .line 129
    .line 130
    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    const-string v6, "loadJavascriptEngine > javascriptPath: "

    .line 135
    .line 136
    invoke-virtual {v6, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    invoke-static {v0}, LG6/L;->k(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    const-string v0, ".js"

    .line 144
    .line 145
    invoke-virtual {p2, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 146
    .line 147
    .line 148
    move-result v0

    .line 149
    if-eqz v0, :cond_2

    .line 150
    .line 151
    const-string v0, "loadJavascriptEngine > Before newEngine.loadJavascript"

    .line 152
    .line 153
    invoke-static {v0}, LG6/L;->k(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    invoke-interface {v5, p2}, Lcom/google/android/gms/internal/ads/zzbsw;->zzf(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    const-string p2, "loadJavascriptEngine > After newEngine.loadJavascript"

    .line 160
    .line 161
    invoke-static {p2}, LG6/L;->k(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    goto :goto_0

    .line 165
    :cond_2
    const-string v0, "<html>"

    .line 166
    .line 167
    invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 168
    .line 169
    .line 170
    move-result v0

    .line 171
    if-eqz v0, :cond_3

    .line 172
    .line 173
    const-string v0, "loadJavascriptEngine > Before newEngine.loadHtml"

    .line 174
    .line 175
    invoke-static {v0}, LG6/L;->k(Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    invoke-interface {v5, p2}, Lcom/google/android/gms/internal/ads/zzbsw;->zzh(Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    const-string p2, "loadJavascriptEngine > After newEngine.loadHtml"

    .line 182
    .line 183
    invoke-static {p2}, LG6/L;->k(Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    goto :goto_0

    .line 187
    :cond_3
    const-string v0, "loadJavascriptEngine > Before newEngine.loadHtmlWrapper"

    .line 188
    .line 189
    invoke-static {v0}, LG6/L;->k(Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    invoke-interface {v5, p2}, Lcom/google/android/gms/internal/ads/zzbsw;->zzg(Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    const-string p2, "loadJavascriptEngine > After newEngine.loadHtmlWrapper"

    .line 196
    .line 197
    invoke-static {p2}, LG6/L;->k(Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    :goto_0
    const-string p2, "loadJavascriptEngine > Before calling ADMOB_UI_HANDLER.postDelayed"

    .line 201
    .line 202
    invoke-static {p2}, LG6/L;->k(Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    sget-object p2, LG6/U;->l:LG6/M;

    .line 206
    .line 207
    new-instance v0, Lcom/google/android/gms/internal/ads/zzbtj;

    .line 208
    .line 209
    move-wide v8, v3

    .line 210
    move-object v3, v5

    .line 211
    move-wide v5, v8

    .line 212
    move-object v4, p1

    .line 213
    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/internal/ads/zzbtj;-><init>(Lcom/google/android/gms/internal/ads/zzbub;Lcom/google/android/gms/internal/ads/zzbua;Lcom/google/android/gms/internal/ads/zzbsw;Ljava/util/ArrayList;J)V

    .line 214
    .line 215
    .line 216
    sget-object p1, Lcom/google/android/gms/internal/ads/zzbix;->zze:Lcom/google/android/gms/internal/ads/zzbio;

    .line 217
    .line 218
    sget-object v1, LD6/s;->e:LD6/s;

    .line 219
    .line 220
    iget-object v1, v1, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 221
    .line 222
    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object p1

    .line 226
    check-cast p1, Ljava/lang/Integer;

    .line 227
    .line 228
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 229
    .line 230
    .line 231
    move-result p1

    .line 232
    int-to-long v1, p1

    .line 233
    invoke-virtual {p2, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 234
    .line 235
    .line 236
    return-void

    .line 237
    :catchall_0
    move-exception v0

    .line 238
    move-object v2, p2

    .line 239
    move-object p1, v0

    .line 240
    sget p2, LG6/L;->b:I

    .line 241
    .line 242
    const-string p2, "Error creating webview."

    .line 243
    .line 244
    invoke-static {p2, p1}, LH6/l;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 245
    .line 246
    .line 247
    sget-object p2, Lcom/google/android/gms/internal/ads/zzbix;->zziL:Lcom/google/android/gms/internal/ads/zzbio;

    .line 248
    .line 249
    sget-object v0, LD6/s;->e:LD6/s;

    .line 250
    .line 251
    iget-object v1, v0, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 252
    .line 253
    invoke-virtual {v1, p2}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object p2

    .line 257
    check-cast p2, Ljava/lang/Boolean;

    .line 258
    .line 259
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 260
    .line 261
    .line 262
    move-result p2

    .line 263
    if-eqz p2, :cond_4

    .line 264
    .line 265
    const-string p2, "SdkJavascriptFactory.loadJavascriptEngine.createJavascriptEngine"

    .line 266
    .line 267
    invoke-virtual {v2, p1, p2}, Lcom/google/android/gms/internal/ads/zzcgk;->zzh(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 268
    .line 269
    .line 270
    return-void

    .line 271
    :cond_4
    sget-object p2, Lcom/google/android/gms/internal/ads/zzbix;->zziN:Lcom/google/android/gms/internal/ads/zzbio;

    .line 272
    .line 273
    iget-object v0, v0, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 274
    .line 275
    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object p2

    .line 279
    check-cast p2, Ljava/lang/Boolean;

    .line 280
    .line 281
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 282
    .line 283
    .line 284
    move-result p2

    .line 285
    const-string v0, "SdkJavascriptFactory.loadJavascriptEngine"

    .line 286
    .line 287
    if-eqz p2, :cond_5

    .line 288
    .line 289
    sget-object p2, LC6/n;->D:LC6/n;

    .line 290
    .line 291
    iget-object p2, p2, LC6/n;->h:Lcom/google/android/gms/internal/ads/zzcfk;

    .line 292
    .line 293
    invoke-virtual {p2, p1, v0}, Lcom/google/android/gms/internal/ads/zzcfk;->zzi(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 294
    .line 295
    .line 296
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzcgk;->zzg()V

    .line 297
    .line 298
    .line 299
    return-void

    .line 300
    :cond_5
    sget-object p2, LC6/n;->D:LC6/n;

    .line 301
    .line 302
    iget-object p2, p2, LC6/n;->h:Lcom/google/android/gms/internal/ads/zzcfk;

    .line 303
    .line 304
    invoke-virtual {p2, p1, v0}, Lcom/google/android/gms/internal/ads/zzcfk;->zzh(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 305
    .line 306
    .line 307
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzcgk;->zzg()V

    .line 308
    .line 309
    .line 310
    return-void
.end method

.method public final synthetic zze(Lcom/google/android/gms/internal/ads/zzbsw;)V
    .locals 0

    .line 1
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzbsw;->zzk()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzbub;->zzi:I

    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public final zzf(Lcom/google/android/gms/internal/ads/zzbua;Lcom/google/android/gms/internal/ads/zzbsw;Ljava/util/ArrayList;J)V
    .locals 10

    .line 1
    const-string v0, "loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Trying to acquire lock"

    .line 2
    .line 3
    invoke-static {v0}, LG6/L;->k(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbub;->zza:Ljava/lang/Object;

    .line 7
    .line 8
    const-string v1, " ms. Rejecting."

    .line 9
    .line 10
    const-string v2, " ms. Total latency(onEngLoadedTimeout) is "

    .line 11
    .line 12
    const-string v3, ". LoadNewJavascriptEngine(onEngLoadedTimeout) latency is "

    .line 13
    .line 14
    const-string v4, ". Update status(onEngLoadedTimeout) is "

    .line 15
    .line 16
    const-string v5, " ms. JS engine session reference status(onEngLoadedTimeout) is "

    .line 17
    .line 18
    const-string v6, "Could not receive /jsLoaded in "

    .line 19
    .line 20
    monitor-enter v0

    .line 21
    :try_start_0
    const-string v7, "loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock acquired"

    .line 22
    .line 23
    invoke-static {v7}, LG6/L;->k(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzcgk;->zzi()I

    .line 27
    .line 28
    .line 29
    move-result v7

    .line 30
    const/4 v8, -0x1

    .line 31
    if-eq v7, v8, :cond_2

    .line 32
    .line 33
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzcgk;->zzi()I

    .line 34
    .line 35
    .line 36
    move-result v7

    .line 37
    const/4 v8, 0x1

    .line 38
    if-ne v7, v8, :cond_0

    .line 39
    .line 40
    goto/16 :goto_1

    .line 41
    .line 42
    :cond_0
    sget-object v7, Lcom/google/android/gms/internal/ads/zzbix;->zziL:Lcom/google/android/gms/internal/ads/zzbio;

    .line 43
    .line 44
    sget-object v8, LD6/s;->e:LD6/s;

    .line 45
    .line 46
    iget-object v9, v8, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 47
    .line 48
    invoke-virtual {v9, v7}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v7

    .line 52
    check-cast v7, Ljava/lang/Boolean;

    .line 53
    .line 54
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 55
    .line 56
    .line 57
    move-result v7

    .line 58
    if-eqz v7, :cond_1

    .line 59
    .line 60
    new-instance v7, Ljava/util/concurrent/TimeoutException;

    .line 61
    .line 62
    const-string v9, "Unable to receive /jsLoaded GMSG."

    .line 63
    .line 64
    invoke-direct {v7, v9}, Ljava/util/concurrent/TimeoutException;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    const-string v9, "SdkJavascriptFactory.loadJavascriptEngine.setLoadedListener"

    .line 68
    .line 69
    invoke-virtual {p1, v7, v9}, Lcom/google/android/gms/internal/ads/zzcgk;->zzh(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :catchall_0
    move-exception p1

    .line 74
    goto/16 :goto_2

    .line 75
    .line 76
    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzcgk;->zzg()V

    .line 77
    .line 78
    .line 79
    :goto_0
    sget-object v7, Lcom/google/android/gms/internal/ads/zzcfy;->zzf:Lcom/google/android/gms/internal/ads/zzhcp;

    .line 80
    .line 81
    invoke-static {p2}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    new-instance v9, Lcom/google/android/gms/internal/ads/zzbtm;

    .line 85
    .line 86
    invoke-direct {v9, p2}, Lcom/google/android/gms/internal/ads/zzbtm;-><init>(Lcom/google/android/gms/internal/ads/zzbsw;)V

    .line 87
    .line 88
    .line 89
    invoke-interface {v7, v9}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 90
    .line 91
    .line 92
    sget-object p2, Lcom/google/android/gms/internal/ads/zzbix;->zzd:Lcom/google/android/gms/internal/ads/zzbio;

    .line 93
    .line 94
    iget-object v7, v8, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 95
    .line 96
    invoke-virtual {v7, p2}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p2

    .line 100
    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p2

    .line 104
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzcgk;->zzi()I

    .line 105
    .line 106
    .line 107
    move-result p1

    .line 108
    iget v7, p0, Lcom/google/android/gms/internal/ads/zzbub;->zzi:I

    .line 109
    .line 110
    const/4 v8, 0x0

    .line 111
    invoke-virtual {p3, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p3

    .line 115
    invoke-static {p3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object p3

    .line 119
    sget-object v8, LC6/n;->D:LC6/n;

    .line 120
    .line 121
    iget-object v8, v8, LC6/n;->k:Ln7/b;

    .line 122
    .line 123
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 127
    .line 128
    .line 129
    move-result-wide v8

    .line 130
    sub-long/2addr v8, p4

    .line 131
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 132
    .line 133
    .line 134
    move-result p4

    .line 135
    add-int/lit8 p4, p4, 0x5e

    .line 136
    .line 137
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object p5

    .line 141
    invoke-virtual {p5}, Ljava/lang/String;->length()I

    .line 142
    .line 143
    .line 144
    move-result p5

    .line 145
    add-int/2addr p4, p5

    .line 146
    add-int/lit8 p4, p4, 0x27

    .line 147
    .line 148
    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object p5

    .line 152
    invoke-virtual {p5}, Ljava/lang/String;->length()I

    .line 153
    .line 154
    .line 155
    move-result p5

    .line 156
    add-int/2addr p4, p5

    .line 157
    add-int/lit8 p4, p4, 0x39

    .line 158
    .line 159
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 160
    .line 161
    .line 162
    move-result p5

    .line 163
    add-int/2addr p4, p5

    .line 164
    add-int/lit8 p4, p4, 0x2a

    .line 165
    .line 166
    invoke-static {v8, v9}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object p5

    .line 170
    invoke-virtual {p5}, Ljava/lang/String;->length()I

    .line 171
    .line 172
    .line 173
    move-result p5

    .line 174
    add-int/2addr p4, p5

    .line 175
    add-int/lit8 p4, p4, 0xf

    .line 176
    .line 177
    new-instance p5, Ljava/lang/StringBuilder;

    .line 178
    .line 179
    invoke-direct {p5, p4}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {p5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    invoke-virtual {p5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    .line 188
    invoke-virtual {p5, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    invoke-virtual {p5, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    invoke-virtual {p5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 195
    .line 196
    .line 197
    invoke-virtual {p5, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 198
    .line 199
    .line 200
    invoke-virtual {p5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 201
    .line 202
    .line 203
    invoke-virtual {p5, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 204
    .line 205
    .line 206
    invoke-virtual {p5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 207
    .line 208
    .line 209
    invoke-virtual {p5, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 210
    .line 211
    .line 212
    invoke-virtual {p5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 213
    .line 214
    .line 215
    invoke-virtual {p5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object p1

    .line 219
    invoke-static {p1}, LG6/L;->k(Ljava/lang/String;)V

    .line 220
    .line 221
    .line 222
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 223
    const-string p1, "loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released"

    .line 224
    .line 225
    invoke-static {p1}, LG6/L;->k(Ljava/lang/String;)V

    .line 226
    .line 227
    .line 228
    return-void

    .line 229
    :cond_2
    :goto_1
    :try_start_1
    const-string p1, "loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released, the promise is already settled"

    .line 230
    .line 231
    invoke-static {p1}, LG6/L;->k(Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    monitor-exit v0

    .line 235
    return-void

    .line 236
    :goto_2
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 237
    throw p1
.end method

.method public final synthetic zzg()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbub;->zza:Ljava/lang/Object;

    return-object v0
.end method

.method public final synthetic zzh()Lcom/google/android/gms/internal/ads/zzfqt;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbub;->zze:Lcom/google/android/gms/internal/ads/zzfqt;

    return-object v0
.end method

.method public final synthetic zzi()Lcom/google/android/gms/internal/ads/zzbua;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbub;->zzh:Lcom/google/android/gms/internal/ads/zzbua;

    return-object v0
.end method

.method public final synthetic zzj(Lcom/google/android/gms/internal/ads/zzbua;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbub;->zzh:Lcom/google/android/gms/internal/ads/zzbua;

    return-void
.end method

.method public final synthetic zzk()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzbub;->zzi:I

    return v0
.end method

.method public final synthetic zzl(I)V
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzbub;->zzi:I

    return-void
.end method
