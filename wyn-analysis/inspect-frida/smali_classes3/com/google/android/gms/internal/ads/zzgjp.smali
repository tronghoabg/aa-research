.class public final Lcom/google/android/gms/internal/ads/zzgjp;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final zza:Landroid/content/Context;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzgqo;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzghl;

.field private final zzd:Ljava/lang/String;

.field private final zze:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzgqo;Lcom/google/android/gms/internal/ads/zzghl;Lcom/google/android/gms/internal/ads/zzgdq;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzgjp;->zza:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzgjp;->zzb:Lcom/google/android/gms/internal/ads/zzgqo;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzgjp;->zzc:Lcom/google/android/gms/internal/ads/zzghl;

    .line 9
    .line 10
    invoke-virtual {p4}, Lcom/google/android/gms/internal/ads/zzgdq;->zzd()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzgjp;->zzd:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {p4}, Lcom/google/android/gms/internal/ads/zzgdq;->zzw()Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzgjp;->zze:Z

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final zza(ZJ)Ljava/lang/String;
    .locals 8

    .line 1
    const-string p1, "E"

    .line 2
    .line 3
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzgjp;->zzb:Lcom/google/android/gms/internal/ads/zzgqo;

    .line 4
    .line 5
    const/16 v1, 0x37

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzgqo;->zza(I)Lcom/google/android/gms/internal/ads/zzgqm;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :try_start_0
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzgqm;->zza()V

    .line 12
    .line 13
    .line 14
    const-string v1, "0.893135394"

    .line 15
    .line 16
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzazf;->zza()Lcom/google/android/gms/internal/ads/zzaze;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzgjp;->zzd:Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/zzaze;->zzb(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzaze;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/zzaze;->zza(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzaze;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzgjp;->zza:Landroid/content/Context;

    .line 29
    .line 30
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/zzaze;->zzd(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzaze;

    .line 35
    .line 36
    .line 37
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 38
    .line 39
    .line 40
    move-result-wide v3

    .line 41
    const-wide/16 v5, 0x3e8

    .line 42
    .line 43
    div-long/2addr v3, v5

    .line 44
    invoke-virtual {v2, v3, v4}, Lcom/google/android/gms/internal/ads/zzaze;->zzc(J)Lcom/google/android/gms/internal/ads/zzaze;

    .line 45
    .line 46
    .line 47
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 48
    .line 49
    .line 50
    move-result-wide v3

    .line 51
    sub-long/2addr v3, p2

    .line 52
    div-long/2addr v3, v5

    .line 53
    invoke-virtual {v2, v3, v4}, Lcom/google/android/gms/internal/ads/zzaze;->zzf(J)Lcom/google/android/gms/internal/ads/zzaze;

    .line 54
    .line 55
    .line 56
    iget-boolean p2, p0, Lcom/google/android/gms/internal/ads/zzgjp;->zze:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    .line 58
    const/4 p3, 0x1

    .line 59
    const/4 v3, 0x0

    .line 60
    if-nez p2, :cond_0

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_0
    :try_start_1
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 64
    .line 65
    .line 66
    move-result-object p2

    .line 67
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    const/16 v4, 0x40

    .line 72
    .line 73
    invoke-virtual {p2, v1, v4}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 74
    .line 75
    .line 76
    move-result-object p2

    .line 77
    iget-object p2, p2, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    .line 78
    .line 79
    if-eqz p2, :cond_3

    .line 80
    .line 81
    array-length v1, p2

    .line 82
    if-lez v1, :cond_3

    .line 83
    .line 84
    const-string v1, "SHA-1"

    .line 85
    .line 86
    invoke-static {v1}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    aget-object p2, p2, v3

    .line 91
    .line 92
    invoke-virtual {p2}, Landroid/content/pm/Signature;->toByteArray()[B

    .line 93
    .line 94
    .line 95
    move-result-object p2

    .line 96
    invoke-virtual {v1, p2}, Ljava/security/MessageDigest;->digest([B)[B

    .line 97
    .line 98
    .line 99
    move-result-object p2

    .line 100
    new-instance v1, Ljava/lang/StringBuilder;

    .line 101
    .line 102
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 103
    .line 104
    .line 105
    array-length v4, p2

    .line 106
    move v5, v3

    .line 107
    :goto_0
    if-ge v5, v4, :cond_2

    .line 108
    .line 109
    aget-byte v6, p2, v5

    .line 110
    .line 111
    and-int/lit16 v6, v6, 0xff

    .line 112
    .line 113
    invoke-static {v6}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v6

    .line 117
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 118
    .line 119
    .line 120
    move-result v7

    .line 121
    if-ne v7, p3, :cond_1

    .line 122
    .line 123
    const/16 v7, 0x30

    .line 124
    .line 125
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    goto :goto_1

    .line 129
    :catchall_0
    move-exception p1

    .line 130
    goto :goto_4

    .line 131
    :cond_1
    :goto_1
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    add-int/lit8 v5, v5, 0x1

    .line 135
    .line 136
    goto :goto_0

    .line 137
    :cond_2
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object p2

    .line 141
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 142
    .line 143
    invoke-virtual {p2, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 144
    .line 145
    .line 146
    move-result-object p2

    .line 147
    const/16 v1, 0xb

    .line 148
    .line 149
    invoke-static {p2, v1}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 153
    :catch_0
    :cond_3
    :try_start_2
    invoke-virtual {v2, p1}, Lcom/google/android/gms/internal/ads/zzaze;->zzg(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzaze;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 154
    .line 155
    .line 156
    :goto_2
    :try_start_3
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzgjp;->zza:Landroid/content/Context;

    .line 157
    .line 158
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 159
    .line 160
    .line 161
    move-result-object p2

    .line 162
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    invoke-virtual {p2, p1, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    iget p1, p1, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 171
    .line 172
    int-to-long p1, p1

    .line 173
    invoke-virtual {v2, p1, p2}, Lcom/google/android/gms/internal/ads/zzaze;->zze(J)Lcom/google/android/gms/internal/ads/zzaze;
    :try_end_3
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 174
    .line 175
    .line 176
    goto :goto_3

    .line 177
    :catch_1
    const-wide/16 p1, -0x1

    .line 178
    .line 179
    :try_start_4
    invoke-virtual {v2, p1, p2}, Lcom/google/android/gms/internal/ads/zzaze;->zze(J)Lcom/google/android/gms/internal/ads/zzaze;

    .line 180
    .line 181
    .line 182
    :goto_3
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzgjp;->zzc:Lcom/google/android/gms/internal/ads/zzghl;

    .line 183
    .line 184
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzghl;->zzc()Z

    .line 185
    .line 186
    .line 187
    move-result p2

    .line 188
    if-nez p2, :cond_4

    .line 189
    .line 190
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzghl;->zza()V

    .line 191
    .line 192
    .line 193
    :cond_4
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zziej;->zzbm()Lcom/google/android/gms/internal/ads/zziep;

    .line 194
    .line 195
    .line 196
    move-result-object p2

    .line 197
    check-cast p2, Lcom/google/android/gms/internal/ads/zzazf;

    .line 198
    .line 199
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzicu;->zzaN()[B

    .line 200
    .line 201
    .line 202
    move-result-object p2

    .line 203
    const/4 v1, 0x0

    .line 204
    invoke-virtual {p1, p2, v1}, Lcom/google/android/gms/internal/ads/zzghl;->zzf([BLjava/lang/String;)Lcom/google/android/gms/internal/ads/zzazl;

    .line 205
    .line 206
    .line 207
    move-result-object p1

    .line 208
    const/4 p2, 0x5

    .line 209
    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/zzazl;->zzc(I)Lcom/google/android/gms/internal/ads/zzazl;

    .line 210
    .line 211
    .line 212
    const/4 p2, 0x2

    .line 213
    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/zzazl;->zzd(I)Lcom/google/android/gms/internal/ads/zzazl;

    .line 214
    .line 215
    .line 216
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zziej;->zzbm()Lcom/google/android/gms/internal/ads/zziep;

    .line 217
    .line 218
    .line 219
    move-result-object p1

    .line 220
    check-cast p1, Lcom/google/android/gms/internal/ads/zzazm;

    .line 221
    .line 222
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzicu;->zzaN()[B

    .line 223
    .line 224
    .line 225
    move-result-object p1

    .line 226
    invoke-static {p1, p3}, Lcom/google/android/gms/internal/ads/zzgel;->zza([BZ)Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 230
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzgqm;->zzc()V

    .line 231
    .line 232
    .line 233
    return-object p1

    .line 234
    :goto_4
    :try_start_5
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzgqm;->zzb(Ljava/lang/Throwable;)V

    .line 235
    .line 236
    .line 237
    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 238
    :catchall_1
    move-exception p1

    .line 239
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzgqm;->zzc()V

    .line 240
    .line 241
    .line 242
    throw p1
.end method
