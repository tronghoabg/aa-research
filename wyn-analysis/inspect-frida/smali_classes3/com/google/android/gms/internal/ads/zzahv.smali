.class public final Lcom/google/android/gms/internal/ads/zzahv;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzaga;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzeu;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzahu;

.field private final zzc:Z

.field private final zzd:Lcom/google/android/gms/internal/ads/zzanq;

.field private zze:I

.field private zzf:Lcom/google/android/gms/internal/ads/zzagd;

.field private zzg:Lcom/google/android/gms/internal/ads/zzahw;

.field private zzh:J

.field private zzi:[Lcom/google/android/gms/internal/ads/zzahy;

.field private zzj:J

.field private zzk:Lcom/google/android/gms/internal/ads/zzahy;

.field private zzl:I

.field private zzm:J

.field private zzn:J

.field private zzo:I

.field private zzp:Z


# direct methods
.method public constructor <init>()V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x1

    .line 1
    sget-object v1, Lcom/google/android/gms/internal/ads/zzanq;->zza:Lcom/google/android/gms/internal/ads/zzanq;

    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/internal/ads/zzahv;-><init>(ILcom/google/android/gms/internal/ads/zzanq;)V

    return-void
.end method

.method public constructor <init>(ILcom/google/android/gms/internal/ads/zzanq;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzahv;->zzd:Lcom/google/android/gms/internal/ads/zzanq;

    const/4 p2, 0x1

    xor-int/2addr p1, p2

    const/4 v0, 0x0

    if-eq p2, p1, :cond_0

    move p2, v0

    :cond_0
    iput-boolean p2, p0, Lcom/google/android/gms/internal/ads/zzahv;->zzc:Z

    new-instance p1, Lcom/google/android/gms/internal/ads/zzeu;

    const/16 p2, 0xc

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/ads/zzeu;-><init>(I)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzahv;->zza:Lcom/google/android/gms/internal/ads/zzeu;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzahu;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/ads/zzahu;-><init>([B)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzahv;->zzb:Lcom/google/android/gms/internal/ads/zzahu;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzagz;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzagz;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzahv;->zzf:Lcom/google/android/gms/internal/ads/zzagd;

    new-array p1, v0, [Lcom/google/android/gms/internal/ads/zzahy;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzahv;->zzi:[Lcom/google/android/gms/internal/ads/zzahy;

    const-wide/16 p1, -0x1

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzahv;->zzm:J

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzahv;->zzn:J

    const/4 p1, -0x1

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzahv;->zzl:I

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzahv;->zzh:J

    return-void
.end method

.method private final zzi(I)Lcom/google/android/gms/internal/ads/zzahy;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzahv;->zzi:[Lcom/google/android/gms/internal/ads/zzahy;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    :goto_0
    if-ge v2, v1, :cond_1

    .line 6
    .line 7
    aget-object v3, v0, v2

    .line 8
    .line 9
    invoke-virtual {v3, p1}, Lcom/google/android/gms/internal/ads/zzahy;->zzc(I)Z

    .line 10
    .line 11
    .line 12
    move-result v4

    .line 13
    if-eqz v4, :cond_0

    .line 14
    .line 15
    return-object v3

    .line 16
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    const/4 p1, 0x0

    .line 20
    return-object p1
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/ads/zzagb;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzahv;->zza:Lcom/google/android/gms/internal/ads/zzeu;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/16 v2, 0xc

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    invoke-interface {p1, v1, v3, v2}, Lcom/google/android/gms/internal/ads/zzagb;->zzi([BII)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzC()I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    const v1, 0x46464952

    .line 21
    .line 22
    .line 23
    if-eq p1, v1, :cond_0

    .line 24
    .line 25
    return v3

    .line 26
    :cond_0
    const/4 p1, 0x4

    .line 27
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzeu;->zzk(I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzC()I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    const v0, 0x20495641

    .line 35
    .line 36
    .line 37
    if-ne p1, v0, :cond_1

    .line 38
    .line 39
    const/4 p1, 0x1

    .line 40
    return p1

    .line 41
    :cond_1
    return v3
.end method

.method public final synthetic zzb()Ljava/util/List;
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/f;->a(Lcom/google/android/gms/internal/ads/zzaga;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final zzc(Lcom/google/android/gms/internal/ads/zzagd;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzahv;->zze:I

    .line 3
    .line 4
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzahv;->zzc:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzahv;->zzd:Lcom/google/android/gms/internal/ads/zzanq;

    .line 9
    .line 10
    new-instance v1, Lcom/google/android/gms/internal/ads/zzant;

    .line 11
    .line 12
    invoke-direct {v1, p1, v0}, Lcom/google/android/gms/internal/ads/zzant;-><init>(Lcom/google/android/gms/internal/ads/zzagd;Lcom/google/android/gms/internal/ads/zzanq;)V

    .line 13
    .line 14
    .line 15
    move-object p1, v1

    .line 16
    :cond_0
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzahv;->zzf:Lcom/google/android/gms/internal/ads/zzagd;

    .line 17
    .line 18
    const-wide/16 v0, -0x1

    .line 19
    .line 20
    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzahv;->zzj:J

    .line 21
    .line 22
    return-void
.end method

.method public final zzd(Lcom/google/android/gms/internal/ads/zzagb;Lcom/google/android/gms/internal/ads/zzaha;)I
    .locals 21
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-wide v2, v0, Lcom/google/android/gms/internal/ads/zzahv;->zzj:J

    .line 6
    .line 7
    const-wide/16 v4, -0x1

    .line 8
    .line 9
    cmp-long v6, v2, v4

    .line 10
    .line 11
    const/4 v7, 0x1

    .line 12
    const/4 v8, 0x0

    .line 13
    if-eqz v6, :cond_2

    .line 14
    .line 15
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzagb;->zzn()J

    .line 16
    .line 17
    .line 18
    move-result-wide v9

    .line 19
    cmp-long v6, v2, v9

    .line 20
    .line 21
    if-ltz v6, :cond_0

    .line 22
    .line 23
    const-wide/32 v11, 0x40000

    .line 24
    .line 25
    .line 26
    add-long/2addr v11, v9

    .line 27
    cmp-long v6, v2, v11

    .line 28
    .line 29
    if-lez v6, :cond_1

    .line 30
    .line 31
    :cond_0
    move-object/from16 v6, p2

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    sub-long/2addr v2, v9

    .line 35
    long-to-int v2, v2

    .line 36
    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/ads/zzagb;->zzf(I)V

    .line 37
    .line 38
    .line 39
    :cond_2
    move v2, v8

    .line 40
    goto :goto_1

    .line 41
    :goto_0
    iput-wide v2, v6, Lcom/google/android/gms/internal/ads/zzaha;->zza:J

    .line 42
    .line 43
    move v2, v7

    .line 44
    :goto_1
    iput-wide v4, v0, Lcom/google/android/gms/internal/ads/zzahv;->zzj:J

    .line 45
    .line 46
    if-eqz v2, :cond_3

    .line 47
    .line 48
    return v7

    .line 49
    :cond_3
    iget v2, v0, Lcom/google/android/gms/internal/ads/zzahv;->zze:I

    .line 50
    .line 51
    const/16 v3, 0xc

    .line 52
    .line 53
    const/4 v6, 0x0

    .line 54
    if-eqz v2, :cond_2d

    .line 55
    .line 56
    const v9, 0x6c726468

    .line 57
    .line 58
    .line 59
    const v10, 0x5453494c

    .line 60
    .line 61
    .line 62
    const/4 v11, 0x2

    .line 63
    if-eq v2, v7, :cond_2a

    .line 64
    .line 65
    const/4 v12, 0x3

    .line 66
    if-eq v2, v11, :cond_1e

    .line 67
    .line 68
    const v9, 0x69766f6d

    .line 69
    .line 70
    .line 71
    const/4 v13, 0x4

    .line 72
    move-wide/from16 v16, v4

    .line 73
    .line 74
    const-wide/16 v4, 0x0

    .line 75
    .line 76
    const-wide/16 v18, 0x8

    .line 77
    .line 78
    const/16 v14, 0x10

    .line 79
    .line 80
    if-eq v2, v12, :cond_16

    .line 81
    .line 82
    const/4 v12, 0x5

    .line 83
    const/16 v15, 0x8

    .line 84
    .line 85
    if-eq v2, v13, :cond_14

    .line 86
    .line 87
    if-eq v2, v12, :cond_c

    .line 88
    .line 89
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzagb;->zzn()J

    .line 90
    .line 91
    .line 92
    move-result-wide v4

    .line 93
    iget-wide v11, v0, Lcom/google/android/gms/internal/ads/zzahv;->zzn:J

    .line 94
    .line 95
    cmp-long v2, v4, v11

    .line 96
    .line 97
    if-ltz v2, :cond_4

    .line 98
    .line 99
    const/4 v1, -0x1

    .line 100
    return v1

    .line 101
    :cond_4
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzahv;->zzk:Lcom/google/android/gms/internal/ads/zzahy;

    .line 102
    .line 103
    if-eqz v2, :cond_6

    .line 104
    .line 105
    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/zzahy;->zze(Lcom/google/android/gms/internal/ads/zzagb;)Z

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    if-nez v1, :cond_5

    .line 110
    .line 111
    return v8

    .line 112
    :cond_5
    iput-object v6, v0, Lcom/google/android/gms/internal/ads/zzahv;->zzk:Lcom/google/android/gms/internal/ads/zzahy;

    .line 113
    .line 114
    return v8

    .line 115
    :cond_6
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzagb;->zzn()J

    .line 116
    .line 117
    .line 118
    move-result-wide v4

    .line 119
    const-wide/16 v11, 0x1

    .line 120
    .line 121
    and-long/2addr v4, v11

    .line 122
    cmp-long v2, v4, v11

    .line 123
    .line 124
    if-nez v2, :cond_7

    .line 125
    .line 126
    invoke-interface {v1, v7}, Lcom/google/android/gms/internal/ads/zzagb;->zzf(I)V

    .line 127
    .line 128
    .line 129
    :cond_7
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzahv;->zza:Lcom/google/android/gms/internal/ads/zzeu;

    .line 130
    .line 131
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 132
    .line 133
    .line 134
    move-result-object v4

    .line 135
    invoke-interface {v1, v4, v8, v3}, Lcom/google/android/gms/internal/ads/zzagb;->zzi([BII)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v2, v8}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzC()I

    .line 142
    .line 143
    .line 144
    move-result v4

    .line 145
    if-ne v4, v10, :cond_9

    .line 146
    .line 147
    invoke-virtual {v2, v15}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzC()I

    .line 151
    .line 152
    .line 153
    move-result v2

    .line 154
    if-ne v2, v9, :cond_8

    .line 155
    .line 156
    goto :goto_2

    .line 157
    :cond_8
    move v3, v15

    .line 158
    :goto_2
    invoke-interface {v1, v3}, Lcom/google/android/gms/internal/ads/zzagb;->zzf(I)V

    .line 159
    .line 160
    .line 161
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzagb;->zzl()V

    .line 162
    .line 163
    .line 164
    return v8

    .line 165
    :cond_9
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzC()I

    .line 166
    .line 167
    .line 168
    move-result v2

    .line 169
    const v3, 0x4b4e554a    # 1.352225E7f

    .line 170
    .line 171
    .line 172
    if-ne v4, v3, :cond_a

    .line 173
    .line 174
    int-to-long v2, v2

    .line 175
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzagb;->zzn()J

    .line 176
    .line 177
    .line 178
    move-result-wide v4

    .line 179
    add-long/2addr v4, v2

    .line 180
    add-long v4, v4, v18

    .line 181
    .line 182
    iput-wide v4, v0, Lcom/google/android/gms/internal/ads/zzahv;->zzj:J

    .line 183
    .line 184
    return v8

    .line 185
    :cond_a
    invoke-interface {v1, v15}, Lcom/google/android/gms/internal/ads/zzagb;->zzf(I)V

    .line 186
    .line 187
    .line 188
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzagb;->zzl()V

    .line 189
    .line 190
    .line 191
    invoke-direct {v0, v4}, Lcom/google/android/gms/internal/ads/zzahv;->zzi(I)Lcom/google/android/gms/internal/ads/zzahy;

    .line 192
    .line 193
    .line 194
    move-result-object v3

    .line 195
    if-nez v3, :cond_b

    .line 196
    .line 197
    int-to-long v2, v2

    .line 198
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzagb;->zzn()J

    .line 199
    .line 200
    .line 201
    move-result-wide v4

    .line 202
    add-long/2addr v4, v2

    .line 203
    iput-wide v4, v0, Lcom/google/android/gms/internal/ads/zzahv;->zzj:J

    .line 204
    .line 205
    return v8

    .line 206
    :cond_b
    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/ads/zzahy;->zzd(I)V

    .line 207
    .line 208
    .line 209
    iput-object v3, v0, Lcom/google/android/gms/internal/ads/zzahv;->zzk:Lcom/google/android/gms/internal/ads/zzahy;

    .line 210
    .line 211
    return v8

    .line 212
    :cond_c
    new-instance v2, Lcom/google/android/gms/internal/ads/zzeu;

    .line 213
    .line 214
    iget v3, v0, Lcom/google/android/gms/internal/ads/zzahv;->zzo:I

    .line 215
    .line 216
    invoke-direct {v2, v3}, Lcom/google/android/gms/internal/ads/zzeu;-><init>(I)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 220
    .line 221
    .line 222
    move-result-object v3

    .line 223
    iget v6, v0, Lcom/google/android/gms/internal/ads/zzahv;->zzo:I

    .line 224
    .line 225
    invoke-interface {v1, v3, v8, v6}, Lcom/google/android/gms/internal/ads/zzagb;->zzc([BII)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzd()I

    .line 229
    .line 230
    .line 231
    move-result v1

    .line 232
    if-ge v1, v14, :cond_d

    .line 233
    .line 234
    move/from16 v20, v8

    .line 235
    .line 236
    move-wide v8, v4

    .line 237
    goto :goto_4

    .line 238
    :cond_d
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzg()I

    .line 239
    .line 240
    .line 241
    move-result v1

    .line 242
    invoke-virtual {v2, v15}, Lcom/google/android/gms/internal/ads/zzeu;->zzk(I)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzC()I

    .line 246
    .line 247
    .line 248
    move-result v3

    .line 249
    int-to-long v9, v3

    .line 250
    move/from16 v20, v8

    .line 251
    .line 252
    move-wide v15, v9

    .line 253
    iget-wide v8, v0, Lcom/google/android/gms/internal/ads/zzahv;->zzm:J

    .line 254
    .line 255
    cmp-long v3, v15, v8

    .line 256
    .line 257
    if-lez v3, :cond_e

    .line 258
    .line 259
    move-wide v8, v4

    .line 260
    goto :goto_3

    .line 261
    :cond_e
    add-long v8, v8, v18

    .line 262
    .line 263
    :goto_3
    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 264
    .line 265
    .line 266
    :cond_f
    :goto_4
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzd()I

    .line 267
    .line 268
    .line 269
    move-result v1

    .line 270
    if-lt v1, v14, :cond_11

    .line 271
    .line 272
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzC()I

    .line 273
    .line 274
    .line 275
    move-result v1

    .line 276
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzC()I

    .line 277
    .line 278
    .line 279
    move-result v3

    .line 280
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzC()I

    .line 281
    .line 282
    .line 283
    move-result v6

    .line 284
    int-to-long v11, v6

    .line 285
    add-long/2addr v11, v8

    .line 286
    invoke-virtual {v2, v13}, Lcom/google/android/gms/internal/ads/zzeu;->zzk(I)V

    .line 287
    .line 288
    .line 289
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzahv;->zzi(I)Lcom/google/android/gms/internal/ads/zzahy;

    .line 290
    .line 291
    .line 292
    move-result-object v1

    .line 293
    if-eqz v1, :cond_f

    .line 294
    .line 295
    and-int/2addr v3, v14

    .line 296
    if-ne v3, v14, :cond_10

    .line 297
    .line 298
    move v3, v7

    .line 299
    goto :goto_5

    .line 300
    :cond_10
    move/from16 v3, v20

    .line 301
    .line 302
    :goto_5
    invoke-virtual {v1, v11, v12, v3}, Lcom/google/android/gms/internal/ads/zzahy;->zza(JZ)V

    .line 303
    .line 304
    .line 305
    goto :goto_4

    .line 306
    :cond_11
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzahv;->zzi:[Lcom/google/android/gms/internal/ads/zzahy;

    .line 307
    .line 308
    array-length v2, v1

    .line 309
    move/from16 v3, v20

    .line 310
    .line 311
    :goto_6
    if-ge v3, v2, :cond_12

    .line 312
    .line 313
    aget-object v6, v1, v3

    .line 314
    .line 315
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzahy;->zzb()V

    .line 316
    .line 317
    .line 318
    add-int/lit8 v3, v3, 0x1

    .line 319
    .line 320
    goto :goto_6

    .line 321
    :cond_12
    iput-boolean v7, v0, Lcom/google/android/gms/internal/ads/zzahv;->zzp:Z

    .line 322
    .line 323
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzahv;->zzi:[Lcom/google/android/gms/internal/ads/zzahy;

    .line 324
    .line 325
    array-length v1, v1

    .line 326
    if-nez v1, :cond_13

    .line 327
    .line 328
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzahv;->zzf:Lcom/google/android/gms/internal/ads/zzagd;

    .line 329
    .line 330
    new-instance v2, Lcom/google/android/gms/internal/ads/zzahc;

    .line 331
    .line 332
    iget-wide v6, v0, Lcom/google/android/gms/internal/ads/zzahv;->zzh:J

    .line 333
    .line 334
    invoke-direct {v2, v6, v7, v4, v5}, Lcom/google/android/gms/internal/ads/zzahc;-><init>(JJ)V

    .line 335
    .line 336
    .line 337
    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/ads/zzagd;->zzw(Lcom/google/android/gms/internal/ads/zzahd;)V

    .line 338
    .line 339
    .line 340
    :goto_7
    const/4 v1, 0x6

    .line 341
    goto :goto_8

    .line 342
    :cond_13
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzahv;->zzf:Lcom/google/android/gms/internal/ads/zzagd;

    .line 343
    .line 344
    new-instance v2, Lcom/google/android/gms/internal/ads/zzaht;

    .line 345
    .line 346
    iget-wide v3, v0, Lcom/google/android/gms/internal/ads/zzahv;->zzh:J

    .line 347
    .line 348
    invoke-direct {v2, v0, v3, v4}, Lcom/google/android/gms/internal/ads/zzaht;-><init>(Lcom/google/android/gms/internal/ads/zzahv;J)V

    .line 349
    .line 350
    .line 351
    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/ads/zzagd;->zzw(Lcom/google/android/gms/internal/ads/zzahd;)V

    .line 352
    .line 353
    .line 354
    goto :goto_7

    .line 355
    :goto_8
    iput v1, v0, Lcom/google/android/gms/internal/ads/zzahv;->zze:I

    .line 356
    .line 357
    iget-wide v1, v0, Lcom/google/android/gms/internal/ads/zzahv;->zzm:J

    .line 358
    .line 359
    iput-wide v1, v0, Lcom/google/android/gms/internal/ads/zzahv;->zzj:J

    .line 360
    .line 361
    return v20

    .line 362
    :cond_14
    move/from16 v20, v8

    .line 363
    .line 364
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzahv;->zza:Lcom/google/android/gms/internal/ads/zzeu;

    .line 365
    .line 366
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 367
    .line 368
    .line 369
    move-result-object v3

    .line 370
    move/from16 v4, v20

    .line 371
    .line 372
    invoke-interface {v1, v3, v4, v15}, Lcom/google/android/gms/internal/ads/zzagb;->zzc([BII)V

    .line 373
    .line 374
    .line 375
    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 376
    .line 377
    .line 378
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzC()I

    .line 379
    .line 380
    .line 381
    move-result v3

    .line 382
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzC()I

    .line 383
    .line 384
    .line 385
    move-result v2

    .line 386
    const v4, 0x31786469

    .line 387
    .line 388
    .line 389
    if-ne v3, v4, :cond_15

    .line 390
    .line 391
    iput v12, v0, Lcom/google/android/gms/internal/ads/zzahv;->zze:I

    .line 392
    .line 393
    iput v2, v0, Lcom/google/android/gms/internal/ads/zzahv;->zzo:I

    .line 394
    .line 395
    :goto_9
    const/4 v2, 0x0

    .line 396
    goto :goto_a

    .line 397
    :cond_15
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzagb;->zzn()J

    .line 398
    .line 399
    .line 400
    move-result-wide v3

    .line 401
    int-to-long v1, v2

    .line 402
    add-long/2addr v3, v1

    .line 403
    iput-wide v3, v0, Lcom/google/android/gms/internal/ads/zzahv;->zzj:J

    .line 404
    .line 405
    goto :goto_9

    .line 406
    :goto_a
    return v2

    .line 407
    :cond_16
    move v2, v8

    .line 408
    iget-wide v11, v0, Lcom/google/android/gms/internal/ads/zzahv;->zzm:J

    .line 409
    .line 410
    cmp-long v6, v11, v16

    .line 411
    .line 412
    if-eqz v6, :cond_18

    .line 413
    .line 414
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzagb;->zzn()J

    .line 415
    .line 416
    .line 417
    move-result-wide v15

    .line 418
    cmp-long v6, v15, v11

    .line 419
    .line 420
    if-nez v6, :cond_17

    .line 421
    .line 422
    goto :goto_b

    .line 423
    :cond_17
    iput-wide v11, v0, Lcom/google/android/gms/internal/ads/zzahv;->zzj:J

    .line 424
    .line 425
    return v2

    .line 426
    :cond_18
    :goto_b
    iget-object v6, v0, Lcom/google/android/gms/internal/ads/zzahv;->zza:Lcom/google/android/gms/internal/ads/zzeu;

    .line 427
    .line 428
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 429
    .line 430
    .line 431
    move-result-object v8

    .line 432
    invoke-interface {v1, v8, v2, v3}, Lcom/google/android/gms/internal/ads/zzagb;->zzi([BII)V

    .line 433
    .line 434
    .line 435
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzagb;->zzl()V

    .line 436
    .line 437
    .line 438
    invoke-virtual {v6, v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 439
    .line 440
    .line 441
    iget-object v8, v0, Lcom/google/android/gms/internal/ads/zzahv;->zzb:Lcom/google/android/gms/internal/ads/zzahu;

    .line 442
    .line 443
    invoke-virtual {v8, v6}, Lcom/google/android/gms/internal/ads/zzahu;->zza(Lcom/google/android/gms/internal/ads/zzeu;)V

    .line 444
    .line 445
    .line 446
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzeu;->zzC()I

    .line 447
    .line 448
    .line 449
    move-result v6

    .line 450
    iget v11, v8, Lcom/google/android/gms/internal/ads/zzahu;->zza:I

    .line 451
    .line 452
    const v12, 0x46464952

    .line 453
    .line 454
    .line 455
    if-ne v11, v12, :cond_19

    .line 456
    .line 457
    invoke-interface {v1, v3}, Lcom/google/android/gms/internal/ads/zzagb;->zzf(I)V

    .line 458
    .line 459
    .line 460
    return v2

    .line 461
    :cond_19
    if-ne v11, v10, :cond_1a

    .line 462
    .line 463
    if-eq v6, v9, :cond_1b

    .line 464
    .line 465
    :cond_1a
    const/4 v2, 0x0

    .line 466
    goto :goto_d

    .line 467
    :cond_1b
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzagb;->zzn()J

    .line 468
    .line 469
    .line 470
    move-result-wide v2

    .line 471
    iput-wide v2, v0, Lcom/google/android/gms/internal/ads/zzahv;->zzm:J

    .line 472
    .line 473
    iget v6, v8, Lcom/google/android/gms/internal/ads/zzahu;->zzb:I

    .line 474
    .line 475
    int-to-long v8, v6

    .line 476
    add-long/2addr v2, v8

    .line 477
    add-long v2, v2, v18

    .line 478
    .line 479
    iput-wide v2, v0, Lcom/google/android/gms/internal/ads/zzahv;->zzn:J

    .line 480
    .line 481
    iget-boolean v6, v0, Lcom/google/android/gms/internal/ads/zzahv;->zzp:Z

    .line 482
    .line 483
    if-nez v6, :cond_1c

    .line 484
    .line 485
    iget-object v6, v0, Lcom/google/android/gms/internal/ads/zzahv;->zzg:Lcom/google/android/gms/internal/ads/zzahw;

    .line 486
    .line 487
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 488
    .line 489
    .line 490
    iget v6, v6, Lcom/google/android/gms/internal/ads/zzahw;->zzb:I

    .line 491
    .line 492
    and-int/2addr v6, v14

    .line 493
    if-eq v6, v14, :cond_1d

    .line 494
    .line 495
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzahv;->zzf:Lcom/google/android/gms/internal/ads/zzagd;

    .line 496
    .line 497
    new-instance v3, Lcom/google/android/gms/internal/ads/zzahc;

    .line 498
    .line 499
    iget-wide v8, v0, Lcom/google/android/gms/internal/ads/zzahv;->zzh:J

    .line 500
    .line 501
    invoke-direct {v3, v8, v9, v4, v5}, Lcom/google/android/gms/internal/ads/zzahc;-><init>(JJ)V

    .line 502
    .line 503
    .line 504
    invoke-interface {v2, v3}, Lcom/google/android/gms/internal/ads/zzagd;->zzw(Lcom/google/android/gms/internal/ads/zzahd;)V

    .line 505
    .line 506
    .line 507
    iput-boolean v7, v0, Lcom/google/android/gms/internal/ads/zzahv;->zzp:Z

    .line 508
    .line 509
    :cond_1c
    const/4 v2, 0x0

    .line 510
    goto :goto_c

    .line 511
    :cond_1d
    iput v13, v0, Lcom/google/android/gms/internal/ads/zzahv;->zze:I

    .line 512
    .line 513
    iput-wide v2, v0, Lcom/google/android/gms/internal/ads/zzahv;->zzj:J

    .line 514
    .line 515
    const/4 v2, 0x0

    .line 516
    return v2

    .line 517
    :goto_c
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzagb;->zzn()J

    .line 518
    .line 519
    .line 520
    move-result-wide v3

    .line 521
    const-wide/16 v5, 0xc

    .line 522
    .line 523
    add-long/2addr v3, v5

    .line 524
    iput-wide v3, v0, Lcom/google/android/gms/internal/ads/zzahv;->zzj:J

    .line 525
    .line 526
    const/4 v1, 0x6

    .line 527
    iput v1, v0, Lcom/google/android/gms/internal/ads/zzahv;->zze:I

    .line 528
    .line 529
    return v2

    .line 530
    :goto_d
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzagb;->zzn()J

    .line 531
    .line 532
    .line 533
    move-result-wide v3

    .line 534
    iget v1, v8, Lcom/google/android/gms/internal/ads/zzahu;->zzb:I

    .line 535
    .line 536
    int-to-long v5, v1

    .line 537
    add-long/2addr v3, v5

    .line 538
    add-long v3, v3, v18

    .line 539
    .line 540
    iput-wide v3, v0, Lcom/google/android/gms/internal/ads/zzahv;->zzj:J

    .line 541
    .line 542
    return v2

    .line 543
    :cond_1e
    move v2, v8

    .line 544
    iget v3, v0, Lcom/google/android/gms/internal/ads/zzahv;->zzl:I

    .line 545
    .line 546
    add-int/lit8 v3, v3, -0x4

    .line 547
    .line 548
    new-instance v4, Lcom/google/android/gms/internal/ads/zzeu;

    .line 549
    .line 550
    invoke-direct {v4, v3}, Lcom/google/android/gms/internal/ads/zzeu;-><init>(I)V

    .line 551
    .line 552
    .line 553
    invoke-virtual {v4}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 554
    .line 555
    .line 556
    move-result-object v5

    .line 557
    invoke-interface {v1, v5, v2, v3}, Lcom/google/android/gms/internal/ads/zzagb;->zzc([BII)V

    .line 558
    .line 559
    .line 560
    invoke-static {v9, v4}, Lcom/google/android/gms/internal/ads/zzahz;->zzb(ILcom/google/android/gms/internal/ads/zzeu;)Lcom/google/android/gms/internal/ads/zzahz;

    .line 561
    .line 562
    .line 563
    move-result-object v1

    .line 564
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzahz;->zza()I

    .line 565
    .line 566
    .line 567
    move-result v2

    .line 568
    if-ne v2, v9, :cond_29

    .line 569
    .line 570
    const-class v2, Lcom/google/android/gms/internal/ads/zzahw;

    .line 571
    .line 572
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/zzahz;->zzc(Ljava/lang/Class;)Lcom/google/android/gms/internal/ads/zzahs;

    .line 573
    .line 574
    .line 575
    move-result-object v2

    .line 576
    check-cast v2, Lcom/google/android/gms/internal/ads/zzahw;

    .line 577
    .line 578
    if-eqz v2, :cond_28

    .line 579
    .line 580
    iput-object v2, v0, Lcom/google/android/gms/internal/ads/zzahv;->zzg:Lcom/google/android/gms/internal/ads/zzahw;

    .line 581
    .line 582
    iget v3, v2, Lcom/google/android/gms/internal/ads/zzahw;->zzc:I

    .line 583
    .line 584
    iget v2, v2, Lcom/google/android/gms/internal/ads/zzahw;->zza:I

    .line 585
    .line 586
    int-to-long v3, v3

    .line 587
    int-to-long v8, v2

    .line 588
    mul-long/2addr v3, v8

    .line 589
    iput-wide v3, v0, Lcom/google/android/gms/internal/ads/zzahv;->zzh:J

    .line 590
    .line 591
    new-instance v2, Ljava/util/ArrayList;

    .line 592
    .line 593
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 594
    .line 595
    .line 596
    iget-object v1, v1, Lcom/google/android/gms/internal/ads/zzahz;->zza:Lcom/google/android/gms/internal/ads/zzgwt;

    .line 597
    .line 598
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 599
    .line 600
    .line 601
    move-result v3

    .line 602
    const/4 v4, 0x0

    .line 603
    const/4 v5, 0x0

    .line 604
    :goto_e
    if-ge v4, v3, :cond_27

    .line 605
    .line 606
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 607
    .line 608
    .line 609
    move-result-object v8

    .line 610
    check-cast v8, Lcom/google/android/gms/internal/ads/zzahs;

    .line 611
    .line 612
    invoke-interface {v8}, Lcom/google/android/gms/internal/ads/zzahs;->zza()I

    .line 613
    .line 614
    .line 615
    move-result v9

    .line 616
    const v10, 0x6c727473

    .line 617
    .line 618
    .line 619
    if-ne v9, v10, :cond_26

    .line 620
    .line 621
    check-cast v8, Lcom/google/android/gms/internal/ads/zzahz;

    .line 622
    .line 623
    add-int/lit8 v9, v5, 0x1

    .line 624
    .line 625
    const-class v10, Lcom/google/android/gms/internal/ads/zzahx;

    .line 626
    .line 627
    invoke-virtual {v8, v10}, Lcom/google/android/gms/internal/ads/zzahz;->zzc(Ljava/lang/Class;)Lcom/google/android/gms/internal/ads/zzahs;

    .line 628
    .line 629
    .line 630
    move-result-object v10

    .line 631
    check-cast v10, Lcom/google/android/gms/internal/ads/zzahx;

    .line 632
    .line 633
    const-class v13, Lcom/google/android/gms/internal/ads/zzaia;

    .line 634
    .line 635
    invoke-virtual {v8, v13}, Lcom/google/android/gms/internal/ads/zzahz;->zzc(Ljava/lang/Class;)Lcom/google/android/gms/internal/ads/zzahs;

    .line 636
    .line 637
    .line 638
    move-result-object v13

    .line 639
    check-cast v13, Lcom/google/android/gms/internal/ads/zzaia;

    .line 640
    .line 641
    const-string v14, "AviExtractor"

    .line 642
    .line 643
    if-nez v10, :cond_1f

    .line 644
    .line 645
    const-string v5, "Missing Stream Header"

    .line 646
    .line 647
    invoke-static {v14, v5}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    .line 648
    .line 649
    .line 650
    goto :goto_10

    .line 651
    :cond_1f
    if-nez v13, :cond_20

    .line 652
    .line 653
    const-string v5, "Missing Stream Format"

    .line 654
    .line 655
    invoke-static {v14, v5}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    .line 656
    .line 657
    .line 658
    goto :goto_10

    .line 659
    :cond_20
    invoke-virtual {v10}, Lcom/google/android/gms/internal/ads/zzahx;->zzd()J

    .line 660
    .line 661
    .line 662
    move-result-wide v14

    .line 663
    iget-object v13, v13, Lcom/google/android/gms/internal/ads/zzaia;->zza:Lcom/google/android/gms/internal/ads/zzv;

    .line 664
    .line 665
    invoke-virtual {v13}, Lcom/google/android/gms/internal/ads/zzv;->zza()Lcom/google/android/gms/internal/ads/zzt;

    .line 666
    .line 667
    .line 668
    move-result-object v6

    .line 669
    invoke-virtual {v6, v5}, Lcom/google/android/gms/internal/ads/zzt;->zzb(I)Lcom/google/android/gms/internal/ads/zzt;

    .line 670
    .line 671
    .line 672
    iget v12, v10, Lcom/google/android/gms/internal/ads/zzahx;->zze:I

    .line 673
    .line 674
    if-eqz v12, :cond_21

    .line 675
    .line 676
    invoke-virtual {v6, v12}, Lcom/google/android/gms/internal/ads/zzt;->zzp(I)Lcom/google/android/gms/internal/ads/zzt;

    .line 677
    .line 678
    .line 679
    :cond_21
    const-class v12, Lcom/google/android/gms/internal/ads/zzaib;

    .line 680
    .line 681
    invoke-virtual {v8, v12}, Lcom/google/android/gms/internal/ads/zzahz;->zzc(Ljava/lang/Class;)Lcom/google/android/gms/internal/ads/zzahs;

    .line 682
    .line 683
    .line 684
    move-result-object v8

    .line 685
    check-cast v8, Lcom/google/android/gms/internal/ads/zzaib;

    .line 686
    .line 687
    if-eqz v8, :cond_22

    .line 688
    .line 689
    iget-object v8, v8, Lcom/google/android/gms/internal/ads/zzaib;->zza:Ljava/lang/String;

    .line 690
    .line 691
    invoke-virtual {v6, v8}, Lcom/google/android/gms/internal/ads/zzt;->zzc(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzt;

    .line 692
    .line 693
    .line 694
    :cond_22
    iget-object v8, v13, Lcom/google/android/gms/internal/ads/zzv;->zzp:Ljava/lang/String;

    .line 695
    .line 696
    invoke-static {v8}, Lcom/google/android/gms/internal/ads/zzas;->zzf(Ljava/lang/String;)I

    .line 697
    .line 698
    .line 699
    move-result v8

    .line 700
    if-eq v8, v7, :cond_24

    .line 701
    .line 702
    if-ne v8, v11, :cond_23

    .line 703
    .line 704
    move v8, v11

    .line 705
    goto :goto_f

    .line 706
    :cond_23
    const/4 v6, 0x0

    .line 707
    goto :goto_10

    .line 708
    :cond_24
    :goto_f
    iget-object v12, v0, Lcom/google/android/gms/internal/ads/zzahv;->zzf:Lcom/google/android/gms/internal/ads/zzagd;

    .line 709
    .line 710
    invoke-interface {v12, v5, v8}, Lcom/google/android/gms/internal/ads/zzagd;->zzs(II)Lcom/google/android/gms/internal/ads/zzahm;

    .line 711
    .line 712
    .line 713
    move-result-object v8

    .line 714
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzt;->zzP()Lcom/google/android/gms/internal/ads/zzv;

    .line 715
    .line 716
    .line 717
    move-result-object v6

    .line 718
    invoke-interface {v8, v6}, Lcom/google/android/gms/internal/ads/zzahm;->zzA(Lcom/google/android/gms/internal/ads/zzv;)V

    .line 719
    .line 720
    .line 721
    invoke-interface {v8, v14, v15}, Lcom/google/android/gms/internal/ads/zzahm;->zzP(J)V

    .line 722
    .line 723
    .line 724
    iget-wide v12, v0, Lcom/google/android/gms/internal/ads/zzahv;->zzh:J

    .line 725
    .line 726
    invoke-static {v12, v13, v14, v15}, Ljava/lang/Math;->max(JJ)J

    .line 727
    .line 728
    .line 729
    move-result-wide v12

    .line 730
    iput-wide v12, v0, Lcom/google/android/gms/internal/ads/zzahv;->zzh:J

    .line 731
    .line 732
    new-instance v6, Lcom/google/android/gms/internal/ads/zzahy;

    .line 733
    .line 734
    invoke-direct {v6, v5, v10, v8}, Lcom/google/android/gms/internal/ads/zzahy;-><init>(ILcom/google/android/gms/internal/ads/zzahx;Lcom/google/android/gms/internal/ads/zzahm;)V

    .line 735
    .line 736
    .line 737
    :goto_10
    if-eqz v6, :cond_25

    .line 738
    .line 739
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 740
    .line 741
    .line 742
    :cond_25
    move v5, v9

    .line 743
    :cond_26
    add-int/lit8 v4, v4, 0x1

    .line 744
    .line 745
    const/4 v6, 0x0

    .line 746
    const/4 v12, 0x3

    .line 747
    goto/16 :goto_e

    .line 748
    .line 749
    :cond_27
    const/4 v4, 0x0

    .line 750
    new-array v1, v4, [Lcom/google/android/gms/internal/ads/zzahy;

    .line 751
    .line 752
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 753
    .line 754
    .line 755
    move-result-object v1

    .line 756
    check-cast v1, [Lcom/google/android/gms/internal/ads/zzahy;

    .line 757
    .line 758
    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzahv;->zzi:[Lcom/google/android/gms/internal/ads/zzahy;

    .line 759
    .line 760
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzahv;->zzf:Lcom/google/android/gms/internal/ads/zzagd;

    .line 761
    .line 762
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzagd;->zzv()V

    .line 763
    .line 764
    .line 765
    const/4 v1, 0x3

    .line 766
    iput v1, v0, Lcom/google/android/gms/internal/ads/zzahv;->zze:I

    .line 767
    .line 768
    return v4

    .line 769
    :cond_28
    const-string v1, "AviHeader not found"

    .line 770
    .line 771
    const/4 v2, 0x0

    .line 772
    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/zzat;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzat;

    .line 773
    .line 774
    .line 775
    move-result-object v1

    .line 776
    throw v1

    .line 777
    :cond_29
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzahz;->zza()I

    .line 778
    .line 779
    .line 780
    move-result v1

    .line 781
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 782
    .line 783
    .line 784
    move-result-object v2

    .line 785
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 786
    .line 787
    .line 788
    move-result v2

    .line 789
    new-instance v3, Ljava/lang/StringBuilder;

    .line 790
    .line 791
    add-int/lit8 v2, v2, 0x1c

    .line 792
    .line 793
    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 794
    .line 795
    .line 796
    const-string v2, "Unexpected header list type "

    .line 797
    .line 798
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 799
    .line 800
    .line 801
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 802
    .line 803
    .line 804
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 805
    .line 806
    .line 807
    move-result-object v1

    .line 808
    const/4 v2, 0x0

    .line 809
    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/zzat;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzat;

    .line 810
    .line 811
    .line 812
    move-result-object v1

    .line 813
    throw v1

    .line 814
    :cond_2a
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzahv;->zza:Lcom/google/android/gms/internal/ads/zzeu;

    .line 815
    .line 816
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 817
    .line 818
    .line 819
    move-result-object v4

    .line 820
    const/4 v5, 0x0

    .line 821
    invoke-interface {v1, v4, v5, v3}, Lcom/google/android/gms/internal/ads/zzagb;->zzc([BII)V

    .line 822
    .line 823
    .line 824
    invoke-virtual {v2, v5}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 825
    .line 826
    .line 827
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzahv;->zzb:Lcom/google/android/gms/internal/ads/zzahu;

    .line 828
    .line 829
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/zzahu;->zza(Lcom/google/android/gms/internal/ads/zzeu;)V

    .line 830
    .line 831
    .line 832
    iget v3, v1, Lcom/google/android/gms/internal/ads/zzahu;->zza:I

    .line 833
    .line 834
    const/16 v4, 0x16

    .line 835
    .line 836
    if-ne v3, v10, :cond_2c

    .line 837
    .line 838
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzC()I

    .line 839
    .line 840
    .line 841
    move-result v2

    .line 842
    if-ne v2, v9, :cond_2b

    .line 843
    .line 844
    iget v1, v1, Lcom/google/android/gms/internal/ads/zzahu;->zzb:I

    .line 845
    .line 846
    iput v1, v0, Lcom/google/android/gms/internal/ads/zzahv;->zzl:I

    .line 847
    .line 848
    iput v11, v0, Lcom/google/android/gms/internal/ads/zzahv;->zze:I

    .line 849
    .line 850
    return v5

    .line 851
    :cond_2b
    invoke-static {v2, v4}, LA7/p0;->f(II)I

    .line 852
    .line 853
    .line 854
    move-result v1

    .line 855
    new-instance v3, Ljava/lang/StringBuilder;

    .line 856
    .line 857
    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 858
    .line 859
    .line 860
    const-string v1, "hdrl expected, found: "

    .line 861
    .line 862
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 863
    .line 864
    .line 865
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 866
    .line 867
    .line 868
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 869
    .line 870
    .line 871
    move-result-object v1

    .line 872
    const/4 v2, 0x0

    .line 873
    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/zzat;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzat;

    .line 874
    .line 875
    .line 876
    move-result-object v1

    .line 877
    throw v1

    .line 878
    :cond_2c
    const/4 v2, 0x0

    .line 879
    invoke-static {v3, v4}, LA7/p0;->f(II)I

    .line 880
    .line 881
    .line 882
    move-result v1

    .line 883
    new-instance v4, Ljava/lang/StringBuilder;

    .line 884
    .line 885
    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 886
    .line 887
    .line 888
    const-string v1, "LIST expected, found: "

    .line 889
    .line 890
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 891
    .line 892
    .line 893
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 894
    .line 895
    .line 896
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 897
    .line 898
    .line 899
    move-result-object v1

    .line 900
    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/zzat;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzat;

    .line 901
    .line 902
    .line 903
    move-result-object v1

    .line 904
    throw v1

    .line 905
    :cond_2d
    move-object v2, v6

    .line 906
    invoke-virtual/range {p0 .. p1}, Lcom/google/android/gms/internal/ads/zzahv;->zza(Lcom/google/android/gms/internal/ads/zzagb;)Z

    .line 907
    .line 908
    .line 909
    move-result v4

    .line 910
    if-eqz v4, :cond_2e

    .line 911
    .line 912
    invoke-interface {v1, v3}, Lcom/google/android/gms/internal/ads/zzagb;->zzf(I)V

    .line 913
    .line 914
    .line 915
    iput v7, v0, Lcom/google/android/gms/internal/ads/zzahv;->zze:I

    .line 916
    .line 917
    const/16 v20, 0x0

    .line 918
    .line 919
    return v20

    .line 920
    :cond_2e
    const-string v1, "AVI Header List not found"

    .line 921
    .line 922
    invoke-static {v1, v2}, Lcom/google/android/gms/internal/ads/zzat;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzat;

    .line 923
    .line 924
    .line 925
    move-result-object v1

    .line 926
    throw v1
.end method

.method public final zze(JJ)V
    .locals 3

    .line 1
    const-wide/16 p3, -0x1

    .line 2
    .line 3
    iput-wide p3, p0, Lcom/google/android/gms/internal/ads/zzahv;->zzj:J

    .line 4
    .line 5
    const/4 p3, 0x0

    .line 6
    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzahv;->zzk:Lcom/google/android/gms/internal/ads/zzahy;

    .line 7
    .line 8
    iget-object p3, p0, Lcom/google/android/gms/internal/ads/zzahv;->zzi:[Lcom/google/android/gms/internal/ads/zzahy;

    .line 9
    .line 10
    array-length p4, p3

    .line 11
    const/4 v0, 0x0

    .line 12
    move v1, v0

    .line 13
    :goto_0
    if-ge v1, p4, :cond_0

    .line 14
    .line 15
    aget-object v2, p3, v1

    .line 16
    .line 17
    invoke-virtual {v2, p1, p2}, Lcom/google/android/gms/internal/ads/zzahy;->zzf(J)V

    .line 18
    .line 19
    .line 20
    add-int/lit8 v1, v1, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const-wide/16 p3, 0x0

    .line 24
    .line 25
    cmp-long p1, p1, p3

    .line 26
    .line 27
    if-nez p1, :cond_2

    .line 28
    .line 29
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzahv;->zzi:[Lcom/google/android/gms/internal/ads/zzahy;

    .line 30
    .line 31
    array-length p1, p1

    .line 32
    if-nez p1, :cond_1

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    const/4 v0, 0x3

    .line 36
    :goto_1
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzahv;->zze:I

    .line 37
    .line 38
    return-void

    .line 39
    :cond_2
    const/4 p1, 0x6

    .line 40
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzahv;->zze:I

    .line 41
    .line 42
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

.method public final synthetic zzh()[Lcom/google/android/gms/internal/ads/zzahy;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzahv;->zzi:[Lcom/google/android/gms/internal/ads/zzahy;

    return-object v0
.end method
