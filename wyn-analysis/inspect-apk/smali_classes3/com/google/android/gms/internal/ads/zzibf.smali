.class final Lcom/google/android/gms/internal/ads/zzibf;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzhev;


# instance fields
.field private final zza:Ljava/security/interfaces/RSAPublicKey;

.field private final zzb:Lcom/google/android/gms/internal/ads/zziat;

.field private final zzc:Lcom/google/android/gms/internal/ads/zziat;

.field private final zzd:I

.field private final zze:[B

.field private final zzf:[B


# direct methods
.method public synthetic constructor <init>(Ljava/security/interfaces/RSAPublicKey;Lcom/google/android/gms/internal/ads/zziat;Lcom/google/android/gms/internal/ads/zziat;I[B[B[B)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzhlf;->zza()Z

    .line 5
    .line 6
    .line 7
    move-result p7

    .line 8
    if-nez p7, :cond_1

    .line 9
    .line 10
    invoke-static {p2}, Lcom/google/android/gms/internal/ads/zzibi;->zzb(Lcom/google/android/gms/internal/ads/zziat;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p2, p3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p7

    .line 17
    if-eqz p7, :cond_0

    .line 18
    .line 19
    invoke-interface {p1}, Ljava/security/interfaces/RSAKey;->getModulus()Ljava/math/BigInteger;

    .line 20
    .line 21
    .line 22
    move-result-object p7

    .line 23
    invoke-virtual {p7}, Ljava/math/BigInteger;->bitLength()I

    .line 24
    .line 25
    .line 26
    move-result p7

    .line 27
    invoke-static {p7}, Lcom/google/android/gms/internal/ads/zzibi;->zzc(I)V

    .line 28
    .line 29
    .line 30
    invoke-interface {p1}, Ljava/security/interfaces/RSAPublicKey;->getPublicExponent()Ljava/math/BigInteger;

    .line 31
    .line 32
    .line 33
    move-result-object p7

    .line 34
    invoke-static {p7}, Lcom/google/android/gms/internal/ads/zzibi;->zzd(Ljava/math/BigInteger;)V

    .line 35
    .line 36
    .line 37
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzibf;->zza:Ljava/security/interfaces/RSAPublicKey;

    .line 38
    .line 39
    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzibf;->zzb:Lcom/google/android/gms/internal/ads/zziat;

    .line 40
    .line 41
    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzibf;->zzc:Lcom/google/android/gms/internal/ads/zziat;

    .line 42
    .line 43
    iput p4, p0, Lcom/google/android/gms/internal/ads/zzibf;->zzd:I

    .line 44
    .line 45
    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzibf;->zze:[B

    .line 46
    .line 47
    iput-object p6, p0, Lcom/google/android/gms/internal/ads/zzibf;->zzf:[B

    .line 48
    .line 49
    return-void

    .line 50
    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 51
    .line 52
    const-string p2, "sigHash and mgf1Hash must be the same"

    .line 53
    .line 54
    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    throw p1

    .line 58
    :cond_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 59
    .line 60
    const-string p2, "Can not use RSA PSS in FIPS-mode, as BoringCrypto module is not available."

    .line 61
    .line 62
    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    throw p1
.end method

.method private final zzb([B[B)V
    .locals 22
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzibf;->zza:Ljava/security/interfaces/RSAPublicKey;

    .line 6
    .line 7
    invoke-interface {v2}, Ljava/security/interfaces/RSAPublicKey;->getPublicExponent()Ljava/math/BigInteger;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    invoke-interface {v2}, Ljava/security/interfaces/RSAKey;->getModulus()Ljava/math/BigInteger;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {v2}, Ljava/math/BigInteger;->bitLength()I

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    add-int/lit8 v4, v4, 0x7

    .line 20
    .line 21
    invoke-virtual {v2}, Ljava/math/BigInteger;->bitLength()I

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    add-int/lit8 v5, v5, 0x6

    .line 26
    .line 27
    const/16 v6, 0x8

    .line 28
    .line 29
    div-int/2addr v4, v6

    .line 30
    array-length v7, v1

    .line 31
    if-ne v4, v7, :cond_d

    .line 32
    .line 33
    new-instance v4, Ljava/math/BigInteger;

    .line 34
    .line 35
    const/4 v7, 0x1

    .line 36
    invoke-direct {v4, v7, v1}, Ljava/math/BigInteger;-><init>(I[B)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v4, v2}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-gez v1, :cond_c

    .line 44
    .line 45
    div-int/2addr v5, v6

    .line 46
    invoke-virtual {v4, v3, v2}, Ljava/math/BigInteger;->modPow(Ljava/math/BigInteger;Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-static {v1, v5}, Lcom/google/android/gms/internal/ads/zzhlh;->zzb(Ljava/math/BigInteger;I)[B

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-virtual {v2}, Ljava/math/BigInteger;->bitLength()I

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    add-int/lit8 v2, v2, -0x1

    .line 59
    .line 60
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzibf;->zzb:Lcom/google/android/gms/internal/ads/zziat;

    .line 61
    .line 62
    invoke-static {v3}, Lcom/google/android/gms/internal/ads/zzibi;->zzb(Lcom/google/android/gms/internal/ads/zziat;)V

    .line 63
    .line 64
    .line 65
    sget-object v4, Lcom/google/android/gms/internal/ads/zziak;->zzd:Lcom/google/android/gms/internal/ads/zziak;

    .line 66
    .line 67
    invoke-static {v3}, Lcom/google/android/gms/internal/ads/zzibh;->zzb(Lcom/google/android/gms/internal/ads/zziat;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    invoke-virtual {v4, v3}, Lcom/google/android/gms/internal/ads/zziak;->zzb(Ljava/lang/String;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    check-cast v3, Ljava/security/MessageDigest;

    .line 76
    .line 77
    move-object/from16 v5, p2

    .line 78
    .line 79
    invoke-virtual {v3, v5}, Ljava/security/MessageDigest;->update([B)V

    .line 80
    .line 81
    .line 82
    iget-object v5, v0, Lcom/google/android/gms/internal/ads/zzibf;->zzf:[B

    .line 83
    .line 84
    array-length v8, v5

    .line 85
    if-eqz v8, :cond_0

    .line 86
    .line 87
    invoke-virtual {v3, v5}, Ljava/security/MessageDigest;->update([B)V

    .line 88
    .line 89
    .line 90
    :cond_0
    invoke-virtual {v3}, Ljava/security/MessageDigest;->digest()[B

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    invoke-virtual {v3}, Ljava/security/MessageDigest;->getDigestLength()I

    .line 95
    .line 96
    .line 97
    move-result v8

    .line 98
    array-length v9, v1

    .line 99
    iget v10, v0, Lcom/google/android/gms/internal/ads/zzibf;->zzd:I

    .line 100
    .line 101
    add-int v11, v8, v10

    .line 102
    .line 103
    add-int/lit8 v11, v11, 0x2

    .line 104
    .line 105
    const-string v12, "inconsistent"

    .line 106
    .line 107
    if-lt v9, v11, :cond_b

    .line 108
    .line 109
    add-int/lit8 v11, v9, -0x1

    .line 110
    .line 111
    aget-byte v11, v1, v11

    .line 112
    .line 113
    const/16 v13, -0x44

    .line 114
    .line 115
    if-ne v11, v13, :cond_a

    .line 116
    .line 117
    sub-int v11, v9, v8

    .line 118
    .line 119
    add-int/lit8 v13, v11, -0x1

    .line 120
    .line 121
    invoke-static {v1, v13}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 122
    .line 123
    .line 124
    move-result-object v14

    .line 125
    array-length v15, v14

    .line 126
    move/from16 v16, v6

    .line 127
    .line 128
    add-int v6, v15, v8

    .line 129
    .line 130
    invoke-static {v1, v15, v6}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    move/from16 v17, v7

    .line 135
    .line 136
    move/from16 p1, v8

    .line 137
    .line 138
    const/4 v15, 0x0

    .line 139
    :goto_0
    int-to-long v7, v9

    .line 140
    const-wide/16 v18, 0x8

    .line 141
    .line 142
    mul-long v7, v7, v18

    .line 143
    .line 144
    move-wide/from16 v18, v7

    .line 145
    .line 146
    int-to-long v6, v2

    .line 147
    move-wide/from16 v20, v6

    .line 148
    .line 149
    int-to-long v6, v15

    .line 150
    sub-long v18, v18, v20

    .line 151
    .line 152
    cmp-long v6, v6, v18

    .line 153
    .line 154
    if-gez v6, :cond_2

    .line 155
    .line 156
    div-int/lit8 v6, v15, 0x8

    .line 157
    .line 158
    rem-int/lit8 v7, v15, 0x8

    .line 159
    .line 160
    rsub-int/lit8 v7, v7, 0x7

    .line 161
    .line 162
    aget-byte v6, v14, v6

    .line 163
    .line 164
    shr-int/2addr v6, v7

    .line 165
    and-int/lit8 v6, v6, 0x1

    .line 166
    .line 167
    if-nez v6, :cond_1

    .line 168
    .line 169
    add-int/lit8 v15, v15, 0x1

    .line 170
    .line 171
    goto :goto_0

    .line 172
    :cond_1
    new-instance v1, Ljava/security/GeneralSecurityException;

    .line 173
    .line 174
    invoke-direct {v1, v12}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    throw v1

    .line 178
    :cond_2
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzibf;->zzc:Lcom/google/android/gms/internal/ads/zziat;

    .line 179
    .line 180
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzibh;->zzb(Lcom/google/android/gms/internal/ads/zziat;)Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v2

    .line 184
    invoke-virtual {v4, v2}, Lcom/google/android/gms/internal/ads/zziak;->zzb(Ljava/lang/String;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v2

    .line 188
    check-cast v2, Ljava/security/MessageDigest;

    .line 189
    .line 190
    invoke-virtual {v2}, Ljava/security/MessageDigest;->getDigestLength()I

    .line 191
    .line 192
    .line 193
    move-result v4

    .line 194
    new-array v6, v13, [B

    .line 195
    .line 196
    const/4 v7, 0x0

    .line 197
    const/4 v8, 0x0

    .line 198
    :goto_1
    add-int/lit8 v9, v11, -0x2

    .line 199
    .line 200
    div-int/2addr v9, v4

    .line 201
    if-gt v7, v9, :cond_3

    .line 202
    .line 203
    invoke-virtual {v2}, Ljava/security/MessageDigest;->reset()V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v2, v1}, Ljava/security/MessageDigest;->update([B)V

    .line 207
    .line 208
    .line 209
    move v15, v10

    .line 210
    int-to-long v9, v7

    .line 211
    invoke-static {v9, v10}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 212
    .line 213
    .line 214
    move-result-object v9

    .line 215
    const/4 v10, 0x4

    .line 216
    invoke-static {v9, v10}, Lcom/google/android/gms/internal/ads/zzhlh;->zzb(Ljava/math/BigInteger;I)[B

    .line 217
    .line 218
    .line 219
    move-result-object v9

    .line 220
    invoke-virtual {v2, v9}, Ljava/security/MessageDigest;->update([B)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v2}, Ljava/security/MessageDigest;->digest()[B

    .line 224
    .line 225
    .line 226
    move-result-object v9

    .line 227
    array-length v10, v9

    .line 228
    sub-int v0, v13, v8

    .line 229
    .line 230
    invoke-static {v10, v0}, Ljava/lang/Math;->min(II)I

    .line 231
    .line 232
    .line 233
    move-result v0

    .line 234
    move-object/from16 v20, v2

    .line 235
    .line 236
    const/4 v2, 0x0

    .line 237
    invoke-static {v9, v2, v6, v8, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 238
    .line 239
    .line 240
    add-int/2addr v8, v10

    .line 241
    add-int/lit8 v7, v7, 0x1

    .line 242
    .line 243
    move-object/from16 v0, p0

    .line 244
    .line 245
    move v10, v15

    .line 246
    move-object/from16 v2, v20

    .line 247
    .line 248
    goto :goto_1

    .line 249
    :cond_3
    move v15, v10

    .line 250
    new-array v0, v13, [B

    .line 251
    .line 252
    const/4 v2, 0x0

    .line 253
    :goto_2
    if-ge v2, v13, :cond_4

    .line 254
    .line 255
    aget-byte v4, v6, v2

    .line 256
    .line 257
    aget-byte v7, v14, v2

    .line 258
    .line 259
    xor-int/2addr v4, v7

    .line 260
    int-to-byte v4, v4

    .line 261
    aput-byte v4, v0, v2

    .line 262
    .line 263
    add-int/lit8 v2, v2, 0x1

    .line 264
    .line 265
    goto :goto_2

    .line 266
    :cond_4
    const/4 v2, 0x0

    .line 267
    :goto_3
    int-to-long v6, v2

    .line 268
    cmp-long v4, v6, v18

    .line 269
    .line 270
    if-gtz v4, :cond_5

    .line 271
    .line 272
    div-int/lit8 v4, v2, 0x8

    .line 273
    .line 274
    rem-int/lit8 v6, v2, 0x8

    .line 275
    .line 276
    rsub-int/lit8 v6, v6, 0x7

    .line 277
    .line 278
    aget-byte v7, v0, v4

    .line 279
    .line 280
    shl-int v6, v17, v6

    .line 281
    .line 282
    not-int v6, v6

    .line 283
    and-int/2addr v6, v7

    .line 284
    int-to-byte v6, v6

    .line 285
    aput-byte v6, v0, v4

    .line 286
    .line 287
    add-int/lit8 v2, v2, 0x1

    .line 288
    .line 289
    goto :goto_3

    .line 290
    :cond_5
    const/4 v2, 0x0

    .line 291
    :goto_4
    sub-int v4, v11, v15

    .line 292
    .line 293
    add-int/lit8 v4, v4, -0x2

    .line 294
    .line 295
    if-ge v2, v4, :cond_7

    .line 296
    .line 297
    aget-byte v4, v0, v2

    .line 298
    .line 299
    if-nez v4, :cond_6

    .line 300
    .line 301
    add-int/lit8 v2, v2, 0x1

    .line 302
    .line 303
    goto :goto_4

    .line 304
    :cond_6
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 305
    .line 306
    invoke-direct {v0, v12}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 307
    .line 308
    .line 309
    throw v0

    .line 310
    :cond_7
    aget-byte v2, v0, v4

    .line 311
    .line 312
    move/from16 v4, v17

    .line 313
    .line 314
    if-ne v2, v4, :cond_9

    .line 315
    .line 316
    sub-int v2, v13, v15

    .line 317
    .line 318
    invoke-static {v0, v2, v13}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 319
    .line 320
    .line 321
    move-result-object v0

    .line 322
    add-int/lit8 v8, p1, 0x8

    .line 323
    .line 324
    add-int v10, v8, v15

    .line 325
    .line 326
    new-array v2, v10, [B

    .line 327
    .line 328
    array-length v4, v5

    .line 329
    move/from16 v6, v16

    .line 330
    .line 331
    const/4 v7, 0x0

    .line 332
    invoke-static {v5, v7, v2, v6, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 333
    .line 334
    .line 335
    array-length v4, v0

    .line 336
    invoke-static {v0, v7, v2, v8, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 337
    .line 338
    .line 339
    invoke-virtual {v3, v2}, Ljava/security/MessageDigest;->digest([B)[B

    .line 340
    .line 341
    .line 342
    move-result-object v0

    .line 343
    invoke-static {v0, v1}, Ljava/security/MessageDigest;->isEqual([B[B)Z

    .line 344
    .line 345
    .line 346
    move-result v0

    .line 347
    if-eqz v0, :cond_8

    .line 348
    .line 349
    return-void

    .line 350
    :cond_8
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 351
    .line 352
    invoke-direct {v0, v12}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 353
    .line 354
    .line 355
    throw v0

    .line 356
    :cond_9
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 357
    .line 358
    invoke-direct {v0, v12}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 359
    .line 360
    .line 361
    throw v0

    .line 362
    :cond_a
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 363
    .line 364
    invoke-direct {v0, v12}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 365
    .line 366
    .line 367
    throw v0

    .line 368
    :cond_b
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 369
    .line 370
    invoke-direct {v0, v12}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 371
    .line 372
    .line 373
    throw v0

    .line 374
    :cond_c
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 375
    .line 376
    const-string v1, "signature out of range"

    .line 377
    .line 378
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 379
    .line 380
    .line 381
    throw v0

    .line 382
    :cond_d
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 383
    .line 384
    const-string v1, "invalid signature\'s length"

    .line 385
    .line 386
    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 387
    .line 388
    .line 389
    throw v0
.end method


# virtual methods
.method public final zza([B[B)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzibf;->zze:[B

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    if-nez v1, :cond_0

    .line 5
    .line 6
    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ads/zzibf;->zzb([B[B)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/zzhok;->zze([B[B)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    array-length v0, p1

    .line 17
    invoke-static {p1, v1, v0}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ads/zzibf;->zzb([B[B)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 26
    .line 27
    const-string p2, "Invalid signature (output prefix mismatch)"

    .line 28
    .line 29
    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw p1
.end method
