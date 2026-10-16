.class public Lcom/google/firebase/inappmessaging/FirebaseInAppMessagingRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# static fields
.field private static final LIBRARY_NAME:Ljava/lang/String; = "fire-fiam"


# instance fields
.field private backgroundExecutor:LL8/t;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LL8/t;"
        }
    .end annotation
.end field

.field private blockingExecutor:LL8/t;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LL8/t;"
        }
    .end annotation
.end field

.field private legacyTransportFactory:LL8/t;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LL8/t;"
        }
    .end annotation
.end field

.field private lightWeightExecutor:LL8/t;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LL8/t;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LL8/t;

    .line 5
    .line 6
    const-class v1, Ly8/a;

    .line 7
    .line 8
    const-class v2, Ljava/util/concurrent/Executor;

    .line 9
    .line 10
    invoke-direct {v0, v1, v2}, LL8/t;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lcom/google/firebase/inappmessaging/FirebaseInAppMessagingRegistrar;->backgroundExecutor:LL8/t;

    .line 14
    .line 15
    new-instance v0, LL8/t;

    .line 16
    .line 17
    const-class v1, Ly8/b;

    .line 18
    .line 19
    invoke-direct {v0, v1, v2}, LL8/t;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Lcom/google/firebase/inappmessaging/FirebaseInAppMessagingRegistrar;->blockingExecutor:LL8/t;

    .line 23
    .line 24
    new-instance v0, LL8/t;

    .line 25
    .line 26
    const-class v1, Ly8/c;

    .line 27
    .line 28
    invoke-direct {v0, v1, v2}, LL8/t;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, Lcom/google/firebase/inappmessaging/FirebaseInAppMessagingRegistrar;->lightWeightExecutor:LL8/t;

    .line 32
    .line 33
    new-instance v0, LL8/t;

    .line 34
    .line 35
    const-class v1, Ld9/a;

    .line 36
    .line 37
    const-class v2, Lq5/g;

    .line 38
    .line 39
    invoke-direct {v0, v1, v2}, LL8/t;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 40
    .line 41
    .line 42
    iput-object v0, p0, Lcom/google/firebase/inappmessaging/FirebaseInAppMessagingRegistrar;->legacyTransportFactory:LL8/t;

    .line 43
    .line 44
    return-void
.end method

.method public static synthetic a(Lcom/google/firebase/inappmessaging/FirebaseInAppMessagingRegistrar;LC6/l;)Lz9/B;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/google/firebase/inappmessaging/FirebaseInAppMessagingRegistrar;->providesFirebaseInAppMessaging(LL8/c;)Lz9/B;

    move-result-object p0

    return-object p0
.end method

