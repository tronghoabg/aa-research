.class public final LN6/x;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/HashMap;

.field public final b:Ljava/util/HashMap;

.field public final c:Landroid/content/Context;

.field public final d:Lcom/google/android/gms/internal/ads/zzdzy;

.field public final e:Lcom/google/android/gms/internal/ads/zzhcp;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzdzy;Lcom/google/android/gms/internal/ads/zzhcp;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LN6/x;->a:Ljava/util/HashMap;

    .line 10
    .line 11
    new-instance v0, Ljava/util/HashMap;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, LN6/x;->b:Ljava/util/HashMap;

    .line 17
    .line 18
    iput-object p1, p0, LN6/x;->c:Landroid/content/Context;

    .line 19
    .line 20
    iput-object p2, p0, LN6/x;->d:Lcom/google/android/gms/internal/ads/zzdzy;

    .line 21
    .line 22
    iput-object p3, p0, LN6/x;->e:Lcom/google/android/gms/internal/ads/zzhcp;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final declared-synchronized a(Ljava/lang/Object;LQ6/b;)V
    .locals 6

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    new-instance v4, Landroid/util/Pair;

    .line 3
    .line 4
    sget-object v0, LC6/n;->D:LC6/n;

    .line 5
    .line 6
    iget-object v0, v0, LC6/n;->k:Ln7/b;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-direct {v4, p2, v0}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    sget-object p2, Lcom/google/android/gms/internal/ads/zzcfy;->zzf:Lcom/google/android/gms/internal/ads/zzhcp;

    .line 23
    .line 24
    new-instance v0, LA7/w0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 25
    .line 26
    const/16 v1, 0xf

    .line 27
    .line 28
    const/4 v5, 0x0

    .line 29
    move-object v2, p0

    .line 30
    move-object v3, p1

    .line 31
    :try_start_1
    invoke-direct/range {v0 .. v5}, LA7/w0;-><init>(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)V

    .line 32
    .line 33
    .line 34
    invoke-interface {p2, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 35
    .line 36
    .line 37
    monitor-exit p0

    .line 38
    return-void

    .line 39
    :catchall_0
    move-exception v0

    .line 40
    :goto_0
    move-object p1, v0

    .line 41
    goto :goto_1

    .line 42
    :catchall_1
    move-exception v0

    .line 43
    move-object v2, p0

    .line 44
    goto :goto_0

    .line 45
    :goto_1
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 46
    throw p1
.end method

.method public final declared-synchronized b(ZLN6/z;)V
    .locals 9

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, LN6/x;->a:Ljava/util/HashMap;

    .line 3
    .line 4
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    check-cast v2, LN6/z;

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    const/4 v4, 0x1

    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    sget-object v5, LC6/n;->D:LC6/n;

    .line 19
    .line 20
    iget-object v5, v5, LC6/n;->k:Ln7/b;

    .line 21
    .line 22
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 26
    .line 27
    .line 28
    move-result-wide v5

    .line 29
    iget-wide v7, v2, LN6/z;->c:J

    .line 30
    .line 31
    cmp-long v5, v7, v5

    .line 32
    .line 33
    if-gtz v5, :cond_0

    .line 34
    .line 35
    move v5, v4

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    move v5, v3

    .line 38
    :goto_0
    if-nez v5, :cond_1

    .line 39
    .line 40
    iget-object v2, v2, LN6/z;->a:LQ6/a;

    .line 41
    .line 42
    if-eqz v2, :cond_1

    .line 43
    .line 44
    iget-object v2, p2, LN6/z;->a:LQ6/a;

    .line 45
    .line 46
    if-eqz v2, :cond_2

    .line 47
    .line 48
    :cond_1
    invoke-virtual {v0, v1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    :cond_2
    iget-object v0, p2, LN6/z;->a:LQ6/a;

    .line 52
    .line 53
    if-eqz v0, :cond_3

    .line 54
    .line 55
    sget-object v0, Lcom/google/android/gms/internal/ads/zzblc;->zzf:Lcom/google/android/gms/internal/ads/zzbkh;

    .line 56
    .line 57
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbkh;->zze()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    check-cast v0, Ljava/lang/Long;

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :catchall_0
    move-exception p1

    .line 65
    goto :goto_5

    .line 66
    :cond_3
    sget-object v0, Lcom/google/android/gms/internal/ads/zzblc;->zzg:Lcom/google/android/gms/internal/ads/zzbkh;

    .line 67
    .line 68
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbkh;->zze()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    check-cast v0, Ljava/lang/Long;

    .line 73
    .line 74
    :goto_1
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 75
    .line 76
    .line 77
    move-result-wide v5

    .line 78
    iget-object v0, p2, LN6/z;->a:LQ6/a;

    .line 79
    .line 80
    if-nez v0, :cond_4

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_4
    move v4, v3

    .line 84
    :goto_2
    sget-object v0, Lcom/google/android/gms/internal/ads/zzcfy;->zzd:Ljava/util/concurrent/ScheduledExecutorService;

    .line 85
    .line 86
    new-instance v2, LN6/w;

    .line 87
    .line 88
    invoke-direct {v2, p0, p1, v4}, LN6/w;-><init>(LN6/x;ZZ)V

    .line 89
    .line 90
    .line 91
    sget-object p1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 92
    .line 93
    invoke-interface {v0, v2, v5, v6, p1}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 94
    .line 95
    .line 96
    iget-object p1, p0, LN6/x;->b:Ljava/util/HashMap;

    .line 97
    .line 98
    invoke-virtual {p1, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    check-cast v0, Ljava/util/List;

    .line 103
    .line 104
    new-instance v2, Ljava/util/ArrayList;

    .line 105
    .line 106
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p1, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    if-nez v0, :cond_5

    .line 113
    .line 114
    goto :goto_4

    .line 115
    :cond_5
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    if-eqz v0, :cond_6

    .line 124
    .line 125
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    check-cast v0, Landroid/util/Pair;

    .line 130
    .line 131
    invoke-virtual {p0, p2, v0, v3}, LN6/x;->e(LN6/z;Landroid/util/Pair;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 132
    .line 133
    .line 134
    goto :goto_3

    .line 135
    :cond_6
    :goto_4
    monitor-exit p0

    .line 136
    return-void

    .line 137
    :goto_5
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 138
    throw p1
.end method

.method public final c(Z)V
    .locals 3

    .line 1
    iget-object v0, p0, LN6/x;->b:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    new-instance v2, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    new-instance v0, LA7/Y0;

    .line 22
    .line 23
    const/4 v1, 0x2

    .line 24
    invoke-direct {v0, v1, p0, p1}, LA7/Y0;-><init>(ILjava/lang/Object;Z)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, LN6/x;->e:Lcom/google/android/gms/internal/ads/zzhcp;

    .line 28
    .line 29
    invoke-interface {p1, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 30
    .line 31
    .line 32
    :cond_0
    return-void
.end method

.method public final declared-synchronized d(ZZ)V
    .locals 13

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    new-instance v0, Landroid/os/Bundle;

    .line 3
    .line 4
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 5
    .line 6
    .line 7
    const-string v1, "query_info_type"

    .line 8
    .line 9
    const-string v2, "requester_type_6"

    .line 10
    .line 11
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-string v1, "accept_3p_cookie"

    .line 15
    .line 16
    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 17
    .line 18
    .line 19
    iget-object v1, p0, LN6/x;->a:Ljava/util/HashMap;

    .line 20
    .line 21
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    check-cast v3, LN6/z;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 30
    .line 31
    const/4 v4, 0x0

    .line 32
    if-eqz p2, :cond_1

    .line 33
    .line 34
    if-nez v3, :cond_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    :try_start_1
    iget p2, v3, LN6/z;->d:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 38
    .line 39
    add-int/lit8 v4, p2, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :catchall_0
    move-exception v0

    .line 43
    move-object p1, v0

    .line 44
    move-object v2, p0

    .line 45
    goto/16 :goto_4

    .line 46
    .line 47
    :cond_1
    :goto_0
    :try_start_2
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    check-cast p2, LN6/z;

    .line 52
    .line 53
    if-nez p2, :cond_2

    .line 54
    .line 55
    const/4 p2, 0x0

    .line 56
    :goto_1
    move-object v5, p2

    .line 57
    goto :goto_2

    .line 58
    :cond_2
    iget-object p2, p2, LN6/z;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 59
    .line 60
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 61
    .line 62
    .line 63
    move-result p2

    .line 64
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    goto :goto_1

    .line 69
    :goto_2
    iget-object v6, p0, LN6/x;->d:Lcom/google/android/gms/internal/ads/zzdzy;

    .line 70
    .line 71
    new-instance v1, LN6/y;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 72
    .line 73
    move-object v2, p0

    .line 74
    move v3, p1

    .line 75
    :try_start_3
    invoke-direct/range {v1 .. v6}, LN6/y;-><init>(LN6/x;ZILjava/lang/Boolean;Lcom/google/android/gms/internal/ads/zzdzy;)V

    .line 76
    .line 77
    .line 78
    new-instance p1, Lcom/google/android/gms/ads/AdRequest$Builder;

    .line 79
    .line 80
    const/16 p2, 0xe

    .line 81
    .line 82
    invoke-direct {p1, p2}, LA7/B0;-><init>(I)V

    .line 83
    .line 84
    .line 85
    const-class p2, Lcom/google/ads/mediation/admob/AdMobAdapter;

    .line 86
    .line 87
    invoke-virtual {p1, p2, v0}, LA7/B0;->x(Ljava/lang/Class;Landroid/os/Bundle;)LA7/B0;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    check-cast p1, Lcom/google/android/gms/ads/AdRequest$Builder;

    .line 92
    .line 93
    new-instance v10, Lx6/g;

    .line 94
    .line 95
    invoke-direct {v10, p1}, Lx6/g;-><init>(LA7/B0;)V

    .line 96
    .line 97
    .line 98
    sget-object p1, Lcom/google/android/gms/internal/ads/zzbix;->zzmJ:Lcom/google/android/gms/internal/ads/zzbio;

    .line 99
    .line 100
    sget-object p2, LD6/s;->e:LD6/s;

    .line 101
    .line 102
    iget-object p2, p2, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 103
    .line 104
    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    check-cast p1, Ljava/lang/Boolean;

    .line 109
    .line 110
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 111
    .line 112
    .line 113
    move-result p1

    .line 114
    if-eqz p1, :cond_3

    .line 115
    .line 116
    iget-object p1, v2, LN6/x;->e:Lcom/google/android/gms/internal/ads/zzhcp;

    .line 117
    .line 118
    new-instance v7, LA7/z0;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 119
    .line 120
    const/4 v8, 0x4

    .line 121
    const/4 v12, 0x0

    .line 122
    move-object v11, v1

    .line 123
    move-object v9, v2

    .line 124
    :try_start_4
    invoke-direct/range {v7 .. v12}, LA7/z0;-><init>(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 125
    .line 126
    .line 127
    :try_start_5
    invoke-interface {p1, v7}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 128
    .line 129
    .line 130
    monitor-exit p0

    .line 131
    return-void

    .line 132
    :catchall_1
    move-exception v0

    .line 133
    :goto_3
    move-object p1, v0

    .line 134
    goto :goto_4

    .line 135
    :catchall_2
    move-exception v0

    .line 136
    move-object v2, v9

    .line 137
    goto :goto_3

    .line 138
    :cond_3
    :try_start_6
    iget-object p1, v2, LN6/x;->c:Landroid/content/Context;

    .line 139
    .line 140
    sget-object p2, Lx6/b;->b:Lx6/b;

    .line 141
    .line 142
    invoke-static {p1, p2, v10, v1}, LQ6/a;->a(Landroid/content/Context;Lx6/b;Lx6/g;LQ6/b;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 143
    .line 144
    .line 145
    monitor-exit p0

    .line 146
    return-void

    .line 147
    :catchall_3
    move-exception v0

    .line 148
    move-object v2, p0

    .line 149
    goto :goto_3

    .line 150
    :goto_4
    :try_start_7
    monitor-exit p0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 151
    throw p1
.end method

.method public final e(LN6/z;Landroid/util/Pair;Z)V
    .locals 12

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x6

    .line 3
    const/4 v2, 0x1

    .line 4
    iget-object v3, p1, LN6/z;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 5
    .line 6
    invoke-virtual {v3, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 7
    .line 8
    .line 9
    iget-object v3, p1, LN6/z;->a:LQ6/a;

    .line 10
    .line 11
    if-eqz v3, :cond_0

    .line 12
    .line 13
    iget-object p1, p2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p1, LQ6/b;

    .line 16
    .line 17
    invoke-virtual {p1, v3}, LQ6/b;->onSuccess(LQ6/a;)V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    iget-object v4, p2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v4, LQ6/b;

    .line 24
    .line 25
    iget-object p1, p1, LN6/z;->b:Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {v4, p1}, LQ6/b;->onFailure(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    :goto_0
    new-instance p1, Landroid/util/Pair;

    .line 31
    .line 32
    const-string v4, "se"

    .line 33
    .line 34
    const-string v5, "query_g"

    .line 35
    .line 36
    invoke-direct {p1, v4, v5}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    new-instance v4, Landroid/util/Pair;

    .line 40
    .line 41
    const-string v5, "BANNER"

    .line 42
    .line 43
    const-string v6, "ad_format"

    .line 44
    .line 45
    invoke-direct {v4, v6, v5}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    new-instance v5, Landroid/util/Pair;

    .line 49
    .line 50
    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v6

    .line 54
    const-string v7, "rtype"

    .line 55
    .line 56
    invoke-direct {v5, v7, v6}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    new-instance v6, Landroid/util/Pair;

    .line 60
    .line 61
    const-string v7, "scar"

    .line 62
    .line 63
    const-string v8, "true"

    .line 64
    .line 65
    invoke-direct {v6, v7, v8}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    new-instance v7, Landroid/util/Pair;

    .line 69
    .line 70
    sget-object v8, LC6/n;->D:LC6/n;

    .line 71
    .line 72
    iget-object v8, v8, LC6/n;->k:Ln7/b;

    .line 73
    .line 74
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 78
    .line 79
    .line 80
    move-result-wide v8

    .line 81
    iget-object p2, p2, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast p2, Ljava/lang/Long;

    .line 84
    .line 85
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 86
    .line 87
    .line 88
    move-result-wide v10

    .line 89
    sub-long/2addr v8, v10

    .line 90
    const-string p2, "lat_ms"

    .line 91
    .line 92
    invoke-static {v8, v9}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v8

    .line 96
    invoke-direct {v7, p2, v8}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    new-instance p2, Landroid/util/Pair;

    .line 100
    .line 101
    invoke-static {p3}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p3

    .line 105
    const-string v8, "sgpc_h"

    .line 106
    .line 107
    invoke-direct {p2, v8, p3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    new-instance p3, Landroid/util/Pair;

    .line 111
    .line 112
    if-eqz v3, :cond_1

    .line 113
    .line 114
    move v3, v2

    .line 115
    goto :goto_1

    .line 116
    :cond_1
    move v3, v0

    .line 117
    :goto_1
    const-string v8, "sgpc_rs"

    .line 118
    .line 119
    invoke-static {v3}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    invoke-direct {p3, v8, v3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    const/4 v3, 0x7

    .line 127
    new-array v3, v3, [Landroid/util/Pair;

    .line 128
    .line 129
    aput-object p1, v3, v0

    .line 130
    .line 131
    aput-object v4, v3, v2

    .line 132
    .line 133
    const/4 p1, 0x2

    .line 134
    aput-object v5, v3, p1

    .line 135
    .line 136
    const/4 p1, 0x3

    .line 137
    aput-object v6, v3, p1

    .line 138
    .line 139
    const/4 p1, 0x4

    .line 140
    aput-object v7, v3, p1

    .line 141
    .line 142
    const/4 p1, 0x5

    .line 143
    aput-object p2, v3, p1

    .line 144
    .line 145
    aput-object p3, v3, v1

    .line 146
    .line 147
    const-string p1, "sgpcr"

    .line 148
    .line 149
    iget-object p2, p0, LN6/x;->d:Lcom/google/android/gms/internal/ads/zzdzy;

    .line 150
    .line 151
    invoke-static {p2, p1, v3}, Lp7/b;->a0(Lcom/google/android/gms/internal/ads/zzdzy;Ljava/lang/String;[Landroid/util/Pair;)V

    .line 152
    .line 153
    .line 154
    return-void
.end method
