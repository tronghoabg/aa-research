.class final Lcom/google/android/gms/internal/ads/zzaqq;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static zza(Lcom/google/android/gms/internal/ads/zzet;Lcom/google/android/gms/internal/ads/zzaqo;)Z
    .locals 18
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzat;
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzet;->zze()I

    .line 6
    .line 7
    .line 8
    const/4 v2, 0x3

    .line 9
    const/16 v3, 0x8

    .line 10
    .line 11
    invoke-static {v0, v2, v3, v3}, Lcom/google/android/gms/internal/ads/zzaqq;->zzf(Lcom/google/android/gms/internal/ads/zzet;III)I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    iput v2, v1, Lcom/google/android/gms/internal/ads/zzaqo;->zza:I

    .line 16
    .line 17
    const/4 v4, 0x0

    .line 18
    const/4 v5, -0x1

    .line 19
    if-eq v2, v5, :cond_d

    .line 20
    .line 21
    const/4 v2, 0x2

    .line 22
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    .line 23
    .line 24
    .line 25
    move-result v6

    .line 26
    const/16 v7, 0x20

    .line 27
    .line 28
    invoke-static {v6, v7}, Ljava/lang/Math;->max(II)I

    .line 29
    .line 30
    .line 31
    move-result v6

    .line 32
    const/16 v8, 0x3f

    .line 33
    .line 34
    const/4 v9, 0x1

    .line 35
    if-gt v6, v8, :cond_0

    .line 36
    .line 37
    move v6, v9

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    move v6, v4

    .line 40
    :goto_0
    invoke-static {v6}, Lcom/google/android/gms/internal/ads/zzgtr;->zza(Z)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzet;->zzc()I

    .line 44
    .line 45
    .line 46
    move-result v6

    .line 47
    const-wide/16 v10, -0x1

    .line 48
    .line 49
    if-ge v6, v2, :cond_1

    .line 50
    .line 51
    :goto_1
    move-wide v12, v10

    .line 52
    goto :goto_2

    .line 53
    :cond_1
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/zzet;->zzk(I)J

    .line 54
    .line 55
    .line 56
    move-result-wide v12

    .line 57
    const-wide/16 v14, 0x3

    .line 58
    .line 59
    cmp-long v6, v12, v14

    .line 60
    .line 61
    if-nez v6, :cond_5

    .line 62
    .line 63
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzet;->zzc()I

    .line 64
    .line 65
    .line 66
    move-result v6

    .line 67
    if-ge v6, v3, :cond_2

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_2
    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/ads/zzet;->zzk(I)J

    .line 71
    .line 72
    .line 73
    move-result-wide v12

    .line 74
    add-long/2addr v14, v12

    .line 75
    const-wide/16 v16, 0xff

    .line 76
    .line 77
    cmp-long v3, v12, v16

    .line 78
    .line 79
    if-nez v3, :cond_4

    .line 80
    .line 81
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzet;->zzc()I

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    if-ge v3, v7, :cond_3

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_3
    invoke-virtual {v0, v7}, Lcom/google/android/gms/internal/ads/zzet;->zzk(I)J

    .line 89
    .line 90
    .line 91
    move-result-wide v6

    .line 92
    add-long v12, v6, v14

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_4
    move-wide v12, v14

    .line 96
    :cond_5
    :goto_2
    iput-wide v12, v1, Lcom/google/android/gms/internal/ads/zzaqo;->zzb:J

    .line 97
    .line 98
    cmp-long v3, v12, v10

    .line 99
    .line 100
    if-nez v3, :cond_6

    .line 101
    .line 102
    return v4

    .line 103
    :cond_6
    const-wide/16 v6, 0x10

    .line 104
    .line 105
    cmp-long v3, v12, v6

    .line 106
    .line 107
    if-gtz v3, :cond_c

    .line 108
    .line 109
    const-wide/16 v6, 0x0

    .line 110
    .line 111
    cmp-long v3, v12, v6

    .line 112
    .line 113
    if-nez v3, :cond_a

    .line 114
    .line 115
    iget v3, v1, Lcom/google/android/gms/internal/ads/zzaqo;->zza:I

    .line 116
    .line 117
    const/4 v6, 0x0

    .line 118
    if-eq v3, v9, :cond_9

    .line 119
    .line 120
    if-eq v3, v2, :cond_8

    .line 121
    .line 122
    const/16 v2, 0x11

    .line 123
    .line 124
    if-eq v3, v2, :cond_7

    .line 125
    .line 126
    goto :goto_3

    .line 127
    :cond_7
    const-string v0, "AudioTruncation packet with invalid packet label 0"

    .line 128
    .line 129
    invoke-static {v0, v6}, Lcom/google/android/gms/internal/ads/zzat;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzat;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    throw v0

    .line 134
    :cond_8
    const-string v0, "Mpegh3daFrame packet with invalid packet label 0"

    .line 135
    .line 136
    invoke-static {v0, v6}, Lcom/google/android/gms/internal/ads/zzat;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzat;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    throw v0

    .line 141
    :cond_9
    const-string v0, "Mpegh3daConfig packet with invalid packet label 0"

    .line 142
    .line 143
    invoke-static {v0, v6}, Lcom/google/android/gms/internal/ads/zzat;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/gms/internal/ads/zzat;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    throw v0

    .line 148
    :cond_a
    :goto_3
    const/16 v2, 0xb

    .line 149
    .line 150
    const/16 v3, 0x18

    .line 151
    .line 152
    invoke-static {v0, v2, v3, v3}, Lcom/google/android/gms/internal/ads/zzaqq;->zzf(Lcom/google/android/gms/internal/ads/zzet;III)I

    .line 153
    .line 154
    .line 155
    move-result v0

    .line 156
    iput v0, v1, Lcom/google/android/gms/internal/ads/zzaqo;->zzc:I

    .line 157
    .line 158
    if-eq v0, v5, :cond_b

    .line 159
    .line 160
    return v9

    .line 161
    :cond_b
    return v4

    .line 162
    :cond_c
    invoke-static {v12, v13}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 167
    .line 168
    .line 169
    move-result v0

    .line 170
    new-instance v1, Ljava/lang/StringBuilder;

    .line 171
    .line 172
    add-int/lit8 v0, v0, 0x31

    .line 173
    .line 174
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 175
    .line 176
    .line 177
    const-string v0, "Contains sub-stream with an invalid packet label "

    .line 178
    .line 179
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v1, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzat;->zzc(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzat;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    throw v0

    .line 194
    :cond_d
    return v4
.end method

.method public static zzb(Lcom/google/android/gms/internal/ads/zzet;)Lcom/google/android/gms/internal/ads/zzaqp;
    .locals 21
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzat;
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 6
    .line 7
    .line 8
    move-result v3

    .line 9
    const/4 v2, 0x5

    .line 10
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 11
    .line 12
    .line 13
    move-result v4

    .line 14
    const/16 v5, 0x1f

    .line 15
    .line 16
    if-ne v4, v5, :cond_0

    .line 17
    .line 18
    const/16 v4, 0x18

    .line 19
    .line 20
    invoke-virtual {v0, v4}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    goto/16 :goto_0

    .line 25
    .line 26
    :cond_0
    packed-switch v4, :pswitch_data_0

    .line 27
    .line 28
    .line 29
    :pswitch_0
    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    new-instance v1, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    add-int/lit8 v0, v0, 0x20

    .line 40
    .line 41
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 42
    .line 43
    .line 44
    const-string v0, "Unsupported sampling rate index "

    .line 45
    .line 46
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzat;->zzc(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzat;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    throw v0

    .line 61
    :pswitch_1
    const/16 v4, 0x2580

    .line 62
    .line 63
    goto/16 :goto_0

    .line 64
    .line 65
    :pswitch_2
    const/16 v4, 0x3200

    .line 66
    .line 67
    goto/16 :goto_0

    .line 68
    .line 69
    :pswitch_3
    const/16 v4, 0x3840

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :pswitch_4
    const/16 v4, 0x42b3

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :pswitch_5
    const/16 v4, 0x4b00

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :pswitch_6
    const/16 v4, 0x4e20

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :pswitch_7
    const/16 v4, 0x6400

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :pswitch_8
    const/16 v4, 0x7080

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :pswitch_9
    const v4, 0x8566

    .line 88
    .line 89
    .line 90
    goto :goto_0

    .line 91
    :pswitch_a
    const v4, 0x9600

    .line 92
    .line 93
    .line 94
    goto :goto_0

    .line 95
    :pswitch_b
    const v4, 0x9c40

    .line 96
    .line 97
    .line 98
    goto :goto_0

    .line 99
    :pswitch_c
    const v4, 0xc800

    .line 100
    .line 101
    .line 102
    goto :goto_0

    .line 103
    :pswitch_d
    const v4, 0xe100

    .line 104
    .line 105
    .line 106
    goto :goto_0

    .line 107
    :pswitch_e
    const/16 v4, 0x1cb6

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :pswitch_f
    const/16 v4, 0x1f40

    .line 111
    .line 112
    goto :goto_0

    .line 113
    :pswitch_10
    const/16 v4, 0x2b11

    .line 114
    .line 115
    goto :goto_0

    .line 116
    :pswitch_11
    const/16 v4, 0x2ee0

    .line 117
    .line 118
    goto :goto_0

    .line 119
    :pswitch_12
    const/16 v4, 0x3e80

    .line 120
    .line 121
    goto :goto_0

    .line 122
    :pswitch_13
    const/16 v4, 0x5622

    .line 123
    .line 124
    goto :goto_0

    .line 125
    :pswitch_14
    const/16 v4, 0x5dc0

    .line 126
    .line 127
    goto :goto_0

    .line 128
    :pswitch_15
    const/16 v4, 0x7d00

    .line 129
    .line 130
    goto :goto_0

    .line 131
    :pswitch_16
    const v4, 0xac44

    .line 132
    .line 133
    .line 134
    goto :goto_0

    .line 135
    :pswitch_17
    const v4, 0xbb80

    .line 136
    .line 137
    .line 138
    goto :goto_0

    .line 139
    :pswitch_18
    const v4, 0xfa00

    .line 140
    .line 141
    .line 142
    goto :goto_0

    .line 143
    :pswitch_19
    const v4, 0x15888

    .line 144
    .line 145
    .line 146
    goto :goto_0

    .line 147
    :pswitch_1a
    const v4, 0x17700

    .line 148
    .line 149
    .line 150
    :goto_0
    const/4 v5, 0x3

    .line 151
    invoke-virtual {v0, v5}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 152
    .line 153
    .line 154
    move-result v6

    .line 155
    const-string v7, "Unsupported coreSbrFrameLengthIndex "

    .line 156
    .line 157
    const/16 v8, 0x24

    .line 158
    .line 159
    const/4 v9, 0x4

    .line 160
    const/4 v10, 0x2

    .line 161
    const/4 v11, 0x1

    .line 162
    if-eqz v6, :cond_4

    .line 163
    .line 164
    if-eq v6, v11, :cond_3

    .line 165
    .line 166
    if-eq v6, v10, :cond_2

    .line 167
    .line 168
    if-eq v6, v5, :cond_2

    .line 169
    .line 170
    if-ne v6, v9, :cond_1

    .line 171
    .line 172
    const/16 v12, 0x1000

    .line 173
    .line 174
    goto :goto_1

    .line 175
    :cond_1
    invoke-static {v6, v8}, LA7/p0;->f(II)I

    .line 176
    .line 177
    .line 178
    move-result v0

    .line 179
    new-instance v1, Ljava/lang/StringBuilder;

    .line 180
    .line 181
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzat;->zzc(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzat;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    throw v0

    .line 199
    :cond_2
    const/16 v12, 0x800

    .line 200
    .line 201
    goto :goto_1

    .line 202
    :cond_3
    const/16 v12, 0x400

    .line 203
    .line 204
    goto :goto_1

    .line 205
    :cond_4
    const/16 v12, 0x300

    .line 206
    .line 207
    :goto_1
    if-eqz v6, :cond_8

    .line 208
    .line 209
    if-eq v6, v11, :cond_8

    .line 210
    .line 211
    if-eq v6, v10, :cond_7

    .line 212
    .line 213
    if-eq v6, v5, :cond_6

    .line 214
    .line 215
    if-ne v6, v9, :cond_5

    .line 216
    .line 217
    move v6, v11

    .line 218
    goto :goto_2

    .line 219
    :cond_5
    invoke-static {v6, v8}, LA7/p0;->f(II)I

    .line 220
    .line 221
    .line 222
    move-result v0

    .line 223
    new-instance v1, Ljava/lang/StringBuilder;

    .line 224
    .line 225
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 229
    .line 230
    .line 231
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 232
    .line 233
    .line 234
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzat;->zzc(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzat;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    throw v0

    .line 243
    :cond_6
    move v6, v5

    .line 244
    goto :goto_2

    .line 245
    :cond_7
    move v6, v10

    .line 246
    goto :goto_2

    .line 247
    :cond_8
    const/4 v6, 0x0

    .line 248
    :goto_2
    invoke-virtual {v0, v10}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 249
    .line 250
    .line 251
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzaqq;->zzc(Lcom/google/android/gms/internal/ads/zzet;)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 255
    .line 256
    .line 257
    move-result v7

    .line 258
    const/4 v8, 0x0

    .line 259
    const/4 v14, 0x0

    .line 260
    :goto_3
    add-int/lit8 v15, v7, 0x1

    .line 261
    .line 262
    const/16 v13, 0x10

    .line 263
    .line 264
    if-ge v8, v15, :cond_b

    .line 265
    .line 266
    invoke-virtual {v0, v5}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 267
    .line 268
    .line 269
    move-result v15

    .line 270
    invoke-static {v0, v2, v1, v13}, Lcom/google/android/gms/internal/ads/zzaqq;->zzf(Lcom/google/android/gms/internal/ads/zzet;III)I

    .line 271
    .line 272
    .line 273
    move-result v13

    .line 274
    add-int/2addr v13, v11

    .line 275
    add-int/2addr v14, v13

    .line 276
    if-eqz v15, :cond_9

    .line 277
    .line 278
    if-ne v15, v10, :cond_a

    .line 279
    .line 280
    :cond_9
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzet;->zzi()Z

    .line 281
    .line 282
    .line 283
    move-result v13

    .line 284
    if-eqz v13, :cond_a

    .line 285
    .line 286
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzaqq;->zzc(Lcom/google/android/gms/internal/ads/zzet;)V

    .line 287
    .line 288
    .line 289
    :cond_a
    add-int/lit8 v8, v8, 0x1

    .line 290
    .line 291
    goto :goto_3

    .line 292
    :cond_b
    invoke-static {v0, v9, v1, v13}, Lcom/google/android/gms/internal/ads/zzaqq;->zzf(Lcom/google/android/gms/internal/ads/zzet;III)I

    .line 293
    .line 294
    .line 295
    move-result v7

    .line 296
    add-int/2addr v7, v11

    .line 297
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzet;->zzg()V

    .line 298
    .line 299
    .line 300
    const/4 v8, 0x0

    .line 301
    :goto_4
    const-wide/high16 v17, 0x4000000000000000L    # 2.0

    .line 302
    .line 303
    if-ge v8, v7, :cond_1a

    .line 304
    .line 305
    invoke-virtual {v0, v10}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 306
    .line 307
    .line 308
    move-result v15

    .line 309
    if-eqz v15, :cond_18

    .line 310
    .line 311
    if-eq v15, v11, :cond_f

    .line 312
    .line 313
    if-eq v15, v5, :cond_c

    .line 314
    .line 315
    move v13, v3

    .line 316
    move/from16 v19, v11

    .line 317
    .line 318
    goto/16 :goto_6

    .line 319
    .line 320
    :cond_c
    invoke-static {v0, v9, v1, v13}, Lcom/google/android/gms/internal/ads/zzaqq;->zzf(Lcom/google/android/gms/internal/ads/zzet;III)I

    .line 321
    .line 322
    .line 323
    invoke-static {v0, v9, v1, v13}, Lcom/google/android/gms/internal/ads/zzaqq;->zzf(Lcom/google/android/gms/internal/ads/zzet;III)I

    .line 324
    .line 325
    .line 326
    move-result v15

    .line 327
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzet;->zzi()Z

    .line 328
    .line 329
    .line 330
    move-result v17

    .line 331
    move/from16 v19, v11

    .line 332
    .line 333
    const/4 v11, 0x0

    .line 334
    if-eqz v17, :cond_d

    .line 335
    .line 336
    invoke-static {v0, v1, v13, v11}, Lcom/google/android/gms/internal/ads/zzaqq;->zzf(Lcom/google/android/gms/internal/ads/zzet;III)I

    .line 337
    .line 338
    .line 339
    :cond_d
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzet;->zzg()V

    .line 340
    .line 341
    .line 342
    if-lez v15, :cond_e

    .line 343
    .line 344
    mul-int/lit8 v15, v15, 0x8

    .line 345
    .line 346
    invoke-virtual {v0, v15}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 347
    .line 348
    .line 349
    :cond_e
    move v13, v3

    .line 350
    goto/16 :goto_6

    .line 351
    .line 352
    :cond_f
    move/from16 v19, v11

    .line 353
    .line 354
    const/4 v11, 0x0

    .line 355
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzaqq;->zzd(Lcom/google/android/gms/internal/ads/zzet;)Z

    .line 356
    .line 357
    .line 358
    move-result v15

    .line 359
    if-eqz v15, :cond_10

    .line 360
    .line 361
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzet;->zzg()V

    .line 362
    .line 363
    .line 364
    :cond_10
    if-lez v6, :cond_11

    .line 365
    .line 366
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzaqq;->zze(Lcom/google/android/gms/internal/ads/zzet;)V

    .line 367
    .line 368
    .line 369
    invoke-virtual {v0, v10}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 370
    .line 371
    .line 372
    move-result v15

    .line 373
    move/from16 v16, v6

    .line 374
    .line 375
    goto :goto_5

    .line 376
    :cond_11
    move v15, v11

    .line 377
    move/from16 v16, v15

    .line 378
    .line 379
    :goto_5
    if-lez v15, :cond_15

    .line 380
    .line 381
    const/4 v11, 0x6

    .line 382
    invoke-virtual {v0, v11}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 383
    .line 384
    .line 385
    invoke-virtual {v0, v10}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 386
    .line 387
    .line 388
    move-result v13

    .line 389
    invoke-virtual {v0, v9}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 390
    .line 391
    .line 392
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzet;->zzi()Z

    .line 393
    .line 394
    .line 395
    move-result v20

    .line 396
    if-eqz v20, :cond_12

    .line 397
    .line 398
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 399
    .line 400
    .line 401
    :cond_12
    if-eq v15, v10, :cond_13

    .line 402
    .line 403
    if-ne v15, v5, :cond_14

    .line 404
    .line 405
    :cond_13
    invoke-virtual {v0, v11}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 406
    .line 407
    .line 408
    :cond_14
    if-ne v13, v10, :cond_15

    .line 409
    .line 410
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzet;->zzg()V

    .line 411
    .line 412
    .line 413
    :cond_15
    add-int/lit8 v11, v14, -0x1

    .line 414
    .line 415
    move v13, v3

    .line 416
    int-to-double v2, v11

    .line 417
    invoke-static {v2, v3}, Ljava/lang/Math;->log(D)D

    .line 418
    .line 419
    .line 420
    move-result-wide v2

    .line 421
    invoke-static/range {v17 .. v18}, Ljava/lang/Math;->log(D)D

    .line 422
    .line 423
    .line 424
    move-result-wide v17

    .line 425
    div-double v2, v2, v17

    .line 426
    .line 427
    invoke-static {v2, v3}, Ljava/lang/Math;->floor(D)D

    .line 428
    .line 429
    .line 430
    move-result-wide v2

    .line 431
    double-to-int v2, v2

    .line 432
    add-int/lit8 v2, v2, 0x1

    .line 433
    .line 434
    invoke-virtual {v0, v10}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 435
    .line 436
    .line 437
    move-result v3

    .line 438
    if-lez v3, :cond_16

    .line 439
    .line 440
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzet;->zzi()Z

    .line 441
    .line 442
    .line 443
    move-result v11

    .line 444
    if-eqz v11, :cond_16

    .line 445
    .line 446
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 447
    .line 448
    .line 449
    :cond_16
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzet;->zzi()Z

    .line 450
    .line 451
    .line 452
    move-result v11

    .line 453
    if-eqz v11, :cond_17

    .line 454
    .line 455
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 456
    .line 457
    .line 458
    :cond_17
    if-nez v16, :cond_19

    .line 459
    .line 460
    if-nez v3, :cond_19

    .line 461
    .line 462
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzet;->zzg()V

    .line 463
    .line 464
    .line 465
    goto :goto_6

    .line 466
    :cond_18
    move v13, v3

    .line 467
    move/from16 v19, v11

    .line 468
    .line 469
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzaqq;->zzd(Lcom/google/android/gms/internal/ads/zzet;)Z

    .line 470
    .line 471
    .line 472
    if-lez v6, :cond_19

    .line 473
    .line 474
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzaqq;->zze(Lcom/google/android/gms/internal/ads/zzet;)V

    .line 475
    .line 476
    .line 477
    :cond_19
    :goto_6
    add-int/lit8 v8, v8, 0x1

    .line 478
    .line 479
    move v3, v13

    .line 480
    move/from16 v11, v19

    .line 481
    .line 482
    const/4 v2, 0x5

    .line 483
    const/16 v13, 0x10

    .line 484
    .line 485
    goto/16 :goto_4

    .line 486
    .line 487
    :cond_1a
    move v13, v3

    .line 488
    move/from16 v19, v11

    .line 489
    .line 490
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzet;->zzi()Z

    .line 491
    .line 492
    .line 493
    move-result v2

    .line 494
    const/4 v3, 0x0

    .line 495
    if-eqz v2, :cond_1d

    .line 496
    .line 497
    invoke-static {v0, v10, v9, v1}, Lcom/google/android/gms/internal/ads/zzaqq;->zzf(Lcom/google/android/gms/internal/ads/zzet;III)I

    .line 498
    .line 499
    .line 500
    move-result v2

    .line 501
    add-int/lit8 v2, v2, 0x1

    .line 502
    .line 503
    const/4 v5, 0x0

    .line 504
    :goto_7
    if-ge v5, v2, :cond_1d

    .line 505
    .line 506
    const/16 v6, 0x10

    .line 507
    .line 508
    invoke-static {v0, v9, v1, v6}, Lcom/google/android/gms/internal/ads/zzaqq;->zzf(Lcom/google/android/gms/internal/ads/zzet;III)I

    .line 509
    .line 510
    .line 511
    move-result v7

    .line 512
    invoke-static {v0, v9, v1, v6}, Lcom/google/android/gms/internal/ads/zzaqq;->zzf(Lcom/google/android/gms/internal/ads/zzet;III)I

    .line 513
    .line 514
    .line 515
    move-result v8

    .line 516
    const/4 v10, 0x7

    .line 517
    if-ne v7, v10, :cond_1c

    .line 518
    .line 519
    invoke-virtual {v0, v9}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 520
    .line 521
    .line 522
    move-result v3

    .line 523
    add-int/lit8 v3, v3, 0x1

    .line 524
    .line 525
    invoke-virtual {v0, v9}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 526
    .line 527
    .line 528
    new-array v7, v3, [B

    .line 529
    .line 530
    const/4 v8, 0x0

    .line 531
    :goto_8
    if-ge v8, v3, :cond_1b

    .line 532
    .line 533
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 534
    .line 535
    .line 536
    move-result v10

    .line 537
    int-to-byte v10, v10

    .line 538
    aput-byte v10, v7, v8

    .line 539
    .line 540
    add-int/lit8 v8, v8, 0x1

    .line 541
    .line 542
    goto :goto_8

    .line 543
    :cond_1b
    move-object v3, v7

    .line 544
    goto :goto_9

    .line 545
    :cond_1c
    mul-int/2addr v8, v1

    .line 546
    invoke-virtual {v0, v8}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 547
    .line 548
    .line 549
    :goto_9
    add-int/lit8 v5, v5, 0x1

    .line 550
    .line 551
    goto :goto_7

    .line 552
    :cond_1d
    move-object v6, v3

    .line 553
    sparse-switch v4, :sswitch_data_0

    .line 554
    .line 555
    .line 556
    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 557
    .line 558
    .line 559
    move-result-object v0

    .line 560
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 561
    .line 562
    .line 563
    move-result v0

    .line 564
    new-instance v1, Ljava/lang/StringBuilder;

    .line 565
    .line 566
    add-int/lit8 v0, v0, 0x1a

    .line 567
    .line 568
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 569
    .line 570
    .line 571
    const-string v0, "Unsupported sampling rate "

    .line 572
    .line 573
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 574
    .line 575
    .line 576
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 577
    .line 578
    .line 579
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 580
    .line 581
    .line 582
    move-result-object v0

    .line 583
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzat;->zzc(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzat;

    .line 584
    .line 585
    .line 586
    move-result-object v0

    .line 587
    throw v0

    .line 588
    :sswitch_0
    const-wide/high16 v17, 0x3ff0000000000000L    # 1.0

    .line 589
    .line 590
    goto :goto_a

    .line 591
    :sswitch_1
    const-wide/high16 v17, 0x3ff8000000000000L    # 1.5

    .line 592
    .line 593
    goto :goto_a

    .line 594
    :sswitch_2
    const-wide/high16 v17, 0x4008000000000000L    # 3.0

    .line 595
    .line 596
    :goto_a
    :sswitch_3
    int-to-double v0, v4

    .line 597
    int-to-double v2, v12

    .line 598
    move-wide v3, v2

    .line 599
    new-instance v2, Lcom/google/android/gms/internal/ads/zzaqp;

    .line 600
    .line 601
    mul-double v3, v3, v17

    .line 602
    .line 603
    mul-double v0, v0, v17

    .line 604
    .line 605
    double-to-int v0, v0

    .line 606
    double-to-int v5, v3

    .line 607
    const/4 v7, 0x0

    .line 608
    move v4, v0

    .line 609
    move v3, v13

    .line 610
    invoke-direct/range {v2 .. v7}, Lcom/google/android/gms/internal/ads/zzaqp;-><init>(III[B[B)V

    .line 611
    .line 612
    .line 613
    return-object v2

    .line 614
    nop

    .line 615
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_0
        :pswitch_0
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch

    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    :sswitch_data_0
    .sparse-switch
        0x396c -> :sswitch_2
        0x3e80 -> :sswitch_2
        0x5622 -> :sswitch_3
        0x5dc0 -> :sswitch_3
        0x72d8 -> :sswitch_1
        0x7d00 -> :sswitch_1
        0xac44 -> :sswitch_0
        0xbb80 -> :sswitch_0
        0xe5b0 -> :sswitch_1
        0xfa00 -> :sswitch_1
        0x15888 -> :sswitch_0
        0x17700 -> :sswitch_0
    .end sparse-switch
.end method

.method private static zzc(Lcom/google/android/gms/internal/ads/zzet;)V
    .locals 12

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    const/4 v2, 0x6

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0, v2}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    const/16 v3, 0x10

    .line 14
    .line 15
    const/4 v4, 0x5

    .line 16
    const/16 v5, 0x8

    .line 17
    .line 18
    invoke-static {p0, v4, v5, v3}, Lcom/google/android/gms/internal/ads/zzaqq;->zzf(Lcom/google/android/gms/internal/ads/zzet;III)I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    const/4 v6, 0x1

    .line 23
    add-int/2addr v3, v6

    .line 24
    const/4 v7, 0x7

    .line 25
    if-ne v1, v6, :cond_1

    .line 26
    .line 27
    mul-int/2addr v3, v7

    .line 28
    invoke-virtual {p0, v3}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    if-ne v1, v0, :cond_9

    .line 33
    .line 34
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzet;->zzi()Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eq v6, v1, :cond_2

    .line 39
    .line 40
    move v8, v4

    .line 41
    goto :goto_0

    .line 42
    :cond_2
    move v8, v6

    .line 43
    :goto_0
    if-eq v6, v1, :cond_3

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_3
    move v4, v7

    .line 47
    :goto_1
    if-eq v6, v1, :cond_4

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_4
    move v2, v5

    .line 51
    :goto_2
    const/4 v1, 0x0

    .line 52
    move v5, v1

    .line 53
    :goto_3
    if-ge v5, v3, :cond_9

    .line 54
    .line 55
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzet;->zzi()Z

    .line 56
    .line 57
    .line 58
    move-result v9

    .line 59
    const/16 v10, 0xb4

    .line 60
    .line 61
    if-eqz v9, :cond_5

    .line 62
    .line 63
    invoke-virtual {p0, v7}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 64
    .line 65
    .line 66
    move v9, v1

    .line 67
    goto :goto_4

    .line 68
    :cond_5
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 69
    .line 70
    .line 71
    move-result v9

    .line 72
    const/4 v11, 0x3

    .line 73
    if-ne v9, v11, :cond_6

    .line 74
    .line 75
    invoke-virtual {p0, v4}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 76
    .line 77
    .line 78
    move-result v9

    .line 79
    mul-int/2addr v9, v8

    .line 80
    if-eqz v9, :cond_6

    .line 81
    .line 82
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzet;->zzg()V

    .line 83
    .line 84
    .line 85
    :cond_6
    invoke-virtual {p0, v2}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 86
    .line 87
    .line 88
    move-result v9

    .line 89
    mul-int/2addr v9, v8

    .line 90
    if-eqz v9, :cond_7

    .line 91
    .line 92
    if-eq v9, v10, :cond_7

    .line 93
    .line 94
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzet;->zzg()V

    .line 95
    .line 96
    .line 97
    :cond_7
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzet;->zzg()V

    .line 98
    .line 99
    .line 100
    :goto_4
    if-eqz v9, :cond_8

    .line 101
    .line 102
    if-eq v9, v10, :cond_8

    .line 103
    .line 104
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzet;->zzi()Z

    .line 105
    .line 106
    .line 107
    move-result v9

    .line 108
    if-eqz v9, :cond_8

    .line 109
    .line 110
    add-int/lit8 v5, v5, 0x1

    .line 111
    .line 112
    :cond_8
    add-int/2addr v5, v6

    .line 113
    goto :goto_3

    .line 114
    :cond_9
    return-void
.end method

.method private static zzd(Lcom/google/android/gms/internal/ads/zzet;)Z
    .locals 2

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzet;->zzi()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const/16 v1, 0xd

    .line 12
    .line 13
    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return v0
.end method

.method private static zze(Lcom/google/android/gms/internal/ads/zzet;)V
    .locals 2

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 3
    .line 4
    .line 5
    const/16 v0, 0x8

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzet;->zzi()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzet;->zzi()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    const/4 v0, 0x5

    .line 21
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 22
    .line 23
    .line 24
    :cond_0
    if-eqz v1, :cond_1

    .line 25
    .line 26
    const/4 v0, 0x6

    .line 27
    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzet;->zzh(I)V

    .line 28
    .line 29
    .line 30
    :cond_1
    return-void
.end method

.method private static zzf(Lcom/google/android/gms/internal/ads/zzet;III)I
    .locals 8

    .line 1
    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0, p3}, Ljava/lang/Math;->max(II)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/16 v1, 0x1f

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    if-gt v0, v1, :cond_0

    .line 13
    .line 14
    move v0, v2

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzgtr;->zza(Z)V

    .line 18
    .line 19
    .line 20
    shl-int v0, v2, p1

    .line 21
    .line 22
    shl-int v1, v2, p2

    .line 23
    .line 24
    const/4 v3, -0x1

    .line 25
    add-int/2addr v0, v3

    .line 26
    add-int/2addr v1, v3

    .line 27
    int-to-long v4, v0

    .line 28
    int-to-long v6, v1

    .line 29
    add-long/2addr v4, v6

    .line 30
    long-to-int v6, v4

    .line 31
    int-to-long v6, v6

    .line 32
    cmp-long v4, v4, v6

    .line 33
    .line 34
    if-nez v4, :cond_6

    .line 35
    .line 36
    shl-int/2addr v2, p3

    .line 37
    int-to-long v4, v2

    .line 38
    add-long/2addr v6, v4

    .line 39
    long-to-int v2, v6

    .line 40
    int-to-long v4, v2

    .line 41
    cmp-long v2, v6, v4

    .line 42
    .line 43
    if-nez v2, :cond_5

    .line 44
    .line 45
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzet;->zzc()I

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-ge v2, p1, :cond_1

    .line 50
    .line 51
    return v3

    .line 52
    :cond_1
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    if-ne p1, v0, :cond_4

    .line 57
    .line 58
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzet;->zzc()I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-ge v0, p2, :cond_2

    .line 63
    .line 64
    return v3

    .line 65
    :cond_2
    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 66
    .line 67
    .line 68
    move-result p2

    .line 69
    add-int/2addr p1, p2

    .line 70
    if-ne p2, v1, :cond_4

    .line 71
    .line 72
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzet;->zzc()I

    .line 73
    .line 74
    .line 75
    move-result p2

    .line 76
    if-ge p2, p3, :cond_3

    .line 77
    .line 78
    return v3

    .line 79
    :cond_3
    invoke-virtual {p0, p3}, Lcom/google/android/gms/internal/ads/zzet;->zzj(I)I

    .line 80
    .line 81
    .line 82
    move-result p0

    .line 83
    add-int/2addr p0, p1

    .line 84
    return p0

    .line 85
    :cond_4
    return p1

    .line 86
    :cond_5
    new-instance p0, Ljava/lang/ArithmeticException;

    .line 87
    .line 88
    invoke-direct {p0}, Ljava/lang/ArithmeticException;-><init>()V

    .line 89
    .line 90
    .line 91
    throw p0

    .line 92
    :cond_6
    new-instance p0, Ljava/lang/ArithmeticException;

    .line 93
    .line 94
    invoke-direct {p0}, Ljava/lang/ArithmeticException;-><init>()V

    .line 95
    .line 96
    .line 97
    throw p0
.end method
