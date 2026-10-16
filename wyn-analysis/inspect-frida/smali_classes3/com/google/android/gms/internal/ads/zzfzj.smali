.class public final Lcom/google/android/gms/internal/ads/zzfzj;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final zza:Ljava/util/HashMap;


# instance fields
.field private final zzb:Landroid/content/Context;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzfzk;

.field private final zzd:Lcom/google/android/gms/internal/ads/zzfxq;

.field private final zze:Lcom/google/android/gms/internal/ads/zzfxl;

.field private final zzf:Z

.field private zzg:Lcom/google/android/gms/internal/ads/zzfyy;

.field private final zzh:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/google/android/gms/internal/ads/zzfzj;->zza:Ljava/util/HashMap;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzfzk;Lcom/google/android/gms/internal/ads/zzfxq;Lcom/google/android/gms/internal/ads/zzfxl;Z)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzfzj;->zzh:Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfzj;->zzb:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzfzj;->zzc:Lcom/google/android/gms/internal/ads/zzfzk;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzfzj;->zzd:Lcom/google/android/gms/internal/ads/zzfxq;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzfzj;->zze:Lcom/google/android/gms/internal/ads/zzfxl;

    iput-boolean p5, p0, Lcom/google/android/gms/internal/ads/zzfzj;->zzf:Z

    return-void
.end method

