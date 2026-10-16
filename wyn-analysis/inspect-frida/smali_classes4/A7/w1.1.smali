.class public final LA7/w1;
.super LA7/G1;
.source "SourceFile"


# instance fields
.field public final d:Ljava/util/HashMap;

.field public final e:LA7/a0;

.field public final f:LA7/a0;

.field public final g:LA7/a0;

.field public final h:LA7/a0;

.field public final i:LA7/a0;

.field public final j:LA7/a0;


# direct methods
.method public constructor <init>(LA7/L1;)V
    .locals 4

    .line 1
    invoke-direct {p0, p1}, LA7/G1;-><init>(LA7/L1;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, LA7/w1;->d:Ljava/util/HashMap;

    .line 10
    .line 11
    new-instance p1, LA7/a0;

    .line 12
    .line 13
    invoke-virtual {p0}, LA7/B0;->a0()LA7/Z;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const-string v1, "last_delete_stale"

    .line 18
    .line 19
    const-wide/16 v2, 0x0

    .line 20
    .line 21
    invoke-direct {p1, v0, v1, v2, v3}, LA7/a0;-><init>(LA7/Z;Ljava/lang/String;J)V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, LA7/w1;->e:LA7/a0;

    .line 25
    .line 26
    new-instance p1, LA7/a0;

    .line 27
    .line 28
    invoke-virtual {p0}, LA7/B0;->a0()LA7/Z;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    const-string v1, "last_delete_stale_batch"

    .line 33
    .line 34
    invoke-direct {p1, v0, v1, v2, v3}, LA7/a0;-><init>(LA7/Z;Ljava/lang/String;J)V

    .line 35
    .line 36
    .line 37
    iput-object p1, p0, LA7/w1;->f:LA7/a0;

    .line 38
    .line 39
    new-instance p1, LA7/a0;

    .line 40
    .line 41
    invoke-virtual {p0}, LA7/B0;->a0()LA7/Z;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    const-string v1, "backoff"

    .line 46
    .line 47
    invoke-direct {p1, v0, v1, v2, v3}, LA7/a0;-><init>(LA7/Z;Ljava/lang/String;J)V

    .line 48
    .line 49
    .line 50
    iput-object p1, p0, LA7/w1;->g:LA7/a0;

    .line 51
    .line 52
    new-instance p1, LA7/a0;

    .line 53
    .line 54
    invoke-virtual {p0}, LA7/B0;->a0()LA7/Z;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    const-string v1, "last_upload"

    .line 59
    .line 60
    invoke-direct {p1, v0, v1, v2, v3}, LA7/a0;-><init>(LA7/Z;Ljava/lang/String;J)V

    .line 61
    .line 62
    .line 63
    iput-object p1, p0, LA7/w1;->h:LA7/a0;

    .line 64
    .line 65
    new-instance p1, LA7/a0;

    .line 66
    .line 67
    invoke-virtual {p0}, LA7/B0;->a0()LA7/Z;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    const-string v1, "last_upload_attempt"

    .line 72
    .line 73
    invoke-direct {p1, v0, v1, v2, v3}, LA7/a0;-><init>(LA7/Z;Ljava/lang/String;J)V

    .line 74
    .line 75
    .line 76
    iput-object p1, p0, LA7/w1;->i:LA7/a0;

    .line 77
    .line 78
    new-instance p1, LA7/a0;

    .line 79
    .line 80
    invoke-virtual {p0}, LA7/B0;->a0()LA7/Z;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    const-string v1, "midnight_offset"

    .line 85
    .line 86
    invoke-direct {p1, v0, v1, v2, v3}, LA7/a0;-><init>(LA7/Z;Ljava/lang/String;J)V

    .line 87
    .line 88
    .line 89
    iput-object p1, p0, LA7/w1;->j:LA7/a0;

    .line 90
    .line 91
    return-void
.end method


# virtual methods
.method public final j0()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final k0(Ljava/lang/String;Z)Ljava/lang/String;
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0}, LA7/B0;->c0()V

    .line 3
    .line 4
    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, p1}, LA7/w1;->l0(Ljava/lang/String;)Landroid/util/Pair;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iget-object p1, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p1, Ljava/lang/String;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const-string p1, "00000000-0000-0000-0000-000000000000"

    .line 17
    .line 18
    :goto_0
    invoke-static {}, LA7/U1;->q1()Ljava/security/MessageDigest;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    if-nez p2, :cond_1

    .line 23
    .line 24
    const/4 p1, 0x0

    .line 25
    return-object p1

    .line 26
    :cond_1
    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 27
    .line 28
    new-instance v2, Ljava/math/BigInteger;

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {p2, p1}, Ljava/security/MessageDigest;->digest([B)[B

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-direct {v2, v0, p1}, Ljava/math/BigInteger;-><init>(I[B)V

    .line 39
    .line 40
    .line 41
    new-array p1, v0, [Ljava/lang/Object;

    .line 42
    .line 43
    const/4 p2, 0x0

    .line 44
    aput-object v2, p1, p2

    .line 45
    .line 46
    const-string p2, "%032X"

    .line 47
    .line 48
    invoke-static {v1, p2, p1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    return-object p1
.end method

.method public final l0(Ljava/lang/String;)Landroid/util/Pair;
    .locals 14

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    invoke-virtual {p0}, LA7/B0;->c0()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, LA7/B0;->a:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, LA7/n0;

    .line 9
    .line 10
    iget-object v2, v1, LA7/n0;->n:Ln7/b;

    .line 11
    .line 12
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 16
    .line 17
    .line 18
    move-result-wide v2

    .line 19
    iget-object v4, p0, LA7/w1;->d:Ljava/util/HashMap;

    .line 20
    .line 21
    invoke-virtual {v4, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    check-cast v5, LA7/v1;

    .line 26
    .line 27
    if-eqz v5, :cond_0

    .line 28
    .line 29
    iget-wide v6, v5, LA7/v1;->c:J

    .line 30
    .line 31
    cmp-long v6, v2, v6

    .line 32
    .line 33
    if-gez v6, :cond_0

    .line 34
    .line 35
    new-instance p1, Landroid/util/Pair;

    .line 36
    .line 37
    iget-boolean v0, v5, LA7/v1;->b:Z

    .line 38
    .line 39
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iget-object v1, v5, LA7/v1;->a:Ljava/lang/String;

    .line 44
    .line 45
    invoke-direct {p1, v1, v0}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    return-object p1

    .line 49
    :cond_0
    const/4 v6, 0x1

    .line 50
    invoke-static {v6}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;->setShouldSkipGmsCoreVersionCheck(Z)V

    .line 51
    .line 52
    .line 53
    iget-object v6, v1, LA7/n0;->g:LA7/e;

    .line 54
    .line 55
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    sget-object v7, LA7/y;->b:LA7/D;

    .line 59
    .line 60
    invoke-virtual {v6, p1, v7}, LA7/e;->j0(Ljava/lang/String;LA7/D;)J

    .line 61
    .line 62
    .line 63
    move-result-wide v7

    .line 64
    add-long/2addr v7, v2

    .line 65
    const/4 v9, 0x0

    .line 66
    :try_start_0
    iget-object v1, v1, LA7/n0;->a:Landroid/content/Context;

    .line 67
    .line 68
    invoke-static {v1}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;->getAdvertisingIdInfo(Landroid/content/Context;)Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;

    .line 69
    .line 70
    .line 71
    move-result-object v1
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 72
    goto :goto_0

    .line 73
    :catch_0
    move-exception v1

    .line 74
    goto :goto_1

    .line 75
    :catch_1
    if-eqz v5, :cond_1

    .line 76
    .line 77
    :try_start_1
    iget-wide v10, v5, LA7/v1;->c:J

    .line 78
    .line 79
    sget-object v1, LA7/y;->c:LA7/D;

    .line 80
    .line 81
    invoke-virtual {v6, p1, v1}, LA7/e;->j0(Ljava/lang/String;LA7/D;)J

    .line 82
    .line 83
    .line 84
    move-result-wide v12

    .line 85
    add-long/2addr v10, v12

    .line 86
    cmp-long v1, v2, v10

    .line 87
    .line 88
    if-gez v1, :cond_1

    .line 89
    .line 90
    new-instance v1, Landroid/util/Pair;

    .line 91
    .line 92
    iget-object v2, v5, LA7/v1;->a:Ljava/lang/String;

    .line 93
    .line 94
    iget-boolean v3, v5, LA7/v1;->b:Z

    .line 95
    .line 96
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    invoke-direct {v1, v2, v3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    return-object v1

    .line 104
    :cond_1
    const/4 v1, 0x0

    .line 105
    :goto_0
    if-nez v1, :cond_2

    .line 106
    .line 107
    new-instance v1, Landroid/util/Pair;

    .line 108
    .line 109
    const-string v2, "00000000-0000-0000-0000-000000000000"

    .line 110
    .line 111
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 112
    .line 113
    invoke-direct {v1, v2, v3}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    return-object v1

    .line 117
    :cond_2
    invoke-virtual {v1}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;->getId()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    if-eqz v2, :cond_3

    .line 122
    .line 123
    new-instance v3, LA7/v1;

    .line 124
    .line 125
    invoke-virtual {v1}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;->isLimitAdTrackingEnabled()Z

    .line 126
    .line 127
    .line 128
    move-result v1

    .line 129
    invoke-direct {v3, v2, v7, v8, v1}, LA7/v1;-><init>(Ljava/lang/String;JZ)V

    .line 130
    .line 131
    .line 132
    goto :goto_2

    .line 133
    :cond_3
    new-instance v3, LA7/v1;

    .line 134
    .line 135
    invoke-virtual {v1}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;->isLimitAdTrackingEnabled()Z

    .line 136
    .line 137
    .line 138
    move-result v1

    .line 139
    invoke-direct {v3, v0, v7, v8, v1}, LA7/v1;-><init>(Ljava/lang/String;JZ)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 140
    .line 141
    .line 142
    goto :goto_2

    .line 143
    :goto_1
    invoke-virtual {p0}, LA7/B0;->zzj()LA7/N;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    const-string v3, "Unable to get advertising id"

    .line 148
    .line 149
    iget-object v2, v2, LA7/N;->m:LA7/P;

    .line 150
    .line 151
    invoke-virtual {v2, v3, v1}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    new-instance v3, LA7/v1;

    .line 155
    .line 156
    invoke-direct {v3, v0, v7, v8, v9}, LA7/v1;-><init>(Ljava/lang/String;JZ)V

    .line 157
    .line 158
    .line 159
    :goto_2
    invoke-virtual {v4, p1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    invoke-static {v9}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;->setShouldSkipGmsCoreVersionCheck(Z)V

    .line 163
    .line 164
    .line 165
    new-instance p1, Landroid/util/Pair;

    .line 166
    .line 167
    iget-boolean v0, v3, LA7/v1;->b:Z

    .line 168
    .line 169
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    iget-object v1, v3, LA7/v1;->a:Ljava/lang/String;

    .line 174
    .line 175
    invoke-direct {p1, v1, v0}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    return-object p1
.end method
