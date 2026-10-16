.class public final synthetic LA7/g1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public b:I

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, LA7/g1;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lr4/f;ILcom/google/android/gms/ads/nativead/l;Ltc/g;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, LA7/g1;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, LA7/g1;->c:Ljava/lang/Object;

    .line 4
    iput p2, p0, LA7/g1;->b:I

    .line 5
    iput-object p3, p0, LA7/g1;->d:Ljava/lang/Object;

    .line 6
    iput-object p4, p0, LA7/g1;->e:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, LA7/g1;->a:I

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, v1, LA7/g1;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lr4/f;

    .line 11
    .line 12
    iget v2, v1, LA7/g1;->b:I

    .line 13
    .line 14
    invoke-static {v0, v2}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->i(Lr4/f;I)V

    .line 15
    .line 16
    .line 17
    iget-object v0, v1, LA7/g1;->e:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Ltc/g;

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    iget-object v3, v1, LA7/g1;->d:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v3, Lcom/google/android/gms/ads/nativead/l;

    .line 25
    .line 26
    invoke-virtual {v3, v0, v2}, Lcom/google/android/gms/ads/nativead/l;->l(Luc/q;Ljava/io/Serializable;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :pswitch_0
    iget-object v0, v1, LA7/g1;->c:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, LS3/l;

    .line 33
    .line 34
    iget-object v2, v0, LS3/l;->a:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v2, Landroid/app/Service;

    .line 37
    .line 38
    check-cast v2, LA7/y1;

    .line 39
    .line 40
    iget v3, v1, LA7/g1;->b:I

    .line 41
    .line 42
    invoke-interface {v2, v3}, LA7/y1;->zza(I)Z

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    if-eqz v4, :cond_0

    .line 47
    .line 48
    iget-object v4, v1, LA7/g1;->d:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v4, LA7/N;

    .line 51
    .line 52
    iget-object v4, v4, LA7/N;->n:LA7/P;

    .line 53
    .line 54
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    const-string v5, "Local AppMeasurementService processed last upload request. StartId"

    .line 59
    .line 60
    invoke-virtual {v4, v5, v3}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0}, LS3/l;->u()LA7/N;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    const-string v3, "Completed wakeful intent."

    .line 68
    .line 69
    iget-object v0, v0, LA7/N;->n:LA7/P;

    .line 70
    .line 71
    invoke-virtual {v0, v3}, LA7/P;->c(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    iget-object v0, v1, LA7/g1;->e:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v0, Landroid/content/Intent;

    .line 77
    .line 78
    invoke-interface {v2, v0}, LA7/y1;->a(Landroid/content/Intent;)V

    .line 79
    .line 80
    .line 81
    :cond_0
    return-void

    .line 82
    :pswitch_1
    const-string v0, "gad_source"

    .line 83
    .line 84
    const-string v2, "gbraid"

    .line 85
    .line 86
    const-string v3, "gclid"

    .line 87
    .line 88
    const-string v4, ""

    .line 89
    .line 90
    iget-object v5, v1, LA7/g1;->c:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v5, LA7/w0;

    .line 93
    .line 94
    iget-object v5, v5, LA7/w0;->b:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v5, LA/e0;

    .line 97
    .line 98
    iget-object v5, v5, LA/e0;->b:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v5, LA7/n0;

    .line 101
    .line 102
    iget-object v6, v5, LA7/n0;->i:LA7/N;

    .line 103
    .line 104
    iget v7, v1, LA7/g1;->b:I

    .line 105
    .line 106
    iget-object v8, v1, LA7/g1;->d:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v8, Ljava/io/IOException;

    .line 109
    .line 110
    const/16 v9, 0xc8

    .line 111
    .line 112
    if-eq v7, v9, :cond_1

    .line 113
    .line 114
    const/16 v9, 0xcc

    .line 115
    .line 116
    if-eq v7, v9, :cond_1

    .line 117
    .line 118
    const/16 v9, 0x130

    .line 119
    .line 120
    if-ne v7, v9, :cond_a

    .line 121
    .line 122
    :cond_1
    if-nez v8, :cond_a

    .line 123
    .line 124
    iget-object v7, v5, LA7/n0;->h:LA7/Z;

    .line 125
    .line 126
    invoke-static {v7}, LA7/n0;->c(LA7/B0;)V

    .line 127
    .line 128
    .line 129
    iget-object v7, v7, LA7/Z;->u:LA7/X;

    .line 130
    .line 131
    const/4 v8, 0x1

    .line 132
    invoke-virtual {v7, v8}, LA7/X;->c(Z)V

    .line 133
    .line 134
    .line 135
    iget-object v7, v1, LA7/g1;->e:Ljava/lang/Object;

    .line 136
    .line 137
    check-cast v7, [B

    .line 138
    .line 139
    if-eqz v7, :cond_9

    .line 140
    .line 141
    array-length v8, v7

    .line 142
    if-nez v8, :cond_2

    .line 143
    .line 144
    goto/16 :goto_2

    .line 145
    .line 146
    :cond_2
    new-instance v8, Ljava/lang/String;

    .line 147
    .line 148
    invoke-direct {v8, v7}, Ljava/lang/String;-><init>([B)V

    .line 149
    .line 150
    .line 151
    :try_start_0
    new-instance v7, Lorg/json/JSONObject;

    .line 152
    .line 153
    invoke-direct {v7, v8}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    const-string v8, "deeplink"

    .line 157
    .line 158
    invoke-virtual {v7, v8, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v8

    .line 162
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 163
    .line 164
    .line 165
    move-result v9

    .line 166
    if-eqz v9, :cond_3

    .line 167
    .line 168
    invoke-static {v6}, LA7/n0;->d(LA7/D0;)V

    .line 169
    .line 170
    .line 171
    iget-object v0, v6, LA7/N;->m:LA7/P;

    .line 172
    .line 173
    const-string v2, "Deferred Deep Link is empty."

    .line 174
    .line 175
    invoke-virtual {v0, v2}, LA7/P;->c(Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    goto/16 :goto_3

    .line 179
    .line 180
    :catch_0
    move-exception v0

    .line 181
    goto/16 :goto_1

    .line 182
    .line 183
    :cond_3
    invoke-virtual {v7, v3, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v9

    .line 187
    invoke-virtual {v7, v2, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v10

    .line 191
    invoke-virtual {v7, v0, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v4

    .line 195
    const-string v11, "timestamp"

    .line 196
    .line 197
    const-wide/16 v12, 0x0

    .line 198
    .line 199
    invoke-virtual {v7, v11, v12, v13}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;D)D

    .line 200
    .line 201
    .line 202
    move-result-wide v11

    .line 203
    new-instance v7, Landroid/os/Bundle;

    .line 204
    .line 205
    invoke-direct {v7}, Landroid/os/Bundle;-><init>()V

    .line 206
    .line 207
    .line 208
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzov;->zza()Z

    .line 209
    .line 210
    .line 211
    move-result v13
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 212
    iget-object v15, v5, LA7/n0;->g:LA7/e;

    .line 213
    .line 214
    iget-object v14, v5, LA7/n0;->l:LA7/U1;

    .line 215
    .line 216
    if-eqz v13, :cond_6

    .line 217
    .line 218
    :try_start_1
    sget-object v13, LA7/y;->T0:LA7/D;

    .line 219
    .line 220
    const/4 v1, 0x0

    .line 221
    invoke-virtual {v15, v1, v13}, LA7/e;->o0(Ljava/lang/String;LA7/D;)Z

    .line 222
    .line 223
    .line 224
    move-result v13

    .line 225
    if-eqz v13, :cond_6

    .line 226
    .line 227
    invoke-static {v14}, LA7/n0;->c(LA7/B0;)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v14, v8}, LA7/U1;->l1(Ljava/lang/String;)Z

    .line 231
    .line 232
    .line 233
    move-result v1

    .line 234
    if-nez v1, :cond_4

    .line 235
    .line 236
    invoke-static {v6}, LA7/n0;->d(LA7/D0;)V

    .line 237
    .line 238
    .line 239
    iget-object v0, v6, LA7/N;->i:LA7/P;

    .line 240
    .line 241
    const-string v1, "Deferred Deep Link validation failed. gclid, gbraid, deep link"

    .line 242
    .line 243
    invoke-virtual {v0, v9, v10, v8, v1}, LA7/P;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 244
    .line 245
    .line 246
    goto/16 :goto_3

    .line 247
    .line 248
    :cond_4
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 249
    .line 250
    .line 251
    move-result v1

    .line 252
    if-nez v1, :cond_5

    .line 253
    .line 254
    invoke-virtual {v7, v2, v10}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 255
    .line 256
    .line 257
    :cond_5
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 258
    .line 259
    .line 260
    move-result v1

    .line 261
    if-nez v1, :cond_7

    .line 262
    .line 263
    invoke-virtual {v7, v0, v4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 264
    .line 265
    .line 266
    goto :goto_0

    .line 267
    :cond_6
    invoke-static {v14}, LA7/n0;->c(LA7/B0;)V

    .line 268
    .line 269
    .line 270
    invoke-virtual {v14, v8}, LA7/U1;->l1(Ljava/lang/String;)Z

    .line 271
    .line 272
    .line 273
    move-result v0

    .line 274
    if-nez v0, :cond_7

    .line 275
    .line 276
    invoke-static {v6}, LA7/n0;->d(LA7/D0;)V

    .line 277
    .line 278
    .line 279
    iget-object v0, v6, LA7/N;->i:LA7/P;

    .line 280
    .line 281
    const-string v1, "Deferred Deep Link validation failed. gclid, deep link"

    .line 282
    .line 283
    invoke-virtual {v0, v9, v1, v8}, LA7/P;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 284
    .line 285
    .line 286
    goto :goto_3

    .line 287
    :cond_7
    :goto_0
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzov;->zza()Z

    .line 288
    .line 289
    .line 290
    move-result v0

    .line 291
    if-eqz v0, :cond_8

    .line 292
    .line 293
    sget-object v0, LA7/y;->T0:LA7/D;

    .line 294
    .line 295
    const/4 v1, 0x0

    .line 296
    invoke-virtual {v15, v1, v0}, LA7/e;->o0(Ljava/lang/String;LA7/D;)Z

    .line 297
    .line 298
    .line 299
    :cond_8
    invoke-virtual {v7, v3, v9}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 300
    .line 301
    .line 302
    const-string v0, "_cis"

    .line 303
    .line 304
    const-string v1, "ddp"

    .line 305
    .line 306
    invoke-virtual {v7, v0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 307
    .line 308
    .line 309
    iget-object v0, v5, LA7/n0;->p:LA7/P0;

    .line 310
    .line 311
    const-string v1, "auto"

    .line 312
    .line 313
    const-string v2, "_cmp"

    .line 314
    .line 315
    invoke-virtual {v0, v1, v2, v7}, LA7/P0;->H0(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 316
    .line 317
    .line 318
    invoke-static {v14}, LA7/n0;->c(LA7/B0;)V

    .line 319
    .line 320
    .line 321
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 322
    .line 323
    .line 324
    move-result v0

    .line 325
    if-nez v0, :cond_b

    .line 326
    .line 327
    invoke-virtual {v14, v8, v11, v12}, LA7/U1;->N0(Ljava/lang/String;D)Z

    .line 328
    .line 329
    .line 330
    move-result v0

    .line 331
    if-eqz v0, :cond_b

    .line 332
    .line 333
    new-instance v0, Landroid/content/Intent;

    .line 334
    .line 335
    const-string v1, "android.google.analytics.action.DEEPLINK_ACTION"

    .line 336
    .line 337
    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 338
    .line 339
    .line 340
    iget-object v1, v14, LA7/B0;->a:Ljava/lang/Object;

    .line 341
    .line 342
    check-cast v1, LA7/n0;

    .line 343
    .line 344
    iget-object v1, v1, LA7/n0;->a:Landroid/content/Context;

    .line 345
    .line 346
    invoke-virtual {v1, v0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    .line 347
    .line 348
    .line 349
    goto :goto_3

    .line 350
    :goto_1
    invoke-static {v6}, LA7/n0;->d(LA7/D0;)V

    .line 351
    .line 352
    .line 353
    const-string v1, "Failed to parse the Deferred Deep Link response. exception"

    .line 354
    .line 355
    iget-object v2, v6, LA7/N;->f:LA7/P;

    .line 356
    .line 357
    invoke-virtual {v2, v1, v0}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 358
    .line 359
    .line 360
    goto :goto_3

    .line 361
    :cond_9
    :goto_2
    invoke-static {v6}, LA7/n0;->d(LA7/D0;)V

    .line 362
    .line 363
    .line 364
    const-string v0, "Deferred Deep Link response empty."

    .line 365
    .line 366
    iget-object v1, v6, LA7/N;->m:LA7/P;

    .line 367
    .line 368
    invoke-virtual {v1, v0}, LA7/P;->c(Ljava/lang/String;)V

    .line 369
    .line 370
    .line 371
    goto :goto_3

    .line 372
    :cond_a
    invoke-static {v6}, LA7/n0;->d(LA7/D0;)V

    .line 373
    .line 374
    .line 375
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 376
    .line 377
    .line 378
    move-result-object v0

    .line 379
    iget-object v1, v6, LA7/N;->i:LA7/P;

    .line 380
    .line 381
    const-string v2, "Network Request for Deferred Deep Link failed. response, exception"

    .line 382
    .line 383
    invoke-virtual {v1, v0, v2, v8}, LA7/P;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 384
    .line 385
    .line 386
    :cond_b
    :goto_3
    return-void

    .line 387
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
