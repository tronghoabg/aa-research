.class public abstract LD7/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ld7/f;

.field public static final b:Ljava/lang/Object;

.field public static c:Ljava/lang/reflect/Method; = null

.field public static d:Z = false


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Ld7/f;->b:Ld7/f;

    .line 2
    .line 3
    sput-object v0, LD7/a;->a:Ld7/f;

    .line 4
    .line 5
    new-instance v0, Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v0, LD7/a;->b:Ljava/lang/Object;

    .line 11
    .line 12
    return-void
.end method

.method public static a(Landroid/content/Context;)V
    .locals 13

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x3

    .line 3
    const-string v2, "Context must not be null"

    .line 4
    .line 5
    invoke-static {p0, v2}, Lcom/google/android/gms/common/internal/v;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sget-object v2, LD7/a;->a:Ld7/f;

    .line 9
    .line 10
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    const v2, 0xb5f608

    .line 14
    .line 15
    .line 16
    invoke-static {p0, v2}, Ld7/i;->a(Landroid/content/Context;I)V

    .line 17
    .line 18
    .line 19
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 20
    .line 21
    .line 22
    move-result-wide v2

    .line 23
    sget-object v4, LD7/a;->b:Ljava/lang/Object;

    .line 24
    .line 25
    monitor-enter v4

    .line 26
    :try_start_0
    sget-boolean v5, LD7/a;->d:Z

    .line 27
    .line 28
    const/4 v6, 0x0

    .line 29
    if-nez v5, :cond_0

    .line 30
    .line 31
    const-string v5, "Failed to load providerinstaller module: "
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    .line 33
    :try_start_1
    sget-object v7, Lr7/d;->e:Lae/b;

    .line 34
    .line 35
    const-string v8, "com.google.android.gms.providerinstaller.dynamite"

    .line 36
    .line 37
    invoke-static {p0, v7, v8}, Lr7/d;->c(Landroid/content/Context;Lr7/c;Ljava/lang/String;)Lr7/d;

    .line 38
    .line 39
    .line 40
    move-result-object v7

    .line 41
    iget-object v5, v7, Lr7/d;->a:Landroid/content/Context;
    :try_end_1
    .catch Lr7/a; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :catchall_0
    move-exception p0

    .line 45
    goto/16 :goto_5

    .line 46
    .line 47
    :catch_0
    move-exception v7

    .line 48
    :try_start_2
    const-string v8, "ProviderInstaller"

    .line 49
    .line 50
    invoke-virtual {v7}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v7

    .line 54
    invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v7

    .line 58
    invoke-virtual {v5, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    invoke-static {v8, v5}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 63
    .line 64
    .line 65
    move-object v5, v6

    .line 66
    :goto_0
    if-eqz v5, :cond_0

    .line 67
    .line 68
    const-string p0, "com.google.android.gms.providerinstaller.ProviderInstallerImpl"

    .line 69
    .line 70
    invoke-static {v5, p0}, LD7/a;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    monitor-exit v4

    .line 74
    goto :goto_4

    .line 75
    :cond_0
    sget-boolean v5, LD7/a;->d:Z

    .line 76
    .line 77
    const-string v7, "Failed to report request stats: "
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 78
    .line 79
    :try_start_3
    const-string v8, "com.google.android.gms"

    .line 80
    .line 81
    invoke-virtual {p0, v8, v1}, Landroid/content/Context;->createPackageContext(Ljava/lang/String;I)Landroid/content/Context;

    .line 82
    .line 83
    .line 84
    move-result-object v8
    :try_end_3
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 85
    goto :goto_1

    .line 86
    :catch_1
    move-object v8, v6

    .line 87
    :goto_1
    if-nez v8, :cond_1

    .line 88
    .line 89
    goto :goto_3

    .line 90
    :cond_1
    :try_start_4
    sput-boolean v0, LD7/a;->d:Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 91
    .line 92
    if-nez v5, :cond_2

    .line 93
    .line 94
    :try_start_5
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 95
    .line 96
    .line 97
    move-result-wide v5

    .line 98
    const-string v9, "com.google.android.gms.common.security.ProviderInstallerImpl"

    .line 99
    .line 100
    const-string v10, "reportRequestStats2"

    .line 101
    .line 102
    invoke-virtual {v8}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 103
    .line 104
    .line 105
    move-result-object v11

    .line 106
    const-class v12, Landroid/content/Context;

    .line 107
    .line 108
    invoke-static {v12, p0}, Lcom/google/android/gms/internal/common/zzi;->zzb(Ljava/lang/Class;Ljava/lang/Object;)Lcom/google/android/gms/internal/common/zzi;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    invoke-static {v2, v3}, Lcom/google/android/gms/internal/common/zzh;->zza(J)Lcom/google/android/gms/internal/common/zzh;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    invoke-static {v5, v6}, Lcom/google/android/gms/internal/common/zzh;->zza(J)Lcom/google/android/gms/internal/common/zzh;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    new-array v1, v1, [Lcom/google/android/gms/internal/common/zzi;

    .line 121
    .line 122
    const/4 v5, 0x0

    .line 123
    aput-object p0, v1, v5

    .line 124
    .line 125
    aput-object v2, v1, v0

    .line 126
    .line 127
    const/4 p0, 0x2

    .line 128
    aput-object v3, v1, p0

    .line 129
    .line 130
    invoke-static {v9, v10, v11, v1}, Lcom/google/android/gms/internal/common/zzj;->zzb(Ljava/lang/String;Ljava/lang/String;Ljava/lang/ClassLoader;[Lcom/google/android/gms/internal/common/zzi;)Ljava/lang/Object;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 131
    .line 132
    .line 133
    goto :goto_2

    .line 134
    :catch_2
    move-exception p0

    .line 135
    :try_start_6
    const-string v0, "ProviderInstaller"

    .line 136
    .line 137
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    invoke-virtual {v7, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    invoke-static {v0, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 146
    .line 147
    .line 148
    :cond_2
    :goto_2
    move-object v6, v8

    .line 149
    :goto_3
    if-eqz v6, :cond_3

    .line 150
    .line 151
    const-string p0, "com.google.android.gms.common.security.ProviderInstallerImpl"

    .line 152
    .line 153
    invoke-static {v6, p0}, LD7/a;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    monitor-exit v4

    .line 157
    :goto_4
    return-void

    .line 158
    :cond_3
    const-string p0, "ProviderInstaller"

    .line 159
    .line 160
    const-string v0, "Failed to get remote context"

    .line 161
    .line 162
    invoke-static {p0, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 163
    .line 164
    .line 165
    new-instance p0, Ld7/g;

    .line 166
    .line 167
    invoke-direct {p0}, Ljava/lang/Exception;-><init>()V

    .line 168
    .line 169
    .line 170
    throw p0

    .line 171
    :goto_5
    monitor-exit v4
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 172
    throw p0
.end method

.method public static b(Landroid/content/Context;Ljava/lang/String;)V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    :try_start_0
    sget-object v2, LD7/a;->c:Ljava/lang/reflect/Method;

    .line 4
    .line 5
    if-nez v2, :cond_0

    .line 6
    .line 7
    new-array v2, v1, [Ljava/lang/Class;

    .line 8
    .line 9
    const-class v3, Landroid/content/Context;

    .line 10
    .line 11
    aput-object v3, v2, v0

    .line 12
    .line 13
    const-string v3, "insertProvider"

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    invoke-virtual {v4, p1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p1, v3, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    sput-object p1, LD7/a;->c:Ljava/lang/reflect/Method;

    .line 28
    .line 29
    :cond_0
    sget-object p1, LD7/a;->c:Ljava/lang/reflect/Method;

    .line 30
    .line 31
    new-array v1, v1, [Ljava/lang/Object;

    .line 32
    .line 33
    aput-object p0, v1, v0

    .line 34
    .line 35
    const/4 p0, 0x0

    .line 36
    invoke-virtual {p1, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :catch_0
    move-exception p0

    .line 41
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    const-string v0, "ProviderInstaller"

    .line 46
    .line 47
    const/4 v1, 0x6

    .line 48
    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eqz v1, :cond_2

    .line 53
    .line 54
    if-nez p1, :cond_1

    .line 55
    .line 56
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    goto :goto_0

    .line 61
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    :goto_0
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    const-string p1, "Failed to install provider: "

    .line 70
    .line 71
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-static {v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 76
    .line 77
    .line 78
    :cond_2
    new-instance p0, Ld7/g;

    .line 79
    .line 80
    invoke-direct {p0}, Ljava/lang/Exception;-><init>()V

    .line 81
    .line 82
    .line 83
    throw p0
.end method
