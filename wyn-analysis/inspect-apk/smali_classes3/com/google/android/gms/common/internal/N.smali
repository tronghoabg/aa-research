.class public final Lcom/google/android/gms/common/internal/N;
.super Lcom/google/android/gms/internal/common/zzg;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lcom/google/android/gms/common/internal/f;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/internal/f;Landroid/os/Looper;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/common/internal/N;->a:Lcom/google/android/gms/common/internal/f;

    .line 5
    .line 6
    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/common/zzg;-><init>(Landroid/os/Looper;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/common/internal/N;->a:Lcom/google/android/gms/common/internal/f;

    .line 2
    .line 3
    iget-object v1, v0, Lcom/google/android/gms/common/internal/f;->zzd:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    iget v2, p1, Landroid/os/Message;->arg1:I

    .line 10
    .line 11
    const/4 v3, 0x7

    .line 12
    const/4 v4, 0x2

    .line 13
    const/4 v5, 0x1

    .line 14
    if-eq v1, v2, :cond_2

    .line 15
    .line 16
    iget v0, p1, Landroid/os/Message;->what:I

    .line 17
    .line 18
    if-eq v0, v4, :cond_1

    .line 19
    .line 20
    if-eq v0, v5, :cond_1

    .line 21
    .line 22
    if-ne v0, v3, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    return-void

    .line 26
    :cond_1
    :goto_0
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast p1, Lcom/google/android/gms/common/internal/G;

    .line 29
    .line 30
    if-eqz p1, :cond_19

    .line 31
    .line 32
    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/G;->c()V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_2
    iget v1, p1, Landroid/os/Message;->what:I

    .line 37
    .line 38
    const/4 v2, 0x4

    .line 39
    const/4 v6, 0x5

    .line 40
    if-eq v1, v5, :cond_4

    .line 41
    .line 42
    if-eq v1, v3, :cond_4

    .line 43
    .line 44
    if-ne v1, v2, :cond_3

    .line 45
    .line 46
    invoke-virtual {v0}, Lcom/google/android/gms/common/internal/f;->enableLocalFallback()Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-eqz v1, :cond_4

    .line 51
    .line 52
    :cond_3
    iget v1, p1, Landroid/os/Message;->what:I

    .line 53
    .line 54
    if-ne v1, v6, :cond_5

    .line 55
    .line 56
    :cond_4
    invoke-virtual {v0}, Lcom/google/android/gms/common/internal/f;->isConnecting()Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-eqz v1, :cond_18

    .line 61
    .line 62
    :cond_5
    iget v1, p1, Landroid/os/Message;->what:I

    .line 63
    .line 64
    const/4 v7, 0x0

    .line 65
    const/16 v8, 0x8

    .line 66
    .line 67
    const/4 v9, 0x3

    .line 68
    if-ne v1, v2, :cond_9

    .line 69
    .line 70
    new-instance v1, Ld7/b;

    .line 71
    .line 72
    iget p1, p1, Landroid/os/Message;->arg2:I

    .line 73
    .line 74
    invoke-direct {v1, p1, v7, v7}, Ld7/b;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/internal/f;->zzn(Ld7/b;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0}, Lcom/google/android/gms/common/internal/f;->zzg()Z

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    if-eqz p1, :cond_7

    .line 85
    .line 86
    invoke-virtual {v0}, Lcom/google/android/gms/common/internal/f;->zzo()Z

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    if-eqz p1, :cond_6

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_6
    invoke-virtual {v0, v9, v7}, Lcom/google/android/gms/common/internal/f;->zzd(ILandroid/os/IInterface;)V

    .line 94
    .line 95
    .line 96
    return-void

    .line 97
    :cond_7
    :goto_1
    invoke-virtual {v0}, Lcom/google/android/gms/common/internal/f;->zzm()Ld7/b;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    if-eqz p1, :cond_8

    .line 102
    .line 103
    invoke-virtual {v0}, Lcom/google/android/gms/common/internal/f;->zzm()Ld7/b;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    goto :goto_2

    .line 108
    :cond_8
    new-instance p1, Ld7/b;

    .line 109
    .line 110
    invoke-direct {p1, v8, v7, v7}, Ld7/b;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;)V

    .line 111
    .line 112
    .line 113
    :goto_2
    iget-object v1, v0, Lcom/google/android/gms/common/internal/f;->zzc:Lcom/google/android/gms/common/internal/d;

    .line 114
    .line 115
    invoke-interface {v1, p1}, Lcom/google/android/gms/common/internal/d;->b(Ld7/b;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v0, p1}, Lcom/google/android/gms/common/internal/f;->onConnectionFailed(Ld7/b;)V

    .line 119
    .line 120
    .line 121
    return-void

    .line 122
    :cond_9
    if-ne v1, v6, :cond_b

    .line 123
    .line 124
    invoke-virtual {v0}, Lcom/google/android/gms/common/internal/f;->zzm()Ld7/b;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    if-eqz p1, :cond_a

    .line 129
    .line 130
    invoke-virtual {v0}, Lcom/google/android/gms/common/internal/f;->zzm()Ld7/b;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    goto :goto_3

    .line 135
    :cond_a
    new-instance p1, Ld7/b;

    .line 136
    .line 137
    invoke-direct {p1, v8, v7, v7}, Ld7/b;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;)V

    .line 138
    .line 139
    .line 140
    :goto_3
    iget-object v1, v0, Lcom/google/android/gms/common/internal/f;->zzc:Lcom/google/android/gms/common/internal/d;

    .line 141
    .line 142
    invoke-interface {v1, p1}, Lcom/google/android/gms/common/internal/d;->b(Ld7/b;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v0, p1}, Lcom/google/android/gms/common/internal/f;->onConnectionFailed(Ld7/b;)V

    .line 146
    .line 147
    .line 148
    return-void

    .line 149
    :cond_b
    if-ne v1, v9, :cond_d

    .line 150
    .line 151
    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 152
    .line 153
    instance-of v2, v1, Landroid/app/PendingIntent;

    .line 154
    .line 155
    if-eqz v2, :cond_c

    .line 156
    .line 157
    check-cast v1, Landroid/app/PendingIntent;

    .line 158
    .line 159
    goto :goto_4

    .line 160
    :cond_c
    move-object v1, v7

    .line 161
    :goto_4
    new-instance v2, Ld7/b;

    .line 162
    .line 163
    iget p1, p1, Landroid/os/Message;->arg2:I

    .line 164
    .line 165
    invoke-direct {v2, p1, v7, v1}, Ld7/b;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;)V

    .line 166
    .line 167
    .line 168
    iget-object p1, v0, Lcom/google/android/gms/common/internal/f;->zzc:Lcom/google/android/gms/common/internal/d;

    .line 169
    .line 170
    invoke-interface {p1, v2}, Lcom/google/android/gms/common/internal/d;->b(Ld7/b;)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v0, v2}, Lcom/google/android/gms/common/internal/f;->onConnectionFailed(Ld7/b;)V

    .line 174
    .line 175
    .line 176
    return-void

    .line 177
    :cond_d
    const/4 v2, 0x6

    .line 178
    if-ne v1, v2, :cond_f

    .line 179
    .line 180
    invoke-virtual {v0, v6, v7}, Lcom/google/android/gms/common/internal/f;->zzd(ILandroid/os/IInterface;)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v0}, Lcom/google/android/gms/common/internal/f;->zzk()Lcom/google/android/gms/common/internal/b;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    if-eqz v1, :cond_e

    .line 188
    .line 189
    iget v1, p1, Landroid/os/Message;->arg2:I

    .line 190
    .line 191
    invoke-virtual {v0}, Lcom/google/android/gms/common/internal/f;->zzk()Lcom/google/android/gms/common/internal/b;

    .line 192
    .line 193
    .line 194
    move-result-object v2

    .line 195
    invoke-interface {v2, v1}, Lcom/google/android/gms/common/internal/b;->onConnectionSuspended(I)V

    .line 196
    .line 197
    .line 198
    :cond_e
    iget p1, p1, Landroid/os/Message;->arg2:I

    .line 199
    .line 200
    invoke-virtual {v0, p1}, Lcom/google/android/gms/common/internal/f;->onConnectionSuspended(I)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {v0, v6, v5, v7}, Lcom/google/android/gms/common/internal/f;->zze(IILandroid/os/IInterface;)Z

    .line 204
    .line 205
    .line 206
    return-void

    .line 207
    :cond_f
    if-ne v1, v4, :cond_11

    .line 208
    .line 209
    invoke-virtual {v0}, Lcom/google/android/gms/common/internal/f;->isConnected()Z

    .line 210
    .line 211
    .line 212
    move-result v0

    .line 213
    if-eqz v0, :cond_10

    .line 214
    .line 215
    goto :goto_5

    .line 216
    :cond_10
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 217
    .line 218
    check-cast p1, Lcom/google/android/gms/common/internal/G;

    .line 219
    .line 220
    if-eqz p1, :cond_19

    .line 221
    .line 222
    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/G;->c()V

    .line 223
    .line 224
    .line 225
    return-void

    .line 226
    :cond_11
    :goto_5
    iget v0, p1, Landroid/os/Message;->what:I

    .line 227
    .line 228
    if-eq v0, v4, :cond_13

    .line 229
    .line 230
    if-eq v0, v5, :cond_13

    .line 231
    .line 232
    if-ne v0, v3, :cond_12

    .line 233
    .line 234
    goto :goto_6

    .line 235
    :cond_12
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object p1

    .line 239
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 240
    .line 241
    .line 242
    move-result p1

    .line 243
    new-instance v1, Ljava/lang/StringBuilder;

    .line 244
    .line 245
    add-int/lit8 p1, p1, 0x22

    .line 246
    .line 247
    invoke-direct {v1, p1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 248
    .line 249
    .line 250
    const-string p1, "Don\'t know how to handle message: "

    .line 251
    .line 252
    invoke-static {v0, p1, v1}, LN0/a;->d(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object p1

    .line 256
    new-instance v0, Ljava/lang/Exception;

    .line 257
    .line 258
    invoke-direct {v0}, Ljava/lang/Exception;-><init>()V

    .line 259
    .line 260
    .line 261
    const-string v1, "GmsClient"

    .line 262
    .line 263
    invoke-static {v1, p1, v0}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 264
    .line 265
    .line 266
    return-void

    .line 267
    :cond_13
    :goto_6
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 268
    .line 269
    move-object v0, p1

    .line 270
    check-cast v0, Lcom/google/android/gms/common/internal/G;

    .line 271
    .line 272
    const-string p1, " being reused. This is not safe."

    .line 273
    .line 274
    const-string v1, "Callback proxy "

    .line 275
    .line 276
    monitor-enter v0

    .line 277
    :try_start_0
    iget-object v2, v0, Lcom/google/android/gms/common/internal/G;->a:Ljava/lang/Boolean;

    .line 278
    .line 279
    iget-boolean v3, v0, Lcom/google/android/gms/common/internal/G;->b:Z

    .line 280
    .line 281
    if-eqz v3, :cond_14

    .line 282
    .line 283
    const-string v3, "GmsClient"

    .line 284
    .line 285
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object v4

    .line 289
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 290
    .line 291
    .line 292
    move-result v6

    .line 293
    add-int/lit8 v6, v6, 0x2f

    .line 294
    .line 295
    new-instance v9, Ljava/lang/StringBuilder;

    .line 296
    .line 297
    invoke-direct {v9, v6}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 298
    .line 299
    .line 300
    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 301
    .line 302
    .line 303
    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 304
    .line 305
    .line 306
    invoke-virtual {v9, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 307
    .line 308
    .line 309
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 310
    .line 311
    .line 312
    move-result-object p1

    .line 313
    invoke-static {v3, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 314
    .line 315
    .line 316
    goto :goto_7

    .line 317
    :catchall_0
    move-exception p1

    .line 318
    goto :goto_a

    .line 319
    :cond_14
    :goto_7
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 320
    if-eqz v2, :cond_17

    .line 321
    .line 322
    iget-object p1, v0, Lcom/google/android/gms/common/internal/G;->f:Lcom/google/android/gms/common/internal/f;

    .line 323
    .line 324
    iget v1, v0, Lcom/google/android/gms/common/internal/G;->d:I

    .line 325
    .line 326
    if-nez v1, :cond_15

    .line 327
    .line 328
    invoke-virtual {v0}, Lcom/google/android/gms/common/internal/G;->a()Z

    .line 329
    .line 330
    .line 331
    move-result v1

    .line 332
    if-nez v1, :cond_17

    .line 333
    .line 334
    invoke-virtual {p1, v5, v7}, Lcom/google/android/gms/common/internal/f;->zzd(ILandroid/os/IInterface;)V

    .line 335
    .line 336
    .line 337
    new-instance p1, Ld7/b;

    .line 338
    .line 339
    invoke-direct {p1, v8, v7, v7}, Ld7/b;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;)V

    .line 340
    .line 341
    .line 342
    invoke-virtual {v0, p1}, Lcom/google/android/gms/common/internal/G;->b(Ld7/b;)V

    .line 343
    .line 344
    .line 345
    goto :goto_9

    .line 346
    :cond_15
    invoke-virtual {p1, v5, v7}, Lcom/google/android/gms/common/internal/f;->zzd(ILandroid/os/IInterface;)V

    .line 347
    .line 348
    .line 349
    iget-object p1, v0, Lcom/google/android/gms/common/internal/G;->e:Landroid/os/Bundle;

    .line 350
    .line 351
    if-eqz p1, :cond_16

    .line 352
    .line 353
    const-string v2, "pendingIntent"

    .line 354
    .line 355
    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 356
    .line 357
    .line 358
    move-result-object p1

    .line 359
    check-cast p1, Landroid/app/PendingIntent;

    .line 360
    .line 361
    goto :goto_8

    .line 362
    :cond_16
    move-object p1, v7

    .line 363
    :goto_8
    new-instance v2, Ld7/b;

    .line 364
    .line 365
    invoke-direct {v2, v1, v7, p1}, Ld7/b;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;)V

    .line 366
    .line 367
    .line 368
    invoke-virtual {v0, v2}, Lcom/google/android/gms/common/internal/G;->b(Ld7/b;)V

    .line 369
    .line 370
    .line 371
    :cond_17
    :goto_9
    monitor-enter v0

    .line 372
    :try_start_1
    iput-boolean v5, v0, Lcom/google/android/gms/common/internal/G;->b:Z

    .line 373
    .line 374
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 375
    invoke-virtual {v0}, Lcom/google/android/gms/common/internal/G;->c()V

    .line 376
    .line 377
    .line 378
    return-void

    .line 379
    :catchall_1
    move-exception p1

    .line 380
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 381
    throw p1

    .line 382
    :goto_a
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 383
    throw p1

    .line 384
    :cond_18
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 385
    .line 386
    check-cast p1, Lcom/google/android/gms/common/internal/G;

    .line 387
    .line 388
    if-eqz p1, :cond_19

    .line 389
    .line 390
    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/G;->c()V

    .line 391
    .line 392
    .line 393
    :cond_19
    return-void
.end method
