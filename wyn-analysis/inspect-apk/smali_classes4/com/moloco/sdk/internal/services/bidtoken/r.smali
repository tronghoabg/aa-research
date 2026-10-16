.class public final Lcom/moloco/sdk/internal/services/bidtoken/r;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lcom/moloco/sdk/internal/services/v;

.field public final b:Lcom/moloco/sdk/internal/services/i;


# direct methods
.method public constructor <init>(Lcom/moloco/sdk/internal/services/v;Lcom/moloco/sdk/internal/services/i;)V
    .locals 1

    .line 1
    const-string v0, "deviceInfoService"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "screenInfoService"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/moloco/sdk/internal/services/bidtoken/r;->a:Lcom/moloco/sdk/internal/services/v;

    .line 15
    .line 16
    iput-object p2, p0, Lcom/moloco/sdk/internal/services/bidtoken/r;->b:Lcom/moloco/sdk/internal/services/i;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final a(Lcom/moloco/sdk/internal/services/bidtoken/providers/k;Lcom/moloco/sdk/internal/services/bidtoken/g;)Lcom/moloco/sdk/Q;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    const-string v3, "bidTokenConfig"

    .line 8
    .line 9
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iget-object v3, v0, Lcom/moloco/sdk/internal/services/bidtoken/r;->a:Lcom/moloco/sdk/internal/services/v;

    .line 13
    .line 14
    invoke-virtual {v3}, Lcom/moloco/sdk/internal/services/v;->a()Lcom/moloco/sdk/internal/services/F;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    iget-object v5, v0, Lcom/moloco/sdk/internal/services/bidtoken/r;->b:Lcom/moloco/sdk/internal/services/i;

    .line 19
    .line 20
    invoke-virtual {v5}, Lcom/moloco/sdk/internal/services/i;->a()Lcom/moloco/sdk/internal/services/h;

    .line 21
    .line 22
    .line 23
    move-result-object v5

    .line 24
    invoke-static {}, Lcom/moloco/sdk/Q;->n()Lcom/moloco/sdk/t;

    .line 25
    .line 26
    .line 27
    move-result-object v6

    .line 28
    invoke-static {}, Lcom/moloco/sdk/N;->c()Lcom/moloco/sdk/M;

    .line 29
    .line 30
    .line 31
    move-result-object v7

    .line 32
    iget-boolean v8, v1, Lcom/moloco/sdk/internal/services/bidtoken/providers/k;->a:Z

    .line 33
    .line 34
    invoke-virtual {v7, v8}, Lcom/moloco/sdk/M;->a(Z)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v7}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 38
    .line 39
    .line 40
    move-result-object v7

    .line 41
    check-cast v7, Lcom/moloco/sdk/N;

    .line 42
    .line 43
    invoke-virtual {v6, v7}, Lcom/moloco/sdk/t;->h(Lcom/moloco/sdk/N;)V

    .line 44
    .line 45
    .line 46
    invoke-static {}, Lcom/moloco/sdk/G;->e()Lcom/moloco/sdk/F;

    .line 47
    .line 48
    .line 49
    move-result-object v7

    .line 50
    iget-object v8, v1, Lcom/moloco/sdk/internal/services/bidtoken/providers/k;->c:Lcom/moloco/sdk/internal/services/bidtoken/providers/q;

    .line 51
    .line 52
    iget-object v9, v8, Lcom/moloco/sdk/internal/services/bidtoken/providers/q;->a:Ljava/lang/Boolean;

    .line 53
    .line 54
    if-eqz v9, :cond_0

    .line 55
    .line 56
    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    .line 57
    .line 58
    .line 59
    move-result v9

    .line 60
    invoke-virtual {v7, v9}, Lcom/moloco/sdk/F;->a(Z)V

    .line 61
    .line 62
    .line 63
    :cond_0
    iget-object v9, v8, Lcom/moloco/sdk/internal/services/bidtoken/providers/q;->b:Ljava/lang/Long;

    .line 64
    .line 65
    if-eqz v9, :cond_1

    .line 66
    .line 67
    invoke-virtual {v9}, Ljava/lang/Number;->longValue()J

    .line 68
    .line 69
    .line 70
    move-result-wide v9

    .line 71
    invoke-virtual {v7, v9, v10}, Lcom/moloco/sdk/F;->b(J)V

    .line 72
    .line 73
    .line 74
    :cond_1
    iget-object v8, v8, Lcom/moloco/sdk/internal/services/bidtoken/providers/q;->c:Ljava/lang/Long;

    .line 75
    .line 76
    if-eqz v8, :cond_2

    .line 77
    .line 78
    invoke-virtual {v8}, Ljava/lang/Number;->longValue()J

    .line 79
    .line 80
    .line 81
    move-result-wide v8

    .line 82
    invoke-virtual {v7, v8, v9}, Lcom/moloco/sdk/F;->c(J)V

    .line 83
    .line 84
    .line 85
    :cond_2
    invoke-virtual {v7}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 86
    .line 87
    .line 88
    move-result-object v7

    .line 89
    check-cast v7, Lcom/moloco/sdk/G;

    .line 90
    .line 91
    invoke-virtual {v6, v7}, Lcom/moloco/sdk/t;->j(Lcom/moloco/sdk/G;)V

    .line 92
    .line 93
    .line 94
    invoke-static {}, Lcom/moloco/sdk/y;->c()Lcom/moloco/sdk/x;

    .line 95
    .line 96
    .line 97
    move-result-object v7

    .line 98
    iget-object v8, v1, Lcom/moloco/sdk/internal/services/bidtoken/providers/k;->d:Lcom/moloco/sdk/internal/services/bidtoken/providers/d;

    .line 99
    .line 100
    iget-object v8, v8, Lcom/moloco/sdk/internal/services/bidtoken/providers/d;->a:Ljava/lang/Long;

    .line 101
    .line 102
    if-eqz v8, :cond_3

    .line 103
    .line 104
    invoke-virtual {v8}, Ljava/lang/Number;->longValue()J

    .line 105
    .line 106
    .line 107
    move-result-wide v8

    .line 108
    invoke-virtual {v7, v8, v9}, Lcom/moloco/sdk/x;->a(J)V

    .line 109
    .line 110
    .line 111
    :cond_3
    invoke-virtual {v7}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 112
    .line 113
    .line 114
    move-result-object v7

    .line 115
    check-cast v7, Lcom/moloco/sdk/y;

    .line 116
    .line 117
    invoke-virtual {v6, v7}, Lcom/moloco/sdk/t;->f(Lcom/moloco/sdk/y;)V

    .line 118
    .line 119
    .line 120
    invoke-static {}, Lcom/moloco/sdk/J;->f()Lcom/moloco/sdk/H;

    .line 121
    .line 122
    .line 123
    move-result-object v7

    .line 124
    iget-object v8, v1, Lcom/moloco/sdk/internal/services/bidtoken/providers/k;->e:Lcom/moloco/sdk/internal/services/bidtoken/providers/s;

    .line 125
    .line 126
    iget-object v9, v8, Lcom/moloco/sdk/internal/services/bidtoken/providers/s;->a:Ljava/lang/Integer;

    .line 127
    .line 128
    if-eqz v9, :cond_4

    .line 129
    .line 130
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 131
    .line 132
    .line 133
    move-result v9

    .line 134
    invoke-virtual {v7, v9}, Lcom/moloco/sdk/H;->a(I)V

    .line 135
    .line 136
    .line 137
    :cond_4
    iget-object v9, v8, Lcom/moloco/sdk/internal/services/bidtoken/providers/s;->b:Ljava/lang/Integer;

    .line 138
    .line 139
    if-eqz v9, :cond_5

    .line 140
    .line 141
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 142
    .line 143
    .line 144
    move-result v9

    .line 145
    invoke-virtual {v7, v9}, Lcom/moloco/sdk/H;->b(I)V

    .line 146
    .line 147
    .line 148
    :cond_5
    iget-object v9, v8, Lcom/moloco/sdk/internal/services/bidtoken/providers/s;->c:Ljava/lang/Boolean;

    .line 149
    .line 150
    if-eqz v9, :cond_6

    .line 151
    .line 152
    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    .line 153
    .line 154
    .line 155
    move-result v9

    .line 156
    invoke-virtual {v7, v9}, Lcom/moloco/sdk/H;->c(Z)V

    .line 157
    .line 158
    .line 159
    :cond_6
    iget-object v8, v8, Lcom/moloco/sdk/internal/services/bidtoken/providers/s;->d:LBa/c;

    .line 160
    .line 161
    if-eqz v8, :cond_a

    .line 162
    .line 163
    instance-of v9, v8, Lcom/moloco/sdk/internal/services/a;

    .line 164
    .line 165
    if-eqz v9, :cond_7

    .line 166
    .line 167
    sget-object v8, Lcom/moloco/sdk/I;->c:Lcom/moloco/sdk/I;

    .line 168
    .line 169
    goto :goto_0

    .line 170
    :cond_7
    sget-object v9, Lcom/moloco/sdk/internal/services/b;->j:Lcom/moloco/sdk/internal/services/b;

    .line 171
    .line 172
    invoke-virtual {v8, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result v9

    .line 176
    if-eqz v9, :cond_8

    .line 177
    .line 178
    sget-object v8, Lcom/moloco/sdk/I;->d:Lcom/moloco/sdk/I;

    .line 179
    .line 180
    goto :goto_0

    .line 181
    :cond_8
    sget-object v9, Lcom/moloco/sdk/internal/services/b;->k:Lcom/moloco/sdk/internal/services/b;

    .line 182
    .line 183
    invoke-virtual {v8, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    move-result v8

    .line 187
    if-eqz v8, :cond_9

    .line 188
    .line 189
    sget-object v8, Lcom/moloco/sdk/I;->b:Lcom/moloco/sdk/I;

    .line 190
    .line 191
    :goto_0
    invoke-virtual {v7, v8}, Lcom/moloco/sdk/H;->d(Lcom/moloco/sdk/I;)V

    .line 192
    .line 193
    .line 194
    goto :goto_1

    .line 195
    :cond_9
    new-instance v1, LE5/Q;

    .line 196
    .line 197
    const/16 v2, 0x9

    .line 198
    .line 199
    const/4 v3, 0x0

    .line 200
    invoke-direct {v1, v3, v2}, LE5/Q;-><init>(BI)V

    .line 201
    .line 202
    .line 203
    throw v1

    .line 204
    :cond_a
    :goto_1
    invoke-virtual {v7}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 205
    .line 206
    .line 207
    move-result-object v7

    .line 208
    check-cast v7, Lcom/moloco/sdk/J;

    .line 209
    .line 210
    invoke-virtual {v6, v7}, Lcom/moloco/sdk/t;->k(Lcom/moloco/sdk/J;)V

    .line 211
    .line 212
    .line 213
    invoke-static {}, Lcom/moloco/sdk/s;->e()Lcom/moloco/sdk/r;

    .line 214
    .line 215
    .line 216
    move-result-object v7

    .line 217
    iget-object v8, v1, Lcom/moloco/sdk/internal/services/bidtoken/providers/k;->f:Lcom/moloco/sdk/internal/services/bidtoken/providers/h;

    .line 218
    .line 219
    iget-object v9, v8, Lcom/moloco/sdk/internal/services/bidtoken/providers/h;->a:Ljava/lang/Integer;

    .line 220
    .line 221
    if-eqz v9, :cond_b

    .line 222
    .line 223
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 224
    .line 225
    .line 226
    move-result v9

    .line 227
    invoke-virtual {v7, v9}, Lcom/moloco/sdk/r;->c(I)V

    .line 228
    .line 229
    .line 230
    :cond_b
    iget-object v9, v8, Lcom/moloco/sdk/internal/services/bidtoken/providers/h;->b:Ljava/lang/Integer;

    .line 231
    .line 232
    const/4 v10, 0x5

    .line 233
    const/4 v11, 0x4

    .line 234
    const/4 v12, 0x3

    .line 235
    const/4 v13, 0x2

    .line 236
    if-eqz v9, :cond_10

    .line 237
    .line 238
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 239
    .line 240
    .line 241
    move-result v9

    .line 242
    if-eq v9, v13, :cond_f

    .line 243
    .line 244
    if-eq v9, v12, :cond_e

    .line 245
    .line 246
    if-eq v9, v11, :cond_d

    .line 247
    .line 248
    if-eq v9, v10, :cond_c

    .line 249
    .line 250
    sget-object v9, Lcom/moloco/sdk/q;->b:Lcom/moloco/sdk/q;

    .line 251
    .line 252
    goto :goto_2

    .line 253
    :cond_c
    sget-object v9, Lcom/moloco/sdk/q;->f:Lcom/moloco/sdk/q;

    .line 254
    .line 255
    goto :goto_2

    .line 256
    :cond_d
    sget-object v9, Lcom/moloco/sdk/q;->e:Lcom/moloco/sdk/q;

    .line 257
    .line 258
    goto :goto_2

    .line 259
    :cond_e
    sget-object v9, Lcom/moloco/sdk/q;->d:Lcom/moloco/sdk/q;

    .line 260
    .line 261
    goto :goto_2

    .line 262
    :cond_f
    sget-object v9, Lcom/moloco/sdk/q;->c:Lcom/moloco/sdk/q;

    .line 263
    .line 264
    :goto_2
    invoke-virtual {v7, v9}, Lcom/moloco/sdk/r;->a(Lcom/moloco/sdk/q;)V

    .line 265
    .line 266
    .line 267
    :cond_10
    iget-object v8, v8, Lcom/moloco/sdk/internal/services/bidtoken/providers/h;->c:Ljava/lang/Boolean;

    .line 268
    .line 269
    if-eqz v8, :cond_11

    .line 270
    .line 271
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 272
    .line 273
    .line 274
    move-result v8

    .line 275
    invoke-virtual {v7, v8}, Lcom/moloco/sdk/r;->b(Z)V

    .line 276
    .line 277
    .line 278
    :cond_11
    invoke-virtual {v7}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 279
    .line 280
    .line 281
    move-result-object v7

    .line 282
    check-cast v7, Lcom/moloco/sdk/s;

    .line 283
    .line 284
    invoke-virtual {v6, v7}, Lcom/moloco/sdk/t;->d(Lcom/moloco/sdk/s;)V

    .line 285
    .line 286
    .line 287
    invoke-static {}, Lcom/moloco/sdk/m;->d()Lcom/moloco/sdk/l;

    .line 288
    .line 289
    .line 290
    move-result-object v7

    .line 291
    iget-object v8, v1, Lcom/moloco/sdk/internal/services/bidtoken/providers/k;->g:LFe/c;

    .line 292
    .line 293
    instance-of v9, v8, Lcom/moloco/sdk/internal/services/o;

    .line 294
    .line 295
    const/4 v14, 0x0

    .line 296
    const/4 v15, 0x1

    .line 297
    if-eqz v9, :cond_12

    .line 298
    .line 299
    invoke-virtual {v7, v14}, Lcom/moloco/sdk/l;->a(Z)V

    .line 300
    .line 301
    .line 302
    check-cast v8, Lcom/moloco/sdk/internal/services/o;

    .line 303
    .line 304
    iget-object v8, v8, Lcom/moloco/sdk/internal/services/o;->a:Ljava/lang/String;

    .line 305
    .line 306
    invoke-virtual {v7, v8}, Lcom/moloco/sdk/l;->b(Ljava/lang/String;)V

    .line 307
    .line 308
    .line 309
    goto :goto_3

    .line 310
    :cond_12
    sget-object v9, Lcom/moloco/sdk/internal/services/p;->a:Lcom/moloco/sdk/internal/services/p;

    .line 311
    .line 312
    invoke-virtual {v8, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 313
    .line 314
    .line 315
    move-result v8

    .line 316
    if-eqz v8, :cond_2c

    .line 317
    .line 318
    invoke-virtual {v7, v15}, Lcom/moloco/sdk/l;->a(Z)V

    .line 319
    .line 320
    .line 321
    :goto_3
    invoke-virtual {v7}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 322
    .line 323
    .line 324
    move-result-object v7

    .line 325
    check-cast v7, Lcom/moloco/sdk/m;

    .line 326
    .line 327
    invoke-virtual {v6, v7}, Lcom/moloco/sdk/t;->b(Lcom/moloco/sdk/m;)V

    .line 328
    .line 329
    .line 330
    invoke-static {}, Lcom/moloco/sdk/L;->g()Lcom/moloco/sdk/K;

    .line 331
    .line 332
    .line 333
    move-result-object v7

    .line 334
    iget-object v8, v1, Lcom/moloco/sdk/internal/services/bidtoken/providers/k;->b:Lcom/moloco/sdk/publisher/privacy/MolocoPrivacy$PrivacySettings;

    .line 335
    .line 336
    invoke-virtual {v8}, Lcom/moloco/sdk/publisher/privacy/MolocoPrivacy$PrivacySettings;->isAgeRestrictedUser()Ljava/lang/Boolean;

    .line 337
    .line 338
    .line 339
    move-result-object v9

    .line 340
    if-eqz v9, :cond_13

    .line 341
    .line 342
    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    .line 343
    .line 344
    .line 345
    move-result v9

    .line 346
    invoke-virtual {v7, v9}, Lcom/moloco/sdk/K;->b(Z)V

    .line 347
    .line 348
    .line 349
    :cond_13
    invoke-virtual {v8}, Lcom/moloco/sdk/publisher/privacy/MolocoPrivacy$PrivacySettings;->isUserConsent()Ljava/lang/Boolean;

    .line 350
    .line 351
    .line 352
    move-result-object v9

    .line 353
    if-eqz v9, :cond_14

    .line 354
    .line 355
    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    .line 356
    .line 357
    .line 358
    move-result v9

    .line 359
    invoke-virtual {v7, v9}, Lcom/moloco/sdk/K;->c(Z)V

    .line 360
    .line 361
    .line 362
    :cond_14
    invoke-virtual {v8}, Lcom/moloco/sdk/publisher/privacy/MolocoPrivacy$PrivacySettings;->isDoNotSell()Ljava/lang/Boolean;

    .line 363
    .line 364
    .line 365
    move-result-object v9

    .line 366
    if-eqz v9, :cond_15

    .line 367
    .line 368
    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    .line 369
    .line 370
    .line 371
    move-result v9

    .line 372
    invoke-virtual {v7, v9}, Lcom/moloco/sdk/K;->a(Z)V

    .line 373
    .line 374
    .line 375
    :cond_15
    invoke-virtual {v8}, Lcom/moloco/sdk/publisher/privacy/MolocoPrivacy$PrivacySettings;->getTCFConsent()Ljava/lang/String;

    .line 376
    .line 377
    .line 378
    move-result-object v9

    .line 379
    if-eqz v9, :cond_16

    .line 380
    .line 381
    invoke-virtual {v7, v9}, Lcom/moloco/sdk/K;->d(Ljava/lang/String;)V

    .line 382
    .line 383
    .line 384
    :cond_16
    invoke-virtual {v8}, Lcom/moloco/sdk/publisher/privacy/MolocoPrivacy$PrivacySettings;->getUsPrivacy()Ljava/lang/String;

    .line 385
    .line 386
    .line 387
    move-result-object v8

    .line 388
    invoke-virtual {v7, v8}, Lcom/moloco/sdk/K;->e(Ljava/lang/String;)V

    .line 389
    .line 390
    .line 391
    invoke-virtual {v7}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 392
    .line 393
    .line 394
    move-result-object v7

    .line 395
    check-cast v7, Lcom/moloco/sdk/L;

    .line 396
    .line 397
    invoke-virtual {v6, v7}, Lcom/moloco/sdk/t;->l(Lcom/moloco/sdk/L;)V

    .line 398
    .line 399
    .line 400
    invoke-static {}, Lcom/moloco/sdk/w;->y()Lcom/moloco/sdk/u;

    .line 401
    .line 402
    .line 403
    move-result-object v7

    .line 404
    iget-object v8, v4, Lcom/moloco/sdk/internal/services/F;->f:Ljava/lang/String;

    .line 405
    .line 406
    invoke-virtual {v7, v8}, Lcom/moloco/sdk/u;->m(Ljava/lang/String;)V

    .line 407
    .line 408
    .line 409
    sget-object v8, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 410
    .line 411
    invoke-virtual {v7}, Lcom/moloco/sdk/u;->s()V

    .line 412
    .line 413
    .line 414
    iget-object v8, v4, Lcom/moloco/sdk/internal/services/F;->a:Ljava/lang/String;

    .line 415
    .line 416
    invoke-virtual {v7, v8}, Lcom/moloco/sdk/u;->o(Ljava/lang/String;)V

    .line 417
    .line 418
    .line 419
    iget-object v8, v4, Lcom/moloco/sdk/internal/services/F;->b:Ljava/lang/String;

    .line 420
    .line 421
    invoke-virtual {v7, v8}, Lcom/moloco/sdk/u;->p(Ljava/lang/String;)V

    .line 422
    .line 423
    .line 424
    iget-object v8, v4, Lcom/moloco/sdk/internal/services/F;->c:Ljava/lang/String;

    .line 425
    .line 426
    invoke-virtual {v7, v8}, Lcom/moloco/sdk/u;->j(Ljava/lang/String;)V

    .line 427
    .line 428
    .line 429
    iget-object v8, v4, Lcom/moloco/sdk/internal/services/F;->g:Ljava/lang/String;

    .line 430
    .line 431
    invoke-virtual {v7, v8}, Lcom/moloco/sdk/u;->b(Ljava/lang/String;)V

    .line 432
    .line 433
    .line 434
    iget-boolean v8, v4, Lcom/moloco/sdk/internal/services/F;->d:Z

    .line 435
    .line 436
    if-eqz v8, :cond_17

    .line 437
    .line 438
    goto :goto_4

    .line 439
    :cond_17
    move v10, v15

    .line 440
    :goto_4
    invoke-virtual {v7, v10}, Lcom/moloco/sdk/u;->d(I)V

    .line 441
    .line 442
    .line 443
    invoke-virtual {v7}, Lcom/moloco/sdk/u;->k()V

    .line 444
    .line 445
    .line 446
    invoke-static {}, Lcom/moloco/sdk/A;->c()Lcom/moloco/sdk/z;

    .line 447
    .line 448
    .line 449
    move-result-object v8

    .line 450
    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    .line 451
    .line 452
    .line 453
    move-result-object v9

    .line 454
    new-instance v10, Ljava/util/Date;

    .line 455
    .line 456
    invoke-direct {v10}, Ljava/util/Date;-><init>()V

    .line 457
    .line 458
    .line 459
    invoke-virtual {v10}, Ljava/util/Date;->getTime()J

    .line 460
    .line 461
    .line 462
    move-result-wide v11

    .line 463
    invoke-virtual {v9, v11, v12}, Ljava/util/TimeZone;->getOffset(J)I

    .line 464
    .line 465
    .line 466
    move-result v9

    .line 467
    const v10, 0xea60

    .line 468
    .line 469
    .line 470
    div-int/2addr v9, v10

    .line 471
    invoke-virtual {v8, v9}, Lcom/moloco/sdk/z;->a(I)V

    .line 472
    .line 473
    .line 474
    invoke-virtual {v8}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 475
    .line 476
    .line 477
    move-result-object v8

    .line 478
    check-cast v8, Lcom/moloco/sdk/A;

    .line 479
    .line 480
    invoke-virtual {v7, v8}, Lcom/moloco/sdk/u;->e(Lcom/moloco/sdk/A;)V

    .line 481
    .line 482
    .line 483
    iget v8, v5, Lcom/moloco/sdk/internal/services/h;->a:I

    .line 484
    .line 485
    invoke-virtual {v7, v8}, Lcom/moloco/sdk/u;->v(I)V

    .line 486
    .line 487
    .line 488
    iget v8, v5, Lcom/moloco/sdk/internal/services/h;->c:I

    .line 489
    .line 490
    invoke-virtual {v7, v8}, Lcom/moloco/sdk/u;->f(I)V

    .line 491
    .line 492
    .line 493
    iget v8, v5, Lcom/moloco/sdk/internal/services/h;->e:F

    .line 494
    .line 495
    float-to-double v8, v8

    .line 496
    invoke-virtual {v7, v8, v9}, Lcom/moloco/sdk/u;->u(D)V

    .line 497
    .line 498
    .line 499
    iget v8, v5, Lcom/moloco/sdk/internal/services/h;->f:I

    .line 500
    .line 501
    invoke-virtual {v7, v8}, Lcom/moloco/sdk/u;->t(I)V

    .line 502
    .line 503
    .line 504
    invoke-virtual {v7}, Lcom/moloco/sdk/u;->r()V

    .line 505
    .line 506
    .line 507
    iget-boolean v2, v2, Lcom/moloco/sdk/internal/services/bidtoken/g;->a:Z

    .line 508
    .line 509
    if-eqz v2, :cond_18

    .line 510
    .line 511
    const v2, 0xf4240

    .line 512
    .line 513
    .line 514
    int-to-long v8, v2

    .line 515
    iget-wide v10, v4, Lcom/moloco/sdk/internal/services/F;->i:J

    .line 516
    .line 517
    mul-long/2addr v10, v8

    .line 518
    invoke-virtual {v7, v10, v11}, Lcom/moloco/sdk/u;->c(J)V

    .line 519
    .line 520
    .line 521
    :cond_18
    iget-object v2, v1, Lcom/moloco/sdk/internal/services/bidtoken/providers/k;->h:Lcom/moloco/sdk/internal/services/bidtoken/providers/m;

    .line 522
    .line 523
    iget-object v8, v2, Lcom/moloco/sdk/internal/services/bidtoken/providers/m;->a:Lcom/moloco/sdk/internal/services/j;

    .line 524
    .line 525
    if-eqz v8, :cond_1c

    .line 526
    .line 527
    sget-object v9, Lcom/moloco/sdk/internal/services/bidtoken/q;->a:[I

    .line 528
    .line 529
    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    .line 530
    .line 531
    .line 532
    move-result v8

    .line 533
    aget v8, v9, v8

    .line 534
    .line 535
    if-eq v8, v15, :cond_1b

    .line 536
    .line 537
    if-eq v8, v13, :cond_1a

    .line 538
    .line 539
    const/4 v9, 0x3

    .line 540
    if-ne v8, v9, :cond_19

    .line 541
    .line 542
    sget-object v8, Lcom/moloco/sdk/v;->d:Lcom/moloco/sdk/v;

    .line 543
    .line 544
    goto :goto_5

    .line 545
    :cond_19
    new-instance v1, LE5/Q;

    .line 546
    .line 547
    const/16 v2, 0x9

    .line 548
    .line 549
    const/4 v3, 0x0

    .line 550
    invoke-direct {v1, v3, v2}, LE5/Q;-><init>(BI)V

    .line 551
    .line 552
    .line 553
    throw v1

    .line 554
    :cond_1a
    sget-object v8, Lcom/moloco/sdk/v;->c:Lcom/moloco/sdk/v;

    .line 555
    .line 556
    goto :goto_5

    .line 557
    :cond_1b
    sget-object v8, Lcom/moloco/sdk/v;->b:Lcom/moloco/sdk/v;

    .line 558
    .line 559
    :goto_5
    invoke-virtual {v7, v8}, Lcom/moloco/sdk/u;->q(Lcom/moloco/sdk/v;)V

    .line 560
    .line 561
    .line 562
    :cond_1c
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 563
    .line 564
    .line 565
    :try_start_0
    iget-object v3, v3, Lcom/moloco/sdk/internal/services/v;->a:Landroid/content/Context;

    .line 566
    .line 567
    const-string v8, "sensor"

    .line 568
    .line 569
    invoke-virtual {v3, v8}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 570
    .line 571
    .line 572
    move-result-object v3

    .line 573
    const-string v8, "null cannot be cast to non-null type android.hardware.SensorManager"

    .line 574
    .line 575
    invoke-static {v3, v8}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 576
    .line 577
    .line 578
    check-cast v3, Landroid/hardware/SensorManager;

    .line 579
    .line 580
    const/4 v8, 0x4

    .line 581
    invoke-virtual {v3, v8}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    .line 582
    .line 583
    .line 584
    move-result-object v3

    .line 585
    if-eqz v3, :cond_1d

    .line 586
    .line 587
    move v14, v15

    .line 588
    :cond_1d
    invoke-static {v14}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 589
    .line 590
    .line 591
    move-result-object v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 592
    goto :goto_6

    .line 593
    :catch_0
    const/4 v3, 0x0

    .line 594
    :goto_6
    if-eqz v3, :cond_1e

    .line 595
    .line 596
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 597
    .line 598
    .line 599
    move-result v3

    .line 600
    invoke-virtual {v7, v3}, Lcom/moloco/sdk/u;->h(Z)V

    .line 601
    .line 602
    .line 603
    :cond_1e
    iget-object v3, v2, Lcom/moloco/sdk/internal/services/bidtoken/providers/m;->c:Ljava/lang/String;

    .line 604
    .line 605
    if-eqz v3, :cond_1f

    .line 606
    .line 607
    invoke-virtual {v7, v3}, Lcom/moloco/sdk/u;->l(Ljava/lang/String;)V

    .line 608
    .line 609
    .line 610
    :cond_1f
    iget-object v2, v2, Lcom/moloco/sdk/internal/services/bidtoken/providers/m;->b:Ljava/lang/String;

    .line 611
    .line 612
    if-eqz v2, :cond_20

    .line 613
    .line 614
    invoke-virtual {v7, v2}, Lcom/moloco/sdk/u;->n(Ljava/lang/String;)V

    .line 615
    .line 616
    .line 617
    :cond_20
    iget v2, v5, Lcom/moloco/sdk/internal/services/h;->g:F

    .line 618
    .line 619
    invoke-virtual {v7, v2}, Lcom/moloco/sdk/u;->w(F)V

    .line 620
    .line 621
    .line 622
    iget v2, v5, Lcom/moloco/sdk/internal/services/h;->h:F

    .line 623
    .line 624
    invoke-virtual {v7, v2}, Lcom/moloco/sdk/u;->x(F)V

    .line 625
    .line 626
    .line 627
    iget-object v2, v4, Lcom/moloco/sdk/internal/services/F;->j:Ljava/lang/String;

    .line 628
    .line 629
    invoke-virtual {v7, v2}, Lcom/moloco/sdk/u;->g(Ljava/lang/String;)V

    .line 630
    .line 631
    .line 632
    iget-object v2, v4, Lcom/moloco/sdk/internal/services/F;->k:Ljava/lang/String;

    .line 633
    .line 634
    invoke-virtual {v7, v2}, Lcom/moloco/sdk/u;->a(Ljava/lang/String;)V

    .line 635
    .line 636
    .line 637
    invoke-virtual {v7}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 638
    .line 639
    .line 640
    move-result-object v2

    .line 641
    check-cast v2, Lcom/moloco/sdk/w;

    .line 642
    .line 643
    invoke-virtual {v6, v2}, Lcom/moloco/sdk/t;->e(Lcom/moloco/sdk/w;)V

    .line 644
    .line 645
    .line 646
    invoke-static {}, Lcom/moloco/sdk/p;->d()Lcom/moloco/sdk/n;

    .line 647
    .line 648
    .line 649
    move-result-object v2

    .line 650
    iget-object v3, v1, Lcom/moloco/sdk/internal/services/bidtoken/providers/k;->i:Lcom/moloco/sdk/internal/services/bidtoken/providers/f;

    .line 651
    .line 652
    iget-object v4, v3, Lcom/moloco/sdk/internal/services/bidtoken/providers/f;->a:Lcom/moloco/sdk/internal/services/G;

    .line 653
    .line 654
    if-eqz v4, :cond_24

    .line 655
    .line 656
    sget-object v5, Lcom/moloco/sdk/internal/services/bidtoken/q;->b:[I

    .line 657
    .line 658
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 659
    .line 660
    .line 661
    move-result v4

    .line 662
    aget v4, v5, v4

    .line 663
    .line 664
    if-eq v4, v15, :cond_23

    .line 665
    .line 666
    if-eq v4, v13, :cond_22

    .line 667
    .line 668
    const/4 v9, 0x3

    .line 669
    if-ne v4, v9, :cond_21

    .line 670
    .line 671
    sget-object v4, Lcom/moloco/sdk/o;->d:Lcom/moloco/sdk/o;

    .line 672
    .line 673
    goto :goto_7

    .line 674
    :cond_21
    new-instance v1, LE5/Q;

    .line 675
    .line 676
    const/16 v2, 0x9

    .line 677
    .line 678
    const/4 v3, 0x0

    .line 679
    invoke-direct {v1, v3, v2}, LE5/Q;-><init>(BI)V

    .line 680
    .line 681
    .line 682
    throw v1

    .line 683
    :cond_22
    sget-object v4, Lcom/moloco/sdk/o;->c:Lcom/moloco/sdk/o;

    .line 684
    .line 685
    goto :goto_7

    .line 686
    :cond_23
    sget-object v4, Lcom/moloco/sdk/o;->b:Lcom/moloco/sdk/o;

    .line 687
    .line 688
    :goto_7
    invoke-virtual {v2, v4}, Lcom/moloco/sdk/n;->a(Lcom/moloco/sdk/o;)V

    .line 689
    .line 690
    .line 691
    :cond_24
    iget-object v3, v3, Lcom/moloco/sdk/internal/services/bidtoken/providers/f;->b:Ljava/lang/Integer;

    .line 692
    .line 693
    if-eqz v3, :cond_25

    .line 694
    .line 695
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 696
    .line 697
    .line 698
    move-result v3

    .line 699
    invoke-virtual {v2, v3}, Lcom/moloco/sdk/n;->b(I)V

    .line 700
    .line 701
    .line 702
    :cond_25
    invoke-virtual {v2}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 703
    .line 704
    .line 705
    move-result-object v2

    .line 706
    check-cast v2, Lcom/moloco/sdk/p;

    .line 707
    .line 708
    invoke-virtual {v6, v2}, Lcom/moloco/sdk/t;->c(Lcom/moloco/sdk/p;)V

    .line 709
    .line 710
    .line 711
    invoke-static {}, Lcom/moloco/sdk/k;->f()Lcom/moloco/sdk/j;

    .line 712
    .line 713
    .line 714
    move-result-object v2

    .line 715
    iget-object v3, v1, Lcom/moloco/sdk/internal/services/bidtoken/providers/k;->j:Lcom/moloco/sdk/internal/services/bidtoken/providers/a;

    .line 716
    .line 717
    iget-object v4, v3, Lcom/moloco/sdk/internal/services/bidtoken/providers/a;->d:Ljava/lang/Float;

    .line 718
    .line 719
    if-eqz v4, :cond_26

    .line 720
    .line 721
    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    .line 722
    .line 723
    .line 724
    move-result v4

    .line 725
    invoke-virtual {v2, v4}, Lcom/moloco/sdk/j;->c(F)V

    .line 726
    .line 727
    .line 728
    :cond_26
    iget-object v4, v3, Lcom/moloco/sdk/internal/services/bidtoken/providers/a;->b:Ljava/lang/Boolean;

    .line 729
    .line 730
    if-eqz v4, :cond_27

    .line 731
    .line 732
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 733
    .line 734
    .line 735
    move-result v4

    .line 736
    invoke-virtual {v2, v4}, Lcom/moloco/sdk/j;->b(Z)V

    .line 737
    .line 738
    .line 739
    :cond_27
    iget-object v4, v3, Lcom/moloco/sdk/internal/services/bidtoken/providers/a;->a:Ljava/lang/Boolean;

    .line 740
    .line 741
    if-eqz v4, :cond_28

    .line 742
    .line 743
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 744
    .line 745
    .line 746
    move-result v4

    .line 747
    invoke-virtual {v2, v4}, Lcom/moloco/sdk/j;->a(Z)V

    .line 748
    .line 749
    .line 750
    :cond_28
    iget-object v3, v3, Lcom/moloco/sdk/internal/services/bidtoken/providers/a;->c:Ljava/lang/Boolean;

    .line 751
    .line 752
    if-eqz v3, :cond_29

    .line 753
    .line 754
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 755
    .line 756
    .line 757
    move-result v3

    .line 758
    invoke-virtual {v2, v3}, Lcom/moloco/sdk/j;->d(Z)V

    .line 759
    .line 760
    .line 761
    :cond_29
    invoke-virtual {v2}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 762
    .line 763
    .line 764
    move-result-object v2

    .line 765
    check-cast v2, Lcom/moloco/sdk/k;

    .line 766
    .line 767
    invoke-virtual {v6, v2}, Lcom/moloco/sdk/t;->a(Lcom/moloco/sdk/k;)V

    .line 768
    .line 769
    .line 770
    iget-object v2, v1, Lcom/moloco/sdk/internal/services/bidtoken/providers/k;->k:Lcom/moloco/sdk/internal/services/bidtoken/providers/o;

    .line 771
    .line 772
    iget-object v3, v2, Lcom/moloco/sdk/internal/services/bidtoken/providers/o;->a:Ljava/lang/String;

    .line 773
    .line 774
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 775
    .line 776
    .line 777
    move-result v3

    .line 778
    if-lez v3, :cond_2a

    .line 779
    .line 780
    invoke-static {}, Lcom/moloco/sdk/E;->f()Lcom/moloco/sdk/B;

    .line 781
    .line 782
    .line 783
    move-result-object v3

    .line 784
    iget-object v4, v2, Lcom/moloco/sdk/internal/services/bidtoken/providers/o;->a:Ljava/lang/String;

    .line 785
    .line 786
    invoke-virtual {v3, v4}, Lcom/moloco/sdk/B;->c(Ljava/lang/String;)V

    .line 787
    .line 788
    .line 789
    iget-wide v4, v2, Lcom/moloco/sdk/internal/services/bidtoken/providers/o;->c:J

    .line 790
    .line 791
    invoke-virtual {v3, v4, v5}, Lcom/moloco/sdk/B;->b(J)V

    .line 792
    .line 793
    .line 794
    iget-wide v4, v2, Lcom/moloco/sdk/internal/services/bidtoken/providers/o;->b:J

    .line 795
    .line 796
    invoke-virtual {v3, v4, v5}, Lcom/moloco/sdk/B;->d(J)V

    .line 797
    .line 798
    .line 799
    invoke-static {}, Lcom/moloco/sdk/D;->g()Lcom/moloco/sdk/C;

    .line 800
    .line 801
    .line 802
    move-result-object v4

    .line 803
    iget v5, v2, Lcom/moloco/sdk/internal/services/bidtoken/providers/o;->d:I

    .line 804
    .line 805
    invoke-virtual {v4, v5}, Lcom/moloco/sdk/C;->a(I)V

    .line 806
    .line 807
    .line 808
    iget v5, v2, Lcom/moloco/sdk/internal/services/bidtoken/providers/o;->e:I

    .line 809
    .line 810
    invoke-virtual {v4, v5}, Lcom/moloco/sdk/C;->c(I)V

    .line 811
    .line 812
    .line 813
    iget v5, v2, Lcom/moloco/sdk/internal/services/bidtoken/providers/o;->f:I

    .line 814
    .line 815
    invoke-virtual {v4, v5}, Lcom/moloco/sdk/C;->d(I)V

    .line 816
    .line 817
    .line 818
    iget v5, v2, Lcom/moloco/sdk/internal/services/bidtoken/providers/o;->g:I

    .line 819
    .line 820
    invoke-virtual {v4, v5}, Lcom/moloco/sdk/C;->b(I)V

    .line 821
    .line 822
    .line 823
    iget v2, v2, Lcom/moloco/sdk/internal/services/bidtoken/providers/o;->h:I

    .line 824
    .line 825
    invoke-virtual {v4, v2}, Lcom/moloco/sdk/C;->e(I)V

    .line 826
    .line 827
    .line 828
    invoke-virtual {v4}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 829
    .line 830
    .line 831
    move-result-object v2

    .line 832
    check-cast v2, Lcom/moloco/sdk/D;

    .line 833
    .line 834
    invoke-virtual {v3, v2}, Lcom/moloco/sdk/B;->a(Lcom/moloco/sdk/D;)V

    .line 835
    .line 836
    .line 837
    invoke-virtual {v3}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 838
    .line 839
    .line 840
    move-result-object v2

    .line 841
    check-cast v2, Lcom/moloco/sdk/E;

    .line 842
    .line 843
    invoke-virtual {v6, v2}, Lcom/moloco/sdk/t;->g(Lcom/moloco/sdk/E;)V

    .line 844
    .line 845
    .line 846
    :cond_2a
    iget-object v1, v1, Lcom/moloco/sdk/internal/services/bidtoken/providers/k;->l:Lcom/moloco/sdk/internal/services/bidtoken/providers/w;

    .line 847
    .line 848
    iget-object v1, v1, Lcom/moloco/sdk/internal/services/bidtoken/providers/w;->a:Ljava/lang/String;

    .line 849
    .line 850
    if-eqz v1, :cond_2b

    .line 851
    .line 852
    invoke-static {v1}, LBf/k;->y0(Ljava/lang/CharSequence;)Z

    .line 853
    .line 854
    .line 855
    move-result v2

    .line 856
    if-nez v2, :cond_2b

    .line 857
    .line 858
    invoke-static {}, Lcom/moloco/sdk/P;->c()Lcom/moloco/sdk/O;

    .line 859
    .line 860
    .line 861
    move-result-object v2

    .line 862
    invoke-virtual {v2, v1}, Lcom/moloco/sdk/O;->a(Ljava/lang/String;)V

    .line 863
    .line 864
    .line 865
    invoke-virtual {v2}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 866
    .line 867
    .line 868
    move-result-object v1

    .line 869
    check-cast v1, Lcom/moloco/sdk/P;

    .line 870
    .line 871
    invoke-virtual {v6, v1}, Lcom/moloco/sdk/t;->m(Lcom/moloco/sdk/P;)V

    .line 872
    .line 873
    .line 874
    :cond_2b
    invoke-virtual {v6}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 875
    .line 876
    .line 877
    move-result-object v1

    .line 878
    const-string v2, "build(...)"

    .line 879
    .line 880
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 881
    .line 882
    .line 883
    check-cast v1, Lcom/moloco/sdk/Q;

    .line 884
    .line 885
    return-object v1

    .line 886
    :cond_2c
    new-instance v1, LE5/Q;

    .line 887
    .line 888
    const/16 v2, 0x9

    .line 889
    .line 890
    const/4 v3, 0x0

    .line 891
    invoke-direct {v1, v3, v2}, LE5/Q;-><init>(BI)V

    .line 892
    .line 893
    .line 894
    throw v1
.end method
