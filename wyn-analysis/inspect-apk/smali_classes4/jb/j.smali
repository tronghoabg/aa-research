.class public final synthetic Ljb/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Luc/o;

.field public final synthetic c:Ltc/g;

.field public final synthetic d:Ljb/e;


# direct methods
.method public synthetic constructor <init>(Ljb/e;Luc/o;Ltc/g;)V
    .locals 1

    .line 1
    const/4 v0, 0x6

    iput v0, p0, Ljb/j;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljb/j;->d:Ljb/e;

    iput-object p2, p0, Ljb/j;->b:Luc/o;

    iput-object p3, p0, Ljb/j;->c:Ltc/g;

    return-void
.end method

.method public synthetic constructor <init>(Luc/o;Ljb/e;Ltc/g;)V
    .locals 1

    .line 2
    const/4 v0, 0x3

    iput v0, p0, Ljb/j;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljb/j;->b:Luc/o;

    iput-object p2, p0, Ljb/j;->d:Ljb/e;

    iput-object p3, p0, Ljb/j;->c:Ltc/g;

    return-void
.end method

.method public synthetic constructor <init>(Luc/o;Ltc/g;Ljb/e;I)V
    .locals 0

    .line 3
    iput p4, p0, Ljb/j;->a:I

    iput-object p1, p0, Ljb/j;->b:Luc/o;

    iput-object p2, p0, Ljb/j;->c:Ltc/g;

    iput-object p3, p0, Ljb/j;->d:Ljb/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const/4 v0, 0x3

    .line 4
    const/4 v2, 0x2

    .line 5
    const/4 v3, 0x1

    .line 6
    const/4 v4, 0x0

    .line 7
    const/4 v5, 0x0

    .line 8
    iget-object v6, v1, Ljb/j;->c:Ltc/g;

    .line 9
    .line 10
    iget-object v7, v1, Ljb/j;->b:Luc/o;

    .line 11
    .line 12
    iget-object v8, v1, Ljb/j;->d:Ljb/e;

    .line 13
    .line 14
    iget v9, v1, Ljb/j;->a:I

    .line 15
    .line 16
    packed-switch v9, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    sget-object v9, Ljb/l;->c:Ljava/util/HashMap;

    .line 20
    .line 21
    sget-object v9, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 22
    .line 23
    const-string v10, "noResult"

    .line 24
    .line 25
    invoke-virtual {v7, v10}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v10

    .line 29
    invoke-virtual {v9, v10}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v9

    .line 33
    sget-object v10, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 34
    .line 35
    const-string v11, "continueOnError"

    .line 36
    .line 37
    invoke-virtual {v7, v11}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v11

    .line 41
    invoke-virtual {v10, v11}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v10

    .line 45
    const-string v11, "operations"

    .line 46
    .line 47
    invoke-virtual {v7, v11}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v7

    .line 51
    check-cast v7, Ljava/util/List;

    .line 52
    .line 53
    new-instance v11, Ljava/util/ArrayList;

    .line 54
    .line 55
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 56
    .line 57
    .line 58
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 59
    .line 60
    .line 61
    move-result-object v7

    .line 62
    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 63
    .line 64
    .line 65
    move-result v12

    .line 66
    if-eqz v12, :cond_c

    .line 67
    .line 68
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v12

    .line 72
    check-cast v12, Ljava/util/Map;

    .line 73
    .line 74
    new-instance v13, Lkb/a;

    .line 75
    .line 76
    invoke-direct {v13, v12, v9}, Lkb/a;-><init>(Ljava/util/Map;Z)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v13}, Lkb/a;->s()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v12

    .line 83
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    iget-object v14, v13, Lkb/a;->c:LVa/Za;

    .line 87
    .line 88
    invoke-virtual {v12}, Ljava/lang/String;->hashCode()I

    .line 89
    .line 90
    .line 91
    move-result v16

    .line 92
    sparse-switch v16, :sswitch_data_0

    .line 93
    .line 94
    .line 95
    :goto_1
    const/4 v15, -0x1

    .line 96
    goto :goto_2

    .line 97
    :sswitch_0
    const-string v15, "query"

    .line 98
    .line 99
    invoke-virtual {v12, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v15

    .line 103
    if-nez v15, :cond_0

    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_0
    move v15, v0

    .line 107
    goto :goto_2

    .line 108
    :sswitch_1
    const-string v15, "update"

    .line 109
    .line 110
    invoke-virtual {v12, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v15

    .line 114
    if-nez v15, :cond_1

    .line 115
    .line 116
    goto :goto_1

    .line 117
    :cond_1
    move v15, v2

    .line 118
    goto :goto_2

    .line 119
    :sswitch_2
    const-string v15, "insert"

    .line 120
    .line 121
    invoke-virtual {v12, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v15

    .line 125
    if-nez v15, :cond_2

    .line 126
    .line 127
    goto :goto_1

    .line 128
    :cond_2
    move v15, v3

    .line 129
    goto :goto_2

    .line 130
    :sswitch_3
    const-string v15, "execute"

    .line 131
    .line 132
    invoke-virtual {v12, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result v15

    .line 136
    if-nez v15, :cond_3

    .line 137
    .line 138
    goto :goto_1

    .line 139
    :cond_3
    move v15, v4

    .line 140
    :goto_2
    packed-switch v15, :pswitch_data_1

    .line 141
    .line 142
    .line 143
    const-string v0, "Batch method \'"

    .line 144
    .line 145
    const-string v2, "\' not supported"

    .line 146
    .line 147
    invoke-static {v0, v12, v2}, LA7/p0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    const-string v2, "bad_param"

    .line 152
    .line 153
    invoke-virtual {v6, v2, v0, v5}, Ltc/g;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    goto/16 :goto_3

    .line 157
    .line 158
    :pswitch_0
    invoke-virtual {v8, v13}, Ljb/e;->e(La/a;)Z

    .line 159
    .line 160
    .line 161
    move-result v12

    .line 162
    if-eqz v12, :cond_4

    .line 163
    .line 164
    invoke-virtual {v13, v11}, Lkb/a;->o0(Ljava/util/ArrayList;)V

    .line 165
    .line 166
    .line 167
    goto :goto_0

    .line 168
    :cond_4
    if-eqz v10, :cond_5

    .line 169
    .line 170
    invoke-virtual {v13, v11}, Lkb/a;->n0(Ljava/util/ArrayList;)V

    .line 171
    .line 172
    .line 173
    goto :goto_0

    .line 174
    :cond_5
    iget-object v0, v14, LVa/Za;->b:Ljava/lang/Object;

    .line 175
    .line 176
    check-cast v0, Ljava/lang/String;

    .line 177
    .line 178
    iget-object v2, v14, LVa/Za;->c:Ljava/lang/Object;

    .line 179
    .line 180
    check-cast v2, Ljava/lang/String;

    .line 181
    .line 182
    iget-object v3, v14, LVa/Za;->d:Ljava/lang/Object;

    .line 183
    .line 184
    check-cast v3, Ljava/util/HashMap;

    .line 185
    .line 186
    invoke-virtual {v6, v0, v2, v3}, Ltc/g;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    goto/16 :goto_3

    .line 190
    .line 191
    :pswitch_1
    invoke-virtual {v8, v13}, Ljb/e;->f(La/a;)Z

    .line 192
    .line 193
    .line 194
    move-result v12

    .line 195
    if-eqz v12, :cond_6

    .line 196
    .line 197
    invoke-virtual {v13, v11}, Lkb/a;->o0(Ljava/util/ArrayList;)V

    .line 198
    .line 199
    .line 200
    goto/16 :goto_0

    .line 201
    .line 202
    :cond_6
    if-eqz v10, :cond_7

    .line 203
    .line 204
    invoke-virtual {v13, v11}, Lkb/a;->n0(Ljava/util/ArrayList;)V

    .line 205
    .line 206
    .line 207
    goto/16 :goto_0

    .line 208
    .line 209
    :cond_7
    iget-object v0, v14, LVa/Za;->b:Ljava/lang/Object;

    .line 210
    .line 211
    check-cast v0, Ljava/lang/String;

    .line 212
    .line 213
    iget-object v2, v14, LVa/Za;->c:Ljava/lang/Object;

    .line 214
    .line 215
    check-cast v2, Ljava/lang/String;

    .line 216
    .line 217
    iget-object v3, v14, LVa/Za;->d:Ljava/lang/Object;

    .line 218
    .line 219
    check-cast v3, Ljava/util/HashMap;

    .line 220
    .line 221
    invoke-virtual {v6, v0, v2, v3}, Ltc/g;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 222
    .line 223
    .line 224
    goto :goto_3

    .line 225
    :pswitch_2
    invoke-virtual {v8, v13}, Ljb/e;->d(La/a;)Z

    .line 226
    .line 227
    .line 228
    move-result v12

    .line 229
    if-eqz v12, :cond_8

    .line 230
    .line 231
    invoke-virtual {v13, v11}, Lkb/a;->o0(Ljava/util/ArrayList;)V

    .line 232
    .line 233
    .line 234
    goto/16 :goto_0

    .line 235
    .line 236
    :cond_8
    if-eqz v10, :cond_9

    .line 237
    .line 238
    invoke-virtual {v13, v11}, Lkb/a;->n0(Ljava/util/ArrayList;)V

    .line 239
    .line 240
    .line 241
    goto/16 :goto_0

    .line 242
    .line 243
    :cond_9
    iget-object v0, v14, LVa/Za;->b:Ljava/lang/Object;

    .line 244
    .line 245
    check-cast v0, Ljava/lang/String;

    .line 246
    .line 247
    iget-object v2, v14, LVa/Za;->c:Ljava/lang/Object;

    .line 248
    .line 249
    check-cast v2, Ljava/lang/String;

    .line 250
    .line 251
    iget-object v3, v14, LVa/Za;->d:Ljava/lang/Object;

    .line 252
    .line 253
    check-cast v3, Ljava/util/HashMap;

    .line 254
    .line 255
    invoke-virtual {v6, v0, v2, v3}, Ltc/g;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 256
    .line 257
    .line 258
    goto :goto_3

    .line 259
    :pswitch_3
    invoke-virtual {v8, v13}, Ljb/e;->g(La/a;)Z

    .line 260
    .line 261
    .line 262
    move-result v12

    .line 263
    if-nez v12, :cond_b

    .line 264
    .line 265
    if-eqz v10, :cond_a

    .line 266
    .line 267
    invoke-virtual {v13, v11}, Lkb/a;->n0(Ljava/util/ArrayList;)V

    .line 268
    .line 269
    .line 270
    goto/16 :goto_0

    .line 271
    .line 272
    :cond_a
    iget-object v0, v14, LVa/Za;->b:Ljava/lang/Object;

    .line 273
    .line 274
    check-cast v0, Ljava/lang/String;

    .line 275
    .line 276
    iget-object v2, v14, LVa/Za;->c:Ljava/lang/Object;

    .line 277
    .line 278
    check-cast v2, Ljava/lang/String;

    .line 279
    .line 280
    iget-object v3, v14, LVa/Za;->d:Ljava/lang/Object;

    .line 281
    .line 282
    check-cast v3, Ljava/util/HashMap;

    .line 283
    .line 284
    invoke-virtual {v6, v0, v2, v3}, Ltc/g;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 285
    .line 286
    .line 287
    goto :goto_3

    .line 288
    :cond_b
    invoke-virtual {v13, v5}, La/a;->b(Ljava/io/Serializable;)V

    .line 289
    .line 290
    .line 291
    invoke-virtual {v13, v11}, Lkb/a;->o0(Ljava/util/ArrayList;)V

    .line 292
    .line 293
    .line 294
    goto/16 :goto_0

    .line 295
    .line 296
    :cond_c
    if-eqz v9, :cond_d

    .line 297
    .line 298
    invoke-virtual {v6, v5}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 299
    .line 300
    .line 301
    goto :goto_3

    .line 302
    :cond_d
    invoke-virtual {v6, v11}, Ltc/g;->a(Ljava/lang/Object;)V

    .line 303
    .line 304
    .line 305
    :goto_3
    return-void

    .line 306
    :pswitch_4
    sget-object v0, Ljb/l;->c:Ljava/util/HashMap;

    .line 307
    .line 308
    new-instance v0, Lkb/b;

    .line 309
    .line 310
    invoke-direct {v0, v7, v6}, Lkb/b;-><init>(Luc/o;Luc/q;)V

    .line 311
    .line 312
    .line 313
    new-instance v3, Ljb/b;

    .line 314
    .line 315
    invoke-direct {v3, v8, v0, v2}, Ljb/b;-><init>(Ljb/e;Lkb/b;I)V

    .line 316
    .line 317
    .line 318
    invoke-virtual {v8, v0, v3}, Ljb/e;->l(Lkb/b;Ljava/lang/Runnable;)V

    .line 319
    .line 320
    .line 321
    return-void

    .line 322
    :pswitch_5
    sget-object v0, Ljb/l;->c:Ljava/util/HashMap;

    .line 323
    .line 324
    new-instance v0, Lkb/b;

    .line 325
    .line 326
    invoke-direct {v0, v7, v6}, Lkb/b;-><init>(Luc/o;Luc/q;)V

    .line 327
    .line 328
    .line 329
    new-instance v2, Ljb/b;

    .line 330
    .line 331
    const/4 v3, 0x4

    .line 332
    invoke-direct {v2, v8, v0, v3}, Ljb/b;-><init>(Ljb/e;Lkb/b;I)V

    .line 333
    .line 334
    .line 335
    invoke-virtual {v8, v0, v2}, Ljb/e;->l(Lkb/b;Ljava/lang/Runnable;)V

    .line 336
    .line 337
    .line 338
    return-void

    .line 339
    :pswitch_6
    sget-object v0, Ljb/l;->c:Ljava/util/HashMap;

    .line 340
    .line 341
    const-string v0, "locale"

    .line 342
    .line 343
    invoke-virtual {v7, v0}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    move-result-object v0

    .line 347
    check-cast v0, Ljava/lang/String;

    .line 348
    .line 349
    :try_start_0
    iget-object v2, v8, Ljb/e;->i:Landroid/database/sqlite/SQLiteDatabase;

    .line 350
    .line 351
    invoke-static {v0}, Ljava/util/Locale;->forLanguageTag(Ljava/lang/String;)Ljava/util/Locale;

    .line 352
    .line 353
    .line 354
    move-result-object v0

    .line 355
    invoke-virtual {v2, v0}, Landroid/database/sqlite/SQLiteDatabase;->setLocale(Ljava/util/Locale;)V

    .line 356
    .line 357
    .line 358
    invoke-virtual {v6, v5}, Ltc/g;->a(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 359
    .line 360
    .line 361
    goto :goto_4

    .line 362
    :catch_0
    move-exception v0

    .line 363
    new-instance v2, Ljava/lang/StringBuilder;

    .line 364
    .line 365
    const-string v3, "Error calling setLocale: "

    .line 366
    .line 367
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 368
    .line 369
    .line 370
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 371
    .line 372
    .line 373
    move-result-object v0

    .line 374
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 375
    .line 376
    .line 377
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 378
    .line 379
    .line 380
    move-result-object v0

    .line 381
    const-string v2, "sqlite_error"

    .line 382
    .line 383
    invoke-virtual {v6, v2, v0, v5}, Ltc/g;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 384
    .line 385
    .line 386
    :goto_4
    return-void

    .line 387
    :pswitch_7
    sget-object v0, Ljb/l;->c:Ljava/util/HashMap;

    .line 388
    .line 389
    new-instance v0, Lkb/b;

    .line 390
    .line 391
    invoke-direct {v0, v7, v6}, Lkb/b;-><init>(Luc/o;Luc/q;)V

    .line 392
    .line 393
    .line 394
    new-instance v2, Ljb/b;

    .line 395
    .line 396
    invoke-direct {v2, v8, v0, v3}, Ljb/b;-><init>(Ljb/e;Lkb/b;I)V

    .line 397
    .line 398
    .line 399
    invoke-virtual {v8, v0, v2}, Ljb/e;->l(Lkb/b;Ljava/lang/Runnable;)V

    .line 400
    .line 401
    .line 402
    return-void

    .line 403
    :pswitch_8
    sget-object v2, Ljb/l;->c:Ljava/util/HashMap;

    .line 404
    .line 405
    new-instance v2, Lkb/b;

    .line 406
    .line 407
    invoke-direct {v2, v7, v6}, Lkb/b;-><init>(Luc/o;Luc/q;)V

    .line 408
    .line 409
    .line 410
    new-instance v3, Ljb/b;

    .line 411
    .line 412
    invoke-direct {v3, v8, v2, v0}, Ljb/b;-><init>(Ljb/e;Lkb/b;I)V

    .line 413
    .line 414
    .line 415
    invoke-virtual {v8, v2, v3}, Ljb/e;->l(Lkb/b;Ljava/lang/Runnable;)V

    .line 416
    .line 417
    .line 418
    return-void

    .line 419
    :pswitch_9
    sget-object v0, Ljb/l;->c:Ljava/util/HashMap;

    .line 420
    .line 421
    new-instance v0, Lkb/b;

    .line 422
    .line 423
    invoke-direct {v0, v7, v6}, Lkb/b;-><init>(Luc/o;Luc/q;)V

    .line 424
    .line 425
    .line 426
    new-instance v2, Ljb/b;

    .line 427
    .line 428
    invoke-direct {v2, v8, v0, v4}, Ljb/b;-><init>(Ljb/e;Lkb/b;I)V

    .line 429
    .line 430
    .line 431
    invoke-virtual {v8, v0, v2}, Ljb/e;->l(Lkb/b;Ljava/lang/Runnable;)V

    .line 432
    .line 433
    .line 434
    return-void

    .line 435
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
    .end packed-switch

    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    :sswitch_data_0
    .sparse-switch
        -0x4ea7088b -> :sswitch_3
        -0x468f3d47 -> :sswitch_2
        -0x31ffc737 -> :sswitch_1
        0x66f18c8 -> :sswitch_0
    .end sparse-switch

    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
