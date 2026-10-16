.class abstract Lcom/google/android/gms/internal/ads/zzang;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzana;

.field private zzb:Lcom/google/android/gms/internal/ads/zzahm;

.field private zzc:Lcom/google/android/gms/internal/ads/zzagd;

.field private zzd:Lcom/google/android/gms/internal/ads/zzanc;

.field private zze:J

.field private zzf:J

.field private zzg:J

.field private zzh:I

.field private zzi:I

.field private zzj:Lcom/google/android/gms/internal/ads/zzane;

.field private zzk:J

.field private zzl:Z

.field private zzm:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/google/android/gms/internal/ads/zzana;

    .line 5
    .line 6
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzana;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzang;->zza:Lcom/google/android/gms/internal/ads/zzana;

    .line 10
    .line 11
    new-instance v0, Lcom/google/android/gms/internal/ads/zzane;

    .line 12
    .line 13
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzane;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzang;->zzj:Lcom/google/android/gms/internal/ads/zzane;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public zza(Z)V
    .locals 4

    const-wide/16 v0, 0x0

    if-eqz p1, :cond_0

    new-instance p1, Lcom/google/android/gms/internal/ads/zzane;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzane;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzang;->zzj:Lcom/google/android/gms/internal/ads/zzane;

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzang;->zzf:J

    const/4 p1, 0x0

    :goto_0
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzang;->zzh:I

    goto :goto_1

    :cond_0
    const/4 p1, 0x1

    goto :goto_0

    :goto_1
    const-wide/16 v2, -0x1

    iput-wide v2, p0, Lcom/google/android/gms/internal/ads/zzang;->zze:J

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzang;->zzg:J

    return-void
.end method

.method public abstract zzb(Lcom/google/android/gms/internal/ads/zzeu;)J
.end method

