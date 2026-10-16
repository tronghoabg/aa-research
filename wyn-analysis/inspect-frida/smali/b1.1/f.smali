.class public abstract Lb1/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lr7/e;

.field public static final b:Lx/j;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-string v0, "TypefaceCompat static init"

    .line 2
    .line 3
    invoke-static {v0}, Ltg/b;->U(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 11
    .line 12
    const/16 v1, 0x1d

    .line 13
    .line 14
    if-lt v0, v1, :cond_0

    .line 15
    .line 16
    new-instance v0, Lb1/k;

    .line 17
    .line 18
    invoke-direct {v0}, Lr7/e;-><init>()V

    .line 19
    .line 20
    .line 21
    sput-object v0, Lb1/f;->a:Lr7/e;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/16 v1, 0x1c

    .line 25
    .line 26
    if-lt v0, v1, :cond_1

    .line 27
    .line 28
    new-instance v0, Lb1/j;

    .line 29
    .line 30
    invoke-direct {v0}, Lb1/i;-><init>()V

    .line 31
    .line 32
    .line 33
    sput-object v0, Lb1/f;->a:Lr7/e;

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    const/16 v1, 0x1a

    .line 37
    .line 38
    if-lt v0, v1, :cond_2

    .line 39
    .line 40
    new-instance v0, Lb1/i;

    .line 41
    .line 42
    invoke-direct {v0}, Lb1/i;-><init>()V

    .line 43
    .line 44
    .line 45
    sput-object v0, Lb1/f;->a:Lr7/e;

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    const/16 v1, 0x18

    .line 49
    .line 50
    if-lt v0, v1, :cond_4

    .line 51
    .line 52
    sget-object v0, Lb1/h;->e:Ljava/lang/reflect/Method;

    .line 53
    .line 54
    if-nez v0, :cond_3

    .line 55
    .line 56
    const-string v1, "TypefaceCompatApi24Impl"

    .line 57
    .line 58
    const-string v2, "Unable to collect necessary private methods.Fallback to legacy implementation."

    .line 59
    .line 60
    invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 61
    .line 62
    .line 63
    :cond_3
    if-eqz v0, :cond_4

    .line 64
    .line 65
    new-instance v0, Lb1/h;

    .line 66
    .line 67
    invoke-direct {v0}, Lr7/e;-><init>()V

    .line 68
    .line 69
    .line 70
    sput-object v0, Lb1/f;->a:Lr7/e;

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_4
    new-instance v0, Lb1/g;

    .line 74
    .line 75
    invoke-direct {v0}, Lr7/e;-><init>()V

    .line 76
    .line 77
    .line 78
    sput-object v0, Lb1/f;->a:Lr7/e;

    .line 79
    .line 80
    :goto_0
    new-instance v0, Lx/j;

    .line 81
    .line 82
    const/16 v1, 0x10

    .line 83
    .line 84
    invoke-direct {v0, v1}, Lx/j;-><init>(I)V

    .line 85
    .line 86
    .line 87
    sput-object v0, Lb1/f;->b:Lx/j;

    .line 88
    .line 89
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 90
    .line 91
    .line 92
    return-void
.end method

.method public static a(Landroid/content/Context;La1/d;Landroid/content/res/Resources;ILjava/lang/String;IILa1/b;Z)Landroid/graphics/Typeface;
    .locals 16

    .line 1
    move-object/from16 v2, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move/from16 v4, p6

    .line 6
    .line 7
    move-object/from16 v1, p7

    .line 8
    .line 9
    const/16 v3, 0x12

    .line 10
    .line 11
    const/16 v5, 0x16

    .line 12
    .line 13
    const/4 v6, 0x2

    .line 14
    const/4 v7, 0x0

    .line 15
    const/4 v8, 0x1

    .line 16
    instance-of v9, v0, La1/g;

    .line 17
    .line 18
    const/4 v10, -0x3

    .line 19
    if-eqz v9, :cond_10

    .line 20
    .line 21
    check-cast v0, La1/g;

    .line 22
    .line 23
    iget-object v9, v0, La1/g;->e:Ljava/lang/String;

    .line 24
    .line 25
    if-eqz v9, :cond_1

    .line 26
    .line 27
    invoke-virtual {v9}, Ljava/lang/String;->isEmpty()Z

    .line 28
    .line 29
    .line 30
    move-result v12

    .line 31
    if-eqz v12, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    invoke-static {v9, v7}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    .line 35
    .line 36
    .line 37
    move-result-object v9

    .line 38
    sget-object v12, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    .line 39
    .line 40
    invoke-static {v12, v7}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    .line 41
    .line 42
    .line 43
    move-result-object v12

    .line 44
    if-eqz v9, :cond_1

    .line 45
    .line 46
    invoke-virtual {v9, v12}, Landroid/graphics/Typeface;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v12

    .line 50
    if-nez v12, :cond_1

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_1
    :goto_0
    const/4 v9, 0x0

    .line 54
    :goto_1
    if-eqz v9, :cond_3

    .line 55
    .line 56
    if-eqz v1, :cond_2

    .line 57
    .line 58
    new-instance v0, Landroid/os/Handler;

    .line 59
    .line 60
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-direct {v0, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 65
    .line 66
    .line 67
    new-instance v2, LT3/r;

    .line 68
    .line 69
    invoke-direct {v2, v5, v1, v9}, LT3/r;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 73
    .line 74
    .line 75
    :cond_2
    return-object v9

    .line 76
    :cond_3
    if-eqz p8, :cond_5

    .line 77
    .line 78
    iget v5, v0, La1/g;->d:I

    .line 79
    .line 80
    if-nez v5, :cond_4

    .line 81
    .line 82
    :goto_2
    move v5, v8

    .line 83
    goto :goto_3

    .line 84
    :cond_4
    move v5, v7

    .line 85
    goto :goto_3

    .line 86
    :cond_5
    if-nez v1, :cond_4

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :goto_3
    const/4 v9, -0x1

    .line 90
    if-eqz p8, :cond_6

    .line 91
    .line 92
    iget v12, v0, La1/g;->c:I

    .line 93
    .line 94
    goto :goto_4

    .line 95
    :cond_6
    move v12, v9

    .line 96
    :goto_4
    new-instance v13, Landroid/os/Handler;

    .line 97
    .line 98
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 99
    .line 100
    .line 101
    move-result-object v14

    .line 102
    invoke-direct {v13, v14}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 103
    .line 104
    .line 105
    new-instance v14, La2/v;

    .line 106
    .line 107
    invoke-direct {v14, v8, v7}, La2/v;-><init>(IZ)V

    .line 108
    .line 109
    .line 110
    iput-object v1, v14, La2/v;->b:Ljava/lang/Object;

    .line 111
    .line 112
    iget-object v1, v0, La1/g;->b:Lh1/d;

    .line 113
    .line 114
    if-eqz v1, :cond_8

    .line 115
    .line 116
    iget-object v0, v0, La1/g;->a:Lh1/d;

    .line 117
    .line 118
    new-array v15, v6, [Ljava/lang/Object;

    .line 119
    .line 120
    aput-object v0, v15, v7

    .line 121
    .line 122
    aput-object v1, v15, v8

    .line 123
    .line 124
    new-instance v0, Ljava/util/ArrayList;

    .line 125
    .line 126
    invoke-direct {v0, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 127
    .line 128
    .line 129
    move v1, v7

    .line 130
    :goto_5
    if-ge v1, v6, :cond_7

    .line 131
    .line 132
    aget-object v11, v15, v1

    .line 133
    .line 134
    invoke-static {v11}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v0, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    add-int/2addr v1, v8

    .line 141
    goto :goto_5

    .line 142
    :cond_7
    invoke-static {v0}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    goto :goto_6

    .line 147
    :cond_8
    iget-object v0, v0, La1/g;->a:Lh1/d;

    .line 148
    .line 149
    new-array v1, v8, [Ljava/lang/Object;

    .line 150
    .line 151
    aput-object v0, v1, v7

    .line 152
    .line 153
    new-instance v0, Ljava/util/ArrayList;

    .line 154
    .line 155
    invoke-direct {v0, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 156
    .line 157
    .line 158
    aget-object v1, v1, v7

    .line 159
    .line 160
    invoke-static {v1}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    invoke-static {v0}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    :goto_6
    new-instance v11, LX2/j;

    .line 171
    .line 172
    new-instance v1, LY4/g;

    .line 173
    .line 174
    invoke-direct {v1, v13, v6}, LY4/g;-><init>(Landroid/os/Handler;I)V

    .line 175
    .line 176
    .line 177
    const/16 v6, 0x11

    .line 178
    .line 179
    invoke-direct {v11, v6, v14, v1}, LX2/j;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 180
    .line 181
    .line 182
    if-eqz v5, :cond_c

    .line 183
    .line 184
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 185
    .line 186
    .line 187
    move-result v5

    .line 188
    if-gt v5, v8, :cond_b

    .line 189
    .line 190
    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    check-cast v0, Lh1/d;

    .line 195
    .line 196
    sget-object v5, Lh1/h;->a:Lx/j;

    .line 197
    .line 198
    new-array v5, v8, [Ljava/lang/Object;

    .line 199
    .line 200
    aput-object v0, v5, v7

    .line 201
    .line 202
    new-instance v6, Ljava/util/ArrayList;

    .line 203
    .line 204
    invoke-direct {v6, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 205
    .line 206
    .line 207
    aget-object v5, v5, v7

    .line 208
    .line 209
    invoke-static {v5}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 213
    .line 214
    .line 215
    invoke-static {v6}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 216
    .line 217
    .line 218
    move-result-object v5

    .line 219
    invoke-static {v4, v5}, Lh1/h;->a(ILjava/util/List;)Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object v5

    .line 223
    sget-object v6, Lh1/h;->a:Lx/j;

    .line 224
    .line 225
    invoke-virtual {v6, v5}, Lx/j;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v6

    .line 229
    check-cast v6, Landroid/graphics/Typeface;

    .line 230
    .line 231
    if-eqz v6, :cond_9

    .line 232
    .line 233
    new-instance v0, LL7/b;

    .line 234
    .line 235
    invoke-direct {v0, v3, v14, v6}, LL7/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 236
    .line 237
    .line 238
    invoke-virtual {v1, v0}, LY4/g;->execute(Ljava/lang/Runnable;)V

    .line 239
    .line 240
    .line 241
    move-object v11, v6

    .line 242
    goto/16 :goto_b

    .line 243
    .line 244
    :cond_9
    if-ne v12, v9, :cond_a

    .line 245
    .line 246
    new-array v1, v8, [Ljava/lang/Object;

    .line 247
    .line 248
    aput-object v0, v1, v7

    .line 249
    .line 250
    new-instance v0, Ljava/util/ArrayList;

    .line 251
    .line 252
    invoke-direct {v0, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 253
    .line 254
    .line 255
    aget-object v1, v1, v7

    .line 256
    .line 257
    invoke-static {v1}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 261
    .line 262
    .line 263
    invoke-static {v0}, Lj$/util/DesugarCollections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 264
    .line 265
    .line 266
    move-result-object v0

    .line 267
    invoke-static {v5, v2, v0, v4}, Lh1/h;->b(Ljava/lang/String;Landroid/content/Context;Ljava/util/List;I)Lh1/g;

    .line 268
    .line 269
    .line 270
    move-result-object v0

    .line 271
    invoke-virtual {v11, v0}, LX2/j;->X(Lh1/g;)V

    .line 272
    .line 273
    .line 274
    iget-object v11, v0, Lh1/g;->a:Landroid/graphics/Typeface;

    .line 275
    .line 276
    goto/16 :goto_b

    .line 277
    .line 278
    :cond_a
    move-object v3, v0

    .line 279
    new-instance v0, Lh1/e;

    .line 280
    .line 281
    move-object v1, v5

    .line 282
    const/4 v5, 0x0

    .line 283
    invoke-direct/range {v0 .. v5}, Lh1/e;-><init>(Ljava/lang/String;Landroid/content/Context;Ljava/lang/Object;II)V

    .line 284
    .line 285
    .line 286
    :try_start_0
    sget-object v1, Lh1/h;->b:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 287
    .line 288
    invoke-interface {v1, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    .line 289
    .line 290
    .line 291
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_3

    .line 292
    int-to-long v1, v12

    .line 293
    :try_start_1
    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 294
    .line 295
    invoke-interface {v0, v1, v2, v3}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object v0
    :try_end_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_1 .. :try_end_1} :catch_2

    .line 299
    :try_start_2
    check-cast v0, Lh1/g;

    .line 300
    .line 301
    invoke-virtual {v11, v0}, LX2/j;->X(Lh1/g;)V

    .line 302
    .line 303
    .line 304
    iget-object v11, v0, Lh1/g;->a:Landroid/graphics/Typeface;

    .line 305
    .line 306
    goto/16 :goto_b

    .line 307
    .line 308
    :catch_0
    move-exception v0

    .line 309
    goto :goto_7

    .line 310
    :catch_1
    move-exception v0

    .line 311
    goto :goto_8

    .line 312
    :catch_2
    new-instance v0, Ljava/lang/InterruptedException;

    .line 313
    .line 314
    const-string v1, "timeout"

    .line 315
    .line 316
    invoke-direct {v0, v1}, Ljava/lang/InterruptedException;-><init>(Ljava/lang/String;)V

    .line 317
    .line 318
    .line 319
    throw v0

    .line 320
    :goto_7
    throw v0

    .line 321
    :goto_8
    new-instance v1, Ljava/lang/RuntimeException;

    .line 322
    .line 323
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 324
    .line 325
    .line 326
    throw v1
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_3

    .line 327
    :catch_3
    new-instance v0, LR3/c;

    .line 328
    .line 329
    iget-object v1, v11, LX2/j;->b:Ljava/lang/Object;

    .line 330
    .line 331
    check-cast v1, La2/v;

    .line 332
    .line 333
    const/4 v2, 0x3

    .line 334
    invoke-direct {v0, v1, v10, v2}, LR3/c;-><init>(Ljava/lang/Object;II)V

    .line 335
    .line 336
    .line 337
    iget-object v1, v11, LX2/j;->c:Ljava/lang/Object;

    .line 338
    .line 339
    check-cast v1, LY4/g;

    .line 340
    .line 341
    invoke-virtual {v1, v0}, LY4/g;->execute(Ljava/lang/Runnable;)V

    .line 342
    .line 343
    .line 344
    :goto_9
    const/4 v11, 0x0

    .line 345
    goto/16 :goto_b

    .line 346
    .line 347
    :cond_b
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 348
    .line 349
    const-string v1, "Fallbacks with blocking fetches are not supported for performance reasons"

    .line 350
    .line 351
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 352
    .line 353
    .line 354
    throw v0

    .line 355
    :cond_c
    invoke-static {v4, v0}, Lh1/h;->a(ILjava/util/List;)Ljava/lang/String;

    .line 356
    .line 357
    .line 358
    move-result-object v2

    .line 359
    sget-object v5, Lh1/h;->a:Lx/j;

    .line 360
    .line 361
    invoke-virtual {v5, v2}, Lx/j;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 362
    .line 363
    .line 364
    move-result-object v5

    .line 365
    check-cast v5, Landroid/graphics/Typeface;

    .line 366
    .line 367
    if-eqz v5, :cond_d

    .line 368
    .line 369
    new-instance v0, LL7/b;

    .line 370
    .line 371
    invoke-direct {v0, v3, v14, v5}, LL7/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 372
    .line 373
    .line 374
    invoke-virtual {v1, v0}, LY4/g;->execute(Ljava/lang/Runnable;)V

    .line 375
    .line 376
    .line 377
    move-object v11, v5

    .line 378
    goto :goto_b

    .line 379
    :cond_d
    new-instance v1, Lh1/f;

    .line 380
    .line 381
    invoke-direct {v1, v11, v7}, Lh1/f;-><init>(Ljava/lang/Object;I)V

    .line 382
    .line 383
    .line 384
    sget-object v3, Lh1/h;->c:Ljava/lang/Object;

    .line 385
    .line 386
    monitor-enter v3

    .line 387
    :try_start_3
    sget-object v5, Lh1/h;->d:Lx/v;

    .line 388
    .line 389
    invoke-virtual {v5, v2}, Lx/v;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 390
    .line 391
    .line 392
    move-result-object v6

    .line 393
    check-cast v6, Ljava/util/ArrayList;

    .line 394
    .line 395
    if-eqz v6, :cond_e

    .line 396
    .line 397
    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 398
    .line 399
    .line 400
    monitor-exit v3

    .line 401
    goto :goto_9

    .line 402
    :catchall_0
    move-exception v0

    .line 403
    goto :goto_c

    .line 404
    :cond_e
    new-instance v6, Ljava/util/ArrayList;

    .line 405
    .line 406
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 407
    .line 408
    .line 409
    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 410
    .line 411
    .line 412
    invoke-virtual {v5, v2, v6}, Lx/v;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 413
    .line 414
    .line 415
    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 416
    move-object v3, v0

    .line 417
    new-instance v0, Lh1/e;

    .line 418
    .line 419
    const/4 v5, 0x1

    .line 420
    move-object v1, v2

    .line 421
    move-object/from16 v2, p0

    .line 422
    .line 423
    invoke-direct/range {v0 .. v5}, Lh1/e;-><init>(Ljava/lang/String;Landroid/content/Context;Ljava/lang/Object;II)V

    .line 424
    .line 425
    .line 426
    sget-object v2, Lh1/h;->b:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 427
    .line 428
    new-instance v3, Lh1/f;

    .line 429
    .line 430
    invoke-direct {v3, v1, v8}, Lh1/f;-><init>(Ljava/lang/Object;I)V

    .line 431
    .line 432
    .line 433
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 434
    .line 435
    .line 436
    move-result-object v1

    .line 437
    if-nez v1, :cond_f

    .line 438
    .line 439
    new-instance v1, Landroid/os/Handler;

    .line 440
    .line 441
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 442
    .line 443
    .line 444
    move-result-object v5

    .line 445
    invoke-direct {v1, v5}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 446
    .line 447
    .line 448
    goto :goto_a

    .line 449
    :cond_f
    new-instance v1, Landroid/os/Handler;

    .line 450
    .line 451
    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    .line 452
    .line 453
    .line 454
    :goto_a
    new-instance v5, LA7/w0;

    .line 455
    .line 456
    const/16 v6, 0x17

    .line 457
    .line 458
    invoke-direct {v5, v6}, LA7/w0;-><init>(I)V

    .line 459
    .line 460
    .line 461
    iput-object v0, v5, LA7/w0;->d:Ljava/lang/Object;

    .line 462
    .line 463
    iput-object v3, v5, LA7/w0;->b:Ljava/lang/Object;

    .line 464
    .line 465
    iput-object v1, v5, LA7/w0;->c:Ljava/lang/Object;

    .line 466
    .line 467
    invoke-virtual {v2, v5}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 468
    .line 469
    .line 470
    goto :goto_9

    .line 471
    :goto_b
    move-object/from16 v6, p2

    .line 472
    .line 473
    goto :goto_d

    .line 474
    :goto_c
    :try_start_4
    monitor-exit v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 475
    throw v0

    .line 476
    :cond_10
    sget-object v3, Lb1/f;->a:Lr7/e;

    .line 477
    .line 478
    check-cast v0, La1/e;

    .line 479
    .line 480
    move-object/from16 v6, p2

    .line 481
    .line 482
    invoke-virtual {v3, v2, v0, v6, v4}, Lr7/e;->o(Landroid/content/Context;La1/e;Landroid/content/res/Resources;I)Landroid/graphics/Typeface;

    .line 483
    .line 484
    .line 485
    move-result-object v11

    .line 486
    if-eqz v1, :cond_12

    .line 487
    .line 488
    if-eqz v11, :cond_11

    .line 489
    .line 490
    new-instance v0, Landroid/os/Handler;

    .line 491
    .line 492
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 493
    .line 494
    .line 495
    move-result-object v2

    .line 496
    invoke-direct {v0, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 497
    .line 498
    .line 499
    new-instance v2, LT3/r;

    .line 500
    .line 501
    invoke-direct {v2, v5, v1, v11}, LT3/r;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 502
    .line 503
    .line 504
    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 505
    .line 506
    .line 507
    goto :goto_d

    .line 508
    :cond_11
    invoke-virtual {v1, v10}, La1/b;->a(I)V

    .line 509
    .line 510
    .line 511
    :cond_12
    :goto_d
    if-eqz v11, :cond_13

    .line 512
    .line 513
    sget-object v0, Lb1/f;->b:Lx/j;

    .line 514
    .line 515
    invoke-static/range {p2 .. p6}, Lb1/f;->b(Landroid/content/res/Resources;ILjava/lang/String;II)Ljava/lang/String;

    .line 516
    .line 517
    .line 518
    move-result-object v1

    .line 519
    invoke-virtual {v0, v1, v11}, Lx/j;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 520
    .line 521
    .line 522
    :cond_13
    return-object v11
.end method

.method public static b(Landroid/content/res/Resources;ILjava/lang/String;II)Ljava/lang/String;
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getResourcePackageName(I)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const/16 p0, 0x2d

    .line 14
    .line 15
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0
.end method
