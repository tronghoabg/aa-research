.class public final LD6/Z0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final m:Ljava/util/HashSet;

.field public static n:LD6/Z0;


# instance fields
.field public a:LD6/T0;

.field public b:LD6/T0;

.field public c:LD6/T0;

.field public final d:Ljava/lang/Object;

.field public final e:Ljava/lang/Object;

.field public final f:Ljava/util/ArrayList;

.field public g:Z

.field public h:Z

.field public final i:Ljava/lang/Object;

.field public j:LD6/m0;

.field public k:Lx6/p;

.field public l:Lx6/s;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    new-array v1, v1, [Lx6/b;

    .line 5
    .line 6
    sget-object v2, Lx6/b;->g:Lx6/b;

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    aput-object v2, v1, v3

    .line 10
    .line 11
    sget-object v2, Lx6/b;->c:Lx6/b;

    .line 12
    .line 13
    const/4 v3, 0x1

    .line 14
    aput-object v2, v1, v3

    .line 15
    .line 16
    sget-object v2, Lx6/b;->d:Lx6/b;

    .line 17
    .line 18
    const/4 v3, 0x2

    .line 19
    aput-object v2, v1, v3

    .line 20
    .line 21
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 26
    .line 27
    .line 28
    sput-object v0, LD6/Z0;->m:Ljava/util/HashSet;

    .line 29
    .line 30
    return-void
.end method

.method public constructor <init>()V
    .locals 7

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
    iput-object v0, p0, LD6/Z0;->d:Ljava/lang/Object;

    .line 10
    .line 11
    new-instance v0, Ljava/lang/Object;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, LD6/Z0;->e:Ljava/lang/Object;

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    iput-boolean v0, p0, LD6/Z0;->g:Z

    .line 20
    .line 21
    iput-boolean v0, p0, LD6/Z0;->h:Z

    .line 22
    .line 23
    new-instance v0, Ljava/lang/Object;

    .line 24
    .line 25
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, LD6/Z0;->i:Ljava/lang/Object;

    .line 29
    .line 30
    const/4 v0, 0x0

    .line 31
    iput-object v0, p0, LD6/Z0;->k:Lx6/p;

    .line 32
    .line 33
    new-instance v5, Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 36
    .line 37
    .line 38
    new-instance v1, Lx6/s;

    .line 39
    .line 40
    const/4 v4, 0x0

    .line 41
    const/4 v2, -0x1

    .line 42
    const/4 v6, 0x1

    .line 43
    move v3, v2

    .line 44
    invoke-direct/range {v1 .. v6}, Lx6/s;-><init>(IILjava/lang/String;Ljava/util/ArrayList;I)V

    .line 45
    .line 46
    .line 47
    iput-object v1, p0, LD6/Z0;->l:Lx6/s;

    .line 48
    .line 49
    new-instance v0, Ljava/util/ArrayList;

    .line 50
    .line 51
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 52
    .line 53
    .line 54
    iput-object v0, p0, LD6/Z0;->f:Ljava/util/ArrayList;

    .line 55
    .line 56
    return-void
.end method

.method public static a(Ljava/util/List;)Lcom/google/android/gms/internal/ads/zzbsf;
    .locals 6

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Lcom/google/android/gms/internal/ads/zzbrw;

    .line 21
    .line 22
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzbrw;->zza:Ljava/lang/String;

    .line 23
    .line 24
    new-instance v3, Lcom/google/android/gms/internal/ads/zzbse;

    .line 25
    .line 26
    iget-boolean v4, v1, Lcom/google/android/gms/internal/ads/zzbrw;->zzb:Z

    .line 27
    .line 28
    if-eqz v4, :cond_0

    .line 29
    .line 30
    sget-object v4, Lcom/google/android/gms/ads/initialization/AdapterStatus$State;->READY:Lcom/google/android/gms/ads/initialization/AdapterStatus$State;

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_0
    sget-object v4, Lcom/google/android/gms/ads/initialization/AdapterStatus$State;->NOT_READY:Lcom/google/android/gms/ads/initialization/AdapterStatus$State;

    .line 34
    .line 35
    :goto_1
    iget-object v5, v1, Lcom/google/android/gms/internal/ads/zzbrw;->zzd:Ljava/lang/String;

    .line 36
    .line 37
    iget v1, v1, Lcom/google/android/gms/internal/ads/zzbrw;->zzc:I

    .line 38
    .line 39
    invoke-direct {v3, v4, v5, v1}, Lcom/google/android/gms/internal/ads/zzbse;-><init>(Lcom/google/android/gms/ads/initialization/AdapterStatus$State;Ljava/lang/String;I)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    new-instance p0, Lcom/google/android/gms/internal/ads/zzbsf;

    .line 47
    .line 48
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzbsf;-><init>(Ljava/util/Map;)V

    .line 49
    .line 50
    .line 51
    return-object p0
.end method

.method public static d()LD6/Z0;
    .locals 2

    .line 1
    const-class v0, LD6/Z0;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, LD6/Z0;->n:LD6/Z0;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    new-instance v1, LD6/Z0;

    .line 9
    .line 10
    invoke-direct {v1}, LD6/Z0;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v1, LD6/Z0;->n:LD6/Z0;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception v1

    .line 17
    goto :goto_1

    .line 18
    :cond_0
    :goto_0
    sget-object v1, LD6/Z0;->n:LD6/Z0;

    .line 19
    .line 20
    monitor-exit v0

    .line 21
    return-object v1

    .line 22
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    throw v1
.end method


# virtual methods
.method public final b(Landroid/content/Context;)V
    .locals 2

    .line 1
    iget-object v0, p0, LD6/Z0;->j:LD6/m0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, LD6/q;->g:LD6/q;

    .line 6
    .line 7
    iget-object v0, v0, LD6/q;->b:LD6/o;

    .line 8
    .line 9
    new-instance v1, LD6/m;

    .line 10
    .line 11
    invoke-direct {v1, v0, p1}, LD6/m;-><init>(LD6/o;Landroid/content/Context;)V

    .line 12
    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    invoke-virtual {v1, p1, v0}, LD6/p;->d(Landroid/content/Context;Z)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    check-cast p1, LD6/m0;

    .line 20
    .line 21
    iput-object p1, p0, LD6/Z0;->j:LD6/m0;

    .line 22
    .line 23
    :cond_0
    return-void
.end method

.method public final c()V
    .locals 3

    .line 1
    iget-object v0, p0, LD6/Z0;->j:LD6/m0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    :try_start_0
    invoke-interface {v0}, LD6/m0;->zze()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, LD6/Z0;->j:LD6/m0;

    .line 10
    .line 11
    new-instance v1, Lq7/b;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-direct {v1, v2}, Lq7/b;-><init>(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    invoke-interface {v0, v2, v1}, LD6/m0;->zzj(Ljava/lang/String;Lq7/a;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :catch_0
    move-exception v0

    .line 22
    const-string v1, "MobileAdsSettingManager initialization failed"

    .line 23
    .line 24
    invoke-static {v1, v0}, LH6/l;->g(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final e(Landroid/content/Context;Lcom/google/android/gms/ads/initialization/OnInitializationCompleteListener;)V
    .locals 3

    .line 1
    iget-object v0, p0, LD6/Z0;->d:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, LD6/Z0;->g:Z

    .line 5
    .line 6
    if-eqz v1, :cond_1

    .line 7
    .line 8
    if-eqz p2, :cond_0

    .line 9
    .line 10
    iget-object p1, p0, LD6/Z0;->f:Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception p1

    .line 17
    goto/16 :goto_6

    .line 18
    .line 19
    :cond_0
    :goto_0
    monitor-exit v0

    .line 20
    return-void

    .line 21
    :cond_1
    iget-boolean v1, p0, LD6/Z0;->h:Z

    .line 22
    .line 23
    if-eqz v1, :cond_3

    .line 24
    .line 25
    if-eqz p2, :cond_2

    .line 26
    .line 27
    invoke-virtual {p0}, LD6/Z0;->f()Lcom/google/android/gms/ads/initialization/InitializationStatus;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-interface {p2, p1}, Lcom/google/android/gms/ads/initialization/OnInitializationCompleteListener;->onInitializationComplete(Lcom/google/android/gms/ads/initialization/InitializationStatus;)V

    .line 32
    .line 33
    .line 34
    :cond_2
    monitor-exit v0

    .line 35
    return-void

    .line 36
    :cond_3
    const/4 v1, 0x1

    .line 37
    iput-boolean v1, p0, LD6/Z0;->g:Z

    .line 38
    .line 39
    if-eqz p2, :cond_4

    .line 40
    .line 41
    iget-object v1, p0, LD6/Z0;->f:Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    :cond_4
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    if-eqz p1, :cond_b

    .line 48
    .line 49
    iget-object p2, p0, LD6/Z0;->i:Ljava/lang/Object;

    .line 50
    .line 51
    monitor-enter p2

    .line 52
    :try_start_1
    invoke-virtual {p0, p1}, LD6/Z0;->b(Landroid/content/Context;)V

    .line 53
    .line 54
    .line 55
    iget-object v0, p0, LD6/Z0;->j:LD6/m0;

    .line 56
    .line 57
    if-eqz v0, :cond_5

    .line 58
    .line 59
    new-instance v1, LD6/Y0;

    .line 60
    .line 61
    invoke-direct {v1, p0}, LD6/Y0;-><init>(LD6/Z0;)V

    .line 62
    .line 63
    .line 64
    invoke-interface {v0, v1}, LD6/m0;->zzp(Lcom/google/android/gms/internal/ads/zzbsd;)V

    .line 65
    .line 66
    .line 67
    iget-object v0, p0, LD6/Z0;->j:LD6/m0;

    .line 68
    .line 69
    new-instance v1, Lcom/google/android/gms/internal/ads/zzbvf;

    .line 70
    .line 71
    invoke-direct {v1}, Lcom/google/android/gms/internal/ads/zzbvf;-><init>()V

    .line 72
    .line 73
    .line 74
    invoke-interface {v0, v1}, LD6/m0;->zzo(Lcom/google/android/gms/internal/ads/zzbvj;)V

    .line 75
    .line 76
    .line 77
    goto :goto_1

    .line 78
    :catchall_1
    move-exception p1

    .line 79
    goto/16 :goto_5

    .line 80
    .line 81
    :catch_0
    move-exception v0

    .line 82
    goto :goto_2

    .line 83
    :cond_5
    :goto_1
    iget-object v0, p0, LD6/Z0;->l:Lx6/s;

    .line 84
    .line 85
    iget v1, v0, Lx6/s;->a:I

    .line 86
    .line 87
    const/4 v2, -0x1

    .line 88
    if-ne v1, v2, :cond_6

    .line 89
    .line 90
    iget v1, v0, Lx6/s;->b:I

    .line 91
    .line 92
    if-eq v1, v2, :cond_8

    .line 93
    .line 94
    :cond_6
    iget-object v1, p0, LD6/Z0;->j:LD6/m0;
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 95
    .line 96
    if-nez v1, :cond_7

    .line 97
    .line 98
    goto :goto_3

    .line 99
    :cond_7
    :try_start_2
    new-instance v2, LD6/p1;

    .line 100
    .line 101
    invoke-direct {v2, v0}, LD6/p1;-><init>(Lx6/s;)V

    .line 102
    .line 103
    .line 104
    invoke-interface {v1, v2}, LD6/m0;->zzr(LD6/p1;)V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 105
    .line 106
    .line 107
    goto :goto_3

    .line 108
    :catch_1
    move-exception v0

    .line 109
    :try_start_3
    const-string v1, "Unable to set request configuration parcel."

    .line 110
    .line 111
    invoke-static {v1, v0}, LH6/l;->d(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_3
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 112
    .line 113
    .line 114
    goto :goto_3

    .line 115
    :goto_2
    :try_start_4
    const-string v1, "MobileAdsSettingManager initialization failed"

    .line 116
    .line 117
    invoke-static {v1, v0}, LH6/l;->g(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 118
    .line 119
    .line 120
    :cond_8
    :goto_3
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzbix;->zza(Landroid/content/Context;)V

    .line 121
    .line 122
    .line 123
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbkv;->zza:Lcom/google/android/gms/internal/ads/zzbkh;

    .line 124
    .line 125
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbkh;->zze()Ljava/lang/Object;

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
    if-eqz v0, :cond_9

    .line 136
    .line 137
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbix;->zzmN:Lcom/google/android/gms/internal/ads/zzbio;

    .line 138
    .line 139
    sget-object v1, LD6/s;->e:LD6/s;

    .line 140
    .line 141
    iget-object v1, v1, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 142
    .line 143
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    check-cast v0, Ljava/lang/Boolean;

    .line 148
    .line 149
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 150
    .line 151
    .line 152
    move-result v0

    .line 153
    if-eqz v0, :cond_9

    .line 154
    .line 155
    const-string v0, "Initializing on bg thread"

    .line 156
    .line 157
    invoke-static {v0}, LH6/l;->a(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    sget-object v0, LH6/c;->a:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 161
    .line 162
    new-instance v1, LD6/W0;

    .line 163
    .line 164
    const/4 v2, 0x1

    .line 165
    invoke-direct {v1, p0, v2}, LD6/W0;-><init>(LD6/Z0;I)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 169
    .line 170
    .line 171
    goto :goto_4

    .line 172
    :cond_9
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbkv;->zzb:Lcom/google/android/gms/internal/ads/zzbkh;

    .line 173
    .line 174
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbkh;->zze()Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    check-cast v0, Ljava/lang/Boolean;

    .line 179
    .line 180
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 181
    .line 182
    .line 183
    move-result v0

    .line 184
    if-eqz v0, :cond_a

    .line 185
    .line 186
    sget-object v0, Lcom/google/android/gms/internal/ads/zzbix;->zzmN:Lcom/google/android/gms/internal/ads/zzbio;

    .line 187
    .line 188
    sget-object v1, LD6/s;->e:LD6/s;

    .line 189
    .line 190
    iget-object v1, v1, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 191
    .line 192
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    check-cast v0, Ljava/lang/Boolean;

    .line 197
    .line 198
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 199
    .line 200
    .line 201
    move-result v0

    .line 202
    if-eqz v0, :cond_a

    .line 203
    .line 204
    sget-object v0, LH6/c;->b:Ljava/util/concurrent/ExecutorService;

    .line 205
    .line 206
    new-instance v1, LD6/W0;

    .line 207
    .line 208
    const/4 v2, 0x0

    .line 209
    invoke-direct {v1, p0, v2}, LD6/W0;-><init>(LD6/Z0;I)V

    .line 210
    .line 211
    .line 212
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 213
    .line 214
    .line 215
    goto :goto_4

    .line 216
    :cond_a
    const-string v0, "Initializing on calling thread"

    .line 217
    .line 218
    invoke-static {v0}, LH6/l;->a(Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {p0}, LD6/Z0;->c()V

    .line 222
    .line 223
    .line 224
    :goto_4
    new-instance v0, LD6/T0;

    .line 225
    .line 226
    sget-object v1, Lx6/b;->c:Lx6/b;

    .line 227
    .line 228
    invoke-direct {v0, p1, v1}, LE9/c;-><init>(Landroid/content/Context;Lx6/b;)V

    .line 229
    .line 230
    .line 231
    iput-object v0, p0, LD6/Z0;->a:LD6/T0;

    .line 232
    .line 233
    new-instance v0, LD6/T0;

    .line 234
    .line 235
    sget-object v1, Lx6/b;->d:Lx6/b;

    .line 236
    .line 237
    invoke-direct {v0, p1, v1}, LE9/c;-><init>(Landroid/content/Context;Lx6/b;)V

    .line 238
    .line 239
    .line 240
    iput-object v0, p0, LD6/Z0;->b:LD6/T0;

    .line 241
    .line 242
    new-instance v0, LD6/T0;

    .line 243
    .line 244
    sget-object v1, Lx6/b;->g:Lx6/b;

    .line 245
    .line 246
    invoke-direct {v0, p1, v1}, LE9/c;-><init>(Landroid/content/Context;Lx6/b;)V

    .line 247
    .line 248
    .line 249
    iput-object v0, p0, LD6/Z0;->c:LD6/T0;

    .line 250
    .line 251
    monitor-exit p2

    .line 252
    return-void

    .line 253
    :goto_5
    monitor-exit p2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 254
    throw p1

    .line 255
    :cond_b
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 256
    .line 257
    const-string p2, "Context cannot be null."

    .line 258
    .line 259
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    throw p1

    .line 263
    :goto_6
    :try_start_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 264
    throw p1
.end method

.method public final f()Lcom/google/android/gms/ads/initialization/InitializationStatus;
    .locals 3

    .line 1
    iget-object v0, p0, LD6/Z0;->i:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, LD6/Z0;->j:LD6/m0;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v1, 0x0

    .line 11
    :goto_0
    const-string v2, "MobileAds.initialize() must be called prior to getting initialization status."

    .line 12
    .line 13
    invoke-static {v2, v1}, Lcom/google/android/gms/common/internal/v;->k(Ljava/lang/String;Z)V

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, LD6/Z0;->j:LD6/m0;

    .line 17
    .line 18
    if-nez v1, :cond_1

    .line 19
    .line 20
    new-instance v1, LA/e0;

    .line 21
    .line 22
    const/4 v2, 0x4

    .line 23
    invoke-direct {v1, p0, v2}, LA/e0;-><init>(Ljava/lang/Object;I)V

    .line 24
    .line 25
    .line 26
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    return-object v1

    .line 28
    :catchall_0
    move-exception v1

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    :try_start_1
    invoke-interface {v1}, LD6/m0;->zzq()Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-static {v1}, LD6/Z0;->a(Ljava/util/List;)Lcom/google/android/gms/internal/ads/zzbsf;

    .line 35
    .line 36
    .line 37
    move-result-object v1
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 38
    :try_start_2
    monitor-exit v0

    .line 39
    return-object v1

    .line 40
    :catch_0
    const-string v1, "Unable to get Initialization status."

    .line 41
    .line 42
    invoke-static {v1}, LH6/l;->c(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    new-instance v1, LA/e0;

    .line 46
    .line 47
    const/4 v2, 0x4

    .line 48
    invoke-direct {v1, p0, v2}, LA/e0;-><init>(Ljava/lang/Object;I)V

    .line 49
    .line 50
    .line 51
    monitor-exit v0

    .line 52
    return-object v1

    .line 53
    :goto_1
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 54
    throw v1
.end method
