.class public final Lga/b;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public a:Lkotlin/jvm/internal/G;

.field public b:Lkotlin/jvm/internal/G;

.field public c:I

.field public synthetic d:Ljava/lang/Object;

.field public final synthetic e:Lga/d;


# direct methods
.method public constructor <init>(Lga/d;Ljf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lga/b;->e:Lga/d;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Llf/j;-><init>(ILjf/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ljf/c;)Ljf/c;
    .locals 2

    .line 1
    new-instance v0, Lga/b;

    .line 2
    .line 3
    iget-object v1, p0, Lga/b;->e:Lga/d;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Lga/b;-><init>(Lga/d;Ljf/c;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Lga/b;->d:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lorg/json/JSONObject;

    .line 2
    .line 3
    check-cast p2, Ljf/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lga/b;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lga/b;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lga/b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    const-string v0, "cache_duration"

    .line 2
    .line 3
    const-string v1, "session_timeout_seconds"

    .line 4
    .line 5
    const-string v2, "sampling_rate"

    .line 6
    .line 7
    const-string v3, "sessions_enabled"

    .line 8
    .line 9
    sget-object v4, Lkf/a;->a:Lkf/a;

    .line 10
    .line 11
    iget v5, p0, Lga/b;->c:I

    .line 12
    .line 13
    sget-object v6, Lef/C;->a:Lef/C;

    .line 14
    .line 15
    iget-object v7, p0, Lga/b;->e:Lga/d;

    .line 16
    .line 17
    const/4 v8, 0x0

    .line 18
    packed-switch v5, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 22
    .line 23
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 24
    .line 25
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw p1

    .line 29
    :pswitch_0
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    return-object v6

    .line 33
    :pswitch_1
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    goto/16 :goto_f

    .line 37
    .line 38
    :pswitch_2
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto/16 :goto_c

    .line 42
    .line 43
    :pswitch_3
    iget-object v0, p0, Lga/b;->d:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v0, Lkotlin/jvm/internal/G;

    .line 46
    .line 47
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    goto/16 :goto_a

    .line 51
    .line 52
    :pswitch_4
    iget-object v0, p0, Lga/b;->a:Lkotlin/jvm/internal/G;

    .line 53
    .line 54
    iget-object v1, p0, Lga/b;->d:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v1, Lkotlin/jvm/internal/G;

    .line 57
    .line 58
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    goto/16 :goto_8

    .line 62
    .line 63
    :pswitch_5
    iget-object v0, p0, Lga/b;->b:Lkotlin/jvm/internal/G;

    .line 64
    .line 65
    iget-object v1, p0, Lga/b;->a:Lkotlin/jvm/internal/G;

    .line 66
    .line 67
    iget-object v2, p0, Lga/b;->d:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v2, Lkotlin/jvm/internal/G;

    .line 70
    .line 71
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    goto/16 :goto_5

    .line 75
    .line 76
    :pswitch_6
    invoke-static {p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    iget-object p1, p0, Lga/b;->d:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast p1, Lorg/json/JSONObject;

    .line 82
    .line 83
    new-instance v5, Ljava/lang/StringBuilder;

    .line 84
    .line 85
    const-string v9, "Fetched settings: "

    .line 86
    .line 87
    invoke-direct {v5, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v5

    .line 97
    const-string v9, "SessionConfigFetcher"

    .line 98
    .line 99
    invoke-static {v9, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 100
    .line 101
    .line 102
    new-instance v5, Lkotlin/jvm/internal/G;

    .line 103
    .line 104
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 105
    .line 106
    .line 107
    new-instance v10, Lkotlin/jvm/internal/G;

    .line 108
    .line 109
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 110
    .line 111
    .line 112
    new-instance v11, Lkotlin/jvm/internal/G;

    .line 113
    .line 114
    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    .line 115
    .line 116
    .line 117
    const-string v12, "app_quality"

    .line 118
    .line 119
    invoke-virtual {p1, v12}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 120
    .line 121
    .line 122
    move-result v13

    .line 123
    if-eqz v13, :cond_3

    .line 124
    .line 125
    invoke-virtual {p1, v12}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    const-string v12, "null cannot be cast to non-null type org.json.JSONObject"

    .line 130
    .line 131
    invoke-static {p1, v12}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    check-cast p1, Lorg/json/JSONObject;

    .line 135
    .line 136
    :try_start_0
    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 137
    .line 138
    .line 139
    move-result v12

    .line 140
    if-eqz v12, :cond_0

    .line 141
    .line 142
    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v3

    .line 146
    check-cast v3, Ljava/lang/Boolean;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 147
    .line 148
    goto :goto_0

    .line 149
    :catch_0
    move-exception p1

    .line 150
    move-object v3, v8

    .line 151
    goto :goto_2

    .line 152
    :cond_0
    move-object v3, v8

    .line 153
    :goto_0
    :try_start_1
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 154
    .line 155
    .line 156
    move-result v12

    .line 157
    if-eqz v12, :cond_1

    .line 158
    .line 159
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    check-cast v2, Ljava/lang/Double;

    .line 164
    .line 165
    iput-object v2, v5, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 166
    .line 167
    goto :goto_1

    .line 168
    :catch_1
    move-exception p1

    .line 169
    goto :goto_2

    .line 170
    :cond_1
    :goto_1
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 171
    .line 172
    .line 173
    move-result v2

    .line 174
    if-eqz v2, :cond_2

    .line 175
    .line 176
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v1

    .line 180
    check-cast v1, Ljava/lang/Integer;

    .line 181
    .line 182
    iput-object v1, v10, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 183
    .line 184
    :cond_2
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 185
    .line 186
    .line 187
    move-result v1

    .line 188
    if-eqz v1, :cond_4

    .line 189
    .line 190
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    check-cast p1, Ljava/lang/Integer;

    .line 195
    .line 196
    iput-object p1, v11, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    .line 197
    .line 198
    goto :goto_3

    .line 199
    :goto_2
    const-string v0, "Error parsing the configs remotely fetched: "

    .line 200
    .line 201
    invoke-static {v9, v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 202
    .line 203
    .line 204
    goto :goto_3

    .line 205
    :cond_3
    move-object v3, v8

    .line 206
    :cond_4
    :goto_3
    if-eqz v3, :cond_7

    .line 207
    .line 208
    invoke-virtual {v7}, Lga/d;->b()Lga/n;

    .line 209
    .line 210
    .line 211
    move-result-object p1

    .line 212
    iput-object v5, p0, Lga/b;->d:Ljava/lang/Object;

    .line 213
    .line 214
    iput-object v10, p0, Lga/b;->a:Lkotlin/jvm/internal/G;

    .line 215
    .line 216
    iput-object v11, p0, Lga/b;->b:Lkotlin/jvm/internal/G;

    .line 217
    .line 218
    const/4 v0, 0x1

    .line 219
    iput v0, p0, Lga/b;->c:I

    .line 220
    .line 221
    sget-object v0, Lga/n;->c:Lx1/e;

    .line 222
    .line 223
    invoke-virtual {p1, v0, v3, p0}, Lga/n;->c(Lx1/e;Ljava/lang/Object;Llf/c;)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object p1

    .line 227
    sget-object v0, Lkf/a;->a:Lkf/a;

    .line 228
    .line 229
    if-ne p1, v0, :cond_5

    .line 230
    .line 231
    goto :goto_4

    .line 232
    :cond_5
    move-object p1, v6

    .line 233
    :goto_4
    if-ne p1, v4, :cond_6

    .line 234
    .line 235
    goto/16 :goto_11

    .line 236
    .line 237
    :cond_6
    move-object v2, v5

    .line 238
    move-object v1, v10

    .line 239
    move-object v0, v11

    .line 240
    :goto_5
    move-object v10, v1

    .line 241
    move-object v1, v2

    .line 242
    goto :goto_6

    .line 243
    :cond_7
    move-object v1, v5

    .line 244
    move-object v0, v11

    .line 245
    :goto_6
    iget-object p1, v10, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 246
    .line 247
    check-cast p1, Ljava/lang/Integer;

    .line 248
    .line 249
    if-eqz p1, :cond_9

    .line 250
    .line 251
    invoke-virtual {v7}, Lga/d;->b()Lga/n;

    .line 252
    .line 253
    .line 254
    move-result-object p1

    .line 255
    iget-object v2, v10, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 256
    .line 257
    check-cast v2, Ljava/lang/Integer;

    .line 258
    .line 259
    iput-object v1, p0, Lga/b;->d:Ljava/lang/Object;

    .line 260
    .line 261
    iput-object v0, p0, Lga/b;->a:Lkotlin/jvm/internal/G;

    .line 262
    .line 263
    iput-object v8, p0, Lga/b;->b:Lkotlin/jvm/internal/G;

    .line 264
    .line 265
    const/4 v3, 0x2

    .line 266
    iput v3, p0, Lga/b;->c:I

    .line 267
    .line 268
    sget-object v3, Lga/n;->e:Lx1/e;

    .line 269
    .line 270
    invoke-virtual {p1, v3, v2, p0}, Lga/n;->c(Lx1/e;Ljava/lang/Object;Llf/c;)Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object p1

    .line 274
    sget-object v2, Lkf/a;->a:Lkf/a;

    .line 275
    .line 276
    if-ne p1, v2, :cond_8

    .line 277
    .line 278
    goto :goto_7

    .line 279
    :cond_8
    move-object p1, v6

    .line 280
    :goto_7
    if-ne p1, v4, :cond_9

    .line 281
    .line 282
    goto/16 :goto_11

    .line 283
    .line 284
    :cond_9
    :goto_8
    iget-object p1, v1, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 285
    .line 286
    check-cast p1, Ljava/lang/Double;

    .line 287
    .line 288
    if-eqz p1, :cond_b

    .line 289
    .line 290
    invoke-virtual {v7}, Lga/d;->b()Lga/n;

    .line 291
    .line 292
    .line 293
    move-result-object p1

    .line 294
    iget-object v1, v1, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 295
    .line 296
    check-cast v1, Ljava/lang/Double;

    .line 297
    .line 298
    iput-object v0, p0, Lga/b;->d:Ljava/lang/Object;

    .line 299
    .line 300
    iput-object v8, p0, Lga/b;->a:Lkotlin/jvm/internal/G;

    .line 301
    .line 302
    iput-object v8, p0, Lga/b;->b:Lkotlin/jvm/internal/G;

    .line 303
    .line 304
    const/4 v2, 0x3

    .line 305
    iput v2, p0, Lga/b;->c:I

    .line 306
    .line 307
    sget-object v2, Lga/n;->d:Lx1/e;

    .line 308
    .line 309
    invoke-virtual {p1, v2, v1, p0}, Lga/n;->c(Lx1/e;Ljava/lang/Object;Llf/c;)Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    move-result-object p1

    .line 313
    sget-object v1, Lkf/a;->a:Lkf/a;

    .line 314
    .line 315
    if-ne p1, v1, :cond_a

    .line 316
    .line 317
    goto :goto_9

    .line 318
    :cond_a
    move-object p1, v6

    .line 319
    :goto_9
    if-ne p1, v4, :cond_b

    .line 320
    .line 321
    goto/16 :goto_11

    .line 322
    .line 323
    :cond_b
    :goto_a
    iget-object p1, v0, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 324
    .line 325
    check-cast p1, Ljava/lang/Integer;

    .line 326
    .line 327
    if-eqz p1, :cond_e

    .line 328
    .line 329
    invoke-virtual {v7}, Lga/d;->b()Lga/n;

    .line 330
    .line 331
    .line 332
    move-result-object p1

    .line 333
    iget-object v0, v0, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 334
    .line 335
    check-cast v0, Ljava/lang/Integer;

    .line 336
    .line 337
    iput-object v8, p0, Lga/b;->d:Ljava/lang/Object;

    .line 338
    .line 339
    iput-object v8, p0, Lga/b;->a:Lkotlin/jvm/internal/G;

    .line 340
    .line 341
    iput-object v8, p0, Lga/b;->b:Lkotlin/jvm/internal/G;

    .line 342
    .line 343
    const/4 v1, 0x4

    .line 344
    iput v1, p0, Lga/b;->c:I

    .line 345
    .line 346
    sget-object v1, Lga/n;->f:Lx1/e;

    .line 347
    .line 348
    invoke-virtual {p1, v1, v0, p0}, Lga/n;->c(Lx1/e;Ljava/lang/Object;Llf/c;)Ljava/lang/Object;

    .line 349
    .line 350
    .line 351
    move-result-object p1

    .line 352
    sget-object v0, Lkf/a;->a:Lkf/a;

    .line 353
    .line 354
    if-ne p1, v0, :cond_c

    .line 355
    .line 356
    goto :goto_b

    .line 357
    :cond_c
    move-object p1, v6

    .line 358
    :goto_b
    if-ne p1, v4, :cond_d

    .line 359
    .line 360
    goto :goto_11

    .line 361
    :cond_d
    :goto_c
    move-object p1, v6

    .line 362
    goto :goto_d

    .line 363
    :cond_e
    move-object p1, v8

    .line 364
    :goto_d
    if-nez p1, :cond_10

    .line 365
    .line 366
    invoke-virtual {v7}, Lga/d;->b()Lga/n;

    .line 367
    .line 368
    .line 369
    move-result-object p1

    .line 370
    new-instance v0, Ljava/lang/Integer;

    .line 371
    .line 372
    const v1, 0x15180

    .line 373
    .line 374
    .line 375
    invoke-direct {v0, v1}, Ljava/lang/Integer;-><init>(I)V

    .line 376
    .line 377
    .line 378
    iput-object v8, p0, Lga/b;->d:Ljava/lang/Object;

    .line 379
    .line 380
    iput-object v8, p0, Lga/b;->a:Lkotlin/jvm/internal/G;

    .line 381
    .line 382
    iput-object v8, p0, Lga/b;->b:Lkotlin/jvm/internal/G;

    .line 383
    .line 384
    const/4 v1, 0x5

    .line 385
    iput v1, p0, Lga/b;->c:I

    .line 386
    .line 387
    sget-object v1, Lga/n;->f:Lx1/e;

    .line 388
    .line 389
    invoke-virtual {p1, v1, v0, p0}, Lga/n;->c(Lx1/e;Ljava/lang/Object;Llf/c;)Ljava/lang/Object;

    .line 390
    .line 391
    .line 392
    move-result-object p1

    .line 393
    sget-object v0, Lkf/a;->a:Lkf/a;

    .line 394
    .line 395
    if-ne p1, v0, :cond_f

    .line 396
    .line 397
    goto :goto_e

    .line 398
    :cond_f
    move-object p1, v6

    .line 399
    :goto_e
    if-ne p1, v4, :cond_10

    .line 400
    .line 401
    goto :goto_11

    .line 402
    :cond_10
    :goto_f
    invoke-virtual {v7}, Lga/d;->b()Lga/n;

    .line 403
    .line 404
    .line 405
    move-result-object p1

    .line 406
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 407
    .line 408
    .line 409
    move-result-wide v0

    .line 410
    new-instance v2, Ljava/lang/Long;

    .line 411
    .line 412
    invoke-direct {v2, v0, v1}, Ljava/lang/Long;-><init>(J)V

    .line 413
    .line 414
    .line 415
    iput-object v8, p0, Lga/b;->d:Ljava/lang/Object;

    .line 416
    .line 417
    iput-object v8, p0, Lga/b;->a:Lkotlin/jvm/internal/G;

    .line 418
    .line 419
    iput-object v8, p0, Lga/b;->b:Lkotlin/jvm/internal/G;

    .line 420
    .line 421
    const/4 v0, 0x6

    .line 422
    iput v0, p0, Lga/b;->c:I

    .line 423
    .line 424
    sget-object v0, Lga/n;->g:Lx1/e;

    .line 425
    .line 426
    invoke-virtual {p1, v0, v2, p0}, Lga/n;->c(Lx1/e;Ljava/lang/Object;Llf/c;)Ljava/lang/Object;

    .line 427
    .line 428
    .line 429
    move-result-object p1

    .line 430
    sget-object v0, Lkf/a;->a:Lkf/a;

    .line 431
    .line 432
    if-ne p1, v0, :cond_11

    .line 433
    .line 434
    goto :goto_10

    .line 435
    :cond_11
    move-object p1, v6

    .line 436
    :goto_10
    if-ne p1, v4, :cond_12

    .line 437
    .line 438
    :goto_11
    return-object v4

    .line 439
    :cond_12
    return-object v6

    .line 440
    nop

    .line 441
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