.method public abstract zzc(Lcom/google/android/gms/internal/ads/zzeu;JLcom/google/android/gms/internal/ads/zzane;)Z
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public final zze(Lcom/google/android/gms/internal/ads/zzagd;Lcom/google/android/gms/internal/ads/zzahm;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzang;->zzc:Lcom/google/android/gms/internal/ads/zzagd;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzang;->zzb:Lcom/google/android/gms/internal/ads/zzahm;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/zzang;->zza(Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final zzf(JJ)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzang;->zza:Lcom/google/android/gms/internal/ads/zzana;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzana;->zza()V

    .line 4
    .line 5
    .line 6
    const-wide/16 v0, 0x0

    .line 7
    .line 8
    cmp-long p1, p1, v0

    .line 9
    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    iget-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzang;->zzl:Z

    .line 13
    .line 14
    xor-int/lit8 p1, p1, 0x1

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/zzang;->zza(Z)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    iget p1, p0, Lcom/google/android/gms/internal/ads/zzang;->zzh:I

    .line 21
    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    invoke-virtual {p0, p3, p4}, Lcom/google/android/gms/internal/ads/zzang;->zzi(J)J

    .line 25
    .line 26
    .line 27
    move-result-wide p1

    .line 28
    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzang;->zze:J

    .line 29
    .line 30
    iget-object p3, p0, Lcom/google/android/gms/internal/ads/zzang;->zzd:Lcom/google/android/gms/internal/ads/zzanc;

    .line 31
    .line 32
    sget-object p4, Lcom/google/android/gms/internal/ads/zzfm;->zza:Ljava/lang/String;

    .line 33
    .line 34
    invoke-interface {p3, p1, p2}, Lcom/google/android/gms/internal/ads/zzanc;->zzb(J)V

    .line 35
    .line 36
    .line 37
    const/4 p1, 0x2

    .line 38
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzang;->zzh:I

    .line 39
    .line 40
    :cond_1
    return-void
.end method

.method public final zzg(Lcom/google/android/gms/internal/ads/zzagb;Lcom/google/android/gms/internal/ads/zzaha;)I
    .locals 20
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzang;->zzb:Lcom/google/android/gms/internal/ads/zzahm;

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    sget-object v2, Lcom/google/android/gms/internal/ads/zzfm;->zza:Ljava/lang/String;

    .line 11
    .line 12
    iget v2, v1, Lcom/google/android/gms/internal/ads/zzang;->zzh:I

    .line 13
    .line 14
    const/4 v3, 0x3

    .line 15
    const-wide/16 v4, -0x1

    .line 16
    .line 17
    const/4 v6, -0x1

    .line 18
    const/4 v11, 0x2

    .line 19
    const/4 v12, 0x0

    .line 20
    const/4 v7, 0x1

    .line 21
    if-eqz v2, :cond_8

    .line 22
    .line 23
    if-eq v2, v7, :cond_7

    .line 24
    .line 25
    if-eq v2, v11, :cond_0

    .line 26
    .line 27
    return v6

    .line 28
    :cond_0
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzang;->zzd:Lcom/google/android/gms/internal/ads/zzanc;

    .line 29
    .line 30
    invoke-interface {v2, v0}, Lcom/google/android/gms/internal/ads/zzanc;->zza(Lcom/google/android/gms/internal/ads/zzagb;)J

    .line 31
    .line 32
    .line 33
    move-result-wide v8

    .line 34
    const-wide/16 v10, 0x0

    .line 35
    .line 36
    cmp-long v2, v8, v10

    .line 37
    .line 38
    if-ltz v2, :cond_1

    .line 39
    .line 40
    move-object/from16 v2, p2

    .line 41
    .line 42
    iput-wide v8, v2, Lcom/google/android/gms/internal/ads/zzaha;->zza:J

    .line 43
    .line 44
    return v7

    .line 45
    :cond_1
    cmp-long v2, v8, v4

    .line 46
    .line 47
    if-gez v2, :cond_2

    .line 48
    .line 49
    const-wide/16 v13, 0x2

    .line 50
    .line 51
    add-long/2addr v8, v13

    .line 52
    neg-long v8, v8

    .line 53
    invoke-virtual {v1, v8, v9}, Lcom/google/android/gms/internal/ads/zzang;->zzj(J)V

    .line 54
    .line 55
    .line 56
    :cond_2
    iget-boolean v2, v1, Lcom/google/android/gms/internal/ads/zzang;->zzl:Z

    .line 57
    .line 58
    if-nez v2, :cond_3

    .line 59
    .line 60
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzang;->zzd:Lcom/google/android/gms/internal/ads/zzanc;

    .line 61
    .line 62
    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/zzanc;->zzc()Lcom/google/android/gms/internal/ads/zzahd;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    iget-object v8, v1, Lcom/google/android/gms/internal/ads/zzang;->zzc:Lcom/google/android/gms/internal/ads/zzagd;

    .line 70
    .line 71
    invoke-interface {v8, v2}, Lcom/google/android/gms/internal/ads/zzagd;->zzw(Lcom/google/android/gms/internal/ads/zzahd;)V

    .line 72
    .line 73
    .line 74
    iget-object v8, v1, Lcom/google/android/gms/internal/ads/zzang;->zzb:Lcom/google/android/gms/internal/ads/zzahm;

    .line 75
    .line 76
    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/zzahd;->zza()J

    .line 77
    .line 78
    .line 79
    move-result-wide v13

    .line 80
    invoke-interface {v8, v13, v14}, Lcom/google/android/gms/internal/ads/zzahm;->zzP(J)V

    .line 81
    .line 82
    .line 83
    iput-boolean v7, v1, Lcom/google/android/gms/internal/ads/zzang;->zzl:Z

    .line 84
    .line 85
    :cond_3
    iget-wide v7, v1, Lcom/google/android/gms/internal/ads/zzang;->zzk:J

    .line 86
    .line 87
    cmp-long v2, v7, v10

    .line 88
    .line 89
    if-gtz v2, :cond_5

    .line 90
    .line 91
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzang;->zza:Lcom/google/android/gms/internal/ads/zzana;

    .line 92
    .line 93
    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/ads/zzana;->zzb(Lcom/google/android/gms/internal/ads/zzagb;)Z

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    if-eqz v0, :cond_4

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_4
    iput v3, v1, Lcom/google/android/gms/internal/ads/zzang;->zzh:I

    .line 101
    .line 102
    return v6

    .line 103
    :cond_5
    :goto_0
    iput-wide v10, v1, Lcom/google/android/gms/internal/ads/zzang;->zzk:J

    .line 104
    .line 105
    iget-object v0, v1, Lcom/google/android/gms/internal/ads/zzang;->zza:Lcom/google/android/gms/internal/ads/zzana;

    .line 106
    .line 107
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzana;->zzd()Lcom/google/android/gms/internal/ads/zzeu;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzang;->zzb(Lcom/google/android/gms/internal/ads/zzeu;)J

    .line 112
    .line 113
    .line 114
    move-result-wide v2

    .line 115
    cmp-long v6, v2, v10

    .line 116
    .line 117
    if-ltz v6, :cond_6

    .line 118
    .line 119
    iget-wide v6, v1, Lcom/google/android/gms/internal/ads/zzang;->zzg:J

    .line 120
    .line 121
    add-long v8, v6, v2

    .line 122
    .line 123
    iget-wide v10, v1, Lcom/google/android/gms/internal/ads/zzang;->zze:J

    .line 124
    .line 125
    cmp-long v8, v8, v10

    .line 126
    .line 127
    if-ltz v8, :cond_6

    .line 128
    .line 129
    invoke-virtual {v1, v6, v7}, Lcom/google/android/gms/internal/ads/zzang;->zzh(J)J

    .line 130
    .line 131
    .line 132
    move-result-wide v14

    .line 133
    iget-object v6, v1, Lcom/google/android/gms/internal/ads/zzang;->zzb:Lcom/google/android/gms/internal/ads/zzahm;

    .line 134
    .line 135
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zze()I

    .line 136
    .line 137
    .line 138
    move-result v7

    .line 139
    invoke-interface {v6, v0, v7}, Lcom/google/android/gms/internal/ads/zzahm;->zzc(Lcom/google/android/gms/internal/ads/zzeu;I)V

    .line 140
    .line 141
    .line 142
    iget-object v13, v1, Lcom/google/android/gms/internal/ads/zzang;->zzb:Lcom/google/android/gms/internal/ads/zzahm;

    .line 143
    .line 144
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zze()I

    .line 145
    .line 146
    .line 147
    move-result v17

    .line 148
    const/16 v18, 0x0

    .line 149
    .line 150
    const/16 v19, 0x0

    .line 151
    .line 152
    const/16 v16, 0x1

    .line 153
    .line 154
    invoke-interface/range {v13 .. v19}, Lcom/google/android/gms/internal/ads/zzahm;->zze(JIIILcom/google/android/gms/internal/ads/zzahl;)V

    .line 155
    .line 156
    .line 157
    iput-wide v4, v1, Lcom/google/android/gms/internal/ads/zzang;->zze:J

    .line 158
    .line 159
    :cond_6
    iget-wide v4, v1, Lcom/google/android/gms/internal/ads/zzang;->zzg:J

    .line 160
    .line 161
    add-long/2addr v4, v2

    .line 162
    iput-wide v4, v1, Lcom/google/android/gms/internal/ads/zzang;->zzg:J

    .line 163
    .line 164
    return v12

    .line 165
    :cond_7
    iget-wide v2, v1, Lcom/google/android/gms/internal/ads/zzang;->zzf:J

    .line 166
    .line 167
    long-to-int v2, v2

    .line 168
    invoke-interface {v0, v2}, Lcom/google/android/gms/internal/ads/zzagb;->zzf(I)V

    .line 169
    .line 170
    .line 171
    iput v11, v1, Lcom/google/android/gms/internal/ads/zzang;->zzh:I

    .line 172
    .line 173
    return v12

    .line 174
    :cond_8
    :goto_1
    iget-object v13, v1, Lcom/google/android/gms/internal/ads/zzang;->zza:Lcom/google/android/gms/internal/ads/zzana;

    .line 175
    .line 176
    invoke-virtual {v13, v0}, Lcom/google/android/gms/internal/ads/zzana;->zzb(Lcom/google/android/gms/internal/ads/zzagb;)Z

    .line 177
    .line 178
    .line 179
    move-result v2

    .line 180
    if-nez v2, :cond_9

    .line 181
    .line 182
    iput v3, v1, Lcom/google/android/gms/internal/ads/zzang;->zzh:I

    .line 183
    .line 184
    return v6

    .line 185
    :cond_9
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzagb;->zzn()J

    .line 186
    .line 187
    .line 188
    move-result-wide v8

    .line 189
    iget-wide v14, v1, Lcom/google/android/gms/internal/ads/zzang;->zzf:J

    .line 190
    .line 191
    sub-long/2addr v8, v14

    .line 192
    iput-wide v8, v1, Lcom/google/android/gms/internal/ads/zzang;->zzk:J

    .line 193
    .line 194
    invoke-virtual {v13}, Lcom/google/android/gms/internal/ads/zzana;->zzd()Lcom/google/android/gms/internal/ads/zzeu;

    .line 195
    .line 196
    .line 197
    move-result-object v2

    .line 198
    iget-object v8, v1, Lcom/google/android/gms/internal/ads/zzang;->zzj:Lcom/google/android/gms/internal/ads/zzane;

    .line 199
    .line 200
    invoke-virtual {v1, v2, v14, v15, v8}, Lcom/google/android/gms/internal/ads/zzang;->zzc(Lcom/google/android/gms/internal/ads/zzeu;JLcom/google/android/gms/internal/ads/zzane;)Z

    .line 201
    .line 202
    .line 203
    move-result v2

    .line 204
    if-eqz v2, :cond_a

    .line 205
    .line 206
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzagb;->zzn()J

    .line 207
    .line 208
    .line 209
    move-result-wide v8

    .line 210
    iput-wide v8, v1, Lcom/google/android/gms/internal/ads/zzang;->zzf:J

    .line 211
    .line 212
    goto :goto_1

    .line 213
    :cond_a
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzang;->zzj:Lcom/google/android/gms/internal/ads/zzane;

    .line 214
    .line 215
    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzane;->zza:Lcom/google/android/gms/internal/ads/zzv;

    .line 216
    .line 217
    iget v3, v2, Lcom/google/android/gms/internal/ads/zzv;->zzJ:I

    .line 218
    .line 219
    iput v3, v1, Lcom/google/android/gms/internal/ads/zzang;->zzi:I

    .line 220
    .line 221
    iget-boolean v3, v1, Lcom/google/android/gms/internal/ads/zzang;->zzm:Z

    .line 222
    .line 223
    if-nez v3, :cond_b

    .line 224
    .line 225
    iget-object v3, v1, Lcom/google/android/gms/internal/ads/zzang;->zzb:Lcom/google/android/gms/internal/ads/zzahm;

    .line 226
    .line 227
    invoke-interface {v3, v2}, Lcom/google/android/gms/internal/ads/zzahm;->zzA(Lcom/google/android/gms/internal/ads/zzv;)V

    .line 228
    .line 229
    .line 230
    iput-boolean v7, v1, Lcom/google/android/gms/internal/ads/zzang;->zzm:Z

    .line 231
    .line 232
    :cond_b
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzang;->zzj:Lcom/google/android/gms/internal/ads/zzane;

    .line 233
    .line 234
    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzane;->zzb:Lcom/google/android/gms/internal/ads/zzanc;

    .line 235
    .line 236
    if-eqz v2, :cond_c

    .line 237
    .line 238
    iput-object v2, v1, Lcom/google/android/gms/internal/ads/zzang;->zzd:Lcom/google/android/gms/internal/ads/zzanc;

    .line 239
    .line 240
    goto :goto_3

    .line 241
    :cond_c
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzagb;->zzo()J

    .line 242
    .line 243
    .line 244
    move-result-wide v2

    .line 245
    cmp-long v2, v2, v4

    .line 246
    .line 247
    if-nez v2, :cond_d

    .line 248
    .line 249
    new-instance v0, Lcom/google/android/gms/internal/ads/zzanf;

    .line 250
    .line 251
    const/4 v2, 0x0

    .line 252
    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/ads/zzanf;-><init>([B)V

    .line 253
    .line 254
    .line 255
    iput-object v0, v1, Lcom/google/android/gms/internal/ads/zzang;->zzd:Lcom/google/android/gms/internal/ads/zzanc;

    .line 256
    .line 257
    goto :goto_3

    .line 258
    :cond_d
    invoke-virtual {v13}, Lcom/google/android/gms/internal/ads/zzana;->zzc()Lcom/google/android/gms/internal/ads/zzanb;

    .line 259
    .line 260
    .line 261
    move-result-object v2

    .line 262
    iget v3, v2, Lcom/google/android/gms/internal/ads/zzanb;->zza:I

    .line 263
    .line 264
    and-int/lit8 v3, v3, 0x4

    .line 265
    .line 266
    if-eqz v3, :cond_e

    .line 267
    .line 268
    move v10, v7

    .line 269
    goto :goto_2

    .line 270
    :cond_e
    move v10, v12

    .line 271
    :goto_2
    new-instance v0, Lcom/google/android/gms/internal/ads/zzamv;

    .line 272
    .line 273
    iget-wide v3, v1, Lcom/google/android/gms/internal/ads/zzang;->zzf:J

    .line 274
    .line 275
    invoke-interface/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzagb;->zzo()J

    .line 276
    .line 277
    .line 278
    move-result-wide v5

    .line 279
    iget v7, v2, Lcom/google/android/gms/internal/ads/zzanb;->zzd:I

    .line 280
    .line 281
    iget v8, v2, Lcom/google/android/gms/internal/ads/zzanb;->zze:I

    .line 282
    .line 283
    add-int/2addr v7, v8

    .line 284
    iget-wide v8, v2, Lcom/google/android/gms/internal/ads/zzanb;->zzb:J

    .line 285
    .line 286
    int-to-long v14, v7

    .line 287
    move-wide v2, v3

    .line 288
    move-wide v4, v5

    .line 289
    move-wide v6, v14

    .line 290
    invoke-direct/range {v0 .. v10}, Lcom/google/android/gms/internal/ads/zzamv;-><init>(Lcom/google/android/gms/internal/ads/zzang;JJJJZ)V

    .line 291
    .line 292
    .line 293
    iput-object v0, v1, Lcom/google/android/gms/internal/ads/zzang;->zzd:Lcom/google/android/gms/internal/ads/zzanc;

    .line 294
    .line 295
    :goto_3
    iput v11, v1, Lcom/google/android/gms/internal/ads/zzang;->zzh:I

    .line 296
    .line 297
    invoke-virtual {v13}, Lcom/google/android/gms/internal/ads/zzana;->zze()V

    .line 298
    .line 299
    .line 300
    return v12
.end method

.method public final zzh(J)J
    .locals 4

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzang;->zzi:I

    .line 2
    .line 3
    int-to-long v0, v0

    .line 4
    const-wide/32 v2, 0xf4240

    .line 5
    .line 6
    .line 7
    mul-long/2addr p1, v2

    .line 8
    div-long/2addr p1, v0

    .line 9
    return-wide p1
.end method

.method public final zzi(J)J
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzang;->zzi:I

    int-to-long v0, v0

    mul-long/2addr v0, p1

    const-wide/32 p1, 0xf4240

    div-long/2addr v0, p1

    return-wide v0
.end method

.method public zzj(J)V
    .locals 0

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzang;->zzg:J

    return-void
.end method
