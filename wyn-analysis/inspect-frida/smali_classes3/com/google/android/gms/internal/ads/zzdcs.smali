.class public final Lcom/google/android/gms/internal/ads/zzdcs;
.super LD6/G0;
.source "SourceFile"


# instance fields
.field private final zza:Ljava/lang/String;

.field private final zzb:Ljava/lang/String;

.field private final zzc:Ljava/lang/String;

.field private final zzd:Ljava/lang/String;

.field private final zze:Ljava/util/List;

.field private final zzf:J

.field private final zzg:Ljava/lang/String;

.field private final zzh:Lcom/google/android/gms/internal/ads/zzemf;

.field private final zzi:Landroid/os/Bundle;

.field private final zzj:D

.field private final zzk:I


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzfkn;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzemf;Lcom/google/android/gms/internal/ads/zzfkq;Ljava/lang/String;)V
    .locals 2

    .line 1
    const-string v0, "com.google.android.gms.ads.internal.client.IResponseInfo"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzbem;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    move-object v1, v0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    iget-object v1, p1, Lcom/google/android/gms/internal/ads/zzfkn;->zzab:Ljava/lang/String;

    .line 12
    .line 13
    :goto_0
    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzdcs;->zzb:Ljava/lang/String;

    .line 14
    .line 15
    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzdcs;->zzc:Ljava/lang/String;

    .line 16
    .line 17
    if-nez p4, :cond_1

    .line 18
    .line 19
    move-object p5, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_1
    iget-object p5, p4, Lcom/google/android/gms/internal/ads/zzfkq;->zzb:Ljava/lang/String;

    .line 22
    .line 23
    :goto_1
    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzdcs;->zzd:Ljava/lang/String;

    .line 24
    .line 25
    const-string p5, "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter"

    .line 26
    .line 27
    invoke-virtual {p5, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p5

    .line 31
    if-nez p5, :cond_2

    .line 32
    .line 33
    const-string p5, "com.google.ads.mediation.customevent.CustomEventAdapter"

    .line 34
    .line 35
    invoke-virtual {p5, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result p5

    .line 39
    if-eqz p5, :cond_3

    .line 40
    .line 41
    :cond_2
    if-eqz p1, :cond_3

    .line 42
    .line 43
    :try_start_0
    iget-object p5, p1, Lcom/google/android/gms/internal/ads/zzfkn;->zzv:Lorg/json/JSONObject;

    .line 44
    .line 45
    const-string v1, "class_name"

    .line 46
    .line 47
    invoke-virtual {p5, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 51
    :catch_0
    :cond_3
    if-eqz v0, :cond_4

    .line 52
    .line 53
    move-object p2, v0

    .line 54
    :cond_4
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzdcs;->zza:Ljava/lang/String;

    .line 55
    .line 56
    invoke-virtual {p3}, Lcom/google/android/gms/internal/ads/zzemf;->zzh()Ljava/util/List;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzdcs;->zze:Ljava/util/List;

    .line 61
    .line 62
    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzdcs;->zzh:Lcom/google/android/gms/internal/ads/zzemf;

    .line 63
    .line 64
    if-nez p1, :cond_5

    .line 65
    .line 66
    const-wide/16 p2, 0x0

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_5
    iget-wide p2, p1, Lcom/google/android/gms/internal/ads/zzfkn;->zzaz:D

    .line 70
    .line 71
    :goto_2
    iput-wide p2, p0, Lcom/google/android/gms/internal/ads/zzdcs;->zzj:D

    .line 72
    .line 73
    if-nez p1, :cond_6

    .line 74
    .line 75
    const/4 p2, 0x2

    .line 76
    goto :goto_3

    .line 77
    :cond_6
    iget p2, p1, Lcom/google/android/gms/internal/ads/zzfkn;->zzaI:I

    .line 78
    .line 79
    :goto_3
    iput p2, p0, Lcom/google/android/gms/internal/ads/zzdcs;->zzk:I

    .line 80
    .line 81
    sget-object p2, LC6/n;->D:LC6/n;

    .line 82
    .line 83
    iget-object p2, p2, LC6/n;->k:Ln7/b;

    .line 84
    .line 85
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 89
    .line 90
    .line 91
    move-result-wide p2

    .line 92
    const-wide/16 v0, 0x3e8

    .line 93
    .line 94
    div-long/2addr p2, v0

    .line 95
    iput-wide p2, p0, Lcom/google/android/gms/internal/ads/zzdcs;->zzf:J

    .line 96
    .line 97
    sget-object p2, Lcom/google/android/gms/internal/ads/zzbix;->zzw:Lcom/google/android/gms/internal/ads/zzbio;

    .line 98
    .line 99
    sget-object p3, LD6/s;->e:LD6/s;

    .line 100
    .line 101
    iget-object p5, p3, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 102
    .line 103
    invoke-virtual {p5, p2}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p2

    .line 107
    check-cast p2, Ljava/lang/Boolean;

    .line 108
    .line 109
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 110
    .line 111
    .line 112
    move-result p2

    .line 113
    iget-object p3, p3, LD6/s;->c:Lcom/google/android/gms/internal/ads/zzbiv;

    .line 114
    .line 115
    if-eqz p2, :cond_9

    .line 116
    .line 117
    new-instance p2, Landroid/os/Bundle;

    .line 118
    .line 119
    invoke-direct {p2}, Landroid/os/Bundle;-><init>()V

    .line 120
    .line 121
    .line 122
    sget-object p5, Lcom/google/android/gms/internal/ads/zzbix;->zzhQ:Lcom/google/android/gms/internal/ads/zzbio;

    .line 123
    .line 124
    invoke-virtual {p3, p5}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object p5

    .line 128
    check-cast p5, Ljava/lang/Boolean;

    .line 129
    .line 130
    invoke-virtual {p5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 131
    .line 132
    .line 133
    move-result p5

    .line 134
    if-eqz p5, :cond_7

    .line 135
    .line 136
    if-eqz p4, :cond_7

    .line 137
    .line 138
    iget-object p5, p4, Lcom/google/android/gms/internal/ads/zzfkq;->zzk:Landroid/os/Bundle;

    .line 139
    .line 140
    invoke-virtual {p2, p5}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 141
    .line 142
    .line 143
    :cond_7
    sget-object p5, Lcom/google/android/gms/internal/ads/zzbix;->zzhR:Lcom/google/android/gms/internal/ads/zzbio;

    .line 144
    .line 145
    invoke-virtual {p3, p5}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object p5

    .line 149
    check-cast p5, Ljava/lang/Boolean;

    .line 150
    .line 151
    invoke-virtual {p5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 152
    .line 153
    .line 154
    move-result p5

    .line 155
    if-eqz p5, :cond_8

    .line 156
    .line 157
    if-eqz p1, :cond_8

    .line 158
    .line 159
    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzfkn;->zzaF:Landroid/os/Bundle;

    .line 160
    .line 161
    invoke-virtual {p2, p1}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 162
    .line 163
    .line 164
    :cond_8
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzdcs;->zzi:Landroid/os/Bundle;

    .line 165
    .line 166
    goto :goto_5

    .line 167
    :cond_9
    sget-object p2, Lcom/google/android/gms/internal/ads/zzbix;->zzhQ:Lcom/google/android/gms/internal/ads/zzbio;

    .line 168
    .line 169
    invoke-virtual {p3, p2}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object p2

    .line 173
    check-cast p2, Ljava/lang/Boolean;

    .line 174
    .line 175
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 176
    .line 177
    .line 178
    move-result p2

    .line 179
    if-eqz p2, :cond_a

    .line 180
    .line 181
    if-eqz p4, :cond_a

    .line 182
    .line 183
    iget-object p2, p4, Lcom/google/android/gms/internal/ads/zzfkq;->zzk:Landroid/os/Bundle;

    .line 184
    .line 185
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzdcs;->zzi:Landroid/os/Bundle;

    .line 186
    .line 187
    goto :goto_4

    .line 188
    :cond_a
    new-instance p2, Landroid/os/Bundle;

    .line 189
    .line 190
    invoke-direct {p2}, Landroid/os/Bundle;-><init>()V

    .line 191
    .line 192
    .line 193
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzdcs;->zzi:Landroid/os/Bundle;

    .line 194
    .line 195
    :goto_4
    sget-object p2, Lcom/google/android/gms/internal/ads/zzbix;->zzhR:Lcom/google/android/gms/internal/ads/zzbio;

    .line 196
    .line 197
    invoke-virtual {p3, p2}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object p2

    .line 201
    check-cast p2, Ljava/lang/Boolean;

    .line 202
    .line 203
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 204
    .line 205
    .line 206
    move-result p2

    .line 207
    if-eqz p2, :cond_b

    .line 208
    .line 209
    if-eqz p1, :cond_b

    .line 210
    .line 211
    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzfkn;->zzaF:Landroid/os/Bundle;

    .line 212
    .line 213
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzdcs;->zzi:Landroid/os/Bundle;

    .line 214
    .line 215
    if-eqz p2, :cond_b

    .line 216
    .line 217
    invoke-virtual {p2, p1}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 218
    .line 219
    .line 220
    :cond_b
    :goto_5
    sget-object p1, Lcom/google/android/gms/internal/ads/zzbix;->zzkM:Lcom/google/android/gms/internal/ads/zzbio;

    .line 221
    .line 222
    invoke-virtual {p3, p1}, Lcom/google/android/gms/internal/ads/zzbiv;->zzd(Lcom/google/android/gms/internal/ads/zzbio;)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object p1

    .line 226
    check-cast p1, Ljava/lang/Boolean;

    .line 227
    .line 228
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 229
    .line 230
    .line 231
    move-result p1

    .line 232
    if-eqz p1, :cond_d

    .line 233
    .line 234
    if-eqz p4, :cond_d

    .line 235
    .line 236
    iget-object p1, p4, Lcom/google/android/gms/internal/ads/zzfkq;->zzi:Ljava/lang/String;

    .line 237
    .line 238
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 239
    .line 240
    .line 241
    move-result p1

    .line 242
    if-eqz p1, :cond_c

    .line 243
    .line 244
    goto :goto_6

    .line 245
    :cond_c
    iget-object p1, p4, Lcom/google/android/gms/internal/ads/zzfkq;->zzi:Ljava/lang/String;

    .line 246
    .line 247
    goto :goto_7

    .line 248
    :cond_d
    :goto_6
    const-string p1, ""

    .line 249
    .line 250
    :goto_7
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzdcs;->zzg:Ljava/lang/String;

    .line 251
    .line 252
    return-void
.end method


# virtual methods
.method public final zzc()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzdcs;->zzf:J

    return-wide v0
.end method

.method public final zzd()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdcs;->zzg:Ljava/lang/String;

    return-object v0
.end method

.method public final zze()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdcs;->zza:Ljava/lang/String;

    return-object v0
.end method

.method public final zzf()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdcs;->zzb:Ljava/lang/String;

    return-object v0
.end method

.method public final zzg()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdcs;->zze:Ljava/util/List;

    return-object v0
.end method

.method public final zzh()LD6/z1;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdcs;->zzh:Lcom/google/android/gms/internal/ads/zzemf;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzemf;->zzg()LD6/z1;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
.end method

.method public final zzi()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdcs;->zzi:Landroid/os/Bundle;

    return-object v0
.end method

.method public final zzj()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdcs;->zzc:Ljava/lang/String;

    return-object v0
.end method

.method public final zzk()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzdcs;->zzd:Ljava/lang/String;

    return-object v0
.end method

.method public final zzl()D
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzdcs;->zzj:D

    return-wide v0
.end method

.method public final zzm()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzdcs;->zzk:I

    return v0
.end method
