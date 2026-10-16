.class final Lcom/google/android/gms/internal/ads/zzakz;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzaky;


# instance fields
.field private final zza:[J

.field private final zzb:[J

.field private final zzc:J

.field private final zzd:J

.field private final zze:I


# direct methods
.method private constructor <init>([J[JJJJI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzakz;->zza:[J

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzakz;->zzb:[J

    iput-wide p3, p0, Lcom/google/android/gms/internal/ads/zzakz;->zzc:J

    iput-wide p7, p0, Lcom/google/android/gms/internal/ads/zzakz;->zzd:J

    iput p9, p0, Lcom/google/android/gms/internal/ads/zzakz;->zze:I

    return-void
.end method

.method public static zze(JJLcom/google/android/gms/internal/ads/zzagx;Lcom/google/android/gms/internal/ads/zzeu;)Lcom/google/android/gms/internal/ads/zzakz;
    .locals 25

    .line 1
    move-wide/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v2, p4

    .line 4
    .line 5
    move-object/from16 v3, p5

    .line 6
    .line 7
    const/4 v4, 0x6

    .line 8
    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ads/zzeu;->zzk(I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzB()I

    .line 12
    .line 13
    .line 14
    move-result v4

    .line 15
    iget v5, v2, Lcom/google/android/gms/internal/ads/zzagx;->zzc:I

    .line 16
    .line 17
    int-to-long v5, v5

    .line 18
    int-to-long v7, v4

    .line 19
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzB()I

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    if-gtz v4, :cond_0

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_0
    iget v9, v2, Lcom/google/android/gms/internal/ads/zzagx;->zzd:I

    .line 27
    .line 28
    iget v10, v2, Lcom/google/android/gms/internal/ads/zzagx;->zzg:I

    .line 29
    .line 30
    int-to-long v10, v10

    .line 31
    int-to-long v12, v4

    .line 32
    mul-long/2addr v12, v10

    .line 33
    const-wide/16 v10, -0x1

    .line 34
    .line 35
    add-long/2addr v12, v10

    .line 36
    invoke-static {v12, v13, v9}, Lcom/google/android/gms/internal/ads/zzfm;->zzu(JI)J

    .line 37
    .line 38
    .line 39
    move-result-wide v17

    .line 40
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzt()I

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzt()I

    .line 45
    .line 46
    .line 47
    move-result v9

    .line 48
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzt()I

    .line 49
    .line 50
    .line 51
    move-result v12

    .line 52
    const/4 v13, 0x2

    .line 53
    invoke-virtual {v3, v13}, Lcom/google/android/gms/internal/ads/zzeu;->zzk(I)V

    .line 54
    .line 55
    .line 56
    iget v14, v2, Lcom/google/android/gms/internal/ads/zzagx;->zzc:I

    .line 57
    .line 58
    int-to-long v14, v14

    .line 59
    add-long v14, p2, v14

    .line 60
    .line 61
    move-wide/from16 v19, v14

    .line 62
    .line 63
    new-array v15, v4, [J

    .line 64
    .line 65
    new-array v14, v4, [J

    .line 66
    .line 67
    const/16 v16, 0x0

    .line 68
    .line 69
    move-wide/from16 v21, v10

    .line 70
    .line 71
    move/from16 v13, v16

    .line 72
    .line 73
    move-wide/from16 v10, v19

    .line 74
    .line 75
    :goto_0
    if-ge v13, v4, :cond_5

    .line 76
    .line 77
    move-wide/from16 v19, v5

    .line 78
    .line 79
    int-to-long v5, v13

    .line 80
    mul-long v5, v5, v17

    .line 81
    .line 82
    move-wide/from16 v23, v5

    .line 83
    .line 84
    int-to-long v5, v4

    .line 85
    div-long v5, v23, v5

    .line 86
    .line 87
    aput-wide v5, v15, v13

    .line 88
    .line 89
    aput-wide v10, v14, v13

    .line 90
    .line 91
    const/4 v5, 0x1

    .line 92
    if-eq v12, v5, :cond_4

    .line 93
    .line 94
    const/4 v5, 0x2

    .line 95
    if-eq v12, v5, :cond_3

    .line 96
    .line 97
    const/4 v6, 0x3

    .line 98
    if-eq v12, v6, :cond_2

    .line 99
    .line 100
    const/4 v6, 0x4

    .line 101
    if-eq v12, v6, :cond_1

    .line 102
    .line 103
    :goto_1
    const/4 v0, 0x0

    .line 104
    return-object v0

    .line 105
    :cond_1
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzH()I

    .line 106
    .line 107
    .line 108
    move-result v6

    .line 109
    :goto_2
    move/from16 v16, v4

    .line 110
    .line 111
    goto :goto_3

    .line 112
    :cond_2
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzx()I

    .line 113
    .line 114
    .line 115
    move-result v6

    .line 116
    goto :goto_2

    .line 117
    :cond_3
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzt()I

    .line 118
    .line 119
    .line 120
    move-result v6

    .line 121
    goto :goto_2

    .line 122
    :cond_4
    const/4 v5, 0x2

    .line 123
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzeu;->zzs()I

    .line 124
    .line 125
    .line 126
    move-result v6

    .line 127
    goto :goto_2

    .line 128
    :goto_3
    int-to-long v3, v9

    .line 129
    int-to-long v5, v6

    .line 130
    mul-long/2addr v5, v3

    .line 131
    add-long/2addr v10, v5

    .line 132
    add-int/lit8 v13, v13, 0x1

    .line 133
    .line 134
    move-object/from16 v3, p5

    .line 135
    .line 136
    move/from16 v4, v16

    .line 137
    .line 138
    move-wide/from16 v5, v19

    .line 139
    .line 140
    goto :goto_0

    .line 141
    :cond_5
    move-wide/from16 v19, v5

    .line 142
    .line 143
    add-long v19, p2, v19

    .line 144
    .line 145
    add-long v7, v19, v7

    .line 146
    .line 147
    cmp-long v3, v0, v21

    .line 148
    .line 149
    const-string v4, "VbriSeeker"

    .line 150
    .line 151
    const-string v5, ", "

    .line 152
    .line 153
    if-eqz v3, :cond_6

    .line 154
    .line 155
    cmp-long v3, v0, v7

    .line 156
    .line 157
    if-eqz v3, :cond_6

    .line 158
    .line 159
    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v3

    .line 163
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 164
    .line 165
    .line 166
    move-result v3

    .line 167
    invoke-static {v7, v8}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v6

    .line 171
    add-int/lit8 v3, v3, 0x1b

    .line 172
    .line 173
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 174
    .line 175
    .line 176
    move-result v6

    .line 177
    new-instance v9, Ljava/lang/StringBuilder;

    .line 178
    .line 179
    add-int/2addr v3, v6

    .line 180
    invoke-direct {v9, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 181
    .line 182
    .line 183
    const-string v3, "VBRI data size mismatch: "

    .line 184
    .line 185
    invoke-static {v9, v3, v0, v1, v5}, LVa/M6;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v9, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    invoke-static {v4, v0}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    :cond_6
    cmp-long v0, v7, v10

    .line 199
    .line 200
    if-eqz v0, :cond_7

    .line 201
    .line 202
    invoke-static {v7, v8}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 207
    .line 208
    .line 209
    move-result v0

    .line 210
    invoke-static {v10, v11}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v1

    .line 214
    add-int/lit8 v0, v0, 0x2b

    .line 215
    .line 216
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 217
    .line 218
    .line 219
    move-result v1

    .line 220
    add-int/2addr v1, v0

    .line 221
    new-instance v0, Ljava/lang/StringBuilder;

    .line 222
    .line 223
    add-int/lit8 v1, v1, 0x1c

    .line 224
    .line 225
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 226
    .line 227
    .line 228
    const-string v1, "VBRI bytes and ToC mismatch (using max): "

    .line 229
    .line 230
    invoke-static {v0, v1, v7, v8, v5}, LVa/M6;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v0, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 234
    .line 235
    .line 236
    const-string v1, "\nSeeking will be inaccurate."

    .line 237
    .line 238
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 239
    .line 240
    .line 241
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object v0

    .line 245
    invoke-static {v4, v0}, Lcom/google/android/gms/internal/ads/zzeh;->zzc(Ljava/lang/String;Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    invoke-static {v7, v8, v10, v11}, Ljava/lang/Math;->max(JJ)J

    .line 249
    .line 250
    .line 251
    move-result-wide v7

    .line 252
    :cond_7
    move-wide/from16 v21, v7

    .line 253
    .line 254
    move-object/from16 v16, v14

    .line 255
    .line 256
    new-instance v14, Lcom/google/android/gms/internal/ads/zzakz;

    .line 257
    .line 258
    iget v0, v2, Lcom/google/android/gms/internal/ads/zzagx;->zzf:I

    .line 259
    .line 260
    move/from16 v23, v0

    .line 261
    .line 262
    invoke-direct/range {v14 .. v23}, Lcom/google/android/gms/internal/ads/zzakz;-><init>([J[JJJJI)V

    .line 263
    .line 264
    .line 265
    return-object v14
.end method


# virtual methods
.method public final zza()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzakz;->zzc:J

    return-wide v0
.end method

.method public final zzb()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final zzc(J)Lcom/google/android/gms/internal/ads/zzahb;
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzakz;->zza:[J

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {v0, p1, p2, v1, v1}, Lcom/google/android/gms/internal/ads/zzfm;->zzo([JJZZ)I

    .line 5
    .line 6
    .line 7
    move-result v2

    .line 8
    new-instance v3, Lcom/google/android/gms/internal/ads/zzahe;

    .line 9
    .line 10
    aget-wide v4, v0, v2

    .line 11
    .line 12
    iget-object v6, p0, Lcom/google/android/gms/internal/ads/zzakz;->zzb:[J

    .line 13
    .line 14
    aget-wide v7, v6, v2

    .line 15
    .line 16
    invoke-direct {v3, v4, v5, v7, v8}, Lcom/google/android/gms/internal/ads/zzahe;-><init>(JJ)V

    .line 17
    .line 18
    .line 19
    iget-wide v4, v3, Lcom/google/android/gms/internal/ads/zzahe;->zzb:J

    .line 20
    .line 21
    cmp-long p1, v4, p1

    .line 22
    .line 23
    if-gez p1, :cond_1

    .line 24
    .line 25
    array-length p1, v0

    .line 26
    add-int/lit8 p1, p1, -0x1

    .line 27
    .line 28
    if-ne v2, p1, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    add-int/2addr v2, v1

    .line 32
    new-instance p1, Lcom/google/android/gms/internal/ads/zzahe;

    .line 33
    .line 34
    aget-wide v4, v0, v2

    .line 35
    .line 36
    aget-wide v0, v6, v2

    .line 37
    .line 38
    invoke-direct {p1, v4, v5, v0, v1}, Lcom/google/android/gms/internal/ads/zzahe;-><init>(JJ)V

    .line 39
    .line 40
    .line 41
    new-instance p2, Lcom/google/android/gms/internal/ads/zzahb;

    .line 42
    .line 43
    invoke-direct {p2, v3, p1}, Lcom/google/android/gms/internal/ads/zzahb;-><init>(Lcom/google/android/gms/internal/ads/zzahe;Lcom/google/android/gms/internal/ads/zzahe;)V

    .line 44
    .line 45
    .line 46
    return-object p2

    .line 47
    :cond_1
    :goto_0
    new-instance p1, Lcom/google/android/gms/internal/ads/zzahb;

    .line 48
    .line 49
    invoke-direct {p1, v3, v3}, Lcom/google/android/gms/internal/ads/zzahb;-><init>(Lcom/google/android/gms/internal/ads/zzahe;Lcom/google/android/gms/internal/ads/zzahe;)V

    .line 50
    .line 51
    .line 52
    return-object p1
.end method

.method public final zzf(J)J
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzakz;->zzb:[J

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzakz;->zza:[J

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    invoke-static {v0, p1, p2, v2, v2}, Lcom/google/android/gms/internal/ads/zzfm;->zzo([JJZZ)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    aget-wide p1, v1, p1

    .line 11
    .line 12
    return-wide p1
.end method

.method public final zzg()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzakz;->zzd:J

    return-wide v0
.end method

.method public final zzh()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzakz;->zze:I

    return v0
.end method

.method public final synthetic zzj()Z
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/google/android/gms/internal/ads/h;->a(Lcom/google/android/gms/internal/ads/zzahd;)Z

    move-result v0

    return v0
.end method
