.class public final Lcom/google/android/gms/internal/ads/zzfza;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field final zza:Ljava/io/File;

.field private final zzb:Ljava/io/File;

.field private final zzc:Landroid/content/SharedPreferences;

.field private final zzd:Lcom/google/android/gms/internal/ads/zzbdz;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzbdz;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "pcvmspf"

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzfza;->zzc:Landroid/content/SharedPreferences;

    .line 12
    .line 13
    const-string v0, "pccache"

    .line 14
    .line 15
    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getDir(Ljava/lang/String;I)Ljava/io/File;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzfzb;->zzd(Ljava/io/File;Z)Ljava/io/File;

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzfza;->zzb:Ljava/io/File;

    .line 23
    .line 24
    const-string v0, "tmppccache"

    .line 25
    .line 26
    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getDir(Ljava/lang/String;I)Ljava/io/File;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    const/4 v0, 0x1

    .line 31
    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ads/zzfzb;->zzd(Ljava/io/File;Z)Ljava/io/File;

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfza;->zza:Ljava/io/File;

    .line 35
    .line 36
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzfza;->zzd:Lcom/google/android/gms/internal/ads/zzbdz;

    .line 37
    .line 38
    return-void
.end method

.method private final zzd()Ljava/io/File;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfza;->zzd:Lcom/google/android/gms/internal/ads/zzbdz;

    .line 2
    .line 3
    new-instance v1, Ljava/io/File;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbdz;->zza()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzfza;->zzb:Ljava/io/File;

    .line 14
    .line 15
    invoke-direct {v1, v2, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/io/File;->mkdir()Z

    .line 25
    .line 26
    .line 27
    :cond_0
    return-object v1
.end method

.method private final zze()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfza;->zzd:Lcom/google/android/gms/internal/ads/zzbdz;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbdz;->zza()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    new-instance v2, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    add-int/lit8 v1, v1, 0x6

    .line 18
    .line 19
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 20
    .line 21
    .line 22
    const-string v1, "FBAMTD"

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, LN0/a;->d(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    return-object v0
.end method

.method private final zzf()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfza;->zzd:Lcom/google/android/gms/internal/ads/zzbdz;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbdz;->zza()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    new-instance v2, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    add-int/lit8 v1, v1, 0x6

    .line 18
    .line 19
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 20
    .line 21
    .line 22
    const-string v1, "LATMTD"

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, LN0/a;->d(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    return-object v0
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/ads/zzbeb;Lcom/google/android/gms/internal/ads/zzfzg;)Z
    .locals 8

    .line 1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbeb;->zza()Lcom/google/android/gms/internal/ads/zzbei;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbei;->zza()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbeb;->zzb()Lcom/google/android/gms/internal/ads/zzidl;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzidl;->zzA()[B

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbeb;->zzc()Lcom/google/android/gms/internal/ads/zzidl;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzidl;->zzA()[B

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    const/4 v4, 0x0

    .line 30
    if-nez v3, :cond_b

    .line 31
    .line 32
    array-length v3, v2

    .line 33
    if-nez v3, :cond_0

    .line 34
    .line 35
    goto/16 :goto_3

    .line 36
    .line 37
    :cond_0
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzfza;->zza:Ljava/io/File;

    .line 38
    .line 39
    invoke-static {v3}, Lcom/google/android/gms/internal/ads/zzfzb;->zze(Ljava/io/File;)Z

    .line 40
    .line 41
    .line 42
    invoke-virtual {v3}, Ljava/io/File;->mkdirs()Z

    .line 43
    .line 44
    .line 45
    invoke-static {v0, v3}, Lcom/google/android/gms/internal/ads/zzfzb;->zzc(Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    invoke-virtual {v5}, Ljava/io/File;->mkdirs()Z

    .line 50
    .line 51
    .line 52
    const-string v5, "pcam.jar"

    .line 53
    .line 54
    invoke-static {v0, v5, v3}, Lcom/google/android/gms/internal/ads/zzfzb;->zza(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    .line 55
    .line 56
    .line 57
    move-result-object v6

    .line 58
    array-length v7, v1

    .line 59
    if-lez v7, :cond_1

    .line 60
    .line 61
    invoke-static {v6, v1}, Lcom/google/android/gms/internal/ads/zzfzb;->zzb(Ljava/io/File;[B)Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-eqz v1, :cond_b

    .line 66
    .line 67
    :cond_1
    const-string v1, "pcbc"

    .line 68
    .line 69
    invoke-static {v0, v1, v3}, Lcom/google/android/gms/internal/ads/zzfzb;->zza(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-static {v0, v2}, Lcom/google/android/gms/internal/ads/zzfzb;->zzb(Ljava/io/File;[B)Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-eqz v0, :cond_b

    .line 78
    .line 79
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbeb;->zza()Lcom/google/android/gms/internal/ads/zzbei;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbei;->zza()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-static {v0, v5, v3}, Lcom/google/android/gms/internal/ads/zzfzb;->zza(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    if-eqz v2, :cond_2

    .line 96
    .line 97
    if-eqz p2, :cond_2

    .line 98
    .line 99
    invoke-interface {p2, v0}, Lcom/google/android/gms/internal/ads/zzfzg;->zza(Ljava/io/File;)Z

    .line 100
    .line 101
    .line 102
    move-result p2

    .line 103
    if-nez p2, :cond_2

    .line 104
    .line 105
    return v4

    .line 106
    :cond_2
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbeb;->zza()Lcom/google/android/gms/internal/ads/zzbei;

    .line 107
    .line 108
    .line 109
    move-result-object p2

    .line 110
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzbei;->zza()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p2

    .line 114
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    const/4 v2, 0x1

    .line 119
    if-eqz v0, :cond_4

    .line 120
    .line 121
    :cond_3
    :goto_0
    move p1, v4

    .line 122
    goto/16 :goto_1

    .line 123
    .line 124
    :cond_4
    invoke-static {p2, v5, v3}, Lcom/google/android/gms/internal/ads/zzfzb;->zza(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    invoke-static {p2, v1, v3}, Lcom/google/android/gms/internal/ads/zzfzb;->zza(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    .line 129
    .line 130
    .line 131
    move-result-object v3

    .line 132
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzfza;->zzd()Ljava/io/File;

    .line 133
    .line 134
    .line 135
    move-result-object v6

    .line 136
    invoke-static {p2, v5, v6}, Lcom/google/android/gms/internal/ads/zzfzb;->zza(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    .line 137
    .line 138
    .line 139
    move-result-object v5

    .line 140
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzfza;->zzd()Ljava/io/File;

    .line 141
    .line 142
    .line 143
    move-result-object v6

    .line 144
    invoke-static {p2, v1, v6}, Lcom/google/android/gms/internal/ads/zzfzb;->zza(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    .line 145
    .line 146
    .line 147
    move-result-object p2

    .line 148
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 149
    .line 150
    .line 151
    move-result v1

    .line 152
    if-eqz v1, :cond_5

    .line 153
    .line 154
    invoke-virtual {v0, v5}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 155
    .line 156
    .line 157
    move-result v0

    .line 158
    if-nez v0, :cond_5

    .line 159
    .line 160
    goto :goto_0

    .line 161
    :cond_5
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    .line 162
    .line 163
    .line 164
    move-result v0

    .line 165
    if-eqz v0, :cond_3

    .line 166
    .line 167
    invoke-virtual {v3, p2}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 168
    .line 169
    .line 170
    move-result p2

    .line 171
    if-eqz p2, :cond_3

    .line 172
    .line 173
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbei;->zzi()Lcom/google/android/gms/internal/ads/zzbeh;

    .line 174
    .line 175
    .line 176
    move-result-object p2

    .line 177
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbeb;->zza()Lcom/google/android/gms/internal/ads/zzbei;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbei;->zza()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/ads/zzbeh;->zza(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzbeh;

    .line 186
    .line 187
    .line 188
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbeb;->zza()Lcom/google/android/gms/internal/ads/zzbei;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbei;->zzb()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/ads/zzbeh;->zzb(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzbeh;

    .line 197
    .line 198
    .line 199
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbeb;->zza()Lcom/google/android/gms/internal/ads/zzbei;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbei;->zzd()J

    .line 204
    .line 205
    .line 206
    move-result-wide v0

    .line 207
    invoke-virtual {p2, v0, v1}, Lcom/google/android/gms/internal/ads/zzbeh;->zzd(J)Lcom/google/android/gms/internal/ads/zzbeh;

    .line 208
    .line 209
    .line 210
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbeb;->zza()Lcom/google/android/gms/internal/ads/zzbei;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbei;->zze()J

    .line 215
    .line 216
    .line 217
    move-result-wide v0

    .line 218
    invoke-virtual {p2, v0, v1}, Lcom/google/android/gms/internal/ads/zzbeh;->zze(J)Lcom/google/android/gms/internal/ads/zzbeh;

    .line 219
    .line 220
    .line 221
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbeb;->zza()Lcom/google/android/gms/internal/ads/zzbei;

    .line 222
    .line 223
    .line 224
    move-result-object p1

    .line 225
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbei;->zzc()J

    .line 226
    .line 227
    .line 228
    move-result-wide v0

    .line 229
    invoke-virtual {p2, v0, v1}, Lcom/google/android/gms/internal/ads/zzbeh;->zzc(J)Lcom/google/android/gms/internal/ads/zzbeh;

    .line 230
    .line 231
    .line 232
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zziej;->zzbm()Lcom/google/android/gms/internal/ads/zziep;

    .line 233
    .line 234
    .line 235
    move-result-object p1

    .line 236
    check-cast p1, Lcom/google/android/gms/internal/ads/zzbei;

    .line 237
    .line 238
    invoke-virtual {p0, v2}, Lcom/google/android/gms/internal/ads/zzfza;->zzc(I)Lcom/google/android/gms/internal/ads/zzbei;

    .line 239
    .line 240
    .line 241
    move-result-object p2

    .line 242
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfza;->zzc:Landroid/content/SharedPreferences;

    .line 243
    .line 244
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    if-eqz p2, :cond_6

    .line 249
    .line 250
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbei;->zza()Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v1

    .line 254
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzbei;->zza()Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v3

    .line 258
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 259
    .line 260
    .line 261
    move-result v1

    .line 262
    if-nez v1, :cond_6

    .line 263
    .line 264
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzfza;->zze()Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object v1

    .line 268
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzicu;->zzaN()[B

    .line 269
    .line 270
    .line 271
    move-result-object p2

    .line 272
    invoke-static {p2}, Ln7/c;->b([B)Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object p2

    .line 276
    invoke-interface {v0, v1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 277
    .line 278
    .line 279
    :cond_6
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzfza;->zzf()Ljava/lang/String;

    .line 280
    .line 281
    .line 282
    move-result-object p2

    .line 283
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzicu;->zzaN()[B

    .line 284
    .line 285
    .line 286
    move-result-object p1

    .line 287
    invoke-static {p1}, Ln7/c;->b([B)Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object p1

    .line 291
    invoke-interface {v0, p2, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 292
    .line 293
    .line 294
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 295
    .line 296
    .line 297
    move-result p1

    .line 298
    if-eqz p1, :cond_3

    .line 299
    .line 300
    move p1, v2

    .line 301
    :goto_1
    new-instance p2, Ljava/util/HashSet;

    .line 302
    .line 303
    invoke-direct {p2}, Ljava/util/HashSet;-><init>()V

    .line 304
    .line 305
    .line 306
    invoke-virtual {p0, v2}, Lcom/google/android/gms/internal/ads/zzfza;->zzc(I)Lcom/google/android/gms/internal/ads/zzbei;

    .line 307
    .line 308
    .line 309
    move-result-object v0

    .line 310
    if-eqz v0, :cond_7

    .line 311
    .line 312
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbei;->zza()Ljava/lang/String;

    .line 313
    .line 314
    .line 315
    move-result-object v0

    .line 316
    invoke-virtual {p2, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 317
    .line 318
    .line 319
    :cond_7
    const/4 v0, 0x2

    .line 320
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzfza;->zzc(I)Lcom/google/android/gms/internal/ads/zzbei;

    .line 321
    .line 322
    .line 323
    move-result-object v0

    .line 324
    if-eqz v0, :cond_8

    .line 325
    .line 326
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzbei;->zza()Ljava/lang/String;

    .line 327
    .line 328
    .line 329
    move-result-object v0

    .line 330
    invoke-virtual {p2, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 331
    .line 332
    .line 333
    :cond_8
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzfza;->zzd()Ljava/io/File;

    .line 334
    .line 335
    .line 336
    move-result-object v0

    .line 337
    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 338
    .line 339
    .line 340
    move-result-object v0

    .line 341
    array-length v1, v0

    .line 342
    :goto_2
    if-ge v4, v1, :cond_a

    .line 343
    .line 344
    aget-object v2, v0, v4

    .line 345
    .line 346
    invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 347
    .line 348
    .line 349
    move-result-object v2

    .line 350
    invoke-virtual {p2, v2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 351
    .line 352
    .line 353
    move-result v3

    .line 354
    if-nez v3, :cond_9

    .line 355
    .line 356
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzfza;->zzd()Ljava/io/File;

    .line 357
    .line 358
    .line 359
    move-result-object v3

    .line 360
    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ads/zzfzb;->zzc(Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    .line 361
    .line 362
    .line 363
    move-result-object v2

    .line 364
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzfzb;->zze(Ljava/io/File;)Z

    .line 365
    .line 366
    .line 367
    :cond_9
    add-int/lit8 v4, v4, 0x1

    .line 368
    .line 369
    goto :goto_2

    .line 370
    :cond_a
    return p1

    .line 371
    :cond_b
    :goto_3
    return v4
.end method

.method public final zzb(I)Lcom/google/android/gms/internal/ads/zzfyz;
    .locals 5

    .line 1
    const/4 p1, 0x1

    .line 2
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/zzfza;->zzc(I)Lcom/google/android/gms/internal/ads/zzbei;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    return-object p1

    .line 10
    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbei;->zza()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzfza;->zzd()Ljava/io/File;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    const-string v2, "pcam.jar"

    .line 19
    .line 20
    invoke-static {v0, v2, v1}, Lcom/google/android/gms/internal/ads/zzfzb;->zza(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-nez v2, :cond_1

    .line 29
    .line 30
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzfza;->zzd()Ljava/io/File;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    const-string v2, "pcam"

    .line 35
    .line 36
    invoke-static {v0, v2, v1}, Lcom/google/android/gms/internal/ads/zzfzb;->zza(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    :cond_1
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzfza;->zzd()Ljava/io/File;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    const-string v3, "pcopt"

    .line 45
    .line 46
    invoke-static {v0, v3, v2}, Lcom/google/android/gms/internal/ads/zzfzb;->zza(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzfza;->zzd()Ljava/io/File;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    const-string v4, "pcbc"

    .line 55
    .line 56
    invoke-static {v0, v4, v3}, Lcom/google/android/gms/internal/ads/zzfzb;->zza(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    new-instance v3, Lcom/google/android/gms/internal/ads/zzfyz;

    .line 61
    .line 62
    invoke-direct {v3, p1, v1, v0, v2}, Lcom/google/android/gms/internal/ads/zzfyz;-><init>(Lcom/google/android/gms/internal/ads/zzbei;Ljava/io/File;Ljava/io/File;Ljava/io/File;)V

    .line 63
    .line 64
    .line 65
    return-object v3
.end method

.method public final zzc(I)Lcom/google/android/gms/internal/ads/zzbei;
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzfza;->zzc:Landroid/content/SharedPreferences;

    .line 6
    .line 7
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzfza;->zzf()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzfza;->zzc:Landroid/content/SharedPreferences;

    .line 17
    .line 18
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzfza;->zze()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    :goto_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    return-object v1

    .line 33
    :cond_1
    :try_start_0
    invoke-static {p1}, Ln7/c;->m(Ljava/lang/String;)[B

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    array-length v0, p1

    .line 38
    const/4 v2, 0x0

    .line 39
    invoke-static {p1, v2, v0}, Lcom/google/android/gms/internal/ads/zzidl;->zzt([BII)Lcom/google/android/gms/internal/ads/zzidl;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzbei;->zzg(Lcom/google/android/gms/internal/ads/zzidl;)Lcom/google/android/gms/internal/ads/zzbei;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbei;->zza()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    const-string v2, "pcam.jar"

    .line 52
    .line 53
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzfza;->zzd()Ljava/io/File;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    invoke-static {v0, v2, v3}, Lcom/google/android/gms/internal/ads/zzfzb;->zza(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    if-nez v3, :cond_2

    .line 66
    .line 67
    const-string v2, "pcam"

    .line 68
    .line 69
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzfza;->zzd()Ljava/io/File;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    invoke-static {v0, v2, v3}, Lcom/google/android/gms/internal/ads/zzfzb;->zza(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    :cond_2
    const-string v3, "pcbc"

    .line 78
    .line 79
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzfza;->zzd()Ljava/io/File;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    invoke-static {v0, v3, v4}, Lcom/google/android/gms/internal/ads/zzfzb;->zza(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    if-eqz v2, :cond_3

    .line 92
    .line 93
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 94
    .line 95
    .line 96
    move-result v0
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/zzifh; {:try_start_0 .. :try_end_0} :catch_0

    .line 97
    if-eqz v0, :cond_3

    .line 98
    .line 99
    return-object p1

    .line 100
    :catch_0
    :cond_3
    return-object v1
.end method
