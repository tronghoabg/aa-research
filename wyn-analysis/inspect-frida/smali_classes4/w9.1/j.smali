.class public abstract Lw9/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lj$/util/concurrent/ConcurrentHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lj$/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Lj$/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lw9/j;->a:Lj$/util/concurrent/ConcurrentHashMap;

    .line 7
    .line 8
    return-void
.end method

.method public static a(Ljava/lang/String;Z)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    .line 5
    .line 6
    const-string v0, "Hard assert failed: "

    .line 7
    .line 8
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    throw p1
.end method

.method public static b(Ljava/lang/Object;Lw9/i;)Ljava/lang/Object;
    .locals 9

    .line 1
    const/16 v0, 0x1f4

    .line 2
    .line 3
    iget v1, p1, Lw9/i;->a:I

    .line 4
    .line 5
    if-gt v1, v0, :cond_1b

    .line 6
    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    return-object p0

    .line 11
    :cond_0
    instance-of v0, p0, Ljava/lang/Number;

    .line 12
    .line 13
    if-eqz v0, :cond_3

    .line 14
    .line 15
    instance-of v0, p0, Ljava/lang/Long;

    .line 16
    .line 17
    if-nez v0, :cond_2

    .line 18
    .line 19
    instance-of v0, p0, Ljava/lang/Integer;

    .line 20
    .line 21
    if-nez v0, :cond_2

    .line 22
    .line 23
    instance-of v0, p0, Ljava/lang/Double;

    .line 24
    .line 25
    if-nez v0, :cond_2

    .line 26
    .line 27
    instance-of v0, p0, Ljava/lang/Float;

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    return-object p0

    .line 32
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    new-instance v0, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    const-string v1, "Numbers of type "

    .line 43
    .line 44
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string p0, " are not supported, please use an int, long, float or double"

    .line 51
    .line 52
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-static {p1, p0}, Lw9/j;->c(Lw9/i;Ljava/lang/String;)Ljava/lang/IllegalArgumentException;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    throw p0

    .line 64
    :cond_2
    return-object p0

    .line 65
    :cond_3
    instance-of v0, p0, Ljava/lang/String;

    .line 66
    .line 67
    if-eqz v0, :cond_4

    .line 68
    .line 69
    return-object p0

    .line 70
    :cond_4
    instance-of v0, p0, Ljava/lang/Boolean;

    .line 71
    .line 72
    if-eqz v0, :cond_5

    .line 73
    .line 74
    return-object p0

    .line 75
    :cond_5
    instance-of v0, p0, Ljava/lang/Character;

    .line 76
    .line 77
    if-nez v0, :cond_1a

    .line 78
    .line 79
    instance-of v0, p0, Ljava/util/Map;

    .line 80
    .line 81
    if-eqz v0, :cond_8

    .line 82
    .line 83
    new-instance v0, Ljava/util/HashMap;

    .line 84
    .line 85
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 86
    .line 87
    .line 88
    check-cast p0, Ljava/util/Map;

    .line 89
    .line 90
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 99
    .line 100
    .line 101
    move-result v2

    .line 102
    if-eqz v2, :cond_7

    .line 103
    .line 104
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    check-cast v2, Ljava/util/Map$Entry;

    .line 109
    .line 110
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    instance-of v4, v3, Ljava/lang/String;

    .line 115
    .line 116
    if-eqz v4, :cond_6

    .line 117
    .line 118
    check-cast v3, Ljava/lang/String;

    .line 119
    .line 120
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    new-instance v4, Lw9/i;

    .line 125
    .line 126
    add-int/lit8 v5, v1, 0x1

    .line 127
    .line 128
    invoke-direct {v4, p1, v3, v5}, Lw9/i;-><init>(Lw9/i;Ljava/lang/String;I)V

    .line 129
    .line 130
    .line 131
    invoke-static {v2, v4}, Lw9/j;->b(Ljava/lang/Object;Lw9/i;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    goto :goto_0

    .line 139
    :cond_6
    const-string p0, "Maps with non-string keys are not supported"

    .line 140
    .line 141
    invoke-static {p1, p0}, Lw9/j;->c(Lw9/i;Ljava/lang/String;)Ljava/lang/IllegalArgumentException;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    throw p0

    .line 146
    :cond_7
    return-object v0

    .line 147
    :cond_8
    instance-of v0, p0, Ljava/util/Collection;

    .line 148
    .line 149
    const/4 v2, 0x0

    .line 150
    if-eqz v0, :cond_b

    .line 151
    .line 152
    instance-of v0, p0, Ljava/util/List;

    .line 153
    .line 154
    if-eqz v0, :cond_a

    .line 155
    .line 156
    check-cast p0, Ljava/util/List;

    .line 157
    .line 158
    new-instance v0, Ljava/util/ArrayList;

    .line 159
    .line 160
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 161
    .line 162
    .line 163
    move-result v3

    .line 164
    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 165
    .line 166
    .line 167
    :goto_1
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 168
    .line 169
    .line 170
    move-result v3

    .line 171
    if-ge v2, v3, :cond_9

    .line 172
    .line 173
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v3

    .line 177
    const-string v4, "["

    .line 178
    .line 179
    const-string v5, "]"

    .line 180
    .line 181
    invoke-static {v2, v4, v5}, LA7/p0;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v4

    .line 185
    new-instance v5, Lw9/i;

    .line 186
    .line 187
    add-int/lit8 v6, v1, 0x1

    .line 188
    .line 189
    invoke-direct {v5, p1, v4, v6}, Lw9/i;-><init>(Lw9/i;Ljava/lang/String;I)V

    .line 190
    .line 191
    .line 192
    invoke-static {v3, v5}, Lw9/j;->b(Ljava/lang/Object;Lw9/i;)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v3

    .line 196
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 197
    .line 198
    .line 199
    add-int/lit8 v2, v2, 0x1

    .line 200
    .line 201
    goto :goto_1

    .line 202
    :cond_9
    return-object v0

    .line 203
    :cond_a
    const-string p0, "Serializing Collections is not supported, please use Lists instead"

    .line 204
    .line 205
    invoke-static {p1, p0}, Lw9/j;->c(Lw9/i;Ljava/lang/String;)Ljava/lang/IllegalArgumentException;

    .line 206
    .line 207
    .line 208
    move-result-object p0

    .line 209
    throw p0

    .line 210
    :cond_b
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    .line 215
    .line 216
    .line 217
    move-result v0

    .line 218
    if-nez v0, :cond_19

    .line 219
    .line 220
    instance-of v0, p0, Ljava/lang/Enum;

    .line 221
    .line 222
    if-eqz v0, :cond_d

    .line 223
    .line 224
    move-object p1, p0

    .line 225
    check-cast p1, Ljava/lang/Enum;

    .line 226
    .line 227
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object p1

    .line 231
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 232
    .line 233
    .line 234
    move-result-object p0

    .line 235
    invoke-virtual {p0, p1}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 236
    .line 237
    .line 238
    move-result-object p0

    .line 239
    invoke-static {p0}, Lw9/h;->b(Ljava/lang/reflect/AccessibleObject;)Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    if-eqz v0, :cond_c

    .line 244
    .line 245
    return-object v0

    .line 246
    :cond_c
    invoke-virtual {p0}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    .line 250
    return-object p0

    .line 251
    :catch_0
    return-object p1

    .line 252
    :cond_d
    instance-of v0, p0, Ljava/util/Date;

    .line 253
    .line 254
    if-nez v0, :cond_18

    .line 255
    .line 256
    instance-of v0, p0, Ls8/q;

    .line 257
    .line 258
    if-nez v0, :cond_18

    .line 259
    .line 260
    instance-of v0, p0, Lm9/J;

    .line 261
    .line 262
    if-nez v0, :cond_18

    .line 263
    .line 264
    instance-of v0, p0, Lm9/g;

    .line 265
    .line 266
    if-nez v0, :cond_18

    .line 267
    .line 268
    instance-of v0, p0, Lm9/m;

    .line 269
    .line 270
    if-nez v0, :cond_18

    .line 271
    .line 272
    instance-of v0, p0, Lm9/x;

    .line 273
    .line 274
    if-nez v0, :cond_18

    .line 275
    .line 276
    instance-of v0, p0, Lm9/g0;

    .line 277
    .line 278
    if-eqz v0, :cond_e

    .line 279
    .line 280
    return-object p0

    .line 281
    :cond_e
    instance-of v0, p0, Landroid/net/Uri;

    .line 282
    .line 283
    if-nez v0, :cond_17

    .line 284
    .line 285
    instance-of v0, p0, Ljava/net/URI;

    .line 286
    .line 287
    if-nez v0, :cond_17

    .line 288
    .line 289
    instance-of v0, p0, Ljava/net/URL;

    .line 290
    .line 291
    if-eqz v0, :cond_f

    .line 292
    .line 293
    goto/16 :goto_5

    .line 294
    .line 295
    :cond_f
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 296
    .line 297
    .line 298
    move-result-object v0

    .line 299
    sget-object v3, Lw9/j;->a:Lj$/util/concurrent/ConcurrentHashMap;

    .line 300
    .line 301
    invoke-virtual {v3, v0}, Lj$/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move-result-object v4

    .line 305
    check-cast v4, Lw9/h;

    .line 306
    .line 307
    if-nez v4, :cond_10

    .line 308
    .line 309
    new-instance v4, Lw9/h;

    .line 310
    .line 311
    invoke-direct {v4, v0}, Lw9/h;-><init>(Ljava/lang/Class;)V

    .line 312
    .line 313
    .line 314
    invoke-virtual {v3, v0, v4}, Lj$/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    :cond_10
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 318
    .line 319
    .line 320
    move-result-object v0

    .line 321
    iget-object v3, v4, Lw9/h;->a:Ljava/lang/Class;

    .line 322
    .line 323
    invoke-virtual {v3, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 324
    .line 325
    .line 326
    move-result v0

    .line 327
    if-eqz v0, :cond_16

    .line 328
    .line 329
    new-instance v0, Ljava/util/HashMap;

    .line 330
    .line 331
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 332
    .line 333
    .line 334
    iget-object v3, v4, Lw9/h;->b:Ljava/util/HashMap;

    .line 335
    .line 336
    invoke-virtual {v3}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 337
    .line 338
    .line 339
    move-result-object v3

    .line 340
    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 341
    .line 342
    .line 343
    move-result-object v3

    .line 344
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 345
    .line 346
    .line 347
    move-result v5

    .line 348
    if-eqz v5, :cond_15

    .line 349
    .line 350
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 351
    .line 352
    .line 353
    move-result-object v5

    .line 354
    check-cast v5, Ljava/lang/String;

    .line 355
    .line 356
    iget-object v6, v4, Lw9/h;->g:Ljava/util/HashSet;

    .line 357
    .line 358
    invoke-virtual {v6, v5}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 359
    .line 360
    .line 361
    move-result v6

    .line 362
    if-eqz v6, :cond_11

    .line 363
    .line 364
    goto :goto_2

    .line 365
    :cond_11
    iget-object v6, v4, Lw9/h;->c:Ljava/util/HashMap;

    .line 366
    .line 367
    invoke-virtual {v6, v5}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 368
    .line 369
    .line 370
    move-result v7

    .line 371
    if-eqz v7, :cond_12

    .line 372
    .line 373
    invoke-virtual {v6, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 374
    .line 375
    .line 376
    move-result-object v6

    .line 377
    check-cast v6, Ljava/lang/reflect/Method;

    .line 378
    .line 379
    new-array v7, v2, [Ljava/lang/Object;

    .line 380
    .line 381
    :try_start_1
    invoke-virtual {v6, p0, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object v6
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_1

    .line 385
    goto :goto_3

    .line 386
    :catch_1
    move-exception p0

    .line 387
    new-instance p1, Ljava/lang/RuntimeException;

    .line 388
    .line 389
    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 390
    .line 391
    .line 392
    throw p1

    .line 393
    :catch_2
    move-exception p0

    .line 394
    new-instance p1, Ljava/lang/RuntimeException;

    .line 395
    .line 396
    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 397
    .line 398
    .line 399
    throw p1

    .line 400
    :cond_12
    iget-object v6, v4, Lw9/h;->e:Ljava/util/HashMap;

    .line 401
    .line 402
    invoke-virtual {v6, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 403
    .line 404
    .line 405
    move-result-object v6

    .line 406
    check-cast v6, Ljava/lang/reflect/Field;

    .line 407
    .line 408
    if-eqz v6, :cond_14

    .line 409
    .line 410
    :try_start_2
    invoke-virtual {v6, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 411
    .line 412
    .line 413
    move-result-object v6
    :try_end_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_2 .. :try_end_2} :catch_3

    .line 414
    :goto_3
    iget-object v7, v4, Lw9/h;->f:Ljava/util/HashSet;

    .line 415
    .line 416
    invoke-virtual {v7, v5}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 417
    .line 418
    .line 419
    move-result v7

    .line 420
    if-eqz v7, :cond_13

    .line 421
    .line 422
    if-nez v6, :cond_13

    .line 423
    .line 424
    sget-object v6, Lm9/x;->b:Lm9/w;

    .line 425
    .line 426
    goto :goto_4

    .line 427
    :cond_13
    new-instance v7, Lw9/i;

    .line 428
    .line 429
    add-int/lit8 v8, v1, 0x1

    .line 430
    .line 431
    invoke-direct {v7, p1, v5, v8}, Lw9/i;-><init>(Lw9/i;Ljava/lang/String;I)V

    .line 432
    .line 433
    .line 434
    invoke-static {v6, v7}, Lw9/j;->b(Ljava/lang/Object;Lw9/i;)Ljava/lang/Object;

    .line 435
    .line 436
    .line 437
    move-result-object v6

    .line 438
    :goto_4
    invoke-virtual {v0, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 439
    .line 440
    .line 441
    goto :goto_2

    .line 442
    :catch_3
    move-exception p0

    .line 443
    new-instance p1, Ljava/lang/RuntimeException;

    .line 444
    .line 445
    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 446
    .line 447
    .line 448
    throw p1

    .line 449
    :cond_14
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 450
    .line 451
    const-string p1, "Bean property without field or getter: "

    .line 452
    .line 453
    invoke-static {p1, v5}, LR8/v;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 454
    .line 455
    .line 456
    move-result-object p1

    .line 457
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 458
    .line 459
    .line 460
    throw p0

    .line 461
    :cond_15
    return-object v0

    .line 462
    :cond_16
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 463
    .line 464
    new-instance v0, Ljava/lang/StringBuilder;

    .line 465
    .line 466
    const-string v1, "Can\'t serialize object of class "

    .line 467
    .line 468
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 469
    .line 470
    .line 471
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 472
    .line 473
    .line 474
    move-result-object p0

    .line 475
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 476
    .line 477
    .line 478
    const-string p0, " with BeanMapper for class "

    .line 479
    .line 480
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 481
    .line 482
    .line 483
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 484
    .line 485
    .line 486
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 487
    .line 488
    .line 489
    move-result-object p0

    .line 490
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 491
    .line 492
    .line 493
    throw p1

    .line 494
    :cond_17
    :goto_5
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 495
    .line 496
    .line 497
    move-result-object p0

    .line 498
    :cond_18
    return-object p0

    .line 499
    :cond_19
    const-string p0, "Serializing Arrays is not supported, please use Lists instead"

    .line 500
    .line 501
    invoke-static {p1, p0}, Lw9/j;->c(Lw9/i;Ljava/lang/String;)Ljava/lang/IllegalArgumentException;

    .line 502
    .line 503
    .line 504
    move-result-object p0

    .line 505
    throw p0

    .line 506
    :cond_1a
    const-string p0, "Characters are not supported, please use Strings"

    .line 507
    .line 508
    invoke-static {p1, p0}, Lw9/j;->c(Lw9/i;Ljava/lang/String;)Ljava/lang/IllegalArgumentException;

    .line 509
    .line 510
    .line 511
    move-result-object p0

    .line 512
    throw p0

    .line 513
    :cond_1b
    const-string p0, "Exceeded maximum depth of 500, which likely indicates there\'s an object cycle"

    .line 514
    .line 515
    invoke-static {p1, p0}, Lw9/j;->c(Lw9/i;Ljava/lang/String;)Ljava/lang/IllegalArgumentException;

    .line 516
    .line 517
    .line 518
    move-result-object p0

    .line 519
    throw p0
.end method

.method public static c(Lw9/i;Ljava/lang/String;)Ljava/lang/IllegalArgumentException;
    .locals 1

    .line 1
    const-string v0, "Could not serialize object. "

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget v0, p0, Lw9/i;->a:I

    .line 8
    .line 9
    if-lez v0, :cond_0

    .line 10
    .line 11
    const-string v0, " (found in field \'"

    .line 12
    .line 13
    invoke-static {p1, v0}, LA7/p0;->q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p0}, Lw9/i;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string p0, "\')"

    .line 25
    .line 26
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 34
    .line 35
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    return-object p0
.end method
