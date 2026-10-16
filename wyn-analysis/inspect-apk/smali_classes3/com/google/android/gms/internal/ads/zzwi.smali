.class public final Lcom/google/android/gms/internal/ads/zzwi;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic zza:I

.field private static final zzb:Ljava/util/HashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/google/android/gms/internal/ads/zzwi;->zzb:Ljava/util/HashMap;

    .line 7
    .line 8
    return-void
.end method

.method public static zza()Lcom/google/android/gms/internal/ads/zzvp;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzwa;
        }
    .end annotation

    .line 1
    const-string v0, "audio/raw"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1, v1}, Lcom/google/android/gms/internal/ads/zzwi;->zzb(Ljava/lang/String;ZZ)Ljava/util/List;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    return-object v0

    .line 16
    :cond_0
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Lcom/google/android/gms/internal/ads/zzvp;

    .line 21
    .line 22
    return-object v0
.end method

.method public static declared-synchronized zzb(Ljava/lang/String;ZZ)Ljava/util/List;
    .locals 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzwa;
        }
    .end annotation

    .line 1
    const-class v1, Lcom/google/android/gms/internal/ads/zzwi;

    .line 2
    .line 3
    monitor-enter v1

    .line 4
    :try_start_0
    new-instance v0, Lcom/google/android/gms/internal/ads/zzvz;

    .line 5
    .line 6
    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/ads/zzvz;-><init>(Ljava/lang/String;ZZ)V

    .line 7
    .line 8
    .line 9
    sget-object v2, Lcom/google/android/gms/internal/ads/zzwi;->zzb:Ljava/util/HashMap;

    .line 10
    .line 11
    invoke-virtual {v2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    check-cast v3, Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    if-eqz v3, :cond_0

    .line 18
    .line 19
    monitor-exit v1

    .line 20
    return-object v3

    .line 21
    :cond_0
    :try_start_1
    const-string v3, "video/mv-hevc"

    .line 22
    .line 23
    invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    new-instance v4, Lcom/google/android/gms/internal/ads/zzwd;

    .line 28
    .line 29
    invoke-direct {v4, p1, p2, v3}, Lcom/google/android/gms/internal/ads/zzwd;-><init>(ZZZ)V

    .line 30
    .line 31
    .line 32
    invoke-static {v0, v4}, Lcom/google/android/gms/internal/ads/zzwi;->zzh(Lcom/google/android/gms/internal/ads/zzvz;Lcom/google/android/gms/internal/ads/zzwb;)Ljava/util/ArrayList;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    const/4 v3, 0x0

    .line 37
    if-eqz p1, :cond_1

    .line 38
    .line 39
    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    if-eqz p1, :cond_1

    .line 44
    .line 45
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 46
    .line 47
    const/16 v4, 0x17

    .line 48
    .line 49
    if-ne p1, v4, :cond_1

    .line 50
    .line 51
    new-instance p1, Lcom/google/android/gms/internal/ads/zzwc;

    .line 52
    .line 53
    const/4 p2, 0x0

    .line 54
    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/ads/zzwc;-><init>([B)V

    .line 55
    .line 56
    .line 57
    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/zzwi;->zzh(Lcom/google/android/gms/internal/ads/zzvz;Lcom/google/android/gms/internal/ads/zzwb;)Ljava/util/ArrayList;

    .line 58
    .line 59
    .line 60
    move-result-object p2

    .line 61
    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    if-nez p1, :cond_1

    .line 66
    .line 67
    invoke-virtual {p2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    check-cast p1, Lcom/google/android/gms/internal/ads/zzvp;

    .line 72
    .line 73
    iget-object p1, p1, Lcom/google/android/gms/internal/ads/zzvp;->zza:Ljava/lang/String;

    .line 74
    .line 75
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 76
    .line 77
    .line 78
    move-result v4

    .line 79
    add-int/lit8 v4, v4, 0x3f

    .line 80
    .line 81
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 82
    .line 83
    .line 84
    move-result v5

    .line 85
    new-instance v6, Ljava/lang/StringBuilder;

    .line 86
    .line 87
    add-int/2addr v4, v5

    .line 88
    invoke-direct {v6, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 89
    .line 90
    .line 91
    const-string v4, "MediaCodecList API didn\'t list secure decoder for: "

    .line 92
    .line 93
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v6, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    const-string v4, ". Assuming: "

    .line 100
    .line 101
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    const-string v4, "MediaCodecUtil"

    .line 112
    .line 113
    invoke-static {v4, p1}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    goto :goto_0

    .line 117
    :catchall_0
    move-exception v0

    .line 118
    move-object p0, v0

    .line 119
    goto/16 :goto_1

    .line 120
    .line 121
    :cond_1
    :goto_0
    const-string p1, "audio/raw"

    .line 122
    .line 123
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result p0

    .line 127
    const/4 p1, 0x1

    .line 128
    if-eqz p0, :cond_3

    .line 129
    .line 130
    sget p0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 131
    .line 132
    const/16 v4, 0x1a

    .line 133
    .line 134
    if-ge p0, v4, :cond_2

    .line 135
    .line 136
    sget-object p0, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    .line 137
    .line 138
    const-string v4, "R9"

    .line 139
    .line 140
    invoke-virtual {p0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result p0

    .line 144
    if-eqz p0, :cond_2

    .line 145
    .line 146
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 147
    .line 148
    .line 149
    move-result p0

    .line 150
    if-ne p0, p1, :cond_2

    .line 151
    .line 152
    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    check-cast p0, Lcom/google/android/gms/internal/ads/zzvp;

    .line 157
    .line 158
    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzvp;->zza:Ljava/lang/String;

    .line 159
    .line 160
    const-string v4, "OMX.MTK.AUDIO.DECODER.RAW"

    .line 161
    .line 162
    invoke-virtual {p0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result p0

    .line 166
    if-eqz p0, :cond_2

    .line 167
    .line 168
    const-string v4, "OMX.google.raw.decoder"

    .line 169
    .line 170
    const-string v5, "audio/raw"

    .line 171
    .line 172
    const-string v6, "audio/raw"

    .line 173
    .line 174
    const/4 v11, 0x0

    .line 175
    const/4 v12, 0x0

    .line 176
    const/4 v7, 0x0

    .line 177
    const/4 v8, 0x0

    .line 178
    const/4 v9, 0x1

    .line 179
    const/4 v10, 0x0

    .line 180
    invoke-static/range {v4 .. v12}, Lcom/google/android/gms/internal/ads/zzvp;->zza(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/media/MediaCodecInfo$CodecCapabilities;ZZZZZ)Lcom/google/android/gms/internal/ads/zzvp;

    .line 181
    .line 182
    .line 183
    move-result-object p0

    .line 184
    invoke-interface {p2, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    :cond_2
    sget-object p0, Lcom/google/android/gms/internal/ads/zzwe;->zza:Lcom/google/android/gms/internal/ads/zzwe;

    .line 188
    .line 189
    invoke-static {p2, p0}, Lcom/google/android/gms/internal/ads/zzwi;->zzj(Ljava/util/List;Lcom/google/android/gms/internal/ads/zzwh;)V

    .line 190
    .line 191
    .line 192
    :cond_3
    sget p0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 193
    .line 194
    const/16 v4, 0x20

    .line 195
    .line 196
    if-ge p0, v4, :cond_4

    .line 197
    .line 198
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 199
    .line 200
    .line 201
    move-result p0

    .line 202
    if-le p0, p1, :cond_4

    .line 203
    .line 204
    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object p0

    .line 208
    check-cast p0, Lcom/google/android/gms/internal/ads/zzvp;

    .line 209
    .line 210
    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzvp;->zza:Ljava/lang/String;

    .line 211
    .line 212
    const-string p1, "OMX.qti.audio.decoder.flac"

    .line 213
    .line 214
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    move-result p0

    .line 218
    if-eqz p0, :cond_4

    .line 219
    .line 220
    invoke-interface {p2, v3}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object p0

    .line 224
    check-cast p0, Lcom/google/android/gms/internal/ads/zzvp;

    .line 225
    .line 226
    invoke-interface {p2, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    :cond_4
    invoke-static {p2}, Lcom/google/android/gms/internal/ads/zzgwt;->zzq(Ljava/util/Collection;)Lcom/google/android/gms/internal/ads/zzgwt;

    .line 230
    .line 231
    .line 232
    move-result-object p0

    .line 233
    invoke-virtual {v2, v0, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 234
    .line 235
    .line 236
    monitor-exit v1

    .line 237
    return-object p0

    .line 238
    :goto_1
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 239
    throw p0
.end method

.method public static zzc(Lcom/google/android/gms/internal/ads/zzvy;Lcom/google/android/gms/internal/ads/zzv;ZZ)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzwa;
        }
    .end annotation

    .line 1
    iget-object v0, p1, Lcom/google/android/gms/internal/ads/zzv;->zzp:Ljava/lang/String;

    .line 2
    .line 3
    invoke-interface {p0, v0, p2, p3}, Lcom/google/android/gms/internal/ads/zzvy;->zza(Ljava/lang/String;ZZ)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {p0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzwi;->zzd(Lcom/google/android/gms/internal/ads/zzvy;Lcom/google/android/gms/internal/ads/zzv;ZZ)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    sget p1, Lcom/google/android/gms/internal/ads/zzgwt;->zzd:I

    .line 12
    .line 13
    new-instance p1, Lcom/google/android/gms/internal/ads/zzgwq;

    .line 14
    .line 15
    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzgwq;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/zzgwq;->zzh(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/ads/zzgwq;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/ads/zzgwq;->zzh(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/ads/zzgwq;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzgwq;->zzi()Lcom/google/android/gms/internal/ads/zzgwt;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0
.end method

.method public static zzd(Lcom/google/android/gms/internal/ads/zzvy;Lcom/google/android/gms/internal/ads/zzv;ZZ)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzwa;
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzwi;->zzg(Lcom/google/android/gms/internal/ads/zzv;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgwt;->zzi()Lcom/google/android/gms/internal/ads/zzgwt;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    invoke-interface {p0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzvy;->zza(Ljava/lang/String;ZZ)Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public static zze(Landroid/content/Context;Ljava/util/List;Lcom/google/android/gms/internal/ads/zzv;)Ljava/util/List;
    .locals 1

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 4
    .line 5
    .line 6
    new-instance p1, Lcom/google/android/gms/internal/ads/zzwg;

    .line 7
    .line 8
    invoke-direct {p1, p0, p2}, Lcom/google/android/gms/internal/ads/zzwg;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzv;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/zzwi;->zzj(Ljava/util/List;Lcom/google/android/gms/internal/ads/zzwh;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public static zzf(II)Landroid/media/MediaCodecInfo$CodecProfileLevel;
    .locals 1

    .line 1
    new-instance v0, Landroid/media/MediaCodecInfo$CodecProfileLevel;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/media/MediaCodecInfo$CodecProfileLevel;-><init>()V

    .line 4
    .line 5
    .line 6
    iput p0, v0, Landroid/media/MediaCodecInfo$CodecProfileLevel;->profile:I

    .line 7
    .line 8
    iput p1, v0, Landroid/media/MediaCodecInfo$CodecProfileLevel;->level:I

    .line 9
    .line 10
    return-object v0
.end method

.method public static zzg(Lcom/google/android/gms/internal/ads/zzv;)Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzv;->zzp:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "audio/eac3-joc"

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    const-string p0, "audio/eac3"

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    const-string v1, "audio/vnd.dts.hd"

    .line 15
    .line 16
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-nez v1, :cond_8

    .line 21
    .line 22
    const-string v1, "audio/vnd.dts.uhd;profile=p2"

    .line 23
    .line 24
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    goto :goto_2

    .line 31
    :cond_1
    const-string v1, "video/dolby-vision"

    .line 32
    .line 33
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v1, :cond_5

    .line 38
    .line 39
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzdr;->zzf(Lcom/google/android/gms/internal/ads/zzv;)Lcom/google/android/gms/internal/ads/zzdq;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    if-eqz v1, :cond_5

    .line 44
    .line 45
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzdq;->zzc()Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-eqz v2, :cond_5

    .line 50
    .line 51
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzdq;->zza()I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    const/16 v2, 0x10

    .line 56
    .line 57
    if-eq v1, v2, :cond_6

    .line 58
    .line 59
    const/16 v2, 0x100

    .line 60
    .line 61
    if-ne v1, v2, :cond_2

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_2
    const/16 v2, 0x200

    .line 65
    .line 66
    if-ne v1, v2, :cond_3

    .line 67
    .line 68
    const-string p0, "video/avc"

    .line 69
    .line 70
    return-object p0

    .line 71
    :cond_3
    const/16 v2, 0x400

    .line 72
    .line 73
    if-ne v1, v2, :cond_5

    .line 74
    .line 75
    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzv;->zzF:Lcom/google/android/gms/internal/ads/zzi;

    .line 76
    .line 77
    if-eqz p0, :cond_4

    .line 78
    .line 79
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzi;->zzd:I

    .line 80
    .line 81
    const/4 v1, 0x6

    .line 82
    if-ne v0, v1, :cond_4

    .line 83
    .line 84
    iget p0, p0, Lcom/google/android/gms/internal/ads/zzi;->zzc:I

    .line 85
    .line 86
    const/4 v0, 0x1

    .line 87
    if-ne p0, v0, :cond_4

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_4
    const-string p0, "video/av01"

    .line 91
    .line 92
    return-object p0

    .line 93
    :cond_5
    const-string p0, "video/mv-hevc"

    .line 94
    .line 95
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result p0

    .line 99
    if-eqz p0, :cond_7

    .line 100
    .line 101
    :cond_6
    :goto_0
    const-string p0, "video/hevc"

    .line 102
    .line 103
    return-object p0

    .line 104
    :cond_7
    :goto_1
    const/4 p0, 0x0

    .line 105
    return-object p0

    .line 106
    :cond_8
    :goto_2
    const-string p0, "audio/vnd.dts"

    .line 107
    .line 108
    return-object p0
.end method

.method private static zzh(Lcom/google/android/gms/internal/ads/zzvz;Lcom/google/android/gms/internal/ads/zzwb;)Ljava/util/ArrayList;
    .locals 27
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzwa;
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    const-string v3, "secure-playback"

    .line 6
    .line 7
    const-string v4, "tunneled-playback"

    .line 8
    .line 9
    const-string v5, " (failed to query capabilities)"

    .line 10
    .line 11
    const-string v6, "Skipping codec "

    .line 12
    .line 13
    const-string v7, ")"

    .line 14
    .line 15
    const-string v8, " ("

    .line 16
    .line 17
    const-string v9, "Failed to query codec "

    .line 18
    .line 19
    :try_start_0
    new-instance v11, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    iget-object v13, v1, Lcom/google/android/gms/internal/ads/zzvz;->zza:Ljava/lang/String;

    .line 25
    .line 26
    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/zzwb;->zza()I

    .line 27
    .line 28
    .line 29
    move-result v12

    .line 30
    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/zzwb;->zzc()Z

    .line 31
    .line 32
    .line 33
    move-result v21

    .line 34
    const/16 v22, 0x0

    .line 35
    .line 36
    move/from16 v14, v22

    .line 37
    .line 38
    :goto_0
    if-ge v14, v12, :cond_20

    .line 39
    .line 40
    invoke-interface {v2, v14}, Lcom/google/android/gms/internal/ads/zzwb;->zzb(I)Landroid/media/MediaCodecInfo;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    sget v15, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 45
    .line 46
    const/16 v10, 0x1d

    .line 47
    .line 48
    if-lt v15, v10, :cond_0

    .line 49
    .line 50
    invoke-static {v0}, Ld2/n;->x(Landroid/media/MediaCodecInfo;)Z

    .line 51
    .line 52
    .line 53
    move-result v16

    .line 54
    if-eqz v16, :cond_0

    .line 55
    .line 56
    move-object/from16 v26, v3

    .line 57
    .line 58
    move-object v3, v7

    .line 59
    move v1, v12

    .line 60
    move v2, v14

    .line 61
    goto/16 :goto_12

    .line 62
    .line 63
    :cond_0
    move/from16 v16, v12

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :catch_0
    move-exception v0

    .line 67
    goto/16 :goto_14

    .line 68
    .line 69
    :goto_1
    invoke-virtual {v0}, Landroid/media/MediaCodecInfo;->getName()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v12

    .line 73
    invoke-virtual {v0}, Landroid/media/MediaCodecInfo;->isEncoder()Z

    .line 74
    .line 75
    .line 76
    move-result v17
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 77
    if-nez v17, :cond_2

    .line 78
    .line 79
    const-string v10, ".secure"

    .line 80
    .line 81
    if-nez v21, :cond_1

    .line 82
    .line 83
    :try_start_1
    invoke-virtual {v12, v10}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 84
    .line 85
    .line 86
    move-result v18

    .line 87
    if-nez v18, :cond_2

    .line 88
    .line 89
    :cond_1
    move-object/from16 v23, v7

    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_2
    move-object/from16 v26, v3

    .line 93
    .line 94
    move-object v3, v7

    .line 95
    move v2, v14

    .line 96
    move/from16 v1, v16

    .line 97
    .line 98
    goto/16 :goto_12

    .line 99
    .line 100
    :goto_2
    const/16 v7, 0x18

    .line 101
    .line 102
    if-ge v15, v7, :cond_7

    .line 103
    .line 104
    move/from16 v24, v7

    .line 105
    .line 106
    const-string v7, "OMX.SEC.aac.dec"

    .line 107
    .line 108
    invoke-virtual {v7, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v7

    .line 112
    if-nez v7, :cond_4

    .line 113
    .line 114
    const-string v7, "OMX.Exynos.AAC.Decoder"

    .line 115
    .line 116
    invoke-virtual {v7, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result v7

    .line 120
    if-eqz v7, :cond_3

    .line 121
    .line 122
    goto :goto_4

    .line 123
    :cond_3
    :goto_3
    move/from16 v18, v14

    .line 124
    .line 125
    goto :goto_7

    .line 126
    :cond_4
    :goto_4
    const-string v7, "samsung"

    .line 127
    .line 128
    move/from16 v18, v14

    .line 129
    .line 130
    sget-object v14, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 131
    .line 132
    invoke-virtual {v7, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result v7

    .line 136
    if-eqz v7, :cond_8

    .line 137
    .line 138
    sget-object v7, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    .line 139
    .line 140
    const-string v14, "zeroflte"

    .line 141
    .line 142
    invoke-virtual {v7, v14}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 143
    .line 144
    .line 145
    move-result v14

    .line 146
    if-nez v14, :cond_5

    .line 147
    .line 148
    const-string v14, "zerolte"

    .line 149
    .line 150
    invoke-virtual {v7, v14}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 151
    .line 152
    .line 153
    move-result v14

    .line 154
    if-nez v14, :cond_5

    .line 155
    .line 156
    const-string v14, "zenlte"

    .line 157
    .line 158
    invoke-virtual {v7, v14}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 159
    .line 160
    .line 161
    move-result v14

    .line 162
    if-nez v14, :cond_5

    .line 163
    .line 164
    const-string v14, "SC-05G"

    .line 165
    .line 166
    invoke-virtual {v14, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    move-result v14

    .line 170
    if-nez v14, :cond_5

    .line 171
    .line 172
    const-string v14, "marinelteatt"

    .line 173
    .line 174
    invoke-virtual {v14, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    move-result v14

    .line 178
    if-nez v14, :cond_5

    .line 179
    .line 180
    const-string v14, "404SC"

    .line 181
    .line 182
    invoke-virtual {v14, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    move-result v14

    .line 186
    if-nez v14, :cond_5

    .line 187
    .line 188
    const-string v14, "SC-04G"

    .line 189
    .line 190
    invoke-virtual {v14, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    move-result v14

    .line 194
    if-nez v14, :cond_5

    .line 195
    .line 196
    const-string v14, "SCV31"

    .line 197
    .line 198
    invoke-virtual {v14, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    move-result v7

    .line 202
    if-nez v7, :cond_5

    .line 203
    .line 204
    goto :goto_7

    .line 205
    :cond_5
    :goto_5
    move-object/from16 v26, v3

    .line 206
    .line 207
    move/from16 v1, v16

    .line 208
    .line 209
    move/from16 v2, v18

    .line 210
    .line 211
    :cond_6
    :goto_6
    move-object/from16 v3, v23

    .line 212
    .line 213
    goto/16 :goto_12

    .line 214
    .line 215
    :cond_7
    move/from16 v24, v7

    .line 216
    .line 217
    goto :goto_3

    .line 218
    :cond_8
    :goto_7
    const/16 v7, 0x17

    .line 219
    .line 220
    if-ne v15, v7, :cond_9

    .line 221
    .line 222
    const-string v14, "audio/eac3-joc"

    .line 223
    .line 224
    invoke-virtual {v14, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 225
    .line 226
    .line 227
    move-result v14

    .line 228
    if-eqz v14, :cond_9

    .line 229
    .line 230
    const-string v14, "OMX.MTK.AUDIO.DECODER.DSPAC3"

    .line 231
    .line 232
    invoke-virtual {v14, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 233
    .line 234
    .line 235
    move-result v14

    .line 236
    if-nez v14, :cond_5

    .line 237
    .line 238
    :cond_9
    invoke-virtual {v0}, Landroid/media/MediaCodecInfo;->getSupportedTypes()[Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v14

    .line 242
    array-length v15, v14

    .line 243
    move/from16 v7, v22

    .line 244
    .line 245
    :goto_8
    if-ge v7, v15, :cond_b

    .line 246
    .line 247
    move/from16 v19, v7

    .line 248
    .line 249
    aget-object v7, v14, v19

    .line 250
    .line 251
    invoke-virtual {v7, v13}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 252
    .line 253
    .line 254
    move-result v20

    .line 255
    if-eqz v20, :cond_a

    .line 256
    .line 257
    :goto_9
    move-object v14, v7

    .line 258
    goto/16 :goto_b

    .line 259
    .line 260
    :cond_a
    add-int/lit8 v7, v19, 0x1

    .line 261
    .line 262
    goto :goto_8

    .line 263
    :cond_b
    const-string v7, "video/dolby-vision"

    .line 264
    .line 265
    invoke-virtual {v13, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 266
    .line 267
    .line 268
    move-result v7

    .line 269
    if-eqz v7, :cond_f

    .line 270
    .line 271
    const-string v7, "OMX.MS.HEVCDV.Decoder"

    .line 272
    .line 273
    invoke-virtual {v7, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 274
    .line 275
    .line 276
    move-result v7

    .line 277
    if-eqz v7, :cond_c

    .line 278
    .line 279
    const-string v7, "video/hevcdv"

    .line 280
    .line 281
    goto :goto_9

    .line 282
    :cond_c
    const-string v7, "OMX.RTK.video.decoder"

    .line 283
    .line 284
    invoke-virtual {v7, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 285
    .line 286
    .line 287
    move-result v7

    .line 288
    if-nez v7, :cond_e

    .line 289
    .line 290
    const-string v7, "OMX.realtek.video.decoder.tunneled"

    .line 291
    .line 292
    invoke-virtual {v7, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 293
    .line 294
    .line 295
    move-result v7

    .line 296
    if-eqz v7, :cond_d

    .line 297
    .line 298
    goto :goto_a

    .line 299
    :cond_d
    const/4 v14, 0x0

    .line 300
    goto :goto_b

    .line 301
    :cond_e
    :goto_a
    const-string v7, "video/dv_hevc"

    .line 302
    .line 303
    goto :goto_9

    .line 304
    :cond_f
    const-string v7, "video/mv-hevc"

    .line 305
    .line 306
    invoke-virtual {v13, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 307
    .line 308
    .line 309
    move-result v7

    .line 310
    if-eqz v7, :cond_11

    .line 311
    .line 312
    const-string v7, "c2.qti.mvhevc.decoder"

    .line 313
    .line 314
    invoke-virtual {v7, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 315
    .line 316
    .line 317
    move-result v7

    .line 318
    if-nez v7, :cond_10

    .line 319
    .line 320
    const-string v7, "c2.qti.mvhevc.decoder.secure"

    .line 321
    .line 322
    invoke-virtual {v7, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 323
    .line 324
    .line 325
    move-result v7

    .line 326
    if-eqz v7, :cond_d

    .line 327
    .line 328
    :cond_10
    const-string v7, "video/x-mvhevc"

    .line 329
    .line 330
    goto :goto_9

    .line 331
    :cond_11
    const-string v7, "audio/alac"

    .line 332
    .line 333
    invoke-virtual {v13, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 334
    .line 335
    .line 336
    move-result v7

    .line 337
    if-eqz v7, :cond_12

    .line 338
    .line 339
    const-string v7, "OMX.lge.alac.decoder"

    .line 340
    .line 341
    invoke-virtual {v7, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 342
    .line 343
    .line 344
    move-result v7

    .line 345
    if-eqz v7, :cond_12

    .line 346
    .line 347
    const-string v7, "audio/x-lg-alac"

    .line 348
    .line 349
    goto :goto_9

    .line 350
    :cond_12
    const-string v7, "audio/flac"

    .line 351
    .line 352
    invoke-virtual {v13, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 353
    .line 354
    .line 355
    move-result v7

    .line 356
    if-eqz v7, :cond_13

    .line 357
    .line 358
    const-string v7, "OMX.lge.flac.decoder"

    .line 359
    .line 360
    invoke-virtual {v7, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 361
    .line 362
    .line 363
    move-result v7

    .line 364
    if-eqz v7, :cond_13

    .line 365
    .line 366
    const-string v7, "audio/x-lg-flac"

    .line 367
    .line 368
    goto :goto_9

    .line 369
    :cond_13
    const-string v7, "audio/ac3"

    .line 370
    .line 371
    invoke-virtual {v13, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 372
    .line 373
    .line 374
    move-result v7

    .line 375
    if-eqz v7, :cond_d

    .line 376
    .line 377
    const-string v7, "OMX.lge.ac3.decoder"

    .line 378
    .line 379
    invoke-virtual {v7, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 380
    .line 381
    .line 382
    move-result v7

    .line 383
    if-eqz v7, :cond_d

    .line 384
    .line 385
    const-string v7, "audio/lg-ac3"
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 386
    .line 387
    goto/16 :goto_9

    .line 388
    .line 389
    :goto_b
    if-eqz v14, :cond_5

    .line 390
    .line 391
    :try_start_2
    invoke-virtual {v0, v14}, Landroid/media/MediaCodecInfo;->getCapabilitiesForType(Ljava/lang/String;)Landroid/media/MediaCodecInfo$CodecCapabilities;

    .line 392
    .line 393
    .line 394
    move-result-object v15

    .line 395
    invoke-interface {v2, v4, v14, v15}, Lcom/google/android/gms/internal/ads/zzwb;->zzd(Ljava/lang/String;Ljava/lang/String;Landroid/media/MediaCodecInfo$CodecCapabilities;)Z

    .line 396
    .line 397
    .line 398
    move-result v19

    .line 399
    invoke-interface {v2, v4, v14, v15}, Lcom/google/android/gms/internal/ads/zzwb;->zze(Ljava/lang/String;Ljava/lang/String;Landroid/media/MediaCodecInfo$CodecCapabilities;)Z

    .line 400
    .line 401
    .line 402
    move-result v20
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_5

    .line 403
    const/16 v25, 0x1

    .line 404
    .line 405
    :try_start_3
    iget-boolean v7, v1, Lcom/google/android/gms/internal/ads/zzvz;->zzc:Z

    .line 406
    .line 407
    if-nez v7, :cond_14

    .line 408
    .line 409
    if-nez v20, :cond_5

    .line 410
    .line 411
    goto :goto_c

    .line 412
    :cond_14
    if-nez v19, :cond_15

    .line 413
    .line 414
    goto/16 :goto_5

    .line 415
    .line 416
    :cond_15
    :goto_c
    invoke-interface {v2, v3, v14, v15}, Lcom/google/android/gms/internal/ads/zzwb;->zzd(Ljava/lang/String;Ljava/lang/String;Landroid/media/MediaCodecInfo$CodecCapabilities;)Z

    .line 417
    .line 418
    .line 419
    move-result v7

    .line 420
    invoke-interface {v2, v3, v14, v15}, Lcom/google/android/gms/internal/ads/zzwb;->zze(Ljava/lang/String;Ljava/lang/String;Landroid/media/MediaCodecInfo$CodecCapabilities;)Z

    .line 421
    .line 422
    .line 423
    move-result v19

    .line 424
    iget-boolean v2, v1, Lcom/google/android/gms/internal/ads/zzvz;->zzb:Z

    .line 425
    .line 426
    if-nez v2, :cond_16

    .line 427
    .line 428
    if-nez v19, :cond_5

    .line 429
    .line 430
    :cond_16
    if-eqz v2, :cond_17

    .line 431
    .line 432
    if-eqz v7, :cond_5

    .line 433
    .line 434
    move/from16 v7, v25

    .line 435
    .line 436
    :cond_17
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_4

    .line 437
    .line 438
    move-object/from16 v26, v3

    .line 439
    .line 440
    const/16 v3, 0x1d

    .line 441
    .line 442
    if-lt v1, v3, :cond_18

    .line 443
    .line 444
    :try_start_4
    invoke-static {v0}, Ld2/n;->j(Landroid/media/MediaCodecInfo;)Z

    .line 445
    .line 446
    .line 447
    move-result v3

    .line 448
    :goto_d
    const/16 v19, 0x1d

    .line 449
    .line 450
    goto :goto_f

    .line 451
    :catch_1
    move-exception v0

    .line 452
    :goto_e
    move-object v3, v12

    .line 453
    move/from16 v1, v16

    .line 454
    .line 455
    move/from16 v2, v18

    .line 456
    .line 457
    goto/16 :goto_11

    .line 458
    .line 459
    :cond_18
    invoke-static {v0, v13}, Lcom/google/android/gms/internal/ads/zzwi;->zzi(Landroid/media/MediaCodecInfo;Ljava/lang/String;)Z

    .line 460
    .line 461
    .line 462
    move-result v3

    .line 463
    if-nez v3, :cond_19

    .line 464
    .line 465
    move/from16 v3, v25

    .line 466
    .line 467
    goto :goto_d

    .line 468
    :cond_19
    move/from16 v3, v22

    .line 469
    .line 470
    goto :goto_d

    .line 471
    :goto_f
    invoke-static {v0, v13}, Lcom/google/android/gms/internal/ads/zzwi;->zzi(Landroid/media/MediaCodecInfo;Ljava/lang/String;)Z

    .line 472
    .line 473
    .line 474
    move-result v17

    .line 475
    move-object/from16 v20, v0

    .line 476
    .line 477
    move/from16 v0, v19

    .line 478
    .line 479
    if-lt v1, v0, :cond_1a

    .line 480
    .line 481
    invoke-static/range {v20 .. v20}, Ld2/n;->v(Landroid/media/MediaCodecInfo;)Z

    .line 482
    .line 483
    .line 484
    move-result v0

    .line 485
    goto :goto_10

    .line 486
    :cond_1a
    invoke-virtual/range {v20 .. v20}, Landroid/media/MediaCodecInfo;->getName()Ljava/lang/String;

    .line 487
    .line 488
    .line 489
    move-result-object v0

    .line 490
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzgsz;->zza(Ljava/lang/String;)Ljava/lang/String;

    .line 491
    .line 492
    .line 493
    move-result-object v0

    .line 494
    const-string v1, "omx.google."

    .line 495
    .line 496
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 497
    .line 498
    .line 499
    move-result v1

    .line 500
    if-nez v1, :cond_1b

    .line 501
    .line 502
    const-string v1, "c2.android."

    .line 503
    .line 504
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 505
    .line 506
    .line 507
    move-result v1

    .line 508
    if-nez v1, :cond_1b

    .line 509
    .line 510
    const-string v1, "c2.google."

    .line 511
    .line 512
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 513
    .line 514
    .line 515
    move-result v0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    .line 516
    if-nez v0, :cond_1b

    .line 517
    .line 518
    move/from16 v0, v25

    .line 519
    .line 520
    goto :goto_10

    .line 521
    :cond_1b
    move/from16 v0, v22

    .line 522
    .line 523
    :goto_10
    if-eqz v21, :cond_1c

    .line 524
    .line 525
    if-eq v2, v7, :cond_1d

    .line 526
    .line 527
    :cond_1c
    if-nez v21, :cond_1e

    .line 528
    .line 529
    if-nez v2, :cond_1e

    .line 530
    .line 531
    :cond_1d
    const/16 v19, 0x0

    .line 532
    .line 533
    const/16 v20, 0x0

    .line 534
    .line 535
    move/from16 v1, v16

    .line 536
    .line 537
    move/from16 v2, v18

    .line 538
    .line 539
    move/from16 v18, v0

    .line 540
    .line 541
    move/from16 v16, v3

    .line 542
    .line 543
    :try_start_5
    invoke-static/range {v12 .. v20}, Lcom/google/android/gms/internal/ads/zzvp;->zza(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/media/MediaCodecInfo$CodecCapabilities;ZZZZZ)Lcom/google/android/gms/internal/ads/zzvp;

    .line 544
    .line 545
    .line 546
    move-result-object v0
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3

    .line 547
    move-object v3, v12

    .line 548
    :try_start_6
    invoke-virtual {v11, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 549
    .line 550
    .line 551
    goto/16 :goto_6

    .line 552
    .line 553
    :catch_2
    move-exception v0

    .line 554
    goto :goto_11

    .line 555
    :catch_3
    move-exception v0

    .line 556
    move-object v3, v12

    .line 557
    goto :goto_11

    .line 558
    :cond_1e
    move/from16 v1, v16

    .line 559
    .line 560
    move/from16 v2, v18

    .line 561
    .line 562
    move/from16 v18, v0

    .line 563
    .line 564
    move/from16 v16, v3

    .line 565
    .line 566
    move-object v3, v12

    .line 567
    if-nez v21, :cond_6

    .line 568
    .line 569
    if-eqz v7, :cond_6

    .line 570
    .line 571
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 572
    .line 573
    .line 574
    move-result-object v0

    .line 575
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 576
    .line 577
    .line 578
    move-result v0

    .line 579
    add-int/lit8 v0, v0, 0x7

    .line 580
    .line 581
    new-instance v7, Ljava/lang/StringBuilder;

    .line 582
    .line 583
    invoke-direct {v7, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 584
    .line 585
    .line 586
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 587
    .line 588
    .line 589
    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 590
    .line 591
    .line 592
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 593
    .line 594
    .line 595
    move-result-object v12

    .line 596
    const/16 v19, 0x0

    .line 597
    .line 598
    const/16 v20, 0x1

    .line 599
    .line 600
    invoke-static/range {v12 .. v20}, Lcom/google/android/gms/internal/ads/zzvp;->zza(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/media/MediaCodecInfo$CodecCapabilities;ZZZZZ)Lcom/google/android/gms/internal/ads/zzvp;

    .line 601
    .line 602
    .line 603
    move-result-object v0

    .line 604
    invoke-virtual {v11, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2

    .line 605
    .line 606
    .line 607
    goto/16 :goto_13

    .line 608
    .line 609
    :catch_4
    move-exception v0

    .line 610
    move-object/from16 v26, v3

    .line 611
    .line 612
    goto/16 :goto_e

    .line 613
    .line 614
    :catch_5
    move-exception v0

    .line 615
    move-object/from16 v26, v3

    .line 616
    .line 617
    move-object v3, v12

    .line 618
    move/from16 v1, v16

    .line 619
    .line 620
    move/from16 v2, v18

    .line 621
    .line 622
    const/16 v25, 0x1

    .line 623
    .line 624
    :goto_11
    :try_start_7
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0

    .line 625
    .line 626
    const-string v10, "MediaCodecUtil"

    .line 627
    .line 628
    const/16 v12, 0x17

    .line 629
    .line 630
    if-ne v7, v12, :cond_1f

    .line 631
    .line 632
    :try_start_8
    invoke-virtual {v11}, Ljava/util/ArrayList;->isEmpty()Z

    .line 633
    .line 634
    .line 635
    move-result v7

    .line 636
    if-nez v7, :cond_1f

    .line 637
    .line 638
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 639
    .line 640
    .line 641
    move-result-object v0

    .line 642
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 643
    .line 644
    .line 645
    move-result v0

    .line 646
    add-int/lit8 v0, v0, 0x2e

    .line 647
    .line 648
    new-instance v7, Ljava/lang/StringBuilder;

    .line 649
    .line 650
    invoke-direct {v7, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 651
    .line 652
    .line 653
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 654
    .line 655
    .line 656
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 657
    .line 658
    .line 659
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 660
    .line 661
    .line 662
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 663
    .line 664
    .line 665
    move-result-object v0

    .line 666
    invoke-static {v10, v0}, Lcom/google/android/gms/internal/ads/zzeh;->zze(Ljava/lang/String;Ljava/lang/String;)V

    .line 667
    .line 668
    .line 669
    goto/16 :goto_6

    .line 670
    .line 671
    :cond_1f
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 672
    .line 673
    .line 674
    move-result-object v1

    .line 675
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 676
    .line 677
    .line 678
    move-result v1

    .line 679
    add-int/lit8 v1, v1, 0x18

    .line 680
    .line 681
    invoke-virtual {v14}, Ljava/lang/String;->length()I

    .line 682
    .line 683
    .line 684
    move-result v2

    .line 685
    add-int/2addr v1, v2

    .line 686
    add-int/lit8 v1, v1, 0x1

    .line 687
    .line 688
    new-instance v2, Ljava/lang/StringBuilder;

    .line 689
    .line 690
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 691
    .line 692
    .line 693
    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 694
    .line 695
    .line 696
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 697
    .line 698
    .line 699
    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 700
    .line 701
    .line 702
    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 703
    .line 704
    .line 705
    move-object/from16 v3, v23

    .line 706
    .line 707
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 708
    .line 709
    .line 710
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 711
    .line 712
    .line 713
    move-result-object v1

    .line 714
    invoke-static {v10, v1}, Lcom/google/android/gms/internal/ads/zzeh;->zze(Ljava/lang/String;Ljava/lang/String;)V

    .line 715
    .line 716
    .line 717
    throw v0
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_0

    .line 718
    :goto_12
    add-int/lit8 v14, v2, 0x1

    .line 719
    .line 720
    move-object/from16 v2, p1

    .line 721
    .line 722
    move v12, v1

    .line 723
    move-object v7, v3

    .line 724
    move-object/from16 v3, v26

    .line 725
    .line 726
    move-object/from16 v1, p0

    .line 727
    .line 728
    goto/16 :goto_0

    .line 729
    .line 730
    :cond_20
    :goto_13
    return-object v11

    .line 731
    :goto_14
    new-instance v1, Lcom/google/android/gms/internal/ads/zzwa;

    .line 732
    .line 733
    const/4 v2, 0x0

    .line 734
    invoke-direct {v1, v0, v2}, Lcom/google/android/gms/internal/ads/zzwa;-><init>(Ljava/lang/Throwable;[B)V

    .line 735
    .line 736
    .line 737
    throw v1
.end method

.method private static zzi(Landroid/media/MediaCodecInfo;Ljava/lang/String;)Z
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    invoke-static {p0}, Ld2/n;->h(Landroid/media/MediaCodecInfo;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0

    .line 12
    :cond_0
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzas;->zza(Ljava/lang/String;)Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-eqz p1, :cond_1

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_1
    invoke-virtual {p0}, Landroid/media/MediaCodecInfo;->getName()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/zzgsz;->zza(Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    const-string p1, "arc."

    .line 28
    .line 29
    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-eqz p1, :cond_2

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    const-string p1, "omx.google."

    .line 37
    .line 38
    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    if-nez p1, :cond_5

    .line 43
    .line 44
    const-string p1, "omx.ffmpeg."

    .line 45
    .line 46
    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-nez p1, :cond_5

    .line 51
    .line 52
    const-string p1, "omx.sec."

    .line 53
    .line 54
    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    if-eqz p1, :cond_3

    .line 59
    .line 60
    const-string p1, ".sw."

    .line 61
    .line 62
    invoke-virtual {p0, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    if-nez p1, :cond_5

    .line 67
    .line 68
    :cond_3
    const-string p1, "omx.qcom.video.decoder.hevcswvdec"

    .line 69
    .line 70
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    if-nez p1, :cond_5

    .line 75
    .line 76
    const-string p1, "c2.android."

    .line 77
    .line 78
    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    if-nez p1, :cond_5

    .line 83
    .line 84
    const-string p1, "c2.google."

    .line 85
    .line 86
    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    if-nez p1, :cond_5

    .line 91
    .line 92
    const-string p1, "omx."

    .line 93
    .line 94
    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 95
    .line 96
    .line 97
    move-result p1

    .line 98
    if-nez p1, :cond_4

    .line 99
    .line 100
    const-string p1, "c2."

    .line 101
    .line 102
    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 103
    .line 104
    .line 105
    move-result p0

    .line 106
    if-nez p0, :cond_4

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_4
    :goto_0
    const/4 p0, 0x0

    .line 110
    return p0

    .line 111
    :cond_5
    :goto_1
    const/4 p0, 0x1

    .line 112
    return p0
.end method

.method private static zzj(Ljava/util/List;Lcom/google/android/gms/internal/ads/zzwh;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzwf;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/ads/zzwf;-><init>(Lcom/google/android/gms/internal/ads/zzwh;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method
