.class final Lcom/google/android/gms/internal/ads/zzgip;
.super Lcom/google/android/gms/internal/ads/zzgji;
.source "SourceFile"


# instance fields
.field private final zza:Ljava/util/Map;

.field private final zzb:Landroid/content/Context;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzgen;

.field private final zzd:J

.field private final zze:J


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzaxt;Lcom/google/android/gms/internal/ads/zzgie;Ljava/util/Map;Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzgen;Lcom/google/android/gms/internal/ads/zzgdq;Lcom/google/android/gms/internal/ads/zzgqo;)V
    .locals 7

    .line 1
    const/16 v0, 0x71

    .line 2
    .line 3
    invoke-virtual {p7, v0}, Lcom/google/android/gms/internal/ads/zzgqo;->zza(I)Lcom/google/android/gms/internal/ads/zzgqm;

    .line 4
    .line 5
    .line 6
    move-result-object v6

    .line 7
    const-string v2, "6uD00qi6mV8zu6AkyeC5bCv3568B2wPeNuQXCAqDKxVcHdQxA+KxNWLV41zFPdNB"

    .line 8
    .line 9
    const-string v3, "4KiYmGZMrZQiVkw5xeVvBXbdnWwWVS3sMp2EDvInOL8="

    .line 10
    .line 11
    move-object v1, p0

    .line 12
    move-object v4, p1

    .line 13
    move-object v5, p2

    .line 14
    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/ads/zzgji;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzaxt;Lcom/google/android/gms/internal/ads/zzgie;Lcom/google/android/gms/internal/ads/zzgqm;)V

    .line 15
    .line 16
    .line 17
    iput-object p4, v1, Lcom/google/android/gms/internal/ads/zzgip;->zzb:Landroid/content/Context;

    .line 18
    .line 19
    iput-object p3, v1, Lcom/google/android/gms/internal/ads/zzgip;->zza:Ljava/util/Map;

    .line 20
    .line 21
    iput-object p5, v1, Lcom/google/android/gms/internal/ads/zzgip;->zzc:Lcom/google/android/gms/internal/ads/zzgen;

    .line 22
    .line 23
    invoke-virtual {p6}, Lcom/google/android/gms/internal/ads/zzgdq;->zzl()J

    .line 24
    .line 25
    .line 26
    move-result-wide p1

    .line 27
    iput-wide p1, v1, Lcom/google/android/gms/internal/ads/zzgip;->zzd:J

    .line 28
    .line 29
    invoke-virtual {p6}, Lcom/google/android/gms/internal/ads/zzgdq;->zzm()J

    .line 30
    .line 31
    .line 32
    move-result-wide p1

    .line 33
    iput-wide p1, v1, Lcom/google/android/gms/internal/ads/zzgip;->zze:J

    .line 34
    .line 35
    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/reflect/Method;Lcom/google/android/gms/internal/ads/zzaxt;)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalAccessException;,
            Ljava/lang/reflect/InvocationTargetException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzgip;->zzb:Landroid/content/Context;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzgip;->zzc:Lcom/google/android/gms/internal/ads/zzgen;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const/4 v2, 0x2

    .line 14
    new-array v3, v2, [Ljava/lang/Object;

    .line 15
    .line 16
    const/4 v4, 0x0

    .line 17
    aput-object v0, v3, v4

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    aput-object v1, v3, v0

    .line 21
    .line 22
    const-string v1, ""

    .line 23
    .line 24
    invoke-virtual {p1, v1, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    check-cast p1, [Ljava/lang/Object;

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    const-string v1, "E"

    .line 34
    .line 35
    :try_start_0
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzgip;->zza:Ljava/util/Map;

    .line 36
    .line 37
    const-string v5, "gs"

    .line 38
    .line 39
    invoke-interface {v3, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    check-cast v3, Lp8/p;

    .line 44
    .line 45
    if-eqz v3, :cond_1

    .line 46
    .line 47
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 48
    .line 49
    const/16 v6, 0x1f

    .line 50
    .line 51
    if-lt v5, v6, :cond_0

    .line 52
    .line 53
    invoke-interface {v3}, Ljava/util/concurrent/Future;->isDone()Z

    .line 54
    .line 55
    .line 56
    move-result v5

    .line 57
    if-eqz v5, :cond_1

    .line 58
    .line 59
    :cond_0
    iget-wide v5, p0, Lcom/google/android/gms/internal/ads/zzgip;->zzd:J

    .line 60
    .line 61
    sget-object v7, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 62
    .line 63
    invoke-interface {v3, v5, v6, v7}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    check-cast v3, Lcom/google/android/gms/internal/ads/zzayt;

    .line 68
    .line 69
    if-eqz v3, :cond_1

    .line 70
    .line 71
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzayt;->zzb()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v5

    .line 75
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 76
    .line 77
    .line 78
    move-result v5

    .line 79
    if-le v5, v0, :cond_1

    .line 80
    .line 81
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzayt;->zzb()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v1
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_0

    .line 85
    :catch_0
    :cond_1
    const-string v3, "E"

    .line 86
    .line 87
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v3

    .line 91
    if-eqz v3, :cond_2

    .line 92
    .line 93
    :try_start_1
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzgip;->zza:Ljava/util/Map;

    .line 94
    .line 95
    const-string v5, "ai"

    .line 96
    .line 97
    invoke-interface {v3, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    check-cast v3, Lp8/p;

    .line 102
    .line 103
    if-eqz v3, :cond_2

    .line 104
    .line 105
    iget-wide v5, p0, Lcom/google/android/gms/internal/ads/zzgip;->zze:J

    .line 106
    .line 107
    sget-object v7, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 108
    .line 109
    invoke-interface {v3, v5, v6, v7}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    check-cast v3, Ljava/lang/String;

    .line 114
    .line 115
    invoke-static {v3}, Lcom/google/android/gms/internal/ads/zzgui;->zzc(Ljava/lang/String;)Z

    .line 116
    .line 117
    .line 118
    move-result v5
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/ClassCastException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_1 .. :try_end_1} :catch_1

    .line 119
    if-nez v5, :cond_2

    .line 120
    .line 121
    move-object v1, v3

    .line 122
    :catch_1
    :cond_2
    const/4 v3, 0x5

    .line 123
    aget-object v3, p1, v3

    .line 124
    .line 125
    check-cast v3, Ljava/lang/Boolean;

    .line 126
    .line 127
    monitor-enter p2

    .line 128
    const/4 v5, 0x4

    .line 129
    :try_start_2
    aget-object v5, p1, v5

    .line 130
    .line 131
    instance-of v6, v5, [B

    .line 132
    .line 133
    if-eqz v6, :cond_3

    .line 134
    .line 135
    check-cast v5, [B

    .line 136
    .line 137
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgzo;->zzn()Lcom/google/android/gms/internal/ads/zzgzo;

    .line 138
    .line 139
    .line 140
    move-result-object v6

    .line 141
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzgzo;->zzi()Lcom/google/android/gms/internal/ads/zzgzo;

    .line 142
    .line 143
    .line 144
    move-result-object v6

    .line 145
    array-length v7, v5

    .line 146
    invoke-virtual {v6, v5, v4, v7}, Lcom/google/android/gms/internal/ads/zzgzo;->zzj([BII)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v5

    .line 150
    sget-object v6, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 151
    .line 152
    invoke-virtual {v5, v6}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 153
    .line 154
    .line 155
    move-result-object v5

    .line 156
    const/16 v6, 0xb

    .line 157
    .line 158
    invoke-static {v5, v6}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v5

    .line 162
    goto :goto_0

    .line 163
    :catchall_0
    move-exception p1

    .line 164
    goto :goto_1

    .line 165
    :cond_3
    check-cast v5, Ljava/lang/String;

    .line 166
    .line 167
    :goto_0
    aget-object v4, p1, v4

    .line 168
    .line 169
    check-cast v4, Ljava/lang/Long;

    .line 170
    .line 171
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 172
    .line 173
    .line 174
    move-result-wide v6

    .line 175
    invoke-virtual {p2, v6, v7}, Lcom/google/android/gms/internal/ads/zzaxt;->zzu(J)Lcom/google/android/gms/internal/ads/zzaxt;

    .line 176
    .line 177
    .line 178
    aget-object v4, p1, v0

    .line 179
    .line 180
    check-cast v4, Ljava/lang/String;

    .line 181
    .line 182
    invoke-virtual {p2, v4}, Lcom/google/android/gms/internal/ads/zzaxt;->zzt(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzaxt;

    .line 183
    .line 184
    .line 185
    aget-object v4, p1, v2

    .line 186
    .line 187
    check-cast v4, Ljava/lang/String;

    .line 188
    .line 189
    invoke-virtual {p2, v4}, Lcom/google/android/gms/internal/ads/zzaxt;->zzD(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzaxt;

    .line 190
    .line 191
    .line 192
    const/4 v4, 0x3

    .line 193
    aget-object p1, p1, v4

    .line 194
    .line 195
    check-cast p1, Ljava/lang/String;

    .line 196
    .line 197
    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/zzaxt;->zzE(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzaxt;

    .line 198
    .line 199
    .line 200
    invoke-virtual {p2, v5}, Lcom/google/android/gms/internal/ads/zzaxt;->zzp(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzaxt;

    .line 201
    .line 202
    .line 203
    invoke-virtual {p2, v1}, Lcom/google/android/gms/internal/ads/zzaxt;->zzo(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzaxt;

    .line 204
    .line 205
    .line 206
    if-eqz v3, :cond_5

    .line 207
    .line 208
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 209
    .line 210
    .line 211
    move-result p1

    .line 212
    if-eq v0, p1, :cond_4

    .line 213
    .line 214
    move v2, v0

    .line 215
    :cond_4
    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/ads/zzaxt;->zzai(I)Lcom/google/android/gms/internal/ads/zzaxt;

    .line 216
    .line 217
    .line 218
    :cond_5
    monitor-exit p2

    .line 219
    return-void

    .line 220
    :goto_1
    monitor-exit p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 221
    throw p1
.end method
