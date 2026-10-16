.class public abstract Landroidx/datastore/preferences/protobuf/s0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/logging/Logger;

.field public static final b:Lsun/misc/Unsafe;

.field public static final c:Ljava/lang/Class;

.field public static final d:Landroidx/datastore/preferences/protobuf/r0;

.field public static final e:Z

.field public static final f:Z

.field public static final g:J

.field public static final h:Z


# direct methods
.method static constructor <clinit>()V
    .locals 21

    .line 1
    const/4 v3, 0x0

    .line 2
    const/4 v4, 0x1

    .line 3
    const-class v0, Landroidx/datastore/preferences/protobuf/s0;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sput-object v0, Landroidx/datastore/preferences/protobuf/s0;->a:Ljava/util/logging/Logger;

    .line 14
    .line 15
    invoke-static {}, Landroidx/datastore/preferences/protobuf/s0;->i()Lsun/misc/Unsafe;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sput-object v0, Landroidx/datastore/preferences/protobuf/s0;->b:Lsun/misc/Unsafe;

    .line 20
    .line 21
    sget-object v5, Landroidx/datastore/preferences/protobuf/c;->a:Ljava/lang/Class;

    .line 22
    .line 23
    sput-object v5, Landroidx/datastore/preferences/protobuf/s0;->c:Ljava/lang/Class;

    .line 24
    .line 25
    sget-object v5, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 26
    .line 27
    invoke-static {v5}, Landroidx/datastore/preferences/protobuf/s0;->e(Ljava/lang/Class;)Z

    .line 28
    .line 29
    .line 30
    move-result v6

    .line 31
    sget-object v7, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 32
    .line 33
    invoke-static {v7}, Landroidx/datastore/preferences/protobuf/s0;->e(Ljava/lang/Class;)Z

    .line 34
    .line 35
    .line 36
    move-result v8

    .line 37
    const/4 v9, 0x0

    .line 38
    if-nez v0, :cond_0

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    invoke-static {}, Landroidx/datastore/preferences/protobuf/c;->a()Z

    .line 42
    .line 43
    .line 44
    move-result v10

    .line 45
    if-eqz v10, :cond_2

    .line 46
    .line 47
    if-eqz v6, :cond_1

    .line 48
    .line 49
    new-instance v9, Landroidx/datastore/preferences/protobuf/p0;

    .line 50
    .line 51
    invoke-direct {v9, v0, v4}, Landroidx/datastore/preferences/protobuf/p0;-><init>(Lsun/misc/Unsafe;I)V

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    if-eqz v8, :cond_3

    .line 56
    .line 57
    new-instance v9, Landroidx/datastore/preferences/protobuf/p0;

    .line 58
    .line 59
    invoke-direct {v9, v0, v3}, Landroidx/datastore/preferences/protobuf/p0;-><init>(Lsun/misc/Unsafe;I)V

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_2
    new-instance v9, Landroidx/datastore/preferences/protobuf/q0;

    .line 64
    .line 65
    invoke-direct {v9, v0}, Landroidx/datastore/preferences/protobuf/r0;-><init>(Lsun/misc/Unsafe;)V

    .line 66
    .line 67
    .line 68
    :cond_3
    :goto_0
    sput-object v9, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 69
    .line 70
    const-string v6, "copyMemory"

    .line 71
    .line 72
    const-string v8, "platform method missing - proto runtime falling back to safer methods: "

    .line 73
    .line 74
    const-string v9, "putLong"

    .line 75
    .line 76
    const-string v10, "putInt"

    .line 77
    .line 78
    const-string v11, "getInt"

    .line 79
    .line 80
    sget-object v12, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 81
    .line 82
    const-string v13, "putByte"

    .line 83
    .line 84
    const-string v14, "getByte"

    .line 85
    .line 86
    const-class v15, Ljava/lang/reflect/Field;

    .line 87
    .line 88
    move/from16 v16, v3

    .line 89
    .line 90
    const-string v3, "objectFieldOffset"

    .line 91
    .line 92
    const-class v17, Ljava/lang/Object;

    .line 93
    .line 94
    const-string v1, "getLong"

    .line 95
    .line 96
    if-nez v0, :cond_4

    .line 97
    .line 98
    :goto_1
    move/from16 v0, v16

    .line 99
    .line 100
    goto/16 :goto_2

    .line 101
    .line 102
    :cond_4
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    new-array v2, v4, [Ljava/lang/Class;

    .line 107
    .line 108
    aput-object v15, v2, v16

    .line 109
    .line 110
    invoke-virtual {v0, v3, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 111
    .line 112
    .line 113
    move/from16 v20, v4

    .line 114
    .line 115
    const/4 v2, 0x2

    .line 116
    new-array v4, v2, [Ljava/lang/Class;

    .line 117
    .line 118
    aput-object v17, v4, v16

    .line 119
    .line 120
    aput-object v5, v4, v20

    .line 121
    .line 122
    invoke-virtual {v0, v1, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 123
    .line 124
    .line 125
    invoke-static {}, Landroidx/datastore/preferences/protobuf/s0;->d()Ljava/lang/reflect/Field;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    if-nez v2, :cond_5

    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_5
    invoke-static {}, Landroidx/datastore/preferences/protobuf/c;->a()Z

    .line 133
    .line 134
    .line 135
    move-result v2

    .line 136
    if-eqz v2, :cond_6

    .line 137
    .line 138
    move/from16 v0, v20

    .line 139
    .line 140
    goto/16 :goto_2

    .line 141
    .line 142
    :cond_6
    move/from16 v2, v20

    .line 143
    .line 144
    new-array v4, v2, [Ljava/lang/Class;

    .line 145
    .line 146
    aput-object v5, v4, v16

    .line 147
    .line 148
    invoke-virtual {v0, v14, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 149
    .line 150
    .line 151
    move/from16 v20, v2

    .line 152
    .line 153
    const/4 v4, 0x2

    .line 154
    new-array v2, v4, [Ljava/lang/Class;

    .line 155
    .line 156
    aput-object v5, v2, v16

    .line 157
    .line 158
    aput-object v12, v2, v20

    .line 159
    .line 160
    invoke-virtual {v0, v13, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 161
    .line 162
    .line 163
    move/from16 v2, v20

    .line 164
    .line 165
    new-array v4, v2, [Ljava/lang/Class;

    .line 166
    .line 167
    aput-object v5, v4, v16

    .line 168
    .line 169
    invoke-virtual {v0, v11, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 170
    .line 171
    .line 172
    move/from16 v20, v2

    .line 173
    .line 174
    const/4 v4, 0x2

    .line 175
    new-array v2, v4, [Ljava/lang/Class;

    .line 176
    .line 177
    aput-object v5, v2, v16

    .line 178
    .line 179
    aput-object v7, v2, v20

    .line 180
    .line 181
    invoke-virtual {v0, v10, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 182
    .line 183
    .line 184
    move/from16 v2, v20

    .line 185
    .line 186
    new-array v4, v2, [Ljava/lang/Class;

    .line 187
    .line 188
    aput-object v5, v4, v16

    .line 189
    .line 190
    invoke-virtual {v0, v1, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 191
    .line 192
    .line 193
    move/from16 v20, v2

    .line 194
    .line 195
    const/4 v4, 0x2

    .line 196
    new-array v2, v4, [Ljava/lang/Class;

    .line 197
    .line 198
    aput-object v5, v2, v16

    .line 199
    .line 200
    aput-object v5, v2, v20

    .line 201
    .line 202
    invoke-virtual {v0, v9, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 203
    .line 204
    .line 205
    const/4 v2, 0x3

    .line 206
    new-array v4, v2, [Ljava/lang/Class;

    .line 207
    .line 208
    aput-object v5, v4, v16

    .line 209
    .line 210
    aput-object v5, v4, v20

    .line 211
    .line 212
    const/16 v19, 0x2

    .line 213
    .line 214
    aput-object v5, v4, v19

    .line 215
    .line 216
    invoke-virtual {v0, v6, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 217
    .line 218
    .line 219
    const/4 v2, 0x5

    .line 220
    new-array v2, v2, [Ljava/lang/Class;

    .line 221
    .line 222
    aput-object v17, v2, v16

    .line 223
    .line 224
    aput-object v5, v2, v20

    .line 225
    .line 226
    aput-object v17, v2, v19

    .line 227
    .line 228
    const/16 v18, 0x3

    .line 229
    .line 230
    aput-object v5, v2, v18

    .line 231
    .line 232
    const/4 v4, 0x4

    .line 233
    aput-object v5, v2, v4

    .line 234
    .line 235
    invoke-virtual {v0, v6, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 236
    .line 237
    .line 238
    const/4 v0, 0x1

    .line 239
    goto :goto_2

    .line 240
    :catchall_0
    move-exception v0

    .line 241
    sget-object v2, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    .line 242
    .line 243
    new-instance v4, Ljava/lang/StringBuilder;

    .line 244
    .line 245
    invoke-direct {v4, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 249
    .line 250
    .line 251
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    sget-object v4, Landroidx/datastore/preferences/protobuf/s0;->a:Ljava/util/logging/Logger;

    .line 256
    .line 257
    invoke-virtual {v4, v2, v0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    .line 258
    .line 259
    .line 260
    goto/16 :goto_1

    .line 261
    .line 262
    :goto_2
    sput-boolean v0, Landroidx/datastore/preferences/protobuf/s0;->e:Z

    .line 263
    .line 264
    const-class v0, Ljava/lang/Class;

    .line 265
    .line 266
    sget-object v2, Landroidx/datastore/preferences/protobuf/s0;->b:Lsun/misc/Unsafe;

    .line 267
    .line 268
    if-nez v2, :cond_7

    .line 269
    .line 270
    move/from16 v2, v16

    .line 271
    .line 272
    :goto_3
    const/16 v20, 0x1

    .line 273
    .line 274
    goto/16 :goto_5

    .line 275
    .line 276
    :cond_7
    :try_start_1
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 277
    .line 278
    .line 279
    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 280
    const/4 v4, 0x1

    .line 281
    :try_start_2
    new-array v6, v4, [Ljava/lang/Class;

    .line 282
    .line 283
    aput-object v15, v6, v16

    .line 284
    .line 285
    invoke-virtual {v2, v3, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 286
    .line 287
    .line 288
    const-string v3, "arrayBaseOffset"

    .line 289
    .line 290
    new-array v6, v4, [Ljava/lang/Class;

    .line 291
    .line 292
    aput-object v0, v6, v16

    .line 293
    .line 294
    invoke-virtual {v2, v3, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 295
    .line 296
    .line 297
    const-string v3, "arrayIndexScale"

    .line 298
    .line 299
    new-array v6, v4, [Ljava/lang/Class;

    .line 300
    .line 301
    aput-object v0, v6, v16

    .line 302
    .line 303
    invoke-virtual {v2, v3, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 304
    .line 305
    .line 306
    const/4 v3, 0x2

    .line 307
    new-array v0, v3, [Ljava/lang/Class;

    .line 308
    .line 309
    aput-object v17, v0, v16

    .line 310
    .line 311
    aput-object v5, v0, v4

    .line 312
    .line 313
    invoke-virtual {v2, v11, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 314
    .line 315
    .line 316
    const/4 v3, 0x3

    .line 317
    new-array v0, v3, [Ljava/lang/Class;

    .line 318
    .line 319
    aput-object v17, v0, v16

    .line 320
    .line 321
    aput-object v5, v0, v4

    .line 322
    .line 323
    const/4 v3, 0x2

    .line 324
    aput-object v7, v0, v3

    .line 325
    .line 326
    invoke-virtual {v2, v10, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 327
    .line 328
    .line 329
    new-array v0, v3, [Ljava/lang/Class;

    .line 330
    .line 331
    aput-object v17, v0, v16

    .line 332
    .line 333
    aput-object v5, v0, v4

    .line 334
    .line 335
    invoke-virtual {v2, v1, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 336
    .line 337
    .line 338
    const/4 v3, 0x3

    .line 339
    new-array v0, v3, [Ljava/lang/Class;

    .line 340
    .line 341
    aput-object v17, v0, v16

    .line 342
    .line 343
    aput-object v5, v0, v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 344
    .line 345
    const/4 v4, 0x2

    .line 346
    :try_start_3
    aput-object v5, v0, v4

    .line 347
    .line 348
    invoke-virtual {v2, v9, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 349
    .line 350
    .line 351
    const-string v0, "getObject"

    .line 352
    .line 353
    new-array v1, v4, [Ljava/lang/Class;

    .line 354
    .line 355
    aput-object v17, v1, v16
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 356
    .line 357
    const/16 v20, 0x1

    .line 358
    .line 359
    :try_start_4
    aput-object v5, v1, v20

    .line 360
    .line 361
    invoke-virtual {v2, v0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 362
    .line 363
    .line 364
    const-string v0, "putObject"

    .line 365
    .line 366
    const/4 v3, 0x3

    .line 367
    new-array v1, v3, [Ljava/lang/Class;

    .line 368
    .line 369
    aput-object v17, v1, v16

    .line 370
    .line 371
    aput-object v5, v1, v20
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 372
    .line 373
    const/4 v4, 0x2

    .line 374
    :try_start_5
    aput-object v17, v1, v4

    .line 375
    .line 376
    invoke-virtual {v2, v0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 377
    .line 378
    .line 379
    invoke-static {}, Landroidx/datastore/preferences/protobuf/c;->a()Z

    .line 380
    .line 381
    .line 382
    move-result v0

    .line 383
    if-eqz v0, :cond_8

    .line 384
    .line 385
    const/4 v2, 0x1

    .line 386
    goto :goto_3

    .line 387
    :cond_8
    new-array v0, v4, [Ljava/lang/Class;

    .line 388
    .line 389
    aput-object v17, v0, v16
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 390
    .line 391
    const/16 v20, 0x1

    .line 392
    .line 393
    :try_start_6
    aput-object v5, v0, v20

    .line 394
    .line 395
    invoke-virtual {v2, v14, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 396
    .line 397
    .line 398
    const/4 v3, 0x3

    .line 399
    new-array v0, v3, [Ljava/lang/Class;

    .line 400
    .line 401
    aput-object v17, v0, v16

    .line 402
    .line 403
    aput-object v5, v0, v20
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 404
    .line 405
    const/4 v4, 0x2

    .line 406
    :try_start_7
    aput-object v12, v0, v4

    .line 407
    .line 408
    invoke-virtual {v2, v13, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 409
    .line 410
    .line 411
    const-string v0, "getBoolean"

    .line 412
    .line 413
    new-array v1, v4, [Ljava/lang/Class;

    .line 414
    .line 415
    aput-object v17, v1, v16
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 416
    .line 417
    const/16 v20, 0x1

    .line 418
    .line 419
    :try_start_8
    aput-object v5, v1, v20

    .line 420
    .line 421
    invoke-virtual {v2, v0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 422
    .line 423
    .line 424
    const-string v0, "putBoolean"

    .line 425
    .line 426
    const/4 v3, 0x3

    .line 427
    new-array v1, v3, [Ljava/lang/Class;

    .line 428
    .line 429
    aput-object v17, v1, v16

    .line 430
    .line 431
    aput-object v5, v1, v20
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 432
    .line 433
    :try_start_9
    sget-object v3, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 434
    .line 435
    const/4 v4, 0x2

    .line 436
    aput-object v3, v1, v4

    .line 437
    .line 438
    invoke-virtual {v2, v0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 439
    .line 440
    .line 441
    const-string v0, "getFloat"

    .line 442
    .line 443
    new-array v1, v4, [Ljava/lang/Class;

    .line 444
    .line 445
    aput-object v17, v1, v16
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 446
    .line 447
    const/16 v20, 0x1

    .line 448
    .line 449
    :try_start_a
    aput-object v5, v1, v20

    .line 450
    .line 451
    invoke-virtual {v2, v0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 452
    .line 453
    .line 454
    const-string v0, "putFloat"

    .line 455
    .line 456
    const/4 v3, 0x3

    .line 457
    new-array v1, v3, [Ljava/lang/Class;

    .line 458
    .line 459
    aput-object v17, v1, v16

    .line 460
    .line 461
    aput-object v5, v1, v20
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    .line 462
    .line 463
    :try_start_b
    sget-object v3, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 464
    .line 465
    const/4 v4, 0x2

    .line 466
    aput-object v3, v1, v4

    .line 467
    .line 468
    invoke-virtual {v2, v0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 469
    .line 470
    .line 471
    const-string v0, "getDouble"

    .line 472
    .line 473
    new-array v1, v4, [Ljava/lang/Class;

    .line 474
    .line 475
    aput-object v17, v1, v16
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    .line 476
    .line 477
    const/16 v20, 0x1

    .line 478
    .line 479
    :try_start_c
    aput-object v5, v1, v20

    .line 480
    .line 481
    invoke-virtual {v2, v0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 482
    .line 483
    .line 484
    const-string v0, "putDouble"

    .line 485
    .line 486
    const/4 v3, 0x3

    .line 487
    new-array v1, v3, [Ljava/lang/Class;

    .line 488
    .line 489
    aput-object v17, v1, v16

    .line 490
    .line 491
    aput-object v5, v1, v20

    .line 492
    .line 493
    sget-object v3, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 494
    .line 495
    const/16 v19, 0x2

    .line 496
    .line 497
    aput-object v3, v1, v19

    .line 498
    .line 499
    invoke-virtual {v2, v0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_1

    .line 500
    .line 501
    .line 502
    move/from16 v2, v20

    .line 503
    .line 504
    goto :goto_5

    .line 505
    :catchall_1
    move-exception v0

    .line 506
    goto :goto_4

    .line 507
    :catchall_2
    move-exception v0

    .line 508
    const/16 v20, 0x1

    .line 509
    .line 510
    goto :goto_4

    .line 511
    :catchall_3
    move-exception v0

    .line 512
    move/from16 v20, v4

    .line 513
    .line 514
    :goto_4
    sget-object v1, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    .line 515
    .line 516
    new-instance v2, Ljava/lang/StringBuilder;

    .line 517
    .line 518
    invoke-direct {v2, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 519
    .line 520
    .line 521
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 522
    .line 523
    .line 524
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 525
    .line 526
    .line 527
    move-result-object v0

    .line 528
    sget-object v2, Landroidx/datastore/preferences/protobuf/s0;->a:Ljava/util/logging/Logger;

    .line 529
    .line 530
    invoke-virtual {v2, v1, v0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    .line 531
    .line 532
    .line 533
    move/from16 v2, v16

    .line 534
    .line 535
    :goto_5
    sput-boolean v2, Landroidx/datastore/preferences/protobuf/s0;->f:Z

    .line 536
    .line 537
    const-class v0, [B

    .line 538
    .line 539
    invoke-static {v0}, Landroidx/datastore/preferences/protobuf/s0;->b(Ljava/lang/Class;)I

    .line 540
    .line 541
    .line 542
    move-result v0

    .line 543
    int-to-long v0, v0

    .line 544
    sput-wide v0, Landroidx/datastore/preferences/protobuf/s0;->g:J

    .line 545
    .line 546
    const-class v0, [Z

    .line 547
    .line 548
    invoke-static {v0}, Landroidx/datastore/preferences/protobuf/s0;->b(Ljava/lang/Class;)I

    .line 549
    .line 550
    .line 551
    invoke-static {v0}, Landroidx/datastore/preferences/protobuf/s0;->c(Ljava/lang/Class;)V

    .line 552
    .line 553
    .line 554
    const-class v0, [I

    .line 555
    .line 556
    invoke-static {v0}, Landroidx/datastore/preferences/protobuf/s0;->b(Ljava/lang/Class;)I

    .line 557
    .line 558
    .line 559
    invoke-static {v0}, Landroidx/datastore/preferences/protobuf/s0;->c(Ljava/lang/Class;)V

    .line 560
    .line 561
    .line 562
    const-class v0, [J

    .line 563
    .line 564
    invoke-static {v0}, Landroidx/datastore/preferences/protobuf/s0;->b(Ljava/lang/Class;)I

    .line 565
    .line 566
    .line 567
    invoke-static {v0}, Landroidx/datastore/preferences/protobuf/s0;->c(Ljava/lang/Class;)V

    .line 568
    .line 569
    .line 570
    const-class v0, [F

    .line 571
    .line 572
    invoke-static {v0}, Landroidx/datastore/preferences/protobuf/s0;->b(Ljava/lang/Class;)I

    .line 573
    .line 574
    .line 575
    invoke-static {v0}, Landroidx/datastore/preferences/protobuf/s0;->c(Ljava/lang/Class;)V

    .line 576
    .line 577
    .line 578
    const-class v0, [D

    .line 579
    .line 580
    invoke-static {v0}, Landroidx/datastore/preferences/protobuf/s0;->b(Ljava/lang/Class;)I

    .line 581
    .line 582
    .line 583
    invoke-static {v0}, Landroidx/datastore/preferences/protobuf/s0;->c(Ljava/lang/Class;)V

    .line 584
    .line 585
    .line 586
    const-class v0, [Ljava/lang/Object;

    .line 587
    .line 588
    invoke-static {v0}, Landroidx/datastore/preferences/protobuf/s0;->b(Ljava/lang/Class;)I

    .line 589
    .line 590
    .line 591
    invoke-static {v0}, Landroidx/datastore/preferences/protobuf/s0;->c(Ljava/lang/Class;)V

    .line 592
    .line 593
    .line 594
    invoke-static {}, Landroidx/datastore/preferences/protobuf/s0;->d()Ljava/lang/reflect/Field;

    .line 595
    .line 596
    .line 597
    move-result-object v0

    .line 598
    if-eqz v0, :cond_a

    .line 599
    .line 600
    sget-object v1, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 601
    .line 602
    if-nez v1, :cond_9

    .line 603
    .line 604
    goto :goto_6

    .line 605
    :cond_9
    invoke-virtual {v1, v0}, Landroidx/datastore/preferences/protobuf/r0;->j(Ljava/lang/reflect/Field;)J

    .line 606
    .line 607
    .line 608
    :cond_a
    :goto_6
    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    .line 609
    .line 610
    .line 611
    move-result-object v0

    .line 612
    sget-object v1, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 613
    .line 614
    if-ne v0, v1, :cond_b

    .line 615
    .line 616
    move/from16 v3, v20

    .line 617
    .line 618
    goto :goto_7

    .line 619
    :cond_b
    move/from16 v3, v16

    .line 620
    .line 621
    :goto_7
    sput-boolean v3, Landroidx/datastore/preferences/protobuf/s0;->h:Z

    .line 622
    .line 623
    return-void
.end method

.method public static a(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1

    .line 1
    :try_start_0
    sget-object v0, Landroidx/datastore/preferences/protobuf/s0;->b:Lsun/misc/Unsafe;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lsun/misc/Unsafe;->allocateInstance(Ljava/lang/Class;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    return-object p0

    .line 8
    :catch_0
    move-exception p0

    .line 9
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 10
    .line 11
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    .line 12
    .line 13
    .line 14
    throw v0
.end method

.method public static b(Ljava/lang/Class;)I
    .locals 1

    .line 1
    sget-boolean v0, Landroidx/datastore/preferences/protobuf/s0;->f:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 6
    .line 7
    invoke-virtual {v0, p0}, Landroidx/datastore/preferences/protobuf/r0;->a(Ljava/lang/Class;)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0

    .line 12
    :cond_0
    const/4 p0, -0x1

    .line 13
    return p0
.end method

.method public static c(Ljava/lang/Class;)V
    .locals 1

    .line 1
    sget-boolean v0, Landroidx/datastore/preferences/protobuf/s0;->f:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 6
    .line 7
    invoke-virtual {v0, p0}, Landroidx/datastore/preferences/protobuf/r0;->b(Ljava/lang/Class;)I

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public static d()Ljava/lang/reflect/Field;
    .locals 4

    .line 1
    invoke-static {}, Landroidx/datastore/preferences/protobuf/c;->a()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-class v1, Ljava/nio/Buffer;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const-string v0, "effectiveDirectAddress"

    .line 11
    .line 12
    :try_start_0
    invoke-virtual {v1, v0}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 13
    .line 14
    .line 15
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    goto :goto_0

    .line 17
    :catchall_0
    move-object v0, v2

    .line 18
    :goto_0
    if-eqz v0, :cond_0

    .line 19
    .line 20
    return-object v0

    .line 21
    :cond_0
    const-string v0, "address"

    .line 22
    .line 23
    :try_start_1
    invoke-virtual {v1, v0}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 24
    .line 25
    .line 26
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 27
    goto :goto_1

    .line 28
    :catchall_1
    move-object v0, v2

    .line 29
    :goto_1
    if-eqz v0, :cond_1

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    sget-object v3, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 36
    .line 37
    if-ne v1, v3, :cond_1

    .line 38
    .line 39
    return-object v0

    .line 40
    :cond_1
    return-object v2
.end method

.method public static e(Ljava/lang/Class;)Z
    .locals 11

    .line 1
    const/4 v0, 0x4

    .line 2
    const/4 v1, 0x3

    .line 3
    const/4 v2, 0x2

    .line 4
    const/4 v3, 0x1

    .line 5
    const-class v4, [B

    .line 6
    .line 7
    invoke-static {}, Landroidx/datastore/preferences/protobuf/c;->a()Z

    .line 8
    .line 9
    .line 10
    move-result v5

    .line 11
    const/4 v6, 0x0

    .line 12
    if-nez v5, :cond_0

    .line 13
    .line 14
    return v6

    .line 15
    :cond_0
    :try_start_0
    sget-object v5, Landroidx/datastore/preferences/protobuf/s0;->c:Ljava/lang/Class;

    .line 16
    .line 17
    const-string v7, "peekLong"

    .line 18
    .line 19
    sget-object v8, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 20
    .line 21
    new-array v9, v2, [Ljava/lang/Class;

    .line 22
    .line 23
    aput-object p0, v9, v6

    .line 24
    .line 25
    aput-object v8, v9, v3

    .line 26
    .line 27
    invoke-virtual {v5, v7, v9}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 28
    .line 29
    .line 30
    const-string v7, "pokeLong"

    .line 31
    .line 32
    new-array v9, v1, [Ljava/lang/Class;

    .line 33
    .line 34
    aput-object p0, v9, v6

    .line 35
    .line 36
    sget-object v10, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 37
    .line 38
    aput-object v10, v9, v3

    .line 39
    .line 40
    aput-object v8, v9, v2

    .line 41
    .line 42
    invoke-virtual {v5, v7, v9}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 43
    .line 44
    .line 45
    const-string v7, "pokeInt"

    .line 46
    .line 47
    sget-object v9, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 48
    .line 49
    new-array v10, v1, [Ljava/lang/Class;

    .line 50
    .line 51
    aput-object p0, v10, v6

    .line 52
    .line 53
    aput-object v9, v10, v3

    .line 54
    .line 55
    aput-object v8, v10, v2

    .line 56
    .line 57
    invoke-virtual {v5, v7, v10}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 58
    .line 59
    .line 60
    const-string v7, "peekInt"

    .line 61
    .line 62
    new-array v10, v2, [Ljava/lang/Class;

    .line 63
    .line 64
    aput-object p0, v10, v6

    .line 65
    .line 66
    aput-object v8, v10, v3

    .line 67
    .line 68
    invoke-virtual {v5, v7, v10}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 69
    .line 70
    .line 71
    const-string v7, "pokeByte"

    .line 72
    .line 73
    new-array v8, v2, [Ljava/lang/Class;

    .line 74
    .line 75
    aput-object p0, v8, v6

    .line 76
    .line 77
    sget-object v10, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 78
    .line 79
    aput-object v10, v8, v3

    .line 80
    .line 81
    invoke-virtual {v5, v7, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 82
    .line 83
    .line 84
    const-string v7, "peekByte"

    .line 85
    .line 86
    new-array v8, v3, [Ljava/lang/Class;

    .line 87
    .line 88
    aput-object p0, v8, v6

    .line 89
    .line 90
    invoke-virtual {v5, v7, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 91
    .line 92
    .line 93
    const-string v7, "pokeByteArray"

    .line 94
    .line 95
    new-array v8, v0, [Ljava/lang/Class;

    .line 96
    .line 97
    aput-object p0, v8, v6

    .line 98
    .line 99
    aput-object v4, v8, v3

    .line 100
    .line 101
    aput-object v9, v8, v2

    .line 102
    .line 103
    aput-object v9, v8, v1

    .line 104
    .line 105
    invoke-virtual {v5, v7, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 106
    .line 107
    .line 108
    const-string v7, "peekByteArray"

    .line 109
    .line 110
    new-array v0, v0, [Ljava/lang/Class;

    .line 111
    .line 112
    aput-object p0, v0, v6

    .line 113
    .line 114
    aput-object v4, v0, v3

    .line 115
    .line 116
    aput-object v9, v0, v2

    .line 117
    .line 118
    aput-object v9, v0, v1

    .line 119
    .line 120
    invoke-virtual {v5, v7, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 121
    .line 122
    .line 123
    return v3

    .line 124
    :catchall_0
    return v6
.end method

.method public static f(J[B)B
    .locals 2

    .line 1
    sget-wide v0, Landroidx/datastore/preferences/protobuf/s0;->g:J

    .line 2
    .line 3
    add-long/2addr v0, p0

    .line 4
    sget-object p0, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 5
    .line 6
    invoke-virtual {p0, v0, v1, p2}, Landroidx/datastore/preferences/protobuf/r0;->d(JLjava/lang/Object;)B

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0
.end method

.method public static g(JLjava/lang/Object;)B
    .locals 3

    .line 1
    const-wide/16 v0, -0x4

    .line 2
    .line 3
    and-long/2addr v0, p0

    .line 4
    sget-object v2, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 5
    .line 6
    invoke-virtual {v2, v0, v1, p2}, Landroidx/datastore/preferences/protobuf/r0;->g(JLjava/lang/Object;)I

    .line 7
    .line 8
    .line 9
    move-result p2

    .line 10
    not-long p0, p0

    .line 11
    const-wide/16 v0, 0x3

    .line 12
    .line 13
    and-long/2addr p0, v0

    .line 14
    const/4 v0, 0x3

    .line 15
    shl-long/2addr p0, v0

    .line 16
    long-to-int p0, p0

    .line 17
    ushr-int p0, p2, p0

    .line 18
    .line 19
    and-int/lit16 p0, p0, 0xff

    .line 20
    .line 21
    int-to-byte p0, p0

    .line 22
    return p0
.end method

.method public static h(JLjava/lang/Object;)B
    .locals 3

    .line 1
    const-wide/16 v0, -0x4

    .line 2
    .line 3
    and-long/2addr v0, p0

    .line 4
    sget-object v2, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 5
    .line 6
    invoke-virtual {v2, v0, v1, p2}, Landroidx/datastore/preferences/protobuf/r0;->g(JLjava/lang/Object;)I

    .line 7
    .line 8
    .line 9
    move-result p2

    .line 10
    const-wide/16 v0, 0x3

    .line 11
    .line 12
    and-long/2addr p0, v0

    .line 13
    const/4 v0, 0x3

    .line 14
    shl-long/2addr p0, v0

    .line 15
    long-to-int p0, p0

    .line 16
    ushr-int p0, p2, p0

    .line 17
    .line 18
    and-int/lit16 p0, p0, 0xff

    .line 19
    .line 20
    int-to-byte p0, p0

    .line 21
    return p0
.end method

.method public static i()Lsun/misc/Unsafe;
    .locals 1

    .line 1
    :try_start_0
    new-instance v0, Landroidx/datastore/preferences/protobuf/o0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Ljava/security/AccessController;->doPrivileged(Ljava/security/PrivilegedExceptionAction;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Lsun/misc/Unsafe;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    return-object v0

    .line 13
    :catchall_0
    const/4 v0, 0x0

    .line 14
    return-object v0
.end method

.method public static j([BJB)V
    .locals 2

    .line 1
    sget-wide v0, Landroidx/datastore/preferences/protobuf/s0;->g:J

    .line 2
    .line 3
    add-long/2addr v0, p1

    .line 4
    sget-object p1, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 5
    .line 6
    invoke-virtual {p1, p0, v0, v1, p3}, Landroidx/datastore/preferences/protobuf/r0;->l(Ljava/lang/Object;JB)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static k(Ljava/lang/Object;JB)V
    .locals 4

    .line 1
    const-wide/16 v0, -0x4

    .line 2
    .line 3
    and-long/2addr v0, p1

    .line 4
    sget-object v2, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 5
    .line 6
    invoke-virtual {v2, v0, v1, p0}, Landroidx/datastore/preferences/protobuf/r0;->g(JLjava/lang/Object;)I

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    long-to-int p1, p1

    .line 11
    not-int p1, p1

    .line 12
    and-int/lit8 p1, p1, 0x3

    .line 13
    .line 14
    shl-int/lit8 p1, p1, 0x3

    .line 15
    .line 16
    const/16 p2, 0xff

    .line 17
    .line 18
    shl-int v3, p2, p1

    .line 19
    .line 20
    not-int v3, v3

    .line 21
    and-int/2addr v2, v3

    .line 22
    and-int/2addr p2, p3

    .line 23
    shl-int p1, p2, p1

    .line 24
    .line 25
    or-int/2addr p1, v2

    .line 26
    invoke-static {v0, v1, p0, p1}, Landroidx/datastore/preferences/protobuf/s0;->m(JLjava/lang/Object;I)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public static l(Ljava/lang/Object;JB)V
    .locals 4

    .line 1
    const-wide/16 v0, -0x4

    .line 2
    .line 3
    and-long/2addr v0, p1

    .line 4
    sget-object v2, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 5
    .line 6
    invoke-virtual {v2, v0, v1, p0}, Landroidx/datastore/preferences/protobuf/r0;->g(JLjava/lang/Object;)I

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    long-to-int p1, p1

    .line 11
    and-int/lit8 p1, p1, 0x3

    .line 12
    .line 13
    shl-int/lit8 p1, p1, 0x3

    .line 14
    .line 15
    const/16 p2, 0xff

    .line 16
    .line 17
    shl-int v3, p2, p1

    .line 18
    .line 19
    not-int v3, v3

    .line 20
    and-int/2addr v2, v3

    .line 21
    and-int/2addr p2, p3

    .line 22
    shl-int p1, p2, p1

    .line 23
    .line 24
    or-int/2addr p1, v2

    .line 25
    invoke-static {v0, v1, p0, p1}, Landroidx/datastore/preferences/protobuf/s0;->m(JLjava/lang/Object;I)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public static m(JLjava/lang/Object;I)V
    .locals 1

    .line 1
    sget-object v0, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 2
    .line 3
    invoke-virtual {v0, p0, p1, p2, p3}, Landroidx/datastore/preferences/protobuf/r0;->o(JLjava/lang/Object;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static n(Ljava/lang/Object;JJ)V
    .locals 6

    .line 1
    sget-object v0, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 2
    .line 3
    move-object v1, p0

    .line 4
    move-wide v2, p1

    .line 5
    move-wide v4, p3

    .line 6
    invoke-virtual/range {v0 .. v5}, Landroidx/datastore/preferences/protobuf/r0;->p(Ljava/lang/Object;JJ)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static o(Ljava/lang/Object;JLjava/lang/Object;)V
    .locals 1

    .line 1
    sget-object v0, Landroidx/datastore/preferences/protobuf/s0;->d:Landroidx/datastore/preferences/protobuf/r0;

    .line 2
    .line 3
    invoke-virtual {v0, p0, p1, p2, p3}, Landroidx/datastore/preferences/protobuf/r0;->q(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
