.class public final Lcom/google/android/gms/internal/ads/zzaqz;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzaga;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzfj;

.field private final zzb:Landroid/util/SparseArray;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzeu;

.field private final zzd:Lcom/google/android/gms/internal/ads/zzaqw;

.field private zze:Z

.field private zzf:Z

.field private zzg:Z

.field private zzh:J

.field private zzi:Lcom/google/android/gms/internal/ads/zzaqv;

.field private zzj:Lcom/google/android/gms/internal/ads/zzagd;

.field private zzk:Z


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzfj;

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzfj;-><init>(J)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzaqz;->zza:Lcom/google/android/gms/internal/ads/zzfj;

    .line 12
    .line 13
    new-instance v0, Lcom/google/android/gms/internal/ads/zzeu;

    .line 14
    .line 15
    const/16 v1, 0x1000

    .line 16
    .line 17
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzeu;-><init>(I)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzaqz;->zzc:Lcom/google/android/gms/internal/ads/zzeu;

    .line 21
    .line 22
    new-instance v0, Landroid/util/SparseArray;

    .line 23
    .line 24
    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzaqz;->zzb:Landroid/util/SparseArray;

    .line 28
    .line 29
    new-instance v0, Lcom/google/android/gms/internal/ads/zzaqw;

    .line 30
    .line 31
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzaqw;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzaqz;->zzd:Lcom/google/android/gms/internal/ads/zzaqw;

    .line 35
    .line 36
    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/ads/zzagb;)Z
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/16 v0, 0xe

    .line 2
    .line 3
    new-array v1, v0, [B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-interface {p1, v1, v2, v0}, Lcom/google/android/gms/internal/ads/zzagb;->zzi([BII)V

    .line 7
    .line 8
    .line 9
    aget-byte v0, v1, v2

    .line 10
    .line 11
    and-int/lit16 v0, v0, 0xff

    .line 12
    .line 13
    const/4 v3, 0x1

    .line 14
    aget-byte v4, v1, v3

    .line 15
    .line 16
    and-int/lit16 v4, v4, 0xff

    .line 17
    .line 18
    const/4 v5, 0x2

    .line 19
    aget-byte v6, v1, v5

    .line 20
    .line 21
    and-int/lit16 v6, v6, 0xff

    .line 22
    .line 23
    const/4 v7, 0x3

    .line 24
    aget-byte v8, v1, v7

    .line 25
    .line 26
    and-int/lit16 v8, v8, 0xff

    .line 27
    .line 28
    shl-int/lit8 v0, v0, 0x18

    .line 29
    .line 30
    shl-int/lit8 v4, v4, 0x10

    .line 31
    .line 32
    or-int/2addr v0, v4

    .line 33
    const/16 v4, 0x8

    .line 34
    .line 35
    shl-int/2addr v6, v4

    .line 36
    or-int/2addr v0, v6

    .line 37
    or-int/2addr v0, v8

    .line 38
    const/16 v6, 0x1ba

    .line 39
    .line 40
    if-eq v0, v6, :cond_0

    .line 41
    .line 42
    return v2

    .line 43
    :cond_0
    const/4 v0, 0x4

    .line 44
    aget-byte v6, v1, v0

    .line 45
    .line 46
    and-int/lit16 v6, v6, 0xc4

    .line 47
    .line 48
    const/16 v8, 0x44

    .line 49
    .line 50
    if-eq v6, v8, :cond_1

    .line 51
    .line 52
    return v2

    .line 53
    :cond_1
    const/4 v6, 0x6

    .line 54
    aget-byte v6, v1, v6

    .line 55
    .line 56
    and-int/2addr v6, v0

    .line 57
    if-eq v6, v0, :cond_2

    .line 58
    .line 59
    return v2

    .line 60
    :cond_2
    aget-byte v6, v1, v4

    .line 61
    .line 62
    and-int/2addr v6, v0

    .line 63
    if-eq v6, v0, :cond_3

    .line 64
    .line 65
    return v2

    .line 66
    :cond_3
    const/16 v0, 0x9

    .line 67
    .line 68
    aget-byte v0, v1, v0

    .line 69
    .line 70
    and-int/2addr v0, v3

    .line 71
    if-eq v0, v3, :cond_4

    .line 72
    .line 73
    return v2

    .line 74
    :cond_4
    const/16 v0, 0xc

    .line 75
    .line 76
    aget-byte v0, v1, v0

    .line 77
    .line 78
    and-int/2addr v0, v7

    .line 79
    if-eq v0, v7, :cond_5

    .line 80
    .line 81
    return v2

    .line 82
    :cond_5
    const/16 v0, 0xd

    .line 83
    .line 84
    aget-byte v0, v1, v0

    .line 85
    .line 86
    and-int/lit8 v0, v0, 0x7

    .line 87
    .line 88
    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/ads/zzagb;->zzk(I)V

    .line 89
    .line 90
    .line 91
    invoke-interface {p1, v1, v2, v7}, Lcom/google/android/gms/internal/ads/zzagb;->zzi([BII)V

    .line 92
    .line 93
    .line 94
    aget-byte p1, v1, v2

    .line 95
    .line 96
    and-int/lit16 p1, p1, 0xff

    .line 97
    .line 98
    shl-int/lit8 p1, p1, 0x10

    .line 99
    .line 100
    aget-byte v0, v1, v3

    .line 101
    .line 102
    and-int/lit16 v0, v0, 0xff

    .line 103
    .line 104
    shl-int/2addr v0, v4

    .line 105
    aget-byte v1, v1, v5

    .line 106
    .line 107
    and-int/lit16 v1, v1, 0xff

    .line 108
    .line 109
    or-int/2addr p1, v0

    .line 110
    or-int/2addr p1, v1

    .line 111
    if-ne p1, v3, :cond_6

    .line 112
    .line 113
    return v3

    .line 114
    :cond_6
    return v2
.end method

.method public final synthetic zzb()Ljava/util/List;
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/f;->a(Lcom/google/android/gms/internal/ads/zzaga;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final zzc(Lcom/google/android/gms/internal/ads/zzagd;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaqz;->zzj:Lcom/google/android/gms/internal/ads/zzagd;

    return-void
.end method

.method public final zzd(Lcom/google/android/gms/internal/ads/zzagb;Lcom/google/android/gms/internal/ads/zzaha;)I
    .locals 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaqz;->zzj:Lcom/google/android/gms/internal/ads/zzagd;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzagb;->zzo()J

    .line 7
    .line 8
    .line 9
    move-result-wide v5

    .line 10
    const-wide/16 v7, -0x1

    .line 11
    .line 12
    cmp-long v9, v5, v7

    .line 13
    .line 14
    if-eqz v9, :cond_0

    .line 15
    .line 16
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzaqz;->zzd:Lcom/google/android/gms/internal/ads/zzaqw;

    .line 17
    .line 18
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzaqw;->zza()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-nez v2, :cond_0

    .line 23
    .line 24
    invoke-virtual {v1, p1, p2}, Lcom/google/android/gms/internal/ads/zzaqw;->zzc(Lcom/google/android/gms/internal/ads/zzagb;Lcom/google/android/gms/internal/ads/zzaha;)I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    return p1

    .line 29
    :cond_0
    iget-boolean v1, p0, Lcom/google/android/gms/internal/ads/zzaqz;->zzk:Z

    .line 30
    .line 31
    const/4 v10, 0x1

    .line 32
    if-nez v1, :cond_2

    .line 33
    .line 34
    iput-boolean v10, p0, Lcom/google/android/gms/internal/ads/zzaqz;->zzk:Z

    .line 35
    .line 36
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzaqz;->zzd:Lcom/google/android/gms/internal/ads/zzaqw;

    .line 37
    .line 38
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzaqw;->zzd()J

    .line 39
    .line 40
    .line 41
    move-result-wide v2

    .line 42
    const-wide v11, -0x7fffffffffffffffL    # -4.9E-324

    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    cmp-long v2, v2, v11

    .line 48
    .line 49
    if-eqz v2, :cond_1

    .line 50
    .line 51
    move-object v2, v1

    .line 52
    new-instance v1, Lcom/google/android/gms/internal/ads/zzaqv;

    .line 53
    .line 54
    move-object v3, v2

    .line 55
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzaqw;->zzb()Lcom/google/android/gms/internal/ads/zzfj;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzaqw;->zzd()J

    .line 60
    .line 61
    .line 62
    move-result-wide v3

    .line 63
    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/ads/zzaqv;-><init>(Lcom/google/android/gms/internal/ads/zzfj;JJ)V

    .line 64
    .line 65
    .line 66
    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzaqz;->zzi:Lcom/google/android/gms/internal/ads/zzaqv;

    .line 67
    .line 68
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaqz;->zzj:Lcom/google/android/gms/internal/ads/zzagd;

    .line 69
    .line 70
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzafm;->zza()Lcom/google/android/gms/internal/ads/zzahd;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/zzagd;->zzw(Lcom/google/android/gms/internal/ads/zzahd;)V

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_1
    move-object v3, v1

    .line 79
    new-instance v1, Lcom/google/android/gms/internal/ads/zzahc;

    .line 80
    .line 81
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzaqw;->zzd()J

    .line 82
    .line 83
    .line 84
    move-result-wide v2

    .line 85
    const-wide/16 v11, 0x0

    .line 86
    .line 87
    invoke-direct {v1, v2, v3, v11, v12}, Lcom/google/android/gms/internal/ads/zzahc;-><init>(JJ)V

    .line 88
    .line 89
    .line 90
    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/zzagd;->zzw(Lcom/google/android/gms/internal/ads/zzahd;)V

    .line 91
    .line 92
    .line 93
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaqz;->zzi:Lcom/google/android/gms/internal/ads/zzaqv;

    .line 94
    .line 95
    if-eqz v0, :cond_3

    .line 96
    .line 97
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzafm;->zzc()Z

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    if-eqz v1, :cond_3

    .line 102
    .line 103
    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/zzafm;->zzd(Lcom/google/android/gms/internal/ads/zzagb;Lcom/google/android/gms/internal/ads/zzaha;)I

    .line 104
    .line 105
    .line 106
    move-result p1

    .line 107
    return p1

    .line 108
    :cond_3
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzagb;->zzl()V

    .line 109
    .line 110
    .line 111
    if-eqz v9, :cond_4

    .line 112
    .line 113
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzagb;->zzm()J

    .line 114
    .line 115
    .line 116
    move-result-wide v0

    .line 117
    sub-long/2addr v5, v0

    .line 118
    goto :goto_1

    .line 119
    :cond_4
    move-wide v5, v7

    .line 120
    :goto_1
    cmp-long p2, v5, v7

    .line 121
    .line 122
    const/4 v0, -0x1

    .line 123
    if-eqz p2, :cond_6

    .line 124
    .line 125
    const-wide/16 v1, 0x4

    .line 126
    .line 127
    cmp-long p2, v5, v1

    .line 128
    .line 129
    if-ltz p2, :cond_5

    .line 130
    .line 131
    goto :goto_2

    .line 132
    :cond_5
    return v0

    .line 133
    :cond_6
    :goto_2
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzaqz;->zzc:Lcom/google/android/gms/internal/ads/zzeu;

    .line 134
    .line 135
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    const/4 v2, 0x4

    .line 140
    const/4 v3, 0x0

    .line 141
    invoke-interface {p1, v1, v3, v2, v10}, Lcom/google/android/gms/internal/ads/zzagb;->zzh([BIIZ)Z

    .line 142
    .line 143
    .line 144
    move-result v1

    .line 145
    if-nez v1, :cond_7

    .line 146
    .line 147
    return v0

    .line 148
    :cond_7
    invoke-virtual {p2, v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzeu;->zzB()I

    .line 152
    .line 153
    .line 154
    move-result v1

    .line 155
    const/16 v2, 0x1b9

    .line 156
    .line 157
    if-ne v1, v2, :cond_8

    .line 158
    .line 159
    return v0

    .line 160
    :cond_8
    const/16 v0, 0x1ba

    .line 161
    .line 162
    if-ne v1, v0, :cond_9

    .line 163
    .line 164
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    const/16 v1, 0xa

    .line 169
    .line 170
    invoke-interface {p1, v0, v3, v1}, Lcom/google/android/gms/internal/ads/zzagb;->zzi([BII)V

    .line 171
    .line 172
    .line 173
    const/16 v0, 0x9

    .line 174
    .line 175
    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzeu;->zzs()I

    .line 179
    .line 180
    .line 181
    move-result p2

    .line 182
    and-int/lit8 p2, p2, 0x7

    .line 183
    .line 184
    add-int/lit8 p2, p2, 0xe

    .line 185
    .line 186
    invoke-interface {p1, p2}, Lcom/google/android/gms/internal/ads/zzagb;->zzf(I)V

    .line 187
    .line 188
    .line 189
    return v3

    .line 190
    :cond_9
    const/16 v0, 0x1bb

    .line 191
    .line 192
    const/4 v2, 0x2

    .line 193
    const/4 v4, 0x6

    .line 194
    if-ne v1, v0, :cond_a

    .line 195
    .line 196
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    invoke-interface {p1, v0, v3, v2}, Lcom/google/android/gms/internal/ads/zzagb;->zzi([BII)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {p2, v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzeu;->zzt()I

    .line 207
    .line 208
    .line 209
    move-result p2

    .line 210
    add-int/2addr p2, v4

    .line 211
    invoke-interface {p1, p2}, Lcom/google/android/gms/internal/ads/zzagb;->zzf(I)V

    .line 212
    .line 213
    .line 214
    return v3

    .line 215
    :cond_a
    shr-int/lit8 v0, v1, 0x8

    .line 216
    .line 217
    if-eq v0, v10, :cond_b

    .line 218
    .line 219
    invoke-interface {p1, v10}, Lcom/google/android/gms/internal/ads/zzagb;->zzf(I)V

    .line 220
    .line 221
    .line 222
    return v3

    .line 223
    :cond_b
    and-int/lit16 v0, v1, 0xff

    .line 224
    .line 225
    iget-object v5, p0, Lcom/google/android/gms/internal/ads/zzaqz;->zzb:Landroid/util/SparseArray;

    .line 226
    .line 227
    invoke-virtual {v5, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v6

    .line 231
    check-cast v6, Lcom/google/android/gms/internal/ads/zzaqx;

    .line 232
    .line 233
    iget-boolean v7, p0, Lcom/google/android/gms/internal/ads/zzaqz;->zze:Z

    .line 234
    .line 235
    if-nez v7, :cond_11

    .line 236
    .line 237
    if-nez v6, :cond_f

    .line 238
    .line 239
    const/16 v7, 0xbd

    .line 240
    .line 241
    const-string v8, "video/mp2p"

    .line 242
    .line 243
    const/4 v9, 0x0

    .line 244
    if-ne v0, v7, :cond_c

    .line 245
    .line 246
    new-instance v1, Lcom/google/android/gms/internal/ads/zzapq;

    .line 247
    .line 248
    invoke-direct {v1, v9, v3, v8}, Lcom/google/android/gms/internal/ads/zzapq;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 249
    .line 250
    .line 251
    iput-boolean v10, p0, Lcom/google/android/gms/internal/ads/zzaqz;->zzf:Z

    .line 252
    .line 253
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzagb;->zzn()J

    .line 254
    .line 255
    .line 256
    move-result-wide v7

    .line 257
    iput-wide v7, p0, Lcom/google/android/gms/internal/ads/zzaqz;->zzh:J

    .line 258
    .line 259
    :goto_3
    move-object v9, v1

    .line 260
    goto :goto_4

    .line 261
    :cond_c
    and-int/lit16 v7, v1, 0xe0

    .line 262
    .line 263
    const/16 v11, 0xc0

    .line 264
    .line 265
    if-ne v7, v11, :cond_d

    .line 266
    .line 267
    new-instance v1, Lcom/google/android/gms/internal/ads/zzaqm;

    .line 268
    .line 269
    invoke-direct {v1, v9, v3, v8}, Lcom/google/android/gms/internal/ads/zzaqm;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 270
    .line 271
    .line 272
    iput-boolean v10, p0, Lcom/google/android/gms/internal/ads/zzaqz;->zzf:Z

    .line 273
    .line 274
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzagb;->zzn()J

    .line 275
    .line 276
    .line 277
    move-result-wide v7

    .line 278
    iput-wide v7, p0, Lcom/google/android/gms/internal/ads/zzaqz;->zzh:J

    .line 279
    .line 280
    goto :goto_3

    .line 281
    :cond_d
    and-int/lit16 v1, v1, 0xf0

    .line 282
    .line 283
    const/16 v7, 0xe0

    .line 284
    .line 285
    if-ne v1, v7, :cond_e

    .line 286
    .line 287
    new-instance v1, Lcom/google/android/gms/internal/ads/zzaqc;

    .line 288
    .line 289
    invoke-direct {v1, v9, v8}, Lcom/google/android/gms/internal/ads/zzaqc;-><init>(Lcom/google/android/gms/internal/ads/zzars;Ljava/lang/String;)V

    .line 290
    .line 291
    .line 292
    iput-boolean v10, p0, Lcom/google/android/gms/internal/ads/zzaqz;->zzg:Z

    .line 293
    .line 294
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzagb;->zzn()J

    .line 295
    .line 296
    .line 297
    move-result-wide v7

    .line 298
    iput-wide v7, p0, Lcom/google/android/gms/internal/ads/zzaqz;->zzh:J

    .line 299
    .line 300
    goto :goto_3

    .line 301
    :cond_e
    :goto_4
    if-eqz v9, :cond_f

    .line 302
    .line 303
    new-instance v1, Lcom/google/android/gms/internal/ads/zzaro;

    .line 304
    .line 305
    const/high16 v6, -0x80000000

    .line 306
    .line 307
    const/16 v7, 0x100

    .line 308
    .line 309
    invoke-direct {v1, v6, v0, v7}, Lcom/google/android/gms/internal/ads/zzaro;-><init>(III)V

    .line 310
    .line 311
    .line 312
    iget-object v6, p0, Lcom/google/android/gms/internal/ads/zzaqz;->zzj:Lcom/google/android/gms/internal/ads/zzagd;

    .line 313
    .line 314
    invoke-interface {v9, v6, v1}, Lcom/google/android/gms/internal/ads/zzaqa;->zzb(Lcom/google/android/gms/internal/ads/zzagd;Lcom/google/android/gms/internal/ads/zzaro;)V

    .line 315
    .line 316
    .line 317
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzaqz;->zza:Lcom/google/android/gms/internal/ads/zzfj;

    .line 318
    .line 319
    new-instance v6, Lcom/google/android/gms/internal/ads/zzaqx;

    .line 320
    .line 321
    invoke-direct {v6, v9, v1}, Lcom/google/android/gms/internal/ads/zzaqx;-><init>(Lcom/google/android/gms/internal/ads/zzaqa;Lcom/google/android/gms/internal/ads/zzfj;)V

    .line 322
    .line 323
    .line 324
    invoke-virtual {v5, v0, v6}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 325
    .line 326
    .line 327
    :cond_f
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzaqz;->zzf:Z

    .line 328
    .line 329
    const-wide/32 v7, 0x100000

    .line 330
    .line 331
    .line 332
    if-eqz v0, :cond_10

    .line 333
    .line 334
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzaqz;->zzg:Z

    .line 335
    .line 336
    if-eqz v0, :cond_10

    .line 337
    .line 338
    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzaqz;->zzh:J

    .line 339
    .line 340
    const-wide/16 v7, 0x2000

    .line 341
    .line 342
    add-long/2addr v7, v0

    .line 343
    :cond_10
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzagb;->zzn()J

    .line 344
    .line 345
    .line 346
    move-result-wide v0

    .line 347
    cmp-long v0, v0, v7

    .line 348
    .line 349
    if-lez v0, :cond_11

    .line 350
    .line 351
    iput-boolean v10, p0, Lcom/google/android/gms/internal/ads/zzaqz;->zze:Z

    .line 352
    .line 353
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaqz;->zzj:Lcom/google/android/gms/internal/ads/zzagd;

    .line 354
    .line 355
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzagd;->zzv()V

    .line 356
    .line 357
    .line 358
    :cond_11
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 359
    .line 360
    .line 361
    move-result-object v0

    .line 362
    invoke-interface {p1, v0, v3, v2}, Lcom/google/android/gms/internal/ads/zzagb;->zzi([BII)V

    .line 363
    .line 364
    .line 365
    invoke-virtual {p2, v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 366
    .line 367
    .line 368
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzeu;->zzt()I

    .line 369
    .line 370
    .line 371
    move-result v0

    .line 372
    add-int/2addr v0, v4

    .line 373
    if-nez v6, :cond_12

    .line 374
    .line 375
    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/ads/zzagb;->zzf(I)V

    .line 376
    .line 377
    .line 378
    goto :goto_5

    .line 379
    :cond_12
    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/ads/zzeu;->zza(I)V

    .line 380
    .line 381
    .line 382
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 383
    .line 384
    .line 385
    move-result-object v1

    .line 386
    invoke-interface {p1, v1, v3, v0}, Lcom/google/android/gms/internal/ads/zzagb;->zzc([BII)V

    .line 387
    .line 388
    .line 389
    invoke-virtual {p2, v4}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 390
    .line 391
    .line 392
    invoke-virtual {v6, p2}, Lcom/google/android/gms/internal/ads/zzaqx;->zzb(Lcom/google/android/gms/internal/ads/zzeu;)V

    .line 393
    .line 394
    .line 395
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzeu;->zzj()I

    .line 396
    .line 397
    .line 398
    move-result p1

    .line 399
    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/zzeu;->zzf(I)V

    .line 400
    .line 401
    .line 402
    :goto_5
    return v3
.end method

.method public final zze(JJ)V
    .locals 4

    .line 1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzaqz;->zza:Lcom/google/android/gms/internal/ads/zzfj;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzfj;->zzc()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    cmp-long p2, v0, v2

    .line 13
    .line 14
    if-eqz p2, :cond_0

    .line 15
    .line 16
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzfj;->zza()J

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    cmp-long p2, v0, v2

    .line 21
    .line 22
    if-eqz p2, :cond_1

    .line 23
    .line 24
    const-wide/16 v2, 0x0

    .line 25
    .line 26
    cmp-long p2, v0, v2

    .line 27
    .line 28
    if-eqz p2, :cond_1

    .line 29
    .line 30
    cmp-long p2, v0, p3

    .line 31
    .line 32
    if-eqz p2, :cond_1

    .line 33
    .line 34
    :cond_0
    invoke-virtual {p1, p3, p4}, Lcom/google/android/gms/internal/ads/zzfj;->zzd(J)V

    .line 35
    .line 36
    .line 37
    :cond_1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzaqz;->zzi:Lcom/google/android/gms/internal/ads/zzaqv;

    .line 38
    .line 39
    const/4 p2, 0x0

    .line 40
    if-eqz p1, :cond_2

    .line 41
    .line 42
    invoke-virtual {p1, p3, p4}, Lcom/google/android/gms/internal/ads/zzafm;->zzb(J)V

    .line 43
    .line 44
    .line 45
    :cond_2
    :goto_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzaqz;->zzb:Landroid/util/SparseArray;

    .line 46
    .line 47
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    .line 48
    .line 49
    .line 50
    move-result p3

    .line 51
    if-ge p2, p3, :cond_3

    .line 52
    .line 53
    invoke-virtual {p1, p2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    check-cast p1, Lcom/google/android/gms/internal/ads/zzaqx;

    .line 58
    .line 59
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzaqx;->zza()V

    .line 60
    .line 61
    .line 62
    add-int/lit8 p2, p2, 0x1

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_3
    return-void
.end method

.method public final zzf()V
    .locals 0

    return-void
.end method

.method public final synthetic zzg()Lcom/google/android/gms/internal/ads/zzaga;
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/f;->b(Lcom/google/android/gms/internal/ads/zzaga;)Lcom/google/android/gms/internal/ads/zzaga;

    move-result-object v0

    return-object v0
.end method
