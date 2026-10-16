.class public final Lcom/google/android/gms/internal/ads/zzaku;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzaga;


# static fields
.field public static final synthetic zza:I


# instance fields
.field private final zzb:Lcom/google/android/gms/internal/ads/zzeu;

.field private final zzc:Lcom/google/android/gms/internal/ads/zzagx;

.field private final zzd:Lcom/google/android/gms/internal/ads/zzagt;

.field private final zze:Lcom/google/android/gms/internal/ads/zzagv;

.field private final zzf:Lcom/google/android/gms/internal/ads/zzahm;

.field private zzg:Lcom/google/android/gms/internal/ads/zzagd;

.field private zzh:Lcom/google/android/gms/internal/ads/zzahm;

.field private zzi:Lcom/google/android/gms/internal/ads/zzahm;

.field private zzj:I

.field private zzk:Lcom/google/android/gms/internal/ads/zzap;

.field private zzl:Lcom/google/android/gms/internal/ads/zzap;

.field private zzm:J

.field private zzn:J

.field private zzo:J

.field private zzp:J

.field private zzq:I

.field private zzr:Lcom/google/android/gms/internal/ads/zzaky;

.field private zzs:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    throw v0
.end method

.method public constructor <init>(I)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Lcom/google/android/gms/internal/ads/zzeu;

    const/16 v0, 0xa

    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/ads/zzeu;-><init>(I)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaku;->zzb:Lcom/google/android/gms/internal/ads/zzeu;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzagx;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzagx;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaku;->zzc:Lcom/google/android/gms/internal/ads/zzagx;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzagt;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzagt;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaku;->zzd:Lcom/google/android/gms/internal/ads/zzagt;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzaku;->zzm:J

    new-instance p1, Lcom/google/android/gms/internal/ads/zzagv;

    .line 3
    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzagv;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaku;->zze:Lcom/google/android/gms/internal/ads/zzagv;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzafx;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzafx;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaku;->zzf:Lcom/google/android/gms/internal/ads/zzahm;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaku;->zzi:Lcom/google/android/gms/internal/ads/zzahm;

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/google/android/gms/internal/ads/zzaku;->zzp:J

    return-void
.end method

