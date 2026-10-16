.class public final Lcom/google/android/recaptcha/internal/zzdf;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static zza:Lcom/google/android/recaptcha/internal/zzoa;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# instance fields
.field private final zzb:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final zzc:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final zzd:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final zze:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final zzf:Lcom/google/android/recaptcha/internal/zzdg;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final zzg:Landroid/content/Context;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final zzh:Ljava/lang/Integer;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final zzi:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final zzj:J

.field private final zzk:I
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/recaptcha/internal/zzdg;Lcom/google/android/recaptcha/internal/zzbw;Landroid/content/Context;Ljava/lang/Integer;)V
    .locals 0
    .param p1    # I
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p7    # Lcom/google/android/recaptcha/internal/zzdg;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p8    # Lcom/google/android/recaptcha/internal/zzbw;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p9    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p10    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lcom/google/android/recaptcha/internal/zzdf;->zzk:I

    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/android/recaptcha/internal/zzdf;->zzb:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/google/android/recaptcha/internal/zzdf;->zzc:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, Lcom/google/android/recaptcha/internal/zzdf;->zzd:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p5, p0, Lcom/google/android/recaptcha/internal/zzdf;->zze:Ljava/lang/String;

    .line 13
    .line 14
    iput-object p7, p0, Lcom/google/android/recaptcha/internal/zzdf;->zzf:Lcom/google/android/recaptcha/internal/zzdg;

    .line 15
    .line 16
    iput-object p9, p0, Lcom/google/android/recaptcha/internal/zzdf;->zzg:Landroid/content/Context;

    .line 17
    .line 18
    iput-object p10, p0, Lcom/google/android/recaptcha/internal/zzdf;->zzh:Ljava/lang/Integer;

    .line 19
    .line 20
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 21
    .line 22
    .line 23
    move-result-wide p1

    .line 24
    invoke-static {p1, p2}, Lcom/google/android/recaptcha/internal/zznr;->zzb(J)Lcom/google/android/recaptcha/internal/zzmz;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-static {p1}, Lcom/google/android/recaptcha/internal/zznr;->zzc(Lcom/google/android/recaptcha/internal/zzmz;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzdf;->zzi:Ljava/lang/String;

    .line 33
    .line 34
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 35
    .line 36
    .line 37
    move-result-wide p1

    .line 38
    iput-wide p1, p0, Lcom/google/android/recaptcha/internal/zzdf;->zzj:J

    .line 39
    .line 40
    return-void
.end method

.method private final zzc(ILcom/google/android/recaptcha/internal/zzod;)V
    .locals 11

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    invoke-static {}, Lcom/google/android/recaptcha/internal/zzop;->zzi()Lcom/google/android/recaptcha/internal/zzoo;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget v2, p0, Lcom/google/android/recaptcha/internal/zzdf;->zzk:I

    .line 8
    .line 9
    invoke-virtual {v1, v2}, Lcom/google/android/recaptcha/internal/zzoo;->zzx(I)Lcom/google/android/recaptcha/internal/zzoo;

    .line 10
    .line 11
    .line 12
    iget-object v2, p0, Lcom/google/android/recaptcha/internal/zzdf;->zzc:Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {v1, v2}, Lcom/google/android/recaptcha/internal/zzoo;->zzp(Ljava/lang/String;)Lcom/google/android/recaptcha/internal/zzoo;

    .line 15
    .line 16
    .line 17
    iget-object v2, p0, Lcom/google/android/recaptcha/internal/zzdf;->zzd:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {v1, v2}, Lcom/google/android/recaptcha/internal/zzoo;->zzs(Ljava/lang/String;)Lcom/google/android/recaptcha/internal/zzoo;

    .line 20
    .line 21
    .line 22
    iget-object v2, p0, Lcom/google/android/recaptcha/internal/zzdf;->zze:Ljava/lang/String;

    .line 23
    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    invoke-virtual {v1, v2}, Lcom/google/android/recaptcha/internal/zzoo;->zzw(Ljava/lang/String;)Lcom/google/android/recaptcha/internal/zzoo;

    .line 27
    .line 28
    .line 29
    :cond_0
    iget-object v2, p0, Lcom/google/android/recaptcha/internal/zzdf;->zzh:Ljava/lang/Integer;

    .line 30
    .line 31
    if-eqz v2, :cond_1

    .line 32
    .line 33
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    invoke-virtual {v1, v2}, Lcom/google/android/recaptcha/internal/zzoo;->zzu(I)Lcom/google/android/recaptcha/internal/zzoo;

    .line 38
    .line 39
    .line 40
    :cond_1
    if-eqz p2, :cond_2

    .line 41
    .line 42
    invoke-virtual {v1, p2}, Lcom/google/android/recaptcha/internal/zzoo;->zzr(Lcom/google/android/recaptcha/internal/zzod;)Lcom/google/android/recaptcha/internal/zzoo;

    .line 43
    .line 44
    .line 45
    :cond_2
    invoke-virtual {v1, p1}, Lcom/google/android/recaptcha/internal/zzoo;->zzy(I)Lcom/google/android/recaptcha/internal/zzoo;

    .line 46
    .line 47
    .line 48
    iget-object p1, p0, Lcom/google/android/recaptcha/internal/zzdf;->zzi:Ljava/lang/String;

    .line 49
    .line 50
    invoke-virtual {v1, p1}, Lcom/google/android/recaptcha/internal/zzoo;->zzv(Ljava/lang/String;)Lcom/google/android/recaptcha/internal/zzoo;

    .line 51
    .line 52
    .line 53
    iget-wide p1, p0, Lcom/google/android/recaptcha/internal/zzdf;->zzj:J

    .line 54
    .line 55
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 56
    .line 57
    .line 58
    move-result-wide v2

    .line 59
    sub-long/2addr v2, p1

    .line 60
    invoke-virtual {v1, v2, v3}, Lcom/google/android/recaptcha/internal/zzoo;->zzq(J)Lcom/google/android/recaptcha/internal/zzoo;

    .line 61
    .line 62
    .line 63
    sget p1, Lcom/google/android/recaptcha/internal/zzbb;->zza:I

    .line 64
    .line 65
    sget-object p1, Lcom/google/android/recaptcha/internal/zzdd;->zza:Lcom/google/android/recaptcha/internal/zzdd;

    .line 66
    .line 67
    invoke-static {p1}, LFe/c;->z(Ltf/a;)Lef/p;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-virtual {p1}, Lef/p;->getValue()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    check-cast p1, Lcom/google/android/recaptcha/internal/zzbf;

    .line 76
    .line 77
    invoke-virtual {p1}, Lcom/google/android/recaptcha/internal/zzbf;->zza()Ljava/util/List;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 86
    .line 87
    .line 88
    move-result p2

    .line 89
    const/4 v2, 0x0

    .line 90
    if-eqz p2, :cond_3

    .line 91
    .line 92
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p2

    .line 96
    check-cast p2, Lcom/google/android/recaptcha/internal/zzbd;

    .line 97
    .line 98
    invoke-virtual {v1, v2}, Lcom/google/android/recaptcha/internal/zzoo;->zze(I)Lcom/google/android/recaptcha/internal/zzoo;

    .line 99
    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_3
    sget p1, Lcom/google/android/recaptcha/internal/zzbq;->zza:I

    .line 103
    .line 104
    iget p1, p0, Lcom/google/android/recaptcha/internal/zzdf;->zzk:I

    .line 105
    .line 106
    invoke-virtual {v1}, Lcom/google/android/recaptcha/internal/zzoo;->zzd()J

    .line 107
    .line 108
    .line 109
    move-result-wide v3

    .line 110
    const-wide/16 v5, 0x3e8

    .line 111
    .line 112
    mul-long/2addr v3, v5

    .line 113
    add-int/lit8 p1, p1, -0x2

    .line 114
    .line 115
    const/4 p2, 0x4

    .line 116
    if-eq p1, p2, :cond_8

    .line 117
    .line 118
    const/4 p2, 0x5

    .line 119
    if-eq p1, p2, :cond_7

    .line 120
    .line 121
    const/4 p2, 0x6

    .line 122
    if-eq p1, p2, :cond_6

    .line 123
    .line 124
    const/4 p2, 0x7

    .line 125
    if-eq p1, p2, :cond_5

    .line 126
    .line 127
    const/16 p2, 0xe

    .line 128
    .line 129
    if-eq p1, p2, :cond_4

    .line 130
    .line 131
    sget-object p1, Lcom/google/android/recaptcha/internal/zzbr;->zza:Lcom/google/android/recaptcha/internal/zzbr;

    .line 132
    .line 133
    goto :goto_1

    .line 134
    :cond_4
    sget-object p1, Lcom/google/android/recaptcha/internal/zzbr;->zzf:Lcom/google/android/recaptcha/internal/zzbr;

    .line 135
    .line 136
    goto :goto_1

    .line 137
    :cond_5
    sget-object p1, Lcom/google/android/recaptcha/internal/zzbr;->zze:Lcom/google/android/recaptcha/internal/zzbr;

    .line 138
    .line 139
    goto :goto_1

    .line 140
    :cond_6
    sget-object p1, Lcom/google/android/recaptcha/internal/zzbr;->zzd:Lcom/google/android/recaptcha/internal/zzbr;

    .line 141
    .line 142
    goto :goto_1

    .line 143
    :cond_7
    sget-object p1, Lcom/google/android/recaptcha/internal/zzbr;->zzc:Lcom/google/android/recaptcha/internal/zzbr;

    .line 144
    .line 145
    goto :goto_1

    .line 146
    :cond_8
    sget-object p1, Lcom/google/android/recaptcha/internal/zzbr;->zzb:Lcom/google/android/recaptcha/internal/zzbr;

    .line 147
    .line 148
    :goto_1
    invoke-virtual {p1}, Lcom/google/android/recaptcha/internal/zzbr;->zza()I

    .line 149
    .line 150
    .line 151
    move-result p1

    .line 152
    invoke-static {p1, v3, v4}, Lcom/google/android/recaptcha/internal/zzbq;->zza(IJ)V

    .line 153
    .line 154
    .line 155
    sget-object p1, Lcom/google/android/recaptcha/internal/zzde;->zza:Lcom/google/android/recaptcha/internal/zzde;

    .line 156
    .line 157
    invoke-static {p1}, LFe/c;->z(Ltf/a;)Lef/p;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    invoke-virtual {p1}, Lef/p;->getValue()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    check-cast p1, Lcom/google/android/recaptcha/internal/zzbk;

    .line 166
    .line 167
    iget-object p1, p0, Lcom/google/android/recaptcha/internal/zzdf;->zzg:Landroid/content/Context;

    .line 168
    .line 169
    invoke-static {p1}, Lcom/google/android/recaptcha/internal/zzbk;->zza(Landroid/content/Context;)Ljava/util/Set;

    .line 170
    .line 171
    .line 172
    move-result-object p2

    .line 173
    sget-object v3, Lcom/google/android/recaptcha/internal/zzdf;->zza:Lcom/google/android/recaptcha/internal/zzoa;

    .line 174
    .line 175
    if-nez v3, :cond_e

    .line 176
    .line 177
    invoke-static {}, Lcom/google/android/recaptcha/internal/zzoa;->zzf()Lcom/google/android/recaptcha/internal/zzny;

    .line 178
    .line 179
    .line 180
    move-result-object v3

    .line 181
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 182
    .line 183
    invoke-virtual {v3, v4}, Lcom/google/android/recaptcha/internal/zzny;->zze(I)Lcom/google/android/recaptcha/internal/zzny;

    .line 184
    .line 185
    .line 186
    const-string v5, "com.google.android.gms.version"

    .line 187
    .line 188
    const/16 v6, 0x21

    .line 189
    .line 190
    const-string v7, "unknown"

    .line 191
    .line 192
    const/4 v8, -0x1

    .line 193
    if-lt v4, v6, :cond_a

    .line 194
    .line 195
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 196
    .line 197
    .line 198
    move-result-object v4

    .line 199
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v9

    .line 203
    invoke-static {}, LG6/T;->g()Landroid/content/pm/PackageManager$ApplicationInfoFlags;

    .line 204
    .line 205
    .line 206
    move-result-object v10

    .line 207
    invoke-static {v4, v9, v10}, LG6/T;->e(Landroid/content/pm/PackageManager;Ljava/lang/String;Landroid/content/pm/PackageManager$ApplicationInfoFlags;)Landroid/content/pm/ApplicationInfo;

    .line 208
    .line 209
    .line 210
    move-result-object v4

    .line 211
    iget-object v4, v4, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 212
    .line 213
    invoke-virtual {v4, v5, v8}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 214
    .line 215
    .line 216
    move-result v4

    .line 217
    if-ne v4, v8, :cond_9

    .line 218
    .line 219
    :catch_0
    :goto_2
    move-object v4, v7

    .line 220
    goto :goto_3

    .line 221
    :cond_9
    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v4

    .line 225
    goto :goto_3

    .line 226
    :cond_a
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 227
    .line 228
    .line 229
    move-result-object v4

    .line 230
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v9

    .line 234
    const/16 v10, 0x80

    .line 235
    .line 236
    invoke-virtual {v4, v9, v10}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    .line 237
    .line 238
    .line 239
    move-result-object v4

    .line 240
    iget-object v4, v4, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 241
    .line 242
    invoke-virtual {v4, v5, v8}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 243
    .line 244
    .line 245
    move-result v4

    .line 246
    if-ne v4, v8, :cond_b

    .line 247
    .line 248
    goto :goto_2

    .line 249
    :cond_b
    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v4
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 253
    :goto_3
    invoke-virtual {v3, v4}, Lcom/google/android/recaptcha/internal/zzny;->zzr(Ljava/lang/String;)Lcom/google/android/recaptcha/internal/zzny;

    .line 254
    .line 255
    .line 256
    const-string v4, "18.5.1"

    .line 257
    .line 258
    invoke-virtual {v3, v4}, Lcom/google/android/recaptcha/internal/zzny;->zzt(Ljava/lang/String;)Lcom/google/android/recaptcha/internal/zzny;

    .line 259
    .line 260
    .line 261
    sget-object v4, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 262
    .line 263
    invoke-virtual {v3, v4}, Lcom/google/android/recaptcha/internal/zzny;->zzq(Ljava/lang/String;)Lcom/google/android/recaptcha/internal/zzny;

    .line 264
    .line 265
    .line 266
    sget-object v4, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 267
    .line 268
    invoke-virtual {v3, v4}, Lcom/google/android/recaptcha/internal/zzny;->zzs(Ljava/lang/String;)Lcom/google/android/recaptcha/internal/zzny;

    .line 269
    .line 270
    .line 271
    :try_start_1
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 272
    .line 273
    if-lt v4, v6, :cond_c

    .line 274
    .line 275
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 276
    .line 277
    .line 278
    move-result-object v2

    .line 279
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 280
    .line 281
    .line 282
    move-result-object p1

    .line 283
    invoke-static {}, LG6/T;->h()Landroid/content/pm/PackageManager$PackageInfoFlags;

    .line 284
    .line 285
    .line 286
    move-result-object v4

    .line 287
    invoke-static {v2, p1, v4}, Lea/T;->b(Landroid/content/pm/PackageManager;Ljava/lang/String;Landroid/content/pm/PackageManager$PackageInfoFlags;)Landroid/content/pm/PackageInfo;

    .line 288
    .line 289
    .line 290
    move-result-object p1

    .line 291
    invoke-static {p1}, Lcom/bytedance/sdk/component/lw/oa/yo/oa/a;->d(Landroid/content/pm/PackageInfo;)J

    .line 292
    .line 293
    .line 294
    move-result-wide v4

    .line 295
    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object v7

    .line 299
    goto :goto_4

    .line 300
    :cond_c
    const/16 v5, 0x1c

    .line 301
    .line 302
    if-lt v4, v5, :cond_d

    .line 303
    .line 304
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 305
    .line 306
    .line 307
    move-result-object v4

    .line 308
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 309
    .line 310
    .line 311
    move-result-object p1

    .line 312
    invoke-virtual {v4, p1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 313
    .line 314
    .line 315
    move-result-object p1

    .line 316
    invoke-static {p1}, Lcom/bytedance/sdk/component/lw/oa/yo/oa/a;->d(Landroid/content/pm/PackageInfo;)J

    .line 317
    .line 318
    .line 319
    move-result-wide v4

    .line 320
    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object v7

    .line 324
    goto :goto_4

    .line 325
    :cond_d
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 326
    .line 327
    .line 328
    move-result-object v4

    .line 329
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 330
    .line 331
    .line 332
    move-result-object p1

    .line 333
    invoke-virtual {v4, p1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 334
    .line 335
    .line 336
    move-result-object p1

    .line 337
    iget p1, p1, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 338
    .line 339
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 340
    .line 341
    .line 342
    move-result-object v7
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    .line 343
    :catch_1
    :goto_4
    invoke-virtual {v3, v7}, Lcom/google/android/recaptcha/internal/zzny;->zzp(Ljava/lang/String;)Lcom/google/android/recaptcha/internal/zzny;

    .line 344
    .line 345
    .line 346
    invoke-virtual {v3}, Lcom/google/android/recaptcha/internal/zzkm;->zzh()Lcom/google/android/recaptcha/internal/zzks;

    .line 347
    .line 348
    .line 349
    move-result-object p1

    .line 350
    move-object v3, p1

    .line 351
    check-cast v3, Lcom/google/android/recaptcha/internal/zzoa;

    .line 352
    .line 353
    :cond_e
    sput-object v3, Lcom/google/android/recaptcha/internal/zzdf;->zza:Lcom/google/android/recaptcha/internal/zzoa;

    .line 354
    .line 355
    invoke-virtual {v3}, Lcom/google/android/recaptcha/internal/zzks;->zzq()Lcom/google/android/recaptcha/internal/zzkm;

    .line 356
    .line 357
    .line 358
    move-result-object p1

    .line 359
    check-cast p1, Lcom/google/android/recaptcha/internal/zzny;

    .line 360
    .line 361
    invoke-virtual {p1, p2}, Lcom/google/android/recaptcha/internal/zzny;->zzd(Ljava/lang/Iterable;)Lcom/google/android/recaptcha/internal/zzny;

    .line 362
    .line 363
    .line 364
    invoke-virtual {p1}, Lcom/google/android/recaptcha/internal/zzkm;->zzh()Lcom/google/android/recaptcha/internal/zzks;

    .line 365
    .line 366
    .line 367
    move-result-object p1

    .line 368
    check-cast p1, Lcom/google/android/recaptcha/internal/zzoa;

    .line 369
    .line 370
    :try_start_2
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 371
    .line 372
    .line 373
    move-result-object p2

    .line 374
    invoke-virtual {p2}, Ljava/util/Locale;->getISO3Language()Ljava/lang/String;

    .line 375
    .line 376
    .line 377
    move-result-object p2
    :try_end_2
    .catch Ljava/util/MissingResourceException; {:try_start_2 .. :try_end_2} :catch_2

    .line 378
    goto :goto_5

    .line 379
    :catch_2
    move-object p2, v0

    .line 380
    :goto_5
    :try_start_3
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 381
    .line 382
    .line 383
    move-result-object v2

    .line 384
    invoke-virtual {v2}, Ljava/util/Locale;->getISO3Country()Ljava/lang/String;

    .line 385
    .line 386
    .line 387
    move-result-object v0
    :try_end_3
    .catch Ljava/util/MissingResourceException; {:try_start_3 .. :try_end_3} :catch_3

    .line 388
    :catch_3
    iget-object v2, p0, Lcom/google/android/recaptcha/internal/zzdf;->zzb:Ljava/lang/String;

    .line 389
    .line 390
    invoke-static {}, Lcom/google/android/recaptcha/internal/zzpb;->zzf()Lcom/google/android/recaptcha/internal/zzpa;

    .line 391
    .line 392
    .line 393
    move-result-object v3

    .line 394
    invoke-virtual {v3, v2}, Lcom/google/android/recaptcha/internal/zzpa;->zzq(Ljava/lang/String;)Lcom/google/android/recaptcha/internal/zzpa;

    .line 395
    .line 396
    .line 397
    invoke-virtual {v3, p1}, Lcom/google/android/recaptcha/internal/zzpa;->zzd(Lcom/google/android/recaptcha/internal/zzoa;)Lcom/google/android/recaptcha/internal/zzpa;

    .line 398
    .line 399
    .line 400
    invoke-virtual {v3, p2}, Lcom/google/android/recaptcha/internal/zzpa;->zzp(Ljava/lang/String;)Lcom/google/android/recaptcha/internal/zzpa;

    .line 401
    .line 402
    .line 403
    invoke-virtual {v3, v0}, Lcom/google/android/recaptcha/internal/zzpa;->zze(Ljava/lang/String;)Lcom/google/android/recaptcha/internal/zzpa;

    .line 404
    .line 405
    .line 406
    invoke-virtual {v3}, Lcom/google/android/recaptcha/internal/zzkm;->zzh()Lcom/google/android/recaptcha/internal/zzks;

    .line 407
    .line 408
    .line 409
    move-result-object p1

    .line 410
    check-cast p1, Lcom/google/android/recaptcha/internal/zzpb;

    .line 411
    .line 412
    invoke-virtual {v1, p1}, Lcom/google/android/recaptcha/internal/zzoo;->zzt(Lcom/google/android/recaptcha/internal/zzpb;)Lcom/google/android/recaptcha/internal/zzoo;

    .line 413
    .line 414
    .line 415
    invoke-static {}, Lcom/google/android/recaptcha/internal/zzre;->zzi()Lcom/google/android/recaptcha/internal/zzrd;

    .line 416
    .line 417
    .line 418
    move-result-object p1

    .line 419
    invoke-virtual {p1, v1}, Lcom/google/android/recaptcha/internal/zzrd;->zzd(Lcom/google/android/recaptcha/internal/zzoo;)Lcom/google/android/recaptcha/internal/zzrd;

    .line 420
    .line 421
    .line 422
    invoke-virtual {p1}, Lcom/google/android/recaptcha/internal/zzkm;->zzh()Lcom/google/android/recaptcha/internal/zzks;

    .line 423
    .line 424
    .line 425
    move-result-object p1

    .line 426
    check-cast p1, Lcom/google/android/recaptcha/internal/zzre;

    .line 427
    .line 428
    iget-object p2, p0, Lcom/google/android/recaptcha/internal/zzdf;->zzf:Lcom/google/android/recaptcha/internal/zzdg;

    .line 429
    .line 430
    invoke-interface {p2, p1}, Lcom/google/android/recaptcha/internal/zzdg;->zza(Lcom/google/android/recaptcha/internal/zzre;)V

    .line 431
    .line 432
    .line 433
    return-void
.end method


# virtual methods
.method public final zza()V
    .locals 2

    .line 1
    const/4 v0, 0x3

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-direct {p0, v0, v1}, Lcom/google/android/recaptcha/internal/zzdf;->zzc(ILcom/google/android/recaptcha/internal/zzod;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final zzb(Lcom/google/android/recaptcha/internal/zzbj;)V
    .locals 2
    .param p1    # Lcom/google/android/recaptcha/internal/zzbj;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    invoke-static {}, Lcom/google/android/recaptcha/internal/zzod;->zzg()Lcom/google/android/recaptcha/internal/zzoc;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, Lcom/google/android/recaptcha/internal/zzbj;->zzb()Lcom/google/android/recaptcha/internal/zzbh;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Lcom/google/android/recaptcha/internal/zzbh;->zza()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v0, v1}, Lcom/google/android/recaptcha/internal/zzoc;->zzq(Ljava/lang/String;)Lcom/google/android/recaptcha/internal/zzoc;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Lcom/google/android/recaptcha/internal/zzbj;->zza()Lcom/google/android/recaptcha/internal/zzbg;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v1}, Lcom/google/android/recaptcha/internal/zzbg;->zza()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    invoke-virtual {v0, v1}, Lcom/google/android/recaptcha/internal/zzoc;->zzd(I)Lcom/google/android/recaptcha/internal/zzoc;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1}, Lcom/google/android/recaptcha/internal/zzbj;->zzc()Lcom/google/android/recaptcha/RecaptchaException;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v1}, Lcom/google/android/recaptcha/RecaptchaException;->getErrorCode()Lcom/google/android/recaptcha/RecaptchaErrorCode;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v1}, Lcom/google/android/recaptcha/RecaptchaErrorCode;->getErrorCode()I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    invoke-virtual {v0, v1}, Lcom/google/android/recaptcha/internal/zzoc;->zzp(I)Lcom/google/android/recaptcha/internal/zzoc;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1}, Lcom/google/android/recaptcha/internal/zzbj;->zzd()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    if-eqz p1, :cond_0

    .line 51
    .line 52
    invoke-virtual {v0, p1}, Lcom/google/android/recaptcha/internal/zzoc;->zze(Ljava/lang/String;)Lcom/google/android/recaptcha/internal/zzoc;

    .line 53
    .line 54
    .line 55
    :cond_0
    invoke-virtual {v0}, Lcom/google/android/recaptcha/internal/zzkm;->zzh()Lcom/google/android/recaptcha/internal/zzks;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    check-cast p1, Lcom/google/android/recaptcha/internal/zzod;

    .line 60
    .line 61
    const/4 v0, 0x4

    .line 62
    invoke-direct {p0, v0, p1}, Lcom/google/android/recaptcha/internal/zzdf;->zzc(ILcom/google/android/recaptcha/internal/zzod;)V

    .line 63
    .line 64
    .line 65
    return-void
.end method
