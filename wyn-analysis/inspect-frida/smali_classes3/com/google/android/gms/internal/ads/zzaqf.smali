.class public final Lcom/google/android/gms/internal/ads/zzaqf;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzaqa;


# static fields
.field private static final zza:[F


# instance fields
.field private final zzb:Lcom/google/android/gms/internal/ads/zzars;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzeu;

.field private final zzd:[Z

.field private final zze:Lcom/google/android/gms/internal/ads/zzaqd;

.field private final zzf:Lcom/google/android/gms/internal/ads/zzaqr;

.field private zzg:Lcom/google/android/gms/internal/ads/zzaqe;

.field private zzh:J

.field private zzi:Ljava/lang/String;

.field private zzj:Lcom/google/android/gms/internal/ads/zzahm;

.field private zzk:Z

.field private zzl:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x7

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    sput-object v0, Lcom/google/android/gms/internal/ads/zzaqf;->zza:[F

    return-void

    nop

    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f8ba2e9
        0x3f68ba2f
        0x3fba2e8c
        0x3f9b26ca
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzars;Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaqf;->zzb:Lcom/google/android/gms/internal/ads/zzars;

    .line 5
    .line 6
    const/4 p1, 0x4

    .line 7
    new-array p1, p1, [Z

    .line 8
    .line 9
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaqf;->zzd:[Z

    .line 10
    .line 11
    new-instance p1, Lcom/google/android/gms/internal/ads/zzaqd;

    .line 12
    .line 13
    const/16 p2, 0x80

    .line 14
    .line 15
    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/ads/zzaqd;-><init>(I)V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaqf;->zze:Lcom/google/android/gms/internal/ads/zzaqd;

    .line 19
    .line 20
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzaqf;->zzl:J

    .line 26
    .line 27
    new-instance p1, Lcom/google/android/gms/internal/ads/zzaqr;

    .line 28
    .line 29
    const/16 v0, 0xb2

    .line 30
    .line 31
    invoke-direct {p1, v0, p2}, Lcom/google/android/gms/internal/ads/zzaqr;-><init>(II)V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaqf;->zzf:Lcom/google/android/gms/internal/ads/zzaqr;

    .line 35
    .line 36
    new-instance p1, Lcom/google/android/gms/internal/ads/zzeu;

    .line 37
    .line 38
    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzeu;-><init>()V

    .line 39
    .line 40
    .line 41
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaqf;->zzc:Lcom/google/android/gms/internal/ads/zzeu;

    .line 42
    .line 43
    return-void
.end method


# virtual methods
.method public final zza()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaqf;->zzd:[Z

    .line 2
    .line 3
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzgr;->zzj([Z)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaqf;->zze:Lcom/google/android/gms/internal/ads/zzaqd;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzaqd;->zza()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaqf;->zzg:Lcom/google/android/gms/internal/ads/zzaqe;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzaqe;->zza()V

    .line 16
    .line 17
    .line 18
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaqf;->zzf:Lcom/google/android/gms/internal/ads/zzaqr;

    .line 19
    .line 20
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzaqr;->zza()V

    .line 21
    .line 22
    .line 23
    const-wide/16 v0, 0x0

    .line 24
    .line 25
    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzaqf;->zzh:J

    .line 26
    .line 27
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzaqf;->zzl:J

    .line 33
    .line 34
    return-void
.end method

.method public final zzb(Lcom/google/android/gms/internal/ads/zzagd;Lcom/google/android/gms/internal/ads/zzaro;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzaro;->zza()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzaro;->zzc()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzaqf;->zzi:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzaro;->zzb()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x2

    .line 15
    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/internal/ads/zzagd;->zzs(II)Lcom/google/android/gms/internal/ads/zzahm;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzaqf;->zzj:Lcom/google/android/gms/internal/ads/zzahm;

    .line 20
    .line 21
    new-instance v1, Lcom/google/android/gms/internal/ads/zzaqe;

    .line 22
    .line 23
    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/ads/zzaqe;-><init>(Lcom/google/android/gms/internal/ads/zzahm;)V

    .line 24
    .line 25
    .line 26
    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzaqf;->zzg:Lcom/google/android/gms/internal/ads/zzaqe;

    .line 27
    .line 28
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaqf;->zzb:Lcom/google/android/gms/internal/ads/zzars;

    .line 29
    .line 30
    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/zzars;->zza(Lcom/google/android/gms/internal/ads/zzagd;Lcom/google/android/gms/internal/ads/zzaro;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public final zzc(JI)V
    .locals 0

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzaqf;->zzl:J

    return-void
.end method

.method public final zzd(Lcom/google/android/gms/internal/ads/zzeu;)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v2, 0x3

    .line 4
    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzaqf;->zzg:Lcom/google/android/gms/internal/ads/zzaqe;

    .line 5
    .line 6
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzaqf;->zzj:Lcom/google/android/gms/internal/ads/zzahm;

    .line 10
    .line 11
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzeu;->zzg()I

    .line 15
    .line 16
    .line 17
    move-result v4

    .line 18
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzeu;->zze()I

    .line 19
    .line 20
    .line 21
    move-result v5

    .line 22
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 23
    .line 24
    .line 25
    move-result-object v6

    .line 26
    iget-wide v7, v0, Lcom/google/android/gms/internal/ads/zzaqf;->zzh:J

    .line 27
    .line 28
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzeu;->zzd()I

    .line 29
    .line 30
    .line 31
    move-result v9

    .line 32
    int-to-long v9, v9

    .line 33
    add-long/2addr v7, v9

    .line 34
    iput-wide v7, v0, Lcom/google/android/gms/internal/ads/zzaqf;->zzh:J

    .line 35
    .line 36
    iget-object v7, v0, Lcom/google/android/gms/internal/ads/zzaqf;->zzj:Lcom/google/android/gms/internal/ads/zzahm;

    .line 37
    .line 38
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/internal/ads/zzeu;->zzd()I

    .line 39
    .line 40
    .line 41
    move-result v8

    .line 42
    move-object/from16 v9, p1

    .line 43
    .line 44
    invoke-interface {v7, v9, v8}, Lcom/google/android/gms/internal/ads/zzahm;->zzc(Lcom/google/android/gms/internal/ads/zzeu;I)V

    .line 45
    .line 46
    .line 47
    :goto_0
    iget-object v7, v0, Lcom/google/android/gms/internal/ads/zzaqf;->zzd:[Z

    .line 48
    .line 49
    invoke-static {v6, v4, v5, v7}, Lcom/google/android/gms/internal/ads/zzgr;->zzi([BII[Z)I

    .line 50
    .line 51
    .line 52
    move-result v7

    .line 53
    if-ne v7, v5, :cond_1

    .line 54
    .line 55
    iget-boolean v1, v0, Lcom/google/android/gms/internal/ads/zzaqf;->zzk:Z

    .line 56
    .line 57
    if-nez v1, :cond_0

    .line 58
    .line 59
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzaqf;->zze:Lcom/google/android/gms/internal/ads/zzaqd;

    .line 60
    .line 61
    invoke-virtual {v1, v6, v4, v5}, Lcom/google/android/gms/internal/ads/zzaqd;->zzc([BII)V

    .line 62
    .line 63
    .line 64
    :cond_0
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzaqf;->zzg:Lcom/google/android/gms/internal/ads/zzaqe;

    .line 65
    .line 66
    invoke-virtual {v1, v6, v4, v5}, Lcom/google/android/gms/internal/ads/zzaqe;->zzc([BII)V

    .line 67
    .line 68
    .line 69
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzaqf;->zzf:Lcom/google/android/gms/internal/ads/zzaqr;

    .line 70
    .line 71
    invoke-virtual {v1, v6, v4, v5}, Lcom/google/android/gms/internal/ads/zzaqr;->zzd([BII)V

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :cond_1
    invoke-virtual {v9}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 76
    .line 77
    .line 78
    move-result-object v8

    .line 79
    add-int/lit8 v10, v7, 0x3

    .line 80
    .line 81
    aget-byte v8, v8, v10

    .line 82
    .line 83
    and-int/lit16 v8, v8, 0xff

    .line 84
    .line 85
    sub-int v11, v7, v4

    .line 86
    .line 87
    iget-boolean v12, v0, Lcom/google/android/gms/internal/ads/zzaqf;->zzk:Z

    .line 88
    .line 89
    if-nez v12, :cond_d

    .line 90
    .line 91
    if-lez v11, :cond_2

    .line 92
    .line 93
    iget-object v12, v0, Lcom/google/android/gms/internal/ads/zzaqf;->zze:Lcom/google/android/gms/internal/ads/zzaqd;

    .line 94
    .line 95
    invoke-virtual {v12, v6, v4, v7}, Lcom/google/android/gms/internal/ads/zzaqd;->zzc([BII)V

    .line 96
    .line 97
    .line 98
    :cond_2
    if-gez v11, :cond_3

    .line 99
    .line 100
    neg-int v12, v11

    .line 101
    goto :goto_1

    .line 102
    :cond_3
    const/4 v12, 0x0

    .line 103
    :goto_1
    iget-object v14, v0, Lcom/google/android/gms/internal/ads/zzaqf;->zze:Lcom/google/android/gms/internal/ads/zzaqd;

    .line 104
    .line 105
    invoke-virtual {v14, v8, v12}, Lcom/google/android/gms/internal/ads/zzaqd;->zzb(II)Z

    .line 106
    .line 107
    .line 108
    move-result v12

    .line 109
    if-eqz v12, :cond_d

    .line 110
    .line 111
    iget-object v12, v0, Lcom/google/android/gms/internal/ads/zzaqf;->zzj:Lcom/google/android/gms/internal/ads/zzahm;

    .line 112
    .line 113
    iget v15, v14, Lcom/google/android/gms/internal/ads/zzaqd;->zzb:I

    .line 114
    .line 115
    iget-object v13, v0, Lcom/google/android/gms/internal/ads/zzaqf;->zzi:Ljava/lang/String;

    .line 116
    .line 117
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    iget-object v3, v14, Lcom/google/android/gms/internal/ads/zzaqd;->zzc:[B

    .line 121
    .line 122
    iget v14, v14, Lcom/google/android/gms/internal/ads/zzaqd;->zza:I

    .line 123
    .line 124
    invoke-static {v3, v14}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 125
    .line 126
    .line 127
    move-result-object v3

    .line 128
    new-instance v14, Lcom/google/android/gms/internal/ads/zzet;

    .line 129
    .line 130
    array-length v1, v3

    .line 131
    invoke-direct {v14, v3, v1}, Lcom/google/android/gms/internal/ads/zzet;-><init>([BI)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v14, v15}, Lcom/google/android/gms/internal/ads/zzet;->zzo(I)V

    .line 135
    .line 136
    .line 137
    const/4 v1, 0x4

    .line 138
    invoke-virtual {v14, v1}, Lcom/google/android/gms/internal/ads/zzet;->zzo(I)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v14}, Lcom/google/android/gms/internal/ads/zzet;->zzg()V

    .line 142
    .line 143
    .line 144
    const/16 v15, 0x8

    .line 145
    .line 146
    invoke-virtual {v14, v15}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v14}, Lcom/google/android/gms/internal/ads/zzet;->zzi()Z

    .line 150
    .line 151
    .line 152
    move-result v18

    .line 153
    if-eqz v18, :cond_4

    .line 154
    .line 155
    invoke-virtual {v14, v1}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v14, v2}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 159
    .line 160
    .line 161
    :cond_4
    invoke-virtual {v14, v1}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 162
    .line 163
    .line 164
    move-result v1

    .line 165
    const/high16 v18, 0x3f800000    # 1.0f

    .line 166
    .line 167
    const-string v2, "Invalid aspect ratio"

    .line 168
    .line 169
    const-string v15, "H263Reader"

    .line 170
    .line 171
    move-object/from16 v19, v3

    .line 172
    .line 173
    const/16 v3, 0xf

    .line 174
    .line 175
    if-ne v1, v3, :cond_6

    .line 176
    .line 177
    const/16 v3, 0x8

    .line 178
    .line 179
    invoke-virtual {v14, v3}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 180
    .line 181
    .line 182
    move-result v1

    .line 183
    invoke-virtual {v14, v3}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 184
    .line 185
    .line 186
    move-result v3

    .line 187
    if-nez v3, :cond_5

    .line 188
    .line 189
    invoke-static {v15, v2}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    :goto_2
    move/from16 v1, v18

    .line 193
    .line 194
    goto :goto_3

    .line 195
    :cond_5
    int-to-float v1, v1

    .line 196
    int-to-float v2, v3

    .line 197
    div-float v18, v1, v2

    .line 198
    .line 199
    goto :goto_2

    .line 200
    :cond_6
    const/4 v3, 0x7

    .line 201
    if-ge v1, v3, :cond_7

    .line 202
    .line 203
    sget-object v2, Lcom/google/android/gms/internal/ads/zzaqf;->zza:[F

    .line 204
    .line 205
    aget v18, v2, v1

    .line 206
    .line 207
    goto :goto_2

    .line 208
    :cond_7
    invoke-static {v15, v2}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    goto :goto_2

    .line 212
    :goto_3
    invoke-virtual {v14}, Lcom/google/android/gms/internal/ads/zzet;->zzi()Z

    .line 213
    .line 214
    .line 215
    move-result v2

    .line 216
    if-eqz v2, :cond_8

    .line 217
    .line 218
    const/4 v2, 0x2

    .line 219
    invoke-virtual {v14, v2}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 220
    .line 221
    .line 222
    const/4 v2, 0x1

    .line 223
    invoke-virtual {v14, v2}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v14}, Lcom/google/android/gms/internal/ads/zzet;->zzi()Z

    .line 227
    .line 228
    .line 229
    move-result v2

    .line 230
    if-eqz v2, :cond_8

    .line 231
    .line 232
    const/16 v2, 0xf

    .line 233
    .line 234
    invoke-virtual {v14, v2}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {v14}, Lcom/google/android/gms/internal/ads/zzet;->zzg()V

    .line 238
    .line 239
    .line 240
    invoke-virtual {v14, v2}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v14}, Lcom/google/android/gms/internal/ads/zzet;->zzg()V

    .line 244
    .line 245
    .line 246
    invoke-virtual {v14, v2}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 247
    .line 248
    .line 249
    invoke-virtual {v14}, Lcom/google/android/gms/internal/ads/zzet;->zzg()V

    .line 250
    .line 251
    .line 252
    const/4 v3, 0x3

    .line 253
    invoke-virtual {v14, v3}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 254
    .line 255
    .line 256
    const/16 v3, 0xb

    .line 257
    .line 258
    invoke-virtual {v14, v3}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 259
    .line 260
    .line 261
    invoke-virtual {v14}, Lcom/google/android/gms/internal/ads/zzet;->zzg()V

    .line 262
    .line 263
    .line 264
    invoke-virtual {v14, v2}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v14}, Lcom/google/android/gms/internal/ads/zzet;->zzg()V

    .line 268
    .line 269
    .line 270
    :cond_8
    const/4 v2, 0x2

    .line 271
    invoke-virtual {v14, v2}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 272
    .line 273
    .line 274
    move-result v3

    .line 275
    if-eqz v3, :cond_9

    .line 276
    .line 277
    const-string v2, "Unhandled video object layer shape"

    .line 278
    .line 279
    invoke-static {v15, v2}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    .line 280
    .line 281
    .line 282
    :cond_9
    invoke-virtual {v14}, Lcom/google/android/gms/internal/ads/zzet;->zzg()V

    .line 283
    .line 284
    .line 285
    const/16 v2, 0x10

    .line 286
    .line 287
    invoke-virtual {v14, v2}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 288
    .line 289
    .line 290
    move-result v2

    .line 291
    invoke-virtual {v14}, Lcom/google/android/gms/internal/ads/zzet;->zzg()V

    .line 292
    .line 293
    .line 294
    invoke-virtual {v14}, Lcom/google/android/gms/internal/ads/zzet;->zzi()Z

    .line 295
    .line 296
    .line 297
    move-result v3

    .line 298
    if-eqz v3, :cond_c

    .line 299
    .line 300
    if-nez v2, :cond_a

    .line 301
    .line 302
    const-string v2, "Invalid vop_increment_time_resolution"

    .line 303
    .line 304
    invoke-static {v15, v2}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    .line 305
    .line 306
    .line 307
    goto :goto_5

    .line 308
    :cond_a
    add-int/lit8 v2, v2, -0x1

    .line 309
    .line 310
    const/4 v3, 0x0

    .line 311
    :goto_4
    if-lez v2, :cond_b

    .line 312
    .line 313
    const/16 v16, 0x1

    .line 314
    .line 315
    shr-int/lit8 v2, v2, 0x1

    .line 316
    .line 317
    add-int/lit8 v3, v3, 0x1

    .line 318
    .line 319
    goto :goto_4

    .line 320
    :cond_b
    invoke-virtual {v14, v3}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 321
    .line 322
    .line 323
    :cond_c
    :goto_5
    invoke-virtual {v14}, Lcom/google/android/gms/internal/ads/zzet;->zzg()V

    .line 324
    .line 325
    .line 326
    const/16 v2, 0xd

    .line 327
    .line 328
    invoke-virtual {v14, v2}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 329
    .line 330
    .line 331
    move-result v3

    .line 332
    invoke-virtual {v14}, Lcom/google/android/gms/internal/ads/zzet;->zzg()V

    .line 333
    .line 334
    .line 335
    invoke-virtual {v14, v2}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 336
    .line 337
    .line 338
    move-result v2

    .line 339
    invoke-virtual {v14}, Lcom/google/android/gms/internal/ads/zzet;->zzg()V

    .line 340
    .line 341
    .line 342
    invoke-virtual {v14}, Lcom/google/android/gms/internal/ads/zzet;->zzg()V

    .line 343
    .line 344
    .line 345
    new-instance v14, Lcom/google/android/gms/internal/ads/zzt;

    .line 346
    .line 347
    invoke-direct {v14}, Lcom/google/android/gms/internal/ads/zzt;-><init>()V

    .line 348
    .line 349
    .line 350
    invoke-virtual {v14, v13}, Lcom/google/android/gms/internal/ads/zzt;->zza(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzt;

    .line 351
    .line 352
    .line 353
    const-string v13, "video/mp2t"

    .line 354
    .line 355
    invoke-virtual {v14, v13}, Lcom/google/android/gms/internal/ads/zzt;->zzn(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzt;

    .line 356
    .line 357
    .line 358
    const-string v13, "video/mp4v-es"

    .line 359
    .line 360
    invoke-virtual {v14, v13}, Lcom/google/android/gms/internal/ads/zzt;->zzo(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzt;

    .line 361
    .line 362
    .line 363
    invoke-virtual {v14, v3}, Lcom/google/android/gms/internal/ads/zzt;->zzv(I)Lcom/google/android/gms/internal/ads/zzt;

    .line 364
    .line 365
    .line 366
    invoke-virtual {v14, v2}, Lcom/google/android/gms/internal/ads/zzt;->zzw(I)Lcom/google/android/gms/internal/ads/zzt;

    .line 367
    .line 368
    .line 369
    invoke-virtual {v14, v1}, Lcom/google/android/gms/internal/ads/zzt;->zzB(F)Lcom/google/android/gms/internal/ads/zzt;

    .line 370
    .line 371
    .line 372
    invoke-static/range {v19 .. v19}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 373
    .line 374
    .line 375
    move-result-object v1

    .line 376
    invoke-virtual {v14, v1}, Lcom/google/android/gms/internal/ads/zzt;->zzr(Ljava/util/List;)Lcom/google/android/gms/internal/ads/zzt;

    .line 377
    .line 378
    .line 379
    invoke-virtual {v14}, Lcom/google/android/gms/internal/ads/zzt;->zzP()Lcom/google/android/gms/internal/ads/zzv;

    .line 380
    .line 381
    .line 382
    move-result-object v1

    .line 383
    invoke-interface {v12, v1}, Lcom/google/android/gms/internal/ads/zzahm;->zzA(Lcom/google/android/gms/internal/ads/zzv;)V

    .line 384
    .line 385
    .line 386
    const/4 v2, 0x1

    .line 387
    iput-boolean v2, v0, Lcom/google/android/gms/internal/ads/zzaqf;->zzk:Z

    .line 388
    .line 389
    :cond_d
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzaqf;->zzg:Lcom/google/android/gms/internal/ads/zzaqe;

    .line 390
    .line 391
    invoke-virtual {v1, v6, v4, v7}, Lcom/google/android/gms/internal/ads/zzaqe;->zzc([BII)V

    .line 392
    .line 393
    .line 394
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzaqf;->zzf:Lcom/google/android/gms/internal/ads/zzaqr;

    .line 395
    .line 396
    if-lez v11, :cond_e

    .line 397
    .line 398
    invoke-virtual {v1, v6, v4, v7}, Lcom/google/android/gms/internal/ads/zzaqr;->zzd([BII)V

    .line 399
    .line 400
    .line 401
    const/4 v13, 0x0

    .line 402
    goto :goto_6

    .line 403
    :cond_e
    neg-int v13, v11

    .line 404
    :goto_6
    invoke-virtual {v1, v13}, Lcom/google/android/gms/internal/ads/zzaqr;->zze(I)Z

    .line 405
    .line 406
    .line 407
    move-result v2

    .line 408
    if-eqz v2, :cond_f

    .line 409
    .line 410
    iget-object v2, v1, Lcom/google/android/gms/internal/ads/zzaqr;->zza:[B

    .line 411
    .line 412
    iget v3, v1, Lcom/google/android/gms/internal/ads/zzaqr;->zzb:I

    .line 413
    .line 414
    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ads/zzgr;->zza([BI)I

    .line 415
    .line 416
    .line 417
    move-result v2

    .line 418
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzaqf;->zzc:Lcom/google/android/gms/internal/ads/zzeu;

    .line 419
    .line 420
    sget-object v4, Lcom/google/android/gms/internal/ads/zzfm;->zza:Ljava/lang/String;

    .line 421
    .line 422
    iget-object v4, v1, Lcom/google/android/gms/internal/ads/zzaqr;->zza:[B

    .line 423
    .line 424
    invoke-virtual {v3, v4, v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzb([BI)V

    .line 425
    .line 426
    .line 427
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzaqf;->zzb:Lcom/google/android/gms/internal/ads/zzars;

    .line 428
    .line 429
    iget-wide v11, v0, Lcom/google/android/gms/internal/ads/zzaqf;->zzl:J

    .line 430
    .line 431
    invoke-virtual {v2, v11, v12, v3}, Lcom/google/android/gms/internal/ads/zzars;->zzb(JLcom/google/android/gms/internal/ads/zzeu;)V

    .line 432
    .line 433
    .line 434
    :cond_f
    const/16 v2, 0xb2

    .line 435
    .line 436
    if-ne v8, v2, :cond_11

    .line 437
    .line 438
    invoke-virtual {v9}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 439
    .line 440
    .line 441
    move-result-object v3

    .line 442
    const/16 v17, 0x2

    .line 443
    .line 444
    add-int/lit8 v4, v7, 0x2

    .line 445
    .line 446
    aget-byte v3, v3, v4

    .line 447
    .line 448
    const/4 v4, 0x1

    .line 449
    if-ne v3, v4, :cond_10

    .line 450
    .line 451
    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/zzaqr;->zzc(I)V

    .line 452
    .line 453
    .line 454
    :cond_10
    move v8, v2

    .line 455
    goto :goto_7

    .line 456
    :cond_11
    const/4 v4, 0x1

    .line 457
    const/16 v17, 0x2

    .line 458
    .line 459
    :goto_7
    sub-int v1, v5, v7

    .line 460
    .line 461
    iget-wide v2, v0, Lcom/google/android/gms/internal/ads/zzaqf;->zzh:J

    .line 462
    .line 463
    int-to-long v11, v1

    .line 464
    sub-long/2addr v2, v11

    .line 465
    iget-object v7, v0, Lcom/google/android/gms/internal/ads/zzaqf;->zzg:Lcom/google/android/gms/internal/ads/zzaqe;

    .line 466
    .line 467
    iget-boolean v11, v0, Lcom/google/android/gms/internal/ads/zzaqf;->zzk:Z

    .line 468
    .line 469
    invoke-virtual {v7, v2, v3, v1, v11}, Lcom/google/android/gms/internal/ads/zzaqe;->zzd(JIZ)V

    .line 470
    .line 471
    .line 472
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzaqf;->zzg:Lcom/google/android/gms/internal/ads/zzaqe;

    .line 473
    .line 474
    iget-wide v2, v0, Lcom/google/android/gms/internal/ads/zzaqf;->zzl:J

    .line 475
    .line 476
    invoke-virtual {v1, v8, v2, v3}, Lcom/google/android/gms/internal/ads/zzaqe;->zzb(IJ)V

    .line 477
    .line 478
    .line 479
    move v4, v10

    .line 480
    const/4 v2, 0x3

    .line 481
    goto/16 :goto_0
.end method

.method public final zze(Z)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaqf;->zzg:Lcom/google/android/gms/internal/ads/zzaqe;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    iget-wide v1, p0, Lcom/google/android/gms/internal/ads/zzaqf;->zzh:J

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    iget-boolean v3, p0, Lcom/google/android/gms/internal/ads/zzaqf;->zzk:Z

    .line 12
    .line 13
    invoke-virtual {v0, v1, v2, p1, v3}, Lcom/google/android/gms/internal/ads/zzaqe;->zzd(JIZ)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzaqf;->zzg:Lcom/google/android/gms/internal/ads/zzaqe;

    .line 17
    .line 18
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzaqe;->zza()V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method