.method private providesFirebaseInAppMessaging(LL8/c;)Lz9/B;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const-class v2, Ls8/g;

    .line 6
    .line 7
    invoke-interface {v1, v2}, LL8/c;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    move-object v5, v2

    .line 12
    check-cast v5, Ls8/g;

    .line 13
    .line 14
    const-class v2, LP9/d;

    .line 15
    .line 16
    invoke-interface {v1, v2}, LL8/c;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    move-object v6, v2

    .line 21
    check-cast v6, LP9/d;

    .line 22
    .line 23
    const-class v2, Lw8/d;

    .line 24
    .line 25
    invoke-interface {v1, v2}, LL8/c;->g(Ljava/lang/Class;)LL8/r;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    const-class v3, Ll9/d;

    .line 30
    .line 31
    invoke-interface {v1, v3}, LL8/c;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    check-cast v3, Ll9/d;

    .line 36
    .line 37
    invoke-virtual {v5}, Ls8/g;->a()V

    .line 38
    .line 39
    .line 40
    iget-object v4, v5, Ls8/g;->a:Landroid/content/Context;

    .line 41
    .line 42
    check-cast v4, Landroid/app/Application;

    .line 43
    .line 44
    new-instance v10, LY9/c;

    .line 45
    .line 46
    const/16 v7, 0x10

    .line 47
    .line 48
    invoke-direct {v10, v4, v7}, LY9/c;-><init>(Ljava/lang/Object;I)V

    .line 49
    .line 50
    .line 51
    new-instance v4, LS3/c;

    .line 52
    .line 53
    invoke-direct {v4, v2, v3}, LS3/c;-><init>(LL8/r;Ll9/d;)V

    .line 54
    .line 55
    .line 56
    new-instance v13, Lya/b;

    .line 57
    .line 58
    const/16 v2, 0x15

    .line 59
    .line 60
    invoke-direct {v13, v2}, Lya/b;-><init>(I)V

    .line 61
    .line 62
    .line 63
    new-instance v12, Lxa/d;

    .line 64
    .line 65
    new-instance v2, LJ9/H;

    .line 66
    .line 67
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 68
    .line 69
    .line 70
    const/16 v3, 0x10

    .line 71
    .line 72
    const/4 v7, 0x0

    .line 73
    invoke-direct {v12, v3, v7}, Lxa/d;-><init>(IZ)V

    .line 74
    .line 75
    .line 76
    iput-object v2, v12, Lxa/d;->b:Ljava/lang/Object;

    .line 77
    .line 78
    new-instance v14, LG9/e;

    .line 79
    .line 80
    iget-object v2, v0, Lcom/google/firebase/inappmessaging/FirebaseInAppMessagingRegistrar;->lightWeightExecutor:LL8/t;

    .line 81
    .line 82
    invoke-interface {v1, v2}, LL8/c;->b(LL8/t;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    move-object/from16 v16, v2

    .line 87
    .line 88
    check-cast v16, Ljava/util/concurrent/Executor;

    .line 89
    .line 90
    iget-object v2, v0, Lcom/google/firebase/inappmessaging/FirebaseInAppMessagingRegistrar;->backgroundExecutor:LL8/t;

    .line 91
    .line 92
    invoke-interface {v1, v2}, LL8/c;->b(LL8/t;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    move-object/from16 v17, v2

    .line 97
    .line 98
    check-cast v17, Ljava/util/concurrent/Executor;

    .line 99
    .line 100
    iget-object v2, v0, Lcom/google/firebase/inappmessaging/FirebaseInAppMessagingRegistrar;->blockingExecutor:LL8/t;

    .line 101
    .line 102
    invoke-interface {v1, v2}, LL8/c;->b(LL8/t;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    move-object/from16 v18, v2

    .line 107
    .line 108
    check-cast v18, Ljava/util/concurrent/Executor;

    .line 109
    .line 110
    const/16 v15, 0x9

    .line 111
    .line 112
    const/16 v19, 0x0

    .line 113
    .line 114
    invoke-direct/range {v14 .. v19}, LG9/e;-><init>(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)V

    .line 115
    .line 116
    .line 117
    new-instance v8, LVa/ka;

    .line 118
    .line 119
    const/16 v2, 0x16

    .line 120
    .line 121
    invoke-direct {v8, v2}, LVa/ka;-><init>(I)V

    .line 122
    .line 123
    .line 124
    new-instance v9, Lm9/S;

    .line 125
    .line 126
    const/16 v2, 0x16

    .line 127
    .line 128
    invoke-direct {v9, v2}, Lm9/S;-><init>(I)V

    .line 129
    .line 130
    .line 131
    new-instance v11, Lza/a;

    .line 132
    .line 133
    const/16 v2, 0x15

    .line 134
    .line 135
    invoke-direct {v11, v2}, Lza/a;-><init>(I)V

    .line 136
    .line 137
    .line 138
    move-object/from16 v18, v14

    .line 139
    .line 140
    new-instance v14, LXd/c;

    .line 141
    .line 142
    const/16 v2, 0x16

    .line 143
    .line 144
    invoke-direct {v14, v2}, LXd/c;-><init>(I)V

    .line 145
    .line 146
    .line 147
    new-instance v15, Lwa/a;

    .line 148
    .line 149
    const/16 v2, 0x16

    .line 150
    .line 151
    invoke-direct {v15, v2}, Lwa/a;-><init>(I)V

    .line 152
    .line 153
    .line 154
    new-instance v2, Lc8/e;

    .line 155
    .line 156
    const/16 v3, 0x16

    .line 157
    .line 158
    invoke-direct {v2, v3}, Lc8/e;-><init>(I)V

    .line 159
    .line 160
    .line 161
    new-instance v7, LK9/b;

    .line 162
    .line 163
    move-object/from16 v16, v2

    .line 164
    .line 165
    move-object/from16 v17, v4

    .line 166
    .line 167
    invoke-direct/range {v7 .. v18}, LK9/b;-><init>(LVa/ka;Lm9/S;LY9/c;Lza/a;Lxa/d;Lya/b;LXd/c;Lwa/a;Lc8/e;LS3/c;LG9/e;)V

    .line 168
    .line 169
    .line 170
    move-object v2, v7

    .line 171
    new-instance v9, LJ9/a;

    .line 172
    .line 173
    const-class v3, Lu8/a;

    .line 174
    .line 175
    invoke-interface {v1, v3}, LL8/c;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v3

    .line 179
    check-cast v3, Lu8/a;

    .line 180
    .line 181
    const-string v4, "fiam"

    .line 182
    .line 183
    invoke-virtual {v3, v4}, Lu8/a;->a(Ljava/lang/String;)Lt8/c;

    .line 184
    .line 185
    .line 186
    move-result-object v3

    .line 187
    iget-object v4, v0, Lcom/google/firebase/inappmessaging/FirebaseInAppMessagingRegistrar;->blockingExecutor:LL8/t;

    .line 188
    .line 189
    invoke-interface {v1, v4}, LL8/c;->b(LL8/t;)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v4

    .line 193
    check-cast v4, Ljava/util/concurrent/Executor;

    .line 194
    .line 195
    invoke-direct {v9, v3, v4}, LJ9/a;-><init>(Lt8/c;Ljava/util/concurrent/Executor;)V

    .line 196
    .line 197
    .line 198
    new-instance v3, LDd/c;

    .line 199
    .line 200
    new-instance v7, LM9/a;

    .line 201
    .line 202
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 203
    .line 204
    .line 205
    const/16 v4, 0x8

    .line 206
    .line 207
    const/4 v8, 0x0

    .line 208
    invoke-direct/range {v3 .. v8}, LDd/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)V

    .line 209
    .line 210
    .line 211
    new-instance v4, LA/e0;

    .line 212
    .line 213
    const/16 v6, 0xd

    .line 214
    .line 215
    invoke-direct {v4, v5, v6}, LA/e0;-><init>(Ljava/lang/Object;I)V

    .line 216
    .line 217
    .line 218
    iget-object v5, v0, Lcom/google/firebase/inappmessaging/FirebaseInAppMessagingRegistrar;->legacyTransportFactory:LL8/t;

    .line 219
    .line 220
    invoke-interface {v1, v5}, LL8/c;->b(LL8/t;)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v1

    .line 224
    check-cast v1, Lq5/g;

    .line 225
    .line 226
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 227
    .line 228
    .line 229
    new-instance v11, LK9/a;

    .line 230
    .line 231
    const/4 v5, 0x2

    .line 232
    invoke-direct {v11, v2, v5}, LK9/a;-><init>(LK9/b;I)V

    .line 233
    .line 234
    .line 235
    new-instance v12, LK9/a;

    .line 236
    .line 237
    const/16 v5, 0xb

    .line 238
    .line 239
    invoke-direct {v12, v2, v5}, LK9/a;-><init>(LK9/b;I)V

    .line 240
    .line 241
    .line 242
    new-instance v13, LK9/a;

    .line 243
    .line 244
    const/4 v5, 0x5

    .line 245
    invoke-direct {v13, v2, v5}, LK9/a;-><init>(LK9/b;I)V

    .line 246
    .line 247
    .line 248
    new-instance v14, LD9/f;

    .line 249
    .line 250
    const/4 v5, 0x3

    .line 251
    invoke-direct {v14, v2, v5}, LD9/f;-><init>(LK9/b;I)V

    .line 252
    .line 253
    .line 254
    new-instance v5, LK9/a;

    .line 255
    .line 256
    const/16 v6, 0x8

    .line 257
    .line 258
    invoke-direct {v5, v2, v6}, LK9/a;-><init>(LK9/b;I)V

    .line 259
    .line 260
    .line 261
    new-instance v6, LA9/c;

    .line 262
    .line 263
    const/4 v7, 0x4

    .line 264
    invoke-direct {v6, v4, v7}, LA9/c;-><init>(Ljava/lang/Object;I)V

    .line 265
    .line 266
    .line 267
    new-instance v7, LJ9/W;

    .line 268
    .line 269
    invoke-direct {v7, v4, v5, v6}, LJ9/W;-><init>(LA/e0;LK9/a;LA9/c;)V

    .line 270
    .line 271
    .line 272
    invoke-static {v7}, LA9/a;->a(LA9/b;)Ldf/a;

    .line 273
    .line 274
    .line 275
    move-result-object v4

    .line 276
    new-instance v5, LJ9/r;

    .line 277
    .line 278
    const/4 v6, 0x0

    .line 279
    invoke-direct {v5, v4, v6}, LJ9/r;-><init>(Ldf/a;I)V

    .line 280
    .line 281
    .line 282
    invoke-static {v5}, LA9/a;->a(LA9/b;)Ldf/a;

    .line 283
    .line 284
    .line 285
    move-result-object v4

    .line 286
    new-instance v5, LK9/a;

    .line 287
    .line 288
    const/4 v6, 0x3

    .line 289
    invoke-direct {v5, v2, v6}, LK9/a;-><init>(LK9/b;I)V

    .line 290
    .line 291
    .line 292
    new-instance v6, LK9/a;

    .line 293
    .line 294
    const/16 v7, 0xd

    .line 295
    .line 296
    invoke-direct {v6, v2, v7}, LK9/a;-><init>(LK9/b;I)V

    .line 297
    .line 298
    .line 299
    new-instance v7, LL9/a;

    .line 300
    .line 301
    invoke-direct {v7, v3, v4, v5, v6}, LL9/a;-><init>(LDd/c;Ldf/a;LK9/a;LK9/a;)V

    .line 302
    .line 303
    .line 304
    invoke-static {v7}, LA9/a;->a(LA9/b;)Ldf/a;

    .line 305
    .line 306
    .line 307
    move-result-object v15

    .line 308
    new-instance v4, LK9/a;

    .line 309
    .line 310
    const/4 v5, 0x1

    .line 311
    invoke-direct {v4, v2, v5}, LK9/a;-><init>(LK9/b;I)V

    .line 312
    .line 313
    .line 314
    new-instance v5, LK9/a;

    .line 315
    .line 316
    const/16 v6, 0xf

    .line 317
    .line 318
    invoke-direct {v5, v2, v6}, LK9/a;-><init>(LK9/b;I)V

    .line 319
    .line 320
    .line 321
    new-instance v6, LK9/a;

    .line 322
    .line 323
    const/16 v7, 0x9

    .line 324
    .line 325
    invoke-direct {v6, v2, v7}, LK9/a;-><init>(LK9/b;I)V

    .line 326
    .line 327
    .line 328
    new-instance v7, LK9/a;

    .line 329
    .line 330
    const/16 v8, 0xe

    .line 331
    .line 332
    invoke-direct {v7, v2, v8}, LK9/a;-><init>(LK9/b;I)V

    .line 333
    .line 334
    .line 335
    new-instance v8, LD9/f;

    .line 336
    .line 337
    const/4 v10, 0x2

    .line 338
    invoke-direct {v8, v2, v10}, LD9/f;-><init>(LK9/b;I)V

    .line 339
    .line 340
    .line 341
    new-instance v10, LL9/b;

    .line 342
    .line 343
    const/4 v0, 0x2

    .line 344
    invoke-direct {v10, v0, v3}, LL9/b;-><init>(ILDd/c;)V

    .line 345
    .line 346
    .line 347
    new-instance v0, LA9/c;

    .line 348
    .line 349
    invoke-direct {v0, v3, v10}, LA9/c;-><init>(LDd/c;LL9/b;)V

    .line 350
    .line 351
    .line 352
    move-object/from16 v21, v0

    .line 353
    .line 354
    new-instance v0, LL9/b;

    .line 355
    .line 356
    move-object/from16 v16, v4

    .line 357
    .line 358
    const/4 v4, 0x1

    .line 359
    invoke-direct {v0, v4, v3}, LL9/b;-><init>(ILDd/c;)V

    .line 360
    .line 361
    .line 362
    new-instance v4, LK9/a;

    .line 363
    .line 364
    move-object/from16 v22, v0

    .line 365
    .line 366
    const/4 v0, 0x7

    .line 367
    invoke-direct {v4, v2, v0}, LK9/a;-><init>(LK9/b;I)V

    .line 368
    .line 369
    .line 370
    new-instance v0, LJ9/g;

    .line 371
    .line 372
    move-object/from16 v17, v5

    .line 373
    .line 374
    const/4 v5, 0x2

    .line 375
    invoke-direct {v0, v3, v10, v4, v5}, LJ9/g;-><init>(Ljava/lang/Object;Ldf/a;Ldf/a;I)V

    .line 376
    .line 377
    .line 378
    new-instance v4, LA9/c;

    .line 379
    .line 380
    const/4 v5, 0x0

    .line 381
    invoke-direct {v4, v9, v5}, LA9/c;-><init>(Ljava/lang/Object;I)V

    .line 382
    .line 383
    .line 384
    new-instance v5, LK9/a;

    .line 385
    .line 386
    const/4 v9, 0x4

    .line 387
    invoke-direct {v5, v2, v9}, LK9/a;-><init>(LK9/b;I)V

    .line 388
    .line 389
    .line 390
    new-instance v10, LJ9/D;

    .line 391
    .line 392
    move-object/from16 v23, v0

    .line 393
    .line 394
    move-object/from16 v24, v4

    .line 395
    .line 396
    move-object/from16 v25, v5

    .line 397
    .line 398
    move-object/from16 v18, v6

    .line 399
    .line 400
    move-object/from16 v19, v7

    .line 401
    .line 402
    move-object/from16 v20, v8

    .line 403
    .line 404
    invoke-direct/range {v10 .. v25}, LJ9/D;-><init>(LK9/a;LK9/a;LK9/a;LD9/f;Ldf/a;LK9/a;LK9/a;LK9/a;LK9/a;LD9/f;LA9/c;LL9/b;LJ9/g;LA9/c;LK9/a;)V

    .line 405
    .line 406
    .line 407
    move-object/from16 v0, v17

    .line 408
    .line 409
    move-object/from16 v4, v18

    .line 410
    .line 411
    move-object/from16 v5, v19

    .line 412
    .line 413
    move-object/from16 v6, v20

    .line 414
    .line 415
    move-object/from16 v21, v25

    .line 416
    .line 417
    invoke-static {v10}, LA9/a;->a(LA9/b;)Ldf/a;

    .line 418
    .line 419
    .line 420
    move-result-object v7

    .line 421
    new-instance v8, LK9/a;

    .line 422
    .line 423
    const/16 v9, 0xc

    .line 424
    .line 425
    invoke-direct {v8, v2, v9}, LK9/a;-><init>(LK9/b;I)V

    .line 426
    .line 427
    .line 428
    new-instance v15, LL9/b;

    .line 429
    .line 430
    const/4 v9, 0x0

    .line 431
    invoke-direct {v15, v9, v3}, LL9/b;-><init>(ILDd/c;)V

    .line 432
    .line 433
    .line 434
    new-instance v3, LA9/c;

    .line 435
    .line 436
    const/4 v9, 0x0

    .line 437
    invoke-direct {v3, v1, v9}, LA9/c;-><init>(Ljava/lang/Object;I)V

    .line 438
    .line 439
    .line 440
    new-instance v1, LK9/a;

    .line 441
    .line 442
    const/4 v9, 0x0

    .line 443
    invoke-direct {v1, v2, v9}, LK9/a;-><init>(LK9/b;I)V

    .line 444
    .line 445
    .line 446
    new-instance v9, LK9/a;

    .line 447
    .line 448
    const/4 v10, 0x6

    .line 449
    invoke-direct {v9, v2, v10}, LK9/a;-><init>(LK9/b;I)V

    .line 450
    .line 451
    .line 452
    move-object/from16 v19, v14

    .line 453
    .line 454
    new-instance v14, LL9/h;

    .line 455
    .line 456
    move-object/from16 v17, v1

    .line 457
    .line 458
    move-object/from16 v16, v3

    .line 459
    .line 460
    move-object/from16 v20, v9

    .line 461
    .line 462
    move-object/from16 v18, v22

    .line 463
    .line 464
    invoke-direct/range {v14 .. v21}, LL9/h;-><init>(LL9/b;LA9/c;LK9/a;LL9/b;LD9/f;LK9/a;LK9/a;)V

    .line 465
    .line 466
    .line 467
    move-object v3, v14

    .line 468
    move-object/from16 v14, v19

    .line 469
    .line 470
    move-object/from16 v1, v20

    .line 471
    .line 472
    invoke-static {v3}, LA9/a;->a(LA9/b;)Ldf/a;

    .line 473
    .line 474
    .line 475
    move-result-object v20

    .line 476
    new-instance v21, LJ9/l;

    .line 477
    .line 478
    move-object/from16 v16, v0

    .line 479
    .line 480
    move-object/from16 v17, v5

    .line 481
    .line 482
    move-object/from16 v19, v6

    .line 483
    .line 484
    move-object/from16 v18, v13

    .line 485
    .line 486
    move-object v15, v14

    .line 487
    move-object/from16 v13, v21

    .line 488
    .line 489
    move-object/from16 v21, v23

    .line 490
    .line 491
    move-object v14, v4

    .line 492
    invoke-direct/range {v13 .. v21}, LJ9/l;-><init>(LK9/a;LD9/f;LK9/a;LK9/a;LK9/a;LD9/f;Ldf/a;LJ9/g;)V

    .line 493
    .line 494
    .line 495
    move-object/from16 v21, v13

    .line 496
    .line 497
    new-instance v0, LK9/a;

    .line 498
    .line 499
    const/16 v3, 0xa

    .line 500
    .line 501
    invoke-direct {v0, v2, v3}, LK9/a;-><init>(LK9/b;I)V

    .line 502
    .line 503
    .line 504
    new-instance v16, Lz9/F;

    .line 505
    .line 506
    move-object/from16 v17, v7

    .line 507
    .line 508
    move-object/from16 v18, v8

    .line 509
    .line 510
    move-object/from16 v20, v22

    .line 511
    .line 512
    move-object/from16 v19, v23

    .line 513
    .line 514
    move-object/from16 v23, v0

    .line 515
    .line 516
    move-object/from16 v22, v1

    .line 517
    .line 518
    invoke-direct/range {v16 .. v23}, Lz9/F;-><init>(Ldf/a;LK9/a;LJ9/g;LL9/b;LJ9/l;LK9/a;LK9/a;)V

    .line 519
    .line 520
    .line 521
    invoke-static/range {v16 .. v16}, LA9/a;->a(LA9/b;)Ldf/a;

    .line 522
    .line 523
    .line 524
    move-result-object v0

    .line 525
    invoke-interface {v0}, Ldf/a;->get()Ljava/lang/Object;

    .line 526
    .line 527
    .line 528
    move-result-object v0

    .line 529
    check-cast v0, Lz9/B;

    .line 530
    .line 531
    return-object v0
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 5
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "LL8/b;",
            ">;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x2

    .line 2
    const-class v1, Lz9/B;

    .line 3
    .line 4
    invoke-static {v1}, LL8/b;->b(Ljava/lang/Class;)LL8/a;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    const-string v2, "fire-fiam"

    .line 9
    .line 10
    iput-object v2, v1, LL8/a;->a:Ljava/lang/Object;

    .line 11
    .line 12
    const-class v3, Landroid/content/Context;

    .line 13
    .line 14
    invoke-static {v3}, LL8/l;->d(Ljava/lang/Class;)LL8/l;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    invoke-virtual {v1, v3}, LL8/a;->c(LL8/l;)V

    .line 19
    .line 20
    .line 21
    const-class v3, LP9/d;

    .line 22
    .line 23
    invoke-static {v3}, LL8/l;->d(Ljava/lang/Class;)LL8/l;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-virtual {v1, v3}, LL8/a;->c(LL8/l;)V

    .line 28
    .line 29
    .line 30
    const-class v3, Ls8/g;

    .line 31
    .line 32
    invoke-static {v3}, LL8/l;->d(Ljava/lang/Class;)LL8/l;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    invoke-virtual {v1, v3}, LL8/a;->c(LL8/l;)V

    .line 37
    .line 38
    .line 39
    const-class v3, Lu8/a;

    .line 40
    .line 41
    invoke-static {v3}, LL8/l;->d(Ljava/lang/Class;)LL8/l;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-virtual {v1, v3}, LL8/a;->c(LL8/l;)V

    .line 46
    .line 47
    .line 48
    const-class v3, Lw8/d;

    .line 49
    .line 50
    invoke-static {v3}, LL8/l;->a(Ljava/lang/Class;)LL8/l;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    invoke-virtual {v1, v3}, LL8/a;->c(LL8/l;)V

    .line 55
    .line 56
    .line 57
    iget-object v3, p0, Lcom/google/firebase/inappmessaging/FirebaseInAppMessagingRegistrar;->legacyTransportFactory:LL8/t;

    .line 58
    .line 59
    invoke-static {v3}, LL8/l;->c(LL8/t;)LL8/l;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    invoke-virtual {v1, v3}, LL8/a;->c(LL8/l;)V

    .line 64
    .line 65
    .line 66
    const-class v3, Ll9/d;

    .line 67
    .line 68
    invoke-static {v3}, LL8/l;->d(Ljava/lang/Class;)LL8/l;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    invoke-virtual {v1, v3}, LL8/a;->c(LL8/l;)V

    .line 73
    .line 74
    .line 75
    iget-object v3, p0, Lcom/google/firebase/inappmessaging/FirebaseInAppMessagingRegistrar;->backgroundExecutor:LL8/t;

    .line 76
    .line 77
    invoke-static {v3}, LL8/l;->c(LL8/t;)LL8/l;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    invoke-virtual {v1, v3}, LL8/a;->c(LL8/l;)V

    .line 82
    .line 83
    .line 84
    iget-object v3, p0, Lcom/google/firebase/inappmessaging/FirebaseInAppMessagingRegistrar;->blockingExecutor:LL8/t;

    .line 85
    .line 86
    invoke-static {v3}, LL8/l;->c(LL8/t;)LL8/l;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    invoke-virtual {v1, v3}, LL8/a;->c(LL8/l;)V

    .line 91
    .line 92
    .line 93
    iget-object v3, p0, Lcom/google/firebase/inappmessaging/FirebaseInAppMessagingRegistrar;->lightWeightExecutor:LL8/t;

    .line 94
    .line 95
    invoke-static {v3}, LL8/l;->c(LL8/t;)LL8/l;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    invoke-virtual {v1, v3}, LL8/a;->c(LL8/l;)V

    .line 100
    .line 101
    .line 102
    new-instance v3, Lo1/c;

    .line 103
    .line 104
    const/16 v4, 0x1b

    .line 105
    .line 106
    invoke-direct {v3, p0, v4}, Lo1/c;-><init>(Ljava/lang/Object;I)V

    .line 107
    .line 108
    .line 109
    iput-object v3, v1, LL8/a;->g:Ljava/lang/Object;

    .line 110
    .line 111
    invoke-virtual {v1, v0}, LL8/a;->f(I)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v1}, LL8/a;->d()LL8/b;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    const-string v3, "21.0.1"

    .line 119
    .line 120
    invoke-static {v2, v3}, Lic/d;->m(Ljava/lang/String;Ljava/lang/String;)LL8/b;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    new-array v0, v0, [LL8/b;

    .line 125
    .line 126
    const/4 v3, 0x0

    .line 127
    aput-object v1, v0, v3

    .line 128
    .line 129
    const/4 v1, 0x1

    .line 130
    aput-object v2, v0, v1

    .line 131
    .line 132
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    return-object v0
.end method
