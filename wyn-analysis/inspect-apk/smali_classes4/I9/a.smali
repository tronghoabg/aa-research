.class public final LI9/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/util/ArrayList;

.field public b:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    packed-switch p1, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    new-instance p1, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, LI9/a;->a:Ljava/util/ArrayList;

    .line 13
    .line 14
    const/16 p1, 0x80

    .line 15
    .line 16
    iput p1, p0, LI9/a;->b:I

    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    new-instance p1, Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object p1, p0, LI9/a;->a:Ljava/util/ArrayList;

    .line 28
    .line 29
    const/4 p1, 0x0

    .line 30
    iput p1, p0, LI9/a;->b:I

    .line 31
    .line 32
    return-void

    .line 33
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    new-instance v2, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance v3, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    :goto_0
    const-class v5, Ljava/lang/Object;

    .line 19
    .line 20
    if-eq v4, v5, :cond_13

    .line 21
    .line 22
    invoke-virtual {v4}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 23
    .line 24
    .line 25
    move-result-object v5

    .line 26
    array-length v6, v5

    .line 27
    const/4 v8, 0x0

    .line 28
    :goto_1
    if-ge v8, v6, :cond_12

    .line 29
    .line 30
    aget-object v13, v5, v8

    .line 31
    .line 32
    const-class v9, Lhb/Q;

    .line 33
    .line 34
    invoke-virtual {v13, v9}, Ljava/lang/reflect/AccessibleObject;->isAnnotationPresent(Ljava/lang/Class;)Z

    .line 35
    .line 36
    .line 37
    move-result v9

    .line 38
    const-string v10, "Nullable"

    .line 39
    .line 40
    const-class v11, Lhb/r;

    .line 41
    .line 42
    const-string v12, "\n    "

    .line 43
    .line 44
    const-string v14, "Unexpected signature for "

    .line 45
    .line 46
    sget-object v15, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 47
    .line 48
    if-eqz v9, :cond_8

    .line 49
    .line 50
    invoke-virtual {v13, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getGenericReturnType()Ljava/lang/reflect/Type;

    .line 54
    .line 55
    .line 56
    move-result-object v9

    .line 57
    const/16 v21, 0x0

    .line 58
    .line 59
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getGenericParameterTypes()[Ljava/lang/reflect/Type;

    .line 60
    .line 61
    .line 62
    move-result-object v7

    .line 63
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getParameterAnnotations()[[Ljava/lang/annotation/Annotation;

    .line 64
    .line 65
    .line 66
    move-result-object v16

    .line 67
    move/from16 v22, v1

    .line 68
    .line 69
    array-length v1, v7

    .line 70
    move-object/from16 v23, v4

    .line 71
    .line 72
    const/4 v4, 0x2

    .line 73
    if-lt v1, v4, :cond_1

    .line 74
    .line 75
    aget-object v1, v7, v21

    .line 76
    .line 77
    const-class v4, Lhb/C;

    .line 78
    .line 79
    if-ne v1, v4, :cond_1

    .line 80
    .line 81
    if-ne v9, v15, :cond_1

    .line 82
    .line 83
    array-length v1, v7

    .line 84
    const/4 v4, 0x2

    .line 85
    :goto_2
    if-ge v4, v1, :cond_3

    .line 86
    .line 87
    move/from16 v17, v1

    .line 88
    .line 89
    aget-object v1, v7, v4

    .line 90
    .line 91
    move/from16 v18, v4

    .line 92
    .line 93
    instance-of v4, v1, Ljava/lang/reflect/ParameterizedType;

    .line 94
    .line 95
    if-nez v4, :cond_0

    .line 96
    .line 97
    goto :goto_3

    .line 98
    :cond_0
    check-cast v1, Ljava/lang/reflect/ParameterizedType;

    .line 99
    .line 100
    invoke-interface {v1}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    if-eq v1, v11, :cond_2

    .line 105
    .line 106
    :cond_1
    :goto_3
    move-object/from16 v24, v5

    .line 107
    .line 108
    move-object v5, v10

    .line 109
    move-object v1, v11

    .line 110
    move-object v4, v12

    .line 111
    move-object/from16 v18, v14

    .line 112
    .line 113
    move-object v10, v15

    .line 114
    goto :goto_4

    .line 115
    :cond_2
    add-int/lit8 v4, v18, 0x1

    .line 116
    .line 117
    move/from16 v1, v17

    .line 118
    .line 119
    goto :goto_2

    .line 120
    :cond_3
    aget-object v1, v16, v22

    .line 121
    .line 122
    invoke-static {v1}, Lib/f;->e([Ljava/lang/annotation/Annotation;)Ljava/util/Set;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    new-instance v9, Lhb/b;

    .line 127
    .line 128
    move-object v4, v10

    .line 129
    aget-object v10, v7, v22

    .line 130
    .line 131
    move-object/from16 v16, v14

    .line 132
    .line 133
    array-length v14, v7

    .line 134
    move-object v7, v15

    .line 135
    const/4 v15, 0x2

    .line 136
    move-object/from16 v17, v16

    .line 137
    .line 138
    const/16 v16, 0x1

    .line 139
    .line 140
    move-object/from16 v18, v17

    .line 141
    .line 142
    const/16 v17, 0x0

    .line 143
    .line 144
    move-object/from16 v24, v11

    .line 145
    .line 146
    move-object v11, v1

    .line 147
    move-object/from16 v1, v24

    .line 148
    .line 149
    move-object/from16 v24, v5

    .line 150
    .line 151
    move-object v5, v4

    .line 152
    move-object v4, v12

    .line 153
    move-object/from16 v12, p1

    .line 154
    .line 155
    invoke-direct/range {v9 .. v17}, Lhb/b;-><init>(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/Object;Ljava/lang/reflect/Method;IIZI)V

    .line 156
    .line 157
    .line 158
    move/from16 v25, v6

    .line 159
    .line 160
    move-object/from16 v6, v18

    .line 161
    .line 162
    goto :goto_8

    .line 163
    :goto_4
    array-length v11, v7

    .line 164
    move/from16 v12, v22

    .line 165
    .line 166
    if-ne v11, v12, :cond_7

    .line 167
    .line 168
    if-eq v9, v10, :cond_7

    .line 169
    .line 170
    sget-object v11, Lib/f;->a:Ljava/util/Set;

    .line 171
    .line 172
    invoke-interface {v13}, Ljava/lang/reflect/AnnotatedElement;->getAnnotations()[Ljava/lang/annotation/Annotation;

    .line 173
    .line 174
    .line 175
    move-result-object v11

    .line 176
    invoke-static {v11}, Lib/f;->e([Ljava/lang/annotation/Annotation;)Ljava/util/Set;

    .line 177
    .line 178
    .line 179
    move-result-object v19

    .line 180
    aget-object v11, v16, v21

    .line 181
    .line 182
    invoke-static {v11}, Lib/f;->e([Ljava/lang/annotation/Annotation;)Ljava/util/Set;

    .line 183
    .line 184
    .line 185
    move-result-object v11

    .line 186
    aget-object v12, v16, v21

    .line 187
    .line 188
    array-length v14, v12

    .line 189
    move/from16 v15, v21

    .line 190
    .line 191
    :goto_5
    if-ge v15, v14, :cond_5

    .line 192
    .line 193
    aget-object v16, v12, v15

    .line 194
    .line 195
    invoke-interface/range {v16 .. v16}, Ljava/lang/annotation/Annotation;->annotationType()Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    move-result-object v16

    .line 199
    move/from16 v25, v6

    .line 200
    .line 201
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v6

    .line 205
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    move-result v6

    .line 209
    if-eqz v6, :cond_4

    .line 210
    .line 211
    const/4 v15, 0x1

    .line 212
    :goto_6
    move-object/from16 v17, v9

    .line 213
    .line 214
    goto :goto_7

    .line 215
    :cond_4
    const/16 v22, 0x1

    .line 216
    .line 217
    add-int/lit8 v15, v15, 0x1

    .line 218
    .line 219
    move/from16 v6, v25

    .line 220
    .line 221
    goto :goto_5

    .line 222
    :cond_5
    move/from16 v25, v6

    .line 223
    .line 224
    move/from16 v15, v21

    .line 225
    .line 226
    goto :goto_6

    .line 227
    :goto_7
    new-instance v9, Lhb/c;

    .line 228
    .line 229
    move-object v6, v10

    .line 230
    aget-object v10, v7, v21

    .line 231
    .line 232
    array-length v14, v7

    .line 233
    const/16 v20, 0x0

    .line 234
    .line 235
    move-object/from16 v16, v18

    .line 236
    .line 237
    move-object/from16 v18, v11

    .line 238
    .line 239
    move-object v12, v7

    .line 240
    move-object v7, v6

    .line 241
    move-object/from16 v6, v16

    .line 242
    .line 243
    move-object/from16 v16, v12

    .line 244
    .line 245
    move-object/from16 v12, p1

    .line 246
    .line 247
    invoke-direct/range {v9 .. v20}, Lhb/c;-><init>(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/Object;Ljava/lang/reflect/Method;IZ[Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/util/Set;I)V

    .line 248
    .line 249
    .line 250
    :goto_8
    iget-object v10, v9, Lhb/d;->a:Ljava/lang/reflect/Type;

    .line 251
    .line 252
    iget-object v11, v9, Lhb/d;->b:Ljava/util/Set;

    .line 253
    .line 254
    invoke-static {v2, v10, v11}, Lhb/e;->b(Ljava/util/ArrayList;Ljava/lang/reflect/Type;Ljava/util/Set;)Lhb/d;

    .line 255
    .line 256
    .line 257
    move-result-object v10

    .line 258
    if-nez v10, :cond_6

    .line 259
    .line 260
    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 261
    .line 262
    .line 263
    goto :goto_9

    .line 264
    :cond_6
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 265
    .line 266
    new-instance v2, Ljava/lang/StringBuilder;

    .line 267
    .line 268
    const-string v3, "Conflicting @ToJson methods:\n    "

    .line 269
    .line 270
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 271
    .line 272
    .line 273
    iget-object v3, v10, Lhb/d;->d:Ljava/lang/reflect/Method;

    .line 274
    .line 275
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 276
    .line 277
    .line 278
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 279
    .line 280
    .line 281
    iget-object v3, v9, Lhb/d;->d:Ljava/lang/reflect/Method;

    .line 282
    .line 283
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 284
    .line 285
    .line 286
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object v2

    .line 290
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 291
    .line 292
    .line 293
    throw v1

    .line 294
    :cond_7
    move-object/from16 v6, v18

    .line 295
    .line 296
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 297
    .line 298
    new-instance v2, Ljava/lang/StringBuilder;

    .line 299
    .line 300
    invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 301
    .line 302
    .line 303
    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 304
    .line 305
    .line 306
    const-string v3, ".\n@ToJson method signatures may have one of the following structures:\n    <any access modifier> void toJson(JsonWriter writer, T value) throws <any>;\n    <any access modifier> void toJson(JsonWriter writer, T value, JsonAdapter<any> delegate, <any more delegates>) throws <any>;\n    <any access modifier> R toJson(T value) throws <any>;\n"

    .line 307
    .line 308
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 309
    .line 310
    .line 311
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 312
    .line 313
    .line 314
    move-result-object v2

    .line 315
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 316
    .line 317
    .line 318
    throw v1

    .line 319
    :cond_8
    move-object/from16 v23, v4

    .line 320
    .line 321
    move-object/from16 v24, v5

    .line 322
    .line 323
    move/from16 v25, v6

    .line 324
    .line 325
    move-object v5, v10

    .line 326
    move-object v1, v11

    .line 327
    move-object v4, v12

    .line 328
    move-object v6, v14

    .line 329
    move-object v7, v15

    .line 330
    const/16 v21, 0x0

    .line 331
    .line 332
    :goto_9
    const-class v9, Lhb/n;

    .line 333
    .line 334
    invoke-virtual {v13, v9}, Ljava/lang/reflect/AccessibleObject;->isAnnotationPresent(Ljava/lang/Class;)Z

    .line 335
    .line 336
    .line 337
    move-result v9

    .line 338
    if-eqz v9, :cond_11

    .line 339
    .line 340
    const/4 v12, 0x1

    .line 341
    invoke-virtual {v13, v12}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 342
    .line 343
    .line 344
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getGenericReturnType()Ljava/lang/reflect/Type;

    .line 345
    .line 346
    .line 347
    move-result-object v10

    .line 348
    sget-object v9, Lib/f;->a:Ljava/util/Set;

    .line 349
    .line 350
    invoke-interface {v13}, Ljava/lang/reflect/AnnotatedElement;->getAnnotations()[Ljava/lang/annotation/Annotation;

    .line 351
    .line 352
    .line 353
    move-result-object v9

    .line 354
    invoke-static {v9}, Lib/f;->e([Ljava/lang/annotation/Annotation;)Ljava/util/Set;

    .line 355
    .line 356
    .line 357
    move-result-object v11

    .line 358
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getGenericParameterTypes()[Ljava/lang/reflect/Type;

    .line 359
    .line 360
    .line 361
    move-result-object v9

    .line 362
    invoke-virtual {v13}, Ljava/lang/reflect/Method;->getParameterAnnotations()[[Ljava/lang/annotation/Annotation;

    .line 363
    .line 364
    .line 365
    move-result-object v14

    .line 366
    array-length v15, v9

    .line 367
    if-lt v15, v12, :cond_c

    .line 368
    .line 369
    aget-object v12, v9, v21

    .line 370
    .line 371
    const-class v15, Lhb/w;

    .line 372
    .line 373
    if-ne v12, v15, :cond_c

    .line 374
    .line 375
    if-eq v10, v7, :cond_c

    .line 376
    .line 377
    array-length v12, v9

    .line 378
    const/4 v15, 0x1

    .line 379
    :goto_a
    if-ge v15, v12, :cond_b

    .line 380
    .line 381
    move/from16 v26, v8

    .line 382
    .line 383
    aget-object v8, v9, v15

    .line 384
    .line 385
    move-object/from16 v16, v10

    .line 386
    .line 387
    instance-of v10, v8, Ljava/lang/reflect/ParameterizedType;

    .line 388
    .line 389
    if-nez v10, :cond_9

    .line 390
    .line 391
    goto :goto_b

    .line 392
    :cond_9
    check-cast v8, Ljava/lang/reflect/ParameterizedType;

    .line 393
    .line 394
    invoke-interface {v8}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    .line 395
    .line 396
    .line 397
    move-result-object v8

    .line 398
    if-eq v8, v1, :cond_a

    .line 399
    .line 400
    :goto_b
    move-object/from16 v10, v16

    .line 401
    .line 402
    goto :goto_c

    .line 403
    :cond_a
    const/16 v22, 0x1

    .line 404
    .line 405
    add-int/lit8 v15, v15, 0x1

    .line 406
    .line 407
    move-object/from16 v10, v16

    .line 408
    .line 409
    move/from16 v8, v26

    .line 410
    .line 411
    goto :goto_a

    .line 412
    :cond_b
    move/from16 v26, v8

    .line 413
    .line 414
    move-object/from16 v16, v10

    .line 415
    .line 416
    new-instance v1, Lhb/b;

    .line 417
    .line 418
    array-length v14, v9

    .line 419
    const/4 v15, 0x1

    .line 420
    move-object/from16 v10, v16

    .line 421
    .line 422
    const/16 v16, 0x1

    .line 423
    .line 424
    const/16 v17, 0x1

    .line 425
    .line 426
    move-object/from16 v12, p1

    .line 427
    .line 428
    move-object v9, v1

    .line 429
    invoke-direct/range {v9 .. v17}, Lhb/b;-><init>(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/Object;Ljava/lang/reflect/Method;IIZI)V

    .line 430
    .line 431
    .line 432
    goto :goto_f

    .line 433
    :cond_c
    move/from16 v26, v8

    .line 434
    .line 435
    :goto_c
    array-length v1, v9

    .line 436
    const/4 v12, 0x1

    .line 437
    if-ne v1, v12, :cond_10

    .line 438
    .line 439
    if-eq v10, v7, :cond_10

    .line 440
    .line 441
    aget-object v1, v14, v21

    .line 442
    .line 443
    invoke-static {v1}, Lib/f;->e([Ljava/lang/annotation/Annotation;)Ljava/util/Set;

    .line 444
    .line 445
    .line 446
    move-result-object v18

    .line 447
    aget-object v1, v14, v21

    .line 448
    .line 449
    array-length v6, v1

    .line 450
    move/from16 v7, v21

    .line 451
    .line 452
    :goto_d
    if-ge v7, v6, :cond_e

    .line 453
    .line 454
    aget-object v8, v1, v7

    .line 455
    .line 456
    invoke-interface {v8}, Ljava/lang/annotation/Annotation;->annotationType()Ljava/lang/Class;

    .line 457
    .line 458
    .line 459
    move-result-object v8

    .line 460
    invoke-virtual {v8}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 461
    .line 462
    .line 463
    move-result-object v8

    .line 464
    invoke-virtual {v8, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 465
    .line 466
    .line 467
    move-result v8

    .line 468
    if-eqz v8, :cond_d

    .line 469
    .line 470
    const/4 v15, 0x1

    .line 471
    goto :goto_e

    .line 472
    :cond_d
    const/16 v22, 0x1

    .line 473
    .line 474
    add-int/lit8 v7, v7, 0x1

    .line 475
    .line 476
    goto :goto_d

    .line 477
    :cond_e
    move/from16 v15, v21

    .line 478
    .line 479
    :goto_e
    new-instance v1, Lhb/c;

    .line 480
    .line 481
    array-length v14, v9

    .line 482
    const/16 v20, 0x1

    .line 483
    .line 484
    move-object/from16 v17, v10

    .line 485
    .line 486
    move-object/from16 v19, v11

    .line 487
    .line 488
    move-object/from16 v12, p1

    .line 489
    .line 490
    move-object/from16 v16, v9

    .line 491
    .line 492
    move-object v9, v1

    .line 493
    invoke-direct/range {v9 .. v20}, Lhb/c;-><init>(Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/lang/Object;Ljava/lang/reflect/Method;IZ[Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;Ljava/util/Set;Ljava/util/Set;I)V

    .line 494
    .line 495
    .line 496
    :goto_f
    iget-object v5, v1, Lhb/d;->a:Ljava/lang/reflect/Type;

    .line 497
    .line 498
    iget-object v6, v1, Lhb/d;->b:Ljava/util/Set;

    .line 499
    .line 500
    invoke-static {v3, v5, v6}, Lhb/e;->b(Ljava/util/ArrayList;Ljava/lang/reflect/Type;Ljava/util/Set;)Lhb/d;

    .line 501
    .line 502
    .line 503
    move-result-object v5

    .line 504
    if-nez v5, :cond_f

    .line 505
    .line 506
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 507
    .line 508
    .line 509
    :goto_10
    const/16 v22, 0x1

    .line 510
    .line 511
    goto :goto_11

    .line 512
    :cond_f
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 513
    .line 514
    new-instance v3, Ljava/lang/StringBuilder;

    .line 515
    .line 516
    const-string v6, "Conflicting @FromJson methods:\n    "

    .line 517
    .line 518
    invoke-direct {v3, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 519
    .line 520
    .line 521
    iget-object v5, v5, Lhb/d;->d:Ljava/lang/reflect/Method;

    .line 522
    .line 523
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 524
    .line 525
    .line 526
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 527
    .line 528
    .line 529
    iget-object v1, v1, Lhb/d;->d:Ljava/lang/reflect/Method;

    .line 530
    .line 531
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 532
    .line 533
    .line 534
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 535
    .line 536
    .line 537
    move-result-object v1

    .line 538
    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 539
    .line 540
    .line 541
    throw v2

    .line 542
    :cond_10
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 543
    .line 544
    new-instance v2, Ljava/lang/StringBuilder;

    .line 545
    .line 546
    invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 547
    .line 548
    .line 549
    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 550
    .line 551
    .line 552
    const-string v3, ".\n@FromJson method signatures may have one of the following structures:\n    <any access modifier> R fromJson(JsonReader jsonReader) throws <any>;\n    <any access modifier> R fromJson(JsonReader jsonReader, JsonAdapter<any> delegate, <any more delegates>) throws <any>;\n    <any access modifier> R fromJson(T value) throws <any>;\n"

    .line 553
    .line 554
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 555
    .line 556
    .line 557
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 558
    .line 559
    .line 560
    move-result-object v2

    .line 561
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 562
    .line 563
    .line 564
    throw v1

    .line 565
    :cond_11
    move/from16 v26, v8

    .line 566
    .line 567
    goto :goto_10

    .line 568
    :goto_11
    add-int/lit8 v8, v26, 0x1

    .line 569
    .line 570
    move-object/from16 v4, v23

    .line 571
    .line 572
    move-object/from16 v5, v24

    .line 573
    .line 574
    move/from16 v6, v25

    .line 575
    .line 576
    const/4 v1, 0x1

    .line 577
    goto/16 :goto_1

    .line 578
    .line 579
    :cond_12
    move-object/from16 v23, v4

    .line 580
    .line 581
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 582
    .line 583
    .line 584
    move-result-object v4

    .line 585
    const/4 v1, 0x1

    .line 586
    goto/16 :goto_0

    .line 587
    .line 588
    :cond_13
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 589
    .line 590
    .line 591
    move-result v1

    .line 592
    if-eqz v1, :cond_15

    .line 593
    .line 594
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 595
    .line 596
    .line 597
    move-result v1

    .line 598
    if-nez v1, :cond_14

    .line 599
    .line 600
    goto :goto_12

    .line 601
    :cond_14
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 602
    .line 603
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 604
    .line 605
    .line 606
    move-result-object v2

    .line 607
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 608
    .line 609
    .line 610
    move-result-object v2

    .line 611
    const-string v3, "Expected at least one @ToJson or @FromJson method on "

    .line 612
    .line 613
    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 614
    .line 615
    .line 616
    move-result-object v2

    .line 617
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 618
    .line 619
    .line 620
    throw v1

    .line 621
    :cond_15
    :goto_12
    new-instance v1, Lhb/e;

    .line 622
    .line 623
    invoke-direct {v1, v2, v3}, Lhb/e;-><init>(Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 624
    .line 625
    .line 626
    iget-object v2, v0, LI9/a;->a:Ljava/util/ArrayList;

    .line 627
    .line 628
    iget v3, v0, LI9/a;->b:I

    .line 629
    .line 630
    const/16 v22, 0x1

    .line 631
    .line 632
    add-int/lit8 v4, v3, 0x1

    .line 633
    .line 634
    iput v4, v0, LI9/a;->b:I

    .line 635
    .line 636
    invoke-virtual {v2, v3, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 637
    .line 638
    .line 639
    return-void
.end method

.method public declared-synchronized b()Ljava/util/List;
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    iget-object v1, p0, LI9/a;->a:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    monitor-exit p0

    .line 14
    return-object v0

    .line 15
    :catchall_0
    move-exception v0

    .line 16
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 17
    throw v0
.end method

.method public declared-synchronized c(Ljava/util/List;)Z
    .locals 3

    .line 1
    const-string v0, "Ignored 0 entries when adding rollout assignments. Maximum allowable: "

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-object v1, p0, LI9/a;->a:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 7
    .line 8
    .line 9
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    iget v2, p0, LI9/a;->b:I

    .line 14
    .line 15
    if-le v1, v2, :cond_0

    .line 16
    .line 17
    new-instance v1, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    iget v0, p0, LI9/a;->b:I

    .line 23
    .line 24
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    const-string v1, "FirebaseCrashlytics"

    .line 32
    .line 33
    const/4 v2, 0x0

    .line 34
    invoke-static {v1, v0, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 35
    .line 36
    .line 37
    iget v0, p0, LI9/a;->b:I

    .line 38
    .line 39
    const/4 v1, 0x0

    .line 40
    invoke-interface {p1, v1, v0}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    iget-object v0, p0, LI9/a;->a:Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 47
    .line 48
    .line 49
    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    monitor-exit p0

    .line 51
    return p1

    .line 52
    :catchall_0
    move-exception p1

    .line 53
    goto :goto_0

    .line 54
    :cond_0
    :try_start_1
    iget-object v0, p0, LI9/a;->a:Ljava/util/ArrayList;

    .line 55
    .line 56
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 57
    .line 58
    .line 59
    move-result p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 60
    monitor-exit p0

    .line 61
    return p1

    .line 62
    :goto_0
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 63
    throw p1
.end method
