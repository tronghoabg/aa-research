.class public abstract Lcom/google/android/gms/internal/ads/zzcco;
.super Lcom/google/android/gms/internal/ads/zzbem;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzccp;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    const-string v0, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ads/zzbem;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static zzt(Landroid/os/IBinder;)Lcom/google/android/gms/internal/ads/zzccp;
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    const-string v0, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd"

    .line 6
    .line 7
    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    instance-of v1, v0, Lcom/google/android/gms/internal/ads/zzccp;

    .line 12
    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    check-cast v0, Lcom/google/android/gms/internal/ads/zzccp;

    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzccn;

    .line 19
    .line 20
    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/zzccn;-><init>(Landroid/os/IBinder;)V

    .line 21
    .line 22
    .line 23
    return-object v0
.end method


# virtual methods
.method public final zzdd(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 1
    const-string p4, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback"

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    packed-switch p1, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return p1

    .line 9
    :pswitch_0
    invoke-virtual {p2}, Landroid/os/Parcel;->readLong()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    invoke-static {p2}, Lcom/google/android/gms/internal/ads/zzben;->zzh(Landroid/os/Parcel;)V

    .line 14
    .line 15
    .line 16
    invoke-interface {p0, v0, v1}, Lcom/google/android/gms/internal/ads/zzccp;->zzr(J)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 20
    .line 21
    .line 22
    goto/16 :goto_5

    .line 23
    .line 24
    :pswitch_1
    invoke-interface {p0}, Lcom/google/android/gms/internal/ads/zzccp;->zzq()J

    .line 25
    .line 26
    .line 27
    move-result-wide p1

    .line 28
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p3, p1, p2}, Landroid/os/Parcel;->writeLong(J)V

    .line 32
    .line 33
    .line 34
    goto/16 :goto_5

    .line 35
    .line 36
    :pswitch_2
    invoke-interface {p0}, Lcom/google/android/gms/internal/ads/zzccp;->zzn()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    goto/16 :goto_5

    .line 47
    .line 48
    :pswitch_3
    invoke-static {p2}, Lcom/google/android/gms/internal/ads/zzben;->zza(Landroid/os/Parcel;)Z

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    invoke-static {p2}, Lcom/google/android/gms/internal/ads/zzben;->zzh(Landroid/os/Parcel;)V

    .line 53
    .line 54
    .line 55
    invoke-interface {p0, p1}, Lcom/google/android/gms/internal/ads/zzccp;->zzp(Z)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 59
    .line 60
    .line 61
    goto/16 :goto_5

    .line 62
    .line 63
    :pswitch_4
    sget-object p1, LD6/v1;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 64
    .line 65
    invoke-static {p2, p1}, Lcom/google/android/gms/internal/ads/zzben;->zzb(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    check-cast p1, LD6/v1;

    .line 70
    .line 71
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    if-nez v1, :cond_0

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_0
    invoke-interface {v1, p4}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 79
    .line 80
    .line 81
    move-result-object p4

    .line 82
    instance-of v0, p4, Lcom/google/android/gms/internal/ads/zzccw;

    .line 83
    .line 84
    if-eqz v0, :cond_1

    .line 85
    .line 86
    move-object v0, p4

    .line 87
    check-cast v0, Lcom/google/android/gms/internal/ads/zzccw;

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_1
    new-instance v0, Lcom/google/android/gms/internal/ads/zzccu;

    .line 91
    .line 92
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzccu;-><init>(Landroid/os/IBinder;)V

    .line 93
    .line 94
    .line 95
    :goto_0
    invoke-static {p2}, Lcom/google/android/gms/internal/ads/zzben;->zzh(Landroid/os/Parcel;)V

    .line 96
    .line 97
    .line 98
    invoke-interface {p0, p1, v0}, Lcom/google/android/gms/internal/ads/zzccp;->zzd(LD6/v1;Lcom/google/android/gms/internal/ads/zzccw;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 102
    .line 103
    .line 104
    goto/16 :goto_5

    .line 105
    .line 106
    :pswitch_5
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    invoke-static {p1}, LD6/n1;->R(Landroid/os/IBinder;)LD6/A0;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    invoke-static {p2}, Lcom/google/android/gms/internal/ads/zzben;->zzh(Landroid/os/Parcel;)V

    .line 115
    .line 116
    .line 117
    invoke-interface {p0, p1}, Lcom/google/android/gms/internal/ads/zzccp;->zzo(LD6/A0;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 121
    .line 122
    .line 123
    goto/16 :goto_5

    .line 124
    .line 125
    :pswitch_6
    invoke-interface {p0}, Lcom/google/android/gms/internal/ads/zzccp;->zzm()LD6/H0;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 130
    .line 131
    .line 132
    invoke-static {p3, p1}, Lcom/google/android/gms/internal/ads/zzben;->zze(Landroid/os/Parcel;Landroid/os/IInterface;)V

    .line 133
    .line 134
    .line 135
    goto/16 :goto_5

    .line 136
    .line 137
    :pswitch_7
    invoke-interface {p0}, Lcom/google/android/gms/internal/ads/zzccp;->zzl()Lcom/google/android/gms/internal/ads/zzccm;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 142
    .line 143
    .line 144
    invoke-static {p3, p1}, Lcom/google/android/gms/internal/ads/zzben;->zze(Landroid/os/Parcel;Landroid/os/IInterface;)V

    .line 145
    .line 146
    .line 147
    goto/16 :goto_5

    .line 148
    .line 149
    :pswitch_8
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    invoke-static {p1}, Lq7/b;->R(Landroid/os/IBinder;)Lq7/a;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    invoke-static {p2}, Lcom/google/android/gms/internal/ads/zzben;->zza(Landroid/os/Parcel;)Z

    .line 158
    .line 159
    .line 160
    move-result p4

    .line 161
    invoke-static {p2}, Lcom/google/android/gms/internal/ads/zzben;->zzh(Landroid/os/Parcel;)V

    .line 162
    .line 163
    .line 164
    invoke-interface {p0, p1, p4}, Lcom/google/android/gms/internal/ads/zzccp;->zzk(Lq7/a;Z)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 168
    .line 169
    .line 170
    goto/16 :goto_5

    .line 171
    .line 172
    :pswitch_9
    invoke-interface {p0}, Lcom/google/android/gms/internal/ads/zzccp;->zzg()Landroid/os/Bundle;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 177
    .line 178
    .line 179
    invoke-static {p3, p1}, Lcom/google/android/gms/internal/ads/zzben;->zzd(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    .line 180
    .line 181
    .line 182
    goto/16 :goto_5

    .line 183
    .line 184
    :pswitch_a
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 185
    .line 186
    .line 187
    move-result-object p1

    .line 188
    if-nez p1, :cond_2

    .line 189
    .line 190
    goto :goto_1

    .line 191
    :cond_2
    const-string p4, "com.google.android.gms.ads.internal.client.IOnAdMetadataChangedListener"

    .line 192
    .line 193
    invoke-interface {p1, p4}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    instance-of v1, v0, LD6/y0;

    .line 198
    .line 199
    if-eqz v1, :cond_3

    .line 200
    .line 201
    check-cast v0, LD6/y0;

    .line 202
    .line 203
    goto :goto_1

    .line 204
    :cond_3
    new-instance v0, LD6/x0;

    .line 205
    .line 206
    invoke-direct {v0, p1, p4}, Lcom/google/android/gms/internal/ads/zzbel;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    :goto_1
    invoke-static {p2}, Lcom/google/android/gms/internal/ads/zzben;->zzh(Landroid/os/Parcel;)V

    .line 210
    .line 211
    .line 212
    invoke-interface {p0, v0}, Lcom/google/android/gms/internal/ads/zzccp;->zzf(LD6/y0;)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 216
    .line 217
    .line 218
    goto/16 :goto_5

    .line 219
    .line 220
    :pswitch_b
    sget-object p1, Lcom/google/android/gms/internal/ads/zzcdd;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 221
    .line 222
    invoke-static {p2, p1}, Lcom/google/android/gms/internal/ads/zzben;->zzb(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 223
    .line 224
    .line 225
    move-result-object p1

    .line 226
    check-cast p1, Lcom/google/android/gms/internal/ads/zzcdd;

    .line 227
    .line 228
    invoke-static {p2}, Lcom/google/android/gms/internal/ads/zzben;->zzh(Landroid/os/Parcel;)V

    .line 229
    .line 230
    .line 231
    invoke-interface {p0, p1}, Lcom/google/android/gms/internal/ads/zzccp;->zzh(Lcom/google/android/gms/internal/ads/zzcdd;)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 235
    .line 236
    .line 237
    goto/16 :goto_5

    .line 238
    .line 239
    :pswitch_c
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 240
    .line 241
    .line 242
    move-result-object p1

    .line 243
    if-nez p1, :cond_4

    .line 244
    .line 245
    goto :goto_2

    .line 246
    :cond_4
    const-string p4, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener"

    .line 247
    .line 248
    invoke-interface {p1, p4}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 249
    .line 250
    .line 251
    move-result-object p4

    .line 252
    instance-of v0, p4, Lcom/google/android/gms/internal/ads/zzccx;

    .line 253
    .line 254
    if-eqz v0, :cond_5

    .line 255
    .line 256
    move-object v0, p4

    .line 257
    check-cast v0, Lcom/google/android/gms/internal/ads/zzccx;

    .line 258
    .line 259
    goto :goto_2

    .line 260
    :cond_5
    new-instance v0, Lcom/google/android/gms/internal/ads/zzccx;

    .line 261
    .line 262
    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/ads/zzccx;-><init>(Landroid/os/IBinder;)V

    .line 263
    .line 264
    .line 265
    :goto_2
    invoke-static {p2}, Lcom/google/android/gms/internal/ads/zzben;->zzh(Landroid/os/Parcel;)V

    .line 266
    .line 267
    .line 268
    invoke-interface {p0, v0}, Lcom/google/android/gms/internal/ads/zzccp;->zzs(Lcom/google/android/gms/internal/ads/zzccx;)V

    .line 269
    .line 270
    .line 271
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 272
    .line 273
    .line 274
    goto/16 :goto_5

    .line 275
    .line 276
    :pswitch_d
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 277
    .line 278
    .line 279
    move-result-object p1

    .line 280
    invoke-static {p1}, Lq7/b;->R(Landroid/os/IBinder;)Lq7/a;

    .line 281
    .line 282
    .line 283
    move-result-object p1

    .line 284
    invoke-static {p2}, Lcom/google/android/gms/internal/ads/zzben;->zzh(Landroid/os/Parcel;)V

    .line 285
    .line 286
    .line 287
    invoke-interface {p0, p1}, Lcom/google/android/gms/internal/ads/zzccp;->zzb(Lq7/a;)V

    .line 288
    .line 289
    .line 290
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 291
    .line 292
    .line 293
    goto :goto_5

    .line 294
    :pswitch_e
    invoke-interface {p0}, Lcom/google/android/gms/internal/ads/zzccp;->zzj()Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object p1

    .line 298
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 299
    .line 300
    .line 301
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 302
    .line 303
    .line 304
    goto :goto_5

    .line 305
    :pswitch_f
    invoke-interface {p0}, Lcom/google/android/gms/internal/ads/zzccp;->zzi()Z

    .line 306
    .line 307
    .line 308
    move-result p1

    .line 309
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 310
    .line 311
    .line 312
    sget p2, Lcom/google/android/gms/internal/ads/zzben;->zza:I

    .line 313
    .line 314
    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 315
    .line 316
    .line 317
    goto :goto_5

    .line 318
    :pswitch_10
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 319
    .line 320
    .line 321
    move-result-object p1

    .line 322
    if-nez p1, :cond_6

    .line 323
    .line 324
    goto :goto_3

    .line 325
    :cond_6
    const-string p4, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback"

    .line 326
    .line 327
    invoke-interface {p1, p4}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 328
    .line 329
    .line 330
    move-result-object p4

    .line 331
    instance-of v0, p4, Lcom/google/android/gms/internal/ads/zzccs;

    .line 332
    .line 333
    if-eqz v0, :cond_7

    .line 334
    .line 335
    move-object v0, p4

    .line 336
    check-cast v0, Lcom/google/android/gms/internal/ads/zzccs;

    .line 337
    .line 338
    goto :goto_3

    .line 339
    :cond_7
    new-instance v0, Lcom/google/android/gms/internal/ads/zzccq;

    .line 340
    .line 341
    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/ads/zzccq;-><init>(Landroid/os/IBinder;)V

    .line 342
    .line 343
    .line 344
    :goto_3
    invoke-static {p2}, Lcom/google/android/gms/internal/ads/zzben;->zzh(Landroid/os/Parcel;)V

    .line 345
    .line 346
    .line 347
    invoke-interface {p0, v0}, Lcom/google/android/gms/internal/ads/zzccp;->zze(Lcom/google/android/gms/internal/ads/zzccs;)V

    .line 348
    .line 349
    .line 350
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 351
    .line 352
    .line 353
    goto :goto_5

    .line 354
    :pswitch_11
    sget-object p1, LD6/v1;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 355
    .line 356
    invoke-static {p2, p1}, Lcom/google/android/gms/internal/ads/zzben;->zzb(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 357
    .line 358
    .line 359
    move-result-object p1

    .line 360
    check-cast p1, LD6/v1;

    .line 361
    .line 362
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 363
    .line 364
    .line 365
    move-result-object v1

    .line 366
    if-nez v1, :cond_8

    .line 367
    .line 368
    goto :goto_4

    .line 369
    :cond_8
    invoke-interface {v1, p4}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 370
    .line 371
    .line 372
    move-result-object p4

    .line 373
    instance-of v0, p4, Lcom/google/android/gms/internal/ads/zzccw;

    .line 374
    .line 375
    if-eqz v0, :cond_9

    .line 376
    .line 377
    move-object v0, p4

    .line 378
    check-cast v0, Lcom/google/android/gms/internal/ads/zzccw;

    .line 379
    .line 380
    goto :goto_4

    .line 381
    :cond_9
    new-instance v0, Lcom/google/android/gms/internal/ads/zzccu;

    .line 382
    .line 383
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ads/zzccu;-><init>(Landroid/os/IBinder;)V

    .line 384
    .line 385
    .line 386
    :goto_4
    invoke-static {p2}, Lcom/google/android/gms/internal/ads/zzben;->zzh(Landroid/os/Parcel;)V

    .line 387
    .line 388
    .line 389
    invoke-interface {p0, p1, v0}, Lcom/google/android/gms/internal/ads/zzccp;->zzc(LD6/v1;Lcom/google/android/gms/internal/ads/zzccw;)V

    .line 390
    .line 391
    .line 392
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 393
    .line 394
    .line 395
    :goto_5
    const/4 p1, 0x1

    .line 396
    return p1

    .line 397
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
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
        :pswitch_0
    .end packed-switch
.end method
