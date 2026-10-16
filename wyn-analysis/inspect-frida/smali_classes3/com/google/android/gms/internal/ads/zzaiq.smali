.class final Lcom/google/android/gms/internal/ads/zzaiq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzaga;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzeu;

.field private zzb:Lcom/google/android/gms/internal/ads/zzagd;

.field private zzc:Lcom/google/android/gms/internal/ads/zzajb;

.field private zzd:Lcom/google/android/gms/internal/ads/zzagb;

.field private zze:Lcom/google/android/gms/internal/ads/zzahi;

.field private zzf:Lcom/google/android/gms/internal/ads/zzami;

.field private zzg:I

.field private zzh:I

.field private zzi:J

.field private zzj:I

.field private zzk:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/google/android/gms/internal/ads/zzeu;

    .line 5
    .line 6
    const/16 v1, 0x10

    .line 7
    .line 8
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzeu;-><init>(I)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzaiq;->zza:Lcom/google/android/gms/internal/ads/zzeu;

    .line 12
    .line 13
    const-wide/16 v0, -0x1

    .line 14
    .line 15
    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzaiq;->zzk:J

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzaiq;->zzg:I

    .line 19
    .line 20
    return-void
.end method

.method private final zzh()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaiq;->zzb:Lcom/google/android/gms/internal/ads/zzagd;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzagd;->zzv()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaiq;->zzb:Lcom/google/android/gms/internal/ads/zzagd;

    .line 10
    .line 11
    new-instance v1, Lcom/google/android/gms/internal/ads/zzahc;

    .line 12
    .line 13
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    const-wide/16 v4, 0x0

    .line 19
    .line 20
    invoke-direct {v1, v2, v3, v4, v5}, Lcom/google/android/gms/internal/ads/zzahc;-><init>(JJ)V

    .line 21
    .line 22
    .line 23
    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/zzagd;->zzw(Lcom/google/android/gms/internal/ads/zzahd;)V

    .line 24
    .line 25
    .line 26
    const/4 v0, 0x4

    .line 27
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzaiq;->zzg:I

    .line 28
    .line 29
    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/ads/zzagb;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ads/zzais;->zza(Lcom/google/android/gms/internal/ads/zzagb;Z)Z

    .line 3
    .line 4
    .line 5
    move-result p1

    .line 6
    return p1
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

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaiq;->zzb:Lcom/google/android/gms/internal/ads/zzagd;

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
    move-object/from16 v2, p2

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    const/4 v4, 0x0

    .line 9
    :goto_0
    iget v5, v0, Lcom/google/android/gms/internal/ads/zzaiq;->zzg:I

    .line 10
    .line 11
    const/4 v6, -0x1

    .line 12
    const/4 v7, 0x2

    .line 13
    const/16 v8, 0x8

    .line 14
    .line 15
    if-eqz v5, :cond_8

    .line 16
    .line 17
    if-eq v5, v3, :cond_7

    .line 18
    .line 19
    const/4 v9, 0x3

    .line 20
    if-eq v5, v7, :cond_4

    .line 21
    .line 22
    if-eq v5, v9, :cond_0

    .line 23
    .line 24
    return v6

    .line 25
    :cond_0
    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzaiq;->zze:Lcom/google/android/gms/internal/ads/zzahi;

    .line 26
    .line 27
    if-eqz v4, :cond_1

    .line 28
    .line 29
    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzaiq;->zzd:Lcom/google/android/gms/internal/ads/zzagb;

    .line 30
    .line 31
    if-eq v1, v4, :cond_2

    .line 32
    .line 33
    :cond_1
    iput-object v1, v0, Lcom/google/android/gms/internal/ads/zzaiq;->zzd:Lcom/google/android/gms/internal/ads/zzagb;

    .line 34
    .line 35
    new-instance v4, Lcom/google/android/gms/internal/ads/zzahi;

    .line 36
    .line 37
    iget-wide v5, v0, Lcom/google/android/gms/internal/ads/zzaiq;->zzk:J

    .line 38
    .line 39
    invoke-direct {v4, v1, v5, v6}, Lcom/google/android/gms/internal/ads/zzahi;-><init>(Lcom/google/android/gms/internal/ads/zzagb;J)V

    .line 40
    .line 41
    .line 42
    iput-object v4, v0, Lcom/google/android/gms/internal/ads/zzaiq;->zze:Lcom/google/android/gms/internal/ads/zzahi;

    .line 43
    .line 44
    :cond_2
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzaiq;->zzf:Lcom/google/android/gms/internal/ads/zzami;

    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzaiq;->zze:Lcom/google/android/gms/internal/ads/zzahi;

    .line 50
    .line 51
    invoke-virtual {v1, v4, v2}, Lcom/google/android/gms/internal/ads/zzami;->zzd(Lcom/google/android/gms/internal/ads/zzagb;Lcom/google/android/gms/internal/ads/zzaha;)I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-ne v1, v3, :cond_3

    .line 56
    .line 57
    iget-wide v3, v2, Lcom/google/android/gms/internal/ads/zzaha;->zza:J

    .line 58
    .line 59
    iget-wide v5, v0, Lcom/google/android/gms/internal/ads/zzaiq;->zzk:J

    .line 60
    .line 61
    add-long/2addr v3, v5

    .line 62
    iput-wide v3, v2, Lcom/google/android/gms/internal/ads/zzaha;->zza:J

    .line 63
    .line 64
    :cond_3
    return v1

    .line 65
    :cond_4
    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzaiq;->zzf:Lcom/google/android/gms/internal/ads/zzami;

    .line 66
    .line 67
    if-nez v5, :cond_5

    .line 68
    .line 69
    new-instance v5, Lcom/google/android/gms/internal/ads/zzami;

    .line 70
    .line 71
    sget-object v6, Lcom/google/android/gms/internal/ads/zzanq;->zza:Lcom/google/android/gms/internal/ads/zzanq;

    .line 72
    .line 73
    invoke-direct {v5, v6, v8}, Lcom/google/android/gms/internal/ads/zzami;-><init>(Lcom/google/android/gms/internal/ads/zzanq;I)V

    .line 74
    .line 75
    .line 76
    iput-object v5, v0, Lcom/google/android/gms/internal/ads/zzaiq;->zzf:Lcom/google/android/gms/internal/ads/zzami;

    .line 77
    .line 78
    :cond_5
    new-instance v5, Lcom/google/android/gms/internal/ads/zzahi;

    .line 79
    .line 80
    iget-wide v6, v0, Lcom/google/android/gms/internal/ads/zzaiq;->zzk:J

    .line 81
    .line 82
    invoke-direct {v5, v1, v6, v7}, Lcom/google/android/gms/internal/ads/zzahi;-><init>(Lcom/google/android/gms/internal/ads/zzagb;J)V

    .line 83
    .line 84
    .line 85
    iput-object v5, v0, Lcom/google/android/gms/internal/ads/zzaiq;->zze:Lcom/google/android/gms/internal/ads/zzahi;

    .line 86
    .line 87
    iget-object v6, v0, Lcom/google/android/gms/internal/ads/zzaiq;->zzf:Lcom/google/android/gms/internal/ads/zzami;

    .line 88
    .line 89
    invoke-virtual {v6, v5}, Lcom/google/android/gms/internal/ads/zzami;->zza(Lcom/google/android/gms/internal/ads/zzagb;)Z

    .line 90
    .line 91
    .line 92
    move-result v5

    .line 93
    if-eqz v5, :cond_6

    .line 94
    .line 95
    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzaiq;->zzf:Lcom/google/android/gms/internal/ads/zzami;

    .line 96
    .line 97
    new-instance v6, Lcom/google/android/gms/internal/ads/zzahk;

    .line 98
    .line 99
    iget-wide v7, v0, Lcom/google/android/gms/internal/ads/zzaiq;->zzk:J

    .line 100
    .line 101
    iget-object v10, v0, Lcom/google/android/gms/internal/ads/zzaiq;->zzb:Lcom/google/android/gms/internal/ads/zzagd;

    .line 102
    .line 103
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    invoke-direct {v6, v7, v8, v10}, Lcom/google/android/gms/internal/ads/zzahk;-><init>(JLcom/google/android/gms/internal/ads/zzagd;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v5, v6}, Lcom/google/android/gms/internal/ads/zzami;->zzc(Lcom/google/android/gms/internal/ads/zzagd;)V

    .line 110
    .line 111
    .line 112
    iput v9, v0, Lcom/google/android/gms/internal/ads/zzaiq;->zzg:I

    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_6
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzaiq;->zzh()V

    .line 116
    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_7
    iget-wide v5, v0, Lcom/google/android/gms/internal/ads/zzaiq;->zzi:J

    .line 120
    .line 121
    iget v7, v0, Lcom/google/android/gms/internal/ads/zzaiq;->zzj:I

    .line 122
    .line 123
    int-to-long v7, v7

    .line 124
    sub-long/2addr v5, v7

    .line 125
    long-to-int v5, v5

    .line 126
    invoke-interface {v1, v5}, Lcom/google/android/gms/internal/ads/zzagb;->zzf(I)V

    .line 127
    .line 128
    .line 129
    iput v4, v0, Lcom/google/android/gms/internal/ads/zzaiq;->zzj:I

    .line 130
    .line 131
    iput v4, v0, Lcom/google/android/gms/internal/ads/zzaiq;->zzg:I

    .line 132
    .line 133
    goto :goto_0

    .line 134
    :cond_8
    iget v5, v0, Lcom/google/android/gms/internal/ads/zzaiq;->zzj:I

    .line 135
    .line 136
    if-nez v5, :cond_a

    .line 137
    .line 138
    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzaiq;->zza:Lcom/google/android/gms/internal/ads/zzeu;

    .line 139
    .line 140
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 141
    .line 142
    .line 143
    move-result-object v9

    .line 144
    invoke-interface {v1, v9, v4, v8, v3}, Lcom/google/android/gms/internal/ads/zzagb;->zzb([BIIZ)Z

    .line 145
    .line 146
    .line 147
    move-result v9

    .line 148
    if-nez v9, :cond_9

    .line 149
    .line 150
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzaiq;->zzh()V

    .line 151
    .line 152
    .line 153
    return v6

    .line 154
    :cond_9
    iput v8, v0, Lcom/google/android/gms/internal/ads/zzaiq;->zzj:I

    .line 155
    .line 156
    invoke-virtual {v5, v4}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzeu;->zzz()J

    .line 160
    .line 161
    .line 162
    move-result-wide v9

    .line 163
    iput-wide v9, v0, Lcom/google/android/gms/internal/ads/zzaiq;->zzi:J

    .line 164
    .line 165
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzeu;->zzB()I

    .line 166
    .line 167
    .line 168
    move-result v5

    .line 169
    iput v5, v0, Lcom/google/android/gms/internal/ads/zzaiq;->zzh:I

    .line 170
    .line 171
    :cond_a
    iget-wide v5, v0, Lcom/google/android/gms/internal/ads/zzaiq;->zzi:J

    .line 172
    .line 173
    const-wide/16 v9, 0x1

    .line 174
    .line 175
    cmp-long v9, v5, v9

    .line 176
    .line 177
    if-nez v9, :cond_b

    .line 178
    .line 179
    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzaiq;->zza:Lcom/google/android/gms/internal/ads/zzeu;

    .line 180
    .line 181
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 182
    .line 183
    .line 184
    move-result-object v6

    .line 185
    invoke-interface {v1, v6, v8, v8}, Lcom/google/android/gms/internal/ads/zzagb;->zzc([BII)V

    .line 186
    .line 187
    .line 188
    iget v6, v0, Lcom/google/android/gms/internal/ads/zzaiq;->zzj:I

    .line 189
    .line 190
    add-int/2addr v6, v8

    .line 191
    iput v6, v0, Lcom/google/android/gms/internal/ads/zzaiq;->zzj:I

    .line 192
    .line 193
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ads/zzeu;->zzJ()J

    .line 194
    .line 195
    .line 196
    move-result-wide v5

    .line 197
    iput-wide v5, v0, Lcom/google/android/gms/internal/ads/zzaiq;->zzi:J

    .line 198
    .line 199
    :cond_b
    iget v8, v0, Lcom/google/android/gms/internal/ads/zzaiq;->zzh:I

    .line 200
    .line 201
    const v9, 0x6d707664

    .line 202
    .line 203
    .line 204
    if-ne v8, v9, :cond_c

    .line 205
    .line 206
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzagb;->zzn()J

    .line 207
    .line 208
    .line 209
    move-result-wide v8

    .line 210
    iput-wide v8, v0, Lcom/google/android/gms/internal/ads/zzaiq;->zzk:J

    .line 211
    .line 212
    iget v10, v0, Lcom/google/android/gms/internal/ads/zzaiq;->zzj:I

    .line 213
    .line 214
    int-to-long v10, v10

    .line 215
    sub-long v13, v8, v10

    .line 216
    .line 217
    sub-long v19, v5, v10

    .line 218
    .line 219
    new-instance v10, Lcom/google/android/gms/internal/ads/zzajb;

    .line 220
    .line 221
    const-wide/16 v11, 0x0

    .line 222
    .line 223
    const-wide v15, -0x7fffffffffffffffL    # -4.9E-324

    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    move-wide/from16 v17, v8

    .line 229
    .line 230
    invoke-direct/range {v10 .. v20}, Lcom/google/android/gms/internal/ads/zzajb;-><init>(JJJJJ)V

    .line 231
    .line 232
    .line 233
    iput-object v10, v0, Lcom/google/android/gms/internal/ads/zzaiq;->zzc:Lcom/google/android/gms/internal/ads/zzajb;

    .line 234
    .line 235
    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzaiq;->zzb:Lcom/google/android/gms/internal/ads/zzagd;

    .line 236
    .line 237
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 238
    .line 239
    .line 240
    const/16 v6, 0x400

    .line 241
    .line 242
    const/4 v8, 0x4

    .line 243
    invoke-interface {v5, v6, v8}, Lcom/google/android/gms/internal/ads/zzagd;->zzs(II)Lcom/google/android/gms/internal/ads/zzahm;

    .line 244
    .line 245
    .line 246
    move-result-object v5

    .line 247
    new-instance v6, Lcom/google/android/gms/internal/ads/zzt;

    .line 248
    .line 249
    invoke-direct {v6}, Lcom/google/android/gms/internal/ads/zzt;-><init>()V

    .line 250
    .line 251
    .line 252
    const-string v8, "image/heic"

    .line 253
    .line 254
    invoke-virtual {v6, v8}, Lcom/google/android/gms/internal/ads/zzt;->zzn(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzt;

    .line 255
    .line 256
    .line 257
    new-instance v8, Lcom/google/android/gms/internal/ads/zzap;

    .line 258
    .line 259
    const-wide v11, -0x7fffffffffffffffL    # -4.9E-324

    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    new-array v9, v3, [Lcom/google/android/gms/internal/ads/zzao;

    .line 265
    .line 266
    aput-object v10, v9, v4

    .line 267
    .line 268
    invoke-direct {v8, v11, v12, v9}, Lcom/google/android/gms/internal/ads/zzap;-><init>(J[Lcom/google/android/gms/internal/ads/zzao;)V

    .line 269
    .line 270
    .line 271
    invoke-virtual {v6, v8}, Lcom/google/android/gms/internal/ads/zzt;->zzl(Lcom/google/android/gms/internal/ads/zzap;)Lcom/google/android/gms/internal/ads/zzt;

    .line 272
    .line 273
    .line 274
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzt;->zzP()Lcom/google/android/gms/internal/ads/zzv;

    .line 275
    .line 276
    .line 277
    move-result-object v6

    .line 278
    invoke-interface {v5, v6}, Lcom/google/android/gms/internal/ads/zzahm;->zzA(Lcom/google/android/gms/internal/ads/zzv;)V

    .line 279
    .line 280
    .line 281
    iput v7, v0, Lcom/google/android/gms/internal/ads/zzaiq;->zzg:I

    .line 282
    .line 283
    goto/16 :goto_0

    .line 284
    .line 285
    :cond_c
    iput v3, v0, Lcom/google/android/gms/internal/ads/zzaiq;->zzg:I

    .line 286
    .line 287
    goto/16 :goto_0
.end method

.method public final zze(JJ)V
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzaiq;->zzg:I

    .line 9
    .line 10
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzaiq;->zzj:I

    .line 11
    .line 12
    const-wide/16 p1, -0x1

    .line 13
    .line 14
    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzaiq;->zzk:J

    .line 15
    .line 16
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzaiq;->zzf:Lcom/google/android/gms/internal/ads/zzami;

    .line 17
    .line 18
    if-eqz p1, :cond_1

    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaiq;->zzf:Lcom/google/android/gms/internal/ads/zzami;

    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzaiq;->zzg:I

    .line 25
    .line 26
    const/4 v1, 0x3

    .line 27
    if-ne v0, v1, :cond_1

    .line 28
    .line 29
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaiq;->zzf:Lcom/google/android/gms/internal/ads/zzami;

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/ads/zzami;->zze(JJ)V

    .line 35
    .line 36
    .line 37
    :cond_1
    return-void
.end method

.method public final zzf()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaiq;->zzf:Lcom/google/android/gms/internal/ads/zzami;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzaiq;->zzf:Lcom/google/android/gms/internal/ads/zzami;

    :cond_0
    return-void
.end method

.method public final synthetic zzg()Lcom/google/android/gms/internal/ads/zzaga;
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/f;->b(Lcom/google/android/gms/internal/ads/zzaga;)Lcom/google/android/gms/internal/ads/zzaga;

    move-result-object v0

    return-object v0
.end method
