.class public final Lcom/google/android/gms/internal/ads/zzagi;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static zza(Lcom/google/android/gms/internal/ads/zzeu;Lcom/google/android/gms/internal/ads/zzagn;ILcom/google/android/gms/internal/ads/zzagh;)Z
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzg()I

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzz()J

    .line 12
    .line 13
    .line 14
    move-result-wide v4

    .line 15
    const/16 v6, 0x10

    .line 16
    .line 17
    ushr-long v6, v4, v6

    .line 18
    .line 19
    move/from16 v8, p2

    .line 20
    .line 21
    int-to-long v8, v8

    .line 22
    cmp-long v8, v6, v8

    .line 23
    .line 24
    const/4 v9, 0x0

    .line 25
    if-eqz v8, :cond_0

    .line 26
    .line 27
    return v9

    .line 28
    :cond_0
    const-wide/16 v10, 0x1

    .line 29
    .line 30
    and-long/2addr v6, v10

    .line 31
    cmp-long v6, v6, v10

    .line 32
    .line 33
    const/4 v7, 0x1

    .line 34
    if-nez v6, :cond_1

    .line 35
    .line 36
    move v6, v7

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    move v6, v9

    .line 39
    :goto_0
    const/16 v8, 0xc

    .line 40
    .line 41
    shr-long v12, v4, v8

    .line 42
    .line 43
    const/16 v14, 0x8

    .line 44
    .line 45
    shr-long v14, v4, v14

    .line 46
    .line 47
    const/16 v16, 0x4

    .line 48
    .line 49
    shr-long v16, v4, v16

    .line 50
    .line 51
    shr-long v18, v4, v7

    .line 52
    .line 53
    and-long/2addr v4, v10

    .line 54
    const-wide/16 v20, 0xf

    .line 55
    .line 56
    move-wide/from16 v22, v10

    .line 57
    .line 58
    and-long v10, v16, v20

    .line 59
    .line 60
    long-to-int v10, v10

    .line 61
    const/4 v11, 0x2

    .line 62
    move/from16 p2, v7

    .line 63
    .line 64
    const/4 v7, 0x7

    .line 65
    const/4 v9, -0x1

    .line 66
    if-gt v10, v7, :cond_3

    .line 67
    .line 68
    iget v7, v1, Lcom/google/android/gms/internal/ads/zzagn;->zzg:I

    .line 69
    .line 70
    add-int/2addr v7, v9

    .line 71
    if-ne v10, v7, :cond_2

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_2
    :goto_1
    const/16 v16, 0x0

    .line 75
    .line 76
    goto/16 :goto_7

    .line 77
    .line 78
    :cond_3
    const/16 v7, 0xa

    .line 79
    .line 80
    if-gt v10, v7, :cond_2

    .line 81
    .line 82
    iget v7, v1, Lcom/google/android/gms/internal/ads/zzagn;->zzg:I

    .line 83
    .line 84
    if-ne v7, v11, :cond_2

    .line 85
    .line 86
    :goto_2
    const-wide/16 v24, 0x7

    .line 87
    .line 88
    move-wide/from16 v26, v12

    .line 89
    .line 90
    and-long v11, v18, v24

    .line 91
    .line 92
    long-to-int v10, v11

    .line 93
    if-nez v10, :cond_4

    .line 94
    .line 95
    goto :goto_3

    .line 96
    :cond_4
    iget v11, v1, Lcom/google/android/gms/internal/ads/zzagn;->zzi:I

    .line 97
    .line 98
    if-ne v10, v11, :cond_2

    .line 99
    .line 100
    :goto_3
    cmp-long v4, v4, v22

    .line 101
    .line 102
    if-eqz v4, :cond_2

    .line 103
    .line 104
    invoke-static {v0, v1, v6, v2}, Lcom/google/android/gms/internal/ads/zzagi;->zzd(Lcom/google/android/gms/internal/ads/zzeu;Lcom/google/android/gms/internal/ads/zzagn;ZLcom/google/android/gms/internal/ads/zzagh;)Z

    .line 105
    .line 106
    .line 107
    move-result v4

    .line 108
    if-eqz v4, :cond_2

    .line 109
    .line 110
    and-long v4, v26, v20

    .line 111
    .line 112
    iget-wide v10, v2, Lcom/google/android/gms/internal/ads/zzagh;->zza:J

    .line 113
    .line 114
    long-to-int v2, v4

    .line 115
    invoke-static {v0, v2}, Lcom/google/android/gms/internal/ads/zzagi;->zzc(Lcom/google/android/gms/internal/ads/zzeu;I)I

    .line 116
    .line 117
    .line 118
    move-result v2

    .line 119
    iget-wide v4, v1, Lcom/google/android/gms/internal/ads/zzagn;->zzj:J

    .line 120
    .line 121
    const-wide/16 v12, 0x0

    .line 122
    .line 123
    cmp-long v6, v4, v12

    .line 124
    .line 125
    if-eqz v6, :cond_5

    .line 126
    .line 127
    int-to-long v12, v2

    .line 128
    add-long/2addr v10, v12

    .line 129
    cmp-long v4, v10, v4

    .line 130
    .line 131
    if-ltz v4, :cond_6

    .line 132
    .line 133
    :cond_5
    move/from16 v4, p2

    .line 134
    .line 135
    goto :goto_4

    .line 136
    :cond_6
    const/4 v4, 0x0

    .line 137
    :goto_4
    if-eq v2, v9, :cond_2

    .line 138
    .line 139
    if-nez v4, :cond_7

    .line 140
    .line 141
    iget v4, v1, Lcom/google/android/gms/internal/ads/zzagn;->zza:I

    .line 142
    .line 143
    if-lt v2, v4, :cond_2

    .line 144
    .line 145
    :cond_7
    iget v4, v1, Lcom/google/android/gms/internal/ads/zzagn;->zzb:I

    .line 146
    .line 147
    if-gt v2, v4, :cond_2

    .line 148
    .line 149
    and-long v4, v14, v20

    .line 150
    .line 151
    iget v2, v1, Lcom/google/android/gms/internal/ads/zzagn;->zze:I

    .line 152
    .line 153
    long-to-int v4, v4

    .line 154
    if-nez v4, :cond_8

    .line 155
    .line 156
    goto :goto_5

    .line 157
    :cond_8
    const/16 v5, 0xb

    .line 158
    .line 159
    if-gt v4, v5, :cond_9

    .line 160
    .line 161
    iget v1, v1, Lcom/google/android/gms/internal/ads/zzagn;->zzf:I

    .line 162
    .line 163
    if-ne v4, v1, :cond_2

    .line 164
    .line 165
    goto :goto_5

    .line 166
    :cond_9
    if-ne v4, v8, :cond_a

    .line 167
    .line 168
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzs()I

    .line 169
    .line 170
    .line 171
    move-result v1

    .line 172
    mul-int/lit16 v1, v1, 0x3e8

    .line 173
    .line 174
    if-ne v1, v2, :cond_2

    .line 175
    .line 176
    goto :goto_5

    .line 177
    :cond_a
    const/16 v1, 0xe

    .line 178
    .line 179
    if-gt v4, v1, :cond_2

    .line 180
    .line 181
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzt()I

    .line 182
    .line 183
    .line 184
    move-result v5

    .line 185
    if-ne v4, v1, :cond_b

    .line 186
    .line 187
    mul-int/lit8 v5, v5, 0xa

    .line 188
    .line 189
    :cond_b
    if-ne v5, v2, :cond_2

    .line 190
    .line 191
    :goto_5
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzs()I

    .line 192
    .line 193
    .line 194
    move-result v1

    .line 195
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzg()I

    .line 196
    .line 197
    .line 198
    move-result v2

    .line 199
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 200
    .line 201
    .line 202
    move-result-object v4

    .line 203
    add-int/2addr v2, v9

    .line 204
    const/4 v5, 0x0

    .line 205
    invoke-static {v4, v3, v2, v5}, Lcom/google/android/gms/internal/ads/zzfm;->zzN([BIII)I

    .line 206
    .line 207
    .line 208
    move-result v2

    .line 209
    if-ne v1, v2, :cond_2

    .line 210
    .line 211
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzd()I

    .line 212
    .line 213
    .line 214
    move-result v1

    .line 215
    if-nez v1, :cond_c

    .line 216
    .line 217
    goto :goto_6

    .line 218
    :cond_c
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzn()I

    .line 219
    .line 220
    .line 221
    move-result v0

    .line 222
    and-int/lit16 v1, v0, 0x80

    .line 223
    .line 224
    if-eqz v1, :cond_d

    .line 225
    .line 226
    goto/16 :goto_1

    .line 227
    .line 228
    :cond_d
    and-int/lit8 v0, v0, 0x7e

    .line 229
    .line 230
    shr-int/lit8 v0, v0, 0x1

    .line 231
    .line 232
    const/4 v7, 0x2

    .line 233
    if-lt v0, v7, :cond_e

    .line 234
    .line 235
    const/4 v1, 0x7

    .line 236
    if-le v0, v1, :cond_f

    .line 237
    .line 238
    :cond_e
    const/16 v1, 0xd

    .line 239
    .line 240
    if-lt v0, v1, :cond_10

    .line 241
    .line 242
    const/16 v1, 0x1f

    .line 243
    .line 244
    if-gt v0, v1, :cond_10

    .line 245
    .line 246
    :cond_f
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v1

    .line 250
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 251
    .line 252
    .line 253
    move-result v1

    .line 254
    new-instance v2, Ljava/lang/StringBuilder;

    .line 255
    .line 256
    add-int/lit8 v1, v1, 0x39

    .line 257
    .line 258
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 259
    .line 260
    .line 261
    const-string v1, "Ignoring frame where first subframe has a reserved type: "

    .line 262
    .line 263
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 264
    .line 265
    .line 266
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 267
    .line 268
    .line 269
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object v0

    .line 273
    const-string v1, "FlacFrameReader"

    .line 274
    .line 275
    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/zzeh;->zzb(Ljava/lang/String;Ljava/lang/String;)V

    .line 276
    .line 277
    .line 278
    goto/16 :goto_1

    .line 279
    .line 280
    :cond_10
    :goto_6
    return p2

    .line 281
    :goto_7
    return v16
.end method

.method public static zzb(Lcom/google/android/gms/internal/ads/zzagb;Lcom/google/android/gms/internal/ads/zzagn;)J
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-interface {p0}, Lcom/google/android/gms/internal/ads/zzagb;->zzl()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    invoke-interface {p0, v0}, Lcom/google/android/gms/internal/ads/zzagb;->zzk(I)V

    .line 6
    .line 7
    .line 8
    new-array v1, v0, [B

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-interface {p0, v1, v2, v0}, Lcom/google/android/gms/internal/ads/zzagb;->zzi([BII)V

    .line 12
    .line 13
    .line 14
    aget-byte v1, v1, v2

    .line 15
    .line 16
    and-int/2addr v1, v0

    .line 17
    if-eq v0, v1, :cond_0

    .line 18
    .line 19
    move v3, v2

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move v3, v0

    .line 22
    :goto_0
    const/4 v4, 0x2

    .line 23
    invoke-interface {p0, v4}, Lcom/google/android/gms/internal/ads/zzagb;->zzk(I)V

    .line 24
    .line 25
    .line 26
    if-eq v0, v1, :cond_1

    .line 27
    .line 28
    const/4 v0, 0x6

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    const/4 v0, 0x7

    .line 31
    :goto_1
    new-instance v1, Lcom/google/android/gms/internal/ads/zzeu;

    .line 32
    .line 33
    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/ads/zzeu;-><init>(I)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    invoke-static {p0, v4, v2, v0}, Lcom/google/android/gms/internal/ads/zzage;->zzb(Lcom/google/android/gms/internal/ads/zzagb;[BII)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzf(I)V

    .line 45
    .line 46
    .line 47
    invoke-interface {p0}, Lcom/google/android/gms/internal/ads/zzagb;->zzl()V

    .line 48
    .line 49
    .line 50
    new-instance p0, Lcom/google/android/gms/internal/ads/zzagh;

    .line 51
    .line 52
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzagh;-><init>()V

    .line 53
    .line 54
    .line 55
    invoke-static {v1, p1, v3, p0}, Lcom/google/android/gms/internal/ads/zzagi;->zzd(Lcom/google/android/gms/internal/ads/zzeu;Lcom/google/android/gms/internal/ads/zzagn;ZLcom/google/android/gms/internal/ads/zzagh;)Z

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    if-eqz p1, :cond_2

    .line 60
    .line 61
    iget-wide p0, p0, Lcom/google/android/gms/internal/ads/zzagh;->zza:J

    .line 62
    .line 63
    return-wide p0

    .line 64
    :cond_2
    const/4 p0, 0x0

    .line 65
    invoke-static {p0, p0}, Lcom/google/android/gms/internal/ads/zzat;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzat;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    throw p0
.end method

.method public static zzc(Lcom/google/android/gms/internal/ads/zzeu;I)I
    .locals 0

    .line 1
    packed-switch p1, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    const/4 p0, -0x1

    .line 5
    return p0

    .line 6
    :pswitch_0
    add-int/lit8 p1, p1, -0x8

    .line 7
    .line 8
    const/16 p0, 0x100

    .line 9
    .line 10
    shl-int/2addr p0, p1

    .line 11
    return p0

    .line 12
    :pswitch_1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzeu;->zzt()I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    add-int/lit8 p0, p0, 0x1

    .line 17
    .line 18
    return p0

    .line 19
    :pswitch_2
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzeu;->zzs()I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    add-int/lit8 p0, p0, 0x1

    .line 24
    .line 25
    return p0

    .line 26
    :pswitch_3
    add-int/lit8 p1, p1, -0x2

    .line 27
    .line 28
    const/16 p0, 0x240

    .line 29
    .line 30
    shl-int/2addr p0, p1

    .line 31
    return p0

    .line 32
    :pswitch_4
    const/16 p0, 0xc0

    .line 33
    .line 34
    return p0

    .line 35
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private static zzd(Lcom/google/android/gms/internal/ads/zzeu;Lcom/google/android/gms/internal/ads/zzagn;ZLcom/google/android/gms/internal/ads/zzagh;)Z
    .locals 4

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzeu;->zzO()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget p0, p1, Lcom/google/android/gms/internal/ads/zzagn;->zzb:I

    .line 9
    .line 10
    int-to-long v2, p0

    .line 11
    mul-long/2addr v0, v2

    .line 12
    :goto_0
    iget-wide p0, p1, Lcom/google/android/gms/internal/ads/zzagn;->zzj:J

    .line 13
    .line 14
    const-wide/16 v2, 0x0

    .line 15
    .line 16
    cmp-long p2, p0, v2

    .line 17
    .line 18
    if-eqz p2, :cond_1

    .line 19
    .line 20
    cmp-long p0, v0, p0

    .line 21
    .line 22
    if-lez p0, :cond_1

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_1
    iput-wide v0, p3, Lcom/google/android/gms/internal/ads/zzagh;->zza:J

    .line 26
    .line 27
    const/4 p0, 0x1

    .line 28
    return p0

    .line 29
    :catch_0
    :goto_1
    const/4 p0, 0x0

    .line 30
    return p0
.end method
