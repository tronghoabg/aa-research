.class public final synthetic LA7/S0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public synthetic b:Landroid/os/Bundle;

.field public synthetic c:LA7/P0;


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, LA7/S0;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(LA7/P0;Landroid/os/Bundle;I)V
    .locals 0

    .line 2
    iput p3, p0, LA7/S0;->a:I

    iput-object p2, p0, LA7/S0;->b:Landroid/os/Bundle;

    iput-object p1, p0, LA7/S0;->c:LA7/P0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, LA7/S0;->a:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    const-string v1, "app_id"

    .line 9
    .line 10
    iget-object v2, v0, LA7/S0;->c:LA7/P0;

    .line 11
    .line 12
    invoke-virtual {v2}, LA7/B;->c0()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v2}, LA7/Y;->h0()V

    .line 16
    .line 17
    .line 18
    iget-object v3, v0, LA7/S0;->b:Landroid/os/Bundle;

    .line 19
    .line 20
    const-string v4, "name"

    .line 21
    .line 22
    invoke-virtual {v3, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v9

    .line 26
    const-string v4, "origin"

    .line 27
    .line 28
    invoke-virtual {v3, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v13

    .line 32
    invoke-static {v9}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-static {v13}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    const-string v4, "value"

    .line 39
    .line 40
    invoke-virtual {v3, v4}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    invoke-static {v5}, Lcom/google/android/gms/common/internal/v;->i(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    iget-object v5, v2, LA7/B0;->a:Ljava/lang/Object;

    .line 48
    .line 49
    move-object/from16 v25, v5

    .line 50
    .line 51
    check-cast v25, LA7/n0;

    .line 52
    .line 53
    invoke-virtual/range {v25 .. v25}, LA7/n0;->e()Z

    .line 54
    .line 55
    .line 56
    move-result v5

    .line 57
    if-nez v5, :cond_0

    .line 58
    .line 59
    invoke-virtual {v2}, LA7/B0;->zzj()LA7/N;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    const-string v2, "Conditional property not set since app measurement is disabled"

    .line 64
    .line 65
    iget-object v1, v1, LA7/N;->n:LA7/P;

    .line 66
    .line 67
    invoke-virtual {v1, v2}, LA7/P;->c(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    goto/16 :goto_0

    .line 71
    .line 72
    :cond_0
    new-instance v5, LA7/R1;

    .line 73
    .line 74
    const-string v6, "triggered_timestamp"

    .line 75
    .line 76
    invoke-virtual {v3, v6}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    .line 77
    .line 78
    .line 79
    move-result-wide v6

    .line 80
    invoke-virtual {v3, v4}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v8

    .line 84
    move-object v10, v13

    .line 85
    invoke-direct/range {v5 .. v10}, LA7/R1;-><init>(JLjava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    :try_start_0
    invoke-virtual {v2}, LA7/B0;->b0()LA7/U1;

    .line 89
    .line 90
    .line 91
    move-result-object v10

    .line 92
    invoke-virtual {v3, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    const-string v4, "triggered_event_name"

    .line 96
    .line 97
    invoke-virtual {v3, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v11

    .line 101
    const-string v4, "triggered_event_params"

    .line 102
    .line 103
    invoke-virtual {v3, v4}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 104
    .line 105
    .line 106
    move-result-object v12

    .line 107
    const-wide/16 v14, 0x0

    .line 108
    .line 109
    const/16 v16, 0x1

    .line 110
    .line 111
    invoke-virtual/range {v10 .. v16}, LA7/U1;->m0(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;JZ)LA7/x;

    .line 112
    .line 113
    .line 114
    move-result-object v21

    .line 115
    invoke-virtual {v2}, LA7/B0;->b0()LA7/U1;

    .line 116
    .line 117
    .line 118
    move-result-object v10

    .line 119
    invoke-virtual {v3, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    const-string v4, "timed_out_event_name"

    .line 123
    .line 124
    invoke-virtual {v3, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v11

    .line 128
    const-string v4, "timed_out_event_params"

    .line 129
    .line 130
    invoke-virtual {v3, v4}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 131
    .line 132
    .line 133
    move-result-object v12

    .line 134
    const-wide/16 v14, 0x0

    .line 135
    .line 136
    const/16 v16, 0x1

    .line 137
    .line 138
    invoke-virtual/range {v10 .. v16}, LA7/U1;->m0(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;JZ)LA7/x;

    .line 139
    .line 140
    .line 141
    move-result-object v18

    .line 142
    invoke-virtual {v2}, LA7/B0;->b0()LA7/U1;

    .line 143
    .line 144
    .line 145
    move-result-object v10

    .line 146
    invoke-virtual {v3, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    const-string v2, "expired_event_name"

    .line 150
    .line 151
    invoke-virtual {v3, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v11

    .line 155
    const-string v2, "expired_event_params"

    .line 156
    .line 157
    invoke-virtual {v3, v2}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 158
    .line 159
    .line 160
    move-result-object v12

    .line 161
    const-wide/16 v14, 0x0

    .line 162
    .line 163
    const/16 v16, 0x1

    .line 164
    .line 165
    invoke-virtual/range {v10 .. v16}, LA7/U1;->m0(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;JZ)LA7/x;

    .line 166
    .line 167
    .line 168
    move-result-object v24
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 169
    new-instance v10, LA7/d;

    .line 170
    .line 171
    invoke-virtual {v3, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v11

    .line 175
    const-string v1, "creation_timestamp"

    .line 176
    .line 177
    invoke-virtual {v3, v1}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    .line 178
    .line 179
    .line 180
    move-result-wide v14

    .line 181
    const-string v1, "trigger_event_name"

    .line 182
    .line 183
    invoke-virtual {v3, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v17

    .line 187
    const-string v1, "trigger_timeout"

    .line 188
    .line 189
    invoke-virtual {v3, v1}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    .line 190
    .line 191
    .line 192
    move-result-wide v19

    .line 193
    const-string v1, "time_to_live"

    .line 194
    .line 195
    invoke-virtual {v3, v1}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    .line 196
    .line 197
    .line 198
    move-result-wide v22

    .line 199
    const/16 v16, 0x0

    .line 200
    .line 201
    move-object v12, v13

    .line 202
    move-object v13, v5

    .line 203
    invoke-direct/range {v10 .. v24}, LA7/d;-><init>(Ljava/lang/String;Ljava/lang/String;LA7/R1;JZLjava/lang/String;LA7/x;JLA7/x;JLA7/x;)V

    .line 204
    .line 205
    .line 206
    invoke-virtual/range {v25 .. v25}, LA7/n0;->m()LA7/m1;

    .line 207
    .line 208
    .line 209
    move-result-object v1

    .line 210
    invoke-virtual {v1, v10}, LA7/m1;->k0(LA7/d;)V

    .line 211
    .line 212
    .line 213
    :catch_0
    :goto_0
    return-void

    .line 214
    :pswitch_0
    const-string v1, "creation_timestamp"

    .line 215
    .line 216
    const-string v2, "app_id"

    .line 217
    .line 218
    iget-object v3, v0, LA7/S0;->c:LA7/P0;

    .line 219
    .line 220
    invoke-virtual {v3}, LA7/B;->c0()V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v3}, LA7/Y;->h0()V

    .line 224
    .line 225
    .line 226
    iget-object v4, v0, LA7/S0;->b:Landroid/os/Bundle;

    .line 227
    .line 228
    const-string v5, "name"

    .line 229
    .line 230
    invoke-virtual {v4, v5}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v10

    .line 234
    invoke-static {v10}, Lcom/google/android/gms/common/internal/v;->f(Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    iget-object v5, v3, LA7/B0;->a:Ljava/lang/Object;

    .line 238
    .line 239
    check-cast v5, LA7/n0;

    .line 240
    .line 241
    invoke-virtual {v5}, LA7/n0;->e()Z

    .line 242
    .line 243
    .line 244
    move-result v6

    .line 245
    if-nez v6, :cond_1

    .line 246
    .line 247
    invoke-virtual {v3}, LA7/B0;->zzj()LA7/N;

    .line 248
    .line 249
    .line 250
    move-result-object v1

    .line 251
    const-string v2, "Conditional property not cleared since app measurement is disabled"

    .line 252
    .line 253
    iget-object v1, v1, LA7/N;->n:LA7/P;

    .line 254
    .line 255
    invoke-virtual {v1, v2}, LA7/P;->c(Ljava/lang/String;)V

    .line 256
    .line 257
    .line 258
    goto :goto_1

    .line 259
    :cond_1
    new-instance v6, LA7/R1;

    .line 260
    .line 261
    const-wide/16 v7, 0x0

    .line 262
    .line 263
    const/4 v9, 0x0

    .line 264
    const-string v11, ""

    .line 265
    .line 266
    invoke-direct/range {v6 .. v11}, LA7/R1;-><init>(JLjava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    .line 267
    .line 268
    .line 269
    :try_start_1
    invoke-virtual {v3}, LA7/B0;->b0()LA7/U1;

    .line 270
    .line 271
    .line 272
    move-result-object v7

    .line 273
    invoke-virtual {v4, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    const-string v3, "expired_event_name"

    .line 277
    .line 278
    invoke-virtual {v4, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object v8

    .line 282
    const-string v3, "expired_event_params"

    .line 283
    .line 284
    invoke-virtual {v4, v3}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 285
    .line 286
    .line 287
    move-result-object v9

    .line 288
    const-string v10, ""

    .line 289
    .line 290
    invoke-virtual {v4, v1}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    .line 291
    .line 292
    .line 293
    move-result-wide v11

    .line 294
    const/4 v13, 0x1

    .line 295
    invoke-virtual/range {v7 .. v13}, LA7/U1;->m0(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;JZ)LA7/x;

    .line 296
    .line 297
    .line 298
    move-result-object v20
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1

    .line 299
    move-object v9, v6

    .line 300
    new-instance v6, LA7/d;

    .line 301
    .line 302
    invoke-virtual {v4, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 303
    .line 304
    .line 305
    move-result-object v7

    .line 306
    invoke-virtual {v4, v1}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    .line 307
    .line 308
    .line 309
    move-result-wide v10

    .line 310
    const-string v1, "active"

    .line 311
    .line 312
    invoke-virtual {v4, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 313
    .line 314
    .line 315
    move-result v12

    .line 316
    const-string v1, "trigger_event_name"

    .line 317
    .line 318
    invoke-virtual {v4, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 319
    .line 320
    .line 321
    move-result-object v13

    .line 322
    const-string v1, "trigger_timeout"

    .line 323
    .line 324
    invoke-virtual {v4, v1}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    .line 325
    .line 326
    .line 327
    move-result-wide v15

    .line 328
    const-string v1, "time_to_live"

    .line 329
    .line 330
    invoke-virtual {v4, v1}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    .line 331
    .line 332
    .line 333
    move-result-wide v18

    .line 334
    const/16 v17, 0x0

    .line 335
    .line 336
    const-string v8, ""

    .line 337
    .line 338
    const/4 v14, 0x0

    .line 339
    invoke-direct/range {v6 .. v20}, LA7/d;-><init>(Ljava/lang/String;Ljava/lang/String;LA7/R1;JZLjava/lang/String;LA7/x;JLA7/x;JLA7/x;)V

    .line 340
    .line 341
    .line 342
    invoke-virtual {v5}, LA7/n0;->m()LA7/m1;

    .line 343
    .line 344
    .line 345
    move-result-object v1

    .line 346
    invoke-virtual {v1, v6}, LA7/m1;->k0(LA7/d;)V

    .line 347
    .line 348
    .line 349
    :catch_1
    :goto_1
    return-void

    .line 350
    :pswitch_1
    iget-object v1, v0, LA7/S0;->c:LA7/P0;

    .line 351
    .line 352
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 353
    .line 354
    .line 355
    iget-object v2, v0, LA7/S0;->b:Landroid/os/Bundle;

    .line 356
    .line 357
    invoke-virtual {v2}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 358
    .line 359
    .line 360
    move-result v3

    .line 361
    const/4 v4, 0x0

    .line 362
    const/4 v5, 0x0

    .line 363
    iget-object v6, v1, LA7/B0;->a:Ljava/lang/Object;

    .line 364
    .line 365
    check-cast v6, LA7/n0;

    .line 366
    .line 367
    if-eqz v3, :cond_2

    .line 368
    .line 369
    move-object v3, v2

    .line 370
    goto/16 :goto_5

    .line 371
    .line 372
    :cond_2
    invoke-virtual {v1}, LA7/B0;->a0()LA7/Z;

    .line 373
    .line 374
    .line 375
    move-result-object v3

    .line 376
    iget-object v3, v3, LA7/Z;->z:LVa/X7;

    .line 377
    .line 378
    invoke-virtual {v3}, LVa/X7;->o()Landroid/os/Bundle;

    .line 379
    .line 380
    .line 381
    move-result-object v3

    .line 382
    iget-object v7, v6, LA7/n0;->g:LA7/e;

    .line 383
    .line 384
    sget-object v8, LA7/y;->h1:LA7/D;

    .line 385
    .line 386
    invoke-virtual {v7, v5, v8}, LA7/e;->o0(Ljava/lang/String;LA7/D;)Z

    .line 387
    .line 388
    .line 389
    move-result v7

    .line 390
    if-eqz v7, :cond_3

    .line 391
    .line 392
    new-instance v7, Landroid/os/Bundle;

    .line 393
    .line 394
    invoke-direct {v7, v3}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 395
    .line 396
    .line 397
    move-object v3, v7

    .line 398
    :cond_3
    invoke-virtual {v2}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 399
    .line 400
    .line 401
    move-result-object v7

    .line 402
    invoke-interface {v7}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 403
    .line 404
    .line 405
    move-result-object v7

    .line 406
    :cond_4
    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 407
    .line 408
    .line 409
    move-result v8

    .line 410
    iget-object v9, v1, LA7/P0;->v:Ly3/j;

    .line 411
    .line 412
    iget-object v10, v6, LA7/n0;->g:LA7/e;

    .line 413
    .line 414
    if-eqz v8, :cond_9

    .line 415
    .line 416
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 417
    .line 418
    .line 419
    move-result-object v8

    .line 420
    check-cast v8, Ljava/lang/String;

    .line 421
    .line 422
    invoke-virtual {v2, v8}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 423
    .line 424
    .line 425
    move-result-object v15

    .line 426
    if-eqz v15, :cond_6

    .line 427
    .line 428
    instance-of v11, v15, Ljava/lang/String;

    .line 429
    .line 430
    if-nez v11, :cond_6

    .line 431
    .line 432
    instance-of v11, v15, Ljava/lang/Long;

    .line 433
    .line 434
    if-nez v11, :cond_6

    .line 435
    .line 436
    instance-of v11, v15, Ljava/lang/Double;

    .line 437
    .line 438
    if-nez v11, :cond_6

    .line 439
    .line 440
    invoke-virtual {v1}, LA7/B0;->b0()LA7/U1;

    .line 441
    .line 442
    .line 443
    invoke-static {v15}, LA7/U1;->M0(Ljava/lang/Object;)Z

    .line 444
    .line 445
    .line 446
    move-result v10

    .line 447
    if-eqz v10, :cond_5

    .line 448
    .line 449
    invoke-virtual {v1}, LA7/B0;->b0()LA7/U1;

    .line 450
    .line 451
    .line 452
    const/16 v11, 0x1b

    .line 453
    .line 454
    const/4 v12, 0x0

    .line 455
    const/4 v10, 0x0

    .line 456
    const/4 v13, 0x0

    .line 457
    const/4 v14, 0x0

    .line 458
    invoke-static/range {v9 .. v14}, LA7/U1;->H0(Ly3/j;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V

    .line 459
    .line 460
    .line 461
    :cond_5
    invoke-virtual {v1}, LA7/B0;->zzj()LA7/N;

    .line 462
    .line 463
    .line 464
    move-result-object v9

    .line 465
    const-string v10, "Invalid default event parameter type. Name, value"

    .line 466
    .line 467
    iget-object v9, v9, LA7/N;->k:LA7/P;

    .line 468
    .line 469
    invoke-virtual {v9, v8, v10, v15}, LA7/P;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 470
    .line 471
    .line 472
    goto :goto_2

    .line 473
    :cond_6
    invoke-static {v8}, LA7/U1;->j1(Ljava/lang/String;)Z

    .line 474
    .line 475
    .line 476
    move-result v9

    .line 477
    if-eqz v9, :cond_7

    .line 478
    .line 479
    invoke-virtual {v1}, LA7/B0;->zzj()LA7/N;

    .line 480
    .line 481
    .line 482
    move-result-object v9

    .line 483
    const-string v10, "Invalid default event parameter name. Name"

    .line 484
    .line 485
    iget-object v9, v9, LA7/N;->k:LA7/P;

    .line 486
    .line 487
    invoke-virtual {v9, v10, v8}, LA7/P;->d(Ljava/lang/String;Ljava/lang/Object;)V

    .line 488
    .line 489
    .line 490
    goto :goto_2

    .line 491
    :cond_7
    if-nez v15, :cond_8

    .line 492
    .line 493
    invoke-virtual {v3, v8}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 494
    .line 495
    .line 496
    goto :goto_2

    .line 497
    :cond_8
    invoke-virtual {v1}, LA7/B0;->b0()LA7/U1;

    .line 498
    .line 499
    .line 500
    move-result-object v9

    .line 501
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 502
    .line 503
    .line 504
    const/16 v10, 0x1f4

    .line 505
    .line 506
    const-string v11, "param"

    .line 507
    .line 508
    invoke-virtual {v9, v11, v10, v8, v15}, LA7/U1;->O0(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Object;)Z

    .line 509
    .line 510
    .line 511
    move-result v9

    .line 512
    if-eqz v9, :cond_4

    .line 513
    .line 514
    invoke-virtual {v1}, LA7/B0;->b0()LA7/U1;

    .line 515
    .line 516
    .line 517
    move-result-object v9

    .line 518
    invoke-virtual {v9, v8, v15, v3}, LA7/U1;->F0(Ljava/lang/String;Ljava/lang/Object;Landroid/os/Bundle;)V

    .line 519
    .line 520
    .line 521
    goto :goto_2

    .line 522
    :cond_9
    invoke-virtual {v1}, LA7/B0;->b0()LA7/U1;

    .line 523
    .line 524
    .line 525
    invoke-virtual {v10}, LA7/B0;->b0()LA7/U1;

    .line 526
    .line 527
    .line 528
    move-result-object v7

    .line 529
    const v8, 0xc02a560

    .line 530
    .line 531
    .line 532
    invoke-virtual {v7, v8}, LA7/U1;->U0(I)Z

    .line 533
    .line 534
    .line 535
    move-result v7

    .line 536
    if-eqz v7, :cond_a

    .line 537
    .line 538
    const/16 v7, 0x64

    .line 539
    .line 540
    goto :goto_3

    .line 541
    :cond_a
    const/16 v7, 0x19

    .line 542
    .line 543
    :goto_3
    invoke-virtual {v3}, Landroid/os/BaseBundle;->size()I

    .line 544
    .line 545
    .line 546
    move-result v8

    .line 547
    if-gt v8, v7, :cond_b

    .line 548
    .line 549
    goto :goto_5

    .line 550
    :cond_b
    new-instance v8, Ljava/util/TreeSet;

    .line 551
    .line 552
    invoke-virtual {v3}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 553
    .line 554
    .line 555
    move-result-object v10

    .line 556
    invoke-direct {v8, v10}, Ljava/util/TreeSet;-><init>(Ljava/util/Collection;)V

    .line 557
    .line 558
    .line 559
    invoke-virtual {v8}, Ljava/util/TreeSet;->iterator()Ljava/util/Iterator;

    .line 560
    .line 561
    .line 562
    move-result-object v8

    .line 563
    move v10, v4

    .line 564
    :cond_c
    :goto_4
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 565
    .line 566
    .line 567
    move-result v11

    .line 568
    if-eqz v11, :cond_d

    .line 569
    .line 570
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 571
    .line 572
    .line 573
    move-result-object v11

    .line 574
    check-cast v11, Ljava/lang/String;

    .line 575
    .line 576
    add-int/lit8 v10, v10, 0x1

    .line 577
    .line 578
    if-le v10, v7, :cond_c

    .line 579
    .line 580
    invoke-virtual {v3, v11}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 581
    .line 582
    .line 583
    goto :goto_4

    .line 584
    :cond_d
    invoke-virtual {v1}, LA7/B0;->b0()LA7/U1;

    .line 585
    .line 586
    .line 587
    const/16 v11, 0x1a

    .line 588
    .line 589
    const/4 v12, 0x0

    .line 590
    const/4 v10, 0x0

    .line 591
    const/4 v13, 0x0

    .line 592
    const/4 v14, 0x0

    .line 593
    invoke-static/range {v9 .. v14}, LA7/U1;->H0(Ly3/j;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V

    .line 594
    .line 595
    .line 596
    invoke-virtual {v1}, LA7/B0;->zzj()LA7/N;

    .line 597
    .line 598
    .line 599
    move-result-object v7

    .line 600
    const-string v8, "Too many default event parameters set. Discarding beyond event parameter limit"

    .line 601
    .line 602
    iget-object v7, v7, LA7/N;->k:LA7/P;

    .line 603
    .line 604
    invoke-virtual {v7, v8}, LA7/P;->c(Ljava/lang/String;)V

    .line 605
    .line 606
    .line 607
    :goto_5
    invoke-virtual {v1}, LA7/B0;->a0()LA7/Z;

    .line 608
    .line 609
    .line 610
    move-result-object v1

    .line 611
    iget-object v1, v1, LA7/Z;->z:LVa/X7;

    .line 612
    .line 613
    invoke-virtual {v1, v3}, LVa/X7;->p(Landroid/os/Bundle;)V

    .line 614
    .line 615
    .line 616
    invoke-virtual {v2}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 617
    .line 618
    .line 619
    move-result v1

    .line 620
    if-eqz v1, :cond_e

    .line 621
    .line 622
    iget-object v1, v6, LA7/n0;->g:LA7/e;

    .line 623
    .line 624
    sget-object v2, LA7/y;->f1:LA7/D;

    .line 625
    .line 626
    invoke-virtual {v1, v5, v2}, LA7/e;->o0(Ljava/lang/String;LA7/D;)Z

    .line 627
    .line 628
    .line 629
    move-result v1

    .line 630
    if-eqz v1, :cond_f

    .line 631
    .line 632
    :cond_e
    invoke-static {v6}, LA7/p0;->h(LA7/n0;)LA7/m1;

    .line 633
    .line 634
    .line 635
    move-result-object v1

    .line 636
    invoke-virtual {v1, v4}, LA7/m1;->w0(Z)LA7/N1;

    .line 637
    .line 638
    .line 639
    move-result-object v2

    .line 640
    new-instance v4, LA7/w0;

    .line 641
    .line 642
    const/4 v5, 0x7

    .line 643
    invoke-direct {v4, v1, v2, v3, v5}, LA7/w0;-><init>(LA7/m1;LA7/N1;Ljava/lang/Object;I)V

    .line 644
    .line 645
    .line 646
    invoke-virtual {v1, v4}, LA7/m1;->m0(Ljava/lang/Runnable;)V

    .line 647
    .line 648
    .line 649
    :cond_f
    return-void

    .line 650
    nop

    .line 651
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