.method private final zzi(Lcom/google/android/gms/internal/ads/zzagb;)I
    .locals 35
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
    const/4 v2, 0x4

    .line 6
    const/4 v3, 0x1

    .line 7
    iget v4, v0, Lcom/google/android/gms/internal/ads/zzaku;->zzj:I

    .line 8
    .line 9
    const/4 v5, -0x1

    .line 10
    const/4 v6, 0x0

    .line 11
    if-nez v4, :cond_0

    .line 12
    .line 13
    :try_start_0
    invoke-direct {v0, v1, v6}, Lcom/google/android/gms/internal/ads/zzaku;->zzk(Lcom/google/android/gms/internal/ads/zzagb;Z)Z
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :catch_0
    return v5

    .line 18
    :cond_0
    :goto_0
    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzaku;->zzr:Lcom/google/android/gms/internal/ads/zzaky;

    .line 19
    .line 20
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    if-nez v4, :cond_19

    .line 26
    .line 27
    iget-object v14, v0, Lcom/google/android/gms/internal/ads/zzaku;->zzc:Lcom/google/android/gms/internal/ads/zzagx;

    .line 28
    .line 29
    new-instance v15, Lcom/google/android/gms/internal/ads/zzeu;

    .line 30
    .line 31
    iget v4, v14, Lcom/google/android/gms/internal/ads/zzagx;->zzc:I

    .line 32
    .line 33
    invoke-direct {v15, v4}, Lcom/google/android/gms/internal/ads/zzeu;-><init>(I)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v15}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    iget v10, v14, Lcom/google/android/gms/internal/ads/zzagx;->zzc:I

    .line 41
    .line 42
    invoke-interface {v1, v4, v6, v10}, Lcom/google/android/gms/internal/ads/zzagb;->zzi([BII)V

    .line 43
    .line 44
    .line 45
    iget v4, v14, Lcom/google/android/gms/internal/ads/zzagx;->zza:I

    .line 46
    .line 47
    and-int/2addr v4, v3

    .line 48
    const/16 v10, 0x15

    .line 49
    .line 50
    const/16 v11, 0x24

    .line 51
    .line 52
    if-eqz v4, :cond_1

    .line 53
    .line 54
    iget v4, v14, Lcom/google/android/gms/internal/ads/zzagx;->zze:I

    .line 55
    .line 56
    if-eq v4, v3, :cond_3

    .line 57
    .line 58
    move v10, v11

    .line 59
    goto :goto_1

    .line 60
    :cond_1
    iget v4, v14, Lcom/google/android/gms/internal/ads/zzagx;->zze:I

    .line 61
    .line 62
    if-eq v4, v3, :cond_2

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_2
    const/16 v10, 0xd

    .line 66
    .line 67
    :cond_3
    :goto_1
    invoke-virtual {v15}, Lcom/google/android/gms/internal/ads/zzeu;->zze()I

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    add-int/lit8 v12, v10, 0x4

    .line 72
    .line 73
    const v13, 0x56425249

    .line 74
    .line 75
    .line 76
    const/16 v17, 0x0

    .line 77
    .line 78
    const v9, 0x496e666f

    .line 79
    .line 80
    .line 81
    const v2, 0x58696e67

    .line 82
    .line 83
    .line 84
    if-lt v4, v12, :cond_4

    .line 85
    .line 86
    invoke-virtual {v15, v10}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v15}, Lcom/google/android/gms/internal/ads/zzeu;->zzB()I

    .line 90
    .line 91
    .line 92
    move-result v4

    .line 93
    if-eq v4, v2, :cond_6

    .line 94
    .line 95
    if-ne v4, v9, :cond_4

    .line 96
    .line 97
    move v4, v9

    .line 98
    goto :goto_2

    .line 99
    :cond_4
    invoke-virtual {v15}, Lcom/google/android/gms/internal/ads/zzeu;->zze()I

    .line 100
    .line 101
    .line 102
    move-result v4

    .line 103
    const/16 v10, 0x28

    .line 104
    .line 105
    if-lt v4, v10, :cond_5

    .line 106
    .line 107
    invoke-virtual {v15, v11}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v15}, Lcom/google/android/gms/internal/ads/zzeu;->zzB()I

    .line 111
    .line 112
    .line 113
    move-result v4

    .line 114
    if-ne v4, v13, :cond_5

    .line 115
    .line 116
    move v4, v13

    .line 117
    goto :goto_2

    .line 118
    :cond_5
    move v4, v6

    .line 119
    :cond_6
    :goto_2
    if-eq v4, v9, :cond_9

    .line 120
    .line 121
    if-eq v4, v13, :cond_8

    .line 122
    .line 123
    if-eq v4, v2, :cond_9

    .line 124
    .line 125
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzagb;->zzl()V

    .line 126
    .line 127
    .line 128
    move-wide/from16 v25, v7

    .line 129
    .line 130
    :cond_7
    :goto_3
    move-object/from16 v2, v17

    .line 131
    .line 132
    goto/16 :goto_8

    .line 133
    .line 134
    :cond_8
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzagb;->zzo()J

    .line 135
    .line 136
    .line 137
    move-result-wide v10

    .line 138
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzagb;->zzn()J

    .line 139
    .line 140
    .line 141
    move-result-wide v12

    .line 142
    invoke-static/range {v10 .. v15}, Lcom/google/android/gms/internal/ads/zzakz;->zze(JJLcom/google/android/gms/internal/ads/zzagx;Lcom/google/android/gms/internal/ads/zzeu;)Lcom/google/android/gms/internal/ads/zzakz;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    iget v4, v14, Lcom/google/android/gms/internal/ads/zzagx;->zzc:I

    .line 147
    .line 148
    invoke-interface {v1, v4}, Lcom/google/android/gms/internal/ads/zzagb;->zzf(I)V

    .line 149
    .line 150
    .line 151
    :goto_4
    move-wide/from16 v25, v7

    .line 152
    .line 153
    goto/16 :goto_8

    .line 154
    .line 155
    :cond_9
    invoke-static {v14, v15}, Lcom/google/android/gms/internal/ads/zzala;->zza(Lcom/google/android/gms/internal/ads/zzagx;Lcom/google/android/gms/internal/ads/zzeu;)Lcom/google/android/gms/internal/ads/zzala;

    .line 156
    .line 157
    .line 158
    move-result-object v9

    .line 159
    iget-object v10, v0, Lcom/google/android/gms/internal/ads/zzaku;->zzd:Lcom/google/android/gms/internal/ads/zzagt;

    .line 160
    .line 161
    invoke-virtual {v10}, Lcom/google/android/gms/internal/ads/zzagt;->zzb()Z

    .line 162
    .line 163
    .line 164
    move-result v11

    .line 165
    if-nez v11, :cond_a

    .line 166
    .line 167
    iget v11, v9, Lcom/google/android/gms/internal/ads/zzala;->zze:I

    .line 168
    .line 169
    if-eq v11, v5, :cond_a

    .line 170
    .line 171
    iget v12, v9, Lcom/google/android/gms/internal/ads/zzala;->zzf:I

    .line 172
    .line 173
    if-eq v12, v5, :cond_a

    .line 174
    .line 175
    iput v11, v10, Lcom/google/android/gms/internal/ads/zzagt;->zza:I

    .line 176
    .line 177
    iput v12, v10, Lcom/google/android/gms/internal/ads/zzagt;->zzb:I

    .line 178
    .line 179
    :cond_a
    iget-object v10, v9, Lcom/google/android/gms/internal/ads/zzala;->zzd:Lcom/google/android/gms/internal/ads/zzakw;

    .line 180
    .line 181
    if-eqz v10, :cond_b

    .line 182
    .line 183
    new-instance v11, Lcom/google/android/gms/internal/ads/zzap;

    .line 184
    .line 185
    new-array v12, v3, [Lcom/google/android/gms/internal/ads/zzao;

    .line 186
    .line 187
    aput-object v10, v12, v6

    .line 188
    .line 189
    invoke-direct {v11, v7, v8, v12}, Lcom/google/android/gms/internal/ads/zzap;-><init>(J[Lcom/google/android/gms/internal/ads/zzao;)V

    .line 190
    .line 191
    .line 192
    goto :goto_5

    .line 193
    :cond_b
    move-object/from16 v11, v17

    .line 194
    .line 195
    :goto_5
    iput-object v11, v0, Lcom/google/android/gms/internal/ads/zzaku;->zzl:Lcom/google/android/gms/internal/ads/zzap;

    .line 196
    .line 197
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzagb;->zzn()J

    .line 198
    .line 199
    .line 200
    move-result-wide v10

    .line 201
    iget v12, v14, Lcom/google/android/gms/internal/ads/zzagx;->zzc:I

    .line 202
    .line 203
    invoke-interface {v1, v12}, Lcom/google/android/gms/internal/ads/zzagb;->zzf(I)V

    .line 204
    .line 205
    .line 206
    if-ne v4, v2, :cond_c

    .line 207
    .line 208
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzagb;->zzo()J

    .line 209
    .line 210
    .line 211
    move-result-wide v12

    .line 212
    invoke-static {v9, v10, v11, v12, v13}, Lcom/google/android/gms/internal/ads/zzalb;->zze(Lcom/google/android/gms/internal/ads/zzala;JJ)Lcom/google/android/gms/internal/ads/zzalb;

    .line 213
    .line 214
    .line 215
    move-result-object v2

    .line 216
    goto :goto_4

    .line 217
    :cond_c
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzagb;->zzo()J

    .line 218
    .line 219
    .line 220
    move-result-wide v12

    .line 221
    invoke-virtual {v9}, Lcom/google/android/gms/internal/ads/zzala;->zzb()J

    .line 222
    .line 223
    .line 224
    move-result-wide v22

    .line 225
    cmp-long v2, v22, v7

    .line 226
    .line 227
    move-wide/from16 v25, v7

    .line 228
    .line 229
    if-nez v2, :cond_d

    .line 230
    .line 231
    goto :goto_3

    .line 232
    :cond_d
    iget-wide v7, v9, Lcom/google/android/gms/internal/ads/zzala;->zzc:J

    .line 233
    .line 234
    const-wide/16 v18, -0x1

    .line 235
    .line 236
    cmp-long v2, v7, v18

    .line 237
    .line 238
    if-eqz v2, :cond_e

    .line 239
    .line 240
    add-long v12, v10, v7

    .line 241
    .line 242
    iget-object v2, v9, Lcom/google/android/gms/internal/ads/zzala;->zza:Lcom/google/android/gms/internal/ads/zzagx;

    .line 243
    .line 244
    iget v2, v2, Lcom/google/android/gms/internal/ads/zzagx;->zzc:I

    .line 245
    .line 246
    int-to-long v3, v2

    .line 247
    sub-long/2addr v7, v3

    .line 248
    :goto_6
    move-wide/from16 v18, v7

    .line 249
    .line 250
    move-wide/from16 v28, v12

    .line 251
    .line 252
    goto :goto_7

    .line 253
    :cond_e
    cmp-long v2, v12, v18

    .line 254
    .line 255
    if-eqz v2, :cond_7

    .line 256
    .line 257
    sub-long v2, v12, v10

    .line 258
    .line 259
    iget-object v4, v9, Lcom/google/android/gms/internal/ads/zzala;->zza:Lcom/google/android/gms/internal/ads/zzagx;

    .line 260
    .line 261
    iget v4, v4, Lcom/google/android/gms/internal/ads/zzagx;->zzc:I

    .line 262
    .line 263
    int-to-long v7, v4

    .line 264
    sub-long v7, v2, v7

    .line 265
    .line 266
    goto :goto_6

    .line 267
    :goto_7
    sget-object v24, Ljava/math/RoundingMode;->HALF_UP:Ljava/math/RoundingMode;

    .line 268
    .line 269
    const-wide/32 v20, 0x7a1200

    .line 270
    .line 271
    .line 272
    invoke-static/range {v18 .. v24}, Lcom/google/android/gms/internal/ads/zzfm;->zzw(JJJLjava/math/RoundingMode;)J

    .line 273
    .line 274
    .line 275
    move-result-wide v2

    .line 276
    move-wide/from16 v7, v18

    .line 277
    .line 278
    move-object/from16 v4, v24

    .line 279
    .line 280
    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ads/zzhaq;->zza(J)I

    .line 281
    .line 282
    .line 283
    move-result v32

    .line 284
    iget-wide v2, v9, Lcom/google/android/gms/internal/ads/zzala;->zzb:J

    .line 285
    .line 286
    invoke-static {v7, v8, v2, v3, v4}, Lcom/google/android/gms/internal/ads/zzhai;->zza(JJLjava/math/RoundingMode;)J

    .line 287
    .line 288
    .line 289
    move-result-wide v2

    .line 290
    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ads/zzhaq;->zza(J)I

    .line 291
    .line 292
    .line 293
    move-result v33

    .line 294
    iget-object v2, v9, Lcom/google/android/gms/internal/ads/zzala;->zza:Lcom/google/android/gms/internal/ads/zzagx;

    .line 295
    .line 296
    new-instance v27, Lcom/google/android/gms/internal/ads/zzakp;

    .line 297
    .line 298
    iget v2, v2, Lcom/google/android/gms/internal/ads/zzagx;->zzc:I

    .line 299
    .line 300
    int-to-long v2, v2

    .line 301
    add-long v30, v10, v2

    .line 302
    .line 303
    const/16 v34, 0x0

    .line 304
    .line 305
    invoke-direct/range {v27 .. v34}, Lcom/google/android/gms/internal/ads/zzakp;-><init>(JJIIZ)V

    .line 306
    .line 307
    .line 308
    move-object/from16 v2, v27

    .line 309
    .line 310
    :goto_8
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzaku;->zzk:Lcom/google/android/gms/internal/ads/zzap;

    .line 311
    .line 312
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzagb;->zzn()J

    .line 313
    .line 314
    .line 315
    move-result-wide v7

    .line 316
    if-nez v3, :cond_f

    .line 317
    .line 318
    :goto_9
    move-object/from16 v3, v17

    .line 319
    .line 320
    goto :goto_b

    .line 321
    :cond_f
    const-class v4, Lcom/google/android/gms/internal/ads/zzajv;

    .line 322
    .line 323
    invoke-static {}, Lcom/google/android/gms/internal/ads/zzgtv;->zza()Lcom/google/android/gms/internal/ads/zzgts;

    .line 324
    .line 325
    .line 326
    move-result-object v9

    .line 327
    invoke-virtual {v3, v4, v9}, Lcom/google/android/gms/internal/ads/zzap;->zzc(Ljava/lang/Class;Lcom/google/android/gms/internal/ads/zzgts;)Lcom/google/android/gms/internal/ads/zzao;

    .line 328
    .line 329
    .line 330
    move-result-object v4

    .line 331
    check-cast v4, Lcom/google/android/gms/internal/ads/zzajv;

    .line 332
    .line 333
    if-nez v4, :cond_10

    .line 334
    .line 335
    goto :goto_9

    .line 336
    :cond_10
    const-class v9, Lcom/google/android/gms/internal/ads/zzajx;

    .line 337
    .line 338
    sget-object v10, Lcom/google/android/gms/internal/ads/zzakt;->zza:Lcom/google/android/gms/internal/ads/zzakt;

    .line 339
    .line 340
    invoke-virtual {v3, v9, v10}, Lcom/google/android/gms/internal/ads/zzap;->zzc(Ljava/lang/Class;Lcom/google/android/gms/internal/ads/zzgts;)Lcom/google/android/gms/internal/ads/zzao;

    .line 341
    .line 342
    .line 343
    move-result-object v3

    .line 344
    check-cast v3, Lcom/google/android/gms/internal/ads/zzajx;

    .line 345
    .line 346
    if-nez v3, :cond_11

    .line 347
    .line 348
    move-wide/from16 v9, v25

    .line 349
    .line 350
    goto :goto_a

    .line 351
    :cond_11
    iget-object v3, v3, Lcom/google/android/gms/internal/ads/zzajx;->zzb:Lcom/google/android/gms/internal/ads/zzgwt;

    .line 352
    .line 353
    invoke-interface {v3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    move-result-object v3

    .line 357
    check-cast v3, Ljava/lang/String;

    .line 358
    .line 359
    invoke-static {v3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 360
    .line 361
    .line 362
    move-result-wide v9

    .line 363
    invoke-static {v9, v10}, Lcom/google/android/gms/internal/ads/zzfm;->zzt(J)J

    .line 364
    .line 365
    .line 366
    move-result-wide v9

    .line 367
    :goto_a
    invoke-static {v7, v8, v4, v9, v10}, Lcom/google/android/gms/internal/ads/zzakr;->zze(JLcom/google/android/gms/internal/ads/zzajv;J)Lcom/google/android/gms/internal/ads/zzakr;

    .line 368
    .line 369
    .line 370
    move-result-object v3

    .line 371
    :goto_b
    iget-boolean v4, v0, Lcom/google/android/gms/internal/ads/zzaku;->zzs:Z

    .line 372
    .line 373
    if-eqz v4, :cond_12

    .line 374
    .line 375
    new-instance v2, Lcom/google/android/gms/internal/ads/zzakx;

    .line 376
    .line 377
    invoke-direct {v2}, Lcom/google/android/gms/internal/ads/zzakx;-><init>()V

    .line 378
    .line 379
    .line 380
    goto :goto_d

    .line 381
    :cond_12
    if-eqz v3, :cond_13

    .line 382
    .line 383
    move-object v2, v3

    .line 384
    goto :goto_c

    .line 385
    :cond_13
    if-nez v2, :cond_14

    .line 386
    .line 387
    move-object/from16 v2, v17

    .line 388
    .line 389
    :cond_14
    :goto_c
    if-nez v2, :cond_15

    .line 390
    .line 391
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzaku;->zzb:Lcom/google/android/gms/internal/ads/zzeu;

    .line 392
    .line 393
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 394
    .line 395
    .line 396
    move-result-object v3

    .line 397
    const/4 v4, 0x4

    .line 398
    invoke-interface {v1, v3, v6, v4}, Lcom/google/android/gms/internal/ads/zzagb;->zzi([BII)V

    .line 399
    .line 400
    .line 401
    invoke-virtual {v2, v6}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 402
    .line 403
    .line 404
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzB()I

    .line 405
    .line 406
    .line 407
    move-result v2

    .line 408
    invoke-virtual {v14, v2}, Lcom/google/android/gms/internal/ads/zzagx;->zza(I)Z

    .line 409
    .line 410
    .line 411
    new-instance v10, Lcom/google/android/gms/internal/ads/zzakp;

    .line 412
    .line 413
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzagb;->zzo()J

    .line 414
    .line 415
    .line 416
    move-result-wide v11

    .line 417
    move-object v15, v14

    .line 418
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzagb;->zzn()J

    .line 419
    .line 420
    .line 421
    move-result-wide v13

    .line 422
    const/16 v16, 0x0

    .line 423
    .line 424
    invoke-direct/range {v10 .. v16}, Lcom/google/android/gms/internal/ads/zzakp;-><init>(JJLcom/google/android/gms/internal/ads/zzagx;Z)V

    .line 425
    .line 426
    .line 427
    move-object v14, v15

    .line 428
    move-object v2, v10

    .line 429
    :cond_15
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzaku;->zzh:Lcom/google/android/gms/internal/ads/zzahm;

    .line 430
    .line 431
    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/zzahd;->zza()J

    .line 432
    .line 433
    .line 434
    move-result-wide v7

    .line 435
    invoke-interface {v3, v7, v8}, Lcom/google/android/gms/internal/ads/zzahm;->zzP(J)V

    .line 436
    .line 437
    .line 438
    :goto_d
    iput-object v2, v0, Lcom/google/android/gms/internal/ads/zzaku;->zzr:Lcom/google/android/gms/internal/ads/zzaky;

    .line 439
    .line 440
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzaku;->zzg:Lcom/google/android/gms/internal/ads/zzagd;

    .line 441
    .line 442
    invoke-interface {v3, v2}, Lcom/google/android/gms/internal/ads/zzagd;->zzw(Lcom/google/android/gms/internal/ads/zzahd;)V

    .line 443
    .line 444
    .line 445
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzaku;->zzk:Lcom/google/android/gms/internal/ads/zzap;

    .line 446
    .line 447
    if-eqz v2, :cond_16

    .line 448
    .line 449
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzaku;->zzl:Lcom/google/android/gms/internal/ads/zzap;

    .line 450
    .line 451
    if-eqz v3, :cond_17

    .line 452
    .line 453
    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ads/zzap;->zzf(Lcom/google/android/gms/internal/ads/zzap;)Lcom/google/android/gms/internal/ads/zzap;

    .line 454
    .line 455
    .line 456
    move-result-object v2

    .line 457
    goto :goto_e

    .line 458
    :cond_16
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzaku;->zzl:Lcom/google/android/gms/internal/ads/zzap;

    .line 459
    .line 460
    :cond_17
    :goto_e
    new-instance v3, Lcom/google/android/gms/internal/ads/zzt;

    .line 461
    .line 462
    invoke-direct {v3}, Lcom/google/android/gms/internal/ads/zzt;-><init>()V

    .line 463
    .line 464
    .line 465
    const-string v4, "audio/mpeg"

    .line 466
    .line 467
    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ads/zzt;->zzn(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzt;

    .line 468
    .line 469
    .line 470
    iget-object v4, v14, Lcom/google/android/gms/internal/ads/zzagx;->zzb:Ljava/lang/String;

    .line 471
    .line 472
    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ads/zzt;->zzo(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzt;

    .line 473
    .line 474
    .line 475
    const/16 v4, 0x1000

    .line 476
    .line 477
    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ads/zzt;->zzp(I)Lcom/google/android/gms/internal/ads/zzt;

    .line 478
    .line 479
    .line 480
    iget v4, v14, Lcom/google/android/gms/internal/ads/zzagx;->zze:I

    .line 481
    .line 482
    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ads/zzt;->zzG(I)Lcom/google/android/gms/internal/ads/zzt;

    .line 483
    .line 484
    .line 485
    iget v4, v14, Lcom/google/android/gms/internal/ads/zzagx;->zzd:I

    .line 486
    .line 487
    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ads/zzt;->zzI(I)Lcom/google/android/gms/internal/ads/zzt;

    .line 488
    .line 489
    .line 490
    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzaku;->zzd:Lcom/google/android/gms/internal/ads/zzagt;

    .line 491
    .line 492
    iget v7, v4, Lcom/google/android/gms/internal/ads/zzagt;->zza:I

    .line 493
    .line 494
    invoke-virtual {v3, v7}, Lcom/google/android/gms/internal/ads/zzt;->zzK(I)Lcom/google/android/gms/internal/ads/zzt;

    .line 495
    .line 496
    .line 497
    iget v4, v4, Lcom/google/android/gms/internal/ads/zzagt;->zzb:I

    .line 498
    .line 499
    invoke-virtual {v3, v4}, Lcom/google/android/gms/internal/ads/zzt;->zzL(I)Lcom/google/android/gms/internal/ads/zzt;

    .line 500
    .line 501
    .line 502
    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/ads/zzt;->zzl(Lcom/google/android/gms/internal/ads/zzap;)Lcom/google/android/gms/internal/ads/zzt;

    .line 503
    .line 504
    .line 505
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzaku;->zzr:Lcom/google/android/gms/internal/ads/zzaky;

    .line 506
    .line 507
    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/zzaky;->zzh()I

    .line 508
    .line 509
    .line 510
    move-result v2

    .line 511
    const v4, -0x7fffffff

    .line 512
    .line 513
    .line 514
    if-eq v2, v4, :cond_18

    .line 515
    .line 516
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzaku;->zzr:Lcom/google/android/gms/internal/ads/zzaky;

    .line 517
    .line 518
    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/zzaky;->zzh()I

    .line 519
    .line 520
    .line 521
    move-result v2

    .line 522
    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/ads/zzt;->zzi(I)Lcom/google/android/gms/internal/ads/zzt;

    .line 523
    .line 524
    .line 525
    :cond_18
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzaku;->zzi:Lcom/google/android/gms/internal/ads/zzahm;

    .line 526
    .line 527
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzt;->zzP()Lcom/google/android/gms/internal/ads/zzv;

    .line 528
    .line 529
    .line 530
    move-result-object v3

    .line 531
    invoke-interface {v2, v3}, Lcom/google/android/gms/internal/ads/zzahm;->zzA(Lcom/google/android/gms/internal/ads/zzv;)V

    .line 532
    .line 533
    .line 534
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzagb;->zzn()J

    .line 535
    .line 536
    .line 537
    move-result-wide v2

    .line 538
    iput-wide v2, v0, Lcom/google/android/gms/internal/ads/zzaku;->zzo:J

    .line 539
    .line 540
    goto :goto_f

    .line 541
    :cond_19
    move-wide/from16 v25, v7

    .line 542
    .line 543
    const/16 v17, 0x0

    .line 544
    .line 545
    iget-wide v2, v0, Lcom/google/android/gms/internal/ads/zzaku;->zzo:J

    .line 546
    .line 547
    const-wide/16 v7, 0x0

    .line 548
    .line 549
    cmp-long v4, v2, v7

    .line 550
    .line 551
    if-eqz v4, :cond_1a

    .line 552
    .line 553
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzagb;->zzn()J

    .line 554
    .line 555
    .line 556
    move-result-wide v7

    .line 557
    cmp-long v4, v7, v2

    .line 558
    .line 559
    if-gez v4, :cond_1a

    .line 560
    .line 561
    sub-long/2addr v2, v7

    .line 562
    long-to-int v2, v2

    .line 563
    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/ads/zzagb;->zzf(I)V

    .line 564
    .line 565
    .line 566
    :cond_1a
    :goto_f
    iget v2, v0, Lcom/google/android/gms/internal/ads/zzaku;->zzq:I

    .line 567
    .line 568
    if-nez v2, :cond_1f

    .line 569
    .line 570
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzagb;->zzl()V

    .line 571
    .line 572
    .line 573
    invoke-direct/range {p0 .. p1}, Lcom/google/android/gms/internal/ads/zzaku;->zzl(Lcom/google/android/gms/internal/ads/zzagb;)Z

    .line 574
    .line 575
    .line 576
    move-result v2

    .line 577
    if-eqz v2, :cond_1b

    .line 578
    .line 579
    return v5

    .line 580
    :cond_1b
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzaku;->zzb:Lcom/google/android/gms/internal/ads/zzeu;

    .line 581
    .line 582
    invoke-virtual {v2, v6}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 583
    .line 584
    .line 585
    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzB()I

    .line 586
    .line 587
    .line 588
    move-result v2

    .line 589
    iget v3, v0, Lcom/google/android/gms/internal/ads/zzaku;->zzj:I

    .line 590
    .line 591
    int-to-long v3, v3

    .line 592
    invoke-static {v2, v3, v4}, Lcom/google/android/gms/internal/ads/zzaku;->zzn(IJ)Z

    .line 593
    .line 594
    .line 595
    move-result v3

    .line 596
    if-eqz v3, :cond_1c

    .line 597
    .line 598
    invoke-static {v2}, Lcom/google/android/gms/internal/ads/zzagy;->zza(I)I

    .line 599
    .line 600
    .line 601
    move-result v3

    .line 602
    if-ne v3, v5, :cond_1d

    .line 603
    .line 604
    :cond_1c
    const/4 v3, 0x1

    .line 605
    goto :goto_10

    .line 606
    :cond_1d
    iget-object v3, v0, Lcom/google/android/gms/internal/ads/zzaku;->zzc:Lcom/google/android/gms/internal/ads/zzagx;

    .line 607
    .line 608
    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/ads/zzagx;->zza(I)Z

    .line 609
    .line 610
    .line 611
    iget-wide v7, v0, Lcom/google/android/gms/internal/ads/zzaku;->zzm:J

    .line 612
    .line 613
    cmp-long v2, v7, v25

    .line 614
    .line 615
    if-nez v2, :cond_1e

    .line 616
    .line 617
    iget-object v2, v0, Lcom/google/android/gms/internal/ads/zzaku;->zzr:Lcom/google/android/gms/internal/ads/zzaky;

    .line 618
    .line 619
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzagb;->zzn()J

    .line 620
    .line 621
    .line 622
    move-result-wide v7

    .line 623
    invoke-interface {v2, v7, v8}, Lcom/google/android/gms/internal/ads/zzaky;->zzf(J)J

    .line 624
    .line 625
    .line 626
    move-result-wide v7

    .line 627
    iput-wide v7, v0, Lcom/google/android/gms/internal/ads/zzaku;->zzm:J

    .line 628
    .line 629
    :cond_1e
    iget v2, v3, Lcom/google/android/gms/internal/ads/zzagx;->zzc:I

    .line 630
    .line 631
    iput v2, v0, Lcom/google/android/gms/internal/ads/zzaku;->zzq:I

    .line 632
    .line 633
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzagb;->zzn()J

    .line 634
    .line 635
    .line 636
    move-result-wide v7

    .line 637
    int-to-long v9, v2

    .line 638
    add-long/2addr v7, v9

    .line 639
    iput-wide v7, v0, Lcom/google/android/gms/internal/ads/zzaku;->zzp:J

    .line 640
    .line 641
    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzaku;->zzr:Lcom/google/android/gms/internal/ads/zzaky;

    .line 642
    .line 643
    instance-of v4, v4, Lcom/google/android/gms/internal/ads/zzakq;

    .line 644
    .line 645
    if-nez v4, :cond_20

    .line 646
    .line 647
    :cond_1f
    const/4 v3, 0x1

    .line 648
    goto :goto_11

    .line 649
    :cond_20
    iget-wide v1, v0, Lcom/google/android/gms/internal/ads/zzaku;->zzn:J

    .line 650
    .line 651
    iget v3, v3, Lcom/google/android/gms/internal/ads/zzagx;->zzg:I

    .line 652
    .line 653
    int-to-long v3, v3

    .line 654
    add-long/2addr v1, v3

    .line 655
    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzaku;->zzj(J)J

    .line 656
    .line 657
    .line 658
    throw v17

    .line 659
    :goto_10
    invoke-interface {v1, v3}, Lcom/google/android/gms/internal/ads/zzagb;->zzf(I)V

    .line 660
    .line 661
    .line 662
    iput v6, v0, Lcom/google/android/gms/internal/ads/zzaku;->zzj:I

    .line 663
    .line 664
    return v6

    .line 665
    :goto_11
    iget-object v4, v0, Lcom/google/android/gms/internal/ads/zzaku;->zzi:Lcom/google/android/gms/internal/ads/zzahm;

    .line 666
    .line 667
    invoke-interface {v4, v1, v2, v3}, Lcom/google/android/gms/internal/ads/zzahm;->zza(Lcom/google/android/gms/internal/ads/zzj;IZ)I

    .line 668
    .line 669
    .line 670
    move-result v1

    .line 671
    if-ne v1, v5, :cond_21

    .line 672
    .line 673
    return v5

    .line 674
    :cond_21
    iget v2, v0, Lcom/google/android/gms/internal/ads/zzaku;->zzq:I

    .line 675
    .line 676
    sub-int/2addr v2, v1

    .line 677
    iput v2, v0, Lcom/google/android/gms/internal/ads/zzaku;->zzq:I

    .line 678
    .line 679
    if-lez v2, :cond_22

    .line 680
    .line 681
    return v6

    .line 682
    :cond_22
    iget-object v7, v0, Lcom/google/android/gms/internal/ads/zzaku;->zzi:Lcom/google/android/gms/internal/ads/zzahm;

    .line 683
    .line 684
    iget-wide v1, v0, Lcom/google/android/gms/internal/ads/zzaku;->zzn:J

    .line 685
    .line 686
    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzaku;->zzj(J)J

    .line 687
    .line 688
    .line 689
    move-result-wide v8

    .line 690
    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzaku;->zzc:Lcom/google/android/gms/internal/ads/zzagx;

    .line 691
    .line 692
    iget v11, v1, Lcom/google/android/gms/internal/ads/zzagx;->zzc:I

    .line 693
    .line 694
    const/4 v12, 0x0

    .line 695
    const/4 v13, 0x0

    .line 696
    const/4 v10, 0x1

    .line 697
    invoke-interface/range {v7 .. v13}, Lcom/google/android/gms/internal/ads/zzahm;->zze(JIIILcom/google/android/gms/internal/ads/zzahl;)V

    .line 698
    .line 699
    .line 700
    iget-wide v2, v0, Lcom/google/android/gms/internal/ads/zzaku;->zzn:J

    .line 701
    .line 702
    iget v1, v1, Lcom/google/android/gms/internal/ads/zzagx;->zzg:I

    .line 703
    .line 704
    int-to-long v4, v1

    .line 705
    add-long/2addr v2, v4

    .line 706
    iput-wide v2, v0, Lcom/google/android/gms/internal/ads/zzaku;->zzn:J

    .line 707
    .line 708
    iput v6, v0, Lcom/google/android/gms/internal/ads/zzaku;->zzq:I

    .line 709
    .line 710
    return v6
.end method

.method private final zzj(J)J
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaku;->zzc:Lcom/google/android/gms/internal/ads/zzagx;

    .line 2
    .line 3
    iget-wide v1, p0, Lcom/google/android/gms/internal/ads/zzaku;->zzm:J

    .line 4
    .line 5
    iget v0, v0, Lcom/google/android/gms/internal/ads/zzagx;->zzd:I

    .line 6
    .line 7
    int-to-long v3, v0

    .line 8
    const-wide/32 v5, 0xf4240

    .line 9
    .line 10
    .line 11
    mul-long/2addr p1, v5

    .line 12
    div-long/2addr p1, v3

    .line 13
    add-long/2addr p1, v1

    .line 14
    return-wide p1
.end method

.method private final zzk(Lcom/google/android/gms/internal/ads/zzagb;Z)Z
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzagb;->zzl()V

    .line 2
    .line 3
    .line 4
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzagb;->zzn()J

    .line 5
    .line 6
    .line 7
    move-result-wide v0

    .line 8
    const-wide/16 v2, 0x0

    .line 9
    .line 10
    cmp-long v0, v0, v2

    .line 11
    .line 12
    const/high16 v1, 0x20000

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    if-nez v0, :cond_2

    .line 16
    .line 17
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaku;->zze:Lcom/google/android/gms/internal/ads/zzagv;

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    invoke-virtual {v0, p1, v3, v1}, Lcom/google/android/gms/internal/ads/zzagv;->zza(Lcom/google/android/gms/internal/ads/zzagb;Lcom/google/android/gms/internal/ads/zzajo;I)Lcom/google/android/gms/internal/ads/zzap;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzaku;->zzk:Lcom/google/android/gms/internal/ads/zzap;

    .line 25
    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzaku;->zzd:Lcom/google/android/gms/internal/ads/zzagt;

    .line 29
    .line 30
    invoke-virtual {v3, v0}, Lcom/google/android/gms/internal/ads/zzagt;->zza(Lcom/google/android/gms/internal/ads/zzap;)Z

    .line 31
    .line 32
    .line 33
    :cond_0
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzagb;->zzm()J

    .line 34
    .line 35
    .line 36
    move-result-wide v3

    .line 37
    long-to-int v0, v3

    .line 38
    if-nez p2, :cond_1

    .line 39
    .line 40
    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/ads/zzagb;->zzf(I)V

    .line 41
    .line 42
    .line 43
    :cond_1
    move v3, v2

    .line 44
    :goto_0
    move v4, v3

    .line 45
    move v5, v4

    .line 46
    goto :goto_1

    .line 47
    :cond_2
    move v0, v2

    .line 48
    move v3, v0

    .line 49
    goto :goto_0

    .line 50
    :goto_1
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzaku;->zzl(Lcom/google/android/gms/internal/ads/zzagb;)Z

    .line 51
    .line 52
    .line 53
    move-result v6

    .line 54
    const/4 v7, 0x1

    .line 55
    if-eqz v6, :cond_4

    .line 56
    .line 57
    if-lez v4, :cond_3

    .line 58
    .line 59
    goto :goto_3

    .line 60
    :cond_3
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzaku;->zzm()V

    .line 61
    .line 62
    .line 63
    new-instance p1, Ljava/io/EOFException;

    .line 64
    .line 65
    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    .line 66
    .line 67
    .line 68
    throw p1

    .line 69
    :cond_4
    iget-object v6, p0, Lcom/google/android/gms/internal/ads/zzaku;->zzb:Lcom/google/android/gms/internal/ads/zzeu;

    .line 70
    .line 71
    invoke-virtual {v6, v2}, Lcom/google/android/gms/internal/ads/zzeu;->zzh(I)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzeu;->zzB()I

    .line 75
    .line 76
    .line 77
    move-result v6

    .line 78
    if-eqz v3, :cond_5

    .line 79
    .line 80
    int-to-long v8, v3

    .line 81
    invoke-static {v6, v8, v9}, Lcom/google/android/gms/internal/ads/zzaku;->zzn(IJ)Z

    .line 82
    .line 83
    .line 84
    move-result v8

    .line 85
    if-eqz v8, :cond_6

    .line 86
    .line 87
    :cond_5
    invoke-static {v6}, Lcom/google/android/gms/internal/ads/zzagy;->zza(I)I

    .line 88
    .line 89
    .line 90
    move-result v8

    .line 91
    const/4 v9, -0x1

    .line 92
    if-ne v8, v9, :cond_a

    .line 93
    .line 94
    :cond_6
    add-int/lit8 v3, v5, 0x1

    .line 95
    .line 96
    if-ne v5, v1, :cond_8

    .line 97
    .line 98
    if-eqz p2, :cond_7

    .line 99
    .line 100
    return v2

    .line 101
    :cond_7
    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzaku;->zzm()V

    .line 102
    .line 103
    .line 104
    new-instance p1, Ljava/io/EOFException;

    .line 105
    .line 106
    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    .line 107
    .line 108
    .line 109
    throw p1

    .line 110
    :cond_8
    if-eqz p2, :cond_9

    .line 111
    .line 112
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzagb;->zzl()V

    .line 113
    .line 114
    .line 115
    add-int v4, v0, v3

    .line 116
    .line 117
    invoke-interface {p1, v4}, Lcom/google/android/gms/internal/ads/zzagb;->zzk(I)V

    .line 118
    .line 119
    .line 120
    :goto_2
    move v4, v2

    .line 121
    move v5, v3

    .line 122
    move v3, v4

    .line 123
    goto :goto_1

    .line 124
    :cond_9
    invoke-interface {p1, v7}, Lcom/google/android/gms/internal/ads/zzagb;->zzf(I)V

    .line 125
    .line 126
    .line 127
    goto :goto_2

    .line 128
    :cond_a
    add-int/lit8 v4, v4, 0x1

    .line 129
    .line 130
    if-ne v4, v7, :cond_b

    .line 131
    .line 132
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzaku;->zzc:Lcom/google/android/gms/internal/ads/zzagx;

    .line 133
    .line 134
    invoke-virtual {v3, v6}, Lcom/google/android/gms/internal/ads/zzagx;->zza(I)Z

    .line 135
    .line 136
    .line 137
    move v3, v6

    .line 138
    goto :goto_5

    .line 139
    :cond_b
    const/4 v6, 0x4

    .line 140
    if-ne v4, v6, :cond_d

    .line 141
    .line 142
    :goto_3
    if-eqz p2, :cond_c

    .line 143
    .line 144
    add-int/2addr v0, v5

    .line 145
    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/ads/zzagb;->zzf(I)V

    .line 146
    .line 147
    .line 148
    goto :goto_4

    .line 149
    :cond_c
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzagb;->zzl()V

    .line 150
    .line 151
    .line 152
    :goto_4
    iput v3, p0, Lcom/google/android/gms/internal/ads/zzaku;->zzj:I

    .line 153
    .line 154
    return v7

    .line 155
    :cond_d
    :goto_5
    add-int/lit8 v8, v8, -0x4

    .line 156
    .line 157
    invoke-interface {p1, v8}, Lcom/google/android/gms/internal/ads/zzagb;->zzk(I)V

    .line 158
    .line 159
    .line 160
    goto :goto_1
.end method

.method private final zzl(Lcom/google/android/gms/internal/ads/zzagb;)Z
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaku;->zzr:Lcom/google/android/gms/internal/ads/zzaky;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzaky;->zzg()J

    .line 7
    .line 8
    .line 9
    move-result-wide v2

    .line 10
    const-wide/16 v4, -0x1

    .line 11
    .line 12
    cmp-long v0, v2, v4

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzagb;->zzm()J

    .line 17
    .line 18
    .line 19
    move-result-wide v4

    .line 20
    const-wide/16 v6, -0x4

    .line 21
    .line 22
    add-long/2addr v2, v6

    .line 23
    cmp-long v0, v4, v2

    .line 24
    .line 25
    if-lez v0, :cond_0

    .line 26
    .line 27
    return v1

    .line 28
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaku;->zzb:Lcom/google/android/gms/internal/ads/zzeu;

    .line 29
    .line 30
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeu;->zzi()[B

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    const/4 v2, 0x4

    .line 35
    const/4 v3, 0x0

    .line 36
    invoke-interface {p1, v0, v3, v2, v1}, Lcom/google/android/gms/internal/ads/zzagb;->zzh([BIIZ)Z

    .line 37
    .line 38
    .line 39
    move-result p1
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    if-nez p1, :cond_1

    .line 41
    .line 42
    return v1

    .line 43
    :cond_1
    return v3

    .line 44
    :catch_0
    return v1
.end method

.method private final zzm()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaku;->zzr:Lcom/google/android/gms/internal/ads/zzaky;

    .line 2
    .line 3
    instance-of v1, v0, Lcom/google/android/gms/internal/ads/zzakp;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzahd;->zzb()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzaku;->zzp:J

    .line 14
    .line 15
    const-wide/16 v2, -0x1

    .line 16
    .line 17
    cmp-long v2, v0, v2

    .line 18
    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzaku;->zzr:Lcom/google/android/gms/internal/ads/zzaky;

    .line 22
    .line 23
    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/zzaky;->zzg()J

    .line 24
    .line 25
    .line 26
    move-result-wide v2

    .line 27
    cmp-long v0, v0, v2

    .line 28
    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaku;->zzr:Lcom/google/android/gms/internal/ads/zzaky;

    .line 32
    .line 33
    check-cast v0, Lcom/google/android/gms/internal/ads/zzakp;

    .line 34
    .line 35
    iget-wide v1, p0, Lcom/google/android/gms/internal/ads/zzaku;->zzp:J

    .line 36
    .line 37
    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzakp;->zzi(J)Lcom/google/android/gms/internal/ads/zzakp;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzaku;->zzr:Lcom/google/android/gms/internal/ads/zzaky;

    .line 42
    .line 43
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaku;->zzg:Lcom/google/android/gms/internal/ads/zzagd;

    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzaku;->zzr:Lcom/google/android/gms/internal/ads/zzaky;

    .line 49
    .line 50
    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/zzagd;->zzw(Lcom/google/android/gms/internal/ads/zzahd;)V

    .line 51
    .line 52
    .line 53
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaku;->zzh:Lcom/google/android/gms/internal/ads/zzahm;

    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzaku;->zzr:Lcom/google/android/gms/internal/ads/zzaky;

    .line 59
    .line 60
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzahd;->zza()J

    .line 61
    .line 62
    .line 63
    :cond_0
    return-void
.end method

.method private static zzn(IJ)Z
    .locals 4

    const v0, -0x1f400

    and-int/2addr p0, v0

    int-to-long v0, p0

    const-wide/32 v2, -0x1f400

    and-long/2addr p1, v2

    cmp-long p0, v0, p1

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
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
    invoke-direct {p0, p1, v0}, Lcom/google/android/gms/internal/ads/zzaku;->zzk(Lcom/google/android/gms/internal/ads/zzagb;Z)Z

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
    .locals 2

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaku;->zzg:Lcom/google/android/gms/internal/ads/zzagd;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x1

    .line 5
    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/internal/ads/zzagd;->zzs(II)Lcom/google/android/gms/internal/ads/zzahm;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaku;->zzh:Lcom/google/android/gms/internal/ads/zzahm;

    .line 10
    .line 11
    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzaku;->zzi:Lcom/google/android/gms/internal/ads/zzahm;

    .line 12
    .line 13
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzaku;->zzg:Lcom/google/android/gms/internal/ads/zzagd;

    .line 14
    .line 15
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzagd;->zzv()V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final zzd(Lcom/google/android/gms/internal/ads/zzagb;Lcom/google/android/gms/internal/ads/zzaha;)I
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzaku;->zzh:Lcom/google/android/gms/internal/ads/zzahm;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object p2, Lcom/google/android/gms/internal/ads/zzfm;->zza:Ljava/lang/String;

    .line 7
    .line 8
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/zzaku;->zzi(Lcom/google/android/gms/internal/ads/zzagb;)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    const/4 p2, -0x1

    .line 13
    if-ne p1, p2, :cond_1

    .line 14
    .line 15
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzaku;->zzr:Lcom/google/android/gms/internal/ads/zzaky;

    .line 16
    .line 17
    instance-of p2, p2, Lcom/google/android/gms/internal/ads/zzakq;

    .line 18
    .line 19
    if-eqz p2, :cond_1

    .line 20
    .line 21
    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/zzaku;->zzn:J

    .line 22
    .line 23
    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/internal/ads/zzaku;->zzj(J)J

    .line 24
    .line 25
    .line 26
    move-result-wide v0

    .line 27
    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzaku;->zzr:Lcom/google/android/gms/internal/ads/zzaky;

    .line 28
    .line 29
    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/zzahd;->zza()J

    .line 30
    .line 31
    .line 32
    move-result-wide v2

    .line 33
    cmp-long p2, v2, v0

    .line 34
    .line 35
    if-nez p2, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzaku;->zzr:Lcom/google/android/gms/internal/ads/zzaky;

    .line 39
    .line 40
    check-cast p1, Lcom/google/android/gms/internal/ads/zzakq;

    .line 41
    .line 42
    const/4 p1, 0x0

    .line 43
    throw p1

    .line 44
    :cond_1
    :goto_0
    return p1
.end method

.method public final zze(JJ)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzaku;->zzj:I

    .line 3
    .line 4
    const-wide p2, -0x7fffffffffffffffL    # -4.9E-324

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    iput-wide p2, p0, Lcom/google/android/gms/internal/ads/zzaku;->zzm:J

    .line 10
    .line 11
    const-wide/16 p2, 0x0

    .line 12
    .line 13
    iput-wide p2, p0, Lcom/google/android/gms/internal/ads/zzaku;->zzn:J

    .line 14
    .line 15
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzaku;->zzq:I

    .line 16
    .line 17
    const-wide/16 p1, -0x1

    .line 18
    .line 19
    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/zzaku;->zzp:J

    .line 20
    .line 21
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzaku;->zzr:Lcom/google/android/gms/internal/ads/zzaky;

    .line 22
    .line 23
    instance-of p1, p1, Lcom/google/android/gms/internal/ads/zzakq;

    .line 24
    .line 25
    if-nez p1, :cond_0

    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    const/4 p1, 0x0

    .line 29
    throw p1
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

.method public final zzh()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzaku;->zzs:Z

    return-void
.end method
