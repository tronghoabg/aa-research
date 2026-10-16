.class public Lcom/bytedance/sdk/component/adexpress/dynamic/yo/zjm;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static uef(Landroid/content/Context;Lcom/bytedance/sdk/component/adexpress/dynamic/dynamicview/lw;Lcom/bytedance/sdk/component/adexpress/dynamic/moa/xs;Lcom/bytedance/sdk/component/adexpress/dynamic/moa/zjm;Lcom/bytedance/sdk/component/adexpress/oa/cq;)Lcom/bytedance/sdk/component/adexpress/dynamic/yo/xs;
    .locals 9

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    if-nez p2, :cond_1

    .line 8
    .line 9
    :cond_0
    move-object v4, v1

    .line 10
    goto/16 :goto_2

    .line 11
    .line 12
    :cond_1
    invoke-virtual {p2}, Lcom/bytedance/sdk/component/adexpress/dynamic/moa/xs;->rl()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v4

    .line 16
    invoke-virtual {p4}, Lcom/bytedance/sdk/component/adexpress/oa/cq;->gsd()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    const/4 v3, -0x1

    .line 24
    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    sparse-switch v5, :sswitch_data_0

    .line 29
    .line 30
    .line 31
    goto/16 :goto_0

    .line 32
    .line 33
    :sswitch_0
    const-string v5, "29"

    .line 34
    .line 35
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    if-nez v5, :cond_2

    .line 40
    .line 41
    goto/16 :goto_0

    .line 42
    .line 43
    :cond_2
    const/16 v3, 0x15

    .line 44
    .line 45
    goto/16 :goto_0

    .line 46
    .line 47
    :sswitch_1
    const-string v5, "25"

    .line 48
    .line 49
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    if-nez v5, :cond_3

    .line 54
    .line 55
    goto/16 :goto_0

    .line 56
    .line 57
    :cond_3
    const/16 v3, 0x14

    .line 58
    .line 59
    goto/16 :goto_0

    .line 60
    .line 61
    :sswitch_2
    const-string v5, "24"

    .line 62
    .line 63
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v5

    .line 67
    if-nez v5, :cond_4

    .line 68
    .line 69
    goto/16 :goto_0

    .line 70
    .line 71
    :cond_4
    const/16 v3, 0x13

    .line 72
    .line 73
    goto/16 :goto_0

    .line 74
    .line 75
    :sswitch_3
    const-string v5, "23"

    .line 76
    .line 77
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v5

    .line 81
    if-nez v5, :cond_5

    .line 82
    .line 83
    goto/16 :goto_0

    .line 84
    .line 85
    :cond_5
    const/16 v3, 0x12

    .line 86
    .line 87
    goto/16 :goto_0

    .line 88
    .line 89
    :sswitch_4
    const-string v5, "22"

    .line 90
    .line 91
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v5

    .line 95
    if-nez v5, :cond_6

    .line 96
    .line 97
    goto/16 :goto_0

    .line 98
    .line 99
    :cond_6
    const/16 v3, 0x11

    .line 100
    .line 101
    goto/16 :goto_0

    .line 102
    .line 103
    :sswitch_5
    const-string v5, "20"

    .line 104
    .line 105
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v5

    .line 109
    if-nez v5, :cond_7

    .line 110
    .line 111
    goto/16 :goto_0

    .line 112
    .line 113
    :cond_7
    const/16 v3, 0x10

    .line 114
    .line 115
    goto/16 :goto_0

    .line 116
    .line 117
    :sswitch_6
    const-string v5, "18"

    .line 118
    .line 119
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v5

    .line 123
    if-nez v5, :cond_8

    .line 124
    .line 125
    goto/16 :goto_0

    .line 126
    .line 127
    :cond_8
    const/16 v3, 0xf

    .line 128
    .line 129
    goto/16 :goto_0

    .line 130
    .line 131
    :sswitch_7
    const-string v5, "17"

    .line 132
    .line 133
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result v5

    .line 137
    if-nez v5, :cond_9

    .line 138
    .line 139
    goto/16 :goto_0

    .line 140
    .line 141
    :cond_9
    const/16 v3, 0xe

    .line 142
    .line 143
    goto/16 :goto_0

    .line 144
    .line 145
    :sswitch_8
    const-string v5, "16"

    .line 146
    .line 147
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-result v5

    .line 151
    if-nez v5, :cond_a

    .line 152
    .line 153
    goto/16 :goto_0

    .line 154
    .line 155
    :cond_a
    const/16 v3, 0xd

    .line 156
    .line 157
    goto/16 :goto_0

    .line 158
    .line 159
    :sswitch_9
    const-string v5, "14"

    .line 160
    .line 161
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    move-result v5

    .line 165
    if-nez v5, :cond_b

    .line 166
    .line 167
    goto/16 :goto_0

    .line 168
    .line 169
    :cond_b
    const/16 v3, 0xc

    .line 170
    .line 171
    goto/16 :goto_0

    .line 172
    .line 173
    :sswitch_a
    const-string v5, "13"

    .line 174
    .line 175
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    move-result v5

    .line 179
    if-nez v5, :cond_c

    .line 180
    .line 181
    goto/16 :goto_0

    .line 182
    .line 183
    :cond_c
    const/16 v3, 0xb

    .line 184
    .line 185
    goto/16 :goto_0

    .line 186
    .line 187
    :sswitch_b
    const-string v5, "12"

    .line 188
    .line 189
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    move-result v5

    .line 193
    if-nez v5, :cond_d

    .line 194
    .line 195
    goto/16 :goto_0

    .line 196
    .line 197
    :cond_d
    const/16 v3, 0xa

    .line 198
    .line 199
    goto/16 :goto_0

    .line 200
    .line 201
    :sswitch_c
    const-string v5, "11"

    .line 202
    .line 203
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 204
    .line 205
    .line 206
    move-result v5

    .line 207
    if-nez v5, :cond_e

    .line 208
    .line 209
    goto/16 :goto_0

    .line 210
    .line 211
    :cond_e
    const/16 v3, 0x9

    .line 212
    .line 213
    goto/16 :goto_0

    .line 214
    .line 215
    :sswitch_d
    const-string v5, "10"

    .line 216
    .line 217
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 218
    .line 219
    .line 220
    move-result v5

    .line 221
    if-nez v5, :cond_f

    .line 222
    .line 223
    goto/16 :goto_0

    .line 224
    .line 225
    :cond_f
    const/16 v3, 0x8

    .line 226
    .line 227
    goto/16 :goto_0

    .line 228
    .line 229
    :sswitch_e
    const-string v5, "9"

    .line 230
    .line 231
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 232
    .line 233
    .line 234
    move-result v5

    .line 235
    if-nez v5, :cond_10

    .line 236
    .line 237
    goto :goto_0

    .line 238
    :cond_10
    const/4 v3, 0x7

    .line 239
    goto :goto_0

    .line 240
    :sswitch_f
    const-string v5, "8"

    .line 241
    .line 242
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 243
    .line 244
    .line 245
    move-result v5

    .line 246
    if-nez v5, :cond_11

    .line 247
    .line 248
    goto :goto_0

    .line 249
    :cond_11
    const/4 v3, 0x6

    .line 250
    goto :goto_0

    .line 251
    :sswitch_10
    const-string v5, "7"

    .line 252
    .line 253
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 254
    .line 255
    .line 256
    move-result v5

    .line 257
    if-nez v5, :cond_12

    .line 258
    .line 259
    goto :goto_0

    .line 260
    :cond_12
    const/4 v3, 0x5

    .line 261
    goto :goto_0

    .line 262
    :sswitch_11
    const-string v5, "6"

    .line 263
    .line 264
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 265
    .line 266
    .line 267
    move-result v5

    .line 268
    if-nez v5, :cond_13

    .line 269
    .line 270
    goto :goto_0

    .line 271
    :cond_13
    const/4 v3, 0x4

    .line 272
    goto :goto_0

    .line 273
    :sswitch_12
    const-string v5, "5"

    .line 274
    .line 275
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 276
    .line 277
    .line 278
    move-result v5

    .line 279
    if-nez v5, :cond_14

    .line 280
    .line 281
    goto :goto_0

    .line 282
    :cond_14
    const/4 v3, 0x3

    .line 283
    goto :goto_0

    .line 284
    :sswitch_13
    const-string v5, "2"

    .line 285
    .line 286
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 287
    .line 288
    .line 289
    move-result v5

    .line 290
    if-nez v5, :cond_15

    .line 291
    .line 292
    goto :goto_0

    .line 293
    :cond_15
    const/4 v3, 0x2

    .line 294
    goto :goto_0

    .line 295
    :sswitch_14
    const-string v5, "1"

    .line 296
    .line 297
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 298
    .line 299
    .line 300
    move-result v5

    .line 301
    if-nez v5, :cond_16

    .line 302
    .line 303
    goto :goto_0

    .line 304
    :cond_16
    move v3, v0

    .line 305
    goto :goto_0

    .line 306
    :sswitch_15
    const-string v5, "0"

    .line 307
    .line 308
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 309
    .line 310
    .line 311
    move-result v5

    .line 312
    if-nez v5, :cond_17

    .line 313
    .line 314
    goto :goto_0

    .line 315
    :cond_17
    const/4 v3, 0x0

    .line 316
    :goto_0
    packed-switch v3, :pswitch_data_0

    .line 317
    .line 318
    .line 319
    :cond_18
    move-object v4, v1

    .line 320
    goto/16 :goto_1

    .line 321
    .line 322
    :pswitch_0
    new-instance v0, Lcom/bytedance/sdk/component/adexpress/dynamic/yo/ivm;

    .line 323
    .line 324
    invoke-virtual {p3}, Lcom/bytedance/sdk/component/adexpress/dynamic/moa/zjm;->uef()I

    .line 325
    .line 326
    .line 327
    move-result v4

    .line 328
    invoke-virtual {p3}, Lcom/bytedance/sdk/component/adexpress/dynamic/moa/zjm;->oa()I

    .line 329
    .line 330
    .line 331
    move-result v5

    .line 332
    invoke-virtual {p3}, Lcom/bytedance/sdk/component/adexpress/dynamic/moa/zjm;->moa()I

    .line 333
    .line 334
    .line 335
    move-result v6

    .line 336
    invoke-virtual {p3}, Lcom/bytedance/sdk/component/adexpress/dynamic/moa/zjm;->xs()Lorg/json/JSONObject;

    .line 337
    .line 338
    .line 339
    move-result-object v7

    .line 340
    move-object v1, p0

    .line 341
    move-object v2, p1

    .line 342
    move-object v3, p2

    .line 343
    invoke-direct/range {v0 .. v7}, Lcom/bytedance/sdk/component/adexpress/dynamic/yo/ivm;-><init>(Landroid/content/Context;Lcom/bytedance/sdk/component/adexpress/dynamic/dynamicview/lw;Lcom/bytedance/sdk/component/adexpress/dynamic/moa/xs;IIILorg/json/JSONObject;)V

    .line 344
    .line 345
    .line 346
    return-object v0

    .line 347
    :pswitch_1
    invoke-static {}, Lcom/bytedance/sdk/component/adexpress/moa;->oa()Z

    .line 348
    .line 349
    .line 350
    move-result v0

    .line 351
    if-eqz v0, :cond_18

    .line 352
    .line 353
    const-string v0, "static/lotties/gesture-slide.json"

    .line 354
    .line 355
    invoke-static {v2, v0}, LN0/a;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 356
    .line 357
    .line 358
    move-result-object v4

    .line 359
    new-instance v0, Lcom/bytedance/sdk/component/adexpress/dynamic/yo/dj;

    .line 360
    .line 361
    const-string v5, "25"

    .line 362
    .line 363
    move-object v1, p0

    .line 364
    move-object v2, p1

    .line 365
    move-object v3, p2

    .line 366
    invoke-direct/range {v0 .. v5}, Lcom/bytedance/sdk/component/adexpress/dynamic/yo/dj;-><init>(Landroid/content/Context;Lcom/bytedance/sdk/component/adexpress/dynamic/dynamicview/lw;Lcom/bytedance/sdk/component/adexpress/dynamic/moa/xs;Ljava/lang/String;Ljava/lang/String;)V

    .line 367
    .line 368
    .line 369
    return-object v0

    .line 370
    :pswitch_2
    move-object v4, v1

    .line 371
    invoke-static {}, Lcom/bytedance/sdk/component/adexpress/moa;->oa()Z

    .line 372
    .line 373
    .line 374
    move-result v5

    .line 375
    if-eqz v5, :cond_19

    .line 376
    .line 377
    new-instance v2, Lcom/bytedance/sdk/component/adexpress/dynamic/yo/uef;

    .line 378
    .line 379
    invoke-direct {v2, p0, p1, p2}, Lcom/bytedance/sdk/component/adexpress/dynamic/yo/uef;-><init>(Landroid/content/Context;Lcom/bytedance/sdk/component/adexpress/dynamic/dynamicview/lw;Lcom/bytedance/sdk/component/adexpress/dynamic/moa/xs;)V

    .line 380
    .line 381
    .line 382
    return-object v2

    .line 383
    :cond_19
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 384
    .line 385
    .line 386
    move-result v5

    .line 387
    if-nez v5, :cond_1a

    .line 388
    .line 389
    const-string v4, "swiper_up_star.json"

    .line 390
    .line 391
    invoke-static {v2, v4}, LN0/a;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 392
    .line 393
    .line 394
    move-result-object v2

    .line 395
    move-object v4, v2

    .line 396
    :cond_1a
    new-instance v0, Lcom/bytedance/sdk/component/adexpress/dynamic/yo/dj;

    .line 397
    .line 398
    const-string v5, "24"

    .line 399
    .line 400
    move-object v1, p0

    .line 401
    move-object v2, p1

    .line 402
    move-object v3, p2

    .line 403
    invoke-direct/range {v0 .. v5}, Lcom/bytedance/sdk/component/adexpress/dynamic/yo/dj;-><init>(Landroid/content/Context;Lcom/bytedance/sdk/component/adexpress/dynamic/dynamicview/lw;Lcom/bytedance/sdk/component/adexpress/dynamic/moa/xs;Ljava/lang/String;Ljava/lang/String;)V

    .line 404
    .line 405
    .line 406
    return-object v0

    .line 407
    :pswitch_3
    move-object v4, v1

    .line 408
    invoke-static {}, Lcom/bytedance/sdk/component/adexpress/moa;->oa()Z

    .line 409
    .line 410
    .line 411
    move-result v0

    .line 412
    if-eqz v0, :cond_1b

    .line 413
    .line 414
    const-string v0, "static/lotties/202327swiper-up-star/click.json"

    .line 415
    .line 416
    invoke-static {v2, v0}, LN0/a;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 417
    .line 418
    .line 419
    move-result-object v4

    .line 420
    new-instance v0, Lcom/bytedance/sdk/component/adexpress/dynamic/yo/dj;

    .line 421
    .line 422
    const-string v5, "23"

    .line 423
    .line 424
    move-object v1, p0

    .line 425
    move-object v2, p1

    .line 426
    move-object v3, p2

    .line 427
    invoke-direct/range {v0 .. v5}, Lcom/bytedance/sdk/component/adexpress/dynamic/yo/dj;-><init>(Landroid/content/Context;Lcom/bytedance/sdk/component/adexpress/dynamic/dynamicview/lw;Lcom/bytedance/sdk/component/adexpress/dynamic/moa/xs;Ljava/lang/String;Ljava/lang/String;)V

    .line 428
    .line 429
    .line 430
    return-object v0

    .line 431
    :cond_1b
    :goto_1
    return-object v4

    .line 432
    :pswitch_4
    invoke-static {}, Lcom/bytedance/sdk/component/adexpress/moa;->oa()Z

    .line 433
    .line 434
    .line 435
    move-result v0

    .line 436
    if-eqz v0, :cond_1c

    .line 437
    .line 438
    const-string v0, "static/lotties/202327swiper-up-star/index.json"

    .line 439
    .line 440
    invoke-static {v2, v0}, LN0/a;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 441
    .line 442
    .line 443
    move-result-object v4

    .line 444
    new-instance v0, Lcom/bytedance/sdk/component/adexpress/dynamic/yo/dj;

    .line 445
    .line 446
    const-string v5, "22"

    .line 447
    .line 448
    move-object v1, p0

    .line 449
    move-object v2, p1

    .line 450
    move-object v3, p2

    .line 451
    invoke-direct/range {v0 .. v5}, Lcom/bytedance/sdk/component/adexpress/dynamic/yo/dj;-><init>(Landroid/content/Context;Lcom/bytedance/sdk/component/adexpress/dynamic/dynamicview/lw;Lcom/bytedance/sdk/component/adexpress/dynamic/moa/xs;Ljava/lang/String;Ljava/lang/String;)V

    .line 452
    .line 453
    .line 454
    return-object v0

    .line 455
    :cond_1c
    new-instance v2, Lcom/bytedance/sdk/component/adexpress/dynamic/yo/sy;

    .line 456
    .line 457
    invoke-direct {v2, p0, p1, p2}, Lcom/bytedance/sdk/component/adexpress/dynamic/yo/sy;-><init>(Landroid/content/Context;Lcom/bytedance/sdk/component/adexpress/dynamic/dynamicview/lw;Lcom/bytedance/sdk/component/adexpress/dynamic/moa/xs;)V

    .line 458
    .line 459
    .line 460
    return-object v2

    .line 461
    :pswitch_5
    move-object v4, v1

    .line 462
    invoke-static {}, Lcom/bytedance/sdk/component/adexpress/moa;->oa()Z

    .line 463
    .line 464
    .line 465
    move-result v5

    .line 466
    if-eqz v5, :cond_1d

    .line 467
    .line 468
    const-string v4, "static/lotties/glass-swipe/glass-swipe.json"

    .line 469
    .line 470
    invoke-static {v2, v4}, LN0/a;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 471
    .line 472
    .line 473
    move-result-object v4

    .line 474
    new-instance v0, Lcom/bytedance/sdk/component/adexpress/dynamic/yo/dj;

    .line 475
    .line 476
    const-string v5, "20"

    .line 477
    .line 478
    move-object v1, p0

    .line 479
    move-object v2, p1

    .line 480
    move-object v3, p2

    .line 481
    invoke-direct/range {v0 .. v5}, Lcom/bytedance/sdk/component/adexpress/dynamic/yo/dj;-><init>(Landroid/content/Context;Lcom/bytedance/sdk/component/adexpress/dynamic/dynamicview/lw;Lcom/bytedance/sdk/component/adexpress/dynamic/moa/xs;Ljava/lang/String;Ljava/lang/String;)V

    .line 482
    .line 483
    .line 484
    return-object v0

    .line 485
    :cond_1d
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 486
    .line 487
    .line 488
    move-result v0

    .line 489
    if-nez v0, :cond_1e

    .line 490
    .line 491
    const-string v0, "brush_mask.json"

    .line 492
    .line 493
    invoke-static {v2, v0}, LN0/a;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 494
    .line 495
    .line 496
    move-result-object v1

    .line 497
    move-object v4, v1

    .line 498
    :cond_1e
    new-instance v0, Lcom/bytedance/sdk/component/adexpress/dynamic/yo/dj;

    .line 499
    .line 500
    const-string v5, "20"

    .line 501
    .line 502
    move-object v1, p0

    .line 503
    move-object v2, p1

    .line 504
    move-object v3, p2

    .line 505
    invoke-direct/range {v0 .. v5}, Lcom/bytedance/sdk/component/adexpress/dynamic/yo/dj;-><init>(Landroid/content/Context;Lcom/bytedance/sdk/component/adexpress/dynamic/dynamicview/lw;Lcom/bytedance/sdk/component/adexpress/dynamic/moa/xs;Ljava/lang/String;Ljava/lang/String;)V

    .line 506
    .line 507
    .line 508
    return-object v0

    .line 509
    :pswitch_6
    new-instance v0, Lcom/bytedance/sdk/component/adexpress/dynamic/yo/oib;

    .line 510
    .line 511
    move-object v1, p0

    .line 512
    move-object v2, p1

    .line 513
    move-object v3, p2

    .line 514
    move-object v5, p3

    .line 515
    invoke-direct/range {v0 .. v5}, Lcom/bytedance/sdk/component/adexpress/dynamic/yo/oib;-><init>(Landroid/content/Context;Lcom/bytedance/sdk/component/adexpress/dynamic/dynamicview/lw;Lcom/bytedance/sdk/component/adexpress/dynamic/moa/xs;Ljava/lang/String;Lcom/bytedance/sdk/component/adexpress/dynamic/moa/zjm;)V

    .line 516
    .line 517
    .line 518
    return-object v0

    .line 519
    :pswitch_7
    new-instance v0, Lcom/bytedance/sdk/component/adexpress/dynamic/yo/bs;

    .line 520
    .line 521
    invoke-direct {v0, p0, p1, p2}, Lcom/bytedance/sdk/component/adexpress/dynamic/yo/bs;-><init>(Landroid/content/Context;Lcom/bytedance/sdk/component/adexpress/dynamic/dynamicview/lw;Lcom/bytedance/sdk/component/adexpress/dynamic/moa/xs;)V

    .line 522
    .line 523
    .line 524
    return-object v0

    .line 525
    :pswitch_8
    new-instance v0, Lcom/bytedance/sdk/component/adexpress/dynamic/yo/ab;

    .line 526
    .line 527
    invoke-direct {v0, p0, p1, p2}, Lcom/bytedance/sdk/component/adexpress/dynamic/yo/ab;-><init>(Landroid/content/Context;Lcom/bytedance/sdk/component/adexpress/dynamic/dynamicview/lw;Lcom/bytedance/sdk/component/adexpress/dynamic/moa/xs;)V

    .line 528
    .line 529
    .line 530
    return-object v0

    .line 531
    :pswitch_9
    new-instance v0, Lcom/bytedance/sdk/component/adexpress/dynamic/yo/moa;

    .line 532
    .line 533
    invoke-direct {v0, p0, p1, p2}, Lcom/bytedance/sdk/component/adexpress/dynamic/yo/moa;-><init>(Landroid/content/Context;Lcom/bytedance/sdk/component/adexpress/dynamic/dynamicview/lw;Lcom/bytedance/sdk/component/adexpress/dynamic/moa/xs;)V

    .line 534
    .line 535
    .line 536
    return-object v0

    .line 537
    :pswitch_a
    new-instance v0, Lcom/bytedance/sdk/component/adexpress/dynamic/yo/wk;

    .line 538
    .line 539
    invoke-virtual {p3}, Lcom/bytedance/sdk/component/adexpress/dynamic/moa/zjm;->uef()I

    .line 540
    .line 541
    .line 542
    move-result v5

    .line 543
    invoke-virtual {p3}, Lcom/bytedance/sdk/component/adexpress/dynamic/moa/zjm;->oa()I

    .line 544
    .line 545
    .line 546
    move-result v6

    .line 547
    invoke-virtual {p3}, Lcom/bytedance/sdk/component/adexpress/dynamic/moa/zjm;->moa()I

    .line 548
    .line 549
    .line 550
    move-result v7

    .line 551
    invoke-virtual {p3}, Lcom/bytedance/sdk/component/adexpress/dynamic/moa/zjm;->xs()Lorg/json/JSONObject;

    .line 552
    .line 553
    .line 554
    move-result-object v8

    .line 555
    move-object v1, p0

    .line 556
    move-object v2, p1

    .line 557
    move-object v3, p2

    .line 558
    invoke-direct/range {v0 .. v8}, Lcom/bytedance/sdk/component/adexpress/dynamic/yo/wk;-><init>(Landroid/content/Context;Lcom/bytedance/sdk/component/adexpress/dynamic/dynamicview/lw;Lcom/bytedance/sdk/component/adexpress/dynamic/moa/xs;Ljava/lang/String;IIILorg/json/JSONObject;)V

    .line 559
    .line 560
    .line 561
    return-object v0

    .line 562
    :pswitch_b
    new-instance v0, Lcom/bytedance/sdk/component/adexpress/dynamic/yo/cq;

    .line 563
    .line 564
    invoke-direct {v0, p0, p1, p2}, Lcom/bytedance/sdk/component/adexpress/dynamic/yo/cq;-><init>(Landroid/content/Context;Lcom/bytedance/sdk/component/adexpress/dynamic/dynamicview/lw;Lcom/bytedance/sdk/component/adexpress/dynamic/moa/xs;)V

    .line 565
    .line 566
    .line 567
    return-object v0

    .line 568
    :pswitch_c
    new-instance v0, Lcom/bytedance/sdk/component/adexpress/dynamic/yo/wrv;

    .line 569
    .line 570
    invoke-direct {v0, p0, p1, p2}, Lcom/bytedance/sdk/component/adexpress/dynamic/yo/wrv;-><init>(Landroid/content/Context;Lcom/bytedance/sdk/component/adexpress/dynamic/dynamicview/lw;Lcom/bytedance/sdk/component/adexpress/dynamic/moa/xs;)V

    .line 571
    .line 572
    .line 573
    return-object v0

    .line 574
    :pswitch_d
    new-instance v0, Lcom/bytedance/sdk/component/adexpress/dynamic/yo/dz;

    .line 575
    .line 576
    invoke-direct {v0, p0, p1, p2}, Lcom/bytedance/sdk/component/adexpress/dynamic/yo/dz;-><init>(Landroid/content/Context;Lcom/bytedance/sdk/component/adexpress/dynamic/dynamicview/lw;Lcom/bytedance/sdk/component/adexpress/dynamic/moa/xs;)V

    .line 577
    .line 578
    .line 579
    return-object v0

    .line 580
    :pswitch_e
    invoke-virtual {p2}, Lcom/bytedance/sdk/component/adexpress/dynamic/moa/xs;->gem()I

    .line 581
    .line 582
    .line 583
    move-result v4

    .line 584
    if-ne v4, v0, :cond_1f

    .line 585
    .line 586
    new-instance v0, Lcom/bytedance/sdk/component/adexpress/dynamic/yo/bs;

    .line 587
    .line 588
    invoke-virtual {p2}, Lcom/bytedance/sdk/component/adexpress/dynamic/moa/xs;->wxf()I

    .line 589
    .line 590
    .line 591
    move-result v4

    .line 592
    invoke-direct {v0, p0, p1, p2, v4}, Lcom/bytedance/sdk/component/adexpress/dynamic/yo/bs;-><init>(Landroid/content/Context;Lcom/bytedance/sdk/component/adexpress/dynamic/dynamicview/lw;Lcom/bytedance/sdk/component/adexpress/dynamic/moa/xs;I)V

    .line 593
    .line 594
    .line 595
    return-object v0

    .line 596
    :cond_1f
    new-instance v0, Lcom/bytedance/sdk/component/adexpress/dynamic/yo/ab;

    .line 597
    .line 598
    invoke-direct {v0, p0, p1, p2}, Lcom/bytedance/sdk/component/adexpress/dynamic/yo/ab;-><init>(Landroid/content/Context;Lcom/bytedance/sdk/component/adexpress/dynamic/dynamicview/lw;Lcom/bytedance/sdk/component/adexpress/dynamic/moa/xs;)V

    .line 599
    .line 600
    .line 601
    return-object v0

    .line 602
    :pswitch_f
    new-instance v0, Lcom/bytedance/sdk/component/adexpress/dynamic/yo/oa;

    .line 603
    .line 604
    invoke-direct {v0, p0, p1, p2}, Lcom/bytedance/sdk/component/adexpress/dynamic/yo/oa;-><init>(Landroid/content/Context;Lcom/bytedance/sdk/component/adexpress/dynamic/dynamicview/lw;Lcom/bytedance/sdk/component/adexpress/dynamic/moa/xs;)V

    .line 605
    .line 606
    .line 607
    return-object v0

    .line 608
    :pswitch_10
    new-instance v0, Lcom/bytedance/sdk/component/adexpress/dynamic/yo/yo;

    .line 609
    .line 610
    invoke-direct {v0, p0, p1, p2}, Lcom/bytedance/sdk/component/adexpress/dynamic/yo/yo;-><init>(Landroid/content/Context;Lcom/bytedance/sdk/component/adexpress/dynamic/dynamicview/lw;Lcom/bytedance/sdk/component/adexpress/dynamic/moa/xs;)V

    .line 611
    .line 612
    .line 613
    return-object v0

    .line 614
    :pswitch_11
    new-instance v0, Lcom/bytedance/sdk/component/adexpress/dynamic/yo/lw;

    .line 615
    .line 616
    invoke-direct {v0, p0, p1, p2}, Lcom/bytedance/sdk/component/adexpress/dynamic/yo/lw;-><init>(Landroid/content/Context;Lcom/bytedance/sdk/component/adexpress/dynamic/dynamicview/lw;Lcom/bytedance/sdk/component/adexpress/dynamic/moa/xs;)V

    .line 617
    .line 618
    .line 619
    return-object v0

    .line 620
    :goto_2
    return-object v4

    .line 621
    :sswitch_data_0
    .sparse-switch
        0x30 -> :sswitch_15
        0x31 -> :sswitch_14
        0x32 -> :sswitch_13
        0x35 -> :sswitch_12
        0x36 -> :sswitch_11
        0x37 -> :sswitch_10
        0x38 -> :sswitch_f
        0x39 -> :sswitch_e
        0x61f -> :sswitch_d
        0x620 -> :sswitch_c
        0x621 -> :sswitch_b
        0x622 -> :sswitch_a
        0x623 -> :sswitch_9
        0x625 -> :sswitch_8
        0x626 -> :sswitch_7
        0x627 -> :sswitch_6
        0x63e -> :sswitch_5
        0x640 -> :sswitch_4
        0x641 -> :sswitch_3
        0x642 -> :sswitch_2
        0x643 -> :sswitch_1
        0x647 -> :sswitch_0
    .end sparse-switch

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
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_d
        :pswitch_8
        :pswitch_7
        :pswitch_c
        :pswitch_a
        :pswitch_6
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
