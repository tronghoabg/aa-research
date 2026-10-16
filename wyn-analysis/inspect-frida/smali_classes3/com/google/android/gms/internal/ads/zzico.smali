.class public final Lcom/google/android/gms/internal/ads/zzico;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field zza:I

.field private final zzb:Ljava/io/Reader;

.field private zzc:Lcom/google/android/gms/internal/ads/zzibw;

.field private final zzd:[C

.field private zze:I

.field private zzf:I

.field private zzg:I

.field private zzh:I

.field private zzi:J

.field private zzj:I

.field private zzk:[I

.field private zzl:I

.field private zzm:[Ljava/lang/String;

.field private zzn:[I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/zzicn;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzicn;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zziby;->zza:Lcom/google/android/gms/internal/ads/zziby;

    return-void
.end method

.method public constructor <init>(Ljava/io/Reader;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/google/android/gms/internal/ads/zzibw;->zzb:Lcom/google/android/gms/internal/ads/zzibw;

    .line 5
    .line 6
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzico;->zzc:Lcom/google/android/gms/internal/ads/zzibw;

    .line 7
    .line 8
    const/16 v0, 0x400

    .line 9
    .line 10
    new-array v0, v0, [C

    .line 11
    .line 12
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzico;->zzd:[C

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzico;->zze:I

    .line 16
    .line 17
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzico;->zzf:I

    .line 18
    .line 19
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzico;->zzg:I

    .line 20
    .line 21
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzico;->zzh:I

    .line 22
    .line 23
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzico;->zza:I

    .line 24
    .line 25
    const/16 v1, 0x20

    .line 26
    .line 27
    new-array v2, v1, [I

    .line 28
    .line 29
    iput-object v2, p0, Lcom/google/android/gms/internal/ads/zzico;->zzk:[I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    iput v3, p0, Lcom/google/android/gms/internal/ads/zzico;->zzl:I

    .line 33
    .line 34
    const/4 v3, 0x6

    .line 35
    aput v3, v2, v0

    .line 36
    .line 37
    new-array v0, v1, [Ljava/lang/String;

    .line 38
    .line 39
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzico;->zzm:[Ljava/lang/String;

    .line 40
    .line 41
    new-array v0, v1, [I

    .line 42
    .line 43
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzico;->zzn:[I

    .line 44
    .line 45
    const-string v0, "in == null"

    .line 46
    .line 47
    invoke-static {p1, v0}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzico;->zzb:Ljava/io/Reader;

    .line 51
    .line 52
    return-void
.end method

.method private final zzn(C)Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/16 v0, 0x9

    .line 2
    .line 3
    if-eq p1, v0, :cond_1

    .line 4
    .line 5
    const/16 v0, 0xa

    .line 6
    .line 7
    if-eq p1, v0, :cond_1

    .line 8
    .line 9
    const/16 v0, 0xc

    .line 10
    .line 11
    if-eq p1, v0, :cond_1

    .line 12
    .line 13
    const/16 v0, 0xd

    .line 14
    .line 15
    if-eq p1, v0, :cond_1

    .line 16
    .line 17
    const/16 v0, 0x20

    .line 18
    .line 19
    if-eq p1, v0, :cond_1

    .line 20
    .line 21
    const/16 v0, 0x23

    .line 22
    .line 23
    if-eq p1, v0, :cond_0

    .line 24
    .line 25
    const/16 v0, 0x2c

    .line 26
    .line 27
    if-eq p1, v0, :cond_1

    .line 28
    .line 29
    const/16 v0, 0x2f

    .line 30
    .line 31
    if-eq p1, v0, :cond_0

    .line 32
    .line 33
    const/16 v0, 0x3d

    .line 34
    .line 35
    if-eq p1, v0, :cond_0

    .line 36
    .line 37
    const/16 v0, 0x7b

    .line 38
    .line 39
    if-eq p1, v0, :cond_1

    .line 40
    .line 41
    const/16 v0, 0x7d

    .line 42
    .line 43
    if-eq p1, v0, :cond_1

    .line 44
    .line 45
    const/16 v0, 0x3a

    .line 46
    .line 47
    if-eq p1, v0, :cond_1

    .line 48
    .line 49
    const/16 v0, 0x3b

    .line 50
    .line 51
    if-eq p1, v0, :cond_0

    .line 52
    .line 53
    packed-switch p1, :pswitch_data_0

    .line 54
    .line 55
    .line 56
    const/4 p1, 0x1

    .line 57
    return p1

    .line 58
    :cond_0
    :pswitch_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzico;->zzt()V

    .line 59
    .line 60
    .line 61
    :cond_1
    :pswitch_1
    const/4 p1, 0x0

    .line 62
    return p1

    .line 63
    :pswitch_data_0
    .packed-switch 0x5b
        :pswitch_1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method private final zzo(C)Ljava/lang/String;
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget v1, p0, Lcom/google/android/gms/internal/ads/zzico;->zze:I

    .line 3
    .line 4
    iget v2, p0, Lcom/google/android/gms/internal/ads/zzico;->zzf:I

    .line 5
    .line 6
    move v3, v2

    .line 7
    move v2, v1

    .line 8
    :goto_1
    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzico;->zzd:[C

    .line 9
    .line 10
    const/16 v5, 0x10

    .line 11
    .line 12
    const/4 v6, 0x1

    .line 13
    if-ge v1, v3, :cond_1a

    .line 14
    .line 15
    add-int/lit8 v7, v1, 0x1

    .line 16
    .line 17
    aget-char v1, v4, v1

    .line 18
    .line 19
    iget-object v8, p0, Lcom/google/android/gms/internal/ads/zzico;->zzc:Lcom/google/android/gms/internal/ads/zzibw;

    .line 20
    .line 21
    sget-object v9, Lcom/google/android/gms/internal/ads/zzibw;->zzc:Lcom/google/android/gms/internal/ads/zzibw;

    .line 22
    .line 23
    if-ne v8, v9, :cond_1

    .line 24
    .line 25
    const/16 v8, 0x20

    .line 26
    .line 27
    if-lt v1, v8, :cond_0

    .line 28
    .line 29
    goto :goto_2

    .line 30
    :cond_0
    const-string p1, "Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode"

    .line 31
    .line 32
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzico;->zzv(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzicr;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    throw p1

    .line 37
    :cond_1
    :goto_2
    if-ne v1, p1, :cond_3

    .line 38
    .line 39
    sub-int p1, v7, v2

    .line 40
    .line 41
    add-int/lit8 p1, p1, -0x1

    .line 42
    .line 43
    iput v7, p0, Lcom/google/android/gms/internal/ads/zzico;->zze:I

    .line 44
    .line 45
    if-nez v0, :cond_2

    .line 46
    .line 47
    new-instance v0, Ljava/lang/String;

    .line 48
    .line 49
    invoke-direct {v0, v4, v2, p1}, Ljava/lang/String;-><init>([CII)V

    .line 50
    .line 51
    .line 52
    return-object v0

    .line 53
    :cond_2
    invoke-virtual {v0, v4, v2, p1}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    return-object p1

    .line 61
    :cond_3
    const/16 v8, 0x5c

    .line 62
    .line 63
    const/16 v10, 0xa

    .line 64
    .line 65
    if-ne v1, v8, :cond_18

    .line 66
    .line 67
    sub-int v1, v7, v2

    .line 68
    .line 69
    add-int/lit8 v3, v1, -0x1

    .line 70
    .line 71
    iput v7, p0, Lcom/google/android/gms/internal/ads/zzico;->zze:I

    .line 72
    .line 73
    if-nez v0, :cond_4

    .line 74
    .line 75
    new-instance v0, Ljava/lang/StringBuilder;

    .line 76
    .line 77
    add-int/2addr v1, v1

    .line 78
    invoke-static {v1, v5}, Ljava/lang/Math;->max(II)I

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 83
    .line 84
    .line 85
    :cond_4
    invoke-virtual {v0, v4, v2, v3}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    iget v1, p0, Lcom/google/android/gms/internal/ads/zzico;->zze:I

    .line 89
    .line 90
    iget v2, p0, Lcom/google/android/gms/internal/ads/zzico;->zzf:I

    .line 91
    .line 92
    const-string v3, "Unterminated escape sequence"

    .line 93
    .line 94
    if-ne v1, v2, :cond_6

    .line 95
    .line 96
    invoke-direct {p0, v6}, Lcom/google/android/gms/internal/ads/zzico;->zzr(I)Z

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    if-eqz v1, :cond_5

    .line 101
    .line 102
    goto :goto_3

    .line 103
    :cond_5
    invoke-direct {p0, v3}, Lcom/google/android/gms/internal/ads/zzico;->zzv(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzicr;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    throw p1

    .line 108
    :cond_6
    :goto_3
    iget v1, p0, Lcom/google/android/gms/internal/ads/zzico;->zze:I

    .line 109
    .line 110
    add-int/lit8 v2, v1, 0x1

    .line 111
    .line 112
    iput v2, p0, Lcom/google/android/gms/internal/ads/zzico;->zze:I

    .line 113
    .line 114
    aget-char v5, v4, v1

    .line 115
    .line 116
    if-eq v5, v10, :cond_12

    .line 117
    .line 118
    const/16 v2, 0x22

    .line 119
    .line 120
    if-eq v5, v2, :cond_14

    .line 121
    .line 122
    const/16 v2, 0x27

    .line 123
    .line 124
    if-eq v5, v2, :cond_13

    .line 125
    .line 126
    const/16 v2, 0x2f

    .line 127
    .line 128
    if-eq v5, v2, :cond_14

    .line 129
    .line 130
    if-eq v5, v8, :cond_14

    .line 131
    .line 132
    const/16 v2, 0x62

    .line 133
    .line 134
    if-eq v5, v2, :cond_11

    .line 135
    .line 136
    const/16 v2, 0x66

    .line 137
    .line 138
    if-eq v5, v2, :cond_10

    .line 139
    .line 140
    const/16 v6, 0x6e

    .line 141
    .line 142
    if-eq v5, v6, :cond_15

    .line 143
    .line 144
    const/16 v6, 0x72

    .line 145
    .line 146
    if-eq v5, v6, :cond_f

    .line 147
    .line 148
    const/16 v6, 0x74

    .line 149
    .line 150
    if-eq v5, v6, :cond_e

    .line 151
    .line 152
    const/16 v6, 0x75

    .line 153
    .line 154
    if-ne v5, v6, :cond_d

    .line 155
    .line 156
    add-int/lit8 v1, v1, 0x5

    .line 157
    .line 158
    iget v5, p0, Lcom/google/android/gms/internal/ads/zzico;->zzf:I

    .line 159
    .line 160
    const/4 v6, 0x4

    .line 161
    if-le v1, v5, :cond_8

    .line 162
    .line 163
    invoke-direct {p0, v6}, Lcom/google/android/gms/internal/ads/zzico;->zzr(I)Z

    .line 164
    .line 165
    .line 166
    move-result v1

    .line 167
    if-eqz v1, :cond_7

    .line 168
    .line 169
    goto :goto_4

    .line 170
    :cond_7
    invoke-direct {p0, v3}, Lcom/google/android/gms/internal/ads/zzico;->zzv(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzicr;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    throw p1

    .line 175
    :cond_8
    :goto_4
    iget v1, p0, Lcom/google/android/gms/internal/ads/zzico;->zze:I

    .line 176
    .line 177
    add-int/lit8 v3, v1, 0x4

    .line 178
    .line 179
    const/4 v5, 0x0

    .line 180
    :goto_5
    if-ge v1, v3, :cond_c

    .line 181
    .line 182
    shl-int/lit8 v5, v5, 0x4

    .line 183
    .line 184
    aget-char v7, v4, v1

    .line 185
    .line 186
    const/16 v8, 0x30

    .line 187
    .line 188
    if-lt v7, v8, :cond_9

    .line 189
    .line 190
    const/16 v8, 0x39

    .line 191
    .line 192
    if-gt v7, v8, :cond_9

    .line 193
    .line 194
    add-int/lit8 v7, v7, -0x30

    .line 195
    .line 196
    :goto_6
    add-int/2addr v7, v5

    .line 197
    move v5, v7

    .line 198
    goto :goto_7

    .line 199
    :cond_9
    const/16 v8, 0x61

    .line 200
    .line 201
    if-lt v7, v8, :cond_a

    .line 202
    .line 203
    if-gt v7, v2, :cond_a

    .line 204
    .line 205
    add-int/lit8 v7, v7, -0x57

    .line 206
    .line 207
    goto :goto_6

    .line 208
    :cond_a
    const/16 v8, 0x41

    .line 209
    .line 210
    if-lt v7, v8, :cond_b

    .line 211
    .line 212
    const/16 v8, 0x46

    .line 213
    .line 214
    if-gt v7, v8, :cond_b

    .line 215
    .line 216
    add-int/lit8 v7, v7, -0x37

    .line 217
    .line 218
    goto :goto_6

    .line 219
    :goto_7
    add-int/lit8 v1, v1, 0x1

    .line 220
    .line 221
    goto :goto_5

    .line 222
    :cond_b
    new-instance p1, Ljava/lang/String;

    .line 223
    .line 224
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzico;->zze:I

    .line 225
    .line 226
    invoke-direct {p1, v4, v0, v6}, Ljava/lang/String;-><init>([CII)V

    .line 227
    .line 228
    .line 229
    const-string v0, "Malformed Unicode escape \\u"

    .line 230
    .line 231
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object p1

    .line 235
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzico;->zzv(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzicr;

    .line 236
    .line 237
    .line 238
    move-result-object p1

    .line 239
    throw p1

    .line 240
    :cond_c
    iget v1, p0, Lcom/google/android/gms/internal/ads/zzico;->zze:I

    .line 241
    .line 242
    add-int/2addr v1, v6

    .line 243
    iput v1, p0, Lcom/google/android/gms/internal/ads/zzico;->zze:I

    .line 244
    .line 245
    int-to-char v10, v5

    .line 246
    goto :goto_8

    .line 247
    :cond_d
    const-string p1, "Invalid escape sequence"

    .line 248
    .line 249
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzico;->zzv(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzicr;

    .line 250
    .line 251
    .line 252
    move-result-object p1

    .line 253
    throw p1

    .line 254
    :cond_e
    const/16 v10, 0x9

    .line 255
    .line 256
    goto :goto_8

    .line 257
    :cond_f
    const/16 v10, 0xd

    .line 258
    .line 259
    goto :goto_8

    .line 260
    :cond_10
    const/16 v10, 0xc

    .line 261
    .line 262
    goto :goto_8

    .line 263
    :cond_11
    const/16 v10, 0x8

    .line 264
    .line 265
    goto :goto_8

    .line 266
    :cond_12
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzico;->zzc:Lcom/google/android/gms/internal/ads/zzibw;

    .line 267
    .line 268
    if-eq v1, v9, :cond_17

    .line 269
    .line 270
    iget v1, p0, Lcom/google/android/gms/internal/ads/zzico;->zzg:I

    .line 271
    .line 272
    add-int/2addr v1, v6

    .line 273
    iput v1, p0, Lcom/google/android/gms/internal/ads/zzico;->zzg:I

    .line 274
    .line 275
    iput v2, p0, Lcom/google/android/gms/internal/ads/zzico;->zzh:I

    .line 276
    .line 277
    :cond_13
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzico;->zzc:Lcom/google/android/gms/internal/ads/zzibw;

    .line 278
    .line 279
    if-eq v1, v9, :cond_16

    .line 280
    .line 281
    :cond_14
    move v10, v5

    .line 282
    :cond_15
    :goto_8
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 283
    .line 284
    .line 285
    iget v2, p0, Lcom/google/android/gms/internal/ads/zzico;->zze:I

    .line 286
    .line 287
    iget v3, p0, Lcom/google/android/gms/internal/ads/zzico;->zzf:I

    .line 288
    .line 289
    move v1, v2

    .line 290
    goto/16 :goto_1

    .line 291
    .line 292
    :cond_16
    const-string p1, "Invalid escaped character \"\'\" in strict mode"

    .line 293
    .line 294
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzico;->zzv(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzicr;

    .line 295
    .line 296
    .line 297
    move-result-object p1

    .line 298
    throw p1

    .line 299
    :cond_17
    const-string p1, "Cannot escape a newline character in strict mode"

    .line 300
    .line 301
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzico;->zzv(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzicr;

    .line 302
    .line 303
    .line 304
    move-result-object p1

    .line 305
    throw p1

    .line 306
    :cond_18
    if-ne v1, v10, :cond_19

    .line 307
    .line 308
    iget v1, p0, Lcom/google/android/gms/internal/ads/zzico;->zzg:I

    .line 309
    .line 310
    add-int/2addr v1, v6

    .line 311
    iput v1, p0, Lcom/google/android/gms/internal/ads/zzico;->zzg:I

    .line 312
    .line 313
    iput v7, p0, Lcom/google/android/gms/internal/ads/zzico;->zzh:I

    .line 314
    .line 315
    :cond_19
    move v1, v7

    .line 316
    goto/16 :goto_1

    .line 317
    .line 318
    :cond_1a
    sub-int v3, v1, v2

    .line 319
    .line 320
    if-nez v0, :cond_1b

    .line 321
    .line 322
    add-int v0, v3, v3

    .line 323
    .line 324
    new-instance v7, Ljava/lang/StringBuilder;

    .line 325
    .line 326
    invoke-static {v0, v5}, Ljava/lang/Math;->max(II)I

    .line 327
    .line 328
    .line 329
    move-result v0

    .line 330
    invoke-direct {v7, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 331
    .line 332
    .line 333
    move-object v0, v7

    .line 334
    :cond_1b
    invoke-virtual {v0, v4, v2, v3}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    .line 335
    .line 336
    .line 337
    iput v1, p0, Lcom/google/android/gms/internal/ads/zzico;->zze:I

    .line 338
    .line 339
    invoke-direct {p0, v6}, Lcom/google/android/gms/internal/ads/zzico;->zzr(I)Z

    .line 340
    .line 341
    .line 342
    move-result v1

    .line 343
    if-eqz v1, :cond_1c

    .line 344
    .line 345
    goto/16 :goto_0

    .line 346
    .line 347
    :cond_1c
    const-string p1, "Unterminated string"

    .line 348
    .line 349
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzico;->zzv(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzicr;

    .line 350
    .line 351
    .line 352
    move-result-object p1

    .line 353
    throw p1
.end method

.method private final zzp()Ljava/lang/String;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    :cond_0
    move v2, v0

    .line 4
    :goto_0
    iget v3, p0, Lcom/google/android/gms/internal/ads/zzico;->zze:I

    .line 5
    .line 6
    add-int/2addr v3, v2

    .line 7
    iget v4, p0, Lcom/google/android/gms/internal/ads/zzico;->zzf:I

    .line 8
    .line 9
    if-ge v3, v4, :cond_2

    .line 10
    .line 11
    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzico;->zzd:[C

    .line 12
    .line 13
    aget-char v3, v4, v3

    .line 14
    .line 15
    const/16 v4, 0x9

    .line 16
    .line 17
    if-eq v3, v4, :cond_3

    .line 18
    .line 19
    const/16 v4, 0xa

    .line 20
    .line 21
    if-eq v3, v4, :cond_3

    .line 22
    .line 23
    const/16 v4, 0xc

    .line 24
    .line 25
    if-eq v3, v4, :cond_3

    .line 26
    .line 27
    const/16 v4, 0xd

    .line 28
    .line 29
    if-eq v3, v4, :cond_3

    .line 30
    .line 31
    const/16 v4, 0x20

    .line 32
    .line 33
    if-eq v3, v4, :cond_3

    .line 34
    .line 35
    const/16 v4, 0x23

    .line 36
    .line 37
    if-eq v3, v4, :cond_1

    .line 38
    .line 39
    const/16 v4, 0x2c

    .line 40
    .line 41
    if-eq v3, v4, :cond_3

    .line 42
    .line 43
    const/16 v4, 0x2f

    .line 44
    .line 45
    if-eq v3, v4, :cond_1

    .line 46
    .line 47
    const/16 v4, 0x3d

    .line 48
    .line 49
    if-eq v3, v4, :cond_1

    .line 50
    .line 51
    const/16 v4, 0x7b

    .line 52
    .line 53
    if-eq v3, v4, :cond_3

    .line 54
    .line 55
    const/16 v4, 0x7d

    .line 56
    .line 57
    if-eq v3, v4, :cond_3

    .line 58
    .line 59
    const/16 v4, 0x3a

    .line 60
    .line 61
    if-eq v3, v4, :cond_3

    .line 62
    .line 63
    const/16 v4, 0x3b

    .line 64
    .line 65
    if-eq v3, v4, :cond_1

    .line 66
    .line 67
    packed-switch v3, :pswitch_data_0

    .line 68
    .line 69
    .line 70
    add-int/lit8 v2, v2, 0x1

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_1
    :pswitch_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzico;->zzt()V

    .line 74
    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_2
    const/16 v3, 0x400

    .line 78
    .line 79
    if-ge v2, v3, :cond_4

    .line 80
    .line 81
    add-int/lit8 v3, v2, 0x1

    .line 82
    .line 83
    invoke-direct {p0, v3}, Lcom/google/android/gms/internal/ads/zzico;->zzr(I)Z

    .line 84
    .line 85
    .line 86
    move-result v3

    .line 87
    if-eqz v3, :cond_3

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_3
    :goto_1
    :pswitch_1
    move v0, v2

    .line 91
    goto :goto_2

    .line 92
    :cond_4
    if-nez v1, :cond_5

    .line 93
    .line 94
    new-instance v1, Ljava/lang/StringBuilder;

    .line 95
    .line 96
    const/16 v3, 0x10

    .line 97
    .line 98
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    .line 99
    .line 100
    .line 101
    move-result v3

    .line 102
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 103
    .line 104
    .line 105
    :cond_5
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzico;->zzd:[C

    .line 106
    .line 107
    iget v4, p0, Lcom/google/android/gms/internal/ads/zzico;->zze:I

    .line 108
    .line 109
    invoke-virtual {v1, v3, v4, v2}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    iget v3, p0, Lcom/google/android/gms/internal/ads/zzico;->zze:I

    .line 113
    .line 114
    add-int/2addr v3, v2

    .line 115
    iput v3, p0, Lcom/google/android/gms/internal/ads/zzico;->zze:I

    .line 116
    .line 117
    const/4 v2, 0x1

    .line 118
    invoke-direct {p0, v2}, Lcom/google/android/gms/internal/ads/zzico;->zzr(I)Z

    .line 119
    .line 120
    .line 121
    move-result v2

    .line 122
    if-nez v2, :cond_0

    .line 123
    .line 124
    :goto_2
    if-nez v1, :cond_6

    .line 125
    .line 126
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzico;->zzd:[C

    .line 127
    .line 128
    new-instance v2, Ljava/lang/String;

    .line 129
    .line 130
    iget v3, p0, Lcom/google/android/gms/internal/ads/zzico;->zze:I

    .line 131
    .line 132
    invoke-direct {v2, v1, v3, v0}, Ljava/lang/String;-><init>([CII)V

    .line 133
    .line 134
    .line 135
    goto :goto_3

    .line 136
    :cond_6
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzico;->zzd:[C

    .line 137
    .line 138
    iget v3, p0, Lcom/google/android/gms/internal/ads/zzico;->zze:I

    .line 139
    .line 140
    invoke-virtual {v1, v2, v3, v0}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    :goto_3
    iget v1, p0, Lcom/google/android/gms/internal/ads/zzico;->zze:I

    .line 148
    .line 149
    add-int/2addr v1, v0

    .line 150
    iput v1, p0, Lcom/google/android/gms/internal/ads/zzico;->zze:I

    .line 151
    .line 152
    return-object v2

    .line 153
    :pswitch_data_0
    .packed-switch 0x5b
        :pswitch_1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method private final zzq(I)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzicr;
        }
    .end annotation

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzico;->zzl:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, -0x1

    .line 4
    .line 5
    const/16 v2, 0x500

    .line 6
    .line 7
    if-ge v1, v2, :cond_1

    .line 8
    .line 9
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzico;->zzk:[I

    .line 10
    .line 11
    array-length v2, v1

    .line 12
    if-ne v0, v2, :cond_0

    .line 13
    .line 14
    add-int/2addr v0, v0

    .line 15
    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([II)[I

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzico;->zzk:[I

    .line 20
    .line 21
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzico;->zzn:[I

    .line 22
    .line 23
    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([II)[I

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    iput-object v1, p0, Lcom/google/android/gms/internal/ads/zzico;->zzn:[I

    .line 28
    .line 29
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzico;->zzm:[Ljava/lang/String;

    .line 30
    .line 31
    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, [Ljava/lang/String;

    .line 36
    .line 37
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzico;->zzm:[Ljava/lang/String;

    .line 38
    .line 39
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzico;->zzk:[I

    .line 40
    .line 41
    iget v1, p0, Lcom/google/android/gms/internal/ads/zzico;->zzl:I

    .line 42
    .line 43
    add-int/lit8 v2, v1, 0x1

    .line 44
    .line 45
    iput v2, p0, Lcom/google/android/gms/internal/ads/zzico;->zzl:I

    .line 46
    .line 47
    aput p1, v0, v1

    .line 48
    .line 49
    return-void

    .line 50
    :cond_1
    new-instance p1, Lcom/google/android/gms/internal/ads/zzicr;

    .line 51
    .line 52
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzico;->zzl()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    new-instance v2, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    add-int/lit8 v1, v1, 0x1a

    .line 63
    .line 64
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 65
    .line 66
    .line 67
    const-string v1, "Nesting limit 1280 reached"

    .line 68
    .line 69
    invoke-static {v2, v1, v0}, Lwg/b;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/ads/zzicr;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    throw p1
.end method

.method private final zzr(I)Z
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzico;->zzh:I

    .line 2
    .line 3
    iget v1, p0, Lcom/google/android/gms/internal/ads/zzico;->zze:I

    .line 4
    .line 5
    sub-int/2addr v0, v1

    .line 6
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzico;->zzh:I

    .line 7
    .line 8
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzico;->zzd:[C

    .line 9
    .line 10
    iget v2, p0, Lcom/google/android/gms/internal/ads/zzico;->zzf:I

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    if-eq v2, v1, :cond_0

    .line 14
    .line 15
    sub-int/2addr v2, v1

    .line 16
    iput v2, p0, Lcom/google/android/gms/internal/ads/zzico;->zzf:I

    .line 17
    .line 18
    invoke-static {v0, v1, v0, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iput v3, p0, Lcom/google/android/gms/internal/ads/zzico;->zzf:I

    .line 23
    .line 24
    :goto_0
    iput v3, p0, Lcom/google/android/gms/internal/ads/zzico;->zze:I

    .line 25
    .line 26
    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzico;->zzb:Ljava/io/Reader;

    .line 27
    .line 28
    iget v2, p0, Lcom/google/android/gms/internal/ads/zzico;->zzf:I

    .line 29
    .line 30
    rsub-int v4, v2, 0x400

    .line 31
    .line 32
    invoke-virtual {v1, v0, v2, v4}, Ljava/io/Reader;->read([CII)I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    const/4 v2, -0x1

    .line 37
    if-eq v1, v2, :cond_3

    .line 38
    .line 39
    iget v2, p0, Lcom/google/android/gms/internal/ads/zzico;->zzf:I

    .line 40
    .line 41
    add-int/2addr v2, v1

    .line 42
    iput v2, p0, Lcom/google/android/gms/internal/ads/zzico;->zzf:I

    .line 43
    .line 44
    iget v1, p0, Lcom/google/android/gms/internal/ads/zzico;->zzg:I

    .line 45
    .line 46
    const/4 v4, 0x1

    .line 47
    if-nez v1, :cond_2

    .line 48
    .line 49
    iget v1, p0, Lcom/google/android/gms/internal/ads/zzico;->zzh:I

    .line 50
    .line 51
    if-nez v1, :cond_2

    .line 52
    .line 53
    if-lez v2, :cond_2

    .line 54
    .line 55
    aget-char v1, v0, v3

    .line 56
    .line 57
    const v5, 0xfeff

    .line 58
    .line 59
    .line 60
    if-ne v1, v5, :cond_2

    .line 61
    .line 62
    iget v1, p0, Lcom/google/android/gms/internal/ads/zzico;->zze:I

    .line 63
    .line 64
    add-int/2addr v1, v4

    .line 65
    iput v1, p0, Lcom/google/android/gms/internal/ads/zzico;->zze:I

    .line 66
    .line 67
    iput v4, p0, Lcom/google/android/gms/internal/ads/zzico;->zzh:I

    .line 68
    .line 69
    add-int/lit8 p1, p1, 0x1

    .line 70
    .line 71
    :cond_2
    if-lt v2, p1, :cond_1

    .line 72
    .line 73
    return v4

    .line 74
    :cond_3
    return v3
.end method

.method private final zzs(Z)I
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzico;->zze:I

    .line 2
    .line 3
    iget v1, p0, Lcom/google/android/gms/internal/ads/zzico;->zzf:I

    .line 4
    .line 5
    :goto_0
    const/4 v2, 0x1

    .line 6
    if-ne v0, v1, :cond_2

    .line 7
    .line 8
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzico;->zze:I

    .line 9
    .line 10
    invoke-direct {p0, v2}, Lcom/google/android/gms/internal/ads/zzico;->zzr(I)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    if-nez p1, :cond_0

    .line 17
    .line 18
    const/4 p1, -0x1

    .line 19
    return p1

    .line 20
    :cond_0
    new-instance p1, Ljava/io/EOFException;

    .line 21
    .line 22
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzico;->zzl()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const-string v1, "End of input"

    .line 27
    .line 28
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-direct {p1, v0}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw p1

    .line 36
    :cond_1
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzico;->zze:I

    .line 37
    .line 38
    iget v1, p0, Lcom/google/android/gms/internal/ads/zzico;->zzf:I

    .line 39
    .line 40
    :cond_2
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzico;->zzd:[C

    .line 41
    .line 42
    add-int/lit8 v4, v0, 0x1

    .line 43
    .line 44
    aget-char v5, v3, v0

    .line 45
    .line 46
    const/16 v6, 0xa

    .line 47
    .line 48
    if-ne v5, v6, :cond_3

    .line 49
    .line 50
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzico;->zzg:I

    .line 51
    .line 52
    add-int/2addr v0, v2

    .line 53
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzico;->zzg:I

    .line 54
    .line 55
    iput v4, p0, Lcom/google/android/gms/internal/ads/zzico;->zzh:I

    .line 56
    .line 57
    goto/16 :goto_5

    .line 58
    .line 59
    :cond_3
    const/16 v7, 0x20

    .line 60
    .line 61
    if-eq v5, v7, :cond_f

    .line 62
    .line 63
    const/16 v7, 0xd

    .line 64
    .line 65
    if-eq v5, v7, :cond_f

    .line 66
    .line 67
    const/16 v7, 0x9

    .line 68
    .line 69
    if-ne v5, v7, :cond_4

    .line 70
    .line 71
    goto/16 :goto_5

    .line 72
    .line 73
    :cond_4
    const/16 v7, 0x2f

    .line 74
    .line 75
    if-ne v5, v7, :cond_d

    .line 76
    .line 77
    iput v4, p0, Lcom/google/android/gms/internal/ads/zzico;->zze:I

    .line 78
    .line 79
    const/4 v5, 0x2

    .line 80
    if-ne v4, v1, :cond_5

    .line 81
    .line 82
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzico;->zze:I

    .line 83
    .line 84
    invoke-direct {p0, v5}, Lcom/google/android/gms/internal/ads/zzico;->zzr(I)Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    iget v1, p0, Lcom/google/android/gms/internal/ads/zzico;->zze:I

    .line 89
    .line 90
    add-int/2addr v1, v2

    .line 91
    iput v1, p0, Lcom/google/android/gms/internal/ads/zzico;->zze:I

    .line 92
    .line 93
    if-nez v0, :cond_5

    .line 94
    .line 95
    return v7

    .line 96
    :cond_5
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzico;->zzt()V

    .line 97
    .line 98
    .line 99
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzico;->zze:I

    .line 100
    .line 101
    aget-char v1, v3, v0

    .line 102
    .line 103
    const/16 v4, 0x2a

    .line 104
    .line 105
    if-eq v1, v4, :cond_7

    .line 106
    .line 107
    if-eq v1, v7, :cond_6

    .line 108
    .line 109
    return v7

    .line 110
    :cond_6
    add-int/lit8 v0, v0, 0x1

    .line 111
    .line 112
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzico;->zze:I

    .line 113
    .line 114
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzico;->zzu()V

    .line 115
    .line 116
    .line 117
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzico;->zze:I

    .line 118
    .line 119
    iget v1, p0, Lcom/google/android/gms/internal/ads/zzico;->zzf:I

    .line 120
    .line 121
    goto :goto_0

    .line 122
    :cond_7
    add-int/lit8 v0, v0, 0x1

    .line 123
    .line 124
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzico;->zze:I

    .line 125
    .line 126
    :goto_1
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzico;->zze:I

    .line 127
    .line 128
    add-int/2addr v0, v5

    .line 129
    iget v1, p0, Lcom/google/android/gms/internal/ads/zzico;->zzf:I

    .line 130
    .line 131
    if-le v0, v1, :cond_9

    .line 132
    .line 133
    invoke-direct {p0, v5}, Lcom/google/android/gms/internal/ads/zzico;->zzr(I)Z

    .line 134
    .line 135
    .line 136
    move-result v0

    .line 137
    if-eqz v0, :cond_8

    .line 138
    .line 139
    goto :goto_2

    .line 140
    :cond_8
    const-string p1, "Unterminated comment"

    .line 141
    .line 142
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzico;->zzv(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzicr;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    throw p1

    .line 147
    :cond_9
    :goto_2
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzico;->zze:I

    .line 148
    .line 149
    aget-char v1, v3, v0

    .line 150
    .line 151
    if-ne v1, v6, :cond_a

    .line 152
    .line 153
    iget v1, p0, Lcom/google/android/gms/internal/ads/zzico;->zzg:I

    .line 154
    .line 155
    add-int/2addr v1, v2

    .line 156
    iput v1, p0, Lcom/google/android/gms/internal/ads/zzico;->zzg:I

    .line 157
    .line 158
    add-int/lit8 v0, v0, 0x1

    .line 159
    .line 160
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzico;->zzh:I

    .line 161
    .line 162
    goto :goto_4

    .line 163
    :cond_a
    const/4 v0, 0x0

    .line 164
    :goto_3
    if-ge v0, v5, :cond_c

    .line 165
    .line 166
    iget v1, p0, Lcom/google/android/gms/internal/ads/zzico;->zze:I

    .line 167
    .line 168
    add-int/2addr v1, v0

    .line 169
    aget-char v1, v3, v1

    .line 170
    .line 171
    const-string v4, "*/"

    .line 172
    .line 173
    invoke-virtual {v4, v0}, Ljava/lang/String;->charAt(I)C

    .line 174
    .line 175
    .line 176
    move-result v4

    .line 177
    if-ne v1, v4, :cond_b

    .line 178
    .line 179
    add-int/lit8 v0, v0, 0x1

    .line 180
    .line 181
    goto :goto_3

    .line 182
    :cond_b
    :goto_4
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzico;->zze:I

    .line 183
    .line 184
    add-int/2addr v0, v2

    .line 185
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzico;->zze:I

    .line 186
    .line 187
    goto :goto_1

    .line 188
    :cond_c
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzico;->zze:I

    .line 189
    .line 190
    add-int/2addr v0, v5

    .line 191
    iget v1, p0, Lcom/google/android/gms/internal/ads/zzico;->zzf:I

    .line 192
    .line 193
    goto/16 :goto_0

    .line 194
    .line 195
    :cond_d
    const/16 v0, 0x23

    .line 196
    .line 197
    if-ne v5, v0, :cond_e

    .line 198
    .line 199
    iput v4, p0, Lcom/google/android/gms/internal/ads/zzico;->zze:I

    .line 200
    .line 201
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzico;->zzt()V

    .line 202
    .line 203
    .line 204
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzico;->zzu()V

    .line 205
    .line 206
    .line 207
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzico;->zze:I

    .line 208
    .line 209
    iget v1, p0, Lcom/google/android/gms/internal/ads/zzico;->zzf:I

    .line 210
    .line 211
    goto/16 :goto_0

    .line 212
    .line 213
    :cond_e
    iput v4, p0, Lcom/google/android/gms/internal/ads/zzico;->zze:I

    .line 214
    .line 215
    return v5

    .line 216
    :cond_f
    :goto_5
    move v0, v4

    .line 217
    goto/16 :goto_0
.end method

.method private final zzt()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzicr;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzico;->zzc:Lcom/google/android/gms/internal/ads/zzibw;

    .line 2
    .line 3
    sget-object v1, Lcom/google/android/gms/internal/ads/zzibw;->zza:Lcom/google/android/gms/internal/ads/zzibw;

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    const-string v0, "Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON"

    .line 9
    .line 10
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzico;->zzv(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzicr;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    throw v0
.end method

.method private final zzu()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    :cond_0
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzico;->zze:I

    .line 2
    .line 3
    iget v1, p0, Lcom/google/android/gms/internal/ads/zzico;->zzf:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-lt v0, v1, :cond_1

    .line 7
    .line 8
    invoke-direct {p0, v2}, Lcom/google/android/gms/internal/ads/zzico;->zzr(I)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_3

    .line 13
    .line 14
    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzico;->zzd:[C

    .line 15
    .line 16
    iget v1, p0, Lcom/google/android/gms/internal/ads/zzico;->zze:I

    .line 17
    .line 18
    add-int/lit8 v3, v1, 0x1

    .line 19
    .line 20
    iput v3, p0, Lcom/google/android/gms/internal/ads/zzico;->zze:I

    .line 21
    .line 22
    aget-char v0, v0, v1

    .line 23
    .line 24
    const/16 v1, 0xa

    .line 25
    .line 26
    if-ne v0, v1, :cond_2

    .line 27
    .line 28
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzico;->zzg:I

    .line 29
    .line 30
    add-int/2addr v0, v2

    .line 31
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzico;->zzg:I

    .line 32
    .line 33
    iput v3, p0, Lcom/google/android/gms/internal/ads/zzico;->zzh:I

    .line 34
    .line 35
    return-void

    .line 36
    :cond_2
    const/16 v1, 0xd

    .line 37
    .line 38
    if-ne v0, v1, :cond_0

    .line 39
    .line 40
    :cond_3
    return-void
.end method

.method private final zzv(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzicr;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzicr;
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzicr;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzico;->zzl()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    add-int/2addr v3, v2

    .line 16
    new-instance v2, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    add-int/lit8 v3, v3, 0x4f

    .line 19
    .line 20
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 21
    .line 22
    .line 23
    const-string v3, "\nSee https://github.com/google/gson/blob/main/Troubleshooting.md#malformed-json"

    .line 24
    .line 25
    invoke-static {v2, p1, v1, v3}, LVa/M6;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/ads/zzicr;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw v0
.end method

.method private final zzw(Ljava/lang/String;)Ljava/lang/IllegalStateException;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzico;->zzm()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzico;->zzm()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzicp;->zza(I)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzico;->zzl()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    add-int/lit8 v5, v5, 0x12

    .line 28
    .line 29
    invoke-static {v5, v4, v2}, LA7/p0;->g(IILjava/lang/String;)I

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    const/16 v5, 0x9

    .line 34
    .line 35
    if-ne v0, v5, :cond_0

    .line 36
    .line 37
    const-string v0, "adapter-not-null-safe"

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    const-string v0, "unexpected-json-structure"

    .line 41
    .line 42
    :goto_0
    add-int/lit8 v4, v4, 0x5

    .line 43
    .line 44
    new-instance v5, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    const-string v6, "https://github.com/google/gson/blob/main/Troubleshooting.md#"

    .line 47
    .line 48
    invoke-virtual {v6, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 53
    .line 54
    .line 55
    move-result v6

    .line 56
    add-int/2addr v6, v4

    .line 57
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 58
    .line 59
    .line 60
    const-string v4, "Expected "

    .line 61
    .line 62
    const-string v6, " but was "

    .line 63
    .line 64
    invoke-static {v5, v4, p1, v6, v2}, Lka/n;->p(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    const-string p1, "\nSee "

    .line 68
    .line 69
    invoke-static {v5, v3, p1, v0}, LVa/M6;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-direct {v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    return-object v1
.end method


# virtual methods
.method public final close()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzico;->zza:I

    .line 3
    .line 4
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzico;->zzk:[I

    .line 5
    .line 6
    const/16 v2, 0x8

    .line 7
    .line 8
    aput v2, v1, v0

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzico;->zzl:I

    .line 12
    .line 13
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzico;->zzb:Ljava/io/Reader;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/io/Reader;->close()V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "zzico"

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzico;->zzl()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public final zza(Lcom/google/android/gms/internal/ads/zzibw;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzico;->zzc:Lcom/google/android/gms/internal/ads/zzibw;

    .line 5
    .line 6
    return-void
.end method

.method public final zzb()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzico;->zza:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzico;->zzg()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    :cond_0
    const/4 v1, 0x3

    .line 10
    if-ne v0, v1, :cond_1

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzico;->zzq(I)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzico;->zzn:[I

    .line 17
    .line 18
    iget v1, p0, Lcom/google/android/gms/internal/ads/zzico;->zzl:I

    .line 19
    .line 20
    add-int/lit8 v1, v1, -0x1

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    aput v2, v0, v1

    .line 24
    .line 25
    iput v2, p0, Lcom/google/android/gms/internal/ads/zzico;->zza:I

    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    const-string v0, "BEGIN_ARRAY"

    .line 29
    .line 30
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzico;->zzw(Ljava/lang/String;)Ljava/lang/IllegalStateException;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    throw v0
.end method

.method public final zzc()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzico;->zza:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzico;->zzg()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    :cond_0
    const/4 v1, 0x4

    .line 10
    if-ne v0, v1, :cond_1

    .line 11
    .line 12
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzico;->zzl:I

    .line 13
    .line 14
    add-int/lit8 v1, v0, -0x1

    .line 15
    .line 16
    iput v1, p0, Lcom/google/android/gms/internal/ads/zzico;->zzl:I

    .line 17
    .line 18
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzico;->zzn:[I

    .line 19
    .line 20
    add-int/lit8 v0, v0, -0x2

    .line 21
    .line 22
    aget v2, v1, v0

    .line 23
    .line 24
    add-int/lit8 v2, v2, 0x1

    .line 25
    .line 26
    aput v2, v1, v0

    .line 27
    .line 28
    const/4 v0, 0x0

    .line 29
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzico;->zza:I

    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    const-string v0, "END_ARRAY"

    .line 33
    .line 34
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzico;->zzw(Ljava/lang/String;)Ljava/lang/IllegalStateException;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    throw v0
.end method

.method public final zzd()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzico;->zza:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzico;->zzg()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    :cond_0
    const/4 v1, 0x1

    .line 10
    if-ne v0, v1, :cond_1

    .line 11
    .line 12
    const/4 v0, 0x3

    .line 13
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzico;->zzq(I)V

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzico;->zza:I

    .line 18
    .line 19
    return-void

    .line 20
    :cond_1
    const-string v0, "BEGIN_OBJECT"

    .line 21
    .line 22
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzico;->zzw(Ljava/lang/String;)Ljava/lang/IllegalStateException;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    throw v0
.end method

.method public final zze()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzico;->zza:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzico;->zzg()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    :cond_0
    const/4 v1, 0x2

    .line 10
    if-ne v0, v1, :cond_1

    .line 11
    .line 12
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzico;->zzl:I

    .line 13
    .line 14
    add-int/lit8 v1, v0, -0x1

    .line 15
    .line 16
    iput v1, p0, Lcom/google/android/gms/internal/ads/zzico;->zzl:I

    .line 17
    .line 18
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzico;->zzm:[Ljava/lang/String;

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    aput-object v3, v2, v1

    .line 22
    .line 23
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzico;->zzn:[I

    .line 24
    .line 25
    add-int/lit8 v0, v0, -0x2

    .line 26
    .line 27
    aget v2, v1, v0

    .line 28
    .line 29
    add-int/lit8 v2, v2, 0x1

    .line 30
    .line 31
    aput v2, v1, v0

    .line 32
    .line 33
    const/4 v0, 0x0

    .line 34
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzico;->zza:I

    .line 35
    .line 36
    return-void

    .line 37
    :cond_1
    const-string v0, "END_OBJECT"

    .line 38
    .line 39
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzico;->zzw(Ljava/lang/String;)Ljava/lang/IllegalStateException;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    throw v0
.end method

.method public final zzf()Z
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzico;->zza:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzico;->zzg()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    :cond_0
    const/4 v1, 0x2

    .line 10
    if-eq v0, v1, :cond_1

    .line 11
    .line 12
    const/4 v1, 0x4

    .line 13
    if-eq v0, v1, :cond_1

    .line 14
    .line 15
    const/16 v1, 0x11

    .line 16
    .line 17
    if-eq v0, v1, :cond_1

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    return v0

    .line 21
    :cond_1
    const/4 v0, 0x0

    .line 22
    return v0
.end method

.method public final zzg()I
    .locals 24
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzico;->zzk:[I

    .line 4
    .line 5
    iget v2, v0, Lcom/google/android/gms/internal/ads/zzico;->zzl:I

    .line 6
    .line 7
    const/4 v3, -0x1

    .line 8
    add-int/2addr v2, v3

    .line 9
    aget v4, v1, v2

    .line 10
    .line 11
    const/16 v7, 0xa

    .line 12
    .line 13
    const/16 v8, 0x27

    .line 14
    .line 15
    const/16 v9, 0x5d

    .line 16
    .line 17
    const/16 v10, 0x3b

    .line 18
    .line 19
    const/16 v11, 0x2c

    .line 20
    .line 21
    const/4 v12, 0x6

    .line 22
    const/4 v13, 0x3

    .line 23
    const/4 v14, 0x7

    .line 24
    const/4 v15, 0x4

    .line 25
    const/4 v5, 0x5

    .line 26
    const/4 v6, 0x2

    .line 27
    move/from16 v18, v3

    .line 28
    .line 29
    const/4 v3, 0x1

    .line 30
    if-ne v4, v3, :cond_1

    .line 31
    .line 32
    aput v6, v1, v2

    .line 33
    .line 34
    :cond_0
    :goto_0
    const/4 v1, 0x0

    .line 35
    goto/16 :goto_2

    .line 36
    .line 37
    :cond_1
    if-ne v4, v6, :cond_4

    .line 38
    .line 39
    invoke-direct {v0, v3}, Lcom/google/android/gms/internal/ads/zzico;->zzs(Z)I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eq v1, v11, :cond_0

    .line 44
    .line 45
    if-eq v1, v10, :cond_3

    .line 46
    .line 47
    if-ne v1, v9, :cond_2

    .line 48
    .line 49
    move v13, v15

    .line 50
    goto/16 :goto_1c

    .line 51
    .line 52
    :cond_2
    const-string v1, "Unterminated array"

    .line 53
    .line 54
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzico;->zzv(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzicr;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    throw v1

    .line 59
    :cond_3
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzico;->zzt()V

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_4
    const/16 v6, 0x7d

    .line 64
    .line 65
    if-eq v4, v13, :cond_41

    .line 66
    .line 67
    if-ne v4, v5, :cond_5

    .line 68
    .line 69
    move/from16 v19, v15

    .line 70
    .line 71
    const/4 v3, 0x2

    .line 72
    goto/16 :goto_1a

    .line 73
    .line 74
    :cond_5
    if-ne v4, v15, :cond_8

    .line 75
    .line 76
    aput v5, v1, v2

    .line 77
    .line 78
    invoke-direct {v0, v3}, Lcom/google/android/gms/internal/ads/zzico;->zzs(Z)I

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    const/16 v2, 0x3a

    .line 83
    .line 84
    if-eq v1, v2, :cond_0

    .line 85
    .line 86
    const/16 v2, 0x3d

    .line 87
    .line 88
    if-ne v1, v2, :cond_7

    .line 89
    .line 90
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzico;->zzt()V

    .line 91
    .line 92
    .line 93
    iget v1, v0, Lcom/google/android/gms/internal/ads/zzico;->zze:I

    .line 94
    .line 95
    iget v2, v0, Lcom/google/android/gms/internal/ads/zzico;->zzf:I

    .line 96
    .line 97
    if-lt v1, v2, :cond_6

    .line 98
    .line 99
    invoke-direct {v0, v3}, Lcom/google/android/gms/internal/ads/zzico;->zzr(I)Z

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    if-eqz v1, :cond_0

    .line 104
    .line 105
    :cond_6
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzico;->zzd:[C

    .line 106
    .line 107
    iget v2, v0, Lcom/google/android/gms/internal/ads/zzico;->zze:I

    .line 108
    .line 109
    aget-char v1, v1, v2

    .line 110
    .line 111
    const/16 v6, 0x3e

    .line 112
    .line 113
    if-ne v1, v6, :cond_0

    .line 114
    .line 115
    add-int/2addr v2, v3

    .line 116
    iput v2, v0, Lcom/google/android/gms/internal/ads/zzico;->zze:I

    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_7
    const-string v1, "Expected \':\'"

    .line 120
    .line 121
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzico;->zzv(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzicr;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    throw v1

    .line 126
    :cond_8
    if-ne v4, v12, :cond_b

    .line 127
    .line 128
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzico;->zzc:Lcom/google/android/gms/internal/ads/zzibw;

    .line 129
    .line 130
    sget-object v2, Lcom/google/android/gms/internal/ads/zzibw;->zza:Lcom/google/android/gms/internal/ads/zzibw;

    .line 131
    .line 132
    if-ne v1, v2, :cond_a

    .line 133
    .line 134
    invoke-direct {v0, v3}, Lcom/google/android/gms/internal/ads/zzico;->zzs(Z)I

    .line 135
    .line 136
    .line 137
    iget v1, v0, Lcom/google/android/gms/internal/ads/zzico;->zze:I

    .line 138
    .line 139
    add-int/lit8 v2, v1, -0x1

    .line 140
    .line 141
    iput v2, v0, Lcom/google/android/gms/internal/ads/zzico;->zze:I

    .line 142
    .line 143
    add-int/2addr v1, v15

    .line 144
    iget v2, v0, Lcom/google/android/gms/internal/ads/zzico;->zzf:I

    .line 145
    .line 146
    if-le v1, v2, :cond_9

    .line 147
    .line 148
    invoke-direct {v0, v5}, Lcom/google/android/gms/internal/ads/zzico;->zzr(I)Z

    .line 149
    .line 150
    .line 151
    move-result v1

    .line 152
    if-nez v1, :cond_9

    .line 153
    .line 154
    goto :goto_1

    .line 155
    :cond_9
    iget v1, v0, Lcom/google/android/gms/internal/ads/zzico;->zze:I

    .line 156
    .line 157
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzico;->zzd:[C

    .line 158
    .line 159
    aget-char v15, v2, v1

    .line 160
    .line 161
    const/16 v12, 0x29

    .line 162
    .line 163
    if-ne v15, v12, :cond_a

    .line 164
    .line 165
    add-int/lit8 v12, v1, 0x1

    .line 166
    .line 167
    aget-char v12, v2, v12

    .line 168
    .line 169
    if-ne v12, v9, :cond_a

    .line 170
    .line 171
    add-int/lit8 v12, v1, 0x2

    .line 172
    .line 173
    aget-char v12, v2, v12

    .line 174
    .line 175
    if-ne v12, v6, :cond_a

    .line 176
    .line 177
    add-int/lit8 v6, v1, 0x3

    .line 178
    .line 179
    aget-char v6, v2, v6

    .line 180
    .line 181
    if-ne v6, v8, :cond_a

    .line 182
    .line 183
    add-int/lit8 v6, v1, 0x4

    .line 184
    .line 185
    aget-char v2, v2, v6

    .line 186
    .line 187
    if-ne v2, v7, :cond_a

    .line 188
    .line 189
    add-int/2addr v1, v5

    .line 190
    iput v1, v0, Lcom/google/android/gms/internal/ads/zzico;->zze:I

    .line 191
    .line 192
    :cond_a
    :goto_1
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzico;->zzk:[I

    .line 193
    .line 194
    iget v2, v0, Lcom/google/android/gms/internal/ads/zzico;->zzl:I

    .line 195
    .line 196
    add-int/lit8 v2, v2, -0x1

    .line 197
    .line 198
    aput v14, v1, v2

    .line 199
    .line 200
    goto/16 :goto_0

    .line 201
    .line 202
    :cond_b
    if-ne v4, v14, :cond_d

    .line 203
    .line 204
    const/4 v1, 0x0

    .line 205
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzico;->zzs(Z)I

    .line 206
    .line 207
    .line 208
    move-result v2

    .line 209
    move/from16 v6, v18

    .line 210
    .line 211
    if-ne v2, v6, :cond_c

    .line 212
    .line 213
    const/16 v13, 0x11

    .line 214
    .line 215
    goto/16 :goto_1c

    .line 216
    .line 217
    :cond_c
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzico;->zzt()V

    .line 218
    .line 219
    .line 220
    iget v2, v0, Lcom/google/android/gms/internal/ads/zzico;->zze:I

    .line 221
    .line 222
    add-int/2addr v2, v6

    .line 223
    iput v2, v0, Lcom/google/android/gms/internal/ads/zzico;->zze:I

    .line 224
    .line 225
    goto :goto_2

    .line 226
    :cond_d
    const/4 v1, 0x0

    .line 227
    const/16 v2, 0x8

    .line 228
    .line 229
    if-eq v4, v2, :cond_40

    .line 230
    .line 231
    :goto_2
    invoke-direct {v0, v3}, Lcom/google/android/gms/internal/ads/zzico;->zzs(Z)I

    .line 232
    .line 233
    .line 234
    move-result v2

    .line 235
    const/16 v6, 0x22

    .line 236
    .line 237
    if-eq v2, v6, :cond_3f

    .line 238
    .line 239
    if-eq v2, v8, :cond_3e

    .line 240
    .line 241
    if-eq v2, v11, :cond_3a

    .line 242
    .line 243
    if-eq v2, v10, :cond_3a

    .line 244
    .line 245
    const/16 v6, 0x5b

    .line 246
    .line 247
    if-eq v2, v6, :cond_4a

    .line 248
    .line 249
    if-eq v2, v9, :cond_39

    .line 250
    .line 251
    const/16 v4, 0x7b

    .line 252
    .line 253
    if-eq v2, v4, :cond_38

    .line 254
    .line 255
    iget v2, v0, Lcom/google/android/gms/internal/ads/zzico;->zze:I

    .line 256
    .line 257
    const/16 v18, -0x1

    .line 258
    .line 259
    add-int/lit8 v2, v2, -0x1

    .line 260
    .line 261
    iput v2, v0, Lcom/google/android/gms/internal/ads/zzico;->zze:I

    .line 262
    .line 263
    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzico;->zzd:[C

    .line 264
    .line 265
    aget-char v2, v4, v2

    .line 266
    .line 267
    const/16 v6, 0x74

    .line 268
    .line 269
    if-eq v2, v6, :cond_13

    .line 270
    .line 271
    const/16 v6, 0x54

    .line 272
    .line 273
    if-ne v2, v6, :cond_e

    .line 274
    .line 275
    goto :goto_6

    .line 276
    :cond_e
    const/16 v6, 0x66

    .line 277
    .line 278
    if-eq v2, v6, :cond_12

    .line 279
    .line 280
    const/16 v6, 0x46

    .line 281
    .line 282
    if-ne v2, v6, :cond_f

    .line 283
    .line 284
    goto :goto_5

    .line 285
    :cond_f
    const/16 v6, 0x6e

    .line 286
    .line 287
    if-eq v2, v6, :cond_11

    .line 288
    .line 289
    const/16 v6, 0x4e

    .line 290
    .line 291
    if-ne v2, v6, :cond_10

    .line 292
    .line 293
    goto :goto_4

    .line 294
    :cond_10
    :goto_3
    move v8, v1

    .line 295
    goto/16 :goto_9

    .line 296
    .line 297
    :cond_11
    :goto_4
    const-string v2, "NULL"

    .line 298
    .line 299
    const-string v6, "null"

    .line 300
    .line 301
    move v8, v14

    .line 302
    goto :goto_7

    .line 303
    :cond_12
    :goto_5
    const-string v2, "FALSE"

    .line 304
    .line 305
    const-string v6, "false"

    .line 306
    .line 307
    const/4 v8, 0x6

    .line 308
    goto :goto_7

    .line 309
    :cond_13
    :goto_6
    const-string v2, "TRUE"

    .line 310
    .line 311
    const-string v6, "true"

    .line 312
    .line 313
    move v8, v5

    .line 314
    :goto_7
    iget-object v9, v0, Lcom/google/android/gms/internal/ads/zzico;->zzc:Lcom/google/android/gms/internal/ads/zzibw;

    .line 315
    .line 316
    sget-object v10, Lcom/google/android/gms/internal/ads/zzibw;->zzc:Lcom/google/android/gms/internal/ads/zzibw;

    .line 317
    .line 318
    move v11, v1

    .line 319
    :goto_8
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 320
    .line 321
    .line 322
    move-result v12

    .line 323
    if-ge v11, v12, :cond_16

    .line 324
    .line 325
    iget v12, v0, Lcom/google/android/gms/internal/ads/zzico;->zze:I

    .line 326
    .line 327
    add-int/2addr v12, v11

    .line 328
    iget v15, v0, Lcom/google/android/gms/internal/ads/zzico;->zzf:I

    .line 329
    .line 330
    if-lt v12, v15, :cond_14

    .line 331
    .line 332
    add-int/lit8 v12, v11, 0x1

    .line 333
    .line 334
    invoke-direct {v0, v12}, Lcom/google/android/gms/internal/ads/zzico;->zzr(I)Z

    .line 335
    .line 336
    .line 337
    move-result v12

    .line 338
    if-nez v12, :cond_14

    .line 339
    .line 340
    goto :goto_3

    .line 341
    :cond_14
    iget v12, v0, Lcom/google/android/gms/internal/ads/zzico;->zze:I

    .line 342
    .line 343
    add-int/2addr v12, v11

    .line 344
    aget-char v12, v4, v12

    .line 345
    .line 346
    invoke-virtual {v6, v11}, Ljava/lang/String;->charAt(I)C

    .line 347
    .line 348
    .line 349
    move-result v15

    .line 350
    if-eq v12, v15, :cond_15

    .line 351
    .line 352
    if-eq v9, v10, :cond_10

    .line 353
    .line 354
    invoke-virtual {v2, v11}, Ljava/lang/String;->charAt(I)C

    .line 355
    .line 356
    .line 357
    move-result v15

    .line 358
    if-ne v12, v15, :cond_10

    .line 359
    .line 360
    :cond_15
    add-int/lit8 v11, v11, 0x1

    .line 361
    .line 362
    goto :goto_8

    .line 363
    :cond_16
    iget v2, v0, Lcom/google/android/gms/internal/ads/zzico;->zze:I

    .line 364
    .line 365
    add-int/2addr v2, v12

    .line 366
    iget v6, v0, Lcom/google/android/gms/internal/ads/zzico;->zzf:I

    .line 367
    .line 368
    if-lt v2, v6, :cond_17

    .line 369
    .line 370
    add-int/lit8 v2, v12, 0x1

    .line 371
    .line 372
    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/ads/zzico;->zzr(I)Z

    .line 373
    .line 374
    .line 375
    move-result v2

    .line 376
    if-eqz v2, :cond_18

    .line 377
    .line 378
    :cond_17
    iget v2, v0, Lcom/google/android/gms/internal/ads/zzico;->zze:I

    .line 379
    .line 380
    add-int/2addr v2, v12

    .line 381
    aget-char v2, v4, v2

    .line 382
    .line 383
    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/ads/zzico;->zzn(C)Z

    .line 384
    .line 385
    .line 386
    move-result v2

    .line 387
    if-eqz v2, :cond_18

    .line 388
    .line 389
    goto :goto_3

    .line 390
    :cond_18
    iget v2, v0, Lcom/google/android/gms/internal/ads/zzico;->zze:I

    .line 391
    .line 392
    add-int/2addr v2, v12

    .line 393
    iput v2, v0, Lcom/google/android/gms/internal/ads/zzico;->zze:I

    .line 394
    .line 395
    iput v8, v0, Lcom/google/android/gms/internal/ads/zzico;->zza:I

    .line 396
    .line 397
    :goto_9
    if-nez v8, :cond_37

    .line 398
    .line 399
    iget v2, v0, Lcom/google/android/gms/internal/ads/zzico;->zze:I

    .line 400
    .line 401
    iget v6, v0, Lcom/google/android/gms/internal/ads/zzico;->zzf:I

    .line 402
    .line 403
    move v10, v1

    .line 404
    move v15, v10

    .line 405
    move/from16 v17, v15

    .line 406
    .line 407
    move/from16 v16, v3

    .line 408
    .line 409
    const-wide/16 v11, 0x0

    .line 410
    .line 411
    :goto_a
    add-int v1, v2, v10

    .line 412
    .line 413
    if-ne v1, v6, :cond_1d

    .line 414
    .line 415
    const/16 v1, 0x400

    .line 416
    .line 417
    if-ne v10, v1, :cond_1a

    .line 418
    .line 419
    :goto_b
    move-object/from16 v23, v4

    .line 420
    .line 421
    :cond_19
    :goto_c
    const/4 v3, 0x0

    .line 422
    goto/16 :goto_18

    .line 423
    .line 424
    :cond_1a
    add-int/lit8 v1, v10, 0x1

    .line 425
    .line 426
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzico;->zzr(I)Z

    .line 427
    .line 428
    .line 429
    move-result v1

    .line 430
    if-nez v1, :cond_1c

    .line 431
    .line 432
    move-object/from16 v23, v4

    .line 433
    .line 434
    const-wide/16 v20, 0x0

    .line 435
    .line 436
    :cond_1b
    const/4 v8, 0x2

    .line 437
    goto/16 :goto_10

    .line 438
    .line 439
    :cond_1c
    iget v1, v0, Lcom/google/android/gms/internal/ads/zzico;->zze:I

    .line 440
    .line 441
    iget v2, v0, Lcom/google/android/gms/internal/ads/zzico;->zzf:I

    .line 442
    .line 443
    move v6, v2

    .line 444
    move v2, v1

    .line 445
    :cond_1d
    add-int v1, v2, v10

    .line 446
    .line 447
    aget-char v1, v4, v1

    .line 448
    .line 449
    const-wide/16 v20, 0x0

    .line 450
    .line 451
    const/16 v8, 0x2b

    .line 452
    .line 453
    if-eq v1, v8, :cond_33

    .line 454
    .line 455
    const/16 v8, 0x45

    .line 456
    .line 457
    if-eq v1, v8, :cond_31

    .line 458
    .line 459
    const/16 v8, 0x65

    .line 460
    .line 461
    if-eq v1, v8, :cond_31

    .line 462
    .line 463
    const/16 v8, 0x2d

    .line 464
    .line 465
    if-eq v1, v8, :cond_2f

    .line 466
    .line 467
    const/16 v8, 0x2e

    .line 468
    .line 469
    if-eq v1, v8, :cond_2e

    .line 470
    .line 471
    const/16 v8, 0x30

    .line 472
    .line 473
    if-lt v1, v8, :cond_1e

    .line 474
    .line 475
    const/16 v8, 0x39

    .line 476
    .line 477
    if-le v1, v8, :cond_1f

    .line 478
    .line 479
    :cond_1e
    move-object/from16 v23, v4

    .line 480
    .line 481
    goto :goto_f

    .line 482
    :cond_1f
    if-eq v15, v3, :cond_20

    .line 483
    .line 484
    if-nez v15, :cond_21

    .line 485
    .line 486
    :cond_20
    move-object/from16 v23, v4

    .line 487
    .line 488
    const/4 v3, 0x6

    .line 489
    goto :goto_e

    .line 490
    :cond_21
    const/4 v8, 0x2

    .line 491
    if-ne v15, v8, :cond_25

    .line 492
    .line 493
    cmp-long v8, v11, v20

    .line 494
    .line 495
    if-nez v8, :cond_22

    .line 496
    .line 497
    goto :goto_b

    .line 498
    :cond_22
    add-int/lit8 v1, v1, -0x30

    .line 499
    .line 500
    const-wide/16 v8, 0xa

    .line 501
    .line 502
    mul-long/2addr v8, v11

    .line 503
    const-wide v22, -0xcccccccccccccccL

    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    cmp-long v18, v11, v22

    .line 509
    .line 510
    move-object/from16 v23, v4

    .line 511
    .line 512
    int-to-long v3, v1

    .line 513
    sub-long/2addr v8, v3

    .line 514
    if-gtz v18, :cond_23

    .line 515
    .line 516
    if-nez v18, :cond_24

    .line 517
    .line 518
    cmp-long v1, v8, v11

    .line 519
    .line 520
    if-gez v1, :cond_24

    .line 521
    .line 522
    :cond_23
    const/4 v1, 0x1

    .line 523
    goto :goto_d

    .line 524
    :cond_24
    const/4 v1, 0x0

    .line 525
    :goto_d
    and-int v16, v16, v1

    .line 526
    .line 527
    move-wide v11, v8

    .line 528
    const/4 v3, 0x6

    .line 529
    goto/16 :goto_17

    .line 530
    .line 531
    :cond_25
    move-object/from16 v23, v4

    .line 532
    .line 533
    const/4 v3, 0x6

    .line 534
    if-ne v15, v13, :cond_26

    .line 535
    .line 536
    const/4 v15, 0x4

    .line 537
    goto/16 :goto_17

    .line 538
    .line 539
    :cond_26
    if-eq v15, v5, :cond_27

    .line 540
    .line 541
    if-ne v15, v3, :cond_34

    .line 542
    .line 543
    :cond_27
    move v15, v14

    .line 544
    goto/16 :goto_17

    .line 545
    .line 546
    :goto_e
    add-int/lit8 v1, v1, -0x30

    .line 547
    .line 548
    neg-int v1, v1

    .line 549
    int-to-long v11, v1

    .line 550
    const/4 v15, 0x2

    .line 551
    goto/16 :goto_17

    .line 552
    .line 553
    :goto_f
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzico;->zzn(C)Z

    .line 554
    .line 555
    .line 556
    move-result v1

    .line 557
    if-eqz v1, :cond_1b

    .line 558
    .line 559
    goto/16 :goto_c

    .line 560
    .line 561
    :goto_10
    if-ne v15, v8, :cond_2c

    .line 562
    .line 563
    if-eqz v16, :cond_28

    .line 564
    .line 565
    const-wide/high16 v1, -0x8000000000000000L

    .line 566
    .line 567
    cmp-long v1, v11, v1

    .line 568
    .line 569
    if-nez v1, :cond_29

    .line 570
    .line 571
    if-eqz v17, :cond_28

    .line 572
    .line 573
    const/4 v3, 0x1

    .line 574
    goto :goto_11

    .line 575
    :cond_28
    const/4 v8, 0x2

    .line 576
    const/4 v15, 0x2

    .line 577
    goto :goto_15

    .line 578
    :cond_29
    move/from16 v3, v17

    .line 579
    .line 580
    :goto_11
    cmp-long v1, v11, v20

    .line 581
    .line 582
    if-nez v1, :cond_2a

    .line 583
    .line 584
    if-nez v3, :cond_28

    .line 585
    .line 586
    goto :goto_12

    .line 587
    :cond_2a
    if-eqz v3, :cond_2b

    .line 588
    .line 589
    goto :goto_13

    .line 590
    :cond_2b
    :goto_12
    neg-long v11, v11

    .line 591
    :goto_13
    iput-wide v11, v0, Lcom/google/android/gms/internal/ads/zzico;->zzi:J

    .line 592
    .line 593
    iget v1, v0, Lcom/google/android/gms/internal/ads/zzico;->zze:I

    .line 594
    .line 595
    add-int/2addr v1, v10

    .line 596
    iput v1, v0, Lcom/google/android/gms/internal/ads/zzico;->zze:I

    .line 597
    .line 598
    const/16 v3, 0xf

    .line 599
    .line 600
    :goto_14
    iput v3, v0, Lcom/google/android/gms/internal/ads/zzico;->zza:I

    .line 601
    .line 602
    goto :goto_18

    .line 603
    :cond_2c
    :goto_15
    if-eq v15, v8, :cond_2d

    .line 604
    .line 605
    const/4 v1, 0x4

    .line 606
    if-eq v15, v1, :cond_2d

    .line 607
    .line 608
    if-ne v15, v14, :cond_19

    .line 609
    .line 610
    :cond_2d
    iput v10, v0, Lcom/google/android/gms/internal/ads/zzico;->zzj:I

    .line 611
    .line 612
    const/16 v3, 0x10

    .line 613
    .line 614
    goto :goto_14

    .line 615
    :cond_2e
    move-object/from16 v23, v4

    .line 616
    .line 617
    const/4 v3, 0x6

    .line 618
    const/4 v8, 0x2

    .line 619
    if-ne v15, v8, :cond_19

    .line 620
    .line 621
    move v15, v13

    .line 622
    goto :goto_17

    .line 623
    :cond_2f
    move-object/from16 v23, v4

    .line 624
    .line 625
    const/4 v3, 0x6

    .line 626
    const/4 v8, 0x2

    .line 627
    if-nez v15, :cond_30

    .line 628
    .line 629
    const/4 v15, 0x1

    .line 630
    const/16 v17, 0x1

    .line 631
    .line 632
    goto :goto_17

    .line 633
    :cond_30
    if-ne v15, v5, :cond_19

    .line 634
    .line 635
    :goto_16
    move v15, v3

    .line 636
    goto :goto_17

    .line 637
    :cond_31
    move-object/from16 v23, v4

    .line 638
    .line 639
    const/4 v3, 0x6

    .line 640
    const/4 v8, 0x2

    .line 641
    if-eq v15, v8, :cond_32

    .line 642
    .line 643
    const/4 v1, 0x4

    .line 644
    if-ne v15, v1, :cond_19

    .line 645
    .line 646
    :cond_32
    move v15, v5

    .line 647
    goto :goto_17

    .line 648
    :cond_33
    move-object/from16 v23, v4

    .line 649
    .line 650
    const/4 v3, 0x6

    .line 651
    if-ne v15, v5, :cond_19

    .line 652
    .line 653
    goto :goto_16

    .line 654
    :cond_34
    :goto_17
    add-int/lit8 v10, v10, 0x1

    .line 655
    .line 656
    move-object/from16 v4, v23

    .line 657
    .line 658
    const/4 v3, 0x1

    .line 659
    goto/16 :goto_a

    .line 660
    .line 661
    :goto_18
    if-eqz v3, :cond_35

    .line 662
    .line 663
    return v3

    .line 664
    :cond_35
    iget v1, v0, Lcom/google/android/gms/internal/ads/zzico;->zze:I

    .line 665
    .line 666
    aget-char v1, v23, v1

    .line 667
    .line 668
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzico;->zzn(C)Z

    .line 669
    .line 670
    .line 671
    move-result v1

    .line 672
    if-eqz v1, :cond_36

    .line 673
    .line 674
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzico;->zzt()V

    .line 675
    .line 676
    .line 677
    iput v7, v0, Lcom/google/android/gms/internal/ads/zzico;->zza:I

    .line 678
    .line 679
    return v7

    .line 680
    :cond_36
    const-string v1, "Expected value"

    .line 681
    .line 682
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzico;->zzv(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzicr;

    .line 683
    .line 684
    .line 685
    move-result-object v1

    .line 686
    throw v1

    .line 687
    :cond_37
    return v8

    .line 688
    :cond_38
    const/4 v13, 0x1

    .line 689
    goto/16 :goto_1c

    .line 690
    .line 691
    :cond_39
    move v1, v3

    .line 692
    if-ne v4, v1, :cond_3b

    .line 693
    .line 694
    const/4 v13, 0x4

    .line 695
    goto/16 :goto_1c

    .line 696
    .line 697
    :cond_3a
    move v1, v3

    .line 698
    :cond_3b
    if-eq v4, v1, :cond_3d

    .line 699
    .line 700
    const/4 v3, 0x2

    .line 701
    if-ne v4, v3, :cond_3c

    .line 702
    .line 703
    goto :goto_19

    .line 704
    :cond_3c
    const-string v1, "Unexpected value"

    .line 705
    .line 706
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzico;->zzv(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzicr;

    .line 707
    .line 708
    .line 709
    move-result-object v1

    .line 710
    throw v1

    .line 711
    :cond_3d
    :goto_19
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzico;->zzt()V

    .line 712
    .line 713
    .line 714
    iget v1, v0, Lcom/google/android/gms/internal/ads/zzico;->zze:I

    .line 715
    .line 716
    const/16 v18, -0x1

    .line 717
    .line 718
    add-int/lit8 v1, v1, -0x1

    .line 719
    .line 720
    iput v1, v0, Lcom/google/android/gms/internal/ads/zzico;->zze:I

    .line 721
    .line 722
    iput v14, v0, Lcom/google/android/gms/internal/ads/zzico;->zza:I

    .line 723
    .line 724
    return v14

    .line 725
    :cond_3e
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzico;->zzt()V

    .line 726
    .line 727
    .line 728
    const/16 v2, 0x8

    .line 729
    .line 730
    iput v2, v0, Lcom/google/android/gms/internal/ads/zzico;->zza:I

    .line 731
    .line 732
    return v2

    .line 733
    :cond_3f
    const/16 v13, 0x9

    .line 734
    .line 735
    goto :goto_1c

    .line 736
    :cond_40
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 737
    .line 738
    const-string v2, "JsonReader is closed"

    .line 739
    .line 740
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 741
    .line 742
    .line 743
    throw v1

    .line 744
    :cond_41
    const/4 v3, 0x2

    .line 745
    move/from16 v19, v15

    .line 746
    .line 747
    :goto_1a
    aput v19, v1, v2

    .line 748
    .line 749
    if-ne v4, v5, :cond_44

    .line 750
    .line 751
    const/4 v1, 0x1

    .line 752
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzico;->zzs(Z)I

    .line 753
    .line 754
    .line 755
    move-result v2

    .line 756
    if-eq v2, v11, :cond_44

    .line 757
    .line 758
    if-eq v2, v10, :cond_43

    .line 759
    .line 760
    if-ne v2, v6, :cond_42

    .line 761
    .line 762
    :goto_1b
    move v13, v3

    .line 763
    goto :goto_1c

    .line 764
    :cond_42
    const-string v1, "Unterminated object"

    .line 765
    .line 766
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzico;->zzv(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzicr;

    .line 767
    .line 768
    .line 769
    move-result-object v1

    .line 770
    throw v1

    .line 771
    :cond_43
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzico;->zzt()V

    .line 772
    .line 773
    .line 774
    :cond_44
    const/4 v1, 0x1

    .line 775
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzico;->zzs(Z)I

    .line 776
    .line 777
    .line 778
    move-result v1

    .line 779
    const/16 v2, 0x22

    .line 780
    .line 781
    if-eq v1, v2, :cond_49

    .line 782
    .line 783
    if-eq v1, v8, :cond_48

    .line 784
    .line 785
    const-string v2, "Expected name"

    .line 786
    .line 787
    if-eq v1, v6, :cond_46

    .line 788
    .line 789
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzico;->zzt()V

    .line 790
    .line 791
    .line 792
    iget v3, v0, Lcom/google/android/gms/internal/ads/zzico;->zze:I

    .line 793
    .line 794
    const/16 v18, -0x1

    .line 795
    .line 796
    add-int/lit8 v3, v3, -0x1

    .line 797
    .line 798
    iput v3, v0, Lcom/google/android/gms/internal/ads/zzico;->zze:I

    .line 799
    .line 800
    int-to-char v1, v1

    .line 801
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzico;->zzn(C)Z

    .line 802
    .line 803
    .line 804
    move-result v1

    .line 805
    if-eqz v1, :cond_45

    .line 806
    .line 807
    const/16 v13, 0xe

    .line 808
    .line 809
    goto :goto_1c

    .line 810
    :cond_45
    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/ads/zzico;->zzv(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzicr;

    .line 811
    .line 812
    .line 813
    move-result-object v1

    .line 814
    throw v1

    .line 815
    :cond_46
    if-eq v4, v5, :cond_47

    .line 816
    .line 817
    goto :goto_1b

    .line 818
    :cond_47
    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/ads/zzico;->zzv(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzicr;

    .line 819
    .line 820
    .line 821
    move-result-object v1

    .line 822
    throw v1

    .line 823
    :cond_48
    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzico;->zzt()V

    .line 824
    .line 825
    .line 826
    const/16 v1, 0xc

    .line 827
    .line 828
    iput v1, v0, Lcom/google/android/gms/internal/ads/zzico;->zza:I

    .line 829
    .line 830
    return v1

    .line 831
    :cond_49
    const/16 v13, 0xd

    .line 832
    .line 833
    :cond_4a
    :goto_1c
    iput v13, v0, Lcom/google/android/gms/internal/ads/zzico;->zza:I

    .line 834
    .line 835
    return v13
.end method

.method public final zzh()Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzico;->zza:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzico;->zzg()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    :cond_0
    const/16 v1, 0xe

    .line 10
    .line 11
    if-ne v0, v1, :cond_1

    .line 12
    .line 13
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzico;->zzp()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    goto :goto_0

    .line 18
    :cond_1
    const/16 v1, 0xc

    .line 19
    .line 20
    if-ne v0, v1, :cond_2

    .line 21
    .line 22
    const/16 v0, 0x27

    .line 23
    .line 24
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzico;->zzo(C)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    goto :goto_0

    .line 29
    :cond_2
    const/16 v1, 0xd

    .line 30
    .line 31
    if-ne v0, v1, :cond_3

    .line 32
    .line 33
    const/16 v0, 0x22

    .line 34
    .line 35
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzico;->zzo(C)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    :goto_0
    const/4 v1, 0x0

    .line 40
    iput v1, p0, Lcom/google/android/gms/internal/ads/zzico;->zza:I

    .line 41
    .line 42
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzico;->zzm:[Ljava/lang/String;

    .line 43
    .line 44
    iget v2, p0, Lcom/google/android/gms/internal/ads/zzico;->zzl:I

    .line 45
    .line 46
    add-int/lit8 v2, v2, -0x1

    .line 47
    .line 48
    aput-object v0, v1, v2

    .line 49
    .line 50
    return-object v0

    .line 51
    :cond_3
    const-string v0, "a name"

    .line 52
    .line 53
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzico;->zzw(Ljava/lang/String;)Ljava/lang/IllegalStateException;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    throw v0
.end method

.method public final zzi()Ljava/lang/String;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzico;->zza:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzico;->zzg()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    :cond_0
    const/16 v1, 0xa

    .line 10
    .line 11
    if-ne v0, v1, :cond_1

    .line 12
    .line 13
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzico;->zzp()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    goto :goto_0

    .line 18
    :cond_1
    const/16 v1, 0x8

    .line 19
    .line 20
    if-ne v0, v1, :cond_2

    .line 21
    .line 22
    const/16 v0, 0x27

    .line 23
    .line 24
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzico;->zzo(C)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    goto :goto_0

    .line 29
    :cond_2
    const/16 v1, 0x9

    .line 30
    .line 31
    if-ne v0, v1, :cond_3

    .line 32
    .line 33
    const/16 v0, 0x22

    .line 34
    .line 35
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzico;->zzo(C)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    goto :goto_0

    .line 40
    :cond_3
    const/16 v1, 0xb

    .line 41
    .line 42
    if-ne v0, v1, :cond_4

    .line 43
    .line 44
    const/4 v0, 0x0

    .line 45
    goto :goto_0

    .line 46
    :cond_4
    const/16 v1, 0xf

    .line 47
    .line 48
    if-ne v0, v1, :cond_5

    .line 49
    .line 50
    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzico;->zzi:J

    .line 51
    .line 52
    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    goto :goto_0

    .line 57
    :cond_5
    const/16 v1, 0x10

    .line 58
    .line 59
    if-ne v0, v1, :cond_6

    .line 60
    .line 61
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzico;->zzd:[C

    .line 62
    .line 63
    new-instance v1, Ljava/lang/String;

    .line 64
    .line 65
    iget v2, p0, Lcom/google/android/gms/internal/ads/zzico;->zze:I

    .line 66
    .line 67
    iget v3, p0, Lcom/google/android/gms/internal/ads/zzico;->zzj:I

    .line 68
    .line 69
    invoke-direct {v1, v0, v2, v3}, Ljava/lang/String;-><init>([CII)V

    .line 70
    .line 71
    .line 72
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzico;->zze:I

    .line 73
    .line 74
    iget v2, p0, Lcom/google/android/gms/internal/ads/zzico;->zzj:I

    .line 75
    .line 76
    add-int/2addr v0, v2

    .line 77
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzico;->zze:I

    .line 78
    .line 79
    move-object v0, v1

    .line 80
    :goto_0
    const/4 v1, 0x0

    .line 81
    iput v1, p0, Lcom/google/android/gms/internal/ads/zzico;->zza:I

    .line 82
    .line 83
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzico;->zzn:[I

    .line 84
    .line 85
    iget v2, p0, Lcom/google/android/gms/internal/ads/zzico;->zzl:I

    .line 86
    .line 87
    add-int/lit8 v2, v2, -0x1

    .line 88
    .line 89
    aget v3, v1, v2

    .line 90
    .line 91
    add-int/lit8 v3, v3, 0x1

    .line 92
    .line 93
    aput v3, v1, v2

    .line 94
    .line 95
    return-object v0

    .line 96
    :cond_6
    const-string v0, "a string"

    .line 97
    .line 98
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzico;->zzw(Ljava/lang/String;)Ljava/lang/IllegalStateException;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    throw v0
.end method

.method public final zzj()Z
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzico;->zza:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzico;->zzg()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    :cond_0
    const/4 v1, 0x5

    .line 10
    const/4 v2, 0x1

    .line 11
    const/4 v3, 0x0

    .line 12
    if-ne v0, v1, :cond_1

    .line 13
    .line 14
    iput v3, p0, Lcom/google/android/gms/internal/ads/zzico;->zza:I

    .line 15
    .line 16
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzico;->zzn:[I

    .line 17
    .line 18
    iget v1, p0, Lcom/google/android/gms/internal/ads/zzico;->zzl:I

    .line 19
    .line 20
    add-int/lit8 v1, v1, -0x1

    .line 21
    .line 22
    aget v3, v0, v1

    .line 23
    .line 24
    add-int/2addr v3, v2

    .line 25
    aput v3, v0, v1

    .line 26
    .line 27
    return v2

    .line 28
    :cond_1
    const/4 v1, 0x6

    .line 29
    if-ne v0, v1, :cond_2

    .line 30
    .line 31
    iput v3, p0, Lcom/google/android/gms/internal/ads/zzico;->zza:I

    .line 32
    .line 33
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzico;->zzn:[I

    .line 34
    .line 35
    iget v1, p0, Lcom/google/android/gms/internal/ads/zzico;->zzl:I

    .line 36
    .line 37
    add-int/lit8 v1, v1, -0x1

    .line 38
    .line 39
    aget v4, v0, v1

    .line 40
    .line 41
    add-int/2addr v4, v2

    .line 42
    aput v4, v0, v1

    .line 43
    .line 44
    return v3

    .line 45
    :cond_2
    const-string v0, "a boolean"

    .line 46
    .line 47
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzico;->zzw(Ljava/lang/String;)Ljava/lang/IllegalStateException;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    throw v0
.end method

.method public final zzk()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzico;->zza:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzico;->zzg()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    :cond_0
    const/4 v1, 0x7

    .line 10
    if-ne v0, v1, :cond_1

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzico;->zza:I

    .line 14
    .line 15
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzico;->zzn:[I

    .line 16
    .line 17
    iget v1, p0, Lcom/google/android/gms/internal/ads/zzico;->zzl:I

    .line 18
    .line 19
    add-int/lit8 v1, v1, -0x1

    .line 20
    .line 21
    aget v2, v0, v1

    .line 22
    .line 23
    add-int/lit8 v2, v2, 0x1

    .line 24
    .line 25
    aput v2, v0, v1

    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    const-string v0, "null"

    .line 29
    .line 30
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzico;->zzw(Ljava/lang/String;)Ljava/lang/IllegalStateException;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    throw v0
.end method

.method public final zzl()Ljava/lang/String;
    .locals 6

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzico;->zzg:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iget v1, p0, Lcom/google/android/gms/internal/ads/zzico;->zze:I

    .line 6
    .line 7
    iget v2, p0, Lcom/google/android/gms/internal/ads/zzico;->zzh:I

    .line 8
    .line 9
    sub-int/2addr v1, v2

    .line 10
    new-instance v2, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v3, "$"

    .line 13
    .line 14
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    :goto_0
    iget v4, p0, Lcom/google/android/gms/internal/ads/zzico;->zzl:I

    .line 19
    .line 20
    if-ge v3, v4, :cond_1

    .line 21
    .line 22
    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzico;->zzk:[I

    .line 23
    .line 24
    aget v4, v4, v3

    .line 25
    .line 26
    packed-switch v4, :pswitch_data_0

    .line 27
    .line 28
    .line 29
    new-instance v0, Ljava/lang/AssertionError;

    .line 30
    .line 31
    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    new-instance v2, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    add-int/lit8 v1, v1, 0x15

    .line 42
    .line 43
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 44
    .line 45
    .line 46
    const-string v1, "Unknown scope value: "

    .line 47
    .line 48
    invoke-static {v4, v1, v2}, LN0/a;->d(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    throw v0

    .line 56
    :pswitch_0
    const/16 v4, 0x2e

    .line 57
    .line 58
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzico;->zzm:[Ljava/lang/String;

    .line 62
    .line 63
    aget-object v4, v4, v3

    .line 64
    .line 65
    if-eqz v4, :cond_0

    .line 66
    .line 67
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    goto :goto_1

    .line 71
    :pswitch_1
    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzico;->zzn:[I

    .line 72
    .line 73
    aget v4, v4, v3

    .line 74
    .line 75
    const/16 v5, 0x5b

    .line 76
    .line 77
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    const/16 v4, 0x5d

    .line 84
    .line 85
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    :cond_0
    :goto_1
    :pswitch_2
    add-int/lit8 v3, v3, 0x1

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 92
    .line 93
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 102
    .line 103
    .line 104
    move-result v3

    .line 105
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v4

    .line 109
    add-int/lit8 v3, v3, 0x11

    .line 110
    .line 111
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 112
    .line 113
    .line 114
    move-result v4

    .line 115
    add-int/2addr v4, v3

    .line 116
    new-instance v3, Ljava/lang/StringBuilder;

    .line 117
    .line 118
    add-int/lit8 v4, v4, 0x6

    .line 119
    .line 120
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 121
    .line 122
    .line 123
    move-result v5

    .line 124
    add-int/2addr v5, v4

    .line 125
    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 126
    .line 127
    .line 128
    const-string v4, " at line "

    .line 129
    .line 130
    const-string v5, " column "

    .line 131
    .line 132
    invoke-static {v0, v1, v4, v5, v3}, LN0/a;->l(IILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 133
    .line 134
    .line 135
    const-string v0, " path "

    .line 136
    .line 137
    invoke-static {v3, v0, v2}, Lwg/b;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    return-object v0

    .line 142
    nop

    .line 143
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_2
        :pswitch_2
        :pswitch_2
    .end packed-switch
.end method

.method public final zzm()I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzico;->zza:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzico;->zzg()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    :cond_0
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    const/16 v0, 0xa

    .line 13
    .line 14
    return v0

    .line 15
    :pswitch_0
    const/4 v0, 0x7

    .line 16
    return v0

    .line 17
    :pswitch_1
    const/4 v0, 0x5

    .line 18
    return v0

    .line 19
    :pswitch_2
    const/4 v0, 0x6

    .line 20
    return v0

    .line 21
    :pswitch_3
    const/16 v0, 0x9

    .line 22
    .line 23
    return v0

    .line 24
    :pswitch_4
    const/16 v0, 0x8

    .line 25
    .line 26
    return v0

    .line 27
    :pswitch_5
    const/4 v0, 0x2

    .line 28
    return v0

    .line 29
    :pswitch_6
    const/4 v0, 0x1

    .line 30
    return v0

    .line 31
    :pswitch_7
    const/4 v0, 0x4

    .line 32
    return v0

    .line 33
    :pswitch_8
    const/4 v0, 0x3

    .line 34
    return v0

    .line 35
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