.method private final declared-synchronized zzd(Lcom/google/android/gms/internal/ads/zzfyz;)Ljava/lang/Class;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzfzi;
        }
    .end annotation

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzfyz;->zza()Lcom/google/android/gms/internal/ads/zzbei;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    if-eqz v0, :cond_3

    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzfyz;->zza()Lcom/google/android/gms/internal/ads/zzbei;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbei;->zza()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    sget-object v1, Lcom/google/android/gms/internal/ads/zzfzj;->zza:Ljava/util/HashMap;

    .line 17
    .line 18
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    check-cast v2, Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    monitor-exit p0

    .line 27
    return-object v2

    .line 28
    :cond_0
    const/16 v2, 0x7ea

    .line 29
    .line 30
    :try_start_1
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzfzj;->zze:Lcom/google/android/gms/internal/ads/zzfxl;

    .line 31
    .line 32
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzfyz;->zzb()Ljava/io/File;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ads/zzfxl;->zza(Ljava/io/File;)Z

    .line 37
    .line 38
    .line 39
    move-result v3
    :try_end_1
    .catch Ljava/security/GeneralSecurityException; {:try_start_1 .. :try_end_1} :catch_3
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 40
    if-eqz v3, :cond_2

    .line 41
    .line 42
    :try_start_2
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzfyz;->zzc()Ljava/io/File;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    if-nez v3, :cond_1

    .line 51
    .line 52
    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :catchall_0
    move-exception p1

    .line 57
    goto :goto_2

    .line 58
    :catch_0
    move-exception p1

    .line 59
    goto :goto_1

    .line 60
    :catch_1
    move-exception p1

    .line 61
    goto :goto_1

    .line 62
    :catch_2
    move-exception p1

    .line 63
    goto :goto_1

    .line 64
    :cond_1
    :goto_0
    new-instance v3, Ldalvik/system/DexClassLoader;

    .line 65
    .line 66
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzfyz;->zzb()Ljava/io/File;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzfzj;->zzb:Landroid/content/Context;

    .line 79
    .line 80
    invoke-virtual {v4}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    const/4 v5, 0x0

    .line 85
    invoke-direct {v3, p1, v2, v5, v4}, Ldalvik/system/DexClassLoader;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/ClassLoader;)V

    .line 86
    .line 87
    .line 88
    const-string p1, "com.google.ccc.abuse.droidguard.DroidGuard"

    .line 89
    .line 90
    invoke-virtual {v3, p1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    move-result-object p1
    :try_end_2
    .catch Ljava/lang/ClassNotFoundException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/SecurityException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 94
    :try_start_3
    invoke-virtual {v1, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 95
    .line 96
    .line 97
    monitor-exit p0

    .line 98
    return-object p1

    .line 99
    :goto_1
    :try_start_4
    new-instance v0, Lcom/google/android/gms/internal/ads/zzfzi;

    .line 100
    .line 101
    const/16 v1, 0x7d8

    .line 102
    .line 103
    invoke-direct {v0, v1, p1}, Lcom/google/android/gms/internal/ads/zzfzi;-><init>(ILjava/lang/Throwable;)V

    .line 104
    .line 105
    .line 106
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 107
    :cond_2
    :try_start_5
    new-instance p1, Lcom/google/android/gms/internal/ads/zzfzi;

    .line 108
    .line 109
    const-string v0, "VM did not pass signature verification"

    .line 110
    .line 111
    invoke-direct {p1, v2, v0}, Lcom/google/android/gms/internal/ads/zzfzi;-><init>(ILjava/lang/String;)V

    .line 112
    .line 113
    .line 114
    throw p1
    :try_end_5
    .catch Ljava/security/GeneralSecurityException; {:try_start_5 .. :try_end_5} :catch_3
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 115
    :catch_3
    move-exception p1

    .line 116
    :try_start_6
    new-instance v0, Lcom/google/android/gms/internal/ads/zzfzi;

    .line 117
    .line 118
    invoke-direct {v0, v2, p1}, Lcom/google/android/gms/internal/ads/zzfzi;-><init>(ILjava/lang/Throwable;)V

    .line 119
    .line 120
    .line 121
    throw v0

    .line 122
    :cond_3
    const-string p1, "mc"

    .line 123
    .line 124
    new-instance v0, Lcom/google/android/gms/internal/ads/zzfzi;

    .line 125
    .line 126
    const/16 v1, 0xfaa

    .line 127
    .line 128
    invoke-direct {v0, v1, p1}, Lcom/google/android/gms/internal/ads/zzfzi;-><init>(ILjava/lang/String;)V

    .line 129
    .line 130
    .line 131
    throw v0

    .line 132
    :goto_2
    monitor-exit p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 133
    throw p1
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/ads/zzfyz;)Z
    .locals 22

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const/4 v0, 0x5

    .line 4
    const/4 v2, 0x3

    .line 5
    const/4 v3, 0x6

    .line 6
    const/4 v4, 0x4

    .line 7
    const/4 v5, 0x2

    .line 8
    const/4 v6, 0x1

    .line 9
    const/4 v7, 0x0

    .line 10
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 11
    .line 12
    .line 13
    move-result-wide v8

    .line 14
    :try_start_0
    const-string v10, "ci: "

    .line 15
    .line 16
    invoke-direct/range {p0 .. p1}, Lcom/google/android/gms/internal/ads/zzfzj;->zzd(Lcom/google/android/gms/internal/ads/zzfyz;)Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object v11
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/zzfzi; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 20
    :try_start_1
    new-array v12, v3, [Ljava/lang/Class;

    .line 21
    .line 22
    const-class v13, Landroid/content/Context;

    .line 23
    .line 24
    aput-object v13, v12, v7

    .line 25
    .line 26
    const-class v13, Ljava/lang/String;

    .line 27
    .line 28
    aput-object v13, v12, v6

    .line 29
    .line 30
    const-class v13, [B

    .line 31
    .line 32
    aput-object v13, v12, v5

    .line 33
    .line 34
    const-class v13, Ljava/lang/Object;

    .line 35
    .line 36
    aput-object v13, v12, v2

    .line 37
    .line 38
    const-class v13, Landroid/os/Bundle;

    .line 39
    .line 40
    aput-object v13, v12, v4

    .line 41
    .line 42
    sget-object v13, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 43
    .line 44
    aput-object v13, v12, v0

    .line 45
    .line 46
    invoke-virtual {v11, v12}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 47
    .line 48
    .line 49
    move-result-object v11

    .line 50
    iget-object v12, v1, Lcom/google/android/gms/internal/ads/zzfzj;->zzb:Landroid/content/Context;

    .line 51
    .line 52
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzfyz;->zzd()[B

    .line 53
    .line 54
    .line 55
    move-result-object v13

    .line 56
    new-instance v14, Landroid/os/Bundle;

    .line 57
    .line 58
    invoke-direct {v14}, Landroid/os/Bundle;-><init>()V

    .line 59
    .line 60
    .line 61
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 62
    .line 63
    .line 64
    move-result-object v15

    .line 65
    new-array v3, v3, [Ljava/lang/Object;

    .line 66
    .line 67
    aput-object v12, v3, v7

    .line 68
    .line 69
    const-string v12, "msa-r"

    .line 70
    .line 71
    aput-object v12, v3, v6

    .line 72
    .line 73
    aput-object v13, v3, v5

    .line 74
    .line 75
    const/4 v5, 0x0

    .line 76
    aput-object v5, v3, v2

    .line 77
    .line 78
    aput-object v14, v3, v4

    .line 79
    .line 80
    aput-object v15, v3, v0

    .line 81
    .line 82
    invoke-virtual {v11, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v17
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3

    .line 86
    :try_start_2
    new-instance v16, Lcom/google/android/gms/internal/ads/zzfyy;

    .line 87
    .line 88
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzfzj;->zzc:Lcom/google/android/gms/internal/ads/zzfzk;

    .line 89
    .line 90
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzfzj;->zzd:Lcom/google/android/gms/internal/ads/zzfxq;

    .line 91
    .line 92
    iget-boolean v3, v1, Lcom/google/android/gms/internal/ads/zzfzj;->zzf:Z

    .line 93
    .line 94
    move-object/from16 v18, p1

    .line 95
    .line 96
    move-object/from16 v19, v0

    .line 97
    .line 98
    move-object/from16 v20, v2

    .line 99
    .line 100
    move/from16 v21, v3

    .line 101
    .line 102
    invoke-direct/range {v16 .. v21}, Lcom/google/android/gms/internal/ads/zzfyy;-><init>(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/zzfyz;Lcom/google/android/gms/internal/ads/zzfzk;Lcom/google/android/gms/internal/ads/zzfxq;Z)V

    .line 103
    .line 104
    .line 105
    move-object/from16 v2, v16

    .line 106
    .line 107
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzfyy;->zzf()Z

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    if-eqz v0, :cond_2

    .line 112
    .line 113
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzfyy;->zzh()I

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    if-nez v0, :cond_1

    .line 118
    .line 119
    iget-object v3, v1, Lcom/google/android/gms/internal/ads/zzfzj;->zzh:Ljava/lang/Object;

    .line 120
    .line 121
    monitor-enter v3
    :try_end_2
    .catch Lcom/google/android/gms/internal/ads/zzfzi; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 122
    :try_start_3
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzfzj;->zzg:Lcom/google/android/gms/internal/ads/zzfyy;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 123
    .line 124
    if-eqz v0, :cond_0

    .line 125
    .line 126
    :try_start_4
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfyy;->zzg()V
    :try_end_4
    .catch Lcom/google/android/gms/internal/ads/zzfzi; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 127
    .line 128
    .line 129
    goto :goto_0

    .line 130
    :catchall_0
    move-exception v0

    .line 131
    goto :goto_1

    .line 132
    :catch_0
    move-exception v0

    .line 133
    :try_start_5
    iget-object v4, v1, Lcom/google/android/gms/internal/ads/zzfzj;->zzd:Lcom/google/android/gms/internal/ads/zzfxq;

    .line 134
    .line 135
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfzi;->zza()I

    .line 136
    .line 137
    .line 138
    move-result v5

    .line 139
    const-wide/16 v10, -0x1

    .line 140
    .line 141
    invoke-virtual {v4, v5, v10, v11, v0}, Lcom/google/android/gms/internal/ads/zzfxq;->zzc(IJLjava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    .line 142
    .line 143
    .line 144
    :cond_0
    :goto_0
    iput-object v2, v1, Lcom/google/android/gms/internal/ads/zzfzj;->zzg:Lcom/google/android/gms/internal/ads/zzfyy;

    .line 145
    .line 146
    monitor-exit v3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 147
    :try_start_6
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzfzj;->zzd:Lcom/google/android/gms/internal/ads/zzfxq;

    .line 148
    .line 149
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 150
    .line 151
    .line 152
    move-result-wide v2

    .line 153
    sub-long/2addr v2, v8

    .line 154
    const/16 v4, 0xbb8

    .line 155
    .line 156
    invoke-virtual {v0, v4, v2, v3}, Lcom/google/android/gms/internal/ads/zzfxq;->zzb(IJ)Lcom/google/android/gms/tasks/Task;
    :try_end_6
    .catch Lcom/google/android/gms/internal/ads/zzfzi; {:try_start_6 .. :try_end_6} :catch_2
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1

    .line 157
    .line 158
    .line 159
    return v6

    .line 160
    :catch_1
    move-exception v0

    .line 161
    goto :goto_2

    .line 162
    :catch_2
    move-exception v0

    .line 163
    goto :goto_3

    .line 164
    :goto_1
    :try_start_7
    monitor-exit v3
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 165
    :try_start_8
    throw v0

    .line 166
    :cond_1
    new-instance v2, Lcom/google/android/gms/internal/ads/zzfzi;

    .line 167
    .line 168
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v3

    .line 172
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 173
    .line 174
    .line 175
    move-result v3

    .line 176
    add-int/2addr v3, v4

    .line 177
    new-instance v4, Ljava/lang/StringBuilder;

    .line 178
    .line 179
    invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    .line 188
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    const/16 v3, 0xfa1

    .line 193
    .line 194
    invoke-direct {v2, v3, v0}, Lcom/google/android/gms/internal/ads/zzfzi;-><init>(ILjava/lang/String;)V

    .line 195
    .line 196
    .line 197
    throw v2

    .line 198
    :cond_2
    new-instance v0, Lcom/google/android/gms/internal/ads/zzfzi;

    .line 199
    .line 200
    const-string v2, "init failed"

    .line 201
    .line 202
    const/16 v3, 0xfa0

    .line 203
    .line 204
    invoke-direct {v0, v3, v2}, Lcom/google/android/gms/internal/ads/zzfzi;-><init>(ILjava/lang/String;)V

    .line 205
    .line 206
    .line 207
    throw v0

    .line 208
    :catch_3
    move-exception v0

    .line 209
    new-instance v2, Lcom/google/android/gms/internal/ads/zzfzi;

    .line 210
    .line 211
    const/16 v3, 0x7d4

    .line 212
    .line 213
    invoke-direct {v2, v3, v0}, Lcom/google/android/gms/internal/ads/zzfzi;-><init>(ILjava/lang/Throwable;)V

    .line 214
    .line 215
    .line 216
    throw v2
    :try_end_8
    .catch Lcom/google/android/gms/internal/ads/zzfzi; {:try_start_8 .. :try_end_8} :catch_2
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_1

    .line 217
    :goto_2
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzfzj;->zzd:Lcom/google/android/gms/internal/ads/zzfxq;

    .line 218
    .line 219
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 220
    .line 221
    .line 222
    move-result-wide v3

    .line 223
    sub-long/2addr v3, v8

    .line 224
    const/16 v5, 0xfaa

    .line 225
    .line 226
    invoke-virtual {v2, v5, v3, v4, v0}, Lcom/google/android/gms/internal/ads/zzfxq;->zzc(IJLjava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    .line 227
    .line 228
    .line 229
    goto :goto_4

    .line 230
    :goto_3
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzfzj;->zzd:Lcom/google/android/gms/internal/ads/zzfxq;

    .line 231
    .line 232
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzfzi;->zza()I

    .line 233
    .line 234
    .line 235
    move-result v3

    .line 236
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 237
    .line 238
    .line 239
    move-result-wide v4

    .line 240
    sub-long/2addr v4, v8

    .line 241
    invoke-virtual {v2, v3, v4, v5, v0}, Lcom/google/android/gms/internal/ads/zzfxq;->zzc(IJLjava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    .line 242
    .line 243
    .line 244
    :goto_4
    return v7
.end method

.method public final zzb()Lcom/google/android/gms/internal/ads/zzfxt;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfzj;->zzh:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfzj;->zzg:Lcom/google/android/gms/internal/ads/zzfyy;

    .line 5
    .line 6
    monitor-exit v0

    .line 7
    return-object v1

    .line 8
    :catchall_0
    move-exception v1

    .line 9
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    throw v1
.end method

.method public final zzc()Lcom/google/android/gms/internal/ads/zzfyz;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfzj;->zzh:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfzj;->zzg:Lcom/google/android/gms/internal/ads/zzfyy;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzfyy;->zze()Lcom/google/android/gms/internal/ads/zzfyz;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    monitor-exit v0

    .line 13
    return-object v1

    .line 14
    :catchall_0
    move-exception v1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    monitor-exit v0

    .line 17
    const/4 v0, 0x0

    .line 18
    return-object v0

    .line 19
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    throw v1
.end method
