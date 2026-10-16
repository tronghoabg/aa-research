.class public final Ld7/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static c:Ld7/j;


# instance fields
.field public a:Ljava/lang/Object;

.field public volatile b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ld7/j;->a:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(Landroid/content/Context;)Ld7/j;
    .locals 2

    .line 1
    invoke-static {p0}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    const-class v0, Ld7/j;

    .line 5
    .line 6
    monitor-enter v0

    .line 7
    :try_start_0
    sget-object v1, Ld7/j;->c:Ld7/j;

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    invoke-static {p0}, Ld7/r;->a(Landroid/content/Context;)V

    .line 12
    .line 13
    .line 14
    new-instance v1, Ld7/j;

    .line 15
    .line 16
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    iput-object p0, v1, Ld7/j;->a:Ljava/lang/Object;

    .line 24
    .line 25
    sput-object v1, Ld7/j;->c:Ld7/j;

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :catchall_0
    move-exception p0

    .line 29
    goto :goto_1

    .line 30
    :cond_0
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    sget-object p0, Ld7/j;->c:Ld7/j;

    .line 32
    .line 33
    return-object p0

    .line 34
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 35
    throw p0
.end method

.method public static final f(Landroid/content/pm/PackageInfo;Z)Z
    .locals 10

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    goto/16 :goto_9

    .line 6
    .line 7
    :cond_0
    if-eqz p1, :cond_4

    .line 8
    .line 9
    iget-object v2, p0, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    .line 10
    .line 11
    const-string v3, "com.android.vending"

    .line 12
    .line 13
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-nez v2, :cond_1

    .line 18
    .line 19
    iget-object v2, p0, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    .line 20
    .line 21
    const-string v3, "com.google.android.gms"

    .line 22
    .line 23
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_4

    .line 28
    .line 29
    :cond_1
    iget-object p1, p0, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 30
    .line 31
    if-nez p1, :cond_3

    .line 32
    .line 33
    :cond_2
    move p1, v1

    .line 34
    goto :goto_0

    .line 35
    :cond_3
    iget p1, p1, Landroid/content/pm/ApplicationInfo;->flags:I

    .line 36
    .line 37
    and-int/lit16 p1, p1, 0x81

    .line 38
    .line 39
    if-eqz p1, :cond_2

    .line 40
    .line 41
    move p1, v0

    .line 42
    :cond_4
    :goto_0
    if-eqz p1, :cond_5

    .line 43
    .line 44
    :try_start_0
    sget-object v2, Ld7/q;->c:Lcom/google/android/gms/internal/common/zzah;

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_5
    sget-object v2, Ld7/q;->b:Lcom/google/android/gms/internal/common/zzah;

    .line 48
    .line 49
    :goto_1
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 50
    .line 51
    const/16 v4, 0x1c

    .line 52
    .line 53
    if-ge v3, v4, :cond_8

    .line 54
    .line 55
    iget-object v3, p0, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    .line 56
    .line 57
    const/4 v4, 0x0

    .line 58
    if-eqz v3, :cond_6

    .line 59
    .line 60
    array-length v5, v3

    .line 61
    if-ne v5, v0, :cond_6

    .line 62
    .line 63
    aget-object v3, v3, v1

    .line 64
    .line 65
    invoke-virtual {v3}, Landroid/content/pm/Signature;->toByteArray()[B

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    :cond_6
    if-eqz v4, :cond_7

    .line 70
    .line 71
    invoke-static {v4}, Lcom/google/android/gms/internal/common/zzah;->zzk(Ljava/lang/Object;)Lcom/google/android/gms/internal/common/zzah;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    goto :goto_5

    .line 76
    :cond_7
    invoke-static {}, Lcom/google/android/gms/internal/common/zzah;->zzj()Lcom/google/android/gms/internal/common/zzah;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    goto :goto_5

    .line 81
    :cond_8
    if-lt v3, v4, :cond_9

    .line 82
    .line 83
    move v3, v0

    .line 84
    goto :goto_2

    .line 85
    :cond_9
    move v3, v1

    .line 86
    :goto_2
    invoke-static {v3}, Lcom/google/android/gms/internal/common/zzr;->zza(Z)V

    .line 87
    .line 88
    .line 89
    invoke-static {p0}, Lcom/bytedance/sdk/component/lw/oa/yo/oa/a;->e(Landroid/content/pm/PackageInfo;)Landroid/content/pm/SigningInfo;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    if-eqz v3, :cond_c

    .line 94
    .line 95
    invoke-static {v3}, Lcom/bytedance/sdk/component/lw/oa/yo/oa/a;->r(Landroid/content/pm/SigningInfo;)Z

    .line 96
    .line 97
    .line 98
    move-result v4

    .line 99
    if-nez v4, :cond_c

    .line 100
    .line 101
    invoke-static {v3}, Lcom/bytedance/sdk/component/lw/oa/yo/oa/a;->z(Landroid/content/pm/SigningInfo;)[Landroid/content/pm/Signature;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    if-nez v4, :cond_a

    .line 106
    .line 107
    goto :goto_4

    .line 108
    :cond_a
    sget v4, Lcom/google/android/gms/internal/common/zzah;->zzd:I

    .line 109
    .line 110
    new-instance v4, Lcom/google/android/gms/internal/common/zzad;

    .line 111
    .line 112
    invoke-direct {v4}, Lcom/google/android/gms/internal/common/zzad;-><init>()V

    .line 113
    .line 114
    .line 115
    invoke-static {v3}, Lcom/bytedance/sdk/component/lw/oa/yo/oa/a;->z(Landroid/content/pm/SigningInfo;)[Landroid/content/pm/Signature;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    array-length v5, v3

    .line 120
    move v6, v1

    .line 121
    :goto_3
    if-ge v6, v5, :cond_b

    .line 122
    .line 123
    aget-object v7, v3, v6

    .line 124
    .line 125
    invoke-virtual {v7}, Landroid/content/pm/Signature;->toByteArray()[B

    .line 126
    .line 127
    .line 128
    move-result-object v7

    .line 129
    invoke-virtual {v4, v7}, Lcom/google/android/gms/internal/common/zzad;->zzb(Ljava/lang/Object;)Lcom/google/android/gms/internal/common/zzad;

    .line 130
    .line 131
    .line 132
    add-int/2addr v6, v0

    .line 133
    goto :goto_3

    .line 134
    :cond_b
    invoke-virtual {v4}, Lcom/google/android/gms/internal/common/zzad;->zzd()Lcom/google/android/gms/internal/common/zzah;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    goto :goto_5

    .line 139
    :cond_c
    :goto_4
    invoke-static {}, Lcom/google/android/gms/internal/common/zzah;->zzj()Lcom/google/android/gms/internal/common/zzah;

    .line 140
    .line 141
    .line 142
    move-result-object v3

    .line 143
    :goto_5
    invoke-virtual {v3}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 144
    .line 145
    .line 146
    move-result v4

    .line 147
    if-nez v4, :cond_f

    .line 148
    .line 149
    invoke-virtual {v3}, Lcom/google/android/gms/internal/common/zzah;->zzh()Lcom/google/android/gms/internal/common/zzah;

    .line 150
    .line 151
    .line 152
    move-result-object v3

    .line 153
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 154
    .line 155
    .line 156
    move-result v4

    .line 157
    move v5, v1

    .line 158
    :goto_6
    if-ge v5, v4, :cond_11

    .line 159
    .line 160
    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v6

    .line 164
    check-cast v6, [B

    .line 165
    .line 166
    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/common/zzah;->zzr(I)Lcom/google/android/gms/internal/common/zzal;

    .line 167
    .line 168
    .line 169
    move-result-object v7

    .line 170
    :cond_d
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 171
    .line 172
    .line 173
    move-result v8

    .line 174
    add-int/lit8 v9, v5, 0x1

    .line 175
    .line 176
    if-eqz v8, :cond_e

    .line 177
    .line 178
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v8

    .line 182
    check-cast v8, [B

    .line 183
    .line 184
    invoke-static {v6, v8}, Ljava/util/Arrays;->equals([B[B)Z

    .line 185
    .line 186
    .line 187
    move-result v8

    .line 188
    if-eqz v8, :cond_d

    .line 189
    .line 190
    goto :goto_8

    .line 191
    :cond_e
    move v5, v9

    .line 192
    goto :goto_6

    .line 193
    :cond_f
    const-string v2, "Unable to obtain package certificate history."

    .line 194
    .line 195
    new-instance v3, Ljava/lang/IllegalArgumentException;

    .line 196
    .line 197
    invoke-direct {v3, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    throw v3
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 201
    :catch_0
    const-string v2, "GoogleSignatureVerifier"

    .line 202
    .line 203
    const-string v3, "package info is not set correctly"

    .line 204
    .line 205
    invoke-static {v2, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 206
    .line 207
    .line 208
    if-eqz p1, :cond_10

    .line 209
    .line 210
    sget-object p1, Ld7/q;->a:[Ld7/n;

    .line 211
    .line 212
    invoke-static {p0, p1}, Ld7/j;->g(Landroid/content/pm/PackageInfo;[Ld7/n;)Ld7/n;

    .line 213
    .line 214
    .line 215
    move-result-object p0

    .line 216
    goto :goto_7

    .line 217
    :cond_10
    sget-object p1, Ld7/q;->a:[Ld7/n;

    .line 218
    .line 219
    aget-object p1, p1, v1

    .line 220
    .line 221
    new-array v2, v0, [Ld7/n;

    .line 222
    .line 223
    aput-object p1, v2, v1

    .line 224
    .line 225
    invoke-static {p0, v2}, Ld7/j;->g(Landroid/content/pm/PackageInfo;[Ld7/n;)Ld7/n;

    .line 226
    .line 227
    .line 228
    move-result-object p0

    .line 229
    :goto_7
    if-eqz p0, :cond_11

    .line 230
    .line 231
    :goto_8
    return v0

    .line 232
    :cond_11
    :goto_9
    return v1
.end method

.method public static varargs g(Landroid/content/pm/PackageInfo;[Ld7/n;)Ld7/n;
    .locals 3

    .line 1
    iget-object v0, p0, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    goto :goto_1

    .line 7
    :cond_0
    array-length v0, v0

    .line 8
    const/4 v2, 0x1

    .line 9
    if-eq v0, v2, :cond_1

    .line 10
    .line 11
    const-string p0, "GoogleSignatureVerifier"

    .line 12
    .line 13
    const-string p1, "Package has more than one signature."

    .line 14
    .line 15
    invoke-static {p0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 16
    .line 17
    .line 18
    return-object v1

    .line 19
    :cond_1
    new-instance v0, Ld7/o;

    .line 20
    .line 21
    iget-object p0, p0, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    aget-object p0, p0, v2

    .line 25
    .line 26
    invoke-virtual {p0}, Landroid/content/pm/Signature;->toByteArray()[B

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-direct {v0, p0}, Ld7/o;-><init>([B)V

    .line 31
    .line 32
    .line 33
    :goto_0
    array-length p0, p1

    .line 34
    if-ge v2, p0, :cond_3

    .line 35
    .line 36
    aget-object p0, p1, v2

    .line 37
    .line 38
    invoke-virtual {p0, v0}, Ld7/n;->equals(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    if-eqz p0, :cond_2

    .line 43
    .line 44
    aget-object p0, p1, v2

    .line 45
    .line 46
    return-object p0

    .line 47
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_3
    :goto_1
    return-object v1
.end method


# virtual methods
.method public a()LG4/a;
    .locals 4

    .line 1
    iget-object v0, p0, Ld7/j;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LG4/a;

    .line 4
    .line 5
    if-nez v0, :cond_6

    .line 6
    .line 7
    monitor-enter p0

    .line 8
    :try_start_0
    iget-object v0, p0, Ld7/j;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, LG4/a;

    .line 11
    .line 12
    if-nez v0, :cond_4

    .line 13
    .line 14
    iget-object v0, p0, Ld7/j;->a:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, LS3/l;

    .line 17
    .line 18
    iget-object v0, v0, LS3/l;->a:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, LG4/c;

    .line 21
    .line 22
    iget-object v0, v0, LG4/c;->a:Landroid/content/Context;

    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    const/4 v1, 0x0

    .line 29
    if-nez v0, :cond_0

    .line 30
    .line 31
    move-object v3, v1

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const-string v2, "image_manager_disk_cache"

    .line 34
    .line 35
    new-instance v3, Ljava/io/File;

    .line 36
    .line 37
    invoke-direct {v3, v0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    :goto_0
    if-nez v3, :cond_1

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    invoke-virtual {v3}, Ljava/io/File;->mkdirs()Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-nez v0, :cond_2

    .line 48
    .line 49
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-eqz v0, :cond_3

    .line 54
    .line 55
    invoke-virtual {v3}, Ljava/io/File;->isDirectory()Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-nez v0, :cond_2

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_2
    new-instance v1, LA7/c0;

    .line 63
    .line 64
    invoke-direct {v1, v3}, LA7/c0;-><init>(Ljava/io/File;)V

    .line 65
    .line 66
    .line 67
    :cond_3
    :goto_1
    iput-object v1, p0, Ld7/j;->b:Ljava/lang/Object;

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :catchall_0
    move-exception v0

    .line 71
    goto :goto_3

    .line 72
    :cond_4
    :goto_2
    iget-object v0, p0, Ld7/j;->b:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v0, LG4/a;

    .line 75
    .line 76
    if-nez v0, :cond_5

    .line 77
    .line 78
    new-instance v0, Lwa/a;

    .line 79
    .line 80
    const/16 v1, 0x12

    .line 81
    .line 82
    invoke-direct {v0, v1}, Lwa/a;-><init>(I)V

    .line 83
    .line 84
    .line 85
    iput-object v0, p0, Ld7/j;->b:Ljava/lang/Object;

    .line 86
    .line 87
    :cond_5
    monitor-exit p0

    .line 88
    goto :goto_4

    .line 89
    :goto_3
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 90
    throw v0

    .line 91
    :cond_6
    :goto_4
    iget-object v0, p0, Ld7/j;->b:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v0, LG4/a;

    .line 94
    .line 95
    return-object v0
.end method

.method public c(Lod/n1;)Lod/u;
    .locals 2

    .line 1
    iget-object v0, p0, Ld7/j;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lod/M0;

    .line 4
    .line 5
    iget-object v0, v0, Lod/M0;->y:Lmd/M;

    .line 6
    .line 7
    iget-object v1, p0, Ld7/j;->a:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Lod/M0;

    .line 10
    .line 11
    iget-object v1, v1, Lod/M0;->G:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    iget-object p1, p0, Ld7/j;->a:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p1, Lod/M0;

    .line 22
    .line 23
    iget-object p1, p1, Lod/M0;->E:Lod/H;

    .line 24
    .line 25
    return-object p1

    .line 26
    :cond_0
    if-nez v0, :cond_1

    .line 27
    .line 28
    iget-object p1, p0, Ld7/j;->a:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p1, Lod/M0;

    .line 31
    .line 32
    iget-object p1, p1, Lod/M0;->m:Lmd/n0;

    .line 33
    .line 34
    new-instance v0, Lg5/d;

    .line 35
    .line 36
    const/16 v1, 0x8

    .line 37
    .line 38
    invoke-direct {v0, p0, v1}, Lg5/d;-><init>(Ljava/lang/Object;I)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, v0}, Lmd/n0;->execute(Ljava/lang/Runnable;)V

    .line 42
    .line 43
    .line 44
    iget-object p1, p0, Ld7/j;->a:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p1, Lod/M0;

    .line 47
    .line 48
    iget-object p1, p1, Lod/M0;->E:Lod/H;

    .line 49
    .line 50
    return-object p1

    .line 51
    :cond_1
    invoke-virtual {v0, p1}, Lmd/M;->a(Lod/n1;)Lmd/K;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    iget-object p1, p1, Lod/n1;->a:Lmd/c;

    .line 56
    .line 57
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 58
    .line 59
    iget-object p1, p1, Lmd/c;->f:Ljava/lang/Boolean;

    .line 60
    .line 61
    invoke-virtual {v1, p1}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    invoke-static {v0, p1}, Lod/a0;->f(Lmd/K;Z)Lod/u;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    if-eqz p1, :cond_2

    .line 70
    .line 71
    return-object p1

    .line 72
    :cond_2
    iget-object p1, p0, Ld7/j;->a:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast p1, Lod/M0;

    .line 75
    .line 76
    iget-object p1, p1, Lod/M0;->E:Lod/H;

    .line 77
    .line 78
    return-object p1
.end method

.method public d(Lmd/m;)V
    .locals 2

    .line 1
    const-string v0, "newState"

    .line 2
    .line 3
    invoke-static {p1, v0}, LFe/e;->t(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ld7/j;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lmd/m;

    .line 9
    .line 10
    if-eq v0, p1, :cond_1

    .line 11
    .line 12
    iget-object v0, p0, Ld7/j;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lmd/m;

    .line 15
    .line 16
    sget-object v1, Lmd/m;->e:Lmd/m;

    .line 17
    .line 18
    if-eq v0, v1, :cond_1

    .line 19
    .line 20
    iput-object p1, p0, Ld7/j;->b:Ljava/lang/Object;

    .line 21
    .line 22
    iget-object p1, p0, Ld7/j;->a:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast p1, Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-eqz p1, :cond_0

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_0
    iget-object p1, p0, Ld7/j;->a:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p1, Ljava/util/ArrayList;

    .line 36
    .line 37
    new-instance v0, Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 40
    .line 41
    .line 42
    iput-object v0, p0, Ld7/j;->a:Ljava/lang/Object;

    .line 43
    .line 44
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-eqz v0, :cond_1

    .line 53
    .line 54
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    check-cast v0, Lod/z;

    .line 59
    .line 60
    iget-object v1, v0, Lod/z;->a:Lv9/n;

    .line 61
    .line 62
    iget-object v0, v0, Lod/z;->b:Ljava/util/concurrent/Executor;

    .line 63
    .line 64
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_1
    :goto_1
    return-void
.end method

.method public e(I)Z
    .locals 20

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const/4 v2, 0x1

    .line 4
    iget-object v0, v1, Ld7/j;->a:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Landroid/content/Context;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    move/from16 v3, p1

    .line 13
    .line 14
    invoke-virtual {v0, v3}, Landroid/content/pm/PackageManager;->getPackagesForUid(I)[Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    if-eqz v3, :cond_f

    .line 19
    .line 20
    array-length v4, v3

    .line 21
    if-nez v4, :cond_0

    .line 22
    .line 23
    goto/16 :goto_d

    .line 24
    .line 25
    :cond_0
    const/4 v5, 0x0

    .line 26
    const/4 v6, 0x0

    .line 27
    move v7, v5

    .line 28
    move-object v0, v6

    .line 29
    :goto_0
    if-ge v7, v4, :cond_e

    .line 30
    .line 31
    aget-object v9, v3, v7

    .line 32
    .line 33
    const-string v8, "GoogleCertificates"

    .line 34
    .line 35
    const-string v10, "Failed to get Google certificates from remote"

    .line 36
    .line 37
    const-string v11, "null pkg"

    .line 38
    .line 39
    if-nez v9, :cond_1

    .line 40
    .line 41
    invoke-static {v11}, Ld7/w;->b(Ljava/lang/String;)Ld7/w;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    goto/16 :goto_c

    .line 46
    .line 47
    :cond_1
    iget-object v0, v1, Ld7/j;->b:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v0, Ljava/lang/String;

    .line 50
    .line 51
    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-nez v0, :cond_b

    .line 56
    .line 57
    sget-object v0, Ld7/r;->a:Ld7/m;

    .line 58
    .line 59
    invoke-static {}, Landroid/os/StrictMode;->allowThreadDiskReads()Landroid/os/StrictMode$ThreadPolicy;

    .line 60
    .line 61
    .line 62
    move-result-object v12

    .line 63
    :try_start_0
    invoke-static {}, Ld7/r;->b()V

    .line 64
    .line 65
    .line 66
    sget-object v0, Ld7/r;->c:Lcom/google/android/gms/common/internal/K;

    .line 67
    .line 68
    check-cast v0, Lcom/google/android/gms/common/internal/I;

    .line 69
    .line 70
    invoke-virtual {v0}, Lcom/google/android/gms/internal/common/zza;->zza()Landroid/os/Parcel;

    .line 71
    .line 72
    .line 73
    move-result-object v13

    .line 74
    const/4 v14, 0x7

    .line 75
    invoke-virtual {v0, v14, v13}, Lcom/google/android/gms/internal/common/zza;->zzB(ILandroid/os/Parcel;)Landroid/os/Parcel;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-static {v0}, Lcom/google/android/gms/internal/common/zzc;->zza(Landroid/os/Parcel;)Z

    .line 80
    .line 81
    .line 82
    move-result v13

    .line 83
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V
    :try_end_0
    .catch Lr7/a; {:try_start_0 .. :try_end_0} :catch_3
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 84
    .line 85
    .line 86
    invoke-static {v12}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 87
    .line 88
    .line 89
    if-eqz v13, :cond_5

    .line 90
    .line 91
    iget-object v0, v1, Ld7/j;->a:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v0, Landroid/content/Context;

    .line 94
    .line 95
    invoke-static {v0}, Ld7/i;->b(Landroid/content/Context;)Z

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    invoke-static {}, Landroid/os/StrictMode;->allowThreadDiskReads()Landroid/os/StrictMode$ThreadPolicy;

    .line 100
    .line 101
    .line 102
    move-result-object v16

    .line 103
    :try_start_1
    const-string v11, "module init: "

    .line 104
    .line 105
    sget-object v12, Ld7/r;->e:Landroid/content/Context;

    .line 106
    .line 107
    invoke-static {v12}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 108
    .line 109
    .line 110
    :try_start_2
    invoke-static {}, Ld7/r;->b()V
    :try_end_2
    .catch Lr7/a; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 111
    .line 112
    .line 113
    :try_start_3
    sget-object v11, Ld7/r;->e:Landroid/content/Context;

    .line 114
    .line 115
    invoke-static {v11}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    sget-object v11, Ld7/r;->e:Landroid/content/Context;

    .line 119
    .line 120
    move-object v12, v8

    .line 121
    new-instance v8, Ld7/s;

    .line 122
    .line 123
    move-object v13, v12

    .line 124
    new-instance v12, Lq7/b;

    .line 125
    .line 126
    invoke-direct {v12, v11}, Lq7/b;-><init>(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    const/4 v14, 0x1

    .line 130
    const/4 v15, 0x0

    .line 131
    const/4 v11, 0x0

    .line 132
    move-object/from16 v17, v13

    .line 133
    .line 134
    const/4 v13, 0x0

    .line 135
    move-object/from16 v19, v10

    .line 136
    .line 137
    move-object/from16 v18, v17

    .line 138
    .line 139
    move v10, v0

    .line 140
    invoke-direct/range {v8 .. v15}, Ld7/s;-><init>(Ljava/lang/String;ZZLandroid/os/IBinder;ZZZ)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 141
    .line 142
    .line 143
    :try_start_4
    sget-object v0, Ld7/r;->c:Lcom/google/android/gms/common/internal/K;

    .line 144
    .line 145
    check-cast v0, Lcom/google/android/gms/common/internal/I;

    .line 146
    .line 147
    invoke-virtual {v0}, Lcom/google/android/gms/internal/common/zza;->zza()Landroid/os/Parcel;

    .line 148
    .line 149
    .line 150
    move-result-object v10

    .line 151
    invoke-static {v10, v8}, Lcom/google/android/gms/internal/common/zzc;->zzc(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    .line 152
    .line 153
    .line 154
    const/4 v8, 0x6

    .line 155
    invoke-virtual {v0, v8, v10}, Lcom/google/android/gms/internal/common/zza;->zzB(ILandroid/os/Parcel;)Landroid/os/Parcel;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    sget-object v8, Ld7/t;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 160
    .line 161
    invoke-static {v0, v8}, Lcom/google/android/gms/internal/common/zzc;->zzb(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 162
    .line 163
    .line 164
    move-result-object v8

    .line 165
    check-cast v8, Ld7/t;

    .line 166
    .line 167
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V
    :try_end_4
    .catch Landroid/os/RemoteException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 168
    .line 169
    .line 170
    :try_start_5
    iget-boolean v0, v8, Ld7/t;->a:Z

    .line 171
    .line 172
    if-eqz v0, :cond_2

    .line 173
    .line 174
    iget v0, v8, Ld7/t;->d:I

    .line 175
    .line 176
    invoke-static {v0}, Lp7/b;->W(I)I

    .line 177
    .line 178
    .line 179
    new-instance v0, Ld7/w;

    .line 180
    .line 181
    invoke-direct {v0, v6, v2, v6}, Ld7/w;-><init>(Ljava/lang/String;ZLjava/lang/Exception;)V

    .line 182
    .line 183
    .line 184
    goto :goto_4

    .line 185
    :cond_2
    iget-object v0, v8, Ld7/t;->b:Ljava/lang/String;

    .line 186
    .line 187
    iget v10, v8, Ld7/t;->c:I

    .line 188
    .line 189
    invoke-static {v10}, Lr7/e;->W(I)I

    .line 190
    .line 191
    .line 192
    move-result v10

    .line 193
    const/4 v11, 0x4

    .line 194
    if-ne v10, v11, :cond_3

    .line 195
    .line 196
    new-instance v10, Landroid/content/pm/PackageManager$NameNotFoundException;

    .line 197
    .line 198
    invoke-direct {v10}, Landroid/content/pm/PackageManager$NameNotFoundException;-><init>()V

    .line 199
    .line 200
    .line 201
    goto :goto_1

    .line 202
    :catchall_0
    move-exception v0

    .line 203
    goto :goto_5

    .line 204
    :cond_3
    move-object v10, v6

    .line 205
    :goto_1
    const-string v11, "error checking package certificate"

    .line 206
    .line 207
    if-nez v0, :cond_4

    .line 208
    .line 209
    move-object v0, v11

    .line 210
    :cond_4
    iget v11, v8, Ld7/t;->d:I

    .line 211
    .line 212
    invoke-static {v11}, Lp7/b;->W(I)I

    .line 213
    .line 214
    .line 215
    iget v8, v8, Ld7/t;->c:I

    .line 216
    .line 217
    invoke-static {v8}, Lr7/e;->W(I)I

    .line 218
    .line 219
    .line 220
    new-instance v8, Ld7/w;

    .line 221
    .line 222
    invoke-direct {v8, v0, v5, v10}, Ld7/w;-><init>(Ljava/lang/String;ZLjava/lang/Exception;)V

    .line 223
    .line 224
    .line 225
    move-object v0, v8

    .line 226
    goto :goto_4

    .line 227
    :goto_2
    move-object/from16 v13, v18

    .line 228
    .line 229
    move-object/from16 v8, v19

    .line 230
    .line 231
    goto :goto_3

    .line 232
    :catch_0
    move-exception v0

    .line 233
    goto :goto_2

    .line 234
    :goto_3
    invoke-static {v13, v8, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 235
    .line 236
    .line 237
    const-string v8, "module call"

    .line 238
    .line 239
    invoke-static {v8, v0}, Ld7/w;->c(Ljava/lang/String;Ljava/lang/Exception;)Ld7/w;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    goto :goto_4

    .line 244
    :catch_1
    move-exception v0

    .line 245
    move-object v13, v8

    .line 246
    move-object v8, v10

    .line 247
    invoke-static {v13, v8, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 248
    .line 249
    .line 250
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v8

    .line 254
    invoke-static {v8}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v8

    .line 258
    invoke-virtual {v11, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v8

    .line 262
    invoke-static {v8, v0}, Ld7/w;->c(Ljava/lang/String;Ljava/lang/Exception;)Ld7/w;

    .line 263
    .line 264
    .line 265
    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 266
    :goto_4
    invoke-static/range {v16 .. v16}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 267
    .line 268
    .line 269
    goto/16 :goto_a

    .line 270
    .line 271
    :goto_5
    invoke-static/range {v16 .. v16}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 272
    .line 273
    .line 274
    throw v0

    .line 275
    :catchall_1
    move-exception v0

    .line 276
    goto/16 :goto_b

    .line 277
    .line 278
    :catch_2
    move-exception v0

    .line 279
    :goto_6
    move-object v13, v8

    .line 280
    move-object v8, v10

    .line 281
    goto :goto_7

    .line 282
    :catch_3
    move-exception v0

    .line 283
    goto :goto_6

    .line 284
    :goto_7
    :try_start_6
    invoke-static {v13, v8, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 285
    .line 286
    .line 287
    invoke-static {v12}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 288
    .line 289
    .line 290
    :cond_5
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 291
    .line 292
    const/16 v8, 0x1c

    .line 293
    .line 294
    if-lt v0, v8, :cond_6

    .line 295
    .line 296
    const v0, 0x8000040

    .line 297
    .line 298
    .line 299
    goto :goto_8

    .line 300
    :cond_6
    const/16 v0, 0x40

    .line 301
    .line 302
    :goto_8
    :try_start_7
    iget-object v8, v1, Ld7/j;->a:Ljava/lang/Object;

    .line 303
    .line 304
    check-cast v8, Landroid/content/Context;

    .line 305
    .line 306
    invoke-virtual {v8}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 307
    .line 308
    .line 309
    move-result-object v8

    .line 310
    invoke-virtual {v8, v9, v0}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 311
    .line 312
    .line 313
    move-result-object v0
    :try_end_7
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_7 .. :try_end_7} :catch_4

    .line 314
    iget-object v8, v1, Ld7/j;->a:Ljava/lang/Object;

    .line 315
    .line 316
    check-cast v8, Landroid/content/Context;

    .line 317
    .line 318
    invoke-static {v8}, Ld7/i;->b(Landroid/content/Context;)Z

    .line 319
    .line 320
    .line 321
    move-result v8

    .line 322
    if-nez v0, :cond_7

    .line 323
    .line 324
    invoke-static {v11}, Ld7/w;->b(Ljava/lang/String;)Ld7/w;

    .line 325
    .line 326
    .line 327
    move-result-object v0

    .line 328
    goto :goto_a

    .line 329
    :cond_7
    iget-object v10, v0, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    .line 330
    .line 331
    if-eqz v10, :cond_a

    .line 332
    .line 333
    array-length v10, v10

    .line 334
    if-eq v10, v2, :cond_8

    .line 335
    .line 336
    goto :goto_9

    .line 337
    :cond_8
    new-instance v10, Ld7/o;

    .line 338
    .line 339
    iget-object v11, v0, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    .line 340
    .line 341
    aget-object v11, v11, v5

    .line 342
    .line 343
    invoke-virtual {v11}, Landroid/content/pm/Signature;->toByteArray()[B

    .line 344
    .line 345
    .line 346
    move-result-object v11

    .line 347
    invoke-direct {v10, v11}, Ld7/o;-><init>([B)V

    .line 348
    .line 349
    .line 350
    iget-object v11, v0, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    .line 351
    .line 352
    invoke-static {}, Landroid/os/StrictMode;->allowThreadDiskReads()Landroid/os/StrictMode$ThreadPolicy;

    .line 353
    .line 354
    .line 355
    move-result-object v12

    .line 356
    :try_start_8
    invoke-static {v11, v10, v8, v5}, Ld7/r;->c(Ljava/lang/String;Ld7/o;ZZ)Ld7/w;

    .line 357
    .line 358
    .line 359
    move-result-object v8
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 360
    invoke-static {v12}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 361
    .line 362
    .line 363
    iget-boolean v12, v8, Ld7/w;->a:Z

    .line 364
    .line 365
    if-eqz v12, :cond_9

    .line 366
    .line 367
    iget-object v0, v0, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 368
    .line 369
    if-eqz v0, :cond_9

    .line 370
    .line 371
    iget v0, v0, Landroid/content/pm/ApplicationInfo;->flags:I

    .line 372
    .line 373
    and-int/lit8 v0, v0, 0x2

    .line 374
    .line 375
    if-eqz v0, :cond_9

    .line 376
    .line 377
    invoke-static {}, Landroid/os/StrictMode;->allowThreadDiskReads()Landroid/os/StrictMode$ThreadPolicy;

    .line 378
    .line 379
    .line 380
    move-result-object v12

    .line 381
    :try_start_9
    invoke-static {v11, v10, v5, v2}, Ld7/r;->c(Ljava/lang/String;Ld7/o;ZZ)Ld7/w;

    .line 382
    .line 383
    .line 384
    move-result-object v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 385
    invoke-static {v12}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 386
    .line 387
    .line 388
    iget-boolean v0, v0, Ld7/w;->a:Z

    .line 389
    .line 390
    if-eqz v0, :cond_9

    .line 391
    .line 392
    const-string v0, "debuggable release cert app rejected"

    .line 393
    .line 394
    invoke-static {v0}, Ld7/w;->b(Ljava/lang/String;)Ld7/w;

    .line 395
    .line 396
    .line 397
    move-result-object v0

    .line 398
    goto :goto_a

    .line 399
    :catchall_2
    move-exception v0

    .line 400
    invoke-static {v12}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 401
    .line 402
    .line 403
    throw v0

    .line 404
    :cond_9
    move-object v0, v8

    .line 405
    goto :goto_a

    .line 406
    :catchall_3
    move-exception v0

    .line 407
    invoke-static {v12}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 408
    .line 409
    .line 410
    throw v0

    .line 411
    :cond_a
    :goto_9
    const-string v0, "single cert required"

    .line 412
    .line 413
    invoke-static {v0}, Ld7/w;->b(Ljava/lang/String;)Ld7/w;

    .line 414
    .line 415
    .line 416
    move-result-object v0

    .line 417
    :goto_a
    iget-boolean v8, v0, Ld7/w;->a:Z

    .line 418
    .line 419
    if-eqz v8, :cond_c

    .line 420
    .line 421
    iput-object v9, v1, Ld7/j;->b:Ljava/lang/Object;

    .line 422
    .line 423
    goto :goto_c

    .line 424
    :catch_4
    move-exception v0

    .line 425
    const-string v8, "no pkg "

    .line 426
    .line 427
    invoke-virtual {v8, v9}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 428
    .line 429
    .line 430
    move-result-object v8

    .line 431
    invoke-static {v8, v0}, Ld7/w;->c(Ljava/lang/String;Ljava/lang/Exception;)Ld7/w;

    .line 432
    .line 433
    .line 434
    move-result-object v0

    .line 435
    goto :goto_c

    .line 436
    :goto_b
    invoke-static {v12}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 437
    .line 438
    .line 439
    throw v0

    .line 440
    :cond_b
    sget-object v0, Ld7/w;->d:Ld7/w;

    .line 441
    .line 442
    :cond_c
    :goto_c
    iget-boolean v8, v0, Ld7/w;->a:Z

    .line 443
    .line 444
    if-eqz v8, :cond_d

    .line 445
    .line 446
    goto :goto_e

    .line 447
    :cond_d
    add-int/2addr v7, v2

    .line 448
    goto/16 :goto_0

    .line 449
    .line 450
    :cond_e
    invoke-static {v0}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 451
    .line 452
    .line 453
    goto :goto_e

    .line 454
    :cond_f
    :goto_d
    const-string v0, "no pkgs"

    .line 455
    .line 456
    invoke-static {v0}, Ld7/w;->b(Ljava/lang/String;)Ld7/w;

    .line 457
    .line 458
    .line 459
    move-result-object v0

    .line 460
    :goto_e
    iget-boolean v2, v0, Ld7/w;->a:Z

    .line 461
    .line 462
    if-nez v2, :cond_11

    .line 463
    .line 464
    const/4 v2, 0x3

    .line 465
    const-string v3, "GoogleCertificatesRslt"

    .line 466
    .line 467
    invoke-static {v3, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 468
    .line 469
    .line 470
    move-result v2

    .line 471
    if-eqz v2, :cond_11

    .line 472
    .line 473
    iget-object v2, v0, Ld7/w;->c:Ljava/lang/Exception;

    .line 474
    .line 475
    if-eqz v2, :cond_10

    .line 476
    .line 477
    invoke-virtual {v0}, Ld7/w;->a()Ljava/lang/String;

    .line 478
    .line 479
    .line 480
    move-result-object v4

    .line 481
    invoke-static {v3, v4, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 482
    .line 483
    .line 484
    goto :goto_f

    .line 485
    :cond_10
    invoke-virtual {v0}, Ld7/w;->a()Ljava/lang/String;

    .line 486
    .line 487
    .line 488
    move-result-object v2

    .line 489
    invoke-static {v3, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 490
    .line 491
    .line 492
    :cond_11
    :goto_f
    iget-boolean v0, v0, Ld7/w;->a:Z

    .line 493
    .line 494
    return v0
.end method
