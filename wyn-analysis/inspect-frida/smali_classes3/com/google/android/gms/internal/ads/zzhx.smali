.class public final Lcom/google/android/gms/internal/ads/zzhx;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzhr;


# instance fields
.field private final zza:Landroid/content/Context;

.field private final zzb:Ljava/util/List;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzhr;

.field private zzd:Lcom/google/android/gms/internal/ads/zzhr;

.field private zze:Lcom/google/android/gms/internal/ads/zzhr;

.field private zzf:Lcom/google/android/gms/internal/ads/zzhr;

.field private zzg:Lcom/google/android/gms/internal/ads/zzhr;

.field private zzh:Lcom/google/android/gms/internal/ads/zzhr;

.field private zzi:Lcom/google/android/gms/internal/ads/zzhr;

.field private zzj:Lcom/google/android/gms/internal/ads/zzhr;

.field private zzk:Lcom/google/android/gms/internal/ads/zzhr;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzhr;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzhx;->zza:Landroid/content/Context;

    .line 9
    .line 10
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzhx;->zzc:Lcom/google/android/gms/internal/ads/zzhr;

    .line 11
    .line 12
    new-instance p1, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzhx;->zzb:Ljava/util/List;

    .line 18
    .line 19
    return-void
.end method

.method private final zzf()Lcom/google/android/gms/internal/ads/zzhr;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhx;->zze:Lcom/google/android/gms/internal/ads/zzhr;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhx;->zza:Landroid/content/Context;

    .line 6
    .line 7
    new-instance v1, Lcom/google/android/gms/internal/ads/zzhi;

    .line 8
    .line 9
    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/ads/zzhi;-><init>(Landroid/content/Context;)V

    .line 10
    .line 11
    .line 12
    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzhx;->zze:Lcom/google/android/gms/internal/ads/zzhr;

    .line 13
    .line 14
    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/ads/zzhx;->zzg(Lcom/google/android/gms/internal/ads/zzhr;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhx;->zze:Lcom/google/android/gms/internal/ads/zzhr;

    .line 18
    .line 19
    return-object v0
.end method

.method private final zzg(Lcom/google/android/gms/internal/ads/zzhr;)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzhx;->zzb:Ljava/util/List;

    .line 3
    .line 4
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 5
    .line 6
    .line 7
    move-result v2

    .line 8
    if-ge v0, v2, :cond_0

    .line 9
    .line 10
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    check-cast v1, Lcom/google/android/gms/internal/ads/zzip;

    .line 15
    .line 16
    invoke-interface {p1, v1}, Lcom/google/android/gms/internal/ads/zzhr;->zze(Lcom/google/android/gms/internal/ads/zzip;)V

    .line 17
    .line 18
    .line 19
    add-int/lit8 v0, v0, 0x1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    return-void
.end method

.method private static final zzh(Lcom/google/android/gms/internal/ads/zzhr;Lcom/google/android/gms/internal/ads/zzip;)V
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-interface {p0, p1}, Lcom/google/android/gms/internal/ads/zzhr;->zze(Lcom/google/android/gms/internal/ads/zzip;)V

    .line 4
    .line 5
    .line 6
    :cond_0
    return-void
.end method


# virtual methods
.method public final zza([BII)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhx;->zzk:Lcom/google/android/gms/internal/ads/zzhr;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-interface {v0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzj;->zza([BII)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1
.end method

.method public final zzb(Lcom/google/android/gms/internal/ads/zzhv;)J
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhx;->zzk:Lcom/google/android/gms/internal/ads/zzhr;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    move v0, v1

    .line 9
    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzgtr;->zzi(Z)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zzhv;->zza:Landroid/net/Uri;

    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    sget-object v3, Lcom/google/android/gms/internal/ads/zzfm;->zza:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    if-nez v4, :cond_e

    .line 29
    .line 30
    const-string v4, "file"

    .line 31
    .line 32
    invoke-static {v3, v4}, Lj$/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-eqz v3, :cond_1

    .line 37
    .line 38
    goto/16 :goto_4

    .line 39
    .line 40
    :cond_1
    const-string v0, "asset"

    .line 41
    .line 42
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-eqz v0, :cond_2

    .line 47
    .line 48
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzhx;->zzf()Lcom/google/android/gms/internal/ads/zzhr;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzhx;->zzk:Lcom/google/android/gms/internal/ads/zzhr;

    .line 53
    .line 54
    goto/16 :goto_5

    .line 55
    .line 56
    :cond_2
    const-string v0, "content"

    .line 57
    .line 58
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-eqz v0, :cond_4

    .line 63
    .line 64
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhx;->zzf:Lcom/google/android/gms/internal/ads/zzhr;

    .line 65
    .line 66
    if-nez v0, :cond_3

    .line 67
    .line 68
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhx;->zza:Landroid/content/Context;

    .line 69
    .line 70
    new-instance v1, Lcom/google/android/gms/internal/ads/zzho;

    .line 71
    .line 72
    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/ads/zzho;-><init>(Landroid/content/Context;)V

    .line 73
    .line 74
    .line 75
    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzhx;->zzf:Lcom/google/android/gms/internal/ads/zzhr;

    .line 76
    .line 77
    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/ads/zzhx;->zzg(Lcom/google/android/gms/internal/ads/zzhr;)V

    .line 78
    .line 79
    .line 80
    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhx;->zzf:Lcom/google/android/gms/internal/ads/zzhr;

    .line 81
    .line 82
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzhx;->zzk:Lcom/google/android/gms/internal/ads/zzhr;

    .line 83
    .line 84
    goto/16 :goto_5

    .line 85
    .line 86
    :cond_4
    const-string v0, "rtmp"

    .line 87
    .line 88
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    if-eqz v0, :cond_6

    .line 93
    .line 94
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhx;->zzg:Lcom/google/android/gms/internal/ads/zzhr;

    .line 95
    .line 96
    if-nez v0, :cond_5

    .line 97
    .line 98
    :try_start_0
    const-string v0, "androidx.media3.datasource.rtmp.RtmpDataSource"

    .line 99
    .line 100
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    new-array v2, v1, [Ljava/lang/Class;

    .line 105
    .line 106
    invoke-virtual {v0, v2}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    new-array v1, v1, [Ljava/lang/Object;

    .line 111
    .line 112
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    check-cast v0, Lcom/google/android/gms/internal/ads/zzhr;

    .line 117
    .line 118
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzhx;->zzg:Lcom/google/android/gms/internal/ads/zzhr;

    .line 119
    .line 120
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzhx;->zzg(Lcom/google/android/gms/internal/ads/zzhr;)V
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 121
    .line 122
    .line 123
    goto :goto_1

    .line 124
    :catch_0
    move-exception p1

    .line 125
    new-instance v0, Ljava/lang/RuntimeException;

    .line 126
    .line 127
    const-string v1, "Error instantiating RTMP extension"

    .line 128
    .line 129
    invoke-direct {v0, v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 130
    .line 131
    .line 132
    throw v0

    .line 133
    :catch_1
    const-string v0, "DefaultDataSource"

    .line 134
    .line 135
    const-string v1, "Attempting to play RTMP stream without depending on the RTMP extension"

    .line 136
    .line 137
    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    :goto_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhx;->zzg:Lcom/google/android/gms/internal/ads/zzhr;

    .line 141
    .line 142
    if-nez v0, :cond_5

    .line 143
    .line 144
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhx;->zzc:Lcom/google/android/gms/internal/ads/zzhr;

    .line 145
    .line 146
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzhx;->zzg:Lcom/google/android/gms/internal/ads/zzhr;

    .line 147
    .line 148
    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhx;->zzg:Lcom/google/android/gms/internal/ads/zzhr;

    .line 149
    .line 150
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzhx;->zzk:Lcom/google/android/gms/internal/ads/zzhr;

    .line 151
    .line 152
    goto/16 :goto_5

    .line 153
    .line 154
    :cond_6
    const-string v0, "udp"

    .line 155
    .line 156
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    move-result v0

    .line 160
    if-eqz v0, :cond_8

    .line 161
    .line 162
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhx;->zzh:Lcom/google/android/gms/internal/ads/zzhr;

    .line 163
    .line 164
    if-nez v0, :cond_7

    .line 165
    .line 166
    new-instance v0, Lcom/google/android/gms/internal/ads/zzir;

    .line 167
    .line 168
    const/16 v1, 0x7d0

    .line 169
    .line 170
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzir;-><init>(I)V

    .line 171
    .line 172
    .line 173
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzhx;->zzh:Lcom/google/android/gms/internal/ads/zzhr;

    .line 174
    .line 175
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzhx;->zzg(Lcom/google/android/gms/internal/ads/zzhr;)V

    .line 176
    .line 177
    .line 178
    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhx;->zzh:Lcom/google/android/gms/internal/ads/zzhr;

    .line 179
    .line 180
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzhx;->zzk:Lcom/google/android/gms/internal/ads/zzhr;

    .line 181
    .line 182
    goto/16 :goto_5

    .line 183
    .line 184
    :cond_8
    const-string v0, "data"

    .line 185
    .line 186
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    move-result v0

    .line 190
    if-eqz v0, :cond_a

    .line 191
    .line 192
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhx;->zzi:Lcom/google/android/gms/internal/ads/zzhr;

    .line 193
    .line 194
    if-nez v0, :cond_9

    .line 195
    .line 196
    new-instance v0, Lcom/google/android/gms/internal/ads/zzhp;

    .line 197
    .line 198
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzhp;-><init>()V

    .line 199
    .line 200
    .line 201
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzhx;->zzi:Lcom/google/android/gms/internal/ads/zzhr;

    .line 202
    .line 203
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzhx;->zzg(Lcom/google/android/gms/internal/ads/zzhr;)V

    .line 204
    .line 205
    .line 206
    :cond_9
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhx;->zzi:Lcom/google/android/gms/internal/ads/zzhr;

    .line 207
    .line 208
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzhx;->zzk:Lcom/google/android/gms/internal/ads/zzhr;

    .line 209
    .line 210
    goto :goto_5

    .line 211
    :cond_a
    const-string v0, "rawresource"

    .line 212
    .line 213
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 214
    .line 215
    .line 216
    move-result v0

    .line 217
    if-nez v0, :cond_c

    .line 218
    .line 219
    const-string v0, "android.resource"

    .line 220
    .line 221
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    move-result v0

    .line 225
    if-eqz v0, :cond_b

    .line 226
    .line 227
    goto :goto_3

    .line 228
    :cond_b
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhx;->zzc:Lcom/google/android/gms/internal/ads/zzhr;

    .line 229
    .line 230
    :goto_2
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzhx;->zzk:Lcom/google/android/gms/internal/ads/zzhr;

    .line 231
    .line 232
    goto :goto_5

    .line 233
    :cond_c
    :goto_3
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhx;->zzj:Lcom/google/android/gms/internal/ads/zzhr;

    .line 234
    .line 235
    if-nez v0, :cond_d

    .line 236
    .line 237
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhx;->zza:Landroid/content/Context;

    .line 238
    .line 239
    new-instance v1, Lcom/google/android/gms/internal/ads/zzin;

    .line 240
    .line 241
    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/ads/zzin;-><init>(Landroid/content/Context;)V

    .line 242
    .line 243
    .line 244
    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzhx;->zzj:Lcom/google/android/gms/internal/ads/zzhr;

    .line 245
    .line 246
    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/ads/zzhx;->zzg(Lcom/google/android/gms/internal/ads/zzhr;)V

    .line 247
    .line 248
    .line 249
    :cond_d
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhx;->zzj:Lcom/google/android/gms/internal/ads/zzhr;

    .line 250
    .line 251
    goto :goto_2

    .line 252
    :cond_e
    :goto_4
    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    if-eqz v0, :cond_f

    .line 257
    .line 258
    const-string v1, "/android_asset/"

    .line 259
    .line 260
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 261
    .line 262
    .line 263
    move-result v0

    .line 264
    if-eqz v0, :cond_f

    .line 265
    .line 266
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzhx;->zzf()Lcom/google/android/gms/internal/ads/zzhr;

    .line 267
    .line 268
    .line 269
    move-result-object v0

    .line 270
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzhx;->zzk:Lcom/google/android/gms/internal/ads/zzhr;

    .line 271
    .line 272
    goto :goto_5

    .line 273
    :cond_f
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhx;->zzd:Lcom/google/android/gms/internal/ads/zzhr;

    .line 274
    .line 275
    if-nez v0, :cond_10

    .line 276
    .line 277
    new-instance v0, Lcom/google/android/gms/internal/ads/zzie;

    .line 278
    .line 279
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzie;-><init>()V

    .line 280
    .line 281
    .line 282
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzhx;->zzd:Lcom/google/android/gms/internal/ads/zzhr;

    .line 283
    .line 284
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzhx;->zzg(Lcom/google/android/gms/internal/ads/zzhr;)V

    .line 285
    .line 286
    .line 287
    :cond_10
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhx;->zzd:Lcom/google/android/gms/internal/ads/zzhr;

    .line 288
    .line 289
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzhx;->zzk:Lcom/google/android/gms/internal/ads/zzhr;

    .line 290
    .line 291
    :goto_5
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhx;->zzk:Lcom/google/android/gms/internal/ads/zzhr;

    .line 292
    .line 293
    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/zzhr;->zzb(Lcom/google/android/gms/internal/ads/zzhv;)J

    .line 294
    .line 295
    .line 296
    move-result-wide v0

    .line 297
    return-wide v0
.end method

.method public final zzc()Landroid/net/Uri;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhx;->zzk:Lcom/google/android/gms/internal/ads/zzhr;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return-object v0

    .line 7
    :cond_0
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzhr;->zzc()Landroid/net/Uri;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public final zzd()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhx;->zzk:Lcom/google/android/gms/internal/ads/zzhr;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    :try_start_0
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzhr;->zzd()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    .line 8
    .line 9
    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzhx;->zzk:Lcom/google/android/gms/internal/ads/zzhr;

    .line 10
    .line 11
    return-void

    .line 12
    :catchall_0
    move-exception v0

    .line 13
    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzhx;->zzk:Lcom/google/android/gms/internal/ads/zzhr;

    .line 14
    .line 15
    throw v0

    .line 16
    :cond_0
    return-void
.end method

.method public final zze(Lcom/google/android/gms/internal/ads/zzip;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhx;->zzc:Lcom/google/android/gms/internal/ads/zzhr;

    .line 5
    .line 6
    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/zzhr;->zze(Lcom/google/android/gms/internal/ads/zzip;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhx;->zzb:Ljava/util/List;

    .line 10
    .line 11
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhx;->zzd:Lcom/google/android/gms/internal/ads/zzhr;

    .line 15
    .line 16
    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/zzhx;->zzh(Lcom/google/android/gms/internal/ads/zzhr;Lcom/google/android/gms/internal/ads/zzip;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhx;->zze:Lcom/google/android/gms/internal/ads/zzhr;

    .line 20
    .line 21
    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/zzhx;->zzh(Lcom/google/android/gms/internal/ads/zzhr;Lcom/google/android/gms/internal/ads/zzip;)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhx;->zzf:Lcom/google/android/gms/internal/ads/zzhr;

    .line 25
    .line 26
    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/zzhx;->zzh(Lcom/google/android/gms/internal/ads/zzhr;Lcom/google/android/gms/internal/ads/zzip;)V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhx;->zzg:Lcom/google/android/gms/internal/ads/zzhr;

    .line 30
    .line 31
    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/zzhx;->zzh(Lcom/google/android/gms/internal/ads/zzhr;Lcom/google/android/gms/internal/ads/zzip;)V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhx;->zzh:Lcom/google/android/gms/internal/ads/zzhr;

    .line 35
    .line 36
    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/zzhx;->zzh(Lcom/google/android/gms/internal/ads/zzhr;Lcom/google/android/gms/internal/ads/zzip;)V

    .line 37
    .line 38
    .line 39
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhx;->zzi:Lcom/google/android/gms/internal/ads/zzhr;

    .line 40
    .line 41
    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/zzhx;->zzh(Lcom/google/android/gms/internal/ads/zzhr;Lcom/google/android/gms/internal/ads/zzip;)V

    .line 42
    .line 43
    .line 44
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhx;->zzj:Lcom/google/android/gms/internal/ads/zzhr;

    .line 45
    .line 46
    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/zzhx;->zzh(Lcom/google/android/gms/internal/ads/zzhr;Lcom/google/android/gms/internal/ads/zzip;)V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public final zzj()Ljava/util/Map;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzhx;->zzk:Lcom/google/android/gms/internal/ads/zzhr;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzhr;->zzj()Ljava/util/Map;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    return-object v0
.end method
