.class public final Lcom/google/android/gms/internal/ads/zztk;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final zza:Landroid/content/Context;

.field private zzb:Ljava/lang/Boolean;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zztk;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zztk;->zza:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/ads/zzv;Lcom/google/android/gms/internal/ads/zzd;)Lcom/google/android/gms/internal/ads/zzqu;
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 8
    .line 9
    const/16 v1, 0x1d

    .line 10
    .line 11
    if-lt v0, v1, :cond_e

    .line 12
    .line 13
    iget v1, p1, Lcom/google/android/gms/internal/ads/zzv;->zzJ:I

    .line 14
    .line 15
    const/4 v2, -0x1

    .line 16
    if-ne v1, v2, :cond_0

    .line 17
    .line 18
    goto/16 :goto_4

    .line 19
    .line 20
    :cond_0
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zztk;->zza:Landroid/content/Context;

    .line 21
    .line 22
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zztk;->zzb:Ljava/lang/Boolean;

    .line 23
    .line 24
    const/4 v4, 0x1

    .line 25
    const/4 v5, 0x0

    .line 26
    if-eqz v3, :cond_1

    .line 27
    .line 28
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    goto :goto_2

    .line 33
    :cond_1
    if-eqz v2, :cond_3

    .line 34
    .line 35
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzcj;->zza(Landroid/content/Context;)Landroid/media/AudioManager;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    const-string v3, "offloadVariableRateSupported"

    .line 40
    .line 41
    invoke-virtual {v2, v3}, Landroid/media/AudioManager;->getParameters(Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    if-eqz v2, :cond_2

    .line 46
    .line 47
    const-string v3, "offloadVariableRateSupported=1"

    .line 48
    .line 49
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    if-eqz v2, :cond_2

    .line 54
    .line 55
    move v2, v4

    .line 56
    goto :goto_0

    .line 57
    :cond_2
    move v2, v5

    .line 58
    :goto_0
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    iput-object v2, p0, Lcom/google/android/gms/internal/ads/zztk;->zzb:Ljava/lang/Boolean;

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_3
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 66
    .line 67
    iput-object v2, p0, Lcom/google/android/gms/internal/ads/zztk;->zzb:Ljava/lang/Boolean;

    .line 68
    .line 69
    :goto_1
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zztk;->zzb:Ljava/lang/Boolean;

    .line 70
    .line 71
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    :goto_2
    iget-object v3, p1, Lcom/google/android/gms/internal/ads/zzv;->zzp:Ljava/lang/String;

    .line 76
    .line 77
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    iget-object v6, p1, Lcom/google/android/gms/internal/ads/zzv;->zzk:Ljava/lang/String;

    .line 81
    .line 82
    invoke-static {v3, v6}, Lcom/google/android/gms/internal/ads/zzas;->zzg(Ljava/lang/String;Ljava/lang/String;)I

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    if-eqz v3, :cond_d

    .line 87
    .line 88
    invoke-static {v3}, Lcom/google/android/gms/internal/ads/zzfm;->zzH(I)I

    .line 89
    .line 90
    .line 91
    move-result v6

    .line 92
    if-ge v0, v6, :cond_4

    .line 93
    .line 94
    goto/16 :goto_3

    .line 95
    .line 96
    :cond_4
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzfm;->zzF(Lcom/google/android/gms/internal/ads/zzv;)I

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    if-eqz p1, :cond_c

    .line 101
    .line 102
    :try_start_0
    new-instance v6, Landroid/media/AudioFormat$Builder;

    .line 103
    .line 104
    invoke-direct {v6}, Landroid/media/AudioFormat$Builder;-><init>()V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v6, v1}, Landroid/media/AudioFormat$Builder;->setSampleRate(I)Landroid/media/AudioFormat$Builder;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    invoke-virtual {v1, p1}, Landroid/media/AudioFormat$Builder;->setChannelMask(I)Landroid/media/AudioFormat$Builder;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    invoke-virtual {p1, v3}, Landroid/media/AudioFormat$Builder;->setEncoding(I)Landroid/media/AudioFormat$Builder;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    invoke-virtual {p1}, Landroid/media/AudioFormat$Builder;->build()Landroid/media/AudioFormat;

    .line 120
    .line 121
    .line 122
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 123
    const/16 v1, 0x21

    .line 124
    .line 125
    if-lt v0, v1, :cond_7

    .line 126
    .line 127
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzd;->zza()Landroid/media/AudioAttributes;

    .line 128
    .line 129
    .line 130
    move-result-object p2

    .line 131
    invoke-static {p1, p2}, LG6/T;->a(Landroid/media/AudioFormat;Landroid/media/AudioAttributes;)I

    .line 132
    .line 133
    .line 134
    move-result p1

    .line 135
    and-int/lit8 p2, p1, 0x1

    .line 136
    .line 137
    if-nez p2, :cond_5

    .line 138
    .line 139
    sget-object p1, Lcom/google/android/gms/internal/ads/zzqu;->zza:Lcom/google/android/gms/internal/ads/zzqu;

    .line 140
    .line 141
    return-object p1

    .line 142
    :cond_5
    const/4 p2, 0x3

    .line 143
    and-int/2addr p1, p2

    .line 144
    if-ne p1, p2, :cond_6

    .line 145
    .line 146
    move v5, v4

    .line 147
    :cond_6
    new-instance p1, Lcom/google/android/gms/internal/ads/zzqt;

    .line 148
    .line 149
    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzqt;-><init>()V

    .line 150
    .line 151
    .line 152
    invoke-virtual {p1, v4}, Lcom/google/android/gms/internal/ads/zzqt;->zza(Z)Lcom/google/android/gms/internal/ads/zzqt;

    .line 153
    .line 154
    .line 155
    invoke-virtual {p1, v5}, Lcom/google/android/gms/internal/ads/zzqt;->zzb(Z)Lcom/google/android/gms/internal/ads/zzqt;

    .line 156
    .line 157
    .line 158
    invoke-virtual {p1, v2}, Lcom/google/android/gms/internal/ads/zzqt;->zzc(Z)Lcom/google/android/gms/internal/ads/zzqt;

    .line 159
    .line 160
    .line 161
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzqt;->zzd()Lcom/google/android/gms/internal/ads/zzqu;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    return-object p1

    .line 166
    :cond_7
    const/16 v1, 0x1f

    .line 167
    .line 168
    if-lt v0, v1, :cond_a

    .line 169
    .line 170
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzd;->zza()Landroid/media/AudioAttributes;

    .line 171
    .line 172
    .line 173
    move-result-object p2

    .line 174
    invoke-static {p1, p2}, LV1/h;->a(Landroid/media/AudioFormat;Landroid/media/AudioAttributes;)I

    .line 175
    .line 176
    .line 177
    move-result p1

    .line 178
    if-nez p1, :cond_8

    .line 179
    .line 180
    sget-object p1, Lcom/google/android/gms/internal/ads/zzqu;->zza:Lcom/google/android/gms/internal/ads/zzqu;

    .line 181
    .line 182
    return-object p1

    .line 183
    :cond_8
    new-instance p2, Lcom/google/android/gms/internal/ads/zzqt;

    .line 184
    .line 185
    invoke-direct {p2}, Lcom/google/android/gms/internal/ads/zzqt;-><init>()V

    .line 186
    .line 187
    .line 188
    const/16 v1, 0x20

    .line 189
    .line 190
    if-le v0, v1, :cond_9

    .line 191
    .line 192
    const/4 v0, 0x2

    .line 193
    if-ne p1, v0, :cond_9

    .line 194
    .line 195
    move v5, v4

    .line 196
    :cond_9
    invoke-virtual {p2, v4}, Lcom/google/android/gms/internal/ads/zzqt;->zza(Z)Lcom/google/android/gms/internal/ads/zzqt;

    .line 197
    .line 198
    .line 199
    invoke-virtual {p2, v5}, Lcom/google/android/gms/internal/ads/zzqt;->zzb(Z)Lcom/google/android/gms/internal/ads/zzqt;

    .line 200
    .line 201
    .line 202
    invoke-virtual {p2, v2}, Lcom/google/android/gms/internal/ads/zzqt;->zzc(Z)Lcom/google/android/gms/internal/ads/zzqt;

    .line 203
    .line 204
    .line 205
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzqt;->zzd()Lcom/google/android/gms/internal/ads/zzqu;

    .line 206
    .line 207
    .line 208
    move-result-object p1

    .line 209
    return-object p1

    .line 210
    :cond_a
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzd;->zza()Landroid/media/AudioAttributes;

    .line 211
    .line 212
    .line 213
    move-result-object p2

    .line 214
    invoke-static {p1, p2}, LG5/d;->D(Landroid/media/AudioFormat;Landroid/media/AudioAttributes;)Z

    .line 215
    .line 216
    .line 217
    move-result p1

    .line 218
    if-nez p1, :cond_b

    .line 219
    .line 220
    sget-object p1, Lcom/google/android/gms/internal/ads/zzqu;->zza:Lcom/google/android/gms/internal/ads/zzqu;

    .line 221
    .line 222
    return-object p1

    .line 223
    :cond_b
    new-instance p1, Lcom/google/android/gms/internal/ads/zzqt;

    .line 224
    .line 225
    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzqt;-><init>()V

    .line 226
    .line 227
    .line 228
    invoke-virtual {p1, v4}, Lcom/google/android/gms/internal/ads/zzqt;->zza(Z)Lcom/google/android/gms/internal/ads/zzqt;

    .line 229
    .line 230
    .line 231
    invoke-virtual {p1, v2}, Lcom/google/android/gms/internal/ads/zzqt;->zzc(Z)Lcom/google/android/gms/internal/ads/zzqt;

    .line 232
    .line 233
    .line 234
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzqt;->zzd()Lcom/google/android/gms/internal/ads/zzqu;

    .line 235
    .line 236
    .line 237
    move-result-object p1

    .line 238
    return-object p1

    .line 239
    :catch_0
    sget-object p1, Lcom/google/android/gms/internal/ads/zzqu;->zza:Lcom/google/android/gms/internal/ads/zzqu;

    .line 240
    .line 241
    return-object p1

    .line 242
    :cond_c
    sget-object p1, Lcom/google/android/gms/internal/ads/zzqu;->zza:Lcom/google/android/gms/internal/ads/zzqu;

    .line 243
    .line 244
    return-object p1

    .line 245
    :cond_d
    :goto_3
    sget-object p1, Lcom/google/android/gms/internal/ads/zzqu;->zza:Lcom/google/android/gms/internal/ads/zzqu;

    .line 246
    .line 247
    return-object p1

    .line 248
    :cond_e
    :goto_4
    sget-object p1, Lcom/google/android/gms/internal/ads/zzqu;->zza:Lcom/google/android/gms/internal/ads/zzqu;

    .line 249
    .line 250
    return-object p1
.end method
